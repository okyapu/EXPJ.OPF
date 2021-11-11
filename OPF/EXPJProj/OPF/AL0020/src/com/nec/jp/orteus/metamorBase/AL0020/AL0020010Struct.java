/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0020/src/com/nec/jp/orteus/metamorBase/AL0020/AL0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0020;

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
//}}user_implement_code_header

public class AL0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_LOAD_ASSIGN_TYP_name */
	public String m_LOAD_ASSIGN_TYP_name = null;
	/** 第 2 変数： m_LOAD_ASSIGN_TYP_val */
	public String m_LOAD_ASSIGN_TYP_val = null;
	/** 第 3 変数： m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** 第 4 変数： m_h_NECK_PROC_CD */
	public String m_h_NECK_PROC_CD = null;
	/** 第 5 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 6 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 7 変数： m_NECK_PROC_CD */
	public String m_NECK_PROC_CD = null;
	/** 第 8 変数： m_PROC_START_IDLE_DATE */
	public String m_PROC_START_IDLE_DATE = null;
	/** 第 9 変数： m_UNIT_LOAD */
	public String m_UNIT_LOAD = null;
	/** 第 10 変数： m_NECK_PROC_LT */
	public String m_NECK_PROC_LT = null;
	/** 第 11 変数： m_LOAD_ASSIGN_TYP */
	public String m_LOAD_ASSIGN_TYP = null;
	/** 第 12 変数： m_NECK_PROC_NAME */
	public String m_NECK_PROC_NAME = null;
	/** 第 13 変数： m_det_NECK_PROC_CAPA */
	public String m_det_NECK_PROC_CAPA = null;
	/** 第 14 変数： m_det_NECK_PROC_CAPA_UNIT */
	public String m_det_NECK_PROC_CAPA_UNIT = null;
	/** 第 15 変数： m_det_MRP_ODR_TYP */
	public String m_det_MRP_ODR_TYP = null;
	/** 第 16 変数： m_det_OUTSIDE_TYP */
	public String m_det_OUTSIDE_TYP = null;
	/** 第 17 変数： m_det_ODR_LT */
	public String m_det_ODR_LT = null;
	/** 第 18 変数： m_det_FIXED_LT */
	public String m_det_FIXED_LT = null;
	/** 第 19 変数： m_det_SAFETY_LT */
	public String m_det_SAFETY_LT = null;
	/** 第 20 変数： m_det_ISSUE_LT */
	public String m_det_ISSUE_LT = null;
	/** 第 21 変数： m_PROC_CD */
	public String m_PROC_CD = null;
	/** 第 22 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 23 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 24 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 25 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 26 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 27 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 28 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 29 変数： m_CNT */
	public String m_CNT = null;
	/** 第 30 変数： m_CNT_ITEM_CD */
	public String m_CNT_ITEM_CD = null;
	/** 第 31 変数： m_CNT_NECK_PROC_CD */
	public String m_CNT_NECK_PROC_CD = null;
	/** 第 32 変数： m_check_T_LOAD_CD */
	public String m_check_T_LOAD_CD = null;
	/** 第 33 変数： m_check_SIM_LOAD_CD */
	public String m_check_SIM_LOAD_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_LOAD_ASSIGN_TYP_name */
	public List l_LOAD_ASSIGN_TYP_name = null;

	/** 第 2 List変数： l_LOAD_ASSIGN_TYP_val */
	public List l_LOAD_ASSIGN_TYP_val = null;

	/** 第 3 List変数： l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** 第 4 List変数： l_h_NECK_PROC_CD */
	public List l_h_NECK_PROC_CD = null;

	/** 第 5 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 6 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 7 List変数： l_NECK_PROC_CD */
	public List l_NECK_PROC_CD = null;

	/** 第 8 List変数： l_PROC_START_IDLE_DATE */
	public List l_PROC_START_IDLE_DATE = null;

	/** 第 9 List変数： l_UNIT_LOAD */
	public List l_UNIT_LOAD = null;

	/** 第 10 List変数： l_NECK_PROC_LT */
	public List l_NECK_PROC_LT = null;

	/** 第 11 List変数： l_LOAD_ASSIGN_TYP */
	public List l_LOAD_ASSIGN_TYP = null;

	/** 第 12 List変数： l_NECK_PROC_NAME */
	public List l_NECK_PROC_NAME = null;

	/** 第 13 List変数： l_det_NECK_PROC_CAPA */
	public List l_det_NECK_PROC_CAPA = null;

	/** 第 14 List変数： l_det_NECK_PROC_CAPA_UNIT */
	public List l_det_NECK_PROC_CAPA_UNIT = null;

	/** 第 15 List変数： l_det_MRP_ODR_TYP */
	public List l_det_MRP_ODR_TYP = null;

	/** 第 16 List変数： l_det_OUTSIDE_TYP */
	public List l_det_OUTSIDE_TYP = null;

	/** 第 17 List変数： l_det_ODR_LT */
	public List l_det_ODR_LT = null;

	/** 第 18 List変数： l_det_FIXED_LT */
	public List l_det_FIXED_LT = null;

	/** 第 19 List変数： l_det_SAFETY_LT */
	public List l_det_SAFETY_LT = null;

	/** 第 20 List変数： l_det_ISSUE_LT */
	public List l_det_ISSUE_LT = null;

	/** 第 21 List変数： l_PROC_CD */
	public List l_PROC_CD = null;

	/** 第 22 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 23 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 24 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 25 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 26 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 27 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 28 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 29 List変数： l_CNT */
	public List l_CNT = null;

	/** 第 30 List変数： l_CNT_ITEM_CD */
	public List l_CNT_ITEM_CD = null;

	/** 第 31 List変数： l_CNT_NECK_PROC_CD */
	public List l_CNT_NECK_PROC_CD = null;

	/** 第 32 List変数： l_check_T_LOAD_CD */
	public List l_check_T_LOAD_CD = null;

	/** 第 33 List変数： l_check_SIM_LOAD_CD */
	public List l_check_SIM_LOAD_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getLOAD_ASSIGN_TYP_name() { return m_LOAD_ASSIGN_TYP_name; }
	public String getLOAD_ASSIGN_TYP_val() { return m_LOAD_ASSIGN_TYP_val; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String geth_NECK_PROC_CD() { return m_h_NECK_PROC_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getNECK_PROC_CD() { return m_NECK_PROC_CD; }
	public String getPROC_START_IDLE_DATE() { return m_PROC_START_IDLE_DATE; }
	public String getUNIT_LOAD() { return m_UNIT_LOAD; }
	public String getNECK_PROC_LT() { return m_NECK_PROC_LT; }
	public String getLOAD_ASSIGN_TYP() { return m_LOAD_ASSIGN_TYP; }
	public String getNECK_PROC_NAME() { return m_NECK_PROC_NAME; }
	public String getdet_NECK_PROC_CAPA() { return m_det_NECK_PROC_CAPA; }
	public String getdet_NECK_PROC_CAPA_UNIT() { return m_det_NECK_PROC_CAPA_UNIT; }
	public String getdet_MRP_ODR_TYP() { return m_det_MRP_ODR_TYP; }
	public String getdet_OUTSIDE_TYP() { return m_det_OUTSIDE_TYP; }
	public String getdet_ODR_LT() { return m_det_ODR_LT; }
	public String getdet_FIXED_LT() { return m_det_FIXED_LT; }
	public String getdet_SAFETY_LT() { return m_det_SAFETY_LT; }
	public String getdet_ISSUE_LT() { return m_det_ISSUE_LT; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getCNT() { return m_CNT; }
	public String getCNT_ITEM_CD() { return m_CNT_ITEM_CD; }
	public String getCNT_NECK_PROC_CD() { return m_CNT_NECK_PROC_CD; }
	public String getcheck_T_LOAD_CD() { return m_check_T_LOAD_CD; }
	public String getcheck_SIM_LOAD_CD() { return m_check_SIM_LOAD_CD; }

	public List getList_LOAD_ASSIGN_TYP_name() { return l_LOAD_ASSIGN_TYP_name; }
	public List getList_LOAD_ASSIGN_TYP_val() { return l_LOAD_ASSIGN_TYP_val; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_h_NECK_PROC_CD() { return l_h_NECK_PROC_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_NECK_PROC_CD() { return l_NECK_PROC_CD; }
	public List getList_PROC_START_IDLE_DATE() { return l_PROC_START_IDLE_DATE; }
	public List getList_UNIT_LOAD() { return l_UNIT_LOAD; }
	public List getList_NECK_PROC_LT() { return l_NECK_PROC_LT; }
	public List getList_LOAD_ASSIGN_TYP() { return l_LOAD_ASSIGN_TYP; }
	public List getList_NECK_PROC_NAME() { return l_NECK_PROC_NAME; }
	public List getList_det_NECK_PROC_CAPA() { return l_det_NECK_PROC_CAPA; }
	public List getList_det_NECK_PROC_CAPA_UNIT() { return l_det_NECK_PROC_CAPA_UNIT; }
	public List getList_det_MRP_ODR_TYP() { return l_det_MRP_ODR_TYP; }
	public List getList_det_OUTSIDE_TYP() { return l_det_OUTSIDE_TYP; }
	public List getList_det_ODR_LT() { return l_det_ODR_LT; }
	public List getList_det_FIXED_LT() { return l_det_FIXED_LT; }
	public List getList_det_SAFETY_LT() { return l_det_SAFETY_LT; }
	public List getList_det_ISSUE_LT() { return l_det_ISSUE_LT; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_CNT() { return l_CNT; }
	public List getList_CNT_ITEM_CD() { return l_CNT_ITEM_CD; }
	public List getList_CNT_NECK_PROC_CD() { return l_CNT_NECK_PROC_CD; }
	public List getList_check_T_LOAD_CD() { return l_check_T_LOAD_CD; }
	public List getList_check_SIM_LOAD_CD() { return l_check_SIM_LOAD_CD; }

	public void setLOAD_ASSIGN_TYP_name(String val) { m_LOAD_ASSIGN_TYP_name = val; }
	public void setLOAD_ASSIGN_TYP_val(String val) { m_LOAD_ASSIGN_TYP_val = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void seth_NECK_PROC_CD(String val) { m_h_NECK_PROC_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setNECK_PROC_CD(String val) { m_NECK_PROC_CD = val; }
	public void setPROC_START_IDLE_DATE(String val) { m_PROC_START_IDLE_DATE = val; }
	public void setUNIT_LOAD(String val) { m_UNIT_LOAD = val; }
	public void setNECK_PROC_LT(String val) { m_NECK_PROC_LT = val; }
	public void setLOAD_ASSIGN_TYP(String val) { m_LOAD_ASSIGN_TYP = val; }
	public void setNECK_PROC_NAME(String val) { m_NECK_PROC_NAME = val; }
	public void setdet_NECK_PROC_CAPA(String val) { m_det_NECK_PROC_CAPA = val; }
	public void setdet_NECK_PROC_CAPA_UNIT(String val) { m_det_NECK_PROC_CAPA_UNIT = val; }
	public void setdet_MRP_ODR_TYP(String val) { m_det_MRP_ODR_TYP = val; }
	public void setdet_OUTSIDE_TYP(String val) { m_det_OUTSIDE_TYP = val; }
	public void setdet_ODR_LT(String val) { m_det_ODR_LT = val; }
	public void setdet_FIXED_LT(String val) { m_det_FIXED_LT = val; }
	public void setdet_SAFETY_LT(String val) { m_det_SAFETY_LT = val; }
	public void setdet_ISSUE_LT(String val) { m_det_ISSUE_LT = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setCNT(String val) { m_CNT = val; }
	public void setCNT_ITEM_CD(String val) { m_CNT_ITEM_CD = val; }
	public void setCNT_NECK_PROC_CD(String val) { m_CNT_NECK_PROC_CD = val; }
	public void setcheck_T_LOAD_CD(String val) { m_check_T_LOAD_CD = val; }
	public void setcheck_SIM_LOAD_CD(String val) { m_check_SIM_LOAD_CD = val; }


	public void setList_LOAD_ASSIGN_TYP_name(List list) { l_LOAD_ASSIGN_TYP_name = list; }
	public void setList_LOAD_ASSIGN_TYP_val(List list) { l_LOAD_ASSIGN_TYP_val = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_h_NECK_PROC_CD(List list) { l_h_NECK_PROC_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_NECK_PROC_CD(List list) { l_NECK_PROC_CD = list; }
	public void setList_PROC_START_IDLE_DATE(List list) { l_PROC_START_IDLE_DATE = list; }
	public void setList_UNIT_LOAD(List list) { l_UNIT_LOAD = list; }
	public void setList_NECK_PROC_LT(List list) { l_NECK_PROC_LT = list; }
	public void setList_LOAD_ASSIGN_TYP(List list) { l_LOAD_ASSIGN_TYP = list; }
	public void setList_NECK_PROC_NAME(List list) { l_NECK_PROC_NAME = list; }
	public void setList_det_NECK_PROC_CAPA(List list) { l_det_NECK_PROC_CAPA = list; }
	public void setList_det_NECK_PROC_CAPA_UNIT(List list) { l_det_NECK_PROC_CAPA_UNIT = list; }
	public void setList_det_MRP_ODR_TYP(List list) { l_det_MRP_ODR_TYP = list; }
	public void setList_det_OUTSIDE_TYP(List list) { l_det_OUTSIDE_TYP = list; }
	public void setList_det_ODR_LT(List list) { l_det_ODR_LT = list; }
	public void setList_det_FIXED_LT(List list) { l_det_FIXED_LT = list; }
	public void setList_det_SAFETY_LT(List list) { l_det_SAFETY_LT = list; }
	public void setList_det_ISSUE_LT(List list) { l_det_ISSUE_LT = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_CNT(List list) { l_CNT = list; }
	public void setList_CNT_ITEM_CD(List list) { l_CNT_ITEM_CD = list; }
	public void setList_CNT_NECK_PROC_CD(List list) { l_CNT_NECK_PROC_CD = list; }
	public void setList_check_T_LOAD_CD(List list) { l_check_T_LOAD_CD = list; }
	public void setList_check_SIM_LOAD_CD(List list) { l_check_SIM_LOAD_CD = list; }

	public int setL2L_LOAD_ASSIGN_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP_name == null) {
			l_LOAD_ASSIGN_TYP_name = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP_name.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP_name());
		}
		return size;
	}
	public int setL2L_LOAD_ASSIGN_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP_val == null) {
			l_LOAD_ASSIGN_TYP_val = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP_val.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP_val());
		}
		return size;
	}
	public int setL2L_h_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CD == null) {
			l_h_ITEM_CD = new ArrayList();
		} else {
			l_h_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CD.add(((AL0020010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NECK_PROC_CD == null) {
			l_h_NECK_PROC_CD = new ArrayList();
		} else {
			l_h_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).geth_NECK_PROC_CD());
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
			l_ITEM_CD.add(((AL0020010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AL0020010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CD == null) {
			l_NECK_PROC_CD = new ArrayList();
		} else {
			l_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).getNECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_START_IDLE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_START_IDLE_DATE == null) {
			l_PROC_START_IDLE_DATE = new ArrayList();
		} else {
			l_PROC_START_IDLE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_START_IDLE_DATE.add(((AL0020010Struct) list.get(i)).getPROC_START_IDLE_DATE());
		}
		return size;
	}
	public int setL2L_UNIT_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_LOAD == null) {
			l_UNIT_LOAD = new ArrayList();
		} else {
			l_UNIT_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_LOAD.add(((AL0020010Struct) list.get(i)).getUNIT_LOAD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_LT == null) {
			l_NECK_PROC_LT = new ArrayList();
		} else {
			l_NECK_PROC_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_LT.add(((AL0020010Struct) list.get(i)).getNECK_PROC_LT());
		}
		return size;
	}
	public int setL2L_LOAD_ASSIGN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP == null) {
			l_LOAD_ASSIGN_TYP = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP());
		}
		return size;
	}
	public int setL2L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_NAME == null) {
			l_NECK_PROC_NAME = new ArrayList();
		} else {
			l_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_NAME.add(((AL0020010Struct) list.get(i)).getNECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_det_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_NECK_PROC_CAPA == null) {
			l_det_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_det_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_NECK_PROC_CAPA.add(((AL0020010Struct) list.get(i)).getdet_NECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_det_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_NECK_PROC_CAPA_UNIT == null) {
			l_det_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_det_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_NECK_PROC_CAPA_UNIT.add(((AL0020010Struct) list.get(i)).getdet_NECK_PROC_CAPA_UNIT());
		}
		return size;
	}
	public int setL2L_det_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_MRP_ODR_TYP == null) {
			l_det_MRP_ODR_TYP = new ArrayList();
		} else {
			l_det_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_MRP_ODR_TYP.add(((AL0020010Struct) list.get(i)).getdet_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_det_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_OUTSIDE_TYP == null) {
			l_det_OUTSIDE_TYP = new ArrayList();
		} else {
			l_det_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_OUTSIDE_TYP.add(((AL0020010Struct) list.get(i)).getdet_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_det_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_ODR_LT == null) {
			l_det_ODR_LT = new ArrayList();
		} else {
			l_det_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_ODR_LT.add(((AL0020010Struct) list.get(i)).getdet_ODR_LT());
		}
		return size;
	}
	public int setL2L_det_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_FIXED_LT == null) {
			l_det_FIXED_LT = new ArrayList();
		} else {
			l_det_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_FIXED_LT.add(((AL0020010Struct) list.get(i)).getdet_FIXED_LT());
		}
		return size;
	}
	public int setL2L_det_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_SAFETY_LT == null) {
			l_det_SAFETY_LT = new ArrayList();
		} else {
			l_det_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_SAFETY_LT.add(((AL0020010Struct) list.get(i)).getdet_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_det_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_ISSUE_LT == null) {
			l_det_ISSUE_LT = new ArrayList();
		} else {
			l_det_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_ISSUE_LT.add(((AL0020010Struct) list.get(i)).getdet_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_CD == null) {
			l_PROC_CD = new ArrayList();
		} else {
			l_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_CD.add(((AL0020010Struct) list.get(i)).getPROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NAME == null) {
			l_PROC_NAME = new ArrayList();
		} else {
			l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NAME.add(((AL0020010Struct) list.get(i)).getPROC_NAME());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AL0020010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((AL0020010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AL0020010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AL0020010Struct) list.get(i)).getSAFETY_LT());
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
			l_h_MODIFY_COUNT.add(((AL0020010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((AL0020010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT == null) {
			l_CNT = new ArrayList();
		} else {
			l_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT.add(((AL0020010Struct) list.get(i)).getCNT());
		}
		return size;
	}
	public int setL2L_CNT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT_ITEM_CD == null) {
			l_CNT_ITEM_CD = new ArrayList();
		} else {
			l_CNT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT_ITEM_CD.add(((AL0020010Struct) list.get(i)).getCNT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_CNT_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT_NECK_PROC_CD == null) {
			l_CNT_NECK_PROC_CD = new ArrayList();
		} else {
			l_CNT_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).getCNT_NECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_check_T_LOAD_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_check_T_LOAD_CD == null) {
			l_check_T_LOAD_CD = new ArrayList();
		} else {
			l_check_T_LOAD_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_check_T_LOAD_CD.add(((AL0020010Struct) list.get(i)).getcheck_T_LOAD_CD());
		}
		return size;
	}
	public int setL2L_check_SIM_LOAD_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_check_SIM_LOAD_CD == null) {
			l_check_SIM_LOAD_CD = new ArrayList();
		} else {
			l_check_SIM_LOAD_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_check_SIM_LOAD_CD.add(((AL0020010Struct) list.get(i)).getcheck_SIM_LOAD_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_LOAD_ASSIGN_TYP_name = null;
		m_LOAD_ASSIGN_TYP_val = null;
		m_h_ITEM_CD = null;
		m_h_NECK_PROC_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_NECK_PROC_CD = null;
		m_PROC_START_IDLE_DATE = null;
		m_UNIT_LOAD = null;
		m_NECK_PROC_LT = null;
		m_LOAD_ASSIGN_TYP = null;
		m_NECK_PROC_NAME = null;
		m_det_NECK_PROC_CAPA = null;
		m_det_NECK_PROC_CAPA_UNIT = null;
		m_det_MRP_ODR_TYP = null;
		m_det_OUTSIDE_TYP = null;
		m_det_ODR_LT = null;
		m_det_FIXED_LT = null;
		m_det_SAFETY_LT = null;
		m_det_ISSUE_LT = null;
		m_PROC_CD = null;
		m_PROC_NAME = null;
		m_WS_CD = null;
		m_OUTSIDE_TYP = null;
		m_FIXED_LT = null;
		m_SAFETY_LT = null;
		m_h_MODIFY_COUNT = null;
		m_h_PLANT_CD = null;
		m_CNT = null;
		m_CNT_ITEM_CD = null;
		m_CNT_NECK_PROC_CD = null;
		m_check_T_LOAD_CD = null;
		m_check_SIM_LOAD_CD = null;

		l_LOAD_ASSIGN_TYP_name = null;
		l_LOAD_ASSIGN_TYP_val = null;
		l_h_ITEM_CD = null;
		l_h_NECK_PROC_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_NECK_PROC_CD = null;
		l_PROC_START_IDLE_DATE = null;
		l_UNIT_LOAD = null;
		l_NECK_PROC_LT = null;
		l_LOAD_ASSIGN_TYP = null;
		l_NECK_PROC_NAME = null;
		l_det_NECK_PROC_CAPA = null;
		l_det_NECK_PROC_CAPA_UNIT = null;
		l_det_MRP_ODR_TYP = null;
		l_det_OUTSIDE_TYP = null;
		l_det_ODR_LT = null;
		l_det_FIXED_LT = null;
		l_det_SAFETY_LT = null;
		l_det_ISSUE_LT = null;
		l_PROC_CD = null;
		l_PROC_NAME = null;
		l_WS_CD = null;
		l_OUTSIDE_TYP = null;
		l_FIXED_LT = null;
		l_SAFETY_LT = null;
		l_h_MODIFY_COUNT = null;
		l_h_PLANT_CD = null;
		l_CNT = null;
		l_CNT_ITEM_CD = null;
		l_CNT_NECK_PROC_CD = null;
		l_check_T_LOAD_CD = null;
		l_check_SIM_LOAD_CD = null;

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
	 * medAL0020010クラスの標準コンストラクタ
	 */
	public AL0020010Struct()
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
	public void setStruct(AL0020010Struct struct)
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
	public void setStructM(AL0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setLOAD_ASSIGN_TYP_name(struct.getLOAD_ASSIGN_TYP_name());
			this.setLOAD_ASSIGN_TYP_val(struct.getLOAD_ASSIGN_TYP_val());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.seth_NECK_PROC_CD(struct.geth_NECK_PROC_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setNECK_PROC_CD(struct.getNECK_PROC_CD());
			this.setPROC_START_IDLE_DATE(struct.getPROC_START_IDLE_DATE());
			this.setUNIT_LOAD(struct.getUNIT_LOAD());
			this.setNECK_PROC_LT(struct.getNECK_PROC_LT());
			this.setLOAD_ASSIGN_TYP(struct.getLOAD_ASSIGN_TYP());
			this.setNECK_PROC_NAME(struct.getNECK_PROC_NAME());
			this.setdet_NECK_PROC_CAPA(struct.getdet_NECK_PROC_CAPA());
			this.setdet_NECK_PROC_CAPA_UNIT(struct.getdet_NECK_PROC_CAPA_UNIT());
			this.setdet_MRP_ODR_TYP(struct.getdet_MRP_ODR_TYP());
			this.setdet_OUTSIDE_TYP(struct.getdet_OUTSIDE_TYP());
			this.setdet_ODR_LT(struct.getdet_ODR_LT());
			this.setdet_FIXED_LT(struct.getdet_FIXED_LT());
			this.setdet_SAFETY_LT(struct.getdet_SAFETY_LT());
			this.setdet_ISSUE_LT(struct.getdet_ISSUE_LT());
			this.setPROC_CD(struct.getPROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setCNT(struct.getCNT());
			this.setCNT_ITEM_CD(struct.getCNT_ITEM_CD());
			this.setCNT_NECK_PROC_CD(struct.getCNT_NECK_PROC_CD());
			this.setcheck_T_LOAD_CD(struct.getcheck_T_LOAD_CD());
			this.setcheck_SIM_LOAD_CD(struct.getcheck_SIM_LOAD_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AL0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_LOAD_ASSIGN_TYP_name(struct.getList_LOAD_ASSIGN_TYP_name());
			this.setList_LOAD_ASSIGN_TYP_val(struct.getList_LOAD_ASSIGN_TYP_val());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_h_NECK_PROC_CD(struct.getList_h_NECK_PROC_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_NECK_PROC_CD(struct.getList_NECK_PROC_CD());
			this.setList_PROC_START_IDLE_DATE(struct.getList_PROC_START_IDLE_DATE());
			this.setList_UNIT_LOAD(struct.getList_UNIT_LOAD());
			this.setList_NECK_PROC_LT(struct.getList_NECK_PROC_LT());
			this.setList_LOAD_ASSIGN_TYP(struct.getList_LOAD_ASSIGN_TYP());
			this.setList_NECK_PROC_NAME(struct.getList_NECK_PROC_NAME());
			this.setList_det_NECK_PROC_CAPA(struct.getList_det_NECK_PROC_CAPA());
			this.setList_det_NECK_PROC_CAPA_UNIT(struct.getList_det_NECK_PROC_CAPA_UNIT());
			this.setList_det_MRP_ODR_TYP(struct.getList_det_MRP_ODR_TYP());
			this.setList_det_OUTSIDE_TYP(struct.getList_det_OUTSIDE_TYP());
			this.setList_det_ODR_LT(struct.getList_det_ODR_LT());
			this.setList_det_FIXED_LT(struct.getList_det_FIXED_LT());
			this.setList_det_SAFETY_LT(struct.getList_det_SAFETY_LT());
			this.setList_det_ISSUE_LT(struct.getList_det_ISSUE_LT());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_CNT(struct.getList_CNT());
			this.setList_CNT_ITEM_CD(struct.getList_CNT_ITEM_CD());
			this.setList_CNT_NECK_PROC_CD(struct.getList_CNT_NECK_PROC_CD());
			this.setList_check_T_LOAD_CD(struct.getList_check_T_LOAD_CD());
			this.setList_check_SIM_LOAD_CD(struct.getList_check_SIM_LOAD_CD());
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
	// 第 1 変数初期値： i_LOAD_ASSIGN_TYP_name


	final static String i_LOAD_ASSIGN_TYP_name = null;

	// 第 2 変数初期値： i_LOAD_ASSIGN_TYP_val


	final static String i_LOAD_ASSIGN_TYP_val = null;

	// 第 3 変数初期値： i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// 第 4 変数初期値： i_h_NECK_PROC_CD


	final static String i_h_NECK_PROC_CD = null;

	// 第 5 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 6 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 7 変数初期値： i_NECK_PROC_CD


	final static String i_NECK_PROC_CD = null;

	// 第 8 変数初期値： i_PROC_START_IDLE_DATE


	final static String i_PROC_START_IDLE_DATE = null;

	// 第 9 変数初期値： i_UNIT_LOAD


	final static String i_UNIT_LOAD = null;

	// 第 10 変数初期値： i_NECK_PROC_LT


	final static String i_NECK_PROC_LT = null;

	// 第 11 変数初期値： i_LOAD_ASSIGN_TYP


	final static String i_LOAD_ASSIGN_TYP = null;

	// 第 12 変数初期値： i_NECK_PROC_NAME


	final static String i_NECK_PROC_NAME = null;

	// 第 13 変数初期値： i_det_NECK_PROC_CAPA


	final static String i_det_NECK_PROC_CAPA = null;

	// 第 14 変数初期値： i_det_NECK_PROC_CAPA_UNIT


	final static String i_det_NECK_PROC_CAPA_UNIT = null;

	// 第 15 変数初期値： i_det_MRP_ODR_TYP


	final static String i_det_MRP_ODR_TYP = null;

	// 第 16 変数初期値： i_det_OUTSIDE_TYP


	final static String i_det_OUTSIDE_TYP = null;

	// 第 17 変数初期値： i_det_ODR_LT


	final static String i_det_ODR_LT = null;

	// 第 18 変数初期値： i_det_FIXED_LT


	final static String i_det_FIXED_LT = null;

	// 第 19 変数初期値： i_det_SAFETY_LT


	final static String i_det_SAFETY_LT = null;

	// 第 20 変数初期値： i_det_ISSUE_LT


	final static String i_det_ISSUE_LT = null;

	// 第 21 変数初期値： i_PROC_CD


	final static String i_PROC_CD = null;

	// 第 22 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 23 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 24 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 25 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 26 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 27 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 28 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 29 変数初期値： i_CNT


	final static String i_CNT = null;

	// 第 30 変数初期値： i_CNT_ITEM_CD


	final static String i_CNT_ITEM_CD = null;

	// 第 31 変数初期値： i_CNT_NECK_PROC_CD


	final static String i_CNT_NECK_PROC_CD = null;

	// 第 32 変数初期値： i_check_T_LOAD_CD


	final static String i_check_T_LOAD_CD = null;

	// 第 33 変数初期値： i_check_SIM_LOAD_CD


	final static String i_check_SIM_LOAD_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_ITEM_CD
         final static String i_ITEM_CD = null;
        // 第 2 変数初期値： i_ITEM_NAME
         final static String i_ITEM_NAME = null;
        // 第 3 変数初期値： i_NECK_PROC_CD
         final static String i_NECK_PROC_CD = null;
        // 第 4 変数初期値： i_PROC_START_IDLE_DATE
         final static String i_PROC_START_IDLE_DATE = null;
        // 第 5 変数初期値： i_UNIT_LOAD
         final static String i_UNIT_LOAD = "0";
        // 第 6 変数初期値： i_NECK_PROC_LT
         final static String i_NECK_PROC_LT = "0";
        // 第 7 変数初期値： i_LOAD_ASSIGN_TYP
         final static String i_LOAD_ASSIGN_TYP = null;
        // 第 8 変数初期値： i_NECK_PROC_NAME
         final static String i_NECK_PROC_NAME = null;
        // 第 9 変数初期値： i_det_NECK_PROC_CAPA
         final static String i_det_NECK_PROC_CAPA = "0.0";
        // 第 10 変数初期値： i_det_NECK_PROC_CAPA_UNIT
         final static String i_det_NECK_PROC_CAPA_UNIT = null;
        // 第 11 変数初期値： i_det_MRP_ODR_TYP
         final static String i_det_MRP_ODR_TYP = null;
        // 第 12 変数初期値： i_det_OUTSIDE_TYP
         final static String i_det_OUTSIDE_TYP = null;
        // 第 13 変数初期値： i_det_ODR_LT
         final static String i_det_ODR_LT = "0";
        // 第 14 変数初期値： i_det_FIXED_LT
         final static String i_det_FIXED_LT = "0";
        // 第 15 変数初期値： i_det_SAFETY_LT
         final static String i_det_SAFETY_LT = "0";
        // 第 16 変数初期値： i_det_ISSUE_LT
         final static String i_det_ISSUE_LT = "0";
        // 第 17 変数初期値： i_PROC_CD
         final static String i_PROC_CD = null;
        // 第 18 変数初期値： i_PROC_NAME
         final static String i_PROC_NAME = null;
        // 第 19 変数初期値： i_WS_CD
         final static String i_WS_CD = null;
        // 第 20 変数初期値： i_OUTSIDE_TYP
         final static String i_OUTSIDE_TYP = null;
        // 第 21 変数初期値： i_FIXED_LT
         final static String i_FIXED_LT = "0";
        // 第 22 変数初期値： i_SAFETY_LT
         final static String i_SAFETY_LT = "0";
        // 第 23 変数初期値： i_h_MODIFY_COUNT
         final static String i_h_MODIFY_COUNT = null;
        // 第 24 変数初期値： i_h_PLANT_CD
         final static String i_h_PLANT_CD = null;
        // 第 25 変数初期値： i_CNT
         final static String i_CNT = null;
        // 第 26 変数初期値： i_CNT_ITEM_CD
         final static String i_CNT_ITEM_CD = null;
        // 第 27 変数初期値： i_CNT_NECK_PROC_CD
         final static String i_CNT_NECK_PROC_CD = null;
        // 第 28 変数初期値： i_check_T_LOAD_CD
         final static String i_check_T_LOAD_CD = null;
        // 第 29 変数初期値： i_check_SIM_LOAD_CD
         final static String i_check_SIM_LOAD_CD = null;
        // 第 30 変数初期値： i_LOAD_ASSIGN_TYP_name
         final static String i_LOAD_ASSIGN_TYP_name = null;
        // 第 31 変数初期値： i_LOAD_ASSIGN_TYP_val
         final static String i_LOAD_ASSIGN_TYP_val = null;
        // 第 32 変数初期値： i_h_ITEM_CD
        final static String i_h_ITEM_CD = null;
        // 第 33 変数初期値： i_h_NECK_PROC_CD
        final static String i_h_NECK_PROC_CD = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
         m_ITEM_CD = i_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_NECK_PROC_CD = i_NECK_PROC_CD;
         m_PROC_START_IDLE_DATE = i_PROC_START_IDLE_DATE;
         m_UNIT_LOAD = i_UNIT_LOAD;
         m_NECK_PROC_LT = i_NECK_PROC_LT;
         m_LOAD_ASSIGN_TYP = i_LOAD_ASSIGN_TYP;
         m_NECK_PROC_NAME = i_NECK_PROC_NAME;
         m_det_NECK_PROC_CAPA = i_det_NECK_PROC_CAPA;
         m_det_NECK_PROC_CAPA_UNIT = i_det_NECK_PROC_CAPA_UNIT;
         m_det_MRP_ODR_TYP = i_det_MRP_ODR_TYP;
         m_det_OUTSIDE_TYP = i_det_OUTSIDE_TYP;
         m_det_ODR_LT = i_det_ODR_LT;
         m_det_FIXED_LT = i_det_FIXED_LT;
         m_det_SAFETY_LT = i_det_SAFETY_LT;
         m_det_ISSUE_LT = i_det_ISSUE_LT;
         m_PROC_CD = i_PROC_CD;
         m_PROC_NAME = i_PROC_NAME;
         m_WS_CD = i_WS_CD;
         m_OUTSIDE_TYP = i_OUTSIDE_TYP;
         m_FIXED_LT = i_FIXED_LT;
         m_SAFETY_LT = i_SAFETY_LT;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_CNT = i_CNT;
         m_CNT_ITEM_CD = i_CNT_ITEM_CD;
         m_CNT_NECK_PROC_CD = i_CNT_NECK_PROC_CD;
         m_check_T_LOAD_CD = i_check_T_LOAD_CD;
         m_check_SIM_LOAD_CD = i_check_SIM_LOAD_CD;
            m_h_ITEM_CD = i_h_ITEM_CD;
         m_h_NECK_PROC_CD = i_h_NECK_PROC_CD;
       
         l_ITEM_CD = null;
         l_ITEM_NAME = null;
         l_NECK_PROC_CD = null;
         l_PROC_START_IDLE_DATE = null;
         l_UNIT_LOAD = null;
         l_NECK_PROC_LT = null;
         l_LOAD_ASSIGN_TYP = null;
         l_NECK_PROC_NAME = null;
         l_det_NECK_PROC_CAPA = null;
         l_det_NECK_PROC_CAPA_UNIT = null;
         l_det_MRP_ODR_TYP = null;
         l_det_OUTSIDE_TYP = null;
         l_det_ODR_LT = null;
         l_det_FIXED_LT = null;
         l_det_SAFETY_LT = null;
         l_det_ISSUE_LT = null;
         l_PROC_CD = null;
         l_PROC_NAME = null;
         l_WS_CD = null;
         l_OUTSIDE_TYP = null;
         l_FIXED_LT = null;
         l_SAFETY_LT = null;
         l_h_MODIFY_COUNT = null;
         l_h_PLANT_CD = null;
         l_CNT = null;
         l_CNT_ITEM_CD = null;
         l_CNT_NECK_PROC_CD = null;
         l_check_T_LOAD_CD = null;
         l_check_SIM_LOAD_CD = null;
         l_h_ITEM_CD = null;
         l_h_NECK_PROC_CD = null;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
