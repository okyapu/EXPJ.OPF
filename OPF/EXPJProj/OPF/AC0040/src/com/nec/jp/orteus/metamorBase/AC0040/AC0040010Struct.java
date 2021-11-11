/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0040/src/com/nec/jp/orteus/metamorBase/AC0040/AC0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0040;

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

public class AC0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_SUBMIT_BUTTON_TYPE */
	public String m_SUBMIT_BUTTON_TYPE = null;
	/** 第 3 変数： m_PRINTER_TYPE */
	public String m_PRINTER_TYPE = null;
	/** 第 4 変数： m_SELECTED_PRINTER */
	public String m_SELECTED_PRINTER = null;
	/** 第 5 変数： m_r_ODR_START_DATE */
	public String m_r_ODR_START_DATE = null;
	/** 第 6 変数： m_INPUT_DATE */
	public String m_INPUT_DATE = null;
	/** 第 7 変数： m_r_PRD_START_DATE */
	public String m_r_PRD_START_DATE = null;
	/** 第 8 変数： m_r_PRD_DUE_DATE */
	public String m_r_PRD_DUE_DATE = null;
	/** 第 9 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 10 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 11 変数： m_c_CHECK3 */
	public String m_c_CHECK3 = null;
	/** 第 12 変数： m_IN_c_CHECK3 */
	public String m_IN_c_CHECK3 = null;
	/** 第 13 変数： m_IN_RadioButton */
	public String m_IN_RadioButton = null;
	/** 第 14 変数： m_ODR_STS_TYP_DEN */
	public String m_ODR_STS_TYP_DEN = null;
	/** 第 15 変数： m_OD_TYP_DEN */
	public String m_OD_TYP_DEN = null;
	/** 第 16 変数： m_OUTSIDE_TYP_DEN */
	public String m_OUTSIDE_TYP_DEN = null;
	/** 第 17 変数： m_ROUND_TYP_DEN */
	public String m_ROUND_TYP_DEN = null;
	/** 第 18 変数： m_UNIT_COST_TYP_DEN */
	public String m_UNIT_COST_TYP_DEN = null;
	/** 第 19 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 20 変数： m_user_PLANT_CD */
	public String m_user_PLANT_CD = null;
	/** 第 21 変数： m_s_OD_NO */
	public String m_s_OD_NO = null;
	/** 第 22 変数： m_s_PLANT_CD */
	public String m_s_PLANT_CD = null;
	/** 第 23 変数： m_s_JOB_ODR_CD */
	public String m_s_JOB_ODR_CD = null;
	/** 第 24 変数： m_s_JOB_ODR_DETAIL_NO */
	public String m_s_JOB_ODR_DETAIL_NO = null;
	/** 第 25 変数： m_s_ITEM_CD */
	public String m_s_ITEM_CD = null;
	/** 第 26 変数： m_s_ITEM_NAME */
	public String m_s_ITEM_NAME = null;
	/** 第 27 変数： m_s_COMPANY_CD */
	public String m_s_COMPANY_CD = null;
	/** 第 28 変数： m_s_VEND_CD */
	public String m_s_VEND_CD = null;
	/** 第 29 変数： m_s_VEND_NAME */
	public String m_s_VEND_NAME = null;
	/** 第 30 変数： m_s_ODR_STS_TYP */
	public String m_s_ODR_STS_TYP = null;
	/** 第 31 変数： m_s_ODR_START_DATE */
	public String m_s_ODR_START_DATE = null;
	/** 第 32 変数： m_s_PRD_DUE_DATE */
	public String m_s_PRD_DUE_DATE = null;
	/** 第 33 変数： m_s_PRD_START_DATE */
	public String m_s_PRD_START_DATE = null;
	/** 第 34 変数： m_s_OD_TYP */
	public String m_s_OD_TYP = null;
	/** 第 35 変数： m_s_ODR_QTY */
	public String m_s_ODR_QTY = null;
	/** 第 36 変数： m_s_OUTSIDE_TYP */
	public String m_s_OUTSIDE_TYP = null;
	/** 第 37 変数： m_s_TOTAL_RCV_QTY */
	public String m_s_TOTAL_RCV_QTY = null;
	/** 第 38 変数： m_s_PUCH_ODR_QTY */
	public String m_s_PUCH_ODR_QTY = null;
	/** 第 39 変数： m_s_UNIT_COST */
	public String m_s_UNIT_COST = null;
	/** 第 40 変数： m_s_UNIT_COST_TYP */
	public String m_s_UNIT_COST_TYP = null;
	/** 第 41 変数： m_s_ROUND_TYP */
	public String m_s_ROUND_TYP = null;
	/** 第 42 変数： m_s_PUCH_ODR_AMOUNT */
	public String m_s_PUCH_ODR_AMOUNT = null;
	/** 第 43 変数： m_k_VEND_CD */
	public String m_k_VEND_CD = null;
	/** 第 44 変数： m_k_JOB_ODR_CD */
	public String m_k_JOB_ODR_CD = null;
	/** 第 45 変数： m_k_ODR_STS_TYP */
	public String m_k_ODR_STS_TYP = null;
	/** 第 46 変数： m_k_PLANT_CD */
	public String m_k_PLANT_CD = null;
	/** 第 47 変数： m_k_ODR_START_DATE */
	public String m_k_ODR_START_DATE = null;
	/** 第 48 変数： m_k_PRD_DUE_DATE */
	public String m_k_PRD_DUE_DATE = null;
	/** 第 49 変数： m_k_PRD_START_DATE */
	public String m_k_PRD_START_DATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_SUBMIT_BUTTON_TYPE */
	public List l_SUBMIT_BUTTON_TYPE = null;

	/** 第 3 List変数： l_PRINTER_TYPE */
	public List l_PRINTER_TYPE = null;

	/** 第 4 List変数： l_SELECTED_PRINTER */
	public List l_SELECTED_PRINTER = null;

	/** 第 5 List変数： l_r_ODR_START_DATE */
	public List l_r_ODR_START_DATE = null;

	/** 第 6 List変数： l_INPUT_DATE */
	public List l_INPUT_DATE = null;

	/** 第 7 List変数： l_r_PRD_START_DATE */
	public List l_r_PRD_START_DATE = null;

	/** 第 8 List変数： l_r_PRD_DUE_DATE */
	public List l_r_PRD_DUE_DATE = null;

	/** 第 9 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 10 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 11 List変数： l_c_CHECK3 */
	public List l_c_CHECK3 = null;

	/** 第 12 List変数： l_IN_c_CHECK3 */
	public List l_IN_c_CHECK3 = null;

	/** 第 13 List変数： l_IN_RadioButton */
	public List l_IN_RadioButton = null;

	/** 第 14 List変数： l_ODR_STS_TYP_DEN */
	public List l_ODR_STS_TYP_DEN = null;

	/** 第 15 List変数： l_OD_TYP_DEN */
	public List l_OD_TYP_DEN = null;

	/** 第 16 List変数： l_OUTSIDE_TYP_DEN */
	public List l_OUTSIDE_TYP_DEN = null;

	/** 第 17 List変数： l_ROUND_TYP_DEN */
	public List l_ROUND_TYP_DEN = null;

	/** 第 18 List変数： l_UNIT_COST_TYP_DEN */
	public List l_UNIT_COST_TYP_DEN = null;

	/** 第 19 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 20 List変数： l_user_PLANT_CD */
	public List l_user_PLANT_CD = null;

	/** 第 21 List変数： l_s_OD_NO */
	public List l_s_OD_NO = null;

	/** 第 22 List変数： l_s_PLANT_CD */
	public List l_s_PLANT_CD = null;

	/** 第 23 List変数： l_s_JOB_ODR_CD */
	public List l_s_JOB_ODR_CD = null;

	/** 第 24 List変数： l_s_JOB_ODR_DETAIL_NO */
	public List l_s_JOB_ODR_DETAIL_NO = null;

	/** 第 25 List変数： l_s_ITEM_CD */
	public List l_s_ITEM_CD = null;

	/** 第 26 List変数： l_s_ITEM_NAME */
	public List l_s_ITEM_NAME = null;

	/** 第 27 List変数： l_s_COMPANY_CD */
	public List l_s_COMPANY_CD = null;

	/** 第 28 List変数： l_s_VEND_CD */
	public List l_s_VEND_CD = null;

	/** 第 29 List変数： l_s_VEND_NAME */
	public List l_s_VEND_NAME = null;

	/** 第 30 List変数： l_s_ODR_STS_TYP */
	public List l_s_ODR_STS_TYP = null;

	/** 第 31 List変数： l_s_ODR_START_DATE */
	public List l_s_ODR_START_DATE = null;

	/** 第 32 List変数： l_s_PRD_DUE_DATE */
	public List l_s_PRD_DUE_DATE = null;

	/** 第 33 List変数： l_s_PRD_START_DATE */
	public List l_s_PRD_START_DATE = null;

	/** 第 34 List変数： l_s_OD_TYP */
	public List l_s_OD_TYP = null;

	/** 第 35 List変数： l_s_ODR_QTY */
	public List l_s_ODR_QTY = null;

	/** 第 36 List変数： l_s_OUTSIDE_TYP */
	public List l_s_OUTSIDE_TYP = null;

	/** 第 37 List変数： l_s_TOTAL_RCV_QTY */
	public List l_s_TOTAL_RCV_QTY = null;

	/** 第 38 List変数： l_s_PUCH_ODR_QTY */
	public List l_s_PUCH_ODR_QTY = null;

	/** 第 39 List変数： l_s_UNIT_COST */
	public List l_s_UNIT_COST = null;

	/** 第 40 List変数： l_s_UNIT_COST_TYP */
	public List l_s_UNIT_COST_TYP = null;

	/** 第 41 List変数： l_s_ROUND_TYP */
	public List l_s_ROUND_TYP = null;

	/** 第 42 List変数： l_s_PUCH_ODR_AMOUNT */
	public List l_s_PUCH_ODR_AMOUNT = null;

	/** 第 43 List変数： l_k_VEND_CD */
	public List l_k_VEND_CD = null;

	/** 第 44 List変数： l_k_JOB_ODR_CD */
	public List l_k_JOB_ODR_CD = null;

	/** 第 45 List変数： l_k_ODR_STS_TYP */
	public List l_k_ODR_STS_TYP = null;

	/** 第 46 List変数： l_k_PLANT_CD */
	public List l_k_PLANT_CD = null;

	/** 第 47 List変数： l_k_ODR_START_DATE */
	public List l_k_ODR_START_DATE = null;

	/** 第 48 List変数： l_k_PRD_DUE_DATE */
	public List l_k_PRD_DUE_DATE = null;

	/** 第 49 List変数： l_k_PRD_START_DATE */
	public List l_k_PRD_START_DATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getSUBMIT_BUTTON_TYPE() { return m_SUBMIT_BUTTON_TYPE; }
	public String getPRINTER_TYPE() { return m_PRINTER_TYPE; }
	public String getSELECTED_PRINTER() { return m_SELECTED_PRINTER; }
	public String getr_ODR_START_DATE() { return m_r_ODR_START_DATE; }
	public String getINPUT_DATE() { return m_INPUT_DATE; }
	public String getr_PRD_START_DATE() { return m_r_PRD_START_DATE; }
	public String getr_PRD_DUE_DATE() { return m_r_PRD_DUE_DATE; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getc_CHECK3() { return m_c_CHECK3; }
	public String getIN_c_CHECK3() { return m_IN_c_CHECK3; }
	public String getIN_RadioButton() { return m_IN_RadioButton; }
	public String getODR_STS_TYP_DEN() { return m_ODR_STS_TYP_DEN; }
	public String getOD_TYP_DEN() { return m_OD_TYP_DEN; }
	public String getOUTSIDE_TYP_DEN() { return m_OUTSIDE_TYP_DEN; }
	public String getROUND_TYP_DEN() { return m_ROUND_TYP_DEN; }
	public String getUNIT_COST_TYP_DEN() { return m_UNIT_COST_TYP_DEN; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getuser_PLANT_CD() { return m_user_PLANT_CD; }
	public String gets_OD_NO() { return m_s_OD_NO; }
	public String gets_PLANT_CD() { return m_s_PLANT_CD; }
	public String gets_JOB_ODR_CD() { return m_s_JOB_ODR_CD; }
	public String gets_JOB_ODR_DETAIL_NO() { return m_s_JOB_ODR_DETAIL_NO; }
	public String gets_ITEM_CD() { return m_s_ITEM_CD; }
	public String gets_ITEM_NAME() { return m_s_ITEM_NAME; }
	public String gets_COMPANY_CD() { return m_s_COMPANY_CD; }
	public String gets_VEND_CD() { return m_s_VEND_CD; }
	public String gets_VEND_NAME() { return m_s_VEND_NAME; }
	public String gets_ODR_STS_TYP() { return m_s_ODR_STS_TYP; }
	public String gets_ODR_START_DATE() { return m_s_ODR_START_DATE; }
	public String gets_PRD_DUE_DATE() { return m_s_PRD_DUE_DATE; }
	public String gets_PRD_START_DATE() { return m_s_PRD_START_DATE; }
	public String gets_OD_TYP() { return m_s_OD_TYP; }
	public String gets_ODR_QTY() { return m_s_ODR_QTY; }
	public String gets_OUTSIDE_TYP() { return m_s_OUTSIDE_TYP; }
	public String gets_TOTAL_RCV_QTY() { return m_s_TOTAL_RCV_QTY; }
	public String gets_PUCH_ODR_QTY() { return m_s_PUCH_ODR_QTY; }
	public String gets_UNIT_COST() { return m_s_UNIT_COST; }
	public String gets_UNIT_COST_TYP() { return m_s_UNIT_COST_TYP; }
	public String gets_ROUND_TYP() { return m_s_ROUND_TYP; }
	public String gets_PUCH_ODR_AMOUNT() { return m_s_PUCH_ODR_AMOUNT; }
	public String getk_VEND_CD() { return m_k_VEND_CD; }
	public String getk_JOB_ODR_CD() { return m_k_JOB_ODR_CD; }
	public String getk_ODR_STS_TYP() { return m_k_ODR_STS_TYP; }
	public String getk_PLANT_CD() { return m_k_PLANT_CD; }
	public String getk_ODR_START_DATE() { return m_k_ODR_START_DATE; }
	public String getk_PRD_DUE_DATE() { return m_k_PRD_DUE_DATE; }
	public String getk_PRD_START_DATE() { return m_k_PRD_START_DATE; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_SUBMIT_BUTTON_TYPE() { return l_SUBMIT_BUTTON_TYPE; }
	public List getList_PRINTER_TYPE() { return l_PRINTER_TYPE; }
	public List getList_SELECTED_PRINTER() { return l_SELECTED_PRINTER; }
	public List getList_r_ODR_START_DATE() { return l_r_ODR_START_DATE; }
	public List getList_INPUT_DATE() { return l_INPUT_DATE; }
	public List getList_r_PRD_START_DATE() { return l_r_PRD_START_DATE; }
	public List getList_r_PRD_DUE_DATE() { return l_r_PRD_DUE_DATE; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_c_CHECK3() { return l_c_CHECK3; }
	public List getList_IN_c_CHECK3() { return l_IN_c_CHECK3; }
	public List getList_IN_RadioButton() { return l_IN_RadioButton; }
	public List getList_ODR_STS_TYP_DEN() { return l_ODR_STS_TYP_DEN; }
	public List getList_OD_TYP_DEN() { return l_OD_TYP_DEN; }
	public List getList_OUTSIDE_TYP_DEN() { return l_OUTSIDE_TYP_DEN; }
	public List getList_ROUND_TYP_DEN() { return l_ROUND_TYP_DEN; }
	public List getList_UNIT_COST_TYP_DEN() { return l_UNIT_COST_TYP_DEN; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_user_PLANT_CD() { return l_user_PLANT_CD; }
	public List getList_s_OD_NO() { return l_s_OD_NO; }
	public List getList_s_PLANT_CD() { return l_s_PLANT_CD; }
	public List getList_s_JOB_ODR_CD() { return l_s_JOB_ODR_CD; }
	public List getList_s_JOB_ODR_DETAIL_NO() { return l_s_JOB_ODR_DETAIL_NO; }
	public List getList_s_ITEM_CD() { return l_s_ITEM_CD; }
	public List getList_s_ITEM_NAME() { return l_s_ITEM_NAME; }
	public List getList_s_COMPANY_CD() { return l_s_COMPANY_CD; }
	public List getList_s_VEND_CD() { return l_s_VEND_CD; }
	public List getList_s_VEND_NAME() { return l_s_VEND_NAME; }
	public List getList_s_ODR_STS_TYP() { return l_s_ODR_STS_TYP; }
	public List getList_s_ODR_START_DATE() { return l_s_ODR_START_DATE; }
	public List getList_s_PRD_DUE_DATE() { return l_s_PRD_DUE_DATE; }
	public List getList_s_PRD_START_DATE() { return l_s_PRD_START_DATE; }
	public List getList_s_OD_TYP() { return l_s_OD_TYP; }
	public List getList_s_ODR_QTY() { return l_s_ODR_QTY; }
	public List getList_s_OUTSIDE_TYP() { return l_s_OUTSIDE_TYP; }
	public List getList_s_TOTAL_RCV_QTY() { return l_s_TOTAL_RCV_QTY; }
	public List getList_s_PUCH_ODR_QTY() { return l_s_PUCH_ODR_QTY; }
	public List getList_s_UNIT_COST() { return l_s_UNIT_COST; }
	public List getList_s_UNIT_COST_TYP() { return l_s_UNIT_COST_TYP; }
	public List getList_s_ROUND_TYP() { return l_s_ROUND_TYP; }
	public List getList_s_PUCH_ODR_AMOUNT() { return l_s_PUCH_ODR_AMOUNT; }
	public List getList_k_VEND_CD() { return l_k_VEND_CD; }
	public List getList_k_JOB_ODR_CD() { return l_k_JOB_ODR_CD; }
	public List getList_k_ODR_STS_TYP() { return l_k_ODR_STS_TYP; }
	public List getList_k_PLANT_CD() { return l_k_PLANT_CD; }
	public List getList_k_ODR_START_DATE() { return l_k_ODR_START_DATE; }
	public List getList_k_PRD_DUE_DATE() { return l_k_PRD_DUE_DATE; }
	public List getList_k_PRD_START_DATE() { return l_k_PRD_START_DATE; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setSUBMIT_BUTTON_TYPE(String val) { m_SUBMIT_BUTTON_TYPE = val; }
	public void setPRINTER_TYPE(String val) { m_PRINTER_TYPE = val; }
	public void setSELECTED_PRINTER(String val) { m_SELECTED_PRINTER = val; }
	public void setr_ODR_START_DATE(String val) { m_r_ODR_START_DATE = val; }
	public void setINPUT_DATE(String val) { m_INPUT_DATE = val; }
	public void setr_PRD_START_DATE(String val) { m_r_PRD_START_DATE = val; }
	public void setr_PRD_DUE_DATE(String val) { m_r_PRD_DUE_DATE = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setc_CHECK3(String val) { m_c_CHECK3 = val; }
	public void setIN_c_CHECK3(String val) { m_IN_c_CHECK3 = val; }
	public void setIN_RadioButton(String val) { m_IN_RadioButton = val; }
	public void setODR_STS_TYP_DEN(String val) { m_ODR_STS_TYP_DEN = val; }
	public void setOD_TYP_DEN(String val) { m_OD_TYP_DEN = val; }
	public void setOUTSIDE_TYP_DEN(String val) { m_OUTSIDE_TYP_DEN = val; }
	public void setROUND_TYP_DEN(String val) { m_ROUND_TYP_DEN = val; }
	public void setUNIT_COST_TYP_DEN(String val) { m_UNIT_COST_TYP_DEN = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setuser_PLANT_CD(String val) { m_user_PLANT_CD = val; }
	public void sets_OD_NO(String val) { m_s_OD_NO = val; }
	public void sets_PLANT_CD(String val) { m_s_PLANT_CD = val; }
	public void sets_JOB_ODR_CD(String val) { m_s_JOB_ODR_CD = val; }
	public void sets_JOB_ODR_DETAIL_NO(String val) { m_s_JOB_ODR_DETAIL_NO = val; }
	public void sets_ITEM_CD(String val) { m_s_ITEM_CD = val; }
	public void sets_ITEM_NAME(String val) { m_s_ITEM_NAME = val; }
	public void sets_COMPANY_CD(String val) { m_s_COMPANY_CD = val; }
	public void sets_VEND_CD(String val) { m_s_VEND_CD = val; }
	public void sets_VEND_NAME(String val) { m_s_VEND_NAME = val; }
	public void sets_ODR_STS_TYP(String val) { m_s_ODR_STS_TYP = val; }
	public void sets_ODR_START_DATE(String val) { m_s_ODR_START_DATE = val; }
	public void sets_PRD_DUE_DATE(String val) { m_s_PRD_DUE_DATE = val; }
	public void sets_PRD_START_DATE(String val) { m_s_PRD_START_DATE = val; }
	public void sets_OD_TYP(String val) { m_s_OD_TYP = val; }
	public void sets_ODR_QTY(String val) { m_s_ODR_QTY = val; }
	public void sets_OUTSIDE_TYP(String val) { m_s_OUTSIDE_TYP = val; }
	public void sets_TOTAL_RCV_QTY(String val) { m_s_TOTAL_RCV_QTY = val; }
	public void sets_PUCH_ODR_QTY(String val) { m_s_PUCH_ODR_QTY = val; }
	public void sets_UNIT_COST(String val) { m_s_UNIT_COST = val; }
	public void sets_UNIT_COST_TYP(String val) { m_s_UNIT_COST_TYP = val; }
	public void sets_ROUND_TYP(String val) { m_s_ROUND_TYP = val; }
	public void sets_PUCH_ODR_AMOUNT(String val) { m_s_PUCH_ODR_AMOUNT = val; }
	public void setk_VEND_CD(String val) { m_k_VEND_CD = val; }
	public void setk_JOB_ODR_CD(String val) { m_k_JOB_ODR_CD = val; }
	public void setk_ODR_STS_TYP(String val) { m_k_ODR_STS_TYP = val; }
	public void setk_PLANT_CD(String val) { m_k_PLANT_CD = val; }
	public void setk_ODR_START_DATE(String val) { m_k_ODR_START_DATE = val; }
	public void setk_PRD_DUE_DATE(String val) { m_k_PRD_DUE_DATE = val; }
	public void setk_PRD_START_DATE(String val) { m_k_PRD_START_DATE = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_SUBMIT_BUTTON_TYPE(List list) { l_SUBMIT_BUTTON_TYPE = list; }
	public void setList_PRINTER_TYPE(List list) { l_PRINTER_TYPE = list; }
	public void setList_SELECTED_PRINTER(List list) { l_SELECTED_PRINTER = list; }
	public void setList_r_ODR_START_DATE(List list) { l_r_ODR_START_DATE = list; }
	public void setList_INPUT_DATE(List list) { l_INPUT_DATE = list; }
	public void setList_r_PRD_START_DATE(List list) { l_r_PRD_START_DATE = list; }
	public void setList_r_PRD_DUE_DATE(List list) { l_r_PRD_DUE_DATE = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_c_CHECK3(List list) { l_c_CHECK3 = list; }
	public void setList_IN_c_CHECK3(List list) { l_IN_c_CHECK3 = list; }
	public void setList_IN_RadioButton(List list) { l_IN_RadioButton = list; }
	public void setList_ODR_STS_TYP_DEN(List list) { l_ODR_STS_TYP_DEN = list; }
	public void setList_OD_TYP_DEN(List list) { l_OD_TYP_DEN = list; }
	public void setList_OUTSIDE_TYP_DEN(List list) { l_OUTSIDE_TYP_DEN = list; }
	public void setList_ROUND_TYP_DEN(List list) { l_ROUND_TYP_DEN = list; }
	public void setList_UNIT_COST_TYP_DEN(List list) { l_UNIT_COST_TYP_DEN = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_user_PLANT_CD(List list) { l_user_PLANT_CD = list; }
	public void setList_s_OD_NO(List list) { l_s_OD_NO = list; }
	public void setList_s_PLANT_CD(List list) { l_s_PLANT_CD = list; }
	public void setList_s_JOB_ODR_CD(List list) { l_s_JOB_ODR_CD = list; }
	public void setList_s_JOB_ODR_DETAIL_NO(List list) { l_s_JOB_ODR_DETAIL_NO = list; }
	public void setList_s_ITEM_CD(List list) { l_s_ITEM_CD = list; }
	public void setList_s_ITEM_NAME(List list) { l_s_ITEM_NAME = list; }
	public void setList_s_COMPANY_CD(List list) { l_s_COMPANY_CD = list; }
	public void setList_s_VEND_CD(List list) { l_s_VEND_CD = list; }
	public void setList_s_VEND_NAME(List list) { l_s_VEND_NAME = list; }
	public void setList_s_ODR_STS_TYP(List list) { l_s_ODR_STS_TYP = list; }
	public void setList_s_ODR_START_DATE(List list) { l_s_ODR_START_DATE = list; }
	public void setList_s_PRD_DUE_DATE(List list) { l_s_PRD_DUE_DATE = list; }
	public void setList_s_PRD_START_DATE(List list) { l_s_PRD_START_DATE = list; }
	public void setList_s_OD_TYP(List list) { l_s_OD_TYP = list; }
	public void setList_s_ODR_QTY(List list) { l_s_ODR_QTY = list; }
	public void setList_s_OUTSIDE_TYP(List list) { l_s_OUTSIDE_TYP = list; }
	public void setList_s_TOTAL_RCV_QTY(List list) { l_s_TOTAL_RCV_QTY = list; }
	public void setList_s_PUCH_ODR_QTY(List list) { l_s_PUCH_ODR_QTY = list; }
	public void setList_s_UNIT_COST(List list) { l_s_UNIT_COST = list; }
	public void setList_s_UNIT_COST_TYP(List list) { l_s_UNIT_COST_TYP = list; }
	public void setList_s_ROUND_TYP(List list) { l_s_ROUND_TYP = list; }
	public void setList_s_PUCH_ODR_AMOUNT(List list) { l_s_PUCH_ODR_AMOUNT = list; }
	public void setList_k_VEND_CD(List list) { l_k_VEND_CD = list; }
	public void setList_k_JOB_ODR_CD(List list) { l_k_JOB_ODR_CD = list; }
	public void setList_k_ODR_STS_TYP(List list) { l_k_ODR_STS_TYP = list; }
	public void setList_k_PLANT_CD(List list) { l_k_PLANT_CD = list; }
	public void setList_k_ODR_START_DATE(List list) { l_k_ODR_START_DATE = list; }
	public void setList_k_PRD_DUE_DATE(List list) { l_k_PRD_DUE_DATE = list; }
	public void setList_k_PRD_START_DATE(List list) { l_k_PRD_START_DATE = list; }

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
			l_DOWNLOAD_FILE.add(((AC0040010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_SUBMIT_BUTTON_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUBMIT_BUTTON_TYPE == null) {
			l_SUBMIT_BUTTON_TYPE = new ArrayList();
		} else {
			l_SUBMIT_BUTTON_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUBMIT_BUTTON_TYPE.add(((AC0040010Struct) list.get(i)).getSUBMIT_BUTTON_TYPE());
		}
		return size;
	}
	public int setL2L_PRINTER_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINTER_TYPE == null) {
			l_PRINTER_TYPE = new ArrayList();
		} else {
			l_PRINTER_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINTER_TYPE.add(((AC0040010Struct) list.get(i)).getPRINTER_TYPE());
		}
		return size;
	}
	public int setL2L_SELECTED_PRINTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SELECTED_PRINTER == null) {
			l_SELECTED_PRINTER = new ArrayList();
		} else {
			l_SELECTED_PRINTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SELECTED_PRINTER.add(((AC0040010Struct) list.get(i)).getSELECTED_PRINTER());
		}
		return size;
	}
	public int setL2L_r_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_ODR_START_DATE == null) {
			l_r_ODR_START_DATE = new ArrayList();
		} else {
			l_r_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_ODR_START_DATE.add(((AC0040010Struct) list.get(i)).getr_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_INPUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INPUT_DATE == null) {
			l_INPUT_DATE = new ArrayList();
		} else {
			l_INPUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INPUT_DATE.add(((AC0040010Struct) list.get(i)).getINPUT_DATE());
		}
		return size;
	}
	public int setL2L_r_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PRD_START_DATE == null) {
			l_r_PRD_START_DATE = new ArrayList();
		} else {
			l_r_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PRD_START_DATE.add(((AC0040010Struct) list.get(i)).getr_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_r_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PRD_DUE_DATE == null) {
			l_r_PRD_DUE_DATE = new ArrayList();
		} else {
			l_r_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PRD_DUE_DATE.add(((AC0040010Struct) list.get(i)).getr_PRD_DUE_DATE());
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
			l_VEND_CD.add(((AC0040010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
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
			l_JOB_ODR_CD.add(((AC0040010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_CHECK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CHECK3 == null) {
			l_c_CHECK3 = new ArrayList();
		} else {
			l_c_CHECK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CHECK3.add(((AC0040010Struct) list.get(i)).getc_CHECK3());
		}
		return size;
	}
	public int setL2L_IN_c_CHECK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_c_CHECK3 == null) {
			l_IN_c_CHECK3 = new ArrayList();
		} else {
			l_IN_c_CHECK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_c_CHECK3.add(((AC0040010Struct) list.get(i)).getIN_c_CHECK3());
		}
		return size;
	}
	public int setL2L_IN_RadioButton(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_RadioButton == null) {
			l_IN_RadioButton = new ArrayList();
		} else {
			l_IN_RadioButton.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_RadioButton.add(((AC0040010Struct) list.get(i)).getIN_RadioButton());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_DEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_DEN == null) {
			l_ODR_STS_TYP_DEN = new ArrayList();
		} else {
			l_ODR_STS_TYP_DEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_DEN.add(((AC0040010Struct) list.get(i)).getODR_STS_TYP_DEN());
		}
		return size;
	}
	public int setL2L_OD_TYP_DEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_DEN == null) {
			l_OD_TYP_DEN = new ArrayList();
		} else {
			l_OD_TYP_DEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_DEN.add(((AC0040010Struct) list.get(i)).getOD_TYP_DEN());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_DEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_DEN == null) {
			l_OUTSIDE_TYP_DEN = new ArrayList();
		} else {
			l_OUTSIDE_TYP_DEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_DEN.add(((AC0040010Struct) list.get(i)).getOUTSIDE_TYP_DEN());
		}
		return size;
	}
	public int setL2L_ROUND_TYP_DEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP_DEN == null) {
			l_ROUND_TYP_DEN = new ArrayList();
		} else {
			l_ROUND_TYP_DEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP_DEN.add(((AC0040010Struct) list.get(i)).getROUND_TYP_DEN());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_DEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_DEN == null) {
			l_UNIT_COST_TYP_DEN = new ArrayList();
		} else {
			l_UNIT_COST_TYP_DEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_DEN.add(((AC0040010Struct) list.get(i)).getUNIT_COST_TYP_DEN());
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
			l_BUSINESS_OPR_DATE.add(((AC0040010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_user_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_user_PLANT_CD == null) {
			l_user_PLANT_CD = new ArrayList();
		} else {
			l_user_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_user_PLANT_CD.add(((AC0040010Struct) list.get(i)).getuser_PLANT_CD());
		}
		return size;
	}
	public int setL2L_s_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OD_NO == null) {
			l_s_OD_NO = new ArrayList();
		} else {
			l_s_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OD_NO.add(((AC0040010Struct) list.get(i)).gets_OD_NO());
		}
		return size;
	}
	public int setL2L_s_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLANT_CD == null) {
			l_s_PLANT_CD = new ArrayList();
		} else {
			l_s_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLANT_CD.add(((AC0040010Struct) list.get(i)).gets_PLANT_CD());
		}
		return size;
	}
	public int setL2L_s_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_JOB_ODR_CD == null) {
			l_s_JOB_ODR_CD = new ArrayList();
		} else {
			l_s_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_JOB_ODR_CD.add(((AC0040010Struct) list.get(i)).gets_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_s_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_JOB_ODR_DETAIL_NO == null) {
			l_s_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_s_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_JOB_ODR_DETAIL_NO.add(((AC0040010Struct) list.get(i)).gets_JOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_s_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ITEM_CD == null) {
			l_s_ITEM_CD = new ArrayList();
		} else {
			l_s_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ITEM_CD.add(((AC0040010Struct) list.get(i)).gets_ITEM_CD());
		}
		return size;
	}
	public int setL2L_s_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ITEM_NAME == null) {
			l_s_ITEM_NAME = new ArrayList();
		} else {
			l_s_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ITEM_NAME.add(((AC0040010Struct) list.get(i)).gets_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_s_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_COMPANY_CD == null) {
			l_s_COMPANY_CD = new ArrayList();
		} else {
			l_s_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_COMPANY_CD.add(((AC0040010Struct) list.get(i)).gets_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_s_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_VEND_CD == null) {
			l_s_VEND_CD = new ArrayList();
		} else {
			l_s_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_VEND_CD.add(((AC0040010Struct) list.get(i)).gets_VEND_CD());
		}
		return size;
	}
	public int setL2L_s_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_VEND_NAME == null) {
			l_s_VEND_NAME = new ArrayList();
		} else {
			l_s_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_VEND_NAME.add(((AC0040010Struct) list.get(i)).gets_VEND_NAME());
		}
		return size;
	}
	public int setL2L_s_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_STS_TYP == null) {
			l_s_ODR_STS_TYP = new ArrayList();
		} else {
			l_s_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_STS_TYP.add(((AC0040010Struct) list.get(i)).gets_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_s_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_START_DATE == null) {
			l_s_ODR_START_DATE = new ArrayList();
		} else {
			l_s_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_START_DATE.add(((AC0040010Struct) list.get(i)).gets_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_s_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_DUE_DATE == null) {
			l_s_PRD_DUE_DATE = new ArrayList();
		} else {
			l_s_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_DUE_DATE.add(((AC0040010Struct) list.get(i)).gets_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_s_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_START_DATE == null) {
			l_s_PRD_START_DATE = new ArrayList();
		} else {
			l_s_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_START_DATE.add(((AC0040010Struct) list.get(i)).gets_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_s_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OD_TYP == null) {
			l_s_OD_TYP = new ArrayList();
		} else {
			l_s_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OD_TYP.add(((AC0040010Struct) list.get(i)).gets_OD_TYP());
		}
		return size;
	}
	public int setL2L_s_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_QTY == null) {
			l_s_ODR_QTY = new ArrayList();
		} else {
			l_s_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_QTY.add(((AC0040010Struct) list.get(i)).gets_ODR_QTY());
		}
		return size;
	}
	public int setL2L_s_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OUTSIDE_TYP == null) {
			l_s_OUTSIDE_TYP = new ArrayList();
		} else {
			l_s_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OUTSIDE_TYP.add(((AC0040010Struct) list.get(i)).gets_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_s_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_TOTAL_RCV_QTY == null) {
			l_s_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_s_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_TOTAL_RCV_QTY.add(((AC0040010Struct) list.get(i)).gets_TOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_s_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PUCH_ODR_QTY == null) {
			l_s_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_s_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PUCH_ODR_QTY.add(((AC0040010Struct) list.get(i)).gets_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_s_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_UNIT_COST == null) {
			l_s_UNIT_COST = new ArrayList();
		} else {
			l_s_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_UNIT_COST.add(((AC0040010Struct) list.get(i)).gets_UNIT_COST());
		}
		return size;
	}
	public int setL2L_s_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_UNIT_COST_TYP == null) {
			l_s_UNIT_COST_TYP = new ArrayList();
		} else {
			l_s_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_UNIT_COST_TYP.add(((AC0040010Struct) list.get(i)).gets_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_s_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ROUND_TYP == null) {
			l_s_ROUND_TYP = new ArrayList();
		} else {
			l_s_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ROUND_TYP.add(((AC0040010Struct) list.get(i)).gets_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_s_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PUCH_ODR_AMOUNT == null) {
			l_s_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_s_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PUCH_ODR_AMOUNT.add(((AC0040010Struct) list.get(i)).gets_PUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_k_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_VEND_CD == null) {
			l_k_VEND_CD = new ArrayList();
		} else {
			l_k_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_VEND_CD.add(((AC0040010Struct) list.get(i)).getk_VEND_CD());
		}
		return size;
	}
	public int setL2L_k_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_JOB_ODR_CD == null) {
			l_k_JOB_ODR_CD = new ArrayList();
		} else {
			l_k_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_JOB_ODR_CD.add(((AC0040010Struct) list.get(i)).getk_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_k_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_ODR_STS_TYP == null) {
			l_k_ODR_STS_TYP = new ArrayList();
		} else {
			l_k_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_ODR_STS_TYP.add(((AC0040010Struct) list.get(i)).getk_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_k_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_PLANT_CD == null) {
			l_k_PLANT_CD = new ArrayList();
		} else {
			l_k_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_PLANT_CD.add(((AC0040010Struct) list.get(i)).getk_PLANT_CD());
		}
		return size;
	}
	public int setL2L_k_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_ODR_START_DATE == null) {
			l_k_ODR_START_DATE = new ArrayList();
		} else {
			l_k_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_ODR_START_DATE.add(((AC0040010Struct) list.get(i)).getk_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_k_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_PRD_DUE_DATE == null) {
			l_k_PRD_DUE_DATE = new ArrayList();
		} else {
			l_k_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_PRD_DUE_DATE.add(((AC0040010Struct) list.get(i)).getk_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_k_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_PRD_START_DATE == null) {
			l_k_PRD_START_DATE = new ArrayList();
		} else {
			l_k_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_PRD_START_DATE.add(((AC0040010Struct) list.get(i)).getk_PRD_START_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_SUBMIT_BUTTON_TYPE = null;
		m_PRINTER_TYPE = null;
		m_SELECTED_PRINTER = null;
		m_r_ODR_START_DATE = null;
		m_INPUT_DATE = null;
		m_r_PRD_START_DATE = null;
		m_r_PRD_DUE_DATE = null;
		m_VEND_CD = null;
		m_JOB_ODR_CD = null;
		m_c_CHECK3 = null;
		m_IN_c_CHECK3 = null;
		m_IN_RadioButton = null;
		m_ODR_STS_TYP_DEN = null;
		m_OD_TYP_DEN = null;
		m_OUTSIDE_TYP_DEN = null;
		m_ROUND_TYP_DEN = null;
		m_UNIT_COST_TYP_DEN = null;
		m_BUSINESS_OPR_DATE = null;
		m_user_PLANT_CD = null;
		m_s_OD_NO = null;
		m_s_PLANT_CD = null;
		m_s_JOB_ODR_CD = null;
		m_s_JOB_ODR_DETAIL_NO = null;
		m_s_ITEM_CD = null;
		m_s_ITEM_NAME = null;
		m_s_COMPANY_CD = null;
		m_s_VEND_CD = null;
		m_s_VEND_NAME = null;
		m_s_ODR_STS_TYP = null;
		m_s_ODR_START_DATE = null;
		m_s_PRD_DUE_DATE = null;
		m_s_PRD_START_DATE = null;
		m_s_OD_TYP = null;
		m_s_ODR_QTY = null;
		m_s_OUTSIDE_TYP = null;
		m_s_TOTAL_RCV_QTY = null;
		m_s_PUCH_ODR_QTY = null;
		m_s_UNIT_COST = null;
		m_s_UNIT_COST_TYP = null;
		m_s_ROUND_TYP = null;
		m_s_PUCH_ODR_AMOUNT = null;
		m_k_VEND_CD = null;
		m_k_JOB_ODR_CD = null;
		m_k_ODR_STS_TYP = null;
		m_k_PLANT_CD = null;
		m_k_ODR_START_DATE = null;
		m_k_PRD_DUE_DATE = null;
		m_k_PRD_START_DATE = null;

		l_DOWNLOAD_FILE = null;
		l_SUBMIT_BUTTON_TYPE = null;
		l_PRINTER_TYPE = null;
		l_SELECTED_PRINTER = null;
		l_r_ODR_START_DATE = null;
		l_INPUT_DATE = null;
		l_r_PRD_START_DATE = null;
		l_r_PRD_DUE_DATE = null;
		l_VEND_CD = null;
		l_JOB_ODR_CD = null;
		l_c_CHECK3 = null;
		l_IN_c_CHECK3 = null;
		l_IN_RadioButton = null;
		l_ODR_STS_TYP_DEN = null;
		l_OD_TYP_DEN = null;
		l_OUTSIDE_TYP_DEN = null;
		l_ROUND_TYP_DEN = null;
		l_UNIT_COST_TYP_DEN = null;
		l_BUSINESS_OPR_DATE = null;
		l_user_PLANT_CD = null;
		l_s_OD_NO = null;
		l_s_PLANT_CD = null;
		l_s_JOB_ODR_CD = null;
		l_s_JOB_ODR_DETAIL_NO = null;
		l_s_ITEM_CD = null;
		l_s_ITEM_NAME = null;
		l_s_COMPANY_CD = null;
		l_s_VEND_CD = null;
		l_s_VEND_NAME = null;
		l_s_ODR_STS_TYP = null;
		l_s_ODR_START_DATE = null;
		l_s_PRD_DUE_DATE = null;
		l_s_PRD_START_DATE = null;
		l_s_OD_TYP = null;
		l_s_ODR_QTY = null;
		l_s_OUTSIDE_TYP = null;
		l_s_TOTAL_RCV_QTY = null;
		l_s_PUCH_ODR_QTY = null;
		l_s_UNIT_COST = null;
		l_s_UNIT_COST_TYP = null;
		l_s_ROUND_TYP = null;
		l_s_PUCH_ODR_AMOUNT = null;
		l_k_VEND_CD = null;
		l_k_JOB_ODR_CD = null;
		l_k_ODR_STS_TYP = null;
		l_k_PLANT_CD = null;
		l_k_ODR_START_DATE = null;
		l_k_PRD_DUE_DATE = null;
		l_k_PRD_START_DATE = null;

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
	 * medAC0040010クラスの標準コンストラクタ
	 */
	public AC0040010Struct()
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
	public void setStruct(AC0040010Struct struct)
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
	public void setStructM(AC0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setSUBMIT_BUTTON_TYPE(struct.getSUBMIT_BUTTON_TYPE());
			this.setPRINTER_TYPE(struct.getPRINTER_TYPE());
			this.setSELECTED_PRINTER(struct.getSELECTED_PRINTER());
			this.setr_ODR_START_DATE(struct.getr_ODR_START_DATE());
			this.setINPUT_DATE(struct.getINPUT_DATE());
			this.setr_PRD_START_DATE(struct.getr_PRD_START_DATE());
			this.setr_PRD_DUE_DATE(struct.getr_PRD_DUE_DATE());
			this.setVEND_CD(struct.getVEND_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setc_CHECK3(struct.getc_CHECK3());
			this.setIN_c_CHECK3(struct.getIN_c_CHECK3());
			this.setIN_RadioButton(struct.getIN_RadioButton());
			this.setODR_STS_TYP_DEN(struct.getODR_STS_TYP_DEN());
			this.setOD_TYP_DEN(struct.getOD_TYP_DEN());
			this.setOUTSIDE_TYP_DEN(struct.getOUTSIDE_TYP_DEN());
			this.setROUND_TYP_DEN(struct.getROUND_TYP_DEN());
			this.setUNIT_COST_TYP_DEN(struct.getUNIT_COST_TYP_DEN());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setuser_PLANT_CD(struct.getuser_PLANT_CD());
			this.sets_OD_NO(struct.gets_OD_NO());
			this.sets_PLANT_CD(struct.gets_PLANT_CD());
			this.sets_JOB_ODR_CD(struct.gets_JOB_ODR_CD());
			this.sets_JOB_ODR_DETAIL_NO(struct.gets_JOB_ODR_DETAIL_NO());
			this.sets_ITEM_CD(struct.gets_ITEM_CD());
			this.sets_ITEM_NAME(struct.gets_ITEM_NAME());
			this.sets_COMPANY_CD(struct.gets_COMPANY_CD());
			this.sets_VEND_CD(struct.gets_VEND_CD());
			this.sets_VEND_NAME(struct.gets_VEND_NAME());
			this.sets_ODR_STS_TYP(struct.gets_ODR_STS_TYP());
			this.sets_ODR_START_DATE(struct.gets_ODR_START_DATE());
			this.sets_PRD_DUE_DATE(struct.gets_PRD_DUE_DATE());
			this.sets_PRD_START_DATE(struct.gets_PRD_START_DATE());
			this.sets_OD_TYP(struct.gets_OD_TYP());
			this.sets_ODR_QTY(struct.gets_ODR_QTY());
			this.sets_OUTSIDE_TYP(struct.gets_OUTSIDE_TYP());
			this.sets_TOTAL_RCV_QTY(struct.gets_TOTAL_RCV_QTY());
			this.sets_PUCH_ODR_QTY(struct.gets_PUCH_ODR_QTY());
			this.sets_UNIT_COST(struct.gets_UNIT_COST());
			this.sets_UNIT_COST_TYP(struct.gets_UNIT_COST_TYP());
			this.sets_ROUND_TYP(struct.gets_ROUND_TYP());
			this.sets_PUCH_ODR_AMOUNT(struct.gets_PUCH_ODR_AMOUNT());
			this.setk_VEND_CD(struct.getk_VEND_CD());
			this.setk_JOB_ODR_CD(struct.getk_JOB_ODR_CD());
			this.setk_ODR_STS_TYP(struct.getk_ODR_STS_TYP());
			this.setk_PLANT_CD(struct.getk_PLANT_CD());
			this.setk_ODR_START_DATE(struct.getk_ODR_START_DATE());
			this.setk_PRD_DUE_DATE(struct.getk_PRD_DUE_DATE());
			this.setk_PRD_START_DATE(struct.getk_PRD_START_DATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_SUBMIT_BUTTON_TYPE(struct.getList_SUBMIT_BUTTON_TYPE());
			this.setList_PRINTER_TYPE(struct.getList_PRINTER_TYPE());
			this.setList_SELECTED_PRINTER(struct.getList_SELECTED_PRINTER());
			this.setList_r_ODR_START_DATE(struct.getList_r_ODR_START_DATE());
			this.setList_INPUT_DATE(struct.getList_INPUT_DATE());
			this.setList_r_PRD_START_DATE(struct.getList_r_PRD_START_DATE());
			this.setList_r_PRD_DUE_DATE(struct.getList_r_PRD_DUE_DATE());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_c_CHECK3(struct.getList_c_CHECK3());
			this.setList_IN_c_CHECK3(struct.getList_IN_c_CHECK3());
			this.setList_IN_RadioButton(struct.getList_IN_RadioButton());
			this.setList_ODR_STS_TYP_DEN(struct.getList_ODR_STS_TYP_DEN());
			this.setList_OD_TYP_DEN(struct.getList_OD_TYP_DEN());
			this.setList_OUTSIDE_TYP_DEN(struct.getList_OUTSIDE_TYP_DEN());
			this.setList_ROUND_TYP_DEN(struct.getList_ROUND_TYP_DEN());
			this.setList_UNIT_COST_TYP_DEN(struct.getList_UNIT_COST_TYP_DEN());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_user_PLANT_CD(struct.getList_user_PLANT_CD());
			this.setList_s_OD_NO(struct.getList_s_OD_NO());
			this.setList_s_PLANT_CD(struct.getList_s_PLANT_CD());
			this.setList_s_JOB_ODR_CD(struct.getList_s_JOB_ODR_CD());
			this.setList_s_JOB_ODR_DETAIL_NO(struct.getList_s_JOB_ODR_DETAIL_NO());
			this.setList_s_ITEM_CD(struct.getList_s_ITEM_CD());
			this.setList_s_ITEM_NAME(struct.getList_s_ITEM_NAME());
			this.setList_s_COMPANY_CD(struct.getList_s_COMPANY_CD());
			this.setList_s_VEND_CD(struct.getList_s_VEND_CD());
			this.setList_s_VEND_NAME(struct.getList_s_VEND_NAME());
			this.setList_s_ODR_STS_TYP(struct.getList_s_ODR_STS_TYP());
			this.setList_s_ODR_START_DATE(struct.getList_s_ODR_START_DATE());
			this.setList_s_PRD_DUE_DATE(struct.getList_s_PRD_DUE_DATE());
			this.setList_s_PRD_START_DATE(struct.getList_s_PRD_START_DATE());
			this.setList_s_OD_TYP(struct.getList_s_OD_TYP());
			this.setList_s_ODR_QTY(struct.getList_s_ODR_QTY());
			this.setList_s_OUTSIDE_TYP(struct.getList_s_OUTSIDE_TYP());
			this.setList_s_TOTAL_RCV_QTY(struct.getList_s_TOTAL_RCV_QTY());
			this.setList_s_PUCH_ODR_QTY(struct.getList_s_PUCH_ODR_QTY());
			this.setList_s_UNIT_COST(struct.getList_s_UNIT_COST());
			this.setList_s_UNIT_COST_TYP(struct.getList_s_UNIT_COST_TYP());
			this.setList_s_ROUND_TYP(struct.getList_s_ROUND_TYP());
			this.setList_s_PUCH_ODR_AMOUNT(struct.getList_s_PUCH_ODR_AMOUNT());
			this.setList_k_VEND_CD(struct.getList_k_VEND_CD());
			this.setList_k_JOB_ODR_CD(struct.getList_k_JOB_ODR_CD());
			this.setList_k_ODR_STS_TYP(struct.getList_k_ODR_STS_TYP());
			this.setList_k_PLANT_CD(struct.getList_k_PLANT_CD());
			this.setList_k_ODR_START_DATE(struct.getList_k_ODR_START_DATE());
			this.setList_k_PRD_DUE_DATE(struct.getList_k_PRD_DUE_DATE());
			this.setList_k_PRD_START_DATE(struct.getList_k_PRD_START_DATE());
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

	// 第 2 変数初期値： i_SUBMIT_BUTTON_TYPE


	final static String i_SUBMIT_BUTTON_TYPE = null;

	// 第 3 変数初期値： i_PRINTER_TYPE


	final static String i_PRINTER_TYPE = null;

	// 第 4 変数初期値： i_SELECTED_PRINTER


	final static String i_SELECTED_PRINTER = null;

	// 第 5 変数初期値： i_r_ODR_START_DATE


	final static String i_r_ODR_START_DATE = null;

	// 第 6 変数初期値： i_INPUT_DATE


	final static String i_INPUT_DATE = null;

	// 第 7 変数初期値： i_r_PRD_START_DATE


	final static String i_r_PRD_START_DATE = null;

	// 第 8 変数初期値： i_r_PRD_DUE_DATE


	final static String i_r_PRD_DUE_DATE = null;

	// 第 9 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 10 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 11 変数初期値： i_c_CHECK3


	final static String i_c_CHECK3 = null;

	// 第 12 変数初期値： i_IN_c_CHECK3


	final static String i_IN_c_CHECK3 = null;

	// 第 13 変数初期値： i_IN_RadioButton


	final static String i_IN_RadioButton = null;

	// 第 14 変数初期値： i_ODR_STS_TYP_DEN


	final static String i_ODR_STS_TYP_DEN = null;

	// 第 15 変数初期値： i_OD_TYP_DEN


	final static String i_OD_TYP_DEN = null;

	// 第 16 変数初期値： i_OUTSIDE_TYP_DEN


	final static String i_OUTSIDE_TYP_DEN = null;

	// 第 17 変数初期値： i_ROUND_TYP_DEN


	final static String i_ROUND_TYP_DEN = null;

	// 第 18 変数初期値： i_UNIT_COST_TYP_DEN


	final static String i_UNIT_COST_TYP_DEN = null;

	// 第 19 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 20 変数初期値： i_user_PLANT_CD


	final static String i_user_PLANT_CD = null;

	// 第 21 変数初期値： i_s_OD_NO


	final static String i_s_OD_NO = null;

	// 第 22 変数初期値： i_s_PLANT_CD


	final static String i_s_PLANT_CD = null;

	// 第 23 変数初期値： i_s_JOB_ODR_CD


	final static String i_s_JOB_ODR_CD = null;

	// 第 24 変数初期値： i_s_JOB_ODR_DETAIL_NO


	final static String i_s_JOB_ODR_DETAIL_NO = null;

	// 第 25 変数初期値： i_s_ITEM_CD


	final static String i_s_ITEM_CD = null;

	// 第 26 変数初期値： i_s_ITEM_NAME


	final static String i_s_ITEM_NAME = null;

	// 第 27 変数初期値： i_s_COMPANY_CD


	final static String i_s_COMPANY_CD = null;

	// 第 28 変数初期値： i_s_VEND_CD


	final static String i_s_VEND_CD = null;

	// 第 29 変数初期値： i_s_VEND_NAME


	final static String i_s_VEND_NAME = null;

	// 第 30 変数初期値： i_s_ODR_STS_TYP


	final static String i_s_ODR_STS_TYP = null;

	// 第 31 変数初期値： i_s_ODR_START_DATE


	final static String i_s_ODR_START_DATE = null;

	// 第 32 変数初期値： i_s_PRD_DUE_DATE


	final static String i_s_PRD_DUE_DATE = null;

	// 第 33 変数初期値： i_s_PRD_START_DATE


	final static String i_s_PRD_START_DATE = null;

	// 第 34 変数初期値： i_s_OD_TYP


	final static String i_s_OD_TYP = null;

	// 第 35 変数初期値： i_s_ODR_QTY


	final static String i_s_ODR_QTY = null;

	// 第 36 変数初期値： i_s_OUTSIDE_TYP


	final static String i_s_OUTSIDE_TYP = null;

	// 第 37 変数初期値： i_s_TOTAL_RCV_QTY


	final static String i_s_TOTAL_RCV_QTY = null;

	// 第 38 変数初期値： i_s_PUCH_ODR_QTY


	final static String i_s_PUCH_ODR_QTY = null;

	// 第 39 変数初期値： i_s_UNIT_COST


	final static String i_s_UNIT_COST = null;

	// 第 40 変数初期値： i_s_UNIT_COST_TYP


	final static String i_s_UNIT_COST_TYP = null;

	// 第 41 変数初期値： i_s_ROUND_TYP


	final static String i_s_ROUND_TYP = null;

	// 第 42 変数初期値： i_s_PUCH_ODR_AMOUNT


	final static String i_s_PUCH_ODR_AMOUNT = null;

	// 第 43 変数初期値： i_k_VEND_CD


	final static String i_k_VEND_CD = null;

	// 第 44 変数初期値： i_k_JOB_ODR_CD


	final static String i_k_JOB_ODR_CD = null;

	// 第 45 変数初期値： i_k_ODR_STS_TYP


	final static String i_k_ODR_STS_TYP = null;

	// 第 46 変数初期値： i_k_PLANT_CD


	final static String i_k_PLANT_CD = null;

	// 第 47 変数初期値： i_k_ODR_START_DATE


	final static String i_k_ODR_START_DATE = null;

	// 第 48 変数初期値： i_k_PRD_DUE_DATE


	final static String i_k_PRD_DUE_DATE = null;

	// 第 49 変数初期値： i_k_PRD_START_DATE


	final static String i_k_PRD_START_DATE = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_BUSINESS_OPR_DATE
        final static String i_BUSINESS_OPR_DATE = null;
        // 第 2 変数初期値： i_user_PLANT_CD
        final static String i_user_PLANT_CD = null;
        // 第 3 変数初期値： i_s_OD_NO
        final static String i_s_OD_NO = null;
        // 第 4 変数初期値： i_s_PLANT_CD
        final static String i_s_PLANT_CD = null;
        // 第 5 変数初期値： i_s_JOB_ODR_CD
        final static String i_s_JOB_ODR_CD = null;
        // 第 6 変数初期値： i_s_JOB_ODR_DETAIL_NO
        final static String i_s_JOB_ODR_DETAIL_NO = null;
        // 第 7 変数初期値： i_s_ITEM_CD
        final static String i_s_ITEM_CD = null;
        // 第 8 変数初期値： i_s_ITEM_NAME
        final static String i_s_ITEM_NAME = null;
        // 第 9 変数初期値： i_s_COMPANY_CD
        final static String i_s_COMPANY_CD = null;
        // 第 10 変数初期値： i_s_VEND_CD
        final static String i_s_VEND_CD = null;
        // 第 11 変数初期値： i_s_VEND_NAME
        final static String i_s_VEND_NAME = null;
        // 第 12 変数初期値： i_s_ODR_STS_TYP
        final static String i_s_ODR_STS_TYP = null;
        // 第 13 変数初期値： i_s_ODR_START_DATE
        final static String i_s_ODR_START_DATE = null;
        // 第 14 変数初期値： i_s_PRD_DUE_DATE
        final static String i_s_PRD_DUE_DATE = null;
        // 第 15 変数初期値： i_s_PRD_START_DATE
        final static String i_s_PRD_START_DATE = null;
        // 第 16 変数初期値： i_s_OD_TYP
        final static String i_s_OD_TYP = null;
        // 第 17 変数初期値： i_s_ODR_QTY
        final static String i_s_ODR_QTY = null;
        // 第 18 変数初期値： i_s_OUTSIDE_TYP
        final static String i_s_OUTSIDE_TYP = null;
        // 第 19 変数初期値： i_s_TOTAL_RCV_QTY
        final static String i_s_TOTAL_RCV_QTY = null;
        // 第 20 変数初期値： i_s_PUCH_ODR_QTY
        final static String i_s_PUCH_ODR_QTY = null;
        // 第 21 変数初期値： i_s_UNIT_COST
        final static String i_s_UNIT_COST = null;
        // 第 22 変数初期値： i_s_UNIT_COST_TYP
        final static String i_s_UNIT_COST_TYP = null;
        // 第 23 変数初期値： i_s_ROUND_TYP
        final static String i_s_ROUND_TYP = null;
        // 第 24 変数初期値： i_s_PUCH_ODR_AMOUNT
        final static String i_s_PUCH_ODR_AMOUNT = null;
        // 第 25 変数初期値： i_VEND_CD
        final static String i_VEND_CD = null;
        // 第 26 変数初期値： i_JOB_ODR_CD
        final static String i_JOB_ODR_CD = null;
        // 第 27 変数初期値： i_k_ODR_STS_TYP
        final static String i_k_ODR_STS_TYP = null;
        // 第 28 変数初期値： i_k_PLANT_CD
        final static String i_k_PLANT_CD = null;
        // 第 29 変数初期値： i_k_ODR_START_DATE
        final static String i_k_ODR_START_DATE = null;
        // 第 30 変数初期値： i_k_PRD_DUE_DATE
        final static String i_k_PRD_DUE_DATE = null;
        // 第 31 変数初期値： i_k_PRD_START_DATE
        final static String i_k_PRD_START_DATE = null;
        // 第 32 変数初期値： i_DOWNLOAD_FILE
        final static String i_DOWNLOAD_FILE = null;
        // 第 33 変数初期値： i_SUBMIT_BUTTON_TYPE
        final static String i_SUBMIT_BUTTON_TYPE = null;
        // 第 34 変数初期値： i_PRINTER_TYPE
        final static String i_PRINTER_TYPE = null;
        // 第 35 変数初期値： i_SELECTED_PRINTER
        final static String i_SELECTED_PRINTER = null;
        // 第 36 変数初期値： i_r_ODR_START_DATE
        final static String i_r_ODR_START_DATE = null;
        // 第 37 変数初期値： i_INPUT_DATE
        final static String i_INPUT_DATE = null;
        // 第 38 変数初期値： i_r_PRD_START_DATE
        final static String i_r_PRD_START_DATE = null;
        // 第 39 変数初期値： i_r_PRD_DUE_DATE
        final static String i_r_PRD_DUE_DATE = null;
        // 第 40 変数初期値： i_c_CHECK1
        final static String i_c_CHECK1 = null;
        // 第 41 変数初期値： i_c_CHECK2
        final static String i_c_CHECK2 = null;
        // 第 42 変数初期値： i_c_CHECK3
        final static String i_c_CHECK3 = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_user_PLANT_CD = i_user_PLANT_CD;
         m_s_OD_NO = i_s_OD_NO;
         m_s_PLANT_CD = i_s_PLANT_CD;
         m_s_JOB_ODR_CD = i_s_JOB_ODR_CD;
         m_s_JOB_ODR_DETAIL_NO = i_s_JOB_ODR_DETAIL_NO;
         m_s_ITEM_CD = i_s_ITEM_CD;
         m_s_ITEM_NAME = i_s_ITEM_NAME;
         m_s_COMPANY_CD = i_s_COMPANY_CD;
         m_s_VEND_CD = i_s_VEND_CD;
         m_s_VEND_NAME = i_s_VEND_NAME;
         m_s_ODR_STS_TYP = i_s_ODR_STS_TYP;
         m_s_ODR_START_DATE = i_s_ODR_START_DATE;
         m_s_PRD_DUE_DATE = i_s_PRD_DUE_DATE;
         m_s_PRD_START_DATE = i_s_PRD_START_DATE;
         m_s_OD_TYP = i_s_OD_TYP;
         m_s_ODR_QTY = i_s_ODR_QTY;
         m_s_OUTSIDE_TYP = i_s_OUTSIDE_TYP;
         m_s_TOTAL_RCV_QTY = i_s_TOTAL_RCV_QTY;
         m_s_PUCH_ODR_QTY = i_s_PUCH_ODR_QTY;
         m_s_UNIT_COST = i_s_UNIT_COST;
         m_s_UNIT_COST_TYP = i_s_UNIT_COST_TYP;
         m_s_ROUND_TYP = i_s_ROUND_TYP;
         m_s_PUCH_ODR_AMOUNT = i_s_PUCH_ODR_AMOUNT;
         m_VEND_CD = i_VEND_CD;
         m_JOB_ODR_CD = i_JOB_ODR_CD;
         m_k_ODR_STS_TYP = i_k_ODR_STS_TYP;
         m_k_PLANT_CD = i_k_PLANT_CD;
         m_k_ODR_START_DATE = i_k_ODR_START_DATE;
         m_k_PRD_DUE_DATE = i_k_PRD_DUE_DATE;
         m_k_PRD_START_DATE = i_k_PRD_START_DATE;
         m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
         m_SUBMIT_BUTTON_TYPE = i_SUBMIT_BUTTON_TYPE;
         m_PRINTER_TYPE = i_PRINTER_TYPE;
         m_SELECTED_PRINTER = i_SELECTED_PRINTER;
         m_r_ODR_START_DATE = i_r_ODR_START_DATE;
         m_INPUT_DATE = i_INPUT_DATE;
         m_r_PRD_START_DATE = i_r_PRD_START_DATE;
         m_r_PRD_DUE_DATE = i_r_PRD_DUE_DATE;
         m_c_CHECK3 = i_c_CHECK3;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
