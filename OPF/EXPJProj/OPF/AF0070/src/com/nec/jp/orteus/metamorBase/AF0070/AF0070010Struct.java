/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0070/src/com/nec/jp/orteus/metamorBase/AF0070/AF0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0070;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0070010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ALC_POS_STOCK_QTY */
	public String m_ALC_POS_STOCK_QTY = null;
	/** 第 2 変数： m_RCV_ISSUE_POS_QTY */
	public String m_RCV_ISSUE_POS_QTY = null;
	/** 第 3 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 4 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 5 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 6 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 7 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 8 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 9 変数： m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** 第 10 変数： m_w_WH_STOCK_QTY */
	public String m_w_WH_STOCK_QTY = null;
	/** 第 11 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 12 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 13 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 14 変数： m_w_UNIT_QTY_TYP */
	public Integer m_w_UNIT_QTY_TYP = null;
	/** 第 15 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 16 変数： m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** 第 17 変数： m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** 第 18 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 19 変数： m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** 第 20 変数： m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** 第 21 変数： m_w_JOB_ODR_STOCK_QTY */
	public String m_w_JOB_ODR_STOCK_QTY = null;
	/** 第 22 変数： m_w_RCV_ISSUE_CTRL_CD */
	public String m_w_RCV_ISSUE_CTRL_CD = null;
	/** 第 23 変数： m_w_RCV_ISSUE_TYP */
	public Integer m_w_RCV_ISSUE_TYP = null;
	/** 第 24 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 25 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 26 変数： m_w_RCV_ISSUE_GNR_TYP */
	public Integer m_w_RCV_ISSUE_GNR_TYP = null;
	/** 第 27 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 28 変数： m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** 第 29 変数： m_w_CONS_TYP */
	public Integer m_w_CONS_TYP = null;
	/** 第 30 変数： m_w_STOCK_UPD_TYP */
	public Integer m_w_STOCK_UPD_TYP = null;
	/** 第 31 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 32 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 33 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 34 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 35 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ALC_POS_STOCK_QTY */
	public List l_ALC_POS_STOCK_QTY = null;

	/** 第 2 List変数： l_RCV_ISSUE_POS_QTY */
	public List l_RCV_ISSUE_POS_QTY = null;

	/** 第 3 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 4 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 5 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 6 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 7 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 8 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 9 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 10 List変数： l_w_WH_STOCK_QTY */
	public List l_w_WH_STOCK_QTY = null;

	/** 第 11 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 12 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 13 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 14 List変数： l_w_UNIT_QTY_TYP */
	public List l_w_UNIT_QTY_TYP = null;

	/** 第 15 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 16 List変数： l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** 第 17 List変数： l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** 第 18 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 19 List変数： l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** 第 20 List変数： l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** 第 21 List変数： l_w_JOB_ODR_STOCK_QTY */
	public List l_w_JOB_ODR_STOCK_QTY = null;

	/** 第 22 List変数： l_w_RCV_ISSUE_CTRL_CD */
	public List l_w_RCV_ISSUE_CTRL_CD = null;

	/** 第 23 List変数： l_w_RCV_ISSUE_TYP */
	public List l_w_RCV_ISSUE_TYP = null;

	/** 第 24 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 25 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 26 List変数： l_w_RCV_ISSUE_GNR_TYP */
	public List l_w_RCV_ISSUE_GNR_TYP = null;

	/** 第 27 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 28 List変数： l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** 第 29 List変数： l_w_CONS_TYP */
	public List l_w_CONS_TYP = null;

	/** 第 30 List変数： l_w_STOCK_UPD_TYP */
	public List l_w_STOCK_UPD_TYP = null;

	/** 第 31 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 32 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 33 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 34 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 35 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getALC_POS_STOCK_QTY() { return m_ALC_POS_STOCK_QTY; }
	public String getRCV_ISSUE_POS_QTY() { return m_RCV_ISSUE_POS_QTY; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getw_WH_STOCK_QTY() { return m_w_WH_STOCK_QTY; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public Integer getw_UNIT_QTY_TYP() { return m_w_UNIT_QTY_TYP; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getw_JOB_ODR_STOCK_QTY() { return m_w_JOB_ODR_STOCK_QTY; }
	public String getw_RCV_ISSUE_CTRL_CD() { return m_w_RCV_ISSUE_CTRL_CD; }
	public Integer getw_RCV_ISSUE_TYP() { return m_w_RCV_ISSUE_TYP; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getw_RCV_ISSUE_GNR_TYP() { return m_w_RCV_ISSUE_GNR_TYP; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public Integer getw_CONS_TYP() { return m_w_CONS_TYP; }
	public Integer getw_STOCK_UPD_TYP() { return m_w_STOCK_UPD_TYP; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_ALC_POS_STOCK_QTY() { return l_ALC_POS_STOCK_QTY; }
	public List getList_RCV_ISSUE_POS_QTY() { return l_RCV_ISSUE_POS_QTY; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_w_WH_STOCK_QTY() { return l_w_WH_STOCK_QTY; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_UNIT_QTY_TYP() { return l_w_UNIT_QTY_TYP; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_w_JOB_ODR_STOCK_QTY() { return l_w_JOB_ODR_STOCK_QTY; }
	public List getList_w_RCV_ISSUE_CTRL_CD() { return l_w_RCV_ISSUE_CTRL_CD; }
	public List getList_w_RCV_ISSUE_TYP() { return l_w_RCV_ISSUE_TYP; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_w_RCV_ISSUE_GNR_TYP() { return l_w_RCV_ISSUE_GNR_TYP; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_w_CONS_TYP() { return l_w_CONS_TYP; }
	public List getList_w_STOCK_UPD_TYP() { return l_w_STOCK_UPD_TYP; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setALC_POS_STOCK_QTY(String val) { m_ALC_POS_STOCK_QTY = val; }
	public void setRCV_ISSUE_POS_QTY(String val) { m_RCV_ISSUE_POS_QTY = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setw_WH_STOCK_QTY(String val) { m_w_WH_STOCK_QTY = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_UNIT_QTY_TYP(Integer val) { m_w_UNIT_QTY_TYP = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setw_JOB_ODR_STOCK_QTY(String val) { m_w_JOB_ODR_STOCK_QTY = val; }
	public void setw_RCV_ISSUE_CTRL_CD(String val) { m_w_RCV_ISSUE_CTRL_CD = val; }
	public void setw_RCV_ISSUE_TYP(Integer val) { m_w_RCV_ISSUE_TYP = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setw_RCV_ISSUE_GNR_TYP(Integer val) { m_w_RCV_ISSUE_GNR_TYP = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setw_CONS_TYP(Integer val) { m_w_CONS_TYP = val; }
	public void setw_STOCK_UPD_TYP(Integer val) { m_w_STOCK_UPD_TYP = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void setw_UNIT_QTY_TYP(String val) { m_w_UNIT_QTY_TYP = getInteger(val); }
	public void setw_RCV_ISSUE_TYP(String val) { m_w_RCV_ISSUE_TYP = getInteger(val); }
	public void setw_RCV_ISSUE_GNR_TYP(String val) { m_w_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setw_CONS_TYP(String val) { m_w_CONS_TYP = getInteger(val); }
	public void setw_STOCK_UPD_TYP(String val) { m_w_STOCK_UPD_TYP = getInteger(val); }

	public void setList_ALC_POS_STOCK_QTY(List list) { l_ALC_POS_STOCK_QTY = list; }
	public void setList_RCV_ISSUE_POS_QTY(List list) { l_RCV_ISSUE_POS_QTY = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_w_WH_STOCK_QTY(List list) { l_w_WH_STOCK_QTY = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_UNIT_QTY_TYP(List list) { l_w_UNIT_QTY_TYP = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_w_JOB_ODR_STOCK_QTY(List list) { l_w_JOB_ODR_STOCK_QTY = list; }
	public void setList_w_RCV_ISSUE_CTRL_CD(List list) { l_w_RCV_ISSUE_CTRL_CD = list; }
	public void setList_w_RCV_ISSUE_TYP(List list) { l_w_RCV_ISSUE_TYP = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_w_RCV_ISSUE_GNR_TYP(List list) { l_w_RCV_ISSUE_GNR_TYP = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_w_CONS_TYP(List list) { l_w_CONS_TYP = list; }
	public void setList_w_STOCK_UPD_TYP(List list) { l_w_STOCK_UPD_TYP = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_ALC_POS_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_POS_STOCK_QTY == null) {
			l_ALC_POS_STOCK_QTY = new ArrayList();
		} else {
			l_ALC_POS_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_POS_STOCK_QTY.add(((AF0070010Struct) list.get(i)).getALC_POS_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_POS_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_POS_QTY == null) {
			l_RCV_ISSUE_POS_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_POS_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_POS_QTY.add(((AF0070010Struct) list.get(i)).getRCV_ISSUE_POS_QTY());
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
			l_ITEM_CD.add(((AF0070010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AF0070010Struct) list.get(i)).getITEM_NAME());
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
			l_JOB_ODR_CD.add(((AF0070010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO == null) {
			l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO.add(((AF0070010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_WH_CD.add(((AF0070010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AF0070010Struct) list.get(i)).getWH_NAME());
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
			l_MRP_FLG.add(((AF0070010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_w_WH_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_STOCK_QTY == null) {
			l_w_WH_STOCK_QTY = new ArrayList();
		} else {
			l_w_WH_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_STOCK_QTY.add(((AF0070010Struct) list.get(i)).getw_WH_STOCK_QTY());
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
			l_DRAW_CD.add(((AF0070010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0070010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0070010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_w_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_QTY_TYP == null) {
			l_w_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_w_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_QTY_TYP.add(((AF0070010Struct) list.get(i)).getw_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AF0070010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_CD == null) {
			l_w_JOB_ODR_CD = new ArrayList();
		} else {
			l_w_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_CD.add(((AF0070010Struct) list.get(i)).getw_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_CD == null) {
			l_w_WH_CD = new ArrayList();
		} else {
			l_w_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_CD.add(((AF0070010Struct) list.get(i)).getw_WH_CD());
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
			l_w_PLANT_CD.add(((AF0070010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((AF0070010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_w_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMPANY_CD == null) {
			l_w_COMPANY_CD = new ArrayList();
		} else {
			l_w_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMPANY_CD.add(((AF0070010Struct) list.get(i)).getw_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY == null) {
			l_w_JOB_ODR_STOCK_QTY = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY.add(((AF0070010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_CTRL_CD == null) {
			l_w_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_w_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_CTRL_CD.add(((AF0070010Struct) list.get(i)).getw_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_TYP == null) {
			l_w_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_w_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_TYP.add(((AF0070010Struct) list.get(i)).getw_RCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_QTY == null) {
			l_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_QTY.add(((AF0070010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_DATE == null) {
			l_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_DATE.add(((AF0070010Struct) list.get(i)).getRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_w_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_RCV_ISSUE_GNR_TYP == null) {
			l_w_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_w_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_RCV_ISSUE_GNR_TYP.add(((AF0070010Struct) list.get(i)).getw_RCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AF0070010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_w_VEND_CD.add(((AF0070010Struct) list.get(i)).getw_VEND_CD());
		}
		return size;
	}
	public int setL2L_w_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CONS_TYP == null) {
			l_w_CONS_TYP = new ArrayList();
		} else {
			l_w_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CONS_TYP.add(((AF0070010Struct) list.get(i)).getw_CONS_TYP());
		}
		return size;
	}
	public int setL2L_w_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_UPD_TYP == null) {
			l_w_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_w_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_UPD_TYP.add(((AF0070010Struct) list.get(i)).getw_STOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_PAST_RESULT_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAST_RESULT_ENTRY_TYP == null) {
			l_PAST_RESULT_ENTRY_TYP = new ArrayList();
		} else {
			l_PAST_RESULT_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAST_RESULT_ENTRY_TYP.add(((AF0070010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXEC_DATE == null) {
			l_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXEC_DATE.add(((AF0070010Struct) list.get(i)).getPROC_EXEC_DATE());
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
			l_PLANT_CD.add(((AF0070010Struct) list.get(i)).getPLANT_CD());
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
			l_l_COUNT.add(((AF0070010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AF0070010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ALC_POS_STOCK_QTY = null;
		m_RCV_ISSUE_POS_QTY = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_MRP_FLG = null;
		m_w_WH_STOCK_QTY = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_w_UNIT_QTY_TYP = null;
		m_w_ITEM_CD = null;
		m_w_JOB_ODR_CD = null;
		m_w_WH_CD = null;
		m_w_PLANT_CD = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_w_COMPANY_CD = null;
		m_w_JOB_ODR_STOCK_QTY = null;
		m_w_RCV_ISSUE_CTRL_CD = null;
		m_w_RCV_ISSUE_TYP = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_w_RCV_ISSUE_GNR_TYP = null;
		m_VEND_LOT_NO = null;
		m_w_VEND_CD = null;
		m_w_CONS_TYP = null;
		m_w_STOCK_UPD_TYP = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_PLANT_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_ALC_POS_STOCK_QTY = null;
		l_RCV_ISSUE_POS_QTY = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_MRP_FLG = null;
		l_w_WH_STOCK_QTY = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_w_UNIT_QTY_TYP = null;
		l_w_ITEM_CD = null;
		l_w_JOB_ODR_CD = null;
		l_w_WH_CD = null;
		l_w_PLANT_CD = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_w_COMPANY_CD = null;
		l_w_JOB_ODR_STOCK_QTY = null;
		l_w_RCV_ISSUE_CTRL_CD = null;
		l_w_RCV_ISSUE_TYP = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_w_RCV_ISSUE_GNR_TYP = null;
		l_VEND_LOT_NO = null;
		l_w_VEND_CD = null;
		l_w_CONS_TYP = null;
		l_w_STOCK_UPD_TYP = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_PLANT_CD = null;
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
	 * medAF0070010クラスの標準コンストラクタ
	 */
	public AF0070010Struct()
	{
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		initialize();
		//---------------------------------------------------------------------
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
	public void setStruct(AF0070010Struct struct)
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
	public void setStructM(AF0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setALC_POS_STOCK_QTY(struct.getALC_POS_STOCK_QTY());
			this.setRCV_ISSUE_POS_QTY(struct.getRCV_ISSUE_POS_QTY());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setw_WH_STOCK_QTY(struct.getw_WH_STOCK_QTY());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_UNIT_QTY_TYP(struct.getw_UNIT_QTY_TYP());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setw_JOB_ODR_STOCK_QTY(struct.getw_JOB_ODR_STOCK_QTY());
			this.setw_RCV_ISSUE_CTRL_CD(struct.getw_RCV_ISSUE_CTRL_CD());
			this.setw_RCV_ISSUE_TYP(struct.getw_RCV_ISSUE_TYP());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setw_RCV_ISSUE_GNR_TYP(struct.getw_RCV_ISSUE_GNR_TYP());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setw_CONS_TYP(struct.getw_CONS_TYP());
			this.setw_STOCK_UPD_TYP(struct.getw_STOCK_UPD_TYP());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AF0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ALC_POS_STOCK_QTY(struct.getList_ALC_POS_STOCK_QTY());
			this.setList_RCV_ISSUE_POS_QTY(struct.getList_RCV_ISSUE_POS_QTY());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_w_WH_STOCK_QTY(struct.getList_w_WH_STOCK_QTY());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_UNIT_QTY_TYP(struct.getList_w_UNIT_QTY_TYP());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_w_JOB_ODR_STOCK_QTY(struct.getList_w_JOB_ODR_STOCK_QTY());
			this.setList_w_RCV_ISSUE_CTRL_CD(struct.getList_w_RCV_ISSUE_CTRL_CD());
			this.setList_w_RCV_ISSUE_TYP(struct.getList_w_RCV_ISSUE_TYP());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_w_RCV_ISSUE_GNR_TYP(struct.getList_w_RCV_ISSUE_GNR_TYP());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_w_CONS_TYP(struct.getList_w_CONS_TYP());
			this.setList_w_STOCK_UPD_TYP(struct.getList_w_STOCK_UPD_TYP());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
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
	// 第 1 変数初期値： i_ALC_POS_STOCK_QTY


	final static String i_ALC_POS_STOCK_QTY = null;

	// 第 2 変数初期値： i_RCV_ISSUE_POS_QTY


	final static String i_RCV_ISSUE_POS_QTY = null;

	// 第 3 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 4 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 5 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 6 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 7 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 8 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 9 変数初期値： i_MRP_FLG


	final static String i_MRP_FLG = null;

	// 第 10 変数初期値： i_w_WH_STOCK_QTY


	final static String i_w_WH_STOCK_QTY = null;

	// 第 11 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 12 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 13 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 14 変数初期値： i_w_UNIT_QTY_TYP


	final static Integer i_w_UNIT_QTY_TYP = null;

	// 第 15 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 16 変数初期値： i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// 第 17 変数初期値： i_w_WH_CD


	final static String i_w_WH_CD = null;

	// 第 18 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 19 変数初期値： i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 20 変数初期値： i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// 第 21 変数初期値： i_w_JOB_ODR_STOCK_QTY


	final static String i_w_JOB_ODR_STOCK_QTY = null;

	// 第 22 変数初期値： i_w_RCV_ISSUE_CTRL_CD


	final static String i_w_RCV_ISSUE_CTRL_CD = null;

	// 第 23 変数初期値： i_w_RCV_ISSUE_TYP


	final static Integer i_w_RCV_ISSUE_TYP = null;

	// 第 24 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 25 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 26 変数初期値： i_w_RCV_ISSUE_GNR_TYP


	final static Integer i_w_RCV_ISSUE_GNR_TYP = null;

	// 第 27 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 28 変数初期値： i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// 第 29 変数初期値： i_w_CONS_TYP


	final static Integer i_w_CONS_TYP = null;

	// 第 30 変数初期値： i_w_STOCK_UPD_TYP


	final static Integer i_w_STOCK_UPD_TYP = null;

	// 第 31 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 32 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 33 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 34 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 35 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------
	public void initialize()
	{
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_w_WH_STOCK_QTY = new String("0.0");
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_w_UNIT_QTY_TYP = new Integer(0);
		m_w_ITEM_CD = null;
		m_w_JOB_ODR_CD = null;
		m_w_WH_CD = null;
		m_w_PLANT_CD = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_w_COMPANY_CD = null;
		m_w_JOB_ODR_STOCK_QTY = new String("0.0");
		m_w_RCV_ISSUE_CTRL_CD = null;
		m_w_RCV_ISSUE_TYP = new Integer(0);
		m_RCV_ISSUE_QTY = new String("0.0");
		m_RCV_ISSUE_DATE = null;
		m_w_RCV_ISSUE_GNR_TYP = new Integer(0);
		m_VEND_LOT_NO = null;
		m_w_VEND_CD = null;
		m_MRP_FLG = null;
		m_w_CONS_TYP = new Integer(0);
		m_w_STOCK_UPD_TYP = new Integer(1);
	}

	/**
	 * コピー
	 */
	public void copy(AF0070010Struct s)
	{	
		clear();
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_w_WH_STOCK_QTY != null) m_w_WH_STOCK_QTY = new String(s.m_w_WH_STOCK_QTY);
		if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
		if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
		if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
		if(s.m_w_UNIT_QTY_TYP != null) m_w_UNIT_QTY_TYP = new Integer(s.m_w_UNIT_QTY_TYP.intValue());
		if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
		if(s.m_w_JOB_ODR_CD != null) m_w_JOB_ODR_CD = new String(s.m_w_JOB_ODR_CD);
		if(s.m_w_WH_CD != null) m_w_WH_CD = new String(s.m_w_WH_CD);
		if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
		if(s.m_h_BUSINESS_OPR_DATE != null) m_h_BUSINESS_OPR_DATE = new String(s.m_h_BUSINESS_OPR_DATE);
		if(s.m_w_COMPANY_CD != null) m_w_COMPANY_CD = new String(s.m_w_COMPANY_CD);
		if(s.m_w_JOB_ODR_STOCK_QTY != null) m_w_JOB_ODR_STOCK_QTY = new String(s.m_w_JOB_ODR_STOCK_QTY);
		if(s.m_w_RCV_ISSUE_CTRL_CD != null) m_w_RCV_ISSUE_CTRL_CD = new String(s.m_w_RCV_ISSUE_CTRL_CD);
		if(s.m_w_RCV_ISSUE_TYP != null) m_w_RCV_ISSUE_TYP = new Integer(s.m_w_RCV_ISSUE_TYP.intValue());
		if(s.m_RCV_ISSUE_QTY != null) m_RCV_ISSUE_QTY = new String(s.m_RCV_ISSUE_QTY);
		if(s.m_RCV_ISSUE_DATE != null) m_RCV_ISSUE_DATE = new String(s.m_RCV_ISSUE_DATE);
		if(s.m_w_RCV_ISSUE_GNR_TYP != null) m_w_RCV_ISSUE_GNR_TYP = new Integer(s.m_w_RCV_ISSUE_GNR_TYP.intValue());
		if(s.m_VEND_LOT_NO != null) m_VEND_LOT_NO = new String(s.m_VEND_LOT_NO);
		if(s.m_w_VEND_CD != null) m_w_VEND_CD = new String(s.m_w_VEND_CD);
		if(s.m_MRP_FLG != null) m_MRP_FLG = new String(s.m_MRP_FLG);
		if(s.m_w_CONS_TYP != null) m_w_CONS_TYP = new Integer(s.m_w_CONS_TYP.intValue());
		if(s.m_w_STOCK_UPD_TYP != null) m_w_STOCK_UPD_TYP = new Integer(s.m_w_STOCK_UPD_TYP.intValue());

		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
	}

	/**
	 * コピーコンストラクタ
	 * @param struct コピー対象
	 */
	 public AF0070010Struct(AF0070010Struct struct)
	 {
	 	copy(struct);
	 }
	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
