/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/src/com/nec/jp/orteus/metamorBase/AF0130/AF0130010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0130;

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
 * CLASS     : AF0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:18:10 $
 *
 */
//}}user_implement_code_header

public class AF0130010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FileName */
	public String m_FileName = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** 第 4 変数： m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** 第 5 変数： m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** 第 6 変数： m_l_ERR_CTR_NM */
	public String m_l_ERR_CTR_NM = null;
	/** 第 7 変数： m_l_ERR_ISSUE_INST_CD */
	public String m_l_ERR_ISSUE_INST_CD = null;
	/** 第 8 変数： m_l_ERR_JOB_ODR_CD */
	public String m_l_ERR_JOB_ODR_CD = null;
	/** 第 9 変数： m_l_ERR_ISSUE_WH_CD */
	public String m_l_ERR_ISSUE_WH_CD = null;
	/** 第 10 変数： m_l_ERR_STOCK_LOT_CD */
	public String m_l_ERR_STOCK_LOT_CD = null;
	/** 第 11 変数： m_l_ERR_ISSUE_QTY */
	public String m_l_ERR_ISSUE_QTY = null;
	/** 第 12 変数： m_l_ERR_ISSUE_DATE */
	public String m_l_ERR_ISSUE_DATE = null;
	/** 第 13 変数： m_l_ERR_ISSUE_CMPLT_FLG */
	public String m_l_ERR_ISSUE_CMPLT_FLG = null;
	/** 第 14 変数： m_l_ERR_RCV_WH_CD */
	public String m_l_ERR_RCV_WH_CD = null;
	/** 第 15 変数： m_l_ERR_VEND_LOT_NO */
	public String m_l_ERR_VEND_LOT_NO = null;
	/** 第 16 変数： m_l_ERR_ITEM_CD */
	public String m_l_ERR_ITEM_CD = null;
	/** 第 17 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 18 変数： m_ISSUE_QTY */
	public String m_ISSUE_QTY = null;
	/** 第 19 変数： m_ISSUE_CMPLT_FLG */
	public String m_ISSUE_CMPLT_FLG = null;
	/** 第 20 変数： m_RCV_WH_CD */
	public String m_RCV_WH_CD = null;
	/** 第 21 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 22 変数： m_ISSUE_DATE */
	public String m_ISSUE_DATE = null;
	/** 第 23 変数： m_tmp_RCV_ISSUE_QTY */
	public String m_tmp_RCV_ISSUE_QTY = null;
	/** 第 24 変数： m_THIS_TIME_ISSUE_POSS_QTY */
	public String m_THIS_TIME_ISSUE_POSS_QTY = null;
	/** 第 25 変数： m_ALC_NOISSUE_QTY */
	public String m_ALC_NOISSUE_QTY = null;
	/** 第 26 変数： m_ODR_ISSUE_POSS_QTY */
	public String m_ODR_ISSUE_POSS_QTY = null;
	/** 第 27 変数： m_ITEM_STOCK_NON_ALC_QTY */
	public String m_ITEM_STOCK_NON_ALC_QTY = null;
	/** 第 28 変数： m_L_JOB_ODR_CD */
	public String m_L_JOB_ODR_CD = null;
	/** 第 29 変数： m_LA_ISSUE_QTY */
	public String m_LA_ISSUE_QTY = null;
	/** 第 30 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 31 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 32 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 33 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 34 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 35 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 36 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 37 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 38 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 39 変数： m_ISSUE_TYP */
	public String m_ISSUE_TYP = null;
	/** 第 40 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 41 変数： m_ISSUE_INST_QTY */
	public String m_ISSUE_INST_QTY = null;
	/** 第 42 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 43 変数： m_SHIP_REMAIN_QTY */
	public String m_SHIP_REMAIN_QTY = null;
	/** 第 44 変数： m_COUNT */
	public String m_COUNT = null;
	/** 第 45 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 46 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 47 変数： m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** 第 48 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 49 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 50 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 51 変数： m_BEST_BEFORE_DATE */
	public String m_BEST_BEFORE_DATE = null;
	/** 第 52 変数： m_PROC_EXEC_DATE */
	public String m_PROC_EXEC_DATE = null;
	/** 第 53 変数： m_ISSUE_DATE_SUB */
	public String m_ISSUE_DATE_SUB = null;
	/** 第 54 変数： m_SYS_PARAMETER_VALUE */
	public String m_SYS_PARAMETER_VALUE = null;
	/** 第 55 変数： m_SYS_PARAMETER_NAME */
	public String m_SYS_PARAMETER_NAME = null;
	/** 第 56 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 57 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 58 変数： m_w_SHIP_REMAIN_QTY */
	public String m_w_SHIP_REMAIN_QTY = null;
	/** 第 59 変数： m_SCDL_ISSUE_DATE */
	public String m_SCDL_ISSUE_DATE = null;
	/** 第 60 変数： m_ISSUE_CMPLT_DATE */
	public String m_ISSUE_CMPLT_DATE = null;
	/** 第 61 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 62 変数： m_MODIFY_COUNT */
	public Integer m_MODIFY_COUNT = null;
	/** 第 63 変数： m_JOB_ODR_DETAIL_NO */
	public Integer m_JOB_ODR_DETAIL_NO = null;
	/** 第 64 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 65 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 66 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 67 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 68 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 69 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 70 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 71 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 72 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 73 変数： m_OPR_INST_CD_proc */
	public String m_OPR_INST_CD_proc = null;
	/** 第 74 変数： m_OPR_INST_CD_item */
	public String m_OPR_INST_CD_item = null;
	/** 第 75 変数： m_w_ISSUE_INST_CD */
	public String m_w_ISSUE_INST_CD = null;
	/** 第 76 変数： m_w_WS_CD */
	public String m_w_WS_CD = null;
	/** 第 77 変数： m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** 第 78 変数： m_w_ISSUE_CMPLT_FLG */
	public String m_w_ISSUE_CMPLT_FLG = null;
	/** 第 79 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 80 変数： m_t_WORK_ODR_CD */
	public String m_t_WORK_ODR_CD = null;
	/** 第 81 変数： m_t_WORK_IN_PROC_CD */
	public String m_t_WORK_IN_PROC_CD = null;
	/** 第 82 変数： m_w_PUCH_ODR_CD */
	public String m_w_PUCH_ODR_CD = null;
	/** 第 83 変数： m_w_LOT_CTRL_FLG */
	public String m_w_LOT_CTRL_FLG = null;
	/** 第 84 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 85 変数： m_RCV_ISSUE_TYP */
	public Integer m_RCV_ISSUE_TYP = null;
	/** 第 86 変数： m_tmp_WH_CD */
	public String m_tmp_WH_CD = null;
	/** 第 87 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 88 変数： m_RCV_ISSUE_GNR_TYP */
	public Integer m_RCV_ISSUE_GNR_TYP = null;
	/** 第 89 変数： m_STOCK_UPD_TYP */
	public Integer m_STOCK_UPD_TYP = null;
	/** 第 90 変数： m_RCV_ISSUE_CMPLT_FLG */
	public Integer m_RCV_ISSUE_CMPLT_FLG = null;
	/** 第 91 変数： m_w_STOCK_LOT_CD */
	public String m_w_STOCK_LOT_CD = null;
	/** 第 92 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 93 変数： m_UNIT_COST_TYP */
	public Integer m_UNIT_COST_TYP = null;
	/** 第 94 変数： m_ONEROUS_FLG */
	public String m_ONEROUS_FLG = null;
	/** 第 95 変数： m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** 第 96 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 97 変数： m_RETURNED_WH_CD */
	public String m_RETURNED_WH_CD = null;
	/** 第 98 変数： m_STOCK_LOT_CD */
	public String m_STOCK_LOT_CD = null;
	/** 第 99 変数： m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** 第 100 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 101 変数： m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** 第 102 変数： m_l_ISSUE_QTY */
	public String m_l_ISSUE_QTY = null;
	/** 第 103 変数： m_l_ISSUE_DATE */
	public String m_l_ISSUE_DATE = null;
	/** 第 104 変数： m_l_SPENT_QTY */
	public String m_l_SPENT_QTY = null;
	/** 第 105 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 106 変数： m_w_TOTAL_STOCK_ON_HAND_QTY */
	public String m_w_TOTAL_STOCK_ON_HAND_QTY = null;
	/** 第 107 変数： m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** 第 108 変数： m_VALUE */
	public String m_VALUE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** 第 4 List変数： l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** 第 5 List変数： l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** 第 6 List変数： l_l_ERR_CTR_NM */
	public List l_l_ERR_CTR_NM = null;

	/** 第 7 List変数： l_l_ERR_ISSUE_INST_CD */
	public List l_l_ERR_ISSUE_INST_CD = null;

	/** 第 8 List変数： l_l_ERR_JOB_ODR_CD */
	public List l_l_ERR_JOB_ODR_CD = null;

	/** 第 9 List変数： l_l_ERR_ISSUE_WH_CD */
	public List l_l_ERR_ISSUE_WH_CD = null;

	/** 第 10 List変数： l_l_ERR_STOCK_LOT_CD */
	public List l_l_ERR_STOCK_LOT_CD = null;

	/** 第 11 List変数： l_l_ERR_ISSUE_QTY */
	public List l_l_ERR_ISSUE_QTY = null;

	/** 第 12 List変数： l_l_ERR_ISSUE_DATE */
	public List l_l_ERR_ISSUE_DATE = null;

	/** 第 13 List変数： l_l_ERR_ISSUE_CMPLT_FLG */
	public List l_l_ERR_ISSUE_CMPLT_FLG = null;

	/** 第 14 List変数： l_l_ERR_RCV_WH_CD */
	public List l_l_ERR_RCV_WH_CD = null;

	/** 第 15 List変数： l_l_ERR_VEND_LOT_NO */
	public List l_l_ERR_VEND_LOT_NO = null;

	/** 第 16 List変数： l_l_ERR_ITEM_CD */
	public List l_l_ERR_ITEM_CD = null;

	/** 第 17 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 18 List変数： l_ISSUE_QTY */
	public List l_ISSUE_QTY = null;

	/** 第 19 List変数： l_ISSUE_CMPLT_FLG */
	public List l_ISSUE_CMPLT_FLG = null;

	/** 第 20 List変数： l_RCV_WH_CD */
	public List l_RCV_WH_CD = null;

	/** 第 21 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 22 List変数： l_ISSUE_DATE */
	public List l_ISSUE_DATE = null;

	/** 第 23 List変数： l_tmp_RCV_ISSUE_QTY */
	public List l_tmp_RCV_ISSUE_QTY = null;

	/** 第 24 List変数： l_THIS_TIME_ISSUE_POSS_QTY */
	public List l_THIS_TIME_ISSUE_POSS_QTY = null;

	/** 第 25 List変数： l_ALC_NOISSUE_QTY */
	public List l_ALC_NOISSUE_QTY = null;

	/** 第 26 List変数： l_ODR_ISSUE_POSS_QTY */
	public List l_ODR_ISSUE_POSS_QTY = null;

	/** 第 27 List変数： l_ITEM_STOCK_NON_ALC_QTY */
	public List l_ITEM_STOCK_NON_ALC_QTY = null;

	/** 第 28 List変数： l_L_JOB_ODR_CD */
	public List l_L_JOB_ODR_CD = null;

	/** 第 29 List変数： l_LA_ISSUE_QTY */
	public List l_LA_ISSUE_QTY = null;

	/** 第 30 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 31 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 32 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 33 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 34 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 35 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 36 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 37 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 38 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 39 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 40 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 41 List変数： l_ISSUE_INST_QTY */
	public List l_ISSUE_INST_QTY = null;

	/** 第 42 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 43 List変数： l_SHIP_REMAIN_QTY */
	public List l_SHIP_REMAIN_QTY = null;

	/** 第 44 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 45 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 46 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 47 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 48 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 49 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 50 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 51 List変数： l_BEST_BEFORE_DATE */
	public List l_BEST_BEFORE_DATE = null;

	/** 第 52 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 53 List変数： l_ISSUE_DATE_SUB */
	public List l_ISSUE_DATE_SUB = null;

	/** 第 54 List変数： l_SYS_PARAMETER_VALUE */
	public List l_SYS_PARAMETER_VALUE = null;

	/** 第 55 List変数： l_SYS_PARAMETER_NAME */
	public List l_SYS_PARAMETER_NAME = null;

	/** 第 56 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 57 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 58 List変数： l_w_SHIP_REMAIN_QTY */
	public List l_w_SHIP_REMAIN_QTY = null;

	/** 第 59 List変数： l_SCDL_ISSUE_DATE */
	public List l_SCDL_ISSUE_DATE = null;

	/** 第 60 List変数： l_ISSUE_CMPLT_DATE */
	public List l_ISSUE_CMPLT_DATE = null;

	/** 第 61 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 62 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 63 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 64 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 65 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 66 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 67 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 68 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 69 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 70 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 71 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 72 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 73 List変数： l_OPR_INST_CD_proc */
	public List l_OPR_INST_CD_proc = null;

	/** 第 74 List変数： l_OPR_INST_CD_item */
	public List l_OPR_INST_CD_item = null;

	/** 第 75 List変数： l_w_ISSUE_INST_CD */
	public List l_w_ISSUE_INST_CD = null;

	/** 第 76 List変数： l_w_WS_CD */
	public List l_w_WS_CD = null;

	/** 第 77 List変数： l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** 第 78 List変数： l_w_ISSUE_CMPLT_FLG */
	public List l_w_ISSUE_CMPLT_FLG = null;

	/** 第 79 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 80 List変数： l_t_WORK_ODR_CD */
	public List l_t_WORK_ODR_CD = null;

	/** 第 81 List変数： l_t_WORK_IN_PROC_CD */
	public List l_t_WORK_IN_PROC_CD = null;

	/** 第 82 List変数： l_w_PUCH_ODR_CD */
	public List l_w_PUCH_ODR_CD = null;

	/** 第 83 List変数： l_w_LOT_CTRL_FLG */
	public List l_w_LOT_CTRL_FLG = null;

	/** 第 84 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 85 List変数： l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** 第 86 List変数： l_tmp_WH_CD */
	public List l_tmp_WH_CD = null;

	/** 第 87 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 88 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 89 List変数： l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** 第 90 List変数： l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** 第 91 List変数： l_w_STOCK_LOT_CD */
	public List l_w_STOCK_LOT_CD = null;

	/** 第 92 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 93 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 94 List変数： l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** 第 95 List変数： l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** 第 96 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 97 List変数： l_RETURNED_WH_CD */
	public List l_RETURNED_WH_CD = null;

	/** 第 98 List変数： l_STOCK_LOT_CD */
	public List l_STOCK_LOT_CD = null;

	/** 第 99 List変数： l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** 第 100 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 101 List変数： l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** 第 102 List変数： l_l_ISSUE_QTY */
	public List l_l_ISSUE_QTY = null;

	/** 第 103 List変数： l_l_ISSUE_DATE */
	public List l_l_ISSUE_DATE = null;

	/** 第 104 List変数： l_l_SPENT_QTY */
	public List l_l_SPENT_QTY = null;

	/** 第 105 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 106 List変数： l_w_TOTAL_STOCK_ON_HAND_QTY */
	public List l_w_TOTAL_STOCK_ON_HAND_QTY = null;

	/** 第 107 List変数： l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** 第 108 List変数： l_VALUE */
	public List l_VALUE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_ISSUE_INST_CD() { return m_l_ERR_ISSUE_INST_CD; }
	public String getl_ERR_JOB_ODR_CD() { return m_l_ERR_JOB_ODR_CD; }
	public String getl_ERR_ISSUE_WH_CD() { return m_l_ERR_ISSUE_WH_CD; }
	public String getl_ERR_STOCK_LOT_CD() { return m_l_ERR_STOCK_LOT_CD; }
	public String getl_ERR_ISSUE_QTY() { return m_l_ERR_ISSUE_QTY; }
	public String getl_ERR_ISSUE_DATE() { return m_l_ERR_ISSUE_DATE; }
	public String getl_ERR_ISSUE_CMPLT_FLG() { return m_l_ERR_ISSUE_CMPLT_FLG; }
	public String getl_ERR_RCV_WH_CD() { return m_l_ERR_RCV_WH_CD; }
	public String getl_ERR_VEND_LOT_NO() { return m_l_ERR_VEND_LOT_NO; }
	public String getl_ERR_ITEM_CD() { return m_l_ERR_ITEM_CD; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getISSUE_QTY() { return m_ISSUE_QTY; }
	public String getISSUE_CMPLT_FLG() { return m_ISSUE_CMPLT_FLG; }
	public String getRCV_WH_CD() { return m_RCV_WH_CD; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getISSUE_DATE() { return m_ISSUE_DATE; }
	public String gettmp_RCV_ISSUE_QTY() { return m_tmp_RCV_ISSUE_QTY; }
	public String getTHIS_TIME_ISSUE_POSS_QTY() { return m_THIS_TIME_ISSUE_POSS_QTY; }
	public String getALC_NOISSUE_QTY() { return m_ALC_NOISSUE_QTY; }
	public String getODR_ISSUE_POSS_QTY() { return m_ODR_ISSUE_POSS_QTY; }
	public String getITEM_STOCK_NON_ALC_QTY() { return m_ITEM_STOCK_NON_ALC_QTY; }
	public String getL_JOB_ODR_CD() { return m_L_JOB_ODR_CD; }
	public String getLA_ISSUE_QTY() { return m_LA_ISSUE_QTY; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getISSUE_INST_QTY() { return m_ISSUE_INST_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getSHIP_REMAIN_QTY() { return m_SHIP_REMAIN_QTY; }
	public String getCOUNT() { return m_COUNT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getISSUE_DATE_SUB() { return m_ISSUE_DATE_SUB; }
	public String getSYS_PARAMETER_VALUE() { return m_SYS_PARAMETER_VALUE; }
	public String getSYS_PARAMETER_NAME() { return m_SYS_PARAMETER_NAME; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getw_SHIP_REMAIN_QTY() { return m_w_SHIP_REMAIN_QTY; }
	public String getSCDL_ISSUE_DATE() { return m_SCDL_ISSUE_DATE; }
	public String getISSUE_CMPLT_DATE() { return m_ISSUE_CMPLT_DATE; }
	public String getWS_CD() { return m_WS_CD; }
	public Integer getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public Integer getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getOPR_INST_CD_proc() { return m_OPR_INST_CD_proc; }
	public String getOPR_INST_CD_item() { return m_OPR_INST_CD_item; }
	public String getw_ISSUE_INST_CD() { return m_w_ISSUE_INST_CD; }
	public String getw_WS_CD() { return m_w_WS_CD; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getw_ISSUE_CMPLT_FLG() { return m_w_ISSUE_CMPLT_FLG; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String gett_WORK_ODR_CD() { return m_t_WORK_ODR_CD; }
	public String gett_WORK_IN_PROC_CD() { return m_t_WORK_IN_PROC_CD; }
	public String getw_PUCH_ODR_CD() { return m_w_PUCH_ODR_CD; }
	public String getw_LOT_CTRL_FLG() { return m_w_LOT_CTRL_FLG; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String gettmp_WH_CD() { return m_tmp_WH_CD; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getw_STOCK_LOT_CD() { return m_w_STOCK_LOT_CD; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public Integer getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRETURNED_WH_CD() { return m_RETURNED_WH_CD; }
	public String getSTOCK_LOT_CD() { return m_STOCK_LOT_CD; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String getl_ISSUE_QTY() { return m_l_ISSUE_QTY; }
	public String getl_ISSUE_DATE() { return m_l_ISSUE_DATE; }
	public String getl_SPENT_QTY() { return m_l_SPENT_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getw_TOTAL_STOCK_ON_HAND_QTY() { return m_w_TOTAL_STOCK_ON_HAND_QTY; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String getVALUE() { return m_VALUE; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_ISSUE_INST_CD() { return l_l_ERR_ISSUE_INST_CD; }
	public List getList_l_ERR_JOB_ODR_CD() { return l_l_ERR_JOB_ODR_CD; }
	public List getList_l_ERR_ISSUE_WH_CD() { return l_l_ERR_ISSUE_WH_CD; }
	public List getList_l_ERR_STOCK_LOT_CD() { return l_l_ERR_STOCK_LOT_CD; }
	public List getList_l_ERR_ISSUE_QTY() { return l_l_ERR_ISSUE_QTY; }
	public List getList_l_ERR_ISSUE_DATE() { return l_l_ERR_ISSUE_DATE; }
	public List getList_l_ERR_ISSUE_CMPLT_FLG() { return l_l_ERR_ISSUE_CMPLT_FLG; }
	public List getList_l_ERR_RCV_WH_CD() { return l_l_ERR_RCV_WH_CD; }
	public List getList_l_ERR_VEND_LOT_NO() { return l_l_ERR_VEND_LOT_NO; }
	public List getList_l_ERR_ITEM_CD() { return l_l_ERR_ITEM_CD; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_ISSUE_QTY() { return l_ISSUE_QTY; }
	public List getList_ISSUE_CMPLT_FLG() { return l_ISSUE_CMPLT_FLG; }
	public List getList_RCV_WH_CD() { return l_RCV_WH_CD; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_ISSUE_DATE() { return l_ISSUE_DATE; }
	public List getList_tmp_RCV_ISSUE_QTY() { return l_tmp_RCV_ISSUE_QTY; }
	public List getList_THIS_TIME_ISSUE_POSS_QTY() { return l_THIS_TIME_ISSUE_POSS_QTY; }
	public List getList_ALC_NOISSUE_QTY() { return l_ALC_NOISSUE_QTY; }
	public List getList_ODR_ISSUE_POSS_QTY() { return l_ODR_ISSUE_POSS_QTY; }
	public List getList_ITEM_STOCK_NON_ALC_QTY() { return l_ITEM_STOCK_NON_ALC_QTY; }
	public List getList_L_JOB_ODR_CD() { return l_L_JOB_ODR_CD; }
	public List getList_LA_ISSUE_QTY() { return l_LA_ISSUE_QTY; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_ISSUE_INST_QTY() { return l_ISSUE_INST_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_SHIP_REMAIN_QTY() { return l_SHIP_REMAIN_QTY; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_BEST_BEFORE_DATE() { return l_BEST_BEFORE_DATE; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_ISSUE_DATE_SUB() { return l_ISSUE_DATE_SUB; }
	public List getList_SYS_PARAMETER_VALUE() { return l_SYS_PARAMETER_VALUE; }
	public List getList_SYS_PARAMETER_NAME() { return l_SYS_PARAMETER_NAME; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_w_SHIP_REMAIN_QTY() { return l_w_SHIP_REMAIN_QTY; }
	public List getList_SCDL_ISSUE_DATE() { return l_SCDL_ISSUE_DATE; }
	public List getList_ISSUE_CMPLT_DATE() { return l_ISSUE_CMPLT_DATE; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_OPR_INST_CD_proc() { return l_OPR_INST_CD_proc; }
	public List getList_OPR_INST_CD_item() { return l_OPR_INST_CD_item; }
	public List getList_w_ISSUE_INST_CD() { return l_w_ISSUE_INST_CD; }
	public List getList_w_WS_CD() { return l_w_WS_CD; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_w_ISSUE_CMPLT_FLG() { return l_w_ISSUE_CMPLT_FLG; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_t_WORK_ODR_CD() { return l_t_WORK_ODR_CD; }
	public List getList_t_WORK_IN_PROC_CD() { return l_t_WORK_IN_PROC_CD; }
	public List getList_w_PUCH_ODR_CD() { return l_w_PUCH_ODR_CD; }
	public List getList_w_LOT_CTRL_FLG() { return l_w_LOT_CTRL_FLG; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_tmp_WH_CD() { return l_tmp_WH_CD; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_w_STOCK_LOT_CD() { return l_w_STOCK_LOT_CD; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RETURNED_WH_CD() { return l_RETURNED_WH_CD; }
	public List getList_STOCK_LOT_CD() { return l_STOCK_LOT_CD; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_l_ISSUE_QTY() { return l_l_ISSUE_QTY; }
	public List getList_l_ISSUE_DATE() { return l_l_ISSUE_DATE; }
	public List getList_l_SPENT_QTY() { return l_l_SPENT_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_w_TOTAL_STOCK_ON_HAND_QTY() { return l_w_TOTAL_STOCK_ON_HAND_QTY; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_VALUE() { return l_VALUE; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_ISSUE_INST_CD(String val) { m_l_ERR_ISSUE_INST_CD = val; }
	public void setl_ERR_JOB_ODR_CD(String val) { m_l_ERR_JOB_ODR_CD = val; }
	public void setl_ERR_ISSUE_WH_CD(String val) { m_l_ERR_ISSUE_WH_CD = val; }
	public void setl_ERR_STOCK_LOT_CD(String val) { m_l_ERR_STOCK_LOT_CD = val; }
	public void setl_ERR_ISSUE_QTY(String val) { m_l_ERR_ISSUE_QTY = val; }
	public void setl_ERR_ISSUE_DATE(String val) { m_l_ERR_ISSUE_DATE = val; }
	public void setl_ERR_ISSUE_CMPLT_FLG(String val) { m_l_ERR_ISSUE_CMPLT_FLG = val; }
	public void setl_ERR_RCV_WH_CD(String val) { m_l_ERR_RCV_WH_CD = val; }
	public void setl_ERR_VEND_LOT_NO(String val) { m_l_ERR_VEND_LOT_NO = val; }
	public void setl_ERR_ITEM_CD(String val) { m_l_ERR_ITEM_CD = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setISSUE_QTY(String val) { m_ISSUE_QTY = val; }
	public void setISSUE_CMPLT_FLG(String val) { m_ISSUE_CMPLT_FLG = val; }
	public void setRCV_WH_CD(String val) { m_RCV_WH_CD = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setISSUE_DATE(String val) { m_ISSUE_DATE = val; }
	public void settmp_RCV_ISSUE_QTY(String val) { m_tmp_RCV_ISSUE_QTY = val; }
	public void setTHIS_TIME_ISSUE_POSS_QTY(String val) { m_THIS_TIME_ISSUE_POSS_QTY = val; }
	public void setALC_NOISSUE_QTY(String val) { m_ALC_NOISSUE_QTY = val; }
	public void setODR_ISSUE_POSS_QTY(String val) { m_ODR_ISSUE_POSS_QTY = val; }
	public void setITEM_STOCK_NON_ALC_QTY(String val) { m_ITEM_STOCK_NON_ALC_QTY = val; }
	public void setL_JOB_ODR_CD(String val) { m_L_JOB_ODR_CD = val; }
	public void setLA_ISSUE_QTY(String val) { m_LA_ISSUE_QTY = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setISSUE_INST_QTY(String val) { m_ISSUE_INST_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setSHIP_REMAIN_QTY(String val) { m_SHIP_REMAIN_QTY = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setBEST_BEFORE_DATE(String val) { m_BEST_BEFORE_DATE = val; }
	public void setPROC_EXEC_DATE(String val) { m_PROC_EXEC_DATE = val; }
	public void setISSUE_DATE_SUB(String val) { m_ISSUE_DATE_SUB = val; }
	public void setSYS_PARAMETER_VALUE(String val) { m_SYS_PARAMETER_VALUE = val; }
	public void setSYS_PARAMETER_NAME(String val) { m_SYS_PARAMETER_NAME = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setw_SHIP_REMAIN_QTY(String val) { m_w_SHIP_REMAIN_QTY = val; }
	public void setSCDL_ISSUE_DATE(String val) { m_SCDL_ISSUE_DATE = val; }
	public void setISSUE_CMPLT_DATE(String val) { m_ISSUE_CMPLT_DATE = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setMODIFY_COUNT(Integer val) { m_MODIFY_COUNT = val; }
	public void setJOB_ODR_DETAIL_NO(Integer val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setOPR_INST_CD_proc(String val) { m_OPR_INST_CD_proc = val; }
	public void setOPR_INST_CD_item(String val) { m_OPR_INST_CD_item = val; }
	public void setw_ISSUE_INST_CD(String val) { m_w_ISSUE_INST_CD = val; }
	public void setw_WS_CD(String val) { m_w_WS_CD = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setw_ISSUE_CMPLT_FLG(String val) { m_w_ISSUE_CMPLT_FLG = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void sett_WORK_ODR_CD(String val) { m_t_WORK_ODR_CD = val; }
	public void sett_WORK_IN_PROC_CD(String val) { m_t_WORK_IN_PROC_CD = val; }
	public void setw_PUCH_ODR_CD(String val) { m_w_PUCH_ODR_CD = val; }
	public void setw_LOT_CTRL_FLG(String val) { m_w_LOT_CTRL_FLG = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	public void settmp_WH_CD(String val) { m_tmp_WH_CD = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setw_STOCK_LOT_CD(String val) { m_w_STOCK_LOT_CD = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP(Integer val) { m_UNIT_COST_TYP = val; }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRETURNED_WH_CD(String val) { m_RETURNED_WH_CD = val; }
	public void setSTOCK_LOT_CD(String val) { m_STOCK_LOT_CD = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void setl_ISSUE_QTY(String val) { m_l_ISSUE_QTY = val; }
	public void setl_ISSUE_DATE(String val) { m_l_ISSUE_DATE = val; }
	public void setl_SPENT_QTY(String val) { m_l_SPENT_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setw_TOTAL_STOCK_ON_HAND_QTY(String val) { m_w_TOTAL_STOCK_ON_HAND_QTY = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }

	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = getInteger(val); }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = getInteger(val); }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = getInteger(val); }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = getInteger(val); }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = getInteger(val); }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = getInteger(val); }

	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_ISSUE_INST_CD(List list) { l_l_ERR_ISSUE_INST_CD = list; }
	public void setList_l_ERR_JOB_ODR_CD(List list) { l_l_ERR_JOB_ODR_CD = list; }
	public void setList_l_ERR_ISSUE_WH_CD(List list) { l_l_ERR_ISSUE_WH_CD = list; }
	public void setList_l_ERR_STOCK_LOT_CD(List list) { l_l_ERR_STOCK_LOT_CD = list; }
	public void setList_l_ERR_ISSUE_QTY(List list) { l_l_ERR_ISSUE_QTY = list; }
	public void setList_l_ERR_ISSUE_DATE(List list) { l_l_ERR_ISSUE_DATE = list; }
	public void setList_l_ERR_ISSUE_CMPLT_FLG(List list) { l_l_ERR_ISSUE_CMPLT_FLG = list; }
	public void setList_l_ERR_RCV_WH_CD(List list) { l_l_ERR_RCV_WH_CD = list; }
	public void setList_l_ERR_VEND_LOT_NO(List list) { l_l_ERR_VEND_LOT_NO = list; }
	public void setList_l_ERR_ITEM_CD(List list) { l_l_ERR_ITEM_CD = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_ISSUE_QTY(List list) { l_ISSUE_QTY = list; }
	public void setList_ISSUE_CMPLT_FLG(List list) { l_ISSUE_CMPLT_FLG = list; }
	public void setList_RCV_WH_CD(List list) { l_RCV_WH_CD = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_ISSUE_DATE(List list) { l_ISSUE_DATE = list; }
	public void setList_tmp_RCV_ISSUE_QTY(List list) { l_tmp_RCV_ISSUE_QTY = list; }
	public void setList_THIS_TIME_ISSUE_POSS_QTY(List list) { l_THIS_TIME_ISSUE_POSS_QTY = list; }
	public void setList_ALC_NOISSUE_QTY(List list) { l_ALC_NOISSUE_QTY = list; }
	public void setList_ODR_ISSUE_POSS_QTY(List list) { l_ODR_ISSUE_POSS_QTY = list; }
	public void setList_ITEM_STOCK_NON_ALC_QTY(List list) { l_ITEM_STOCK_NON_ALC_QTY = list; }
	public void setList_L_JOB_ODR_CD(List list) { l_L_JOB_ODR_CD = list; }
	public void setList_LA_ISSUE_QTY(List list) { l_LA_ISSUE_QTY = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_ISSUE_INST_QTY(List list) { l_ISSUE_INST_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_SHIP_REMAIN_QTY(List list) { l_SHIP_REMAIN_QTY = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_BEST_BEFORE_DATE(List list) { l_BEST_BEFORE_DATE = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_ISSUE_DATE_SUB(List list) { l_ISSUE_DATE_SUB = list; }
	public void setList_SYS_PARAMETER_VALUE(List list) { l_SYS_PARAMETER_VALUE = list; }
	public void setList_SYS_PARAMETER_NAME(List list) { l_SYS_PARAMETER_NAME = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_w_SHIP_REMAIN_QTY(List list) { l_w_SHIP_REMAIN_QTY = list; }
	public void setList_SCDL_ISSUE_DATE(List list) { l_SCDL_ISSUE_DATE = list; }
	public void setList_ISSUE_CMPLT_DATE(List list) { l_ISSUE_CMPLT_DATE = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_OPR_INST_CD_proc(List list) { l_OPR_INST_CD_proc = list; }
	public void setList_OPR_INST_CD_item(List list) { l_OPR_INST_CD_item = list; }
	public void setList_w_ISSUE_INST_CD(List list) { l_w_ISSUE_INST_CD = list; }
	public void setList_w_WS_CD(List list) { l_w_WS_CD = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_w_ISSUE_CMPLT_FLG(List list) { l_w_ISSUE_CMPLT_FLG = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_t_WORK_ODR_CD(List list) { l_t_WORK_ODR_CD = list; }
	public void setList_t_WORK_IN_PROC_CD(List list) { l_t_WORK_IN_PROC_CD = list; }
	public void setList_w_PUCH_ODR_CD(List list) { l_w_PUCH_ODR_CD = list; }
	public void setList_w_LOT_CTRL_FLG(List list) { l_w_LOT_CTRL_FLG = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_tmp_WH_CD(List list) { l_tmp_WH_CD = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_w_STOCK_LOT_CD(List list) { l_w_STOCK_LOT_CD = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RETURNED_WH_CD(List list) { l_RETURNED_WH_CD = list; }
	public void setList_STOCK_LOT_CD(List list) { l_STOCK_LOT_CD = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_l_ISSUE_QTY(List list) { l_l_ISSUE_QTY = list; }
	public void setList_l_ISSUE_DATE(List list) { l_l_ISSUE_DATE = list; }
	public void setList_l_SPENT_QTY(List list) { l_l_SPENT_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_w_TOTAL_STOCK_ON_HAND_QTY(List list) { l_w_TOTAL_STOCK_ON_HAND_QTY = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }

	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AF0130010Struct) list.get(i)).getFileName());
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
			l_DOWNLOAD_FILE.add(((AF0130010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AF0130010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AF0130010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AF0130010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_l_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CTR_NM == null) {
			l_l_ERR_CTR_NM = new ArrayList();
		} else {
			l_l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CTR_NM.add(((AF0130010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ISSUE_INST_CD == null) {
			l_l_ERR_ISSUE_INST_CD = new ArrayList();
		} else {
			l_l_ERR_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ISSUE_INST_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_JOB_ODR_CD == null) {
			l_l_ERR_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_ERR_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_JOB_ODR_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_ISSUE_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ISSUE_WH_CD == null) {
			l_l_ERR_ISSUE_WH_CD = new ArrayList();
		} else {
			l_l_ERR_ISSUE_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ISSUE_WH_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_ISSUE_WH_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_STOCK_LOT_CD == null) {
			l_l_ERR_STOCK_LOT_CD = new ArrayList();
		} else {
			l_l_ERR_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_STOCK_LOT_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_STOCK_LOT_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ISSUE_QTY == null) {
			l_l_ERR_ISSUE_QTY = new ArrayList();
		} else {
			l_l_ERR_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getl_ERR_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ISSUE_DATE == null) {
			l_l_ERR_ISSUE_DATE = new ArrayList();
		} else {
			l_l_ERR_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ISSUE_DATE.add(((AF0130010Struct) list.get(i)).getl_ERR_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ISSUE_CMPLT_FLG == null) {
			l_l_ERR_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_l_ERR_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ISSUE_CMPLT_FLG.add(((AF0130010Struct) list.get(i)).getl_ERR_ISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_l_ERR_RCV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_RCV_WH_CD == null) {
			l_l_ERR_RCV_WH_CD = new ArrayList();
		} else {
			l_l_ERR_RCV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_RCV_WH_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_RCV_WH_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_VEND_LOT_NO == null) {
			l_l_ERR_VEND_LOT_NO = new ArrayList();
		} else {
			l_l_ERR_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_VEND_LOT_NO.add(((AF0130010Struct) list.get(i)).getl_ERR_VEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_ERR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ITEM_CD == null) {
			l_l_ERR_ITEM_CD = new ArrayList();
		} else {
			l_l_ERR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ITEM_CD.add(((AF0130010Struct) list.get(i)).getl_ERR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AF0130010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_QTY == null) {
			l_ISSUE_QTY = new ArrayList();
		} else {
			l_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getISSUE_QTY());
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
			l_ISSUE_CMPLT_FLG.add(((AF0130010Struct) list.get(i)).getISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_RCV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_WH_CD == null) {
			l_RCV_WH_CD = new ArrayList();
		} else {
			l_RCV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_WH_CD.add(((AF0130010Struct) list.get(i)).getRCV_WH_CD());
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
			l_VEND_LOT_NO.add(((AF0130010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE == null) {
			l_ISSUE_DATE = new ArrayList();
		} else {
			l_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE.add(((AF0130010Struct) list.get(i)).getISSUE_DATE());
		}
		return size;
	}
	public int setL2L_tmp_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tmp_RCV_ISSUE_QTY == null) {
			l_tmp_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_tmp_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tmp_RCV_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).gettmp_RCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_THIS_TIME_ISSUE_POSS_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_THIS_TIME_ISSUE_POSS_QTY == null) {
			l_THIS_TIME_ISSUE_POSS_QTY = new ArrayList();
		} else {
			l_THIS_TIME_ISSUE_POSS_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_THIS_TIME_ISSUE_POSS_QTY.add(((AF0130010Struct) list.get(i)).getTHIS_TIME_ISSUE_POSS_QTY());
		}
		return size;
	}
	public int setL2L_ALC_NOISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_NOISSUE_QTY == null) {
			l_ALC_NOISSUE_QTY = new ArrayList();
		} else {
			l_ALC_NOISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_NOISSUE_QTY.add(((AF0130010Struct) list.get(i)).getALC_NOISSUE_QTY());
		}
		return size;
	}
	public int setL2L_ODR_ISSUE_POSS_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ISSUE_POSS_QTY == null) {
			l_ODR_ISSUE_POSS_QTY = new ArrayList();
		} else {
			l_ODR_ISSUE_POSS_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ISSUE_POSS_QTY.add(((AF0130010Struct) list.get(i)).getODR_ISSUE_POSS_QTY());
		}
		return size;
	}
	public int setL2L_ITEM_STOCK_NON_ALC_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_STOCK_NON_ALC_QTY == null) {
			l_ITEM_STOCK_NON_ALC_QTY = new ArrayList();
		} else {
			l_ITEM_STOCK_NON_ALC_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_STOCK_NON_ALC_QTY.add(((AF0130010Struct) list.get(i)).getITEM_STOCK_NON_ALC_QTY());
		}
		return size;
	}
	public int setL2L_L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_JOB_ODR_CD == null) {
			l_L_JOB_ODR_CD = new ArrayList();
		} else {
			l_L_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_JOB_ODR_CD.add(((AF0130010Struct) list.get(i)).getL_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_LA_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LA_ISSUE_QTY == null) {
			l_LA_ISSUE_QTY = new ArrayList();
		} else {
			l_LA_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LA_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getLA_ISSUE_QTY());
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
			l_ISSUE_INST_CD.add(((AF0130010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AF0130010Struct) list.get(i)).getOD_NO());
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
			l_ITEM_CD.add(((AF0130010Struct) list.get(i)).getITEM_CD());
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
			l_PLANT_CD.add(((AF0130010Struct) list.get(i)).getPLANT_CD());
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
			l_PUCH_ODR_CD.add(((AF0130010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_COMPANY_CD.add(((AF0130010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AF0130010Struct) list.get(i)).getVEND_CD());
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
			l_WORK_ODR_CD.add(((AF0130010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_WORK_IN_PROC_CD.add(((AF0130010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP == null) {
			l_ISSUE_TYP = new ArrayList();
		} else {
			l_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP.add(((AF0130010Struct) list.get(i)).getISSUE_TYP());
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
			l_CONS_TYP.add(((AF0130010Struct) list.get(i)).getCONS_TYP());
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
			l_ISSUE_INST_QTY.add(((AF0130010Struct) list.get(i)).getISSUE_INST_QTY());
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
			l_TOTAL_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_REMAIN_QTY == null) {
			l_SHIP_REMAIN_QTY = new ArrayList();
		} else {
			l_SHIP_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_REMAIN_QTY.add(((AF0130010Struct) list.get(i)).getSHIP_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AF0130010Struct) list.get(i)).getCOUNT());
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
			l_JOB_ODR_CD.add(((AF0130010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_WH_CD.add(((AF0130010Struct) list.get(i)).getWH_CD());
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
			l_MRP_FLG.add(((AF0130010Struct) list.get(i)).getMRP_FLG());
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
			l_LOT_CTRL_FLG.add(((AF0130010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_MRP_ODR_TYP.add(((AF0130010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_LOT_NO.add(((AF0130010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DATE == null) {
			l_BEST_BEFORE_DATE = new ArrayList();
		} else {
			l_BEST_BEFORE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DATE.add(((AF0130010Struct) list.get(i)).getBEST_BEFORE_DATE());
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
			l_PROC_EXEC_DATE.add(((AF0130010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE_SUB(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE_SUB == null) {
			l_ISSUE_DATE_SUB = new ArrayList();
		} else {
			l_ISSUE_DATE_SUB.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE_SUB.add(((AF0130010Struct) list.get(i)).getISSUE_DATE_SUB());
		}
		return size;
	}
	public int setL2L_SYS_PARAMETER_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAMETER_VALUE == null) {
			l_SYS_PARAMETER_VALUE = new ArrayList();
		} else {
			l_SYS_PARAMETER_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAMETER_VALUE.add(((AF0130010Struct) list.get(i)).getSYS_PARAMETER_VALUE());
		}
		return size;
	}
	public int setL2L_SYS_PARAMETER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAMETER_NAME == null) {
			l_SYS_PARAMETER_NAME = new ArrayList();
		} else {
			l_SYS_PARAMETER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAMETER_NAME.add(((AF0130010Struct) list.get(i)).getSYS_PARAMETER_NAME());
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
			l_INSTALL_FLG.add(((AF0130010Struct) list.get(i)).getINSTALL_FLG());
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
			l_THIS_MONTH.add(((AF0130010Struct) list.get(i)).getTHIS_MONTH());
		}
		return size;
	}
	public int setL2L_w_SHIP_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_REMAIN_QTY == null) {
			l_w_SHIP_REMAIN_QTY = new ArrayList();
		} else {
			l_w_SHIP_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_REMAIN_QTY.add(((AF0130010Struct) list.get(i)).getw_SHIP_REMAIN_QTY());
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
			l_SCDL_ISSUE_DATE.add(((AF0130010Struct) list.get(i)).getSCDL_ISSUE_DATE());
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
			l_ISSUE_CMPLT_DATE.add(((AF0130010Struct) list.get(i)).getISSUE_CMPLT_DATE());
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
			l_WS_CD.add(((AF0130010Struct) list.get(i)).getWS_CD());
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
			l_MODIFY_COUNT.add(((AF0130010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_JOB_ODR_DETAIL_NO.add(((AF0130010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_ITEM_NAME.add(((AF0130010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AF0130010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0130010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0130010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AF0130010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_WH_NAME.add(((AF0130010Struct) list.get(i)).getWH_NAME());
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
			l_WS_NAME.add(((AF0130010Struct) list.get(i)).getWS_NAME());
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
			l_VEND_NAME.add(((AF0130010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NAME == null) {
			l_PROC_NAME = new ArrayList();
		} else {
			l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NAME.add(((AF0130010Struct) list.get(i)).getPROC_NAME());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_proc(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_proc == null) {
			l_OPR_INST_CD_proc = new ArrayList();
		} else {
			l_OPR_INST_CD_proc.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_proc.add(((AF0130010Struct) list.get(i)).getOPR_INST_CD_proc());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_item(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_item == null) {
			l_OPR_INST_CD_item = new ArrayList();
		} else {
			l_OPR_INST_CD_item.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_item.add(((AF0130010Struct) list.get(i)).getOPR_INST_CD_item());
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
			l_w_ISSUE_INST_CD.add(((AF0130010Struct) list.get(i)).getw_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_w_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WS_CD == null) {
			l_w_WS_CD = new ArrayList();
		} else {
			l_w_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WS_CD.add(((AF0130010Struct) list.get(i)).getw_WS_CD());
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
			l_w_VEND_CD.add(((AF0130010Struct) list.get(i)).getw_VEND_CD());
		}
		return size;
	}
	public int setL2L_w_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ISSUE_CMPLT_FLG == null) {
			l_w_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_w_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ISSUE_CMPLT_FLG.add(((AF0130010Struct) list.get(i)).getw_ISSUE_CMPLT_FLG());
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
			l_w_PLANT_CD.add(((AF0130010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_t_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_WORK_ODR_CD == null) {
			l_t_WORK_ODR_CD = new ArrayList();
		} else {
			l_t_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_WORK_ODR_CD.add(((AF0130010Struct) list.get(i)).gett_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_t_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_WORK_IN_PROC_CD == null) {
			l_t_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_t_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_WORK_IN_PROC_CD.add(((AF0130010Struct) list.get(i)).gett_WORK_IN_PROC_CD());
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
			l_w_PUCH_ODR_CD.add(((AF0130010Struct) list.get(i)).getw_PUCH_ODR_CD());
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
			l_w_LOT_CTRL_FLG.add(((AF0130010Struct) list.get(i)).getw_LOT_CTRL_FLG());
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
			l_RCV_ISSUE_CTRL_CD.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
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
			l_RCV_ISSUE_TYP.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_tmp_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tmp_WH_CD == null) {
			l_tmp_WH_CD = new ArrayList();
		} else {
			l_tmp_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tmp_WH_CD.add(((AF0130010Struct) list.get(i)).gettmp_WH_CD());
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
			l_RCV_ISSUE_DATE.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_RCV_ISSUE_GNR_TYP.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
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
			l_STOCK_UPD_TYP.add(((AF0130010Struct) list.get(i)).getSTOCK_UPD_TYP());
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
			l_RCV_ISSUE_CMPLT_FLG.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_w_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_LOT_CD == null) {
			l_w_STOCK_LOT_CD = new ArrayList();
		} else {
			l_w_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_LOT_CD.add(((AF0130010Struct) list.get(i)).getw_STOCK_LOT_CD());
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
			l_UNIT_COST.add(((AF0130010Struct) list.get(i)).getUNIT_COST());
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
			l_UNIT_COST_TYP.add(((AF0130010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_ONEROUS_FLG.add(((AF0130010Struct) list.get(i)).getONEROUS_FLG());
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
			l_ONEROUS_CONS_NO.add(((AF0130010Struct) list.get(i)).getONEROUS_CONS_NO());
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
			l_RCV_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RETURNED_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_WH_CD == null) {
			l_RETURNED_WH_CD = new ArrayList();
		} else {
			l_RETURNED_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_WH_CD.add(((AF0130010Struct) list.get(i)).getRETURNED_WH_CD());
		}
		return size;
	}
	public int setL2L_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_LOT_CD == null) {
			l_STOCK_LOT_CD = new ArrayList();
		} else {
			l_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_LOT_CD.add(((AF0130010Struct) list.get(i)).getSTOCK_LOT_CD());
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
			l_l_LOT_NO.add(((AF0130010Struct) list.get(i)).getl_LOT_NO());
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
			l_l_PUCH_ODR_CD.add(((AF0130010Struct) list.get(i)).getl_PUCH_ODR_CD());
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
			l_l_WORK_ODR_CD.add(((AF0130010Struct) list.get(i)).getl_WORK_ODR_CD());
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
			l_l_ISSUE_QTY.add(((AF0130010Struct) list.get(i)).getl_ISSUE_QTY());
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
			l_l_ISSUE_DATE.add(((AF0130010Struct) list.get(i)).getl_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_l_SPENT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPENT_QTY == null) {
			l_l_SPENT_QTY = new ArrayList();
		} else {
			l_l_SPENT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPENT_QTY.add(((AF0130010Struct) list.get(i)).getl_SPENT_QTY());
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
			l_l_STOCK_UNIT.add(((AF0130010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_ON_HAND_QTY == null) {
			l_w_TOTAL_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_ON_HAND_QTY.add(((AF0130010Struct) list.get(i)).getw_TOTAL_STOCK_ON_HAND_QTY());
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
			l_w_JOB_ODR_CD.add(((AF0130010Struct) list.get(i)).getw_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AF0130010Struct) list.get(i)).getVALUE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_TYP = null;
		m_l_ERR_INFO = null;
		m_l_ERR_CTR_NM = null;
		m_l_ERR_ISSUE_INST_CD = null;
		m_l_ERR_JOB_ODR_CD = null;
		m_l_ERR_ISSUE_WH_CD = null;
		m_l_ERR_STOCK_LOT_CD = null;
		m_l_ERR_ISSUE_QTY = null;
		m_l_ERR_ISSUE_DATE = null;
		m_l_ERR_ISSUE_CMPLT_FLG = null;
		m_l_ERR_RCV_WH_CD = null;
		m_l_ERR_VEND_LOT_NO = null;
		m_l_ERR_ITEM_CD = null;
		m_w_COLUMN_FLG = null;
		m_ISSUE_QTY = null;
		m_ISSUE_CMPLT_FLG = null;
		m_RCV_WH_CD = null;
		m_VEND_LOT_NO = null;
		m_ISSUE_DATE = null;
		m_tmp_RCV_ISSUE_QTY = null;
		m_THIS_TIME_ISSUE_POSS_QTY = null;
		m_ALC_NOISSUE_QTY = null;
		m_ODR_ISSUE_POSS_QTY = null;
		m_ITEM_STOCK_NON_ALC_QTY = null;
		m_L_JOB_ODR_CD = null;
		m_LA_ISSUE_QTY = null;
		m_ISSUE_INST_CD = null;
		m_OD_NO = null;
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_ISSUE_TYP = null;
		m_CONS_TYP = null;
		m_ISSUE_INST_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_SHIP_REMAIN_QTY = null;
		m_COUNT = null;
		m_JOB_ODR_CD = null;
		m_WH_CD = null;
		m_MRP_FLG = null;
		m_LOT_CTRL_FLG = null;
		m_MRP_ODR_TYP = null;
		m_LOT_NO = null;
		m_BEST_BEFORE_DATE = null;
		m_PROC_EXEC_DATE = null;
		m_ISSUE_DATE_SUB = null;
		m_SYS_PARAMETER_VALUE = null;
		m_SYS_PARAMETER_NAME = null;
		m_INSTALL_FLG = null;
		m_THIS_MONTH = null;
		m_w_SHIP_REMAIN_QTY = null;
		m_SCDL_ISSUE_DATE = null;
		m_ISSUE_CMPLT_DATE = null;
		m_WS_CD = null;
		m_MODIFY_COUNT = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_UNIT_QTY_TYP = null;
		m_WH_NAME = null;
		m_WS_NAME = null;
		m_VEND_NAME = null;
		m_PROC_NAME = null;
		m_OPR_INST_CD_proc = null;
		m_OPR_INST_CD_item = null;
		m_w_ISSUE_INST_CD = null;
		m_w_WS_CD = null;
		m_w_VEND_CD = null;
		m_w_ISSUE_CMPLT_FLG = null;
		m_w_PLANT_CD = null;
		m_t_WORK_ODR_CD = null;
		m_t_WORK_IN_PROC_CD = null;
		m_w_PUCH_ODR_CD = null;
		m_w_LOT_CTRL_FLG = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_tmp_WH_CD = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_w_STOCK_LOT_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_ONEROUS_FLG = null;
		m_ONEROUS_CONS_NO = null;
		m_RCV_ISSUE_QTY = null;
		m_RETURNED_WH_CD = null;
		m_STOCK_LOT_CD = null;
		m_l_LOT_NO = null;
		m_l_PUCH_ODR_CD = null;
		m_l_WORK_ODR_CD = null;
		m_l_ISSUE_QTY = null;
		m_l_ISSUE_DATE = null;
		m_l_SPENT_QTY = null;
		m_l_STOCK_UNIT = null;
		m_w_TOTAL_STOCK_ON_HAND_QTY = null;
		m_w_JOB_ODR_CD = null;
		m_VALUE = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_TYP = null;
		l_l_ERR_INFO = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_ISSUE_INST_CD = null;
		l_l_ERR_JOB_ODR_CD = null;
		l_l_ERR_ISSUE_WH_CD = null;
		l_l_ERR_STOCK_LOT_CD = null;
		l_l_ERR_ISSUE_QTY = null;
		l_l_ERR_ISSUE_DATE = null;
		l_l_ERR_ISSUE_CMPLT_FLG = null;
		l_l_ERR_RCV_WH_CD = null;
		l_l_ERR_VEND_LOT_NO = null;
		l_l_ERR_ITEM_CD = null;
		l_w_COLUMN_FLG = null;
		l_ISSUE_QTY = null;
		l_ISSUE_CMPLT_FLG = null;
		l_RCV_WH_CD = null;
		l_VEND_LOT_NO = null;
		l_ISSUE_DATE = null;
		l_tmp_RCV_ISSUE_QTY = null;
		l_THIS_TIME_ISSUE_POSS_QTY = null;
		l_ALC_NOISSUE_QTY = null;
		l_ODR_ISSUE_POSS_QTY = null;
		l_ITEM_STOCK_NON_ALC_QTY = null;
		l_L_JOB_ODR_CD = null;
		l_LA_ISSUE_QTY = null;
		l_ISSUE_INST_CD = null;
		l_OD_NO = null;
		l_ITEM_CD = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_CD = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_ISSUE_TYP = null;
		l_CONS_TYP = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_SHIP_REMAIN_QTY = null;
		l_COUNT = null;
		l_JOB_ODR_CD = null;
		l_WH_CD = null;
		l_MRP_FLG = null;
		l_LOT_CTRL_FLG = null;
		l_MRP_ODR_TYP = null;
		l_LOT_NO = null;
		l_BEST_BEFORE_DATE = null;
		l_PROC_EXEC_DATE = null;
		l_ISSUE_DATE_SUB = null;
		l_SYS_PARAMETER_VALUE = null;
		l_SYS_PARAMETER_NAME = null;
		l_INSTALL_FLG = null;
		l_THIS_MONTH = null;
		l_w_SHIP_REMAIN_QTY = null;
		l_SCDL_ISSUE_DATE = null;
		l_ISSUE_CMPLT_DATE = null;
		l_WS_CD = null;
		l_MODIFY_COUNT = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_UNIT_QTY_TYP = null;
		l_WH_NAME = null;
		l_WS_NAME = null;
		l_VEND_NAME = null;
		l_PROC_NAME = null;
		l_OPR_INST_CD_proc = null;
		l_OPR_INST_CD_item = null;
		l_w_ISSUE_INST_CD = null;
		l_w_WS_CD = null;
		l_w_VEND_CD = null;
		l_w_ISSUE_CMPLT_FLG = null;
		l_w_PLANT_CD = null;
		l_t_WORK_ODR_CD = null;
		l_t_WORK_IN_PROC_CD = null;
		l_w_PUCH_ODR_CD = null;
		l_w_LOT_CTRL_FLG = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_tmp_WH_CD = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_w_STOCK_LOT_CD = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP = null;
		l_ONEROUS_FLG = null;
		l_ONEROUS_CONS_NO = null;
		l_RCV_ISSUE_QTY = null;
		l_RETURNED_WH_CD = null;
		l_STOCK_LOT_CD = null;
		l_l_LOT_NO = null;
		l_l_PUCH_ODR_CD = null;
		l_l_WORK_ODR_CD = null;
		l_l_ISSUE_QTY = null;
		l_l_ISSUE_DATE = null;
		l_l_SPENT_QTY = null;
		l_l_STOCK_UNIT = null;
		l_w_TOTAL_STOCK_ON_HAND_QTY = null;
		l_w_JOB_ODR_CD = null;
		l_VALUE = null;

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
	 * medAF0130010クラスの標準コンストラクタ
	 */
	public AF0130010Struct()
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
	public void setStruct(AF0130010Struct struct)
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
	public void setStructM(AF0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setl_ERR_CTR_NM(struct.getl_ERR_CTR_NM());
			this.setl_ERR_ISSUE_INST_CD(struct.getl_ERR_ISSUE_INST_CD());
			this.setl_ERR_JOB_ODR_CD(struct.getl_ERR_JOB_ODR_CD());
			this.setl_ERR_ISSUE_WH_CD(struct.getl_ERR_ISSUE_WH_CD());
			this.setl_ERR_STOCK_LOT_CD(struct.getl_ERR_STOCK_LOT_CD());
			this.setl_ERR_ISSUE_QTY(struct.getl_ERR_ISSUE_QTY());
			this.setl_ERR_ISSUE_DATE(struct.getl_ERR_ISSUE_DATE());
			this.setl_ERR_ISSUE_CMPLT_FLG(struct.getl_ERR_ISSUE_CMPLT_FLG());
			this.setl_ERR_RCV_WH_CD(struct.getl_ERR_RCV_WH_CD());
			this.setl_ERR_VEND_LOT_NO(struct.getl_ERR_VEND_LOT_NO());
			this.setl_ERR_ITEM_CD(struct.getl_ERR_ITEM_CD());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setISSUE_QTY(struct.getISSUE_QTY());
			this.setISSUE_CMPLT_FLG(struct.getISSUE_CMPLT_FLG());
			this.setRCV_WH_CD(struct.getRCV_WH_CD());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setISSUE_DATE(struct.getISSUE_DATE());
			this.settmp_RCV_ISSUE_QTY(struct.gettmp_RCV_ISSUE_QTY());
			this.setTHIS_TIME_ISSUE_POSS_QTY(struct.getTHIS_TIME_ISSUE_POSS_QTY());
			this.setALC_NOISSUE_QTY(struct.getALC_NOISSUE_QTY());
			this.setODR_ISSUE_POSS_QTY(struct.getODR_ISSUE_POSS_QTY());
			this.setITEM_STOCK_NON_ALC_QTY(struct.getITEM_STOCK_NON_ALC_QTY());
			this.setL_JOB_ODR_CD(struct.getL_JOB_ODR_CD());
			this.setLA_ISSUE_QTY(struct.getLA_ISSUE_QTY());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setISSUE_INST_QTY(struct.getISSUE_INST_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setSHIP_REMAIN_QTY(struct.getSHIP_REMAIN_QTY());
			this.setCOUNT(struct.getCOUNT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setLOT_NO(struct.getLOT_NO());
			this.setBEST_BEFORE_DATE(struct.getBEST_BEFORE_DATE());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setISSUE_DATE_SUB(struct.getISSUE_DATE_SUB());
			this.setSYS_PARAMETER_VALUE(struct.getSYS_PARAMETER_VALUE());
			this.setSYS_PARAMETER_NAME(struct.getSYS_PARAMETER_NAME());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setw_SHIP_REMAIN_QTY(struct.getw_SHIP_REMAIN_QTY());
			this.setSCDL_ISSUE_DATE(struct.getSCDL_ISSUE_DATE());
			this.setISSUE_CMPLT_DATE(struct.getISSUE_CMPLT_DATE());
			this.setWS_CD(struct.getWS_CD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setWH_NAME(struct.getWH_NAME());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setOPR_INST_CD_proc(struct.getOPR_INST_CD_proc());
			this.setOPR_INST_CD_item(struct.getOPR_INST_CD_item());
			this.setw_ISSUE_INST_CD(struct.getw_ISSUE_INST_CD());
			this.setw_WS_CD(struct.getw_WS_CD());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setw_ISSUE_CMPLT_FLG(struct.getw_ISSUE_CMPLT_FLG());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.sett_WORK_ODR_CD(struct.gett_WORK_ODR_CD());
			this.sett_WORK_IN_PROC_CD(struct.gett_WORK_IN_PROC_CD());
			this.setw_PUCH_ODR_CD(struct.getw_PUCH_ODR_CD());
			this.setw_LOT_CTRL_FLG(struct.getw_LOT_CTRL_FLG());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.settmp_WH_CD(struct.gettmp_WH_CD());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setw_STOCK_LOT_CD(struct.getw_STOCK_LOT_CD());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRETURNED_WH_CD(struct.getRETURNED_WH_CD());
			this.setSTOCK_LOT_CD(struct.getSTOCK_LOT_CD());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.setl_ISSUE_QTY(struct.getl_ISSUE_QTY());
			this.setl_ISSUE_DATE(struct.getl_ISSUE_DATE());
			this.setl_SPENT_QTY(struct.getl_SPENT_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setw_TOTAL_STOCK_ON_HAND_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.setVALUE(struct.getVALUE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AF0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_l_ERR_CTR_NM(struct.getList_l_ERR_CTR_NM());
			this.setList_l_ERR_ISSUE_INST_CD(struct.getList_l_ERR_ISSUE_INST_CD());
			this.setList_l_ERR_JOB_ODR_CD(struct.getList_l_ERR_JOB_ODR_CD());
			this.setList_l_ERR_ISSUE_WH_CD(struct.getList_l_ERR_ISSUE_WH_CD());
			this.setList_l_ERR_STOCK_LOT_CD(struct.getList_l_ERR_STOCK_LOT_CD());
			this.setList_l_ERR_ISSUE_QTY(struct.getList_l_ERR_ISSUE_QTY());
			this.setList_l_ERR_ISSUE_DATE(struct.getList_l_ERR_ISSUE_DATE());
			this.setList_l_ERR_ISSUE_CMPLT_FLG(struct.getList_l_ERR_ISSUE_CMPLT_FLG());
			this.setList_l_ERR_RCV_WH_CD(struct.getList_l_ERR_RCV_WH_CD());
			this.setList_l_ERR_VEND_LOT_NO(struct.getList_l_ERR_VEND_LOT_NO());
			this.setList_l_ERR_ITEM_CD(struct.getList_l_ERR_ITEM_CD());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_ISSUE_QTY(struct.getList_ISSUE_QTY());
			this.setList_ISSUE_CMPLT_FLG(struct.getList_ISSUE_CMPLT_FLG());
			this.setList_RCV_WH_CD(struct.getList_RCV_WH_CD());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_ISSUE_DATE(struct.getList_ISSUE_DATE());
			this.setList_tmp_RCV_ISSUE_QTY(struct.getList_tmp_RCV_ISSUE_QTY());
			this.setList_THIS_TIME_ISSUE_POSS_QTY(struct.getList_THIS_TIME_ISSUE_POSS_QTY());
			this.setList_ALC_NOISSUE_QTY(struct.getList_ALC_NOISSUE_QTY());
			this.setList_ODR_ISSUE_POSS_QTY(struct.getList_ODR_ISSUE_POSS_QTY());
			this.setList_ITEM_STOCK_NON_ALC_QTY(struct.getList_ITEM_STOCK_NON_ALC_QTY());
			this.setList_L_JOB_ODR_CD(struct.getList_L_JOB_ODR_CD());
			this.setList_LA_ISSUE_QTY(struct.getList_LA_ISSUE_QTY());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_ISSUE_INST_QTY(struct.getList_ISSUE_INST_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_SHIP_REMAIN_QTY(struct.getList_SHIP_REMAIN_QTY());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_BEST_BEFORE_DATE(struct.getList_BEST_BEFORE_DATE());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_ISSUE_DATE_SUB(struct.getList_ISSUE_DATE_SUB());
			this.setList_SYS_PARAMETER_VALUE(struct.getList_SYS_PARAMETER_VALUE());
			this.setList_SYS_PARAMETER_NAME(struct.getList_SYS_PARAMETER_NAME());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_w_SHIP_REMAIN_QTY(struct.getList_w_SHIP_REMAIN_QTY());
			this.setList_SCDL_ISSUE_DATE(struct.getList_SCDL_ISSUE_DATE());
			this.setList_ISSUE_CMPLT_DATE(struct.getList_ISSUE_CMPLT_DATE());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_OPR_INST_CD_proc(struct.getList_OPR_INST_CD_proc());
			this.setList_OPR_INST_CD_item(struct.getList_OPR_INST_CD_item());
			this.setList_w_ISSUE_INST_CD(struct.getList_w_ISSUE_INST_CD());
			this.setList_w_WS_CD(struct.getList_w_WS_CD());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_w_ISSUE_CMPLT_FLG(struct.getList_w_ISSUE_CMPLT_FLG());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_t_WORK_ODR_CD(struct.getList_t_WORK_ODR_CD());
			this.setList_t_WORK_IN_PROC_CD(struct.getList_t_WORK_IN_PROC_CD());
			this.setList_w_PUCH_ODR_CD(struct.getList_w_PUCH_ODR_CD());
			this.setList_w_LOT_CTRL_FLG(struct.getList_w_LOT_CTRL_FLG());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_tmp_WH_CD(struct.getList_tmp_WH_CD());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_w_STOCK_LOT_CD(struct.getList_w_STOCK_LOT_CD());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RETURNED_WH_CD(struct.getList_RETURNED_WH_CD());
			this.setList_STOCK_LOT_CD(struct.getList_STOCK_LOT_CD());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_l_ISSUE_QTY(struct.getList_l_ISSUE_QTY());
			this.setList_l_ISSUE_DATE(struct.getList_l_ISSUE_DATE());
			this.setList_l_SPENT_QTY(struct.getList_l_SPENT_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_w_TOTAL_STOCK_ON_HAND_QTY(struct.getList_w_TOTAL_STOCK_ON_HAND_QTY());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_VALUE(struct.getList_VALUE());
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
	// 第 1 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// 第 5 変数初期値： i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// 第 6 変数初期値： i_l_ERR_CTR_NM


	final static String i_l_ERR_CTR_NM = null;

	// 第 7 変数初期値： i_l_ERR_ISSUE_INST_CD


	final static String i_l_ERR_ISSUE_INST_CD = null;

	// 第 8 変数初期値： i_l_ERR_JOB_ODR_CD


	final static String i_l_ERR_JOB_ODR_CD = null;

	// 第 9 変数初期値： i_l_ERR_ISSUE_WH_CD


	final static String i_l_ERR_ISSUE_WH_CD = null;

	// 第 10 変数初期値： i_l_ERR_STOCK_LOT_CD


	final static String i_l_ERR_STOCK_LOT_CD = null;

	// 第 11 変数初期値： i_l_ERR_ISSUE_QTY


	final static String i_l_ERR_ISSUE_QTY = null;

	// 第 12 変数初期値： i_l_ERR_ISSUE_DATE


	final static String i_l_ERR_ISSUE_DATE = null;

	// 第 13 変数初期値： i_l_ERR_ISSUE_CMPLT_FLG


	final static String i_l_ERR_ISSUE_CMPLT_FLG = null;

	// 第 14 変数初期値： i_l_ERR_RCV_WH_CD


	final static String i_l_ERR_RCV_WH_CD = null;

	// 第 15 変数初期値： i_l_ERR_VEND_LOT_NO


	final static String i_l_ERR_VEND_LOT_NO = null;

	// 第 16 変数初期値： i_l_ERR_ITEM_CD


	final static String i_l_ERR_ITEM_CD = null;

	// 第 17 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 18 変数初期値： i_ISSUE_QTY


	final static String i_ISSUE_QTY = null;

	// 第 19 変数初期値： i_ISSUE_CMPLT_FLG


	final static String i_ISSUE_CMPLT_FLG = null;

	// 第 20 変数初期値： i_RCV_WH_CD


	final static String i_RCV_WH_CD = null;

	// 第 21 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 22 変数初期値： i_ISSUE_DATE


	final static String i_ISSUE_DATE = null;

	// 第 23 変数初期値： i_tmp_RCV_ISSUE_QTY


	final static String i_tmp_RCV_ISSUE_QTY = null;

	// 第 24 変数初期値： i_THIS_TIME_ISSUE_POSS_QTY


	final static String i_THIS_TIME_ISSUE_POSS_QTY = null;

	// 第 25 変数初期値： i_ALC_NOISSUE_QTY


	final static String i_ALC_NOISSUE_QTY = null;

	// 第 26 変数初期値： i_ODR_ISSUE_POSS_QTY


	final static String i_ODR_ISSUE_POSS_QTY = null;

	// 第 27 変数初期値： i_ITEM_STOCK_NON_ALC_QTY


	final static String i_ITEM_STOCK_NON_ALC_QTY = null;

	// 第 28 変数初期値： i_L_JOB_ODR_CD


	final static String i_L_JOB_ODR_CD = null;

	// 第 29 変数初期値： i_LA_ISSUE_QTY


	final static String i_LA_ISSUE_QTY = null;

	// 第 30 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 31 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 32 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 33 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 34 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 35 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 36 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 37 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 38 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 39 変数初期値： i_ISSUE_TYP


	final static String i_ISSUE_TYP = null;

	// 第 40 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 41 変数初期値： i_ISSUE_INST_QTY


	final static String i_ISSUE_INST_QTY = null;

	// 第 42 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 43 変数初期値： i_SHIP_REMAIN_QTY


	final static String i_SHIP_REMAIN_QTY = null;

	// 第 44 変数初期値： i_COUNT


	final static String i_COUNT = null;

	// 第 45 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 46 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 47 変数初期値： i_MRP_FLG


	final static String i_MRP_FLG = null;

	// 第 48 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 49 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 50 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 51 変数初期値： i_BEST_BEFORE_DATE


	final static String i_BEST_BEFORE_DATE = null;

	// 第 52 変数初期値： i_PROC_EXEC_DATE


	final static String i_PROC_EXEC_DATE = null;

	// 第 53 変数初期値： i_ISSUE_DATE_SUB


	final static String i_ISSUE_DATE_SUB = null;

	// 第 54 変数初期値： i_SYS_PARAMETER_VALUE


	final static String i_SYS_PARAMETER_VALUE = null;

	// 第 55 変数初期値： i_SYS_PARAMETER_NAME


	final static String i_SYS_PARAMETER_NAME = null;

	// 第 56 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 57 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 58 変数初期値： i_w_SHIP_REMAIN_QTY


	final static String i_w_SHIP_REMAIN_QTY = null;

	// 第 59 変数初期値： i_SCDL_ISSUE_DATE


	final static String i_SCDL_ISSUE_DATE = null;

	// 第 60 変数初期値： i_ISSUE_CMPLT_DATE


	final static String i_ISSUE_CMPLT_DATE = null;

	// 第 61 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 62 変数初期値： i_MODIFY_COUNT


	final static Integer i_MODIFY_COUNT = null;

	// 第 63 変数初期値： i_JOB_ODR_DETAIL_NO


	final static Integer i_JOB_ODR_DETAIL_NO = null;

	// 第 64 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 65 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 66 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 67 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 68 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 69 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 70 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 71 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 72 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 73 変数初期値： i_OPR_INST_CD_proc


	final static String i_OPR_INST_CD_proc = null;

	// 第 74 変数初期値： i_OPR_INST_CD_item


	final static String i_OPR_INST_CD_item = null;

	// 第 75 変数初期値： i_w_ISSUE_INST_CD


	final static String i_w_ISSUE_INST_CD = null;

	// 第 76 変数初期値： i_w_WS_CD


	final static String i_w_WS_CD = null;

	// 第 77 変数初期値： i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// 第 78 変数初期値： i_w_ISSUE_CMPLT_FLG


	final static String i_w_ISSUE_CMPLT_FLG = null;

	// 第 79 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 80 変数初期値： i_t_WORK_ODR_CD


	final static String i_t_WORK_ODR_CD = null;

	// 第 81 変数初期値： i_t_WORK_IN_PROC_CD


	final static String i_t_WORK_IN_PROC_CD = null;

	// 第 82 変数初期値： i_w_PUCH_ODR_CD


	final static String i_w_PUCH_ODR_CD = null;

	// 第 83 変数初期値： i_w_LOT_CTRL_FLG


	final static String i_w_LOT_CTRL_FLG = null;

	// 第 84 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 85 変数初期値： i_RCV_ISSUE_TYP


	final static Integer i_RCV_ISSUE_TYP = null;

	// 第 86 変数初期値： i_tmp_WH_CD


	final static String i_tmp_WH_CD = null;

	// 第 87 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 88 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// 第 89 変数初期値： i_STOCK_UPD_TYP


	final static Integer i_STOCK_UPD_TYP = null;

	// 第 90 変数初期値： i_RCV_ISSUE_CMPLT_FLG


	final static Integer i_RCV_ISSUE_CMPLT_FLG = null;

	// 第 91 変数初期値： i_w_STOCK_LOT_CD


	final static String i_w_STOCK_LOT_CD = null;

	// 第 92 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 93 変数初期値： i_UNIT_COST_TYP


	final static Integer i_UNIT_COST_TYP = null;

	// 第 94 変数初期値： i_ONEROUS_FLG


	final static String i_ONEROUS_FLG = null;

	// 第 95 変数初期値： i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// 第 96 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 97 変数初期値： i_RETURNED_WH_CD


	final static String i_RETURNED_WH_CD = null;

	// 第 98 変数初期値： i_STOCK_LOT_CD


	final static String i_STOCK_LOT_CD = null;

	// 第 99 変数初期値： i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// 第 100 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 101 変数初期値： i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// 第 102 変数初期値： i_l_ISSUE_QTY


	final static String i_l_ISSUE_QTY = null;

	// 第 103 変数初期値： i_l_ISSUE_DATE


	final static String i_l_ISSUE_DATE = null;

	// 第 104 変数初期値： i_l_SPENT_QTY


	final static String i_l_SPENT_QTY = null;

	// 第 105 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 106 変数初期値： i_w_TOTAL_STOCK_ON_HAND_QTY


	final static String i_w_TOTAL_STOCK_ON_HAND_QTY = null;

	// 第 107 変数初期値： i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// 第 108 変数初期値： i_VALUE


	final static String i_VALUE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FileName

	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN

	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_TYP

	final static String i_l_ERR_TYP = null;

	// 第 5 変数初期値： i_l_ERR_INFO

	final static String i_l_ERR_INFO = null;

	// 第 6 変数初期値： i_l_ERR_CTR_NM

	final static String i_l_ERR_CTR_NM = null;

	// 第 7 変数初期値： i_l_ERR_ISSUE_INST_CD

	final static String i_l_ERR_ISSUE_INST_CD = null;

	// 第 8 変数初期値： i_l_ERR_JOB_FLG

	final static String i_l_ERR_JOB_FLG = null;

	// 第 9 変数初期値： i_l_ERR_JOB_ODR_CD

	final static String i_l_ERR_JOB_ODR_CD = null;

	// 第 10 変数初期値： i_l_ERR_ISSUE_WH_CD

	final static String i_l_ERR_ISSUE_WH_CD = null;

	// 第 11 変数初期値： i_l_ERR_STOCK_LOT_CD

	final static String i_l_ERR_STOCK_LOT_CD = null;

	// 第 12 変数初期値： i_l_ERR_ISSUE_QTY

	final static String i_l_ERR_ISSUE_QTY = null;

	// 第 13 変数初期値： i_l_ERR_ISSUE_DATE

	final static String i_l_ERR_ISSUE_DATE = null;

	// 第 14 変数初期値： i_l_ERR_ISSUE_CMPLT_FLG

	final static String i_l_ERR_ISSUE_CMPLT_FLG = null;

	// 第 15 変数初期値： i_l_ERR_RCV_WH_CD

	final static String i_l_ERR_RCV_WH_CD = null;

	// 第 16 変数初期値： i_l_ERR_VEND_LOT_NO

	final static String i_l_ERR_VEND_LOT_NO = null;

	// 第 17 変数初期値： i_w_COLUMN_FLG

	final static String i_w_COLUMN_FLG = null;

	// 第 18 変数初期値： i_JOB_FLG

	final static String i_JOB_FLG = null;

	// 第 19 変数初期値： i_ISSUE_QTY

	final static String i_ISSUE_QTY = null;

	// 第 20 変数初期値： i_ISSUE_CMPLT_FLG

	final static String i_ISSUE_CMPLT_FLG = null;

	// 第 21 変数初期値： i_RCV_WH_CD

	final static String i_RCV_WH_CD = null;

	// 第 22 変数初期値： i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// 第 23 変数初期値： i_ISSUE_DATE

	final static String i_ISSUE_DATE = null;

	// 第 24 変数初期値： i_tmp_RCV_ISSUE_QTY

	final static String i_tmp_RCV_ISSUE_QTY = null;

	// 第 25 変数初期値： i_THIS_TIME_ISSUE_POSS_QTY

	final static String i_THIS_TIME_ISSUE_POSS_QTY = null;

	// 第 26 変数初期値： i_ALC_NOISSUE_QTY

	final static String i_ALC_NOISSUE_QTY = null;

	// 第 27 変数初期値： i_ODR_ISSUE_POSS_QTY

	final static String i_ODR_ISSUE_POSS_QTY = null;

	// 第 28 変数初期値： i_ITEM_STOCK_NON_ALC_QTY

	final static String i_ITEM_STOCK_NON_ALC_QTY = null;

	// 第 29 変数初期値： i_ISSUE_INST_CD

	final static String i_ISSUE_INST_CD = null;

	// 第 30 変数初期値： i_OD_NO

	final static String i_OD_NO = null;

	// 第 31 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 33 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 34 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 35 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 36 変数初期値： i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// 第 37 変数初期値： i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// 第 38 変数初期値： i_ISSUE_TYP

	final static String i_ISSUE_TYP = null;

	// 第 39 変数初期値： i_CONS_TYP

	final static String i_CONS_TYP = null;

	// 第 40 変数初期値： i_ISSUE_INST_QTY

	final static String i_ISSUE_INST_QTY = null;

	// 第 41 変数初期値： i_TOTAL_ISSUE_QTY

	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 42 変数初期値： i_SHIP_REMAIN_QTY

	final static String i_SHIP_REMAIN_QTY = null;

	// 第 43 変数初期値： i_COUNT

	final static String i_COUNT = null;

	// 第 44 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 45 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 46 変数初期値： i_MRP_FLG

	final static String i_MRP_FLG = null;

	// 第 47 変数初期値： i_LOT_CTRL_FLG

	final static String i_LOT_CTRL_FLG = null;

	// 第 48 変数初期値： i_MRP_ODR_TYP

	final static String i_MRP_ODR_TYP = null;

	// 第 49 変数初期値： i_LOT_NO

	final static String i_LOT_NO = null;

	// 第 50 変数初期値： i_BEST_BEFORE_DATE

	final static String i_BEST_BEFORE_DATE = null;

	// 第 51 変数初期値： i_PROC_EXEC_DATE

	final static String i_PROC_EXEC_DATE = null;

	// 第 52 変数初期値： i_SYS_PARAMETER_VALUE

	final static String i_SYS_PARAMETER_VALUE = null;

	// 第 53 変数初期値： i_SYS_PARAMETER_NAME

	final static String i_SYS_PARAMETER_NAME = null;

	// 第 54 変数初期値： i_INSTALL_FLG

	final static String i_INSTALL_FLG = null;

	// 第 55 変数初期値： i_THIS_MONTH

	final static String i_THIS_MONTH = null;

	// 第 56 変数初期値： i_w_SHIP_REMAIN_QTY

	final static String i_w_SHIP_REMAIN_QTY = null;

	// 第 57 変数初期値： i_SCDL_ISSUE_DATE

	final static String i_SCDL_ISSUE_DATE = null;

	// 第 58 変数初期値： i_ISSUE_CMPLT_DATE

	final static String i_ISSUE_CMPLT_DATE = null;

	// 第 59 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 60 変数初期値： i_MODIFY_COUNT

	final static Integer i_MODIFY_COUNT = null;

	// 第 61 変数初期値： i_JOB_ODR_DETAIL_NO

	final static Integer i_JOB_ODR_DETAIL_NO = null;

	// 第 62 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 63 変数初期値： i_DRAW_CD

	final static String i_DRAW_CD = null;

	// 第 64 変数初期値： i_SPEC

	final static String i_SPEC = null;

	// 第 65 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 66 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 67 変数初期値： i_WH_NAME

	final static String i_WH_NAME = null;

	// 第 68 変数初期値： i_WS_NAME

	final static String i_WS_NAME = null;

	// 第 69 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 70 変数初期値： i_PROC_NAME

	final static String i_PROC_NAME = null;

	// 第 71 変数初期値： i_OPR_INST_CD_proc

	final static String i_OPR_INST_CD_proc = null;

	// 第 72 変数初期値： i_OPR_INST_CD_item

	final static String i_OPR_INST_CD_item = null;

	// 第 73 変数初期値： i_w_ISSUE_INST_CD

	final static String i_w_ISSUE_INST_CD = null;

	// 第 74 変数初期値： i_w_WS_CD

	final static String i_w_WS_CD = null;

	// 第 75 変数初期値： i_w_VEND_CD

	final static String i_w_VEND_CD = null;

	// 第 76 変数初期値： i_w_ISSUE_CMPLT_FLG

	final static String i_w_ISSUE_CMPLT_FLG = null;

	// 第 77 変数初期値： i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// 第 78 変数初期値： i_t_WORK_ODR_CD

	final static String i_t_WORK_ODR_CD = null;

	// 第 79 変数初期値： i_t_WORK_IN_PROC_CD

	final static String i_t_WORK_IN_PROC_CD = null;

	// 第 80 変数初期値： i_w_PUCH_ODR_CD

	final static String i_w_PUCH_ODR_CD = null;

	// 第 81 変数初期値： i_w_LOT_CTRL_FLG

	final static String i_w_LOT_CTRL_FLG = null;

	// 第 82 変数初期値： i_RCV_ISSUE_CTRL_CD

	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 83 変数初期値： i_RCV_ISSUE_TYP

	final static Integer i_RCV_ISSUE_TYP = null;

	// 第 84 変数初期値： i_tmp_WH_CD

	final static String i_tmp_WH_CD = null;

	// 第 85 変数初期値： i_RCV_ISSUE_DATE

	final static String i_RCV_ISSUE_DATE = null;

	// 第 86 変数初期値： i_RCV_ISSUE_GNR_TYP

	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// 第 87 変数初期値： i_STOCK_UPD_TYP

	final static Integer i_STOCK_UPD_TYP = null;

	// 第 88 変数初期値： i_RCV_ISSUE_CMPLT_FLG

	final static Integer i_RCV_ISSUE_CMPLT_FLG = null;

	// 第 89 変数初期値： i_w_STOCK_LOT_CD

	final static String i_w_STOCK_LOT_CD = null;

	// 第 90 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 91 変数初期値： i_UNIT_COST_TYP

	final static Integer i_UNIT_COST_TYP = null;

	// 第 92 変数初期値： i_ONEROUS_FLG

	final static String i_ONEROUS_FLG = null;

	// 第 93 変数初期値： i_ONEROUS_CONS_NO

	final static String i_ONEROUS_CONS_NO = null;

	// 第 94 変数初期値： i_w_JOB_ODR_CD

	final static String i_w_JOB_ODR_CD = null;

	// 第 95 変数初期値： i_RETURNED_WH_CD

	final static String i_RETURNED_WH_CD = null;

	// 第 96 変数初期値： i_l_LOT_NO

	final static String i_l_LOT_NO = null;

	// 第 97 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 98 変数初期値： i_l_WORK_ODR_CD

	final static String i_l_WORK_ODR_CD = null;

	// 第 99 変数初期値： i_l_ISSUE_QTY

	final static String i_l_ISSUE_QTY = null;

	// 第 100 変数初期値： i_l_ISSUE_DATE

	final static String i_l_ISSUE_DATE = null;

	// 第 101 変数初期値： i_l_SPENT_QTY

	final static String i_l_SPENT_QTY = null;

	// 第 102 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 103 変数初期値： i_RCV_ISSUE_QTY

	final static String i_RCV_ISSUE_QTY = null;

	// 第 104 変数初期値： i_w_TOTAL_STOCK_ON_HAND_QTY

	final static String i_w_TOTAL_STOCK_ON_HAND_QTY = null;

	// 第 105 変数初期値： i_VALUE

	final static String i_VALUE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_ERROR_IN = i_l_ERROR_IN;
		m_l_ERR_TYP = i_l_ERR_TYP;
		m_l_ERR_INFO = i_l_ERR_INFO;
		m_l_ERR_CTR_NM = i_l_ERR_CTR_NM;
		m_l_ERR_ISSUE_INST_CD = i_l_ERR_ISSUE_INST_CD;
		m_l_ERR_JOB_ODR_CD = i_l_ERR_JOB_ODR_CD;
		m_l_ERR_ISSUE_WH_CD = i_l_ERR_ISSUE_WH_CD;
		m_l_ERR_STOCK_LOT_CD = i_l_ERR_STOCK_LOT_CD;
		m_l_ERR_ISSUE_QTY = i_l_ERR_ISSUE_QTY;
		m_l_ERR_ISSUE_DATE = i_l_ERR_ISSUE_DATE;
		m_l_ERR_ISSUE_CMPLT_FLG = i_l_ERR_ISSUE_CMPLT_FLG;
		m_l_ERR_RCV_WH_CD = i_l_ERR_RCV_WH_CD;
		m_l_ERR_VEND_LOT_NO = i_l_ERR_VEND_LOT_NO;
		m_w_COLUMN_FLG = i_w_COLUMN_FLG;
		m_ISSUE_QTY = i_ISSUE_QTY;
		m_ISSUE_CMPLT_FLG = i_ISSUE_CMPLT_FLG;
		m_RCV_WH_CD = i_RCV_WH_CD;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_ISSUE_DATE = i_ISSUE_DATE;
		m_tmp_RCV_ISSUE_QTY = i_tmp_RCV_ISSUE_QTY;
		m_THIS_TIME_ISSUE_POSS_QTY = i_THIS_TIME_ISSUE_POSS_QTY;
		m_ALC_NOISSUE_QTY = i_ALC_NOISSUE_QTY;
		m_ODR_ISSUE_POSS_QTY = i_ODR_ISSUE_POSS_QTY;
		m_ITEM_STOCK_NON_ALC_QTY = i_ITEM_STOCK_NON_ALC_QTY;
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_OD_NO = i_OD_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_ISSUE_TYP = i_ISSUE_TYP;
		m_CONS_TYP = i_CONS_TYP;
		m_ISSUE_INST_QTY = i_ISSUE_INST_QTY;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_SHIP_REMAIN_QTY = i_SHIP_REMAIN_QTY;
		m_COUNT = i_COUNT;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_WH_CD = i_WH_CD;
		m_MRP_FLG = i_MRP_FLG;
		m_LOT_CTRL_FLG = i_LOT_CTRL_FLG;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_LOT_NO = i_LOT_NO;
		m_BEST_BEFORE_DATE = i_BEST_BEFORE_DATE;
		m_PROC_EXEC_DATE = i_PROC_EXEC_DATE;
		m_SYS_PARAMETER_VALUE = i_SYS_PARAMETER_VALUE;
		m_SYS_PARAMETER_NAME = i_SYS_PARAMETER_NAME;
		m_INSTALL_FLG = i_INSTALL_FLG;
		m_THIS_MONTH = i_THIS_MONTH;
		m_w_SHIP_REMAIN_QTY = i_w_SHIP_REMAIN_QTY;
		m_SCDL_ISSUE_DATE = i_SCDL_ISSUE_DATE;
		m_ISSUE_CMPLT_DATE = i_ISSUE_CMPLT_DATE;
		m_WS_CD = i_WS_CD;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_WH_NAME = i_WH_NAME;
		m_WS_NAME = i_WS_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_PROC_NAME = i_PROC_NAME;
		m_OPR_INST_CD_proc = i_OPR_INST_CD_proc;
		m_OPR_INST_CD_item = i_OPR_INST_CD_item;
		m_w_ISSUE_INST_CD = i_w_ISSUE_INST_CD;
		m_w_WS_CD = i_w_WS_CD;
		m_w_VEND_CD = i_w_VEND_CD;
		m_w_ISSUE_CMPLT_FLG = i_w_ISSUE_CMPLT_FLG;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_t_WORK_ODR_CD = i_t_WORK_ODR_CD;
		m_t_WORK_IN_PROC_CD = i_t_WORK_IN_PROC_CD;
		m_w_PUCH_ODR_CD = i_w_PUCH_ODR_CD;
		m_w_LOT_CTRL_FLG = i_w_LOT_CTRL_FLG;
		m_RCV_ISSUE_CTRL_CD = i_RCV_ISSUE_CTRL_CD;
		m_RCV_ISSUE_TYP = i_RCV_ISSUE_TYP;
		m_tmp_WH_CD = i_tmp_WH_CD;
		m_RCV_ISSUE_DATE = i_RCV_ISSUE_DATE;
		m_RCV_ISSUE_GNR_TYP = i_RCV_ISSUE_GNR_TYP;
		m_STOCK_UPD_TYP = i_STOCK_UPD_TYP;
		m_RCV_ISSUE_CMPLT_FLG = i_RCV_ISSUE_CMPLT_FLG;
		m_w_STOCK_LOT_CD = i_w_STOCK_LOT_CD;
		m_UNIT_COST = i_UNIT_COST;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_ONEROUS_FLG = i_ONEROUS_FLG;
		m_ONEROUS_CONS_NO = i_ONEROUS_CONS_NO;
		m_w_JOB_ODR_CD = i_w_JOB_ODR_CD;
		m_RETURNED_WH_CD = i_RETURNED_WH_CD;
		m_l_LOT_NO = i_l_LOT_NO;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_l_ISSUE_QTY = i_l_ISSUE_QTY;
		m_l_ISSUE_DATE = i_l_ISSUE_DATE;
		m_l_SPENT_QTY = i_l_SPENT_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_RCV_ISSUE_QTY = i_RCV_ISSUE_QTY;
		m_w_TOTAL_STOCK_ON_HAND_QTY = i_w_TOTAL_STOCK_ON_HAND_QTY;
		m_VALUE = i_VALUE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
