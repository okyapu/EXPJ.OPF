/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0010/src/com/nec/jp/orteus/metamorBase/DC0010/DC0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DC0010;

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

public class DC0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** 第 2 変数： m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** 第 3 変数： m_CS_CALC_PROC_NO_DN */
	public String m_CS_CALC_PROC_NO_DN = null;
	/** 第 4 変数： m_r1_ExecuteType */
	public String m_r1_ExecuteType = null;
	/** 第 5 変数： m_r2_ExecuteType */
	public String m_r2_ExecuteType = null;
	/** 第 6 変数： m_EXECUTE_STATUS_TYP_DN */
	public String m_EXECUTE_STATUS_TYP_DN = null;
	/** 第 7 変数： m_RESULT_STATUS_TYP_DN */
	public String m_RESULT_STATUS_TYP_DN = null;
	/** 第 8 変数： m_START_TIME */
	public String m_START_TIME = null;
	/** 第 9 変数： m_STOP_TIME */
	public String m_STOP_TIME = null;
	/** 第 10 変数： m_EXECUTE_STATUS_TYP */
	public String m_EXECUTE_STATUS_TYP = null;
	/** 第 11 変数： m_RESULT_STATUS_TYP */
	public String m_RESULT_STATUS_TYP = null;
	/** 第 12 変数： m_CS_CALC_PROC_NO */
	public String m_CS_CALC_PROC_NO = null;
	/** 第 13 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 14 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 15 変数： m_YEAR */
	public String m_YEAR = null;
	/** 第 16 変数： m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** 第 17 変数： m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** 第 18 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 19 変数： m_EXECUTE_TYP */
	public String m_EXECUTE_TYP = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** 第 2 List変数： l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** 第 3 List変数： l_CS_CALC_PROC_NO_DN */
	public List l_CS_CALC_PROC_NO_DN = null;

	/** 第 4 List変数： l_r1_ExecuteType */
	public List l_r1_ExecuteType = null;

	/** 第 5 List変数： l_r2_ExecuteType */
	public List l_r2_ExecuteType = null;

	/** 第 6 List変数： l_EXECUTE_STATUS_TYP_DN */
	public List l_EXECUTE_STATUS_TYP_DN = null;

	/** 第 7 List変数： l_RESULT_STATUS_TYP_DN */
	public List l_RESULT_STATUS_TYP_DN = null;

	/** 第 8 List変数： l_START_TIME */
	public List l_START_TIME = null;

	/** 第 9 List変数： l_STOP_TIME */
	public List l_STOP_TIME = null;

	/** 第 10 List変数： l_EXECUTE_STATUS_TYP */
	public List l_EXECUTE_STATUS_TYP = null;

	/** 第 11 List変数： l_RESULT_STATUS_TYP */
	public List l_RESULT_STATUS_TYP = null;

	/** 第 12 List変数： l_CS_CALC_PROC_NO */
	public List l_CS_CALC_PROC_NO = null;

	/** 第 13 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 14 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 15 List変数： l_YEAR */
	public List l_YEAR = null;

	/** 第 16 List変数： l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** 第 17 List変数： l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** 第 18 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 19 List変数： l_EXECUTE_TYP */
	public List l_EXECUTE_TYP = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getCS_CALC_PROC_NO_DN() { return m_CS_CALC_PROC_NO_DN; }
	public String getr1_ExecuteType() { return m_r1_ExecuteType; }
	public String getr2_ExecuteType() { return m_r2_ExecuteType; }
	public String getEXECUTE_STATUS_TYP_DN() { return m_EXECUTE_STATUS_TYP_DN; }
	public String getRESULT_STATUS_TYP_DN() { return m_RESULT_STATUS_TYP_DN; }
	public String getSTART_TIME() { return m_START_TIME; }
	public String getSTOP_TIME() { return m_STOP_TIME; }
	public String getEXECUTE_STATUS_TYP() { return m_EXECUTE_STATUS_TYP; }
	public String getRESULT_STATUS_TYP() { return m_RESULT_STATUS_TYP; }
	public String getCS_CALC_PROC_NO() { return m_CS_CALC_PROC_NO; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getEXECUTE_TYP() { return m_EXECUTE_TYP; }

	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_CS_CALC_PROC_NO_DN() { return l_CS_CALC_PROC_NO_DN; }
	public List getList_r1_ExecuteType() { return l_r1_ExecuteType; }
	public List getList_r2_ExecuteType() { return l_r2_ExecuteType; }
	public List getList_EXECUTE_STATUS_TYP_DN() { return l_EXECUTE_STATUS_TYP_DN; }
	public List getList_RESULT_STATUS_TYP_DN() { return l_RESULT_STATUS_TYP_DN; }
	public List getList_START_TIME() { return l_START_TIME; }
	public List getList_STOP_TIME() { return l_STOP_TIME; }
	public List getList_EXECUTE_STATUS_TYP() { return l_EXECUTE_STATUS_TYP; }
	public List getList_RESULT_STATUS_TYP() { return l_RESULT_STATUS_TYP; }
	public List getList_CS_CALC_PROC_NO() { return l_CS_CALC_PROC_NO; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_EXECUTE_TYP() { return l_EXECUTE_TYP; }

	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setCS_CALC_PROC_NO_DN(String val) { m_CS_CALC_PROC_NO_DN = val; }
	public void setr1_ExecuteType(String val) { m_r1_ExecuteType = val; }
	public void setr2_ExecuteType(String val) { m_r2_ExecuteType = val; }
	public void setEXECUTE_STATUS_TYP_DN(String val) { m_EXECUTE_STATUS_TYP_DN = val; }
	public void setRESULT_STATUS_TYP_DN(String val) { m_RESULT_STATUS_TYP_DN = val; }
	public void setSTART_TIME(String val) { m_START_TIME = val; }
	public void setSTOP_TIME(String val) { m_STOP_TIME = val; }
	public void setEXECUTE_STATUS_TYP(String val) { m_EXECUTE_STATUS_TYP = val; }
	public void setRESULT_STATUS_TYP(String val) { m_RESULT_STATUS_TYP = val; }
	public void setCS_CALC_PROC_NO(String val) { m_CS_CALC_PROC_NO = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setEXECUTE_TYP(String val) { m_EXECUTE_TYP = val; }


	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_CS_CALC_PROC_NO_DN(List list) { l_CS_CALC_PROC_NO_DN = list; }
	public void setList_r1_ExecuteType(List list) { l_r1_ExecuteType = list; }
	public void setList_r2_ExecuteType(List list) { l_r2_ExecuteType = list; }
	public void setList_EXECUTE_STATUS_TYP_DN(List list) { l_EXECUTE_STATUS_TYP_DN = list; }
	public void setList_RESULT_STATUS_TYP_DN(List list) { l_RESULT_STATUS_TYP_DN = list; }
	public void setList_START_TIME(List list) { l_START_TIME = list; }
	public void setList_STOP_TIME(List list) { l_STOP_TIME = list; }
	public void setList_EXECUTE_STATUS_TYP(List list) { l_EXECUTE_STATUS_TYP = list; }
	public void setList_RESULT_STATUS_TYP(List list) { l_RESULT_STATUS_TYP = list; }
	public void setList_CS_CALC_PROC_NO(List list) { l_CS_CALC_PROC_NO = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_EXECUTE_TYP(List list) { l_EXECUTE_TYP = list; }

	public int setL2L_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_name == null) {
			l_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_name.add(((DC0010010Struct) list.get(i)).getHALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_val == null) {
			l_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_val.add(((DC0010010Struct) list.get(i)).getHALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_CS_CALC_PROC_NO_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_PROC_NO_DN == null) {
			l_CS_CALC_PROC_NO_DN = new ArrayList();
		} else {
			l_CS_CALC_PROC_NO_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_PROC_NO_DN.add(((DC0010010Struct) list.get(i)).getCS_CALC_PROC_NO_DN());
		}
		return size;
	}
	public int setL2L_r1_ExecuteType(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_ExecuteType == null) {
			l_r1_ExecuteType = new ArrayList();
		} else {
			l_r1_ExecuteType.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_ExecuteType.add(((DC0010010Struct) list.get(i)).getr1_ExecuteType());
		}
		return size;
	}
	public int setL2L_r2_ExecuteType(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_ExecuteType == null) {
			l_r2_ExecuteType = new ArrayList();
		} else {
			l_r2_ExecuteType.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_ExecuteType.add(((DC0010010Struct) list.get(i)).getr2_ExecuteType());
		}
		return size;
	}
	public int setL2L_EXECUTE_STATUS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXECUTE_STATUS_TYP_DN == null) {
			l_EXECUTE_STATUS_TYP_DN = new ArrayList();
		} else {
			l_EXECUTE_STATUS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXECUTE_STATUS_TYP_DN.add(((DC0010010Struct) list.get(i)).getEXECUTE_STATUS_TYP_DN());
		}
		return size;
	}
	public int setL2L_RESULT_STATUS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESULT_STATUS_TYP_DN == null) {
			l_RESULT_STATUS_TYP_DN = new ArrayList();
		} else {
			l_RESULT_STATUS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESULT_STATUS_TYP_DN.add(((DC0010010Struct) list.get(i)).getRESULT_STATUS_TYP_DN());
		}
		return size;
	}
	public int setL2L_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_TIME == null) {
			l_START_TIME = new ArrayList();
		} else {
			l_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_TIME.add(((DC0010010Struct) list.get(i)).getSTART_TIME());
		}
		return size;
	}
	public int setL2L_STOP_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOP_TIME == null) {
			l_STOP_TIME = new ArrayList();
		} else {
			l_STOP_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOP_TIME.add(((DC0010010Struct) list.get(i)).getSTOP_TIME());
		}
		return size;
	}
	public int setL2L_EXECUTE_STATUS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXECUTE_STATUS_TYP == null) {
			l_EXECUTE_STATUS_TYP = new ArrayList();
		} else {
			l_EXECUTE_STATUS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXECUTE_STATUS_TYP.add(((DC0010010Struct) list.get(i)).getEXECUTE_STATUS_TYP());
		}
		return size;
	}
	public int setL2L_RESULT_STATUS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESULT_STATUS_TYP == null) {
			l_RESULT_STATUS_TYP = new ArrayList();
		} else {
			l_RESULT_STATUS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESULT_STATUS_TYP.add(((DC0010010Struct) list.get(i)).getRESULT_STATUS_TYP());
		}
		return size;
	}
	public int setL2L_CS_CALC_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_PROC_NO == null) {
			l_CS_CALC_PROC_NO = new ArrayList();
		} else {
			l_CS_CALC_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_PROC_NO.add(((DC0010010Struct) list.get(i)).getCS_CALC_PROC_NO());
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
			l_MODIFY_COUNT.add(((DC0010010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DC0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_YEAR == null) {
			l_YEAR = new ArrayList();
		} else {
			l_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_YEAR.add(((DC0010010Struct) list.get(i)).getYEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP == null) {
			l_HALF_TERM_TYP = new ArrayList();
		} else {
			l_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP.add(((DC0010010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_CURRENT_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_YEAR == null) {
			l_CURRENT_YEAR = new ArrayList();
		} else {
			l_CURRENT_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_YEAR.add(((DC0010010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_PLANT_NAME.add(((DC0010010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_EXECUTE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXECUTE_TYP == null) {
			l_EXECUTE_TYP = new ArrayList();
		} else {
			l_EXECUTE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXECUTE_TYP.add(((DC0010010Struct) list.get(i)).getEXECUTE_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_CS_CALC_PROC_NO_DN = null;
		m_r1_ExecuteType = null;
		m_r2_ExecuteType = null;
		m_EXECUTE_STATUS_TYP_DN = null;
		m_RESULT_STATUS_TYP_DN = null;
		m_START_TIME = null;
		m_STOP_TIME = null;
		m_EXECUTE_STATUS_TYP = null;
		m_RESULT_STATUS_TYP = null;
		m_CS_CALC_PROC_NO = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_EXECUTE_TYP = null;

		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_CS_CALC_PROC_NO_DN = null;
		l_r1_ExecuteType = null;
		l_r2_ExecuteType = null;
		l_EXECUTE_STATUS_TYP_DN = null;
		l_RESULT_STATUS_TYP_DN = null;
		l_START_TIME = null;
		l_STOP_TIME = null;
		l_EXECUTE_STATUS_TYP = null;
		l_RESULT_STATUS_TYP = null;
		l_CS_CALC_PROC_NO = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_CURRENT_YEAR = null;
		l_PLANT_NAME = null;
		l_EXECUTE_TYP = null;

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
	 * medDC0010010クラスの標準コンストラクタ
	 */
	public DC0010010Struct()
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
	public void setStruct(DC0010010Struct struct)
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
	public void setStructM(DC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setCS_CALC_PROC_NO_DN(struct.getCS_CALC_PROC_NO_DN());
			this.setr1_ExecuteType(struct.getr1_ExecuteType());
			this.setr2_ExecuteType(struct.getr2_ExecuteType());
			this.setEXECUTE_STATUS_TYP_DN(struct.getEXECUTE_STATUS_TYP_DN());
			this.setRESULT_STATUS_TYP_DN(struct.getRESULT_STATUS_TYP_DN());
			this.setSTART_TIME(struct.getSTART_TIME());
			this.setSTOP_TIME(struct.getSTOP_TIME());
			this.setEXECUTE_STATUS_TYP(struct.getEXECUTE_STATUS_TYP());
			this.setRESULT_STATUS_TYP(struct.getRESULT_STATUS_TYP());
			this.setCS_CALC_PROC_NO(struct.getCS_CALC_PROC_NO());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setEXECUTE_TYP(struct.getEXECUTE_TYP());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_CS_CALC_PROC_NO_DN(struct.getList_CS_CALC_PROC_NO_DN());
			this.setList_r1_ExecuteType(struct.getList_r1_ExecuteType());
			this.setList_r2_ExecuteType(struct.getList_r2_ExecuteType());
			this.setList_EXECUTE_STATUS_TYP_DN(struct.getList_EXECUTE_STATUS_TYP_DN());
			this.setList_RESULT_STATUS_TYP_DN(struct.getList_RESULT_STATUS_TYP_DN());
			this.setList_START_TIME(struct.getList_START_TIME());
			this.setList_STOP_TIME(struct.getList_STOP_TIME());
			this.setList_EXECUTE_STATUS_TYP(struct.getList_EXECUTE_STATUS_TYP());
			this.setList_RESULT_STATUS_TYP(struct.getList_RESULT_STATUS_TYP());
			this.setList_CS_CALC_PROC_NO(struct.getList_CS_CALC_PROC_NO());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_EXECUTE_TYP(struct.getList_EXECUTE_TYP());
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
	// 第 1 変数初期値： i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// 第 2 変数初期値： i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// 第 3 変数初期値： i_CS_CALC_PROC_NO_DN


	final static String i_CS_CALC_PROC_NO_DN = null;

	// 第 4 変数初期値： i_r1_ExecuteType


	final static String i_r1_ExecuteType = null;

	// 第 5 変数初期値： i_r2_ExecuteType


	final static String i_r2_ExecuteType = null;

	// 第 6 変数初期値： i_EXECUTE_STATUS_TYP_DN


	final static String i_EXECUTE_STATUS_TYP_DN = null;

	// 第 7 変数初期値： i_RESULT_STATUS_TYP_DN


	final static String i_RESULT_STATUS_TYP_DN = null;

	// 第 8 変数初期値： i_START_TIME


	final static String i_START_TIME = null;

	// 第 9 変数初期値： i_STOP_TIME


	final static String i_STOP_TIME = null;

	// 第 10 変数初期値： i_EXECUTE_STATUS_TYP


	final static String i_EXECUTE_STATUS_TYP = null;

	// 第 11 変数初期値： i_RESULT_STATUS_TYP


	final static String i_RESULT_STATUS_TYP = null;

	// 第 12 変数初期値： i_CS_CALC_PROC_NO


	final static String i_CS_CALC_PROC_NO = null;

	// 第 13 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 14 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 15 変数初期値： i_YEAR


	final static String i_YEAR = null;

	// 第 16 変数初期値： i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// 第 17 変数初期値： i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// 第 18 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 19 変数初期値： i_EXECUTE_TYP


	final static String i_EXECUTE_TYP = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_START_TIME
        final static String i_START_TIME = null;
        // 第 2 変数初期値： i_STOP_TIME
        final static String i_STOP_TIME = null;
        // 第 3 変数初期値： i_EXECUTE_STATUS_TYP_DN
        final static String i_EXECUTE_STATUS_TYP_DN = null;
        // 第 4 変数初期値： i_EXECUTE_STATUS_TYP
        final static String i_EXECUTE_STATUS_TYP = null;
        // 第 5 変数初期値： i_RESULT_STATUS_TYP_DN
        final static String i_RESULT_STATUS_TYP_DN = null;
        // 第 6 変数初期値： i_RESULT_STATUS_TYP
        final static String i_RESULT_STATUS_TYP = null;
        // 第 7 変数初期値： i_CS_CALC_PROC_NO_DN
        final static String i_CS_CALC_PROC_NO_DN = null;
        // 第 8 変数初期値： i_CS_CALC_PROC_NO
        final static String i_CS_CALC_PROC_NO = null;
        // 第 9 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 10 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 11 変数初期値： i_YEAR
        final static String i_YEAR = null;
        // 第 12 変数初期値： i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // 第 13 変数初期値： i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // 第 14 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 15 変数初期値： i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // 第 16 変数初期値： i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // 第 17 変数初期値： i_r1_ExecuteType
        final static String i_r1_ExecuteType = null;
        // 第 18 変数初期値： i_r2_ExecuteType
        final static String i_r2_ExecuteType = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_START_TIME = i_START_TIME;
         m_STOP_TIME = i_STOP_TIME;
         m_EXECUTE_STATUS_TYP_DN = i_EXECUTE_STATUS_TYP_DN;
         m_EXECUTE_STATUS_TYP = i_EXECUTE_STATUS_TYP;
         m_RESULT_STATUS_TYP_DN = i_RESULT_STATUS_TYP_DN;
         m_RESULT_STATUS_TYP = i_RESULT_STATUS_TYP;
         m_CS_CALC_PROC_NO_DN = i_CS_CALC_PROC_NO_DN;
         m_CS_CALC_PROC_NO = i_CS_CALC_PROC_NO;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_YEAR = i_YEAR;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_PLANT_NAME = i_PLANT_NAME;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_r1_ExecuteType = i_r1_ExecuteType;
         m_r2_ExecuteType = i_r2_ExecuteType;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
