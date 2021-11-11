/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100020Struct.java,v $
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

public class KA0100020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_RESULT */
	public String m_h_RESULT = null;
	/** �� 2 �ϐ��F m_k_MODE */
	public String m_k_MODE = null;
	/** �� 3 �ϐ��F m_h_DLV_LOC_CD */
	public String m_h_DLV_LOC_CD = null;
	/** �� 4 �ϐ��F m_h_CUST_CD */
	public String m_h_CUST_CD = null;
	/** �� 5 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 6 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 7 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 8 �ϐ��F m_h_APR_CUST_DLV_LOC */
	public String m_h_APR_CUST_DLV_LOC = null;
	/** �� 9 �ϐ��F m_SYS_COMPANY_CD */
	public String m_SYS_COMPANY_CD = null;
	/** �� 10 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 11 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 12 �ϐ��F m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** �� 13 �ϐ��F m_DLV_LOC_KNAME */
	public String m_DLV_LOC_KNAME = null;
	/** �� 14 �ϐ��F m_DLV_LOC_ENAME */
	public String m_DLV_LOC_ENAME = null;
	/** �� 15 �ϐ��F m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** �� 16 �ϐ��F m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** �� 17 �ϐ��F m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** �� 18 �ϐ��F m_ADDRESS_K_1 */
	public String m_ADDRESS_K_1 = null;
	/** �� 19 �ϐ��F m_ADDRESS_K_2 */
	public String m_ADDRESS_K_2 = null;
	/** �� 20 �ϐ��F m_TEL */
	public String m_TEL = null;
	/** �� 21 �ϐ��F m_FAX */
	public String m_FAX = null;
	/** �� 22 �ϐ��F m_TRANSPORT_CD */
	public String m_TRANSPORT_CD = null;
	/** �� 23 �ϐ��F m_TRANSPORT_LT */
	public String m_TRANSPORT_LT = null;
	/** �� 24 �ϐ��F m_DEPO_WH_CD */
	public String m_DEPO_WH_CD = null;
	/** �� 25 �ϐ��F m_SHIP_WH_CD */
	public String m_SHIP_WH_CD = null;
	/** �� 26 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 27 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 28 �ϐ��F m_DEPO_WH_NAME */
	public String m_DEPO_WH_NAME = null;
	/** �� 29 �ϐ��F m_SHIP_WH_NAME */
	public String m_SHIP_WH_NAME = null;
	/** �� 30 �ϐ��F m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** �� 31 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_RESULT */
	public List l_h_RESULT = null;

	/** �� 2 List�ϐ��F l_k_MODE */
	public List l_k_MODE = null;

	/** �� 3 List�ϐ��F l_h_DLV_LOC_CD */
	public List l_h_DLV_LOC_CD = null;

	/** �� 4 List�ϐ��F l_h_CUST_CD */
	public List l_h_CUST_CD = null;

	/** �� 5 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 6 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 7 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 8 List�ϐ��F l_h_APR_CUST_DLV_LOC */
	public List l_h_APR_CUST_DLV_LOC = null;

	/** �� 9 List�ϐ��F l_SYS_COMPANY_CD */
	public List l_SYS_COMPANY_CD = null;

	/** �� 10 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 11 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 12 List�ϐ��F l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** �� 13 List�ϐ��F l_DLV_LOC_KNAME */
	public List l_DLV_LOC_KNAME = null;

	/** �� 14 List�ϐ��F l_DLV_LOC_ENAME */
	public List l_DLV_LOC_ENAME = null;

	/** �� 15 List�ϐ��F l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** �� 16 List�ϐ��F l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** �� 17 List�ϐ��F l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** �� 18 List�ϐ��F l_ADDRESS_K_1 */
	public List l_ADDRESS_K_1 = null;

	/** �� 19 List�ϐ��F l_ADDRESS_K_2 */
	public List l_ADDRESS_K_2 = null;

	/** �� 20 List�ϐ��F l_TEL */
	public List l_TEL = null;

	/** �� 21 List�ϐ��F l_FAX */
	public List l_FAX = null;

	/** �� 22 List�ϐ��F l_TRANSPORT_CD */
	public List l_TRANSPORT_CD = null;

	/** �� 23 List�ϐ��F l_TRANSPORT_LT */
	public List l_TRANSPORT_LT = null;

	/** �� 24 List�ϐ��F l_DEPO_WH_CD */
	public List l_DEPO_WH_CD = null;

	/** �� 25 List�ϐ��F l_SHIP_WH_CD */
	public List l_SHIP_WH_CD = null;

	/** �� 26 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 27 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 28 List�ϐ��F l_DEPO_WH_NAME */
	public List l_DEPO_WH_NAME = null;

	/** �� 29 List�ϐ��F l_SHIP_WH_NAME */
	public List l_SHIP_WH_NAME = null;

	/** �� 30 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 31 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_RESULT() { return m_h_RESULT; }
	public String getk_MODE() { return m_k_MODE; }
	public String geth_DLV_LOC_CD() { return m_h_DLV_LOC_CD; }
	public String geth_CUST_CD() { return m_h_CUST_CD; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_CUST_DLV_LOC() { return m_h_APR_CUST_DLV_LOC; }
	public String getSYS_COMPANY_CD() { return m_SYS_COMPANY_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getDLV_LOC_KNAME() { return m_DLV_LOC_KNAME; }
	public String getDLV_LOC_ENAME() { return m_DLV_LOC_ENAME; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getADDRESS_K_1() { return m_ADDRESS_K_1; }
	public String getADDRESS_K_2() { return m_ADDRESS_K_2; }
	public String getTEL() { return m_TEL; }
	public String getFAX() { return m_FAX; }
	public String getTRANSPORT_CD() { return m_TRANSPORT_CD; }
	public String getTRANSPORT_LT() { return m_TRANSPORT_LT; }
	public String getDEPO_WH_CD() { return m_DEPO_WH_CD; }
	public String getSHIP_WH_CD() { return m_SHIP_WH_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getDEPO_WH_NAME() { return m_DEPO_WH_NAME; }
	public String getSHIP_WH_NAME() { return m_SHIP_WH_NAME; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getODR_NO() { return m_ODR_NO; }

	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_h_DLV_LOC_CD() { return l_h_DLV_LOC_CD; }
	public List getList_h_CUST_CD() { return l_h_CUST_CD; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_CUST_DLV_LOC() { return l_h_APR_CUST_DLV_LOC; }
	public List getList_SYS_COMPANY_CD() { return l_SYS_COMPANY_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_DLV_LOC_KNAME() { return l_DLV_LOC_KNAME; }
	public List getList_DLV_LOC_ENAME() { return l_DLV_LOC_ENAME; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_ADDRESS_K_1() { return l_ADDRESS_K_1; }
	public List getList_ADDRESS_K_2() { return l_ADDRESS_K_2; }
	public List getList_TEL() { return l_TEL; }
	public List getList_FAX() { return l_FAX; }
	public List getList_TRANSPORT_CD() { return l_TRANSPORT_CD; }
	public List getList_TRANSPORT_LT() { return l_TRANSPORT_LT; }
	public List getList_DEPO_WH_CD() { return l_DEPO_WH_CD; }
	public List getList_SHIP_WH_CD() { return l_SHIP_WH_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_DEPO_WH_NAME() { return l_DEPO_WH_NAME; }
	public List getList_SHIP_WH_NAME() { return l_SHIP_WH_NAME; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_ODR_NO() { return l_ODR_NO; }

	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setk_MODE(String val) { m_k_MODE = val; }
	public void seth_DLV_LOC_CD(String val) { m_h_DLV_LOC_CD = val; }
	public void seth_CUST_CD(String val) { m_h_CUST_CD = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_CUST_DLV_LOC(String val) { m_h_APR_CUST_DLV_LOC = val; }
	public void setSYS_COMPANY_CD(String val) { m_SYS_COMPANY_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setDLV_LOC_KNAME(String val) { m_DLV_LOC_KNAME = val; }
	public void setDLV_LOC_ENAME(String val) { m_DLV_LOC_ENAME = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setADDRESS_K_1(String val) { m_ADDRESS_K_1 = val; }
	public void setADDRESS_K_2(String val) { m_ADDRESS_K_2 = val; }
	public void setTEL(String val) { m_TEL = val; }
	public void setFAX(String val) { m_FAX = val; }
	public void setTRANSPORT_CD(String val) { m_TRANSPORT_CD = val; }
	public void setTRANSPORT_LT(String val) { m_TRANSPORT_LT = val; }
	public void setDEPO_WH_CD(String val) { m_DEPO_WH_CD = val; }
	public void setSHIP_WH_CD(String val) { m_SHIP_WH_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setDEPO_WH_NAME(String val) { m_DEPO_WH_NAME = val; }
	public void setSHIP_WH_NAME(String val) { m_SHIP_WH_NAME = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }


	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_h_DLV_LOC_CD(List list) { l_h_DLV_LOC_CD = list; }
	public void setList_h_CUST_CD(List list) { l_h_CUST_CD = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_CUST_DLV_LOC(List list) { l_h_APR_CUST_DLV_LOC = list; }
	public void setList_SYS_COMPANY_CD(List list) { l_SYS_COMPANY_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_DLV_LOC_KNAME(List list) { l_DLV_LOC_KNAME = list; }
	public void setList_DLV_LOC_ENAME(List list) { l_DLV_LOC_ENAME = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_ADDRESS_K_1(List list) { l_ADDRESS_K_1 = list; }
	public void setList_ADDRESS_K_2(List list) { l_ADDRESS_K_2 = list; }
	public void setList_TEL(List list) { l_TEL = list; }
	public void setList_FAX(List list) { l_FAX = list; }
	public void setList_TRANSPORT_CD(List list) { l_TRANSPORT_CD = list; }
	public void setList_TRANSPORT_LT(List list) { l_TRANSPORT_LT = list; }
	public void setList_DEPO_WH_CD(List list) { l_DEPO_WH_CD = list; }
	public void setList_SHIP_WH_CD(List list) { l_SHIP_WH_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_DEPO_WH_NAME(List list) { l_DEPO_WH_NAME = list; }
	public void setList_SHIP_WH_NAME(List list) { l_SHIP_WH_NAME = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }

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
			l_h_RESULT.add(((KA0100020Struct) list.get(i)).geth_RESULT());
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
			l_k_MODE.add(((KA0100020Struct) list.get(i)).getk_MODE());
		}
		return size;
	}
	public int setL2L_h_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DLV_LOC_CD == null) {
			l_h_DLV_LOC_CD = new ArrayList();
		} else {
			l_h_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DLV_LOC_CD.add(((KA0100020Struct) list.get(i)).geth_DLV_LOC_CD());
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
			l_h_CUST_CD.add(((KA0100020Struct) list.get(i)).geth_CUST_CD());
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
			l_h_SCREENMOVE_TYP.add(((KA0100020Struct) list.get(i)).geth_SCREENMOVE_TYP());
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
			l_h_APPR_ID.add(((KA0100020Struct) list.get(i)).geth_APPR_ID());
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
			l_APPR_REMARKS.add(((KA0100020Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_CUST_DLV_LOC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_CUST_DLV_LOC == null) {
			l_h_APR_CUST_DLV_LOC = new ArrayList();
		} else {
			l_h_APR_CUST_DLV_LOC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_CUST_DLV_LOC.add(((KA0100020Struct) list.get(i)).geth_APR_CUST_DLV_LOC());
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
			l_SYS_COMPANY_CD.add(((KA0100020Struct) list.get(i)).getSYS_COMPANY_CD());
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
			l_CUST_CD.add(((KA0100020Struct) list.get(i)).getCUST_CD());
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
			l_DLV_LOC_CD.add(((KA0100020Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_NAME == null) {
			l_DLV_LOC_NAME = new ArrayList();
		} else {
			l_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_NAME.add(((KA0100020Struct) list.get(i)).getDLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_DLV_LOC_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_KNAME == null) {
			l_DLV_LOC_KNAME = new ArrayList();
		} else {
			l_DLV_LOC_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_KNAME.add(((KA0100020Struct) list.get(i)).getDLV_LOC_KNAME());
		}
		return size;
	}
	public int setL2L_DLV_LOC_ENAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_ENAME == null) {
			l_DLV_LOC_ENAME = new ArrayList();
		} else {
			l_DLV_LOC_ENAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_ENAME.add(((KA0100020Struct) list.get(i)).getDLV_LOC_ENAME());
		}
		return size;
	}
	public int setL2L_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ZIP_CD == null) {
			l_ZIP_CD = new ArrayList();
		} else {
			l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ZIP_CD.add(((KA0100020Struct) list.get(i)).getZIP_CD());
		}
		return size;
	}
	public int setL2L_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_1 == null) {
			l_ADDRESS_1 = new ArrayList();
		} else {
			l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_1.add(((KA0100020Struct) list.get(i)).getADDRESS_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_2 == null) {
			l_ADDRESS_2 = new ArrayList();
		} else {
			l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_2.add(((KA0100020Struct) list.get(i)).getADDRESS_2());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_1 == null) {
			l_ADDRESS_K_1 = new ArrayList();
		} else {
			l_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_1.add(((KA0100020Struct) list.get(i)).getADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_2 == null) {
			l_ADDRESS_K_2 = new ArrayList();
		} else {
			l_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_2.add(((KA0100020Struct) list.get(i)).getADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEL == null) {
			l_TEL = new ArrayList();
		} else {
			l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEL.add(((KA0100020Struct) list.get(i)).getTEL());
		}
		return size;
	}
	public int setL2L_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FAX == null) {
			l_FAX = new ArrayList();
		} else {
			l_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FAX.add(((KA0100020Struct) list.get(i)).getFAX());
		}
		return size;
	}
	public int setL2L_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_CD == null) {
			l_TRANSPORT_CD = new ArrayList();
		} else {
			l_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_CD.add(((KA0100020Struct) list.get(i)).getTRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_LT == null) {
			l_TRANSPORT_LT = new ArrayList();
		} else {
			l_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_LT.add(((KA0100020Struct) list.get(i)).getTRANSPORT_LT());
		}
		return size;
	}
	public int setL2L_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_WH_CD == null) {
			l_DEPO_WH_CD = new ArrayList();
		} else {
			l_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_WH_CD.add(((KA0100020Struct) list.get(i)).getDEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_WH_CD == null) {
			l_SHIP_WH_CD = new ArrayList();
		} else {
			l_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_WH_CD.add(((KA0100020Struct) list.get(i)).getSHIP_WH_CD());
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
			l_h_MODIFY_COUNT.add(((KA0100020Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_CUST_NAME.add(((KA0100020Struct) list.get(i)).getCUST_NAME());
		}
		return size;
	}
	public int setL2L_DEPO_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_WH_NAME == null) {
			l_DEPO_WH_NAME = new ArrayList();
		} else {
			l_DEPO_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_WH_NAME.add(((KA0100020Struct) list.get(i)).getDEPO_WH_NAME());
		}
		return size;
	}
	public int setL2L_SHIP_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_WH_NAME == null) {
			l_SHIP_WH_NAME = new ArrayList();
		} else {
			l_SHIP_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_WH_NAME.add(((KA0100020Struct) list.get(i)).getSHIP_WH_NAME());
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
			l_DEPO_TYP.add(((KA0100020Struct) list.get(i)).getDEPO_TYP());
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
			l_ODR_NO.add(((KA0100020Struct) list.get(i)).getODR_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_RESULT = null;
		m_k_MODE = null;
		m_h_DLV_LOC_CD = null;
		m_h_CUST_CD = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_h_APR_CUST_DLV_LOC = null;
		m_SYS_COMPANY_CD = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME = null;
		m_DLV_LOC_KNAME = null;
		m_DLV_LOC_ENAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_TRANSPORT_CD = null;
		m_TRANSPORT_LT = null;
		m_DEPO_WH_CD = null;
		m_SHIP_WH_CD = null;
		m_h_MODIFY_COUNT = null;
		m_CUST_NAME = null;
		m_DEPO_WH_NAME = null;
		m_SHIP_WH_NAME = null;
		m_DEPO_TYP = null;
		m_ODR_NO = null;

		l_h_RESULT = null;
		l_k_MODE = null;
		l_h_DLV_LOC_CD = null;
		l_h_CUST_CD = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_h_APR_CUST_DLV_LOC = null;
		l_SYS_COMPANY_CD = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_DLV_LOC_NAME = null;
		l_DLV_LOC_KNAME = null;
		l_DLV_LOC_ENAME = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_ADDRESS_K_1 = null;
		l_ADDRESS_K_2 = null;
		l_TEL = null;
		l_FAX = null;
		l_TRANSPORT_CD = null;
		l_TRANSPORT_LT = null;
		l_DEPO_WH_CD = null;
		l_SHIP_WH_CD = null;
		l_h_MODIFY_COUNT = null;
		l_CUST_NAME = null;
		l_DEPO_WH_NAME = null;
		l_SHIP_WH_NAME = null;
		l_DEPO_TYP = null;
		l_ODR_NO = null;

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
	 * medKA0100020�N���X�̕W���R���X�g���N�^
	 */
	public KA0100020Struct()
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
	public void setStruct(KA0100020Struct struct)
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
	public void setStructM(KA0100020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_RESULT(struct.geth_RESULT());
			this.setk_MODE(struct.getk_MODE());
			this.seth_DLV_LOC_CD(struct.geth_DLV_LOC_CD());
			this.seth_CUST_CD(struct.geth_CUST_CD());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_CUST_DLV_LOC(struct.geth_APR_CUST_DLV_LOC());
			this.setSYS_COMPANY_CD(struct.getSYS_COMPANY_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setDLV_LOC_KNAME(struct.getDLV_LOC_KNAME());
			this.setDLV_LOC_ENAME(struct.getDLV_LOC_ENAME());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setADDRESS_K_1(struct.getADDRESS_K_1());
			this.setADDRESS_K_2(struct.getADDRESS_K_2());
			this.setTEL(struct.getTEL());
			this.setFAX(struct.getFAX());
			this.setTRANSPORT_CD(struct.getTRANSPORT_CD());
			this.setTRANSPORT_LT(struct.getTRANSPORT_LT());
			this.setDEPO_WH_CD(struct.getDEPO_WH_CD());
			this.setSHIP_WH_CD(struct.getSHIP_WH_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setDEPO_WH_NAME(struct.getDEPO_WH_NAME());
			this.setSHIP_WH_NAME(struct.getSHIP_WH_NAME());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setODR_NO(struct.getODR_NO());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KA0100020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_h_DLV_LOC_CD(struct.getList_h_DLV_LOC_CD());
			this.setList_h_CUST_CD(struct.getList_h_CUST_CD());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_CUST_DLV_LOC(struct.getList_h_APR_CUST_DLV_LOC());
			this.setList_SYS_COMPANY_CD(struct.getList_SYS_COMPANY_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_DLV_LOC_KNAME(struct.getList_DLV_LOC_KNAME());
			this.setList_DLV_LOC_ENAME(struct.getList_DLV_LOC_ENAME());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_ADDRESS_K_1(struct.getList_ADDRESS_K_1());
			this.setList_ADDRESS_K_2(struct.getList_ADDRESS_K_2());
			this.setList_TEL(struct.getList_TEL());
			this.setList_FAX(struct.getList_FAX());
			this.setList_TRANSPORT_CD(struct.getList_TRANSPORT_CD());
			this.setList_TRANSPORT_LT(struct.getList_TRANSPORT_LT());
			this.setList_DEPO_WH_CD(struct.getList_DEPO_WH_CD());
			this.setList_SHIP_WH_CD(struct.getList_SHIP_WH_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_DEPO_WH_NAME(struct.getList_DEPO_WH_NAME());
			this.setList_SHIP_WH_NAME(struct.getList_SHIP_WH_NAME());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_ODR_NO(struct.getList_ODR_NO());
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
	// �� 1 �ϐ������l�F i_h_RESULT


	final static String i_h_RESULT = null;

	// �� 2 �ϐ������l�F i_k_MODE


	final static String i_k_MODE = null;

	// �� 3 �ϐ������l�F i_h_DLV_LOC_CD


	final static String i_h_DLV_LOC_CD = null;

	// �� 4 �ϐ������l�F i_h_CUST_CD


	final static String i_h_CUST_CD = null;

	// �� 5 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 6 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 7 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 8 �ϐ������l�F i_h_APR_CUST_DLV_LOC


	final static String i_h_APR_CUST_DLV_LOC = null;

	// �� 9 �ϐ������l�F i_SYS_COMPANY_CD


	final static String i_SYS_COMPANY_CD = null;

	// �� 10 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 11 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 12 �ϐ������l�F i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// �� 13 �ϐ������l�F i_DLV_LOC_KNAME


	final static String i_DLV_LOC_KNAME = null;

	// �� 14 �ϐ������l�F i_DLV_LOC_ENAME


	final static String i_DLV_LOC_ENAME = null;

	// �� 15 �ϐ������l�F i_ZIP_CD


	final static String i_ZIP_CD = null;

	// �� 16 �ϐ������l�F i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// �� 17 �ϐ������l�F i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// �� 18 �ϐ������l�F i_ADDRESS_K_1


	final static String i_ADDRESS_K_1 = null;

	// �� 19 �ϐ������l�F i_ADDRESS_K_2


	final static String i_ADDRESS_K_2 = null;

	// �� 20 �ϐ������l�F i_TEL


	final static String i_TEL = null;

	// �� 21 �ϐ������l�F i_FAX


	final static String i_FAX = null;

	// �� 22 �ϐ������l�F i_TRANSPORT_CD


	final static String i_TRANSPORT_CD = null;

	// �� 23 �ϐ������l�F i_TRANSPORT_LT


	final static String i_TRANSPORT_LT = null;

	// �� 24 �ϐ������l�F i_DEPO_WH_CD


	final static String i_DEPO_WH_CD = null;

	// �� 25 �ϐ������l�F i_SHIP_WH_CD


	final static String i_SHIP_WH_CD = null;

	// �� 26 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 27 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 28 �ϐ������l�F i_DEPO_WH_NAME


	final static String i_DEPO_WH_NAME = null;

	// �� 29 �ϐ������l�F i_SHIP_WH_NAME


	final static String i_SHIP_WH_NAME = null;

	// �� 30 �ϐ������l�F i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// �� 31 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 2 �ϐ������l�F i_DLV_LOC_CD
        final static String i_DLV_LOC_CD = null;
        // �� 3 �ϐ������l�F i_DLV_LOC_NAME
        final static String i_DLV_LOC_NAME = null;
        // �� 4 �ϐ������l�F i_DLV_LOC_KNAME
        final static String i_DLV_LOC_KNAME = null;
        // �� 5 �ϐ������l�F i_DLV_LOC_ENAME
        final static String i_DLV_LOC_ENAME = null;
        // �� 6 �ϐ������l�F i_ZIP_CD
        final static String i_ZIP_CD = null;
        // �� 7 �ϐ������l�F i_ADDRESS_1
        final static String i_ADDRESS_1 = null;
        // �� 8 �ϐ������l�F i_ADDRESS_2
        final static String i_ADDRESS_2 = null;
        // �� 9 �ϐ������l�F i_ADDRESS_K_1
        final static String i_ADDRESS_K_1 = null;
        // �� 10 �ϐ������l�F i_ADDRESS_K_2
        final static String i_ADDRESS_K_2 = null;
        // �� 11 �ϐ������l�F i_TEL
        final static String i_TEL = null;
        // �� 12 �ϐ������l�F i_FAX
        final static String i_FAX = null;
        // �� 13 �ϐ������l�F i_TRANSPORT_CD
        final static String i_TRANSPORT_CD = null;
        // �� 14 �ϐ������l�F i_TRANSPORT_LT
        final static String i_TRANSPORT_LT = null;
        // �� 15 �ϐ������l�F i_DEPO_WH_CD
        final static String i_DEPO_WH_CD = null;
        // �� 16 �ϐ������l�F i_SHIP_WH_CD
        final static String i_SHIP_WH_CD = null;
        // �� 17 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 18 �ϐ������l�F i_SYS_COMPANY_CD
        final static String i_SYS_COMPANY_CD = null;
        // �� 19 �ϐ������l�F i_DEPO_TYP
        final static String i_DEPO_TYP = null;
        // �� 20 �ϐ������l�F i_h_RESULT
        final static String i_h_RESULT = null;
        // �� 21 �ϐ������l�F i_k_MODE
        final static String i_k_MODE = null;
        // �� 22 �ϐ������l�F i_h_DLV_LOC_CD
        final static String i_h_DLV_LOC_CD = null;
        // �� 23 �ϐ������l�F i_h_CUST_CD
        final static String i_h_CUST_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CUST_CD = i_CUST_CD;
         m_DLV_LOC_CD = i_DLV_LOC_CD;
         m_DLV_LOC_NAME = i_DLV_LOC_NAME;
         m_DLV_LOC_KNAME = i_DLV_LOC_KNAME;
         m_DLV_LOC_ENAME = i_DLV_LOC_ENAME;
         m_ZIP_CD = i_ZIP_CD;
         m_ADDRESS_1 = i_ADDRESS_1;
         m_ADDRESS_2 = i_ADDRESS_2;
         m_ADDRESS_K_1 = i_ADDRESS_K_1;
         m_ADDRESS_K_2 = i_ADDRESS_K_2;
         m_TEL = i_TEL;
         m_FAX = i_FAX;
         m_TRANSPORT_CD = i_TRANSPORT_CD;
         m_TRANSPORT_LT = i_TRANSPORT_LT;
         m_DEPO_WH_CD = i_DEPO_WH_CD;
         m_SHIP_WH_CD = i_SHIP_WH_CD;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_SYS_COMPANY_CD = i_SYS_COMPANY_CD;
         m_h_CUST_CD = i_h_CUST_CD;
         m_DEPO_TYP = i_DEPO_TYP;
         m_h_RESULT = i_h_RESULT;
         m_k_MODE = i_k_MODE;
         m_h_DLV_LOC_CD = i_h_DLV_LOC_CD;
        }
       
        public void copy(KA0100020Struct s)
        {
         clear();
         if(s.m_SYS_COMPANY_CD != null) m_SYS_COMPANY_CD = new String(s.m_SYS_COMPANY_CD);
         if(s.m_CUST_CD != null) m_CUST_CD = new String(s.m_CUST_CD);
         if(s.m_DLV_LOC_CD != null) m_DLV_LOC_CD = new String(s.m_DLV_LOC_CD);
         if(s.m_DLV_LOC_NAME != null) m_DLV_LOC_NAME = new String(s.m_DLV_LOC_NAME);
         if(s.m_DLV_LOC_KNAME != null) m_DLV_LOC_KNAME = new String(s.m_DLV_LOC_KNAME);
         if(s.m_DLV_LOC_ENAME != null) m_DLV_LOC_ENAME = new String(s.m_DLV_LOC_ENAME);
         if(s.m_ZIP_CD != null) m_ZIP_CD = new String(s.m_ZIP_CD);
         if(s.m_ADDRESS_1 != null) m_ADDRESS_1 = new String(s.m_ADDRESS_1);
         if(s.m_ADDRESS_2 != null) m_ADDRESS_2 = new String(s.m_ADDRESS_2);
         if(s.m_ADDRESS_K_1 != null) m_ADDRESS_K_1 = new String(s.m_ADDRESS_K_1);
         if(s.m_ADDRESS_K_2 != null) m_ADDRESS_K_2 = new String(s.m_ADDRESS_K_2);
         if(s.m_TEL != null) m_TEL = new String(s.m_TEL);
         if(s.m_FAX != null) m_FAX = new String(s.m_FAX);
         if(s.m_TRANSPORT_CD != null) m_TRANSPORT_CD = new String(s.m_TRANSPORT_CD);
         if(s.m_TRANSPORT_LT != null) m_TRANSPORT_LT = new String(s.m_TRANSPORT_LT);
         if(s.m_DEPO_WH_CD != null) m_DEPO_WH_CD = new String(s.m_DEPO_WH_CD);
         if(s.m_SHIP_WH_CD != null) m_SHIP_WH_CD = new String(s.m_SHIP_WH_CD);
         if(s.m_DEPO_TYP != null) m_DEPO_TYP = new String(s.m_DEPO_TYP);
         if(s.m_h_MODIFY_COUNT != null) m_h_MODIFY_COUNT = new String(s.m_h_MODIFY_COUNT);
       
               if(s.m_CUST_NAME != null) m_CUST_NAME = new String(s.m_CUST_NAME);
               if(s.m_DEPO_WH_NAME != null) m_DEPO_WH_NAME = new String(s.m_DEPO_WH_NAME);
               if(s.m_SHIP_WH_NAME != null) m_SHIP_WH_NAME = new String(s.m_SHIP_WH_NAME);
        }
       
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
