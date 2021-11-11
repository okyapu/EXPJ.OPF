/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0050;

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

public class AA0050020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 2 変数： m_WH_PRIORITY_REF_NO */
	public String m_WH_PRIORITY_REF_NO = null;
	/** 第 3 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 4 変数： m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** 第 5 変数： m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** 第 6 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 7 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 8 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 9 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 10 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 11 変数： m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** 第 12 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 13 変数： m_RCV_WH_CD */
	public String m_RCV_WH_CD = null;
	/** 第 14 変数： m_RCV_WH_NAME */
	public String m_RCV_WH_NAME = null;
	/** 第 15 変数： m_w_MRP_FLG */
	public Integer m_w_MRP_FLG = null;
	/** 第 16 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 17 変数： m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** 第 18 変数： m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** 第 19 変数： m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** 第 20 変数： m_MRP_ODR_TYP_val */
	public Integer m_MRP_ODR_TYP_val = null;
	/** 第 21 変数： m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** 第 22 変数： m_OUTSIDE_TYP_val */
	public Integer m_OUTSIDE_TYP_val = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 2 List変数： l_WH_PRIORITY_REF_NO */
	public List l_WH_PRIORITY_REF_NO = null;

	/** 第 3 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 4 List変数： l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** 第 5 List変数： l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** 第 6 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 7 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 8 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 9 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 10 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 11 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 12 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 13 List変数： l_RCV_WH_CD */
	public List l_RCV_WH_CD = null;

	/** 第 14 List変数： l_RCV_WH_NAME */
	public List l_RCV_WH_NAME = null;

	/** 第 15 List変数： l_w_MRP_FLG */
	public List l_w_MRP_FLG = null;

	/** 第 16 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 17 List変数： l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** 第 18 List変数： l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** 第 19 List変数： l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** 第 20 List変数： l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** 第 21 List変数： l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** 第 22 List変数： l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getWH_CD() { return m_WH_CD; }
	public String getWH_PRIORITY_REF_NO() { return m_WH_PRIORITY_REF_NO; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getRCV_WH_CD() { return m_RCV_WH_CD; }
	public String getRCV_WH_NAME() { return m_RCV_WH_NAME; }
	public Integer getw_MRP_FLG() { return m_w_MRP_FLG; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public Integer getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public Integer getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }

	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_PRIORITY_REF_NO() { return l_WH_PRIORITY_REF_NO; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_RCV_WH_CD() { return l_RCV_WH_CD; }
	public List getList_RCV_WH_NAME() { return l_RCV_WH_NAME; }
	public List getList_w_MRP_FLG() { return l_w_MRP_FLG; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }

	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_PRIORITY_REF_NO(String val) { m_WH_PRIORITY_REF_NO = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setRCV_WH_CD(String val) { m_RCV_WH_CD = val; }
	public void setRCV_WH_NAME(String val) { m_RCV_WH_NAME = val; }
	public void setw_MRP_FLG(Integer val) { m_w_MRP_FLG = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_ODR_TYP_val(Integer val) { m_MRP_ODR_TYP_val = val; }
	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(Integer val) { m_OUTSIDE_TYP_val = val; }

	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setw_MRP_FLG(String val) { m_w_MRP_FLG = getInteger(val); }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = getInteger(val); }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = getInteger(val); }

	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_PRIORITY_REF_NO(List list) { l_WH_PRIORITY_REF_NO = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_RCV_WH_CD(List list) { l_RCV_WH_CD = list; }
	public void setList_RCV_WH_NAME(List list) { l_RCV_WH_NAME = list; }
	public void setList_w_MRP_FLG(List list) { l_w_MRP_FLG = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }

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
			l_WH_CD.add(((AA0050020Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_WH_PRIORITY_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_PRIORITY_REF_NO == null) {
			l_WH_PRIORITY_REF_NO = new ArrayList();
		} else {
			l_WH_PRIORITY_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_PRIORITY_REF_NO.add(((AA0050020Struct) list.get(i)).getWH_PRIORITY_REF_NO());
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
			l_WH_NAME.add(((AA0050020Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_w_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VEND_CD == null) {
			l_w_VEND_CD = new ArrayList();
		} else {
			l_w_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VEND_CD.add(((AA0050020Struct) list.get(i)).getw_VEND_CD());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AA0050020Struct) list.get(i)).getw_MODIFY_COUNT());
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
			l_w_PLANT_CD.add(((AA0050020Struct) list.get(i)).getw_PLANT_CD());
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
			l_ITEM_CD.add(((AA0050020Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AA0050020Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0050020Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0050020Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AA0050020Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AA0050020Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_RCV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_WH_CD == null) {
			l_RCV_WH_CD = new ArrayList();
		} else {
			l_RCV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_WH_CD.add(((AA0050020Struct) list.get(i)).getRCV_WH_CD());
		}
		return size;
	}
	public int setL2L_RCV_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_WH_NAME == null) {
			l_RCV_WH_NAME = new ArrayList();
		} else {
			l_RCV_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_WH_NAME.add(((AA0050020Struct) list.get(i)).getRCV_WH_NAME());
		}
		return size;
	}
	public int setL2L_w_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_FLG == null) {
			l_w_MRP_FLG = new ArrayList();
		} else {
			l_w_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_FLG.add(((AA0050020Struct) list.get(i)).getw_MRP_FLG());
		}
		return size;
	}
	public int setL2L_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_NAME == null) {
			l_MRP_ODR_NAME = new ArrayList();
		} else {
			l_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_NAME.add(((AA0050020Struct) list.get(i)).getMRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_NAME == null) {
			l_OUTSIDE_NAME = new ArrayList();
		} else {
			l_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_NAME.add(((AA0050020Struct) list.get(i)).getOUTSIDE_NAME());
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
			l_h_ITEM_CD.add(((AA0050020Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_name == null) {
			l_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_name.add(((AA0050020Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_val == null) {
			l_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_val.add(((AA0050020Struct) list.get(i)).getMRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_name == null) {
			l_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_name.add(((AA0050020Struct) list.get(i)).getOUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_val == null) {
			l_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_val.add(((AA0050020Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_WH_CD = null;
		m_WH_PRIORITY_REF_NO = null;
		m_WH_NAME = null;
		m_w_VEND_CD = null;
		m_w_MODIFY_COUNT = null;
		m_w_PLANT_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_RCV_WH_CD = null;
		m_RCV_WH_NAME = null;
		m_w_MRP_FLG = null;
		m_MRP_ODR_NAME = null;
		m_OUTSIDE_NAME = null;
		m_h_ITEM_CD = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_ODR_TYP_val = null;
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;

		l_WH_CD = null;
		l_WH_PRIORITY_REF_NO = null;
		l_WH_NAME = null;
		l_w_VEND_CD = null;
		l_w_MODIFY_COUNT = null;
		l_w_PLANT_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_RCV_WH_CD = null;
		l_RCV_WH_NAME = null;
		l_w_MRP_FLG = null;
		l_MRP_ODR_NAME = null;
		l_OUTSIDE_NAME = null;
		l_h_ITEM_CD = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_ODR_TYP_val = null;
		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;

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
	 * medAA0050020クラスの標準コンストラクタ
	 */
	public AA0050020Struct()
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
	public void setStruct(AA0050020Struct struct)
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
	public void setStructM(AA0050020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setWH_CD(struct.getWH_CD());
			this.setWH_PRIORITY_REF_NO(struct.getWH_PRIORITY_REF_NO());
			this.setWH_NAME(struct.getWH_NAME());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setRCV_WH_CD(struct.getRCV_WH_CD());
			this.setRCV_WH_NAME(struct.getRCV_WH_NAME());
			this.setw_MRP_FLG(struct.getw_MRP_FLG());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0050020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_PRIORITY_REF_NO(struct.getList_WH_PRIORITY_REF_NO());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_RCV_WH_CD(struct.getList_RCV_WH_CD());
			this.setList_RCV_WH_NAME(struct.getList_RCV_WH_NAME());
			this.setList_w_MRP_FLG(struct.getList_w_MRP_FLG());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
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
	// 第 1 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 2 変数初期値： i_WH_PRIORITY_REF_NO


	final static String i_WH_PRIORITY_REF_NO = null;

	// 第 3 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 4 変数初期値： i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// 第 5 変数初期値： i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 7 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 8 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 9 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 10 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 11 変数初期値： i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// 第 12 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 13 変数初期値： i_RCV_WH_CD


	final static String i_RCV_WH_CD = null;

	// 第 14 変数初期値： i_RCV_WH_NAME


	final static String i_RCV_WH_NAME = null;

	// 第 15 変数初期値： i_w_MRP_FLG


	final static Integer i_w_MRP_FLG = null;

	// 第 16 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 17 変数初期値： i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// 第 18 変数初期値： i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// 第 19 変数初期値： i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// 第 20 変数初期値： i_MRP_ODR_TYP_val


	final static Integer i_MRP_ODR_TYP_val = null;

	// 第 21 変数初期値： i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// 第 22 変数初期値： i_OUTSIDE_TYP_val


	final static Integer i_OUTSIDE_TYP_val = null;

*/

	//{{user_implement_code
	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{
		clear();
		m_MRP_ODR_TYP = new Integer(0);
		m_OUTSIDE_TYP = new Integer(0);
		m_w_MODIFY_COUNT = new String("0");
		m_MRP_ODR_TYP_val = new Integer(0);
		m_OUTSIDE_TYP_val = new Integer(0);
		m_WH_PRIORITY_REF_NO = "0";
		m_RCV_WH_CD = null;
		m_RCV_WH_NAME = null;

		l_ITEM_CD = new ArrayList(0);
		l_ITEM_NAME = new ArrayList(0);
		l_DRAW_CD = new ArrayList(0);
		l_SPEC = new ArrayList(0);
		l_MRP_ODR_TYP = new ArrayList(0);
		l_OUTSIDE_TYP = new ArrayList(0);
		l_WH_CD = new ArrayList(0);
		l_WH_PRIORITY_REF_NO = new ArrayList(0);
		l_WH_NAME = new ArrayList(0);
		l_w_PLANT_CD = new ArrayList(0);
		l_w_MODIFY_COUNT = new ArrayList(0);
		l_w_VEND_CD = new ArrayList(0);
		l_RCV_WH_CD = new ArrayList(0);
		l_RCV_WH_NAME = new ArrayList(0);
	}

	/**
	 * コピー
	 */
	public void copy(AA0050020Struct struct)
	{
		clear();

		if(struct.m_WH_CD != null) m_WH_CD = new String(struct.m_WH_CD);
		if(struct.m_WH_PRIORITY_REF_NO != null) m_WH_PRIORITY_REF_NO = new String(struct.m_WH_PRIORITY_REF_NO);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_w_VEND_CD != null) m_w_VEND_CD = new String(struct.m_w_VEND_CD);
		if(struct.m_w_MODIFY_COUNT != null) m_w_MODIFY_COUNT = new String(struct.m_w_MODIFY_COUNT);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_ITEM_CD != null) m_ITEM_CD = new String(struct.m_ITEM_CD);
		if(struct.m_ITEM_NAME != null) m_ITEM_NAME = new String(struct.m_ITEM_NAME);
		if(struct.m_DRAW_CD != null) m_DRAW_CD = new String(struct.m_DRAW_CD);
		if(struct.m_SPEC != null) m_SPEC = new String(struct.m_SPEC);
		if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer(struct.m_MRP_ODR_TYP.intValue());
		if(struct.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new Integer(struct.m_OUTSIDE_TYP.intValue());
		if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
		if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new Integer(struct.m_MRP_ODR_TYP_val.intValue());
		if(struct.m_OUTSIDE_TYP_name != null) m_OUTSIDE_TYP_name = new String(struct.m_OUTSIDE_TYP_name);
		if(struct.m_OUTSIDE_TYP_val != null) m_OUTSIDE_TYP_val = new Integer(struct.m_OUTSIDE_TYP_val.intValue());
		if(struct.m_RCV_WH_CD != null) m_RCV_WH_CD = new String(struct.m_RCV_WH_CD);
		if(struct.m_RCV_WH_NAME != null) m_RCV_WH_NAME = new String(struct.m_RCV_WH_NAME);

	}

	/**
	 * コピーコンストラクタ
	 */
	 public AA0050020Struct(AA0050020Struct struct)
	 {
	 	copy(struct);
	 }

        //}}user_implement_code

	//////////////////////////////

}
