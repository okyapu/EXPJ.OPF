/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0160/src/com/nec/jp/orteus/metamorBase/AC0160/AC0160010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0160;

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
 * CLASS     : AC0160010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2015/11/05 05:26:16 $
 *
 */
//}}user_implement_code_header

public class AC0160010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_r1_FILTER1 */
	public String m_r1_FILTER1 = null;
	/** �� 2 �ϐ��F m_r2_FILTER1 */
	public String m_r2_FILTER1 = null;
	/** �� 3 �ϐ��F m_w_OD_TYP */
	public String m_w_OD_TYP = null;
	/** �� 4 �ϐ��F m_w_OD_TYP_name */
	public String m_w_OD_TYP_name = null;
	/** �� 5 �ϐ��F m_w_OD_TYP_val */
	public String m_w_OD_TYP_val = null;
	/** �� 6 �ϐ��F m_PRODUCT_TYP_name */
	public String m_PRODUCT_TYP_name = null;
	/** �� 7 �ϐ��F m_PRODUCT_TYP_val */
	public String m_PRODUCT_TYP_val = null;
	/** �� 8 �ϐ��F m_r1_FILTER2 */
	public String m_r1_FILTER2 = null;
	/** �� 9 �ϐ��F m_c1_ODR_STS_TYP */
	public String m_c1_ODR_STS_TYP = null;
	/** �� 10 �ϐ��F m_c2_ODR_STS_TYP */
	public String m_c2_ODR_STS_TYP = null;
	/** �� 11 �ϐ��F m_c3_ODR_STS_TYP */
	public String m_c3_ODR_STS_TYP = null;
	/** �� 12 �ϐ��F m_CONFIRM_DLV_DATE */
	public String m_CONFIRM_DLV_DATE = null;
	/** �� 13 �ϐ��F m_WH_CD_2 */
	public String m_WH_CD_2 = null;
	/** �� 14 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 15 �ϐ��F m_NON_NO_ITEM_NAME */
	public String m_NON_NO_ITEM_NAME = null;
	/** �� 16 �ϐ��F m_NON_NO_ITEM_PUCH_ODR_UNIT */
	public String m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
	/** �� 17 �ϐ��F m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** �� 18 �ϐ��F m_r2_FILTER2 */
	public String m_r2_FILTER2 = null;
	/** �� 19 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 20 �ϐ��F m_TXT_FILE */
	public String m_TXT_FILE = null;
	/** �� 21 �ϐ��F m_UNIT_COST_TYP_VAL */
	public String m_UNIT_COST_TYP_VAL = null;
	/** �� 22 �ϐ��F m_readITEM_CD */
	public String m_readITEM_CD = null;
	/** �� 23 �ϐ��F m_IN_ITEM_NAME */
	public String m_IN_ITEM_NAME = null;
	/** �� 24 �ϐ��F m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;
	/** �� 25 �ϐ��F m_readWS_CD */
	public String m_readWS_CD = null;
	/** �� 26 �ϐ��F m_IN_WS_NAME */
	public String m_IN_WS_NAME = null;
	/** �� 27 �ϐ��F m_readWS_PLANT_CD */
	public String m_readWS_PLANT_CD = null;
	/** �� 28 �ϐ��F m_IN_WS_CD */
	public String m_IN_WS_CD = null;
	/** �� 29 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 30 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 31 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 32 �ϐ��F m_PRD_START_DATE */
	public String m_PRD_START_DATE = null;
	/** �� 33 �ϐ��F m_OPR_INST_PUCH_ODR_QTY */
	public String m_OPR_INST_PUCH_ODR_QTY = null;
	/** �� 34 �ϐ��F m_WS_VEND_CD */
	public String m_WS_VEND_CD = null;
	/** �� 35 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 36 �ϐ��F m_h_ODR_STS_TYP */
	public String m_h_ODR_STS_TYP = null;
	/** �� 37 �ϐ��F m_InR1_OD_TYP */
	public String m_InR1_OD_TYP = null;
	/** �� 38 �ϐ��F m_InC1_ODR_STS_TYP */
	public String m_InC1_ODR_STS_TYP = null;
	/** �� 39 �ϐ��F m_InC2_ODR_STS_TYP */
	public String m_InC2_ODR_STS_TYP = null;
	/** �� 40 �ϐ��F m_InC3_ODR_STS_TYP */
	public String m_InC3_ODR_STS_TYP = null;
	/** �� 41 �ϐ��F m_InPLANT_CD */
	public String m_InPLANT_CD = null;
	/** �� 42 �ϐ��F m_IN_PRD_START_DATE_FROM */
	public String m_IN_PRD_START_DATE_FROM = null;
	/** �� 43 �ϐ��F m_IN_PRD_START_DATE_TO */
	public String m_IN_PRD_START_DATE_TO = null;
	/** �� 44 �ϐ��F m_IN_PRD_DUE_DATE_FROM */
	public String m_IN_PRD_DUE_DATE_FROM = null;
	/** �� 45 �ϐ��F m_IN_PRD_DUE_DATE_TO */
	public String m_IN_PRD_DUE_DATE_TO = null;
	/** �� 46 �ϐ��F m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** �� 47 �ϐ��F m_NON_NO_ITEM_FLG */
	public String m_NON_NO_ITEM_FLG = null;
	/** �� 48 �ϐ��F m_NON_NO_ITEM_TYP */
	public String m_NON_NO_ITEM_TYP = null;
	/** �� 49 �ϐ��F m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** �� 50 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 51 �ϐ��F m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** �� 52 �ϐ��F m_EXCH_START_DATE */
	public String m_EXCH_START_DATE = null;
	/** �� 53 �ϐ��F m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** �� 54 �ϐ��F m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** �� 55 �ϐ��F m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** �� 56 �ϐ��F m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** �� 57 �ϐ��F m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** �� 58 �ϐ��F m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** �� 59 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 60 �ϐ��F m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** �� 61 �ϐ��F m_l_COUNT_1 */
	public String m_l_COUNT_1 = null;
	/** �� 62 �ϐ��F m_ROW_COUNT_1 */
	public String m_ROW_COUNT_1 = null;
	/** �� 63 �ϐ��F m_l_COUNT_2 */
	public String m_l_COUNT_2 = null;
	/** �� 64 �ϐ��F m_ROW_COUNT_2 */
	public String m_ROW_COUNT_2 = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_r1_FILTER1 */
	public List l_r1_FILTER1 = null;

	/** �� 2 List�ϐ��F l_r2_FILTER1 */
	public List l_r2_FILTER1 = null;

	/** �� 3 List�ϐ��F l_w_OD_TYP */
	public List l_w_OD_TYP = null;

	/** �� 4 List�ϐ��F l_w_OD_TYP_name */
	public List l_w_OD_TYP_name = null;

	/** �� 5 List�ϐ��F l_w_OD_TYP_val */
	public List l_w_OD_TYP_val = null;

	/** �� 6 List�ϐ��F l_PRODUCT_TYP_name */
	public List l_PRODUCT_TYP_name = null;

	/** �� 7 List�ϐ��F l_PRODUCT_TYP_val */
	public List l_PRODUCT_TYP_val = null;

	/** �� 8 List�ϐ��F l_r1_FILTER2 */
	public List l_r1_FILTER2 = null;

	/** �� 9 List�ϐ��F l_c1_ODR_STS_TYP */
	public List l_c1_ODR_STS_TYP = null;

	/** �� 10 List�ϐ��F l_c2_ODR_STS_TYP */
	public List l_c2_ODR_STS_TYP = null;

	/** �� 11 List�ϐ��F l_c3_ODR_STS_TYP */
	public List l_c3_ODR_STS_TYP = null;

	/** �� 12 List�ϐ��F l_CONFIRM_DLV_DATE */
	public List l_CONFIRM_DLV_DATE = null;

	/** �� 13 List�ϐ��F l_WH_CD_2 */
	public List l_WH_CD_2 = null;

	/** �� 14 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 15 List�ϐ��F l_NON_NO_ITEM_NAME */
	public List l_NON_NO_ITEM_NAME = null;

	/** �� 16 List�ϐ��F l_NON_NO_ITEM_PUCH_ODR_UNIT */
	public List l_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	/** �� 17 List�ϐ��F l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** �� 18 List�ϐ��F l_r2_FILTER2 */
	public List l_r2_FILTER2 = null;

	/** �� 19 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 20 List�ϐ��F l_TXT_FILE */
	public List l_TXT_FILE = null;

	/** �� 21 List�ϐ��F l_UNIT_COST_TYP_VAL */
	public List l_UNIT_COST_TYP_VAL = null;

	/** �� 22 List�ϐ��F l_readITEM_CD */
	public List l_readITEM_CD = null;

	/** �� 23 List�ϐ��F l_IN_ITEM_NAME */
	public List l_IN_ITEM_NAME = null;

	/** �� 24 List�ϐ��F l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;

	/** �� 25 List�ϐ��F l_readWS_CD */
	public List l_readWS_CD = null;

	/** �� 26 List�ϐ��F l_IN_WS_NAME */
	public List l_IN_WS_NAME = null;

	/** �� 27 List�ϐ��F l_readWS_PLANT_CD */
	public List l_readWS_PLANT_CD = null;

	/** �� 28 List�ϐ��F l_IN_WS_CD */
	public List l_IN_WS_CD = null;

	/** �� 29 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 30 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 31 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 32 List�ϐ��F l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** �� 33 List�ϐ��F l_OPR_INST_PUCH_ODR_QTY */
	public List l_OPR_INST_PUCH_ODR_QTY = null;

	/** �� 34 List�ϐ��F l_WS_VEND_CD */
	public List l_WS_VEND_CD = null;

	/** �� 35 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 36 List�ϐ��F l_h_ODR_STS_TYP */
	public List l_h_ODR_STS_TYP = null;

	/** �� 37 List�ϐ��F l_InR1_OD_TYP */
	public List l_InR1_OD_TYP = null;

	/** �� 38 List�ϐ��F l_InC1_ODR_STS_TYP */
	public List l_InC1_ODR_STS_TYP = null;

	/** �� 39 List�ϐ��F l_InC2_ODR_STS_TYP */
	public List l_InC2_ODR_STS_TYP = null;

	/** �� 40 List�ϐ��F l_InC3_ODR_STS_TYP */
	public List l_InC3_ODR_STS_TYP = null;

	/** �� 41 List�ϐ��F l_InPLANT_CD */
	public List l_InPLANT_CD = null;

	/** �� 42 List�ϐ��F l_IN_PRD_START_DATE_FROM */
	public List l_IN_PRD_START_DATE_FROM = null;

	/** �� 43 List�ϐ��F l_IN_PRD_START_DATE_TO */
	public List l_IN_PRD_START_DATE_TO = null;

	/** �� 44 List�ϐ��F l_IN_PRD_DUE_DATE_FROM */
	public List l_IN_PRD_DUE_DATE_FROM = null;

	/** �� 45 List�ϐ��F l_IN_PRD_DUE_DATE_TO */
	public List l_IN_PRD_DUE_DATE_TO = null;

	/** �� 46 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 47 List�ϐ��F l_NON_NO_ITEM_FLG */
	public List l_NON_NO_ITEM_FLG = null;

	/** �� 48 List�ϐ��F l_NON_NO_ITEM_TYP */
	public List l_NON_NO_ITEM_TYP = null;

	/** �� 49 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 50 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 51 List�ϐ��F l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** �� 52 List�ϐ��F l_EXCH_START_DATE */
	public List l_EXCH_START_DATE = null;

	/** �� 53 List�ϐ��F l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** �� 54 List�ϐ��F l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** �� 55 List�ϐ��F l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** �� 56 List�ϐ��F l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** �� 57 List�ϐ��F l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** �� 58 List�ϐ��F l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** �� 59 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 60 List�ϐ��F l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** �� 61 List�ϐ��F l_l_COUNT_1 */
	public List l_l_COUNT_1 = null;

	/** �� 62 List�ϐ��F l_ROW_COUNT_1 */
	public List l_ROW_COUNT_1 = null;

	/** �� 63 List�ϐ��F l_l_COUNT_2 */
	public List l_l_COUNT_2 = null;

	/** �� 64 List�ϐ��F l_ROW_COUNT_2 */
	public List l_ROW_COUNT_2 = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getr1_FILTER1() { return m_r1_FILTER1; }
	public String getr2_FILTER1() { return m_r2_FILTER1; }
	public String getw_OD_TYP() { return m_w_OD_TYP; }
	public String getw_OD_TYP_name() { return m_w_OD_TYP_name; }
	public String getw_OD_TYP_val() { return m_w_OD_TYP_val; }
	public String getPRODUCT_TYP_name() { return m_PRODUCT_TYP_name; }
	public String getPRODUCT_TYP_val() { return m_PRODUCT_TYP_val; }
	public String getr1_FILTER2() { return m_r1_FILTER2; }
	public String getc1_ODR_STS_TYP() { return m_c1_ODR_STS_TYP; }
	public String getc2_ODR_STS_TYP() { return m_c2_ODR_STS_TYP; }
	public String getc3_ODR_STS_TYP() { return m_c3_ODR_STS_TYP; }
	public String getCONFIRM_DLV_DATE() { return m_CONFIRM_DLV_DATE; }
	public String getWH_CD_2() { return m_WH_CD_2; }
	public String getREMARKS() { return m_REMARKS; }
	public String getNON_NO_ITEM_NAME() { return m_NON_NO_ITEM_NAME; }
	public String getNON_NO_ITEM_PUCH_ODR_UNIT() { return m_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getr2_FILTER2() { return m_r2_FILTER2; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getTXT_FILE() { return m_TXT_FILE; }
	public String getUNIT_COST_TYP_VAL() { return m_UNIT_COST_TYP_VAL; }
	public String getreadITEM_CD() { return m_readITEM_CD; }
	public String getIN_ITEM_NAME() { return m_IN_ITEM_NAME; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }
	public String getreadWS_CD() { return m_readWS_CD; }
	public String getIN_WS_NAME() { return m_IN_WS_NAME; }
	public String getreadWS_PLANT_CD() { return m_readWS_PLANT_CD; }
	public String getIN_WS_CD() { return m_IN_WS_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getOPR_INST_PUCH_ODR_QTY() { return m_OPR_INST_PUCH_ODR_QTY; }
	public String getWS_VEND_CD() { return m_WS_VEND_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String geth_ODR_STS_TYP() { return m_h_ODR_STS_TYP; }
	public String getInR1_OD_TYP() { return m_InR1_OD_TYP; }
	public String getInC1_ODR_STS_TYP() { return m_InC1_ODR_STS_TYP; }
	public String getInC2_ODR_STS_TYP() { return m_InC2_ODR_STS_TYP; }
	public String getInC3_ODR_STS_TYP() { return m_InC3_ODR_STS_TYP; }
	public String getInPLANT_CD() { return m_InPLANT_CD; }
	public String getIN_PRD_START_DATE_FROM() { return m_IN_PRD_START_DATE_FROM; }
	public String getIN_PRD_START_DATE_TO() { return m_IN_PRD_START_DATE_TO; }
	public String getIN_PRD_DUE_DATE_FROM() { return m_IN_PRD_DUE_DATE_FROM; }
	public String getIN_PRD_DUE_DATE_TO() { return m_IN_PRD_DUE_DATE_TO; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getNON_NO_ITEM_TYP() { return m_NON_NO_ITEM_TYP; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getEXCH_START_DATE() { return m_EXCH_START_DATE; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getl_COUNT_1() { return m_l_COUNT_1; }
	public String getROW_COUNT_1() { return m_ROW_COUNT_1; }
	public String getl_COUNT_2() { return m_l_COUNT_2; }
	public String getROW_COUNT_2() { return m_ROW_COUNT_2; }

	public List getList_r1_FILTER1() { return l_r1_FILTER1; }
	public List getList_r2_FILTER1() { return l_r2_FILTER1; }
	public List getList_w_OD_TYP() { return l_w_OD_TYP; }
	public List getList_w_OD_TYP_name() { return l_w_OD_TYP_name; }
	public List getList_w_OD_TYP_val() { return l_w_OD_TYP_val; }
	public List getList_PRODUCT_TYP_name() { return l_PRODUCT_TYP_name; }
	public List getList_PRODUCT_TYP_val() { return l_PRODUCT_TYP_val; }
	public List getList_r1_FILTER2() { return l_r1_FILTER2; }
	public List getList_c1_ODR_STS_TYP() { return l_c1_ODR_STS_TYP; }
	public List getList_c2_ODR_STS_TYP() { return l_c2_ODR_STS_TYP; }
	public List getList_c3_ODR_STS_TYP() { return l_c3_ODR_STS_TYP; }
	public List getList_CONFIRM_DLV_DATE() { return l_CONFIRM_DLV_DATE; }
	public List getList_WH_CD_2() { return l_WH_CD_2; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_NON_NO_ITEM_NAME() { return l_NON_NO_ITEM_NAME; }
	public List getList_NON_NO_ITEM_PUCH_ODR_UNIT() { return l_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_r2_FILTER2() { return l_r2_FILTER2; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_TXT_FILE() { return l_TXT_FILE; }
	public List getList_UNIT_COST_TYP_VAL() { return l_UNIT_COST_TYP_VAL; }
	public List getList_readITEM_CD() { return l_readITEM_CD; }
	public List getList_IN_ITEM_NAME() { return l_IN_ITEM_NAME; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }
	public List getList_readWS_CD() { return l_readWS_CD; }
	public List getList_IN_WS_NAME() { return l_IN_WS_NAME; }
	public List getList_readWS_PLANT_CD() { return l_readWS_PLANT_CD; }
	public List getList_IN_WS_CD() { return l_IN_WS_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_OPR_INST_PUCH_ODR_QTY() { return l_OPR_INST_PUCH_ODR_QTY; }
	public List getList_WS_VEND_CD() { return l_WS_VEND_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_h_ODR_STS_TYP() { return l_h_ODR_STS_TYP; }
	public List getList_InR1_OD_TYP() { return l_InR1_OD_TYP; }
	public List getList_InC1_ODR_STS_TYP() { return l_InC1_ODR_STS_TYP; }
	public List getList_InC2_ODR_STS_TYP() { return l_InC2_ODR_STS_TYP; }
	public List getList_InC3_ODR_STS_TYP() { return l_InC3_ODR_STS_TYP; }
	public List getList_InPLANT_CD() { return l_InPLANT_CD; }
	public List getList_IN_PRD_START_DATE_FROM() { return l_IN_PRD_START_DATE_FROM; }
	public List getList_IN_PRD_START_DATE_TO() { return l_IN_PRD_START_DATE_TO; }
	public List getList_IN_PRD_DUE_DATE_FROM() { return l_IN_PRD_DUE_DATE_FROM; }
	public List getList_IN_PRD_DUE_DATE_TO() { return l_IN_PRD_DUE_DATE_TO; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_NON_NO_ITEM_FLG() { return l_NON_NO_ITEM_FLG; }
	public List getList_NON_NO_ITEM_TYP() { return l_NON_NO_ITEM_TYP; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_EXCH_START_DATE() { return l_EXCH_START_DATE; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_l_COUNT_1() { return l_l_COUNT_1; }
	public List getList_ROW_COUNT_1() { return l_ROW_COUNT_1; }
	public List getList_l_COUNT_2() { return l_l_COUNT_2; }
	public List getList_ROW_COUNT_2() { return l_ROW_COUNT_2; }

	public void setr1_FILTER1(String val) { m_r1_FILTER1 = val; }
	public void setr2_FILTER1(String val) { m_r2_FILTER1 = val; }
	public void setw_OD_TYP(String val) { m_w_OD_TYP = val; }
	public void setw_OD_TYP_name(String val) { m_w_OD_TYP_name = val; }
	public void setw_OD_TYP_val(String val) { m_w_OD_TYP_val = val; }
	public void setPRODUCT_TYP_name(String val) { m_PRODUCT_TYP_name = val; }
	public void setPRODUCT_TYP_val(String val) { m_PRODUCT_TYP_val = val; }
	public void setr1_FILTER2(String val) { m_r1_FILTER2 = val; }
	public void setc1_ODR_STS_TYP(String val) { m_c1_ODR_STS_TYP = val; }
	public void setc2_ODR_STS_TYP(String val) { m_c2_ODR_STS_TYP = val; }
	public void setc3_ODR_STS_TYP(String val) { m_c3_ODR_STS_TYP = val; }
	public void setCONFIRM_DLV_DATE(String val) { m_CONFIRM_DLV_DATE = val; }
	public void setWH_CD_2(String val) { m_WH_CD_2 = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setNON_NO_ITEM_NAME(String val) { m_NON_NO_ITEM_NAME = val; }
	public void setNON_NO_ITEM_PUCH_ODR_UNIT(String val) { m_NON_NO_ITEM_PUCH_ODR_UNIT = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setr2_FILTER2(String val) { m_r2_FILTER2 = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setTXT_FILE(String val) { m_TXT_FILE = val; }
	public void setUNIT_COST_TYP_VAL(String val) { m_UNIT_COST_TYP_VAL = val; }
	public void setreadITEM_CD(String val) { m_readITEM_CD = val; }
	public void setIN_ITEM_NAME(String val) { m_IN_ITEM_NAME = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }
	public void setreadWS_CD(String val) { m_readWS_CD = val; }
	public void setIN_WS_NAME(String val) { m_IN_WS_NAME = val; }
	public void setreadWS_PLANT_CD(String val) { m_readWS_PLANT_CD = val; }
	public void setIN_WS_CD(String val) { m_IN_WS_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }
	public void setOPR_INST_PUCH_ODR_QTY(String val) { m_OPR_INST_PUCH_ODR_QTY = val; }
	public void setWS_VEND_CD(String val) { m_WS_VEND_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void seth_ODR_STS_TYP(String val) { m_h_ODR_STS_TYP = val; }
	public void setInR1_OD_TYP(String val) { m_InR1_OD_TYP = val; }
	public void setInC1_ODR_STS_TYP(String val) { m_InC1_ODR_STS_TYP = val; }
	public void setInC2_ODR_STS_TYP(String val) { m_InC2_ODR_STS_TYP = val; }
	public void setInC3_ODR_STS_TYP(String val) { m_InC3_ODR_STS_TYP = val; }
	public void setInPLANT_CD(String val) { m_InPLANT_CD = val; }
	public void setIN_PRD_START_DATE_FROM(String val) { m_IN_PRD_START_DATE_FROM = val; }
	public void setIN_PRD_START_DATE_TO(String val) { m_IN_PRD_START_DATE_TO = val; }
	public void setIN_PRD_DUE_DATE_FROM(String val) { m_IN_PRD_DUE_DATE_FROM = val; }
	public void setIN_PRD_DUE_DATE_TO(String val) { m_IN_PRD_DUE_DATE_TO = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setNON_NO_ITEM_FLG(String val) { m_NON_NO_ITEM_FLG = val; }
	public void setNON_NO_ITEM_TYP(String val) { m_NON_NO_ITEM_TYP = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setEXCH_START_DATE(String val) { m_EXCH_START_DATE = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setl_COUNT_1(String val) { m_l_COUNT_1 = val; }
	public void setROW_COUNT_1(String val) { m_ROW_COUNT_1 = val; }
	public void setl_COUNT_2(String val) { m_l_COUNT_2 = val; }
	public void setROW_COUNT_2(String val) { m_ROW_COUNT_2 = val; }


	public void setList_r1_FILTER1(List list) { l_r1_FILTER1 = list; }
	public void setList_r2_FILTER1(List list) { l_r2_FILTER1 = list; }
	public void setList_w_OD_TYP(List list) { l_w_OD_TYP = list; }
	public void setList_w_OD_TYP_name(List list) { l_w_OD_TYP_name = list; }
	public void setList_w_OD_TYP_val(List list) { l_w_OD_TYP_val = list; }
	public void setList_PRODUCT_TYP_name(List list) { l_PRODUCT_TYP_name = list; }
	public void setList_PRODUCT_TYP_val(List list) { l_PRODUCT_TYP_val = list; }
	public void setList_r1_FILTER2(List list) { l_r1_FILTER2 = list; }
	public void setList_c1_ODR_STS_TYP(List list) { l_c1_ODR_STS_TYP = list; }
	public void setList_c2_ODR_STS_TYP(List list) { l_c2_ODR_STS_TYP = list; }
	public void setList_c3_ODR_STS_TYP(List list) { l_c3_ODR_STS_TYP = list; }
	public void setList_CONFIRM_DLV_DATE(List list) { l_CONFIRM_DLV_DATE = list; }
	public void setList_WH_CD_2(List list) { l_WH_CD_2 = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_NON_NO_ITEM_NAME(List list) { l_NON_NO_ITEM_NAME = list; }
	public void setList_NON_NO_ITEM_PUCH_ODR_UNIT(List list) { l_NON_NO_ITEM_PUCH_ODR_UNIT = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_r2_FILTER2(List list) { l_r2_FILTER2 = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_TXT_FILE(List list) { l_TXT_FILE = list; }
	public void setList_UNIT_COST_TYP_VAL(List list) { l_UNIT_COST_TYP_VAL = list; }
	public void setList_readITEM_CD(List list) { l_readITEM_CD = list; }
	public void setList_IN_ITEM_NAME(List list) { l_IN_ITEM_NAME = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }
	public void setList_readWS_CD(List list) { l_readWS_CD = list; }
	public void setList_IN_WS_NAME(List list) { l_IN_WS_NAME = list; }
	public void setList_readWS_PLANT_CD(List list) { l_readWS_PLANT_CD = list; }
	public void setList_IN_WS_CD(List list) { l_IN_WS_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_OPR_INST_PUCH_ODR_QTY(List list) { l_OPR_INST_PUCH_ODR_QTY = list; }
	public void setList_WS_VEND_CD(List list) { l_WS_VEND_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_h_ODR_STS_TYP(List list) { l_h_ODR_STS_TYP = list; }
	public void setList_InR1_OD_TYP(List list) { l_InR1_OD_TYP = list; }
	public void setList_InC1_ODR_STS_TYP(List list) { l_InC1_ODR_STS_TYP = list; }
	public void setList_InC2_ODR_STS_TYP(List list) { l_InC2_ODR_STS_TYP = list; }
	public void setList_InC3_ODR_STS_TYP(List list) { l_InC3_ODR_STS_TYP = list; }
	public void setList_InPLANT_CD(List list) { l_InPLANT_CD = list; }
	public void setList_IN_PRD_START_DATE_FROM(List list) { l_IN_PRD_START_DATE_FROM = list; }
	public void setList_IN_PRD_START_DATE_TO(List list) { l_IN_PRD_START_DATE_TO = list; }
	public void setList_IN_PRD_DUE_DATE_FROM(List list) { l_IN_PRD_DUE_DATE_FROM = list; }
	public void setList_IN_PRD_DUE_DATE_TO(List list) { l_IN_PRD_DUE_DATE_TO = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_NON_NO_ITEM_FLG(List list) { l_NON_NO_ITEM_FLG = list; }
	public void setList_NON_NO_ITEM_TYP(List list) { l_NON_NO_ITEM_TYP = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_EXCH_START_DATE(List list) { l_EXCH_START_DATE = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_l_COUNT_1(List list) { l_l_COUNT_1 = list; }
	public void setList_ROW_COUNT_1(List list) { l_ROW_COUNT_1 = list; }
	public void setList_l_COUNT_2(List list) { l_l_COUNT_2 = list; }
	public void setList_ROW_COUNT_2(List list) { l_ROW_COUNT_2 = list; }

	public int setL2L_r1_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER1 == null) {
			l_r1_FILTER1 = new ArrayList();
		} else {
			l_r1_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER1.add(((AC0160010Struct) list.get(i)).getr1_FILTER1());
		}
		return size;
	}
	public int setL2L_r2_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER1 == null) {
			l_r2_FILTER1 = new ArrayList();
		} else {
			l_r2_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER1.add(((AC0160010Struct) list.get(i)).getr2_FILTER1());
		}
		return size;
	}
	public int setL2L_w_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP == null) {
			l_w_OD_TYP = new ArrayList();
		} else {
			l_w_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP.add(((AC0160010Struct) list.get(i)).getw_OD_TYP());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_name == null) {
			l_w_OD_TYP_name = new ArrayList();
		} else {
			l_w_OD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_name.add(((AC0160010Struct) list.get(i)).getw_OD_TYP_name());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_val == null) {
			l_w_OD_TYP_val = new ArrayList();
		} else {
			l_w_OD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_val.add(((AC0160010Struct) list.get(i)).getw_OD_TYP_val());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_name == null) {
			l_PRODUCT_TYP_name = new ArrayList();
		} else {
			l_PRODUCT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_name.add(((AC0160010Struct) list.get(i)).getPRODUCT_TYP_name());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_val == null) {
			l_PRODUCT_TYP_val = new ArrayList();
		} else {
			l_PRODUCT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_val.add(((AC0160010Struct) list.get(i)).getPRODUCT_TYP_val());
		}
		return size;
	}
	public int setL2L_r1_FILTER2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER2 == null) {
			l_r1_FILTER2 = new ArrayList();
		} else {
			l_r1_FILTER2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER2.add(((AC0160010Struct) list.get(i)).getr1_FILTER2());
		}
		return size;
	}
	public int setL2L_c1_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_ODR_STS_TYP == null) {
			l_c1_ODR_STS_TYP = new ArrayList();
		} else {
			l_c1_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getc1_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_c2_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_ODR_STS_TYP == null) {
			l_c2_ODR_STS_TYP = new ArrayList();
		} else {
			l_c2_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getc2_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_c3_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_ODR_STS_TYP == null) {
			l_c3_ODR_STS_TYP = new ArrayList();
		} else {
			l_c3_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getc3_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONFIRM_DLV_DATE == null) {
			l_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONFIRM_DLV_DATE.add(((AC0160010Struct) list.get(i)).getCONFIRM_DLV_DATE());
		}
		return size;
	}
	public int setL2L_WH_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD_2 == null) {
			l_WH_CD_2 = new ArrayList();
		} else {
			l_WH_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD_2.add(((AC0160010Struct) list.get(i)).getWH_CD_2());
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
			l_REMARKS.add(((AC0160010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_NAME == null) {
			l_NON_NO_ITEM_NAME = new ArrayList();
		} else {
			l_NON_NO_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_NAME.add(((AC0160010Struct) list.get(i)).getNON_NO_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_PUCH_ODR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_PUCH_ODR_UNIT == null) {
			l_NON_NO_ITEM_PUCH_ODR_UNIT = new ArrayList();
		} else {
			l_NON_NO_ITEM_PUCH_ODR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_PUCH_ODR_UNIT.add(((AC0160010Struct) list.get(i)).getNON_NO_ITEM_PUCH_ODR_UNIT());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT == null) {
			l_NET_AMOUNT = new ArrayList();
		} else {
			l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT.add(((AC0160010Struct) list.get(i)).getNET_AMOUNT());
		}
		return size;
	}
	public int setL2L_r2_FILTER2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER2 == null) {
			l_r2_FILTER2 = new ArrayList();
		} else {
			l_r2_FILTER2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER2.add(((AC0160010Struct) list.get(i)).getr2_FILTER2());
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
			l_DOWNLOAD_FILE.add(((AC0160010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_TXT_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TXT_FILE == null) {
			l_TXT_FILE = new ArrayList();
		} else {
			l_TXT_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TXT_FILE.add(((AC0160010Struct) list.get(i)).getTXT_FILE());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_VAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_VAL == null) {
			l_UNIT_COST_TYP_VAL = new ArrayList();
		} else {
			l_UNIT_COST_TYP_VAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_VAL.add(((AC0160010Struct) list.get(i)).getUNIT_COST_TYP_VAL());
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
			l_readITEM_CD.add(((AC0160010Struct) list.get(i)).getreadITEM_CD());
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
			l_IN_ITEM_NAME.add(((AC0160010Struct) list.get(i)).getIN_ITEM_NAME());
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
			l_IN_ITEM_CD.add(((AC0160010Struct) list.get(i)).getIN_ITEM_CD());
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
			l_readWS_CD.add(((AC0160010Struct) list.get(i)).getreadWS_CD());
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
			l_IN_WS_NAME.add(((AC0160010Struct) list.get(i)).getIN_WS_NAME());
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
			l_readWS_PLANT_CD.add(((AC0160010Struct) list.get(i)).getreadWS_PLANT_CD());
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
			l_IN_WS_CD.add(((AC0160010Struct) list.get(i)).getIN_WS_CD());
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
			l_ITEM_CD.add(((AC0160010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AC0160010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0160010Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE == null) {
			l_PRD_START_DATE = new ArrayList();
		} else {
			l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE.add(((AC0160010Struct) list.get(i)).getPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_OPR_INST_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_PUCH_ODR_QTY == null) {
			l_OPR_INST_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_OPR_INST_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_PUCH_ODR_QTY.add(((AC0160010Struct) list.get(i)).getOPR_INST_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_WS_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_VEND_CD == null) {
			l_WS_VEND_CD = new ArrayList();
		} else {
			l_WS_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_VEND_CD.add(((AC0160010Struct) list.get(i)).getWS_VEND_CD());
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
			l_JOB_ODR_CD.add(((AC0160010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_STS_TYP == null) {
			l_h_ODR_STS_TYP = new ArrayList();
		} else {
			l_h_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).geth_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InR1_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InR1_OD_TYP == null) {
			l_InR1_OD_TYP = new ArrayList();
		} else {
			l_InR1_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InR1_OD_TYP.add(((AC0160010Struct) list.get(i)).getInR1_OD_TYP());
		}
		return size;
	}
	public int setL2L_InC1_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC1_ODR_STS_TYP == null) {
			l_InC1_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC1_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC1_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getInC1_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC2_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC2_ODR_STS_TYP == null) {
			l_InC2_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC2_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC2_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getInC2_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC3_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC3_ODR_STS_TYP == null) {
			l_InC3_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC3_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC3_ODR_STS_TYP.add(((AC0160010Struct) list.get(i)).getInC3_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InPLANT_CD == null) {
			l_InPLANT_CD = new ArrayList();
		} else {
			l_InPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InPLANT_CD.add(((AC0160010Struct) list.get(i)).getInPLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_PRD_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PRD_START_DATE_FROM == null) {
			l_IN_PRD_START_DATE_FROM = new ArrayList();
		} else {
			l_IN_PRD_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PRD_START_DATE_FROM.add(((AC0160010Struct) list.get(i)).getIN_PRD_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_IN_PRD_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PRD_START_DATE_TO == null) {
			l_IN_PRD_START_DATE_TO = new ArrayList();
		} else {
			l_IN_PRD_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PRD_START_DATE_TO.add(((AC0160010Struct) list.get(i)).getIN_PRD_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_IN_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PRD_DUE_DATE_FROM == null) {
			l_IN_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_IN_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PRD_DUE_DATE_FROM.add(((AC0160010Struct) list.get(i)).getIN_PRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_IN_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PRD_DUE_DATE_TO == null) {
			l_IN_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_IN_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PRD_DUE_DATE_TO.add(((AC0160010Struct) list.get(i)).getIN_PRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP == null) {
			l_PRODUCT_TYP = new ArrayList();
		} else {
			l_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP.add(((AC0160010Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_FLG == null) {
			l_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_FLG.add(((AC0160010Struct) list.get(i)).getNON_NO_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_TYP == null) {
			l_NON_NO_ITEM_TYP = new ArrayList();
		} else {
			l_NON_NO_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_TYP.add(((AC0160010Struct) list.get(i)).getNON_NO_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP == null) {
			l_ROUND_TYP = new ArrayList();
		} else {
			l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP.add(((AC0160010Struct) list.get(i)).getROUND_TYP());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((AC0160010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((AC0160010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_EXCH_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_START_DATE == null) {
			l_EXCH_START_DATE = new ArrayList();
		} else {
			l_EXCH_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_START_DATE.add(((AC0160010Struct) list.get(i)).getEXCH_START_DATE());
		}
		return size;
	}
	public int setL2L_HOME_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_CD == null) {
			l_HOME_CUR_CD = new ArrayList();
		} else {
			l_HOME_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_CD.add(((AC0160010Struct) list.get(i)).getHOME_CUR_CD());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AC0160010Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AC0160010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AC0160010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AC0160010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AC0160010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPANY_CD == null) {
			l_COMPANY_CD = new ArrayList();
		} else {
			l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPANY_CD.add(((AC0160010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((AC0160010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_l_COUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT_1 == null) {
			l_l_COUNT_1 = new ArrayList();
		} else {
			l_l_COUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT_1.add(((AC0160010Struct) list.get(i)).getl_COUNT_1());
		}
		return size;
	}
	public int setL2L_ROW_COUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT_1 == null) {
			l_ROW_COUNT_1 = new ArrayList();
		} else {
			l_ROW_COUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT_1.add(((AC0160010Struct) list.get(i)).getROW_COUNT_1());
		}
		return size;
	}
	public int setL2L_l_COUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT_2 == null) {
			l_l_COUNT_2 = new ArrayList();
		} else {
			l_l_COUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT_2.add(((AC0160010Struct) list.get(i)).getl_COUNT_2());
		}
		return size;
	}
	public int setL2L_ROW_COUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT_2 == null) {
			l_ROW_COUNT_2 = new ArrayList();
		} else {
			l_ROW_COUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT_2.add(((AC0160010Struct) list.get(i)).getROW_COUNT_2());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_FILTER1 = null;
		m_r2_FILTER1 = null;
		m_w_OD_TYP = null;
		m_w_OD_TYP_name = null;
		m_w_OD_TYP_val = null;
		m_PRODUCT_TYP_name = null;
		m_PRODUCT_TYP_val = null;
		m_r1_FILTER2 = null;
		m_c1_ODR_STS_TYP = null;
		m_c2_ODR_STS_TYP = null;
		m_c3_ODR_STS_TYP = null;
		m_CONFIRM_DLV_DATE = null;
		m_WH_CD_2 = null;
		m_REMARKS = null;
		m_NON_NO_ITEM_NAME = null;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		m_NET_AMOUNT = null;
		m_r2_FILTER2 = null;
		m_DOWNLOAD_FILE = null;
		m_TXT_FILE = null;
		m_UNIT_COST_TYP_VAL = null;
		m_readITEM_CD = null;
		m_IN_ITEM_NAME = null;
		m_IN_ITEM_CD = null;
		m_readWS_CD = null;
		m_IN_WS_NAME = null;
		m_readWS_PLANT_CD = null;
		m_IN_WS_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_PRD_DUE_DATE = null;
		m_PRD_START_DATE = null;
		m_OPR_INST_PUCH_ODR_QTY = null;
		m_WS_VEND_CD = null;
		m_JOB_ODR_CD = null;
		m_h_ODR_STS_TYP = null;
		m_InR1_OD_TYP = null;
		m_InC1_ODR_STS_TYP = null;
		m_InC2_ODR_STS_TYP = null;
		m_InC3_ODR_STS_TYP = null;
		m_InPLANT_CD = null;
		m_IN_PRD_START_DATE_FROM = null;
		m_IN_PRD_START_DATE_TO = null;
		m_IN_PRD_DUE_DATE_FROM = null;
		m_IN_PRD_DUE_DATE_TO = null;
		m_PRODUCT_TYP = null;
		m_NON_NO_ITEM_FLG = null;
		m_NON_NO_ITEM_TYP = null;
		m_ROUND_TYP = null;
		m_CUR_CD = null;
		m_EXCH_RATE = null;
		m_EXCH_START_DATE = null;
		m_HOME_CUR_CD = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_COMPANY_CD = null;
		m_CUR_NAME = null;
		m_l_COUNT_1 = null;
		m_ROW_COUNT_1 = null;
		m_l_COUNT_2 = null;
		m_ROW_COUNT_2 = null;

		l_r1_FILTER1 = null;
		l_r2_FILTER1 = null;
		l_w_OD_TYP = null;
		l_w_OD_TYP_name = null;
		l_w_OD_TYP_val = null;
		l_PRODUCT_TYP_name = null;
		l_PRODUCT_TYP_val = null;
		l_r1_FILTER2 = null;
		l_c1_ODR_STS_TYP = null;
		l_c2_ODR_STS_TYP = null;
		l_c3_ODR_STS_TYP = null;
		l_CONFIRM_DLV_DATE = null;
		l_WH_CD_2 = null;
		l_REMARKS = null;
		l_NON_NO_ITEM_NAME = null;
		l_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		l_NET_AMOUNT = null;
		l_r2_FILTER2 = null;
		l_DOWNLOAD_FILE = null;
		l_TXT_FILE = null;
		l_UNIT_COST_TYP_VAL = null;
		l_readITEM_CD = null;
		l_IN_ITEM_NAME = null;
		l_IN_ITEM_CD = null;
		l_readWS_CD = null;
		l_IN_WS_NAME = null;
		l_readWS_PLANT_CD = null;
		l_IN_WS_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_PRD_DUE_DATE = null;
		l_PRD_START_DATE = null;
		l_OPR_INST_PUCH_ODR_QTY = null;
		l_WS_VEND_CD = null;
		l_JOB_ODR_CD = null;
		l_h_ODR_STS_TYP = null;
		l_InR1_OD_TYP = null;
		l_InC1_ODR_STS_TYP = null;
		l_InC2_ODR_STS_TYP = null;
		l_InC3_ODR_STS_TYP = null;
		l_InPLANT_CD = null;
		l_IN_PRD_START_DATE_FROM = null;
		l_IN_PRD_START_DATE_TO = null;
		l_IN_PRD_DUE_DATE_FROM = null;
		l_IN_PRD_DUE_DATE_TO = null;
		l_PRODUCT_TYP = null;
		l_NON_NO_ITEM_FLG = null;
		l_NON_NO_ITEM_TYP = null;
		l_ROUND_TYP = null;
		l_CUR_CD = null;
		l_EXCH_RATE = null;
		l_EXCH_START_DATE = null;
		l_HOME_CUR_CD = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_COMPANY_CD = null;
		l_CUR_NAME = null;
		l_l_COUNT_1 = null;
		l_ROW_COUNT_1 = null;
		l_l_COUNT_2 = null;
		l_ROW_COUNT_2 = null;

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
	 * medAC0160010�N���X�̕W���R���X�g���N�^
	 */
	public AC0160010Struct()
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
	public void setStruct(AC0160010Struct struct)
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
	public void setStructM(AC0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_FILTER1(struct.getr1_FILTER1());
			this.setr2_FILTER1(struct.getr2_FILTER1());
			this.setw_OD_TYP(struct.getw_OD_TYP());
			this.setw_OD_TYP_name(struct.getw_OD_TYP_name());
			this.setw_OD_TYP_val(struct.getw_OD_TYP_val());
			this.setPRODUCT_TYP_name(struct.getPRODUCT_TYP_name());
			this.setPRODUCT_TYP_val(struct.getPRODUCT_TYP_val());
			this.setr1_FILTER2(struct.getr1_FILTER2());
			this.setc1_ODR_STS_TYP(struct.getc1_ODR_STS_TYP());
			this.setc2_ODR_STS_TYP(struct.getc2_ODR_STS_TYP());
			this.setc3_ODR_STS_TYP(struct.getc3_ODR_STS_TYP());
			this.setCONFIRM_DLV_DATE(struct.getCONFIRM_DLV_DATE());
			this.setWH_CD_2(struct.getWH_CD_2());
			this.setREMARKS(struct.getREMARKS());
			this.setNON_NO_ITEM_NAME(struct.getNON_NO_ITEM_NAME());
			this.setNON_NO_ITEM_PUCH_ODR_UNIT(struct.getNON_NO_ITEM_PUCH_ODR_UNIT());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setr2_FILTER2(struct.getr2_FILTER2());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setTXT_FILE(struct.getTXT_FILE());
			this.setUNIT_COST_TYP_VAL(struct.getUNIT_COST_TYP_VAL());
			this.setreadITEM_CD(struct.getreadITEM_CD());
			this.setIN_ITEM_NAME(struct.getIN_ITEM_NAME());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
			this.setreadWS_CD(struct.getreadWS_CD());
			this.setIN_WS_NAME(struct.getIN_WS_NAME());
			this.setreadWS_PLANT_CD(struct.getreadWS_PLANT_CD());
			this.setIN_WS_CD(struct.getIN_WS_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setOPR_INST_PUCH_ODR_QTY(struct.getOPR_INST_PUCH_ODR_QTY());
			this.setWS_VEND_CD(struct.getWS_VEND_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.seth_ODR_STS_TYP(struct.geth_ODR_STS_TYP());
			this.setInR1_OD_TYP(struct.getInR1_OD_TYP());
			this.setInC1_ODR_STS_TYP(struct.getInC1_ODR_STS_TYP());
			this.setInC2_ODR_STS_TYP(struct.getInC2_ODR_STS_TYP());
			this.setInC3_ODR_STS_TYP(struct.getInC3_ODR_STS_TYP());
			this.setInPLANT_CD(struct.getInPLANT_CD());
			this.setIN_PRD_START_DATE_FROM(struct.getIN_PRD_START_DATE_FROM());
			this.setIN_PRD_START_DATE_TO(struct.getIN_PRD_START_DATE_TO());
			this.setIN_PRD_DUE_DATE_FROM(struct.getIN_PRD_DUE_DATE_FROM());
			this.setIN_PRD_DUE_DATE_TO(struct.getIN_PRD_DUE_DATE_TO());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setNON_NO_ITEM_FLG(struct.getNON_NO_ITEM_FLG());
			this.setNON_NO_ITEM_TYP(struct.getNON_NO_ITEM_TYP());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setEXCH_START_DATE(struct.getEXCH_START_DATE());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setl_COUNT_1(struct.getl_COUNT_1());
			this.setROW_COUNT_1(struct.getROW_COUNT_1());
			this.setl_COUNT_2(struct.getl_COUNT_2());
			this.setROW_COUNT_2(struct.getROW_COUNT_2());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_FILTER1(struct.getList_r1_FILTER1());
			this.setList_r2_FILTER1(struct.getList_r2_FILTER1());
			this.setList_w_OD_TYP(struct.getList_w_OD_TYP());
			this.setList_w_OD_TYP_name(struct.getList_w_OD_TYP_name());
			this.setList_w_OD_TYP_val(struct.getList_w_OD_TYP_val());
			this.setList_PRODUCT_TYP_name(struct.getList_PRODUCT_TYP_name());
			this.setList_PRODUCT_TYP_val(struct.getList_PRODUCT_TYP_val());
			this.setList_r1_FILTER2(struct.getList_r1_FILTER2());
			this.setList_c1_ODR_STS_TYP(struct.getList_c1_ODR_STS_TYP());
			this.setList_c2_ODR_STS_TYP(struct.getList_c2_ODR_STS_TYP());
			this.setList_c3_ODR_STS_TYP(struct.getList_c3_ODR_STS_TYP());
			this.setList_CONFIRM_DLV_DATE(struct.getList_CONFIRM_DLV_DATE());
			this.setList_WH_CD_2(struct.getList_WH_CD_2());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_NON_NO_ITEM_NAME(struct.getList_NON_NO_ITEM_NAME());
			this.setList_NON_NO_ITEM_PUCH_ODR_UNIT(struct.getList_NON_NO_ITEM_PUCH_ODR_UNIT());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_r2_FILTER2(struct.getList_r2_FILTER2());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_TXT_FILE(struct.getList_TXT_FILE());
			this.setList_UNIT_COST_TYP_VAL(struct.getList_UNIT_COST_TYP_VAL());
			this.setList_readITEM_CD(struct.getList_readITEM_CD());
			this.setList_IN_ITEM_NAME(struct.getList_IN_ITEM_NAME());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
			this.setList_readWS_CD(struct.getList_readWS_CD());
			this.setList_IN_WS_NAME(struct.getList_IN_WS_NAME());
			this.setList_readWS_PLANT_CD(struct.getList_readWS_PLANT_CD());
			this.setList_IN_WS_CD(struct.getList_IN_WS_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_OPR_INST_PUCH_ODR_QTY(struct.getList_OPR_INST_PUCH_ODR_QTY());
			this.setList_WS_VEND_CD(struct.getList_WS_VEND_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_h_ODR_STS_TYP(struct.getList_h_ODR_STS_TYP());
			this.setList_InR1_OD_TYP(struct.getList_InR1_OD_TYP());
			this.setList_InC1_ODR_STS_TYP(struct.getList_InC1_ODR_STS_TYP());
			this.setList_InC2_ODR_STS_TYP(struct.getList_InC2_ODR_STS_TYP());
			this.setList_InC3_ODR_STS_TYP(struct.getList_InC3_ODR_STS_TYP());
			this.setList_InPLANT_CD(struct.getList_InPLANT_CD());
			this.setList_IN_PRD_START_DATE_FROM(struct.getList_IN_PRD_START_DATE_FROM());
			this.setList_IN_PRD_START_DATE_TO(struct.getList_IN_PRD_START_DATE_TO());
			this.setList_IN_PRD_DUE_DATE_FROM(struct.getList_IN_PRD_DUE_DATE_FROM());
			this.setList_IN_PRD_DUE_DATE_TO(struct.getList_IN_PRD_DUE_DATE_TO());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_NON_NO_ITEM_FLG(struct.getList_NON_NO_ITEM_FLG());
			this.setList_NON_NO_ITEM_TYP(struct.getList_NON_NO_ITEM_TYP());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_EXCH_START_DATE(struct.getList_EXCH_START_DATE());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_l_COUNT_1(struct.getList_l_COUNT_1());
			this.setList_ROW_COUNT_1(struct.getList_ROW_COUNT_1());
			this.setList_l_COUNT_2(struct.getList_l_COUNT_2());
			this.setList_ROW_COUNT_2(struct.getList_ROW_COUNT_2());
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
	// �� 1 �ϐ������l�F i_r1_FILTER1


	final static String i_r1_FILTER1 = null;

	// �� 2 �ϐ������l�F i_r2_FILTER1


	final static String i_r2_FILTER1 = null;

	// �� 3 �ϐ������l�F i_w_OD_TYP


	final static String i_w_OD_TYP = null;

	// �� 4 �ϐ������l�F i_w_OD_TYP_name


	final static String i_w_OD_TYP_name = null;

	// �� 5 �ϐ������l�F i_w_OD_TYP_val


	final static String i_w_OD_TYP_val = null;

	// �� 6 �ϐ������l�F i_PRODUCT_TYP_name


	final static String i_PRODUCT_TYP_name = null;

	// �� 7 �ϐ������l�F i_PRODUCT_TYP_val


	final static String i_PRODUCT_TYP_val = null;

	// �� 8 �ϐ������l�F i_r1_FILTER2


	final static String i_r1_FILTER2 = null;

	// �� 9 �ϐ������l�F i_c1_ODR_STS_TYP


	final static String i_c1_ODR_STS_TYP = null;

	// �� 10 �ϐ������l�F i_c2_ODR_STS_TYP


	final static String i_c2_ODR_STS_TYP = null;

	// �� 11 �ϐ������l�F i_c3_ODR_STS_TYP


	final static String i_c3_ODR_STS_TYP = null;

	// �� 12 �ϐ������l�F i_CONFIRM_DLV_DATE


	final static String i_CONFIRM_DLV_DATE = null;

	// �� 13 �ϐ������l�F i_WH_CD_2


	final static String i_WH_CD_2 = null;

	// �� 14 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 15 �ϐ������l�F i_NON_NO_ITEM_NAME


	final static String i_NON_NO_ITEM_NAME = null;

	// �� 16 �ϐ������l�F i_NON_NO_ITEM_PUCH_ODR_UNIT


	final static String i_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// �� 17 �ϐ������l�F i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// �� 18 �ϐ������l�F i_r2_FILTER2


	final static String i_r2_FILTER2 = null;

	// �� 19 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 20 �ϐ������l�F i_TXT_FILE


	final static String i_TXT_FILE = null;

	// �� 21 �ϐ������l�F i_UNIT_COST_TYP_VAL


	final static String i_UNIT_COST_TYP_VAL = null;

	// �� 22 �ϐ������l�F i_readITEM_CD


	final static String i_readITEM_CD = null;

	// �� 23 �ϐ������l�F i_IN_ITEM_NAME


	final static String i_IN_ITEM_NAME = null;

	// �� 24 �ϐ������l�F i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

	// �� 25 �ϐ������l�F i_readWS_CD


	final static String i_readWS_CD = null;

	// �� 26 �ϐ������l�F i_IN_WS_NAME


	final static String i_IN_WS_NAME = null;

	// �� 27 �ϐ������l�F i_readWS_PLANT_CD


	final static String i_readWS_PLANT_CD = null;

	// �� 28 �ϐ������l�F i_IN_WS_CD


	final static String i_IN_WS_CD = null;

	// �� 29 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 30 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 31 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 32 �ϐ������l�F i_PRD_START_DATE


	final static String i_PRD_START_DATE = null;

	// �� 33 �ϐ������l�F i_OPR_INST_PUCH_ODR_QTY


	final static String i_OPR_INST_PUCH_ODR_QTY = null;

	// �� 34 �ϐ������l�F i_WS_VEND_CD


	final static String i_WS_VEND_CD = null;

	// �� 35 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 36 �ϐ������l�F i_h_ODR_STS_TYP


	final static String i_h_ODR_STS_TYP = null;

	// �� 37 �ϐ������l�F i_InR1_OD_TYP


	final static String i_InR1_OD_TYP = null;

	// �� 38 �ϐ������l�F i_InC1_ODR_STS_TYP


	final static String i_InC1_ODR_STS_TYP = null;

	// �� 39 �ϐ������l�F i_InC2_ODR_STS_TYP


	final static String i_InC2_ODR_STS_TYP = null;

	// �� 40 �ϐ������l�F i_InC3_ODR_STS_TYP


	final static String i_InC3_ODR_STS_TYP = null;

	// �� 41 �ϐ������l�F i_InPLANT_CD


	final static String i_InPLANT_CD = null;

	// �� 42 �ϐ������l�F i_IN_PRD_START_DATE_FROM


	final static String i_IN_PRD_START_DATE_FROM = null;

	// �� 43 �ϐ������l�F i_IN_PRD_START_DATE_TO


	final static String i_IN_PRD_START_DATE_TO = null;

	// �� 44 �ϐ������l�F i_IN_PRD_DUE_DATE_FROM


	final static String i_IN_PRD_DUE_DATE_FROM = null;

	// �� 45 �ϐ������l�F i_IN_PRD_DUE_DATE_TO


	final static String i_IN_PRD_DUE_DATE_TO = null;

	// �� 46 �ϐ������l�F i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// �� 47 �ϐ������l�F i_NON_NO_ITEM_FLG


	final static String i_NON_NO_ITEM_FLG = null;

	// �� 48 �ϐ������l�F i_NON_NO_ITEM_TYP


	final static String i_NON_NO_ITEM_TYP = null;

	// �� 49 �ϐ������l�F i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// �� 50 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 51 �ϐ������l�F i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// �� 52 �ϐ������l�F i_EXCH_START_DATE


	final static String i_EXCH_START_DATE = null;

	// �� 53 �ϐ������l�F i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// �� 54 �ϐ������l�F i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// �� 55 �ϐ������l�F i_UNIT_COST


	final static String i_UNIT_COST = null;

	// �� 56 �ϐ������l�F i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// �� 57 �ϐ������l�F i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// �� 58 �ϐ������l�F i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// �� 59 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 60 �ϐ������l�F i_CUR_NAME


	final static String i_CUR_NAME = null;

	// �� 61 �ϐ������l�F i_l_COUNT_1


	final static String i_l_COUNT_1 = null;

	// �� 62 �ϐ������l�F i_ROW_COUNT_1


	final static String i_ROW_COUNT_1 = null;

	// �� 63 �ϐ������l�F i_l_COUNT_2


	final static String i_l_COUNT_2 = null;

	// �� 64 �ϐ������l�F i_ROW_COUNT_2


	final static String i_ROW_COUNT_2 = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_r1_FILTER1

	final static String i_r1_FILTER1 = null;

	// �� 2 �ϐ������l�F i_r2_FILTER1

	final static String i_r2_FILTER1 = null;

	// �� 3 �ϐ������l�F i_w_OD_TYP_name

	final static String i_w_OD_TYP_name = null;

	// �� 4 �ϐ������l�F i_w_OD_TYP_val

	final static String i_w_OD_TYP_val = null;

	// �� 5 �ϐ������l�F i_PRODUCT_TYP_name

	final static String i_PRODUCT_TYP_name = null;

	// �� 6 �ϐ������l�F i_PRODUCT_TYP_val

	final static String i_PRODUCT_TYP_val = null;

	// �� 7 �ϐ������l�F i_r1_FILTER2

	final static String i_r1_FILTER2 = null;

	// �� 8 �ϐ������l�F i_c1_ODR_STS_TYP

	final static String i_c1_ODR_STS_TYP = null;

	// �� 9 �ϐ������l�F i_c2_ODR_STS_TYP

	final static String i_c2_ODR_STS_TYP = null;

	// �� 10 �ϐ������l�F i_c3_ODR_STS_TYP

	final static String i_c3_ODR_STS_TYP = null;

	// �� 11 �ϐ������l�F i_CONFIRM_DLV_DATE

	final static String i_CONFIRM_DLV_DATE = null;

	// �� 12 �ϐ������l�F i_WH_CD_2

	final static String i_WH_CD_2 = null;

	// �� 13 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 14 �ϐ������l�F i_NON_NO_ITEM_NAME

	final static String i_NON_NO_ITEM_NAME = null;

	// �� 15 �ϐ������l�F i_NON_NO_ITEM_PUCH_ODR_UNIT

	final static String i_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// �� 16 �ϐ������l�F i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// �� 17 �ϐ������l�F i_r2_FILTER2

	final static String i_r2_FILTER2 = null;

	// �� 18 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 19 �ϐ������l�F i_TXT_FILE

	final static String i_TXT_FILE = null;

	// �� 20 �ϐ������l�F i_UNIT_COST_TYP_VAL

	final static String i_UNIT_COST_TYP_VAL = null;

	// �� 21 �ϐ������l�F i_readITEM_CD

	final static String i_readITEM_CD = null;

	// �� 22 �ϐ������l�F i_IN_ITEM_NAME

	final static String i_IN_ITEM_NAME = null;

	// �� 23 �ϐ������l�F i_IN_ITEM_CD

	final static String i_IN_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_readWS_CD

	final static String i_readWS_CD = null;

	// �� 25 �ϐ������l�F i_IN_WS_NAME

	final static String i_IN_WS_NAME = null;

	// �� 26 �ϐ������l�F i_readWS_PLANT_CD

	final static String i_readWS_PLANT_CD = null;

	// �� 27 �ϐ������l�F i_IN_WS_CD

	final static String i_IN_WS_CD = null;

	// �� 28 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 29 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 30 �ϐ������l�F i_PRD_DUE_DATE

	final static String i_PRD_DUE_DATE = null;

	// �� 31 �ϐ������l�F i_PRD_START_DATE

	final static String i_PRD_START_DATE = null;

	// �� 32 �ϐ������l�F i_OPR_INST_PUCH_ODR_QTY

	final static String i_OPR_INST_PUCH_ODR_QTY = null;

	// �� 33 �ϐ������l�F i_WS_VEND_CD

	final static String i_WS_VEND_CD = null;

	// �� 34 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 35 �ϐ������l�F i_h_ODR_STS_TYP

	final static String i_h_ODR_STS_TYP = null;

	// �� 36 �ϐ������l�F i_InR1_OD_TYP

	final static String i_InR1_OD_TYP = null;

	// �� 37 �ϐ������l�F i_InC1_ODR_STS_TYP

	final static String i_InC1_ODR_STS_TYP = null;

	// �� 38 �ϐ������l�F i_InC2_ODR_STS_TYP

	final static String i_InC2_ODR_STS_TYP = null;

	// �� 39 �ϐ������l�F i_InC3_ODR_STS_TYP

	final static String i_InC3_ODR_STS_TYP = null;

	// �� 40 �ϐ������l�F i_InPLANT_CD

	final static String i_InPLANT_CD = null;

	// �� 41 �ϐ������l�F i_IN_PRD_START_DATE_FROM

	final static String i_IN_PRD_START_DATE_FROM = null;

	// �� 42 �ϐ������l�F i_IN_PRD_START_DATE_TO

	final static String i_IN_PRD_START_DATE_TO = null;

	// �� 43 �ϐ������l�F i_IN_PRD_DUE_DATE_FROM

	final static String i_IN_PRD_DUE_DATE_FROM = null;

	// �� 44 �ϐ������l�F i_IN_PRD_DUE_DATE_TO

	final static String i_IN_PRD_DUE_DATE_TO = null;

	// �� 45 �ϐ������l�F i_PRODUCT_TYP

	final static String i_PRODUCT_TYP = null;

	// �� 46 �ϐ������l�F i_NON_NO_ITEM_FLG

	final static String i_NON_NO_ITEM_FLG = null;

	// �� 47 �ϐ������l�F i_NON_NO_ITEM_TYP

	final static String i_NON_NO_ITEM_TYP = null;

	// �� 48 �ϐ������l�F i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// �� 49 �ϐ������l�F i_CUR_CD

	final static String i_CUR_CD = null;

	// �� 50 �ϐ������l�F i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// �� 51 �ϐ������l�F i_EXCH_START_DATE

	final static String i_EXCH_START_DATE = null;

	// �� 52 �ϐ������l�F i_HOME_CUR_CD

	final static String i_HOME_CUR_CD = null;

	// �� 53 �ϐ������l�F i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// �� 54 �ϐ������l�F i_UNIT_COST

	final static String i_UNIT_COST = null;

	// �� 55 �ϐ������l�F i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// �� 56 �ϐ������l�F i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// �� 57 �ϐ������l�F i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// �� 58 �ϐ������l�F i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// �� 59 �ϐ������l�F i_CUR_NAME

	final static String i_CUR_NAME = null;

	// �� 60 �ϐ������l�F i_l_COUNT_1

	final static String i_l_COUNT_1 = null;

	// �� 61 �ϐ������l�F i_ROW_COUNT_1

	final static String i_ROW_COUNT_1 = null;

	// �� 62 �ϐ������l�F i_l_COUNT_2

	final static String i_l_COUNT_2 = null;

	// �� 63 �ϐ������l�F i_ROW_COUNT_2

	final static String i_ROW_COUNT_2 = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_FILTER1 = i_r1_FILTER1;
		m_r2_FILTER1 = i_r2_FILTER1;
		m_w_OD_TYP_name = i_w_OD_TYP_name;
		m_w_OD_TYP_val = i_w_OD_TYP_val;
		m_PRODUCT_TYP_name = i_PRODUCT_TYP_name;
		m_PRODUCT_TYP_val = i_PRODUCT_TYP_val;
		m_r1_FILTER2 = i_r1_FILTER2;
		m_c1_ODR_STS_TYP = i_c1_ODR_STS_TYP;
		m_c2_ODR_STS_TYP = i_c2_ODR_STS_TYP;
		m_c3_ODR_STS_TYP = i_c3_ODR_STS_TYP;
		m_CONFIRM_DLV_DATE = i_CONFIRM_DLV_DATE;
		m_WH_CD_2 = i_WH_CD_2;
		m_REMARKS = i_REMARKS;
		m_NON_NO_ITEM_NAME = i_NON_NO_ITEM_NAME;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = i_NON_NO_ITEM_PUCH_ODR_UNIT;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_r2_FILTER2 = i_r2_FILTER2;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_TXT_FILE = i_TXT_FILE;
		m_UNIT_COST_TYP_VAL = i_UNIT_COST_TYP_VAL;
		m_readITEM_CD = i_readITEM_CD;
		m_IN_ITEM_NAME = i_IN_ITEM_NAME;
		m_IN_ITEM_CD = i_IN_ITEM_CD;
		m_readWS_CD = i_readWS_CD;
		m_IN_WS_NAME = i_IN_WS_NAME;
		m_readWS_PLANT_CD = i_readWS_PLANT_CD;
		m_IN_WS_CD = i_IN_WS_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PRD_DUE_DATE = i_PRD_DUE_DATE;
		m_PRD_START_DATE = i_PRD_START_DATE;
		m_OPR_INST_PUCH_ODR_QTY = i_OPR_INST_PUCH_ODR_QTY;
		m_WS_VEND_CD = i_WS_VEND_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_h_ODR_STS_TYP = i_h_ODR_STS_TYP;
		m_InR1_OD_TYP = i_InR1_OD_TYP;
		m_InC1_ODR_STS_TYP = i_InC1_ODR_STS_TYP;
		m_InC2_ODR_STS_TYP = i_InC2_ODR_STS_TYP;
		m_InC3_ODR_STS_TYP = i_InC3_ODR_STS_TYP;
		m_InPLANT_CD = i_InPLANT_CD;
		m_IN_PRD_START_DATE_FROM = i_IN_PRD_START_DATE_FROM;
		m_IN_PRD_START_DATE_TO = i_IN_PRD_START_DATE_TO;
		m_IN_PRD_DUE_DATE_FROM = i_IN_PRD_DUE_DATE_FROM;
		m_IN_PRD_DUE_DATE_TO = i_IN_PRD_DUE_DATE_TO;
		m_PRODUCT_TYP = i_PRODUCT_TYP;
		m_NON_NO_ITEM_FLG = i_NON_NO_ITEM_FLG;
		m_NON_NO_ITEM_TYP = i_NON_NO_ITEM_TYP;
		m_ROUND_TYP = i_ROUND_TYP;
		m_CUR_CD = i_CUR_CD;
		m_EXCH_RATE = i_EXCH_RATE;
		m_EXCH_START_DATE = i_EXCH_START_DATE;
		m_HOME_CUR_CD = i_HOME_CUR_CD;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CUR_NAME = i_CUR_NAME;
		m_l_COUNT_1 = i_l_COUNT_1;
		m_ROW_COUNT_1 = i_ROW_COUNT_1;
		m_l_COUNT_2 = i_l_COUNT_2;
		m_ROW_COUNT_2 = i_ROW_COUNT_2;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
