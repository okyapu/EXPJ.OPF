/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/src/com/nec/jp/orteus/metamorBase/AD0130/AD0130010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0130;

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
 * CLASS     : AD0130010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2016/01/15 07:18:32 $
 *
 */
//}}user_implement_code_header

public class AD0130010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DAILY_WORK_REPORT_TYP_name */
	public String m_DAILY_WORK_REPORT_TYP_name = null;
	/** �� 2 �ϐ��F m_DAILY_WORK_REPORT_TYP_val */
	public String m_DAILY_WORK_REPORT_TYP_val = null;
	/** �� 3 �ϐ��F m_l_DAILY_WORK_REPORT_TYP_SHOW */
	public String m_l_DAILY_WORK_REPORT_TYP_SHOW = null;
	/** �� 4 �ϐ��F m_l_OPR_TYP_SHOW */
	public String m_l_OPR_TYP_SHOW = null;
	/** �� 5 �ϐ��F m_l_UN_OPR_CAUSE_TYP_SHOW */
	public String m_l_UN_OPR_CAUSE_TYP_SHOW = null;
	/** �� 6 �ϐ��F m_l_OPR_TYP_name */
	public String m_l_OPR_TYP_name = null;
	/** �� 7 �ϐ��F m_l_OPR_TYP_val */
	public String m_l_OPR_TYP_val = null;
	/** �� 8 �ϐ��F m_l_UN_OPR_CAUSE_TYP_name */
	public String m_l_UN_OPR_CAUSE_TYP_name = null;
	/** �� 9 �ϐ��F m_l_UN_OPR_CAUSE_TYP_val */
	public String m_l_UN_OPR_CAUSE_TYP_val = null;
	/** �� 10 �ϐ��F m_h_UpdateFlag */
	public String m_h_UpdateFlag = null;
	/** �� 11 �ϐ��F m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** �� 12 �ϐ��F m_h_l_DAILY_WORK_REPORT_TYP */
	public String m_h_l_DAILY_WORK_REPORT_TYP = null;
	/** �� 13 �ϐ��F m_l_USER_CD */
	public String m_l_USER_CD = null;
	/** �� 14 �ϐ��F m_l_OPR_DATE */
	public String m_l_OPR_DATE = null;
	/** �� 15 �ϐ��F m_l_WORK_SHIFT_CODE */
	public String m_l_WORK_SHIFT_CODE = null;
	/** �� 16 �ϐ��F m_l_START_TIME */
	public String m_l_START_TIME = null;
	/** �� 17 �ϐ��F m_l_END_TIME */
	public String m_l_END_TIME = null;
	/** �� 18 �ϐ��F m_l_OPR_TIME */
	public String m_l_OPR_TIME = null;
	/** �� 19 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 20 �ϐ��F m_h_l_OPR_TYP */
	public String m_h_l_OPR_TYP = null;
	/** �� 21 �ϐ��F m_h_l_UN_OPR_CAUSE_TYP */
	public String m_h_l_UN_OPR_CAUSE_TYP = null;
	/** �� 22 �ϐ��F m_l_UN_OPR_TIME */
	public String m_l_UN_OPR_TIME = null;
	/** �� 23 �ϐ��F m_l_DAILY_WORK_REPORT_CTL_NO */
	public String m_l_DAILY_WORK_REPORT_CTL_NO = null;
	/** �� 24 �ϐ��F m_h_l_SEQ_NO */
	public String m_h_l_SEQ_NO = null;
	/** �� 25 �ϐ��F m_h_l_MODIFY_COUNT */
	public String m_h_l_MODIFY_COUNT = null;
	/** �� 26 �ϐ��F m_USER_PLANT_CD */
	public String m_USER_PLANT_CD = null;
	/** �� 27 �ϐ��F m_DAILY_WORK_REPORT_TYP */
	public String m_DAILY_WORK_REPORT_TYP = null;
	/** �� 28 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 29 �ϐ��F m_OPR_DATE_FROM */
	public String m_OPR_DATE_FROM = null;
	/** �� 30 �ϐ��F m_OPR_DATE_TO */
	public String m_OPR_DATE_TO = null;
	/** �� 31 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 32 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 33 �ϐ��F m_MAX_LINE */
	public String m_MAX_LINE = null;
	/** �� 34 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 35 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 36 �ϐ��F m_h_DAILY_WORK_REPORT_CTL_NO */
	public String m_h_DAILY_WORK_REPORT_CTL_NO = null;
	/** �� 37 �ϐ��F m_l_SEQ_NO */
	public String m_l_SEQ_NO = null;
	/** �� 38 �ϐ��F m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** �� 39 �ϐ��F m_l_OPR_TYP */
	public String m_l_OPR_TYP = null;
	/** �� 40 �ϐ��F m_l_UN_OPR_CAUSE_TYP */
	public String m_l_UN_OPR_CAUSE_TYP = null;
	/** �� 41 �ϐ��F m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** �� 42 �ϐ��F m_WORK_SHIFT_NAME */
	public String m_WORK_SHIFT_NAME = null;
	/** �� 43 �ϐ��F m_WORK_SHIFT_CODE */
	public String m_WORK_SHIFT_CODE = null;
	/** �� 44 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 45 �ϐ��F m_DAILY_WORK_REPORT_CTL_NO */
	public String m_DAILY_WORK_REPORT_CTL_NO = null;
	/** �� 46 �ϐ��F m_SEQ_NO */
	public String m_SEQ_NO = null;
	/** �� 47 �ϐ��F m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** �� 48 �ϐ��F m_START_TIME */
	public String m_START_TIME = null;
	/** �� 49 �ϐ��F m_END_TIME */
	public String m_END_TIME = null;
	/** �� 50 �ϐ��F m_OPR_TIME */
	public String m_OPR_TIME = null;
	/** �� 51 �ϐ��F m_OPR_TYP */
	public String m_OPR_TYP = null;
	/** �� 52 �ϐ��F m_UN_OPR_CAUSE_TYP */
	public String m_UN_OPR_CAUSE_TYP = null;
	/** �� 53 �ϐ��F m_UN_OPR_TIME */
	public String m_UN_OPR_TIME = null;
	/** �� 54 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 55 �ϐ��F m_TOTAL_OPR_TIME */
	public String m_TOTAL_OPR_TIME = null;
	/** �� 56 �ϐ��F m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** �� 57 �ϐ��F m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** �� 58 �ϐ��F m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** �� 59 �ϐ��F m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** �� 60 �ϐ��F m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** �� 61 �ϐ��F m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** �� 62 �ϐ��F m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** �� 63 �ϐ��F m_RETURN_MESSAGE */
	public String m_RETURN_MESSAGE = null;
	/** �� 64 �ϐ��F m_RETURN_STATUS */
	public String m_RETURN_STATUS = null;
	/** �� 65 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 66 �ϐ��F m_HOLIDAY_FLG */
	public String m_HOLIDAY_FLG = null;
	/** �� 67 �ϐ��F m_w_USER_CD */
	public String m_w_USER_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DAILY_WORK_REPORT_TYP_name */
	public List l_DAILY_WORK_REPORT_TYP_name = null;

	/** �� 2 List�ϐ��F l_DAILY_WORK_REPORT_TYP_val */
	public List l_DAILY_WORK_REPORT_TYP_val = null;

	/** �� 3 List�ϐ��F l_l_DAILY_WORK_REPORT_TYP_SHOW */
	public List l_l_DAILY_WORK_REPORT_TYP_SHOW = null;

	/** �� 4 List�ϐ��F l_l_OPR_TYP_SHOW */
	public List l_l_OPR_TYP_SHOW = null;

	/** �� 5 List�ϐ��F l_l_UN_OPR_CAUSE_TYP_SHOW */
	public List l_l_UN_OPR_CAUSE_TYP_SHOW = null;

	/** �� 6 List�ϐ��F l_l_OPR_TYP_name */
	public List l_l_OPR_TYP_name = null;

	/** �� 7 List�ϐ��F l_l_OPR_TYP_val */
	public List l_l_OPR_TYP_val = null;

	/** �� 8 List�ϐ��F l_l_UN_OPR_CAUSE_TYP_name */
	public List l_l_UN_OPR_CAUSE_TYP_name = null;

	/** �� 9 List�ϐ��F l_l_UN_OPR_CAUSE_TYP_val */
	public List l_l_UN_OPR_CAUSE_TYP_val = null;

	/** �� 10 List�ϐ��F l_h_UpdateFlag */
	public List l_h_UpdateFlag = null;

	/** �� 11 List�ϐ��F l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** �� 12 List�ϐ��F l_h_l_DAILY_WORK_REPORT_TYP */
	public List l_h_l_DAILY_WORK_REPORT_TYP = null;

	/** �� 13 List�ϐ��F l_l_USER_CD */
	public List l_l_USER_CD = null;

	/** �� 14 List�ϐ��F l_l_OPR_DATE */
	public List l_l_OPR_DATE = null;

	/** �� 15 List�ϐ��F l_l_WORK_SHIFT_CODE */
	public List l_l_WORK_SHIFT_CODE = null;

	/** �� 16 List�ϐ��F l_l_START_TIME */
	public List l_l_START_TIME = null;

	/** �� 17 List�ϐ��F l_l_END_TIME */
	public List l_l_END_TIME = null;

	/** �� 18 List�ϐ��F l_l_OPR_TIME */
	public List l_l_OPR_TIME = null;

	/** �� 19 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 20 List�ϐ��F l_h_l_OPR_TYP */
	public List l_h_l_OPR_TYP = null;

	/** �� 21 List�ϐ��F l_h_l_UN_OPR_CAUSE_TYP */
	public List l_h_l_UN_OPR_CAUSE_TYP = null;

	/** �� 22 List�ϐ��F l_l_UN_OPR_TIME */
	public List l_l_UN_OPR_TIME = null;

	/** �� 23 List�ϐ��F l_l_DAILY_WORK_REPORT_CTL_NO */
	public List l_l_DAILY_WORK_REPORT_CTL_NO = null;

	/** �� 24 List�ϐ��F l_h_l_SEQ_NO */
	public List l_h_l_SEQ_NO = null;

	/** �� 25 List�ϐ��F l_h_l_MODIFY_COUNT */
	public List l_h_l_MODIFY_COUNT = null;

	/** �� 26 List�ϐ��F l_USER_PLANT_CD */
	public List l_USER_PLANT_CD = null;

	/** �� 27 List�ϐ��F l_DAILY_WORK_REPORT_TYP */
	public List l_DAILY_WORK_REPORT_TYP = null;

	/** �� 28 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 29 List�ϐ��F l_OPR_DATE_FROM */
	public List l_OPR_DATE_FROM = null;

	/** �� 30 List�ϐ��F l_OPR_DATE_TO */
	public List l_OPR_DATE_TO = null;

	/** �� 31 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 32 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 33 List�ϐ��F l_MAX_LINE */
	public List l_MAX_LINE = null;

	/** �� 34 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 35 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 36 List�ϐ��F l_h_DAILY_WORK_REPORT_CTL_NO */
	public List l_h_DAILY_WORK_REPORT_CTL_NO = null;

	/** �� 37 List�ϐ��F l_l_SEQ_NO */
	public List l_l_SEQ_NO = null;

	/** �� 38 List�ϐ��F l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** �� 39 List�ϐ��F l_l_OPR_TYP */
	public List l_l_OPR_TYP = null;

	/** �� 40 List�ϐ��F l_l_UN_OPR_CAUSE_TYP */
	public List l_l_UN_OPR_CAUSE_TYP = null;

	/** �� 41 List�ϐ��F l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** �� 42 List�ϐ��F l_WORK_SHIFT_NAME */
	public List l_WORK_SHIFT_NAME = null;

	/** �� 43 List�ϐ��F l_WORK_SHIFT_CODE */
	public List l_WORK_SHIFT_CODE = null;

	/** �� 44 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 45 List�ϐ��F l_DAILY_WORK_REPORT_CTL_NO */
	public List l_DAILY_WORK_REPORT_CTL_NO = null;

	/** �� 46 List�ϐ��F l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** �� 47 List�ϐ��F l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** �� 48 List�ϐ��F l_START_TIME */
	public List l_START_TIME = null;

	/** �� 49 List�ϐ��F l_END_TIME */
	public List l_END_TIME = null;

	/** �� 50 List�ϐ��F l_OPR_TIME */
	public List l_OPR_TIME = null;

	/** �� 51 List�ϐ��F l_OPR_TYP */
	public List l_OPR_TYP = null;

	/** �� 52 List�ϐ��F l_UN_OPR_CAUSE_TYP */
	public List l_UN_OPR_CAUSE_TYP = null;

	/** �� 53 List�ϐ��F l_UN_OPR_TIME */
	public List l_UN_OPR_TIME = null;

	/** �� 54 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 55 List�ϐ��F l_TOTAL_OPR_TIME */
	public List l_TOTAL_OPR_TIME = null;

	/** �� 56 List�ϐ��F l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** �� 57 List�ϐ��F l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** �� 58 List�ϐ��F l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** �� 59 List�ϐ��F l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** �� 60 List�ϐ��F l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** �� 61 List�ϐ��F l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** �� 62 List�ϐ��F l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** �� 63 List�ϐ��F l_RETURN_MESSAGE */
	public List l_RETURN_MESSAGE = null;

	/** �� 64 List�ϐ��F l_RETURN_STATUS */
	public List l_RETURN_STATUS = null;

	/** �� 65 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 66 List�ϐ��F l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** �� 67 List�ϐ��F l_w_USER_CD */
	public List l_w_USER_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDAILY_WORK_REPORT_TYP_name() { return m_DAILY_WORK_REPORT_TYP_name; }
	public String getDAILY_WORK_REPORT_TYP_val() { return m_DAILY_WORK_REPORT_TYP_val; }
	public String getl_DAILY_WORK_REPORT_TYP_SHOW() { return m_l_DAILY_WORK_REPORT_TYP_SHOW; }
	public String getl_OPR_TYP_SHOW() { return m_l_OPR_TYP_SHOW; }
	public String getl_UN_OPR_CAUSE_TYP_SHOW() { return m_l_UN_OPR_CAUSE_TYP_SHOW; }
	public String getl_OPR_TYP_name() { return m_l_OPR_TYP_name; }
	public String getl_OPR_TYP_val() { return m_l_OPR_TYP_val; }
	public String getl_UN_OPR_CAUSE_TYP_name() { return m_l_UN_OPR_CAUSE_TYP_name; }
	public String getl_UN_OPR_CAUSE_TYP_val() { return m_l_UN_OPR_CAUSE_TYP_val; }
	public String geth_UpdateFlag() { return m_h_UpdateFlag; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String geth_l_DAILY_WORK_REPORT_TYP() { return m_h_l_DAILY_WORK_REPORT_TYP; }
	public String getl_USER_CD() { return m_l_USER_CD; }
	public String getl_OPR_DATE() { return m_l_OPR_DATE; }
	public String getl_WORK_SHIFT_CODE() { return m_l_WORK_SHIFT_CODE; }
	public String getl_START_TIME() { return m_l_START_TIME; }
	public String getl_END_TIME() { return m_l_END_TIME; }
	public String getl_OPR_TIME() { return m_l_OPR_TIME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String geth_l_OPR_TYP() { return m_h_l_OPR_TYP; }
	public String geth_l_UN_OPR_CAUSE_TYP() { return m_h_l_UN_OPR_CAUSE_TYP; }
	public String getl_UN_OPR_TIME() { return m_l_UN_OPR_TIME; }
	public String getl_DAILY_WORK_REPORT_CTL_NO() { return m_l_DAILY_WORK_REPORT_CTL_NO; }
	public String geth_l_SEQ_NO() { return m_h_l_SEQ_NO; }
	public String geth_l_MODIFY_COUNT() { return m_h_l_MODIFY_COUNT; }
	public String getUSER_PLANT_CD() { return m_USER_PLANT_CD; }
	public String getDAILY_WORK_REPORT_TYP() { return m_DAILY_WORK_REPORT_TYP; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getOPR_DATE_FROM() { return m_OPR_DATE_FROM; }
	public String getOPR_DATE_TO() { return m_OPR_DATE_TO; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getMAX_LINE() { return m_MAX_LINE; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String geth_DAILY_WORK_REPORT_CTL_NO() { return m_h_DAILY_WORK_REPORT_CTL_NO; }
	public String getl_SEQ_NO() { return m_l_SEQ_NO; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_OPR_TYP() { return m_l_OPR_TYP; }
	public String getl_UN_OPR_CAUSE_TYP() { return m_l_UN_OPR_CAUSE_TYP; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getWORK_SHIFT_NAME() { return m_WORK_SHIFT_NAME; }
	public String getWORK_SHIFT_CODE() { return m_WORK_SHIFT_CODE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getDAILY_WORK_REPORT_CTL_NO() { return m_DAILY_WORK_REPORT_CTL_NO; }
	public String getSEQ_NO() { return m_SEQ_NO; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getSTART_TIME() { return m_START_TIME; }
	public String getEND_TIME() { return m_END_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getOPR_TYP() { return m_OPR_TYP; }
	public String getUN_OPR_CAUSE_TYP() { return m_UN_OPR_CAUSE_TYP; }
	public String getUN_OPR_TIME() { return m_UN_OPR_TIME; }
	public String getREMARKS() { return m_REMARKS; }
	public String getTOTAL_OPR_TIME() { return m_TOTAL_OPR_TIME; }
	public String getPVC2LOGMODE() { return m_PVC2LOGMODE; }
	public String getPVC2OUTPUTMODE() { return m_PVC2OUTPUTMODE; }
	public String getPVC2OUTPUTPATH() { return m_PVC2OUTPUTPATH; }
	public String getPVC2OUTPUTNAME() { return m_PVC2OUTPUTNAME; }
	public String getPVC2USERID() { return m_PVC2USERID; }
	public String getPVC2BUSINESSNAME() { return m_PVC2BUSINESSNAME; }
	public String getPVC2PLANTCD() { return m_PVC2PLANTCD; }
	public String getRETURN_MESSAGE() { return m_RETURN_MESSAGE; }
	public String getRETURN_STATUS() { return m_RETURN_STATUS; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getw_USER_CD() { return m_w_USER_CD; }

	public List getList_DAILY_WORK_REPORT_TYP_name() { return l_DAILY_WORK_REPORT_TYP_name; }
	public List getList_DAILY_WORK_REPORT_TYP_val() { return l_DAILY_WORK_REPORT_TYP_val; }
	public List getList_l_DAILY_WORK_REPORT_TYP_SHOW() { return l_l_DAILY_WORK_REPORT_TYP_SHOW; }
	public List getList_l_OPR_TYP_SHOW() { return l_l_OPR_TYP_SHOW; }
	public List getList_l_UN_OPR_CAUSE_TYP_SHOW() { return l_l_UN_OPR_CAUSE_TYP_SHOW; }
	public List getList_l_OPR_TYP_name() { return l_l_OPR_TYP_name; }
	public List getList_l_OPR_TYP_val() { return l_l_OPR_TYP_val; }
	public List getList_l_UN_OPR_CAUSE_TYP_name() { return l_l_UN_OPR_CAUSE_TYP_name; }
	public List getList_l_UN_OPR_CAUSE_TYP_val() { return l_l_UN_OPR_CAUSE_TYP_val; }
	public List getList_h_UpdateFlag() { return l_h_UpdateFlag; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_h_l_DAILY_WORK_REPORT_TYP() { return l_h_l_DAILY_WORK_REPORT_TYP; }
	public List getList_l_USER_CD() { return l_l_USER_CD; }
	public List getList_l_OPR_DATE() { return l_l_OPR_DATE; }
	public List getList_l_WORK_SHIFT_CODE() { return l_l_WORK_SHIFT_CODE; }
	public List getList_l_START_TIME() { return l_l_START_TIME; }
	public List getList_l_END_TIME() { return l_l_END_TIME; }
	public List getList_l_OPR_TIME() { return l_l_OPR_TIME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_h_l_OPR_TYP() { return l_h_l_OPR_TYP; }
	public List getList_h_l_UN_OPR_CAUSE_TYP() { return l_h_l_UN_OPR_CAUSE_TYP; }
	public List getList_l_UN_OPR_TIME() { return l_l_UN_OPR_TIME; }
	public List getList_l_DAILY_WORK_REPORT_CTL_NO() { return l_l_DAILY_WORK_REPORT_CTL_NO; }
	public List getList_h_l_SEQ_NO() { return l_h_l_SEQ_NO; }
	public List getList_h_l_MODIFY_COUNT() { return l_h_l_MODIFY_COUNT; }
	public List getList_USER_PLANT_CD() { return l_USER_PLANT_CD; }
	public List getList_DAILY_WORK_REPORT_TYP() { return l_DAILY_WORK_REPORT_TYP; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_OPR_DATE_FROM() { return l_OPR_DATE_FROM; }
	public List getList_OPR_DATE_TO() { return l_OPR_DATE_TO; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_MAX_LINE() { return l_MAX_LINE; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_h_DAILY_WORK_REPORT_CTL_NO() { return l_h_DAILY_WORK_REPORT_CTL_NO; }
	public List getList_l_SEQ_NO() { return l_l_SEQ_NO; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_OPR_TYP() { return l_l_OPR_TYP; }
	public List getList_l_UN_OPR_CAUSE_TYP() { return l_l_UN_OPR_CAUSE_TYP; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_WORK_SHIFT_NAME() { return l_WORK_SHIFT_NAME; }
	public List getList_WORK_SHIFT_CODE() { return l_WORK_SHIFT_CODE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_DAILY_WORK_REPORT_CTL_NO() { return l_DAILY_WORK_REPORT_CTL_NO; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_START_TIME() { return l_START_TIME; }
	public List getList_END_TIME() { return l_END_TIME; }
	public List getList_OPR_TIME() { return l_OPR_TIME; }
	public List getList_OPR_TYP() { return l_OPR_TYP; }
	public List getList_UN_OPR_CAUSE_TYP() { return l_UN_OPR_CAUSE_TYP; }
	public List getList_UN_OPR_TIME() { return l_UN_OPR_TIME; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_TOTAL_OPR_TIME() { return l_TOTAL_OPR_TIME; }
	public List getList_PVC2LOGMODE() { return l_PVC2LOGMODE; }
	public List getList_PVC2OUTPUTMODE() { return l_PVC2OUTPUTMODE; }
	public List getList_PVC2OUTPUTPATH() { return l_PVC2OUTPUTPATH; }
	public List getList_PVC2OUTPUTNAME() { return l_PVC2OUTPUTNAME; }
	public List getList_PVC2USERID() { return l_PVC2USERID; }
	public List getList_PVC2BUSINESSNAME() { return l_PVC2BUSINESSNAME; }
	public List getList_PVC2PLANTCD() { return l_PVC2PLANTCD; }
	public List getList_RETURN_MESSAGE() { return l_RETURN_MESSAGE; }
	public List getList_RETURN_STATUS() { return l_RETURN_STATUS; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_w_USER_CD() { return l_w_USER_CD; }

	public void setDAILY_WORK_REPORT_TYP_name(String val) { m_DAILY_WORK_REPORT_TYP_name = val; }
	public void setDAILY_WORK_REPORT_TYP_val(String val) { m_DAILY_WORK_REPORT_TYP_val = val; }
	public void setl_DAILY_WORK_REPORT_TYP_SHOW(String val) { m_l_DAILY_WORK_REPORT_TYP_SHOW = val; }
	public void setl_OPR_TYP_SHOW(String val) { m_l_OPR_TYP_SHOW = val; }
	public void setl_UN_OPR_CAUSE_TYP_SHOW(String val) { m_l_UN_OPR_CAUSE_TYP_SHOW = val; }
	public void setl_OPR_TYP_name(String val) { m_l_OPR_TYP_name = val; }
	public void setl_OPR_TYP_val(String val) { m_l_OPR_TYP_val = val; }
	public void setl_UN_OPR_CAUSE_TYP_name(String val) { m_l_UN_OPR_CAUSE_TYP_name = val; }
	public void setl_UN_OPR_CAUSE_TYP_val(String val) { m_l_UN_OPR_CAUSE_TYP_val = val; }
	public void seth_UpdateFlag(String val) { m_h_UpdateFlag = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void seth_l_DAILY_WORK_REPORT_TYP(String val) { m_h_l_DAILY_WORK_REPORT_TYP = val; }
	public void setl_USER_CD(String val) { m_l_USER_CD = val; }
	public void setl_OPR_DATE(String val) { m_l_OPR_DATE = val; }
	public void setl_WORK_SHIFT_CODE(String val) { m_l_WORK_SHIFT_CODE = val; }
	public void setl_START_TIME(String val) { m_l_START_TIME = val; }
	public void setl_END_TIME(String val) { m_l_END_TIME = val; }
	public void setl_OPR_TIME(String val) { m_l_OPR_TIME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void seth_l_OPR_TYP(String val) { m_h_l_OPR_TYP = val; }
	public void seth_l_UN_OPR_CAUSE_TYP(String val) { m_h_l_UN_OPR_CAUSE_TYP = val; }
	public void setl_UN_OPR_TIME(String val) { m_l_UN_OPR_TIME = val; }
	public void setl_DAILY_WORK_REPORT_CTL_NO(String val) { m_l_DAILY_WORK_REPORT_CTL_NO = val; }
	public void seth_l_SEQ_NO(String val) { m_h_l_SEQ_NO = val; }
	public void seth_l_MODIFY_COUNT(String val) { m_h_l_MODIFY_COUNT = val; }
	public void setUSER_PLANT_CD(String val) { m_USER_PLANT_CD = val; }
	public void setDAILY_WORK_REPORT_TYP(String val) { m_DAILY_WORK_REPORT_TYP = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setOPR_DATE_FROM(String val) { m_OPR_DATE_FROM = val; }
	public void setOPR_DATE_TO(String val) { m_OPR_DATE_TO = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setMAX_LINE(String val) { m_MAX_LINE = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void seth_DAILY_WORK_REPORT_CTL_NO(String val) { m_h_DAILY_WORK_REPORT_CTL_NO = val; }
	public void setl_SEQ_NO(String val) { m_l_SEQ_NO = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_OPR_TYP(String val) { m_l_OPR_TYP = val; }
	public void setl_UN_OPR_CAUSE_TYP(String val) { m_l_UN_OPR_CAUSE_TYP = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setWORK_SHIFT_NAME(String val) { m_WORK_SHIFT_NAME = val; }
	public void setWORK_SHIFT_CODE(String val) { m_WORK_SHIFT_CODE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setDAILY_WORK_REPORT_CTL_NO(String val) { m_DAILY_WORK_REPORT_CTL_NO = val; }
	public void setSEQ_NO(String val) { m_SEQ_NO = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setSTART_TIME(String val) { m_START_TIME = val; }
	public void setEND_TIME(String val) { m_END_TIME = val; }
	public void setOPR_TIME(String val) { m_OPR_TIME = val; }
	public void setOPR_TYP(String val) { m_OPR_TYP = val; }
	public void setUN_OPR_CAUSE_TYP(String val) { m_UN_OPR_CAUSE_TYP = val; }
	public void setUN_OPR_TIME(String val) { m_UN_OPR_TIME = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setTOTAL_OPR_TIME(String val) { m_TOTAL_OPR_TIME = val; }
	public void setPVC2LOGMODE(String val) { m_PVC2LOGMODE = val; }
	public void setPVC2OUTPUTMODE(String val) { m_PVC2OUTPUTMODE = val; }
	public void setPVC2OUTPUTPATH(String val) { m_PVC2OUTPUTPATH = val; }
	public void setPVC2OUTPUTNAME(String val) { m_PVC2OUTPUTNAME = val; }
	public void setPVC2USERID(String val) { m_PVC2USERID = val; }
	public void setPVC2BUSINESSNAME(String val) { m_PVC2BUSINESSNAME = val; }
	public void setPVC2PLANTCD(String val) { m_PVC2PLANTCD = val; }
	public void setRETURN_MESSAGE(String val) { m_RETURN_MESSAGE = val; }
	public void setRETURN_STATUS(String val) { m_RETURN_STATUS = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = val; }
	public void setw_USER_CD(String val) { m_w_USER_CD = val; }


	public void setList_DAILY_WORK_REPORT_TYP_name(List list) { l_DAILY_WORK_REPORT_TYP_name = list; }
	public void setList_DAILY_WORK_REPORT_TYP_val(List list) { l_DAILY_WORK_REPORT_TYP_val = list; }
	public void setList_l_DAILY_WORK_REPORT_TYP_SHOW(List list) { l_l_DAILY_WORK_REPORT_TYP_SHOW = list; }
	public void setList_l_OPR_TYP_SHOW(List list) { l_l_OPR_TYP_SHOW = list; }
	public void setList_l_UN_OPR_CAUSE_TYP_SHOW(List list) { l_l_UN_OPR_CAUSE_TYP_SHOW = list; }
	public void setList_l_OPR_TYP_name(List list) { l_l_OPR_TYP_name = list; }
	public void setList_l_OPR_TYP_val(List list) { l_l_OPR_TYP_val = list; }
	public void setList_l_UN_OPR_CAUSE_TYP_name(List list) { l_l_UN_OPR_CAUSE_TYP_name = list; }
	public void setList_l_UN_OPR_CAUSE_TYP_val(List list) { l_l_UN_OPR_CAUSE_TYP_val = list; }
	public void setList_h_UpdateFlag(List list) { l_h_UpdateFlag = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_h_l_DAILY_WORK_REPORT_TYP(List list) { l_h_l_DAILY_WORK_REPORT_TYP = list; }
	public void setList_l_USER_CD(List list) { l_l_USER_CD = list; }
	public void setList_l_OPR_DATE(List list) { l_l_OPR_DATE = list; }
	public void setList_l_WORK_SHIFT_CODE(List list) { l_l_WORK_SHIFT_CODE = list; }
	public void setList_l_START_TIME(List list) { l_l_START_TIME = list; }
	public void setList_l_END_TIME(List list) { l_l_END_TIME = list; }
	public void setList_l_OPR_TIME(List list) { l_l_OPR_TIME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_h_l_OPR_TYP(List list) { l_h_l_OPR_TYP = list; }
	public void setList_h_l_UN_OPR_CAUSE_TYP(List list) { l_h_l_UN_OPR_CAUSE_TYP = list; }
	public void setList_l_UN_OPR_TIME(List list) { l_l_UN_OPR_TIME = list; }
	public void setList_l_DAILY_WORK_REPORT_CTL_NO(List list) { l_l_DAILY_WORK_REPORT_CTL_NO = list; }
	public void setList_h_l_SEQ_NO(List list) { l_h_l_SEQ_NO = list; }
	public void setList_h_l_MODIFY_COUNT(List list) { l_h_l_MODIFY_COUNT = list; }
	public void setList_USER_PLANT_CD(List list) { l_USER_PLANT_CD = list; }
	public void setList_DAILY_WORK_REPORT_TYP(List list) { l_DAILY_WORK_REPORT_TYP = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_OPR_DATE_FROM(List list) { l_OPR_DATE_FROM = list; }
	public void setList_OPR_DATE_TO(List list) { l_OPR_DATE_TO = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_MAX_LINE(List list) { l_MAX_LINE = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_h_DAILY_WORK_REPORT_CTL_NO(List list) { l_h_DAILY_WORK_REPORT_CTL_NO = list; }
	public void setList_l_SEQ_NO(List list) { l_l_SEQ_NO = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_OPR_TYP(List list) { l_l_OPR_TYP = list; }
	public void setList_l_UN_OPR_CAUSE_TYP(List list) { l_l_UN_OPR_CAUSE_TYP = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_WORK_SHIFT_NAME(List list) { l_WORK_SHIFT_NAME = list; }
	public void setList_WORK_SHIFT_CODE(List list) { l_WORK_SHIFT_CODE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_DAILY_WORK_REPORT_CTL_NO(List list) { l_DAILY_WORK_REPORT_CTL_NO = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_START_TIME(List list) { l_START_TIME = list; }
	public void setList_END_TIME(List list) { l_END_TIME = list; }
	public void setList_OPR_TIME(List list) { l_OPR_TIME = list; }
	public void setList_OPR_TYP(List list) { l_OPR_TYP = list; }
	public void setList_UN_OPR_CAUSE_TYP(List list) { l_UN_OPR_CAUSE_TYP = list; }
	public void setList_UN_OPR_TIME(List list) { l_UN_OPR_TIME = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_TOTAL_OPR_TIME(List list) { l_TOTAL_OPR_TIME = list; }
	public void setList_PVC2LOGMODE(List list) { l_PVC2LOGMODE = list; }
	public void setList_PVC2OUTPUTMODE(List list) { l_PVC2OUTPUTMODE = list; }
	public void setList_PVC2OUTPUTPATH(List list) { l_PVC2OUTPUTPATH = list; }
	public void setList_PVC2OUTPUTNAME(List list) { l_PVC2OUTPUTNAME = list; }
	public void setList_PVC2USERID(List list) { l_PVC2USERID = list; }
	public void setList_PVC2BUSINESSNAME(List list) { l_PVC2BUSINESSNAME = list; }
	public void setList_PVC2PLANTCD(List list) { l_PVC2PLANTCD = list; }
	public void setList_RETURN_MESSAGE(List list) { l_RETURN_MESSAGE = list; }
	public void setList_RETURN_STATUS(List list) { l_RETURN_STATUS = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_w_USER_CD(List list) { l_w_USER_CD = list; }

	public int setL2L_DAILY_WORK_REPORT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_TYP_name == null) {
			l_DAILY_WORK_REPORT_TYP_name = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_TYP_name.add(((AD0130010Struct) list.get(i)).getDAILY_WORK_REPORT_TYP_name());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_TYP_val == null) {
			l_DAILY_WORK_REPORT_TYP_val = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_TYP_val.add(((AD0130010Struct) list.get(i)).getDAILY_WORK_REPORT_TYP_val());
		}
		return size;
	}
	public int setL2L_l_DAILY_WORK_REPORT_TYP_SHOW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DAILY_WORK_REPORT_TYP_SHOW == null) {
			l_l_DAILY_WORK_REPORT_TYP_SHOW = new ArrayList();
		} else {
			l_l_DAILY_WORK_REPORT_TYP_SHOW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DAILY_WORK_REPORT_TYP_SHOW.add(((AD0130010Struct) list.get(i)).getl_DAILY_WORK_REPORT_TYP_SHOW());
		}
		return size;
	}
	public int setL2L_l_OPR_TYP_SHOW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_TYP_SHOW == null) {
			l_l_OPR_TYP_SHOW = new ArrayList();
		} else {
			l_l_OPR_TYP_SHOW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_TYP_SHOW.add(((AD0130010Struct) list.get(i)).getl_OPR_TYP_SHOW());
		}
		return size;
	}
	public int setL2L_l_UN_OPR_CAUSE_TYP_SHOW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UN_OPR_CAUSE_TYP_SHOW == null) {
			l_l_UN_OPR_CAUSE_TYP_SHOW = new ArrayList();
		} else {
			l_l_UN_OPR_CAUSE_TYP_SHOW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UN_OPR_CAUSE_TYP_SHOW.add(((AD0130010Struct) list.get(i)).getl_UN_OPR_CAUSE_TYP_SHOW());
		}
		return size;
	}
	public int setL2L_l_OPR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_TYP_name == null) {
			l_l_OPR_TYP_name = new ArrayList();
		} else {
			l_l_OPR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_TYP_name.add(((AD0130010Struct) list.get(i)).getl_OPR_TYP_name());
		}
		return size;
	}
	public int setL2L_l_OPR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_TYP_val == null) {
			l_l_OPR_TYP_val = new ArrayList();
		} else {
			l_l_OPR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_TYP_val.add(((AD0130010Struct) list.get(i)).getl_OPR_TYP_val());
		}
		return size;
	}
	public int setL2L_l_UN_OPR_CAUSE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UN_OPR_CAUSE_TYP_name == null) {
			l_l_UN_OPR_CAUSE_TYP_name = new ArrayList();
		} else {
			l_l_UN_OPR_CAUSE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UN_OPR_CAUSE_TYP_name.add(((AD0130010Struct) list.get(i)).getl_UN_OPR_CAUSE_TYP_name());
		}
		return size;
	}
	public int setL2L_l_UN_OPR_CAUSE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UN_OPR_CAUSE_TYP_val == null) {
			l_l_UN_OPR_CAUSE_TYP_val = new ArrayList();
		} else {
			l_l_UN_OPR_CAUSE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UN_OPR_CAUSE_TYP_val.add(((AD0130010Struct) list.get(i)).getl_UN_OPR_CAUSE_TYP_val());
		}
		return size;
	}
	public int setL2L_h_UpdateFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UpdateFlag == null) {
			l_h_UpdateFlag = new ArrayList();
		} else {
			l_h_UpdateFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UpdateFlag.add(((AD0130010Struct) list.get(i)).geth_UpdateFlag());
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
			l_l_PLANT_CD.add(((AD0130010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_l_DAILY_WORK_REPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_DAILY_WORK_REPORT_TYP == null) {
			l_h_l_DAILY_WORK_REPORT_TYP = new ArrayList();
		} else {
			l_h_l_DAILY_WORK_REPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_DAILY_WORK_REPORT_TYP.add(((AD0130010Struct) list.get(i)).geth_l_DAILY_WORK_REPORT_TYP());
		}
		return size;
	}
	public int setL2L_l_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_CD == null) {
			l_l_USER_CD = new ArrayList();
		} else {
			l_l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_CD.add(((AD0130010Struct) list.get(i)).getl_USER_CD());
		}
		return size;
	}
	public int setL2L_l_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_DATE == null) {
			l_l_OPR_DATE = new ArrayList();
		} else {
			l_l_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_DATE.add(((AD0130010Struct) list.get(i)).getl_OPR_DATE());
		}
		return size;
	}
	public int setL2L_l_WORK_SHIFT_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_SHIFT_CODE == null) {
			l_l_WORK_SHIFT_CODE = new ArrayList();
		} else {
			l_l_WORK_SHIFT_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_SHIFT_CODE.add(((AD0130010Struct) list.get(i)).getl_WORK_SHIFT_CODE());
		}
		return size;
	}
	public int setL2L_l_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_START_TIME == null) {
			l_l_START_TIME = new ArrayList();
		} else {
			l_l_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_START_TIME.add(((AD0130010Struct) list.get(i)).getl_START_TIME());
		}
		return size;
	}
	public int setL2L_l_END_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_END_TIME == null) {
			l_l_END_TIME = new ArrayList();
		} else {
			l_l_END_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_END_TIME.add(((AD0130010Struct) list.get(i)).getl_END_TIME());
		}
		return size;
	}
	public int setL2L_l_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_TIME == null) {
			l_l_OPR_TIME = new ArrayList();
		} else {
			l_l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_TIME.add(((AD0130010Struct) list.get(i)).getl_OPR_TIME());
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
			l_l_WS_CD.add(((AD0130010Struct) list.get(i)).getl_WS_CD());
		}
		return size;
	}
	public int setL2L_h_l_OPR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_OPR_TYP == null) {
			l_h_l_OPR_TYP = new ArrayList();
		} else {
			l_h_l_OPR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_OPR_TYP.add(((AD0130010Struct) list.get(i)).geth_l_OPR_TYP());
		}
		return size;
	}
	public int setL2L_h_l_UN_OPR_CAUSE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_UN_OPR_CAUSE_TYP == null) {
			l_h_l_UN_OPR_CAUSE_TYP = new ArrayList();
		} else {
			l_h_l_UN_OPR_CAUSE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_UN_OPR_CAUSE_TYP.add(((AD0130010Struct) list.get(i)).geth_l_UN_OPR_CAUSE_TYP());
		}
		return size;
	}
	public int setL2L_l_UN_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UN_OPR_TIME == null) {
			l_l_UN_OPR_TIME = new ArrayList();
		} else {
			l_l_UN_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UN_OPR_TIME.add(((AD0130010Struct) list.get(i)).getl_UN_OPR_TIME());
		}
		return size;
	}
	public int setL2L_l_DAILY_WORK_REPORT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DAILY_WORK_REPORT_CTL_NO == null) {
			l_l_DAILY_WORK_REPORT_CTL_NO = new ArrayList();
		} else {
			l_l_DAILY_WORK_REPORT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DAILY_WORK_REPORT_CTL_NO.add(((AD0130010Struct) list.get(i)).getl_DAILY_WORK_REPORT_CTL_NO());
		}
		return size;
	}
	public int setL2L_h_l_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_l_SEQ_NO == null) {
			l_h_l_SEQ_NO = new ArrayList();
		} else {
			l_h_l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_l_SEQ_NO.add(((AD0130010Struct) list.get(i)).geth_l_SEQ_NO());
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
			l_h_l_MODIFY_COUNT.add(((AD0130010Struct) list.get(i)).geth_l_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_USER_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_PLANT_CD == null) {
			l_USER_PLANT_CD = new ArrayList();
		} else {
			l_USER_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_PLANT_CD.add(((AD0130010Struct) list.get(i)).getUSER_PLANT_CD());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_TYP == null) {
			l_DAILY_WORK_REPORT_TYP = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_TYP.add(((AD0130010Struct) list.get(i)).getDAILY_WORK_REPORT_TYP());
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
			l_PLANT_CD.add(((AD0130010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_OPR_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE_FROM == null) {
			l_OPR_DATE_FROM = new ArrayList();
		} else {
			l_OPR_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE_FROM.add(((AD0130010Struct) list.get(i)).getOPR_DATE_FROM());
		}
		return size;
	}
	public int setL2L_OPR_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE_TO == null) {
			l_OPR_DATE_TO = new ArrayList();
		} else {
			l_OPR_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE_TO.add(((AD0130010Struct) list.get(i)).getOPR_DATE_TO());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AD0130010Struct) list.get(i)).getUSER_CD());
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
			l_WS_CD.add(((AD0130010Struct) list.get(i)).getWS_CD());
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
			l_MAX_LINE.add(((AD0130010Struct) list.get(i)).getMAX_LINE());
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
			l_PLANT_NAME.add(((AD0130010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((AD0130010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_h_DAILY_WORK_REPORT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DAILY_WORK_REPORT_CTL_NO == null) {
			l_h_DAILY_WORK_REPORT_CTL_NO = new ArrayList();
		} else {
			l_h_DAILY_WORK_REPORT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DAILY_WORK_REPORT_CTL_NO.add(((AD0130010Struct) list.get(i)).geth_DAILY_WORK_REPORT_CTL_NO());
		}
		return size;
	}
	public int setL2L_l_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SEQ_NO == null) {
			l_l_SEQ_NO = new ArrayList();
		} else {
			l_l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SEQ_NO.add(((AD0130010Struct) list.get(i)).getl_SEQ_NO());
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
			l_l_WS_NAME.add(((AD0130010Struct) list.get(i)).getl_WS_NAME());
		}
		return size;
	}
	public int setL2L_l_OPR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_TYP == null) {
			l_l_OPR_TYP = new ArrayList();
		} else {
			l_l_OPR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_TYP.add(((AD0130010Struct) list.get(i)).getl_OPR_TYP());
		}
		return size;
	}
	public int setL2L_l_UN_OPR_CAUSE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UN_OPR_CAUSE_TYP == null) {
			l_l_UN_OPR_CAUSE_TYP = new ArrayList();
		} else {
			l_l_UN_OPR_CAUSE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UN_OPR_CAUSE_TYP.add(((AD0130010Struct) list.get(i)).getl_UN_OPR_CAUSE_TYP());
		}
		return size;
	}
	public int setL2L_l_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMARKS == null) {
			l_l_REMARKS = new ArrayList();
		} else {
			l_l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMARKS.add(((AD0130010Struct) list.get(i)).getl_REMARKS());
		}
		return size;
	}
	public int setL2L_WORK_SHIFT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_SHIFT_NAME == null) {
			l_WORK_SHIFT_NAME = new ArrayList();
		} else {
			l_WORK_SHIFT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_SHIFT_NAME.add(((AD0130010Struct) list.get(i)).getWORK_SHIFT_NAME());
		}
		return size;
	}
	public int setL2L_WORK_SHIFT_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_SHIFT_CODE == null) {
			l_WORK_SHIFT_CODE = new ArrayList();
		} else {
			l_WORK_SHIFT_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_SHIFT_CODE.add(((AD0130010Struct) list.get(i)).getWORK_SHIFT_CODE());
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
			l_MODIFY_COUNT.add(((AD0130010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_DAILY_WORK_REPORT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DAILY_WORK_REPORT_CTL_NO == null) {
			l_DAILY_WORK_REPORT_CTL_NO = new ArrayList();
		} else {
			l_DAILY_WORK_REPORT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DAILY_WORK_REPORT_CTL_NO.add(((AD0130010Struct) list.get(i)).getDAILY_WORK_REPORT_CTL_NO());
		}
		return size;
	}
	public int setL2L_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEQ_NO == null) {
			l_SEQ_NO = new ArrayList();
		} else {
			l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEQ_NO.add(((AD0130010Struct) list.get(i)).getSEQ_NO());
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
			l_OPR_DATE.add(((AD0130010Struct) list.get(i)).getOPR_DATE());
		}
		return size;
	}
	public int setL2L_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME == null) {
			l_START_TIME = new ArrayList();
		} else {
			l_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME.add(((AD0130010Struct) list.get(i)).getSTART_TIME());
		}
		return size;
	}
	public int setL2L_END_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_TIME == null) {
			l_END_TIME = new ArrayList();
		} else {
			l_END_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_TIME.add(((AD0130010Struct) list.get(i)).getEND_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME == null) {
			l_OPR_TIME = new ArrayList();
		} else {
			l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME.add(((AD0130010Struct) list.get(i)).getOPR_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TYP == null) {
			l_OPR_TYP = new ArrayList();
		} else {
			l_OPR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TYP.add(((AD0130010Struct) list.get(i)).getOPR_TYP());
		}
		return size;
	}
	public int setL2L_UN_OPR_CAUSE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_CAUSE_TYP == null) {
			l_UN_OPR_CAUSE_TYP = new ArrayList();
		} else {
			l_UN_OPR_CAUSE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_CAUSE_TYP.add(((AD0130010Struct) list.get(i)).getUN_OPR_CAUSE_TYP());
		}
		return size;
	}
	public int setL2L_UN_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UN_OPR_TIME == null) {
			l_UN_OPR_TIME = new ArrayList();
		} else {
			l_UN_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UN_OPR_TIME.add(((AD0130010Struct) list.get(i)).getUN_OPR_TIME());
		}
		return size;
	}
	public int setL2L_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS == null) {
			l_REMARKS = new ArrayList();
		} else {
			l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS.add(((AD0130010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_TOTAL_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_OPR_TIME == null) {
			l_TOTAL_OPR_TIME = new ArrayList();
		} else {
			l_TOTAL_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_OPR_TIME.add(((AD0130010Struct) list.get(i)).getTOTAL_OPR_TIME());
		}
		return size;
	}
	public int setL2L_PVC2LOGMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2LOGMODE == null) {
			l_PVC2LOGMODE = new ArrayList();
		} else {
			l_PVC2LOGMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2LOGMODE.add(((AD0130010Struct) list.get(i)).getPVC2LOGMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTMODE == null) {
			l_PVC2OUTPUTMODE = new ArrayList();
		} else {
			l_PVC2OUTPUTMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTMODE.add(((AD0130010Struct) list.get(i)).getPVC2OUTPUTMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTPATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTPATH == null) {
			l_PVC2OUTPUTPATH = new ArrayList();
		} else {
			l_PVC2OUTPUTPATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTPATH.add(((AD0130010Struct) list.get(i)).getPVC2OUTPUTPATH());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTNAME == null) {
			l_PVC2OUTPUTNAME = new ArrayList();
		} else {
			l_PVC2OUTPUTNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTNAME.add(((AD0130010Struct) list.get(i)).getPVC2OUTPUTNAME());
		}
		return size;
	}
	public int setL2L_PVC2USERID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2USERID == null) {
			l_PVC2USERID = new ArrayList();
		} else {
			l_PVC2USERID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2USERID.add(((AD0130010Struct) list.get(i)).getPVC2USERID());
		}
		return size;
	}
	public int setL2L_PVC2BUSINESSNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BUSINESSNAME == null) {
			l_PVC2BUSINESSNAME = new ArrayList();
		} else {
			l_PVC2BUSINESSNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BUSINESSNAME.add(((AD0130010Struct) list.get(i)).getPVC2BUSINESSNAME());
		}
		return size;
	}
	public int setL2L_PVC2PLANTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2PLANTCD == null) {
			l_PVC2PLANTCD = new ArrayList();
		} else {
			l_PVC2PLANTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2PLANTCD.add(((AD0130010Struct) list.get(i)).getPVC2PLANTCD());
		}
		return size;
	}
	public int setL2L_RETURN_MESSAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURN_MESSAGE == null) {
			l_RETURN_MESSAGE = new ArrayList();
		} else {
			l_RETURN_MESSAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURN_MESSAGE.add(((AD0130010Struct) list.get(i)).getRETURN_MESSAGE());
		}
		return size;
	}
	public int setL2L_RETURN_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURN_STATUS == null) {
			l_RETURN_STATUS = new ArrayList();
		} else {
			l_RETURN_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURN_STATUS.add(((AD0130010Struct) list.get(i)).getRETURN_STATUS());
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
			l_WS_NAME.add(((AD0130010Struct) list.get(i)).getWS_NAME());
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
			l_HOLIDAY_FLG.add(((AD0130010Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_w_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_USER_CD == null) {
			l_w_USER_CD = new ArrayList();
		} else {
			l_w_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_USER_CD.add(((AD0130010Struct) list.get(i)).getw_USER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DAILY_WORK_REPORT_TYP_name = null;
		m_DAILY_WORK_REPORT_TYP_val = null;
		m_l_DAILY_WORK_REPORT_TYP_SHOW = null;
		m_l_OPR_TYP_SHOW = null;
		m_l_UN_OPR_CAUSE_TYP_SHOW = null;
		m_l_OPR_TYP_name = null;
		m_l_OPR_TYP_val = null;
		m_l_UN_OPR_CAUSE_TYP_name = null;
		m_l_UN_OPR_CAUSE_TYP_val = null;
		m_h_UpdateFlag = null;
		m_l_PLANT_CD = null;
		m_h_l_DAILY_WORK_REPORT_TYP = null;
		m_l_USER_CD = null;
		m_l_OPR_DATE = null;
		m_l_WORK_SHIFT_CODE = null;
		m_l_START_TIME = null;
		m_l_END_TIME = null;
		m_l_OPR_TIME = null;
		m_l_WS_CD = null;
		m_h_l_OPR_TYP = null;
		m_h_l_UN_OPR_CAUSE_TYP = null;
		m_l_UN_OPR_TIME = null;
		m_l_DAILY_WORK_REPORT_CTL_NO = null;
		m_h_l_SEQ_NO = null;
		m_h_l_MODIFY_COUNT = null;
		m_USER_PLANT_CD = null;
		m_DAILY_WORK_REPORT_TYP = null;
		m_PLANT_CD = null;
		m_OPR_DATE_FROM = null;
		m_OPR_DATE_TO = null;
		m_USER_CD = null;
		m_WS_CD = null;
		m_MAX_LINE = null;
		m_PLANT_NAME = null;
		m_USER_NAME = null;
		m_h_DAILY_WORK_REPORT_CTL_NO = null;
		m_l_SEQ_NO = null;
		m_l_WS_NAME = null;
		m_l_OPR_TYP = null;
		m_l_UN_OPR_CAUSE_TYP = null;
		m_l_REMARKS = null;
		m_WORK_SHIFT_NAME = null;
		m_WORK_SHIFT_CODE = null;
		m_MODIFY_COUNT = null;
		m_DAILY_WORK_REPORT_CTL_NO = null;
		m_SEQ_NO = null;
		m_OPR_DATE = null;
		m_START_TIME = null;
		m_END_TIME = null;
		m_OPR_TIME = null;
		m_OPR_TYP = null;
		m_UN_OPR_CAUSE_TYP = null;
		m_UN_OPR_TIME = null;
		m_REMARKS = null;
		m_TOTAL_OPR_TIME = null;
		m_PVC2LOGMODE = null;
		m_PVC2OUTPUTMODE = null;
		m_PVC2OUTPUTPATH = null;
		m_PVC2OUTPUTNAME = null;
		m_PVC2USERID = null;
		m_PVC2BUSINESSNAME = null;
		m_PVC2PLANTCD = null;
		m_RETURN_MESSAGE = null;
		m_RETURN_STATUS = null;
		m_WS_NAME = null;
		m_HOLIDAY_FLG = null;
		m_w_USER_CD = null;

		l_DAILY_WORK_REPORT_TYP_name = null;
		l_DAILY_WORK_REPORT_TYP_val = null;
		l_l_DAILY_WORK_REPORT_TYP_SHOW = null;
		l_l_OPR_TYP_SHOW = null;
		l_l_UN_OPR_CAUSE_TYP_SHOW = null;
		l_l_OPR_TYP_name = null;
		l_l_OPR_TYP_val = null;
		l_l_UN_OPR_CAUSE_TYP_name = null;
		l_l_UN_OPR_CAUSE_TYP_val = null;
		l_h_UpdateFlag = null;
		l_l_PLANT_CD = null;
		l_h_l_DAILY_WORK_REPORT_TYP = null;
		l_l_USER_CD = null;
		l_l_OPR_DATE = null;
		l_l_WORK_SHIFT_CODE = null;
		l_l_START_TIME = null;
		l_l_END_TIME = null;
		l_l_OPR_TIME = null;
		l_l_WS_CD = null;
		l_h_l_OPR_TYP = null;
		l_h_l_UN_OPR_CAUSE_TYP = null;
		l_l_UN_OPR_TIME = null;
		l_l_DAILY_WORK_REPORT_CTL_NO = null;
		l_h_l_SEQ_NO = null;
		l_h_l_MODIFY_COUNT = null;
		l_USER_PLANT_CD = null;
		l_DAILY_WORK_REPORT_TYP = null;
		l_PLANT_CD = null;
		l_OPR_DATE_FROM = null;
		l_OPR_DATE_TO = null;
		l_USER_CD = null;
		l_WS_CD = null;
		l_MAX_LINE = null;
		l_PLANT_NAME = null;
		l_USER_NAME = null;
		l_h_DAILY_WORK_REPORT_CTL_NO = null;
		l_l_SEQ_NO = null;
		l_l_WS_NAME = null;
		l_l_OPR_TYP = null;
		l_l_UN_OPR_CAUSE_TYP = null;
		l_l_REMARKS = null;
		l_WORK_SHIFT_NAME = null;
		l_WORK_SHIFT_CODE = null;
		l_MODIFY_COUNT = null;
		l_DAILY_WORK_REPORT_CTL_NO = null;
		l_SEQ_NO = null;
		l_OPR_DATE = null;
		l_START_TIME = null;
		l_END_TIME = null;
		l_OPR_TIME = null;
		l_OPR_TYP = null;
		l_UN_OPR_CAUSE_TYP = null;
		l_UN_OPR_TIME = null;
		l_REMARKS = null;
		l_TOTAL_OPR_TIME = null;
		l_PVC2LOGMODE = null;
		l_PVC2OUTPUTMODE = null;
		l_PVC2OUTPUTPATH = null;
		l_PVC2OUTPUTNAME = null;
		l_PVC2USERID = null;
		l_PVC2BUSINESSNAME = null;
		l_PVC2PLANTCD = null;
		l_RETURN_MESSAGE = null;
		l_RETURN_STATUS = null;
		l_WS_NAME = null;
		l_HOLIDAY_FLG = null;
		l_w_USER_CD = null;

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
	 * medAD0130010�N���X�̕W���R���X�g���N�^
	 */
	public AD0130010Struct()
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
	public void setStruct(AD0130010Struct struct)
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
	public void setStructM(AD0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDAILY_WORK_REPORT_TYP_name(struct.getDAILY_WORK_REPORT_TYP_name());
			this.setDAILY_WORK_REPORT_TYP_val(struct.getDAILY_WORK_REPORT_TYP_val());
			this.setl_DAILY_WORK_REPORT_TYP_SHOW(struct.getl_DAILY_WORK_REPORT_TYP_SHOW());
			this.setl_OPR_TYP_SHOW(struct.getl_OPR_TYP_SHOW());
			this.setl_UN_OPR_CAUSE_TYP_SHOW(struct.getl_UN_OPR_CAUSE_TYP_SHOW());
			this.setl_OPR_TYP_name(struct.getl_OPR_TYP_name());
			this.setl_OPR_TYP_val(struct.getl_OPR_TYP_val());
			this.setl_UN_OPR_CAUSE_TYP_name(struct.getl_UN_OPR_CAUSE_TYP_name());
			this.setl_UN_OPR_CAUSE_TYP_val(struct.getl_UN_OPR_CAUSE_TYP_val());
			this.seth_UpdateFlag(struct.geth_UpdateFlag());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.seth_l_DAILY_WORK_REPORT_TYP(struct.geth_l_DAILY_WORK_REPORT_TYP());
			this.setl_USER_CD(struct.getl_USER_CD());
			this.setl_OPR_DATE(struct.getl_OPR_DATE());
			this.setl_WORK_SHIFT_CODE(struct.getl_WORK_SHIFT_CODE());
			this.setl_START_TIME(struct.getl_START_TIME());
			this.setl_END_TIME(struct.getl_END_TIME());
			this.setl_OPR_TIME(struct.getl_OPR_TIME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.seth_l_OPR_TYP(struct.geth_l_OPR_TYP());
			this.seth_l_UN_OPR_CAUSE_TYP(struct.geth_l_UN_OPR_CAUSE_TYP());
			this.setl_UN_OPR_TIME(struct.getl_UN_OPR_TIME());
			this.setl_DAILY_WORK_REPORT_CTL_NO(struct.getl_DAILY_WORK_REPORT_CTL_NO());
			this.seth_l_SEQ_NO(struct.geth_l_SEQ_NO());
			this.seth_l_MODIFY_COUNT(struct.geth_l_MODIFY_COUNT());
			this.setUSER_PLANT_CD(struct.getUSER_PLANT_CD());
			this.setDAILY_WORK_REPORT_TYP(struct.getDAILY_WORK_REPORT_TYP());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setOPR_DATE_FROM(struct.getOPR_DATE_FROM());
			this.setOPR_DATE_TO(struct.getOPR_DATE_TO());
			this.setUSER_CD(struct.getUSER_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setMAX_LINE(struct.getMAX_LINE());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.seth_DAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
			this.setl_SEQ_NO(struct.getl_SEQ_NO());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_OPR_TYP(struct.getl_OPR_TYP());
			this.setl_UN_OPR_CAUSE_TYP(struct.getl_UN_OPR_CAUSE_TYP());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setWORK_SHIFT_NAME(struct.getWORK_SHIFT_NAME());
			this.setWORK_SHIFT_CODE(struct.getWORK_SHIFT_CODE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setDAILY_WORK_REPORT_CTL_NO(struct.getDAILY_WORK_REPORT_CTL_NO());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setSTART_TIME(struct.getSTART_TIME());
			this.setEND_TIME(struct.getEND_TIME());
			this.setOPR_TIME(struct.getOPR_TIME());
			this.setOPR_TYP(struct.getOPR_TYP());
			this.setUN_OPR_CAUSE_TYP(struct.getUN_OPR_CAUSE_TYP());
			this.setUN_OPR_TIME(struct.getUN_OPR_TIME());
			this.setREMARKS(struct.getREMARKS());
			this.setTOTAL_OPR_TIME(struct.getTOTAL_OPR_TIME());
			this.setPVC2LOGMODE(struct.getPVC2LOGMODE());
			this.setPVC2OUTPUTMODE(struct.getPVC2OUTPUTMODE());
			this.setPVC2OUTPUTPATH(struct.getPVC2OUTPUTPATH());
			this.setPVC2OUTPUTNAME(struct.getPVC2OUTPUTNAME());
			this.setPVC2USERID(struct.getPVC2USERID());
			this.setPVC2BUSINESSNAME(struct.getPVC2BUSINESSNAME());
			this.setPVC2PLANTCD(struct.getPVC2PLANTCD());
			this.setRETURN_MESSAGE(struct.getRETURN_MESSAGE());
			this.setRETURN_STATUS(struct.getRETURN_STATUS());
			this.setWS_NAME(struct.getWS_NAME());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setw_USER_CD(struct.getw_USER_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DAILY_WORK_REPORT_TYP_name(struct.getList_DAILY_WORK_REPORT_TYP_name());
			this.setList_DAILY_WORK_REPORT_TYP_val(struct.getList_DAILY_WORK_REPORT_TYP_val());
			this.setList_l_DAILY_WORK_REPORT_TYP_SHOW(struct.getList_l_DAILY_WORK_REPORT_TYP_SHOW());
			this.setList_l_OPR_TYP_SHOW(struct.getList_l_OPR_TYP_SHOW());
			this.setList_l_UN_OPR_CAUSE_TYP_SHOW(struct.getList_l_UN_OPR_CAUSE_TYP_SHOW());
			this.setList_l_OPR_TYP_name(struct.getList_l_OPR_TYP_name());
			this.setList_l_OPR_TYP_val(struct.getList_l_OPR_TYP_val());
			this.setList_l_UN_OPR_CAUSE_TYP_name(struct.getList_l_UN_OPR_CAUSE_TYP_name());
			this.setList_l_UN_OPR_CAUSE_TYP_val(struct.getList_l_UN_OPR_CAUSE_TYP_val());
			this.setList_h_UpdateFlag(struct.getList_h_UpdateFlag());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_h_l_DAILY_WORK_REPORT_TYP(struct.getList_h_l_DAILY_WORK_REPORT_TYP());
			this.setList_l_USER_CD(struct.getList_l_USER_CD());
			this.setList_l_OPR_DATE(struct.getList_l_OPR_DATE());
			this.setList_l_WORK_SHIFT_CODE(struct.getList_l_WORK_SHIFT_CODE());
			this.setList_l_START_TIME(struct.getList_l_START_TIME());
			this.setList_l_END_TIME(struct.getList_l_END_TIME());
			this.setList_l_OPR_TIME(struct.getList_l_OPR_TIME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_h_l_OPR_TYP(struct.getList_h_l_OPR_TYP());
			this.setList_h_l_UN_OPR_CAUSE_TYP(struct.getList_h_l_UN_OPR_CAUSE_TYP());
			this.setList_l_UN_OPR_TIME(struct.getList_l_UN_OPR_TIME());
			this.setList_l_DAILY_WORK_REPORT_CTL_NO(struct.getList_l_DAILY_WORK_REPORT_CTL_NO());
			this.setList_h_l_SEQ_NO(struct.getList_h_l_SEQ_NO());
			this.setList_h_l_MODIFY_COUNT(struct.getList_h_l_MODIFY_COUNT());
			this.setList_USER_PLANT_CD(struct.getList_USER_PLANT_CD());
			this.setList_DAILY_WORK_REPORT_TYP(struct.getList_DAILY_WORK_REPORT_TYP());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_OPR_DATE_FROM(struct.getList_OPR_DATE_FROM());
			this.setList_OPR_DATE_TO(struct.getList_OPR_DATE_TO());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_MAX_LINE(struct.getList_MAX_LINE());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_h_DAILY_WORK_REPORT_CTL_NO(struct.getList_h_DAILY_WORK_REPORT_CTL_NO());
			this.setList_l_SEQ_NO(struct.getList_l_SEQ_NO());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_OPR_TYP(struct.getList_l_OPR_TYP());
			this.setList_l_UN_OPR_CAUSE_TYP(struct.getList_l_UN_OPR_CAUSE_TYP());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_WORK_SHIFT_NAME(struct.getList_WORK_SHIFT_NAME());
			this.setList_WORK_SHIFT_CODE(struct.getList_WORK_SHIFT_CODE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_DAILY_WORK_REPORT_CTL_NO(struct.getList_DAILY_WORK_REPORT_CTL_NO());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_START_TIME(struct.getList_START_TIME());
			this.setList_END_TIME(struct.getList_END_TIME());
			this.setList_OPR_TIME(struct.getList_OPR_TIME());
			this.setList_OPR_TYP(struct.getList_OPR_TYP());
			this.setList_UN_OPR_CAUSE_TYP(struct.getList_UN_OPR_CAUSE_TYP());
			this.setList_UN_OPR_TIME(struct.getList_UN_OPR_TIME());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_TOTAL_OPR_TIME(struct.getList_TOTAL_OPR_TIME());
			this.setList_PVC2LOGMODE(struct.getList_PVC2LOGMODE());
			this.setList_PVC2OUTPUTMODE(struct.getList_PVC2OUTPUTMODE());
			this.setList_PVC2OUTPUTPATH(struct.getList_PVC2OUTPUTPATH());
			this.setList_PVC2OUTPUTNAME(struct.getList_PVC2OUTPUTNAME());
			this.setList_PVC2USERID(struct.getList_PVC2USERID());
			this.setList_PVC2BUSINESSNAME(struct.getList_PVC2BUSINESSNAME());
			this.setList_PVC2PLANTCD(struct.getList_PVC2PLANTCD());
			this.setList_RETURN_MESSAGE(struct.getList_RETURN_MESSAGE());
			this.setList_RETURN_STATUS(struct.getList_RETURN_STATUS());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_w_USER_CD(struct.getList_w_USER_CD());
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
	// �� 1 �ϐ������l�F i_DAILY_WORK_REPORT_TYP_name


	final static String i_DAILY_WORK_REPORT_TYP_name = null;

	// �� 2 �ϐ������l�F i_DAILY_WORK_REPORT_TYP_val


	final static String i_DAILY_WORK_REPORT_TYP_val = null;

	// �� 3 �ϐ������l�F i_l_DAILY_WORK_REPORT_TYP_SHOW


	final static String i_l_DAILY_WORK_REPORT_TYP_SHOW = null;

	// �� 4 �ϐ������l�F i_l_OPR_TYP_SHOW


	final static String i_l_OPR_TYP_SHOW = null;

	// �� 5 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_SHOW


	final static String i_l_UN_OPR_CAUSE_TYP_SHOW = null;

	// �� 6 �ϐ������l�F i_l_OPR_TYP_name


	final static String i_l_OPR_TYP_name = null;

	// �� 7 �ϐ������l�F i_l_OPR_TYP_val


	final static String i_l_OPR_TYP_val = null;

	// �� 8 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_name


	final static String i_l_UN_OPR_CAUSE_TYP_name = null;

	// �� 9 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_val


	final static String i_l_UN_OPR_CAUSE_TYP_val = null;

	// �� 10 �ϐ������l�F i_h_UpdateFlag


	final static String i_h_UpdateFlag = null;

	// �� 11 �ϐ������l�F i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// �� 12 �ϐ������l�F i_h_l_DAILY_WORK_REPORT_TYP


	final static String i_h_l_DAILY_WORK_REPORT_TYP = null;

	// �� 13 �ϐ������l�F i_l_USER_CD


	final static String i_l_USER_CD = null;

	// �� 14 �ϐ������l�F i_l_OPR_DATE


	final static String i_l_OPR_DATE = null;

	// �� 15 �ϐ������l�F i_l_WORK_SHIFT_CODE


	final static String i_l_WORK_SHIFT_CODE = null;

	// �� 16 �ϐ������l�F i_l_START_TIME


	final static String i_l_START_TIME = null;

	// �� 17 �ϐ������l�F i_l_END_TIME


	final static String i_l_END_TIME = null;

	// �� 18 �ϐ������l�F i_l_OPR_TIME


	final static String i_l_OPR_TIME = null;

	// �� 19 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 20 �ϐ������l�F i_h_l_OPR_TYP


	final static String i_h_l_OPR_TYP = null;

	// �� 21 �ϐ������l�F i_h_l_UN_OPR_CAUSE_TYP


	final static String i_h_l_UN_OPR_CAUSE_TYP = null;

	// �� 22 �ϐ������l�F i_l_UN_OPR_TIME


	final static String i_l_UN_OPR_TIME = null;

	// �� 23 �ϐ������l�F i_l_DAILY_WORK_REPORT_CTL_NO


	final static String i_l_DAILY_WORK_REPORT_CTL_NO = null;

	// �� 24 �ϐ������l�F i_h_l_SEQ_NO


	final static String i_h_l_SEQ_NO = null;

	// �� 25 �ϐ������l�F i_h_l_MODIFY_COUNT


	final static String i_h_l_MODIFY_COUNT = null;

	// �� 26 �ϐ������l�F i_USER_PLANT_CD


	final static String i_USER_PLANT_CD = null;

	// �� 27 �ϐ������l�F i_DAILY_WORK_REPORT_TYP


	final static String i_DAILY_WORK_REPORT_TYP = null;

	// �� 28 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 29 �ϐ������l�F i_OPR_DATE_FROM


	final static String i_OPR_DATE_FROM = null;

	// �� 30 �ϐ������l�F i_OPR_DATE_TO


	final static String i_OPR_DATE_TO = null;

	// �� 31 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 32 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 33 �ϐ������l�F i_MAX_LINE


	final static String i_MAX_LINE = null;

	// �� 34 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 35 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 36 �ϐ������l�F i_h_DAILY_WORK_REPORT_CTL_NO


	final static String i_h_DAILY_WORK_REPORT_CTL_NO = null;

	// �� 37 �ϐ������l�F i_l_SEQ_NO


	final static String i_l_SEQ_NO = null;

	// �� 38 �ϐ������l�F i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// �� 39 �ϐ������l�F i_l_OPR_TYP


	final static String i_l_OPR_TYP = null;

	// �� 40 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP


	final static String i_l_UN_OPR_CAUSE_TYP = null;

	// �� 41 �ϐ������l�F i_l_REMARKS


	final static String i_l_REMARKS = null;

	// �� 42 �ϐ������l�F i_WORK_SHIFT_NAME


	final static String i_WORK_SHIFT_NAME = null;

	// �� 43 �ϐ������l�F i_WORK_SHIFT_CODE


	final static String i_WORK_SHIFT_CODE = null;

	// �� 44 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 45 �ϐ������l�F i_DAILY_WORK_REPORT_CTL_NO


	final static String i_DAILY_WORK_REPORT_CTL_NO = null;

	// �� 46 �ϐ������l�F i_SEQ_NO


	final static String i_SEQ_NO = null;

	// �� 47 �ϐ������l�F i_OPR_DATE


	final static String i_OPR_DATE = null;

	// �� 48 �ϐ������l�F i_START_TIME


	final static String i_START_TIME = null;

	// �� 49 �ϐ������l�F i_END_TIME


	final static String i_END_TIME = null;

	// �� 50 �ϐ������l�F i_OPR_TIME


	final static String i_OPR_TIME = null;

	// �� 51 �ϐ������l�F i_OPR_TYP


	final static String i_OPR_TYP = null;

	// �� 52 �ϐ������l�F i_UN_OPR_CAUSE_TYP


	final static String i_UN_OPR_CAUSE_TYP = null;

	// �� 53 �ϐ������l�F i_UN_OPR_TIME


	final static String i_UN_OPR_TIME = null;

	// �� 54 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 55 �ϐ������l�F i_TOTAL_OPR_TIME


	final static String i_TOTAL_OPR_TIME = null;

	// �� 56 �ϐ������l�F i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// �� 57 �ϐ������l�F i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// �� 58 �ϐ������l�F i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// �� 59 �ϐ������l�F i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// �� 60 �ϐ������l�F i_PVC2USERID


	final static String i_PVC2USERID = null;

	// �� 61 �ϐ������l�F i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// �� 62 �ϐ������l�F i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// �� 63 �ϐ������l�F i_RETURN_MESSAGE


	final static String i_RETURN_MESSAGE = null;

	// �� 64 �ϐ������l�F i_RETURN_STATUS


	final static String i_RETURN_STATUS = null;

	// �� 65 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 66 �ϐ������l�F i_HOLIDAY_FLG


	final static String i_HOLIDAY_FLG = null;

	// �� 67 �ϐ������l�F i_w_USER_CD


	final static String i_w_USER_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_DAILY_WORK_REPORT_TYP_name

	final static String i_DAILY_WORK_REPORT_TYP_name = null;

	// �� 2 �ϐ������l�F i_DAILY_WORK_REPORT_TYP_val

	final static String i_DAILY_WORK_REPORT_TYP_val = null;

	// �� 3 �ϐ������l�F i_l_DAILY_WORK_REPORT_TYP_SHOW

	final static String i_l_DAILY_WORK_REPORT_TYP_SHOW = null;

	// �� 4 �ϐ������l�F i_l_DAILY_WORK_REPORT_DATA_TYP_SHOW

	final static String i_l_DAILY_WORK_REPORT_DATA_TYP_SHOW = null;

	// �� 5 �ϐ������l�F i_l_OPR_TYP_SHOW

	final static String i_l_OPR_TYP_SHOW = null;

	// �� 6 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_SHOW

	final static String i_l_UN_OPR_CAUSE_TYP_SHOW = null;

	// �� 7 �ϐ������l�F i_WORK_SHIFT_NAME

	final static String i_WORK_SHIFT_NAME = null;

	// �� 8 �ϐ������l�F i_l_OPR_TYP_name

	final static String i_l_OPR_TYP_name = null;

	// �� 9 �ϐ������l�F i_l_OPR_TYP_val

	final static String i_l_OPR_TYP_val = null;

	// �� 10 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_name

	final static String i_l_UN_OPR_CAUSE_TYP_name = null;

	// �� 11 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP_val

	final static String i_l_UN_OPR_CAUSE_TYP_val = null;

	// �� 12 �ϐ������l�F i_DAILY_WORK_REPORT_DATA_TYP

	final static String i_DAILY_WORK_REPORT_DATA_TYP = null;

	// �� 13 �ϐ������l�F i_DAILY_WORK_REPORT_DATA_TYP_name

	final static String i_DAILY_WORK_REPORT_DATA_TYP_name = null;

	// �� 14 �ϐ������l�F i_DAILY_WORK_REPORT_DATA_TYP_val

	final static String i_DAILY_WORK_REPORT_DATA_TYP_val = null;

	// �� 15 �ϐ������l�F i_INV_COLL_TYP

	final static String i_INV_COLL_TYP = null;

	// �� 16 �ϐ������l�F i_WORKER_QTY

	final static String i_WORKER_QTY = null;

	// �� 17 �ϐ������l�F i_PRD_QTY

	final static String i_PRD_QTY = null;

	// �� 18 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 19 �ϐ������l�F i_PLAN_GROUP_ORDER

	final static String i_PLAN_GROUP_ORDER = null;

	// �� 20 �ϐ������l�F i_ODR_GROUP_ORDER

	final static String i_ODR_GROUP_ORDER = null;

	// �� 21 �ϐ������l�F i_START_TIME

	final static String i_START_TIME = null;

	// �� 22 �ϐ������l�F i_END_TIME

	final static String i_END_TIME = null;

	// �� 23 �ϐ������l�F i_OPR_TIME

	final static String i_OPR_TIME = null;

	// �� 24 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 25 �ϐ������l�F i_EQUIPMENT_NO

	final static String i_EQUIPMENT_NO = null;

	// �� 26 �ϐ������l�F i_REPAIR_LINE_MACHINE_NO

	final static String i_REPAIR_LINE_MACHINE_NO = null;

	// �� 27 �ϐ������l�F i_ACCOUNTING_NO

	final static String i_ACCOUNTING_NO = null;

	// �� 28 �ϐ������l�F i_OPR_CLASS_CD

	final static String i_OPR_CLASS_CD = null;

	// �� 29 �ϐ������l�F i_PROC_MACHINE_CD

	final static String i_PROC_MACHINE_CD = null;

	// �� 30 �ϐ������l�F i_TARGET_PLANT_CD

	final static String i_TARGET_PLANT_CD = null;

	// �� 31 �ϐ������l�F i_TARGET_PLANT_NAME

	final static String i_TARGET_PLANT_NAME = null;

	// �� 32 �ϐ������l�F i_TARGET_LINE_NO

	final static String i_TARGET_LINE_NO = null;

	// �� 33 �ϐ������l�F i_TARGET_LINE_NAME

	final static String i_TARGET_LINE_NAME = null;

	// �� 34 �ϐ������l�F i_STOP_LOSS_EVENT_TIME

	final static String i_STOP_LOSS_EVENT_TIME = null;

	// �� 35 �ϐ������l�F i_STOP_LOSS_ASS_TIME

	final static String i_STOP_LOSS_ASS_TIME = null;

	// �� 36 �ϐ������l�F i_STOP_LOSS_RESERVE_TIME_1

	final static String i_STOP_LOSS_RESERVE_TIME_1 = null;

	// �� 37 �ϐ������l�F i_STOP_LOSS_TPM_TIME

	final static String i_STOP_LOSS_TPM_TIME = null;

	// �� 38 �ϐ������l�F i_STOP_LOSS_REPAIR_TIME

	final static String i_STOP_LOSS_REPAIR_TIME = null;

	// �� 39 �ϐ������l�F i_STOP_LOSS_RESERVE_TIME_2

	final static String i_STOP_LOSS_RESERVE_TIME_2 = null;

	// �� 40 �ϐ������l�F i_STOP_LOSS_OTHER_TIME

	final static String i_STOP_LOSS_OTHER_TIME = null;

	// �� 41 �ϐ������l�F i_STOP_LOSS_UN_MASS_PROD_TIME

	final static String i_STOP_LOSS_UN_MASS_PROD_TIME = null;

	// �� 42 �ϐ������l�F i_STOP_LOSS_RESERVE_TIME_3

	final static String i_STOP_LOSS_RESERVE_TIME_3 = null;

	// �� 43 �ϐ������l�F i_LINE_LOSS_IMPROVE_TIME

	final static String i_LINE_LOSS_IMPROVE_TIME = null;

	// �� 44 �ϐ������l�F i_LINE_LOSS_ON_HAND_TIME

	final static String i_LINE_LOSS_ON_HAND_TIME = null;

	// �� 45 �ϐ������l�F i_LINE_LOSS_RESERVE_TIME_1

	final static String i_LINE_LOSS_RESERVE_TIME_1 = null;

	// �� 46 �ϐ������l�F i_LINE_LOSS_LUBRICATE_TIME

	final static String i_LINE_LOSS_LUBRICATE_TIME = null;

	// �� 47 �ϐ������l�F i_LINE_LOSS_MEETING_TIME

	final static String i_LINE_LOSS_MEETING_TIME = null;

	// �� 48 �ϐ������l�F i_LINE_LOSS_RESERVE_TIME_2

	final static String i_LINE_LOSS_RESERVE_TIME_2 = null;

	// �� 49 �ϐ������l�F i_LINE_LOSS_DEFECT_TIME

	final static String i_LINE_LOSS_DEFECT_TIME = null;

	// �� 50 �ϐ������l�F i_LINE_LOSS_SELECT_TIME

	final static String i_LINE_LOSS_SELECT_TIME = null;

	// �� 51 �ϐ������l�F i_LINE_LOSS_RESERVE_TIME_3

	final static String i_LINE_LOSS_RESERVE_TIME_3 = null;

	// �� 52 �ϐ������l�F i_LINE_LOSS_ADJUST_TIME

	final static String i_LINE_LOSS_ADJUST_TIME = null;

	// �� 53 �ϐ������l�F i_LINE_LOSS_ADJUST_NO

	final static String i_LINE_LOSS_ADJUST_NO = null;

	// �� 54 �ϐ������l�F i_LINE_LOSS_RESERVE_TIME_4

	final static String i_LINE_LOSS_RESERVE_TIME_4 = null;

	// �� 55 �ϐ������l�F i_EQUIP_LOSS_TROUBLE_TIME

	final static String i_EQUIP_LOSS_TROUBLE_TIME = null;

	// �� 56 �ϐ������l�F i_EQUIP_LOSS_TROUBLE_NO

	final static String i_EQUIP_LOSS_TROUBLE_NO = null;

	// �� 57 �ϐ������l�F i_EQUIP_LOSS_RESERVE_TIME_1

	final static String i_EQUIP_LOSS_RESERVE_TIME_1 = null;

	// �� 58 �ϐ������l�F i_EQUIP_LOSS_HALT_TIME

	final static String i_EQUIP_LOSS_HALT_TIME = null;

	// �� 59 �ϐ������l�F i_EQUIP_LOSS_HALT_NO

	final static String i_EQUIP_LOSS_HALT_NO = null;

	// �� 60 �ϐ������l�F i_EQUIP_LOSS_RESERVE_TIME_2

	final static String i_EQUIP_LOSS_RESERVE_TIME_2 = null;

	// �� 61 �ϐ������l�F i_EQUIP_LOSS_ARRANGEMENT_TIME

	final static String i_EQUIP_LOSS_ARRANGEMENT_TIME = null;

	// �� 62 �ϐ������l�F i_EQUIP_LOSS_ARRANGEMENT_NO

	final static String i_EQUIP_LOSS_ARRANGEMENT_NO = null;

	// �� 63 �ϐ������l�F i_EQUIP_LOSS_RESERVE_TIME_3

	final static String i_EQUIP_LOSS_RESERVE_TIME_3 = null;

	// �� 64 �ϐ������l�F i_EQUIP_LOSS_CHG_TIME

	final static String i_EQUIP_LOSS_CHG_TIME = null;

	// �� 65 �ϐ������l�F i_EQUIP_LOSS_CHG_NO

	final static String i_EQUIP_LOSS_CHG_NO = null;

	// �� 66 �ϐ������l�F i_EQUIP_LOSS_RESERVE_TIME_4

	final static String i_EQUIP_LOSS_RESERVE_TIME_4 = null;

	// �� 67 �ϐ������l�F i_EQUIP_LOSS_BOOT_TIME

	final static String i_EQUIP_LOSS_BOOT_TIME = null;

	// �� 68 �ϐ������l�F i_DIS_LOSS_SEARCH_TIME

	final static String i_DIS_LOSS_SEARCH_TIME = null;

	// �� 69 �ϐ������l�F i_DIS_LOSS_TRANSPORT_TIME

	final static String i_DIS_LOSS_TRANSPORT_TIME = null;

	// �� 70 �ϐ������l�F i_DIS_LOSS_RESERVE_TIME_1

	final static String i_DIS_LOSS_RESERVE_TIME_1 = null;

	// �� 71 �ϐ������l�F i_OPR_LOSS_REPAIR_TIME

	final static String i_OPR_LOSS_REPAIR_TIME = null;

	// �� 72 �ϐ������l�F i_OPR_LOSS_SUPPORT_TIME

	final static String i_OPR_LOSS_SUPPORT_TIME = null;

	// �� 73 �ϐ������l�F i_OPR_LOSS_RESERVE_TIME_1

	final static String i_OPR_LOSS_RESERVE_TIME_1 = null;

	// �� 74 �ϐ������l�F i_LOSS_TIME_REMARKS

	final static String i_LOSS_TIME_REMARKS = null;

	// �� 75 �ϐ������l�F i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// �� 76 �ϐ������l�F i_h_l_DAILY_WORK_REPORT_TYP

	final static String i_h_l_DAILY_WORK_REPORT_TYP = null;

	// �� 77 �ϐ������l�F i_h_l_DAILY_WORK_REPORT_DATA_TYP

	final static String i_h_l_DAILY_WORK_REPORT_DATA_TYP = null;

	// �� 78 �ϐ������l�F i_l_USER_CD

	final static String i_l_USER_CD = null;

	// �� 79 �ϐ������l�F i_l_WORKER_QTY

	final static String i_l_WORKER_QTY = null;

	// �� 80 �ϐ������l�F i_l_OPR_DATE

	final static String i_l_OPR_DATE = null;

	// �� 81 �ϐ������l�F i_l_WORK_SHIFT_CODE

	final static String i_l_WORK_SHIFT_CODE = null;

	// �� 82 �ϐ������l�F i_l_START_TIME

	final static String i_l_START_TIME = null;

	// �� 83 �ϐ������l�F i_l_END_TIME

	final static String i_l_END_TIME = null;

	// �� 84 �ϐ������l�F i_l_OPR_TIME

	final static String i_l_OPR_TIME = null;

	// �� 85 �ϐ������l�F i_l_WS_CD

	final static String i_l_WS_CD = null;

	// �� 86 �ϐ������l�F i_l_OPR_INST_CD

	final static String i_l_OPR_INST_CD = null;

	// �� 87 �ϐ������l�F i_l_PRD_QTY

	final static String i_l_PRD_QTY = null;

	// �� 88 �ϐ������l�F i_h_l_OPR_TYP

	final static String i_h_l_OPR_TYP = null;

	// �� 89 �ϐ������l�F i_h_l_UN_OPR_CAUSE_TYP

	final static String i_h_l_UN_OPR_CAUSE_TYP = null;

	// �� 90 �ϐ������l�F i_l_UN_OPR_TIME

	final static String i_l_UN_OPR_TIME = null;

	// �� 91 �ϐ������l�F i_l_DAILY_WORK_REPORT_CTL_NO

	final static String i_l_DAILY_WORK_REPORT_CTL_NO = null;

	// �� 92 �ϐ������l�F i_h_l_SEQ_NO

	final static String i_h_l_SEQ_NO = null;

	// �� 93 �ϐ������l�F i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// �� 94 �ϐ������l�F i_DAILY_WORK_REPORT_TYP

	final static String i_DAILY_WORK_REPORT_TYP = null;

	// �� 95 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 96 �ϐ������l�F i_OPR_DATE_FROM

	final static String i_OPR_DATE_FROM = null;

	// �� 97 �ϐ������l�F i_OPR_DATE_TO

	final static String i_OPR_DATE_TO = null;

	// �� 98 �ϐ������l�F i_USER_CD

	final static String i_USER_CD = null;

	// �� 99 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 100 �ϐ������l�F i_TARGET_ITEM_NO

	final static String i_TARGET_ITEM_NO = null;

	// �� 101 �ϐ������l�F i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// �� 102 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 103 �ϐ������l�F i_USER_NAME

	final static String i_USER_NAME = null;

	// �� 104 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 105 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 106 �ϐ������l�F i_CHECK_FLAG

	final static String i_CHECK_FLAG = null;

	// �� 107 �ϐ������l�F i_h_DAILY_WORK_REPORT_CTL_NO

	final static String i_h_DAILY_WORK_REPORT_CTL_NO = null;

	// �� 108 �ϐ������l�F i_l_SEQ_NO

	final static String i_l_SEQ_NO = null;

	// �� 109 �ϐ������l�F i_l_WS_NAME

	final static String i_l_WS_NAME = null;

	// �� 110 �ϐ������l�F i_l_OPR_TYP

	final static String i_l_OPR_TYP = null;

	// �� 111 �ϐ������l�F i_l_UN_OPR_CAUSE_TYP

	final static String i_l_UN_OPR_CAUSE_TYP = null;

	// �� 112 �ϐ������l�F i_l_REMARKS

	final static String i_l_REMARKS = null;

	// �� 113 �ϐ������l�F i_OPR_DATE

	final static String i_OPR_DATE = null;

	// �� 114 �ϐ������l�F i_WORK_SHIFT_CODE

	final static String i_WORK_SHIFT_CODE = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_DAILY_WORK_REPORT_TYP_name = i_DAILY_WORK_REPORT_TYP_name;
		m_DAILY_WORK_REPORT_TYP_val = i_DAILY_WORK_REPORT_TYP_val;
		m_l_DAILY_WORK_REPORT_TYP_SHOW = i_l_DAILY_WORK_REPORT_TYP_SHOW;
		m_l_OPR_TYP_SHOW = i_l_OPR_TYP_SHOW;
		m_l_UN_OPR_CAUSE_TYP_SHOW = i_l_UN_OPR_CAUSE_TYP_SHOW;
		m_WORK_SHIFT_NAME = i_WORK_SHIFT_NAME;
		m_l_OPR_TYP_name = i_l_OPR_TYP_name;
		m_l_OPR_TYP_val = i_l_OPR_TYP_val;
		m_l_UN_OPR_CAUSE_TYP_name = i_l_UN_OPR_CAUSE_TYP_name;
		m_l_UN_OPR_CAUSE_TYP_val = i_l_UN_OPR_CAUSE_TYP_val;
		m_START_TIME = i_START_TIME;
		m_END_TIME = i_END_TIME;
		m_OPR_TIME = i_OPR_TIME;
		m_REMARKS = i_REMARKS;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_h_l_DAILY_WORK_REPORT_TYP = i_h_l_DAILY_WORK_REPORT_TYP;
		m_l_USER_CD = i_l_USER_CD;
		m_l_OPR_DATE = i_l_OPR_DATE;
		m_l_WORK_SHIFT_CODE = i_l_WORK_SHIFT_CODE;
		m_l_START_TIME = i_l_START_TIME;
		m_l_END_TIME = i_l_END_TIME;
		m_l_OPR_TIME = i_l_OPR_TIME;
		m_l_WS_CD = i_l_WS_CD;
		m_h_l_OPR_TYP = i_h_l_OPR_TYP;
		m_h_l_UN_OPR_CAUSE_TYP = i_h_l_UN_OPR_CAUSE_TYP;
		m_l_UN_OPR_TIME = i_l_UN_OPR_TIME;
		m_l_DAILY_WORK_REPORT_CTL_NO = i_l_DAILY_WORK_REPORT_CTL_NO;
		m_h_l_SEQ_NO = i_h_l_SEQ_NO;
		m_DAILY_WORK_REPORT_TYP = i_DAILY_WORK_REPORT_TYP;
		m_PLANT_CD = i_PLANT_CD;
		m_OPR_DATE_FROM = i_OPR_DATE_FROM;
		m_OPR_DATE_TO = i_OPR_DATE_TO;
		m_USER_CD = i_USER_CD;
		m_WS_CD = i_WS_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_USER_NAME = i_USER_NAME;
		m_WS_NAME = i_WS_NAME;
		m_h_DAILY_WORK_REPORT_CTL_NO = i_h_DAILY_WORK_REPORT_CTL_NO;
		m_l_SEQ_NO = i_l_SEQ_NO;
		m_l_WS_NAME = i_l_WS_NAME;
		m_l_OPR_TYP = i_l_OPR_TYP;
		m_l_UN_OPR_CAUSE_TYP = i_l_UN_OPR_CAUSE_TYP;
		m_l_REMARKS = i_l_REMARKS;
		m_OPR_DATE = i_OPR_DATE;
		m_WORK_SHIFT_CODE = i_WORK_SHIFT_CODE;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
