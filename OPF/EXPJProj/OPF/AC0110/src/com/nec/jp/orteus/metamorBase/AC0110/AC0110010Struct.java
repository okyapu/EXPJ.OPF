/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/src/com/nec/jp/orteus/metamorBase/AC0110/AC0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0110;

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

public class AC0110010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_r1_VIEW_TYP */
	public String m_r1_VIEW_TYP = null;
	/** �� 2 �ϐ��F m_r2_VIEW_TYP */
	public String m_r2_VIEW_TYP = null;
	/** �� 3 �ϐ��F m_DUE_DATE_FROM */
	public String m_DUE_DATE_FROM = null;
	/** �� 4 �ϐ��F m_DUE_DATE_TO */
	public String m_DUE_DATE_TO = null;
	/** �� 5 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 6 �ϐ��F m_c1_DM_STS_TYP */
	public String m_c1_DM_STS_TYP = null;
	/** �� 7 �ϐ��F m_c2_DM_STS_TYP */
	public String m_c2_DM_STS_TYP = null;
	/** �� 8 �ϐ��F m_c3_DM_STS_TYP */
	public String m_c3_DM_STS_TYP = null;
	/** �� 9 �ϐ��F m_DUE_TIME_FROM */
	public String m_DUE_TIME_FROM = null;
	/** �� 10 �ϐ��F m_DUE_TIME_TO */
	public String m_DUE_TIME_TO = null;
	/** �� 11 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 12 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 13 �ϐ��F m_readJOB_ODR_CD */
	public String m_readJOB_ODR_CD = null;
	/** �� 14 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 15 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 16 �ϐ��F m_setPLANT_CD */
	public String m_setPLANT_CD = null;
	/** �� 17 �ϐ��F m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** �� 18 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 19 �ϐ��F m_l_JOB_ODR_CANCEL_NO */
	public String m_l_JOB_ODR_CANCEL_NO = null;
	/** �� 20 �ϐ��F m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** �� 21 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 22 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 23 �ϐ��F m_l_DM_QTY */
	public String m_l_DM_QTY = null;
	/** �� 24 �ϐ��F m_l_ALC_ALCD_QTY */
	public String m_l_ALC_ALCD_QTY = null;
	/** �� 25 �ϐ��F m_l_ALCDLE_QTY */
	public String m_l_ALCDLE_QTY = null;
	/** �� 26 �ϐ��F m_l_TOTAL_ISSUE_QTY */
	public String m_l_TOTAL_ISSUE_QTY = null;
	/** �� 27 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 28 �ϐ��F m_l_DUE_DATE */
	public String m_l_DUE_DATE = null;
	/** �� 29 �ϐ��F m_l_DM_STS_TYP */
	public String m_l_DM_STS_TYP = null;
	/** �� 30 �ϐ��F m_l_OD_TYP */
	public String m_l_OD_TYP = null;
	/** �� 31 �ϐ��F m_l_MRP_ODR_TYP */
	public String m_l_MRP_ODR_TYP = null;
	/** �� 32 �ϐ��F m_l_OD_NO */
	public String m_l_OD_NO = null;
	/** �� 33 �ϐ��F m_setSYSPLANT_CD_1 */
	public String m_setSYSPLANT_CD_1 = null;
	/** �� 34 �ϐ��F m_setSYSPLANT_CD_2 */
	public String m_setSYSPLANT_CD_2 = null;
	/** �� 35 �ϐ��F m_l_DUE_DATE_FROM */
	public String m_l_DUE_DATE_FROM = null;
	/** �� 36 �ϐ��F m_l_DUE_DATE_TO */
	public String m_l_DUE_DATE_TO = null;
	/** �� 37 �ϐ��F m_l_DUE_DATE_FROM_ZERO */
	public String m_l_DUE_DATE_FROM_ZERO = null;
	/** �� 38 �ϐ��F m_setDM_STS_TYP_1 */
	public String m_setDM_STS_TYP_1 = null;
	/** �� 39 �ϐ��F m_setDM_STS_TYP_2 */
	public String m_setDM_STS_TYP_2 = null;
	/** �� 40 �ϐ��F m_setDM_STS_TYP_3 */
	public String m_setDM_STS_TYP_3 = null;
	/** �� 41 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 42 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 43 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_r1_VIEW_TYP */
	public List l_r1_VIEW_TYP = null;

	/** �� 2 List�ϐ��F l_r2_VIEW_TYP */
	public List l_r2_VIEW_TYP = null;

	/** �� 3 List�ϐ��F l_DUE_DATE_FROM */
	public List l_DUE_DATE_FROM = null;

	/** �� 4 List�ϐ��F l_DUE_DATE_TO */
	public List l_DUE_DATE_TO = null;

	/** �� 5 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 6 List�ϐ��F l_c1_DM_STS_TYP */
	public List l_c1_DM_STS_TYP = null;

	/** �� 7 List�ϐ��F l_c2_DM_STS_TYP */
	public List l_c2_DM_STS_TYP = null;

	/** �� 8 List�ϐ��F l_c3_DM_STS_TYP */
	public List l_c3_DM_STS_TYP = null;

	/** �� 9 List�ϐ��F l_DUE_TIME_FROM */
	public List l_DUE_TIME_FROM = null;

	/** �� 10 List�ϐ��F l_DUE_TIME_TO */
	public List l_DUE_TIME_TO = null;

	/** �� 11 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 12 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 13 List�ϐ��F l_readJOB_ODR_CD */
	public List l_readJOB_ODR_CD = null;

	/** �� 14 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 15 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 16 List�ϐ��F l_setPLANT_CD */
	public List l_setPLANT_CD = null;

	/** �� 17 List�ϐ��F l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** �� 18 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 19 List�ϐ��F l_l_JOB_ODR_CANCEL_NO */
	public List l_l_JOB_ODR_CANCEL_NO = null;

	/** �� 20 List�ϐ��F l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** �� 21 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 23 List�ϐ��F l_l_DM_QTY */
	public List l_l_DM_QTY = null;

	/** �� 24 List�ϐ��F l_l_ALC_ALCD_QTY */
	public List l_l_ALC_ALCD_QTY = null;

	/** �� 25 List�ϐ��F l_l_ALCDLE_QTY */
	public List l_l_ALCDLE_QTY = null;

	/** �� 26 List�ϐ��F l_l_TOTAL_ISSUE_QTY */
	public List l_l_TOTAL_ISSUE_QTY = null;

	/** �� 27 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 28 List�ϐ��F l_l_DUE_DATE */
	public List l_l_DUE_DATE = null;

	/** �� 29 List�ϐ��F l_l_DM_STS_TYP */
	public List l_l_DM_STS_TYP = null;

	/** �� 30 List�ϐ��F l_l_OD_TYP */
	public List l_l_OD_TYP = null;

	/** �� 31 List�ϐ��F l_l_MRP_ODR_TYP */
	public List l_l_MRP_ODR_TYP = null;

	/** �� 32 List�ϐ��F l_l_OD_NO */
	public List l_l_OD_NO = null;

	/** �� 33 List�ϐ��F l_setSYSPLANT_CD_1 */
	public List l_setSYSPLANT_CD_1 = null;

	/** �� 34 List�ϐ��F l_setSYSPLANT_CD_2 */
	public List l_setSYSPLANT_CD_2 = null;

	/** �� 35 List�ϐ��F l_l_DUE_DATE_FROM */
	public List l_l_DUE_DATE_FROM = null;

	/** �� 36 List�ϐ��F l_l_DUE_DATE_TO */
	public List l_l_DUE_DATE_TO = null;

	/** �� 37 List�ϐ��F l_l_DUE_DATE_FROM_ZERO */
	public List l_l_DUE_DATE_FROM_ZERO = null;

	/** �� 38 List�ϐ��F l_setDM_STS_TYP_1 */
	public List l_setDM_STS_TYP_1 = null;

	/** �� 39 List�ϐ��F l_setDM_STS_TYP_2 */
	public List l_setDM_STS_TYP_2 = null;

	/** �� 40 List�ϐ��F l_setDM_STS_TYP_3 */
	public List l_setDM_STS_TYP_3 = null;

	/** �� 41 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 42 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 43 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getr1_VIEW_TYP() { return m_r1_VIEW_TYP; }
	public String getr2_VIEW_TYP() { return m_r2_VIEW_TYP; }
	public String getDUE_DATE_FROM() { return m_DUE_DATE_FROM; }
	public String getDUE_DATE_TO() { return m_DUE_DATE_TO; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getc1_DM_STS_TYP() { return m_c1_DM_STS_TYP; }
	public String getc2_DM_STS_TYP() { return m_c2_DM_STS_TYP; }
	public String getc3_DM_STS_TYP() { return m_c3_DM_STS_TYP; }
	public String getDUE_TIME_FROM() { return m_DUE_TIME_FROM; }
	public String getDUE_TIME_TO() { return m_DUE_TIME_TO; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getreadJOB_ODR_CD() { return m_readJOB_ODR_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getsetPLANT_CD() { return m_setPLANT_CD; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_CANCEL_NO() { return m_l_JOB_ODR_CANCEL_NO; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_DM_QTY() { return m_l_DM_QTY; }
	public String getl_ALC_ALCD_QTY() { return m_l_ALC_ALCD_QTY; }
	public String getl_ALCDLE_QTY() { return m_l_ALCDLE_QTY; }
	public String getl_TOTAL_ISSUE_QTY() { return m_l_TOTAL_ISSUE_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_DUE_DATE() { return m_l_DUE_DATE; }
	public String getl_DM_STS_TYP() { return m_l_DM_STS_TYP; }
	public String getl_OD_TYP() { return m_l_OD_TYP; }
	public String getl_MRP_ODR_TYP() { return m_l_MRP_ODR_TYP; }
	public String getl_OD_NO() { return m_l_OD_NO; }
	public String getsetSYSPLANT_CD_1() { return m_setSYSPLANT_CD_1; }
	public String getsetSYSPLANT_CD_2() { return m_setSYSPLANT_CD_2; }
	public String getl_DUE_DATE_FROM() { return m_l_DUE_DATE_FROM; }
	public String getl_DUE_DATE_TO() { return m_l_DUE_DATE_TO; }
	public String getl_DUE_DATE_FROM_ZERO() { return m_l_DUE_DATE_FROM_ZERO; }
	public String getsetDM_STS_TYP_1() { return m_setDM_STS_TYP_1; }
	public String getsetDM_STS_TYP_2() { return m_setDM_STS_TYP_2; }
	public String getsetDM_STS_TYP_3() { return m_setDM_STS_TYP_3; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r1_VIEW_TYP() { return l_r1_VIEW_TYP; }
	public List getList_r2_VIEW_TYP() { return l_r2_VIEW_TYP; }
	public List getList_DUE_DATE_FROM() { return l_DUE_DATE_FROM; }
	public List getList_DUE_DATE_TO() { return l_DUE_DATE_TO; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_c1_DM_STS_TYP() { return l_c1_DM_STS_TYP; }
	public List getList_c2_DM_STS_TYP() { return l_c2_DM_STS_TYP; }
	public List getList_c3_DM_STS_TYP() { return l_c3_DM_STS_TYP; }
	public List getList_DUE_TIME_FROM() { return l_DUE_TIME_FROM; }
	public List getList_DUE_TIME_TO() { return l_DUE_TIME_TO; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_readJOB_ODR_CD() { return l_readJOB_ODR_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_setPLANT_CD() { return l_setPLANT_CD; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_CANCEL_NO() { return l_l_JOB_ODR_CANCEL_NO; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_DM_QTY() { return l_l_DM_QTY; }
	public List getList_l_ALC_ALCD_QTY() { return l_l_ALC_ALCD_QTY; }
	public List getList_l_ALCDLE_QTY() { return l_l_ALCDLE_QTY; }
	public List getList_l_TOTAL_ISSUE_QTY() { return l_l_TOTAL_ISSUE_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_DUE_DATE() { return l_l_DUE_DATE; }
	public List getList_l_DM_STS_TYP() { return l_l_DM_STS_TYP; }
	public List getList_l_OD_TYP() { return l_l_OD_TYP; }
	public List getList_l_MRP_ODR_TYP() { return l_l_MRP_ODR_TYP; }
	public List getList_l_OD_NO() { return l_l_OD_NO; }
	public List getList_setSYSPLANT_CD_1() { return l_setSYSPLANT_CD_1; }
	public List getList_setSYSPLANT_CD_2() { return l_setSYSPLANT_CD_2; }
	public List getList_l_DUE_DATE_FROM() { return l_l_DUE_DATE_FROM; }
	public List getList_l_DUE_DATE_TO() { return l_l_DUE_DATE_TO; }
	public List getList_l_DUE_DATE_FROM_ZERO() { return l_l_DUE_DATE_FROM_ZERO; }
	public List getList_setDM_STS_TYP_1() { return l_setDM_STS_TYP_1; }
	public List getList_setDM_STS_TYP_2() { return l_setDM_STS_TYP_2; }
	public List getList_setDM_STS_TYP_3() { return l_setDM_STS_TYP_3; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr1_VIEW_TYP(String val) { m_r1_VIEW_TYP = val; }
	public void setr2_VIEW_TYP(String val) { m_r2_VIEW_TYP = val; }
	public void setDUE_DATE_FROM(String val) { m_DUE_DATE_FROM = val; }
	public void setDUE_DATE_TO(String val) { m_DUE_DATE_TO = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setc1_DM_STS_TYP(String val) { m_c1_DM_STS_TYP = val; }
	public void setc2_DM_STS_TYP(String val) { m_c2_DM_STS_TYP = val; }
	public void setc3_DM_STS_TYP(String val) { m_c3_DM_STS_TYP = val; }
	public void setDUE_TIME_FROM(String val) { m_DUE_TIME_FROM = val; }
	public void setDUE_TIME_TO(String val) { m_DUE_TIME_TO = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setreadJOB_ODR_CD(String val) { m_readJOB_ODR_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setsetPLANT_CD(String val) { m_setPLANT_CD = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_CANCEL_NO(String val) { m_l_JOB_ODR_CANCEL_NO = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_DM_QTY(String val) { m_l_DM_QTY = val; }
	public void setl_ALC_ALCD_QTY(String val) { m_l_ALC_ALCD_QTY = val; }
	public void setl_ALCDLE_QTY(String val) { m_l_ALCDLE_QTY = val; }
	public void setl_TOTAL_ISSUE_QTY(String val) { m_l_TOTAL_ISSUE_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_DUE_DATE(String val) { m_l_DUE_DATE = val; }
	public void setl_DM_STS_TYP(String val) { m_l_DM_STS_TYP = val; }
	public void setl_OD_TYP(String val) { m_l_OD_TYP = val; }
	public void setl_MRP_ODR_TYP(String val) { m_l_MRP_ODR_TYP = val; }
	public void setl_OD_NO(String val) { m_l_OD_NO = val; }
	public void setsetSYSPLANT_CD_1(String val) { m_setSYSPLANT_CD_1 = val; }
	public void setsetSYSPLANT_CD_2(String val) { m_setSYSPLANT_CD_2 = val; }
	public void setl_DUE_DATE_FROM(String val) { m_l_DUE_DATE_FROM = val; }
	public void setl_DUE_DATE_TO(String val) { m_l_DUE_DATE_TO = val; }
	public void setl_DUE_DATE_FROM_ZERO(String val) { m_l_DUE_DATE_FROM_ZERO = val; }
	public void setsetDM_STS_TYP_1(String val) { m_setDM_STS_TYP_1 = val; }
	public void setsetDM_STS_TYP_2(String val) { m_setDM_STS_TYP_2 = val; }
	public void setsetDM_STS_TYP_3(String val) { m_setDM_STS_TYP_3 = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_r1_VIEW_TYP(List list) { l_r1_VIEW_TYP = list; }
	public void setList_r2_VIEW_TYP(List list) { l_r2_VIEW_TYP = list; }
	public void setList_DUE_DATE_FROM(List list) { l_DUE_DATE_FROM = list; }
	public void setList_DUE_DATE_TO(List list) { l_DUE_DATE_TO = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_c1_DM_STS_TYP(List list) { l_c1_DM_STS_TYP = list; }
	public void setList_c2_DM_STS_TYP(List list) { l_c2_DM_STS_TYP = list; }
	public void setList_c3_DM_STS_TYP(List list) { l_c3_DM_STS_TYP = list; }
	public void setList_DUE_TIME_FROM(List list) { l_DUE_TIME_FROM = list; }
	public void setList_DUE_TIME_TO(List list) { l_DUE_TIME_TO = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_readJOB_ODR_CD(List list) { l_readJOB_ODR_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_setPLANT_CD(List list) { l_setPLANT_CD = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_CANCEL_NO(List list) { l_l_JOB_ODR_CANCEL_NO = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_DM_QTY(List list) { l_l_DM_QTY = list; }
	public void setList_l_ALC_ALCD_QTY(List list) { l_l_ALC_ALCD_QTY = list; }
	public void setList_l_ALCDLE_QTY(List list) { l_l_ALCDLE_QTY = list; }
	public void setList_l_TOTAL_ISSUE_QTY(List list) { l_l_TOTAL_ISSUE_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_DUE_DATE(List list) { l_l_DUE_DATE = list; }
	public void setList_l_DM_STS_TYP(List list) { l_l_DM_STS_TYP = list; }
	public void setList_l_OD_TYP(List list) { l_l_OD_TYP = list; }
	public void setList_l_MRP_ODR_TYP(List list) { l_l_MRP_ODR_TYP = list; }
	public void setList_l_OD_NO(List list) { l_l_OD_NO = list; }
	public void setList_setSYSPLANT_CD_1(List list) { l_setSYSPLANT_CD_1 = list; }
	public void setList_setSYSPLANT_CD_2(List list) { l_setSYSPLANT_CD_2 = list; }
	public void setList_l_DUE_DATE_FROM(List list) { l_l_DUE_DATE_FROM = list; }
	public void setList_l_DUE_DATE_TO(List list) { l_l_DUE_DATE_TO = list; }
	public void setList_l_DUE_DATE_FROM_ZERO(List list) { l_l_DUE_DATE_FROM_ZERO = list; }
	public void setList_setDM_STS_TYP_1(List list) { l_setDM_STS_TYP_1 = list; }
	public void setList_setDM_STS_TYP_2(List list) { l_setDM_STS_TYP_2 = list; }
	public void setList_setDM_STS_TYP_3(List list) { l_setDM_STS_TYP_3 = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_r1_VIEW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_VIEW_TYP == null) {
			l_r1_VIEW_TYP = new ArrayList();
		} else {
			l_r1_VIEW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_VIEW_TYP.add(((AC0110010Struct) list.get(i)).getr1_VIEW_TYP());
		}
		return size;
	}
	public int setL2L_r2_VIEW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_VIEW_TYP == null) {
			l_r2_VIEW_TYP = new ArrayList();
		} else {
			l_r2_VIEW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_VIEW_TYP.add(((AC0110010Struct) list.get(i)).getr2_VIEW_TYP());
		}
		return size;
	}
	public int setL2L_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_FROM == null) {
			l_DUE_DATE_FROM = new ArrayList();
		} else {
			l_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_FROM.add(((AC0110010Struct) list.get(i)).getDUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_TO == null) {
			l_DUE_DATE_TO = new ArrayList();
		} else {
			l_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_TO.add(((AC0110010Struct) list.get(i)).getDUE_DATE_TO());
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
			l_DOWNLOAD_FILE.add(((AC0110010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_c1_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_DM_STS_TYP == null) {
			l_c1_DM_STS_TYP = new ArrayList();
		} else {
			l_c1_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_DM_STS_TYP.add(((AC0110010Struct) list.get(i)).getc1_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_c2_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_DM_STS_TYP == null) {
			l_c2_DM_STS_TYP = new ArrayList();
		} else {
			l_c2_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_DM_STS_TYP.add(((AC0110010Struct) list.get(i)).getc2_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_c3_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_DM_STS_TYP == null) {
			l_c3_DM_STS_TYP = new ArrayList();
		} else {
			l_c3_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_DM_STS_TYP.add(((AC0110010Struct) list.get(i)).getc3_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_DUE_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_TIME_FROM == null) {
			l_DUE_TIME_FROM = new ArrayList();
		} else {
			l_DUE_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_TIME_FROM.add(((AC0110010Struct) list.get(i)).getDUE_TIME_FROM());
		}
		return size;
	}
	public int setL2L_DUE_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_TIME_TO == null) {
			l_DUE_TIME_TO = new ArrayList();
		} else {
			l_DUE_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_TIME_TO.add(((AC0110010Struct) list.get(i)).getDUE_TIME_TO());
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
			l_ITEM_NAME.add(((AC0110010Struct) list.get(i)).getITEM_NAME());
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
			l_ITEM_CD.add(((AC0110010Struct) list.get(i)).getITEM_CD());
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
			l_readJOB_ODR_CD.add(((AC0110010Struct) list.get(i)).getreadJOB_ODR_CD());
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
			l_JOB_ODR_CD.add(((AC0110010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_CANCEL_NO.add(((AC0110010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_setPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPLANT_CD == null) {
			l_setPLANT_CD = new ArrayList();
		} else {
			l_setPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPLANT_CD.add(((AC0110010Struct) list.get(i)).getsetPLANT_CD());
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
			l_ALC_GRP_CD.add(((AC0110010Struct) list.get(i)).getALC_GRP_CD());
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
			l_l_JOB_ODR_CD.add(((AC0110010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CANCEL_NO == null) {
			l_l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CANCEL_NO.add(((AC0110010Struct) list.get(i)).getl_JOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_l_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_GRP_CD == null) {
			l_l_ALC_GRP_CD = new ArrayList();
		} else {
			l_l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_GRP_CD.add(((AC0110010Struct) list.get(i)).getl_ALC_GRP_CD());
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
			l_l_ITEM_CD.add(((AC0110010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AC0110010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DM_QTY == null) {
			l_l_DM_QTY = new ArrayList();
		} else {
			l_l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DM_QTY.add(((AC0110010Struct) list.get(i)).getl_DM_QTY());
		}
		return size;
	}
	public int setL2L_l_ALC_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_ALCD_QTY == null) {
			l_l_ALC_ALCD_QTY = new ArrayList();
		} else {
			l_l_ALC_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_ALCD_QTY.add(((AC0110010Struct) list.get(i)).getl_ALC_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_l_ALCDLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCDLE_QTY == null) {
			l_l_ALCDLE_QTY = new ArrayList();
		} else {
			l_l_ALCDLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCDLE_QTY.add(((AC0110010Struct) list.get(i)).getl_ALCDLE_QTY());
		}
		return size;
	}
	public int setL2L_l_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_ISSUE_QTY == null) {
			l_l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_ISSUE_QTY.add(((AC0110010Struct) list.get(i)).getl_TOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_UNIT == null) {
			l_l_STOCK_UNIT = new ArrayList();
		} else {
			l_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_UNIT.add(((AC0110010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DUE_DATE == null) {
			l_l_DUE_DATE = new ArrayList();
		} else {
			l_l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DUE_DATE.add(((AC0110010Struct) list.get(i)).getl_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DM_STS_TYP == null) {
			l_l_DM_STS_TYP = new ArrayList();
		} else {
			l_l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DM_STS_TYP.add(((AC0110010Struct) list.get(i)).getl_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OD_TYP == null) {
			l_l_OD_TYP = new ArrayList();
		} else {
			l_l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OD_TYP.add(((AC0110010Struct) list.get(i)).getl_OD_TYP());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP == null) {
			l_l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP.add(((AC0110010Struct) list.get(i)).getl_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OD_NO == null) {
			l_l_OD_NO = new ArrayList();
		} else {
			l_l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OD_NO.add(((AC0110010Struct) list.get(i)).getl_OD_NO());
		}
		return size;
	}
	public int setL2L_setSYSPLANT_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSYSPLANT_CD_1 == null) {
			l_setSYSPLANT_CD_1 = new ArrayList();
		} else {
			l_setSYSPLANT_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSYSPLANT_CD_1.add(((AC0110010Struct) list.get(i)).getsetSYSPLANT_CD_1());
		}
		return size;
	}
	public int setL2L_setSYSPLANT_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSYSPLANT_CD_2 == null) {
			l_setSYSPLANT_CD_2 = new ArrayList();
		} else {
			l_setSYSPLANT_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSYSPLANT_CD_2.add(((AC0110010Struct) list.get(i)).getsetSYSPLANT_CD_2());
		}
		return size;
	}
	public int setL2L_l_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DUE_DATE_FROM == null) {
			l_l_DUE_DATE_FROM = new ArrayList();
		} else {
			l_l_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DUE_DATE_FROM.add(((AC0110010Struct) list.get(i)).getl_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_l_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DUE_DATE_TO == null) {
			l_l_DUE_DATE_TO = new ArrayList();
		} else {
			l_l_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DUE_DATE_TO.add(((AC0110010Struct) list.get(i)).getl_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_l_DUE_DATE_FROM_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DUE_DATE_FROM_ZERO == null) {
			l_l_DUE_DATE_FROM_ZERO = new ArrayList();
		} else {
			l_l_DUE_DATE_FROM_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DUE_DATE_FROM_ZERO.add(((AC0110010Struct) list.get(i)).getl_DUE_DATE_FROM_ZERO());
		}
		return size;
	}
	public int setL2L_setDM_STS_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDM_STS_TYP_1 == null) {
			l_setDM_STS_TYP_1 = new ArrayList();
		} else {
			l_setDM_STS_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDM_STS_TYP_1.add(((AC0110010Struct) list.get(i)).getsetDM_STS_TYP_1());
		}
		return size;
	}
	public int setL2L_setDM_STS_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDM_STS_TYP_2 == null) {
			l_setDM_STS_TYP_2 = new ArrayList();
		} else {
			l_setDM_STS_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDM_STS_TYP_2.add(((AC0110010Struct) list.get(i)).getsetDM_STS_TYP_2());
		}
		return size;
	}
	public int setL2L_setDM_STS_TYP_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDM_STS_TYP_3 == null) {
			l_setDM_STS_TYP_3 = new ArrayList();
		} else {
			l_setDM_STS_TYP_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDM_STS_TYP_3.add(((AC0110010Struct) list.get(i)).getsetDM_STS_TYP_3());
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
			l_TIME_CTRL.add(((AC0110010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AC0110010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0110010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_VIEW_TYP = null;
		m_r2_VIEW_TYP = null;
		m_DUE_DATE_FROM = null;
		m_DUE_DATE_TO = null;
		m_DOWNLOAD_FILE = null;
		m_c1_DM_STS_TYP = null;
		m_c2_DM_STS_TYP = null;
		m_c3_DM_STS_TYP = null;
		m_DUE_TIME_FROM = null;
		m_DUE_TIME_TO = null;
		m_ITEM_NAME = null;
		m_ITEM_CD = null;
		m_readJOB_ODR_CD = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_setPLANT_CD = null;
		m_ALC_GRP_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_CANCEL_NO = null;
		m_l_ALC_GRP_CD = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_DM_QTY = null;
		m_l_ALC_ALCD_QTY = null;
		m_l_ALCDLE_QTY = null;
		m_l_TOTAL_ISSUE_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_DUE_DATE = null;
		m_l_DM_STS_TYP = null;
		m_l_OD_TYP = null;
		m_l_MRP_ODR_TYP = null;
		m_l_OD_NO = null;
		m_setSYSPLANT_CD_1 = null;
		m_setSYSPLANT_CD_2 = null;
		m_l_DUE_DATE_FROM = null;
		m_l_DUE_DATE_TO = null;
		m_l_DUE_DATE_FROM_ZERO = null;
		m_setDM_STS_TYP_1 = null;
		m_setDM_STS_TYP_2 = null;
		m_setDM_STS_TYP_3 = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r1_VIEW_TYP = null;
		l_r2_VIEW_TYP = null;
		l_DUE_DATE_FROM = null;
		l_DUE_DATE_TO = null;
		l_DOWNLOAD_FILE = null;
		l_c1_DM_STS_TYP = null;
		l_c2_DM_STS_TYP = null;
		l_c3_DM_STS_TYP = null;
		l_DUE_TIME_FROM = null;
		l_DUE_TIME_TO = null;
		l_ITEM_NAME = null;
		l_ITEM_CD = null;
		l_readJOB_ODR_CD = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_setPLANT_CD = null;
		l_ALC_GRP_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_CANCEL_NO = null;
		l_l_ALC_GRP_CD = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_DM_QTY = null;
		l_l_ALC_ALCD_QTY = null;
		l_l_ALCDLE_QTY = null;
		l_l_TOTAL_ISSUE_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_DUE_DATE = null;
		l_l_DM_STS_TYP = null;
		l_l_OD_TYP = null;
		l_l_MRP_ODR_TYP = null;
		l_l_OD_NO = null;
		l_setSYSPLANT_CD_1 = null;
		l_setSYSPLANT_CD_2 = null;
		l_l_DUE_DATE_FROM = null;
		l_l_DUE_DATE_TO = null;
		l_l_DUE_DATE_FROM_ZERO = null;
		l_setDM_STS_TYP_1 = null;
		l_setDM_STS_TYP_2 = null;
		l_setDM_STS_TYP_3 = null;
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
	 * medAC0110010�N���X�̕W���R���X�g���N�^
	 */
	public AC0110010Struct()
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
	public void setStruct(AC0110010Struct struct)
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
	public void setStructM(AC0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_VIEW_TYP(struct.getr1_VIEW_TYP());
			this.setr2_VIEW_TYP(struct.getr2_VIEW_TYP());
			this.setDUE_DATE_FROM(struct.getDUE_DATE_FROM());
			this.setDUE_DATE_TO(struct.getDUE_DATE_TO());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setc1_DM_STS_TYP(struct.getc1_DM_STS_TYP());
			this.setc2_DM_STS_TYP(struct.getc2_DM_STS_TYP());
			this.setc3_DM_STS_TYP(struct.getc3_DM_STS_TYP());
			this.setDUE_TIME_FROM(struct.getDUE_TIME_FROM());
			this.setDUE_TIME_TO(struct.getDUE_TIME_TO());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setreadJOB_ODR_CD(struct.getreadJOB_ODR_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setsetPLANT_CD(struct.getsetPLANT_CD());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_DM_QTY(struct.getl_DM_QTY());
			this.setl_ALC_ALCD_QTY(struct.getl_ALC_ALCD_QTY());
			this.setl_ALCDLE_QTY(struct.getl_ALCDLE_QTY());
			this.setl_TOTAL_ISSUE_QTY(struct.getl_TOTAL_ISSUE_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_DUE_DATE(struct.getl_DUE_DATE());
			this.setl_DM_STS_TYP(struct.getl_DM_STS_TYP());
			this.setl_OD_TYP(struct.getl_OD_TYP());
			this.setl_MRP_ODR_TYP(struct.getl_MRP_ODR_TYP());
			this.setl_OD_NO(struct.getl_OD_NO());
			this.setsetSYSPLANT_CD_1(struct.getsetSYSPLANT_CD_1());
			this.setsetSYSPLANT_CD_2(struct.getsetSYSPLANT_CD_2());
			this.setl_DUE_DATE_FROM(struct.getl_DUE_DATE_FROM());
			this.setl_DUE_DATE_TO(struct.getl_DUE_DATE_TO());
			this.setl_DUE_DATE_FROM_ZERO(struct.getl_DUE_DATE_FROM_ZERO());
			this.setsetDM_STS_TYP_1(struct.getsetDM_STS_TYP_1());
			this.setsetDM_STS_TYP_2(struct.getsetDM_STS_TYP_2());
			this.setsetDM_STS_TYP_3(struct.getsetDM_STS_TYP_3());
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
	public void setStructL(AC0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_VIEW_TYP(struct.getList_r1_VIEW_TYP());
			this.setList_r2_VIEW_TYP(struct.getList_r2_VIEW_TYP());
			this.setList_DUE_DATE_FROM(struct.getList_DUE_DATE_FROM());
			this.setList_DUE_DATE_TO(struct.getList_DUE_DATE_TO());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_c1_DM_STS_TYP(struct.getList_c1_DM_STS_TYP());
			this.setList_c2_DM_STS_TYP(struct.getList_c2_DM_STS_TYP());
			this.setList_c3_DM_STS_TYP(struct.getList_c3_DM_STS_TYP());
			this.setList_DUE_TIME_FROM(struct.getList_DUE_TIME_FROM());
			this.setList_DUE_TIME_TO(struct.getList_DUE_TIME_TO());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_readJOB_ODR_CD(struct.getList_readJOB_ODR_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_setPLANT_CD(struct.getList_setPLANT_CD());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_CANCEL_NO(struct.getList_l_JOB_ODR_CANCEL_NO());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_DM_QTY(struct.getList_l_DM_QTY());
			this.setList_l_ALC_ALCD_QTY(struct.getList_l_ALC_ALCD_QTY());
			this.setList_l_ALCDLE_QTY(struct.getList_l_ALCDLE_QTY());
			this.setList_l_TOTAL_ISSUE_QTY(struct.getList_l_TOTAL_ISSUE_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_DUE_DATE(struct.getList_l_DUE_DATE());
			this.setList_l_DM_STS_TYP(struct.getList_l_DM_STS_TYP());
			this.setList_l_OD_TYP(struct.getList_l_OD_TYP());
			this.setList_l_MRP_ODR_TYP(struct.getList_l_MRP_ODR_TYP());
			this.setList_l_OD_NO(struct.getList_l_OD_NO());
			this.setList_setSYSPLANT_CD_1(struct.getList_setSYSPLANT_CD_1());
			this.setList_setSYSPLANT_CD_2(struct.getList_setSYSPLANT_CD_2());
			this.setList_l_DUE_DATE_FROM(struct.getList_l_DUE_DATE_FROM());
			this.setList_l_DUE_DATE_TO(struct.getList_l_DUE_DATE_TO());
			this.setList_l_DUE_DATE_FROM_ZERO(struct.getList_l_DUE_DATE_FROM_ZERO());
			this.setList_setDM_STS_TYP_1(struct.getList_setDM_STS_TYP_1());
			this.setList_setDM_STS_TYP_2(struct.getList_setDM_STS_TYP_2());
			this.setList_setDM_STS_TYP_3(struct.getList_setDM_STS_TYP_3());
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
	// �� 1 �ϐ������l�F i_r1_VIEW_TYP


	final static String i_r1_VIEW_TYP = null;

	// �� 2 �ϐ������l�F i_r2_VIEW_TYP


	final static String i_r2_VIEW_TYP = null;

	// �� 3 �ϐ������l�F i_DUE_DATE_FROM


	final static String i_DUE_DATE_FROM = null;

	// �� 4 �ϐ������l�F i_DUE_DATE_TO


	final static String i_DUE_DATE_TO = null;

	// �� 5 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 6 �ϐ������l�F i_c1_DM_STS_TYP


	final static String i_c1_DM_STS_TYP = null;

	// �� 7 �ϐ������l�F i_c2_DM_STS_TYP


	final static String i_c2_DM_STS_TYP = null;

	// �� 8 �ϐ������l�F i_c3_DM_STS_TYP


	final static String i_c3_DM_STS_TYP = null;

	// �� 9 �ϐ������l�F i_DUE_TIME_FROM


	final static String i_DUE_TIME_FROM = null;

	// �� 10 �ϐ������l�F i_DUE_TIME_TO


	final static String i_DUE_TIME_TO = null;

	// �� 11 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 12 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 13 �ϐ������l�F i_readJOB_ODR_CD


	final static String i_readJOB_ODR_CD = null;

	// �� 14 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 15 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 16 �ϐ������l�F i_setPLANT_CD


	final static String i_setPLANT_CD = null;

	// �� 17 �ϐ������l�F i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// �� 18 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 19 �ϐ������l�F i_l_JOB_ODR_CANCEL_NO


	final static String i_l_JOB_ODR_CANCEL_NO = null;

	// �� 20 �ϐ������l�F i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// �� 21 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 23 �ϐ������l�F i_l_DM_QTY


	final static String i_l_DM_QTY = null;

	// �� 24 �ϐ������l�F i_l_ALC_ALCD_QTY


	final static String i_l_ALC_ALCD_QTY = null;

	// �� 25 �ϐ������l�F i_l_ALCDLE_QTY


	final static String i_l_ALCDLE_QTY = null;

	// �� 26 �ϐ������l�F i_l_TOTAL_ISSUE_QTY


	final static String i_l_TOTAL_ISSUE_QTY = null;

	// �� 27 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 28 �ϐ������l�F i_l_DUE_DATE


	final static String i_l_DUE_DATE = null;

	// �� 29 �ϐ������l�F i_l_DM_STS_TYP


	final static String i_l_DM_STS_TYP = null;

	// �� 30 �ϐ������l�F i_l_OD_TYP


	final static String i_l_OD_TYP = null;

	// �� 31 �ϐ������l�F i_l_MRP_ODR_TYP


	final static String i_l_MRP_ODR_TYP = null;

	// �� 32 �ϐ������l�F i_l_OD_NO


	final static String i_l_OD_NO = null;

	// �� 33 �ϐ������l�F i_setSYSPLANT_CD_1


	final static String i_setSYSPLANT_CD_1 = null;

	// �� 34 �ϐ������l�F i_setSYSPLANT_CD_2


	final static String i_setSYSPLANT_CD_2 = null;

	// �� 35 �ϐ������l�F i_l_DUE_DATE_FROM


	final static String i_l_DUE_DATE_FROM = null;

	// �� 36 �ϐ������l�F i_l_DUE_DATE_TO


	final static String i_l_DUE_DATE_TO = null;

	// �� 37 �ϐ������l�F i_l_DUE_DATE_FROM_ZERO


	final static String i_l_DUE_DATE_FROM_ZERO = null;

	// �� 38 �ϐ������l�F i_setDM_STS_TYP_1


	final static String i_setDM_STS_TYP_1 = null;

	// �� 39 �ϐ������l�F i_setDM_STS_TYP_2


	final static String i_setDM_STS_TYP_2 = null;

	// �� 40 �ϐ������l�F i_setDM_STS_TYP_3


	final static String i_setDM_STS_TYP_3 = null;

	// �� 41 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 42 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 43 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_r1_VIEW_TYP
	final static String i_r1_VIEW_TYP = null;
	// �� 2 �ϐ������l�F i_r2_VIEW_TYP
	final static String i_r2_VIEW_TYP = null;
	// �� 3 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 4 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 5 �ϐ������l�F i_DUE_DATE_FROM
	final static String i_DUE_DATE_FROM = null;
	// �� 6 �ϐ������l�F i_DUE_DATE_TO
	final static String i_DUE_DATE_TO = null;
	// �� 7 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 8 �ϐ������l�F i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// �� 9 �ϐ������l�F i_ALC_GRP_CD
	final static String i_ALC_GRP_CD = null;
	// �� 10 �ϐ������l�F i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;
	// �� 11 �ϐ������l�F i_c1_DM_STS_TYP
	final static String i_c1_DM_STS_TYP = null;
	// �� 12 �ϐ������l�F i_c2_DM_STS_TYP
	final static String i_c2_DM_STS_TYP = null;
	// �� 13 �ϐ������l�F i_c3_DM_STS_TYP
	final static String i_c3_DM_STS_TYP = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_VIEW_TYP = i_r1_VIEW_TYP;
		m_r2_VIEW_TYP = i_r2_VIEW_TYP;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DUE_DATE_FROM = i_DUE_DATE_FROM;
		m_DUE_DATE_TO = i_DUE_DATE_TO;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_c1_DM_STS_TYP = i_c1_DM_STS_TYP;
		m_c2_DM_STS_TYP = i_c2_DM_STS_TYP;
		m_c3_DM_STS_TYP = i_c3_DM_STS_TYP;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
