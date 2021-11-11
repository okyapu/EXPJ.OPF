/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0020/src/com/nec/jp/orteus/metamorBase/AG0020/AG0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0020;

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

public class AG0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r_SELECT_CHOICE1 */
	public String m_r_SELECT_CHOICE1 = null;
	/** 第 2 変数： m_r_SELECT_CHOICE2 */
	public String m_r_SELECT_CHOICE2 = null;
	/** 第 3 変数： m_r_SELECT_CHOICE3 */
	public String m_r_SELECT_CHOICE3 = null;
	/** 第 4 変数： m_r_SELECT_CHOICE */
	public String m_r_SELECT_CHOICE = null;
	/** 第 5 変数： m_RCV_ISSUE_CMPLT_NAME */
	public String m_RCV_ISSUE_CMPLT_NAME = null;
	/** 第 6 変数： m_RCV_ISSUE_GNR_NAME */
	public String m_RCV_ISSUE_GNR_NAME = null;
	/** 第 7 変数： m_STOCK_UPD_NAME */
	public String m_STOCK_UPD_NAME = null;
	/** 第 8 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 9 変数： m_RCV_ISSUE_NAME */
	public String m_RCV_ISSUE_NAME = null;
	/** 第 10 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 11 変数： m_l_check */
	public String m_l_check = null;
	/** 第 12 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 13 変数： m_w_CHOICE */
	public String m_w_CHOICE = null;
	/** 第 14 変数： m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** 第 15 変数： m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** 第 16 変数： m_RCV_ISSUE_TYP_val */
	public String m_RCV_ISSUE_TYP_val = null;
	/** 第 17 変数： m_RCV_ISSUE_TYP_name */
	public String m_RCV_ISSUE_TYP_name = null;
	/** 第 18 変数： m_RCV_ISSUE_GNR_TYP_val */
	public String m_RCV_ISSUE_GNR_TYP_val = null;
	/** 第 19 変数： m_RCV_ISSUE_GNR_TYP_name */
	public String m_RCV_ISSUE_GNR_TYP_name = null;
	/** 第 20 変数： m_STOCK_UPD_TYP_val */
	public String m_STOCK_UPD_TYP_val = null;
	/** 第 21 変数： m_STOCK_UPD_TYP_name */
	public String m_STOCK_UPD_TYP_name = null;
	/** 第 22 変数： m_RCV_ISSUE_CMPLT_FLG_val */
	public String m_RCV_ISSUE_CMPLT_FLG_val = null;
	/** 第 23 変数： m_RCV_ISSUE_CMPLT_FLG_name */
	public String m_RCV_ISSUE_CMPLT_FLG_name = null;
	/** 第 24 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 25 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 26 変数： m_RCV_ISSUE_TYP */
	public Integer m_RCV_ISSUE_TYP = null;
	/** 第 27 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 28 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 29 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 30 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 31 変数： m_ACPT_NO */
	public Integer m_ACPT_NO = null;
	/** 第 32 変数： m_ACPT_RSLT_CRCT_NO */
	public Integer m_ACPT_RSLT_CRCT_NO = null;
	/** 第 33 変数： m_INSPEC_RSLT_CRCT_NO */
	public Integer m_INSPEC_RSLT_CRCT_NO = null;
	/** 第 34 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 35 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 36 変数： m_PARTIAL_PRD_NO */
	public Integer m_PARTIAL_PRD_NO = null;
	/** 第 37 変数： m_OPR_RSLT_CRCT_NO */
	public Integer m_OPR_RSLT_CRCT_NO = null;
	/** 第 38 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 39 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 40 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 41 変数： m_RCV_ISSUE_GNR_TYP */
	public Integer m_RCV_ISSUE_GNR_TYP = null;
	/** 第 42 変数： m_DEFECT_CAUSE_CD */
	public String m_DEFECT_CAUSE_CD = null;
	/** 第 43 変数： m_STOCK_UPD_TYP */
	public Integer m_STOCK_UPD_TYP = null;
	/** 第 44 変数： m_RCV_ISSUE_CMPLT_FLG */
	public Integer m_RCV_ISSUE_CMPLT_FLG = null;
	/** 第 45 変数： m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** 第 46 変数： m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** 第 47 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 48 変数： m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** 第 49 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 50 変数： m_RCV_ISSUE_BEFORE_QTY */
	public String m_RCV_ISSUE_BEFORE_QTY = null;
	/** 第 51 変数： m_RCV_ISSUE_AFTER_QTY */
	public String m_RCV_ISSUE_AFTER_QTY = null;
	/** 第 52 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 53 変数： m_NON_PLANNED_CAUSE_CD */
	public String m_NON_PLANNED_CAUSE_CD = null;
	/** 第 54 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 55 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 56 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 57 変数： m_RCV_ISSUE_COMMENT */
	public String m_RCV_ISSUE_COMMENT = null;
	/** 第 58 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 59 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 60 変数： m_l_SHIP_ITEM_CD */
	public String m_l_SHIP_ITEM_CD = null;
	/** 第 61 変数： m_l_INV_LOT_NO */
	public String m_l_INV_LOT_NO = null;
	/** 第 62 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 63 変数： m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** 第 64 変数： m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** 第 65 変数： m_w_FROM_DATE */
	public String m_w_FROM_DATE = null;
	/** 第 66 変数： m_w_TO_DATE */
	public String m_w_TO_DATE = null;
	/** 第 67 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 68 変数： m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** 第 69 変数： m_w_LOT_NO */
	public String m_w_LOT_NO = null;
	/** 第 70 変数： m_w_check */
	public String m_w_check = null;
	/** 第 71 変数： m_w_WH_PLANT_CD */
	public String m_w_WH_PLANT_CD = null;
	/** 第 72 変数： m_w_WH_NAME */
	public String m_w_WH_NAME = null;
	/** 第 73 変数： m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** 第 74 変数： m_w_VEND_NAME */
	public String m_w_VEND_NAME = null;
	/** 第 75 変数： m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** 第 76 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 77 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r_SELECT_CHOICE1 */
	public List l_r_SELECT_CHOICE1 = null;

	/** 第 2 List変数： l_r_SELECT_CHOICE2 */
	public List l_r_SELECT_CHOICE2 = null;

	/** 第 3 List変数： l_r_SELECT_CHOICE3 */
	public List l_r_SELECT_CHOICE3 = null;

	/** 第 4 List変数： l_r_SELECT_CHOICE */
	public List l_r_SELECT_CHOICE = null;

	/** 第 5 List変数： l_RCV_ISSUE_CMPLT_NAME */
	public List l_RCV_ISSUE_CMPLT_NAME = null;

	/** 第 6 List変数： l_RCV_ISSUE_GNR_NAME */
	public List l_RCV_ISSUE_GNR_NAME = null;

	/** 第 7 List変数： l_STOCK_UPD_NAME */
	public List l_STOCK_UPD_NAME = null;

	/** 第 8 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 9 List変数： l_RCV_ISSUE_NAME */
	public List l_RCV_ISSUE_NAME = null;

	/** 第 10 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 11 List変数： l_l_check */
	public List l_l_check = null;

	/** 第 12 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 13 List変数： l_w_CHOICE */
	public List l_w_CHOICE = null;

	/** 第 14 List変数： l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** 第 15 List変数： l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** 第 16 List変数： l_RCV_ISSUE_TYP_val */
	public List l_RCV_ISSUE_TYP_val = null;

	/** 第 17 List変数： l_RCV_ISSUE_TYP_name */
	public List l_RCV_ISSUE_TYP_name = null;

	/** 第 18 List変数： l_RCV_ISSUE_GNR_TYP_val */
	public List l_RCV_ISSUE_GNR_TYP_val = null;

	/** 第 19 List変数： l_RCV_ISSUE_GNR_TYP_name */
	public List l_RCV_ISSUE_GNR_TYP_name = null;

	/** 第 20 List変数： l_STOCK_UPD_TYP_val */
	public List l_STOCK_UPD_TYP_val = null;

	/** 第 21 List変数： l_STOCK_UPD_TYP_name */
	public List l_STOCK_UPD_TYP_name = null;

	/** 第 22 List変数： l_RCV_ISSUE_CMPLT_FLG_val */
	public List l_RCV_ISSUE_CMPLT_FLG_val = null;

	/** 第 23 List変数： l_RCV_ISSUE_CMPLT_FLG_name */
	public List l_RCV_ISSUE_CMPLT_FLG_name = null;

	/** 第 24 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 25 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 26 List変数： l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** 第 27 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 28 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 29 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 30 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 31 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 32 List変数： l_ACPT_RSLT_CRCT_NO */
	public List l_ACPT_RSLT_CRCT_NO = null;

	/** 第 33 List変数： l_INSPEC_RSLT_CRCT_NO */
	public List l_INSPEC_RSLT_CRCT_NO = null;

	/** 第 34 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 35 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 36 List変数： l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** 第 37 List変数： l_OPR_RSLT_CRCT_NO */
	public List l_OPR_RSLT_CRCT_NO = null;

	/** 第 38 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 39 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 40 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 41 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 42 List変数： l_DEFECT_CAUSE_CD */
	public List l_DEFECT_CAUSE_CD = null;

	/** 第 43 List変数： l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** 第 44 List変数： l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** 第 45 List変数： l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** 第 46 List変数： l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** 第 47 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 48 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 49 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 50 List変数： l_RCV_ISSUE_BEFORE_QTY */
	public List l_RCV_ISSUE_BEFORE_QTY = null;

	/** 第 51 List変数： l_RCV_ISSUE_AFTER_QTY */
	public List l_RCV_ISSUE_AFTER_QTY = null;

	/** 第 52 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 53 List変数： l_NON_PLANNED_CAUSE_CD */
	public List l_NON_PLANNED_CAUSE_CD = null;

	/** 第 54 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 55 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 56 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 57 List変数： l_RCV_ISSUE_COMMENT */
	public List l_RCV_ISSUE_COMMENT = null;

	/** 第 58 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 59 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 60 List変数： l_l_SHIP_ITEM_CD */
	public List l_l_SHIP_ITEM_CD = null;

	/** 第 61 List変数： l_l_INV_LOT_NO */
	public List l_l_INV_LOT_NO = null;

	/** 第 62 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 63 List変数： l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** 第 64 List変数： l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** 第 65 List変数： l_w_FROM_DATE */
	public List l_w_FROM_DATE = null;

	/** 第 66 List変数： l_w_TO_DATE */
	public List l_w_TO_DATE = null;

	/** 第 67 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 68 List変数： l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** 第 69 List変数： l_w_LOT_NO */
	public List l_w_LOT_NO = null;

	/** 第 70 List変数： l_w_check */
	public List l_w_check = null;

	/** 第 71 List変数： l_w_WH_PLANT_CD */
	public List l_w_WH_PLANT_CD = null;

	/** 第 72 List変数： l_w_WH_NAME */
	public List l_w_WH_NAME = null;

	/** 第 73 List変数： l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** 第 74 List変数： l_w_VEND_NAME */
	public List l_w_VEND_NAME = null;

	/** 第 75 List変数： l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** 第 76 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 77 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr_SELECT_CHOICE1() { return m_r_SELECT_CHOICE1; }
	public String getr_SELECT_CHOICE2() { return m_r_SELECT_CHOICE2; }
	public String getr_SELECT_CHOICE3() { return m_r_SELECT_CHOICE3; }
	public String getr_SELECT_CHOICE() { return m_r_SELECT_CHOICE; }
	public String getRCV_ISSUE_CMPLT_NAME() { return m_RCV_ISSUE_CMPLT_NAME; }
	public String getRCV_ISSUE_GNR_NAME() { return m_RCV_ISSUE_GNR_NAME; }
	public String getSTOCK_UPD_NAME() { return m_STOCK_UPD_NAME; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getRCV_ISSUE_NAME() { return m_RCV_ISSUE_NAME; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_check() { return m_l_check; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getw_CHOICE() { return m_w_CHOICE; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getRCV_ISSUE_TYP_val() { return m_RCV_ISSUE_TYP_val; }
	public String getRCV_ISSUE_TYP_name() { return m_RCV_ISSUE_TYP_name; }
	public String getRCV_ISSUE_GNR_TYP_val() { return m_RCV_ISSUE_GNR_TYP_val; }
	public String getRCV_ISSUE_GNR_TYP_name() { return m_RCV_ISSUE_GNR_TYP_name; }
	public String getSTOCK_UPD_TYP_val() { return m_STOCK_UPD_TYP_val; }
	public String getSTOCK_UPD_TYP_name() { return m_STOCK_UPD_TYP_name; }
	public String getRCV_ISSUE_CMPLT_FLG_val() { return m_RCV_ISSUE_CMPLT_FLG_val; }
	public String getRCV_ISSUE_CMPLT_FLG_name() { return m_RCV_ISSUE_CMPLT_FLG_name; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public Integer getACPT_NO() { return m_ACPT_NO; }
	public Integer getACPT_RSLT_CRCT_NO() { return m_ACPT_RSLT_CRCT_NO; }
	public Integer getINSPEC_RSLT_CRCT_NO() { return m_INSPEC_RSLT_CRCT_NO; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public Integer getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public Integer getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getDEFECT_CAUSE_CD() { return m_DEFECT_CAUSE_CD; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getRCV_ISSUE_BEFORE_QTY() { return m_RCV_ISSUE_BEFORE_QTY; }
	public String getRCV_ISSUE_AFTER_QTY() { return m_RCV_ISSUE_AFTER_QTY; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getNON_PLANNED_CAUSE_CD() { return m_NON_PLANNED_CAUSE_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getRCV_ISSUE_COMMENT() { return m_RCV_ISSUE_COMMENT; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getl_SHIP_ITEM_CD() { return m_l_SHIP_ITEM_CD; }
	public String getl_INV_LOT_NO() { return m_l_INV_LOT_NO; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_FROM_DATE() { return m_w_FROM_DATE; }
	public String getw_TO_DATE() { return m_w_TO_DATE; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getw_LOT_NO() { return m_w_LOT_NO; }
	public String getw_check() { return m_w_check; }
	public String getw_WH_PLANT_CD() { return m_w_WH_PLANT_CD; }
	public String getw_WH_NAME() { return m_w_WH_NAME; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String getw_VEND_NAME() { return m_w_VEND_NAME; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r_SELECT_CHOICE1() { return l_r_SELECT_CHOICE1; }
	public List getList_r_SELECT_CHOICE2() { return l_r_SELECT_CHOICE2; }
	public List getList_r_SELECT_CHOICE3() { return l_r_SELECT_CHOICE3; }
	public List getList_r_SELECT_CHOICE() { return l_r_SELECT_CHOICE; }
	public List getList_RCV_ISSUE_CMPLT_NAME() { return l_RCV_ISSUE_CMPLT_NAME; }
	public List getList_RCV_ISSUE_GNR_NAME() { return l_RCV_ISSUE_GNR_NAME; }
	public List getList_STOCK_UPD_NAME() { return l_STOCK_UPD_NAME; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_RCV_ISSUE_NAME() { return l_RCV_ISSUE_NAME; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_check() { return l_l_check; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_w_CHOICE() { return l_w_CHOICE; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_RCV_ISSUE_TYP_val() { return l_RCV_ISSUE_TYP_val; }
	public List getList_RCV_ISSUE_TYP_name() { return l_RCV_ISSUE_TYP_name; }
	public List getList_RCV_ISSUE_GNR_TYP_val() { return l_RCV_ISSUE_GNR_TYP_val; }
	public List getList_RCV_ISSUE_GNR_TYP_name() { return l_RCV_ISSUE_GNR_TYP_name; }
	public List getList_STOCK_UPD_TYP_val() { return l_STOCK_UPD_TYP_val; }
	public List getList_STOCK_UPD_TYP_name() { return l_STOCK_UPD_TYP_name; }
	public List getList_RCV_ISSUE_CMPLT_FLG_val() { return l_RCV_ISSUE_CMPLT_FLG_val; }
	public List getList_RCV_ISSUE_CMPLT_FLG_name() { return l_RCV_ISSUE_CMPLT_FLG_name; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_RSLT_CRCT_NO() { return l_ACPT_RSLT_CRCT_NO; }
	public List getList_INSPEC_RSLT_CRCT_NO() { return l_INSPEC_RSLT_CRCT_NO; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_RSLT_CRCT_NO() { return l_OPR_RSLT_CRCT_NO; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_DEFECT_CAUSE_CD() { return l_DEFECT_CAUSE_CD; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_RCV_ISSUE_BEFORE_QTY() { return l_RCV_ISSUE_BEFORE_QTY; }
	public List getList_RCV_ISSUE_AFTER_QTY() { return l_RCV_ISSUE_AFTER_QTY; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_NON_PLANNED_CAUSE_CD() { return l_NON_PLANNED_CAUSE_CD; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_RCV_ISSUE_COMMENT() { return l_RCV_ISSUE_COMMENT; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_l_SHIP_ITEM_CD() { return l_l_SHIP_ITEM_CD; }
	public List getList_l_INV_LOT_NO() { return l_l_INV_LOT_NO; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_FROM_DATE() { return l_w_FROM_DATE; }
	public List getList_w_TO_DATE() { return l_w_TO_DATE; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_w_LOT_NO() { return l_w_LOT_NO; }
	public List getList_w_check() { return l_w_check; }
	public List getList_w_WH_PLANT_CD() { return l_w_WH_PLANT_CD; }
	public List getList_w_WH_NAME() { return l_w_WH_NAME; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_w_VEND_NAME() { return l_w_VEND_NAME; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr_SELECT_CHOICE1(String val) { m_r_SELECT_CHOICE1 = val; }
	public void setr_SELECT_CHOICE2(String val) { m_r_SELECT_CHOICE2 = val; }
	public void setr_SELECT_CHOICE3(String val) { m_r_SELECT_CHOICE3 = val; }
	public void setr_SELECT_CHOICE(String val) { m_r_SELECT_CHOICE = val; }
	public void setRCV_ISSUE_CMPLT_NAME(String val) { m_RCV_ISSUE_CMPLT_NAME = val; }
	public void setRCV_ISSUE_GNR_NAME(String val) { m_RCV_ISSUE_GNR_NAME = val; }
	public void setSTOCK_UPD_NAME(String val) { m_STOCK_UPD_NAME = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setRCV_ISSUE_NAME(String val) { m_RCV_ISSUE_NAME = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_check(String val) { m_l_check = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setw_CHOICE(String val) { m_w_CHOICE = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setRCV_ISSUE_TYP_val(String val) { m_RCV_ISSUE_TYP_val = val; }
	public void setRCV_ISSUE_TYP_name(String val) { m_RCV_ISSUE_TYP_name = val; }
	public void setRCV_ISSUE_GNR_TYP_val(String val) { m_RCV_ISSUE_GNR_TYP_val = val; }
	public void setRCV_ISSUE_GNR_TYP_name(String val) { m_RCV_ISSUE_GNR_TYP_name = val; }
	public void setSTOCK_UPD_TYP_val(String val) { m_STOCK_UPD_TYP_val = val; }
	public void setSTOCK_UPD_TYP_name(String val) { m_STOCK_UPD_TYP_name = val; }
	public void setRCV_ISSUE_CMPLT_FLG_val(String val) { m_RCV_ISSUE_CMPLT_FLG_val = val; }
	public void setRCV_ISSUE_CMPLT_FLG_name(String val) { m_RCV_ISSUE_CMPLT_FLG_name = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setACPT_NO(Integer val) { m_ACPT_NO = val; }
	public void setACPT_RSLT_CRCT_NO(Integer val) { m_ACPT_RSLT_CRCT_NO = val; }
	public void setINSPEC_RSLT_CRCT_NO(Integer val) { m_INSPEC_RSLT_CRCT_NO = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPARTIAL_PRD_NO(Integer val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_RSLT_CRCT_NO(Integer val) { m_OPR_RSLT_CRCT_NO = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setDEFECT_CAUSE_CD(String val) { m_DEFECT_CAUSE_CD = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setRCV_ISSUE_BEFORE_QTY(String val) { m_RCV_ISSUE_BEFORE_QTY = val; }
	public void setRCV_ISSUE_AFTER_QTY(String val) { m_RCV_ISSUE_AFTER_QTY = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setNON_PLANNED_CAUSE_CD(String val) { m_NON_PLANNED_CAUSE_CD = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setRCV_ISSUE_COMMENT(String val) { m_RCV_ISSUE_COMMENT = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setl_SHIP_ITEM_CD(String val) { m_l_SHIP_ITEM_CD = val; }
	public void setl_INV_LOT_NO(String val) { m_l_INV_LOT_NO = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_FROM_DATE(String val) { m_w_FROM_DATE = val; }
	public void setw_TO_DATE(String val) { m_w_TO_DATE = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setw_LOT_NO(String val) { m_w_LOT_NO = val; }
	public void setw_check(String val) { m_w_check = val; }
	public void setw_WH_PLANT_CD(String val) { m_w_WH_PLANT_CD = val; }
	public void setw_WH_NAME(String val) { m_w_WH_NAME = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void setw_VEND_NAME(String val) { m_w_VEND_NAME = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = getInteger(val); }
	public void setACPT_NO(String val) { m_ACPT_NO = getInteger(val); }
	public void setACPT_RSLT_CRCT_NO(String val) { m_ACPT_RSLT_CRCT_NO = getInteger(val); }
	public void setINSPEC_RSLT_CRCT_NO(String val) { m_INSPEC_RSLT_CRCT_NO = getInteger(val); }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = getInteger(val); }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = getInteger(val); }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = getInteger(val); }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }

	public void setList_r_SELECT_CHOICE1(List list) { l_r_SELECT_CHOICE1 = list; }
	public void setList_r_SELECT_CHOICE2(List list) { l_r_SELECT_CHOICE2 = list; }
	public void setList_r_SELECT_CHOICE3(List list) { l_r_SELECT_CHOICE3 = list; }
	public void setList_r_SELECT_CHOICE(List list) { l_r_SELECT_CHOICE = list; }
	public void setList_RCV_ISSUE_CMPLT_NAME(List list) { l_RCV_ISSUE_CMPLT_NAME = list; }
	public void setList_RCV_ISSUE_GNR_NAME(List list) { l_RCV_ISSUE_GNR_NAME = list; }
	public void setList_STOCK_UPD_NAME(List list) { l_STOCK_UPD_NAME = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_RCV_ISSUE_NAME(List list) { l_RCV_ISSUE_NAME = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_check(List list) { l_l_check = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_w_CHOICE(List list) { l_w_CHOICE = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_RCV_ISSUE_TYP_val(List list) { l_RCV_ISSUE_TYP_val = list; }
	public void setList_RCV_ISSUE_TYP_name(List list) { l_RCV_ISSUE_TYP_name = list; }
	public void setList_RCV_ISSUE_GNR_TYP_val(List list) { l_RCV_ISSUE_GNR_TYP_val = list; }
	public void setList_RCV_ISSUE_GNR_TYP_name(List list) { l_RCV_ISSUE_GNR_TYP_name = list; }
	public void setList_STOCK_UPD_TYP_val(List list) { l_STOCK_UPD_TYP_val = list; }
	public void setList_STOCK_UPD_TYP_name(List list) { l_STOCK_UPD_TYP_name = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG_val(List list) { l_RCV_ISSUE_CMPLT_FLG_val = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG_name(List list) { l_RCV_ISSUE_CMPLT_FLG_name = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_RSLT_CRCT_NO(List list) { l_ACPT_RSLT_CRCT_NO = list; }
	public void setList_INSPEC_RSLT_CRCT_NO(List list) { l_INSPEC_RSLT_CRCT_NO = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_RSLT_CRCT_NO(List list) { l_OPR_RSLT_CRCT_NO = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_DEFECT_CAUSE_CD(List list) { l_DEFECT_CAUSE_CD = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_RCV_ISSUE_BEFORE_QTY(List list) { l_RCV_ISSUE_BEFORE_QTY = list; }
	public void setList_RCV_ISSUE_AFTER_QTY(List list) { l_RCV_ISSUE_AFTER_QTY = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_NON_PLANNED_CAUSE_CD(List list) { l_NON_PLANNED_CAUSE_CD = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_RCV_ISSUE_COMMENT(List list) { l_RCV_ISSUE_COMMENT = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_l_SHIP_ITEM_CD(List list) { l_l_SHIP_ITEM_CD = list; }
	public void setList_l_INV_LOT_NO(List list) { l_l_INV_LOT_NO = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_FROM_DATE(List list) { l_w_FROM_DATE = list; }
	public void setList_w_TO_DATE(List list) { l_w_TO_DATE = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_w_LOT_NO(List list) { l_w_LOT_NO = list; }
	public void setList_w_check(List list) { l_w_check = list; }
	public void setList_w_WH_PLANT_CD(List list) { l_w_WH_PLANT_CD = list; }
	public void setList_w_WH_NAME(List list) { l_w_WH_NAME = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_w_VEND_NAME(List list) { l_w_VEND_NAME = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_r_SELECT_CHOICE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SELECT_CHOICE1 == null) {
			l_r_SELECT_CHOICE1 = new ArrayList();
		} else {
			l_r_SELECT_CHOICE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SELECT_CHOICE1.add(((AG0020010Struct) list.get(i)).getr_SELECT_CHOICE1());
		}
		return size;
	}
	public int setL2L_r_SELECT_CHOICE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SELECT_CHOICE2 == null) {
			l_r_SELECT_CHOICE2 = new ArrayList();
		} else {
			l_r_SELECT_CHOICE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SELECT_CHOICE2.add(((AG0020010Struct) list.get(i)).getr_SELECT_CHOICE2());
		}
		return size;
	}
	public int setL2L_r_SELECT_CHOICE3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SELECT_CHOICE3 == null) {
			l_r_SELECT_CHOICE3 = new ArrayList();
		} else {
			l_r_SELECT_CHOICE3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SELECT_CHOICE3.add(((AG0020010Struct) list.get(i)).getr_SELECT_CHOICE3());
		}
		return size;
	}
	public int setL2L_r_SELECT_CHOICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SELECT_CHOICE == null) {
			l_r_SELECT_CHOICE = new ArrayList();
		} else {
			l_r_SELECT_CHOICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SELECT_CHOICE.add(((AG0020010Struct) list.get(i)).getr_SELECT_CHOICE());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_NAME == null) {
			l_RCV_ISSUE_CMPLT_NAME = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_NAME.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_CMPLT_NAME());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_NAME == null) {
			l_RCV_ISSUE_GNR_NAME = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_NAME.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_GNR_NAME());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_NAME == null) {
			l_STOCK_UPD_NAME = new ArrayList();
		} else {
			l_STOCK_UPD_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_NAME.add(((AG0020010Struct) list.get(i)).getSTOCK_UPD_NAME());
		}
		return size;
	}
	public int setL2L_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_NAME == null) {
			l_MRP_ODR_NAME = new ArrayList();
		} else {
			l_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_NAME.add(((AG0020010Struct) list.get(i)).getMRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_NAME == null) {
			l_RCV_ISSUE_NAME = new ArrayList();
		} else {
			l_RCV_ISSUE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_NAME.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_NAME());
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
			l_DOWNLOAD_FILE.add(((AG0020010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_check(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_check == null) {
			l_l_check = new ArrayList();
		} else {
			l_l_check.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_check.add(((AG0020010Struct) list.get(i)).getl_check());
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
			l_h_lotCtrl.add(((AG0020010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_w_CHOICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHOICE == null) {
			l_w_CHOICE = new ArrayList();
		} else {
			l_w_CHOICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHOICE.add(((AG0020010Struct) list.get(i)).getw_CHOICE());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_val == null) {
			l_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_val.add(((AG0020010Struct) list.get(i)).getMRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_name == null) {
			l_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_name.add(((AG0020010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP_val == null) {
			l_RCV_ISSUE_TYP_val = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP_val.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_TYP_val());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP_name == null) {
			l_RCV_ISSUE_TYP_name = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP_name.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_TYP_name());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP_val == null) {
			l_RCV_ISSUE_GNR_TYP_val = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP_val.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP_val());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP_name == null) {
			l_RCV_ISSUE_GNR_TYP_name = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP_name.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP_name());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_TYP_val == null) {
			l_STOCK_UPD_TYP_val = new ArrayList();
		} else {
			l_STOCK_UPD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_TYP_val.add(((AG0020010Struct) list.get(i)).getSTOCK_UPD_TYP_val());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_TYP_name == null) {
			l_STOCK_UPD_TYP_name = new ArrayList();
		} else {
			l_STOCK_UPD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_TYP_name.add(((AG0020010Struct) list.get(i)).getSTOCK_UPD_TYP_name());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_FLG_val == null) {
			l_RCV_ISSUE_CMPLT_FLG_val = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_FLG_val.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG_val());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_FLG_name == null) {
			l_RCV_ISSUE_CMPLT_FLG_name = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_FLG_name.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG_name());
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
			l_h_PLANT_CD.add(((AG0020010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CTRL_CD == null) {
			l_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CTRL_CD.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP == null) {
			l_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_TYP());
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
			l_JOB_ODR_CD.add(((AG0020010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AG0020010Struct) list.get(i)).getITEM_CD());
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
			l_WH_CD.add(((AG0020010Struct) list.get(i)).getWH_CD());
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
			l_PUCH_ODR_CD.add(((AG0020010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_NO == null) {
			l_ACPT_NO = new ArrayList();
		} else {
			l_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_NO.add(((AG0020010Struct) list.get(i)).getACPT_NO());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_CRCT_NO == null) {
			l_ACPT_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_ACPT_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_CRCT_NO.add(((AG0020010Struct) list.get(i)).getACPT_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_INSPEC_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_RSLT_CRCT_NO == null) {
			l_INSPEC_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_INSPEC_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_RSLT_CRCT_NO.add(((AG0020010Struct) list.get(i)).getINSPEC_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AG0020010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_CD == null) {
			l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_CD.add(((AG0020010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_PRD_NO == null) {
			l_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_PRD_NO.add(((AG0020010Struct) list.get(i)).getPARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_CRCT_NO == null) {
			l_OPR_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_OPR_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_CRCT_NO.add(((AG0020010Struct) list.get(i)).getOPR_RSLT_CRCT_NO());
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
			l_ISSUE_INST_CD.add(((AG0020010Struct) list.get(i)).getISSUE_INST_CD());
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
			l_RCV_ISSUE_QTY.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_QTY());
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
			l_RCV_ISSUE_DATE.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP == null) {
			l_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD == null) {
			l_DEFECT_CAUSE_CD = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD.add(((AG0020010Struct) list.get(i)).getDEFECT_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_TYP == null) {
			l_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_TYP.add(((AG0020010Struct) list.get(i)).getSTOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_FLG == null) {
			l_RCV_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_FLG.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((AG0020010Struct) list.get(i)).getCREATED_DATE());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((AG0020010Struct) list.get(i)).getCREATED_BY());
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
			l_ITEM_NAME.add(((AG0020010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AG0020010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_WH_NAME.add(((AG0020010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_BEFORE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_BEFORE_QTY == null) {
			l_RCV_ISSUE_BEFORE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_BEFORE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_BEFORE_QTY.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_BEFORE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AFTER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AFTER_QTY == null) {
			l_RCV_ISSUE_AFTER_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_AFTER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AFTER_QTY.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_AFTER_QTY());
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
			l_PLANT_CD.add(((AG0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_NON_PLANNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_PLANNED_CAUSE_CD == null) {
			l_NON_PLANNED_CAUSE_CD = new ArrayList();
		} else {
			l_NON_PLANNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_PLANNED_CAUSE_CD.add(((AG0020010Struct) list.get(i)).getNON_PLANNED_CAUSE_CD());
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
			l_STOCK_UNIT.add(((AG0020010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_VEND_CD.add(((AG0020010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_NAME.add(((AG0020010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_COMMENT == null) {
			l_RCV_ISSUE_COMMENT = new ArrayList();
		} else {
			l_RCV_ISSUE_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_COMMENT.add(((AG0020010Struct) list.get(i)).getRCV_ISSUE_COMMENT());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AG0020010Struct) list.get(i)).getLOT_NO());
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
			l_VEND_LOT_NO.add(((AG0020010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_SHIP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_ITEM_CD == null) {
			l_l_SHIP_ITEM_CD = new ArrayList();
		} else {
			l_l_SHIP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_ITEM_CD.add(((AG0020010Struct) list.get(i)).getl_SHIP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_INV_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_LOT_NO == null) {
			l_l_INV_LOT_NO = new ArrayList();
		} else {
			l_l_INV_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_LOT_NO.add(((AG0020010Struct) list.get(i)).getl_INV_LOT_NO());
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
			l_w_ITEM_CD.add(((AG0020010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_JOB_ODR_CD.add(((AG0020010Struct) list.get(i)).getw_JOB_ODR_CD());
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
			l_w_WH_CD.add(((AG0020010Struct) list.get(i)).getw_WH_CD());
		}
		return size;
	}
	public int setL2L_w_FROM_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_FROM_DATE == null) {
			l_w_FROM_DATE = new ArrayList();
		} else {
			l_w_FROM_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_FROM_DATE.add(((AG0020010Struct) list.get(i)).getw_FROM_DATE());
		}
		return size;
	}
	public int setL2L_w_TO_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TO_DATE == null) {
			l_w_TO_DATE = new ArrayList();
		} else {
			l_w_TO_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TO_DATE.add(((AG0020010Struct) list.get(i)).getw_TO_DATE());
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
			l_w_PLANT_CD.add(((AG0020010Struct) list.get(i)).getw_PLANT_CD());
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
			l_w_VEND_CD.add(((AG0020010Struct) list.get(i)).getw_VEND_CD());
		}
		return size;
	}
	public int setL2L_w_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LOT_NO == null) {
			l_w_LOT_NO = new ArrayList();
		} else {
			l_w_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LOT_NO.add(((AG0020010Struct) list.get(i)).getw_LOT_NO());
		}
		return size;
	}
	public int setL2L_w_check(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_check == null) {
			l_w_check = new ArrayList();
		} else {
			l_w_check.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_check.add(((AG0020010Struct) list.get(i)).getw_check());
		}
		return size;
	}
	public int setL2L_w_WH_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_PLANT_CD == null) {
			l_w_WH_PLANT_CD = new ArrayList();
		} else {
			l_w_WH_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_PLANT_CD.add(((AG0020010Struct) list.get(i)).getw_WH_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_NAME == null) {
			l_w_WH_NAME = new ArrayList();
		} else {
			l_w_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_NAME.add(((AG0020010Struct) list.get(i)).getw_WH_NAME());
		}
		return size;
	}
	public int setL2L_w_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_NAME == null) {
			l_w_PLANT_NAME = new ArrayList();
		} else {
			l_w_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_NAME.add(((AG0020010Struct) list.get(i)).getw_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_w_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VEND_NAME == null) {
			l_w_VEND_NAME = new ArrayList();
		} else {
			l_w_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VEND_NAME.add(((AG0020010Struct) list.get(i)).getw_VEND_NAME());
		}
		return size;
	}
	public int setL2L_w_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_NAME == null) {
			l_w_ITEM_NAME = new ArrayList();
		} else {
			l_w_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_NAME.add(((AG0020010Struct) list.get(i)).getw_ITEM_NAME());
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
			l_l_COUNT.add(((AG0020010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AG0020010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r_SELECT_CHOICE1 = null;
		m_r_SELECT_CHOICE2 = null;
		m_r_SELECT_CHOICE3 = null;
		m_r_SELECT_CHOICE = null;
		m_RCV_ISSUE_CMPLT_NAME = null;
		m_RCV_ISSUE_GNR_NAME = null;
		m_STOCK_UPD_NAME = null;
		m_MRP_ODR_NAME = null;
		m_RCV_ISSUE_NAME = null;
		m_DOWNLOAD_FILE = null;
		m_l_check = null;
		m_h_lotCtrl = null;
		m_w_CHOICE = null;
		m_MRP_ODR_TYP_val = null;
		m_MRP_ODR_TYP_name = null;
		m_RCV_ISSUE_TYP_val = null;
		m_RCV_ISSUE_TYP_name = null;
		m_RCV_ISSUE_GNR_TYP_val = null;
		m_RCV_ISSUE_GNR_TYP_name = null;
		m_STOCK_UPD_TYP_val = null;
		m_STOCK_UPD_TYP_name = null;
		m_RCV_ISSUE_CMPLT_FLG_val = null;
		m_RCV_ISSUE_CMPLT_FLG_name = null;
		m_h_PLANT_CD = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_WH_CD = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_ACPT_RSLT_CRCT_NO = null;
		m_INSPEC_RSLT_CRCT_NO = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_ISSUE_INST_CD = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_DEFECT_CAUSE_CD = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_CREATED_DATE = null;
		m_CREATED_BY = null;
		m_ITEM_NAME = null;
		m_MRP_ODR_TYP = null;
		m_WH_NAME = null;
		m_RCV_ISSUE_BEFORE_QTY = null;
		m_RCV_ISSUE_AFTER_QTY = null;
		m_PLANT_CD = null;
		m_NON_PLANNED_CAUSE_CD = null;
		m_STOCK_UNIT = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_RCV_ISSUE_COMMENT = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_l_SHIP_ITEM_CD = null;
		m_l_INV_LOT_NO = null;
		m_w_ITEM_CD = null;
		m_w_JOB_ODR_CD = null;
		m_w_WH_CD = null;
		m_w_FROM_DATE = null;
		m_w_TO_DATE = null;
		m_w_PLANT_CD = null;
		m_w_VEND_CD = null;
		m_w_LOT_NO = null;
		m_w_check = null;
		m_w_WH_PLANT_CD = null;
		m_w_WH_NAME = null;
		m_w_PLANT_NAME = null;
		m_w_VEND_NAME = null;
		m_w_ITEM_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r_SELECT_CHOICE1 = null;
		l_r_SELECT_CHOICE2 = null;
		l_r_SELECT_CHOICE3 = null;
		l_r_SELECT_CHOICE = null;
		l_RCV_ISSUE_CMPLT_NAME = null;
		l_RCV_ISSUE_GNR_NAME = null;
		l_STOCK_UPD_NAME = null;
		l_MRP_ODR_NAME = null;
		l_RCV_ISSUE_NAME = null;
		l_DOWNLOAD_FILE = null;
		l_l_check = null;
		l_h_lotCtrl = null;
		l_w_CHOICE = null;
		l_MRP_ODR_TYP_val = null;
		l_MRP_ODR_TYP_name = null;
		l_RCV_ISSUE_TYP_val = null;
		l_RCV_ISSUE_TYP_name = null;
		l_RCV_ISSUE_GNR_TYP_val = null;
		l_RCV_ISSUE_GNR_TYP_name = null;
		l_STOCK_UPD_TYP_val = null;
		l_STOCK_UPD_TYP_name = null;
		l_RCV_ISSUE_CMPLT_FLG_val = null;
		l_RCV_ISSUE_CMPLT_FLG_name = null;
		l_h_PLANT_CD = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_WH_CD = null;
		l_PUCH_ODR_CD = null;
		l_ACPT_NO = null;
		l_ACPT_RSLT_CRCT_NO = null;
		l_INSPEC_RSLT_CRCT_NO = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_RSLT_CRCT_NO = null;
		l_ISSUE_INST_CD = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_DEFECT_CAUSE_CD = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_CREATED_DATE = null;
		l_CREATED_BY = null;
		l_ITEM_NAME = null;
		l_MRP_ODR_TYP = null;
		l_WH_NAME = null;
		l_RCV_ISSUE_BEFORE_QTY = null;
		l_RCV_ISSUE_AFTER_QTY = null;
		l_PLANT_CD = null;
		l_NON_PLANNED_CAUSE_CD = null;
		l_STOCK_UNIT = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_RCV_ISSUE_COMMENT = null;
		l_LOT_NO = null;
		l_VEND_LOT_NO = null;
		l_l_SHIP_ITEM_CD = null;
		l_l_INV_LOT_NO = null;
		l_w_ITEM_CD = null;
		l_w_JOB_ODR_CD = null;
		l_w_WH_CD = null;
		l_w_FROM_DATE = null;
		l_w_TO_DATE = null;
		l_w_PLANT_CD = null;
		l_w_VEND_CD = null;
		l_w_LOT_NO = null;
		l_w_check = null;
		l_w_WH_PLANT_CD = null;
		l_w_WH_NAME = null;
		l_w_PLANT_NAME = null;
		l_w_VEND_NAME = null;
		l_w_ITEM_NAME = null;
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
	 * medAG0020010クラスの標準コンストラクタ
	 */
	public AG0020010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AG0020010Struct struct)
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
	public void setStructM(AG0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr_SELECT_CHOICE1(struct.getr_SELECT_CHOICE1());
			this.setr_SELECT_CHOICE2(struct.getr_SELECT_CHOICE2());
			this.setr_SELECT_CHOICE3(struct.getr_SELECT_CHOICE3());
			this.setr_SELECT_CHOICE(struct.getr_SELECT_CHOICE());
			this.setRCV_ISSUE_CMPLT_NAME(struct.getRCV_ISSUE_CMPLT_NAME());
			this.setRCV_ISSUE_GNR_NAME(struct.getRCV_ISSUE_GNR_NAME());
			this.setSTOCK_UPD_NAME(struct.getSTOCK_UPD_NAME());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setRCV_ISSUE_NAME(struct.getRCV_ISSUE_NAME());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_check(struct.getl_check());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setw_CHOICE(struct.getw_CHOICE());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setRCV_ISSUE_TYP_val(struct.getRCV_ISSUE_TYP_val());
			this.setRCV_ISSUE_TYP_name(struct.getRCV_ISSUE_TYP_name());
			this.setRCV_ISSUE_GNR_TYP_val(struct.getRCV_ISSUE_GNR_TYP_val());
			this.setRCV_ISSUE_GNR_TYP_name(struct.getRCV_ISSUE_GNR_TYP_name());
			this.setSTOCK_UPD_TYP_val(struct.getSTOCK_UPD_TYP_val());
			this.setSTOCK_UPD_TYP_name(struct.getSTOCK_UPD_TYP_name());
			this.setRCV_ISSUE_CMPLT_FLG_val(struct.getRCV_ISSUE_CMPLT_FLG_val());
			this.setRCV_ISSUE_CMPLT_FLG_name(struct.getRCV_ISSUE_CMPLT_FLG_name());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_RSLT_CRCT_NO(struct.getACPT_RSLT_CRCT_NO());
			this.setINSPEC_RSLT_CRCT_NO(struct.getINSPEC_RSLT_CRCT_NO());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_RSLT_CRCT_NO(struct.getOPR_RSLT_CRCT_NO());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setDEFECT_CAUSE_CD(struct.getDEFECT_CAUSE_CD());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setWH_NAME(struct.getWH_NAME());
			this.setRCV_ISSUE_BEFORE_QTY(struct.getRCV_ISSUE_BEFORE_QTY());
			this.setRCV_ISSUE_AFTER_QTY(struct.getRCV_ISSUE_AFTER_QTY());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setNON_PLANNED_CAUSE_CD(struct.getNON_PLANNED_CAUSE_CD());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setRCV_ISSUE_COMMENT(struct.getRCV_ISSUE_COMMENT());
			this.setLOT_NO(struct.getLOT_NO());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setl_SHIP_ITEM_CD(struct.getl_SHIP_ITEM_CD());
			this.setl_INV_LOT_NO(struct.getl_INV_LOT_NO());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_FROM_DATE(struct.getw_FROM_DATE());
			this.setw_TO_DATE(struct.getw_TO_DATE());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setw_LOT_NO(struct.getw_LOT_NO());
			this.setw_check(struct.getw_check());
			this.setw_WH_PLANT_CD(struct.getw_WH_PLANT_CD());
			this.setw_WH_NAME(struct.getw_WH_NAME());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.setw_VEND_NAME(struct.getw_VEND_NAME());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AG0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r_SELECT_CHOICE1(struct.getList_r_SELECT_CHOICE1());
			this.setList_r_SELECT_CHOICE2(struct.getList_r_SELECT_CHOICE2());
			this.setList_r_SELECT_CHOICE3(struct.getList_r_SELECT_CHOICE3());
			this.setList_r_SELECT_CHOICE(struct.getList_r_SELECT_CHOICE());
			this.setList_RCV_ISSUE_CMPLT_NAME(struct.getList_RCV_ISSUE_CMPLT_NAME());
			this.setList_RCV_ISSUE_GNR_NAME(struct.getList_RCV_ISSUE_GNR_NAME());
			this.setList_STOCK_UPD_NAME(struct.getList_STOCK_UPD_NAME());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_RCV_ISSUE_NAME(struct.getList_RCV_ISSUE_NAME());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_check(struct.getList_l_check());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_w_CHOICE(struct.getList_w_CHOICE());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_RCV_ISSUE_TYP_val(struct.getList_RCV_ISSUE_TYP_val());
			this.setList_RCV_ISSUE_TYP_name(struct.getList_RCV_ISSUE_TYP_name());
			this.setList_RCV_ISSUE_GNR_TYP_val(struct.getList_RCV_ISSUE_GNR_TYP_val());
			this.setList_RCV_ISSUE_GNR_TYP_name(struct.getList_RCV_ISSUE_GNR_TYP_name());
			this.setList_STOCK_UPD_TYP_val(struct.getList_STOCK_UPD_TYP_val());
			this.setList_STOCK_UPD_TYP_name(struct.getList_STOCK_UPD_TYP_name());
			this.setList_RCV_ISSUE_CMPLT_FLG_val(struct.getList_RCV_ISSUE_CMPLT_FLG_val());
			this.setList_RCV_ISSUE_CMPLT_FLG_name(struct.getList_RCV_ISSUE_CMPLT_FLG_name());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_RSLT_CRCT_NO(struct.getList_ACPT_RSLT_CRCT_NO());
			this.setList_INSPEC_RSLT_CRCT_NO(struct.getList_INSPEC_RSLT_CRCT_NO());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_RSLT_CRCT_NO(struct.getList_OPR_RSLT_CRCT_NO());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_DEFECT_CAUSE_CD(struct.getList_DEFECT_CAUSE_CD());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_RCV_ISSUE_BEFORE_QTY(struct.getList_RCV_ISSUE_BEFORE_QTY());
			this.setList_RCV_ISSUE_AFTER_QTY(struct.getList_RCV_ISSUE_AFTER_QTY());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_NON_PLANNED_CAUSE_CD(struct.getList_NON_PLANNED_CAUSE_CD());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_RCV_ISSUE_COMMENT(struct.getList_RCV_ISSUE_COMMENT());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_l_SHIP_ITEM_CD(struct.getList_l_SHIP_ITEM_CD());
			this.setList_l_INV_LOT_NO(struct.getList_l_INV_LOT_NO());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_FROM_DATE(struct.getList_w_FROM_DATE());
			this.setList_w_TO_DATE(struct.getList_w_TO_DATE());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_w_LOT_NO(struct.getList_w_LOT_NO());
			this.setList_w_check(struct.getList_w_check());
			this.setList_w_WH_PLANT_CD(struct.getList_w_WH_PLANT_CD());
			this.setList_w_WH_NAME(struct.getList_w_WH_NAME());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_w_VEND_NAME(struct.getList_w_VEND_NAME());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
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
	// 第 1 変数初期値： i_r_SELECT_CHOICE1


	final static String i_r_SELECT_CHOICE1 = null;

	// 第 2 変数初期値： i_r_SELECT_CHOICE2


	final static String i_r_SELECT_CHOICE2 = null;

	// 第 3 変数初期値： i_r_SELECT_CHOICE3


	final static String i_r_SELECT_CHOICE3 = null;

	// 第 4 変数初期値： i_r_SELECT_CHOICE


	final static String i_r_SELECT_CHOICE = null;

	// 第 5 変数初期値： i_RCV_ISSUE_CMPLT_NAME


	final static String i_RCV_ISSUE_CMPLT_NAME = null;

	// 第 6 変数初期値： i_RCV_ISSUE_GNR_NAME


	final static String i_RCV_ISSUE_GNR_NAME = null;

	// 第 7 変数初期値： i_STOCK_UPD_NAME


	final static String i_STOCK_UPD_NAME = null;

	// 第 8 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 9 変数初期値： i_RCV_ISSUE_NAME


	final static String i_RCV_ISSUE_NAME = null;

	// 第 10 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 11 変数初期値： i_l_check


	final static String i_l_check = null;

	// 第 12 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 13 変数初期値： i_w_CHOICE


	final static String i_w_CHOICE = null;

	// 第 14 変数初期値： i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// 第 15 変数初期値： i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// 第 16 変数初期値： i_RCV_ISSUE_TYP_val


	final static String i_RCV_ISSUE_TYP_val = null;

	// 第 17 変数初期値： i_RCV_ISSUE_TYP_name


	final static String i_RCV_ISSUE_TYP_name = null;

	// 第 18 変数初期値： i_RCV_ISSUE_GNR_TYP_val


	final static String i_RCV_ISSUE_GNR_TYP_val = null;

	// 第 19 変数初期値： i_RCV_ISSUE_GNR_TYP_name


	final static String i_RCV_ISSUE_GNR_TYP_name = null;

	// 第 20 変数初期値： i_STOCK_UPD_TYP_val


	final static String i_STOCK_UPD_TYP_val = null;

	// 第 21 変数初期値： i_STOCK_UPD_TYP_name


	final static String i_STOCK_UPD_TYP_name = null;

	// 第 22 変数初期値： i_RCV_ISSUE_CMPLT_FLG_val


	final static String i_RCV_ISSUE_CMPLT_FLG_val = null;

	// 第 23 変数初期値： i_RCV_ISSUE_CMPLT_FLG_name


	final static String i_RCV_ISSUE_CMPLT_FLG_name = null;

	// 第 24 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 25 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 26 変数初期値： i_RCV_ISSUE_TYP


	final static Integer i_RCV_ISSUE_TYP = null;

	// 第 27 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 28 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 29 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 30 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 31 変数初期値： i_ACPT_NO


	final static Integer i_ACPT_NO = null;

	// 第 32 変数初期値： i_ACPT_RSLT_CRCT_NO


	final static Integer i_ACPT_RSLT_CRCT_NO = null;

	// 第 33 変数初期値： i_INSPEC_RSLT_CRCT_NO


	final static Integer i_INSPEC_RSLT_CRCT_NO = null;

	// 第 34 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 35 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 36 変数初期値： i_PARTIAL_PRD_NO


	final static Integer i_PARTIAL_PRD_NO = null;

	// 第 37 変数初期値： i_OPR_RSLT_CRCT_NO


	final static Integer i_OPR_RSLT_CRCT_NO = null;

	// 第 38 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 39 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 40 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 41 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// 第 42 変数初期値： i_DEFECT_CAUSE_CD


	final static String i_DEFECT_CAUSE_CD = null;

	// 第 43 変数初期値： i_STOCK_UPD_TYP


	final static Integer i_STOCK_UPD_TYP = null;

	// 第 44 変数初期値： i_RCV_ISSUE_CMPLT_FLG


	final static Integer i_RCV_ISSUE_CMPLT_FLG = null;

	// 第 45 変数初期値： i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// 第 46 変数初期値： i_CREATED_BY


	final static String i_CREATED_BY = null;

	// 第 47 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 48 変数初期値： i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// 第 49 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 50 変数初期値： i_RCV_ISSUE_BEFORE_QTY


	final static String i_RCV_ISSUE_BEFORE_QTY = null;

	// 第 51 変数初期値： i_RCV_ISSUE_AFTER_QTY


	final static String i_RCV_ISSUE_AFTER_QTY = null;

	// 第 52 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 53 変数初期値： i_NON_PLANNED_CAUSE_CD


	final static String i_NON_PLANNED_CAUSE_CD = null;

	// 第 54 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 55 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 56 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 57 変数初期値： i_RCV_ISSUE_COMMENT


	final static String i_RCV_ISSUE_COMMENT = null;

	// 第 58 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 59 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 60 変数初期値： i_l_SHIP_ITEM_CD


	final static String i_l_SHIP_ITEM_CD = null;

	// 第 61 変数初期値： i_l_INV_LOT_NO


	final static String i_l_INV_LOT_NO = null;

	// 第 62 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 63 変数初期値： i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// 第 64 変数初期値： i_w_WH_CD


	final static String i_w_WH_CD = null;

	// 第 65 変数初期値： i_w_FROM_DATE


	final static String i_w_FROM_DATE = null;

	// 第 66 変数初期値： i_w_TO_DATE


	final static String i_w_TO_DATE = null;

	// 第 67 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 68 変数初期値： i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// 第 69 変数初期値： i_w_LOT_NO


	final static String i_w_LOT_NO = null;

	// 第 70 変数初期値： i_w_check


	final static String i_w_check = null;

	// 第 71 変数初期値： i_w_WH_PLANT_CD


	final static String i_w_WH_PLANT_CD = null;

	// 第 72 変数初期値： i_w_WH_NAME


	final static String i_w_WH_NAME = null;

	// 第 73 変数初期値： i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// 第 74 変数初期値： i_w_VEND_NAME


	final static String i_w_VEND_NAME = null;

	// 第 75 変数初期値： i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// 第 76 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 77 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------
	/**
	 * コピー
	 * @param struct コピー対象
	 */
	public void copy(AG0020010Struct struct)
	{
		clear();
		if(struct.m_RCV_ISSUE_CTRL_CD != null) m_RCV_ISSUE_CTRL_CD = new String(struct.m_RCV_ISSUE_CTRL_CD);
		if(struct.m_RCV_ISSUE_TYP != null) m_RCV_ISSUE_TYP = new Integer(struct.m_RCV_ISSUE_TYP.intValue());
		if(struct.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(struct.m_JOB_ODR_CD);
		if(struct.m_ITEM_CD != null) m_ITEM_CD = new String(struct.m_ITEM_CD);
		if(struct.m_WH_CD != null) m_WH_CD = new String(struct.m_WH_CD);
		if(struct.m_PUCH_ODR_CD != null) m_PUCH_ODR_CD = new String(struct.m_PUCH_ODR_CD);
		if(struct.m_ACPT_NO != null) m_ACPT_NO = new Integer(struct.m_ACPT_NO.intValue());
		if(struct.m_ACPT_RSLT_CRCT_NO != null) m_ACPT_RSLT_CRCT_NO = new Integer(struct.m_ACPT_RSLT_CRCT_NO.intValue());
		if(struct.m_INSPEC_RSLT_CRCT_NO != null) m_INSPEC_RSLT_CRCT_NO = new Integer(struct.m_INSPEC_RSLT_CRCT_NO.intValue());
		if(struct.m_WORK_ODR_CD != null) m_WORK_ODR_CD = new String(struct.m_WORK_ODR_CD);
		if(struct.m_WORK_IN_PROC_CD != null) m_WORK_IN_PROC_CD = new String(struct.m_WORK_IN_PROC_CD);
		if(struct.m_PARTIAL_PRD_NO != null) m_PARTIAL_PRD_NO = new Integer(struct.m_PARTIAL_PRD_NO.intValue());
		if(struct.m_OPR_RSLT_CRCT_NO != null) m_OPR_RSLT_CRCT_NO = new Integer(struct.m_OPR_RSLT_CRCT_NO.intValue());
		if(struct.m_ISSUE_INST_CD != null) m_ISSUE_INST_CD = new String(struct.m_ISSUE_INST_CD);
		if(struct.m_RCV_ISSUE_QTY != null) m_RCV_ISSUE_QTY = new String(struct.m_RCV_ISSUE_QTY);
		if(struct.m_RCV_ISSUE_DATE != null) m_RCV_ISSUE_DATE = new String(struct.m_RCV_ISSUE_DATE);
		if(struct.m_RCV_ISSUE_GNR_TYP != null) m_RCV_ISSUE_GNR_TYP = new Integer(struct.m_RCV_ISSUE_GNR_TYP.intValue());
		if(struct.m_DEFECT_CAUSE_CD != null) m_DEFECT_CAUSE_CD = new String(struct.m_DEFECT_CAUSE_CD);
		if(struct.m_STOCK_UPD_TYP != null) m_STOCK_UPD_TYP = new Integer(struct.m_STOCK_UPD_TYP.intValue());
		if(struct.m_RCV_ISSUE_CMPLT_FLG != null) m_RCV_ISSUE_CMPLT_FLG = new Integer(struct.m_RCV_ISSUE_CMPLT_FLG.intValue());
		if(struct.m_CREATED_DATE != null) m_CREATED_DATE = new String(struct.m_CREATED_DATE);
		if(struct.m_CREATED_BY != null) m_CREATED_BY = new String(struct.m_CREATED_BY);
		if(struct.m_ITEM_NAME != null) m_ITEM_NAME = new String(struct.m_ITEM_NAME);
		if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer(struct.m_MRP_ODR_TYP.intValue());
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(struct.m_w_ITEM_CD);
		if(struct.m_w_JOB_ODR_CD != null) m_w_JOB_ODR_CD = new String(struct.m_w_JOB_ODR_CD);
		if(struct.m_w_WH_CD != null) m_w_WH_CD = new String(struct.m_w_WH_CD);
		if(struct.m_w_FROM_DATE != null) m_w_FROM_DATE = new String(struct.m_w_FROM_DATE);
		if(struct.m_w_TO_DATE != null) m_w_TO_DATE = new String(struct.m_w_TO_DATE);
		if(struct.m_w_CHOICE != null) m_w_CHOICE = new String(struct.m_w_CHOICE);
		if(struct.m_h_PLANT_CD != null) m_h_PLANT_CD = new String(struct.m_h_PLANT_CD);
		if(struct.m_w_WH_PLANT_CD != null) m_w_WH_PLANT_CD = new String(struct.m_w_WH_PLANT_CD);
		if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new String(struct.m_MRP_ODR_TYP_val);
		if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
		if(struct.m_RCV_ISSUE_TYP_val != null) m_RCV_ISSUE_TYP_val = new String(struct.m_RCV_ISSUE_TYP_val);
		if(struct.m_RCV_ISSUE_TYP_name != null) m_RCV_ISSUE_TYP_name = new String(struct.m_RCV_ISSUE_TYP_name);
		if(struct.m_RCV_ISSUE_GNR_TYP_val != null) m_RCV_ISSUE_GNR_TYP_val = new String(struct.m_RCV_ISSUE_GNR_TYP_val);
		if(struct.m_RCV_ISSUE_GNR_TYP_name != null) m_RCV_ISSUE_GNR_TYP_name = new String(struct.m_RCV_ISSUE_GNR_TYP_name);
		if(struct.m_STOCK_UPD_TYP_val != null) m_STOCK_UPD_TYP_val = new String(struct.m_STOCK_UPD_TYP_val);
		if(struct.m_STOCK_UPD_TYP_name != null) m_STOCK_UPD_TYP_name = new String(struct.m_STOCK_UPD_TYP_name);
		if(struct.m_RCV_ISSUE_CMPLT_FLG_val != null) m_RCV_ISSUE_CMPLT_FLG_val = new String(struct.m_RCV_ISSUE_CMPLT_FLG_val);
		if(struct.m_RCV_ISSUE_CMPLT_FLG_name != null) m_RCV_ISSUE_CMPLT_FLG_name = new String(struct.m_RCV_ISSUE_CMPLT_FLG_name);
//↓ 2005.01.20 追加
		if(struct.m_RCV_ISSUE_BEFORE_QTY != null) m_RCV_ISSUE_BEFORE_QTY = new String(struct.m_RCV_ISSUE_BEFORE_QTY);
		if(struct.m_RCV_ISSUE_AFTER_QTY != null) m_RCV_ISSUE_AFTER_QTY = new String(struct.m_RCV_ISSUE_AFTER_QTY);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(struct.m_w_PLANT_NAME);
		if(struct.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(struct.m_w_PLANT_NAME);
		if(struct.m_NON_PLANNED_CAUSE_CD != null) m_NON_PLANNED_CAUSE_CD = new String(struct.m_NON_PLANNED_CAUSE_CD);
//↑ 2005.01.20 追加
//↓ 2006.06.14 追加		
		if(struct.m_l_check != null) m_l_check = new String(struct.m_l_check);
		if(struct.m_w_check != null) m_w_check = new String(struct.m_w_check);
//↑ 2006.06.14 追加
		if(struct.m_l_SHIP_ITEM_CD != null) m_l_SHIP_ITEM_CD = new String(struct.m_l_SHIP_ITEM_CD);
		if(struct.m_l_INV_LOT_NO != null) m_l_INV_LOT_NO = new String(struct.m_l_INV_LOT_NO);
	}


	/**
	 * コピーコンストラクタ
	 * @param struct コピー対象
	 */
	 public AG0020010Struct(AG0020010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
