/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0110/src/com/nec/jp/orteus/metamorBase/AE0110/AE0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0110;

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
 * CLASS     : AE0110010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.9 $ $Date: 2012/10/29 06:05:24 $
 *
 */
//}}user_implement_code_header

public class AE0110010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_r1_RETURNED_GNR_TYP */
	public String m_r1_RETURNED_GNR_TYP = null;
	/** 第 3 変数： m_r2_RETURNED_GNR_TYP */
	public String m_r2_RETURNED_GNR_TYP = null;
	/** 第 4 変数： m_r3_RETURNED_GNR_TYP */
	public String m_r3_RETURNED_GNR_TYP = null;
	/** 第 5 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 6 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 7 変数： m_l_ONEROUS_CONS_NO */
	public String m_l_ONEROUS_CONS_NO = null;
	/** 第 8 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 9 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 10 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 11 変数： m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** 第 12 変数： m_l_ISSUE_DATE */
	public String m_l_ISSUE_DATE = null;
	/** 第 13 変数： m_l_ISSUE_QTY */
	public String m_l_ISSUE_QTY = null;
	/** 第 14 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 15 変数： m_l_VEND_LOT_NO */
	public String m_l_VEND_LOT_NO = null;
	/** 第 16 変数： m_l_RCV_ISSUE_CTRL_CD */
	public String m_l_RCV_ISSUE_CTRL_CD = null;
	/** 第 17 変数： m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** 第 18 変数： m_l_WORK_IN_PROC_CD */
	public String m_l_WORK_IN_PROC_CD = null;
	/** 第 19 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 20 変数： m_l_RETURNED_WH_CD */
	public String m_l_RETURNED_WH_CD = null;
	/** 第 21 変数： m_l_RETURNED_CAUSE_CD */
	public String m_l_RETURNED_CAUSE_CD = null;
	/** 第 22 変数： m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** 第 23 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 24 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 25 変数： m_l_WH_NAME */
	public String m_l_WH_NAME = null;
	/** 第 26 変数： m_l_CUR_UNIT */
	public String m_l_CUR_UNIT = null;
	/** 第 27 変数： m_l_RETURNED_GNR_TYP_DN */
	public String m_l_RETURNED_GNR_TYP_DN = null;
	/** 第 28 変数： m_l_AP_PROC_TYP_DN */
	public String m_l_AP_PROC_TYP_DN = null;
	/** 第 29 変数： m_l_UNIT_COST_DN */
	public String m_l_UNIT_COST_DN = null;
	/** 第 30 変数： m_l_ISSUE_INST_CD */
	public String m_l_ISSUE_INST_CD = null;
	/** 第 31 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 32 変数： m_ISSUE_DATE_FROM */
	public String m_ISSUE_DATE_FROM = null;
	/** 第 33 変数： m_ISSUE_DATE_TO */
	public String m_ISSUE_DATE_TO = null;
	/** 第 34 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 35 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 36 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 37 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 38 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 39 変数： m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** 第 40 変数： m_RETURNED_GNR_TYP1 */
	public String m_RETURNED_GNR_TYP1 = null;
	/** 第 41 変数： m_RETURNED_GNR_TYP2 */
	public String m_RETURNED_GNR_TYP2 = null;
	/** 第 42 変数： m_w_ONEROUS_CONS_NO */
	public String m_w_ONEROUS_CONS_NO = null;
	/** 第 43 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 44 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 45 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 46 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 47 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_r1_RETURNED_GNR_TYP */
	public List l_r1_RETURNED_GNR_TYP = null;

	/** 第 3 List変数： l_r2_RETURNED_GNR_TYP */
	public List l_r2_RETURNED_GNR_TYP = null;

	/** 第 4 List変数： l_r3_RETURNED_GNR_TYP */
	public List l_r3_RETURNED_GNR_TYP = null;

	/** 第 5 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 6 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 7 List変数： l_l_ONEROUS_CONS_NO */
	public List l_l_ONEROUS_CONS_NO = null;

	/** 第 8 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 9 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 10 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 11 List変数： l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** 第 12 List変数： l_l_ISSUE_DATE */
	public List l_l_ISSUE_DATE = null;

	/** 第 13 List変数： l_l_ISSUE_QTY */
	public List l_l_ISSUE_QTY = null;

	/** 第 14 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 15 List変数： l_l_VEND_LOT_NO */
	public List l_l_VEND_LOT_NO = null;

	/** 第 16 List変数： l_l_RCV_ISSUE_CTRL_CD */
	public List l_l_RCV_ISSUE_CTRL_CD = null;

	/** 第 17 List変数： l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** 第 18 List変数： l_l_WORK_IN_PROC_CD */
	public List l_l_WORK_IN_PROC_CD = null;

	/** 第 19 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 20 List変数： l_l_RETURNED_WH_CD */
	public List l_l_RETURNED_WH_CD = null;

	/** 第 21 List変数： l_l_RETURNED_CAUSE_CD */
	public List l_l_RETURNED_CAUSE_CD = null;

	/** 第 22 List変数： l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** 第 23 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 24 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 25 List変数： l_l_WH_NAME */
	public List l_l_WH_NAME = null;

	/** 第 26 List変数： l_l_CUR_UNIT */
	public List l_l_CUR_UNIT = null;

	/** 第 27 List変数： l_l_RETURNED_GNR_TYP_DN */
	public List l_l_RETURNED_GNR_TYP_DN = null;

	/** 第 28 List変数： l_l_AP_PROC_TYP_DN */
	public List l_l_AP_PROC_TYP_DN = null;

	/** 第 29 List変数： l_l_UNIT_COST_DN */
	public List l_l_UNIT_COST_DN = null;

	/** 第 30 List変数： l_l_ISSUE_INST_CD */
	public List l_l_ISSUE_INST_CD = null;

	/** 第 31 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 32 List変数： l_ISSUE_DATE_FROM */
	public List l_ISSUE_DATE_FROM = null;

	/** 第 33 List変数： l_ISSUE_DATE_TO */
	public List l_ISSUE_DATE_TO = null;

	/** 第 34 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 35 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 36 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 37 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 38 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 39 List変数： l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** 第 40 List変数： l_RETURNED_GNR_TYP1 */
	public List l_RETURNED_GNR_TYP1 = null;

	/** 第 41 List変数： l_RETURNED_GNR_TYP2 */
	public List l_RETURNED_GNR_TYP2 = null;

	/** 第 42 List変数： l_w_ONEROUS_CONS_NO */
	public List l_w_ONEROUS_CONS_NO = null;

	/** 第 43 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 44 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 45 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 46 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 47 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getr1_RETURNED_GNR_TYP() { return m_r1_RETURNED_GNR_TYP; }
	public String getr2_RETURNED_GNR_TYP() { return m_r2_RETURNED_GNR_TYP; }
	public String getr3_RETURNED_GNR_TYP() { return m_r3_RETURNED_GNR_TYP; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_ONEROUS_CONS_NO() { return m_l_ONEROUS_CONS_NO; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_ISSUE_DATE() { return m_l_ISSUE_DATE; }
	public String getl_ISSUE_QTY() { return m_l_ISSUE_QTY; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_VEND_LOT_NO() { return m_l_VEND_LOT_NO; }
	public String getl_RCV_ISSUE_CTRL_CD() { return m_l_RCV_ISSUE_CTRL_CD; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String getl_WORK_IN_PROC_CD() { return m_l_WORK_IN_PROC_CD; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_RETURNED_WH_CD() { return m_l_RETURNED_WH_CD; }
	public String getl_RETURNED_CAUSE_CD() { return m_l_RETURNED_CAUSE_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_WH_NAME() { return m_l_WH_NAME; }
	public String getl_CUR_UNIT() { return m_l_CUR_UNIT; }
	public String getl_RETURNED_GNR_TYP_DN() { return m_l_RETURNED_GNR_TYP_DN; }
	public String getl_AP_PROC_TYP_DN() { return m_l_AP_PROC_TYP_DN; }
	public String getl_UNIT_COST_DN() { return m_l_UNIT_COST_DN; }
	public String getl_ISSUE_INST_CD() { return m_l_ISSUE_INST_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getISSUE_DATE_FROM() { return m_ISSUE_DATE_FROM; }
	public String getISSUE_DATE_TO() { return m_ISSUE_DATE_TO; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getRETURNED_GNR_TYP1() { return m_RETURNED_GNR_TYP1; }
	public String getRETURNED_GNR_TYP2() { return m_RETURNED_GNR_TYP2; }
	public String getw_ONEROUS_CONS_NO() { return m_w_ONEROUS_CONS_NO; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_r1_RETURNED_GNR_TYP() { return l_r1_RETURNED_GNR_TYP; }
	public List getList_r2_RETURNED_GNR_TYP() { return l_r2_RETURNED_GNR_TYP; }
	public List getList_r3_RETURNED_GNR_TYP() { return l_r3_RETURNED_GNR_TYP; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_ONEROUS_CONS_NO() { return l_l_ONEROUS_CONS_NO; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_ISSUE_DATE() { return l_l_ISSUE_DATE; }
	public List getList_l_ISSUE_QTY() { return l_l_ISSUE_QTY; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_VEND_LOT_NO() { return l_l_VEND_LOT_NO; }
	public List getList_l_RCV_ISSUE_CTRL_CD() { return l_l_RCV_ISSUE_CTRL_CD; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_l_WORK_IN_PROC_CD() { return l_l_WORK_IN_PROC_CD; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_RETURNED_WH_CD() { return l_l_RETURNED_WH_CD; }
	public List getList_l_RETURNED_CAUSE_CD() { return l_l_RETURNED_CAUSE_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_WH_NAME() { return l_l_WH_NAME; }
	public List getList_l_CUR_UNIT() { return l_l_CUR_UNIT; }
	public List getList_l_RETURNED_GNR_TYP_DN() { return l_l_RETURNED_GNR_TYP_DN; }
	public List getList_l_AP_PROC_TYP_DN() { return l_l_AP_PROC_TYP_DN; }
	public List getList_l_UNIT_COST_DN() { return l_l_UNIT_COST_DN; }
	public List getList_l_ISSUE_INST_CD() { return l_l_ISSUE_INST_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ISSUE_DATE_FROM() { return l_ISSUE_DATE_FROM; }
	public List getList_ISSUE_DATE_TO() { return l_ISSUE_DATE_TO; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_RETURNED_GNR_TYP1() { return l_RETURNED_GNR_TYP1; }
	public List getList_RETURNED_GNR_TYP2() { return l_RETURNED_GNR_TYP2; }
	public List getList_w_ONEROUS_CONS_NO() { return l_w_ONEROUS_CONS_NO; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setr1_RETURNED_GNR_TYP(String val) { m_r1_RETURNED_GNR_TYP = val; }
	public void setr2_RETURNED_GNR_TYP(String val) { m_r2_RETURNED_GNR_TYP = val; }
	public void setr3_RETURNED_GNR_TYP(String val) { m_r3_RETURNED_GNR_TYP = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_ONEROUS_CONS_NO(String val) { m_l_ONEROUS_CONS_NO = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_ISSUE_DATE(String val) { m_l_ISSUE_DATE = val; }
	public void setl_ISSUE_QTY(String val) { m_l_ISSUE_QTY = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_VEND_LOT_NO(String val) { m_l_VEND_LOT_NO = val; }
	public void setl_RCV_ISSUE_CTRL_CD(String val) { m_l_RCV_ISSUE_CTRL_CD = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void setl_WORK_IN_PROC_CD(String val) { m_l_WORK_IN_PROC_CD = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_RETURNED_WH_CD(String val) { m_l_RETURNED_WH_CD = val; }
	public void setl_RETURNED_CAUSE_CD(String val) { m_l_RETURNED_CAUSE_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_WH_NAME(String val) { m_l_WH_NAME = val; }
	public void setl_CUR_UNIT(String val) { m_l_CUR_UNIT = val; }
	public void setl_RETURNED_GNR_TYP_DN(String val) { m_l_RETURNED_GNR_TYP_DN = val; }
	public void setl_AP_PROC_TYP_DN(String val) { m_l_AP_PROC_TYP_DN = val; }
	public void setl_UNIT_COST_DN(String val) { m_l_UNIT_COST_DN = val; }
	public void setl_ISSUE_INST_CD(String val) { m_l_ISSUE_INST_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setISSUE_DATE_FROM(String val) { m_ISSUE_DATE_FROM = val; }
	public void setISSUE_DATE_TO(String val) { m_ISSUE_DATE_TO = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setRETURNED_GNR_TYP1(String val) { m_RETURNED_GNR_TYP1 = val; }
	public void setRETURNED_GNR_TYP2(String val) { m_RETURNED_GNR_TYP2 = val; }
	public void setw_ONEROUS_CONS_NO(String val) { m_w_ONEROUS_CONS_NO = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_r1_RETURNED_GNR_TYP(List list) { l_r1_RETURNED_GNR_TYP = list; }
	public void setList_r2_RETURNED_GNR_TYP(List list) { l_r2_RETURNED_GNR_TYP = list; }
	public void setList_r3_RETURNED_GNR_TYP(List list) { l_r3_RETURNED_GNR_TYP = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_ONEROUS_CONS_NO(List list) { l_l_ONEROUS_CONS_NO = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_ISSUE_DATE(List list) { l_l_ISSUE_DATE = list; }
	public void setList_l_ISSUE_QTY(List list) { l_l_ISSUE_QTY = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_VEND_LOT_NO(List list) { l_l_VEND_LOT_NO = list; }
	public void setList_l_RCV_ISSUE_CTRL_CD(List list) { l_l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_l_WORK_IN_PROC_CD(List list) { l_l_WORK_IN_PROC_CD = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_RETURNED_WH_CD(List list) { l_l_RETURNED_WH_CD = list; }
	public void setList_l_RETURNED_CAUSE_CD(List list) { l_l_RETURNED_CAUSE_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_WH_NAME(List list) { l_l_WH_NAME = list; }
	public void setList_l_CUR_UNIT(List list) { l_l_CUR_UNIT = list; }
	public void setList_l_RETURNED_GNR_TYP_DN(List list) { l_l_RETURNED_GNR_TYP_DN = list; }
	public void setList_l_AP_PROC_TYP_DN(List list) { l_l_AP_PROC_TYP_DN = list; }
	public void setList_l_UNIT_COST_DN(List list) { l_l_UNIT_COST_DN = list; }
	public void setList_l_ISSUE_INST_CD(List list) { l_l_ISSUE_INST_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ISSUE_DATE_FROM(List list) { l_ISSUE_DATE_FROM = list; }
	public void setList_ISSUE_DATE_TO(List list) { l_ISSUE_DATE_TO = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_RETURNED_GNR_TYP1(List list) { l_RETURNED_GNR_TYP1 = list; }
	public void setList_RETURNED_GNR_TYP2(List list) { l_RETURNED_GNR_TYP2 = list; }
	public void setList_w_ONEROUS_CONS_NO(List list) { l_w_ONEROUS_CONS_NO = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_DOWNLOAD_FILE.add(((AE0110010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_r1_RETURNED_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_RETURNED_GNR_TYP == null) {
			l_r1_RETURNED_GNR_TYP = new ArrayList();
		} else {
			l_r1_RETURNED_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_RETURNED_GNR_TYP.add(((AE0110010Struct) list.get(i)).getr1_RETURNED_GNR_TYP());
		}
		return size;
	}
	public int setL2L_r2_RETURNED_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_RETURNED_GNR_TYP == null) {
			l_r2_RETURNED_GNR_TYP = new ArrayList();
		} else {
			l_r2_RETURNED_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_RETURNED_GNR_TYP.add(((AE0110010Struct) list.get(i)).getr2_RETURNED_GNR_TYP());
		}
		return size;
	}
	public int setL2L_r3_RETURNED_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_RETURNED_GNR_TYP == null) {
			l_r3_RETURNED_GNR_TYP = new ArrayList();
		} else {
			l_r3_RETURNED_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_RETURNED_GNR_TYP.add(((AE0110010Struct) list.get(i)).getr3_RETURNED_GNR_TYP());
		}
		return size;
	}
	public int setL2L_h_lotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotCtrl == null) {
			l_h_lotCtrl = new ArrayList();
		} else {
			l_h_lotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotCtrl.add(((AE0110010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AE0110010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ONEROUS_CONS_NO == null) {
			l_l_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_l_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ONEROUS_CONS_NO.add(((AE0110010Struct) list.get(i)).getl_ONEROUS_CONS_NO());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AE0110010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CD == null) {
			l_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CD.add(((AE0110010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_CD == null) {
			l_l_ITEM_CD = new ArrayList();
		} else {
			l_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_CD.add(((AE0110010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOT_NO == null) {
			l_l_LOT_NO = new ArrayList();
		} else {
			l_l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOT_NO.add(((AE0110010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_DATE == null) {
			l_l_ISSUE_DATE = new ArrayList();
		} else {
			l_l_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_DATE.add(((AE0110010Struct) list.get(i)).getl_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_QTY == null) {
			l_l_ISSUE_QTY = new ArrayList();
		} else {
			l_l_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_QTY.add(((AE0110010Struct) list.get(i)).getl_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST == null) {
			l_l_UNIT_COST = new ArrayList();
		} else {
			l_l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST.add(((AE0110010Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_LOT_NO == null) {
			l_l_VEND_LOT_NO = new ArrayList();
		} else {
			l_l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_LOT_NO.add(((AE0110010Struct) list.get(i)).getl_VEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RCV_ISSUE_CTRL_CD == null) {
			l_l_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_l_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RCV_ISSUE_CTRL_CD.add(((AE0110010Struct) list.get(i)).getl_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_CD == null) {
			l_l_WORK_ODR_CD = new ArrayList();
		} else {
			l_l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_CD.add(((AE0110010Struct) list.get(i)).getl_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_IN_PROC_CD == null) {
			l_l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_IN_PROC_CD.add(((AE0110010Struct) list.get(i)).getl_WORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AE0110010Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_RETURNED_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RETURNED_WH_CD == null) {
			l_l_RETURNED_WH_CD = new ArrayList();
		} else {
			l_l_RETURNED_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RETURNED_WH_CD.add(((AE0110010Struct) list.get(i)).getl_RETURNED_WH_CD());
		}
		return size;
	}
	public int setL2L_l_RETURNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RETURNED_CAUSE_CD == null) {
			l_l_RETURNED_CAUSE_CD = new ArrayList();
		} else {
			l_l_RETURNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RETURNED_CAUSE_CD.add(((AE0110010Struct) list.get(i)).getl_RETURNED_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AE0110010Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_NAME == null) {
			l_l_ITEM_NAME = new ArrayList();
		} else {
			l_l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_NAME.add(((AE0110010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_UNIT == null) {
			l_l_STOCK_UNIT = new ArrayList();
		} else {
			l_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_UNIT.add(((AE0110010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_NAME == null) {
			l_l_WH_NAME = new ArrayList();
		} else {
			l_l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_NAME.add(((AE0110010Struct) list.get(i)).getl_WH_NAME());
		}
		return size;
	}
	public int setL2L_l_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUR_UNIT == null) {
			l_l_CUR_UNIT = new ArrayList();
		} else {
			l_l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUR_UNIT.add(((AE0110010Struct) list.get(i)).getl_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_RETURNED_GNR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RETURNED_GNR_TYP_DN == null) {
			l_l_RETURNED_GNR_TYP_DN = new ArrayList();
		} else {
			l_l_RETURNED_GNR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RETURNED_GNR_TYP_DN.add(((AE0110010Struct) list.get(i)).getl_RETURNED_GNR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_AP_PROC_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AP_PROC_TYP_DN == null) {
			l_l_AP_PROC_TYP_DN = new ArrayList();
		} else {
			l_l_AP_PROC_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AP_PROC_TYP_DN.add(((AE0110010Struct) list.get(i)).getl_AP_PROC_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_DN == null) {
			l_l_UNIT_COST_DN = new ArrayList();
		} else {
			l_l_UNIT_COST_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_DN.add(((AE0110010Struct) list.get(i)).getl_UNIT_COST_DN());
		}
		return size;
	}
	public int setL2L_l_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_INST_CD == null) {
			l_l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_INST_CD.add(((AE0110010Struct) list.get(i)).getl_ISSUE_INST_CD());
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
			l_PLANT_CD.add(((AE0110010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE_FROM == null) {
			l_ISSUE_DATE_FROM = new ArrayList();
		} else {
			l_ISSUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE_FROM.add(((AE0110010Struct) list.get(i)).getISSUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE_TO == null) {
			l_ISSUE_DATE_TO = new ArrayList();
		} else {
			l_ISSUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE_TO.add(((AE0110010Struct) list.get(i)).getISSUE_DATE_TO());
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
			l_VEND_CD.add(((AE0110010Struct) list.get(i)).getVEND_CD());
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
			l_ITEM_CD.add(((AE0110010Struct) list.get(i)).getITEM_CD());
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
			l_JOB_ODR_CD.add(((AE0110010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AE0110010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_CD == null) {
			l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_CD.add(((AE0110010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_NO == null) {
			l_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_NO.add(((AE0110010Struct) list.get(i)).getONEROUS_CONS_NO());
		}
		return size;
	}
	public int setL2L_RETURNED_GNR_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_GNR_TYP1 == null) {
			l_RETURNED_GNR_TYP1 = new ArrayList();
		} else {
			l_RETURNED_GNR_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_GNR_TYP1.add(((AE0110010Struct) list.get(i)).getRETURNED_GNR_TYP1());
		}
		return size;
	}
	public int setL2L_RETURNED_GNR_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_GNR_TYP2 == null) {
			l_RETURNED_GNR_TYP2 = new ArrayList();
		} else {
			l_RETURNED_GNR_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_GNR_TYP2.add(((AE0110010Struct) list.get(i)).getRETURNED_GNR_TYP2());
		}
		return size;
	}
	public int setL2L_w_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ONEROUS_CONS_NO == null) {
			l_w_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_w_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ONEROUS_CONS_NO.add(((AE0110010Struct) list.get(i)).getw_ONEROUS_CONS_NO());
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
			l_PLANT_NAME.add(((AE0110010Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_NAME.add(((AE0110010Struct) list.get(i)).getVEND_NAME());
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
			l_ITEM_NAME.add(((AE0110010Struct) list.get(i)).getITEM_NAME());
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
			l_l_COUNT.add(((AE0110010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0110010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_r1_RETURNED_GNR_TYP = null;
		m_r2_RETURNED_GNR_TYP = null;
		m_r3_RETURNED_GNR_TYP = null;
		m_h_lotCtrl = null;
		m_l_PLANT_CD = null;
		m_l_ONEROUS_CONS_NO = null;
		m_l_VEND_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_ITEM_CD = null;
		m_l_LOT_NO = null;
		m_l_ISSUE_DATE = null;
		m_l_ISSUE_QTY = null;
		m_l_UNIT_COST = null;
		m_l_VEND_LOT_NO = null;
		m_l_RCV_ISSUE_CTRL_CD = null;
		m_l_WORK_ODR_CD = null;
		m_l_WORK_IN_PROC_CD = null;
		m_l_PUCH_ODR_CD = null;
		m_l_RETURNED_WH_CD = null;
		m_l_RETURNED_CAUSE_CD = null;
		m_l_VEND_ANAME = null;
		m_l_ITEM_NAME = null;
		m_l_STOCK_UNIT = null;
		m_l_WH_NAME = null;
		m_l_CUR_UNIT = null;
		m_l_RETURNED_GNR_TYP_DN = null;
		m_l_AP_PROC_TYP_DN = null;
		m_l_UNIT_COST_DN = null;
		m_l_ISSUE_INST_CD = null;
		m_PLANT_CD = null;
		m_ISSUE_DATE_FROM = null;
		m_ISSUE_DATE_TO = null;
		m_VEND_CD = null;
		m_ITEM_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_ONEROUS_CONS_NO = null;
		m_RETURNED_GNR_TYP1 = null;
		m_RETURNED_GNR_TYP2 = null;
		m_w_ONEROUS_CONS_NO = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_ITEM_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_r1_RETURNED_GNR_TYP = null;
		l_r2_RETURNED_GNR_TYP = null;
		l_r3_RETURNED_GNR_TYP = null;
		l_h_lotCtrl = null;
		l_l_PLANT_CD = null;
		l_l_ONEROUS_CONS_NO = null;
		l_l_VEND_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_ITEM_CD = null;
		l_l_LOT_NO = null;
		l_l_ISSUE_DATE = null;
		l_l_ISSUE_QTY = null;
		l_l_UNIT_COST = null;
		l_l_VEND_LOT_NO = null;
		l_l_RCV_ISSUE_CTRL_CD = null;
		l_l_WORK_ODR_CD = null;
		l_l_WORK_IN_PROC_CD = null;
		l_l_PUCH_ODR_CD = null;
		l_l_RETURNED_WH_CD = null;
		l_l_RETURNED_CAUSE_CD = null;
		l_l_VEND_ANAME = null;
		l_l_ITEM_NAME = null;
		l_l_STOCK_UNIT = null;
		l_l_WH_NAME = null;
		l_l_CUR_UNIT = null;
		l_l_RETURNED_GNR_TYP_DN = null;
		l_l_AP_PROC_TYP_DN = null;
		l_l_UNIT_COST_DN = null;
		l_l_ISSUE_INST_CD = null;
		l_PLANT_CD = null;
		l_ISSUE_DATE_FROM = null;
		l_ISSUE_DATE_TO = null;
		l_VEND_CD = null;
		l_ITEM_CD = null;
		l_JOB_ODR_CD = null;
		l_PUCH_ODR_CD = null;
		l_ISSUE_INST_CD = null;
		l_ONEROUS_CONS_NO = null;
		l_RETURNED_GNR_TYP1 = null;
		l_RETURNED_GNR_TYP2 = null;
		l_w_ONEROUS_CONS_NO = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_ITEM_NAME = null;
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
	 * medAE0110010クラスの標準コンストラクタ
	 */
	public AE0110010Struct()
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
	public void setStruct(AE0110010Struct struct)
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
	public void setStructM(AE0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setr1_RETURNED_GNR_TYP(struct.getr1_RETURNED_GNR_TYP());
			this.setr2_RETURNED_GNR_TYP(struct.getr2_RETURNED_GNR_TYP());
			this.setr3_RETURNED_GNR_TYP(struct.getr3_RETURNED_GNR_TYP());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_ONEROUS_CONS_NO(struct.getl_ONEROUS_CONS_NO());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_ISSUE_DATE(struct.getl_ISSUE_DATE());
			this.setl_ISSUE_QTY(struct.getl_ISSUE_QTY());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_VEND_LOT_NO(struct.getl_VEND_LOT_NO());
			this.setl_RCV_ISSUE_CTRL_CD(struct.getl_RCV_ISSUE_CTRL_CD());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.setl_WORK_IN_PROC_CD(struct.getl_WORK_IN_PROC_CD());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_RETURNED_WH_CD(struct.getl_RETURNED_WH_CD());
			this.setl_RETURNED_CAUSE_CD(struct.getl_RETURNED_CAUSE_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_WH_NAME(struct.getl_WH_NAME());
			this.setl_CUR_UNIT(struct.getl_CUR_UNIT());
			this.setl_RETURNED_GNR_TYP_DN(struct.getl_RETURNED_GNR_TYP_DN());
			this.setl_AP_PROC_TYP_DN(struct.getl_AP_PROC_TYP_DN());
			this.setl_UNIT_COST_DN(struct.getl_UNIT_COST_DN());
			this.setl_ISSUE_INST_CD(struct.getl_ISSUE_INST_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setISSUE_DATE_FROM(struct.getISSUE_DATE_FROM());
			this.setISSUE_DATE_TO(struct.getISSUE_DATE_TO());
			this.setVEND_CD(struct.getVEND_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setRETURNED_GNR_TYP1(struct.getRETURNED_GNR_TYP1());
			this.setRETURNED_GNR_TYP2(struct.getRETURNED_GNR_TYP2());
			this.setw_ONEROUS_CONS_NO(struct.getw_ONEROUS_CONS_NO());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_r1_RETURNED_GNR_TYP(struct.getList_r1_RETURNED_GNR_TYP());
			this.setList_r2_RETURNED_GNR_TYP(struct.getList_r2_RETURNED_GNR_TYP());
			this.setList_r3_RETURNED_GNR_TYP(struct.getList_r3_RETURNED_GNR_TYP());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_ONEROUS_CONS_NO(struct.getList_l_ONEROUS_CONS_NO());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_ISSUE_DATE(struct.getList_l_ISSUE_DATE());
			this.setList_l_ISSUE_QTY(struct.getList_l_ISSUE_QTY());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_VEND_LOT_NO(struct.getList_l_VEND_LOT_NO());
			this.setList_l_RCV_ISSUE_CTRL_CD(struct.getList_l_RCV_ISSUE_CTRL_CD());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_l_WORK_IN_PROC_CD(struct.getList_l_WORK_IN_PROC_CD());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_RETURNED_WH_CD(struct.getList_l_RETURNED_WH_CD());
			this.setList_l_RETURNED_CAUSE_CD(struct.getList_l_RETURNED_CAUSE_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_WH_NAME(struct.getList_l_WH_NAME());
			this.setList_l_CUR_UNIT(struct.getList_l_CUR_UNIT());
			this.setList_l_RETURNED_GNR_TYP_DN(struct.getList_l_RETURNED_GNR_TYP_DN());
			this.setList_l_AP_PROC_TYP_DN(struct.getList_l_AP_PROC_TYP_DN());
			this.setList_l_UNIT_COST_DN(struct.getList_l_UNIT_COST_DN());
			this.setList_l_ISSUE_INST_CD(struct.getList_l_ISSUE_INST_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ISSUE_DATE_FROM(struct.getList_ISSUE_DATE_FROM());
			this.setList_ISSUE_DATE_TO(struct.getList_ISSUE_DATE_TO());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_RETURNED_GNR_TYP1(struct.getList_RETURNED_GNR_TYP1());
			this.setList_RETURNED_GNR_TYP2(struct.getList_RETURNED_GNR_TYP2());
			this.setList_w_ONEROUS_CONS_NO(struct.getList_w_ONEROUS_CONS_NO());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
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
	// 第 1 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_r1_RETURNED_GNR_TYP


	final static String i_r1_RETURNED_GNR_TYP = null;

	// 第 3 変数初期値： i_r2_RETURNED_GNR_TYP


	final static String i_r2_RETURNED_GNR_TYP = null;

	// 第 4 変数初期値： i_r3_RETURNED_GNR_TYP


	final static String i_r3_RETURNED_GNR_TYP = null;

	// 第 5 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 6 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 7 変数初期値： i_l_ONEROUS_CONS_NO


	final static String i_l_ONEROUS_CONS_NO = null;

	// 第 8 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 9 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 10 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 11 変数初期値： i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// 第 12 変数初期値： i_l_ISSUE_DATE


	final static String i_l_ISSUE_DATE = null;

	// 第 13 変数初期値： i_l_ISSUE_QTY


	final static String i_l_ISSUE_QTY = null;

	// 第 14 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 15 変数初期値： i_l_VEND_LOT_NO


	final static String i_l_VEND_LOT_NO = null;

	// 第 16 変数初期値： i_l_RCV_ISSUE_CTRL_CD


	final static String i_l_RCV_ISSUE_CTRL_CD = null;

	// 第 17 変数初期値： i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// 第 18 変数初期値： i_l_WORK_IN_PROC_CD


	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 19 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 20 変数初期値： i_l_RETURNED_WH_CD


	final static String i_l_RETURNED_WH_CD = null;

	// 第 21 変数初期値： i_l_RETURNED_CAUSE_CD


	final static String i_l_RETURNED_CAUSE_CD = null;

	// 第 22 変数初期値： i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// 第 23 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 24 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 25 変数初期値： i_l_WH_NAME


	final static String i_l_WH_NAME = null;

	// 第 26 変数初期値： i_l_CUR_UNIT


	final static String i_l_CUR_UNIT = null;

	// 第 27 変数初期値： i_l_RETURNED_GNR_TYP_DN


	final static String i_l_RETURNED_GNR_TYP_DN = null;

	// 第 28 変数初期値： i_l_AP_PROC_TYP_DN


	final static String i_l_AP_PROC_TYP_DN = null;

	// 第 29 変数初期値： i_l_UNIT_COST_DN


	final static String i_l_UNIT_COST_DN = null;

	// 第 30 変数初期値： i_l_ISSUE_INST_CD


	final static String i_l_ISSUE_INST_CD = null;

	// 第 31 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 32 変数初期値： i_ISSUE_DATE_FROM


	final static String i_ISSUE_DATE_FROM = null;

	// 第 33 変数初期値： i_ISSUE_DATE_TO


	final static String i_ISSUE_DATE_TO = null;

	// 第 34 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 35 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 36 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 37 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 38 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 39 変数初期値： i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// 第 40 変数初期値： i_RETURNED_GNR_TYP1


	final static String i_RETURNED_GNR_TYP1 = null;

	// 第 41 変数初期値： i_RETURNED_GNR_TYP2


	final static String i_RETURNED_GNR_TYP2 = null;

	// 第 42 変数初期値： i_w_ONEROUS_CONS_NO


	final static String i_w_ONEROUS_CONS_NO = null;

	// 第 43 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 44 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 45 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 46 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 47 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 2 変数初期値： i_ISSUE_DATE_FROM

	final static String i_ISSUE_DATE_FROM = null;

	// 第 3 変数初期値： i_ISSUE_DATE_TO

	final static String i_ISSUE_DATE_TO = null;

	// 第 4 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 5 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 6 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 7 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 8 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 9 変数初期値： i_r1_RETURNED_GNR_TYP

	final static String i_r1_RETURNED_GNR_TYP = null;

	// 第 10 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 11 変数初期値： i_r2_ACPT_STS_TYP

	final static String i_r2_ACPT_STS_TYP = null;

	// 第 12 変数初期値： i_r3_ACPT_STS_TYP

	final static String i_r3_ACPT_STS_TYP = null;

	// 第 13 変数初期値： i_ONEROUS_CONS_NO

	final static String i_ONEROUS_CONS_NO = null;

	// 第 14 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 15 変数初期値： i_l_ONEROUS_CONS_NO

	final static String i_l_ONEROUS_CONS_NO = null;

	// 第 16 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 17 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 18 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 19 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 20 変数初期値： i_l_ISSUE_DATE

	final static String i_l_ISSUE_DATE = null;

	// 第 21 変数初期値： i_l_UNIT_COST_DN

	final static String i_l_UNIT_COST_DN = null;

	// 第 22 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 23 変数初期値： i_l_RETURNED_GNR_TYP_DN

	final static String i_l_RETURNED_GNR_TYP_DN = null;

	// 第 24 変数初期値： i_l_AP_PROC_TYP_DN

	final static String i_l_AP_PROC_TYP_DN = null;

	// 第 25 変数初期値： i_ISSUE_INST_CD

	final static String i_ISSUE_INST_CD = null;

	// 第 26 変数初期値： i_l_ISSUE_QTY

	final static String i_l_ISSUE_QTY = null;

	// 第 27 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 28 変数初期値： i_l_VEND_LOT_NO

	final static String i_l_VEND_LOT_NO = null;

	// 第 29 変数初期値： i_l_RCV_ISSUE_CTRL_CD

	final static String i_l_RCV_ISSUE_CTRL_CD = null;

	// 第 30 変数初期値： i_l_WORK_ODR_CD

	final static String i_l_WORK_ODR_CD = null;

	// 第 31 変数初期値： i_l_WORK_IN_PROC_CD

	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 32 変数初期値： i_l_RETURNED_WH_CD

	final static String i_l_RETURNED_WH_CD = null;

	// 第 33 変数初期値： i_l_RETURNED_CAUSE_CD

	final static String i_l_RETURNED_CAUSE_CD = null;

	// 第 34 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 35 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 36 変数初期値： i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// 第 37 変数初期値： i_l_UNIT_QTY_TYP

	final static String i_l_UNIT_QTY_TYP = null;

	// 第 38 変数初期値： i_l_CUR_UNIT

	final static String i_l_CUR_UNIT = null;

	// 第 39 変数初期値： i_l_WH_NAME

	final static String i_l_WH_NAME = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_PLANT_CD = i_PLANT_CD;
		m_ISSUE_DATE_FROM = i_ISSUE_DATE_FROM;
		m_ISSUE_DATE_TO = i_ISSUE_DATE_TO;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_VEND_CD = i_VEND_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_r1_RETURNED_GNR_TYP = i_r1_RETURNED_GNR_TYP;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
//		m_r2_ACPT_STS_TYP = i_r2_ACPT_STS_TYP;
//		m_r3_ACPT_STS_TYP = i_r3_ACPT_STS_TYP;
		m_ONEROUS_CONS_NO = i_ONEROUS_CONS_NO;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_ONEROUS_CONS_NO = i_l_ONEROUS_CONS_NO;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_ISSUE_DATE = i_l_ISSUE_DATE;
		m_l_UNIT_COST_DN = i_l_UNIT_COST_DN;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_RETURNED_GNR_TYP_DN = i_l_RETURNED_GNR_TYP_DN;
		m_l_AP_PROC_TYP_DN = i_l_AP_PROC_TYP_DN;
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_l_ISSUE_QTY = i_l_ISSUE_QTY;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_VEND_LOT_NO = i_l_VEND_LOT_NO;
		m_l_RCV_ISSUE_CTRL_CD = i_l_RCV_ISSUE_CTRL_CD;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_l_WORK_IN_PROC_CD = i_l_WORK_IN_PROC_CD;
		m_l_RETURNED_WH_CD = i_l_RETURNED_WH_CD;
		m_l_RETURNED_CAUSE_CD = i_l_RETURNED_CAUSE_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
//		m_l_UNIT_QTY_TYP = i_l_UNIT_QTY_TYP;
		m_l_CUR_UNIT = i_l_CUR_UNIT;
		m_l_WH_NAME = i_l_WH_NAME;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
