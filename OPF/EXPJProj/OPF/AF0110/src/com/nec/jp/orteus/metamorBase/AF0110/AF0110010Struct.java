/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0110/src/com/nec/jp/orteus/metamorBase/AF0110/AF0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0110;

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

public class AF0110010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 2 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 3 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 4 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 5 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 6 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 7 変数： m_WH_TYP */
	public String m_WH_TYP = null;
	/** 第 8 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 9 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 10 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 11 変数： m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** 第 12 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 13 変数： m_RCV_ISSUE_TYP */
	public Integer m_RCV_ISSUE_TYP = null;
	/** 第 14 変数： m_CHANGE_PLAN_QTY */
	public String m_CHANGE_PLAN_QTY = null;
	/** 第 15 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 16 変数： m_RCV_ISSUE_GNR_TYP */
	public Integer m_RCV_ISSUE_GNR_TYP = null;
	/** 第 17 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 18 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 19 変数： m_JOB_COMP_FLG */
	public String m_JOB_COMP_FLG = null;
	/** 第 20 変数： m_WH_TYP_NAME */
	public String m_WH_TYP_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 2 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 3 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 4 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 5 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 6 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 7 List変数： l_WH_TYP */
	public List l_WH_TYP = null;

	/** 第 8 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 9 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 10 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 11 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 12 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 13 List変数： l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** 第 14 List変数： l_CHANGE_PLAN_QTY */
	public List l_CHANGE_PLAN_QTY = null;

	/** 第 15 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 16 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 17 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 18 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 19 List変数： l_JOB_COMP_FLG */
	public List l_JOB_COMP_FLG = null;

	/** 第 20 List変数： l_WH_TYP_NAME */
	public List l_WH_TYP_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getWH_CD() { return m_WH_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getCHANGE_PLAN_QTY() { return m_CHANGE_PLAN_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getJOB_COMP_FLG() { return m_JOB_COMP_FLG; }
	public String getWH_TYP_NAME() { return m_WH_TYP_NAME; }

	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_CHANGE_PLAN_QTY() { return l_CHANGE_PLAN_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_JOB_COMP_FLG() { return l_JOB_COMP_FLG; }
	public List getList_WH_TYP_NAME() { return l_WH_TYP_NAME; }

	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	public void setCHANGE_PLAN_QTY(String val) { m_CHANGE_PLAN_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setJOB_COMP_FLG(String val) { m_JOB_COMP_FLG = val; }
	public void setWH_TYP_NAME(String val) { m_WH_TYP_NAME = val; }

	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = getInteger(val); }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = getInteger(val); }

	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_CHANGE_PLAN_QTY(List list) { l_CHANGE_PLAN_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_JOB_COMP_FLG(List list) { l_JOB_COMP_FLG = list; }
	public void setList_WH_TYP_NAME(List list) { l_WH_TYP_NAME = list; }

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
			l_JOB_ODR_CD.add(((AF0110010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AF0110010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AF0110010Struct) list.get(i)).getITEM_NAME());
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
			l_WH_CD.add(((AF0110010Struct) list.get(i)).getWH_CD());
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
			l_w_PLANT_CD.add(((AF0110010Struct) list.get(i)).getw_PLANT_CD());
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
			l_WH_NAME.add(((AF0110010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP == null) {
			l_WH_TYP = new ArrayList();
		} else {
			l_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP.add(((AF0110010Struct) list.get(i)).getWH_TYP());
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
			l_STOCK_ON_HAND_QTY.add(((AF0110010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DRAW_CD == null) {
			l_DRAW_CD = new ArrayList();
		} else {
			l_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DRAW_CD.add(((AF0110010Struct) list.get(i)).getDRAW_CD());
		}
		return size;
	}
	public int setL2L_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPEC == null) {
			l_SPEC = new ArrayList();
		} else {
			l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPEC.add(((AF0110010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AF0110010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CTRL_CD == null) {
			l_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CTRL_CD.add(((AF0110010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP == null) {
			l_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP.add(((AF0110010Struct) list.get(i)).getRCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_CHANGE_PLAN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHANGE_PLAN_QTY == null) {
			l_CHANGE_PLAN_QTY = new ArrayList();
		} else {
			l_CHANGE_PLAN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHANGE_PLAN_QTY.add(((AF0110010Struct) list.get(i)).getCHANGE_PLAN_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_DATE == null) {
			l_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_DATE.add(((AF0110010Struct) list.get(i)).getRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP == null) {
			l_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP.add(((AF0110010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
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
			l_COMPANY_CD.add(((AF0110010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AF0110010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_JOB_COMP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_COMP_FLG == null) {
			l_JOB_COMP_FLG = new ArrayList();
		} else {
			l_JOB_COMP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_COMP_FLG.add(((AF0110010Struct) list.get(i)).getJOB_COMP_FLG());
		}
		return size;
	}
	public int setL2L_WH_TYP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP_NAME == null) {
			l_WH_TYP_NAME = new ArrayList();
		} else {
			l_WH_TYP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP_NAME.add(((AF0110010Struct) list.get(i)).getWH_TYP_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_WH_CD = null;
		m_w_PLANT_CD = null;
		m_WH_NAME = null;
		m_WH_TYP = null;
		m_STOCK_ON_HAND_QTY = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_UNIT_QTY_TYP = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_CHANGE_PLAN_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_JOB_COMP_FLG = null;
		m_WH_TYP_NAME = null;

		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_WH_CD = null;
		l_w_PLANT_CD = null;
		l_WH_NAME = null;
		l_WH_TYP = null;
		l_STOCK_ON_HAND_QTY = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_UNIT_QTY_TYP = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_CHANGE_PLAN_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_JOB_COMP_FLG = null;
		l_WH_TYP_NAME = null;

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
	 * medAF0110010クラスの標準コンストラクタ
	 */
	public AF0110010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
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
	public void setStruct(AF0110010Struct struct)
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
	public void setStructM(AF0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setWH_CD(struct.getWH_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setWH_TYP(struct.getWH_TYP());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setCHANGE_PLAN_QTY(struct.getCHANGE_PLAN_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setJOB_COMP_FLG(struct.getJOB_COMP_FLG());
			this.setWH_TYP_NAME(struct.getWH_TYP_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AF0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_CHANGE_PLAN_QTY(struct.getList_CHANGE_PLAN_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_JOB_COMP_FLG(struct.getList_JOB_COMP_FLG());
			this.setList_WH_TYP_NAME(struct.getList_WH_TYP_NAME());
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
	// 第 1 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 2 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 3 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 4 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 5 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 6 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 7 変数初期値： i_WH_TYP


	final static String i_WH_TYP = null;

	// 第 8 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 9 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 10 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 11 変数初期値： i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// 第 12 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 13 変数初期値： i_RCV_ISSUE_TYP


	final static Integer i_RCV_ISSUE_TYP = null;

	// 第 14 変数初期値： i_CHANGE_PLAN_QTY


	final static String i_CHANGE_PLAN_QTY = null;

	// 第 15 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 16 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// 第 17 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 18 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 19 変数初期値： i_JOB_COMP_FLG


	final static String i_JOB_COMP_FLG = null;

	// 第 20 変数初期値： i_WH_TYP_NAME


	final static String i_WH_TYP_NAME = null;

*/

	//{{user_implement_code

	// 第 1 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 2 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 3 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 4 変数初期値： i_WH_CD
	final static String i_WH_CD = null;
	// 第 5 変数初期値： i_w_PLANT_CD
	final static String i_w_PLANT_CD = null;
	// 第 6 変数初期値： i_WH_NAME
	final static String i_WH_NAME = null;
	// 第 7 変数初期値： i_WH_TYP
	final static String i_WH_TYP = null;
	// 第 8 変数初期値： i_STOCK_ON_HAND_QTY
	final static String i_STOCK_ON_HAND_QTY = null;
	// 第 9 変数初期値： i_DRAW_CD
	final static String i_DRAW_CD = null;
	// 第 10 変数初期値： i_SPEC
	final static String i_SPEC = null;
	// 第 11 変数初期値： i_UNIT_QTY_TYP
	final static Integer i_UNIT_QTY_TYP = null;
	// 第 12 変数初期値： i_RCV_ISSUE_CTRL_CD
	final static String i_RCV_ISSUE_CTRL_CD = null;
	// 第 13 変数初期値： i_RCV_ISSUE_TYP
	final static Integer i_RCV_ISSUE_TYP = null;
	// 第 14 変数初期値： i_CHANGE_PLAN_QTY
	final static String i_CHANGE_PLAN_QTY = null;
	// 第 15 変数初期値： i_RCV_ISSUE_DATE
	final static String i_RCV_ISSUE_DATE = null;
	// 第 16 変数初期値： i_RCV_ISSUE_GNR_TYP
	final static Integer i_RCV_ISSUE_GNR_TYP = null;
	// 第 17 変数初期値： i_COMPANY_CD
	final static String i_COMPANY_CD = null;
	// 第 18 変数初期値： i_VEND_CD
	final static String i_VEND_CD = null;
	// 第 19 変数初期値： i_JOB_COMP_FLG
	final static String i_JOB_COMP_FLG = null;
	// 第 20 変数初期値： i_WH_TYP_NAME
	final static String i_WH_TYP_NAME = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_WH_CD = i_WH_CD;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_WH_NAME = i_WH_NAME;
		m_WH_TYP = i_WH_TYP;
		m_STOCK_ON_HAND_QTY = i_STOCK_ON_HAND_QTY;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_RCV_ISSUE_CTRL_CD = i_RCV_ISSUE_CTRL_CD;
		m_RCV_ISSUE_TYP = i_RCV_ISSUE_TYP;
		m_CHANGE_PLAN_QTY = i_CHANGE_PLAN_QTY;
		m_RCV_ISSUE_DATE = i_RCV_ISSUE_DATE;
		m_RCV_ISSUE_GNR_TYP = i_RCV_ISSUE_GNR_TYP;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_JOB_COMP_FLG = i_JOB_COMP_FLG;
		m_WH_TYP_NAME = i_WH_TYP_NAME;
	}

	/**
	 * Orteus標準Structのコピー
	 * @param s コピー元
	 */
	public void getDefaultData(AF0110010Struct s)
	{
		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
	}

        //}}user_implement_code

	//////////////////////////////

}
