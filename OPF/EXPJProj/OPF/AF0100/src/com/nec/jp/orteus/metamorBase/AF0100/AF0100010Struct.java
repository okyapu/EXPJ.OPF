/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0100/src/com/nec/jp/orteus/metamorBase/AF0100/AF0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0100;

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
//}}user_implement_code_header

public class AF0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_JOB_ODR */
	public Integer m_w_JOB_ODR = null;
	/** �� 2 �ϐ��F m_w_INFERIOR */
	public Integer m_w_INFERIOR = null;
	/** �� 3 �ϐ��F m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** �� 4 �ϐ��F m_c_RCV_ISSUE_QTY */
	public String m_c_RCV_ISSUE_QTY = null;
	/** �� 5 �ϐ��F m_h_SYS_LOT_CTRL_FLG */
	public String m_h_SYS_LOT_CTRL_FLG = null;
	/** �� 6 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 7 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 8 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 9 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 10 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 11 �ϐ��F m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** �� 12 �ϐ��F m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** �� 13 �ϐ��F m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** �� 14 �ϐ��F m_PRODUCT_TYP */
	public Integer m_PRODUCT_TYP = null;
	/** �� 15 �ϐ��F m_SPL_ITEM_TYP */
	public Integer m_SPL_ITEM_TYP = null;
	/** �� 16 �ϐ��F m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** �� 17 �ϐ��F m_LOT_NUMBERING_TYP */
	public String m_LOT_NUMBERING_TYP = null;
	/** �� 18 �ϐ��F m_w_MANHOUR_TYP */
	public String m_w_MANHOUR_TYP = null;
	/** �� 19 �ϐ��F m_w_TOTAL_STOCK_ON_HAND_QTY */
	public String m_w_TOTAL_STOCK_ON_HAND_QTY = null;
	/** �� 20 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 21 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 22 �ϐ��F m_w_WH_STOCK_ON_HAND_QTY */
	public String m_w_WH_STOCK_ON_HAND_QTY = null;
	/** �� 23 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 24 �ϐ��F m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** �� 25 �ϐ��F m_w_TOTAL_DEFECT_QTY */
	public String m_w_TOTAL_DEFECT_QTY = null;
	/** �� 26 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 27 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 28 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 29 �ϐ��F m_ISSUE_CTRL_CD */
	public String m_ISSUE_CTRL_CD = null;
	/** �� 30 �ϐ��F m_ISSUE_TYP */
	public Integer m_ISSUE_TYP = null;
	/** �� 31 �ϐ��F m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** �� 32 �ϐ��F m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** �� 33 �ϐ��F m_RCV_ISSUE_GNR_TYP */
	public Integer m_RCV_ISSUE_GNR_TYP = null;
	/** �� 34 �ϐ��F m_STOCK_UPD_TYP */
	public Integer m_STOCK_UPD_TYP = null;
	/** �� 35 �ϐ��F m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** �� 36 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 37 �ϐ��F m_CONS_TYP */
	public Integer m_CONS_TYP = null;
	/** �� 38 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 39 �ϐ��F m_ONEROUS_FLG */
	public Integer m_ONEROUS_FLG = null;
	/** �� 40 �ϐ��F m_SBCNT_PUCH_TYP */
	public Integer m_SBCNT_PUCH_TYP = null;
	/** �� 41 �ϐ��F m_NON_PLANNED_CAUSE_CD */
	public String m_NON_PLANNED_CAUSE_CD = null;
	/** �� 42 �ϐ��F m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** �� 43 �ϐ��F m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** �� 44 �ϐ��F m_LOT_STOCK_ON_HAND_QTY */
	public String m_LOT_STOCK_ON_HAND_QTY = null;
	/** �� 45 �ϐ��F m_LOT_DEFECT_QTY */
	public String m_LOT_DEFECT_QTY = null;
	/** �� 46 �ϐ��F m_ALLOCABLE_QTY */
	public String m_ALLOCABLE_QTY = null;
	/** �� 47 �ϐ��F m_PRD_CMPLT_DATE */
	public String m_PRD_CMPLT_DATE = null;
	/** �� 48 �ϐ��F m_BEST_BEFORE_DATE */
	public String m_BEST_BEFORE_DATE = null;
	/** �� 49 �ϐ��F m_BEST_BEFORE_DATE_CHECK_FLG */
	public String m_BEST_BEFORE_DATE_CHECK_FLG = null;
	/** �� 50 �ϐ��F m_BBD_c_FLG */
	public String m_BBD_c_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_JOB_ODR */
	public List l_w_JOB_ODR = null;

	/** �� 2 List�ϐ��F l_w_INFERIOR */
	public List l_w_INFERIOR = null;

	/** �� 3 List�ϐ��F l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** �� 4 List�ϐ��F l_c_RCV_ISSUE_QTY */
	public List l_c_RCV_ISSUE_QTY = null;

	/** �� 5 List�ϐ��F l_h_SYS_LOT_CTRL_FLG */
	public List l_h_SYS_LOT_CTRL_FLG = null;

	/** �� 6 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 7 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 8 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 9 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 10 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 11 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 12 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 13 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 14 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 15 List�ϐ��F l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** �� 16 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 17 List�ϐ��F l_LOT_NUMBERING_TYP */
	public List l_LOT_NUMBERING_TYP = null;

	/** �� 18 List�ϐ��F l_w_MANHOUR_TYP */
	public List l_w_MANHOUR_TYP = null;

	/** �� 19 List�ϐ��F l_w_TOTAL_STOCK_ON_HAND_QTY */
	public List l_w_TOTAL_STOCK_ON_HAND_QTY = null;

	/** �� 20 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 21 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 22 List�ϐ��F l_w_WH_STOCK_ON_HAND_QTY */
	public List l_w_WH_STOCK_ON_HAND_QTY = null;

	/** �� 23 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 24 List�ϐ��F l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** �� 25 List�ϐ��F l_w_TOTAL_DEFECT_QTY */
	public List l_w_TOTAL_DEFECT_QTY = null;

	/** �� 26 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 27 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 28 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 29 List�ϐ��F l_ISSUE_CTRL_CD */
	public List l_ISSUE_CTRL_CD = null;

	/** �� 30 List�ϐ��F l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** �� 31 List�ϐ��F l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** �� 32 List�ϐ��F l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** �� 33 List�ϐ��F l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** �� 34 List�ϐ��F l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** �� 35 List�ϐ��F l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** �� 36 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 37 List�ϐ��F l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** �� 38 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 39 List�ϐ��F l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** �� 40 List�ϐ��F l_SBCNT_PUCH_TYP */
	public List l_SBCNT_PUCH_TYP = null;

	/** �� 41 List�ϐ��F l_NON_PLANNED_CAUSE_CD */
	public List l_NON_PLANNED_CAUSE_CD = null;

	/** �� 42 List�ϐ��F l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** �� 43 List�ϐ��F l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** �� 44 List�ϐ��F l_LOT_STOCK_ON_HAND_QTY */
	public List l_LOT_STOCK_ON_HAND_QTY = null;

	/** �� 45 List�ϐ��F l_LOT_DEFECT_QTY */
	public List l_LOT_DEFECT_QTY = null;

	/** �� 46 List�ϐ��F l_ALLOCABLE_QTY */
	public List l_ALLOCABLE_QTY = null;

	/** �� 47 List�ϐ��F l_PRD_CMPLT_DATE */
	public List l_PRD_CMPLT_DATE = null;

	/** �� 48 List�ϐ��F l_BEST_BEFORE_DATE */
	public List l_BEST_BEFORE_DATE = null;

	/** �� 49 List�ϐ��F l_BEST_BEFORE_DATE_CHECK_FLG */
	public List l_BEST_BEFORE_DATE_CHECK_FLG = null;

	/** �� 50 List�ϐ��F l_BBD_c_FLG */
	public List l_BBD_c_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public Integer getw_JOB_ODR() { return m_w_JOB_ODR; }
	public Integer getw_INFERIOR() { return m_w_INFERIOR; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String getc_RCV_ISSUE_QTY() { return m_c_RCV_ISSUE_QTY; }
	public String geth_SYS_LOT_CTRL_FLG() { return m_h_SYS_LOT_CTRL_FLG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public Integer getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public Integer getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getw_MANHOUR_TYP() { return m_w_MANHOUR_TYP; }
	public String getw_TOTAL_STOCK_ON_HAND_QTY() { return m_w_TOTAL_STOCK_ON_HAND_QTY; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getw_WH_STOCK_ON_HAND_QTY() { return m_w_WH_STOCK_ON_HAND_QTY; }
	public String getWH_CD() { return m_WH_CD; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getw_TOTAL_DEFECT_QTY() { return m_w_TOTAL_DEFECT_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getISSUE_CTRL_CD() { return m_ISSUE_CTRL_CD; }
	public Integer getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public Integer getCONS_TYP() { return m_CONS_TYP; }
	public String getLOT_NO() { return m_LOT_NO; }
	public Integer getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public Integer getSBCNT_PUCH_TYP() { return m_SBCNT_PUCH_TYP; }
	public String getNON_PLANNED_CAUSE_CD() { return m_NON_PLANNED_CAUSE_CD; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getLOT_STOCK_ON_HAND_QTY() { return m_LOT_STOCK_ON_HAND_QTY; }
	public String getLOT_DEFECT_QTY() { return m_LOT_DEFECT_QTY; }
	public String getALLOCABLE_QTY() { return m_ALLOCABLE_QTY; }
	public String getPRD_CMPLT_DATE() { return m_PRD_CMPLT_DATE; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getBEST_BEFORE_DATE_CHECK_FLG() { return m_BEST_BEFORE_DATE_CHECK_FLG; }
	public String getBBD_c_FLG() { return m_BBD_c_FLG; }

	public List getList_w_JOB_ODR() { return l_w_JOB_ODR; }
	public List getList_w_INFERIOR() { return l_w_INFERIOR; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_c_RCV_ISSUE_QTY() { return l_c_RCV_ISSUE_QTY; }
	public List getList_h_SYS_LOT_CTRL_FLG() { return l_h_SYS_LOT_CTRL_FLG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_LOT_NUMBERING_TYP() { return l_LOT_NUMBERING_TYP; }
	public List getList_w_MANHOUR_TYP() { return l_w_MANHOUR_TYP; }
	public List getList_w_TOTAL_STOCK_ON_HAND_QTY() { return l_w_TOTAL_STOCK_ON_HAND_QTY; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_w_WH_STOCK_ON_HAND_QTY() { return l_w_WH_STOCK_ON_HAND_QTY; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_w_TOTAL_DEFECT_QTY() { return l_w_TOTAL_DEFECT_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ISSUE_CTRL_CD() { return l_ISSUE_CTRL_CD; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_SBCNT_PUCH_TYP() { return l_SBCNT_PUCH_TYP; }
	public List getList_NON_PLANNED_CAUSE_CD() { return l_NON_PLANNED_CAUSE_CD; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_LOT_STOCK_ON_HAND_QTY() { return l_LOT_STOCK_ON_HAND_QTY; }
	public List getList_LOT_DEFECT_QTY() { return l_LOT_DEFECT_QTY; }
	public List getList_ALLOCABLE_QTY() { return l_ALLOCABLE_QTY; }
	public List getList_PRD_CMPLT_DATE() { return l_PRD_CMPLT_DATE; }
	public List getList_BEST_BEFORE_DATE() { return l_BEST_BEFORE_DATE; }
	public List getList_BEST_BEFORE_DATE_CHECK_FLG() { return l_BEST_BEFORE_DATE_CHECK_FLG; }
	public List getList_BBD_c_FLG() { return l_BBD_c_FLG; }

	public void setw_JOB_ODR(Integer val) { m_w_JOB_ODR = val; }
	public void setw_INFERIOR(Integer val) { m_w_INFERIOR = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void setc_RCV_ISSUE_QTY(String val) { m_c_RCV_ISSUE_QTY = val; }
	public void seth_SYS_LOT_CTRL_FLG(String val) { m_h_SYS_LOT_CTRL_FLG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setPRODUCT_TYP(Integer val) { m_PRODUCT_TYP = val; }
	public void setSPL_ITEM_TYP(Integer val) { m_SPL_ITEM_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setLOT_NUMBERING_TYP(String val) { m_LOT_NUMBERING_TYP = val; }
	public void setw_MANHOUR_TYP(String val) { m_w_MANHOUR_TYP = val; }
	public void setw_TOTAL_STOCK_ON_HAND_QTY(String val) { m_w_TOTAL_STOCK_ON_HAND_QTY = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setw_WH_STOCK_ON_HAND_QTY(String val) { m_w_WH_STOCK_ON_HAND_QTY = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setw_TOTAL_DEFECT_QTY(String val) { m_w_TOTAL_DEFECT_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setISSUE_CTRL_CD(String val) { m_ISSUE_CTRL_CD = val; }
	public void setISSUE_TYP(Integer val) { m_ISSUE_TYP = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCONS_TYP(Integer val) { m_CONS_TYP = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setONEROUS_FLG(Integer val) { m_ONEROUS_FLG = val; }
	public void setSBCNT_PUCH_TYP(Integer val) { m_SBCNT_PUCH_TYP = val; }
	public void setNON_PLANNED_CAUSE_CD(String val) { m_NON_PLANNED_CAUSE_CD = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setLOT_STOCK_ON_HAND_QTY(String val) { m_LOT_STOCK_ON_HAND_QTY = val; }
	public void setLOT_DEFECT_QTY(String val) { m_LOT_DEFECT_QTY = val; }
	public void setALLOCABLE_QTY(String val) { m_ALLOCABLE_QTY = val; }
	public void setPRD_CMPLT_DATE(String val) { m_PRD_CMPLT_DATE = val; }
	public void setBEST_BEFORE_DATE(String val) { m_BEST_BEFORE_DATE = val; }
	public void setBEST_BEFORE_DATE_CHECK_FLG(String val) { m_BEST_BEFORE_DATE_CHECK_FLG = val; }
	public void setBBD_c_FLG(String val) { m_BBD_c_FLG = val; }

	public void setw_JOB_ODR(String val) { m_w_JOB_ODR = getInteger(val); }
	public void setw_INFERIOR(String val) { m_w_INFERIOR = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = getInteger(val); }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = getInteger(val); }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = getInteger(val); }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = getInteger(val); }
	public void setCONS_TYP(String val) { m_CONS_TYP = getInteger(val); }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = getInteger(val); }
	public void setSBCNT_PUCH_TYP(String val) { m_SBCNT_PUCH_TYP = getInteger(val); }

	public void setList_w_JOB_ODR(List list) { l_w_JOB_ODR = list; }
	public void setList_w_INFERIOR(List list) { l_w_INFERIOR = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_c_RCV_ISSUE_QTY(List list) { l_c_RCV_ISSUE_QTY = list; }
	public void setList_h_SYS_LOT_CTRL_FLG(List list) { l_h_SYS_LOT_CTRL_FLG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_LOT_NUMBERING_TYP(List list) { l_LOT_NUMBERING_TYP = list; }
	public void setList_w_MANHOUR_TYP(List list) { l_w_MANHOUR_TYP = list; }
	public void setList_w_TOTAL_STOCK_ON_HAND_QTY(List list) { l_w_TOTAL_STOCK_ON_HAND_QTY = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_w_WH_STOCK_ON_HAND_QTY(List list) { l_w_WH_STOCK_ON_HAND_QTY = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_w_TOTAL_DEFECT_QTY(List list) { l_w_TOTAL_DEFECT_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ISSUE_CTRL_CD(List list) { l_ISSUE_CTRL_CD = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_SBCNT_PUCH_TYP(List list) { l_SBCNT_PUCH_TYP = list; }
	public void setList_NON_PLANNED_CAUSE_CD(List list) { l_NON_PLANNED_CAUSE_CD = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_LOT_STOCK_ON_HAND_QTY(List list) { l_LOT_STOCK_ON_HAND_QTY = list; }
	public void setList_LOT_DEFECT_QTY(List list) { l_LOT_DEFECT_QTY = list; }
	public void setList_ALLOCABLE_QTY(List list) { l_ALLOCABLE_QTY = list; }
	public void setList_PRD_CMPLT_DATE(List list) { l_PRD_CMPLT_DATE = list; }
	public void setList_BEST_BEFORE_DATE(List list) { l_BEST_BEFORE_DATE = list; }
	public void setList_BEST_BEFORE_DATE_CHECK_FLG(List list) { l_BEST_BEFORE_DATE_CHECK_FLG = list; }
	public void setList_BBD_c_FLG(List list) { l_BBD_c_FLG = list; }

	public int setL2L_w_JOB_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR == null) {
			l_w_JOB_ODR = new ArrayList();
		} else {
			l_w_JOB_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR.add(((AF0100010Struct) list.get(i)).getw_JOB_ODR());
		}
		return size;
	}
	public int setL2L_w_INFERIOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INFERIOR == null) {
			l_w_INFERIOR = new ArrayList();
		} else {
			l_w_INFERIOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INFERIOR.add(((AF0100010Struct) list.get(i)).getw_INFERIOR());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD == null) {
			l_c_JOB_ODR_CD = new ArrayList();
		} else {
			l_c_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD.add(((AF0100010Struct) list.get(i)).getc_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_RCV_ISSUE_QTY == null) {
			l_c_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_c_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_RCV_ISSUE_QTY.add(((AF0100010Struct) list.get(i)).getc_RCV_ISSUE_QTY());
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
			l_h_SYS_LOT_CTRL_FLG.add(((AF0100010Struct) list.get(i)).geth_SYS_LOT_CTRL_FLG());
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
			l_ITEM_CD.add(((AF0100010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AF0100010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AF0100010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0100010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0100010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_MRP_ODR_TYP.add(((AF0100010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AF0100010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_UNIT_QTY_TYP.add(((AF0100010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_PRODUCT_TYP.add(((AF0100010Struct) list.get(i)).getPRODUCT_TYP());
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
			l_SPL_ITEM_TYP.add(((AF0100010Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_LOT_CTRL_FLG.add(((AF0100010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_LOT_NUMBERING_TYP.add(((AF0100010Struct) list.get(i)).getLOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_w_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MANHOUR_TYP == null) {
			l_w_MANHOUR_TYP = new ArrayList();
		} else {
			l_w_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MANHOUR_TYP.add(((AF0100010Struct) list.get(i)).getw_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_ON_HAND_QTY == null) {
			l_w_TOTAL_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_ON_HAND_QTY.add(((AF0100010Struct) list.get(i)).getw_TOTAL_STOCK_ON_HAND_QTY());
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
			l_JOB_ODR_CD.add(((AF0100010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_PLANT_CD.add(((AF0100010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_WH_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_STOCK_ON_HAND_QTY == null) {
			l_w_WH_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_WH_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_STOCK_ON_HAND_QTY.add(((AF0100010Struct) list.get(i)).getw_WH_STOCK_ON_HAND_QTY());
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
			l_WH_CD.add(((AF0100010Struct) list.get(i)).getWH_CD());
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
			l_DEFECT_QTY.add(((AF0100010Struct) list.get(i)).getDEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_DEFECT_QTY == null) {
			l_w_TOTAL_DEFECT_QTY = new ArrayList();
		} else {
			l_w_TOTAL_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_DEFECT_QTY.add(((AF0100010Struct) list.get(i)).getw_TOTAL_DEFECT_QTY());
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
			l_BUSINESS_OPR_DATE.add(((AF0100010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_WH_NAME.add(((AF0100010Struct) list.get(i)).getWH_NAME());
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
			l_VEND_CD.add(((AF0100010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CTRL_CD == null) {
			l_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CTRL_CD.add(((AF0100010Struct) list.get(i)).getISSUE_CTRL_CD());
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
			l_ISSUE_TYP.add(((AF0100010Struct) list.get(i)).getISSUE_TYP());
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
			l_RCV_ISSUE_QTY.add(((AF0100010Struct) list.get(i)).getRCV_ISSUE_QTY());
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
			l_RCV_ISSUE_DATE.add(((AF0100010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_RCV_ISSUE_GNR_TYP.add(((AF0100010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
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
			l_STOCK_UPD_TYP.add(((AF0100010Struct) list.get(i)).getSTOCK_UPD_TYP());
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
			l_VEND_LOT_NO.add(((AF0100010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_COMPANY_CD.add(((AF0100010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CONS_TYP.add(((AF0100010Struct) list.get(i)).getCONS_TYP());
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
			l_LOT_NO.add(((AF0100010Struct) list.get(i)).getLOT_NO());
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
			l_ONEROUS_FLG.add(((AF0100010Struct) list.get(i)).getONEROUS_FLG());
		}
		return size;
	}
	public int setL2L_SBCNT_PUCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_PUCH_TYP == null) {
			l_SBCNT_PUCH_TYP = new ArrayList();
		} else {
			l_SBCNT_PUCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_PUCH_TYP.add(((AF0100010Struct) list.get(i)).getSBCNT_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_NON_PLANNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_PLANNED_CAUSE_CD == null) {
			l_NON_PLANNED_CAUSE_CD = new ArrayList();
		} else {
			l_NON_PLANNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_PLANNED_CAUSE_CD.add(((AF0100010Struct) list.get(i)).getNON_PLANNED_CAUSE_CD());
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
			l_PAST_RESULT_ENTRY_TYP.add(((AF0100010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
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
			l_PROC_EXEC_DATE.add(((AF0100010Struct) list.get(i)).getPROC_EXEC_DATE());
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
			l_LOT_STOCK_ON_HAND_QTY.add(((AF0100010Struct) list.get(i)).getLOT_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_LOT_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_DEFECT_QTY == null) {
			l_LOT_DEFECT_QTY = new ArrayList();
		} else {
			l_LOT_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_DEFECT_QTY.add(((AF0100010Struct) list.get(i)).getLOT_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_ALLOCABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALLOCABLE_QTY == null) {
			l_ALLOCABLE_QTY = new ArrayList();
		} else {
			l_ALLOCABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALLOCABLE_QTY.add(((AF0100010Struct) list.get(i)).getALLOCABLE_QTY());
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
			l_PRD_CMPLT_DATE.add(((AF0100010Struct) list.get(i)).getPRD_CMPLT_DATE());
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
			l_BEST_BEFORE_DATE.add(((AF0100010Struct) list.get(i)).getBEST_BEFORE_DATE());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DATE_CHECK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DATE_CHECK_FLG == null) {
			l_BEST_BEFORE_DATE_CHECK_FLG = new ArrayList();
		} else {
			l_BEST_BEFORE_DATE_CHECK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DATE_CHECK_FLG.add(((AF0100010Struct) list.get(i)).getBEST_BEFORE_DATE_CHECK_FLG());
		}
		return size;
	}
	public int setL2L_BBD_c_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BBD_c_FLG == null) {
			l_BBD_c_FLG = new ArrayList();
		} else {
			l_BBD_c_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BBD_c_FLG.add(((AF0100010Struct) list.get(i)).getBBD_c_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_JOB_ODR = null;
		m_w_INFERIOR = null;
		m_c_JOB_ODR_CD = null;
		m_c_RCV_ISSUE_QTY = null;
		m_h_SYS_LOT_CTRL_FLG = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_PRODUCT_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_LOT_NUMBERING_TYP = null;
		m_w_MANHOUR_TYP = null;
		m_w_TOTAL_STOCK_ON_HAND_QTY = null;
		m_JOB_ODR_CD = null;
		m_PLANT_CD = null;
		m_w_WH_STOCK_ON_HAND_QTY = null;
		m_WH_CD = null;
		m_DEFECT_QTY = null;
		m_w_TOTAL_DEFECT_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_WH_NAME = null;
		m_VEND_CD = null;
		m_ISSUE_CTRL_CD = null;
		m_ISSUE_TYP = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_STOCK_UPD_TYP = null;
		m_VEND_LOT_NO = null;
		m_COMPANY_CD = null;
		m_CONS_TYP = null;
		m_LOT_NO = null;
		m_ONEROUS_FLG = null;
		m_SBCNT_PUCH_TYP = null;
		m_NON_PLANNED_CAUSE_CD = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_LOT_STOCK_ON_HAND_QTY = null;
		m_LOT_DEFECT_QTY = null;
		m_ALLOCABLE_QTY = null;
		m_PRD_CMPLT_DATE = null;
		m_BEST_BEFORE_DATE = null;
		m_BEST_BEFORE_DATE_CHECK_FLG = null;
		m_BBD_c_FLG = null;

		l_w_JOB_ODR = null;
		l_w_INFERIOR = null;
		l_c_JOB_ODR_CD = null;
		l_c_RCV_ISSUE_QTY = null;
		l_h_SYS_LOT_CTRL_FLG = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_PRODUCT_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_LOT_NUMBERING_TYP = null;
		l_w_MANHOUR_TYP = null;
		l_w_TOTAL_STOCK_ON_HAND_QTY = null;
		l_JOB_ODR_CD = null;
		l_PLANT_CD = null;
		l_w_WH_STOCK_ON_HAND_QTY = null;
		l_WH_CD = null;
		l_DEFECT_QTY = null;
		l_w_TOTAL_DEFECT_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_WH_NAME = null;
		l_VEND_CD = null;
		l_ISSUE_CTRL_CD = null;
		l_ISSUE_TYP = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_STOCK_UPD_TYP = null;
		l_VEND_LOT_NO = null;
		l_COMPANY_CD = null;
		l_CONS_TYP = null;
		l_LOT_NO = null;
		l_ONEROUS_FLG = null;
		l_SBCNT_PUCH_TYP = null;
		l_NON_PLANNED_CAUSE_CD = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_LOT_STOCK_ON_HAND_QTY = null;
		l_LOT_DEFECT_QTY = null;
		l_ALLOCABLE_QTY = null;
		l_PRD_CMPLT_DATE = null;
		l_BEST_BEFORE_DATE = null;
		l_BEST_BEFORE_DATE_CHECK_FLG = null;
		l_BBD_c_FLG = null;

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
	 * medAF0100010�N���X�̕W���R���X�g���N�^
	 */
	public AF0100010Struct()
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
	public void setStruct(AF0100010Struct struct)
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
	public void setStructM(AF0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_JOB_ODR(struct.getw_JOB_ODR());
			this.setw_INFERIOR(struct.getw_INFERIOR());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.setc_RCV_ISSUE_QTY(struct.getc_RCV_ISSUE_QTY());
			this.seth_SYS_LOT_CTRL_FLG(struct.geth_SYS_LOT_CTRL_FLG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
			this.setw_MANHOUR_TYP(struct.getw_MANHOUR_TYP());
			this.setw_TOTAL_STOCK_ON_HAND_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setw_WH_STOCK_ON_HAND_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
			this.setWH_CD(struct.getWH_CD());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setw_TOTAL_DEFECT_QTY(struct.getw_TOTAL_DEFECT_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setWH_NAME(struct.getWH_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setISSUE_CTRL_CD(struct.getISSUE_CTRL_CD());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setLOT_NO(struct.getLOT_NO());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setSBCNT_PUCH_TYP(struct.getSBCNT_PUCH_TYP());
			this.setNON_PLANNED_CAUSE_CD(struct.getNON_PLANNED_CAUSE_CD());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setLOT_STOCK_ON_HAND_QTY(struct.getLOT_STOCK_ON_HAND_QTY());
			this.setLOT_DEFECT_QTY(struct.getLOT_DEFECT_QTY());
			this.setALLOCABLE_QTY(struct.getALLOCABLE_QTY());
			this.setPRD_CMPLT_DATE(struct.getPRD_CMPLT_DATE());
			this.setBEST_BEFORE_DATE(struct.getBEST_BEFORE_DATE());
			this.setBEST_BEFORE_DATE_CHECK_FLG(struct.getBEST_BEFORE_DATE_CHECK_FLG());
			this.setBBD_c_FLG(struct.getBBD_c_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AF0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_JOB_ODR(struct.getList_w_JOB_ODR());
			this.setList_w_INFERIOR(struct.getList_w_INFERIOR());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_c_RCV_ISSUE_QTY(struct.getList_c_RCV_ISSUE_QTY());
			this.setList_h_SYS_LOT_CTRL_FLG(struct.getList_h_SYS_LOT_CTRL_FLG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_LOT_NUMBERING_TYP(struct.getList_LOT_NUMBERING_TYP());
			this.setList_w_MANHOUR_TYP(struct.getList_w_MANHOUR_TYP());
			this.setList_w_TOTAL_STOCK_ON_HAND_QTY(struct.getList_w_TOTAL_STOCK_ON_HAND_QTY());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_w_WH_STOCK_ON_HAND_QTY(struct.getList_w_WH_STOCK_ON_HAND_QTY());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_w_TOTAL_DEFECT_QTY(struct.getList_w_TOTAL_DEFECT_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ISSUE_CTRL_CD(struct.getList_ISSUE_CTRL_CD());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_SBCNT_PUCH_TYP(struct.getList_SBCNT_PUCH_TYP());
			this.setList_NON_PLANNED_CAUSE_CD(struct.getList_NON_PLANNED_CAUSE_CD());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_LOT_STOCK_ON_HAND_QTY(struct.getList_LOT_STOCK_ON_HAND_QTY());
			this.setList_LOT_DEFECT_QTY(struct.getList_LOT_DEFECT_QTY());
			this.setList_ALLOCABLE_QTY(struct.getList_ALLOCABLE_QTY());
			this.setList_PRD_CMPLT_DATE(struct.getList_PRD_CMPLT_DATE());
			this.setList_BEST_BEFORE_DATE(struct.getList_BEST_BEFORE_DATE());
			this.setList_BEST_BEFORE_DATE_CHECK_FLG(struct.getList_BEST_BEFORE_DATE_CHECK_FLG());
			this.setList_BBD_c_FLG(struct.getList_BBD_c_FLG());
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
	// �� 1 �ϐ������l�F i_w_JOB_ODR


	final static Integer i_w_JOB_ODR = null;

	// �� 2 �ϐ������l�F i_w_INFERIOR


	final static Integer i_w_INFERIOR = null;

	// �� 3 �ϐ������l�F i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// �� 4 �ϐ������l�F i_c_RCV_ISSUE_QTY


	final static String i_c_RCV_ISSUE_QTY = null;

	// �� 5 �ϐ������l�F i_h_SYS_LOT_CTRL_FLG


	final static String i_h_SYS_LOT_CTRL_FLG = null;

	// �� 6 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 7 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 8 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 9 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 10 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 11 �ϐ������l�F i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// �� 12 �ϐ������l�F i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// �� 13 �ϐ������l�F i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// �� 14 �ϐ������l�F i_PRODUCT_TYP


	final static Integer i_PRODUCT_TYP = null;

	// �� 15 �ϐ������l�F i_SPL_ITEM_TYP


	final static Integer i_SPL_ITEM_TYP = null;

	// �� 16 �ϐ������l�F i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// �� 17 �ϐ������l�F i_LOT_NUMBERING_TYP


	final static String i_LOT_NUMBERING_TYP = null;

	// �� 18 �ϐ������l�F i_w_MANHOUR_TYP


	final static String i_w_MANHOUR_TYP = null;

	// �� 19 �ϐ������l�F i_w_TOTAL_STOCK_ON_HAND_QTY


	final static String i_w_TOTAL_STOCK_ON_HAND_QTY = null;

	// �� 20 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 21 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 22 �ϐ������l�F i_w_WH_STOCK_ON_HAND_QTY


	final static String i_w_WH_STOCK_ON_HAND_QTY = null;

	// �� 23 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 24 �ϐ������l�F i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// �� 25 �ϐ������l�F i_w_TOTAL_DEFECT_QTY


	final static String i_w_TOTAL_DEFECT_QTY = null;

	// �� 26 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 27 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 28 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 29 �ϐ������l�F i_ISSUE_CTRL_CD


	final static String i_ISSUE_CTRL_CD = null;

	// �� 30 �ϐ������l�F i_ISSUE_TYP


	final static Integer i_ISSUE_TYP = null;

	// �� 31 �ϐ������l�F i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// �� 32 �ϐ������l�F i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// �� 33 �ϐ������l�F i_RCV_ISSUE_GNR_TYP


	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// �� 34 �ϐ������l�F i_STOCK_UPD_TYP


	final static Integer i_STOCK_UPD_TYP = null;

	// �� 35 �ϐ������l�F i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// �� 36 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 37 �ϐ������l�F i_CONS_TYP


	final static Integer i_CONS_TYP = null;

	// �� 38 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 39 �ϐ������l�F i_ONEROUS_FLG


	final static Integer i_ONEROUS_FLG = null;

	// �� 40 �ϐ������l�F i_SBCNT_PUCH_TYP


	final static Integer i_SBCNT_PUCH_TYP = null;

	// �� 41 �ϐ������l�F i_NON_PLANNED_CAUSE_CD


	final static String i_NON_PLANNED_CAUSE_CD = null;

	// �� 42 �ϐ������l�F i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// �� 43 �ϐ������l�F i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// �� 44 �ϐ������l�F i_LOT_STOCK_ON_HAND_QTY


	final static String i_LOT_STOCK_ON_HAND_QTY = null;

	// �� 45 �ϐ������l�F i_LOT_DEFECT_QTY


	final static String i_LOT_DEFECT_QTY = null;

	// �� 46 �ϐ������l�F i_ALLOCABLE_QTY


	final static String i_ALLOCABLE_QTY = null;

	// �� 47 �ϐ������l�F i_PRD_CMPLT_DATE


	final static String i_PRD_CMPLT_DATE = null;

	// �� 48 �ϐ������l�F i_BEST_BEFORE_DATE


	final static String i_BEST_BEFORE_DATE = null;

	// �� 49 �ϐ������l�F i_BEST_BEFORE_DATE_CHECK_FLG


	final static String i_BEST_BEFORE_DATE_CHECK_FLG = null;

	// �� 50 �ϐ������l�F i_BBD_c_FLG


	final static String i_BBD_c_FLG = null;

*/

	//{{user_implement_code
        //}}user_implement_code

	//////////////////////////////

}
