/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0060/src/com/nec/jp/orteus/metamorBase/AH0060/AH0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0060;

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

public class AH0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_INV_status */
	public String m_w_INV_status = null;
	/** �� 2 �ϐ��F m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** �� 3 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 4 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 5 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 6 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 7 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 8 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 9 �ϐ��F m_FINAL_BOOK_STOCK_QTY */
	public String m_FINAL_BOOK_STOCK_QTY = null;
	/** �� 10 �ϐ��F m_ACTUAL_STOCK_QTY */
	public String m_ACTUAL_STOCK_QTY = null;
	/** �� 11 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 12 �ϐ��F m_SAFETY_STOCK */
	public String m_SAFETY_STOCK = null;
	/** �� 13 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 14 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 15 �ϐ��F m_difference_rate */
	public String m_difference_rate = null;
	/** �� 16 �ϐ��F m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** �� 17 �ϐ��F m_w_ABC_TYP */
	public String m_w_ABC_TYP = null;
	/** �� 18 �ϐ��F m_w_MRP_FLG */
	public String m_w_MRP_FLG = null;
	/** �� 19 �ϐ��F m_w_WH_TYP */
	public String m_w_WH_TYP = null;
	/** �� 20 �ϐ��F m_s_ABC_TYP */
	public String m_s_ABC_TYP = null;
	/** �� 21 �ϐ��F m_s_ABC_TYP_name */
	public String m_s_ABC_TYP_name = null;
	/** �� 22 �ϐ��F m_s_ABC_TYP_val */
	public String m_s_ABC_TYP_val = null;
	/** �� 23 �ϐ��F m_c_JOB_ODR_CD_STOCK_flg */
	public String m_c_JOB_ODR_CD_STOCK_flg = null;
	/** �� 24 �ϐ��F m_h_JOB_ODR_CD_STOCK_flg */
	public String m_h_JOB_ODR_CD_STOCK_flg = null;
	/** �� 25 �ϐ��F m_h_sort_flg */
	public String m_h_sort_flg = null;
	/** �� 26 �ϐ��F m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** �� 27 �ϐ��F m_w_difference_rate */
	public String m_w_difference_rate = null;
	/** �� 28 �ϐ��F m_r1_sort1 */
	public String m_r1_sort1 = null;
	/** �� 29 �ϐ��F m_r1_sort2 */
	public String m_r1_sort2 = null;
	/** �� 30 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 31 �ϐ��F m_h_save_sort_flg */
	public String m_h_save_sort_flg = null;
	/** �� 32 �ϐ��F m_w_STOCK_LOT_CD */
	public String m_w_STOCK_LOT_CD = null;
	/** �� 33 �ϐ��F m_l_STOCK_LOT_CD */
	public String m_l_STOCK_LOT_CD = null;
	/** �� 34 �ϐ��F m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** �� 35 �ϐ��F m_r2_whlot1 */
	public String m_r2_whlot1 = null;
	/** �� 36 �ϐ��F m_r2_whlot2 */
	public String m_r2_whlot2 = null;
	/** �� 37 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 38 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 39 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** �� 40 �ϐ��F m_WH_TYP */
	public String m_WH_TYP = null;
	/** �� 41 �ϐ��F m_ABC_TYP */
	public String m_ABC_TYP = null;
	/** �� 42 �ϐ��F m_INV_DATE */
	public String m_INV_DATE = null;
	/** �� 43 �ϐ��F m_REGULAR_INV_FLG */
	public String m_REGULAR_INV_FLG = null;
	/** �� 44 �ϐ��F m_CYCLE_INV_FLG */
	public String m_CYCLE_INV_FLG = null;
	/** �� 45 �ϐ��F m_TEMP_INV_FLG */
	public String m_TEMP_INV_FLG = null;
	/** �� 46 �ϐ��F m_INV_STS_TYP */
	public String m_INV_STS_TYP = null;
	/** �� 47 �ϐ��F m_INV_START_DATE */
	public String m_INV_START_DATE = null;
	/** �� 48 �ϐ��F m_STOCK_SAVE_DATE */
	public String m_STOCK_SAVE_DATE = null;
	/** �� 49 �ϐ��F m_INV_UPDATED_DATE */
	public String m_INV_UPDATED_DATE = null;
	/** �� 50 �ϐ��F m_INV_COMMENT */
	public String m_INV_COMMENT = null;
	/** �� 51 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 52 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_INV_status */
	public List l_w_INV_status = null;

	/** �� 2 List�ϐ��F l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** �� 3 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 4 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 5 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 6 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 7 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 8 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 9 List�ϐ��F l_FINAL_BOOK_STOCK_QTY */
	public List l_FINAL_BOOK_STOCK_QTY = null;

	/** �� 10 List�ϐ��F l_ACTUAL_STOCK_QTY */
	public List l_ACTUAL_STOCK_QTY = null;

	/** �� 11 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 12 List�ϐ��F l_SAFETY_STOCK */
	public List l_SAFETY_STOCK = null;

	/** �� 13 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 14 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 15 List�ϐ��F l_difference_rate */
	public List l_difference_rate = null;

	/** �� 16 List�ϐ��F l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** �� 17 List�ϐ��F l_w_ABC_TYP */
	public List l_w_ABC_TYP = null;

	/** �� 18 List�ϐ��F l_w_MRP_FLG */
	public List l_w_MRP_FLG = null;

	/** �� 19 List�ϐ��F l_w_WH_TYP */
	public List l_w_WH_TYP = null;

	/** �� 20 List�ϐ��F l_s_ABC_TYP */
	public List l_s_ABC_TYP = null;

	/** �� 21 List�ϐ��F l_s_ABC_TYP_name */
	public List l_s_ABC_TYP_name = null;

	/** �� 22 List�ϐ��F l_s_ABC_TYP_val */
	public List l_s_ABC_TYP_val = null;

	/** �� 23 List�ϐ��F l_c_JOB_ODR_CD_STOCK_flg */
	public List l_c_JOB_ODR_CD_STOCK_flg = null;

	/** �� 24 List�ϐ��F l_h_JOB_ODR_CD_STOCK_flg */
	public List l_h_JOB_ODR_CD_STOCK_flg = null;

	/** �� 25 List�ϐ��F l_h_sort_flg */
	public List l_h_sort_flg = null;

	/** �� 26 List�ϐ��F l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** �� 27 List�ϐ��F l_w_difference_rate */
	public List l_w_difference_rate = null;

	/** �� 28 List�ϐ��F l_r1_sort1 */
	public List l_r1_sort1 = null;

	/** �� 29 List�ϐ��F l_r1_sort2 */
	public List l_r1_sort2 = null;

	/** �� 30 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 31 List�ϐ��F l_h_save_sort_flg */
	public List l_h_save_sort_flg = null;

	/** �� 32 List�ϐ��F l_w_STOCK_LOT_CD */
	public List l_w_STOCK_LOT_CD = null;

	/** �� 33 List�ϐ��F l_l_STOCK_LOT_CD */
	public List l_l_STOCK_LOT_CD = null;

	/** �� 34 List�ϐ��F l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** �� 35 List�ϐ��F l_r2_whlot1 */
	public List l_r2_whlot1 = null;

	/** �� 36 List�ϐ��F l_r2_whlot2 */
	public List l_r2_whlot2 = null;

	/** �� 37 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 38 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 39 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 40 List�ϐ��F l_WH_TYP */
	public List l_WH_TYP = null;

	/** �� 41 List�ϐ��F l_ABC_TYP */
	public List l_ABC_TYP = null;

	/** �� 42 List�ϐ��F l_INV_DATE */
	public List l_INV_DATE = null;

	/** �� 43 List�ϐ��F l_REGULAR_INV_FLG */
	public List l_REGULAR_INV_FLG = null;

	/** �� 44 List�ϐ��F l_CYCLE_INV_FLG */
	public List l_CYCLE_INV_FLG = null;

	/** �� 45 List�ϐ��F l_TEMP_INV_FLG */
	public List l_TEMP_INV_FLG = null;

	/** �� 46 List�ϐ��F l_INV_STS_TYP */
	public List l_INV_STS_TYP = null;

	/** �� 47 List�ϐ��F l_INV_START_DATE */
	public List l_INV_START_DATE = null;

	/** �� 48 List�ϐ��F l_STOCK_SAVE_DATE */
	public List l_STOCK_SAVE_DATE = null;

	/** �� 49 List�ϐ��F l_INV_UPDATED_DATE */
	public List l_INV_UPDATED_DATE = null;

	/** �� 50 List�ϐ��F l_INV_COMMENT */
	public List l_INV_COMMENT = null;

	/** �� 51 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 52 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_INV_status() { return m_w_INV_status; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getFINAL_BOOK_STOCK_QTY() { return m_FINAL_BOOK_STOCK_QTY; }
	public String getACTUAL_STOCK_QTY() { return m_ACTUAL_STOCK_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getSAFETY_STOCK() { return m_SAFETY_STOCK; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getdifference_rate() { return m_difference_rate; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getw_ABC_TYP() { return m_w_ABC_TYP; }
	public String getw_MRP_FLG() { return m_w_MRP_FLG; }
	public String getw_WH_TYP() { return m_w_WH_TYP; }
	public String gets_ABC_TYP() { return m_s_ABC_TYP; }
	public String gets_ABC_TYP_name() { return m_s_ABC_TYP_name; }
	public String gets_ABC_TYP_val() { return m_s_ABC_TYP_val; }
	public String getc_JOB_ODR_CD_STOCK_flg() { return m_c_JOB_ODR_CD_STOCK_flg; }
	public String geth_JOB_ODR_CD_STOCK_flg() { return m_h_JOB_ODR_CD_STOCK_flg; }
	public String geth_sort_flg() { return m_h_sort_flg; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String getw_difference_rate() { return m_w_difference_rate; }
	public String getr1_sort1() { return m_r1_sort1; }
	public String getr1_sort2() { return m_r1_sort2; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String geth_save_sort_flg() { return m_h_save_sort_flg; }
	public String getw_STOCK_LOT_CD() { return m_w_STOCK_LOT_CD; }
	public String getl_STOCK_LOT_CD() { return m_l_STOCK_LOT_CD; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getr2_whlot1() { return m_r2_whlot1; }
	public String getr2_whlot2() { return m_r2_whlot2; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getABC_TYP() { return m_ABC_TYP; }
	public String getINV_DATE() { return m_INV_DATE; }
	public String getREGULAR_INV_FLG() { return m_REGULAR_INV_FLG; }
	public String getCYCLE_INV_FLG() { return m_CYCLE_INV_FLG; }
	public String getTEMP_INV_FLG() { return m_TEMP_INV_FLG; }
	public String getINV_STS_TYP() { return m_INV_STS_TYP; }
	public String getINV_START_DATE() { return m_INV_START_DATE; }
	public String getSTOCK_SAVE_DATE() { return m_STOCK_SAVE_DATE; }
	public String getINV_UPDATED_DATE() { return m_INV_UPDATED_DATE; }
	public String getINV_COMMENT() { return m_INV_COMMENT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }

	public List getList_w_INV_status() { return l_w_INV_status; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_FINAL_BOOK_STOCK_QTY() { return l_FINAL_BOOK_STOCK_QTY; }
	public List getList_ACTUAL_STOCK_QTY() { return l_ACTUAL_STOCK_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_SAFETY_STOCK() { return l_SAFETY_STOCK; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_difference_rate() { return l_difference_rate; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_w_ABC_TYP() { return l_w_ABC_TYP; }
	public List getList_w_MRP_FLG() { return l_w_MRP_FLG; }
	public List getList_w_WH_TYP() { return l_w_WH_TYP; }
	public List getList_s_ABC_TYP() { return l_s_ABC_TYP; }
	public List getList_s_ABC_TYP_name() { return l_s_ABC_TYP_name; }
	public List getList_s_ABC_TYP_val() { return l_s_ABC_TYP_val; }
	public List getList_c_JOB_ODR_CD_STOCK_flg() { return l_c_JOB_ODR_CD_STOCK_flg; }
	public List getList_h_JOB_ODR_CD_STOCK_flg() { return l_h_JOB_ODR_CD_STOCK_flg; }
	public List getList_h_sort_flg() { return l_h_sort_flg; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_w_difference_rate() { return l_w_difference_rate; }
	public List getList_r1_sort1() { return l_r1_sort1; }
	public List getList_r1_sort2() { return l_r1_sort2; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_h_save_sort_flg() { return l_h_save_sort_flg; }
	public List getList_w_STOCK_LOT_CD() { return l_w_STOCK_LOT_CD; }
	public List getList_l_STOCK_LOT_CD() { return l_l_STOCK_LOT_CD; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_r2_whlot1() { return l_r2_whlot1; }
	public List getList_r2_whlot2() { return l_r2_whlot2; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_ABC_TYP() { return l_ABC_TYP; }
	public List getList_INV_DATE() { return l_INV_DATE; }
	public List getList_REGULAR_INV_FLG() { return l_REGULAR_INV_FLG; }
	public List getList_CYCLE_INV_FLG() { return l_CYCLE_INV_FLG; }
	public List getList_TEMP_INV_FLG() { return l_TEMP_INV_FLG; }
	public List getList_INV_STS_TYP() { return l_INV_STS_TYP; }
	public List getList_INV_START_DATE() { return l_INV_START_DATE; }
	public List getList_STOCK_SAVE_DATE() { return l_STOCK_SAVE_DATE; }
	public List getList_INV_UPDATED_DATE() { return l_INV_UPDATED_DATE; }
	public List getList_INV_COMMENT() { return l_INV_COMMENT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }

	public void setw_INV_status(String val) { m_w_INV_status = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setFINAL_BOOK_STOCK_QTY(String val) { m_FINAL_BOOK_STOCK_QTY = val; }
	public void setACTUAL_STOCK_QTY(String val) { m_ACTUAL_STOCK_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setSAFETY_STOCK(String val) { m_SAFETY_STOCK = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setdifference_rate(String val) { m_difference_rate = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setw_ABC_TYP(String val) { m_w_ABC_TYP = val; }
	public void setw_MRP_FLG(String val) { m_w_MRP_FLG = val; }
	public void setw_WH_TYP(String val) { m_w_WH_TYP = val; }
	public void sets_ABC_TYP(String val) { m_s_ABC_TYP = val; }
	public void sets_ABC_TYP_name(String val) { m_s_ABC_TYP_name = val; }
	public void sets_ABC_TYP_val(String val) { m_s_ABC_TYP_val = val; }
	public void setc_JOB_ODR_CD_STOCK_flg(String val) { m_c_JOB_ODR_CD_STOCK_flg = val; }
	public void seth_JOB_ODR_CD_STOCK_flg(String val) { m_h_JOB_ODR_CD_STOCK_flg = val; }
	public void seth_sort_flg(String val) { m_h_sort_flg = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void setw_difference_rate(String val) { m_w_difference_rate = val; }
	public void setr1_sort1(String val) { m_r1_sort1 = val; }
	public void setr1_sort2(String val) { m_r1_sort2 = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void seth_save_sort_flg(String val) { m_h_save_sort_flg = val; }
	public void setw_STOCK_LOT_CD(String val) { m_w_STOCK_LOT_CD = val; }
	public void setl_STOCK_LOT_CD(String val) { m_l_STOCK_LOT_CD = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setr2_whlot1(String val) { m_r2_whlot1 = val; }
	public void setr2_whlot2(String val) { m_r2_whlot2 = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setABC_TYP(String val) { m_ABC_TYP = val; }
	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void setREGULAR_INV_FLG(String val) { m_REGULAR_INV_FLG = val; }
	public void setCYCLE_INV_FLG(String val) { m_CYCLE_INV_FLG = val; }
	public void setTEMP_INV_FLG(String val) { m_TEMP_INV_FLG = val; }
	public void setINV_STS_TYP(String val) { m_INV_STS_TYP = val; }
	public void setINV_START_DATE(String val) { m_INV_START_DATE = val; }
	public void setSTOCK_SAVE_DATE(String val) { m_STOCK_SAVE_DATE = val; }
	public void setINV_UPDATED_DATE(String val) { m_INV_UPDATED_DATE = val; }
	public void setINV_COMMENT(String val) { m_INV_COMMENT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }


	public void setList_w_INV_status(List list) { l_w_INV_status = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_FINAL_BOOK_STOCK_QTY(List list) { l_FINAL_BOOK_STOCK_QTY = list; }
	public void setList_ACTUAL_STOCK_QTY(List list) { l_ACTUAL_STOCK_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_SAFETY_STOCK(List list) { l_SAFETY_STOCK = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_difference_rate(List list) { l_difference_rate = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_w_ABC_TYP(List list) { l_w_ABC_TYP = list; }
	public void setList_w_MRP_FLG(List list) { l_w_MRP_FLG = list; }
	public void setList_w_WH_TYP(List list) { l_w_WH_TYP = list; }
	public void setList_s_ABC_TYP(List list) { l_s_ABC_TYP = list; }
	public void setList_s_ABC_TYP_name(List list) { l_s_ABC_TYP_name = list; }
	public void setList_s_ABC_TYP_val(List list) { l_s_ABC_TYP_val = list; }
	public void setList_c_JOB_ODR_CD_STOCK_flg(List list) { l_c_JOB_ODR_CD_STOCK_flg = list; }
	public void setList_h_JOB_ODR_CD_STOCK_flg(List list) { l_h_JOB_ODR_CD_STOCK_flg = list; }
	public void setList_h_sort_flg(List list) { l_h_sort_flg = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_w_difference_rate(List list) { l_w_difference_rate = list; }
	public void setList_r1_sort1(List list) { l_r1_sort1 = list; }
	public void setList_r1_sort2(List list) { l_r1_sort2 = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_h_save_sort_flg(List list) { l_h_save_sort_flg = list; }
	public void setList_w_STOCK_LOT_CD(List list) { l_w_STOCK_LOT_CD = list; }
	public void setList_l_STOCK_LOT_CD(List list) { l_l_STOCK_LOT_CD = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_r2_whlot1(List list) { l_r2_whlot1 = list; }
	public void setList_r2_whlot2(List list) { l_r2_whlot2 = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_ABC_TYP(List list) { l_ABC_TYP = list; }
	public void setList_INV_DATE(List list) { l_INV_DATE = list; }
	public void setList_REGULAR_INV_FLG(List list) { l_REGULAR_INV_FLG = list; }
	public void setList_CYCLE_INV_FLG(List list) { l_CYCLE_INV_FLG = list; }
	public void setList_TEMP_INV_FLG(List list) { l_TEMP_INV_FLG = list; }
	public void setList_INV_STS_TYP(List list) { l_INV_STS_TYP = list; }
	public void setList_INV_START_DATE(List list) { l_INV_START_DATE = list; }
	public void setList_STOCK_SAVE_DATE(List list) { l_STOCK_SAVE_DATE = list; }
	public void setList_INV_UPDATED_DATE(List list) { l_INV_UPDATED_DATE = list; }
	public void setList_INV_COMMENT(List list) { l_INV_COMMENT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }

	public int setL2L_w_INV_status(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INV_status == null) {
			l_w_INV_status = new ArrayList();
		} else {
			l_w_INV_status.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INV_status.add(((AH0060010Struct) list.get(i)).getw_INV_status());
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
			l_w_WH_CD.add(((AH0060010Struct) list.get(i)).getw_WH_CD());
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
			l_w_ITEM_CD.add(((AH0060010Struct) list.get(i)).getw_ITEM_CD());
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
			l_WH_CD.add(((AH0060010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AH0060010Struct) list.get(i)).getWH_NAME());
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
			l_ITEM_CD.add(((AH0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AH0060010Struct) list.get(i)).getITEM_NAME());
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
			l_JOB_ODR_CD.add(((AH0060010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_FINAL_BOOK_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_BOOK_STOCK_QTY == null) {
			l_FINAL_BOOK_STOCK_QTY = new ArrayList();
		} else {
			l_FINAL_BOOK_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_BOOK_STOCK_QTY.add(((AH0060010Struct) list.get(i)).getFINAL_BOOK_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_ACTUAL_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACTUAL_STOCK_QTY == null) {
			l_ACTUAL_STOCK_QTY = new ArrayList();
		} else {
			l_ACTUAL_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACTUAL_STOCK_QTY.add(((AH0060010Struct) list.get(i)).getACTUAL_STOCK_QTY());
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
			l_STOCK_UNIT.add(((AH0060010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_SAFETY_STOCK.add(((AH0060010Struct) list.get(i)).getSAFETY_STOCK());
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
			l_VEND_CD.add(((AH0060010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AH0060010Struct) list.get(i)).getVEND_ANAME());
		}
		return size;
	}
	public int setL2L_difference_rate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_difference_rate == null) {
			l_difference_rate = new ArrayList();
		} else {
			l_difference_rate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_difference_rate.add(((AH0060010Struct) list.get(i)).getdifference_rate());
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
			l_w_MRP_ODR_TYP.add(((AH0060010Struct) list.get(i)).getw_MRP_ODR_TYP());
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
			l_w_ABC_TYP.add(((AH0060010Struct) list.get(i)).getw_ABC_TYP());
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
			l_w_MRP_FLG.add(((AH0060010Struct) list.get(i)).getw_MRP_FLG());
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
			l_w_WH_TYP.add(((AH0060010Struct) list.get(i)).getw_WH_TYP());
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
			l_s_ABC_TYP.add(((AH0060010Struct) list.get(i)).gets_ABC_TYP());
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
			l_s_ABC_TYP_name.add(((AH0060010Struct) list.get(i)).gets_ABC_TYP_name());
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
			l_s_ABC_TYP_val.add(((AH0060010Struct) list.get(i)).gets_ABC_TYP_val());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD_STOCK_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD_STOCK_flg == null) {
			l_c_JOB_ODR_CD_STOCK_flg = new ArrayList();
		} else {
			l_c_JOB_ODR_CD_STOCK_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD_STOCK_flg.add(((AH0060010Struct) list.get(i)).getc_JOB_ODR_CD_STOCK_flg());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD_STOCK_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD_STOCK_flg == null) {
			l_h_JOB_ODR_CD_STOCK_flg = new ArrayList();
		} else {
			l_h_JOB_ODR_CD_STOCK_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD_STOCK_flg.add(((AH0060010Struct) list.get(i)).geth_JOB_ODR_CD_STOCK_flg());
		}
		return size;
	}
	public int setL2L_h_sort_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_sort_flg == null) {
			l_h_sort_flg = new ArrayList();
		} else {
			l_h_sort_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_sort_flg.add(((AH0060010Struct) list.get(i)).geth_sort_flg());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_CD == null) {
			l_w_JOB_ODR_CD = new ArrayList();
		} else {
			l_w_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_CD.add(((AH0060010Struct) list.get(i)).getw_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_difference_rate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_difference_rate == null) {
			l_w_difference_rate = new ArrayList();
		} else {
			l_w_difference_rate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_difference_rate.add(((AH0060010Struct) list.get(i)).getw_difference_rate());
		}
		return size;
	}
	public int setL2L_r1_sort1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sort1 == null) {
			l_r1_sort1 = new ArrayList();
		} else {
			l_r1_sort1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sort1.add(((AH0060010Struct) list.get(i)).getr1_sort1());
		}
		return size;
	}
	public int setL2L_r1_sort2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sort2 == null) {
			l_r1_sort2 = new ArrayList();
		} else {
			l_r1_sort2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sort2.add(((AH0060010Struct) list.get(i)).getr1_sort2());
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
			l_DOWNLOAD_FILE.add(((AH0060010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_h_save_sort_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_save_sort_flg == null) {
			l_h_save_sort_flg = new ArrayList();
		} else {
			l_h_save_sort_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_save_sort_flg.add(((AH0060010Struct) list.get(i)).geth_save_sort_flg());
		}
		return size;
	}
	public int setL2L_w_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_LOT_CD == null) {
			l_w_STOCK_LOT_CD = new ArrayList();
		} else {
			l_w_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_LOT_CD.add(((AH0060010Struct) list.get(i)).getw_STOCK_LOT_CD());
		}
		return size;
	}
	public int setL2L_l_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_LOT_CD == null) {
			l_l_STOCK_LOT_CD = new ArrayList();
		} else {
			l_l_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_LOT_CD.add(((AH0060010Struct) list.get(i)).getl_STOCK_LOT_CD());
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
			l_h_lotCtrl.add(((AH0060010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_r2_whlot1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_whlot1 == null) {
			l_r2_whlot1 = new ArrayList();
		} else {
			l_r2_whlot1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_whlot1.add(((AH0060010Struct) list.get(i)).getr2_whlot1());
		}
		return size;
	}
	public int setL2L_r2_whlot2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_whlot2 == null) {
			l_r2_whlot2 = new ArrayList();
		} else {
			l_r2_whlot2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_whlot2.add(((AH0060010Struct) list.get(i)).getr2_whlot2());
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
			l_PLANT_NAME.add(((AH0060010Struct) list.get(i)).getPLANT_NAME());
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
			l_MRP_ODR_TYP.add(((AH0060010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_MRP_FLG.add(((AH0060010Struct) list.get(i)).getMRP_FLG());
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
			l_WH_TYP.add(((AH0060010Struct) list.get(i)).getWH_TYP());
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
			l_ABC_TYP.add(((AH0060010Struct) list.get(i)).getABC_TYP());
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
			l_INV_DATE.add(((AH0060010Struct) list.get(i)).getINV_DATE());
		}
		return size;
	}
	public int setL2L_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REGULAR_INV_FLG == null) {
			l_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REGULAR_INV_FLG.add(((AH0060010Struct) list.get(i)).getREGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CYCLE_INV_FLG == null) {
			l_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CYCLE_INV_FLG.add(((AH0060010Struct) list.get(i)).getCYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_INV_FLG == null) {
			l_TEMP_INV_FLG = new ArrayList();
		} else {
			l_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_INV_FLG.add(((AH0060010Struct) list.get(i)).getTEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_STS_TYP == null) {
			l_INV_STS_TYP = new ArrayList();
		} else {
			l_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_STS_TYP.add(((AH0060010Struct) list.get(i)).getINV_STS_TYP());
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
			l_INV_START_DATE.add(((AH0060010Struct) list.get(i)).getINV_START_DATE());
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
			l_STOCK_SAVE_DATE.add(((AH0060010Struct) list.get(i)).getSTOCK_SAVE_DATE());
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
			l_INV_UPDATED_DATE.add(((AH0060010Struct) list.get(i)).getINV_UPDATED_DATE());
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
			l_INV_COMMENT.add(((AH0060010Struct) list.get(i)).getINV_COMMENT());
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
			l_MODIFY_COUNT.add(((AH0060010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((AH0060010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_INV_status = null;
		m_w_WH_CD = null;
		m_w_ITEM_CD = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_FINAL_BOOK_STOCK_QTY = null;
		m_ACTUAL_STOCK_QTY = null;
		m_STOCK_UNIT = null;
		m_SAFETY_STOCK = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_difference_rate = null;
		m_w_MRP_ODR_TYP = null;
		m_w_ABC_TYP = null;
		m_w_MRP_FLG = null;
		m_w_WH_TYP = null;
		m_s_ABC_TYP = null;
		m_s_ABC_TYP_name = null;
		m_s_ABC_TYP_val = null;
		m_c_JOB_ODR_CD_STOCK_flg = null;
		m_h_JOB_ODR_CD_STOCK_flg = null;
		m_h_sort_flg = null;
		m_w_JOB_ODR_CD = null;
		m_w_difference_rate = null;
		m_r1_sort1 = null;
		m_r1_sort2 = null;
		m_DOWNLOAD_FILE = null;
		m_h_save_sort_flg = null;
		m_w_STOCK_LOT_CD = null;
		m_l_STOCK_LOT_CD = null;
		m_h_lotCtrl = null;
		m_r2_whlot1 = null;
		m_r2_whlot2 = null;
		m_PLANT_NAME = null;
		m_MRP_ODR_TYP = null;
		m_MRP_FLG = null;
		m_WH_TYP = null;
		m_ABC_TYP = null;
		m_INV_DATE = null;
		m_REGULAR_INV_FLG = null;
		m_CYCLE_INV_FLG = null;
		m_TEMP_INV_FLG = null;
		m_INV_STS_TYP = null;
		m_INV_START_DATE = null;
		m_STOCK_SAVE_DATE = null;
		m_INV_UPDATED_DATE = null;
		m_INV_COMMENT = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;

		l_w_INV_status = null;
		l_w_WH_CD = null;
		l_w_ITEM_CD = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_FINAL_BOOK_STOCK_QTY = null;
		l_ACTUAL_STOCK_QTY = null;
		l_STOCK_UNIT = null;
		l_SAFETY_STOCK = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_difference_rate = null;
		l_w_MRP_ODR_TYP = null;
		l_w_ABC_TYP = null;
		l_w_MRP_FLG = null;
		l_w_WH_TYP = null;
		l_s_ABC_TYP = null;
		l_s_ABC_TYP_name = null;
		l_s_ABC_TYP_val = null;
		l_c_JOB_ODR_CD_STOCK_flg = null;
		l_h_JOB_ODR_CD_STOCK_flg = null;
		l_h_sort_flg = null;
		l_w_JOB_ODR_CD = null;
		l_w_difference_rate = null;
		l_r1_sort1 = null;
		l_r1_sort2 = null;
		l_DOWNLOAD_FILE = null;
		l_h_save_sort_flg = null;
		l_w_STOCK_LOT_CD = null;
		l_l_STOCK_LOT_CD = null;
		l_h_lotCtrl = null;
		l_r2_whlot1 = null;
		l_r2_whlot2 = null;
		l_PLANT_NAME = null;
		l_MRP_ODR_TYP = null;
		l_MRP_FLG = null;
		l_WH_TYP = null;
		l_ABC_TYP = null;
		l_INV_DATE = null;
		l_REGULAR_INV_FLG = null;
		l_CYCLE_INV_FLG = null;
		l_TEMP_INV_FLG = null;
		l_INV_STS_TYP = null;
		l_INV_START_DATE = null;
		l_STOCK_SAVE_DATE = null;
		l_INV_UPDATED_DATE = null;
		l_INV_COMMENT = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;

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
	 * medAH0060010�N���X�̕W���R���X�g���N�^
	 */
	public AH0060010Struct()
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
	public void setStruct(AH0060010Struct struct)
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
	public void setStructM(AH0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_INV_status(struct.getw_INV_status());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setFINAL_BOOK_STOCK_QTY(struct.getFINAL_BOOK_STOCK_QTY());
			this.setACTUAL_STOCK_QTY(struct.getACTUAL_STOCK_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setSAFETY_STOCK(struct.getSAFETY_STOCK());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setdifference_rate(struct.getdifference_rate());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setw_ABC_TYP(struct.getw_ABC_TYP());
			this.setw_MRP_FLG(struct.getw_MRP_FLG());
			this.setw_WH_TYP(struct.getw_WH_TYP());
			this.sets_ABC_TYP(struct.gets_ABC_TYP());
			this.sets_ABC_TYP_name(struct.gets_ABC_TYP_name());
			this.sets_ABC_TYP_val(struct.gets_ABC_TYP_val());
			this.setc_JOB_ODR_CD_STOCK_flg(struct.getc_JOB_ODR_CD_STOCK_flg());
			this.seth_JOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
			this.seth_sort_flg(struct.geth_sort_flg());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.setw_difference_rate(struct.getw_difference_rate());
			this.setr1_sort1(struct.getr1_sort1());
			this.setr1_sort2(struct.getr1_sort2());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.seth_save_sort_flg(struct.geth_save_sort_flg());
			this.setw_STOCK_LOT_CD(struct.getw_STOCK_LOT_CD());
			this.setl_STOCK_LOT_CD(struct.getl_STOCK_LOT_CD());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setr2_whlot1(struct.getr2_whlot1());
			this.setr2_whlot2(struct.getr2_whlot2());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setWH_TYP(struct.getWH_TYP());
			this.setABC_TYP(struct.getABC_TYP());
			this.setINV_DATE(struct.getINV_DATE());
			this.setREGULAR_INV_FLG(struct.getREGULAR_INV_FLG());
			this.setCYCLE_INV_FLG(struct.getCYCLE_INV_FLG());
			this.setTEMP_INV_FLG(struct.getTEMP_INV_FLG());
			this.setINV_STS_TYP(struct.getINV_STS_TYP());
			this.setINV_START_DATE(struct.getINV_START_DATE());
			this.setSTOCK_SAVE_DATE(struct.getSTOCK_SAVE_DATE());
			this.setINV_UPDATED_DATE(struct.getINV_UPDATED_DATE());
			this.setINV_COMMENT(struct.getINV_COMMENT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_INV_status(struct.getList_w_INV_status());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_FINAL_BOOK_STOCK_QTY(struct.getList_FINAL_BOOK_STOCK_QTY());
			this.setList_ACTUAL_STOCK_QTY(struct.getList_ACTUAL_STOCK_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_SAFETY_STOCK(struct.getList_SAFETY_STOCK());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_difference_rate(struct.getList_difference_rate());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_w_ABC_TYP(struct.getList_w_ABC_TYP());
			this.setList_w_MRP_FLG(struct.getList_w_MRP_FLG());
			this.setList_w_WH_TYP(struct.getList_w_WH_TYP());
			this.setList_s_ABC_TYP(struct.getList_s_ABC_TYP());
			this.setList_s_ABC_TYP_name(struct.getList_s_ABC_TYP_name());
			this.setList_s_ABC_TYP_val(struct.getList_s_ABC_TYP_val());
			this.setList_c_JOB_ODR_CD_STOCK_flg(struct.getList_c_JOB_ODR_CD_STOCK_flg());
			this.setList_h_JOB_ODR_CD_STOCK_flg(struct.getList_h_JOB_ODR_CD_STOCK_flg());
			this.setList_h_sort_flg(struct.getList_h_sort_flg());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_w_difference_rate(struct.getList_w_difference_rate());
			this.setList_r1_sort1(struct.getList_r1_sort1());
			this.setList_r1_sort2(struct.getList_r1_sort2());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_h_save_sort_flg(struct.getList_h_save_sort_flg());
			this.setList_w_STOCK_LOT_CD(struct.getList_w_STOCK_LOT_CD());
			this.setList_l_STOCK_LOT_CD(struct.getList_l_STOCK_LOT_CD());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_r2_whlot1(struct.getList_r2_whlot1());
			this.setList_r2_whlot2(struct.getList_r2_whlot2());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_ABC_TYP(struct.getList_ABC_TYP());
			this.setList_INV_DATE(struct.getList_INV_DATE());
			this.setList_REGULAR_INV_FLG(struct.getList_REGULAR_INV_FLG());
			this.setList_CYCLE_INV_FLG(struct.getList_CYCLE_INV_FLG());
			this.setList_TEMP_INV_FLG(struct.getList_TEMP_INV_FLG());
			this.setList_INV_STS_TYP(struct.getList_INV_STS_TYP());
			this.setList_INV_START_DATE(struct.getList_INV_START_DATE());
			this.setList_STOCK_SAVE_DATE(struct.getList_STOCK_SAVE_DATE());
			this.setList_INV_UPDATED_DATE(struct.getList_INV_UPDATED_DATE());
			this.setList_INV_COMMENT(struct.getList_INV_COMMENT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
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
	// �� 1 �ϐ������l�F i_w_INV_status


	final static String i_w_INV_status = null;

	// �� 2 �ϐ������l�F i_w_WH_CD


	final static String i_w_WH_CD = null;

	// �� 3 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 4 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 5 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 6 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 7 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 8 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 9 �ϐ������l�F i_FINAL_BOOK_STOCK_QTY


	final static String i_FINAL_BOOK_STOCK_QTY = null;

	// �� 10 �ϐ������l�F i_ACTUAL_STOCK_QTY


	final static String i_ACTUAL_STOCK_QTY = null;

	// �� 11 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 12 �ϐ������l�F i_SAFETY_STOCK


	final static String i_SAFETY_STOCK = null;

	// �� 13 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 14 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 15 �ϐ������l�F i_difference_rate


	final static String i_difference_rate = null;

	// �� 16 �ϐ������l�F i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// �� 17 �ϐ������l�F i_w_ABC_TYP


	final static String i_w_ABC_TYP = null;

	// �� 18 �ϐ������l�F i_w_MRP_FLG


	final static String i_w_MRP_FLG = null;

	// �� 19 �ϐ������l�F i_w_WH_TYP


	final static String i_w_WH_TYP = null;

	// �� 20 �ϐ������l�F i_s_ABC_TYP


	final static String i_s_ABC_TYP = null;

	// �� 21 �ϐ������l�F i_s_ABC_TYP_name


	final static String i_s_ABC_TYP_name = null;

	// �� 22 �ϐ������l�F i_s_ABC_TYP_val


	final static String i_s_ABC_TYP_val = null;

	// �� 23 �ϐ������l�F i_c_JOB_ODR_CD_STOCK_flg


	final static String i_c_JOB_ODR_CD_STOCK_flg = null;

	// �� 24 �ϐ������l�F i_h_JOB_ODR_CD_STOCK_flg


	final static String i_h_JOB_ODR_CD_STOCK_flg = null;

	// �� 25 �ϐ������l�F i_h_sort_flg


	final static String i_h_sort_flg = null;

	// �� 26 �ϐ������l�F i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// �� 27 �ϐ������l�F i_w_difference_rate


	final static String i_w_difference_rate = null;

	// �� 28 �ϐ������l�F i_r1_sort1


	final static String i_r1_sort1 = null;

	// �� 29 �ϐ������l�F i_r1_sort2


	final static String i_r1_sort2 = null;

	// �� 30 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 31 �ϐ������l�F i_h_save_sort_flg


	final static String i_h_save_sort_flg = null;

	// �� 32 �ϐ������l�F i_w_STOCK_LOT_CD


	final static String i_w_STOCK_LOT_CD = null;

	// �� 33 �ϐ������l�F i_l_STOCK_LOT_CD


	final static String i_l_STOCK_LOT_CD = null;

	// �� 34 �ϐ������l�F i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// �� 35 �ϐ������l�F i_r2_whlot1


	final static String i_r2_whlot1 = null;

	// �� 36 �ϐ������l�F i_r2_whlot2


	final static String i_r2_whlot2 = null;

	// �� 37 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 38 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 39 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

	// �� 40 �ϐ������l�F i_WH_TYP


	final static String i_WH_TYP = null;

	// �� 41 �ϐ������l�F i_ABC_TYP


	final static String i_ABC_TYP = null;

	// �� 42 �ϐ������l�F i_INV_DATE


	final static String i_INV_DATE = null;

	// �� 43 �ϐ������l�F i_REGULAR_INV_FLG


	final static String i_REGULAR_INV_FLG = null;

	// �� 44 �ϐ������l�F i_CYCLE_INV_FLG


	final static String i_CYCLE_INV_FLG = null;

	// �� 45 �ϐ������l�F i_TEMP_INV_FLG


	final static String i_TEMP_INV_FLG = null;

	// �� 46 �ϐ������l�F i_INV_STS_TYP


	final static String i_INV_STS_TYP = null;

	// �� 47 �ϐ������l�F i_INV_START_DATE


	final static String i_INV_START_DATE = null;

	// �� 48 �ϐ������l�F i_STOCK_SAVE_DATE


	final static String i_STOCK_SAVE_DATE = null;

	// �� 49 �ϐ������l�F i_INV_UPDATED_DATE


	final static String i_INV_UPDATED_DATE = null;

	// �� 50 �ϐ������l�F i_INV_COMMENT


	final static String i_INV_COMMENT = null;

	// �� 51 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 52 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

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
		m_h_JOB_ODR_CD_STOCK_flg = "0";		// �`�F�b�N�����I��l�i���ԍ݌Ɏw��j
		m_h_sort_flg = "0";					// ���я������I��l�i�ۊǋ揇�j
		m_r1_sort1 = "true";				// �`�F�b�N�����I��l�i���ԍ݌Ɏw��j
		m_w_difference_rate = "0";			// ���ٗ�
	}

	/**
	 * �������ϐ��̃R�s�[
	 * @param s �R�s�[��
	 */
	public void copy(AH0060010Struct s)
	{
		clear();
		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
		if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
		if(s.m_REGULAR_INV_FLG != null) m_REGULAR_INV_FLG = new String(s.m_REGULAR_INV_FLG);
		if(s.m_CYCLE_INV_FLG != null) m_CYCLE_INV_FLG = new String(s.m_CYCLE_INV_FLG);
		if(s.m_TEMP_INV_FLG != null) m_TEMP_INV_FLG = new String(s.m_TEMP_INV_FLG);
		if(s.m_INV_STS_TYP != null) m_INV_STS_TYP = new String(s.m_INV_STS_TYP);
		if(s.m_INV_START_DATE != null) m_INV_START_DATE = new String(s.m_INV_START_DATE);
		if(s.m_STOCK_SAVE_DATE != null) m_STOCK_SAVE_DATE = new String(s.m_STOCK_SAVE_DATE);
		if(s.m_INV_UPDATED_DATE != null) m_INV_UPDATED_DATE = new String(s.m_INV_UPDATED_DATE);
		if(s.m_INV_COMMENT != null) m_INV_COMMENT = new String(s.m_INV_COMMENT);
		if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
		if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
		if(s.m_w_INV_status != null) m_w_INV_status = new String(s.m_w_INV_status);
		if(s.m_w_WH_CD != null) m_w_WH_CD = new String(s.m_w_WH_CD);
		if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_FINAL_BOOK_STOCK_QTY != null) m_FINAL_BOOK_STOCK_QTY = new String(s.m_FINAL_BOOK_STOCK_QTY);
		if(s.m_ACTUAL_STOCK_QTY != null) m_ACTUAL_STOCK_QTY = new String(s.m_ACTUAL_STOCK_QTY);
		if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
		if(s.m_SAFETY_STOCK != null) m_SAFETY_STOCK = new String(s.m_SAFETY_STOCK);
		if(s.m_VEND_CD != null) m_VEND_CD = new String(s.m_VEND_CD);
		if(s.m_VEND_ANAME != null) m_VEND_ANAME = new String(s.m_VEND_ANAME);
		if(s.m_difference_rate != null) m_difference_rate = new String(s.m_difference_rate);
		if(s.m_w_MRP_ODR_TYP != null) m_w_MRP_ODR_TYP = new String(s.m_w_MRP_ODR_TYP);
		if(s.m_w_ABC_TYP != null) m_w_ABC_TYP = new String(s.m_w_ABC_TYP);
		if(s.m_w_MRP_FLG != null) m_w_MRP_FLG = new String(s.m_w_MRP_FLG);
		if(s.m_w_WH_TYP != null) m_w_WH_TYP = new String(s.m_w_WH_TYP);
		if(s.m_s_ABC_TYP != null) m_s_ABC_TYP = new String(s.m_s_ABC_TYP);
		if(s.m_s_ABC_TYP_name != null) m_s_ABC_TYP_name = new String(s.m_s_ABC_TYP_name);
		if(s.m_s_ABC_TYP_val != null) m_s_ABC_TYP_val = new String(s.m_s_ABC_TYP_val);
		if(s.m_c_JOB_ODR_CD_STOCK_flg != null) m_c_JOB_ODR_CD_STOCK_flg = new String(s.m_c_JOB_ODR_CD_STOCK_flg);
		if(s.m_h_JOB_ODR_CD_STOCK_flg != null) m_h_JOB_ODR_CD_STOCK_flg = new String(s.m_h_JOB_ODR_CD_STOCK_flg);
		if(s.m_h_sort_flg != null) m_h_sort_flg = new String(s.m_h_sort_flg);
		if(s.m_w_JOB_ODR_CD != null) m_w_JOB_ODR_CD = new String(s.m_w_JOB_ODR_CD);
		if(s.m_w_difference_rate != null) m_w_difference_rate = new String(s.m_w_difference_rate);
		if(s.m_r1_sort1 != null) m_r1_sort1 = new String(s.m_r1_sort1);
		if(s.m_r1_sort2 != null) m_r1_sort2 = new String(s.m_r1_sort2);
		if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
		if(s.m_h_save_sort_flg != null) m_h_save_sort_flg = new String(s.m_h_save_sort_flg);
		if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
		if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
		if(s.m_MRP_FLG != null) m_MRP_FLG = new String(s.m_MRP_FLG);
		if(s.m_WH_TYP != null) m_WH_TYP = new String(s.m_WH_TYP);
		if(s.m_ABC_TYP != null) m_ABC_TYP = new String(s.m_ABC_TYP);
	}
	//------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
