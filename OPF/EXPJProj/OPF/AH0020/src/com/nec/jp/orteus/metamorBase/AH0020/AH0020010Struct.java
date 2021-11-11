/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/src/com/nec/jp/orteus/metamorBase/AH0020/AH0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0020;

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

public class AH0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_INV_STS_TYP */
	public String m_w_INV_STS_TYP = null;
	/** �� 2 �ϐ��F m_w_MRP_FLG */
	public String m_w_MRP_FLG = null;
	/** �� 3 �ϐ��F m_w_WH_TYP */
	public String m_w_WH_TYP = null;
	/** �� 4 �ϐ��F m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** �� 5 �ϐ��F m_w_OUTSIDE_TYP */
	public String m_w_OUTSIDE_TYP = null;
	/** �� 6 �ϐ��F m_w_ABC_TYP */
	public String m_w_ABC_TYP = null;
	/** �� 7 �ϐ��F m_s_ABC_TYP_name */
	public String m_s_ABC_TYP_name = null;
	/** �� 8 �ϐ��F m_s_ABC_TYP_val */
	public String m_s_ABC_TYP_val = null;
	/** �� 9 �ϐ��F m_ERR_ADR */
	public String m_ERR_ADR = null;
	/** �� 10 �ϐ��F m_ERR_MSG */
	public String m_ERR_MSG = null;
	/** �� 11 �ϐ��F m_h_saveINV_DATE */
	public String m_h_saveINV_DATE = null;
	/** �� 12 �ϐ��F m_c_REGULAR_INV_FLG */
	public String m_c_REGULAR_INV_FLG = null;
	/** �� 13 �ϐ��F m_c_CYCLE_INV_FLG */
	public String m_c_CYCLE_INV_FLG = null;
	/** �� 14 �ϐ��F m_c_TEMP_INV_FLG */
	public String m_c_TEMP_INV_FLG = null;
	/** �� 15 �ϐ��F m_c_disp_entry_wh */
	public String m_c_disp_entry_wh = null;
	/** �� 16 �ϐ��F m_c_disp_entry_item */
	public String m_c_disp_entry_item = null;
	/** �� 17 �ϐ��F m_c_target */
	public String m_c_target = null;
	/** �� 18 �ϐ��F m_h_saveINV_STS_TYP */
	public String m_h_saveINV_STS_TYP = null;
	/** �� 19 �ϐ��F m_w_target */
	public String m_w_target = null;
	/** �� 20 �ϐ��F m_r1_inv_target */
	public String m_r1_inv_target = null;
	/** �� 21 �ϐ��F m_r2_inv_target */
	public String m_r2_inv_target = null;
	/** �� 22 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 23 �ϐ��F m_h_saveTEMP_INV_FLG */
	public String m_h_saveTEMP_INV_FLG = null;
	/** �� 24 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** �� 25 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 26 �ϐ��F m_INV_DATE */
	public String m_INV_DATE = null;
	/** �� 27 �ϐ��F m_h_REGULAR_INV_FLG */
	public String m_h_REGULAR_INV_FLG = null;
	/** �� 28 �ϐ��F m_h_CYCLE_INV_FLG */
	public String m_h_CYCLE_INV_FLG = null;
	/** �� 29 �ϐ��F m_h_TEMP_INV_FLG */
	public String m_h_TEMP_INV_FLG = null;
	/** �� 30 �ϐ��F m_h_INV_STS_TYP */
	public String m_h_INV_STS_TYP = null;
	/** �� 31 �ϐ��F m_INV_START_DATE */
	public String m_INV_START_DATE = null;
	/** �� 32 �ϐ��F m_STOCK_SAVE_DATE */
	public String m_STOCK_SAVE_DATE = null;
	/** �� 33 �ϐ��F m_INV_UPDATED_DATE */
	public String m_INV_UPDATED_DATE = null;
	/** �� 34 �ϐ��F m_INV_COMMENT */
	public String m_INV_COMMENT = null;
	/** �� 35 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 36 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 37 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 38 �ϐ��F m_INV_WH_CD */
	public String m_INV_WH_CD = null;
	/** �� 39 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 40 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** �� 41 �ϐ��F m_WH_TYP */
	public String m_WH_TYP = null;
	/** �� 42 �ϐ��F m_WH_VEND_CD */
	public String m_WH_VEND_CD = null;
	/** �� 43 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 44 �ϐ��F m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** �� 45 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 46 �ϐ��F m_INV_ITEM_CD */
	public String m_INV_ITEM_CD = null;
	/** �� 47 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 48 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 49 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 50 �ϐ��F m_ABC_TYP */
	public String m_ABC_TYP = null;
	/** �� 51 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 52 �ϐ��F m_s_ABC_TYP */
	public String m_s_ABC_TYP = null;
	/** �� 53 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 54 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 55 �ϐ��F m_CHK_PLANT_CD */
	public String m_CHK_PLANT_CD = null;
	/** �� 56 �ϐ��F m_CHK_INV_DATE */
	public String m_CHK_INV_DATE = null;
	/** �� 57 �ϐ��F m_CHK_WH_CD */
	public String m_CHK_WH_CD = null;
	/** �� 58 �ϐ��F m_CHK_ITEM_CD */
	public String m_CHK_ITEM_CD = null;
	/** �� 59 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 60 �ϐ��F m_h_disp_entry_wh */
	public String m_h_disp_entry_wh = null;
	/** �� 61 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 62 �ϐ��F m_h_disp_entry_item */
	public String m_h_disp_entry_item = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_INV_STS_TYP */
	public List l_w_INV_STS_TYP = null;

	/** �� 2 List�ϐ��F l_w_MRP_FLG */
	public List l_w_MRP_FLG = null;

	/** �� 3 List�ϐ��F l_w_WH_TYP */
	public List l_w_WH_TYP = null;

	/** �� 4 List�ϐ��F l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** �� 5 List�ϐ��F l_w_OUTSIDE_TYP */
	public List l_w_OUTSIDE_TYP = null;

	/** �� 6 List�ϐ��F l_w_ABC_TYP */
	public List l_w_ABC_TYP = null;

	/** �� 7 List�ϐ��F l_s_ABC_TYP_name */
	public List l_s_ABC_TYP_name = null;

	/** �� 8 List�ϐ��F l_s_ABC_TYP_val */
	public List l_s_ABC_TYP_val = null;

	/** �� 9 List�ϐ��F l_ERR_ADR */
	public List l_ERR_ADR = null;

	/** �� 10 List�ϐ��F l_ERR_MSG */
	public List l_ERR_MSG = null;

	/** �� 11 List�ϐ��F l_h_saveINV_DATE */
	public List l_h_saveINV_DATE = null;

	/** �� 12 List�ϐ��F l_c_REGULAR_INV_FLG */
	public List l_c_REGULAR_INV_FLG = null;

	/** �� 13 List�ϐ��F l_c_CYCLE_INV_FLG */
	public List l_c_CYCLE_INV_FLG = null;

	/** �� 14 List�ϐ��F l_c_TEMP_INV_FLG */
	public List l_c_TEMP_INV_FLG = null;

	/** �� 15 List�ϐ��F l_c_disp_entry_wh */
	public List l_c_disp_entry_wh = null;

	/** �� 16 List�ϐ��F l_c_disp_entry_item */
	public List l_c_disp_entry_item = null;

	/** �� 17 List�ϐ��F l_c_target */
	public List l_c_target = null;

	/** �� 18 List�ϐ��F l_h_saveINV_STS_TYP */
	public List l_h_saveINV_STS_TYP = null;

	/** �� 19 List�ϐ��F l_w_target */
	public List l_w_target = null;

	/** �� 20 List�ϐ��F l_r1_inv_target */
	public List l_r1_inv_target = null;

	/** �� 21 List�ϐ��F l_r2_inv_target */
	public List l_r2_inv_target = null;

	/** �� 22 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 23 List�ϐ��F l_h_saveTEMP_INV_FLG */
	public List l_h_saveTEMP_INV_FLG = null;

	/** �� 24 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** �� 25 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 26 List�ϐ��F l_INV_DATE */
	public List l_INV_DATE = null;

	/** �� 27 List�ϐ��F l_h_REGULAR_INV_FLG */
	public List l_h_REGULAR_INV_FLG = null;

	/** �� 28 List�ϐ��F l_h_CYCLE_INV_FLG */
	public List l_h_CYCLE_INV_FLG = null;

	/** �� 29 List�ϐ��F l_h_TEMP_INV_FLG */
	public List l_h_TEMP_INV_FLG = null;

	/** �� 30 List�ϐ��F l_h_INV_STS_TYP */
	public List l_h_INV_STS_TYP = null;

	/** �� 31 List�ϐ��F l_INV_START_DATE */
	public List l_INV_START_DATE = null;

	/** �� 32 List�ϐ��F l_STOCK_SAVE_DATE */
	public List l_STOCK_SAVE_DATE = null;

	/** �� 33 List�ϐ��F l_INV_UPDATED_DATE */
	public List l_INV_UPDATED_DATE = null;

	/** �� 34 List�ϐ��F l_INV_COMMENT */
	public List l_INV_COMMENT = null;

	/** �� 35 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 36 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 37 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 38 List�ϐ��F l_INV_WH_CD */
	public List l_INV_WH_CD = null;

	/** �� 39 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 40 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 41 List�ϐ��F l_WH_TYP */
	public List l_WH_TYP = null;

	/** �� 42 List�ϐ��F l_WH_VEND_CD */
	public List l_WH_VEND_CD = null;

	/** �� 43 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 44 List�ϐ��F l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** �� 45 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 46 List�ϐ��F l_INV_ITEM_CD */
	public List l_INV_ITEM_CD = null;

	/** �� 47 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 48 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 49 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 50 List�ϐ��F l_ABC_TYP */
	public List l_ABC_TYP = null;

	/** �� 51 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 52 List�ϐ��F l_s_ABC_TYP */
	public List l_s_ABC_TYP = null;

	/** �� 53 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 54 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 55 List�ϐ��F l_CHK_PLANT_CD */
	public List l_CHK_PLANT_CD = null;

	/** �� 56 List�ϐ��F l_CHK_INV_DATE */
	public List l_CHK_INV_DATE = null;

	/** �� 57 List�ϐ��F l_CHK_WH_CD */
	public List l_CHK_WH_CD = null;

	/** �� 58 List�ϐ��F l_CHK_ITEM_CD */
	public List l_CHK_ITEM_CD = null;

	/** �� 59 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 60 List�ϐ��F l_h_disp_entry_wh */
	public List l_h_disp_entry_wh = null;

	/** �� 61 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 62 List�ϐ��F l_h_disp_entry_item */
	public List l_h_disp_entry_item = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_INV_STS_TYP() { return m_w_INV_STS_TYP; }
	public String getw_MRP_FLG() { return m_w_MRP_FLG; }
	public String getw_WH_TYP() { return m_w_WH_TYP; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getw_OUTSIDE_TYP() { return m_w_OUTSIDE_TYP; }
	public String getw_ABC_TYP() { return m_w_ABC_TYP; }
	public String gets_ABC_TYP_name() { return m_s_ABC_TYP_name; }
	public String gets_ABC_TYP_val() { return m_s_ABC_TYP_val; }
	public String getERR_ADR() { return m_ERR_ADR; }
	public String getERR_MSG() { return m_ERR_MSG; }
	public String geth_saveINV_DATE() { return m_h_saveINV_DATE; }
	public String getc_REGULAR_INV_FLG() { return m_c_REGULAR_INV_FLG; }
	public String getc_CYCLE_INV_FLG() { return m_c_CYCLE_INV_FLG; }
	public String getc_TEMP_INV_FLG() { return m_c_TEMP_INV_FLG; }
	public String getc_disp_entry_wh() { return m_c_disp_entry_wh; }
	public String getc_disp_entry_item() { return m_c_disp_entry_item; }
	public String getc_target() { return m_c_target; }
	public String geth_saveINV_STS_TYP() { return m_h_saveINV_STS_TYP; }
	public String getw_target() { return m_w_target; }
	public String getr1_inv_target() { return m_r1_inv_target; }
	public String getr2_inv_target() { return m_r2_inv_target; }
	public String getFileName() { return m_FileName; }
	public String geth_saveTEMP_INV_FLG() { return m_h_saveTEMP_INV_FLG; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getINV_DATE() { return m_INV_DATE; }
	public String geth_REGULAR_INV_FLG() { return m_h_REGULAR_INV_FLG; }
	public String geth_CYCLE_INV_FLG() { return m_h_CYCLE_INV_FLG; }
	public String geth_TEMP_INV_FLG() { return m_h_TEMP_INV_FLG; }
	public String geth_INV_STS_TYP() { return m_h_INV_STS_TYP; }
	public String getINV_START_DATE() { return m_INV_START_DATE; }
	public String getSTOCK_SAVE_DATE() { return m_STOCK_SAVE_DATE; }
	public String getINV_UPDATED_DATE() { return m_INV_UPDATED_DATE; }
	public String getINV_COMMENT() { return m_INV_COMMENT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getINV_WH_CD() { return m_INV_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getWH_VEND_CD() { return m_WH_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getINV_ITEM_CD() { return m_INV_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getABC_TYP() { return m_ABC_TYP; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String gets_ABC_TYP() { return m_s_ABC_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getCHK_PLANT_CD() { return m_CHK_PLANT_CD; }
	public String getCHK_INV_DATE() { return m_CHK_INV_DATE; }
	public String getCHK_WH_CD() { return m_CHK_WH_CD; }
	public String getCHK_ITEM_CD() { return m_CHK_ITEM_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String geth_disp_entry_wh() { return m_h_disp_entry_wh; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String geth_disp_entry_item() { return m_h_disp_entry_item; }

	public List getList_w_INV_STS_TYP() { return l_w_INV_STS_TYP; }
	public List getList_w_MRP_FLG() { return l_w_MRP_FLG; }
	public List getList_w_WH_TYP() { return l_w_WH_TYP; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_w_OUTSIDE_TYP() { return l_w_OUTSIDE_TYP; }
	public List getList_w_ABC_TYP() { return l_w_ABC_TYP; }
	public List getList_s_ABC_TYP_name() { return l_s_ABC_TYP_name; }
	public List getList_s_ABC_TYP_val() { return l_s_ABC_TYP_val; }
	public List getList_ERR_ADR() { return l_ERR_ADR; }
	public List getList_ERR_MSG() { return l_ERR_MSG; }
	public List getList_h_saveINV_DATE() { return l_h_saveINV_DATE; }
	public List getList_c_REGULAR_INV_FLG() { return l_c_REGULAR_INV_FLG; }
	public List getList_c_CYCLE_INV_FLG() { return l_c_CYCLE_INV_FLG; }
	public List getList_c_TEMP_INV_FLG() { return l_c_TEMP_INV_FLG; }
	public List getList_c_disp_entry_wh() { return l_c_disp_entry_wh; }
	public List getList_c_disp_entry_item() { return l_c_disp_entry_item; }
	public List getList_c_target() { return l_c_target; }
	public List getList_h_saveINV_STS_TYP() { return l_h_saveINV_STS_TYP; }
	public List getList_w_target() { return l_w_target; }
	public List getList_r1_inv_target() { return l_r1_inv_target; }
	public List getList_r2_inv_target() { return l_r2_inv_target; }
	public List getList_FileName() { return l_FileName; }
	public List getList_h_saveTEMP_INV_FLG() { return l_h_saveTEMP_INV_FLG; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_INV_DATE() { return l_INV_DATE; }
	public List getList_h_REGULAR_INV_FLG() { return l_h_REGULAR_INV_FLG; }
	public List getList_h_CYCLE_INV_FLG() { return l_h_CYCLE_INV_FLG; }
	public List getList_h_TEMP_INV_FLG() { return l_h_TEMP_INV_FLG; }
	public List getList_h_INV_STS_TYP() { return l_h_INV_STS_TYP; }
	public List getList_INV_START_DATE() { return l_INV_START_DATE; }
	public List getList_STOCK_SAVE_DATE() { return l_STOCK_SAVE_DATE; }
	public List getList_INV_UPDATED_DATE() { return l_INV_UPDATED_DATE; }
	public List getList_INV_COMMENT() { return l_INV_COMMENT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_INV_WH_CD() { return l_INV_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_WH_VEND_CD() { return l_WH_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_INV_ITEM_CD() { return l_INV_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ABC_TYP() { return l_ABC_TYP; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_s_ABC_TYP() { return l_s_ABC_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_CHK_PLANT_CD() { return l_CHK_PLANT_CD; }
	public List getList_CHK_INV_DATE() { return l_CHK_INV_DATE; }
	public List getList_CHK_WH_CD() { return l_CHK_WH_CD; }
	public List getList_CHK_ITEM_CD() { return l_CHK_ITEM_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_h_disp_entry_wh() { return l_h_disp_entry_wh; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_h_disp_entry_item() { return l_h_disp_entry_item; }

	public void setw_INV_STS_TYP(String val) { m_w_INV_STS_TYP = val; }
	public void setw_MRP_FLG(String val) { m_w_MRP_FLG = val; }
	public void setw_WH_TYP(String val) { m_w_WH_TYP = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setw_OUTSIDE_TYP(String val) { m_w_OUTSIDE_TYP = val; }
	public void setw_ABC_TYP(String val) { m_w_ABC_TYP = val; }
	public void sets_ABC_TYP_name(String val) { m_s_ABC_TYP_name = val; }
	public void sets_ABC_TYP_val(String val) { m_s_ABC_TYP_val = val; }
	public void setERR_ADR(String val) { m_ERR_ADR = val; }
	public void setERR_MSG(String val) { m_ERR_MSG = val; }
	public void seth_saveINV_DATE(String val) { m_h_saveINV_DATE = val; }
	public void setc_REGULAR_INV_FLG(String val) { m_c_REGULAR_INV_FLG = val; }
	public void setc_CYCLE_INV_FLG(String val) { m_c_CYCLE_INV_FLG = val; }
	public void setc_TEMP_INV_FLG(String val) { m_c_TEMP_INV_FLG = val; }
	public void setc_disp_entry_wh(String val) { m_c_disp_entry_wh = val; }
	public void setc_disp_entry_item(String val) { m_c_disp_entry_item = val; }
	public void setc_target(String val) { m_c_target = val; }
	public void seth_saveINV_STS_TYP(String val) { m_h_saveINV_STS_TYP = val; }
	public void setw_target(String val) { m_w_target = val; }
	public void setr1_inv_target(String val) { m_r1_inv_target = val; }
	public void setr2_inv_target(String val) { m_r2_inv_target = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void seth_saveTEMP_INV_FLG(String val) { m_h_saveTEMP_INV_FLG = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void seth_REGULAR_INV_FLG(String val) { m_h_REGULAR_INV_FLG = val; }
	public void seth_CYCLE_INV_FLG(String val) { m_h_CYCLE_INV_FLG = val; }
	public void seth_TEMP_INV_FLG(String val) { m_h_TEMP_INV_FLG = val; }
	public void seth_INV_STS_TYP(String val) { m_h_INV_STS_TYP = val; }
	public void setINV_START_DATE(String val) { m_INV_START_DATE = val; }
	public void setSTOCK_SAVE_DATE(String val) { m_STOCK_SAVE_DATE = val; }
	public void setINV_UPDATED_DATE(String val) { m_INV_UPDATED_DATE = val; }
	public void setINV_COMMENT(String val) { m_INV_COMMENT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setINV_WH_CD(String val) { m_INV_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setWH_VEND_CD(String val) { m_WH_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setINV_ITEM_CD(String val) { m_INV_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setABC_TYP(String val) { m_ABC_TYP = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void sets_ABC_TYP(String val) { m_s_ABC_TYP = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setCHK_PLANT_CD(String val) { m_CHK_PLANT_CD = val; }
	public void setCHK_INV_DATE(String val) { m_CHK_INV_DATE = val; }
	public void setCHK_WH_CD(String val) { m_CHK_WH_CD = val; }
	public void setCHK_ITEM_CD(String val) { m_CHK_ITEM_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void seth_disp_entry_wh(String val) { m_h_disp_entry_wh = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void seth_disp_entry_item(String val) { m_h_disp_entry_item = val; }


	public void setList_w_INV_STS_TYP(List list) { l_w_INV_STS_TYP = list; }
	public void setList_w_MRP_FLG(List list) { l_w_MRP_FLG = list; }
	public void setList_w_WH_TYP(List list) { l_w_WH_TYP = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_w_OUTSIDE_TYP(List list) { l_w_OUTSIDE_TYP = list; }
	public void setList_w_ABC_TYP(List list) { l_w_ABC_TYP = list; }
	public void setList_s_ABC_TYP_name(List list) { l_s_ABC_TYP_name = list; }
	public void setList_s_ABC_TYP_val(List list) { l_s_ABC_TYP_val = list; }
	public void setList_ERR_ADR(List list) { l_ERR_ADR = list; }
	public void setList_ERR_MSG(List list) { l_ERR_MSG = list; }
	public void setList_h_saveINV_DATE(List list) { l_h_saveINV_DATE = list; }
	public void setList_c_REGULAR_INV_FLG(List list) { l_c_REGULAR_INV_FLG = list; }
	public void setList_c_CYCLE_INV_FLG(List list) { l_c_CYCLE_INV_FLG = list; }
	public void setList_c_TEMP_INV_FLG(List list) { l_c_TEMP_INV_FLG = list; }
	public void setList_c_disp_entry_wh(List list) { l_c_disp_entry_wh = list; }
	public void setList_c_disp_entry_item(List list) { l_c_disp_entry_item = list; }
	public void setList_c_target(List list) { l_c_target = list; }
	public void setList_h_saveINV_STS_TYP(List list) { l_h_saveINV_STS_TYP = list; }
	public void setList_w_target(List list) { l_w_target = list; }
	public void setList_r1_inv_target(List list) { l_r1_inv_target = list; }
	public void setList_r2_inv_target(List list) { l_r2_inv_target = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_h_saveTEMP_INV_FLG(List list) { l_h_saveTEMP_INV_FLG = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_INV_DATE(List list) { l_INV_DATE = list; }
	public void setList_h_REGULAR_INV_FLG(List list) { l_h_REGULAR_INV_FLG = list; }
	public void setList_h_CYCLE_INV_FLG(List list) { l_h_CYCLE_INV_FLG = list; }
	public void setList_h_TEMP_INV_FLG(List list) { l_h_TEMP_INV_FLG = list; }
	public void setList_h_INV_STS_TYP(List list) { l_h_INV_STS_TYP = list; }
	public void setList_INV_START_DATE(List list) { l_INV_START_DATE = list; }
	public void setList_STOCK_SAVE_DATE(List list) { l_STOCK_SAVE_DATE = list; }
	public void setList_INV_UPDATED_DATE(List list) { l_INV_UPDATED_DATE = list; }
	public void setList_INV_COMMENT(List list) { l_INV_COMMENT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_INV_WH_CD(List list) { l_INV_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_WH_VEND_CD(List list) { l_WH_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_INV_ITEM_CD(List list) { l_INV_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ABC_TYP(List list) { l_ABC_TYP = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_s_ABC_TYP(List list) { l_s_ABC_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_CHK_PLANT_CD(List list) { l_CHK_PLANT_CD = list; }
	public void setList_CHK_INV_DATE(List list) { l_CHK_INV_DATE = list; }
	public void setList_CHK_WH_CD(List list) { l_CHK_WH_CD = list; }
	public void setList_CHK_ITEM_CD(List list) { l_CHK_ITEM_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_h_disp_entry_wh(List list) { l_h_disp_entry_wh = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_h_disp_entry_item(List list) { l_h_disp_entry_item = list; }

	public int setL2L_w_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INV_STS_TYP == null) {
			l_w_INV_STS_TYP = new ArrayList();
		} else {
			l_w_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INV_STS_TYP.add(((AH0020010Struct) list.get(i)).getw_INV_STS_TYP());
		}
		return size;
	}
	public int setL2L_w_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_FLG == null) {
			l_w_MRP_FLG = new ArrayList();
		} else {
			l_w_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_FLG.add(((AH0020010Struct) list.get(i)).getw_MRP_FLG());
		}
		return size;
	}
	public int setL2L_w_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_TYP == null) {
			l_w_WH_TYP = new ArrayList();
		} else {
			l_w_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_TYP.add(((AH0020010Struct) list.get(i)).getw_WH_TYP());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP == null) {
			l_w_MRP_ODR_TYP = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP.add(((AH0020010Struct) list.get(i)).getw_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP == null) {
			l_w_OUTSIDE_TYP = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP.add(((AH0020010Struct) list.get(i)).getw_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_w_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ABC_TYP == null) {
			l_w_ABC_TYP = new ArrayList();
		} else {
			l_w_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ABC_TYP.add(((AH0020010Struct) list.get(i)).getw_ABC_TYP());
		}
		return size;
	}
	public int setL2L_s_ABC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ABC_TYP_name == null) {
			l_s_ABC_TYP_name = new ArrayList();
		} else {
			l_s_ABC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ABC_TYP_name.add(((AH0020010Struct) list.get(i)).gets_ABC_TYP_name());
		}
		return size;
	}
	public int setL2L_s_ABC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ABC_TYP_val == null) {
			l_s_ABC_TYP_val = new ArrayList();
		} else {
			l_s_ABC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ABC_TYP_val.add(((AH0020010Struct) list.get(i)).gets_ABC_TYP_val());
		}
		return size;
	}
	public int setL2L_ERR_ADR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_ADR == null) {
			l_ERR_ADR = new ArrayList();
		} else {
			l_ERR_ADR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_ADR.add(((AH0020010Struct) list.get(i)).getERR_ADR());
		}
		return size;
	}
	public int setL2L_ERR_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_MSG == null) {
			l_ERR_MSG = new ArrayList();
		} else {
			l_ERR_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_MSG.add(((AH0020010Struct) list.get(i)).getERR_MSG());
		}
		return size;
	}
	public int setL2L_h_saveINV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_saveINV_DATE == null) {
			l_h_saveINV_DATE = new ArrayList();
		} else {
			l_h_saveINV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_saveINV_DATE.add(((AH0020010Struct) list.get(i)).geth_saveINV_DATE());
		}
		return size;
	}
	public int setL2L_c_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_REGULAR_INV_FLG == null) {
			l_c_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_c_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_REGULAR_INV_FLG.add(((AH0020010Struct) list.get(i)).getc_REGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_c_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CYCLE_INV_FLG == null) {
			l_c_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_c_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CYCLE_INV_FLG.add(((AH0020010Struct) list.get(i)).getc_CYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_c_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_TEMP_INV_FLG == null) {
			l_c_TEMP_INV_FLG = new ArrayList();
		} else {
			l_c_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_TEMP_INV_FLG.add(((AH0020010Struct) list.get(i)).getc_TEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_c_disp_entry_wh(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_disp_entry_wh == null) {
			l_c_disp_entry_wh = new ArrayList();
		} else {
			l_c_disp_entry_wh.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_disp_entry_wh.add(((AH0020010Struct) list.get(i)).getc_disp_entry_wh());
		}
		return size;
	}
	public int setL2L_c_disp_entry_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_disp_entry_item == null) {
			l_c_disp_entry_item = new ArrayList();
		} else {
			l_c_disp_entry_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_disp_entry_item.add(((AH0020010Struct) list.get(i)).getc_disp_entry_item());
		}
		return size;
	}
	public int setL2L_c_target(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_target == null) {
			l_c_target = new ArrayList();
		} else {
			l_c_target.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_target.add(((AH0020010Struct) list.get(i)).getc_target());
		}
		return size;
	}
	public int setL2L_h_saveINV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_saveINV_STS_TYP == null) {
			l_h_saveINV_STS_TYP = new ArrayList();
		} else {
			l_h_saveINV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_saveINV_STS_TYP.add(((AH0020010Struct) list.get(i)).geth_saveINV_STS_TYP());
		}
		return size;
	}
	public int setL2L_w_target(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_target == null) {
			l_w_target = new ArrayList();
		} else {
			l_w_target.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_target.add(((AH0020010Struct) list.get(i)).getw_target());
		}
		return size;
	}
	public int setL2L_r1_inv_target(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_inv_target == null) {
			l_r1_inv_target = new ArrayList();
		} else {
			l_r1_inv_target.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_inv_target.add(((AH0020010Struct) list.get(i)).getr1_inv_target());
		}
		return size;
	}
	public int setL2L_r2_inv_target(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_inv_target == null) {
			l_r2_inv_target = new ArrayList();
		} else {
			l_r2_inv_target.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_inv_target.add(((AH0020010Struct) list.get(i)).getr2_inv_target());
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
			l_FileName.add(((AH0020010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_h_saveTEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_saveTEMP_INV_FLG == null) {
			l_h_saveTEMP_INV_FLG = new ArrayList();
		} else {
			l_h_saveTEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_saveTEMP_INV_FLG.add(((AH0020010Struct) list.get(i)).geth_saveTEMP_INV_FLG());
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
			l_w_COLUMN_FLG.add(((AH0020010Struct) list.get(i)).getw_COLUMN_FLG());
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
			l_PLANT_CD.add(((AH0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_INV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_DATE == null) {
			l_INV_DATE = new ArrayList();
		} else {
			l_INV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_DATE.add(((AH0020010Struct) list.get(i)).getINV_DATE());
		}
		return size;
	}
	public int setL2L_h_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REGULAR_INV_FLG == null) {
			l_h_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_h_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REGULAR_INV_FLG.add(((AH0020010Struct) list.get(i)).geth_REGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_h_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CYCLE_INV_FLG == null) {
			l_h_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_h_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CYCLE_INV_FLG.add(((AH0020010Struct) list.get(i)).geth_CYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_h_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TEMP_INV_FLG == null) {
			l_h_TEMP_INV_FLG = new ArrayList();
		} else {
			l_h_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TEMP_INV_FLG.add(((AH0020010Struct) list.get(i)).geth_TEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_h_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_STS_TYP == null) {
			l_h_INV_STS_TYP = new ArrayList();
		} else {
			l_h_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_STS_TYP.add(((AH0020010Struct) list.get(i)).geth_INV_STS_TYP());
		}
		return size;
	}
	public int setL2L_INV_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_START_DATE == null) {
			l_INV_START_DATE = new ArrayList();
		} else {
			l_INV_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_START_DATE.add(((AH0020010Struct) list.get(i)).getINV_START_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_SAVE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_SAVE_DATE == null) {
			l_STOCK_SAVE_DATE = new ArrayList();
		} else {
			l_STOCK_SAVE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_SAVE_DATE.add(((AH0020010Struct) list.get(i)).getSTOCK_SAVE_DATE());
		}
		return size;
	}
	public int setL2L_INV_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_UPDATED_DATE == null) {
			l_INV_UPDATED_DATE = new ArrayList();
		} else {
			l_INV_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_UPDATED_DATE.add(((AH0020010Struct) list.get(i)).getINV_UPDATED_DATE());
		}
		return size;
	}
	public int setL2L_INV_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_COMMENT == null) {
			l_INV_COMMENT = new ArrayList();
		} else {
			l_INV_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_COMMENT.add(((AH0020010Struct) list.get(i)).getINV_COMMENT());
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
			l_MODIFY_COUNT.add(((AH0020010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_BUSINESS_OPR_DATE.add(((AH0020010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_WH_CD.add(((AH0020010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_INV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_WH_CD == null) {
			l_INV_WH_CD = new ArrayList();
		} else {
			l_INV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_WH_CD.add(((AH0020010Struct) list.get(i)).getINV_WH_CD());
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
			l_WH_NAME.add(((AH0020010Struct) list.get(i)).getWH_NAME());
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
			l_MRP_FLG.add(((AH0020010Struct) list.get(i)).getMRP_FLG());
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
			l_WH_TYP.add(((AH0020010Struct) list.get(i)).getWH_TYP());
		}
		return size;
	}
	public int setL2L_WH_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_VEND_CD == null) {
			l_WH_VEND_CD = new ArrayList();
		} else {
			l_WH_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_VEND_CD.add(((AH0020010Struct) list.get(i)).getWH_VEND_CD());
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
			l_VEND_ANAME.add(((AH0020010Struct) list.get(i)).getVEND_ANAME());
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
			l_w_WH_CD.add(((AH0020010Struct) list.get(i)).getw_WH_CD());
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
			l_ITEM_CD.add(((AH0020010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_INV_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_ITEM_CD == null) {
			l_INV_ITEM_CD = new ArrayList();
		} else {
			l_INV_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_ITEM_CD.add(((AH0020010Struct) list.get(i)).getINV_ITEM_CD());
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
			l_ITEM_NAME.add(((AH0020010Struct) list.get(i)).getITEM_NAME());
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
			l_MRP_ODR_TYP.add(((AH0020010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AH0020010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_ABC_TYP.add(((AH0020010Struct) list.get(i)).getABC_TYP());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AH0020010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_s_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ABC_TYP == null) {
			l_s_ABC_TYP = new ArrayList();
		} else {
			l_s_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ABC_TYP.add(((AH0020010Struct) list.get(i)).gets_ABC_TYP());
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
			l_UNIT_QTY_TYP.add(((AH0020010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AH0020010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_CHK_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHK_PLANT_CD == null) {
			l_CHK_PLANT_CD = new ArrayList();
		} else {
			l_CHK_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHK_PLANT_CD.add(((AH0020010Struct) list.get(i)).getCHK_PLANT_CD());
		}
		return size;
	}
	public int setL2L_CHK_INV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHK_INV_DATE == null) {
			l_CHK_INV_DATE = new ArrayList();
		} else {
			l_CHK_INV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHK_INV_DATE.add(((AH0020010Struct) list.get(i)).getCHK_INV_DATE());
		}
		return size;
	}
	public int setL2L_CHK_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHK_WH_CD == null) {
			l_CHK_WH_CD = new ArrayList();
		} else {
			l_CHK_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHK_WH_CD.add(((AH0020010Struct) list.get(i)).getCHK_WH_CD());
		}
		return size;
	}
	public int setL2L_CHK_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHK_ITEM_CD == null) {
			l_CHK_ITEM_CD = new ArrayList();
		} else {
			l_CHK_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHK_ITEM_CD.add(((AH0020010Struct) list.get(i)).getCHK_ITEM_CD());
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
			l_l_COUNT.add(((AH0020010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_h_disp_entry_wh(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_disp_entry_wh == null) {
			l_h_disp_entry_wh = new ArrayList();
		} else {
			l_h_disp_entry_wh.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_disp_entry_wh.add(((AH0020010Struct) list.get(i)).geth_disp_entry_wh());
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
			l_ROW_COUNT.add(((AH0020010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_h_disp_entry_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_disp_entry_item == null) {
			l_h_disp_entry_item = new ArrayList();
		} else {
			l_h_disp_entry_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_disp_entry_item.add(((AH0020010Struct) list.get(i)).geth_disp_entry_item());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_INV_STS_TYP = null;
		m_w_MRP_FLG = null;
		m_w_WH_TYP = null;
		m_w_MRP_ODR_TYP = null;
		m_w_OUTSIDE_TYP = null;
		m_w_ABC_TYP = null;
		m_s_ABC_TYP_name = null;
		m_s_ABC_TYP_val = null;
		m_ERR_ADR = null;
		m_ERR_MSG = null;
		m_h_saveINV_DATE = null;
		m_c_REGULAR_INV_FLG = null;
		m_c_CYCLE_INV_FLG = null;
		m_c_TEMP_INV_FLG = null;
		m_c_disp_entry_wh = null;
		m_c_disp_entry_item = null;
		m_c_target = null;
		m_h_saveINV_STS_TYP = null;
		m_w_target = null;
		m_r1_inv_target = null;
		m_r2_inv_target = null;
		m_FileName = null;
		m_h_saveTEMP_INV_FLG = null;
		m_w_COLUMN_FLG = null;
		m_PLANT_CD = null;
		m_INV_DATE = null;
		m_h_REGULAR_INV_FLG = null;
		m_h_CYCLE_INV_FLG = null;
		m_h_TEMP_INV_FLG = null;
		m_h_INV_STS_TYP = null;
		m_INV_START_DATE = null;
		m_STOCK_SAVE_DATE = null;
		m_INV_UPDATED_DATE = null;
		m_INV_COMMENT = null;
		m_MODIFY_COUNT = null;
		m_BUSINESS_OPR_DATE = null;
		m_WH_CD = null;
		m_INV_WH_CD = null;
		m_WH_NAME = null;
		m_MRP_FLG = null;
		m_WH_TYP = null;
		m_WH_VEND_CD = null;
		m_VEND_ANAME = null;
		m_w_WH_CD = null;
		m_ITEM_CD = null;
		m_INV_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ABC_TYP = null;
		m_w_ITEM_CD = null;
		m_s_ABC_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_CHK_PLANT_CD = null;
		m_CHK_INV_DATE = null;
		m_CHK_WH_CD = null;
		m_CHK_ITEM_CD = null;
		m_l_COUNT = null;
		m_h_disp_entry_wh = null;
		m_ROW_COUNT = null;
		m_h_disp_entry_item = null;

		l_w_INV_STS_TYP = null;
		l_w_MRP_FLG = null;
		l_w_WH_TYP = null;
		l_w_MRP_ODR_TYP = null;
		l_w_OUTSIDE_TYP = null;
		l_w_ABC_TYP = null;
		l_s_ABC_TYP_name = null;
		l_s_ABC_TYP_val = null;
		l_ERR_ADR = null;
		l_ERR_MSG = null;
		l_h_saveINV_DATE = null;
		l_c_REGULAR_INV_FLG = null;
		l_c_CYCLE_INV_FLG = null;
		l_c_TEMP_INV_FLG = null;
		l_c_disp_entry_wh = null;
		l_c_disp_entry_item = null;
		l_c_target = null;
		l_h_saveINV_STS_TYP = null;
		l_w_target = null;
		l_r1_inv_target = null;
		l_r2_inv_target = null;
		l_FileName = null;
		l_h_saveTEMP_INV_FLG = null;
		l_w_COLUMN_FLG = null;
		l_PLANT_CD = null;
		l_INV_DATE = null;
		l_h_REGULAR_INV_FLG = null;
		l_h_CYCLE_INV_FLG = null;
		l_h_TEMP_INV_FLG = null;
		l_h_INV_STS_TYP = null;
		l_INV_START_DATE = null;
		l_STOCK_SAVE_DATE = null;
		l_INV_UPDATED_DATE = null;
		l_INV_COMMENT = null;
		l_MODIFY_COUNT = null;
		l_BUSINESS_OPR_DATE = null;
		l_WH_CD = null;
		l_INV_WH_CD = null;
		l_WH_NAME = null;
		l_MRP_FLG = null;
		l_WH_TYP = null;
		l_WH_VEND_CD = null;
		l_VEND_ANAME = null;
		l_w_WH_CD = null;
		l_ITEM_CD = null;
		l_INV_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_ABC_TYP = null;
		l_w_ITEM_CD = null;
		l_s_ABC_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_CHK_PLANT_CD = null;
		l_CHK_INV_DATE = null;
		l_CHK_WH_CD = null;
		l_CHK_ITEM_CD = null;
		l_l_COUNT = null;
		l_h_disp_entry_wh = null;
		l_ROW_COUNT = null;
		l_h_disp_entry_item = null;

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
	 * medAH0020010�N���X�̕W���R���X�g���N�^
	 */
	public AH0020010Struct()
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
	public void setStruct(AH0020010Struct struct)
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
	public void setStructM(AH0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_INV_STS_TYP(struct.getw_INV_STS_TYP());
			this.setw_MRP_FLG(struct.getw_MRP_FLG());
			this.setw_WH_TYP(struct.getw_WH_TYP());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setw_OUTSIDE_TYP(struct.getw_OUTSIDE_TYP());
			this.setw_ABC_TYP(struct.getw_ABC_TYP());
			this.sets_ABC_TYP_name(struct.gets_ABC_TYP_name());
			this.sets_ABC_TYP_val(struct.gets_ABC_TYP_val());
			this.setERR_ADR(struct.getERR_ADR());
			this.setERR_MSG(struct.getERR_MSG());
			this.seth_saveINV_DATE(struct.geth_saveINV_DATE());
			this.setc_REGULAR_INV_FLG(struct.getc_REGULAR_INV_FLG());
			this.setc_CYCLE_INV_FLG(struct.getc_CYCLE_INV_FLG());
			this.setc_TEMP_INV_FLG(struct.getc_TEMP_INV_FLG());
			this.setc_disp_entry_wh(struct.getc_disp_entry_wh());
			this.setc_disp_entry_item(struct.getc_disp_entry_item());
			this.setc_target(struct.getc_target());
			this.seth_saveINV_STS_TYP(struct.geth_saveINV_STS_TYP());
			this.setw_target(struct.getw_target());
			this.setr1_inv_target(struct.getr1_inv_target());
			this.setr2_inv_target(struct.getr2_inv_target());
			this.setFileName(struct.getFileName());
			this.seth_saveTEMP_INV_FLG(struct.geth_saveTEMP_INV_FLG());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setINV_DATE(struct.getINV_DATE());
			this.seth_REGULAR_INV_FLG(struct.geth_REGULAR_INV_FLG());
			this.seth_CYCLE_INV_FLG(struct.geth_CYCLE_INV_FLG());
			this.seth_TEMP_INV_FLG(struct.geth_TEMP_INV_FLG());
			this.seth_INV_STS_TYP(struct.geth_INV_STS_TYP());
			this.setINV_START_DATE(struct.getINV_START_DATE());
			this.setSTOCK_SAVE_DATE(struct.getSTOCK_SAVE_DATE());
			this.setINV_UPDATED_DATE(struct.getINV_UPDATED_DATE());
			this.setINV_COMMENT(struct.getINV_COMMENT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setWH_CD(struct.getWH_CD());
			this.setINV_WH_CD(struct.getINV_WH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setWH_TYP(struct.getWH_TYP());
			this.setWH_VEND_CD(struct.getWH_VEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setINV_ITEM_CD(struct.getINV_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setABC_TYP(struct.getABC_TYP());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.sets_ABC_TYP(struct.gets_ABC_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setCHK_PLANT_CD(struct.getCHK_PLANT_CD());
			this.setCHK_INV_DATE(struct.getCHK_INV_DATE());
			this.setCHK_WH_CD(struct.getCHK_WH_CD());
			this.setCHK_ITEM_CD(struct.getCHK_ITEM_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.seth_disp_entry_wh(struct.geth_disp_entry_wh());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.seth_disp_entry_item(struct.geth_disp_entry_item());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_INV_STS_TYP(struct.getList_w_INV_STS_TYP());
			this.setList_w_MRP_FLG(struct.getList_w_MRP_FLG());
			this.setList_w_WH_TYP(struct.getList_w_WH_TYP());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_w_OUTSIDE_TYP(struct.getList_w_OUTSIDE_TYP());
			this.setList_w_ABC_TYP(struct.getList_w_ABC_TYP());
			this.setList_s_ABC_TYP_name(struct.getList_s_ABC_TYP_name());
			this.setList_s_ABC_TYP_val(struct.getList_s_ABC_TYP_val());
			this.setList_ERR_ADR(struct.getList_ERR_ADR());
			this.setList_ERR_MSG(struct.getList_ERR_MSG());
			this.setList_h_saveINV_DATE(struct.getList_h_saveINV_DATE());
			this.setList_c_REGULAR_INV_FLG(struct.getList_c_REGULAR_INV_FLG());
			this.setList_c_CYCLE_INV_FLG(struct.getList_c_CYCLE_INV_FLG());
			this.setList_c_TEMP_INV_FLG(struct.getList_c_TEMP_INV_FLG());
			this.setList_c_disp_entry_wh(struct.getList_c_disp_entry_wh());
			this.setList_c_disp_entry_item(struct.getList_c_disp_entry_item());
			this.setList_c_target(struct.getList_c_target());
			this.setList_h_saveINV_STS_TYP(struct.getList_h_saveINV_STS_TYP());
			this.setList_w_target(struct.getList_w_target());
			this.setList_r1_inv_target(struct.getList_r1_inv_target());
			this.setList_r2_inv_target(struct.getList_r2_inv_target());
			this.setList_FileName(struct.getList_FileName());
			this.setList_h_saveTEMP_INV_FLG(struct.getList_h_saveTEMP_INV_FLG());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_INV_DATE(struct.getList_INV_DATE());
			this.setList_h_REGULAR_INV_FLG(struct.getList_h_REGULAR_INV_FLG());
			this.setList_h_CYCLE_INV_FLG(struct.getList_h_CYCLE_INV_FLG());
			this.setList_h_TEMP_INV_FLG(struct.getList_h_TEMP_INV_FLG());
			this.setList_h_INV_STS_TYP(struct.getList_h_INV_STS_TYP());
			this.setList_INV_START_DATE(struct.getList_INV_START_DATE());
			this.setList_STOCK_SAVE_DATE(struct.getList_STOCK_SAVE_DATE());
			this.setList_INV_UPDATED_DATE(struct.getList_INV_UPDATED_DATE());
			this.setList_INV_COMMENT(struct.getList_INV_COMMENT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_INV_WH_CD(struct.getList_INV_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_WH_VEND_CD(struct.getList_WH_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_INV_ITEM_CD(struct.getList_INV_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ABC_TYP(struct.getList_ABC_TYP());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_s_ABC_TYP(struct.getList_s_ABC_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_CHK_PLANT_CD(struct.getList_CHK_PLANT_CD());
			this.setList_CHK_INV_DATE(struct.getList_CHK_INV_DATE());
			this.setList_CHK_WH_CD(struct.getList_CHK_WH_CD());
			this.setList_CHK_ITEM_CD(struct.getList_CHK_ITEM_CD());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_h_disp_entry_wh(struct.getList_h_disp_entry_wh());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_h_disp_entry_item(struct.getList_h_disp_entry_item());
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
	// �� 1 �ϐ������l�F i_w_INV_STS_TYP


	final static String i_w_INV_STS_TYP = null;

	// �� 2 �ϐ������l�F i_w_MRP_FLG


	final static String i_w_MRP_FLG = null;

	// �� 3 �ϐ������l�F i_w_WH_TYP


	final static String i_w_WH_TYP = null;

	// �� 4 �ϐ������l�F i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// �� 5 �ϐ������l�F i_w_OUTSIDE_TYP


	final static String i_w_OUTSIDE_TYP = null;

	// �� 6 �ϐ������l�F i_w_ABC_TYP


	final static String i_w_ABC_TYP = null;

	// �� 7 �ϐ������l�F i_s_ABC_TYP_name


	final static String i_s_ABC_TYP_name = null;

	// �� 8 �ϐ������l�F i_s_ABC_TYP_val


	final static String i_s_ABC_TYP_val = null;

	// �� 9 �ϐ������l�F i_ERR_ADR


	final static String i_ERR_ADR = null;

	// �� 10 �ϐ������l�F i_ERR_MSG


	final static String i_ERR_MSG = null;

	// �� 11 �ϐ������l�F i_h_saveINV_DATE


	final static String i_h_saveINV_DATE = null;

	// �� 12 �ϐ������l�F i_c_REGULAR_INV_FLG


	final static String i_c_REGULAR_INV_FLG = null;

	// �� 13 �ϐ������l�F i_c_CYCLE_INV_FLG


	final static String i_c_CYCLE_INV_FLG = null;

	// �� 14 �ϐ������l�F i_c_TEMP_INV_FLG


	final static String i_c_TEMP_INV_FLG = null;

	// �� 15 �ϐ������l�F i_c_disp_entry_wh


	final static String i_c_disp_entry_wh = null;

	// �� 16 �ϐ������l�F i_c_disp_entry_item


	final static String i_c_disp_entry_item = null;

	// �� 17 �ϐ������l�F i_c_target


	final static String i_c_target = null;

	// �� 18 �ϐ������l�F i_h_saveINV_STS_TYP


	final static String i_h_saveINV_STS_TYP = null;

	// �� 19 �ϐ������l�F i_w_target


	final static String i_w_target = null;

	// �� 20 �ϐ������l�F i_r1_inv_target


	final static String i_r1_inv_target = null;

	// �� 21 �ϐ������l�F i_r2_inv_target


	final static String i_r2_inv_target = null;

	// �� 22 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 23 �ϐ������l�F i_h_saveTEMP_INV_FLG


	final static String i_h_saveTEMP_INV_FLG = null;

	// �� 24 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// �� 25 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 26 �ϐ������l�F i_INV_DATE


	final static String i_INV_DATE = null;

	// �� 27 �ϐ������l�F i_h_REGULAR_INV_FLG


	final static String i_h_REGULAR_INV_FLG = null;

	// �� 28 �ϐ������l�F i_h_CYCLE_INV_FLG


	final static String i_h_CYCLE_INV_FLG = null;

	// �� 29 �ϐ������l�F i_h_TEMP_INV_FLG


	final static String i_h_TEMP_INV_FLG = null;

	// �� 30 �ϐ������l�F i_h_INV_STS_TYP


	final static String i_h_INV_STS_TYP = null;

	// �� 31 �ϐ������l�F i_INV_START_DATE


	final static String i_INV_START_DATE = null;

	// �� 32 �ϐ������l�F i_STOCK_SAVE_DATE


	final static String i_STOCK_SAVE_DATE = null;

	// �� 33 �ϐ������l�F i_INV_UPDATED_DATE


	final static String i_INV_UPDATED_DATE = null;

	// �� 34 �ϐ������l�F i_INV_COMMENT


	final static String i_INV_COMMENT = null;

	// �� 35 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 36 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 37 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 38 �ϐ������l�F i_INV_WH_CD


	final static String i_INV_WH_CD = null;

	// �� 39 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 40 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

	// �� 41 �ϐ������l�F i_WH_TYP


	final static String i_WH_TYP = null;

	// �� 42 �ϐ������l�F i_WH_VEND_CD


	final static String i_WH_VEND_CD = null;

	// �� 43 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 44 �ϐ������l�F i_w_WH_CD


	final static String i_w_WH_CD = null;

	// �� 45 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 46 �ϐ������l�F i_INV_ITEM_CD


	final static String i_INV_ITEM_CD = null;

	// �� 47 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 48 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 49 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 50 �ϐ������l�F i_ABC_TYP


	final static String i_ABC_TYP = null;

	// �� 51 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 52 �ϐ������l�F i_s_ABC_TYP


	final static String i_s_ABC_TYP = null;

	// �� 53 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 54 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 55 �ϐ������l�F i_CHK_PLANT_CD


	final static String i_CHK_PLANT_CD = null;

	// �� 56 �ϐ������l�F i_CHK_INV_DATE


	final static String i_CHK_INV_DATE = null;

	// �� 57 �ϐ������l�F i_CHK_WH_CD


	final static String i_CHK_WH_CD = null;

	// �� 58 �ϐ������l�F i_CHK_ITEM_CD


	final static String i_CHK_ITEM_CD = null;

	// �� 59 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 60 �ϐ������l�F i_h_disp_entry_wh


	final static String i_h_disp_entry_wh = null;

	// �� 61 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 62 �ϐ������l�F i_h_disp_entry_item


	final static String i_h_disp_entry_item = null;

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
         m_h_REGULAR_INV_FLG = "0";	// ����I��
         m_h_CYCLE_INV_FLG ="0";		// �z�I��
         m_h_TEMP_INV_FLG ="0";		// �Վ��I��
         m_h_INV_STS_TYP = "0";		// �o�^�A�X�V�A�폜�{�^���S�Ă�\�����邽��
        }
       
        /**
         * �T�u1��ʏ����l�ݒ�
         *
         * @param �Ȃ�
         */
        public void initializeSub1()
        {
         clear();
         m_h_disp_entry_wh = "0";	// �u�o�^�ς݂̂ݕ\���v�`�F�b�NOFF�ŏ�����
        }
       
        /**
         * �T�u2��ʏ����l�ݒ�
         *
         * @param �Ȃ�
         */
        public void initializeSub2()
        {
         clear();
         m_h_disp_entry_item = "0";	// �u�o�^�ς݂̂ݕ\���v�`�F�b�NOFF�ŏ�����
        }
       
        /**
         * �������ϐ��̃R�s�[
         * @param s �R�s�[��
         */
        public void copy(AH0020010Struct s)
        {
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
         if(s.m_h_REGULAR_INV_FLG != null) m_h_REGULAR_INV_FLG = new String(s.m_h_REGULAR_INV_FLG);
         if(s.m_h_CYCLE_INV_FLG != null) m_h_CYCLE_INV_FLG = new String(s.m_h_CYCLE_INV_FLG);
         if(s.m_h_TEMP_INV_FLG != null) m_h_TEMP_INV_FLG = new String(s.m_h_TEMP_INV_FLG);
         if(s.m_h_INV_STS_TYP != null) m_h_INV_STS_TYP = new String(s.m_h_INV_STS_TYP);
         if(s.m_INV_START_DATE != null) m_INV_START_DATE = new String(s.m_INV_START_DATE);
         if(s.m_STOCK_SAVE_DATE != null) m_STOCK_SAVE_DATE = new String(s.m_STOCK_SAVE_DATE);
         if(s.m_INV_UPDATED_DATE != null) m_INV_UPDATED_DATE = new String(s.m_INV_UPDATED_DATE);
         if(s.m_INV_COMMENT != null) m_INV_COMMENT = new String(s.m_INV_COMMENT);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_BUSINESS_OPR_DATE != null) m_BUSINESS_OPR_DATE = new String(s.m_BUSINESS_OPR_DATE);
         if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
         if(s.m_INV_WH_CD != null) m_INV_WH_CD = new String(s.m_INV_WH_CD);
         if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
         if(s.m_MRP_FLG != null) m_MRP_FLG = new String(s.m_MRP_FLG);
         if(s.m_WH_TYP != null) m_WH_TYP = new String(s.m_WH_TYP);
         if(s.m_WH_VEND_CD != null) m_WH_VEND_CD = new String(s.m_WH_VEND_CD);
         if(s.m_VEND_ANAME != null) m_VEND_ANAME = new String(s.m_VEND_ANAME);
         if(s.m_w_WH_CD != null) m_w_WH_CD = new String(s.m_w_WH_CD);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_INV_ITEM_CD != null) m_INV_ITEM_CD = new String(s.m_INV_ITEM_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_ABC_TYP != null) m_ABC_TYP = new String(s.m_ABC_TYP);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_s_ABC_TYP != null) m_s_ABC_TYP = new String(s.m_s_ABC_TYP);
         if(s.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new String(s.m_UNIT_QTY_TYP);
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
         if(s.m_w_INV_STS_TYP != null) m_w_INV_STS_TYP = new String(s.m_w_INV_STS_TYP);
         if(s.m_w_MRP_FLG != null) m_w_MRP_FLG = new String(s.m_w_MRP_FLG);
         if(s.m_w_WH_TYP != null) m_w_WH_TYP = new String(s.m_w_WH_TYP);
         if(s.m_w_MRP_ODR_TYP != null) m_w_MRP_ODR_TYP = new String(s.m_w_MRP_ODR_TYP);
         if(s.m_w_OUTSIDE_TYP != null) m_w_OUTSIDE_TYP = new String(s.m_w_OUTSIDE_TYP);
         if(s.m_h_disp_entry_wh != null) m_h_disp_entry_wh = new String(s.m_h_disp_entry_wh);
         if(s.m_h_disp_entry_item != null) m_h_disp_entry_item = new String(s.m_h_disp_entry_item);
         if(s.m_w_ABC_TYP != null) m_w_ABC_TYP = new String(s.m_w_ABC_TYP);
         if(s.m_s_ABC_TYP_name != null) m_s_ABC_TYP_name = new String(s.m_s_ABC_TYP_name);
         if(s.m_s_ABC_TYP_val != null) m_s_ABC_TYP_val = new String(s.m_s_ABC_TYP_val);
         if(s.m_ERR_ADR != null) m_ERR_ADR = new String(s.m_ERR_ADR);
         if(s.m_ERR_MSG != null) m_ERR_MSG = new String(s.m_ERR_MSG);
         if(s.m_h_saveINV_DATE != null) m_h_saveINV_DATE = new String(s.m_h_saveINV_DATE);
         if(s.m_c_REGULAR_INV_FLG != null) m_c_REGULAR_INV_FLG = new String(s.m_c_REGULAR_INV_FLG);
         if(s.m_c_CYCLE_INV_FLG != null) m_c_CYCLE_INV_FLG = new String(s.m_c_CYCLE_INV_FLG);
         if(s.m_c_TEMP_INV_FLG != null) m_c_TEMP_INV_FLG = new String(s.m_c_TEMP_INV_FLG);
         if(s.m_c_disp_entry_wh != null) m_c_disp_entry_wh = new String(s.m_c_disp_entry_wh);
         if(s.m_c_disp_entry_item != null) m_c_disp_entry_item = new String(s.m_c_disp_entry_item);
         if(s.m_c_target != null) m_c_target = new String(s.m_c_target);
         if(s.m_h_saveINV_STS_TYP != null) m_h_saveINV_STS_TYP = new String(s.m_h_saveINV_STS_TYP);
         if(s.m_w_target != null) m_w_target = new String(s.m_w_target);
         if(s.m_r1_inv_target != null) m_r1_inv_target = new String(s.m_r1_inv_target);
         if(s.m_r2_inv_target != null) m_r2_inv_target = new String(s.m_r2_inv_target);
         if(s.m_FileName != null) m_FileName = new String(s.m_FileName);
         if(s.m_h_saveTEMP_INV_FLG != null) m_h_saveTEMP_INV_FLG = new String(s.m_h_saveTEMP_INV_FLG);
         if(s.m_w_COLUMN_FLG != null) m_w_COLUMN_FLG = new String(s.m_w_COLUMN_FLG);
        }
       
        /**	
         * �����̏��̕ێ����郊�X�g�̕ϐ�����w��̏��̃f�[�^���擾	
         * @param in ���X�g�ێ��̏��	
         * @param index ����	
         */	
        public void importData(AH0020010Struct in, int index)	
        {	
         clear();
         if(in.l_PLANT_CD != null && in.l_PLANT_CD.size() > index)  m_PLANT_CD = (String)(in.l_PLANT_CD.get(index));
         if(in.l_INV_DATE != null && in.l_INV_DATE.size() > index)  m_INV_DATE = (String)(in.l_INV_DATE.get(index));
         if(in.l_h_REGULAR_INV_FLG != null && in.l_h_REGULAR_INV_FLG.size() > index)  m_h_REGULAR_INV_FLG = (String)(in.l_h_REGULAR_INV_FLG.get(index));
         if(in.l_h_CYCLE_INV_FLG != null && in.l_h_CYCLE_INV_FLG.size() > index)  m_h_CYCLE_INV_FLG = (String)(in.l_h_CYCLE_INV_FLG.get(index));
         if(in.l_h_TEMP_INV_FLG != null && in.l_h_TEMP_INV_FLG.size() > index)  m_h_TEMP_INV_FLG = (String)(in.l_h_TEMP_INV_FLG.get(index));
         if(in.l_h_INV_STS_TYP != null && in.l_h_INV_STS_TYP.size() > index)  m_h_INV_STS_TYP = (String)(in.l_h_INV_STS_TYP.get(index));
         if(in.l_INV_START_DATE != null && in.l_INV_START_DATE.size() > index)  m_INV_START_DATE = (String)(in.l_INV_START_DATE.get(index));
         if(in.l_STOCK_SAVE_DATE != null && in.l_STOCK_SAVE_DATE.size() > index)  m_STOCK_SAVE_DATE = (String)(in.l_STOCK_SAVE_DATE.get(index));
         if(in.l_INV_UPDATED_DATE != null && in.l_INV_UPDATED_DATE.size() > index)  m_INV_UPDATED_DATE = (String)(in.l_INV_UPDATED_DATE.get(index));
         if(in.l_INV_COMMENT != null && in.l_INV_COMMENT.size() > index)  m_INV_COMMENT = (String)(in.l_INV_COMMENT.get(index));
         if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
         if(in.l_BUSINESS_OPR_DATE != null && in.l_BUSINESS_OPR_DATE.size() > index)  m_BUSINESS_OPR_DATE = (String)(in.l_BUSINESS_OPR_DATE.get(index));
         if(in.l_WH_CD != null && in.l_WH_CD.size() > index)  m_WH_CD = (String)(in.l_WH_CD.get(index));
         if(in.l_INV_WH_CD != null && in.l_INV_WH_CD.size() > index)  m_INV_WH_CD = (String)(in.l_INV_WH_CD.get(index));
         if(in.l_WH_NAME != null && in.l_WH_NAME.size() > index)  m_WH_NAME = (String)(in.l_WH_NAME.get(index));
         if(in.l_MRP_FLG != null && in.l_MRP_FLG.size() > index)  m_MRP_FLG = (String)(in.l_MRP_FLG.get(index));
         if(in.l_WH_TYP != null && in.l_WH_TYP.size() > index)  m_WH_TYP = (String)(in.l_WH_TYP.get(index));
         if(in.l_WH_VEND_CD != null && in.l_WH_VEND_CD.size() > index)  m_WH_VEND_CD = (String)(in.l_WH_VEND_CD.get(index));
         if(in.l_VEND_ANAME != null && in.l_VEND_ANAME.size() > index)  m_VEND_ANAME = (String)(in.l_VEND_ANAME.get(index));
         if(in.l_w_WH_CD != null && in.l_w_WH_CD.size() > index)  m_w_WH_CD = (String)(in.l_w_WH_CD.get(index));
         if(in.l_ITEM_CD != null && in.l_ITEM_CD.size() > index)  m_ITEM_CD = (String)(in.l_ITEM_CD.get(index));
         if(in.l_INV_ITEM_CD != null && in.l_INV_ITEM_CD.size() > index)  m_INV_ITEM_CD = (String)(in.l_INV_ITEM_CD.get(index));
         if(in.l_ITEM_NAME != null && in.l_ITEM_NAME.size() > index)  m_ITEM_NAME = (String)(in.l_ITEM_NAME.get(index));
         if(in.l_MRP_ODR_TYP != null && in.l_MRP_ODR_TYP.size() > index)  m_MRP_ODR_TYP = (String)(in.l_MRP_ODR_TYP.get(index));
         if(in.l_OUTSIDE_TYP != null && in.l_OUTSIDE_TYP.size() > index)  m_OUTSIDE_TYP = (String)(in.l_OUTSIDE_TYP.get(index));
         if(in.l_ABC_TYP != null && in.l_ABC_TYP.size() > index)  m_ABC_TYP = (String)(in.l_ABC_TYP.get(index));
         if(in.l_w_ITEM_CD != null && in.l_w_ITEM_CD.size() > index)  m_w_ITEM_CD = (String)(in.l_w_ITEM_CD.get(index));
         if(in.l_s_ABC_TYP != null && in.l_s_ABC_TYP.size() > index)  m_s_ABC_TYP = (String)(in.l_s_ABC_TYP.get(index));
         if(in.l_UNIT_QTY_TYP != null && in.l_UNIT_QTY_TYP.size() > index)  m_UNIT_QTY_TYP = (String)(in.l_UNIT_QTY_TYP.get(index));
         if(in.l_STOCK_UNIT != null && in.l_STOCK_UNIT.size() > index)  m_STOCK_UNIT = (String)(in.l_STOCK_UNIT.get(index));
         if(in.l_w_INV_STS_TYP != null && in.l_w_INV_STS_TYP.size() > index)  m_w_INV_STS_TYP = (String)(in.l_w_INV_STS_TYP.get(index));
         if(in.l_w_MRP_FLG != null && in.l_w_MRP_FLG.size() > index)  m_w_MRP_FLG = (String)(in.l_w_MRP_FLG.get(index));
         if(in.l_w_WH_TYP != null && in.l_w_WH_TYP.size() > index)  m_w_WH_TYP = (String)(in.l_w_WH_TYP.get(index));
         if(in.l_w_MRP_ODR_TYP != null && in.l_w_MRP_ODR_TYP.size() > index)  m_w_MRP_ODR_TYP = (String)(in.l_w_MRP_ODR_TYP.get(index));
         if(in.l_w_OUTSIDE_TYP != null && in.l_w_OUTSIDE_TYP.size() > index)  m_w_OUTSIDE_TYP = (String)(in.l_w_OUTSIDE_TYP.get(index));
         if(in.l_h_disp_entry_wh != null && in.l_h_disp_entry_wh.size() > index)  m_h_disp_entry_wh = (String)(in.l_h_disp_entry_wh.get(index));
         if(in.l_h_disp_entry_item != null && in.l_h_disp_entry_item.size() > index)  m_h_disp_entry_item = (String)(in.l_h_disp_entry_item.get(index));
         if(in.l_w_ABC_TYP != null && in.l_w_ABC_TYP.size() > index)  m_w_ABC_TYP = (String)(in.l_w_ABC_TYP.get(index));
         if(in.l_s_ABC_TYP_name != null && in.l_s_ABC_TYP_name.size() > index)  m_s_ABC_TYP_name = (String)(in.l_s_ABC_TYP_name.get(index));
         if(in.l_s_ABC_TYP_val != null && in.l_s_ABC_TYP_val.size() > index)  m_s_ABC_TYP_val = (String)(in.l_s_ABC_TYP_val.get(index));
         if(in.l_ERR_ADR != null && in.l_ERR_ADR.size() > index)  m_ERR_ADR = (String)(in.l_ERR_ADR.get(index));
         if(in.l_ERR_MSG != null && in.l_ERR_MSG.size() > index)  m_ERR_MSG = (String)(in.l_ERR_MSG.get(index));
         if(in.l_h_saveINV_DATE != null && in.l_h_saveINV_DATE.size() > index)  m_h_saveINV_DATE = (String)(in.l_h_saveINV_DATE.get(index));
         if(in.l_c_REGULAR_INV_FLG != null && in.l_c_REGULAR_INV_FLG.size() > index)  m_c_REGULAR_INV_FLG = (String)(in.l_c_REGULAR_INV_FLG.get(index));
         if(in.l_c_CYCLE_INV_FLG != null && in.l_c_CYCLE_INV_FLG.size() > index)  m_c_CYCLE_INV_FLG = (String)(in.l_c_CYCLE_INV_FLG.get(index));
         if(in.l_c_TEMP_INV_FLG != null && in.l_c_TEMP_INV_FLG.size() > index)  m_c_TEMP_INV_FLG = (String)(in.l_c_TEMP_INV_FLG.get(index));
         if(in.l_c_disp_entry_wh != null && in.l_c_disp_entry_wh.size() > index)  m_c_disp_entry_wh = (String)(in.l_c_disp_entry_wh.get(index));
         if(in.l_c_disp_entry_item != null && in.l_c_disp_entry_item.size() > index)  m_c_disp_entry_item = (String)(in.l_c_disp_entry_item.get(index));
         if(in.l_c_target != null && in.l_c_target.size() > index)  m_c_target = (String)(in.l_c_target.get(index));
         if(in.l_h_saveINV_STS_TYP != null && in.l_h_saveINV_STS_TYP.size() > index)  m_h_saveINV_STS_TYP = (String)(in.l_h_saveINV_STS_TYP.get(index));
         if(in.l_w_target != null && in.l_w_target.size() > index)  m_w_target = (String)(in.l_w_target.get(index));
         if(in.l_r1_inv_target != null && in.l_r1_inv_target.size() > index)  m_r1_inv_target = (String)(in.l_r1_inv_target.get(index));
         if(in.l_r2_inv_target != null && in.l_r2_inv_target.size() > index)  m_r2_inv_target = (String)(in.l_r2_inv_target.get(index));
         if(in.l_FileName != null && in.l_FileName.size() > index)  m_FileName = (String)(in.l_FileName.get(index));
         if(in.l_h_saveTEMP_INV_FLG != null && in.l_h_saveTEMP_INV_FLG.size() > index)  m_h_saveTEMP_INV_FLG = (String)(in.l_h_saveTEMP_INV_FLG.get(index));
         if(in.l_w_COLUMN_FLG != null && in.l_w_COLUMN_FLG.size() > index)  m_w_COLUMN_FLG = (String)(in.l_w_COLUMN_FLG.get(index));
         return;
        }	
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
