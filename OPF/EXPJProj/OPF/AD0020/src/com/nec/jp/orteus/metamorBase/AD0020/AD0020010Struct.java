/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/src/com/nec/jp/orteus/metamorBase/AD0020/AD0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0020;

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

public class AD0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_InitLevel */
	public String m_InitLevel = null;
	/** �� 2 �ϐ��F m_AD0020010tree1 */
	public String m_AD0020010tree1 = null;
	/** �� 3 �ϐ��F m_id */
	public String m_id = null;
	/** �� 4 �ϐ��F m_lvl */
	public String m_lvl = null;
	/** �� 5 �ϐ��F m_parent */
	public String m_parent = null;
	/** �� 6 �ϐ��F m_label */
	public String m_label = null;
	/** �� 7 �ϐ��F m_ctx */
	public String m_ctx = null;
	/** �� 8 �ϐ��F m_maxid */
	public String m_maxid = null;
	/** �� 9 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 10 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 11 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 12 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 13 �ϐ��F m_OD_TYP */
	public String m_OD_TYP = null;
	/** �� 14 �ϐ��F m_ODR_STS_TYP */
	public String m_ODR_STS_TYP = null;
	/** �� 15 �ϐ��F m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** �� 16 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 17 �ϐ��F m_MRP_TYP */
	public String m_MRP_TYP = null;
	/** �� 18 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 19 �ϐ��F m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** �� 20 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 21 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 22 �ϐ��F m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** �� 23 �ϐ��F m_JOB_ODR_TYP_DN */
	public String m_JOB_ODR_TYP_DN = null;
	/** �� 24 �ϐ��F m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** �� 25 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 26 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 27 �ϐ��F m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** �� 28 �ϐ��F m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;
	/** �� 29 �ϐ��F m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** �� 30 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 31 �ϐ��F m_UNIT_QTY_TYP_DN */
	public String m_UNIT_QTY_TYP_DN = null;
	/** �� 32 �ϐ��F m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** �� 33 �ϐ��F m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** �� 34 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 35 �ϐ��F m_PRD_START_DATE */
	public String m_PRD_START_DATE = null;
	/** �� 36 �ϐ��F m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** �� 37 �ϐ��F m_SUM_PUCH_ODR_QTY */
	public String m_SUM_PUCH_ODR_QTY = null;
	/** �� 38 �ϐ��F m_SUM_OPR_INST_QTY */
	public String m_SUM_OPR_INST_QTY = null;
	/** �� 39 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 40 �ϐ��F m_DM_QTY */
	public String m_DM_QTY = null;
	/** �� 41 �ϐ��F m_SUM_ALCD_QTY */
	public String m_SUM_ALCD_QTY = null;
	/** �� 42 �ϐ��F m_ODR_STS_TYP_DN */
	public String m_ODR_STS_TYP_DN = null;
	/** �� 43 �ϐ��F m_DM_STS_TYP_DN */
	public String m_DM_STS_TYP_DN = null;
	/** �� 44 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_InitLevel */
	public List l_InitLevel = null;

	/** �� 2 List�ϐ��F l_AD0020010tree1 */
	public List l_AD0020010tree1 = null;

	/** �� 3 List�ϐ��F l_id */
	public List l_id = null;

	/** �� 4 List�ϐ��F l_lvl */
	public List l_lvl = null;

	/** �� 5 List�ϐ��F l_parent */
	public List l_parent = null;

	/** �� 6 List�ϐ��F l_label */
	public List l_label = null;

	/** �� 7 List�ϐ��F l_ctx */
	public List l_ctx = null;

	/** �� 8 List�ϐ��F l_maxid */
	public List l_maxid = null;

	/** �� 9 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 10 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 11 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 13 List�ϐ��F l_OD_TYP */
	public List l_OD_TYP = null;

	/** �� 14 List�ϐ��F l_ODR_STS_TYP */
	public List l_ODR_STS_TYP = null;

	/** �� 15 List�ϐ��F l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** �� 16 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 17 List�ϐ��F l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** �� 18 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 19 List�ϐ��F l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** �� 20 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 21 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 22 List�ϐ��F l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** �� 23 List�ϐ��F l_JOB_ODR_TYP_DN */
	public List l_JOB_ODR_TYP_DN = null;

	/** �� 24 List�ϐ��F l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** �� 25 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 26 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 27 List�ϐ��F l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** �� 28 List�ϐ��F l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;

	/** �� 29 List�ϐ��F l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** �� 30 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 31 List�ϐ��F l_UNIT_QTY_TYP_DN */
	public List l_UNIT_QTY_TYP_DN = null;

	/** �� 32 List�ϐ��F l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** �� 33 List�ϐ��F l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** �� 34 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 35 List�ϐ��F l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** �� 36 List�ϐ��F l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** �� 37 List�ϐ��F l_SUM_PUCH_ODR_QTY */
	public List l_SUM_PUCH_ODR_QTY = null;

	/** �� 38 List�ϐ��F l_SUM_OPR_INST_QTY */
	public List l_SUM_OPR_INST_QTY = null;

	/** �� 39 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 40 List�ϐ��F l_DM_QTY */
	public List l_DM_QTY = null;

	/** �� 41 List�ϐ��F l_SUM_ALCD_QTY */
	public List l_SUM_ALCD_QTY = null;

	/** �� 42 List�ϐ��F l_ODR_STS_TYP_DN */
	public List l_ODR_STS_TYP_DN = null;

	/** �� 43 List�ϐ��F l_DM_STS_TYP_DN */
	public List l_DM_STS_TYP_DN = null;

	/** �� 44 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getInitLevel() { return m_InitLevel; }
	public String getAD0020010tree1() { return m_AD0020010tree1; }
	public String getid() { return m_id; }
	public String getlvl() { return m_lvl; }
	public String getparent() { return m_parent; }
	public String getlabel() { return m_label; }
	public String getctx() { return m_ctx; }
	public String getmaxid() { return m_maxid; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getOD_TYP() { return m_OD_TYP; }
	public String getODR_STS_TYP() { return m_ODR_STS_TYP; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getMRP_TYP() { return m_MRP_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getJOB_ODR_TYP_DN() { return m_JOB_ODR_TYP_DN; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getUNIT_QTY_TYP_DN() { return m_UNIT_QTY_TYP_DN; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getSUM_PUCH_ODR_QTY() { return m_SUM_PUCH_ODR_QTY; }
	public String getSUM_OPR_INST_QTY() { return m_SUM_OPR_INST_QTY; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getSUM_ALCD_QTY() { return m_SUM_ALCD_QTY; }
	public String getODR_STS_TYP_DN() { return m_ODR_STS_TYP_DN; }
	public String getDM_STS_TYP_DN() { return m_DM_STS_TYP_DN; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }

	public List getList_InitLevel() { return l_InitLevel; }
	public List getList_AD0020010tree1() { return l_AD0020010tree1; }
	public List getList_id() { return l_id; }
	public List getList_lvl() { return l_lvl; }
	public List getList_parent() { return l_parent; }
	public List getList_label() { return l_label; }
	public List getList_ctx() { return l_ctx; }
	public List getList_maxid() { return l_maxid; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_ODR_STS_TYP() { return l_ODR_STS_TYP; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_JOB_ODR_TYP_DN() { return l_JOB_ODR_TYP_DN; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_UNIT_QTY_TYP_DN() { return l_UNIT_QTY_TYP_DN; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_SUM_PUCH_ODR_QTY() { return l_SUM_PUCH_ODR_QTY; }
	public List getList_SUM_OPR_INST_QTY() { return l_SUM_OPR_INST_QTY; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_SUM_ALCD_QTY() { return l_SUM_ALCD_QTY; }
	public List getList_ODR_STS_TYP_DN() { return l_ODR_STS_TYP_DN; }
	public List getList_DM_STS_TYP_DN() { return l_DM_STS_TYP_DN; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }

	public void setInitLevel(String val) { m_InitLevel = val; }
	public void setAD0020010tree1(String val) { m_AD0020010tree1 = val; }
	public void setid(String val) { m_id = val; }
	public void setlvl(String val) { m_lvl = val; }
	public void setparent(String val) { m_parent = val; }
	public void setlabel(String val) { m_label = val; }
	public void setctx(String val) { m_ctx = val; }
	public void setmaxid(String val) { m_maxid = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setOD_TYP(String val) { m_OD_TYP = val; }
	public void setODR_STS_TYP(String val) { m_ODR_STS_TYP = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setMRP_TYP(String val) { m_MRP_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setJOB_ODR_TYP_DN(String val) { m_JOB_ODR_TYP_DN = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setUNIT_QTY_TYP_DN(String val) { m_UNIT_QTY_TYP_DN = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setSUM_PUCH_ODR_QTY(String val) { m_SUM_PUCH_ODR_QTY = val; }
	public void setSUM_OPR_INST_QTY(String val) { m_SUM_OPR_INST_QTY = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setSUM_ALCD_QTY(String val) { m_SUM_ALCD_QTY = val; }
	public void setODR_STS_TYP_DN(String val) { m_ODR_STS_TYP_DN = val; }
	public void setDM_STS_TYP_DN(String val) { m_DM_STS_TYP_DN = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }


	public void setList_InitLevel(List list) { l_InitLevel = list; }
	public void setList_AD0020010tree1(List list) { l_AD0020010tree1 = list; }
	public void setList_id(List list) { l_id = list; }
	public void setList_lvl(List list) { l_lvl = list; }
	public void setList_parent(List list) { l_parent = list; }
	public void setList_label(List list) { l_label = list; }
	public void setList_ctx(List list) { l_ctx = list; }
	public void setList_maxid(List list) { l_maxid = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_ODR_STS_TYP(List list) { l_ODR_STS_TYP = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_JOB_ODR_TYP_DN(List list) { l_JOB_ODR_TYP_DN = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_UNIT_QTY_TYP_DN(List list) { l_UNIT_QTY_TYP_DN = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_SUM_PUCH_ODR_QTY(List list) { l_SUM_PUCH_ODR_QTY = list; }
	public void setList_SUM_OPR_INST_QTY(List list) { l_SUM_OPR_INST_QTY = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_SUM_ALCD_QTY(List list) { l_SUM_ALCD_QTY = list; }
	public void setList_ODR_STS_TYP_DN(List list) { l_ODR_STS_TYP_DN = list; }
	public void setList_DM_STS_TYP_DN(List list) { l_DM_STS_TYP_DN = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }

	public int setL2L_InitLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InitLevel == null) {
			l_InitLevel = new ArrayList();
		} else {
			l_InitLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InitLevel.add(((AD0020010Struct) list.get(i)).getInitLevel());
		}
		return size;
	}
	public int setL2L_AD0020010tree1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AD0020010tree1 == null) {
			l_AD0020010tree1 = new ArrayList();
		} else {
			l_AD0020010tree1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AD0020010tree1.add(((AD0020010Struct) list.get(i)).getAD0020010tree1());
		}
		return size;
	}
	public int setL2L_id(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_id == null) {
			l_id = new ArrayList();
		} else {
			l_id.clear();
		}
		for (int i = 0; i < size; i++) {
			l_id.add(((AD0020010Struct) list.get(i)).getid());
		}
		return size;
	}
	public int setL2L_lvl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lvl == null) {
			l_lvl = new ArrayList();
		} else {
			l_lvl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lvl.add(((AD0020010Struct) list.get(i)).getlvl());
		}
		return size;
	}
	public int setL2L_parent(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_parent == null) {
			l_parent = new ArrayList();
		} else {
			l_parent.clear();
		}
		for (int i = 0; i < size; i++) {
			l_parent.add(((AD0020010Struct) list.get(i)).getparent());
		}
		return size;
	}
	public int setL2L_label(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_label == null) {
			l_label = new ArrayList();
		} else {
			l_label.clear();
		}
		for (int i = 0; i < size; i++) {
			l_label.add(((AD0020010Struct) list.get(i)).getlabel());
		}
		return size;
	}
	public int setL2L_ctx(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ctx == null) {
			l_ctx = new ArrayList();
		} else {
			l_ctx.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ctx.add(((AD0020010Struct) list.get(i)).getctx());
		}
		return size;
	}
	public int setL2L_maxid(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_maxid == null) {
			l_maxid = new ArrayList();
		} else {
			l_maxid.clear();
		}
		for (int i = 0; i < size; i++) {
			l_maxid.add(((AD0020010Struct) list.get(i)).getmaxid());
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
			l_OD_NO.add(((AD0020010Struct) list.get(i)).getOD_NO());
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
			l_PLANT_CD.add(((AD0020010Struct) list.get(i)).getPLANT_CD());
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
			l_ITEM_CD.add(((AD0020010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AD0020010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP == null) {
			l_OD_TYP = new ArrayList();
		} else {
			l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP.add(((AD0020010Struct) list.get(i)).getOD_TYP());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP == null) {
			l_ODR_STS_TYP = new ArrayList();
		} else {
			l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP.add(((AD0020010Struct) list.get(i)).getODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP == null) {
			l_DM_STS_TYP = new ArrayList();
		} else {
			l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP.add(((AD0020010Struct) list.get(i)).getDM_STS_TYP());
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
			l_MRP_ODR_TYP.add(((AD0020010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_MRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_TYP == null) {
			l_MRP_TYP = new ArrayList();
		} else {
			l_MRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_TYP.add(((AD0020010Struct) list.get(i)).getMRP_TYP());
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
			l_OUTSIDE_TYP.add(((AD0020010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_JOB_ODR_STS_TYP.add(((AD0020010Struct) list.get(i)).getJOB_ODR_STS_TYP());
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
			l_JOB_ODR_CD.add(((AD0020010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_CANCEL_NO.add(((AD0020010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_JOB_ODR_TYP.add(((AD0020010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
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
			l_JOB_ODR_TYP_DN.add(((AD0020010Struct) list.get(i)).getJOB_ODR_TYP_DN());
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
			l_ALC_GRP_CD.add(((AD0020010Struct) list.get(i)).getALC_GRP_CD());
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
			l_DRAW_CD.add(((AD0020010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0020010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_DN == null) {
			l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_DN.add(((AD0020010Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_DN == null) {
			l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_DN.add(((AD0020010Struct) list.get(i)).getMRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPOIL == null) {
			l_ITEM_SPOIL = new ArrayList();
		} else {
			l_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPOIL.add(((AD0020010Struct) list.get(i)).getITEM_SPOIL());
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
			l_UNIT_QTY_TYP.add(((AD0020010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_DN == null) {
			l_UNIT_QTY_TYP_DN = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_DN.add(((AD0020010Struct) list.get(i)).getUNIT_QTY_TYP_DN());
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
			l_JOB_ODR_DLV_DATE.add(((AD0020010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
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
			l_DUE_DATE.add(((AD0020010Struct) list.get(i)).getDUE_DATE());
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
			l_PRD_DUE_DATE.add(((AD0020010Struct) list.get(i)).getPRD_DUE_DATE());
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
			l_PRD_START_DATE.add(((AD0020010Struct) list.get(i)).getPRD_START_DATE());
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
			l_ODR_START_DATE.add(((AD0020010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_SUM_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_PUCH_ODR_QTY == null) {
			l_SUM_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_SUM_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_PUCH_ODR_QTY.add(((AD0020010Struct) list.get(i)).getSUM_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OPR_INST_QTY == null) {
			l_SUM_OPR_INST_QTY = new ArrayList();
		} else {
			l_SUM_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OPR_INST_QTY.add(((AD0020010Struct) list.get(i)).getSUM_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((AD0020010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AD0020010Struct) list.get(i)).getDM_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ALCD_QTY == null) {
			l_SUM_ALCD_QTY = new ArrayList();
		} else {
			l_SUM_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ALCD_QTY.add(((AD0020010Struct) list.get(i)).getSUM_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_DN == null) {
			l_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_DN.add(((AD0020010Struct) list.get(i)).getODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_DN == null) {
			l_DM_STS_TYP_DN = new ArrayList();
		} else {
			l_DM_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_DN.add(((AD0020010Struct) list.get(i)).getDM_STS_TYP_DN());
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
			l_STOCK_UNIT.add(((AD0020010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_InitLevel = null;
		m_AD0020010tree1 = null;
		m_id = null;
		m_lvl = null;
		m_parent = null;
		m_label = null;
		m_ctx = null;
		m_maxid = null;
		m_OD_NO = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_OD_TYP = null;
		m_ODR_STS_TYP = null;
		m_DM_STS_TYP = null;
		m_MRP_ODR_TYP = null;
		m_MRP_TYP = null;
		m_OUTSIDE_TYP = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_JOB_ODR_TYP = null;
		m_JOB_ODR_TYP_DN = null;
		m_ALC_GRP_CD = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_OUTSIDE_TYP_DN = null;
		m_MRP_ODR_TYP_DN = null;
		m_ITEM_SPOIL = null;
		m_UNIT_QTY_TYP = null;
		m_UNIT_QTY_TYP_DN = null;
		m_JOB_ODR_DLV_DATE = null;
		m_DUE_DATE = null;
		m_PRD_DUE_DATE = null;
		m_PRD_START_DATE = null;
		m_ODR_START_DATE = null;
		m_SUM_PUCH_ODR_QTY = null;
		m_SUM_OPR_INST_QTY = null;
		m_ODR_QTY = null;
		m_DM_QTY = null;
		m_SUM_ALCD_QTY = null;
		m_ODR_STS_TYP_DN = null;
		m_DM_STS_TYP_DN = null;
		m_STOCK_UNIT = null;

		l_InitLevel = null;
		l_AD0020010tree1 = null;
		l_id = null;
		l_lvl = null;
		l_parent = null;
		l_label = null;
		l_ctx = null;
		l_maxid = null;
		l_OD_NO = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_OD_TYP = null;
		l_ODR_STS_TYP = null;
		l_DM_STS_TYP = null;
		l_MRP_ODR_TYP = null;
		l_MRP_TYP = null;
		l_OUTSIDE_TYP = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_JOB_ODR_TYP = null;
		l_JOB_ODR_TYP_DN = null;
		l_ALC_GRP_CD = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_OUTSIDE_TYP_DN = null;
		l_MRP_ODR_TYP_DN = null;
		l_ITEM_SPOIL = null;
		l_UNIT_QTY_TYP = null;
		l_UNIT_QTY_TYP_DN = null;
		l_JOB_ODR_DLV_DATE = null;
		l_DUE_DATE = null;
		l_PRD_DUE_DATE = null;
		l_PRD_START_DATE = null;
		l_ODR_START_DATE = null;
		l_SUM_PUCH_ODR_QTY = null;
		l_SUM_OPR_INST_QTY = null;
		l_ODR_QTY = null;
		l_DM_QTY = null;
		l_SUM_ALCD_QTY = null;
		l_ODR_STS_TYP_DN = null;
		l_DM_STS_TYP_DN = null;
		l_STOCK_UNIT = null;

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
	 * medAD0020010�N���X�̕W���R���X�g���N�^
	 */
	public AD0020010Struct()
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
	public void setStruct(AD0020010Struct struct)
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
	public void setStructM(AD0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setInitLevel(struct.getInitLevel());
			this.setAD0020010tree1(struct.getAD0020010tree1());
			this.setid(struct.getid());
			this.setlvl(struct.getlvl());
			this.setparent(struct.getparent());
			this.setlabel(struct.getlabel());
			this.setctx(struct.getctx());
			this.setmaxid(struct.getmaxid());
			this.setOD_NO(struct.getOD_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setOD_TYP(struct.getOD_TYP());
			this.setODR_STS_TYP(struct.getODR_STS_TYP());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setJOB_ODR_TYP_DN(struct.getJOB_ODR_TYP_DN());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setUNIT_QTY_TYP_DN(struct.getUNIT_QTY_TYP_DN());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setSUM_PUCH_ODR_QTY(struct.getSUM_PUCH_ODR_QTY());
			this.setSUM_OPR_INST_QTY(struct.getSUM_OPR_INST_QTY());
			this.setODR_QTY(struct.getODR_QTY());
			this.setDM_QTY(struct.getDM_QTY());
			this.setSUM_ALCD_QTY(struct.getSUM_ALCD_QTY());
			this.setODR_STS_TYP_DN(struct.getODR_STS_TYP_DN());
			this.setDM_STS_TYP_DN(struct.getDM_STS_TYP_DN());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_InitLevel(struct.getList_InitLevel());
			this.setList_AD0020010tree1(struct.getList_AD0020010tree1());
			this.setList_id(struct.getList_id());
			this.setList_lvl(struct.getList_lvl());
			this.setList_parent(struct.getList_parent());
			this.setList_label(struct.getList_label());
			this.setList_ctx(struct.getList_ctx());
			this.setList_maxid(struct.getList_maxid());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_ODR_STS_TYP(struct.getList_ODR_STS_TYP());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_JOB_ODR_TYP_DN(struct.getList_JOB_ODR_TYP_DN());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_UNIT_QTY_TYP_DN(struct.getList_UNIT_QTY_TYP_DN());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_SUM_PUCH_ODR_QTY(struct.getList_SUM_PUCH_ODR_QTY());
			this.setList_SUM_OPR_INST_QTY(struct.getList_SUM_OPR_INST_QTY());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_SUM_ALCD_QTY(struct.getList_SUM_ALCD_QTY());
			this.setList_ODR_STS_TYP_DN(struct.getList_ODR_STS_TYP_DN());
			this.setList_DM_STS_TYP_DN(struct.getList_DM_STS_TYP_DN());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
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
	// �� 1 �ϐ������l�F i_InitLevel


	final static String i_InitLevel = null;

	// �� 2 �ϐ������l�F i_AD0020010tree1


	final static String i_AD0020010tree1 = null;

	// �� 3 �ϐ������l�F i_id


	final static String i_id = null;

	// �� 4 �ϐ������l�F i_lvl


	final static String i_lvl = null;

	// �� 5 �ϐ������l�F i_parent


	final static String i_parent = null;

	// �� 6 �ϐ������l�F i_label


	final static String i_label = null;

	// �� 7 �ϐ������l�F i_ctx


	final static String i_ctx = null;

	// �� 8 �ϐ������l�F i_maxid


	final static String i_maxid = null;

	// �� 9 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 10 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 11 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 13 �ϐ������l�F i_OD_TYP


	final static String i_OD_TYP = null;

	// �� 14 �ϐ������l�F i_ODR_STS_TYP


	final static String i_ODR_STS_TYP = null;

	// �� 15 �ϐ������l�F i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// �� 16 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 17 �ϐ������l�F i_MRP_TYP


	final static String i_MRP_TYP = null;

	// �� 18 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 19 �ϐ������l�F i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// �� 20 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 21 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 22 �ϐ������l�F i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// �� 23 �ϐ������l�F i_JOB_ODR_TYP_DN


	final static String i_JOB_ODR_TYP_DN = null;

	// �� 24 �ϐ������l�F i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// �� 25 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 26 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 27 �ϐ������l�F i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// �� 28 �ϐ������l�F i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

	// �� 29 �ϐ������l�F i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// �� 30 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 31 �ϐ������l�F i_UNIT_QTY_TYP_DN


	final static String i_UNIT_QTY_TYP_DN = null;

	// �� 32 �ϐ������l�F i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 33 �ϐ������l�F i_DUE_DATE


	final static String i_DUE_DATE = null;

	// �� 34 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 35 �ϐ������l�F i_PRD_START_DATE


	final static String i_PRD_START_DATE = null;

	// �� 36 �ϐ������l�F i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// �� 37 �ϐ������l�F i_SUM_PUCH_ODR_QTY


	final static String i_SUM_PUCH_ODR_QTY = null;

	// �� 38 �ϐ������l�F i_SUM_OPR_INST_QTY


	final static String i_SUM_OPR_INST_QTY = null;

	// �� 39 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 40 �ϐ������l�F i_DM_QTY


	final static String i_DM_QTY = null;

	// �� 41 �ϐ������l�F i_SUM_ALCD_QTY


	final static String i_SUM_ALCD_QTY = null;

	// �� 42 �ϐ������l�F i_ODR_STS_TYP_DN


	final static String i_ODR_STS_TYP_DN = null;

	// �� 43 �ϐ������l�F i_DM_STS_TYP_DN


	final static String i_DM_STS_TYP_DN = null;

	// �� 44 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_OD_NO
	final static String i_OD_NO = null;
	// �� 2 �ϐ������l�F i_PLANT_CD
	final static String i_PLANT_CD = null;
	// �� 3 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 4 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 5 �ϐ������l�F i_OD_TYP
	final static String i_OD_TYP = null;
	// �� 6 �ϐ������l�F i_ODR_STS_TYP
	final static String i_ODR_STS_TYP = null;
	// �� 7 �ϐ������l�F i_DM_STS_TYP
	final static String i_DM_STS_TYP = null;
	// �� 8 �ϐ������l�F i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;
	// �� 9 �ϐ������l�F i_MRP_TYP
	final static String i_MRP_TYP = null;
	// �� 10 �ϐ������l�F i_OUTSIDE_TYP
	final static String i_OUTSIDE_TYP = null;
	// �� 11 �ϐ������l�F i_JOB_ODR_STS_TYP
	final static String i_JOB_ODR_STS_TYP = null;
	// �� 12 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 13 �ϐ������l�F i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// �� 14 �ϐ������l�F i_JOB_ODR_TYP
	final static String i_JOB_ODR_TYP = null;
	// �� 15 �ϐ������l�F i_JOB_ODR_TYP_DN
	final static String i_JOB_ODR_TYP_DN = null;
	// �� 16 �ϐ������l�F i_ALC_GRP_CD
	final static String i_ALC_GRP_CD = null;
	// �� 17 �ϐ������l�F i_DRAW_CD
	final static String i_DRAW_CD = null;
	// �� 18 �ϐ������l�F i_SPEC
	final static String i_SPEC = null;
	// �� 19 �ϐ������l�F i_OUTSIDE_TYP_DN
	final static String i_OUTSIDE_TYP_DN = null;
	// �� 20 �ϐ������l�F i_MRP_ODR_TYP_DN
	final static String i_MRP_ODR_TYP_DN = null;
	// �� 21 �ϐ������l�F i_ITEM_SPOIL
	final static String i_ITEM_SPOIL = null;
	// �� 22 �ϐ������l�F i_UNIT_QTY_TYP
	final static String i_UNIT_QTY_TYP = null;
	// �� 23 �ϐ������l�F i_UNIT_QTY_TYP_DN
	final static String i_UNIT_QTY_TYP_DN = null;
	// �� 24 �ϐ������l�F i_JOB_ODR_DLV_DATE
	final static String i_JOB_ODR_DLV_DATE = null;
	// �� 25 �ϐ������l�F i_DUE_DATE
	final static String i_DUE_DATE = null;
	// �� 26 �ϐ������l�F i_PRD_DUE_DATE
	final static String i_PRD_DUE_DATE = null;
	// �� 27 �ϐ������l�F i_PRD_START_DATE
	final static String i_PRD_START_DATE = null;
	// �� 28 �ϐ������l�F i_ODR_START_DATE
	final static String i_ODR_START_DATE = null;
	// �� 29 �ϐ������l�F i_SUM_OPR_INST_QTY
	final static String i_SUM_OPR_INST_QTY = null;
	// �� 30 �ϐ������l�F i_ODR_QTY
	final static String i_ODR_QTY = null;
	// �� 31 �ϐ������l�F i_DM_QTY
	final static String i_DM_QTY = null;
	// �� 32 �ϐ������l�F i_SUM_ALCD_QTY
	final static String i_SUM_ALCD_QTY = null;
	// �� 33 �ϐ������l�F i_ODR_STS_TYP_DN
	final static String i_ODR_STS_TYP_DN = null;
	// �� 34 �ϐ������l�F i_DM_STS_TYP_DN
	final static String i_DM_STS_TYP_DN = null;
	// �� 35 �ϐ������l�F i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// �� 36 �ϐ������l�F i_InitLevel
	final static String i_InitLevel = null;
	// �� 37 �ϐ������l�F i_AD0020010tree1
	final static String i_AD0020010tree1 = null;
	// �� 38 �ϐ������l�F i_id
	final static String i_id = null;
	// �� 39 �ϐ������l�F i_lvl
	final static String i_lvl = null;
	// �� 40 �ϐ������l�F i_parent
	final static String i_parent = null;
	// �� 41 �ϐ������l�F i_label
	final static String i_label = null;
	// �� 42 �ϐ������l�F i_ctx
	final static String i_ctx = null;
	// �� 43 �ϐ������l�F i_maxid
	final static String i_maxid = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_OD_NO = i_OD_NO;
		m_PLANT_CD = i_PLANT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_OD_TYP = i_OD_TYP;
		m_ODR_STS_TYP = i_ODR_STS_TYP;
		m_DM_STS_TYP = i_DM_STS_TYP;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_MRP_TYP = i_MRP_TYP;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_JOB_ODR_TYP_DN = i_JOB_ODR_TYP_DN;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
		m_MRP_ODR_TYP_DN = i_MRP_ODR_TYP_DN;
		m_ITEM_SPOIL = i_ITEM_SPOIL;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_UNIT_QTY_TYP_DN = i_UNIT_QTY_TYP_DN;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_DUE_DATE = i_DUE_DATE;
		m_PRD_DUE_DATE = i_PRD_DUE_DATE;
		m_PRD_START_DATE = i_PRD_START_DATE;
		m_ODR_START_DATE = i_ODR_START_DATE;
		m_SUM_OPR_INST_QTY = i_SUM_OPR_INST_QTY;
		m_ODR_QTY = i_ODR_QTY;
		m_DM_QTY = i_DM_QTY;
		m_SUM_ALCD_QTY = i_SUM_ALCD_QTY;
		m_ODR_STS_TYP_DN = i_ODR_STS_TYP_DN;
		m_DM_STS_TYP_DN = i_DM_STS_TYP_DN;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_InitLevel = i_InitLevel;
		m_AD0020010tree1 = i_AD0020010tree1;
		m_id = i_id;
		m_lvl = i_lvl;
		m_parent = i_parent;
		m_label = i_label;
		m_ctx = i_ctx;
		m_maxid = i_maxid;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
