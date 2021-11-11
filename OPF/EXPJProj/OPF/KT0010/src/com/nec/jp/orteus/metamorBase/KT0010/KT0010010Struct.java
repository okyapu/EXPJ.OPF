/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KT0010/src/com/nec/jp/orteus/metamorBase/KT0010/KT0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KT0010;

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

public class KT0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_l_PARTIAL_SHIP_INST_FLG */
	public String m_l_PARTIAL_SHIP_INST_FLG = null;
	/** �� 2 �ϐ��F m_r1_STS_TYP */
	public String m_r1_STS_TYP = null;
	/** �� 3 �ϐ��F m_r2_STS_TYP */
	public String m_r2_STS_TYP = null;
	/** �� 4 �ϐ��F m_KT0010010view1_selected */
	public String m_KT0010010view1_selected = null;
	/** �� 5 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 6 �ϐ��F m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** �� 7 �ϐ��F m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** �� 8 �ϐ��F m_l_ODR_NO */
	public String m_l_ODR_NO = null;
	/** �� 9 �ϐ��F m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** �� 10 �ϐ��F m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** �� 11 �ϐ��F m_l_SHIP_PLAN_REMAIN_QTY */
	public String m_l_SHIP_PLAN_REMAIN_QTY = null;
	/** �� 12 �ϐ��F m_l_DESINATED_SHIP_QTY */
	public String m_l_DESINATED_SHIP_QTY = null;
	/** �� 13 �ϐ��F m_l_DEPO_TYP */
	public String m_l_DEPO_TYP = null;
	/** �� 14 �ϐ��F m_PARTIAL_SHIP_INST_FLG */
	public String m_PARTIAL_SHIP_INST_FLG = null;
	/** �� 15 �ϐ��F m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** �� 16 �ϐ��F m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** �� 17 �ϐ��F m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** �� 18 �ϐ��F m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** �� 19 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 20 �ϐ��F m_l_PKG_UNIT */
	public String m_l_PKG_UNIT = null;
	/** �� 21 �ϐ��F m_l_UNIT_QTY_TYP */
	public String m_l_UNIT_QTY_TYP = null;
	/** �� 22 �ϐ��F m_l_CUST_NAME */
	public String m_l_CUST_NAME = null;
	/** �� 23 �ϐ��F m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** �� 24 �ϐ��F m_l_SHIP_WH_CD */
	public String m_l_SHIP_WH_CD = null;
	/** �� 25 �ϐ��F m_l_SHIP_PLANT_CD */
	public String m_l_SHIP_PLANT_CD = null;
	/** �� 26 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 27 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 28 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 29 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 30 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 31 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 32 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 33 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 34 �ϐ��F m_l_PART_DLV_SEQ_NO */
	public String m_l_PART_DLV_SEQ_NO = null;
	/** �� 35 �ϐ��F m_l_DESINATED_SHIP_DATE */
	public String m_l_DESINATED_SHIP_DATE = null;
	/** �� 36 �ϐ��F m_l_bk_DESINATED_SHIP_QTY */
	public String m_l_bk_DESINATED_SHIP_QTY = null;
	/** �� 37 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 38 �ϐ��F m_CODE */
	public String m_CODE = null;
	/** �� 39 �ϐ��F m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** �� 40 �ϐ��F m_l_TRANSPORT_LT */
	public String m_l_TRANSPORT_LT = null;
	/** �� 41 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 42 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_l_PARTIAL_SHIP_INST_FLG */
	public List l_l_PARTIAL_SHIP_INST_FLG = null;

	/** �� 2 List�ϐ��F l_r1_STS_TYP */
	public List l_r1_STS_TYP = null;

	/** �� 3 List�ϐ��F l_r2_STS_TYP */
	public List l_r2_STS_TYP = null;

	/** �� 4 List�ϐ��F l_KT0010010view1_selected */
	public List l_KT0010010view1_selected = null;

	/** �� 5 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 6 List�ϐ��F l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** �� 7 List�ϐ��F l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** �� 8 List�ϐ��F l_l_ODR_NO */
	public List l_l_ODR_NO = null;

	/** �� 9 List�ϐ��F l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** �� 10 List�ϐ��F l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** �� 11 List�ϐ��F l_l_SHIP_PLAN_REMAIN_QTY */
	public List l_l_SHIP_PLAN_REMAIN_QTY = null;

	/** �� 12 List�ϐ��F l_l_DESINATED_SHIP_QTY */
	public List l_l_DESINATED_SHIP_QTY = null;

	/** �� 13 List�ϐ��F l_l_DEPO_TYP */
	public List l_l_DEPO_TYP = null;

	/** �� 14 List�ϐ��F l_PARTIAL_SHIP_INST_FLG */
	public List l_PARTIAL_SHIP_INST_FLG = null;

	/** �� 15 List�ϐ��F l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** �� 16 List�ϐ��F l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** �� 17 List�ϐ��F l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** �� 18 List�ϐ��F l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** �� 19 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 20 List�ϐ��F l_l_PKG_UNIT */
	public List l_l_PKG_UNIT = null;

	/** �� 21 List�ϐ��F l_l_UNIT_QTY_TYP */
	public List l_l_UNIT_QTY_TYP = null;

	/** �� 22 List�ϐ��F l_l_CUST_NAME */
	public List l_l_CUST_NAME = null;

	/** �� 23 List�ϐ��F l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** �� 24 List�ϐ��F l_l_SHIP_WH_CD */
	public List l_l_SHIP_WH_CD = null;

	/** �� 25 List�ϐ��F l_l_SHIP_PLANT_CD */
	public List l_l_SHIP_PLANT_CD = null;

	/** �� 26 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 27 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 28 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 29 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 30 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 31 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 32 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 33 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 34 List�ϐ��F l_l_PART_DLV_SEQ_NO */
	public List l_l_PART_DLV_SEQ_NO = null;

	/** �� 35 List�ϐ��F l_l_DESINATED_SHIP_DATE */
	public List l_l_DESINATED_SHIP_DATE = null;

	/** �� 36 List�ϐ��F l_l_bk_DESINATED_SHIP_QTY */
	public List l_l_bk_DESINATED_SHIP_QTY = null;

	/** �� 37 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 38 List�ϐ��F l_CODE */
	public List l_CODE = null;

	/** �� 39 List�ϐ��F l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** �� 40 List�ϐ��F l_l_TRANSPORT_LT */
	public List l_l_TRANSPORT_LT = null;

	/** �� 41 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 42 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getl_PARTIAL_SHIP_INST_FLG() { return m_l_PARTIAL_SHIP_INST_FLG; }
	public String getr1_STS_TYP() { return m_r1_STS_TYP; }
	public String getr2_STS_TYP() { return m_r2_STS_TYP; }
	public String getKT0010010view1_selected() { return m_KT0010010view1_selected; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_ODR_NO() { return m_l_ODR_NO; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_SHIP_PLAN_REMAIN_QTY() { return m_l_SHIP_PLAN_REMAIN_QTY; }
	public String getl_DESINATED_SHIP_QTY() { return m_l_DESINATED_SHIP_QTY; }
	public String getl_DEPO_TYP() { return m_l_DEPO_TYP; }
	public String getPARTIAL_SHIP_INST_FLG() { return m_PARTIAL_SHIP_INST_FLG; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PKG_UNIT() { return m_l_PKG_UNIT; }
	public String getl_UNIT_QTY_TYP() { return m_l_UNIT_QTY_TYP; }
	public String getl_CUST_NAME() { return m_l_CUST_NAME; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_SHIP_WH_CD() { return m_l_SHIP_WH_CD; }
	public String getl_SHIP_PLANT_CD() { return m_l_SHIP_PLANT_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getl_PART_DLV_SEQ_NO() { return m_l_PART_DLV_SEQ_NO; }
	public String getl_DESINATED_SHIP_DATE() { return m_l_DESINATED_SHIP_DATE; }
	public String getl_bk_DESINATED_SHIP_QTY() { return m_l_bk_DESINATED_SHIP_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getCODE() { return m_CODE; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public String getl_TRANSPORT_LT() { return m_l_TRANSPORT_LT; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_l_PARTIAL_SHIP_INST_FLG() { return l_l_PARTIAL_SHIP_INST_FLG; }
	public List getList_r1_STS_TYP() { return l_r1_STS_TYP; }
	public List getList_r2_STS_TYP() { return l_r2_STS_TYP; }
	public List getList_KT0010010view1_selected() { return l_KT0010010view1_selected; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_ODR_NO() { return l_l_ODR_NO; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_SHIP_PLAN_REMAIN_QTY() { return l_l_SHIP_PLAN_REMAIN_QTY; }
	public List getList_l_DESINATED_SHIP_QTY() { return l_l_DESINATED_SHIP_QTY; }
	public List getList_l_DEPO_TYP() { return l_l_DEPO_TYP; }
	public List getList_PARTIAL_SHIP_INST_FLG() { return l_PARTIAL_SHIP_INST_FLG; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PKG_UNIT() { return l_l_PKG_UNIT; }
	public List getList_l_UNIT_QTY_TYP() { return l_l_UNIT_QTY_TYP; }
	public List getList_l_CUST_NAME() { return l_l_CUST_NAME; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_SHIP_WH_CD() { return l_l_SHIP_WH_CD; }
	public List getList_l_SHIP_PLANT_CD() { return l_l_SHIP_PLANT_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_l_PART_DLV_SEQ_NO() { return l_l_PART_DLV_SEQ_NO; }
	public List getList_l_DESINATED_SHIP_DATE() { return l_l_DESINATED_SHIP_DATE; }
	public List getList_l_bk_DESINATED_SHIP_QTY() { return l_l_bk_DESINATED_SHIP_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_l_TRANSPORT_LT() { return l_l_TRANSPORT_LT; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setl_PARTIAL_SHIP_INST_FLG(String val) { m_l_PARTIAL_SHIP_INST_FLG = val; }
	public void setr1_STS_TYP(String val) { m_r1_STS_TYP = val; }
	public void setr2_STS_TYP(String val) { m_r2_STS_TYP = val; }
	public void setKT0010010view1_selected(String val) { m_KT0010010view1_selected = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_ODR_NO(String val) { m_l_ODR_NO = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_SHIP_PLAN_REMAIN_QTY(String val) { m_l_SHIP_PLAN_REMAIN_QTY = val; }
	public void setl_DESINATED_SHIP_QTY(String val) { m_l_DESINATED_SHIP_QTY = val; }
	public void setl_DEPO_TYP(String val) { m_l_DEPO_TYP = val; }
	public void setPARTIAL_SHIP_INST_FLG(String val) { m_PARTIAL_SHIP_INST_FLG = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PKG_UNIT(String val) { m_l_PKG_UNIT = val; }
	public void setl_UNIT_QTY_TYP(String val) { m_l_UNIT_QTY_TYP = val; }
	public void setl_CUST_NAME(String val) { m_l_CUST_NAME = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_SHIP_WH_CD(String val) { m_l_SHIP_WH_CD = val; }
	public void setl_SHIP_PLANT_CD(String val) { m_l_SHIP_PLANT_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setl_PART_DLV_SEQ_NO(String val) { m_l_PART_DLV_SEQ_NO = val; }
	public void setl_DESINATED_SHIP_DATE(String val) { m_l_DESINATED_SHIP_DATE = val; }
	public void setl_bk_DESINATED_SHIP_QTY(String val) { m_l_bk_DESINATED_SHIP_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setl_TRANSPORT_LT(String val) { m_l_TRANSPORT_LT = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_l_PARTIAL_SHIP_INST_FLG(List list) { l_l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_r1_STS_TYP(List list) { l_r1_STS_TYP = list; }
	public void setList_r2_STS_TYP(List list) { l_r2_STS_TYP = list; }
	public void setList_KT0010010view1_selected(List list) { l_KT0010010view1_selected = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_ODR_NO(List list) { l_l_ODR_NO = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_SHIP_PLAN_REMAIN_QTY(List list) { l_l_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_l_DESINATED_SHIP_QTY(List list) { l_l_DESINATED_SHIP_QTY = list; }
	public void setList_l_DEPO_TYP(List list) { l_l_DEPO_TYP = list; }
	public void setList_PARTIAL_SHIP_INST_FLG(List list) { l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PKG_UNIT(List list) { l_l_PKG_UNIT = list; }
	public void setList_l_UNIT_QTY_TYP(List list) { l_l_UNIT_QTY_TYP = list; }
	public void setList_l_CUST_NAME(List list) { l_l_CUST_NAME = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_SHIP_WH_CD(List list) { l_l_SHIP_WH_CD = list; }
	public void setList_l_SHIP_PLANT_CD(List list) { l_l_SHIP_PLANT_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_l_PART_DLV_SEQ_NO(List list) { l_l_PART_DLV_SEQ_NO = list; }
	public void setList_l_DESINATED_SHIP_DATE(List list) { l_l_DESINATED_SHIP_DATE = list; }
	public void setList_l_bk_DESINATED_SHIP_QTY(List list) { l_l_bk_DESINATED_SHIP_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_l_TRANSPORT_LT(List list) { l_l_TRANSPORT_LT = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_l_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PARTIAL_SHIP_INST_FLG == null) {
			l_l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PARTIAL_SHIP_INST_FLG.add(((KT0010010Struct) list.get(i)).getl_PARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_r1_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_STS_TYP == null) {
			l_r1_STS_TYP = new ArrayList();
		} else {
			l_r1_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_STS_TYP.add(((KT0010010Struct) list.get(i)).getr1_STS_TYP());
		}
		return size;
	}
	public int setL2L_r2_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_STS_TYP == null) {
			l_r2_STS_TYP = new ArrayList();
		} else {
			l_r2_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_STS_TYP.add(((KT0010010Struct) list.get(i)).getr2_STS_TYP());
		}
		return size;
	}
	public int setL2L_KT0010010view1_selected(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_KT0010010view1_selected == null) {
			l_KT0010010view1_selected = new ArrayList();
		} else {
			l_KT0010010view1_selected.clear();
		}
		for (int i = 0; i < size; i++) {
			l_KT0010010view1_selected.add(((KT0010010Struct) list.get(i)).getKT0010010view1_selected());
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
			l_l_ITEM_CD.add(((KT0010010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ODR_NO == null) {
			l_l_CUST_ODR_NO = new ArrayList();
		} else {
			l_l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ODR_NO.add(((KT0010010Struct) list.get(i)).getl_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_DLV_DATE == null) {
			l_l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_DLV_DATE.add(((KT0010010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_NO == null) {
			l_l_ODR_NO = new ArrayList();
		} else {
			l_l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_NO.add(((KT0010010Struct) list.get(i)).getl_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_CD == null) {
			l_l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_CD.add(((KT0010010Struct) list.get(i)).getl_CUST_ITEM_CD());
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
			l_l_ODR_QTY.add(((KT0010010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_PLAN_REMAIN_QTY == null) {
			l_l_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_l_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_PLAN_REMAIN_QTY.add(((KT0010010Struct) list.get(i)).getl_SHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_QTY == null) {
			l_l_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_QTY.add(((KT0010010Struct) list.get(i)).getl_DESINATED_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_l_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_TYP == null) {
			l_l_DEPO_TYP = new ArrayList();
		} else {
			l_l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_TYP.add(((KT0010010Struct) list.get(i)).getl_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_SHIP_INST_FLG == null) {
			l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_SHIP_INST_FLG.add(((KT0010010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG());
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
			l_l_CUST_CD.add(((KT0010010Struct) list.get(i)).getl_CUST_CD());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_CD == null) {
			l_l_DLV_LOC_CD = new ArrayList();
		} else {
			l_l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_CD.add(((KT0010010Struct) list.get(i)).getl_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((KT0010010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_l_REMARKS.add(((KT0010010Struct) list.get(i)).getl_REMARKS());
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
			l_l_ITEM_NAME.add(((KT0010010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PKG_UNIT == null) {
			l_l_PKG_UNIT = new ArrayList();
		} else {
			l_l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PKG_UNIT.add(((KT0010010Struct) list.get(i)).getl_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_l_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_QTY_TYP == null) {
			l_l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_QTY_TYP.add(((KT0010010Struct) list.get(i)).getl_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_l_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_NAME == null) {
			l_l_CUST_NAME = new ArrayList();
		} else {
			l_l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_NAME.add(((KT0010010Struct) list.get(i)).getl_CUST_NAME());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_NAME == null) {
			l_l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_NAME.add(((KT0010010Struct) list.get(i)).getl_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_WH_CD == null) {
			l_l_SHIP_WH_CD = new ArrayList();
		} else {
			l_l_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_WH_CD.add(((KT0010010Struct) list.get(i)).getl_SHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_l_SHIP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_PLANT_CD == null) {
			l_l_SHIP_PLANT_CD = new ArrayList();
		} else {
			l_l_SHIP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_PLANT_CD.add(((KT0010010Struct) list.get(i)).getl_SHIP_PLANT_CD());
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
			l_l_JOB_ODR_CD.add(((KT0010010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_NO == null) {
			l_ODR_NO = new ArrayList();
		} else {
			l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_NO.add(((KT0010010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ODR_NO == null) {
			l_CUST_ODR_NO = new ArrayList();
		} else {
			l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ODR_NO.add(((KT0010010Struct) list.get(i)).getCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_DLV_DATE == null) {
			l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_DLV_DATE.add(((KT0010010Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CD == null) {
			l_CUST_CD = new ArrayList();
		} else {
			l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CD.add(((KT0010010Struct) list.get(i)).getCUST_CD());
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
			l_ITEM_CD.add(((KT0010010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_PSN_CD == null) {
			l_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_PSN_CD.add(((KT0010010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_COMPANY_CD.add(((KT0010010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_l_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PART_DLV_SEQ_NO == null) {
			l_l_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_l_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PART_DLV_SEQ_NO.add(((KT0010010Struct) list.get(i)).getl_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_DATE == null) {
			l_l_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_DATE.add(((KT0010010Struct) list.get(i)).getl_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_bk_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_bk_DESINATED_SHIP_QTY == null) {
			l_l_bk_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_l_bk_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_bk_DESINATED_SHIP_QTY.add(((KT0010010Struct) list.get(i)).getl_bk_DESINATED_SHIP_QTY());
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
			l_BUSINESS_OPR_DATE.add(((KT0010010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CODE == null) {
			l_CODE = new ArrayList();
		} else {
			l_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CODE.add(((KT0010010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CODE == null) {
			l_CLASS_CODE = new ArrayList();
		} else {
			l_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CODE.add(((KT0010010Struct) list.get(i)).getCLASS_CODE());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_LT == null) {
			l_l_TRANSPORT_LT = new ArrayList();
		} else {
			l_l_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_LT.add(((KT0010010Struct) list.get(i)).getl_TRANSPORT_LT());
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
			l_l_COUNT.add(((KT0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KT0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_PARTIAL_SHIP_INST_FLG = null;
		m_r1_STS_TYP = null;
		m_r2_STS_TYP = null;
		m_KT0010010view1_selected = null;
		m_l_ITEM_CD = null;
		m_l_CUST_ODR_NO = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_ODR_NO = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ODR_QTY = null;
		m_l_SHIP_PLAN_REMAIN_QTY = null;
		m_l_DESINATED_SHIP_QTY = null;
		m_l_DEPO_TYP = null;
		m_PARTIAL_SHIP_INST_FLG = null;
		m_l_CUST_CD = null;
		m_l_DLV_LOC_CD = null;
		m_l_MODIFY_COUNT = null;
		m_l_REMARKS = null;
		m_l_ITEM_NAME = null;
		m_l_PKG_UNIT = null;
		m_l_UNIT_QTY_TYP = null;
		m_l_CUST_NAME = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_SHIP_WH_CD = null;
		m_l_SHIP_PLANT_CD = null;
		m_l_JOB_ODR_CD = null;
		m_ODR_NO = null;
		m_CUST_ODR_NO = null;
		m_DESINATED_DLV_DATE = null;
		m_CUST_CD = null;
		m_ITEM_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_COMPANY_CD = null;
		m_l_PART_DLV_SEQ_NO = null;
		m_l_DESINATED_SHIP_DATE = null;
		m_l_bk_DESINATED_SHIP_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_CODE = null;
		m_CLASS_CODE = null;
		m_l_TRANSPORT_LT = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_l_PARTIAL_SHIP_INST_FLG = null;
		l_r1_STS_TYP = null;
		l_r2_STS_TYP = null;
		l_KT0010010view1_selected = null;
		l_l_ITEM_CD = null;
		l_l_CUST_ODR_NO = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_ODR_NO = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ODR_QTY = null;
		l_l_SHIP_PLAN_REMAIN_QTY = null;
		l_l_DESINATED_SHIP_QTY = null;
		l_l_DEPO_TYP = null;
		l_PARTIAL_SHIP_INST_FLG = null;
		l_l_CUST_CD = null;
		l_l_DLV_LOC_CD = null;
		l_l_MODIFY_COUNT = null;
		l_l_REMARKS = null;
		l_l_ITEM_NAME = null;
		l_l_PKG_UNIT = null;
		l_l_UNIT_QTY_TYP = null;
		l_l_CUST_NAME = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_SHIP_WH_CD = null;
		l_l_SHIP_PLANT_CD = null;
		l_l_JOB_ODR_CD = null;
		l_ODR_NO = null;
		l_CUST_ODR_NO = null;
		l_DESINATED_DLV_DATE = null;
		l_CUST_CD = null;
		l_ITEM_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_COMPANY_CD = null;
		l_l_PART_DLV_SEQ_NO = null;
		l_l_DESINATED_SHIP_DATE = null;
		l_l_bk_DESINATED_SHIP_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_CODE = null;
		l_CLASS_CODE = null;
		l_l_TRANSPORT_LT = null;
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
	 * medKT0010010�N���X�̕W���R���X�g���N�^
	 */
	public KT0010010Struct()
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
	public void setStruct(KT0010010Struct struct)
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
	public void setStructM(KT0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_PARTIAL_SHIP_INST_FLG(struct.getl_PARTIAL_SHIP_INST_FLG());
			this.setr1_STS_TYP(struct.getr1_STS_TYP());
			this.setr2_STS_TYP(struct.getr2_STS_TYP());
			this.setKT0010010view1_selected(struct.getKT0010010view1_selected());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_ODR_NO(struct.getl_ODR_NO());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_SHIP_PLAN_REMAIN_QTY(struct.getl_SHIP_PLAN_REMAIN_QTY());
			this.setl_DESINATED_SHIP_QTY(struct.getl_DESINATED_SHIP_QTY());
			this.setl_DEPO_TYP(struct.getl_DEPO_TYP());
			this.setPARTIAL_SHIP_INST_FLG(struct.getPARTIAL_SHIP_INST_FLG());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PKG_UNIT(struct.getl_PKG_UNIT());
			this.setl_UNIT_QTY_TYP(struct.getl_UNIT_QTY_TYP());
			this.setl_CUST_NAME(struct.getl_CUST_NAME());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_SHIP_WH_CD(struct.getl_SHIP_WH_CD());
			this.setl_SHIP_PLANT_CD(struct.getl_SHIP_PLANT_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setl_PART_DLV_SEQ_NO(struct.getl_PART_DLV_SEQ_NO());
			this.setl_DESINATED_SHIP_DATE(struct.getl_DESINATED_SHIP_DATE());
			this.setl_bk_DESINATED_SHIP_QTY(struct.getl_bk_DESINATED_SHIP_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setCODE(struct.getCODE());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setl_TRANSPORT_LT(struct.getl_TRANSPORT_LT());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KT0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_PARTIAL_SHIP_INST_FLG(struct.getList_l_PARTIAL_SHIP_INST_FLG());
			this.setList_r1_STS_TYP(struct.getList_r1_STS_TYP());
			this.setList_r2_STS_TYP(struct.getList_r2_STS_TYP());
			this.setList_KT0010010view1_selected(struct.getList_KT0010010view1_selected());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_ODR_NO(struct.getList_l_ODR_NO());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_SHIP_PLAN_REMAIN_QTY(struct.getList_l_SHIP_PLAN_REMAIN_QTY());
			this.setList_l_DESINATED_SHIP_QTY(struct.getList_l_DESINATED_SHIP_QTY());
			this.setList_l_DEPO_TYP(struct.getList_l_DEPO_TYP());
			this.setList_PARTIAL_SHIP_INST_FLG(struct.getList_PARTIAL_SHIP_INST_FLG());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PKG_UNIT(struct.getList_l_PKG_UNIT());
			this.setList_l_UNIT_QTY_TYP(struct.getList_l_UNIT_QTY_TYP());
			this.setList_l_CUST_NAME(struct.getList_l_CUST_NAME());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_SHIP_WH_CD(struct.getList_l_SHIP_WH_CD());
			this.setList_l_SHIP_PLANT_CD(struct.getList_l_SHIP_PLANT_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_l_PART_DLV_SEQ_NO(struct.getList_l_PART_DLV_SEQ_NO());
			this.setList_l_DESINATED_SHIP_DATE(struct.getList_l_DESINATED_SHIP_DATE());
			this.setList_l_bk_DESINATED_SHIP_QTY(struct.getList_l_bk_DESINATED_SHIP_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_l_TRANSPORT_LT(struct.getList_l_TRANSPORT_LT());
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
	// �� 1 �ϐ������l�F i_l_PARTIAL_SHIP_INST_FLG


	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// �� 2 �ϐ������l�F i_r1_STS_TYP


	final static String i_r1_STS_TYP = null;

	// �� 3 �ϐ������l�F i_r2_STS_TYP


	final static String i_r2_STS_TYP = null;

	// �� 4 �ϐ������l�F i_KT0010010view1_selected


	final static String i_KT0010010view1_selected = null;

	// �� 5 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// �� 7 �ϐ������l�F i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// �� 8 �ϐ������l�F i_l_ODR_NO


	final static String i_l_ODR_NO = null;

	// �� 9 �ϐ������l�F i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// �� 10 �ϐ������l�F i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// �� 11 �ϐ������l�F i_l_SHIP_PLAN_REMAIN_QTY


	final static String i_l_SHIP_PLAN_REMAIN_QTY = null;

	// �� 12 �ϐ������l�F i_l_DESINATED_SHIP_QTY


	final static String i_l_DESINATED_SHIP_QTY = null;

	// �� 13 �ϐ������l�F i_l_DEPO_TYP


	final static String i_l_DEPO_TYP = null;

	// �� 14 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG


	final static String i_PARTIAL_SHIP_INST_FLG = null;

	// �� 15 �ϐ������l�F i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// �� 16 �ϐ������l�F i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// �� 17 �ϐ������l�F i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// �� 18 �ϐ������l�F i_l_REMARKS


	final static String i_l_REMARKS = null;

	// �� 19 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 20 �ϐ������l�F i_l_PKG_UNIT


	final static String i_l_PKG_UNIT = null;

	// �� 21 �ϐ������l�F i_l_UNIT_QTY_TYP


	final static String i_l_UNIT_QTY_TYP = null;

	// �� 22 �ϐ������l�F i_l_CUST_NAME


	final static String i_l_CUST_NAME = null;

	// �� 23 �ϐ������l�F i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// �� 24 �ϐ������l�F i_l_SHIP_WH_CD


	final static String i_l_SHIP_WH_CD = null;

	// �� 25 �ϐ������l�F i_l_SHIP_PLANT_CD


	final static String i_l_SHIP_PLANT_CD = null;

	// �� 26 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 27 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 28 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 29 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 30 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 31 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 32 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 33 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 34 �ϐ������l�F i_l_PART_DLV_SEQ_NO


	final static String i_l_PART_DLV_SEQ_NO = null;

	// �� 35 �ϐ������l�F i_l_DESINATED_SHIP_DATE


	final static String i_l_DESINATED_SHIP_DATE = null;

	// �� 36 �ϐ������l�F i_l_bk_DESINATED_SHIP_QTY


	final static String i_l_bk_DESINATED_SHIP_QTY = null;

	// �� 37 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 38 �ϐ������l�F i_CODE


	final static String i_CODE = null;

	// �� 39 �ϐ������l�F i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// �� 40 �ϐ������l�F i_l_TRANSPORT_LT


	final static String i_l_TRANSPORT_LT = null;

	// �� 41 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 42 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // �� 2 �ϐ������l�F i_l_DESINATED_DLV_DATE
        final static String i_l_DESINATED_DLV_DATE = null;
        // �� 3 �ϐ������l�F i_l_ODR_NO
        final static String i_l_ODR_NO = null;
        // �� 4 �ϐ������l�F i_l_CUST_ITEM_CD
        final static String i_l_CUST_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_l_ODR_QTY
        final static String i_l_ODR_QTY = null;
        // �� 6 �ϐ������l�F i_l_SHIP_PLAN_REMAIN_QTY
        final static String i_l_SHIP_PLAN_REMAIN_QTY = null;
        // �� 7 �ϐ������l�F i_l_DESINATED_SHIP_QTY
        final static String i_l_DESINATED_SHIP_QTY = null;
        // �� 8 �ϐ������l�F i_l_DEPO_TYP
        final static String i_l_DEPO_TYP = null;
        // �� 9 �ϐ������l�F i_l_PARTIAL_SHIP_INST_FLG
        final static String i_l_PARTIAL_SHIP_INST_FLG = null;
        // �� 10 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG
        final static String i_PARTIAL_SHIP_INST_FLG = null;
        // �� 11 �ϐ������l�F i_l_CUST_CD
        final static String i_l_CUST_CD = null;
        // �� 12 �ϐ������l�F i_l_DLV_LOC_CD
        final static String i_l_DLV_LOC_CD = null;
        // �� 13 �ϐ������l�F i_ODR_NO
        final static String i_ODR_NO = null;
        // �� 14 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 15 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 16 �ϐ������l�F i_CUST_CHRG_PSN_CD
        final static String i_CUST_CHRG_PSN_CD = null;
        // �� 17 �ϐ������l�F i_l_PART_DLV_SEQ_NO
        final static String i_l_PART_DLV_SEQ_NO = null;
        // �� 18 �ϐ������l�F i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // �� 19 �ϐ������l�F i_l_DESINATED_SHIP_DATE
        final static String i_l_DESINATED_SHIP_DATE = null;
        // �� 20 �ϐ������l�F i_l_bk_DESINATED_SHIP_QTY
        final static String i_l_bk_DESINATED_SHIP_QTY = null;
        // �� 21 �ϐ������l�F i_BUSINESS_OPR_DATE
        final static String i_BUSINESS_OPR_DATE = null;
        // �� 22 �ϐ������l�F i_CODE
        final static String i_CODE = null;
        // �� 23 �ϐ������l�F i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // �� 24 �ϐ������l�F i_CLASS_CODE
        final static String i_CLASS_CODE = null;
        // �� 25 �ϐ������l�F i_l_TRANSPORT_LT
        final static String i_l_TRANSPORT_LT = null;
        // �� 26 �ϐ������l�F i_r1_STS_TYP
        final static String i_r1_STS_TYP = null;
        // �� 27 �ϐ������l�F i_r2_STS_TYP
        final static String i_r2_STS_TYP = null;
        // �� 28 �ϐ������l�F i_KT0010010view1_selected
        final static String i_KT0010010view1_selected = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_ITEM_CD = i_l_ITEM_CD;
         m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
         m_l_ODR_NO = i_l_ODR_NO;
         m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
         m_l_ODR_QTY = i_l_ODR_QTY;
         m_l_SHIP_PLAN_REMAIN_QTY = i_l_SHIP_PLAN_REMAIN_QTY;
         m_l_DESINATED_SHIP_QTY = i_l_DESINATED_SHIP_QTY;
         m_l_DEPO_TYP = i_l_DEPO_TYP;
         m_l_PARTIAL_SHIP_INST_FLG = i_l_PARTIAL_SHIP_INST_FLG;
         m_PARTIAL_SHIP_INST_FLG = i_PARTIAL_SHIP_INST_FLG;
         m_l_CUST_CD = i_l_CUST_CD;
         m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
         m_ODR_NO = i_ODR_NO;
         m_CUST_CD = i_CUST_CD;
         m_ITEM_CD = i_ITEM_CD;
         m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
         m_l_PART_DLV_SEQ_NO = i_l_PART_DLV_SEQ_NO;
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_l_DESINATED_SHIP_DATE = i_l_DESINATED_SHIP_DATE;
         m_l_bk_DESINATED_SHIP_QTY = i_l_bk_DESINATED_SHIP_QTY;
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_CODE = i_CODE;
         m_COMPANY_CD = i_COMPANY_CD;
         m_CLASS_CODE = i_CLASS_CODE;
         m_l_TRANSPORT_LT = i_l_TRANSPORT_LT;
         m_r1_STS_TYP = i_r1_STS_TYP;
         m_r2_STS_TYP = i_r2_STS_TYP;
         m_KT0010010view1_selected = i_KT0010010view1_selected;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
