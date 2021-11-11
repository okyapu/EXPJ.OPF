/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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

public class AE0090030Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 3 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 4 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 5 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 6 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 7 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 8 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 9 変数： m_ODR_POINT */
	public String m_ODR_POINT = null;
	/** 第 10 変数： m_FIXED_ODR_QTY */
	public String m_FIXED_ODR_QTY = null;
	/** 第 11 変数： m_ODR_LT */
	public String m_ODR_LT = null;
	/** 第 12 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 13 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 14 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 15 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 16 変数： m_SUM_STOCK_ON_HAND_QTY */
	public String m_SUM_STOCK_ON_HAND_QTY = null;
	/** 第 17 変数： m_SUM_ODR_QTY */
	public String m_SUM_ODR_QTY = null;
	/** 第 18 変数： m_SUM_TOTAL_RCV_QTY */
	public String m_SUM_TOTAL_RCV_QTY = null;
	/** 第 19 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 20 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 3 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 4 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 5 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 6 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 7 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 8 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 9 List変数： l_ODR_POINT */
	public List l_ODR_POINT = null;

	/** 第 10 List変数： l_FIXED_ODR_QTY */
	public List l_FIXED_ODR_QTY = null;

	/** 第 11 List変数： l_ODR_LT */
	public List l_ODR_LT = null;

	/** 第 12 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 13 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 14 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 15 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 16 List変数： l_SUM_STOCK_ON_HAND_QTY */
	public List l_SUM_STOCK_ON_HAND_QTY = null;

	/** 第 17 List変数： l_SUM_ODR_QTY */
	public List l_SUM_ODR_QTY = null;

	/** 第 18 List変数： l_SUM_TOTAL_RCV_QTY */
	public List l_SUM_TOTAL_RCV_QTY = null;

	/** 第 19 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 20 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getODR_POINT() { return m_ODR_POINT; }
	public String getFIXED_ODR_QTY() { return m_FIXED_ODR_QTY; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getSUM_STOCK_ON_HAND_QTY() { return m_SUM_STOCK_ON_HAND_QTY; }
	public String getSUM_ODR_QTY() { return m_SUM_ODR_QTY; }
	public String getSUM_TOTAL_RCV_QTY() { return m_SUM_TOTAL_RCV_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ODR_POINT() { return l_ODR_POINT; }
	public List getList_FIXED_ODR_QTY() { return l_FIXED_ODR_QTY; }
	public List getList_ODR_LT() { return l_ODR_LT; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_SUM_STOCK_ON_HAND_QTY() { return l_SUM_STOCK_ON_HAND_QTY; }
	public List getList_SUM_ODR_QTY() { return l_SUM_ODR_QTY; }
	public List getList_SUM_TOTAL_RCV_QTY() { return l_SUM_TOTAL_RCV_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setODR_POINT(String val) { m_ODR_POINT = val; }
	public void setFIXED_ODR_QTY(String val) { m_FIXED_ODR_QTY = val; }
	public void setODR_LT(String val) { m_ODR_LT = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setSUM_STOCK_ON_HAND_QTY(String val) { m_SUM_STOCK_ON_HAND_QTY = val; }
	public void setSUM_ODR_QTY(String val) { m_SUM_ODR_QTY = val; }
	public void setSUM_TOTAL_RCV_QTY(String val) { m_SUM_TOTAL_RCV_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ODR_POINT(List list) { l_ODR_POINT = list; }
	public void setList_FIXED_ODR_QTY(List list) { l_FIXED_ODR_QTY = list; }
	public void setList_ODR_LT(List list) { l_ODR_LT = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_SUM_STOCK_ON_HAND_QTY(List list) { l_SUM_STOCK_ON_HAND_QTY = list; }
	public void setList_SUM_ODR_QTY(List list) { l_SUM_ODR_QTY = list; }
	public void setList_SUM_TOTAL_RCV_QTY(List list) { l_SUM_TOTAL_RCV_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }

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
			l_DOWNLOAD_FILE.add(((AE0090030Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_ITEM_CD.add(((AE0090030Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0090030Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((AE0090030Struct) list.get(i)).getPLANT_NAME());
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
			l_DRAW_CD.add(((AE0090030Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AE0090030Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AE0090030Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AE0090030Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_ODR_POINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_POINT == null) {
			l_ODR_POINT = new ArrayList();
		} else {
			l_ODR_POINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_POINT.add(((AE0090030Struct) list.get(i)).getODR_POINT());
		}
		return size;
	}
	public int setL2L_FIXED_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_ODR_QTY == null) {
			l_FIXED_ODR_QTY = new ArrayList();
		} else {
			l_FIXED_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_ODR_QTY.add(((AE0090030Struct) list.get(i)).getFIXED_ODR_QTY());
		}
		return size;
	}
	public int setL2L_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_LT == null) {
			l_ODR_LT = new ArrayList();
		} else {
			l_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_LT.add(((AE0090030Struct) list.get(i)).getODR_LT());
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
			l_FIXED_LT.add(((AE0090030Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AE0090030Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AE0090030Struct) list.get(i)).getPROP_LOT_SIZE());
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
			l_SAFETY_LT.add(((AE0090030Struct) list.get(i)).getSAFETY_LT());
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
			l_SUM_STOCK_ON_HAND_QTY.add(((AE0090030Struct) list.get(i)).getSUM_STOCK_ON_HAND_QTY());
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
			l_SUM_ODR_QTY.add(((AE0090030Struct) list.get(i)).getSUM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TOTAL_RCV_QTY == null) {
			l_SUM_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_SUM_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TOTAL_RCV_QTY.add(((AE0090030Struct) list.get(i)).getSUM_TOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_OPR_DATE == null) {
			l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_OPR_DATE.add(((AE0090030Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((AE0090030Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_PLANT_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ODR_POINT = null;
		m_FIXED_ODR_QTY = null;
		m_ODR_LT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_PROP_LOT_SIZE = null;
		m_SAFETY_LT = null;
		m_SUM_STOCK_ON_HAND_QTY = null;
		m_SUM_ODR_QTY = null;
		m_SUM_TOTAL_RCV_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;

		l_DOWNLOAD_FILE = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_PLANT_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_ODR_POINT = null;
		l_FIXED_ODR_QTY = null;
		l_ODR_LT = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_PROP_LOT_SIZE = null;
		l_SAFETY_LT = null;
		l_SUM_STOCK_ON_HAND_QTY = null;
		l_SUM_ODR_QTY = null;
		l_SUM_TOTAL_RCV_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;

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
	 * medAE0090030クラスの標準コンストラクタ
	 */
	public AE0090030Struct()
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
	public void setStruct(AE0090030Struct struct)
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
	public void setStructM(AE0090030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setODR_POINT(struct.getODR_POINT());
			this.setFIXED_ODR_QTY(struct.getFIXED_ODR_QTY());
			this.setODR_LT(struct.getODR_LT());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setSUM_STOCK_ON_HAND_QTY(struct.getSUM_STOCK_ON_HAND_QTY());
			this.setSUM_ODR_QTY(struct.getSUM_ODR_QTY());
			this.setSUM_TOTAL_RCV_QTY(struct.getSUM_TOTAL_RCV_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0090030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ODR_POINT(struct.getList_ODR_POINT());
			this.setList_FIXED_ODR_QTY(struct.getList_FIXED_ODR_QTY());
			this.setList_ODR_LT(struct.getList_ODR_LT());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_SUM_STOCK_ON_HAND_QTY(struct.getList_SUM_STOCK_ON_HAND_QTY());
			this.setList_SUM_ODR_QTY(struct.getList_SUM_ODR_QTY());
			this.setList_SUM_TOTAL_RCV_QTY(struct.getList_SUM_TOTAL_RCV_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
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
	// 第 1 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 3 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 4 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 5 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 6 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 7 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 8 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 9 変数初期値： i_ODR_POINT


	final static String i_ODR_POINT = null;

	// 第 10 変数初期値： i_FIXED_ODR_QTY


	final static String i_FIXED_ODR_QTY = null;

	// 第 11 変数初期値： i_ODR_LT


	final static String i_ODR_LT = null;

	// 第 12 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 13 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 14 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 15 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 16 変数初期値： i_SUM_STOCK_ON_HAND_QTY


	final static String i_SUM_STOCK_ON_HAND_QTY = null;

	// 第 17 変数初期値： i_SUM_ODR_QTY


	final static String i_SUM_ODR_QTY = null;

	// 第 18 変数初期値： i_SUM_TOTAL_RCV_QTY


	final static String i_SUM_TOTAL_RCV_QTY = null;

	// 第 19 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 20 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 2 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 3 変数初期値： i_PLANT_NAME
	final static String i_PLANT_NAME = null;
	// 第 4 変数初期値： i_DRAW_CD
	final static String i_DRAW_CD = null;
	// 第 5 変数初期値： i_SPEC
	final static String i_SPEC = null;
	// 第 6 変数初期値： i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;
	// 第 7 変数初期値： i_MRP_ODR_TYP_DN
	final static String i_MRP_ODR_TYP_DN = null;
	// 第 8 変数初期値： i_OUTSIDE_TYP
	final static String i_OUTSIDE_TYP = null;
	// 第 9 変数初期値： i_OUTSIDE_TYP_DN
	final static String i_OUTSIDE_TYP_DN = null;
	// 第 10 変数初期値： i_ODR_POINT
	final static String i_ODR_POINT = null;
	// 第 11 変数初期値： i_FIXED_ODR_QTY
	final static String i_FIXED_ODR_QTY = null;
	// 第 12 変数初期値： i_ODR_LT
	final static String i_ODR_LT = null;
	// 第 13 変数初期値： i_FIXED_LT
	final static String i_FIXED_LT = null;
	// 第 14 変数初期値： i_PROP_LT
	final static String i_PROP_LT = null;
	// 第 15 変数初期値： i_PROP_LOT_SIZE
	final static String i_PROP_LOT_SIZE = null;
	// 第 16 変数初期値： i_SAFETY_LT
	final static String i_SAFETY_LT = null;
	// 第 17 変数初期値： i_SUM_STOCK_ON_HAND_QTY
	final static String i_SUM_STOCK_ON_HAND_QTY = null;
	// 第 18 変数初期値： i_SUM_ODR_QTY
	final static String i_SUM_ODR_QTY = null;
	// 第 19 変数初期値： i_SUM_TOTAL_RCV_QTY
	final static String i_SUM_TOTAL_RCV_QTY = null;
	// 第 20 変数初期値： i_BUSINESS_OPR_DATE
	final static String i_BUSINESS_OPR_DATE = null;
	// 第 21 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 22 変数初期値： i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PLANT_NAME = i_PLANT_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_ODR_POINT = i_ODR_POINT;
		m_FIXED_ODR_QTY = i_FIXED_ODR_QTY;
		m_ODR_LT = i_ODR_LT;
		m_FIXED_LT = i_FIXED_LT;
		m_PROP_LT = i_PROP_LT;
		m_PROP_LOT_SIZE = i_PROP_LOT_SIZE;
		m_SAFETY_LT = i_SAFETY_LT;
		m_SUM_STOCK_ON_HAND_QTY = i_SUM_STOCK_ON_HAND_QTY;
		m_SUM_ODR_QTY = i_SUM_ODR_QTY;
		m_SUM_TOTAL_RCV_QTY = i_SUM_TOTAL_RCV_QTY;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
