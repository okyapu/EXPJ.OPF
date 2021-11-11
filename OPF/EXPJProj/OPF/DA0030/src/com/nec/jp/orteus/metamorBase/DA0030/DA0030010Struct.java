/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0030/src/com/nec/jp/orteus/metamorBase/DA0030/DA0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0030;

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

public class DA0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_PROC_COST_UNIT_QTY */
	public String m_PROC_COST_UNIT_QTY = null;
	/** 第 2 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 3 変数： m_PROC_COST_01 */
	public String m_PROC_COST_01 = null;
	/** 第 4 変数： m_PROC_COST_02 */
	public String m_PROC_COST_02 = null;
	/** 第 5 変数： m_PROC_COST_03 */
	public String m_PROC_COST_03 = null;
	/** 第 6 変数： m_PROC_COST_04 */
	public String m_PROC_COST_04 = null;
	/** 第 7 変数： m_PROC_COST_05 */
	public String m_PROC_COST_05 = null;
	/** 第 8 変数： m_PROC_COST_06 */
	public String m_PROC_COST_06 = null;
	/** 第 9 変数： m_PROC_COST_07 */
	public String m_PROC_COST_07 = null;
	/** 第 10 変数： m_PROC_COST_08 */
	public String m_PROC_COST_08 = null;
	/** 第 11 変数： m_PROC_COST_09 */
	public String m_PROC_COST_09 = null;
	/** 第 12 変数： m_PROC_COST_10 */
	public String m_PROC_COST_10 = null;
	/** 第 13 変数： m_PROC_COST_11 */
	public String m_PROC_COST_11 = null;
	/** 第 14 変数： m_PROC_COST_12 */
	public String m_PROC_COST_12 = null;
	/** 第 15 変数： m_PROC_COST_SUM */
	public String m_PROC_COST_SUM = null;
	/** 第 16 変数： m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** 第 17 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 18 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 19 変数： m_YEAR */
	public String m_YEAR = null;
	/** 第 20 変数： m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** 第 21 変数： m_COST_TYP */
	public String m_COST_TYP = null;
	/** 第 22 変数： m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** 第 23 変数： m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** 第 24 変数： m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** 第 25 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 26 変数： m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** 第 27 変数： m_PROC_COST_CLS_NAME */
	public String m_PROC_COST_CLS_NAME = null;
	/** 第 28 変数： m_PROC_COST_01_NAME */
	public String m_PROC_COST_01_NAME = null;
	/** 第 29 変数： m_PROC_COST_02_NAME */
	public String m_PROC_COST_02_NAME = null;
	/** 第 30 変数： m_PROC_COST_03_NAME */
	public String m_PROC_COST_03_NAME = null;
	/** 第 31 変数： m_PROC_COST_04_NAME */
	public String m_PROC_COST_04_NAME = null;
	/** 第 32 変数： m_PROC_COST_05_NAME */
	public String m_PROC_COST_05_NAME = null;
	/** 第 33 変数： m_PROC_COST_06_NAME */
	public String m_PROC_COST_06_NAME = null;
	/** 第 34 変数： m_PROC_COST_07_NAME */
	public String m_PROC_COST_07_NAME = null;
	/** 第 35 変数： m_PROC_COST_08_NAME */
	public String m_PROC_COST_08_NAME = null;
	/** 第 36 変数： m_PROC_COST_09_NAME */
	public String m_PROC_COST_09_NAME = null;
	/** 第 37 変数： m_PROC_COST_10_NAME */
	public String m_PROC_COST_10_NAME = null;
	/** 第 38 変数： m_PROC_COST_11_NAME */
	public String m_PROC_COST_11_NAME = null;
	/** 第 39 変数： m_PROC_COST_12_NAME */
	public String m_PROC_COST_12_NAME = null;
	/** 第 40 変数： m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** 第 41 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 42 変数： m_h_YEAR */
	public String m_h_YEAR = null;
	/** 第 43 変数： m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** 第 44 変数： m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** 第 45 変数： m_h_HALF_TERM_TYP */
	public String m_h_HALF_TERM_TYP = null;
	/** 第 46 変数： m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** 第 47 変数： m_COST_TYP_val */
	public String m_COST_TYP_val = null;
	/** 第 48 変数： m_h_COST_TYP */
	public String m_h_COST_TYP = null;
	/** 第 49 変数： m_h_CS_PROC_CD */
	public String m_h_CS_PROC_CD = null;
	/** 第 50 変数： m_h_PROC_COST_CLS_CD */
	public String m_h_PROC_COST_CLS_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_PROC_COST_UNIT_QTY */
	public List l_PROC_COST_UNIT_QTY = null;

	/** 第 2 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 3 List変数： l_PROC_COST_01 */
	public List l_PROC_COST_01 = null;

	/** 第 4 List変数： l_PROC_COST_02 */
	public List l_PROC_COST_02 = null;

	/** 第 5 List変数： l_PROC_COST_03 */
	public List l_PROC_COST_03 = null;

	/** 第 6 List変数： l_PROC_COST_04 */
	public List l_PROC_COST_04 = null;

	/** 第 7 List変数： l_PROC_COST_05 */
	public List l_PROC_COST_05 = null;

	/** 第 8 List変数： l_PROC_COST_06 */
	public List l_PROC_COST_06 = null;

	/** 第 9 List変数： l_PROC_COST_07 */
	public List l_PROC_COST_07 = null;

	/** 第 10 List変数： l_PROC_COST_08 */
	public List l_PROC_COST_08 = null;

	/** 第 11 List変数： l_PROC_COST_09 */
	public List l_PROC_COST_09 = null;

	/** 第 12 List変数： l_PROC_COST_10 */
	public List l_PROC_COST_10 = null;

	/** 第 13 List変数： l_PROC_COST_11 */
	public List l_PROC_COST_11 = null;

	/** 第 14 List変数： l_PROC_COST_12 */
	public List l_PROC_COST_12 = null;

	/** 第 15 List変数： l_PROC_COST_SUM */
	public List l_PROC_COST_SUM = null;

	/** 第 16 List変数： l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** 第 17 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 18 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 19 List変数： l_YEAR */
	public List l_YEAR = null;

	/** 第 20 List変数： l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** 第 21 List変数： l_COST_TYP */
	public List l_COST_TYP = null;

	/** 第 22 List変数： l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** 第 23 List変数： l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** 第 24 List変数： l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** 第 25 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 26 List変数： l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** 第 27 List変数： l_PROC_COST_CLS_NAME */
	public List l_PROC_COST_CLS_NAME = null;

	/** 第 28 List変数： l_PROC_COST_01_NAME */
	public List l_PROC_COST_01_NAME = null;

	/** 第 29 List変数： l_PROC_COST_02_NAME */
	public List l_PROC_COST_02_NAME = null;

	/** 第 30 List変数： l_PROC_COST_03_NAME */
	public List l_PROC_COST_03_NAME = null;

	/** 第 31 List変数： l_PROC_COST_04_NAME */
	public List l_PROC_COST_04_NAME = null;

	/** 第 32 List変数： l_PROC_COST_05_NAME */
	public List l_PROC_COST_05_NAME = null;

	/** 第 33 List変数： l_PROC_COST_06_NAME */
	public List l_PROC_COST_06_NAME = null;

	/** 第 34 List変数： l_PROC_COST_07_NAME */
	public List l_PROC_COST_07_NAME = null;

	/** 第 35 List変数： l_PROC_COST_08_NAME */
	public List l_PROC_COST_08_NAME = null;

	/** 第 36 List変数： l_PROC_COST_09_NAME */
	public List l_PROC_COST_09_NAME = null;

	/** 第 37 List変数： l_PROC_COST_10_NAME */
	public List l_PROC_COST_10_NAME = null;

	/** 第 38 List変数： l_PROC_COST_11_NAME */
	public List l_PROC_COST_11_NAME = null;

	/** 第 39 List変数： l_PROC_COST_12_NAME */
	public List l_PROC_COST_12_NAME = null;

	/** 第 40 List変数： l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** 第 41 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 42 List変数： l_h_YEAR */
	public List l_h_YEAR = null;

	/** 第 43 List変数： l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** 第 44 List変数： l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** 第 45 List変数： l_h_HALF_TERM_TYP */
	public List l_h_HALF_TERM_TYP = null;

	/** 第 46 List変数： l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** 第 47 List変数： l_COST_TYP_val */
	public List l_COST_TYP_val = null;

	/** 第 48 List変数： l_h_COST_TYP */
	public List l_h_COST_TYP = null;

	/** 第 49 List変数： l_h_CS_PROC_CD */
	public List l_h_CS_PROC_CD = null;

	/** 第 50 List変数： l_h_PROC_COST_CLS_CD */
	public List l_h_PROC_COST_CLS_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getPROC_COST_UNIT_QTY() { return m_PROC_COST_UNIT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPROC_COST_01() { return m_PROC_COST_01; }
	public String getPROC_COST_02() { return m_PROC_COST_02; }
	public String getPROC_COST_03() { return m_PROC_COST_03; }
	public String getPROC_COST_04() { return m_PROC_COST_04; }
	public String getPROC_COST_05() { return m_PROC_COST_05; }
	public String getPROC_COST_06() { return m_PROC_COST_06; }
	public String getPROC_COST_07() { return m_PROC_COST_07; }
	public String getPROC_COST_08() { return m_PROC_COST_08; }
	public String getPROC_COST_09() { return m_PROC_COST_09; }
	public String getPROC_COST_10() { return m_PROC_COST_10; }
	public String getPROC_COST_11() { return m_PROC_COST_11; }
	public String getPROC_COST_12() { return m_PROC_COST_12; }
	public String getPROC_COST_SUM() { return m_PROC_COST_SUM; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getPROC_COST_CLS_NAME() { return m_PROC_COST_CLS_NAME; }
	public String getPROC_COST_01_NAME() { return m_PROC_COST_01_NAME; }
	public String getPROC_COST_02_NAME() { return m_PROC_COST_02_NAME; }
	public String getPROC_COST_03_NAME() { return m_PROC_COST_03_NAME; }
	public String getPROC_COST_04_NAME() { return m_PROC_COST_04_NAME; }
	public String getPROC_COST_05_NAME() { return m_PROC_COST_05_NAME; }
	public String getPROC_COST_06_NAME() { return m_PROC_COST_06_NAME; }
	public String getPROC_COST_07_NAME() { return m_PROC_COST_07_NAME; }
	public String getPROC_COST_08_NAME() { return m_PROC_COST_08_NAME; }
	public String getPROC_COST_09_NAME() { return m_PROC_COST_09_NAME; }
	public String getPROC_COST_10_NAME() { return m_PROC_COST_10_NAME; }
	public String getPROC_COST_11_NAME() { return m_PROC_COST_11_NAME; }
	public String getPROC_COST_12_NAME() { return m_PROC_COST_12_NAME; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String geth_YEAR() { return m_h_YEAR; }
	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String geth_HALF_TERM_TYP() { return m_h_HALF_TERM_TYP; }
	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }
	public String geth_COST_TYP() { return m_h_COST_TYP; }
	public String geth_CS_PROC_CD() { return m_h_CS_PROC_CD; }
	public String geth_PROC_COST_CLS_CD() { return m_h_PROC_COST_CLS_CD; }

	public List getList_PROC_COST_UNIT_QTY() { return l_PROC_COST_UNIT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PROC_COST_01() { return l_PROC_COST_01; }
	public List getList_PROC_COST_02() { return l_PROC_COST_02; }
	public List getList_PROC_COST_03() { return l_PROC_COST_03; }
	public List getList_PROC_COST_04() { return l_PROC_COST_04; }
	public List getList_PROC_COST_05() { return l_PROC_COST_05; }
	public List getList_PROC_COST_06() { return l_PROC_COST_06; }
	public List getList_PROC_COST_07() { return l_PROC_COST_07; }
	public List getList_PROC_COST_08() { return l_PROC_COST_08; }
	public List getList_PROC_COST_09() { return l_PROC_COST_09; }
	public List getList_PROC_COST_10() { return l_PROC_COST_10; }
	public List getList_PROC_COST_11() { return l_PROC_COST_11; }
	public List getList_PROC_COST_12() { return l_PROC_COST_12; }
	public List getList_PROC_COST_SUM() { return l_PROC_COST_SUM; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_PROC_COST_CLS_NAME() { return l_PROC_COST_CLS_NAME; }
	public List getList_PROC_COST_01_NAME() { return l_PROC_COST_01_NAME; }
	public List getList_PROC_COST_02_NAME() { return l_PROC_COST_02_NAME; }
	public List getList_PROC_COST_03_NAME() { return l_PROC_COST_03_NAME; }
	public List getList_PROC_COST_04_NAME() { return l_PROC_COST_04_NAME; }
	public List getList_PROC_COST_05_NAME() { return l_PROC_COST_05_NAME; }
	public List getList_PROC_COST_06_NAME() { return l_PROC_COST_06_NAME; }
	public List getList_PROC_COST_07_NAME() { return l_PROC_COST_07_NAME; }
	public List getList_PROC_COST_08_NAME() { return l_PROC_COST_08_NAME; }
	public List getList_PROC_COST_09_NAME() { return l_PROC_COST_09_NAME; }
	public List getList_PROC_COST_10_NAME() { return l_PROC_COST_10_NAME; }
	public List getList_PROC_COST_11_NAME() { return l_PROC_COST_11_NAME; }
	public List getList_PROC_COST_12_NAME() { return l_PROC_COST_12_NAME; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_h_YEAR() { return l_h_YEAR; }
	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_h_HALF_TERM_TYP() { return l_h_HALF_TERM_TYP; }
	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }
	public List getList_h_COST_TYP() { return l_h_COST_TYP; }
	public List getList_h_CS_PROC_CD() { return l_h_CS_PROC_CD; }
	public List getList_h_PROC_COST_CLS_CD() { return l_h_PROC_COST_CLS_CD; }

	public void setPROC_COST_UNIT_QTY(String val) { m_PROC_COST_UNIT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPROC_COST_01(String val) { m_PROC_COST_01 = val; }
	public void setPROC_COST_02(String val) { m_PROC_COST_02 = val; }
	public void setPROC_COST_03(String val) { m_PROC_COST_03 = val; }
	public void setPROC_COST_04(String val) { m_PROC_COST_04 = val; }
	public void setPROC_COST_05(String val) { m_PROC_COST_05 = val; }
	public void setPROC_COST_06(String val) { m_PROC_COST_06 = val; }
	public void setPROC_COST_07(String val) { m_PROC_COST_07 = val; }
	public void setPROC_COST_08(String val) { m_PROC_COST_08 = val; }
	public void setPROC_COST_09(String val) { m_PROC_COST_09 = val; }
	public void setPROC_COST_10(String val) { m_PROC_COST_10 = val; }
	public void setPROC_COST_11(String val) { m_PROC_COST_11 = val; }
	public void setPROC_COST_12(String val) { m_PROC_COST_12 = val; }
	public void setPROC_COST_SUM(String val) { m_PROC_COST_SUM = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setPROC_COST_CLS_NAME(String val) { m_PROC_COST_CLS_NAME = val; }
	public void setPROC_COST_01_NAME(String val) { m_PROC_COST_01_NAME = val; }
	public void setPROC_COST_02_NAME(String val) { m_PROC_COST_02_NAME = val; }
	public void setPROC_COST_03_NAME(String val) { m_PROC_COST_03_NAME = val; }
	public void setPROC_COST_04_NAME(String val) { m_PROC_COST_04_NAME = val; }
	public void setPROC_COST_05_NAME(String val) { m_PROC_COST_05_NAME = val; }
	public void setPROC_COST_06_NAME(String val) { m_PROC_COST_06_NAME = val; }
	public void setPROC_COST_07_NAME(String val) { m_PROC_COST_07_NAME = val; }
	public void setPROC_COST_08_NAME(String val) { m_PROC_COST_08_NAME = val; }
	public void setPROC_COST_09_NAME(String val) { m_PROC_COST_09_NAME = val; }
	public void setPROC_COST_10_NAME(String val) { m_PROC_COST_10_NAME = val; }
	public void setPROC_COST_11_NAME(String val) { m_PROC_COST_11_NAME = val; }
	public void setPROC_COST_12_NAME(String val) { m_PROC_COST_12_NAME = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void seth_YEAR(String val) { m_h_YEAR = val; }
	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void seth_HALF_TERM_TYP(String val) { m_h_HALF_TERM_TYP = val; }
	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }
	public void seth_COST_TYP(String val) { m_h_COST_TYP = val; }
	public void seth_CS_PROC_CD(String val) { m_h_CS_PROC_CD = val; }
	public void seth_PROC_COST_CLS_CD(String val) { m_h_PROC_COST_CLS_CD = val; }


	public void setList_PROC_COST_UNIT_QTY(List list) { l_PROC_COST_UNIT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PROC_COST_01(List list) { l_PROC_COST_01 = list; }
	public void setList_PROC_COST_02(List list) { l_PROC_COST_02 = list; }
	public void setList_PROC_COST_03(List list) { l_PROC_COST_03 = list; }
	public void setList_PROC_COST_04(List list) { l_PROC_COST_04 = list; }
	public void setList_PROC_COST_05(List list) { l_PROC_COST_05 = list; }
	public void setList_PROC_COST_06(List list) { l_PROC_COST_06 = list; }
	public void setList_PROC_COST_07(List list) { l_PROC_COST_07 = list; }
	public void setList_PROC_COST_08(List list) { l_PROC_COST_08 = list; }
	public void setList_PROC_COST_09(List list) { l_PROC_COST_09 = list; }
	public void setList_PROC_COST_10(List list) { l_PROC_COST_10 = list; }
	public void setList_PROC_COST_11(List list) { l_PROC_COST_11 = list; }
	public void setList_PROC_COST_12(List list) { l_PROC_COST_12 = list; }
	public void setList_PROC_COST_SUM(List list) { l_PROC_COST_SUM = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_PROC_COST_CLS_NAME(List list) { l_PROC_COST_CLS_NAME = list; }
	public void setList_PROC_COST_01_NAME(List list) { l_PROC_COST_01_NAME = list; }
	public void setList_PROC_COST_02_NAME(List list) { l_PROC_COST_02_NAME = list; }
	public void setList_PROC_COST_03_NAME(List list) { l_PROC_COST_03_NAME = list; }
	public void setList_PROC_COST_04_NAME(List list) { l_PROC_COST_04_NAME = list; }
	public void setList_PROC_COST_05_NAME(List list) { l_PROC_COST_05_NAME = list; }
	public void setList_PROC_COST_06_NAME(List list) { l_PROC_COST_06_NAME = list; }
	public void setList_PROC_COST_07_NAME(List list) { l_PROC_COST_07_NAME = list; }
	public void setList_PROC_COST_08_NAME(List list) { l_PROC_COST_08_NAME = list; }
	public void setList_PROC_COST_09_NAME(List list) { l_PROC_COST_09_NAME = list; }
	public void setList_PROC_COST_10_NAME(List list) { l_PROC_COST_10_NAME = list; }
	public void setList_PROC_COST_11_NAME(List list) { l_PROC_COST_11_NAME = list; }
	public void setList_PROC_COST_12_NAME(List list) { l_PROC_COST_12_NAME = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_h_YEAR(List list) { l_h_YEAR = list; }
	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_h_HALF_TERM_TYP(List list) { l_h_HALF_TERM_TYP = list; }
	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }
	public void setList_h_COST_TYP(List list) { l_h_COST_TYP = list; }
	public void setList_h_CS_PROC_CD(List list) { l_h_CS_PROC_CD = list; }
	public void setList_h_PROC_COST_CLS_CD(List list) { l_h_PROC_COST_CLS_CD = list; }

	public int setL2L_PROC_COST_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_UNIT_QTY == null) {
			l_PROC_COST_UNIT_QTY = new ArrayList();
		} else {
			l_PROC_COST_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_UNIT_QTY.add(((DA0030010Struct) list.get(i)).getPROC_COST_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((DA0030010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01 == null) {
			l_PROC_COST_01 = new ArrayList();
		} else {
			l_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01.add(((DA0030010Struct) list.get(i)).getPROC_COST_01());
		}
		return size;
	}
	public int setL2L_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02 == null) {
			l_PROC_COST_02 = new ArrayList();
		} else {
			l_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02.add(((DA0030010Struct) list.get(i)).getPROC_COST_02());
		}
		return size;
	}
	public int setL2L_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03 == null) {
			l_PROC_COST_03 = new ArrayList();
		} else {
			l_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03.add(((DA0030010Struct) list.get(i)).getPROC_COST_03());
		}
		return size;
	}
	public int setL2L_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04 == null) {
			l_PROC_COST_04 = new ArrayList();
		} else {
			l_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04.add(((DA0030010Struct) list.get(i)).getPROC_COST_04());
		}
		return size;
	}
	public int setL2L_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05 == null) {
			l_PROC_COST_05 = new ArrayList();
		} else {
			l_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05.add(((DA0030010Struct) list.get(i)).getPROC_COST_05());
		}
		return size;
	}
	public int setL2L_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06 == null) {
			l_PROC_COST_06 = new ArrayList();
		} else {
			l_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06.add(((DA0030010Struct) list.get(i)).getPROC_COST_06());
		}
		return size;
	}
	public int setL2L_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07 == null) {
			l_PROC_COST_07 = new ArrayList();
		} else {
			l_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07.add(((DA0030010Struct) list.get(i)).getPROC_COST_07());
		}
		return size;
	}
	public int setL2L_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08 == null) {
			l_PROC_COST_08 = new ArrayList();
		} else {
			l_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08.add(((DA0030010Struct) list.get(i)).getPROC_COST_08());
		}
		return size;
	}
	public int setL2L_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09 == null) {
			l_PROC_COST_09 = new ArrayList();
		} else {
			l_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09.add(((DA0030010Struct) list.get(i)).getPROC_COST_09());
		}
		return size;
	}
	public int setL2L_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10 == null) {
			l_PROC_COST_10 = new ArrayList();
		} else {
			l_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10.add(((DA0030010Struct) list.get(i)).getPROC_COST_10());
		}
		return size;
	}
	public int setL2L_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11 == null) {
			l_PROC_COST_11 = new ArrayList();
		} else {
			l_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11.add(((DA0030010Struct) list.get(i)).getPROC_COST_11());
		}
		return size;
	}
	public int setL2L_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12 == null) {
			l_PROC_COST_12 = new ArrayList();
		} else {
			l_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12.add(((DA0030010Struct) list.get(i)).getPROC_COST_12());
		}
		return size;
	}
	public int setL2L_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_SUM == null) {
			l_PROC_COST_SUM = new ArrayList();
		} else {
			l_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_SUM.add(((DA0030010Struct) list.get(i)).getPROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((DA0030010Struct) list.get(i)).getDEL_FLG());
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
			l_MODIFY_COUNT.add(((DA0030010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DA0030010Struct) list.get(i)).getPLANT_CD());
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
			l_YEAR.add(((DA0030010Struct) list.get(i)).getYEAR());
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
			l_HALF_TERM_TYP.add(((DA0030010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DA0030010Struct) list.get(i)).getCOST_TYP());
		}
		return size;
	}
	public int setL2L_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_CD == null) {
			l_CS_PROC_CD = new ArrayList();
		} else {
			l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_CD.add(((DA0030010Struct) list.get(i)).getCS_PROC_CD());
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
			l_PROC_COST_CLS_CD.add(((DA0030010Struct) list.get(i)).getPROC_COST_CLS_CD());
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
			l_CURRENT_YEAR.add(((DA0030010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_PLANT_NAME.add(((DA0030010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_NAME == null) {
			l_CS_PROC_NAME = new ArrayList();
		} else {
			l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_NAME.add(((DA0030010Struct) list.get(i)).getCS_PROC_NAME());
		}
		return size;
	}
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
			l_PROC_COST_CLS_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_CLS_NAME());
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
			l_PROC_COST_01_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_01_NAME());
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
			l_PROC_COST_02_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_02_NAME());
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
			l_PROC_COST_03_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_03_NAME());
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
			l_PROC_COST_04_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_04_NAME());
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
			l_PROC_COST_05_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_05_NAME());
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
			l_PROC_COST_06_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_06_NAME());
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
			l_PROC_COST_07_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_07_NAME());
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
			l_PROC_COST_08_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_08_NAME());
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
			l_PROC_COST_09_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_09_NAME());
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
			l_PROC_COST_10_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_10_NAME());
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
			l_PROC_COST_11_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_11_NAME());
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
			l_PROC_COST_12_NAME.add(((DA0030010Struct) list.get(i)).getPROC_COST_12_NAME());
		}
		return size;
	}
	public int setL2L_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_UNIT == null) {
			l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_UNIT.add(((DA0030010Struct) list.get(i)).getHOME_CUR_UNIT());
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
			l_h_PLANT_CD.add(((DA0030010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_YEAR == null) {
			l_h_YEAR = new ArrayList();
		} else {
			l_h_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_YEAR.add(((DA0030010Struct) list.get(i)).geth_YEAR());
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
			l_HALF_TERM_TYP_name.add(((DA0030010Struct) list.get(i)).getHALF_TERM_TYP_name());
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
			l_HALF_TERM_TYP_val.add(((DA0030010Struct) list.get(i)).getHALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_h_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HALF_TERM_TYP == null) {
			l_h_HALF_TERM_TYP = new ArrayList();
		} else {
			l_h_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HALF_TERM_TYP.add(((DA0030010Struct) list.get(i)).geth_HALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_name == null) {
			l_COST_TYP_name = new ArrayList();
		} else {
			l_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_name.add(((DA0030010Struct) list.get(i)).getCOST_TYP_name());
		}
		return size;
	}
	public int setL2L_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_val == null) {
			l_COST_TYP_val = new ArrayList();
		} else {
			l_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_val.add(((DA0030010Struct) list.get(i)).getCOST_TYP_val());
		}
		return size;
	}
	public int setL2L_h_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COST_TYP == null) {
			l_h_COST_TYP = new ArrayList();
		} else {
			l_h_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COST_TYP.add(((DA0030010Struct) list.get(i)).geth_COST_TYP());
		}
		return size;
	}
	public int setL2L_h_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CS_PROC_CD == null) {
			l_h_CS_PROC_CD = new ArrayList();
		} else {
			l_h_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CS_PROC_CD.add(((DA0030010Struct) list.get(i)).geth_CS_PROC_CD());
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
			l_h_PROC_COST_CLS_CD.add(((DA0030010Struct) list.get(i)).geth_PROC_COST_CLS_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PROC_COST_UNIT_QTY = null;
		m_STOCK_UNIT = null;
		m_PROC_COST_01 = null;
		m_PROC_COST_02 = null;
		m_PROC_COST_03 = null;
		m_PROC_COST_04 = null;
		m_PROC_COST_05 = null;
		m_PROC_COST_06 = null;
		m_PROC_COST_07 = null;
		m_PROC_COST_08 = null;
		m_PROC_COST_09 = null;
		m_PROC_COST_10 = null;
		m_PROC_COST_11 = null;
		m_PROC_COST_12 = null;
		m_PROC_COST_SUM = null;
		m_DEL_FLG = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_CS_PROC_CD = null;
		m_PROC_COST_CLS_CD = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_CS_PROC_NAME = null;
		m_PROC_COST_CLS_NAME = null;
		m_PROC_COST_01_NAME = null;
		m_PROC_COST_02_NAME = null;
		m_PROC_COST_03_NAME = null;
		m_PROC_COST_04_NAME = null;
		m_PROC_COST_05_NAME = null;
		m_PROC_COST_06_NAME = null;
		m_PROC_COST_07_NAME = null;
		m_PROC_COST_08_NAME = null;
		m_PROC_COST_09_NAME = null;
		m_PROC_COST_10_NAME = null;
		m_PROC_COST_11_NAME = null;
		m_PROC_COST_12_NAME = null;
		m_HOME_CUR_UNIT = null;
		m_h_PLANT_CD = null;
		m_h_YEAR = null;
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_h_HALF_TERM_TYP = null;
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;
		m_h_COST_TYP = null;
		m_h_CS_PROC_CD = null;
		m_h_PROC_COST_CLS_CD = null;

		l_PROC_COST_UNIT_QTY = null;
		l_STOCK_UNIT = null;
		l_PROC_COST_01 = null;
		l_PROC_COST_02 = null;
		l_PROC_COST_03 = null;
		l_PROC_COST_04 = null;
		l_PROC_COST_05 = null;
		l_PROC_COST_06 = null;
		l_PROC_COST_07 = null;
		l_PROC_COST_08 = null;
		l_PROC_COST_09 = null;
		l_PROC_COST_10 = null;
		l_PROC_COST_11 = null;
		l_PROC_COST_12 = null;
		l_PROC_COST_SUM = null;
		l_DEL_FLG = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_COST_TYP = null;
		l_CS_PROC_CD = null;
		l_PROC_COST_CLS_CD = null;
		l_CURRENT_YEAR = null;
		l_PLANT_NAME = null;
		l_CS_PROC_NAME = null;
		l_PROC_COST_CLS_NAME = null;
		l_PROC_COST_01_NAME = null;
		l_PROC_COST_02_NAME = null;
		l_PROC_COST_03_NAME = null;
		l_PROC_COST_04_NAME = null;
		l_PROC_COST_05_NAME = null;
		l_PROC_COST_06_NAME = null;
		l_PROC_COST_07_NAME = null;
		l_PROC_COST_08_NAME = null;
		l_PROC_COST_09_NAME = null;
		l_PROC_COST_10_NAME = null;
		l_PROC_COST_11_NAME = null;
		l_PROC_COST_12_NAME = null;
		l_HOME_CUR_UNIT = null;
		l_h_PLANT_CD = null;
		l_h_YEAR = null;
		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_h_HALF_TERM_TYP = null;
		l_COST_TYP_name = null;
		l_COST_TYP_val = null;
		l_h_COST_TYP = null;
		l_h_CS_PROC_CD = null;
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
	 * medDA0030010クラスの標準コンストラクタ
	 */
	public DA0030010Struct()
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
	public void setStruct(DA0030010Struct struct)
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
	public void setStructM(DA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPROC_COST_UNIT_QTY(struct.getPROC_COST_UNIT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPROC_COST_01(struct.getPROC_COST_01());
			this.setPROC_COST_02(struct.getPROC_COST_02());
			this.setPROC_COST_03(struct.getPROC_COST_03());
			this.setPROC_COST_04(struct.getPROC_COST_04());
			this.setPROC_COST_05(struct.getPROC_COST_05());
			this.setPROC_COST_06(struct.getPROC_COST_06());
			this.setPROC_COST_07(struct.getPROC_COST_07());
			this.setPROC_COST_08(struct.getPROC_COST_08());
			this.setPROC_COST_09(struct.getPROC_COST_09());
			this.setPROC_COST_10(struct.getPROC_COST_10());
			this.setPROC_COST_11(struct.getPROC_COST_11());
			this.setPROC_COST_12(struct.getPROC_COST_12());
			this.setPROC_COST_SUM(struct.getPROC_COST_SUM());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setPROC_COST_CLS_NAME(struct.getPROC_COST_CLS_NAME());
			this.setPROC_COST_01_NAME(struct.getPROC_COST_01_NAME());
			this.setPROC_COST_02_NAME(struct.getPROC_COST_02_NAME());
			this.setPROC_COST_03_NAME(struct.getPROC_COST_03_NAME());
			this.setPROC_COST_04_NAME(struct.getPROC_COST_04_NAME());
			this.setPROC_COST_05_NAME(struct.getPROC_COST_05_NAME());
			this.setPROC_COST_06_NAME(struct.getPROC_COST_06_NAME());
			this.setPROC_COST_07_NAME(struct.getPROC_COST_07_NAME());
			this.setPROC_COST_08_NAME(struct.getPROC_COST_08_NAME());
			this.setPROC_COST_09_NAME(struct.getPROC_COST_09_NAME());
			this.setPROC_COST_10_NAME(struct.getPROC_COST_10_NAME());
			this.setPROC_COST_11_NAME(struct.getPROC_COST_11_NAME());
			this.setPROC_COST_12_NAME(struct.getPROC_COST_12_NAME());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.seth_YEAR(struct.geth_YEAR());
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.seth_HALF_TERM_TYP(struct.geth_HALF_TERM_TYP());
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
			this.seth_COST_TYP(struct.geth_COST_TYP());
			this.seth_CS_PROC_CD(struct.geth_CS_PROC_CD());
			this.seth_PROC_COST_CLS_CD(struct.geth_PROC_COST_CLS_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PROC_COST_UNIT_QTY(struct.getList_PROC_COST_UNIT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PROC_COST_01(struct.getList_PROC_COST_01());
			this.setList_PROC_COST_02(struct.getList_PROC_COST_02());
			this.setList_PROC_COST_03(struct.getList_PROC_COST_03());
			this.setList_PROC_COST_04(struct.getList_PROC_COST_04());
			this.setList_PROC_COST_05(struct.getList_PROC_COST_05());
			this.setList_PROC_COST_06(struct.getList_PROC_COST_06());
			this.setList_PROC_COST_07(struct.getList_PROC_COST_07());
			this.setList_PROC_COST_08(struct.getList_PROC_COST_08());
			this.setList_PROC_COST_09(struct.getList_PROC_COST_09());
			this.setList_PROC_COST_10(struct.getList_PROC_COST_10());
			this.setList_PROC_COST_11(struct.getList_PROC_COST_11());
			this.setList_PROC_COST_12(struct.getList_PROC_COST_12());
			this.setList_PROC_COST_SUM(struct.getList_PROC_COST_SUM());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_PROC_COST_CLS_NAME(struct.getList_PROC_COST_CLS_NAME());
			this.setList_PROC_COST_01_NAME(struct.getList_PROC_COST_01_NAME());
			this.setList_PROC_COST_02_NAME(struct.getList_PROC_COST_02_NAME());
			this.setList_PROC_COST_03_NAME(struct.getList_PROC_COST_03_NAME());
			this.setList_PROC_COST_04_NAME(struct.getList_PROC_COST_04_NAME());
			this.setList_PROC_COST_05_NAME(struct.getList_PROC_COST_05_NAME());
			this.setList_PROC_COST_06_NAME(struct.getList_PROC_COST_06_NAME());
			this.setList_PROC_COST_07_NAME(struct.getList_PROC_COST_07_NAME());
			this.setList_PROC_COST_08_NAME(struct.getList_PROC_COST_08_NAME());
			this.setList_PROC_COST_09_NAME(struct.getList_PROC_COST_09_NAME());
			this.setList_PROC_COST_10_NAME(struct.getList_PROC_COST_10_NAME());
			this.setList_PROC_COST_11_NAME(struct.getList_PROC_COST_11_NAME());
			this.setList_PROC_COST_12_NAME(struct.getList_PROC_COST_12_NAME());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_h_YEAR(struct.getList_h_YEAR());
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_h_HALF_TERM_TYP(struct.getList_h_HALF_TERM_TYP());
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
			this.setList_h_COST_TYP(struct.getList_h_COST_TYP());
			this.setList_h_CS_PROC_CD(struct.getList_h_CS_PROC_CD());
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
	// 第 1 変数初期値： i_PROC_COST_UNIT_QTY


	final static String i_PROC_COST_UNIT_QTY = null;

	// 第 2 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 3 変数初期値： i_PROC_COST_01


	final static String i_PROC_COST_01 = null;

	// 第 4 変数初期値： i_PROC_COST_02


	final static String i_PROC_COST_02 = null;

	// 第 5 変数初期値： i_PROC_COST_03


	final static String i_PROC_COST_03 = null;

	// 第 6 変数初期値： i_PROC_COST_04


	final static String i_PROC_COST_04 = null;

	// 第 7 変数初期値： i_PROC_COST_05


	final static String i_PROC_COST_05 = null;

	// 第 8 変数初期値： i_PROC_COST_06


	final static String i_PROC_COST_06 = null;

	// 第 9 変数初期値： i_PROC_COST_07


	final static String i_PROC_COST_07 = null;

	// 第 10 変数初期値： i_PROC_COST_08


	final static String i_PROC_COST_08 = null;

	// 第 11 変数初期値： i_PROC_COST_09


	final static String i_PROC_COST_09 = null;

	// 第 12 変数初期値： i_PROC_COST_10


	final static String i_PROC_COST_10 = null;

	// 第 13 変数初期値： i_PROC_COST_11


	final static String i_PROC_COST_11 = null;

	// 第 14 変数初期値： i_PROC_COST_12


	final static String i_PROC_COST_12 = null;

	// 第 15 変数初期値： i_PROC_COST_SUM


	final static String i_PROC_COST_SUM = null;

	// 第 16 変数初期値： i_DEL_FLG


	final static String i_DEL_FLG = null;

	// 第 17 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 18 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 19 変数初期値： i_YEAR


	final static String i_YEAR = null;

	// 第 20 変数初期値： i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// 第 21 変数初期値： i_COST_TYP


	final static String i_COST_TYP = null;

	// 第 22 変数初期値： i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// 第 23 変数初期値： i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// 第 24 変数初期値： i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// 第 25 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 26 変数初期値： i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// 第 27 変数初期値： i_PROC_COST_CLS_NAME


	final static String i_PROC_COST_CLS_NAME = null;

	// 第 28 変数初期値： i_PROC_COST_01_NAME


	final static String i_PROC_COST_01_NAME = null;

	// 第 29 変数初期値： i_PROC_COST_02_NAME


	final static String i_PROC_COST_02_NAME = null;

	// 第 30 変数初期値： i_PROC_COST_03_NAME


	final static String i_PROC_COST_03_NAME = null;

	// 第 31 変数初期値： i_PROC_COST_04_NAME


	final static String i_PROC_COST_04_NAME = null;

	// 第 32 変数初期値： i_PROC_COST_05_NAME


	final static String i_PROC_COST_05_NAME = null;

	// 第 33 変数初期値： i_PROC_COST_06_NAME


	final static String i_PROC_COST_06_NAME = null;

	// 第 34 変数初期値： i_PROC_COST_07_NAME


	final static String i_PROC_COST_07_NAME = null;

	// 第 35 変数初期値： i_PROC_COST_08_NAME


	final static String i_PROC_COST_08_NAME = null;

	// 第 36 変数初期値： i_PROC_COST_09_NAME


	final static String i_PROC_COST_09_NAME = null;

	// 第 37 変数初期値： i_PROC_COST_10_NAME


	final static String i_PROC_COST_10_NAME = null;

	// 第 38 変数初期値： i_PROC_COST_11_NAME


	final static String i_PROC_COST_11_NAME = null;

	// 第 39 変数初期値： i_PROC_COST_12_NAME


	final static String i_PROC_COST_12_NAME = null;

	// 第 40 変数初期値： i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// 第 41 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 42 変数初期値： i_h_YEAR


	final static String i_h_YEAR = null;

	// 第 43 変数初期値： i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// 第 44 変数初期値： i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// 第 45 変数初期値： i_h_HALF_TERM_TYP


	final static String i_h_HALF_TERM_TYP = null;

	// 第 46 変数初期値： i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// 第 47 変数初期値： i_COST_TYP_val


	final static String i_COST_TYP_val = null;

	// 第 48 変数初期値： i_h_COST_TYP


	final static String i_h_COST_TYP = null;

	// 第 49 変数初期値： i_h_CS_PROC_CD


	final static String i_h_CS_PROC_CD = null;

	// 第 50 変数初期値： i_h_PROC_COST_CLS_CD


	final static String i_h_PROC_COST_CLS_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_PROC_COST_UNIT_QTY
        final static String i_PROC_COST_UNIT_QTY = null;
        // 第 2 変数初期値： i_STOCK_UNIT
        final static String i_STOCK_UNIT = null;
        // 第 3 変数初期値： i_PROC_COST_01
        final static String i_PROC_COST_01 = null;
        // 第 4 変数初期値： i_PROC_COST_02
        final static String i_PROC_COST_02 = null;
        // 第 5 変数初期値： i_PROC_COST_03
        final static String i_PROC_COST_03 = null;
        // 第 6 変数初期値： i_PROC_COST_04
        final static String i_PROC_COST_04 = null;
        // 第 7 変数初期値： i_PROC_COST_05
        final static String i_PROC_COST_05 = null;
        // 第 8 変数初期値： i_PROC_COST_06
        final static String i_PROC_COST_06 = null;
        // 第 9 変数初期値： i_PROC_COST_07
        final static String i_PROC_COST_07 = null;
        // 第 10 変数初期値： i_PROC_COST_08
        final static String i_PROC_COST_08 = null;
        // 第 11 変数初期値： i_PROC_COST_09
        final static String i_PROC_COST_09 = null;
        // 第 12 変数初期値： i_PROC_COST_10
        final static String i_PROC_COST_10 = null;
        // 第 13 変数初期値： i_PROC_COST_11
        final static String i_PROC_COST_11 = null;
        // 第 14 変数初期値： i_PROC_COST_12
        final static String i_PROC_COST_12 = null;
        // 第 15 変数初期値： i_PROC_COST_SUM
        final static String i_PROC_COST_SUM = null;
        // 第 16 変数初期値： i_DEL_FLG
        final static String i_DEL_FLG = null;
        // 第 17 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 18 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 19 変数初期値： i_YEAR
        final static String i_YEAR = null;
        // 第 20 変数初期値： i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // 第 21 変数初期値： i_COST_TYP
        final static String i_COST_TYP = null;
        // 第 22 変数初期値： i_CS_PROC_CD
        final static String i_CS_PROC_CD = null;
        // 第 23 変数初期値： i_PROC_COST_CLS_CD
        final static String i_PROC_COST_CLS_CD = null;
        // 第 24 変数初期値： i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // 第 25 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 26 変数初期値： i_CS_PROC_NAME
        final static String i_CS_PROC_NAME = null;
        // 第 27 変数初期値： i_PROC_COST_CLS_NAME
        final static String i_PROC_COST_CLS_NAME = null;
        // 第 28 変数初期値： i_PROC_COST_01_NAME
        final static String i_PROC_COST_01_NAME = null;
        // 第 29 変数初期値： i_PROC_COST_02_NAME
        final static String i_PROC_COST_02_NAME = null;
        // 第 30 変数初期値： i_PROC_COST_03_NAME
        final static String i_PROC_COST_03_NAME = null;
        // 第 31 変数初期値： i_PROC_COST_04_NAME
        final static String i_PROC_COST_04_NAME = null;
        // 第 32 変数初期値： i_PROC_COST_05_NAME
        final static String i_PROC_COST_05_NAME = null;
        // 第 33 変数初期値： i_PROC_COST_06_NAME
        final static String i_PROC_COST_06_NAME = null;
        // 第 34 変数初期値： i_PROC_COST_07_NAME
        final static String i_PROC_COST_07_NAME = null;
        // 第 35 変数初期値： i_PROC_COST_08_NAME
        final static String i_PROC_COST_08_NAME = null;
        // 第 36 変数初期値： i_PROC_COST_09_NAME
        final static String i_PROC_COST_09_NAME = null;
        // 第 37 変数初期値： i_PROC_COST_10_NAME
        final static String i_PROC_COST_10_NAME = null;
        // 第 38 変数初期値： i_PROC_COST_11_NAME
        final static String i_PROC_COST_11_NAME = null;
        // 第 39 変数初期値： i_PROC_COST_12_NAME
        final static String i_PROC_COST_12_NAME = null;
        // 第 40 変数初期値： i_h_PLANT_CD
        final static String i_h_PLANT_CD = null;
        // 第 41 変数初期値： i_h_YEAR
        final static String i_h_YEAR = null;
        // 第 42 変数初期値： i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // 第 43 変数初期値： i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // 第 44 変数初期値： i_h_HALF_TERM_TYP
        final static String i_h_HALF_TERM_TYP = null;
        // 第 45 変数初期値： i_COST_TYP_name
        final static String i_COST_TYP_name = null;
        // 第 46 変数初期値： i_COST_TYP_val
        final static String i_COST_TYP_val = null;
        // 第 47 変数初期値： i_h_COST_TYP
        final static String i_h_COST_TYP = null;
        // 第 48 変数初期値： i_h_CS_PROC_CD
        final static String i_h_CS_PROC_CD = null;
        // 第 49 変数初期値： i_h_PROC_COST_CLS_CD
        final static String i_h_PROC_COST_CLS_CD = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PROC_COST_UNIT_QTY = i_PROC_COST_UNIT_QTY;
         m_STOCK_UNIT = i_STOCK_UNIT;
         m_PROC_COST_01 = i_PROC_COST_01;
         m_PROC_COST_02 = i_PROC_COST_02;
         m_PROC_COST_03 = i_PROC_COST_03;
         m_PROC_COST_04 = i_PROC_COST_04;
         m_PROC_COST_05 = i_PROC_COST_05;
         m_PROC_COST_06 = i_PROC_COST_06;
         m_PROC_COST_07 = i_PROC_COST_07;
         m_PROC_COST_08 = i_PROC_COST_08;
         m_PROC_COST_09 = i_PROC_COST_09;
         m_PROC_COST_10 = i_PROC_COST_10;
         m_PROC_COST_11 = i_PROC_COST_11;
         m_PROC_COST_12 = i_PROC_COST_12;
         m_PROC_COST_SUM = i_PROC_COST_SUM;
         m_DEL_FLG = i_DEL_FLG;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_YEAR = i_YEAR;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_COST_TYP = i_COST_TYP;
         m_CS_PROC_CD = i_CS_PROC_CD;
         m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_PLANT_NAME = i_PLANT_NAME;
         m_CS_PROC_NAME = i_CS_PROC_NAME;
         m_PROC_COST_CLS_NAME = i_PROC_COST_CLS_NAME;
         m_PROC_COST_01_NAME = i_PROC_COST_01_NAME;
         m_PROC_COST_02_NAME = i_PROC_COST_02_NAME;
         m_PROC_COST_03_NAME = i_PROC_COST_03_NAME;
         m_PROC_COST_04_NAME = i_PROC_COST_04_NAME;
         m_PROC_COST_05_NAME = i_PROC_COST_05_NAME;
         m_PROC_COST_06_NAME = i_PROC_COST_06_NAME;
         m_PROC_COST_07_NAME = i_PROC_COST_07_NAME;
         m_PROC_COST_08_NAME = i_PROC_COST_08_NAME;
         m_PROC_COST_09_NAME = i_PROC_COST_09_NAME;
         m_PROC_COST_10_NAME = i_PROC_COST_10_NAME;
         m_PROC_COST_11_NAME = i_PROC_COST_11_NAME;
         m_PROC_COST_12_NAME = i_PROC_COST_12_NAME;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_h_YEAR = i_h_YEAR;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_h_HALF_TERM_TYP = i_h_HALF_TERM_TYP;
         m_COST_TYP_name = i_COST_TYP_name;
         m_COST_TYP_val = i_COST_TYP_val;
         m_h_COST_TYP = i_h_COST_TYP;
         m_h_CS_PROC_CD = i_h_CS_PROC_CD;
         m_h_PROC_COST_CLS_CD = i_h_PROC_COST_CLS_CD;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
