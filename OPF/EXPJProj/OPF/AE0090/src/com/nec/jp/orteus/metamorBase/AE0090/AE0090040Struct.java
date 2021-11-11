/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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
 * CLASS     : AE0090040Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: koizumi $
 * @version $Revision: 1.6 $ $Date: 2012/09/27 09:43:40 $
 *
 */
//}}user_implement_code_header

public class AE0090040Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DEVELOP_TYP */
	public String m_DEVELOP_TYP = null;
	/** �� 2 �ϐ��F m_DEVELOP_TYP_name */
	public String m_DEVELOP_TYP_name = null;
	/** �� 3 �ϐ��F m_DEVELOP_TYP_val */
	public String m_DEVELOP_TYP_val = null;
	/** �� 4 �ϐ��F m_InitLevel */
	public String m_InitLevel = null;
	/** �� 5 �ϐ��F m_h_MaxLevel */
	public String m_h_MaxLevel = null;
	/** �� 6 �ϐ��F m_AE0090040tree1 */
	public String m_AE0090040tree1 = null;
	/** �� 7 �ϐ��F m_id */
	public String m_id = null;
	/** �� 8 �ϐ��F m_lvl */
	public String m_lvl = null;
	/** �� 9 �ϐ��F m_parent */
	public String m_parent = null;
	/** �� 10 �ϐ��F m_label */
	public String m_label = null;
	/** �� 11 �ϐ��F m_ctx */
	public String m_ctx = null;
	/** �� 12 �ϐ��F m_maxid */
	public String m_maxid = null;
	/** �� 13 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 14 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 15 �ϐ��F m_NEED_QTY_1 */
	public String m_NEED_QTY_1 = null;
	/** �� 16 �ϐ��F m_Det_Comp_Need_QTY */
	public String m_Det_Comp_Need_QTY = null;
	/** �� 17 �ϐ��F m_Upper_ITEM_NAME */
	public String m_Upper_ITEM_NAME = null;
	/** �� 18 �ϐ��F m_Det_Comp_ONHAND_QTY */
	public String m_Det_Comp_ONHAND_QTY = null;
	/** �� 19 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 20 �ϐ��F m_NO */
	public String m_NO = null;
	/** �� 21 �ϐ��F m_NEED_QTY */
	public String m_NEED_QTY = null;
	/** �� 22 �ϐ��F m_UNIT_QTY */
	public String m_UNIT_QTY = null;
	/** �� 23 �ϐ��F m_IN_UNIT_1 */
	public String m_IN_UNIT_1 = null;
	/** �� 24 �ϐ��F m_IN_UNIT_2 */
	public String m_IN_UNIT_2 = null;
	/** �� 25 �ϐ��F m_h_DEVELOP_TYP */
	public String m_h_DEVELOP_TYP = null;
	/** �� 26 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 27 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 28 �ϐ��F m_RECEIPT_SCHEDULES_NUMBER1 */
	public String m_RECEIPT_SCHEDULES_NUMBER1 = null;
	/** �� 29 �ϐ��F m_Lower_ITEM_CD */
	public String m_Lower_ITEM_CD = null;
	/** �� 30 �ϐ��F m_TERM2STARTDATE */
	public String m_TERM2STARTDATE = null;
	/** �� 31 �ϐ��F m_RECEIPT_SCHEDULES_NUMBER2 */
	public String m_RECEIPT_SCHEDULES_NUMBER2 = null;
	/** �� 32 �ϐ��F m_RECEIPT_SCHEDULES_TERM */
	public String m_RECEIPT_SCHEDULES_TERM = null;
	/** �� 33 �ϐ��F m_RECEIPT_SCHEDULES_NUMBER */
	public String m_RECEIPT_SCHEDULES_NUMBER = null;
	/** �� 34 �ϐ��F m_Lower_ITEM_NAME */
	public String m_Lower_ITEM_NAME = null;
	/** �� 35 �ϐ��F m_Det_Parent_ITEM_CD */
	public String m_Det_Parent_ITEM_CD = null;
	/** �� 36 �ϐ��F m_Det_Parent_ITEM_NAME */
	public String m_Det_Parent_ITEM_NAME = null;
	/** �� 37 �ϐ��F m_Det_Comp_ITEM_CD */
	public String m_Det_Comp_ITEM_CD = null;
	/** �� 38 �ϐ��F m_Det_Comp_ITEM_NAME */
	public String m_Det_Comp_ITEM_NAME = null;
	/** �� 39 �ϐ��F m_Det_Comp_STOCK_UNIT */
	public String m_Det_Comp_STOCK_UNIT = null;
	/** �� 40 �ϐ��F m_Det_Comp_PRODUCT_TYP */
	public String m_Det_Comp_PRODUCT_TYP = null;
	/** �� 41 �ϐ��F m_Det_Comp_MRP_ODR_TYP */
	public String m_Det_Comp_MRP_ODR_TYP = null;
	/** �� 42 �ϐ��F m_Det_Comp_OUTSIDE_TYP */
	public String m_Det_Comp_OUTSIDE_TYP = null;
	/** �� 43 �ϐ��F m_Det_Comp_PS_UNIT_QTY */
	public String m_Det_Comp_PS_UNIT_QTY = null;
	/** �� 44 �ϐ��F m_Det_Comp_ITEM_SPOIL */
	public String m_Det_Comp_ITEM_SPOIL = null;
	/** �� 45 �ϐ��F m_Det_Comp_EFF_PHASE_IN_DATE */
	public String m_Det_Comp_EFF_PHASE_IN_DATE = null;
	/** �� 46 �ϐ��F m_Det_Comp_EFF_PHASE_OUT_DATE */
	public String m_Det_Comp_EFF_PHASE_OUT_DATE = null;
	/** �� 47 �ϐ��F m_Det_Comp_PS_SPOIL */
	public String m_Det_Comp_PS_SPOIL = null;
	/** �� 48 �ϐ��F m_Det_Comp_CONS_TYP */
	public String m_Det_Comp_CONS_TYP = null;
	/** �� 49 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 50 �ϐ��F m_ONHAND_STOCK */
	public String m_ONHAND_STOCK = null;
	/** �� 51 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 52 �ϐ��F m_Lower_NEED_QTY */
	public String m_Lower_NEED_QTY = null;
	/** �� 53 �ϐ��F m_Upper_NEED_QTY */
	public String m_Upper_NEED_QTY = null;
	/** �� 54 �ϐ��F m_Upper_ITEM_CD */
	public String m_Upper_ITEM_CD = null;
	/** �� 55 �ϐ��F m_Target_ITEM_CD */
	public String m_Target_ITEM_CD = null;
	/** �� 56 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 57 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 58 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 59 �ϐ��F m_NUMERATOR */
	public String m_NUMERATOR = null;
	/** �� 60 �ϐ��F m_DENOMINATOR */
	public String m_DENOMINATOR = null;
	/** �� 61 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 62 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 63 �ϐ��F m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** �� 64 �ϐ��F m_TargetDate */
	public String m_TargetDate = null;
	/** �� 65 �ϐ��F m_COMP_ITEM_NAME */
	public String m_COMP_ITEM_NAME = null;
	/** �� 66 �ϐ��F m_ITEM_CD_VIEW */
	public String m_ITEM_CD_VIEW = null;
	/** �� 67 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DEVELOP_TYP */
	public List l_DEVELOP_TYP = null;

	/** �� 2 List�ϐ��F l_DEVELOP_TYP_name */
	public List l_DEVELOP_TYP_name = null;

	/** �� 3 List�ϐ��F l_DEVELOP_TYP_val */
	public List l_DEVELOP_TYP_val = null;

	/** �� 4 List�ϐ��F l_InitLevel */
	public List l_InitLevel = null;

	/** �� 5 List�ϐ��F l_h_MaxLevel */
	public List l_h_MaxLevel = null;

	/** �� 6 List�ϐ��F l_AE0090040tree1 */
	public List l_AE0090040tree1 = null;

	/** �� 7 List�ϐ��F l_id */
	public List l_id = null;

	/** �� 8 List�ϐ��F l_lvl */
	public List l_lvl = null;

	/** �� 9 List�ϐ��F l_parent */
	public List l_parent = null;

	/** �� 10 List�ϐ��F l_label */
	public List l_label = null;

	/** �� 11 List�ϐ��F l_ctx */
	public List l_ctx = null;

	/** �� 12 List�ϐ��F l_maxid */
	public List l_maxid = null;

	/** �� 13 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 14 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 15 List�ϐ��F l_NEED_QTY_1 */
	public List l_NEED_QTY_1 = null;

	/** �� 16 List�ϐ��F l_Det_Comp_Need_QTY */
	public List l_Det_Comp_Need_QTY = null;

	/** �� 17 List�ϐ��F l_Upper_ITEM_NAME */
	public List l_Upper_ITEM_NAME = null;

	/** �� 18 List�ϐ��F l_Det_Comp_ONHAND_QTY */
	public List l_Det_Comp_ONHAND_QTY = null;

	/** �� 19 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 20 List�ϐ��F l_NO */
	public List l_NO = null;

	/** �� 21 List�ϐ��F l_NEED_QTY */
	public List l_NEED_QTY = null;

	/** �� 22 List�ϐ��F l_UNIT_QTY */
	public List l_UNIT_QTY = null;

	/** �� 23 List�ϐ��F l_IN_UNIT_1 */
	public List l_IN_UNIT_1 = null;

	/** �� 24 List�ϐ��F l_IN_UNIT_2 */
	public List l_IN_UNIT_2 = null;

	/** �� 25 List�ϐ��F l_h_DEVELOP_TYP */
	public List l_h_DEVELOP_TYP = null;

	/** �� 26 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 27 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 28 List�ϐ��F l_RECEIPT_SCHEDULES_NUMBER1 */
	public List l_RECEIPT_SCHEDULES_NUMBER1 = null;

	/** �� 29 List�ϐ��F l_Lower_ITEM_CD */
	public List l_Lower_ITEM_CD = null;

	/** �� 30 List�ϐ��F l_TERM2STARTDATE */
	public List l_TERM2STARTDATE = null;

	/** �� 31 List�ϐ��F l_RECEIPT_SCHEDULES_NUMBER2 */
	public List l_RECEIPT_SCHEDULES_NUMBER2 = null;

	/** �� 32 List�ϐ��F l_RECEIPT_SCHEDULES_TERM */
	public List l_RECEIPT_SCHEDULES_TERM = null;

	/** �� 33 List�ϐ��F l_RECEIPT_SCHEDULES_NUMBER */
	public List l_RECEIPT_SCHEDULES_NUMBER = null;

	/** �� 34 List�ϐ��F l_Lower_ITEM_NAME */
	public List l_Lower_ITEM_NAME = null;

	/** �� 35 List�ϐ��F l_Det_Parent_ITEM_CD */
	public List l_Det_Parent_ITEM_CD = null;

	/** �� 36 List�ϐ��F l_Det_Parent_ITEM_NAME */
	public List l_Det_Parent_ITEM_NAME = null;

	/** �� 37 List�ϐ��F l_Det_Comp_ITEM_CD */
	public List l_Det_Comp_ITEM_CD = null;

	/** �� 38 List�ϐ��F l_Det_Comp_ITEM_NAME */
	public List l_Det_Comp_ITEM_NAME = null;

	/** �� 39 List�ϐ��F l_Det_Comp_STOCK_UNIT */
	public List l_Det_Comp_STOCK_UNIT = null;

	/** �� 40 List�ϐ��F l_Det_Comp_PRODUCT_TYP */
	public List l_Det_Comp_PRODUCT_TYP = null;

	/** �� 41 List�ϐ��F l_Det_Comp_MRP_ODR_TYP */
	public List l_Det_Comp_MRP_ODR_TYP = null;

	/** �� 42 List�ϐ��F l_Det_Comp_OUTSIDE_TYP */
	public List l_Det_Comp_OUTSIDE_TYP = null;

	/** �� 43 List�ϐ��F l_Det_Comp_PS_UNIT_QTY */
	public List l_Det_Comp_PS_UNIT_QTY = null;

	/** �� 44 List�ϐ��F l_Det_Comp_ITEM_SPOIL */
	public List l_Det_Comp_ITEM_SPOIL = null;

	/** �� 45 List�ϐ��F l_Det_Comp_EFF_PHASE_IN_DATE */
	public List l_Det_Comp_EFF_PHASE_IN_DATE = null;

	/** �� 46 List�ϐ��F l_Det_Comp_EFF_PHASE_OUT_DATE */
	public List l_Det_Comp_EFF_PHASE_OUT_DATE = null;

	/** �� 47 List�ϐ��F l_Det_Comp_PS_SPOIL */
	public List l_Det_Comp_PS_SPOIL = null;

	/** �� 48 List�ϐ��F l_Det_Comp_CONS_TYP */
	public List l_Det_Comp_CONS_TYP = null;

	/** �� 49 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 50 List�ϐ��F l_ONHAND_STOCK */
	public List l_ONHAND_STOCK = null;

	/** �� 51 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 52 List�ϐ��F l_Lower_NEED_QTY */
	public List l_Lower_NEED_QTY = null;

	/** �� 53 List�ϐ��F l_Upper_NEED_QTY */
	public List l_Upper_NEED_QTY = null;

	/** �� 54 List�ϐ��F l_Upper_ITEM_CD */
	public List l_Upper_ITEM_CD = null;

	/** �� 55 List�ϐ��F l_Target_ITEM_CD */
	public List l_Target_ITEM_CD = null;

	/** �� 56 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 57 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 58 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 59 List�ϐ��F l_NUMERATOR */
	public List l_NUMERATOR = null;

	/** �� 60 List�ϐ��F l_DENOMINATOR */
	public List l_DENOMINATOR = null;

	/** �� 61 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 62 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 63 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 64 List�ϐ��F l_TargetDate */
	public List l_TargetDate = null;

	/** �� 65 List�ϐ��F l_COMP_ITEM_NAME */
	public List l_COMP_ITEM_NAME = null;

	/** �� 66 List�ϐ��F l_ITEM_CD_VIEW */
	public List l_ITEM_CD_VIEW = null;

	/** �� 67 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDEVELOP_TYP() { return m_DEVELOP_TYP; }
	public String getDEVELOP_TYP_name() { return m_DEVELOP_TYP_name; }
	public String getDEVELOP_TYP_val() { return m_DEVELOP_TYP_val; }
	public String getInitLevel() { return m_InitLevel; }
	public String geth_MaxLevel() { return m_h_MaxLevel; }
	public String getAE0090040tree1() { return m_AE0090040tree1; }
	public String getid() { return m_id; }
	public String getlvl() { return m_lvl; }
	public String getparent() { return m_parent; }
	public String getlabel() { return m_label; }
	public String getctx() { return m_ctx; }
	public String getmaxid() { return m_maxid; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getNEED_QTY_1() { return m_NEED_QTY_1; }
	public String getDet_Comp_Need_QTY() { return m_Det_Comp_Need_QTY; }
	public String getUpper_ITEM_NAME() { return m_Upper_ITEM_NAME; }
	public String getDet_Comp_ONHAND_QTY() { return m_Det_Comp_ONHAND_QTY; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getNO() { return m_NO; }
	public String getNEED_QTY() { return m_NEED_QTY; }
	public String getUNIT_QTY() { return m_UNIT_QTY; }
	public String getIN_UNIT_1() { return m_IN_UNIT_1; }
	public String getIN_UNIT_2() { return m_IN_UNIT_2; }
	public String geth_DEVELOP_TYP() { return m_h_DEVELOP_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getRECEIPT_SCHEDULES_NUMBER1() { return m_RECEIPT_SCHEDULES_NUMBER1; }
	public String getLower_ITEM_CD() { return m_Lower_ITEM_CD; }
	public String getTERM2STARTDATE() { return m_TERM2STARTDATE; }
	public String getRECEIPT_SCHEDULES_NUMBER2() { return m_RECEIPT_SCHEDULES_NUMBER2; }
	public String getRECEIPT_SCHEDULES_TERM() { return m_RECEIPT_SCHEDULES_TERM; }
	public String getRECEIPT_SCHEDULES_NUMBER() { return m_RECEIPT_SCHEDULES_NUMBER; }
	public String getLower_ITEM_NAME() { return m_Lower_ITEM_NAME; }
	public String getDet_Parent_ITEM_CD() { return m_Det_Parent_ITEM_CD; }
	public String getDet_Parent_ITEM_NAME() { return m_Det_Parent_ITEM_NAME; }
	public String getDet_Comp_ITEM_CD() { return m_Det_Comp_ITEM_CD; }
	public String getDet_Comp_ITEM_NAME() { return m_Det_Comp_ITEM_NAME; }
	public String getDet_Comp_STOCK_UNIT() { return m_Det_Comp_STOCK_UNIT; }
	public String getDet_Comp_PRODUCT_TYP() { return m_Det_Comp_PRODUCT_TYP; }
	public String getDet_Comp_MRP_ODR_TYP() { return m_Det_Comp_MRP_ODR_TYP; }
	public String getDet_Comp_OUTSIDE_TYP() { return m_Det_Comp_OUTSIDE_TYP; }
	public String getDet_Comp_PS_UNIT_QTY() { return m_Det_Comp_PS_UNIT_QTY; }
	public String getDet_Comp_ITEM_SPOIL() { return m_Det_Comp_ITEM_SPOIL; }
	public String getDet_Comp_EFF_PHASE_IN_DATE() { return m_Det_Comp_EFF_PHASE_IN_DATE; }
	public String getDet_Comp_EFF_PHASE_OUT_DATE() { return m_Det_Comp_EFF_PHASE_OUT_DATE; }
	public String getDet_Comp_PS_SPOIL() { return m_Det_Comp_PS_SPOIL; }
	public String getDet_Comp_CONS_TYP() { return m_Det_Comp_CONS_TYP; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getONHAND_STOCK() { return m_ONHAND_STOCK; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getLower_NEED_QTY() { return m_Lower_NEED_QTY; }
	public String getUpper_NEED_QTY() { return m_Upper_NEED_QTY; }
	public String getUpper_ITEM_CD() { return m_Upper_ITEM_CD; }
	public String getTarget_ITEM_CD() { return m_Target_ITEM_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }
	public String getNUMERATOR() { return m_NUMERATOR; }
	public String getDENOMINATOR() { return m_DENOMINATOR; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getTargetDate() { return m_TargetDate; }
	public String getCOMP_ITEM_NAME() { return m_COMP_ITEM_NAME; }
	public String getITEM_CD_VIEW() { return m_ITEM_CD_VIEW; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }

	public List getList_DEVELOP_TYP() { return l_DEVELOP_TYP; }
	public List getList_DEVELOP_TYP_name() { return l_DEVELOP_TYP_name; }
	public List getList_DEVELOP_TYP_val() { return l_DEVELOP_TYP_val; }
	public List getList_InitLevel() { return l_InitLevel; }
	public List getList_h_MaxLevel() { return l_h_MaxLevel; }
	public List getList_AE0090040tree1() { return l_AE0090040tree1; }
	public List getList_id() { return l_id; }
	public List getList_lvl() { return l_lvl; }
	public List getList_parent() { return l_parent; }
	public List getList_label() { return l_label; }
	public List getList_ctx() { return l_ctx; }
	public List getList_maxid() { return l_maxid; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_NEED_QTY_1() { return l_NEED_QTY_1; }
	public List getList_Det_Comp_Need_QTY() { return l_Det_Comp_Need_QTY; }
	public List getList_Upper_ITEM_NAME() { return l_Upper_ITEM_NAME; }
	public List getList_Det_Comp_ONHAND_QTY() { return l_Det_Comp_ONHAND_QTY; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_NO() { return l_NO; }
	public List getList_NEED_QTY() { return l_NEED_QTY; }
	public List getList_UNIT_QTY() { return l_UNIT_QTY; }
	public List getList_IN_UNIT_1() { return l_IN_UNIT_1; }
	public List getList_IN_UNIT_2() { return l_IN_UNIT_2; }
	public List getList_h_DEVELOP_TYP() { return l_h_DEVELOP_TYP; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_RECEIPT_SCHEDULES_NUMBER1() { return l_RECEIPT_SCHEDULES_NUMBER1; }
	public List getList_Lower_ITEM_CD() { return l_Lower_ITEM_CD; }
	public List getList_TERM2STARTDATE() { return l_TERM2STARTDATE; }
	public List getList_RECEIPT_SCHEDULES_NUMBER2() { return l_RECEIPT_SCHEDULES_NUMBER2; }
	public List getList_RECEIPT_SCHEDULES_TERM() { return l_RECEIPT_SCHEDULES_TERM; }
	public List getList_RECEIPT_SCHEDULES_NUMBER() { return l_RECEIPT_SCHEDULES_NUMBER; }
	public List getList_Lower_ITEM_NAME() { return l_Lower_ITEM_NAME; }
	public List getList_Det_Parent_ITEM_CD() { return l_Det_Parent_ITEM_CD; }
	public List getList_Det_Parent_ITEM_NAME() { return l_Det_Parent_ITEM_NAME; }
	public List getList_Det_Comp_ITEM_CD() { return l_Det_Comp_ITEM_CD; }
	public List getList_Det_Comp_ITEM_NAME() { return l_Det_Comp_ITEM_NAME; }
	public List getList_Det_Comp_STOCK_UNIT() { return l_Det_Comp_STOCK_UNIT; }
	public List getList_Det_Comp_PRODUCT_TYP() { return l_Det_Comp_PRODUCT_TYP; }
	public List getList_Det_Comp_MRP_ODR_TYP() { return l_Det_Comp_MRP_ODR_TYP; }
	public List getList_Det_Comp_OUTSIDE_TYP() { return l_Det_Comp_OUTSIDE_TYP; }
	public List getList_Det_Comp_PS_UNIT_QTY() { return l_Det_Comp_PS_UNIT_QTY; }
	public List getList_Det_Comp_ITEM_SPOIL() { return l_Det_Comp_ITEM_SPOIL; }
	public List getList_Det_Comp_EFF_PHASE_IN_DATE() { return l_Det_Comp_EFF_PHASE_IN_DATE; }
	public List getList_Det_Comp_EFF_PHASE_OUT_DATE() { return l_Det_Comp_EFF_PHASE_OUT_DATE; }
	public List getList_Det_Comp_PS_SPOIL() { return l_Det_Comp_PS_SPOIL; }
	public List getList_Det_Comp_CONS_TYP() { return l_Det_Comp_CONS_TYP; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_ONHAND_STOCK() { return l_ONHAND_STOCK; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_Lower_NEED_QTY() { return l_Lower_NEED_QTY; }
	public List getList_Upper_NEED_QTY() { return l_Upper_NEED_QTY; }
	public List getList_Upper_ITEM_CD() { return l_Upper_ITEM_CD; }
	public List getList_Target_ITEM_CD() { return l_Target_ITEM_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_COMP_ITEM_CD() { return l_COMP_ITEM_CD; }
	public List getList_NUMERATOR() { return l_NUMERATOR; }
	public List getList_DENOMINATOR() { return l_DENOMINATOR; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_TargetDate() { return l_TargetDate; }
	public List getList_COMP_ITEM_NAME() { return l_COMP_ITEM_NAME; }
	public List getList_ITEM_CD_VIEW() { return l_ITEM_CD_VIEW; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }

	public void setDEVELOP_TYP(String val) { m_DEVELOP_TYP = val; }
	public void setDEVELOP_TYP_name(String val) { m_DEVELOP_TYP_name = val; }
	public void setDEVELOP_TYP_val(String val) { m_DEVELOP_TYP_val = val; }
	public void setInitLevel(String val) { m_InitLevel = val; }
	public void seth_MaxLevel(String val) { m_h_MaxLevel = val; }
	public void setAE0090040tree1(String val) { m_AE0090040tree1 = val; }
	public void setid(String val) { m_id = val; }
	public void setlvl(String val) { m_lvl = val; }
	public void setparent(String val) { m_parent = val; }
	public void setlabel(String val) { m_label = val; }
	public void setctx(String val) { m_ctx = val; }
	public void setmaxid(String val) { m_maxid = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setNEED_QTY_1(String val) { m_NEED_QTY_1 = val; }
	public void setDet_Comp_Need_QTY(String val) { m_Det_Comp_Need_QTY = val; }
	public void setUpper_ITEM_NAME(String val) { m_Upper_ITEM_NAME = val; }
	public void setDet_Comp_ONHAND_QTY(String val) { m_Det_Comp_ONHAND_QTY = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setNO(String val) { m_NO = val; }
	public void setNEED_QTY(String val) { m_NEED_QTY = val; }
	public void setUNIT_QTY(String val) { m_UNIT_QTY = val; }
	public void setIN_UNIT_1(String val) { m_IN_UNIT_1 = val; }
	public void setIN_UNIT_2(String val) { m_IN_UNIT_2 = val; }
	public void seth_DEVELOP_TYP(String val) { m_h_DEVELOP_TYP = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setRECEIPT_SCHEDULES_NUMBER1(String val) { m_RECEIPT_SCHEDULES_NUMBER1 = val; }
	public void setLower_ITEM_CD(String val) { m_Lower_ITEM_CD = val; }
	public void setTERM2STARTDATE(String val) { m_TERM2STARTDATE = val; }
	public void setRECEIPT_SCHEDULES_NUMBER2(String val) { m_RECEIPT_SCHEDULES_NUMBER2 = val; }
	public void setRECEIPT_SCHEDULES_TERM(String val) { m_RECEIPT_SCHEDULES_TERM = val; }
	public void setRECEIPT_SCHEDULES_NUMBER(String val) { m_RECEIPT_SCHEDULES_NUMBER = val; }
	public void setLower_ITEM_NAME(String val) { m_Lower_ITEM_NAME = val; }
	public void setDet_Parent_ITEM_CD(String val) { m_Det_Parent_ITEM_CD = val; }
	public void setDet_Parent_ITEM_NAME(String val) { m_Det_Parent_ITEM_NAME = val; }
	public void setDet_Comp_ITEM_CD(String val) { m_Det_Comp_ITEM_CD = val; }
	public void setDet_Comp_ITEM_NAME(String val) { m_Det_Comp_ITEM_NAME = val; }
	public void setDet_Comp_STOCK_UNIT(String val) { m_Det_Comp_STOCK_UNIT = val; }
	public void setDet_Comp_PRODUCT_TYP(String val) { m_Det_Comp_PRODUCT_TYP = val; }
	public void setDet_Comp_MRP_ODR_TYP(String val) { m_Det_Comp_MRP_ODR_TYP = val; }
	public void setDet_Comp_OUTSIDE_TYP(String val) { m_Det_Comp_OUTSIDE_TYP = val; }
	public void setDet_Comp_PS_UNIT_QTY(String val) { m_Det_Comp_PS_UNIT_QTY = val; }
	public void setDet_Comp_ITEM_SPOIL(String val) { m_Det_Comp_ITEM_SPOIL = val; }
	public void setDet_Comp_EFF_PHASE_IN_DATE(String val) { m_Det_Comp_EFF_PHASE_IN_DATE = val; }
	public void setDet_Comp_EFF_PHASE_OUT_DATE(String val) { m_Det_Comp_EFF_PHASE_OUT_DATE = val; }
	public void setDet_Comp_PS_SPOIL(String val) { m_Det_Comp_PS_SPOIL = val; }
	public void setDet_Comp_CONS_TYP(String val) { m_Det_Comp_CONS_TYP = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setONHAND_STOCK(String val) { m_ONHAND_STOCK = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setLower_NEED_QTY(String val) { m_Lower_NEED_QTY = val; }
	public void setUpper_NEED_QTY(String val) { m_Upper_NEED_QTY = val; }
	public void setUpper_ITEM_CD(String val) { m_Upper_ITEM_CD = val; }
	public void setTarget_ITEM_CD(String val) { m_Target_ITEM_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }
	public void setNUMERATOR(String val) { m_NUMERATOR = val; }
	public void setDENOMINATOR(String val) { m_DENOMINATOR = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setTargetDate(String val) { m_TargetDate = val; }
	public void setCOMP_ITEM_NAME(String val) { m_COMP_ITEM_NAME = val; }
	public void setITEM_CD_VIEW(String val) { m_ITEM_CD_VIEW = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }


	public void setList_DEVELOP_TYP(List list) { l_DEVELOP_TYP = list; }
	public void setList_DEVELOP_TYP_name(List list) { l_DEVELOP_TYP_name = list; }
	public void setList_DEVELOP_TYP_val(List list) { l_DEVELOP_TYP_val = list; }
	public void setList_InitLevel(List list) { l_InitLevel = list; }
	public void setList_h_MaxLevel(List list) { l_h_MaxLevel = list; }
	public void setList_AE0090040tree1(List list) { l_AE0090040tree1 = list; }
	public void setList_id(List list) { l_id = list; }
	public void setList_lvl(List list) { l_lvl = list; }
	public void setList_parent(List list) { l_parent = list; }
	public void setList_label(List list) { l_label = list; }
	public void setList_ctx(List list) { l_ctx = list; }
	public void setList_maxid(List list) { l_maxid = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_NEED_QTY_1(List list) { l_NEED_QTY_1 = list; }
	public void setList_Det_Comp_Need_QTY(List list) { l_Det_Comp_Need_QTY = list; }
	public void setList_Upper_ITEM_NAME(List list) { l_Upper_ITEM_NAME = list; }
	public void setList_Det_Comp_ONHAND_QTY(List list) { l_Det_Comp_ONHAND_QTY = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_NO(List list) { l_NO = list; }
	public void setList_NEED_QTY(List list) { l_NEED_QTY = list; }
	public void setList_UNIT_QTY(List list) { l_UNIT_QTY = list; }
	public void setList_IN_UNIT_1(List list) { l_IN_UNIT_1 = list; }
	public void setList_IN_UNIT_2(List list) { l_IN_UNIT_2 = list; }
	public void setList_h_DEVELOP_TYP(List list) { l_h_DEVELOP_TYP = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_RECEIPT_SCHEDULES_NUMBER1(List list) { l_RECEIPT_SCHEDULES_NUMBER1 = list; }
	public void setList_Lower_ITEM_CD(List list) { l_Lower_ITEM_CD = list; }
	public void setList_TERM2STARTDATE(List list) { l_TERM2STARTDATE = list; }
	public void setList_RECEIPT_SCHEDULES_NUMBER2(List list) { l_RECEIPT_SCHEDULES_NUMBER2 = list; }
	public void setList_RECEIPT_SCHEDULES_TERM(List list) { l_RECEIPT_SCHEDULES_TERM = list; }
	public void setList_RECEIPT_SCHEDULES_NUMBER(List list) { l_RECEIPT_SCHEDULES_NUMBER = list; }
	public void setList_Lower_ITEM_NAME(List list) { l_Lower_ITEM_NAME = list; }
	public void setList_Det_Parent_ITEM_CD(List list) { l_Det_Parent_ITEM_CD = list; }
	public void setList_Det_Parent_ITEM_NAME(List list) { l_Det_Parent_ITEM_NAME = list; }
	public void setList_Det_Comp_ITEM_CD(List list) { l_Det_Comp_ITEM_CD = list; }
	public void setList_Det_Comp_ITEM_NAME(List list) { l_Det_Comp_ITEM_NAME = list; }
	public void setList_Det_Comp_STOCK_UNIT(List list) { l_Det_Comp_STOCK_UNIT = list; }
	public void setList_Det_Comp_PRODUCT_TYP(List list) { l_Det_Comp_PRODUCT_TYP = list; }
	public void setList_Det_Comp_MRP_ODR_TYP(List list) { l_Det_Comp_MRP_ODR_TYP = list; }
	public void setList_Det_Comp_OUTSIDE_TYP(List list) { l_Det_Comp_OUTSIDE_TYP = list; }
	public void setList_Det_Comp_PS_UNIT_QTY(List list) { l_Det_Comp_PS_UNIT_QTY = list; }
	public void setList_Det_Comp_ITEM_SPOIL(List list) { l_Det_Comp_ITEM_SPOIL = list; }
	public void setList_Det_Comp_EFF_PHASE_IN_DATE(List list) { l_Det_Comp_EFF_PHASE_IN_DATE = list; }
	public void setList_Det_Comp_EFF_PHASE_OUT_DATE(List list) { l_Det_Comp_EFF_PHASE_OUT_DATE = list; }
	public void setList_Det_Comp_PS_SPOIL(List list) { l_Det_Comp_PS_SPOIL = list; }
	public void setList_Det_Comp_CONS_TYP(List list) { l_Det_Comp_CONS_TYP = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_ONHAND_STOCK(List list) { l_ONHAND_STOCK = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_Lower_NEED_QTY(List list) { l_Lower_NEED_QTY = list; }
	public void setList_Upper_NEED_QTY(List list) { l_Upper_NEED_QTY = list; }
	public void setList_Upper_ITEM_CD(List list) { l_Upper_ITEM_CD = list; }
	public void setList_Target_ITEM_CD(List list) { l_Target_ITEM_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_COMP_ITEM_CD(List list) { l_COMP_ITEM_CD = list; }
	public void setList_NUMERATOR(List list) { l_NUMERATOR = list; }
	public void setList_DENOMINATOR(List list) { l_DENOMINATOR = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_TargetDate(List list) { l_TargetDate = list; }
	public void setList_COMP_ITEM_NAME(List list) { l_COMP_ITEM_NAME = list; }
	public void setList_ITEM_CD_VIEW(List list) { l_ITEM_CD_VIEW = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }

	public int setL2L_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP == null) {
			l_DEVELOP_TYP = new ArrayList();
		} else {
			l_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP.add(((AE0090040Struct) list.get(i)).getDEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_name == null) {
			l_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_name.add(((AE0090040Struct) list.get(i)).getDEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_val == null) {
			l_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_val.add(((AE0090040Struct) list.get(i)).getDEVELOP_TYP_val());
		}
		return size;
	}
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
			l_InitLevel.add(((AE0090040Struct) list.get(i)).getInitLevel());
		}
		return size;
	}
	public int setL2L_h_MaxLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MaxLevel == null) {
			l_h_MaxLevel = new ArrayList();
		} else {
			l_h_MaxLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MaxLevel.add(((AE0090040Struct) list.get(i)).geth_MaxLevel());
		}
		return size;
	}
	public int setL2L_AE0090040tree1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AE0090040tree1 == null) {
			l_AE0090040tree1 = new ArrayList();
		} else {
			l_AE0090040tree1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AE0090040tree1.add(((AE0090040Struct) list.get(i)).getAE0090040tree1());
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
			l_id.add(((AE0090040Struct) list.get(i)).getid());
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
			l_lvl.add(((AE0090040Struct) list.get(i)).getlvl());
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
			l_parent.add(((AE0090040Struct) list.get(i)).getparent());
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
			l_label.add(((AE0090040Struct) list.get(i)).getlabel());
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
			l_ctx.add(((AE0090040Struct) list.get(i)).getctx());
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
			l_maxid.add(((AE0090040Struct) list.get(i)).getmaxid());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AE0090040Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_OUT_DATE == null) {
			l_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_OUT_DATE.add(((AE0090040Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_NEED_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEED_QTY_1 == null) {
			l_NEED_QTY_1 = new ArrayList();
		} else {
			l_NEED_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEED_QTY_1.add(((AE0090040Struct) list.get(i)).getNEED_QTY_1());
		}
		return size;
	}
	public int setL2L_Det_Comp_Need_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_Need_QTY == null) {
			l_Det_Comp_Need_QTY = new ArrayList();
		} else {
			l_Det_Comp_Need_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_Need_QTY.add(((AE0090040Struct) list.get(i)).getDet_Comp_Need_QTY());
		}
		return size;
	}
	public int setL2L_Upper_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Upper_ITEM_NAME == null) {
			l_Upper_ITEM_NAME = new ArrayList();
		} else {
			l_Upper_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Upper_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getUpper_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Det_Comp_ONHAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_ONHAND_QTY == null) {
			l_Det_Comp_ONHAND_QTY = new ArrayList();
		} else {
			l_Det_Comp_ONHAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_ONHAND_QTY.add(((AE0090040Struct) list.get(i)).getDet_Comp_ONHAND_QTY());
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
			l_MODIFY_COUNT.add(((AE0090040Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NO == null) {
			l_NO = new ArrayList();
		} else {
			l_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NO.add(((AE0090040Struct) list.get(i)).getNO());
		}
		return size;
	}
	public int setL2L_NEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEED_QTY == null) {
			l_NEED_QTY = new ArrayList();
		} else {
			l_NEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEED_QTY.add(((AE0090040Struct) list.get(i)).getNEED_QTY());
		}
		return size;
	}
	public int setL2L_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY == null) {
			l_UNIT_QTY = new ArrayList();
		} else {
			l_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY.add(((AE0090040Struct) list.get(i)).getUNIT_QTY());
		}
		return size;
	}
	public int setL2L_IN_UNIT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_UNIT_1 == null) {
			l_IN_UNIT_1 = new ArrayList();
		} else {
			l_IN_UNIT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_UNIT_1.add(((AE0090040Struct) list.get(i)).getIN_UNIT_1());
		}
		return size;
	}
	public int setL2L_IN_UNIT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_UNIT_2 == null) {
			l_IN_UNIT_2 = new ArrayList();
		} else {
			l_IN_UNIT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_UNIT_2.add(((AE0090040Struct) list.get(i)).getIN_UNIT_2());
		}
		return size;
	}
	public int setL2L_h_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEVELOP_TYP == null) {
			l_h_DEVELOP_TYP = new ArrayList();
		} else {
			l_h_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEVELOP_TYP.add(((AE0090040Struct) list.get(i)).geth_DEVELOP_TYP());
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
			l_PLANT_NAME.add(((AE0090040Struct) list.get(i)).getPLANT_NAME());
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
			l_PLANT_CD.add(((AE0090040Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_RECEIPT_SCHEDULES_NUMBER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECEIPT_SCHEDULES_NUMBER1 == null) {
			l_RECEIPT_SCHEDULES_NUMBER1 = new ArrayList();
		} else {
			l_RECEIPT_SCHEDULES_NUMBER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECEIPT_SCHEDULES_NUMBER1.add(((AE0090040Struct) list.get(i)).getRECEIPT_SCHEDULES_NUMBER1());
		}
		return size;
	}
	public int setL2L_Lower_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_ITEM_CD == null) {
			l_Lower_ITEM_CD = new ArrayList();
		} else {
			l_Lower_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_ITEM_CD.add(((AE0090040Struct) list.get(i)).getLower_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TERM2STARTDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TERM2STARTDATE == null) {
			l_TERM2STARTDATE = new ArrayList();
		} else {
			l_TERM2STARTDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TERM2STARTDATE.add(((AE0090040Struct) list.get(i)).getTERM2STARTDATE());
		}
		return size;
	}
	public int setL2L_RECEIPT_SCHEDULES_NUMBER2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECEIPT_SCHEDULES_NUMBER2 == null) {
			l_RECEIPT_SCHEDULES_NUMBER2 = new ArrayList();
		} else {
			l_RECEIPT_SCHEDULES_NUMBER2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECEIPT_SCHEDULES_NUMBER2.add(((AE0090040Struct) list.get(i)).getRECEIPT_SCHEDULES_NUMBER2());
		}
		return size;
	}
	public int setL2L_RECEIPT_SCHEDULES_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECEIPT_SCHEDULES_TERM == null) {
			l_RECEIPT_SCHEDULES_TERM = new ArrayList();
		} else {
			l_RECEIPT_SCHEDULES_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECEIPT_SCHEDULES_TERM.add(((AE0090040Struct) list.get(i)).getRECEIPT_SCHEDULES_TERM());
		}
		return size;
	}
	public int setL2L_RECEIPT_SCHEDULES_NUMBER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECEIPT_SCHEDULES_NUMBER == null) {
			l_RECEIPT_SCHEDULES_NUMBER = new ArrayList();
		} else {
			l_RECEIPT_SCHEDULES_NUMBER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECEIPT_SCHEDULES_NUMBER.add(((AE0090040Struct) list.get(i)).getRECEIPT_SCHEDULES_NUMBER());
		}
		return size;
	}
	public int setL2L_Lower_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_ITEM_NAME == null) {
			l_Lower_ITEM_NAME = new ArrayList();
		} else {
			l_Lower_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getLower_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Det_Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Parent_ITEM_CD == null) {
			l_Det_Parent_ITEM_CD = new ArrayList();
		} else {
			l_Det_Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Parent_ITEM_CD.add(((AE0090040Struct) list.get(i)).getDet_Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Det_Parent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Parent_ITEM_NAME == null) {
			l_Det_Parent_ITEM_NAME = new ArrayList();
		} else {
			l_Det_Parent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Parent_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getDet_Parent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Det_Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_ITEM_CD == null) {
			l_Det_Comp_ITEM_CD = new ArrayList();
		} else {
			l_Det_Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_ITEM_CD.add(((AE0090040Struct) list.get(i)).getDet_Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Det_Comp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_ITEM_NAME == null) {
			l_Det_Comp_ITEM_NAME = new ArrayList();
		} else {
			l_Det_Comp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getDet_Comp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Det_Comp_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_STOCK_UNIT == null) {
			l_Det_Comp_STOCK_UNIT = new ArrayList();
		} else {
			l_Det_Comp_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_STOCK_UNIT.add(((AE0090040Struct) list.get(i)).getDet_Comp_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Det_Comp_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_PRODUCT_TYP == null) {
			l_Det_Comp_PRODUCT_TYP = new ArrayList();
		} else {
			l_Det_Comp_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_PRODUCT_TYP.add(((AE0090040Struct) list.get(i)).getDet_Comp_PRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_Det_Comp_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_MRP_ODR_TYP == null) {
			l_Det_Comp_MRP_ODR_TYP = new ArrayList();
		} else {
			l_Det_Comp_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_MRP_ODR_TYP.add(((AE0090040Struct) list.get(i)).getDet_Comp_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_Det_Comp_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_OUTSIDE_TYP == null) {
			l_Det_Comp_OUTSIDE_TYP = new ArrayList();
		} else {
			l_Det_Comp_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_OUTSIDE_TYP.add(((AE0090040Struct) list.get(i)).getDet_Comp_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_Det_Comp_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_PS_UNIT_QTY == null) {
			l_Det_Comp_PS_UNIT_QTY = new ArrayList();
		} else {
			l_Det_Comp_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_PS_UNIT_QTY.add(((AE0090040Struct) list.get(i)).getDet_Comp_PS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_Det_Comp_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_ITEM_SPOIL == null) {
			l_Det_Comp_ITEM_SPOIL = new ArrayList();
		} else {
			l_Det_Comp_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_ITEM_SPOIL.add(((AE0090040Struct) list.get(i)).getDet_Comp_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_Det_Comp_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_EFF_PHASE_IN_DATE == null) {
			l_Det_Comp_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Det_Comp_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_EFF_PHASE_IN_DATE.add(((AE0090040Struct) list.get(i)).getDet_Comp_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Det_Comp_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_EFF_PHASE_OUT_DATE == null) {
			l_Det_Comp_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Det_Comp_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_EFF_PHASE_OUT_DATE.add(((AE0090040Struct) list.get(i)).getDet_Comp_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_Det_Comp_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_PS_SPOIL == null) {
			l_Det_Comp_PS_SPOIL = new ArrayList();
		} else {
			l_Det_Comp_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_PS_SPOIL.add(((AE0090040Struct) list.get(i)).getDet_Comp_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_Det_Comp_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_Comp_CONS_TYP == null) {
			l_Det_Comp_CONS_TYP = new ArrayList();
		} else {
			l_Det_Comp_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_Comp_CONS_TYP.add(((AE0090040Struct) list.get(i)).getDet_Comp_CONS_TYP());
		}
		return size;
	}
	public int setL2L_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_EDITION == null) {
			l_PS_EDITION = new ArrayList();
		} else {
			l_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_EDITION.add(((AE0090040Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_ONHAND_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONHAND_STOCK == null) {
			l_ONHAND_STOCK = new ArrayList();
		} else {
			l_ONHAND_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONHAND_STOCK.add(((AE0090040Struct) list.get(i)).getONHAND_STOCK());
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
			l_UNIT_QTY_TYP.add(((AE0090040Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_Lower_NEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_NEED_QTY == null) {
			l_Lower_NEED_QTY = new ArrayList();
		} else {
			l_Lower_NEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_NEED_QTY.add(((AE0090040Struct) list.get(i)).getLower_NEED_QTY());
		}
		return size;
	}
	public int setL2L_Upper_NEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Upper_NEED_QTY == null) {
			l_Upper_NEED_QTY = new ArrayList();
		} else {
			l_Upper_NEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Upper_NEED_QTY.add(((AE0090040Struct) list.get(i)).getUpper_NEED_QTY());
		}
		return size;
	}
	public int setL2L_Upper_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Upper_ITEM_CD == null) {
			l_Upper_ITEM_CD = new ArrayList();
		} else {
			l_Upper_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Upper_ITEM_CD.add(((AE0090040Struct) list.get(i)).getUpper_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Target_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Target_ITEM_CD == null) {
			l_Target_ITEM_CD = new ArrayList();
		} else {
			l_Target_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Target_ITEM_CD.add(((AE0090040Struct) list.get(i)).getTarget_ITEM_CD());
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
			l_SPEC.add(((AE0090040Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_CD == null) {
			l_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_CD.add(((AE0090040Struct) list.get(i)).getPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_ITEM_CD == null) {
			l_COMP_ITEM_CD = new ArrayList();
		} else {
			l_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_ITEM_CD.add(((AE0090040Struct) list.get(i)).getCOMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NUMERATOR == null) {
			l_NUMERATOR = new ArrayList();
		} else {
			l_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NUMERATOR.add(((AE0090040Struct) list.get(i)).getNUMERATOR());
		}
		return size;
	}
	public int setL2L_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DENOMINATOR == null) {
			l_DENOMINATOR = new ArrayList();
		} else {
			l_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DENOMINATOR.add(((AE0090040Struct) list.get(i)).getDENOMINATOR());
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
			l_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getITEM_NAME());
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
			l_STOCK_UNIT.add(((AE0090040Struct) list.get(i)).getSTOCK_UNIT());
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
			l_PRODUCT_TYP.add(((AE0090040Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TargetDate == null) {
			l_TargetDate = new ArrayList();
		} else {
			l_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TargetDate.add(((AE0090040Struct) list.get(i)).getTargetDate());
		}
		return size;
	}
	public int setL2L_COMP_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_ITEM_NAME == null) {
			l_COMP_ITEM_NAME = new ArrayList();
		} else {
			l_COMP_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getCOMP_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CD_VIEW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD_VIEW == null) {
			l_ITEM_CD_VIEW = new ArrayList();
		} else {
			l_ITEM_CD_VIEW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD_VIEW.add(((AE0090040Struct) list.get(i)).getITEM_CD_VIEW());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_NAME == null) {
			l_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_NAME.add(((AE0090040Struct) list.get(i)).getPARENT_ITEM_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DEVELOP_TYP = null;
		m_DEVELOP_TYP_name = null;
		m_DEVELOP_TYP_val = null;
		m_InitLevel = null;
		m_h_MaxLevel = null;
		m_AE0090040tree1 = null;
		m_id = null;
		m_lvl = null;
		m_parent = null;
		m_label = null;
		m_ctx = null;
		m_maxid = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_NEED_QTY_1 = null;
		m_Det_Comp_Need_QTY = null;
		m_Upper_ITEM_NAME = null;
		m_Det_Comp_ONHAND_QTY = null;
		m_MODIFY_COUNT = null;
		m_NO = null;
		m_NEED_QTY = null;
		m_UNIT_QTY = null;
		m_IN_UNIT_1 = null;
		m_IN_UNIT_2 = null;
		m_h_DEVELOP_TYP = null;
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_RECEIPT_SCHEDULES_NUMBER1 = null;
		m_Lower_ITEM_CD = null;
		m_TERM2STARTDATE = null;
		m_RECEIPT_SCHEDULES_NUMBER2 = null;
		m_RECEIPT_SCHEDULES_TERM = null;
		m_RECEIPT_SCHEDULES_NUMBER = null;
		m_Lower_ITEM_NAME = null;
		m_Det_Parent_ITEM_CD = null;
		m_Det_Parent_ITEM_NAME = null;
		m_Det_Comp_ITEM_CD = null;
		m_Det_Comp_ITEM_NAME = null;
		m_Det_Comp_STOCK_UNIT = null;
		m_Det_Comp_PRODUCT_TYP = null;
		m_Det_Comp_MRP_ODR_TYP = null;
		m_Det_Comp_OUTSIDE_TYP = null;
		m_Det_Comp_PS_UNIT_QTY = null;
		m_Det_Comp_ITEM_SPOIL = null;
		m_Det_Comp_EFF_PHASE_IN_DATE = null;
		m_Det_Comp_EFF_PHASE_OUT_DATE = null;
		m_Det_Comp_PS_SPOIL = null;
		m_Det_Comp_CONS_TYP = null;
		m_PS_EDITION = null;
		m_ONHAND_STOCK = null;
		m_UNIT_QTY_TYP = null;
		m_Lower_NEED_QTY = null;
		m_Upper_NEED_QTY = null;
		m_Upper_ITEM_CD = null;
		m_Target_ITEM_CD = null;
		m_SPEC = null;
		m_PARENT_ITEM_CD = null;
		m_COMP_ITEM_CD = null;
		m_NUMERATOR = null;
		m_DENOMINATOR = null;
		m_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_PRODUCT_TYP = null;
		m_TargetDate = null;
		m_COMP_ITEM_NAME = null;
		m_ITEM_CD_VIEW = null;
		m_PARENT_ITEM_NAME = null;

		l_DEVELOP_TYP = null;
		l_DEVELOP_TYP_name = null;
		l_DEVELOP_TYP_val = null;
		l_InitLevel = null;
		l_h_MaxLevel = null;
		l_AE0090040tree1 = null;
		l_id = null;
		l_lvl = null;
		l_parent = null;
		l_label = null;
		l_ctx = null;
		l_maxid = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_NEED_QTY_1 = null;
		l_Det_Comp_Need_QTY = null;
		l_Upper_ITEM_NAME = null;
		l_Det_Comp_ONHAND_QTY = null;
		l_MODIFY_COUNT = null;
		l_NO = null;
		l_NEED_QTY = null;
		l_UNIT_QTY = null;
		l_IN_UNIT_1 = null;
		l_IN_UNIT_2 = null;
		l_h_DEVELOP_TYP = null;
		l_PLANT_NAME = null;
		l_PLANT_CD = null;
		l_RECEIPT_SCHEDULES_NUMBER1 = null;
		l_Lower_ITEM_CD = null;
		l_TERM2STARTDATE = null;
		l_RECEIPT_SCHEDULES_NUMBER2 = null;
		l_RECEIPT_SCHEDULES_TERM = null;
		l_RECEIPT_SCHEDULES_NUMBER = null;
		l_Lower_ITEM_NAME = null;
		l_Det_Parent_ITEM_CD = null;
		l_Det_Parent_ITEM_NAME = null;
		l_Det_Comp_ITEM_CD = null;
		l_Det_Comp_ITEM_NAME = null;
		l_Det_Comp_STOCK_UNIT = null;
		l_Det_Comp_PRODUCT_TYP = null;
		l_Det_Comp_MRP_ODR_TYP = null;
		l_Det_Comp_OUTSIDE_TYP = null;
		l_Det_Comp_PS_UNIT_QTY = null;
		l_Det_Comp_ITEM_SPOIL = null;
		l_Det_Comp_EFF_PHASE_IN_DATE = null;
		l_Det_Comp_EFF_PHASE_OUT_DATE = null;
		l_Det_Comp_PS_SPOIL = null;
		l_Det_Comp_CONS_TYP = null;
		l_PS_EDITION = null;
		l_ONHAND_STOCK = null;
		l_UNIT_QTY_TYP = null;
		l_Lower_NEED_QTY = null;
		l_Upper_NEED_QTY = null;
		l_Upper_ITEM_CD = null;
		l_Target_ITEM_CD = null;
		l_SPEC = null;
		l_PARENT_ITEM_CD = null;
		l_COMP_ITEM_CD = null;
		l_NUMERATOR = null;
		l_DENOMINATOR = null;
		l_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_PRODUCT_TYP = null;
		l_TargetDate = null;
		l_COMP_ITEM_NAME = null;
		l_ITEM_CD_VIEW = null;
		l_PARENT_ITEM_NAME = null;

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
	 * medAE0090040�N���X�̕W���R���X�g���N�^
	 */
	public AE0090040Struct()
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
	public void setStruct(AE0090040Struct struct)
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
	public void setStructM(AE0090040Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDEVELOP_TYP(struct.getDEVELOP_TYP());
			this.setDEVELOP_TYP_name(struct.getDEVELOP_TYP_name());
			this.setDEVELOP_TYP_val(struct.getDEVELOP_TYP_val());
			this.setInitLevel(struct.getInitLevel());
			this.seth_MaxLevel(struct.geth_MaxLevel());
			this.setAE0090040tree1(struct.getAE0090040tree1());
			this.setid(struct.getid());
			this.setlvl(struct.getlvl());
			this.setparent(struct.getparent());
			this.setlabel(struct.getlabel());
			this.setctx(struct.getctx());
			this.setmaxid(struct.getmaxid());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setNEED_QTY_1(struct.getNEED_QTY_1());
			this.setDet_Comp_Need_QTY(struct.getDet_Comp_Need_QTY());
			this.setUpper_ITEM_NAME(struct.getUpper_ITEM_NAME());
			this.setDet_Comp_ONHAND_QTY(struct.getDet_Comp_ONHAND_QTY());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setNO(struct.getNO());
			this.setNEED_QTY(struct.getNEED_QTY());
			this.setUNIT_QTY(struct.getUNIT_QTY());
			this.setIN_UNIT_1(struct.getIN_UNIT_1());
			this.setIN_UNIT_2(struct.getIN_UNIT_2());
			this.seth_DEVELOP_TYP(struct.geth_DEVELOP_TYP());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setRECEIPT_SCHEDULES_NUMBER1(struct.getRECEIPT_SCHEDULES_NUMBER1());
			this.setLower_ITEM_CD(struct.getLower_ITEM_CD());
			this.setTERM2STARTDATE(struct.getTERM2STARTDATE());
			this.setRECEIPT_SCHEDULES_NUMBER2(struct.getRECEIPT_SCHEDULES_NUMBER2());
			this.setRECEIPT_SCHEDULES_TERM(struct.getRECEIPT_SCHEDULES_TERM());
			this.setRECEIPT_SCHEDULES_NUMBER(struct.getRECEIPT_SCHEDULES_NUMBER());
			this.setLower_ITEM_NAME(struct.getLower_ITEM_NAME());
			this.setDet_Parent_ITEM_CD(struct.getDet_Parent_ITEM_CD());
			this.setDet_Parent_ITEM_NAME(struct.getDet_Parent_ITEM_NAME());
			this.setDet_Comp_ITEM_CD(struct.getDet_Comp_ITEM_CD());
			this.setDet_Comp_ITEM_NAME(struct.getDet_Comp_ITEM_NAME());
			this.setDet_Comp_STOCK_UNIT(struct.getDet_Comp_STOCK_UNIT());
			this.setDet_Comp_PRODUCT_TYP(struct.getDet_Comp_PRODUCT_TYP());
			this.setDet_Comp_MRP_ODR_TYP(struct.getDet_Comp_MRP_ODR_TYP());
			this.setDet_Comp_OUTSIDE_TYP(struct.getDet_Comp_OUTSIDE_TYP());
			this.setDet_Comp_PS_UNIT_QTY(struct.getDet_Comp_PS_UNIT_QTY());
			this.setDet_Comp_ITEM_SPOIL(struct.getDet_Comp_ITEM_SPOIL());
			this.setDet_Comp_EFF_PHASE_IN_DATE(struct.getDet_Comp_EFF_PHASE_IN_DATE());
			this.setDet_Comp_EFF_PHASE_OUT_DATE(struct.getDet_Comp_EFF_PHASE_OUT_DATE());
			this.setDet_Comp_PS_SPOIL(struct.getDet_Comp_PS_SPOIL());
			this.setDet_Comp_CONS_TYP(struct.getDet_Comp_CONS_TYP());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setONHAND_STOCK(struct.getONHAND_STOCK());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setLower_NEED_QTY(struct.getLower_NEED_QTY());
			this.setUpper_NEED_QTY(struct.getUpper_NEED_QTY());
			this.setUpper_ITEM_CD(struct.getUpper_ITEM_CD());
			this.setTarget_ITEM_CD(struct.getTarget_ITEM_CD());
			this.setSPEC(struct.getSPEC());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
			this.setNUMERATOR(struct.getNUMERATOR());
			this.setDENOMINATOR(struct.getDENOMINATOR());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setTargetDate(struct.getTargetDate());
			this.setCOMP_ITEM_NAME(struct.getCOMP_ITEM_NAME());
			this.setITEM_CD_VIEW(struct.getITEM_CD_VIEW());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AE0090040Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DEVELOP_TYP(struct.getList_DEVELOP_TYP());
			this.setList_DEVELOP_TYP_name(struct.getList_DEVELOP_TYP_name());
			this.setList_DEVELOP_TYP_val(struct.getList_DEVELOP_TYP_val());
			this.setList_InitLevel(struct.getList_InitLevel());
			this.setList_h_MaxLevel(struct.getList_h_MaxLevel());
			this.setList_AE0090040tree1(struct.getList_AE0090040tree1());
			this.setList_id(struct.getList_id());
			this.setList_lvl(struct.getList_lvl());
			this.setList_parent(struct.getList_parent());
			this.setList_label(struct.getList_label());
			this.setList_ctx(struct.getList_ctx());
			this.setList_maxid(struct.getList_maxid());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_NEED_QTY_1(struct.getList_NEED_QTY_1());
			this.setList_Det_Comp_Need_QTY(struct.getList_Det_Comp_Need_QTY());
			this.setList_Upper_ITEM_NAME(struct.getList_Upper_ITEM_NAME());
			this.setList_Det_Comp_ONHAND_QTY(struct.getList_Det_Comp_ONHAND_QTY());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_NO(struct.getList_NO());
			this.setList_NEED_QTY(struct.getList_NEED_QTY());
			this.setList_UNIT_QTY(struct.getList_UNIT_QTY());
			this.setList_IN_UNIT_1(struct.getList_IN_UNIT_1());
			this.setList_IN_UNIT_2(struct.getList_IN_UNIT_2());
			this.setList_h_DEVELOP_TYP(struct.getList_h_DEVELOP_TYP());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_RECEIPT_SCHEDULES_NUMBER1(struct.getList_RECEIPT_SCHEDULES_NUMBER1());
			this.setList_Lower_ITEM_CD(struct.getList_Lower_ITEM_CD());
			this.setList_TERM2STARTDATE(struct.getList_TERM2STARTDATE());
			this.setList_RECEIPT_SCHEDULES_NUMBER2(struct.getList_RECEIPT_SCHEDULES_NUMBER2());
			this.setList_RECEIPT_SCHEDULES_TERM(struct.getList_RECEIPT_SCHEDULES_TERM());
			this.setList_RECEIPT_SCHEDULES_NUMBER(struct.getList_RECEIPT_SCHEDULES_NUMBER());
			this.setList_Lower_ITEM_NAME(struct.getList_Lower_ITEM_NAME());
			this.setList_Det_Parent_ITEM_CD(struct.getList_Det_Parent_ITEM_CD());
			this.setList_Det_Parent_ITEM_NAME(struct.getList_Det_Parent_ITEM_NAME());
			this.setList_Det_Comp_ITEM_CD(struct.getList_Det_Comp_ITEM_CD());
			this.setList_Det_Comp_ITEM_NAME(struct.getList_Det_Comp_ITEM_NAME());
			this.setList_Det_Comp_STOCK_UNIT(struct.getList_Det_Comp_STOCK_UNIT());
			this.setList_Det_Comp_PRODUCT_TYP(struct.getList_Det_Comp_PRODUCT_TYP());
			this.setList_Det_Comp_MRP_ODR_TYP(struct.getList_Det_Comp_MRP_ODR_TYP());
			this.setList_Det_Comp_OUTSIDE_TYP(struct.getList_Det_Comp_OUTSIDE_TYP());
			this.setList_Det_Comp_PS_UNIT_QTY(struct.getList_Det_Comp_PS_UNIT_QTY());
			this.setList_Det_Comp_ITEM_SPOIL(struct.getList_Det_Comp_ITEM_SPOIL());
			this.setList_Det_Comp_EFF_PHASE_IN_DATE(struct.getList_Det_Comp_EFF_PHASE_IN_DATE());
			this.setList_Det_Comp_EFF_PHASE_OUT_DATE(struct.getList_Det_Comp_EFF_PHASE_OUT_DATE());
			this.setList_Det_Comp_PS_SPOIL(struct.getList_Det_Comp_PS_SPOIL());
			this.setList_Det_Comp_CONS_TYP(struct.getList_Det_Comp_CONS_TYP());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_ONHAND_STOCK(struct.getList_ONHAND_STOCK());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_Lower_NEED_QTY(struct.getList_Lower_NEED_QTY());
			this.setList_Upper_NEED_QTY(struct.getList_Upper_NEED_QTY());
			this.setList_Upper_ITEM_CD(struct.getList_Upper_ITEM_CD());
			this.setList_Target_ITEM_CD(struct.getList_Target_ITEM_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_COMP_ITEM_CD(struct.getList_COMP_ITEM_CD());
			this.setList_NUMERATOR(struct.getList_NUMERATOR());
			this.setList_DENOMINATOR(struct.getList_DENOMINATOR());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_TargetDate(struct.getList_TargetDate());
			this.setList_COMP_ITEM_NAME(struct.getList_COMP_ITEM_NAME());
			this.setList_ITEM_CD_VIEW(struct.getList_ITEM_CD_VIEW());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
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
	// �� 1 �ϐ������l�F i_DEVELOP_TYP


	final static String i_DEVELOP_TYP = null;

	// �� 2 �ϐ������l�F i_DEVELOP_TYP_name


	final static String i_DEVELOP_TYP_name = null;

	// �� 3 �ϐ������l�F i_DEVELOP_TYP_val


	final static String i_DEVELOP_TYP_val = null;

	// �� 4 �ϐ������l�F i_InitLevel


	final static String i_InitLevel = null;

	// �� 5 �ϐ������l�F i_h_MaxLevel


	final static String i_h_MaxLevel = null;

	// �� 6 �ϐ������l�F i_AE0090040tree1


	final static String i_AE0090040tree1 = null;

	// �� 7 �ϐ������l�F i_id


	final static String i_id = null;

	// �� 8 �ϐ������l�F i_lvl


	final static String i_lvl = null;

	// �� 9 �ϐ������l�F i_parent


	final static String i_parent = null;

	// �� 10 �ϐ������l�F i_label


	final static String i_label = null;

	// �� 11 �ϐ������l�F i_ctx


	final static String i_ctx = null;

	// �� 12 �ϐ������l�F i_maxid


	final static String i_maxid = null;

	// �� 13 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 14 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 15 �ϐ������l�F i_NEED_QTY_1


	final static String i_NEED_QTY_1 = null;

	// �� 16 �ϐ������l�F i_Det_Comp_Need_QTY


	final static String i_Det_Comp_Need_QTY = null;

	// �� 17 �ϐ������l�F i_Upper_ITEM_NAME


	final static String i_Upper_ITEM_NAME = null;

	// �� 18 �ϐ������l�F i_Det_Comp_ONHAND_QTY


	final static String i_Det_Comp_ONHAND_QTY = null;

	// �� 19 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 20 �ϐ������l�F i_NO


	final static String i_NO = null;

	// �� 21 �ϐ������l�F i_NEED_QTY


	final static String i_NEED_QTY = null;

	// �� 22 �ϐ������l�F i_UNIT_QTY


	final static String i_UNIT_QTY = null;

	// �� 23 �ϐ������l�F i_IN_UNIT_1


	final static String i_IN_UNIT_1 = null;

	// �� 24 �ϐ������l�F i_IN_UNIT_2


	final static String i_IN_UNIT_2 = null;

	// �� 25 �ϐ������l�F i_h_DEVELOP_TYP


	final static String i_h_DEVELOP_TYP = null;

	// �� 26 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 27 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 28 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER1


	final static String i_RECEIPT_SCHEDULES_NUMBER1 = null;

	// �� 29 �ϐ������l�F i_Lower_ITEM_CD


	final static String i_Lower_ITEM_CD = null;

	// �� 30 �ϐ������l�F i_TERM2STARTDATE


	final static String i_TERM2STARTDATE = null;

	// �� 31 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER2


	final static String i_RECEIPT_SCHEDULES_NUMBER2 = null;

	// �� 32 �ϐ������l�F i_RECEIPT_SCHEDULES_TERM


	final static String i_RECEIPT_SCHEDULES_TERM = null;

	// �� 33 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER


	final static String i_RECEIPT_SCHEDULES_NUMBER = null;

	// �� 34 �ϐ������l�F i_Lower_ITEM_NAME


	final static String i_Lower_ITEM_NAME = null;

	// �� 35 �ϐ������l�F i_Det_Parent_ITEM_CD


	final static String i_Det_Parent_ITEM_CD = null;

	// �� 36 �ϐ������l�F i_Det_Parent_ITEM_NAME


	final static String i_Det_Parent_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_Det_Comp_ITEM_CD


	final static String i_Det_Comp_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_Det_Comp_ITEM_NAME


	final static String i_Det_Comp_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_Det_Comp_STOCK_UNIT


	final static String i_Det_Comp_STOCK_UNIT = null;

	// �� 40 �ϐ������l�F i_Det_Comp_PRODUCT_TYP


	final static String i_Det_Comp_PRODUCT_TYP = null;

	// �� 41 �ϐ������l�F i_Det_Comp_MRP_ODR_TYP


	final static String i_Det_Comp_MRP_ODR_TYP = null;

	// �� 42 �ϐ������l�F i_Det_Comp_OUTSIDE_TYP


	final static String i_Det_Comp_OUTSIDE_TYP = null;

	// �� 43 �ϐ������l�F i_Det_Comp_PS_UNIT_QTY


	final static String i_Det_Comp_PS_UNIT_QTY = null;

	// �� 44 �ϐ������l�F i_Det_Comp_ITEM_SPOIL


	final static String i_Det_Comp_ITEM_SPOIL = null;

	// �� 45 �ϐ������l�F i_Det_Comp_EFF_PHASE_IN_DATE


	final static String i_Det_Comp_EFF_PHASE_IN_DATE = null;

	// �� 46 �ϐ������l�F i_Det_Comp_EFF_PHASE_OUT_DATE


	final static String i_Det_Comp_EFF_PHASE_OUT_DATE = null;

	// �� 47 �ϐ������l�F i_Det_Comp_PS_SPOIL


	final static String i_Det_Comp_PS_SPOIL = null;

	// �� 48 �ϐ������l�F i_Det_Comp_CONS_TYP


	final static String i_Det_Comp_CONS_TYP = null;

	// �� 49 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 50 �ϐ������l�F i_ONHAND_STOCK


	final static String i_ONHAND_STOCK = null;

	// �� 51 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 52 �ϐ������l�F i_Lower_NEED_QTY


	final static String i_Lower_NEED_QTY = null;

	// �� 53 �ϐ������l�F i_Upper_NEED_QTY


	final static String i_Upper_NEED_QTY = null;

	// �� 54 �ϐ������l�F i_Upper_ITEM_CD


	final static String i_Upper_ITEM_CD = null;

	// �� 55 �ϐ������l�F i_Target_ITEM_CD


	final static String i_Target_ITEM_CD = null;

	// �� 56 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 57 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 58 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 59 �ϐ������l�F i_NUMERATOR


	final static String i_NUMERATOR = null;

	// �� 60 �ϐ������l�F i_DENOMINATOR


	final static String i_DENOMINATOR = null;

	// �� 61 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 62 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 63 �ϐ������l�F i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// �� 64 �ϐ������l�F i_TargetDate


	final static String i_TargetDate = null;

	// �� 65 �ϐ������l�F i_COMP_ITEM_NAME


	final static String i_COMP_ITEM_NAME = null;

	// �� 66 �ϐ������l�F i_ITEM_CD_VIEW


	final static String i_ITEM_CD_VIEW = null;

	// �� 67 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_Target_ITEM_CD

	final static String i_Target_ITEM_CD = null;

	// �� 2 �ϐ������l�F i_DEVELOP_TYP

	final static String i_DEVELOP_TYP = null;

	// �� 3 �ϐ������l�F i_DEVELOP_TYP_name

	final static String i_DEVELOP_TYP_name = null;

	// �� 4 �ϐ������l�F i_DEVELOP_TYP_val

	final static String i_DEVELOP_TYP_val = null;

	// �� 5 �ϐ������l�F i_TargetDate

	final static String i_TargetDate = null;

	// �� 6 �ϐ������l�F i_InitLevel

	final static String i_InitLevel = null;

	// �� 7 �ϐ������l�F i_h_MaxLevel

	final static String i_h_MaxLevel = null;

	// �� 8 �ϐ������l�F i_h_ProcTyp

	final static String i_h_ProcTyp = null;

	// �� 9 �ϐ������l�F i_AE0090040tree1

	final static String i_AE0090040tree1 = null;

	// �� 10 �ϐ������l�F i_id

	final static String i_id = null;

	// �� 11 �ϐ������l�F i_lvl

	final static String i_lvl = null;

	// �� 12 �ϐ������l�F i_parent

	final static String i_parent = null;

	// �� 13 �ϐ������l�F i_label

	final static String i_label = null;

	// �� 14 �ϐ������l�F i_ctx

	final static String i_ctx = null;

	// �� 15 �ϐ������l�F i_maxid

	final static String i_maxid = null;

	// �� 16 �ϐ������l�F i_Upper_ITEM_CD

	final static String i_Upper_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 18 �ϐ������l�F i_EFF_PHASE_OUT_DATE

	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 19 �ϐ������l�F i_NEED_QTY_1

	final static String i_NEED_QTY_1 = null;

	// �� 20 �ϐ������l�F i_Upper_ITEM_NAME

	final static String i_Upper_ITEM_NAME = null;

	// �� 21 �ϐ������l�F i_Det_Comp_ONHAND_QTY

	final static String i_Det_Comp_ONHAND_QTY = null;

	// �� 22 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 23 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 24 �ϐ������l�F i_ITEM_STOCK

	final static String i_ITEM_STOCK = null;

	// �� 25 �ϐ������l�F i_JOB_STOCK

	final static String i_JOB_STOCK = null;

	// �� 26 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER1

	final static String i_RECEIPT_SCHEDULES_NUMBER1 = null;

	// �� 27 �ϐ������l�F i_TERM2STARTDATE

	final static String i_TERM2STARTDATE = null;

	// �� 28 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER2

	final static String i_RECEIPT_SCHEDULES_NUMBER2 = null;

	// �� 29 �ϐ������l�F i_RECEIPT_SCHEDULES_TERM

	final static String i_RECEIPT_SCHEDULES_TERM = null;

	// �� 30 �ϐ������l�F i_BUSSINESS_OPR_DATE

	final static String i_BUSSINESS_OPR_DATE = null;

	// �� 31 �ϐ������l�F i_RECEIPT_SCHEDULES_NUMBER

	final static String i_RECEIPT_SCHEDULES_NUMBER = null;

	// �� 32 �ϐ������l�F i_Lower_ITEM_NAME

	final static String i_Lower_ITEM_NAME = null;

	// �� 33 �ϐ������l�F i_Lower_ITEM_CD

	final static String i_Lower_ITEM_CD = null;

	// �� 34 �ϐ������l�F i_Det_Parent_ITEM_CD

	final static String i_Det_Parent_ITEM_CD = null;

	// �� 35 �ϐ������l�F i_Det_Parent_ITEM_NAME

	final static String i_Det_Parent_ITEM_NAME = null;

	// �� 36 �ϐ������l�F i_Det_Comp_MRP_ODR_TYP

	final static String i_Det_Comp_MRP_ODR_TYP = null;

	// �� 37 �ϐ������l�F i_Det_Comp_OUTSIDE_TYP

	final static String i_Det_Comp_OUTSIDE_TYP = null;

	// �� 38 �ϐ������l�F i_Det_Comp_ITEM_CD

	final static String i_Det_Comp_ITEM_CD = null;

	// �� 39 �ϐ������l�F i_Det_Comp_ITEM_NAME

	final static String i_Det_Comp_ITEM_NAME = null;

	// �� 40 �ϐ������l�F i_Det_Comp_Need_QTY

	final static String i_Det_Comp_Need_QTY = null;

	// �� 41 �ϐ������l�F i_Det_Comp_STOCK_UNIT

	final static String i_Det_Comp_STOCK_UNIT = null;

	// �� 42 �ϐ������l�F i_Det_Comp_PRODUCT_TYP

	final static String i_Det_Comp_PRODUCT_TYP = null;

	// �� 43 �ϐ������l�F i_Det_Comp_PS_UNIT_QTY

	final static String i_Det_Comp_PS_UNIT_QTY = null;

	// �� 44 �ϐ������l�F i_Det_Comp_ITEM_SPOIL

	final static String i_Det_Comp_ITEM_SPOIL = null;

	// �� 45 �ϐ������l�F i_Det_Comp_EFF_PHASE_IN_DATE

	final static String i_Det_Comp_EFF_PHASE_IN_DATE = null;

	// �� 46 �ϐ������l�F i_Det_Comp_EFF_PHASE_OUT_DATE

	final static String i_Det_Comp_EFF_PHASE_OUT_DATE = null;

	// �� 47 �ϐ������l�F i_Det_Comp_PS_SPOIL

	final static String i_Det_Comp_PS_SPOIL = null;

	// �� 48 �ϐ������l�F i_Det_Comp_CONS_TYP

	final static String i_Det_Comp_CONS_TYP = null;

	// �� 49 �ϐ������l�F i_PS_EDITION

	final static String i_PS_EDITION = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{


		m_Target_ITEM_CD = i_Target_ITEM_CD;
		m_DEVELOP_TYP = i_DEVELOP_TYP;
		m_DEVELOP_TYP_name = i_DEVELOP_TYP_name;
		m_DEVELOP_TYP_val = i_DEVELOP_TYP_val;
		m_TargetDate = i_TargetDate;
		m_InitLevel = i_InitLevel;
		m_h_MaxLevel = i_h_MaxLevel;
		m_AE0090040tree1 = i_AE0090040tree1;
		m_id = i_id;
		m_lvl = i_lvl;
		m_parent = i_parent;
		m_label = i_label;
		m_ctx = i_ctx;
		m_maxid = i_maxid;
		m_Upper_ITEM_CD = i_Upper_ITEM_CD;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
		m_NEED_QTY_1 = i_NEED_QTY_1;
		m_Upper_ITEM_NAME = i_Upper_ITEM_NAME;
		m_Det_Comp_ONHAND_QTY = i_Det_Comp_ONHAND_QTY;
		m_PLANT_NAME = i_PLANT_NAME;
		m_PLANT_CD = i_PLANT_CD;
		m_RECEIPT_SCHEDULES_NUMBER1 = i_RECEIPT_SCHEDULES_NUMBER1;
		m_TERM2STARTDATE = i_TERM2STARTDATE;
		m_RECEIPT_SCHEDULES_NUMBER2 = i_RECEIPT_SCHEDULES_NUMBER2;
		m_RECEIPT_SCHEDULES_TERM = i_RECEIPT_SCHEDULES_TERM;
		m_RECEIPT_SCHEDULES_NUMBER = i_RECEIPT_SCHEDULES_NUMBER;
		m_Lower_ITEM_NAME = i_Lower_ITEM_NAME;
		m_Lower_ITEM_CD = i_Lower_ITEM_CD;
		m_Det_Parent_ITEM_CD = i_Det_Parent_ITEM_CD;
		m_Det_Parent_ITEM_NAME = i_Det_Parent_ITEM_NAME;
		m_Det_Comp_MRP_ODR_TYP = i_Det_Comp_MRP_ODR_TYP;
		m_Det_Comp_OUTSIDE_TYP = i_Det_Comp_OUTSIDE_TYP;
		m_Det_Comp_ITEM_CD = i_Det_Comp_ITEM_CD;
		m_Det_Comp_ITEM_NAME = i_Det_Comp_ITEM_NAME;
		m_Det_Comp_Need_QTY = i_Det_Comp_Need_QTY;
		m_Det_Comp_STOCK_UNIT = i_Det_Comp_STOCK_UNIT;
		m_Det_Comp_PRODUCT_TYP = i_Det_Comp_PRODUCT_TYP;
		m_Det_Comp_PS_UNIT_QTY = i_Det_Comp_PS_UNIT_QTY;
		m_Det_Comp_ITEM_SPOIL = i_Det_Comp_ITEM_SPOIL;
		m_Det_Comp_EFF_PHASE_IN_DATE = i_Det_Comp_EFF_PHASE_IN_DATE;
		m_Det_Comp_EFF_PHASE_OUT_DATE = i_Det_Comp_EFF_PHASE_OUT_DATE;
		m_Det_Comp_PS_SPOIL = i_Det_Comp_PS_SPOIL;
		m_Det_Comp_CONS_TYP = i_Det_Comp_CONS_TYP;
		m_PS_EDITION = i_PS_EDITION;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
