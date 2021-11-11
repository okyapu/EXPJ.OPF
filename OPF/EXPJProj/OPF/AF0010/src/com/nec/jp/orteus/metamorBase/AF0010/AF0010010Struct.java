/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0010/src/com/nec/jp/orteus/metamorBase/AF0010/AF0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0010;

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

public class AF0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ISSUE_CMPLT_NAME */
	public String m_ISSUE_CMPLT_NAME = null;
	/** �� 2 �ϐ��F m_ISSUE_NAME */
	public String m_ISSUE_NAME = null;
	/** �� 3 �ϐ��F m_CONS_NAME */
	public String m_CONS_NAME = null;
	/** �� 4 �ϐ��F m_s_OPR_INST_CD */
	public String m_s_OPR_INST_CD = null;
	/** �� 5 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 6 �ϐ��F m_scdl_issue_date_from */
	public String m_scdl_issue_date_from = null;
	/** �� 7 �ϐ��F m_scdl_issue_date_to */
	public String m_scdl_issue_date_to = null;
	/** �� 8 �ϐ��F m_h_issue_cmplt_flg */
	public String m_h_issue_cmplt_flg = null;
	/** �� 9 �ϐ��F m_c1_WORK_STS_TYP */
	public String m_c1_WORK_STS_TYP = null;
	/** �� 10 �ϐ��F m_c2_WORK_STS_TYP */
	public String m_c2_WORK_STS_TYP = null;
	/** �� 11 �ϐ��F m_c3_WORK_STS_TYP */
	public String m_c3_WORK_STS_TYP = null;
	/** �� 12 �ϐ��F m_c4_WORK_STS_TYP */
	public String m_c4_WORK_STS_TYP = null;
	/** �� 13 �ϐ��F m_c5_WORK_STS_TYP */
	public String m_c5_WORK_STS_TYP = null;
	/** �� 14 �ϐ��F m_l_STATUS_DN */
	public String m_l_STATUS_DN = null;
	/** �� 15 �ϐ��F m_scdl_issue_time_from */
	public String m_scdl_issue_time_from = null;
	/** �� 16 �ϐ��F m_scdl_issue_time_to */
	public String m_scdl_issue_time_to = null;
	/** �� 17 �ϐ��F m_c1_ISSUE_TYP */
	public String m_c1_ISSUE_TYP = null;
	/** �� 18 �ϐ��F m_c2_ISSUE_TYP */
	public String m_c2_ISSUE_TYP = null;
	/** �� 19 �ϐ��F m_c3_ISSUE_TYP */
	public String m_c3_ISSUE_TYP = null;
	/** �� 20 �ϐ��F m_c_RE_PRINT */
	public String m_c_RE_PRINT = null;
	/** �� 21 �ϐ��F m_B_WH_CD */
	public String m_B_WH_CD = null;
	/** �� 22 �ϐ��F m_B_WH_NAME */
	public String m_B_WH_NAME = null;
	/** �� 23 �ϐ��F m_l_h_B_WH_CD */
	public String m_l_h_B_WH_CD = null;
	/** �� 24 �ϐ��F m_l_h_HAND_QTY */
	public String m_l_h_HAND_QTY = null;
	/** �� 25 �ϐ��F m_l_h_LOT_NO */
	public String m_l_h_LOT_NO = null;
	/** �� 26 �ϐ��F m_l_h_B_WH_NAME */
	public String m_l_h_B_WH_NAME = null;
	/** �� 27 �ϐ��F m_w_CHOICE */
	public String m_w_CHOICE = null;
	/** �� 28 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 29 �ϐ��F m_CONS_TYP_val */
	public String m_CONS_TYP_val = null;
	/** �� 30 �ϐ��F m_CONS_TYP_name */
	public String m_CONS_TYP_name = null;
	/** �� 31 �ϐ��F m_ISSUE_TYP_val */
	public String m_ISSUE_TYP_val = null;
	/** �� 32 �ϐ��F m_ISSUE_TYP_name */
	public String m_ISSUE_TYP_name = null;
	/** �� 33 �ϐ��F m_WS_PLANT_CD */
	public String m_WS_PLANT_CD = null;
	/** �� 34 �ϐ��F m_l_scdl_issue_date_from */
	public String m_l_scdl_issue_date_from = null;
	/** �� 35 �ϐ��F m_l_scdl_issue_date_from_ZERO */
	public String m_l_scdl_issue_date_from_ZERO = null;
	/** �� 36 �ϐ��F m_l_scdl_issue_date_to */
	public String m_l_scdl_issue_date_to = null;
	/** �� 37 �ϐ��F m_l_scdl_issue_date_to_ZERO */
	public String m_l_scdl_issue_date_to_ZERO = null;
	/** �� 38 �ϐ��F m_l_ISSUE_INST_CD */
	public String m_l_ISSUE_INST_CD = null;
	/** �� 39 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 40 �ϐ��F m_ISSUE_INST_QTY */
	public String m_ISSUE_INST_QTY = null;
	/** �� 41 �ϐ��F m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** �� 42 �ϐ��F m_w_SHIP_REMAIN_QTY */
	public String m_w_SHIP_REMAIN_QTY = null;
	/** �� 43 �ϐ��F m_SCDL_ISSUE_DATE */
	public String m_SCDL_ISSUE_DATE = null;
	/** �� 44 �ϐ��F m_ISSUE_CMPLT_DATE */
	public String m_ISSUE_CMPLT_DATE = null;
	/** �� 45 �ϐ��F m_ISSUE_CMPLT_FLG */
	public Integer m_ISSUE_CMPLT_FLG = null;
	/** �� 46 �ϐ��F m_ISSUE_TYP */
	public Integer m_ISSUE_TYP = null;
	/** �� 47 �ϐ��F m_l_WH_CD */
	public String m_l_WH_CD = null;
	/** �� 48 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 49 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 50 �ϐ��F m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** �� 51 �ϐ��F m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** �� 52 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 53 �ϐ��F m_CONS_TYP */
	public Integer m_CONS_TYP = null;
	/** �� 54 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 55 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 56 �ϐ��F m_ISSUE_INST_UNIT_DENOMINATOR */
	public String m_ISSUE_INST_UNIT_DENOMINATOR = null;
	/** �� 57 �ϐ��F m_ISSUE_INST_UNIT_NUMERATOR */
	public String m_ISSUE_INST_UNIT_NUMERATOR = null;
	/** �� 58 �ϐ��F m_ISSUE_INST_COMMENT */
	public String m_ISSUE_INST_COMMENT = null;
	/** �� 59 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 60 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 61 �ϐ��F m_l_WH_NAME */
	public String m_l_WH_NAME = null;
	/** �� 62 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 63 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 64 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 65 �ϐ��F m_OPR_INST_CD_item */
	public String m_OPR_INST_CD_item = null;
	/** �� 66 �ϐ��F m_OPR_INST_CD_proc */
	public String m_OPR_INST_CD_proc = null;
	/** �� 67 �ϐ��F m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** �� 68 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 69 �ϐ��F m_l_STATUS */
	public String m_l_STATUS = null;
	/** �� 70 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 71 �ϐ��F m_l_h_JOB_ODR_DETAIL_NO */
	public String m_l_h_JOB_ODR_DETAIL_NO = null;
	/** �� 72 �ϐ��F m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** �� 73 �ϐ��F m_w_WS_CD */
	public String m_w_WS_CD = null;
	/** �� 74 �ϐ��F m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** �� 75 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 76 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 77 �ϐ��F m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** �� 78 �ϐ��F m_STATUS1 */
	public String m_STATUS1 = null;
	/** �� 79 �ϐ��F m_STATUS2 */
	public String m_STATUS2 = null;
	/** �� 80 �ϐ��F m_STATUS3 */
	public String m_STATUS3 = null;
	/** �� 81 �ϐ��F m_STATUS4 */
	public String m_STATUS4 = null;
	/** �� 82 �ϐ��F m_STATUS5 */
	public String m_STATUS5 = null;
	/** �� 83 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 84 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 85 �ϐ��F m_ISSUE_TYP1 */
	public String m_ISSUE_TYP1 = null;
	/** �� 86 �ϐ��F m_ISSUE_TYP2 */
	public String m_ISSUE_TYP2 = null;
	/** �� 87 �ϐ��F m_ISSUE_TYP3 */
	public String m_ISSUE_TYP3 = null;
	/** �� 88 �ϐ��F m_ISSUE_INST_ISS_FLG */
	public String m_ISSUE_INST_ISS_FLG = null;
	/** �� 89 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 90 �ϐ��F m_w_WS_NAME */
	public String m_w_WS_NAME = null;
	/** �� 91 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 92 �ϐ��F m_w_VEND_ANAME */
	public String m_w_VEND_ANAME = null;
	/** �� 93 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 94 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 95 �ϐ��F m_OPR_INST_CD_GNR_TYP */
	public String m_OPR_INST_CD_GNR_TYP = null;
	/** �� 96 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 97 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 98 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 99 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 100 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 101 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ISSUE_CMPLT_NAME */
	public List l_ISSUE_CMPLT_NAME = null;

	/** �� 2 List�ϐ��F l_ISSUE_NAME */
	public List l_ISSUE_NAME = null;

	/** �� 3 List�ϐ��F l_CONS_NAME */
	public List l_CONS_NAME = null;

	/** �� 4 List�ϐ��F l_s_OPR_INST_CD */
	public List l_s_OPR_INST_CD = null;

	/** �� 5 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 6 List�ϐ��F l_scdl_issue_date_from */
	public List l_scdl_issue_date_from = null;

	/** �� 7 List�ϐ��F l_scdl_issue_date_to */
	public List l_scdl_issue_date_to = null;

	/** �� 8 List�ϐ��F l_h_issue_cmplt_flg */
	public List l_h_issue_cmplt_flg = null;

	/** �� 9 List�ϐ��F l_c1_WORK_STS_TYP */
	public List l_c1_WORK_STS_TYP = null;

	/** �� 10 List�ϐ��F l_c2_WORK_STS_TYP */
	public List l_c2_WORK_STS_TYP = null;

	/** �� 11 List�ϐ��F l_c3_WORK_STS_TYP */
	public List l_c3_WORK_STS_TYP = null;

	/** �� 12 List�ϐ��F l_c4_WORK_STS_TYP */
	public List l_c4_WORK_STS_TYP = null;

	/** �� 13 List�ϐ��F l_c5_WORK_STS_TYP */
	public List l_c5_WORK_STS_TYP = null;

	/** �� 14 List�ϐ��F l_l_STATUS_DN */
	public List l_l_STATUS_DN = null;

	/** �� 15 List�ϐ��F l_scdl_issue_time_from */
	public List l_scdl_issue_time_from = null;

	/** �� 16 List�ϐ��F l_scdl_issue_time_to */
	public List l_scdl_issue_time_to = null;

	/** �� 17 List�ϐ��F l_c1_ISSUE_TYP */
	public List l_c1_ISSUE_TYP = null;

	/** �� 18 List�ϐ��F l_c2_ISSUE_TYP */
	public List l_c2_ISSUE_TYP = null;

	/** �� 19 List�ϐ��F l_c3_ISSUE_TYP */
	public List l_c3_ISSUE_TYP = null;

	/** �� 20 List�ϐ��F l_c_RE_PRINT */
	public List l_c_RE_PRINT = null;

	/** �� 21 List�ϐ��F l_B_WH_CD */
	public List l_B_WH_CD = null;

	/** �� 22 List�ϐ��F l_B_WH_NAME */
	public List l_B_WH_NAME = null;

	/** �� 23 List�ϐ��F l_l_h_B_WH_CD */
	public List l_l_h_B_WH_CD = null;

	/** �� 24 List�ϐ��F l_l_h_HAND_QTY */
	public List l_l_h_HAND_QTY = null;

	/** �� 25 List�ϐ��F l_l_h_LOT_NO */
	public List l_l_h_LOT_NO = null;

	/** �� 26 List�ϐ��F l_l_h_B_WH_NAME */
	public List l_l_h_B_WH_NAME = null;

	/** �� 27 List�ϐ��F l_w_CHOICE */
	public List l_w_CHOICE = null;

	/** �� 28 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 29 List�ϐ��F l_CONS_TYP_val */
	public List l_CONS_TYP_val = null;

	/** �� 30 List�ϐ��F l_CONS_TYP_name */
	public List l_CONS_TYP_name = null;

	/** �� 31 List�ϐ��F l_ISSUE_TYP_val */
	public List l_ISSUE_TYP_val = null;

	/** �� 32 List�ϐ��F l_ISSUE_TYP_name */
	public List l_ISSUE_TYP_name = null;

	/** �� 33 List�ϐ��F l_WS_PLANT_CD */
	public List l_WS_PLANT_CD = null;

	/** �� 34 List�ϐ��F l_l_scdl_issue_date_from */
	public List l_l_scdl_issue_date_from = null;

	/** �� 35 List�ϐ��F l_l_scdl_issue_date_from_ZERO */
	public List l_l_scdl_issue_date_from_ZERO = null;

	/** �� 36 List�ϐ��F l_l_scdl_issue_date_to */
	public List l_l_scdl_issue_date_to = null;

	/** �� 37 List�ϐ��F l_l_scdl_issue_date_to_ZERO */
	public List l_l_scdl_issue_date_to_ZERO = null;

	/** �� 38 List�ϐ��F l_l_ISSUE_INST_CD */
	public List l_l_ISSUE_INST_CD = null;

	/** �� 39 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 40 List�ϐ��F l_ISSUE_INST_QTY */
	public List l_ISSUE_INST_QTY = null;

	/** �� 41 List�ϐ��F l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** �� 42 List�ϐ��F l_w_SHIP_REMAIN_QTY */
	public List l_w_SHIP_REMAIN_QTY = null;

	/** �� 43 List�ϐ��F l_SCDL_ISSUE_DATE */
	public List l_SCDL_ISSUE_DATE = null;

	/** �� 44 List�ϐ��F l_ISSUE_CMPLT_DATE */
	public List l_ISSUE_CMPLT_DATE = null;

	/** �� 45 List�ϐ��F l_ISSUE_CMPLT_FLG */
	public List l_ISSUE_CMPLT_FLG = null;

	/** �� 46 List�ϐ��F l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** �� 47 List�ϐ��F l_l_WH_CD */
	public List l_l_WH_CD = null;

	/** �� 48 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 49 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 50 List�ϐ��F l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** �� 51 List�ϐ��F l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** �� 52 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 53 List�ϐ��F l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** �� 54 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 55 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 56 List�ϐ��F l_ISSUE_INST_UNIT_DENOMINATOR */
	public List l_ISSUE_INST_UNIT_DENOMINATOR = null;

	/** �� 57 List�ϐ��F l_ISSUE_INST_UNIT_NUMERATOR */
	public List l_ISSUE_INST_UNIT_NUMERATOR = null;

	/** �� 58 List�ϐ��F l_ISSUE_INST_COMMENT */
	public List l_ISSUE_INST_COMMENT = null;

	/** �� 59 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 60 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 61 List�ϐ��F l_l_WH_NAME */
	public List l_l_WH_NAME = null;

	/** �� 62 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 63 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 64 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 65 List�ϐ��F l_OPR_INST_CD_item */
	public List l_OPR_INST_CD_item = null;

	/** �� 66 List�ϐ��F l_OPR_INST_CD_proc */
	public List l_OPR_INST_CD_proc = null;

	/** �� 67 List�ϐ��F l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** �� 68 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 69 List�ϐ��F l_l_STATUS */
	public List l_l_STATUS = null;

	/** �� 70 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 71 List�ϐ��F l_l_h_JOB_ODR_DETAIL_NO */
	public List l_l_h_JOB_ODR_DETAIL_NO = null;

	/** �� 72 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 73 List�ϐ��F l_w_WS_CD */
	public List l_w_WS_CD = null;

	/** �� 74 List�ϐ��F l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** �� 75 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 76 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 77 List�ϐ��F l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** �� 78 List�ϐ��F l_STATUS1 */
	public List l_STATUS1 = null;

	/** �� 79 List�ϐ��F l_STATUS2 */
	public List l_STATUS2 = null;

	/** �� 80 List�ϐ��F l_STATUS3 */
	public List l_STATUS3 = null;

	/** �� 81 List�ϐ��F l_STATUS4 */
	public List l_STATUS4 = null;

	/** �� 82 List�ϐ��F l_STATUS5 */
	public List l_STATUS5 = null;

	/** �� 83 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 84 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 85 List�ϐ��F l_ISSUE_TYP1 */
	public List l_ISSUE_TYP1 = null;

	/** �� 86 List�ϐ��F l_ISSUE_TYP2 */
	public List l_ISSUE_TYP2 = null;

	/** �� 87 List�ϐ��F l_ISSUE_TYP3 */
	public List l_ISSUE_TYP3 = null;

	/** �� 88 List�ϐ��F l_ISSUE_INST_ISS_FLG */
	public List l_ISSUE_INST_ISS_FLG = null;

	/** �� 89 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 90 List�ϐ��F l_w_WS_NAME */
	public List l_w_WS_NAME = null;

	/** �� 91 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 92 List�ϐ��F l_w_VEND_ANAME */
	public List l_w_VEND_ANAME = null;

	/** �� 93 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 94 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 95 List�ϐ��F l_OPR_INST_CD_GNR_TYP */
	public List l_OPR_INST_CD_GNR_TYP = null;

	/** �� 96 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 97 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 98 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 99 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 100 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 101 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getISSUE_CMPLT_NAME() { return m_ISSUE_CMPLT_NAME; }
	public String getISSUE_NAME() { return m_ISSUE_NAME; }
	public String getCONS_NAME() { return m_CONS_NAME; }
	public String gets_OPR_INST_CD() { return m_s_OPR_INST_CD; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getscdl_issue_date_from() { return m_scdl_issue_date_from; }
	public String getscdl_issue_date_to() { return m_scdl_issue_date_to; }
	public String geth_issue_cmplt_flg() { return m_h_issue_cmplt_flg; }
	public String getc1_WORK_STS_TYP() { return m_c1_WORK_STS_TYP; }
	public String getc2_WORK_STS_TYP() { return m_c2_WORK_STS_TYP; }
	public String getc3_WORK_STS_TYP() { return m_c3_WORK_STS_TYP; }
	public String getc4_WORK_STS_TYP() { return m_c4_WORK_STS_TYP; }
	public String getc5_WORK_STS_TYP() { return m_c5_WORK_STS_TYP; }
	public String getl_STATUS_DN() { return m_l_STATUS_DN; }
	public String getscdl_issue_time_from() { return m_scdl_issue_time_from; }
	public String getscdl_issue_time_to() { return m_scdl_issue_time_to; }
	public String getc1_ISSUE_TYP() { return m_c1_ISSUE_TYP; }
	public String getc2_ISSUE_TYP() { return m_c2_ISSUE_TYP; }
	public String getc3_ISSUE_TYP() { return m_c3_ISSUE_TYP; }
	public String getc_RE_PRINT() { return m_c_RE_PRINT; }
	public String getB_WH_CD() { return m_B_WH_CD; }
	public String getB_WH_NAME() { return m_B_WH_NAME; }
	public String getl_h_B_WH_CD() { return m_l_h_B_WH_CD; }
	public String getl_h_HAND_QTY() { return m_l_h_HAND_QTY; }
	public String getl_h_LOT_NO() { return m_l_h_LOT_NO; }
	public String getl_h_B_WH_NAME() { return m_l_h_B_WH_NAME; }
	public String getw_CHOICE() { return m_w_CHOICE; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getCONS_TYP_val() { return m_CONS_TYP_val; }
	public String getCONS_TYP_name() { return m_CONS_TYP_name; }
	public String getISSUE_TYP_val() { return m_ISSUE_TYP_val; }
	public String getISSUE_TYP_name() { return m_ISSUE_TYP_name; }
	public String getWS_PLANT_CD() { return m_WS_PLANT_CD; }
	public String getl_scdl_issue_date_from() { return m_l_scdl_issue_date_from; }
	public String getl_scdl_issue_date_from_ZERO() { return m_l_scdl_issue_date_from_ZERO; }
	public String getl_scdl_issue_date_to() { return m_l_scdl_issue_date_to; }
	public String getl_scdl_issue_date_to_ZERO() { return m_l_scdl_issue_date_to_ZERO; }
	public String getl_ISSUE_INST_CD() { return m_l_ISSUE_INST_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getISSUE_INST_QTY() { return m_ISSUE_INST_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getw_SHIP_REMAIN_QTY() { return m_w_SHIP_REMAIN_QTY; }
	public String getSCDL_ISSUE_DATE() { return m_SCDL_ISSUE_DATE; }
	public String getISSUE_CMPLT_DATE() { return m_ISSUE_CMPLT_DATE; }
	public Integer getISSUE_CMPLT_FLG() { return m_ISSUE_CMPLT_FLG; }
	public Integer getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getl_WH_CD() { return m_l_WH_CD; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public Integer getCONS_TYP() { return m_CONS_TYP; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getISSUE_INST_UNIT_DENOMINATOR() { return m_ISSUE_INST_UNIT_DENOMINATOR; }
	public String getISSUE_INST_UNIT_NUMERATOR() { return m_ISSUE_INST_UNIT_NUMERATOR; }
	public String getISSUE_INST_COMMENT() { return m_ISSUE_INST_COMMENT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_WH_NAME() { return m_l_WH_NAME; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getOPR_INST_CD_item() { return m_OPR_INST_CD_item; }
	public String getOPR_INST_CD_proc() { return m_OPR_INST_CD_proc; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getl_STATUS() { return m_l_STATUS; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getl_h_JOB_ODR_DETAIL_NO() { return m_l_h_JOB_ODR_DETAIL_NO; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_WS_CD() { return m_w_WS_CD; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getSTATUS1() { return m_STATUS1; }
	public String getSTATUS2() { return m_STATUS2; }
	public String getSTATUS3() { return m_STATUS3; }
	public String getSTATUS4() { return m_STATUS4; }
	public String getSTATUS5() { return m_STATUS5; }
	public String getWH_CD() { return m_WH_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getISSUE_TYP1() { return m_ISSUE_TYP1; }
	public String getISSUE_TYP2() { return m_ISSUE_TYP2; }
	public String getISSUE_TYP3() { return m_ISSUE_TYP3; }
	public String getISSUE_INST_ISS_FLG() { return m_ISSUE_INST_ISS_FLG; }
	public String getWS_CD() { return m_WS_CD; }
	public String getw_WS_NAME() { return m_w_WS_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getw_VEND_ANAME() { return m_w_VEND_ANAME; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getOPR_INST_CD_GNR_TYP() { return m_OPR_INST_CD_GNR_TYP; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getMRP_FLG() { return m_MRP_FLG; }

	public List getList_ISSUE_CMPLT_NAME() { return l_ISSUE_CMPLT_NAME; }
	public List getList_ISSUE_NAME() { return l_ISSUE_NAME; }
	public List getList_CONS_NAME() { return l_CONS_NAME; }
	public List getList_s_OPR_INST_CD() { return l_s_OPR_INST_CD; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_scdl_issue_date_from() { return l_scdl_issue_date_from; }
	public List getList_scdl_issue_date_to() { return l_scdl_issue_date_to; }
	public List getList_h_issue_cmplt_flg() { return l_h_issue_cmplt_flg; }
	public List getList_c1_WORK_STS_TYP() { return l_c1_WORK_STS_TYP; }
	public List getList_c2_WORK_STS_TYP() { return l_c2_WORK_STS_TYP; }
	public List getList_c3_WORK_STS_TYP() { return l_c3_WORK_STS_TYP; }
	public List getList_c4_WORK_STS_TYP() { return l_c4_WORK_STS_TYP; }
	public List getList_c5_WORK_STS_TYP() { return l_c5_WORK_STS_TYP; }
	public List getList_l_STATUS_DN() { return l_l_STATUS_DN; }
	public List getList_scdl_issue_time_from() { return l_scdl_issue_time_from; }
	public List getList_scdl_issue_time_to() { return l_scdl_issue_time_to; }
	public List getList_c1_ISSUE_TYP() { return l_c1_ISSUE_TYP; }
	public List getList_c2_ISSUE_TYP() { return l_c2_ISSUE_TYP; }
	public List getList_c3_ISSUE_TYP() { return l_c3_ISSUE_TYP; }
	public List getList_c_RE_PRINT() { return l_c_RE_PRINT; }
	public List getList_B_WH_CD() { return l_B_WH_CD; }
	public List getList_B_WH_NAME() { return l_B_WH_NAME; }
	public List getList_l_h_B_WH_CD() { return l_l_h_B_WH_CD; }
	public List getList_l_h_HAND_QTY() { return l_l_h_HAND_QTY; }
	public List getList_l_h_LOT_NO() { return l_l_h_LOT_NO; }
	public List getList_l_h_B_WH_NAME() { return l_l_h_B_WH_NAME; }
	public List getList_w_CHOICE() { return l_w_CHOICE; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_CONS_TYP_val() { return l_CONS_TYP_val; }
	public List getList_CONS_TYP_name() { return l_CONS_TYP_name; }
	public List getList_ISSUE_TYP_val() { return l_ISSUE_TYP_val; }
	public List getList_ISSUE_TYP_name() { return l_ISSUE_TYP_name; }
	public List getList_WS_PLANT_CD() { return l_WS_PLANT_CD; }
	public List getList_l_scdl_issue_date_from() { return l_l_scdl_issue_date_from; }
	public List getList_l_scdl_issue_date_from_ZERO() { return l_l_scdl_issue_date_from_ZERO; }
	public List getList_l_scdl_issue_date_to() { return l_l_scdl_issue_date_to; }
	public List getList_l_scdl_issue_date_to_ZERO() { return l_l_scdl_issue_date_to_ZERO; }
	public List getList_l_ISSUE_INST_CD() { return l_l_ISSUE_INST_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_ISSUE_INST_QTY() { return l_ISSUE_INST_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_w_SHIP_REMAIN_QTY() { return l_w_SHIP_REMAIN_QTY; }
	public List getList_SCDL_ISSUE_DATE() { return l_SCDL_ISSUE_DATE; }
	public List getList_ISSUE_CMPLT_DATE() { return l_ISSUE_CMPLT_DATE; }
	public List getList_ISSUE_CMPLT_FLG() { return l_ISSUE_CMPLT_FLG; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_l_WH_CD() { return l_l_WH_CD; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_ISSUE_INST_UNIT_DENOMINATOR() { return l_ISSUE_INST_UNIT_DENOMINATOR; }
	public List getList_ISSUE_INST_UNIT_NUMERATOR() { return l_ISSUE_INST_UNIT_NUMERATOR; }
	public List getList_ISSUE_INST_COMMENT() { return l_ISSUE_INST_COMMENT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_WH_NAME() { return l_l_WH_NAME; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_OPR_INST_CD_item() { return l_OPR_INST_CD_item; }
	public List getList_OPR_INST_CD_proc() { return l_OPR_INST_CD_proc; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_l_STATUS() { return l_l_STATUS; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_l_h_JOB_ODR_DETAIL_NO() { return l_l_h_JOB_ODR_DETAIL_NO; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_WS_CD() { return l_w_WS_CD; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_STATUS1() { return l_STATUS1; }
	public List getList_STATUS2() { return l_STATUS2; }
	public List getList_STATUS3() { return l_STATUS3; }
	public List getList_STATUS4() { return l_STATUS4; }
	public List getList_STATUS5() { return l_STATUS5; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ISSUE_TYP1() { return l_ISSUE_TYP1; }
	public List getList_ISSUE_TYP2() { return l_ISSUE_TYP2; }
	public List getList_ISSUE_TYP3() { return l_ISSUE_TYP3; }
	public List getList_ISSUE_INST_ISS_FLG() { return l_ISSUE_INST_ISS_FLG; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_w_WS_NAME() { return l_w_WS_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_w_VEND_ANAME() { return l_w_VEND_ANAME; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_OPR_INST_CD_GNR_TYP() { return l_OPR_INST_CD_GNR_TYP; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }

	public void setISSUE_CMPLT_NAME(String val) { m_ISSUE_CMPLT_NAME = val; }
	public void setISSUE_NAME(String val) { m_ISSUE_NAME = val; }
	public void setCONS_NAME(String val) { m_CONS_NAME = val; }
	public void sets_OPR_INST_CD(String val) { m_s_OPR_INST_CD = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setscdl_issue_date_from(String val) { m_scdl_issue_date_from = val; }
	public void setscdl_issue_date_to(String val) { m_scdl_issue_date_to = val; }
	public void seth_issue_cmplt_flg(String val) { m_h_issue_cmplt_flg = val; }
	public void setc1_WORK_STS_TYP(String val) { m_c1_WORK_STS_TYP = val; }
	public void setc2_WORK_STS_TYP(String val) { m_c2_WORK_STS_TYP = val; }
	public void setc3_WORK_STS_TYP(String val) { m_c3_WORK_STS_TYP = val; }
	public void setc4_WORK_STS_TYP(String val) { m_c4_WORK_STS_TYP = val; }
	public void setc5_WORK_STS_TYP(String val) { m_c5_WORK_STS_TYP = val; }
	public void setl_STATUS_DN(String val) { m_l_STATUS_DN = val; }
	public void setscdl_issue_time_from(String val) { m_scdl_issue_time_from = val; }
	public void setscdl_issue_time_to(String val) { m_scdl_issue_time_to = val; }
	public void setc1_ISSUE_TYP(String val) { m_c1_ISSUE_TYP = val; }
	public void setc2_ISSUE_TYP(String val) { m_c2_ISSUE_TYP = val; }
	public void setc3_ISSUE_TYP(String val) { m_c3_ISSUE_TYP = val; }
	public void setc_RE_PRINT(String val) { m_c_RE_PRINT = val; }
	public void setB_WH_CD(String val) { m_B_WH_CD = val; }
	public void setB_WH_NAME(String val) { m_B_WH_NAME = val; }
	public void setl_h_B_WH_CD(String val) { m_l_h_B_WH_CD = val; }
	public void setl_h_HAND_QTY(String val) { m_l_h_HAND_QTY = val; }
	public void setl_h_LOT_NO(String val) { m_l_h_LOT_NO = val; }
	public void setl_h_B_WH_NAME(String val) { m_l_h_B_WH_NAME = val; }
	public void setw_CHOICE(String val) { m_w_CHOICE = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setCONS_TYP_val(String val) { m_CONS_TYP_val = val; }
	public void setCONS_TYP_name(String val) { m_CONS_TYP_name = val; }
	public void setISSUE_TYP_val(String val) { m_ISSUE_TYP_val = val; }
	public void setISSUE_TYP_name(String val) { m_ISSUE_TYP_name = val; }
	public void setWS_PLANT_CD(String val) { m_WS_PLANT_CD = val; }
	public void setl_scdl_issue_date_from(String val) { m_l_scdl_issue_date_from = val; }
	public void setl_scdl_issue_date_from_ZERO(String val) { m_l_scdl_issue_date_from_ZERO = val; }
	public void setl_scdl_issue_date_to(String val) { m_l_scdl_issue_date_to = val; }
	public void setl_scdl_issue_date_to_ZERO(String val) { m_l_scdl_issue_date_to_ZERO = val; }
	public void setl_ISSUE_INST_CD(String val) { m_l_ISSUE_INST_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setISSUE_INST_QTY(String val) { m_ISSUE_INST_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setw_SHIP_REMAIN_QTY(String val) { m_w_SHIP_REMAIN_QTY = val; }
	public void setSCDL_ISSUE_DATE(String val) { m_SCDL_ISSUE_DATE = val; }
	public void setISSUE_CMPLT_DATE(String val) { m_ISSUE_CMPLT_DATE = val; }
	public void setISSUE_CMPLT_FLG(Integer val) { m_ISSUE_CMPLT_FLG = val; }
	public void setISSUE_TYP(Integer val) { m_ISSUE_TYP = val; }
	public void setl_WH_CD(String val) { m_l_WH_CD = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setCONS_TYP(Integer val) { m_CONS_TYP = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setISSUE_INST_UNIT_DENOMINATOR(String val) { m_ISSUE_INST_UNIT_DENOMINATOR = val; }
	public void setISSUE_INST_UNIT_NUMERATOR(String val) { m_ISSUE_INST_UNIT_NUMERATOR = val; }
	public void setISSUE_INST_COMMENT(String val) { m_ISSUE_INST_COMMENT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_WH_NAME(String val) { m_l_WH_NAME = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setOPR_INST_CD_item(String val) { m_OPR_INST_CD_item = val; }
	public void setOPR_INST_CD_proc(String val) { m_OPR_INST_CD_proc = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setl_STATUS(String val) { m_l_STATUS = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setl_h_JOB_ODR_DETAIL_NO(String val) { m_l_h_JOB_ODR_DETAIL_NO = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_WS_CD(String val) { m_w_WS_CD = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setSTATUS1(String val) { m_STATUS1 = val; }
	public void setSTATUS2(String val) { m_STATUS2 = val; }
	public void setSTATUS3(String val) { m_STATUS3 = val; }
	public void setSTATUS4(String val) { m_STATUS4 = val; }
	public void setSTATUS5(String val) { m_STATUS5 = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setISSUE_TYP1(String val) { m_ISSUE_TYP1 = val; }
	public void setISSUE_TYP2(String val) { m_ISSUE_TYP2 = val; }
	public void setISSUE_TYP3(String val) { m_ISSUE_TYP3 = val; }
	public void setISSUE_INST_ISS_FLG(String val) { m_ISSUE_INST_ISS_FLG = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setw_WS_NAME(String val) { m_w_WS_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setw_VEND_ANAME(String val) { m_w_VEND_ANAME = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setOPR_INST_CD_GNR_TYP(String val) { m_OPR_INST_CD_GNR_TYP = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }

	public void setISSUE_CMPLT_FLG(String val) { m_ISSUE_CMPLT_FLG = getInteger(val); }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = getInteger(val); }
	public void setCONS_TYP(String val) { m_CONS_TYP = getInteger(val); }

	public void setList_ISSUE_CMPLT_NAME(List list) { l_ISSUE_CMPLT_NAME = list; }
	public void setList_ISSUE_NAME(List list) { l_ISSUE_NAME = list; }
	public void setList_CONS_NAME(List list) { l_CONS_NAME = list; }
	public void setList_s_OPR_INST_CD(List list) { l_s_OPR_INST_CD = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_scdl_issue_date_from(List list) { l_scdl_issue_date_from = list; }
	public void setList_scdl_issue_date_to(List list) { l_scdl_issue_date_to = list; }
	public void setList_h_issue_cmplt_flg(List list) { l_h_issue_cmplt_flg = list; }
	public void setList_c1_WORK_STS_TYP(List list) { l_c1_WORK_STS_TYP = list; }
	public void setList_c2_WORK_STS_TYP(List list) { l_c2_WORK_STS_TYP = list; }
	public void setList_c3_WORK_STS_TYP(List list) { l_c3_WORK_STS_TYP = list; }
	public void setList_c4_WORK_STS_TYP(List list) { l_c4_WORK_STS_TYP = list; }
	public void setList_c5_WORK_STS_TYP(List list) { l_c5_WORK_STS_TYP = list; }
	public void setList_l_STATUS_DN(List list) { l_l_STATUS_DN = list; }
	public void setList_scdl_issue_time_from(List list) { l_scdl_issue_time_from = list; }
	public void setList_scdl_issue_time_to(List list) { l_scdl_issue_time_to = list; }
	public void setList_c1_ISSUE_TYP(List list) { l_c1_ISSUE_TYP = list; }
	public void setList_c2_ISSUE_TYP(List list) { l_c2_ISSUE_TYP = list; }
	public void setList_c3_ISSUE_TYP(List list) { l_c3_ISSUE_TYP = list; }
	public void setList_c_RE_PRINT(List list) { l_c_RE_PRINT = list; }
	public void setList_B_WH_CD(List list) { l_B_WH_CD = list; }
	public void setList_B_WH_NAME(List list) { l_B_WH_NAME = list; }
	public void setList_l_h_B_WH_CD(List list) { l_l_h_B_WH_CD = list; }
	public void setList_l_h_HAND_QTY(List list) { l_l_h_HAND_QTY = list; }
	public void setList_l_h_LOT_NO(List list) { l_l_h_LOT_NO = list; }
	public void setList_l_h_B_WH_NAME(List list) { l_l_h_B_WH_NAME = list; }
	public void setList_w_CHOICE(List list) { l_w_CHOICE = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_CONS_TYP_val(List list) { l_CONS_TYP_val = list; }
	public void setList_CONS_TYP_name(List list) { l_CONS_TYP_name = list; }
	public void setList_ISSUE_TYP_val(List list) { l_ISSUE_TYP_val = list; }
	public void setList_ISSUE_TYP_name(List list) { l_ISSUE_TYP_name = list; }
	public void setList_WS_PLANT_CD(List list) { l_WS_PLANT_CD = list; }
	public void setList_l_scdl_issue_date_from(List list) { l_l_scdl_issue_date_from = list; }
	public void setList_l_scdl_issue_date_from_ZERO(List list) { l_l_scdl_issue_date_from_ZERO = list; }
	public void setList_l_scdl_issue_date_to(List list) { l_l_scdl_issue_date_to = list; }
	public void setList_l_scdl_issue_date_to_ZERO(List list) { l_l_scdl_issue_date_to_ZERO = list; }
	public void setList_l_ISSUE_INST_CD(List list) { l_l_ISSUE_INST_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_ISSUE_INST_QTY(List list) { l_ISSUE_INST_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_w_SHIP_REMAIN_QTY(List list) { l_w_SHIP_REMAIN_QTY = list; }
	public void setList_SCDL_ISSUE_DATE(List list) { l_SCDL_ISSUE_DATE = list; }
	public void setList_ISSUE_CMPLT_DATE(List list) { l_ISSUE_CMPLT_DATE = list; }
	public void setList_ISSUE_CMPLT_FLG(List list) { l_ISSUE_CMPLT_FLG = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_l_WH_CD(List list) { l_l_WH_CD = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_ISSUE_INST_UNIT_DENOMINATOR(List list) { l_ISSUE_INST_UNIT_DENOMINATOR = list; }
	public void setList_ISSUE_INST_UNIT_NUMERATOR(List list) { l_ISSUE_INST_UNIT_NUMERATOR = list; }
	public void setList_ISSUE_INST_COMMENT(List list) { l_ISSUE_INST_COMMENT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_WH_NAME(List list) { l_l_WH_NAME = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_OPR_INST_CD_item(List list) { l_OPR_INST_CD_item = list; }
	public void setList_OPR_INST_CD_proc(List list) { l_OPR_INST_CD_proc = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_l_STATUS(List list) { l_l_STATUS = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_l_h_JOB_ODR_DETAIL_NO(List list) { l_l_h_JOB_ODR_DETAIL_NO = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_WS_CD(List list) { l_w_WS_CD = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_STATUS1(List list) { l_STATUS1 = list; }
	public void setList_STATUS2(List list) { l_STATUS2 = list; }
	public void setList_STATUS3(List list) { l_STATUS3 = list; }
	public void setList_STATUS4(List list) { l_STATUS4 = list; }
	public void setList_STATUS5(List list) { l_STATUS5 = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ISSUE_TYP1(List list) { l_ISSUE_TYP1 = list; }
	public void setList_ISSUE_TYP2(List list) { l_ISSUE_TYP2 = list; }
	public void setList_ISSUE_TYP3(List list) { l_ISSUE_TYP3 = list; }
	public void setList_ISSUE_INST_ISS_FLG(List list) { l_ISSUE_INST_ISS_FLG = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_w_WS_NAME(List list) { l_w_WS_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_w_VEND_ANAME(List list) { l_w_VEND_ANAME = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_OPR_INST_CD_GNR_TYP(List list) { l_OPR_INST_CD_GNR_TYP = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }

	public int setL2L_ISSUE_CMPLT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_NAME == null) {
			l_ISSUE_CMPLT_NAME = new ArrayList();
		} else {
			l_ISSUE_CMPLT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_NAME.add(((AF0010010Struct) list.get(i)).getISSUE_CMPLT_NAME());
		}
		return size;
	}
	public int setL2L_ISSUE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_NAME == null) {
			l_ISSUE_NAME = new ArrayList();
		} else {
			l_ISSUE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_NAME.add(((AF0010010Struct) list.get(i)).getISSUE_NAME());
		}
		return size;
	}
	public int setL2L_CONS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_NAME == null) {
			l_CONS_NAME = new ArrayList();
		} else {
			l_CONS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_NAME.add(((AF0010010Struct) list.get(i)).getCONS_NAME());
		}
		return size;
	}
	public int setL2L_s_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OPR_INST_CD == null) {
			l_s_OPR_INST_CD = new ArrayList();
		} else {
			l_s_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OPR_INST_CD.add(((AF0010010Struct) list.get(i)).gets_OPR_INST_CD());
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
			l_DOWNLOAD_FILE.add(((AF0010010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_scdl_issue_date_from(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_scdl_issue_date_from == null) {
			l_scdl_issue_date_from = new ArrayList();
		} else {
			l_scdl_issue_date_from.clear();
		}
		for (int i = 0; i < size; i++) {
			l_scdl_issue_date_from.add(((AF0010010Struct) list.get(i)).getscdl_issue_date_from());
		}
		return size;
	}
	public int setL2L_scdl_issue_date_to(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_scdl_issue_date_to == null) {
			l_scdl_issue_date_to = new ArrayList();
		} else {
			l_scdl_issue_date_to.clear();
		}
		for (int i = 0; i < size; i++) {
			l_scdl_issue_date_to.add(((AF0010010Struct) list.get(i)).getscdl_issue_date_to());
		}
		return size;
	}
	public int setL2L_h_issue_cmplt_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_issue_cmplt_flg == null) {
			l_h_issue_cmplt_flg = new ArrayList();
		} else {
			l_h_issue_cmplt_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_issue_cmplt_flg.add(((AF0010010Struct) list.get(i)).geth_issue_cmplt_flg());
		}
		return size;
	}
	public int setL2L_c1_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_WORK_STS_TYP == null) {
			l_c1_WORK_STS_TYP = new ArrayList();
		} else {
			l_c1_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_WORK_STS_TYP.add(((AF0010010Struct) list.get(i)).getc1_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c2_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_WORK_STS_TYP == null) {
			l_c2_WORK_STS_TYP = new ArrayList();
		} else {
			l_c2_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_WORK_STS_TYP.add(((AF0010010Struct) list.get(i)).getc2_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c3_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_WORK_STS_TYP == null) {
			l_c3_WORK_STS_TYP = new ArrayList();
		} else {
			l_c3_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_WORK_STS_TYP.add(((AF0010010Struct) list.get(i)).getc3_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c4_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c4_WORK_STS_TYP == null) {
			l_c4_WORK_STS_TYP = new ArrayList();
		} else {
			l_c4_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c4_WORK_STS_TYP.add(((AF0010010Struct) list.get(i)).getc4_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c5_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c5_WORK_STS_TYP == null) {
			l_c5_WORK_STS_TYP = new ArrayList();
		} else {
			l_c5_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c5_WORK_STS_TYP.add(((AF0010010Struct) list.get(i)).getc5_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_STATUS_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS_DN == null) {
			l_l_STATUS_DN = new ArrayList();
		} else {
			l_l_STATUS_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS_DN.add(((AF0010010Struct) list.get(i)).getl_STATUS_DN());
		}
		return size;
	}
	public int setL2L_scdl_issue_time_from(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_scdl_issue_time_from == null) {
			l_scdl_issue_time_from = new ArrayList();
		} else {
			l_scdl_issue_time_from.clear();
		}
		for (int i = 0; i < size; i++) {
			l_scdl_issue_time_from.add(((AF0010010Struct) list.get(i)).getscdl_issue_time_from());
		}
		return size;
	}
	public int setL2L_scdl_issue_time_to(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_scdl_issue_time_to == null) {
			l_scdl_issue_time_to = new ArrayList();
		} else {
			l_scdl_issue_time_to.clear();
		}
		for (int i = 0; i < size; i++) {
			l_scdl_issue_time_to.add(((AF0010010Struct) list.get(i)).getscdl_issue_time_to());
		}
		return size;
	}
	public int setL2L_c1_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_ISSUE_TYP == null) {
			l_c1_ISSUE_TYP = new ArrayList();
		} else {
			l_c1_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_ISSUE_TYP.add(((AF0010010Struct) list.get(i)).getc1_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_c2_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_ISSUE_TYP == null) {
			l_c2_ISSUE_TYP = new ArrayList();
		} else {
			l_c2_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_ISSUE_TYP.add(((AF0010010Struct) list.get(i)).getc2_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_c3_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_ISSUE_TYP == null) {
			l_c3_ISSUE_TYP = new ArrayList();
		} else {
			l_c3_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_ISSUE_TYP.add(((AF0010010Struct) list.get(i)).getc3_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_c_RE_PRINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_RE_PRINT == null) {
			l_c_RE_PRINT = new ArrayList();
		} else {
			l_c_RE_PRINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_RE_PRINT.add(((AF0010010Struct) list.get(i)).getc_RE_PRINT());
		}
		return size;
	}
	public int setL2L_B_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_B_WH_CD == null) {
			l_B_WH_CD = new ArrayList();
		} else {
			l_B_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_B_WH_CD.add(((AF0010010Struct) list.get(i)).getB_WH_CD());
		}
		return size;
	}
	public int setL2L_B_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_B_WH_NAME == null) {
			l_B_WH_NAME = new ArrayList();
		} else {
			l_B_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_B_WH_NAME.add(((AF0010010Struct) list.get(i)).getB_WH_NAME());
		}
		return size;
	}
	public int setL2L_l_h_B_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_B_WH_CD == null) {
			l_l_h_B_WH_CD = new ArrayList();
		} else {
			l_l_h_B_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_B_WH_CD.add(((AF0010010Struct) list.get(i)).getl_h_B_WH_CD());
		}
		return size;
	}
	public int setL2L_l_h_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_HAND_QTY == null) {
			l_l_h_HAND_QTY = new ArrayList();
		} else {
			l_l_h_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_HAND_QTY.add(((AF0010010Struct) list.get(i)).getl_h_HAND_QTY());
		}
		return size;
	}
	public int setL2L_l_h_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_LOT_NO == null) {
			l_l_h_LOT_NO = new ArrayList();
		} else {
			l_l_h_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_LOT_NO.add(((AF0010010Struct) list.get(i)).getl_h_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_h_B_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_B_WH_NAME == null) {
			l_l_h_B_WH_NAME = new ArrayList();
		} else {
			l_l_h_B_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_B_WH_NAME.add(((AF0010010Struct) list.get(i)).getl_h_B_WH_NAME());
		}
		return size;
	}
	public int setL2L_w_CHOICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHOICE == null) {
			l_w_CHOICE = new ArrayList();
		} else {
			l_w_CHOICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHOICE.add(((AF0010010Struct) list.get(i)).getw_CHOICE());
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
			l_w_PLANT_CD.add(((AF0010010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP_val == null) {
			l_CONS_TYP_val = new ArrayList();
		} else {
			l_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP_val.add(((AF0010010Struct) list.get(i)).getCONS_TYP_val());
		}
		return size;
	}
	public int setL2L_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP_name == null) {
			l_CONS_TYP_name = new ArrayList();
		} else {
			l_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP_name.add(((AF0010010Struct) list.get(i)).getCONS_TYP_name());
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
			l_ISSUE_TYP_val.add(((AF0010010Struct) list.get(i)).getISSUE_TYP_val());
		}
		return size;
	}
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
			l_ISSUE_TYP_name.add(((AF0010010Struct) list.get(i)).getISSUE_TYP_name());
		}
		return size;
	}
	public int setL2L_WS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_PLANT_CD == null) {
			l_WS_PLANT_CD = new ArrayList();
		} else {
			l_WS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_PLANT_CD.add(((AF0010010Struct) list.get(i)).getWS_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_scdl_issue_date_from(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_scdl_issue_date_from == null) {
			l_l_scdl_issue_date_from = new ArrayList();
		} else {
			l_l_scdl_issue_date_from.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_scdl_issue_date_from.add(((AF0010010Struct) list.get(i)).getl_scdl_issue_date_from());
		}
		return size;
	}
	public int setL2L_l_scdl_issue_date_from_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_scdl_issue_date_from_ZERO == null) {
			l_l_scdl_issue_date_from_ZERO = new ArrayList();
		} else {
			l_l_scdl_issue_date_from_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_scdl_issue_date_from_ZERO.add(((AF0010010Struct) list.get(i)).getl_scdl_issue_date_from_ZERO());
		}
		return size;
	}
	public int setL2L_l_scdl_issue_date_to(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_scdl_issue_date_to == null) {
			l_l_scdl_issue_date_to = new ArrayList();
		} else {
			l_l_scdl_issue_date_to.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_scdl_issue_date_to.add(((AF0010010Struct) list.get(i)).getl_scdl_issue_date_to());
		}
		return size;
	}
	public int setL2L_l_scdl_issue_date_to_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_scdl_issue_date_to_ZERO == null) {
			l_l_scdl_issue_date_to_ZERO = new ArrayList();
		} else {
			l_l_scdl_issue_date_to_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_scdl_issue_date_to_ZERO.add(((AF0010010Struct) list.get(i)).getl_scdl_issue_date_to_ZERO());
		}
		return size;
	}
	public int setL2L_l_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_INST_CD == null) {
			l_l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_INST_CD.add(((AF0010010Struct) list.get(i)).getl_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_CD == null) {
			l_l_ITEM_CD = new ArrayList();
		} else {
			l_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_CD.add(((AF0010010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_QTY == null) {
			l_ISSUE_INST_QTY = new ArrayList();
		} else {
			l_ISSUE_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_QTY.add(((AF0010010Struct) list.get(i)).getISSUE_INST_QTY());
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
			l_TOTAL_ISSUE_QTY.add(((AF0010010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_w_SHIP_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_REMAIN_QTY == null) {
			l_w_SHIP_REMAIN_QTY = new ArrayList();
		} else {
			l_w_SHIP_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_REMAIN_QTY.add(((AF0010010Struct) list.get(i)).getw_SHIP_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_DATE == null) {
			l_SCDL_ISSUE_DATE = new ArrayList();
		} else {
			l_SCDL_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_DATE.add(((AF0010010Struct) list.get(i)).getSCDL_ISSUE_DATE());
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
			l_ISSUE_CMPLT_DATE.add(((AF0010010Struct) list.get(i)).getISSUE_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_FLG == null) {
			l_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_FLG.add(((AF0010010Struct) list.get(i)).getISSUE_CMPLT_FLG());
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
			l_ISSUE_TYP.add(((AF0010010Struct) list.get(i)).getISSUE_TYP());
		}
		return size;
	}
	public int setL2L_l_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_CD == null) {
			l_l_WH_CD = new ArrayList();
		} else {
			l_l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_CD.add(((AF0010010Struct) list.get(i)).getl_WH_CD());
		}
		return size;
	}
	public int setL2L_l_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_CD == null) {
			l_l_WS_CD = new ArrayList();
		} else {
			l_l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_CD.add(((AF0010010Struct) list.get(i)).getl_WS_CD());
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
			l_WORK_ODR_CD.add(((AF0010010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_WORK_IN_PROC_CD.add(((AF0010010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AF0010010Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AF0010010Struct) list.get(i)).getl_VEND_CD());
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
			l_CONS_TYP.add(((AF0010010Struct) list.get(i)).getCONS_TYP());
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
			l_OD_NO.add(((AF0010010Struct) list.get(i)).getOD_NO());
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
			l_PS_EDITION.add(((AF0010010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_DENOMINATOR == null) {
			l_ISSUE_INST_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_DENOMINATOR.add(((AF0010010Struct) list.get(i)).getISSUE_INST_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_NUMERATOR == null) {
			l_ISSUE_INST_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_NUMERATOR.add(((AF0010010Struct) list.get(i)).getISSUE_INST_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_COMMENT == null) {
			l_ISSUE_INST_COMMENT = new ArrayList();
		} else {
			l_ISSUE_INST_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_COMMENT.add(((AF0010010Struct) list.get(i)).getISSUE_INST_COMMENT());
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
			l_JOB_ODR_CD.add(((AF0010010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_NAME == null) {
			l_l_ITEM_NAME = new ArrayList();
		} else {
			l_l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_NAME.add(((AF0010010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_NAME == null) {
			l_l_WH_NAME = new ArrayList();
		} else {
			l_l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_NAME.add(((AF0010010Struct) list.get(i)).getl_WH_NAME());
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
			l_WS_NAME.add(((AF0010010Struct) list.get(i)).getWS_NAME());
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
			l_VEND_ANAME.add(((AF0010010Struct) list.get(i)).getVEND_ANAME());
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
			l_PROC_NAME.add(((AF0010010Struct) list.get(i)).getPROC_NAME());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_item == null) {
			l_OPR_INST_CD_item = new ArrayList();
		} else {
			l_OPR_INST_CD_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_item.add(((AF0010010Struct) list.get(i)).getOPR_INST_CD_item());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_proc(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_proc == null) {
			l_OPR_INST_CD_proc = new ArrayList();
		} else {
			l_OPR_INST_CD_proc.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_proc.add(((AF0010010Struct) list.get(i)).getOPR_INST_CD_proc());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AF0010010Struct) list.get(i)).getl_PLANT_CD());
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
			l_STOCK_UNIT.add(((AF0010010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS == null) {
			l_l_STATUS = new ArrayList();
		} else {
			l_l_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS.add(((AF0010010Struct) list.get(i)).getl_STATUS());
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
			l_MRP_ODR_TYP.add(((AF0010010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_h_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_JOB_ODR_DETAIL_NO == null) {
			l_l_h_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_l_h_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_JOB_ODR_DETAIL_NO.add(((AF0010010Struct) list.get(i)).getl_h_JOB_ODR_DETAIL_NO());
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
			l_LOT_CTRL_FLG.add(((AF0010010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_w_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WS_CD == null) {
			l_w_WS_CD = new ArrayList();
		} else {
			l_w_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WS_CD.add(((AF0010010Struct) list.get(i)).getw_WS_CD());
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
			l_w_VEND_CD.add(((AF0010010Struct) list.get(i)).getw_VEND_CD());
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
			l_PLANT_CD.add(((AF0010010Struct) list.get(i)).getPLANT_CD());
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
			l_PUCH_ODR_CD.add(((AF0010010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ISSUE_INST_CD.add(((AF0010010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_STATUS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS1 == null) {
			l_STATUS1 = new ArrayList();
		} else {
			l_STATUS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS1.add(((AF0010010Struct) list.get(i)).getSTATUS1());
		}
		return size;
	}
	public int setL2L_STATUS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS2 == null) {
			l_STATUS2 = new ArrayList();
		} else {
			l_STATUS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS2.add(((AF0010010Struct) list.get(i)).getSTATUS2());
		}
		return size;
	}
	public int setL2L_STATUS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS3 == null) {
			l_STATUS3 = new ArrayList();
		} else {
			l_STATUS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS3.add(((AF0010010Struct) list.get(i)).getSTATUS3());
		}
		return size;
	}
	public int setL2L_STATUS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS4 == null) {
			l_STATUS4 = new ArrayList();
		} else {
			l_STATUS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS4.add(((AF0010010Struct) list.get(i)).getSTATUS4());
		}
		return size;
	}
	public int setL2L_STATUS5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS5 == null) {
			l_STATUS5 = new ArrayList();
		} else {
			l_STATUS5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS5.add(((AF0010010Struct) list.get(i)).getSTATUS5());
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
			l_WH_CD.add(((AF0010010Struct) list.get(i)).getWH_CD());
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
			l_ITEM_CD.add(((AF0010010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP1 == null) {
			l_ISSUE_TYP1 = new ArrayList();
		} else {
			l_ISSUE_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP1.add(((AF0010010Struct) list.get(i)).getISSUE_TYP1());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP2 == null) {
			l_ISSUE_TYP2 = new ArrayList();
		} else {
			l_ISSUE_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP2.add(((AF0010010Struct) list.get(i)).getISSUE_TYP2());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP3 == null) {
			l_ISSUE_TYP3 = new ArrayList();
		} else {
			l_ISSUE_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP3.add(((AF0010010Struct) list.get(i)).getISSUE_TYP3());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_ISS_FLG == null) {
			l_ISSUE_INST_ISS_FLG = new ArrayList();
		} else {
			l_ISSUE_INST_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_ISS_FLG.add(((AF0010010Struct) list.get(i)).getISSUE_INST_ISS_FLG());
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
			l_WS_CD.add(((AF0010010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_w_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WS_NAME == null) {
			l_w_WS_NAME = new ArrayList();
		} else {
			l_w_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WS_NAME.add(((AF0010010Struct) list.get(i)).getw_WS_NAME());
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
			l_VEND_CD.add(((AF0010010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_w_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VEND_ANAME == null) {
			l_w_VEND_ANAME = new ArrayList();
		} else {
			l_w_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VEND_ANAME.add(((AF0010010Struct) list.get(i)).getw_VEND_ANAME());
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
			l_PLANT_NAME.add(((AF0010010Struct) list.get(i)).getPLANT_NAME());
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
			l_OPR_INST_CD.add(((AF0010010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_GNR_TYP == null) {
			l_OPR_INST_CD_GNR_TYP = new ArrayList();
		} else {
			l_OPR_INST_CD_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_GNR_TYP.add(((AF0010010Struct) list.get(i)).getOPR_INST_CD_GNR_TYP());
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
			l_TIME_CTRL.add(((AF0010010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AF0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AF0010010Struct) list.get(i)).getROW_COUNT());
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
			l_WH_NAME.add(((AF0010010Struct) list.get(i)).getWH_NAME());
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
			l_ITEM_NAME.add(((AF0010010Struct) list.get(i)).getITEM_NAME());
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
			l_MRP_FLG.add(((AF0010010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ISSUE_CMPLT_NAME = null;
		m_ISSUE_NAME = null;
		m_CONS_NAME = null;
		m_s_OPR_INST_CD = null;
		m_DOWNLOAD_FILE = null;
		m_scdl_issue_date_from = null;
		m_scdl_issue_date_to = null;
		m_h_issue_cmplt_flg = null;
		m_c1_WORK_STS_TYP = null;
		m_c2_WORK_STS_TYP = null;
		m_c3_WORK_STS_TYP = null;
		m_c4_WORK_STS_TYP = null;
		m_c5_WORK_STS_TYP = null;
		m_l_STATUS_DN = null;
		m_scdl_issue_time_from = null;
		m_scdl_issue_time_to = null;
		m_c1_ISSUE_TYP = null;
		m_c2_ISSUE_TYP = null;
		m_c3_ISSUE_TYP = null;
		m_c_RE_PRINT = null;
		m_B_WH_CD = null;
		m_B_WH_NAME = null;
		m_l_h_B_WH_CD = null;
		m_l_h_HAND_QTY = null;
		m_l_h_LOT_NO = null;
		m_l_h_B_WH_NAME = null;
		m_w_CHOICE = null;
		m_w_PLANT_CD = null;
		m_CONS_TYP_val = null;
		m_CONS_TYP_name = null;
		m_ISSUE_TYP_val = null;
		m_ISSUE_TYP_name = null;
		m_WS_PLANT_CD = null;
		m_l_scdl_issue_date_from = null;
		m_l_scdl_issue_date_from_ZERO = null;
		m_l_scdl_issue_date_to = null;
		m_l_scdl_issue_date_to_ZERO = null;
		m_l_ISSUE_INST_CD = null;
		m_l_ITEM_CD = null;
		m_ISSUE_INST_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_w_SHIP_REMAIN_QTY = null;
		m_SCDL_ISSUE_DATE = null;
		m_ISSUE_CMPLT_DATE = null;
		m_ISSUE_CMPLT_FLG = null;
		m_ISSUE_TYP = null;
		m_l_WH_CD = null;
		m_l_WS_CD = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_l_PUCH_ODR_CD = null;
		m_l_VEND_CD = null;
		m_CONS_TYP = null;
		m_OD_NO = null;
		m_PS_EDITION = null;
		m_ISSUE_INST_UNIT_DENOMINATOR = null;
		m_ISSUE_INST_UNIT_NUMERATOR = null;
		m_ISSUE_INST_COMMENT = null;
		m_JOB_ODR_CD = null;
		m_l_ITEM_NAME = null;
		m_l_WH_NAME = null;
		m_WS_NAME = null;
		m_VEND_ANAME = null;
		m_PROC_NAME = null;
		m_OPR_INST_CD_item = null;
		m_OPR_INST_CD_proc = null;
		m_l_PLANT_CD = null;
		m_STOCK_UNIT = null;
		m_l_STATUS = null;
		m_MRP_ODR_TYP = null;
		m_l_h_JOB_ODR_DETAIL_NO = null;
		m_LOT_CTRL_FLG = null;
		m_w_WS_CD = null;
		m_w_VEND_CD = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_STATUS1 = null;
		m_STATUS2 = null;
		m_STATUS3 = null;
		m_STATUS4 = null;
		m_STATUS5 = null;
		m_WH_CD = null;
		m_ITEM_CD = null;
		m_ISSUE_TYP1 = null;
		m_ISSUE_TYP2 = null;
		m_ISSUE_TYP3 = null;
		m_ISSUE_INST_ISS_FLG = null;
		m_WS_CD = null;
		m_w_WS_NAME = null;
		m_VEND_CD = null;
		m_w_VEND_ANAME = null;
		m_PLANT_NAME = null;
		m_OPR_INST_CD = null;
		m_OPR_INST_CD_GNR_TYP = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_WH_NAME = null;
		m_ITEM_NAME = null;
		m_MRP_FLG = null;

		l_ISSUE_CMPLT_NAME = null;
		l_ISSUE_NAME = null;
		l_CONS_NAME = null;
		l_s_OPR_INST_CD = null;
		l_DOWNLOAD_FILE = null;
		l_scdl_issue_date_from = null;
		l_scdl_issue_date_to = null;
		l_h_issue_cmplt_flg = null;
		l_c1_WORK_STS_TYP = null;
		l_c2_WORK_STS_TYP = null;
		l_c3_WORK_STS_TYP = null;
		l_c4_WORK_STS_TYP = null;
		l_c5_WORK_STS_TYP = null;
		l_l_STATUS_DN = null;
		l_scdl_issue_time_from = null;
		l_scdl_issue_time_to = null;
		l_c1_ISSUE_TYP = null;
		l_c2_ISSUE_TYP = null;
		l_c3_ISSUE_TYP = null;
		l_c_RE_PRINT = null;
		l_B_WH_CD = null;
		l_B_WH_NAME = null;
		l_l_h_B_WH_CD = null;
		l_l_h_HAND_QTY = null;
		l_l_h_LOT_NO = null;
		l_l_h_B_WH_NAME = null;
		l_w_CHOICE = null;
		l_w_PLANT_CD = null;
		l_CONS_TYP_val = null;
		l_CONS_TYP_name = null;
		l_ISSUE_TYP_val = null;
		l_ISSUE_TYP_name = null;
		l_WS_PLANT_CD = null;
		l_l_scdl_issue_date_from = null;
		l_l_scdl_issue_date_from_ZERO = null;
		l_l_scdl_issue_date_to = null;
		l_l_scdl_issue_date_to_ZERO = null;
		l_l_ISSUE_INST_CD = null;
		l_l_ITEM_CD = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_w_SHIP_REMAIN_QTY = null;
		l_SCDL_ISSUE_DATE = null;
		l_ISSUE_CMPLT_DATE = null;
		l_ISSUE_CMPLT_FLG = null;
		l_ISSUE_TYP = null;
		l_l_WH_CD = null;
		l_l_WS_CD = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_l_PUCH_ODR_CD = null;
		l_l_VEND_CD = null;
		l_CONS_TYP = null;
		l_OD_NO = null;
		l_PS_EDITION = null;
		l_ISSUE_INST_UNIT_DENOMINATOR = null;
		l_ISSUE_INST_UNIT_NUMERATOR = null;
		l_ISSUE_INST_COMMENT = null;
		l_JOB_ODR_CD = null;
		l_l_ITEM_NAME = null;
		l_l_WH_NAME = null;
		l_WS_NAME = null;
		l_VEND_ANAME = null;
		l_PROC_NAME = null;
		l_OPR_INST_CD_item = null;
		l_OPR_INST_CD_proc = null;
		l_l_PLANT_CD = null;
		l_STOCK_UNIT = null;
		l_l_STATUS = null;
		l_MRP_ODR_TYP = null;
		l_l_h_JOB_ODR_DETAIL_NO = null;
		l_LOT_CTRL_FLG = null;
		l_w_WS_CD = null;
		l_w_VEND_CD = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_CD = null;
		l_ISSUE_INST_CD = null;
		l_STATUS1 = null;
		l_STATUS2 = null;
		l_STATUS3 = null;
		l_STATUS4 = null;
		l_STATUS5 = null;
		l_WH_CD = null;
		l_ITEM_CD = null;
		l_ISSUE_TYP1 = null;
		l_ISSUE_TYP2 = null;
		l_ISSUE_TYP3 = null;
		l_ISSUE_INST_ISS_FLG = null;
		l_WS_CD = null;
		l_w_WS_NAME = null;
		l_VEND_CD = null;
		l_w_VEND_ANAME = null;
		l_PLANT_NAME = null;
		l_OPR_INST_CD = null;
		l_OPR_INST_CD_GNR_TYP = null;
		l_TIME_CTRL = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_WH_NAME = null;
		l_ITEM_NAME = null;
		l_MRP_FLG = null;

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
	 * medAF0010010�N���X�̕W���R���X�g���N�^
	 */
	public AF0010010Struct()
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
	public void setStruct(AF0010010Struct struct)
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
	public void setStructM(AF0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setISSUE_CMPLT_NAME(struct.getISSUE_CMPLT_NAME());
			this.setISSUE_NAME(struct.getISSUE_NAME());
			this.setCONS_NAME(struct.getCONS_NAME());
			this.sets_OPR_INST_CD(struct.gets_OPR_INST_CD());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setscdl_issue_date_from(struct.getscdl_issue_date_from());
			this.setscdl_issue_date_to(struct.getscdl_issue_date_to());
			this.seth_issue_cmplt_flg(struct.geth_issue_cmplt_flg());
			this.setc1_WORK_STS_TYP(struct.getc1_WORK_STS_TYP());
			this.setc2_WORK_STS_TYP(struct.getc2_WORK_STS_TYP());
			this.setc3_WORK_STS_TYP(struct.getc3_WORK_STS_TYP());
			this.setc4_WORK_STS_TYP(struct.getc4_WORK_STS_TYP());
			this.setc5_WORK_STS_TYP(struct.getc5_WORK_STS_TYP());
			this.setl_STATUS_DN(struct.getl_STATUS_DN());
			this.setscdl_issue_time_from(struct.getscdl_issue_time_from());
			this.setscdl_issue_time_to(struct.getscdl_issue_time_to());
			this.setc1_ISSUE_TYP(struct.getc1_ISSUE_TYP());
			this.setc2_ISSUE_TYP(struct.getc2_ISSUE_TYP());
			this.setc3_ISSUE_TYP(struct.getc3_ISSUE_TYP());
			this.setc_RE_PRINT(struct.getc_RE_PRINT());
			this.setB_WH_CD(struct.getB_WH_CD());
			this.setB_WH_NAME(struct.getB_WH_NAME());
			this.setl_h_B_WH_CD(struct.getl_h_B_WH_CD());
			this.setl_h_HAND_QTY(struct.getl_h_HAND_QTY());
			this.setl_h_LOT_NO(struct.getl_h_LOT_NO());
			this.setl_h_B_WH_NAME(struct.getl_h_B_WH_NAME());
			this.setw_CHOICE(struct.getw_CHOICE());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setCONS_TYP_val(struct.getCONS_TYP_val());
			this.setCONS_TYP_name(struct.getCONS_TYP_name());
			this.setISSUE_TYP_val(struct.getISSUE_TYP_val());
			this.setISSUE_TYP_name(struct.getISSUE_TYP_name());
			this.setWS_PLANT_CD(struct.getWS_PLANT_CD());
			this.setl_scdl_issue_date_from(struct.getl_scdl_issue_date_from());
			this.setl_scdl_issue_date_from_ZERO(struct.getl_scdl_issue_date_from_ZERO());
			this.setl_scdl_issue_date_to(struct.getl_scdl_issue_date_to());
			this.setl_scdl_issue_date_to_ZERO(struct.getl_scdl_issue_date_to_ZERO());
			this.setl_ISSUE_INST_CD(struct.getl_ISSUE_INST_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setISSUE_INST_QTY(struct.getISSUE_INST_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setw_SHIP_REMAIN_QTY(struct.getw_SHIP_REMAIN_QTY());
			this.setSCDL_ISSUE_DATE(struct.getSCDL_ISSUE_DATE());
			this.setISSUE_CMPLT_DATE(struct.getISSUE_CMPLT_DATE());
			this.setISSUE_CMPLT_FLG(struct.getISSUE_CMPLT_FLG());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setl_WH_CD(struct.getl_WH_CD());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setOD_NO(struct.getOD_NO());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setISSUE_INST_UNIT_DENOMINATOR(struct.getISSUE_INST_UNIT_DENOMINATOR());
			this.setISSUE_INST_UNIT_NUMERATOR(struct.getISSUE_INST_UNIT_NUMERATOR());
			this.setISSUE_INST_COMMENT(struct.getISSUE_INST_COMMENT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_WH_NAME(struct.getl_WH_NAME());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setOPR_INST_CD_item(struct.getOPR_INST_CD_item());
			this.setOPR_INST_CD_proc(struct.getOPR_INST_CD_proc());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setl_STATUS(struct.getl_STATUS());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setl_h_JOB_ODR_DETAIL_NO(struct.getl_h_JOB_ODR_DETAIL_NO());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_WS_CD(struct.getw_WS_CD());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setSTATUS1(struct.getSTATUS1());
			this.setSTATUS2(struct.getSTATUS2());
			this.setSTATUS3(struct.getSTATUS3());
			this.setSTATUS4(struct.getSTATUS4());
			this.setSTATUS5(struct.getSTATUS5());
			this.setWH_CD(struct.getWH_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setISSUE_TYP1(struct.getISSUE_TYP1());
			this.setISSUE_TYP2(struct.getISSUE_TYP2());
			this.setISSUE_TYP3(struct.getISSUE_TYP3());
			this.setISSUE_INST_ISS_FLG(struct.getISSUE_INST_ISS_FLG());
			this.setWS_CD(struct.getWS_CD());
			this.setw_WS_NAME(struct.getw_WS_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setw_VEND_ANAME(struct.getw_VEND_ANAME());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setOPR_INST_CD_GNR_TYP(struct.getOPR_INST_CD_GNR_TYP());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setWH_NAME(struct.getWH_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setMRP_FLG(struct.getMRP_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AF0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ISSUE_CMPLT_NAME(struct.getList_ISSUE_CMPLT_NAME());
			this.setList_ISSUE_NAME(struct.getList_ISSUE_NAME());
			this.setList_CONS_NAME(struct.getList_CONS_NAME());
			this.setList_s_OPR_INST_CD(struct.getList_s_OPR_INST_CD());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_scdl_issue_date_from(struct.getList_scdl_issue_date_from());
			this.setList_scdl_issue_date_to(struct.getList_scdl_issue_date_to());
			this.setList_h_issue_cmplt_flg(struct.getList_h_issue_cmplt_flg());
			this.setList_c1_WORK_STS_TYP(struct.getList_c1_WORK_STS_TYP());
			this.setList_c2_WORK_STS_TYP(struct.getList_c2_WORK_STS_TYP());
			this.setList_c3_WORK_STS_TYP(struct.getList_c3_WORK_STS_TYP());
			this.setList_c4_WORK_STS_TYP(struct.getList_c4_WORK_STS_TYP());
			this.setList_c5_WORK_STS_TYP(struct.getList_c5_WORK_STS_TYP());
			this.setList_l_STATUS_DN(struct.getList_l_STATUS_DN());
			this.setList_scdl_issue_time_from(struct.getList_scdl_issue_time_from());
			this.setList_scdl_issue_time_to(struct.getList_scdl_issue_time_to());
			this.setList_c1_ISSUE_TYP(struct.getList_c1_ISSUE_TYP());
			this.setList_c2_ISSUE_TYP(struct.getList_c2_ISSUE_TYP());
			this.setList_c3_ISSUE_TYP(struct.getList_c3_ISSUE_TYP());
			this.setList_c_RE_PRINT(struct.getList_c_RE_PRINT());
			this.setList_B_WH_CD(struct.getList_B_WH_CD());
			this.setList_B_WH_NAME(struct.getList_B_WH_NAME());
			this.setList_l_h_B_WH_CD(struct.getList_l_h_B_WH_CD());
			this.setList_l_h_HAND_QTY(struct.getList_l_h_HAND_QTY());
			this.setList_l_h_LOT_NO(struct.getList_l_h_LOT_NO());
			this.setList_l_h_B_WH_NAME(struct.getList_l_h_B_WH_NAME());
			this.setList_w_CHOICE(struct.getList_w_CHOICE());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_CONS_TYP_val(struct.getList_CONS_TYP_val());
			this.setList_CONS_TYP_name(struct.getList_CONS_TYP_name());
			this.setList_ISSUE_TYP_val(struct.getList_ISSUE_TYP_val());
			this.setList_ISSUE_TYP_name(struct.getList_ISSUE_TYP_name());
			this.setList_WS_PLANT_CD(struct.getList_WS_PLANT_CD());
			this.setList_l_scdl_issue_date_from(struct.getList_l_scdl_issue_date_from());
			this.setList_l_scdl_issue_date_from_ZERO(struct.getList_l_scdl_issue_date_from_ZERO());
			this.setList_l_scdl_issue_date_to(struct.getList_l_scdl_issue_date_to());
			this.setList_l_scdl_issue_date_to_ZERO(struct.getList_l_scdl_issue_date_to_ZERO());
			this.setList_l_ISSUE_INST_CD(struct.getList_l_ISSUE_INST_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_ISSUE_INST_QTY(struct.getList_ISSUE_INST_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_w_SHIP_REMAIN_QTY(struct.getList_w_SHIP_REMAIN_QTY());
			this.setList_SCDL_ISSUE_DATE(struct.getList_SCDL_ISSUE_DATE());
			this.setList_ISSUE_CMPLT_DATE(struct.getList_ISSUE_CMPLT_DATE());
			this.setList_ISSUE_CMPLT_FLG(struct.getList_ISSUE_CMPLT_FLG());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_l_WH_CD(struct.getList_l_WH_CD());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_ISSUE_INST_UNIT_DENOMINATOR(struct.getList_ISSUE_INST_UNIT_DENOMINATOR());
			this.setList_ISSUE_INST_UNIT_NUMERATOR(struct.getList_ISSUE_INST_UNIT_NUMERATOR());
			this.setList_ISSUE_INST_COMMENT(struct.getList_ISSUE_INST_COMMENT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_WH_NAME(struct.getList_l_WH_NAME());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_OPR_INST_CD_item(struct.getList_OPR_INST_CD_item());
			this.setList_OPR_INST_CD_proc(struct.getList_OPR_INST_CD_proc());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_l_STATUS(struct.getList_l_STATUS());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_l_h_JOB_ODR_DETAIL_NO(struct.getList_l_h_JOB_ODR_DETAIL_NO());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_WS_CD(struct.getList_w_WS_CD());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_STATUS1(struct.getList_STATUS1());
			this.setList_STATUS2(struct.getList_STATUS2());
			this.setList_STATUS3(struct.getList_STATUS3());
			this.setList_STATUS4(struct.getList_STATUS4());
			this.setList_STATUS5(struct.getList_STATUS5());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ISSUE_TYP1(struct.getList_ISSUE_TYP1());
			this.setList_ISSUE_TYP2(struct.getList_ISSUE_TYP2());
			this.setList_ISSUE_TYP3(struct.getList_ISSUE_TYP3());
			this.setList_ISSUE_INST_ISS_FLG(struct.getList_ISSUE_INST_ISS_FLG());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_w_WS_NAME(struct.getList_w_WS_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_w_VEND_ANAME(struct.getList_w_VEND_ANAME());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_OPR_INST_CD_GNR_TYP(struct.getList_OPR_INST_CD_GNR_TYP());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
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
	// �� 1 �ϐ������l�F i_ISSUE_CMPLT_NAME


	final static String i_ISSUE_CMPLT_NAME = null;

	// �� 2 �ϐ������l�F i_ISSUE_NAME


	final static String i_ISSUE_NAME = null;

	// �� 3 �ϐ������l�F i_CONS_NAME


	final static String i_CONS_NAME = null;

	// �� 4 �ϐ������l�F i_s_OPR_INST_CD


	final static String i_s_OPR_INST_CD = null;

	// �� 5 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 6 �ϐ������l�F i_scdl_issue_date_from


	final static String i_scdl_issue_date_from = null;

	// �� 7 �ϐ������l�F i_scdl_issue_date_to


	final static String i_scdl_issue_date_to = null;

	// �� 8 �ϐ������l�F i_h_issue_cmplt_flg


	final static String i_h_issue_cmplt_flg = null;

	// �� 9 �ϐ������l�F i_c1_WORK_STS_TYP


	final static String i_c1_WORK_STS_TYP = null;

	// �� 10 �ϐ������l�F i_c2_WORK_STS_TYP


	final static String i_c2_WORK_STS_TYP = null;

	// �� 11 �ϐ������l�F i_c3_WORK_STS_TYP


	final static String i_c3_WORK_STS_TYP = null;

	// �� 12 �ϐ������l�F i_c4_WORK_STS_TYP


	final static String i_c4_WORK_STS_TYP = null;

	// �� 13 �ϐ������l�F i_c5_WORK_STS_TYP


	final static String i_c5_WORK_STS_TYP = null;

	// �� 14 �ϐ������l�F i_l_STATUS_DN


	final static String i_l_STATUS_DN = null;

	// �� 15 �ϐ������l�F i_scdl_issue_time_from


	final static String i_scdl_issue_time_from = null;

	// �� 16 �ϐ������l�F i_scdl_issue_time_to


	final static String i_scdl_issue_time_to = null;

	// �� 17 �ϐ������l�F i_c1_ISSUE_TYP


	final static String i_c1_ISSUE_TYP = null;

	// �� 18 �ϐ������l�F i_c2_ISSUE_TYP


	final static String i_c2_ISSUE_TYP = null;

	// �� 19 �ϐ������l�F i_c3_ISSUE_TYP


	final static String i_c3_ISSUE_TYP = null;

	// �� 20 �ϐ������l�F i_c_RE_PRINT


	final static String i_c_RE_PRINT = null;

	// �� 21 �ϐ������l�F i_B_WH_CD


	final static String i_B_WH_CD = null;

	// �� 22 �ϐ������l�F i_B_WH_NAME


	final static String i_B_WH_NAME = null;

	// �� 23 �ϐ������l�F i_l_h_B_WH_CD


	final static String i_l_h_B_WH_CD = null;

	// �� 24 �ϐ������l�F i_l_h_HAND_QTY


	final static String i_l_h_HAND_QTY = null;

	// �� 25 �ϐ������l�F i_l_h_LOT_NO


	final static String i_l_h_LOT_NO = null;

	// �� 26 �ϐ������l�F i_l_h_B_WH_NAME


	final static String i_l_h_B_WH_NAME = null;

	// �� 27 �ϐ������l�F i_w_CHOICE


	final static String i_w_CHOICE = null;

	// �� 28 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 29 �ϐ������l�F i_CONS_TYP_val


	final static String i_CONS_TYP_val = null;

	// �� 30 �ϐ������l�F i_CONS_TYP_name


	final static String i_CONS_TYP_name = null;

	// �� 31 �ϐ������l�F i_ISSUE_TYP_val


	final static String i_ISSUE_TYP_val = null;

	// �� 32 �ϐ������l�F i_ISSUE_TYP_name


	final static String i_ISSUE_TYP_name = null;

	// �� 33 �ϐ������l�F i_WS_PLANT_CD


	final static String i_WS_PLANT_CD = null;

	// �� 34 �ϐ������l�F i_l_scdl_issue_date_from


	final static String i_l_scdl_issue_date_from = null;

	// �� 35 �ϐ������l�F i_l_scdl_issue_date_from_ZERO


	final static String i_l_scdl_issue_date_from_ZERO = null;

	// �� 36 �ϐ������l�F i_l_scdl_issue_date_to


	final static String i_l_scdl_issue_date_to = null;

	// �� 37 �ϐ������l�F i_l_scdl_issue_date_to_ZERO


	final static String i_l_scdl_issue_date_to_ZERO = null;

	// �� 38 �ϐ������l�F i_l_ISSUE_INST_CD


	final static String i_l_ISSUE_INST_CD = null;

	// �� 39 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 40 �ϐ������l�F i_ISSUE_INST_QTY


	final static String i_ISSUE_INST_QTY = null;

	// �� 41 �ϐ������l�F i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// �� 42 �ϐ������l�F i_w_SHIP_REMAIN_QTY


	final static String i_w_SHIP_REMAIN_QTY = null;

	// �� 43 �ϐ������l�F i_SCDL_ISSUE_DATE


	final static String i_SCDL_ISSUE_DATE = null;

	// �� 44 �ϐ������l�F i_ISSUE_CMPLT_DATE


	final static String i_ISSUE_CMPLT_DATE = null;

	// �� 45 �ϐ������l�F i_ISSUE_CMPLT_FLG


	final static Integer i_ISSUE_CMPLT_FLG = null;

	// �� 46 �ϐ������l�F i_ISSUE_TYP


	final static Integer i_ISSUE_TYP = null;

	// �� 47 �ϐ������l�F i_l_WH_CD


	final static String i_l_WH_CD = null;

	// �� 48 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 49 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 50 �ϐ������l�F i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// �� 51 �ϐ������l�F i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// �� 52 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 53 �ϐ������l�F i_CONS_TYP


	final static Integer i_CONS_TYP = null;

	// �� 54 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 55 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 56 �ϐ������l�F i_ISSUE_INST_UNIT_DENOMINATOR


	final static String i_ISSUE_INST_UNIT_DENOMINATOR = null;

	// �� 57 �ϐ������l�F i_ISSUE_INST_UNIT_NUMERATOR


	final static String i_ISSUE_INST_UNIT_NUMERATOR = null;

	// �� 58 �ϐ������l�F i_ISSUE_INST_COMMENT


	final static String i_ISSUE_INST_COMMENT = null;

	// �� 59 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 60 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 61 �ϐ������l�F i_l_WH_NAME


	final static String i_l_WH_NAME = null;

	// �� 62 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 63 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 64 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 65 �ϐ������l�F i_OPR_INST_CD_item


	final static String i_OPR_INST_CD_item = null;

	// �� 66 �ϐ������l�F i_OPR_INST_CD_proc


	final static String i_OPR_INST_CD_proc = null;

	// �� 67 �ϐ������l�F i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// �� 68 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 69 �ϐ������l�F i_l_STATUS


	final static String i_l_STATUS = null;

	// �� 70 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 71 �ϐ������l�F i_l_h_JOB_ODR_DETAIL_NO


	final static String i_l_h_JOB_ODR_DETAIL_NO = null;

	// �� 72 �ϐ������l�F i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// �� 73 �ϐ������l�F i_w_WS_CD


	final static String i_w_WS_CD = null;

	// �� 74 �ϐ������l�F i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// �� 75 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 76 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 77 �ϐ������l�F i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// �� 78 �ϐ������l�F i_STATUS1


	final static String i_STATUS1 = null;

	// �� 79 �ϐ������l�F i_STATUS2


	final static String i_STATUS2 = null;

	// �� 80 �ϐ������l�F i_STATUS3


	final static String i_STATUS3 = null;

	// �� 81 �ϐ������l�F i_STATUS4


	final static String i_STATUS4 = null;

	// �� 82 �ϐ������l�F i_STATUS5


	final static String i_STATUS5 = null;

	// �� 83 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 84 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 85 �ϐ������l�F i_ISSUE_TYP1


	final static String i_ISSUE_TYP1 = null;

	// �� 86 �ϐ������l�F i_ISSUE_TYP2


	final static String i_ISSUE_TYP2 = null;

	// �� 87 �ϐ������l�F i_ISSUE_TYP3


	final static String i_ISSUE_TYP3 = null;

	// �� 88 �ϐ������l�F i_ISSUE_INST_ISS_FLG


	final static String i_ISSUE_INST_ISS_FLG = null;

	// �� 89 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 90 �ϐ������l�F i_w_WS_NAME


	final static String i_w_WS_NAME = null;

	// �� 91 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 92 �ϐ������l�F i_w_VEND_ANAME


	final static String i_w_VEND_ANAME = null;

	// �� 93 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 94 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 95 �ϐ������l�F i_OPR_INST_CD_GNR_TYP


	final static String i_OPR_INST_CD_GNR_TYP = null;

	// �� 96 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 97 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 98 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 99 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 100 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 101 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------
	/**	
	 * �������ϐ��̃R�s�[	
	 * @param s �R�s�[��	
	 */	
	public void copy(AF0010010Struct s)	
	{	
		clear();
		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
		if(s.m_ISSUE_INST_CD != null) m_ISSUE_INST_CD = new String(s.m_ISSUE_INST_CD);
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_ISSUE_INST_QTY != null) m_ISSUE_INST_QTY = new String(s.m_ISSUE_INST_QTY);
		if(s.m_TOTAL_ISSUE_QTY != null) m_TOTAL_ISSUE_QTY = new String(s.m_TOTAL_ISSUE_QTY);
		if(s.m_w_SHIP_REMAIN_QTY != null) m_w_SHIP_REMAIN_QTY = new String(s.m_w_SHIP_REMAIN_QTY);
		if(s.m_SCDL_ISSUE_DATE != null) m_SCDL_ISSUE_DATE = new String(s.m_SCDL_ISSUE_DATE);
		if(s.m_ISSUE_CMPLT_DATE != null) m_ISSUE_CMPLT_DATE = new String(s.m_ISSUE_CMPLT_DATE);
		if(s.m_ISSUE_CMPLT_FLG != null) m_ISSUE_CMPLT_FLG = new Integer(s.m_ISSUE_CMPLT_FLG.intValue());
		if(s.m_ISSUE_TYP != null) m_ISSUE_TYP = new Integer(s.m_ISSUE_TYP.intValue());
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_WS_CD != null) m_WS_CD = new String(s.m_WS_CD);
		if(s.m_WORK_ODR_CD != null) m_WORK_ODR_CD = new String(s.m_WORK_ODR_CD);
		if(s.m_WORK_IN_PROC_CD != null) m_WORK_IN_PROC_CD = new String(s.m_WORK_IN_PROC_CD);
		if(s.m_PUCH_ODR_CD != null) m_PUCH_ODR_CD = new String(s.m_PUCH_ODR_CD);
		if(s.m_VEND_CD != null) m_VEND_CD = new String(s.m_VEND_CD);
		if(s.m_CONS_TYP != null) m_CONS_TYP = new Integer(s.m_CONS_TYP.intValue());
		if(s.m_OD_NO != null) m_OD_NO = new String(s.m_OD_NO);
		if(s.m_PS_EDITION != null) m_PS_EDITION = new String(s.m_PS_EDITION);
		if(s.m_ISSUE_INST_UNIT_DENOMINATOR != null) m_ISSUE_INST_UNIT_DENOMINATOR = new String(s.m_ISSUE_INST_UNIT_DENOMINATOR);
		if(s.m_ISSUE_INST_UNIT_NUMERATOR != null) m_ISSUE_INST_UNIT_NUMERATOR = new String(s.m_ISSUE_INST_UNIT_NUMERATOR);
		if(s.m_ISSUE_INST_COMMENT != null) m_ISSUE_INST_COMMENT = new String(s.m_ISSUE_INST_COMMENT);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_WS_NAME != null) m_WS_NAME = new String(s.m_WS_NAME);
		if(s.m_VEND_ANAME != null) m_VEND_ANAME = new String(s.m_VEND_ANAME);
		if(s.m_PROC_NAME != null) m_PROC_NAME = new String(s.m_PROC_NAME);
		if(s.m_OPR_INST_CD_item != null) m_OPR_INST_CD_item = new String(s.m_OPR_INST_CD_item);
		if(s.m_OPR_INST_CD_proc != null) m_OPR_INST_CD_proc = new String(s.m_OPR_INST_CD_proc);
		if(s.m_w_WS_CD != null) m_w_WS_CD = new String(s.m_w_WS_CD);
		if(s.m_w_VEND_CD != null) m_w_VEND_CD = new String(s.m_w_VEND_CD);
		if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
		if(s.m_w_WS_NAME != null) m_w_WS_NAME = new String(s.m_w_WS_NAME);
		if(s.m_WS_PLANT_CD != null) m_WS_PLANT_CD = new String(s.m_WS_PLANT_CD);
		if(s.m_w_VEND_ANAME != null) m_w_VEND_ANAME = new String(s.m_w_VEND_ANAME);
		if(s.m_ISSUE_CMPLT_NAME != null) m_ISSUE_CMPLT_NAME = new String(s.m_ISSUE_CMPLT_NAME);
		if(s.m_ISSUE_NAME != null) m_ISSUE_NAME = new String(s.m_ISSUE_NAME);
		if(s.m_CONS_NAME != null) m_CONS_NAME = new String(s.m_CONS_NAME);
		if(s.m_s_OPR_INST_CD != null) m_s_OPR_INST_CD = new String(s.m_s_OPR_INST_CD);
		if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
		if(s.m_CONS_TYP_val != null) m_CONS_TYP_val = new String(s.m_CONS_TYP_val);
		if(s.m_CONS_TYP_name != null) m_CONS_TYP_name = new String(s.m_CONS_TYP_name);
		if(s.m_ISSUE_TYP_val != null) m_ISSUE_TYP_val = new String(s.m_ISSUE_TYP_val);
		if(s.m_ISSUE_TYP_name != null) m_ISSUE_TYP_name = new String(s.m_ISSUE_TYP_name);
	}	


	/**
	 * �R�s�[�R���X�g���N�^
	 * @param struct �R�s�[�Ώ�
	 */
	 public AF0010010Struct(AF0010010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
