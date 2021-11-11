/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0100/src/com/nec/jp/orteus/metamorBase/AD0100/AD0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0100;

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
 * CLASS     : AD0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2013/12/02 09:25:19 $
 *
 */
//}}user_implement_code_header

public class AD0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 2 �ϐ��F m_PRD_START_DATE_FROM */
	public String m_PRD_START_DATE_FROM = null;
	/** �� 3 �ϐ��F m_PRD_START_DATE_FROM_TIME */
	public String m_PRD_START_DATE_FROM_TIME = null;
	/** �� 4 �ϐ��F m_PRD_START_DATE_TO */
	public String m_PRD_START_DATE_TO = null;
	/** �� 5 �ϐ��F m_PRD_START_DATE_TO_TIME */
	public String m_PRD_START_DATE_TO_TIME = null;
	/** �� 6 �ϐ��F m_PRD_DUE_DATE_FROM */
	public String m_PRD_DUE_DATE_FROM = null;
	/** �� 7 �ϐ��F m_PRD_DUE_DATE_FROM_TIME */
	public String m_PRD_DUE_DATE_FROM_TIME = null;
	/** �� 8 �ϐ��F m_PRD_DUE_DATE_TO */
	public String m_PRD_DUE_DATE_TO = null;
	/** �� 9 �ϐ��F m_PRD_DUE_DATE_TO_TIME */
	public String m_PRD_DUE_DATE_TO_TIME = null;
	/** �� 10 �ϐ��F m_OUTPUT_RSLT_CD */
	public String m_OUTPUT_RSLT_CD = null;
	/** �� 11 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 12 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 13 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 14 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 15 �ϐ��F m_LOGIN_USER */
	public String m_LOGIN_USER = null;
	/** �� 16 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 17 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 18 �ϐ��F m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** �� 19 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 20 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 21 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 22 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 23 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 24 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 25 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 26 �ϐ��F m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** �� 27 �ϐ��F m_l_OPR_INST_START_DATE */
	public String m_l_OPR_INST_START_DATE = null;
	/** �� 28 �ϐ��F m_l_PRD_DUE_DATE */
	public String m_l_PRD_DUE_DATE = null;
	/** �� 29 �ϐ��F m_l_OPR_INST_QTY */
	public String m_l_OPR_INST_QTY = null;
	/** �� 30 �ϐ��F m_l_RCV_QTY_1 */
	public String m_l_RCV_QTY_1 = null;
	/** �� 31 �ϐ��F m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** �� 32 �ϐ��F m_h_l_ODR_NO */
	public String m_h_l_ODR_NO = null;
	/** �� 33 �ϐ��F m_h_l_MODIFY_COUNT */
	public String m_h_l_MODIFY_COUNT = null;
	/** �� 34 �ϐ��F m_h_l_OPR_INST_CD */
	public String m_h_l_OPR_INST_CD = null;
	/** �� 35 �ϐ��F m_L_PRD_START_DATE_TO */
	public String m_L_PRD_START_DATE_TO = null;
	/** �� 36 �ϐ��F m_L_PRD_START_DATE_FROM */
	public String m_L_PRD_START_DATE_FROM = null;
	/** �� 37 �ϐ��F m_L_PRD_DUE_DATE_TO */
	public String m_L_PRD_DUE_DATE_TO = null;
	/** �� 38 �ϐ��F m_L_PRD_DUE_DATE_FROM */
	public String m_L_PRD_DUE_DATE_FROM = null;
	/** �� 39 �ϐ��F m_MAX_LINE */
	public String m_MAX_LINE = null;
	/** �� 40 �ϐ��F m_PROC_EXEC_DATE */
	public String m_PROC_EXEC_DATE = null;
	/** �� 41 �ϐ��F m_COUNT */
	public String m_COUNT = null;
	/** �� 42 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 2 List�ϐ��F l_PRD_START_DATE_FROM */
	public List l_PRD_START_DATE_FROM = null;

	/** �� 3 List�ϐ��F l_PRD_START_DATE_FROM_TIME */
	public List l_PRD_START_DATE_FROM_TIME = null;

	/** �� 4 List�ϐ��F l_PRD_START_DATE_TO */
	public List l_PRD_START_DATE_TO = null;

	/** �� 5 List�ϐ��F l_PRD_START_DATE_TO_TIME */
	public List l_PRD_START_DATE_TO_TIME = null;

	/** �� 6 List�ϐ��F l_PRD_DUE_DATE_FROM */
	public List l_PRD_DUE_DATE_FROM = null;

	/** �� 7 List�ϐ��F l_PRD_DUE_DATE_FROM_TIME */
	public List l_PRD_DUE_DATE_FROM_TIME = null;

	/** �� 8 List�ϐ��F l_PRD_DUE_DATE_TO */
	public List l_PRD_DUE_DATE_TO = null;

	/** �� 9 List�ϐ��F l_PRD_DUE_DATE_TO_TIME */
	public List l_PRD_DUE_DATE_TO_TIME = null;

	/** �� 10 List�ϐ��F l_OUTPUT_RSLT_CD */
	public List l_OUTPUT_RSLT_CD = null;

	/** �� 11 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 13 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 14 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 15 List�ϐ��F l_LOGIN_USER */
	public List l_LOGIN_USER = null;

	/** �� 16 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 17 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 18 List�ϐ��F l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** �� 19 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 20 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 21 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 22 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 23 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 24 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 25 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 26 List�ϐ��F l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** �� 27 List�ϐ��F l_l_OPR_INST_START_DATE */
	public List l_l_OPR_INST_START_DATE = null;

	/** �� 28 List�ϐ��F l_l_PRD_DUE_DATE */
	public List l_l_PRD_DUE_DATE = null;

	/** �� 29 List�ϐ��F l_l_OPR_INST_QTY */
	public List l_l_OPR_INST_QTY = null;

	/** �� 30 List�ϐ��F l_l_RCV_QTY_1 */
	public List l_l_RCV_QTY_1 = null;

	/** �� 31 List�ϐ��F l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** �� 32 List�ϐ��F l_h_l_ODR_NO */
	public List l_h_l_ODR_NO = null;

	/** �� 33 List�ϐ��F l_h_l_MODIFY_COUNT */
	public List l_h_l_MODIFY_COUNT = null;

	/** �� 34 List�ϐ��F l_h_l_OPR_INST_CD */
	public List l_h_l_OPR_INST_CD = null;

	/** �� 35 List�ϐ��F l_L_PRD_START_DATE_TO */
	public List l_L_PRD_START_DATE_TO = null;

	/** �� 36 List�ϐ��F l_L_PRD_START_DATE_FROM */
	public List l_L_PRD_START_DATE_FROM = null;

	/** �� 37 List�ϐ��F l_L_PRD_DUE_DATE_TO */
	public List l_L_PRD_DUE_DATE_TO = null;

	/** �� 38 List�ϐ��F l_L_PRD_DUE_DATE_FROM */
	public List l_L_PRD_DUE_DATE_FROM = null;

	/** �� 39 List�ϐ��F l_MAX_LINE */
	public List l_MAX_LINE = null;

	/** �� 40 List�ϐ��F l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** �� 41 List�ϐ��F l_COUNT */
	public List l_COUNT = null;

	/** �� 42 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getPRD_START_DATE_FROM() { return m_PRD_START_DATE_FROM; }
	public String getPRD_START_DATE_FROM_TIME() { return m_PRD_START_DATE_FROM_TIME; }
	public String getPRD_START_DATE_TO() { return m_PRD_START_DATE_TO; }
	public String getPRD_START_DATE_TO_TIME() { return m_PRD_START_DATE_TO_TIME; }
	public String getPRD_DUE_DATE_FROM() { return m_PRD_DUE_DATE_FROM; }
	public String getPRD_DUE_DATE_FROM_TIME() { return m_PRD_DUE_DATE_FROM_TIME; }
	public String getPRD_DUE_DATE_TO() { return m_PRD_DUE_DATE_TO; }
	public String getPRD_DUE_DATE_TO_TIME() { return m_PRD_DUE_DATE_TO_TIME; }
	public String getOUTPUT_RSLT_CD() { return m_OUTPUT_RSLT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getLOGIN_USER() { return m_LOGIN_USER; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getVALUE() { return m_VALUE; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_OPR_INST_START_DATE() { return m_l_OPR_INST_START_DATE; }
	public String getl_PRD_DUE_DATE() { return m_l_PRD_DUE_DATE; }
	public String getl_OPR_INST_QTY() { return m_l_OPR_INST_QTY; }
	public String getl_RCV_QTY_1() { return m_l_RCV_QTY_1; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String geth_l_ODR_NO() { return m_h_l_ODR_NO; }
	public String geth_l_MODIFY_COUNT() { return m_h_l_MODIFY_COUNT; }
	public String geth_l_OPR_INST_CD() { return m_h_l_OPR_INST_CD; }
	public String getL_PRD_START_DATE_TO() { return m_L_PRD_START_DATE_TO; }
	public String getL_PRD_START_DATE_FROM() { return m_L_PRD_START_DATE_FROM; }
	public String getL_PRD_DUE_DATE_TO() { return m_L_PRD_DUE_DATE_TO; }
	public String getL_PRD_DUE_DATE_FROM() { return m_L_PRD_DUE_DATE_FROM; }
	public String getMAX_LINE() { return m_MAX_LINE; }
	public String getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getCOUNT() { return m_COUNT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }

	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_PRD_START_DATE_FROM() { return l_PRD_START_DATE_FROM; }
	public List getList_PRD_START_DATE_FROM_TIME() { return l_PRD_START_DATE_FROM_TIME; }
	public List getList_PRD_START_DATE_TO() { return l_PRD_START_DATE_TO; }
	public List getList_PRD_START_DATE_TO_TIME() { return l_PRD_START_DATE_TO_TIME; }
	public List getList_PRD_DUE_DATE_FROM() { return l_PRD_DUE_DATE_FROM; }
	public List getList_PRD_DUE_DATE_FROM_TIME() { return l_PRD_DUE_DATE_FROM_TIME; }
	public List getList_PRD_DUE_DATE_TO() { return l_PRD_DUE_DATE_TO; }
	public List getList_PRD_DUE_DATE_TO_TIME() { return l_PRD_DUE_DATE_TO_TIME; }
	public List getList_OUTPUT_RSLT_CD() { return l_OUTPUT_RSLT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_LOGIN_USER() { return l_LOGIN_USER; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_OPR_INST_START_DATE() { return l_l_OPR_INST_START_DATE; }
	public List getList_l_PRD_DUE_DATE() { return l_l_PRD_DUE_DATE; }
	public List getList_l_OPR_INST_QTY() { return l_l_OPR_INST_QTY; }
	public List getList_l_RCV_QTY_1() { return l_l_RCV_QTY_1; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_h_l_ODR_NO() { return l_h_l_ODR_NO; }
	public List getList_h_l_MODIFY_COUNT() { return l_h_l_MODIFY_COUNT; }
	public List getList_h_l_OPR_INST_CD() { return l_h_l_OPR_INST_CD; }
	public List getList_L_PRD_START_DATE_TO() { return l_L_PRD_START_DATE_TO; }
	public List getList_L_PRD_START_DATE_FROM() { return l_L_PRD_START_DATE_FROM; }
	public List getList_L_PRD_DUE_DATE_TO() { return l_L_PRD_DUE_DATE_TO; }
	public List getList_L_PRD_DUE_DATE_FROM() { return l_L_PRD_DUE_DATE_FROM; }
	public List getList_MAX_LINE() { return l_MAX_LINE; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }

	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setPRD_START_DATE_FROM(String val) { m_PRD_START_DATE_FROM = val; }
	public void setPRD_START_DATE_FROM_TIME(String val) { m_PRD_START_DATE_FROM_TIME = val; }
	public void setPRD_START_DATE_TO(String val) { m_PRD_START_DATE_TO = val; }
	public void setPRD_START_DATE_TO_TIME(String val) { m_PRD_START_DATE_TO_TIME = val; }
	public void setPRD_DUE_DATE_FROM(String val) { m_PRD_DUE_DATE_FROM = val; }
	public void setPRD_DUE_DATE_FROM_TIME(String val) { m_PRD_DUE_DATE_FROM_TIME = val; }
	public void setPRD_DUE_DATE_TO(String val) { m_PRD_DUE_DATE_TO = val; }
	public void setPRD_DUE_DATE_TO_TIME(String val) { m_PRD_DUE_DATE_TO_TIME = val; }
	public void setOUTPUT_RSLT_CD(String val) { m_OUTPUT_RSLT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setLOGIN_USER(String val) { m_LOGIN_USER = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_OPR_INST_START_DATE(String val) { m_l_OPR_INST_START_DATE = val; }
	public void setl_PRD_DUE_DATE(String val) { m_l_PRD_DUE_DATE = val; }
	public void setl_OPR_INST_QTY(String val) { m_l_OPR_INST_QTY = val; }
	public void setl_RCV_QTY_1(String val) { m_l_RCV_QTY_1 = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void seth_l_ODR_NO(String val) { m_h_l_ODR_NO = val; }
	public void seth_l_MODIFY_COUNT(String val) { m_h_l_MODIFY_COUNT = val; }
	public void seth_l_OPR_INST_CD(String val) { m_h_l_OPR_INST_CD = val; }
	public void setL_PRD_START_DATE_TO(String val) { m_L_PRD_START_DATE_TO = val; }
	public void setL_PRD_START_DATE_FROM(String val) { m_L_PRD_START_DATE_FROM = val; }
	public void setL_PRD_DUE_DATE_TO(String val) { m_L_PRD_DUE_DATE_TO = val; }
	public void setL_PRD_DUE_DATE_FROM(String val) { m_L_PRD_DUE_DATE_FROM = val; }
	public void setMAX_LINE(String val) { m_MAX_LINE = val; }
	public void setPROC_EXEC_DATE(String val) { m_PROC_EXEC_DATE = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }


	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_PRD_START_DATE_FROM(List list) { l_PRD_START_DATE_FROM = list; }
	public void setList_PRD_START_DATE_FROM_TIME(List list) { l_PRD_START_DATE_FROM_TIME = list; }
	public void setList_PRD_START_DATE_TO(List list) { l_PRD_START_DATE_TO = list; }
	public void setList_PRD_START_DATE_TO_TIME(List list) { l_PRD_START_DATE_TO_TIME = list; }
	public void setList_PRD_DUE_DATE_FROM(List list) { l_PRD_DUE_DATE_FROM = list; }
	public void setList_PRD_DUE_DATE_FROM_TIME(List list) { l_PRD_DUE_DATE_FROM_TIME = list; }
	public void setList_PRD_DUE_DATE_TO(List list) { l_PRD_DUE_DATE_TO = list; }
	public void setList_PRD_DUE_DATE_TO_TIME(List list) { l_PRD_DUE_DATE_TO_TIME = list; }
	public void setList_OUTPUT_RSLT_CD(List list) { l_OUTPUT_RSLT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_LOGIN_USER(List list) { l_LOGIN_USER = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_OPR_INST_START_DATE(List list) { l_l_OPR_INST_START_DATE = list; }
	public void setList_l_PRD_DUE_DATE(List list) { l_l_PRD_DUE_DATE = list; }
	public void setList_l_OPR_INST_QTY(List list) { l_l_OPR_INST_QTY = list; }
	public void setList_l_RCV_QTY_1(List list) { l_l_RCV_QTY_1 = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_h_l_ODR_NO(List list) { l_h_l_ODR_NO = list; }
	public void setList_h_l_MODIFY_COUNT(List list) { l_h_l_MODIFY_COUNT = list; }
	public void setList_h_l_OPR_INST_CD(List list) { l_h_l_OPR_INST_CD = list; }
	public void setList_L_PRD_START_DATE_TO(List list) { l_L_PRD_START_DATE_TO = list; }
	public void setList_L_PRD_START_DATE_FROM(List list) { l_L_PRD_START_DATE_FROM = list; }
	public void setList_L_PRD_DUE_DATE_TO(List list) { l_L_PRD_DUE_DATE_TO = list; }
	public void setList_L_PRD_DUE_DATE_FROM(List list) { l_L_PRD_DUE_DATE_FROM = list; }
	public void setList_MAX_LINE(List list) { l_MAX_LINE = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }

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
			l_TIME_CTRL.add(((AD0100010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_FROM == null) {
			l_PRD_START_DATE_FROM = new ArrayList();
		} else {
			l_PRD_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_FROM.add(((AD0100010Struct) list.get(i)).getPRD_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_FROM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_FROM_TIME == null) {
			l_PRD_START_DATE_FROM_TIME = new ArrayList();
		} else {
			l_PRD_START_DATE_FROM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_FROM_TIME.add(((AD0100010Struct) list.get(i)).getPRD_START_DATE_FROM_TIME());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_TO == null) {
			l_PRD_START_DATE_TO = new ArrayList();
		} else {
			l_PRD_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_TO.add(((AD0100010Struct) list.get(i)).getPRD_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_TO_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_TO_TIME == null) {
			l_PRD_START_DATE_TO_TIME = new ArrayList();
		} else {
			l_PRD_START_DATE_TO_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_TO_TIME.add(((AD0100010Struct) list.get(i)).getPRD_START_DATE_TO_TIME());
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
			l_PRD_DUE_DATE_FROM.add(((AD0100010Struct) list.get(i)).getPRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_FROM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_FROM_TIME == null) {
			l_PRD_DUE_DATE_FROM_TIME = new ArrayList();
		} else {
			l_PRD_DUE_DATE_FROM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_FROM_TIME.add(((AD0100010Struct) list.get(i)).getPRD_DUE_DATE_FROM_TIME());
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
			l_PRD_DUE_DATE_TO.add(((AD0100010Struct) list.get(i)).getPRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_TO_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_TO_TIME == null) {
			l_PRD_DUE_DATE_TO_TIME = new ArrayList();
		} else {
			l_PRD_DUE_DATE_TO_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_TO_TIME.add(((AD0100010Struct) list.get(i)).getPRD_DUE_DATE_TO_TIME());
		}
		return size;
	}
	public int setL2L_OUTPUT_RSLT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_RSLT_CD == null) {
			l_OUTPUT_RSLT_CD = new ArrayList();
		} else {
			l_OUTPUT_RSLT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_RSLT_CD.add(((AD0100010Struct) list.get(i)).getOUTPUT_RSLT_CD());
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
			l_ITEM_CD.add(((AD0100010Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0100010Struct) list.get(i)).getWS_CD());
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
			l_BUSINESS_OPR_DATE.add(((AD0100010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_WH_CD.add(((AD0100010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_LOGIN_USER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOGIN_USER == null) {
			l_LOGIN_USER = new ArrayList();
		} else {
			l_LOGIN_USER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOGIN_USER.add(((AD0100010Struct) list.get(i)).getLOGIN_USER());
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
			l_PLANT_CD.add(((AD0100010Struct) list.get(i)).getPLANT_CD());
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
			l_OPR_INST_CD.add(((AD0100010Struct) list.get(i)).getOPR_INST_CD());
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
			l_PARTIAL_PRD_NO.add(((AD0100010Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_WORK_ODR_CD.add(((AD0100010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AD0100010Struct) list.get(i)).getVALUE());
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
			l_ITEM_NAME.add(((AD0100010Struct) list.get(i)).getITEM_NAME());
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
			l_WS_NAME.add(((AD0100010Struct) list.get(i)).getWS_NAME());
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
			l_l_ITEM_CD.add(((AD0100010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AD0100010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_WS_CD.add(((AD0100010Struct) list.get(i)).getl_WS_CD());
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
			l_l_WS_NAME.add(((AD0100010Struct) list.get(i)).getl_WS_NAME());
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
			l_l_OPR_INST_START_DATE.add(((AD0100010Struct) list.get(i)).getl_OPR_INST_START_DATE());
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
			l_l_PRD_DUE_DATE.add(((AD0100010Struct) list.get(i)).getl_PRD_DUE_DATE());
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
			l_l_OPR_INST_QTY.add(((AD0100010Struct) list.get(i)).getl_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_l_RCV_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RCV_QTY_1 == null) {
			l_l_RCV_QTY_1 = new ArrayList();
		} else {
			l_l_RCV_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RCV_QTY_1.add(((AD0100010Struct) list.get(i)).getl_RCV_QTY_1());
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
			l_l_WORK_ODR_CD.add(((AD0100010Struct) list.get(i)).getl_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_l_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_ODR_NO == null) {
			l_h_l_ODR_NO = new ArrayList();
		} else {
			l_h_l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_ODR_NO.add(((AD0100010Struct) list.get(i)).geth_l_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_MODIFY_COUNT == null) {
			l_h_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_MODIFY_COUNT.add(((AD0100010Struct) list.get(i)).geth_l_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_l_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_OPR_INST_CD == null) {
			l_h_l_OPR_INST_CD = new ArrayList();
		} else {
			l_h_l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_OPR_INST_CD.add(((AD0100010Struct) list.get(i)).geth_l_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_L_PRD_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PRD_START_DATE_TO == null) {
			l_L_PRD_START_DATE_TO = new ArrayList();
		} else {
			l_L_PRD_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PRD_START_DATE_TO.add(((AD0100010Struct) list.get(i)).getL_PRD_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_L_PRD_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PRD_START_DATE_FROM == null) {
			l_L_PRD_START_DATE_FROM = new ArrayList();
		} else {
			l_L_PRD_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PRD_START_DATE_FROM.add(((AD0100010Struct) list.get(i)).getL_PRD_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_L_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PRD_DUE_DATE_TO == null) {
			l_L_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_L_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PRD_DUE_DATE_TO.add(((AD0100010Struct) list.get(i)).getL_PRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_L_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PRD_DUE_DATE_FROM == null) {
			l_L_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_L_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PRD_DUE_DATE_FROM.add(((AD0100010Struct) list.get(i)).getL_PRD_DUE_DATE_FROM());
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
			l_MAX_LINE.add(((AD0100010Struct) list.get(i)).getMAX_LINE());
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
			l_PROC_EXEC_DATE.add(((AD0100010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AD0100010Struct) list.get(i)).getCOUNT());
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
			l_MODIFY_COUNT.add(((AD0100010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_TIME_CTRL = null;
		m_PRD_START_DATE_FROM = null;
		m_PRD_START_DATE_FROM_TIME = null;
		m_PRD_START_DATE_TO = null;
		m_PRD_START_DATE_TO_TIME = null;
		m_PRD_DUE_DATE_FROM = null;
		m_PRD_DUE_DATE_FROM_TIME = null;
		m_PRD_DUE_DATE_TO = null;
		m_PRD_DUE_DATE_TO_TIME = null;
		m_OUTPUT_RSLT_CD = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_WH_CD = null;
		m_LOGIN_USER = null;
		m_PLANT_CD = null;
		m_OPR_INST_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_WORK_ODR_CD = null;
		m_VALUE = null;
		m_ITEM_NAME = null;
		m_WS_NAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_WS_CD = null;
		m_l_WS_NAME = null;
		m_l_OPR_INST_START_DATE = null;
		m_l_PRD_DUE_DATE = null;
		m_l_OPR_INST_QTY = null;
		m_l_RCV_QTY_1 = null;
		m_l_WORK_ODR_CD = null;
		m_h_l_ODR_NO = null;
		m_h_l_MODIFY_COUNT = null;
		m_h_l_OPR_INST_CD = null;
		m_L_PRD_START_DATE_TO = null;
		m_L_PRD_START_DATE_FROM = null;
		m_L_PRD_DUE_DATE_TO = null;
		m_L_PRD_DUE_DATE_FROM = null;
		m_MAX_LINE = null;
		m_PROC_EXEC_DATE = null;
		m_COUNT = null;
		m_MODIFY_COUNT = null;

		l_TIME_CTRL = null;
		l_PRD_START_DATE_FROM = null;
		l_PRD_START_DATE_FROM_TIME = null;
		l_PRD_START_DATE_TO = null;
		l_PRD_START_DATE_TO_TIME = null;
		l_PRD_DUE_DATE_FROM = null;
		l_PRD_DUE_DATE_FROM_TIME = null;
		l_PRD_DUE_DATE_TO = null;
		l_PRD_DUE_DATE_TO_TIME = null;
		l_OUTPUT_RSLT_CD = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_WH_CD = null;
		l_LOGIN_USER = null;
		l_PLANT_CD = null;
		l_OPR_INST_CD = null;
		l_PARTIAL_PRD_NO = null;
		l_WORK_ODR_CD = null;
		l_VALUE = null;
		l_ITEM_NAME = null;
		l_WS_NAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_WS_CD = null;
		l_l_WS_NAME = null;
		l_l_OPR_INST_START_DATE = null;
		l_l_PRD_DUE_DATE = null;
		l_l_OPR_INST_QTY = null;
		l_l_RCV_QTY_1 = null;
		l_l_WORK_ODR_CD = null;
		l_h_l_ODR_NO = null;
		l_h_l_MODIFY_COUNT = null;
		l_h_l_OPR_INST_CD = null;
		l_L_PRD_START_DATE_TO = null;
		l_L_PRD_START_DATE_FROM = null;
		l_L_PRD_DUE_DATE_TO = null;
		l_L_PRD_DUE_DATE_FROM = null;
		l_MAX_LINE = null;
		l_PROC_EXEC_DATE = null;
		l_COUNT = null;
		l_MODIFY_COUNT = null;

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
	 * medAD0100010�N���X�̕W���R���X�g���N�^
	 */
	public AD0100010Struct()
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
	public void setStruct(AD0100010Struct struct)
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
	public void setStructM(AD0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setPRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			this.setPRD_START_DATE_FROM_TIME(struct.getPRD_START_DATE_FROM_TIME());
			this.setPRD_START_DATE_TO(struct.getPRD_START_DATE_TO());
			this.setPRD_START_DATE_TO_TIME(struct.getPRD_START_DATE_TO_TIME());
			this.setPRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			this.setPRD_DUE_DATE_FROM_TIME(struct.getPRD_DUE_DATE_FROM_TIME());
			this.setPRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO());
			this.setPRD_DUE_DATE_TO_TIME(struct.getPRD_DUE_DATE_TO_TIME());
			this.setOUTPUT_RSLT_CD(struct.getOUTPUT_RSLT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setWH_CD(struct.getWH_CD());
			this.setLOGIN_USER(struct.getLOGIN_USER());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setVALUE(struct.getVALUE());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setWS_NAME(struct.getWS_NAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_OPR_INST_START_DATE(struct.getl_OPR_INST_START_DATE());
			this.setl_PRD_DUE_DATE(struct.getl_PRD_DUE_DATE());
			this.setl_OPR_INST_QTY(struct.getl_OPR_INST_QTY());
			this.setl_RCV_QTY_1(struct.getl_RCV_QTY_1());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.seth_l_ODR_NO(struct.geth_l_ODR_NO());
			this.seth_l_MODIFY_COUNT(struct.geth_l_MODIFY_COUNT());
			this.seth_l_OPR_INST_CD(struct.geth_l_OPR_INST_CD());
			this.setL_PRD_START_DATE_TO(struct.getL_PRD_START_DATE_TO());
			this.setL_PRD_START_DATE_FROM(struct.getL_PRD_START_DATE_FROM());
			this.setL_PRD_DUE_DATE_TO(struct.getL_PRD_DUE_DATE_TO());
			this.setL_PRD_DUE_DATE_FROM(struct.getL_PRD_DUE_DATE_FROM());
			this.setMAX_LINE(struct.getMAX_LINE());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setCOUNT(struct.getCOUNT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_PRD_START_DATE_FROM(struct.getList_PRD_START_DATE_FROM());
			this.setList_PRD_START_DATE_FROM_TIME(struct.getList_PRD_START_DATE_FROM_TIME());
			this.setList_PRD_START_DATE_TO(struct.getList_PRD_START_DATE_TO());
			this.setList_PRD_START_DATE_TO_TIME(struct.getList_PRD_START_DATE_TO_TIME());
			this.setList_PRD_DUE_DATE_FROM(struct.getList_PRD_DUE_DATE_FROM());
			this.setList_PRD_DUE_DATE_FROM_TIME(struct.getList_PRD_DUE_DATE_FROM_TIME());
			this.setList_PRD_DUE_DATE_TO(struct.getList_PRD_DUE_DATE_TO());
			this.setList_PRD_DUE_DATE_TO_TIME(struct.getList_PRD_DUE_DATE_TO_TIME());
			this.setList_OUTPUT_RSLT_CD(struct.getList_OUTPUT_RSLT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_LOGIN_USER(struct.getList_LOGIN_USER());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_OPR_INST_START_DATE(struct.getList_l_OPR_INST_START_DATE());
			this.setList_l_PRD_DUE_DATE(struct.getList_l_PRD_DUE_DATE());
			this.setList_l_OPR_INST_QTY(struct.getList_l_OPR_INST_QTY());
			this.setList_l_RCV_QTY_1(struct.getList_l_RCV_QTY_1());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_h_l_ODR_NO(struct.getList_h_l_ODR_NO());
			this.setList_h_l_MODIFY_COUNT(struct.getList_h_l_MODIFY_COUNT());
			this.setList_h_l_OPR_INST_CD(struct.getList_h_l_OPR_INST_CD());
			this.setList_L_PRD_START_DATE_TO(struct.getList_L_PRD_START_DATE_TO());
			this.setList_L_PRD_START_DATE_FROM(struct.getList_L_PRD_START_DATE_FROM());
			this.setList_L_PRD_DUE_DATE_TO(struct.getList_L_PRD_DUE_DATE_TO());
			this.setList_L_PRD_DUE_DATE_FROM(struct.getList_L_PRD_DUE_DATE_FROM());
			this.setList_MAX_LINE(struct.getList_MAX_LINE());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
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
	// �� 1 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 2 �ϐ������l�F i_PRD_START_DATE_FROM


	final static String i_PRD_START_DATE_FROM = null;

	// �� 3 �ϐ������l�F i_PRD_START_DATE_FROM_TIME


	final static String i_PRD_START_DATE_FROM_TIME = null;

	// �� 4 �ϐ������l�F i_PRD_START_DATE_TO


	final static String i_PRD_START_DATE_TO = null;

	// �� 5 �ϐ������l�F i_PRD_START_DATE_TO_TIME


	final static String i_PRD_START_DATE_TO_TIME = null;

	// �� 6 �ϐ������l�F i_PRD_DUE_DATE_FROM


	final static String i_PRD_DUE_DATE_FROM = null;

	// �� 7 �ϐ������l�F i_PRD_DUE_DATE_FROM_TIME


	final static String i_PRD_DUE_DATE_FROM_TIME = null;

	// �� 8 �ϐ������l�F i_PRD_DUE_DATE_TO


	final static String i_PRD_DUE_DATE_TO = null;

	// �� 9 �ϐ������l�F i_PRD_DUE_DATE_TO_TIME


	final static String i_PRD_DUE_DATE_TO_TIME = null;

	// �� 10 �ϐ������l�F i_OUTPUT_RSLT_CD


	final static String i_OUTPUT_RSLT_CD = null;

	// �� 11 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 13 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 14 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 15 �ϐ������l�F i_LOGIN_USER


	final static String i_LOGIN_USER = null;

	// �� 16 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 17 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 18 �ϐ������l�F i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// �� 19 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 20 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 21 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 22 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 23 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 25 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 26 �ϐ������l�F i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// �� 27 �ϐ������l�F i_l_OPR_INST_START_DATE


	final static String i_l_OPR_INST_START_DATE = null;

	// �� 28 �ϐ������l�F i_l_PRD_DUE_DATE


	final static String i_l_PRD_DUE_DATE = null;

	// �� 29 �ϐ������l�F i_l_OPR_INST_QTY


	final static String i_l_OPR_INST_QTY = null;

	// �� 30 �ϐ������l�F i_l_RCV_QTY_1


	final static String i_l_RCV_QTY_1 = null;

	// �� 31 �ϐ������l�F i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// �� 32 �ϐ������l�F i_h_l_ODR_NO


	final static String i_h_l_ODR_NO = null;

	// �� 33 �ϐ������l�F i_h_l_MODIFY_COUNT


	final static String i_h_l_MODIFY_COUNT = null;

	// �� 34 �ϐ������l�F i_h_l_OPR_INST_CD


	final static String i_h_l_OPR_INST_CD = null;

	// �� 35 �ϐ������l�F i_L_PRD_START_DATE_TO


	final static String i_L_PRD_START_DATE_TO = null;

	// �� 36 �ϐ������l�F i_L_PRD_START_DATE_FROM


	final static String i_L_PRD_START_DATE_FROM = null;

	// �� 37 �ϐ������l�F i_L_PRD_DUE_DATE_TO


	final static String i_L_PRD_DUE_DATE_TO = null;

	// �� 38 �ϐ������l�F i_L_PRD_DUE_DATE_FROM


	final static String i_L_PRD_DUE_DATE_FROM = null;

	// �� 39 �ϐ������l�F i_MAX_LINE


	final static String i_MAX_LINE = null;

	// �� 40 �ϐ������l�F i_PROC_EXEC_DATE


	final static String i_PROC_EXEC_DATE = null;

	// �� 41 �ϐ������l�F i_COUNT


	final static String i_COUNT = null;

	// �� 42 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_TIME_CTRL

	final static String i_TIME_CTRL = null;

	// �� 2 �ϐ������l�F i_PRD_START_DATE_FROM

	final static String i_PRD_START_DATE_FROM = null;

	// �� 3 �ϐ������l�F i_PRD_START_DATE_FROM_TIME

	final static String i_PRD_START_DATE_FROM_TIME = null;

	// �� 4 �ϐ������l�F i_PRD_START_DATE_TO

	final static String i_PRD_START_DATE_TO = null;

	// �� 5 �ϐ������l�F i_PRD_START_DATE_TO_TIME

	final static String i_PRD_START_DATE_TO_TIME = null;

	// �� 6 �ϐ������l�F i_PRD_DUE_DATE_FROM

	final static String i_PRD_DUE_DATE_FROM = null;

	// �� 7 �ϐ������l�F i_PRD_DUE_DATE_FROM_TIME

	final static String i_PRD_DUE_DATE_FROM_TIME = null;

	// �� 8 �ϐ������l�F i_PRD_DUE_DATE_TO

	final static String i_PRD_DUE_DATE_TO = null;

	// �� 9 �ϐ������l�F i_PRD_DUE_DATE_TO_TIME

	final static String i_PRD_DUE_DATE_TO_TIME = null;

	// �� 10 �ϐ������l�F i_OUTPUT_RSLT_CD

	final static String i_OUTPUT_RSLT_CD = null;

	// �� 11 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 13 �ϐ������l�F i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// �� 14 �ϐ������l�F i_WH_CD

	final static String i_WH_CD = null;

	// �� 15 �ϐ������l�F i_LOGIN_USER

	final static String i_LOGIN_USER = null;

	// �� 16 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 17 �ϐ������l�F i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// �� 18 �ϐ������l�F i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// �� 19 �ϐ������l�F i_h_l_OPR_INST_CD

	final static String i_h_l_OPR_INST_CD = null;

	// �� 20 �ϐ������l�F i_VALUE

	final static String i_VALUE = null;

	// �� 21 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 22 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 23 �ϐ������l�F i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// �� 25 �ϐ������l�F i_l_WS_CD

	final static String i_l_WS_CD = null;

	// �� 26 �ϐ������l�F i_l_WS_NAME

	final static String i_l_WS_NAME = null;

	// �� 27 �ϐ������l�F i_l_OPR_INST_START_DATE

	final static String i_l_OPR_INST_START_DATE = null;

	// �� 28 �ϐ������l�F i_l_PRD_DUE_DATE

	final static String i_l_PRD_DUE_DATE = null;

	// �� 29 �ϐ������l�F i_l_OPR_INST_QTY

	final static String i_l_OPR_INST_QTY = null;

	// �� 30 �ϐ������l�F i_l_RCV_QTY_1

	final static String i_l_RCV_QTY_1 = null;

	// �� 31 �ϐ������l�F i_l_WORK_ODR_CD

	final static String i_l_WORK_ODR_CD = null;

	// �� 32 �ϐ������l�F i_h_l_ODR_NO

	final static String i_h_l_ODR_NO = null;

	// �� 33 �ϐ������l�F i_h_l_MODIFY_COUNT

	final static String i_h_l_MODIFY_COUNT = null;

	// �� 34 �ϐ������l�F i_L_PRD_START_DATE_TO

	final static String i_L_PRD_START_DATE_TO = null;

	// �� 35 �ϐ������l�F i_L_PRD_START_DATE_FROM

	final static String i_L_PRD_START_DATE_FROM = null;

	// �� 36 �ϐ������l�F i_L_PRD_DUE_DATE_TO

	final static String i_L_PRD_DUE_DATE_TO = null;

	// �� 37 �ϐ������l�F i_L_PRD_DUE_DATE_FROM

	final static String i_L_PRD_DUE_DATE_FROM = null;

	// �� 38 �ϐ������l�F i_MAX_LINE

	final static String i_MAX_LINE = null;

	// �� 39 �ϐ������l�F i_PROC_EXEC_DATE

	final static String i_PROC_EXEC_DATE = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_TIME_CTRL = i_TIME_CTRL;
		m_PRD_START_DATE_FROM = i_PRD_START_DATE_FROM;
		m_PRD_START_DATE_FROM_TIME = i_PRD_START_DATE_FROM_TIME;
		m_PRD_START_DATE_TO = i_PRD_START_DATE_TO;
		m_PRD_START_DATE_TO_TIME = i_PRD_START_DATE_TO_TIME;
		m_PRD_DUE_DATE_FROM = i_PRD_DUE_DATE_FROM;
		m_PRD_DUE_DATE_FROM_TIME = i_PRD_DUE_DATE_FROM_TIME;
		m_PRD_DUE_DATE_TO = i_PRD_DUE_DATE_TO;
		m_PRD_DUE_DATE_TO_TIME = i_PRD_DUE_DATE_TO_TIME;
		m_OUTPUT_RSLT_CD = i_OUTPUT_RSLT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_WS_CD = i_WS_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_WH_CD = i_WH_CD;
		m_LOGIN_USER = i_LOGIN_USER;
		m_PLANT_CD = i_PLANT_CD;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_h_l_OPR_INST_CD = i_h_l_OPR_INST_CD;
		m_VALUE = i_VALUE;
		m_ITEM_NAME = i_ITEM_NAME;
		m_WS_NAME = i_WS_NAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_WS_CD = i_l_WS_CD;
		m_l_WS_NAME = i_l_WS_NAME;
		m_l_OPR_INST_START_DATE = i_l_OPR_INST_START_DATE;
		m_l_PRD_DUE_DATE = i_l_PRD_DUE_DATE;
		m_l_OPR_INST_QTY = i_l_OPR_INST_QTY;
		m_l_RCV_QTY_1 = i_l_RCV_QTY_1;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_h_l_ODR_NO = i_h_l_ODR_NO;
		m_h_l_MODIFY_COUNT = i_h_l_MODIFY_COUNT;
		m_L_PRD_START_DATE_TO = i_L_PRD_START_DATE_TO;
		m_L_PRD_START_DATE_FROM = i_L_PRD_START_DATE_FROM;
		m_L_PRD_DUE_DATE_TO = i_L_PRD_DUE_DATE_TO;
		m_L_PRD_DUE_DATE_FROM = i_L_PRD_DUE_DATE_FROM;
		m_MAX_LINE = i_MAX_LINE;
		m_PROC_EXEC_DATE = i_PROC_EXEC_DATE;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
