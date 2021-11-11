/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0100;

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

public class KA0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_EXCH_TYP_name */
	public String m_EXCH_TYP_name = null;
	/** �� 2 �ϐ��F m_EXCH_TYP_val */
	public String m_EXCH_TYP_val = null;
	/** �� 3 �ϐ��F m_TAX_APPLY_TYP_name */
	public String m_TAX_APPLY_TYP_name = null;
	/** �� 4 �ϐ��F m_TAX_APPLY_TYP_val */
	public String m_TAX_APPLY_TYP_val = null;
	/** �� 5 �ϐ��F m_TAX_CALC_TYP_name */
	public String m_TAX_CALC_TYP_name = null;
	/** �� 6 �ϐ��F m_TAX_CALC_TYP_val */
	public String m_TAX_CALC_TYP_val = null;
	/** �� 7 �ϐ��F m_PARTIAL_SHIP_INST_FLG_name */
	public String m_PARTIAL_SHIP_INST_FLG_name = null;
	/** �� 8 �ϐ��F m_PARTIAL_SHIP_INST_FLG_val */
	public String m_PARTIAL_SHIP_INST_FLG_val = null;
	/** �� 9 �ϐ��F m_h_RESULT */
	public String m_h_RESULT = null;
	/** �� 10 �ϐ��F m_k_MODE */
	public String m_k_MODE = null;
	/** �� 11 �ϐ��F m_INSPC_ACPT_TYP_name */
	public String m_INSPC_ACPT_TYP_name = null;
	/** �� 12 �ϐ��F m_INSPC_ACPT_TYP_val */
	public String m_INSPC_ACPT_TYP_val = null;
	/** �� 13 �ϐ��F m_DETAIL_ROUND_TYP_name */
	public String m_DETAIL_ROUND_TYP_name = null;
	/** �� 14 �ϐ��F m_DETAIL_ROUND_TYP_val */
	public String m_DETAIL_ROUND_TYP_val = null;
	/** �� 15 �ϐ��F m_h_CUR_CD */
	public Double m_h_CUR_CD = null;
	/** �� 16 �ϐ��F m_h_INSPC_ACPT_TYP */
	public Double m_h_INSPC_ACPT_TYP = null;
	/** �� 17 �ϐ��F m_h_TAX_CALC_TYP */
	public Double m_h_TAX_CALC_TYP = null;
	/** �� 18 �ϐ��F m_h_PRICE_ROUND_TYP */
	public Double m_h_PRICE_ROUND_TYP = null;
	/** �� 19 �ϐ��F m_h_CUST_CD */
	public String m_h_CUST_CD = null;
	/** �� 20 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 21 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 22 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 23 �ϐ��F m_h_APR_CUST */
	public String m_h_APR_CUST = null;
	/** �� 24 �ϐ��F m_SYS_COMPANY_CD */
	public String m_SYS_COMPANY_CD = null;
	/** �� 25 �ϐ��F m_T_CUST_CD */
	public String m_T_CUST_CD = null;
	/** �� 26 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 27 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 28 �ϐ��F m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** �� 29 �ϐ��F m_CUST_KNAME */
	public String m_CUST_KNAME = null;
	/** �� 30 �ϐ��F m_OWN_ORG_CD */
	public String m_OWN_ORG_CD = null;
	/** �� 31 �ϐ��F m_OWN_PERSON_CD */
	public String m_OWN_PERSON_CD = null;
	/** �� 32 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 33 �ϐ��F m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** �� 34 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 35 �ϐ��F m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** �� 36 �ϐ��F m_TAX_CALC_TYP */
	public String m_TAX_CALC_TYP = null;
	/** �� 37 �ϐ��F m_UNCONFIRM_ODR_EFF_PRIOD */
	public String m_UNCONFIRM_ODR_EFF_PRIOD = null;
	/** �� 38 �ϐ��F m_UNCONFIRM_ODR_EFF_TERM_FLG */
	public String m_UNCONFIRM_ODR_EFF_TERM_FLG = null;
	/** �� 39 �ϐ��F m_PARTIAL_SHIP_INST_FLG */
	public String m_PARTIAL_SHIP_INST_FLG = null;
	/** �� 40 �ϐ��F m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** �� 41 �ϐ��F m_PRICE_ROUND_TYP */
	public String m_PRICE_ROUND_TYP = null;
	/** �� 42 �ϐ��F m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** �� 43 �ϐ��F m_EDI_CUST_VEND_CD */
	public String m_EDI_CUST_VEND_CD = null;
	/** �� 44 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 45 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 46 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 47 �ϐ��F m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** �� 48 �ϐ��F m_TAX_NAME */
	public String m_TAX_NAME = null;
	/** �� 49 �ϐ��F m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** �� 50 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** �� 51 �ϐ��F m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_EXCH_TYP_name */
	public List l_EXCH_TYP_name = null;

	/** �� 2 List�ϐ��F l_EXCH_TYP_val */
	public List l_EXCH_TYP_val = null;

	/** �� 3 List�ϐ��F l_TAX_APPLY_TYP_name */
	public List l_TAX_APPLY_TYP_name = null;

	/** �� 4 List�ϐ��F l_TAX_APPLY_TYP_val */
	public List l_TAX_APPLY_TYP_val = null;

	/** �� 5 List�ϐ��F l_TAX_CALC_TYP_name */
	public List l_TAX_CALC_TYP_name = null;

	/** �� 6 List�ϐ��F l_TAX_CALC_TYP_val */
	public List l_TAX_CALC_TYP_val = null;

	/** �� 7 List�ϐ��F l_PARTIAL_SHIP_INST_FLG_name */
	public List l_PARTIAL_SHIP_INST_FLG_name = null;

	/** �� 8 List�ϐ��F l_PARTIAL_SHIP_INST_FLG_val */
	public List l_PARTIAL_SHIP_INST_FLG_val = null;

	/** �� 9 List�ϐ��F l_h_RESULT */
	public List l_h_RESULT = null;

	/** �� 10 List�ϐ��F l_k_MODE */
	public List l_k_MODE = null;

	/** �� 11 List�ϐ��F l_INSPC_ACPT_TYP_name */
	public List l_INSPC_ACPT_TYP_name = null;

	/** �� 12 List�ϐ��F l_INSPC_ACPT_TYP_val */
	public List l_INSPC_ACPT_TYP_val = null;

	/** �� 13 List�ϐ��F l_DETAIL_ROUND_TYP_name */
	public List l_DETAIL_ROUND_TYP_name = null;

	/** �� 14 List�ϐ��F l_DETAIL_ROUND_TYP_val */
	public List l_DETAIL_ROUND_TYP_val = null;

	/** �� 15 List�ϐ��F l_h_CUR_CD */
	public List l_h_CUR_CD = null;

	/** �� 16 List�ϐ��F l_h_INSPC_ACPT_TYP */
	public List l_h_INSPC_ACPT_TYP = null;

	/** �� 17 List�ϐ��F l_h_TAX_CALC_TYP */
	public List l_h_TAX_CALC_TYP = null;

	/** �� 18 List�ϐ��F l_h_PRICE_ROUND_TYP */
	public List l_h_PRICE_ROUND_TYP = null;

	/** �� 19 List�ϐ��F l_h_CUST_CD */
	public List l_h_CUST_CD = null;

	/** �� 20 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 21 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 22 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 23 List�ϐ��F l_h_APR_CUST */
	public List l_h_APR_CUST = null;

	/** �� 24 List�ϐ��F l_SYS_COMPANY_CD */
	public List l_SYS_COMPANY_CD = null;

	/** �� 25 List�ϐ��F l_T_CUST_CD */
	public List l_T_CUST_CD = null;

	/** �� 26 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 27 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 28 List�ϐ��F l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** �� 29 List�ϐ��F l_CUST_KNAME */
	public List l_CUST_KNAME = null;

	/** �� 30 List�ϐ��F l_OWN_ORG_CD */
	public List l_OWN_ORG_CD = null;

	/** �� 31 List�ϐ��F l_OWN_PERSON_CD */
	public List l_OWN_PERSON_CD = null;

	/** �� 32 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 33 List�ϐ��F l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** �� 34 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 35 List�ϐ��F l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** �� 36 List�ϐ��F l_TAX_CALC_TYP */
	public List l_TAX_CALC_TYP = null;

	/** �� 37 List�ϐ��F l_UNCONFIRM_ODR_EFF_PRIOD */
	public List l_UNCONFIRM_ODR_EFF_PRIOD = null;

	/** �� 38 List�ϐ��F l_UNCONFIRM_ODR_EFF_TERM_FLG */
	public List l_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	/** �� 39 List�ϐ��F l_PARTIAL_SHIP_INST_FLG */
	public List l_PARTIAL_SHIP_INST_FLG = null;

	/** �� 40 List�ϐ��F l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** �� 41 List�ϐ��F l_PRICE_ROUND_TYP */
	public List l_PRICE_ROUND_TYP = null;

	/** �� 42 List�ϐ��F l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** �� 43 List�ϐ��F l_EDI_CUST_VEND_CD */
	public List l_EDI_CUST_VEND_CD = null;

	/** �� 44 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 45 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 46 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 47 List�ϐ��F l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** �� 48 List�ϐ��F l_TAX_NAME */
	public List l_TAX_NAME = null;

	/** �� 49 List�ϐ��F l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** �� 50 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** �� 51 List�ϐ��F l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getEXCH_TYP_name() { return m_EXCH_TYP_name; }
	public String getEXCH_TYP_val() { return m_EXCH_TYP_val; }
	public String getTAX_APPLY_TYP_name() { return m_TAX_APPLY_TYP_name; }
	public String getTAX_APPLY_TYP_val() { return m_TAX_APPLY_TYP_val; }
	public String getTAX_CALC_TYP_name() { return m_TAX_CALC_TYP_name; }
	public String getTAX_CALC_TYP_val() { return m_TAX_CALC_TYP_val; }
	public String getPARTIAL_SHIP_INST_FLG_name() { return m_PARTIAL_SHIP_INST_FLG_name; }
	public String getPARTIAL_SHIP_INST_FLG_val() { return m_PARTIAL_SHIP_INST_FLG_val; }
	public String geth_RESULT() { return m_h_RESULT; }
	public String getk_MODE() { return m_k_MODE; }
	public String getINSPC_ACPT_TYP_name() { return m_INSPC_ACPT_TYP_name; }
	public String getINSPC_ACPT_TYP_val() { return m_INSPC_ACPT_TYP_val; }
	public String getDETAIL_ROUND_TYP_name() { return m_DETAIL_ROUND_TYP_name; }
	public String getDETAIL_ROUND_TYP_val() { return m_DETAIL_ROUND_TYP_val; }
	public Double geth_CUR_CD() { return m_h_CUR_CD; }
	public Double geth_INSPC_ACPT_TYP() { return m_h_INSPC_ACPT_TYP; }
	public Double geth_TAX_CALC_TYP() { return m_h_TAX_CALC_TYP; }
	public Double geth_PRICE_ROUND_TYP() { return m_h_PRICE_ROUND_TYP; }
	public String geth_CUST_CD() { return m_h_CUST_CD; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_CUST() { return m_h_APR_CUST; }
	public String getSYS_COMPANY_CD() { return m_SYS_COMPANY_CD; }
	public String getT_CUST_CD() { return m_T_CUST_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getCUST_KNAME() { return m_CUST_KNAME; }
	public String getOWN_ORG_CD() { return m_OWN_ORG_CD; }
	public String getOWN_PERSON_CD() { return m_OWN_PERSON_CD; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getTAX_CALC_TYP() { return m_TAX_CALC_TYP; }
	public String getUNCONFIRM_ODR_EFF_PRIOD() { return m_UNCONFIRM_ODR_EFF_PRIOD; }
	public String getUNCONFIRM_ODR_EFF_TERM_FLG() { return m_UNCONFIRM_ODR_EFF_TERM_FLG; }
	public String getPARTIAL_SHIP_INST_FLG() { return m_PARTIAL_SHIP_INST_FLG; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getPRICE_ROUND_TYP() { return m_PRICE_ROUND_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getEDI_CUST_VEND_CD() { return m_EDI_CUST_VEND_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getTAX_NAME() { return m_TAX_NAME; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }

	public List getList_EXCH_TYP_name() { return l_EXCH_TYP_name; }
	public List getList_EXCH_TYP_val() { return l_EXCH_TYP_val; }
	public List getList_TAX_APPLY_TYP_name() { return l_TAX_APPLY_TYP_name; }
	public List getList_TAX_APPLY_TYP_val() { return l_TAX_APPLY_TYP_val; }
	public List getList_TAX_CALC_TYP_name() { return l_TAX_CALC_TYP_name; }
	public List getList_TAX_CALC_TYP_val() { return l_TAX_CALC_TYP_val; }
	public List getList_PARTIAL_SHIP_INST_FLG_name() { return l_PARTIAL_SHIP_INST_FLG_name; }
	public List getList_PARTIAL_SHIP_INST_FLG_val() { return l_PARTIAL_SHIP_INST_FLG_val; }
	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_INSPC_ACPT_TYP_name() { return l_INSPC_ACPT_TYP_name; }
	public List getList_INSPC_ACPT_TYP_val() { return l_INSPC_ACPT_TYP_val; }
	public List getList_DETAIL_ROUND_TYP_name() { return l_DETAIL_ROUND_TYP_name; }
	public List getList_DETAIL_ROUND_TYP_val() { return l_DETAIL_ROUND_TYP_val; }
	public List getList_h_CUR_CD() { return l_h_CUR_CD; }
	public List getList_h_INSPC_ACPT_TYP() { return l_h_INSPC_ACPT_TYP; }
	public List getList_h_TAX_CALC_TYP() { return l_h_TAX_CALC_TYP; }
	public List getList_h_PRICE_ROUND_TYP() { return l_h_PRICE_ROUND_TYP; }
	public List getList_h_CUST_CD() { return l_h_CUST_CD; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_CUST() { return l_h_APR_CUST; }
	public List getList_SYS_COMPANY_CD() { return l_SYS_COMPANY_CD; }
	public List getList_T_CUST_CD() { return l_T_CUST_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_CUST_KNAME() { return l_CUST_KNAME; }
	public List getList_OWN_ORG_CD() { return l_OWN_ORG_CD; }
	public List getList_OWN_PERSON_CD() { return l_OWN_PERSON_CD; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_TAX_CALC_TYP() { return l_TAX_CALC_TYP; }
	public List getList_UNCONFIRM_ODR_EFF_PRIOD() { return l_UNCONFIRM_ODR_EFF_PRIOD; }
	public List getList_UNCONFIRM_ODR_EFF_TERM_FLG() { return l_UNCONFIRM_ODR_EFF_TERM_FLG; }
	public List getList_PARTIAL_SHIP_INST_FLG() { return l_PARTIAL_SHIP_INST_FLG; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_PRICE_ROUND_TYP() { return l_PRICE_ROUND_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_EDI_CUST_VEND_CD() { return l_EDI_CUST_VEND_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_TAX_NAME() { return l_TAX_NAME; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }

	public void setEXCH_TYP_name(String val) { m_EXCH_TYP_name = val; }
	public void setEXCH_TYP_val(String val) { m_EXCH_TYP_val = val; }
	public void setTAX_APPLY_TYP_name(String val) { m_TAX_APPLY_TYP_name = val; }
	public void setTAX_APPLY_TYP_val(String val) { m_TAX_APPLY_TYP_val = val; }
	public void setTAX_CALC_TYP_name(String val) { m_TAX_CALC_TYP_name = val; }
	public void setTAX_CALC_TYP_val(String val) { m_TAX_CALC_TYP_val = val; }
	public void setPARTIAL_SHIP_INST_FLG_name(String val) { m_PARTIAL_SHIP_INST_FLG_name = val; }
	public void setPARTIAL_SHIP_INST_FLG_val(String val) { m_PARTIAL_SHIP_INST_FLG_val = val; }
	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setk_MODE(String val) { m_k_MODE = val; }
	public void setINSPC_ACPT_TYP_name(String val) { m_INSPC_ACPT_TYP_name = val; }
	public void setINSPC_ACPT_TYP_val(String val) { m_INSPC_ACPT_TYP_val = val; }
	public void setDETAIL_ROUND_TYP_name(String val) { m_DETAIL_ROUND_TYP_name = val; }
	public void setDETAIL_ROUND_TYP_val(String val) { m_DETAIL_ROUND_TYP_val = val; }
	public void seth_CUR_CD(Double val) { m_h_CUR_CD = val; }
	public void seth_INSPC_ACPT_TYP(Double val) { m_h_INSPC_ACPT_TYP = val; }
	public void seth_TAX_CALC_TYP(Double val) { m_h_TAX_CALC_TYP = val; }
	public void seth_PRICE_ROUND_TYP(Double val) { m_h_PRICE_ROUND_TYP = val; }
	public void seth_CUST_CD(String val) { m_h_CUST_CD = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_CUST(String val) { m_h_APR_CUST = val; }
	public void setSYS_COMPANY_CD(String val) { m_SYS_COMPANY_CD = val; }
	public void setT_CUST_CD(String val) { m_T_CUST_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setCUST_KNAME(String val) { m_CUST_KNAME = val; }
	public void setOWN_ORG_CD(String val) { m_OWN_ORG_CD = val; }
	public void setOWN_PERSON_CD(String val) { m_OWN_PERSON_CD = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setTAX_CALC_TYP(String val) { m_TAX_CALC_TYP = val; }
	public void setUNCONFIRM_ODR_EFF_PRIOD(String val) { m_UNCONFIRM_ODR_EFF_PRIOD = val; }
	public void setUNCONFIRM_ODR_EFF_TERM_FLG(String val) { m_UNCONFIRM_ODR_EFF_TERM_FLG = val; }
	public void setPARTIAL_SHIP_INST_FLG(String val) { m_PARTIAL_SHIP_INST_FLG = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setPRICE_ROUND_TYP(String val) { m_PRICE_ROUND_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setEDI_CUST_VEND_CD(String val) { m_EDI_CUST_VEND_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setTAX_NAME(String val) { m_TAX_NAME = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }


	public void setList_EXCH_TYP_name(List list) { l_EXCH_TYP_name = list; }
	public void setList_EXCH_TYP_val(List list) { l_EXCH_TYP_val = list; }
	public void setList_TAX_APPLY_TYP_name(List list) { l_TAX_APPLY_TYP_name = list; }
	public void setList_TAX_APPLY_TYP_val(List list) { l_TAX_APPLY_TYP_val = list; }
	public void setList_TAX_CALC_TYP_name(List list) { l_TAX_CALC_TYP_name = list; }
	public void setList_TAX_CALC_TYP_val(List list) { l_TAX_CALC_TYP_val = list; }
	public void setList_PARTIAL_SHIP_INST_FLG_name(List list) { l_PARTIAL_SHIP_INST_FLG_name = list; }
	public void setList_PARTIAL_SHIP_INST_FLG_val(List list) { l_PARTIAL_SHIP_INST_FLG_val = list; }
	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_INSPC_ACPT_TYP_name(List list) { l_INSPC_ACPT_TYP_name = list; }
	public void setList_INSPC_ACPT_TYP_val(List list) { l_INSPC_ACPT_TYP_val = list; }
	public void setList_DETAIL_ROUND_TYP_name(List list) { l_DETAIL_ROUND_TYP_name = list; }
	public void setList_DETAIL_ROUND_TYP_val(List list) { l_DETAIL_ROUND_TYP_val = list; }
	public void setList_h_CUR_CD(List list) { l_h_CUR_CD = list; }
	public void setList_h_INSPC_ACPT_TYP(List list) { l_h_INSPC_ACPT_TYP = list; }
	public void setList_h_TAX_CALC_TYP(List list) { l_h_TAX_CALC_TYP = list; }
	public void setList_h_PRICE_ROUND_TYP(List list) { l_h_PRICE_ROUND_TYP = list; }
	public void setList_h_CUST_CD(List list) { l_h_CUST_CD = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_CUST(List list) { l_h_APR_CUST = list; }
	public void setList_SYS_COMPANY_CD(List list) { l_SYS_COMPANY_CD = list; }
	public void setList_T_CUST_CD(List list) { l_T_CUST_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_CUST_KNAME(List list) { l_CUST_KNAME = list; }
	public void setList_OWN_ORG_CD(List list) { l_OWN_ORG_CD = list; }
	public void setList_OWN_PERSON_CD(List list) { l_OWN_PERSON_CD = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_TAX_CALC_TYP(List list) { l_TAX_CALC_TYP = list; }
	public void setList_UNCONFIRM_ODR_EFF_PRIOD(List list) { l_UNCONFIRM_ODR_EFF_PRIOD = list; }
	public void setList_UNCONFIRM_ODR_EFF_TERM_FLG(List list) { l_UNCONFIRM_ODR_EFF_TERM_FLG = list; }
	public void setList_PARTIAL_SHIP_INST_FLG(List list) { l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_PRICE_ROUND_TYP(List list) { l_PRICE_ROUND_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_EDI_CUST_VEND_CD(List list) { l_EDI_CUST_VEND_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_TAX_NAME(List list) { l_TAX_NAME = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }

	public int setL2L_EXCH_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_name == null) {
			l_EXCH_TYP_name = new ArrayList();
		} else {
			l_EXCH_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_name.add(((KA0100010Struct) list.get(i)).getEXCH_TYP_name());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_val == null) {
			l_EXCH_TYP_val = new ArrayList();
		} else {
			l_EXCH_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_val.add(((KA0100010Struct) list.get(i)).getEXCH_TYP_val());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP_name == null) {
			l_TAX_APPLY_TYP_name = new ArrayList();
		} else {
			l_TAX_APPLY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP_name.add(((KA0100010Struct) list.get(i)).getTAX_APPLY_TYP_name());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP_val == null) {
			l_TAX_APPLY_TYP_val = new ArrayList();
		} else {
			l_TAX_APPLY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP_val.add(((KA0100010Struct) list.get(i)).getTAX_APPLY_TYP_val());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP_name == null) {
			l_TAX_CALC_TYP_name = new ArrayList();
		} else {
			l_TAX_CALC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP_name.add(((KA0100010Struct) list.get(i)).getTAX_CALC_TYP_name());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP_val == null) {
			l_TAX_CALC_TYP_val = new ArrayList();
		} else {
			l_TAX_CALC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP_val.add(((KA0100010Struct) list.get(i)).getTAX_CALC_TYP_val());
		}
		return size;
	}
	public int setL2L_PARTIAL_SHIP_INST_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_SHIP_INST_FLG_name == null) {
			l_PARTIAL_SHIP_INST_FLG_name = new ArrayList();
		} else {
			l_PARTIAL_SHIP_INST_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_SHIP_INST_FLG_name.add(((KA0100010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG_name());
		}
		return size;
	}
	public int setL2L_PARTIAL_SHIP_INST_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_SHIP_INST_FLG_val == null) {
			l_PARTIAL_SHIP_INST_FLG_val = new ArrayList();
		} else {
			l_PARTIAL_SHIP_INST_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_SHIP_INST_FLG_val.add(((KA0100010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG_val());
		}
		return size;
	}
	public int setL2L_h_RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RESULT == null) {
			l_h_RESULT = new ArrayList();
		} else {
			l_h_RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RESULT.add(((KA0100010Struct) list.get(i)).geth_RESULT());
		}
		return size;
	}
	public int setL2L_k_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_MODE == null) {
			l_k_MODE = new ArrayList();
		} else {
			l_k_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_MODE.add(((KA0100010Struct) list.get(i)).getk_MODE());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_TYP_name == null) {
			l_INSPC_ACPT_TYP_name = new ArrayList();
		} else {
			l_INSPC_ACPT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_TYP_name.add(((KA0100010Struct) list.get(i)).getINSPC_ACPT_TYP_name());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_TYP_val == null) {
			l_INSPC_ACPT_TYP_val = new ArrayList();
		} else {
			l_INSPC_ACPT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_TYP_val.add(((KA0100010Struct) list.get(i)).getINSPC_ACPT_TYP_val());
		}
		return size;
	}
	public int setL2L_DETAIL_ROUND_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_ROUND_TYP_name == null) {
			l_DETAIL_ROUND_TYP_name = new ArrayList();
		} else {
			l_DETAIL_ROUND_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_ROUND_TYP_name.add(((KA0100010Struct) list.get(i)).getDETAIL_ROUND_TYP_name());
		}
		return size;
	}
	public int setL2L_DETAIL_ROUND_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_ROUND_TYP_val == null) {
			l_DETAIL_ROUND_TYP_val = new ArrayList();
		} else {
			l_DETAIL_ROUND_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_ROUND_TYP_val.add(((KA0100010Struct) list.get(i)).getDETAIL_ROUND_TYP_val());
		}
		return size;
	}
	public int setL2L_h_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUR_CD == null) {
			l_h_CUR_CD = new ArrayList();
		} else {
			l_h_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUR_CD.add(((KA0100010Struct) list.get(i)).geth_CUR_CD());
		}
		return size;
	}
	public int setL2L_h_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSPC_ACPT_TYP == null) {
			l_h_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_h_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSPC_ACPT_TYP.add(((KA0100010Struct) list.get(i)).geth_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_h_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_CALC_TYP == null) {
			l_h_TAX_CALC_TYP = new ArrayList();
		} else {
			l_h_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_CALC_TYP.add(((KA0100010Struct) list.get(i)).geth_TAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_h_PRICE_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRICE_ROUND_TYP == null) {
			l_h_PRICE_ROUND_TYP = new ArrayList();
		} else {
			l_h_PRICE_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRICE_ROUND_TYP.add(((KA0100010Struct) list.get(i)).geth_PRICE_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_h_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUST_CD == null) {
			l_h_CUST_CD = new ArrayList();
		} else {
			l_h_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUST_CD.add(((KA0100010Struct) list.get(i)).geth_CUST_CD());
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
			l_h_SCREENMOVE_TYP.add(((KA0100010Struct) list.get(i)).geth_SCREENMOVE_TYP());
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
			l_h_APPR_ID.add(((KA0100010Struct) list.get(i)).geth_APPR_ID());
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
			l_APPR_REMARKS.add(((KA0100010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_CUST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_CUST == null) {
			l_h_APR_CUST = new ArrayList();
		} else {
			l_h_APR_CUST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_CUST.add(((KA0100010Struct) list.get(i)).geth_APR_CUST());
		}
		return size;
	}
	public int setL2L_SYS_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_COMPANY_CD == null) {
			l_SYS_COMPANY_CD = new ArrayList();
		} else {
			l_SYS_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_COMPANY_CD.add(((KA0100010Struct) list.get(i)).getSYS_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_T_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_CUST_CD == null) {
			l_T_CUST_CD = new ArrayList();
		} else {
			l_T_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_CUST_CD.add(((KA0100010Struct) list.get(i)).getT_CUST_CD());
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
			l_CUST_CD.add(((KA0100010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_NAME == null) {
			l_CUST_NAME = new ArrayList();
		} else {
			l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_NAME.add(((KA0100010Struct) list.get(i)).getCUST_NAME());
		}
		return size;
	}
	public int setL2L_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ANAME == null) {
			l_CUST_ANAME = new ArrayList();
		} else {
			l_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ANAME.add(((KA0100010Struct) list.get(i)).getCUST_ANAME());
		}
		return size;
	}
	public int setL2L_CUST_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_KNAME == null) {
			l_CUST_KNAME = new ArrayList();
		} else {
			l_CUST_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_KNAME.add(((KA0100010Struct) list.get(i)).getCUST_KNAME());
		}
		return size;
	}
	public int setL2L_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_ORG_CD == null) {
			l_OWN_ORG_CD = new ArrayList();
		} else {
			l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_ORG_CD.add(((KA0100010Struct) list.get(i)).getOWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_CD == null) {
			l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_CD.add(((KA0100010Struct) list.get(i)).getOWN_PERSON_CD());
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
			l_CUR_CD.add(((KA0100010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP == null) {
			l_EXCH_TYP = new ArrayList();
		} else {
			l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP.add(((KA0100010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((KA0100010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP == null) {
			l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP.add(((KA0100010Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP == null) {
			l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP.add(((KA0100010Struct) list.get(i)).getTAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_EFF_PRIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_EFF_PRIOD == null) {
			l_UNCONFIRM_ODR_EFF_PRIOD = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_EFF_PRIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_EFF_PRIOD.add(((KA0100010Struct) list.get(i)).getUNCONFIRM_ODR_EFF_PRIOD());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_EFF_TERM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_EFF_TERM_FLG == null) {
			l_UNCONFIRM_ODR_EFF_TERM_FLG = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_EFF_TERM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_EFF_TERM_FLG.add(((KA0100010Struct) list.get(i)).getUNCONFIRM_ODR_EFF_TERM_FLG());
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
			l_PARTIAL_SHIP_INST_FLG.add(((KA0100010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_TYP == null) {
			l_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_TYP.add(((KA0100010Struct) list.get(i)).getINSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_PRICE_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRICE_ROUND_TYP == null) {
			l_PRICE_ROUND_TYP = new ArrayList();
		} else {
			l_PRICE_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRICE_ROUND_TYP.add(((KA0100010Struct) list.get(i)).getPRICE_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_ROUND_TYP == null) {
			l_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_ROUND_TYP.add(((KA0100010Struct) list.get(i)).getDETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_EDI_CUST_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_CUST_VEND_CD == null) {
			l_EDI_CUST_VEND_CD = new ArrayList();
		} else {
			l_EDI_CUST_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_CUST_VEND_CD.add(((KA0100010Struct) list.get(i)).getEDI_CUST_VEND_CD());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((KA0100010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((KA0100010Struct) list.get(i)).getORG_NAME());
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
			l_USER_NAME.add(((KA0100010Struct) list.get(i)).getUSER_NAME());
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
			l_CUR_NAME.add(((KA0100010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_TAX_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME == null) {
			l_TAX_NAME = new ArrayList();
		} else {
			l_TAX_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME.add(((KA0100010Struct) list.get(i)).getTAX_NAME());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((KA0100010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPTION_ID == null) {
			l_OPTION_ID = new ArrayList();
		} else {
			l_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPTION_ID.add(((KA0100010Struct) list.get(i)).getOPTION_ID());
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
			l_HOME_CUR_CD.add(((KA0100010Struct) list.get(i)).getHOME_CUR_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_EXCH_TYP_name = null;
		m_EXCH_TYP_val = null;
		m_TAX_APPLY_TYP_name = null;
		m_TAX_APPLY_TYP_val = null;
		m_TAX_CALC_TYP_name = null;
		m_TAX_CALC_TYP_val = null;
		m_PARTIAL_SHIP_INST_FLG_name = null;
		m_PARTIAL_SHIP_INST_FLG_val = null;
		m_h_RESULT = null;
		m_k_MODE = null;
		m_INSPC_ACPT_TYP_name = null;
		m_INSPC_ACPT_TYP_val = null;
		m_DETAIL_ROUND_TYP_name = null;
		m_DETAIL_ROUND_TYP_val = null;
		m_h_CUR_CD = null;
		m_h_INSPC_ACPT_TYP = null;
		m_h_TAX_CALC_TYP = null;
		m_h_PRICE_ROUND_TYP = null;
		m_h_CUST_CD = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_h_APR_CUST = null;
		m_SYS_COMPANY_CD = null;
		m_T_CUST_CD = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_CUST_ANAME = null;
		m_CUST_KNAME = null;
		m_OWN_ORG_CD = null;
		m_OWN_PERSON_CD = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_TAX_CD = null;
		m_TAX_APPLY_TYP = null;
		m_TAX_CALC_TYP = null;
		m_UNCONFIRM_ODR_EFF_PRIOD = null;
		m_UNCONFIRM_ODR_EFF_TERM_FLG = null;
		m_PARTIAL_SHIP_INST_FLG = null;
		m_INSPC_ACPT_TYP = null;
		m_PRICE_ROUND_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_EDI_CUST_VEND_CD = null;
		m_h_MODIFY_COUNT = null;
		m_ORG_NAME = null;
		m_USER_NAME = null;
		m_CUR_NAME = null;
		m_TAX_NAME = null;
		m_INSTALL_FLG = null;
		m_OPTION_ID = null;
		m_HOME_CUR_CD = null;

		l_EXCH_TYP_name = null;
		l_EXCH_TYP_val = null;
		l_TAX_APPLY_TYP_name = null;
		l_TAX_APPLY_TYP_val = null;
		l_TAX_CALC_TYP_name = null;
		l_TAX_CALC_TYP_val = null;
		l_PARTIAL_SHIP_INST_FLG_name = null;
		l_PARTIAL_SHIP_INST_FLG_val = null;
		l_h_RESULT = null;
		l_k_MODE = null;
		l_INSPC_ACPT_TYP_name = null;
		l_INSPC_ACPT_TYP_val = null;
		l_DETAIL_ROUND_TYP_name = null;
		l_DETAIL_ROUND_TYP_val = null;
		l_h_CUR_CD = null;
		l_h_INSPC_ACPT_TYP = null;
		l_h_TAX_CALC_TYP = null;
		l_h_PRICE_ROUND_TYP = null;
		l_h_CUST_CD = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_h_APR_CUST = null;
		l_SYS_COMPANY_CD = null;
		l_T_CUST_CD = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_CUST_ANAME = null;
		l_CUST_KNAME = null;
		l_OWN_ORG_CD = null;
		l_OWN_PERSON_CD = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_TAX_CD = null;
		l_TAX_APPLY_TYP = null;
		l_TAX_CALC_TYP = null;
		l_UNCONFIRM_ODR_EFF_PRIOD = null;
		l_UNCONFIRM_ODR_EFF_TERM_FLG = null;
		l_PARTIAL_SHIP_INST_FLG = null;
		l_INSPC_ACPT_TYP = null;
		l_PRICE_ROUND_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_EDI_CUST_VEND_CD = null;
		l_h_MODIFY_COUNT = null;
		l_ORG_NAME = null;
		l_USER_NAME = null;
		l_CUR_NAME = null;
		l_TAX_NAME = null;
		l_INSTALL_FLG = null;
		l_OPTION_ID = null;
		l_HOME_CUR_CD = null;

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
	 * medKA0100010�N���X�̕W���R���X�g���N�^
	 */
	public KA0100010Struct()
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
	public void setStruct(KA0100010Struct struct)
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
	public void setStructM(KA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setEXCH_TYP_name(struct.getEXCH_TYP_name());
			this.setEXCH_TYP_val(struct.getEXCH_TYP_val());
			this.setTAX_APPLY_TYP_name(struct.getTAX_APPLY_TYP_name());
			this.setTAX_APPLY_TYP_val(struct.getTAX_APPLY_TYP_val());
			this.setTAX_CALC_TYP_name(struct.getTAX_CALC_TYP_name());
			this.setTAX_CALC_TYP_val(struct.getTAX_CALC_TYP_val());
			this.setPARTIAL_SHIP_INST_FLG_name(struct.getPARTIAL_SHIP_INST_FLG_name());
			this.setPARTIAL_SHIP_INST_FLG_val(struct.getPARTIAL_SHIP_INST_FLG_val());
			this.seth_RESULT(struct.geth_RESULT());
			this.setk_MODE(struct.getk_MODE());
			this.setINSPC_ACPT_TYP_name(struct.getINSPC_ACPT_TYP_name());
			this.setINSPC_ACPT_TYP_val(struct.getINSPC_ACPT_TYP_val());
			this.setDETAIL_ROUND_TYP_name(struct.getDETAIL_ROUND_TYP_name());
			this.setDETAIL_ROUND_TYP_val(struct.getDETAIL_ROUND_TYP_val());
			this.seth_CUR_CD(struct.geth_CUR_CD());
			this.seth_INSPC_ACPT_TYP(struct.geth_INSPC_ACPT_TYP());
			this.seth_TAX_CALC_TYP(struct.geth_TAX_CALC_TYP());
			this.seth_PRICE_ROUND_TYP(struct.geth_PRICE_ROUND_TYP());
			this.seth_CUST_CD(struct.geth_CUST_CD());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_CUST(struct.geth_APR_CUST());
			this.setSYS_COMPANY_CD(struct.getSYS_COMPANY_CD());
			this.setT_CUST_CD(struct.getT_CUST_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setCUST_KNAME(struct.getCUST_KNAME());
			this.setOWN_ORG_CD(struct.getOWN_ORG_CD());
			this.setOWN_PERSON_CD(struct.getOWN_PERSON_CD());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setTAX_CALC_TYP(struct.getTAX_CALC_TYP());
			this.setUNCONFIRM_ODR_EFF_PRIOD(struct.getUNCONFIRM_ODR_EFF_PRIOD());
			this.setUNCONFIRM_ODR_EFF_TERM_FLG(struct.getUNCONFIRM_ODR_EFF_TERM_FLG());
			this.setPARTIAL_SHIP_INST_FLG(struct.getPARTIAL_SHIP_INST_FLG());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setPRICE_ROUND_TYP(struct.getPRICE_ROUND_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setEDI_CUST_VEND_CD(struct.getEDI_CUST_VEND_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setORG_NAME(struct.getORG_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setTAX_NAME(struct.getTAX_NAME());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_EXCH_TYP_name(struct.getList_EXCH_TYP_name());
			this.setList_EXCH_TYP_val(struct.getList_EXCH_TYP_val());
			this.setList_TAX_APPLY_TYP_name(struct.getList_TAX_APPLY_TYP_name());
			this.setList_TAX_APPLY_TYP_val(struct.getList_TAX_APPLY_TYP_val());
			this.setList_TAX_CALC_TYP_name(struct.getList_TAX_CALC_TYP_name());
			this.setList_TAX_CALC_TYP_val(struct.getList_TAX_CALC_TYP_val());
			this.setList_PARTIAL_SHIP_INST_FLG_name(struct.getList_PARTIAL_SHIP_INST_FLG_name());
			this.setList_PARTIAL_SHIP_INST_FLG_val(struct.getList_PARTIAL_SHIP_INST_FLG_val());
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_INSPC_ACPT_TYP_name(struct.getList_INSPC_ACPT_TYP_name());
			this.setList_INSPC_ACPT_TYP_val(struct.getList_INSPC_ACPT_TYP_val());
			this.setList_DETAIL_ROUND_TYP_name(struct.getList_DETAIL_ROUND_TYP_name());
			this.setList_DETAIL_ROUND_TYP_val(struct.getList_DETAIL_ROUND_TYP_val());
			this.setList_h_CUR_CD(struct.getList_h_CUR_CD());
			this.setList_h_INSPC_ACPT_TYP(struct.getList_h_INSPC_ACPT_TYP());
			this.setList_h_TAX_CALC_TYP(struct.getList_h_TAX_CALC_TYP());
			this.setList_h_PRICE_ROUND_TYP(struct.getList_h_PRICE_ROUND_TYP());
			this.setList_h_CUST_CD(struct.getList_h_CUST_CD());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_CUST(struct.getList_h_APR_CUST());
			this.setList_SYS_COMPANY_CD(struct.getList_SYS_COMPANY_CD());
			this.setList_T_CUST_CD(struct.getList_T_CUST_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_CUST_KNAME(struct.getList_CUST_KNAME());
			this.setList_OWN_ORG_CD(struct.getList_OWN_ORG_CD());
			this.setList_OWN_PERSON_CD(struct.getList_OWN_PERSON_CD());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_TAX_CALC_TYP(struct.getList_TAX_CALC_TYP());
			this.setList_UNCONFIRM_ODR_EFF_PRIOD(struct.getList_UNCONFIRM_ODR_EFF_PRIOD());
			this.setList_UNCONFIRM_ODR_EFF_TERM_FLG(struct.getList_UNCONFIRM_ODR_EFF_TERM_FLG());
			this.setList_PARTIAL_SHIP_INST_FLG(struct.getList_PARTIAL_SHIP_INST_FLG());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_PRICE_ROUND_TYP(struct.getList_PRICE_ROUND_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_EDI_CUST_VEND_CD(struct.getList_EDI_CUST_VEND_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_TAX_NAME(struct.getList_TAX_NAME());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
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
	// �� 1 �ϐ������l�F i_EXCH_TYP_name


	final static String i_EXCH_TYP_name = null;

	// �� 2 �ϐ������l�F i_EXCH_TYP_val


	final static String i_EXCH_TYP_val = null;

	// �� 3 �ϐ������l�F i_TAX_APPLY_TYP_name


	final static String i_TAX_APPLY_TYP_name = null;

	// �� 4 �ϐ������l�F i_TAX_APPLY_TYP_val


	final static String i_TAX_APPLY_TYP_val = null;

	// �� 5 �ϐ������l�F i_TAX_CALC_TYP_name


	final static String i_TAX_CALC_TYP_name = null;

	// �� 6 �ϐ������l�F i_TAX_CALC_TYP_val


	final static String i_TAX_CALC_TYP_val = null;

	// �� 7 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG_name


	final static String i_PARTIAL_SHIP_INST_FLG_name = null;

	// �� 8 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG_val


	final static String i_PARTIAL_SHIP_INST_FLG_val = null;

	// �� 9 �ϐ������l�F i_h_RESULT


	final static String i_h_RESULT = null;

	// �� 10 �ϐ������l�F i_k_MODE


	final static String i_k_MODE = null;

	// �� 11 �ϐ������l�F i_INSPC_ACPT_TYP_name


	final static String i_INSPC_ACPT_TYP_name = null;

	// �� 12 �ϐ������l�F i_INSPC_ACPT_TYP_val


	final static String i_INSPC_ACPT_TYP_val = null;

	// �� 13 �ϐ������l�F i_DETAIL_ROUND_TYP_name


	final static String i_DETAIL_ROUND_TYP_name = null;

	// �� 14 �ϐ������l�F i_DETAIL_ROUND_TYP_val


	final static String i_DETAIL_ROUND_TYP_val = null;

	// �� 15 �ϐ������l�F i_h_CUR_CD


	final static Double i_h_CUR_CD = null;

	// �� 16 �ϐ������l�F i_h_INSPC_ACPT_TYP


	final static Double i_h_INSPC_ACPT_TYP = null;

	// �� 17 �ϐ������l�F i_h_TAX_CALC_TYP


	final static Double i_h_TAX_CALC_TYP = null;

	// �� 18 �ϐ������l�F i_h_PRICE_ROUND_TYP


	final static Double i_h_PRICE_ROUND_TYP = null;

	// �� 19 �ϐ������l�F i_h_CUST_CD


	final static String i_h_CUST_CD = null;

	// �� 20 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 21 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 22 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 23 �ϐ������l�F i_h_APR_CUST


	final static String i_h_APR_CUST = null;

	// �� 24 �ϐ������l�F i_SYS_COMPANY_CD


	final static String i_SYS_COMPANY_CD = null;

	// �� 25 �ϐ������l�F i_T_CUST_CD


	final static String i_T_CUST_CD = null;

	// �� 26 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 27 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 28 �ϐ������l�F i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// �� 29 �ϐ������l�F i_CUST_KNAME


	final static String i_CUST_KNAME = null;

	// �� 30 �ϐ������l�F i_OWN_ORG_CD


	final static String i_OWN_ORG_CD = null;

	// �� 31 �ϐ������l�F i_OWN_PERSON_CD


	final static String i_OWN_PERSON_CD = null;

	// �� 32 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 33 �ϐ������l�F i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// �� 34 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 35 �ϐ������l�F i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// �� 36 �ϐ������l�F i_TAX_CALC_TYP


	final static String i_TAX_CALC_TYP = null;

	// �� 37 �ϐ������l�F i_UNCONFIRM_ODR_EFF_PRIOD


	final static String i_UNCONFIRM_ODR_EFF_PRIOD = null;

	// �� 38 �ϐ������l�F i_UNCONFIRM_ODR_EFF_TERM_FLG


	final static String i_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	// �� 39 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG


	final static String i_PARTIAL_SHIP_INST_FLG = null;

	// �� 40 �ϐ������l�F i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// �� 41 �ϐ������l�F i_PRICE_ROUND_TYP


	final static String i_PRICE_ROUND_TYP = null;

	// �� 42 �ϐ������l�F i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// �� 43 �ϐ������l�F i_EDI_CUST_VEND_CD


	final static String i_EDI_CUST_VEND_CD = null;

	// �� 44 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 45 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 46 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 47 �ϐ������l�F i_CUR_NAME


	final static String i_CUR_NAME = null;

	// �� 48 �ϐ������l�F i_TAX_NAME


	final static String i_TAX_NAME = null;

	// �� 49 �ϐ������l�F i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// �� 50 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

	// �� 51 �ϐ������l�F i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 2 �ϐ������l�F i_CUST_NAME
        final static String i_CUST_NAME = null;
        // �� 3 �ϐ������l�F i_CUST_ANAME
        final static String i_CUST_ANAME = null;
        // �� 4 �ϐ������l�F i_CUST_KNAME
        final static String i_CUST_KNAME = null;
        // �� 5 �ϐ������l�F i_OWN_ORG_CD
        final static String i_OWN_ORG_CD = null;
        // �� 6 �ϐ������l�F i_OWN_PERSON_CD
        final static String i_OWN_PERSON_CD = null;
        // �� 7 �ϐ������l�F i_CUR_CD
        final static String i_CUR_CD =  null;
        // �� 8 �ϐ������l�F i_EXCH_TYP
        final static String i_EXCH_TYP = new String("1");
        // �� 9 �ϐ������l�F i_TAX_CD
        final static String i_TAX_CD = null;
        // �� 10 �ϐ������l�F i_TAX_APPLY_TYP
        final static String i_TAX_APPLY_TYP = new String("2");
        // �� 11 �ϐ������l�F i_TAX_CALC_TYP
        final static String i_TAX_CALC_TYP = new String("1");
        // �� 12 �ϐ������l�F i_UNCONFIRM_ODR_EFF_PRIOD
        final static String i_UNCONFIRM_ODR_EFF_PRIOD = new String("0");
        // �� 13 �ϐ������l�F i_UNCONFIRM_ODR_EFF_TERM_FLG
        final static String i_UNCONFIRM_ODR_EFF_TERM_FLG = new String("0");
        // �� 14 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG
        final static String i_PARTIAL_SHIP_INST_FLG = new String("1");
        // �� 15 �ϐ������l�F i_DEPO_TYP
        final static String i_DEPO_TYP = new String("10");
        // �� 16 �ϐ������l�F i_INSPC_ACPT_TYP
        final static String i_INSPC_ACPT_TYP = new String("1");
        // �� 17 �ϐ������l�F i_PRICE_ROUND_TYP
        final static String i_PRICE_ROUND_TYP = new String("1");
        // �� 18 �ϐ������l�F i_DETAIL_ROUND_TYP
        final static String i_DETAIL_ROUND_TYP = new String("1");
        // �� 19 �ϐ������l�F i_EDI_CUST_VEND_CD
        final static String i_EDI_CUST_VEND_CD = null;
        // �� 20 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 21 �ϐ������l�F i_SYS_COMPANY_CD
        final static String i_SYS_COMPANY_CD = null;
        // �� 22 �ϐ������l�F i_CUR_CD_val
        final static String i_CUR_CD_val = null;
        // �� 23 �ϐ������l�F i_CUR_CD_name
        final static String i_CUR_CD_name = null;
        // �� 24 �ϐ������l�F i_T_CUST_CD
        final static String i_T_CUST_CD = null;
        // �� 25 �ϐ������l�F i_CUST_IMPORTANT_TYP_val
        final static String i_CUST_IMPORTANT_TYP_val = null;
        // �� 26 �ϐ������l�F i_CUST_IMPORTANT_TYP_name
        final static String i_CUST_IMPORTANT_TYP_name = null;
        // �� 27 �ϐ������l�F i_EXCH_TYP_name
        final static String i_EXCH_TYP_name = null;
        // �� 28 �ϐ������l�F i_EXCH_TYP_val
        final static String i_EXCH_TYP_val = null;
        // �� 29 �ϐ������l�F i_TAX_APPLY_TYP_name
        final static String i_TAX_APPLY_TYP_name = null;
        // �� 30 �ϐ������l�F i_TAX_APPLY_TYP_val
        final static String i_TAX_APPLY_TYP_val = null;
        // �� 31 �ϐ������l�F i_TAX_CALC_TYP_name
        final static String i_TAX_CALC_TYP_name = null;
        // �� 32 �ϐ������l�F i_TAX_CALC_TYP_val
        final static String i_TAX_CALC_TYP_val = null;
        // �� 33 �ϐ������l�F i_UNCONFIRM_ODR_EFF_TERM_FLG_name
        final static String i_UNCONFIRM_ODR_EFF_TERM_FLG_name = null;
        // �� 34 �ϐ������l�F i_UNCONFIRM_ODR_EFF_TERM_FLG_val
        final static String i_UNCONFIRM_ODR_EFF_TERM_FLG_val = null;
        // �� 35 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG_name
        final static String i_PARTIAL_SHIP_INST_FLG_name = null;
        // �� 36 �ϐ������l�F i_PARTIAL_SHIP_INST_FLG_val
        final static String i_PARTIAL_SHIP_INST_FLG_val = null;
        // �� 37 �ϐ������l�F i_DEPO_TYP_name
        final static String i_DEPO_TYP_name = null;
        // �� 38 �ϐ������l�F i_DEPO_TYP_val
        final static String i_DEPO_TYP_val = null;
        // �� 39 �ϐ������l�F i_h_RESULT
        final static String i_h_RESULT = null;
        // �� 40 �ϐ������l�F i_k_MODE
        final static String i_k_MODE = null;
        // �� 41 �ϐ������l�F i_INSPC_ACPT_TYP_name
        final static String i_INSPC_ACPT_TYP_name = null;
        // �� 42 �ϐ������l�F i_INSPC_ACPT_TYP_val
        final static String i_INSPC_ACPT_TYP_val = null;
        // �� 43 �ϐ������l�F i_PRICE_ROUND_TYP_name
        final static String i_PRICE_ROUND_TYP_name = null;
        // �� 44 �ϐ������l�F i_PRICE_ROUND_TYP_val
        final static String i_PRICE_ROUND_TYP_val = null;
        // �� 45 �ϐ������l�F i_DETAIL_ROUND_TYP_name
        final static String i_DETAIL_ROUND_TYP_name = null;
        // �� 46 �ϐ������l�F i_DETAIL_ROUND_TYP_val
        final static String i_DETAIL_ROUND_TYP_val = null;
        // �� 47 �ϐ������l�F i_h_CUR_CD
        final static Double i_h_CUR_CD = null;
        // �� 48 �ϐ������l�F i_h_INSPC_ACPT_TYP
        final static Double i_h_INSPC_ACPT_TYP = null;
        // �� 49 �ϐ������l�F i_h_TAX_CALC_TYP
        final static Double i_h_TAX_CALC_TYP = null;
        // �� 50 �ϐ������l�F i_h_PRICE_ROUND_TYP
        final static Double i_h_PRICE_ROUND_TYP = null;
        // �� 51 �ϐ������l�F i_h_DEPO_TYP
        final static String i_h_DEPO_TYP = null;
        // �� 52 �ϐ������l�F i_h_CUST_CD
        final static String i_h_CUST_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CUST_CD = i_CUST_CD;
         m_CUST_NAME = i_CUST_NAME;
         m_CUST_ANAME = i_CUST_ANAME;
         m_CUST_KNAME = i_CUST_KNAME;
         m_OWN_ORG_CD = i_OWN_ORG_CD;
         m_OWN_PERSON_CD = i_OWN_PERSON_CD;
         m_CUR_CD = i_CUR_CD;
         m_EXCH_TYP = i_EXCH_TYP;
         m_TAX_CD = i_TAX_CD;
         m_TAX_APPLY_TYP = i_TAX_APPLY_TYP;
         m_TAX_CALC_TYP = i_TAX_CALC_TYP;
         m_UNCONFIRM_ODR_EFF_PRIOD = i_UNCONFIRM_ODR_EFF_PRIOD;
         m_UNCONFIRM_ODR_EFF_TERM_FLG = i_UNCONFIRM_ODR_EFF_TERM_FLG;
         m_PARTIAL_SHIP_INST_FLG = i_PARTIAL_SHIP_INST_FLG;
         //m_DEPO_TYP = i_DEPO_TYP;
         m_INSPC_ACPT_TYP = i_INSPC_ACPT_TYP;
         m_PRICE_ROUND_TYP = i_PRICE_ROUND_TYP;
         m_DETAIL_ROUND_TYP = i_DETAIL_ROUND_TYP;
         m_EDI_CUST_VEND_CD = i_EDI_CUST_VEND_CD;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_SYS_COMPANY_CD = i_SYS_COMPANY_CD;
         m_T_CUST_CD = i_T_CUST_CD;
         m_EXCH_TYP_name = i_EXCH_TYP_name;
         m_EXCH_TYP_val = i_EXCH_TYP_val;
         m_TAX_APPLY_TYP_name = i_TAX_APPLY_TYP_name;
         m_TAX_APPLY_TYP_val = i_TAX_APPLY_TYP_val;
         m_TAX_CALC_TYP_name = i_TAX_CALC_TYP_name;
         m_TAX_CALC_TYP_val = i_TAX_CALC_TYP_val;
         //m_UNCONFIRM_ODR_EFF_TERM_FLG_name = i_UNCONFIRM_ODR_EFF_TERM_FLG_name;
         //m_UNCONFIRM_ODR_EFF_TERM_FLG_val = i_UNCONFIRM_ODR_EFF_TERM_FLG_val;
         m_PARTIAL_SHIP_INST_FLG_name = i_PARTIAL_SHIP_INST_FLG_name;
         m_PARTIAL_SHIP_INST_FLG_val = i_PARTIAL_SHIP_INST_FLG_val;
         //m_DEPO_TYP_name = i_DEPO_TYP_name;
         //m_DEPO_TYP_val = i_DEPO_TYP_val;
         m_h_RESULT = i_h_RESULT;
         m_k_MODE = i_k_MODE;
         m_INSPC_ACPT_TYP_name = i_INSPC_ACPT_TYP_name;
         m_INSPC_ACPT_TYP_val = i_INSPC_ACPT_TYP_val;
         //m_PRICE_ROUND_TYP_name = i_PRICE_ROUND_TYP_name;
         //m_PRICE_ROUND_TYP_val = i_PRICE_ROUND_TYP_val;
         m_DETAIL_ROUND_TYP_name = i_DETAIL_ROUND_TYP_name;
         m_DETAIL_ROUND_TYP_val = i_DETAIL_ROUND_TYP_val;
         m_h_CUR_CD = i_h_CUR_CD;
         m_h_INSPC_ACPT_TYP = i_h_INSPC_ACPT_TYP;
         m_h_TAX_CALC_TYP = i_h_TAX_CALC_TYP;
         m_h_PRICE_ROUND_TYP = i_h_PRICE_ROUND_TYP;
         //m_h_DEPO_TYP = i_h_DEPO_TYP;
         m_h_CUST_CD = i_h_CUST_CD;
        }
       
        public void copy(KA0100010Struct s)
        {
         clear();
         if(s.m_CUST_CD != null) m_CUST_CD = new String(s.m_CUST_CD);
         if(s.m_CUST_NAME != null) m_CUST_NAME = new String(s.m_CUST_NAME);
         if(s.m_CUST_ANAME != null) m_CUST_ANAME = new String(s.m_CUST_ANAME);
         if(s.m_CUST_KNAME != null) m_CUST_KNAME = new String(s.m_CUST_KNAME);
         if(s.m_OWN_ORG_CD != null) m_OWN_ORG_CD = new String(s.m_OWN_ORG_CD);
         if(s.m_OWN_PERSON_CD != null) m_OWN_PERSON_CD = new String(s.m_OWN_PERSON_CD);
         if(s.m_TAX_CD != null) m_TAX_CD = new String(s.m_TAX_CD);
         if(s.m_TAX_APPLY_TYP != null) m_TAX_APPLY_TYP = new String(s.m_TAX_APPLY_TYP);
         if(s.m_TAX_CALC_TYP != null) m_TAX_CALC_TYP = new String(s.m_TAX_CALC_TYP);
         if(s.m_SYS_COMPANY_CD != null) m_SYS_COMPANY_CD = new String(s.m_SYS_COMPANY_CD);
         if(s.m_h_MODIFY_COUNT != null) m_h_MODIFY_COUNT = new String(s.m_h_MODIFY_COUNT);
         if(s.m_UNCONFIRM_ODR_EFF_PRIOD != null) m_UNCONFIRM_ODR_EFF_PRIOD = new String(s.m_UNCONFIRM_ODR_EFF_PRIOD);
         if(s.m_CUR_CD != null) m_CUR_CD = new String(s.m_CUR_CD);
         if(s.m_EXCH_TYP != null) m_EXCH_TYP = new String(s.m_EXCH_TYP);
         if(s.m_EXCH_TYP_name != null) m_EXCH_TYP_name = new String(s.m_EXCH_TYP_name);
         if(s.m_EXCH_TYP_val != null) m_EXCH_TYP_val = new String(s.m_EXCH_TYP_val);
         if(s.m_TAX_APPLY_TYP != null) m_TAX_APPLY_TYP = new String(s.m_TAX_APPLY_TYP);
         if(s.m_TAX_APPLY_TYP_name != null) m_TAX_APPLY_TYP_name = new String(s.m_TAX_APPLY_TYP_name);
         if(s.m_TAX_APPLY_TYP_val != null) m_TAX_APPLY_TYP_val = new String(s.m_TAX_APPLY_TYP_val);
         if(s.m_TAX_CALC_TYP != null) m_TAX_CALC_TYP = new String(s.m_TAX_CALC_TYP);
         if(s.m_TAX_CALC_TYP_name != null) m_TAX_CALC_TYP_name = new String(s.m_TAX_CALC_TYP_name);
         if(s.m_TAX_CALC_TYP_val != null) m_TAX_CALC_TYP_val = new String(s.m_TAX_CALC_TYP_val);
         if(s.m_UNCONFIRM_ODR_EFF_TERM_FLG != null) m_UNCONFIRM_ODR_EFF_TERM_FLG = new String(s.m_UNCONFIRM_ODR_EFF_TERM_FLG);
         //if(s.m_UNCONFIRM_ODR_EFF_TERM_FLG_name != null) m_UNCONFIRM_ODR_EFF_TERM_FLG_name = new String(s.m_UNCONFIRM_ODR_EFF_TERM_FLG_name);
         //if(s.m_UNCONFIRM_ODR_EFF_TERM_FLG_val != null) m_UNCONFIRM_ODR_EFF_TERM_FLG_val = new String(s.m_UNCONFIRM_ODR_EFF_TERM_FLG_val);
         if(s.m_PARTIAL_SHIP_INST_FLG != null) m_PARTIAL_SHIP_INST_FLG = new String(s.m_PARTIAL_SHIP_INST_FLG);
         if(s.m_PARTIAL_SHIP_INST_FLG_name != null) m_PARTIAL_SHIP_INST_FLG_name = new String(s.m_PARTIAL_SHIP_INST_FLG_name);
         if(s.m_PARTIAL_SHIP_INST_FLG_val != null) m_PARTIAL_SHIP_INST_FLG_val = new String(s.m_PARTIAL_SHIP_INST_FLG_val);
         //if(s.m_DEPO_TYP != null) m_DEPO_TYP = new String(s.m_DEPO_TYP);
         //if(s.m_DEPO_TYP_name != null) m_DEPO_TYP_name = new String(s.m_DEPO_TYP_name);
         //if(s.m_DEPO_TYP_val != null) m_DEPO_TYP_val = new String(s.m_DEPO_TYP_val);
         if(s.m_INSPC_ACPT_TYP != null) m_INSPC_ACPT_TYP = new String(s.m_INSPC_ACPT_TYP);
         if(s.m_INSPC_ACPT_TYP_name != null) m_INSPC_ACPT_TYP_name = new String(s.m_INSPC_ACPT_TYP_name);
         if(s.m_INSPC_ACPT_TYP_val != null) m_INSPC_ACPT_TYP_val = new String(s.m_INSPC_ACPT_TYP_val);
               if(s.m_PRICE_ROUND_TYP != null) m_PRICE_ROUND_TYP = new String(s.m_PRICE_ROUND_TYP);
               //if(s.m_PRICE_ROUND_TYP_name != null) m_PRICE_ROUND_TYP_name = new String(s.m_PRICE_ROUND_TYP_name);
            //if(s.m_PRICE_ROUND_TYP_val != null) m_PRICE_ROUND_TYP_val = new String(s.m_PRICE_ROUND_TYP_val);
               if(s.m_DETAIL_ROUND_TYP != null) m_DETAIL_ROUND_TYP = new String(s.m_DETAIL_ROUND_TYP);
               if(s.m_DETAIL_ROUND_TYP_name != null) m_DETAIL_ROUND_TYP_name = new String(s.m_DETAIL_ROUND_TYP_name);
         if(s.m_DETAIL_ROUND_TYP_val != null) m_DETAIL_ROUND_TYP_val = new String(s.m_DETAIL_ROUND_TYP_val);
               if(s.m_EDI_CUST_VEND_CD != null) m_EDI_CUST_VEND_CD = new String(s.m_EDI_CUST_VEND_CD);
       
               if(s.m_ORG_NAME != null) m_ORG_NAME = new String(s.m_ORG_NAME);
               if(s.m_USER_NAME != null) m_USER_NAME = new String(s.m_USER_NAME);
               if(s.m_CUR_NAME != null) m_CUR_NAME = new String(s.m_CUR_NAME);
               if(s.m_TAX_NAME != null) m_TAX_NAME = new String(s.m_TAX_NAME);
               if(s.m_h_SCREENMOVE_TYP != null) m_h_SCREENMOVE_TYP = s.m_h_SCREENMOVE_TYP;
        }
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
