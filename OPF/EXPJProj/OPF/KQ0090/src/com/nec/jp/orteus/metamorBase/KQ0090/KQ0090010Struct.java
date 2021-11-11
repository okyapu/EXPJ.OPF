/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0090/src/com/nec/jp/orteus/metamorBase/KQ0090/KQ0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0090;

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
 * CLASS     : KQ0090010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhang-yan $
 * @version $Revision: 1.3 $ $Date: 2014/06/25 04:43:23 $
 *
 */
//}}user_implement_code_header

public class KQ0090010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_chkADD_ODR_FLG */
	public String m_chkADD_ODR_FLG = null;
	/** �� 2 �ϐ��F m_CUR_UNIT_AMOUNT */
	public String m_CUR_UNIT_AMOUNT = null;
	/** �� 3 �ϐ��F m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** �� 4 �ϐ��F m_lbORGN_ODR_NO */
	public String m_lbORGN_ODR_NO = null;
	/** �� 5 �ϐ��F m_h_APR_ODR */
	public String m_h_APR_ODR = null;
	/** �� 6 �ϐ��F m_APPROVED_COMMENT */
	public String m_APPROVED_COMMENT = null;
	/** �� 7 �ϐ��F m_h_ODR_TYP */
	public String m_h_ODR_TYP = null;
	/** �� 8 �ϐ��F m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** �� 9 �ϐ��F m_l_h_ESTIMATE_TYPE */
	public String m_l_h_ESTIMATE_TYPE = null;
	/** �� 10 �ϐ��F m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** �� 11 �ϐ��F m_w_OPTION_ID */
	public String m_w_OPTION_ID = null;
	/** �� 12 �ϐ��F m_sysCOMPANY_CD */
	public String m_sysCOMPANY_CD = null;
	/** �� 13 �ϐ��F m_sysPLANT_CD */
	public String m_sysPLANT_CD = null;
	/** �� 14 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 15 �ϐ��F m_w_SYS_CLASS */
	public String m_w_SYS_CLASS = null;
	/** �� 16 �ϐ��F m_w_VALUE */
	public String m_w_VALUE = null;
	/** �� 17 �ϐ��F m_NAME */
	public String m_NAME = null;
	/** �� 18 �ϐ��F m_ORGN_ODR_NO */
	public String m_ORGN_ODR_NO = null;
	/** �� 19 �ϐ��F m_w_ADD_ODR_FLG */
	public String m_w_ADD_ODR_FLG = null;
	/** �� 20 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 21 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 22 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 23 �ϐ��F m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** �� 24 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 25 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 26 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 27 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 28 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 29 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 30 �ϐ��F m_CUR_UNIT_PRICE */
	public String m_CUR_UNIT_PRICE = null;
	/** �� 31 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 32 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 33 �ϐ��F m_ODR_AMOUNT */
	public String m_ODR_AMOUNT = null;
	/** �� 34 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 35 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 36 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 37 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 38 �ϐ��F m_w_SEQ */
	public String m_w_SEQ = null;
	/** �� 39 �ϐ��F m_h_SYS_COMPANY_CODE */
	public String m_h_SYS_COMPANY_CODE = null;
	/** �� 40 �ϐ��F m_SYS_USER_CD */
	public String m_SYS_USER_CD = null;
	/** �� 41 �ϐ��F m_w_CURRNCY_CD */
	public String m_w_CURRNCY_CD = null;
	/** �� 42 �ϐ��F m_w_EXCH_TYP */
	public String m_w_EXCH_TYP = null;
	/** �� 43 �ϐ��F m_w_ODR_AMOUNT_EXCH_RATES */
	public String m_w_ODR_AMOUNT_EXCH_RATES = null;
	/** �� 44 �ϐ��F m_w_TAX_APPLY_TYP */
	public String m_w_TAX_APPLY_TYP = null;
	/** �� 45 �ϐ��F m_w_TAX_CALC_TYP */
	public String m_w_TAX_CALC_TYP = null;
	/** �� 46 �ϐ��F m_w_DETAIL_ROUND_TYP */
	public String m_w_DETAIL_ROUND_TYP = null;
	/** �� 47 �ϐ��F m_w_USER_CD */
	public String m_w_USER_CD = null;
	/** �� 48 �ϐ��F m_w_DECIMAL_FIG */
	public String m_w_DECIMAL_FIG = null;
	/** �� 49 �ϐ��F m_haveFlag */
	public String m_haveFlag = null;
	/** �� 50 �ϐ��F m_l_OWN_ORG_CD */
	public String m_l_OWN_ORG_CD = null;
	/** �� 51 �ϐ��F m_l_OWN_PERSON_CD */
	public String m_l_OWN_PERSON_CD = null;
	/** �� 52 �ϐ��F m_w_CUST_CD */
	public String m_w_CUST_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_chkADD_ODR_FLG */
	public List l_chkADD_ODR_FLG = null;

	/** �� 2 List�ϐ��F l_CUR_UNIT_AMOUNT */
	public List l_CUR_UNIT_AMOUNT = null;

	/** �� 3 List�ϐ��F l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** �� 4 List�ϐ��F l_lbORGN_ODR_NO */
	public List l_lbORGN_ODR_NO = null;

	/** �� 5 List�ϐ��F l_h_APR_ODR */
	public List l_h_APR_ODR = null;

	/** �� 6 List�ϐ��F l_APPROVED_COMMENT */
	public List l_APPROVED_COMMENT = null;

	/** �� 7 List�ϐ��F l_h_ODR_TYP */
	public List l_h_ODR_TYP = null;

	/** �� 8 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 9 List�ϐ��F l_l_h_ESTIMATE_TYPE */
	public List l_l_h_ESTIMATE_TYPE = null;

	/** �� 10 List�ϐ��F l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** �� 11 List�ϐ��F l_w_OPTION_ID */
	public List l_w_OPTION_ID = null;

	/** �� 12 List�ϐ��F l_sysCOMPANY_CD */
	public List l_sysCOMPANY_CD = null;

	/** �� 13 List�ϐ��F l_sysPLANT_CD */
	public List l_sysPLANT_CD = null;

	/** �� 14 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_w_SYS_CLASS */
	public List l_w_SYS_CLASS = null;

	/** �� 16 List�ϐ��F l_w_VALUE */
	public List l_w_VALUE = null;

	/** �� 17 List�ϐ��F l_NAME */
	public List l_NAME = null;

	/** �� 18 List�ϐ��F l_ORGN_ODR_NO */
	public List l_ORGN_ODR_NO = null;

	/** �� 19 List�ϐ��F l_w_ADD_ODR_FLG */
	public List l_w_ADD_ODR_FLG = null;

	/** �� 20 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 21 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 22 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 23 List�ϐ��F l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** �� 24 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 25 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 26 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 27 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 28 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 29 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 30 List�ϐ��F l_CUR_UNIT_PRICE */
	public List l_CUR_UNIT_PRICE = null;

	/** �� 31 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 32 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 33 List�ϐ��F l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** �� 34 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 35 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 36 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 37 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 38 List�ϐ��F l_w_SEQ */
	public List l_w_SEQ = null;

	/** �� 39 List�ϐ��F l_h_SYS_COMPANY_CODE */
	public List l_h_SYS_COMPANY_CODE = null;

	/** �� 40 List�ϐ��F l_SYS_USER_CD */
	public List l_SYS_USER_CD = null;

	/** �� 41 List�ϐ��F l_w_CURRNCY_CD */
	public List l_w_CURRNCY_CD = null;

	/** �� 42 List�ϐ��F l_w_EXCH_TYP */
	public List l_w_EXCH_TYP = null;

	/** �� 43 List�ϐ��F l_w_ODR_AMOUNT_EXCH_RATES */
	public List l_w_ODR_AMOUNT_EXCH_RATES = null;

	/** �� 44 List�ϐ��F l_w_TAX_APPLY_TYP */
	public List l_w_TAX_APPLY_TYP = null;

	/** �� 45 List�ϐ��F l_w_TAX_CALC_TYP */
	public List l_w_TAX_CALC_TYP = null;

	/** �� 46 List�ϐ��F l_w_DETAIL_ROUND_TYP */
	public List l_w_DETAIL_ROUND_TYP = null;

	/** �� 47 List�ϐ��F l_w_USER_CD */
	public List l_w_USER_CD = null;

	/** �� 48 List�ϐ��F l_w_DECIMAL_FIG */
	public List l_w_DECIMAL_FIG = null;

	/** �� 49 List�ϐ��F l_haveFlag */
	public List l_haveFlag = null;

	/** �� 50 List�ϐ��F l_l_OWN_ORG_CD */
	public List l_l_OWN_ORG_CD = null;

	/** �� 51 List�ϐ��F l_l_OWN_PERSON_CD */
	public List l_l_OWN_PERSON_CD = null;

	/** �� 52 List�ϐ��F l_w_CUST_CD */
	public List l_w_CUST_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getchkADD_ODR_FLG() { return m_chkADD_ODR_FLG; }
	public String getCUR_UNIT_AMOUNT() { return m_CUR_UNIT_AMOUNT; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getlbORGN_ODR_NO() { return m_lbORGN_ODR_NO; }
	public String geth_APR_ODR() { return m_h_APR_ODR; }
	public String getAPPROVED_COMMENT() { return m_APPROVED_COMMENT; }
	public String geth_ODR_TYP() { return m_h_ODR_TYP; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getl_h_ESTIMATE_TYPE() { return m_l_h_ESTIMATE_TYPE; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getw_OPTION_ID() { return m_w_OPTION_ID; }
	public String getsysCOMPANY_CD() { return m_sysCOMPANY_CD; }
	public String getsysPLANT_CD() { return m_sysPLANT_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_SYS_CLASS() { return m_w_SYS_CLASS; }
	public String getw_VALUE() { return m_w_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getORGN_ODR_NO() { return m_ORGN_ODR_NO; }
	public String getw_ADD_ODR_FLG() { return m_w_ADD_ODR_FLG; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getCUR_UNIT_PRICE() { return m_CUR_UNIT_PRICE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getREMARKS() { return m_REMARKS; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getw_SEQ() { return m_w_SEQ; }
	public String geth_SYS_COMPANY_CODE() { return m_h_SYS_COMPANY_CODE; }
	public String getSYS_USER_CD() { return m_SYS_USER_CD; }
	public String getw_CURRNCY_CD() { return m_w_CURRNCY_CD; }
	public String getw_EXCH_TYP() { return m_w_EXCH_TYP; }
	public String getw_ODR_AMOUNT_EXCH_RATES() { return m_w_ODR_AMOUNT_EXCH_RATES; }
	public String getw_TAX_APPLY_TYP() { return m_w_TAX_APPLY_TYP; }
	public String getw_TAX_CALC_TYP() { return m_w_TAX_CALC_TYP; }
	public String getw_DETAIL_ROUND_TYP() { return m_w_DETAIL_ROUND_TYP; }
	public String getw_USER_CD() { return m_w_USER_CD; }
	public String getw_DECIMAL_FIG() { return m_w_DECIMAL_FIG; }
	public String gethaveFlag() { return m_haveFlag; }
	public String getl_OWN_ORG_CD() { return m_l_OWN_ORG_CD; }
	public String getl_OWN_PERSON_CD() { return m_l_OWN_PERSON_CD; }
	public String getw_CUST_CD() { return m_w_CUST_CD; }

	public List getList_chkADD_ODR_FLG() { return l_chkADD_ODR_FLG; }
	public List getList_CUR_UNIT_AMOUNT() { return l_CUR_UNIT_AMOUNT; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_lbORGN_ODR_NO() { return l_lbORGN_ODR_NO; }
	public List getList_h_APR_ODR() { return l_h_APR_ODR; }
	public List getList_APPROVED_COMMENT() { return l_APPROVED_COMMENT; }
	public List getList_h_ODR_TYP() { return l_h_ODR_TYP; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_l_h_ESTIMATE_TYPE() { return l_l_h_ESTIMATE_TYPE; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_w_OPTION_ID() { return l_w_OPTION_ID; }
	public List getList_sysCOMPANY_CD() { return l_sysCOMPANY_CD; }
	public List getList_sysPLANT_CD() { return l_sysPLANT_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_SYS_CLASS() { return l_w_SYS_CLASS; }
	public List getList_w_VALUE() { return l_w_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_ORGN_ODR_NO() { return l_ORGN_ODR_NO; }
	public List getList_w_ADD_ODR_FLG() { return l_w_ADD_ODR_FLG; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_CUR_UNIT_PRICE() { return l_CUR_UNIT_PRICE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_w_SEQ() { return l_w_SEQ; }
	public List getList_h_SYS_COMPANY_CODE() { return l_h_SYS_COMPANY_CODE; }
	public List getList_SYS_USER_CD() { return l_SYS_USER_CD; }
	public List getList_w_CURRNCY_CD() { return l_w_CURRNCY_CD; }
	public List getList_w_EXCH_TYP() { return l_w_EXCH_TYP; }
	public List getList_w_ODR_AMOUNT_EXCH_RATES() { return l_w_ODR_AMOUNT_EXCH_RATES; }
	public List getList_w_TAX_APPLY_TYP() { return l_w_TAX_APPLY_TYP; }
	public List getList_w_TAX_CALC_TYP() { return l_w_TAX_CALC_TYP; }
	public List getList_w_DETAIL_ROUND_TYP() { return l_w_DETAIL_ROUND_TYP; }
	public List getList_w_USER_CD() { return l_w_USER_CD; }
	public List getList_w_DECIMAL_FIG() { return l_w_DECIMAL_FIG; }
	public List getList_haveFlag() { return l_haveFlag; }
	public List getList_l_OWN_ORG_CD() { return l_l_OWN_ORG_CD; }
	public List getList_l_OWN_PERSON_CD() { return l_l_OWN_PERSON_CD; }
	public List getList_w_CUST_CD() { return l_w_CUST_CD; }

	public void setchkADD_ODR_FLG(String val) { m_chkADD_ODR_FLG = val; }
	public void setCUR_UNIT_AMOUNT(String val) { m_CUR_UNIT_AMOUNT = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setlbORGN_ODR_NO(String val) { m_lbORGN_ODR_NO = val; }
	public void seth_APR_ODR(String val) { m_h_APR_ODR = val; }
	public void setAPPROVED_COMMENT(String val) { m_APPROVED_COMMENT = val; }
	public void seth_ODR_TYP(String val) { m_h_ODR_TYP = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setl_h_ESTIMATE_TYPE(String val) { m_l_h_ESTIMATE_TYPE = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setw_OPTION_ID(String val) { m_w_OPTION_ID = val; }
	public void setsysCOMPANY_CD(String val) { m_sysCOMPANY_CD = val; }
	public void setsysPLANT_CD(String val) { m_sysPLANT_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_SYS_CLASS(String val) { m_w_SYS_CLASS = val; }
	public void setw_VALUE(String val) { m_w_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setORGN_ODR_NO(String val) { m_ORGN_ODR_NO = val; }
	public void setw_ADD_ODR_FLG(String val) { m_w_ADD_ODR_FLG = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setCUR_UNIT_PRICE(String val) { m_CUR_UNIT_PRICE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setODR_AMOUNT(String val) { m_ODR_AMOUNT = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setw_SEQ(String val) { m_w_SEQ = val; }
	public void seth_SYS_COMPANY_CODE(String val) { m_h_SYS_COMPANY_CODE = val; }
	public void setSYS_USER_CD(String val) { m_SYS_USER_CD = val; }
	public void setw_CURRNCY_CD(String val) { m_w_CURRNCY_CD = val; }
	public void setw_EXCH_TYP(String val) { m_w_EXCH_TYP = val; }
	public void setw_ODR_AMOUNT_EXCH_RATES(String val) { m_w_ODR_AMOUNT_EXCH_RATES = val; }
	public void setw_TAX_APPLY_TYP(String val) { m_w_TAX_APPLY_TYP = val; }
	public void setw_TAX_CALC_TYP(String val) { m_w_TAX_CALC_TYP = val; }
	public void setw_DETAIL_ROUND_TYP(String val) { m_w_DETAIL_ROUND_TYP = val; }
	public void setw_USER_CD(String val) { m_w_USER_CD = val; }
	public void setw_DECIMAL_FIG(String val) { m_w_DECIMAL_FIG = val; }
	public void sethaveFlag(String val) { m_haveFlag = val; }
	public void setl_OWN_ORG_CD(String val) { m_l_OWN_ORG_CD = val; }
	public void setl_OWN_PERSON_CD(String val) { m_l_OWN_PERSON_CD = val; }
	public void setw_CUST_CD(String val) { m_w_CUST_CD = val; }


	public void setList_chkADD_ODR_FLG(List list) { l_chkADD_ODR_FLG = list; }
	public void setList_CUR_UNIT_AMOUNT(List list) { l_CUR_UNIT_AMOUNT = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_lbORGN_ODR_NO(List list) { l_lbORGN_ODR_NO = list; }
	public void setList_h_APR_ODR(List list) { l_h_APR_ODR = list; }
	public void setList_APPROVED_COMMENT(List list) { l_APPROVED_COMMENT = list; }
	public void setList_h_ODR_TYP(List list) { l_h_ODR_TYP = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_l_h_ESTIMATE_TYPE(List list) { l_l_h_ESTIMATE_TYPE = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_w_OPTION_ID(List list) { l_w_OPTION_ID = list; }
	public void setList_sysCOMPANY_CD(List list) { l_sysCOMPANY_CD = list; }
	public void setList_sysPLANT_CD(List list) { l_sysPLANT_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_SYS_CLASS(List list) { l_w_SYS_CLASS = list; }
	public void setList_w_VALUE(List list) { l_w_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_ORGN_ODR_NO(List list) { l_ORGN_ODR_NO = list; }
	public void setList_w_ADD_ODR_FLG(List list) { l_w_ADD_ODR_FLG = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_CUR_UNIT_PRICE(List list) { l_CUR_UNIT_PRICE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_w_SEQ(List list) { l_w_SEQ = list; }
	public void setList_h_SYS_COMPANY_CODE(List list) { l_h_SYS_COMPANY_CODE = list; }
	public void setList_SYS_USER_CD(List list) { l_SYS_USER_CD = list; }
	public void setList_w_CURRNCY_CD(List list) { l_w_CURRNCY_CD = list; }
	public void setList_w_EXCH_TYP(List list) { l_w_EXCH_TYP = list; }
	public void setList_w_ODR_AMOUNT_EXCH_RATES(List list) { l_w_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_w_TAX_APPLY_TYP(List list) { l_w_TAX_APPLY_TYP = list; }
	public void setList_w_TAX_CALC_TYP(List list) { l_w_TAX_CALC_TYP = list; }
	public void setList_w_DETAIL_ROUND_TYP(List list) { l_w_DETAIL_ROUND_TYP = list; }
	public void setList_w_USER_CD(List list) { l_w_USER_CD = list; }
	public void setList_w_DECIMAL_FIG(List list) { l_w_DECIMAL_FIG = list; }
	public void setList_haveFlag(List list) { l_haveFlag = list; }
	public void setList_l_OWN_ORG_CD(List list) { l_l_OWN_ORG_CD = list; }
	public void setList_l_OWN_PERSON_CD(List list) { l_l_OWN_PERSON_CD = list; }
	public void setList_w_CUST_CD(List list) { l_w_CUST_CD = list; }

	public int setL2L_chkADD_ODR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkADD_ODR_FLG == null) {
			l_chkADD_ODR_FLG = new ArrayList();
		} else {
			l_chkADD_ODR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkADD_ODR_FLG.add(((KQ0090010Struct) list.get(i)).getchkADD_ODR_FLG());
		}
		return size;
	}
	public int setL2L_CUR_UNIT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT_AMOUNT == null) {
			l_CUR_UNIT_AMOUNT = new ArrayList();
		} else {
			l_CUR_UNIT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT_AMOUNT.add(((KQ0090010Struct) list.get(i)).getCUR_UNIT_AMOUNT());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((KQ0090010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_lbORGN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lbORGN_ODR_NO == null) {
			l_lbORGN_ODR_NO = new ArrayList();
		} else {
			l_lbORGN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lbORGN_ODR_NO.add(((KQ0090010Struct) list.get(i)).getlbORGN_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_APR_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_ODR == null) {
			l_h_APR_ODR = new ArrayList();
		} else {
			l_h_APR_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_ODR.add(((KQ0090010Struct) list.get(i)).geth_APR_ODR());
		}
		return size;
	}
	public int setL2L_APPROVED_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVED_COMMENT == null) {
			l_APPROVED_COMMENT = new ArrayList();
		} else {
			l_APPROVED_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVED_COMMENT.add(((KQ0090010Struct) list.get(i)).getAPPROVED_COMMENT());
		}
		return size;
	}
	public int setL2L_h_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_TYP == null) {
			l_h_ODR_TYP = new ArrayList();
		} else {
			l_h_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_TYP.add(((KQ0090010Struct) list.get(i)).geth_ODR_TYP());
		}
		return size;
	}
	public int setL2L_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP == null) {
			l_DEPO_TYP = new ArrayList();
		} else {
			l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP.add(((KQ0090010Struct) list.get(i)).getDEPO_TYP());
		}
		return size;
	}
	public int setL2L_l_h_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ESTIMATE_TYPE == null) {
			l_l_h_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_l_h_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ESTIMATE_TYPE.add(((KQ0090010Struct) list.get(i)).getl_h_ESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP == null) {
			l_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP.add(((KQ0090010Struct) list.get(i)).getSPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_w_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OPTION_ID == null) {
			l_w_OPTION_ID = new ArrayList();
		} else {
			l_w_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OPTION_ID.add(((KQ0090010Struct) list.get(i)).getw_OPTION_ID());
		}
		return size;
	}
	public int setL2L_sysCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysCOMPANY_CD == null) {
			l_sysCOMPANY_CD = new ArrayList();
		} else {
			l_sysCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysCOMPANY_CD.add(((KQ0090010Struct) list.get(i)).getsysCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_sysPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysPLANT_CD == null) {
			l_sysPLANT_CD = new ArrayList();
		} else {
			l_sysPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysPLANT_CD.add(((KQ0090010Struct) list.get(i)).getsysPLANT_CD());
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
			l_w_PLANT_CD.add(((KQ0090010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_SYS_CLASS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SYS_CLASS == null) {
			l_w_SYS_CLASS = new ArrayList();
		} else {
			l_w_SYS_CLASS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SYS_CLASS.add(((KQ0090010Struct) list.get(i)).getw_SYS_CLASS());
		}
		return size;
	}
	public int setL2L_w_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VALUE == null) {
			l_w_VALUE = new ArrayList();
		} else {
			l_w_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VALUE.add(((KQ0090010Struct) list.get(i)).getw_VALUE());
		}
		return size;
	}
	public int setL2L_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NAME == null) {
			l_NAME = new ArrayList();
		} else {
			l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NAME.add(((KQ0090010Struct) list.get(i)).getNAME());
		}
		return size;
	}
	public int setL2L_ORGN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_ODR_NO == null) {
			l_ORGN_ODR_NO = new ArrayList();
		} else {
			l_ORGN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_ODR_NO.add(((KQ0090010Struct) list.get(i)).getORGN_ODR_NO());
		}
		return size;
	}
	public int setL2L_w_ADD_ODR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ADD_ODR_FLG == null) {
			l_w_ADD_ODR_FLG = new ArrayList();
		} else {
			l_w_ADD_ODR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ADD_ODR_FLG.add(((KQ0090010Struct) list.get(i)).getw_ADD_ODR_FLG());
		}
		return size;
	}
	public int setL2L_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ACPT_DATE == null) {
			l_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ACPT_DATE.add(((KQ0090010Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_CUST_ODR_NO.add(((KQ0090010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_CUST_CD.add(((KQ0090010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ANAME.add(((KQ0090010Struct) list.get(i)).getCUST_ANAME());
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
			l_CUST_CHRG_PSN_CD.add(((KQ0090010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_USER_NAME.add(((KQ0090010Struct) list.get(i)).getUSER_NAME());
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
			l_ITEM_CD.add(((KQ0090010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KQ0090010Struct) list.get(i)).getITEM_NAME());
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
			l_DESINATED_DLV_DATE.add(((KQ0090010Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_UNIT_PRICE == null) {
			l_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_UNIT_PRICE.add(((KQ0090010Struct) list.get(i)).getODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_CUR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT_PRICE == null) {
			l_CUR_UNIT_PRICE = new ArrayList();
		} else {
			l_CUR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT_PRICE.add(((KQ0090010Struct) list.get(i)).getCUR_UNIT_PRICE());
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
			l_ODR_QTY.add(((KQ0090010Struct) list.get(i)).getODR_QTY());
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
			l_STOCK_UNIT.add(((KQ0090010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT == null) {
			l_ODR_AMOUNT = new ArrayList();
		} else {
			l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT.add(((KQ0090010Struct) list.get(i)).getODR_AMOUNT());
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
			l_TAX_CD.add(((KQ0090010Struct) list.get(i)).getTAX_CD());
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
			l_REMARKS.add(((KQ0090010Struct) list.get(i)).getREMARKS());
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
			l_h_MODIFY_COUNT.add(((KQ0090010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_ODR_NO.add(((KQ0090010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_w_SEQ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SEQ == null) {
			l_w_SEQ = new ArrayList();
		} else {
			l_w_SEQ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SEQ.add(((KQ0090010Struct) list.get(i)).getw_SEQ());
		}
		return size;
	}
	public int setL2L_h_SYS_COMPANY_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SYS_COMPANY_CODE == null) {
			l_h_SYS_COMPANY_CODE = new ArrayList();
		} else {
			l_h_SYS_COMPANY_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SYS_COMPANY_CODE.add(((KQ0090010Struct) list.get(i)).geth_SYS_COMPANY_CODE());
		}
		return size;
	}
	public int setL2L_SYS_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_USER_CD == null) {
			l_SYS_USER_CD = new ArrayList();
		} else {
			l_SYS_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_USER_CD.add(((KQ0090010Struct) list.get(i)).getSYS_USER_CD());
		}
		return size;
	}
	public int setL2L_w_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CURRNCY_CD == null) {
			l_w_CURRNCY_CD = new ArrayList();
		} else {
			l_w_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CURRNCY_CD.add(((KQ0090010Struct) list.get(i)).getw_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_w_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_EXCH_TYP == null) {
			l_w_EXCH_TYP = new ArrayList();
		} else {
			l_w_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_EXCH_TYP.add(((KQ0090010Struct) list.get(i)).getw_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_w_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_AMOUNT_EXCH_RATES == null) {
			l_w_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_w_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_AMOUNT_EXCH_RATES.add(((KQ0090010Struct) list.get(i)).getw_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_w_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_APPLY_TYP == null) {
			l_w_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_w_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_APPLY_TYP.add(((KQ0090010Struct) list.get(i)).getw_TAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_w_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_CALC_TYP == null) {
			l_w_TAX_CALC_TYP = new ArrayList();
		} else {
			l_w_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_CALC_TYP.add(((KQ0090010Struct) list.get(i)).getw_TAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_w_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DETAIL_ROUND_TYP == null) {
			l_w_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_w_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DETAIL_ROUND_TYP.add(((KQ0090010Struct) list.get(i)).getw_DETAIL_ROUND_TYP());
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
			l_w_USER_CD.add(((KQ0090010Struct) list.get(i)).getw_USER_CD());
		}
		return size;
	}
	public int setL2L_w_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DECIMAL_FIG == null) {
			l_w_DECIMAL_FIG = new ArrayList();
		} else {
			l_w_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DECIMAL_FIG.add(((KQ0090010Struct) list.get(i)).getw_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_haveFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_haveFlag == null) {
			l_haveFlag = new ArrayList();
		} else {
			l_haveFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_haveFlag.add(((KQ0090010Struct) list.get(i)).gethaveFlag());
		}
		return size;
	}
	public int setL2L_l_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_ORG_CD == null) {
			l_l_OWN_ORG_CD = new ArrayList();
		} else {
			l_l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_ORG_CD.add(((KQ0090010Struct) list.get(i)).getl_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PERSON_CD == null) {
			l_l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PERSON_CD.add(((KQ0090010Struct) list.get(i)).getl_OWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_w_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CUST_CD == null) {
			l_w_CUST_CD = new ArrayList();
		} else {
			l_w_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CUST_CD.add(((KQ0090010Struct) list.get(i)).getw_CUST_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_chkADD_ODR_FLG = null;
		m_CUR_UNIT_AMOUNT = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_lbORGN_ODR_NO = null;
		m_h_APR_ODR = null;
		m_APPROVED_COMMENT = null;
		m_h_ODR_TYP = null;
		m_DEPO_TYP = null;
		m_l_h_ESTIMATE_TYPE = null;
		m_SPCL_PRICE_TYP = null;
		m_w_OPTION_ID = null;
		m_sysCOMPANY_CD = null;
		m_sysPLANT_CD = null;
		m_w_PLANT_CD = null;
		m_w_SYS_CLASS = null;
		m_w_VALUE = null;
		m_NAME = null;
		m_ORGN_ODR_NO = null;
		m_w_ADD_ODR_FLG = null;
		m_ODR_ACPT_DATE = null;
		m_CUST_ODR_NO = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_CUST_CHRG_PSN_CD = null;
		m_USER_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_UNIT_PRICE = null;
		m_CUR_UNIT_PRICE = null;
		m_ODR_QTY = null;
		m_STOCK_UNIT = null;
		m_ODR_AMOUNT = null;
		m_TAX_CD = null;
		m_REMARKS = null;
		m_h_MODIFY_COUNT = null;
		m_ODR_NO = null;
		m_w_SEQ = null;
		m_h_SYS_COMPANY_CODE = null;
		m_SYS_USER_CD = null;
		m_w_CURRNCY_CD = null;
		m_w_EXCH_TYP = null;
		m_w_ODR_AMOUNT_EXCH_RATES = null;
		m_w_TAX_APPLY_TYP = null;
		m_w_TAX_CALC_TYP = null;
		m_w_DETAIL_ROUND_TYP = null;
		m_w_USER_CD = null;
		m_w_DECIMAL_FIG = null;
		m_haveFlag = null;
		m_l_OWN_ORG_CD = null;
		m_l_OWN_PERSON_CD = null;
		m_w_CUST_CD = null;

		l_chkADD_ODR_FLG = null;
		l_CUR_UNIT_AMOUNT = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_lbORGN_ODR_NO = null;
		l_h_APR_ODR = null;
		l_APPROVED_COMMENT = null;
		l_h_ODR_TYP = null;
		l_DEPO_TYP = null;
		l_l_h_ESTIMATE_TYPE = null;
		l_SPCL_PRICE_TYP = null;
		l_w_OPTION_ID = null;
		l_sysCOMPANY_CD = null;
		l_sysPLANT_CD = null;
		l_w_PLANT_CD = null;
		l_w_SYS_CLASS = null;
		l_w_VALUE = null;
		l_NAME = null;
		l_ORGN_ODR_NO = null;
		l_w_ADD_ODR_FLG = null;
		l_ODR_ACPT_DATE = null;
		l_CUST_ODR_NO = null;
		l_CUST_CD = null;
		l_CUST_ANAME = null;
		l_CUST_CHRG_PSN_CD = null;
		l_USER_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_UNIT_PRICE = null;
		l_CUR_UNIT_PRICE = null;
		l_ODR_QTY = null;
		l_STOCK_UNIT = null;
		l_ODR_AMOUNT = null;
		l_TAX_CD = null;
		l_REMARKS = null;
		l_h_MODIFY_COUNT = null;
		l_ODR_NO = null;
		l_w_SEQ = null;
		l_h_SYS_COMPANY_CODE = null;
		l_SYS_USER_CD = null;
		l_w_CURRNCY_CD = null;
		l_w_EXCH_TYP = null;
		l_w_ODR_AMOUNT_EXCH_RATES = null;
		l_w_TAX_APPLY_TYP = null;
		l_w_TAX_CALC_TYP = null;
		l_w_DETAIL_ROUND_TYP = null;
		l_w_USER_CD = null;
		l_w_DECIMAL_FIG = null;
		l_haveFlag = null;
		l_l_OWN_ORG_CD = null;
		l_l_OWN_PERSON_CD = null;
		l_w_CUST_CD = null;

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
	 * medKQ0090010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0090010Struct()
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
	public void setStruct(KQ0090010Struct struct)
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
	public void setStructM(KQ0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setchkADD_ODR_FLG(struct.getchkADD_ODR_FLG());
			this.setCUR_UNIT_AMOUNT(struct.getCUR_UNIT_AMOUNT());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setlbORGN_ODR_NO(struct.getlbORGN_ODR_NO());
			this.seth_APR_ODR(struct.geth_APR_ODR());
			this.setAPPROVED_COMMENT(struct.getAPPROVED_COMMENT());
			this.seth_ODR_TYP(struct.geth_ODR_TYP());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setl_h_ESTIMATE_TYPE(struct.getl_h_ESTIMATE_TYPE());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setw_OPTION_ID(struct.getw_OPTION_ID());
			this.setsysCOMPANY_CD(struct.getsysCOMPANY_CD());
			this.setsysPLANT_CD(struct.getsysPLANT_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_SYS_CLASS(struct.getw_SYS_CLASS());
			this.setw_VALUE(struct.getw_VALUE());
			this.setNAME(struct.getNAME());
			this.setORGN_ODR_NO(struct.getORGN_ODR_NO());
			this.setw_ADD_ODR_FLG(struct.getw_ADD_ODR_FLG());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setCUR_UNIT_PRICE(struct.getCUR_UNIT_PRICE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setTAX_CD(struct.getTAX_CD());
			this.setREMARKS(struct.getREMARKS());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setODR_NO(struct.getODR_NO());
			this.setw_SEQ(struct.getw_SEQ());
			this.seth_SYS_COMPANY_CODE(struct.geth_SYS_COMPANY_CODE());
			this.setSYS_USER_CD(struct.getSYS_USER_CD());
			this.setw_CURRNCY_CD(struct.getw_CURRNCY_CD());
			this.setw_EXCH_TYP(struct.getw_EXCH_TYP());
			this.setw_ODR_AMOUNT_EXCH_RATES(struct.getw_ODR_AMOUNT_EXCH_RATES());
			this.setw_TAX_APPLY_TYP(struct.getw_TAX_APPLY_TYP());
			this.setw_TAX_CALC_TYP(struct.getw_TAX_CALC_TYP());
			this.setw_DETAIL_ROUND_TYP(struct.getw_DETAIL_ROUND_TYP());
			this.setw_USER_CD(struct.getw_USER_CD());
			this.setw_DECIMAL_FIG(struct.getw_DECIMAL_FIG());
			this.sethaveFlag(struct.gethaveFlag());
			this.setl_OWN_ORG_CD(struct.getl_OWN_ORG_CD());
			this.setl_OWN_PERSON_CD(struct.getl_OWN_PERSON_CD());
			this.setw_CUST_CD(struct.getw_CUST_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_chkADD_ODR_FLG(struct.getList_chkADD_ODR_FLG());
			this.setList_CUR_UNIT_AMOUNT(struct.getList_CUR_UNIT_AMOUNT());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_lbORGN_ODR_NO(struct.getList_lbORGN_ODR_NO());
			this.setList_h_APR_ODR(struct.getList_h_APR_ODR());
			this.setList_APPROVED_COMMENT(struct.getList_APPROVED_COMMENT());
			this.setList_h_ODR_TYP(struct.getList_h_ODR_TYP());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_l_h_ESTIMATE_TYPE(struct.getList_l_h_ESTIMATE_TYPE());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_w_OPTION_ID(struct.getList_w_OPTION_ID());
			this.setList_sysCOMPANY_CD(struct.getList_sysCOMPANY_CD());
			this.setList_sysPLANT_CD(struct.getList_sysPLANT_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_SYS_CLASS(struct.getList_w_SYS_CLASS());
			this.setList_w_VALUE(struct.getList_w_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_ORGN_ODR_NO(struct.getList_ORGN_ODR_NO());
			this.setList_w_ADD_ODR_FLG(struct.getList_w_ADD_ODR_FLG());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_CUR_UNIT_PRICE(struct.getList_CUR_UNIT_PRICE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_w_SEQ(struct.getList_w_SEQ());
			this.setList_h_SYS_COMPANY_CODE(struct.getList_h_SYS_COMPANY_CODE());
			this.setList_SYS_USER_CD(struct.getList_SYS_USER_CD());
			this.setList_w_CURRNCY_CD(struct.getList_w_CURRNCY_CD());
			this.setList_w_EXCH_TYP(struct.getList_w_EXCH_TYP());
			this.setList_w_ODR_AMOUNT_EXCH_RATES(struct.getList_w_ODR_AMOUNT_EXCH_RATES());
			this.setList_w_TAX_APPLY_TYP(struct.getList_w_TAX_APPLY_TYP());
			this.setList_w_TAX_CALC_TYP(struct.getList_w_TAX_CALC_TYP());
			this.setList_w_DETAIL_ROUND_TYP(struct.getList_w_DETAIL_ROUND_TYP());
			this.setList_w_USER_CD(struct.getList_w_USER_CD());
			this.setList_w_DECIMAL_FIG(struct.getList_w_DECIMAL_FIG());
			this.setList_haveFlag(struct.getList_haveFlag());
			this.setList_l_OWN_ORG_CD(struct.getList_l_OWN_ORG_CD());
			this.setList_l_OWN_PERSON_CD(struct.getList_l_OWN_PERSON_CD());
			this.setList_w_CUST_CD(struct.getList_w_CUST_CD());
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
	// �� 1 �ϐ������l�F i_chkADD_ODR_FLG


	final static String i_chkADD_ODR_FLG = null;

	// �� 2 �ϐ������l�F i_CUR_UNIT_AMOUNT


	final static String i_CUR_UNIT_AMOUNT = null;

	// �� 3 �ϐ������l�F i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 4 �ϐ������l�F i_lbORGN_ODR_NO


	final static String i_lbORGN_ODR_NO = null;

	// �� 5 �ϐ������l�F i_h_APR_ODR


	final static String i_h_APR_ODR = null;

	// �� 6 �ϐ������l�F i_APPROVED_COMMENT


	final static String i_APPROVED_COMMENT = null;

	// �� 7 �ϐ������l�F i_h_ODR_TYP


	final static String i_h_ODR_TYP = null;

	// �� 8 �ϐ������l�F i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// �� 9 �ϐ������l�F i_l_h_ESTIMATE_TYPE


	final static String i_l_h_ESTIMATE_TYPE = null;

	// �� 10 �ϐ������l�F i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// �� 11 �ϐ������l�F i_w_OPTION_ID


	final static String i_w_OPTION_ID = null;

	// �� 12 �ϐ������l�F i_sysCOMPANY_CD


	final static String i_sysCOMPANY_CD = null;

	// �� 13 �ϐ������l�F i_sysPLANT_CD


	final static String i_sysPLANT_CD = null;

	// �� 14 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_w_SYS_CLASS


	final static String i_w_SYS_CLASS = null;

	// �� 16 �ϐ������l�F i_w_VALUE


	final static String i_w_VALUE = null;

	// �� 17 �ϐ������l�F i_NAME


	final static String i_NAME = null;

	// �� 18 �ϐ������l�F i_ORGN_ODR_NO


	final static String i_ORGN_ODR_NO = null;

	// �� 19 �ϐ������l�F i_w_ADD_ODR_FLG


	final static String i_w_ADD_ODR_FLG = null;

	// �� 20 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 21 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 22 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 23 �ϐ������l�F i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// �� 24 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 25 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 26 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 27 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 28 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 29 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 30 �ϐ������l�F i_CUR_UNIT_PRICE


	final static String i_CUR_UNIT_PRICE = null;

	// �� 31 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 32 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 33 �ϐ������l�F i_ODR_AMOUNT


	final static String i_ODR_AMOUNT = null;

	// �� 34 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 35 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 36 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 37 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 38 �ϐ������l�F i_w_SEQ


	final static String i_w_SEQ = null;

	// �� 39 �ϐ������l�F i_h_SYS_COMPANY_CODE


	final static String i_h_SYS_COMPANY_CODE = null;

	// �� 40 �ϐ������l�F i_SYS_USER_CD


	final static String i_SYS_USER_CD = null;

	// �� 41 �ϐ������l�F i_w_CURRNCY_CD


	final static String i_w_CURRNCY_CD = null;

	// �� 42 �ϐ������l�F i_w_EXCH_TYP


	final static String i_w_EXCH_TYP = null;

	// �� 43 �ϐ������l�F i_w_ODR_AMOUNT_EXCH_RATES


	final static String i_w_ODR_AMOUNT_EXCH_RATES = null;

	// �� 44 �ϐ������l�F i_w_TAX_APPLY_TYP


	final static String i_w_TAX_APPLY_TYP = null;

	// �� 45 �ϐ������l�F i_w_TAX_CALC_TYP


	final static String i_w_TAX_CALC_TYP = null;

	// �� 46 �ϐ������l�F i_w_DETAIL_ROUND_TYP


	final static String i_w_DETAIL_ROUND_TYP = null;

	// �� 47 �ϐ������l�F i_w_USER_CD


	final static String i_w_USER_CD = null;

	// �� 48 �ϐ������l�F i_w_DECIMAL_FIG


	final static String i_w_DECIMAL_FIG = null;

	// �� 49 �ϐ������l�F i_haveFlag


	final static String i_haveFlag = null;

	// �� 50 �ϐ������l�F i_l_OWN_ORG_CD


	final static String i_l_OWN_ORG_CD = null;

	// �� 51 �ϐ������l�F i_l_OWN_PERSON_CD


	final static String i_l_OWN_PERSON_CD = null;

	// �� 52 �ϐ������l�F i_w_CUST_CD


	final static String i_w_CUST_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_chkADD_ODR_FLG

	final static String i_chkADD_ODR_FLG = null;

	// �� 2 �ϐ������l�F i_CUR_UNIT_AMOUNT

	final static String i_CUR_UNIT_AMOUNT = null;

	// �� 3 �ϐ������l�F i_h_BUSINESS_OPR_DATE

	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 4 �ϐ������l�F i_lbORGN_ODR_NO

	final static String i_lbORGN_ODR_NO = null;

	// �� 5 �ϐ������l�F i_w_OPTION_ID

	final static String i_w_OPTION_ID = null;

	// �� 6 �ϐ������l�F i_sysCOMPANY_CD

	final static String i_sysCOMPANY_CD = null;

	// �� 7 �ϐ������l�F i_sysPLANT_CD

	final static String i_sysPLANT_CD = null;

	// �� 8 �ϐ������l�F i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// �� 9 �ϐ������l�F i_w_VALUE

	final static String i_w_VALUE = null;

	// �� 10 �ϐ������l�F i_ORGN_ODR_NO

	final static String i_ORGN_ODR_NO = null;

	// �� 11 �ϐ������l�F i_w_ADD_ODR_FLG

	final static String i_w_ADD_ODR_FLG = null;

	// �� 12 �ϐ������l�F i_ODR_ACPT_DATE

	final static String i_ODR_ACPT_DATE = null;

	// �� 13 �ϐ������l�F i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// �� 14 �ϐ������l�F i_CUST_CD

	final static String i_CUST_CD = null;

	// �� 15 �ϐ������l�F i_CUST_ANAME

	final static String i_CUST_ANAME = null;

	// �� 16 �ϐ������l�F i_CUST_CHRG_PSN_CD

	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 17 �ϐ������l�F i_USER_NAME

	final static String i_USER_NAME = null;

	// �� 18 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 19 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 20 �ϐ������l�F i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// �� 21 �ϐ������l�F i_ODR_UNIT_PRICE

	final static String i_ODR_UNIT_PRICE = null;

	// �� 22 �ϐ������l�F i_CUR_UNIT_PRICE

	final static String i_CUR_UNIT_PRICE = null;

	// �� 23 �ϐ������l�F i_ODR_QTY

	final static String i_ODR_QTY = null;

	// �� 24 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 25 �ϐ������l�F i_ODR_AMOUNT

	final static String i_ODR_AMOUNT = null;

	// �� 26 �ϐ������l�F i_TAX_CD

	final static String i_TAX_CD = null;

	// �� 27 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 28 �ϐ������l�F i_h_MODIFY_COUNT

	final static String i_h_MODIFY_COUNT = null;

	// �� 29 �ϐ������l�F i_ODR_NO

	final static String i_ODR_NO = null;

	// �� 30 �ϐ������l�F i_w_USER_CD

	final static String i_w_USER_CD = null;

	// �� 31 �ϐ������l�F i_SYS_COMPANY_CD

	final static String i_SYS_COMPANY_CD = null;

	// �� 32 �ϐ������l�F i_SYS_USER_CD

	final static String i_SYS_USER_CD = null;

	// �� 33 �ϐ������l�F i_w_CURRNCY_CD

	final static String i_w_CURRNCY_CD = null;

	// �� 34 �ϐ������l�F i_w_EXCH_TYP

	final static String i_w_EXCH_TYP = null;

	// �� 35 �ϐ������l�F i_w_ODR_AMOUNT

	final static String i_w_ODR_AMOUNT = null;

	// �� 36 �ϐ������l�F i_w_ODR_AMOUNT_EXCH_RATES

	final static String i_w_ODR_AMOUNT_EXCH_RATES = null;

	// �� 37 �ϐ������l�F i_w_TAX_APPLY_TYP

	final static String i_w_TAX_APPLY_TYP = null;

	// �� 38 �ϐ������l�F i_w_TAX_CALC_TYP

	final static String i_w_TAX_CALC_TYP = null;

	// �� 39 �ϐ������l�F i_w_DETAIL_ROUND_TYP

	final static String i_w_DETAIL_ROUND_TYP = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_chkADD_ODR_FLG = i_chkADD_ODR_FLG;
		m_CUR_UNIT_AMOUNT = i_CUR_UNIT_AMOUNT;
		m_h_BUSINESS_OPR_DATE = i_h_BUSINESS_OPR_DATE;
		m_lbORGN_ODR_NO = i_lbORGN_ODR_NO;
		m_w_OPTION_ID = i_w_OPTION_ID;
		m_sysCOMPANY_CD = i_sysCOMPANY_CD;
		m_sysPLANT_CD = i_sysPLANT_CD;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_w_VALUE = i_w_VALUE;
		m_ORGN_ODR_NO = i_ORGN_ODR_NO;
		m_w_ADD_ODR_FLG = i_w_ADD_ODR_FLG;
		m_ODR_ACPT_DATE = i_ODR_ACPT_DATE;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_CUST_CD = i_CUST_CD;
		m_CUST_ANAME = i_CUST_ANAME;
		m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
		m_USER_NAME = i_USER_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_ODR_UNIT_PRICE = i_ODR_UNIT_PRICE;
		m_CUR_UNIT_PRICE = i_CUR_UNIT_PRICE;
		m_ODR_QTY = i_ODR_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_ODR_AMOUNT = i_ODR_AMOUNT;
		m_TAX_CD = i_TAX_CD;
		m_REMARKS = i_REMARKS;
		m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
		m_ODR_NO = i_ODR_NO;
		m_w_USER_CD = i_w_USER_CD;
		m_SYS_USER_CD = i_SYS_USER_CD;
		m_w_CURRNCY_CD = i_w_CURRNCY_CD;
		m_w_EXCH_TYP = i_w_EXCH_TYP;
		m_w_ODR_AMOUNT_EXCH_RATES = i_w_ODR_AMOUNT_EXCH_RATES;
		m_w_TAX_APPLY_TYP = i_w_TAX_APPLY_TYP;
		m_w_TAX_CALC_TYP = i_w_TAX_CALC_TYP;
		m_w_DETAIL_ROUND_TYP = i_w_DETAIL_ROUND_TYP;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
