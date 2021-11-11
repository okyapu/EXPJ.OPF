/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0070/src/com/nec/jp/orteus/metamorBase/AD0070/AD0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0070;

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

public class AD0070010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_c3_WORK_STS_TYP */
	public String m_c3_WORK_STS_TYP = null;
	/** �� 2 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 3 �ϐ��F m_IN_OPR_INST_START_DATE_FROM */
	public String m_IN_OPR_INST_START_DATE_FROM = null;
	/** �� 4 �ϐ��F m_IN_OPR_INST_START_DATE_TO */
	public String m_IN_OPR_INST_START_DATE_TO = null;
	/** �� 5 �ϐ��F m_IN_WORK_ODR_DLV_DATE_FROM */
	public String m_IN_WORK_ODR_DLV_DATE_FROM = null;
	/** �� 6 �ϐ��F m_IN_WORK_ODR_DLV_DATE_TO */
	public String m_IN_WORK_ODR_DLV_DATE_TO = null;
	/** �� 7 �ϐ��F m_c4_WORK_STS_TYP */
	public String m_c4_WORK_STS_TYP = null;
	/** �� 8 �ϐ��F m_c5_WORK_STS_TYP */
	public String m_c5_WORK_STS_TYP = null;
	/** �� 9 �ϐ��F m_c6_WORK_STS_TYP */
	public String m_c6_WORK_STS_TYP = null;
	/** �� 10 �ϐ��F m_c1_WORK_STS_TYP */
	public String m_c1_WORK_STS_TYP = null;
	/** �� 11 �ϐ��F m_c2_WORK_STS_TYP */
	public String m_c2_WORK_STS_TYP = null;
	/** �� 12 �ϐ��F m_IN_OPR_INST_START_TIME_FROM */
	public String m_IN_OPR_INST_START_TIME_FROM = null;
	/** �� 13 �ϐ��F m_IN_OPR_INST_START_TIME_TO */
	public String m_IN_OPR_INST_START_TIME_TO = null;
	/** �� 14 �ϐ��F m_IN_WORK_ODR_DLV_TIME_FROM */
	public String m_IN_WORK_ODR_DLV_TIME_FROM = null;
	/** �� 15 �ϐ��F m_IN_WORK_ODR_DLV_TIME_TO */
	public String m_IN_WORK_ODR_DLV_TIME_TO = null;
	/** �� 16 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 17 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 18 �ϐ��F m_PROC_NO */
	public String m_PROC_NO = null;
	/** �� 19 �ϐ��F m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** �� 20 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 21 �ϐ��F m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** �� 22 �ϐ��F m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** �� 23 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 24 �ϐ��F m_OPR_INST_DATE */
	public String m_OPR_INST_DATE = null;
	/** �� 25 �ϐ��F m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** �� 26 �ϐ��F m_SUM_ACPT_QTY */
	public String m_SUM_ACPT_QTY = null;
	/** �� 27 �ϐ��F m_SUM_DEFECT_QTY */
	public String m_SUM_DEFECT_QTY = null;
	/** �� 28 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 29 �ϐ��F m_WORK_STS_NAME */
	public String m_WORK_STS_NAME = null;
	/** �� 30 �ϐ��F m_WORK_CMPLT_DATE */
	public String m_WORK_CMPLT_DATE = null;
	/** �� 31 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 32 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 33 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 34 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 35 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 36 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 37 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 38 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 39 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 40 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 41 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 42 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 43 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 44 �ϐ��F m_OPR_INST_SLIP_ISS_DATE */
	public String m_OPR_INST_SLIP_ISS_DATE = null;
	/** �� 45 �ϐ��F m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** �� 46 �ϐ��F m_STATUS_DN */
	public String m_STATUS_DN = null;
	/** �� 47 �ϐ��F m_IN_PLANT_CD */
	public String m_IN_PLANT_CD = null;
	/** �� 48 �ϐ��F m_IN_WS_CD */
	public String m_IN_WS_CD = null;
	/** �� 49 �ϐ��F m_IN_VEND_CD */
	public String m_IN_VEND_CD = null;
	/** �� 50 �ϐ��F m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;
	/** �� 51 �ϐ��F m_IN_WORK_ODR_CD */
	public String m_IN_WORK_ODR_CD = null;
	/** �� 52 �ϐ��F m_IN_OPR_INST_CD */
	public String m_IN_OPR_INST_CD = null;
	/** �� 53 �ϐ��F m_IN_JOB_ODR_CD */
	public String m_IN_JOB_ODR_CD = null;
	/** �� 54 �ϐ��F m_L_IN_OPR_INST_START_DATE_FROM */
	public String m_L_IN_OPR_INST_START_DATE_FROM = null;
	/** �� 55 �ϐ��F m_L_IN_OPR_INST_START_DATE_TO */
	public String m_L_IN_OPR_INST_START_DATE_TO = null;
	/** �� 56 �ϐ��F m_L_IN_OPR_INST_START_DATE_FROM_ZERO */
	public String m_L_IN_OPR_INST_START_DATE_FROM_ZERO = null;
	/** �� 57 �ϐ��F m_L_IN_WORK_ODR_DLV_DATE_FROM */
	public String m_L_IN_WORK_ODR_DLV_DATE_FROM = null;
	/** �� 58 �ϐ��F m_L_IN_WORK_ODR_DLV_DATE_TO */
	public String m_L_IN_WORK_ODR_DLV_DATE_TO = null;
	/** �� 59 �ϐ��F m_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO */
	public String m_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = null;
	/** �� 60 �ϐ��F m_STATUS1 */
	public String m_STATUS1 = null;
	/** �� 61 �ϐ��F m_STATUS2 */
	public String m_STATUS2 = null;
	/** �� 62 �ϐ��F m_STATUS3 */
	public String m_STATUS3 = null;
	/** �� 63 �ϐ��F m_STATUS4 */
	public String m_STATUS4 = null;
	/** �� 64 �ϐ��F m_STATUS5 */
	public String m_STATUS5 = null;
	/** �� 65 �ϐ��F m_STATUS6 */
	public String m_STATUS6 = null;
	/** �� 66 �ϐ��F m_readPLAN_CD */
	public String m_readPLAN_CD = null;
	/** �� 67 �ϐ��F m_IN_PLANT_NAME */
	public String m_IN_PLANT_NAME = null;
	/** �� 68 �ϐ��F m_readWS_CD */
	public String m_readWS_CD = null;
	/** �� 69 �ϐ��F m_IN_WS_NAME */
	public String m_IN_WS_NAME = null;
	/** �� 70 �ϐ��F m_readWS_PLANT_CD */
	public String m_readWS_PLANT_CD = null;
	/** �� 71 �ϐ��F m_readVEND_CD */
	public String m_readVEND_CD = null;
	/** �� 72 �ϐ��F m_IN_VEND_NAME */
	public String m_IN_VEND_NAME = null;
	/** �� 73 �ϐ��F m_readITEM_CD */
	public String m_readITEM_CD = null;
	/** �� 74 �ϐ��F m_IN_ITEM_NAME */
	public String m_IN_ITEM_NAME = null;
	/** �� 75 �ϐ��F m_readWORK_ODR_CD */
	public String m_readWORK_ODR_CD = null;
	/** �� 76 �ϐ��F m_readPLANT_CD */
	public String m_readPLANT_CD = null;
	/** �� 77 �ϐ��F m_readOPR_INST_CD */
	public String m_readOPR_INST_CD = null;
	/** �� 78 �ϐ��F m_readJOB_ODR_CD */
	public String m_readJOB_ODR_CD = null;
	/** �� 79 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 80 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 81 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_c3_WORK_STS_TYP */
	public List l_c3_WORK_STS_TYP = null;

	/** �� 2 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 3 List�ϐ��F l_IN_OPR_INST_START_DATE_FROM */
	public List l_IN_OPR_INST_START_DATE_FROM = null;

	/** �� 4 List�ϐ��F l_IN_OPR_INST_START_DATE_TO */
	public List l_IN_OPR_INST_START_DATE_TO = null;

	/** �� 5 List�ϐ��F l_IN_WORK_ODR_DLV_DATE_FROM */
	public List l_IN_WORK_ODR_DLV_DATE_FROM = null;

	/** �� 6 List�ϐ��F l_IN_WORK_ODR_DLV_DATE_TO */
	public List l_IN_WORK_ODR_DLV_DATE_TO = null;

	/** �� 7 List�ϐ��F l_c4_WORK_STS_TYP */
	public List l_c4_WORK_STS_TYP = null;

	/** �� 8 List�ϐ��F l_c5_WORK_STS_TYP */
	public List l_c5_WORK_STS_TYP = null;

	/** �� 9 List�ϐ��F l_c6_WORK_STS_TYP */
	public List l_c6_WORK_STS_TYP = null;

	/** �� 10 List�ϐ��F l_c1_WORK_STS_TYP */
	public List l_c1_WORK_STS_TYP = null;

	/** �� 11 List�ϐ��F l_c2_WORK_STS_TYP */
	public List l_c2_WORK_STS_TYP = null;

	/** �� 12 List�ϐ��F l_IN_OPR_INST_START_TIME_FROM */
	public List l_IN_OPR_INST_START_TIME_FROM = null;

	/** �� 13 List�ϐ��F l_IN_OPR_INST_START_TIME_TO */
	public List l_IN_OPR_INST_START_TIME_TO = null;

	/** �� 14 List�ϐ��F l_IN_WORK_ODR_DLV_TIME_FROM */
	public List l_IN_WORK_ODR_DLV_TIME_FROM = null;

	/** �� 15 List�ϐ��F l_IN_WORK_ODR_DLV_TIME_TO */
	public List l_IN_WORK_ODR_DLV_TIME_TO = null;

	/** �� 16 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 17 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 18 List�ϐ��F l_PROC_NO */
	public List l_PROC_NO = null;

	/** �� 19 List�ϐ��F l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** �� 20 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 21 List�ϐ��F l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** �� 22 List�ϐ��F l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** �� 23 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 24 List�ϐ��F l_OPR_INST_DATE */
	public List l_OPR_INST_DATE = null;

	/** �� 25 List�ϐ��F l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** �� 26 List�ϐ��F l_SUM_ACPT_QTY */
	public List l_SUM_ACPT_QTY = null;

	/** �� 27 List�ϐ��F l_SUM_DEFECT_QTY */
	public List l_SUM_DEFECT_QTY = null;

	/** �� 28 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 29 List�ϐ��F l_WORK_STS_NAME */
	public List l_WORK_STS_NAME = null;

	/** �� 30 List�ϐ��F l_WORK_CMPLT_DATE */
	public List l_WORK_CMPLT_DATE = null;

	/** �� 31 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 32 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 33 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 34 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 35 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 36 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 37 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 38 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 39 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 40 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 41 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 42 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 43 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 44 List�ϐ��F l_OPR_INST_SLIP_ISS_DATE */
	public List l_OPR_INST_SLIP_ISS_DATE = null;

	/** �� 45 List�ϐ��F l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** �� 46 List�ϐ��F l_STATUS_DN */
	public List l_STATUS_DN = null;

	/** �� 47 List�ϐ��F l_IN_PLANT_CD */
	public List l_IN_PLANT_CD = null;

	/** �� 48 List�ϐ��F l_IN_WS_CD */
	public List l_IN_WS_CD = null;

	/** �� 49 List�ϐ��F l_IN_VEND_CD */
	public List l_IN_VEND_CD = null;

	/** �� 50 List�ϐ��F l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;

	/** �� 51 List�ϐ��F l_IN_WORK_ODR_CD */
	public List l_IN_WORK_ODR_CD = null;

	/** �� 52 List�ϐ��F l_IN_OPR_INST_CD */
	public List l_IN_OPR_INST_CD = null;

	/** �� 53 List�ϐ��F l_IN_JOB_ODR_CD */
	public List l_IN_JOB_ODR_CD = null;

	/** �� 54 List�ϐ��F l_L_IN_OPR_INST_START_DATE_FROM */
	public List l_L_IN_OPR_INST_START_DATE_FROM = null;

	/** �� 55 List�ϐ��F l_L_IN_OPR_INST_START_DATE_TO */
	public List l_L_IN_OPR_INST_START_DATE_TO = null;

	/** �� 56 List�ϐ��F l_L_IN_OPR_INST_START_DATE_FROM_ZERO */
	public List l_L_IN_OPR_INST_START_DATE_FROM_ZERO = null;

	/** �� 57 List�ϐ��F l_L_IN_WORK_ODR_DLV_DATE_FROM */
	public List l_L_IN_WORK_ODR_DLV_DATE_FROM = null;

	/** �� 58 List�ϐ��F l_L_IN_WORK_ODR_DLV_DATE_TO */
	public List l_L_IN_WORK_ODR_DLV_DATE_TO = null;

	/** �� 59 List�ϐ��F l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO */
	public List l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = null;

	/** �� 60 List�ϐ��F l_STATUS1 */
	public List l_STATUS1 = null;

	/** �� 61 List�ϐ��F l_STATUS2 */
	public List l_STATUS2 = null;

	/** �� 62 List�ϐ��F l_STATUS3 */
	public List l_STATUS3 = null;

	/** �� 63 List�ϐ��F l_STATUS4 */
	public List l_STATUS4 = null;

	/** �� 64 List�ϐ��F l_STATUS5 */
	public List l_STATUS5 = null;

	/** �� 65 List�ϐ��F l_STATUS6 */
	public List l_STATUS6 = null;

	/** �� 66 List�ϐ��F l_readPLAN_CD */
	public List l_readPLAN_CD = null;

	/** �� 67 List�ϐ��F l_IN_PLANT_NAME */
	public List l_IN_PLANT_NAME = null;

	/** �� 68 List�ϐ��F l_readWS_CD */
	public List l_readWS_CD = null;

	/** �� 69 List�ϐ��F l_IN_WS_NAME */
	public List l_IN_WS_NAME = null;

	/** �� 70 List�ϐ��F l_readWS_PLANT_CD */
	public List l_readWS_PLANT_CD = null;

	/** �� 71 List�ϐ��F l_readVEND_CD */
	public List l_readVEND_CD = null;

	/** �� 72 List�ϐ��F l_IN_VEND_NAME */
	public List l_IN_VEND_NAME = null;

	/** �� 73 List�ϐ��F l_readITEM_CD */
	public List l_readITEM_CD = null;

	/** �� 74 List�ϐ��F l_IN_ITEM_NAME */
	public List l_IN_ITEM_NAME = null;

	/** �� 75 List�ϐ��F l_readWORK_ODR_CD */
	public List l_readWORK_ODR_CD = null;

	/** �� 76 List�ϐ��F l_readPLANT_CD */
	public List l_readPLANT_CD = null;

	/** �� 77 List�ϐ��F l_readOPR_INST_CD */
	public List l_readOPR_INST_CD = null;

	/** �� 78 List�ϐ��F l_readJOB_ODR_CD */
	public List l_readJOB_ODR_CD = null;

	/** �� 79 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 80 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 81 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getc3_WORK_STS_TYP() { return m_c3_WORK_STS_TYP; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getIN_OPR_INST_START_DATE_FROM() { return m_IN_OPR_INST_START_DATE_FROM; }
	public String getIN_OPR_INST_START_DATE_TO() { return m_IN_OPR_INST_START_DATE_TO; }
	public String getIN_WORK_ODR_DLV_DATE_FROM() { return m_IN_WORK_ODR_DLV_DATE_FROM; }
	public String getIN_WORK_ODR_DLV_DATE_TO() { return m_IN_WORK_ODR_DLV_DATE_TO; }
	public String getc4_WORK_STS_TYP() { return m_c4_WORK_STS_TYP; }
	public String getc5_WORK_STS_TYP() { return m_c5_WORK_STS_TYP; }
	public String getc6_WORK_STS_TYP() { return m_c6_WORK_STS_TYP; }
	public String getc1_WORK_STS_TYP() { return m_c1_WORK_STS_TYP; }
	public String getc2_WORK_STS_TYP() { return m_c2_WORK_STS_TYP; }
	public String getIN_OPR_INST_START_TIME_FROM() { return m_IN_OPR_INST_START_TIME_FROM; }
	public String getIN_OPR_INST_START_TIME_TO() { return m_IN_OPR_INST_START_TIME_TO; }
	public String getIN_WORK_ODR_DLV_TIME_FROM() { return m_IN_WORK_ODR_DLV_TIME_FROM; }
	public String getIN_WORK_ODR_DLV_TIME_TO() { return m_IN_WORK_ODR_DLV_TIME_TO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getOPR_INST_DATE() { return m_OPR_INST_DATE; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getSUM_DEFECT_QTY() { return m_SUM_DEFECT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getWORK_STS_NAME() { return m_WORK_STS_NAME; }
	public String getWORK_CMPLT_DATE() { return m_WORK_CMPLT_DATE; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getOPR_INST_SLIP_ISS_DATE() { return m_OPR_INST_SLIP_ISS_DATE; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getSTATUS_DN() { return m_STATUS_DN; }
	public String getIN_PLANT_CD() { return m_IN_PLANT_CD; }
	public String getIN_WS_CD() { return m_IN_WS_CD; }
	public String getIN_VEND_CD() { return m_IN_VEND_CD; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }
	public String getIN_WORK_ODR_CD() { return m_IN_WORK_ODR_CD; }
	public String getIN_OPR_INST_CD() { return m_IN_OPR_INST_CD; }
	public String getIN_JOB_ODR_CD() { return m_IN_JOB_ODR_CD; }
	public String getL_IN_OPR_INST_START_DATE_FROM() { return m_L_IN_OPR_INST_START_DATE_FROM; }
	public String getL_IN_OPR_INST_START_DATE_TO() { return m_L_IN_OPR_INST_START_DATE_TO; }
	public String getL_IN_OPR_INST_START_DATE_FROM_ZERO() { return m_L_IN_OPR_INST_START_DATE_FROM_ZERO; }
	public String getL_IN_WORK_ODR_DLV_DATE_FROM() { return m_L_IN_WORK_ODR_DLV_DATE_FROM; }
	public String getL_IN_WORK_ODR_DLV_DATE_TO() { return m_L_IN_WORK_ODR_DLV_DATE_TO; }
	public String getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO() { return m_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO; }
	public String getSTATUS1() { return m_STATUS1; }
	public String getSTATUS2() { return m_STATUS2; }
	public String getSTATUS3() { return m_STATUS3; }
	public String getSTATUS4() { return m_STATUS4; }
	public String getSTATUS5() { return m_STATUS5; }
	public String getSTATUS6() { return m_STATUS6; }
	public String getreadPLAN_CD() { return m_readPLAN_CD; }
	public String getIN_PLANT_NAME() { return m_IN_PLANT_NAME; }
	public String getreadWS_CD() { return m_readWS_CD; }
	public String getIN_WS_NAME() { return m_IN_WS_NAME; }
	public String getreadWS_PLANT_CD() { return m_readWS_PLANT_CD; }
	public String getreadVEND_CD() { return m_readVEND_CD; }
	public String getIN_VEND_NAME() { return m_IN_VEND_NAME; }
	public String getreadITEM_CD() { return m_readITEM_CD; }
	public String getIN_ITEM_NAME() { return m_IN_ITEM_NAME; }
	public String getreadWORK_ODR_CD() { return m_readWORK_ODR_CD; }
	public String getreadPLANT_CD() { return m_readPLANT_CD; }
	public String getreadOPR_INST_CD() { return m_readOPR_INST_CD; }
	public String getreadJOB_ODR_CD() { return m_readJOB_ODR_CD; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_c3_WORK_STS_TYP() { return l_c3_WORK_STS_TYP; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_IN_OPR_INST_START_DATE_FROM() { return l_IN_OPR_INST_START_DATE_FROM; }
	public List getList_IN_OPR_INST_START_DATE_TO() { return l_IN_OPR_INST_START_DATE_TO; }
	public List getList_IN_WORK_ODR_DLV_DATE_FROM() { return l_IN_WORK_ODR_DLV_DATE_FROM; }
	public List getList_IN_WORK_ODR_DLV_DATE_TO() { return l_IN_WORK_ODR_DLV_DATE_TO; }
	public List getList_c4_WORK_STS_TYP() { return l_c4_WORK_STS_TYP; }
	public List getList_c5_WORK_STS_TYP() { return l_c5_WORK_STS_TYP; }
	public List getList_c6_WORK_STS_TYP() { return l_c6_WORK_STS_TYP; }
	public List getList_c1_WORK_STS_TYP() { return l_c1_WORK_STS_TYP; }
	public List getList_c2_WORK_STS_TYP() { return l_c2_WORK_STS_TYP; }
	public List getList_IN_OPR_INST_START_TIME_FROM() { return l_IN_OPR_INST_START_TIME_FROM; }
	public List getList_IN_OPR_INST_START_TIME_TO() { return l_IN_OPR_INST_START_TIME_TO; }
	public List getList_IN_WORK_ODR_DLV_TIME_FROM() { return l_IN_WORK_ODR_DLV_TIME_FROM; }
	public List getList_IN_WORK_ODR_DLV_TIME_TO() { return l_IN_WORK_ODR_DLV_TIME_TO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_OPR_INST_DATE() { return l_OPR_INST_DATE; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_SUM_ACPT_QTY() { return l_SUM_ACPT_QTY; }
	public List getList_SUM_DEFECT_QTY() { return l_SUM_DEFECT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_WORK_STS_NAME() { return l_WORK_STS_NAME; }
	public List getList_WORK_CMPLT_DATE() { return l_WORK_CMPLT_DATE; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_OPR_INST_SLIP_ISS_DATE() { return l_OPR_INST_SLIP_ISS_DATE; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_STATUS_DN() { return l_STATUS_DN; }
	public List getList_IN_PLANT_CD() { return l_IN_PLANT_CD; }
	public List getList_IN_WS_CD() { return l_IN_WS_CD; }
	public List getList_IN_VEND_CD() { return l_IN_VEND_CD; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }
	public List getList_IN_WORK_ODR_CD() { return l_IN_WORK_ODR_CD; }
	public List getList_IN_OPR_INST_CD() { return l_IN_OPR_INST_CD; }
	public List getList_IN_JOB_ODR_CD() { return l_IN_JOB_ODR_CD; }
	public List getList_L_IN_OPR_INST_START_DATE_FROM() { return l_L_IN_OPR_INST_START_DATE_FROM; }
	public List getList_L_IN_OPR_INST_START_DATE_TO() { return l_L_IN_OPR_INST_START_DATE_TO; }
	public List getList_L_IN_OPR_INST_START_DATE_FROM_ZERO() { return l_L_IN_OPR_INST_START_DATE_FROM_ZERO; }
	public List getList_L_IN_WORK_ODR_DLV_DATE_FROM() { return l_L_IN_WORK_ODR_DLV_DATE_FROM; }
	public List getList_L_IN_WORK_ODR_DLV_DATE_TO() { return l_L_IN_WORK_ODR_DLV_DATE_TO; }
	public List getList_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO() { return l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO; }
	public List getList_STATUS1() { return l_STATUS1; }
	public List getList_STATUS2() { return l_STATUS2; }
	public List getList_STATUS3() { return l_STATUS3; }
	public List getList_STATUS4() { return l_STATUS4; }
	public List getList_STATUS5() { return l_STATUS5; }
	public List getList_STATUS6() { return l_STATUS6; }
	public List getList_readPLAN_CD() { return l_readPLAN_CD; }
	public List getList_IN_PLANT_NAME() { return l_IN_PLANT_NAME; }
	public List getList_readWS_CD() { return l_readWS_CD; }
	public List getList_IN_WS_NAME() { return l_IN_WS_NAME; }
	public List getList_readWS_PLANT_CD() { return l_readWS_PLANT_CD; }
	public List getList_readVEND_CD() { return l_readVEND_CD; }
	public List getList_IN_VEND_NAME() { return l_IN_VEND_NAME; }
	public List getList_readITEM_CD() { return l_readITEM_CD; }
	public List getList_IN_ITEM_NAME() { return l_IN_ITEM_NAME; }
	public List getList_readWORK_ODR_CD() { return l_readWORK_ODR_CD; }
	public List getList_readPLANT_CD() { return l_readPLANT_CD; }
	public List getList_readOPR_INST_CD() { return l_readOPR_INST_CD; }
	public List getList_readJOB_ODR_CD() { return l_readJOB_ODR_CD; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setc3_WORK_STS_TYP(String val) { m_c3_WORK_STS_TYP = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setIN_OPR_INST_START_DATE_FROM(String val) { m_IN_OPR_INST_START_DATE_FROM = val; }
	public void setIN_OPR_INST_START_DATE_TO(String val) { m_IN_OPR_INST_START_DATE_TO = val; }
	public void setIN_WORK_ODR_DLV_DATE_FROM(String val) { m_IN_WORK_ODR_DLV_DATE_FROM = val; }
	public void setIN_WORK_ODR_DLV_DATE_TO(String val) { m_IN_WORK_ODR_DLV_DATE_TO = val; }
	public void setc4_WORK_STS_TYP(String val) { m_c4_WORK_STS_TYP = val; }
	public void setc5_WORK_STS_TYP(String val) { m_c5_WORK_STS_TYP = val; }
	public void setc6_WORK_STS_TYP(String val) { m_c6_WORK_STS_TYP = val; }
	public void setc1_WORK_STS_TYP(String val) { m_c1_WORK_STS_TYP = val; }
	public void setc2_WORK_STS_TYP(String val) { m_c2_WORK_STS_TYP = val; }
	public void setIN_OPR_INST_START_TIME_FROM(String val) { m_IN_OPR_INST_START_TIME_FROM = val; }
	public void setIN_OPR_INST_START_TIME_TO(String val) { m_IN_OPR_INST_START_TIME_TO = val; }
	public void setIN_WORK_ODR_DLV_TIME_FROM(String val) { m_IN_WORK_ODR_DLV_TIME_FROM = val; }
	public void setIN_WORK_ODR_DLV_TIME_TO(String val) { m_IN_WORK_ODR_DLV_TIME_TO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setOPR_INST_DATE(String val) { m_OPR_INST_DATE = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setSUM_ACPT_QTY(String val) { m_SUM_ACPT_QTY = val; }
	public void setSUM_DEFECT_QTY(String val) { m_SUM_DEFECT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setWORK_STS_NAME(String val) { m_WORK_STS_NAME = val; }
	public void setWORK_CMPLT_DATE(String val) { m_WORK_CMPLT_DATE = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setOPR_INST_SLIP_ISS_DATE(String val) { m_OPR_INST_SLIP_ISS_DATE = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setSTATUS_DN(String val) { m_STATUS_DN = val; }
	public void setIN_PLANT_CD(String val) { m_IN_PLANT_CD = val; }
	public void setIN_WS_CD(String val) { m_IN_WS_CD = val; }
	public void setIN_VEND_CD(String val) { m_IN_VEND_CD = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }
	public void setIN_WORK_ODR_CD(String val) { m_IN_WORK_ODR_CD = val; }
	public void setIN_OPR_INST_CD(String val) { m_IN_OPR_INST_CD = val; }
	public void setIN_JOB_ODR_CD(String val) { m_IN_JOB_ODR_CD = val; }
	public void setL_IN_OPR_INST_START_DATE_FROM(String val) { m_L_IN_OPR_INST_START_DATE_FROM = val; }
	public void setL_IN_OPR_INST_START_DATE_TO(String val) { m_L_IN_OPR_INST_START_DATE_TO = val; }
	public void setL_IN_OPR_INST_START_DATE_FROM_ZERO(String val) { m_L_IN_OPR_INST_START_DATE_FROM_ZERO = val; }
	public void setL_IN_WORK_ODR_DLV_DATE_FROM(String val) { m_L_IN_WORK_ODR_DLV_DATE_FROM = val; }
	public void setL_IN_WORK_ODR_DLV_DATE_TO(String val) { m_L_IN_WORK_ODR_DLV_DATE_TO = val; }
	public void setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(String val) { m_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = val; }
	public void setSTATUS1(String val) { m_STATUS1 = val; }
	public void setSTATUS2(String val) { m_STATUS2 = val; }
	public void setSTATUS3(String val) { m_STATUS3 = val; }
	public void setSTATUS4(String val) { m_STATUS4 = val; }
	public void setSTATUS5(String val) { m_STATUS5 = val; }
	public void setSTATUS6(String val) { m_STATUS6 = val; }
	public void setreadPLAN_CD(String val) { m_readPLAN_CD = val; }
	public void setIN_PLANT_NAME(String val) { m_IN_PLANT_NAME = val; }
	public void setreadWS_CD(String val) { m_readWS_CD = val; }
	public void setIN_WS_NAME(String val) { m_IN_WS_NAME = val; }
	public void setreadWS_PLANT_CD(String val) { m_readWS_PLANT_CD = val; }
	public void setreadVEND_CD(String val) { m_readVEND_CD = val; }
	public void setIN_VEND_NAME(String val) { m_IN_VEND_NAME = val; }
	public void setreadITEM_CD(String val) { m_readITEM_CD = val; }
	public void setIN_ITEM_NAME(String val) { m_IN_ITEM_NAME = val; }
	public void setreadWORK_ODR_CD(String val) { m_readWORK_ODR_CD = val; }
	public void setreadPLANT_CD(String val) { m_readPLANT_CD = val; }
	public void setreadOPR_INST_CD(String val) { m_readOPR_INST_CD = val; }
	public void setreadJOB_ODR_CD(String val) { m_readJOB_ODR_CD = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_c3_WORK_STS_TYP(List list) { l_c3_WORK_STS_TYP = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_IN_OPR_INST_START_DATE_FROM(List list) { l_IN_OPR_INST_START_DATE_FROM = list; }
	public void setList_IN_OPR_INST_START_DATE_TO(List list) { l_IN_OPR_INST_START_DATE_TO = list; }
	public void setList_IN_WORK_ODR_DLV_DATE_FROM(List list) { l_IN_WORK_ODR_DLV_DATE_FROM = list; }
	public void setList_IN_WORK_ODR_DLV_DATE_TO(List list) { l_IN_WORK_ODR_DLV_DATE_TO = list; }
	public void setList_c4_WORK_STS_TYP(List list) { l_c4_WORK_STS_TYP = list; }
	public void setList_c5_WORK_STS_TYP(List list) { l_c5_WORK_STS_TYP = list; }
	public void setList_c6_WORK_STS_TYP(List list) { l_c6_WORK_STS_TYP = list; }
	public void setList_c1_WORK_STS_TYP(List list) { l_c1_WORK_STS_TYP = list; }
	public void setList_c2_WORK_STS_TYP(List list) { l_c2_WORK_STS_TYP = list; }
	public void setList_IN_OPR_INST_START_TIME_FROM(List list) { l_IN_OPR_INST_START_TIME_FROM = list; }
	public void setList_IN_OPR_INST_START_TIME_TO(List list) { l_IN_OPR_INST_START_TIME_TO = list; }
	public void setList_IN_WORK_ODR_DLV_TIME_FROM(List list) { l_IN_WORK_ODR_DLV_TIME_FROM = list; }
	public void setList_IN_WORK_ODR_DLV_TIME_TO(List list) { l_IN_WORK_ODR_DLV_TIME_TO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_OPR_INST_DATE(List list) { l_OPR_INST_DATE = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_SUM_ACPT_QTY(List list) { l_SUM_ACPT_QTY = list; }
	public void setList_SUM_DEFECT_QTY(List list) { l_SUM_DEFECT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_WORK_STS_NAME(List list) { l_WORK_STS_NAME = list; }
	public void setList_WORK_CMPLT_DATE(List list) { l_WORK_CMPLT_DATE = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_OPR_INST_SLIP_ISS_DATE(List list) { l_OPR_INST_SLIP_ISS_DATE = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_STATUS_DN(List list) { l_STATUS_DN = list; }
	public void setList_IN_PLANT_CD(List list) { l_IN_PLANT_CD = list; }
	public void setList_IN_WS_CD(List list) { l_IN_WS_CD = list; }
	public void setList_IN_VEND_CD(List list) { l_IN_VEND_CD = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }
	public void setList_IN_WORK_ODR_CD(List list) { l_IN_WORK_ODR_CD = list; }
	public void setList_IN_OPR_INST_CD(List list) { l_IN_OPR_INST_CD = list; }
	public void setList_IN_JOB_ODR_CD(List list) { l_IN_JOB_ODR_CD = list; }
	public void setList_L_IN_OPR_INST_START_DATE_FROM(List list) { l_L_IN_OPR_INST_START_DATE_FROM = list; }
	public void setList_L_IN_OPR_INST_START_DATE_TO(List list) { l_L_IN_OPR_INST_START_DATE_TO = list; }
	public void setList_L_IN_OPR_INST_START_DATE_FROM_ZERO(List list) { l_L_IN_OPR_INST_START_DATE_FROM_ZERO = list; }
	public void setList_L_IN_WORK_ODR_DLV_DATE_FROM(List list) { l_L_IN_WORK_ODR_DLV_DATE_FROM = list; }
	public void setList_L_IN_WORK_ODR_DLV_DATE_TO(List list) { l_L_IN_WORK_ODR_DLV_DATE_TO = list; }
	public void setList_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO(List list) { l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = list; }
	public void setList_STATUS1(List list) { l_STATUS1 = list; }
	public void setList_STATUS2(List list) { l_STATUS2 = list; }
	public void setList_STATUS3(List list) { l_STATUS3 = list; }
	public void setList_STATUS4(List list) { l_STATUS4 = list; }
	public void setList_STATUS5(List list) { l_STATUS5 = list; }
	public void setList_STATUS6(List list) { l_STATUS6 = list; }
	public void setList_readPLAN_CD(List list) { l_readPLAN_CD = list; }
	public void setList_IN_PLANT_NAME(List list) { l_IN_PLANT_NAME = list; }
	public void setList_readWS_CD(List list) { l_readWS_CD = list; }
	public void setList_IN_WS_NAME(List list) { l_IN_WS_NAME = list; }
	public void setList_readWS_PLANT_CD(List list) { l_readWS_PLANT_CD = list; }
	public void setList_readVEND_CD(List list) { l_readVEND_CD = list; }
	public void setList_IN_VEND_NAME(List list) { l_IN_VEND_NAME = list; }
	public void setList_readITEM_CD(List list) { l_readITEM_CD = list; }
	public void setList_IN_ITEM_NAME(List list) { l_IN_ITEM_NAME = list; }
	public void setList_readWORK_ODR_CD(List list) { l_readWORK_ODR_CD = list; }
	public void setList_readPLANT_CD(List list) { l_readPLANT_CD = list; }
	public void setList_readOPR_INST_CD(List list) { l_readOPR_INST_CD = list; }
	public void setList_readJOB_ODR_CD(List list) { l_readJOB_ODR_CD = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_c3_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc3_WORK_STS_TYP());
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
			l_DOWNLOAD_FILE.add(((AD0070010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_START_DATE_FROM == null) {
			l_IN_OPR_INST_START_DATE_FROM = new ArrayList();
		} else {
			l_IN_OPR_INST_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_START_DATE_FROM.add(((AD0070010Struct) list.get(i)).getIN_OPR_INST_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_START_DATE_TO == null) {
			l_IN_OPR_INST_START_DATE_TO = new ArrayList();
		} else {
			l_IN_OPR_INST_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_START_DATE_TO.add(((AD0070010Struct) list.get(i)).getIN_OPR_INST_START_DATE_TO());
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
			l_IN_WORK_ODR_DLV_DATE_FROM.add(((AD0070010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATE_FROM());
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
			l_IN_WORK_ODR_DLV_DATE_TO.add(((AD0070010Struct) list.get(i)).getIN_WORK_ODR_DLV_DATE_TO());
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
			l_c4_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc4_WORK_STS_TYP());
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
			l_c5_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc5_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c6_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c6_WORK_STS_TYP == null) {
			l_c6_WORK_STS_TYP = new ArrayList();
		} else {
			l_c6_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c6_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc6_WORK_STS_TYP());
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
			l_c1_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc1_WORK_STS_TYP());
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
			l_c2_WORK_STS_TYP.add(((AD0070010Struct) list.get(i)).getc2_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_START_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_START_TIME_FROM == null) {
			l_IN_OPR_INST_START_TIME_FROM = new ArrayList();
		} else {
			l_IN_OPR_INST_START_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_START_TIME_FROM.add(((AD0070010Struct) list.get(i)).getIN_OPR_INST_START_TIME_FROM());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_START_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_START_TIME_TO == null) {
			l_IN_OPR_INST_START_TIME_TO = new ArrayList();
		} else {
			l_IN_OPR_INST_START_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_START_TIME_TO.add(((AD0070010Struct) list.get(i)).getIN_OPR_INST_START_TIME_TO());
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
			l_IN_WORK_ODR_DLV_TIME_FROM.add(((AD0070010Struct) list.get(i)).getIN_WORK_ODR_DLV_TIME_FROM());
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
			l_IN_WORK_ODR_DLV_TIME_TO.add(((AD0070010Struct) list.get(i)).getIN_WORK_ODR_DLV_TIME_TO());
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
			l_PLANT_CD.add(((AD0070010Struct) list.get(i)).getPLANT_CD());
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
			l_WORK_ODR_CD.add(((AD0070010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NO == null) {
			l_PROC_NO = new ArrayList();
		} else {
			l_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NO.add(((AD0070010Struct) list.get(i)).getPROC_NO());
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
			l_WORK_IN_PROC_CD.add(((AD0070010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AD0070010Struct) list.get(i)).getPROC_NAME());
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
			l_WORK_ODR_DLV_DATE.add(((AD0070010Struct) list.get(i)).getWORK_ODR_DLV_DATE());
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
			l_OPR_INST_START_DATE.add(((AD0070010Struct) list.get(i)).getOPR_INST_START_DATE());
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
			l_OPR_INST_CD.add(((AD0070010Struct) list.get(i)).getOPR_INST_CD());
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
			l_OPR_INST_DATE.add(((AD0070010Struct) list.get(i)).getOPR_INST_DATE());
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
			l_OPR_INST_QTY.add(((AD0070010Struct) list.get(i)).getOPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ACPT_QTY == null) {
			l_SUM_ACPT_QTY = new ArrayList();
		} else {
			l_SUM_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ACPT_QTY.add(((AD0070010Struct) list.get(i)).getSUM_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_SUM_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_DEFECT_QTY == null) {
			l_SUM_DEFECT_QTY = new ArrayList();
		} else {
			l_SUM_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_DEFECT_QTY.add(((AD0070010Struct) list.get(i)).getSUM_DEFECT_QTY());
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
			l_STOCK_UNIT.add(((AD0070010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_WORK_STS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_STS_NAME == null) {
			l_WORK_STS_NAME = new ArrayList();
		} else {
			l_WORK_STS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_STS_NAME.add(((AD0070010Struct) list.get(i)).getWORK_STS_NAME());
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
			l_WORK_CMPLT_DATE.add(((AD0070010Struct) list.get(i)).getWORK_CMPLT_DATE());
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
			l_ITEM_CD.add(((AD0070010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AD0070010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AD0070010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0070010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AD0070010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_JOB_ODR_CD.add(((AD0070010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_CANCEL_NO.add(((AD0070010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_OUTSIDE_TYP.add(((AD0070010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_WS_CD.add(((AD0070010Struct) list.get(i)).getWS_CD());
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
			l_WS_NAME.add(((AD0070010Struct) list.get(i)).getWS_NAME());
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
			l_VEND_CD.add(((AD0070010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AD0070010Struct) list.get(i)).getVEND_ANAME());
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
			l_PUCH_ODR_CD.add(((AD0070010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_OPR_INST_SLIP_ISS_DATE.add(((AD0070010Struct) list.get(i)).getOPR_INST_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP == null) {
			l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP.add(((AD0070010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_STATUS_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS_DN == null) {
			l_STATUS_DN = new ArrayList();
		} else {
			l_STATUS_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS_DN.add(((AD0070010Struct) list.get(i)).getSTATUS_DN());
		}
		return size;
	}
	public int setL2L_IN_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLANT_CD == null) {
			l_IN_PLANT_CD = new ArrayList();
		} else {
			l_IN_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLANT_CD.add(((AD0070010Struct) list.get(i)).getIN_PLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WS_CD == null) {
			l_IN_WS_CD = new ArrayList();
		} else {
			l_IN_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WS_CD.add(((AD0070010Struct) list.get(i)).getIN_WS_CD());
		}
		return size;
	}
	public int setL2L_IN_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_VEND_CD == null) {
			l_IN_VEND_CD = new ArrayList();
		} else {
			l_IN_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_VEND_CD.add(((AD0070010Struct) list.get(i)).getIN_VEND_CD());
		}
		return size;
	}
	public int setL2L_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_CD == null) {
			l_IN_ITEM_CD = new ArrayList();
		} else {
			l_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_CD.add(((AD0070010Struct) list.get(i)).getIN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_IN_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WORK_ODR_CD == null) {
			l_IN_WORK_ODR_CD = new ArrayList();
		} else {
			l_IN_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WORK_ODR_CD.add(((AD0070010Struct) list.get(i)).getIN_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_CD == null) {
			l_IN_OPR_INST_CD = new ArrayList();
		} else {
			l_IN_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_CD.add(((AD0070010Struct) list.get(i)).getIN_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_IN_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_JOB_ODR_CD == null) {
			l_IN_JOB_ODR_CD = new ArrayList();
		} else {
			l_IN_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_JOB_ODR_CD.add(((AD0070010Struct) list.get(i)).getIN_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_L_IN_OPR_INST_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_OPR_INST_START_DATE_FROM == null) {
			l_L_IN_OPR_INST_START_DATE_FROM = new ArrayList();
		} else {
			l_L_IN_OPR_INST_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_OPR_INST_START_DATE_FROM.add(((AD0070010Struct) list.get(i)).getL_IN_OPR_INST_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_L_IN_OPR_INST_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_OPR_INST_START_DATE_TO == null) {
			l_L_IN_OPR_INST_START_DATE_TO = new ArrayList();
		} else {
			l_L_IN_OPR_INST_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_OPR_INST_START_DATE_TO.add(((AD0070010Struct) list.get(i)).getL_IN_OPR_INST_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_L_IN_OPR_INST_START_DATE_FROM_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_OPR_INST_START_DATE_FROM_ZERO == null) {
			l_L_IN_OPR_INST_START_DATE_FROM_ZERO = new ArrayList();
		} else {
			l_L_IN_OPR_INST_START_DATE_FROM_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_OPR_INST_START_DATE_FROM_ZERO.add(((AD0070010Struct) list.get(i)).getL_IN_OPR_INST_START_DATE_FROM_ZERO());
		}
		return size;
	}
	public int setL2L_L_IN_WORK_ODR_DLV_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_WORK_ODR_DLV_DATE_FROM == null) {
			l_L_IN_WORK_ODR_DLV_DATE_FROM = new ArrayList();
		} else {
			l_L_IN_WORK_ODR_DLV_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_WORK_ODR_DLV_DATE_FROM.add(((AD0070010Struct) list.get(i)).getL_IN_WORK_ODR_DLV_DATE_FROM());
		}
		return size;
	}
	public int setL2L_L_IN_WORK_ODR_DLV_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_WORK_ODR_DLV_DATE_TO == null) {
			l_L_IN_WORK_ODR_DLV_DATE_TO = new ArrayList();
		} else {
			l_L_IN_WORK_ODR_DLV_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_WORK_ODR_DLV_DATE_TO.add(((AD0070010Struct) list.get(i)).getL_IN_WORK_ODR_DLV_DATE_TO());
		}
		return size;
	}
	public int setL2L_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO == null) {
			l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = new ArrayList();
		} else {
			l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO.add(((AD0070010Struct) list.get(i)).getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO());
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
			l_STATUS1.add(((AD0070010Struct) list.get(i)).getSTATUS1());
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
			l_STATUS2.add(((AD0070010Struct) list.get(i)).getSTATUS2());
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
			l_STATUS3.add(((AD0070010Struct) list.get(i)).getSTATUS3());
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
			l_STATUS4.add(((AD0070010Struct) list.get(i)).getSTATUS4());
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
			l_STATUS5.add(((AD0070010Struct) list.get(i)).getSTATUS5());
		}
		return size;
	}
	public int setL2L_STATUS6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS6 == null) {
			l_STATUS6 = new ArrayList();
		} else {
			l_STATUS6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS6.add(((AD0070010Struct) list.get(i)).getSTATUS6());
		}
		return size;
	}
	public int setL2L_readPLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPLAN_CD == null) {
			l_readPLAN_CD = new ArrayList();
		} else {
			l_readPLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPLAN_CD.add(((AD0070010Struct) list.get(i)).getreadPLAN_CD());
		}
		return size;
	}
	public int setL2L_IN_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLANT_NAME == null) {
			l_IN_PLANT_NAME = new ArrayList();
		} else {
			l_IN_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLANT_NAME.add(((AD0070010Struct) list.get(i)).getIN_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_readWS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readWS_CD == null) {
			l_readWS_CD = new ArrayList();
		} else {
			l_readWS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readWS_CD.add(((AD0070010Struct) list.get(i)).getreadWS_CD());
		}
		return size;
	}
	public int setL2L_IN_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WS_NAME == null) {
			l_IN_WS_NAME = new ArrayList();
		} else {
			l_IN_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WS_NAME.add(((AD0070010Struct) list.get(i)).getIN_WS_NAME());
		}
		return size;
	}
	public int setL2L_readWS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readWS_PLANT_CD == null) {
			l_readWS_PLANT_CD = new ArrayList();
		} else {
			l_readWS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readWS_PLANT_CD.add(((AD0070010Struct) list.get(i)).getreadWS_PLANT_CD());
		}
		return size;
	}
	public int setL2L_readVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVEND_CD == null) {
			l_readVEND_CD = new ArrayList();
		} else {
			l_readVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVEND_CD.add(((AD0070010Struct) list.get(i)).getreadVEND_CD());
		}
		return size;
	}
	public int setL2L_IN_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_VEND_NAME == null) {
			l_IN_VEND_NAME = new ArrayList();
		} else {
			l_IN_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_VEND_NAME.add(((AD0070010Struct) list.get(i)).getIN_VEND_NAME());
		}
		return size;
	}
	public int setL2L_readITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readITEM_CD == null) {
			l_readITEM_CD = new ArrayList();
		} else {
			l_readITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readITEM_CD.add(((AD0070010Struct) list.get(i)).getreadITEM_CD());
		}
		return size;
	}
	public int setL2L_IN_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_NAME == null) {
			l_IN_ITEM_NAME = new ArrayList();
		} else {
			l_IN_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_NAME.add(((AD0070010Struct) list.get(i)).getIN_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_readWORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readWORK_ODR_CD == null) {
			l_readWORK_ODR_CD = new ArrayList();
		} else {
			l_readWORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readWORK_ODR_CD.add(((AD0070010Struct) list.get(i)).getreadWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_readPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPLANT_CD == null) {
			l_readPLANT_CD = new ArrayList();
		} else {
			l_readPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPLANT_CD.add(((AD0070010Struct) list.get(i)).getreadPLANT_CD());
		}
		return size;
	}
	public int setL2L_readOPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readOPR_INST_CD == null) {
			l_readOPR_INST_CD = new ArrayList();
		} else {
			l_readOPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readOPR_INST_CD.add(((AD0070010Struct) list.get(i)).getreadOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_readJOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readJOB_ODR_CD == null) {
			l_readJOB_ODR_CD = new ArrayList();
		} else {
			l_readJOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readJOB_ODR_CD.add(((AD0070010Struct) list.get(i)).getreadJOB_ODR_CD());
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
			l_TIME_CTRL.add(((AD0070010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AD0070010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AD0070010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_c3_WORK_STS_TYP = null;
		m_DOWNLOAD_FILE = null;
		m_IN_OPR_INST_START_DATE_FROM = null;
		m_IN_OPR_INST_START_DATE_TO = null;
		m_IN_WORK_ODR_DLV_DATE_FROM = null;
		m_IN_WORK_ODR_DLV_DATE_TO = null;
		m_c4_WORK_STS_TYP = null;
		m_c5_WORK_STS_TYP = null;
		m_c6_WORK_STS_TYP = null;
		m_c1_WORK_STS_TYP = null;
		m_c2_WORK_STS_TYP = null;
		m_IN_OPR_INST_START_TIME_FROM = null;
		m_IN_OPR_INST_START_TIME_TO = null;
		m_IN_WORK_ODR_DLV_TIME_FROM = null;
		m_IN_WORK_ODR_DLV_TIME_TO = null;
		m_PLANT_CD = null;
		m_WORK_ODR_CD = null;
		m_PROC_NO = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_WORK_ODR_DLV_DATE = null;
		m_OPR_INST_START_DATE = null;
		m_OPR_INST_CD = null;
		m_OPR_INST_DATE = null;
		m_OPR_INST_QTY = null;
		m_SUM_ACPT_QTY = null;
		m_SUM_DEFECT_QTY = null;
		m_STOCK_UNIT = null;
		m_WORK_STS_NAME = null;
		m_WORK_CMPLT_DATE = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_OUTSIDE_TYP = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_PUCH_ODR_CD = null;
		m_OPR_INST_SLIP_ISS_DATE = null;
		m_ACPT_INSPC_TYP = null;
		m_STATUS_DN = null;
		m_IN_PLANT_CD = null;
		m_IN_WS_CD = null;
		m_IN_VEND_CD = null;
		m_IN_ITEM_CD = null;
		m_IN_WORK_ODR_CD = null;
		m_IN_OPR_INST_CD = null;
		m_IN_JOB_ODR_CD = null;
		m_L_IN_OPR_INST_START_DATE_FROM = null;
		m_L_IN_OPR_INST_START_DATE_TO = null;
		m_L_IN_OPR_INST_START_DATE_FROM_ZERO = null;
		m_L_IN_WORK_ODR_DLV_DATE_FROM = null;
		m_L_IN_WORK_ODR_DLV_DATE_TO = null;
		m_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = null;
		m_STATUS1 = null;
		m_STATUS2 = null;
		m_STATUS3 = null;
		m_STATUS4 = null;
		m_STATUS5 = null;
		m_STATUS6 = null;
		m_readPLAN_CD = null;
		m_IN_PLANT_NAME = null;
		m_readWS_CD = null;
		m_IN_WS_NAME = null;
		m_readWS_PLANT_CD = null;
		m_readVEND_CD = null;
		m_IN_VEND_NAME = null;
		m_readITEM_CD = null;
		m_IN_ITEM_NAME = null;
		m_readWORK_ODR_CD = null;
		m_readPLANT_CD = null;
		m_readOPR_INST_CD = null;
		m_readJOB_ODR_CD = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_c3_WORK_STS_TYP = null;
		l_DOWNLOAD_FILE = null;
		l_IN_OPR_INST_START_DATE_FROM = null;
		l_IN_OPR_INST_START_DATE_TO = null;
		l_IN_WORK_ODR_DLV_DATE_FROM = null;
		l_IN_WORK_ODR_DLV_DATE_TO = null;
		l_c4_WORK_STS_TYP = null;
		l_c5_WORK_STS_TYP = null;
		l_c6_WORK_STS_TYP = null;
		l_c1_WORK_STS_TYP = null;
		l_c2_WORK_STS_TYP = null;
		l_IN_OPR_INST_START_TIME_FROM = null;
		l_IN_OPR_INST_START_TIME_TO = null;
		l_IN_WORK_ODR_DLV_TIME_FROM = null;
		l_IN_WORK_ODR_DLV_TIME_TO = null;
		l_PLANT_CD = null;
		l_WORK_ODR_CD = null;
		l_PROC_NO = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_WORK_ODR_DLV_DATE = null;
		l_OPR_INST_START_DATE = null;
		l_OPR_INST_CD = null;
		l_OPR_INST_DATE = null;
		l_OPR_INST_QTY = null;
		l_SUM_ACPT_QTY = null;
		l_SUM_DEFECT_QTY = null;
		l_STOCK_UNIT = null;
		l_WORK_STS_NAME = null;
		l_WORK_CMPLT_DATE = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_OUTSIDE_TYP = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_PUCH_ODR_CD = null;
		l_OPR_INST_SLIP_ISS_DATE = null;
		l_ACPT_INSPC_TYP = null;
		l_STATUS_DN = null;
		l_IN_PLANT_CD = null;
		l_IN_WS_CD = null;
		l_IN_VEND_CD = null;
		l_IN_ITEM_CD = null;
		l_IN_WORK_ODR_CD = null;
		l_IN_OPR_INST_CD = null;
		l_IN_JOB_ODR_CD = null;
		l_L_IN_OPR_INST_START_DATE_FROM = null;
		l_L_IN_OPR_INST_START_DATE_TO = null;
		l_L_IN_OPR_INST_START_DATE_FROM_ZERO = null;
		l_L_IN_WORK_ODR_DLV_DATE_FROM = null;
		l_L_IN_WORK_ODR_DLV_DATE_TO = null;
		l_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = null;
		l_STATUS1 = null;
		l_STATUS2 = null;
		l_STATUS3 = null;
		l_STATUS4 = null;
		l_STATUS5 = null;
		l_STATUS6 = null;
		l_readPLAN_CD = null;
		l_IN_PLANT_NAME = null;
		l_readWS_CD = null;
		l_IN_WS_NAME = null;
		l_readWS_PLANT_CD = null;
		l_readVEND_CD = null;
		l_IN_VEND_NAME = null;
		l_readITEM_CD = null;
		l_IN_ITEM_NAME = null;
		l_readWORK_ODR_CD = null;
		l_readPLANT_CD = null;
		l_readOPR_INST_CD = null;
		l_readJOB_ODR_CD = null;
		l_TIME_CTRL = null;
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
	 * medAD0070010�N���X�̕W���R���X�g���N�^
	 */
	public AD0070010Struct()
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
	public void setStruct(AD0070010Struct struct)
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
	public void setStructM(AD0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setc3_WORK_STS_TYP(struct.getc3_WORK_STS_TYP());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setIN_OPR_INST_START_DATE_FROM(struct.getIN_OPR_INST_START_DATE_FROM());
			this.setIN_OPR_INST_START_DATE_TO(struct.getIN_OPR_INST_START_DATE_TO());
			this.setIN_WORK_ODR_DLV_DATE_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
			this.setIN_WORK_ODR_DLV_DATE_TO(struct.getIN_WORK_ODR_DLV_DATE_TO());
			this.setc4_WORK_STS_TYP(struct.getc4_WORK_STS_TYP());
			this.setc5_WORK_STS_TYP(struct.getc5_WORK_STS_TYP());
			this.setc6_WORK_STS_TYP(struct.getc6_WORK_STS_TYP());
			this.setc1_WORK_STS_TYP(struct.getc1_WORK_STS_TYP());
			this.setc2_WORK_STS_TYP(struct.getc2_WORK_STS_TYP());
			this.setIN_OPR_INST_START_TIME_FROM(struct.getIN_OPR_INST_START_TIME_FROM());
			this.setIN_OPR_INST_START_TIME_TO(struct.getIN_OPR_INST_START_TIME_TO());
			this.setIN_WORK_ODR_DLV_TIME_FROM(struct.getIN_WORK_ODR_DLV_TIME_FROM());
			this.setIN_WORK_ODR_DLV_TIME_TO(struct.getIN_WORK_ODR_DLV_TIME_TO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setPROC_NO(struct.getPROC_NO());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setOPR_INST_DATE(struct.getOPR_INST_DATE());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setSUM_ACPT_QTY(struct.getSUM_ACPT_QTY());
			this.setSUM_DEFECT_QTY(struct.getSUM_DEFECT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setWORK_STS_NAME(struct.getWORK_STS_NAME());
			this.setWORK_CMPLT_DATE(struct.getWORK_CMPLT_DATE());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setOPR_INST_SLIP_ISS_DATE(struct.getOPR_INST_SLIP_ISS_DATE());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setSTATUS_DN(struct.getSTATUS_DN());
			this.setIN_PLANT_CD(struct.getIN_PLANT_CD());
			this.setIN_WS_CD(struct.getIN_WS_CD());
			this.setIN_VEND_CD(struct.getIN_VEND_CD());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
			this.setIN_WORK_ODR_CD(struct.getIN_WORK_ODR_CD());
			this.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			this.setIN_JOB_ODR_CD(struct.getIN_JOB_ODR_CD());
			this.setL_IN_OPR_INST_START_DATE_FROM(struct.getL_IN_OPR_INST_START_DATE_FROM());
			this.setL_IN_OPR_INST_START_DATE_TO(struct.getL_IN_OPR_INST_START_DATE_TO());
			this.setL_IN_OPR_INST_START_DATE_FROM_ZERO(struct.getL_IN_OPR_INST_START_DATE_FROM_ZERO());
			this.setL_IN_WORK_ODR_DLV_DATE_FROM(struct.getL_IN_WORK_ODR_DLV_DATE_FROM());
			this.setL_IN_WORK_ODR_DLV_DATE_TO(struct.getL_IN_WORK_ODR_DLV_DATE_TO());
			this.setL_IN_WORK_ODR_DLV_DATE_FROM_ZERO(struct.getL_IN_WORK_ODR_DLV_DATE_FROM_ZERO());
			this.setSTATUS1(struct.getSTATUS1());
			this.setSTATUS2(struct.getSTATUS2());
			this.setSTATUS3(struct.getSTATUS3());
			this.setSTATUS4(struct.getSTATUS4());
			this.setSTATUS5(struct.getSTATUS5());
			this.setSTATUS6(struct.getSTATUS6());
			this.setreadPLAN_CD(struct.getreadPLAN_CD());
			this.setIN_PLANT_NAME(struct.getIN_PLANT_NAME());
			this.setreadWS_CD(struct.getreadWS_CD());
			this.setIN_WS_NAME(struct.getIN_WS_NAME());
			this.setreadWS_PLANT_CD(struct.getreadWS_PLANT_CD());
			this.setreadVEND_CD(struct.getreadVEND_CD());
			this.setIN_VEND_NAME(struct.getIN_VEND_NAME());
			this.setreadITEM_CD(struct.getreadITEM_CD());
			this.setIN_ITEM_NAME(struct.getIN_ITEM_NAME());
			this.setreadWORK_ODR_CD(struct.getreadWORK_ODR_CD());
			this.setreadPLANT_CD(struct.getreadPLANT_CD());
			this.setreadOPR_INST_CD(struct.getreadOPR_INST_CD());
			this.setreadJOB_ODR_CD(struct.getreadJOB_ODR_CD());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_c3_WORK_STS_TYP(struct.getList_c3_WORK_STS_TYP());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_IN_OPR_INST_START_DATE_FROM(struct.getList_IN_OPR_INST_START_DATE_FROM());
			this.setList_IN_OPR_INST_START_DATE_TO(struct.getList_IN_OPR_INST_START_DATE_TO());
			this.setList_IN_WORK_ODR_DLV_DATE_FROM(struct.getList_IN_WORK_ODR_DLV_DATE_FROM());
			this.setList_IN_WORK_ODR_DLV_DATE_TO(struct.getList_IN_WORK_ODR_DLV_DATE_TO());
			this.setList_c4_WORK_STS_TYP(struct.getList_c4_WORK_STS_TYP());
			this.setList_c5_WORK_STS_TYP(struct.getList_c5_WORK_STS_TYP());
			this.setList_c6_WORK_STS_TYP(struct.getList_c6_WORK_STS_TYP());
			this.setList_c1_WORK_STS_TYP(struct.getList_c1_WORK_STS_TYP());
			this.setList_c2_WORK_STS_TYP(struct.getList_c2_WORK_STS_TYP());
			this.setList_IN_OPR_INST_START_TIME_FROM(struct.getList_IN_OPR_INST_START_TIME_FROM());
			this.setList_IN_OPR_INST_START_TIME_TO(struct.getList_IN_OPR_INST_START_TIME_TO());
			this.setList_IN_WORK_ODR_DLV_TIME_FROM(struct.getList_IN_WORK_ODR_DLV_TIME_FROM());
			this.setList_IN_WORK_ODR_DLV_TIME_TO(struct.getList_IN_WORK_ODR_DLV_TIME_TO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_OPR_INST_DATE(struct.getList_OPR_INST_DATE());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_SUM_ACPT_QTY(struct.getList_SUM_ACPT_QTY());
			this.setList_SUM_DEFECT_QTY(struct.getList_SUM_DEFECT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_WORK_STS_NAME(struct.getList_WORK_STS_NAME());
			this.setList_WORK_CMPLT_DATE(struct.getList_WORK_CMPLT_DATE());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_OPR_INST_SLIP_ISS_DATE(struct.getList_OPR_INST_SLIP_ISS_DATE());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_STATUS_DN(struct.getList_STATUS_DN());
			this.setList_IN_PLANT_CD(struct.getList_IN_PLANT_CD());
			this.setList_IN_WS_CD(struct.getList_IN_WS_CD());
			this.setList_IN_VEND_CD(struct.getList_IN_VEND_CD());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
			this.setList_IN_WORK_ODR_CD(struct.getList_IN_WORK_ODR_CD());
			this.setList_IN_OPR_INST_CD(struct.getList_IN_OPR_INST_CD());
			this.setList_IN_JOB_ODR_CD(struct.getList_IN_JOB_ODR_CD());
			this.setList_L_IN_OPR_INST_START_DATE_FROM(struct.getList_L_IN_OPR_INST_START_DATE_FROM());
			this.setList_L_IN_OPR_INST_START_DATE_TO(struct.getList_L_IN_OPR_INST_START_DATE_TO());
			this.setList_L_IN_OPR_INST_START_DATE_FROM_ZERO(struct.getList_L_IN_OPR_INST_START_DATE_FROM_ZERO());
			this.setList_L_IN_WORK_ODR_DLV_DATE_FROM(struct.getList_L_IN_WORK_ODR_DLV_DATE_FROM());
			this.setList_L_IN_WORK_ODR_DLV_DATE_TO(struct.getList_L_IN_WORK_ODR_DLV_DATE_TO());
			this.setList_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO(struct.getList_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO());
			this.setList_STATUS1(struct.getList_STATUS1());
			this.setList_STATUS2(struct.getList_STATUS2());
			this.setList_STATUS3(struct.getList_STATUS3());
			this.setList_STATUS4(struct.getList_STATUS4());
			this.setList_STATUS5(struct.getList_STATUS5());
			this.setList_STATUS6(struct.getList_STATUS6());
			this.setList_readPLAN_CD(struct.getList_readPLAN_CD());
			this.setList_IN_PLANT_NAME(struct.getList_IN_PLANT_NAME());
			this.setList_readWS_CD(struct.getList_readWS_CD());
			this.setList_IN_WS_NAME(struct.getList_IN_WS_NAME());
			this.setList_readWS_PLANT_CD(struct.getList_readWS_PLANT_CD());
			this.setList_readVEND_CD(struct.getList_readVEND_CD());
			this.setList_IN_VEND_NAME(struct.getList_IN_VEND_NAME());
			this.setList_readITEM_CD(struct.getList_readITEM_CD());
			this.setList_IN_ITEM_NAME(struct.getList_IN_ITEM_NAME());
			this.setList_readWORK_ODR_CD(struct.getList_readWORK_ODR_CD());
			this.setList_readPLANT_CD(struct.getList_readPLANT_CD());
			this.setList_readOPR_INST_CD(struct.getList_readOPR_INST_CD());
			this.setList_readJOB_ODR_CD(struct.getList_readJOB_ODR_CD());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// �� 1 �ϐ������l�F i_c3_WORK_STS_TYP


	final static String i_c3_WORK_STS_TYP = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_IN_OPR_INST_START_DATE_FROM


	final static String i_IN_OPR_INST_START_DATE_FROM = null;

	// �� 4 �ϐ������l�F i_IN_OPR_INST_START_DATE_TO


	final static String i_IN_OPR_INST_START_DATE_TO = null;

	// �� 5 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_FROM


	final static String i_IN_WORK_ODR_DLV_DATE_FROM = null;

	// �� 6 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_TO


	final static String i_IN_WORK_ODR_DLV_DATE_TO = null;

	// �� 7 �ϐ������l�F i_c4_WORK_STS_TYP


	final static String i_c4_WORK_STS_TYP = null;

	// �� 8 �ϐ������l�F i_c5_WORK_STS_TYP


	final static String i_c5_WORK_STS_TYP = null;

	// �� 9 �ϐ������l�F i_c6_WORK_STS_TYP


	final static String i_c6_WORK_STS_TYP = null;

	// �� 10 �ϐ������l�F i_c1_WORK_STS_TYP


	final static String i_c1_WORK_STS_TYP = null;

	// �� 11 �ϐ������l�F i_c2_WORK_STS_TYP


	final static String i_c2_WORK_STS_TYP = null;

	// �� 12 �ϐ������l�F i_IN_OPR_INST_START_TIME_FROM


	final static String i_IN_OPR_INST_START_TIME_FROM = null;

	// �� 13 �ϐ������l�F i_IN_OPR_INST_START_TIME_TO


	final static String i_IN_OPR_INST_START_TIME_TO = null;

	// �� 14 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_FROM


	final static String i_IN_WORK_ODR_DLV_TIME_FROM = null;

	// �� 15 �ϐ������l�F i_IN_WORK_ODR_DLV_TIME_TO


	final static String i_IN_WORK_ODR_DLV_TIME_TO = null;

	// �� 16 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 17 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 18 �ϐ������l�F i_PROC_NO


	final static String i_PROC_NO = null;

	// �� 19 �ϐ������l�F i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// �� 20 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 21 �ϐ������l�F i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// �� 22 �ϐ������l�F i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// �� 23 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 24 �ϐ������l�F i_OPR_INST_DATE


	final static String i_OPR_INST_DATE = null;

	// �� 25 �ϐ������l�F i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// �� 26 �ϐ������l�F i_SUM_ACPT_QTY


	final static String i_SUM_ACPT_QTY = null;

	// �� 27 �ϐ������l�F i_SUM_DEFECT_QTY


	final static String i_SUM_DEFECT_QTY = null;

	// �� 28 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 29 �ϐ������l�F i_WORK_STS_NAME


	final static String i_WORK_STS_NAME = null;

	// �� 30 �ϐ������l�F i_WORK_CMPLT_DATE


	final static String i_WORK_CMPLT_DATE = null;

	// �� 31 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 32 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 33 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 34 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 35 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 36 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 37 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 38 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 39 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 40 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 41 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 42 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 43 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 44 �ϐ������l�F i_OPR_INST_SLIP_ISS_DATE


	final static String i_OPR_INST_SLIP_ISS_DATE = null;

	// �� 45 �ϐ������l�F i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// �� 46 �ϐ������l�F i_STATUS_DN


	final static String i_STATUS_DN = null;

	// �� 47 �ϐ������l�F i_IN_PLANT_CD


	final static String i_IN_PLANT_CD = null;

	// �� 48 �ϐ������l�F i_IN_WS_CD


	final static String i_IN_WS_CD = null;

	// �� 49 �ϐ������l�F i_IN_VEND_CD


	final static String i_IN_VEND_CD = null;

	// �� 50 �ϐ������l�F i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

	// �� 51 �ϐ������l�F i_IN_WORK_ODR_CD


	final static String i_IN_WORK_ODR_CD = null;

	// �� 52 �ϐ������l�F i_IN_OPR_INST_CD


	final static String i_IN_OPR_INST_CD = null;

	// �� 53 �ϐ������l�F i_IN_JOB_ODR_CD


	final static String i_IN_JOB_ODR_CD = null;

	// �� 54 �ϐ������l�F i_L_IN_OPR_INST_START_DATE_FROM


	final static String i_L_IN_OPR_INST_START_DATE_FROM = null;

	// �� 55 �ϐ������l�F i_L_IN_OPR_INST_START_DATE_TO


	final static String i_L_IN_OPR_INST_START_DATE_TO = null;

	// �� 56 �ϐ������l�F i_L_IN_OPR_INST_START_DATE_FROM_ZERO


	final static String i_L_IN_OPR_INST_START_DATE_FROM_ZERO = null;

	// �� 57 �ϐ������l�F i_L_IN_WORK_ODR_DLV_DATE_FROM


	final static String i_L_IN_WORK_ODR_DLV_DATE_FROM = null;

	// �� 58 �ϐ������l�F i_L_IN_WORK_ODR_DLV_DATE_TO


	final static String i_L_IN_WORK_ODR_DLV_DATE_TO = null;

	// �� 59 �ϐ������l�F i_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO


	final static String i_L_IN_WORK_ODR_DLV_DATE_FROM_ZERO = null;

	// �� 60 �ϐ������l�F i_STATUS1


	final static String i_STATUS1 = null;

	// �� 61 �ϐ������l�F i_STATUS2


	final static String i_STATUS2 = null;

	// �� 62 �ϐ������l�F i_STATUS3


	final static String i_STATUS3 = null;

	// �� 63 �ϐ������l�F i_STATUS4


	final static String i_STATUS4 = null;

	// �� 64 �ϐ������l�F i_STATUS5


	final static String i_STATUS5 = null;

	// �� 65 �ϐ������l�F i_STATUS6


	final static String i_STATUS6 = null;

	// �� 66 �ϐ������l�F i_readPLAN_CD


	final static String i_readPLAN_CD = null;

	// �� 67 �ϐ������l�F i_IN_PLANT_NAME


	final static String i_IN_PLANT_NAME = null;

	// �� 68 �ϐ������l�F i_readWS_CD


	final static String i_readWS_CD = null;

	// �� 69 �ϐ������l�F i_IN_WS_NAME


	final static String i_IN_WS_NAME = null;

	// �� 70 �ϐ������l�F i_readWS_PLANT_CD


	final static String i_readWS_PLANT_CD = null;

	// �� 71 �ϐ������l�F i_readVEND_CD


	final static String i_readVEND_CD = null;

	// �� 72 �ϐ������l�F i_IN_VEND_NAME


	final static String i_IN_VEND_NAME = null;

	// �� 73 �ϐ������l�F i_readITEM_CD


	final static String i_readITEM_CD = null;

	// �� 74 �ϐ������l�F i_IN_ITEM_NAME


	final static String i_IN_ITEM_NAME = null;

	// �� 75 �ϐ������l�F i_readWORK_ODR_CD


	final static String i_readWORK_ODR_CD = null;

	// �� 76 �ϐ������l�F i_readPLANT_CD


	final static String i_readPLANT_CD = null;

	// �� 77 �ϐ������l�F i_readOPR_INST_CD


	final static String i_readOPR_INST_CD = null;

	// �� 78 �ϐ������l�F i_readJOB_ODR_CD


	final static String i_readJOB_ODR_CD = null;

	// �� 79 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 80 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 81 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_PLANT_CD
	final static String i_PLANT_CD = null;
	// �� 2 �ϐ������l�F i_WORK_ODR_CD
	final static String i_WORK_ODR_CD = null;
	// �� 3 �ϐ������l�F i_PROC_NO
	final static String i_PROC_NO = null;
	// �� 4 �ϐ������l�F i_WORK_IN_PROC_CD
	final static String i_WORK_IN_PROC_CD = null;
	// �� 5 �ϐ������l�F i_PROC_NAME
	final static String i_PROC_NAME = null;
	// �� 6 �ϐ������l�F i_WORK_ODR_DLV_DATE
	final static String i_WORK_ODR_DLV_DATE = null;
	// �� 7 �ϐ������l�F i_OPR_INST_START_DATE
	final static String i_OPR_INST_START_DATE = null;
	// �� 8 �ϐ������l�F i_OPR_INST_CD
	final static String i_OPR_INST_CD = null;
	// �� 9 �ϐ������l�F i_OPR_INST_DATE
	final static String i_OPR_INST_DATE = null;
	// �� 10 �ϐ������l�F i_OPR_INST_QTY
	final static String i_OPR_INST_QTY = null;
	// �� 11 �ϐ������l�F i_SUM_ACPT_QTY
	final static String i_SUM_ACPT_QTY = null;
	// �� 12 �ϐ������l�F i_SUM_DEFECT_QTY
	final static String i_SUM_DEFECT_QTY = null;
	// �� 13 �ϐ������l�F i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// �� 14 �ϐ������l�F i_WORK_STS_NAME
	final static String i_WORK_STS_NAME = null;
	// �� 15 �ϐ������l�F i_WORK_CMPLT_DATE
	final static String i_WORK_CMPLT_DATE = null;
	// �� 16 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 17 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 18 �ϐ������l�F i_DRAW_CD
	final static String i_DRAW_CD = null;
	// �� 19 �ϐ������l�F i_SPEC
	final static String i_SPEC = null;
	// �� 20 �ϐ������l�F i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;
	// �� 21 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 22 �ϐ������l�F i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// �� 23 �ϐ������l�F i_OUTSIDE_TYP
	final static String i_OUTSIDE_TYP = null;
	// �� 24 �ϐ������l�F i_WS_CD
	final static String i_WS_CD = null;
	// �� 25 �ϐ������l�F i_WS_NAME
	final static String i_WS_NAME = null;
	// �� 26 �ϐ������l�F i_VEND_CD
	final static String i_VEND_CD = null;
	// �� 27 �ϐ������l�F i_VEND_ANAME
	final static String i_VEND_ANAME = null;
	// �� 28 �ϐ������l�F i_PUCH_ODR_CD
	final static String i_PUCH_ODR_CD = null;
	// �� 29 �ϐ������l�F i_OPR_INST_SLIP_ISS_DATE
	final static String i_OPR_INST_SLIP_ISS_DATE = null;
	// �� 30 �ϐ������l�F i_ACPT_INSPC_TYP
	final static String i_ACPT_INSPC_TYP = null;
	// �� 31 �ϐ������l�F i_IN_PLANT_CD
	final static String i_IN_PLANT_CD = null;
	// �� 32 �ϐ������l�F i_IN_WS_CD
	final static String i_IN_WS_CD = null;
	// �� 33 �ϐ������l�F i_IN_VEND_CD
	final static String i_IN_VEND_CD = null;
	// �� 34 �ϐ������l�F i_IN_ITEM_CD
	final static String i_IN_ITEM_CD = null;
	// �� 35 �ϐ������l�F i_IN_WORK_ODR_CD
	final static String i_IN_WORK_ODR_CD = null;
	// �� 36 �ϐ������l�F i_IN_OPR_INST_CD
	final static String i_IN_OPR_INST_CD = null;
	// �� 37 �ϐ������l�F i_IN_JOB_ODR_CD
	final static String i_IN_JOB_ODR_CD = null;
	// �� 38 �ϐ������l�F i_IN_OPR_INST_START_DATE_FROM
	final static String i_IN_OPR_INST_START_DATE_FROM = null;
	// �� 39 �ϐ������l�F i_IN_OPR_INST_START_DATE_TO
	final static String i_IN_OPR_INST_START_DATE_TO = null;
	// �� 40 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_FROM
	final static String i_IN_WORK_ODR_DLV_DATE_FROM = null;
	// �� 41 �ϐ������l�F i_IN_WORK_ODR_DLV_DATE_TO
	final static String i_IN_WORK_ODR_DLV_DATE_TO = null;
	// �� 42 �ϐ������l�F i_IN_WORKSTSTYP1
	final static String i_IN_WORKSTSTYP1 = null;
	// �� 43 �ϐ������l�F i_IN_WORKSTSTYP2
	final static String i_IN_WORKSTSTYP2 = null;
	// �� 44 �ϐ������l�F i_IN_WORKSTSTYP3
	final static String i_IN_WORKSTSTYP3 = null;
	// �� 45 �ϐ������l�F i_readPLAN_CD
	final static String i_readPLAN_CD = null;
	// �� 46 �ϐ������l�F i_IN_PLANT_NAME
	final static String i_IN_PLANT_NAME = null;
	// �� 47 �ϐ������l�F i_readWS_CD
	final static String i_readWS_CD = null;
	// �� 48 �ϐ������l�F i_IN_WS_NAME
	final static String i_IN_WS_NAME = null;
	// �� 49 �ϐ������l�F i_readWS_PLANT_CD
	final static String i_readWS_PLANT_CD = null;
	// �� 50 �ϐ������l�F i_readVEND_CD
	final static String i_readVEND_CD = null;
	// �� 51 �ϐ������l�F i_IN_VEND_NAME
	final static String i_IN_VEND_NAME = null;
	// �� 52 �ϐ������l�F i_readITEM_CD
	final static String i_readITEM_CD = null;
	// �� 53 �ϐ������l�F i_IN_ITEM_NAME
	final static String i_IN_ITEM_NAME = null;
	// �� 54 �ϐ������l�F i_readWORK_ODR_CD
	final static String i_readWORK_ODR_CD = null;
	// �� 55 �ϐ������l�F i_readPLANT_CD
	final static String i_readPLANT_CD = null;
	// �� 56 �ϐ������l�F i_readOPR_INST_CD
	final static String i_readOPR_INST_CD = null;
	// �� 57 �ϐ������l�F i_readJOB_ODR_CD
	final static String i_readJOB_ODR_CD = null;
	// �� 58 �ϐ������l�F i_c1_WORK_STS_TYP
	final static String i_c1_WORK_STS_TYP = null;
	// �� 59 �ϐ������l�F i_c2_WORK_STS_TYP
	final static String i_c2_WORK_STS_TYP = null;
	// �� 60 �ϐ������l�F i_c3_WORK_STS_TYP
	final static String i_c3_WORK_STS_TYP = null;
	// �� 61 �ϐ������l�F i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_PLANT_CD = i_PLANT_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_PROC_NO = i_PROC_NO;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_OPR_INST_DATE = i_OPR_INST_DATE;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_SUM_ACPT_QTY = i_SUM_ACPT_QTY;
		m_SUM_DEFECT_QTY = i_SUM_DEFECT_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_WORK_STS_NAME = i_WORK_STS_NAME;
		m_WORK_CMPLT_DATE = i_WORK_CMPLT_DATE;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_WS_CD = i_WS_CD;
		m_WS_NAME = i_WS_NAME;
		m_VEND_CD = i_VEND_CD;
		m_VEND_ANAME = i_VEND_ANAME;
		m_IN_PLANT_CD = i_IN_PLANT_CD;
		m_IN_WS_CD = i_IN_WS_CD;
		m_IN_VEND_CD = i_IN_VEND_CD;
		m_IN_ITEM_CD = i_IN_ITEM_CD;
		m_IN_WORK_ODR_CD = i_IN_WORK_ODR_CD;
		m_IN_OPR_INST_CD = i_IN_OPR_INST_CD;
		m_IN_JOB_ODR_CD = i_IN_JOB_ODR_CD;
		m_IN_OPR_INST_START_DATE_FROM = i_IN_OPR_INST_START_DATE_FROM;
		m_IN_OPR_INST_START_DATE_TO = i_IN_OPR_INST_START_DATE_TO;
		m_IN_WORK_ODR_DLV_DATE_FROM = i_IN_WORK_ODR_DLV_DATE_FROM;
		m_IN_WORK_ODR_DLV_DATE_TO = i_IN_WORK_ODR_DLV_DATE_TO;
/* 20050727
		m_IN_WORKSTSTYP1 = i_IN_WORKSTSTYP1;
		m_IN_WORKSTSTYP2 = i_IN_WORKSTSTYP2;
		m_IN_WORKSTSTYP3 = i_IN_WORKSTSTYP3;
*/
		m_readPLAN_CD = i_readPLAN_CD;
		m_IN_PLANT_NAME = i_IN_PLANT_NAME;
		m_readWS_CD = i_readWS_CD;
		m_IN_WS_NAME = i_IN_WS_NAME;
		m_readWS_PLANT_CD = i_readWS_PLANT_CD;
		m_readVEND_CD = i_readVEND_CD;
		m_IN_VEND_NAME = i_IN_VEND_NAME;
		m_readITEM_CD = i_readITEM_CD;
		m_IN_ITEM_NAME = i_IN_ITEM_NAME;
		m_readWORK_ODR_CD = i_readWORK_ODR_CD;
		m_readPLANT_CD = i_readPLANT_CD;
		m_readOPR_INST_CD = i_readOPR_INST_CD;
		m_readJOB_ODR_CD = i_readJOB_ODR_CD;
		m_c1_WORK_STS_TYP = i_c1_WORK_STS_TYP;
		m_c2_WORK_STS_TYP = i_c2_WORK_STS_TYP;
		m_c3_WORK_STS_TYP = i_c3_WORK_STS_TYP;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_OPR_INST_SLIP_ISS_DATE = i_OPR_INST_SLIP_ISS_DATE;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
