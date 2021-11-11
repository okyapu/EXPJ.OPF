/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0020/src/com/nec/jp/orteus/metamorBase/AJ0020/AJ0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0020;

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

public class AJ0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_JOB_ODR_TYP_DN */
	public String m_JOB_ODR_TYP_DN = null;
	/** 第 2 変数： m_DEVELOP_TYP */
	public String m_DEVELOP_TYP = null;
	/** 第 3 変数： m_DEVELOP_TYP_name */
	public String m_DEVELOP_TYP_name = null;
	/** 第 4 変数： m_DEVELOP_TYP_val */
	public String m_DEVELOP_TYP_val = null;
	/** 第 5 変数： m_DEVELOP_LEVEL */
	public String m_DEVELOP_LEVEL = null;
	/** 第 6 変数： m_l_LEVEL */
	public String m_l_LEVEL = null;
	/** 第 7 変数： m_l_ODR_STS_TYP_DN */
	public String m_l_ODR_STS_TYP_DN = null;
	/** 第 8 変数： m_l_DM_STS_TYP_DN */
	public String m_l_DM_STS_TYP_DN = null;
	/** 第 9 変数： m_l_OUTSIDE_TYP_DN */
	public String m_l_OUTSIDE_TYP_DN = null;
	/** 第 10 変数： m_l_MRP_ODR_TYP_DN */
	public String m_l_MRP_ODR_TYP_DN = null;
	/** 第 11 変数： m_l_OD_GNR_TYP_DN */
	public String m_l_OD_GNR_TYP_DN = null;
	/** 第 12 変数： m_l_PROGRESS_STATUS */
	public Integer m_l_PROGRESS_STATUS = null;
	/** 第 13 変数： m_l_PROGRESS_STATUS_DN */
	public String m_l_PROGRESS_STATUS_DN = null;
	/** 第 14 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 15 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 16 変数： m_l_ODR_START_DATE */
	public String m_l_ODR_START_DATE = null;
	/** 第 17 変数： m_l_PRD_START_DATE */
	public String m_l_PRD_START_DATE = null;
	/** 第 18 変数： m_l_PRD_DUE_DATE */
	public String m_l_PRD_DUE_DATE = null;
	/** 第 19 変数： m_l_DUE_DATE */
	public String m_l_DUE_DATE = null;
	/** 第 20 変数： m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** 第 21 変数： m_l_TOTAL_RCV_QTY */
	public String m_l_TOTAL_RCV_QTY = null;
	/** 第 22 変数： m_l_RCV_CMPLT_DATE */
	public String m_l_RCV_CMPLT_DATE = null;
	/** 第 23 変数： m_l_DM_QTY */
	public String m_l_DM_QTY = null;
	/** 第 24 変数： m_l_TOTAL_ISSUE_QTY */
	public String m_l_TOTAL_ISSUE_QTY = null;
	/** 第 25 変数： m_l_ISSUE_CMPLT_DATE */
	public String m_l_ISSUE_CMPLT_DATE = null;
	/** 第 26 変数： m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** 第 27 変数： m_l_OD_NO */
	public String m_l_OD_NO = null;
	/** 第 28 変数： m_l_OPR_RSLT_TYP */
	public Integer m_l_OPR_RSLT_TYP = null;
	/** 第 29 変数： m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** 第 30 変数： m_OD_GNR_TYP */
	public Integer m_OD_GNR_TYP = null;
	/** 第 31 変数： m_l_ODR_STS_TYP */
	public Integer m_l_ODR_STS_TYP = null;
	/** 第 32 変数： m_l_DM_STS_TYP */
	public Integer m_l_DM_STS_TYP = null;
	/** 第 33 変数： m_l_RLSD_PUCH_ODR_QTY */
	public String m_l_RLSD_PUCH_ODR_QTY = null;
	/** 第 34 変数： m_l_WORK_IN_PROC_QTY */
	public String m_l_WORK_IN_PROC_QTY = null;
	/** 第 35 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 36 変数： m_MRP_TYP */
	public Integer m_MRP_TYP = null;
	/** 第 37 変数： m_l_MRP_ODR_TYP */
	public Integer m_l_MRP_ODR_TYP = null;
	/** 第 38 変数： m_l_BUSINESS_OPR_DATE */
	public String m_l_BUSINESS_OPR_DATE = null;
	/** 第 39 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 40 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 41 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 42 変数： m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** 第 43 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 44 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 45 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 46 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 47 変数： m_ROOT_ITEM_CD */
	public String m_ROOT_ITEM_CD = null;
	/** 第 48 変数： m_JOB_ODR_TYP */
	public Integer m_JOB_ODR_TYP = null;
	/** 第 49 変数： m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** 第 50 変数： m_JOB_ODR_STS_TYP */
	public Integer m_JOB_ODR_STS_TYP = null;
	/** 第 51 変数： m_JOB_ODR_DEL_FLG */
	public Integer m_JOB_ODR_DEL_FLG = null;
	/** 第 52 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 53 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 54 変数： m_l_CONFIRM_DLV_DATE */
	public String m_l_CONFIRM_DLV_DATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_JOB_ODR_TYP_DN */
	public List l_JOB_ODR_TYP_DN = null;

	/** 第 2 List変数： l_DEVELOP_TYP */
	public List l_DEVELOP_TYP = null;

	/** 第 3 List変数： l_DEVELOP_TYP_name */
	public List l_DEVELOP_TYP_name = null;

	/** 第 4 List変数： l_DEVELOP_TYP_val */
	public List l_DEVELOP_TYP_val = null;

	/** 第 5 List変数： l_DEVELOP_LEVEL */
	public List l_DEVELOP_LEVEL = null;

	/** 第 6 List変数： l_l_LEVEL */
	public List l_l_LEVEL = null;

	/** 第 7 List変数： l_l_ODR_STS_TYP_DN */
	public List l_l_ODR_STS_TYP_DN = null;

	/** 第 8 List変数： l_l_DM_STS_TYP_DN */
	public List l_l_DM_STS_TYP_DN = null;

	/** 第 9 List変数： l_l_OUTSIDE_TYP_DN */
	public List l_l_OUTSIDE_TYP_DN = null;

	/** 第 10 List変数： l_l_MRP_ODR_TYP_DN */
	public List l_l_MRP_ODR_TYP_DN = null;

	/** 第 11 List変数： l_l_OD_GNR_TYP_DN */
	public List l_l_OD_GNR_TYP_DN = null;

	/** 第 12 List変数： l_l_PROGRESS_STATUS */
	public List l_l_PROGRESS_STATUS = null;

	/** 第 13 List変数： l_l_PROGRESS_STATUS_DN */
	public List l_l_PROGRESS_STATUS_DN = null;

	/** 第 14 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 15 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 16 List変数： l_l_ODR_START_DATE */
	public List l_l_ODR_START_DATE = null;

	/** 第 17 List変数： l_l_PRD_START_DATE */
	public List l_l_PRD_START_DATE = null;

	/** 第 18 List変数： l_l_PRD_DUE_DATE */
	public List l_l_PRD_DUE_DATE = null;

	/** 第 19 List変数： l_l_DUE_DATE */
	public List l_l_DUE_DATE = null;

	/** 第 20 List変数： l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** 第 21 List変数： l_l_TOTAL_RCV_QTY */
	public List l_l_TOTAL_RCV_QTY = null;

	/** 第 22 List変数： l_l_RCV_CMPLT_DATE */
	public List l_l_RCV_CMPLT_DATE = null;

	/** 第 23 List変数： l_l_DM_QTY */
	public List l_l_DM_QTY = null;

	/** 第 24 List変数： l_l_TOTAL_ISSUE_QTY */
	public List l_l_TOTAL_ISSUE_QTY = null;

	/** 第 25 List変数： l_l_ISSUE_CMPLT_DATE */
	public List l_l_ISSUE_CMPLT_DATE = null;

	/** 第 26 List変数： l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** 第 27 List変数： l_l_OD_NO */
	public List l_l_OD_NO = null;

	/** 第 28 List変数： l_l_OPR_RSLT_TYP */
	public List l_l_OPR_RSLT_TYP = null;

	/** 第 29 List変数： l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** 第 30 List変数： l_OD_GNR_TYP */
	public List l_OD_GNR_TYP = null;

	/** 第 31 List変数： l_l_ODR_STS_TYP */
	public List l_l_ODR_STS_TYP = null;

	/** 第 32 List変数： l_l_DM_STS_TYP */
	public List l_l_DM_STS_TYP = null;

	/** 第 33 List変数： l_l_RLSD_PUCH_ODR_QTY */
	public List l_l_RLSD_PUCH_ODR_QTY = null;

	/** 第 34 List変数： l_l_WORK_IN_PROC_QTY */
	public List l_l_WORK_IN_PROC_QTY = null;

	/** 第 35 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 36 List変数： l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** 第 37 List変数： l_l_MRP_ODR_TYP */
	public List l_l_MRP_ODR_TYP = null;

	/** 第 38 List変数： l_l_BUSINESS_OPR_DATE */
	public List l_l_BUSINESS_OPR_DATE = null;

	/** 第 39 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 40 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 41 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 42 List変数： l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** 第 43 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 44 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 45 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 46 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 47 List変数： l_ROOT_ITEM_CD */
	public List l_ROOT_ITEM_CD = null;

	/** 第 48 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 49 List変数： l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** 第 50 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 51 List変数： l_JOB_ODR_DEL_FLG */
	public List l_JOB_ODR_DEL_FLG = null;

	/** 第 52 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 53 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 54 List変数： l_l_CONFIRM_DLV_DATE */
	public List l_l_CONFIRM_DLV_DATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getJOB_ODR_TYP_DN() { return m_JOB_ODR_TYP_DN; }
	public String getDEVELOP_TYP() { return m_DEVELOP_TYP; }
	public String getDEVELOP_TYP_name() { return m_DEVELOP_TYP_name; }
	public String getDEVELOP_TYP_val() { return m_DEVELOP_TYP_val; }
	public String getDEVELOP_LEVEL() { return m_DEVELOP_LEVEL; }
	public String getl_LEVEL() { return m_l_LEVEL; }
	public String getl_ODR_STS_TYP_DN() { return m_l_ODR_STS_TYP_DN; }
	public String getl_DM_STS_TYP_DN() { return m_l_DM_STS_TYP_DN; }
	public String getl_OUTSIDE_TYP_DN() { return m_l_OUTSIDE_TYP_DN; }
	public String getl_MRP_ODR_TYP_DN() { return m_l_MRP_ODR_TYP_DN; }
	public String getl_OD_GNR_TYP_DN() { return m_l_OD_GNR_TYP_DN; }
	public Integer getl_PROGRESS_STATUS() { return m_l_PROGRESS_STATUS; }
	public String getl_PROGRESS_STATUS_DN() { return m_l_PROGRESS_STATUS_DN; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_ODR_START_DATE() { return m_l_ODR_START_DATE; }
	public String getl_PRD_START_DATE() { return m_l_PRD_START_DATE; }
	public String getl_PRD_DUE_DATE() { return m_l_PRD_DUE_DATE; }
	public String getl_DUE_DATE() { return m_l_DUE_DATE; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_TOTAL_RCV_QTY() { return m_l_TOTAL_RCV_QTY; }
	public String getl_RCV_CMPLT_DATE() { return m_l_RCV_CMPLT_DATE; }
	public String getl_DM_QTY() { return m_l_DM_QTY; }
	public String getl_TOTAL_ISSUE_QTY() { return m_l_TOTAL_ISSUE_QTY; }
	public String getl_ISSUE_CMPLT_DATE() { return m_l_ISSUE_CMPLT_DATE; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getl_OD_NO() { return m_l_OD_NO; }
	public Integer getl_OPR_RSLT_TYP() { return m_l_OPR_RSLT_TYP; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public Integer getOD_GNR_TYP() { return m_OD_GNR_TYP; }
	public Integer getl_ODR_STS_TYP() { return m_l_ODR_STS_TYP; }
	public Integer getl_DM_STS_TYP() { return m_l_DM_STS_TYP; }
	public String getl_RLSD_PUCH_ODR_QTY() { return m_l_RLSD_PUCH_ODR_QTY; }
	public String getl_WORK_IN_PROC_QTY() { return m_l_WORK_IN_PROC_QTY; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getMRP_TYP() { return m_MRP_TYP; }
	public Integer getl_MRP_ODR_TYP() { return m_l_MRP_ODR_TYP; }
	public String getl_BUSINESS_OPR_DATE() { return m_l_BUSINESS_OPR_DATE; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getROOT_ITEM_CD() { return m_ROOT_ITEM_CD; }
	public Integer getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public Integer getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public Integer getJOB_ODR_DEL_FLG() { return m_JOB_ODR_DEL_FLG; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getl_CONFIRM_DLV_DATE() { return m_l_CONFIRM_DLV_DATE; }

	public List getList_JOB_ODR_TYP_DN() { return l_JOB_ODR_TYP_DN; }
	public List getList_DEVELOP_TYP() { return l_DEVELOP_TYP; }
	public List getList_DEVELOP_TYP_name() { return l_DEVELOP_TYP_name; }
	public List getList_DEVELOP_TYP_val() { return l_DEVELOP_TYP_val; }
	public List getList_DEVELOP_LEVEL() { return l_DEVELOP_LEVEL; }
	public List getList_l_LEVEL() { return l_l_LEVEL; }
	public List getList_l_ODR_STS_TYP_DN() { return l_l_ODR_STS_TYP_DN; }
	public List getList_l_DM_STS_TYP_DN() { return l_l_DM_STS_TYP_DN; }
	public List getList_l_OUTSIDE_TYP_DN() { return l_l_OUTSIDE_TYP_DN; }
	public List getList_l_MRP_ODR_TYP_DN() { return l_l_MRP_ODR_TYP_DN; }
	public List getList_l_OD_GNR_TYP_DN() { return l_l_OD_GNR_TYP_DN; }
	public List getList_l_PROGRESS_STATUS() { return l_l_PROGRESS_STATUS; }
	public List getList_l_PROGRESS_STATUS_DN() { return l_l_PROGRESS_STATUS_DN; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_ODR_START_DATE() { return l_l_ODR_START_DATE; }
	public List getList_l_PRD_START_DATE() { return l_l_PRD_START_DATE; }
	public List getList_l_PRD_DUE_DATE() { return l_l_PRD_DUE_DATE; }
	public List getList_l_DUE_DATE() { return l_l_DUE_DATE; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_TOTAL_RCV_QTY() { return l_l_TOTAL_RCV_QTY; }
	public List getList_l_RCV_CMPLT_DATE() { return l_l_RCV_CMPLT_DATE; }
	public List getList_l_DM_QTY() { return l_l_DM_QTY; }
	public List getList_l_TOTAL_ISSUE_QTY() { return l_l_TOTAL_ISSUE_QTY; }
	public List getList_l_ISSUE_CMPLT_DATE() { return l_l_ISSUE_CMPLT_DATE; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_l_OD_NO() { return l_l_OD_NO; }
	public List getList_l_OPR_RSLT_TYP() { return l_l_OPR_RSLT_TYP; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_OD_GNR_TYP() { return l_OD_GNR_TYP; }
	public List getList_l_ODR_STS_TYP() { return l_l_ODR_STS_TYP; }
	public List getList_l_DM_STS_TYP() { return l_l_DM_STS_TYP; }
	public List getList_l_RLSD_PUCH_ODR_QTY() { return l_l_RLSD_PUCH_ODR_QTY; }
	public List getList_l_WORK_IN_PROC_QTY() { return l_l_WORK_IN_PROC_QTY; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_l_MRP_ODR_TYP() { return l_l_MRP_ODR_TYP; }
	public List getList_l_BUSINESS_OPR_DATE() { return l_l_BUSINESS_OPR_DATE; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_ROOT_ITEM_CD() { return l_ROOT_ITEM_CD; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_DEL_FLG() { return l_JOB_ODR_DEL_FLG; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_l_CONFIRM_DLV_DATE() { return l_l_CONFIRM_DLV_DATE; }

	public void setJOB_ODR_TYP_DN(String val) { m_JOB_ODR_TYP_DN = val; }
	public void setDEVELOP_TYP(String val) { m_DEVELOP_TYP = val; }
	public void setDEVELOP_TYP_name(String val) { m_DEVELOP_TYP_name = val; }
	public void setDEVELOP_TYP_val(String val) { m_DEVELOP_TYP_val = val; }
	public void setDEVELOP_LEVEL(String val) { m_DEVELOP_LEVEL = val; }
	public void setl_LEVEL(String val) { m_l_LEVEL = val; }
	public void setl_ODR_STS_TYP_DN(String val) { m_l_ODR_STS_TYP_DN = val; }
	public void setl_DM_STS_TYP_DN(String val) { m_l_DM_STS_TYP_DN = val; }
	public void setl_OUTSIDE_TYP_DN(String val) { m_l_OUTSIDE_TYP_DN = val; }
	public void setl_MRP_ODR_TYP_DN(String val) { m_l_MRP_ODR_TYP_DN = val; }
	public void setl_OD_GNR_TYP_DN(String val) { m_l_OD_GNR_TYP_DN = val; }
	public void setl_PROGRESS_STATUS(Integer val) { m_l_PROGRESS_STATUS = val; }
	public void setl_PROGRESS_STATUS_DN(String val) { m_l_PROGRESS_STATUS_DN = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_ODR_START_DATE(String val) { m_l_ODR_START_DATE = val; }
	public void setl_PRD_START_DATE(String val) { m_l_PRD_START_DATE = val; }
	public void setl_PRD_DUE_DATE(String val) { m_l_PRD_DUE_DATE = val; }
	public void setl_DUE_DATE(String val) { m_l_DUE_DATE = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_TOTAL_RCV_QTY(String val) { m_l_TOTAL_RCV_QTY = val; }
	public void setl_RCV_CMPLT_DATE(String val) { m_l_RCV_CMPLT_DATE = val; }
	public void setl_DM_QTY(String val) { m_l_DM_QTY = val; }
	public void setl_TOTAL_ISSUE_QTY(String val) { m_l_TOTAL_ISSUE_QTY = val; }
	public void setl_ISSUE_CMPLT_DATE(String val) { m_l_ISSUE_CMPLT_DATE = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setl_OD_NO(String val) { m_l_OD_NO = val; }
	public void setl_OPR_RSLT_TYP(Integer val) { m_l_OPR_RSLT_TYP = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setOD_GNR_TYP(Integer val) { m_OD_GNR_TYP = val; }
	public void setl_ODR_STS_TYP(Integer val) { m_l_ODR_STS_TYP = val; }
	public void setl_DM_STS_TYP(Integer val) { m_l_DM_STS_TYP = val; }
	public void setl_RLSD_PUCH_ODR_QTY(String val) { m_l_RLSD_PUCH_ODR_QTY = val; }
	public void setl_WORK_IN_PROC_QTY(String val) { m_l_WORK_IN_PROC_QTY = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setMRP_TYP(Integer val) { m_MRP_TYP = val; }
	public void setl_MRP_ODR_TYP(Integer val) { m_l_MRP_ODR_TYP = val; }
	public void setl_BUSINESS_OPR_DATE(String val) { m_l_BUSINESS_OPR_DATE = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setROOT_ITEM_CD(String val) { m_ROOT_ITEM_CD = val; }
	public void setJOB_ODR_TYP(Integer val) { m_JOB_ODR_TYP = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setJOB_ODR_STS_TYP(Integer val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_DEL_FLG(Integer val) { m_JOB_ODR_DEL_FLG = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setl_CONFIRM_DLV_DATE(String val) { m_l_CONFIRM_DLV_DATE = val; }

	public void setl_PROGRESS_STATUS(String val) { m_l_PROGRESS_STATUS = getInteger(val); }
	public void setl_OPR_RSLT_TYP(String val) { m_l_OPR_RSLT_TYP = getInteger(val); }
	public void setOD_GNR_TYP(String val) { m_OD_GNR_TYP = getInteger(val); }
	public void setl_ODR_STS_TYP(String val) { m_l_ODR_STS_TYP = getInteger(val); }
	public void setl_DM_STS_TYP(String val) { m_l_DM_STS_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setMRP_TYP(String val) { m_MRP_TYP = getInteger(val); }
	public void setl_MRP_ODR_TYP(String val) { m_l_MRP_ODR_TYP = getInteger(val); }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = getInteger(val); }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = getInteger(val); }
	public void setJOB_ODR_DEL_FLG(String val) { m_JOB_ODR_DEL_FLG = getInteger(val); }

	public void setList_JOB_ODR_TYP_DN(List list) { l_JOB_ODR_TYP_DN = list; }
	public void setList_DEVELOP_TYP(List list) { l_DEVELOP_TYP = list; }
	public void setList_DEVELOP_TYP_name(List list) { l_DEVELOP_TYP_name = list; }
	public void setList_DEVELOP_TYP_val(List list) { l_DEVELOP_TYP_val = list; }
	public void setList_DEVELOP_LEVEL(List list) { l_DEVELOP_LEVEL = list; }
	public void setList_l_LEVEL(List list) { l_l_LEVEL = list; }
	public void setList_l_ODR_STS_TYP_DN(List list) { l_l_ODR_STS_TYP_DN = list; }
	public void setList_l_DM_STS_TYP_DN(List list) { l_l_DM_STS_TYP_DN = list; }
	public void setList_l_OUTSIDE_TYP_DN(List list) { l_l_OUTSIDE_TYP_DN = list; }
	public void setList_l_MRP_ODR_TYP_DN(List list) { l_l_MRP_ODR_TYP_DN = list; }
	public void setList_l_OD_GNR_TYP_DN(List list) { l_l_OD_GNR_TYP_DN = list; }
	public void setList_l_PROGRESS_STATUS(List list) { l_l_PROGRESS_STATUS = list; }
	public void setList_l_PROGRESS_STATUS_DN(List list) { l_l_PROGRESS_STATUS_DN = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_ODR_START_DATE(List list) { l_l_ODR_START_DATE = list; }
	public void setList_l_PRD_START_DATE(List list) { l_l_PRD_START_DATE = list; }
	public void setList_l_PRD_DUE_DATE(List list) { l_l_PRD_DUE_DATE = list; }
	public void setList_l_DUE_DATE(List list) { l_l_DUE_DATE = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_TOTAL_RCV_QTY(List list) { l_l_TOTAL_RCV_QTY = list; }
	public void setList_l_RCV_CMPLT_DATE(List list) { l_l_RCV_CMPLT_DATE = list; }
	public void setList_l_DM_QTY(List list) { l_l_DM_QTY = list; }
	public void setList_l_TOTAL_ISSUE_QTY(List list) { l_l_TOTAL_ISSUE_QTY = list; }
	public void setList_l_ISSUE_CMPLT_DATE(List list) { l_l_ISSUE_CMPLT_DATE = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_l_OD_NO(List list) { l_l_OD_NO = list; }
	public void setList_l_OPR_RSLT_TYP(List list) { l_l_OPR_RSLT_TYP = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_OD_GNR_TYP(List list) { l_OD_GNR_TYP = list; }
	public void setList_l_ODR_STS_TYP(List list) { l_l_ODR_STS_TYP = list; }
	public void setList_l_DM_STS_TYP(List list) { l_l_DM_STS_TYP = list; }
	public void setList_l_RLSD_PUCH_ODR_QTY(List list) { l_l_RLSD_PUCH_ODR_QTY = list; }
	public void setList_l_WORK_IN_PROC_QTY(List list) { l_l_WORK_IN_PROC_QTY = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_l_MRP_ODR_TYP(List list) { l_l_MRP_ODR_TYP = list; }
	public void setList_l_BUSINESS_OPR_DATE(List list) { l_l_BUSINESS_OPR_DATE = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_ROOT_ITEM_CD(List list) { l_ROOT_ITEM_CD = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_DEL_FLG(List list) { l_JOB_ODR_DEL_FLG = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_l_CONFIRM_DLV_DATE(List list) { l_l_CONFIRM_DLV_DATE = list; }

	public int setL2L_JOB_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_DN == null) {
			l_JOB_ODR_TYP_DN = new ArrayList();
		} else {
			l_JOB_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_DN.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP == null) {
			l_DEVELOP_TYP = new ArrayList();
		} else {
			l_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP.add(((AJ0020010Struct) list.get(i)).getDEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_name == null) {
			l_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_name.add(((AJ0020010Struct) list.get(i)).getDEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_val == null) {
			l_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_val.add(((AJ0020010Struct) list.get(i)).getDEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_DEVELOP_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_LEVEL == null) {
			l_DEVELOP_LEVEL = new ArrayList();
		} else {
			l_DEVELOP_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_LEVEL.add(((AJ0020010Struct) list.get(i)).getDEVELOP_LEVEL());
		}
		return size;
	}
	public int setL2L_l_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LEVEL == null) {
			l_l_LEVEL = new ArrayList();
		} else {
			l_l_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LEVEL.add(((AJ0020010Struct) list.get(i)).getl_LEVEL());
		}
		return size;
	}
	public int setL2L_l_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_STS_TYP_DN == null) {
			l_l_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_l_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_STS_TYP_DN.add(((AJ0020010Struct) list.get(i)).getl_ODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_DM_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DM_STS_TYP_DN == null) {
			l_l_DM_STS_TYP_DN = new ArrayList();
		} else {
			l_l_DM_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DM_STS_TYP_DN.add(((AJ0020010Struct) list.get(i)).getl_DM_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OUTSIDE_TYP_DN == null) {
			l_l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OUTSIDE_TYP_DN.add(((AJ0020010Struct) list.get(i)).getl_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP_DN == null) {
			l_l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP_DN.add(((AJ0020010Struct) list.get(i)).getl_MRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_OD_GNR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OD_GNR_TYP_DN == null) {
			l_l_OD_GNR_TYP_DN = new ArrayList();
		} else {
			l_l_OD_GNR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OD_GNR_TYP_DN.add(((AJ0020010Struct) list.get(i)).getl_OD_GNR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_PROGRESS_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROGRESS_STATUS == null) {
			l_l_PROGRESS_STATUS = new ArrayList();
		} else {
			l_l_PROGRESS_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROGRESS_STATUS.add(((AJ0020010Struct) list.get(i)).getl_PROGRESS_STATUS());
		}
		return size;
	}
	public int setL2L_l_PROGRESS_STATUS_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROGRESS_STATUS_DN == null) {
			l_l_PROGRESS_STATUS_DN = new ArrayList();
		} else {
			l_l_PROGRESS_STATUS_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROGRESS_STATUS_DN.add(((AJ0020010Struct) list.get(i)).getl_PROGRESS_STATUS_DN());
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
			l_l_ITEM_CD.add(((AJ0020010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AJ0020010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_START_DATE == null) {
			l_l_ODR_START_DATE = new ArrayList();
		} else {
			l_l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_START_DATE.add(((AJ0020010Struct) list.get(i)).getl_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_l_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_START_DATE == null) {
			l_l_PRD_START_DATE = new ArrayList();
		} else {
			l_l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_START_DATE.add(((AJ0020010Struct) list.get(i)).getl_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE == null) {
			l_l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE.add(((AJ0020010Struct) list.get(i)).getl_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DUE_DATE == null) {
			l_l_DUE_DATE = new ArrayList();
		} else {
			l_l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DUE_DATE.add(((AJ0020010Struct) list.get(i)).getl_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_QTY == null) {
			l_l_ODR_QTY = new ArrayList();
		} else {
			l_l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_QTY.add(((AJ0020010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_RCV_QTY == null) {
			l_l_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_l_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_RCV_QTY.add(((AJ0020010Struct) list.get(i)).getl_TOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_l_RCV_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RCV_CMPLT_DATE == null) {
			l_l_RCV_CMPLT_DATE = new ArrayList();
		} else {
			l_l_RCV_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RCV_CMPLT_DATE.add(((AJ0020010Struct) list.get(i)).getl_RCV_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_l_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DM_QTY == null) {
			l_l_DM_QTY = new ArrayList();
		} else {
			l_l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DM_QTY.add(((AJ0020010Struct) list.get(i)).getl_DM_QTY());
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
			l_l_TOTAL_ISSUE_QTY.add(((AJ0020010Struct) list.get(i)).getl_TOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_l_ISSUE_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_CMPLT_DATE == null) {
			l_l_ISSUE_CMPLT_DATE = new ArrayList();
		} else {
			l_l_ISSUE_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_CMPLT_DATE.add(((AJ0020010Struct) list.get(i)).getl_ISSUE_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_l_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCD_QTY == null) {
			l_l_ALCD_QTY = new ArrayList();
		} else {
			l_l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCD_QTY.add(((AJ0020010Struct) list.get(i)).getl_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_l_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OD_NO == null) {
			l_l_OD_NO = new ArrayList();
		} else {
			l_l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OD_NO.add(((AJ0020010Struct) list.get(i)).getl_OD_NO());
		}
		return size;
	}
	public int setL2L_l_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_RSLT_TYP == null) {
			l_l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_RSLT_TYP.add(((AJ0020010Struct) list.get(i)).getl_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OD_NO == null) {
			l_PARENT_OD_NO = new ArrayList();
		} else {
			l_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OD_NO.add(((AJ0020010Struct) list.get(i)).getPARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_OD_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_GNR_TYP == null) {
			l_OD_GNR_TYP = new ArrayList();
		} else {
			l_OD_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_GNR_TYP.add(((AJ0020010Struct) list.get(i)).getOD_GNR_TYP());
		}
		return size;
	}
	public int setL2L_l_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_STS_TYP == null) {
			l_l_ODR_STS_TYP = new ArrayList();
		} else {
			l_l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_STS_TYP.add(((AJ0020010Struct) list.get(i)).getl_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DM_STS_TYP == null) {
			l_l_DM_STS_TYP = new ArrayList();
		} else {
			l_l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DM_STS_TYP.add(((AJ0020010Struct) list.get(i)).getl_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_RLSD_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RLSD_PUCH_ODR_QTY == null) {
			l_l_RLSD_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_l_RLSD_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RLSD_PUCH_ODR_QTY.add(((AJ0020010Struct) list.get(i)).getl_RLSD_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_WORK_IN_PROC_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_IN_PROC_QTY == null) {
			l_l_WORK_IN_PROC_QTY = new ArrayList();
		} else {
			l_l_WORK_IN_PROC_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_IN_PROC_QTY.add(((AJ0020010Struct) list.get(i)).getl_WORK_IN_PROC_QTY());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((AJ0020010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_MRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_TYP == null) {
			l_MRP_TYP = new ArrayList();
		} else {
			l_MRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_TYP.add(((AJ0020010Struct) list.get(i)).getMRP_TYP());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP == null) {
			l_l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP.add(((AJ0020010Struct) list.get(i)).getl_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_BUSINESS_OPR_DATE == null) {
			l_l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_BUSINESS_OPR_DATE.add(((AJ0020010Struct) list.get(i)).getl_BUSINESS_OPR_DATE());
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
			l_l_PLANT_CD.add(((AJ0020010Struct) list.get(i)).getl_PLANT_CD());
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
			l_l_STOCK_UNIT.add(((AJ0020010Struct) list.get(i)).getl_STOCK_UNIT());
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
			l_JOB_ODR_CD.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO == null) {
			l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_ITEM_CD.add(((AJ0020010Struct) list.get(i)).getITEM_CD());
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
			l_OD_NO.add(((AJ0020010Struct) list.get(i)).getOD_NO());
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
			l_PLANT_CD.add(((AJ0020010Struct) list.get(i)).getPLANT_CD());
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
			l_ROW_COUNT.add(((AJ0020010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_CD == null) {
			l_ROOT_ITEM_CD = new ArrayList();
		} else {
			l_ROOT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_CD.add(((AJ0020010Struct) list.get(i)).getROOT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP == null) {
			l_JOB_ODR_TYP = new ArrayList();
		} else {
			l_JOB_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD == null) {
			l_ALC_GRP_CD = new ArrayList();
		} else {
			l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD.add(((AJ0020010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP == null) {
			l_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DEL_FLG == null) {
			l_JOB_ODR_DEL_FLG = new ArrayList();
		} else {
			l_JOB_ODR_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DEL_FLG.add(((AJ0020010Struct) list.get(i)).getJOB_ODR_DEL_FLG());
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
			l_ITEM_NAME.add(((AJ0020010Struct) list.get(i)).getITEM_NAME());
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
			l_PLANT_NAME.add(((AJ0020010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_l_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CONFIRM_DLV_DATE == null) {
			l_l_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_l_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CONFIRM_DLV_DATE.add(((AJ0020010Struct) list.get(i)).getl_CONFIRM_DLV_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_JOB_ODR_TYP_DN = null;
		m_DEVELOP_TYP = null;
		m_DEVELOP_TYP_name = null;
		m_DEVELOP_TYP_val = null;
		m_DEVELOP_LEVEL = null;
		m_l_LEVEL = null;
		m_l_ODR_STS_TYP_DN = null;
		m_l_DM_STS_TYP_DN = null;
		m_l_OUTSIDE_TYP_DN = null;
		m_l_MRP_ODR_TYP_DN = null;
		m_l_OD_GNR_TYP_DN = null;
		m_l_PROGRESS_STATUS = null;
		m_l_PROGRESS_STATUS_DN = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_ODR_START_DATE = null;
		m_l_PRD_START_DATE = null;
		m_l_PRD_DUE_DATE = null;
		m_l_DUE_DATE = null;
		m_l_ODR_QTY = null;
		m_l_TOTAL_RCV_QTY = null;
		m_l_RCV_CMPLT_DATE = null;
		m_l_DM_QTY = null;
		m_l_TOTAL_ISSUE_QTY = null;
		m_l_ISSUE_CMPLT_DATE = null;
		m_l_ALCD_QTY = null;
		m_l_OD_NO = null;
		m_l_OPR_RSLT_TYP = null;
		m_PARENT_OD_NO = null;
		m_OD_GNR_TYP = null;
		m_l_ODR_STS_TYP = null;
		m_l_DM_STS_TYP = null;
		m_l_RLSD_PUCH_ODR_QTY = null;
		m_l_WORK_IN_PROC_QTY = null;
		m_OUTSIDE_TYP = null;
		m_MRP_TYP = null;
		m_l_MRP_ODR_TYP = null;
		m_l_BUSINESS_OPR_DATE = null;
		m_l_PLANT_CD = null;
		m_l_STOCK_UNIT = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_ITEM_CD = null;
		m_OD_NO = null;
		m_PLANT_CD = null;
		m_ROW_COUNT = null;
		m_ROOT_ITEM_CD = null;
		m_JOB_ODR_TYP = null;
		m_ALC_GRP_CD = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_DEL_FLG = null;
		m_ITEM_NAME = null;
		m_PLANT_NAME = null;
		m_l_CONFIRM_DLV_DATE = null;

		l_JOB_ODR_TYP_DN = null;
		l_DEVELOP_TYP = null;
		l_DEVELOP_TYP_name = null;
		l_DEVELOP_TYP_val = null;
		l_DEVELOP_LEVEL = null;
		l_l_LEVEL = null;
		l_l_ODR_STS_TYP_DN = null;
		l_l_DM_STS_TYP_DN = null;
		l_l_OUTSIDE_TYP_DN = null;
		l_l_MRP_ODR_TYP_DN = null;
		l_l_OD_GNR_TYP_DN = null;
		l_l_PROGRESS_STATUS = null;
		l_l_PROGRESS_STATUS_DN = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_ODR_START_DATE = null;
		l_l_PRD_START_DATE = null;
		l_l_PRD_DUE_DATE = null;
		l_l_DUE_DATE = null;
		l_l_ODR_QTY = null;
		l_l_TOTAL_RCV_QTY = null;
		l_l_RCV_CMPLT_DATE = null;
		l_l_DM_QTY = null;
		l_l_TOTAL_ISSUE_QTY = null;
		l_l_ISSUE_CMPLT_DATE = null;
		l_l_ALCD_QTY = null;
		l_l_OD_NO = null;
		l_l_OPR_RSLT_TYP = null;
		l_PARENT_OD_NO = null;
		l_OD_GNR_TYP = null;
		l_l_ODR_STS_TYP = null;
		l_l_DM_STS_TYP = null;
		l_l_RLSD_PUCH_ODR_QTY = null;
		l_l_WORK_IN_PROC_QTY = null;
		l_OUTSIDE_TYP = null;
		l_MRP_TYP = null;
		l_l_MRP_ODR_TYP = null;
		l_l_BUSINESS_OPR_DATE = null;
		l_l_PLANT_CD = null;
		l_l_STOCK_UNIT = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_ITEM_CD = null;
		l_OD_NO = null;
		l_PLANT_CD = null;
		l_ROW_COUNT = null;
		l_ROOT_ITEM_CD = null;
		l_JOB_ODR_TYP = null;
		l_ALC_GRP_CD = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_DEL_FLG = null;
		l_ITEM_NAME = null;
		l_PLANT_NAME = null;
		l_l_CONFIRM_DLV_DATE = null;

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
	 * medAJ0020010クラスの標準コンストラクタ
	 */
	public AJ0020010Struct()
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
	public void setStruct(AJ0020010Struct struct)
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
	public void setStructM(AJ0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setJOB_ODR_TYP_DN(struct.getJOB_ODR_TYP_DN());
			this.setDEVELOP_TYP(struct.getDEVELOP_TYP());
			this.setDEVELOP_TYP_name(struct.getDEVELOP_TYP_name());
			this.setDEVELOP_TYP_val(struct.getDEVELOP_TYP_val());
			this.setDEVELOP_LEVEL(struct.getDEVELOP_LEVEL());
			this.setl_LEVEL(struct.getl_LEVEL());
			this.setl_ODR_STS_TYP_DN(struct.getl_ODR_STS_TYP_DN());
			this.setl_DM_STS_TYP_DN(struct.getl_DM_STS_TYP_DN());
			this.setl_OUTSIDE_TYP_DN(struct.getl_OUTSIDE_TYP_DN());
			this.setl_MRP_ODR_TYP_DN(struct.getl_MRP_ODR_TYP_DN());
			this.setl_OD_GNR_TYP_DN(struct.getl_OD_GNR_TYP_DN());
			this.setl_PROGRESS_STATUS(struct.getl_PROGRESS_STATUS());
			this.setl_PROGRESS_STATUS_DN(struct.getl_PROGRESS_STATUS_DN());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_ODR_START_DATE(struct.getl_ODR_START_DATE());
			this.setl_PRD_START_DATE(struct.getl_PRD_START_DATE());
			this.setl_PRD_DUE_DATE(struct.getl_PRD_DUE_DATE());
			this.setl_DUE_DATE(struct.getl_DUE_DATE());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_TOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
			this.setl_RCV_CMPLT_DATE(struct.getl_RCV_CMPLT_DATE());
			this.setl_DM_QTY(struct.getl_DM_QTY());
			this.setl_TOTAL_ISSUE_QTY(struct.getl_TOTAL_ISSUE_QTY());
			this.setl_ISSUE_CMPLT_DATE(struct.getl_ISSUE_CMPLT_DATE());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setl_OD_NO(struct.getl_OD_NO());
			this.setl_OPR_RSLT_TYP(struct.getl_OPR_RSLT_TYP());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setOD_GNR_TYP(struct.getOD_GNR_TYP());
			this.setl_ODR_STS_TYP(struct.getl_ODR_STS_TYP());
			this.setl_DM_STS_TYP(struct.getl_DM_STS_TYP());
			this.setl_RLSD_PUCH_ODR_QTY(struct.getl_RLSD_PUCH_ODR_QTY());
			this.setl_WORK_IN_PROC_QTY(struct.getl_WORK_IN_PROC_QTY());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setl_MRP_ODR_TYP(struct.getl_MRP_ODR_TYP());
			this.setl_BUSINESS_OPR_DATE(struct.getl_BUSINESS_OPR_DATE());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setROOT_ITEM_CD(struct.getROOT_ITEM_CD());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_DEL_FLG(struct.getJOB_ODR_DEL_FLG());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setl_CONFIRM_DLV_DATE(struct.getl_CONFIRM_DLV_DATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AJ0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_JOB_ODR_TYP_DN(struct.getList_JOB_ODR_TYP_DN());
			this.setList_DEVELOP_TYP(struct.getList_DEVELOP_TYP());
			this.setList_DEVELOP_TYP_name(struct.getList_DEVELOP_TYP_name());
			this.setList_DEVELOP_TYP_val(struct.getList_DEVELOP_TYP_val());
			this.setList_DEVELOP_LEVEL(struct.getList_DEVELOP_LEVEL());
			this.setList_l_LEVEL(struct.getList_l_LEVEL());
			this.setList_l_ODR_STS_TYP_DN(struct.getList_l_ODR_STS_TYP_DN());
			this.setList_l_DM_STS_TYP_DN(struct.getList_l_DM_STS_TYP_DN());
			this.setList_l_OUTSIDE_TYP_DN(struct.getList_l_OUTSIDE_TYP_DN());
			this.setList_l_MRP_ODR_TYP_DN(struct.getList_l_MRP_ODR_TYP_DN());
			this.setList_l_OD_GNR_TYP_DN(struct.getList_l_OD_GNR_TYP_DN());
			this.setList_l_PROGRESS_STATUS(struct.getList_l_PROGRESS_STATUS());
			this.setList_l_PROGRESS_STATUS_DN(struct.getList_l_PROGRESS_STATUS_DN());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_ODR_START_DATE(struct.getList_l_ODR_START_DATE());
			this.setList_l_PRD_START_DATE(struct.getList_l_PRD_START_DATE());
			this.setList_l_PRD_DUE_DATE(struct.getList_l_PRD_DUE_DATE());
			this.setList_l_DUE_DATE(struct.getList_l_DUE_DATE());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_TOTAL_RCV_QTY(struct.getList_l_TOTAL_RCV_QTY());
			this.setList_l_RCV_CMPLT_DATE(struct.getList_l_RCV_CMPLT_DATE());
			this.setList_l_DM_QTY(struct.getList_l_DM_QTY());
			this.setList_l_TOTAL_ISSUE_QTY(struct.getList_l_TOTAL_ISSUE_QTY());
			this.setList_l_ISSUE_CMPLT_DATE(struct.getList_l_ISSUE_CMPLT_DATE());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_l_OD_NO(struct.getList_l_OD_NO());
			this.setList_l_OPR_RSLT_TYP(struct.getList_l_OPR_RSLT_TYP());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_OD_GNR_TYP(struct.getList_OD_GNR_TYP());
			this.setList_l_ODR_STS_TYP(struct.getList_l_ODR_STS_TYP());
			this.setList_l_DM_STS_TYP(struct.getList_l_DM_STS_TYP());
			this.setList_l_RLSD_PUCH_ODR_QTY(struct.getList_l_RLSD_PUCH_ODR_QTY());
			this.setList_l_WORK_IN_PROC_QTY(struct.getList_l_WORK_IN_PROC_QTY());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_l_MRP_ODR_TYP(struct.getList_l_MRP_ODR_TYP());
			this.setList_l_BUSINESS_OPR_DATE(struct.getList_l_BUSINESS_OPR_DATE());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_ROOT_ITEM_CD(struct.getList_ROOT_ITEM_CD());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_DEL_FLG(struct.getList_JOB_ODR_DEL_FLG());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_l_CONFIRM_DLV_DATE(struct.getList_l_CONFIRM_DLV_DATE());
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
	// 第 1 変数初期値： i_JOB_ODR_TYP_DN


	final static String i_JOB_ODR_TYP_DN = null;

	// 第 2 変数初期値： i_DEVELOP_TYP


	final static String i_DEVELOP_TYP = null;

	// 第 3 変数初期値： i_DEVELOP_TYP_name


	final static String i_DEVELOP_TYP_name = null;

	// 第 4 変数初期値： i_DEVELOP_TYP_val


	final static String i_DEVELOP_TYP_val = null;

	// 第 5 変数初期値： i_DEVELOP_LEVEL


	final static String i_DEVELOP_LEVEL = null;

	// 第 6 変数初期値： i_l_LEVEL


	final static String i_l_LEVEL = null;

	// 第 7 変数初期値： i_l_ODR_STS_TYP_DN


	final static String i_l_ODR_STS_TYP_DN = null;

	// 第 8 変数初期値： i_l_DM_STS_TYP_DN


	final static String i_l_DM_STS_TYP_DN = null;

	// 第 9 変数初期値： i_l_OUTSIDE_TYP_DN


	final static String i_l_OUTSIDE_TYP_DN = null;

	// 第 10 変数初期値： i_l_MRP_ODR_TYP_DN


	final static String i_l_MRP_ODR_TYP_DN = null;

	// 第 11 変数初期値： i_l_OD_GNR_TYP_DN


	final static String i_l_OD_GNR_TYP_DN = null;

	// 第 12 変数初期値： i_l_PROGRESS_STATUS


	final static Integer i_l_PROGRESS_STATUS = null;

	// 第 13 変数初期値： i_l_PROGRESS_STATUS_DN


	final static String i_l_PROGRESS_STATUS_DN = null;

	// 第 14 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 15 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 16 変数初期値： i_l_ODR_START_DATE


	final static String i_l_ODR_START_DATE = null;

	// 第 17 変数初期値： i_l_PRD_START_DATE


	final static String i_l_PRD_START_DATE = null;

	// 第 18 変数初期値： i_l_PRD_DUE_DATE


	final static String i_l_PRD_DUE_DATE = null;

	// 第 19 変数初期値： i_l_DUE_DATE


	final static String i_l_DUE_DATE = null;

	// 第 20 変数初期値： i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// 第 21 変数初期値： i_l_TOTAL_RCV_QTY


	final static String i_l_TOTAL_RCV_QTY = null;

	// 第 22 変数初期値： i_l_RCV_CMPLT_DATE


	final static String i_l_RCV_CMPLT_DATE = null;

	// 第 23 変数初期値： i_l_DM_QTY


	final static String i_l_DM_QTY = null;

	// 第 24 変数初期値： i_l_TOTAL_ISSUE_QTY


	final static String i_l_TOTAL_ISSUE_QTY = null;

	// 第 25 変数初期値： i_l_ISSUE_CMPLT_DATE


	final static String i_l_ISSUE_CMPLT_DATE = null;

	// 第 26 変数初期値： i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// 第 27 変数初期値： i_l_OD_NO


	final static String i_l_OD_NO = null;

	// 第 28 変数初期値： i_l_OPR_RSLT_TYP


	final static Integer i_l_OPR_RSLT_TYP = null;

	// 第 29 変数初期値： i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// 第 30 変数初期値： i_OD_GNR_TYP


	final static Integer i_OD_GNR_TYP = null;

	// 第 31 変数初期値： i_l_ODR_STS_TYP


	final static Integer i_l_ODR_STS_TYP = null;

	// 第 32 変数初期値： i_l_DM_STS_TYP


	final static Integer i_l_DM_STS_TYP = null;

	// 第 33 変数初期値： i_l_RLSD_PUCH_ODR_QTY


	final static String i_l_RLSD_PUCH_ODR_QTY = null;

	// 第 34 変数初期値： i_l_WORK_IN_PROC_QTY


	final static String i_l_WORK_IN_PROC_QTY = null;

	// 第 35 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 36 変数初期値： i_MRP_TYP


	final static Integer i_MRP_TYP = null;

	// 第 37 変数初期値： i_l_MRP_ODR_TYP


	final static Integer i_l_MRP_ODR_TYP = null;

	// 第 38 変数初期値： i_l_BUSINESS_OPR_DATE


	final static String i_l_BUSINESS_OPR_DATE = null;

	// 第 39 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 40 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 41 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 42 変数初期値： i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 43 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 44 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 45 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 46 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 47 変数初期値： i_ROOT_ITEM_CD


	final static String i_ROOT_ITEM_CD = null;

	// 第 48 変数初期値： i_JOB_ODR_TYP


	final static Integer i_JOB_ODR_TYP = null;

	// 第 49 変数初期値： i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// 第 50 変数初期値： i_JOB_ODR_STS_TYP


	final static Integer i_JOB_ODR_STS_TYP = null;

	// 第 51 変数初期値： i_JOB_ODR_DEL_FLG


	final static Integer i_JOB_ODR_DEL_FLG = null;

	// 第 52 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 53 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 54 変数初期値： i_l_CONFIRM_DLV_DATE


	final static String i_l_CONFIRM_DLV_DATE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_l_ITEM_CD
	final static String i_l_ITEM_CD = null;
	// 第 2 変数初期値： i_l_ITEM_NAME
	final static String i_l_ITEM_NAME = null;
	// 第 3 変数初期値： i_l_ODR_START_DATE
	final static String i_l_ODR_START_DATE = null;
	// 第 4 変数初期値： i_l_PRD_START_DATE
	final static String i_l_PRD_START_DATE = null;
	// 第 5 変数初期値： i_l_PRD_DUE_DATE
	final static String i_l_PRD_DUE_DATE = null;
	// 第 6 変数初期値： i_l_DUE_DATE
	final static String i_l_DUE_DATE = null;
	// 第 7 変数初期値： i_l_ODR_QTY
	final static String i_l_ODR_QTY = null;
	// 第 8 変数初期値： i_l_TOTAL_RCV_QTY
	final static String i_l_TOTAL_RCV_QTY = null;
	// 第 9 変数初期値： i_l_RCV_CMPLT_DATE
	final static String i_l_RCV_CMPLT_DATE = null;
	// 第 10 変数初期値： i_l_DM_QTY
	final static String i_l_DM_QTY = null;
	// 第 11 変数初期値： i_l_TOTAL_ISSUE_QTY
	final static String i_l_TOTAL_ISSUE_QTY = null;
	// 第 12 変数初期値： i_l_ISSUE_CMPLT_DATE
	final static String i_l_ISSUE_CMPLT_DATE = null;
	// 第 13 変数初期値： i_l_ALCD_QTY
	final static String i_l_ALCD_QTY = null;
	// 第 14 変数初期値： i_l_OD_NO
	final static String i_l_OD_NO = null;
	// 第 15 変数初期値： i_l_OPR_RSLT_TYP
	final static Integer i_l_OPR_RSLT_TYP = null;
	// 第 16 変数初期値： i_PARENT_OD_NO
	final static String i_PARENT_OD_NO = null;
	// 第 17 変数初期値： i_l_ODR_STS_TYP_DN
	final static String i_l_ODR_STS_TYP_DN = null;
	// 第 18 変数初期値： i_l_DM_STS_TYP_DN
	final static String i_l_DM_STS_TYP_DN = null;
	// 第 19 変数初期値： i_l_MRP_ODR_TYP_DN
	final static String i_l_MRP_ODR_TYP_DN = null;
	// 第 20 変数初期値： i_l_OD_GNR_TYP_DN
	final static String i_l_OD_GNR_TYP_DN = null;
	// 第 21 変数初期値： i_OD_GNR_TYP
	final static Integer i_OD_GNR_TYP = null;
	// 第 22 変数初期値： i_l_ODR_STS_TYP
	final static Integer i_l_ODR_STS_TYP = null;
	// 第 23 変数初期値： i_l_DM_STS_TYP
	final static Integer i_l_DM_STS_TYP = null;
	// 第 24 変数初期値： i_l_RLSD_PUCH_ODR_QTY
	final static String i_l_RLSD_PUCH_ODR_QTY = null;
	// 第 25 変数初期値： i_l_WORK_IN_PROC_QTY
	final static String i_l_WORK_IN_PROC_QTY = null;
	// 第 26 変数初期値： i_OUTSIDE_TYP
	final static Integer i_OUTSIDE_TYP = null;
	// 第 27 変数初期値： i_MRP_TYP
	final static Integer i_MRP_TYP = null;
	// 第 28 変数初期値： i_l_MRP_ODR_TYP
	final static Integer i_l_MRP_ODR_TYP = null;
	// 第 29 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 30 変数初期値： i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// 第 31 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 32 変数初期値： i_OD_NO
	final static String i_OD_NO = null;
	// 第 33 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 34 変数初期値： i_ROOT_ITEM_CD
	final static String i_ROOT_ITEM_CD = null;
	// 第 35 変数初期値： i_JOB_ODR_TYP
	final static Integer i_JOB_ODR_TYP = null;
	// 第 36 変数初期値： i_ALC_GRP_CD
	final static String i_ALC_GRP_CD = null;
	// 第 37 変数初期値： i_JOB_ODR_TYP_DN
	final static String i_JOB_ODR_TYP_DN = null;
	// 第 38 変数初期値： i_JOB_ODR_STS_TYP
	final static Integer i_JOB_ODR_STS_TYP = null;
	// 第 39 変数初期値： i_JOB_ODR_DEL_FLG
	final static Integer i_JOB_ODR_DEL_FLG = null;
	// 第 40 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 41 変数初期値： i_DEVELOP_TYP
	final static String i_DEVELOP_TYP = null;
	// 第 42 変数初期値： i_DEVELOP_TYP_name
	final static String i_DEVELOP_TYP_name = null;
	// 第 43 変数初期値： i_DEVELOP_TYP_val
	final static String i_DEVELOP_TYP_val = null;
	// 第 44 変数初期値： i_DEVELOP_LEVEL
	final static String i_DEVELOP_LEVEL = null;
	// 第 45 変数初期値： i_l_LEVEL
	final static String i_l_LEVEL = null;
	// 第 46 変数初期値： i_l_OUTSIDE_TYP_DN
	final static String i_l_OUTSIDE_TYP_DN = null;
	// 第 47 変数初期値： i_l_PROGRESS_STATUS
	final static Integer i_l_PROGRESS_STATUS = null;
	// 第 48 変数初期値： i_l_PROGRESS_STATUS_DN
	final static String i_l_PROGRESS_STATUS_DN = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_ODR_START_DATE = i_l_ODR_START_DATE;
		m_l_PRD_START_DATE = i_l_PRD_START_DATE;
		m_l_PRD_DUE_DATE = i_l_PRD_DUE_DATE;
		m_l_DUE_DATE = i_l_DUE_DATE;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_TOTAL_RCV_QTY = i_l_TOTAL_RCV_QTY;
		m_l_RCV_CMPLT_DATE = i_l_RCV_CMPLT_DATE;
		m_l_DM_QTY = i_l_DM_QTY;
		m_l_TOTAL_ISSUE_QTY = i_l_TOTAL_ISSUE_QTY;
		m_l_ISSUE_CMPLT_DATE = i_l_ISSUE_CMPLT_DATE;
		m_l_ALCD_QTY = i_l_ALCD_QTY;
		m_l_OD_NO = i_l_OD_NO;
		m_l_OPR_RSLT_TYP = i_l_OPR_RSLT_TYP;
		m_PARENT_OD_NO = i_PARENT_OD_NO;
		m_l_ODR_STS_TYP_DN = i_l_ODR_STS_TYP_DN;
		m_l_DM_STS_TYP_DN = i_l_DM_STS_TYP_DN;
		m_l_MRP_ODR_TYP_DN = i_l_MRP_ODR_TYP_DN;
		m_l_OD_GNR_TYP_DN = i_l_OD_GNR_TYP_DN;
		m_OD_GNR_TYP = i_OD_GNR_TYP;
		m_l_ODR_STS_TYP = i_l_ODR_STS_TYP;
		m_l_DM_STS_TYP = i_l_DM_STS_TYP;
		m_l_RLSD_PUCH_ODR_QTY = i_l_RLSD_PUCH_ODR_QTY;
		m_l_WORK_IN_PROC_QTY = i_l_WORK_IN_PROC_QTY;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_MRP_TYP = i_MRP_TYP;
		m_l_MRP_ODR_TYP = i_l_MRP_ODR_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_OD_NO = i_OD_NO;
		m_PLANT_CD = i_PLANT_CD;
		m_ROOT_ITEM_CD = i_ROOT_ITEM_CD;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_JOB_ODR_TYP_DN = i_JOB_ODR_TYP_DN;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_DEL_FLG = i_JOB_ODR_DEL_FLG;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DEVELOP_TYP = i_DEVELOP_TYP;
		m_DEVELOP_TYP_name = i_DEVELOP_TYP_name;
		m_DEVELOP_TYP_val = i_DEVELOP_TYP_val;
		m_DEVELOP_LEVEL = i_DEVELOP_LEVEL;
		m_l_LEVEL = i_l_LEVEL;
		m_l_OUTSIDE_TYP_DN = i_l_OUTSIDE_TYP_DN;
		m_l_PROGRESS_STATUS = i_l_PROGRESS_STATUS;
		m_l_PROGRESS_STATUS_DN = i_l_PROGRESS_STATUS_DN;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
