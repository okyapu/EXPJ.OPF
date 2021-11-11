/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0050/src/com/nec/jp/orteus/metamorBase/AF0050/AF0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0050;

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

public class AF0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_JOB_ODR */
	public Integer m_h_JOB_ODR = null;
	/** �� 2 �ϐ��F m_h_TRANSFER */
	public Integer m_h_TRANSFER = null;
	/** �� 3 �ϐ��F m_c_JOB_ODR */
	public String m_c_JOB_ODR = null;
	/** �� 4 �ϐ��F m_c_TRANSFER */
	public String m_c_TRANSFER = null;
	/** �� 5 �ϐ��F m_NON_ALC_QTY */
	public String m_NON_ALC_QTY = null;
	/** �� 6 �ϐ��F m_c_i_JOB_ODR */
	public String m_c_i_JOB_ODR = null;
	/** �� 7 �ϐ��F m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** �� 8 �ϐ��F m_h_lotFlg */
	public String m_h_lotFlg = null;
	/** �� 9 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 10 �ϐ��F m_w_RCV_ISSUE_CTRL_CD */
	public String m_w_RCV_ISSUE_CTRL_CD = null;
	/** �� 11 �ϐ��F m_w_RCV_ISSUE_TYP */
	public Integer m_w_RCV_ISSUE_TYP = null;
	/** �� 12 �ϐ��F m_w_RCV_ISSUE_GNR_TYP */
	public Integer m_w_RCV_ISSUE_GNR_TYP = null;
	/** �� 13 �ϐ��F m_w_STOCK_UPD_TYP */
	public Integer m_w_STOCK_UPD_TYP = null;
	/** �� 14 �ϐ��F m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** �� 15 �ϐ��F m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** �� 16 �ϐ��F m_w_PLANT_CD_check */
	public String m_w_PLANT_CD_check = null;
	/** �� 17 �ϐ��F m_w_UNIT_QTY_TYP */
	public Integer m_w_UNIT_QTY_TYP = null;
	/** �� 18 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 19 �ϐ��F m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** �� 20 �ϐ��F m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** �� 21 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 22 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 23 �ϐ��F m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** �� 24 �ϐ��F m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** �� 25 �ϐ��F m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** �� 26 �ϐ��F m_w_CONS_TYP */
	public Integer m_w_CONS_TYP = null;
	/** �� 27 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 28 �ϐ��F m_RCV_ISSUE_COMMENT */
	public String m_RCV_ISSUE_COMMENT = null;
	/** �� 29 �ϐ��F m_TRANSPORT_SLIP_CD */
	public String m_TRANSPORT_SLIP_CD = null;
	/** �� 30 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 31 �ϐ��F m_w_IN_PLANT_CD */
	public String m_w_IN_PLANT_CD = null;
	/** �� 32 �ϐ��F m_w_IN_WH_CD */
	public String m_w_IN_WH_CD = null;
	/** �� 33 �ϐ��F m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** �� 34 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 35 �ϐ��F m_w_TOTAL_STOCK_ON_HAND_QTY */
	public String m_w_TOTAL_STOCK_ON_HAND_QTY = null;
	/** �� 36 �ϐ��F m_w_WH_STOCK_ON_HAND_QTY */
	public String m_w_WH_STOCK_ON_HAND_QTY = null;
	/** �� 37 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 38 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 39 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 40 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 41 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 42 �ϐ��F m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** �� 43 �ϐ��F m_w_MANHOUR_TYP */
	public String m_w_MANHOUR_TYP = null;
	/** �� 44 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 45 �ϐ��F m_w_IN_WH_NAME */
	public String m_w_IN_WH_NAME = null;
	/** �� 46 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** �� 47 �ϐ��F m_MOVE_ISSUE_WH_CD */
	public String m_MOVE_ISSUE_WH_CD = null;
	/** �� 48 �ϐ��F m_MOVE_ISSUE_JOB_ODR_DETAIL_NO */
	public String m_MOVE_ISSUE_JOB_ODR_DETAIL_NO = null;
	/** �� 49 �ϐ��F m_MOVE_ISSUE_JOB_ODR_CD */
	public String m_MOVE_ISSUE_JOB_ODR_CD = null;
	/** �� 50 �ϐ��F m_MOVE_ISSUE_ITEM_CD */
	public String m_MOVE_ISSUE_ITEM_CD = null;
	/** �� 51 �ϐ��F m_MOVE_ISSUE_PLANT_CD */
	public String m_MOVE_ISSUE_PLANT_CD = null;
	/** �� 52 �ϐ��F m_MOVE_RCV_JOB_ODR_CD */
	public String m_MOVE_RCV_JOB_ODR_CD = null;
	/** �� 53 �ϐ��F m_MOVE_RCV_JOB_ODR_DETAIL_NO */
	public String m_MOVE_RCV_JOB_ODR_DETAIL_NO = null;
	/** �� 54 �ϐ��F m_MOVE_RCV_ITEM_CD */
	public String m_MOVE_RCV_ITEM_CD = null;
	/** �� 55 �ϐ��F m_MOVE_RCV_WH_CD */
	public String m_MOVE_RCV_WH_CD = null;
	/** �� 56 �ϐ��F m_MOVE_RCV_PLANT_CD */
	public String m_MOVE_RCV_PLANT_CD = null;
	/** �� 57 �ϐ��F m_MOVE_ISSUE_CTRL_CD */
	public String m_MOVE_ISSUE_CTRL_CD = null;
	/** �� 58 �ϐ��F m_MOVE_ISSUE_DATE */
	public String m_MOVE_ISSUE_DATE = null;
	/** �� 59 �ϐ��F m_MOVE_RCV_CTRL_CD */
	public String m_MOVE_RCV_CTRL_CD = null;
	/** �� 60 �ϐ��F m_MOVE_RCV_DATE */
	public String m_MOVE_RCV_DATE = null;
	/** �� 61 �ϐ��F m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** �� 62 �ϐ��F m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** �� 63 �ϐ��F m_ALLOCABLE_QTY */
	public String m_ALLOCABLE_QTY = null;
	/** �� 64 �ϐ��F m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_JOB_ODR */
	public List l_h_JOB_ODR = null;

	/** �� 2 List�ϐ��F l_h_TRANSFER */
	public List l_h_TRANSFER = null;

	/** �� 3 List�ϐ��F l_c_JOB_ODR */
	public List l_c_JOB_ODR = null;

	/** �� 4 List�ϐ��F l_c_TRANSFER */
	public List l_c_TRANSFER = null;

	/** �� 5 List�ϐ��F l_NON_ALC_QTY */
	public List l_NON_ALC_QTY = null;

	/** �� 6 List�ϐ��F l_c_i_JOB_ODR */
	public List l_c_i_JOB_ODR = null;

	/** �� 7 List�ϐ��F l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** �� 8 List�ϐ��F l_h_lotFlg */
	public List l_h_lotFlg = null;

	/** �� 9 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 10 List�ϐ��F l_w_RCV_ISSUE_CTRL_CD */
	public List l_w_RCV_ISSUE_CTRL_CD = null;

	/** �� 11 List�ϐ��F l_w_RCV_ISSUE_TYP */
	public List l_w_RCV_ISSUE_TYP = null;

	/** �� 12 List�ϐ��F l_w_RCV_ISSUE_GNR_TYP */
	public List l_w_RCV_ISSUE_GNR_TYP = null;

	/** �� 13 List�ϐ��F l_w_STOCK_UPD_TYP */
	public List l_w_STOCK_UPD_TYP = null;

	/** �� 14 List�ϐ��F l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** �� 15 List�ϐ��F l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** �� 16 List�ϐ��F l_w_PLANT_CD_check */
	public List l_w_PLANT_CD_check = null;

	/** �� 17 List�ϐ��F l_w_UNIT_QTY_TYP */
	public List l_w_UNIT_QTY_TYP = null;

	/** �� 18 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** �� 20 List�ϐ��F l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** �� 21 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 23 List�ϐ��F l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** �� 24 List�ϐ��F l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** �� 25 List�ϐ��F l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** �� 26 List�ϐ��F l_w_CONS_TYP */
	public List l_w_CONS_TYP = null;

	/** �� 27 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 28 List�ϐ��F l_RCV_ISSUE_COMMENT */
	public List l_RCV_ISSUE_COMMENT = null;

	/** �� 29 List�ϐ��F l_TRANSPORT_SLIP_CD */
	public List l_TRANSPORT_SLIP_CD = null;

	/** �� 30 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 31 List�ϐ��F l_w_IN_PLANT_CD */
	public List l_w_IN_PLANT_CD = null;

	/** �� 32 List�ϐ��F l_w_IN_WH_CD */
	public List l_w_IN_WH_CD = null;

	/** �� 33 List�ϐ��F l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** �� 34 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 35 List�ϐ��F l_w_TOTAL_STOCK_ON_HAND_QTY */
	public List l_w_TOTAL_STOCK_ON_HAND_QTY = null;

	/** �� 36 List�ϐ��F l_w_WH_STOCK_ON_HAND_QTY */
	public List l_w_WH_STOCK_ON_HAND_QTY = null;

	/** �� 37 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 38 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 39 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 40 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 41 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 42 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 43 List�ϐ��F l_w_MANHOUR_TYP */
	public List l_w_MANHOUR_TYP = null;

	/** �� 44 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 45 List�ϐ��F l_w_IN_WH_NAME */
	public List l_w_IN_WH_NAME = null;

	/** �� 46 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 47 List�ϐ��F l_MOVE_ISSUE_WH_CD */
	public List l_MOVE_ISSUE_WH_CD = null;

	/** �� 48 List�ϐ��F l_MOVE_ISSUE_JOB_ODR_DETAIL_NO */
	public List l_MOVE_ISSUE_JOB_ODR_DETAIL_NO = null;

	/** �� 49 List�ϐ��F l_MOVE_ISSUE_JOB_ODR_CD */
	public List l_MOVE_ISSUE_JOB_ODR_CD = null;

	/** �� 50 List�ϐ��F l_MOVE_ISSUE_ITEM_CD */
	public List l_MOVE_ISSUE_ITEM_CD = null;

	/** �� 51 List�ϐ��F l_MOVE_ISSUE_PLANT_CD */
	public List l_MOVE_ISSUE_PLANT_CD = null;

	/** �� 52 List�ϐ��F l_MOVE_RCV_JOB_ODR_CD */
	public List l_MOVE_RCV_JOB_ODR_CD = null;

	/** �� 53 List�ϐ��F l_MOVE_RCV_JOB_ODR_DETAIL_NO */
	public List l_MOVE_RCV_JOB_ODR_DETAIL_NO = null;

	/** �� 54 List�ϐ��F l_MOVE_RCV_ITEM_CD */
	public List l_MOVE_RCV_ITEM_CD = null;

	/** �� 55 List�ϐ��F l_MOVE_RCV_WH_CD */
	public List l_MOVE_RCV_WH_CD = null;

	/** �� 56 List�ϐ��F l_MOVE_RCV_PLANT_CD */
	public List l_MOVE_RCV_PLANT_CD = null;

	/** �� 57 List�ϐ��F l_MOVE_ISSUE_CTRL_CD */
	public List l_MOVE_ISSUE_CTRL_CD = null;

	/** �� 58 List�ϐ��F l_MOVE_ISSUE_DATE */
	public List l_MOVE_ISSUE_DATE = null;

	/** �� 59 List�ϐ��F l_MOVE_RCV_CTRL_CD */
	public List l_MOVE_RCV_CTRL_CD = null;

	/** �� 60 List�ϐ��F l_MOVE_RCV_DATE */
	public List l_MOVE_RCV_DATE = null;

	/** �� 61 List�ϐ��F l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** �� 62 List�ϐ��F l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** �� 63 List�ϐ��F l_ALLOCABLE_QTY */
	public List l_ALLOCABLE_QTY = null;

	/** �� 64 List�ϐ��F l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public Integer geth_JOB_ODR() { return m_h_JOB_ODR; }
	public Integer geth_TRANSFER() { return m_h_TRANSFER; }
	public String getc_JOB_ODR() { return m_c_JOB_ODR; }
	public String getc_TRANSFER() { return m_c_TRANSFER; }
	public String getNON_ALC_QTY() { return m_NON_ALC_QTY; }
	public String getc_i_JOB_ODR() { return m_c_i_JOB_ODR; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String geth_lotFlg() { return m_h_lotFlg; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getw_RCV_ISSUE_CTRL_CD() { return m_w_RCV_ISSUE_CTRL_CD; }
	public Integer getw_RCV_ISSUE_TYP() { return m_w_RCV_ISSUE_TYP; }
	public Integer getw_RCV_ISSUE_GNR_TYP() { return m_w_RCV_ISSUE_GNR_TYP; }
	public Integer getw_STOCK_UPD_TYP() { return m_w_STOCK_UPD_TYP; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getw_PLANT_CD_check() { return m_w_PLANT_CD_check; }
	public Integer getw_UNIT_QTY_TYP() { return m_w_UNIT_QTY_TYP; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public Integer getw_CONS_TYP() { return m_w_CONS_TYP; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getRCV_ISSUE_COMMENT() { return m_RCV_ISSUE_COMMENT; }
	public String getTRANSPORT_SLIP_CD() { return m_TRANSPORT_SLIP_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getw_IN_PLANT_CD() { return m_w_IN_PLANT_CD; }
	public String getw_IN_WH_CD() { return m_w_IN_WH_CD; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getw_TOTAL_STOCK_ON_HAND_QTY() { return m_w_TOTAL_STOCK_ON_HAND_QTY; }
	public String getw_WH_STOCK_ON_HAND_QTY() { return m_w_WH_STOCK_ON_HAND_QTY; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_MANHOUR_TYP() { return m_w_MANHOUR_TYP; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getw_IN_WH_NAME() { return m_w_IN_WH_NAME; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getMOVE_ISSUE_WH_CD() { return m_MOVE_ISSUE_WH_CD; }
	public String getMOVE_ISSUE_JOB_ODR_DETAIL_NO() { return m_MOVE_ISSUE_JOB_ODR_DETAIL_NO; }
	public String getMOVE_ISSUE_JOB_ODR_CD() { return m_MOVE_ISSUE_JOB_ODR_CD; }
	public String getMOVE_ISSUE_ITEM_CD() { return m_MOVE_ISSUE_ITEM_CD; }
	public String getMOVE_ISSUE_PLANT_CD() { return m_MOVE_ISSUE_PLANT_CD; }
	public String getMOVE_RCV_JOB_ODR_CD() { return m_MOVE_RCV_JOB_ODR_CD; }
	public String getMOVE_RCV_JOB_ODR_DETAIL_NO() { return m_MOVE_RCV_JOB_ODR_DETAIL_NO; }
	public String getMOVE_RCV_ITEM_CD() { return m_MOVE_RCV_ITEM_CD; }
	public String getMOVE_RCV_WH_CD() { return m_MOVE_RCV_WH_CD; }
	public String getMOVE_RCV_PLANT_CD() { return m_MOVE_RCV_PLANT_CD; }
	public String getMOVE_ISSUE_CTRL_CD() { return m_MOVE_ISSUE_CTRL_CD; }
	public String getMOVE_ISSUE_DATE() { return m_MOVE_ISSUE_DATE; }
	public String getMOVE_RCV_CTRL_CD() { return m_MOVE_RCV_CTRL_CD; }
	public String getMOVE_RCV_DATE() { return m_MOVE_RCV_DATE; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getALLOCABLE_QTY() { return m_ALLOCABLE_QTY; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }

	public List getList_h_JOB_ODR() { return l_h_JOB_ODR; }
	public List getList_h_TRANSFER() { return l_h_TRANSFER; }
	public List getList_c_JOB_ODR() { return l_c_JOB_ODR; }
	public List getList_c_TRANSFER() { return l_c_TRANSFER; }
	public List getList_NON_ALC_QTY() { return l_NON_ALC_QTY; }
	public List getList_c_i_JOB_ODR() { return l_c_i_JOB_ODR; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_h_lotFlg() { return l_h_lotFlg; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_w_RCV_ISSUE_CTRL_CD() { return l_w_RCV_ISSUE_CTRL_CD; }
	public List getList_w_RCV_ISSUE_TYP() { return l_w_RCV_ISSUE_TYP; }
	public List getList_w_RCV_ISSUE_GNR_TYP() { return l_w_RCV_ISSUE_GNR_TYP; }
	public List getList_w_STOCK_UPD_TYP() { return l_w_STOCK_UPD_TYP; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_w_PLANT_CD_check() { return l_w_PLANT_CD_check; }
	public List getList_w_UNIT_QTY_TYP() { return l_w_UNIT_QTY_TYP; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_w_CONS_TYP() { return l_w_CONS_TYP; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_RCV_ISSUE_COMMENT() { return l_RCV_ISSUE_COMMENT; }
	public List getList_TRANSPORT_SLIP_CD() { return l_TRANSPORT_SLIP_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_w_IN_PLANT_CD() { return l_w_IN_PLANT_CD; }
	public List getList_w_IN_WH_CD() { return l_w_IN_WH_CD; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_w_TOTAL_STOCK_ON_HAND_QTY() { return l_w_TOTAL_STOCK_ON_HAND_QTY; }
	public List getList_w_WH_STOCK_ON_HAND_QTY() { return l_w_WH_STOCK_ON_HAND_QTY; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_MANHOUR_TYP() { return l_w_MANHOUR_TYP; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_w_IN_WH_NAME() { return l_w_IN_WH_NAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_MOVE_ISSUE_WH_CD() { return l_MOVE_ISSUE_WH_CD; }
	public List getList_MOVE_ISSUE_JOB_ODR_DETAIL_NO() { return l_MOVE_ISSUE_JOB_ODR_DETAIL_NO; }
	public List getList_MOVE_ISSUE_JOB_ODR_CD() { return l_MOVE_ISSUE_JOB_ODR_CD; }
	public List getList_MOVE_ISSUE_ITEM_CD() { return l_MOVE_ISSUE_ITEM_CD; }
	public List getList_MOVE_ISSUE_PLANT_CD() { return l_MOVE_ISSUE_PLANT_CD; }
	public List getList_MOVE_RCV_JOB_ODR_CD() { return l_MOVE_RCV_JOB_ODR_CD; }
	public List getList_MOVE_RCV_JOB_ODR_DETAIL_NO() { return l_MOVE_RCV_JOB_ODR_DETAIL_NO; }
	public List getList_MOVE_RCV_ITEM_CD() { return l_MOVE_RCV_ITEM_CD; }
	public List getList_MOVE_RCV_WH_CD() { return l_MOVE_RCV_WH_CD; }
	public List getList_MOVE_RCV_PLANT_CD() { return l_MOVE_RCV_PLANT_CD; }
	public List getList_MOVE_ISSUE_CTRL_CD() { return l_MOVE_ISSUE_CTRL_CD; }
	public List getList_MOVE_ISSUE_DATE() { return l_MOVE_ISSUE_DATE; }
	public List getList_MOVE_RCV_CTRL_CD() { return l_MOVE_RCV_CTRL_CD; }
	public List getList_MOVE_RCV_DATE() { return l_MOVE_RCV_DATE; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_ALLOCABLE_QTY() { return l_ALLOCABLE_QTY; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }

	public void seth_JOB_ODR(Integer val) { m_h_JOB_ODR = val; }
	public void seth_TRANSFER(Integer val) { m_h_TRANSFER = val; }
	public void setc_JOB_ODR(String val) { m_c_JOB_ODR = val; }
	public void setc_TRANSFER(String val) { m_c_TRANSFER = val; }
	public void setNON_ALC_QTY(String val) { m_NON_ALC_QTY = val; }
	public void setc_i_JOB_ODR(String val) { m_c_i_JOB_ODR = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void seth_lotFlg(String val) { m_h_lotFlg = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setw_RCV_ISSUE_CTRL_CD(String val) { m_w_RCV_ISSUE_CTRL_CD = val; }
	public void setw_RCV_ISSUE_TYP(Integer val) { m_w_RCV_ISSUE_TYP = val; }
	public void setw_RCV_ISSUE_GNR_TYP(Integer val) { m_w_RCV_ISSUE_GNR_TYP = val; }
	public void setw_STOCK_UPD_TYP(Integer val) { m_w_STOCK_UPD_TYP = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setw_PLANT_CD_check(String val) { m_w_PLANT_CD_check = val; }
	public void setw_UNIT_QTY_TYP(Integer val) { m_w_UNIT_QTY_TYP = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setw_CONS_TYP(Integer val) { m_w_CONS_TYP = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setRCV_ISSUE_COMMENT(String val) { m_RCV_ISSUE_COMMENT = val; }
	public void setTRANSPORT_SLIP_CD(String val) { m_TRANSPORT_SLIP_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setw_IN_PLANT_CD(String val) { m_w_IN_PLANT_CD = val; }
	public void setw_IN_WH_CD(String val) { m_w_IN_WH_CD = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setw_TOTAL_STOCK_ON_HAND_QTY(String val) { m_w_TOTAL_STOCK_ON_HAND_QTY = val; }
	public void setw_WH_STOCK_ON_HAND_QTY(String val) { m_w_WH_STOCK_ON_HAND_QTY = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_MANHOUR_TYP(String val) { m_w_MANHOUR_TYP = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setw_IN_WH_NAME(String val) { m_w_IN_WH_NAME = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setMOVE_ISSUE_WH_CD(String val) { m_MOVE_ISSUE_WH_CD = val; }
	public void setMOVE_ISSUE_JOB_ODR_DETAIL_NO(String val) { m_MOVE_ISSUE_JOB_ODR_DETAIL_NO = val; }
	public void setMOVE_ISSUE_JOB_ODR_CD(String val) { m_MOVE_ISSUE_JOB_ODR_CD = val; }
	public void setMOVE_ISSUE_ITEM_CD(String val) { m_MOVE_ISSUE_ITEM_CD = val; }
	public void setMOVE_ISSUE_PLANT_CD(String val) { m_MOVE_ISSUE_PLANT_CD = val; }
	public void setMOVE_RCV_JOB_ODR_CD(String val) { m_MOVE_RCV_JOB_ODR_CD = val; }
	public void setMOVE_RCV_JOB_ODR_DETAIL_NO(String val) { m_MOVE_RCV_JOB_ODR_DETAIL_NO = val; }
	public void setMOVE_RCV_ITEM_CD(String val) { m_MOVE_RCV_ITEM_CD = val; }
	public void setMOVE_RCV_WH_CD(String val) { m_MOVE_RCV_WH_CD = val; }
	public void setMOVE_RCV_PLANT_CD(String val) { m_MOVE_RCV_PLANT_CD = val; }
	public void setMOVE_ISSUE_CTRL_CD(String val) { m_MOVE_ISSUE_CTRL_CD = val; }
	public void setMOVE_ISSUE_DATE(String val) { m_MOVE_ISSUE_DATE = val; }
	public void setMOVE_RCV_CTRL_CD(String val) { m_MOVE_RCV_CTRL_CD = val; }
	public void setMOVE_RCV_DATE(String val) { m_MOVE_RCV_DATE = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setALLOCABLE_QTY(String val) { m_ALLOCABLE_QTY = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }

	public void seth_JOB_ODR(String val) { m_h_JOB_ODR = getInteger(val); }
	public void seth_TRANSFER(String val) { m_h_TRANSFER = getInteger(val); }
	public void setw_RCV_ISSUE_TYP(String val) { m_w_RCV_ISSUE_TYP = getInteger(val); }
	public void setw_RCV_ISSUE_GNR_TYP(String val) { m_w_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setw_STOCK_UPD_TYP(String val) { m_w_STOCK_UPD_TYP = getInteger(val); }
	public void setw_UNIT_QTY_TYP(String val) { m_w_UNIT_QTY_TYP = getInteger(val); }
	public void setw_CONS_TYP(String val) { m_w_CONS_TYP = getInteger(val); }

	public void setList_h_JOB_ODR(List list) { l_h_JOB_ODR = list; }
	public void setList_h_TRANSFER(List list) { l_h_TRANSFER = list; }
	public void setList_c_JOB_ODR(List list) { l_c_JOB_ODR = list; }
	public void setList_c_TRANSFER(List list) { l_c_TRANSFER = list; }
	public void setList_NON_ALC_QTY(List list) { l_NON_ALC_QTY = list; }
	public void setList_c_i_JOB_ODR(List list) { l_c_i_JOB_ODR = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_h_lotFlg(List list) { l_h_lotFlg = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_w_RCV_ISSUE_CTRL_CD(List list) { l_w_RCV_ISSUE_CTRL_CD = list; }
	public void setList_w_RCV_ISSUE_TYP(List list) { l_w_RCV_ISSUE_TYP = list; }
	public void setList_w_RCV_ISSUE_GNR_TYP(List list) { l_w_RCV_ISSUE_GNR_TYP = list; }
	public void setList_w_STOCK_UPD_TYP(List list) { l_w_STOCK_UPD_TYP = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_w_PLANT_CD_check(List list) { l_w_PLANT_CD_check = list; }
	public void setList_w_UNIT_QTY_TYP(List list) { l_w_UNIT_QTY_TYP = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_w_CONS_TYP(List list) { l_w_CONS_TYP = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_RCV_ISSUE_COMMENT(List list) { l_RCV_ISSUE_COMMENT = list; }
	public void setList_TRANSPORT_SLIP_CD(List list) { l_TRANSPORT_SLIP_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_w_IN_PLANT_CD(List list) { l_w_IN_PLANT_CD = list; }
	public void setList_w_IN_WH_CD(List list) { l_w_IN_WH_CD = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_w_TOTAL_STOCK_ON_HAND_QTY(List list) { l_w_TOTAL_STOCK_ON_HAND_QTY = list; }
	public void setList_w_WH_STOCK_ON_HAND_QTY(List list) { l_w_WH_STOCK_ON_HAND_QTY = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_MANHOUR_TYP(List list) { l_w_MANHOUR_TYP = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_w_IN_WH_NAME(List list) { l_w_IN_WH_NAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_MOVE_ISSUE_WH_CD(List list) { l_MOVE_ISSUE_WH_CD = list; }
	public void setList_MOVE_ISSUE_JOB_ODR_DETAIL_NO(List list) { l_MOVE_ISSUE_JOB_ODR_DETAIL_NO = list; }
	public void setList_MOVE_ISSUE_JOB_ODR_CD(List list) { l_MOVE_ISSUE_JOB_ODR_CD = list; }
	public void setList_MOVE_ISSUE_ITEM_CD(List list) { l_MOVE_ISSUE_ITEM_CD = list; }
	public void setList_MOVE_ISSUE_PLANT_CD(List list) { l_MOVE_ISSUE_PLANT_CD = list; }
	public void setList_MOVE_RCV_JOB_ODR_CD(List list) { l_MOVE_RCV_JOB_ODR_CD = list; }
	public void setList_MOVE_RCV_JOB_ODR_DETAIL_NO(List list) { l_MOVE_RCV_JOB_ODR_DETAIL_NO = list; }
	public void setList_MOVE_RCV_ITEM_CD(List list) { l_MOVE_RCV_ITEM_CD = list; }
	public void setList_MOVE_RCV_WH_CD(List list) { l_MOVE_RCV_WH_CD = list; }
	public void setList_MOVE_RCV_PLANT_CD(List list) { l_MOVE_RCV_PLANT_CD = list; }
	public void setList_MOVE_ISSUE_CTRL_CD(List list) { l_MOVE_ISSUE_CTRL_CD = list; }
	public void setList_MOVE_ISSUE_DATE(List list) { l_MOVE_ISSUE_DATE = list; }
	public void setList_MOVE_RCV_CTRL_CD(List list) { l_MOVE_RCV_CTRL_CD = list; }
	public void setList_MOVE_RCV_DATE(List list) { l_MOVE_RCV_DATE = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_ALLOCABLE_QTY(List list) { l_ALLOCABLE_QTY = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }

	public int setL2L_h_JOB_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR == null) {
			l_h_JOB_ODR = new ArrayList();
		} else {
			l_h_JOB_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR.add(((AF0050010Struct) list.get(i)).geth_JOB_ODR());
		}
		return size;
	}
	public int setL2L_h_TRANSFER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TRANSFER == null) {
			l_h_TRANSFER = new ArrayList();
		} else {
			l_h_TRANSFER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TRANSFER.add(((AF0050010Struct) list.get(i)).geth_TRANSFER());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR == null) {
			l_c_JOB_ODR = new ArrayList();
		} else {
			l_c_JOB_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR.add(((AF0050010Struct) list.get(i)).getc_JOB_ODR());
		}
		return size;
	}
	public int setL2L_c_TRANSFER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_TRANSFER == null) {
			l_c_TRANSFER = new ArrayList();
		} else {
			l_c_TRANSFER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_TRANSFER.add(((AF0050010Struct) list.get(i)).getc_TRANSFER());
		}
		return size;
	}
	public int setL2L_NON_ALC_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_ALC_QTY == null) {
			l_NON_ALC_QTY = new ArrayList();
		} else {
			l_NON_ALC_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_ALC_QTY.add(((AF0050010Struct) list.get(i)).getNON_ALC_QTY());
		}
		return size;
	}
	public int setL2L_c_i_JOB_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_i_JOB_ODR == null) {
			l_c_i_JOB_ODR = new ArrayList();
		} else {
			l_c_i_JOB_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_i_JOB_ODR.add(((AF0050010Struct) list.get(i)).getc_i_JOB_ODR());
		}
		return size;
	}
	public int setL2L_h_lotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotCtrl == null) {
			l_h_lotCtrl = new ArrayList();
		} else {
			l_h_lotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotCtrl.add(((AF0050010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_h_lotFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotFlg == null) {
			l_h_lotFlg = new ArrayList();
		} else {
			l_h_lotFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotFlg.add(((AF0050010Struct) list.get(i)).geth_lotFlg());
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
			l_PLANT_CD.add(((AF0050010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_CTRL_CD == null) {
			l_w_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_w_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_CTRL_CD.add(((AF0050010Struct) list.get(i)).getw_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_TYP == null) {
			l_w_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_w_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_TYP.add(((AF0050010Struct) list.get(i)).getw_RCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_GNR_TYP == null) {
			l_w_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_w_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_GNR_TYP.add(((AF0050010Struct) list.get(i)).getw_RCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_w_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_UPD_TYP == null) {
			l_w_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_w_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_UPD_TYP.add(((AF0050010Struct) list.get(i)).getw_STOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_w_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMPANY_CD == null) {
			l_w_COMPANY_CD = new ArrayList();
		} else {
			l_w_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMPANY_CD.add(((AF0050010Struct) list.get(i)).getw_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_w_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VEND_CD == null) {
			l_w_VEND_CD = new ArrayList();
		} else {
			l_w_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VEND_CD.add(((AF0050010Struct) list.get(i)).getw_VEND_CD());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD_check(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD_check == null) {
			l_w_PLANT_CD_check = new ArrayList();
		} else {
			l_w_PLANT_CD_check.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD_check.add(((AF0050010Struct) list.get(i)).getw_PLANT_CD_check());
		}
		return size;
	}
	public int setL2L_w_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_QTY_TYP == null) {
			l_w_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_w_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_QTY_TYP.add(((AF0050010Struct) list.get(i)).getw_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((AF0050010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_CD == null) {
			l_w_WH_CD = new ArrayList();
		} else {
			l_w_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_CD.add(((AF0050010Struct) list.get(i)).getw_WH_CD());
		}
		return size;
	}
	public int setL2L_w_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_NAME == null) {
			l_w_PLANT_NAME = new ArrayList();
		} else {
			l_w_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_NAME.add(((AF0050010Struct) list.get(i)).getw_PLANT_NAME());
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
			l_ITEM_CD.add(((AF0050010Struct) list.get(i)).getITEM_CD());
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
			l_JOB_ODR_CD.add(((AF0050010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_RCV_ISSUE_QTY.add(((AF0050010Struct) list.get(i)).getRCV_ISSUE_QTY());
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
			l_RCV_ISSUE_DATE.add(((AF0050010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_VEND_LOT_NO.add(((AF0050010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_w_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CONS_TYP == null) {
			l_w_CONS_TYP = new ArrayList();
		} else {
			l_w_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CONS_TYP.add(((AF0050010Struct) list.get(i)).getw_CONS_TYP());
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
			l_LOT_NO.add(((AF0050010Struct) list.get(i)).getLOT_NO());
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
			l_RCV_ISSUE_COMMENT.add(((AF0050010Struct) list.get(i)).getRCV_ISSUE_COMMENT());
		}
		return size;
	}
	public int setL2L_TRANSPORT_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_SLIP_CD == null) {
			l_TRANSPORT_SLIP_CD = new ArrayList();
		} else {
			l_TRANSPORT_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_SLIP_CD.add(((AF0050010Struct) list.get(i)).getTRANSPORT_SLIP_CD());
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
			l_WH_CD.add(((AF0050010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_w_IN_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_IN_PLANT_CD == null) {
			l_w_IN_PLANT_CD = new ArrayList();
		} else {
			l_w_IN_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_IN_PLANT_CD.add(((AF0050010Struct) list.get(i)).getw_IN_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_IN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_IN_WH_CD == null) {
			l_w_IN_WH_CD = new ArrayList();
		} else {
			l_w_IN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_IN_WH_CD.add(((AF0050010Struct) list.get(i)).getw_IN_WH_CD());
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
			l_RCV_ISSUE_CTRL_CD.add(((AF0050010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
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
			l_BUSINESS_OPR_DATE.add(((AF0050010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_w_TOTAL_STOCK_ON_HAND_QTY.add(((AF0050010Struct) list.get(i)).getw_TOTAL_STOCK_ON_HAND_QTY());
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
			l_w_WH_STOCK_ON_HAND_QTY.add(((AF0050010Struct) list.get(i)).getw_WH_STOCK_ON_HAND_QTY());
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
			l_ITEM_NAME.add(((AF0050010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AF0050010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0050010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0050010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_MRP_ODR_TYP.add(((AF0050010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_LOT_CTRL_FLG.add(((AF0050010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_w_MANHOUR_TYP.add(((AF0050010Struct) list.get(i)).getw_MANHOUR_TYP());
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
			l_WH_NAME.add(((AF0050010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_w_IN_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_IN_WH_NAME == null) {
			l_w_IN_WH_NAME = new ArrayList();
		} else {
			l_w_IN_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_IN_WH_NAME.add(((AF0050010Struct) list.get(i)).getw_IN_WH_NAME());
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
			l_MRP_FLG.add(((AF0050010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_WH_CD == null) {
			l_MOVE_ISSUE_WH_CD = new ArrayList();
		} else {
			l_MOVE_ISSUE_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_WH_CD.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_WH_CD());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_JOB_ODR_DETAIL_NO == null) {
			l_MOVE_ISSUE_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_MOVE_ISSUE_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_JOB_ODR_DETAIL_NO.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_JOB_ODR_CD == null) {
			l_MOVE_ISSUE_JOB_ODR_CD = new ArrayList();
		} else {
			l_MOVE_ISSUE_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_JOB_ODR_CD.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_ITEM_CD == null) {
			l_MOVE_ISSUE_ITEM_CD = new ArrayList();
		} else {
			l_MOVE_ISSUE_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_ITEM_CD.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_ITEM_CD());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_PLANT_CD == null) {
			l_MOVE_ISSUE_PLANT_CD = new ArrayList();
		} else {
			l_MOVE_ISSUE_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_PLANT_CD.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_PLANT_CD());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_JOB_ODR_CD == null) {
			l_MOVE_RCV_JOB_ODR_CD = new ArrayList();
		} else {
			l_MOVE_RCV_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_JOB_ODR_CD.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_JOB_ODR_DETAIL_NO == null) {
			l_MOVE_RCV_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_MOVE_RCV_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_JOB_ODR_DETAIL_NO.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_JOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_ITEM_CD == null) {
			l_MOVE_RCV_ITEM_CD = new ArrayList();
		} else {
			l_MOVE_RCV_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_ITEM_CD.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_ITEM_CD());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_WH_CD == null) {
			l_MOVE_RCV_WH_CD = new ArrayList();
		} else {
			l_MOVE_RCV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_WH_CD.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_WH_CD());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_PLANT_CD == null) {
			l_MOVE_RCV_PLANT_CD = new ArrayList();
		} else {
			l_MOVE_RCV_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_PLANT_CD.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_PLANT_CD());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_CTRL_CD == null) {
			l_MOVE_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_MOVE_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_CTRL_CD.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_MOVE_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_ISSUE_DATE == null) {
			l_MOVE_ISSUE_DATE = new ArrayList();
		} else {
			l_MOVE_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_ISSUE_DATE.add(((AF0050010Struct) list.get(i)).getMOVE_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_CTRL_CD == null) {
			l_MOVE_RCV_CTRL_CD = new ArrayList();
		} else {
			l_MOVE_RCV_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_CTRL_CD.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_CTRL_CD());
		}
		return size;
	}
	public int setL2L_MOVE_RCV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MOVE_RCV_DATE == null) {
			l_MOVE_RCV_DATE = new ArrayList();
		} else {
			l_MOVE_RCV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MOVE_RCV_DATE.add(((AF0050010Struct) list.get(i)).getMOVE_RCV_DATE());
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
			l_STOCK_ON_HAND_QTY.add(((AF0050010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
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
			l_DEFECT_QTY.add(((AF0050010Struct) list.get(i)).getDEFECT_QTY());
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
			l_ALLOCABLE_QTY.add(((AF0050010Struct) list.get(i)).getALLOCABLE_QTY());
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
			l_PROC_EXEC_DATE.add(((AF0050010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_JOB_ODR = null;
		m_h_TRANSFER = null;
		m_c_JOB_ODR = null;
		m_c_TRANSFER = null;
		m_NON_ALC_QTY = null;
		m_c_i_JOB_ODR = null;
		m_h_lotCtrl = null;
		m_h_lotFlg = null;
		m_PLANT_CD = null;
		m_w_RCV_ISSUE_CTRL_CD = null;
		m_w_RCV_ISSUE_TYP = null;
		m_w_RCV_ISSUE_GNR_TYP = null;
		m_w_STOCK_UPD_TYP = null;
		m_w_COMPANY_CD = null;
		m_w_VEND_CD = null;
		m_w_PLANT_CD_check = null;
		m_w_UNIT_QTY_TYP = null;
		m_w_PLANT_CD = null;
		m_w_WH_CD = null;
		m_w_PLANT_NAME = null;
		m_ITEM_CD = null;
		m_JOB_ODR_CD = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_VEND_LOT_NO = null;
		m_w_CONS_TYP = null;
		m_LOT_NO = null;
		m_RCV_ISSUE_COMMENT = null;
		m_TRANSPORT_SLIP_CD = null;
		m_WH_CD = null;
		m_w_IN_PLANT_CD = null;
		m_w_IN_WH_CD = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_w_TOTAL_STOCK_ON_HAND_QTY = null;
		m_w_WH_STOCK_ON_HAND_QTY = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_MRP_ODR_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_w_MANHOUR_TYP = null;
		m_WH_NAME = null;
		m_w_IN_WH_NAME = null;
		m_MRP_FLG = null;
		m_MOVE_ISSUE_WH_CD = null;
		m_MOVE_ISSUE_JOB_ODR_DETAIL_NO = null;
		m_MOVE_ISSUE_JOB_ODR_CD = null;
		m_MOVE_ISSUE_ITEM_CD = null;
		m_MOVE_ISSUE_PLANT_CD = null;
		m_MOVE_RCV_JOB_ODR_CD = null;
		m_MOVE_RCV_JOB_ODR_DETAIL_NO = null;
		m_MOVE_RCV_ITEM_CD = null;
		m_MOVE_RCV_WH_CD = null;
		m_MOVE_RCV_PLANT_CD = null;
		m_MOVE_ISSUE_CTRL_CD = null;
		m_MOVE_ISSUE_DATE = null;
		m_MOVE_RCV_CTRL_CD = null;
		m_MOVE_RCV_DATE = null;
		m_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_ALLOCABLE_QTY = null;
		m_PROC_EXEC_DATE = null;

		l_h_JOB_ODR = null;
		l_h_TRANSFER = null;
		l_c_JOB_ODR = null;
		l_c_TRANSFER = null;
		l_NON_ALC_QTY = null;
		l_c_i_JOB_ODR = null;
		l_h_lotCtrl = null;
		l_h_lotFlg = null;
		l_PLANT_CD = null;
		l_w_RCV_ISSUE_CTRL_CD = null;
		l_w_RCV_ISSUE_TYP = null;
		l_w_RCV_ISSUE_GNR_TYP = null;
		l_w_STOCK_UPD_TYP = null;
		l_w_COMPANY_CD = null;
		l_w_VEND_CD = null;
		l_w_PLANT_CD_check = null;
		l_w_UNIT_QTY_TYP = null;
		l_w_PLANT_CD = null;
		l_w_WH_CD = null;
		l_w_PLANT_NAME = null;
		l_ITEM_CD = null;
		l_JOB_ODR_CD = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_VEND_LOT_NO = null;
		l_w_CONS_TYP = null;
		l_LOT_NO = null;
		l_RCV_ISSUE_COMMENT = null;
		l_TRANSPORT_SLIP_CD = null;
		l_WH_CD = null;
		l_w_IN_PLANT_CD = null;
		l_w_IN_WH_CD = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_w_TOTAL_STOCK_ON_HAND_QTY = null;
		l_w_WH_STOCK_ON_HAND_QTY = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_MRP_ODR_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_w_MANHOUR_TYP = null;
		l_WH_NAME = null;
		l_w_IN_WH_NAME = null;
		l_MRP_FLG = null;
		l_MOVE_ISSUE_WH_CD = null;
		l_MOVE_ISSUE_JOB_ODR_DETAIL_NO = null;
		l_MOVE_ISSUE_JOB_ODR_CD = null;
		l_MOVE_ISSUE_ITEM_CD = null;
		l_MOVE_ISSUE_PLANT_CD = null;
		l_MOVE_RCV_JOB_ODR_CD = null;
		l_MOVE_RCV_JOB_ODR_DETAIL_NO = null;
		l_MOVE_RCV_ITEM_CD = null;
		l_MOVE_RCV_WH_CD = null;
		l_MOVE_RCV_PLANT_CD = null;
		l_MOVE_ISSUE_CTRL_CD = null;
		l_MOVE_ISSUE_DATE = null;
		l_MOVE_RCV_CTRL_CD = null;
		l_MOVE_RCV_DATE = null;
		l_STOCK_ON_HAND_QTY = null;
		l_DEFECT_QTY = null;
		l_ALLOCABLE_QTY = null;
		l_PROC_EXEC_DATE = null;

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
	 * medAF0050010�N���X�̕W���R���X�g���N�^
	 */
	public AF0050010Struct()
	{
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		initialize();
		//---------------------------------------------------------------------
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
	public void setStruct(AF0050010Struct struct)
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
	public void setStructM(AF0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_JOB_ODR(struct.geth_JOB_ODR());
			this.seth_TRANSFER(struct.geth_TRANSFER());
			this.setc_JOB_ODR(struct.getc_JOB_ODR());
			this.setc_TRANSFER(struct.getc_TRANSFER());
			this.setNON_ALC_QTY(struct.getNON_ALC_QTY());
			this.setc_i_JOB_ODR(struct.getc_i_JOB_ODR());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.seth_lotFlg(struct.geth_lotFlg());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setw_RCV_ISSUE_CTRL_CD(struct.getw_RCV_ISSUE_CTRL_CD());
			this.setw_RCV_ISSUE_TYP(struct.getw_RCV_ISSUE_TYP());
			this.setw_RCV_ISSUE_GNR_TYP(struct.getw_RCV_ISSUE_GNR_TYP());
			this.setw_STOCK_UPD_TYP(struct.getw_STOCK_UPD_TYP());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setw_PLANT_CD_check(struct.getw_PLANT_CD_check());
			this.setw_UNIT_QTY_TYP(struct.getw_UNIT_QTY_TYP());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setw_CONS_TYP(struct.getw_CONS_TYP());
			this.setLOT_NO(struct.getLOT_NO());
			this.setRCV_ISSUE_COMMENT(struct.getRCV_ISSUE_COMMENT());
			this.setTRANSPORT_SLIP_CD(struct.getTRANSPORT_SLIP_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setw_IN_PLANT_CD(struct.getw_IN_PLANT_CD());
			this.setw_IN_WH_CD(struct.getw_IN_WH_CD());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setw_TOTAL_STOCK_ON_HAND_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			this.setw_WH_STOCK_ON_HAND_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_MANHOUR_TYP(struct.getw_MANHOUR_TYP());
			this.setWH_NAME(struct.getWH_NAME());
			this.setw_IN_WH_NAME(struct.getw_IN_WH_NAME());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setMOVE_ISSUE_WH_CD(struct.getMOVE_ISSUE_WH_CD());
			this.setMOVE_ISSUE_JOB_ODR_DETAIL_NO(struct.getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
			this.setMOVE_ISSUE_JOB_ODR_CD(struct.getMOVE_ISSUE_JOB_ODR_CD());
			this.setMOVE_ISSUE_ITEM_CD(struct.getMOVE_ISSUE_ITEM_CD());
			this.setMOVE_ISSUE_PLANT_CD(struct.getMOVE_ISSUE_PLANT_CD());
			this.setMOVE_RCV_JOB_ODR_CD(struct.getMOVE_RCV_JOB_ODR_CD());
			this.setMOVE_RCV_JOB_ODR_DETAIL_NO(struct.getMOVE_RCV_JOB_ODR_DETAIL_NO());
			this.setMOVE_RCV_ITEM_CD(struct.getMOVE_RCV_ITEM_CD());
			this.setMOVE_RCV_WH_CD(struct.getMOVE_RCV_WH_CD());
			this.setMOVE_RCV_PLANT_CD(struct.getMOVE_RCV_PLANT_CD());
			this.setMOVE_ISSUE_CTRL_CD(struct.getMOVE_ISSUE_CTRL_CD());
			this.setMOVE_ISSUE_DATE(struct.getMOVE_ISSUE_DATE());
			this.setMOVE_RCV_CTRL_CD(struct.getMOVE_RCV_CTRL_CD());
			this.setMOVE_RCV_DATE(struct.getMOVE_RCV_DATE());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setALLOCABLE_QTY(struct.getALLOCABLE_QTY());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AF0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_JOB_ODR(struct.getList_h_JOB_ODR());
			this.setList_h_TRANSFER(struct.getList_h_TRANSFER());
			this.setList_c_JOB_ODR(struct.getList_c_JOB_ODR());
			this.setList_c_TRANSFER(struct.getList_c_TRANSFER());
			this.setList_NON_ALC_QTY(struct.getList_NON_ALC_QTY());
			this.setList_c_i_JOB_ODR(struct.getList_c_i_JOB_ODR());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_h_lotFlg(struct.getList_h_lotFlg());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_w_RCV_ISSUE_CTRL_CD(struct.getList_w_RCV_ISSUE_CTRL_CD());
			this.setList_w_RCV_ISSUE_TYP(struct.getList_w_RCV_ISSUE_TYP());
			this.setList_w_RCV_ISSUE_GNR_TYP(struct.getList_w_RCV_ISSUE_GNR_TYP());
			this.setList_w_STOCK_UPD_TYP(struct.getList_w_STOCK_UPD_TYP());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_w_PLANT_CD_check(struct.getList_w_PLANT_CD_check());
			this.setList_w_UNIT_QTY_TYP(struct.getList_w_UNIT_QTY_TYP());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_w_CONS_TYP(struct.getList_w_CONS_TYP());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_RCV_ISSUE_COMMENT(struct.getList_RCV_ISSUE_COMMENT());
			this.setList_TRANSPORT_SLIP_CD(struct.getList_TRANSPORT_SLIP_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_w_IN_PLANT_CD(struct.getList_w_IN_PLANT_CD());
			this.setList_w_IN_WH_CD(struct.getList_w_IN_WH_CD());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_w_TOTAL_STOCK_ON_HAND_QTY(struct.getList_w_TOTAL_STOCK_ON_HAND_QTY());
			this.setList_w_WH_STOCK_ON_HAND_QTY(struct.getList_w_WH_STOCK_ON_HAND_QTY());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_MANHOUR_TYP(struct.getList_w_MANHOUR_TYP());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_w_IN_WH_NAME(struct.getList_w_IN_WH_NAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_MOVE_ISSUE_WH_CD(struct.getList_MOVE_ISSUE_WH_CD());
			this.setList_MOVE_ISSUE_JOB_ODR_DETAIL_NO(struct.getList_MOVE_ISSUE_JOB_ODR_DETAIL_NO());
			this.setList_MOVE_ISSUE_JOB_ODR_CD(struct.getList_MOVE_ISSUE_JOB_ODR_CD());
			this.setList_MOVE_ISSUE_ITEM_CD(struct.getList_MOVE_ISSUE_ITEM_CD());
			this.setList_MOVE_ISSUE_PLANT_CD(struct.getList_MOVE_ISSUE_PLANT_CD());
			this.setList_MOVE_RCV_JOB_ODR_CD(struct.getList_MOVE_RCV_JOB_ODR_CD());
			this.setList_MOVE_RCV_JOB_ODR_DETAIL_NO(struct.getList_MOVE_RCV_JOB_ODR_DETAIL_NO());
			this.setList_MOVE_RCV_ITEM_CD(struct.getList_MOVE_RCV_ITEM_CD());
			this.setList_MOVE_RCV_WH_CD(struct.getList_MOVE_RCV_WH_CD());
			this.setList_MOVE_RCV_PLANT_CD(struct.getList_MOVE_RCV_PLANT_CD());
			this.setList_MOVE_ISSUE_CTRL_CD(struct.getList_MOVE_ISSUE_CTRL_CD());
			this.setList_MOVE_ISSUE_DATE(struct.getList_MOVE_ISSUE_DATE());
			this.setList_MOVE_RCV_CTRL_CD(struct.getList_MOVE_RCV_CTRL_CD());
			this.setList_MOVE_RCV_DATE(struct.getList_MOVE_RCV_DATE());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_ALLOCABLE_QTY(struct.getList_ALLOCABLE_QTY());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
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
	// �� 1 �ϐ������l�F i_h_JOB_ODR


	final static Integer i_h_JOB_ODR = null;

	// �� 2 �ϐ������l�F i_h_TRANSFER


	final static Integer i_h_TRANSFER = null;

	// �� 3 �ϐ������l�F i_c_JOB_ODR


	final static String i_c_JOB_ODR = null;

	// �� 4 �ϐ������l�F i_c_TRANSFER


	final static String i_c_TRANSFER = null;

	// �� 5 �ϐ������l�F i_NON_ALC_QTY


	final static String i_NON_ALC_QTY = null;

	// �� 6 �ϐ������l�F i_c_i_JOB_ODR


	final static String i_c_i_JOB_ODR = null;

	// �� 7 �ϐ������l�F i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// �� 8 �ϐ������l�F i_h_lotFlg


	final static String i_h_lotFlg = null;

	// �� 9 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 10 �ϐ������l�F i_w_RCV_ISSUE_CTRL_CD


	final static String i_w_RCV_ISSUE_CTRL_CD = null;

	// �� 11 �ϐ������l�F i_w_RCV_ISSUE_TYP


	final static Integer i_w_RCV_ISSUE_TYP = null;

	// �� 12 �ϐ������l�F i_w_RCV_ISSUE_GNR_TYP


	final static Integer i_w_RCV_ISSUE_GNR_TYP = null;

	// �� 13 �ϐ������l�F i_w_STOCK_UPD_TYP


	final static Integer i_w_STOCK_UPD_TYP = null;

	// �� 14 �ϐ������l�F i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// �� 15 �ϐ������l�F i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// �� 16 �ϐ������l�F i_w_PLANT_CD_check


	final static String i_w_PLANT_CD_check = null;

	// �� 17 �ϐ������l�F i_w_UNIT_QTY_TYP


	final static Integer i_w_UNIT_QTY_TYP = null;

	// �� 18 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_w_WH_CD


	final static String i_w_WH_CD = null;

	// �� 20 �ϐ������l�F i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// �� 21 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 23 �ϐ������l�F i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// �� 24 �ϐ������l�F i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// �� 25 �ϐ������l�F i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// �� 26 �ϐ������l�F i_w_CONS_TYP


	final static Integer i_w_CONS_TYP = null;

	// �� 27 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 28 �ϐ������l�F i_RCV_ISSUE_COMMENT


	final static String i_RCV_ISSUE_COMMENT = null;

	// �� 29 �ϐ������l�F i_TRANSPORT_SLIP_CD


	final static String i_TRANSPORT_SLIP_CD = null;

	// �� 30 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 31 �ϐ������l�F i_w_IN_PLANT_CD


	final static String i_w_IN_PLANT_CD = null;

	// �� 32 �ϐ������l�F i_w_IN_WH_CD


	final static String i_w_IN_WH_CD = null;

	// �� 33 �ϐ������l�F i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// �� 34 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 35 �ϐ������l�F i_w_TOTAL_STOCK_ON_HAND_QTY


	final static String i_w_TOTAL_STOCK_ON_HAND_QTY = null;

	// �� 36 �ϐ������l�F i_w_WH_STOCK_ON_HAND_QTY


	final static String i_w_WH_STOCK_ON_HAND_QTY = null;

	// �� 37 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 39 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 40 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 41 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 42 �ϐ������l�F i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// �� 43 �ϐ������l�F i_w_MANHOUR_TYP


	final static String i_w_MANHOUR_TYP = null;

	// �� 44 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 45 �ϐ������l�F i_w_IN_WH_NAME


	final static String i_w_IN_WH_NAME = null;

	// �� 46 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

	// �� 47 �ϐ������l�F i_MOVE_ISSUE_WH_CD


	final static String i_MOVE_ISSUE_WH_CD = null;

	// �� 48 �ϐ������l�F i_MOVE_ISSUE_JOB_ODR_DETAIL_NO


	final static String i_MOVE_ISSUE_JOB_ODR_DETAIL_NO = null;

	// �� 49 �ϐ������l�F i_MOVE_ISSUE_JOB_ODR_CD


	final static String i_MOVE_ISSUE_JOB_ODR_CD = null;

	// �� 50 �ϐ������l�F i_MOVE_ISSUE_ITEM_CD


	final static String i_MOVE_ISSUE_ITEM_CD = null;

	// �� 51 �ϐ������l�F i_MOVE_ISSUE_PLANT_CD


	final static String i_MOVE_ISSUE_PLANT_CD = null;

	// �� 52 �ϐ������l�F i_MOVE_RCV_JOB_ODR_CD


	final static String i_MOVE_RCV_JOB_ODR_CD = null;

	// �� 53 �ϐ������l�F i_MOVE_RCV_JOB_ODR_DETAIL_NO


	final static String i_MOVE_RCV_JOB_ODR_DETAIL_NO = null;

	// �� 54 �ϐ������l�F i_MOVE_RCV_ITEM_CD


	final static String i_MOVE_RCV_ITEM_CD = null;

	// �� 55 �ϐ������l�F i_MOVE_RCV_WH_CD


	final static String i_MOVE_RCV_WH_CD = null;

	// �� 56 �ϐ������l�F i_MOVE_RCV_PLANT_CD


	final static String i_MOVE_RCV_PLANT_CD = null;

	// �� 57 �ϐ������l�F i_MOVE_ISSUE_CTRL_CD


	final static String i_MOVE_ISSUE_CTRL_CD = null;

	// �� 58 �ϐ������l�F i_MOVE_ISSUE_DATE


	final static String i_MOVE_ISSUE_DATE = null;

	// �� 59 �ϐ������l�F i_MOVE_RCV_CTRL_CD


	final static String i_MOVE_RCV_CTRL_CD = null;

	// �� 60 �ϐ������l�F i_MOVE_RCV_DATE


	final static String i_MOVE_RCV_DATE = null;

	// �� 61 �ϐ������l�F i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// �� 62 �ϐ������l�F i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// �� 63 �ϐ������l�F i_ALLOCABLE_QTY


	final static String i_ALLOCABLE_QTY = null;

	// �� 64 �ϐ������l�F i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------
	public void initialize()
	{
		m_w_RCV_ISSUE_CTRL_CD = null;
		m_w_RCV_ISSUE_TYP = new Integer(0);
		m_ITEM_CD = null;
		m_w_PLANT_CD = null;
		m_w_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_RCV_ISSUE_QTY = new String("0.0");
		m_RCV_ISSUE_DATE = null;
		m_w_RCV_ISSUE_GNR_TYP = new Integer(0);
		m_w_STOCK_UPD_TYP = new Integer(0);
		m_VEND_LOT_NO = null;
		m_w_COMPANY_CD = null;
		m_w_VEND_CD = null;
		m_w_CONS_TYP = new Integer(0);
		m_TRANSPORT_SLIP_CD = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_w_IN_PLANT_CD = null;
		m_w_IN_WH_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_w_TOTAL_STOCK_ON_HAND_QTY = new String("0.0");
		m_w_WH_STOCK_ON_HAND_QTY = new String("0.0");
		m_STOCK_ON_HAND_QTY = new String("0.0");
		m_DEFECT_QTY = new String("0.0");
		m_ALLOCABLE_QTY = new String("0.0");
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_w_UNIT_QTY_TYP = new Integer(0);
		m_w_PLANT_CD_check = null;
		m_WH_NAME = null;
		m_w_IN_WH_NAME = null;
		m_w_PLANT_NAME = null;
		m_h_JOB_ODR = new Integer(0);
		m_h_TRANSFER = new Integer(1);
		m_NON_ALC_QTY = null;
		m_MRP_ODR_TYP = null;
		m_MRP_FLG = null;
		m_h_lotCtrl = null;
		m_LOT_NO = null;
	}

	/**
	 * �R�s�[
	 */
	public void copy(AF0050010Struct s)
	{
		clear();
		if(s.m_w_RCV_ISSUE_CTRL_CD != null) m_w_RCV_ISSUE_CTRL_CD = new String(s.m_w_RCV_ISSUE_CTRL_CD);
		if(s.m_w_RCV_ISSUE_TYP != null) m_w_RCV_ISSUE_TYP = new Integer(s.m_w_RCV_ISSUE_TYP.intValue());
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
		if(s.m_w_WH_CD != null) m_w_WH_CD = new String(s.m_w_WH_CD);
		if(s.m_LOT_NO != null) m_LOT_NO = new String(s.m_LOT_NO);
		if(s.m_h_lotCtrl != null) m_h_lotCtrl = new String(s.m_h_lotCtrl);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_RCV_ISSUE_QTY != null) m_RCV_ISSUE_QTY = new String(s.m_RCV_ISSUE_QTY);
		if(s.m_RCV_ISSUE_DATE != null) m_RCV_ISSUE_DATE = new String(s.m_RCV_ISSUE_DATE);
		if(s.m_w_RCV_ISSUE_GNR_TYP != null) m_w_RCV_ISSUE_GNR_TYP = new Integer(s.m_w_RCV_ISSUE_GNR_TYP.intValue());
		if(s.m_w_STOCK_UPD_TYP != null) m_w_STOCK_UPD_TYP = new Integer(s.m_w_STOCK_UPD_TYP.intValue());
		if(s.m_VEND_LOT_NO != null) m_VEND_LOT_NO = new String(s.m_VEND_LOT_NO);
		if(s.m_w_COMPANY_CD != null) m_w_COMPANY_CD = new String(s.m_w_COMPANY_CD);
		if(s.m_w_VEND_CD != null) m_w_VEND_CD = new String(s.m_w_VEND_CD);
		if(s.m_w_CONS_TYP != null) m_w_CONS_TYP = new Integer(s.m_w_CONS_TYP.intValue());
		if(s.m_TRANSPORT_SLIP_CD != null) m_TRANSPORT_SLIP_CD = new String(s.m_TRANSPORT_SLIP_CD);
		if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_w_IN_PLANT_CD != null) m_w_IN_PLANT_CD = new String(s.m_w_IN_PLANT_CD);
		if(s.m_w_IN_WH_CD != null) m_w_IN_WH_CD = new String(s.m_w_IN_WH_CD);
		if(s.m_BUSINESS_OPR_DATE != null) m_BUSINESS_OPR_DATE = new String(s.m_BUSINESS_OPR_DATE);
		if(s.m_w_TOTAL_STOCK_ON_HAND_QTY != null) m_w_TOTAL_STOCK_ON_HAND_QTY = new String(s.m_w_TOTAL_STOCK_ON_HAND_QTY);
		if(s.m_w_WH_STOCK_ON_HAND_QTY != null) m_w_WH_STOCK_ON_HAND_QTY = new String(s.m_w_WH_STOCK_ON_HAND_QTY);
		if(s.m_STOCK_ON_HAND_QTY != null) m_STOCK_ON_HAND_QTY = new String(s.m_STOCK_ON_HAND_QTY);
		if(s.m_DEFECT_QTY != null) m_DEFECT_QTY = new String(s.m_DEFECT_QTY);
		if(s.m_ALLOCABLE_QTY != null) m_ALLOCABLE_QTY = new String(s.m_ALLOCABLE_QTY);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
		if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
		if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
		if(s.m_w_UNIT_QTY_TYP != null) m_w_UNIT_QTY_TYP = new Integer(s.m_w_UNIT_QTY_TYP.intValue());
		if(s.m_w_PLANT_CD_check != null) m_w_PLANT_CD_check = new String(s.m_w_PLANT_CD_check);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_w_IN_WH_NAME != null) m_w_IN_WH_NAME = new String(s.m_w_IN_WH_NAME);
		if(s.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(s.m_w_PLANT_NAME);
		if(s.m_h_JOB_ODR != null) m_h_JOB_ODR = new Integer(s.m_h_JOB_ODR.intValue());
		if(s.m_h_TRANSFER != null) m_h_TRANSFER = new Integer(s.m_h_TRANSFER.intValue());
		if(s.m_NON_ALC_QTY != null) m_NON_ALC_QTY = new String(s.m_NON_ALC_QTY);
		if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
		if(s.m_MRP_FLG != null) m_MRP_FLG = new String(s.m_MRP_FLG);
		if(s.m_RCV_ISSUE_COMMENT != null) m_RCV_ISSUE_COMMENT = new String(s.m_RCV_ISSUE_COMMENT);

		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
	}

	/**
	 * �R�s�[�R���X�g���N�^
	 * @param struct �R�s�[�Ώ�
	 */
	 public AF0050010Struct(AF0050010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
