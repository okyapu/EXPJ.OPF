/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0090/src/com/nec/jp/orteus/metamorBase/KU0090/KU0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0090;

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
 * CLASS     : KU0090010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.1 $ $Date: 2014/06/17 06:25:01 $
 *
 */
//}}user_implement_code_header

public class KU0090010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_OPed */
	public String m_OPed = null;
	/** �� 2 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 3 �ϐ��F m_SHIP_PLAN_DATE_TIME_FROM */
	public String m_SHIP_PLAN_DATE_TIME_FROM = null;
	/** �� 4 �ϐ��F m_SHIP_PLAN_DATE_TIME_TO */
	public String m_SHIP_PLAN_DATE_TIME_TO = null;
	/** �� 5 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 6 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 7 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 8 �ϐ��F m_INVOICE_CD */
	public String m_INVOICE_CD = null;
	/** �� 9 �ϐ��F m_SHIP_INVOICE_DATE_FROM */
	public String m_SHIP_INVOICE_DATE_FROM = null;
	/** �� 10 �ϐ��F m_SHIP_INVOICE_DATE_TO */
	public String m_SHIP_INVOICE_DATE_TO = null;
	/** �� 11 �ϐ��F m_SCDL_SHIP_DATE_FROM */
	public String m_SCDL_SHIP_DATE_FROM = null;
	/** �� 12 �ϐ��F m_SCDL_SHIP_DATE_TO */
	public String m_SCDL_SHIP_DATE_TO = null;
	/** �� 13 �ϐ��F m_w_PRINT_FLG */
	public String m_w_PRINT_FLG = null;
	/** �� 14 �ϐ��F m_l_SHIP_INVOICE_CTL_NO */
	public String m_l_SHIP_INVOICE_CTL_NO = null;
	/** �� 15 �ϐ��F m_l_INVOICE_CD_1 */
	public String m_l_INVOICE_CD_1 = null;
	/** �� 16 �ϐ��F m_l_SCDL_SHIP_DATE */
	public String m_l_SCDL_SHIP_DATE = null;
	/** �� 17 �ϐ��F m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** �� 18 �ϐ��F m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** �� 19 �ϐ��F m_l_DEPARTURE_PLACE */
	public String m_l_DEPARTURE_PLACE = null;
	/** �� 20 �ϐ��F m_l_DEPARTURE_DATE */
	public String m_l_DEPARTURE_DATE = null;
	/** �� 21 �ϐ��F m_l_ARRIVAL_PLACE */
	public String m_l_ARRIVAL_PLACE = null;
	/** �� 22 �ϐ��F m_l_ARRIVAL_DATE_1 */
	public String m_l_ARRIVAL_DATE_1 = null;
	/** �� 23 �ϐ��F m_l_TRANSPORT_METHOD */
	public String m_l_TRANSPORT_METHOD = null;
	/** �� 24 �ϐ��F m_l_SHIP_NO */
	public String m_l_SHIP_NO = null;
	/** �� 25 �ϐ��F m_l_INVOICE_AMOUNT */
	public String m_l_INVOICE_AMOUNT = null;
	/** �� 26 �ϐ��F m_l_INVOICE_TAX_AMOUNT */
	public String m_l_INVOICE_TAX_AMOUNT = null;
	/** �� 27 �ϐ��F m_l_REMARKS_1 */
	public String m_l_REMARKS_1 = null;
	/** �� 28 �ϐ��F m_l_REMARKS_2 */
	public String m_l_REMARKS_2 = null;
	/** �� 29 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_OPed */
	public List l_OPed = null;

	/** �� 2 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 3 List�ϐ��F l_SHIP_PLAN_DATE_TIME_FROM */
	public List l_SHIP_PLAN_DATE_TIME_FROM = null;

	/** �� 4 List�ϐ��F l_SHIP_PLAN_DATE_TIME_TO */
	public List l_SHIP_PLAN_DATE_TIME_TO = null;

	/** �� 5 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 6 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 7 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 8 List�ϐ��F l_INVOICE_CD */
	public List l_INVOICE_CD = null;

	/** �� 9 List�ϐ��F l_SHIP_INVOICE_DATE_FROM */
	public List l_SHIP_INVOICE_DATE_FROM = null;

	/** �� 10 List�ϐ��F l_SHIP_INVOICE_DATE_TO */
	public List l_SHIP_INVOICE_DATE_TO = null;

	/** �� 11 List�ϐ��F l_SCDL_SHIP_DATE_FROM */
	public List l_SCDL_SHIP_DATE_FROM = null;

	/** �� 12 List�ϐ��F l_SCDL_SHIP_DATE_TO */
	public List l_SCDL_SHIP_DATE_TO = null;

	/** �� 13 List�ϐ��F l_w_PRINT_FLG */
	public List l_w_PRINT_FLG = null;

	/** �� 14 List�ϐ��F l_l_SHIP_INVOICE_CTL_NO */
	public List l_l_SHIP_INVOICE_CTL_NO = null;

	/** �� 15 List�ϐ��F l_l_INVOICE_CD_1 */
	public List l_l_INVOICE_CD_1 = null;

	/** �� 16 List�ϐ��F l_l_SCDL_SHIP_DATE */
	public List l_l_SCDL_SHIP_DATE = null;

	/** �� 17 List�ϐ��F l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** �� 18 List�ϐ��F l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** �� 19 List�ϐ��F l_l_DEPARTURE_PLACE */
	public List l_l_DEPARTURE_PLACE = null;

	/** �� 20 List�ϐ��F l_l_DEPARTURE_DATE */
	public List l_l_DEPARTURE_DATE = null;

	/** �� 21 List�ϐ��F l_l_ARRIVAL_PLACE */
	public List l_l_ARRIVAL_PLACE = null;

	/** �� 22 List�ϐ��F l_l_ARRIVAL_DATE_1 */
	public List l_l_ARRIVAL_DATE_1 = null;

	/** �� 23 List�ϐ��F l_l_TRANSPORT_METHOD */
	public List l_l_TRANSPORT_METHOD = null;

	/** �� 24 List�ϐ��F l_l_SHIP_NO */
	public List l_l_SHIP_NO = null;

	/** �� 25 List�ϐ��F l_l_INVOICE_AMOUNT */
	public List l_l_INVOICE_AMOUNT = null;

	/** �� 26 List�ϐ��F l_l_INVOICE_TAX_AMOUNT */
	public List l_l_INVOICE_TAX_AMOUNT = null;

	/** �� 27 List�ϐ��F l_l_REMARKS_1 */
	public List l_l_REMARKS_1 = null;

	/** �� 28 List�ϐ��F l_l_REMARKS_2 */
	public List l_l_REMARKS_2 = null;

	/** �� 29 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getOPed() { return m_OPed; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getSHIP_PLAN_DATE_TIME_FROM() { return m_SHIP_PLAN_DATE_TIME_FROM; }
	public String getSHIP_PLAN_DATE_TIME_TO() { return m_SHIP_PLAN_DATE_TIME_TO; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getINVOICE_CD() { return m_INVOICE_CD; }
	public String getSHIP_INVOICE_DATE_FROM() { return m_SHIP_INVOICE_DATE_FROM; }
	public String getSHIP_INVOICE_DATE_TO() { return m_SHIP_INVOICE_DATE_TO; }
	public String getSCDL_SHIP_DATE_FROM() { return m_SCDL_SHIP_DATE_FROM; }
	public String getSCDL_SHIP_DATE_TO() { return m_SCDL_SHIP_DATE_TO; }
	public String getw_PRINT_FLG() { return m_w_PRINT_FLG; }
	public String getl_SHIP_INVOICE_CTL_NO() { return m_l_SHIP_INVOICE_CTL_NO; }
	public String getl_INVOICE_CD_1() { return m_l_INVOICE_CD_1; }
	public String getl_SCDL_SHIP_DATE() { return m_l_SCDL_SHIP_DATE; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_DEPARTURE_PLACE() { return m_l_DEPARTURE_PLACE; }
	public String getl_DEPARTURE_DATE() { return m_l_DEPARTURE_DATE; }
	public String getl_ARRIVAL_PLACE() { return m_l_ARRIVAL_PLACE; }
	public String getl_ARRIVAL_DATE_1() { return m_l_ARRIVAL_DATE_1; }
	public String getl_TRANSPORT_METHOD() { return m_l_TRANSPORT_METHOD; }
	public String getl_SHIP_NO() { return m_l_SHIP_NO; }
	public String getl_INVOICE_AMOUNT() { return m_l_INVOICE_AMOUNT; }
	public String getl_INVOICE_TAX_AMOUNT() { return m_l_INVOICE_TAX_AMOUNT; }
	public String getl_REMARKS_1() { return m_l_REMARKS_1; }
	public String getl_REMARKS_2() { return m_l_REMARKS_2; }
	public String getOPTION_ID() { return m_OPTION_ID; }

	public List getList_OPed() { return l_OPed; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_SHIP_PLAN_DATE_TIME_FROM() { return l_SHIP_PLAN_DATE_TIME_FROM; }
	public List getList_SHIP_PLAN_DATE_TIME_TO() { return l_SHIP_PLAN_DATE_TIME_TO; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_INVOICE_CD() { return l_INVOICE_CD; }
	public List getList_SHIP_INVOICE_DATE_FROM() { return l_SHIP_INVOICE_DATE_FROM; }
	public List getList_SHIP_INVOICE_DATE_TO() { return l_SHIP_INVOICE_DATE_TO; }
	public List getList_SCDL_SHIP_DATE_FROM() { return l_SCDL_SHIP_DATE_FROM; }
	public List getList_SCDL_SHIP_DATE_TO() { return l_SCDL_SHIP_DATE_TO; }
	public List getList_w_PRINT_FLG() { return l_w_PRINT_FLG; }
	public List getList_l_SHIP_INVOICE_CTL_NO() { return l_l_SHIP_INVOICE_CTL_NO; }
	public List getList_l_INVOICE_CD_1() { return l_l_INVOICE_CD_1; }
	public List getList_l_SCDL_SHIP_DATE() { return l_l_SCDL_SHIP_DATE; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_DEPARTURE_PLACE() { return l_l_DEPARTURE_PLACE; }
	public List getList_l_DEPARTURE_DATE() { return l_l_DEPARTURE_DATE; }
	public List getList_l_ARRIVAL_PLACE() { return l_l_ARRIVAL_PLACE; }
	public List getList_l_ARRIVAL_DATE_1() { return l_l_ARRIVAL_DATE_1; }
	public List getList_l_TRANSPORT_METHOD() { return l_l_TRANSPORT_METHOD; }
	public List getList_l_SHIP_NO() { return l_l_SHIP_NO; }
	public List getList_l_INVOICE_AMOUNT() { return l_l_INVOICE_AMOUNT; }
	public List getList_l_INVOICE_TAX_AMOUNT() { return l_l_INVOICE_TAX_AMOUNT; }
	public List getList_l_REMARKS_1() { return l_l_REMARKS_1; }
	public List getList_l_REMARKS_2() { return l_l_REMARKS_2; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }

	public void setOPed(String val) { m_OPed = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setSHIP_PLAN_DATE_TIME_FROM(String val) { m_SHIP_PLAN_DATE_TIME_FROM = val; }
	public void setSHIP_PLAN_DATE_TIME_TO(String val) { m_SHIP_PLAN_DATE_TIME_TO = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setINVOICE_CD(String val) { m_INVOICE_CD = val; }
	public void setSHIP_INVOICE_DATE_FROM(String val) { m_SHIP_INVOICE_DATE_FROM = val; }
	public void setSHIP_INVOICE_DATE_TO(String val) { m_SHIP_INVOICE_DATE_TO = val; }
	public void setSCDL_SHIP_DATE_FROM(String val) { m_SCDL_SHIP_DATE_FROM = val; }
	public void setSCDL_SHIP_DATE_TO(String val) { m_SCDL_SHIP_DATE_TO = val; }
	public void setw_PRINT_FLG(String val) { m_w_PRINT_FLG = val; }
	public void setl_SHIP_INVOICE_CTL_NO(String val) { m_l_SHIP_INVOICE_CTL_NO = val; }
	public void setl_INVOICE_CD_1(String val) { m_l_INVOICE_CD_1 = val; }
	public void setl_SCDL_SHIP_DATE(String val) { m_l_SCDL_SHIP_DATE = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_DEPARTURE_PLACE(String val) { m_l_DEPARTURE_PLACE = val; }
	public void setl_DEPARTURE_DATE(String val) { m_l_DEPARTURE_DATE = val; }
	public void setl_ARRIVAL_PLACE(String val) { m_l_ARRIVAL_PLACE = val; }
	public void setl_ARRIVAL_DATE_1(String val) { m_l_ARRIVAL_DATE_1 = val; }
	public void setl_TRANSPORT_METHOD(String val) { m_l_TRANSPORT_METHOD = val; }
	public void setl_SHIP_NO(String val) { m_l_SHIP_NO = val; }
	public void setl_INVOICE_AMOUNT(String val) { m_l_INVOICE_AMOUNT = val; }
	public void setl_INVOICE_TAX_AMOUNT(String val) { m_l_INVOICE_TAX_AMOUNT = val; }
	public void setl_REMARKS_1(String val) { m_l_REMARKS_1 = val; }
	public void setl_REMARKS_2(String val) { m_l_REMARKS_2 = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }


	public void setList_OPed(List list) { l_OPed = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_SHIP_PLAN_DATE_TIME_FROM(List list) { l_SHIP_PLAN_DATE_TIME_FROM = list; }
	public void setList_SHIP_PLAN_DATE_TIME_TO(List list) { l_SHIP_PLAN_DATE_TIME_TO = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_INVOICE_CD(List list) { l_INVOICE_CD = list; }
	public void setList_SHIP_INVOICE_DATE_FROM(List list) { l_SHIP_INVOICE_DATE_FROM = list; }
	public void setList_SHIP_INVOICE_DATE_TO(List list) { l_SHIP_INVOICE_DATE_TO = list; }
	public void setList_SCDL_SHIP_DATE_FROM(List list) { l_SCDL_SHIP_DATE_FROM = list; }
	public void setList_SCDL_SHIP_DATE_TO(List list) { l_SCDL_SHIP_DATE_TO = list; }
	public void setList_w_PRINT_FLG(List list) { l_w_PRINT_FLG = list; }
	public void setList_l_SHIP_INVOICE_CTL_NO(List list) { l_l_SHIP_INVOICE_CTL_NO = list; }
	public void setList_l_INVOICE_CD_1(List list) { l_l_INVOICE_CD_1 = list; }
	public void setList_l_SCDL_SHIP_DATE(List list) { l_l_SCDL_SHIP_DATE = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_DEPARTURE_PLACE(List list) { l_l_DEPARTURE_PLACE = list; }
	public void setList_l_DEPARTURE_DATE(List list) { l_l_DEPARTURE_DATE = list; }
	public void setList_l_ARRIVAL_PLACE(List list) { l_l_ARRIVAL_PLACE = list; }
	public void setList_l_ARRIVAL_DATE_1(List list) { l_l_ARRIVAL_DATE_1 = list; }
	public void setList_l_TRANSPORT_METHOD(List list) { l_l_TRANSPORT_METHOD = list; }
	public void setList_l_SHIP_NO(List list) { l_l_SHIP_NO = list; }
	public void setList_l_INVOICE_AMOUNT(List list) { l_l_INVOICE_AMOUNT = list; }
	public void setList_l_INVOICE_TAX_AMOUNT(List list) { l_l_INVOICE_TAX_AMOUNT = list; }
	public void setList_l_REMARKS_1(List list) { l_l_REMARKS_1 = list; }
	public void setList_l_REMARKS_2(List list) { l_l_REMARKS_2 = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }

	public int setL2L_OPed(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPed == null) {
			l_OPed = new ArrayList();
		} else {
			l_OPed.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPed.add(((KU0090010Struct) list.get(i)).getOPed());
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
			l_DOWNLOAD_FILE.add(((KU0090010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_SHIP_PLAN_DATE_TIME_FROM.add(((KU0090010Struct) list.get(i)).getSHIP_PLAN_DATE_TIME_FROM());
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
			l_SHIP_PLAN_DATE_TIME_TO.add(((KU0090010Struct) list.get(i)).getSHIP_PLAN_DATE_TIME_TO());
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
			l_ROW_COUNT.add(((KU0090010Struct) list.get(i)).getROW_COUNT());
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
			l_CUST_CD.add(((KU0090010Struct) list.get(i)).getCUST_CD());
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
			l_DLV_LOC_CD.add(((KU0090010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_INVOICE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INVOICE_CD == null) {
			l_INVOICE_CD = new ArrayList();
		} else {
			l_INVOICE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INVOICE_CD.add(((KU0090010Struct) list.get(i)).getINVOICE_CD());
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
			l_SHIP_INVOICE_DATE_FROM.add(((KU0090010Struct) list.get(i)).getSHIP_INVOICE_DATE_FROM());
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
			l_SHIP_INVOICE_DATE_TO.add(((KU0090010Struct) list.get(i)).getSHIP_INVOICE_DATE_TO());
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
			l_SCDL_SHIP_DATE_FROM.add(((KU0090010Struct) list.get(i)).getSCDL_SHIP_DATE_FROM());
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
			l_SCDL_SHIP_DATE_TO.add(((KU0090010Struct) list.get(i)).getSCDL_SHIP_DATE_TO());
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
			l_w_PRINT_FLG.add(((KU0090010Struct) list.get(i)).getw_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_l_SHIP_INVOICE_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_INVOICE_CTL_NO == null) {
			l_l_SHIP_INVOICE_CTL_NO = new ArrayList();
		} else {
			l_l_SHIP_INVOICE_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_INVOICE_CTL_NO.add(((KU0090010Struct) list.get(i)).getl_SHIP_INVOICE_CTL_NO());
		}
		return size;
	}
	public int setL2L_l_INVOICE_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INVOICE_CD_1 == null) {
			l_l_INVOICE_CD_1 = new ArrayList();
		} else {
			l_l_INVOICE_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INVOICE_CD_1.add(((KU0090010Struct) list.get(i)).getl_INVOICE_CD_1());
		}
		return size;
	}
	public int setL2L_l_SCDL_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SCDL_SHIP_DATE == null) {
			l_l_SCDL_SHIP_DATE = new ArrayList();
		} else {
			l_l_SCDL_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SCDL_SHIP_DATE.add(((KU0090010Struct) list.get(i)).getl_SCDL_SHIP_DATE());
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
			l_l_CUST_CD.add(((KU0090010Struct) list.get(i)).getl_CUST_CD());
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
			l_l_DLV_LOC_CD.add(((KU0090010Struct) list.get(i)).getl_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_l_DEPARTURE_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPARTURE_PLACE == null) {
			l_l_DEPARTURE_PLACE = new ArrayList();
		} else {
			l_l_DEPARTURE_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPARTURE_PLACE.add(((KU0090010Struct) list.get(i)).getl_DEPARTURE_PLACE());
		}
		return size;
	}
	public int setL2L_l_DEPARTURE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPARTURE_DATE == null) {
			l_l_DEPARTURE_DATE = new ArrayList();
		} else {
			l_l_DEPARTURE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPARTURE_DATE.add(((KU0090010Struct) list.get(i)).getl_DEPARTURE_DATE());
		}
		return size;
	}
	public int setL2L_l_ARRIVAL_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ARRIVAL_PLACE == null) {
			l_l_ARRIVAL_PLACE = new ArrayList();
		} else {
			l_l_ARRIVAL_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ARRIVAL_PLACE.add(((KU0090010Struct) list.get(i)).getl_ARRIVAL_PLACE());
		}
		return size;
	}
	public int setL2L_l_ARRIVAL_DATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ARRIVAL_DATE_1 == null) {
			l_l_ARRIVAL_DATE_1 = new ArrayList();
		} else {
			l_l_ARRIVAL_DATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ARRIVAL_DATE_1.add(((KU0090010Struct) list.get(i)).getl_ARRIVAL_DATE_1());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_METHOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_METHOD == null) {
			l_l_TRANSPORT_METHOD = new ArrayList();
		} else {
			l_l_TRANSPORT_METHOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_METHOD.add(((KU0090010Struct) list.get(i)).getl_TRANSPORT_METHOD());
		}
		return size;
	}
	public int setL2L_l_SHIP_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_NO == null) {
			l_l_SHIP_NO = new ArrayList();
		} else {
			l_l_SHIP_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_NO.add(((KU0090010Struct) list.get(i)).getl_SHIP_NO());
		}
		return size;
	}
	public int setL2L_l_INVOICE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INVOICE_AMOUNT == null) {
			l_l_INVOICE_AMOUNT = new ArrayList();
		} else {
			l_l_INVOICE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INVOICE_AMOUNT.add(((KU0090010Struct) list.get(i)).getl_INVOICE_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_INVOICE_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INVOICE_TAX_AMOUNT == null) {
			l_l_INVOICE_TAX_AMOUNT = new ArrayList();
		} else {
			l_l_INVOICE_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INVOICE_TAX_AMOUNT.add(((KU0090010Struct) list.get(i)).getl_INVOICE_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_REMARKS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMARKS_1 == null) {
			l_l_REMARKS_1 = new ArrayList();
		} else {
			l_l_REMARKS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMARKS_1.add(((KU0090010Struct) list.get(i)).getl_REMARKS_1());
		}
		return size;
	}
	public int setL2L_l_REMARKS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMARKS_2 == null) {
			l_l_REMARKS_2 = new ArrayList();
		} else {
			l_l_REMARKS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMARKS_2.add(((KU0090010Struct) list.get(i)).getl_REMARKS_2());
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
			l_OPTION_ID.add(((KU0090010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OPed = null;
		m_DOWNLOAD_FILE = null;
		m_SHIP_PLAN_DATE_TIME_FROM = null;
		m_SHIP_PLAN_DATE_TIME_TO = null;
		m_ROW_COUNT = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_INVOICE_CD = null;
		m_SHIP_INVOICE_DATE_FROM = null;
		m_SHIP_INVOICE_DATE_TO = null;
		m_SCDL_SHIP_DATE_FROM = null;
		m_SCDL_SHIP_DATE_TO = null;
		m_w_PRINT_FLG = null;
		m_l_SHIP_INVOICE_CTL_NO = null;
		m_l_INVOICE_CD_1 = null;
		m_l_SCDL_SHIP_DATE = null;
		m_l_CUST_CD = null;
		m_l_DLV_LOC_CD = null;
		m_l_DEPARTURE_PLACE = null;
		m_l_DEPARTURE_DATE = null;
		m_l_ARRIVAL_PLACE = null;
		m_l_ARRIVAL_DATE_1 = null;
		m_l_TRANSPORT_METHOD = null;
		m_l_SHIP_NO = null;
		m_l_INVOICE_AMOUNT = null;
		m_l_INVOICE_TAX_AMOUNT = null;
		m_l_REMARKS_1 = null;
		m_l_REMARKS_2 = null;
		m_OPTION_ID = null;

		l_OPed = null;
		l_DOWNLOAD_FILE = null;
		l_SHIP_PLAN_DATE_TIME_FROM = null;
		l_SHIP_PLAN_DATE_TIME_TO = null;
		l_ROW_COUNT = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_INVOICE_CD = null;
		l_SHIP_INVOICE_DATE_FROM = null;
		l_SHIP_INVOICE_DATE_TO = null;
		l_SCDL_SHIP_DATE_FROM = null;
		l_SCDL_SHIP_DATE_TO = null;
		l_w_PRINT_FLG = null;
		l_l_SHIP_INVOICE_CTL_NO = null;
		l_l_INVOICE_CD_1 = null;
		l_l_SCDL_SHIP_DATE = null;
		l_l_CUST_CD = null;
		l_l_DLV_LOC_CD = null;
		l_l_DEPARTURE_PLACE = null;
		l_l_DEPARTURE_DATE = null;
		l_l_ARRIVAL_PLACE = null;
		l_l_ARRIVAL_DATE_1 = null;
		l_l_TRANSPORT_METHOD = null;
		l_l_SHIP_NO = null;
		l_l_INVOICE_AMOUNT = null;
		l_l_INVOICE_TAX_AMOUNT = null;
		l_l_REMARKS_1 = null;
		l_l_REMARKS_2 = null;
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
	 * medKU0090010�N���X�̕W���R���X�g���N�^
	 */
	public KU0090010Struct()
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
	public void setStruct(KU0090010Struct struct)
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
	public void setStructM(KU0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOPed(struct.getOPed());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setSHIP_PLAN_DATE_TIME_FROM(struct.getSHIP_PLAN_DATE_TIME_FROM());
			this.setSHIP_PLAN_DATE_TIME_TO(struct.getSHIP_PLAN_DATE_TIME_TO());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setINVOICE_CD(struct.getINVOICE_CD());
			this.setSHIP_INVOICE_DATE_FROM(struct.getSHIP_INVOICE_DATE_FROM());
			this.setSHIP_INVOICE_DATE_TO(struct.getSHIP_INVOICE_DATE_TO());
			this.setSCDL_SHIP_DATE_FROM(struct.getSCDL_SHIP_DATE_FROM());
			this.setSCDL_SHIP_DATE_TO(struct.getSCDL_SHIP_DATE_TO());
			this.setw_PRINT_FLG(struct.getw_PRINT_FLG());
			this.setl_SHIP_INVOICE_CTL_NO(struct.getl_SHIP_INVOICE_CTL_NO());
			this.setl_INVOICE_CD_1(struct.getl_INVOICE_CD_1());
			this.setl_SCDL_SHIP_DATE(struct.getl_SCDL_SHIP_DATE());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_DEPARTURE_PLACE(struct.getl_DEPARTURE_PLACE());
			this.setl_DEPARTURE_DATE(struct.getl_DEPARTURE_DATE());
			this.setl_ARRIVAL_PLACE(struct.getl_ARRIVAL_PLACE());
			this.setl_ARRIVAL_DATE_1(struct.getl_ARRIVAL_DATE_1());
			this.setl_TRANSPORT_METHOD(struct.getl_TRANSPORT_METHOD());
			this.setl_SHIP_NO(struct.getl_SHIP_NO());
			this.setl_INVOICE_AMOUNT(struct.getl_INVOICE_AMOUNT());
			this.setl_INVOICE_TAX_AMOUNT(struct.getl_INVOICE_TAX_AMOUNT());
			this.setl_REMARKS_1(struct.getl_REMARKS_1());
			this.setl_REMARKS_2(struct.getl_REMARKS_2());
			this.setOPTION_ID(struct.getOPTION_ID());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KU0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OPed(struct.getList_OPed());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_SHIP_PLAN_DATE_TIME_FROM(struct.getList_SHIP_PLAN_DATE_TIME_FROM());
			this.setList_SHIP_PLAN_DATE_TIME_TO(struct.getList_SHIP_PLAN_DATE_TIME_TO());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_INVOICE_CD(struct.getList_INVOICE_CD());
			this.setList_SHIP_INVOICE_DATE_FROM(struct.getList_SHIP_INVOICE_DATE_FROM());
			this.setList_SHIP_INVOICE_DATE_TO(struct.getList_SHIP_INVOICE_DATE_TO());
			this.setList_SCDL_SHIP_DATE_FROM(struct.getList_SCDL_SHIP_DATE_FROM());
			this.setList_SCDL_SHIP_DATE_TO(struct.getList_SCDL_SHIP_DATE_TO());
			this.setList_w_PRINT_FLG(struct.getList_w_PRINT_FLG());
			this.setList_l_SHIP_INVOICE_CTL_NO(struct.getList_l_SHIP_INVOICE_CTL_NO());
			this.setList_l_INVOICE_CD_1(struct.getList_l_INVOICE_CD_1());
			this.setList_l_SCDL_SHIP_DATE(struct.getList_l_SCDL_SHIP_DATE());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_DEPARTURE_PLACE(struct.getList_l_DEPARTURE_PLACE());
			this.setList_l_DEPARTURE_DATE(struct.getList_l_DEPARTURE_DATE());
			this.setList_l_ARRIVAL_PLACE(struct.getList_l_ARRIVAL_PLACE());
			this.setList_l_ARRIVAL_DATE_1(struct.getList_l_ARRIVAL_DATE_1());
			this.setList_l_TRANSPORT_METHOD(struct.getList_l_TRANSPORT_METHOD());
			this.setList_l_SHIP_NO(struct.getList_l_SHIP_NO());
			this.setList_l_INVOICE_AMOUNT(struct.getList_l_INVOICE_AMOUNT());
			this.setList_l_INVOICE_TAX_AMOUNT(struct.getList_l_INVOICE_TAX_AMOUNT());
			this.setList_l_REMARKS_1(struct.getList_l_REMARKS_1());
			this.setList_l_REMARKS_2(struct.getList_l_REMARKS_2());
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
	// �� 1 �ϐ������l�F i_OPed


	final static String i_OPed = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_FROM


	final static String i_SHIP_PLAN_DATE_TIME_FROM = null;

	// �� 4 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_TO


	final static String i_SHIP_PLAN_DATE_TIME_TO = null;

	// �� 5 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 6 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 7 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 8 �ϐ������l�F i_INVOICE_CD


	final static String i_INVOICE_CD = null;

	// �� 9 �ϐ������l�F i_SHIP_INVOICE_DATE_FROM


	final static String i_SHIP_INVOICE_DATE_FROM = null;

	// �� 10 �ϐ������l�F i_SHIP_INVOICE_DATE_TO


	final static String i_SHIP_INVOICE_DATE_TO = null;

	// �� 11 �ϐ������l�F i_SCDL_SHIP_DATE_FROM


	final static String i_SCDL_SHIP_DATE_FROM = null;

	// �� 12 �ϐ������l�F i_SCDL_SHIP_DATE_TO


	final static String i_SCDL_SHIP_DATE_TO = null;

	// �� 13 �ϐ������l�F i_w_PRINT_FLG


	final static String i_w_PRINT_FLG = null;

	// �� 14 �ϐ������l�F i_l_SHIP_INVOICE_CTL_NO


	final static String i_l_SHIP_INVOICE_CTL_NO = null;

	// �� 15 �ϐ������l�F i_l_INVOICE_CD_1


	final static String i_l_INVOICE_CD_1 = null;

	// �� 16 �ϐ������l�F i_l_SCDL_SHIP_DATE


	final static String i_l_SCDL_SHIP_DATE = null;

	// �� 17 �ϐ������l�F i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// �� 18 �ϐ������l�F i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// �� 19 �ϐ������l�F i_l_DEPARTURE_PLACE


	final static String i_l_DEPARTURE_PLACE = null;

	// �� 20 �ϐ������l�F i_l_DEPARTURE_DATE


	final static String i_l_DEPARTURE_DATE = null;

	// �� 21 �ϐ������l�F i_l_ARRIVAL_PLACE


	final static String i_l_ARRIVAL_PLACE = null;

	// �� 22 �ϐ������l�F i_l_ARRIVAL_DATE_1


	final static String i_l_ARRIVAL_DATE_1 = null;

	// �� 23 �ϐ������l�F i_l_TRANSPORT_METHOD


	final static String i_l_TRANSPORT_METHOD = null;

	// �� 24 �ϐ������l�F i_l_SHIP_NO


	final static String i_l_SHIP_NO = null;

	// �� 25 �ϐ������l�F i_l_INVOICE_AMOUNT


	final static String i_l_INVOICE_AMOUNT = null;

	// �� 26 �ϐ������l�F i_l_INVOICE_TAX_AMOUNT


	final static String i_l_INVOICE_TAX_AMOUNT = null;

	// �� 27 �ϐ������l�F i_l_REMARKS_1


	final static String i_l_REMARKS_1 = null;

	// �� 28 �ϐ������l�F i_l_REMARKS_2


	final static String i_l_REMARKS_2 = null;

	// �� 29 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_OPed

	final static String i_OPed = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_FROM

	final static String i_SHIP_PLAN_DATE_TIME_FROM = null;

	// �� 4 �ϐ������l�F i_SHIP_PLAN_DATE_TIME_TO

	final static String i_SHIP_PLAN_DATE_TIME_TO = null;

	// �� 5 �ϐ������l�F i_ROW_COUNT

	final static String i_ROW_COUNT = null;

	// �� 6 �ϐ������l�F i_CUST_CD

	final static String i_CUST_CD = null;

	// �� 7 �ϐ������l�F i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// �� 8 �ϐ������l�F i_INVOICE_CD

	final static String i_INVOICE_CD = null;

	// �� 9 �ϐ������l�F i_SHIP_INVOICE_DATE_FROM

	final static String i_SHIP_INVOICE_DATE_FROM = null;

	// �� 10 �ϐ������l�F i_SHIP_INVOICE_DATE_TO

	final static String i_SHIP_INVOICE_DATE_TO = null;

	// �� 11 �ϐ������l�F i_SCDL_SHIP_DATE_FROM

	final static String i_SCDL_SHIP_DATE_FROM = null;

	// �� 12 �ϐ������l�F i_SCDL_SHIP_DATE_TO

	final static String i_SCDL_SHIP_DATE_TO = null;

	// �� 13 �ϐ������l�F i_w_PRINT_FLG

	final static String i_w_PRINT_FLG = null;

	// �� 14 �ϐ������l�F i_l_SHIP_INVOICE_CTL_NO

	final static String i_l_SHIP_INVOICE_CTL_NO = null;

	// �� 15 �ϐ������l�F i_l_INVOICE_CD_1

	final static String i_l_INVOICE_CD_1 = null;

	// �� 16 �ϐ������l�F i_l_SCDL_SHIP_DATE

	final static String i_l_SCDL_SHIP_DATE = null;

	// �� 17 �ϐ������l�F i_l_CUST_CD

	final static String i_l_CUST_CD = null;

	// �� 18 �ϐ������l�F i_l_DLV_LOC_CD

	final static String i_l_DLV_LOC_CD = null;

	// �� 19 �ϐ������l�F i_l_DEPARTURE_PLACE

	final static String i_l_DEPARTURE_PLACE = null;

	// �� 20 �ϐ������l�F i_l_DEPARTURE_DATE

	final static String i_l_DEPARTURE_DATE = null;

	// �� 21 �ϐ������l�F i_l_ARRIVAL_PLACE

	final static String i_l_ARRIVAL_PLACE = null;

	// �� 22 �ϐ������l�F i_l_ARRIVAL_DATE_1

	final static String i_l_ARRIVAL_DATE_1 = null;

	// �� 23 �ϐ������l�F i_l_TRANSPORT_METHOD

	final static String i_l_TRANSPORT_METHOD = null;

	// �� 24 �ϐ������l�F i_l_SHIP_NO

	final static String i_l_SHIP_NO = null;

	// �� 25 �ϐ������l�F i_l_INVOICE_AMOUNT

	final static String i_l_INVOICE_AMOUNT = null;

	// �� 26 �ϐ������l�F i_l_INVOICE_TAX_AMOUNT

	final static String i_l_INVOICE_TAX_AMOUNT = null;

	// �� 27 �ϐ������l�F i_l_REMARKS_1

	final static String i_l_REMARKS_1 = null;

	// �� 28 �ϐ������l�F i_l_REMARKS_2

	final static String i_l_REMARKS_2 = null;

	// �� 29 �ϐ������l�F i_OPTION_ID

	final static String i_OPTION_ID = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_OPed = i_OPed;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_SHIP_PLAN_DATE_TIME_FROM = i_SHIP_PLAN_DATE_TIME_FROM;
		m_SHIP_PLAN_DATE_TIME_TO = i_SHIP_PLAN_DATE_TIME_TO;
		m_ROW_COUNT = i_ROW_COUNT;
		m_CUST_CD = i_CUST_CD;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_INVOICE_CD = i_INVOICE_CD;
		m_SHIP_INVOICE_DATE_FROM = i_SHIP_INVOICE_DATE_FROM;
		m_SHIP_INVOICE_DATE_TO = i_SHIP_INVOICE_DATE_TO;
		m_SCDL_SHIP_DATE_FROM = i_SCDL_SHIP_DATE_FROM;
		m_SCDL_SHIP_DATE_TO = i_SCDL_SHIP_DATE_TO;
		m_w_PRINT_FLG = i_w_PRINT_FLG;
		m_l_SHIP_INVOICE_CTL_NO = i_l_SHIP_INVOICE_CTL_NO;
		m_l_INVOICE_CD_1 = i_l_INVOICE_CD_1;
		m_l_SCDL_SHIP_DATE = i_l_SCDL_SHIP_DATE;
		m_l_CUST_CD = i_l_CUST_CD;
		m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
		m_l_DEPARTURE_PLACE = i_l_DEPARTURE_PLACE;
		m_l_DEPARTURE_DATE = i_l_DEPARTURE_DATE;
		m_l_ARRIVAL_PLACE = i_l_ARRIVAL_PLACE;
		m_l_ARRIVAL_DATE_1 = i_l_ARRIVAL_DATE_1;
		m_l_TRANSPORT_METHOD = i_l_TRANSPORT_METHOD;
		m_l_SHIP_NO = i_l_SHIP_NO;
		m_l_INVOICE_AMOUNT = i_l_INVOICE_AMOUNT;
		m_l_INVOICE_TAX_AMOUNT = i_l_INVOICE_TAX_AMOUNT;
		m_l_REMARKS_1 = i_l_REMARKS_1;
		m_l_REMARKS_2 = i_l_REMARKS_2;
		m_OPTION_ID = i_OPTION_ID;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
