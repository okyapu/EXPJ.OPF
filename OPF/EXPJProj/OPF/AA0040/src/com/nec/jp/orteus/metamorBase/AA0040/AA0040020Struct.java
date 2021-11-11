/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0040/src/com/nec/jp/orteus/metamorBase/AA0040/AA0040020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0040;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0040020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_p_UNIT_COST_TYP_name */
	public String m_p_UNIT_COST_TYP_name = null;
	/** �� 2 �ϐ��F m_p_UNIT_COST_TYP_val */
	public Integer m_p_UNIT_COST_TYP_val = null;
	/** �� 3 �ϐ��F m_p_UNIT_COST_NAME */
	public String m_p_UNIT_COST_NAME = null;
	/** �� 4 �ϐ��F m_w_MRP_ODR_NAME */
	public String m_w_MRP_ODR_NAME = null;
	/** �� 5 �ϐ��F m_w_OUTSIDE_NAME */
	public String m_w_OUTSIDE_NAME = null;
	/** �� 6 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 7 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 8 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 9 �ϐ��F m_p_APPR_REMARKS */
	public String m_p_APPR_REMARKS = null;
	/** �� 10 �ϐ��F m_h_APR_SBCNT_UNIT_COST */
	public String m_h_APR_SBCNT_UNIT_COST = null;
	/** �� 11 �ϐ��F m_h_VEND_ITEM_CD_1 */
	public String m_h_VEND_ITEM_CD_1 = null;
	/** �� 12 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 13 �ϐ��F m_w_RECORD_COUNT */
	public Integer m_w_RECORD_COUNT = null;
	/** �� 14 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 15 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 16 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 17 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 18 �ϐ��F m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** �� 19 �ϐ��F m_w_OUTSIDE_TYP */
	public String m_w_OUTSIDE_TYP = null;
	/** �� 20 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 21 �ϐ��F m_PROC_CD */
	public String m_PROC_CD = null;
	/** �� 22 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 23 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 24 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 25 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 26 �ϐ��F m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** �� 27 �ϐ��F m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** �� 28 �ϐ��F m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** �� 29 �ϐ��F m_VEND_ITEM_CD */
	public String m_VEND_ITEM_CD = null;
	/** �� 30 �ϐ��F m_w_MODIFY_COUNT_H */
	public String m_w_MODIFY_COUNT_H = null;
	/** �� 31 �ϐ��F m_p_EFF_PHASE_IN_DATE */
	public String m_p_EFF_PHASE_IN_DATE = null;
	/** �� 32 �ϐ��F m_p_UNIT_COST */
	public String m_p_UNIT_COST = null;
	/** �� 33 �ϐ��F m_p_UNIT_COST_TYP */
	public Integer m_p_UNIT_COST_TYP = null;
	/** �� 34 �ϐ��F m_p_PROCESSING_COST */
	public String m_p_PROCESSING_COST = null;
	/** �� 35 �ϐ��F m_p_MATERIAL_COST */
	public String m_p_MATERIAL_COST = null;
	/** �� 36 �ϐ��F m_p_OTHER_OVERHEADS */
	public String m_p_OTHER_OVERHEADS = null;
	/** �� 37 �ϐ��F m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** �� 38 �ϐ��F m_p_PLANT_CD */
	public String m_p_PLANT_CD = null;
	/** �� 39 �ϐ��F m_p_USER_CD */
	public String m_p_USER_CD = null;
	/** �� 40 �ϐ��F m_p_BUSINESS_DATE */
	public String m_p_BUSINESS_DATE = null;
	/** �� 41 �ϐ��F m_p_VALUE */
	public String m_p_VALUE = null;
	/** �� 42 �ϐ��F m_p_NAME */
	public String m_p_NAME = null;
	/** �� 43 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_p_UNIT_COST_TYP_name */
	public List l_p_UNIT_COST_TYP_name = null;

	/** �� 2 List�ϐ��F l_p_UNIT_COST_TYP_val */
	public List l_p_UNIT_COST_TYP_val = null;

	/** �� 3 List�ϐ��F l_p_UNIT_COST_NAME */
	public List l_p_UNIT_COST_NAME = null;

	/** �� 4 List�ϐ��F l_w_MRP_ODR_NAME */
	public List l_w_MRP_ODR_NAME = null;

	/** �� 5 List�ϐ��F l_w_OUTSIDE_NAME */
	public List l_w_OUTSIDE_NAME = null;

	/** �� 6 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 7 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 8 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 9 List�ϐ��F l_p_APPR_REMARKS */
	public List l_p_APPR_REMARKS = null;

	/** �� 10 List�ϐ��F l_h_APR_SBCNT_UNIT_COST */
	public List l_h_APR_SBCNT_UNIT_COST = null;

	/** �� 11 List�ϐ��F l_h_VEND_ITEM_CD_1 */
	public List l_h_VEND_ITEM_CD_1 = null;

	/** �� 12 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 13 List�ϐ��F l_w_RECORD_COUNT */
	public List l_w_RECORD_COUNT = null;

	/** �� 14 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 15 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 16 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 17 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 18 List�ϐ��F l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** �� 19 List�ϐ��F l_w_OUTSIDE_TYP */
	public List l_w_OUTSIDE_TYP = null;

	/** �� 20 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 21 List�ϐ��F l_PROC_CD */
	public List l_PROC_CD = null;

	/** �� 22 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 23 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 24 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 25 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 26 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 27 List�ϐ��F l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** �� 28 List�ϐ��F l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** �� 29 List�ϐ��F l_VEND_ITEM_CD */
	public List l_VEND_ITEM_CD = null;

	/** �� 30 List�ϐ��F l_w_MODIFY_COUNT_H */
	public List l_w_MODIFY_COUNT_H = null;

	/** �� 31 List�ϐ��F l_p_EFF_PHASE_IN_DATE */
	public List l_p_EFF_PHASE_IN_DATE = null;

	/** �� 32 List�ϐ��F l_p_UNIT_COST */
	public List l_p_UNIT_COST = null;

	/** �� 33 List�ϐ��F l_p_UNIT_COST_TYP */
	public List l_p_UNIT_COST_TYP = null;

	/** �� 34 List�ϐ��F l_p_PROCESSING_COST */
	public List l_p_PROCESSING_COST = null;

	/** �� 35 List�ϐ��F l_p_MATERIAL_COST */
	public List l_p_MATERIAL_COST = null;

	/** �� 36 List�ϐ��F l_p_OTHER_OVERHEADS */
	public List l_p_OTHER_OVERHEADS = null;

	/** �� 37 List�ϐ��F l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** �� 38 List�ϐ��F l_p_PLANT_CD */
	public List l_p_PLANT_CD = null;

	/** �� 39 List�ϐ��F l_p_USER_CD */
	public List l_p_USER_CD = null;

	/** �� 40 List�ϐ��F l_p_BUSINESS_DATE */
	public List l_p_BUSINESS_DATE = null;

	/** �� 41 List�ϐ��F l_p_VALUE */
	public List l_p_VALUE = null;

	/** �� 42 List�ϐ��F l_p_NAME */
	public List l_p_NAME = null;

	/** �� 43 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getp_UNIT_COST_TYP_name() { return m_p_UNIT_COST_TYP_name; }
	public Integer getp_UNIT_COST_TYP_val() { return m_p_UNIT_COST_TYP_val; }
	public String getp_UNIT_COST_NAME() { return m_p_UNIT_COST_NAME; }
	public String getw_MRP_ODR_NAME() { return m_w_MRP_ODR_NAME; }
	public String getw_OUTSIDE_NAME() { return m_w_OUTSIDE_NAME; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String getp_APPR_REMARKS() { return m_p_APPR_REMARKS; }
	public String geth_APR_SBCNT_UNIT_COST() { return m_h_APR_SBCNT_UNIT_COST; }
	public String geth_VEND_ITEM_CD_1() { return m_h_VEND_ITEM_CD_1; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public Integer getw_RECORD_COUNT() { return m_w_RECORD_COUNT; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getw_OUTSIDE_TYP() { return m_w_OUTSIDE_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getVEND_ITEM_CD() { return m_VEND_ITEM_CD; }
	public String getw_MODIFY_COUNT_H() { return m_w_MODIFY_COUNT_H; }
	public String getp_EFF_PHASE_IN_DATE() { return m_p_EFF_PHASE_IN_DATE; }
	public String getp_UNIT_COST() { return m_p_UNIT_COST; }
	public Integer getp_UNIT_COST_TYP() { return m_p_UNIT_COST_TYP; }
	public String getp_PROCESSING_COST() { return m_p_PROCESSING_COST; }
	public String getp_MATERIAL_COST() { return m_p_MATERIAL_COST; }
	public String getp_OTHER_OVERHEADS() { return m_p_OTHER_OVERHEADS; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public String getp_PLANT_CD() { return m_p_PLANT_CD; }
	public String getp_USER_CD() { return m_p_USER_CD; }
	public String getp_BUSINESS_DATE() { return m_p_BUSINESS_DATE; }
	public String getp_VALUE() { return m_p_VALUE; }
	public String getp_NAME() { return m_p_NAME; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }

	public List getList_p_UNIT_COST_TYP_name() { return l_p_UNIT_COST_TYP_name; }
	public List getList_p_UNIT_COST_TYP_val() { return l_p_UNIT_COST_TYP_val; }
	public List getList_p_UNIT_COST_NAME() { return l_p_UNIT_COST_NAME; }
	public List getList_w_MRP_ODR_NAME() { return l_w_MRP_ODR_NAME; }
	public List getList_w_OUTSIDE_NAME() { return l_w_OUTSIDE_NAME; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_p_APPR_REMARKS() { return l_p_APPR_REMARKS; }
	public List getList_h_APR_SBCNT_UNIT_COST() { return l_h_APR_SBCNT_UNIT_COST; }
	public List getList_h_VEND_ITEM_CD_1() { return l_h_VEND_ITEM_CD_1; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_RECORD_COUNT() { return l_w_RECORD_COUNT; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_w_OUTSIDE_TYP() { return l_w_OUTSIDE_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_VEND_ITEM_CD() { return l_VEND_ITEM_CD; }
	public List getList_w_MODIFY_COUNT_H() { return l_w_MODIFY_COUNT_H; }
	public List getList_p_EFF_PHASE_IN_DATE() { return l_p_EFF_PHASE_IN_DATE; }
	public List getList_p_UNIT_COST() { return l_p_UNIT_COST; }
	public List getList_p_UNIT_COST_TYP() { return l_p_UNIT_COST_TYP; }
	public List getList_p_PROCESSING_COST() { return l_p_PROCESSING_COST; }
	public List getList_p_MATERIAL_COST() { return l_p_MATERIAL_COST; }
	public List getList_p_OTHER_OVERHEADS() { return l_p_OTHER_OVERHEADS; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_p_PLANT_CD() { return l_p_PLANT_CD; }
	public List getList_p_USER_CD() { return l_p_USER_CD; }
	public List getList_p_BUSINESS_DATE() { return l_p_BUSINESS_DATE; }
	public List getList_p_VALUE() { return l_p_VALUE; }
	public List getList_p_NAME() { return l_p_NAME; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }

	public void setp_UNIT_COST_TYP_name(String val) { m_p_UNIT_COST_TYP_name = val; }
	public void setp_UNIT_COST_TYP_val(Integer val) { m_p_UNIT_COST_TYP_val = val; }
	public void setp_UNIT_COST_NAME(String val) { m_p_UNIT_COST_NAME = val; }
	public void setw_MRP_ODR_NAME(String val) { m_w_MRP_ODR_NAME = val; }
	public void setw_OUTSIDE_NAME(String val) { m_w_OUTSIDE_NAME = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void setp_APPR_REMARKS(String val) { m_p_APPR_REMARKS = val; }
	public void seth_APR_SBCNT_UNIT_COST(String val) { m_h_APR_SBCNT_UNIT_COST = val; }
	public void seth_VEND_ITEM_CD_1(String val) { m_h_VEND_ITEM_CD_1 = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_RECORD_COUNT(Integer val) { m_w_RECORD_COUNT = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setw_OUTSIDE_TYP(String val) { m_w_OUTSIDE_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setVEND_ITEM_CD(String val) { m_VEND_ITEM_CD = val; }
	public void setw_MODIFY_COUNT_H(String val) { m_w_MODIFY_COUNT_H = val; }
	public void setp_EFF_PHASE_IN_DATE(String val) { m_p_EFF_PHASE_IN_DATE = val; }
	public void setp_UNIT_COST(String val) { m_p_UNIT_COST = val; }
	public void setp_UNIT_COST_TYP(Integer val) { m_p_UNIT_COST_TYP = val; }
	public void setp_PROCESSING_COST(String val) { m_p_PROCESSING_COST = val; }
	public void setp_MATERIAL_COST(String val) { m_p_MATERIAL_COST = val; }
	public void setp_OTHER_OVERHEADS(String val) { m_p_OTHER_OVERHEADS = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setp_PLANT_CD(String val) { m_p_PLANT_CD = val; }
	public void setp_USER_CD(String val) { m_p_USER_CD = val; }
	public void setp_BUSINESS_DATE(String val) { m_p_BUSINESS_DATE = val; }
	public void setp_VALUE(String val) { m_p_VALUE = val; }
	public void setp_NAME(String val) { m_p_NAME = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }

	public void setp_UNIT_COST_TYP_val(String val) { m_p_UNIT_COST_TYP_val = getInteger(val); }
	public void setw_RECORD_COUNT(String val) { m_w_RECORD_COUNT = getInteger(val); }
	public void setp_UNIT_COST_TYP(String val) { m_p_UNIT_COST_TYP = getInteger(val); }

	public void setList_p_UNIT_COST_TYP_name(List list) { l_p_UNIT_COST_TYP_name = list; }
	public void setList_p_UNIT_COST_TYP_val(List list) { l_p_UNIT_COST_TYP_val = list; }
	public void setList_p_UNIT_COST_NAME(List list) { l_p_UNIT_COST_NAME = list; }
	public void setList_w_MRP_ODR_NAME(List list) { l_w_MRP_ODR_NAME = list; }
	public void setList_w_OUTSIDE_NAME(List list) { l_w_OUTSIDE_NAME = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_p_APPR_REMARKS(List list) { l_p_APPR_REMARKS = list; }
	public void setList_h_APR_SBCNT_UNIT_COST(List list) { l_h_APR_SBCNT_UNIT_COST = list; }
	public void setList_h_VEND_ITEM_CD_1(List list) { l_h_VEND_ITEM_CD_1 = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_RECORD_COUNT(List list) { l_w_RECORD_COUNT = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_w_OUTSIDE_TYP(List list) { l_w_OUTSIDE_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_VEND_ITEM_CD(List list) { l_VEND_ITEM_CD = list; }
	public void setList_w_MODIFY_COUNT_H(List list) { l_w_MODIFY_COUNT_H = list; }
	public void setList_p_EFF_PHASE_IN_DATE(List list) { l_p_EFF_PHASE_IN_DATE = list; }
	public void setList_p_UNIT_COST(List list) { l_p_UNIT_COST = list; }
	public void setList_p_UNIT_COST_TYP(List list) { l_p_UNIT_COST_TYP = list; }
	public void setList_p_PROCESSING_COST(List list) { l_p_PROCESSING_COST = list; }
	public void setList_p_MATERIAL_COST(List list) { l_p_MATERIAL_COST = list; }
	public void setList_p_OTHER_OVERHEADS(List list) { l_p_OTHER_OVERHEADS = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_p_PLANT_CD(List list) { l_p_PLANT_CD = list; }
	public void setList_p_USER_CD(List list) { l_p_USER_CD = list; }
	public void setList_p_BUSINESS_DATE(List list) { l_p_BUSINESS_DATE = list; }
	public void setList_p_VALUE(List list) { l_p_VALUE = list; }
	public void setList_p_NAME(List list) { l_p_NAME = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }

	public int setL2L_p_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP_name == null) {
			l_p_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP_name.add(((AA0040020Struct) list.get(i)).getp_UNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP_val == null) {
			l_p_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP_val.add(((AA0040020Struct) list.get(i)).getp_UNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_NAME == null) {
			l_p_UNIT_COST_NAME = new ArrayList();
		} else {
			l_p_UNIT_COST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_NAME.add(((AA0040020Struct) list.get(i)).getp_UNIT_COST_NAME());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_NAME == null) {
			l_w_MRP_ODR_NAME = new ArrayList();
		} else {
			l_w_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_NAME.add(((AA0040020Struct) list.get(i)).getw_MRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_NAME == null) {
			l_w_OUTSIDE_NAME = new ArrayList();
		} else {
			l_w_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_NAME.add(((AA0040020Struct) list.get(i)).getw_OUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_h_SCREENMOVE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREENMOVE_TYP == null) {
			l_h_SCREENMOVE_TYP = new ArrayList();
		} else {
			l_h_SCREENMOVE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREENMOVE_TYP.add(((AA0040020Struct) list.get(i)).geth_SCREENMOVE_TYP());
		}
		return size;
	}
	public int setL2L_h_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_ID == null) {
			l_h_APPR_ID = new ArrayList();
		} else {
			l_h_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_ID.add(((AA0040020Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((AA0040020Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_p_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_APPR_REMARKS == null) {
			l_p_APPR_REMARKS = new ArrayList();
		} else {
			l_p_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_APPR_REMARKS.add(((AA0040020Struct) list.get(i)).getp_APPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_SBCNT_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_SBCNT_UNIT_COST == null) {
			l_h_APR_SBCNT_UNIT_COST = new ArrayList();
		} else {
			l_h_APR_SBCNT_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_SBCNT_UNIT_COST.add(((AA0040020Struct) list.get(i)).geth_APR_SBCNT_UNIT_COST());
		}
		return size;
	}
	public int setL2L_h_VEND_ITEM_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VEND_ITEM_CD_1 == null) {
			l_h_VEND_ITEM_CD_1 = new ArrayList();
		} else {
			l_h_VEND_ITEM_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VEND_ITEM_CD_1.add(((AA0040020Struct) list.get(i)).geth_VEND_ITEM_CD_1());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((AA0040020Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_RECORD_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RECORD_COUNT == null) {
			l_w_RECORD_COUNT = new ArrayList();
		} else {
			l_w_RECORD_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RECORD_COUNT.add(((AA0040020Struct) list.get(i)).getw_RECORD_COUNT());
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
			l_ITEM_CD.add(((AA0040020Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AA0040020Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0040020Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0040020Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP == null) {
			l_w_MRP_ODR_TYP = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP.add(((AA0040020Struct) list.get(i)).getw_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP == null) {
			l_w_OUTSIDE_TYP = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP.add(((AA0040020Struct) list.get(i)).getw_OUTSIDE_TYP());
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
			l_COMPANY_CD.add(((AA0040020Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_CD == null) {
			l_PROC_CD = new ArrayList();
		} else {
			l_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_CD.add(((AA0040020Struct) list.get(i)).getPROC_CD());
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
			l_PROC_NAME.add(((AA0040020Struct) list.get(i)).getPROC_NAME());
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
			l_VEND_CD.add(((AA0040020Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AA0040020Struct) list.get(i)).getVEND_ANAME());
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
			l_CUR_CD.add(((AA0040020Struct) list.get(i)).getCUR_CD());
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
			l_ROUND_TYP.add(((AA0040020Struct) list.get(i)).getROUND_TYP());
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
			l_CUR_NAME.add(((AA0040020Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AA0040020Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_VEND_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ITEM_CD == null) {
			l_VEND_ITEM_CD = new ArrayList();
		} else {
			l_VEND_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ITEM_CD.add(((AA0040020Struct) list.get(i)).getVEND_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT_H(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT_H == null) {
			l_w_MODIFY_COUNT_H = new ArrayList();
		} else {
			l_w_MODIFY_COUNT_H.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT_H.add(((AA0040020Struct) list.get(i)).getw_MODIFY_COUNT_H());
		}
		return size;
	}
	public int setL2L_p_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_EFF_PHASE_IN_DATE == null) {
			l_p_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_p_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_EFF_PHASE_IN_DATE.add(((AA0040020Struct) list.get(i)).getp_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST == null) {
			l_p_UNIT_COST = new ArrayList();
		} else {
			l_p_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST.add(((AA0040020Struct) list.get(i)).getp_UNIT_COST());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP == null) {
			l_p_UNIT_COST_TYP = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP.add(((AA0040020Struct) list.get(i)).getp_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_p_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_PROCESSING_COST == null) {
			l_p_PROCESSING_COST = new ArrayList();
		} else {
			l_p_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_PROCESSING_COST.add(((AA0040020Struct) list.get(i)).getp_PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_p_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_MATERIAL_COST == null) {
			l_p_MATERIAL_COST = new ArrayList();
		} else {
			l_p_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_MATERIAL_COST.add(((AA0040020Struct) list.get(i)).getp_MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_p_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_OTHER_OVERHEADS == null) {
			l_p_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_p_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_OTHER_OVERHEADS.add(((AA0040020Struct) list.get(i)).getp_OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AA0040020Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_p_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_PLANT_CD == null) {
			l_p_PLANT_CD = new ArrayList();
		} else {
			l_p_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_PLANT_CD.add(((AA0040020Struct) list.get(i)).getp_PLANT_CD());
		}
		return size;
	}
	public int setL2L_p_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_USER_CD == null) {
			l_p_USER_CD = new ArrayList();
		} else {
			l_p_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_USER_CD.add(((AA0040020Struct) list.get(i)).getp_USER_CD());
		}
		return size;
	}
	public int setL2L_p_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_BUSINESS_DATE == null) {
			l_p_BUSINESS_DATE = new ArrayList();
		} else {
			l_p_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_BUSINESS_DATE.add(((AA0040020Struct) list.get(i)).getp_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_p_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_VALUE == null) {
			l_p_VALUE = new ArrayList();
		} else {
			l_p_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_VALUE.add(((AA0040020Struct) list.get(i)).getp_VALUE());
		}
		return size;
	}
	public int setL2L_p_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_NAME == null) {
			l_p_NAME = new ArrayList();
		} else {
			l_p_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_NAME.add(((AA0040020Struct) list.get(i)).getp_NAME());
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
			l_EFF_PHASE_IN_DATE.add(((AA0040020Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_p_UNIT_COST_TYP_name = null;
		m_p_UNIT_COST_TYP_val = null;
		m_p_UNIT_COST_NAME = null;
		m_w_MRP_ODR_NAME = null;
		m_w_OUTSIDE_NAME = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_p_APPR_REMARKS = null;
		m_h_APR_SBCNT_UNIT_COST = null;
		m_h_VEND_ITEM_CD_1 = null;
		m_w_PLANT_CD = null;
		m_w_RECORD_COUNT = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_w_MRP_ODR_TYP = null;
		m_w_OUTSIDE_TYP = null;
		m_COMPANY_CD = null;
		m_PROC_CD = null;
		m_PROC_NAME = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_CUR_CD = null;
		m_ROUND_TYP = null;
		m_CUR_NAME = null;
		m_DECIMAL_FIG = null;
		m_VEND_ITEM_CD = null;
		m_w_MODIFY_COUNT_H = null;
		m_p_EFF_PHASE_IN_DATE = null;
		m_p_UNIT_COST = null;
		m_p_UNIT_COST_TYP = null;
		m_p_PROCESSING_COST = null;
		m_p_MATERIAL_COST = null;
		m_p_OTHER_OVERHEADS = null;
		m_w_MODIFY_COUNT = null;
		m_p_PLANT_CD = null;
		m_p_USER_CD = null;
		m_p_BUSINESS_DATE = null;
		m_p_VALUE = null;
		m_p_NAME = null;
		m_EFF_PHASE_IN_DATE = null;

		l_p_UNIT_COST_TYP_name = null;
		l_p_UNIT_COST_TYP_val = null;
		l_p_UNIT_COST_NAME = null;
		l_w_MRP_ODR_NAME = null;
		l_w_OUTSIDE_NAME = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_p_APPR_REMARKS = null;
		l_h_APR_SBCNT_UNIT_COST = null;
		l_h_VEND_ITEM_CD_1 = null;
		l_w_PLANT_CD = null;
		l_w_RECORD_COUNT = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_w_MRP_ODR_TYP = null;
		l_w_OUTSIDE_TYP = null;
		l_COMPANY_CD = null;
		l_PROC_CD = null;
		l_PROC_NAME = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_CUR_CD = null;
		l_ROUND_TYP = null;
		l_CUR_NAME = null;
		l_DECIMAL_FIG = null;
		l_VEND_ITEM_CD = null;
		l_w_MODIFY_COUNT_H = null;
		l_p_EFF_PHASE_IN_DATE = null;
		l_p_UNIT_COST = null;
		l_p_UNIT_COST_TYP = null;
		l_p_PROCESSING_COST = null;
		l_p_MATERIAL_COST = null;
		l_p_OTHER_OVERHEADS = null;
		l_w_MODIFY_COUNT = null;
		l_p_PLANT_CD = null;
		l_p_USER_CD = null;
		l_p_BUSINESS_DATE = null;
		l_p_VALUE = null;
		l_p_NAME = null;
		l_EFF_PHASE_IN_DATE = null;

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
	 * medAA0040020�N���X�̕W���R���X�g���N�^
	 */
	public AA0040020Struct()
	{
		//{{user_implement_code_constractor
			initialize();
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
	public void setStruct(AA0040020Struct struct)
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
	public void setStructM(AA0040020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setp_UNIT_COST_TYP_name(struct.getp_UNIT_COST_TYP_name());
			this.setp_UNIT_COST_TYP_val(struct.getp_UNIT_COST_TYP_val());
			this.setp_UNIT_COST_NAME(struct.getp_UNIT_COST_NAME());
			this.setw_MRP_ODR_NAME(struct.getw_MRP_ODR_NAME());
			this.setw_OUTSIDE_NAME(struct.getw_OUTSIDE_NAME());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.setp_APPR_REMARKS(struct.getp_APPR_REMARKS());
			this.seth_APR_SBCNT_UNIT_COST(struct.geth_APR_SBCNT_UNIT_COST());
			this.seth_VEND_ITEM_CD_1(struct.geth_VEND_ITEM_CD_1());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_RECORD_COUNT(struct.getw_RECORD_COUNT());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setw_OUTSIDE_TYP(struct.getw_OUTSIDE_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPROC_CD(struct.getPROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setVEND_ITEM_CD(struct.getVEND_ITEM_CD());
			this.setw_MODIFY_COUNT_H(struct.getw_MODIFY_COUNT_H());
			this.setp_EFF_PHASE_IN_DATE(struct.getp_EFF_PHASE_IN_DATE());
			this.setp_UNIT_COST(struct.getp_UNIT_COST());
			this.setp_UNIT_COST_TYP(struct.getp_UNIT_COST_TYP());
			this.setp_PROCESSING_COST(struct.getp_PROCESSING_COST());
			this.setp_MATERIAL_COST(struct.getp_MATERIAL_COST());
			this.setp_OTHER_OVERHEADS(struct.getp_OTHER_OVERHEADS());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setp_PLANT_CD(struct.getp_PLANT_CD());
			this.setp_USER_CD(struct.getp_USER_CD());
			this.setp_BUSINESS_DATE(struct.getp_BUSINESS_DATE());
			this.setp_VALUE(struct.getp_VALUE());
			this.setp_NAME(struct.getp_NAME());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0040020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_p_UNIT_COST_TYP_name(struct.getList_p_UNIT_COST_TYP_name());
			this.setList_p_UNIT_COST_TYP_val(struct.getList_p_UNIT_COST_TYP_val());
			this.setList_p_UNIT_COST_NAME(struct.getList_p_UNIT_COST_NAME());
			this.setList_w_MRP_ODR_NAME(struct.getList_w_MRP_ODR_NAME());
			this.setList_w_OUTSIDE_NAME(struct.getList_w_OUTSIDE_NAME());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_p_APPR_REMARKS(struct.getList_p_APPR_REMARKS());
			this.setList_h_APR_SBCNT_UNIT_COST(struct.getList_h_APR_SBCNT_UNIT_COST());
			this.setList_h_VEND_ITEM_CD_1(struct.getList_h_VEND_ITEM_CD_1());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_RECORD_COUNT(struct.getList_w_RECORD_COUNT());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_w_OUTSIDE_TYP(struct.getList_w_OUTSIDE_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_VEND_ITEM_CD(struct.getList_VEND_ITEM_CD());
			this.setList_w_MODIFY_COUNT_H(struct.getList_w_MODIFY_COUNT_H());
			this.setList_p_EFF_PHASE_IN_DATE(struct.getList_p_EFF_PHASE_IN_DATE());
			this.setList_p_UNIT_COST(struct.getList_p_UNIT_COST());
			this.setList_p_UNIT_COST_TYP(struct.getList_p_UNIT_COST_TYP());
			this.setList_p_PROCESSING_COST(struct.getList_p_PROCESSING_COST());
			this.setList_p_MATERIAL_COST(struct.getList_p_MATERIAL_COST());
			this.setList_p_OTHER_OVERHEADS(struct.getList_p_OTHER_OVERHEADS());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_p_PLANT_CD(struct.getList_p_PLANT_CD());
			this.setList_p_USER_CD(struct.getList_p_USER_CD());
			this.setList_p_BUSINESS_DATE(struct.getList_p_BUSINESS_DATE());
			this.setList_p_VALUE(struct.getList_p_VALUE());
			this.setList_p_NAME(struct.getList_p_NAME());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
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
	// �� 1 �ϐ������l�F i_p_UNIT_COST_TYP_name


	final static String i_p_UNIT_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_p_UNIT_COST_TYP_val


	final static Integer i_p_UNIT_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_p_UNIT_COST_NAME


	final static String i_p_UNIT_COST_NAME = null;

	// �� 4 �ϐ������l�F i_w_MRP_ODR_NAME


	final static String i_w_MRP_ODR_NAME = null;

	// �� 5 �ϐ������l�F i_w_OUTSIDE_NAME


	final static String i_w_OUTSIDE_NAME = null;

	// �� 6 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 7 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 8 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 9 �ϐ������l�F i_p_APPR_REMARKS


	final static String i_p_APPR_REMARKS = null;

	// �� 10 �ϐ������l�F i_h_APR_SBCNT_UNIT_COST


	final static String i_h_APR_SBCNT_UNIT_COST = null;

	// �� 11 �ϐ������l�F i_h_VEND_ITEM_CD_1


	final static String i_h_VEND_ITEM_CD_1 = null;

	// �� 12 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 13 �ϐ������l�F i_w_RECORD_COUNT


	final static Integer i_w_RECORD_COUNT = null;

	// �� 14 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 16 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 17 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 18 �ϐ������l�F i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// �� 19 �ϐ������l�F i_w_OUTSIDE_TYP


	final static String i_w_OUTSIDE_TYP = null;

	// �� 20 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 21 �ϐ������l�F i_PROC_CD


	final static String i_PROC_CD = null;

	// �� 22 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 23 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 24 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 25 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 26 �ϐ������l�F i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// �� 27 �ϐ������l�F i_CUR_NAME


	final static String i_CUR_NAME = null;

	// �� 28 �ϐ������l�F i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// �� 29 �ϐ������l�F i_VEND_ITEM_CD


	final static String i_VEND_ITEM_CD = null;

	// �� 30 �ϐ������l�F i_w_MODIFY_COUNT_H


	final static String i_w_MODIFY_COUNT_H = null;

	// �� 31 �ϐ������l�F i_p_EFF_PHASE_IN_DATE


	final static String i_p_EFF_PHASE_IN_DATE = null;

	// �� 32 �ϐ������l�F i_p_UNIT_COST


	final static String i_p_UNIT_COST = null;

	// �� 33 �ϐ������l�F i_p_UNIT_COST_TYP


	final static Integer i_p_UNIT_COST_TYP = null;

	// �� 34 �ϐ������l�F i_p_PROCESSING_COST


	final static String i_p_PROCESSING_COST = null;

	// �� 35 �ϐ������l�F i_p_MATERIAL_COST


	final static String i_p_MATERIAL_COST = null;

	// �� 36 �ϐ������l�F i_p_OTHER_OVERHEADS


	final static String i_p_OTHER_OVERHEADS = null;

	// �� 37 �ϐ������l�F i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// �� 38 �ϐ������l�F i_p_PLANT_CD


	final static String i_p_PLANT_CD = null;

	// �� 39 �ϐ������l�F i_p_USER_CD


	final static String i_p_USER_CD = null;

	// �� 40 �ϐ������l�F i_p_BUSINESS_DATE


	final static String i_p_BUSINESS_DATE = null;

	// �� 41 �ϐ������l�F i_p_VALUE


	final static String i_p_VALUE = null;

	// �� 42 �ϐ������l�F i_p_NAME


	final static String i_p_NAME = null;

	// �� 43 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

*/

	//{{user_implement_code
	//------------------------------------------------------------------

	/**
	 * ������
	 */
	public void initialize()
	{
		clear();
		m_p_UNIT_COST =  new String("0");
		m_p_PROCESSING_COST =  new String("0");
		m_p_MATERIAL_COST =  new String("0");
		m_p_OTHER_OVERHEADS =  new String("0");
		
		l_ITEM_CD = new ArrayList(0);
		l_ITEM_NAME = new ArrayList(0);
		l_DRAW_CD = new ArrayList(0);
		l_SPEC = new ArrayList(0);
		l_w_MRP_ODR_TYP = new ArrayList(0);
		l_w_OUTSIDE_TYP = new ArrayList(0);
		l_COMPANY_CD = new ArrayList(0);
		l_PROC_CD = new ArrayList(0);
		l_PROC_NAME = new ArrayList(0);
		l_w_PLANT_CD = new ArrayList(0);
		l_VEND_CD = new ArrayList(0);
		l_VEND_ANAME = new ArrayList(0);
		l_VEND_ITEM_CD = new ArrayList(0);
		l_p_EFF_PHASE_IN_DATE = new ArrayList(0);
		l_p_UNIT_COST = new ArrayList(0);
		l_p_UNIT_COST_TYP = new ArrayList(0);
		l_p_PROCESSING_COST = new ArrayList(0);
		l_p_MATERIAL_COST = new ArrayList(0);
		l_p_OTHER_OVERHEADS = new ArrayList(0);
		l_p_UNIT_COST_TYP_name = new ArrayList(0);
		l_p_UNIT_COST_TYP_val = new ArrayList(0);
	}

	/**
	 * �T�u�t�H�[���p�f�[�^�R�s�[
	 */

	public void copy(AA0040020Struct struct){

		if(struct.m_COMPANY_CD != null){ 
			m_COMPANY_CD = new String(struct.m_COMPANY_CD);
		}

		if(struct.m_w_PLANT_CD != null){ 
			m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		}

		if(struct.m_ITEM_CD != null){ 
			m_ITEM_CD = new String(struct.m_ITEM_CD);
		}

		if(struct.m_ITEM_NAME != null){ 
			m_ITEM_NAME = new String(struct.m_ITEM_NAME);
		}

		if(struct.m_PROC_CD != null){ 
			m_PROC_CD = new String(struct.m_PROC_CD);
		}

		if(struct.m_PROC_NAME != null){ 
			m_PROC_NAME = new String(struct.m_PROC_NAME);
		}

		if(struct.m_VEND_CD != null){ 
			m_VEND_CD = new String(struct.m_VEND_CD);
		}

		if(struct.m_VEND_ANAME != null){ 
			m_VEND_ANAME = new String(struct.m_VEND_ANAME);
		}

		if(struct.m_VEND_ITEM_CD != null){ 
			m_VEND_ITEM_CD = new String(struct.m_VEND_ITEM_CD);
		}

		if(struct.m_p_UNIT_COST_TYP != null){ 
			m_p_UNIT_COST_TYP = new Integer(struct.m_p_UNIT_COST_TYP.intValue());
		}

		if(struct.m_p_PROCESSING_COST != null){ 
			m_p_PROCESSING_COST = new String(struct.m_p_PROCESSING_COST);
		}

		if(struct.m_p_MATERIAL_COST != null){ 
			m_p_MATERIAL_COST = new String(struct.m_p_MATERIAL_COST);
		}

		if(struct.m_p_OTHER_OVERHEADS != null){ 
			m_p_OTHER_OVERHEADS = new String(struct.m_p_OTHER_OVERHEADS);
		}

		if(struct.m_DRAW_CD != null){ 
			m_DRAW_CD = new String(struct.m_DRAW_CD);
		}

		if(struct.m_SPEC != null){ 
			m_SPEC = new String(struct.m_SPEC);
		}

		if(struct.m_w_MRP_ODR_TYP != null){
			m_w_MRP_ODR_TYP = new String(struct.m_w_MRP_ODR_TYP);
		}

		if(struct.m_w_OUTSIDE_TYP != null){
			m_w_OUTSIDE_TYP = new String(struct.m_w_OUTSIDE_TYP);
		}

		if(struct.m_w_MODIFY_COUNT != null){ 
			m_w_MODIFY_COUNT = new String(struct.m_w_MODIFY_COUNT);
		}

		if(struct.m_w_MODIFY_COUNT_H != null){ 
			m_w_MODIFY_COUNT_H = new String(struct.m_w_MODIFY_COUNT_H);
		}

		//�T�u��ʗp
		if(struct.m_p_EFF_PHASE_IN_DATE != null){ 
			m_p_EFF_PHASE_IN_DATE = new String(struct.m_p_EFF_PHASE_IN_DATE);
		}

		if(struct.m_p_UNIT_COST != null){ 
			m_p_UNIT_COST = new String(struct.m_p_UNIT_COST);
		}

		if(struct.m_CUR_CD != null){ 
			m_CUR_CD = new String(struct.m_CUR_CD);
		}
		
		if(struct.m_CUR_NAME != null){ 
			m_CUR_NAME = new String(struct.m_CUR_NAME);
		}
		
		if(struct.m_h_APR_SBCNT_UNIT_COST != null){
			m_h_APR_SBCNT_UNIT_COST = new String(struct.m_h_APR_SBCNT_UNIT_COST);
		}
		
	}

	public void keycopy(AA0040020Struct struct){

		if(struct.m_COMPANY_CD != null){ 
			m_COMPANY_CD = new String(struct.m_COMPANY_CD);
		}else{
			m_COMPANY_CD = null;
		}

		if(struct.m_w_PLANT_CD != null){ 
			m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		}else{
			m_w_PLANT_CD = null;
		}

		if(struct.m_ITEM_CD != null){ 
			m_ITEM_CD = new String(struct.m_ITEM_CD);
		}else{
			m_ITEM_CD = null;
		}

		if(struct.m_VEND_CD != null){ 
			m_VEND_CD = new String(struct.m_VEND_CD);
		}else{
			m_VEND_CD = null;
		}

		if(struct.m_PROC_CD != null){ 
			m_PROC_CD = new String(struct.m_PROC_CD);
		}else{
			m_PROC_CD = null;
		}
		
		if(struct.m_h_APR_SBCNT_UNIT_COST!= null){
			m_h_APR_SBCNT_UNIT_COST = new String(struct.m_h_APR_SBCNT_UNIT_COST);
		}else{
			m_h_APR_SBCNT_UNIT_COST = null;
		}
		
		if(struct.m_h_APPR_ID != null){
       	 	m_h_APPR_ID = new String(struct.m_h_APPR_ID);
        }else{
        	m_h_APPR_ID = null;
        }
		
        if(struct.m_h_SCREENMOVE_TYP != null){
        	m_h_SCREENMOVE_TYP = new String(struct.m_h_SCREENMOVE_TYP);
        }else{
        	m_h_SCREENMOVE_TYP = null;
        }
        
        if(struct.m_EFF_PHASE_IN_DATE != null){
        	m_EFF_PHASE_IN_DATE = new String(struct.m_EFF_PHASE_IN_DATE);
        }else{
        	m_EFF_PHASE_IN_DATE = null;
        }
	}

	//------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
