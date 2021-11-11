/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0050/src/com/nec/jp/orteus/metamorBase/DA0050/DA0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0050;

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

public class DA0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_PROC_COST_CLS_NAME */
	public String m_PROC_COST_CLS_NAME = null;
	/** 第 2 変数： m_PROC_COST_01_NAME */
	public String m_PROC_COST_01_NAME = null;
	/** 第 3 変数： m_PROC_COST_01_ANAME */
	public String m_PROC_COST_01_ANAME = null;
	/** 第 4 変数： m_PROC_COST_02_NAME */
	public String m_PROC_COST_02_NAME = null;
	/** 第 5 変数： m_PROC_COST_02_ANAME */
	public String m_PROC_COST_02_ANAME = null;
	/** 第 6 変数： m_PROC_COST_03_NAME */
	public String m_PROC_COST_03_NAME = null;
	/** 第 7 変数： m_PROC_COST_03_ANAME */
	public String m_PROC_COST_03_ANAME = null;
	/** 第 8 変数： m_PROC_COST_04_NAME */
	public String m_PROC_COST_04_NAME = null;
	/** 第 9 変数： m_PROC_COST_04_ANAME */
	public String m_PROC_COST_04_ANAME = null;
	/** 第 10 変数： m_PROC_COST_05_NAME */
	public String m_PROC_COST_05_NAME = null;
	/** 第 11 変数： m_PROC_COST_05_ANAME */
	public String m_PROC_COST_05_ANAME = null;
	/** 第 12 変数： m_PROC_COST_06_NAME */
	public String m_PROC_COST_06_NAME = null;
	/** 第 13 変数： m_PROC_COST_06_ANAME */
	public String m_PROC_COST_06_ANAME = null;
	/** 第 14 変数： m_PROC_COST_07_NAME */
	public String m_PROC_COST_07_NAME = null;
	/** 第 15 変数： m_PROC_COST_07_ANAME */
	public String m_PROC_COST_07_ANAME = null;
	/** 第 16 変数： m_PROC_COST_08_NAME */
	public String m_PROC_COST_08_NAME = null;
	/** 第 17 変数： m_PROC_COST_08_ANAME */
	public String m_PROC_COST_08_ANAME = null;
	/** 第 18 変数： m_PROC_COST_09_NAME */
	public String m_PROC_COST_09_NAME = null;
	/** 第 19 変数： m_PROC_COST_09_ANAME */
	public String m_PROC_COST_09_ANAME = null;
	/** 第 20 変数： m_PROC_COST_10_NAME */
	public String m_PROC_COST_10_NAME = null;
	/** 第 21 変数： m_PROC_COST_10_ANAME */
	public String m_PROC_COST_10_ANAME = null;
	/** 第 22 変数： m_PROC_COST_11_NAME */
	public String m_PROC_COST_11_NAME = null;
	/** 第 23 変数： m_PROC_COST_11_ANAME */
	public String m_PROC_COST_11_ANAME = null;
	/** 第 24 変数： m_PROC_COST_12_NAME */
	public String m_PROC_COST_12_NAME = null;
	/** 第 25 変数： m_PROC_COST_12_ANAME */
	public String m_PROC_COST_12_ANAME = null;
	/** 第 26 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 27 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 28 変数： m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** 第 29 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 30 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 31 変数： m_h_PROC_COST_CLS_CD */
	public String m_h_PROC_COST_CLS_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_PROC_COST_CLS_NAME */
	public List l_PROC_COST_CLS_NAME = null;

	/** 第 2 List変数： l_PROC_COST_01_NAME */
	public List l_PROC_COST_01_NAME = null;

	/** 第 3 List変数： l_PROC_COST_01_ANAME */
	public List l_PROC_COST_01_ANAME = null;

	/** 第 4 List変数： l_PROC_COST_02_NAME */
	public List l_PROC_COST_02_NAME = null;

	/** 第 5 List変数： l_PROC_COST_02_ANAME */
	public List l_PROC_COST_02_ANAME = null;

	/** 第 6 List変数： l_PROC_COST_03_NAME */
	public List l_PROC_COST_03_NAME = null;

	/** 第 7 List変数： l_PROC_COST_03_ANAME */
	public List l_PROC_COST_03_ANAME = null;

	/** 第 8 List変数： l_PROC_COST_04_NAME */
	public List l_PROC_COST_04_NAME = null;

	/** 第 9 List変数： l_PROC_COST_04_ANAME */
	public List l_PROC_COST_04_ANAME = null;

	/** 第 10 List変数： l_PROC_COST_05_NAME */
	public List l_PROC_COST_05_NAME = null;

	/** 第 11 List変数： l_PROC_COST_05_ANAME */
	public List l_PROC_COST_05_ANAME = null;

	/** 第 12 List変数： l_PROC_COST_06_NAME */
	public List l_PROC_COST_06_NAME = null;

	/** 第 13 List変数： l_PROC_COST_06_ANAME */
	public List l_PROC_COST_06_ANAME = null;

	/** 第 14 List変数： l_PROC_COST_07_NAME */
	public List l_PROC_COST_07_NAME = null;

	/** 第 15 List変数： l_PROC_COST_07_ANAME */
	public List l_PROC_COST_07_ANAME = null;

	/** 第 16 List変数： l_PROC_COST_08_NAME */
	public List l_PROC_COST_08_NAME = null;

	/** 第 17 List変数： l_PROC_COST_08_ANAME */
	public List l_PROC_COST_08_ANAME = null;

	/** 第 18 List変数： l_PROC_COST_09_NAME */
	public List l_PROC_COST_09_NAME = null;

	/** 第 19 List変数： l_PROC_COST_09_ANAME */
	public List l_PROC_COST_09_ANAME = null;

	/** 第 20 List変数： l_PROC_COST_10_NAME */
	public List l_PROC_COST_10_NAME = null;

	/** 第 21 List変数： l_PROC_COST_10_ANAME */
	public List l_PROC_COST_10_ANAME = null;

	/** 第 22 List変数： l_PROC_COST_11_NAME */
	public List l_PROC_COST_11_NAME = null;

	/** 第 23 List変数： l_PROC_COST_11_ANAME */
	public List l_PROC_COST_11_ANAME = null;

	/** 第 24 List変数： l_PROC_COST_12_NAME */
	public List l_PROC_COST_12_NAME = null;

	/** 第 25 List変数： l_PROC_COST_12_ANAME */
	public List l_PROC_COST_12_ANAME = null;

	/** 第 26 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 27 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 28 List変数： l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** 第 29 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 30 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 31 List変数： l_h_PROC_COST_CLS_CD */
	public List l_h_PROC_COST_CLS_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getPROC_COST_CLS_NAME() { return m_PROC_COST_CLS_NAME; }
	public String getPROC_COST_01_NAME() { return m_PROC_COST_01_NAME; }
	public String getPROC_COST_01_ANAME() { return m_PROC_COST_01_ANAME; }
	public String getPROC_COST_02_NAME() { return m_PROC_COST_02_NAME; }
	public String getPROC_COST_02_ANAME() { return m_PROC_COST_02_ANAME; }
	public String getPROC_COST_03_NAME() { return m_PROC_COST_03_NAME; }
	public String getPROC_COST_03_ANAME() { return m_PROC_COST_03_ANAME; }
	public String getPROC_COST_04_NAME() { return m_PROC_COST_04_NAME; }
	public String getPROC_COST_04_ANAME() { return m_PROC_COST_04_ANAME; }
	public String getPROC_COST_05_NAME() { return m_PROC_COST_05_NAME; }
	public String getPROC_COST_05_ANAME() { return m_PROC_COST_05_ANAME; }
	public String getPROC_COST_06_NAME() { return m_PROC_COST_06_NAME; }
	public String getPROC_COST_06_ANAME() { return m_PROC_COST_06_ANAME; }
	public String getPROC_COST_07_NAME() { return m_PROC_COST_07_NAME; }
	public String getPROC_COST_07_ANAME() { return m_PROC_COST_07_ANAME; }
	public String getPROC_COST_08_NAME() { return m_PROC_COST_08_NAME; }
	public String getPROC_COST_08_ANAME() { return m_PROC_COST_08_ANAME; }
	public String getPROC_COST_09_NAME() { return m_PROC_COST_09_NAME; }
	public String getPROC_COST_09_ANAME() { return m_PROC_COST_09_ANAME; }
	public String getPROC_COST_10_NAME() { return m_PROC_COST_10_NAME; }
	public String getPROC_COST_10_ANAME() { return m_PROC_COST_10_ANAME; }
	public String getPROC_COST_11_NAME() { return m_PROC_COST_11_NAME; }
	public String getPROC_COST_11_ANAME() { return m_PROC_COST_11_ANAME; }
	public String getPROC_COST_12_NAME() { return m_PROC_COST_12_NAME; }
	public String getPROC_COST_12_ANAME() { return m_PROC_COST_12_ANAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String geth_PROC_COST_CLS_CD() { return m_h_PROC_COST_CLS_CD; }

	public List getList_PROC_COST_CLS_NAME() { return l_PROC_COST_CLS_NAME; }
	public List getList_PROC_COST_01_NAME() { return l_PROC_COST_01_NAME; }
	public List getList_PROC_COST_01_ANAME() { return l_PROC_COST_01_ANAME; }
	public List getList_PROC_COST_02_NAME() { return l_PROC_COST_02_NAME; }
	public List getList_PROC_COST_02_ANAME() { return l_PROC_COST_02_ANAME; }
	public List getList_PROC_COST_03_NAME() { return l_PROC_COST_03_NAME; }
	public List getList_PROC_COST_03_ANAME() { return l_PROC_COST_03_ANAME; }
	public List getList_PROC_COST_04_NAME() { return l_PROC_COST_04_NAME; }
	public List getList_PROC_COST_04_ANAME() { return l_PROC_COST_04_ANAME; }
	public List getList_PROC_COST_05_NAME() { return l_PROC_COST_05_NAME; }
	public List getList_PROC_COST_05_ANAME() { return l_PROC_COST_05_ANAME; }
	public List getList_PROC_COST_06_NAME() { return l_PROC_COST_06_NAME; }
	public List getList_PROC_COST_06_ANAME() { return l_PROC_COST_06_ANAME; }
	public List getList_PROC_COST_07_NAME() { return l_PROC_COST_07_NAME; }
	public List getList_PROC_COST_07_ANAME() { return l_PROC_COST_07_ANAME; }
	public List getList_PROC_COST_08_NAME() { return l_PROC_COST_08_NAME; }
	public List getList_PROC_COST_08_ANAME() { return l_PROC_COST_08_ANAME; }
	public List getList_PROC_COST_09_NAME() { return l_PROC_COST_09_NAME; }
	public List getList_PROC_COST_09_ANAME() { return l_PROC_COST_09_ANAME; }
	public List getList_PROC_COST_10_NAME() { return l_PROC_COST_10_NAME; }
	public List getList_PROC_COST_10_ANAME() { return l_PROC_COST_10_ANAME; }
	public List getList_PROC_COST_11_NAME() { return l_PROC_COST_11_NAME; }
	public List getList_PROC_COST_11_ANAME() { return l_PROC_COST_11_ANAME; }
	public List getList_PROC_COST_12_NAME() { return l_PROC_COST_12_NAME; }
	public List getList_PROC_COST_12_ANAME() { return l_PROC_COST_12_ANAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_h_PROC_COST_CLS_CD() { return l_h_PROC_COST_CLS_CD; }

	public void setPROC_COST_CLS_NAME(String val) { m_PROC_COST_CLS_NAME = val; }
	public void setPROC_COST_01_NAME(String val) { m_PROC_COST_01_NAME = val; }
	public void setPROC_COST_01_ANAME(String val) { m_PROC_COST_01_ANAME = val; }
	public void setPROC_COST_02_NAME(String val) { m_PROC_COST_02_NAME = val; }
	public void setPROC_COST_02_ANAME(String val) { m_PROC_COST_02_ANAME = val; }
	public void setPROC_COST_03_NAME(String val) { m_PROC_COST_03_NAME = val; }
	public void setPROC_COST_03_ANAME(String val) { m_PROC_COST_03_ANAME = val; }
	public void setPROC_COST_04_NAME(String val) { m_PROC_COST_04_NAME = val; }
	public void setPROC_COST_04_ANAME(String val) { m_PROC_COST_04_ANAME = val; }
	public void setPROC_COST_05_NAME(String val) { m_PROC_COST_05_NAME = val; }
	public void setPROC_COST_05_ANAME(String val) { m_PROC_COST_05_ANAME = val; }
	public void setPROC_COST_06_NAME(String val) { m_PROC_COST_06_NAME = val; }
	public void setPROC_COST_06_ANAME(String val) { m_PROC_COST_06_ANAME = val; }
	public void setPROC_COST_07_NAME(String val) { m_PROC_COST_07_NAME = val; }
	public void setPROC_COST_07_ANAME(String val) { m_PROC_COST_07_ANAME = val; }
	public void setPROC_COST_08_NAME(String val) { m_PROC_COST_08_NAME = val; }
	public void setPROC_COST_08_ANAME(String val) { m_PROC_COST_08_ANAME = val; }
	public void setPROC_COST_09_NAME(String val) { m_PROC_COST_09_NAME = val; }
	public void setPROC_COST_09_ANAME(String val) { m_PROC_COST_09_ANAME = val; }
	public void setPROC_COST_10_NAME(String val) { m_PROC_COST_10_NAME = val; }
	public void setPROC_COST_10_ANAME(String val) { m_PROC_COST_10_ANAME = val; }
	public void setPROC_COST_11_NAME(String val) { m_PROC_COST_11_NAME = val; }
	public void setPROC_COST_11_ANAME(String val) { m_PROC_COST_11_ANAME = val; }
	public void setPROC_COST_12_NAME(String val) { m_PROC_COST_12_NAME = val; }
	public void setPROC_COST_12_ANAME(String val) { m_PROC_COST_12_ANAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void seth_PROC_COST_CLS_CD(String val) { m_h_PROC_COST_CLS_CD = val; }


	public void setList_PROC_COST_CLS_NAME(List list) { l_PROC_COST_CLS_NAME = list; }
	public void setList_PROC_COST_01_NAME(List list) { l_PROC_COST_01_NAME = list; }
	public void setList_PROC_COST_01_ANAME(List list) { l_PROC_COST_01_ANAME = list; }
	public void setList_PROC_COST_02_NAME(List list) { l_PROC_COST_02_NAME = list; }
	public void setList_PROC_COST_02_ANAME(List list) { l_PROC_COST_02_ANAME = list; }
	public void setList_PROC_COST_03_NAME(List list) { l_PROC_COST_03_NAME = list; }
	public void setList_PROC_COST_03_ANAME(List list) { l_PROC_COST_03_ANAME = list; }
	public void setList_PROC_COST_04_NAME(List list) { l_PROC_COST_04_NAME = list; }
	public void setList_PROC_COST_04_ANAME(List list) { l_PROC_COST_04_ANAME = list; }
	public void setList_PROC_COST_05_NAME(List list) { l_PROC_COST_05_NAME = list; }
	public void setList_PROC_COST_05_ANAME(List list) { l_PROC_COST_05_ANAME = list; }
	public void setList_PROC_COST_06_NAME(List list) { l_PROC_COST_06_NAME = list; }
	public void setList_PROC_COST_06_ANAME(List list) { l_PROC_COST_06_ANAME = list; }
	public void setList_PROC_COST_07_NAME(List list) { l_PROC_COST_07_NAME = list; }
	public void setList_PROC_COST_07_ANAME(List list) { l_PROC_COST_07_ANAME = list; }
	public void setList_PROC_COST_08_NAME(List list) { l_PROC_COST_08_NAME = list; }
	public void setList_PROC_COST_08_ANAME(List list) { l_PROC_COST_08_ANAME = list; }
	public void setList_PROC_COST_09_NAME(List list) { l_PROC_COST_09_NAME = list; }
	public void setList_PROC_COST_09_ANAME(List list) { l_PROC_COST_09_ANAME = list; }
	public void setList_PROC_COST_10_NAME(List list) { l_PROC_COST_10_NAME = list; }
	public void setList_PROC_COST_10_ANAME(List list) { l_PROC_COST_10_ANAME = list; }
	public void setList_PROC_COST_11_NAME(List list) { l_PROC_COST_11_NAME = list; }
	public void setList_PROC_COST_11_ANAME(List list) { l_PROC_COST_11_ANAME = list; }
	public void setList_PROC_COST_12_NAME(List list) { l_PROC_COST_12_NAME = list; }
	public void setList_PROC_COST_12_ANAME(List list) { l_PROC_COST_12_ANAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_h_PROC_COST_CLS_CD(List list) { l_h_PROC_COST_CLS_CD = list; }

	public int setL2L_PROC_COST_CLS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_NAME == null) {
			l_PROC_COST_CLS_NAME = new ArrayList();
		} else {
			l_PROC_COST_CLS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_CLS_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01_NAME == null) {
			l_PROC_COST_01_NAME = new ArrayList();
		} else {
			l_PROC_COST_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_01_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_01_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01_ANAME == null) {
			l_PROC_COST_01_ANAME = new ArrayList();
		} else {
			l_PROC_COST_01_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_01_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_02_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02_NAME == null) {
			l_PROC_COST_02_NAME = new ArrayList();
		} else {
			l_PROC_COST_02_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_02_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_02_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02_ANAME == null) {
			l_PROC_COST_02_ANAME = new ArrayList();
		} else {
			l_PROC_COST_02_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_02_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_03_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03_NAME == null) {
			l_PROC_COST_03_NAME = new ArrayList();
		} else {
			l_PROC_COST_03_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_03_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_03_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03_ANAME == null) {
			l_PROC_COST_03_ANAME = new ArrayList();
		} else {
			l_PROC_COST_03_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_03_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_04_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04_NAME == null) {
			l_PROC_COST_04_NAME = new ArrayList();
		} else {
			l_PROC_COST_04_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_04_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_04_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04_ANAME == null) {
			l_PROC_COST_04_ANAME = new ArrayList();
		} else {
			l_PROC_COST_04_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_04_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_05_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05_NAME == null) {
			l_PROC_COST_05_NAME = new ArrayList();
		} else {
			l_PROC_COST_05_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_05_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_05_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05_ANAME == null) {
			l_PROC_COST_05_ANAME = new ArrayList();
		} else {
			l_PROC_COST_05_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_05_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_06_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06_NAME == null) {
			l_PROC_COST_06_NAME = new ArrayList();
		} else {
			l_PROC_COST_06_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_06_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_06_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06_ANAME == null) {
			l_PROC_COST_06_ANAME = new ArrayList();
		} else {
			l_PROC_COST_06_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_06_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_07_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07_NAME == null) {
			l_PROC_COST_07_NAME = new ArrayList();
		} else {
			l_PROC_COST_07_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_07_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_07_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07_ANAME == null) {
			l_PROC_COST_07_ANAME = new ArrayList();
		} else {
			l_PROC_COST_07_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_07_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_08_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08_NAME == null) {
			l_PROC_COST_08_NAME = new ArrayList();
		} else {
			l_PROC_COST_08_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_08_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_08_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08_ANAME == null) {
			l_PROC_COST_08_ANAME = new ArrayList();
		} else {
			l_PROC_COST_08_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_08_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_09_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09_NAME == null) {
			l_PROC_COST_09_NAME = new ArrayList();
		} else {
			l_PROC_COST_09_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_09_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_09_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09_ANAME == null) {
			l_PROC_COST_09_ANAME = new ArrayList();
		} else {
			l_PROC_COST_09_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_09_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_10_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10_NAME == null) {
			l_PROC_COST_10_NAME = new ArrayList();
		} else {
			l_PROC_COST_10_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_10_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_10_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10_ANAME == null) {
			l_PROC_COST_10_ANAME = new ArrayList();
		} else {
			l_PROC_COST_10_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_10_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_11_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11_NAME == null) {
			l_PROC_COST_11_NAME = new ArrayList();
		} else {
			l_PROC_COST_11_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_11_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_11_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11_ANAME == null) {
			l_PROC_COST_11_ANAME = new ArrayList();
		} else {
			l_PROC_COST_11_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_11_ANAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_12_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12_NAME == null) {
			l_PROC_COST_12_NAME = new ArrayList();
		} else {
			l_PROC_COST_12_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12_NAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_12_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_12_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12_ANAME == null) {
			l_PROC_COST_12_ANAME = new ArrayList();
		} else {
			l_PROC_COST_12_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12_ANAME.add(((DA0050010Struct) list.get(i)).getPROC_COST_12_ANAME());
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
			l_MODIFY_COUNT.add(((DA0050010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DA0050010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_CD == null) {
			l_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_CD.add(((DA0050010Struct) list.get(i)).getPROC_COST_CLS_CD());
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
			l_PLANT_NAME.add(((DA0050010Struct) list.get(i)).getPLANT_NAME());
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
			l_h_PLANT_CD.add(((DA0050010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROC_COST_CLS_CD == null) {
			l_h_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_h_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROC_COST_CLS_CD.add(((DA0050010Struct) list.get(i)).geth_PROC_COST_CLS_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PROC_COST_CLS_NAME = null;
		m_PROC_COST_01_NAME = null;
		m_PROC_COST_01_ANAME = null;
		m_PROC_COST_02_NAME = null;
		m_PROC_COST_02_ANAME = null;
		m_PROC_COST_03_NAME = null;
		m_PROC_COST_03_ANAME = null;
		m_PROC_COST_04_NAME = null;
		m_PROC_COST_04_ANAME = null;
		m_PROC_COST_05_NAME = null;
		m_PROC_COST_05_ANAME = null;
		m_PROC_COST_06_NAME = null;
		m_PROC_COST_06_ANAME = null;
		m_PROC_COST_07_NAME = null;
		m_PROC_COST_07_ANAME = null;
		m_PROC_COST_08_NAME = null;
		m_PROC_COST_08_ANAME = null;
		m_PROC_COST_09_NAME = null;
		m_PROC_COST_09_ANAME = null;
		m_PROC_COST_10_NAME = null;
		m_PROC_COST_10_ANAME = null;
		m_PROC_COST_11_NAME = null;
		m_PROC_COST_11_ANAME = null;
		m_PROC_COST_12_NAME = null;
		m_PROC_COST_12_ANAME = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PROC_COST_CLS_CD = null;
		m_PLANT_NAME = null;
		m_h_PLANT_CD = null;
		m_h_PROC_COST_CLS_CD = null;

		l_PROC_COST_CLS_NAME = null;
		l_PROC_COST_01_NAME = null;
		l_PROC_COST_01_ANAME = null;
		l_PROC_COST_02_NAME = null;
		l_PROC_COST_02_ANAME = null;
		l_PROC_COST_03_NAME = null;
		l_PROC_COST_03_ANAME = null;
		l_PROC_COST_04_NAME = null;
		l_PROC_COST_04_ANAME = null;
		l_PROC_COST_05_NAME = null;
		l_PROC_COST_05_ANAME = null;
		l_PROC_COST_06_NAME = null;
		l_PROC_COST_06_ANAME = null;
		l_PROC_COST_07_NAME = null;
		l_PROC_COST_07_ANAME = null;
		l_PROC_COST_08_NAME = null;
		l_PROC_COST_08_ANAME = null;
		l_PROC_COST_09_NAME = null;
		l_PROC_COST_09_ANAME = null;
		l_PROC_COST_10_NAME = null;
		l_PROC_COST_10_ANAME = null;
		l_PROC_COST_11_NAME = null;
		l_PROC_COST_11_ANAME = null;
		l_PROC_COST_12_NAME = null;
		l_PROC_COST_12_ANAME = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PROC_COST_CLS_CD = null;
		l_PLANT_NAME = null;
		l_h_PLANT_CD = null;
		l_h_PROC_COST_CLS_CD = null;

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
	 * medDA0050010クラスの標準コンストラクタ
	 */
	public DA0050010Struct()
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
	public void setStruct(DA0050010Struct struct)
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
	public void setStructM(DA0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPROC_COST_CLS_NAME(struct.getPROC_COST_CLS_NAME());
			this.setPROC_COST_01_NAME(struct.getPROC_COST_01_NAME());
			this.setPROC_COST_01_ANAME(struct.getPROC_COST_01_ANAME());
			this.setPROC_COST_02_NAME(struct.getPROC_COST_02_NAME());
			this.setPROC_COST_02_ANAME(struct.getPROC_COST_02_ANAME());
			this.setPROC_COST_03_NAME(struct.getPROC_COST_03_NAME());
			this.setPROC_COST_03_ANAME(struct.getPROC_COST_03_ANAME());
			this.setPROC_COST_04_NAME(struct.getPROC_COST_04_NAME());
			this.setPROC_COST_04_ANAME(struct.getPROC_COST_04_ANAME());
			this.setPROC_COST_05_NAME(struct.getPROC_COST_05_NAME());
			this.setPROC_COST_05_ANAME(struct.getPROC_COST_05_ANAME());
			this.setPROC_COST_06_NAME(struct.getPROC_COST_06_NAME());
			this.setPROC_COST_06_ANAME(struct.getPROC_COST_06_ANAME());
			this.setPROC_COST_07_NAME(struct.getPROC_COST_07_NAME());
			this.setPROC_COST_07_ANAME(struct.getPROC_COST_07_ANAME());
			this.setPROC_COST_08_NAME(struct.getPROC_COST_08_NAME());
			this.setPROC_COST_08_ANAME(struct.getPROC_COST_08_ANAME());
			this.setPROC_COST_09_NAME(struct.getPROC_COST_09_NAME());
			this.setPROC_COST_09_ANAME(struct.getPROC_COST_09_ANAME());
			this.setPROC_COST_10_NAME(struct.getPROC_COST_10_NAME());
			this.setPROC_COST_10_ANAME(struct.getPROC_COST_10_ANAME());
			this.setPROC_COST_11_NAME(struct.getPROC_COST_11_NAME());
			this.setPROC_COST_11_ANAME(struct.getPROC_COST_11_ANAME());
			this.setPROC_COST_12_NAME(struct.getPROC_COST_12_NAME());
			this.setPROC_COST_12_ANAME(struct.getPROC_COST_12_ANAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.seth_PROC_COST_CLS_CD(struct.geth_PROC_COST_CLS_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DA0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PROC_COST_CLS_NAME(struct.getList_PROC_COST_CLS_NAME());
			this.setList_PROC_COST_01_NAME(struct.getList_PROC_COST_01_NAME());
			this.setList_PROC_COST_01_ANAME(struct.getList_PROC_COST_01_ANAME());
			this.setList_PROC_COST_02_NAME(struct.getList_PROC_COST_02_NAME());
			this.setList_PROC_COST_02_ANAME(struct.getList_PROC_COST_02_ANAME());
			this.setList_PROC_COST_03_NAME(struct.getList_PROC_COST_03_NAME());
			this.setList_PROC_COST_03_ANAME(struct.getList_PROC_COST_03_ANAME());
			this.setList_PROC_COST_04_NAME(struct.getList_PROC_COST_04_NAME());
			this.setList_PROC_COST_04_ANAME(struct.getList_PROC_COST_04_ANAME());
			this.setList_PROC_COST_05_NAME(struct.getList_PROC_COST_05_NAME());
			this.setList_PROC_COST_05_ANAME(struct.getList_PROC_COST_05_ANAME());
			this.setList_PROC_COST_06_NAME(struct.getList_PROC_COST_06_NAME());
			this.setList_PROC_COST_06_ANAME(struct.getList_PROC_COST_06_ANAME());
			this.setList_PROC_COST_07_NAME(struct.getList_PROC_COST_07_NAME());
			this.setList_PROC_COST_07_ANAME(struct.getList_PROC_COST_07_ANAME());
			this.setList_PROC_COST_08_NAME(struct.getList_PROC_COST_08_NAME());
			this.setList_PROC_COST_08_ANAME(struct.getList_PROC_COST_08_ANAME());
			this.setList_PROC_COST_09_NAME(struct.getList_PROC_COST_09_NAME());
			this.setList_PROC_COST_09_ANAME(struct.getList_PROC_COST_09_ANAME());
			this.setList_PROC_COST_10_NAME(struct.getList_PROC_COST_10_NAME());
			this.setList_PROC_COST_10_ANAME(struct.getList_PROC_COST_10_ANAME());
			this.setList_PROC_COST_11_NAME(struct.getList_PROC_COST_11_NAME());
			this.setList_PROC_COST_11_ANAME(struct.getList_PROC_COST_11_ANAME());
			this.setList_PROC_COST_12_NAME(struct.getList_PROC_COST_12_NAME());
			this.setList_PROC_COST_12_ANAME(struct.getList_PROC_COST_12_ANAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_h_PROC_COST_CLS_CD(struct.getList_h_PROC_COST_CLS_CD());
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
	// 第 1 変数初期値： i_PROC_COST_CLS_NAME


	final static String i_PROC_COST_CLS_NAME = null;

	// 第 2 変数初期値： i_PROC_COST_01_NAME


	final static String i_PROC_COST_01_NAME = null;

	// 第 3 変数初期値： i_PROC_COST_01_ANAME


	final static String i_PROC_COST_01_ANAME = null;

	// 第 4 変数初期値： i_PROC_COST_02_NAME


	final static String i_PROC_COST_02_NAME = null;

	// 第 5 変数初期値： i_PROC_COST_02_ANAME


	final static String i_PROC_COST_02_ANAME = null;

	// 第 6 変数初期値： i_PROC_COST_03_NAME


	final static String i_PROC_COST_03_NAME = null;

	// 第 7 変数初期値： i_PROC_COST_03_ANAME


	final static String i_PROC_COST_03_ANAME = null;

	// 第 8 変数初期値： i_PROC_COST_04_NAME


	final static String i_PROC_COST_04_NAME = null;

	// 第 9 変数初期値： i_PROC_COST_04_ANAME


	final static String i_PROC_COST_04_ANAME = null;

	// 第 10 変数初期値： i_PROC_COST_05_NAME


	final static String i_PROC_COST_05_NAME = null;

	// 第 11 変数初期値： i_PROC_COST_05_ANAME


	final static String i_PROC_COST_05_ANAME = null;

	// 第 12 変数初期値： i_PROC_COST_06_NAME


	final static String i_PROC_COST_06_NAME = null;

	// 第 13 変数初期値： i_PROC_COST_06_ANAME


	final static String i_PROC_COST_06_ANAME = null;

	// 第 14 変数初期値： i_PROC_COST_07_NAME


	final static String i_PROC_COST_07_NAME = null;

	// 第 15 変数初期値： i_PROC_COST_07_ANAME


	final static String i_PROC_COST_07_ANAME = null;

	// 第 16 変数初期値： i_PROC_COST_08_NAME


	final static String i_PROC_COST_08_NAME = null;

	// 第 17 変数初期値： i_PROC_COST_08_ANAME


	final static String i_PROC_COST_08_ANAME = null;

	// 第 18 変数初期値： i_PROC_COST_09_NAME


	final static String i_PROC_COST_09_NAME = null;

	// 第 19 変数初期値： i_PROC_COST_09_ANAME


	final static String i_PROC_COST_09_ANAME = null;

	// 第 20 変数初期値： i_PROC_COST_10_NAME


	final static String i_PROC_COST_10_NAME = null;

	// 第 21 変数初期値： i_PROC_COST_10_ANAME


	final static String i_PROC_COST_10_ANAME = null;

	// 第 22 変数初期値： i_PROC_COST_11_NAME


	final static String i_PROC_COST_11_NAME = null;

	// 第 23 変数初期値： i_PROC_COST_11_ANAME


	final static String i_PROC_COST_11_ANAME = null;

	// 第 24 変数初期値： i_PROC_COST_12_NAME


	final static String i_PROC_COST_12_NAME = null;

	// 第 25 変数初期値： i_PROC_COST_12_ANAME


	final static String i_PROC_COST_12_ANAME = null;

	// 第 26 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 27 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 28 変数初期値： i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// 第 29 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 30 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 31 変数初期値： i_h_PROC_COST_CLS_CD


	final static String i_h_PROC_COST_CLS_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_PROC_COST_CLS_NAME
        final static String i_PROC_COST_CLS_NAME = null;
        // 第 2 変数初期値： i_PROC_COST_01_NAME
        final static String i_PROC_COST_01_NAME = null;
        // 第 3 変数初期値： i_PROC_COST_01_ANAME
        final static String i_PROC_COST_01_ANAME = null;
        // 第 4 変数初期値： i_PROC_COST_02_NAME
        final static String i_PROC_COST_02_NAME = null;
        // 第 5 変数初期値： i_PROC_COST_02_ANAME
        final static String i_PROC_COST_02_ANAME = null;
        // 第 6 変数初期値： i_PROC_COST_03_NAME
        final static String i_PROC_COST_03_NAME = null;
        // 第 7 変数初期値： i_PROC_COST_03_ANAME
        final static String i_PROC_COST_03_ANAME = null;
        // 第 8 変数初期値： i_PROC_COST_04_NAME
        final static String i_PROC_COST_04_NAME = null;
        // 第 9 変数初期値： i_PROC_COST_04_ANAME
        final static String i_PROC_COST_04_ANAME = null;
        // 第 10 変数初期値： i_PROC_COST_05_NAME
        final static String i_PROC_COST_05_NAME = null;
        // 第 11 変数初期値： i_PROC_COST_05_ANAME
        final static String i_PROC_COST_05_ANAME = null;
        // 第 12 変数初期値： i_PROC_COST_06_NAME
        final static String i_PROC_COST_06_NAME = null;
        // 第 13 変数初期値： i_PROC_COST_06_ANAME
        final static String i_PROC_COST_06_ANAME = null;
        // 第 14 変数初期値： i_PROC_COST_07_NAME
        final static String i_PROC_COST_07_NAME = null;
        // 第 15 変数初期値： i_PROC_COST_07_ANAME
        final static String i_PROC_COST_07_ANAME = null;
        // 第 16 変数初期値： i_PROC_COST_08_NAME
        final static String i_PROC_COST_08_NAME = null;
        // 第 17 変数初期値： i_PROC_COST_08_ANAME
        final static String i_PROC_COST_08_ANAME = null;
        // 第 18 変数初期値： i_PROC_COST_09_NAME
        final static String i_PROC_COST_09_NAME = null;
        // 第 19 変数初期値： i_PROC_COST_09_ANAME
        final static String i_PROC_COST_09_ANAME = null;
        // 第 20 変数初期値： i_PROC_COST_10_NAME
        final static String i_PROC_COST_10_NAME = null;
        // 第 21 変数初期値： i_PROC_COST_10_ANAME
        final static String i_PROC_COST_10_ANAME = null;
        // 第 22 変数初期値： i_PROC_COST_11_NAME
        final static String i_PROC_COST_11_NAME = null;
        // 第 23 変数初期値： i_PROC_COST_11_ANAME
        final static String i_PROC_COST_11_ANAME = null;
        // 第 24 変数初期値： i_PROC_COST_12_NAME
        final static String i_PROC_COST_12_NAME = null;
        // 第 25 変数初期値： i_PROC_COST_12_ANAME
        final static String i_PROC_COST_12_ANAME = null;
        // 第 26 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 27 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 28 変数初期値： i_PROC_COST_CLS_CD
        final static String i_PROC_COST_CLS_CD = null;
        // 第 29 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 30 変数初期値： i_h_PLANT_CD
        final static String i_h_PLANT_CD = null;
        // 第 31 変数初期値： i_h_PROC_COST_CLS_CD
        final static String i_h_PROC_COST_CLS_CD = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PROC_COST_CLS_NAME = i_PROC_COST_CLS_NAME;
         m_PROC_COST_01_NAME = i_PROC_COST_01_NAME;
         m_PROC_COST_01_ANAME = i_PROC_COST_01_ANAME;
         m_PROC_COST_02_NAME = i_PROC_COST_02_NAME;
         m_PROC_COST_02_ANAME = i_PROC_COST_02_ANAME;
         m_PROC_COST_03_NAME = i_PROC_COST_03_NAME;
         m_PROC_COST_03_ANAME = i_PROC_COST_03_ANAME;
         m_PROC_COST_04_NAME = i_PROC_COST_04_NAME;
         m_PROC_COST_04_ANAME = i_PROC_COST_04_ANAME;
         m_PROC_COST_05_NAME = i_PROC_COST_05_NAME;
         m_PROC_COST_05_ANAME = i_PROC_COST_05_ANAME;
         m_PROC_COST_06_NAME = i_PROC_COST_06_NAME;
         m_PROC_COST_06_ANAME = i_PROC_COST_06_ANAME;
         m_PROC_COST_07_NAME = i_PROC_COST_07_NAME;
         m_PROC_COST_07_ANAME = i_PROC_COST_07_ANAME;
         m_PROC_COST_08_NAME = i_PROC_COST_08_NAME;
         m_PROC_COST_08_ANAME = i_PROC_COST_08_ANAME;
         m_PROC_COST_09_NAME = i_PROC_COST_09_NAME;
         m_PROC_COST_09_ANAME = i_PROC_COST_09_ANAME;
         m_PROC_COST_10_NAME = i_PROC_COST_10_NAME;
         m_PROC_COST_10_ANAME = i_PROC_COST_10_ANAME;
         m_PROC_COST_11_NAME = i_PROC_COST_11_NAME;
         m_PROC_COST_11_ANAME = i_PROC_COST_11_ANAME;
         m_PROC_COST_12_NAME = i_PROC_COST_12_NAME;
         m_PROC_COST_12_ANAME = i_PROC_COST_12_ANAME;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_h_PROC_COST_CLS_CD = i_h_PROC_COST_CLS_CD;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
