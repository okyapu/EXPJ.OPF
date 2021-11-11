/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0120/src/com/nec/jp/orteus/metamorBase/AA0120/AA0120010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0120;

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

public class AA0120010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_l_EXCH_TYP_DN */
	public String m_l_EXCH_TYP_DN = null;
	/** 第 2 変数： m_EXCH_TYP_name */
	public String m_EXCH_TYP_name = null;
	/** 第 3 変数： m_EXCH_TYP_val */
	public String m_EXCH_TYP_val = null;
	/** 第 4 変数： m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** 第 5 変数： m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** 第 6 変数： m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** 第 7 変数： m_h_APR_EXCH_RATE */
	public String m_h_APR_EXCH_RATE = null;
	/** 第 8 変数： m_EXCH_TYP_K_name */
	public String m_EXCH_TYP_K_name = null;
	/** 第 9 変数： m_EXCH_TYP_K_val */
	public String m_EXCH_TYP_K_val = null;
	/** 第 10 変数： m_l_EXCH_TYP */
	public String m_l_EXCH_TYP = null;
	/** 第 11 変数： m_l_EXCH_RESERVE_CD */
	public String m_l_EXCH_RESERVE_CD = null;
	/** 第 12 変数： m_l_EXCH_START_DATE */
	public String m_l_EXCH_START_DATE = null;
	/** 第 13 変数： m_l_EXCH_RATE */
	public String m_l_EXCH_RATE = null;
	/** 第 14 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 15 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 16 変数： m_EXCH_TYP_K */
	public String m_EXCH_TYP_K = null;
	/** 第 17 変数： m_EXCH_RESERVE_CD_K */
	public String m_EXCH_RESERVE_CD_K = null;
	/** 第 18 変数： m_EXCH_START_DATE_K */
	public String m_EXCH_START_DATE_K = null;
	/** 第 19 変数： m_EXCH_END_DATE_K */
	public String m_EXCH_END_DATE_K = null;
	/** 第 20 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 21 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 22 変数： m_CUR_SYMBOL */
	public String m_CUR_SYMBOL = null;
	/** 第 23 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 24 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 25 変数： m_EXCH_RESERVE_CD */
	public String m_EXCH_RESERVE_CD = null;
	/** 第 26 変数： m_EXCH_START_DATE */
	public String m_EXCH_START_DATE = null;
	/** 第 27 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 28 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 29 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 30 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 31 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_l_EXCH_TYP_DN */
	public List l_l_EXCH_TYP_DN = null;

	/** 第 2 List変数： l_EXCH_TYP_name */
	public List l_EXCH_TYP_name = null;

	/** 第 3 List変数： l_EXCH_TYP_val */
	public List l_EXCH_TYP_val = null;

	/** 第 4 List変数： l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** 第 5 List変数： l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** 第 6 List変数： l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** 第 7 List変数： l_h_APR_EXCH_RATE */
	public List l_h_APR_EXCH_RATE = null;

	/** 第 8 List変数： l_EXCH_TYP_K_name */
	public List l_EXCH_TYP_K_name = null;

	/** 第 9 List変数： l_EXCH_TYP_K_val */
	public List l_EXCH_TYP_K_val = null;

	/** 第 10 List変数： l_l_EXCH_TYP */
	public List l_l_EXCH_TYP = null;

	/** 第 11 List変数： l_l_EXCH_RESERVE_CD */
	public List l_l_EXCH_RESERVE_CD = null;

	/** 第 12 List変数： l_l_EXCH_START_DATE */
	public List l_l_EXCH_START_DATE = null;

	/** 第 13 List変数： l_l_EXCH_RATE */
	public List l_l_EXCH_RATE = null;

	/** 第 14 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 15 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 16 List変数： l_EXCH_TYP_K */
	public List l_EXCH_TYP_K = null;

	/** 第 17 List変数： l_EXCH_RESERVE_CD_K */
	public List l_EXCH_RESERVE_CD_K = null;

	/** 第 18 List変数： l_EXCH_START_DATE_K */
	public List l_EXCH_START_DATE_K = null;

	/** 第 19 List変数： l_EXCH_END_DATE_K */
	public List l_EXCH_END_DATE_K = null;

	/** 第 20 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 21 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 22 List変数： l_CUR_SYMBOL */
	public List l_CUR_SYMBOL = null;

	/** 第 23 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 24 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 25 List変数： l_EXCH_RESERVE_CD */
	public List l_EXCH_RESERVE_CD = null;

	/** 第 26 List変数： l_EXCH_START_DATE */
	public List l_EXCH_START_DATE = null;

	/** 第 27 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 28 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 29 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 30 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 31 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getl_EXCH_TYP_DN() { return m_l_EXCH_TYP_DN; }
	public String getEXCH_TYP_name() { return m_EXCH_TYP_name; }
	public String getEXCH_TYP_val() { return m_EXCH_TYP_val; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_EXCH_RATE() { return m_h_APR_EXCH_RATE; }
	public String getEXCH_TYP_K_name() { return m_EXCH_TYP_K_name; }
	public String getEXCH_TYP_K_val() { return m_EXCH_TYP_K_val; }
	public String getl_EXCH_TYP() { return m_l_EXCH_TYP; }
	public String getl_EXCH_RESERVE_CD() { return m_l_EXCH_RESERVE_CD; }
	public String getl_EXCH_START_DATE() { return m_l_EXCH_START_DATE; }
	public String getl_EXCH_RATE() { return m_l_EXCH_RATE; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP_K() { return m_EXCH_TYP_K; }
	public String getEXCH_RESERVE_CD_K() { return m_EXCH_RESERVE_CD_K; }
	public String getEXCH_START_DATE_K() { return m_EXCH_START_DATE_K; }
	public String getEXCH_END_DATE_K() { return m_EXCH_END_DATE_K; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getCUR_SYMBOL() { return m_CUR_SYMBOL; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getEXCH_RESERVE_CD() { return m_EXCH_RESERVE_CD; }
	public String getEXCH_START_DATE() { return m_EXCH_START_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_l_EXCH_TYP_DN() { return l_l_EXCH_TYP_DN; }
	public List getList_EXCH_TYP_name() { return l_EXCH_TYP_name; }
	public List getList_EXCH_TYP_val() { return l_EXCH_TYP_val; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_EXCH_RATE() { return l_h_APR_EXCH_RATE; }
	public List getList_EXCH_TYP_K_name() { return l_EXCH_TYP_K_name; }
	public List getList_EXCH_TYP_K_val() { return l_EXCH_TYP_K_val; }
	public List getList_l_EXCH_TYP() { return l_l_EXCH_TYP; }
	public List getList_l_EXCH_RESERVE_CD() { return l_l_EXCH_RESERVE_CD; }
	public List getList_l_EXCH_START_DATE() { return l_l_EXCH_START_DATE; }
	public List getList_l_EXCH_RATE() { return l_l_EXCH_RATE; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP_K() { return l_EXCH_TYP_K; }
	public List getList_EXCH_RESERVE_CD_K() { return l_EXCH_RESERVE_CD_K; }
	public List getList_EXCH_START_DATE_K() { return l_EXCH_START_DATE_K; }
	public List getList_EXCH_END_DATE_K() { return l_EXCH_END_DATE_K; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_CUR_SYMBOL() { return l_CUR_SYMBOL; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_EXCH_RESERVE_CD() { return l_EXCH_RESERVE_CD; }
	public List getList_EXCH_START_DATE() { return l_EXCH_START_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setl_EXCH_TYP_DN(String val) { m_l_EXCH_TYP_DN = val; }
	public void setEXCH_TYP_name(String val) { m_EXCH_TYP_name = val; }
	public void setEXCH_TYP_val(String val) { m_EXCH_TYP_val = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_EXCH_RATE(String val) { m_h_APR_EXCH_RATE = val; }
	public void setEXCH_TYP_K_name(String val) { m_EXCH_TYP_K_name = val; }
	public void setEXCH_TYP_K_val(String val) { m_EXCH_TYP_K_val = val; }
	public void setl_EXCH_TYP(String val) { m_l_EXCH_TYP = val; }
	public void setl_EXCH_RESERVE_CD(String val) { m_l_EXCH_RESERVE_CD = val; }
	public void setl_EXCH_START_DATE(String val) { m_l_EXCH_START_DATE = val; }
	public void setl_EXCH_RATE(String val) { m_l_EXCH_RATE = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP_K(String val) { m_EXCH_TYP_K = val; }
	public void setEXCH_RESERVE_CD_K(String val) { m_EXCH_RESERVE_CD_K = val; }
	public void setEXCH_START_DATE_K(String val) { m_EXCH_START_DATE_K = val; }
	public void setEXCH_END_DATE_K(String val) { m_EXCH_END_DATE_K = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setCUR_SYMBOL(String val) { m_CUR_SYMBOL = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setEXCH_RESERVE_CD(String val) { m_EXCH_RESERVE_CD = val; }
	public void setEXCH_START_DATE(String val) { m_EXCH_START_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_l_EXCH_TYP_DN(List list) { l_l_EXCH_TYP_DN = list; }
	public void setList_EXCH_TYP_name(List list) { l_EXCH_TYP_name = list; }
	public void setList_EXCH_TYP_val(List list) { l_EXCH_TYP_val = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_EXCH_RATE(List list) { l_h_APR_EXCH_RATE = list; }
	public void setList_EXCH_TYP_K_name(List list) { l_EXCH_TYP_K_name = list; }
	public void setList_EXCH_TYP_K_val(List list) { l_EXCH_TYP_K_val = list; }
	public void setList_l_EXCH_TYP(List list) { l_l_EXCH_TYP = list; }
	public void setList_l_EXCH_RESERVE_CD(List list) { l_l_EXCH_RESERVE_CD = list; }
	public void setList_l_EXCH_START_DATE(List list) { l_l_EXCH_START_DATE = list; }
	public void setList_l_EXCH_RATE(List list) { l_l_EXCH_RATE = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP_K(List list) { l_EXCH_TYP_K = list; }
	public void setList_EXCH_RESERVE_CD_K(List list) { l_EXCH_RESERVE_CD_K = list; }
	public void setList_EXCH_START_DATE_K(List list) { l_EXCH_START_DATE_K = list; }
	public void setList_EXCH_END_DATE_K(List list) { l_EXCH_END_DATE_K = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_CUR_SYMBOL(List list) { l_CUR_SYMBOL = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_EXCH_RESERVE_CD(List list) { l_EXCH_RESERVE_CD = list; }
	public void setList_EXCH_START_DATE(List list) { l_EXCH_START_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_l_EXCH_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_TYP_DN == null) {
			l_l_EXCH_TYP_DN = new ArrayList();
		} else {
			l_l_EXCH_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_TYP_DN.add(((AA0120010Struct) list.get(i)).getl_EXCH_TYP_DN());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_name == null) {
			l_EXCH_TYP_name = new ArrayList();
		} else {
			l_EXCH_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_name.add(((AA0120010Struct) list.get(i)).getEXCH_TYP_name());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_val == null) {
			l_EXCH_TYP_val = new ArrayList();
		} else {
			l_EXCH_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_val.add(((AA0120010Struct) list.get(i)).getEXCH_TYP_val());
		}
		return size;
	}
	public int setL2L_h_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_ID == null) {
			l_h_APPR_ID = new ArrayList();
		} else {
			l_h_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_ID.add(((AA0120010Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_h_SCREENMOVE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREENMOVE_TYP == null) {
			l_h_SCREENMOVE_TYP = new ArrayList();
		} else {
			l_h_SCREENMOVE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREENMOVE_TYP.add(((AA0120010Struct) list.get(i)).geth_SCREENMOVE_TYP());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((AA0120010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_EXCH_RATE == null) {
			l_h_APR_EXCH_RATE = new ArrayList();
		} else {
			l_h_APR_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_EXCH_RATE.add(((AA0120010Struct) list.get(i)).geth_APR_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_K_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_K_name == null) {
			l_EXCH_TYP_K_name = new ArrayList();
		} else {
			l_EXCH_TYP_K_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_K_name.add(((AA0120010Struct) list.get(i)).getEXCH_TYP_K_name());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_K_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_K_val == null) {
			l_EXCH_TYP_K_val = new ArrayList();
		} else {
			l_EXCH_TYP_K_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_K_val.add(((AA0120010Struct) list.get(i)).getEXCH_TYP_K_val());
		}
		return size;
	}
	public int setL2L_l_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_TYP == null) {
			l_l_EXCH_TYP = new ArrayList();
		} else {
			l_l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_TYP.add(((AA0120010Struct) list.get(i)).getl_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_l_EXCH_RESERVE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_RESERVE_CD == null) {
			l_l_EXCH_RESERVE_CD = new ArrayList();
		} else {
			l_l_EXCH_RESERVE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_RESERVE_CD.add(((AA0120010Struct) list.get(i)).getl_EXCH_RESERVE_CD());
		}
		return size;
	}
	public int setL2L_l_EXCH_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_START_DATE == null) {
			l_l_EXCH_START_DATE = new ArrayList();
		} else {
			l_l_EXCH_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_START_DATE.add(((AA0120010Struct) list.get(i)).getl_EXCH_START_DATE());
		}
		return size;
	}
	public int setL2L_l_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_RATE == null) {
			l_l_EXCH_RATE = new ArrayList();
		} else {
			l_l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_RATE.add(((AA0120010Struct) list.get(i)).getl_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((AA0120010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((AA0120010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_K(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_K == null) {
			l_EXCH_TYP_K = new ArrayList();
		} else {
			l_EXCH_TYP_K.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_K.add(((AA0120010Struct) list.get(i)).getEXCH_TYP_K());
		}
		return size;
	}
	public int setL2L_EXCH_RESERVE_CD_K(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RESERVE_CD_K == null) {
			l_EXCH_RESERVE_CD_K = new ArrayList();
		} else {
			l_EXCH_RESERVE_CD_K.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RESERVE_CD_K.add(((AA0120010Struct) list.get(i)).getEXCH_RESERVE_CD_K());
		}
		return size;
	}
	public int setL2L_EXCH_START_DATE_K(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_START_DATE_K == null) {
			l_EXCH_START_DATE_K = new ArrayList();
		} else {
			l_EXCH_START_DATE_K.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_START_DATE_K.add(((AA0120010Struct) list.get(i)).getEXCH_START_DATE_K());
		}
		return size;
	}
	public int setL2L_EXCH_END_DATE_K(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_END_DATE_K == null) {
			l_EXCH_END_DATE_K = new ArrayList();
		} else {
			l_EXCH_END_DATE_K.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_END_DATE_K.add(((AA0120010Struct) list.get(i)).getEXCH_END_DATE_K());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((AA0120010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((AA0120010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_CUR_SYMBOL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_SYMBOL == null) {
			l_CUR_SYMBOL = new ArrayList();
		} else {
			l_CUR_SYMBOL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_SYMBOL.add(((AA0120010Struct) list.get(i)).getCUR_SYMBOL());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AA0120010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP == null) {
			l_EXCH_TYP = new ArrayList();
		} else {
			l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP.add(((AA0120010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_EXCH_RESERVE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RESERVE_CD == null) {
			l_EXCH_RESERVE_CD = new ArrayList();
		} else {
			l_EXCH_RESERVE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RESERVE_CD.add(((AA0120010Struct) list.get(i)).getEXCH_RESERVE_CD());
		}
		return size;
	}
	public int setL2L_EXCH_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_START_DATE == null) {
			l_EXCH_START_DATE = new ArrayList();
		} else {
			l_EXCH_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_START_DATE.add(((AA0120010Struct) list.get(i)).getEXCH_START_DATE());
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
			l_EXCH_RATE.add(((AA0120010Struct) list.get(i)).getEXCH_RATE());
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
			l_MODIFY_COUNT.add(((AA0120010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_COMPANY_CD.add(((AA0120010Struct) list.get(i)).getCOMPANY_CD());
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
			l_l_COUNT.add(((AA0120010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AA0120010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_EXCH_TYP_DN = null;
		m_EXCH_TYP_name = null;
		m_EXCH_TYP_val = null;
		m_h_APPR_ID = null;
		m_h_SCREENMOVE_TYP = null;
		m_APPR_REMARKS = null;
		m_h_APR_EXCH_RATE = null;
		m_EXCH_TYP_K_name = null;
		m_EXCH_TYP_K_val = null;
		m_l_EXCH_TYP = null;
		m_l_EXCH_RESERVE_CD = null;
		m_l_EXCH_START_DATE = null;
		m_l_EXCH_RATE = null;
		m_l_MODIFY_COUNT = null;
		m_CUR_CD = null;
		m_EXCH_TYP_K = null;
		m_EXCH_RESERVE_CD_K = null;
		m_EXCH_START_DATE_K = null;
		m_EXCH_END_DATE_K = null;
		m_CUR_NAME = null;
		m_CUR_UNIT = null;
		m_CUR_SYMBOL = null;
		m_DECIMAL_FIG = null;
		m_EXCH_TYP = null;
		m_EXCH_RESERVE_CD = null;
		m_EXCH_START_DATE = null;
		m_EXCH_RATE = null;
		m_MODIFY_COUNT = null;
		m_COMPANY_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_l_EXCH_TYP_DN = null;
		l_EXCH_TYP_name = null;
		l_EXCH_TYP_val = null;
		l_h_APPR_ID = null;
		l_h_SCREENMOVE_TYP = null;
		l_APPR_REMARKS = null;
		l_h_APR_EXCH_RATE = null;
		l_EXCH_TYP_K_name = null;
		l_EXCH_TYP_K_val = null;
		l_l_EXCH_TYP = null;
		l_l_EXCH_RESERVE_CD = null;
		l_l_EXCH_START_DATE = null;
		l_l_EXCH_RATE = null;
		l_l_MODIFY_COUNT = null;
		l_CUR_CD = null;
		l_EXCH_TYP_K = null;
		l_EXCH_RESERVE_CD_K = null;
		l_EXCH_START_DATE_K = null;
		l_EXCH_END_DATE_K = null;
		l_CUR_NAME = null;
		l_CUR_UNIT = null;
		l_CUR_SYMBOL = null;
		l_DECIMAL_FIG = null;
		l_EXCH_TYP = null;
		l_EXCH_RESERVE_CD = null;
		l_EXCH_START_DATE = null;
		l_EXCH_RATE = null;
		l_MODIFY_COUNT = null;
		l_COMPANY_CD = null;
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
	 * medAA0120010クラスの標準コンストラクタ
	 */
	public AA0120010Struct()
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
	public void setStruct(AA0120010Struct struct)
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
	public void setStructM(AA0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_EXCH_TYP_DN(struct.getl_EXCH_TYP_DN());
			this.setEXCH_TYP_name(struct.getEXCH_TYP_name());
			this.setEXCH_TYP_val(struct.getEXCH_TYP_val());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_EXCH_RATE(struct.geth_APR_EXCH_RATE());
			this.setEXCH_TYP_K_name(struct.getEXCH_TYP_K_name());
			this.setEXCH_TYP_K_val(struct.getEXCH_TYP_K_val());
			this.setl_EXCH_TYP(struct.getl_EXCH_TYP());
			this.setl_EXCH_RESERVE_CD(struct.getl_EXCH_RESERVE_CD());
			this.setl_EXCH_START_DATE(struct.getl_EXCH_START_DATE());
			this.setl_EXCH_RATE(struct.getl_EXCH_RATE());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP_K(struct.getEXCH_TYP_K());
			this.setEXCH_RESERVE_CD_K(struct.getEXCH_RESERVE_CD_K());
			this.setEXCH_START_DATE_K(struct.getEXCH_START_DATE_K());
			this.setEXCH_END_DATE_K(struct.getEXCH_END_DATE_K());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setCUR_SYMBOL(struct.getCUR_SYMBOL());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setEXCH_RESERVE_CD(struct.getEXCH_RESERVE_CD());
			this.setEXCH_START_DATE(struct.getEXCH_START_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_EXCH_TYP_DN(struct.getList_l_EXCH_TYP_DN());
			this.setList_EXCH_TYP_name(struct.getList_EXCH_TYP_name());
			this.setList_EXCH_TYP_val(struct.getList_EXCH_TYP_val());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_EXCH_RATE(struct.getList_h_APR_EXCH_RATE());
			this.setList_EXCH_TYP_K_name(struct.getList_EXCH_TYP_K_name());
			this.setList_EXCH_TYP_K_val(struct.getList_EXCH_TYP_K_val());
			this.setList_l_EXCH_TYP(struct.getList_l_EXCH_TYP());
			this.setList_l_EXCH_RESERVE_CD(struct.getList_l_EXCH_RESERVE_CD());
			this.setList_l_EXCH_START_DATE(struct.getList_l_EXCH_START_DATE());
			this.setList_l_EXCH_RATE(struct.getList_l_EXCH_RATE());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP_K(struct.getList_EXCH_TYP_K());
			this.setList_EXCH_RESERVE_CD_K(struct.getList_EXCH_RESERVE_CD_K());
			this.setList_EXCH_START_DATE_K(struct.getList_EXCH_START_DATE_K());
			this.setList_EXCH_END_DATE_K(struct.getList_EXCH_END_DATE_K());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_CUR_SYMBOL(struct.getList_CUR_SYMBOL());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_EXCH_RESERVE_CD(struct.getList_EXCH_RESERVE_CD());
			this.setList_EXCH_START_DATE(struct.getList_EXCH_START_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
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
	// 第 1 変数初期値： i_l_EXCH_TYP_DN


	final static String i_l_EXCH_TYP_DN = null;

	// 第 2 変数初期値： i_EXCH_TYP_name


	final static String i_EXCH_TYP_name = null;

	// 第 3 変数初期値： i_EXCH_TYP_val


	final static String i_EXCH_TYP_val = null;

	// 第 4 変数初期値： i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// 第 5 変数初期値： i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// 第 6 変数初期値： i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// 第 7 変数初期値： i_h_APR_EXCH_RATE


	final static String i_h_APR_EXCH_RATE = null;

	// 第 8 変数初期値： i_EXCH_TYP_K_name


	final static String i_EXCH_TYP_K_name = null;

	// 第 9 変数初期値： i_EXCH_TYP_K_val


	final static String i_EXCH_TYP_K_val = null;

	// 第 10 変数初期値： i_l_EXCH_TYP


	final static String i_l_EXCH_TYP = null;

	// 第 11 変数初期値： i_l_EXCH_RESERVE_CD


	final static String i_l_EXCH_RESERVE_CD = null;

	// 第 12 変数初期値： i_l_EXCH_START_DATE


	final static String i_l_EXCH_START_DATE = null;

	// 第 13 変数初期値： i_l_EXCH_RATE


	final static String i_l_EXCH_RATE = null;

	// 第 14 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 15 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 16 変数初期値： i_EXCH_TYP_K


	final static String i_EXCH_TYP_K = null;

	// 第 17 変数初期値： i_EXCH_RESERVE_CD_K


	final static String i_EXCH_RESERVE_CD_K = null;

	// 第 18 変数初期値： i_EXCH_START_DATE_K


	final static String i_EXCH_START_DATE_K = null;

	// 第 19 変数初期値： i_EXCH_END_DATE_K


	final static String i_EXCH_END_DATE_K = null;

	// 第 20 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 21 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 22 変数初期値： i_CUR_SYMBOL


	final static String i_CUR_SYMBOL = null;

	// 第 23 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 24 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 25 変数初期値： i_EXCH_RESERVE_CD


	final static String i_EXCH_RESERVE_CD = null;

	// 第 26 変数初期値： i_EXCH_START_DATE


	final static String i_EXCH_START_DATE = null;

	// 第 27 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 28 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 29 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 30 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 31 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_l_EXCH_TYP_DN
        final static String i_l_EXCH_TYP_DN = null;
        // 第 2 変数初期値： i_l_EXCH_TYP
        final static String i_l_EXCH_TYP = null;
        // 第 3 変数初期値： i_l_EXCH_RESERVE_CD
        final static String i_l_EXCH_RESERVE_CD = null;
        // 第 4 変数初期値： i_l_EXCH_START_DATE
        final static String i_l_EXCH_START_DATE = null;
        // 第 5 変数初期値： i_l_EXCH_RATE
        final static String i_l_EXCH_RATE = null;
        // 第 6 変数初期値： i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // 第 7 変数初期値： i_CUR_CD
        final static String i_CUR_CD = null;
        // 第 8 変数初期値： i_CUR_NAME
        final static String i_CUR_NAME = null;
        // 第 9 変数初期値： i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // 第 10 変数初期値： i_CUR_SYMBOL
        final static String i_CUR_SYMBOL = null;
        // 第 11 変数初期値： i_DECIMAL_FIG
        final static String i_DECIMAL_FIG = null;
        // 第 12 変数初期値： i_EXCH_TYP
        final static String i_EXCH_TYP = null;
        // 第 13 変数初期値： i_EXCH_RESERVE_CD
        final static String i_EXCH_RESERVE_CD = null;
        // 第 14 変数初期値： i_EXCH_START_DATE
        final static String i_EXCH_START_DATE = null;
        // 第 15 変数初期値： i_EXCH_RATE
        final static String i_EXCH_RATE = null;
        // 第 16 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 17 変数初期値： i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // 第 18 変数初期値： i_EXCH_TYP_name
        final static String i_EXCH_TYP_name = null;
        // 第 19 変数初期値： i_EXCH_TYP_val
        final static String i_EXCH_TYP_val = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_EXCH_TYP_DN = i_l_EXCH_TYP_DN;
         m_l_EXCH_TYP = i_l_EXCH_TYP;
         m_l_EXCH_RESERVE_CD = i_l_EXCH_RESERVE_CD;
         m_l_EXCH_START_DATE = i_l_EXCH_START_DATE;
         m_l_EXCH_RATE = i_l_EXCH_RATE;
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_CUR_CD = i_CUR_CD;
         m_CUR_NAME = i_CUR_NAME;
         m_CUR_UNIT = i_CUR_UNIT;
         m_CUR_SYMBOL = i_CUR_SYMBOL;
         m_DECIMAL_FIG = i_DECIMAL_FIG;
         m_EXCH_TYP = i_EXCH_TYP;
         m_EXCH_RESERVE_CD = i_EXCH_RESERVE_CD;
         m_EXCH_START_DATE = i_EXCH_START_DATE;
         m_EXCH_RATE = i_EXCH_RATE;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_COMPANY_CD = i_COMPANY_CD;
         m_EXCH_TYP_name = i_EXCH_TYP_name;
         m_EXCH_TYP_val = i_EXCH_TYP_val;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
