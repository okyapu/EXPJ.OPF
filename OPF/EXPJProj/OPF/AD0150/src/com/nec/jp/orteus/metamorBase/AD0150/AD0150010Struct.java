/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0150/src/com/nec/jp/orteus/metamorBase/AD0150/AD0150010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0150;

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
 * CLASS     : AD0150010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:03:52 $
 *
 */
//}}user_implement_code_header

public class AD0150010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 2 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 3 �ϐ��F m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** �� 4 �ϐ��F m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** �� 5 �ϐ��F m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** �� 6 �ϐ��F m_l_ERR_CTR_NM */
	public String m_l_ERR_CTR_NM = null;
	/** �� 7 �ϐ��F m_l_ERR_ITEM_CD */
	public String m_l_ERR_ITEM_CD = null;
	/** �� 8 �ϐ��F m_l_ERR_PRD_DUE_DATE */
	public String m_l_ERR_PRD_DUE_DATE = null;
	/** �� 9 �ϐ��F m_l_ERR_PRD_START_DATE */
	public String m_l_ERR_PRD_START_DATE = null;
	/** �� 10 �ϐ��F m_l_ERR_OPR_INST_QTY */
	public String m_l_ERR_OPR_INST_QTY = null;
	/** �� 11 �ϐ��F m_l_ERR_WS_CD */
	public String m_l_ERR_WS_CD = null;
	/** �� 12 �ϐ��F m_l_ERR_JOB_ODR_CD */
	public String m_l_ERR_JOB_ODR_CD = null;
	/** �� 13 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** �� 14 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 15 �ϐ��F m_OPR_INST_CD_GNR_TYP */
	public String m_OPR_INST_CD_GNR_TYP = null;
	/** �� 16 �ϐ��F m_OPR_INST_SLIP_ISS_DATE */
	public String m_OPR_INST_SLIP_ISS_DATE = null;
	/** �� 17 �ϐ��F m_OPR_INST_SLIP_ISS_FLG */
	public String m_OPR_INST_SLIP_ISS_FLG = null;
	/** �� 18 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 19 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 20 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 21 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 22 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 23 �ϐ��F m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** �� 24 �ϐ��F m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** �� 25 �ϐ��F m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** �� 26 �ϐ��F m_OPR_RSLT_TYP */
	public String m_OPR_RSLT_TYP = null;
	/** �� 27 �ϐ��F m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** �� 28 �ϐ��F m_PROC_EXPLOSION_FLG */
	public String m_PROC_EXPLOSION_FLG = null;
	/** �� 29 �ϐ��F m_OPR_INST_DATE */
	public String m_OPR_INST_DATE = null;
	/** �� 30 �ϐ��F m_WORK_CMPLT_DATE */
	public String m_WORK_CMPLT_DATE = null;
	/** �� 31 �ϐ��F m_WORK_IN_PROC_COMMENT */
	public String m_WORK_IN_PROC_COMMENT = null;
	/** �� 32 �ϐ��F m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** �� 33 �ϐ��F m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** �� 34 �ϐ��F m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** �� 35 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 36 �ϐ��F m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** �� 37 �ϐ��F m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** �� 38 �ϐ��F m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** �� 39 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 40 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 41 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 42 �ϐ��F m_HOLIDAY_FLG */
	public String m_HOLIDAY_FLG = null;
	/** �� 43 �ϐ��F m_DATE */
	public String m_DATE = null;
	/** �� 44 �ϐ��F m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** �� 45 �ϐ��F m_PROP_LT */
	public String m_PROP_LT = null;
	/** �� 46 �ϐ��F m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** �� 47 �ϐ��F m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** �� 48 �ϐ��F m_vc2PLANT_CD */
	public String m_vc2PLANT_CD = null;
	/** �� 49 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 50 �ϐ��F m_count_JOB_ODR_ALC_CD */
	public String m_count_JOB_ODR_ALC_CD = null;
	/** �� 51 �ϐ��F m_DUE_DATE_BY_ALC */
	public String m_DUE_DATE_BY_ALC = null;
	/** �� 52 �ϐ��F m_DUE_DATE_BY_ALC_TIME */
	public String m_DUE_DATE_BY_ALC_TIME = null;
	/** �� 53 �ϐ��F m_count_OD_NO */
	public String m_count_OD_NO = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 2 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 3 List�ϐ��F l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** �� 4 List�ϐ��F l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** �� 5 List�ϐ��F l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** �� 6 List�ϐ��F l_l_ERR_CTR_NM */
	public List l_l_ERR_CTR_NM = null;

	/** �� 7 List�ϐ��F l_l_ERR_ITEM_CD */
	public List l_l_ERR_ITEM_CD = null;

	/** �� 8 List�ϐ��F l_l_ERR_PRD_DUE_DATE */
	public List l_l_ERR_PRD_DUE_DATE = null;

	/** �� 9 List�ϐ��F l_l_ERR_PRD_START_DATE */
	public List l_l_ERR_PRD_START_DATE = null;

	/** �� 10 List�ϐ��F l_l_ERR_OPR_INST_QTY */
	public List l_l_ERR_OPR_INST_QTY = null;

	/** �� 11 List�ϐ��F l_l_ERR_WS_CD */
	public List l_l_ERR_WS_CD = null;

	/** �� 12 List�ϐ��F l_l_ERR_JOB_ODR_CD */
	public List l_l_ERR_JOB_ODR_CD = null;

	/** �� 13 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** �� 14 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 15 List�ϐ��F l_OPR_INST_CD_GNR_TYP */
	public List l_OPR_INST_CD_GNR_TYP = null;

	/** �� 16 List�ϐ��F l_OPR_INST_SLIP_ISS_DATE */
	public List l_OPR_INST_SLIP_ISS_DATE = null;

	/** �� 17 List�ϐ��F l_OPR_INST_SLIP_ISS_FLG */
	public List l_OPR_INST_SLIP_ISS_FLG = null;

	/** �� 18 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 20 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 21 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 23 List�ϐ��F l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** �� 24 List�ϐ��F l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** �� 25 List�ϐ��F l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** �� 26 List�ϐ��F l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** �� 27 List�ϐ��F l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** �� 28 List�ϐ��F l_PROC_EXPLOSION_FLG */
	public List l_PROC_EXPLOSION_FLG = null;

	/** �� 29 List�ϐ��F l_OPR_INST_DATE */
	public List l_OPR_INST_DATE = null;

	/** �� 30 List�ϐ��F l_WORK_CMPLT_DATE */
	public List l_WORK_CMPLT_DATE = null;

	/** �� 31 List�ϐ��F l_WORK_IN_PROC_COMMENT */
	public List l_WORK_IN_PROC_COMMENT = null;

	/** �� 32 List�ϐ��F l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** �� 33 List�ϐ��F l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** �� 34 List�ϐ��F l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** �� 35 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 36 List�ϐ��F l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** �� 37 List�ϐ��F l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** �� 38 List�ϐ��F l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** �� 39 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 40 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 41 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 42 List�ϐ��F l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** �� 43 List�ϐ��F l_DATE */
	public List l_DATE = null;

	/** �� 44 List�ϐ��F l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** �� 45 List�ϐ��F l_PROP_LT */
	public List l_PROP_LT = null;

	/** �� 46 List�ϐ��F l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** �� 47 List�ϐ��F l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** �� 48 List�ϐ��F l_vc2PLANT_CD */
	public List l_vc2PLANT_CD = null;

	/** �� 49 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 50 List�ϐ��F l_count_JOB_ODR_ALC_CD */
	public List l_count_JOB_ODR_ALC_CD = null;

	/** �� 51 List�ϐ��F l_DUE_DATE_BY_ALC */
	public List l_DUE_DATE_BY_ALC = null;

	/** �� 52 List�ϐ��F l_DUE_DATE_BY_ALC_TIME */
	public List l_DUE_DATE_BY_ALC_TIME = null;

	/** �� 53 List�ϐ��F l_count_OD_NO */
	public List l_count_OD_NO = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_ITEM_CD() { return m_l_ERR_ITEM_CD; }
	public String getl_ERR_PRD_DUE_DATE() { return m_l_ERR_PRD_DUE_DATE; }
	public String getl_ERR_PRD_START_DATE() { return m_l_ERR_PRD_START_DATE; }
	public String getl_ERR_OPR_INST_QTY() { return m_l_ERR_OPR_INST_QTY; }
	public String getl_ERR_WS_CD() { return m_l_ERR_WS_CD; }
	public String getl_ERR_JOB_ODR_CD() { return m_l_ERR_JOB_ODR_CD; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getOPR_INST_CD_GNR_TYP() { return m_OPR_INST_CD_GNR_TYP; }
	public String getOPR_INST_SLIP_ISS_DATE() { return m_OPR_INST_SLIP_ISS_DATE; }
	public String getOPR_INST_SLIP_ISS_FLG() { return m_OPR_INST_SLIP_ISS_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getPROC_EXPLOSION_FLG() { return m_PROC_EXPLOSION_FLG; }
	public String getOPR_INST_DATE() { return m_OPR_INST_DATE; }
	public String getWORK_CMPLT_DATE() { return m_WORK_CMPLT_DATE; }
	public String getWORK_IN_PROC_COMMENT() { return m_WORK_IN_PROC_COMMENT; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getDATE() { return m_DATE; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getvc2PLANT_CD() { return m_vc2PLANT_CD; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getcount_JOB_ODR_ALC_CD() { return m_count_JOB_ODR_ALC_CD; }
	public String getDUE_DATE_BY_ALC() { return m_DUE_DATE_BY_ALC; }
	public String getDUE_DATE_BY_ALC_TIME() { return m_DUE_DATE_BY_ALC_TIME; }
	public String getcount_OD_NO() { return m_count_OD_NO; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_ITEM_CD() { return l_l_ERR_ITEM_CD; }
	public List getList_l_ERR_PRD_DUE_DATE() { return l_l_ERR_PRD_DUE_DATE; }
	public List getList_l_ERR_PRD_START_DATE() { return l_l_ERR_PRD_START_DATE; }
	public List getList_l_ERR_OPR_INST_QTY() { return l_l_ERR_OPR_INST_QTY; }
	public List getList_l_ERR_WS_CD() { return l_l_ERR_WS_CD; }
	public List getList_l_ERR_JOB_ODR_CD() { return l_l_ERR_JOB_ODR_CD; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_OPR_INST_CD_GNR_TYP() { return l_OPR_INST_CD_GNR_TYP; }
	public List getList_OPR_INST_SLIP_ISS_DATE() { return l_OPR_INST_SLIP_ISS_DATE; }
	public List getList_OPR_INST_SLIP_ISS_FLG() { return l_OPR_INST_SLIP_ISS_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_PROC_EXPLOSION_FLG() { return l_PROC_EXPLOSION_FLG; }
	public List getList_OPR_INST_DATE() { return l_OPR_INST_DATE; }
	public List getList_WORK_CMPLT_DATE() { return l_WORK_CMPLT_DATE; }
	public List getList_WORK_IN_PROC_COMMENT() { return l_WORK_IN_PROC_COMMENT; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_DATE() { return l_DATE; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_vc2PLANT_CD() { return l_vc2PLANT_CD; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_count_JOB_ODR_ALC_CD() { return l_count_JOB_ODR_ALC_CD; }
	public List getList_DUE_DATE_BY_ALC() { return l_DUE_DATE_BY_ALC; }
	public List getList_DUE_DATE_BY_ALC_TIME() { return l_DUE_DATE_BY_ALC_TIME; }
	public List getList_count_OD_NO() { return l_count_OD_NO; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_ITEM_CD(String val) { m_l_ERR_ITEM_CD = val; }
	public void setl_ERR_PRD_DUE_DATE(String val) { m_l_ERR_PRD_DUE_DATE = val; }
	public void setl_ERR_PRD_START_DATE(String val) { m_l_ERR_PRD_START_DATE = val; }
	public void setl_ERR_OPR_INST_QTY(String val) { m_l_ERR_OPR_INST_QTY = val; }
	public void setl_ERR_WS_CD(String val) { m_l_ERR_WS_CD = val; }
	public void setl_ERR_JOB_ODR_CD(String val) { m_l_ERR_JOB_ODR_CD = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setOPR_INST_CD_GNR_TYP(String val) { m_OPR_INST_CD_GNR_TYP = val; }
	public void setOPR_INST_SLIP_ISS_DATE(String val) { m_OPR_INST_SLIP_ISS_DATE = val; }
	public void setOPR_INST_SLIP_ISS_FLG(String val) { m_OPR_INST_SLIP_ISS_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setPROC_EXPLOSION_FLG(String val) { m_PROC_EXPLOSION_FLG = val; }
	public void setOPR_INST_DATE(String val) { m_OPR_INST_DATE = val; }
	public void setWORK_CMPLT_DATE(String val) { m_WORK_CMPLT_DATE = val; }
	public void setWORK_IN_PROC_COMMENT(String val) { m_WORK_IN_PROC_COMMENT = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = val; }
	public void setDATE(String val) { m_DATE = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setvc2PLANT_CD(String val) { m_vc2PLANT_CD = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setcount_JOB_ODR_ALC_CD(String val) { m_count_JOB_ODR_ALC_CD = val; }
	public void setDUE_DATE_BY_ALC(String val) { m_DUE_DATE_BY_ALC = val; }
	public void setDUE_DATE_BY_ALC_TIME(String val) { m_DUE_DATE_BY_ALC_TIME = val; }
	public void setcount_OD_NO(String val) { m_count_OD_NO = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_ITEM_CD(List list) { l_l_ERR_ITEM_CD = list; }
	public void setList_l_ERR_PRD_DUE_DATE(List list) { l_l_ERR_PRD_DUE_DATE = list; }
	public void setList_l_ERR_PRD_START_DATE(List list) { l_l_ERR_PRD_START_DATE = list; }
	public void setList_l_ERR_OPR_INST_QTY(List list) { l_l_ERR_OPR_INST_QTY = list; }
	public void setList_l_ERR_WS_CD(List list) { l_l_ERR_WS_CD = list; }
	public void setList_l_ERR_JOB_ODR_CD(List list) { l_l_ERR_JOB_ODR_CD = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_OPR_INST_CD_GNR_TYP(List list) { l_OPR_INST_CD_GNR_TYP = list; }
	public void setList_OPR_INST_SLIP_ISS_DATE(List list) { l_OPR_INST_SLIP_ISS_DATE = list; }
	public void setList_OPR_INST_SLIP_ISS_FLG(List list) { l_OPR_INST_SLIP_ISS_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_PROC_EXPLOSION_FLG(List list) { l_PROC_EXPLOSION_FLG = list; }
	public void setList_OPR_INST_DATE(List list) { l_OPR_INST_DATE = list; }
	public void setList_WORK_CMPLT_DATE(List list) { l_WORK_CMPLT_DATE = list; }
	public void setList_WORK_IN_PROC_COMMENT(List list) { l_WORK_IN_PROC_COMMENT = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_DATE(List list) { l_DATE = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_vc2PLANT_CD(List list) { l_vc2PLANT_CD = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_count_JOB_ODR_ALC_CD(List list) { l_count_JOB_ODR_ALC_CD = list; }
	public void setList_DUE_DATE_BY_ALC(List list) { l_DUE_DATE_BY_ALC = list; }
	public void setList_DUE_DATE_BY_ALC_TIME(List list) { l_DUE_DATE_BY_ALC_TIME = list; }
	public void setList_count_OD_NO(List list) { l_count_OD_NO = list; }

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
			l_FileName.add(((AD0150010Struct) list.get(i)).getFileName());
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
			l_DOWNLOAD_FILE.add(((AD0150010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AD0150010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AD0150010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AD0150010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_l_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CTR_NM == null) {
			l_l_ERR_CTR_NM = new ArrayList();
		} else {
			l_l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CTR_NM.add(((AD0150010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ITEM_CD == null) {
			l_l_ERR_ITEM_CD = new ArrayList();
		} else {
			l_l_ERR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ITEM_CD.add(((AD0150010Struct) list.get(i)).getl_ERR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PRD_DUE_DATE == null) {
			l_l_ERR_PRD_DUE_DATE = new ArrayList();
		} else {
			l_l_ERR_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PRD_DUE_DATE.add(((AD0150010Struct) list.get(i)).getl_ERR_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PRD_START_DATE == null) {
			l_l_ERR_PRD_START_DATE = new ArrayList();
		} else {
			l_l_ERR_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PRD_START_DATE.add(((AD0150010Struct) list.get(i)).getl_ERR_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_OPR_INST_QTY == null) {
			l_l_ERR_OPR_INST_QTY = new ArrayList();
		} else {
			l_l_ERR_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_OPR_INST_QTY.add(((AD0150010Struct) list.get(i)).getl_ERR_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WS_CD == null) {
			l_l_ERR_WS_CD = new ArrayList();
		} else {
			l_l_ERR_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WS_CD.add(((AD0150010Struct) list.get(i)).getl_ERR_WS_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_JOB_ODR_CD == null) {
			l_l_ERR_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_ERR_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_JOB_ODR_CD.add(((AD0150010Struct) list.get(i)).getl_ERR_JOB_ODR_CD());
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
			l_w_COLUMN_FLG.add(((AD0150010Struct) list.get(i)).getw_COLUMN_FLG());
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
			l_OPR_INST_CD.add(((AD0150010Struct) list.get(i)).getOPR_INST_CD());
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
			l_OPR_INST_CD_GNR_TYP.add(((AD0150010Struct) list.get(i)).getOPR_INST_CD_GNR_TYP());
		}
		return size;
	}
	public int setL2L_OPR_INST_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_SLIP_ISS_DATE == null) {
			l_OPR_INST_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_OPR_INST_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_SLIP_ISS_DATE.add(((AD0150010Struct) list.get(i)).getOPR_INST_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_OPR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_SLIP_ISS_FLG == null) {
			l_OPR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_OPR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_SLIP_ISS_FLG.add(((AD0150010Struct) list.get(i)).getOPR_INST_SLIP_ISS_FLG());
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
			l_PLANT_CD.add(((AD0150010Struct) list.get(i)).getPLANT_CD());
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
			l_WORK_ODR_CD.add(((AD0150010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_OD_NO.add(((AD0150010Struct) list.get(i)).getOD_NO());
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
			l_ITEM_CD.add(((AD0150010Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0150010Struct) list.get(i)).getWS_CD());
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
			l_OPR_INST_START_DATE.add(((AD0150010Struct) list.get(i)).getOPR_INST_START_DATE());
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
			l_WORK_ODR_DLV_DATE.add(((AD0150010Struct) list.get(i)).getWORK_ODR_DLV_DATE());
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
			l_OPR_INST_QTY.add(((AD0150010Struct) list.get(i)).getOPR_INST_QTY());
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
			l_OPR_RSLT_TYP.add(((AD0150010Struct) list.get(i)).getOPR_RSLT_TYP());
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
			l_WORK_STS_TYP.add(((AD0150010Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXPLOSION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXPLOSION_FLG == null) {
			l_PROC_EXPLOSION_FLG = new ArrayList();
		} else {
			l_PROC_EXPLOSION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXPLOSION_FLG.add(((AD0150010Struct) list.get(i)).getPROC_EXPLOSION_FLG());
		}
		return size;
	}
	public int setL2L_OPR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_DATE == null) {
			l_OPR_INST_DATE = new ArrayList();
		} else {
			l_OPR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_DATE.add(((AD0150010Struct) list.get(i)).getOPR_INST_DATE());
		}
		return size;
	}
	public int setL2L_WORK_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_CMPLT_DATE == null) {
			l_WORK_CMPLT_DATE = new ArrayList();
		} else {
			l_WORK_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_CMPLT_DATE.add(((AD0150010Struct) list.get(i)).getWORK_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_COMMENT == null) {
			l_WORK_IN_PROC_COMMENT = new ArrayList();
		} else {
			l_WORK_IN_PROC_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_COMMENT.add(((AD0150010Struct) list.get(i)).getWORK_IN_PROC_COMMENT());
		}
		return size;
	}
	public int setL2L_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE == null) {
			l_DUE_DATE = new ArrayList();
		} else {
			l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE.add(((AD0150010Struct) list.get(i)).getDUE_DATE());
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
			l_PARENT_OD_NO.add(((AD0150010Struct) list.get(i)).getPARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE == null) {
			l_ODR_START_DATE = new ArrayList();
		} else {
			l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE.add(((AD0150010Struct) list.get(i)).getODR_START_DATE());
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
			l_JOB_ODR_CD.add(((AD0150010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP == null) {
			l_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP.add(((AD0150010Struct) list.get(i)).getJOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE == null) {
			l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE.add(((AD0150010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
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
			l_JOB_ODR_TYP.add(((AD0150010Struct) list.get(i)).getJOB_ODR_TYP());
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
			l_BUSINESS_OPR_DATE.add(((AD0150010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_UNIT_QTY_TYP.add(((AD0150010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_MRP_ODR_TYP.add(((AD0150010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AD0150010Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATE == null) {
			l_DATE = new ArrayList();
		} else {
			l_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATE.add(((AD0150010Struct) list.get(i)).getDATE());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AD0150010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AD0150010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AD0150010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AD0150010Struct) list.get(i)).getPROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_vc2PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2PLANT_CD == null) {
			l_vc2PLANT_CD = new ArrayList();
		} else {
			l_vc2PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2PLANT_CD.add(((AD0150010Struct) list.get(i)).getvc2PLANT_CD());
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
			l_TIME_CTRL.add(((AD0150010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_count_JOB_ODR_ALC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_count_JOB_ODR_ALC_CD == null) {
			l_count_JOB_ODR_ALC_CD = new ArrayList();
		} else {
			l_count_JOB_ODR_ALC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_count_JOB_ODR_ALC_CD.add(((AD0150010Struct) list.get(i)).getcount_JOB_ODR_ALC_CD());
		}
		return size;
	}
	public int setL2L_DUE_DATE_BY_ALC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_BY_ALC == null) {
			l_DUE_DATE_BY_ALC = new ArrayList();
		} else {
			l_DUE_DATE_BY_ALC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_BY_ALC.add(((AD0150010Struct) list.get(i)).getDUE_DATE_BY_ALC());
		}
		return size;
	}
	public int setL2L_DUE_DATE_BY_ALC_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_BY_ALC_TIME == null) {
			l_DUE_DATE_BY_ALC_TIME = new ArrayList();
		} else {
			l_DUE_DATE_BY_ALC_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_BY_ALC_TIME.add(((AD0150010Struct) list.get(i)).getDUE_DATE_BY_ALC_TIME());
		}
		return size;
	}
	public int setL2L_count_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_count_OD_NO == null) {
			l_count_OD_NO = new ArrayList();
		} else {
			l_count_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_count_OD_NO.add(((AD0150010Struct) list.get(i)).getcount_OD_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_TYP = null;
		m_l_ERR_INFO = null;
		m_l_ERR_CTR_NM = null;
		m_l_ERR_ITEM_CD = null;
		m_l_ERR_PRD_DUE_DATE = null;
		m_l_ERR_PRD_START_DATE = null;
		m_l_ERR_OPR_INST_QTY = null;
		m_l_ERR_WS_CD = null;
		m_l_ERR_JOB_ODR_CD = null;
		m_w_COLUMN_FLG = null;
		m_OPR_INST_CD = null;
		m_OPR_INST_CD_GNR_TYP = null;
		m_OPR_INST_SLIP_ISS_DATE = null;
		m_OPR_INST_SLIP_ISS_FLG = null;
		m_PLANT_CD = null;
		m_WORK_ODR_CD = null;
		m_OD_NO = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_OPR_INST_START_DATE = null;
		m_WORK_ODR_DLV_DATE = null;
		m_OPR_INST_QTY = null;
		m_OPR_RSLT_TYP = null;
		m_WORK_STS_TYP = null;
		m_PROC_EXPLOSION_FLG = null;
		m_OPR_INST_DATE = null;
		m_WORK_CMPLT_DATE = null;
		m_WORK_IN_PROC_COMMENT = null;
		m_DUE_DATE = null;
		m_PARENT_OD_NO = null;
		m_ODR_START_DATE = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_DLV_DATE = null;
		m_JOB_ODR_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_UNIT_QTY_TYP = null;
		m_MRP_ODR_TYP = null;
		m_HOLIDAY_FLG = null;
		m_DATE = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_PROP_LOT_SIZE = null;
		m_vc2PLANT_CD = null;
		m_TIME_CTRL = null;
		m_count_JOB_ODR_ALC_CD = null;
		m_DUE_DATE_BY_ALC = null;
		m_DUE_DATE_BY_ALC_TIME = null;
		m_count_OD_NO = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_TYP = null;
		l_l_ERR_INFO = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_ITEM_CD = null;
		l_l_ERR_PRD_DUE_DATE = null;
		l_l_ERR_PRD_START_DATE = null;
		l_l_ERR_OPR_INST_QTY = null;
		l_l_ERR_WS_CD = null;
		l_l_ERR_JOB_ODR_CD = null;
		l_w_COLUMN_FLG = null;
		l_OPR_INST_CD = null;
		l_OPR_INST_CD_GNR_TYP = null;
		l_OPR_INST_SLIP_ISS_DATE = null;
		l_OPR_INST_SLIP_ISS_FLG = null;
		l_PLANT_CD = null;
		l_WORK_ODR_CD = null;
		l_OD_NO = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_OPR_INST_START_DATE = null;
		l_WORK_ODR_DLV_DATE = null;
		l_OPR_INST_QTY = null;
		l_OPR_RSLT_TYP = null;
		l_WORK_STS_TYP = null;
		l_PROC_EXPLOSION_FLG = null;
		l_OPR_INST_DATE = null;
		l_WORK_CMPLT_DATE = null;
		l_WORK_IN_PROC_COMMENT = null;
		l_DUE_DATE = null;
		l_PARENT_OD_NO = null;
		l_ODR_START_DATE = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_DLV_DATE = null;
		l_JOB_ODR_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_UNIT_QTY_TYP = null;
		l_MRP_ODR_TYP = null;
		l_HOLIDAY_FLG = null;
		l_DATE = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_PROP_LOT_SIZE = null;
		l_vc2PLANT_CD = null;
		l_TIME_CTRL = null;
		l_count_JOB_ODR_ALC_CD = null;
		l_DUE_DATE_BY_ALC = null;
		l_DUE_DATE_BY_ALC_TIME = null;
		l_count_OD_NO = null;

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
	 * medAD0150010�N���X�̕W���R���X�g���N�^
	 */
	public AD0150010Struct()
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
	public void setStruct(AD0150010Struct struct)
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
	public void setStructM(AD0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setl_ERR_CTR_NM(struct.getl_ERR_CTR_NM());
			this.setl_ERR_ITEM_CD(struct.getl_ERR_ITEM_CD());
			this.setl_ERR_PRD_DUE_DATE(struct.getl_ERR_PRD_DUE_DATE());
			this.setl_ERR_PRD_START_DATE(struct.getl_ERR_PRD_START_DATE());
			this.setl_ERR_OPR_INST_QTY(struct.getl_ERR_OPR_INST_QTY());
			this.setl_ERR_WS_CD(struct.getl_ERR_WS_CD());
			this.setl_ERR_JOB_ODR_CD(struct.getl_ERR_JOB_ODR_CD());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setOPR_INST_CD_GNR_TYP(struct.getOPR_INST_CD_GNR_TYP());
			this.setOPR_INST_SLIP_ISS_DATE(struct.getOPR_INST_SLIP_ISS_DATE());
			this.setOPR_INST_SLIP_ISS_FLG(struct.getOPR_INST_SLIP_ISS_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setPROC_EXPLOSION_FLG(struct.getPROC_EXPLOSION_FLG());
			this.setOPR_INST_DATE(struct.getOPR_INST_DATE());
			this.setWORK_CMPLT_DATE(struct.getWORK_CMPLT_DATE());
			this.setWORK_IN_PROC_COMMENT(struct.getWORK_IN_PROC_COMMENT());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setDATE(struct.getDATE());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setvc2PLANT_CD(struct.getvc2PLANT_CD());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setcount_JOB_ODR_ALC_CD(struct.getcount_JOB_ODR_ALC_CD());
			this.setDUE_DATE_BY_ALC(struct.getDUE_DATE_BY_ALC());
			this.setDUE_DATE_BY_ALC_TIME(struct.getDUE_DATE_BY_ALC_TIME());
			this.setcount_OD_NO(struct.getcount_OD_NO());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_l_ERR_CTR_NM(struct.getList_l_ERR_CTR_NM());
			this.setList_l_ERR_ITEM_CD(struct.getList_l_ERR_ITEM_CD());
			this.setList_l_ERR_PRD_DUE_DATE(struct.getList_l_ERR_PRD_DUE_DATE());
			this.setList_l_ERR_PRD_START_DATE(struct.getList_l_ERR_PRD_START_DATE());
			this.setList_l_ERR_OPR_INST_QTY(struct.getList_l_ERR_OPR_INST_QTY());
			this.setList_l_ERR_WS_CD(struct.getList_l_ERR_WS_CD());
			this.setList_l_ERR_JOB_ODR_CD(struct.getList_l_ERR_JOB_ODR_CD());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_OPR_INST_CD_GNR_TYP(struct.getList_OPR_INST_CD_GNR_TYP());
			this.setList_OPR_INST_SLIP_ISS_DATE(struct.getList_OPR_INST_SLIP_ISS_DATE());
			this.setList_OPR_INST_SLIP_ISS_FLG(struct.getList_OPR_INST_SLIP_ISS_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_PROC_EXPLOSION_FLG(struct.getList_PROC_EXPLOSION_FLG());
			this.setList_OPR_INST_DATE(struct.getList_OPR_INST_DATE());
			this.setList_WORK_CMPLT_DATE(struct.getList_WORK_CMPLT_DATE());
			this.setList_WORK_IN_PROC_COMMENT(struct.getList_WORK_IN_PROC_COMMENT());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_DATE(struct.getList_DATE());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_vc2PLANT_CD(struct.getList_vc2PLANT_CD());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_count_JOB_ODR_ALC_CD(struct.getList_count_JOB_ODR_ALC_CD());
			this.setList_DUE_DATE_BY_ALC(struct.getList_DUE_DATE_BY_ALC());
			this.setList_DUE_DATE_BY_ALC_TIME(struct.getList_DUE_DATE_BY_ALC_TIME());
			this.setList_count_OD_NO(struct.getList_count_OD_NO());
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
	// �� 1 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// �� 4 �ϐ������l�F i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// �� 5 �ϐ������l�F i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// �� 6 �ϐ������l�F i_l_ERR_CTR_NM


	final static String i_l_ERR_CTR_NM = null;

	// �� 7 �ϐ������l�F i_l_ERR_ITEM_CD


	final static String i_l_ERR_ITEM_CD = null;

	// �� 8 �ϐ������l�F i_l_ERR_PRD_DUE_DATE


	final static String i_l_ERR_PRD_DUE_DATE = null;

	// �� 9 �ϐ������l�F i_l_ERR_PRD_START_DATE


	final static String i_l_ERR_PRD_START_DATE = null;

	// �� 10 �ϐ������l�F i_l_ERR_OPR_INST_QTY


	final static String i_l_ERR_OPR_INST_QTY = null;

	// �� 11 �ϐ������l�F i_l_ERR_WS_CD


	final static String i_l_ERR_WS_CD = null;

	// �� 12 �ϐ������l�F i_l_ERR_JOB_ODR_CD


	final static String i_l_ERR_JOB_ODR_CD = null;

	// �� 13 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// �� 14 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 15 �ϐ������l�F i_OPR_INST_CD_GNR_TYP


	final static String i_OPR_INST_CD_GNR_TYP = null;

	// �� 16 �ϐ������l�F i_OPR_INST_SLIP_ISS_DATE


	final static String i_OPR_INST_SLIP_ISS_DATE = null;

	// �� 17 �ϐ������l�F i_OPR_INST_SLIP_ISS_FLG


	final static String i_OPR_INST_SLIP_ISS_FLG = null;

	// �� 18 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 20 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 21 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 23 �ϐ������l�F i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// �� 24 �ϐ������l�F i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// �� 25 �ϐ������l�F i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// �� 26 �ϐ������l�F i_OPR_RSLT_TYP


	final static String i_OPR_RSLT_TYP = null;

	// �� 27 �ϐ������l�F i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// �� 28 �ϐ������l�F i_PROC_EXPLOSION_FLG


	final static String i_PROC_EXPLOSION_FLG = null;

	// �� 29 �ϐ������l�F i_OPR_INST_DATE


	final static String i_OPR_INST_DATE = null;

	// �� 30 �ϐ������l�F i_WORK_CMPLT_DATE


	final static String i_WORK_CMPLT_DATE = null;

	// �� 31 �ϐ������l�F i_WORK_IN_PROC_COMMENT


	final static String i_WORK_IN_PROC_COMMENT = null;

	// �� 32 �ϐ������l�F i_DUE_DATE


	final static String i_DUE_DATE = null;

	// �� 33 �ϐ������l�F i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// �� 34 �ϐ������l�F i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// �� 35 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 36 �ϐ������l�F i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// �� 37 �ϐ������l�F i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 38 �ϐ������l�F i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// �� 39 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 40 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 41 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 42 �ϐ������l�F i_HOLIDAY_FLG


	final static String i_HOLIDAY_FLG = null;

	// �� 43 �ϐ������l�F i_DATE


	final static String i_DATE = null;

	// �� 44 �ϐ������l�F i_FIXED_LT


	final static String i_FIXED_LT = null;

	// �� 45 �ϐ������l�F i_PROP_LT


	final static String i_PROP_LT = null;

	// �� 46 �ϐ������l�F i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// �� 47 �ϐ������l�F i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// �� 48 �ϐ������l�F i_vc2PLANT_CD


	final static String i_vc2PLANT_CD = null;

	// �� 49 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 50 �ϐ������l�F i_count_JOB_ODR_ALC_CD


	final static String i_count_JOB_ODR_ALC_CD = null;

	// �� 51 �ϐ������l�F i_DUE_DATE_BY_ALC


	final static String i_DUE_DATE_BY_ALC = null;

	// �� 52 �ϐ������l�F i_DUE_DATE_BY_ALC_TIME


	final static String i_DUE_DATE_BY_ALC_TIME = null;

	// �� 53 �ϐ������l�F i_count_OD_NO


	final static String i_count_OD_NO = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_FileName

	final static String i_FileName = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_l_ERROR_IN

	final static String i_l_ERROR_IN = null;

	// �� 4 �ϐ������l�F i_l_ERR_TYP

	final static String i_l_ERR_TYP = null;

	// �� 5 �ϐ������l�F i_l_ERR_INFO

	final static String i_l_ERR_INFO = null;

	// �� 6 �ϐ������l�F i_l_ERR_CTR_NM

	final static String i_l_ERR_CTR_NM = null;

	// �� 7 �ϐ������l�F i_l_ERR_ITEM_CD

	final static String i_l_ERR_ITEM_CD = null;

	// �� 8 �ϐ������l�F i_l_ERR_PRD_DUE_DATE

	final static String i_l_ERR_PRD_DUE_DATE = null;

	// �� 9 �ϐ������l�F i_l_ERR_PRD_START_DATE

	final static String i_l_ERR_PRD_START_DATE = null;

	// �� 10 �ϐ������l�F i_l_ERR_OPR_INST_QTY

	final static String i_l_ERR_OPR_INST_QTY = null;

	// �� 11 �ϐ������l�F i_l_ERR_WS_CD

	final static String i_l_ERR_WS_CD = null;

	// �� 12 �ϐ������l�F i_l_ERR_JOB_ODR_CD

	final static String i_l_ERR_JOB_ODR_CD = null;

	// �� 13 �ϐ������l�F i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// �� 14 �ϐ������l�F i_OPR_INST_CD_GNR_TYP

	final static String i_OPR_INST_CD_GNR_TYP = null;

	// �� 15 �ϐ������l�F i_OPR_INST_SLIP_ISS_DATE

	final static String i_OPR_INST_SLIP_ISS_DATE = null;

	// �� 16 �ϐ������l�F i_OPR_INST_SLIP_ISS_FLG

	final static String i_OPR_INST_SLIP_ISS_FLG = null;

	// �� 17 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// �� 19 �ϐ������l�F i_OD_NO

	final static String i_OD_NO = null;

	// �� 20 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 22 �ϐ������l�F i_OPR_INST_START_DATE

	final static String i_OPR_INST_START_DATE = null;

	// �� 23 �ϐ������l�F i_WORK_ODR_DLV_DATE

	final static String i_WORK_ODR_DLV_DATE = null;

	// �� 24 �ϐ������l�F i_OPR_INST_QTY

	final static String i_OPR_INST_QTY = null;

	// �� 25 �ϐ������l�F i_OPR_RSLT_TYP

	final static String i_OPR_RSLT_TYP = null;

	// �� 26 �ϐ������l�F i_WORK_STS_TYP

	final static String i_WORK_STS_TYP = null;

	// �� 27 �ϐ������l�F i_PROC_EXPLOSION_FLG

	final static String i_PROC_EXPLOSION_FLG = null;

	// �� 28 �ϐ������l�F i_OPR_INST_DATE

	final static String i_OPR_INST_DATE = null;

	// �� 29 �ϐ������l�F i_WORK_CMPLT_DATE

	final static String i_WORK_CMPLT_DATE = null;

	// �� 30 �ϐ������l�F i_WORK_IN_PROC_COMMENT

	final static String i_WORK_IN_PROC_COMMENT = null;

	// �� 31 �ϐ������l�F i_JOB_ODR_TYP

	final static String i_JOB_ODR_TYP = null;

	// �� 32 �ϐ������l�F i_JOB_ODR_DLV_DATE

	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 33 �ϐ������l�F i_JOB_ODR_STS_TYP

	final static String i_JOB_ODR_STS_TYP = null;

	// �� 34 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 35 �ϐ������l�F i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_ERROR_IN = i_l_ERROR_IN;
		m_l_ERR_TYP = i_l_ERR_TYP;
		m_l_ERR_INFO = i_l_ERR_INFO;
		m_l_ERR_CTR_NM = i_l_ERR_CTR_NM;
		m_l_ERR_ITEM_CD = i_l_ERR_ITEM_CD;
		m_l_ERR_PRD_DUE_DATE = i_l_ERR_PRD_DUE_DATE;
		m_l_ERR_PRD_START_DATE = i_l_ERR_PRD_START_DATE;
		m_l_ERR_OPR_INST_QTY = i_l_ERR_OPR_INST_QTY;
		m_l_ERR_WS_CD = i_l_ERR_WS_CD;
		m_l_ERR_JOB_ODR_CD = i_l_ERR_JOB_ODR_CD;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_OPR_INST_CD_GNR_TYP = i_OPR_INST_CD_GNR_TYP;
		m_OPR_INST_SLIP_ISS_DATE = i_OPR_INST_SLIP_ISS_DATE;
		m_OPR_INST_SLIP_ISS_FLG = i_OPR_INST_SLIP_ISS_FLG;
		m_PLANT_CD = i_PLANT_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_OD_NO = i_OD_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_WS_CD = i_WS_CD;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_OPR_RSLT_TYP = i_OPR_RSLT_TYP;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
		m_PROC_EXPLOSION_FLG = i_PROC_EXPLOSION_FLG;
		m_OPR_INST_DATE = i_OPR_INST_DATE;
		m_WORK_CMPLT_DATE = i_WORK_CMPLT_DATE;
		m_WORK_IN_PROC_COMMENT = i_WORK_IN_PROC_COMMENT;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
