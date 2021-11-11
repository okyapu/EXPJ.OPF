/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0080/src/com/nec/jp/orteus/metamorBase/AF0080/AF0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0080;

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

public class AF0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_WH_TO_CD */
	public String m_w_WH_TO_CD = null;
	/** 第 2 変数： m_w_WH_FROM_NAME */
	public String m_w_WH_FROM_NAME = null;
	/** 第 3 変数： m_w_WH_TO_NAME */
	public String m_w_WH_TO_NAME = null;
	/** 第 4 変数： m_w_CHOICE_1 */
	public String m_w_CHOICE_1 = null;
	/** 第 5 変数： m_w_CHOICE_2 */
	public String m_w_CHOICE_2 = null;
	/** 第 6 変数： m_w_CHOICE_3 */
	public String m_w_CHOICE_3 = null;
	/** 第 7 変数： m_w_CHOICE */
	public String m_w_CHOICE = null;
	/** 第 8 変数： m_ISSUE_CMPLT_NAME */
	public String m_ISSUE_CMPLT_NAME = null;
	/** 第 9 変数： m_CONS_NAME */
	public String m_CONS_NAME = null;
	/** 第 10 変数： m_s_OPR_INST_CD */
	public String m_s_OPR_INST_CD = null;
	/** 第 11 変数： m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** 第 12 変数： m_OWN_ISSUED_QTY */
	public String m_OWN_ISSUED_QTY = null;
	/** 第 13 変数： m_OTHER_ISSUED_QTY */
	public String m_OTHER_ISSUED_QTY = null;
	/** 第 14 変数： m_ITEM_ISSUED_QTY */
	public String m_ITEM_ISSUED_QTY = null;
	/** 第 15 変数： m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;
	/** 第 16 変数： m_h_WH_FROM_CD */
	public String m_h_WH_FROM_CD = null;
	/** 第 17 変数： m_h_RCV_ISSUE_DATE */
	public String m_h_RCV_ISSUE_DATE = null;
	/** 第 18 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 19 変数： m_LOT_CTRL_FLG_name */
	public String m_LOT_CTRL_FLG_name = null;
	/** 第 20 変数： m_LOT_CTRL_FLG_val */
	public String m_LOT_CTRL_FLG_val = null;
	/** 第 21 変数： m_w_LOT_CTRL_FLG */
	public String m_w_LOT_CTRL_FLG = null;
	/** 第 22 変数： m_w_OPR_INST_CD */
	public String m_w_OPR_INST_CD = null;
	/** 第 23 変数： m_w_PUCH_ODR_CD */
	public String m_w_PUCH_ODR_CD = null;
	/** 第 24 変数： m_w_ISSUE_INST_CD */
	public String m_w_ISSUE_INST_CD = null;
	/** 第 25 変数： m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** 第 26 変数： m_w_PROC_NAME */
	public String m_w_PROC_NAME = null;
	/** 第 27 変数： m_w_OD_NO */
	public String m_w_OD_NO = null;
	/** 第 28 変数： m_w_WH_FROM_CD */
	public String m_w_WH_FROM_CD = null;
	/** 第 29 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 30 変数： m_w_BUSINESS_OPR_DATE */
	public String m_w_BUSINESS_OPR_DATE = null;
	/** 第 31 変数： m_ISSUE_CMPLT_FLG_val */
	public Integer m_ISSUE_CMPLT_FLG_val = null;
	/** 第 32 変数： m_ISSUE_CMPLT_FLG_name */
	public String m_ISSUE_CMPLT_FLG_name = null;
	/** 第 33 変数： m_CONS_TYP_val */
	public Integer m_CONS_TYP_val = null;
	/** 第 34 変数： m_CONS_TYP_name */
	public String m_CONS_TYP_name = null;
	/** 第 35 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 36 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 37 変数： m_JOB_ODR_DETAIL_NO */
	public Integer m_JOB_ODR_DETAIL_NO = null;
	/** 第 38 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 39 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 40 変数： m_ISSUE_INST_QTY */
	public String m_ISSUE_INST_QTY = null;
	/** 第 41 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 42 変数： m_SCDL_ISSUE_DATE */
	public String m_SCDL_ISSUE_DATE = null;
	/** 第 43 変数： m_ISSUE_CMPLT_DATE */
	public String m_ISSUE_CMPLT_DATE = null;
	/** 第 44 変数： m_ISSUE_CMPLT_FLG */
	public Integer m_ISSUE_CMPLT_FLG = null;
	/** 第 45 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 46 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 47 変数： m_w_OPR_INST_CD_item */
	public String m_w_OPR_INST_CD_item = null;
	/** 第 48 変数： m_w_OPR_INST_CD_job */
	public String m_w_OPR_INST_CD_job = null;
	/** 第 49 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 50 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 51 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 52 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 53 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 54 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 55 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 56 変数： m_CONS_TYP */
	public Integer m_CONS_TYP = null;
	/** 第 57 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 58 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 59 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 60 変数： m_w_UNIT_QTY_TYP */
	public Integer m_w_UNIT_QTY_TYP = null;
	/** 第 61 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 62 変数： m_h_ISSUE_TYP */
	public String m_h_ISSUE_TYP = null;
	/** 第 63 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 64 変数： m_w_RCV_ISSUE_CTRL_CD */
	public String m_w_RCV_ISSUE_CTRL_CD = null;
	/** 第 65 変数： m_w_RCV_ISSUE_TYP */
	public Integer m_w_RCV_ISSUE_TYP = null;
	/** 第 66 変数： m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** 第 67 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 68 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 69 変数： m_w_RCV_ISSUE_GNR_TYP */
	public Integer m_w_RCV_ISSUE_GNR_TYP = null;
	/** 第 70 変数： m_w_STOCK_UPD_TYP */
	public Integer m_w_STOCK_UPD_TYP = null;
	/** 第 71 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 72 変数： m_RCV_ISSUE_COMMENT */
	public String m_RCV_ISSUE_COMMENT = null;
	/** 第 73 変数： m_w_LOT_NO */
	public String m_w_LOT_NO = null;
	/** 第 74 変数： m_w_WH_NAME */
	public String m_w_WH_NAME = null;
	/** 第 75 変数： m_w_PLANT_CD_check */
	public String m_w_PLANT_CD_check = null;
	/** 第 76 変数： m_w_WH_TYP */
	public Integer m_w_WH_TYP = null;
	/** 第 77 変数： m_w_MRP_FLG */
	public Integer m_w_MRP_FLG = null;
	/** 第 78 変数： m_w_STOCK_ON_HAND_QTY */
	public String m_w_STOCK_ON_HAND_QTY = null;
	/** 第 79 変数： m_SAVE_JOB_ODR_CD */
	public String m_SAVE_JOB_ODR_CD = null;
	/** 第 80 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 81 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 82 変数： m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** 第 83 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 84 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 85 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 86 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 87 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 88 変数： m_RETURNED_CAUSE_CD */
	public String m_RETURNED_CAUSE_CD = null;
	/** 第 89 変数： m_ONEROUS_FLG */
	public String m_ONEROUS_FLG = null;
	/** 第 90 変数： m_PARAM_RESULT */
	public String m_PARAM_RESULT = null;
	/** 第 91 変数： m_h_Param_Div */
	public String m_h_Param_Div = null;
	/** 第 92 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 93 変数： m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** 第 94 変数： m_l_TOTAL_ISSUE_QTY */
	public String m_l_TOTAL_ISSUE_QTY = null;
	/** 第 95 変数： m_l_ISSUE_DATE */
	public String m_l_ISSUE_DATE = null;
	/** 第 96 変数： m_l_STOCK_ON_HAND_QTY */
	public String m_l_STOCK_ON_HAND_QTY = null;
	/** 第 97 変数： m_l_DEFECT_QTY */
	public String m_l_DEFECT_QTY = null;
	/** 第 98 変数： m_l_ALLOCABLE_QTY */
	public String m_l_ALLOCABLE_QTY = null;
	/** 第 99 変数： m_l_EXTERNAL_LOT_NO */
	public String m_l_EXTERNAL_LOT_NO = null;
	/** 第 100 変数： m_l_BEST_BEFORE_DATE */
	public String m_l_BEST_BEFORE_DATE = null;
	/** 第 101 変数： m_l_PRD_CMPLT_DATE */
	public String m_l_PRD_CMPLT_DATE = null;
	/** 第 102 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 103 変数： m_BBD_c_FLG */
	public String m_BBD_c_FLG = null;
	/** 第 104 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 105 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 106 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_WH_TO_CD */
	public List l_w_WH_TO_CD = null;

	/** 第 2 List変数： l_w_WH_FROM_NAME */
	public List l_w_WH_FROM_NAME = null;

	/** 第 3 List変数： l_w_WH_TO_NAME */
	public List l_w_WH_TO_NAME = null;

	/** 第 4 List変数： l_w_CHOICE_1 */
	public List l_w_CHOICE_1 = null;

	/** 第 5 List変数： l_w_CHOICE_2 */
	public List l_w_CHOICE_2 = null;

	/** 第 6 List変数： l_w_CHOICE_3 */
	public List l_w_CHOICE_3 = null;

	/** 第 7 List変数： l_w_CHOICE */
	public List l_w_CHOICE = null;

	/** 第 8 List変数： l_ISSUE_CMPLT_NAME */
	public List l_ISSUE_CMPLT_NAME = null;

	/** 第 9 List変数： l_CONS_NAME */
	public List l_CONS_NAME = null;

	/** 第 10 List変数： l_s_OPR_INST_CD */
	public List l_s_OPR_INST_CD = null;

	/** 第 11 List変数： l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** 第 12 List変数： l_OWN_ISSUED_QTY */
	public List l_OWN_ISSUED_QTY = null;

	/** 第 13 List変数： l_OTHER_ISSUED_QTY */
	public List l_OTHER_ISSUED_QTY = null;

	/** 第 14 List変数： l_ITEM_ISSUED_QTY */
	public List l_ITEM_ISSUED_QTY = null;

	/** 第 15 List変数： l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;

	/** 第 16 List変数： l_h_WH_FROM_CD */
	public List l_h_WH_FROM_CD = null;

	/** 第 17 List変数： l_h_RCV_ISSUE_DATE */
	public List l_h_RCV_ISSUE_DATE = null;

	/** 第 18 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 19 List変数： l_LOT_CTRL_FLG_name */
	public List l_LOT_CTRL_FLG_name = null;

	/** 第 20 List変数： l_LOT_CTRL_FLG_val */
	public List l_LOT_CTRL_FLG_val = null;

	/** 第 21 List変数： l_w_LOT_CTRL_FLG */
	public List l_w_LOT_CTRL_FLG = null;

	/** 第 22 List変数： l_w_OPR_INST_CD */
	public List l_w_OPR_INST_CD = null;

	/** 第 23 List変数： l_w_PUCH_ODR_CD */
	public List l_w_PUCH_ODR_CD = null;

	/** 第 24 List変数： l_w_ISSUE_INST_CD */
	public List l_w_ISSUE_INST_CD = null;

	/** 第 25 List変数： l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** 第 26 List変数： l_w_PROC_NAME */
	public List l_w_PROC_NAME = null;

	/** 第 27 List変数： l_w_OD_NO */
	public List l_w_OD_NO = null;

	/** 第 28 List変数： l_w_WH_FROM_CD */
	public List l_w_WH_FROM_CD = null;

	/** 第 29 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 30 List変数： l_w_BUSINESS_OPR_DATE */
	public List l_w_BUSINESS_OPR_DATE = null;

	/** 第 31 List変数： l_ISSUE_CMPLT_FLG_val */
	public List l_ISSUE_CMPLT_FLG_val = null;

	/** 第 32 List変数： l_ISSUE_CMPLT_FLG_name */
	public List l_ISSUE_CMPLT_FLG_name = null;

	/** 第 33 List変数： l_CONS_TYP_val */
	public List l_CONS_TYP_val = null;

	/** 第 34 List変数： l_CONS_TYP_name */
	public List l_CONS_TYP_name = null;

	/** 第 35 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 36 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 37 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 38 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 39 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 40 List変数： l_ISSUE_INST_QTY */
	public List l_ISSUE_INST_QTY = null;

	/** 第 41 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 42 List変数： l_SCDL_ISSUE_DATE */
	public List l_SCDL_ISSUE_DATE = null;

	/** 第 43 List変数： l_ISSUE_CMPLT_DATE */
	public List l_ISSUE_CMPLT_DATE = null;

	/** 第 44 List変数： l_ISSUE_CMPLT_FLG */
	public List l_ISSUE_CMPLT_FLG = null;

	/** 第 45 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 46 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 47 List変数： l_w_OPR_INST_CD_item */
	public List l_w_OPR_INST_CD_item = null;

	/** 第 48 List変数： l_w_OPR_INST_CD_job */
	public List l_w_OPR_INST_CD_job = null;

	/** 第 49 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 50 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 51 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 52 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 53 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 54 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 55 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 56 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 57 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 58 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 59 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 60 List変数： l_w_UNIT_QTY_TYP */
	public List l_w_UNIT_QTY_TYP = null;

	/** 第 61 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 62 List変数： l_h_ISSUE_TYP */
	public List l_h_ISSUE_TYP = null;

	/** 第 63 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 64 List変数： l_w_RCV_ISSUE_CTRL_CD */
	public List l_w_RCV_ISSUE_CTRL_CD = null;

	/** 第 65 List変数： l_w_RCV_ISSUE_TYP */
	public List l_w_RCV_ISSUE_TYP = null;

	/** 第 66 List変数： l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** 第 67 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 68 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 69 List変数： l_w_RCV_ISSUE_GNR_TYP */
	public List l_w_RCV_ISSUE_GNR_TYP = null;

	/** 第 70 List変数： l_w_STOCK_UPD_TYP */
	public List l_w_STOCK_UPD_TYP = null;

	/** 第 71 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 72 List変数： l_RCV_ISSUE_COMMENT */
	public List l_RCV_ISSUE_COMMENT = null;

	/** 第 73 List変数： l_w_LOT_NO */
	public List l_w_LOT_NO = null;

	/** 第 74 List変数： l_w_WH_NAME */
	public List l_w_WH_NAME = null;

	/** 第 75 List変数： l_w_PLANT_CD_check */
	public List l_w_PLANT_CD_check = null;

	/** 第 76 List変数： l_w_WH_TYP */
	public List l_w_WH_TYP = null;

	/** 第 77 List変数： l_w_MRP_FLG */
	public List l_w_MRP_FLG = null;

	/** 第 78 List変数： l_w_STOCK_ON_HAND_QTY */
	public List l_w_STOCK_ON_HAND_QTY = null;

	/** 第 79 List変数： l_SAVE_JOB_ODR_CD */
	public List l_SAVE_JOB_ODR_CD = null;

	/** 第 80 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 81 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 82 List変数： l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** 第 83 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 84 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 85 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 86 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 87 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 88 List変数： l_RETURNED_CAUSE_CD */
	public List l_RETURNED_CAUSE_CD = null;

	/** 第 89 List変数： l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** 第 90 List変数： l_PARAM_RESULT */
	public List l_PARAM_RESULT = null;

	/** 第 91 List変数： l_h_Param_Div */
	public List l_h_Param_Div = null;

	/** 第 92 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 93 List変数： l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** 第 94 List変数： l_l_TOTAL_ISSUE_QTY */
	public List l_l_TOTAL_ISSUE_QTY = null;

	/** 第 95 List変数： l_l_ISSUE_DATE */
	public List l_l_ISSUE_DATE = null;

	/** 第 96 List変数： l_l_STOCK_ON_HAND_QTY */
	public List l_l_STOCK_ON_HAND_QTY = null;

	/** 第 97 List変数： l_l_DEFECT_QTY */
	public List l_l_DEFECT_QTY = null;

	/** 第 98 List変数： l_l_ALLOCABLE_QTY */
	public List l_l_ALLOCABLE_QTY = null;

	/** 第 99 List変数： l_l_EXTERNAL_LOT_NO */
	public List l_l_EXTERNAL_LOT_NO = null;

	/** 第 100 List変数： l_l_BEST_BEFORE_DATE */
	public List l_l_BEST_BEFORE_DATE = null;

	/** 第 101 List変数： l_l_PRD_CMPLT_DATE */
	public List l_l_PRD_CMPLT_DATE = null;

	/** 第 102 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 103 List変数： l_BBD_c_FLG */
	public List l_BBD_c_FLG = null;

	/** 第 104 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 105 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 106 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_WH_TO_CD() { return m_w_WH_TO_CD; }
	public String getw_WH_FROM_NAME() { return m_w_WH_FROM_NAME; }
	public String getw_WH_TO_NAME() { return m_w_WH_TO_NAME; }
	public String getw_CHOICE_1() { return m_w_CHOICE_1; }
	public String getw_CHOICE_2() { return m_w_CHOICE_2; }
	public String getw_CHOICE_3() { return m_w_CHOICE_3; }
	public String getw_CHOICE() { return m_w_CHOICE; }
	public String getISSUE_CMPLT_NAME() { return m_ISSUE_CMPLT_NAME; }
	public String getCONS_NAME() { return m_CONS_NAME; }
	public String gets_OPR_INST_CD() { return m_s_OPR_INST_CD; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String getOWN_ISSUED_QTY() { return m_OWN_ISSUED_QTY; }
	public String getOTHER_ISSUED_QTY() { return m_OTHER_ISSUED_QTY; }
	public String getITEM_ISSUED_QTY() { return m_ITEM_ISSUED_QTY; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }
	public String geth_WH_FROM_CD() { return m_h_WH_FROM_CD; }
	public String geth_RCV_ISSUE_DATE() { return m_h_RCV_ISSUE_DATE; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getLOT_CTRL_FLG_name() { return m_LOT_CTRL_FLG_name; }
	public String getLOT_CTRL_FLG_val() { return m_LOT_CTRL_FLG_val; }
	public String getw_LOT_CTRL_FLG() { return m_w_LOT_CTRL_FLG; }
	public String getw_OPR_INST_CD() { return m_w_OPR_INST_CD; }
	public String getw_PUCH_ODR_CD() { return m_w_PUCH_ODR_CD; }
	public String getw_ISSUE_INST_CD() { return m_w_ISSUE_INST_CD; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getw_PROC_NAME() { return m_w_PROC_NAME; }
	public String getw_OD_NO() { return m_w_OD_NO; }
	public String getw_WH_FROM_CD() { return m_w_WH_FROM_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_BUSINESS_OPR_DATE() { return m_w_BUSINESS_OPR_DATE; }
	public Integer getISSUE_CMPLT_FLG_val() { return m_ISSUE_CMPLT_FLG_val; }
	public String getISSUE_CMPLT_FLG_name() { return m_ISSUE_CMPLT_FLG_name; }
	public Integer getCONS_TYP_val() { return m_CONS_TYP_val; }
	public String getCONS_TYP_name() { return m_CONS_TYP_name; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public Integer getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getISSUE_INST_QTY() { return m_ISSUE_INST_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getSCDL_ISSUE_DATE() { return m_SCDL_ISSUE_DATE; }
	public String getISSUE_CMPLT_DATE() { return m_ISSUE_CMPLT_DATE; }
	public Integer getISSUE_CMPLT_FLG() { return m_ISSUE_CMPLT_FLG; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getw_OPR_INST_CD_item() { return m_w_OPR_INST_CD_item; }
	public String getw_OPR_INST_CD_job() { return m_w_OPR_INST_CD_job; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public Integer getCONS_TYP() { return m_CONS_TYP; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public Integer getw_UNIT_QTY_TYP() { return m_w_UNIT_QTY_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String geth_ISSUE_TYP() { return m_h_ISSUE_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_RCV_ISSUE_CTRL_CD() { return m_w_RCV_ISSUE_CTRL_CD; }
	public Integer getw_RCV_ISSUE_TYP() { return m_w_RCV_ISSUE_TYP; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getw_RCV_ISSUE_GNR_TYP() { return m_w_RCV_ISSUE_GNR_TYP; }
	public Integer getw_STOCK_UPD_TYP() { return m_w_STOCK_UPD_TYP; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getRCV_ISSUE_COMMENT() { return m_RCV_ISSUE_COMMENT; }
	public String getw_LOT_NO() { return m_w_LOT_NO; }
	public String getw_WH_NAME() { return m_w_WH_NAME; }
	public String getw_PLANT_CD_check() { return m_w_PLANT_CD_check; }
	public Integer getw_WH_TYP() { return m_w_WH_TYP; }
	public Integer getw_MRP_FLG() { return m_w_MRP_FLG; }
	public String getw_STOCK_ON_HAND_QTY() { return m_w_STOCK_ON_HAND_QTY; }
	public String getSAVE_JOB_ODR_CD() { return m_SAVE_JOB_ODR_CD; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRETURNED_CAUSE_CD() { return m_RETURNED_CAUSE_CD; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getPARAM_RESULT() { return m_PARAM_RESULT; }
	public String geth_Param_Div() { return m_h_Param_Div; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_TOTAL_ISSUE_QTY() { return m_l_TOTAL_ISSUE_QTY; }
	public String getl_ISSUE_DATE() { return m_l_ISSUE_DATE; }
	public String getl_STOCK_ON_HAND_QTY() { return m_l_STOCK_ON_HAND_QTY; }
	public String getl_DEFECT_QTY() { return m_l_DEFECT_QTY; }
	public String getl_ALLOCABLE_QTY() { return m_l_ALLOCABLE_QTY; }
	public String getl_EXTERNAL_LOT_NO() { return m_l_EXTERNAL_LOT_NO; }
	public String getl_BEST_BEFORE_DATE() { return m_l_BEST_BEFORE_DATE; }
	public String getl_PRD_CMPLT_DATE() { return m_l_PRD_CMPLT_DATE; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getBBD_c_FLG() { return m_BBD_c_FLG; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }

	public List getList_w_WH_TO_CD() { return l_w_WH_TO_CD; }
	public List getList_w_WH_FROM_NAME() { return l_w_WH_FROM_NAME; }
	public List getList_w_WH_TO_NAME() { return l_w_WH_TO_NAME; }
	public List getList_w_CHOICE_1() { return l_w_CHOICE_1; }
	public List getList_w_CHOICE_2() { return l_w_CHOICE_2; }
	public List getList_w_CHOICE_3() { return l_w_CHOICE_3; }
	public List getList_w_CHOICE() { return l_w_CHOICE; }
	public List getList_ISSUE_CMPLT_NAME() { return l_ISSUE_CMPLT_NAME; }
	public List getList_CONS_NAME() { return l_CONS_NAME; }
	public List getList_s_OPR_INST_CD() { return l_s_OPR_INST_CD; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_OWN_ISSUED_QTY() { return l_OWN_ISSUED_QTY; }
	public List getList_OTHER_ISSUED_QTY() { return l_OTHER_ISSUED_QTY; }
	public List getList_ITEM_ISSUED_QTY() { return l_ITEM_ISSUED_QTY; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }
	public List getList_h_WH_FROM_CD() { return l_h_WH_FROM_CD; }
	public List getList_h_RCV_ISSUE_DATE() { return l_h_RCV_ISSUE_DATE; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_LOT_CTRL_FLG_name() { return l_LOT_CTRL_FLG_name; }
	public List getList_LOT_CTRL_FLG_val() { return l_LOT_CTRL_FLG_val; }
	public List getList_w_LOT_CTRL_FLG() { return l_w_LOT_CTRL_FLG; }
	public List getList_w_OPR_INST_CD() { return l_w_OPR_INST_CD; }
	public List getList_w_PUCH_ODR_CD() { return l_w_PUCH_ODR_CD; }
	public List getList_w_ISSUE_INST_CD() { return l_w_ISSUE_INST_CD; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_w_PROC_NAME() { return l_w_PROC_NAME; }
	public List getList_w_OD_NO() { return l_w_OD_NO; }
	public List getList_w_WH_FROM_CD() { return l_w_WH_FROM_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_BUSINESS_OPR_DATE() { return l_w_BUSINESS_OPR_DATE; }
	public List getList_ISSUE_CMPLT_FLG_val() { return l_ISSUE_CMPLT_FLG_val; }
	public List getList_ISSUE_CMPLT_FLG_name() { return l_ISSUE_CMPLT_FLG_name; }
	public List getList_CONS_TYP_val() { return l_CONS_TYP_val; }
	public List getList_CONS_TYP_name() { return l_CONS_TYP_name; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ISSUE_INST_QTY() { return l_ISSUE_INST_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_SCDL_ISSUE_DATE() { return l_SCDL_ISSUE_DATE; }
	public List getList_ISSUE_CMPLT_DATE() { return l_ISSUE_CMPLT_DATE; }
	public List getList_ISSUE_CMPLT_FLG() { return l_ISSUE_CMPLT_FLG; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_w_OPR_INST_CD_item() { return l_w_OPR_INST_CD_item; }
	public List getList_w_OPR_INST_CD_job() { return l_w_OPR_INST_CD_job; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_UNIT_QTY_TYP() { return l_w_UNIT_QTY_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_h_ISSUE_TYP() { return l_h_ISSUE_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_RCV_ISSUE_CTRL_CD() { return l_w_RCV_ISSUE_CTRL_CD; }
	public List getList_w_RCV_ISSUE_TYP() { return l_w_RCV_ISSUE_TYP; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_w_RCV_ISSUE_GNR_TYP() { return l_w_RCV_ISSUE_GNR_TYP; }
	public List getList_w_STOCK_UPD_TYP() { return l_w_STOCK_UPD_TYP; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_RCV_ISSUE_COMMENT() { return l_RCV_ISSUE_COMMENT; }
	public List getList_w_LOT_NO() { return l_w_LOT_NO; }
	public List getList_w_WH_NAME() { return l_w_WH_NAME; }
	public List getList_w_PLANT_CD_check() { return l_w_PLANT_CD_check; }
	public List getList_w_WH_TYP() { return l_w_WH_TYP; }
	public List getList_w_MRP_FLG() { return l_w_MRP_FLG; }
	public List getList_w_STOCK_ON_HAND_QTY() { return l_w_STOCK_ON_HAND_QTY; }
	public List getList_SAVE_JOB_ODR_CD() { return l_SAVE_JOB_ODR_CD; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RETURNED_CAUSE_CD() { return l_RETURNED_CAUSE_CD; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_PARAM_RESULT() { return l_PARAM_RESULT; }
	public List getList_h_Param_Div() { return l_h_Param_Div; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_TOTAL_ISSUE_QTY() { return l_l_TOTAL_ISSUE_QTY; }
	public List getList_l_ISSUE_DATE() { return l_l_ISSUE_DATE; }
	public List getList_l_STOCK_ON_HAND_QTY() { return l_l_STOCK_ON_HAND_QTY; }
	public List getList_l_DEFECT_QTY() { return l_l_DEFECT_QTY; }
	public List getList_l_ALLOCABLE_QTY() { return l_l_ALLOCABLE_QTY; }
	public List getList_l_EXTERNAL_LOT_NO() { return l_l_EXTERNAL_LOT_NO; }
	public List getList_l_BEST_BEFORE_DATE() { return l_l_BEST_BEFORE_DATE; }
	public List getList_l_PRD_CMPLT_DATE() { return l_l_PRD_CMPLT_DATE; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_BBD_c_FLG() { return l_BBD_c_FLG; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }

	public void setw_WH_TO_CD(String val) { m_w_WH_TO_CD = val; }
	public void setw_WH_FROM_NAME(String val) { m_w_WH_FROM_NAME = val; }
	public void setw_WH_TO_NAME(String val) { m_w_WH_TO_NAME = val; }
	public void setw_CHOICE_1(String val) { m_w_CHOICE_1 = val; }
	public void setw_CHOICE_2(String val) { m_w_CHOICE_2 = val; }
	public void setw_CHOICE_3(String val) { m_w_CHOICE_3 = val; }
	public void setw_CHOICE(String val) { m_w_CHOICE = val; }
	public void setISSUE_CMPLT_NAME(String val) { m_ISSUE_CMPLT_NAME = val; }
	public void setCONS_NAME(String val) { m_CONS_NAME = val; }
	public void sets_OPR_INST_CD(String val) { m_s_OPR_INST_CD = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void setOWN_ISSUED_QTY(String val) { m_OWN_ISSUED_QTY = val; }
	public void setOTHER_ISSUED_QTY(String val) { m_OTHER_ISSUED_QTY = val; }
	public void setITEM_ISSUED_QTY(String val) { m_ITEM_ISSUED_QTY = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }
	public void seth_WH_FROM_CD(String val) { m_h_WH_FROM_CD = val; }
	public void seth_RCV_ISSUE_DATE(String val) { m_h_RCV_ISSUE_DATE = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setLOT_CTRL_FLG_name(String val) { m_LOT_CTRL_FLG_name = val; }
	public void setLOT_CTRL_FLG_val(String val) { m_LOT_CTRL_FLG_val = val; }
	public void setw_LOT_CTRL_FLG(String val) { m_w_LOT_CTRL_FLG = val; }
	public void setw_OPR_INST_CD(String val) { m_w_OPR_INST_CD = val; }
	public void setw_PUCH_ODR_CD(String val) { m_w_PUCH_ODR_CD = val; }
	public void setw_ISSUE_INST_CD(String val) { m_w_ISSUE_INST_CD = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setw_PROC_NAME(String val) { m_w_PROC_NAME = val; }
	public void setw_OD_NO(String val) { m_w_OD_NO = val; }
	public void setw_WH_FROM_CD(String val) { m_w_WH_FROM_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_BUSINESS_OPR_DATE(String val) { m_w_BUSINESS_OPR_DATE = val; }
	public void setISSUE_CMPLT_FLG_val(Integer val) { m_ISSUE_CMPLT_FLG_val = val; }
	public void setISSUE_CMPLT_FLG_name(String val) { m_ISSUE_CMPLT_FLG_name = val; }
	public void setCONS_TYP_val(Integer val) { m_CONS_TYP_val = val; }
	public void setCONS_TYP_name(String val) { m_CONS_TYP_name = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(Integer val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setISSUE_INST_QTY(String val) { m_ISSUE_INST_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setSCDL_ISSUE_DATE(String val) { m_SCDL_ISSUE_DATE = val; }
	public void setISSUE_CMPLT_DATE(String val) { m_ISSUE_CMPLT_DATE = val; }
	public void setISSUE_CMPLT_FLG(Integer val) { m_ISSUE_CMPLT_FLG = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setw_OPR_INST_CD_item(String val) { m_w_OPR_INST_CD_item = val; }
	public void setw_OPR_INST_CD_job(String val) { m_w_OPR_INST_CD_job = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setCONS_TYP(Integer val) { m_CONS_TYP = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_UNIT_QTY_TYP(Integer val) { m_w_UNIT_QTY_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void seth_ISSUE_TYP(String val) { m_h_ISSUE_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_RCV_ISSUE_CTRL_CD(String val) { m_w_RCV_ISSUE_CTRL_CD = val; }
	public void setw_RCV_ISSUE_TYP(Integer val) { m_w_RCV_ISSUE_TYP = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setw_RCV_ISSUE_GNR_TYP(Integer val) { m_w_RCV_ISSUE_GNR_TYP = val; }
	public void setw_STOCK_UPD_TYP(Integer val) { m_w_STOCK_UPD_TYP = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setRCV_ISSUE_COMMENT(String val) { m_RCV_ISSUE_COMMENT = val; }
	public void setw_LOT_NO(String val) { m_w_LOT_NO = val; }
	public void setw_WH_NAME(String val) { m_w_WH_NAME = val; }
	public void setw_PLANT_CD_check(String val) { m_w_PLANT_CD_check = val; }
	public void setw_WH_TYP(Integer val) { m_w_WH_TYP = val; }
	public void setw_MRP_FLG(Integer val) { m_w_MRP_FLG = val; }
	public void setw_STOCK_ON_HAND_QTY(String val) { m_w_STOCK_ON_HAND_QTY = val; }
	public void setSAVE_JOB_ODR_CD(String val) { m_SAVE_JOB_ODR_CD = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRETURNED_CAUSE_CD(String val) { m_RETURNED_CAUSE_CD = val; }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = val; }
	public void setPARAM_RESULT(String val) { m_PARAM_RESULT = val; }
	public void seth_Param_Div(String val) { m_h_Param_Div = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_TOTAL_ISSUE_QTY(String val) { m_l_TOTAL_ISSUE_QTY = val; }
	public void setl_ISSUE_DATE(String val) { m_l_ISSUE_DATE = val; }
	public void setl_STOCK_ON_HAND_QTY(String val) { m_l_STOCK_ON_HAND_QTY = val; }
	public void setl_DEFECT_QTY(String val) { m_l_DEFECT_QTY = val; }
	public void setl_ALLOCABLE_QTY(String val) { m_l_ALLOCABLE_QTY = val; }
	public void setl_EXTERNAL_LOT_NO(String val) { m_l_EXTERNAL_LOT_NO = val; }
	public void setl_BEST_BEFORE_DATE(String val) { m_l_BEST_BEFORE_DATE = val; }
	public void setl_PRD_CMPLT_DATE(String val) { m_l_PRD_CMPLT_DATE = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setBBD_c_FLG(String val) { m_BBD_c_FLG = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }

	public void setISSUE_CMPLT_FLG_val(String val) { m_ISSUE_CMPLT_FLG_val = getInteger(val); }
	public void setCONS_TYP_val(String val) { m_CONS_TYP_val = getInteger(val); }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = getInteger(val); }
	public void setISSUE_CMPLT_FLG(String val) { m_ISSUE_CMPLT_FLG = getInteger(val); }
	public void setCONS_TYP(String val) { m_CONS_TYP = getInteger(val); }
	public void setw_UNIT_QTY_TYP(String val) { m_w_UNIT_QTY_TYP = getInteger(val); }
	public void setw_RCV_ISSUE_TYP(String val) { m_w_RCV_ISSUE_TYP = getInteger(val); }
	public void setw_RCV_ISSUE_GNR_TYP(String val) { m_w_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setw_STOCK_UPD_TYP(String val) { m_w_STOCK_UPD_TYP = getInteger(val); }
	public void setw_WH_TYP(String val) { m_w_WH_TYP = getInteger(val); }
	public void setw_MRP_FLG(String val) { m_w_MRP_FLG = getInteger(val); }

	public void setList_w_WH_TO_CD(List list) { l_w_WH_TO_CD = list; }
	public void setList_w_WH_FROM_NAME(List list) { l_w_WH_FROM_NAME = list; }
	public void setList_w_WH_TO_NAME(List list) { l_w_WH_TO_NAME = list; }
	public void setList_w_CHOICE_1(List list) { l_w_CHOICE_1 = list; }
	public void setList_w_CHOICE_2(List list) { l_w_CHOICE_2 = list; }
	public void setList_w_CHOICE_3(List list) { l_w_CHOICE_3 = list; }
	public void setList_w_CHOICE(List list) { l_w_CHOICE = list; }
	public void setList_ISSUE_CMPLT_NAME(List list) { l_ISSUE_CMPLT_NAME = list; }
	public void setList_CONS_NAME(List list) { l_CONS_NAME = list; }
	public void setList_s_OPR_INST_CD(List list) { l_s_OPR_INST_CD = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_OWN_ISSUED_QTY(List list) { l_OWN_ISSUED_QTY = list; }
	public void setList_OTHER_ISSUED_QTY(List list) { l_OTHER_ISSUED_QTY = list; }
	public void setList_ITEM_ISSUED_QTY(List list) { l_ITEM_ISSUED_QTY = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }
	public void setList_h_WH_FROM_CD(List list) { l_h_WH_FROM_CD = list; }
	public void setList_h_RCV_ISSUE_DATE(List list) { l_h_RCV_ISSUE_DATE = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_LOT_CTRL_FLG_name(List list) { l_LOT_CTRL_FLG_name = list; }
	public void setList_LOT_CTRL_FLG_val(List list) { l_LOT_CTRL_FLG_val = list; }
	public void setList_w_LOT_CTRL_FLG(List list) { l_w_LOT_CTRL_FLG = list; }
	public void setList_w_OPR_INST_CD(List list) { l_w_OPR_INST_CD = list; }
	public void setList_w_PUCH_ODR_CD(List list) { l_w_PUCH_ODR_CD = list; }
	public void setList_w_ISSUE_INST_CD(List list) { l_w_ISSUE_INST_CD = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_w_PROC_NAME(List list) { l_w_PROC_NAME = list; }
	public void setList_w_OD_NO(List list) { l_w_OD_NO = list; }
	public void setList_w_WH_FROM_CD(List list) { l_w_WH_FROM_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_BUSINESS_OPR_DATE(List list) { l_w_BUSINESS_OPR_DATE = list; }
	public void setList_ISSUE_CMPLT_FLG_val(List list) { l_ISSUE_CMPLT_FLG_val = list; }
	public void setList_ISSUE_CMPLT_FLG_name(List list) { l_ISSUE_CMPLT_FLG_name = list; }
	public void setList_CONS_TYP_val(List list) { l_CONS_TYP_val = list; }
	public void setList_CONS_TYP_name(List list) { l_CONS_TYP_name = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ISSUE_INST_QTY(List list) { l_ISSUE_INST_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_SCDL_ISSUE_DATE(List list) { l_SCDL_ISSUE_DATE = list; }
	public void setList_ISSUE_CMPLT_DATE(List list) { l_ISSUE_CMPLT_DATE = list; }
	public void setList_ISSUE_CMPLT_FLG(List list) { l_ISSUE_CMPLT_FLG = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_w_OPR_INST_CD_item(List list) { l_w_OPR_INST_CD_item = list; }
	public void setList_w_OPR_INST_CD_job(List list) { l_w_OPR_INST_CD_job = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_UNIT_QTY_TYP(List list) { l_w_UNIT_QTY_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_h_ISSUE_TYP(List list) { l_h_ISSUE_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_RCV_ISSUE_CTRL_CD(List list) { l_w_RCV_ISSUE_CTRL_CD = list; }
	public void setList_w_RCV_ISSUE_TYP(List list) { l_w_RCV_ISSUE_TYP = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_w_RCV_ISSUE_GNR_TYP(List list) { l_w_RCV_ISSUE_GNR_TYP = list; }
	public void setList_w_STOCK_UPD_TYP(List list) { l_w_STOCK_UPD_TYP = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_RCV_ISSUE_COMMENT(List list) { l_RCV_ISSUE_COMMENT = list; }
	public void setList_w_LOT_NO(List list) { l_w_LOT_NO = list; }
	public void setList_w_WH_NAME(List list) { l_w_WH_NAME = list; }
	public void setList_w_PLANT_CD_check(List list) { l_w_PLANT_CD_check = list; }
	public void setList_w_WH_TYP(List list) { l_w_WH_TYP = list; }
	public void setList_w_MRP_FLG(List list) { l_w_MRP_FLG = list; }
	public void setList_w_STOCK_ON_HAND_QTY(List list) { l_w_STOCK_ON_HAND_QTY = list; }
	public void setList_SAVE_JOB_ODR_CD(List list) { l_SAVE_JOB_ODR_CD = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RETURNED_CAUSE_CD(List list) { l_RETURNED_CAUSE_CD = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_PARAM_RESULT(List list) { l_PARAM_RESULT = list; }
	public void setList_h_Param_Div(List list) { l_h_Param_Div = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_TOTAL_ISSUE_QTY(List list) { l_l_TOTAL_ISSUE_QTY = list; }
	public void setList_l_ISSUE_DATE(List list) { l_l_ISSUE_DATE = list; }
	public void setList_l_STOCK_ON_HAND_QTY(List list) { l_l_STOCK_ON_HAND_QTY = list; }
	public void setList_l_DEFECT_QTY(List list) { l_l_DEFECT_QTY = list; }
	public void setList_l_ALLOCABLE_QTY(List list) { l_l_ALLOCABLE_QTY = list; }
	public void setList_l_EXTERNAL_LOT_NO(List list) { l_l_EXTERNAL_LOT_NO = list; }
	public void setList_l_BEST_BEFORE_DATE(List list) { l_l_BEST_BEFORE_DATE = list; }
	public void setList_l_PRD_CMPLT_DATE(List list) { l_l_PRD_CMPLT_DATE = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_BBD_c_FLG(List list) { l_BBD_c_FLG = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }

	public int setL2L_w_WH_TO_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_TO_CD == null) {
			l_w_WH_TO_CD = new ArrayList();
		} else {
			l_w_WH_TO_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_TO_CD.add(((AF0080010Struct) list.get(i)).getw_WH_TO_CD());
		}
		return size;
	}
	public int setL2L_w_WH_FROM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_FROM_NAME == null) {
			l_w_WH_FROM_NAME = new ArrayList();
		} else {
			l_w_WH_FROM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_FROM_NAME.add(((AF0080010Struct) list.get(i)).getw_WH_FROM_NAME());
		}
		return size;
	}
	public int setL2L_w_WH_TO_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_TO_NAME == null) {
			l_w_WH_TO_NAME = new ArrayList();
		} else {
			l_w_WH_TO_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_TO_NAME.add(((AF0080010Struct) list.get(i)).getw_WH_TO_NAME());
		}
		return size;
	}
	public int setL2L_w_CHOICE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHOICE_1 == null) {
			l_w_CHOICE_1 = new ArrayList();
		} else {
			l_w_CHOICE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHOICE_1.add(((AF0080010Struct) list.get(i)).getw_CHOICE_1());
		}
		return size;
	}
	public int setL2L_w_CHOICE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHOICE_2 == null) {
			l_w_CHOICE_2 = new ArrayList();
		} else {
			l_w_CHOICE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHOICE_2.add(((AF0080010Struct) list.get(i)).getw_CHOICE_2());
		}
		return size;
	}
	public int setL2L_w_CHOICE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHOICE_3 == null) {
			l_w_CHOICE_3 = new ArrayList();
		} else {
			l_w_CHOICE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHOICE_3.add(((AF0080010Struct) list.get(i)).getw_CHOICE_3());
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
			l_w_CHOICE.add(((AF0080010Struct) list.get(i)).getw_CHOICE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_NAME == null) {
			l_ISSUE_CMPLT_NAME = new ArrayList();
		} else {
			l_ISSUE_CMPLT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_NAME.add(((AF0080010Struct) list.get(i)).getISSUE_CMPLT_NAME());
		}
		return size;
	}
	public int setL2L_CONS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_NAME == null) {
			l_CONS_NAME = new ArrayList();
		} else {
			l_CONS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_NAME.add(((AF0080010Struct) list.get(i)).getCONS_NAME());
		}
		return size;
	}
	public int setL2L_s_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OPR_INST_CD == null) {
			l_s_OPR_INST_CD = new ArrayList();
		} else {
			l_s_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OPR_INST_CD.add(((AF0080010Struct) list.get(i)).gets_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD == null) {
			l_c_JOB_ODR_CD = new ArrayList();
		} else {
			l_c_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD.add(((AF0080010Struct) list.get(i)).getc_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_OWN_ISSUED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_ISSUED_QTY == null) {
			l_OWN_ISSUED_QTY = new ArrayList();
		} else {
			l_OWN_ISSUED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_ISSUED_QTY.add(((AF0080010Struct) list.get(i)).getOWN_ISSUED_QTY());
		}
		return size;
	}
	public int setL2L_OTHER_ISSUED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_ISSUED_QTY == null) {
			l_OTHER_ISSUED_QTY = new ArrayList();
		} else {
			l_OTHER_ISSUED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_ISSUED_QTY.add(((AF0080010Struct) list.get(i)).getOTHER_ISSUED_QTY());
		}
		return size;
	}
	public int setL2L_ITEM_ISSUED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_ISSUED_QTY == null) {
			l_ITEM_ISSUED_QTY = new ArrayList();
		} else {
			l_ITEM_ISSUED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_ISSUED_QTY.add(((AF0080010Struct) list.get(i)).getITEM_ISSUED_QTY());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD == null) {
			l_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD.add(((AF0080010Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_WH_FROM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WH_FROM_CD == null) {
			l_h_WH_FROM_CD = new ArrayList();
		} else {
			l_h_WH_FROM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WH_FROM_CD.add(((AF0080010Struct) list.get(i)).geth_WH_FROM_CD());
		}
		return size;
	}
	public int setL2L_h_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RCV_ISSUE_DATE == null) {
			l_h_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_h_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RCV_ISSUE_DATE.add(((AF0080010Struct) list.get(i)).geth_RCV_ISSUE_DATE());
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
			l_h_lotCtrl.add(((AF0080010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG_name == null) {
			l_LOT_CTRL_FLG_name = new ArrayList();
		} else {
			l_LOT_CTRL_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG_name.add(((AF0080010Struct) list.get(i)).getLOT_CTRL_FLG_name());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG_val == null) {
			l_LOT_CTRL_FLG_val = new ArrayList();
		} else {
			l_LOT_CTRL_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG_val.add(((AF0080010Struct) list.get(i)).getLOT_CTRL_FLG_val());
		}
		return size;
	}
	public int setL2L_w_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LOT_CTRL_FLG == null) {
			l_w_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_w_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LOT_CTRL_FLG.add(((AF0080010Struct) list.get(i)).getw_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_w_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OPR_INST_CD == null) {
			l_w_OPR_INST_CD = new ArrayList();
		} else {
			l_w_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OPR_INST_CD.add(((AF0080010Struct) list.get(i)).getw_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_w_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PUCH_ODR_CD == null) {
			l_w_PUCH_ODR_CD = new ArrayList();
		} else {
			l_w_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PUCH_ODR_CD.add(((AF0080010Struct) list.get(i)).getw_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ISSUE_INST_CD == null) {
			l_w_ISSUE_INST_CD = new ArrayList();
		} else {
			l_w_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ISSUE_INST_CD.add(((AF0080010Struct) list.get(i)).getw_ISSUE_INST_CD());
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
			l_w_COMPANY_CD.add(((AF0080010Struct) list.get(i)).getw_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_w_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PROC_NAME == null) {
			l_w_PROC_NAME = new ArrayList();
		} else {
			l_w_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PROC_NAME.add(((AF0080010Struct) list.get(i)).getw_PROC_NAME());
		}
		return size;
	}
	public int setL2L_w_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_NO == null) {
			l_w_OD_NO = new ArrayList();
		} else {
			l_w_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_NO.add(((AF0080010Struct) list.get(i)).getw_OD_NO());
		}
		return size;
	}
	public int setL2L_w_WH_FROM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_FROM_CD == null) {
			l_w_WH_FROM_CD = new ArrayList();
		} else {
			l_w_WH_FROM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_FROM_CD.add(((AF0080010Struct) list.get(i)).getw_WH_FROM_CD());
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
			l_w_PLANT_CD.add(((AF0080010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BUSINESS_OPR_DATE == null) {
			l_w_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_w_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BUSINESS_OPR_DATE.add(((AF0080010Struct) list.get(i)).getw_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_FLG_val == null) {
			l_ISSUE_CMPLT_FLG_val = new ArrayList();
		} else {
			l_ISSUE_CMPLT_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_FLG_val.add(((AF0080010Struct) list.get(i)).getISSUE_CMPLT_FLG_val());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_FLG_name == null) {
			l_ISSUE_CMPLT_FLG_name = new ArrayList();
		} else {
			l_ISSUE_CMPLT_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_FLG_name.add(((AF0080010Struct) list.get(i)).getISSUE_CMPLT_FLG_name());
		}
		return size;
	}
	public int setL2L_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP_val == null) {
			l_CONS_TYP_val = new ArrayList();
		} else {
			l_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP_val.add(((AF0080010Struct) list.get(i)).getCONS_TYP_val());
		}
		return size;
	}
	public int setL2L_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP_name == null) {
			l_CONS_TYP_name = new ArrayList();
		} else {
			l_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP_name.add(((AF0080010Struct) list.get(i)).getCONS_TYP_name());
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
			l_ISSUE_INST_CD.add(((AF0080010Struct) list.get(i)).getISSUE_INST_CD());
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
			l_JOB_ODR_CD.add(((AF0080010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AF0080010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_ITEM_CD.add(((AF0080010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AF0080010Struct) list.get(i)).getITEM_NAME());
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
			l_ISSUE_INST_QTY.add(((AF0080010Struct) list.get(i)).getISSUE_INST_QTY());
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
			l_TOTAL_ISSUE_QTY.add(((AF0080010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
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
			l_SCDL_ISSUE_DATE.add(((AF0080010Struct) list.get(i)).getSCDL_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_DATE == null) {
			l_ISSUE_CMPLT_DATE = new ArrayList();
		} else {
			l_ISSUE_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_DATE.add(((AF0080010Struct) list.get(i)).getISSUE_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_FLG == null) {
			l_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_FLG.add(((AF0080010Struct) list.get(i)).getISSUE_CMPLT_FLG());
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
			l_WH_CD.add(((AF0080010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AF0080010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_w_OPR_INST_CD_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OPR_INST_CD_item == null) {
			l_w_OPR_INST_CD_item = new ArrayList();
		} else {
			l_w_OPR_INST_CD_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OPR_INST_CD_item.add(((AF0080010Struct) list.get(i)).getw_OPR_INST_CD_item());
		}
		return size;
	}
	public int setL2L_w_OPR_INST_CD_job(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OPR_INST_CD_job == null) {
			l_w_OPR_INST_CD_job = new ArrayList();
		} else {
			l_w_OPR_INST_CD_job.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OPR_INST_CD_job.add(((AF0080010Struct) list.get(i)).getw_OPR_INST_CD_job());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AF0080010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_NAME == null) {
			l_WS_NAME = new ArrayList();
		} else {
			l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_NAME.add(((AF0080010Struct) list.get(i)).getWS_NAME());
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
			l_WORK_ODR_CD.add(((AF0080010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_WORK_IN_PROC_CD.add(((AF0080010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PUCH_ODR_CD.add(((AF0080010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_VEND_CD.add(((AF0080010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ANAME == null) {
			l_VEND_ANAME = new ArrayList();
		} else {
			l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ANAME.add(((AF0080010Struct) list.get(i)).getVEND_ANAME());
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
			l_CONS_TYP.add(((AF0080010Struct) list.get(i)).getCONS_TYP());
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
			l_DRAW_CD.add(((AF0080010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0080010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0080010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_w_UNIT_QTY_TYP.add(((AF0080010Struct) list.get(i)).getw_UNIT_QTY_TYP());
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
			l_MRP_ODR_TYP.add(((AF0080010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_TYP == null) {
			l_h_ISSUE_TYP = new ArrayList();
		} else {
			l_h_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_TYP.add(((AF0080010Struct) list.get(i)).geth_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG == null) {
			l_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG.add(((AF0080010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_w_RCV_ISSUE_CTRL_CD.add(((AF0080010Struct) list.get(i)).getw_RCV_ISSUE_CTRL_CD());
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
			l_w_RCV_ISSUE_TYP.add(((AF0080010Struct) list.get(i)).getw_RCV_ISSUE_TYP());
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
			l_w_WH_CD.add(((AF0080010Struct) list.get(i)).getw_WH_CD());
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
			l_RCV_ISSUE_QTY.add(((AF0080010Struct) list.get(i)).getRCV_ISSUE_QTY());
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
			l_RCV_ISSUE_DATE.add(((AF0080010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_w_RCV_ISSUE_GNR_TYP.add(((AF0080010Struct) list.get(i)).getw_RCV_ISSUE_GNR_TYP());
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
			l_w_STOCK_UPD_TYP.add(((AF0080010Struct) list.get(i)).getw_STOCK_UPD_TYP());
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
			l_VEND_LOT_NO.add(((AF0080010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_RCV_ISSUE_COMMENT.add(((AF0080010Struct) list.get(i)).getRCV_ISSUE_COMMENT());
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
			l_w_LOT_NO.add(((AF0080010Struct) list.get(i)).getw_LOT_NO());
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
			l_w_WH_NAME.add(((AF0080010Struct) list.get(i)).getw_WH_NAME());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD_check(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD_check == null) {
			l_w_PLANT_CD_check = new ArrayList();
		} else {
			l_w_PLANT_CD_check.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD_check.add(((AF0080010Struct) list.get(i)).getw_PLANT_CD_check());
		}
		return size;
	}
	public int setL2L_w_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_TYP == null) {
			l_w_WH_TYP = new ArrayList();
		} else {
			l_w_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_TYP.add(((AF0080010Struct) list.get(i)).getw_WH_TYP());
		}
		return size;
	}
	public int setL2L_w_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_FLG == null) {
			l_w_MRP_FLG = new ArrayList();
		} else {
			l_w_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_FLG.add(((AF0080010Struct) list.get(i)).getw_MRP_FLG());
		}
		return size;
	}
	public int setL2L_w_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_ON_HAND_QTY == null) {
			l_w_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_ON_HAND_QTY.add(((AF0080010Struct) list.get(i)).getw_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_SAVE_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAVE_JOB_ODR_CD == null) {
			l_SAVE_JOB_ODR_CD = new ArrayList();
		} else {
			l_SAVE_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAVE_JOB_ODR_CD.add(((AF0080010Struct) list.get(i)).getSAVE_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_THIS_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_THIS_MONTH == null) {
			l_THIS_MONTH = new ArrayList();
		} else {
			l_THIS_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_THIS_MONTH.add(((AF0080010Struct) list.get(i)).getTHIS_MONTH());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((AF0080010Struct) list.get(i)).getINSTALL_FLG());
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
			l_ONEROUS_CONS_NO.add(((AF0080010Struct) list.get(i)).getONEROUS_CONS_NO());
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
			l_COMPANY_CD.add(((AF0080010Struct) list.get(i)).getCOMPANY_CD());
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
			l_PLANT_CD.add(((AF0080010Struct) list.get(i)).getPLANT_CD());
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
			l_UNIT_COST.add(((AF0080010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AF0080010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_RCV_ISSUE_CTRL_CD.add(((AF0080010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_RETURNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_CAUSE_CD == null) {
			l_RETURNED_CAUSE_CD = new ArrayList();
		} else {
			l_RETURNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_CAUSE_CD.add(((AF0080010Struct) list.get(i)).getRETURNED_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_ONEROUS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_FLG == null) {
			l_ONEROUS_FLG = new ArrayList();
		} else {
			l_ONEROUS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_FLG.add(((AF0080010Struct) list.get(i)).getONEROUS_FLG());
		}
		return size;
	}
	public int setL2L_PARAM_RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARAM_RESULT == null) {
			l_PARAM_RESULT = new ArrayList();
		} else {
			l_PARAM_RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARAM_RESULT.add(((AF0080010Struct) list.get(i)).getPARAM_RESULT());
		}
		return size;
	}
	public int setL2L_h_Param_Div(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Param_Div == null) {
			l_h_Param_Div = new ArrayList();
		} else {
			l_h_Param_Div.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Param_Div.add(((AF0080010Struct) list.get(i)).geth_Param_Div());
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
			l_PROC_EXEC_DATE.add(((AF0080010Struct) list.get(i)).getPROC_EXEC_DATE());
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
			l_l_LOT_NO.add(((AF0080010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_ISSUE_QTY == null) {
			l_l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_ISSUE_QTY.add(((AF0080010Struct) list.get(i)).getl_TOTAL_ISSUE_QTY());
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
			l_l_ISSUE_DATE.add(((AF0080010Struct) list.get(i)).getl_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_l_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_ON_HAND_QTY == null) {
			l_l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_ON_HAND_QTY.add(((AF0080010Struct) list.get(i)).getl_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_l_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_QTY == null) {
			l_l_DEFECT_QTY = new ArrayList();
		} else {
			l_l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_QTY.add(((AF0080010Struct) list.get(i)).getl_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_l_ALLOCABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALLOCABLE_QTY == null) {
			l_l_ALLOCABLE_QTY = new ArrayList();
		} else {
			l_l_ALLOCABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALLOCABLE_QTY.add(((AF0080010Struct) list.get(i)).getl_ALLOCABLE_QTY());
		}
		return size;
	}
	public int setL2L_l_EXTERNAL_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXTERNAL_LOT_NO == null) {
			l_l_EXTERNAL_LOT_NO = new ArrayList();
		} else {
			l_l_EXTERNAL_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXTERNAL_LOT_NO.add(((AF0080010Struct) list.get(i)).getl_EXTERNAL_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_BEST_BEFORE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_BEST_BEFORE_DATE == null) {
			l_l_BEST_BEFORE_DATE = new ArrayList();
		} else {
			l_l_BEST_BEFORE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_BEST_BEFORE_DATE.add(((AF0080010Struct) list.get(i)).getl_BEST_BEFORE_DATE());
		}
		return size;
	}
	public int setL2L_l_PRD_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_CMPLT_DATE == null) {
			l_l_PRD_CMPLT_DATE = new ArrayList();
		} else {
			l_l_PRD_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_CMPLT_DATE.add(((AF0080010Struct) list.get(i)).getl_PRD_CMPLT_DATE());
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
			l_l_STOCK_UNIT.add(((AF0080010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_BBD_c_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BBD_c_FLG == null) {
			l_BBD_c_FLG = new ArrayList();
		} else {
			l_BBD_c_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BBD_c_FLG.add(((AF0080010Struct) list.get(i)).getBBD_c_FLG());
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
			l_l_COUNT.add(((AF0080010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AF0080010Struct) list.get(i)).getROW_COUNT());
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
			l_l_MODIFY_COUNT.add(((AF0080010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_WH_TO_CD = null;
		m_w_WH_FROM_NAME = null;
		m_w_WH_TO_NAME = null;
		m_w_CHOICE_1 = null;
		m_w_CHOICE_2 = null;
		m_w_CHOICE_3 = null;
		m_w_CHOICE = null;
		m_ISSUE_CMPLT_NAME = null;
		m_CONS_NAME = null;
		m_s_OPR_INST_CD = null;
		m_c_JOB_ODR_CD = null;
		m_OWN_ISSUED_QTY = null;
		m_OTHER_ISSUED_QTY = null;
		m_ITEM_ISSUED_QTY = null;
		m_h_JOB_ODR_CD = null;
		m_h_WH_FROM_CD = null;
		m_h_RCV_ISSUE_DATE = null;
		m_h_lotCtrl = null;
		m_LOT_CTRL_FLG_name = null;
		m_LOT_CTRL_FLG_val = null;
		m_w_LOT_CTRL_FLG = null;
		m_w_OPR_INST_CD = null;
		m_w_PUCH_ODR_CD = null;
		m_w_ISSUE_INST_CD = null;
		m_w_COMPANY_CD = null;
		m_w_PROC_NAME = null;
		m_w_OD_NO = null;
		m_w_WH_FROM_CD = null;
		m_w_PLANT_CD = null;
		m_w_BUSINESS_OPR_DATE = null;
		m_ISSUE_CMPLT_FLG_val = null;
		m_ISSUE_CMPLT_FLG_name = null;
		m_CONS_TYP_val = null;
		m_CONS_TYP_name = null;
		m_ISSUE_INST_CD = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_ISSUE_INST_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_SCDL_ISSUE_DATE = null;
		m_ISSUE_CMPLT_DATE = null;
		m_ISSUE_CMPLT_FLG = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_w_OPR_INST_CD_item = null;
		m_w_OPR_INST_CD_job = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PUCH_ODR_CD = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_CONS_TYP = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_w_UNIT_QTY_TYP = null;
		m_MRP_ODR_TYP = null;
		m_h_ISSUE_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_w_RCV_ISSUE_CTRL_CD = null;
		m_w_RCV_ISSUE_TYP = null;
		m_w_WH_CD = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_w_RCV_ISSUE_GNR_TYP = null;
		m_w_STOCK_UPD_TYP = null;
		m_VEND_LOT_NO = null;
		m_RCV_ISSUE_COMMENT = null;
		m_w_LOT_NO = null;
		m_w_WH_NAME = null;
		m_w_PLANT_CD_check = null;
		m_w_WH_TYP = null;
		m_w_MRP_FLG = null;
		m_w_STOCK_ON_HAND_QTY = null;
		m_SAVE_JOB_ODR_CD = null;
		m_THIS_MONTH = null;
		m_INSTALL_FLG = null;
		m_ONEROUS_CONS_NO = null;
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RETURNED_CAUSE_CD = null;
		m_ONEROUS_FLG = null;
		m_PARAM_RESULT = null;
		m_h_Param_Div = null;
		m_PROC_EXEC_DATE = null;
		m_l_LOT_NO = null;
		m_l_TOTAL_ISSUE_QTY = null;
		m_l_ISSUE_DATE = null;
		m_l_STOCK_ON_HAND_QTY = null;
		m_l_DEFECT_QTY = null;
		m_l_ALLOCABLE_QTY = null;
		m_l_EXTERNAL_LOT_NO = null;
		m_l_BEST_BEFORE_DATE = null;
		m_l_PRD_CMPLT_DATE = null;
		m_l_STOCK_UNIT = null;
		m_BBD_c_FLG = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_l_MODIFY_COUNT = null;

		l_w_WH_TO_CD = null;
		l_w_WH_FROM_NAME = null;
		l_w_WH_TO_NAME = null;
		l_w_CHOICE_1 = null;
		l_w_CHOICE_2 = null;
		l_w_CHOICE_3 = null;
		l_w_CHOICE = null;
		l_ISSUE_CMPLT_NAME = null;
		l_CONS_NAME = null;
		l_s_OPR_INST_CD = null;
		l_c_JOB_ODR_CD = null;
		l_OWN_ISSUED_QTY = null;
		l_OTHER_ISSUED_QTY = null;
		l_ITEM_ISSUED_QTY = null;
		l_h_JOB_ODR_CD = null;
		l_h_WH_FROM_CD = null;
		l_h_RCV_ISSUE_DATE = null;
		l_h_lotCtrl = null;
		l_LOT_CTRL_FLG_name = null;
		l_LOT_CTRL_FLG_val = null;
		l_w_LOT_CTRL_FLG = null;
		l_w_OPR_INST_CD = null;
		l_w_PUCH_ODR_CD = null;
		l_w_ISSUE_INST_CD = null;
		l_w_COMPANY_CD = null;
		l_w_PROC_NAME = null;
		l_w_OD_NO = null;
		l_w_WH_FROM_CD = null;
		l_w_PLANT_CD = null;
		l_w_BUSINESS_OPR_DATE = null;
		l_ISSUE_CMPLT_FLG_val = null;
		l_ISSUE_CMPLT_FLG_name = null;
		l_CONS_TYP_val = null;
		l_CONS_TYP_name = null;
		l_ISSUE_INST_CD = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_SCDL_ISSUE_DATE = null;
		l_ISSUE_CMPLT_DATE = null;
		l_ISSUE_CMPLT_FLG = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_w_OPR_INST_CD_item = null;
		l_w_OPR_INST_CD_job = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PUCH_ODR_CD = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_CONS_TYP = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_w_UNIT_QTY_TYP = null;
		l_MRP_ODR_TYP = null;
		l_h_ISSUE_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_w_RCV_ISSUE_CTRL_CD = null;
		l_w_RCV_ISSUE_TYP = null;
		l_w_WH_CD = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_w_RCV_ISSUE_GNR_TYP = null;
		l_w_STOCK_UPD_TYP = null;
		l_VEND_LOT_NO = null;
		l_RCV_ISSUE_COMMENT = null;
		l_w_LOT_NO = null;
		l_w_WH_NAME = null;
		l_w_PLANT_CD_check = null;
		l_w_WH_TYP = null;
		l_w_MRP_FLG = null;
		l_w_STOCK_ON_HAND_QTY = null;
		l_SAVE_JOB_ODR_CD = null;
		l_THIS_MONTH = null;
		l_INSTALL_FLG = null;
		l_ONEROUS_CONS_NO = null;
		l_COMPANY_CD = null;
		l_PLANT_CD = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RETURNED_CAUSE_CD = null;
		l_ONEROUS_FLG = null;
		l_PARAM_RESULT = null;
		l_h_Param_Div = null;
		l_PROC_EXEC_DATE = null;
		l_l_LOT_NO = null;
		l_l_TOTAL_ISSUE_QTY = null;
		l_l_ISSUE_DATE = null;
		l_l_STOCK_ON_HAND_QTY = null;
		l_l_DEFECT_QTY = null;
		l_l_ALLOCABLE_QTY = null;
		l_l_EXTERNAL_LOT_NO = null;
		l_l_BEST_BEFORE_DATE = null;
		l_l_PRD_CMPLT_DATE = null;
		l_l_STOCK_UNIT = null;
		l_BBD_c_FLG = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_l_MODIFY_COUNT = null;

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
	 * medAF0080010クラスの標準コンストラクタ
	 */
	public AF0080010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
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
	public void setStruct(AF0080010Struct struct)
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
	public void setStructM(AF0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_WH_TO_CD(struct.getw_WH_TO_CD());
			this.setw_WH_FROM_NAME(struct.getw_WH_FROM_NAME());
			this.setw_WH_TO_NAME(struct.getw_WH_TO_NAME());
			this.setw_CHOICE_1(struct.getw_CHOICE_1());
			this.setw_CHOICE_2(struct.getw_CHOICE_2());
			this.setw_CHOICE_3(struct.getw_CHOICE_3());
			this.setw_CHOICE(struct.getw_CHOICE());
			this.setISSUE_CMPLT_NAME(struct.getISSUE_CMPLT_NAME());
			this.setCONS_NAME(struct.getCONS_NAME());
			this.sets_OPR_INST_CD(struct.gets_OPR_INST_CD());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.setOWN_ISSUED_QTY(struct.getOWN_ISSUED_QTY());
			this.setOTHER_ISSUED_QTY(struct.getOTHER_ISSUED_QTY());
			this.setITEM_ISSUED_QTY(struct.getITEM_ISSUED_QTY());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
			this.seth_WH_FROM_CD(struct.geth_WH_FROM_CD());
			this.seth_RCV_ISSUE_DATE(struct.geth_RCV_ISSUE_DATE());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setLOT_CTRL_FLG_name(struct.getLOT_CTRL_FLG_name());
			this.setLOT_CTRL_FLG_val(struct.getLOT_CTRL_FLG_val());
			this.setw_LOT_CTRL_FLG(struct.getw_LOT_CTRL_FLG());
			this.setw_OPR_INST_CD(struct.getw_OPR_INST_CD());
			this.setw_PUCH_ODR_CD(struct.getw_PUCH_ODR_CD());
			this.setw_ISSUE_INST_CD(struct.getw_ISSUE_INST_CD());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setw_PROC_NAME(struct.getw_PROC_NAME());
			this.setw_OD_NO(struct.getw_OD_NO());
			this.setw_WH_FROM_CD(struct.getw_WH_FROM_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_BUSINESS_OPR_DATE(struct.getw_BUSINESS_OPR_DATE());
			this.setISSUE_CMPLT_FLG_val(struct.getISSUE_CMPLT_FLG_val());
			this.setISSUE_CMPLT_FLG_name(struct.getISSUE_CMPLT_FLG_name());
			this.setCONS_TYP_val(struct.getCONS_TYP_val());
			this.setCONS_TYP_name(struct.getCONS_TYP_name());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setISSUE_INST_QTY(struct.getISSUE_INST_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setSCDL_ISSUE_DATE(struct.getSCDL_ISSUE_DATE());
			this.setISSUE_CMPLT_DATE(struct.getISSUE_CMPLT_DATE());
			this.setISSUE_CMPLT_FLG(struct.getISSUE_CMPLT_FLG());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setw_OPR_INST_CD_item(struct.getw_OPR_INST_CD_item());
			this.setw_OPR_INST_CD_job(struct.getw_OPR_INST_CD_job());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_UNIT_QTY_TYP(struct.getw_UNIT_QTY_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.seth_ISSUE_TYP(struct.geth_ISSUE_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_RCV_ISSUE_CTRL_CD(struct.getw_RCV_ISSUE_CTRL_CD());
			this.setw_RCV_ISSUE_TYP(struct.getw_RCV_ISSUE_TYP());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setw_RCV_ISSUE_GNR_TYP(struct.getw_RCV_ISSUE_GNR_TYP());
			this.setw_STOCK_UPD_TYP(struct.getw_STOCK_UPD_TYP());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setRCV_ISSUE_COMMENT(struct.getRCV_ISSUE_COMMENT());
			this.setw_LOT_NO(struct.getw_LOT_NO());
			this.setw_WH_NAME(struct.getw_WH_NAME());
			this.setw_PLANT_CD_check(struct.getw_PLANT_CD_check());
			this.setw_WH_TYP(struct.getw_WH_TYP());
			this.setw_MRP_FLG(struct.getw_MRP_FLG());
			this.setw_STOCK_ON_HAND_QTY(struct.getw_STOCK_ON_HAND_QTY());
			this.setSAVE_JOB_ODR_CD(struct.getSAVE_JOB_ODR_CD());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRETURNED_CAUSE_CD(struct.getRETURNED_CAUSE_CD());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setPARAM_RESULT(struct.getPARAM_RESULT());
			this.seth_Param_Div(struct.geth_Param_Div());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_TOTAL_ISSUE_QTY(struct.getl_TOTAL_ISSUE_QTY());
			this.setl_ISSUE_DATE(struct.getl_ISSUE_DATE());
			this.setl_STOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
			this.setl_DEFECT_QTY(struct.getl_DEFECT_QTY());
			this.setl_ALLOCABLE_QTY(struct.getl_ALLOCABLE_QTY());
			this.setl_EXTERNAL_LOT_NO(struct.getl_EXTERNAL_LOT_NO());
			this.setl_BEST_BEFORE_DATE(struct.getl_BEST_BEFORE_DATE());
			this.setl_PRD_CMPLT_DATE(struct.getl_PRD_CMPLT_DATE());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setBBD_c_FLG(struct.getBBD_c_FLG());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AF0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_WH_TO_CD(struct.getList_w_WH_TO_CD());
			this.setList_w_WH_FROM_NAME(struct.getList_w_WH_FROM_NAME());
			this.setList_w_WH_TO_NAME(struct.getList_w_WH_TO_NAME());
			this.setList_w_CHOICE_1(struct.getList_w_CHOICE_1());
			this.setList_w_CHOICE_2(struct.getList_w_CHOICE_2());
			this.setList_w_CHOICE_3(struct.getList_w_CHOICE_3());
			this.setList_w_CHOICE(struct.getList_w_CHOICE());
			this.setList_ISSUE_CMPLT_NAME(struct.getList_ISSUE_CMPLT_NAME());
			this.setList_CONS_NAME(struct.getList_CONS_NAME());
			this.setList_s_OPR_INST_CD(struct.getList_s_OPR_INST_CD());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_OWN_ISSUED_QTY(struct.getList_OWN_ISSUED_QTY());
			this.setList_OTHER_ISSUED_QTY(struct.getList_OTHER_ISSUED_QTY());
			this.setList_ITEM_ISSUED_QTY(struct.getList_ITEM_ISSUED_QTY());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
			this.setList_h_WH_FROM_CD(struct.getList_h_WH_FROM_CD());
			this.setList_h_RCV_ISSUE_DATE(struct.getList_h_RCV_ISSUE_DATE());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_LOT_CTRL_FLG_name(struct.getList_LOT_CTRL_FLG_name());
			this.setList_LOT_CTRL_FLG_val(struct.getList_LOT_CTRL_FLG_val());
			this.setList_w_LOT_CTRL_FLG(struct.getList_w_LOT_CTRL_FLG());
			this.setList_w_OPR_INST_CD(struct.getList_w_OPR_INST_CD());
			this.setList_w_PUCH_ODR_CD(struct.getList_w_PUCH_ODR_CD());
			this.setList_w_ISSUE_INST_CD(struct.getList_w_ISSUE_INST_CD());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_w_PROC_NAME(struct.getList_w_PROC_NAME());
			this.setList_w_OD_NO(struct.getList_w_OD_NO());
			this.setList_w_WH_FROM_CD(struct.getList_w_WH_FROM_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_BUSINESS_OPR_DATE(struct.getList_w_BUSINESS_OPR_DATE());
			this.setList_ISSUE_CMPLT_FLG_val(struct.getList_ISSUE_CMPLT_FLG_val());
			this.setList_ISSUE_CMPLT_FLG_name(struct.getList_ISSUE_CMPLT_FLG_name());
			this.setList_CONS_TYP_val(struct.getList_CONS_TYP_val());
			this.setList_CONS_TYP_name(struct.getList_CONS_TYP_name());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ISSUE_INST_QTY(struct.getList_ISSUE_INST_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_SCDL_ISSUE_DATE(struct.getList_SCDL_ISSUE_DATE());
			this.setList_ISSUE_CMPLT_DATE(struct.getList_ISSUE_CMPLT_DATE());
			this.setList_ISSUE_CMPLT_FLG(struct.getList_ISSUE_CMPLT_FLG());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_w_OPR_INST_CD_item(struct.getList_w_OPR_INST_CD_item());
			this.setList_w_OPR_INST_CD_job(struct.getList_w_OPR_INST_CD_job());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_UNIT_QTY_TYP(struct.getList_w_UNIT_QTY_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_h_ISSUE_TYP(struct.getList_h_ISSUE_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_RCV_ISSUE_CTRL_CD(struct.getList_w_RCV_ISSUE_CTRL_CD());
			this.setList_w_RCV_ISSUE_TYP(struct.getList_w_RCV_ISSUE_TYP());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_w_RCV_ISSUE_GNR_TYP(struct.getList_w_RCV_ISSUE_GNR_TYP());
			this.setList_w_STOCK_UPD_TYP(struct.getList_w_STOCK_UPD_TYP());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_RCV_ISSUE_COMMENT(struct.getList_RCV_ISSUE_COMMENT());
			this.setList_w_LOT_NO(struct.getList_w_LOT_NO());
			this.setList_w_WH_NAME(struct.getList_w_WH_NAME());
			this.setList_w_PLANT_CD_check(struct.getList_w_PLANT_CD_check());
			this.setList_w_WH_TYP(struct.getList_w_WH_TYP());
			this.setList_w_MRP_FLG(struct.getList_w_MRP_FLG());
			this.setList_w_STOCK_ON_HAND_QTY(struct.getList_w_STOCK_ON_HAND_QTY());
			this.setList_SAVE_JOB_ODR_CD(struct.getList_SAVE_JOB_ODR_CD());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RETURNED_CAUSE_CD(struct.getList_RETURNED_CAUSE_CD());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_PARAM_RESULT(struct.getList_PARAM_RESULT());
			this.setList_h_Param_Div(struct.getList_h_Param_Div());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_TOTAL_ISSUE_QTY(struct.getList_l_TOTAL_ISSUE_QTY());
			this.setList_l_ISSUE_DATE(struct.getList_l_ISSUE_DATE());
			this.setList_l_STOCK_ON_HAND_QTY(struct.getList_l_STOCK_ON_HAND_QTY());
			this.setList_l_DEFECT_QTY(struct.getList_l_DEFECT_QTY());
			this.setList_l_ALLOCABLE_QTY(struct.getList_l_ALLOCABLE_QTY());
			this.setList_l_EXTERNAL_LOT_NO(struct.getList_l_EXTERNAL_LOT_NO());
			this.setList_l_BEST_BEFORE_DATE(struct.getList_l_BEST_BEFORE_DATE());
			this.setList_l_PRD_CMPLT_DATE(struct.getList_l_PRD_CMPLT_DATE());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_BBD_c_FLG(struct.getList_BBD_c_FLG());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
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
	// 第 1 変数初期値： i_w_WH_TO_CD


	final static String i_w_WH_TO_CD = null;

	// 第 2 変数初期値： i_w_WH_FROM_NAME


	final static String i_w_WH_FROM_NAME = null;

	// 第 3 変数初期値： i_w_WH_TO_NAME


	final static String i_w_WH_TO_NAME = null;

	// 第 4 変数初期値： i_w_CHOICE_1


	final static String i_w_CHOICE_1 = null;

	// 第 5 変数初期値： i_w_CHOICE_2


	final static String i_w_CHOICE_2 = null;

	// 第 6 変数初期値： i_w_CHOICE_3


	final static String i_w_CHOICE_3 = null;

	// 第 7 変数初期値： i_w_CHOICE


	final static String i_w_CHOICE = null;

	// 第 8 変数初期値： i_ISSUE_CMPLT_NAME


	final static String i_ISSUE_CMPLT_NAME = null;

	// 第 9 変数初期値： i_CONS_NAME


	final static String i_CONS_NAME = null;

	// 第 10 変数初期値： i_s_OPR_INST_CD


	final static String i_s_OPR_INST_CD = null;

	// 第 11 変数初期値： i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// 第 12 変数初期値： i_OWN_ISSUED_QTY


	final static String i_OWN_ISSUED_QTY = null;

	// 第 13 変数初期値： i_OTHER_ISSUED_QTY


	final static String i_OTHER_ISSUED_QTY = null;

	// 第 14 変数初期値： i_ITEM_ISSUED_QTY


	final static String i_ITEM_ISSUED_QTY = null;

	// 第 15 変数初期値： i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

	// 第 16 変数初期値： i_h_WH_FROM_CD


	final static String i_h_WH_FROM_CD = null;

	// 第 17 変数初期値： i_h_RCV_ISSUE_DATE


	final static String i_h_RCV_ISSUE_DATE = null;

	// 第 18 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 19 変数初期値： i_LOT_CTRL_FLG_name


	final static String i_LOT_CTRL_FLG_name = null;

	// 第 20 変数初期値： i_LOT_CTRL_FLG_val


	final static String i_LOT_CTRL_FLG_val = null;

	// 第 21 変数初期値： i_w_LOT_CTRL_FLG


	final static String i_w_LOT_CTRL_FLG = null;

	// 第 22 変数初期値： i_w_OPR_INST_CD


	final static String i_w_OPR_INST_CD = null;

	// 第 23 変数初期値： i_w_PUCH_ODR_CD


	final static String i_w_PUCH_ODR_CD = null;

	// 第 24 変数初期値： i_w_ISSUE_INST_CD


	final static String i_w_ISSUE_INST_CD = null;

	// 第 25 変数初期値： i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// 第 26 変数初期値： i_w_PROC_NAME


	final static String i_w_PROC_NAME = null;

	// 第 27 変数初期値： i_w_OD_NO


	final static String i_w_OD_NO = null;

	// 第 28 変数初期値： i_w_WH_FROM_CD


	final static String i_w_WH_FROM_CD = null;

	// 第 29 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 30 変数初期値： i_w_BUSINESS_OPR_DATE


	final static String i_w_BUSINESS_OPR_DATE = null;

	// 第 31 変数初期値： i_ISSUE_CMPLT_FLG_val


	final static Integer i_ISSUE_CMPLT_FLG_val = null;

	// 第 32 変数初期値： i_ISSUE_CMPLT_FLG_name


	final static String i_ISSUE_CMPLT_FLG_name = null;

	// 第 33 変数初期値： i_CONS_TYP_val


	final static Integer i_CONS_TYP_val = null;

	// 第 34 変数初期値： i_CONS_TYP_name


	final static String i_CONS_TYP_name = null;

	// 第 35 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 36 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 37 変数初期値： i_JOB_ODR_DETAIL_NO


	final static Integer i_JOB_ODR_DETAIL_NO = null;

	// 第 38 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 39 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 40 変数初期値： i_ISSUE_INST_QTY


	final static String i_ISSUE_INST_QTY = null;

	// 第 41 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 42 変数初期値： i_SCDL_ISSUE_DATE


	final static String i_SCDL_ISSUE_DATE = null;

	// 第 43 変数初期値： i_ISSUE_CMPLT_DATE


	final static String i_ISSUE_CMPLT_DATE = null;

	// 第 44 変数初期値： i_ISSUE_CMPLT_FLG


	final static Integer i_ISSUE_CMPLT_FLG = null;

	// 第 45 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 46 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 47 変数初期値： i_w_OPR_INST_CD_item


	final static String i_w_OPR_INST_CD_item = null;

	// 第 48 変数初期値： i_w_OPR_INST_CD_job


	final static String i_w_OPR_INST_CD_job = null;

	// 第 49 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 50 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 51 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 52 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 53 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 54 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 55 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 56 変数初期値： i_CONS_TYP


	final static Integer i_CONS_TYP = null;

	// 第 57 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 58 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 59 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 60 変数初期値： i_w_UNIT_QTY_TYP


	final static Integer i_w_UNIT_QTY_TYP = null;

	// 第 61 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 62 変数初期値： i_h_ISSUE_TYP


	final static String i_h_ISSUE_TYP = null;

	// 第 63 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 64 変数初期値： i_w_RCV_ISSUE_CTRL_CD


	final static String i_w_RCV_ISSUE_CTRL_CD = null;

	// 第 65 変数初期値： i_w_RCV_ISSUE_TYP


	final static Integer i_w_RCV_ISSUE_TYP = null;

	// 第 66 変数初期値： i_w_WH_CD


	final static String i_w_WH_CD = null;

	// 第 67 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 68 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 69 変数初期値： i_w_RCV_ISSUE_GNR_TYP


	final static Integer i_w_RCV_ISSUE_GNR_TYP = null;

	// 第 70 変数初期値： i_w_STOCK_UPD_TYP


	final static Integer i_w_STOCK_UPD_TYP = null;

	// 第 71 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 72 変数初期値： i_RCV_ISSUE_COMMENT


	final static String i_RCV_ISSUE_COMMENT = null;

	// 第 73 変数初期値： i_w_LOT_NO


	final static String i_w_LOT_NO = null;

	// 第 74 変数初期値： i_w_WH_NAME


	final static String i_w_WH_NAME = null;

	// 第 75 変数初期値： i_w_PLANT_CD_check


	final static String i_w_PLANT_CD_check = null;

	// 第 76 変数初期値： i_w_WH_TYP


	final static Integer i_w_WH_TYP = null;

	// 第 77 変数初期値： i_w_MRP_FLG


	final static Integer i_w_MRP_FLG = null;

	// 第 78 変数初期値： i_w_STOCK_ON_HAND_QTY


	final static String i_w_STOCK_ON_HAND_QTY = null;

	// 第 79 変数初期値： i_SAVE_JOB_ODR_CD


	final static String i_SAVE_JOB_ODR_CD = null;

	// 第 80 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 81 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 82 変数初期値： i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// 第 83 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 84 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 85 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 86 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 87 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 88 変数初期値： i_RETURNED_CAUSE_CD


	final static String i_RETURNED_CAUSE_CD = null;

	// 第 89 変数初期値： i_ONEROUS_FLG


	final static String i_ONEROUS_FLG = null;

	// 第 90 変数初期値： i_PARAM_RESULT


	final static String i_PARAM_RESULT = null;

	// 第 91 変数初期値： i_h_Param_Div


	final static String i_h_Param_Div = null;

	// 第 92 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 93 変数初期値： i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// 第 94 変数初期値： i_l_TOTAL_ISSUE_QTY


	final static String i_l_TOTAL_ISSUE_QTY = null;

	// 第 95 変数初期値： i_l_ISSUE_DATE


	final static String i_l_ISSUE_DATE = null;

	// 第 96 変数初期値： i_l_STOCK_ON_HAND_QTY


	final static String i_l_STOCK_ON_HAND_QTY = null;

	// 第 97 変数初期値： i_l_DEFECT_QTY


	final static String i_l_DEFECT_QTY = null;

	// 第 98 変数初期値： i_l_ALLOCABLE_QTY


	final static String i_l_ALLOCABLE_QTY = null;

	// 第 99 変数初期値： i_l_EXTERNAL_LOT_NO


	final static String i_l_EXTERNAL_LOT_NO = null;

	// 第 100 変数初期値： i_l_BEST_BEFORE_DATE


	final static String i_l_BEST_BEFORE_DATE = null;

	// 第 101 変数初期値： i_l_PRD_CMPLT_DATE


	final static String i_l_PRD_CMPLT_DATE = null;

	// 第 102 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 103 変数初期値： i_BBD_c_FLG


	final static String i_BBD_c_FLG = null;

	// 第 104 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 105 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 106 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

*/

	//{{user_implement_code
	//////////////////////////////
	/**	
	 * 直持ち変数のコピー	
	 * @param s コピー元	
	 */	
	public void copy(AF0080010Struct s)	
	{	
		clear();
		if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
		if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
		if(s.m_ISSUE_INST_CD != null) m_ISSUE_INST_CD = new String(s.m_ISSUE_INST_CD);
		if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
		if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
		if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
		if(s.m_ISSUE_INST_QTY != null) m_ISSUE_INST_QTY = new String(s.m_ISSUE_INST_QTY);
		if(s.m_TOTAL_ISSUE_QTY != null) m_TOTAL_ISSUE_QTY = new String(s.m_TOTAL_ISSUE_QTY);
		if(s.m_SCDL_ISSUE_DATE != null) m_SCDL_ISSUE_DATE = new String(s.m_SCDL_ISSUE_DATE);
		if(s.m_ISSUE_CMPLT_DATE != null) m_ISSUE_CMPLT_DATE = new String(s.m_ISSUE_CMPLT_DATE);
		if(s.m_ISSUE_CMPLT_FLG != null) m_ISSUE_CMPLT_FLG = new Integer(s.m_ISSUE_CMPLT_FLG.intValue());
		if(s.m_WH_CD != null) m_WH_CD = new String(s.m_WH_CD);
		if(s.m_WH_NAME != null) m_WH_NAME = new String(s.m_WH_NAME);
		if(s.m_w_OPR_INST_CD_item != null) m_w_OPR_INST_CD_item = new String(s.m_w_OPR_INST_CD_item);
		if(s.m_w_OPR_INST_CD_job != null) m_w_OPR_INST_CD_job = new String(s.m_w_OPR_INST_CD_job);
		if(s.m_WS_CD != null) m_WS_CD = new String(s.m_WS_CD);
		if(s.m_WS_NAME != null) m_WS_NAME = new String(s.m_WS_NAME);
		if(s.m_WORK_ODR_CD != null) m_WORK_ODR_CD = new String(s.m_WORK_ODR_CD);
		if(s.m_WORK_IN_PROC_CD != null) m_WORK_IN_PROC_CD = new String(s.m_WORK_IN_PROC_CD);
		if(s.m_w_PROC_NAME != null) m_w_PROC_NAME = new String(s.m_w_PROC_NAME);
		if(s.m_PUCH_ODR_CD != null) m_PUCH_ODR_CD = new String(s.m_PUCH_ODR_CD);
		if(s.m_w_COMPANY_CD != null) m_w_COMPANY_CD = new String(s.m_w_COMPANY_CD);
		if(s.m_w_OD_NO != null) m_w_OD_NO = new String(s.m_w_OD_NO);
		if(s.m_VEND_CD != null) m_VEND_CD = new String(s.m_VEND_CD);
		if(s.m_VEND_ANAME != null) m_VEND_ANAME = new String(s.m_VEND_ANAME);
		if(s.m_CONS_TYP != null) m_CONS_TYP = new Integer(s.m_CONS_TYP.intValue());
		if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
		if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
		if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
		if(s.m_w_UNIT_QTY_TYP != null) m_w_UNIT_QTY_TYP = new Integer(s.m_w_UNIT_QTY_TYP.intValue());
		if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
		if(s.m_w_ISSUE_INST_CD != null) m_w_ISSUE_INST_CD = new String(s.m_w_ISSUE_INST_CD);
		if(s.m_w_PUCH_ODR_CD != null) m_w_PUCH_ODR_CD = new String(s.m_w_PUCH_ODR_CD);
		if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
		if(s.m_w_OPR_INST_CD != null) m_w_OPR_INST_CD = new String(s.m_w_OPR_INST_CD);
		if(s.m_w_BUSINESS_OPR_DATE != null) m_w_BUSINESS_OPR_DATE = new String(s.m_w_BUSINESS_OPR_DATE);
		if(s.m_w_RCV_ISSUE_CTRL_CD != null) m_w_RCV_ISSUE_CTRL_CD = new String(s.m_w_RCV_ISSUE_CTRL_CD);
		if(s.m_w_RCV_ISSUE_TYP != null) m_w_RCV_ISSUE_TYP = new Integer(s.m_w_RCV_ISSUE_TYP.intValue());
		if(s.m_w_WH_CD != null) m_w_WH_CD = new String(s.m_w_WH_CD);
		if(s.m_RCV_ISSUE_QTY != null) m_RCV_ISSUE_QTY = new String(s.m_RCV_ISSUE_QTY);
		if(s.m_RCV_ISSUE_DATE != null) m_RCV_ISSUE_DATE = new String(s.m_RCV_ISSUE_DATE);
		if(s.m_w_RCV_ISSUE_GNR_TYP != null) m_w_RCV_ISSUE_GNR_TYP = new Integer(s.m_w_RCV_ISSUE_GNR_TYP.intValue());
		if(s.m_w_STOCK_UPD_TYP != null) m_w_STOCK_UPD_TYP = new Integer(s.m_w_STOCK_UPD_TYP.intValue());
		if(s.m_VEND_LOT_NO != null) m_VEND_LOT_NO = new String(s.m_VEND_LOT_NO);
		if(s.m_RCV_ISSUE_COMMENT != null) m_RCV_ISSUE_COMMENT = new String(s.m_RCV_ISSUE_COMMENT);
		if(s.m_w_WH_NAME != null) m_w_WH_NAME = new String(s.m_w_WH_NAME);
		if(s.m_w_PLANT_CD_check != null) m_w_PLANT_CD_check = new String(s.m_w_PLANT_CD_check);
		if(s.m_w_WH_TYP != null) m_w_WH_TYP = new Integer(s.m_w_WH_TYP.intValue());
		if(s.m_w_STOCK_ON_HAND_QTY != null) m_w_STOCK_ON_HAND_QTY = new String(s.m_w_STOCK_ON_HAND_QTY);
		if(s.m_w_WH_FROM_CD != null) m_w_WH_FROM_CD = new String(s.m_w_WH_FROM_CD);
		if(s.m_w_WH_TO_CD != null) m_w_WH_TO_CD = new String(s.m_w_WH_TO_CD);
		if(s.m_w_WH_FROM_NAME != null) m_w_WH_FROM_NAME = new String(s.m_w_WH_FROM_NAME);
		if(s.m_w_WH_TO_NAME != null) m_w_WH_TO_NAME = new String(s.m_w_WH_TO_NAME);
		if(s.m_w_CHOICE_1 != null) m_w_CHOICE_1 = new String(s.m_w_CHOICE_1);
		if(s.m_w_CHOICE_2 != null) m_w_CHOICE_2 = new String(s.m_w_CHOICE_2);
		if(s.m_w_CHOICE_3 != null) m_w_CHOICE_3 = new String(s.m_w_CHOICE_3);
		if(s.m_w_CHOICE != null) m_w_CHOICE = new String(s.m_w_CHOICE);
		if(s.m_ISSUE_CMPLT_NAME != null) m_ISSUE_CMPLT_NAME = new String(s.m_ISSUE_CMPLT_NAME);
		if(s.m_CONS_NAME != null) m_CONS_NAME = new String(s.m_CONS_NAME);
		if(s.m_s_OPR_INST_CD != null) m_s_OPR_INST_CD = new String(s.m_s_OPR_INST_CD);
		if(s.m_c_JOB_ODR_CD != null) m_c_JOB_ODR_CD = new String(s.m_c_JOB_ODR_CD);
		if(s.m_ISSUE_CMPLT_FLG_val != null) m_ISSUE_CMPLT_FLG_val = new Integer(s.m_ISSUE_CMPLT_FLG_val.intValue());
		if(s.m_ISSUE_CMPLT_FLG_name != null) m_ISSUE_CMPLT_FLG_name = new String(s.m_ISSUE_CMPLT_FLG_name);
		if(s.m_CONS_TYP_val != null) m_CONS_TYP_val = new Integer(s.m_CONS_TYP_val.intValue());
		if(s.m_CONS_TYP_name != null) m_CONS_TYP_name = new String(s.m_CONS_TYP_name);
		if(s.m_OWN_ISSUED_QTY != null) m_OWN_ISSUED_QTY = new String(s.m_OWN_ISSUED_QTY);
		if(s.m_OTHER_ISSUED_QTY != null) m_OTHER_ISSUED_QTY = new String(s.m_OTHER_ISSUED_QTY);
		if(s.m_ITEM_ISSUED_QTY != null) m_ITEM_ISSUED_QTY = new String(s.m_ITEM_ISSUED_QTY);
		if(s.m_h_JOB_ODR_CD != null) m_h_JOB_ODR_CD = new String(s.m_h_JOB_ODR_CD);
		if(s.m_JOB_ODR_DETAIL_NO != null) m_JOB_ODR_DETAIL_NO = new Integer(s.m_JOB_ODR_DETAIL_NO.intValue());
		if(s.m_LOT_CTRL_FLG != null) m_LOT_CTRL_FLG = new String(s.m_LOT_CTRL_FLG);
		if(s.m_w_LOT_NO != null) m_w_LOT_NO = new String(s.m_w_LOT_NO);		
	}	


	/**
	 * コピーコンストラクタ
	 * @param struct コピー対象
	 */
	 public AF0080010Struct(AF0080010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------

	// 初期値定義

	/** 第 1 変数初期値： i_ISSUE_INST_CD */
	final static String i_ISSUE_INST_CD = null;
	/** 第 2 変数初期値： i_JOB_ODR_CD */
	final static String i_JOB_ODR_CD = null;
	/** 第 3 変数初期値： i_ITEM_CD */
	final static String i_ITEM_CD = null;
	/** 第 4 変数初期値： i_ITEM_NAME */
	final static String i_ITEM_NAME = null;
	/** 第 5 変数初期値： i_ISSUE_INST_QTY */
	final static String i_ISSUE_INST_QTY = null;
	/** 第 6 変数初期値： i_TOTAL_ISSUE_QTY */
	final static String i_TOTAL_ISSUE_QTY = null;
	/** 第 7 変数初期値： i_SCDL_ISSUE_DATE */
	final static String i_SCDL_ISSUE_DATE = null;
	/** 第 8 変数初期値： i_ISSUE_CMPLT_DATE */
	final static String i_ISSUE_CMPLT_DATE = null;
	/** 第 9 変数初期値： i_ISSUE_CMPLT_FLG */
	final static Integer i_ISSUE_CMPLT_FLG = null;
	/** 第 10 変数初期値： i_WH_CD */
	final static String i_WH_CD = null;
	/** 第 11 変数初期値： i_WH_NAME */
	final static String i_WH_NAME = null;
	/** 第 12 変数初期値： i_w_OPR_INST_CD_item */
	final static String i_w_OPR_INST_CD_item = null;
	/** 第 13 変数初期値： i_w_OPR_INST_CD_job */
	final static String i_w_OPR_INST_CD_job = null;
	/** 第 14 変数初期値： i_WS_CD */
	final static String i_WS_CD = null;
	/** 第 15 変数初期値： i_WS_NAME */
	final static String i_WS_NAME = null;
	/** 第 16 変数初期値： i_WORK_ODR_CD */
	final static String i_WORK_ODR_CD = null;
	/** 第 17 変数初期値： i_WORK_IN_PROC_CD */
	final static String i_WORK_IN_PROC_CD = null;
	/** 第 18 変数初期値： i_w_PROC_NAME */
	final static String i_w_PROC_NAME = null;
	/** 第 19 変数初期値： i_PUCH_ODR_CD */
	final static String i_PUCH_ODR_CD = null;
	/** 第 20 変数初期値： i_w_COMPANY_CD */
	final static String i_w_COMPANY_CD = null;
	/** 第 21 変数初期値： i_w_OD_NO */
	final static String i_w_OD_NO = null;
	/** 第 22 変数初期値： i_VEND_CD */
	final static String i_VEND_CD = null;
	/** 第 23 変数初期値： i_VEND_ANAME */
	final static String i_VEND_ANAME = null;
	/** 第 24 変数初期値： i_CONS_TYP */
	final static Integer i_CONS_TYP = null;
	/** 第 25 変数初期値： i_DRAW_CD */
	final static String i_DRAW_CD = null;
	/** 第 26 変数初期値： i_SPEC */
	final static String i_SPEC = null;
	/** 第 26 変数初期値： i_STOCK_UNIT */
	final static String i_STOCK_UNIT = null;
	/** 第 27 変数初期値： i_w_UNIT_QTY_TYP */
	final static Integer i_w_UNIT_QTY_TYP = null;
	/** 第 28 変数初期値： i_MRP_ODR_TYP */
	final static String i_MRP_ODR_TYP = null;
	/** 第 29 変数初期値： i_w_ISSUE_INST_CD */
	final static String i_w_ISSUE_INST_CD = null;
	/** 第 30 変数初期値： i_w_PUCH_ODR_CD */
	final static String i_w_PUCH_ODR_CD = null;
	/** 第 31 変数初期値： i_w_PLANT_CD */
	final static String i_w_PLANT_CD = null;
	/** 第 32 変数初期値： i_w_OPR_INST_CD */
	final static String i_w_OPR_INST_CD = null;
	/** 第 33 変数初期値： i_w_BUSINESS_OPR_DATE */
	final static String i_w_BUSINESS_OPR_DATE = null;
	/** 第 34 変数初期値： i_w_RCV_ISSUE_CTRL_CD */
	final static String i_w_RCV_ISSUE_CTRL_CD = null;
	/** 第 35 変数初期値： i_w_RCV_ISSUE_TYP */
	final static Integer i_w_RCV_ISSUE_TYP = null;
	/** 第 36 変数初期値： i_w_WH_CD */
	final static String i_w_WH_CD = null;
	/** 第 37 変数初期値： i_RCV_ISSUE_QTY */
	final static String i_RCV_ISSUE_QTY = null;
	/** 第 38 変数初期値： i_RCV_ISSUE_DATE */
	final static String i_RCV_ISSUE_DATE = null;
	/** 第 39 変数初期値： i_w_RCV_ISSUE_GNR_TYP */
	final static Integer i_w_RCV_ISSUE_GNR_TYP = null;
	/** 第 40 変数初期値： i_w_STOCK_UPD_TYP */
	final static Integer i_w_STOCK_UPD_TYP = null;
	/** 第 41 変数初期値： i_VEND_LOT_NO */
	final static String i_VEND_LOT_NO = null;
	/** 第 42 変数初期値： i_RCV_ISSUE_COMMENT */
	final static String i_RCV_ISSUE_COMMENT = null;
	/** 第 43 変数初期値： i_w_WH_NAME */
	final static String i_w_WH_NAME = null;
	/** 第 44 変数初期値： i_w_PLANT_CD_check */
	final static String i_w_PLANT_CD_check = null;
	/** 第 45 変数初期値： i_w_WH_TYP */
	final static Integer i_w_WH_TYP = null;
	/** 第 46 変数初期値： i_w_STOCK_ON_HAND_QTY */
	final static String i_w_STOCK_ON_HAND_QTY = null;
	/** 第 47 変数初期値： i_w_WH_FROM_CD */
	final static String i_w_WH_FROM_CD = null;
	/** 第 48 変数初期値： i_w_WH_TO_CD */
	final static String i_w_WH_TO_CD = null;
	/** 第 49 変数初期値： i_w_WH_FROM_NAME */
	final static String i_w_WH_FROM_NAME = null;
	/** 第 50 変数初期値： i_w_WH_TO_NAME */
	final static String i_w_WH_TO_NAME = null;
	/** 第 51 変数初期値： i_w_CHOICE_1 */
	final static String i_w_CHOICE_1 = null;
	/** 第 52 変数初期値： i_w_CHOICE_2 */
	final static String i_w_CHOICE_2 = null;
	/** 第 53 変数初期値： i_w_CHOICE_3 */
	final static String i_w_CHOICE_3 = null;
	/** 第 54 変数初期値： i_w_CHOICE */
	final static String i_w_CHOICE = new String("0");
	/** 第 55 変数初期値： i_ISSUE_CMPLT_NAME */
	final static String i_ISSUE_CMPLT_NAME = null;
	/** 第 56 変数初期値： i_CONS_NAME */
	final static String i_CONS_NAME = null;
	/** 第 57 変数初期値： i_s_OPR_INST_CD */
	final static String i_s_OPR_INST_CD = null;
	/** 第 58 変数初期値： i_c_JOB_ODR_CD */
	final static String i_c_JOB_ODR_CD = null;
	/** 第 59 変数初期値： i_ISSUE_CMPLT_FLG_val */
	final static Integer i_ISSUE_CMPLT_FLG_val = null;
	/** 第 60 変数初期値： i_ISSUE_CMPLT_FLG_name */
	final static String i_ISSUE_CMPLT_FLG_name = null;
	/** 第 61 変数初期値： i_CONS_TYP_val */
	final static Integer i_CONS_TYP_val = null;
	/** 第 62 変数初期値： i_CONS_TYP_name */
	final static String i_CONS_TYP_name = null;

	final static String i_OWN_ISSUED_QTY = null;
	final static String i_OTHER_ISSUED_QTY = null;
	final static String i_ITEM_ISSUED_QTY = null;
	final static String i_h_JOB_ODR_CD = null;
	final static String i_SAVE_JOB_ODR_CD = null;
	final static Integer i_JOB_ODR_DETAIL_NO = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_ISSUE_INST_QTY = i_ISSUE_INST_QTY;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_SCDL_ISSUE_DATE = i_SCDL_ISSUE_DATE;
		m_ISSUE_CMPLT_DATE = i_ISSUE_CMPLT_DATE;
		m_ISSUE_CMPLT_FLG = i_ISSUE_CMPLT_FLG;
		m_WH_CD = i_WH_CD;
		m_WH_NAME = i_WH_NAME;
		m_w_OPR_INST_CD_item = i_w_OPR_INST_CD_item;
		m_w_OPR_INST_CD_job = i_w_OPR_INST_CD_job;
		m_WS_CD = i_WS_CD;
		m_WS_NAME = i_WS_NAME;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_w_PROC_NAME = i_w_PROC_NAME;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_w_COMPANY_CD = i_w_COMPANY_CD;
		m_w_OD_NO = i_w_OD_NO;
		m_VEND_CD = i_VEND_CD;
		m_VEND_ANAME = i_VEND_ANAME;
		m_CONS_TYP = i_CONS_TYP;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_w_UNIT_QTY_TYP = i_w_UNIT_QTY_TYP;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_w_ISSUE_INST_CD = i_w_ISSUE_INST_CD;
		m_w_PUCH_ODR_CD = i_w_PUCH_ODR_CD;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_w_OPR_INST_CD = i_w_OPR_INST_CD;
		m_w_BUSINESS_OPR_DATE = i_w_BUSINESS_OPR_DATE;
		m_w_RCV_ISSUE_CTRL_CD = i_w_RCV_ISSUE_CTRL_CD;
		m_w_RCV_ISSUE_TYP = i_w_RCV_ISSUE_TYP;
		m_w_WH_CD = i_w_WH_CD;
		m_RCV_ISSUE_QTY = i_RCV_ISSUE_QTY;
		m_RCV_ISSUE_DATE = i_RCV_ISSUE_DATE;
		m_w_RCV_ISSUE_GNR_TYP = i_w_RCV_ISSUE_GNR_TYP;
		m_w_STOCK_UPD_TYP = i_w_STOCK_UPD_TYP;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_RCV_ISSUE_COMMENT = i_RCV_ISSUE_COMMENT;
		m_w_WH_NAME = i_w_WH_NAME;
		m_w_PLANT_CD_check = i_w_PLANT_CD_check;
		m_w_WH_TYP = i_w_WH_TYP;
		m_w_STOCK_ON_HAND_QTY = i_w_STOCK_ON_HAND_QTY;
		m_w_WH_FROM_CD = i_w_WH_FROM_CD;
		m_w_WH_TO_CD = i_w_WH_TO_CD;
		m_w_WH_FROM_NAME = i_w_WH_FROM_NAME;
		m_w_WH_TO_NAME = i_w_WH_TO_NAME;
		m_w_CHOICE_1 = i_w_CHOICE_1;
		m_w_CHOICE_2 = i_w_CHOICE_2;
		m_w_CHOICE_3 = i_w_CHOICE_3;
		m_w_CHOICE = i_w_CHOICE;
		m_ISSUE_CMPLT_NAME = i_ISSUE_CMPLT_NAME;
		m_CONS_NAME = i_CONS_NAME;
		m_s_OPR_INST_CD = i_s_OPR_INST_CD;
		m_c_JOB_ODR_CD = i_c_JOB_ODR_CD;
		m_ISSUE_CMPLT_FLG_val = i_ISSUE_CMPLT_FLG_val;
		m_ISSUE_CMPLT_FLG_name = i_ISSUE_CMPLT_FLG_name;
		m_CONS_TYP_val = i_CONS_TYP_val;
		m_CONS_TYP_name = i_CONS_TYP_name;
		m_OWN_ISSUED_QTY = i_OWN_ISSUED_QTY;
		m_OTHER_ISSUED_QTY = i_OTHER_ISSUED_QTY;
		m_ITEM_ISSUED_QTY = i_ITEM_ISSUED_QTY;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_h_JOB_ODR_CD = i_h_JOB_ODR_CD;
		m_SAVE_JOB_ODR_CD = i_SAVE_JOB_ODR_CD;

		l_ISSUE_INST_CD = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_SCDL_ISSUE_DATE = null;
		l_ISSUE_CMPLT_DATE = null;
		l_ISSUE_CMPLT_FLG = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_w_OPR_INST_CD_item = null;
		l_w_OPR_INST_CD_job = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_w_PROC_NAME = null;
		l_PUCH_ODR_CD = null;
		l_w_COMPANY_CD = null;
		l_w_OD_NO = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_CONS_TYP = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_w_UNIT_QTY_TYP = null;
		l_MRP_ODR_TYP = null;
		l_w_ISSUE_INST_CD = null;
		l_w_PUCH_ODR_CD = null;
		l_w_PLANT_CD = null;
		l_w_OPR_INST_CD = null;
		l_w_BUSINESS_OPR_DATE = null;
		l_w_RCV_ISSUE_CTRL_CD = null;
		l_w_RCV_ISSUE_TYP = null;
		l_w_WH_CD = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_w_RCV_ISSUE_GNR_TYP = null;
		l_w_STOCK_UPD_TYP = null;
		l_VEND_LOT_NO = null;
		l_RCV_ISSUE_COMMENT = null;
		l_w_WH_NAME = null;
		l_w_PLANT_CD_check = null;
		l_w_WH_TYP = null;
		l_w_STOCK_ON_HAND_QTY = null;
		l_w_WH_FROM_CD = null;
		l_w_WH_TO_CD = null;
		l_w_WH_FROM_NAME = null;
		l_w_WH_TO_NAME = null;
		l_w_CHOICE_1 = null;
		l_w_CHOICE_2 = null;
		l_w_CHOICE_3 = null;
		l_w_CHOICE = null;
		l_ISSUE_CMPLT_NAME = null;
		l_CONS_NAME = null;
		l_s_OPR_INST_CD = null;
		l_c_JOB_ODR_CD = null;
		l_ISSUE_CMPLT_FLG_val = null;
		l_ISSUE_CMPLT_FLG_name = null;
		l_CONS_TYP_val = null;
		l_CONS_TYP_name = null;
		l_OWN_ISSUED_QTY = null;
		l_OTHER_ISSUED_QTY = null;
		l_ITEM_ISSUED_QTY = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_h_JOB_ODR_CD = null;
		l_SAVE_JOB_ODR_CD = null;
	}

        //}}user_implement_code

	//////////////////////////////

}
