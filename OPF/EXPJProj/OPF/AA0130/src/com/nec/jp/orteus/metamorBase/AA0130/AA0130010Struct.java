/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/src/com/nec/jp/orteus/metamorBase/AA0130/AA0130010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0130;

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

public class AA0130010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_Target_ITEM_CD */
	public String m_Target_ITEM_CD = null;
	/** �� 2 �ϐ��F m_DEVELOP_TYP */
	public String m_DEVELOP_TYP = null;
	/** �� 3 �ϐ��F m_InitLevel */
	public String m_InitLevel = null;
	/** �� 4 �ϐ��F m_AA0130010tree1 */
	public String m_AA0130010tree1 = null;
	/** �� 5 �ϐ��F m_id */
	public String m_id = null;
	/** �� 6 �ϐ��F m_lvl */
	public String m_lvl = null;
	/** �� 7 �ϐ��F m_parent */
	public String m_parent = null;
	/** �� 8 �ϐ��F m_label */
	public String m_label = null;
	/** �� 9 �ϐ��F m_ctx */
	public String m_ctx = null;
	/** �� 10 �ϐ��F m_maxid */
	public String m_maxid = null;
	/** �� 11 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 12 �ϐ��F m_TargetDate */
	public String m_TargetDate = null;
	/** �� 13 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 14 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 15 �ϐ��F m_h_Sub1Parent_ITEM_CD */
	public String m_h_Sub1Parent_ITEM_CD = null;
	/** �� 16 �ϐ��F m_h_Sub1Comp_ITEM_CD */
	public String m_h_Sub1Comp_ITEM_CD = null;
	/** �� 17 �ϐ��F m_h_Target_ITEM_CD */
	public String m_h_Target_ITEM_CD = null;
	/** �� 18 �ϐ��F m_h_TargetDate */
	public String m_h_TargetDate = null;
	/** �� 19 �ϐ��F m_h_DEVELOP_TYP */
	public String m_h_DEVELOP_TYP = null;
	/** �� 20 �ϐ��F m_h_InitLevel */
	public String m_h_InitLevel = null;
	/** �� 21 �ϐ��F m_h_Sub1_PS_EDITION */
	public String m_h_Sub1_PS_EDITION = null;
	/** �� 22 �ϐ��F m_DEVELOP_TYP_name */
	public String m_DEVELOP_TYP_name = null;
	/** �� 23 �ϐ��F m_DEVELOP_TYP_val */
	public String m_DEVELOP_TYP_val = null;
	/** �� 24 �ϐ��F m_Sub1_CONS_TYP_name */
	public String m_Sub1_CONS_TYP_name = null;
	/** �� 25 �ϐ��F m_Sub1_CONS_TYP_val */
	public String m_Sub1_CONS_TYP_val = null;
	/** �� 26 �ϐ��F m_c_Sub1_PS_LT_FLG */
	public String m_c_Sub1_PS_LT_FLG = null;
	/** �� 27 �ϐ��F m_Sub1_COST_UP_TYP_name */
	public String m_Sub1_COST_UP_TYP_name = null;
	/** �� 28 �ϐ��F m_Sub1_COST_UP_TYP_val */
	public String m_Sub1_COST_UP_TYP_val = null;
	/** �� 29 �ϐ��F m_Sub1_MRP_EXP_TYP_name */
	public String m_Sub1_MRP_EXP_TYP_name = null;
	/** �� 30 �ϐ��F m_Sub1_MRP_EXP_TYP_val */
	public String m_Sub1_MRP_EXP_TYP_val = null;
	/** �� 31 �ϐ��F m_h_ProcTyp */
	public String m_h_ProcTyp = null;
	/** �� 32 �ϐ��F m_h_MaxLevel */
	public String m_h_MaxLevel = null;
	/** �� 33 �ϐ��F m_Lower_ITEM_NAME */
	public String m_Lower_ITEM_NAME = null;
	/** �� 34 �ϐ��F m_Lower_ITEM_CD */
	public String m_Lower_ITEM_CD = null;
	/** �� 35 �ϐ��F m_Upper_ITEM_NAME */
	public String m_Upper_ITEM_NAME = null;
	/** �� 36 �ϐ��F m_Upper_ITEM_CD */
	public String m_Upper_ITEM_CD = null;
	/** �� 37 �ϐ��F m_DetParent_ITEM_CD */
	public String m_DetParent_ITEM_CD = null;
	/** �� 38 �ϐ��F m_DetParent_ITEM_NAME */
	public String m_DetParent_ITEM_NAME = null;
	/** �� 39 �ϐ��F m_DetParent_MRP_ODR_TYP */
	public String m_DetParent_MRP_ODR_TYP = null;
	/** �� 40 �ϐ��F m_DetParent_OUTSIDE_TYP */
	public String m_DetParent_OUTSIDE_TYP = null;
	/** �� 41 �ϐ��F m_DetComp_ITEM_CD */
	public String m_DetComp_ITEM_CD = null;
	/** �� 42 �ϐ��F m_DetComp_ITEM_NAME */
	public String m_DetComp_ITEM_NAME = null;
	/** �� 43 �ϐ��F m_DetComp_MRP_ODR_TYP */
	public String m_DetComp_MRP_ODR_TYP = null;
	/** �� 44 �ϐ��F m_DetComp_OUTSIDE_TYP */
	public String m_DetComp_OUTSIDE_TYP = null;
	/** �� 45 �ϐ��F m_Det_MANHOUR_TYP */
	public String m_Det_MANHOUR_TYP = null;
	/** �� 46 �ϐ��F m_Det_PS_EDITION */
	public String m_Det_PS_EDITION = null;
	/** �� 47 �ϐ��F m_Det_PS_UNIT_QTY */
	public String m_Det_PS_UNIT_QTY = null;
	/** �� 48 �ϐ��F m_Det_STOCK_UNIT */
	public String m_Det_STOCK_UNIT = null;
	/** �� 49 �ϐ��F m_Det_EFF_PHASE_IN_DATE */
	public String m_Det_EFF_PHASE_IN_DATE = null;
	/** �� 50 �ϐ��F m_Det_EFF_PHASE_OUT_DATE */
	public String m_Det_EFF_PHASE_OUT_DATE = null;
	/** �� 51 �ϐ��F m_Det_PS_SPOIL */
	public String m_Det_PS_SPOIL = null;
	/** �� 52 �ϐ��F m_Det_CONS_TYP */
	public String m_Det_CONS_TYP = null;
	/** �� 53 �ϐ��F m_Det_PS_LT_FLG */
	public String m_Det_PS_LT_FLG = null;
	/** �� 54 �ϐ��F m_Det_PS_FIXED_LT */
	public String m_Det_PS_FIXED_LT = null;
	/** �� 55 �ϐ��F m_Det_PS_PROP_LT */
	public String m_Det_PS_PROP_LT = null;
	/** �� 56 �ϐ��F m_Det_PS_PROP_LOT_SIZE */
	public String m_Det_PS_PROP_LOT_SIZE = null;
	/** �� 57 �ϐ��F m_Det_PS_REF_NO */
	public String m_Det_PS_REF_NO = null;
	/** �� 58 �ϐ��F m_Det_COST_UP_TYP */
	public String m_Det_COST_UP_TYP = null;
	/** �� 59 �ϐ��F m_Det_MRP_EXP_TYP */
	public String m_Det_MRP_EXP_TYP = null;
	/** �� 60 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 61 �ϐ��F m_Sub1Parent_ITEM_NAME */
	public String m_Sub1Parent_ITEM_NAME = null;
	/** �� 62 �ϐ��F m_Sub1Comp_ITEM_NAME */
	public String m_Sub1Comp_ITEM_NAME = null;
	/** �� 63 �ϐ��F m_Sub1_PS_UNIT_NUMERATOR */
	public String m_Sub1_PS_UNIT_NUMERATOR = null;
	/** �� 64 �ϐ��F m_Sub1_PS_UNIT_DENOMINATOR */
	public String m_Sub1_PS_UNIT_DENOMINATOR = null;
	/** �� 65 �ϐ��F m_Sub1_STOCK_UNIT */
	public String m_Sub1_STOCK_UNIT = null;
	/** �� 66 �ϐ��F m_Sub1Comp_STOCK_UNIT */
	public String m_Sub1Comp_STOCK_UNIT = null;
	/** �� 67 �ϐ��F m_Sub1_EFF_PHASE_IN_DATE */
	public String m_Sub1_EFF_PHASE_IN_DATE = null;
	/** �� 68 �ϐ��F m_Sub1_EFF_PHASE_OUT_DATE */
	public String m_Sub1_EFF_PHASE_OUT_DATE = null;
	/** �� 69 �ϐ��F m_Sub1_PS_SPOIL */
	public String m_Sub1_PS_SPOIL = null;
	/** �� 70 �ϐ��F m_Sub1_CONS_TYP */
	public String m_Sub1_CONS_TYP = null;
	/** �� 71 �ϐ��F m_h_Sub1_PS_LT_FLG */
	public String m_h_Sub1_PS_LT_FLG = null;
	/** �� 72 �ϐ��F m_Sub1_PS_FIXED_LT */
	public String m_Sub1_PS_FIXED_LT = null;
	/** �� 73 �ϐ��F m_Sub1_PS_PROP_LT */
	public String m_Sub1_PS_PROP_LT = null;
	/** �� 74 �ϐ��F m_Sub1_PS_PROP_LOT_SIZE */
	public String m_Sub1_PS_PROP_LOT_SIZE = null;
	/** �� 75 �ϐ��F m_Sub1_PS_REF_NO */
	public String m_Sub1_PS_REF_NO = null;
	/** �� 76 �ϐ��F m_Sub1_COST_UP_TYP */
	public String m_Sub1_COST_UP_TYP = null;
	/** �� 77 �ϐ��F m_Sub1_MRP_EXP_TYP */
	public String m_Sub1_MRP_EXP_TYP = null;
	/** �� 78 �ϐ��F m_h_Sub1_MODIFY_COUNT */
	public String m_h_Sub1_MODIFY_COUNT = null;
	/** �� 79 �ϐ��F m_Sub1Parent_ITEM_CD */
	public String m_Sub1Parent_ITEM_CD = null;
	/** �� 80 �ϐ��F m_Sub1Comp_ITEM_CD */
	public String m_Sub1Comp_ITEM_CD = null;
	/** �� 81 �ϐ��F m_Sub1_PS_EDITION */
	public String m_Sub1_PS_EDITION = null;
	/** �� 82 �ϐ��F m_Sub1_Pvalue */
	public String m_Sub1_Pvalue = null;
	/** �� 83 �ϐ��F m_Sub1_Pname */
	public String m_Sub1_Pname = null;
	/** �� 84 �ϐ��F m_Sub1_PLANT */
	public String m_Sub1_PLANT = null;
	/** �� 85 �ϐ��F m_Sub1_USER_CD */
	public String m_Sub1_USER_CD = null;
	/** �� 86 �ϐ��F m_Sub1_BUSINESS_DATE */
	public String m_Sub1_BUSINESS_DATE = null;
	/** �� 87 �ϐ��F m_Lower_MANHOUR_TYP */
	public String m_Lower_MANHOUR_TYP = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_Target_ITEM_CD */
	public List l_Target_ITEM_CD = null;

	/** �� 2 List�ϐ��F l_DEVELOP_TYP */
	public List l_DEVELOP_TYP = null;

	/** �� 3 List�ϐ��F l_InitLevel */
	public List l_InitLevel = null;

	/** �� 4 List�ϐ��F l_AA0130010tree1 */
	public List l_AA0130010tree1 = null;

	/** �� 5 List�ϐ��F l_id */
	public List l_id = null;

	/** �� 6 List�ϐ��F l_lvl */
	public List l_lvl = null;

	/** �� 7 List�ϐ��F l_parent */
	public List l_parent = null;

	/** �� 8 List�ϐ��F l_label */
	public List l_label = null;

	/** �� 9 List�ϐ��F l_ctx */
	public List l_ctx = null;

	/** �� 10 List�ϐ��F l_maxid */
	public List l_maxid = null;

	/** �� 11 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 12 List�ϐ��F l_TargetDate */
	public List l_TargetDate = null;

	/** �� 13 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 14 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 15 List�ϐ��F l_h_Sub1Parent_ITEM_CD */
	public List l_h_Sub1Parent_ITEM_CD = null;

	/** �� 16 List�ϐ��F l_h_Sub1Comp_ITEM_CD */
	public List l_h_Sub1Comp_ITEM_CD = null;

	/** �� 17 List�ϐ��F l_h_Target_ITEM_CD */
	public List l_h_Target_ITEM_CD = null;

	/** �� 18 List�ϐ��F l_h_TargetDate */
	public List l_h_TargetDate = null;

	/** �� 19 List�ϐ��F l_h_DEVELOP_TYP */
	public List l_h_DEVELOP_TYP = null;

	/** �� 20 List�ϐ��F l_h_InitLevel */
	public List l_h_InitLevel = null;

	/** �� 21 List�ϐ��F l_h_Sub1_PS_EDITION */
	public List l_h_Sub1_PS_EDITION = null;

	/** �� 22 List�ϐ��F l_DEVELOP_TYP_name */
	public List l_DEVELOP_TYP_name = null;

	/** �� 23 List�ϐ��F l_DEVELOP_TYP_val */
	public List l_DEVELOP_TYP_val = null;

	/** �� 24 List�ϐ��F l_Sub1_CONS_TYP_name */
	public List l_Sub1_CONS_TYP_name = null;

	/** �� 25 List�ϐ��F l_Sub1_CONS_TYP_val */
	public List l_Sub1_CONS_TYP_val = null;

	/** �� 26 List�ϐ��F l_c_Sub1_PS_LT_FLG */
	public List l_c_Sub1_PS_LT_FLG = null;

	/** �� 27 List�ϐ��F l_Sub1_COST_UP_TYP_name */
	public List l_Sub1_COST_UP_TYP_name = null;

	/** �� 28 List�ϐ��F l_Sub1_COST_UP_TYP_val */
	public List l_Sub1_COST_UP_TYP_val = null;

	/** �� 29 List�ϐ��F l_Sub1_MRP_EXP_TYP_name */
	public List l_Sub1_MRP_EXP_TYP_name = null;

	/** �� 30 List�ϐ��F l_Sub1_MRP_EXP_TYP_val */
	public List l_Sub1_MRP_EXP_TYP_val = null;

	/** �� 31 List�ϐ��F l_h_ProcTyp */
	public List l_h_ProcTyp = null;

	/** �� 32 List�ϐ��F l_h_MaxLevel */
	public List l_h_MaxLevel = null;

	/** �� 33 List�ϐ��F l_Lower_ITEM_NAME */
	public List l_Lower_ITEM_NAME = null;

	/** �� 34 List�ϐ��F l_Lower_ITEM_CD */
	public List l_Lower_ITEM_CD = null;

	/** �� 35 List�ϐ��F l_Upper_ITEM_NAME */
	public List l_Upper_ITEM_NAME = null;

	/** �� 36 List�ϐ��F l_Upper_ITEM_CD */
	public List l_Upper_ITEM_CD = null;

	/** �� 37 List�ϐ��F l_DetParent_ITEM_CD */
	public List l_DetParent_ITEM_CD = null;

	/** �� 38 List�ϐ��F l_DetParent_ITEM_NAME */
	public List l_DetParent_ITEM_NAME = null;

	/** �� 39 List�ϐ��F l_DetParent_MRP_ODR_TYP */
	public List l_DetParent_MRP_ODR_TYP = null;

	/** �� 40 List�ϐ��F l_DetParent_OUTSIDE_TYP */
	public List l_DetParent_OUTSIDE_TYP = null;

	/** �� 41 List�ϐ��F l_DetComp_ITEM_CD */
	public List l_DetComp_ITEM_CD = null;

	/** �� 42 List�ϐ��F l_DetComp_ITEM_NAME */
	public List l_DetComp_ITEM_NAME = null;

	/** �� 43 List�ϐ��F l_DetComp_MRP_ODR_TYP */
	public List l_DetComp_MRP_ODR_TYP = null;

	/** �� 44 List�ϐ��F l_DetComp_OUTSIDE_TYP */
	public List l_DetComp_OUTSIDE_TYP = null;

	/** �� 45 List�ϐ��F l_Det_MANHOUR_TYP */
	public List l_Det_MANHOUR_TYP = null;

	/** �� 46 List�ϐ��F l_Det_PS_EDITION */
	public List l_Det_PS_EDITION = null;

	/** �� 47 List�ϐ��F l_Det_PS_UNIT_QTY */
	public List l_Det_PS_UNIT_QTY = null;

	/** �� 48 List�ϐ��F l_Det_STOCK_UNIT */
	public List l_Det_STOCK_UNIT = null;

	/** �� 49 List�ϐ��F l_Det_EFF_PHASE_IN_DATE */
	public List l_Det_EFF_PHASE_IN_DATE = null;

	/** �� 50 List�ϐ��F l_Det_EFF_PHASE_OUT_DATE */
	public List l_Det_EFF_PHASE_OUT_DATE = null;

	/** �� 51 List�ϐ��F l_Det_PS_SPOIL */
	public List l_Det_PS_SPOIL = null;

	/** �� 52 List�ϐ��F l_Det_CONS_TYP */
	public List l_Det_CONS_TYP = null;

	/** �� 53 List�ϐ��F l_Det_PS_LT_FLG */
	public List l_Det_PS_LT_FLG = null;

	/** �� 54 List�ϐ��F l_Det_PS_FIXED_LT */
	public List l_Det_PS_FIXED_LT = null;

	/** �� 55 List�ϐ��F l_Det_PS_PROP_LT */
	public List l_Det_PS_PROP_LT = null;

	/** �� 56 List�ϐ��F l_Det_PS_PROP_LOT_SIZE */
	public List l_Det_PS_PROP_LOT_SIZE = null;

	/** �� 57 List�ϐ��F l_Det_PS_REF_NO */
	public List l_Det_PS_REF_NO = null;

	/** �� 58 List�ϐ��F l_Det_COST_UP_TYP */
	public List l_Det_COST_UP_TYP = null;

	/** �� 59 List�ϐ��F l_Det_MRP_EXP_TYP */
	public List l_Det_MRP_EXP_TYP = null;

	/** �� 60 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 61 List�ϐ��F l_Sub1Parent_ITEM_NAME */
	public List l_Sub1Parent_ITEM_NAME = null;

	/** �� 62 List�ϐ��F l_Sub1Comp_ITEM_NAME */
	public List l_Sub1Comp_ITEM_NAME = null;

	/** �� 63 List�ϐ��F l_Sub1_PS_UNIT_NUMERATOR */
	public List l_Sub1_PS_UNIT_NUMERATOR = null;

	/** �� 64 List�ϐ��F l_Sub1_PS_UNIT_DENOMINATOR */
	public List l_Sub1_PS_UNIT_DENOMINATOR = null;

	/** �� 65 List�ϐ��F l_Sub1_STOCK_UNIT */
	public List l_Sub1_STOCK_UNIT = null;

	/** �� 66 List�ϐ��F l_Sub1Comp_STOCK_UNIT */
	public List l_Sub1Comp_STOCK_UNIT = null;

	/** �� 67 List�ϐ��F l_Sub1_EFF_PHASE_IN_DATE */
	public List l_Sub1_EFF_PHASE_IN_DATE = null;

	/** �� 68 List�ϐ��F l_Sub1_EFF_PHASE_OUT_DATE */
	public List l_Sub1_EFF_PHASE_OUT_DATE = null;

	/** �� 69 List�ϐ��F l_Sub1_PS_SPOIL */
	public List l_Sub1_PS_SPOIL = null;

	/** �� 70 List�ϐ��F l_Sub1_CONS_TYP */
	public List l_Sub1_CONS_TYP = null;

	/** �� 71 List�ϐ��F l_h_Sub1_PS_LT_FLG */
	public List l_h_Sub1_PS_LT_FLG = null;

	/** �� 72 List�ϐ��F l_Sub1_PS_FIXED_LT */
	public List l_Sub1_PS_FIXED_LT = null;

	/** �� 73 List�ϐ��F l_Sub1_PS_PROP_LT */
	public List l_Sub1_PS_PROP_LT = null;

	/** �� 74 List�ϐ��F l_Sub1_PS_PROP_LOT_SIZE */
	public List l_Sub1_PS_PROP_LOT_SIZE = null;

	/** �� 75 List�ϐ��F l_Sub1_PS_REF_NO */
	public List l_Sub1_PS_REF_NO = null;

	/** �� 76 List�ϐ��F l_Sub1_COST_UP_TYP */
	public List l_Sub1_COST_UP_TYP = null;

	/** �� 77 List�ϐ��F l_Sub1_MRP_EXP_TYP */
	public List l_Sub1_MRP_EXP_TYP = null;

	/** �� 78 List�ϐ��F l_h_Sub1_MODIFY_COUNT */
	public List l_h_Sub1_MODIFY_COUNT = null;

	/** �� 79 List�ϐ��F l_Sub1Parent_ITEM_CD */
	public List l_Sub1Parent_ITEM_CD = null;

	/** �� 80 List�ϐ��F l_Sub1Comp_ITEM_CD */
	public List l_Sub1Comp_ITEM_CD = null;

	/** �� 81 List�ϐ��F l_Sub1_PS_EDITION */
	public List l_Sub1_PS_EDITION = null;

	/** �� 82 List�ϐ��F l_Sub1_Pvalue */
	public List l_Sub1_Pvalue = null;

	/** �� 83 List�ϐ��F l_Sub1_Pname */
	public List l_Sub1_Pname = null;

	/** �� 84 List�ϐ��F l_Sub1_PLANT */
	public List l_Sub1_PLANT = null;

	/** �� 85 List�ϐ��F l_Sub1_USER_CD */
	public List l_Sub1_USER_CD = null;

	/** �� 86 List�ϐ��F l_Sub1_BUSINESS_DATE */
	public List l_Sub1_BUSINESS_DATE = null;

	/** �� 87 List�ϐ��F l_Lower_MANHOUR_TYP */
	public List l_Lower_MANHOUR_TYP = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getTarget_ITEM_CD() { return m_Target_ITEM_CD; }
	public String getDEVELOP_TYP() { return m_DEVELOP_TYP; }
	public String getInitLevel() { return m_InitLevel; }
	public String getAA0130010tree1() { return m_AA0130010tree1; }
	public String getid() { return m_id; }
	public String getlvl() { return m_lvl; }
	public String getparent() { return m_parent; }
	public String getlabel() { return m_label; }
	public String getctx() { return m_ctx; }
	public String getmaxid() { return m_maxid; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTargetDate() { return m_TargetDate; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String geth_Sub1Parent_ITEM_CD() { return m_h_Sub1Parent_ITEM_CD; }
	public String geth_Sub1Comp_ITEM_CD() { return m_h_Sub1Comp_ITEM_CD; }
	public String geth_Target_ITEM_CD() { return m_h_Target_ITEM_CD; }
	public String geth_TargetDate() { return m_h_TargetDate; }
	public String geth_DEVELOP_TYP() { return m_h_DEVELOP_TYP; }
	public String geth_InitLevel() { return m_h_InitLevel; }
	public String geth_Sub1_PS_EDITION() { return m_h_Sub1_PS_EDITION; }
	public String getDEVELOP_TYP_name() { return m_DEVELOP_TYP_name; }
	public String getDEVELOP_TYP_val() { return m_DEVELOP_TYP_val; }
	public String getSub1_CONS_TYP_name() { return m_Sub1_CONS_TYP_name; }
	public String getSub1_CONS_TYP_val() { return m_Sub1_CONS_TYP_val; }
	public String getc_Sub1_PS_LT_FLG() { return m_c_Sub1_PS_LT_FLG; }
	public String getSub1_COST_UP_TYP_name() { return m_Sub1_COST_UP_TYP_name; }
	public String getSub1_COST_UP_TYP_val() { return m_Sub1_COST_UP_TYP_val; }
	public String getSub1_MRP_EXP_TYP_name() { return m_Sub1_MRP_EXP_TYP_name; }
	public String getSub1_MRP_EXP_TYP_val() { return m_Sub1_MRP_EXP_TYP_val; }
	public String geth_ProcTyp() { return m_h_ProcTyp; }
	public String geth_MaxLevel() { return m_h_MaxLevel; }
	public String getLower_ITEM_NAME() { return m_Lower_ITEM_NAME; }
	public String getLower_ITEM_CD() { return m_Lower_ITEM_CD; }
	public String getUpper_ITEM_NAME() { return m_Upper_ITEM_NAME; }
	public String getUpper_ITEM_CD() { return m_Upper_ITEM_CD; }
	public String getDetParent_ITEM_CD() { return m_DetParent_ITEM_CD; }
	public String getDetParent_ITEM_NAME() { return m_DetParent_ITEM_NAME; }
	public String getDetParent_MRP_ODR_TYP() { return m_DetParent_MRP_ODR_TYP; }
	public String getDetParent_OUTSIDE_TYP() { return m_DetParent_OUTSIDE_TYP; }
	public String getDetComp_ITEM_CD() { return m_DetComp_ITEM_CD; }
	public String getDetComp_ITEM_NAME() { return m_DetComp_ITEM_NAME; }
	public String getDetComp_MRP_ODR_TYP() { return m_DetComp_MRP_ODR_TYP; }
	public String getDetComp_OUTSIDE_TYP() { return m_DetComp_OUTSIDE_TYP; }
	public String getDet_MANHOUR_TYP() { return m_Det_MANHOUR_TYP; }
	public String getDet_PS_EDITION() { return m_Det_PS_EDITION; }
	public String getDet_PS_UNIT_QTY() { return m_Det_PS_UNIT_QTY; }
	public String getDet_STOCK_UNIT() { return m_Det_STOCK_UNIT; }
	public String getDet_EFF_PHASE_IN_DATE() { return m_Det_EFF_PHASE_IN_DATE; }
	public String getDet_EFF_PHASE_OUT_DATE() { return m_Det_EFF_PHASE_OUT_DATE; }
	public String getDet_PS_SPOIL() { return m_Det_PS_SPOIL; }
	public String getDet_CONS_TYP() { return m_Det_CONS_TYP; }
	public String getDet_PS_LT_FLG() { return m_Det_PS_LT_FLG; }
	public String getDet_PS_FIXED_LT() { return m_Det_PS_FIXED_LT; }
	public String getDet_PS_PROP_LT() { return m_Det_PS_PROP_LT; }
	public String getDet_PS_PROP_LOT_SIZE() { return m_Det_PS_PROP_LOT_SIZE; }
	public String getDet_PS_REF_NO() { return m_Det_PS_REF_NO; }
	public String getDet_COST_UP_TYP() { return m_Det_COST_UP_TYP; }
	public String getDet_MRP_EXP_TYP() { return m_Det_MRP_EXP_TYP; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getSub1Parent_ITEM_NAME() { return m_Sub1Parent_ITEM_NAME; }
	public String getSub1Comp_ITEM_NAME() { return m_Sub1Comp_ITEM_NAME; }
	public String getSub1_PS_UNIT_NUMERATOR() { return m_Sub1_PS_UNIT_NUMERATOR; }
	public String getSub1_PS_UNIT_DENOMINATOR() { return m_Sub1_PS_UNIT_DENOMINATOR; }
	public String getSub1_STOCK_UNIT() { return m_Sub1_STOCK_UNIT; }
	public String getSub1Comp_STOCK_UNIT() { return m_Sub1Comp_STOCK_UNIT; }
	public String getSub1_EFF_PHASE_IN_DATE() { return m_Sub1_EFF_PHASE_IN_DATE; }
	public String getSub1_EFF_PHASE_OUT_DATE() { return m_Sub1_EFF_PHASE_OUT_DATE; }
	public String getSub1_PS_SPOIL() { return m_Sub1_PS_SPOIL; }
	public String getSub1_CONS_TYP() { return m_Sub1_CONS_TYP; }
	public String geth_Sub1_PS_LT_FLG() { return m_h_Sub1_PS_LT_FLG; }
	public String getSub1_PS_FIXED_LT() { return m_Sub1_PS_FIXED_LT; }
	public String getSub1_PS_PROP_LT() { return m_Sub1_PS_PROP_LT; }
	public String getSub1_PS_PROP_LOT_SIZE() { return m_Sub1_PS_PROP_LOT_SIZE; }
	public String getSub1_PS_REF_NO() { return m_Sub1_PS_REF_NO; }
	public String getSub1_COST_UP_TYP() { return m_Sub1_COST_UP_TYP; }
	public String getSub1_MRP_EXP_TYP() { return m_Sub1_MRP_EXP_TYP; }
	public String geth_Sub1_MODIFY_COUNT() { return m_h_Sub1_MODIFY_COUNT; }
	public String getSub1Parent_ITEM_CD() { return m_Sub1Parent_ITEM_CD; }
	public String getSub1Comp_ITEM_CD() { return m_Sub1Comp_ITEM_CD; }
	public String getSub1_PS_EDITION() { return m_Sub1_PS_EDITION; }
	public String getSub1_Pvalue() { return m_Sub1_Pvalue; }
	public String getSub1_Pname() { return m_Sub1_Pname; }
	public String getSub1_PLANT() { return m_Sub1_PLANT; }
	public String getSub1_USER_CD() { return m_Sub1_USER_CD; }
	public String getSub1_BUSINESS_DATE() { return m_Sub1_BUSINESS_DATE; }
	public String getLower_MANHOUR_TYP() { return m_Lower_MANHOUR_TYP; }

	public List getList_Target_ITEM_CD() { return l_Target_ITEM_CD; }
	public List getList_DEVELOP_TYP() { return l_DEVELOP_TYP; }
	public List getList_InitLevel() { return l_InitLevel; }
	public List getList_AA0130010tree1() { return l_AA0130010tree1; }
	public List getList_id() { return l_id; }
	public List getList_lvl() { return l_lvl; }
	public List getList_parent() { return l_parent; }
	public List getList_label() { return l_label; }
	public List getList_ctx() { return l_ctx; }
	public List getList_maxid() { return l_maxid; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TargetDate() { return l_TargetDate; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_h_Sub1Parent_ITEM_CD() { return l_h_Sub1Parent_ITEM_CD; }
	public List getList_h_Sub1Comp_ITEM_CD() { return l_h_Sub1Comp_ITEM_CD; }
	public List getList_h_Target_ITEM_CD() { return l_h_Target_ITEM_CD; }
	public List getList_h_TargetDate() { return l_h_TargetDate; }
	public List getList_h_DEVELOP_TYP() { return l_h_DEVELOP_TYP; }
	public List getList_h_InitLevel() { return l_h_InitLevel; }
	public List getList_h_Sub1_PS_EDITION() { return l_h_Sub1_PS_EDITION; }
	public List getList_DEVELOP_TYP_name() { return l_DEVELOP_TYP_name; }
	public List getList_DEVELOP_TYP_val() { return l_DEVELOP_TYP_val; }
	public List getList_Sub1_CONS_TYP_name() { return l_Sub1_CONS_TYP_name; }
	public List getList_Sub1_CONS_TYP_val() { return l_Sub1_CONS_TYP_val; }
	public List getList_c_Sub1_PS_LT_FLG() { return l_c_Sub1_PS_LT_FLG; }
	public List getList_Sub1_COST_UP_TYP_name() { return l_Sub1_COST_UP_TYP_name; }
	public List getList_Sub1_COST_UP_TYP_val() { return l_Sub1_COST_UP_TYP_val; }
	public List getList_Sub1_MRP_EXP_TYP_name() { return l_Sub1_MRP_EXP_TYP_name; }
	public List getList_Sub1_MRP_EXP_TYP_val() { return l_Sub1_MRP_EXP_TYP_val; }
	public List getList_h_ProcTyp() { return l_h_ProcTyp; }
	public List getList_h_MaxLevel() { return l_h_MaxLevel; }
	public List getList_Lower_ITEM_NAME() { return l_Lower_ITEM_NAME; }
	public List getList_Lower_ITEM_CD() { return l_Lower_ITEM_CD; }
	public List getList_Upper_ITEM_NAME() { return l_Upper_ITEM_NAME; }
	public List getList_Upper_ITEM_CD() { return l_Upper_ITEM_CD; }
	public List getList_DetParent_ITEM_CD() { return l_DetParent_ITEM_CD; }
	public List getList_DetParent_ITEM_NAME() { return l_DetParent_ITEM_NAME; }
	public List getList_DetParent_MRP_ODR_TYP() { return l_DetParent_MRP_ODR_TYP; }
	public List getList_DetParent_OUTSIDE_TYP() { return l_DetParent_OUTSIDE_TYP; }
	public List getList_DetComp_ITEM_CD() { return l_DetComp_ITEM_CD; }
	public List getList_DetComp_ITEM_NAME() { return l_DetComp_ITEM_NAME; }
	public List getList_DetComp_MRP_ODR_TYP() { return l_DetComp_MRP_ODR_TYP; }
	public List getList_DetComp_OUTSIDE_TYP() { return l_DetComp_OUTSIDE_TYP; }
	public List getList_Det_MANHOUR_TYP() { return l_Det_MANHOUR_TYP; }
	public List getList_Det_PS_EDITION() { return l_Det_PS_EDITION; }
	public List getList_Det_PS_UNIT_QTY() { return l_Det_PS_UNIT_QTY; }
	public List getList_Det_STOCK_UNIT() { return l_Det_STOCK_UNIT; }
	public List getList_Det_EFF_PHASE_IN_DATE() { return l_Det_EFF_PHASE_IN_DATE; }
	public List getList_Det_EFF_PHASE_OUT_DATE() { return l_Det_EFF_PHASE_OUT_DATE; }
	public List getList_Det_PS_SPOIL() { return l_Det_PS_SPOIL; }
	public List getList_Det_CONS_TYP() { return l_Det_CONS_TYP; }
	public List getList_Det_PS_LT_FLG() { return l_Det_PS_LT_FLG; }
	public List getList_Det_PS_FIXED_LT() { return l_Det_PS_FIXED_LT; }
	public List getList_Det_PS_PROP_LT() { return l_Det_PS_PROP_LT; }
	public List getList_Det_PS_PROP_LOT_SIZE() { return l_Det_PS_PROP_LOT_SIZE; }
	public List getList_Det_PS_REF_NO() { return l_Det_PS_REF_NO; }
	public List getList_Det_COST_UP_TYP() { return l_Det_COST_UP_TYP; }
	public List getList_Det_MRP_EXP_TYP() { return l_Det_MRP_EXP_TYP; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_Sub1Parent_ITEM_NAME() { return l_Sub1Parent_ITEM_NAME; }
	public List getList_Sub1Comp_ITEM_NAME() { return l_Sub1Comp_ITEM_NAME; }
	public List getList_Sub1_PS_UNIT_NUMERATOR() { return l_Sub1_PS_UNIT_NUMERATOR; }
	public List getList_Sub1_PS_UNIT_DENOMINATOR() { return l_Sub1_PS_UNIT_DENOMINATOR; }
	public List getList_Sub1_STOCK_UNIT() { return l_Sub1_STOCK_UNIT; }
	public List getList_Sub1Comp_STOCK_UNIT() { return l_Sub1Comp_STOCK_UNIT; }
	public List getList_Sub1_EFF_PHASE_IN_DATE() { return l_Sub1_EFF_PHASE_IN_DATE; }
	public List getList_Sub1_EFF_PHASE_OUT_DATE() { return l_Sub1_EFF_PHASE_OUT_DATE; }
	public List getList_Sub1_PS_SPOIL() { return l_Sub1_PS_SPOIL; }
	public List getList_Sub1_CONS_TYP() { return l_Sub1_CONS_TYP; }
	public List getList_h_Sub1_PS_LT_FLG() { return l_h_Sub1_PS_LT_FLG; }
	public List getList_Sub1_PS_FIXED_LT() { return l_Sub1_PS_FIXED_LT; }
	public List getList_Sub1_PS_PROP_LT() { return l_Sub1_PS_PROP_LT; }
	public List getList_Sub1_PS_PROP_LOT_SIZE() { return l_Sub1_PS_PROP_LOT_SIZE; }
	public List getList_Sub1_PS_REF_NO() { return l_Sub1_PS_REF_NO; }
	public List getList_Sub1_COST_UP_TYP() { return l_Sub1_COST_UP_TYP; }
	public List getList_Sub1_MRP_EXP_TYP() { return l_Sub1_MRP_EXP_TYP; }
	public List getList_h_Sub1_MODIFY_COUNT() { return l_h_Sub1_MODIFY_COUNT; }
	public List getList_Sub1Parent_ITEM_CD() { return l_Sub1Parent_ITEM_CD; }
	public List getList_Sub1Comp_ITEM_CD() { return l_Sub1Comp_ITEM_CD; }
	public List getList_Sub1_PS_EDITION() { return l_Sub1_PS_EDITION; }
	public List getList_Sub1_Pvalue() { return l_Sub1_Pvalue; }
	public List getList_Sub1_Pname() { return l_Sub1_Pname; }
	public List getList_Sub1_PLANT() { return l_Sub1_PLANT; }
	public List getList_Sub1_USER_CD() { return l_Sub1_USER_CD; }
	public List getList_Sub1_BUSINESS_DATE() { return l_Sub1_BUSINESS_DATE; }
	public List getList_Lower_MANHOUR_TYP() { return l_Lower_MANHOUR_TYP; }

	public void setTarget_ITEM_CD(String val) { m_Target_ITEM_CD = val; }
	public void setDEVELOP_TYP(String val) { m_DEVELOP_TYP = val; }
	public void setInitLevel(String val) { m_InitLevel = val; }
	public void setAA0130010tree1(String val) { m_AA0130010tree1 = val; }
	public void setid(String val) { m_id = val; }
	public void setlvl(String val) { m_lvl = val; }
	public void setparent(String val) { m_parent = val; }
	public void setlabel(String val) { m_label = val; }
	public void setctx(String val) { m_ctx = val; }
	public void setmaxid(String val) { m_maxid = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTargetDate(String val) { m_TargetDate = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void seth_Sub1Parent_ITEM_CD(String val) { m_h_Sub1Parent_ITEM_CD = val; }
	public void seth_Sub1Comp_ITEM_CD(String val) { m_h_Sub1Comp_ITEM_CD = val; }
	public void seth_Target_ITEM_CD(String val) { m_h_Target_ITEM_CD = val; }
	public void seth_TargetDate(String val) { m_h_TargetDate = val; }
	public void seth_DEVELOP_TYP(String val) { m_h_DEVELOP_TYP = val; }
	public void seth_InitLevel(String val) { m_h_InitLevel = val; }
	public void seth_Sub1_PS_EDITION(String val) { m_h_Sub1_PS_EDITION = val; }
	public void setDEVELOP_TYP_name(String val) { m_DEVELOP_TYP_name = val; }
	public void setDEVELOP_TYP_val(String val) { m_DEVELOP_TYP_val = val; }
	public void setSub1_CONS_TYP_name(String val) { m_Sub1_CONS_TYP_name = val; }
	public void setSub1_CONS_TYP_val(String val) { m_Sub1_CONS_TYP_val = val; }
	public void setc_Sub1_PS_LT_FLG(String val) { m_c_Sub1_PS_LT_FLG = val; }
	public void setSub1_COST_UP_TYP_name(String val) { m_Sub1_COST_UP_TYP_name = val; }
	public void setSub1_COST_UP_TYP_val(String val) { m_Sub1_COST_UP_TYP_val = val; }
	public void setSub1_MRP_EXP_TYP_name(String val) { m_Sub1_MRP_EXP_TYP_name = val; }
	public void setSub1_MRP_EXP_TYP_val(String val) { m_Sub1_MRP_EXP_TYP_val = val; }
	public void seth_ProcTyp(String val) { m_h_ProcTyp = val; }
	public void seth_MaxLevel(String val) { m_h_MaxLevel = val; }
	public void setLower_ITEM_NAME(String val) { m_Lower_ITEM_NAME = val; }
	public void setLower_ITEM_CD(String val) { m_Lower_ITEM_CD = val; }
	public void setUpper_ITEM_NAME(String val) { m_Upper_ITEM_NAME = val; }
	public void setUpper_ITEM_CD(String val) { m_Upper_ITEM_CD = val; }
	public void setDetParent_ITEM_CD(String val) { m_DetParent_ITEM_CD = val; }
	public void setDetParent_ITEM_NAME(String val) { m_DetParent_ITEM_NAME = val; }
	public void setDetParent_MRP_ODR_TYP(String val) { m_DetParent_MRP_ODR_TYP = val; }
	public void setDetParent_OUTSIDE_TYP(String val) { m_DetParent_OUTSIDE_TYP = val; }
	public void setDetComp_ITEM_CD(String val) { m_DetComp_ITEM_CD = val; }
	public void setDetComp_ITEM_NAME(String val) { m_DetComp_ITEM_NAME = val; }
	public void setDetComp_MRP_ODR_TYP(String val) { m_DetComp_MRP_ODR_TYP = val; }
	public void setDetComp_OUTSIDE_TYP(String val) { m_DetComp_OUTSIDE_TYP = val; }
	public void setDet_MANHOUR_TYP(String val) { m_Det_MANHOUR_TYP = val; }
	public void setDet_PS_EDITION(String val) { m_Det_PS_EDITION = val; }
	public void setDet_PS_UNIT_QTY(String val) { m_Det_PS_UNIT_QTY = val; }
	public void setDet_STOCK_UNIT(String val) { m_Det_STOCK_UNIT = val; }
	public void setDet_EFF_PHASE_IN_DATE(String val) { m_Det_EFF_PHASE_IN_DATE = val; }
	public void setDet_EFF_PHASE_OUT_DATE(String val) { m_Det_EFF_PHASE_OUT_DATE = val; }
	public void setDet_PS_SPOIL(String val) { m_Det_PS_SPOIL = val; }
	public void setDet_CONS_TYP(String val) { m_Det_CONS_TYP = val; }
	public void setDet_PS_LT_FLG(String val) { m_Det_PS_LT_FLG = val; }
	public void setDet_PS_FIXED_LT(String val) { m_Det_PS_FIXED_LT = val; }
	public void setDet_PS_PROP_LT(String val) { m_Det_PS_PROP_LT = val; }
	public void setDet_PS_PROP_LOT_SIZE(String val) { m_Det_PS_PROP_LOT_SIZE = val; }
	public void setDet_PS_REF_NO(String val) { m_Det_PS_REF_NO = val; }
	public void setDet_COST_UP_TYP(String val) { m_Det_COST_UP_TYP = val; }
	public void setDet_MRP_EXP_TYP(String val) { m_Det_MRP_EXP_TYP = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setSub1Parent_ITEM_NAME(String val) { m_Sub1Parent_ITEM_NAME = val; }
	public void setSub1Comp_ITEM_NAME(String val) { m_Sub1Comp_ITEM_NAME = val; }
	public void setSub1_PS_UNIT_NUMERATOR(String val) { m_Sub1_PS_UNIT_NUMERATOR = val; }
	public void setSub1_PS_UNIT_DENOMINATOR(String val) { m_Sub1_PS_UNIT_DENOMINATOR = val; }
	public void setSub1_STOCK_UNIT(String val) { m_Sub1_STOCK_UNIT = val; }
	public void setSub1Comp_STOCK_UNIT(String val) { m_Sub1Comp_STOCK_UNIT = val; }
	public void setSub1_EFF_PHASE_IN_DATE(String val) { m_Sub1_EFF_PHASE_IN_DATE = val; }
	public void setSub1_EFF_PHASE_OUT_DATE(String val) { m_Sub1_EFF_PHASE_OUT_DATE = val; }
	public void setSub1_PS_SPOIL(String val) { m_Sub1_PS_SPOIL = val; }
	public void setSub1_CONS_TYP(String val) { m_Sub1_CONS_TYP = val; }
	public void seth_Sub1_PS_LT_FLG(String val) { m_h_Sub1_PS_LT_FLG = val; }
	public void setSub1_PS_FIXED_LT(String val) { m_Sub1_PS_FIXED_LT = val; }
	public void setSub1_PS_PROP_LT(String val) { m_Sub1_PS_PROP_LT = val; }
	public void setSub1_PS_PROP_LOT_SIZE(String val) { m_Sub1_PS_PROP_LOT_SIZE = val; }
	public void setSub1_PS_REF_NO(String val) { m_Sub1_PS_REF_NO = val; }
	public void setSub1_COST_UP_TYP(String val) { m_Sub1_COST_UP_TYP = val; }
	public void setSub1_MRP_EXP_TYP(String val) { m_Sub1_MRP_EXP_TYP = val; }
	public void seth_Sub1_MODIFY_COUNT(String val) { m_h_Sub1_MODIFY_COUNT = val; }
	public void setSub1Parent_ITEM_CD(String val) { m_Sub1Parent_ITEM_CD = val; }
	public void setSub1Comp_ITEM_CD(String val) { m_Sub1Comp_ITEM_CD = val; }
	public void setSub1_PS_EDITION(String val) { m_Sub1_PS_EDITION = val; }
	public void setSub1_Pvalue(String val) { m_Sub1_Pvalue = val; }
	public void setSub1_Pname(String val) { m_Sub1_Pname = val; }
	public void setSub1_PLANT(String val) { m_Sub1_PLANT = val; }
	public void setSub1_USER_CD(String val) { m_Sub1_USER_CD = val; }
	public void setSub1_BUSINESS_DATE(String val) { m_Sub1_BUSINESS_DATE = val; }
	public void setLower_MANHOUR_TYP(String val) { m_Lower_MANHOUR_TYP = val; }


	public void setList_Target_ITEM_CD(List list) { l_Target_ITEM_CD = list; }
	public void setList_DEVELOP_TYP(List list) { l_DEVELOP_TYP = list; }
	public void setList_InitLevel(List list) { l_InitLevel = list; }
	public void setList_AA0130010tree1(List list) { l_AA0130010tree1 = list; }
	public void setList_id(List list) { l_id = list; }
	public void setList_lvl(List list) { l_lvl = list; }
	public void setList_parent(List list) { l_parent = list; }
	public void setList_label(List list) { l_label = list; }
	public void setList_ctx(List list) { l_ctx = list; }
	public void setList_maxid(List list) { l_maxid = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_TargetDate(List list) { l_TargetDate = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_Sub1Parent_ITEM_CD(List list) { l_h_Sub1Parent_ITEM_CD = list; }
	public void setList_h_Sub1Comp_ITEM_CD(List list) { l_h_Sub1Comp_ITEM_CD = list; }
	public void setList_h_Target_ITEM_CD(List list) { l_h_Target_ITEM_CD = list; }
	public void setList_h_TargetDate(List list) { l_h_TargetDate = list; }
	public void setList_h_DEVELOP_TYP(List list) { l_h_DEVELOP_TYP = list; }
	public void setList_h_InitLevel(List list) { l_h_InitLevel = list; }
	public void setList_h_Sub1_PS_EDITION(List list) { l_h_Sub1_PS_EDITION = list; }
	public void setList_DEVELOP_TYP_name(List list) { l_DEVELOP_TYP_name = list; }
	public void setList_DEVELOP_TYP_val(List list) { l_DEVELOP_TYP_val = list; }
	public void setList_Sub1_CONS_TYP_name(List list) { l_Sub1_CONS_TYP_name = list; }
	public void setList_Sub1_CONS_TYP_val(List list) { l_Sub1_CONS_TYP_val = list; }
	public void setList_c_Sub1_PS_LT_FLG(List list) { l_c_Sub1_PS_LT_FLG = list; }
	public void setList_Sub1_COST_UP_TYP_name(List list) { l_Sub1_COST_UP_TYP_name = list; }
	public void setList_Sub1_COST_UP_TYP_val(List list) { l_Sub1_COST_UP_TYP_val = list; }
	public void setList_Sub1_MRP_EXP_TYP_name(List list) { l_Sub1_MRP_EXP_TYP_name = list; }
	public void setList_Sub1_MRP_EXP_TYP_val(List list) { l_Sub1_MRP_EXP_TYP_val = list; }
	public void setList_h_ProcTyp(List list) { l_h_ProcTyp = list; }
	public void setList_h_MaxLevel(List list) { l_h_MaxLevel = list; }
	public void setList_Lower_ITEM_NAME(List list) { l_Lower_ITEM_NAME = list; }
	public void setList_Lower_ITEM_CD(List list) { l_Lower_ITEM_CD = list; }
	public void setList_Upper_ITEM_NAME(List list) { l_Upper_ITEM_NAME = list; }
	public void setList_Upper_ITEM_CD(List list) { l_Upper_ITEM_CD = list; }
	public void setList_DetParent_ITEM_CD(List list) { l_DetParent_ITEM_CD = list; }
	public void setList_DetParent_ITEM_NAME(List list) { l_DetParent_ITEM_NAME = list; }
	public void setList_DetParent_MRP_ODR_TYP(List list) { l_DetParent_MRP_ODR_TYP = list; }
	public void setList_DetParent_OUTSIDE_TYP(List list) { l_DetParent_OUTSIDE_TYP = list; }
	public void setList_DetComp_ITEM_CD(List list) { l_DetComp_ITEM_CD = list; }
	public void setList_DetComp_ITEM_NAME(List list) { l_DetComp_ITEM_NAME = list; }
	public void setList_DetComp_MRP_ODR_TYP(List list) { l_DetComp_MRP_ODR_TYP = list; }
	public void setList_DetComp_OUTSIDE_TYP(List list) { l_DetComp_OUTSIDE_TYP = list; }
	public void setList_Det_MANHOUR_TYP(List list) { l_Det_MANHOUR_TYP = list; }
	public void setList_Det_PS_EDITION(List list) { l_Det_PS_EDITION = list; }
	public void setList_Det_PS_UNIT_QTY(List list) { l_Det_PS_UNIT_QTY = list; }
	public void setList_Det_STOCK_UNIT(List list) { l_Det_STOCK_UNIT = list; }
	public void setList_Det_EFF_PHASE_IN_DATE(List list) { l_Det_EFF_PHASE_IN_DATE = list; }
	public void setList_Det_EFF_PHASE_OUT_DATE(List list) { l_Det_EFF_PHASE_OUT_DATE = list; }
	public void setList_Det_PS_SPOIL(List list) { l_Det_PS_SPOIL = list; }
	public void setList_Det_CONS_TYP(List list) { l_Det_CONS_TYP = list; }
	public void setList_Det_PS_LT_FLG(List list) { l_Det_PS_LT_FLG = list; }
	public void setList_Det_PS_FIXED_LT(List list) { l_Det_PS_FIXED_LT = list; }
	public void setList_Det_PS_PROP_LT(List list) { l_Det_PS_PROP_LT = list; }
	public void setList_Det_PS_PROP_LOT_SIZE(List list) { l_Det_PS_PROP_LOT_SIZE = list; }
	public void setList_Det_PS_REF_NO(List list) { l_Det_PS_REF_NO = list; }
	public void setList_Det_COST_UP_TYP(List list) { l_Det_COST_UP_TYP = list; }
	public void setList_Det_MRP_EXP_TYP(List list) { l_Det_MRP_EXP_TYP = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_Sub1Parent_ITEM_NAME(List list) { l_Sub1Parent_ITEM_NAME = list; }
	public void setList_Sub1Comp_ITEM_NAME(List list) { l_Sub1Comp_ITEM_NAME = list; }
	public void setList_Sub1_PS_UNIT_NUMERATOR(List list) { l_Sub1_PS_UNIT_NUMERATOR = list; }
	public void setList_Sub1_PS_UNIT_DENOMINATOR(List list) { l_Sub1_PS_UNIT_DENOMINATOR = list; }
	public void setList_Sub1_STOCK_UNIT(List list) { l_Sub1_STOCK_UNIT = list; }
	public void setList_Sub1Comp_STOCK_UNIT(List list) { l_Sub1Comp_STOCK_UNIT = list; }
	public void setList_Sub1_EFF_PHASE_IN_DATE(List list) { l_Sub1_EFF_PHASE_IN_DATE = list; }
	public void setList_Sub1_EFF_PHASE_OUT_DATE(List list) { l_Sub1_EFF_PHASE_OUT_DATE = list; }
	public void setList_Sub1_PS_SPOIL(List list) { l_Sub1_PS_SPOIL = list; }
	public void setList_Sub1_CONS_TYP(List list) { l_Sub1_CONS_TYP = list; }
	public void setList_h_Sub1_PS_LT_FLG(List list) { l_h_Sub1_PS_LT_FLG = list; }
	public void setList_Sub1_PS_FIXED_LT(List list) { l_Sub1_PS_FIXED_LT = list; }
	public void setList_Sub1_PS_PROP_LT(List list) { l_Sub1_PS_PROP_LT = list; }
	public void setList_Sub1_PS_PROP_LOT_SIZE(List list) { l_Sub1_PS_PROP_LOT_SIZE = list; }
	public void setList_Sub1_PS_REF_NO(List list) { l_Sub1_PS_REF_NO = list; }
	public void setList_Sub1_COST_UP_TYP(List list) { l_Sub1_COST_UP_TYP = list; }
	public void setList_Sub1_MRP_EXP_TYP(List list) { l_Sub1_MRP_EXP_TYP = list; }
	public void setList_h_Sub1_MODIFY_COUNT(List list) { l_h_Sub1_MODIFY_COUNT = list; }
	public void setList_Sub1Parent_ITEM_CD(List list) { l_Sub1Parent_ITEM_CD = list; }
	public void setList_Sub1Comp_ITEM_CD(List list) { l_Sub1Comp_ITEM_CD = list; }
	public void setList_Sub1_PS_EDITION(List list) { l_Sub1_PS_EDITION = list; }
	public void setList_Sub1_Pvalue(List list) { l_Sub1_Pvalue = list; }
	public void setList_Sub1_Pname(List list) { l_Sub1_Pname = list; }
	public void setList_Sub1_PLANT(List list) { l_Sub1_PLANT = list; }
	public void setList_Sub1_USER_CD(List list) { l_Sub1_USER_CD = list; }
	public void setList_Sub1_BUSINESS_DATE(List list) { l_Sub1_BUSINESS_DATE = list; }
	public void setList_Lower_MANHOUR_TYP(List list) { l_Lower_MANHOUR_TYP = list; }

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
			l_Target_ITEM_CD.add(((AA0130010Struct) list.get(i)).getTarget_ITEM_CD());
		}
		return size;
	}
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
			l_DEVELOP_TYP.add(((AA0130010Struct) list.get(i)).getDEVELOP_TYP());
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
			l_InitLevel.add(((AA0130010Struct) list.get(i)).getInitLevel());
		}
		return size;
	}
	public int setL2L_AA0130010tree1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AA0130010tree1 == null) {
			l_AA0130010tree1 = new ArrayList();
		} else {
			l_AA0130010tree1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AA0130010tree1.add(((AA0130010Struct) list.get(i)).getAA0130010tree1());
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
			l_id.add(((AA0130010Struct) list.get(i)).getid());
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
			l_lvl.add(((AA0130010Struct) list.get(i)).getlvl());
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
			l_parent.add(((AA0130010Struct) list.get(i)).getparent());
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
			l_label.add(((AA0130010Struct) list.get(i)).getlabel());
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
			l_ctx.add(((AA0130010Struct) list.get(i)).getctx());
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
			l_maxid.add(((AA0130010Struct) list.get(i)).getmaxid());
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
			l_MODIFY_COUNT.add(((AA0130010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_TargetDate.add(((AA0130010Struct) list.get(i)).getTargetDate());
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
			l_EFF_PHASE_IN_DATE.add(((AA0130010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((AA0130010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_Sub1Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1Parent_ITEM_CD == null) {
			l_h_Sub1Parent_ITEM_CD = new ArrayList();
		} else {
			l_h_Sub1Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1Parent_ITEM_CD.add(((AA0130010Struct) list.get(i)).geth_Sub1Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_Sub1Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1Comp_ITEM_CD == null) {
			l_h_Sub1Comp_ITEM_CD = new ArrayList();
		} else {
			l_h_Sub1Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1Comp_ITEM_CD.add(((AA0130010Struct) list.get(i)).geth_Sub1Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_Target_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Target_ITEM_CD == null) {
			l_h_Target_ITEM_CD = new ArrayList();
		} else {
			l_h_Target_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Target_ITEM_CD.add(((AA0130010Struct) list.get(i)).geth_Target_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TargetDate == null) {
			l_h_TargetDate = new ArrayList();
		} else {
			l_h_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TargetDate.add(((AA0130010Struct) list.get(i)).geth_TargetDate());
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
			l_h_DEVELOP_TYP.add(((AA0130010Struct) list.get(i)).geth_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_h_InitLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_InitLevel == null) {
			l_h_InitLevel = new ArrayList();
		} else {
			l_h_InitLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_InitLevel.add(((AA0130010Struct) list.get(i)).geth_InitLevel());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_EDITION == null) {
			l_h_Sub1_PS_EDITION = new ArrayList();
		} else {
			l_h_Sub1_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_EDITION.add(((AA0130010Struct) list.get(i)).geth_Sub1_PS_EDITION());
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
			l_DEVELOP_TYP_name.add(((AA0130010Struct) list.get(i)).getDEVELOP_TYP_name());
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
			l_DEVELOP_TYP_val.add(((AA0130010Struct) list.get(i)).getDEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP_name == null) {
			l_Sub1_CONS_TYP_name = new ArrayList();
		} else {
			l_Sub1_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP_name.add(((AA0130010Struct) list.get(i)).getSub1_CONS_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP_val == null) {
			l_Sub1_CONS_TYP_val = new ArrayList();
		} else {
			l_Sub1_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP_val.add(((AA0130010Struct) list.get(i)).getSub1_CONS_TYP_val());
		}
		return size;
	}
	public int setL2L_c_Sub1_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_Sub1_PS_LT_FLG == null) {
			l_c_Sub1_PS_LT_FLG = new ArrayList();
		} else {
			l_c_Sub1_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_Sub1_PS_LT_FLG.add(((AA0130010Struct) list.get(i)).getc_Sub1_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP_name == null) {
			l_Sub1_COST_UP_TYP_name = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP_name.add(((AA0130010Struct) list.get(i)).getSub1_COST_UP_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP_val == null) {
			l_Sub1_COST_UP_TYP_val = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP_val.add(((AA0130010Struct) list.get(i)).getSub1_COST_UP_TYP_val());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP_name == null) {
			l_Sub1_MRP_EXP_TYP_name = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP_name.add(((AA0130010Struct) list.get(i)).getSub1_MRP_EXP_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP_val == null) {
			l_Sub1_MRP_EXP_TYP_val = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP_val.add(((AA0130010Struct) list.get(i)).getSub1_MRP_EXP_TYP_val());
		}
		return size;
	}
	public int setL2L_h_ProcTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ProcTyp == null) {
			l_h_ProcTyp = new ArrayList();
		} else {
			l_h_ProcTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ProcTyp.add(((AA0130010Struct) list.get(i)).geth_ProcTyp());
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
			l_h_MaxLevel.add(((AA0130010Struct) list.get(i)).geth_MaxLevel());
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
			l_Lower_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getLower_ITEM_NAME());
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
			l_Lower_ITEM_CD.add(((AA0130010Struct) list.get(i)).getLower_ITEM_CD());
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
			l_Upper_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getUpper_ITEM_NAME());
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
			l_Upper_ITEM_CD.add(((AA0130010Struct) list.get(i)).getUpper_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetParent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_ITEM_CD == null) {
			l_DetParent_ITEM_CD = new ArrayList();
		} else {
			l_DetParent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_ITEM_CD.add(((AA0130010Struct) list.get(i)).getDetParent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetParent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_ITEM_NAME == null) {
			l_DetParent_ITEM_NAME = new ArrayList();
		} else {
			l_DetParent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getDetParent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DetParent_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_MRP_ODR_TYP == null) {
			l_DetParent_MRP_ODR_TYP = new ArrayList();
		} else {
			l_DetParent_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_MRP_ODR_TYP.add(((AA0130010Struct) list.get(i)).getDetParent_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_DetParent_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_OUTSIDE_TYP == null) {
			l_DetParent_OUTSIDE_TYP = new ArrayList();
		} else {
			l_DetParent_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_OUTSIDE_TYP.add(((AA0130010Struct) list.get(i)).getDetParent_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_DetComp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_ITEM_CD == null) {
			l_DetComp_ITEM_CD = new ArrayList();
		} else {
			l_DetComp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_ITEM_CD.add(((AA0130010Struct) list.get(i)).getDetComp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetComp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_ITEM_NAME == null) {
			l_DetComp_ITEM_NAME = new ArrayList();
		} else {
			l_DetComp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getDetComp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DetComp_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_MRP_ODR_TYP == null) {
			l_DetComp_MRP_ODR_TYP = new ArrayList();
		} else {
			l_DetComp_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_MRP_ODR_TYP.add(((AA0130010Struct) list.get(i)).getDetComp_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_DetComp_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_OUTSIDE_TYP == null) {
			l_DetComp_OUTSIDE_TYP = new ArrayList();
		} else {
			l_DetComp_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_OUTSIDE_TYP.add(((AA0130010Struct) list.get(i)).getDetComp_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_Det_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_MANHOUR_TYP == null) {
			l_Det_MANHOUR_TYP = new ArrayList();
		} else {
			l_Det_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_MANHOUR_TYP.add(((AA0130010Struct) list.get(i)).getDet_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_Det_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_EDITION == null) {
			l_Det_PS_EDITION = new ArrayList();
		} else {
			l_Det_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_EDITION.add(((AA0130010Struct) list.get(i)).getDet_PS_EDITION());
		}
		return size;
	}
	public int setL2L_Det_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_UNIT_QTY == null) {
			l_Det_PS_UNIT_QTY = new ArrayList();
		} else {
			l_Det_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_UNIT_QTY.add(((AA0130010Struct) list.get(i)).getDet_PS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_Det_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_STOCK_UNIT == null) {
			l_Det_STOCK_UNIT = new ArrayList();
		} else {
			l_Det_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_STOCK_UNIT.add(((AA0130010Struct) list.get(i)).getDet_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Det_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_EFF_PHASE_IN_DATE == null) {
			l_Det_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Det_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_EFF_PHASE_IN_DATE.add(((AA0130010Struct) list.get(i)).getDet_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Det_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_EFF_PHASE_OUT_DATE == null) {
			l_Det_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Det_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_EFF_PHASE_OUT_DATE.add(((AA0130010Struct) list.get(i)).getDet_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_Det_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_SPOIL == null) {
			l_Det_PS_SPOIL = new ArrayList();
		} else {
			l_Det_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_SPOIL.add(((AA0130010Struct) list.get(i)).getDet_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_Det_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_CONS_TYP == null) {
			l_Det_CONS_TYP = new ArrayList();
		} else {
			l_Det_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_CONS_TYP.add(((AA0130010Struct) list.get(i)).getDet_CONS_TYP());
		}
		return size;
	}
	public int setL2L_Det_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_LT_FLG == null) {
			l_Det_PS_LT_FLG = new ArrayList();
		} else {
			l_Det_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_LT_FLG.add(((AA0130010Struct) list.get(i)).getDet_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Det_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_FIXED_LT == null) {
			l_Det_PS_FIXED_LT = new ArrayList();
		} else {
			l_Det_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_FIXED_LT.add(((AA0130010Struct) list.get(i)).getDet_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_Det_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_PROP_LT == null) {
			l_Det_PS_PROP_LT = new ArrayList();
		} else {
			l_Det_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_PROP_LT.add(((AA0130010Struct) list.get(i)).getDet_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_Det_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_PROP_LOT_SIZE == null) {
			l_Det_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Det_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_PROP_LOT_SIZE.add(((AA0130010Struct) list.get(i)).getDet_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Det_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_REF_NO == null) {
			l_Det_PS_REF_NO = new ArrayList();
		} else {
			l_Det_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_REF_NO.add(((AA0130010Struct) list.get(i)).getDet_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_Det_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_COST_UP_TYP == null) {
			l_Det_COST_UP_TYP = new ArrayList();
		} else {
			l_Det_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_COST_UP_TYP.add(((AA0130010Struct) list.get(i)).getDet_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_Det_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_MRP_EXP_TYP == null) {
			l_Det_MRP_EXP_TYP = new ArrayList();
		} else {
			l_Det_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_MRP_EXP_TYP.add(((AA0130010Struct) list.get(i)).getDet_MRP_EXP_TYP());
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
			l_PS_EDITION.add(((AA0130010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_Sub1Parent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Parent_ITEM_NAME == null) {
			l_Sub1Parent_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1Parent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Parent_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getSub1Parent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub1Comp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_ITEM_NAME == null) {
			l_Sub1Comp_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1Comp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_ITEM_NAME.add(((AA0130010Struct) list.get(i)).getSub1Comp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_NUMERATOR == null) {
			l_Sub1_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_NUMERATOR.add(((AA0130010Struct) list.get(i)).getSub1_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_DENOMINATOR == null) {
			l_Sub1_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_DENOMINATOR.add(((AA0130010Struct) list.get(i)).getSub1_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_Sub1_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_STOCK_UNIT == null) {
			l_Sub1_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub1_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_STOCK_UNIT.add(((AA0130010Struct) list.get(i)).getSub1_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub1Comp_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_STOCK_UNIT == null) {
			l_Sub1Comp_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub1Comp_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_STOCK_UNIT.add(((AA0130010Struct) list.get(i)).getSub1Comp_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub1_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_EFF_PHASE_IN_DATE == null) {
			l_Sub1_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Sub1_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_EFF_PHASE_IN_DATE.add(((AA0130010Struct) list.get(i)).getSub1_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_EFF_PHASE_OUT_DATE == null) {
			l_Sub1_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Sub1_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_EFF_PHASE_OUT_DATE.add(((AA0130010Struct) list.get(i)).getSub1_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_SPOIL == null) {
			l_Sub1_PS_SPOIL = new ArrayList();
		} else {
			l_Sub1_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_SPOIL.add(((AA0130010Struct) list.get(i)).getSub1_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP == null) {
			l_Sub1_CONS_TYP = new ArrayList();
		} else {
			l_Sub1_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP.add(((AA0130010Struct) list.get(i)).getSub1_CONS_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_LT_FLG == null) {
			l_h_Sub1_PS_LT_FLG = new ArrayList();
		} else {
			l_h_Sub1_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_LT_FLG.add(((AA0130010Struct) list.get(i)).geth_Sub1_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Sub1_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_FIXED_LT == null) {
			l_Sub1_PS_FIXED_LT = new ArrayList();
		} else {
			l_Sub1_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_FIXED_LT.add(((AA0130010Struct) list.get(i)).getSub1_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_Sub1_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_PROP_LT == null) {
			l_Sub1_PS_PROP_LT = new ArrayList();
		} else {
			l_Sub1_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_PROP_LT.add(((AA0130010Struct) list.get(i)).getSub1_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_Sub1_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_PROP_LOT_SIZE == null) {
			l_Sub1_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Sub1_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_PROP_LOT_SIZE.add(((AA0130010Struct) list.get(i)).getSub1_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Sub1_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_REF_NO == null) {
			l_Sub1_PS_REF_NO = new ArrayList();
		} else {
			l_Sub1_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_REF_NO.add(((AA0130010Struct) list.get(i)).getSub1_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP == null) {
			l_Sub1_COST_UP_TYP = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP.add(((AA0130010Struct) list.get(i)).getSub1_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP == null) {
			l_Sub1_MRP_EXP_TYP = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP.add(((AA0130010Struct) list.get(i)).getSub1_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_MODIFY_COUNT == null) {
			l_h_Sub1_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Sub1_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_MODIFY_COUNT.add(((AA0130010Struct) list.get(i)).geth_Sub1_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Sub1Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Parent_ITEM_CD == null) {
			l_Sub1Parent_ITEM_CD = new ArrayList();
		} else {
			l_Sub1Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Parent_ITEM_CD.add(((AA0130010Struct) list.get(i)).getSub1Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_ITEM_CD == null) {
			l_Sub1Comp_ITEM_CD = new ArrayList();
		} else {
			l_Sub1Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_ITEM_CD.add(((AA0130010Struct) list.get(i)).getSub1Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_EDITION == null) {
			l_Sub1_PS_EDITION = new ArrayList();
		} else {
			l_Sub1_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_EDITION.add(((AA0130010Struct) list.get(i)).getSub1_PS_EDITION());
		}
		return size;
	}
	public int setL2L_Sub1_Pvalue(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Pvalue == null) {
			l_Sub1_Pvalue = new ArrayList();
		} else {
			l_Sub1_Pvalue.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Pvalue.add(((AA0130010Struct) list.get(i)).getSub1_Pvalue());
		}
		return size;
	}
	public int setL2L_Sub1_Pname(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Pname == null) {
			l_Sub1_Pname = new ArrayList();
		} else {
			l_Sub1_Pname.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Pname.add(((AA0130010Struct) list.get(i)).getSub1_Pname());
		}
		return size;
	}
	public int setL2L_Sub1_PLANT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PLANT == null) {
			l_Sub1_PLANT = new ArrayList();
		} else {
			l_Sub1_PLANT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PLANT.add(((AA0130010Struct) list.get(i)).getSub1_PLANT());
		}
		return size;
	}
	public int setL2L_Sub1_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_USER_CD == null) {
			l_Sub1_USER_CD = new ArrayList();
		} else {
			l_Sub1_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_USER_CD.add(((AA0130010Struct) list.get(i)).getSub1_USER_CD());
		}
		return size;
	}
	public int setL2L_Sub1_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_BUSINESS_DATE == null) {
			l_Sub1_BUSINESS_DATE = new ArrayList();
		} else {
			l_Sub1_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_BUSINESS_DATE.add(((AA0130010Struct) list.get(i)).getSub1_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_Lower_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_MANHOUR_TYP == null) {
			l_Lower_MANHOUR_TYP = new ArrayList();
		} else {
			l_Lower_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_MANHOUR_TYP.add(((AA0130010Struct) list.get(i)).getLower_MANHOUR_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_Target_ITEM_CD = null;
		m_DEVELOP_TYP = null;
		m_InitLevel = null;
		m_AA0130010tree1 = null;
		m_id = null;
		m_lvl = null;
		m_parent = null;
		m_label = null;
		m_ctx = null;
		m_maxid = null;
		m_MODIFY_COUNT = null;
		m_TargetDate = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_h_Sub1Parent_ITEM_CD = null;
		m_h_Sub1Comp_ITEM_CD = null;
		m_h_Target_ITEM_CD = null;
		m_h_TargetDate = null;
		m_h_DEVELOP_TYP = null;
		m_h_InitLevel = null;
		m_h_Sub1_PS_EDITION = null;
		m_DEVELOP_TYP_name = null;
		m_DEVELOP_TYP_val = null;
		m_Sub1_CONS_TYP_name = null;
		m_Sub1_CONS_TYP_val = null;
		m_c_Sub1_PS_LT_FLG = null;
		m_Sub1_COST_UP_TYP_name = null;
		m_Sub1_COST_UP_TYP_val = null;
		m_Sub1_MRP_EXP_TYP_name = null;
		m_Sub1_MRP_EXP_TYP_val = null;
		m_h_ProcTyp = null;
		m_h_MaxLevel = null;
		m_Lower_ITEM_NAME = null;
		m_Lower_ITEM_CD = null;
		m_Upper_ITEM_NAME = null;
		m_Upper_ITEM_CD = null;
		m_DetParent_ITEM_CD = null;
		m_DetParent_ITEM_NAME = null;
		m_DetParent_MRP_ODR_TYP = null;
		m_DetParent_OUTSIDE_TYP = null;
		m_DetComp_ITEM_CD = null;
		m_DetComp_ITEM_NAME = null;
		m_DetComp_MRP_ODR_TYP = null;
		m_DetComp_OUTSIDE_TYP = null;
		m_Det_MANHOUR_TYP = null;
		m_Det_PS_EDITION = null;
		m_Det_PS_UNIT_QTY = null;
		m_Det_STOCK_UNIT = null;
		m_Det_EFF_PHASE_IN_DATE = null;
		m_Det_EFF_PHASE_OUT_DATE = null;
		m_Det_PS_SPOIL = null;
		m_Det_CONS_TYP = null;
		m_Det_PS_LT_FLG = null;
		m_Det_PS_FIXED_LT = null;
		m_Det_PS_PROP_LT = null;
		m_Det_PS_PROP_LOT_SIZE = null;
		m_Det_PS_REF_NO = null;
		m_Det_COST_UP_TYP = null;
		m_Det_MRP_EXP_TYP = null;
		m_PS_EDITION = null;
		m_Sub1Parent_ITEM_NAME = null;
		m_Sub1Comp_ITEM_NAME = null;
		m_Sub1_PS_UNIT_NUMERATOR = null;
		m_Sub1_PS_UNIT_DENOMINATOR = null;
		m_Sub1_STOCK_UNIT = null;
		m_Sub1Comp_STOCK_UNIT = null;
		m_Sub1_EFF_PHASE_IN_DATE = null;
		m_Sub1_EFF_PHASE_OUT_DATE = null;
		m_Sub1_PS_SPOIL = null;
		m_Sub1_CONS_TYP = null;
		m_h_Sub1_PS_LT_FLG = null;
		m_Sub1_PS_FIXED_LT = null;
		m_Sub1_PS_PROP_LT = null;
		m_Sub1_PS_PROP_LOT_SIZE = null;
		m_Sub1_PS_REF_NO = null;
		m_Sub1_COST_UP_TYP = null;
		m_Sub1_MRP_EXP_TYP = null;
		m_h_Sub1_MODIFY_COUNT = null;
		m_Sub1Parent_ITEM_CD = null;
		m_Sub1Comp_ITEM_CD = null;
		m_Sub1_PS_EDITION = null;
		m_Sub1_Pvalue = null;
		m_Sub1_Pname = null;
		m_Sub1_PLANT = null;
		m_Sub1_USER_CD = null;
		m_Sub1_BUSINESS_DATE = null;
		m_Lower_MANHOUR_TYP = null;

		l_Target_ITEM_CD = null;
		l_DEVELOP_TYP = null;
		l_InitLevel = null;
		l_AA0130010tree1 = null;
		l_id = null;
		l_lvl = null;
		l_parent = null;
		l_label = null;
		l_ctx = null;
		l_maxid = null;
		l_MODIFY_COUNT = null;
		l_TargetDate = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_h_Sub1Parent_ITEM_CD = null;
		l_h_Sub1Comp_ITEM_CD = null;
		l_h_Target_ITEM_CD = null;
		l_h_TargetDate = null;
		l_h_DEVELOP_TYP = null;
		l_h_InitLevel = null;
		l_h_Sub1_PS_EDITION = null;
		l_DEVELOP_TYP_name = null;
		l_DEVELOP_TYP_val = null;
		l_Sub1_CONS_TYP_name = null;
		l_Sub1_CONS_TYP_val = null;
		l_c_Sub1_PS_LT_FLG = null;
		l_Sub1_COST_UP_TYP_name = null;
		l_Sub1_COST_UP_TYP_val = null;
		l_Sub1_MRP_EXP_TYP_name = null;
		l_Sub1_MRP_EXP_TYP_val = null;
		l_h_ProcTyp = null;
		l_h_MaxLevel = null;
		l_Lower_ITEM_NAME = null;
		l_Lower_ITEM_CD = null;
		l_Upper_ITEM_NAME = null;
		l_Upper_ITEM_CD = null;
		l_DetParent_ITEM_CD = null;
		l_DetParent_ITEM_NAME = null;
		l_DetParent_MRP_ODR_TYP = null;
		l_DetParent_OUTSIDE_TYP = null;
		l_DetComp_ITEM_CD = null;
		l_DetComp_ITEM_NAME = null;
		l_DetComp_MRP_ODR_TYP = null;
		l_DetComp_OUTSIDE_TYP = null;
		l_Det_MANHOUR_TYP = null;
		l_Det_PS_EDITION = null;
		l_Det_PS_UNIT_QTY = null;
		l_Det_STOCK_UNIT = null;
		l_Det_EFF_PHASE_IN_DATE = null;
		l_Det_EFF_PHASE_OUT_DATE = null;
		l_Det_PS_SPOIL = null;
		l_Det_CONS_TYP = null;
		l_Det_PS_LT_FLG = null;
		l_Det_PS_FIXED_LT = null;
		l_Det_PS_PROP_LT = null;
		l_Det_PS_PROP_LOT_SIZE = null;
		l_Det_PS_REF_NO = null;
		l_Det_COST_UP_TYP = null;
		l_Det_MRP_EXP_TYP = null;
		l_PS_EDITION = null;
		l_Sub1Parent_ITEM_NAME = null;
		l_Sub1Comp_ITEM_NAME = null;
		l_Sub1_PS_UNIT_NUMERATOR = null;
		l_Sub1_PS_UNIT_DENOMINATOR = null;
		l_Sub1_STOCK_UNIT = null;
		l_Sub1Comp_STOCK_UNIT = null;
		l_Sub1_EFF_PHASE_IN_DATE = null;
		l_Sub1_EFF_PHASE_OUT_DATE = null;
		l_Sub1_PS_SPOIL = null;
		l_Sub1_CONS_TYP = null;
		l_h_Sub1_PS_LT_FLG = null;
		l_Sub1_PS_FIXED_LT = null;
		l_Sub1_PS_PROP_LT = null;
		l_Sub1_PS_PROP_LOT_SIZE = null;
		l_Sub1_PS_REF_NO = null;
		l_Sub1_COST_UP_TYP = null;
		l_Sub1_MRP_EXP_TYP = null;
		l_h_Sub1_MODIFY_COUNT = null;
		l_Sub1Parent_ITEM_CD = null;
		l_Sub1Comp_ITEM_CD = null;
		l_Sub1_PS_EDITION = null;
		l_Sub1_Pvalue = null;
		l_Sub1_Pname = null;
		l_Sub1_PLANT = null;
		l_Sub1_USER_CD = null;
		l_Sub1_BUSINESS_DATE = null;
		l_Lower_MANHOUR_TYP = null;

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
	 * medAA0130010�N���X�̕W���R���X�g���N�^
	 */
	public AA0130010Struct()
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
	public void setStruct(AA0130010Struct struct)
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
	public void setStructM(AA0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setTarget_ITEM_CD(struct.getTarget_ITEM_CD());
			this.setDEVELOP_TYP(struct.getDEVELOP_TYP());
			this.setInitLevel(struct.getInitLevel());
			this.setAA0130010tree1(struct.getAA0130010tree1());
			this.setid(struct.getid());
			this.setlvl(struct.getlvl());
			this.setparent(struct.getparent());
			this.setlabel(struct.getlabel());
			this.setctx(struct.getctx());
			this.setmaxid(struct.getmaxid());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setTargetDate(struct.getTargetDate());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.seth_Sub1Parent_ITEM_CD(struct.geth_Sub1Parent_ITEM_CD());
			this.seth_Sub1Comp_ITEM_CD(struct.geth_Sub1Comp_ITEM_CD());
			this.seth_Target_ITEM_CD(struct.geth_Target_ITEM_CD());
			this.seth_TargetDate(struct.geth_TargetDate());
			this.seth_DEVELOP_TYP(struct.geth_DEVELOP_TYP());
			this.seth_InitLevel(struct.geth_InitLevel());
			this.seth_Sub1_PS_EDITION(struct.geth_Sub1_PS_EDITION());
			this.setDEVELOP_TYP_name(struct.getDEVELOP_TYP_name());
			this.setDEVELOP_TYP_val(struct.getDEVELOP_TYP_val());
			this.setSub1_CONS_TYP_name(struct.getSub1_CONS_TYP_name());
			this.setSub1_CONS_TYP_val(struct.getSub1_CONS_TYP_val());
			this.setc_Sub1_PS_LT_FLG(struct.getc_Sub1_PS_LT_FLG());
			this.setSub1_COST_UP_TYP_name(struct.getSub1_COST_UP_TYP_name());
			this.setSub1_COST_UP_TYP_val(struct.getSub1_COST_UP_TYP_val());
			this.setSub1_MRP_EXP_TYP_name(struct.getSub1_MRP_EXP_TYP_name());
			this.setSub1_MRP_EXP_TYP_val(struct.getSub1_MRP_EXP_TYP_val());
			this.seth_ProcTyp(struct.geth_ProcTyp());
			this.seth_MaxLevel(struct.geth_MaxLevel());
			this.setLower_ITEM_NAME(struct.getLower_ITEM_NAME());
			this.setLower_ITEM_CD(struct.getLower_ITEM_CD());
			this.setUpper_ITEM_NAME(struct.getUpper_ITEM_NAME());
			this.setUpper_ITEM_CD(struct.getUpper_ITEM_CD());
			this.setDetParent_ITEM_CD(struct.getDetParent_ITEM_CD());
			this.setDetParent_ITEM_NAME(struct.getDetParent_ITEM_NAME());
			this.setDetParent_MRP_ODR_TYP(struct.getDetParent_MRP_ODR_TYP());
			this.setDetParent_OUTSIDE_TYP(struct.getDetParent_OUTSIDE_TYP());
			this.setDetComp_ITEM_CD(struct.getDetComp_ITEM_CD());
			this.setDetComp_ITEM_NAME(struct.getDetComp_ITEM_NAME());
			this.setDetComp_MRP_ODR_TYP(struct.getDetComp_MRP_ODR_TYP());
			this.setDetComp_OUTSIDE_TYP(struct.getDetComp_OUTSIDE_TYP());
			this.setDet_MANHOUR_TYP(struct.getDet_MANHOUR_TYP());
			this.setDet_PS_EDITION(struct.getDet_PS_EDITION());
			this.setDet_PS_UNIT_QTY(struct.getDet_PS_UNIT_QTY());
			this.setDet_STOCK_UNIT(struct.getDet_STOCK_UNIT());
			this.setDet_EFF_PHASE_IN_DATE(struct.getDet_EFF_PHASE_IN_DATE());
			this.setDet_EFF_PHASE_OUT_DATE(struct.getDet_EFF_PHASE_OUT_DATE());
			this.setDet_PS_SPOIL(struct.getDet_PS_SPOIL());
			this.setDet_CONS_TYP(struct.getDet_CONS_TYP());
			this.setDet_PS_LT_FLG(struct.getDet_PS_LT_FLG());
			this.setDet_PS_FIXED_LT(struct.getDet_PS_FIXED_LT());
			this.setDet_PS_PROP_LT(struct.getDet_PS_PROP_LT());
			this.setDet_PS_PROP_LOT_SIZE(struct.getDet_PS_PROP_LOT_SIZE());
			this.setDet_PS_REF_NO(struct.getDet_PS_REF_NO());
			this.setDet_COST_UP_TYP(struct.getDet_COST_UP_TYP());
			this.setDet_MRP_EXP_TYP(struct.getDet_MRP_EXP_TYP());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setSub1Parent_ITEM_NAME(struct.getSub1Parent_ITEM_NAME());
			this.setSub1Comp_ITEM_NAME(struct.getSub1Comp_ITEM_NAME());
			this.setSub1_PS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());
			this.setSub1_PS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());
			this.setSub1_STOCK_UNIT(struct.getSub1_STOCK_UNIT());
			this.setSub1Comp_STOCK_UNIT(struct.getSub1Comp_STOCK_UNIT());
			this.setSub1_EFF_PHASE_IN_DATE(struct.getSub1_EFF_PHASE_IN_DATE());
			this.setSub1_EFF_PHASE_OUT_DATE(struct.getSub1_EFF_PHASE_OUT_DATE());
			this.setSub1_PS_SPOIL(struct.getSub1_PS_SPOIL());
			this.setSub1_CONS_TYP(struct.getSub1_CONS_TYP());
			this.seth_Sub1_PS_LT_FLG(struct.geth_Sub1_PS_LT_FLG());
			this.setSub1_PS_FIXED_LT(struct.getSub1_PS_FIXED_LT());
			this.setSub1_PS_PROP_LT(struct.getSub1_PS_PROP_LT());
			this.setSub1_PS_PROP_LOT_SIZE(struct.getSub1_PS_PROP_LOT_SIZE());
			this.setSub1_PS_REF_NO(struct.getSub1_PS_REF_NO());
			this.setSub1_COST_UP_TYP(struct.getSub1_COST_UP_TYP());
			this.setSub1_MRP_EXP_TYP(struct.getSub1_MRP_EXP_TYP());
			this.seth_Sub1_MODIFY_COUNT(struct.geth_Sub1_MODIFY_COUNT());
			this.setSub1Parent_ITEM_CD(struct.getSub1Parent_ITEM_CD());
			this.setSub1Comp_ITEM_CD(struct.getSub1Comp_ITEM_CD());
			this.setSub1_PS_EDITION(struct.getSub1_PS_EDITION());
			this.setSub1_Pvalue(struct.getSub1_Pvalue());
			this.setSub1_Pname(struct.getSub1_Pname());
			this.setSub1_PLANT(struct.getSub1_PLANT());
			this.setSub1_USER_CD(struct.getSub1_USER_CD());
			this.setSub1_BUSINESS_DATE(struct.getSub1_BUSINESS_DATE());
			this.setLower_MANHOUR_TYP(struct.getLower_MANHOUR_TYP());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_Target_ITEM_CD(struct.getList_Target_ITEM_CD());
			this.setList_DEVELOP_TYP(struct.getList_DEVELOP_TYP());
			this.setList_InitLevel(struct.getList_InitLevel());
			this.setList_AA0130010tree1(struct.getList_AA0130010tree1());
			this.setList_id(struct.getList_id());
			this.setList_lvl(struct.getList_lvl());
			this.setList_parent(struct.getList_parent());
			this.setList_label(struct.getList_label());
			this.setList_ctx(struct.getList_ctx());
			this.setList_maxid(struct.getList_maxid());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_TargetDate(struct.getList_TargetDate());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_h_Sub1Parent_ITEM_CD(struct.getList_h_Sub1Parent_ITEM_CD());
			this.setList_h_Sub1Comp_ITEM_CD(struct.getList_h_Sub1Comp_ITEM_CD());
			this.setList_h_Target_ITEM_CD(struct.getList_h_Target_ITEM_CD());
			this.setList_h_TargetDate(struct.getList_h_TargetDate());
			this.setList_h_DEVELOP_TYP(struct.getList_h_DEVELOP_TYP());
			this.setList_h_InitLevel(struct.getList_h_InitLevel());
			this.setList_h_Sub1_PS_EDITION(struct.getList_h_Sub1_PS_EDITION());
			this.setList_DEVELOP_TYP_name(struct.getList_DEVELOP_TYP_name());
			this.setList_DEVELOP_TYP_val(struct.getList_DEVELOP_TYP_val());
			this.setList_Sub1_CONS_TYP_name(struct.getList_Sub1_CONS_TYP_name());
			this.setList_Sub1_CONS_TYP_val(struct.getList_Sub1_CONS_TYP_val());
			this.setList_c_Sub1_PS_LT_FLG(struct.getList_c_Sub1_PS_LT_FLG());
			this.setList_Sub1_COST_UP_TYP_name(struct.getList_Sub1_COST_UP_TYP_name());
			this.setList_Sub1_COST_UP_TYP_val(struct.getList_Sub1_COST_UP_TYP_val());
			this.setList_Sub1_MRP_EXP_TYP_name(struct.getList_Sub1_MRP_EXP_TYP_name());
			this.setList_Sub1_MRP_EXP_TYP_val(struct.getList_Sub1_MRP_EXP_TYP_val());
			this.setList_h_ProcTyp(struct.getList_h_ProcTyp());
			this.setList_h_MaxLevel(struct.getList_h_MaxLevel());
			this.setList_Lower_ITEM_NAME(struct.getList_Lower_ITEM_NAME());
			this.setList_Lower_ITEM_CD(struct.getList_Lower_ITEM_CD());
			this.setList_Upper_ITEM_NAME(struct.getList_Upper_ITEM_NAME());
			this.setList_Upper_ITEM_CD(struct.getList_Upper_ITEM_CD());
			this.setList_DetParent_ITEM_CD(struct.getList_DetParent_ITEM_CD());
			this.setList_DetParent_ITEM_NAME(struct.getList_DetParent_ITEM_NAME());
			this.setList_DetParent_MRP_ODR_TYP(struct.getList_DetParent_MRP_ODR_TYP());
			this.setList_DetParent_OUTSIDE_TYP(struct.getList_DetParent_OUTSIDE_TYP());
			this.setList_DetComp_ITEM_CD(struct.getList_DetComp_ITEM_CD());
			this.setList_DetComp_ITEM_NAME(struct.getList_DetComp_ITEM_NAME());
			this.setList_DetComp_MRP_ODR_TYP(struct.getList_DetComp_MRP_ODR_TYP());
			this.setList_DetComp_OUTSIDE_TYP(struct.getList_DetComp_OUTSIDE_TYP());
			this.setList_Det_MANHOUR_TYP(struct.getList_Det_MANHOUR_TYP());
			this.setList_Det_PS_EDITION(struct.getList_Det_PS_EDITION());
			this.setList_Det_PS_UNIT_QTY(struct.getList_Det_PS_UNIT_QTY());
			this.setList_Det_STOCK_UNIT(struct.getList_Det_STOCK_UNIT());
			this.setList_Det_EFF_PHASE_IN_DATE(struct.getList_Det_EFF_PHASE_IN_DATE());
			this.setList_Det_EFF_PHASE_OUT_DATE(struct.getList_Det_EFF_PHASE_OUT_DATE());
			this.setList_Det_PS_SPOIL(struct.getList_Det_PS_SPOIL());
			this.setList_Det_CONS_TYP(struct.getList_Det_CONS_TYP());
			this.setList_Det_PS_LT_FLG(struct.getList_Det_PS_LT_FLG());
			this.setList_Det_PS_FIXED_LT(struct.getList_Det_PS_FIXED_LT());
			this.setList_Det_PS_PROP_LT(struct.getList_Det_PS_PROP_LT());
			this.setList_Det_PS_PROP_LOT_SIZE(struct.getList_Det_PS_PROP_LOT_SIZE());
			this.setList_Det_PS_REF_NO(struct.getList_Det_PS_REF_NO());
			this.setList_Det_COST_UP_TYP(struct.getList_Det_COST_UP_TYP());
			this.setList_Det_MRP_EXP_TYP(struct.getList_Det_MRP_EXP_TYP());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_Sub1Parent_ITEM_NAME(struct.getList_Sub1Parent_ITEM_NAME());
			this.setList_Sub1Comp_ITEM_NAME(struct.getList_Sub1Comp_ITEM_NAME());
			this.setList_Sub1_PS_UNIT_NUMERATOR(struct.getList_Sub1_PS_UNIT_NUMERATOR());
			this.setList_Sub1_PS_UNIT_DENOMINATOR(struct.getList_Sub1_PS_UNIT_DENOMINATOR());
			this.setList_Sub1_STOCK_UNIT(struct.getList_Sub1_STOCK_UNIT());
			this.setList_Sub1Comp_STOCK_UNIT(struct.getList_Sub1Comp_STOCK_UNIT());
			this.setList_Sub1_EFF_PHASE_IN_DATE(struct.getList_Sub1_EFF_PHASE_IN_DATE());
			this.setList_Sub1_EFF_PHASE_OUT_DATE(struct.getList_Sub1_EFF_PHASE_OUT_DATE());
			this.setList_Sub1_PS_SPOIL(struct.getList_Sub1_PS_SPOIL());
			this.setList_Sub1_CONS_TYP(struct.getList_Sub1_CONS_TYP());
			this.setList_h_Sub1_PS_LT_FLG(struct.getList_h_Sub1_PS_LT_FLG());
			this.setList_Sub1_PS_FIXED_LT(struct.getList_Sub1_PS_FIXED_LT());
			this.setList_Sub1_PS_PROP_LT(struct.getList_Sub1_PS_PROP_LT());
			this.setList_Sub1_PS_PROP_LOT_SIZE(struct.getList_Sub1_PS_PROP_LOT_SIZE());
			this.setList_Sub1_PS_REF_NO(struct.getList_Sub1_PS_REF_NO());
			this.setList_Sub1_COST_UP_TYP(struct.getList_Sub1_COST_UP_TYP());
			this.setList_Sub1_MRP_EXP_TYP(struct.getList_Sub1_MRP_EXP_TYP());
			this.setList_h_Sub1_MODIFY_COUNT(struct.getList_h_Sub1_MODIFY_COUNT());
			this.setList_Sub1Parent_ITEM_CD(struct.getList_Sub1Parent_ITEM_CD());
			this.setList_Sub1Comp_ITEM_CD(struct.getList_Sub1Comp_ITEM_CD());
			this.setList_Sub1_PS_EDITION(struct.getList_Sub1_PS_EDITION());
			this.setList_Sub1_Pvalue(struct.getList_Sub1_Pvalue());
			this.setList_Sub1_Pname(struct.getList_Sub1_Pname());
			this.setList_Sub1_PLANT(struct.getList_Sub1_PLANT());
			this.setList_Sub1_USER_CD(struct.getList_Sub1_USER_CD());
			this.setList_Sub1_BUSINESS_DATE(struct.getList_Sub1_BUSINESS_DATE());
			this.setList_Lower_MANHOUR_TYP(struct.getList_Lower_MANHOUR_TYP());
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
	// �� 1 �ϐ������l�F i_Target_ITEM_CD


	final static String i_Target_ITEM_CD = null;

	// �� 2 �ϐ������l�F i_DEVELOP_TYP


	final static String i_DEVELOP_TYP = null;

	// �� 3 �ϐ������l�F i_InitLevel


	final static String i_InitLevel = null;

	// �� 4 �ϐ������l�F i_AA0130010tree1


	final static String i_AA0130010tree1 = null;

	// �� 5 �ϐ������l�F i_id


	final static String i_id = null;

	// �� 6 �ϐ������l�F i_lvl


	final static String i_lvl = null;

	// �� 7 �ϐ������l�F i_parent


	final static String i_parent = null;

	// �� 8 �ϐ������l�F i_label


	final static String i_label = null;

	// �� 9 �ϐ������l�F i_ctx


	final static String i_ctx = null;

	// �� 10 �ϐ������l�F i_maxid


	final static String i_maxid = null;

	// �� 11 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 12 �ϐ������l�F i_TargetDate


	final static String i_TargetDate = null;

	// �� 13 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 14 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 15 �ϐ������l�F i_h_Sub1Parent_ITEM_CD


	final static String i_h_Sub1Parent_ITEM_CD = null;

	// �� 16 �ϐ������l�F i_h_Sub1Comp_ITEM_CD


	final static String i_h_Sub1Comp_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_h_Target_ITEM_CD


	final static String i_h_Target_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_h_TargetDate


	final static String i_h_TargetDate = null;

	// �� 19 �ϐ������l�F i_h_DEVELOP_TYP


	final static String i_h_DEVELOP_TYP = null;

	// �� 20 �ϐ������l�F i_h_InitLevel


	final static String i_h_InitLevel = null;

	// �� 21 �ϐ������l�F i_h_Sub1_PS_EDITION


	final static String i_h_Sub1_PS_EDITION = null;

	// �� 22 �ϐ������l�F i_DEVELOP_TYP_name


	final static String i_DEVELOP_TYP_name = null;

	// �� 23 �ϐ������l�F i_DEVELOP_TYP_val


	final static String i_DEVELOP_TYP_val = null;

	// �� 24 �ϐ������l�F i_Sub1_CONS_TYP_name


	final static String i_Sub1_CONS_TYP_name = null;

	// �� 25 �ϐ������l�F i_Sub1_CONS_TYP_val


	final static String i_Sub1_CONS_TYP_val = null;

	// �� 26 �ϐ������l�F i_c_Sub1_PS_LT_FLG


	final static String i_c_Sub1_PS_LT_FLG = null;

	// �� 27 �ϐ������l�F i_Sub1_COST_UP_TYP_name


	final static String i_Sub1_COST_UP_TYP_name = null;

	// �� 28 �ϐ������l�F i_Sub1_COST_UP_TYP_val


	final static String i_Sub1_COST_UP_TYP_val = null;

	// �� 29 �ϐ������l�F i_Sub1_MRP_EXP_TYP_name


	final static String i_Sub1_MRP_EXP_TYP_name = null;

	// �� 30 �ϐ������l�F i_Sub1_MRP_EXP_TYP_val


	final static String i_Sub1_MRP_EXP_TYP_val = null;

	// �� 31 �ϐ������l�F i_h_ProcTyp


	final static String i_h_ProcTyp = null;

	// �� 32 �ϐ������l�F i_h_MaxLevel


	final static String i_h_MaxLevel = null;

	// �� 33 �ϐ������l�F i_Lower_ITEM_NAME


	final static String i_Lower_ITEM_NAME = null;

	// �� 34 �ϐ������l�F i_Lower_ITEM_CD


	final static String i_Lower_ITEM_CD = null;

	// �� 35 �ϐ������l�F i_Upper_ITEM_NAME


	final static String i_Upper_ITEM_NAME = null;

	// �� 36 �ϐ������l�F i_Upper_ITEM_CD


	final static String i_Upper_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_DetParent_ITEM_CD


	final static String i_DetParent_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_DetParent_ITEM_NAME


	final static String i_DetParent_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_DetParent_MRP_ODR_TYP


	final static String i_DetParent_MRP_ODR_TYP = null;

	// �� 40 �ϐ������l�F i_DetParent_OUTSIDE_TYP


	final static String i_DetParent_OUTSIDE_TYP = null;

	// �� 41 �ϐ������l�F i_DetComp_ITEM_CD


	final static String i_DetComp_ITEM_CD = null;

	// �� 42 �ϐ������l�F i_DetComp_ITEM_NAME


	final static String i_DetComp_ITEM_NAME = null;

	// �� 43 �ϐ������l�F i_DetComp_MRP_ODR_TYP


	final static String i_DetComp_MRP_ODR_TYP = null;

	// �� 44 �ϐ������l�F i_DetComp_OUTSIDE_TYP


	final static String i_DetComp_OUTSIDE_TYP = null;

	// �� 45 �ϐ������l�F i_Det_MANHOUR_TYP


	final static String i_Det_MANHOUR_TYP = null;

	// �� 46 �ϐ������l�F i_Det_PS_EDITION


	final static String i_Det_PS_EDITION = null;

	// �� 47 �ϐ������l�F i_Det_PS_UNIT_QTY


	final static String i_Det_PS_UNIT_QTY = null;

	// �� 48 �ϐ������l�F i_Det_STOCK_UNIT


	final static String i_Det_STOCK_UNIT = null;

	// �� 49 �ϐ������l�F i_Det_EFF_PHASE_IN_DATE


	final static String i_Det_EFF_PHASE_IN_DATE = null;

	// �� 50 �ϐ������l�F i_Det_EFF_PHASE_OUT_DATE


	final static String i_Det_EFF_PHASE_OUT_DATE = null;

	// �� 51 �ϐ������l�F i_Det_PS_SPOIL


	final static String i_Det_PS_SPOIL = null;

	// �� 52 �ϐ������l�F i_Det_CONS_TYP


	final static String i_Det_CONS_TYP = null;

	// �� 53 �ϐ������l�F i_Det_PS_LT_FLG


	final static String i_Det_PS_LT_FLG = null;

	// �� 54 �ϐ������l�F i_Det_PS_FIXED_LT


	final static String i_Det_PS_FIXED_LT = null;

	// �� 55 �ϐ������l�F i_Det_PS_PROP_LT


	final static String i_Det_PS_PROP_LT = null;

	// �� 56 �ϐ������l�F i_Det_PS_PROP_LOT_SIZE


	final static String i_Det_PS_PROP_LOT_SIZE = null;

	// �� 57 �ϐ������l�F i_Det_PS_REF_NO


	final static String i_Det_PS_REF_NO = null;

	// �� 58 �ϐ������l�F i_Det_COST_UP_TYP


	final static String i_Det_COST_UP_TYP = null;

	// �� 59 �ϐ������l�F i_Det_MRP_EXP_TYP


	final static String i_Det_MRP_EXP_TYP = null;

	// �� 60 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 61 �ϐ������l�F i_Sub1Parent_ITEM_NAME


	final static String i_Sub1Parent_ITEM_NAME = null;

	// �� 62 �ϐ������l�F i_Sub1Comp_ITEM_NAME


	final static String i_Sub1Comp_ITEM_NAME = null;

	// �� 63 �ϐ������l�F i_Sub1_PS_UNIT_NUMERATOR


	final static String i_Sub1_PS_UNIT_NUMERATOR = null;

	// �� 64 �ϐ������l�F i_Sub1_PS_UNIT_DENOMINATOR


	final static String i_Sub1_PS_UNIT_DENOMINATOR = null;

	// �� 65 �ϐ������l�F i_Sub1_STOCK_UNIT


	final static String i_Sub1_STOCK_UNIT = null;

	// �� 66 �ϐ������l�F i_Sub1Comp_STOCK_UNIT


	final static String i_Sub1Comp_STOCK_UNIT = null;

	// �� 67 �ϐ������l�F i_Sub1_EFF_PHASE_IN_DATE


	final static String i_Sub1_EFF_PHASE_IN_DATE = null;

	// �� 68 �ϐ������l�F i_Sub1_EFF_PHASE_OUT_DATE


	final static String i_Sub1_EFF_PHASE_OUT_DATE = null;

	// �� 69 �ϐ������l�F i_Sub1_PS_SPOIL


	final static String i_Sub1_PS_SPOIL = null;

	// �� 70 �ϐ������l�F i_Sub1_CONS_TYP


	final static String i_Sub1_CONS_TYP = null;

	// �� 71 �ϐ������l�F i_h_Sub1_PS_LT_FLG


	final static String i_h_Sub1_PS_LT_FLG = null;

	// �� 72 �ϐ������l�F i_Sub1_PS_FIXED_LT


	final static String i_Sub1_PS_FIXED_LT = null;

	// �� 73 �ϐ������l�F i_Sub1_PS_PROP_LT


	final static String i_Sub1_PS_PROP_LT = null;

	// �� 74 �ϐ������l�F i_Sub1_PS_PROP_LOT_SIZE


	final static String i_Sub1_PS_PROP_LOT_SIZE = null;

	// �� 75 �ϐ������l�F i_Sub1_PS_REF_NO


	final static String i_Sub1_PS_REF_NO = null;

	// �� 76 �ϐ������l�F i_Sub1_COST_UP_TYP


	final static String i_Sub1_COST_UP_TYP = null;

	// �� 77 �ϐ������l�F i_Sub1_MRP_EXP_TYP


	final static String i_Sub1_MRP_EXP_TYP = null;

	// �� 78 �ϐ������l�F i_h_Sub1_MODIFY_COUNT


	final static String i_h_Sub1_MODIFY_COUNT = null;

	// �� 79 �ϐ������l�F i_Sub1Parent_ITEM_CD


	final static String i_Sub1Parent_ITEM_CD = null;

	// �� 80 �ϐ������l�F i_Sub1Comp_ITEM_CD


	final static String i_Sub1Comp_ITEM_CD = null;

	// �� 81 �ϐ������l�F i_Sub1_PS_EDITION


	final static String i_Sub1_PS_EDITION = null;

	// �� 82 �ϐ������l�F i_Sub1_Pvalue


	final static String i_Sub1_Pvalue = null;

	// �� 83 �ϐ������l�F i_Sub1_Pname


	final static String i_Sub1_Pname = null;

	// �� 84 �ϐ������l�F i_Sub1_PLANT


	final static String i_Sub1_PLANT = null;

	// �� 85 �ϐ������l�F i_Sub1_USER_CD


	final static String i_Sub1_USER_CD = null;

	// �� 86 �ϐ������l�F i_Sub1_BUSINESS_DATE


	final static String i_Sub1_BUSINESS_DATE = null;

	// �� 87 �ϐ������l�F i_Lower_MANHOUR_TYP


	final static String i_Lower_MANHOUR_TYP = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_Lower_ITEM_NAME
        final static String i_Lower_ITEM_NAME = null;
        // �� 2 �ϐ������l�F i_Lower_ITEM_CD
        final static String i_Lower_ITEM_CD = null;
        // �� 3 �ϐ������l�F i_Upper_ITEM_NAME
        final static String i_Upper_ITEM_NAME = null;
        // �� 4 �ϐ������l�F i_Upper_ITEM_CD
        final static String i_Upper_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_DetParent_ITEM_CD
        final static String i_DetParent_ITEM_CD = null;
        // �� 6 �ϐ������l�F i_DetParent_ITEM_NAME
        final static String i_DetParent_ITEM_NAME = null;
        // �� 7 �ϐ������l�F i_DetParent_MRP_ODR_TYP
        final static String i_DetParent_MRP_ODR_TYP = null;
        // �� 8 �ϐ������l�F i_DetParent_OUTSIDE_TYP
        final static String i_DetParent_OUTSIDE_TYP = null;
        // �� 9 �ϐ������l�F i_DetComp_ITEM_CD
        final static String i_DetComp_ITEM_CD = null;
        // �� 10 �ϐ������l�F i_DetComp_ITEM_NAME
        final static String i_DetComp_ITEM_NAME = null;
        // �� 11 �ϐ������l�F i_DetComp_MRP_ODR_TYP
        final static String i_DetComp_MRP_ODR_TYP = null;
        // �� 12 �ϐ������l�F i_DetComp_OUTSIDE_TYP
        final static String i_DetComp_OUTSIDE_TYP = null;
        // �� 13 �ϐ������l�F i_Det_PS_EDITION
        final static String i_Det_PS_EDITION = null;
        // �� 14 �ϐ������l�F i_Det_PS_UNIT_QTY
        final static String i_Det_PS_UNIT_QTY = null;
        // �� 15 �ϐ������l�F i_Det_STOCK_UNIT
        final static String i_Det_STOCK_UNIT = null;
        // �� 16 �ϐ������l�F i_Det_EFF_PHASE_IN_DATE
        final static String i_Det_EFF_PHASE_IN_DATE = null;
        // �� 17 �ϐ������l�F i_Det_EFF_PHASE_OUT_DATE
        final static String i_Det_EFF_PHASE_OUT_DATE = null;
        // �� 18 �ϐ������l�F i_Det_PS_SPOIL
        final static String i_Det_PS_SPOIL = null;
        // �� 19 �ϐ������l�F i_Det_CONS_TYP
        final static String i_Det_CONS_TYP = null;
        // �� 20 �ϐ������l�F i_Det_PS_LT_FLG
        final static String i_Det_PS_LT_FLG = null;
        // �� 21 �ϐ������l�F i_Det_PS_FIXED_LT
        final static String i_Det_PS_FIXED_LT = null;
        // �� 22 �ϐ������l�F i_Det_PS_PROP_LT
        final static String i_Det_PS_PROP_LT = null;
        // �� 23 �ϐ������l�F i_Det_PS_PROP_LOT_SIZE
        final static String i_Det_PS_PROP_LOT_SIZE = null;
        // �� 24 �ϐ������l�F i_Det_PS_REF_NO
        final static String i_Det_PS_REF_NO = null;
        // �� 25 �ϐ������l�F i_Det_COST_UP_TYP
        final static String i_Det_COST_UP_TYP = null;
        // �� 26 �ϐ������l�F i_Det_MRP_EXP_TYP
        final static String i_Det_MRP_EXP_TYP = null;
        // �� 27 �ϐ������l�F i_PS_EDITION
        final static String i_PS_EDITION = null;
        // �� 28 �ϐ������l�F i_Sub1Parent_ITEM_NAME
        final static String i_Sub1Parent_ITEM_NAME = null;
        // �� 29 �ϐ������l�F i_Sub1Comp_ITEM_NAME
        final static String i_Sub1Comp_ITEM_NAME = null;
        // �� 30 �ϐ������l�F i_Sub1_PS_UNIT_NUMERATOR
        final static String i_Sub1_PS_UNIT_NUMERATOR = null;
        // �� 31 �ϐ������l�F i_Sub1_PS_UNIT_DENOMINATOR
        final static String i_Sub1_PS_UNIT_DENOMINATOR = null;
        // �� 32 �ϐ������l�F i_Sub1_STOCK_UNIT
        final static String i_Sub1_STOCK_UNIT = null;
        // �� 33 �ϐ������l�F i_Sub1_EFF_PHASE_IN_DATE
        final static String i_Sub1_EFF_PHASE_IN_DATE = null;
        // �� 34 �ϐ������l�F i_Sub1_EFF_PHASE_OUT_DATE
        final static String i_Sub1_EFF_PHASE_OUT_DATE = null;
        // �� 35 �ϐ������l�F i_Sub1_PS_SPOIL
        final static String i_Sub1_PS_SPOIL = null;
        // �� 36 �ϐ������l�F i_Sub1_CONS_TYP
        final static String i_Sub1_CONS_TYP = null;
        // �� 37 �ϐ������l�F i_h_Sub1_PS_LT_FLG
        final static String i_h_Sub1_PS_LT_FLG = null;
        // �� 38 �ϐ������l�F i_Sub1_PS_FIXED_LT
        final static String i_Sub1_PS_FIXED_LT = null;
        // �� 39 �ϐ������l�F i_Sub1_PS_PROP_LT
        final static String i_Sub1_PS_PROP_LT = null;
        // �� 40 �ϐ������l�F i_Sub1_PS_PROP_LOT_SIZE
        final static String i_Sub1_PS_PROP_LOT_SIZE = null;
        // �� 41 �ϐ������l�F i_Sub1_PS_REF_NO
        final static String i_Sub1_PS_REF_NO = null;
        // �� 42 �ϐ������l�F i_Sub1_COST_UP_TYP
        final static String i_Sub1_COST_UP_TYP = null;
        // �� 43 �ϐ������l�F i_Sub1_MRP_EXP_TYP
        final static String i_Sub1_MRP_EXP_TYP = null;
        // �� 44 �ϐ������l�F i_h_Sub1_MODIFY_COUNT
        final static String i_h_Sub1_MODIFY_COUNT = null;
        // �� 45 �ϐ������l�F i_Sub1Parent_ITEM_CD
        final static String i_Sub1Parent_ITEM_CD = null;
        // �� 46 �ϐ������l�F i_Sub1Comp_ITEM_CD
        final static String i_Sub1Comp_ITEM_CD = null;
        // �� 47 �ϐ������l�F i_Sub1_PS_EDITION
        final static String i_Sub1_PS_EDITION = null;
        // �� 48 �ϐ������l�F i_Target_ITEM_CD
        final static String i_Target_ITEM_CD = null;
        // �� 49 �ϐ������l�F i_DEVELOP_TYP
        final static String i_DEVELOP_TYP = null;
        // �� 50 �ϐ������l�F i_InitLevel
        final static String i_InitLevel = null;
        // �� 51 �ϐ������l�F i_AA0130010tree1
        final static String i_AA0130010tree1 = null;
        // �� 52 �ϐ������l�F i_id
        final static String i_id = null;
        // �� 53 �ϐ������l�F i_lvl
        final static String i_lvl = null;
        // �� 54 �ϐ������l�F i_parent
        final static String i_parent = null;
        // �� 55 �ϐ������l�F i_label
        final static String i_label = null;
        // �� 56 �ϐ������l�F i_ctx
        final static String i_ctx = null;
        // �� 57 �ϐ������l�F i_maxid
        final static String i_maxid = null;
        // �� 58 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 59 �ϐ������l�F i_TargetDate
        final static String i_TargetDate = null;
        // �� 60 �ϐ������l�F i_EFF_PHASE_IN_DATE
        final static String i_EFF_PHASE_IN_DATE = null;
        // �� 61 �ϐ������l�F i_EFF_PHASE_OUT_DATE
        final static String i_EFF_PHASE_OUT_DATE = null;
        // �� 62 �ϐ������l�F i_h_Sub1Parent_ITEM_CD
        final static String i_h_Sub1Parent_ITEM_CD = null;
        // �� 63 �ϐ������l�F i_h_Sub1Comp_ITEM_CD
        final static String i_h_Sub1Comp_ITEM_CD = null;
        // �� 64 �ϐ������l�F i_h_Target_ITEM_CD
        final static String i_h_Target_ITEM_CD = null;
        // �� 65 �ϐ������l�F i_h_TargetDate
        final static String i_h_TargetDate = null;
        // �� 66 �ϐ������l�F i_h_DEVELOP_TYP
        final static String i_h_DEVELOP_TYP = null;
        // �� 67 �ϐ������l�F i_h_InitLevel
        final static String i_h_InitLevel = null;
        // �� 68 �ϐ������l�F i_h_Sub1_PS_EDITION
        final static String i_h_Sub1_PS_EDITION = null;
        // �� 69 �ϐ������l�F i_c_Sub1_PS_LT_FLG
        final static String i_c_Sub1_PS_LT_FLG = null;
        // �� 70 �ϐ������l�F i_h_ProcTyp
        final static String i_h_ProcTyp = null;
        // �� 71 �ϐ������l�F i_h_MaxLevel
        final static String i_h_MaxLevel = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_Lower_ITEM_NAME = i_Lower_ITEM_NAME;
         m_Lower_ITEM_CD = i_Lower_ITEM_CD;
         m_Upper_ITEM_NAME = i_Upper_ITEM_NAME;
         m_Upper_ITEM_CD = i_Upper_ITEM_CD;
         m_DetParent_ITEM_CD = i_DetParent_ITEM_CD;
         m_DetParent_ITEM_NAME = i_DetParent_ITEM_NAME;
         m_DetParent_MRP_ODR_TYP = i_DetParent_MRP_ODR_TYP;
         m_DetParent_OUTSIDE_TYP = i_DetParent_OUTSIDE_TYP;
         m_DetComp_ITEM_CD = i_DetComp_ITEM_CD;
         m_DetComp_ITEM_NAME = i_DetComp_ITEM_NAME;
         m_DetComp_MRP_ODR_TYP = i_DetComp_MRP_ODR_TYP;
         m_DetComp_OUTSIDE_TYP = i_DetComp_OUTSIDE_TYP;
         m_Det_PS_EDITION = i_Det_PS_EDITION;
         m_Det_PS_UNIT_QTY = i_Det_PS_UNIT_QTY;
         m_Det_STOCK_UNIT = i_Det_STOCK_UNIT;
         m_Det_EFF_PHASE_IN_DATE = i_Det_EFF_PHASE_IN_DATE;
         m_Det_EFF_PHASE_OUT_DATE = i_Det_EFF_PHASE_OUT_DATE;
         m_Det_PS_SPOIL = i_Det_PS_SPOIL;
         m_Det_CONS_TYP = i_Det_CONS_TYP;
         m_Det_PS_LT_FLG = i_Det_PS_LT_FLG;
         m_Det_PS_FIXED_LT = i_Det_PS_FIXED_LT;
         m_Det_PS_PROP_LT = i_Det_PS_PROP_LT;
         m_Det_PS_PROP_LOT_SIZE = i_Det_PS_PROP_LOT_SIZE;
         m_Det_PS_REF_NO = i_Det_PS_REF_NO;
         m_Det_COST_UP_TYP = i_Det_COST_UP_TYP;
         m_Det_MRP_EXP_TYP = i_Det_MRP_EXP_TYP;
         m_PS_EDITION = i_PS_EDITION;
         m_Sub1Parent_ITEM_NAME = i_Sub1Parent_ITEM_NAME;
         m_Sub1Comp_ITEM_NAME = i_Sub1Comp_ITEM_NAME;
         m_Sub1_PS_UNIT_NUMERATOR = i_Sub1_PS_UNIT_NUMERATOR;
         m_Sub1_PS_UNIT_DENOMINATOR = i_Sub1_PS_UNIT_DENOMINATOR;
         m_Sub1_STOCK_UNIT = i_Sub1_STOCK_UNIT;
         m_Sub1_EFF_PHASE_IN_DATE = i_Sub1_EFF_PHASE_IN_DATE;
         m_Sub1_EFF_PHASE_OUT_DATE = i_Sub1_EFF_PHASE_OUT_DATE;
         m_Sub1_PS_SPOIL = i_Sub1_PS_SPOIL;
         m_Sub1_CONS_TYP = i_Sub1_CONS_TYP;
         m_h_Sub1_PS_LT_FLG = i_h_Sub1_PS_LT_FLG;
         m_Sub1_PS_FIXED_LT = i_Sub1_PS_FIXED_LT;
         m_Sub1_PS_PROP_LT = i_Sub1_PS_PROP_LT;
         m_Sub1_PS_PROP_LOT_SIZE = i_Sub1_PS_PROP_LOT_SIZE;
         m_Sub1_PS_REF_NO = i_Sub1_PS_REF_NO;
         m_Sub1_COST_UP_TYP = i_Sub1_COST_UP_TYP;
         m_Sub1_MRP_EXP_TYP = i_Sub1_MRP_EXP_TYP;
         m_h_Sub1_MODIFY_COUNT = i_h_Sub1_MODIFY_COUNT;
         m_Sub1Parent_ITEM_CD = i_Sub1Parent_ITEM_CD;
         m_Sub1Comp_ITEM_CD = i_Sub1Comp_ITEM_CD;
         m_Sub1_PS_EDITION = i_Sub1_PS_EDITION;
         m_Target_ITEM_CD = i_Target_ITEM_CD;
         m_DEVELOP_TYP = i_DEVELOP_TYP;
         m_InitLevel = i_InitLevel;
         m_AA0130010tree1 = i_AA0130010tree1;
         m_id = i_id;
         m_lvl = i_lvl;
         m_parent = i_parent;
         m_label = i_label;
         m_ctx = i_ctx;
         m_maxid = i_maxid;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_TargetDate = i_TargetDate;
         m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
         m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
         m_h_Sub1Parent_ITEM_CD = i_h_Sub1Parent_ITEM_CD;
         m_h_Sub1Comp_ITEM_CD = i_h_Sub1Comp_ITEM_CD;
         m_h_Target_ITEM_CD = i_h_Target_ITEM_CD;
         m_h_TargetDate = i_h_TargetDate;
         m_h_DEVELOP_TYP = i_h_DEVELOP_TYP;
         m_h_InitLevel = i_h_InitLevel;
         m_h_Sub1_PS_EDITION = i_h_Sub1_PS_EDITION;
         m_c_Sub1_PS_LT_FLG = i_c_Sub1_PS_LT_FLG;
         m_h_ProcTyp = i_h_ProcTyp;
         m_h_MaxLevel = i_h_MaxLevel;
       
         l_Lower_ITEM_NAME = null;
         l_Lower_ITEM_CD = null;
         l_Upper_ITEM_NAME = null;
         l_Upper_ITEM_CD = null;
         l_DetParent_ITEM_CD = null;
         l_DetParent_ITEM_NAME = null;
         l_DetParent_MRP_ODR_TYP = null;
         l_DetParent_OUTSIDE_TYP = null;
         l_DetComp_ITEM_CD = null;
         l_DetComp_ITEM_NAME = null;
         l_DetComp_MRP_ODR_TYP = null;
         l_DetComp_OUTSIDE_TYP = null;
         l_Det_PS_EDITION = null;
         l_Det_PS_UNIT_QTY = null;
         l_Det_STOCK_UNIT = null;
         l_Det_EFF_PHASE_IN_DATE = null;
         l_Det_EFF_PHASE_OUT_DATE = null;
         l_Det_PS_SPOIL = null;
         l_Det_CONS_TYP = null;
         l_Det_PS_LT_FLG = null;
         l_Det_PS_FIXED_LT = null;
         l_Det_PS_PROP_LT = null;
         l_Det_PS_PROP_LOT_SIZE = null;
         l_Det_PS_REF_NO = null;
         l_Det_COST_UP_TYP = null;
         l_Det_MRP_EXP_TYP = null;
         l_PS_EDITION = null;
         l_Sub1Parent_ITEM_NAME = null;
         l_Sub1Comp_ITEM_NAME = null;
         l_Sub1_PS_UNIT_NUMERATOR = null;
         l_Sub1_PS_UNIT_DENOMINATOR = null;
         l_Sub1_STOCK_UNIT = null;
         l_Sub1_EFF_PHASE_IN_DATE = null;
         l_Sub1_EFF_PHASE_OUT_DATE = null;
         l_Sub1_PS_SPOIL = null;
         l_Sub1_CONS_TYP = null;
         l_h_Sub1_PS_LT_FLG = null;
         l_Sub1_PS_FIXED_LT = null;
         l_Sub1_PS_PROP_LT = null;
         l_Sub1_PS_PROP_LOT_SIZE = null;
         l_Sub1_PS_REF_NO = null;
         l_Sub1_COST_UP_TYP = null;
         l_Sub1_MRP_EXP_TYP = null;
         l_h_Sub1_MODIFY_COUNT = null;
         l_Sub1Parent_ITEM_CD = null;
         l_Sub1Comp_ITEM_CD = null;
         l_Sub1_PS_EDITION = null;
         l_Target_ITEM_CD = null;
         l_DEVELOP_TYP = null;
         l_InitLevel = null;
         l_AA0130010tree1 = null;
         l_id = null;
         l_lvl = null;
         l_parent = null;
         l_label = null;
         l_ctx = null;
         l_maxid = null;
         l_MODIFY_COUNT = null;
         l_TargetDate = null;
         l_EFF_PHASE_IN_DATE = null;
         l_EFF_PHASE_OUT_DATE = null;
         l_h_Sub1Parent_ITEM_CD = null;
         l_h_Sub1Comp_ITEM_CD = null;
         l_h_Target_ITEM_CD = null;
         l_h_TargetDate = null;
         l_h_DEVELOP_TYP = null;
         l_h_InitLevel = null;
         l_h_Sub1_PS_EDITION = null;
         l_c_Sub1_PS_LT_FLG = null;
         l_h_ProcTyp = null;
         l_h_MaxLevel = null;
        }
        public void copyStruct(AA0130010Struct struct){
        		
        		if(struct.m_Sub1Parent_ITEM_CD != null){
        			m_Sub1Parent_ITEM_CD = struct.m_Sub1Parent_ITEM_CD;
        		}else{
        			m_Sub1Parent_ITEM_CD=null;
        		}  
        		if(struct.m_Sub1Parent_ITEM_NAME != null){
        			m_Sub1Parent_ITEM_NAME = struct.m_Sub1Parent_ITEM_NAME;
        		}else{
        			m_Sub1Parent_ITEM_NAME=null;
        		}
        		if(struct.m_Sub1_STOCK_UNIT != null){
        			m_Sub1_STOCK_UNIT = struct.m_Sub1_STOCK_UNIT;
        		}else{
        			m_Sub1_STOCK_UNIT=null;
        		}
        		if(struct.m_Sub1_PS_EDITION != null){
        			m_Sub1_PS_EDITION = struct.m_Sub1_PS_EDITION;
        		}else{
        			m_Sub1_PS_EDITION=null;
        		}     		
        		if(struct.m_Sub1_PS_UNIT_NUMERATOR != null){
        			m_Sub1_PS_UNIT_NUMERATOR = struct.m_Sub1_PS_UNIT_NUMERATOR;
        		}else{
        			m_Sub1_PS_UNIT_NUMERATOR=null;
        		}     		
        		if(struct.m_Sub1_CONS_TYP != null){
        			m_Sub1_CONS_TYP = struct.m_Sub1_CONS_TYP;
        		}else{
        			m_Sub1_CONS_TYP=null;
        		}     		
        		if(struct.m_Sub1_COST_UP_TYP != null){
        			m_Sub1_COST_UP_TYP = struct.m_Sub1_COST_UP_TYP;
        		}else{
        			m_Sub1_COST_UP_TYP=null;
        		}    		
        		if(struct.m_Sub1_MRP_EXP_TYP != null){
        			m_Sub1_MRP_EXP_TYP = struct.m_Sub1_MRP_EXP_TYP;
        		}else{
        			m_Sub1_MRP_EXP_TYP=null;
        		}        		  		
        		if(struct.m_h_Sub1Parent_ITEM_CD != null){
        			m_h_Sub1Parent_ITEM_CD = struct.m_h_Sub1Parent_ITEM_CD;
        		}else{
        			m_h_Sub1Parent_ITEM_CD=null;
        		}
        		if(struct.m_h_Sub1Comp_ITEM_CD != null){
        			m_h_Sub1Comp_ITEM_CD = struct.m_h_Sub1Comp_ITEM_CD;
        		}else{
        			m_h_Sub1Comp_ITEM_CD = null;
        		}
        		if(struct.m_h_Target_ITEM_CD != null){
        			m_h_Target_ITEM_CD=struct.m_h_Target_ITEM_CD;
        		}else{
        			m_h_Target_ITEM_CD =null;
        		}
        		if(struct.m_h_TargetDate != null){
        			m_h_TargetDate=struct.m_h_TargetDate;
        		}else{
        			m_h_TargetDate =null;
        		}
        		if(struct.m_h_DEVELOP_TYP != null){
        			m_h_DEVELOP_TYP=struct.m_h_DEVELOP_TYP;
        		}else{
        			m_h_DEVELOP_TYP =null;
        		}
        		if(struct.m_h_InitLevel != null){
        			m_h_InitLevel=struct.m_h_InitLevel;
        		}else{
        			m_h_InitLevel =null;
        		}
        }
        //}}user_implement_code

	//////////////////////////////

}
