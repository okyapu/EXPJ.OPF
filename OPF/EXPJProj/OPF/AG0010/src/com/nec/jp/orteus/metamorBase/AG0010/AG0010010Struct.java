/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

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

public class AG0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_ITEM_STOCK_QTY_OUTSIDE_MRP */
	public String m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
	/** �� 2 �ϐ��F m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP */
	public String m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
	/** �� 3 �ϐ��F m_w_TOTAL_STOCK_QTY */
	public String m_w_TOTAL_STOCK_QTY = null;
	/** �� 4 �ϐ��F m_w_TOTAL_STOCK_QTY_LAST_DAY */
	public String m_w_TOTAL_STOCK_QTY_LAST_DAY = null;
	/** �� 5 �ϐ��F m_w_TOTAL_STOCK_QTY_LAST_MONTH */
	public String m_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
	/** �� 6 �ϐ��F m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** �� 7 �ϐ��F m_MRP_NAME */
	public String m_MRP_NAME = null;
	/** �� 8 �ϐ��F m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** �� 9 �ϐ��F m_h_lotFlg */
	public String m_h_lotFlg = null;
	/** �� 10 �ϐ��F m_h_screenflg */
	public String m_h_screenflg = null;
	/** �� 11 �ϐ��F m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** �� 12 �ϐ��F m_s_PLANT_CD */
	public String m_s_PLANT_CD = null;
	/** �� 13 �ϐ��F m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** �� 14 �ϐ��F m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** �� 15 �ϐ��F m_MRP_FLG_val */
	public String m_MRP_FLG_val = null;
	/** �� 16 �ϐ��F m_MRP_FLG_name */
	public String m_MRP_FLG_name = null;
	/** �� 17 �ϐ��F m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** �� 18 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 19 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 20 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 21 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 22 �ϐ��F m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** �� 23 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 24 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 25 �ϐ��F m_w_ITEM_STOCK_QTY */
	public String m_w_ITEM_STOCK_QTY = null;
	/** �� 26 �ϐ��F m_w_ITEM_DEFECT_QTY */
	public String m_w_ITEM_DEFECT_QTY = null;
	/** �� 27 �ϐ��F m_w_ITEM_STOCK_QTY_LAST_DAY */
	public String m_w_ITEM_STOCK_QTY_LAST_DAY = null;
	/** �� 28 �ϐ��F m_w_ITEM_STOCK_QTY_LAST_MONTH */
	public String m_w_ITEM_STOCK_QTY_LAST_MONTH = null;
	/** �� 29 �ϐ��F m_w_JOB_ODR_STOCK_QTY */
	public String m_w_JOB_ODR_STOCK_QTY = null;
	/** �� 30 �ϐ��F m_w_JOB_ODR_STOCK_QTY_LAST_DAY */
	public String m_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
	/** �� 31 �ϐ��F m_w_JOB_ODR_STOCK_QTY_LAST_MONTH */
	public String m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
	/** �� 32 �ϐ��F m_MRP_FLG */
	public Integer m_MRP_FLG = null;
	/** �� 33 �ϐ��F m_w_ITEM_STOCK_QTY_FOR_MRP */
	public String m_w_ITEM_STOCK_QTY_FOR_MRP = null;
	/** �� 34 �ϐ��F m_w_JOB_ODR_STOCK_QTY_FOR_MRP */
	public String m_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
	/** �� 35 �ϐ��F m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** �� 36 �ϐ��F m_w_STOCK_ON_HAND_QTY */
	public String m_w_STOCK_ON_HAND_QTY = null;
	/** �� 37 �ϐ��F m_w_DEFECT_QTY */
	public String m_w_DEFECT_QTY = null;
	/** �� 38 �ϐ��F m_w_PRVS_DAYEND_STOCK_QTY */
	public String m_w_PRVS_DAYEND_STOCK_QTY = null;
	/** �� 39 �ϐ��F m_w_PRVS_MONTHEND_STOCK_QTY */
	public String m_w_PRVS_MONTHEND_STOCK_QTY = null;
	/** �� 40 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 41 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 42 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 43 �ϐ��F m_s2_PLANT_CD */
	public String m_s2_PLANT_CD = null;
	/** �� 44 �ϐ��F m_l_PLANT_NAME */
	public String m_l_PLANT_NAME = null;
	/** �� 45 �ϐ��F m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** �� 46 �ϐ��F m_l_STOCK_ON_HAND_QTY */
	public String m_l_STOCK_ON_HAND_QTY = null;
	/** �� 47 �ϐ��F m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** �� 48 �ϐ��F m_l_EXPIRATION_DATE */
	public String m_l_EXPIRATION_DATE = null;
	/** �� 49 �ϐ��F m_l_PRD_CMPLT_DATE */
	public String m_l_PRD_CMPLT_DATE = null;
	/** �� 50 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 51 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_ITEM_STOCK_QTY_OUTSIDE_MRP */
	public List l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;

	/** �� 2 List�ϐ��F l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP */
	public List l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;

	/** �� 3 List�ϐ��F l_w_TOTAL_STOCK_QTY */
	public List l_w_TOTAL_STOCK_QTY = null;

	/** �� 4 List�ϐ��F l_w_TOTAL_STOCK_QTY_LAST_DAY */
	public List l_w_TOTAL_STOCK_QTY_LAST_DAY = null;

	/** �� 5 List�ϐ��F l_w_TOTAL_STOCK_QTY_LAST_MONTH */
	public List l_w_TOTAL_STOCK_QTY_LAST_MONTH = null;

	/** �� 6 List�ϐ��F l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** �� 7 List�ϐ��F l_MRP_NAME */
	public List l_MRP_NAME = null;

	/** �� 8 List�ϐ��F l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** �� 9 List�ϐ��F l_h_lotFlg */
	public List l_h_lotFlg = null;

	/** �� 10 List�ϐ��F l_h_screenflg */
	public List l_h_screenflg = null;

	/** �� 11 List�ϐ��F l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** �� 12 List�ϐ��F l_s_PLANT_CD */
	public List l_s_PLANT_CD = null;

	/** �� 13 List�ϐ��F l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** �� 14 List�ϐ��F l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** �� 15 List�ϐ��F l_MRP_FLG_val */
	public List l_MRP_FLG_val = null;

	/** �� 16 List�ϐ��F l_MRP_FLG_name */
	public List l_MRP_FLG_name = null;

	/** �� 17 List�ϐ��F l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** �� 18 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 19 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 20 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 21 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 22 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 23 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 24 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 25 List�ϐ��F l_w_ITEM_STOCK_QTY */
	public List l_w_ITEM_STOCK_QTY = null;

	/** �� 26 List�ϐ��F l_w_ITEM_DEFECT_QTY */
	public List l_w_ITEM_DEFECT_QTY = null;

	/** �� 27 List�ϐ��F l_w_ITEM_STOCK_QTY_LAST_DAY */
	public List l_w_ITEM_STOCK_QTY_LAST_DAY = null;

	/** �� 28 List�ϐ��F l_w_ITEM_STOCK_QTY_LAST_MONTH */
	public List l_w_ITEM_STOCK_QTY_LAST_MONTH = null;

	/** �� 29 List�ϐ��F l_w_JOB_ODR_STOCK_QTY */
	public List l_w_JOB_ODR_STOCK_QTY = null;

	/** �� 30 List�ϐ��F l_w_JOB_ODR_STOCK_QTY_LAST_DAY */
	public List l_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;

	/** �� 31 List�ϐ��F l_w_JOB_ODR_STOCK_QTY_LAST_MONTH */
	public List l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;

	/** �� 32 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 33 List�ϐ��F l_w_ITEM_STOCK_QTY_FOR_MRP */
	public List l_w_ITEM_STOCK_QTY_FOR_MRP = null;

	/** �� 34 List�ϐ��F l_w_JOB_ODR_STOCK_QTY_FOR_MRP */
	public List l_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;

	/** �� 35 List�ϐ��F l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** �� 36 List�ϐ��F l_w_STOCK_ON_HAND_QTY */
	public List l_w_STOCK_ON_HAND_QTY = null;

	/** �� 37 List�ϐ��F l_w_DEFECT_QTY */
	public List l_w_DEFECT_QTY = null;

	/** �� 38 List�ϐ��F l_w_PRVS_DAYEND_STOCK_QTY */
	public List l_w_PRVS_DAYEND_STOCK_QTY = null;

	/** �� 39 List�ϐ��F l_w_PRVS_MONTHEND_STOCK_QTY */
	public List l_w_PRVS_MONTHEND_STOCK_QTY = null;

	/** �� 40 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 41 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 42 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 43 List�ϐ��F l_s2_PLANT_CD */
	public List l_s2_PLANT_CD = null;

	/** �� 44 List�ϐ��F l_l_PLANT_NAME */
	public List l_l_PLANT_NAME = null;

	/** �� 45 List�ϐ��F l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** �� 46 List�ϐ��F l_l_STOCK_ON_HAND_QTY */
	public List l_l_STOCK_ON_HAND_QTY = null;

	/** �� 47 List�ϐ��F l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** �� 48 List�ϐ��F l_l_EXPIRATION_DATE */
	public List l_l_EXPIRATION_DATE = null;

	/** �� 49 List�ϐ��F l_l_PRD_CMPLT_DATE */
	public List l_l_PRD_CMPLT_DATE = null;

	/** �� 50 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 51 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_ITEM_STOCK_QTY_OUTSIDE_MRP() { return m_w_ITEM_STOCK_QTY_OUTSIDE_MRP; }
	public String getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() { return m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP; }
	public String getw_TOTAL_STOCK_QTY() { return m_w_TOTAL_STOCK_QTY; }
	public String getw_TOTAL_STOCK_QTY_LAST_DAY() { return m_w_TOTAL_STOCK_QTY_LAST_DAY; }
	public String getw_TOTAL_STOCK_QTY_LAST_MONTH() { return m_w_TOTAL_STOCK_QTY_LAST_MONTH; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getMRP_NAME() { return m_MRP_NAME; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String geth_lotFlg() { return m_h_lotFlg; }
	public String geth_screenflg() { return m_h_screenflg; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String gets_PLANT_CD() { return m_s_PLANT_CD; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getMRP_FLG_val() { return m_MRP_FLG_val; }
	public String getMRP_FLG_name() { return m_MRP_FLG_name; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_ITEM_STOCK_QTY() { return m_w_ITEM_STOCK_QTY; }
	public String getw_ITEM_DEFECT_QTY() { return m_w_ITEM_DEFECT_QTY; }
	public String getw_ITEM_STOCK_QTY_LAST_DAY() { return m_w_ITEM_STOCK_QTY_LAST_DAY; }
	public String getw_ITEM_STOCK_QTY_LAST_MONTH() { return m_w_ITEM_STOCK_QTY_LAST_MONTH; }
	public String getw_JOB_ODR_STOCK_QTY() { return m_w_JOB_ODR_STOCK_QTY; }
	public String getw_JOB_ODR_STOCK_QTY_LAST_DAY() { return m_w_JOB_ODR_STOCK_QTY_LAST_DAY; }
	public String getw_JOB_ODR_STOCK_QTY_LAST_MONTH() { return m_w_JOB_ODR_STOCK_QTY_LAST_MONTH; }
	public Integer getMRP_FLG() { return m_MRP_FLG; }
	public String getw_ITEM_STOCK_QTY_FOR_MRP() { return m_w_ITEM_STOCK_QTY_FOR_MRP; }
	public String getw_JOB_ODR_STOCK_QTY_FOR_MRP() { return m_w_JOB_ODR_STOCK_QTY_FOR_MRP; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_STOCK_ON_HAND_QTY() { return m_w_STOCK_ON_HAND_QTY; }
	public String getw_DEFECT_QTY() { return m_w_DEFECT_QTY; }
	public String getw_PRVS_DAYEND_STOCK_QTY() { return m_w_PRVS_DAYEND_STOCK_QTY; }
	public String getw_PRVS_MONTHEND_STOCK_QTY() { return m_w_PRVS_MONTHEND_STOCK_QTY; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String gets2_PLANT_CD() { return m_s2_PLANT_CD; }
	public String getl_PLANT_NAME() { return m_l_PLANT_NAME; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_STOCK_ON_HAND_QTY() { return m_l_STOCK_ON_HAND_QTY; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getl_EXPIRATION_DATE() { return m_l_EXPIRATION_DATE; }
	public String getl_PRD_CMPLT_DATE() { return m_l_PRD_CMPLT_DATE; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_ITEM_STOCK_QTY_OUTSIDE_MRP() { return l_w_ITEM_STOCK_QTY_OUTSIDE_MRP; }
	public List getList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() { return l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP; }
	public List getList_w_TOTAL_STOCK_QTY() { return l_w_TOTAL_STOCK_QTY; }
	public List getList_w_TOTAL_STOCK_QTY_LAST_DAY() { return l_w_TOTAL_STOCK_QTY_LAST_DAY; }
	public List getList_w_TOTAL_STOCK_QTY_LAST_MONTH() { return l_w_TOTAL_STOCK_QTY_LAST_MONTH; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_MRP_NAME() { return l_MRP_NAME; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_h_lotFlg() { return l_h_lotFlg; }
	public List getList_h_screenflg() { return l_h_screenflg; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_s_PLANT_CD() { return l_s_PLANT_CD; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_FLG_val() { return l_MRP_FLG_val; }
	public List getList_MRP_FLG_name() { return l_MRP_FLG_name; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_ITEM_STOCK_QTY() { return l_w_ITEM_STOCK_QTY; }
	public List getList_w_ITEM_DEFECT_QTY() { return l_w_ITEM_DEFECT_QTY; }
	public List getList_w_ITEM_STOCK_QTY_LAST_DAY() { return l_w_ITEM_STOCK_QTY_LAST_DAY; }
	public List getList_w_ITEM_STOCK_QTY_LAST_MONTH() { return l_w_ITEM_STOCK_QTY_LAST_MONTH; }
	public List getList_w_JOB_ODR_STOCK_QTY() { return l_w_JOB_ODR_STOCK_QTY; }
	public List getList_w_JOB_ODR_STOCK_QTY_LAST_DAY() { return l_w_JOB_ODR_STOCK_QTY_LAST_DAY; }
	public List getList_w_JOB_ODR_STOCK_QTY_LAST_MONTH() { return l_w_JOB_ODR_STOCK_QTY_LAST_MONTH; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_w_ITEM_STOCK_QTY_FOR_MRP() { return l_w_ITEM_STOCK_QTY_FOR_MRP; }
	public List getList_w_JOB_ODR_STOCK_QTY_FOR_MRP() { return l_w_JOB_ODR_STOCK_QTY_FOR_MRP; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_STOCK_ON_HAND_QTY() { return l_w_STOCK_ON_HAND_QTY; }
	public List getList_w_DEFECT_QTY() { return l_w_DEFECT_QTY; }
	public List getList_w_PRVS_DAYEND_STOCK_QTY() { return l_w_PRVS_DAYEND_STOCK_QTY; }
	public List getList_w_PRVS_MONTHEND_STOCK_QTY() { return l_w_PRVS_MONTHEND_STOCK_QTY; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_s2_PLANT_CD() { return l_s2_PLANT_CD; }
	public List getList_l_PLANT_NAME() { return l_l_PLANT_NAME; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_STOCK_ON_HAND_QTY() { return l_l_STOCK_ON_HAND_QTY; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_l_EXPIRATION_DATE() { return l_l_EXPIRATION_DATE; }
	public List getList_l_PRD_CMPLT_DATE() { return l_l_PRD_CMPLT_DATE; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_ITEM_STOCK_QTY_OUTSIDE_MRP(String val) { m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = val; }
	public void setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(String val) { m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = val; }
	public void setw_TOTAL_STOCK_QTY(String val) { m_w_TOTAL_STOCK_QTY = val; }
	public void setw_TOTAL_STOCK_QTY_LAST_DAY(String val) { m_w_TOTAL_STOCK_QTY_LAST_DAY = val; }
	public void setw_TOTAL_STOCK_QTY_LAST_MONTH(String val) { m_w_TOTAL_STOCK_QTY_LAST_MONTH = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setMRP_NAME(String val) { m_MRP_NAME = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void seth_lotFlg(String val) { m_h_lotFlg = val; }
	public void seth_screenflg(String val) { m_h_screenflg = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void sets_PLANT_CD(String val) { m_s_PLANT_CD = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_FLG_val(String val) { m_MRP_FLG_val = val; }
	public void setMRP_FLG_name(String val) { m_MRP_FLG_name = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_ITEM_STOCK_QTY(String val) { m_w_ITEM_STOCK_QTY = val; }
	public void setw_ITEM_DEFECT_QTY(String val) { m_w_ITEM_DEFECT_QTY = val; }
	public void setw_ITEM_STOCK_QTY_LAST_DAY(String val) { m_w_ITEM_STOCK_QTY_LAST_DAY = val; }
	public void setw_ITEM_STOCK_QTY_LAST_MONTH(String val) { m_w_ITEM_STOCK_QTY_LAST_MONTH = val; }
	public void setw_JOB_ODR_STOCK_QTY(String val) { m_w_JOB_ODR_STOCK_QTY = val; }
	public void setw_JOB_ODR_STOCK_QTY_LAST_DAY(String val) { m_w_JOB_ODR_STOCK_QTY_LAST_DAY = val; }
	public void setw_JOB_ODR_STOCK_QTY_LAST_MONTH(String val) { m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = val; }
	public void setMRP_FLG(Integer val) { m_MRP_FLG = val; }
	public void setw_ITEM_STOCK_QTY_FOR_MRP(String val) { m_w_ITEM_STOCK_QTY_FOR_MRP = val; }
	public void setw_JOB_ODR_STOCK_QTY_FOR_MRP(String val) { m_w_JOB_ODR_STOCK_QTY_FOR_MRP = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_STOCK_ON_HAND_QTY(String val) { m_w_STOCK_ON_HAND_QTY = val; }
	public void setw_DEFECT_QTY(String val) { m_w_DEFECT_QTY = val; }
	public void setw_PRVS_DAYEND_STOCK_QTY(String val) { m_w_PRVS_DAYEND_STOCK_QTY = val; }
	public void setw_PRVS_MONTHEND_STOCK_QTY(String val) { m_w_PRVS_MONTHEND_STOCK_QTY = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void sets2_PLANT_CD(String val) { m_s2_PLANT_CD = val; }
	public void setl_PLANT_NAME(String val) { m_l_PLANT_NAME = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_STOCK_ON_HAND_QTY(String val) { m_l_STOCK_ON_HAND_QTY = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setl_EXPIRATION_DATE(String val) { m_l_EXPIRATION_DATE = val; }
	public void setl_PRD_CMPLT_DATE(String val) { m_l_PRD_CMPLT_DATE = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void setMRP_FLG(String val) { m_MRP_FLG = getInteger(val); }

	public void setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(List list) { l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(List list) { l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = list; }
	public void setList_w_TOTAL_STOCK_QTY(List list) { l_w_TOTAL_STOCK_QTY = list; }
	public void setList_w_TOTAL_STOCK_QTY_LAST_DAY(List list) { l_w_TOTAL_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_TOTAL_STOCK_QTY_LAST_MONTH(List list) { l_w_TOTAL_STOCK_QTY_LAST_MONTH = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_MRP_NAME(List list) { l_MRP_NAME = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_h_lotFlg(List list) { l_h_lotFlg = list; }
	public void setList_h_screenflg(List list) { l_h_screenflg = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_s_PLANT_CD(List list) { l_s_PLANT_CD = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_FLG_val(List list) { l_MRP_FLG_val = list; }
	public void setList_MRP_FLG_name(List list) { l_MRP_FLG_name = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_ITEM_STOCK_QTY(List list) { l_w_ITEM_STOCK_QTY = list; }
	public void setList_w_ITEM_DEFECT_QTY(List list) { l_w_ITEM_DEFECT_QTY = list; }
	public void setList_w_ITEM_STOCK_QTY_LAST_DAY(List list) { l_w_ITEM_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_ITEM_STOCK_QTY_LAST_MONTH(List list) { l_w_ITEM_STOCK_QTY_LAST_MONTH = list; }
	public void setList_w_JOB_ODR_STOCK_QTY(List list) { l_w_JOB_ODR_STOCK_QTY = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(List list) { l_w_JOB_ODR_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(List list) { l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_w_ITEM_STOCK_QTY_FOR_MRP(List list) { l_w_ITEM_STOCK_QTY_FOR_MRP = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(List list) { l_w_JOB_ODR_STOCK_QTY_FOR_MRP = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_STOCK_ON_HAND_QTY(List list) { l_w_STOCK_ON_HAND_QTY = list; }
	public void setList_w_DEFECT_QTY(List list) { l_w_DEFECT_QTY = list; }
	public void setList_w_PRVS_DAYEND_STOCK_QTY(List list) { l_w_PRVS_DAYEND_STOCK_QTY = list; }
	public void setList_w_PRVS_MONTHEND_STOCK_QTY(List list) { l_w_PRVS_MONTHEND_STOCK_QTY = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_s2_PLANT_CD(List list) { l_s2_PLANT_CD = list; }
	public void setList_l_PLANT_NAME(List list) { l_l_PLANT_NAME = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_STOCK_ON_HAND_QTY(List list) { l_l_STOCK_ON_HAND_QTY = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_l_EXPIRATION_DATE(List list) { l_l_EXPIRATION_DATE = list; }
	public void setList_l_PRD_CMPLT_DATE(List list) { l_l_PRD_CMPLT_DATE = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_w_ITEM_STOCK_QTY_OUTSIDE_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_OUTSIDE_MRP == null) {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP == null) {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY == null) {
			l_w_TOTAL_STOCK_QTY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY_LAST_DAY == null) {
			l_w_TOTAL_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY_LAST_MONTH == null) {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY_LAST_MONTH());
		}
		return size;
	}
	public int setL2L_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_NAME == null) {
			l_MRP_ODR_NAME = new ArrayList();
		} else {
			l_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_NAME.add(((AG0010010Struct) list.get(i)).getMRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_MRP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_NAME == null) {
			l_MRP_NAME = new ArrayList();
		} else {
			l_MRP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_NAME.add(((AG0010010Struct) list.get(i)).getMRP_NAME());
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
			l_h_lotCtrl.add(((AG0010010Struct) list.get(i)).geth_lotCtrl());
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
			l_h_lotFlg.add(((AG0010010Struct) list.get(i)).geth_lotFlg());
		}
		return size;
	}
	public int setL2L_h_screenflg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_screenflg == null) {
			l_h_screenflg = new ArrayList();
		} else {
			l_h_screenflg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_screenflg.add(((AG0010010Struct) list.get(i)).geth_screenflg());
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
			l_w_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getw_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_s_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLANT_CD == null) {
			l_s_PLANT_CD = new ArrayList();
		} else {
			l_s_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLANT_CD.add(((AG0010010Struct) list.get(i)).gets_PLANT_CD());
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
			l_MRP_ODR_TYP_val.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP_val());
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
			l_MRP_ODR_TYP_name.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_val == null) {
			l_MRP_FLG_val = new ArrayList();
		} else {
			l_MRP_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_val.add(((AG0010010Struct) list.get(i)).getMRP_FLG_val());
		}
		return size;
	}
	public int setL2L_MRP_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_name == null) {
			l_MRP_FLG_name = new ArrayList();
		} else {
			l_MRP_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_name.add(((AG0010010Struct) list.get(i)).getMRP_FLG_name());
		}
		return size;
	}
	public int setL2L_w_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_NAME == null) {
			l_w_ITEM_NAME = new ArrayList();
		} else {
			l_w_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_NAME.add(((AG0010010Struct) list.get(i)).getw_ITEM_NAME());
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
			l_DRAW_CD.add(((AG0010010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AG0010010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_STOCK_UNIT.add(((AG0010010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_LOT_CTRL_FLG.add(((AG0010010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_w_ITEM_CD.add(((AG0010010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_PLANT_CD.add(((AG0010010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY == null) {
			l_w_ITEM_STOCK_QTY = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_ITEM_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_DEFECT_QTY == null) {
			l_w_ITEM_DEFECT_QTY = new ArrayList();
		} else {
			l_w_ITEM_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_DEFECT_QTY.add(((AG0010010Struct) list.get(i)).getw_ITEM_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_LAST_DAY == null) {
			l_w_ITEM_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_LAST_MONTH == null) {
			l_w_ITEM_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_LAST_MONTH());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY == null) {
			l_w_JOB_ODR_STOCK_QTY = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_LAST_DAY == null) {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_LAST_MONTH == null) {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
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
			l_MRP_FLG.add(((AG0010010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_FOR_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_FOR_MRP == null) {
			l_w_ITEM_STOCK_QTY_FOR_MRP = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_FOR_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_FOR_MRP.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_FOR_MRP());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_FOR_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_FOR_MRP == null) {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_FOR_MRP());
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
			l_w_WH_CD.add(((AG0010010Struct) list.get(i)).getw_WH_CD());
		}
		return size;
	}
	public int setL2L_w_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_ON_HAND_QTY == null) {
			l_w_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_ON_HAND_QTY.add(((AG0010010Struct) list.get(i)).getw_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_w_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DEFECT_QTY == null) {
			l_w_DEFECT_QTY = new ArrayList();
		} else {
			l_w_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DEFECT_QTY.add(((AG0010010Struct) list.get(i)).getw_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_PRVS_DAYEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PRVS_DAYEND_STOCK_QTY == null) {
			l_w_PRVS_DAYEND_STOCK_QTY = new ArrayList();
		} else {
			l_w_PRVS_DAYEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PRVS_DAYEND_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_PRVS_DAYEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_PRVS_MONTHEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PRVS_MONTHEND_STOCK_QTY == null) {
			l_w_PRVS_MONTHEND_STOCK_QTY = new ArrayList();
		} else {
			l_w_PRVS_MONTHEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PRVS_MONTHEND_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_PRVS_MONTHEND_STOCK_QTY());
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
			l_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getPLANT_NAME());
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
			l_WH_NAME.add(((AG0010010Struct) list.get(i)).getWH_NAME());
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
			l_JOB_ODR_CD.add(((AG0010010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_s2_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s2_PLANT_CD == null) {
			l_s2_PLANT_CD = new ArrayList();
		} else {
			l_s2_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s2_PLANT_CD.add(((AG0010010Struct) list.get(i)).gets2_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_NAME == null) {
			l_l_PLANT_NAME = new ArrayList();
		} else {
			l_l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getl_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_l_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOT_NO == null) {
			l_l_LOT_NO = new ArrayList();
		} else {
			l_l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOT_NO.add(((AG0010010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_ON_HAND_QTY == null) {
			l_l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_ON_HAND_QTY.add(((AG0010010Struct) list.get(i)).getl_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_l_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCD_QTY == null) {
			l_l_ALCD_QTY = new ArrayList();
		} else {
			l_l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCD_QTY.add(((AG0010010Struct) list.get(i)).getl_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_l_EXPIRATION_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXPIRATION_DATE == null) {
			l_l_EXPIRATION_DATE = new ArrayList();
		} else {
			l_l_EXPIRATION_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXPIRATION_DATE.add(((AG0010010Struct) list.get(i)).getl_EXPIRATION_DATE());
		}
		return size;
	}
	public int setL2L_l_PRD_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_CMPLT_DATE == null) {
			l_l_PRD_CMPLT_DATE = new ArrayList();
		} else {
			l_l_PRD_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_CMPLT_DATE.add(((AG0010010Struct) list.get(i)).getl_PRD_CMPLT_DATE());
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
			l_l_COUNT.add(((AG0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AG0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
		m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
		m_w_TOTAL_STOCK_QTY = null;
		m_w_TOTAL_STOCK_QTY_LAST_DAY = null;
		m_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
		m_MRP_ODR_NAME = null;
		m_MRP_NAME = null;
		m_h_lotCtrl = null;
		m_h_lotFlg = null;
		m_h_screenflg = null;
		m_w_PLANT_NAME = null;
		m_s_PLANT_CD = null;
		m_MRP_ODR_TYP_val = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_FLG_val = null;
		m_MRP_FLG_name = null;
		m_w_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_STOCK_UNIT = null;
		m_LOT_CTRL_FLG = null;
		m_w_ITEM_CD = null;
		m_w_PLANT_CD = null;
		m_w_ITEM_STOCK_QTY = null;
		m_w_ITEM_DEFECT_QTY = null;
		m_w_ITEM_STOCK_QTY_LAST_DAY = null;
		m_w_ITEM_STOCK_QTY_LAST_MONTH = null;
		m_w_JOB_ODR_STOCK_QTY = null;
		m_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
		m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
		m_MRP_FLG = null;
		m_w_ITEM_STOCK_QTY_FOR_MRP = null;
		m_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
		m_w_WH_CD = null;
		m_w_STOCK_ON_HAND_QTY = null;
		m_w_DEFECT_QTY = null;
		m_w_PRVS_DAYEND_STOCK_QTY = null;
		m_w_PRVS_MONTHEND_STOCK_QTY = null;
		m_PLANT_NAME = null;
		m_WH_NAME = null;
		m_JOB_ODR_CD = null;
		m_s2_PLANT_CD = null;
		m_l_PLANT_NAME = null;
		m_l_LOT_NO = null;
		m_l_STOCK_ON_HAND_QTY = null;
		m_l_ALCD_QTY = null;
		m_l_EXPIRATION_DATE = null;
		m_l_PRD_CMPLT_DATE = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
		l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
		l_w_TOTAL_STOCK_QTY = null;
		l_w_TOTAL_STOCK_QTY_LAST_DAY = null;
		l_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
		l_MRP_ODR_NAME = null;
		l_MRP_NAME = null;
		l_h_lotCtrl = null;
		l_h_lotFlg = null;
		l_h_screenflg = null;
		l_w_PLANT_NAME = null;
		l_s_PLANT_CD = null;
		l_MRP_ODR_TYP_val = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_FLG_val = null;
		l_MRP_FLG_name = null;
		l_w_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_STOCK_UNIT = null;
		l_LOT_CTRL_FLG = null;
		l_w_ITEM_CD = null;
		l_w_PLANT_CD = null;
		l_w_ITEM_STOCK_QTY = null;
		l_w_ITEM_DEFECT_QTY = null;
		l_w_ITEM_STOCK_QTY_LAST_DAY = null;
		l_w_ITEM_STOCK_QTY_LAST_MONTH = null;
		l_w_JOB_ODR_STOCK_QTY = null;
		l_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
		l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
		l_MRP_FLG = null;
		l_w_ITEM_STOCK_QTY_FOR_MRP = null;
		l_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
		l_w_WH_CD = null;
		l_w_STOCK_ON_HAND_QTY = null;
		l_w_DEFECT_QTY = null;
		l_w_PRVS_DAYEND_STOCK_QTY = null;
		l_w_PRVS_MONTHEND_STOCK_QTY = null;
		l_PLANT_NAME = null;
		l_WH_NAME = null;
		l_JOB_ODR_CD = null;
		l_s2_PLANT_CD = null;
		l_l_PLANT_NAME = null;
		l_l_LOT_NO = null;
		l_l_STOCK_ON_HAND_QTY = null;
		l_l_ALCD_QTY = null;
		l_l_EXPIRATION_DATE = null;
		l_l_PRD_CMPLT_DATE = null;
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
	 * medAG0010010�N���X�̕W���R���X�g���N�^
	 */
	public AG0010010Struct()
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
	public void setStruct(AG0010010Struct struct)
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
	public void setStructM(AG0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(struct.getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
			this.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(struct.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
			this.setw_TOTAL_STOCK_QTY(struct.getw_TOTAL_STOCK_QTY());
			this.setw_TOTAL_STOCK_QTY_LAST_DAY(struct.getw_TOTAL_STOCK_QTY_LAST_DAY());
			this.setw_TOTAL_STOCK_QTY_LAST_MONTH(struct.getw_TOTAL_STOCK_QTY_LAST_MONTH());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setMRP_NAME(struct.getMRP_NAME());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.seth_lotFlg(struct.geth_lotFlg());
			this.seth_screenflg(struct.geth_screenflg());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.sets_PLANT_CD(struct.gets_PLANT_CD());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_FLG_val(struct.getMRP_FLG_val());
			this.setMRP_FLG_name(struct.getMRP_FLG_name());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_ITEM_STOCK_QTY(struct.getw_ITEM_STOCK_QTY());
			this.setw_ITEM_DEFECT_QTY(struct.getw_ITEM_DEFECT_QTY());
			this.setw_ITEM_STOCK_QTY_LAST_DAY(struct.getw_ITEM_STOCK_QTY_LAST_DAY());
			this.setw_ITEM_STOCK_QTY_LAST_MONTH(struct.getw_ITEM_STOCK_QTY_LAST_MONTH());
			this.setw_JOB_ODR_STOCK_QTY(struct.getw_JOB_ODR_STOCK_QTY());
			this.setw_JOB_ODR_STOCK_QTY_LAST_DAY(struct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
			this.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(struct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setw_ITEM_STOCK_QTY_FOR_MRP(struct.getw_ITEM_STOCK_QTY_FOR_MRP());
			this.setw_JOB_ODR_STOCK_QTY_FOR_MRP(struct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_STOCK_ON_HAND_QTY(struct.getw_STOCK_ON_HAND_QTY());
			this.setw_DEFECT_QTY(struct.getw_DEFECT_QTY());
			this.setw_PRVS_DAYEND_STOCK_QTY(struct.getw_PRVS_DAYEND_STOCK_QTY());
			this.setw_PRVS_MONTHEND_STOCK_QTY(struct.getw_PRVS_MONTHEND_STOCK_QTY());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setWH_NAME(struct.getWH_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.sets2_PLANT_CD(struct.gets2_PLANT_CD());
			this.setl_PLANT_NAME(struct.getl_PLANT_NAME());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_STOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setl_EXPIRATION_DATE(struct.getl_EXPIRATION_DATE());
			this.setl_PRD_CMPLT_DATE(struct.getl_PRD_CMPLT_DATE());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AG0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(struct.getList_w_ITEM_STOCK_QTY_OUTSIDE_MRP());
			this.setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(struct.getList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
			this.setList_w_TOTAL_STOCK_QTY(struct.getList_w_TOTAL_STOCK_QTY());
			this.setList_w_TOTAL_STOCK_QTY_LAST_DAY(struct.getList_w_TOTAL_STOCK_QTY_LAST_DAY());
			this.setList_w_TOTAL_STOCK_QTY_LAST_MONTH(struct.getList_w_TOTAL_STOCK_QTY_LAST_MONTH());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_MRP_NAME(struct.getList_MRP_NAME());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_h_lotFlg(struct.getList_h_lotFlg());
			this.setList_h_screenflg(struct.getList_h_screenflg());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_s_PLANT_CD(struct.getList_s_PLANT_CD());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_FLG_val(struct.getList_MRP_FLG_val());
			this.setList_MRP_FLG_name(struct.getList_MRP_FLG_name());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_ITEM_STOCK_QTY(struct.getList_w_ITEM_STOCK_QTY());
			this.setList_w_ITEM_DEFECT_QTY(struct.getList_w_ITEM_DEFECT_QTY());
			this.setList_w_ITEM_STOCK_QTY_LAST_DAY(struct.getList_w_ITEM_STOCK_QTY_LAST_DAY());
			this.setList_w_ITEM_STOCK_QTY_LAST_MONTH(struct.getList_w_ITEM_STOCK_QTY_LAST_MONTH());
			this.setList_w_JOB_ODR_STOCK_QTY(struct.getList_w_JOB_ODR_STOCK_QTY());
			this.setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(struct.getList_w_JOB_ODR_STOCK_QTY_LAST_DAY());
			this.setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(struct.getList_w_JOB_ODR_STOCK_QTY_LAST_MONTH());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_w_ITEM_STOCK_QTY_FOR_MRP(struct.getList_w_ITEM_STOCK_QTY_FOR_MRP());
			this.setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(struct.getList_w_JOB_ODR_STOCK_QTY_FOR_MRP());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_STOCK_ON_HAND_QTY(struct.getList_w_STOCK_ON_HAND_QTY());
			this.setList_w_DEFECT_QTY(struct.getList_w_DEFECT_QTY());
			this.setList_w_PRVS_DAYEND_STOCK_QTY(struct.getList_w_PRVS_DAYEND_STOCK_QTY());
			this.setList_w_PRVS_MONTHEND_STOCK_QTY(struct.getList_w_PRVS_MONTHEND_STOCK_QTY());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_s2_PLANT_CD(struct.getList_s2_PLANT_CD());
			this.setList_l_PLANT_NAME(struct.getList_l_PLANT_NAME());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_STOCK_ON_HAND_QTY(struct.getList_l_STOCK_ON_HAND_QTY());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_l_EXPIRATION_DATE(struct.getList_l_EXPIRATION_DATE());
			this.setList_l_PRD_CMPLT_DATE(struct.getList_l_PRD_CMPLT_DATE());
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
	// �� 1 �ϐ������l�F i_w_ITEM_STOCK_QTY_OUTSIDE_MRP


	final static String i_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;

	// �� 2 �ϐ������l�F i_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP


	final static String i_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;

	// �� 3 �ϐ������l�F i_w_TOTAL_STOCK_QTY


	final static String i_w_TOTAL_STOCK_QTY = null;

	// �� 4 �ϐ������l�F i_w_TOTAL_STOCK_QTY_LAST_DAY


	final static String i_w_TOTAL_STOCK_QTY_LAST_DAY = null;

	// �� 5 �ϐ������l�F i_w_TOTAL_STOCK_QTY_LAST_MONTH


	final static String i_w_TOTAL_STOCK_QTY_LAST_MONTH = null;

	// �� 6 �ϐ������l�F i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// �� 7 �ϐ������l�F i_MRP_NAME


	final static String i_MRP_NAME = null;

	// �� 8 �ϐ������l�F i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// �� 9 �ϐ������l�F i_h_lotFlg


	final static String i_h_lotFlg = null;

	// �� 10 �ϐ������l�F i_h_screenflg


	final static String i_h_screenflg = null;

	// �� 11 �ϐ������l�F i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// �� 12 �ϐ������l�F i_s_PLANT_CD


	final static String i_s_PLANT_CD = null;

	// �� 13 �ϐ������l�F i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// �� 14 �ϐ������l�F i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// �� 15 �ϐ������l�F i_MRP_FLG_val


	final static String i_MRP_FLG_val = null;

	// �� 16 �ϐ������l�F i_MRP_FLG_name


	final static String i_MRP_FLG_name = null;

	// �� 17 �ϐ������l�F i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// �� 18 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 19 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 20 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 21 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 22 �ϐ������l�F i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// �� 23 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 25 �ϐ������l�F i_w_ITEM_STOCK_QTY


	final static String i_w_ITEM_STOCK_QTY = null;

	// �� 26 �ϐ������l�F i_w_ITEM_DEFECT_QTY


	final static String i_w_ITEM_DEFECT_QTY = null;

	// �� 27 �ϐ������l�F i_w_ITEM_STOCK_QTY_LAST_DAY


	final static String i_w_ITEM_STOCK_QTY_LAST_DAY = null;

	// �� 28 �ϐ������l�F i_w_ITEM_STOCK_QTY_LAST_MONTH


	final static String i_w_ITEM_STOCK_QTY_LAST_MONTH = null;

	// �� 29 �ϐ������l�F i_w_JOB_ODR_STOCK_QTY


	final static String i_w_JOB_ODR_STOCK_QTY = null;

	// �� 30 �ϐ������l�F i_w_JOB_ODR_STOCK_QTY_LAST_DAY


	final static String i_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;

	// �� 31 �ϐ������l�F i_w_JOB_ODR_STOCK_QTY_LAST_MONTH


	final static String i_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;

	// �� 32 �ϐ������l�F i_MRP_FLG


	final static Integer i_MRP_FLG = null;

	// �� 33 �ϐ������l�F i_w_ITEM_STOCK_QTY_FOR_MRP


	final static String i_w_ITEM_STOCK_QTY_FOR_MRP = null;

	// �� 34 �ϐ������l�F i_w_JOB_ODR_STOCK_QTY_FOR_MRP


	final static String i_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;

	// �� 35 �ϐ������l�F i_w_WH_CD


	final static String i_w_WH_CD = null;

	// �� 36 �ϐ������l�F i_w_STOCK_ON_HAND_QTY


	final static String i_w_STOCK_ON_HAND_QTY = null;

	// �� 37 �ϐ������l�F i_w_DEFECT_QTY


	final static String i_w_DEFECT_QTY = null;

	// �� 38 �ϐ������l�F i_w_PRVS_DAYEND_STOCK_QTY


	final static String i_w_PRVS_DAYEND_STOCK_QTY = null;

	// �� 39 �ϐ������l�F i_w_PRVS_MONTHEND_STOCK_QTY


	final static String i_w_PRVS_MONTHEND_STOCK_QTY = null;

	// �� 40 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 41 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 42 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 43 �ϐ������l�F i_s2_PLANT_CD


	final static String i_s2_PLANT_CD = null;

	// �� 44 �ϐ������l�F i_l_PLANT_NAME


	final static String i_l_PLANT_NAME = null;

	// �� 45 �ϐ������l�F i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// �� 46 �ϐ������l�F i_l_STOCK_ON_HAND_QTY


	final static String i_l_STOCK_ON_HAND_QTY = null;

	// �� 47 �ϐ������l�F i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// �� 48 �ϐ������l�F i_l_EXPIRATION_DATE


	final static String i_l_EXPIRATION_DATE = null;

	// �� 49 �ϐ������l�F i_l_PRD_CMPLT_DATE


	final static String i_l_PRD_CMPLT_DATE = null;

	// �� 50 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 51 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------

	/**
	 * ������
	 * @param �Ȃ�
	 */
	public void initialize()
	{
		m_w_ITEM_STOCK_QTY = new String("0.0");
		m_w_ITEM_DEFECT_QTY = new String("0.0");
		m_w_ITEM_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_ITEM_STOCK_QTY_LAST_MONTH = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new String("0.0");
		m_w_ITEM_STOCK_QTY_FOR_MRP = new String("0.0");
		m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_FOR_MRP = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new String("0.0");
		m_w_TOTAL_STOCK_QTY = new String("0.0");
		m_w_TOTAL_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_TOTAL_STOCK_QTY_LAST_MONTH = new String("0.0");
	}


	/**
	 * �R�s�[
	 * @param struct �R�s�[�Ώ�
	 */
	public void copy(AG0010010Struct struct)
	{
		clear();
		if(struct.m_w_ITEM_NAME != null) m_w_ITEM_NAME = new String(struct.m_w_ITEM_NAME);
		if(struct.m_DRAW_CD != null) m_DRAW_CD = new String(struct.m_DRAW_CD);
		if(struct.m_SPEC != null) m_SPEC = new String(struct.m_SPEC);
		if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(struct.m_MRP_ODR_TYP);
		if(struct.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(struct.m_w_ITEM_CD);
		if(struct.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(struct.m_w_PLANT_NAME);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_w_ITEM_STOCK_QTY != null) m_w_ITEM_STOCK_QTY = new String(struct.m_w_ITEM_STOCK_QTY);
		if(struct.m_w_ITEM_DEFECT_QTY != null) m_w_ITEM_DEFECT_QTY = new String(struct.m_w_ITEM_DEFECT_QTY);
		if(struct.m_w_ITEM_STOCK_QTY_LAST_DAY != null) m_w_ITEM_STOCK_QTY_LAST_DAY = new String(struct.m_w_ITEM_STOCK_QTY_LAST_DAY);
		if(struct.m_w_ITEM_STOCK_QTY_LAST_MONTH != null) m_w_ITEM_STOCK_QTY_LAST_MONTH = new String(struct.m_w_ITEM_STOCK_QTY_LAST_MONTH);
		if(struct.m_w_JOB_ODR_STOCK_QTY != null) m_w_JOB_ODR_STOCK_QTY = new String(struct.m_w_JOB_ODR_STOCK_QTY);
		if(struct.m_w_JOB_ODR_STOCK_QTY_LAST_DAY != null) m_w_JOB_ODR_STOCK_QTY_LAST_DAY = new String(struct.m_w_JOB_ODR_STOCK_QTY_LAST_DAY);
		if(struct.m_w_JOB_ODR_STOCK_QTY_LAST_MONTH != null) m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new String(struct.m_w_JOB_ODR_STOCK_QTY_LAST_MONTH);
		if(struct.m_MRP_FLG != null) m_MRP_FLG = new Integer(struct.m_MRP_FLG.intValue());
		if(struct.m_w_ITEM_STOCK_QTY_FOR_MRP != null) m_w_ITEM_STOCK_QTY_FOR_MRP = new String(struct.m_w_ITEM_STOCK_QTY_FOR_MRP);
		if(struct.m_w_JOB_ODR_STOCK_QTY_FOR_MRP != null) m_w_JOB_ODR_STOCK_QTY_FOR_MRP = new String(struct.m_w_JOB_ODR_STOCK_QTY_FOR_MRP);
		if(struct.m_s_PLANT_CD != null) m_s_PLANT_CD = new String(struct.m_s_PLANT_CD);
		if(struct.m_w_WH_CD != null) m_w_WH_CD = new String(struct.m_w_WH_CD);
		if(struct.m_w_STOCK_ON_HAND_QTY != null) m_w_STOCK_ON_HAND_QTY = new String(struct.m_w_STOCK_ON_HAND_QTY);
		if(struct.m_w_DEFECT_QTY != null) m_w_DEFECT_QTY = new String(struct.m_w_DEFECT_QTY);
		if(struct.m_w_PRVS_DAYEND_STOCK_QTY != null) m_w_PRVS_DAYEND_STOCK_QTY = new String(struct.m_w_PRVS_DAYEND_STOCK_QTY);
		if(struct.m_w_PRVS_MONTHEND_STOCK_QTY != null) m_w_PRVS_MONTHEND_STOCK_QTY = new String(struct.m_w_PRVS_MONTHEND_STOCK_QTY);
		if(struct.m_PLANT_NAME != null) m_PLANT_NAME = new String(struct.m_PLANT_NAME);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(struct.m_JOB_ODR_CD);
		if(struct.m_w_ITEM_STOCK_QTY_OUTSIDE_MRP != null) m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new String(struct.m_w_ITEM_STOCK_QTY_OUTSIDE_MRP);
		if(struct.m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP != null) m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new String(struct.m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP);
		if(struct.m_w_TOTAL_STOCK_QTY != null) m_w_TOTAL_STOCK_QTY = new String(struct.m_w_TOTAL_STOCK_QTY);
		if(struct.m_w_TOTAL_STOCK_QTY_LAST_DAY != null) m_w_TOTAL_STOCK_QTY_LAST_DAY = new String(struct.m_w_TOTAL_STOCK_QTY_LAST_DAY);
		if(struct.m_w_TOTAL_STOCK_QTY_LAST_MONTH != null) m_w_TOTAL_STOCK_QTY_LAST_MONTH = new String(struct.m_w_TOTAL_STOCK_QTY_LAST_MONTH);
		if(struct.m_MRP_ODR_NAME != null) m_MRP_ODR_NAME = new String(struct.m_MRP_ODR_NAME);
		if(struct.m_MRP_NAME != null) m_MRP_NAME = new String(struct.m_MRP_NAME);
		if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new String(struct.m_MRP_ODR_TYP_val);
		if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
		if(struct.m_MRP_FLG_val != null) m_MRP_FLG_val = new String(struct.m_MRP_FLG_val);
		if(struct.m_MRP_FLG_name != null) m_MRP_FLG_name = new String(struct.m_MRP_FLG_name);
		if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
	}


	/**
	 * �R�s�[�R���X�g���N�^
	 * @param struct �R�s�[�Ώ�
	 */
	 public AG0010010Struct(AG0010010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
