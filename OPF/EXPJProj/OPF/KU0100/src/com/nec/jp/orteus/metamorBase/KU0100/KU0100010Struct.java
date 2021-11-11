/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0100/src/com/nec/jp/orteus/metamorBase/KU0100/KU0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0100;

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
 * CLASS     : KU0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2014/11/05 07:30:48 $
 *
 */
//}}user_implement_code_header

public class KU0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_COPY */
	public String m_COPY = null;
	/** �� 2 �ϐ��F m_RE_OUT_PUT */
	public String m_RE_OUT_PUT = null;
	/** �� 3 �ϐ��F m_SHIP_INVOICE_DATE_FROM */
	public String m_SHIP_INVOICE_DATE_FROM = null;
	/** �� 4 �ϐ��F m_SHIP_INVOICE_DATE_TO */
	public String m_SHIP_INVOICE_DATE_TO = null;
	/** �� 5 �ϐ��F m_SCDL_SHIP_DATE_FROM */
	public String m_SCDL_SHIP_DATE_FROM = null;
	/** �� 6 �ϐ��F m_SCDL_SHIP_DATE_TO */
	public String m_SCDL_SHIP_DATE_TO = null;
	/** �� 7 �ϐ��F m_r_MasterPrint */
	public String m_r_MasterPrint = null;
	/** �� 8 �ϐ��F m_r_CopyPrint */
	public String m_r_CopyPrint = null;
	/** �� 9 �ϐ��F m_COUNT */
	public String m_COUNT = null;
	/** �� 10 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 11 �ϐ��F m_c_RE_OUT_PUT */
	public String m_c_RE_OUT_PUT = null;
	/** �� 12 �ϐ��F m_SHIP_PLAN_DATE_TIME_FROM */
	public String m_SHIP_PLAN_DATE_TIME_FROM = null;
	/** �� 13 �ϐ��F m_SHIP_PLAN_DATE_TIME_TO */
	public String m_SHIP_PLAN_DATE_TIME_TO = null;
	/** �� 14 �ϐ��F m_SHIP_INVOICE_CTL_NO */
	public String m_SHIP_INVOICE_CTL_NO = null;
	/** �� 15 �ϐ��F m_w_SHIP_INVOICE_NO */
	public String m_w_SHIP_INVOICE_NO = null;
	/** �� 16 �ϐ��F m_w_CUST_CD */
	public String m_w_CUST_CD = null;
	/** �� 17 �ϐ��F m_w_CUST_NAME */
	public String m_w_CUST_NAME = null;
	/** �� 18 �ϐ��F m_w_SHIP_PLAN_DATE */
	public String m_w_SHIP_PLAN_DATE = null;
	/** �� 19 �ϐ��F m_w_SHIP_NO */
	public String m_w_SHIP_NO = null;
	/** �� 20 �ϐ��F m_w_DLV_LOC_CD */
	public String m_w_DLV_LOC_CD = null;
	/** �� 21 �ϐ��F m_w_DEPARTURE_PLACE */
	public String m_w_DEPARTURE_PLACE = null;
	/** �� 22 �ϐ��F m_w_DEPARTURE_DATE */
	public String m_w_DEPARTURE_DATE = null;
	/** �� 23 �ϐ��F m_w_ARRIVAL_PLACE */
	public String m_w_ARRIVAL_PLACE = null;
	/** �� 24 �ϐ��F m_w_ARRIVAL_DATE */
	public String m_w_ARRIVAL_DATE = null;
	/** �� 25 �ϐ��F m_w_REMARKS_1 */
	public String m_w_REMARKS_1 = null;
	/** �� 26 �ϐ��F m_w_REMARKS_2 */
	public String m_w_REMARKS_2 = null;
	/** �� 27 �ϐ��F m_w_TAX_INCLUDE_AMOUNT */
	public String m_w_TAX_INCLUDE_AMOUNT = null;
	/** �� 28 �ϐ��F m_w_INVOICE_TAX_AMOUNT */
	public String m_w_INVOICE_TAX_AMOUNT = null;
	/** �� 29 �ϐ��F m_w_TAX_CREDIT_AMOUNT */
	public String m_w_TAX_CREDIT_AMOUNT = null;
	/** �� 30 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 31 �ϐ��F m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** �� 32 �ϐ��F m_w_ODR_NO */
	public String m_w_ODR_NO = null;
	/** �� 33 �ϐ��F m_w_SHIP_QTY */
	public String m_w_SHIP_QTY = null;
	/** �� 34 �ϐ��F m_w_UNIT_PRICE */
	public String m_w_UNIT_PRICE = null;
	/** �� 35 �ϐ��F m_w_SHIP_ODR_AMOUNT */
	public String m_w_SHIP_ODR_AMOUNT = null;
	/** �� 36 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 37 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 38 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 39 �ϐ��F m_w_SHIP_INVOICE_DATE_FROM */
	public String m_w_SHIP_INVOICE_DATE_FROM = null;
	/** �� 40 �ϐ��F m_w_SHIP_INVOICE_DATE_TO */
	public String m_w_SHIP_INVOICE_DATE_TO = null;
	/** �� 41 �ϐ��F m_w_SCDL_SHIP_DATE_FROM */
	public String m_w_SCDL_SHIP_DATE_FROM = null;
	/** �� 42 �ϐ��F m_w_SCDL_SHIP_DATE_TO */
	public String m_w_SCDL_SHIP_DATE_TO = null;
	/** �� 43 �ϐ��F m_w_PRINT_FLG */
	public String m_w_PRINT_FLG = null;
	/** �� 44 �ϐ��F m_w_SHIP_INVOICE_CTL_NO */
	public String m_w_SHIP_INVOICE_CTL_NO = null;
	/** �� 45 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 46 �ϐ��F m_PRINT_FLG */
	public String m_PRINT_FLG = null;
	/** �� 47 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 48 �ϐ��F m_NAME */
	public String m_NAME = null;
	/** �� 49 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_COPY */
	public List l_COPY = null;

	/** �� 2 List�ϐ��F l_RE_OUT_PUT */
	public List l_RE_OUT_PUT = null;

	/** �� 3 List�ϐ��F l_SHIP_INVOICE_DATE_FROM */
	public List l_SHIP_INVOICE_DATE_FROM = null;

	/** �� 4 List�ϐ��F l_SHIP_INVOICE_DATE_TO */
	public List l_SHIP_INVOICE_DATE_TO = null;

	/** �� 5 List�ϐ��F l_SCDL_SHIP_DATE_FROM */
	public List l_SCDL_SHIP_DATE_FROM = null;

	/** �� 6 List�ϐ��F l_SCDL_SHIP_DATE_TO */
	public List l_SCDL_SHIP_DATE_TO = null;

	/** �� 7 List�ϐ��F l_r_MasterPrint */
	public List l_r_MasterPrint = null;

	/** �� 8 List�ϐ��F l_r_CopyPrint */
	public List l_r_CopyPrint = null;

	/** �� 9 List�ϐ��F l_COUNT */
	public List l_COUNT = null;

	/** �� 10 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 11 List�ϐ��F l_c_RE_OUT_PUT */
	public List l_c_RE_OUT_PUT = null;

	/** �� 12 List�ϐ��F l_SHIP_PLAN_DATE_TIME_FROM */
	public List l_SHIP_PLAN_DATE_TIME_FROM = null;

	/** �� 13 List�ϐ��F l_SHIP_PLAN_DATE_TIME_TO */
	public List l_SHIP_PLAN_DATE_TIME_TO = null;

	/** �� 14 List�ϐ��F l_SHIP_INVOICE_CTL_NO */
	public List l_SHIP_INVOICE_CTL_NO = null;

	/** �� 15 List�ϐ��F l_w_SHIP_INVOICE_NO */
	public List l_w_SHIP_INVOICE_NO = null;

	/** �� 16 List�ϐ��F l_w_CUST_CD */
	public List l_w_CUST_CD = null;

	/** �� 17 List�ϐ��F l_w_CUST_NAME */
	public List l_w_CUST_NAME = null;

	/** �� 18 List�ϐ��F l_w_SHIP_PLAN_DATE */
	public List l_w_SHIP_PLAN_DATE = null;

	/** �� 19 List�ϐ��F l_w_SHIP_NO */
	public List l_w_SHIP_NO = null;

	/** �� 20 List�ϐ��F l_w_DLV_LOC_CD */
	public List l_w_DLV_LOC_CD = null;

	/** �� 21 List�ϐ��F l_w_DEPARTURE_PLACE */
	public List l_w_DEPARTURE_PLACE = null;

	/** �� 22 List�ϐ��F l_w_DEPARTURE_DATE */
	public List l_w_DEPARTURE_DATE = null;

	/** �� 23 List�ϐ��F l_w_ARRIVAL_PLACE */
	public List l_w_ARRIVAL_PLACE = null;

	/** �� 24 List�ϐ��F l_w_ARRIVAL_DATE */
	public List l_w_ARRIVAL_DATE = null;

	/** �� 25 List�ϐ��F l_w_REMARKS_1 */
	public List l_w_REMARKS_1 = null;

	/** �� 26 List�ϐ��F l_w_REMARKS_2 */
	public List l_w_REMARKS_2 = null;

	/** �� 27 List�ϐ��F l_w_TAX_INCLUDE_AMOUNT */
	public List l_w_TAX_INCLUDE_AMOUNT = null;

	/** �� 28 List�ϐ��F l_w_INVOICE_TAX_AMOUNT */
	public List l_w_INVOICE_TAX_AMOUNT = null;

	/** �� 29 List�ϐ��F l_w_TAX_CREDIT_AMOUNT */
	public List l_w_TAX_CREDIT_AMOUNT = null;

	/** �� 30 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** �� 32 List�ϐ��F l_w_ODR_NO */
	public List l_w_ODR_NO = null;

	/** �� 33 List�ϐ��F l_w_SHIP_QTY */
	public List l_w_SHIP_QTY = null;

	/** �� 34 List�ϐ��F l_w_UNIT_PRICE */
	public List l_w_UNIT_PRICE = null;

	/** �� 35 List�ϐ��F l_w_SHIP_ODR_AMOUNT */
	public List l_w_SHIP_ODR_AMOUNT = null;

	/** �� 36 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 37 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 38 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 39 List�ϐ��F l_w_SHIP_INVOICE_DATE_FROM */
	public List l_w_SHIP_INVOICE_DATE_FROM = null;

	/** �� 40 List�ϐ��F l_w_SHIP_INVOICE_DATE_TO */
	public List l_w_SHIP_INVOICE_DATE_TO = null;

	/** �� 41 List�ϐ��F l_w_SCDL_SHIP_DATE_FROM */
	public List l_w_SCDL_SHIP_DATE_FROM = null;

	/** �� 42 List�ϐ��F l_w_SCDL_SHIP_DATE_TO */
	public List l_w_SCDL_SHIP_DATE_TO = null;

	/** �� 43 List�ϐ��F l_w_PRINT_FLG */
	public List l_w_PRINT_FLG = null;

	/** �� 44 List�ϐ��F l_w_SHIP_INVOICE_CTL_NO */
	public List l_w_SHIP_INVOICE_CTL_NO = null;

	/** �� 45 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 46 List�ϐ��F l_PRINT_FLG */
	public List l_PRINT_FLG = null;

	/** �� 47 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 48 List�ϐ��F l_NAME */
	public List l_NAME = null;

	/** �� 49 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCOPY() { return m_COPY; }
	public String getRE_OUT_PUT() { return m_RE_OUT_PUT; }
	public String getSHIP_INVOICE_DATE_FROM() { return m_SHIP_INVOICE_DATE_FROM; }
	public String getSHIP_INVOICE_DATE_TO() { return m_SHIP_INVOICE_DATE_TO; }
	public String getSCDL_SHIP_DATE_FROM() { return m_SCDL_SHIP_DATE_FROM; }
	public String getSCDL_SHIP_DATE_TO() { return m_SCDL_SHIP_DATE_TO; }
	public String getr_MasterPrint() { return m_r_MasterPrint; }
	public String getr_CopyPrint() { return m_r_CopyPrint; }
	public String getCOUNT() { return m_COUNT; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getc_RE_OUT_PUT() { return m_c_RE_OUT_PUT; }
	public String getSHIP_PLAN_DATE_TIME_FROM() { return m_SHIP_PLAN_DATE_TIME_FROM; }
	public String getSHIP_PLAN_DATE_TIME_TO() { return m_SHIP_PLAN_DATE_TIME_TO; }
	public String getSHIP_INVOICE_CTL_NO() { return m_SHIP_INVOICE_CTL_NO; }
	public String getw_SHIP_INVOICE_NO() { return m_w_SHIP_INVOICE_NO; }
	public String getw_CUST_CD() { return m_w_CUST_CD; }
	public String getw_CUST_NAME() { return m_w_CUST_NAME; }
	public String getw_SHIP_PLAN_DATE() { return m_w_SHIP_PLAN_DATE; }
	public String getw_SHIP_NO() { return m_w_SHIP_NO; }
	public String getw_DLV_LOC_CD() { return m_w_DLV_LOC_CD; }
	public String getw_DEPARTURE_PLACE() { return m_w_DEPARTURE_PLACE; }
	public String getw_DEPARTURE_DATE() { return m_w_DEPARTURE_DATE; }
	public String getw_ARRIVAL_PLACE() { return m_w_ARRIVAL_PLACE; }
	public String getw_ARRIVAL_DATE() { return m_w_ARRIVAL_DATE; }
	public String getw_REMARKS_1() { return m_w_REMARKS_1; }
	public String getw_REMARKS_2() { return m_w_REMARKS_2; }
	public String getw_TAX_INCLUDE_AMOUNT() { return m_w_TAX_INCLUDE_AMOUNT; }
	public String getw_INVOICE_TAX_AMOUNT() { return m_w_INVOICE_TAX_AMOUNT; }
	public String getw_TAX_CREDIT_AMOUNT() { return m_w_TAX_CREDIT_AMOUNT; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getw_ODR_NO() { return m_w_ODR_NO; }
	public String getw_SHIP_QTY() { return m_w_SHIP_QTY; }
	public String getw_UNIT_PRICE() { return m_w_UNIT_PRICE; }
	public String getw_SHIP_ODR_AMOUNT() { return m_w_SHIP_ODR_AMOUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getw_SHIP_INVOICE_DATE_FROM() { return m_w_SHIP_INVOICE_DATE_FROM; }
	public String getw_SHIP_INVOICE_DATE_TO() { return m_w_SHIP_INVOICE_DATE_TO; }
	public String getw_SCDL_SHIP_DATE_FROM() { return m_w_SCDL_SHIP_DATE_FROM; }
	public String getw_SCDL_SHIP_DATE_TO() { return m_w_SCDL_SHIP_DATE_TO; }
	public String getw_PRINT_FLG() { return m_w_PRINT_FLG; }
	public String getw_SHIP_INVOICE_CTL_NO() { return m_w_SHIP_INVOICE_CTL_NO; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getPRINT_FLG() { return m_PRINT_FLG; }
	public String getVALUE() { return m_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getOPTION_ID() { return m_OPTION_ID; }

	public List getList_COPY() { return l_COPY; }
	public List getList_RE_OUT_PUT() { return l_RE_OUT_PUT; }
	public List getList_SHIP_INVOICE_DATE_FROM() { return l_SHIP_INVOICE_DATE_FROM; }
	public List getList_SHIP_INVOICE_DATE_TO() { return l_SHIP_INVOICE_DATE_TO; }
	public List getList_SCDL_SHIP_DATE_FROM() { return l_SCDL_SHIP_DATE_FROM; }
	public List getList_SCDL_SHIP_DATE_TO() { return l_SCDL_SHIP_DATE_TO; }
	public List getList_r_MasterPrint() { return l_r_MasterPrint; }
	public List getList_r_CopyPrint() { return l_r_CopyPrint; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_c_RE_OUT_PUT() { return l_c_RE_OUT_PUT; }
	public List getList_SHIP_PLAN_DATE_TIME_FROM() { return l_SHIP_PLAN_DATE_TIME_FROM; }
	public List getList_SHIP_PLAN_DATE_TIME_TO() { return l_SHIP_PLAN_DATE_TIME_TO; }
	public List getList_SHIP_INVOICE_CTL_NO() { return l_SHIP_INVOICE_CTL_NO; }
	public List getList_w_SHIP_INVOICE_NO() { return l_w_SHIP_INVOICE_NO; }
	public List getList_w_CUST_CD() { return l_w_CUST_CD; }
	public List getList_w_CUST_NAME() { return l_w_CUST_NAME; }
	public List getList_w_SHIP_PLAN_DATE() { return l_w_SHIP_PLAN_DATE; }
	public List getList_w_SHIP_NO() { return l_w_SHIP_NO; }
	public List getList_w_DLV_LOC_CD() { return l_w_DLV_LOC_CD; }
	public List getList_w_DEPARTURE_PLACE() { return l_w_DEPARTURE_PLACE; }
	public List getList_w_DEPARTURE_DATE() { return l_w_DEPARTURE_DATE; }
	public List getList_w_ARRIVAL_PLACE() { return l_w_ARRIVAL_PLACE; }
	public List getList_w_ARRIVAL_DATE() { return l_w_ARRIVAL_DATE; }
	public List getList_w_REMARKS_1() { return l_w_REMARKS_1; }
	public List getList_w_REMARKS_2() { return l_w_REMARKS_2; }
	public List getList_w_TAX_INCLUDE_AMOUNT() { return l_w_TAX_INCLUDE_AMOUNT; }
	public List getList_w_INVOICE_TAX_AMOUNT() { return l_w_INVOICE_TAX_AMOUNT; }
	public List getList_w_TAX_CREDIT_AMOUNT() { return l_w_TAX_CREDIT_AMOUNT; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_w_ODR_NO() { return l_w_ODR_NO; }
	public List getList_w_SHIP_QTY() { return l_w_SHIP_QTY; }
	public List getList_w_UNIT_PRICE() { return l_w_UNIT_PRICE; }
	public List getList_w_SHIP_ODR_AMOUNT() { return l_w_SHIP_ODR_AMOUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_w_SHIP_INVOICE_DATE_FROM() { return l_w_SHIP_INVOICE_DATE_FROM; }
	public List getList_w_SHIP_INVOICE_DATE_TO() { return l_w_SHIP_INVOICE_DATE_TO; }
	public List getList_w_SCDL_SHIP_DATE_FROM() { return l_w_SCDL_SHIP_DATE_FROM; }
	public List getList_w_SCDL_SHIP_DATE_TO() { return l_w_SCDL_SHIP_DATE_TO; }
	public List getList_w_PRINT_FLG() { return l_w_PRINT_FLG; }
	public List getList_w_SHIP_INVOICE_CTL_NO() { return l_w_SHIP_INVOICE_CTL_NO; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_PRINT_FLG() { return l_PRINT_FLG; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }

	public void setCOPY(String val) { m_COPY = val; }
	public void setRE_OUT_PUT(String val) { m_RE_OUT_PUT = val; }
	public void setSHIP_INVOICE_DATE_FROM(String val) { m_SHIP_INVOICE_DATE_FROM = val; }
	public void setSHIP_INVOICE_DATE_TO(String val) { m_SHIP_INVOICE_DATE_TO = val; }
	public void setSCDL_SHIP_DATE_FROM(String val) { m_SCDL_SHIP_DATE_FROM = val; }
	public void setSCDL_SHIP_DATE_TO(String val) { m_SCDL_SHIP_DATE_TO = val; }
	public void setr_MasterPrint(String val) { m_r_MasterPrint = val; }
	public void setr_CopyPrint(String val) { m_r_CopyPrint = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setc_RE_OUT_PUT(String val) { m_c_RE_OUT_PUT = val; }
	public void setSHIP_PLAN_DATE_TIME_FROM(String val) { m_SHIP_PLAN_DATE_TIME_FROM = val; }
	public void setSHIP_PLAN_DATE_TIME_TO(String val) { m_SHIP_PLAN_DATE_TIME_TO = val; }
	public void setSHIP_INVOICE_CTL_NO(String val) { m_SHIP_INVOICE_CTL_NO = val; }
	public void setw_SHIP_INVOICE_NO(String val) { m_w_SHIP_INVOICE_NO = val; }
	public void setw_CUST_CD(String val) { m_w_CUST_CD = val; }
	public void setw_CUST_NAME(String val) { m_w_CUST_NAME = val; }
	public void setw_SHIP_PLAN_DATE(String val) { m_w_SHIP_PLAN_DATE = val; }
	public void setw_SHIP_NO(String val) { m_w_SHIP_NO = val; }
	public void setw_DLV_LOC_CD(String val) { m_w_DLV_LOC_CD = val; }
	public void setw_DEPARTURE_PLACE(String val) { m_w_DEPARTURE_PLACE = val; }
	public void setw_DEPARTURE_DATE(String val) { m_w_DEPARTURE_DATE = val; }
	public void setw_ARRIVAL_PLACE(String val) { m_w_ARRIVAL_PLACE = val; }
	public void setw_ARRIVAL_DATE(String val) { m_w_ARRIVAL_DATE = val; }
	public void setw_REMARKS_1(String val) { m_w_REMARKS_1 = val; }
	public void setw_REMARKS_2(String val) { m_w_REMARKS_2 = val; }
	public void setw_TAX_INCLUDE_AMOUNT(String val) { m_w_TAX_INCLUDE_AMOUNT = val; }
	public void setw_INVOICE_TAX_AMOUNT(String val) { m_w_INVOICE_TAX_AMOUNT = val; }
	public void setw_TAX_CREDIT_AMOUNT(String val) { m_w_TAX_CREDIT_AMOUNT = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setw_ODR_NO(String val) { m_w_ODR_NO = val; }
	public void setw_SHIP_QTY(String val) { m_w_SHIP_QTY = val; }
	public void setw_UNIT_PRICE(String val) { m_w_UNIT_PRICE = val; }
	public void setw_SHIP_ODR_AMOUNT(String val) { m_w_SHIP_ODR_AMOUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setw_SHIP_INVOICE_DATE_FROM(String val) { m_w_SHIP_INVOICE_DATE_FROM = val; }
	public void setw_SHIP_INVOICE_DATE_TO(String val) { m_w_SHIP_INVOICE_DATE_TO = val; }
	public void setw_SCDL_SHIP_DATE_FROM(String val) { m_w_SCDL_SHIP_DATE_FROM = val; }
	public void setw_SCDL_SHIP_DATE_TO(String val) { m_w_SCDL_SHIP_DATE_TO = val; }
	public void setw_PRINT_FLG(String val) { m_w_PRINT_FLG = val; }
	public void setw_SHIP_INVOICE_CTL_NO(String val) { m_w_SHIP_INVOICE_CTL_NO = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setPRINT_FLG(String val) { m_PRINT_FLG = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }


	public void setList_COPY(List list) { l_COPY = list; }
	public void setList_RE_OUT_PUT(List list) { l_RE_OUT_PUT = list; }
	public void setList_SHIP_INVOICE_DATE_FROM(List list) { l_SHIP_INVOICE_DATE_FROM = list; }
	public void setList_SHIP_INVOICE_DATE_TO(List list) { l_SHIP_INVOICE_DATE_TO = list; }
	public void setList_SCDL_SHIP_DATE_FROM(List list) { l_SCDL_SHIP_DATE_FROM = list; }
	public void setList_SCDL_SHIP_DATE_TO(List list) { l_SCDL_SHIP_DATE_TO = list; }
	public void setList_r_MasterPrint(List list) { l_r_MasterPrint = list; }
	public void setList_r_CopyPrint(List list) { l_r_CopyPrint = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_c_RE_OUT_PUT(List list) { l_c_RE_OUT_PUT = list; }
	public void setList_SHIP_PLAN_DATE_TIME_FROM(List list) { l_SHIP_PLAN_DATE_TIME_FROM = list; }
	public void setList_SHIP_PLAN_DATE_TIME_TO(List list) { l_SHIP_PLAN_DATE_TIME_TO = list; }
	public void setList_SHIP_INVOICE_CTL_NO(List list) { l_SHIP_INVOICE_CTL_NO = list; }
	public void setList_w_SHIP_INVOICE_NO(List list) { l_w_SHIP_INVOICE_NO = list; }
	public void setList_w_CUST_CD(List list) { l_w_CUST_CD = list; }
	public void setList_w_CUST_NAME(List list) { l_w_CUST_NAME = list; }
	public void setList_w_SHIP_PLAN_DATE(List list) { l_w_SHIP_PLAN_DATE = list; }
	public void setList_w_SHIP_NO(List list) { l_w_SHIP_NO = list; }
	public void setList_w_DLV_LOC_CD(List list) { l_w_DLV_LOC_CD = list; }
	public void setList_w_DEPARTURE_PLACE(List list) { l_w_DEPARTURE_PLACE = list; }
	public void setList_w_DEPARTURE_DATE(List list) { l_w_DEPARTURE_DATE = list; }
	public void setList_w_ARRIVAL_PLACE(List list) { l_w_ARRIVAL_PLACE = list; }
	public void setList_w_ARRIVAL_DATE(List list) { l_w_ARRIVAL_DATE = list; }
	public void setList_w_REMARKS_1(List list) { l_w_REMARKS_1 = list; }
	public void setList_w_REMARKS_2(List list) { l_w_REMARKS_2 = list; }
	public void setList_w_TAX_INCLUDE_AMOUNT(List list) { l_w_TAX_INCLUDE_AMOUNT = list; }
	public void setList_w_INVOICE_TAX_AMOUNT(List list) { l_w_INVOICE_TAX_AMOUNT = list; }
	public void setList_w_TAX_CREDIT_AMOUNT(List list) { l_w_TAX_CREDIT_AMOUNT = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_w_ODR_NO(List list) { l_w_ODR_NO = list; }
	public void setList_w_SHIP_QTY(List list) { l_w_SHIP_QTY = list; }
	public void setList_w_UNIT_PRICE(List list) { l_w_UNIT_PRICE = list; }
	public void setList_w_SHIP_ODR_AMOUNT(List list) { l_w_SHIP_ODR_AMOUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_w_SHIP_INVOICE_DATE_FROM(List list) { l_w_SHIP_INVOICE_DATE_FROM = list; }
	public void setList_w_SHIP_INVOICE_DATE_TO(List list) { l_w_SHIP_INVOICE_DATE_TO = list; }
	public void setList_w_SCDL_SHIP_DATE_FROM(List list) { l_w_SCDL_SHIP_DATE_FROM = list; }
	public void setList_w_SCDL_SHIP_DATE_TO(List list) { l_w_SCDL_SHIP_DATE_TO = list; }
	public void setList_w_PRINT_FLG(List list) { l_w_PRINT_FLG = list; }
	public void setList_w_SHIP_INVOICE_CTL_NO(List list) { l_w_SHIP_INVOICE_CTL_NO = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_PRINT_FLG(List list) { l_PRINT_FLG = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }

	public int setL2L_COPY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COPY == null) {
			l_COPY = new ArrayList();
		} else {
			l_COPY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COPY.add(((KU0100010Struct) list.get(i)).getCOPY());
		}
		return size;
	}
	public int setL2L_RE_OUT_PUT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RE_OUT_PUT == null) {
			l_RE_OUT_PUT = new ArrayList();
		} else {
			l_RE_OUT_PUT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RE_OUT_PUT.add(((KU0100010Struct) list.get(i)).getRE_OUT_PUT());
		}
		return size;
	}
	public int setL2L_SHIP_INVOICE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_INVOICE_DATE_FROM == null) {
			l_SHIP_INVOICE_DATE_FROM = new ArrayList();
		} else {
			l_SHIP_INVOICE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_INVOICE_DATE_FROM.add(((KU0100010Struct) list.get(i)).getSHIP_INVOICE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_SHIP_INVOICE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_INVOICE_DATE_TO == null) {
			l_SHIP_INVOICE_DATE_TO = new ArrayList();
		} else {
			l_SHIP_INVOICE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_INVOICE_DATE_TO.add(((KU0100010Struct) list.get(i)).getSHIP_INVOICE_DATE_TO());
		}
		return size;
	}
	public int setL2L_SCDL_SHIP_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_SHIP_DATE_FROM == null) {
			l_SCDL_SHIP_DATE_FROM = new ArrayList();
		} else {
			l_SCDL_SHIP_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_SHIP_DATE_FROM.add(((KU0100010Struct) list.get(i)).getSCDL_SHIP_DATE_FROM());
		}
		return size;
	}
	public int setL2L_SCDL_SHIP_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_SHIP_DATE_TO == null) {
			l_SCDL_SHIP_DATE_TO = new ArrayList();
		} else {
			l_SCDL_SHIP_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_SHIP_DATE_TO.add(((KU0100010Struct) list.get(i)).getSCDL_SHIP_DATE_TO());
		}
		return size;
	}
	public int setL2L_r_MasterPrint(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_MasterPrint == null) {
			l_r_MasterPrint = new ArrayList();
		} else {
			l_r_MasterPrint.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_MasterPrint.add(((KU0100010Struct) list.get(i)).getr_MasterPrint());
		}
		return size;
	}
	public int setL2L_r_CopyPrint(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_CopyPrint == null) {
			l_r_CopyPrint = new ArrayList();
		} else {
			l_r_CopyPrint.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_CopyPrint.add(((KU0100010Struct) list.get(i)).getr_CopyPrint());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((KU0100010Struct) list.get(i)).getCOUNT());
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
			l_DOWNLOAD_FILE.add(((KU0100010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_c_RE_OUT_PUT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_RE_OUT_PUT == null) {
			l_c_RE_OUT_PUT = new ArrayList();
		} else {
			l_c_RE_OUT_PUT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_RE_OUT_PUT.add(((KU0100010Struct) list.get(i)).getc_RE_OUT_PUT());
		}
		return size;
	}
	public int setL2L_SHIP_PLAN_DATE_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLAN_DATE_TIME_FROM == null) {
			l_SHIP_PLAN_DATE_TIME_FROM = new ArrayList();
		} else {
			l_SHIP_PLAN_DATE_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLAN_DATE_TIME_FROM.add(((KU0100010Struct) list.get(i)).getSHIP_PLAN_DATE_TIME_FROM());
		}
		return size;
	}
	public int setL2L_SHIP_PLAN_DATE_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLAN_DATE_TIME_TO == null) {
			l_SHIP_PLAN_DATE_TIME_TO = new ArrayList();
		} else {
			l_SHIP_PLAN_DATE_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLAN_DATE_TIME_TO.add(((KU0100010Struct) list.get(i)).getSHIP_PLAN_DATE_TIME_TO());
		}
		return size;
	}
	public int setL2L_SHIP_INVOICE_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_INVOICE_CTL_NO == null) {
			l_SHIP_INVOICE_CTL_NO = new ArrayList();
		} else {
			l_SHIP_INVOICE_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_INVOICE_CTL_NO.add(((KU0100010Struct) list.get(i)).getSHIP_INVOICE_CTL_NO());
		}
		return size;
	}
	public int setL2L_w_SHIP_INVOICE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_INVOICE_NO == null) {
			l_w_SHIP_INVOICE_NO = new ArrayList();
		} else {
			l_w_SHIP_INVOICE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_INVOICE_NO.add(((KU0100010Struct) list.get(i)).getw_SHIP_INVOICE_NO());
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
			l_w_CUST_CD.add(((KU0100010Struct) list.get(i)).getw_CUST_CD());
		}
		return size;
	}
	public int setL2L_w_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CUST_NAME == null) {
			l_w_CUST_NAME = new ArrayList();
		} else {
			l_w_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CUST_NAME.add(((KU0100010Struct) list.get(i)).getw_CUST_NAME());
		}
		return size;
	}
	public int setL2L_w_SHIP_PLAN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_PLAN_DATE == null) {
			l_w_SHIP_PLAN_DATE = new ArrayList();
		} else {
			l_w_SHIP_PLAN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_PLAN_DATE.add(((KU0100010Struct) list.get(i)).getw_SHIP_PLAN_DATE());
		}
		return size;
	}
	public int setL2L_w_SHIP_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_NO == null) {
			l_w_SHIP_NO = new ArrayList();
		} else {
			l_w_SHIP_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_NO.add(((KU0100010Struct) list.get(i)).getw_SHIP_NO());
		}
		return size;
	}
	public int setL2L_w_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DLV_LOC_CD == null) {
			l_w_DLV_LOC_CD = new ArrayList();
		} else {
			l_w_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DLV_LOC_CD.add(((KU0100010Struct) list.get(i)).getw_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_w_DEPARTURE_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DEPARTURE_PLACE == null) {
			l_w_DEPARTURE_PLACE = new ArrayList();
		} else {
			l_w_DEPARTURE_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DEPARTURE_PLACE.add(((KU0100010Struct) list.get(i)).getw_DEPARTURE_PLACE());
		}
		return size;
	}
	public int setL2L_w_DEPARTURE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DEPARTURE_DATE == null) {
			l_w_DEPARTURE_DATE = new ArrayList();
		} else {
			l_w_DEPARTURE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DEPARTURE_DATE.add(((KU0100010Struct) list.get(i)).getw_DEPARTURE_DATE());
		}
		return size;
	}
	public int setL2L_w_ARRIVAL_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ARRIVAL_PLACE == null) {
			l_w_ARRIVAL_PLACE = new ArrayList();
		} else {
			l_w_ARRIVAL_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ARRIVAL_PLACE.add(((KU0100010Struct) list.get(i)).getw_ARRIVAL_PLACE());
		}
		return size;
	}
	public int setL2L_w_ARRIVAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ARRIVAL_DATE == null) {
			l_w_ARRIVAL_DATE = new ArrayList();
		} else {
			l_w_ARRIVAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ARRIVAL_DATE.add(((KU0100010Struct) list.get(i)).getw_ARRIVAL_DATE());
		}
		return size;
	}
	public int setL2L_w_REMARKS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_REMARKS_1 == null) {
			l_w_REMARKS_1 = new ArrayList();
		} else {
			l_w_REMARKS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_REMARKS_1.add(((KU0100010Struct) list.get(i)).getw_REMARKS_1());
		}
		return size;
	}
	public int setL2L_w_REMARKS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_REMARKS_2 == null) {
			l_w_REMARKS_2 = new ArrayList();
		} else {
			l_w_REMARKS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_REMARKS_2.add(((KU0100010Struct) list.get(i)).getw_REMARKS_2());
		}
		return size;
	}
	public int setL2L_w_TAX_INCLUDE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_INCLUDE_AMOUNT == null) {
			l_w_TAX_INCLUDE_AMOUNT = new ArrayList();
		} else {
			l_w_TAX_INCLUDE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_INCLUDE_AMOUNT.add(((KU0100010Struct) list.get(i)).getw_TAX_INCLUDE_AMOUNT());
		}
		return size;
	}
	public int setL2L_w_INVOICE_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INVOICE_TAX_AMOUNT == null) {
			l_w_INVOICE_TAX_AMOUNT = new ArrayList();
		} else {
			l_w_INVOICE_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INVOICE_TAX_AMOUNT.add(((KU0100010Struct) list.get(i)).getw_INVOICE_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_w_TAX_CREDIT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_CREDIT_AMOUNT == null) {
			l_w_TAX_CREDIT_AMOUNT = new ArrayList();
		} else {
			l_w_TAX_CREDIT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_CREDIT_AMOUNT.add(((KU0100010Struct) list.get(i)).getw_TAX_CREDIT_AMOUNT());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((KU0100010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_NAME == null) {
			l_w_ITEM_NAME = new ArrayList();
		} else {
			l_w_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_NAME.add(((KU0100010Struct) list.get(i)).getw_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_NO == null) {
			l_w_ODR_NO = new ArrayList();
		} else {
			l_w_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_NO.add(((KU0100010Struct) list.get(i)).getw_ODR_NO());
		}
		return size;
	}
	public int setL2L_w_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_QTY == null) {
			l_w_SHIP_QTY = new ArrayList();
		} else {
			l_w_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_QTY.add(((KU0100010Struct) list.get(i)).getw_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_w_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_PRICE == null) {
			l_w_UNIT_PRICE = new ArrayList();
		} else {
			l_w_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_PRICE.add(((KU0100010Struct) list.get(i)).getw_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_w_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_ODR_AMOUNT == null) {
			l_w_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_w_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_ODR_AMOUNT.add(((KU0100010Struct) list.get(i)).getw_SHIP_ODR_AMOUNT());
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
			l_COMPANY_CD.add(((KU0100010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUST_CD.add(((KU0100010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_CD == null) {
			l_DLV_LOC_CD = new ArrayList();
		} else {
			l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_CD.add(((KU0100010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_w_SHIP_INVOICE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_INVOICE_DATE_FROM == null) {
			l_w_SHIP_INVOICE_DATE_FROM = new ArrayList();
		} else {
			l_w_SHIP_INVOICE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_INVOICE_DATE_FROM.add(((KU0100010Struct) list.get(i)).getw_SHIP_INVOICE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_SHIP_INVOICE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_INVOICE_DATE_TO == null) {
			l_w_SHIP_INVOICE_DATE_TO = new ArrayList();
		} else {
			l_w_SHIP_INVOICE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_INVOICE_DATE_TO.add(((KU0100010Struct) list.get(i)).getw_SHIP_INVOICE_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_SCDL_SHIP_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SCDL_SHIP_DATE_FROM == null) {
			l_w_SCDL_SHIP_DATE_FROM = new ArrayList();
		} else {
			l_w_SCDL_SHIP_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SCDL_SHIP_DATE_FROM.add(((KU0100010Struct) list.get(i)).getw_SCDL_SHIP_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_SCDL_SHIP_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SCDL_SHIP_DATE_TO == null) {
			l_w_SCDL_SHIP_DATE_TO = new ArrayList();
		} else {
			l_w_SCDL_SHIP_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SCDL_SHIP_DATE_TO.add(((KU0100010Struct) list.get(i)).getw_SCDL_SHIP_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PRINT_FLG == null) {
			l_w_PRINT_FLG = new ArrayList();
		} else {
			l_w_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PRINT_FLG.add(((KU0100010Struct) list.get(i)).getw_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_w_SHIP_INVOICE_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_INVOICE_CTL_NO == null) {
			l_w_SHIP_INVOICE_CTL_NO = new ArrayList();
		} else {
			l_w_SHIP_INVOICE_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_INVOICE_CTL_NO.add(((KU0100010Struct) list.get(i)).getw_SHIP_INVOICE_CTL_NO());
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
			l_ROW_COUNT.add(((KU0100010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_FLG == null) {
			l_PRINT_FLG = new ArrayList();
		} else {
			l_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_FLG.add(((KU0100010Struct) list.get(i)).getPRINT_FLG());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((KU0100010Struct) list.get(i)).getVALUE());
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
			l_NAME.add(((KU0100010Struct) list.get(i)).getNAME());
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
			l_OPTION_ID.add(((KU0100010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_COPY = null;
		m_RE_OUT_PUT = null;
		m_SHIP_INVOICE_DATE_FROM = null;
		m_SHIP_INVOICE_DATE_TO = null;
		m_SCDL_SHIP_DATE_FROM = null;
		m_SCDL_SHIP_DATE_TO = null;
		m_r_MasterPrint = null;
		m_r_CopyPrint = null;
		m_COUNT = null;
		m_DOWNLOAD_FILE = null;
		m_c_RE_OUT_PUT = null;
		m_SHIP_PLAN_DATE_TIME_FROM = null;
		m_SHIP_PLAN_DATE_TIME_TO = null;
		m_SHIP_INVOICE_CTL_NO = null;
		m_w_SHIP_INVOICE_NO = null;
		m_w_CUST_CD = null;
		m_w_CUST_NAME = null;
		m_w_SHIP_PLAN_DATE = null;
		m_w_SHIP_NO = null;
		m_w_DLV_LOC_CD = null;
		m_w_DEPARTURE_PLACE = null;
		m_w_DEPARTURE_DATE = null;
		m_w_ARRIVAL_PLACE = null;
		m_w_ARRIVAL_DATE = null;
		m_w_REMARKS_1 = null;
		m_w_REMARKS_2 = null;
		m_w_TAX_INCLUDE_AMOUNT = null;
		m_w_INVOICE_TAX_AMOUNT = null;
		m_w_TAX_CREDIT_AMOUNT = null;
		m_w_ITEM_CD = null;
		m_w_ITEM_NAME = null;
		m_w_ODR_NO = null;
		m_w_SHIP_QTY = null;
		m_w_UNIT_PRICE = null;
		m_w_SHIP_ODR_AMOUNT = null;
		m_COMPANY_CD = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_w_SHIP_INVOICE_DATE_FROM = null;
		m_w_SHIP_INVOICE_DATE_TO = null;
		m_w_SCDL_SHIP_DATE_FROM = null;
		m_w_SCDL_SHIP_DATE_TO = null;
		m_w_PRINT_FLG = null;
		m_w_SHIP_INVOICE_CTL_NO = null;
		m_ROW_COUNT = null;
		m_PRINT_FLG = null;
		m_VALUE = null;
		m_NAME = null;
		m_OPTION_ID = null;

		l_COPY = null;
		l_RE_OUT_PUT = null;
		l_SHIP_INVOICE_DATE_FROM = null;
		l_SHIP_INVOICE_DATE_TO = null;
		l_SCDL_SHIP_DATE_FROM = null;
		l_SCDL_SHIP_DATE_TO = null;
		l_r_MasterPrint = null;
		l_r_CopyPrint = null;
		l_COUNT = null;
		l_DOWNLOAD_FILE = null;
		l_c_RE_OUT_PUT = null;
		l_SHIP_PLAN_DATE_TIME_FROM = null;
		l_SHIP_PLAN_DATE_TIME_TO = null;
		l_SHIP_INVOICE_CTL_NO = null;
		l_w_SHIP_INVOICE_NO = null;
		l_w_CUST_CD = null;
		l_w_CUST_NAME = null;
		l_w_SHIP_PLAN_DATE = null;
		l_w_SHIP_NO = null;
		l_w_DLV_LOC_CD = null;
		l_w_DEPARTURE_PLACE = null;
		l_w_DEPARTURE_DATE = null;
		l_w_ARRIVAL_PLACE = null;
		l_w_ARRIVAL_DATE = null;
		l_w_REMARKS_1 = null;
		l_w_REMARKS_2 = null;
		l_w_TAX_INCLUDE_AMOUNT = null;
		l_w_INVOICE_TAX_AMOUNT = null;
		l_w_TAX_CREDIT_AMOUNT = null;
		l_w_ITEM_CD = null;
		l_w_ITEM_NAME = null;
		l_w_ODR_NO = null;
		l_w_SHIP_QTY = null;
		l_w_UNIT_PRICE = null;
		l_w_SHIP_ODR_AMOUNT = null;
		l_COMPANY_CD = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_w_SHIP_INVOICE_DATE_FROM = null;
		l_w_SHIP_INVOICE_DATE_TO = null;
		l_w_SCDL_SHIP_DATE_FROM = null;
		l_w_SCDL_SHIP_DATE_TO = null;
		l_w_PRINT_FLG = null;
		l_w_SHIP_INVOICE_CTL_NO = null;
		l_ROW_COUNT = null;
		l_PRINT_FLG = null;
		l_VALUE = null;
		l_NAME = null;
		l_OPTION_ID = null;

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
	 * medKU0100010�N���X�̕W���R���X�g���N�^
	 */
	public KU0100010Struct()
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
	public void setStruct(KU0100010Struct struct)
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
	public void setStructM(KU0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCOPY(struct.getCOPY());
			this.setRE_OUT_PUT(struct.getRE_OUT_PUT());
			this.setSHIP_INVOICE_DATE_FROM(struct.getSHIP_INVOICE_DATE_FROM());
			this.setSHIP_INVOICE_DATE_TO(struct.getSHIP_INVOICE_DATE_TO());
			this.setSCDL_SHIP_DATE_FROM(struct.getSCDL_SHIP_DATE_FROM());
			this.setSCDL_SHIP_DATE_TO(struct.getSCDL_SHIP_DATE_TO());
			this.setr_MasterPrint(struct.getr_MasterPrint());
			this.setr_CopyPrint(struct.getr_CopyPrint());
			this.setCOUNT(struct.getCOUNT());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setc_RE_OUT_PUT(struct.getc_RE_OUT_PUT());
			this.setSHIP_PLAN_DATE_TIME_FROM(struct.getSHIP_PLAN_DATE_TIME_FROM());
			this.setSHIP_PLAN_DATE_TIME_TO(struct.getSHIP_PLAN_DATE_TIME_TO());
			this.setSHIP_INVOICE_CTL_NO(struct.getSHIP_INVOICE_CTL_NO());
			this.setw_SHIP_INVOICE_NO(struct.getw_SHIP_INVOICE_NO());
			this.setw_CUST_CD(struct.getw_CUST_CD());
			this.setw_CUST_NAME(struct.getw_CUST_NAME());
			this.setw_SHIP_PLAN_DATE(struct.getw_SHIP_PLAN_DATE());
			this.setw_SHIP_NO(struct.getw_SHIP_NO());
			this.setw_DLV_LOC_CD(struct.getw_DLV_LOC_CD());
			this.setw_DEPARTURE_PLACE(struct.getw_DEPARTURE_PLACE());
			this.setw_DEPARTURE_DATE(struct.getw_DEPARTURE_DATE());
			this.setw_ARRIVAL_PLACE(struct.getw_ARRIVAL_PLACE());
			this.setw_ARRIVAL_DATE(struct.getw_ARRIVAL_DATE());
			this.setw_REMARKS_1(struct.getw_REMARKS_1());
			this.setw_REMARKS_2(struct.getw_REMARKS_2());
			this.setw_TAX_INCLUDE_AMOUNT(struct.getw_TAX_INCLUDE_AMOUNT());
			this.setw_INVOICE_TAX_AMOUNT(struct.getw_INVOICE_TAX_AMOUNT());
			this.setw_TAX_CREDIT_AMOUNT(struct.getw_TAX_CREDIT_AMOUNT());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setw_ODR_NO(struct.getw_ODR_NO());
			this.setw_SHIP_QTY(struct.getw_SHIP_QTY());
			this.setw_UNIT_PRICE(struct.getw_UNIT_PRICE());
			this.setw_SHIP_ODR_AMOUNT(struct.getw_SHIP_ODR_AMOUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setw_SHIP_INVOICE_DATE_FROM(struct.getw_SHIP_INVOICE_DATE_FROM());
			this.setw_SHIP_INVOICE_DATE_TO(struct.getw_SHIP_INVOICE_DATE_TO());
			this.setw_SCDL_SHIP_DATE_FROM(struct.getw_SCDL_SHIP_DATE_FROM());
			this.setw_SCDL_SHIP_DATE_TO(struct.getw_SCDL_SHIP_DATE_TO());
			this.setw_PRINT_FLG(struct.getw_PRINT_FLG());
			this.setw_SHIP_INVOICE_CTL_NO(struct.getw_SHIP_INVOICE_CTL_NO());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setPRINT_FLG(struct.getPRINT_FLG());
			this.setVALUE(struct.getVALUE());
			this.setNAME(struct.getNAME());
			this.setOPTION_ID(struct.getOPTION_ID());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KU0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_COPY(struct.getList_COPY());
			this.setList_RE_OUT_PUT(struct.getList_RE_OUT_PUT());
			this.setList_SHIP_INVOICE_DATE_FROM(struct.getList_SHIP_INVOICE_DATE_FROM());
			this.setList_SHIP_INVOICE_DATE_TO(struct.getList_SHIP_INVOICE_DATE_TO());
			this.setList_SCDL_SHIP_DATE_FROM(struct.getList_SCDL_SHIP_DATE_FROM());
			this.setList_SCDL_SHIP_DATE_TO(struct.getList_SCDL_SHIP_DATE_TO());
			this.setList_r_MasterPrint(struct.getList_r_MasterPrint());
			this.setList_r_CopyPrint(struct.getList_r_CopyPrint());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_c_RE_OUT_PUT(struct.getList_c_RE_OUT_PUT());
			this.setList_SHIP_PLAN_DATE_TIME_FROM(struct.getList_SHIP_PLAN_DATE_TIME_FROM());
			this.setList_SHIP_PLAN_DATE_TIME_TO(struct.getList_SHIP_PLAN_DATE_TIME_TO());
			this.setList_SHIP_INVOICE_CTL_NO(struct.getList_SHIP_INVOICE_CTL_NO());
			this.setList_w_SHIP_INVOICE_NO(struct.getList_w_SHIP_INVOICE_NO());
			this.setList_w_CUST_CD(struct.getList_w_CUST_CD());
			this.setList_w_CUST_NAME(struct.getList_w_CUST_NAME());
			this.setList_w_SHIP_PLAN_DATE(struct.getList_w_SHIP_PLAN_DATE());
			this.setList_w_SHIP_NO(struct.getList_w_SHIP_NO());
			this.setList_w_DLV_LOC_CD(struct.getList_w_DLV_LOC_CD());
			this.setList_w_DEPARTURE_PLACE(struct.getList_w_DEPARTURE_PLACE());
			this.setList_w_DEPARTURE_DATE(struct.getList_w_DEPARTURE_DATE());
			this.setList_w_ARRIVAL_PLACE(struct.getList_w_ARRIVAL_PLACE());
			this.setList_w_ARRIVAL_DATE(struct.getList_w_ARRIVAL_DATE());
			this.setList_w_REMARKS_1(struct.getList_w_REMARKS_1());
			this.setList_w_REMARKS_2(struct.getList_w_REMARKS_2());
			this.setList_w_TAX_INCLUDE_AMOUNT(struct.getList_w_TAX_INCLUDE_AMOUNT());
			this.setList_w_INVOICE_TAX_AMOUNT(struct.getList_w_INVOICE_TAX_AMOUNT());
			this.setList_w_TAX_CREDIT_AMOUNT(struct.getList_w_TAX_CREDIT_AMOUNT());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_w_ODR_NO(struct.getList_w_ODR_NO());
			this.setList_w_SHIP_QTY(struct.getList_w_SHIP_QTY());
			this.setList_w_UNIT_PRICE(struct.getList_w_UNIT_PRICE());
			this.setList_w_SHIP_ODR_AMOUNT(struct.getList_w_SHIP_ODR_AMOUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_w_SHIP_INVOICE_DATE_FROM(struct.getList_w_SHIP_INVOICE_DATE_FROM());
			this.setList_w_SHIP_INVOICE_DATE_TO(struct.getList_w_SHIP_INVOICE_DATE_TO());
			this.setList_w_SCDL_SHIP_DATE_FROM(struct.getList_w_SCDL_SHIP_DATE_FROM());
			this.setList_w_SCDL_SHIP_DATE_TO(struct.getList_w_SCDL_SHIP_DATE_TO());
			this.setList_w_PRINT_FLG(struct.getList_w_PRINT_FLG());
			this.setList_w_SHIP_INVOICE_CTL_NO(struct.getList_w_SHIP_INVOICE_CTL_NO());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_PRINT_FLG(struct.getList_PRINT_FLG());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
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
	// �� 1 �ϐ������l�F i_COPY


	final static String i_COPY = null;

	// �� 2 �ϐ������l�F i_RE_OUT_PUT


	final static String i_RE_OUT_PUT = null;

	// �� 3 �ϐ������l�F i_SHIP_INVOICE_DATE_FROM


	final static String i_SHIP_INVOICE_DATE_FROM = null;

	// �� 4 �ϐ������l�F i_SHIP_INVOICE_DATE_TO


	final static String i_SHIP_INVOICE_DATE_TO = null;

	// �� 5 �ϐ������l�F i_SCDL_SHIP_DATE_FROM


	final static String i_SCDL_SHIP_DATE_FROM = null;

	// �� 6 �ϐ������l�F i_SCDL_SHIP_DATE_TO


	final static String i_SCDL_SHIP_DATE_TO = null;

	// �� 7 �ϐ������l�F i_r_MasterPrint


	final static String i_r_MasterPrint = null;

	// �� 8 �ϐ������l�F i_r_CopyPrint


	final static String i_r_CopyPrint = null;

	// �� 9 �ϐ������l�F i_COUNT


	final static String i_COUNT = null;

	// �� 10 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 11 �ϐ������l�F i_c_RE_OUT_PUT


	final static String i_c_RE_OUT_PUT = null;

	// �� 12 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_FROM


	final static String i_SHIP_PLAN_DATE_TIME_FROM = null;

	// �� 13 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_TO


	final static String i_SHIP_PLAN_DATE_TIME_TO = null;

	// �� 14 �ϐ������l�F i_SHIP_INVOICE_CTL_NO


	final static String i_SHIP_INVOICE_CTL_NO = null;

	// �� 15 �ϐ������l�F i_w_SHIP_INVOICE_NO


	final static String i_w_SHIP_INVOICE_NO = null;

	// �� 16 �ϐ������l�F i_w_CUST_CD


	final static String i_w_CUST_CD = null;

	// �� 17 �ϐ������l�F i_w_CUST_NAME


	final static String i_w_CUST_NAME = null;

	// �� 18 �ϐ������l�F i_w_SHIP_PLAN_DATE


	final static String i_w_SHIP_PLAN_DATE = null;

	// �� 19 �ϐ������l�F i_w_SHIP_NO


	final static String i_w_SHIP_NO = null;

	// �� 20 �ϐ������l�F i_w_DLV_LOC_CD


	final static String i_w_DLV_LOC_CD = null;

	// �� 21 �ϐ������l�F i_w_DEPARTURE_PLACE


	final static String i_w_DEPARTURE_PLACE = null;

	// �� 22 �ϐ������l�F i_w_DEPARTURE_DATE


	final static String i_w_DEPARTURE_DATE = null;

	// �� 23 �ϐ������l�F i_w_ARRIVAL_PLACE


	final static String i_w_ARRIVAL_PLACE = null;

	// �� 24 �ϐ������l�F i_w_ARRIVAL_DATE


	final static String i_w_ARRIVAL_DATE = null;

	// �� 25 �ϐ������l�F i_w_REMARKS_1


	final static String i_w_REMARKS_1 = null;

	// �� 26 �ϐ������l�F i_w_REMARKS_2


	final static String i_w_REMARKS_2 = null;

	// �� 27 �ϐ������l�F i_w_TAX_INCLUDE_AMOUNT


	final static String i_w_TAX_INCLUDE_AMOUNT = null;

	// �� 28 �ϐ������l�F i_w_INVOICE_TAX_AMOUNT


	final static String i_w_INVOICE_TAX_AMOUNT = null;

	// �� 29 �ϐ������l�F i_w_TAX_CREDIT_AMOUNT


	final static String i_w_TAX_CREDIT_AMOUNT = null;

	// �� 30 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// �� 32 �ϐ������l�F i_w_ODR_NO


	final static String i_w_ODR_NO = null;

	// �� 33 �ϐ������l�F i_w_SHIP_QTY


	final static String i_w_SHIP_QTY = null;

	// �� 34 �ϐ������l�F i_w_UNIT_PRICE


	final static String i_w_UNIT_PRICE = null;

	// �� 35 �ϐ������l�F i_w_SHIP_ODR_AMOUNT


	final static String i_w_SHIP_ODR_AMOUNT = null;

	// �� 36 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 37 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 38 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 39 �ϐ������l�F i_w_SHIP_INVOICE_DATE_FROM


	final static String i_w_SHIP_INVOICE_DATE_FROM = null;

	// �� 40 �ϐ������l�F i_w_SHIP_INVOICE_DATE_TO


	final static String i_w_SHIP_INVOICE_DATE_TO = null;

	// �� 41 �ϐ������l�F i_w_SCDL_SHIP_DATE_FROM


	final static String i_w_SCDL_SHIP_DATE_FROM = null;

	// �� 42 �ϐ������l�F i_w_SCDL_SHIP_DATE_TO


	final static String i_w_SCDL_SHIP_DATE_TO = null;

	// �� 43 �ϐ������l�F i_w_PRINT_FLG


	final static String i_w_PRINT_FLG = null;

	// �� 44 �ϐ������l�F i_w_SHIP_INVOICE_CTL_NO


	final static String i_w_SHIP_INVOICE_CTL_NO = null;

	// �� 45 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 46 �ϐ������l�F i_PRINT_FLG


	final static String i_PRINT_FLG = null;

	// �� 47 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 48 �ϐ������l�F i_NAME


	final static String i_NAME = null;

	// �� 49 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_COPY

	final static String i_COPY = null;

	// �� 2 �ϐ������l�F i_RE_OUT_PUT

	final static String i_RE_OUT_PUT = null;

	// �� 3 �ϐ������l�F i_SHIP_INVOICE_DATE_FROM

	final static String i_SHIP_INVOICE_DATE_FROM = null;

	// �� 4 �ϐ������l�F i_SHIP_INVOICE_DATE_TO

	final static String i_SHIP_INVOICE_DATE_TO = null;

	// �� 5 �ϐ������l�F i_SCDL_SHIP_DATE_FROM

	final static String i_SCDL_SHIP_DATE_FROM = null;

	// �� 6 �ϐ������l�F i_SCDL_SHIP_DATE_TO

	final static String i_SCDL_SHIP_DATE_TO = null;

	// �� 7 �ϐ������l�F i_r_MasterPrint

	final static String i_r_MasterPrint = null;

	// �� 8 �ϐ������l�F i_r_CopyPrint

	final static String i_r_CopyPrint = null;

	// �� 9 �ϐ������l�F i_COUNT

	final static String i_COUNT = null;

	// �� 10 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 11 �ϐ������l�F i_c_RE_OUT_PUT

	final static String i_c_RE_OUT_PUT = null;

	// �� 12 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_FROM

	final static String i_SHIP_PLAN_DATE_TIME_FROM = null;

	// �� 13 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_TO

	final static String i_SHIP_PLAN_DATE_TIME_TO = null;

	// �� 14 �ϐ������l�F i_SHIP_INVOICE_CTL_NO

	final static String i_SHIP_INVOICE_CTL_NO = null;

	// �� 15 �ϐ������l�F i_w_SHIP_INVOICE_NO

	final static String i_w_SHIP_INVOICE_NO = null;

	// �� 16 �ϐ������l�F i_w_CUST_CD

	final static String i_w_CUST_CD = null;

	// �� 17 �ϐ������l�F i_w_CUST_NAME

	final static String i_w_CUST_NAME = null;

	// �� 18 �ϐ������l�F i_w_SHIP_PLAN_DATE

	final static String i_w_SHIP_PLAN_DATE = null;

	// �� 19 �ϐ������l�F i_w_SHIP_NO

	final static String i_w_SHIP_NO = null;

	// �� 20 �ϐ������l�F i_w_DLV_LOC_CD

	final static String i_w_DLV_LOC_CD = null;

	// �� 21 �ϐ������l�F i_w_DEPARTURE_PLACE

	final static String i_w_DEPARTURE_PLACE = null;

	// �� 22 �ϐ������l�F i_w_DEPARTURE_DATE

	final static String i_w_DEPARTURE_DATE = null;

	// �� 23 �ϐ������l�F i_w_ARRIVAL_PLACE

	final static String i_w_ARRIVAL_PLACE = null;

	// �� 24 �ϐ������l�F i_w_ARRIVAL_DATE

	final static String i_w_ARRIVAL_DATE = null;

	// �� 25 �ϐ������l�F i_w_REMARKS_1

	final static String i_w_REMARKS_1 = null;

	// �� 26 �ϐ������l�F i_w_REMARKS_2

	final static String i_w_REMARKS_2 = null;

	// �� 27 �ϐ������l�F i_w_TAX_INCLUDE_AMOUNT

	final static String i_w_TAX_INCLUDE_AMOUNT = null;

	// �� 28 �ϐ������l�F i_w_INVOICE_TAX_AMOUNT

	final static String i_w_INVOICE_TAX_AMOUNT = null;

	// �� 29 �ϐ������l�F i_w_TAX_CREDIT_AMOUNT

	final static String i_w_TAX_CREDIT_AMOUNT = null;

	// �� 30 �ϐ������l�F i_w_ITEM_CD

	final static String i_w_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_w_ITEM_NAME

	final static String i_w_ITEM_NAME = null;

	// �� 32 �ϐ������l�F i_w_ODR_NO

	final static String i_w_ODR_NO = null;

	// �� 33 �ϐ������l�F i_w_SHIP_QTY

	final static String i_w_SHIP_QTY = null;

	// �� 34 �ϐ������l�F i_w_UNIT_PRICE

	final static String i_w_UNIT_PRICE = null;

	// �� 35 �ϐ������l�F i_w_SHIP_ODR_AMOUNT

	final static String i_w_SHIP_ODR_AMOUNT = null;

	// �� 36 �ϐ������l�F i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// �� 37 �ϐ������l�F i_CUST_CD

	final static String i_CUST_CD = null;

	// �� 38 �ϐ������l�F i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// �� 39 �ϐ������l�F i_w_SHIP_INVOICE_DATE_FROM

	final static String i_w_SHIP_INVOICE_DATE_FROM = null;

	// �� 40 �ϐ������l�F i_w_SHIP_INVOICE_DATE_TO

	final static String i_w_SHIP_INVOICE_DATE_TO = null;

	// �� 41 �ϐ������l�F i_w_SCDL_SHIP_DATE_FROM

	final static String i_w_SCDL_SHIP_DATE_FROM = null;

	// �� 42 �ϐ������l�F i_w_SCDL_SHIP_DATE_TO

	final static String i_w_SCDL_SHIP_DATE_TO = null;

	// �� 43 �ϐ������l�F i_w_PRINT_FLG

	final static String i_w_PRINT_FLG = null;

	// �� 44 �ϐ������l�F i_w_SHIP_INVOICE_CTL_NO

	final static String i_w_SHIP_INVOICE_CTL_NO = null;

	// �� 45 �ϐ������l�F i_ROW_COUNT

	final static String i_ROW_COUNT = null;

	// �� 46 �ϐ������l�F i_PRINT_FLG

	final static String i_PRINT_FLG = null;

	// �� 47 �ϐ������l�F i_VALUE

	final static String i_VALUE = null;

	// �� 48 �ϐ������l�F i_NAME

	final static String i_NAME = null;

	// �� 49 �ϐ������l�F i_OPTION_ID

	final static String i_OPTION_ID = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_COPY = i_COPY;
		m_RE_OUT_PUT = i_RE_OUT_PUT;
		m_SHIP_INVOICE_DATE_FROM = i_SHIP_INVOICE_DATE_FROM;
		m_SHIP_INVOICE_DATE_TO = i_SHIP_INVOICE_DATE_TO;
		m_SCDL_SHIP_DATE_FROM = i_SCDL_SHIP_DATE_FROM;
		m_SCDL_SHIP_DATE_TO = i_SCDL_SHIP_DATE_TO;
		m_r_MasterPrint = i_r_MasterPrint;
		m_r_CopyPrint = i_r_CopyPrint;
		m_COUNT = i_COUNT;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_c_RE_OUT_PUT = i_c_RE_OUT_PUT;
		m_SHIP_PLAN_DATE_TIME_FROM = i_SHIP_PLAN_DATE_TIME_FROM;
		m_SHIP_PLAN_DATE_TIME_TO = i_SHIP_PLAN_DATE_TIME_TO;
		m_SHIP_INVOICE_CTL_NO = i_SHIP_INVOICE_CTL_NO;
		m_w_SHIP_INVOICE_NO = i_w_SHIP_INVOICE_NO;
		m_w_CUST_CD = i_w_CUST_CD;
		m_w_CUST_NAME = i_w_CUST_NAME;
		m_w_SHIP_PLAN_DATE = i_w_SHIP_PLAN_DATE;
		m_w_SHIP_NO = i_w_SHIP_NO;
		m_w_DLV_LOC_CD = i_w_DLV_LOC_CD;
		m_w_DEPARTURE_PLACE = i_w_DEPARTURE_PLACE;
		m_w_DEPARTURE_DATE = i_w_DEPARTURE_DATE;
		m_w_ARRIVAL_PLACE = i_w_ARRIVAL_PLACE;
		m_w_ARRIVAL_DATE = i_w_ARRIVAL_DATE;
		m_w_REMARKS_1 = i_w_REMARKS_1;
		m_w_REMARKS_2 = i_w_REMARKS_2;
		m_w_TAX_INCLUDE_AMOUNT = i_w_TAX_INCLUDE_AMOUNT;
		m_w_INVOICE_TAX_AMOUNT = i_w_INVOICE_TAX_AMOUNT;
		m_w_TAX_CREDIT_AMOUNT = i_w_TAX_CREDIT_AMOUNT;
		m_w_ITEM_CD = i_w_ITEM_CD;
		m_w_ITEM_NAME = i_w_ITEM_NAME;
		m_w_ODR_NO = i_w_ODR_NO;
		m_w_SHIP_QTY = i_w_SHIP_QTY;
		m_w_UNIT_PRICE = i_w_UNIT_PRICE;
		m_w_SHIP_ODR_AMOUNT = i_w_SHIP_ODR_AMOUNT;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CUST_CD = i_CUST_CD;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_w_SHIP_INVOICE_DATE_FROM = i_w_SHIP_INVOICE_DATE_FROM;
		m_w_SHIP_INVOICE_DATE_TO = i_w_SHIP_INVOICE_DATE_TO;
		m_w_SCDL_SHIP_DATE_FROM = i_w_SCDL_SHIP_DATE_FROM;
		m_w_SCDL_SHIP_DATE_TO = i_w_SCDL_SHIP_DATE_TO;
		m_w_PRINT_FLG = i_w_PRINT_FLG;
		m_w_SHIP_INVOICE_CTL_NO = i_w_SHIP_INVOICE_CTL_NO;
		m_ROW_COUNT = i_ROW_COUNT;
		m_PRINT_FLG = i_PRINT_FLG;
		m_VALUE = i_VALUE;
		m_NAME = i_NAME;
		m_OPTION_ID = i_OPTION_ID;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
