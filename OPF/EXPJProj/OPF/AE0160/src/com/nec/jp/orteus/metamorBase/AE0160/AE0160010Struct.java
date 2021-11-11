/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160010Struct.java,v $
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
 * テンプレート履歴：
 * EXPJ    (2005/01/19),SRCGEN対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 * EXPJ    (2004/04/01),setStructメソッドの個別メンバのみ版setStructMと、リストメンバのみ版setStructLを追加。
 *                      initializeでのデータセットは、clearを呼んでから行うように修正。
 * EXPJ    (2004/03/31),初期値のコメントアウトのバグを修正。
 * EXPJ    (2004/03/20),レビュー結果を反映。
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 *                      初期生成時に初期値をnullで作成。
 *                      初期化メソッドinitialize、データセットメソッドsetStruct追加。
 *                      コンストラクタのユーザ記述部にinitializeメソッド呼出追加。
 *                      initialize()メソッド、setStruct()メソッド追加。
 * 4.1.0.0 (2003/07/16),setL2L_xxxメソッド追加
 * 4.0.0.1 (2003/06/05),javadocコメントエラー修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.0.0 (2003/03/19),Time,Timestamp型対応
 * 2.1.0.0 (2002/12/17),Logging package修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AE0160;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0160010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.11 $ $Date: 2017/01/09 08:43:57 $
 *
 */
//}}user_implement_code_header

