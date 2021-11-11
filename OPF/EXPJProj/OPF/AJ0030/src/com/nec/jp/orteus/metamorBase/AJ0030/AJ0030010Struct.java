/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0030/src/com/nec/jp/orteus/metamorBase/AJ0030/AJ0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0030;

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
//}}user_implement_code_header

public class AJ0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_JOB_ODR_TYP_DN */
	public String m_JOB_ODR_TYP_DN = null;
	/** �� 2 �ϐ��F m_h_PARAMETER_OD_NO */
	public String m_h_PARAMETER_OD_NO = null;
	/** �� 3 �ϐ��F m_l_OUTSIDE_TYP_DN */
	public String m_l_OUTSIDE_TYP_DN = null;
	/** �� 4 �ϐ��F m_l_ACPT_INSPC_TYP_DN */
	public String m_l_ACPT_INSPC_TYP_DN = null;
	/** �� 5 �ϐ��F m_l_PROGRESS_STATUS_DN */
	public String m_l_PROGRESS_STATUS_DN = null;
	/** �� 6 �ϐ��F m_JOB_ODR_DLV_TIME */
	public String m_JOB_ODR_DLV_TIME = null;
	/** �� 7 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 8 �ϐ��F m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** �� 9 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 10 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 11 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 12 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 13 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 14 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 15 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 16 �ϐ��F m_PARAMETER_OD_NO */
	public String m_PARAMETER_OD_NO = null;
	/** �� 17 �ϐ��F m_l_PROC_EXPLOSION_FLG */
	public String m_l_PROC_EXPLOSION_FLG = null;
	/** �� 18 �ϐ��F m_l_WORK_STS_TYP */
	public String m_l_WORK_STS_TYP = null;
	/** �� 19 �ϐ��F m_l_WORK_STS_TYP_DN */
	public String m_l_WORK_STS_TYP_DN = null;
	/** �� 20 �ϐ��F m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** �� 21 �ϐ��F m_l_OPR_INST_CD */
	public String m_l_OPR_INST_CD = null;
	/** �� 22 �ϐ��F m_l_WORK_IN_PROC_CD */
	public String m_l_WORK_IN_PROC_CD = null;
	/** �� 23 �ϐ��F m_l_PROC_NAME */
	public String m_l_PROC_NAME = null;
	/** �� 24 �ϐ��F m_l_PROC_NO */
	public String m_l_PROC_NO = null;
	/** �� 25 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 26 �ϐ��F m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** �� 27 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 28 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 29 �ϐ��F m_l_OUTSIDE_TYP */
	public String m_l_OUTSIDE_TYP = null;
	/** �� 30 �ϐ��F m_l_OPR_INST_DATE */
	public String m_l_OPR_INST_DATE = null;
	/** �� 31 �ϐ��F m_l_OPR_INST_SLIP_ISS_DATE */
	public String m_l_OPR_INST_SLIP_ISS_DATE = null;
	/** �� 32 �ϐ��F m_l_OPR_INST_START_DATE */
	public String m_l_OPR_INST_START_DATE = null;
	/** �� 33 �ϐ��F m_l_WORK_ODR_DLV_DATE */
	public String m_l_WORK_ODR_DLV_DATE = null;
	/** �� 34 �ϐ��F m_l_OPR_INST_QTY */
	public String m_l_OPR_INST_QTY = null;
	/** �� 35 �ϐ��F m_l_TOTAL_ACPT_QTY */
	public String m_l_TOTAL_ACPT_QTY = null;
	/** �� 36 �ϐ��F m_l_TOTAL_DEFECT_QTY */
	public String m_l_TOTAL_DEFECT_QTY = null;
	/** �� 37 �ϐ��F m_l_WORK_CMPLT_DATE */
	public String m_l_WORK_CMPLT_DATE = null;
	/** �� 38 �ϐ��F m_l_ACPT_INSPC_TYP */
	public String m_l_ACPT_INSPC_TYP = null;
	/** �� 39 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 40 �ϐ��F m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** �� 41 �ϐ��F m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** �� 42 �ϐ��F m_JOB_ODR_QTY */
	public String m_JOB_ODR_QTY = null;
	/** �� 43 �ϐ��F m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** �� 44 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 45 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_JOB_ODR_TYP_DN */
	public List l_JOB_ODR_TYP_DN = null;

	/** �� 2 List�ϐ��F l_h_PARAMETER_OD_NO */
	public List l_h_PARAMETER_OD_NO = null;

	/** �� 3 List�ϐ��F l_l_OUTSIDE_TYP_DN */
	public List l_l_OUTSIDE_TYP_DN = null;

	/** �� 4 List�ϐ��F l_l_ACPT_INSPC_TYP_DN */
	public List l_l_ACPT_INSPC_TYP_DN = null;

	/** �� 5 List�ϐ��F l_l_PROGRESS_STATUS_DN */
	public List l_l_PROGRESS_STATUS_DN = null;

	/** �� 6 List�ϐ��F l_JOB_ODR_DLV_TIME */
	public List l_JOB_ODR_DLV_TIME = null;

	/** �� 7 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 8 List�ϐ��F l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** �� 9 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 10 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 12 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 13 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 14 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 16 List�ϐ��F l_PARAMETER_OD_NO */
	public List l_PARAMETER_OD_NO = null;

	/** �� 17 List�ϐ��F l_l_PROC_EXPLOSION_FLG */
	public List l_l_PROC_EXPLOSION_FLG = null;

	/** �� 18 List�ϐ��F l_l_WORK_STS_TYP */
	public List l_l_WORK_STS_TYP = null;

	/** �� 19 List�ϐ��F l_l_WORK_STS_TYP_DN */
	public List l_l_WORK_STS_TYP_DN = null;

	/** �� 20 List�ϐ��F l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** �� 21 List�ϐ��F l_l_OPR_INST_CD */
	public List l_l_OPR_INST_CD = null;

	/** �� 22 List�ϐ��F l_l_WORK_IN_PROC_CD */
	public List l_l_WORK_IN_PROC_CD = null;

	/** �� 23 List�ϐ��F l_l_PROC_NAME */
	public List l_l_PROC_NAME = null;

	/** �� 24 List�ϐ��F l_l_PROC_NO */
	public List l_l_PROC_NO = null;

	/** �� 25 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 26 List�ϐ��F l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** �� 27 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 28 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 29 List�ϐ��F l_l_OUTSIDE_TYP */
	public List l_l_OUTSIDE_TYP = null;

	/** �� 30 List�ϐ��F l_l_OPR_INST_DATE */
	public List l_l_OPR_INST_DATE = null;

	/** �� 31 List�ϐ��F l_l_OPR_INST_SLIP_ISS_DATE */
	public List l_l_OPR_INST_SLIP_ISS_DATE = null;

	/** �� 32 List�ϐ��F l_l_OPR_INST_START_DATE */
	public List l_l_OPR_INST_START_DATE = null;

	/** �� 33 List�ϐ��F l_l_WORK_ODR_DLV_DATE */
	public List l_l_WORK_ODR_DLV_DATE = null;

	/** �� 34 List�ϐ��F l_l_OPR_INST_QTY */
	public List l_l_OPR_INST_QTY = null;

	/** �� 35 List�ϐ��F l_l_TOTAL_ACPT_QTY */
	public List l_l_TOTAL_ACPT_QTY = null;

	/** �� 36 List�ϐ��F l_l_TOTAL_DEFECT_QTY */
	public List l_l_TOTAL_DEFECT_QTY = null;

	/** �� 37 List�ϐ��F l_l_WORK_CMPLT_DATE */
	public List l_l_WORK_CMPLT_DATE = null;

	/** �� 38 List�ϐ��F l_l_ACPT_INSPC_TYP */
	public List l_l_ACPT_INSPC_TYP = null;

	/** �� 39 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 40 List�ϐ��F l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** �� 41 List�ϐ��F l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** �� 42 List�ϐ��F l_JOB_ODR_QTY */
	public List l_JOB_ODR_QTY = null;

	/** �� 43 List�ϐ��F l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** �� 44 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 45 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getJOB_ODR_TYP_DN() { return m_JOB_ODR_TYP_DN; }
	public String geth_PARAMETER_OD_NO() { return m_h_PARAMETER_OD_NO; }
	public String getl_OUTSIDE_TYP_DN() { return m_l_OUTSIDE_TYP_DN; }
	public String getl_ACPT_INSPC_TYP_DN() { return m_l_ACPT_INSPC_TYP_DN; }
	public String getl_PROGRESS_STATUS_DN() { return m_l_PROGRESS_STATUS_DN; }
	public String getJOB_ODR_DLV_TIME() { return m_JOB_ODR_DLV_TIME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPARAMETER_OD_NO() { return m_PARAMETER_OD_NO; }
	public String getl_PROC_EXPLOSION_FLG() { return m_l_PROC_EXPLOSION_FLG; }
	public String getl_WORK_STS_TYP() { return m_l_WORK_STS_TYP; }
	public String getl_WORK_STS_TYP_DN() { return m_l_WORK_STS_TYP_DN; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String getl_OPR_INST_CD() { return m_l_OPR_INST_CD; }
	public String getl_WORK_IN_PROC_CD() { return m_l_WORK_IN_PROC_CD; }
	public String getl_PROC_NAME() { return m_l_PROC_NAME; }
	public String getl_PROC_NO() { return m_l_PROC_NO; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_OUTSIDE_TYP() { return m_l_OUTSIDE_TYP; }
	public String getl_OPR_INST_DATE() { return m_l_OPR_INST_DATE; }
	public String getl_OPR_INST_SLIP_ISS_DATE() { return m_l_OPR_INST_SLIP_ISS_DATE; }
	public String getl_OPR_INST_START_DATE() { return m_l_OPR_INST_START_DATE; }
	public String getl_WORK_ODR_DLV_DATE() { return m_l_WORK_ODR_DLV_DATE; }
	public String getl_OPR_INST_QTY() { return m_l_OPR_INST_QTY; }
	public String getl_TOTAL_ACPT_QTY() { return m_l_TOTAL_ACPT_QTY; }
	public String getl_TOTAL_DEFECT_QTY() { return m_l_TOTAL_DEFECT_QTY; }
	public String getl_WORK_CMPLT_DATE() { return m_l_WORK_CMPLT_DATE; }
	public String getl_ACPT_INSPC_TYP() { return m_l_ACPT_INSPC_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getJOB_ODR_QTY() { return m_JOB_ODR_QTY; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_JOB_ODR_TYP_DN() { return l_JOB_ODR_TYP_DN; }
	public List getList_h_PARAMETER_OD_NO() { return l_h_PARAMETER_OD_NO; }
	public List getList_l_OUTSIDE_TYP_DN() { return l_l_OUTSIDE_TYP_DN; }
	public List getList_l_ACPT_INSPC_TYP_DN() { return l_l_ACPT_INSPC_TYP_DN; }
	public List getList_l_PROGRESS_STATUS_DN() { return l_l_PROGRESS_STATUS_DN; }
	public List getList_JOB_ODR_DLV_TIME() { return l_JOB_ODR_DLV_TIME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PARAMETER_OD_NO() { return l_PARAMETER_OD_NO; }
	public List getList_l_PROC_EXPLOSION_FLG() { return l_l_PROC_EXPLOSION_FLG; }
	public List getList_l_WORK_STS_TYP() { return l_l_WORK_STS_TYP; }
	public List getList_l_WORK_STS_TYP_DN() { return l_l_WORK_STS_TYP_DN; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_l_OPR_INST_CD() { return l_l_OPR_INST_CD; }
	public List getList_l_WORK_IN_PROC_CD() { return l_l_WORK_IN_PROC_CD; }
	public List getList_l_PROC_NAME() { return l_l_PROC_NAME; }
	public List getList_l_PROC_NO() { return l_l_PROC_NO; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_OUTSIDE_TYP() { return l_l_OUTSIDE_TYP; }
	public List getList_l_OPR_INST_DATE() { return l_l_OPR_INST_DATE; }
	public List getList_l_OPR_INST_SLIP_ISS_DATE() { return l_l_OPR_INST_SLIP_ISS_DATE; }
	public List getList_l_OPR_INST_START_DATE() { return l_l_OPR_INST_START_DATE; }
	public List getList_l_WORK_ODR_DLV_DATE() { return l_l_WORK_ODR_DLV_DATE; }
	public List getList_l_OPR_INST_QTY() { return l_l_OPR_INST_QTY; }
	public List getList_l_TOTAL_ACPT_QTY() { return l_l_TOTAL_ACPT_QTY; }
	public List getList_l_TOTAL_DEFECT_QTY() { return l_l_TOTAL_DEFECT_QTY; }
	public List getList_l_WORK_CMPLT_DATE() { return l_l_WORK_CMPLT_DATE; }
	public List getList_l_ACPT_INSPC_TYP() { return l_l_ACPT_INSPC_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_JOB_ODR_QTY() { return l_JOB_ODR_QTY; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setJOB_ODR_TYP_DN(String val) { m_JOB_ODR_TYP_DN = val; }
	public void seth_PARAMETER_OD_NO(String val) { m_h_PARAMETER_OD_NO = val; }
	public void setl_OUTSIDE_TYP_DN(String val) { m_l_OUTSIDE_TYP_DN = val; }
	public void setl_ACPT_INSPC_TYP_DN(String val) { m_l_ACPT_INSPC_TYP_DN = val; }
	public void setl_PROGRESS_STATUS_DN(String val) { m_l_PROGRESS_STATUS_DN = val; }
	public void setJOB_ODR_DLV_TIME(String val) { m_JOB_ODR_DLV_TIME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPARAMETER_OD_NO(String val) { m_PARAMETER_OD_NO = val; }
	public void setl_PROC_EXPLOSION_FLG(String val) { m_l_PROC_EXPLOSION_FLG = val; }
	public void setl_WORK_STS_TYP(String val) { m_l_WORK_STS_TYP = val; }
	public void setl_WORK_STS_TYP_DN(String val) { m_l_WORK_STS_TYP_DN = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void setl_OPR_INST_CD(String val) { m_l_OPR_INST_CD = val; }
	public void setl_WORK_IN_PROC_CD(String val) { m_l_WORK_IN_PROC_CD = val; }
	public void setl_PROC_NAME(String val) { m_l_PROC_NAME = val; }
	public void setl_PROC_NO(String val) { m_l_PROC_NO = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_OUTSIDE_TYP(String val) { m_l_OUTSIDE_TYP = val; }
	public void setl_OPR_INST_DATE(String val) { m_l_OPR_INST_DATE = val; }
	public void setl_OPR_INST_SLIP_ISS_DATE(String val) { m_l_OPR_INST_SLIP_ISS_DATE = val; }
	public void setl_OPR_INST_START_DATE(String val) { m_l_OPR_INST_START_DATE = val; }
	public void setl_WORK_ODR_DLV_DATE(String val) { m_l_WORK_ODR_DLV_DATE = val; }
	public void setl_OPR_INST_QTY(String val) { m_l_OPR_INST_QTY = val; }
	public void setl_TOTAL_ACPT_QTY(String val) { m_l_TOTAL_ACPT_QTY = val; }
	public void setl_TOTAL_DEFECT_QTY(String val) { m_l_TOTAL_DEFECT_QTY = val; }
	public void setl_WORK_CMPLT_DATE(String val) { m_l_WORK_CMPLT_DATE = val; }
	public void setl_ACPT_INSPC_TYP(String val) { m_l_ACPT_INSPC_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setJOB_ODR_QTY(String val) { m_JOB_ODR_QTY = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_JOB_ODR_TYP_DN(List list) { l_JOB_ODR_TYP_DN = list; }
	public void setList_h_PARAMETER_OD_NO(List list) { l_h_PARAMETER_OD_NO = list; }
	public void setList_l_OUTSIDE_TYP_DN(List list) { l_l_OUTSIDE_TYP_DN = list; }
	public void setList_l_ACPT_INSPC_TYP_DN(List list) { l_l_ACPT_INSPC_TYP_DN = list; }
	public void setList_l_PROGRESS_STATUS_DN(List list) { l_l_PROGRESS_STATUS_DN = list; }
	public void setList_JOB_ODR_DLV_TIME(List list) { l_JOB_ODR_DLV_TIME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PARAMETER_OD_NO(List list) { l_PARAMETER_OD_NO = list; }
	public void setList_l_PROC_EXPLOSION_FLG(List list) { l_l_PROC_EXPLOSION_FLG = list; }
	public void setList_l_WORK_STS_TYP(List list) { l_l_WORK_STS_TYP = list; }
	public void setList_l_WORK_STS_TYP_DN(List list) { l_l_WORK_STS_TYP_DN = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_l_OPR_INST_CD(List list) { l_l_OPR_INST_CD = list; }
	public void setList_l_WORK_IN_PROC_CD(List list) { l_l_WORK_IN_PROC_CD = list; }
	public void setList_l_PROC_NAME(List list) { l_l_PROC_NAME = list; }
	public void setList_l_PROC_NO(List list) { l_l_PROC_NO = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_OUTSIDE_TYP(List list) { l_l_OUTSIDE_TYP = list; }
	public void setList_l_OPR_INST_DATE(List list) { l_l_OPR_INST_DATE = list; }
	public void setList_l_OPR_INST_SLIP_ISS_DATE(List list) { l_l_OPR_INST_SLIP_ISS_DATE = list; }
	public void setList_l_OPR_INST_START_DATE(List list) { l_l_OPR_INST_START_DATE = list; }
	public void setList_l_WORK_ODR_DLV_DATE(List list) { l_l_WORK_ODR_DLV_DATE = list; }
	public void setList_l_OPR_INST_QTY(List list) { l_l_OPR_INST_QTY = list; }
	public void setList_l_TOTAL_ACPT_QTY(List list) { l_l_TOTAL_ACPT_QTY = list; }
	public void setList_l_TOTAL_DEFECT_QTY(List list) { l_l_TOTAL_DEFECT_QTY = list; }
	public void setList_l_WORK_CMPLT_DATE(List list) { l_l_WORK_CMPLT_DATE = list; }
	public void setList_l_ACPT_INSPC_TYP(List list) { l_l_ACPT_INSPC_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_JOB_ODR_QTY(List list) { l_JOB_ODR_QTY = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_JOB_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_DN == null) {
			l_JOB_ODR_TYP_DN = new ArrayList();
		} else {
			l_JOB_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_DN.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_h_PARAMETER_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARAMETER_OD_NO == null) {
			l_h_PARAMETER_OD_NO = new ArrayList();
		} else {
			l_h_PARAMETER_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARAMETER_OD_NO.add(((AJ0030010Struct) list.get(i)).geth_PARAMETER_OD_NO());
		}
		return size;
	}
	public int setL2L_l_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OUTSIDE_TYP_DN == null) {
			l_l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OUTSIDE_TYP_DN.add(((AJ0030010Struct) list.get(i)).getl_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_ACPT_INSPC_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_INSPC_TYP_DN == null) {
			l_l_ACPT_INSPC_TYP_DN = new ArrayList();
		} else {
			l_l_ACPT_INSPC_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_INSPC_TYP_DN.add(((AJ0030010Struct) list.get(i)).getl_ACPT_INSPC_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_PROGRESS_STATUS_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROGRESS_STATUS_DN == null) {
			l_l_PROGRESS_STATUS_DN = new ArrayList();
		} else {
			l_l_PROGRESS_STATUS_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROGRESS_STATUS_DN.add(((AJ0030010Struct) list.get(i)).getl_PROGRESS_STATUS_DN());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_TIME == null) {
			l_JOB_ODR_DLV_TIME = new ArrayList();
		} else {
			l_JOB_ODR_DLV_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_TIME.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_DLV_TIME());
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
			l_JOB_ODR_CD.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_JOB_ODR_CANCEL_NO.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_ITEM_CD.add(((AJ0030010Struct) list.get(i)).getITEM_CD());
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
			l_SPEC.add(((AJ0030010Struct) list.get(i)).getSPEC());
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
			l_DRAW_CD.add(((AJ0030010Struct) list.get(i)).getDRAW_CD());
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
			l_ITEM_NAME.add(((AJ0030010Struct) list.get(i)).getITEM_NAME());
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
			l_PLANT_CD.add(((AJ0030010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AJ0030010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_PARAMETER_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARAMETER_OD_NO == null) {
			l_PARAMETER_OD_NO = new ArrayList();
		} else {
			l_PARAMETER_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARAMETER_OD_NO.add(((AJ0030010Struct) list.get(i)).getPARAMETER_OD_NO());
		}
		return size;
	}
	public int setL2L_l_PROC_EXPLOSION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_EXPLOSION_FLG == null) {
			l_l_PROC_EXPLOSION_FLG = new ArrayList();
		} else {
			l_l_PROC_EXPLOSION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_EXPLOSION_FLG.add(((AJ0030010Struct) list.get(i)).getl_PROC_EXPLOSION_FLG());
		}
		return size;
	}
	public int setL2L_l_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_STS_TYP == null) {
			l_l_WORK_STS_TYP = new ArrayList();
		} else {
			l_l_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_STS_TYP.add(((AJ0030010Struct) list.get(i)).getl_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_WORK_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_STS_TYP_DN == null) {
			l_l_WORK_STS_TYP_DN = new ArrayList();
		} else {
			l_l_WORK_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_STS_TYP_DN.add(((AJ0030010Struct) list.get(i)).getl_WORK_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_CD == null) {
			l_l_WORK_ODR_CD = new ArrayList();
		} else {
			l_l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_CD.add(((AJ0030010Struct) list.get(i)).getl_WORK_ODR_CD());
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
			l_l_OPR_INST_CD.add(((AJ0030010Struct) list.get(i)).getl_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_l_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_IN_PROC_CD == null) {
			l_l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_IN_PROC_CD.add(((AJ0030010Struct) list.get(i)).getl_WORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_NAME == null) {
			l_l_PROC_NAME = new ArrayList();
		} else {
			l_l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_NAME.add(((AJ0030010Struct) list.get(i)).getl_PROC_NAME());
		}
		return size;
	}
	public int setL2L_l_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_NO == null) {
			l_l_PROC_NO = new ArrayList();
		} else {
			l_l_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_NO.add(((AJ0030010Struct) list.get(i)).getl_PROC_NO());
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
			l_l_WS_CD.add(((AJ0030010Struct) list.get(i)).getl_WS_CD());
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
			l_l_WS_NAME.add(((AJ0030010Struct) list.get(i)).getl_WS_NAME());
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
			l_l_VEND_CD.add(((AJ0030010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AJ0030010Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OUTSIDE_TYP == null) {
			l_l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OUTSIDE_TYP.add(((AJ0030010Struct) list.get(i)).getl_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_DATE == null) {
			l_l_OPR_INST_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_DATE.add(((AJ0030010Struct) list.get(i)).getl_OPR_INST_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_SLIP_ISS_DATE == null) {
			l_l_OPR_INST_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_SLIP_ISS_DATE.add(((AJ0030010Struct) list.get(i)).getl_OPR_INST_SLIP_ISS_DATE());
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
			l_l_OPR_INST_START_DATE.add(((AJ0030010Struct) list.get(i)).getl_OPR_INST_START_DATE());
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
			l_l_WORK_ODR_DLV_DATE.add(((AJ0030010Struct) list.get(i)).getl_WORK_ODR_DLV_DATE());
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
			l_l_OPR_INST_QTY.add(((AJ0030010Struct) list.get(i)).getl_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_l_TOTAL_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_ACPT_QTY == null) {
			l_l_TOTAL_ACPT_QTY = new ArrayList();
		} else {
			l_l_TOTAL_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_ACPT_QTY.add(((AJ0030010Struct) list.get(i)).getl_TOTAL_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_TOTAL_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_DEFECT_QTY == null) {
			l_l_TOTAL_DEFECT_QTY = new ArrayList();
		} else {
			l_l_TOTAL_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_DEFECT_QTY.add(((AJ0030010Struct) list.get(i)).getl_TOTAL_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_l_WORK_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_CMPLT_DATE == null) {
			l_l_WORK_CMPLT_DATE = new ArrayList();
		} else {
			l_l_WORK_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_CMPLT_DATE.add(((AJ0030010Struct) list.get(i)).getl_WORK_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_l_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_INSPC_TYP == null) {
			l_l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_INSPC_TYP.add(((AJ0030010Struct) list.get(i)).getl_ACPT_INSPC_TYP());
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
			l_BUSINESS_OPR_DATE.add(((AJ0030010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_JOB_ODR_TYP.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD == null) {
			l_ALC_GRP_CD = new ArrayList();
		} else {
			l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD.add(((AJ0030010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_QTY == null) {
			l_JOB_ODR_QTY = new ArrayList();
		} else {
			l_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_QTY.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_QTY());
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
			l_JOB_ODR_DLV_DATE.add(((AJ0030010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
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
			l_l_COUNT.add(((AJ0030010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AJ0030010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_JOB_ODR_TYP_DN = null;
		m_h_PARAMETER_OD_NO = null;
		m_l_OUTSIDE_TYP_DN = null;
		m_l_ACPT_INSPC_TYP_DN = null;
		m_l_PROGRESS_STATUS_DN = null;
		m_JOB_ODR_DLV_TIME = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_ITEM_CD = null;
		m_SPEC = null;
		m_DRAW_CD = null;
		m_ITEM_NAME = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_PARAMETER_OD_NO = null;
		m_l_PROC_EXPLOSION_FLG = null;
		m_l_WORK_STS_TYP = null;
		m_l_WORK_STS_TYP_DN = null;
		m_l_WORK_ODR_CD = null;
		m_l_OPR_INST_CD = null;
		m_l_WORK_IN_PROC_CD = null;
		m_l_PROC_NAME = null;
		m_l_PROC_NO = null;
		m_l_WS_CD = null;
		m_l_WS_NAME = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_OUTSIDE_TYP = null;
		m_l_OPR_INST_DATE = null;
		m_l_OPR_INST_SLIP_ISS_DATE = null;
		m_l_OPR_INST_START_DATE = null;
		m_l_WORK_ODR_DLV_DATE = null;
		m_l_OPR_INST_QTY = null;
		m_l_TOTAL_ACPT_QTY = null;
		m_l_TOTAL_DEFECT_QTY = null;
		m_l_WORK_CMPLT_DATE = null;
		m_l_ACPT_INSPC_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_JOB_ODR_TYP = null;
		m_ALC_GRP_CD = null;
		m_JOB_ODR_QTY = null;
		m_JOB_ODR_DLV_DATE = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_JOB_ODR_TYP_DN = null;
		l_h_PARAMETER_OD_NO = null;
		l_l_OUTSIDE_TYP_DN = null;
		l_l_ACPT_INSPC_TYP_DN = null;
		l_l_PROGRESS_STATUS_DN = null;
		l_JOB_ODR_DLV_TIME = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_ITEM_CD = null;
		l_SPEC = null;
		l_DRAW_CD = null;
		l_ITEM_NAME = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_PARAMETER_OD_NO = null;
		l_l_PROC_EXPLOSION_FLG = null;
		l_l_WORK_STS_TYP = null;
		l_l_WORK_STS_TYP_DN = null;
		l_l_WORK_ODR_CD = null;
		l_l_OPR_INST_CD = null;
		l_l_WORK_IN_PROC_CD = null;
		l_l_PROC_NAME = null;
		l_l_PROC_NO = null;
		l_l_WS_CD = null;
		l_l_WS_NAME = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_OUTSIDE_TYP = null;
		l_l_OPR_INST_DATE = null;
		l_l_OPR_INST_SLIP_ISS_DATE = null;
		l_l_OPR_INST_START_DATE = null;
		l_l_WORK_ODR_DLV_DATE = null;
		l_l_OPR_INST_QTY = null;
		l_l_TOTAL_ACPT_QTY = null;
		l_l_TOTAL_DEFECT_QTY = null;
		l_l_WORK_CMPLT_DATE = null;
		l_l_ACPT_INSPC_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_JOB_ODR_TYP = null;
		l_ALC_GRP_CD = null;
		l_JOB_ODR_QTY = null;
		l_JOB_ODR_DLV_DATE = null;
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
	 * medAJ0030010�N���X�̕W���R���X�g���N�^
	 */
	public AJ0030010Struct()
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
	public void setStruct(AJ0030010Struct struct)
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
	public void setStructM(AJ0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setJOB_ODR_TYP_DN(struct.getJOB_ODR_TYP_DN());
			this.seth_PARAMETER_OD_NO(struct.geth_PARAMETER_OD_NO());
			this.setl_OUTSIDE_TYP_DN(struct.getl_OUTSIDE_TYP_DN());
			this.setl_ACPT_INSPC_TYP_DN(struct.getl_ACPT_INSPC_TYP_DN());
			this.setl_PROGRESS_STATUS_DN(struct.getl_PROGRESS_STATUS_DN());
			this.setJOB_ODR_DLV_TIME(struct.getJOB_ODR_DLV_TIME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setSPEC(struct.getSPEC());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPARAMETER_OD_NO(struct.getPARAMETER_OD_NO());
			this.setl_PROC_EXPLOSION_FLG(struct.getl_PROC_EXPLOSION_FLG());
			this.setl_WORK_STS_TYP(struct.getl_WORK_STS_TYP());
			this.setl_WORK_STS_TYP_DN(struct.getl_WORK_STS_TYP_DN());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.setl_OPR_INST_CD(struct.getl_OPR_INST_CD());
			this.setl_WORK_IN_PROC_CD(struct.getl_WORK_IN_PROC_CD());
			this.setl_PROC_NAME(struct.getl_PROC_NAME());
			this.setl_PROC_NO(struct.getl_PROC_NO());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_OUTSIDE_TYP(struct.getl_OUTSIDE_TYP());
			this.setl_OPR_INST_DATE(struct.getl_OPR_INST_DATE());
			this.setl_OPR_INST_SLIP_ISS_DATE(struct.getl_OPR_INST_SLIP_ISS_DATE());
			this.setl_OPR_INST_START_DATE(struct.getl_OPR_INST_START_DATE());
			this.setl_WORK_ODR_DLV_DATE(struct.getl_WORK_ODR_DLV_DATE());
			this.setl_OPR_INST_QTY(struct.getl_OPR_INST_QTY());
			this.setl_TOTAL_ACPT_QTY(struct.getl_TOTAL_ACPT_QTY());
			this.setl_TOTAL_DEFECT_QTY(struct.getl_TOTAL_DEFECT_QTY());
			this.setl_WORK_CMPLT_DATE(struct.getl_WORK_CMPLT_DATE());
			this.setl_ACPT_INSPC_TYP(struct.getl_ACPT_INSPC_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setJOB_ODR_QTY(struct.getJOB_ODR_QTY());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AJ0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_JOB_ODR_TYP_DN(struct.getList_JOB_ODR_TYP_DN());
			this.setList_h_PARAMETER_OD_NO(struct.getList_h_PARAMETER_OD_NO());
			this.setList_l_OUTSIDE_TYP_DN(struct.getList_l_OUTSIDE_TYP_DN());
			this.setList_l_ACPT_INSPC_TYP_DN(struct.getList_l_ACPT_INSPC_TYP_DN());
			this.setList_l_PROGRESS_STATUS_DN(struct.getList_l_PROGRESS_STATUS_DN());
			this.setList_JOB_ODR_DLV_TIME(struct.getList_JOB_ODR_DLV_TIME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PARAMETER_OD_NO(struct.getList_PARAMETER_OD_NO());
			this.setList_l_PROC_EXPLOSION_FLG(struct.getList_l_PROC_EXPLOSION_FLG());
			this.setList_l_WORK_STS_TYP(struct.getList_l_WORK_STS_TYP());
			this.setList_l_WORK_STS_TYP_DN(struct.getList_l_WORK_STS_TYP_DN());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_l_OPR_INST_CD(struct.getList_l_OPR_INST_CD());
			this.setList_l_WORK_IN_PROC_CD(struct.getList_l_WORK_IN_PROC_CD());
			this.setList_l_PROC_NAME(struct.getList_l_PROC_NAME());
			this.setList_l_PROC_NO(struct.getList_l_PROC_NO());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_OUTSIDE_TYP(struct.getList_l_OUTSIDE_TYP());
			this.setList_l_OPR_INST_DATE(struct.getList_l_OPR_INST_DATE());
			this.setList_l_OPR_INST_SLIP_ISS_DATE(struct.getList_l_OPR_INST_SLIP_ISS_DATE());
			this.setList_l_OPR_INST_START_DATE(struct.getList_l_OPR_INST_START_DATE());
			this.setList_l_WORK_ODR_DLV_DATE(struct.getList_l_WORK_ODR_DLV_DATE());
			this.setList_l_OPR_INST_QTY(struct.getList_l_OPR_INST_QTY());
			this.setList_l_TOTAL_ACPT_QTY(struct.getList_l_TOTAL_ACPT_QTY());
			this.setList_l_TOTAL_DEFECT_QTY(struct.getList_l_TOTAL_DEFECT_QTY());
			this.setList_l_WORK_CMPLT_DATE(struct.getList_l_WORK_CMPLT_DATE());
			this.setList_l_ACPT_INSPC_TYP(struct.getList_l_ACPT_INSPC_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_JOB_ODR_QTY(struct.getList_JOB_ODR_QTY());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
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
	// �� 1 �ϐ������l�F i_JOB_ODR_TYP_DN


	final static String i_JOB_ODR_TYP_DN = null;

	// �� 2 �ϐ������l�F i_h_PARAMETER_OD_NO


	final static String i_h_PARAMETER_OD_NO = null;

	// �� 3 �ϐ������l�F i_l_OUTSIDE_TYP_DN


	final static String i_l_OUTSIDE_TYP_DN = null;

	// �� 4 �ϐ������l�F i_l_ACPT_INSPC_TYP_DN


	final static String i_l_ACPT_INSPC_TYP_DN = null;

	// �� 5 �ϐ������l�F i_l_PROGRESS_STATUS_DN


	final static String i_l_PROGRESS_STATUS_DN = null;

	// �� 6 �ϐ������l�F i_JOB_ODR_DLV_TIME


	final static String i_JOB_ODR_DLV_TIME = null;

	// �� 7 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 8 �ϐ������l�F i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// �� 9 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 10 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 12 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 13 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 14 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 16 �ϐ������l�F i_PARAMETER_OD_NO


	final static String i_PARAMETER_OD_NO = null;

	// �� 17 �ϐ������l�F i_l_PROC_EXPLOSION_FLG


	final static String i_l_PROC_EXPLOSION_FLG = null;

	// �� 18 �ϐ������l�F i_l_WORK_STS_TYP


	final static String i_l_WORK_STS_TYP = null;

	// �� 19 �ϐ������l�F i_l_WORK_STS_TYP_DN


	final static String i_l_WORK_STS_TYP_DN = null;

	// �� 20 �ϐ������l�F i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// �� 21 �ϐ������l�F i_l_OPR_INST_CD


	final static String i_l_OPR_INST_CD = null;

	// �� 22 �ϐ������l�F i_l_WORK_IN_PROC_CD


	final static String i_l_WORK_IN_PROC_CD = null;

	// �� 23 �ϐ������l�F i_l_PROC_NAME


	final static String i_l_PROC_NAME = null;

	// �� 24 �ϐ������l�F i_l_PROC_NO


	final static String i_l_PROC_NO = null;

	// �� 25 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 26 �ϐ������l�F i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// �� 27 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 28 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 29 �ϐ������l�F i_l_OUTSIDE_TYP


	final static String i_l_OUTSIDE_TYP = null;

	// �� 30 �ϐ������l�F i_l_OPR_INST_DATE


	final static String i_l_OPR_INST_DATE = null;

	// �� 31 �ϐ������l�F i_l_OPR_INST_SLIP_ISS_DATE


	final static String i_l_OPR_INST_SLIP_ISS_DATE = null;

	// �� 32 �ϐ������l�F i_l_OPR_INST_START_DATE


	final static String i_l_OPR_INST_START_DATE = null;

	// �� 33 �ϐ������l�F i_l_WORK_ODR_DLV_DATE


	final static String i_l_WORK_ODR_DLV_DATE = null;

	// �� 34 �ϐ������l�F i_l_OPR_INST_QTY


	final static String i_l_OPR_INST_QTY = null;

	// �� 35 �ϐ������l�F i_l_TOTAL_ACPT_QTY


	final static String i_l_TOTAL_ACPT_QTY = null;

	// �� 36 �ϐ������l�F i_l_TOTAL_DEFECT_QTY


	final static String i_l_TOTAL_DEFECT_QTY = null;

	// �� 37 �ϐ������l�F i_l_WORK_CMPLT_DATE


	final static String i_l_WORK_CMPLT_DATE = null;

	// �� 38 �ϐ������l�F i_l_ACPT_INSPC_TYP


	final static String i_l_ACPT_INSPC_TYP = null;

	// �� 39 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 40 �ϐ������l�F i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// �� 41 �ϐ������l�F i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// �� 42 �ϐ������l�F i_JOB_ODR_QTY


	final static String i_JOB_ODR_QTY = null;

	// �� 43 �ϐ������l�F i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 44 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 45 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 2 �ϐ������l�F i_JOB_ODR_DETAIL_NO
	final static String i_JOB_ODR_DETAIL_NO = null;
	// �� 3 �ϐ������l�F i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// �� 4 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 5 �ϐ������l�F i_SPEC
	final static String i_SPEC = null;
	// �� 6 �ϐ������l�F i_DRAW_CD
	final static String i_DRAW_CD = null;
	// �� 7 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 8 �ϐ������l�F i_PARAMETER_OD_NO
	final static String i_PARAMETER_OD_NO = null;
	// �� 9 �ϐ������l�F i_l_PROC_EXPLOSION_FLG
	final static String i_l_PROC_EXPLOSION_FLG = null;
	// �� 10 �ϐ������l�F i_l_WORK_STS_TYP
	final static String i_l_WORK_STS_TYP = null;
	// �� 11 �ϐ������l�F i_l_WORK_STS_TYP_DN
	final static String i_l_WORK_STS_TYP_DN = null;
	// �� 12 �ϐ������l�F i_l_WORK_ODR_CD
	final static String i_l_WORK_ODR_CD = null;
	// �� 13 �ϐ������l�F i_l_OPR_INST_CD
	final static String i_l_OPR_INST_CD = null;
	// �� 14 �ϐ������l�F i_l_WORK_IN_PROC_CD
	final static String i_l_WORK_IN_PROC_CD = null;
	// �� 15 �ϐ������l�F i_l_PROC_NAME
	final static String i_l_PROC_NAME = null;
	// �� 16 �ϐ������l�F i_l_PROC_NO
	final static String i_l_PROC_NO = null;
	// �� 17 �ϐ������l�F i_l_WS_CD
	final static String i_l_WS_CD = null;
	// �� 18 �ϐ������l�F i_l_WS_NAME
	final static String i_l_WS_NAME = null;
	// �� 19 �ϐ������l�F i_l_VEND_CD
	final static String i_l_VEND_CD = null;
	// �� 20 �ϐ������l�F i_l_VEND_ANAME
	final static String i_l_VEND_ANAME = null;
	// �� 21 �ϐ������l�F i_l_OUTSIDE_TYP
	final static String i_l_OUTSIDE_TYP = null;
	// �� 22 �ϐ������l�F i_l_OUTSIDE_TYP_DN
	final static String i_l_OUTSIDE_TYP_DN = null;
	// �� 23 �ϐ������l�F i_l_OPR_INST_DATE
	final static String i_l_OPR_INST_DATE = null;
	// �� 24 �ϐ������l�F i_l_OPR_INST_SLIP_ISS_DATE
	final static String i_l_OPR_INST_SLIP_ISS_DATE = null;
	// �� 25 �ϐ������l�F i_l_OPR_INST_START_DATE
	final static String i_l_OPR_INST_START_DATE = null;
	// �� 26 �ϐ������l�F i_l_WORK_ODR_DLV_DATE
	final static String i_l_WORK_ODR_DLV_DATE = null;
	// �� 27 �ϐ������l�F i_l_OPR_INST_QTY
	final static String i_l_OPR_INST_QTY = null;
	// �� 28 �ϐ������l�F i_l_TOTAL_ACPT_QTY
	final static String i_l_TOTAL_ACPT_QTY = null;
	// �� 29 �ϐ������l�F i_l_TOTAL_DEFECT_QTY
	final static String i_l_TOTAL_DEFECT_QTY = null;
	// �� 30 �ϐ������l�F i_l_WORK_CMPLT_DATE
	final static String i_l_WORK_CMPLT_DATE = null;
	// �� 31 �ϐ������l�F i_l_ACPT_INSPC_TYP
	final static String i_l_ACPT_INSPC_TYP = null;
	// �� 32 �ϐ������l�F i_l_ACPT_INSPC_TYP_DN
	final static String i_l_ACPT_INSPC_TYP_DN = null;
	// �� 33 �ϐ������l�F i_BUSINESS_OPR_DATE
	final static String i_BUSINESS_OPR_DATE = null;
	// �� 34 �ϐ������l�F i_PLANT_CD
	final static String i_PLANT_CD = null;
	// �� 35 �ϐ������l�F i_JOB_ODR_TYP
	final static String i_JOB_ODR_TYP = null;
	// �� 36 �ϐ������l�F i_JOB_ODR_TYP_DN
	final static String i_JOB_ODR_TYP_DN = null;
	// �� 37 �ϐ������l�F i_ALC_GRP_CD
	final static String i_ALC_GRP_CD = null;
	// �� 38 �ϐ������l�F i_JOB_ODR_QTY
	final static String i_JOB_ODR_QTY = null;
	// �� 39 �ϐ������l�F i_JOB_ODR_DLV_DATE
	final static String i_JOB_ODR_DLV_DATE = null;
	// �� 40 �ϐ������l�F i_h_PARAMETER_OD_NO
	final static String i_h_PARAMETER_OD_NO = null;
	// �� 41 �ϐ������l�F i_l_PROGRESS_STATUS_DN
	final static String i_l_PROGRESS_STATUS_DN = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_SPEC = i_SPEC;
		m_DRAW_CD = i_DRAW_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PARAMETER_OD_NO = i_PARAMETER_OD_NO;
		m_l_PROC_EXPLOSION_FLG = i_l_PROC_EXPLOSION_FLG;
		m_l_WORK_STS_TYP = i_l_WORK_STS_TYP;
		m_l_WORK_STS_TYP_DN = i_l_WORK_STS_TYP_DN;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_l_OPR_INST_CD = i_l_OPR_INST_CD;
		m_l_WORK_IN_PROC_CD = i_l_WORK_IN_PROC_CD;
		m_l_PROC_NAME = i_l_PROC_NAME;
		m_l_PROC_NO = i_l_PROC_NO;
		m_l_WS_CD = i_l_WS_CD;
		m_l_WS_NAME = i_l_WS_NAME;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_OUTSIDE_TYP = i_l_OUTSIDE_TYP;
		m_l_OUTSIDE_TYP_DN = i_l_OUTSIDE_TYP_DN;
		m_l_OPR_INST_DATE = i_l_OPR_INST_DATE;
		m_l_OPR_INST_SLIP_ISS_DATE = i_l_OPR_INST_SLIP_ISS_DATE;
		m_l_OPR_INST_START_DATE = i_l_OPR_INST_START_DATE;
		m_l_WORK_ODR_DLV_DATE = i_l_WORK_ODR_DLV_DATE;
		m_l_OPR_INST_QTY = i_l_OPR_INST_QTY;
		m_l_TOTAL_ACPT_QTY = i_l_TOTAL_ACPT_QTY;
		m_l_TOTAL_DEFECT_QTY = i_l_TOTAL_DEFECT_QTY;
		m_l_WORK_CMPLT_DATE = i_l_WORK_CMPLT_DATE;
		m_l_ACPT_INSPC_TYP = i_l_ACPT_INSPC_TYP;
		m_l_ACPT_INSPC_TYP_DN = i_l_ACPT_INSPC_TYP_DN;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_JOB_ODR_TYP_DN = i_JOB_ODR_TYP_DN;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_JOB_ODR_QTY = i_JOB_ODR_QTY;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_h_PARAMETER_OD_NO = i_h_PARAMETER_OD_NO;
		m_l_PROGRESS_STATUS_DN = i_l_PROGRESS_STATUS_DN;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
