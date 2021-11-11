/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0070/src/com/nec/jp/orteus/metamorBase/KU0070/KU0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0070;

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
 * CLASS     : KU0070010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.1 $ $Date: 2014/06/17 06:23:58 $
 *
 */
//}}user_implement_code_header

public class KU0070010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_SELECT_MARK */
	public String m_SELECT_MARK = null;
	/** 第 2 変数： m_w_Flag */
	public String m_w_Flag = null;
	/** 第 3 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 4 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 5 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 6 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 7 変数： m_SHIP_DATE */
	public String m_SHIP_DATE = null;
	/** 第 8 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 9 変数： m_SHIP_ODR_NO */
	public String m_SHIP_ODR_NO = null;
	/** 第 10 変数： m_DLV_KEY_NO */
	public String m_DLV_KEY_NO = null;
	/** 第 11 変数： m_SHIP_QTY */
	public String m_SHIP_QTY = null;
	/** 第 12 変数： m_ALLCT_WH_CD */
	public String m_ALLCT_WH_CD = null;
	/** 第 13 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 14 変数： m_PART_DLV_SEQ_NO */
	public String m_PART_DLV_SEQ_NO = null;
	/** 第 15 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 16 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 17 変数： m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** 第 18 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 19 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 20 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 21 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 22 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 23 変数： m_UNIT */
	public String m_UNIT = null;
	/** 第 24 変数： m_ACTUAL_UNIT_PRICE */
	public String m_ACTUAL_UNIT_PRICE = null;
	/** 第 25 変数： m_SHIP_ODR_AMOUNT */
	public String m_SHIP_ODR_AMOUNT = null;
	/** 第 26 変数： m_IN_CUST_CD */
	public String m_IN_CUST_CD = null;
	/** 第 27 変数： m_IN_DLV_LOC_CD */
	public String m_IN_DLV_LOC_CD = null;
	/** 第 28 変数： m_IN_CHRG_PSN_CD */
	public String m_IN_CHRG_PSN_CD = null;
	/** 第 29 変数： m_FROM_SCDL_SHIP_DATE */
	public String m_FROM_SCDL_SHIP_DATE = null;
	/** 第 30 変数： m_TO_SCDL_SHIP_DATE */
	public String m_TO_SCDL_SHIP_DATE = null;
	/** 第 31 変数： m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** 第 32 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 33 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_SELECT_MARK */
	public List l_SELECT_MARK = null;

	/** 第 2 List変数： l_w_Flag */
	public List l_w_Flag = null;

	/** 第 3 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 4 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 5 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 6 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 7 List変数： l_SHIP_DATE */
	public List l_SHIP_DATE = null;

	/** 第 8 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 9 List変数： l_SHIP_ODR_NO */
	public List l_SHIP_ODR_NO = null;

	/** 第 10 List変数： l_DLV_KEY_NO */
	public List l_DLV_KEY_NO = null;

	/** 第 11 List変数： l_SHIP_QTY */
	public List l_SHIP_QTY = null;

	/** 第 12 List変数： l_ALLCT_WH_CD */
	public List l_ALLCT_WH_CD = null;

	/** 第 13 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 14 List変数： l_PART_DLV_SEQ_NO */
	public List l_PART_DLV_SEQ_NO = null;

	/** 第 15 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 16 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 17 List変数： l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** 第 18 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 19 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 20 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 21 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 22 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 23 List変数： l_UNIT */
	public List l_UNIT = null;

	/** 第 24 List変数： l_ACTUAL_UNIT_PRICE */
	public List l_ACTUAL_UNIT_PRICE = null;

	/** 第 25 List変数： l_SHIP_ODR_AMOUNT */
	public List l_SHIP_ODR_AMOUNT = null;

	/** 第 26 List変数： l_IN_CUST_CD */
	public List l_IN_CUST_CD = null;

	/** 第 27 List変数： l_IN_DLV_LOC_CD */
	public List l_IN_DLV_LOC_CD = null;

	/** 第 28 List変数： l_IN_CHRG_PSN_CD */
	public List l_IN_CHRG_PSN_CD = null;

	/** 第 29 List変数： l_FROM_SCDL_SHIP_DATE */
	public List l_FROM_SCDL_SHIP_DATE = null;

	/** 第 30 List変数： l_TO_SCDL_SHIP_DATE */
	public List l_TO_SCDL_SHIP_DATE = null;

	/** 第 31 List変数： l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** 第 32 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 33 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getSELECT_MARK() { return m_SELECT_MARK; }
	public String getw_Flag() { return m_w_Flag; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getSHIP_DATE() { return m_SHIP_DATE; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getSHIP_ODR_NO() { return m_SHIP_ODR_NO; }
	public String getDLV_KEY_NO() { return m_DLV_KEY_NO; }
	public String getSHIP_QTY() { return m_SHIP_QTY; }
	public String getALLCT_WH_CD() { return m_ALLCT_WH_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getREMARKS() { return m_REMARKS; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getUNIT() { return m_UNIT; }
	public String getACTUAL_UNIT_PRICE() { return m_ACTUAL_UNIT_PRICE; }
	public String getSHIP_ODR_AMOUNT() { return m_SHIP_ODR_AMOUNT; }
	public String getIN_CUST_CD() { return m_IN_CUST_CD; }
	public String getIN_DLV_LOC_CD() { return m_IN_DLV_LOC_CD; }
	public String getIN_CHRG_PSN_CD() { return m_IN_CHRG_PSN_CD; }
	public String getFROM_SCDL_SHIP_DATE() { return m_FROM_SCDL_SHIP_DATE; }
	public String getTO_SCDL_SHIP_DATE() { return m_TO_SCDL_SHIP_DATE; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_SELECT_MARK() { return l_SELECT_MARK; }
	public List getList_w_Flag() { return l_w_Flag; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_SHIP_DATE() { return l_SHIP_DATE; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_SHIP_ODR_NO() { return l_SHIP_ODR_NO; }
	public List getList_DLV_KEY_NO() { return l_DLV_KEY_NO; }
	public List getList_SHIP_QTY() { return l_SHIP_QTY; }
	public List getList_ALLCT_WH_CD() { return l_ALLCT_WH_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_PART_DLV_SEQ_NO() { return l_PART_DLV_SEQ_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_UNIT() { return l_UNIT; }
	public List getList_ACTUAL_UNIT_PRICE() { return l_ACTUAL_UNIT_PRICE; }
	public List getList_SHIP_ODR_AMOUNT() { return l_SHIP_ODR_AMOUNT; }
	public List getList_IN_CUST_CD() { return l_IN_CUST_CD; }
	public List getList_IN_DLV_LOC_CD() { return l_IN_DLV_LOC_CD; }
	public List getList_IN_CHRG_PSN_CD() { return l_IN_CHRG_PSN_CD; }
	public List getList_FROM_SCDL_SHIP_DATE() { return l_FROM_SCDL_SHIP_DATE; }
	public List getList_TO_SCDL_SHIP_DATE() { return l_TO_SCDL_SHIP_DATE; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setSELECT_MARK(String val) { m_SELECT_MARK = val; }
	public void setw_Flag(String val) { m_w_Flag = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setSHIP_DATE(String val) { m_SHIP_DATE = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setSHIP_ODR_NO(String val) { m_SHIP_ODR_NO = val; }
	public void setDLV_KEY_NO(String val) { m_DLV_KEY_NO = val; }
	public void setSHIP_QTY(String val) { m_SHIP_QTY = val; }
	public void setALLCT_WH_CD(String val) { m_ALLCT_WH_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setPART_DLV_SEQ_NO(String val) { m_PART_DLV_SEQ_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setUNIT(String val) { m_UNIT = val; }
	public void setACTUAL_UNIT_PRICE(String val) { m_ACTUAL_UNIT_PRICE = val; }
	public void setSHIP_ODR_AMOUNT(String val) { m_SHIP_ODR_AMOUNT = val; }
	public void setIN_CUST_CD(String val) { m_IN_CUST_CD = val; }
	public void setIN_DLV_LOC_CD(String val) { m_IN_DLV_LOC_CD = val; }
	public void setIN_CHRG_PSN_CD(String val) { m_IN_CHRG_PSN_CD = val; }
	public void setFROM_SCDL_SHIP_DATE(String val) { m_FROM_SCDL_SHIP_DATE = val; }
	public void setTO_SCDL_SHIP_DATE(String val) { m_TO_SCDL_SHIP_DATE = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_SELECT_MARK(List list) { l_SELECT_MARK = list; }
	public void setList_w_Flag(List list) { l_w_Flag = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_SHIP_DATE(List list) { l_SHIP_DATE = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_SHIP_ODR_NO(List list) { l_SHIP_ODR_NO = list; }
	public void setList_DLV_KEY_NO(List list) { l_DLV_KEY_NO = list; }
	public void setList_SHIP_QTY(List list) { l_SHIP_QTY = list; }
	public void setList_ALLCT_WH_CD(List list) { l_ALLCT_WH_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_PART_DLV_SEQ_NO(List list) { l_PART_DLV_SEQ_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_UNIT(List list) { l_UNIT = list; }
	public void setList_ACTUAL_UNIT_PRICE(List list) { l_ACTUAL_UNIT_PRICE = list; }
	public void setList_SHIP_ODR_AMOUNT(List list) { l_SHIP_ODR_AMOUNT = list; }
	public void setList_IN_CUST_CD(List list) { l_IN_CUST_CD = list; }
	public void setList_IN_DLV_LOC_CD(List list) { l_IN_DLV_LOC_CD = list; }
	public void setList_IN_CHRG_PSN_CD(List list) { l_IN_CHRG_PSN_CD = list; }
	public void setList_FROM_SCDL_SHIP_DATE(List list) { l_FROM_SCDL_SHIP_DATE = list; }
	public void setList_TO_SCDL_SHIP_DATE(List list) { l_TO_SCDL_SHIP_DATE = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_SELECT_MARK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SELECT_MARK == null) {
			l_SELECT_MARK = new ArrayList();
		} else {
			l_SELECT_MARK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SELECT_MARK.add(((KU0070010Struct) list.get(i)).getSELECT_MARK());
		}
		return size;
	}
	public int setL2L_w_Flag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_Flag == null) {
			l_w_Flag = new ArrayList();
		} else {
			l_w_Flag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_Flag.add(((KU0070010Struct) list.get(i)).getw_Flag());
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
			l_CUST_CD.add(((KU0070010Struct) list.get(i)).getCUST_CD());
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
			l_ITEM_CD.add(((KU0070010Struct) list.get(i)).getITEM_CD());
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
			l_JOB_ODR_CD.add(((KU0070010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_CD == null) {
			l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_CD.add(((KU0070010Struct) list.get(i)).getCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_DATE == null) {
			l_SHIP_DATE = new ArrayList();
		} else {
			l_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_DATE.add(((KU0070010Struct) list.get(i)).getSHIP_DATE());
		}
		return size;
	}
	public int setL2L_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CD == null) {
			l_SLIP_CD = new ArrayList();
		} else {
			l_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CD.add(((KU0070010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_ODR_NO == null) {
			l_SHIP_ODR_NO = new ArrayList();
		} else {
			l_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_ODR_NO.add(((KU0070010Struct) list.get(i)).getSHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_NO == null) {
			l_DLV_KEY_NO = new ArrayList();
		} else {
			l_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_NO.add(((KU0070010Struct) list.get(i)).getDLV_KEY_NO());
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
			l_SHIP_QTY.add(((KU0070010Struct) list.get(i)).getSHIP_QTY());
		}
		return size;
	}
	public int setL2L_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALLCT_WH_CD == null) {
			l_ALLCT_WH_CD = new ArrayList();
		} else {
			l_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALLCT_WH_CD.add(((KU0070010Struct) list.get(i)).getALLCT_WH_CD());
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
			l_ODR_NO.add(((KU0070010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_DLV_SEQ_NO == null) {
			l_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_DLV_SEQ_NO.add(((KU0070010Struct) list.get(i)).getPART_DLV_SEQ_NO());
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
			l_CUST_ODR_NO.add(((KU0070010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_DLV_LOC_CD.add(((KU0070010Struct) list.get(i)).getDLV_LOC_CD());
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
			l_DEPO_TYP.add(((KU0070010Struct) list.get(i)).getDEPO_TYP());
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
			l_REMARKS.add(((KU0070010Struct) list.get(i)).getREMARKS());
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
			l_CUST_NAME.add(((KU0070010Struct) list.get(i)).getCUST_NAME());
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
			l_ITEM_NAME.add(((KU0070010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_NAME == null) {
			l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_NAME.add(((KU0070010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_WH_NAME.add(((KU0070010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT == null) {
			l_UNIT = new ArrayList();
		} else {
			l_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT.add(((KU0070010Struct) list.get(i)).getUNIT());
		}
		return size;
	}
	public int setL2L_ACTUAL_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACTUAL_UNIT_PRICE == null) {
			l_ACTUAL_UNIT_PRICE = new ArrayList();
		} else {
			l_ACTUAL_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACTUAL_UNIT_PRICE.add(((KU0070010Struct) list.get(i)).getACTUAL_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_ODR_AMOUNT == null) {
			l_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_ODR_AMOUNT.add(((KU0070010Struct) list.get(i)).getSHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_IN_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_CD == null) {
			l_IN_CUST_CD = new ArrayList();
		} else {
			l_IN_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_CD.add(((KU0070010Struct) list.get(i)).getIN_CUST_CD());
		}
		return size;
	}
	public int setL2L_IN_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_DLV_LOC_CD == null) {
			l_IN_DLV_LOC_CD = new ArrayList();
		} else {
			l_IN_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_DLV_LOC_CD.add(((KU0070010Struct) list.get(i)).getIN_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_IN_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CHRG_PSN_CD == null) {
			l_IN_CHRG_PSN_CD = new ArrayList();
		} else {
			l_IN_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CHRG_PSN_CD.add(((KU0070010Struct) list.get(i)).getIN_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_FROM_SCDL_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_SCDL_SHIP_DATE == null) {
			l_FROM_SCDL_SHIP_DATE = new ArrayList();
		} else {
			l_FROM_SCDL_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_SCDL_SHIP_DATE.add(((KU0070010Struct) list.get(i)).getFROM_SCDL_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_TO_SCDL_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_SCDL_SHIP_DATE == null) {
			l_TO_SCDL_SHIP_DATE = new ArrayList();
		} else {
			l_TO_SCDL_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_SCDL_SHIP_DATE.add(((KU0070010Struct) list.get(i)).getTO_SCDL_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_strCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCOMPANY_CD == null) {
			l_strCOMPANY_CD = new ArrayList();
		} else {
			l_strCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCOMPANY_CD.add(((KU0070010Struct) list.get(i)).getstrCOMPANY_CD());
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
			l_l_COUNT.add(((KU0070010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KU0070010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_SELECT_MARK = null;
		m_w_Flag = null;
		m_CUST_CD = null;
		m_ITEM_CD = null;
		m_JOB_ODR_CD = null;
		m_CUST_ITEM_CD = null;
		m_SHIP_DATE = null;
		m_SLIP_CD = null;
		m_SHIP_ODR_NO = null;
		m_DLV_KEY_NO = null;
		m_SHIP_QTY = null;
		m_ALLCT_WH_CD = null;
		m_ODR_NO = null;
		m_PART_DLV_SEQ_NO = null;
		m_CUST_ODR_NO = null;
		m_DLV_LOC_CD = null;
		m_DEPO_TYP = null;
		m_REMARKS = null;
		m_CUST_NAME = null;
		m_ITEM_NAME = null;
		m_CUST_ITEM_NAME = null;
		m_WH_NAME = null;
		m_UNIT = null;
		m_ACTUAL_UNIT_PRICE = null;
		m_SHIP_ODR_AMOUNT = null;
		m_IN_CUST_CD = null;
		m_IN_DLV_LOC_CD = null;
		m_IN_CHRG_PSN_CD = null;
		m_FROM_SCDL_SHIP_DATE = null;
		m_TO_SCDL_SHIP_DATE = null;
		m_strCOMPANY_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_SELECT_MARK = null;
		l_w_Flag = null;
		l_CUST_CD = null;
		l_ITEM_CD = null;
		l_JOB_ODR_CD = null;
		l_CUST_ITEM_CD = null;
		l_SHIP_DATE = null;
		l_SLIP_CD = null;
		l_SHIP_ODR_NO = null;
		l_DLV_KEY_NO = null;
		l_SHIP_QTY = null;
		l_ALLCT_WH_CD = null;
		l_ODR_NO = null;
		l_PART_DLV_SEQ_NO = null;
		l_CUST_ODR_NO = null;
		l_DLV_LOC_CD = null;
		l_DEPO_TYP = null;
		l_REMARKS = null;
		l_CUST_NAME = null;
		l_ITEM_NAME = null;
		l_CUST_ITEM_NAME = null;
		l_WH_NAME = null;
		l_UNIT = null;
		l_ACTUAL_UNIT_PRICE = null;
		l_SHIP_ODR_AMOUNT = null;
		l_IN_CUST_CD = null;
		l_IN_DLV_LOC_CD = null;
		l_IN_CHRG_PSN_CD = null;
		l_FROM_SCDL_SHIP_DATE = null;
		l_TO_SCDL_SHIP_DATE = null;
		l_strCOMPANY_CD = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

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
	 * medKU0070010クラスの標準コンストラクタ
	 */
	public KU0070010Struct()
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
	public void setStruct(KU0070010Struct struct)
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
	public void setStructM(KU0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setSELECT_MARK(struct.getSELECT_MARK());
			this.setw_Flag(struct.getw_Flag());
			this.setCUST_CD(struct.getCUST_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setSHIP_DATE(struct.getSHIP_DATE());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setSHIP_ODR_NO(struct.getSHIP_ODR_NO());
			this.setDLV_KEY_NO(struct.getDLV_KEY_NO());
			this.setSHIP_QTY(struct.getSHIP_QTY());
			this.setALLCT_WH_CD(struct.getALLCT_WH_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setPART_DLV_SEQ_NO(struct.getPART_DLV_SEQ_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setREMARKS(struct.getREMARKS());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setWH_NAME(struct.getWH_NAME());
			this.setUNIT(struct.getUNIT());
			this.setACTUAL_UNIT_PRICE(struct.getACTUAL_UNIT_PRICE());
			this.setSHIP_ODR_AMOUNT(struct.getSHIP_ODR_AMOUNT());
			this.setIN_CUST_CD(struct.getIN_CUST_CD());
			this.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
			this.setIN_CHRG_PSN_CD(struct.getIN_CHRG_PSN_CD());
			this.setFROM_SCDL_SHIP_DATE(struct.getFROM_SCDL_SHIP_DATE());
			this.setTO_SCDL_SHIP_DATE(struct.getTO_SCDL_SHIP_DATE());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KU0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_SELECT_MARK(struct.getList_SELECT_MARK());
			this.setList_w_Flag(struct.getList_w_Flag());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_SHIP_DATE(struct.getList_SHIP_DATE());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_SHIP_ODR_NO(struct.getList_SHIP_ODR_NO());
			this.setList_DLV_KEY_NO(struct.getList_DLV_KEY_NO());
			this.setList_SHIP_QTY(struct.getList_SHIP_QTY());
			this.setList_ALLCT_WH_CD(struct.getList_ALLCT_WH_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_PART_DLV_SEQ_NO(struct.getList_PART_DLV_SEQ_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_UNIT(struct.getList_UNIT());
			this.setList_ACTUAL_UNIT_PRICE(struct.getList_ACTUAL_UNIT_PRICE());
			this.setList_SHIP_ODR_AMOUNT(struct.getList_SHIP_ODR_AMOUNT());
			this.setList_IN_CUST_CD(struct.getList_IN_CUST_CD());
			this.setList_IN_DLV_LOC_CD(struct.getList_IN_DLV_LOC_CD());
			this.setList_IN_CHRG_PSN_CD(struct.getList_IN_CHRG_PSN_CD());
			this.setList_FROM_SCDL_SHIP_DATE(struct.getList_FROM_SCDL_SHIP_DATE());
			this.setList_TO_SCDL_SHIP_DATE(struct.getList_TO_SCDL_SHIP_DATE());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
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
	// 第 1 変数初期値： i_SELECT_MARK


	final static String i_SELECT_MARK = null;

	// 第 2 変数初期値： i_w_Flag


	final static String i_w_Flag = null;

	// 第 3 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 4 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 5 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 6 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 7 変数初期値： i_SHIP_DATE


	final static String i_SHIP_DATE = null;

	// 第 8 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 9 変数初期値： i_SHIP_ODR_NO


	final static String i_SHIP_ODR_NO = null;

	// 第 10 変数初期値： i_DLV_KEY_NO


	final static String i_DLV_KEY_NO = null;

	// 第 11 変数初期値： i_SHIP_QTY


	final static String i_SHIP_QTY = null;

	// 第 12 変数初期値： i_ALLCT_WH_CD


	final static String i_ALLCT_WH_CD = null;

	// 第 13 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 14 変数初期値： i_PART_DLV_SEQ_NO


	final static String i_PART_DLV_SEQ_NO = null;

	// 第 15 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 16 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 17 変数初期値： i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// 第 18 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 19 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 20 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 21 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 22 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 23 変数初期値： i_UNIT


	final static String i_UNIT = null;

	// 第 24 変数初期値： i_ACTUAL_UNIT_PRICE


	final static String i_ACTUAL_UNIT_PRICE = null;

	// 第 25 変数初期値： i_SHIP_ODR_AMOUNT


	final static String i_SHIP_ODR_AMOUNT = null;

	// 第 26 変数初期値： i_IN_CUST_CD


	final static String i_IN_CUST_CD = null;

	// 第 27 変数初期値： i_IN_DLV_LOC_CD


	final static String i_IN_DLV_LOC_CD = null;

	// 第 28 変数初期値： i_IN_CHRG_PSN_CD


	final static String i_IN_CHRG_PSN_CD = null;

	// 第 29 変数初期値： i_FROM_SCDL_SHIP_DATE


	final static String i_FROM_SCDL_SHIP_DATE = null;

	// 第 30 変数初期値： i_TO_SCDL_SHIP_DATE


	final static String i_TO_SCDL_SHIP_DATE = null;

	// 第 31 変数初期値： i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// 第 32 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 33 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_SELECT_MARK

	final static String i_SELECT_MARK = null;

	// 第 2 変数初期値： i_w_Flag

	final static String i_w_Flag = null;

	// 第 3 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 4 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 5 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 6 変数初期値： i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// 第 7 変数初期値： i_SHIP_DATE

	final static String i_SHIP_DATE = null;

	// 第 8 変数初期値： i_SLIP_CD

	final static String i_SLIP_CD = null;

	// 第 9 変数初期値： i_SHIP_ODR_NO

	final static String i_SHIP_ODR_NO = null;

	// 第 10 変数初期値： i_DLV_KEY_NO

	final static String i_DLV_KEY_NO = null;

	// 第 11 変数初期値： i_SHIP_QTY

	final static String i_SHIP_QTY = null;

	// 第 12 変数初期値： i_ALLCT_WH_CD

	final static String i_ALLCT_WH_CD = null;

	// 第 13 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 14 変数初期値： i_PART_DLV_SEQ_NO

	final static String i_PART_DLV_SEQ_NO = null;

	// 第 15 変数初期値： i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// 第 16 変数初期値： i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// 第 17 変数初期値： i_DEPO_TYP

	final static String i_DEPO_TYP = null;

	// 第 18 変数初期値： i_REMARKS

	final static String i_REMARKS = null;

	// 第 19 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 20 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 21 変数初期値： i_CUST_ITEM_NAME

	final static String i_CUST_ITEM_NAME = null;

	// 第 22 変数初期値： i_WH_NAME

	final static String i_WH_NAME = null;

	// 第 23 変数初期値： i_UNIT

	final static String i_UNIT = null;

	// 第 24 変数初期値： i_ACTUAL_UNIT_PRICE

	final static String i_ACTUAL_UNIT_PRICE = null;

	// 第 25 変数初期値： i_SHIP_ODR_AMOUNT

	final static String i_SHIP_ODR_AMOUNT = null;

	// 第 26 変数初期値： i_IN_CUST_CD

	final static String i_IN_CUST_CD = null;

	// 第 27 変数初期値： i_IN_DLV_LOC_CD

	final static String i_IN_DLV_LOC_CD = null;

	// 第 28 変数初期値： i_IN_CHRG_PSN_CD

	final static String i_IN_CHRG_PSN_CD = null;

	// 第 29 変数初期値： i_FROM_SCDL_SHIP_DATE

	final static String i_FROM_SCDL_SHIP_DATE = null;

	// 第 30 変数初期値： i_TO_SCDL_SHIP_DATE

	final static String i_TO_SCDL_SHIP_DATE = null;

	// 第 31 変数初期値： i_strCOMPANY_CD

	final static String i_strCOMPANY_CD = null;

	// 第 32 変数初期値： i_l_COUNT

	final static String i_l_COUNT = null;

	// 第 33 変数初期値： i_ROW_COUNT

	final static String i_ROW_COUNT = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_SELECT_MARK = i_SELECT_MARK;
		m_w_Flag = i_w_Flag;
		m_CUST_CD = i_CUST_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_SHIP_DATE = i_SHIP_DATE;
		m_SLIP_CD = i_SLIP_CD;
		m_SHIP_ODR_NO = i_SHIP_ODR_NO;
		m_DLV_KEY_NO = i_DLV_KEY_NO;
		m_SHIP_QTY = i_SHIP_QTY;
		m_ALLCT_WH_CD = i_ALLCT_WH_CD;
		m_ODR_NO = i_ODR_NO;
		m_PART_DLV_SEQ_NO = i_PART_DLV_SEQ_NO;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_DEPO_TYP = i_DEPO_TYP;
		m_REMARKS = i_REMARKS;
		m_CUST_NAME = i_CUST_NAME;
		m_ITEM_NAME = i_ITEM_NAME;
		m_CUST_ITEM_NAME = i_CUST_ITEM_NAME;
		m_WH_NAME = i_WH_NAME;
		m_UNIT = i_UNIT;
		m_ACTUAL_UNIT_PRICE = i_ACTUAL_UNIT_PRICE;
		m_SHIP_ODR_AMOUNT = i_SHIP_ODR_AMOUNT;
		m_IN_CUST_CD = i_IN_CUST_CD;
		m_IN_DLV_LOC_CD = i_IN_DLV_LOC_CD;
		m_IN_CHRG_PSN_CD = i_IN_CHRG_PSN_CD;
		m_FROM_SCDL_SHIP_DATE = i_FROM_SCDL_SHIP_DATE;
		m_TO_SCDL_SHIP_DATE = i_TO_SCDL_SHIP_DATE;
		m_strCOMPANY_CD = i_strCOMPANY_CD;
		m_l_COUNT = i_l_COUNT;
		m_ROW_COUNT = i_ROW_COUNT;
	}
	
	public void init()
	{

		m_SELECT_MARK = null;
		l_SELECT_MARK = null;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
