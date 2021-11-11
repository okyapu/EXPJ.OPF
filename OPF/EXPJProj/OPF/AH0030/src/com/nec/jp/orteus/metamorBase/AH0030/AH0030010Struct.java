/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0030/src/com/nec/jp/orteus/metamorBase/AH0030/AH0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0030;

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

public class AH0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 2 �ϐ��F m_h_sheet */
	public String m_h_sheet = null;
	/** �� 3 �ϐ��F m_h_stock */
	public String m_h_stock = null;
	/** �� 4 �ϐ��F m_h_wh */
	public String m_h_wh = null;
	/** �� 5 �ϐ��F m_w_INV_status */
	public String m_w_INV_status = null;
	/** �� 6 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 7 �ϐ��F m_r1_sheet1 */
	public String m_r1_sheet1 = null;
	/** �� 8 �ϐ��F m_r2_stock1 */
	public String m_r2_stock1 = null;
	/** �� 9 �ϐ��F m_r1_sheet2 */
	public String m_r1_sheet2 = null;
	/** �� 10 �ϐ��F m_r2_stock2 */
	public String m_r2_stock2 = null;
	/** �� 11 �ϐ��F m_r1_sheet3 */
	public String m_r1_sheet3 = null;
	/** �� 12 �ϐ��F m_r1_sheet4 */
	public String m_r1_sheet4 = null;
	/** �� 13 �ϐ��F m_r3_wh1 */
	public String m_r3_wh1 = null;
	/** �� 14 �ϐ��F m_r3_wh2 */
	public String m_r3_wh2 = null;
	/** �� 15 �ϐ��F m_h_saveINV_DATE */
	public String m_h_saveINV_DATE = null;
	/** �� 16 �ϐ��F m_h_lot */
	public String m_h_lot = null;
	/** �� 17 �ϐ��F m_h_item */
	public String m_h_item = null;
	/** �� 18 �ϐ��F m_r5_item_cd1 */
	public String m_r5_item_cd1 = null;
	/** �� 19 �ϐ��F m_r5_item_cd2 */
	public String m_r5_item_cd2 = null;
	/** �� 20 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 21 �ϐ��F m_r4_lot_no1 */
	public String m_r4_lot_no1 = null;
	/** �� 22 �ϐ��F m_r4_lot_no2 */
	public String m_r4_lot_no2 = null;
	/** �� 23 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 24 �ϐ��F m_h_SYS_LOT_CTRL_FLG */
	public String m_h_SYS_LOT_CTRL_FLG = null;
	/** �� 25 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 26 �ϐ��F m_INV_DATE */
	public String m_INV_DATE = null;
	/** �� 27 �ϐ��F m_REGULAR_INV_FLG */
	public String m_REGULAR_INV_FLG = null;
	/** �� 28 �ϐ��F m_CYCLE_INV_FLG */
	public String m_CYCLE_INV_FLG = null;
	/** �� 29 �ϐ��F m_TEMP_INV_FLG */
	public String m_TEMP_INV_FLG = null;
	/** �� 30 �ϐ��F m_INV_STS_TYP */
	public String m_INV_STS_TYP = null;
	/** �� 31 �ϐ��F m_INV_START_DATE */
	public String m_INV_START_DATE = null;
	/** �� 32 �ϐ��F m_STOCK_SAVE_DATE */
	public String m_STOCK_SAVE_DATE = null;
	/** �� 33 �ϐ��F m_INV_UPDATED_DATE */
	public String m_INV_UPDATED_DATE = null;
	/** �� 34 �ϐ��F m_INV_COMMENT */
	public String m_INV_COMMENT = null;
	/** �� 35 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 2 List�ϐ��F l_h_sheet */
	public List l_h_sheet = null;

	/** �� 3 List�ϐ��F l_h_stock */
	public List l_h_stock = null;

	/** �� 4 List�ϐ��F l_h_wh */
	public List l_h_wh = null;

	/** �� 5 List�ϐ��F l_w_INV_status */
	public List l_w_INV_status = null;

	/** �� 6 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 7 List�ϐ��F l_r1_sheet1 */
	public List l_r1_sheet1 = null;

	/** �� 8 List�ϐ��F l_r2_stock1 */
	public List l_r2_stock1 = null;

	/** �� 9 List�ϐ��F l_r1_sheet2 */
	public List l_r1_sheet2 = null;

	/** �� 10 List�ϐ��F l_r2_stock2 */
	public List l_r2_stock2 = null;

	/** �� 11 List�ϐ��F l_r1_sheet3 */
	public List l_r1_sheet3 = null;

	/** �� 12 List�ϐ��F l_r1_sheet4 */
	public List l_r1_sheet4 = null;

	/** �� 13 List�ϐ��F l_r3_wh1 */
	public List l_r3_wh1 = null;

	/** �� 14 List�ϐ��F l_r3_wh2 */
	public List l_r3_wh2 = null;

	/** �� 15 List�ϐ��F l_h_saveINV_DATE */
	public List l_h_saveINV_DATE = null;

	/** �� 16 List�ϐ��F l_h_lot */
	public List l_h_lot = null;

	/** �� 17 List�ϐ��F l_h_item */
	public List l_h_item = null;

	/** �� 18 List�ϐ��F l_r5_item_cd1 */
	public List l_r5_item_cd1 = null;

	/** �� 19 List�ϐ��F l_r5_item_cd2 */
	public List l_r5_item_cd2 = null;

	/** �� 20 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_r4_lot_no1 */
	public List l_r4_lot_no1 = null;

	/** �� 22 List�ϐ��F l_r4_lot_no2 */
	public List l_r4_lot_no2 = null;

	/** �� 23 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 24 List�ϐ��F l_h_SYS_LOT_CTRL_FLG */
	public List l_h_SYS_LOT_CTRL_FLG = null;

	/** �� 25 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 26 List�ϐ��F l_INV_DATE */
	public List l_INV_DATE = null;

	/** �� 27 List�ϐ��F l_REGULAR_INV_FLG */
	public List l_REGULAR_INV_FLG = null;

	/** �� 28 List�ϐ��F l_CYCLE_INV_FLG */
	public List l_CYCLE_INV_FLG = null;

	/** �� 29 List�ϐ��F l_TEMP_INV_FLG */
	public List l_TEMP_INV_FLG = null;

	/** �� 30 List�ϐ��F l_INV_STS_TYP */
	public List l_INV_STS_TYP = null;

	/** �� 31 List�ϐ��F l_INV_START_DATE */
	public List l_INV_START_DATE = null;

	/** �� 32 List�ϐ��F l_STOCK_SAVE_DATE */
	public List l_STOCK_SAVE_DATE = null;

	/** �� 33 List�ϐ��F l_INV_UPDATED_DATE */
	public List l_INV_UPDATED_DATE = null;

	/** �� 34 List�ϐ��F l_INV_COMMENT */
	public List l_INV_COMMENT = null;

	/** �� 35 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getWH_CD() { return m_WH_CD; }
	public String geth_sheet() { return m_h_sheet; }
	public String geth_stock() { return m_h_stock; }
	public String geth_wh() { return m_h_wh; }
	public String getw_INV_status() { return m_w_INV_status; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getr1_sheet1() { return m_r1_sheet1; }
	public String getr2_stock1() { return m_r2_stock1; }
	public String getr1_sheet2() { return m_r1_sheet2; }
	public String getr2_stock2() { return m_r2_stock2; }
	public String getr1_sheet3() { return m_r1_sheet3; }
	public String getr1_sheet4() { return m_r1_sheet4; }
	public String getr3_wh1() { return m_r3_wh1; }
	public String getr3_wh2() { return m_r3_wh2; }
	public String geth_saveINV_DATE() { return m_h_saveINV_DATE; }
	public String geth_lot() { return m_h_lot; }
	public String geth_item() { return m_h_item; }
	public String getr5_item_cd1() { return m_r5_item_cd1; }
	public String getr5_item_cd2() { return m_r5_item_cd2; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getr4_lot_no1() { return m_r4_lot_no1; }
	public String getr4_lot_no2() { return m_r4_lot_no2; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String geth_SYS_LOT_CTRL_FLG() { return m_h_SYS_LOT_CTRL_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getINV_DATE() { return m_INV_DATE; }
	public String getREGULAR_INV_FLG() { return m_REGULAR_INV_FLG; }
	public String getCYCLE_INV_FLG() { return m_CYCLE_INV_FLG; }
	public String getTEMP_INV_FLG() { return m_TEMP_INV_FLG; }
	public String getINV_STS_TYP() { return m_INV_STS_TYP; }
	public String getINV_START_DATE() { return m_INV_START_DATE; }
	public String getSTOCK_SAVE_DATE() { return m_STOCK_SAVE_DATE; }
	public String getINV_UPDATED_DATE() { return m_INV_UPDATED_DATE; }
	public String getINV_COMMENT() { return m_INV_COMMENT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }

	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_h_sheet() { return l_h_sheet; }
	public List getList_h_stock() { return l_h_stock; }
	public List getList_h_wh() { return l_h_wh; }
	public List getList_w_INV_status() { return l_w_INV_status; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_r1_sheet1() { return l_r1_sheet1; }
	public List getList_r2_stock1() { return l_r2_stock1; }
	public List getList_r1_sheet2() { return l_r1_sheet2; }
	public List getList_r2_stock2() { return l_r2_stock2; }
	public List getList_r1_sheet3() { return l_r1_sheet3; }
	public List getList_r1_sheet4() { return l_r1_sheet4; }
	public List getList_r3_wh1() { return l_r3_wh1; }
	public List getList_r3_wh2() { return l_r3_wh2; }
	public List getList_h_saveINV_DATE() { return l_h_saveINV_DATE; }
	public List getList_h_lot() { return l_h_lot; }
	public List getList_h_item() { return l_h_item; }
	public List getList_r5_item_cd1() { return l_r5_item_cd1; }
	public List getList_r5_item_cd2() { return l_r5_item_cd2; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_r4_lot_no1() { return l_r4_lot_no1; }
	public List getList_r4_lot_no2() { return l_r4_lot_no2; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_h_SYS_LOT_CTRL_FLG() { return l_h_SYS_LOT_CTRL_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_INV_DATE() { return l_INV_DATE; }
	public List getList_REGULAR_INV_FLG() { return l_REGULAR_INV_FLG; }
	public List getList_CYCLE_INV_FLG() { return l_CYCLE_INV_FLG; }
	public List getList_TEMP_INV_FLG() { return l_TEMP_INV_FLG; }
	public List getList_INV_STS_TYP() { return l_INV_STS_TYP; }
	public List getList_INV_START_DATE() { return l_INV_START_DATE; }
	public List getList_STOCK_SAVE_DATE() { return l_STOCK_SAVE_DATE; }
	public List getList_INV_UPDATED_DATE() { return l_INV_UPDATED_DATE; }
	public List getList_INV_COMMENT() { return l_INV_COMMENT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }

	public void setWH_CD(String val) { m_WH_CD = val; }
	public void seth_sheet(String val) { m_h_sheet = val; }
	public void seth_stock(String val) { m_h_stock = val; }
	public void seth_wh(String val) { m_h_wh = val; }
	public void setw_INV_status(String val) { m_w_INV_status = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setr1_sheet1(String val) { m_r1_sheet1 = val; }
	public void setr2_stock1(String val) { m_r2_stock1 = val; }
	public void setr1_sheet2(String val) { m_r1_sheet2 = val; }
	public void setr2_stock2(String val) { m_r2_stock2 = val; }
	public void setr1_sheet3(String val) { m_r1_sheet3 = val; }
	public void setr1_sheet4(String val) { m_r1_sheet4 = val; }
	public void setr3_wh1(String val) { m_r3_wh1 = val; }
	public void setr3_wh2(String val) { m_r3_wh2 = val; }
	public void seth_saveINV_DATE(String val) { m_h_saveINV_DATE = val; }
	public void seth_lot(String val) { m_h_lot = val; }
	public void seth_item(String val) { m_h_item = val; }
	public void setr5_item_cd1(String val) { m_r5_item_cd1 = val; }
	public void setr5_item_cd2(String val) { m_r5_item_cd2 = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setr4_lot_no1(String val) { m_r4_lot_no1 = val; }
	public void setr4_lot_no2(String val) { m_r4_lot_no2 = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void seth_SYS_LOT_CTRL_FLG(String val) { m_h_SYS_LOT_CTRL_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void setREGULAR_INV_FLG(String val) { m_REGULAR_INV_FLG = val; }
	public void setCYCLE_INV_FLG(String val) { m_CYCLE_INV_FLG = val; }
	public void setTEMP_INV_FLG(String val) { m_TEMP_INV_FLG = val; }
	public void setINV_STS_TYP(String val) { m_INV_STS_TYP = val; }
	public void setINV_START_DATE(String val) { m_INV_START_DATE = val; }
	public void setSTOCK_SAVE_DATE(String val) { m_STOCK_SAVE_DATE = val; }
	public void setINV_UPDATED_DATE(String val) { m_INV_UPDATED_DATE = val; }
	public void setINV_COMMENT(String val) { m_INV_COMMENT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }


	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_h_sheet(List list) { l_h_sheet = list; }
	public void setList_h_stock(List list) { l_h_stock = list; }
	public void setList_h_wh(List list) { l_h_wh = list; }
	public void setList_w_INV_status(List list) { l_w_INV_status = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_r1_sheet1(List list) { l_r1_sheet1 = list; }
	public void setList_r2_stock1(List list) { l_r2_stock1 = list; }
	public void setList_r1_sheet2(List list) { l_r1_sheet2 = list; }
	public void setList_r2_stock2(List list) { l_r2_stock2 = list; }
	public void setList_r1_sheet3(List list) { l_r1_sheet3 = list; }
	public void setList_r1_sheet4(List list) { l_r1_sheet4 = list; }
	public void setList_r3_wh1(List list) { l_r3_wh1 = list; }
	public void setList_r3_wh2(List list) { l_r3_wh2 = list; }
	public void setList_h_saveINV_DATE(List list) { l_h_saveINV_DATE = list; }
	public void setList_h_lot(List list) { l_h_lot = list; }
	public void setList_h_item(List list) { l_h_item = list; }
	public void setList_r5_item_cd1(List list) { l_r5_item_cd1 = list; }
	public void setList_r5_item_cd2(List list) { l_r5_item_cd2 = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_r4_lot_no1(List list) { l_r4_lot_no1 = list; }
	public void setList_r4_lot_no2(List list) { l_r4_lot_no2 = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_h_SYS_LOT_CTRL_FLG(List list) { l_h_SYS_LOT_CTRL_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_INV_DATE(List list) { l_INV_DATE = list; }
	public void setList_REGULAR_INV_FLG(List list) { l_REGULAR_INV_FLG = list; }
	public void setList_CYCLE_INV_FLG(List list) { l_CYCLE_INV_FLG = list; }
	public void setList_TEMP_INV_FLG(List list) { l_TEMP_INV_FLG = list; }
	public void setList_INV_STS_TYP(List list) { l_INV_STS_TYP = list; }
	public void setList_INV_START_DATE(List list) { l_INV_START_DATE = list; }
	public void setList_STOCK_SAVE_DATE(List list) { l_STOCK_SAVE_DATE = list; }
	public void setList_INV_UPDATED_DATE(List list) { l_INV_UPDATED_DATE = list; }
	public void setList_INV_COMMENT(List list) { l_INV_COMMENT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }

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
			l_WH_CD.add(((AH0030010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_h_sheet(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_sheet == null) {
			l_h_sheet = new ArrayList();
		} else {
			l_h_sheet.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_sheet.add(((AH0030010Struct) list.get(i)).geth_sheet());
		}
		return size;
	}
	public int setL2L_h_stock(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_stock == null) {
			l_h_stock = new ArrayList();
		} else {
			l_h_stock.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_stock.add(((AH0030010Struct) list.get(i)).geth_stock());
		}
		return size;
	}
	public int setL2L_h_wh(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_wh == null) {
			l_h_wh = new ArrayList();
		} else {
			l_h_wh.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_wh.add(((AH0030010Struct) list.get(i)).geth_wh());
		}
		return size;
	}
	public int setL2L_w_INV_status(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INV_status == null) {
			l_w_INV_status = new ArrayList();
		} else {
			l_w_INV_status.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INV_status.add(((AH0030010Struct) list.get(i)).getw_INV_status());
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
			l_DOWNLOAD_FILE.add(((AH0030010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_r1_sheet1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sheet1 == null) {
			l_r1_sheet1 = new ArrayList();
		} else {
			l_r1_sheet1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sheet1.add(((AH0030010Struct) list.get(i)).getr1_sheet1());
		}
		return size;
	}
	public int setL2L_r2_stock1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_stock1 == null) {
			l_r2_stock1 = new ArrayList();
		} else {
			l_r2_stock1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_stock1.add(((AH0030010Struct) list.get(i)).getr2_stock1());
		}
		return size;
	}
	public int setL2L_r1_sheet2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sheet2 == null) {
			l_r1_sheet2 = new ArrayList();
		} else {
			l_r1_sheet2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sheet2.add(((AH0030010Struct) list.get(i)).getr1_sheet2());
		}
		return size;
	}
	public int setL2L_r2_stock2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_stock2 == null) {
			l_r2_stock2 = new ArrayList();
		} else {
			l_r2_stock2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_stock2.add(((AH0030010Struct) list.get(i)).getr2_stock2());
		}
		return size;
	}
	public int setL2L_r1_sheet3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sheet3 == null) {
			l_r1_sheet3 = new ArrayList();
		} else {
			l_r1_sheet3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sheet3.add(((AH0030010Struct) list.get(i)).getr1_sheet3());
		}
		return size;
	}
	public int setL2L_r1_sheet4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_sheet4 == null) {
			l_r1_sheet4 = new ArrayList();
		} else {
			l_r1_sheet4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_sheet4.add(((AH0030010Struct) list.get(i)).getr1_sheet4());
		}
		return size;
	}
	public int setL2L_r3_wh1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_wh1 == null) {
			l_r3_wh1 = new ArrayList();
		} else {
			l_r3_wh1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_wh1.add(((AH0030010Struct) list.get(i)).getr3_wh1());
		}
		return size;
	}
	public int setL2L_r3_wh2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_wh2 == null) {
			l_r3_wh2 = new ArrayList();
		} else {
			l_r3_wh2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_wh2.add(((AH0030010Struct) list.get(i)).getr3_wh2());
		}
		return size;
	}
	public int setL2L_h_saveINV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_saveINV_DATE == null) {
			l_h_saveINV_DATE = new ArrayList();
		} else {
			l_h_saveINV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_saveINV_DATE.add(((AH0030010Struct) list.get(i)).geth_saveINV_DATE());
		}
		return size;
	}
	public int setL2L_h_lot(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lot == null) {
			l_h_lot = new ArrayList();
		} else {
			l_h_lot.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lot.add(((AH0030010Struct) list.get(i)).geth_lot());
		}
		return size;
	}
	public int setL2L_h_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_item == null) {
			l_h_item = new ArrayList();
		} else {
			l_h_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_item.add(((AH0030010Struct) list.get(i)).geth_item());
		}
		return size;
	}
	public int setL2L_r5_item_cd1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r5_item_cd1 == null) {
			l_r5_item_cd1 = new ArrayList();
		} else {
			l_r5_item_cd1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r5_item_cd1.add(((AH0030010Struct) list.get(i)).getr5_item_cd1());
		}
		return size;
	}
	public int setL2L_r5_item_cd2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r5_item_cd2 == null) {
			l_r5_item_cd2 = new ArrayList();
		} else {
			l_r5_item_cd2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r5_item_cd2.add(((AH0030010Struct) list.get(i)).getr5_item_cd2());
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
			l_ITEM_CD.add(((AH0030010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_r4_lot_no1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r4_lot_no1 == null) {
			l_r4_lot_no1 = new ArrayList();
		} else {
			l_r4_lot_no1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r4_lot_no1.add(((AH0030010Struct) list.get(i)).getr4_lot_no1());
		}
		return size;
	}
	public int setL2L_r4_lot_no2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r4_lot_no2 == null) {
			l_r4_lot_no2 = new ArrayList();
		} else {
			l_r4_lot_no2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r4_lot_no2.add(((AH0030010Struct) list.get(i)).getr4_lot_no2());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AH0030010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_h_SYS_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SYS_LOT_CTRL_FLG == null) {
			l_h_SYS_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_h_SYS_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SYS_LOT_CTRL_FLG.add(((AH0030010Struct) list.get(i)).geth_SYS_LOT_CTRL_FLG());
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
			l_PLANT_CD.add(((AH0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_INV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_DATE == null) {
			l_INV_DATE = new ArrayList();
		} else {
			l_INV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_DATE.add(((AH0030010Struct) list.get(i)).getINV_DATE());
		}
		return size;
	}
	public int setL2L_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REGULAR_INV_FLG == null) {
			l_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REGULAR_INV_FLG.add(((AH0030010Struct) list.get(i)).getREGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CYCLE_INV_FLG == null) {
			l_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CYCLE_INV_FLG.add(((AH0030010Struct) list.get(i)).getCYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_INV_FLG == null) {
			l_TEMP_INV_FLG = new ArrayList();
		} else {
			l_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_INV_FLG.add(((AH0030010Struct) list.get(i)).getTEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_STS_TYP == null) {
			l_INV_STS_TYP = new ArrayList();
		} else {
			l_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_STS_TYP.add(((AH0030010Struct) list.get(i)).getINV_STS_TYP());
		}
		return size;
	}
	public int setL2L_INV_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_START_DATE == null) {
			l_INV_START_DATE = new ArrayList();
		} else {
			l_INV_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_START_DATE.add(((AH0030010Struct) list.get(i)).getINV_START_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_SAVE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_SAVE_DATE == null) {
			l_STOCK_SAVE_DATE = new ArrayList();
		} else {
			l_STOCK_SAVE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_SAVE_DATE.add(((AH0030010Struct) list.get(i)).getSTOCK_SAVE_DATE());
		}
		return size;
	}
	public int setL2L_INV_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_UPDATED_DATE == null) {
			l_INV_UPDATED_DATE = new ArrayList();
		} else {
			l_INV_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_UPDATED_DATE.add(((AH0030010Struct) list.get(i)).getINV_UPDATED_DATE());
		}
		return size;
	}
	public int setL2L_INV_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_COMMENT == null) {
			l_INV_COMMENT = new ArrayList();
		} else {
			l_INV_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_COMMENT.add(((AH0030010Struct) list.get(i)).getINV_COMMENT());
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
			l_MODIFY_COUNT.add(((AH0030010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_WH_CD = null;
		m_h_sheet = null;
		m_h_stock = null;
		m_h_wh = null;
		m_w_INV_status = null;
		m_DOWNLOAD_FILE = null;
		m_r1_sheet1 = null;
		m_r2_stock1 = null;
		m_r1_sheet2 = null;
		m_r2_stock2 = null;
		m_r1_sheet3 = null;
		m_r1_sheet4 = null;
		m_r3_wh1 = null;
		m_r3_wh2 = null;
		m_h_saveINV_DATE = null;
		m_h_lot = null;
		m_h_item = null;
		m_r5_item_cd1 = null;
		m_r5_item_cd2 = null;
		m_ITEM_CD = null;
		m_r4_lot_no1 = null;
		m_r4_lot_no2 = null;
		m_LOT_NO = null;
		m_h_SYS_LOT_CTRL_FLG = null;
		m_PLANT_CD = null;
		m_INV_DATE = null;
		m_REGULAR_INV_FLG = null;
		m_CYCLE_INV_FLG = null;
		m_TEMP_INV_FLG = null;
		m_INV_STS_TYP = null;
		m_INV_START_DATE = null;
		m_STOCK_SAVE_DATE = null;
		m_INV_UPDATED_DATE = null;
		m_INV_COMMENT = null;
		m_MODIFY_COUNT = null;

		l_WH_CD = null;
		l_h_sheet = null;
		l_h_stock = null;
		l_h_wh = null;
		l_w_INV_status = null;
		l_DOWNLOAD_FILE = null;
		l_r1_sheet1 = null;
		l_r2_stock1 = null;
		l_r1_sheet2 = null;
		l_r2_stock2 = null;
		l_r1_sheet3 = null;
		l_r1_sheet4 = null;
		l_r3_wh1 = null;
		l_r3_wh2 = null;
		l_h_saveINV_DATE = null;
		l_h_lot = null;
		l_h_item = null;
		l_r5_item_cd1 = null;
		l_r5_item_cd2 = null;
		l_ITEM_CD = null;
		l_r4_lot_no1 = null;
		l_r4_lot_no2 = null;
		l_LOT_NO = null;
		l_h_SYS_LOT_CTRL_FLG = null;
		l_PLANT_CD = null;
		l_INV_DATE = null;
		l_REGULAR_INV_FLG = null;
		l_CYCLE_INV_FLG = null;
		l_TEMP_INV_FLG = null;
		l_INV_STS_TYP = null;
		l_INV_START_DATE = null;
		l_STOCK_SAVE_DATE = null;
		l_INV_UPDATED_DATE = null;
		l_INV_COMMENT = null;
		l_MODIFY_COUNT = null;

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
	 * medAH0030010�N���X�̕W���R���X�g���N�^
	 */
	public AH0030010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AH0030010Struct struct)
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
	public void setStructM(AH0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setWH_CD(struct.getWH_CD());
			this.seth_sheet(struct.geth_sheet());
			this.seth_stock(struct.geth_stock());
			this.seth_wh(struct.geth_wh());
			this.setw_INV_status(struct.getw_INV_status());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setr1_sheet1(struct.getr1_sheet1());
			this.setr2_stock1(struct.getr2_stock1());
			this.setr1_sheet2(struct.getr1_sheet2());
			this.setr2_stock2(struct.getr2_stock2());
			this.setr1_sheet3(struct.getr1_sheet3());
			this.setr1_sheet4(struct.getr1_sheet4());
			this.setr3_wh1(struct.getr3_wh1());
			this.setr3_wh2(struct.getr3_wh2());
			this.seth_saveINV_DATE(struct.geth_saveINV_DATE());
			this.seth_lot(struct.geth_lot());
			this.seth_item(struct.geth_item());
			this.setr5_item_cd1(struct.getr5_item_cd1());
			this.setr5_item_cd2(struct.getr5_item_cd2());
			this.setITEM_CD(struct.getITEM_CD());
			this.setr4_lot_no1(struct.getr4_lot_no1());
			this.setr4_lot_no2(struct.getr4_lot_no2());
			this.setLOT_NO(struct.getLOT_NO());
			this.seth_SYS_LOT_CTRL_FLG(struct.geth_SYS_LOT_CTRL_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setINV_DATE(struct.getINV_DATE());
			this.setREGULAR_INV_FLG(struct.getREGULAR_INV_FLG());
			this.setCYCLE_INV_FLG(struct.getCYCLE_INV_FLG());
			this.setTEMP_INV_FLG(struct.getTEMP_INV_FLG());
			this.setINV_STS_TYP(struct.getINV_STS_TYP());
			this.setINV_START_DATE(struct.getINV_START_DATE());
			this.setSTOCK_SAVE_DATE(struct.getSTOCK_SAVE_DATE());
			this.setINV_UPDATED_DATE(struct.getINV_UPDATED_DATE());
			this.setINV_COMMENT(struct.getINV_COMMENT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_h_sheet(struct.getList_h_sheet());
			this.setList_h_stock(struct.getList_h_stock());
			this.setList_h_wh(struct.getList_h_wh());
			this.setList_w_INV_status(struct.getList_w_INV_status());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_r1_sheet1(struct.getList_r1_sheet1());
			this.setList_r2_stock1(struct.getList_r2_stock1());
			this.setList_r1_sheet2(struct.getList_r1_sheet2());
			this.setList_r2_stock2(struct.getList_r2_stock2());
			this.setList_r1_sheet3(struct.getList_r1_sheet3());
			this.setList_r1_sheet4(struct.getList_r1_sheet4());
			this.setList_r3_wh1(struct.getList_r3_wh1());
			this.setList_r3_wh2(struct.getList_r3_wh2());
			this.setList_h_saveINV_DATE(struct.getList_h_saveINV_DATE());
			this.setList_h_lot(struct.getList_h_lot());
			this.setList_h_item(struct.getList_h_item());
			this.setList_r5_item_cd1(struct.getList_r5_item_cd1());
			this.setList_r5_item_cd2(struct.getList_r5_item_cd2());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_r4_lot_no1(struct.getList_r4_lot_no1());
			this.setList_r4_lot_no2(struct.getList_r4_lot_no2());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_h_SYS_LOT_CTRL_FLG(struct.getList_h_SYS_LOT_CTRL_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_INV_DATE(struct.getList_INV_DATE());
			this.setList_REGULAR_INV_FLG(struct.getList_REGULAR_INV_FLG());
			this.setList_CYCLE_INV_FLG(struct.getList_CYCLE_INV_FLG());
			this.setList_TEMP_INV_FLG(struct.getList_TEMP_INV_FLG());
			this.setList_INV_STS_TYP(struct.getList_INV_STS_TYP());
			this.setList_INV_START_DATE(struct.getList_INV_START_DATE());
			this.setList_STOCK_SAVE_DATE(struct.getList_STOCK_SAVE_DATE());
			this.setList_INV_UPDATED_DATE(struct.getList_INV_UPDATED_DATE());
			this.setList_INV_COMMENT(struct.getList_INV_COMMENT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
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
	// �� 1 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 2 �ϐ������l�F i_h_sheet


	final static String i_h_sheet = null;

	// �� 3 �ϐ������l�F i_h_stock


	final static String i_h_stock = null;

	// �� 4 �ϐ������l�F i_h_wh


	final static String i_h_wh = null;

	// �� 5 �ϐ������l�F i_w_INV_status


	final static String i_w_INV_status = null;

	// �� 6 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 7 �ϐ������l�F i_r1_sheet1


	final static String i_r1_sheet1 = null;

	// �� 8 �ϐ������l�F i_r2_stock1


	final static String i_r2_stock1 = null;

	// �� 9 �ϐ������l�F i_r1_sheet2


	final static String i_r1_sheet2 = null;

	// �� 10 �ϐ������l�F i_r2_stock2


	final static String i_r2_stock2 = null;

	// �� 11 �ϐ������l�F i_r1_sheet3


	final static String i_r1_sheet3 = null;

	// �� 12 �ϐ������l�F i_r1_sheet4


	final static String i_r1_sheet4 = null;

	// �� 13 �ϐ������l�F i_r3_wh1


	final static String i_r3_wh1 = null;

	// �� 14 �ϐ������l�F i_r3_wh2


	final static String i_r3_wh2 = null;

	// �� 15 �ϐ������l�F i_h_saveINV_DATE


	final static String i_h_saveINV_DATE = null;

	// �� 16 �ϐ������l�F i_h_lot


	final static String i_h_lot = null;

	// �� 17 �ϐ������l�F i_h_item


	final static String i_h_item = null;

	// �� 18 �ϐ������l�F i_r5_item_cd1


	final static String i_r5_item_cd1 = null;

	// �� 19 �ϐ������l�F i_r5_item_cd2


	final static String i_r5_item_cd2 = null;

	// �� 20 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_r4_lot_no1


	final static String i_r4_lot_no1 = null;

	// �� 22 �ϐ������l�F i_r4_lot_no2


	final static String i_r4_lot_no2 = null;

	// �� 23 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 24 �ϐ������l�F i_h_SYS_LOT_CTRL_FLG


	final static String i_h_SYS_LOT_CTRL_FLG = null;

	// �� 25 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 26 �ϐ������l�F i_INV_DATE


	final static String i_INV_DATE = null;

	// �� 27 �ϐ������l�F i_REGULAR_INV_FLG


	final static String i_REGULAR_INV_FLG = null;

	// �� 28 �ϐ������l�F i_CYCLE_INV_FLG


	final static String i_CYCLE_INV_FLG = null;

	// �� 29 �ϐ������l�F i_TEMP_INV_FLG


	final static String i_TEMP_INV_FLG = null;

	// �� 30 �ϐ������l�F i_INV_STS_TYP


	final static String i_INV_STS_TYP = null;

	// �� 31 �ϐ������l�F i_INV_START_DATE


	final static String i_INV_START_DATE = null;

	// �� 32 �ϐ������l�F i_STOCK_SAVE_DATE


	final static String i_STOCK_SAVE_DATE = null;

	// �� 33 �ϐ������l�F i_INV_UPDATED_DATE


	final static String i_INV_UPDATED_DATE = null;

	// �� 34 �ϐ������l�F i_INV_COMMENT


	final static String i_INV_COMMENT = null;

	// �� 35 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        /**
         * �e��ʏ����l�ݒ�
         *
         * @param �Ȃ�
         */
        public void initializeParent()
        {
         clear();
         m_h_sheet = "0";		// ���W�I�����I��l�i���[��ށj
         m_h_stock ="0";			// ���W�I�����I��l�i�݌Ɏ�ށj
         m_h_wh ="0";			// ���W�I�����I��l�i�ۊǋ�w��j
         m_r1_sheet1 = "true";	// ���W�I�����I��l�i���[��ށj
         m_r2_stock1 ="true";	// ���W�I�����I��l�i�݌Ɏ�ށj
         m_r3_wh1 ="true";		// ���W�I�����I��l�i�ۊǋ�w��j
        }
       
        /**
         * �������ϐ��̃R�s�[
         * @param s �R�s�[��
         */
        public void copy(AH0030010Struct s)
        {
         clear();
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
         if(s.m_REGULAR_INV_FLG != null) m_REGULAR_INV_FLG = new String(s.m_REGULAR_INV_FLG);
         if(s.m_CYCLE_INV_FLG != null) m_CYCLE_INV_FLG = new String(s.m_CYCLE_INV_FLG);
         if(s.m_TEMP_INV_FLG != null) m_TEMP_INV_FLG = new String(s.m_TEMP_INV_FLG);
         if(s.m_INV_STS_TYP != null) m_INV_STS_TYP = new String(s.m_INV_STS_TYP);
         if(s.m_INV_START_DATE != null) m_INV_START_DATE = new String(s.m_INV_START_DATE);
         if(s.m_STOCK_SAVE_DATE != null) m_STOCK_SAVE_DATE = new String(s.m_STOCK_SAVE_DATE);
         if(s.m_INV_UPDATED_DATE != null) m_INV_UPDATED_DATE = new String(s.m_INV_UPDATED_DATE);
         if(s.m_INV_COMMENT != null) m_INV_COMMENT = new String(s.m_INV_COMMENT);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
         if(s.m_h_sheet != null) m_h_sheet = new String(s.m_h_sheet);
         if(s.m_h_stock != null) m_h_stock = new String(s.m_h_stock);
         if(s.m_h_wh != null) m_h_wh = new String(s.m_h_wh);
         if(s.m_w_INV_status != null) m_w_INV_status = new String(s.m_w_INV_status);
         if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
         if(s.m_r1_sheet1 != null) m_r1_sheet1 = new String(s.m_r1_sheet1);
         if(s.m_r2_stock1 != null) m_r2_stock1 = new String(s.m_r2_stock1);
         if(s.m_r1_sheet2 != null) m_r1_sheet2 = new String(s.m_r1_sheet2);
         if(s.m_r2_stock2 != null) m_r2_stock2 = new String(s.m_r2_stock2);
         if(s.m_r1_sheet3 != null) m_r1_sheet3 = new String(s.m_r1_sheet3);
         if(s.m_r1_sheet4 != null) m_r1_sheet4 = new String(s.m_r1_sheet4);
         if(s.m_r3_wh1 != null) m_r3_wh1 = new String(s.m_r3_wh1);
         if(s.m_r3_wh2 != null) m_r3_wh2 = new String(s.m_r3_wh2);
         if(s.m_h_saveINV_DATE != null) m_h_saveINV_DATE = new String(s.m_h_saveINV_DATE);
         if(s.m_h_item != null) m_h_item = new String(s.m_h_item);
         if(s.m_h_lot != null) m_h_lot = new String(s.m_h_lot);
         if(s.m_LOT_NO != null) m_LOT_NO = new String(s.m_LOT_NO);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