public class AE0160010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FileName */
	public String m_FileName = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_ERRLINE_NO */
	public String m_l_ERRLINE_NO = null;
	/** 第 4 変数： m_l_ERR_MSG */
	public String m_l_ERR_MSG = null;
	/** 第 5 変数： m_ACPT_RSLT_TEMP_CTL_NO */
	public String m_ACPT_RSLT_TEMP_CTL_NO = null;
	/** 第 6 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 7 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 8 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 9 変数： m_ACPT_DATE */
	public String m_ACPT_DATE = null;
	/** 第 10 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 11 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 12 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 13 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 14 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 15 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 16 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 17 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 18 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 19 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 20 変数： m_DLV_CD */
	public String m_DLV_CD = null;
	/** 第 21 変数： m_ACPT_RSLT_COMMENT */
	public String m_ACPT_RSLT_COMMENT = null;
	/** 第 22 変数： m_ACPT_RSLT_COMP */
	public String m_ACPT_RSLT_COMP = null;
	/** 第 23 変数： m_TAKE_DATE */
	public String m_TAKE_DATE = null;
	/** 第 24 変数： m_USER_CD */
	public String m_USER_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_ERRLINE_NO */
	public List l_l_ERRLINE_NO = null;

	/** 第 4 List変数： l_l_ERR_MSG */
	public List l_l_ERR_MSG = null;

	/** 第 5 List変数： l_ACPT_RSLT_TEMP_CTL_NO */
	public List l_ACPT_RSLT_TEMP_CTL_NO = null;

	/** 第 6 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 7 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 8 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 9 List変数： l_ACPT_DATE */
	public List l_ACPT_DATE = null;

	/** 第 10 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 11 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 12 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 13 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 14 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 15 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 16 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 17 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 18 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 19 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 20 List変数： l_DLV_CD */
	public List l_DLV_CD = null;

	/** 第 21 List変数： l_ACPT_RSLT_COMMENT */
	public List l_ACPT_RSLT_COMMENT = null;

	/** 第 22 List変数： l_ACPT_RSLT_COMP */
	public List l_ACPT_RSLT_COMP = null;

	/** 第 23 List変数： l_TAKE_DATE */
	public List l_TAKE_DATE = null;

	/** 第 24 List変数： l_USER_CD */
	public List l_USER_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERRLINE_NO() { return m_l_ERRLINE_NO; }
	public String getl_ERR_MSG() { return m_l_ERR_MSG; }
	public String getACPT_RSLT_TEMP_CTL_NO() { return m_ACPT_RSLT_TEMP_CTL_NO; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getACPT_DATE() { return m_ACPT_DATE; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getACPT_RSLT_COMMENT() { return m_ACPT_RSLT_COMMENT; }
	public String getACPT_RSLT_COMP() { return m_ACPT_RSLT_COMP; }
	public String getTAKE_DATE() { return m_TAKE_DATE; }
	public String getUSER_CD() { return m_USER_CD; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERRLINE_NO() { return l_l_ERRLINE_NO; }
	public List getList_l_ERR_MSG() { return l_l_ERR_MSG; }
	public List getList_ACPT_RSLT_TEMP_CTL_NO() { return l_ACPT_RSLT_TEMP_CTL_NO; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_ACPT_DATE() { return l_ACPT_DATE; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_DLV_CD() { return l_DLV_CD; }
	public List getList_ACPT_RSLT_COMMENT() { return l_ACPT_RSLT_COMMENT; }
	public List getList_ACPT_RSLT_COMP() { return l_ACPT_RSLT_COMP; }
	public List getList_TAKE_DATE() { return l_TAKE_DATE; }
	public List getList_USER_CD() { return l_USER_CD; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERRLINE_NO(String val) { m_l_ERRLINE_NO = val; }
	public void setl_ERR_MSG(String val) { m_l_ERR_MSG = val; }
	public void setACPT_RSLT_TEMP_CTL_NO(String val) { m_ACPT_RSLT_TEMP_CTL_NO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setACPT_DATE(String val) { m_ACPT_DATE = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setDLV_CD(String val) { m_DLV_CD = val; }
	public void setACPT_RSLT_COMMENT(String val) { m_ACPT_RSLT_COMMENT = val; }
	public void setACPT_RSLT_COMP(String val) { m_ACPT_RSLT_COMP = val; }
	public void setTAKE_DATE(String val) { m_TAKE_DATE = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERRLINE_NO(List list) { l_l_ERRLINE_NO = list; }
	public void setList_l_ERR_MSG(List list) { l_l_ERR_MSG = list; }
	public void setList_ACPT_RSLT_TEMP_CTL_NO(List list) { l_ACPT_RSLT_TEMP_CTL_NO = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_ACPT_DATE(List list) { l_ACPT_DATE = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_DLV_CD(List list) { l_DLV_CD = list; }
	public void setList_ACPT_RSLT_COMMENT(List list) { l_ACPT_RSLT_COMMENT = list; }
	public void setList_ACPT_RSLT_COMP(List list) { l_ACPT_RSLT_COMP = list; }
	public void setList_TAKE_DATE(List list) { l_TAKE_DATE = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }

	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AE0160010Struct) list.get(i)).getFileName());
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
			l_DOWNLOAD_FILE.add(((AE0160010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERRLINE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERRLINE_NO == null) {
			l_l_ERRLINE_NO = new ArrayList();
		} else {
			l_l_ERRLINE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERRLINE_NO.add(((AE0160010Struct) list.get(i)).getl_ERRLINE_NO());
		}
		return size;
	}
	public int setL2L_l_ERR_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_MSG == null) {
			l_l_ERR_MSG = new ArrayList();
		} else {
			l_l_ERR_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_MSG.add(((AE0160010Struct) list.get(i)).getl_ERR_MSG());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_TEMP_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_TEMP_CTL_NO == null) {
			l_ACPT_RSLT_TEMP_CTL_NO = new ArrayList();
		} else {
			l_ACPT_RSLT_TEMP_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_TEMP_CTL_NO.add(((AE0160010Struct) list.get(i)).getACPT_RSLT_TEMP_CTL_NO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AE0160010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ITEM_CD.add(((AE0160010Struct) list.get(i)).getITEM_CD());
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
			l_WH_CD.add(((AE0160010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE == null) {
			l_ACPT_DATE = new ArrayList();
		} else {
			l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE.add(((AE0160010Struct) list.get(i)).getACPT_DATE());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AE0160010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AE0160010Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AE0160010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AE0160010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AE0160010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AE0160010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISC_AMOUNT == null) {
			l_DISC_AMOUNT = new ArrayList();
		} else {
			l_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISC_AMOUNT.add(((AE0160010Struct) list.get(i)).getDISC_AMOUNT());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((AE0160010Struct) list.get(i)).getEXCH_RATE());
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
			l_LOT_NO.add(((AE0160010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AE0160010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_CD == null) {
			l_DLV_CD = new ArrayList();
		} else {
			l_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_CD.add(((AE0160010Struct) list.get(i)).getDLV_CD());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_COMMENT == null) {
			l_ACPT_RSLT_COMMENT = new ArrayList();
		} else {
			l_ACPT_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_COMMENT.add(((AE0160010Struct) list.get(i)).getACPT_RSLT_COMMENT());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_COMP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_COMP == null) {
			l_ACPT_RSLT_COMP = new ArrayList();
		} else {
			l_ACPT_RSLT_COMP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_COMP.add(((AE0160010Struct) list.get(i)).getACPT_RSLT_COMP());
		}
		return size;
	}
	public int setL2L_TAKE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAKE_DATE == null) {
			l_TAKE_DATE = new ArrayList();
		} else {
			l_TAKE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAKE_DATE.add(((AE0160010Struct) list.get(i)).getTAKE_DATE());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AE0160010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERRLINE_NO = null;
		m_l_ERR_MSG = null;
		m_ACPT_RSLT_TEMP_CTL_NO = null;
		m_PUCH_ODR_CD = null;
		m_ITEM_CD = null;
		m_WH_CD = null;
		m_ACPT_DATE = null;
		m_ACPT_QTY = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_DISC_AMOUNT = null;
		m_EXCH_RATE = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_DLV_CD = null;
		m_ACPT_RSLT_COMMENT = null;
		m_ACPT_RSLT_COMP = null;
		m_TAKE_DATE = null;
		m_USER_CD = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERRLINE_NO = null;
		l_l_ERR_MSG = null;
		l_ACPT_RSLT_TEMP_CTL_NO = null;
		l_PUCH_ODR_CD = null;
		l_ITEM_CD = null;
		l_WH_CD = null;
		l_ACPT_DATE = null;
		l_ACPT_QTY = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_DISC_AMOUNT = null;
		l_EXCH_RATE = null;
		l_LOT_NO = null;
		l_VEND_LOT_NO = null;
		l_DLV_CD = null;
		l_ACPT_RSLT_COMMENT = null;
		l_ACPT_RSLT_COMP = null;
		l_TAKE_DATE = null;
		l_USER_CD = null;

		return;
	}

	//////////////////////////////
	// Orteus標準Struct
	// ユーザコード
	public String sUser_ID = null;
	// set/getメソッド
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// 組織コード
	public String sOrganization_CD = null;
	// set/getメソッド
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// 処理日付
	public String sSysdate = null;
	// set/getメソッド
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medAE0160010クラスの標準コンストラクタ
	 */
	public AE0160010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: ここに初期処理を記述してください
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * データのセット(個別メンバ・リストメンバ両方)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStruct(AE0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * データのセット(個別メンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructM(AE0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERRLINE_NO(struct.getl_ERRLINE_NO());
			this.setl_ERR_MSG(struct.getl_ERR_MSG());
			this.setACPT_RSLT_TEMP_CTL_NO(struct.getACPT_RSLT_TEMP_CTL_NO());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setACPT_DATE(struct.getACPT_DATE());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setLOT_NO(struct.getLOT_NO());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setDLV_CD(struct.getDLV_CD());
			this.setACPT_RSLT_COMMENT(struct.getACPT_RSLT_COMMENT());
			this.setACPT_RSLT_COMP(struct.getACPT_RSLT_COMP());
			this.setTAKE_DATE(struct.getTAKE_DATE());
			this.setUSER_CD(struct.getUSER_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERRLINE_NO(struct.getList_l_ERRLINE_NO());
			this.setList_l_ERR_MSG(struct.getList_l_ERR_MSG());
			this.setList_ACPT_RSLT_TEMP_CTL_NO(struct.getList_ACPT_RSLT_TEMP_CTL_NO());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_ACPT_DATE(struct.getList_ACPT_DATE());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_DLV_CD(struct.getList_DLV_CD());
			this.setList_ACPT_RSLT_COMMENT(struct.getList_ACPT_RSLT_COMMENT());
			this.setList_ACPT_RSLT_COMP(struct.getList_ACPT_RSLT_COMP());
			this.setList_TAKE_DATE(struct.getList_TAKE_DATE());
			this.setList_USER_CD(struct.getList_USER_CD());
		}
	}

	/**
	 * オブジェクトの文字列表現を返します。
	 * ここでは、getXXXXで取得できるこのクラスの属性値（リストは除く）を返します。
	 * @return オブジェクトの文字列表現
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
	// 初期値定義
	// 以下に初期化に使う定数の参考として再生成のたびに自動的に全メンバーのサンプルをコメントアウトして出力しています。
/*
	// 第 1 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERRLINE_NO


	final static String i_l_ERRLINE_NO = null;

	// 第 4 変数初期値： i_l_ERR_MSG


	final static String i_l_ERR_MSG = null;

	// 第 5 変数初期値： i_ACPT_RSLT_TEMP_CTL_NO


	final static String i_ACPT_RSLT_TEMP_CTL_NO = null;

	// 第 6 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 7 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 8 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 9 変数初期値： i_ACPT_DATE


	final static String i_ACPT_DATE = null;

	// 第 10 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 11 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 12 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 13 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 14 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 15 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 16 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 17 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 18 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 19 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 20 変数初期値： i_DLV_CD


	final static String i_DLV_CD = null;

	// 第 21 変数初期値： i_ACPT_RSLT_COMMENT


	final static String i_ACPT_RSLT_COMMENT = null;

	// 第 22 変数初期値： i_ACPT_RSLT_COMP


	final static String i_ACPT_RSLT_COMP = null;

	// 第 23 変数初期値： i_TAKE_DATE


	final static String i_TAKE_DATE = null;

	// 第 24 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FileName

	final static String i_FileName = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
