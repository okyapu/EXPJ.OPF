/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0040/src/com/nec/jp/orteus/metamorBase/AG0040/AG0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0040;

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

public class AG0040010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 2 �ϐ��F m_c1_VIEW_TYP */
	public String m_c1_VIEW_TYP = null;
	/** �� 3 �ϐ��F m_c2_VIEW_TYP */
	public String m_c2_VIEW_TYP = null;
	/** �� 4 �ϐ��F m_tempLot */
	public String m_tempLot = null;
	/** �� 5 �ϐ��F m_c3_VIEW_TYP */
	public String m_c3_VIEW_TYP = null;
	/** �� 6 �ϐ��F m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** �� 7 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 8 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 9 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 10 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** �� 11 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 12 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 13 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 14 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 15 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 16 �ϐ��F m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** �� 17 �ϐ��F m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** �� 18 �ϐ��F m_PRVS_DAYEND_STOCK_QTY */
	public String m_PRVS_DAYEND_STOCK_QTY = null;
	/** �� 19 �ϐ��F m_PRVS_MONTHEND_STOCK_QTY */
	public String m_PRVS_MONTHEND_STOCK_QTY = null;
	/** �� 20 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 21 �ϐ��F m_SUPPLY_KBN_DN */
	public String m_SUPPLY_KBN_DN = null;
	/** �� 22 �ϐ��F m_IN_PLANT_CD */
	public String m_IN_PLANT_CD = null;
	/** �� 23 �ϐ��F m_IN_WH_CD */
	public String m_IN_WH_CD = null;
	/** �� 24 �ϐ��F m_IN_VEND_CD */
	public String m_IN_VEND_CD = null;
	/** �� 25 �ϐ��F m_IN_JOB_ODR_CD */
	public String m_IN_JOB_ODR_CD = null;
	/** �� 26 �ϐ��F m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;
	/** �� 27 �ϐ��F m_readPLAN_CD */
	public String m_readPLAN_CD = null;
	/** �� 28 �ϐ��F m_IN_PLANT_NAME */
	public String m_IN_PLANT_NAME = null;
	/** �� 29 �ϐ��F m_readWH_CD */
	public String m_readWH_CD = null;
	/** �� 30 �ϐ��F m_readVEND_CD */
	public String m_readVEND_CD = null;
	/** �� 31 �ϐ��F m_IN_WH_NAME */
	public String m_IN_WH_NAME = null;
	/** �� 32 �ϐ��F m_IN_VEND_NAME */
	public String m_IN_VEND_NAME = null;
	/** �� 33 �ϐ��F m_readITEM_CD */
	public String m_readITEM_CD = null;
	/** �� 34 �ϐ��F m_IN_ITEM_NAME */
	public String m_IN_ITEM_NAME = null;
	/** �� 35 �ϐ��F m_SUPPLY_KBN */
	public String m_SUPPLY_KBN = null;
	/** �� 36 �ϐ��F m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** �� 37 �ϐ��F m_IN_LOT_NO */
	public String m_IN_LOT_NO = null;
	/** �� 38 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 39 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 2 List�ϐ��F l_c1_VIEW_TYP */
	public List l_c1_VIEW_TYP = null;

	/** �� 3 List�ϐ��F l_c2_VIEW_TYP */
	public List l_c2_VIEW_TYP = null;

	/** �� 4 List�ϐ��F l_tempLot */
	public List l_tempLot = null;

	/** �� 5 List�ϐ��F l_c3_VIEW_TYP */
	public List l_c3_VIEW_TYP = null;

	/** �� 6 List�ϐ��F l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** �� 7 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 8 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 9 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 10 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 11 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 12 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 13 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 14 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 15 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 16 List�ϐ��F l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** �� 17 List�ϐ��F l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** �� 18 List�ϐ��F l_PRVS_DAYEND_STOCK_QTY */
	public List l_PRVS_DAYEND_STOCK_QTY = null;

	/** �� 19 List�ϐ��F l_PRVS_MONTHEND_STOCK_QTY */
	public List l_PRVS_MONTHEND_STOCK_QTY = null;

	/** �� 20 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 21 List�ϐ��F l_SUPPLY_KBN_DN */
	public List l_SUPPLY_KBN_DN = null;

	/** �� 22 List�ϐ��F l_IN_PLANT_CD */
	public List l_IN_PLANT_CD = null;

	/** �� 23 List�ϐ��F l_IN_WH_CD */
	public List l_IN_WH_CD = null;

	/** �� 24 List�ϐ��F l_IN_VEND_CD */
	public List l_IN_VEND_CD = null;

	/** �� 25 List�ϐ��F l_IN_JOB_ODR_CD */
	public List l_IN_JOB_ODR_CD = null;

	/** �� 26 List�ϐ��F l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;

	/** �� 27 List�ϐ��F l_readPLAN_CD */
	public List l_readPLAN_CD = null;

	/** �� 28 List�ϐ��F l_IN_PLANT_NAME */
	public List l_IN_PLANT_NAME = null;

	/** �� 29 List�ϐ��F l_readWH_CD */
	public List l_readWH_CD = null;

	/** �� 30 List�ϐ��F l_readVEND_CD */
	public List l_readVEND_CD = null;

	/** �� 31 List�ϐ��F l_IN_WH_NAME */
	public List l_IN_WH_NAME = null;

	/** �� 32 List�ϐ��F l_IN_VEND_NAME */
	public List l_IN_VEND_NAME = null;

	/** �� 33 List�ϐ��F l_readITEM_CD */
	public List l_readITEM_CD = null;

	/** �� 34 List�ϐ��F l_IN_ITEM_NAME */
	public List l_IN_ITEM_NAME = null;

	/** �� 35 List�ϐ��F l_SUPPLY_KBN */
	public List l_SUPPLY_KBN = null;

	/** �� 36 List�ϐ��F l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** �� 37 List�ϐ��F l_IN_LOT_NO */
	public List l_IN_LOT_NO = null;

	/** �� 38 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 39 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getc1_VIEW_TYP() { return m_c1_VIEW_TYP; }
	public String getc2_VIEW_TYP() { return m_c2_VIEW_TYP; }
	public String gettempLot() { return m_tempLot; }
	public String getc3_VIEW_TYP() { return m_c3_VIEW_TYP; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getPRVS_DAYEND_STOCK_QTY() { return m_PRVS_DAYEND_STOCK_QTY; }
	public String getPRVS_MONTHEND_STOCK_QTY() { return m_PRVS_MONTHEND_STOCK_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getSUPPLY_KBN_DN() { return m_SUPPLY_KBN_DN; }
	public String getIN_PLANT_CD() { return m_IN_PLANT_CD; }
	public String getIN_WH_CD() { return m_IN_WH_CD; }
	public String getIN_VEND_CD() { return m_IN_VEND_CD; }
	public String getIN_JOB_ODR_CD() { return m_IN_JOB_ODR_CD; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }
	public String getreadPLAN_CD() { return m_readPLAN_CD; }
	public String getIN_PLANT_NAME() { return m_IN_PLANT_NAME; }
	public String getreadWH_CD() { return m_readWH_CD; }
	public String getreadVEND_CD() { return m_readVEND_CD; }
	public String getIN_WH_NAME() { return m_IN_WH_NAME; }
	public String getIN_VEND_NAME() { return m_IN_VEND_NAME; }
	public String getreadITEM_CD() { return m_readITEM_CD; }
	public String getIN_ITEM_NAME() { return m_IN_ITEM_NAME; }
	public String getSUPPLY_KBN() { return m_SUPPLY_KBN; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getIN_LOT_NO() { return m_IN_LOT_NO; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_c1_VIEW_TYP() { return l_c1_VIEW_TYP; }
	public List getList_c2_VIEW_TYP() { return l_c2_VIEW_TYP; }
	public List getList_tempLot() { return l_tempLot; }
	public List getList_c3_VIEW_TYP() { return l_c3_VIEW_TYP; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_PRVS_DAYEND_STOCK_QTY() { return l_PRVS_DAYEND_STOCK_QTY; }
	public List getList_PRVS_MONTHEND_STOCK_QTY() { return l_PRVS_MONTHEND_STOCK_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_SUPPLY_KBN_DN() { return l_SUPPLY_KBN_DN; }
	public List getList_IN_PLANT_CD() { return l_IN_PLANT_CD; }
	public List getList_IN_WH_CD() { return l_IN_WH_CD; }
	public List getList_IN_VEND_CD() { return l_IN_VEND_CD; }
	public List getList_IN_JOB_ODR_CD() { return l_IN_JOB_ODR_CD; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }
	public List getList_readPLAN_CD() { return l_readPLAN_CD; }
	public List getList_IN_PLANT_NAME() { return l_IN_PLANT_NAME; }
	public List getList_readWH_CD() { return l_readWH_CD; }
	public List getList_readVEND_CD() { return l_readVEND_CD; }
	public List getList_IN_WH_NAME() { return l_IN_WH_NAME; }
	public List getList_IN_VEND_NAME() { return l_IN_VEND_NAME; }
	public List getList_readITEM_CD() { return l_readITEM_CD; }
	public List getList_IN_ITEM_NAME() { return l_IN_ITEM_NAME; }
	public List getList_SUPPLY_KBN() { return l_SUPPLY_KBN; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_IN_LOT_NO() { return l_IN_LOT_NO; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setc1_VIEW_TYP(String val) { m_c1_VIEW_TYP = val; }
	public void setc2_VIEW_TYP(String val) { m_c2_VIEW_TYP = val; }
	public void settempLot(String val) { m_tempLot = val; }
	public void setc3_VIEW_TYP(String val) { m_c3_VIEW_TYP = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setPRVS_DAYEND_STOCK_QTY(String val) { m_PRVS_DAYEND_STOCK_QTY = val; }
	public void setPRVS_MONTHEND_STOCK_QTY(String val) { m_PRVS_MONTHEND_STOCK_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setSUPPLY_KBN_DN(String val) { m_SUPPLY_KBN_DN = val; }
	public void setIN_PLANT_CD(String val) { m_IN_PLANT_CD = val; }
	public void setIN_WH_CD(String val) { m_IN_WH_CD = val; }
	public void setIN_VEND_CD(String val) { m_IN_VEND_CD = val; }
	public void setIN_JOB_ODR_CD(String val) { m_IN_JOB_ODR_CD = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }
	public void setreadPLAN_CD(String val) { m_readPLAN_CD = val; }
	public void setIN_PLANT_NAME(String val) { m_IN_PLANT_NAME = val; }
	public void setreadWH_CD(String val) { m_readWH_CD = val; }
	public void setreadVEND_CD(String val) { m_readVEND_CD = val; }
	public void setIN_WH_NAME(String val) { m_IN_WH_NAME = val; }
	public void setIN_VEND_NAME(String val) { m_IN_VEND_NAME = val; }
	public void setreadITEM_CD(String val) { m_readITEM_CD = val; }
	public void setIN_ITEM_NAME(String val) { m_IN_ITEM_NAME = val; }
	public void setSUPPLY_KBN(String val) { m_SUPPLY_KBN = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setIN_LOT_NO(String val) { m_IN_LOT_NO = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_c1_VIEW_TYP(List list) { l_c1_VIEW_TYP = list; }
	public void setList_c2_VIEW_TYP(List list) { l_c2_VIEW_TYP = list; }
	public void setList_tempLot(List list) { l_tempLot = list; }
	public void setList_c3_VIEW_TYP(List list) { l_c3_VIEW_TYP = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_PRVS_DAYEND_STOCK_QTY(List list) { l_PRVS_DAYEND_STOCK_QTY = list; }
	public void setList_PRVS_MONTHEND_STOCK_QTY(List list) { l_PRVS_MONTHEND_STOCK_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_SUPPLY_KBN_DN(List list) { l_SUPPLY_KBN_DN = list; }
	public void setList_IN_PLANT_CD(List list) { l_IN_PLANT_CD = list; }
	public void setList_IN_WH_CD(List list) { l_IN_WH_CD = list; }
	public void setList_IN_VEND_CD(List list) { l_IN_VEND_CD = list; }
	public void setList_IN_JOB_ODR_CD(List list) { l_IN_JOB_ODR_CD = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }
	public void setList_readPLAN_CD(List list) { l_readPLAN_CD = list; }
	public void setList_IN_PLANT_NAME(List list) { l_IN_PLANT_NAME = list; }
	public void setList_readWH_CD(List list) { l_readWH_CD = list; }
	public void setList_readVEND_CD(List list) { l_readVEND_CD = list; }
	public void setList_IN_WH_NAME(List list) { l_IN_WH_NAME = list; }
	public void setList_IN_VEND_NAME(List list) { l_IN_VEND_NAME = list; }
	public void setList_readITEM_CD(List list) { l_readITEM_CD = list; }
	public void setList_IN_ITEM_NAME(List list) { l_IN_ITEM_NAME = list; }
	public void setList_SUPPLY_KBN(List list) { l_SUPPLY_KBN = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_IN_LOT_NO(List list) { l_IN_LOT_NO = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_DOWNLOAD_FILE.add(((AG0040010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_c1_VIEW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_VIEW_TYP == null) {
			l_c1_VIEW_TYP = new ArrayList();
		} else {
			l_c1_VIEW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_VIEW_TYP.add(((AG0040010Struct) list.get(i)).getc1_VIEW_TYP());
		}
		return size;
	}
	public int setL2L_c2_VIEW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_VIEW_TYP == null) {
			l_c2_VIEW_TYP = new ArrayList();
		} else {
			l_c2_VIEW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_VIEW_TYP.add(((AG0040010Struct) list.get(i)).getc2_VIEW_TYP());
		}
		return size;
	}
	public int setL2L_tempLot(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tempLot == null) {
			l_tempLot = new ArrayList();
		} else {
			l_tempLot.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tempLot.add(((AG0040010Struct) list.get(i)).gettempLot());
		}
		return size;
	}
	public int setL2L_c3_VIEW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_VIEW_TYP == null) {
			l_c3_VIEW_TYP = new ArrayList();
		} else {
			l_c3_VIEW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_VIEW_TYP.add(((AG0040010Struct) list.get(i)).getc3_VIEW_TYP());
		}
		return size;
	}
	public int setL2L_h_lotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotCtrl == null) {
			l_h_lotCtrl = new ArrayList();
		} else {
			l_h_lotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotCtrl.add(((AG0040010Struct) list.get(i)).geth_lotCtrl());
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
			l_PLANT_CD.add(((AG0040010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AG0040010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AG0040010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG == null) {
			l_MRP_FLG = new ArrayList();
		} else {
			l_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG.add(((AG0040010Struct) list.get(i)).getMRP_FLG());
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
			l_VEND_CD.add(((AG0040010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AG0040010Struct) list.get(i)).getVEND_ANAME());
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
			l_ITEM_CD.add(((AG0040010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AG0040010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AG0040010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ON_HAND_QTY == null) {
			l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ON_HAND_QTY.add(((AG0040010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY == null) {
			l_DEFECT_QTY = new ArrayList();
		} else {
			l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY.add(((AG0040010Struct) list.get(i)).getDEFECT_QTY());
		}
		return size;
	}
	public int setL2L_PRVS_DAYEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRVS_DAYEND_STOCK_QTY == null) {
			l_PRVS_DAYEND_STOCK_QTY = new ArrayList();
		} else {
			l_PRVS_DAYEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRVS_DAYEND_STOCK_QTY.add(((AG0040010Struct) list.get(i)).getPRVS_DAYEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_PRVS_MONTHEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRVS_MONTHEND_STOCK_QTY == null) {
			l_PRVS_MONTHEND_STOCK_QTY = new ArrayList();
		} else {
			l_PRVS_MONTHEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRVS_MONTHEND_STOCK_QTY.add(((AG0040010Struct) list.get(i)).getPRVS_MONTHEND_STOCK_QTY());
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
			l_STOCK_UNIT.add(((AG0040010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_SUPPLY_KBN_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLY_KBN_DN == null) {
			l_SUPPLY_KBN_DN = new ArrayList();
		} else {
			l_SUPPLY_KBN_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLY_KBN_DN.add(((AG0040010Struct) list.get(i)).getSUPPLY_KBN_DN());
		}
		return size;
	}
	public int setL2L_IN_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLANT_CD == null) {
			l_IN_PLANT_CD = new ArrayList();
		} else {
			l_IN_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLANT_CD.add(((AG0040010Struct) list.get(i)).getIN_PLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WH_CD == null) {
			l_IN_WH_CD = new ArrayList();
		} else {
			l_IN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WH_CD.add(((AG0040010Struct) list.get(i)).getIN_WH_CD());
		}
		return size;
	}
	public int setL2L_IN_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_VEND_CD == null) {
			l_IN_VEND_CD = new ArrayList();
		} else {
			l_IN_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_VEND_CD.add(((AG0040010Struct) list.get(i)).getIN_VEND_CD());
		}
		return size;
	}
	public int setL2L_IN_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_JOB_ODR_CD == null) {
			l_IN_JOB_ODR_CD = new ArrayList();
		} else {
			l_IN_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_JOB_ODR_CD.add(((AG0040010Struct) list.get(i)).getIN_JOB_ODR_CD());
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
			l_IN_ITEM_CD.add(((AG0040010Struct) list.get(i)).getIN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readPLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPLAN_CD == null) {
			l_readPLAN_CD = new ArrayList();
		} else {
			l_readPLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPLAN_CD.add(((AG0040010Struct) list.get(i)).getreadPLAN_CD());
		}
		return size;
	}
	public int setL2L_IN_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLANT_NAME == null) {
			l_IN_PLANT_NAME = new ArrayList();
		} else {
			l_IN_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLANT_NAME.add(((AG0040010Struct) list.get(i)).getIN_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_readWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readWH_CD == null) {
			l_readWH_CD = new ArrayList();
		} else {
			l_readWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readWH_CD.add(((AG0040010Struct) list.get(i)).getreadWH_CD());
		}
		return size;
	}
	public int setL2L_readVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVEND_CD == null) {
			l_readVEND_CD = new ArrayList();
		} else {
			l_readVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVEND_CD.add(((AG0040010Struct) list.get(i)).getreadVEND_CD());
		}
		return size;
	}
	public int setL2L_IN_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_WH_NAME == null) {
			l_IN_WH_NAME = new ArrayList();
		} else {
			l_IN_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_WH_NAME.add(((AG0040010Struct) list.get(i)).getIN_WH_NAME());
		}
		return size;
	}
	public int setL2L_IN_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_VEND_NAME == null) {
			l_IN_VEND_NAME = new ArrayList();
		} else {
			l_IN_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_VEND_NAME.add(((AG0040010Struct) list.get(i)).getIN_VEND_NAME());
		}
		return size;
	}
	public int setL2L_readITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readITEM_CD == null) {
			l_readITEM_CD = new ArrayList();
		} else {
			l_readITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readITEM_CD.add(((AG0040010Struct) list.get(i)).getreadITEM_CD());
		}
		return size;
	}
	public int setL2L_IN_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_NAME == null) {
			l_IN_ITEM_NAME = new ArrayList();
		} else {
			l_IN_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_NAME.add(((AG0040010Struct) list.get(i)).getIN_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_SUPPLY_KBN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLY_KBN == null) {
			l_SUPPLY_KBN = new ArrayList();
		} else {
			l_SUPPLY_KBN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLY_KBN.add(((AG0040010Struct) list.get(i)).getSUPPLY_KBN());
		}
		return size;
	}
	public int setL2L_l_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOT_NO == null) {
			l_l_LOT_NO = new ArrayList();
		} else {
			l_l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOT_NO.add(((AG0040010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_IN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_LOT_NO == null) {
			l_IN_LOT_NO = new ArrayList();
		} else {
			l_IN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_LOT_NO.add(((AG0040010Struct) list.get(i)).getIN_LOT_NO());
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
			l_l_COUNT.add(((AG0040010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AG0040010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_c1_VIEW_TYP = null;
		m_c2_VIEW_TYP = null;
		m_tempLot = null;
		m_c3_VIEW_TYP = null;
		m_h_lotCtrl = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_MRP_FLG = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_PRVS_DAYEND_STOCK_QTY = null;
		m_PRVS_MONTHEND_STOCK_QTY = null;
		m_STOCK_UNIT = null;
		m_SUPPLY_KBN_DN = null;
		m_IN_PLANT_CD = null;
		m_IN_WH_CD = null;
		m_IN_VEND_CD = null;
		m_IN_JOB_ODR_CD = null;
		m_IN_ITEM_CD = null;
		m_readPLAN_CD = null;
		m_IN_PLANT_NAME = null;
		m_readWH_CD = null;
		m_readVEND_CD = null;
		m_IN_WH_NAME = null;
		m_IN_VEND_NAME = null;
		m_readITEM_CD = null;
		m_IN_ITEM_NAME = null;
		m_SUPPLY_KBN = null;
		m_l_LOT_NO = null;
		m_IN_LOT_NO = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_c1_VIEW_TYP = null;
		l_c2_VIEW_TYP = null;
		l_tempLot = null;
		l_c3_VIEW_TYP = null;
		l_h_lotCtrl = null;
		l_PLANT_CD = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_MRP_FLG = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_STOCK_ON_HAND_QTY = null;
		l_DEFECT_QTY = null;
		l_PRVS_DAYEND_STOCK_QTY = null;
		l_PRVS_MONTHEND_STOCK_QTY = null;
		l_STOCK_UNIT = null;
		l_SUPPLY_KBN_DN = null;
		l_IN_PLANT_CD = null;
		l_IN_WH_CD = null;
		l_IN_VEND_CD = null;
		l_IN_JOB_ODR_CD = null;
		l_IN_ITEM_CD = null;
		l_readPLAN_CD = null;
		l_IN_PLANT_NAME = null;
		l_readWH_CD = null;
		l_readVEND_CD = null;
		l_IN_WH_NAME = null;
		l_IN_VEND_NAME = null;
		l_readITEM_CD = null;
		l_IN_ITEM_NAME = null;
		l_SUPPLY_KBN = null;
		l_l_LOT_NO = null;
		l_IN_LOT_NO = null;
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
	 * medAG0040010�N���X�̕W���R���X�g���N�^
	 */
	public AG0040010Struct()
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
	public void setStruct(AG0040010Struct struct)
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
	public void setStructM(AG0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setc1_VIEW_TYP(struct.getc1_VIEW_TYP());
			this.setc2_VIEW_TYP(struct.getc2_VIEW_TYP());
			this.settempLot(struct.gettempLot());
			this.setc3_VIEW_TYP(struct.getc3_VIEW_TYP());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setPRVS_DAYEND_STOCK_QTY(struct.getPRVS_DAYEND_STOCK_QTY());
			this.setPRVS_MONTHEND_STOCK_QTY(struct.getPRVS_MONTHEND_STOCK_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setSUPPLY_KBN_DN(struct.getSUPPLY_KBN_DN());
			this.setIN_PLANT_CD(struct.getIN_PLANT_CD());
			this.setIN_WH_CD(struct.getIN_WH_CD());
			this.setIN_VEND_CD(struct.getIN_VEND_CD());
			this.setIN_JOB_ODR_CD(struct.getIN_JOB_ODR_CD());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
			this.setreadPLAN_CD(struct.getreadPLAN_CD());
			this.setIN_PLANT_NAME(struct.getIN_PLANT_NAME());
			this.setreadWH_CD(struct.getreadWH_CD());
			this.setreadVEND_CD(struct.getreadVEND_CD());
			this.setIN_WH_NAME(struct.getIN_WH_NAME());
			this.setIN_VEND_NAME(struct.getIN_VEND_NAME());
			this.setreadITEM_CD(struct.getreadITEM_CD());
			this.setIN_ITEM_NAME(struct.getIN_ITEM_NAME());
			this.setSUPPLY_KBN(struct.getSUPPLY_KBN());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setIN_LOT_NO(struct.getIN_LOT_NO());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AG0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_c1_VIEW_TYP(struct.getList_c1_VIEW_TYP());
			this.setList_c2_VIEW_TYP(struct.getList_c2_VIEW_TYP());
			this.setList_tempLot(struct.getList_tempLot());
			this.setList_c3_VIEW_TYP(struct.getList_c3_VIEW_TYP());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_PRVS_DAYEND_STOCK_QTY(struct.getList_PRVS_DAYEND_STOCK_QTY());
			this.setList_PRVS_MONTHEND_STOCK_QTY(struct.getList_PRVS_MONTHEND_STOCK_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_SUPPLY_KBN_DN(struct.getList_SUPPLY_KBN_DN());
			this.setList_IN_PLANT_CD(struct.getList_IN_PLANT_CD());
			this.setList_IN_WH_CD(struct.getList_IN_WH_CD());
			this.setList_IN_VEND_CD(struct.getList_IN_VEND_CD());
			this.setList_IN_JOB_ODR_CD(struct.getList_IN_JOB_ODR_CD());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
			this.setList_readPLAN_CD(struct.getList_readPLAN_CD());
			this.setList_IN_PLANT_NAME(struct.getList_IN_PLANT_NAME());
			this.setList_readWH_CD(struct.getList_readWH_CD());
			this.setList_readVEND_CD(struct.getList_readVEND_CD());
			this.setList_IN_WH_NAME(struct.getList_IN_WH_NAME());
			this.setList_IN_VEND_NAME(struct.getList_IN_VEND_NAME());
			this.setList_readITEM_CD(struct.getList_readITEM_CD());
			this.setList_IN_ITEM_NAME(struct.getList_IN_ITEM_NAME());
			this.setList_SUPPLY_KBN(struct.getList_SUPPLY_KBN());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_IN_LOT_NO(struct.getList_IN_LOT_NO());
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
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_c1_VIEW_TYP


	final static String i_c1_VIEW_TYP = null;

	// �� 3 �ϐ������l�F i_c2_VIEW_TYP


	final static String i_c2_VIEW_TYP = null;

	// �� 4 �ϐ������l�F i_tempLot


	final static String i_tempLot = null;

	// �� 5 �ϐ������l�F i_c3_VIEW_TYP


	final static String i_c3_VIEW_TYP = null;

	// �� 6 �ϐ������l�F i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// �� 7 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 8 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 9 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 10 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

	// �� 11 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 12 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 13 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 14 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 15 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 16 �ϐ������l�F i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// �� 17 �ϐ������l�F i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// �� 18 �ϐ������l�F i_PRVS_DAYEND_STOCK_QTY


	final static String i_PRVS_DAYEND_STOCK_QTY = null;

	// �� 19 �ϐ������l�F i_PRVS_MONTHEND_STOCK_QTY


	final static String i_PRVS_MONTHEND_STOCK_QTY = null;

	// �� 20 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 21 �ϐ������l�F i_SUPPLY_KBN_DN


	final static String i_SUPPLY_KBN_DN = null;

	// �� 22 �ϐ������l�F i_IN_PLANT_CD


	final static String i_IN_PLANT_CD = null;

	// �� 23 �ϐ������l�F i_IN_WH_CD


	final static String i_IN_WH_CD = null;

	// �� 24 �ϐ������l�F i_IN_VEND_CD


	final static String i_IN_VEND_CD = null;

	// �� 25 �ϐ������l�F i_IN_JOB_ODR_CD


	final static String i_IN_JOB_ODR_CD = null;

	// �� 26 �ϐ������l�F i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

	// �� 27 �ϐ������l�F i_readPLAN_CD


	final static String i_readPLAN_CD = null;

	// �� 28 �ϐ������l�F i_IN_PLANT_NAME


	final static String i_IN_PLANT_NAME = null;

	// �� 29 �ϐ������l�F i_readWH_CD


	final static String i_readWH_CD = null;

	// �� 30 �ϐ������l�F i_readVEND_CD


	final static String i_readVEND_CD = null;

	// �� 31 �ϐ������l�F i_IN_WH_NAME


	final static String i_IN_WH_NAME = null;

	// �� 32 �ϐ������l�F i_IN_VEND_NAME


	final static String i_IN_VEND_NAME = null;

	// �� 33 �ϐ������l�F i_readITEM_CD


	final static String i_readITEM_CD = null;

	// �� 34 �ϐ������l�F i_IN_ITEM_NAME


	final static String i_IN_ITEM_NAME = null;

	// �� 35 �ϐ������l�F i_SUPPLY_KBN


	final static String i_SUPPLY_KBN = null;

	// �� 36 �ϐ������l�F i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// �� 37 �ϐ������l�F i_IN_LOT_NO


	final static String i_IN_LOT_NO = null;

	// �� 38 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 39 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_PLANT_CD
	final static String i_PLANT_CD = null;
	// �� 2 �ϐ������l�F i_WH_CD
	final static String i_WH_CD = null;
	// �� 3 �ϐ������l�F i_WH_NAME
	final static String i_WH_NAME = null;
	// �� 4 �ϐ������l�F i_MRP_FLG
	final static String i_MRP_FLG = null;
	// �� 5 �ϐ������l�F i_VEND_CD
	final static String i_VEND_CD = null;
	// �� 6 �ϐ������l�F i_VEND_ANAME
	final static String i_VEND_ANAME = null;
	// �� 7 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 8 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 9 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 10 �ϐ������l�F i_STOCK_ON_HAND_QTY
	final static String i_STOCK_ON_HAND_QTY = null;
	// �� 11 �ϐ������l�F i_DEFECT_QTY
	final static String i_DEFECT_QTY = null;
	// �� 12 �ϐ������l�F i_PRVS_DAYEND_STOCK_QTY
	final static String i_PRVS_DAYEND_STOCK_QTY = null;
	// �� 13 �ϐ������l�F i_PRVS_MONTHEND_STOCK_QTY
	final static String i_PRVS_MONTHEND_STOCK_QTY = null;
	// �� 14 �ϐ������l�F i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// �� 15 �ϐ������l�F i_IN_PLANT_CD
	final static String i_IN_PLANT_CD = null;
	// �� 16 �ϐ������l�F i_IN_WH_CD
	final static String i_IN_WH_CD = null;
	// �� 17 �ϐ������l�F i_IN_VEND_CD
	final static String i_IN_VEND_CD = null;
	// �� 18 �ϐ������l�F i_IN_JOB_ODR_CD
	final static String i_IN_JOB_ODR_CD = null;
	// �� 19 �ϐ������l�F i_IN_ITEM_CD
	final static String i_IN_ITEM_CD = null;
	// �� 20 �ϐ������l�F i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;
	// �� 21 �ϐ������l�F i_c1_VIEW_TYP
	final static String i_c1_VIEW_TYP = null;
	// �� 22 �ϐ������l�F i_c2_VIEW_TYP
	final static String i_c2_VIEW_TYP = null;
	// �� 23 �ϐ������l�F i_IN_PLANT_NAME
	final static String i_IN_PLANT_NAME = null;
	// �� 24 �ϐ������l�F i_IN_WH_NAME
	final static String i_IN_WH_NAME = null;
	// �� 25 �ϐ������l�F i_IN_VEND_NAME
	final static String i_IN_VEND_NAME = null;
	// �� 26 �ϐ������l�F i_IN_ITEM_NAME
	final static String i_IN_ITEM_NAME = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_PLANT_CD = i_PLANT_CD;
		m_WH_CD = i_WH_CD;
		m_WH_NAME = i_WH_NAME;
		m_MRP_FLG = i_MRP_FLG;
		m_VEND_CD = i_VEND_CD;
		m_VEND_ANAME = i_VEND_ANAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_STOCK_ON_HAND_QTY = i_STOCK_ON_HAND_QTY;
		m_DEFECT_QTY = i_DEFECT_QTY;
		m_PRVS_DAYEND_STOCK_QTY = i_PRVS_DAYEND_STOCK_QTY;
		m_PRVS_MONTHEND_STOCK_QTY = i_PRVS_MONTHEND_STOCK_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_IN_PLANT_CD = i_IN_PLANT_CD;
		m_IN_WH_CD = i_IN_WH_CD;
		m_IN_VEND_CD = i_IN_VEND_CD;
		m_IN_JOB_ODR_CD = i_IN_JOB_ODR_CD;
		m_IN_ITEM_CD = i_IN_ITEM_CD;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_c1_VIEW_TYP = i_c1_VIEW_TYP;
		m_c2_VIEW_TYP = i_c2_VIEW_TYP;
		m_IN_PLANT_NAME = i_IN_PLANT_NAME;
		m_IN_WH_NAME = i_IN_WH_NAME;
		m_IN_VEND_NAME = i_IN_VEND_NAME;
		m_IN_ITEM_NAME = i_IN_ITEM_NAME;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
