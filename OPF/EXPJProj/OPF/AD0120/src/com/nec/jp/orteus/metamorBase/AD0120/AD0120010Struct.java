/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0120/src/com/nec/jp/orteus/metamorBase/AD0120/AD0120010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0120;

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
 * CLASS     : AD0120010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2015/11/16 02:32:39 $
 *
 */
//}}user_implement_code_header

public class AD0120010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 2 �ϐ��F m_IN_WORK_ODR_DLV_DATE_FROM */
	public String m_IN_WORK_ODR_DLV_DATE_FROM = null;
	/** �� 3 �ϐ��F m_IN_WORK_ODR_DLV_TIME_FROM */
	public String m_IN_WORK_ODR_DLV_TIME_FROM = null;
	/** �� 4 �ϐ��F m_IN_WORK_ODR_DLV_DATE_TO */
	public String m_IN_WORK_ODR_DLV_DATE_TO = null;
	/** �� 5 �ϐ��F m_IN_WORK_ODR_DLV_TIME_TO */
	public String m_IN_WORK_ODR_DLV_TIME_TO = null;
	/** �� 6 �ϐ��F m_l_OPR_RSLT_TYP_SHOW */
	public String m_l_OPR_RSLT_TYP_SHOW = null;
	/** �� 7 �ϐ��F m_h_l_MASK_FLG */
	public String m_h_l_MASK_FLG = null;
	/** �� 8 �ϐ��F m_h_MASK_FLG */
	public String m_h_MASK_FLG = null;
	/** �� 9 �ϐ��F m_h_l_MAX_PRINT_QTY */
	public String m_h_l_MAX_PRINT_QTY = null;
	/** �� 10 �ϐ��F m_OPR_INST_START_DATE_FROM */
	public String m_OPR_INST_START_DATE_FROM = null;
	/** �� 11 �ϐ��F m_OPR_INST_START_TIME_FROM */
	public String m_OPR_INST_START_TIME_FROM = null;
	/** �� 12 �ϐ��F m_OPR_INST_START_DATE_TO */
	public String m_OPR_INST_START_DATE_TO = null;
	/** �� 13 �ϐ��F m_OPR_INST_START_TIME_TO */
	public String m_OPR_INST_START_TIME_TO = null;
	/** �� 14 �ϐ��F m_IDENT_CARD_CTL_NO */
	public String m_IDENT_CARD_CTL_NO = null;
	/** �� 15 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 16 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 17 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 18 �ϐ��F m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** �� 19 �ϐ��F m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** �� 20 �ϐ��F m_PAGE_NO */
	public String m_PAGE_NO = null;
	/** �� 21 �ϐ��F m_h_l_OPR_RSLT_TYP */
	public String m_h_l_OPR_RSLT_TYP = null;
	/** �� 22 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 23 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 24 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 25 �ϐ��F m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** �� 26 �ϐ��F m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** �� 27 �ϐ��F m_l_WORK_ODR_DLV_DATE */
	public String m_l_WORK_ODR_DLV_DATE = null;
	/** �� 28 �ϐ��F m_l_OPR_INST_START_DATE */
	public String m_l_OPR_INST_START_DATE = null;
	/** �� 29 �ϐ��F m_l_OPR_INST_QTY */
	public String m_l_OPR_INST_QTY = null;
	/** �� 30 �ϐ��F m_l_SUM_IDENT_CARD_QTY */
	public String m_l_SUM_IDENT_CARD_QTY = null;
	/** �� 31 �ϐ��F m_l_PKG_UNIT_QTY */
	public String m_l_PKG_UNIT_QTY = null;
	/** �� 32 �ϐ��F m_l_OPR_INST_CD */
	public String m_l_OPR_INST_CD = null;
	/** �� 33 �ϐ��F m_h_l_JOB_ODR_CD */
	public String m_h_l_JOB_ODR_CD = null;
	/** �� 34 �ϐ��F m_h_l_STOCK_UNIT */
	public String m_h_l_STOCK_UNIT = null;
	/** �� 35 �ϐ��F m_l_PRINT_QTY */
	public String m_l_PRINT_QTY = null;
	/** �� 36 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 37 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 38 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 39 �ϐ��F m_IN_WORK_ODR_DLV_DATETIME_FROM */
	public String m_IN_WORK_ODR_DLV_DATETIME_FROM = null;
	/** �� 40 �ϐ��F m_IN_WORK_ODR_DLV_DATETIME_TO */
	public String m_IN_WORK_ODR_DLV_DATETIME_TO = null;
	/** �� 41 �ϐ��F m_OPR_INST_START_DATETIME_FROM */
	public String m_OPR_INST_START_DATETIME_FROM = null;
	/** �� 42 �ϐ��F m_OPR_INST_START_DATETIME_TO */
	public String m_OPR_INST_START_DATETIME_TO = null;
	/** �� 43 �ϐ��F m_MAX_LINE */
	public String m_MAX_LINE = null;
	/** �� 44 �ϐ��F m_IDENT_CARD */
	public String m_IDENT_CARD = null;
	/** �� 45 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 46 �ϐ��F m_PKG_UNIT_QTY */
	public String m_PKG_UNIT_QTY = null;
	/** �� 47 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 48 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 49 �ϐ��F m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** �� 50 �ϐ��F m_PRINT_QTY */
	public String m_PRINT_QTY = null;
	/** �� 51 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 52 �ϐ��F m_IDENT_CARD_QTY */
	public String m_IDENT_CARD_QTY = null;
	/** �� 53 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 54 �ϐ��F m_MASK_FLG */
	public String m_MASK_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 2 List�ϐ��F l_IN_WORK_ODR_DLV_DATE_FROM */
	public List l_IN_WORK_ODR_DLV_DATE_FROM = null;

	/** �� 3 List�ϐ��F l_IN_WORK_ODR_DLV_TIME_FROM */
	public List l_IN_WORK_ODR_DLV_TIME_FROM = null;

	/** �� 4 List�ϐ��F l_IN_WORK_ODR_DLV_DATE_TO */
	public List l_IN_WORK_ODR_DLV_DATE_TO = null;

	/** �� 5 List�ϐ��F l_IN_WORK_ODR_DLV_TIME_TO */
	public List l_IN_WORK_ODR_DLV_TIME_TO = null;

	/** �� 6 List�ϐ��F l_l_OPR_RSLT_TYP_SHOW */
	public List l_l_OPR_RSLT_TYP_SHOW = null;

	/** �� 7 List�ϐ��F l_h_l_MASK_FLG */
	public List l_h_l_MASK_FLG = null;

	/** �� 8 List�ϐ��F l_h_MASK_FLG */
	public List l_h_MASK_FLG = null;

	/** �� 9 List�ϐ��F l_h_l_MAX_PRINT_QTY */
	public List l_h_l_MAX_PRINT_QTY = null;

	/** �� 10 List�ϐ��F l_OPR_INST_START_DATE_FROM */
	public List l_OPR_INST_START_DATE_FROM = null;

	/** �� 11 List�ϐ��F l_OPR_INST_START_TIME_FROM */
	public List l_OPR_INST_START_TIME_FROM = null;

	/** �� 12 List�ϐ��F l_OPR_INST_START_DATE_TO */
	public List l_OPR_INST_START_DATE_TO = null;

	/** �� 13 List�ϐ��F l_OPR_INST_START_TIME_TO */
	public List l_OPR_INST_START_TIME_TO = null;

	/** �� 14 List�ϐ��F l_IDENT_CARD_CTL_NO */
	public List l_IDENT_CARD_CTL_NO = null;

	/** �� 15 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 16 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 17 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 18 List�ϐ��F l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** �� 19 List�ϐ��F l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** �� 20 List�ϐ��F l_PAGE_NO */
	public List l_PAGE_NO = null;

	/** �� 21 List�ϐ��F l_h_l_OPR_RSLT_TYP */
	public List l_h_l_OPR_RSLT_TYP = null;

	/** �� 22 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 23 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 24 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 25 List�ϐ��F l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** �� 26 List�ϐ��F l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** �� 27 List�ϐ��F l_l_WORK_ODR_DLV_DATE */
	public List l_l_WORK_ODR_DLV_DATE = null;

	/** �� 28 List�ϐ��F l_l_OPR_INST_START_DATE */
	public List l_l_OPR_INST_START_DATE = null;

	/** �� 29 List�ϐ��F l_l_OPR_INST_QTY */
	public List l_l_OPR_INST_QTY = null;

	/** �� 30 List�ϐ��F l_l_SUM_IDENT_CARD_QTY */
	public List l_l_SUM_IDENT_CARD_QTY = null;

	/** �� 31 List�ϐ��F l_l_PKG_UNIT_QTY */
	public List l_l_PKG_UNIT_QTY = null;

	/** �� 32 List�ϐ��F l_l_OPR_INST_CD */
	public List l_l_OPR_INST_CD = null;

	/** �� 33 List�ϐ��F l_h_l_JOB_ODR_CD */
	public List l_h_l_JOB_ODR_CD = null;

	/** �� 34 List�ϐ��F l_h_l_STOCK_UNIT */
	public List l_h_l_STOCK_UNIT = null;

	/** �� 35 List�ϐ��F l_l_PRINT_QTY */
	public List l_l_PRINT_QTY = null;

	/** �� 36 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 37 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 38 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 39 List�ϐ��F l_IN_WORK_ODR_DLV_DATETIME_FROM */
	public List l_IN_WORK_ODR_DLV_DATETIME_FROM = null;

	/** �� 40 List�ϐ��F l_IN_WORK_ODR_DLV_DATETIME_TO */
	public List l_IN_WORK_ODR_DLV_DATETIME_TO = null;

	/** �� 41 List�ϐ��F l_OPR_INST_START_DATETIME_FROM */
	public List l_OPR_INST_START_DATETIME_FROM = null;

	/** �� 42 List�ϐ��F l_OPR_INST_START_DATETIME_TO */
	public List l_OPR_INST_START_DATETIME_TO = null;

	/** �� 43 List�ϐ��F l_MAX_LINE */
	public List l_MAX_LINE = null;

	/** �� 44 List�ϐ��F l_IDENT_CARD */
	public List l_IDENT_CARD = null;

	/** �� 45 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 46 List�ϐ��F l_PKG_UNIT_QTY */
	public List l_PKG_UNIT_QTY = null;

	/** �� 47 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 48 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 49 List�ϐ��F l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** �� 50 List�ϐ��F l_PRINT_QTY */
	public List l_PRINT_QTY = null;

	/** �� 51 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 52 List�ϐ��F l_IDENT_CARD_QTY */
	public List l_IDENT_CARD_QTY = null;

	/** �� 53 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 54 List�ϐ��F l_MASK_FLG */
	public List l_MASK_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getIN_WORK_ODR_DLV_DATE_FROM() { return m_IN_WORK_ODR_DLV_DATE_FROM; }
	public String getIN_WORK_ODR_DLV_TIME_FROM() { return m_IN_WORK_ODR_DLV_TIME_FROM; }
	public String getIN_WORK_ODR_DLV_DATE_TO() { return m_IN_WORK_ODR_DLV_DATE_TO; }
	public String getIN_WORK_ODR_DLV_TIME_TO() { return m_IN_WORK_ODR_DLV_TIME_TO; }
	public String getl_OPR_RSLT_TYP_SHOW() { return m_l_OPR_RSLT_TYP_SHOW; }
	public String geth_l_MASK_FLG() { return m_h_l_MASK_FLG; }
	public String geth_MASK_FLG() { return m_h_MASK_FLG; }
	public String geth_l_MAX_PRINT_QTY() { return m_h_l_MAX_PRINT_QTY; }
	public String getOPR_INST_START_DATE_FROM() { return m_OPR_INST_START_DATE_FROM; }
	public String getOPR_INST_START_TIME_FROM() { return m_OPR_INST_START_TIME_FROM; }
	public String getOPR_INST_START_DATE_TO() { return m_OPR_INST_START_DATE_TO; }
	public String getOPR_INST_START_TIME_TO() { return m_OPR_INST_START_TIME_TO; }
	public String getIDENT_CARD_CTL_NO() { return m_IDENT_CARD_CTL_NO; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getPAGE_NO() { return m_PAGE_NO; }
	public String geth_l_OPR_RSLT_TYP() { return m_h_l_OPR_RSLT_TYP; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_WORK_ODR_DLV_DATE() { return m_l_WORK_ODR_DLV_DATE; }
	public String getl_OPR_INST_START_DATE() { return m_l_OPR_INST_START_DATE; }
	public String getl_OPR_INST_QTY() { return m_l_OPR_INST_QTY; }
	public String getl_SUM_IDENT_CARD_QTY() { return m_l_SUM_IDENT_CARD_QTY; }
	public String getl_PKG_UNIT_QTY() { return m_l_PKG_UNIT_QTY; }
	public String getl_OPR_INST_CD() { return m_l_OPR_INST_CD; }
	public String geth_l_JOB_ODR_CD() { return m_h_l_JOB_ODR_CD; }
	public String geth_l_STOCK_UNIT() { return m_h_l_STOCK_UNIT; }
	public String getl_PRINT_QTY() { return m_l_PRINT_QTY; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getIN_WORK_ODR_DLV_DATETIME_FROM() { return m_IN_WORK_ODR_DLV_DATETIME_FROM; }
	public String getIN_WORK_ODR_DLV_DATETIME_TO() { return m_IN_WORK_ODR_DLV_DATETIME_TO; }
	public String getOPR_INST_START_DATETIME_FROM() { return m_OPR_INST_START_DATETIME_FROM; }
	public String getOPR_INST_START_DATETIME_TO() { return m_OPR_INST_START_DATETIME_TO; }
	public String getMAX_LINE() { return m_MAX_LINE; }
	public String getIDENT_CARD() { return m_IDENT_CARD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getPRINT_QTY() { return m_PRINT_QTY; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getIDENT_CARD_QTY() { return m_IDENT_CARD_QTY; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getMASK_FLG() { return m_MASK_FLG; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_IN_WORK_ODR_DLV_DATE_FROM() { return l_IN_WORK_ODR_DLV_DATE_FROM; }
	public List getList_IN_WORK_ODR_DLV_TIME_FROM() { return l_IN_WORK_ODR_DLV_TIME_FROM; }
	public List getList_IN_WORK_ODR_DLV_DATE_TO() { return l_IN_WORK_ODR_DLV_DATE_TO; }
	public List getList_IN_WORK_ODR_DLV_TIME_TO() { return l_IN_WORK_ODR_DLV_TIME_TO; }
	public List getList_l_OPR_RSLT_TYP_SHOW() { return l_l_OPR_RSLT_TYP_SHOW; }
	public List getList_h_l_MASK_FLG() { return l_h_l_MASK_FLG; }
	public List getList_h_MASK_FLG() { return l_h_MASK_FLG; }
	public List getList_h_l_MAX_PRINT_QTY() { return l_h_l_MAX_PRINT_QTY; }
	public List getList_OPR_INST_START_DATE_FROM() { return l_OPR_INST_START_DATE_FROM; }
	public List getList_OPR_INST_START_TIME_FROM() { return l_OPR_INST_START_TIME_FROM; }
	public List getList_OPR_INST_START_DATE_TO() { return l_OPR_INST_START_DATE_TO; }
	public List getList_OPR_INST_START_TIME_TO() { return l_OPR_INST_START_TIME_TO; }
	public List getList_IDENT_CARD_CTL_NO() { return l_IDENT_CARD_CTL_NO; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_PAGE_NO() { return l_PAGE_NO; }
	public List getList_h_l_OPR_RSLT_TYP() { return l_h_l_OPR_RSLT_TYP; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_WORK_ODR_DLV_DATE() { return l_l_WORK_ODR_DLV_DATE; }
	public List getList_l_OPR_INST_START_DATE() { return l_l_OPR_INST_START_DATE; }
	public List getList_l_OPR_INST_QTY() { return l_l_OPR_INST_QTY; }
	public List getList_l_SUM_IDENT_CARD_QTY() { return l_l_SUM_IDENT_CARD_QTY; }
	public List getList_l_PKG_UNIT_QTY() { return l_l_PKG_UNIT_QTY; }
	public List getList_l_OPR_INST_CD() { return l_l_OPR_INST_CD; }
	public List getList_h_l_JOB_ODR_CD() { return l_h_l_JOB_ODR_CD; }
	public List getList_h_l_STOCK_UNIT() { return l_h_l_STOCK_UNIT; }
	public List getList_l_PRINT_QTY() { return l_l_PRINT_QTY; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_IN_WORK_ODR_DLV_DATETIME_FROM() { return l_IN_WORK_ODR_DLV_DATETIME_FROM; }
	public List getList_IN_WORK_ODR_DLV_DATETIME_TO() { return l_IN_WORK_ODR_DLV_DATETIME_TO; }
	public List getList_OPR_INST_START_DATETIME_FROM() { return l_OPR_INST_START_DATETIME_FROM; }
	public List getList_OPR_INST_START_DATETIME_TO() { return l_OPR_INST_START_DATETIME_TO; }
	public List getList_MAX_LINE() { return l_MAX_LINE; }
	public List getList_IDENT_CARD() { return l_IDENT_CARD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PKG_UNIT_QTY() { return l_PKG_UNIT_QTY; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_PRINT_QTY() { return l_PRINT_QTY; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_IDENT_CARD_QTY() { return l_IDENT_CARD_QTY; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_MASK_FLG() { return l_MASK_FLG; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setIN_WORK_ODR_DLV_DATE_FROM(String val) { m_IN_WORK_ODR_DLV_DATE_FROM = val; }
	public void setIN_WORK_ODR_DLV_TIME_FROM(String val) { m_IN_WORK_ODR_DLV_TIME_FROM = val; }
	public void setIN_WORK_ODR_DLV_DATE_TO(String val) { m_IN_WORK_ODR_DLV_DATE_TO = val; }
	public void setIN_WORK_ODR_DLV_TIME_TO(String val) { m_IN_WORK_ODR_DLV_TIME_TO = val; }
	public void setl_OPR_RSLT_TYP_SHOW(String val) { m_l_OPR_RSLT_TYP_SHOW = val; }
	public void seth_l_MASK_FLG(String val) { m_h_l_MASK_FLG = val; }
	public void seth_MASK_FLG(String val) { m_h_MASK_FLG = val; }
	public void seth_l_MAX_PRINT_QTY(String val) { m_h_l_MAX_PRINT_QTY = val; }
	public void setOPR_INST_START_DATE_FROM(String val) { m_OPR_INST_START_DATE_FROM = val; }
	public void setOPR_INST_START_TIME_FROM(String val) { m_OPR_INST_START_TIME_FROM = val; }
	public void setOPR_INST_START_DATE_TO(String val) { m_OPR_INST_START_DATE_TO = val; }
	public void setOPR_INST_START_TIME_TO(String val) { m_OPR_INST_START_TIME_TO = val; }
	public void setIDENT_CARD_CTL_NO(String val) { m_IDENT_CARD_CTL_NO = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setPAGE_NO(String val) { m_PAGE_NO = val; }
	public void seth_l_OPR_RSLT_TYP(String val) { m_h_l_OPR_RSLT_TYP = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_WORK_ODR_DLV_DATE(String val) { m_l_WORK_ODR_DLV_DATE = val; }
	public void setl_OPR_INST_START_DATE(String val) { m_l_OPR_INST_START_DATE = val; }
	public void setl_OPR_INST_QTY(String val) { m_l_OPR_INST_QTY = val; }
	public void setl_SUM_IDENT_CARD_QTY(String val) { m_l_SUM_IDENT_CARD_QTY = val; }
	public void setl_PKG_UNIT_QTY(String val) { m_l_PKG_UNIT_QTY = val; }
	public void setl_OPR_INST_CD(String val) { m_l_OPR_INST_CD = val; }
	public void seth_l_JOB_ODR_CD(String val) { m_h_l_JOB_ODR_CD = val; }
	public void seth_l_STOCK_UNIT(String val) { m_h_l_STOCK_UNIT = val; }
	public void setl_PRINT_QTY(String val) { m_l_PRINT_QTY = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setIN_WORK_ODR_DLV_DATETIME_FROM(String val) { m_IN_WORK_ODR_DLV_DATETIME_FROM = val; }
	public void setIN_WORK_ODR_DLV_DATETIME_TO(String val) { m_IN_WORK_ODR_DLV_DATETIME_TO = val; }
	public void setOPR_INST_START_DATETIME_FROM(String val) { m_OPR_INST_START_DATETIME_FROM = val; }
	public void setOPR_INST_START_DATETIME_TO(String val) { m_OPR_INST_START_DATETIME_TO = val; }
	public void setMAX_LINE(String val) { m_MAX_LINE = val; }
	public void setIDENT_CARD(String val) { m_IDENT_CARD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPKG_UNIT_QTY(String val) { m_PKG_UNIT_QTY = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setPRINT_QTY(String val) { m_PRINT_QTY = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setIDENT_CARD_QTY(String val) { m_IDENT_CARD_QTY = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setMASK_FLG(String val) { m_MASK_FLG = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_IN_WORK_ODR_DLV_DATE_FROM(List list) { l_IN_WORK_ODR_DLV_DATE_FROM = list; }
	public void setList_IN_WORK_ODR_DLV_TIME_FROM(List list) { l_IN_WORK_ODR_DLV_TIME_FROM = list; }
	public void setList_IN_WORK_ODR_DLV_DATE_TO(List list) { l_IN_WORK_ODR_DLV_DATE_TO = list; }
	public void setList_IN_WORK_ODR_DLV_TIME_TO(List list) { l_IN_WORK_ODR_DLV_TIME_TO = list; }
	public void setList_l_OPR_RSLT_TYP_SHOW(List list) { l_l_OPR_RSLT_TYP_SHOW = list; }
	public void setList_h_l_MASK_FLG(List list) { l_h_l_MASK_FLG = list; }
	public void setList_h_MASK_FLG(List list) { l_h_MASK_FLG = list; }
	public void setList_h_l_MAX_PRINT_QTY(List list) { l_h_l_MAX_PRINT_QTY = list; }
	public void setList_OPR_INST_START_DATE_FROM(List list) { l_OPR_INST_START_DATE_FROM = list; }
	public void setList_OPR_INST_START_TIME_FROM(List list) { l_OPR_INST_START_TIME_FROM = list; }
	public void setList_OPR_INST_START_DATE_TO(List list) { l_OPR_INST_START_DATE_TO = list; }
	public void setList_OPR_INST_START_TIME_TO(List list) { l_OPR_INST_START_TIME_TO = list; }
	public void setList_IDENT_CARD_CTL_NO(List list) { l_IDENT_CARD_CTL_NO = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_PAGE_NO(List list) { l_PAGE_NO = list; }
	public void setList_h_l_OPR_RSLT_TYP(List list) { l_h_l_OPR_RSLT_TYP = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_WORK_ODR_DLV_DATE(List list) { l_l_WORK_ODR_DLV_DATE = list; }
	public void setList_l_OPR_INST_START_DATE(List list) { l_l_OPR_INST_START_DATE = list; }
	public void setList_l_OPR_INST_QTY(List list) { l_l_OPR_INST_QTY = list; }
	public void setList_l_SUM_IDENT_CARD_QTY(List list) { l_l_SUM_IDENT_CARD_QTY = list; }
	public void setList_l_PKG_UNIT_QTY(List list) { l_l_PKG_UNIT_QTY = list; }
	public void setList_l_OPR_INST_CD(List list) { l_l_OPR_INST_CD = list; }
	public void setList_h_l_JOB_ODR_CD(List list) { l_h_l_JOB_ODR_CD = list; }
	public void setList_h_l_STOCK_UNIT(List list) { l_h_l_STOCK_UNIT = list; }
	public void setList_l_PRINT_QTY(List list) { l_l_PRINT_QTY = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_IN_WORK_ODR_DLV_DATETIME_FROM(List list) { l_IN_WORK_ODR_DLV_DATETIME_FROM = list; }
	public void setList_IN_WORK_ODR_DLV_DATETIME_TO(List list) { l_IN_WORK_ODR_DLV_DATETIME_TO = list; }
	public void setList_OPR_INST_START_DATETIME_FROM(List list) { l_OPR_INST_START_DATETIME_FROM = list; }
	public void setList_OPR_INST_START_DATETIME_TO(List list) { l_OPR_INST_START_DATETIME_TO = list; }
	public void setList_MAX_LINE(List list) { l_MAX_LINE = list; }
	public void setList_IDENT_CARD(List list) { l_IDENT_CARD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PKG_UNIT_QTY(List list) { l_PKG_UNIT_QTY = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_PRINT_QTY(List list) { l_PRINT_QTY = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_IDENT_CARD_QTY(List list) { l_IDENT_CARD_QTY = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_MASK_FLG(List list) { l_MASK_FLG = list; }

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
			l_DOWNLOAD_FILE.add(((AD0120010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_DATE_FROM == null) {
			l_IN_WORK_ODR_DLV_DATE_FROM = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_DATE_FROM.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATE_FROM());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_TIME_FROM == null) {
			l_IN_WORK_ODR_DLV_TIME_FROM = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_TIME_FROM.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_TIME_FROM());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_DATE_TO == null) {
			l_IN_WORK_ODR_DLV_DATE_TO = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_DATE_TO.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATE_TO());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_TIME_TO == null) {
			l_IN_WORK_ODR_DLV_TIME_TO = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_TIME_TO.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_TIME_TO());
		}
		return size;
	}
	public int setL2L_l_OPR_RSLT_TYP_SHOW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_RSLT_TYP_SHOW == null) {
			l_l_OPR_RSLT_TYP_SHOW = new ArrayList();
		} else {
			l_l_OPR_RSLT_TYP_SHOW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_RSLT_TYP_SHOW.add(((AD0120010Struct) list.get(i)).getl_OPR_RSLT_TYP_SHOW());
		}
		return size;
	}
	public int setL2L_h_l_MASK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_MASK_FLG == null) {
			l_h_l_MASK_FLG = new ArrayList();
		} else {
			l_h_l_MASK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_MASK_FLG.add(((AD0120010Struct) list.get(i)).geth_l_MASK_FLG());
		}
		return size;
	}
	public int setL2L_h_MASK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MASK_FLG == null) {
			l_h_MASK_FLG = new ArrayList();
		} else {
			l_h_MASK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MASK_FLG.add(((AD0120010Struct) list.get(i)).geth_MASK_FLG());
		}
		return size;
	}
	public int setL2L_h_l_MAX_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_MAX_PRINT_QTY == null) {
			l_h_l_MAX_PRINT_QTY = new ArrayList();
		} else {
			l_h_l_MAX_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_MAX_PRINT_QTY.add(((AD0120010Struct) list.get(i)).geth_l_MAX_PRINT_QTY());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_FROM == null) {
			l_OPR_INST_START_DATE_FROM = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_FROM.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_TIME_FROM == null) {
			l_OPR_INST_START_TIME_FROM = new ArrayList();
		} else {
			l_OPR_INST_START_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_TIME_FROM.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_TIME_FROM());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_TO == null) {
			l_OPR_INST_START_DATE_TO = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_TO.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_TIME_TO == null) {
			l_OPR_INST_START_TIME_TO = new ArrayList();
		} else {
			l_OPR_INST_START_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_TIME_TO.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_TIME_TO());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_CTL_NO == null) {
			l_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_CTL_NO.add(((AD0120010Struct) list.get(i)).getIDENT_CARD_CTL_NO());
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
			l_LOT_NO.add(((AD0120010Struct) list.get(i)).getLOT_NO());
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
			l_JOB_ODR_CD.add(((AD0120010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_STOCK_UNIT.add(((AD0120010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_PARTIAL_PRD_NO.add(((AD0120010Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_OPR_DATE.add(((AD0120010Struct) list.get(i)).getOPR_DATE());
		}
		return size;
	}
	public int setL2L_PAGE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAGE_NO == null) {
			l_PAGE_NO = new ArrayList();
		} else {
			l_PAGE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAGE_NO.add(((AD0120010Struct) list.get(i)).getPAGE_NO());
		}
		return size;
	}
	public int setL2L_h_l_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_OPR_RSLT_TYP == null) {
			l_h_l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_h_l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_OPR_RSLT_TYP.add(((AD0120010Struct) list.get(i)).geth_l_OPR_RSLT_TYP());
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
			l_l_ITEM_CD.add(((AD0120010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AD0120010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_WS_CD.add(((AD0120010Struct) list.get(i)).getl_WS_CD());
		}
		return size;
	}
	public int setL2L_l_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_NAME == null) {
			l_l_WS_NAME = new ArrayList();
		} else {
			l_l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_NAME.add(((AD0120010Struct) list.get(i)).getl_WS_NAME());
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
			l_l_PLANT_CD.add(((AD0120010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_DLV_DATE == null) {
			l_l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_DLV_DATE.add(((AD0120010Struct) list.get(i)).getl_WORK_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_START_DATE == null) {
			l_l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_START_DATE.add(((AD0120010Struct) list.get(i)).getl_OPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_QTY == null) {
			l_l_OPR_INST_QTY = new ArrayList();
		} else {
			l_l_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_QTY.add(((AD0120010Struct) list.get(i)).getl_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_l_SUM_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SUM_IDENT_CARD_QTY == null) {
			l_l_SUM_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_l_SUM_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SUM_IDENT_CARD_QTY.add(((AD0120010Struct) list.get(i)).getl_SUM_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_l_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PKG_UNIT_QTY == null) {
			l_l_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_l_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PKG_UNIT_QTY.add(((AD0120010Struct) list.get(i)).getl_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_CD == null) {
			l_l_OPR_INST_CD = new ArrayList();
		} else {
			l_l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_CD.add(((AD0120010Struct) list.get(i)).getl_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_h_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_JOB_ODR_CD == null) {
			l_h_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_h_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_JOB_ODR_CD.add(((AD0120010Struct) list.get(i)).geth_l_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_STOCK_UNIT == null) {
			l_h_l_STOCK_UNIT = new ArrayList();
		} else {
			l_h_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_STOCK_UNIT.add(((AD0120010Struct) list.get(i)).geth_l_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRINT_QTY == null) {
			l_l_PRINT_QTY = new ArrayList();
		} else {
			l_l_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRINT_QTY.add(((AD0120010Struct) list.get(i)).getl_PRINT_QTY());
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
			l_ITEM_CD.add(((AD0120010Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0120010Struct) list.get(i)).getWS_CD());
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
			l_PLANT_CD.add(((AD0120010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_DATETIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_DATETIME_FROM == null) {
			l_IN_WORK_ODR_DLV_DATETIME_FROM = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_DATETIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_DATETIME_FROM.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATETIME_FROM());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_DLV_DATETIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_DLV_DATETIME_TO == null) {
			l_IN_WORK_ODR_DLV_DATETIME_TO = new ArrayList();
		} else {
			l_IN_WORK_ODR_DLV_DATETIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_DLV_DATETIME_TO.add(((AD0120010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATETIME_TO());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATETIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATETIME_FROM == null) {
			l_OPR_INST_START_DATETIME_FROM = new ArrayList();
		} else {
			l_OPR_INST_START_DATETIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATETIME_FROM.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_DATETIME_FROM());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATETIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATETIME_TO == null) {
			l_OPR_INST_START_DATETIME_TO = new ArrayList();
		} else {
			l_OPR_INST_START_DATETIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATETIME_TO.add(((AD0120010Struct) list.get(i)).getOPR_INST_START_DATETIME_TO());
		}
		return size;
	}
	public int setL2L_MAX_LINE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_LINE == null) {
			l_MAX_LINE = new ArrayList();
		} else {
			l_MAX_LINE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_LINE.add(((AD0120010Struct) list.get(i)).getMAX_LINE());
		}
		return size;
	}
	public int setL2L_IDENT_CARD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD == null) {
			l_IDENT_CARD = new ArrayList();
		} else {
			l_IDENT_CARD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD.add(((AD0120010Struct) list.get(i)).getIDENT_CARD());
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
			l_ITEM_NAME.add(((AD0120010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT_QTY == null) {
			l_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT_QTY.add(((AD0120010Struct) list.get(i)).getPKG_UNIT_QTY());
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
			l_WS_NAME.add(((AD0120010Struct) list.get(i)).getWS_NAME());
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
			l_OPR_INST_CD.add(((AD0120010Struct) list.get(i)).getOPR_INST_CD());
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
			l_OPR_INST_QTY.add(((AD0120010Struct) list.get(i)).getOPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_QTY == null) {
			l_PRINT_QTY = new ArrayList();
		} else {
			l_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_QTY.add(((AD0120010Struct) list.get(i)).getPRINT_QTY());
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
			l_WORK_ODR_CD.add(((AD0120010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_QTY == null) {
			l_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_QTY.add(((AD0120010Struct) list.get(i)).getIDENT_CARD_QTY());
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
			l_TIME_CTRL.add(((AD0120010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_MASK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MASK_FLG == null) {
			l_MASK_FLG = new ArrayList();
		} else {
			l_MASK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MASK_FLG.add(((AD0120010Struct) list.get(i)).getMASK_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_IN_WORK_ODR_DLV_DATE_FROM = null;
		m_IN_WORK_ODR_DLV_TIME_FROM = null;
		m_IN_WORK_ODR_DLV_DATE_TO = null;
		m_IN_WORK_ODR_DLV_TIME_TO = null;
		m_l_OPR_RSLT_TYP_SHOW = null;
		m_h_l_MASK_FLG = null;
		m_h_MASK_FLG = null;
		m_h_l_MAX_PRINT_QTY = null;
		m_OPR_INST_START_DATE_FROM = null;
		m_OPR_INST_START_TIME_FROM = null;
		m_OPR_INST_START_DATE_TO = null;
		m_OPR_INST_START_TIME_TO = null;
		m_IDENT_CARD_CTL_NO = null;
		m_LOT_NO = null;
		m_JOB_ODR_CD = null;
		m_STOCK_UNIT = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_DATE = null;
		m_PAGE_NO = null;
		m_h_l_OPR_RSLT_TYP = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_WS_CD = null;
		m_l_WS_NAME = null;
		m_l_PLANT_CD = null;
		m_l_WORK_ODR_DLV_DATE = null;
		m_l_OPR_INST_START_DATE = null;
		m_l_OPR_INST_QTY = null;
		m_l_SUM_IDENT_CARD_QTY = null;
		m_l_PKG_UNIT_QTY = null;
		m_l_OPR_INST_CD = null;
		m_h_l_JOB_ODR_CD = null;
		m_h_l_STOCK_UNIT = null;
		m_l_PRINT_QTY = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_PLANT_CD = null;
		m_IN_WORK_ODR_DLV_DATETIME_FROM = null;
		m_IN_WORK_ODR_DLV_DATETIME_TO = null;
		m_OPR_INST_START_DATETIME_FROM = null;
		m_OPR_INST_START_DATETIME_TO = null;
		m_MAX_LINE = null;
		m_IDENT_CARD = null;
		m_ITEM_NAME = null;
		m_PKG_UNIT_QTY = null;
		m_WS_NAME = null;
		m_OPR_INST_CD = null;
		m_OPR_INST_QTY = null;
		m_PRINT_QTY = null;
		m_WORK_ODR_CD = null;
		m_IDENT_CARD_QTY = null;
		m_TIME_CTRL = null;
		m_MASK_FLG = null;

		l_DOWNLOAD_FILE = null;
		l_IN_WORK_ODR_DLV_DATE_FROM = null;
		l_IN_WORK_ODR_DLV_TIME_FROM = null;
		l_IN_WORK_ODR_DLV_DATE_TO = null;
		l_IN_WORK_ODR_DLV_TIME_TO = null;
		l_l_OPR_RSLT_TYP_SHOW = null;
		l_h_l_MASK_FLG = null;
		l_h_MASK_FLG = null;
		l_h_l_MAX_PRINT_QTY = null;
		l_OPR_INST_START_DATE_FROM = null;
		l_OPR_INST_START_TIME_FROM = null;
		l_OPR_INST_START_DATE_TO = null;
		l_OPR_INST_START_TIME_TO = null;
		l_IDENT_CARD_CTL_NO = null;
		l_LOT_NO = null;
		l_JOB_ODR_CD = null;
		l_STOCK_UNIT = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_DATE = null;
		l_PAGE_NO = null;
		l_h_l_OPR_RSLT_TYP = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_WS_CD = null;
		l_l_WS_NAME = null;
		l_l_PLANT_CD = null;
		l_l_WORK_ODR_DLV_DATE = null;
		l_l_OPR_INST_START_DATE = null;
		l_l_OPR_INST_QTY = null;
		l_l_SUM_IDENT_CARD_QTY = null;
		l_l_PKG_UNIT_QTY = null;
		l_l_OPR_INST_CD = null;
		l_h_l_JOB_ODR_CD = null;
		l_h_l_STOCK_UNIT = null;
		l_l_PRINT_QTY = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_PLANT_CD = null;
		l_IN_WORK_ODR_DLV_DATETIME_FROM = null;
		l_IN_WORK_ODR_DLV_DATETIME_TO = null;
		l_OPR_INST_START_DATETIME_FROM = null;
		l_OPR_INST_START_DATETIME_TO = null;
		l_MAX_LINE = null;
		l_IDENT_CARD = null;
		l_ITEM_NAME = null;
		l_PKG_UNIT_QTY = null;
		l_WS_NAME = null;
		l_OPR_INST_CD = null;
		l_OPR_INST_QTY = null;
		l_PRINT_QTY = null;
		l_WORK_ODR_CD = null;
		l_IDENT_CARD_QTY = null;
		l_TIME_CTRL = null;
		l_MASK_FLG = null;

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
	 * medAD0120010�N���X�̕W���R���X�g���N�^
	 */
	public AD0120010Struct()
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
	public void setStruct(AD0120010Struct struct)
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
	public void setStructM(AD0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setIN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
			this.setIN_WORK_ODR_DLV_TIME_FROM(struct.getIN_WORK_ODR_DLV_TIME_FROM());
			this.setIN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO());
			this.setIN_WORK_ODR_DLV_TIME_TO(struct.getIN_WORK_ODR_DLV_TIME_TO());
			this.setl_OPR_RSLT_TYP_SHOW(struct.getl_OPR_RSLT_TYP_SHOW());
			this.seth_l_MASK_FLG(struct.geth_l_MASK_FLG());
			this.seth_MASK_FLG(struct.geth_MASK_FLG());
			this.seth_l_MAX_PRINT_QTY(struct.geth_l_MAX_PRINT_QTY());
			this.setOPR_INST_START_DATE_FROM(struct.getOPR_INST_START_DATE_FROM());
			this.setOPR_INST_START_TIME_FROM(struct.getOPR_INST_START_TIME_FROM());
			this.setOPR_INST_START_DATE_TO(struct.getOPR_INST_START_DATE_TO());
			this.setOPR_INST_START_TIME_TO(struct.getOPR_INST_START_TIME_TO());
			this.setIDENT_CARD_CTL_NO(struct.getIDENT_CARD_CTL_NO());
			this.setLOT_NO(struct.getLOT_NO());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setPAGE_NO(struct.getPAGE_NO());
			this.seth_l_OPR_RSLT_TYP(struct.geth_l_OPR_RSLT_TYP());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_WORK_ODR_DLV_DATE(struct.getl_WORK_ODR_DLV_DATE());
			this.setl_OPR_INST_START_DATE(struct.getl_OPR_INST_START_DATE());
			this.setl_OPR_INST_QTY(struct.getl_OPR_INST_QTY());
			this.setl_SUM_IDENT_CARD_QTY(struct.getl_SUM_IDENT_CARD_QTY());
			this.setl_PKG_UNIT_QTY(struct.getl_PKG_UNIT_QTY());
			this.setl_OPR_INST_CD(struct.getl_OPR_INST_CD());
			this.seth_l_JOB_ODR_CD(struct.geth_l_JOB_ODR_CD());
			this.seth_l_STOCK_UNIT(struct.geth_l_STOCK_UNIT());
			this.setl_PRINT_QTY(struct.getl_PRINT_QTY());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATETIME_FROM());
			this.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATETIME_TO());
			this.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATETIME_FROM());
			this.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATETIME_TO());
			this.setMAX_LINE(struct.getMAX_LINE());
			this.setIDENT_CARD(struct.getIDENT_CARD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPKG_UNIT_QTY(struct.getPKG_UNIT_QTY());
			this.setWS_NAME(struct.getWS_NAME());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setPRINT_QTY(struct.getPRINT_QTY());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setIDENT_CARD_QTY(struct.getIDENT_CARD_QTY());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setMASK_FLG(struct.getMASK_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_IN_WORK_ODR_DLV_DATE_FROM(struct.getList_IN_WORK_ODR_DLV_DATE_FROM());
			this.setList_IN_WORK_ODR_DLV_TIME_FROM(struct.getList_IN_WORK_ODR_DLV_TIME_FROM());
			this.setList_IN_WORK_ODR_DLV_DATE_TO(struct.getList_IN_WORK_ODR_DLV_DATE_TO());
			this.setList_IN_WORK_ODR_DLV_TIME_TO(struct.getList_IN_WORK_ODR_DLV_TIME_TO());
			this.setList_l_OPR_RSLT_TYP_SHOW(struct.getList_l_OPR_RSLT_TYP_SHOW());
			this.setList_h_l_MASK_FLG(struct.getList_h_l_MASK_FLG());
			this.setList_h_MASK_FLG(struct.getList_h_MASK_FLG());
			this.setList_h_l_MAX_PRINT_QTY(struct.getList_h_l_MAX_PRINT_QTY());
			this.setList_OPR_INST_START_DATE_FROM(struct.getList_OPR_INST_START_DATE_FROM());
			this.setList_OPR_INST_START_TIME_FROM(struct.getList_OPR_INST_START_TIME_FROM());
			this.setList_OPR_INST_START_DATE_TO(struct.getList_OPR_INST_START_DATE_TO());
			this.setList_OPR_INST_START_TIME_TO(struct.getList_OPR_INST_START_TIME_TO());
			this.setList_IDENT_CARD_CTL_NO(struct.getList_IDENT_CARD_CTL_NO());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_PAGE_NO(struct.getList_PAGE_NO());
			this.setList_h_l_OPR_RSLT_TYP(struct.getList_h_l_OPR_RSLT_TYP());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_WORK_ODR_DLV_DATE(struct.getList_l_WORK_ODR_DLV_DATE());
			this.setList_l_OPR_INST_START_DATE(struct.getList_l_OPR_INST_START_DATE());
			this.setList_l_OPR_INST_QTY(struct.getList_l_OPR_INST_QTY());
			this.setList_l_SUM_IDENT_CARD_QTY(struct.getList_l_SUM_IDENT_CARD_QTY());
			this.setList_l_PKG_UNIT_QTY(struct.getList_l_PKG_UNIT_QTY());
			this.setList_l_OPR_INST_CD(struct.getList_l_OPR_INST_CD());
			this.setList_h_l_JOB_ODR_CD(struct.getList_h_l_JOB_ODR_CD());
			this.setList_h_l_STOCK_UNIT(struct.getList_h_l_STOCK_UNIT());
			this.setList_l_PRINT_QTY(struct.getList_l_PRINT_QTY());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_IN_WORK_ODR_DLV_DATETIME_FROM(struct.getList_IN_WORK_ODR_DLV_DATETIME_FROM());
			this.setList_IN_WORK_ODR_DLV_DATETIME_TO(struct.getList_IN_WORK_ODR_DLV_DATETIME_TO());
			this.setList_OPR_INST_START_DATETIME_FROM(struct.getList_OPR_INST_START_DATETIME_FROM());
			this.setList_OPR_INST_START_DATETIME_TO(struct.getList_OPR_INST_START_DATETIME_TO());
			this.setList_MAX_LINE(struct.getList_MAX_LINE());
			this.setList_IDENT_CARD(struct.getList_IDENT_CARD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PKG_UNIT_QTY(struct.getList_PKG_UNIT_QTY());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_PRINT_QTY(struct.getList_PRINT_QTY());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_IDENT_CARD_QTY(struct.getList_IDENT_CARD_QTY());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_MASK_FLG(struct.getList_MASK_FLG());
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
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_FROM


	final static String i_IN_WORK_ODR_DLV_DATE_FROM = null;

	// �� 3 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_FROM


	final static String i_IN_WORK_ODR_DLV_TIME_FROM = null;

	// �� 4 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_TO


	final static String i_IN_WORK_ODR_DLV_DATE_TO = null;

	// �� 5 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_TO


	final static String i_IN_WORK_ODR_DLV_TIME_TO = null;

	// �� 6 �ϐ������l�F i_l_OPR_RSLT_TYP_SHOW


	final static String i_l_OPR_RSLT_TYP_SHOW = null;

	// �� 7 �ϐ������l�F i_h_l_MASK_FLG


	final static String i_h_l_MASK_FLG = null;

	// �� 8 �ϐ������l�F i_h_MASK_FLG


	final static String i_h_MASK_FLG = null;

	// �� 9 �ϐ������l�F i_h_l_MAX_PRINT_QTY


	final static String i_h_l_MAX_PRINT_QTY = null;

	// �� 10 �ϐ������l�F i_OPR_INST_START_DATE_FROM


	final static String i_OPR_INST_START_DATE_FROM = null;

	// �� 11 �ϐ������l�F i_OPR_INST_START_TIME_FROM


	final static String i_OPR_INST_START_TIME_FROM = null;

	// �� 12 �ϐ������l�F i_OPR_INST_START_DATE_TO


	final static String i_OPR_INST_START_DATE_TO = null;

	// �� 13 �ϐ������l�F i_OPR_INST_START_TIME_TO


	final static String i_OPR_INST_START_TIME_TO = null;

	// �� 14 �ϐ������l�F i_IDENT_CARD_CTL_NO


	final static String i_IDENT_CARD_CTL_NO = null;

	// �� 15 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 16 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 17 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 18 �ϐ������l�F i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// �� 19 �ϐ������l�F i_OPR_DATE


	final static String i_OPR_DATE = null;

	// �� 20 �ϐ������l�F i_PAGE_NO


	final static String i_PAGE_NO = null;

	// �� 21 �ϐ������l�F i_h_l_OPR_RSLT_TYP


	final static String i_h_l_OPR_RSLT_TYP = null;

	// �� 22 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 23 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 24 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 25 �ϐ������l�F i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// �� 26 �ϐ������l�F i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// �� 27 �ϐ������l�F i_l_WORK_ODR_DLV_DATE


	final static String i_l_WORK_ODR_DLV_DATE = null;

	// �� 28 �ϐ������l�F i_l_OPR_INST_START_DATE


	final static String i_l_OPR_INST_START_DATE = null;

	// �� 29 �ϐ������l�F i_l_OPR_INST_QTY


	final static String i_l_OPR_INST_QTY = null;

	// �� 30 �ϐ������l�F i_l_SUM_IDENT_CARD_QTY


	final static String i_l_SUM_IDENT_CARD_QTY = null;

	// �� 31 �ϐ������l�F i_l_PKG_UNIT_QTY


	final static String i_l_PKG_UNIT_QTY = null;

	// �� 32 �ϐ������l�F i_l_OPR_INST_CD


	final static String i_l_OPR_INST_CD = null;

	// �� 33 �ϐ������l�F i_h_l_JOB_ODR_CD


	final static String i_h_l_JOB_ODR_CD = null;

	// �� 34 �ϐ������l�F i_h_l_STOCK_UNIT


	final static String i_h_l_STOCK_UNIT = null;

	// �� 35 �ϐ������l�F i_l_PRINT_QTY


	final static String i_l_PRINT_QTY = null;

	// �� 36 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 38 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 39 �ϐ������l�F i_IN_WORK_ODR_DLV_DATETIME_FROM


	final static String i_IN_WORK_ODR_DLV_DATETIME_FROM = null;

	// �� 40 �ϐ������l�F i_IN_WORK_ODR_DLV_DATETIME_TO


	final static String i_IN_WORK_ODR_DLV_DATETIME_TO = null;

	// �� 41 �ϐ������l�F i_OPR_INST_START_DATETIME_FROM


	final static String i_OPR_INST_START_DATETIME_FROM = null;

	// �� 42 �ϐ������l�F i_OPR_INST_START_DATETIME_TO


	final static String i_OPR_INST_START_DATETIME_TO = null;

	// �� 43 �ϐ������l�F i_MAX_LINE


	final static String i_MAX_LINE = null;

	// �� 44 �ϐ������l�F i_IDENT_CARD


	final static String i_IDENT_CARD = null;

	// �� 45 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 46 �ϐ������l�F i_PKG_UNIT_QTY


	final static String i_PKG_UNIT_QTY = null;

	// �� 47 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 48 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 49 �ϐ������l�F i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// �� 50 �ϐ������l�F i_PRINT_QTY


	final static String i_PRINT_QTY = null;

	// �� 51 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 52 �ϐ������l�F i_IDENT_CARD_QTY


	final static String i_IDENT_CARD_QTY = null;

	// �� 53 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 54 �ϐ������l�F i_MASK_FLG


	final static String i_MASK_FLG = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_FROM

	final static String i_IN_WORK_ODR_DLV_DATE_FROM = null;

	// �� 3 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_FROM

	final static String i_IN_WORK_ODR_DLV_TIME_FROM = null;

	// �� 4 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_TO

	final static String i_IN_WORK_ODR_DLV_DATE_TO = null;

	// �� 5 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_TO

	final static String i_IN_WORK_ODR_DLV_TIME_TO = null;

	// �� 6 �ϐ������l�F i_l_OPR_RSLT_TYP_SHOW

	final static String i_l_OPR_RSLT_TYP_SHOW = null;

	// �� 7 �ϐ������l�F i_l_PRINT_QTY

	final static String i_l_PRINT_QTY = null;

	// �� 8 �ϐ������l�F i_OPR_INST_START_DATE

	final static String i_OPR_INST_START_DATE = null;

	// �� 9 �ϐ������l�F i_OPR_INST_START_DATE_HHMM

	final static String i_OPR_INST_START_DATE_HHMM = null;

	// �� 10 �ϐ������l�F i_h_l_MASK_FLG

	final static String i_h_l_MASK_FLG = null;

	// �� 11 �ϐ������l�F i_h_MASK_FLG

	final static String i_h_MASK_FLG = null;

	// �� 12 �ϐ������l�F i_l_PKG_UNIT_QTY

	final static String i_l_PKG_UNIT_QTY = null;

	// �� 13 �ϐ������l�F i_IDENT_CARD_CTL_NO

	final static String i_IDENT_CARD_CTL_NO = null;

	// �� 14 �ϐ������l�F i_LOT_NO

	final static String i_LOT_NO = null;

	// �� 15 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 16 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 17 �ϐ������l�F i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// �� 18 �ϐ������l�F i_OPR_DATE

	final static String i_OPR_DATE = null;

	// �� 19 �ϐ������l�F i_PAGE_NO

	final static String i_PAGE_NO = null;

	// �� 20 �ϐ������l�F i_h_l_OPR_RSLT_TYP

	final static String i_h_l_OPR_RSLT_TYP = null;

	// �� 21 �ϐ������l�F i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// �� 23 �ϐ������l�F i_l_WS_CD

	final static String i_l_WS_CD = null;

	// �� 24 �ϐ������l�F i_l_WS_NAME

	final static String i_l_WS_NAME = null;

	// �� 25 �ϐ������l�F i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// �� 26 �ϐ������l�F i_l_WORK_ODR_DLV_DATE

	final static String i_l_WORK_ODR_DLV_DATE = null;

	// �� 27 �ϐ������l�F i_l_OPR_INST_QTY

	final static String i_l_OPR_INST_QTY = null;

	// �� 28 �ϐ������l�F i_l_SUM_IDENT_CARD_QTY

	final static String i_l_SUM_IDENT_CARD_QTY = null;

	// �� 29 �ϐ������l�F i_l_OPR_INST_CD

	final static String i_l_OPR_INST_CD = null;

	// �� 30 �ϐ������l�F i_h_l_JOB_ODR_CD

	final static String i_h_l_JOB_ODR_CD = null;

	// �� 31 �ϐ������l�F i_h_l_STOCK_UNIT

	final static String i_h_l_STOCK_UNIT = null;

	// �� 32 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 33 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 34 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 35 �ϐ������l�F i_IN_WORK_ODR_DLV_DATETIME_FROM

	final static String i_IN_WORK_ODR_DLV_DATETIME_FROM = null;

	// �� 36 �ϐ������l�F i_IN_WORK_ODR_DLV_DATETIME_TO

	final static String i_IN_WORK_ODR_DLV_DATETIME_TO = null;

	// �� 37 �ϐ������l�F i_IN_OPR_INST_START_DATE

	final static String i_IN_OPR_INST_START_DATE = null;

	// �� 38 �ϐ������l�F i_MAX_LINE

	final static String i_MAX_LINE = null;

	// �� 39 �ϐ������l�F i_IDENT_CARD

	final static String i_IDENT_CARD = null;

	// �� 40 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 41 �ϐ������l�F i_PKG_UNIT_QTY

	final static String i_PKG_UNIT_QTY = null;

	// �� 42 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 43 �ϐ������l�F i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// �� 44 �ϐ������l�F i_OPR_INST_QTY

	final static String i_OPR_INST_QTY = null;

	// �� 45 �ϐ������l�F i_PRINT_QTY

	final static String i_PRINT_QTY = null;

	// �� 46 �ϐ������l�F i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// �� 47 �ϐ������l�F i_IDENT_CARD_QTY

	final static String i_IDENT_CARD_QTY = null;

	// �� 48 �ϐ������l�F i_TIME_CTRL

	final static String i_TIME_CTRL = null;

	// �� 49 �ϐ������l�F i_MASK_FLG

	final static String i_MASK_FLG = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_IN_WORK_ODR_DLV_DATE_FROM = i_IN_WORK_ODR_DLV_DATE_FROM;
		m_IN_WORK_ODR_DLV_TIME_FROM = i_IN_WORK_ODR_DLV_TIME_FROM;
		m_IN_WORK_ODR_DLV_DATE_TO = i_IN_WORK_ODR_DLV_DATE_TO;
		m_IN_WORK_ODR_DLV_TIME_TO = i_IN_WORK_ODR_DLV_TIME_TO;
		m_l_OPR_RSLT_TYP_SHOW = i_l_OPR_RSLT_TYP_SHOW;
		m_l_PRINT_QTY = i_l_PRINT_QTY;
		m_h_l_MASK_FLG = i_h_l_MASK_FLG;
		m_h_MASK_FLG = i_h_MASK_FLG;
		m_l_PKG_UNIT_QTY = i_l_PKG_UNIT_QTY;
		m_IDENT_CARD_CTL_NO = i_IDENT_CARD_CTL_NO;
		m_LOT_NO = i_LOT_NO;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_OPR_DATE = i_OPR_DATE;
		m_PAGE_NO = i_PAGE_NO;
		m_h_l_OPR_RSLT_TYP = i_h_l_OPR_RSLT_TYP;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_WS_CD = i_l_WS_CD;
		m_l_WS_NAME = i_l_WS_NAME;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_WORK_ODR_DLV_DATE = i_l_WORK_ODR_DLV_DATE;
		m_l_OPR_INST_QTY = i_l_OPR_INST_QTY;
		m_l_SUM_IDENT_CARD_QTY = i_l_SUM_IDENT_CARD_QTY;
		m_l_OPR_INST_CD = i_l_OPR_INST_CD;
		m_h_l_JOB_ODR_CD = i_h_l_JOB_ODR_CD;
		m_h_l_STOCK_UNIT = i_h_l_STOCK_UNIT;
		m_ITEM_CD = i_ITEM_CD;
		m_WS_CD = i_WS_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_IN_WORK_ODR_DLV_DATETIME_FROM = i_IN_WORK_ODR_DLV_DATETIME_FROM;
		m_IN_WORK_ODR_DLV_DATETIME_TO = i_IN_WORK_ODR_DLV_DATETIME_TO;
		m_MAX_LINE = i_MAX_LINE;
		m_IDENT_CARD = i_IDENT_CARD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PKG_UNIT_QTY = i_PKG_UNIT_QTY;
		m_WS_NAME = i_WS_NAME;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_PRINT_QTY = i_PRINT_QTY;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_IDENT_CARD_QTY = i_IDENT_CARD_QTY;
		m_TIME_CTRL = i_TIME_CTRL;
		m_MASK_FLG = i_MASK_FLG;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
