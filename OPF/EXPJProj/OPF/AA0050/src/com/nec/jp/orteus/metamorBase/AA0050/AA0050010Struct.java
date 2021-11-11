/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050010Struct.java,v $
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

public class AA0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_WH_TYP_name */
	public String m_WH_TYP_name = null;
	/** 第 2 変数： m_WH_TYP_val */
	public Integer m_WH_TYP_val = null;
	/** 第 3 変数： m_MRP_FLG_name */
	public String m_MRP_FLG_name = null;
	/** 第 4 変数： m_MRP_FLG_val */
	public Integer m_MRP_FLG_val = null;
	/** 第 5 変数： m_h_LastWH_CD */
	public String m_h_LastWH_CD = null;
	/** 第 6 変数： m_WH_INSIDE_FLG */
	public String m_WH_INSIDE_FLG = null;
	/** 第 7 変数： m_WH_OUTSIDE_FLG */
	public String m_WH_OUTSIDE_FLG = null;
	/** 第 8 変数： m_h_WH_TYP */
	public String m_h_WH_TYP = null;
	/** 第 9 変数： m_COUNT */
	public Long m_COUNT = null;
	/** 第 10 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 11 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 12 変数： m_w_INSIDE_COUNT */
	public Integer m_w_INSIDE_COUNT = null;
	/** 第 13 変数： m_w_OUTSIDE_COUNT */
	public Integer m_w_OUTSIDE_COUNT = null;
	/** 第 14 変数： m_w_WH_INSIDE_FLG */
	public String m_w_WH_INSIDE_FLG = null;
	/** 第 15 変数： m_w_WH_OUTSIDE_FLG */
	public String m_w_WH_OUTSIDE_FLG = null;
	/** 第 16 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 17 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 18 変数： m_WH_TYP */
	public Integer m_WH_TYP = null;
	/** 第 19 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 20 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 21 変数： m_MRP_FLG */
	public Integer m_MRP_FLG = null;
	/** 第 22 変数： m_WH_ADDR1 */
	public String m_WH_ADDR1 = null;
	/** 第 23 変数： m_WH_ADDR2 */
	public String m_WH_ADDR2 = null;
	/** 第 24 変数： m_WH_TEL */
	public String m_WH_TEL = null;
	/** 第 25 変数： m_WH_PERSON */
	public String m_WH_PERSON = null;
	/** 第 26 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 27 変数： m_WH_PLANT_CD */
	public String m_WH_PLANT_CD = null;
	/** 第 28 変数： m_w_ISSUE_INST_CD */
	public String m_w_ISSUE_INST_CD = null;
	/** 第 29 変数： m_w_INSPC_WH_CD */
	public String m_w_INSPC_WH_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_WH_TYP_name */
	public List l_WH_TYP_name = null;

	/** 第 2 List変数： l_WH_TYP_val */
	public List l_WH_TYP_val = null;

	/** 第 3 List変数： l_MRP_FLG_name */
	public List l_MRP_FLG_name = null;

	/** 第 4 List変数： l_MRP_FLG_val */
	public List l_MRP_FLG_val = null;

	/** 第 5 List変数： l_h_LastWH_CD */
	public List l_h_LastWH_CD = null;

	/** 第 6 List変数： l_WH_INSIDE_FLG */
	public List l_WH_INSIDE_FLG = null;

	/** 第 7 List変数： l_WH_OUTSIDE_FLG */
	public List l_WH_OUTSIDE_FLG = null;

	/** 第 8 List変数： l_h_WH_TYP */
	public List l_h_WH_TYP = null;

	/** 第 9 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 10 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 11 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 12 List変数： l_w_INSIDE_COUNT */
	public List l_w_INSIDE_COUNT = null;

	/** 第 13 List変数： l_w_OUTSIDE_COUNT */
	public List l_w_OUTSIDE_COUNT = null;

	/** 第 14 List変数： l_w_WH_INSIDE_FLG */
	public List l_w_WH_INSIDE_FLG = null;

	/** 第 15 List変数： l_w_WH_OUTSIDE_FLG */
	public List l_w_WH_OUTSIDE_FLG = null;

	/** 第 16 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 17 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 18 List変数： l_WH_TYP */
	public List l_WH_TYP = null;

	/** 第 19 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 20 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 21 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 22 List変数： l_WH_ADDR1 */
	public List l_WH_ADDR1 = null;

	/** 第 23 List変数： l_WH_ADDR2 */
	public List l_WH_ADDR2 = null;

	/** 第 24 List変数： l_WH_TEL */
	public List l_WH_TEL = null;

	/** 第 25 List変数： l_WH_PERSON */
	public List l_WH_PERSON = null;

	/** 第 26 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 27 List変数： l_WH_PLANT_CD */
	public List l_WH_PLANT_CD = null;

	/** 第 28 List変数： l_w_ISSUE_INST_CD */
	public List l_w_ISSUE_INST_CD = null;

	/** 第 29 List変数： l_w_INSPC_WH_CD */
	public List l_w_INSPC_WH_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getWH_TYP_name() { return m_WH_TYP_name; }
	public Integer getWH_TYP_val() { return m_WH_TYP_val; }
	public String getMRP_FLG_name() { return m_MRP_FLG_name; }
	public Integer getMRP_FLG_val() { return m_MRP_FLG_val; }
	public String geth_LastWH_CD() { return m_h_LastWH_CD; }
	public String getWH_INSIDE_FLG() { return m_WH_INSIDE_FLG; }
	public String getWH_OUTSIDE_FLG() { return m_WH_OUTSIDE_FLG; }
	public String geth_WH_TYP() { return m_h_WH_TYP; }
	public Long getCOUNT() { return m_COUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public Integer getw_INSIDE_COUNT() { return m_w_INSIDE_COUNT; }
	public Integer getw_OUTSIDE_COUNT() { return m_w_OUTSIDE_COUNT; }
	public String getw_WH_INSIDE_FLG() { return m_w_WH_INSIDE_FLG; }
	public String getw_WH_OUTSIDE_FLG() { return m_w_WH_OUTSIDE_FLG; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public Integer getWH_TYP() { return m_WH_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public Integer getMRP_FLG() { return m_MRP_FLG; }
	public String getWH_ADDR1() { return m_WH_ADDR1; }
	public String getWH_ADDR2() { return m_WH_ADDR2; }
	public String getWH_TEL() { return m_WH_TEL; }
	public String getWH_PERSON() { return m_WH_PERSON; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getWH_PLANT_CD() { return m_WH_PLANT_CD; }
	public String getw_ISSUE_INST_CD() { return m_w_ISSUE_INST_CD; }
	public String getw_INSPC_WH_CD() { return m_w_INSPC_WH_CD; }

	public List getList_WH_TYP_name() { return l_WH_TYP_name; }
	public List getList_WH_TYP_val() { return l_WH_TYP_val; }
	public List getList_MRP_FLG_name() { return l_MRP_FLG_name; }
	public List getList_MRP_FLG_val() { return l_MRP_FLG_val; }
	public List getList_h_LastWH_CD() { return l_h_LastWH_CD; }
	public List getList_WH_INSIDE_FLG() { return l_WH_INSIDE_FLG; }
	public List getList_WH_OUTSIDE_FLG() { return l_WH_OUTSIDE_FLG; }
	public List getList_h_WH_TYP() { return l_h_WH_TYP; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_INSIDE_COUNT() { return l_w_INSIDE_COUNT; }
	public List getList_w_OUTSIDE_COUNT() { return l_w_OUTSIDE_COUNT; }
	public List getList_w_WH_INSIDE_FLG() { return l_w_WH_INSIDE_FLG; }
	public List getList_w_WH_OUTSIDE_FLG() { return l_w_WH_OUTSIDE_FLG; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_WH_ADDR1() { return l_WH_ADDR1; }
	public List getList_WH_ADDR2() { return l_WH_ADDR2; }
	public List getList_WH_TEL() { return l_WH_TEL; }
	public List getList_WH_PERSON() { return l_WH_PERSON; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_WH_PLANT_CD() { return l_WH_PLANT_CD; }
	public List getList_w_ISSUE_INST_CD() { return l_w_ISSUE_INST_CD; }
	public List getList_w_INSPC_WH_CD() { return l_w_INSPC_WH_CD; }

	public void setWH_TYP_name(String val) { m_WH_TYP_name = val; }
	public void setWH_TYP_val(Integer val) { m_WH_TYP_val = val; }
	public void setMRP_FLG_name(String val) { m_MRP_FLG_name = val; }
	public void setMRP_FLG_val(Integer val) { m_MRP_FLG_val = val; }
	public void seth_LastWH_CD(String val) { m_h_LastWH_CD = val; }
	public void setWH_INSIDE_FLG(String val) { m_WH_INSIDE_FLG = val; }
	public void setWH_OUTSIDE_FLG(String val) { m_WH_OUTSIDE_FLG = val; }
	public void seth_WH_TYP(String val) { m_h_WH_TYP = val; }
	public void setCOUNT(Long val) { m_COUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_INSIDE_COUNT(Integer val) { m_w_INSIDE_COUNT = val; }
	public void setw_OUTSIDE_COUNT(Integer val) { m_w_OUTSIDE_COUNT = val; }
	public void setw_WH_INSIDE_FLG(String val) { m_w_WH_INSIDE_FLG = val; }
	public void setw_WH_OUTSIDE_FLG(String val) { m_w_WH_OUTSIDE_FLG = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setWH_TYP(Integer val) { m_WH_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setMRP_FLG(Integer val) { m_MRP_FLG = val; }
	public void setWH_ADDR1(String val) { m_WH_ADDR1 = val; }
	public void setWH_ADDR2(String val) { m_WH_ADDR2 = val; }
	public void setWH_TEL(String val) { m_WH_TEL = val; }
	public void setWH_PERSON(String val) { m_WH_PERSON = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setWH_PLANT_CD(String val) { m_WH_PLANT_CD = val; }
	public void setw_ISSUE_INST_CD(String val) { m_w_ISSUE_INST_CD = val; }
	public void setw_INSPC_WH_CD(String val) { m_w_INSPC_WH_CD = val; }

	public void setWH_TYP_val(String val) { m_WH_TYP_val = getInteger(val); }
	public void setMRP_FLG_val(String val) { m_MRP_FLG_val = getInteger(val); }
	public void setw_INSIDE_COUNT(String val) { m_w_INSIDE_COUNT = getInteger(val); }
	public void setw_OUTSIDE_COUNT(String val) { m_w_OUTSIDE_COUNT = getInteger(val); }
	public void setWH_TYP(String val) { m_WH_TYP = getInteger(val); }
	public void setMRP_FLG(String val) { m_MRP_FLG = getInteger(val); }

	public void setList_WH_TYP_name(List list) { l_WH_TYP_name = list; }
	public void setList_WH_TYP_val(List list) { l_WH_TYP_val = list; }
	public void setList_MRP_FLG_name(List list) { l_MRP_FLG_name = list; }
	public void setList_MRP_FLG_val(List list) { l_MRP_FLG_val = list; }
	public void setList_h_LastWH_CD(List list) { l_h_LastWH_CD = list; }
	public void setList_WH_INSIDE_FLG(List list) { l_WH_INSIDE_FLG = list; }
	public void setList_WH_OUTSIDE_FLG(List list) { l_WH_OUTSIDE_FLG = list; }
	public void setList_h_WH_TYP(List list) { l_h_WH_TYP = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_INSIDE_COUNT(List list) { l_w_INSIDE_COUNT = list; }
	public void setList_w_OUTSIDE_COUNT(List list) { l_w_OUTSIDE_COUNT = list; }
	public void setList_w_WH_INSIDE_FLG(List list) { l_w_WH_INSIDE_FLG = list; }
	public void setList_w_WH_OUTSIDE_FLG(List list) { l_w_WH_OUTSIDE_FLG = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_WH_ADDR1(List list) { l_WH_ADDR1 = list; }
	public void setList_WH_ADDR2(List list) { l_WH_ADDR2 = list; }
	public void setList_WH_TEL(List list) { l_WH_TEL = list; }
	public void setList_WH_PERSON(List list) { l_WH_PERSON = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_WH_PLANT_CD(List list) { l_WH_PLANT_CD = list; }
	public void setList_w_ISSUE_INST_CD(List list) { l_w_ISSUE_INST_CD = list; }
	public void setList_w_INSPC_WH_CD(List list) { l_w_INSPC_WH_CD = list; }

	public int setL2L_WH_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP_name == null) {
			l_WH_TYP_name = new ArrayList();
		} else {
			l_WH_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP_name.add(((AA0050010Struct) list.get(i)).getWH_TYP_name());
		}
		return size;
	}
	public int setL2L_WH_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP_val == null) {
			l_WH_TYP_val = new ArrayList();
		} else {
			l_WH_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP_val.add(((AA0050010Struct) list.get(i)).getWH_TYP_val());
		}
		return size;
	}
	public int setL2L_MRP_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_name == null) {
			l_MRP_FLG_name = new ArrayList();
		} else {
			l_MRP_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_name.add(((AA0050010Struct) list.get(i)).getMRP_FLG_name());
		}
		return size;
	}
	public int setL2L_MRP_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_val == null) {
			l_MRP_FLG_val = new ArrayList();
		} else {
			l_MRP_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_val.add(((AA0050010Struct) list.get(i)).getMRP_FLG_val());
		}
		return size;
	}
	public int setL2L_h_LastWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LastWH_CD == null) {
			l_h_LastWH_CD = new ArrayList();
		} else {
			l_h_LastWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LastWH_CD.add(((AA0050010Struct) list.get(i)).geth_LastWH_CD());
		}
		return size;
	}
	public int setL2L_WH_INSIDE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_INSIDE_FLG == null) {
			l_WH_INSIDE_FLG = new ArrayList();
		} else {
			l_WH_INSIDE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_INSIDE_FLG.add(((AA0050010Struct) list.get(i)).getWH_INSIDE_FLG());
		}
		return size;
	}
	public int setL2L_WH_OUTSIDE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_OUTSIDE_FLG == null) {
			l_WH_OUTSIDE_FLG = new ArrayList();
		} else {
			l_WH_OUTSIDE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_OUTSIDE_FLG.add(((AA0050010Struct) list.get(i)).getWH_OUTSIDE_FLG());
		}
		return size;
	}
	public int setL2L_h_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WH_TYP == null) {
			l_h_WH_TYP = new ArrayList();
		} else {
			l_h_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WH_TYP.add(((AA0050010Struct) list.get(i)).geth_WH_TYP());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AA0050010Struct) list.get(i)).getCOUNT());
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
			l_COMPANY_CD.add(((AA0050010Struct) list.get(i)).getCOMPANY_CD());
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
			l_w_PLANT_CD.add(((AA0050010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_INSIDE_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INSIDE_COUNT == null) {
			l_w_INSIDE_COUNT = new ArrayList();
		} else {
			l_w_INSIDE_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INSIDE_COUNT.add(((AA0050010Struct) list.get(i)).getw_INSIDE_COUNT());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_COUNT == null) {
			l_w_OUTSIDE_COUNT = new ArrayList();
		} else {
			l_w_OUTSIDE_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_COUNT.add(((AA0050010Struct) list.get(i)).getw_OUTSIDE_COUNT());
		}
		return size;
	}
	public int setL2L_w_WH_INSIDE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_INSIDE_FLG == null) {
			l_w_WH_INSIDE_FLG = new ArrayList();
		} else {
			l_w_WH_INSIDE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_INSIDE_FLG.add(((AA0050010Struct) list.get(i)).getw_WH_INSIDE_FLG());
		}
		return size;
	}
	public int setL2L_w_WH_OUTSIDE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_OUTSIDE_FLG == null) {
			l_w_WH_OUTSIDE_FLG = new ArrayList();
		} else {
			l_w_WH_OUTSIDE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_OUTSIDE_FLG.add(((AA0050010Struct) list.get(i)).getw_WH_OUTSIDE_FLG());
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
			l_WH_CD.add(((AA0050010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AA0050010Struct) list.get(i)).getWH_NAME());
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
			l_WH_TYP.add(((AA0050010Struct) list.get(i)).getWH_TYP());
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
			l_VEND_CD.add(((AA0050010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AA0050010Struct) list.get(i)).getVEND_ANAME());
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
			l_MRP_FLG.add(((AA0050010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_WH_ADDR1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_ADDR1 == null) {
			l_WH_ADDR1 = new ArrayList();
		} else {
			l_WH_ADDR1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_ADDR1.add(((AA0050010Struct) list.get(i)).getWH_ADDR1());
		}
		return size;
	}
	public int setL2L_WH_ADDR2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_ADDR2 == null) {
			l_WH_ADDR2 = new ArrayList();
		} else {
			l_WH_ADDR2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_ADDR2.add(((AA0050010Struct) list.get(i)).getWH_ADDR2());
		}
		return size;
	}
	public int setL2L_WH_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TEL == null) {
			l_WH_TEL = new ArrayList();
		} else {
			l_WH_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TEL.add(((AA0050010Struct) list.get(i)).getWH_TEL());
		}
		return size;
	}
	public int setL2L_WH_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_PERSON == null) {
			l_WH_PERSON = new ArrayList();
		} else {
			l_WH_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_PERSON.add(((AA0050010Struct) list.get(i)).getWH_PERSON());
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
			l_MODIFY_COUNT.add(((AA0050010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_WH_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_PLANT_CD == null) {
			l_WH_PLANT_CD = new ArrayList();
		} else {
			l_WH_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_PLANT_CD.add(((AA0050010Struct) list.get(i)).getWH_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ISSUE_INST_CD == null) {
			l_w_ISSUE_INST_CD = new ArrayList();
		} else {
			l_w_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ISSUE_INST_CD.add(((AA0050010Struct) list.get(i)).getw_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_w_INSPC_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INSPC_WH_CD == null) {
			l_w_INSPC_WH_CD = new ArrayList();
		} else {
			l_w_INSPC_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INSPC_WH_CD.add(((AA0050010Struct) list.get(i)).getw_INSPC_WH_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_WH_TYP_name = null;
		m_WH_TYP_val = null;
		m_MRP_FLG_name = null;
		m_MRP_FLG_val = null;
		m_h_LastWH_CD = null;
		m_WH_INSIDE_FLG = null;
		m_WH_OUTSIDE_FLG = null;
		m_h_WH_TYP = null;
		m_COUNT = null;
		m_COMPANY_CD = null;
		m_w_PLANT_CD = null;
		m_w_INSIDE_COUNT = null;
		m_w_OUTSIDE_COUNT = null;
		m_w_WH_INSIDE_FLG = null;
		m_w_WH_OUTSIDE_FLG = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_WH_TYP = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_MRP_FLG = null;
		m_WH_ADDR1 = null;
		m_WH_ADDR2 = null;
		m_WH_TEL = null;
		m_WH_PERSON = null;
		m_MODIFY_COUNT = null;
		m_WH_PLANT_CD = null;
		m_w_ISSUE_INST_CD = null;
		m_w_INSPC_WH_CD = null;

		l_WH_TYP_name = null;
		l_WH_TYP_val = null;
		l_MRP_FLG_name = null;
		l_MRP_FLG_val = null;
		l_h_LastWH_CD = null;
		l_WH_INSIDE_FLG = null;
		l_WH_OUTSIDE_FLG = null;
		l_h_WH_TYP = null;
		l_COUNT = null;
		l_COMPANY_CD = null;
		l_w_PLANT_CD = null;
		l_w_INSIDE_COUNT = null;
		l_w_OUTSIDE_COUNT = null;
		l_w_WH_INSIDE_FLG = null;
		l_w_WH_OUTSIDE_FLG = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_WH_TYP = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_MRP_FLG = null;
		l_WH_ADDR1 = null;
		l_WH_ADDR2 = null;
		l_WH_TEL = null;
		l_WH_PERSON = null;
		l_MODIFY_COUNT = null;
		l_WH_PLANT_CD = null;
		l_w_ISSUE_INST_CD = null;
		l_w_INSPC_WH_CD = null;

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
	 * medAA0050010クラスの標準コンストラクタ
	 */
	public AA0050010Struct()
	{
		//{{user_implement_code_constractor
		//------------------------------------------------------------------
			initialize();

			l_WH_TYP_name = new ArrayList(0);
			l_WH_TYP_val = new ArrayList(0);
			l_MRP_FLG_name = new ArrayList(0);
			l_MRP_FLG_val = new ArrayList(0);

		//------------------------------------------------------------------
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
	public void setStruct(AA0050010Struct struct)
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
	public void setStructM(AA0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setWH_TYP_name(struct.getWH_TYP_name());
			this.setWH_TYP_val(struct.getWH_TYP_val());
			this.setMRP_FLG_name(struct.getMRP_FLG_name());
			this.setMRP_FLG_val(struct.getMRP_FLG_val());
			this.seth_LastWH_CD(struct.geth_LastWH_CD());
			this.setWH_INSIDE_FLG(struct.getWH_INSIDE_FLG());
			this.setWH_OUTSIDE_FLG(struct.getWH_OUTSIDE_FLG());
			this.seth_WH_TYP(struct.geth_WH_TYP());
			this.setCOUNT(struct.getCOUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_INSIDE_COUNT(struct.getw_INSIDE_COUNT());
			this.setw_OUTSIDE_COUNT(struct.getw_OUTSIDE_COUNT());
			this.setw_WH_INSIDE_FLG(struct.getw_WH_INSIDE_FLG());
			this.setw_WH_OUTSIDE_FLG(struct.getw_WH_OUTSIDE_FLG());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setWH_TYP(struct.getWH_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setWH_ADDR1(struct.getWH_ADDR1());
			this.setWH_ADDR2(struct.getWH_ADDR2());
			this.setWH_TEL(struct.getWH_TEL());
			this.setWH_PERSON(struct.getWH_PERSON());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setWH_PLANT_CD(struct.getWH_PLANT_CD());
			this.setw_ISSUE_INST_CD(struct.getw_ISSUE_INST_CD());
			this.setw_INSPC_WH_CD(struct.getw_INSPC_WH_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_WH_TYP_name(struct.getList_WH_TYP_name());
			this.setList_WH_TYP_val(struct.getList_WH_TYP_val());
			this.setList_MRP_FLG_name(struct.getList_MRP_FLG_name());
			this.setList_MRP_FLG_val(struct.getList_MRP_FLG_val());
			this.setList_h_LastWH_CD(struct.getList_h_LastWH_CD());
			this.setList_WH_INSIDE_FLG(struct.getList_WH_INSIDE_FLG());
			this.setList_WH_OUTSIDE_FLG(struct.getList_WH_OUTSIDE_FLG());
			this.setList_h_WH_TYP(struct.getList_h_WH_TYP());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_INSIDE_COUNT(struct.getList_w_INSIDE_COUNT());
			this.setList_w_OUTSIDE_COUNT(struct.getList_w_OUTSIDE_COUNT());
			this.setList_w_WH_INSIDE_FLG(struct.getList_w_WH_INSIDE_FLG());
			this.setList_w_WH_OUTSIDE_FLG(struct.getList_w_WH_OUTSIDE_FLG());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_WH_ADDR1(struct.getList_WH_ADDR1());
			this.setList_WH_ADDR2(struct.getList_WH_ADDR2());
			this.setList_WH_TEL(struct.getList_WH_TEL());
			this.setList_WH_PERSON(struct.getList_WH_PERSON());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_WH_PLANT_CD(struct.getList_WH_PLANT_CD());
			this.setList_w_ISSUE_INST_CD(struct.getList_w_ISSUE_INST_CD());
			this.setList_w_INSPC_WH_CD(struct.getList_w_INSPC_WH_CD());
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
	// 第 1 変数初期値： i_WH_TYP_name


	final static String i_WH_TYP_name = null;

	// 第 2 変数初期値： i_WH_TYP_val


	final static Integer i_WH_TYP_val = null;

	// 第 3 変数初期値： i_MRP_FLG_name


	final static String i_MRP_FLG_name = null;

	// 第 4 変数初期値： i_MRP_FLG_val


	final static Integer i_MRP_FLG_val = null;

	// 第 5 変数初期値： i_h_LastWH_CD


	final static String i_h_LastWH_CD = null;

	// 第 6 変数初期値： i_WH_INSIDE_FLG


	final static String i_WH_INSIDE_FLG = null;

	// 第 7 変数初期値： i_WH_OUTSIDE_FLG


	final static String i_WH_OUTSIDE_FLG = null;

	// 第 8 変数初期値： i_h_WH_TYP


	final static String i_h_WH_TYP = null;

	// 第 9 変数初期値： i_COUNT


	final static Long i_COUNT = null;

	// 第 10 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 11 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 12 変数初期値： i_w_INSIDE_COUNT


	final static Integer i_w_INSIDE_COUNT = null;

	// 第 13 変数初期値： i_w_OUTSIDE_COUNT


	final static Integer i_w_OUTSIDE_COUNT = null;

	// 第 14 変数初期値： i_w_WH_INSIDE_FLG


	final static String i_w_WH_INSIDE_FLG = null;

	// 第 15 変数初期値： i_w_WH_OUTSIDE_FLG


	final static String i_w_WH_OUTSIDE_FLG = null;

	// 第 16 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 17 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 18 変数初期値： i_WH_TYP


	final static Integer i_WH_TYP = null;

	// 第 19 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 20 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 21 変数初期値： i_MRP_FLG


	final static Integer i_MRP_FLG = null;

	// 第 22 変数初期値： i_WH_ADDR1


	final static String i_WH_ADDR1 = null;

	// 第 23 変数初期値： i_WH_ADDR2


	final static String i_WH_ADDR2 = null;

	// 第 24 変数初期値： i_WH_TEL


	final static String i_WH_TEL = null;

	// 第 25 変数初期値： i_WH_PERSON


	final static String i_WH_PERSON = null;

	// 第 26 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 27 変数初期値： i_WH_PLANT_CD


	final static String i_WH_PLANT_CD = null;

	// 第 28 変数初期値： i_w_ISSUE_INST_CD


	final static String i_w_ISSUE_INST_CD = null;

	// 第 29 変数初期値： i_w_INSPC_WH_CD


	final static String i_w_INSPC_WH_CD = null;

*/

	//{{user_implement_code
	//------------------------------------------------------------------
	public void initialize()
	{
		m_WH_CD = null;
		m_WH_NAME = null;
		m_WH_TYP = new Integer(0);
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_MRP_FLG = new Integer(1);
		m_WH_ADDR1 = null;
		m_WH_ADDR2 = null;
		m_WH_TEL = null;
		m_WH_PERSON = null;
		m_COMPANY_CD = null;
		m_MODIFY_COUNT = new String("0");
		m_w_PLANT_CD = null;
		m_COUNT = null;
		m_WH_TYP_name = null;
		m_WH_TYP_val = null;
		m_MRP_FLG_name = null;
		m_MRP_FLG_val = null;
		m_WH_PLANT_CD = null;
		m_WH_INSIDE_FLG = "false";
		m_WH_OUTSIDE_FLG = "false";
		m_w_WH_INSIDE_FLG = null;
		m_w_WH_OUTSIDE_FLG = null;

		l_WH_CD = new ArrayList(0);
		l_WH_NAME = new ArrayList(0);
		l_WH_TYP = new ArrayList(0);
		l_VEND_CD = new ArrayList(0);
		l_VEND_ANAME = new ArrayList(0);
		l_MRP_FLG = new ArrayList(0);
		l_WH_ADDR1 = new ArrayList(0);
		l_WH_ADDR2 = new ArrayList(0);
		l_WH_TEL = new ArrayList(0);
		l_WH_PERSON = new ArrayList(0);
		l_COMPANY_CD = new ArrayList(0);
		l_MODIFY_COUNT = new ArrayList(0);
		l_w_PLANT_CD = new ArrayList(0);
		l_COUNT = new ArrayList(0);
		l_WH_PLANT_CD = new ArrayList(0);
		l_WH_INSIDE_FLG = new ArrayList(0);
		l_WH_OUTSIDE_FLG = new ArrayList(0);
		l_w_WH_INSIDE_FLG = new ArrayList(0);
		l_w_WH_OUTSIDE_FLG = new ArrayList(0);
	}

	/**
	 * コピー
	 */
	public void copy(AA0050010Struct struct)
	{
		clear();
		if(struct.m_WH_CD != null) m_WH_CD = new String(struct.m_WH_CD);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_WH_TYP != null) m_WH_TYP = new Integer(struct.m_WH_TYP.intValue());
		if(struct.m_VEND_CD != null) m_VEND_CD = new String(struct.m_VEND_CD);
		if(struct.m_VEND_ANAME != null) m_VEND_ANAME = new String(struct.m_VEND_ANAME);
		if(struct.m_MRP_FLG != null) m_MRP_FLG = new Integer(struct.m_MRP_FLG.intValue());
		if(struct.m_WH_ADDR1 != null) m_WH_ADDR1 = new String(struct.m_WH_ADDR1);
		if(struct.m_WH_ADDR2 != null) m_WH_ADDR2 = new String(struct.m_WH_ADDR2);
		if(struct.m_WH_TEL != null) m_WH_TEL = new String(struct.m_WH_TEL);
		if(struct.m_WH_PERSON != null) m_WH_PERSON = new String(struct.m_WH_PERSON);
		if(struct.m_COMPANY_CD != null) m_COMPANY_CD = new String(struct.m_COMPANY_CD);
		if(struct.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(struct.m_MODIFY_COUNT);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_COUNT != null) m_COUNT = new Long(struct.m_COUNT.longValue());
		if(struct.m_WH_TYP_name != null) m_WH_TYP_name = new String(struct.m_WH_TYP_name);
		if(struct.m_WH_TYP_val != null) m_WH_TYP_val = new Integer(struct.m_WH_TYP_val.intValue());
		if(struct.m_MRP_FLG_name != null) m_MRP_FLG_name = new String(struct.m_MRP_FLG_name);
		if(struct.m_MRP_FLG_val != null) m_MRP_FLG_val = new Integer(struct.m_MRP_FLG_val.intValue());
		if(struct.m_WH_PLANT_CD != null) m_WH_PLANT_CD = new String(struct.m_WH_PLANT_CD);
		if(struct.m_WH_INSIDE_FLG != null) m_WH_INSIDE_FLG = new String(struct.m_WH_INSIDE_FLG);
		if(struct.m_WH_OUTSIDE_FLG != null) m_WH_OUTSIDE_FLG = new String(struct.m_WH_OUTSIDE_FLG);
		if(struct.m_w_WH_INSIDE_FLG != null) m_w_WH_INSIDE_FLG = new String(struct.m_w_WH_INSIDE_FLG);
		if(struct.m_w_WH_OUTSIDE_FLG != null) m_w_WH_OUTSIDE_FLG = new String(struct.m_w_WH_OUTSIDE_FLG);

	}


	/**
	 * コピーコンストラクタ
	 */
	 public AA0050010Struct(AA0050010Struct struct)
	 {
	 	copy(struct);
	 }
	//------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
