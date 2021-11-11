/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0050/src/com/nec/jp/orteus/metamorBase/AL0050/AL0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0050;

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

public class AL0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_l_h_LOAD_PLAN_CD */
	public String m_l_h_LOAD_PLAN_CD = null;
	/** �� 2 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 3 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 4 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 5 �ϐ��F m_l_PRD_DUE_DATE */
	public String m_l_PRD_DUE_DATE = null;
	/** �� 6 �ϐ��F m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** �� 7 �ϐ��F m_l_h_MODIFY_COUNT */
	public String m_l_h_MODIFY_COUNT = null;
	/** �� 8 �ϐ��F m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** �� 9 �ϐ��F m_l_LOAD_PLAN_COMMENT */
	public String m_l_LOAD_PLAN_COMMENT = null;
	/** �� 10 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 11 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 12 �ϐ��F m_PRD_DUE_DATE_FROM */
	public String m_PRD_DUE_DATE_FROM = null;
	/** �� 13 �ϐ��F m_PRD_DUE_DATE_TO */
	public String m_PRD_DUE_DATE_TO = null;
	/** �� 14 �ϐ��F m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** �� 15 �ϐ��F m_SUB1_JOB_ODR_CD */
	public String m_SUB1_JOB_ODR_CD = null;
	/** �� 16 �ϐ��F m_SUB1_ITEM_CD */
	public String m_SUB1_ITEM_CD = null;
	/** �� 17 �ϐ��F m_SUB1_PRD_DUE_DATE */
	public String m_SUB1_PRD_DUE_DATE = null;
	/** �� 18 �ϐ��F m_SUB1_ODR_QTY */
	public String m_SUB1_ODR_QTY = null;
	/** �� 19 �ϐ��F m_SUB1_CUST_CD */
	public String m_SUB1_CUST_CD = null;
	/** �� 20 �ϐ��F m_SUB1_LOAD_PLAN_COMMENT */
	public String m_SUB1_LOAD_PLAN_COMMENT = null;
	/** �� 21 �ϐ��F m_SUB1_h_LOAD_PLAN_CD */
	public String m_SUB1_h_LOAD_PLAN_CD = null;
	/** �� 22 �ϐ��F m_SUB1_h_PLANT_CD */
	public String m_SUB1_h_PLANT_CD = null;
	/** �� 23 �ϐ��F m_SUB1_h_ENTRY_BY */
	public String m_SUB1_h_ENTRY_BY = null;
	/** �� 24 �ϐ��F m_SUB1_h_PRD_START_DATE */
	public String m_SUB1_h_PRD_START_DATE = null;
	/** �� 25 �ϐ��F m_SUB1_h_MODIFY_COUNT */
	public String m_SUB1_h_MODIFY_COUNT = null;
	/** �� 26 �ϐ��F m_d_ITEM_LT */
	public String m_d_ITEM_LT = null;
	/** �� 27 �ϐ��F m_d_ITEM_CD */
	public String m_d_ITEM_CD = null;
	/** �� 28 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 29 �ϐ��F m_pvc2LogMode */
	public String m_pvc2LogMode = null;
	/** �� 30 �ϐ��F m_pvc2OutputMode */
	public String m_pvc2OutputMode = null;
	/** �� 31 �ϐ��F m_pvc2OutputPath */
	public String m_pvc2OutputPath = null;
	/** �� 32 �ϐ��F m_pvc2OutputName */
	public String m_pvc2OutputName = null;
	/** �� 33 �ϐ��F m_pvc2UserId */
	public String m_pvc2UserId = null;
	/** �� 34 �ϐ��F m_pvc2BusinessName */
	public String m_pvc2BusinessName = null;
	/** �� 35 �ϐ��F m_pvc2PlantCd */
	public String m_pvc2PlantCd = null;
	/** �� 36 �ϐ��F m_pnumReturn */
	public Integer m_pnumReturn = null;
	/** �� 37 �ϐ��F m_PROGRAM_CD */
	public String m_PROGRAM_CD = null;
	/** �� 38 �ϐ��F m_FUNCTION_NAME */
	public String m_FUNCTION_NAME = null;
	/** �� 39 �ϐ��F m_BUSINESS_GROUP_CD */
	public String m_BUSINESS_GROUP_CD = null;
	/** �� 40 �ϐ��F m_BUSINESS_CD */
	public String m_BUSINESS_CD = null;
	/** �� 41 �ϐ��F m_FILE_PATH */
	public String m_FILE_PATH = null;
	/** �� 42 �ϐ��F m_FILE_NAME */
	public String m_FILE_NAME = null;
	/** �� 43 �ϐ��F m_LOG_MODE_TYP */
	public Double m_LOG_MODE_TYP = null;
	/** �� 44 �ϐ��F m_OUTPUT_MODE_TYP */
	public Double m_OUTPUT_MODE_TYP = null;
	/** �� 45 �ϐ��F m_SUB1_h_PRD_DUE_DATE */
	public String m_SUB1_h_PRD_DUE_DATE = null;
	/** �� 46 �ϐ��F m_SUB1_ITEM_NAME */
	public String m_SUB1_ITEM_NAME = null;
	/** �� 47 �ϐ��F m_MAIN_h_PLANT_CD */
	public String m_MAIN_h_PLANT_CD = null;
	/** �� 48 �ϐ��F m_MAIN_h_JOB_ODR_CD */
	public String m_MAIN_h_JOB_ODR_CD = null;
	/** �� 49 �ϐ��F m_MAIN_h_ITEM_CD */
	public String m_MAIN_h_ITEM_CD = null;
	/** �� 50 �ϐ��F m_MAIN_h_PRD_DUE_DATE_FROM */
	public String m_MAIN_h_PRD_DUE_DATE_FROM = null;
	/** �� 51 �ϐ��F m_MAIN_h_PRD_DUE_DATE_TO */
	public String m_MAIN_h_PRD_DUE_DATE_TO = null;
	/** �� 52 �ϐ��F m_SUB1_h_l_JOB_ODR_CD */
	public String m_SUB1_h_l_JOB_ODR_CD = null;
	/** �� 53 �ϐ��F m_SUB1_h_l_ITEM_CD */
	public String m_SUB1_h_l_ITEM_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_l_h_LOAD_PLAN_CD */
	public List l_l_h_LOAD_PLAN_CD = null;

	/** �� 2 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 3 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 4 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 5 List�ϐ��F l_l_PRD_DUE_DATE */
	public List l_l_PRD_DUE_DATE = null;

	/** �� 6 List�ϐ��F l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** �� 7 List�ϐ��F l_l_h_MODIFY_COUNT */
	public List l_l_h_MODIFY_COUNT = null;

	/** �� 8 List�ϐ��F l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** �� 9 List�ϐ��F l_l_LOAD_PLAN_COMMENT */
	public List l_l_LOAD_PLAN_COMMENT = null;

	/** �� 10 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 11 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_PRD_DUE_DATE_FROM */
	public List l_PRD_DUE_DATE_FROM = null;

	/** �� 13 List�ϐ��F l_PRD_DUE_DATE_TO */
	public List l_PRD_DUE_DATE_TO = null;

	/** �� 14 List�ϐ��F l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_SUB1_JOB_ODR_CD */
	public List l_SUB1_JOB_ODR_CD = null;

	/** �� 16 List�ϐ��F l_SUB1_ITEM_CD */
	public List l_SUB1_ITEM_CD = null;

	/** �� 17 List�ϐ��F l_SUB1_PRD_DUE_DATE */
	public List l_SUB1_PRD_DUE_DATE = null;

	/** �� 18 List�ϐ��F l_SUB1_ODR_QTY */
	public List l_SUB1_ODR_QTY = null;

	/** �� 19 List�ϐ��F l_SUB1_CUST_CD */
	public List l_SUB1_CUST_CD = null;

	/** �� 20 List�ϐ��F l_SUB1_LOAD_PLAN_COMMENT */
	public List l_SUB1_LOAD_PLAN_COMMENT = null;

	/** �� 21 List�ϐ��F l_SUB1_h_LOAD_PLAN_CD */
	public List l_SUB1_h_LOAD_PLAN_CD = null;

	/** �� 22 List�ϐ��F l_SUB1_h_PLANT_CD */
	public List l_SUB1_h_PLANT_CD = null;

	/** �� 23 List�ϐ��F l_SUB1_h_ENTRY_BY */
	public List l_SUB1_h_ENTRY_BY = null;

	/** �� 24 List�ϐ��F l_SUB1_h_PRD_START_DATE */
	public List l_SUB1_h_PRD_START_DATE = null;

	/** �� 25 List�ϐ��F l_SUB1_h_MODIFY_COUNT */
	public List l_SUB1_h_MODIFY_COUNT = null;

	/** �� 26 List�ϐ��F l_d_ITEM_LT */
	public List l_d_ITEM_LT = null;

	/** �� 27 List�ϐ��F l_d_ITEM_CD */
	public List l_d_ITEM_CD = null;

	/** �� 28 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 29 List�ϐ��F l_pvc2LogMode */
	public List l_pvc2LogMode = null;

	/** �� 30 List�ϐ��F l_pvc2OutputMode */
	public List l_pvc2OutputMode = null;

	/** �� 31 List�ϐ��F l_pvc2OutputPath */
	public List l_pvc2OutputPath = null;

	/** �� 32 List�ϐ��F l_pvc2OutputName */
	public List l_pvc2OutputName = null;

	/** �� 33 List�ϐ��F l_pvc2UserId */
	public List l_pvc2UserId = null;

	/** �� 34 List�ϐ��F l_pvc2BusinessName */
	public List l_pvc2BusinessName = null;

	/** �� 35 List�ϐ��F l_pvc2PlantCd */
	public List l_pvc2PlantCd = null;

	/** �� 36 List�ϐ��F l_pnumReturn */
	public List l_pnumReturn = null;

	/** �� 37 List�ϐ��F l_PROGRAM_CD */
	public List l_PROGRAM_CD = null;

	/** �� 38 List�ϐ��F l_FUNCTION_NAME */
	public List l_FUNCTION_NAME = null;

	/** �� 39 List�ϐ��F l_BUSINESS_GROUP_CD */
	public List l_BUSINESS_GROUP_CD = null;

	/** �� 40 List�ϐ��F l_BUSINESS_CD */
	public List l_BUSINESS_CD = null;

	/** �� 41 List�ϐ��F l_FILE_PATH */
	public List l_FILE_PATH = null;

	/** �� 42 List�ϐ��F l_FILE_NAME */
	public List l_FILE_NAME = null;

	/** �� 43 List�ϐ��F l_LOG_MODE_TYP */
	public List l_LOG_MODE_TYP = null;

	/** �� 44 List�ϐ��F l_OUTPUT_MODE_TYP */
	public List l_OUTPUT_MODE_TYP = null;

	/** �� 45 List�ϐ��F l_SUB1_h_PRD_DUE_DATE */
	public List l_SUB1_h_PRD_DUE_DATE = null;

	/** �� 46 List�ϐ��F l_SUB1_ITEM_NAME */
	public List l_SUB1_ITEM_NAME = null;

	/** �� 47 List�ϐ��F l_MAIN_h_PLANT_CD */
	public List l_MAIN_h_PLANT_CD = null;

	/** �� 48 List�ϐ��F l_MAIN_h_JOB_ODR_CD */
	public List l_MAIN_h_JOB_ODR_CD = null;

	/** �� 49 List�ϐ��F l_MAIN_h_ITEM_CD */
	public List l_MAIN_h_ITEM_CD = null;

	/** �� 50 List�ϐ��F l_MAIN_h_PRD_DUE_DATE_FROM */
	public List l_MAIN_h_PRD_DUE_DATE_FROM = null;

	/** �� 51 List�ϐ��F l_MAIN_h_PRD_DUE_DATE_TO */
	public List l_MAIN_h_PRD_DUE_DATE_TO = null;

	/** �� 52 List�ϐ��F l_SUB1_h_l_JOB_ODR_CD */
	public List l_SUB1_h_l_JOB_ODR_CD = null;

	/** �� 53 List�ϐ��F l_SUB1_h_l_ITEM_CD */
	public List l_SUB1_h_l_ITEM_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getl_h_LOAD_PLAN_CD() { return m_l_h_LOAD_PLAN_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PRD_DUE_DATE() { return m_l_PRD_DUE_DATE; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_h_MODIFY_COUNT() { return m_l_h_MODIFY_COUNT; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_LOAD_PLAN_COMMENT() { return m_l_LOAD_PLAN_COMMENT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPRD_DUE_DATE_FROM() { return m_PRD_DUE_DATE_FROM; }
	public String getPRD_DUE_DATE_TO() { return m_PRD_DUE_DATE_TO; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getSUB1_JOB_ODR_CD() { return m_SUB1_JOB_ODR_CD; }
	public String getSUB1_ITEM_CD() { return m_SUB1_ITEM_CD; }
	public String getSUB1_PRD_DUE_DATE() { return m_SUB1_PRD_DUE_DATE; }
	public String getSUB1_ODR_QTY() { return m_SUB1_ODR_QTY; }
	public String getSUB1_CUST_CD() { return m_SUB1_CUST_CD; }
	public String getSUB1_LOAD_PLAN_COMMENT() { return m_SUB1_LOAD_PLAN_COMMENT; }
	public String getSUB1_h_LOAD_PLAN_CD() { return m_SUB1_h_LOAD_PLAN_CD; }
	public String getSUB1_h_PLANT_CD() { return m_SUB1_h_PLANT_CD; }
	public String getSUB1_h_ENTRY_BY() { return m_SUB1_h_ENTRY_BY; }
	public String getSUB1_h_PRD_START_DATE() { return m_SUB1_h_PRD_START_DATE; }
	public String getSUB1_h_MODIFY_COUNT() { return m_SUB1_h_MODIFY_COUNT; }
	public String getd_ITEM_LT() { return m_d_ITEM_LT; }
	public String getd_ITEM_CD() { return m_d_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public Integer getpnumReturn() { return m_pnumReturn; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public Double getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public Double getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getSUB1_h_PRD_DUE_DATE() { return m_SUB1_h_PRD_DUE_DATE; }
	public String getSUB1_ITEM_NAME() { return m_SUB1_ITEM_NAME; }
	public String getMAIN_h_PLANT_CD() { return m_MAIN_h_PLANT_CD; }
	public String getMAIN_h_JOB_ODR_CD() { return m_MAIN_h_JOB_ODR_CD; }
	public String getMAIN_h_ITEM_CD() { return m_MAIN_h_ITEM_CD; }
	public String getMAIN_h_PRD_DUE_DATE_FROM() { return m_MAIN_h_PRD_DUE_DATE_FROM; }
	public String getMAIN_h_PRD_DUE_DATE_TO() { return m_MAIN_h_PRD_DUE_DATE_TO; }
	public String getSUB1_h_l_JOB_ODR_CD() { return m_SUB1_h_l_JOB_ODR_CD; }
	public String getSUB1_h_l_ITEM_CD() { return m_SUB1_h_l_ITEM_CD; }

	public List getList_l_h_LOAD_PLAN_CD() { return l_l_h_LOAD_PLAN_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PRD_DUE_DATE() { return l_l_PRD_DUE_DATE; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_h_MODIFY_COUNT() { return l_l_h_MODIFY_COUNT; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_LOAD_PLAN_COMMENT() { return l_l_LOAD_PLAN_COMMENT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PRD_DUE_DATE_FROM() { return l_PRD_DUE_DATE_FROM; }
	public List getList_PRD_DUE_DATE_TO() { return l_PRD_DUE_DATE_TO; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_SUB1_JOB_ODR_CD() { return l_SUB1_JOB_ODR_CD; }
	public List getList_SUB1_ITEM_CD() { return l_SUB1_ITEM_CD; }
	public List getList_SUB1_PRD_DUE_DATE() { return l_SUB1_PRD_DUE_DATE; }
	public List getList_SUB1_ODR_QTY() { return l_SUB1_ODR_QTY; }
	public List getList_SUB1_CUST_CD() { return l_SUB1_CUST_CD; }
	public List getList_SUB1_LOAD_PLAN_COMMENT() { return l_SUB1_LOAD_PLAN_COMMENT; }
	public List getList_SUB1_h_LOAD_PLAN_CD() { return l_SUB1_h_LOAD_PLAN_CD; }
	public List getList_SUB1_h_PLANT_CD() { return l_SUB1_h_PLANT_CD; }
	public List getList_SUB1_h_ENTRY_BY() { return l_SUB1_h_ENTRY_BY; }
	public List getList_SUB1_h_PRD_START_DATE() { return l_SUB1_h_PRD_START_DATE; }
	public List getList_SUB1_h_MODIFY_COUNT() { return l_SUB1_h_MODIFY_COUNT; }
	public List getList_d_ITEM_LT() { return l_d_ITEM_LT; }
	public List getList_d_ITEM_CD() { return l_d_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_pvc2LogMode() { return l_pvc2LogMode; }
	public List getList_pvc2OutputMode() { return l_pvc2OutputMode; }
	public List getList_pvc2OutputPath() { return l_pvc2OutputPath; }
	public List getList_pvc2OutputName() { return l_pvc2OutputName; }
	public List getList_pvc2UserId() { return l_pvc2UserId; }
	public List getList_pvc2BusinessName() { return l_pvc2BusinessName; }
	public List getList_pvc2PlantCd() { return l_pvc2PlantCd; }
	public List getList_pnumReturn() { return l_pnumReturn; }
	public List getList_PROGRAM_CD() { return l_PROGRAM_CD; }
	public List getList_FUNCTION_NAME() { return l_FUNCTION_NAME; }
	public List getList_BUSINESS_GROUP_CD() { return l_BUSINESS_GROUP_CD; }
	public List getList_BUSINESS_CD() { return l_BUSINESS_CD; }
	public List getList_FILE_PATH() { return l_FILE_PATH; }
	public List getList_FILE_NAME() { return l_FILE_NAME; }
	public List getList_LOG_MODE_TYP() { return l_LOG_MODE_TYP; }
	public List getList_OUTPUT_MODE_TYP() { return l_OUTPUT_MODE_TYP; }
	public List getList_SUB1_h_PRD_DUE_DATE() { return l_SUB1_h_PRD_DUE_DATE; }
	public List getList_SUB1_ITEM_NAME() { return l_SUB1_ITEM_NAME; }
	public List getList_MAIN_h_PLANT_CD() { return l_MAIN_h_PLANT_CD; }
	public List getList_MAIN_h_JOB_ODR_CD() { return l_MAIN_h_JOB_ODR_CD; }
	public List getList_MAIN_h_ITEM_CD() { return l_MAIN_h_ITEM_CD; }
	public List getList_MAIN_h_PRD_DUE_DATE_FROM() { return l_MAIN_h_PRD_DUE_DATE_FROM; }
	public List getList_MAIN_h_PRD_DUE_DATE_TO() { return l_MAIN_h_PRD_DUE_DATE_TO; }
	public List getList_SUB1_h_l_JOB_ODR_CD() { return l_SUB1_h_l_JOB_ODR_CD; }
	public List getList_SUB1_h_l_ITEM_CD() { return l_SUB1_h_l_ITEM_CD; }

	public void setl_h_LOAD_PLAN_CD(String val) { m_l_h_LOAD_PLAN_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PRD_DUE_DATE(String val) { m_l_PRD_DUE_DATE = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_h_MODIFY_COUNT(String val) { m_l_h_MODIFY_COUNT = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_LOAD_PLAN_COMMENT(String val) { m_l_LOAD_PLAN_COMMENT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPRD_DUE_DATE_FROM(String val) { m_PRD_DUE_DATE_FROM = val; }
	public void setPRD_DUE_DATE_TO(String val) { m_PRD_DUE_DATE_TO = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setSUB1_JOB_ODR_CD(String val) { m_SUB1_JOB_ODR_CD = val; }
	public void setSUB1_ITEM_CD(String val) { m_SUB1_ITEM_CD = val; }
	public void setSUB1_PRD_DUE_DATE(String val) { m_SUB1_PRD_DUE_DATE = val; }
	public void setSUB1_ODR_QTY(String val) { m_SUB1_ODR_QTY = val; }
	public void setSUB1_CUST_CD(String val) { m_SUB1_CUST_CD = val; }
	public void setSUB1_LOAD_PLAN_COMMENT(String val) { m_SUB1_LOAD_PLAN_COMMENT = val; }
	public void setSUB1_h_LOAD_PLAN_CD(String val) { m_SUB1_h_LOAD_PLAN_CD = val; }
	public void setSUB1_h_PLANT_CD(String val) { m_SUB1_h_PLANT_CD = val; }
	public void setSUB1_h_ENTRY_BY(String val) { m_SUB1_h_ENTRY_BY = val; }
	public void setSUB1_h_PRD_START_DATE(String val) { m_SUB1_h_PRD_START_DATE = val; }
	public void setSUB1_h_MODIFY_COUNT(String val) { m_SUB1_h_MODIFY_COUNT = val; }
	public void setd_ITEM_LT(String val) { m_d_ITEM_LT = val; }
	public void setd_ITEM_CD(String val) { m_d_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setpvc2LogMode(String val) { m_pvc2LogMode = val; }
	public void setpvc2OutputMode(String val) { m_pvc2OutputMode = val; }
	public void setpvc2OutputPath(String val) { m_pvc2OutputPath = val; }
	public void setpvc2OutputName(String val) { m_pvc2OutputName = val; }
	public void setpvc2UserId(String val) { m_pvc2UserId = val; }
	public void setpvc2BusinessName(String val) { m_pvc2BusinessName = val; }
	public void setpvc2PlantCd(String val) { m_pvc2PlantCd = val; }
	public void setpnumReturn(Integer val) { m_pnumReturn = val; }
	public void setPROGRAM_CD(String val) { m_PROGRAM_CD = val; }
	public void setFUNCTION_NAME(String val) { m_FUNCTION_NAME = val; }
	public void setBUSINESS_GROUP_CD(String val) { m_BUSINESS_GROUP_CD = val; }
	public void setBUSINESS_CD(String val) { m_BUSINESS_CD = val; }
	public void setFILE_PATH(String val) { m_FILE_PATH = val; }
	public void setFILE_NAME(String val) { m_FILE_NAME = val; }
	public void setLOG_MODE_TYP(Double val) { m_LOG_MODE_TYP = val; }
	public void setOUTPUT_MODE_TYP(Double val) { m_OUTPUT_MODE_TYP = val; }
	public void setSUB1_h_PRD_DUE_DATE(String val) { m_SUB1_h_PRD_DUE_DATE = val; }
	public void setSUB1_ITEM_NAME(String val) { m_SUB1_ITEM_NAME = val; }
	public void setMAIN_h_PLANT_CD(String val) { m_MAIN_h_PLANT_CD = val; }
	public void setMAIN_h_JOB_ODR_CD(String val) { m_MAIN_h_JOB_ODR_CD = val; }
	public void setMAIN_h_ITEM_CD(String val) { m_MAIN_h_ITEM_CD = val; }
	public void setMAIN_h_PRD_DUE_DATE_FROM(String val) { m_MAIN_h_PRD_DUE_DATE_FROM = val; }
	public void setMAIN_h_PRD_DUE_DATE_TO(String val) { m_MAIN_h_PRD_DUE_DATE_TO = val; }
	public void setSUB1_h_l_JOB_ODR_CD(String val) { m_SUB1_h_l_JOB_ODR_CD = val; }
	public void setSUB1_h_l_ITEM_CD(String val) { m_SUB1_h_l_ITEM_CD = val; }

	public void setpnumReturn(String val) { m_pnumReturn = getInteger(val); }

	public void setList_l_h_LOAD_PLAN_CD(List list) { l_l_h_LOAD_PLAN_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PRD_DUE_DATE(List list) { l_l_PRD_DUE_DATE = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_h_MODIFY_COUNT(List list) { l_l_h_MODIFY_COUNT = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_LOAD_PLAN_COMMENT(List list) { l_l_LOAD_PLAN_COMMENT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PRD_DUE_DATE_FROM(List list) { l_PRD_DUE_DATE_FROM = list; }
	public void setList_PRD_DUE_DATE_TO(List list) { l_PRD_DUE_DATE_TO = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_SUB1_JOB_ODR_CD(List list) { l_SUB1_JOB_ODR_CD = list; }
	public void setList_SUB1_ITEM_CD(List list) { l_SUB1_ITEM_CD = list; }
	public void setList_SUB1_PRD_DUE_DATE(List list) { l_SUB1_PRD_DUE_DATE = list; }
	public void setList_SUB1_ODR_QTY(List list) { l_SUB1_ODR_QTY = list; }
	public void setList_SUB1_CUST_CD(List list) { l_SUB1_CUST_CD = list; }
	public void setList_SUB1_LOAD_PLAN_COMMENT(List list) { l_SUB1_LOAD_PLAN_COMMENT = list; }
	public void setList_SUB1_h_LOAD_PLAN_CD(List list) { l_SUB1_h_LOAD_PLAN_CD = list; }
	public void setList_SUB1_h_PLANT_CD(List list) { l_SUB1_h_PLANT_CD = list; }
	public void setList_SUB1_h_ENTRY_BY(List list) { l_SUB1_h_ENTRY_BY = list; }
	public void setList_SUB1_h_PRD_START_DATE(List list) { l_SUB1_h_PRD_START_DATE = list; }
	public void setList_SUB1_h_MODIFY_COUNT(List list) { l_SUB1_h_MODIFY_COUNT = list; }
	public void setList_d_ITEM_LT(List list) { l_d_ITEM_LT = list; }
	public void setList_d_ITEM_CD(List list) { l_d_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_pvc2LogMode(List list) { l_pvc2LogMode = list; }
	public void setList_pvc2OutputMode(List list) { l_pvc2OutputMode = list; }
	public void setList_pvc2OutputPath(List list) { l_pvc2OutputPath = list; }
	public void setList_pvc2OutputName(List list) { l_pvc2OutputName = list; }
	public void setList_pvc2UserId(List list) { l_pvc2UserId = list; }
	public void setList_pvc2BusinessName(List list) { l_pvc2BusinessName = list; }
	public void setList_pvc2PlantCd(List list) { l_pvc2PlantCd = list; }
	public void setList_pnumReturn(List list) { l_pnumReturn = list; }
	public void setList_PROGRAM_CD(List list) { l_PROGRAM_CD = list; }
	public void setList_FUNCTION_NAME(List list) { l_FUNCTION_NAME = list; }
	public void setList_BUSINESS_GROUP_CD(List list) { l_BUSINESS_GROUP_CD = list; }
	public void setList_BUSINESS_CD(List list) { l_BUSINESS_CD = list; }
	public void setList_FILE_PATH(List list) { l_FILE_PATH = list; }
	public void setList_FILE_NAME(List list) { l_FILE_NAME = list; }
	public void setList_LOG_MODE_TYP(List list) { l_LOG_MODE_TYP = list; }
	public void setList_OUTPUT_MODE_TYP(List list) { l_OUTPUT_MODE_TYP = list; }
	public void setList_SUB1_h_PRD_DUE_DATE(List list) { l_SUB1_h_PRD_DUE_DATE = list; }
	public void setList_SUB1_ITEM_NAME(List list) { l_SUB1_ITEM_NAME = list; }
	public void setList_MAIN_h_PLANT_CD(List list) { l_MAIN_h_PLANT_CD = list; }
	public void setList_MAIN_h_JOB_ODR_CD(List list) { l_MAIN_h_JOB_ODR_CD = list; }
	public void setList_MAIN_h_ITEM_CD(List list) { l_MAIN_h_ITEM_CD = list; }
	public void setList_MAIN_h_PRD_DUE_DATE_FROM(List list) { l_MAIN_h_PRD_DUE_DATE_FROM = list; }
	public void setList_MAIN_h_PRD_DUE_DATE_TO(List list) { l_MAIN_h_PRD_DUE_DATE_TO = list; }
	public void setList_SUB1_h_l_JOB_ODR_CD(List list) { l_SUB1_h_l_JOB_ODR_CD = list; }
	public void setList_SUB1_h_l_ITEM_CD(List list) { l_SUB1_h_l_ITEM_CD = list; }

	public int setL2L_l_h_LOAD_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_LOAD_PLAN_CD == null) {
			l_l_h_LOAD_PLAN_CD = new ArrayList();
		} else {
			l_l_h_LOAD_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_LOAD_PLAN_CD.add(((AL0050010Struct) list.get(i)).getl_h_LOAD_PLAN_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CD == null) {
			l_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CD.add(((AL0050010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_ITEM_CD.add(((AL0050010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AL0050010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE == null) {
			l_l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE.add(((AL0050010Struct) list.get(i)).getl_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_QTY == null) {
			l_l_ODR_QTY = new ArrayList();
		} else {
			l_l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_QTY.add(((AL0050010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_MODIFY_COUNT == null) {
			l_l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_MODIFY_COUNT.add(((AL0050010Struct) list.get(i)).getl_h_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CD == null) {
			l_l_CUST_CD = new ArrayList();
		} else {
			l_l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CD.add(((AL0050010Struct) list.get(i)).getl_CUST_CD());
		}
		return size;
	}
	public int setL2L_l_LOAD_PLAN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOAD_PLAN_COMMENT == null) {
			l_l_LOAD_PLAN_COMMENT = new ArrayList();
		} else {
			l_l_LOAD_PLAN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOAD_PLAN_COMMENT.add(((AL0050010Struct) list.get(i)).getl_LOAD_PLAN_COMMENT());
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
			l_JOB_ODR_CD.add(((AL0050010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AL0050010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_FROM == null) {
			l_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_FROM.add(((AL0050010Struct) list.get(i)).getPRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_TO == null) {
			l_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_TO.add(((AL0050010Struct) list.get(i)).getPRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((AL0050010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_SUB1_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_JOB_ODR_CD == null) {
			l_SUB1_JOB_ODR_CD = new ArrayList();
		} else {
			l_SUB1_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_JOB_ODR_CD.add(((AL0050010Struct) list.get(i)).getSUB1_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SUB1_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_ITEM_CD == null) {
			l_SUB1_ITEM_CD = new ArrayList();
		} else {
			l_SUB1_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_ITEM_CD.add(((AL0050010Struct) list.get(i)).getSUB1_ITEM_CD());
		}
		return size;
	}
	public int setL2L_SUB1_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_PRD_DUE_DATE == null) {
			l_SUB1_PRD_DUE_DATE = new ArrayList();
		} else {
			l_SUB1_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_PRD_DUE_DATE.add(((AL0050010Struct) list.get(i)).getSUB1_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_SUB1_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_ODR_QTY == null) {
			l_SUB1_ODR_QTY = new ArrayList();
		} else {
			l_SUB1_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_ODR_QTY.add(((AL0050010Struct) list.get(i)).getSUB1_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUB1_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_CUST_CD == null) {
			l_SUB1_CUST_CD = new ArrayList();
		} else {
			l_SUB1_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_CUST_CD.add(((AL0050010Struct) list.get(i)).getSUB1_CUST_CD());
		}
		return size;
	}
	public int setL2L_SUB1_LOAD_PLAN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_LOAD_PLAN_COMMENT == null) {
			l_SUB1_LOAD_PLAN_COMMENT = new ArrayList();
		} else {
			l_SUB1_LOAD_PLAN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_LOAD_PLAN_COMMENT.add(((AL0050010Struct) list.get(i)).getSUB1_LOAD_PLAN_COMMENT());
		}
		return size;
	}
	public int setL2L_SUB1_h_LOAD_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_LOAD_PLAN_CD == null) {
			l_SUB1_h_LOAD_PLAN_CD = new ArrayList();
		} else {
			l_SUB1_h_LOAD_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_LOAD_PLAN_CD.add(((AL0050010Struct) list.get(i)).getSUB1_h_LOAD_PLAN_CD());
		}
		return size;
	}
	public int setL2L_SUB1_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_PLANT_CD == null) {
			l_SUB1_h_PLANT_CD = new ArrayList();
		} else {
			l_SUB1_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_PLANT_CD.add(((AL0050010Struct) list.get(i)).getSUB1_h_PLANT_CD());
		}
		return size;
	}
	public int setL2L_SUB1_h_ENTRY_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_ENTRY_BY == null) {
			l_SUB1_h_ENTRY_BY = new ArrayList();
		} else {
			l_SUB1_h_ENTRY_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_ENTRY_BY.add(((AL0050010Struct) list.get(i)).getSUB1_h_ENTRY_BY());
		}
		return size;
	}
	public int setL2L_SUB1_h_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_PRD_START_DATE == null) {
			l_SUB1_h_PRD_START_DATE = new ArrayList();
		} else {
			l_SUB1_h_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_PRD_START_DATE.add(((AL0050010Struct) list.get(i)).getSUB1_h_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_SUB1_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_MODIFY_COUNT == null) {
			l_SUB1_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_SUB1_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_MODIFY_COUNT.add(((AL0050010Struct) list.get(i)).getSUB1_h_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_d_ITEM_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ITEM_LT == null) {
			l_d_ITEM_LT = new ArrayList();
		} else {
			l_d_ITEM_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ITEM_LT.add(((AL0050010Struct) list.get(i)).getd_ITEM_LT());
		}
		return size;
	}
	public int setL2L_d_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ITEM_CD == null) {
			l_d_ITEM_CD = new ArrayList();
		} else {
			l_d_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ITEM_CD.add(((AL0050010Struct) list.get(i)).getd_ITEM_CD());
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
			l_ITEM_NAME.add(((AL0050010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_pvc2LogMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2LogMode == null) {
			l_pvc2LogMode = new ArrayList();
		} else {
			l_pvc2LogMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2LogMode.add(((AL0050010Struct) list.get(i)).getpvc2LogMode());
		}
		return size;
	}
	public int setL2L_pvc2OutputMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputMode == null) {
			l_pvc2OutputMode = new ArrayList();
		} else {
			l_pvc2OutputMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputMode.add(((AL0050010Struct) list.get(i)).getpvc2OutputMode());
		}
		return size;
	}
	public int setL2L_pvc2OutputPath(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputPath == null) {
			l_pvc2OutputPath = new ArrayList();
		} else {
			l_pvc2OutputPath.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputPath.add(((AL0050010Struct) list.get(i)).getpvc2OutputPath());
		}
		return size;
	}
	public int setL2L_pvc2OutputName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputName == null) {
			l_pvc2OutputName = new ArrayList();
		} else {
			l_pvc2OutputName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputName.add(((AL0050010Struct) list.get(i)).getpvc2OutputName());
		}
		return size;
	}
	public int setL2L_pvc2UserId(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2UserId == null) {
			l_pvc2UserId = new ArrayList();
		} else {
			l_pvc2UserId.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2UserId.add(((AL0050010Struct) list.get(i)).getpvc2UserId());
		}
		return size;
	}
	public int setL2L_pvc2BusinessName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2BusinessName == null) {
			l_pvc2BusinessName = new ArrayList();
		} else {
			l_pvc2BusinessName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2BusinessName.add(((AL0050010Struct) list.get(i)).getpvc2BusinessName());
		}
		return size;
	}
	public int setL2L_pvc2PlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2PlantCd == null) {
			l_pvc2PlantCd = new ArrayList();
		} else {
			l_pvc2PlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2PlantCd.add(((AL0050010Struct) list.get(i)).getpvc2PlantCd());
		}
		return size;
	}
	public int setL2L_pnumReturn(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pnumReturn == null) {
			l_pnumReturn = new ArrayList();
		} else {
			l_pnumReturn.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pnumReturn.add(((AL0050010Struct) list.get(i)).getpnumReturn());
		}
		return size;
	}
	public int setL2L_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_CD == null) {
			l_PROGRAM_CD = new ArrayList();
		} else {
			l_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_CD.add(((AL0050010Struct) list.get(i)).getPROGRAM_CD());
		}
		return size;
	}
	public int setL2L_FUNCTION_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FUNCTION_NAME == null) {
			l_FUNCTION_NAME = new ArrayList();
		} else {
			l_FUNCTION_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FUNCTION_NAME.add(((AL0050010Struct) list.get(i)).getFUNCTION_NAME());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_CD == null) {
			l_BUSINESS_GROUP_CD = new ArrayList();
		} else {
			l_BUSINESS_GROUP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_CD.add(((AL0050010Struct) list.get(i)).getBUSINESS_GROUP_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_CD == null) {
			l_BUSINESS_CD = new ArrayList();
		} else {
			l_BUSINESS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_CD.add(((AL0050010Struct) list.get(i)).getBUSINESS_CD());
		}
		return size;
	}
	public int setL2L_FILE_PATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FILE_PATH == null) {
			l_FILE_PATH = new ArrayList();
		} else {
			l_FILE_PATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FILE_PATH.add(((AL0050010Struct) list.get(i)).getFILE_PATH());
		}
		return size;
	}
	public int setL2L_FILE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FILE_NAME == null) {
			l_FILE_NAME = new ArrayList();
		} else {
			l_FILE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FILE_NAME.add(((AL0050010Struct) list.get(i)).getFILE_NAME());
		}
		return size;
	}
	public int setL2L_LOG_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOG_MODE_TYP == null) {
			l_LOG_MODE_TYP = new ArrayList();
		} else {
			l_LOG_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOG_MODE_TYP.add(((AL0050010Struct) list.get(i)).getLOG_MODE_TYP());
		}
		return size;
	}
	public int setL2L_OUTPUT_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_MODE_TYP == null) {
			l_OUTPUT_MODE_TYP = new ArrayList();
		} else {
			l_OUTPUT_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_MODE_TYP.add(((AL0050010Struct) list.get(i)).getOUTPUT_MODE_TYP());
		}
		return size;
	}
	public int setL2L_SUB1_h_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_PRD_DUE_DATE == null) {
			l_SUB1_h_PRD_DUE_DATE = new ArrayList();
		} else {
			l_SUB1_h_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_PRD_DUE_DATE.add(((AL0050010Struct) list.get(i)).getSUB1_h_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_SUB1_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_ITEM_NAME == null) {
			l_SUB1_ITEM_NAME = new ArrayList();
		} else {
			l_SUB1_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_ITEM_NAME.add(((AL0050010Struct) list.get(i)).getSUB1_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_MAIN_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAIN_h_PLANT_CD == null) {
			l_MAIN_h_PLANT_CD = new ArrayList();
		} else {
			l_MAIN_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAIN_h_PLANT_CD.add(((AL0050010Struct) list.get(i)).getMAIN_h_PLANT_CD());
		}
		return size;
	}
	public int setL2L_MAIN_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAIN_h_JOB_ODR_CD == null) {
			l_MAIN_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_MAIN_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAIN_h_JOB_ODR_CD.add(((AL0050010Struct) list.get(i)).getMAIN_h_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_MAIN_h_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAIN_h_ITEM_CD == null) {
			l_MAIN_h_ITEM_CD = new ArrayList();
		} else {
			l_MAIN_h_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAIN_h_ITEM_CD.add(((AL0050010Struct) list.get(i)).getMAIN_h_ITEM_CD());
		}
		return size;
	}
	public int setL2L_MAIN_h_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAIN_h_PRD_DUE_DATE_FROM == null) {
			l_MAIN_h_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_MAIN_h_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAIN_h_PRD_DUE_DATE_FROM.add(((AL0050010Struct) list.get(i)).getMAIN_h_PRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_MAIN_h_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAIN_h_PRD_DUE_DATE_TO == null) {
			l_MAIN_h_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_MAIN_h_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAIN_h_PRD_DUE_DATE_TO.add(((AL0050010Struct) list.get(i)).getMAIN_h_PRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_SUB1_h_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_l_JOB_ODR_CD == null) {
			l_SUB1_h_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_SUB1_h_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_l_JOB_ODR_CD.add(((AL0050010Struct) list.get(i)).getSUB1_h_l_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SUB1_h_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB1_h_l_ITEM_CD == null) {
			l_SUB1_h_l_ITEM_CD = new ArrayList();
		} else {
			l_SUB1_h_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB1_h_l_ITEM_CD.add(((AL0050010Struct) list.get(i)).getSUB1_h_l_ITEM_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_h_LOAD_PLAN_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PRD_DUE_DATE = null;
		m_l_ODR_QTY = null;
		m_l_h_MODIFY_COUNT = null;
		m_l_CUST_CD = null;
		m_l_LOAD_PLAN_COMMENT = null;
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_PRD_DUE_DATE_FROM = null;
		m_PRD_DUE_DATE_TO = null;
		m_h_PLANT_CD = null;
		m_SUB1_JOB_ODR_CD = null;
		m_SUB1_ITEM_CD = null;
		m_SUB1_PRD_DUE_DATE = null;
		m_SUB1_ODR_QTY = null;
		m_SUB1_CUST_CD = null;
		m_SUB1_LOAD_PLAN_COMMENT = null;
		m_SUB1_h_LOAD_PLAN_CD = null;
		m_SUB1_h_PLANT_CD = null;
		m_SUB1_h_ENTRY_BY = null;
		m_SUB1_h_PRD_START_DATE = null;
		m_SUB1_h_MODIFY_COUNT = null;
		m_d_ITEM_LT = null;
		m_d_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pnumReturn = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_SUB1_h_PRD_DUE_DATE = null;
		m_SUB1_ITEM_NAME = null;
		m_MAIN_h_PLANT_CD = null;
		m_MAIN_h_JOB_ODR_CD = null;
		m_MAIN_h_ITEM_CD = null;
		m_MAIN_h_PRD_DUE_DATE_FROM = null;
		m_MAIN_h_PRD_DUE_DATE_TO = null;
		m_SUB1_h_l_JOB_ODR_CD = null;
		m_SUB1_h_l_ITEM_CD = null;

		l_l_h_LOAD_PLAN_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PRD_DUE_DATE = null;
		l_l_ODR_QTY = null;
		l_l_h_MODIFY_COUNT = null;
		l_l_CUST_CD = null;
		l_l_LOAD_PLAN_COMMENT = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_PRD_DUE_DATE_FROM = null;
		l_PRD_DUE_DATE_TO = null;
		l_h_PLANT_CD = null;
		l_SUB1_JOB_ODR_CD = null;
		l_SUB1_ITEM_CD = null;
		l_SUB1_PRD_DUE_DATE = null;
		l_SUB1_ODR_QTY = null;
		l_SUB1_CUST_CD = null;
		l_SUB1_LOAD_PLAN_COMMENT = null;
		l_SUB1_h_LOAD_PLAN_CD = null;
		l_SUB1_h_PLANT_CD = null;
		l_SUB1_h_ENTRY_BY = null;
		l_SUB1_h_PRD_START_DATE = null;
		l_SUB1_h_MODIFY_COUNT = null;
		l_d_ITEM_LT = null;
		l_d_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_pvc2LogMode = null;
		l_pvc2OutputMode = null;
		l_pvc2OutputPath = null;
		l_pvc2OutputName = null;
		l_pvc2UserId = null;
		l_pvc2BusinessName = null;
		l_pvc2PlantCd = null;
		l_pnumReturn = null;
		l_PROGRAM_CD = null;
		l_FUNCTION_NAME = null;
		l_BUSINESS_GROUP_CD = null;
		l_BUSINESS_CD = null;
		l_FILE_PATH = null;
		l_FILE_NAME = null;
		l_LOG_MODE_TYP = null;
		l_OUTPUT_MODE_TYP = null;
		l_SUB1_h_PRD_DUE_DATE = null;
		l_SUB1_ITEM_NAME = null;
		l_MAIN_h_PLANT_CD = null;
		l_MAIN_h_JOB_ODR_CD = null;
		l_MAIN_h_ITEM_CD = null;
		l_MAIN_h_PRD_DUE_DATE_FROM = null;
		l_MAIN_h_PRD_DUE_DATE_TO = null;
		l_SUB1_h_l_JOB_ODR_CD = null;
		l_SUB1_h_l_ITEM_CD = null;

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
	 * medAL0050010�N���X�̕W���R���X�g���N�^
	 */
	public AL0050010Struct()
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
	public void setStruct(AL0050010Struct struct)
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
	public void setStructM(AL0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_h_LOAD_PLAN_CD(struct.getl_h_LOAD_PLAN_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PRD_DUE_DATE(struct.getl_PRD_DUE_DATE());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_h_MODIFY_COUNT(struct.getl_h_MODIFY_COUNT());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_LOAD_PLAN_COMMENT(struct.getl_LOAD_PLAN_COMMENT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			this.setPRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setSUB1_JOB_ODR_CD(struct.getSUB1_JOB_ODR_CD());
			this.setSUB1_ITEM_CD(struct.getSUB1_ITEM_CD());
			this.setSUB1_PRD_DUE_DATE(struct.getSUB1_PRD_DUE_DATE());
			this.setSUB1_ODR_QTY(struct.getSUB1_ODR_QTY());
			this.setSUB1_CUST_CD(struct.getSUB1_CUST_CD());
			this.setSUB1_LOAD_PLAN_COMMENT(struct.getSUB1_LOAD_PLAN_COMMENT());
			this.setSUB1_h_LOAD_PLAN_CD(struct.getSUB1_h_LOAD_PLAN_CD());
			this.setSUB1_h_PLANT_CD(struct.getSUB1_h_PLANT_CD());
			this.setSUB1_h_ENTRY_BY(struct.getSUB1_h_ENTRY_BY());
			this.setSUB1_h_PRD_START_DATE(struct.getSUB1_h_PRD_START_DATE());
			this.setSUB1_h_MODIFY_COUNT(struct.getSUB1_h_MODIFY_COUNT());
			this.setd_ITEM_LT(struct.getd_ITEM_LT());
			this.setd_ITEM_CD(struct.getd_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setpvc2LogMode(struct.getpvc2LogMode());
			this.setpvc2OutputMode(struct.getpvc2OutputMode());
			this.setpvc2OutputPath(struct.getpvc2OutputPath());
			this.setpvc2OutputName(struct.getpvc2OutputName());
			this.setpvc2UserId(struct.getpvc2UserId());
			this.setpvc2BusinessName(struct.getpvc2BusinessName());
			this.setpvc2PlantCd(struct.getpvc2PlantCd());
			this.setpnumReturn(struct.getpnumReturn());
			this.setPROGRAM_CD(struct.getPROGRAM_CD());
			this.setFUNCTION_NAME(struct.getFUNCTION_NAME());
			this.setBUSINESS_GROUP_CD(struct.getBUSINESS_GROUP_CD());
			this.setBUSINESS_CD(struct.getBUSINESS_CD());
			this.setFILE_PATH(struct.getFILE_PATH());
			this.setFILE_NAME(struct.getFILE_NAME());
			this.setLOG_MODE_TYP(struct.getLOG_MODE_TYP());
			this.setOUTPUT_MODE_TYP(struct.getOUTPUT_MODE_TYP());
			this.setSUB1_h_PRD_DUE_DATE(struct.getSUB1_h_PRD_DUE_DATE());
			this.setSUB1_ITEM_NAME(struct.getSUB1_ITEM_NAME());
			this.setMAIN_h_PLANT_CD(struct.getMAIN_h_PLANT_CD());
			this.setMAIN_h_JOB_ODR_CD(struct.getMAIN_h_JOB_ODR_CD());
			this.setMAIN_h_ITEM_CD(struct.getMAIN_h_ITEM_CD());
			this.setMAIN_h_PRD_DUE_DATE_FROM(struct.getMAIN_h_PRD_DUE_DATE_FROM());
			this.setMAIN_h_PRD_DUE_DATE_TO(struct.getMAIN_h_PRD_DUE_DATE_TO());
			this.setSUB1_h_l_JOB_ODR_CD(struct.getSUB1_h_l_JOB_ODR_CD());
			this.setSUB1_h_l_ITEM_CD(struct.getSUB1_h_l_ITEM_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AL0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_h_LOAD_PLAN_CD(struct.getList_l_h_LOAD_PLAN_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PRD_DUE_DATE(struct.getList_l_PRD_DUE_DATE());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_h_MODIFY_COUNT(struct.getList_l_h_MODIFY_COUNT());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_LOAD_PLAN_COMMENT(struct.getList_l_LOAD_PLAN_COMMENT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PRD_DUE_DATE_FROM(struct.getList_PRD_DUE_DATE_FROM());
			this.setList_PRD_DUE_DATE_TO(struct.getList_PRD_DUE_DATE_TO());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_SUB1_JOB_ODR_CD(struct.getList_SUB1_JOB_ODR_CD());
			this.setList_SUB1_ITEM_CD(struct.getList_SUB1_ITEM_CD());
			this.setList_SUB1_PRD_DUE_DATE(struct.getList_SUB1_PRD_DUE_DATE());
			this.setList_SUB1_ODR_QTY(struct.getList_SUB1_ODR_QTY());
			this.setList_SUB1_CUST_CD(struct.getList_SUB1_CUST_CD());
			this.setList_SUB1_LOAD_PLAN_COMMENT(struct.getList_SUB1_LOAD_PLAN_COMMENT());
			this.setList_SUB1_h_LOAD_PLAN_CD(struct.getList_SUB1_h_LOAD_PLAN_CD());
			this.setList_SUB1_h_PLANT_CD(struct.getList_SUB1_h_PLANT_CD());
			this.setList_SUB1_h_ENTRY_BY(struct.getList_SUB1_h_ENTRY_BY());
			this.setList_SUB1_h_PRD_START_DATE(struct.getList_SUB1_h_PRD_START_DATE());
			this.setList_SUB1_h_MODIFY_COUNT(struct.getList_SUB1_h_MODIFY_COUNT());
			this.setList_d_ITEM_LT(struct.getList_d_ITEM_LT());
			this.setList_d_ITEM_CD(struct.getList_d_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_pvc2LogMode(struct.getList_pvc2LogMode());
			this.setList_pvc2OutputMode(struct.getList_pvc2OutputMode());
			this.setList_pvc2OutputPath(struct.getList_pvc2OutputPath());
			this.setList_pvc2OutputName(struct.getList_pvc2OutputName());
			this.setList_pvc2UserId(struct.getList_pvc2UserId());
			this.setList_pvc2BusinessName(struct.getList_pvc2BusinessName());
			this.setList_pvc2PlantCd(struct.getList_pvc2PlantCd());
			this.setList_pnumReturn(struct.getList_pnumReturn());
			this.setList_PROGRAM_CD(struct.getList_PROGRAM_CD());
			this.setList_FUNCTION_NAME(struct.getList_FUNCTION_NAME());
			this.setList_BUSINESS_GROUP_CD(struct.getList_BUSINESS_GROUP_CD());
			this.setList_BUSINESS_CD(struct.getList_BUSINESS_CD());
			this.setList_FILE_PATH(struct.getList_FILE_PATH());
			this.setList_FILE_NAME(struct.getList_FILE_NAME());
			this.setList_LOG_MODE_TYP(struct.getList_LOG_MODE_TYP());
			this.setList_OUTPUT_MODE_TYP(struct.getList_OUTPUT_MODE_TYP());
			this.setList_SUB1_h_PRD_DUE_DATE(struct.getList_SUB1_h_PRD_DUE_DATE());
			this.setList_SUB1_ITEM_NAME(struct.getList_SUB1_ITEM_NAME());
			this.setList_MAIN_h_PLANT_CD(struct.getList_MAIN_h_PLANT_CD());
			this.setList_MAIN_h_JOB_ODR_CD(struct.getList_MAIN_h_JOB_ODR_CD());
			this.setList_MAIN_h_ITEM_CD(struct.getList_MAIN_h_ITEM_CD());
			this.setList_MAIN_h_PRD_DUE_DATE_FROM(struct.getList_MAIN_h_PRD_DUE_DATE_FROM());
			this.setList_MAIN_h_PRD_DUE_DATE_TO(struct.getList_MAIN_h_PRD_DUE_DATE_TO());
			this.setList_SUB1_h_l_JOB_ODR_CD(struct.getList_SUB1_h_l_JOB_ODR_CD());
			this.setList_SUB1_h_l_ITEM_CD(struct.getList_SUB1_h_l_ITEM_CD());
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
	// �� 1 �ϐ������l�F i_l_h_LOAD_PLAN_CD


	final static String i_l_h_LOAD_PLAN_CD = null;

	// �� 2 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 3 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 4 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 5 �ϐ������l�F i_l_PRD_DUE_DATE


	final static String i_l_PRD_DUE_DATE = null;

	// �� 6 �ϐ������l�F i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// �� 7 �ϐ������l�F i_l_h_MODIFY_COUNT


	final static String i_l_h_MODIFY_COUNT = null;

	// �� 8 �ϐ������l�F i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// �� 9 �ϐ������l�F i_l_LOAD_PLAN_COMMENT


	final static String i_l_LOAD_PLAN_COMMENT = null;

	// �� 10 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 11 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_PRD_DUE_DATE_FROM


	final static String i_PRD_DUE_DATE_FROM = null;

	// �� 13 �ϐ������l�F i_PRD_DUE_DATE_TO


	final static String i_PRD_DUE_DATE_TO = null;

	// �� 14 �ϐ������l�F i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_SUB1_JOB_ODR_CD


	final static String i_SUB1_JOB_ODR_CD = null;

	// �� 16 �ϐ������l�F i_SUB1_ITEM_CD


	final static String i_SUB1_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_SUB1_PRD_DUE_DATE


	final static String i_SUB1_PRD_DUE_DATE = null;

	// �� 18 �ϐ������l�F i_SUB1_ODR_QTY


	final static String i_SUB1_ODR_QTY = null;

	// �� 19 �ϐ������l�F i_SUB1_CUST_CD


	final static String i_SUB1_CUST_CD = null;

	// �� 20 �ϐ������l�F i_SUB1_LOAD_PLAN_COMMENT


	final static String i_SUB1_LOAD_PLAN_COMMENT = null;

	// �� 21 �ϐ������l�F i_SUB1_h_LOAD_PLAN_CD


	final static String i_SUB1_h_LOAD_PLAN_CD = null;

	// �� 22 �ϐ������l�F i_SUB1_h_PLANT_CD


	final static String i_SUB1_h_PLANT_CD = null;

	// �� 23 �ϐ������l�F i_SUB1_h_ENTRY_BY


	final static String i_SUB1_h_ENTRY_BY = null;

	// �� 24 �ϐ������l�F i_SUB1_h_PRD_START_DATE


	final static String i_SUB1_h_PRD_START_DATE = null;

	// �� 25 �ϐ������l�F i_SUB1_h_MODIFY_COUNT


	final static String i_SUB1_h_MODIFY_COUNT = null;

	// �� 26 �ϐ������l�F i_d_ITEM_LT


	final static String i_d_ITEM_LT = null;

	// �� 27 �ϐ������l�F i_d_ITEM_CD


	final static String i_d_ITEM_CD = null;

	// �� 28 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 29 �ϐ������l�F i_pvc2LogMode


	final static String i_pvc2LogMode = null;

	// �� 30 �ϐ������l�F i_pvc2OutputMode


	final static String i_pvc2OutputMode = null;

	// �� 31 �ϐ������l�F i_pvc2OutputPath


	final static String i_pvc2OutputPath = null;

	// �� 32 �ϐ������l�F i_pvc2OutputName


	final static String i_pvc2OutputName = null;

	// �� 33 �ϐ������l�F i_pvc2UserId


	final static String i_pvc2UserId = null;

	// �� 34 �ϐ������l�F i_pvc2BusinessName


	final static String i_pvc2BusinessName = null;

	// �� 35 �ϐ������l�F i_pvc2PlantCd


	final static String i_pvc2PlantCd = null;

	// �� 36 �ϐ������l�F i_pnumReturn


	final static Integer i_pnumReturn = null;

	// �� 37 �ϐ������l�F i_PROGRAM_CD


	final static String i_PROGRAM_CD = null;

	// �� 38 �ϐ������l�F i_FUNCTION_NAME


	final static String i_FUNCTION_NAME = null;

	// �� 39 �ϐ������l�F i_BUSINESS_GROUP_CD


	final static String i_BUSINESS_GROUP_CD = null;

	// �� 40 �ϐ������l�F i_BUSINESS_CD


	final static String i_BUSINESS_CD = null;

	// �� 41 �ϐ������l�F i_FILE_PATH


	final static String i_FILE_PATH = null;

	// �� 42 �ϐ������l�F i_FILE_NAME


	final static String i_FILE_NAME = null;

	// �� 43 �ϐ������l�F i_LOG_MODE_TYP


	final static Double i_LOG_MODE_TYP = null;

	// �� 44 �ϐ������l�F i_OUTPUT_MODE_TYP


	final static Double i_OUTPUT_MODE_TYP = null;

	// �� 45 �ϐ������l�F i_SUB1_h_PRD_DUE_DATE


	final static String i_SUB1_h_PRD_DUE_DATE = null;

	// �� 46 �ϐ������l�F i_SUB1_ITEM_NAME


	final static String i_SUB1_ITEM_NAME = null;

	// �� 47 �ϐ������l�F i_MAIN_h_PLANT_CD


	final static String i_MAIN_h_PLANT_CD = null;

	// �� 48 �ϐ������l�F i_MAIN_h_JOB_ODR_CD


	final static String i_MAIN_h_JOB_ODR_CD = null;

	// �� 49 �ϐ������l�F i_MAIN_h_ITEM_CD


	final static String i_MAIN_h_ITEM_CD = null;

	// �� 50 �ϐ������l�F i_MAIN_h_PRD_DUE_DATE_FROM


	final static String i_MAIN_h_PRD_DUE_DATE_FROM = null;

	// �� 51 �ϐ������l�F i_MAIN_h_PRD_DUE_DATE_TO


	final static String i_MAIN_h_PRD_DUE_DATE_TO = null;

	// �� 52 �ϐ������l�F i_SUB1_h_l_JOB_ODR_CD


	final static String i_SUB1_h_l_JOB_ODR_CD = null;

	// �� 53 �ϐ������l�F i_SUB1_h_l_ITEM_CD


	final static String i_SUB1_h_l_ITEM_CD = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_h_LOAD_PLAN_CD
        final static String i_l_h_LOAD_PLAN_CD = null;
        // �� 2 �ϐ������l�F i_l_JOB_ODR_CD
        final static String i_l_JOB_ODR_CD = null;
        // �� 3 �ϐ������l�F i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // �� 4 �ϐ������l�F i_l_PRD_DUE_DATE
        final static String i_l_PRD_DUE_DATE = null;
        // �� 5 �ϐ������l�F i_l_ODR_QTY
        final static String i_l_ODR_QTY = null;
        // �� 6 �ϐ������l�F i_l_h_MODIFY_COUNT
        final static String i_l_h_MODIFY_COUNT = null;
        // �� 7 �ϐ������l�F i_l_CUST_CD
        final static String i_l_CUST_CD = null;
        // �� 8 �ϐ������l�F i_l_LOAD_PLAN_COMMENT
        final static String i_l_LOAD_PLAN_COMMENT = null;
        // �� 9 �ϐ������l�F i_JOB_ODR_CD
        final static String i_JOB_ODR_CD = null;
        // �� 10 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 11 �ϐ������l�F i_PRD_DUE_DATE_FROM
        final static String i_PRD_DUE_DATE_FROM = null;
        // �� 12 �ϐ������l�F i_PRD_DUE_DATE_TO
        final static String i_PRD_DUE_DATE_TO = null;
        // �� 13 �ϐ������l�F i_h_PLANT_CD
        final static String i_h_PLANT_CD = null;
        // �� 14 �ϐ������l�F i_SUB1_JOB_ODR_CD
        final static String i_SUB1_JOB_ODR_CD = null;
        // �� 15 �ϐ������l�F i_SUB1_ITEM_CD
        final static String i_SUB1_ITEM_CD = null;
        // �� 16 �ϐ������l�F i_SUB1_PRD_DUE_DATE
        final static String i_SUB1_PRD_DUE_DATE = null;
        // �� 17 �ϐ������l�F i_SUB1_ODR_QTY
        final static String i_SUB1_ODR_QTY = null;
        // �� 18 �ϐ������l�F i_SUB1_CUST_CD
        final static String i_SUB1_CUST_CD = null;
        // �� 19 �ϐ������l�F i_SUB1_LOAD_PLAN_COMMENT
        final static String i_SUB1_LOAD_PLAN_COMMENT = null;
        // �� 20 �ϐ������l�F i_SUB1_h_LOAD_PLAN_CD
        final static String i_SUB1_h_LOAD_PLAN_CD = null;
        // �� 21 �ϐ������l�F i_SUB1_h_PLANT_CD
        final static String i_SUB1_h_PLANT_CD = null;
        // �� 22 �ϐ������l�F i_SUB1_h_ENTRY_BY
        final static String i_SUB1_h_ENTRY_BY = null;
        // �� 23 �ϐ������l�F i_SUB1_h_PRD_START_DATE
        final static String i_SUB1_h_PRD_START_DATE = null;
        // �� 24 �ϐ������l�F i_SUB1_h_MODIFY_COUNT
        final static String i_SUB1_h_MODIFY_COUNT = null;
        // �� 25 �ϐ������l�F i_d_ITEM_LT
        final static String i_d_ITEM_LT = null;
        // �� 26 �ϐ������l�F i_d_ITEM_CD
        final static String i_d_ITEM_CD = null;
        // �� 27 �ϐ������l�F i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // �� 28 �ϐ������l�F i_pvc2LogMode
        final static String i_pvc2LogMode = null;
        // �� 29 �ϐ������l�F i_pvc2OutputMode
        final static String i_pvc2OutputMode = null;
        // �� 30 �ϐ������l�F i_pvc2OutputPath
        final static String i_pvc2OutputPath = null;
        // �� 31 �ϐ������l�F i_pvc2OutputName
        final static String i_pvc2OutputName = null;
        // �� 32 �ϐ������l�F i_pvc2UserId
        final static String i_pvc2UserId = null;
        // �� 33 �ϐ������l�F i_pvc2BusinessName
        final static String i_pvc2BusinessName = null;
        // �� 34 �ϐ������l�F i_pvc2PlantCd
        final static String i_pvc2PlantCd = null;
        // �� 35 �ϐ������l�F i_pnumReturn
        final static Integer i_pnumReturn = null;
        // �� 36 �ϐ������l�F i_PROGRAM_CD
        final static String i_PROGRAM_CD = null;
        // �� 37 �ϐ������l�F i_FUNCTION_NAME
        final static String i_FUNCTION_NAME = null;
        // �� 38 �ϐ������l�F i_BUSINESS_GROUP_CD
        final static String i_BUSINESS_GROUP_CD = null;
        // �� 39 �ϐ������l�F i_BUSINESS_CD
        final static String i_BUSINESS_CD = null;
        // �� 40 �ϐ������l�F i_FILE_PATH
        final static String i_FILE_PATH = null;
        // �� 41 �ϐ������l�F i_FILE_NAME
        final static String i_FILE_NAME = null;
        // �� 42 �ϐ������l�F i_LOG_MODE_TYP
        final static Double i_LOG_MODE_TYP = null;
        // �� 43 �ϐ������l�F i_OUTPUT_MODE_TYP
        final static Double i_OUTPUT_MODE_TYP = null;
        // �� 44 �ϐ������l�F i_SUB1_h_PRD_DUE_DATE
        final static String i_SUB1_h_PRD_DUE_DATE = null;
        // �� 45 �ϐ������l�F i_MAIN_h_PLANT_CD
        final static String i_MAIN_h_PLANT_CD = null;
        // �� 46 �ϐ������l�F i_MAIN_h_JOB_ODR_CD
        final static String i_MAIN_h_JOB_ODR_CD = null;
        // �� 47 �ϐ������l�F i_MAIN_h_ITEM_CD
        final static String i_MAIN_h_ITEM_CD = null;
        // �� 48 �ϐ������l�F i_MAIN_h_PRD_DUE_DATE_FROM
        final static String i_MAIN_h_PRD_DUE_DATE_FROM = null;
        // �� 49 �ϐ������l�F i_MAIN_h_PRD_DUE_DATE_TO
        final static String i_MAIN_h_PRD_DUE_DATE_TO = null;
        // �� 50 �ϐ������l�F i_SUB1_h_l_JOB_ODR_CD
        final static String i_SUB1_h_l_JOB_ODR_CD = null;
        // �� 51 �ϐ������l�F i_SUB1_h_l_ITEM_CD
        final static String i_SUB1_h_l_ITEM_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_l_h_LOAD_PLAN_CD = i_l_h_LOAD_PLAN_CD;
         m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
         m_l_ITEM_CD = i_l_ITEM_CD;
         m_l_PRD_DUE_DATE = i_l_PRD_DUE_DATE;
         m_l_ODR_QTY = i_l_ODR_QTY;
         m_l_h_MODIFY_COUNT = i_l_h_MODIFY_COUNT;
         m_l_CUST_CD = i_l_CUST_CD;
         m_l_LOAD_PLAN_COMMENT = i_l_LOAD_PLAN_COMMENT;
         m_JOB_ODR_CD = i_JOB_ODR_CD;
         m_ITEM_CD = i_ITEM_CD;
         m_PRD_DUE_DATE_FROM = i_PRD_DUE_DATE_FROM;
         m_PRD_DUE_DATE_TO = i_PRD_DUE_DATE_TO;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_SUB1_JOB_ODR_CD = i_SUB1_JOB_ODR_CD;
         m_SUB1_ITEM_CD = i_SUB1_ITEM_CD;
         m_SUB1_PRD_DUE_DATE = i_SUB1_PRD_DUE_DATE;
         m_SUB1_ODR_QTY = i_SUB1_ODR_QTY;
         m_SUB1_CUST_CD = i_SUB1_CUST_CD;
         m_SUB1_LOAD_PLAN_COMMENT = i_SUB1_LOAD_PLAN_COMMENT;
         m_SUB1_h_LOAD_PLAN_CD = i_SUB1_h_LOAD_PLAN_CD;
         m_SUB1_h_PLANT_CD = i_SUB1_h_PLANT_CD;
         m_SUB1_h_ENTRY_BY = i_SUB1_h_ENTRY_BY;
         m_SUB1_h_PRD_START_DATE = i_SUB1_h_PRD_START_DATE;
         m_SUB1_h_MODIFY_COUNT = i_SUB1_h_MODIFY_COUNT;
         m_d_ITEM_LT = i_d_ITEM_LT;
         m_d_ITEM_CD = i_d_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_pvc2LogMode = i_pvc2LogMode;
         m_pvc2OutputMode = i_pvc2OutputMode;
         m_pvc2OutputPath = i_pvc2OutputPath;
         m_pvc2OutputName = i_pvc2OutputName;
         m_pvc2UserId = i_pvc2UserId;
         m_pvc2BusinessName = i_pvc2BusinessName;
         m_pvc2PlantCd = i_pvc2PlantCd;
         m_pnumReturn = i_pnumReturn;
         m_PROGRAM_CD = i_PROGRAM_CD;
         m_FUNCTION_NAME = i_FUNCTION_NAME;
         m_BUSINESS_GROUP_CD = i_BUSINESS_GROUP_CD;
         m_BUSINESS_CD = i_BUSINESS_CD;
         m_FILE_PATH = i_FILE_PATH;
         m_FILE_NAME = i_FILE_NAME;
         m_LOG_MODE_TYP = i_LOG_MODE_TYP;
         m_OUTPUT_MODE_TYP = i_OUTPUT_MODE_TYP;
         m_SUB1_h_PRD_DUE_DATE = i_SUB1_h_PRD_DUE_DATE;
         m_MAIN_h_PLANT_CD = i_MAIN_h_PLANT_CD;
         m_MAIN_h_JOB_ODR_CD = i_MAIN_h_JOB_ODR_CD;
         m_MAIN_h_ITEM_CD = i_MAIN_h_ITEM_CD;
         m_MAIN_h_PRD_DUE_DATE_FROM = i_MAIN_h_PRD_DUE_DATE_FROM;
         m_MAIN_h_PRD_DUE_DATE_TO = i_MAIN_h_PRD_DUE_DATE_TO;
         m_SUB1_h_l_JOB_ODR_CD = i_SUB1_h_l_JOB_ODR_CD;
         m_SUB1_h_l_ITEM_CD = i_SUB1_h_l_ITEM_CD;
       
         l_l_h_LOAD_PLAN_CD = null;
         l_l_JOB_ODR_CD = null;
         l_l_ITEM_CD = null;
         l_l_PRD_DUE_DATE = null;
         l_l_ODR_QTY = null;
         l_l_h_MODIFY_COUNT = null;
         l_l_CUST_CD = null;
         l_l_LOAD_PLAN_COMMENT = null;
         l_JOB_ODR_CD = null;
         l_ITEM_CD = null;
         l_PRD_DUE_DATE_FROM = null;
         l_PRD_DUE_DATE_TO = null;
         l_h_PLANT_CD = null;
         l_SUB1_JOB_ODR_CD = null;
         l_SUB1_ITEM_CD = null;
         l_SUB1_PRD_DUE_DATE = null;
         l_SUB1_ODR_QTY = null;
         l_SUB1_CUST_CD = null;
         l_SUB1_LOAD_PLAN_COMMENT = null;
         l_SUB1_h_LOAD_PLAN_CD = null;
         l_SUB1_h_PLANT_CD = null;
         l_SUB1_h_ENTRY_BY = null;
         l_SUB1_h_PRD_START_DATE = null;
         l_SUB1_h_MODIFY_COUNT = null;
         l_d_ITEM_LT = null;
         l_d_ITEM_CD = null;
         l_ITEM_NAME = null;
         l_pvc2LogMode = null;
         l_pvc2OutputMode = null;
         l_pvc2OutputPath = null;
         l_pvc2OutputName = null;
         l_pvc2UserId = null;
         l_pvc2BusinessName = null;
         l_pvc2PlantCd = null;
         l_pnumReturn = null;
         l_PROGRAM_CD = null;
         l_FUNCTION_NAME = null;
         l_BUSINESS_GROUP_CD = null;
         l_BUSINESS_CD = null;
         l_FILE_PATH = null;
         l_FILE_NAME = null;
         l_LOG_MODE_TYP = null;
         l_OUTPUT_MODE_TYP = null;
         l_SUB1_h_PRD_DUE_DATE = null;
         l_MAIN_h_PLANT_CD = null;
         l_MAIN_h_JOB_ODR_CD = null;
         l_MAIN_h_ITEM_CD = null;
         l_MAIN_h_PRD_DUE_DATE_FROM = null;
         l_MAIN_h_PRD_DUE_DATE_TO = null;
         l_SUB1_h_l_JOB_ODR_CD = null;
         l_SUB1_h_l_ITEM_CD = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
