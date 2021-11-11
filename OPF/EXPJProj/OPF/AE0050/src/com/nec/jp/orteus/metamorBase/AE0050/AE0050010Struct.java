/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0050/src/com/nec/jp/orteus/metamorBase/AE0050/AE0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0050;

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
/**
 * CLASS     : AE0050010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.14 $ $Date: 2014/11/05 07:10:24 $
 *
 */
//}}user_implement_code_header

public class AE0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r1_CONS_TYP */
	public String m_r1_CONS_TYP = null;
	/** 第 2 変数： m_r2_CONS_TYP */
	public String m_r2_CONS_TYP = null;
	/** 第 3 変数： m_r3_CONS_TYP */
	public String m_r3_CONS_TYP = null;
	/** 第 4 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 5 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 6 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 7 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 8 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 9 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 10 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 11 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 12 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 13 変数： m_SCDL_ISSUE_DATE */
	public String m_SCDL_ISSUE_DATE = null;
	/** 第 14 変数： m_SCDL_ISSUE_TIME */
	public String m_SCDL_ISSUE_TIME = null;
	/** 第 15 変数： m_ISSUE_INST_QTY */
	public String m_ISSUE_INST_QTY = null;
	/** 第 16 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 17 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 18 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 19 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 20 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 21 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 22 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 23 変数： m_SCDL_ISSUE_DATE_ALL */
	public String m_SCDL_ISSUE_DATE_ALL = null;
	/** 第 24 変数： m_T_ISSUE_INST__PLANT_CD */
	public String m_T_ISSUE_INST__PLANT_CD = null;
	/** 第 25 変数： m_M_PLANT__PLANT_NAME */
	public String m_M_PLANT__PLANT_NAME = null;
	/** 第 26 変数： m_T_ISSUE_INST__VEND_CD */
	public String m_T_ISSUE_INST__VEND_CD = null;
	/** 第 27 変数： m_M_VEND_CTRL__VEND_NAME */
	public String m_M_VEND_CTRL__VEND_NAME = null;
	/** 第 28 変数： m_T_ISSUE_INST__ITEM_CD */
	public String m_T_ISSUE_INST__ITEM_CD = null;
	/** 第 29 変数： m_M_ITEM__ITEM_NAME */
	public String m_M_ITEM__ITEM_NAME = null;
	/** 第 30 変数： m_T_OD__JOB_ODR_CD */
	public String m_T_OD__JOB_ODR_CD = null;
	/** 第 31 変数： m_SYS_TYPE_VALUE__DISPLAY_NAME */
	public String m_SYS_TYPE_VALUE__DISPLAY_NAME = null;
	/** 第 32 変数： m_T_ISSUE_INST__SCDL_ISSUE_DATE */
	public String m_T_ISSUE_INST__SCDL_ISSUE_DATE = null;
	/** 第 33 変数： m_T_ISSUE_INST__ISSUE_INST_QTY */
	public String m_T_ISSUE_INST__ISSUE_INST_QTY = null;
	/** 第 34 変数： m_T_ISSUE_INST__TOTAL_ISSUE_QTY */
	public String m_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;
	/** 第 35 変数： m_M_ITEM__STOCK_UNIT */
	public String m_M_ITEM__STOCK_UNIT = null;
	/** 第 36 変数： m_M_CONS_UNIT_COST__UNIT_COST */
	public String m_M_CONS_UNIT_COST__UNIT_COST = null;
	/** 第 37 変数： m_M_CUR__CUR_UNIT */
	public String m_M_CUR__CUR_UNIT = null;
	/** 第 38 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r1_CONS_TYP */
	public List l_r1_CONS_TYP = null;

	/** 第 2 List変数： l_r2_CONS_TYP */
	public List l_r2_CONS_TYP = null;

	/** 第 3 List変数： l_r3_CONS_TYP */
	public List l_r3_CONS_TYP = null;

	/** 第 4 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 5 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 6 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 7 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 8 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 9 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 10 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 11 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 12 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 13 List変数： l_SCDL_ISSUE_DATE */
	public List l_SCDL_ISSUE_DATE = null;

	/** 第 14 List変数： l_SCDL_ISSUE_TIME */
	public List l_SCDL_ISSUE_TIME = null;

	/** 第 15 List変数： l_ISSUE_INST_QTY */
	public List l_ISSUE_INST_QTY = null;

	/** 第 16 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 17 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 18 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 19 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 20 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 21 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 22 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 23 List変数： l_SCDL_ISSUE_DATE_ALL */
	public List l_SCDL_ISSUE_DATE_ALL = null;

	/** 第 24 List変数： l_T_ISSUE_INST__PLANT_CD */
	public List l_T_ISSUE_INST__PLANT_CD = null;

	/** 第 25 List変数： l_M_PLANT__PLANT_NAME */
	public List l_M_PLANT__PLANT_NAME = null;

	/** 第 26 List変数： l_T_ISSUE_INST__VEND_CD */
	public List l_T_ISSUE_INST__VEND_CD = null;

	/** 第 27 List変数： l_M_VEND_CTRL__VEND_NAME */
	public List l_M_VEND_CTRL__VEND_NAME = null;

	/** 第 28 List変数： l_T_ISSUE_INST__ITEM_CD */
	public List l_T_ISSUE_INST__ITEM_CD = null;

	/** 第 29 List変数： l_M_ITEM__ITEM_NAME */
	public List l_M_ITEM__ITEM_NAME = null;

	/** 第 30 List変数： l_T_OD__JOB_ODR_CD */
	public List l_T_OD__JOB_ODR_CD = null;

	/** 第 31 List変数： l_SYS_TYPE_VALUE__DISPLAY_NAME */
	public List l_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	/** 第 32 List変数： l_T_ISSUE_INST__SCDL_ISSUE_DATE */
	public List l_T_ISSUE_INST__SCDL_ISSUE_DATE = null;

	/** 第 33 List変数： l_T_ISSUE_INST__ISSUE_INST_QTY */
	public List l_T_ISSUE_INST__ISSUE_INST_QTY = null;

	/** 第 34 List変数： l_T_ISSUE_INST__TOTAL_ISSUE_QTY */
	public List l_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;

	/** 第 35 List変数： l_M_ITEM__STOCK_UNIT */
	public List l_M_ITEM__STOCK_UNIT = null;

	/** 第 36 List変数： l_M_CONS_UNIT_COST__UNIT_COST */
	public List l_M_CONS_UNIT_COST__UNIT_COST = null;

	/** 第 37 List変数： l_M_CUR__CUR_UNIT */
	public List l_M_CUR__CUR_UNIT = null;

	/** 第 38 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr1_CONS_TYP() { return m_r1_CONS_TYP; }
	public String getr2_CONS_TYP() { return m_r2_CONS_TYP; }
	public String getr3_CONS_TYP() { return m_r3_CONS_TYP; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getSCDL_ISSUE_DATE() { return m_SCDL_ISSUE_DATE; }
	public String getSCDL_ISSUE_TIME() { return m_SCDL_ISSUE_TIME; }
	public String getISSUE_INST_QTY() { return m_ISSUE_INST_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getSCDL_ISSUE_DATE_ALL() { return m_SCDL_ISSUE_DATE_ALL; }
	public String getT_ISSUE_INST__PLANT_CD() { return m_T_ISSUE_INST__PLANT_CD; }
	public String getM_PLANT__PLANT_NAME() { return m_M_PLANT__PLANT_NAME; }
	public String getT_ISSUE_INST__VEND_CD() { return m_T_ISSUE_INST__VEND_CD; }
	public String getM_VEND_CTRL__VEND_NAME() { return m_M_VEND_CTRL__VEND_NAME; }
	public String getT_ISSUE_INST__ITEM_CD() { return m_T_ISSUE_INST__ITEM_CD; }
	public String getM_ITEM__ITEM_NAME() { return m_M_ITEM__ITEM_NAME; }
	public String getT_OD__JOB_ODR_CD() { return m_T_OD__JOB_ODR_CD; }
	public String getSYS_TYPE_VALUE__DISPLAY_NAME() { return m_SYS_TYPE_VALUE__DISPLAY_NAME; }
	public String getT_ISSUE_INST__SCDL_ISSUE_DATE() { return m_T_ISSUE_INST__SCDL_ISSUE_DATE; }
	public String getT_ISSUE_INST__ISSUE_INST_QTY() { return m_T_ISSUE_INST__ISSUE_INST_QTY; }
	public String getT_ISSUE_INST__TOTAL_ISSUE_QTY() { return m_T_ISSUE_INST__TOTAL_ISSUE_QTY; }
	public String getM_ITEM__STOCK_UNIT() { return m_M_ITEM__STOCK_UNIT; }
	public String getM_CONS_UNIT_COST__UNIT_COST() { return m_M_CONS_UNIT_COST__UNIT_COST; }
	public String getM_CUR__CUR_UNIT() { return m_M_CUR__CUR_UNIT; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }

	public List getList_r1_CONS_TYP() { return l_r1_CONS_TYP; }
	public List getList_r2_CONS_TYP() { return l_r2_CONS_TYP; }
	public List getList_r3_CONS_TYP() { return l_r3_CONS_TYP; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_SCDL_ISSUE_DATE() { return l_SCDL_ISSUE_DATE; }
	public List getList_SCDL_ISSUE_TIME() { return l_SCDL_ISSUE_TIME; }
	public List getList_ISSUE_INST_QTY() { return l_ISSUE_INST_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_SCDL_ISSUE_DATE_ALL() { return l_SCDL_ISSUE_DATE_ALL; }
	public List getList_T_ISSUE_INST__PLANT_CD() { return l_T_ISSUE_INST__PLANT_CD; }
	public List getList_M_PLANT__PLANT_NAME() { return l_M_PLANT__PLANT_NAME; }
	public List getList_T_ISSUE_INST__VEND_CD() { return l_T_ISSUE_INST__VEND_CD; }
	public List getList_M_VEND_CTRL__VEND_NAME() { return l_M_VEND_CTRL__VEND_NAME; }
	public List getList_T_ISSUE_INST__ITEM_CD() { return l_T_ISSUE_INST__ITEM_CD; }
	public List getList_M_ITEM__ITEM_NAME() { return l_M_ITEM__ITEM_NAME; }
	public List getList_T_OD__JOB_ODR_CD() { return l_T_OD__JOB_ODR_CD; }
	public List getList_SYS_TYPE_VALUE__DISPLAY_NAME() { return l_SYS_TYPE_VALUE__DISPLAY_NAME; }
	public List getList_T_ISSUE_INST__SCDL_ISSUE_DATE() { return l_T_ISSUE_INST__SCDL_ISSUE_DATE; }
	public List getList_T_ISSUE_INST__ISSUE_INST_QTY() { return l_T_ISSUE_INST__ISSUE_INST_QTY; }
	public List getList_T_ISSUE_INST__TOTAL_ISSUE_QTY() { return l_T_ISSUE_INST__TOTAL_ISSUE_QTY; }
	public List getList_M_ITEM__STOCK_UNIT() { return l_M_ITEM__STOCK_UNIT; }
	public List getList_M_CONS_UNIT_COST__UNIT_COST() { return l_M_CONS_UNIT_COST__UNIT_COST; }
	public List getList_M_CUR__CUR_UNIT() { return l_M_CUR__CUR_UNIT; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }

	public void setr1_CONS_TYP(String val) { m_r1_CONS_TYP = val; }
	public void setr2_CONS_TYP(String val) { m_r2_CONS_TYP = val; }
	public void setr3_CONS_TYP(String val) { m_r3_CONS_TYP = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setSCDL_ISSUE_DATE(String val) { m_SCDL_ISSUE_DATE = val; }
	public void setSCDL_ISSUE_TIME(String val) { m_SCDL_ISSUE_TIME = val; }
	public void setISSUE_INST_QTY(String val) { m_ISSUE_INST_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setSCDL_ISSUE_DATE_ALL(String val) { m_SCDL_ISSUE_DATE_ALL = val; }
	public void setT_ISSUE_INST__PLANT_CD(String val) { m_T_ISSUE_INST__PLANT_CD = val; }
	public void setM_PLANT__PLANT_NAME(String val) { m_M_PLANT__PLANT_NAME = val; }
	public void setT_ISSUE_INST__VEND_CD(String val) { m_T_ISSUE_INST__VEND_CD = val; }
	public void setM_VEND_CTRL__VEND_NAME(String val) { m_M_VEND_CTRL__VEND_NAME = val; }
	public void setT_ISSUE_INST__ITEM_CD(String val) { m_T_ISSUE_INST__ITEM_CD = val; }
	public void setM_ITEM__ITEM_NAME(String val) { m_M_ITEM__ITEM_NAME = val; }
	public void setT_OD__JOB_ODR_CD(String val) { m_T_OD__JOB_ODR_CD = val; }
	public void setSYS_TYPE_VALUE__DISPLAY_NAME(String val) { m_SYS_TYPE_VALUE__DISPLAY_NAME = val; }
	public void setT_ISSUE_INST__SCDL_ISSUE_DATE(String val) { m_T_ISSUE_INST__SCDL_ISSUE_DATE = val; }
	public void setT_ISSUE_INST__ISSUE_INST_QTY(String val) { m_T_ISSUE_INST__ISSUE_INST_QTY = val; }
	public void setT_ISSUE_INST__TOTAL_ISSUE_QTY(String val) { m_T_ISSUE_INST__TOTAL_ISSUE_QTY = val; }
	public void setM_ITEM__STOCK_UNIT(String val) { m_M_ITEM__STOCK_UNIT = val; }
	public void setM_CONS_UNIT_COST__UNIT_COST(String val) { m_M_CONS_UNIT_COST__UNIT_COST = val; }
	public void setM_CUR__CUR_UNIT(String val) { m_M_CUR__CUR_UNIT = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }


	public void setList_r1_CONS_TYP(List list) { l_r1_CONS_TYP = list; }
	public void setList_r2_CONS_TYP(List list) { l_r2_CONS_TYP = list; }
	public void setList_r3_CONS_TYP(List list) { l_r3_CONS_TYP = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_SCDL_ISSUE_DATE(List list) { l_SCDL_ISSUE_DATE = list; }
	public void setList_SCDL_ISSUE_TIME(List list) { l_SCDL_ISSUE_TIME = list; }
	public void setList_ISSUE_INST_QTY(List list) { l_ISSUE_INST_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_SCDL_ISSUE_DATE_ALL(List list) { l_SCDL_ISSUE_DATE_ALL = list; }
	public void setList_T_ISSUE_INST__PLANT_CD(List list) { l_T_ISSUE_INST__PLANT_CD = list; }
	public void setList_M_PLANT__PLANT_NAME(List list) { l_M_PLANT__PLANT_NAME = list; }
	public void setList_T_ISSUE_INST__VEND_CD(List list) { l_T_ISSUE_INST__VEND_CD = list; }
	public void setList_M_VEND_CTRL__VEND_NAME(List list) { l_M_VEND_CTRL__VEND_NAME = list; }
	public void setList_T_ISSUE_INST__ITEM_CD(List list) { l_T_ISSUE_INST__ITEM_CD = list; }
	public void setList_M_ITEM__ITEM_NAME(List list) { l_M_ITEM__ITEM_NAME = list; }
	public void setList_T_OD__JOB_ODR_CD(List list) { l_T_OD__JOB_ODR_CD = list; }
	public void setList_SYS_TYPE_VALUE__DISPLAY_NAME(List list) { l_SYS_TYPE_VALUE__DISPLAY_NAME = list; }
	public void setList_T_ISSUE_INST__SCDL_ISSUE_DATE(List list) { l_T_ISSUE_INST__SCDL_ISSUE_DATE = list; }
	public void setList_T_ISSUE_INST__ISSUE_INST_QTY(List list) { l_T_ISSUE_INST__ISSUE_INST_QTY = list; }
	public void setList_T_ISSUE_INST__TOTAL_ISSUE_QTY(List list) { l_T_ISSUE_INST__TOTAL_ISSUE_QTY = list; }
	public void setList_M_ITEM__STOCK_UNIT(List list) { l_M_ITEM__STOCK_UNIT = list; }
	public void setList_M_CONS_UNIT_COST__UNIT_COST(List list) { l_M_CONS_UNIT_COST__UNIT_COST = list; }
	public void setList_M_CUR__CUR_UNIT(List list) { l_M_CUR__CUR_UNIT = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }

	public int setL2L_r1_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_CONS_TYP == null) {
			l_r1_CONS_TYP = new ArrayList();
		} else {
			l_r1_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_CONS_TYP.add(((AE0050010Struct) list.get(i)).getr1_CONS_TYP());
		}
		return size;
	}
	public int setL2L_r2_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_CONS_TYP == null) {
			l_r2_CONS_TYP = new ArrayList();
		} else {
			l_r2_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_CONS_TYP.add(((AE0050010Struct) list.get(i)).getr2_CONS_TYP());
		}
		return size;
	}
	public int setL2L_r3_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_CONS_TYP == null) {
			l_r3_CONS_TYP = new ArrayList();
		} else {
			l_r3_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_CONS_TYP.add(((AE0050010Struct) list.get(i)).getr3_CONS_TYP());
		}
		return size;
	}
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
			l_DOWNLOAD_FILE.add(((AE0050010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_PLANT_CD.add(((AE0050010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AE0050010Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_CD.add(((AE0050010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AE0050010Struct) list.get(i)).getVEND_NAME());
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
			l_ITEM_CD.add(((AE0050010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0050010Struct) list.get(i)).getITEM_NAME());
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
			l_JOB_ODR_CD.add(((AE0050010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP == null) {
			l_CONS_TYP = new ArrayList();
		} else {
			l_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP.add(((AE0050010Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_DATE == null) {
			l_SCDL_ISSUE_DATE = new ArrayList();
		} else {
			l_SCDL_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_DATE.add(((AE0050010Struct) list.get(i)).getSCDL_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_TIME == null) {
			l_SCDL_ISSUE_TIME = new ArrayList();
		} else {
			l_SCDL_ISSUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_TIME.add(((AE0050010Struct) list.get(i)).getSCDL_ISSUE_TIME());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_QTY == null) {
			l_ISSUE_INST_QTY = new ArrayList();
		} else {
			l_ISSUE_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_QTY.add(((AE0050010Struct) list.get(i)).getISSUE_INST_QTY());
		}
		return size;
	}
	public int setL2L_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_ISSUE_QTY == null) {
			l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_ISSUE_QTY.add(((AE0050010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
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
			l_STOCK_UNIT.add(((AE0050010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AE0050010Struct) list.get(i)).getUNIT_COST());
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
			l_CUR_UNIT.add(((AE0050010Struct) list.get(i)).getCUR_UNIT());
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
			l_DECIMAL_FIG.add(((AE0050010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP == null) {
			l_ROUND_TYP = new ArrayList();
		} else {
			l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP.add(((AE0050010Struct) list.get(i)).getROUND_TYP());
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
			l_BUSINESS_OPR_DATE.add(((AE0050010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_DATE_ALL == null) {
			l_SCDL_ISSUE_DATE_ALL = new ArrayList();
		} else {
			l_SCDL_ISSUE_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_DATE_ALL.add(((AE0050010Struct) list.get(i)).getSCDL_ISSUE_DATE_ALL());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__PLANT_CD == null) {
			l_T_ISSUE_INST__PLANT_CD = new ArrayList();
		} else {
			l_T_ISSUE_INST__PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__PLANT_CD.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__PLANT_CD());
		}
		return size;
	}
	public int setL2L_M_PLANT__PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__PLANT_NAME == null) {
			l_M_PLANT__PLANT_NAME = new ArrayList();
		} else {
			l_M_PLANT__PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__PLANT_NAME.add(((AE0050010Struct) list.get(i)).getM_PLANT__PLANT_NAME());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__VEND_CD == null) {
			l_T_ISSUE_INST__VEND_CD = new ArrayList();
		} else {
			l_T_ISSUE_INST__VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__VEND_CD.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__VEND_CD());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__VEND_NAME == null) {
			l_M_VEND_CTRL__VEND_NAME = new ArrayList();
		} else {
			l_M_VEND_CTRL__VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__VEND_NAME.add(((AE0050010Struct) list.get(i)).getM_VEND_CTRL__VEND_NAME());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__ITEM_CD == null) {
			l_T_ISSUE_INST__ITEM_CD = new ArrayList();
		} else {
			l_T_ISSUE_INST__ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__ITEM_CD.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__ITEM_CD());
		}
		return size;
	}
	public int setL2L_M_ITEM__ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__ITEM_NAME == null) {
			l_M_ITEM__ITEM_NAME = new ArrayList();
		} else {
			l_M_ITEM__ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__ITEM_NAME.add(((AE0050010Struct) list.get(i)).getM_ITEM__ITEM_NAME());
		}
		return size;
	}
	public int setL2L_T_OD__JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_OD__JOB_ODR_CD == null) {
			l_T_OD__JOB_ODR_CD = new ArrayList();
		} else {
			l_T_OD__JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_OD__JOB_ODR_CD.add(((AE0050010Struct) list.get(i)).getT_OD__JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SYS_TYPE_VALUE__DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_TYPE_VALUE__DISPLAY_NAME == null) {
			l_SYS_TYPE_VALUE__DISPLAY_NAME = new ArrayList();
		} else {
			l_SYS_TYPE_VALUE__DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_TYPE_VALUE__DISPLAY_NAME.add(((AE0050010Struct) list.get(i)).getSYS_TYPE_VALUE__DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__SCDL_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__SCDL_ISSUE_DATE == null) {
			l_T_ISSUE_INST__SCDL_ISSUE_DATE = new ArrayList();
		} else {
			l_T_ISSUE_INST__SCDL_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__SCDL_ISSUE_DATE.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__SCDL_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__ISSUE_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__ISSUE_INST_QTY == null) {
			l_T_ISSUE_INST__ISSUE_INST_QTY = new ArrayList();
		} else {
			l_T_ISSUE_INST__ISSUE_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__ISSUE_INST_QTY.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__ISSUE_INST_QTY());
		}
		return size;
	}
	public int setL2L_T_ISSUE_INST__TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ISSUE_INST__TOTAL_ISSUE_QTY == null) {
			l_T_ISSUE_INST__TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_T_ISSUE_INST__TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ISSUE_INST__TOTAL_ISSUE_QTY.add(((AE0050010Struct) list.get(i)).getT_ISSUE_INST__TOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_M_ITEM__STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__STOCK_UNIT == null) {
			l_M_ITEM__STOCK_UNIT = new ArrayList();
		} else {
			l_M_ITEM__STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__STOCK_UNIT.add(((AE0050010Struct) list.get(i)).getM_ITEM__STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_M_CONS_UNIT_COST__UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CONS_UNIT_COST__UNIT_COST == null) {
			l_M_CONS_UNIT_COST__UNIT_COST = new ArrayList();
		} else {
			l_M_CONS_UNIT_COST__UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CONS_UNIT_COST__UNIT_COST.add(((AE0050010Struct) list.get(i)).getM_CONS_UNIT_COST__UNIT_COST());
		}
		return size;
	}
	public int setL2L_M_CUR__CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CUR__CUR_UNIT == null) {
			l_M_CUR__CUR_UNIT = new ArrayList();
		} else {
			l_M_CUR__CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CUR__CUR_UNIT.add(((AE0050010Struct) list.get(i)).getM_CUR__CUR_UNIT());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AE0050010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_CONS_TYP = null;
		m_r2_CONS_TYP = null;
		m_r3_CONS_TYP = null;
		m_DOWNLOAD_FILE = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_CONS_TYP = null;
		m_SCDL_ISSUE_DATE = null;
		m_SCDL_ISSUE_TIME = null;
		m_ISSUE_INST_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_STOCK_UNIT = null;
		m_UNIT_COST = null;
		m_CUR_UNIT = null;
		m_DECIMAL_FIG = null;
		m_ROUND_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_SCDL_ISSUE_DATE_ALL = null;
		m_T_ISSUE_INST__PLANT_CD = null;
		m_M_PLANT__PLANT_NAME = null;
		m_T_ISSUE_INST__VEND_CD = null;
		m_M_VEND_CTRL__VEND_NAME = null;
		m_T_ISSUE_INST__ITEM_CD = null;
		m_M_ITEM__ITEM_NAME = null;
		m_T_OD__JOB_ODR_CD = null;
		m_SYS_TYPE_VALUE__DISPLAY_NAME = null;
		m_T_ISSUE_INST__SCDL_ISSUE_DATE = null;
		m_T_ISSUE_INST__ISSUE_INST_QTY = null;
		m_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;
		m_M_ITEM__STOCK_UNIT = null;
		m_M_CONS_UNIT_COST__UNIT_COST = null;
		m_M_CUR__CUR_UNIT = null;
		m_TIME_CTRL = null;

		l_r1_CONS_TYP = null;
		l_r2_CONS_TYP = null;
		l_r3_CONS_TYP = null;
		l_DOWNLOAD_FILE = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_CONS_TYP = null;
		l_SCDL_ISSUE_DATE = null;
		l_SCDL_ISSUE_TIME = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_STOCK_UNIT = null;
		l_UNIT_COST = null;
		l_CUR_UNIT = null;
		l_DECIMAL_FIG = null;
		l_ROUND_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_SCDL_ISSUE_DATE_ALL = null;
		l_T_ISSUE_INST__PLANT_CD = null;
		l_M_PLANT__PLANT_NAME = null;
		l_T_ISSUE_INST__VEND_CD = null;
		l_M_VEND_CTRL__VEND_NAME = null;
		l_T_ISSUE_INST__ITEM_CD = null;
		l_M_ITEM__ITEM_NAME = null;
		l_T_OD__JOB_ODR_CD = null;
		l_SYS_TYPE_VALUE__DISPLAY_NAME = null;
		l_T_ISSUE_INST__SCDL_ISSUE_DATE = null;
		l_T_ISSUE_INST__ISSUE_INST_QTY = null;
		l_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;
		l_M_ITEM__STOCK_UNIT = null;
		l_M_CONS_UNIT_COST__UNIT_COST = null;
		l_M_CUR__CUR_UNIT = null;
		l_TIME_CTRL = null;

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
	 * medAE0050010クラスの標準コンストラクタ
	 */
	public AE0050010Struct()
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
	public void setStruct(AE0050010Struct struct)
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
	public void setStructM(AE0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_CONS_TYP(struct.getr1_CONS_TYP());
			this.setr2_CONS_TYP(struct.getr2_CONS_TYP());
			this.setr3_CONS_TYP(struct.getr3_CONS_TYP());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setSCDL_ISSUE_DATE(struct.getSCDL_ISSUE_DATE());
			this.setSCDL_ISSUE_TIME(struct.getSCDL_ISSUE_TIME());
			this.setISSUE_INST_QTY(struct.getISSUE_INST_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setSCDL_ISSUE_DATE_ALL(struct.getSCDL_ISSUE_DATE_ALL());
			this.setT_ISSUE_INST__PLANT_CD(struct.getT_ISSUE_INST__PLANT_CD());
			this.setM_PLANT__PLANT_NAME(struct.getM_PLANT__PLANT_NAME());
			this.setT_ISSUE_INST__VEND_CD(struct.getT_ISSUE_INST__VEND_CD());
			this.setM_VEND_CTRL__VEND_NAME(struct.getM_VEND_CTRL__VEND_NAME());
			this.setT_ISSUE_INST__ITEM_CD(struct.getT_ISSUE_INST__ITEM_CD());
			this.setM_ITEM__ITEM_NAME(struct.getM_ITEM__ITEM_NAME());
			this.setT_OD__JOB_ODR_CD(struct.getT_OD__JOB_ODR_CD());
			this.setSYS_TYPE_VALUE__DISPLAY_NAME(struct.getSYS_TYPE_VALUE__DISPLAY_NAME());
			this.setT_ISSUE_INST__SCDL_ISSUE_DATE(struct.getT_ISSUE_INST__SCDL_ISSUE_DATE());
			this.setT_ISSUE_INST__ISSUE_INST_QTY(struct.getT_ISSUE_INST__ISSUE_INST_QTY());
			this.setT_ISSUE_INST__TOTAL_ISSUE_QTY(struct.getT_ISSUE_INST__TOTAL_ISSUE_QTY());
			this.setM_ITEM__STOCK_UNIT(struct.getM_ITEM__STOCK_UNIT());
			this.setM_CONS_UNIT_COST__UNIT_COST(struct.getM_CONS_UNIT_COST__UNIT_COST());
			this.setM_CUR__CUR_UNIT(struct.getM_CUR__CUR_UNIT());
			this.setTIME_CTRL(struct.getTIME_CTRL());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_CONS_TYP(struct.getList_r1_CONS_TYP());
			this.setList_r2_CONS_TYP(struct.getList_r2_CONS_TYP());
			this.setList_r3_CONS_TYP(struct.getList_r3_CONS_TYP());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_SCDL_ISSUE_DATE(struct.getList_SCDL_ISSUE_DATE());
			this.setList_SCDL_ISSUE_TIME(struct.getList_SCDL_ISSUE_TIME());
			this.setList_ISSUE_INST_QTY(struct.getList_ISSUE_INST_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_SCDL_ISSUE_DATE_ALL(struct.getList_SCDL_ISSUE_DATE_ALL());
			this.setList_T_ISSUE_INST__PLANT_CD(struct.getList_T_ISSUE_INST__PLANT_CD());
			this.setList_M_PLANT__PLANT_NAME(struct.getList_M_PLANT__PLANT_NAME());
			this.setList_T_ISSUE_INST__VEND_CD(struct.getList_T_ISSUE_INST__VEND_CD());
			this.setList_M_VEND_CTRL__VEND_NAME(struct.getList_M_VEND_CTRL__VEND_NAME());
			this.setList_T_ISSUE_INST__ITEM_CD(struct.getList_T_ISSUE_INST__ITEM_CD());
			this.setList_M_ITEM__ITEM_NAME(struct.getList_M_ITEM__ITEM_NAME());
			this.setList_T_OD__JOB_ODR_CD(struct.getList_T_OD__JOB_ODR_CD());
			this.setList_SYS_TYPE_VALUE__DISPLAY_NAME(struct.getList_SYS_TYPE_VALUE__DISPLAY_NAME());
			this.setList_T_ISSUE_INST__SCDL_ISSUE_DATE(struct.getList_T_ISSUE_INST__SCDL_ISSUE_DATE());
			this.setList_T_ISSUE_INST__ISSUE_INST_QTY(struct.getList_T_ISSUE_INST__ISSUE_INST_QTY());
			this.setList_T_ISSUE_INST__TOTAL_ISSUE_QTY(struct.getList_T_ISSUE_INST__TOTAL_ISSUE_QTY());
			this.setList_M_ITEM__STOCK_UNIT(struct.getList_M_ITEM__STOCK_UNIT());
			this.setList_M_CONS_UNIT_COST__UNIT_COST(struct.getList_M_CONS_UNIT_COST__UNIT_COST());
			this.setList_M_CUR__CUR_UNIT(struct.getList_M_CUR__CUR_UNIT());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// 第 1 変数初期値： i_r1_CONS_TYP


	final static String i_r1_CONS_TYP = null;

	// 第 2 変数初期値： i_r2_CONS_TYP


	final static String i_r2_CONS_TYP = null;

	// 第 3 変数初期値： i_r3_CONS_TYP


	final static String i_r3_CONS_TYP = null;

	// 第 4 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 5 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 6 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 7 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 8 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 9 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 10 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 11 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 12 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 13 変数初期値： i_SCDL_ISSUE_DATE


	final static String i_SCDL_ISSUE_DATE = null;

	// 第 14 変数初期値： i_SCDL_ISSUE_TIME


	final static String i_SCDL_ISSUE_TIME = null;

	// 第 15 変数初期値： i_ISSUE_INST_QTY


	final static String i_ISSUE_INST_QTY = null;

	// 第 16 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 17 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 18 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 19 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 20 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 21 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 22 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 23 変数初期値： i_SCDL_ISSUE_DATE_ALL


	final static String i_SCDL_ISSUE_DATE_ALL = null;

	// 第 24 変数初期値： i_T_ISSUE_INST__PLANT_CD


	final static String i_T_ISSUE_INST__PLANT_CD = null;

	// 第 25 変数初期値： i_M_PLANT__PLANT_NAME


	final static String i_M_PLANT__PLANT_NAME = null;

	// 第 26 変数初期値： i_T_ISSUE_INST__VEND_CD


	final static String i_T_ISSUE_INST__VEND_CD = null;

	// 第 27 変数初期値： i_M_VEND_CTRL__VEND_NAME


	final static String i_M_VEND_CTRL__VEND_NAME = null;

	// 第 28 変数初期値： i_T_ISSUE_INST__ITEM_CD


	final static String i_T_ISSUE_INST__ITEM_CD = null;

	// 第 29 変数初期値： i_M_ITEM__ITEM_NAME


	final static String i_M_ITEM__ITEM_NAME = null;

	// 第 30 変数初期値： i_T_OD__JOB_ODR_CD


	final static String i_T_OD__JOB_ODR_CD = null;

	// 第 31 変数初期値： i_SYS_TYPE_VALUE__DISPLAY_NAME


	final static String i_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	// 第 32 変数初期値： i_T_ISSUE_INST__SCDL_ISSUE_DATE


	final static String i_T_ISSUE_INST__SCDL_ISSUE_DATE = null;

	// 第 33 変数初期値： i_T_ISSUE_INST__ISSUE_INST_QTY


	final static String i_T_ISSUE_INST__ISSUE_INST_QTY = null;

	// 第 34 変数初期値： i_T_ISSUE_INST__TOTAL_ISSUE_QTY


	final static String i_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;

	// 第 35 変数初期値： i_M_ITEM__STOCK_UNIT


	final static String i_M_ITEM__STOCK_UNIT = null;

	// 第 36 変数初期値： i_M_CONS_UNIT_COST__UNIT_COST


	final static String i_M_CONS_UNIT_COST__UNIT_COST = null;

	// 第 37 変数初期値： i_M_CUR__CUR_UNIT


	final static String i_M_CUR__CUR_UNIT = null;

	// 第 38 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r1_CONS_TYP

	final static String i_r1_CONS_TYP = null;

	// 第 2 変数初期値： i_r2_CONS_TYP

	final static String i_r2_CONS_TYP = null;

	// 第 3 変数初期値： i_r3_CONS_TYP

	final static String i_r3_CONS_TYP = null;

	// 第 4 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 5 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 6 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 7 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 8 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 9 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 10 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 11 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 12 変数初期値： i_CONS_TYP

	final static String i_CONS_TYP = null;

	// 第 13 変数初期値： i_SCDL_ISSUE_DATE

	final static String i_SCDL_ISSUE_DATE = null;

	// 第 14 変数初期値： i_ISSUE_INST_QTY

	final static String i_ISSUE_INST_QTY = null;

	// 第 15 変数初期値： i_TOTAL_ISSUE_QTY

	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 16 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 17 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 18 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 19 変数初期値： i_DECIMAL_FIG

	final static String i_DECIMAL_FIG = null;

	// 第 20 変数初期値： i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// 第 21 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// 第 22 変数初期値： i_T_ISSUE_INST__PLANT_CD

	final static String i_T_ISSUE_INST__PLANT_CD = null;

	// 第 23 変数初期値： i_M_PLANT__PLANT_NAME

	final static String i_M_PLANT__PLANT_NAME = null;

	// 第 24 変数初期値： i_T_ISSUE_INST__VEND_CD

	final static String i_T_ISSUE_INST__VEND_CD = null;

	// 第 25 変数初期値： i_M_VEND_CTRL__VEND_NAME

	final static String i_M_VEND_CTRL__VEND_NAME = null;

	// 第 26 変数初期値： i_T_ISSUE_INST__ITEM_CD

	final static String i_T_ISSUE_INST__ITEM_CD = null;

	// 第 27 変数初期値： i_M_ITEM__ITEM_NAME

	final static String i_M_ITEM__ITEM_NAME = null;

	// 第 28 変数初期値： i_T_OD__JOB_ODR_CD

	final static String i_T_OD__JOB_ODR_CD = null;

	// 第 29 変数初期値： i_SYS_TYPE_VALUE__DISPLAY_NAME

	final static String i_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	// 第 30 変数初期値： i_T_ISSUE_INST__SCDL_ISSUE_DATE

	final static String i_T_ISSUE_INST__SCDL_ISSUE_DATE = null;

	// 第 31 変数初期値： i_T_ISSUE_INST__ISSUE_INST_QTY

	final static String i_T_ISSUE_INST__ISSUE_INST_QTY = null;

	// 第 32 変数初期値： i_T_ISSUE_INST__TOTAL_ISSUE_QTY

	final static String i_T_ISSUE_INST__TOTAL_ISSUE_QTY = null;

	// 第 33 変数初期値： i_M_ITEM__STOCK_UNIT

	final static String i_M_ITEM__STOCK_UNIT = null;

	// 第 34 変数初期値： i_M_CONS_UNIT_COST__UNIT_COST

	final static String i_M_CONS_UNIT_COST__UNIT_COST = null;

	// 第 35 変数初期値： i_M_CUR__CUR_UNIT

	final static String i_M_CUR__CUR_UNIT = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_CONS_TYP = i_r1_CONS_TYP;
		m_r2_CONS_TYP = i_r2_CONS_TYP;
		m_r3_CONS_TYP = i_r3_CONS_TYP;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_PLANT_CD = i_PLANT_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_CD = i_VEND_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_CONS_TYP = i_CONS_TYP;
		m_SCDL_ISSUE_DATE = i_SCDL_ISSUE_DATE;
		m_ISSUE_INST_QTY = i_ISSUE_INST_QTY;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_UNIT_COST = i_UNIT_COST;
		m_CUR_UNIT = i_CUR_UNIT;
		m_DECIMAL_FIG = i_DECIMAL_FIG;
		m_ROUND_TYP = i_ROUND_TYP;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_T_ISSUE_INST__PLANT_CD = i_T_ISSUE_INST__PLANT_CD;
		m_M_PLANT__PLANT_NAME = i_M_PLANT__PLANT_NAME;
		m_T_ISSUE_INST__VEND_CD = i_T_ISSUE_INST__VEND_CD;
		m_M_VEND_CTRL__VEND_NAME = i_M_VEND_CTRL__VEND_NAME;
		m_T_ISSUE_INST__ITEM_CD = i_T_ISSUE_INST__ITEM_CD;
		m_M_ITEM__ITEM_NAME = i_M_ITEM__ITEM_NAME;
		m_T_OD__JOB_ODR_CD = i_T_OD__JOB_ODR_CD;
		m_SYS_TYPE_VALUE__DISPLAY_NAME = i_SYS_TYPE_VALUE__DISPLAY_NAME;
		m_T_ISSUE_INST__SCDL_ISSUE_DATE = i_T_ISSUE_INST__SCDL_ISSUE_DATE;
		m_T_ISSUE_INST__ISSUE_INST_QTY = i_T_ISSUE_INST__ISSUE_INST_QTY;
		m_T_ISSUE_INST__TOTAL_ISSUE_QTY = i_T_ISSUE_INST__TOTAL_ISSUE_QTY;
		m_M_ITEM__STOCK_UNIT = i_M_ITEM__STOCK_UNIT;
		m_M_CONS_UNIT_COST__UNIT_COST = i_M_CONS_UNIT_COST__UNIT_COST;
		m_M_CUR__CUR_UNIT = i_M_CUR__CUR_UNIT;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
