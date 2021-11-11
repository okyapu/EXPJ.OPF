/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0060/src/com/nec/jp/orteus/metamorBase/KQ0060/KQ0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0060;

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
 * CLASS     : KQ0060010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.14 $ $Date: 2014/06/17 03:21:02 $
 *
 */
//}}user_implement_code_header

public class KQ0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 2 �ϐ��F m_w_BUSINESS_OPR_DATE */
	public String m_w_BUSINESS_OPR_DATE = null;
	/** �� 3 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 4 �ϐ��F m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** �� 5 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 6 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 7 �ϐ��F m_SUM_ODR_QTY */
	public String m_SUM_ODR_QTY = null;
	/** �� 8 �ϐ��F m_UNCONFIRM_ODR_QTY */
	public String m_UNCONFIRM_ODR_QTY = null;
	/** �� 9 �ϐ��F m_PLN_QTY_REMAIN */
	public String m_PLN_QTY_REMAIN = null;
	/** �� 10 �ϐ��F m_SHIP_QTY */
	public String m_SHIP_QTY = null;
	/** �� 11 �ϐ��F m_ODR_REM_QTY */
	public String m_ODR_REM_QTY = null;
	/** �� 12 �ϐ��F m_SUM_OD */
	public String m_SUM_OD = null;
	/** �� 13 �ϐ��F m_SUM_STOCK_ON_HAND_QTY */
	public String m_SUM_STOCK_ON_HAND_QTY = null;
	/** �� 14 �ϐ��F m_QTY_DIFF */
	public String m_QTY_DIFF = null;
	/** �� 15 �ϐ��F m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** �� 16 �ϐ��F m_IN_DATE */
	public String m_IN_DATE = null;
	/** �� 17 �ϐ��F m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 2 List�ϐ��F l_w_BUSINESS_OPR_DATE */
	public List l_w_BUSINESS_OPR_DATE = null;

	/** �� 3 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 4 List�ϐ��F l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** �� 5 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 6 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 7 List�ϐ��F l_SUM_ODR_QTY */
	public List l_SUM_ODR_QTY = null;

	/** �� 8 List�ϐ��F l_UNCONFIRM_ODR_QTY */
	public List l_UNCONFIRM_ODR_QTY = null;

	/** �� 9 List�ϐ��F l_PLN_QTY_REMAIN */
	public List l_PLN_QTY_REMAIN = null;

	/** �� 10 List�ϐ��F l_SHIP_QTY */
	public List l_SHIP_QTY = null;

	/** �� 11 List�ϐ��F l_ODR_REM_QTY */
	public List l_ODR_REM_QTY = null;

	/** �� 12 List�ϐ��F l_SUM_OD */
	public List l_SUM_OD = null;

	/** �� 13 List�ϐ��F l_SUM_STOCK_ON_HAND_QTY */
	public List l_SUM_STOCK_ON_HAND_QTY = null;

	/** �� 14 List�ϐ��F l_QTY_DIFF */
	public List l_QTY_DIFF = null;

	/** �� 15 List�ϐ��F l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** �� 16 List�ϐ��F l_IN_DATE */
	public List l_IN_DATE = null;

	/** �� 17 List�ϐ��F l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_BUSINESS_OPR_DATE() { return m_w_BUSINESS_OPR_DATE; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSUM_ODR_QTY() { return m_SUM_ODR_QTY; }
	public String getUNCONFIRM_ODR_QTY() { return m_UNCONFIRM_ODR_QTY; }
	public String getPLN_QTY_REMAIN() { return m_PLN_QTY_REMAIN; }
	public String getSHIP_QTY() { return m_SHIP_QTY; }
	public String getODR_REM_QTY() { return m_ODR_REM_QTY; }
	public String getSUM_OD() { return m_SUM_OD; }
	public String getSUM_STOCK_ON_HAND_QTY() { return m_SUM_STOCK_ON_HAND_QTY; }
	public String getQTY_DIFF() { return m_QTY_DIFF; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getIN_DATE() { return m_IN_DATE; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_BUSINESS_OPR_DATE() { return l_w_BUSINESS_OPR_DATE; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_SUM_ODR_QTY() { return l_SUM_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_QTY() { return l_UNCONFIRM_ODR_QTY; }
	public List getList_PLN_QTY_REMAIN() { return l_PLN_QTY_REMAIN; }
	public List getList_SHIP_QTY() { return l_SHIP_QTY; }
	public List getList_ODR_REM_QTY() { return l_ODR_REM_QTY; }
	public List getList_SUM_OD() { return l_SUM_OD; }
	public List getList_SUM_STOCK_ON_HAND_QTY() { return l_SUM_STOCK_ON_HAND_QTY; }
	public List getList_QTY_DIFF() { return l_QTY_DIFF; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_IN_DATE() { return l_IN_DATE; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_BUSINESS_OPR_DATE(String val) { m_w_BUSINESS_OPR_DATE = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSUM_ODR_QTY(String val) { m_SUM_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_QTY(String val) { m_UNCONFIRM_ODR_QTY = val; }
	public void setPLN_QTY_REMAIN(String val) { m_PLN_QTY_REMAIN = val; }
	public void setSHIP_QTY(String val) { m_SHIP_QTY = val; }
	public void setODR_REM_QTY(String val) { m_ODR_REM_QTY = val; }
	public void setSUM_OD(String val) { m_SUM_OD = val; }
	public void setSUM_STOCK_ON_HAND_QTY(String val) { m_SUM_STOCK_ON_HAND_QTY = val; }
	public void setQTY_DIFF(String val) { m_QTY_DIFF = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setIN_DATE(String val) { m_IN_DATE = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_BUSINESS_OPR_DATE(List list) { l_w_BUSINESS_OPR_DATE = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_SUM_ODR_QTY(List list) { l_SUM_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_QTY(List list) { l_UNCONFIRM_ODR_QTY = list; }
	public void setList_PLN_QTY_REMAIN(List list) { l_PLN_QTY_REMAIN = list; }
	public void setList_SHIP_QTY(List list) { l_SHIP_QTY = list; }
	public void setList_ODR_REM_QTY(List list) { l_ODR_REM_QTY = list; }
	public void setList_SUM_OD(List list) { l_SUM_OD = list; }
	public void setList_SUM_STOCK_ON_HAND_QTY(List list) { l_SUM_STOCK_ON_HAND_QTY = list; }
	public void setList_QTY_DIFF(List list) { l_QTY_DIFF = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_IN_DATE(List list) { l_IN_DATE = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }

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
			l_DOWNLOAD_FILE.add(((KQ0060010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_w_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BUSINESS_OPR_DATE == null) {
			l_w_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_w_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BUSINESS_OPR_DATE.add(((KQ0060010Struct) list.get(i)).getw_BUSINESS_OPR_DATE());
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
			l_w_PLANT_CD.add(((KQ0060010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMPANY_CD == null) {
			l_w_COMPANY_CD = new ArrayList();
		} else {
			l_w_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMPANY_CD.add(((KQ0060010Struct) list.get(i)).getw_COMPANY_CD());
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
			l_ITEM_CD.add(((KQ0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KQ0060010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_SUM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ODR_QTY == null) {
			l_SUM_ODR_QTY = new ArrayList();
		} else {
			l_SUM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ODR_QTY.add(((KQ0060010Struct) list.get(i)).getSUM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_QTY == null) {
			l_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_QTY.add(((KQ0060010Struct) list.get(i)).getUNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_PLN_QTY_REMAIN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_QTY_REMAIN == null) {
			l_PLN_QTY_REMAIN = new ArrayList();
		} else {
			l_PLN_QTY_REMAIN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_QTY_REMAIN.add(((KQ0060010Struct) list.get(i)).getPLN_QTY_REMAIN());
		}
		return size;
	}
	public int setL2L_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_QTY == null) {
			l_SHIP_QTY = new ArrayList();
		} else {
			l_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_QTY.add(((KQ0060010Struct) list.get(i)).getSHIP_QTY());
		}
		return size;
	}
	public int setL2L_ODR_REM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_REM_QTY == null) {
			l_ODR_REM_QTY = new ArrayList();
		} else {
			l_ODR_REM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_REM_QTY.add(((KQ0060010Struct) list.get(i)).getODR_REM_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OD == null) {
			l_SUM_OD = new ArrayList();
		} else {
			l_SUM_OD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OD.add(((KQ0060010Struct) list.get(i)).getSUM_OD());
		}
		return size;
	}
	public int setL2L_SUM_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_STOCK_ON_HAND_QTY == null) {
			l_SUM_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_SUM_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_STOCK_ON_HAND_QTY.add(((KQ0060010Struct) list.get(i)).getSUM_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_QTY_DIFF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QTY_DIFF == null) {
			l_QTY_DIFF = new ArrayList();
		} else {
			l_QTY_DIFF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QTY_DIFF.add(((KQ0060010Struct) list.get(i)).getQTY_DIFF());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((KQ0060010Struct) list.get(i)).getPKG_UNIT());
		}
		return size;
	}
	public int setL2L_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_DATE == null) {
			l_IN_DATE = new ArrayList();
		} else {
			l_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_DATE.add(((KQ0060010Struct) list.get(i)).getIN_DATE());
		}
		return size;
	}
	public int setL2L_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_CD == null) {
			l_IN_ITEM_CD = new ArrayList();
		} else {
			l_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_CD.add(((KQ0060010Struct) list.get(i)).getIN_ITEM_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_w_BUSINESS_OPR_DATE = null;
		m_w_PLANT_CD = null;
		m_w_COMPANY_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_SUM_ODR_QTY = null;
		m_UNCONFIRM_ODR_QTY = null;
		m_PLN_QTY_REMAIN = null;
		m_SHIP_QTY = null;
		m_ODR_REM_QTY = null;
		m_SUM_OD = null;
		m_SUM_STOCK_ON_HAND_QTY = null;
		m_QTY_DIFF = null;
		m_PKG_UNIT = null;
		m_IN_DATE = null;
		m_IN_ITEM_CD = null;

		l_DOWNLOAD_FILE = null;
		l_w_BUSINESS_OPR_DATE = null;
		l_w_PLANT_CD = null;
		l_w_COMPANY_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_SUM_ODR_QTY = null;
		l_UNCONFIRM_ODR_QTY = null;
		l_PLN_QTY_REMAIN = null;
		l_SHIP_QTY = null;
		l_ODR_REM_QTY = null;
		l_SUM_OD = null;
		l_SUM_STOCK_ON_HAND_QTY = null;
		l_QTY_DIFF = null;
		l_PKG_UNIT = null;
		l_IN_DATE = null;
		l_IN_ITEM_CD = null;

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
	 * medKQ0060010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0060010Struct()
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
	public void setStruct(KQ0060010Struct struct)
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
	public void setStructM(KQ0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_BUSINESS_OPR_DATE(struct.getw_BUSINESS_OPR_DATE());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSUM_ODR_QTY(struct.getSUM_ODR_QTY());
			this.setUNCONFIRM_ODR_QTY(struct.getUNCONFIRM_ODR_QTY());
			this.setPLN_QTY_REMAIN(struct.getPLN_QTY_REMAIN());
			this.setSHIP_QTY(struct.getSHIP_QTY());
			this.setODR_REM_QTY(struct.getODR_REM_QTY());
			this.setSUM_OD(struct.getSUM_OD());
			this.setSUM_STOCK_ON_HAND_QTY(struct.getSUM_STOCK_ON_HAND_QTY());
			this.setQTY_DIFF(struct.getQTY_DIFF());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setIN_DATE(struct.getIN_DATE());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_BUSINESS_OPR_DATE(struct.getList_w_BUSINESS_OPR_DATE());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_SUM_ODR_QTY(struct.getList_SUM_ODR_QTY());
			this.setList_UNCONFIRM_ODR_QTY(struct.getList_UNCONFIRM_ODR_QTY());
			this.setList_PLN_QTY_REMAIN(struct.getList_PLN_QTY_REMAIN());
			this.setList_SHIP_QTY(struct.getList_SHIP_QTY());
			this.setList_ODR_REM_QTY(struct.getList_ODR_REM_QTY());
			this.setList_SUM_OD(struct.getList_SUM_OD());
			this.setList_SUM_STOCK_ON_HAND_QTY(struct.getList_SUM_STOCK_ON_HAND_QTY());
			this.setList_QTY_DIFF(struct.getList_QTY_DIFF());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_IN_DATE(struct.getList_IN_DATE());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
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
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_w_BUSINESS_OPR_DATE


	final static String i_w_BUSINESS_OPR_DATE = null;

	// �� 3 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 4 �ϐ������l�F i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// �� 5 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 7 �ϐ������l�F i_SUM_ODR_QTY


	final static String i_SUM_ODR_QTY = null;

	// �� 8 �ϐ������l�F i_UNCONFIRM_ODR_QTY


	final static String i_UNCONFIRM_ODR_QTY = null;

	// �� 9 �ϐ������l�F i_PLN_QTY_REMAIN


	final static String i_PLN_QTY_REMAIN = null;

	// �� 10 �ϐ������l�F i_SHIP_QTY


	final static String i_SHIP_QTY = null;

	// �� 11 �ϐ������l�F i_ODR_REM_QTY


	final static String i_ODR_REM_QTY = null;

	// �� 12 �ϐ������l�F i_SUM_OD


	final static String i_SUM_OD = null;

	// �� 13 �ϐ������l�F i_SUM_STOCK_ON_HAND_QTY


	final static String i_SUM_STOCK_ON_HAND_QTY = null;

	// �� 14 �ϐ������l�F i_QTY_DIFF


	final static String i_QTY_DIFF = null;

	// �� 15 �ϐ������l�F i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// �� 16 �ϐ������l�F i_IN_DATE


	final static String i_IN_DATE = null;

	// �� 17 �ϐ������l�F i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_w_BUSINESS_OPR_DATE

	final static String i_w_BUSINESS_OPR_DATE = null;

	// �� 3 �ϐ������l�F i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// �� 4 �ϐ������l�F i_w_COMPANY_CD

	final static String i_w_COMPANY_CD = null;

	// �� 5 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 7 �ϐ������l�F i_SUM_ODR_QTY

	final static String i_SUM_ODR_QTY = null;

	// �� 8 �ϐ������l�F i_UNCONFIRM_ODR_QTY

	final static String i_UNCONFIRM_ODR_QTY = null;

	// �� 9 �ϐ������l�F i_PLN_QTY_REMAIN

	final static String i_PLN_QTY_REMAIN = null;

	// �� 10 �ϐ������l�F i_SHIP_QTY

	final static String i_SHIP_QTY = null;

	// �� 11 �ϐ������l�F i_ODR_REM_QTY

	final static String i_ODR_REM_QTY = null;

	// �� 12 �ϐ������l�F i_SUM_OD

	final static String i_SUM_OD = null;

	// �� 13 �ϐ������l�F i_SUM_STOCK_ON_HAND_QTY

	final static String i_SUM_STOCK_ON_HAND_QTY = null;

	// �� 14 �ϐ������l�F i_QTY_DIFF

	final static String i_QTY_DIFF = null;

	// �� 15 �ϐ������l�F i_PKG_UNIT

	final static String i_PKG_UNIT = null;

	// �� 16 �ϐ������l�F i_IN_DATE

	final static String i_IN_DATE = null;

	// �� 17 �ϐ������l�F i_IN_ITEM_CD

	final static String i_IN_ITEM_CD = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_w_BUSINESS_OPR_DATE = i_w_BUSINESS_OPR_DATE;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_w_COMPANY_CD = i_w_COMPANY_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_SUM_ODR_QTY = i_SUM_ODR_QTY;
		m_UNCONFIRM_ODR_QTY = i_UNCONFIRM_ODR_QTY;
		m_PLN_QTY_REMAIN = i_PLN_QTY_REMAIN;
		m_SHIP_QTY = i_SHIP_QTY;
		m_ODR_REM_QTY = i_ODR_REM_QTY;
		m_SUM_OD = i_SUM_OD;
		m_SUM_STOCK_ON_HAND_QTY = i_SUM_STOCK_ON_HAND_QTY;
		m_QTY_DIFF = i_QTY_DIFF;
		m_PKG_UNIT = i_PKG_UNIT;
		m_IN_DATE = i_IN_DATE;
		m_IN_ITEM_CD = i_IN_ITEM_CD;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
