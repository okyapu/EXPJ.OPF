/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DZ0010/src/com/nec/jp/orteus/metamorBase/DZ0010/DZ0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DZ0010;

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

public class DZ0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** 第 2 変数： m_CURRENT_MONTH */
	public String m_CURRENT_MONTH = null;
	/** 第 3 変数： m_TERM */
	public String m_TERM = null;
	/** 第 4 変数： m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** 第 5 変数： m_START_MONTH */
	public String m_START_MONTH = null;
	/** 第 6 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 7 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 8 変数： m_PC_FLG */
	public String m_PC_FLG = null;
	/** 第 9 変数： m_M_CS_PROC_PRIORITY_TYP */
	public String m_M_CS_PROC_PRIORITY_TYP = null;
	/** 第 10 変数： m_M_CS_PROC_PERIOD */
	public String m_M_CS_PROC_PERIOD = null;
	/** 第 11 変数： m_M_PROC_COST_PRIORITY_TYP */
	public String m_M_PROC_COST_PRIORITY_TYP = null;
	/** 第 12 変数： m_M_PROC_COST_PERIOD */
	public String m_M_PROC_COST_PERIOD = null;
	/** 第 13 変数： m_M_CS_PUCH_PRIORITY_TYP */
	public String m_M_CS_PUCH_PRIORITY_TYP = null;
	/** 第 14 変数： m_M_CS_PUCH_PERIOD */
	public String m_M_CS_PUCH_PERIOD = null;
	/** 第 15 変数： m_CS_MAST_IF_PERIOD */
	public String m_CS_MAST_IF_PERIOD = null;
	/** 第 16 変数： m_CS_CALC_TRN_PERIOD */
	public String m_CS_CALC_TRN_PERIOD = null;
	/** 第 17 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 18 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 19 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 20 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 21 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 22 変数： m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** 第 23 変数： m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** 第 24 変数： m_PC_FLG_name */
	public String m_PC_FLG_name = null;
	/** 第 25 変数： m_PC_FLG_val */
	public String m_PC_FLG_val = null;
	/** 第 26 変数： m_M_CS_PROC_PRIORITY_TYP_name */
	public String m_M_CS_PROC_PRIORITY_TYP_name = null;
	/** 第 27 変数： m_M_CS_PROC_PRIORITY_TYP_val */
	public String m_M_CS_PROC_PRIORITY_TYP_val = null;
	/** 第 28 変数： m_M_PROC_COST_PRIORITY_TYP_name */
	public String m_M_PROC_COST_PRIORITY_TYP_name = null;
	/** 第 29 変数： m_M_PROC_COST_PRIORITY_TYP_val */
	public String m_M_PROC_COST_PRIORITY_TYP_val = null;
	/** 第 30 変数： m_M_CS_PUCH_PRIORITY_TYP_name */
	public String m_M_CS_PUCH_PRIORITY_TYP_name = null;
	/** 第 31 変数： m_M_CS_PUCH_PRIORITY_TYP_val */
	public String m_M_CS_PUCH_PRIORITY_TYP_val = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** 第 2 List変数： l_CURRENT_MONTH */
	public List l_CURRENT_MONTH = null;

	/** 第 3 List変数： l_TERM */
	public List l_TERM = null;

	/** 第 4 List変数： l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** 第 5 List変数： l_START_MONTH */
	public List l_START_MONTH = null;

	/** 第 6 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 7 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 8 List変数： l_PC_FLG */
	public List l_PC_FLG = null;

	/** 第 9 List変数： l_M_CS_PROC_PRIORITY_TYP */
	public List l_M_CS_PROC_PRIORITY_TYP = null;

	/** 第 10 List変数： l_M_CS_PROC_PERIOD */
	public List l_M_CS_PROC_PERIOD = null;

	/** 第 11 List変数： l_M_PROC_COST_PRIORITY_TYP */
	public List l_M_PROC_COST_PRIORITY_TYP = null;

	/** 第 12 List変数： l_M_PROC_COST_PERIOD */
	public List l_M_PROC_COST_PERIOD = null;

	/** 第 13 List変数： l_M_CS_PUCH_PRIORITY_TYP */
	public List l_M_CS_PUCH_PRIORITY_TYP = null;

	/** 第 14 List変数： l_M_CS_PUCH_PERIOD */
	public List l_M_CS_PUCH_PERIOD = null;

	/** 第 15 List変数： l_CS_MAST_IF_PERIOD */
	public List l_CS_MAST_IF_PERIOD = null;

	/** 第 16 List変数： l_CS_CALC_TRN_PERIOD */
	public List l_CS_CALC_TRN_PERIOD = null;

	/** 第 17 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 18 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 19 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 20 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 21 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 22 List変数： l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** 第 23 List変数： l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** 第 24 List変数： l_PC_FLG_name */
	public List l_PC_FLG_name = null;

	/** 第 25 List変数： l_PC_FLG_val */
	public List l_PC_FLG_val = null;

	/** 第 26 List変数： l_M_CS_PROC_PRIORITY_TYP_name */
	public List l_M_CS_PROC_PRIORITY_TYP_name = null;

	/** 第 27 List変数： l_M_CS_PROC_PRIORITY_TYP_val */
	public List l_M_CS_PROC_PRIORITY_TYP_val = null;

	/** 第 28 List変数： l_M_PROC_COST_PRIORITY_TYP_name */
	public List l_M_PROC_COST_PRIORITY_TYP_name = null;

	/** 第 29 List変数： l_M_PROC_COST_PRIORITY_TYP_val */
	public List l_M_PROC_COST_PRIORITY_TYP_val = null;

	/** 第 30 List変数： l_M_CS_PUCH_PRIORITY_TYP_name */
	public List l_M_CS_PUCH_PRIORITY_TYP_name = null;

	/** 第 31 List変数： l_M_CS_PUCH_PRIORITY_TYP_val */
	public List l_M_CS_PUCH_PRIORITY_TYP_val = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getCURRENT_MONTH() { return m_CURRENT_MONTH; }
	public String getTERM() { return m_TERM; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getPC_FLG() { return m_PC_FLG; }
	public String getM_CS_PROC_PRIORITY_TYP() { return m_M_CS_PROC_PRIORITY_TYP; }
	public String getM_CS_PROC_PERIOD() { return m_M_CS_PROC_PERIOD; }
	public String getM_PROC_COST_PRIORITY_TYP() { return m_M_PROC_COST_PRIORITY_TYP; }
	public String getM_PROC_COST_PERIOD() { return m_M_PROC_COST_PERIOD; }
	public String getM_CS_PUCH_PRIORITY_TYP() { return m_M_CS_PUCH_PRIORITY_TYP; }
	public String getM_CS_PUCH_PERIOD() { return m_M_CS_PUCH_PERIOD; }
	public String getCS_MAST_IF_PERIOD() { return m_CS_MAST_IF_PERIOD; }
	public String getCS_CALC_TRN_PERIOD() { return m_CS_CALC_TRN_PERIOD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getPC_FLG_name() { return m_PC_FLG_name; }
	public String getPC_FLG_val() { return m_PC_FLG_val; }
	public String getM_CS_PROC_PRIORITY_TYP_name() { return m_M_CS_PROC_PRIORITY_TYP_name; }
	public String getM_CS_PROC_PRIORITY_TYP_val() { return m_M_CS_PROC_PRIORITY_TYP_val; }
	public String getM_PROC_COST_PRIORITY_TYP_name() { return m_M_PROC_COST_PRIORITY_TYP_name; }
	public String getM_PROC_COST_PRIORITY_TYP_val() { return m_M_PROC_COST_PRIORITY_TYP_val; }
	public String getM_CS_PUCH_PRIORITY_TYP_name() { return m_M_CS_PUCH_PRIORITY_TYP_name; }
	public String getM_CS_PUCH_PRIORITY_TYP_val() { return m_M_CS_PUCH_PRIORITY_TYP_val; }

	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_CURRENT_MONTH() { return l_CURRENT_MONTH; }
	public List getList_TERM() { return l_TERM; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_START_MONTH() { return l_START_MONTH; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_PC_FLG() { return l_PC_FLG; }
	public List getList_M_CS_PROC_PRIORITY_TYP() { return l_M_CS_PROC_PRIORITY_TYP; }
	public List getList_M_CS_PROC_PERIOD() { return l_M_CS_PROC_PERIOD; }
	public List getList_M_PROC_COST_PRIORITY_TYP() { return l_M_PROC_COST_PRIORITY_TYP; }
	public List getList_M_PROC_COST_PERIOD() { return l_M_PROC_COST_PERIOD; }
	public List getList_M_CS_PUCH_PRIORITY_TYP() { return l_M_CS_PUCH_PRIORITY_TYP; }
	public List getList_M_CS_PUCH_PERIOD() { return l_M_CS_PUCH_PERIOD; }
	public List getList_CS_MAST_IF_PERIOD() { return l_CS_MAST_IF_PERIOD; }
	public List getList_CS_CALC_TRN_PERIOD() { return l_CS_CALC_TRN_PERIOD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_PC_FLG_name() { return l_PC_FLG_name; }
	public List getList_PC_FLG_val() { return l_PC_FLG_val; }
	public List getList_M_CS_PROC_PRIORITY_TYP_name() { return l_M_CS_PROC_PRIORITY_TYP_name; }
	public List getList_M_CS_PROC_PRIORITY_TYP_val() { return l_M_CS_PROC_PRIORITY_TYP_val; }
	public List getList_M_PROC_COST_PRIORITY_TYP_name() { return l_M_PROC_COST_PRIORITY_TYP_name; }
	public List getList_M_PROC_COST_PRIORITY_TYP_val() { return l_M_PROC_COST_PRIORITY_TYP_val; }
	public List getList_M_CS_PUCH_PRIORITY_TYP_name() { return l_M_CS_PUCH_PRIORITY_TYP_name; }
	public List getList_M_CS_PUCH_PRIORITY_TYP_val() { return l_M_CS_PUCH_PRIORITY_TYP_val; }

	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setCURRENT_MONTH(String val) { m_CURRENT_MONTH = val; }
	public void setTERM(String val) { m_TERM = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setSTART_MONTH(String val) { m_START_MONTH = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setPC_FLG(String val) { m_PC_FLG = val; }
	public void setM_CS_PROC_PRIORITY_TYP(String val) { m_M_CS_PROC_PRIORITY_TYP = val; }
	public void setM_CS_PROC_PERIOD(String val) { m_M_CS_PROC_PERIOD = val; }
	public void setM_PROC_COST_PRIORITY_TYP(String val) { m_M_PROC_COST_PRIORITY_TYP = val; }
	public void setM_PROC_COST_PERIOD(String val) { m_M_PROC_COST_PERIOD = val; }
	public void setM_CS_PUCH_PRIORITY_TYP(String val) { m_M_CS_PUCH_PRIORITY_TYP = val; }
	public void setM_CS_PUCH_PERIOD(String val) { m_M_CS_PUCH_PERIOD = val; }
	public void setCS_MAST_IF_PERIOD(String val) { m_CS_MAST_IF_PERIOD = val; }
	public void setCS_CALC_TRN_PERIOD(String val) { m_CS_CALC_TRN_PERIOD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setPC_FLG_name(String val) { m_PC_FLG_name = val; }
	public void setPC_FLG_val(String val) { m_PC_FLG_val = val; }
	public void setM_CS_PROC_PRIORITY_TYP_name(String val) { m_M_CS_PROC_PRIORITY_TYP_name = val; }
	public void setM_CS_PROC_PRIORITY_TYP_val(String val) { m_M_CS_PROC_PRIORITY_TYP_val = val; }
	public void setM_PROC_COST_PRIORITY_TYP_name(String val) { m_M_PROC_COST_PRIORITY_TYP_name = val; }
	public void setM_PROC_COST_PRIORITY_TYP_val(String val) { m_M_PROC_COST_PRIORITY_TYP_val = val; }
	public void setM_CS_PUCH_PRIORITY_TYP_name(String val) { m_M_CS_PUCH_PRIORITY_TYP_name = val; }
	public void setM_CS_PUCH_PRIORITY_TYP_val(String val) { m_M_CS_PUCH_PRIORITY_TYP_val = val; }


	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_CURRENT_MONTH(List list) { l_CURRENT_MONTH = list; }
	public void setList_TERM(List list) { l_TERM = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_START_MONTH(List list) { l_START_MONTH = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_PC_FLG(List list) { l_PC_FLG = list; }
	public void setList_M_CS_PROC_PRIORITY_TYP(List list) { l_M_CS_PROC_PRIORITY_TYP = list; }
	public void setList_M_CS_PROC_PERIOD(List list) { l_M_CS_PROC_PERIOD = list; }
	public void setList_M_PROC_COST_PRIORITY_TYP(List list) { l_M_PROC_COST_PRIORITY_TYP = list; }
	public void setList_M_PROC_COST_PERIOD(List list) { l_M_PROC_COST_PERIOD = list; }
	public void setList_M_CS_PUCH_PRIORITY_TYP(List list) { l_M_CS_PUCH_PRIORITY_TYP = list; }
	public void setList_M_CS_PUCH_PERIOD(List list) { l_M_CS_PUCH_PERIOD = list; }
	public void setList_CS_MAST_IF_PERIOD(List list) { l_CS_MAST_IF_PERIOD = list; }
	public void setList_CS_CALC_TRN_PERIOD(List list) { l_CS_CALC_TRN_PERIOD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_PC_FLG_name(List list) { l_PC_FLG_name = list; }
	public void setList_PC_FLG_val(List list) { l_PC_FLG_val = list; }
	public void setList_M_CS_PROC_PRIORITY_TYP_name(List list) { l_M_CS_PROC_PRIORITY_TYP_name = list; }
	public void setList_M_CS_PROC_PRIORITY_TYP_val(List list) { l_M_CS_PROC_PRIORITY_TYP_val = list; }
	public void setList_M_PROC_COST_PRIORITY_TYP_name(List list) { l_M_PROC_COST_PRIORITY_TYP_name = list; }
	public void setList_M_PROC_COST_PRIORITY_TYP_val(List list) { l_M_PROC_COST_PRIORITY_TYP_val = list; }
	public void setList_M_CS_PUCH_PRIORITY_TYP_name(List list) { l_M_CS_PUCH_PRIORITY_TYP_name = list; }
	public void setList_M_CS_PUCH_PRIORITY_TYP_val(List list) { l_M_CS_PUCH_PRIORITY_TYP_val = list; }

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
			l_CURRENT_YEAR.add(((DZ0010010Struct) list.get(i)).getCURRENT_YEAR());
		}
		return size;
	}
	public int setL2L_CURRENT_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_MONTH == null) {
			l_CURRENT_MONTH = new ArrayList();
		} else {
			l_CURRENT_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_MONTH.add(((DZ0010010Struct) list.get(i)).getCURRENT_MONTH());
		}
		return size;
	}
	public int setL2L_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TERM == null) {
			l_TERM = new ArrayList();
		} else {
			l_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TERM.add(((DZ0010010Struct) list.get(i)).getTERM());
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
			l_HALF_TERM_TYP.add(((DZ0010010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_START_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_MONTH == null) {
			l_START_MONTH = new ArrayList();
		} else {
			l_START_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_MONTH.add(((DZ0010010Struct) list.get(i)).getSTART_MONTH());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((DZ0010010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((DZ0010010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_PC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PC_FLG == null) {
			l_PC_FLG = new ArrayList();
		} else {
			l_PC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PC_FLG.add(((DZ0010010Struct) list.get(i)).getPC_FLG());
		}
		return size;
	}
	public int setL2L_M_CS_PROC_PRIORITY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PROC_PRIORITY_TYP == null) {
			l_M_CS_PROC_PRIORITY_TYP = new ArrayList();
		} else {
			l_M_CS_PROC_PRIORITY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PROC_PRIORITY_TYP.add(((DZ0010010Struct) list.get(i)).getM_CS_PROC_PRIORITY_TYP());
		}
		return size;
	}
	public int setL2L_M_CS_PROC_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PROC_PERIOD == null) {
			l_M_CS_PROC_PERIOD = new ArrayList();
		} else {
			l_M_CS_PROC_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PROC_PERIOD.add(((DZ0010010Struct) list.get(i)).getM_CS_PROC_PERIOD());
		}
		return size;
	}
	public int setL2L_M_PROC_COST_PRIORITY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PROC_COST_PRIORITY_TYP == null) {
			l_M_PROC_COST_PRIORITY_TYP = new ArrayList();
		} else {
			l_M_PROC_COST_PRIORITY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PROC_COST_PRIORITY_TYP.add(((DZ0010010Struct) list.get(i)).getM_PROC_COST_PRIORITY_TYP());
		}
		return size;
	}
	public int setL2L_M_PROC_COST_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PROC_COST_PERIOD == null) {
			l_M_PROC_COST_PERIOD = new ArrayList();
		} else {
			l_M_PROC_COST_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PROC_COST_PERIOD.add(((DZ0010010Struct) list.get(i)).getM_PROC_COST_PERIOD());
		}
		return size;
	}
	public int setL2L_M_CS_PUCH_PRIORITY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PUCH_PRIORITY_TYP == null) {
			l_M_CS_PUCH_PRIORITY_TYP = new ArrayList();
		} else {
			l_M_CS_PUCH_PRIORITY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PUCH_PRIORITY_TYP.add(((DZ0010010Struct) list.get(i)).getM_CS_PUCH_PRIORITY_TYP());
		}
		return size;
	}
	public int setL2L_M_CS_PUCH_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PUCH_PERIOD == null) {
			l_M_CS_PUCH_PERIOD = new ArrayList();
		} else {
			l_M_CS_PUCH_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PUCH_PERIOD.add(((DZ0010010Struct) list.get(i)).getM_CS_PUCH_PERIOD());
		}
		return size;
	}
	public int setL2L_CS_MAST_IF_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_MAST_IF_PERIOD == null) {
			l_CS_MAST_IF_PERIOD = new ArrayList();
		} else {
			l_CS_MAST_IF_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_MAST_IF_PERIOD.add(((DZ0010010Struct) list.get(i)).getCS_MAST_IF_PERIOD());
		}
		return size;
	}
	public int setL2L_CS_CALC_TRN_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_TRN_PERIOD == null) {
			l_CS_CALC_TRN_PERIOD = new ArrayList();
		} else {
			l_CS_CALC_TRN_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_TRN_PERIOD.add(((DZ0010010Struct) list.get(i)).getCS_CALC_TRN_PERIOD());
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
			l_MODIFY_COUNT.add(((DZ0010010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DZ0010010Struct) list.get(i)).getPLANT_CD());
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
			l_COMPANY_CD.add(((DZ0010010Struct) list.get(i)).getCOMPANY_CD());
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
			l_PLANT_NAME.add(((DZ0010010Struct) list.get(i)).getPLANT_NAME());
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
			l_h_PLANT_CD.add(((DZ0010010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
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
			l_HALF_TERM_TYP_name.add(((DZ0010010Struct) list.get(i)).getHALF_TERM_TYP_name());
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
			l_HALF_TERM_TYP_val.add(((DZ0010010Struct) list.get(i)).getHALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_PC_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PC_FLG_name == null) {
			l_PC_FLG_name = new ArrayList();
		} else {
			l_PC_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PC_FLG_name.add(((DZ0010010Struct) list.get(i)).getPC_FLG_name());
		}
		return size;
	}
	public int setL2L_PC_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PC_FLG_val == null) {
			l_PC_FLG_val = new ArrayList();
		} else {
			l_PC_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PC_FLG_val.add(((DZ0010010Struct) list.get(i)).getPC_FLG_val());
		}
		return size;
	}
	public int setL2L_M_CS_PROC_PRIORITY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PROC_PRIORITY_TYP_name == null) {
			l_M_CS_PROC_PRIORITY_TYP_name = new ArrayList();
		} else {
			l_M_CS_PROC_PRIORITY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PROC_PRIORITY_TYP_name.add(((DZ0010010Struct) list.get(i)).getM_CS_PROC_PRIORITY_TYP_name());
		}
		return size;
	}
	public int setL2L_M_CS_PROC_PRIORITY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PROC_PRIORITY_TYP_val == null) {
			l_M_CS_PROC_PRIORITY_TYP_val = new ArrayList();
		} else {
			l_M_CS_PROC_PRIORITY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PROC_PRIORITY_TYP_val.add(((DZ0010010Struct) list.get(i)).getM_CS_PROC_PRIORITY_TYP_val());
		}
		return size;
	}
	public int setL2L_M_PROC_COST_PRIORITY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PROC_COST_PRIORITY_TYP_name == null) {
			l_M_PROC_COST_PRIORITY_TYP_name = new ArrayList();
		} else {
			l_M_PROC_COST_PRIORITY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PROC_COST_PRIORITY_TYP_name.add(((DZ0010010Struct) list.get(i)).getM_PROC_COST_PRIORITY_TYP_name());
		}
		return size;
	}
	public int setL2L_M_PROC_COST_PRIORITY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PROC_COST_PRIORITY_TYP_val == null) {
			l_M_PROC_COST_PRIORITY_TYP_val = new ArrayList();
		} else {
			l_M_PROC_COST_PRIORITY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PROC_COST_PRIORITY_TYP_val.add(((DZ0010010Struct) list.get(i)).getM_PROC_COST_PRIORITY_TYP_val());
		}
		return size;
	}
	public int setL2L_M_CS_PUCH_PRIORITY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PUCH_PRIORITY_TYP_name == null) {
			l_M_CS_PUCH_PRIORITY_TYP_name = new ArrayList();
		} else {
			l_M_CS_PUCH_PRIORITY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PUCH_PRIORITY_TYP_name.add(((DZ0010010Struct) list.get(i)).getM_CS_PUCH_PRIORITY_TYP_name());
		}
		return size;
	}
	public int setL2L_M_CS_PUCH_PRIORITY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PUCH_PRIORITY_TYP_val == null) {
			l_M_CS_PUCH_PRIORITY_TYP_val = new ArrayList();
		} else {
			l_M_CS_PUCH_PRIORITY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PUCH_PRIORITY_TYP_val.add(((DZ0010010Struct) list.get(i)).getM_CS_PUCH_PRIORITY_TYP_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CURRENT_YEAR = null;
		m_CURRENT_MONTH = null;
		m_TERM = null;
		m_HALF_TERM_TYP = null;
		m_START_MONTH = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_PC_FLG = null;
		m_M_CS_PROC_PRIORITY_TYP = null;
		m_M_CS_PROC_PERIOD = null;
		m_M_PROC_COST_PRIORITY_TYP = null;
		m_M_PROC_COST_PERIOD = null;
		m_M_CS_PUCH_PRIORITY_TYP = null;
		m_M_CS_PUCH_PERIOD = null;
		m_CS_MAST_IF_PERIOD = null;
		m_CS_CALC_TRN_PERIOD = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_COMPANY_CD = null;
		m_PLANT_NAME = null;
		m_h_PLANT_CD = null;
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_PC_FLG_name = null;
		m_PC_FLG_val = null;
		m_M_CS_PROC_PRIORITY_TYP_name = null;
		m_M_CS_PROC_PRIORITY_TYP_val = null;
		m_M_PROC_COST_PRIORITY_TYP_name = null;
		m_M_PROC_COST_PRIORITY_TYP_val = null;
		m_M_CS_PUCH_PRIORITY_TYP_name = null;
		m_M_CS_PUCH_PRIORITY_TYP_val = null;

		l_CURRENT_YEAR = null;
		l_CURRENT_MONTH = null;
		l_TERM = null;
		l_HALF_TERM_TYP = null;
		l_START_MONTH = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_PC_FLG = null;
		l_M_CS_PROC_PRIORITY_TYP = null;
		l_M_CS_PROC_PERIOD = null;
		l_M_PROC_COST_PRIORITY_TYP = null;
		l_M_PROC_COST_PERIOD = null;
		l_M_CS_PUCH_PRIORITY_TYP = null;
		l_M_CS_PUCH_PERIOD = null;
		l_CS_MAST_IF_PERIOD = null;
		l_CS_CALC_TRN_PERIOD = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_COMPANY_CD = null;
		l_PLANT_NAME = null;
		l_h_PLANT_CD = null;
		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_PC_FLG_name = null;
		l_PC_FLG_val = null;
		l_M_CS_PROC_PRIORITY_TYP_name = null;
		l_M_CS_PROC_PRIORITY_TYP_val = null;
		l_M_PROC_COST_PRIORITY_TYP_name = null;
		l_M_PROC_COST_PRIORITY_TYP_val = null;
		l_M_CS_PUCH_PRIORITY_TYP_name = null;
		l_M_CS_PUCH_PRIORITY_TYP_val = null;

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
	 * medDZ0010010クラスの標準コンストラクタ
	 */
	public DZ0010010Struct()
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
	public void setStruct(DZ0010010Struct struct)
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
	public void setStructM(DZ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setCURRENT_MONTH(struct.getCURRENT_MONTH());
			this.setTERM(struct.getTERM());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setSTART_MONTH(struct.getSTART_MONTH());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setPC_FLG(struct.getPC_FLG());
			this.setM_CS_PROC_PRIORITY_TYP(struct.getM_CS_PROC_PRIORITY_TYP());
			this.setM_CS_PROC_PERIOD(struct.getM_CS_PROC_PERIOD());
			this.setM_PROC_COST_PRIORITY_TYP(struct.getM_PROC_COST_PRIORITY_TYP());
			this.setM_PROC_COST_PERIOD(struct.getM_PROC_COST_PERIOD());
			this.setM_CS_PUCH_PRIORITY_TYP(struct.getM_CS_PUCH_PRIORITY_TYP());
			this.setM_CS_PUCH_PERIOD(struct.getM_CS_PUCH_PERIOD());
			this.setCS_MAST_IF_PERIOD(struct.getCS_MAST_IF_PERIOD());
			this.setCS_CALC_TRN_PERIOD(struct.getCS_CALC_TRN_PERIOD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setPC_FLG_name(struct.getPC_FLG_name());
			this.setPC_FLG_val(struct.getPC_FLG_val());
			this.setM_CS_PROC_PRIORITY_TYP_name(struct.getM_CS_PROC_PRIORITY_TYP_name());
			this.setM_CS_PROC_PRIORITY_TYP_val(struct.getM_CS_PROC_PRIORITY_TYP_val());
			this.setM_PROC_COST_PRIORITY_TYP_name(struct.getM_PROC_COST_PRIORITY_TYP_name());
			this.setM_PROC_COST_PRIORITY_TYP_val(struct.getM_PROC_COST_PRIORITY_TYP_val());
			this.setM_CS_PUCH_PRIORITY_TYP_name(struct.getM_CS_PUCH_PRIORITY_TYP_name());
			this.setM_CS_PUCH_PRIORITY_TYP_val(struct.getM_CS_PUCH_PRIORITY_TYP_val());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DZ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_CURRENT_MONTH(struct.getList_CURRENT_MONTH());
			this.setList_TERM(struct.getList_TERM());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_START_MONTH(struct.getList_START_MONTH());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_PC_FLG(struct.getList_PC_FLG());
			this.setList_M_CS_PROC_PRIORITY_TYP(struct.getList_M_CS_PROC_PRIORITY_TYP());
			this.setList_M_CS_PROC_PERIOD(struct.getList_M_CS_PROC_PERIOD());
			this.setList_M_PROC_COST_PRIORITY_TYP(struct.getList_M_PROC_COST_PRIORITY_TYP());
			this.setList_M_PROC_COST_PERIOD(struct.getList_M_PROC_COST_PERIOD());
			this.setList_M_CS_PUCH_PRIORITY_TYP(struct.getList_M_CS_PUCH_PRIORITY_TYP());
			this.setList_M_CS_PUCH_PERIOD(struct.getList_M_CS_PUCH_PERIOD());
			this.setList_CS_MAST_IF_PERIOD(struct.getList_CS_MAST_IF_PERIOD());
			this.setList_CS_CALC_TRN_PERIOD(struct.getList_CS_CALC_TRN_PERIOD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_PC_FLG_name(struct.getList_PC_FLG_name());
			this.setList_PC_FLG_val(struct.getList_PC_FLG_val());
			this.setList_M_CS_PROC_PRIORITY_TYP_name(struct.getList_M_CS_PROC_PRIORITY_TYP_name());
			this.setList_M_CS_PROC_PRIORITY_TYP_val(struct.getList_M_CS_PROC_PRIORITY_TYP_val());
			this.setList_M_PROC_COST_PRIORITY_TYP_name(struct.getList_M_PROC_COST_PRIORITY_TYP_name());
			this.setList_M_PROC_COST_PRIORITY_TYP_val(struct.getList_M_PROC_COST_PRIORITY_TYP_val());
			this.setList_M_CS_PUCH_PRIORITY_TYP_name(struct.getList_M_CS_PUCH_PRIORITY_TYP_name());
			this.setList_M_CS_PUCH_PRIORITY_TYP_val(struct.getList_M_CS_PUCH_PRIORITY_TYP_val());
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
	// 第 1 変数初期値： i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// 第 2 変数初期値： i_CURRENT_MONTH


	final static String i_CURRENT_MONTH = null;

	// 第 3 変数初期値： i_TERM


	final static String i_TERM = null;

	// 第 4 変数初期値： i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// 第 5 変数初期値： i_START_MONTH


	final static String i_START_MONTH = null;

	// 第 6 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 7 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 8 変数初期値： i_PC_FLG


	final static String i_PC_FLG = null;

	// 第 9 変数初期値： i_M_CS_PROC_PRIORITY_TYP


	final static String i_M_CS_PROC_PRIORITY_TYP = null;

	// 第 10 変数初期値： i_M_CS_PROC_PERIOD


	final static String i_M_CS_PROC_PERIOD = null;

	// 第 11 変数初期値： i_M_PROC_COST_PRIORITY_TYP


	final static String i_M_PROC_COST_PRIORITY_TYP = null;

	// 第 12 変数初期値： i_M_PROC_COST_PERIOD


	final static String i_M_PROC_COST_PERIOD = null;

	// 第 13 変数初期値： i_M_CS_PUCH_PRIORITY_TYP


	final static String i_M_CS_PUCH_PRIORITY_TYP = null;

	// 第 14 変数初期値： i_M_CS_PUCH_PERIOD


	final static String i_M_CS_PUCH_PERIOD = null;

	// 第 15 変数初期値： i_CS_MAST_IF_PERIOD


	final static String i_CS_MAST_IF_PERIOD = null;

	// 第 16 変数初期値： i_CS_CALC_TRN_PERIOD


	final static String i_CS_CALC_TRN_PERIOD = null;

	// 第 17 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 18 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 19 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 20 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 21 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 22 変数初期値： i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// 第 23 変数初期値： i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// 第 24 変数初期値： i_PC_FLG_name


	final static String i_PC_FLG_name = null;

	// 第 25 変数初期値： i_PC_FLG_val


	final static String i_PC_FLG_val = null;

	// 第 26 変数初期値： i_M_CS_PROC_PRIORITY_TYP_name


	final static String i_M_CS_PROC_PRIORITY_TYP_name = null;

	// 第 27 変数初期値： i_M_CS_PROC_PRIORITY_TYP_val


	final static String i_M_CS_PROC_PRIORITY_TYP_val = null;

	// 第 28 変数初期値： i_M_PROC_COST_PRIORITY_TYP_name


	final static String i_M_PROC_COST_PRIORITY_TYP_name = null;

	// 第 29 変数初期値： i_M_PROC_COST_PRIORITY_TYP_val


	final static String i_M_PROC_COST_PRIORITY_TYP_val = null;

	// 第 30 変数初期値： i_M_CS_PUCH_PRIORITY_TYP_name


	final static String i_M_CS_PUCH_PRIORITY_TYP_name = null;

	// 第 31 変数初期値： i_M_CS_PUCH_PRIORITY_TYP_val


	final static String i_M_CS_PUCH_PRIORITY_TYP_val = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // 第 2 変数初期値： i_CURRENT_MONTH
        final static String i_CURRENT_MONTH = null;
        // 第 3 変数初期値： i_TERM
        final static String i_TERM = null;
        // 第 4 変数初期値： i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // 第 5 変数初期値： i_START_MONTH
        final static String i_START_MONTH = null;
        // 第 6 変数初期値： i_ORG_CD
        final static String i_ORG_CD = null;
        // 第 7 変数初期値： i_ORG_NAME
        final static String i_ORG_NAME = null;
        // 第 8 変数初期値： i_PC_FLG
        final static String i_PC_FLG = null;
        // 第 9 変数初期値： i_M_CS_PROC_PRIORITY_TYP
        final static String i_M_CS_PROC_PRIORITY_TYP = null;
        // 第 10 変数初期値： i_M_CS_PROC_PERIOD
        final static String i_M_CS_PROC_PERIOD = null;
        // 第 11 変数初期値： i_M_PROC_COST_PRIORITY_TYP
        final static String i_M_PROC_COST_PRIORITY_TYP = null;
        // 第 12 変数初期値： i_M_PROC_COST_PERIOD
        final static String i_M_PROC_COST_PERIOD = null;
        // 第 13 変数初期値： i_M_CS_PUCH_PRIORITY_TYP
        final static String i_M_CS_PUCH_PRIORITY_TYP = null;
        // 第 14 変数初期値： i_M_CS_PUCH_PERIOD
        final static String i_M_CS_PUCH_PERIOD = null;
        // 第 15 変数初期値： i_CS_MAST_IF_PERIOD
        final static String i_CS_MAST_IF_PERIOD = null;
        // 第 16 変数初期値： i_CS_CALC_TRN_PERIOD
        final static String i_CS_CALC_TRN_PERIOD = null;
        // 第 17 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 18 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 19 変数初期値： i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // 第 20 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 21 変数初期値： i_h_PLANT_CD
        final static String i_h_PLANT_CD = null;
        // 第 22 変数初期値： i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // 第 23 変数初期値： i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // 第 24 変数初期値： i_PC_FLG_name
        final static String i_PC_FLG_name = null;
        // 第 25 変数初期値： i_PC_FLG_val
        final static String i_PC_FLG_val = null;
        // 第 26 変数初期値： i_M_CS_PROC_PRIORITY_TYP_name
        final static String i_M_CS_PROC_PRIORITY_TYP_name = null;
        // 第 27 変数初期値： i_M_CS_PROC_PRIORITY_TYP_val
        final static String i_M_CS_PROC_PRIORITY_TYP_val = null;
        // 第 28 変数初期値： i_M_PROC_COST_PRIORITY_TYP_name
        final static String i_M_PROC_COST_PRIORITY_TYP_name = null;
        // 第 29 変数初期値： i_M_PROC_COST_PRIORITY_TYP_val
        final static String i_M_PROC_COST_PRIORITY_TYP_val = null;
        // 第 30 変数初期値： i_M_CS_PUCH_PRIORITY_TYP_name
        final static String i_M_CS_PUCH_PRIORITY_TYP_name = null;
        // 第 31 変数初期値： i_M_CS_PUCH_PRIORITY_TYP_val
        final static String i_M_CS_PUCH_PRIORITY_TYP_val = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_CURRENT_MONTH = i_CURRENT_MONTH;
         m_TERM = i_TERM;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_START_MONTH = i_START_MONTH;
         m_ORG_CD = i_ORG_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_PC_FLG = i_PC_FLG;
         m_M_CS_PROC_PRIORITY_TYP = i_M_CS_PROC_PRIORITY_TYP;
         m_M_CS_PROC_PERIOD = i_M_CS_PROC_PERIOD;
         m_M_PROC_COST_PRIORITY_TYP = i_M_PROC_COST_PRIORITY_TYP;
         m_M_PROC_COST_PERIOD = i_M_PROC_COST_PERIOD;
         m_M_CS_PUCH_PRIORITY_TYP = i_M_CS_PUCH_PRIORITY_TYP;
         m_M_CS_PUCH_PERIOD = i_M_CS_PUCH_PERIOD;
         m_CS_MAST_IF_PERIOD = i_CS_MAST_IF_PERIOD;
         m_CS_CALC_TRN_PERIOD = i_CS_CALC_TRN_PERIOD;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_COMPANY_CD = i_COMPANY_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_PC_FLG_name = i_PC_FLG_name;
         m_PC_FLG_val = i_PC_FLG_val;
         m_M_CS_PROC_PRIORITY_TYP_name = i_M_CS_PROC_PRIORITY_TYP_name;
         m_M_CS_PROC_PRIORITY_TYP_val = i_M_CS_PROC_PRIORITY_TYP_val;
         m_M_PROC_COST_PRIORITY_TYP_name = i_M_PROC_COST_PRIORITY_TYP_name;
         m_M_PROC_COST_PRIORITY_TYP_val = i_M_PROC_COST_PRIORITY_TYP_val;
         m_M_CS_PUCH_PRIORITY_TYP_name = i_M_CS_PUCH_PRIORITY_TYP_name;
         m_M_CS_PUCH_PRIORITY_TYP_val = i_M_CS_PUCH_PRIORITY_TYP_val;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
