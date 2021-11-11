/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

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

public class AJ0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r1_MRP_ODR_TYP */
	public String m_r1_MRP_ODR_TYP = null;
	/** 第 2 変数： m_r2_MRP_ODR_TYP */
	public String m_r2_MRP_ODR_TYP = null;
	/** 第 3 変数： m_r3_MRP_ODR_TYP */
	public String m_r3_MRP_ODR_TYP = null;
	/** 第 4 変数： m_c1_PROGRESS_STS_TYP */
	public String m_c1_PROGRESS_STS_TYP = null;
	/** 第 5 変数： m_PRD_DUE_DATE_FROM */
	public String m_PRD_DUE_DATE_FROM = null;
	/** 第 6 変数： m_PRD_DUE_DATE_TO */
	public String m_PRD_DUE_DATE_TO = null;
	/** 第 7 変数： m_c2_PROGRESS_STS_TYP */
	public String m_c2_PROGRESS_STS_TYP = null;
	/** 第 8 変数： m_PRD_START_DATE_FROM */
	public String m_PRD_START_DATE_FROM = null;
	/** 第 9 変数： m_PRD_START_DATE_TO */
	public String m_PRD_START_DATE_TO = null;
	/** 第 10 変数： m_c1_ODR_STS_TYP */
	public String m_c1_ODR_STS_TYP = null;
	/** 第 11 変数： m_c2_ODR_STS_TYP */
	public String m_c2_ODR_STS_TYP = null;
	/** 第 12 変数： m_c3_ODR_STS_TYP */
	public String m_c3_ODR_STS_TYP = null;
	/** 第 13 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 14 変数： m_l_PROGRESS_STATUS_DN */
	public String m_l_PROGRESS_STATUS_DN = null;
	/** 第 15 変数： m_l_ODR_STS_TYP_DN */
	public String m_l_ODR_STS_TYP_DN = null;
	/** 第 16 変数： m_l_OUTSIDE_TYP_DN */
	public String m_l_OUTSIDE_TYP_DN = null;
	/** 第 17 変数： m_l_MRP_ODR_TYP_DN */
	public String m_l_MRP_ODR_TYP_DN = null;
	/** 第 18 変数： m_l_JOB_ODR_TYP_DN */
	public String m_l_JOB_ODR_TYP_DN = null;
	/** 第 19 変数： m_l_OD_GNR_TYP_DN */
	public String m_l_OD_GNR_TYP_DN = null;
	/** 第 20 変数： m_l_PROGRESS_STATUS */
	public Integer m_l_PROGRESS_STATUS = null;
	/** 第 21 変数： m_PRD_DUE_TIME_FROM */
	public String m_PRD_DUE_TIME_FROM = null;
	/** 第 22 変数： m_PRD_DUE_TIME_TO */
	public String m_PRD_DUE_TIME_TO = null;
	/** 第 23 変数： m_PRD_START_TIME_FROM */
	public String m_PRD_START_TIME_FROM = null;
	/** 第 24 変数： m_PRD_START_TIME_TO */
	public String m_PRD_START_TIME_TO = null;
	/** 第 25 変数： m_l_OD_NO */
	public String m_l_OD_NO = null;
	/** 第 26 変数： m_l_ODR_STS_TYP */
	public Integer m_l_ODR_STS_TYP = null;
	/** 第 27 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 28 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 29 変数： m_l_MRP_ODR_TYP */
	public Integer m_l_MRP_ODR_TYP = null;
	/** 第 30 変数： m_l_ODR_START_DATE */
	public String m_l_ODR_START_DATE = null;
	/** 第 31 変数： m_l_PRD_START_DATE */
	public String m_l_PRD_START_DATE = null;
	/** 第 32 変数： m_l_PRD_DUE_DATE */
	public String m_l_PRD_DUE_DATE = null;
	/** 第 33 変数： m_OD_GNR_TYP */
	public Integer m_OD_GNR_TYP = null;
	/** 第 34 変数： m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** 第 35 変数： m_l_TOTAL_RCV_QTY */
	public String m_l_TOTAL_RCV_QTY = null;
	/** 第 36 変数： m_l_RCV_CMPLT_DATE */
	public String m_l_RCV_CMPLT_DATE = null;
	/** 第 37 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 38 変数： m_l_JOB_ODR_CANCEL_NO */
	public String m_l_JOB_ODR_CANCEL_NO = null;
	/** 第 39 変数： m_JOB_ODR_TYP */
	public Integer m_JOB_ODR_TYP = null;
	/** 第 40 変数： m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** 第 41 変数： m_EXTERNAL_DM_FLG */
	public Integer m_EXTERNAL_DM_FLG = null;
	/** 第 42 変数： m_l_EXTERNAL_PLAN_CD */
	public String m_l_EXTERNAL_PLAN_CD = null;
	/** 第 43 変数： m_MRP_TYP */
	public Integer m_MRP_TYP = null;
	/** 第 44 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 45 変数： m_l_RLSD_PUCH_ODR_QTY */
	public String m_l_RLSD_PUCH_ODR_QTY = null;
	/** 第 46 変数： m_l_WORK_IN_PROC_QTY */
	public String m_l_WORK_IN_PROC_QTY = null;
	/** 第 47 変数： m_OD_TYP */
	public Integer m_OD_TYP = null;
	/** 第 48 変数： m_l_OPR_RSLT_TYP */
	public Integer m_l_OPR_RSLT_TYP = null;
	/** 第 49 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 50 変数： m_l_BUSINESS_OPR_DATE */
	public String m_l_BUSINESS_OPR_DATE = null;
	/** 第 51 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 52 変数： m_l_PRD_DUE_DATE_FROM */
	public String m_l_PRD_DUE_DATE_FROM = null;
	/** 第 53 変数： m_l_PRD_DUE_DATE_TO */
	public String m_l_PRD_DUE_DATE_TO = null;
	/** 第 54 変数： m_l_PRD_DUE_DATE_FROM_ZERO */
	public String m_l_PRD_DUE_DATE_FROM_ZERO = null;
	/** 第 55 変数： m_l_PRD_DUE_DATE_TO_ZERO */
	public String m_l_PRD_DUE_DATE_TO_ZERO = null;
	/** 第 56 変数： m_l_PRD_START_DATE_FROM */
	public String m_l_PRD_START_DATE_FROM = null;
	/** 第 57 変数： m_l_PRD_START_DATE_TO */
	public String m_l_PRD_START_DATE_TO = null;
	/** 第 58 変数： m_l_PRD_START_DATE_FROM_ZERO */
	public String m_l_PRD_START_DATE_FROM_ZERO = null;
	/** 第 59 変数： m_l_PRD_START_DATE_TO_ZERO */
	public String m_l_PRD_START_DATE_TO_ZERO = null;
	/** 第 60 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 61 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 62 変数： m_ODR_STS_TYP_1 */
	public String m_ODR_STS_TYP_1 = null;
	/** 第 63 変数： m_ODR_STS_TYP_2 */
	public String m_ODR_STS_TYP_2 = null;
	/** 第 64 変数： m_ODR_STS_TYP_9_DELAYED */
	public String m_ODR_STS_TYP_9_DELAYED = null;
	/** 第 65 変数： m_l_DELAY_BASE_DATE */
	public String m_l_DELAY_BASE_DATE = null;
	/** 第 66 変数： m_ODR_STS_TYP_9_NOT_DELAYED */
	public String m_ODR_STS_TYP_9_NOT_DELAYED = null;
	/** 第 67 変数： m_l_NOT_DELAY_BASE_DATE */
	public String m_l_NOT_DELAY_BASE_DATE = null;
	/** 第 68 変数： m_ODR_STS_TYP_9 */
	public String m_ODR_STS_TYP_9 = null;
	/** 第 69 変数： m_MRP_ODR_TYP_1 */
	public String m_MRP_ODR_TYP_1 = null;
	/** 第 70 変数： m_MRP_ODR_TYP_2 */
	public String m_MRP_ODR_TYP_2 = null;
	/** 第 71 変数： m_MRP_ODR_TYP_3 */
	public String m_MRP_ODR_TYP_3 = null;
	/** 第 72 変数： m_MRP_ODR_TYP_4 */
	public String m_MRP_ODR_TYP_4 = null;
	/** 第 73 変数： m_MRP_ODR_TYP_5 */
	public String m_MRP_ODR_TYP_5 = null;
	/** 第 74 変数： m_MRP_ODR_TYP_6 */
	public String m_MRP_ODR_TYP_6 = null;
	/** 第 75 変数： m_MRP_ODR_TYP_7 */
	public String m_MRP_ODR_TYP_7 = null;
	/** 第 76 変数： m_MRP_ODR_TYP_8 */
	public String m_MRP_ODR_TYP_8 = null;
	/** 第 77 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 78 変数： m_DELAY_TYP */
	public String m_DELAY_TYP = null;
	/** 第 79 変数： m_NOT_DELAY_TYP */
	public String m_NOT_DELAY_TYP = null;
	/** 第 80 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 81 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 82 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 83 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r1_MRP_ODR_TYP */
	public List l_r1_MRP_ODR_TYP = null;

	/** 第 2 List変数： l_r2_MRP_ODR_TYP */
	public List l_r2_MRP_ODR_TYP = null;

	/** 第 3 List変数： l_r3_MRP_ODR_TYP */
	public List l_r3_MRP_ODR_TYP = null;

	/** 第 4 List変数： l_c1_PROGRESS_STS_TYP */
	public List l_c1_PROGRESS_STS_TYP = null;

	/** 第 5 List変数： l_PRD_DUE_DATE_FROM */
	public List l_PRD_DUE_DATE_FROM = null;

	/** 第 6 List変数： l_PRD_DUE_DATE_TO */
	public List l_PRD_DUE_DATE_TO = null;

	/** 第 7 List変数： l_c2_PROGRESS_STS_TYP */
	public List l_c2_PROGRESS_STS_TYP = null;

	/** 第 8 List変数： l_PRD_START_DATE_FROM */
	public List l_PRD_START_DATE_FROM = null;

	/** 第 9 List変数： l_PRD_START_DATE_TO */
	public List l_PRD_START_DATE_TO = null;

	/** 第 10 List変数： l_c1_ODR_STS_TYP */
	public List l_c1_ODR_STS_TYP = null;

	/** 第 11 List変数： l_c2_ODR_STS_TYP */
	public List l_c2_ODR_STS_TYP = null;

	/** 第 12 List変数： l_c3_ODR_STS_TYP */
	public List l_c3_ODR_STS_TYP = null;

	/** 第 13 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 14 List変数： l_l_PROGRESS_STATUS_DN */
	public List l_l_PROGRESS_STATUS_DN = null;

	/** 第 15 List変数： l_l_ODR_STS_TYP_DN */
	public List l_l_ODR_STS_TYP_DN = null;

	/** 第 16 List変数： l_l_OUTSIDE_TYP_DN */
	public List l_l_OUTSIDE_TYP_DN = null;

	/** 第 17 List変数： l_l_MRP_ODR_TYP_DN */
	public List l_l_MRP_ODR_TYP_DN = null;

	/** 第 18 List変数： l_l_JOB_ODR_TYP_DN */
	public List l_l_JOB_ODR_TYP_DN = null;

	/** 第 19 List変数： l_l_OD_GNR_TYP_DN */
	public List l_l_OD_GNR_TYP_DN = null;

	/** 第 20 List変数： l_l_PROGRESS_STATUS */
	public List l_l_PROGRESS_STATUS = null;

	/** 第 21 List変数： l_PRD_DUE_TIME_FROM */
	public List l_PRD_DUE_TIME_FROM = null;

	/** 第 22 List変数： l_PRD_DUE_TIME_TO */
	public List l_PRD_DUE_TIME_TO = null;

	/** 第 23 List変数： l_PRD_START_TIME_FROM */
	public List l_PRD_START_TIME_FROM = null;

	/** 第 24 List変数： l_PRD_START_TIME_TO */
	public List l_PRD_START_TIME_TO = null;

	/** 第 25 List変数： l_l_OD_NO */
	public List l_l_OD_NO = null;

	/** 第 26 List変数： l_l_ODR_STS_TYP */
	public List l_l_ODR_STS_TYP = null;

	/** 第 27 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 28 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 29 List変数： l_l_MRP_ODR_TYP */
	public List l_l_MRP_ODR_TYP = null;

	/** 第 30 List変数： l_l_ODR_START_DATE */
	public List l_l_ODR_START_DATE = null;

	/** 第 31 List変数： l_l_PRD_START_DATE */
	public List l_l_PRD_START_DATE = null;

	/** 第 32 List変数： l_l_PRD_DUE_DATE */
	public List l_l_PRD_DUE_DATE = null;

	/** 第 33 List変数： l_OD_GNR_TYP */
	public List l_OD_GNR_TYP = null;

	/** 第 34 List変数： l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** 第 35 List変数： l_l_TOTAL_RCV_QTY */
	public List l_l_TOTAL_RCV_QTY = null;

	/** 第 36 List変数： l_l_RCV_CMPLT_DATE */
	public List l_l_RCV_CMPLT_DATE = null;

	/** 第 37 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 38 List変数： l_l_JOB_ODR_CANCEL_NO */
	public List l_l_JOB_ODR_CANCEL_NO = null;

	/** 第 39 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 40 List変数： l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** 第 41 List変数： l_EXTERNAL_DM_FLG */
	public List l_EXTERNAL_DM_FLG = null;

	/** 第 42 List変数： l_l_EXTERNAL_PLAN_CD */
	public List l_l_EXTERNAL_PLAN_CD = null;

	/** 第 43 List変数： l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** 第 44 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 45 List変数： l_l_RLSD_PUCH_ODR_QTY */
	public List l_l_RLSD_PUCH_ODR_QTY = null;

	/** 第 46 List変数： l_l_WORK_IN_PROC_QTY */
	public List l_l_WORK_IN_PROC_QTY = null;

	/** 第 47 List変数： l_OD_TYP */
	public List l_OD_TYP = null;

	/** 第 48 List変数： l_l_OPR_RSLT_TYP */
	public List l_l_OPR_RSLT_TYP = null;

	/** 第 49 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 50 List変数： l_l_BUSINESS_OPR_DATE */
	public List l_l_BUSINESS_OPR_DATE = null;

	/** 第 51 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 52 List変数： l_l_PRD_DUE_DATE_FROM */
	public List l_l_PRD_DUE_DATE_FROM = null;

	/** 第 53 List変数： l_l_PRD_DUE_DATE_TO */
	public List l_l_PRD_DUE_DATE_TO = null;

	/** 第 54 List変数： l_l_PRD_DUE_DATE_FROM_ZERO */
	public List l_l_PRD_DUE_DATE_FROM_ZERO = null;

	/** 第 55 List変数： l_l_PRD_DUE_DATE_TO_ZERO */
	public List l_l_PRD_DUE_DATE_TO_ZERO = null;

	/** 第 56 List変数： l_l_PRD_START_DATE_FROM */
	public List l_l_PRD_START_DATE_FROM = null;

	/** 第 57 List変数： l_l_PRD_START_DATE_TO */
	public List l_l_PRD_START_DATE_TO = null;

	/** 第 58 List変数： l_l_PRD_START_DATE_FROM_ZERO */
	public List l_l_PRD_START_DATE_FROM_ZERO = null;

	/** 第 59 List変数： l_l_PRD_START_DATE_TO_ZERO */
	public List l_l_PRD_START_DATE_TO_ZERO = null;

	/** 第 60 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 61 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 62 List変数： l_ODR_STS_TYP_1 */
	public List l_ODR_STS_TYP_1 = null;

	/** 第 63 List変数： l_ODR_STS_TYP_2 */
	public List l_ODR_STS_TYP_2 = null;

	/** 第 64 List変数： l_ODR_STS_TYP_9_DELAYED */
	public List l_ODR_STS_TYP_9_DELAYED = null;

	/** 第 65 List変数： l_l_DELAY_BASE_DATE */
	public List l_l_DELAY_BASE_DATE = null;

	/** 第 66 List変数： l_ODR_STS_TYP_9_NOT_DELAYED */
	public List l_ODR_STS_TYP_9_NOT_DELAYED = null;

	/** 第 67 List変数： l_l_NOT_DELAY_BASE_DATE */
	public List l_l_NOT_DELAY_BASE_DATE = null;

	/** 第 68 List変数： l_ODR_STS_TYP_9 */
	public List l_ODR_STS_TYP_9 = null;

	/** 第 69 List変数： l_MRP_ODR_TYP_1 */
	public List l_MRP_ODR_TYP_1 = null;

	/** 第 70 List変数： l_MRP_ODR_TYP_2 */
	public List l_MRP_ODR_TYP_2 = null;

	/** 第 71 List変数： l_MRP_ODR_TYP_3 */
	public List l_MRP_ODR_TYP_3 = null;

	/** 第 72 List変数： l_MRP_ODR_TYP_4 */
	public List l_MRP_ODR_TYP_4 = null;

	/** 第 73 List変数： l_MRP_ODR_TYP_5 */
	public List l_MRP_ODR_TYP_5 = null;

	/** 第 74 List変数： l_MRP_ODR_TYP_6 */
	public List l_MRP_ODR_TYP_6 = null;

	/** 第 75 List変数： l_MRP_ODR_TYP_7 */
	public List l_MRP_ODR_TYP_7 = null;

	/** 第 76 List変数： l_MRP_ODR_TYP_8 */
	public List l_MRP_ODR_TYP_8 = null;

	/** 第 77 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 78 List変数： l_DELAY_TYP */
	public List l_DELAY_TYP = null;

	/** 第 79 List変数： l_NOT_DELAY_TYP */
	public List l_NOT_DELAY_TYP = null;

	/** 第 80 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 81 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 82 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 83 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr1_MRP_ODR_TYP() { return m_r1_MRP_ODR_TYP; }
	public String getr2_MRP_ODR_TYP() { return m_r2_MRP_ODR_TYP; }
	public String getr3_MRP_ODR_TYP() { return m_r3_MRP_ODR_TYP; }
	public String getc1_PROGRESS_STS_TYP() { return m_c1_PROGRESS_STS_TYP; }
	public String getPRD_DUE_DATE_FROM() { return m_PRD_DUE_DATE_FROM; }
	public String getPRD_DUE_DATE_TO() { return m_PRD_DUE_DATE_TO; }
	public String getc2_PROGRESS_STS_TYP() { return m_c2_PROGRESS_STS_TYP; }
	public String getPRD_START_DATE_FROM() { return m_PRD_START_DATE_FROM; }
	public String getPRD_START_DATE_TO() { return m_PRD_START_DATE_TO; }
	public String getc1_ODR_STS_TYP() { return m_c1_ODR_STS_TYP; }
	public String getc2_ODR_STS_TYP() { return m_c2_ODR_STS_TYP; }
	public String getc3_ODR_STS_TYP() { return m_c3_ODR_STS_TYP; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_PROGRESS_STATUS_DN() { return m_l_PROGRESS_STATUS_DN; }
	public String getl_ODR_STS_TYP_DN() { return m_l_ODR_STS_TYP_DN; }
	public String getl_OUTSIDE_TYP_DN() { return m_l_OUTSIDE_TYP_DN; }
	public String getl_MRP_ODR_TYP_DN() { return m_l_MRP_ODR_TYP_DN; }
	public String getl_JOB_ODR_TYP_DN() { return m_l_JOB_ODR_TYP_DN; }
	public String getl_OD_GNR_TYP_DN() { return m_l_OD_GNR_TYP_DN; }
	public Integer getl_PROGRESS_STATUS() { return m_l_PROGRESS_STATUS; }
	public String getPRD_DUE_TIME_FROM() { return m_PRD_DUE_TIME_FROM; }
	public String getPRD_DUE_TIME_TO() { return m_PRD_DUE_TIME_TO; }
	public String getPRD_START_TIME_FROM() { return m_PRD_START_TIME_FROM; }
	public String getPRD_START_TIME_TO() { return m_PRD_START_TIME_TO; }
	public String getl_OD_NO() { return m_l_OD_NO; }
	public Integer getl_ODR_STS_TYP() { return m_l_ODR_STS_TYP; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public Integer getl_MRP_ODR_TYP() { return m_l_MRP_ODR_TYP; }
	public String getl_ODR_START_DATE() { return m_l_ODR_START_DATE; }
	public String getl_PRD_START_DATE() { return m_l_PRD_START_DATE; }
	public String getl_PRD_DUE_DATE() { return m_l_PRD_DUE_DATE; }
	public Integer getOD_GNR_TYP() { return m_OD_GNR_TYP; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_TOTAL_RCV_QTY() { return m_l_TOTAL_RCV_QTY; }
	public String getl_RCV_CMPLT_DATE() { return m_l_RCV_CMPLT_DATE; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_CANCEL_NO() { return m_l_JOB_ODR_CANCEL_NO; }
	public Integer getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public Integer getEXTERNAL_DM_FLG() { return m_EXTERNAL_DM_FLG; }
	public String getl_EXTERNAL_PLAN_CD() { return m_l_EXTERNAL_PLAN_CD; }
	public Integer getMRP_TYP() { return m_MRP_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getl_RLSD_PUCH_ODR_QTY() { return m_l_RLSD_PUCH_ODR_QTY; }
	public String getl_WORK_IN_PROC_QTY() { return m_l_WORK_IN_PROC_QTY; }
	public Integer getOD_TYP() { return m_OD_TYP; }
	public Integer getl_OPR_RSLT_TYP() { return m_l_OPR_RSLT_TYP; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_BUSINESS_OPR_DATE() { return m_l_BUSINESS_OPR_DATE; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_PRD_DUE_DATE_FROM() { return m_l_PRD_DUE_DATE_FROM; }
	public String getl_PRD_DUE_DATE_TO() { return m_l_PRD_DUE_DATE_TO; }
	public String getl_PRD_DUE_DATE_FROM_ZERO() { return m_l_PRD_DUE_DATE_FROM_ZERO; }
	public String getl_PRD_DUE_DATE_TO_ZERO() { return m_l_PRD_DUE_DATE_TO_ZERO; }
	public String getl_PRD_START_DATE_FROM() { return m_l_PRD_START_DATE_FROM; }
	public String getl_PRD_START_DATE_TO() { return m_l_PRD_START_DATE_TO; }
	public String getl_PRD_START_DATE_FROM_ZERO() { return m_l_PRD_START_DATE_FROM_ZERO; }
	public String getl_PRD_START_DATE_TO_ZERO() { return m_l_PRD_START_DATE_TO_ZERO; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getODR_STS_TYP_1() { return m_ODR_STS_TYP_1; }
	public String getODR_STS_TYP_2() { return m_ODR_STS_TYP_2; }
	public String getODR_STS_TYP_9_DELAYED() { return m_ODR_STS_TYP_9_DELAYED; }
	public String getl_DELAY_BASE_DATE() { return m_l_DELAY_BASE_DATE; }
	public String getODR_STS_TYP_9_NOT_DELAYED() { return m_ODR_STS_TYP_9_NOT_DELAYED; }
	public String getl_NOT_DELAY_BASE_DATE() { return m_l_NOT_DELAY_BASE_DATE; }
	public String getODR_STS_TYP_9() { return m_ODR_STS_TYP_9; }
	public String getMRP_ODR_TYP_1() { return m_MRP_ODR_TYP_1; }
	public String getMRP_ODR_TYP_2() { return m_MRP_ODR_TYP_2; }
	public String getMRP_ODR_TYP_3() { return m_MRP_ODR_TYP_3; }
	public String getMRP_ODR_TYP_4() { return m_MRP_ODR_TYP_4; }
	public String getMRP_ODR_TYP_5() { return m_MRP_ODR_TYP_5; }
	public String getMRP_ODR_TYP_6() { return m_MRP_ODR_TYP_6; }
	public String getMRP_ODR_TYP_7() { return m_MRP_ODR_TYP_7; }
	public String getMRP_ODR_TYP_8() { return m_MRP_ODR_TYP_8; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getDELAY_TYP() { return m_DELAY_TYP; }
	public String getNOT_DELAY_TYP() { return m_NOT_DELAY_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r1_MRP_ODR_TYP() { return l_r1_MRP_ODR_TYP; }
	public List getList_r2_MRP_ODR_TYP() { return l_r2_MRP_ODR_TYP; }
	public List getList_r3_MRP_ODR_TYP() { return l_r3_MRP_ODR_TYP; }
	public List getList_c1_PROGRESS_STS_TYP() { return l_c1_PROGRESS_STS_TYP; }
	public List getList_PRD_DUE_DATE_FROM() { return l_PRD_DUE_DATE_FROM; }
	public List getList_PRD_DUE_DATE_TO() { return l_PRD_DUE_DATE_TO; }
	public List getList_c2_PROGRESS_STS_TYP() { return l_c2_PROGRESS_STS_TYP; }
	public List getList_PRD_START_DATE_FROM() { return l_PRD_START_DATE_FROM; }
	public List getList_PRD_START_DATE_TO() { return l_PRD_START_DATE_TO; }
	public List getList_c1_ODR_STS_TYP() { return l_c1_ODR_STS_TYP; }
	public List getList_c2_ODR_STS_TYP() { return l_c2_ODR_STS_TYP; }
	public List getList_c3_ODR_STS_TYP() { return l_c3_ODR_STS_TYP; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_PROGRESS_STATUS_DN() { return l_l_PROGRESS_STATUS_DN; }
	public List getList_l_ODR_STS_TYP_DN() { return l_l_ODR_STS_TYP_DN; }
	public List getList_l_OUTSIDE_TYP_DN() { return l_l_OUTSIDE_TYP_DN; }
	public List getList_l_MRP_ODR_TYP_DN() { return l_l_MRP_ODR_TYP_DN; }
	public List getList_l_JOB_ODR_TYP_DN() { return l_l_JOB_ODR_TYP_DN; }
	public List getList_l_OD_GNR_TYP_DN() { return l_l_OD_GNR_TYP_DN; }
	public List getList_l_PROGRESS_STATUS() { return l_l_PROGRESS_STATUS; }
	public List getList_PRD_DUE_TIME_FROM() { return l_PRD_DUE_TIME_FROM; }
	public List getList_PRD_DUE_TIME_TO() { return l_PRD_DUE_TIME_TO; }
	public List getList_PRD_START_TIME_FROM() { return l_PRD_START_TIME_FROM; }
	public List getList_PRD_START_TIME_TO() { return l_PRD_START_TIME_TO; }
	public List getList_l_OD_NO() { return l_l_OD_NO; }
	public List getList_l_ODR_STS_TYP() { return l_l_ODR_STS_TYP; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_MRP_ODR_TYP() { return l_l_MRP_ODR_TYP; }
	public List getList_l_ODR_START_DATE() { return l_l_ODR_START_DATE; }
	public List getList_l_PRD_START_DATE() { return l_l_PRD_START_DATE; }
	public List getList_l_PRD_DUE_DATE() { return l_l_PRD_DUE_DATE; }
	public List getList_OD_GNR_TYP() { return l_OD_GNR_TYP; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_TOTAL_RCV_QTY() { return l_l_TOTAL_RCV_QTY; }
	public List getList_l_RCV_CMPLT_DATE() { return l_l_RCV_CMPLT_DATE; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_CANCEL_NO() { return l_l_JOB_ODR_CANCEL_NO; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_EXTERNAL_DM_FLG() { return l_EXTERNAL_DM_FLG; }
	public List getList_l_EXTERNAL_PLAN_CD() { return l_l_EXTERNAL_PLAN_CD; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_l_RLSD_PUCH_ODR_QTY() { return l_l_RLSD_PUCH_ODR_QTY; }
	public List getList_l_WORK_IN_PROC_QTY() { return l_l_WORK_IN_PROC_QTY; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_l_OPR_RSLT_TYP() { return l_l_OPR_RSLT_TYP; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_BUSINESS_OPR_DATE() { return l_l_BUSINESS_OPR_DATE; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_PRD_DUE_DATE_FROM() { return l_l_PRD_DUE_DATE_FROM; }
	public List getList_l_PRD_DUE_DATE_TO() { return l_l_PRD_DUE_DATE_TO; }
	public List getList_l_PRD_DUE_DATE_FROM_ZERO() { return l_l_PRD_DUE_DATE_FROM_ZERO; }
	public List getList_l_PRD_DUE_DATE_TO_ZERO() { return l_l_PRD_DUE_DATE_TO_ZERO; }
	public List getList_l_PRD_START_DATE_FROM() { return l_l_PRD_START_DATE_FROM; }
	public List getList_l_PRD_START_DATE_TO() { return l_l_PRD_START_DATE_TO; }
	public List getList_l_PRD_START_DATE_FROM_ZERO() { return l_l_PRD_START_DATE_FROM_ZERO; }
	public List getList_l_PRD_START_DATE_TO_ZERO() { return l_l_PRD_START_DATE_TO_ZERO; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ODR_STS_TYP_1() { return l_ODR_STS_TYP_1; }
	public List getList_ODR_STS_TYP_2() { return l_ODR_STS_TYP_2; }
	public List getList_ODR_STS_TYP_9_DELAYED() { return l_ODR_STS_TYP_9_DELAYED; }
	public List getList_l_DELAY_BASE_DATE() { return l_l_DELAY_BASE_DATE; }
	public List getList_ODR_STS_TYP_9_NOT_DELAYED() { return l_ODR_STS_TYP_9_NOT_DELAYED; }
	public List getList_l_NOT_DELAY_BASE_DATE() { return l_l_NOT_DELAY_BASE_DATE; }
	public List getList_ODR_STS_TYP_9() { return l_ODR_STS_TYP_9; }
	public List getList_MRP_ODR_TYP_1() { return l_MRP_ODR_TYP_1; }
	public List getList_MRP_ODR_TYP_2() { return l_MRP_ODR_TYP_2; }
	public List getList_MRP_ODR_TYP_3() { return l_MRP_ODR_TYP_3; }
	public List getList_MRP_ODR_TYP_4() { return l_MRP_ODR_TYP_4; }
	public List getList_MRP_ODR_TYP_5() { return l_MRP_ODR_TYP_5; }
	public List getList_MRP_ODR_TYP_6() { return l_MRP_ODR_TYP_6; }
	public List getList_MRP_ODR_TYP_7() { return l_MRP_ODR_TYP_7; }
	public List getList_MRP_ODR_TYP_8() { return l_MRP_ODR_TYP_8; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_DELAY_TYP() { return l_DELAY_TYP; }
	public List getList_NOT_DELAY_TYP() { return l_NOT_DELAY_TYP; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr1_MRP_ODR_TYP(String val) { m_r1_MRP_ODR_TYP = val; }
	public void setr2_MRP_ODR_TYP(String val) { m_r2_MRP_ODR_TYP = val; }
	public void setr3_MRP_ODR_TYP(String val) { m_r3_MRP_ODR_TYP = val; }
	public void setc1_PROGRESS_STS_TYP(String val) { m_c1_PROGRESS_STS_TYP = val; }
	public void setPRD_DUE_DATE_FROM(String val) { m_PRD_DUE_DATE_FROM = val; }
	public void setPRD_DUE_DATE_TO(String val) { m_PRD_DUE_DATE_TO = val; }
	public void setc2_PROGRESS_STS_TYP(String val) { m_c2_PROGRESS_STS_TYP = val; }
	public void setPRD_START_DATE_FROM(String val) { m_PRD_START_DATE_FROM = val; }
	public void setPRD_START_DATE_TO(String val) { m_PRD_START_DATE_TO = val; }
	public void setc1_ODR_STS_TYP(String val) { m_c1_ODR_STS_TYP = val; }
	public void setc2_ODR_STS_TYP(String val) { m_c2_ODR_STS_TYP = val; }
	public void setc3_ODR_STS_TYP(String val) { m_c3_ODR_STS_TYP = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_PROGRESS_STATUS_DN(String val) { m_l_PROGRESS_STATUS_DN = val; }
	public void setl_ODR_STS_TYP_DN(String val) { m_l_ODR_STS_TYP_DN = val; }
	public void setl_OUTSIDE_TYP_DN(String val) { m_l_OUTSIDE_TYP_DN = val; }
	public void setl_MRP_ODR_TYP_DN(String val) { m_l_MRP_ODR_TYP_DN = val; }
	public void setl_JOB_ODR_TYP_DN(String val) { m_l_JOB_ODR_TYP_DN = val; }
	public void setl_OD_GNR_TYP_DN(String val) { m_l_OD_GNR_TYP_DN = val; }
	public void setl_PROGRESS_STATUS(Integer val) { m_l_PROGRESS_STATUS = val; }
	public void setPRD_DUE_TIME_FROM(String val) { m_PRD_DUE_TIME_FROM = val; }
	public void setPRD_DUE_TIME_TO(String val) { m_PRD_DUE_TIME_TO = val; }
	public void setPRD_START_TIME_FROM(String val) { m_PRD_START_TIME_FROM = val; }
	public void setPRD_START_TIME_TO(String val) { m_PRD_START_TIME_TO = val; }
	public void setl_OD_NO(String val) { m_l_OD_NO = val; }
	public void setl_ODR_STS_TYP(Integer val) { m_l_ODR_STS_TYP = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_MRP_ODR_TYP(Integer val) { m_l_MRP_ODR_TYP = val; }
	public void setl_ODR_START_DATE(String val) { m_l_ODR_START_DATE = val; }
	public void setl_PRD_START_DATE(String val) { m_l_PRD_START_DATE = val; }
	public void setl_PRD_DUE_DATE(String val) { m_l_PRD_DUE_DATE = val; }
	public void setOD_GNR_TYP(Integer val) { m_OD_GNR_TYP = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_TOTAL_RCV_QTY(String val) { m_l_TOTAL_RCV_QTY = val; }
	public void setl_RCV_CMPLT_DATE(String val) { m_l_RCV_CMPLT_DATE = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_CANCEL_NO(String val) { m_l_JOB_ODR_CANCEL_NO = val; }
	public void setJOB_ODR_TYP(Integer val) { m_JOB_ODR_TYP = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setEXTERNAL_DM_FLG(Integer val) { m_EXTERNAL_DM_FLG = val; }
	public void setl_EXTERNAL_PLAN_CD(String val) { m_l_EXTERNAL_PLAN_CD = val; }
	public void setMRP_TYP(Integer val) { m_MRP_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setl_RLSD_PUCH_ODR_QTY(String val) { m_l_RLSD_PUCH_ODR_QTY = val; }
	public void setl_WORK_IN_PROC_QTY(String val) { m_l_WORK_IN_PROC_QTY = val; }
	public void setOD_TYP(Integer val) { m_OD_TYP = val; }
	public void setl_OPR_RSLT_TYP(Integer val) { m_l_OPR_RSLT_TYP = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_BUSINESS_OPR_DATE(String val) { m_l_BUSINESS_OPR_DATE = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_PRD_DUE_DATE_FROM(String val) { m_l_PRD_DUE_DATE_FROM = val; }
	public void setl_PRD_DUE_DATE_TO(String val) { m_l_PRD_DUE_DATE_TO = val; }
	public void setl_PRD_DUE_DATE_FROM_ZERO(String val) { m_l_PRD_DUE_DATE_FROM_ZERO = val; }
	public void setl_PRD_DUE_DATE_TO_ZERO(String val) { m_l_PRD_DUE_DATE_TO_ZERO = val; }
	public void setl_PRD_START_DATE_FROM(String val) { m_l_PRD_START_DATE_FROM = val; }
	public void setl_PRD_START_DATE_TO(String val) { m_l_PRD_START_DATE_TO = val; }
	public void setl_PRD_START_DATE_FROM_ZERO(String val) { m_l_PRD_START_DATE_FROM_ZERO = val; }
	public void setl_PRD_START_DATE_TO_ZERO(String val) { m_l_PRD_START_DATE_TO_ZERO = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setODR_STS_TYP_1(String val) { m_ODR_STS_TYP_1 = val; }
	public void setODR_STS_TYP_2(String val) { m_ODR_STS_TYP_2 = val; }
	public void setODR_STS_TYP_9_DELAYED(String val) { m_ODR_STS_TYP_9_DELAYED = val; }
	public void setl_DELAY_BASE_DATE(String val) { m_l_DELAY_BASE_DATE = val; }
	public void setODR_STS_TYP_9_NOT_DELAYED(String val) { m_ODR_STS_TYP_9_NOT_DELAYED = val; }
	public void setl_NOT_DELAY_BASE_DATE(String val) { m_l_NOT_DELAY_BASE_DATE = val; }
	public void setODR_STS_TYP_9(String val) { m_ODR_STS_TYP_9 = val; }
	public void setMRP_ODR_TYP_1(String val) { m_MRP_ODR_TYP_1 = val; }
	public void setMRP_ODR_TYP_2(String val) { m_MRP_ODR_TYP_2 = val; }
	public void setMRP_ODR_TYP_3(String val) { m_MRP_ODR_TYP_3 = val; }
	public void setMRP_ODR_TYP_4(String val) { m_MRP_ODR_TYP_4 = val; }
	public void setMRP_ODR_TYP_5(String val) { m_MRP_ODR_TYP_5 = val; }
	public void setMRP_ODR_TYP_6(String val) { m_MRP_ODR_TYP_6 = val; }
	public void setMRP_ODR_TYP_7(String val) { m_MRP_ODR_TYP_7 = val; }
	public void setMRP_ODR_TYP_8(String val) { m_MRP_ODR_TYP_8 = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setDELAY_TYP(String val) { m_DELAY_TYP = val; }
	public void setNOT_DELAY_TYP(String val) { m_NOT_DELAY_TYP = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void setl_PROGRESS_STATUS(String val) { m_l_PROGRESS_STATUS = getInteger(val); }
	public void setl_ODR_STS_TYP(String val) { m_l_ODR_STS_TYP = getInteger(val); }
	public void setl_MRP_ODR_TYP(String val) { m_l_MRP_ODR_TYP = getInteger(val); }
	public void setOD_GNR_TYP(String val) { m_OD_GNR_TYP = getInteger(val); }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = getInteger(val); }
	public void setEXTERNAL_DM_FLG(String val) { m_EXTERNAL_DM_FLG = getInteger(val); }
	public void setMRP_TYP(String val) { m_MRP_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setOD_TYP(String val) { m_OD_TYP = getInteger(val); }
	public void setl_OPR_RSLT_TYP(String val) { m_l_OPR_RSLT_TYP = getInteger(val); }

	public void setList_r1_MRP_ODR_TYP(List list) { l_r1_MRP_ODR_TYP = list; }
	public void setList_r2_MRP_ODR_TYP(List list) { l_r2_MRP_ODR_TYP = list; }
	public void setList_r3_MRP_ODR_TYP(List list) { l_r3_MRP_ODR_TYP = list; }
	public void setList_c1_PROGRESS_STS_TYP(List list) { l_c1_PROGRESS_STS_TYP = list; }
	public void setList_PRD_DUE_DATE_FROM(List list) { l_PRD_DUE_DATE_FROM = list; }
	public void setList_PRD_DUE_DATE_TO(List list) { l_PRD_DUE_DATE_TO = list; }
	public void setList_c2_PROGRESS_STS_TYP(List list) { l_c2_PROGRESS_STS_TYP = list; }
	public void setList_PRD_START_DATE_FROM(List list) { l_PRD_START_DATE_FROM = list; }
	public void setList_PRD_START_DATE_TO(List list) { l_PRD_START_DATE_TO = list; }
	public void setList_c1_ODR_STS_TYP(List list) { l_c1_ODR_STS_TYP = list; }
	public void setList_c2_ODR_STS_TYP(List list) { l_c2_ODR_STS_TYP = list; }
	public void setList_c3_ODR_STS_TYP(List list) { l_c3_ODR_STS_TYP = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_PROGRESS_STATUS_DN(List list) { l_l_PROGRESS_STATUS_DN = list; }
	public void setList_l_ODR_STS_TYP_DN(List list) { l_l_ODR_STS_TYP_DN = list; }
	public void setList_l_OUTSIDE_TYP_DN(List list) { l_l_OUTSIDE_TYP_DN = list; }
	public void setList_l_MRP_ODR_TYP_DN(List list) { l_l_MRP_ODR_TYP_DN = list; }
	public void setList_l_JOB_ODR_TYP_DN(List list) { l_l_JOB_ODR_TYP_DN = list; }
	public void setList_l_OD_GNR_TYP_DN(List list) { l_l_OD_GNR_TYP_DN = list; }
	public void setList_l_PROGRESS_STATUS(List list) { l_l_PROGRESS_STATUS = list; }
	public void setList_PRD_DUE_TIME_FROM(List list) { l_PRD_DUE_TIME_FROM = list; }
	public void setList_PRD_DUE_TIME_TO(List list) { l_PRD_DUE_TIME_TO = list; }
	public void setList_PRD_START_TIME_FROM(List list) { l_PRD_START_TIME_FROM = list; }
	public void setList_PRD_START_TIME_TO(List list) { l_PRD_START_TIME_TO = list; }
	public void setList_l_OD_NO(List list) { l_l_OD_NO = list; }
	public void setList_l_ODR_STS_TYP(List list) { l_l_ODR_STS_TYP = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_MRP_ODR_TYP(List list) { l_l_MRP_ODR_TYP = list; }
	public void setList_l_ODR_START_DATE(List list) { l_l_ODR_START_DATE = list; }
	public void setList_l_PRD_START_DATE(List list) { l_l_PRD_START_DATE = list; }
	public void setList_l_PRD_DUE_DATE(List list) { l_l_PRD_DUE_DATE = list; }
	public void setList_OD_GNR_TYP(List list) { l_OD_GNR_TYP = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_TOTAL_RCV_QTY(List list) { l_l_TOTAL_RCV_QTY = list; }
	public void setList_l_RCV_CMPLT_DATE(List list) { l_l_RCV_CMPLT_DATE = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_CANCEL_NO(List list) { l_l_JOB_ODR_CANCEL_NO = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_EXTERNAL_DM_FLG(List list) { l_EXTERNAL_DM_FLG = list; }
	public void setList_l_EXTERNAL_PLAN_CD(List list) { l_l_EXTERNAL_PLAN_CD = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_l_RLSD_PUCH_ODR_QTY(List list) { l_l_RLSD_PUCH_ODR_QTY = list; }
	public void setList_l_WORK_IN_PROC_QTY(List list) { l_l_WORK_IN_PROC_QTY = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_l_OPR_RSLT_TYP(List list) { l_l_OPR_RSLT_TYP = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_BUSINESS_OPR_DATE(List list) { l_l_BUSINESS_OPR_DATE = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_PRD_DUE_DATE_FROM(List list) { l_l_PRD_DUE_DATE_FROM = list; }
	public void setList_l_PRD_DUE_DATE_TO(List list) { l_l_PRD_DUE_DATE_TO = list; }
	public void setList_l_PRD_DUE_DATE_FROM_ZERO(List list) { l_l_PRD_DUE_DATE_FROM_ZERO = list; }
	public void setList_l_PRD_DUE_DATE_TO_ZERO(List list) { l_l_PRD_DUE_DATE_TO_ZERO = list; }
	public void setList_l_PRD_START_DATE_FROM(List list) { l_l_PRD_START_DATE_FROM = list; }
	public void setList_l_PRD_START_DATE_TO(List list) { l_l_PRD_START_DATE_TO = list; }
	public void setList_l_PRD_START_DATE_FROM_ZERO(List list) { l_l_PRD_START_DATE_FROM_ZERO = list; }
	public void setList_l_PRD_START_DATE_TO_ZERO(List list) { l_l_PRD_START_DATE_TO_ZERO = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ODR_STS_TYP_1(List list) { l_ODR_STS_TYP_1 = list; }
	public void setList_ODR_STS_TYP_2(List list) { l_ODR_STS_TYP_2 = list; }
	public void setList_ODR_STS_TYP_9_DELAYED(List list) { l_ODR_STS_TYP_9_DELAYED = list; }
	public void setList_l_DELAY_BASE_DATE(List list) { l_l_DELAY_BASE_DATE = list; }
	public void setList_ODR_STS_TYP_9_NOT_DELAYED(List list) { l_ODR_STS_TYP_9_NOT_DELAYED = list; }
	public void setList_l_NOT_DELAY_BASE_DATE(List list) { l_l_NOT_DELAY_BASE_DATE = list; }
	public void setList_ODR_STS_TYP_9(List list) { l_ODR_STS_TYP_9 = list; }
	public void setList_MRP_ODR_TYP_1(List list) { l_MRP_ODR_TYP_1 = list; }
	public void setList_MRP_ODR_TYP_2(List list) { l_MRP_ODR_TYP_2 = list; }
	public void setList_MRP_ODR_TYP_3(List list) { l_MRP_ODR_TYP_3 = list; }
	public void setList_MRP_ODR_TYP_4(List list) { l_MRP_ODR_TYP_4 = list; }
	public void setList_MRP_ODR_TYP_5(List list) { l_MRP_ODR_TYP_5 = list; }
	public void setList_MRP_ODR_TYP_6(List list) { l_MRP_ODR_TYP_6 = list; }
	public void setList_MRP_ODR_TYP_7(List list) { l_MRP_ODR_TYP_7 = list; }
	public void setList_MRP_ODR_TYP_8(List list) { l_MRP_ODR_TYP_8 = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_DELAY_TYP(List list) { l_DELAY_TYP = list; }
	public void setList_NOT_DELAY_TYP(List list) { l_NOT_DELAY_TYP = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_r1_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_MRP_ODR_TYP == null) {
			l_r1_MRP_ODR_TYP = new ArrayList();
		} else {
			l_r1_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_MRP_ODR_TYP.add(((AJ0010010Struct) list.get(i)).getr1_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_r2_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_MRP_ODR_TYP == null) {
			l_r2_MRP_ODR_TYP = new ArrayList();
		} else {
			l_r2_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_MRP_ODR_TYP.add(((AJ0010010Struct) list.get(i)).getr2_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_r3_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_MRP_ODR_TYP == null) {
			l_r3_MRP_ODR_TYP = new ArrayList();
		} else {
			l_r3_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_MRP_ODR_TYP.add(((AJ0010010Struct) list.get(i)).getr3_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_c1_PROGRESS_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_PROGRESS_STS_TYP == null) {
			l_c1_PROGRESS_STS_TYP = new ArrayList();
		} else {
			l_c1_PROGRESS_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_PROGRESS_STS_TYP.add(((AJ0010010Struct) list.get(i)).getc1_PROGRESS_STS_TYP());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_FROM == null) {
			l_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_FROM.add(((AJ0010010Struct) list.get(i)).getPRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_TO == null) {
			l_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_TO.add(((AJ0010010Struct) list.get(i)).getPRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_c2_PROGRESS_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_PROGRESS_STS_TYP == null) {
			l_c2_PROGRESS_STS_TYP = new ArrayList();
		} else {
			l_c2_PROGRESS_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_PROGRESS_STS_TYP.add(((AJ0010010Struct) list.get(i)).getc2_PROGRESS_STS_TYP());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_FROM == null) {
			l_PRD_START_DATE_FROM = new ArrayList();
		} else {
			l_PRD_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_FROM.add(((AJ0010010Struct) list.get(i)).getPRD_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_TO == null) {
			l_PRD_START_DATE_TO = new ArrayList();
		} else {
			l_PRD_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_TO.add(((AJ0010010Struct) list.get(i)).getPRD_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_c1_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_ODR_STS_TYP == null) {
			l_c1_ODR_STS_TYP = new ArrayList();
		} else {
			l_c1_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_ODR_STS_TYP.add(((AJ0010010Struct) list.get(i)).getc1_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_c2_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_ODR_STS_TYP == null) {
			l_c2_ODR_STS_TYP = new ArrayList();
		} else {
			l_c2_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_ODR_STS_TYP.add(((AJ0010010Struct) list.get(i)).getc2_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_c3_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_ODR_STS_TYP == null) {
			l_c3_ODR_STS_TYP = new ArrayList();
		} else {
			l_c3_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_ODR_STS_TYP.add(((AJ0010010Struct) list.get(i)).getc3_ODR_STS_TYP());
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
			l_DOWNLOAD_FILE.add(((AJ0010010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_l_PROGRESS_STATUS_DN.add(((AJ0010010Struct) list.get(i)).getl_PROGRESS_STATUS_DN());
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
			l_l_ODR_STS_TYP_DN.add(((AJ0010010Struct) list.get(i)).getl_ODR_STS_TYP_DN());
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
			l_l_OUTSIDE_TYP_DN.add(((AJ0010010Struct) list.get(i)).getl_OUTSIDE_TYP_DN());
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
			l_l_MRP_ODR_TYP_DN.add(((AJ0010010Struct) list.get(i)).getl_MRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_TYP_DN == null) {
			l_l_JOB_ODR_TYP_DN = new ArrayList();
		} else {
			l_l_JOB_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_TYP_DN.add(((AJ0010010Struct) list.get(i)).getl_JOB_ODR_TYP_DN());
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
			l_l_OD_GNR_TYP_DN.add(((AJ0010010Struct) list.get(i)).getl_OD_GNR_TYP_DN());
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
			l_l_PROGRESS_STATUS.add(((AJ0010010Struct) list.get(i)).getl_PROGRESS_STATUS());
		}
		return size;
	}
	public int setL2L_PRD_DUE_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_TIME_FROM == null) {
			l_PRD_DUE_TIME_FROM = new ArrayList();
		} else {
			l_PRD_DUE_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_TIME_FROM.add(((AJ0010010Struct) list.get(i)).getPRD_DUE_TIME_FROM());
		}
		return size;
	}
	public int setL2L_PRD_DUE_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_TIME_TO == null) {
			l_PRD_DUE_TIME_TO = new ArrayList();
		} else {
			l_PRD_DUE_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_TIME_TO.add(((AJ0010010Struct) list.get(i)).getPRD_DUE_TIME_TO());
		}
		return size;
	}
	public int setL2L_PRD_START_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_TIME_FROM == null) {
			l_PRD_START_TIME_FROM = new ArrayList();
		} else {
			l_PRD_START_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_TIME_FROM.add(((AJ0010010Struct) list.get(i)).getPRD_START_TIME_FROM());
		}
		return size;
	}
	public int setL2L_PRD_START_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_TIME_TO == null) {
			l_PRD_START_TIME_TO = new ArrayList();
		} else {
			l_PRD_START_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_TIME_TO.add(((AJ0010010Struct) list.get(i)).getPRD_START_TIME_TO());
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
			l_l_OD_NO.add(((AJ0010010Struct) list.get(i)).getl_OD_NO());
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
			l_l_ODR_STS_TYP.add(((AJ0010010Struct) list.get(i)).getl_ODR_STS_TYP());
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
			l_l_ITEM_CD.add(((AJ0010010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AJ0010010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_MRP_ODR_TYP.add(((AJ0010010Struct) list.get(i)).getl_MRP_ODR_TYP());
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
			l_l_ODR_START_DATE.add(((AJ0010010Struct) list.get(i)).getl_ODR_START_DATE());
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
			l_l_PRD_START_DATE.add(((AJ0010010Struct) list.get(i)).getl_PRD_START_DATE());
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
			l_l_PRD_DUE_DATE.add(((AJ0010010Struct) list.get(i)).getl_PRD_DUE_DATE());
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
			l_OD_GNR_TYP.add(((AJ0010010Struct) list.get(i)).getOD_GNR_TYP());
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
			l_l_ODR_QTY.add(((AJ0010010Struct) list.get(i)).getl_ODR_QTY());
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
			l_l_TOTAL_RCV_QTY.add(((AJ0010010Struct) list.get(i)).getl_TOTAL_RCV_QTY());
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
			l_l_RCV_CMPLT_DATE.add(((AJ0010010Struct) list.get(i)).getl_RCV_CMPLT_DATE());
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
			l_l_JOB_ODR_CD.add(((AJ0010010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CANCEL_NO == null) {
			l_l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CANCEL_NO.add(((AJ0010010Struct) list.get(i)).getl_JOB_ODR_CANCEL_NO());
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
			l_JOB_ODR_TYP.add(((AJ0010010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_GRP_CD == null) {
			l_l_ALC_GRP_CD = new ArrayList();
		} else {
			l_l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_GRP_CD.add(((AJ0010010Struct) list.get(i)).getl_ALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_EXTERNAL_DM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_DM_FLG == null) {
			l_EXTERNAL_DM_FLG = new ArrayList();
		} else {
			l_EXTERNAL_DM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_DM_FLG.add(((AJ0010010Struct) list.get(i)).getEXTERNAL_DM_FLG());
		}
		return size;
	}
	public int setL2L_l_EXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXTERNAL_PLAN_CD == null) {
			l_l_EXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_l_EXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXTERNAL_PLAN_CD.add(((AJ0010010Struct) list.get(i)).getl_EXTERNAL_PLAN_CD());
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
			l_MRP_TYP.add(((AJ0010010Struct) list.get(i)).getMRP_TYP());
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
			l_OUTSIDE_TYP.add(((AJ0010010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_l_RLSD_PUCH_ODR_QTY.add(((AJ0010010Struct) list.get(i)).getl_RLSD_PUCH_ODR_QTY());
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
			l_l_WORK_IN_PROC_QTY.add(((AJ0010010Struct) list.get(i)).getl_WORK_IN_PROC_QTY());
		}
		return size;
	}
	public int setL2L_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP == null) {
			l_OD_TYP = new ArrayList();
		} else {
			l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP.add(((AJ0010010Struct) list.get(i)).getOD_TYP());
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
			l_l_OPR_RSLT_TYP.add(((AJ0010010Struct) list.get(i)).getl_OPR_RSLT_TYP());
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
			l_l_PLANT_CD.add(((AJ0010010Struct) list.get(i)).getl_PLANT_CD());
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
			l_l_BUSINESS_OPR_DATE.add(((AJ0010010Struct) list.get(i)).getl_BUSINESS_OPR_DATE());
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
			l_l_STOCK_UNIT.add(((AJ0010010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE_FROM == null) {
			l_l_PRD_DUE_DATE_FROM = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE_FROM.add(((AJ0010010Struct) list.get(i)).getl_PRD_DUE_DATE_FROM());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE_TO == null) {
			l_l_PRD_DUE_DATE_TO = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE_TO.add(((AJ0010010Struct) list.get(i)).getl_PRD_DUE_DATE_TO());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE_FROM_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE_FROM_ZERO == null) {
			l_l_PRD_DUE_DATE_FROM_ZERO = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE_FROM_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE_FROM_ZERO.add(((AJ0010010Struct) list.get(i)).getl_PRD_DUE_DATE_FROM_ZERO());
		}
		return size;
	}
	public int setL2L_l_PRD_DUE_DATE_TO_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_DUE_DATE_TO_ZERO == null) {
			l_l_PRD_DUE_DATE_TO_ZERO = new ArrayList();
		} else {
			l_l_PRD_DUE_DATE_TO_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_DUE_DATE_TO_ZERO.add(((AJ0010010Struct) list.get(i)).getl_PRD_DUE_DATE_TO_ZERO());
		}
		return size;
	}
	public int setL2L_l_PRD_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_START_DATE_FROM == null) {
			l_l_PRD_START_DATE_FROM = new ArrayList();
		} else {
			l_l_PRD_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_START_DATE_FROM.add(((AJ0010010Struct) list.get(i)).getl_PRD_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_l_PRD_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_START_DATE_TO == null) {
			l_l_PRD_START_DATE_TO = new ArrayList();
		} else {
			l_l_PRD_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_START_DATE_TO.add(((AJ0010010Struct) list.get(i)).getl_PRD_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_l_PRD_START_DATE_FROM_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_START_DATE_FROM_ZERO == null) {
			l_l_PRD_START_DATE_FROM_ZERO = new ArrayList();
		} else {
			l_l_PRD_START_DATE_FROM_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_START_DATE_FROM_ZERO.add(((AJ0010010Struct) list.get(i)).getl_PRD_START_DATE_FROM_ZERO());
		}
		return size;
	}
	public int setL2L_l_PRD_START_DATE_TO_ZERO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_START_DATE_TO_ZERO == null) {
			l_l_PRD_START_DATE_TO_ZERO = new ArrayList();
		} else {
			l_l_PRD_START_DATE_TO_ZERO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_START_DATE_TO_ZERO.add(((AJ0010010Struct) list.get(i)).getl_PRD_START_DATE_TO_ZERO());
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
			l_JOB_ODR_CD.add(((AJ0010010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AJ0010010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_1 == null) {
			l_ODR_STS_TYP_1 = new ArrayList();
		} else {
			l_ODR_STS_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_1.add(((AJ0010010Struct) list.get(i)).getODR_STS_TYP_1());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_2 == null) {
			l_ODR_STS_TYP_2 = new ArrayList();
		} else {
			l_ODR_STS_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_2.add(((AJ0010010Struct) list.get(i)).getODR_STS_TYP_2());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_9_DELAYED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_9_DELAYED == null) {
			l_ODR_STS_TYP_9_DELAYED = new ArrayList();
		} else {
			l_ODR_STS_TYP_9_DELAYED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_9_DELAYED.add(((AJ0010010Struct) list.get(i)).getODR_STS_TYP_9_DELAYED());
		}
		return size;
	}
	public int setL2L_l_DELAY_BASE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DELAY_BASE_DATE == null) {
			l_l_DELAY_BASE_DATE = new ArrayList();
		} else {
			l_l_DELAY_BASE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DELAY_BASE_DATE.add(((AJ0010010Struct) list.get(i)).getl_DELAY_BASE_DATE());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_9_NOT_DELAYED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_9_NOT_DELAYED == null) {
			l_ODR_STS_TYP_9_NOT_DELAYED = new ArrayList();
		} else {
			l_ODR_STS_TYP_9_NOT_DELAYED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_9_NOT_DELAYED.add(((AJ0010010Struct) list.get(i)).getODR_STS_TYP_9_NOT_DELAYED());
		}
		return size;
	}
	public int setL2L_l_NOT_DELAY_BASE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NOT_DELAY_BASE_DATE == null) {
			l_l_NOT_DELAY_BASE_DATE = new ArrayList();
		} else {
			l_l_NOT_DELAY_BASE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NOT_DELAY_BASE_DATE.add(((AJ0010010Struct) list.get(i)).getl_NOT_DELAY_BASE_DATE());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_9 == null) {
			l_ODR_STS_TYP_9 = new ArrayList();
		} else {
			l_ODR_STS_TYP_9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_9.add(((AJ0010010Struct) list.get(i)).getODR_STS_TYP_9());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_1 == null) {
			l_MRP_ODR_TYP_1 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_1.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_1());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_2 == null) {
			l_MRP_ODR_TYP_2 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_2.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_2());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_3 == null) {
			l_MRP_ODR_TYP_3 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_3.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_3());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_4 == null) {
			l_MRP_ODR_TYP_4 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_4.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_4());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_5 == null) {
			l_MRP_ODR_TYP_5 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_5.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_5());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_6 == null) {
			l_MRP_ODR_TYP_6 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_6.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_6());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_7 == null) {
			l_MRP_ODR_TYP_7 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_7.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_7());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_8 == null) {
			l_MRP_ODR_TYP_8 = new ArrayList();
		} else {
			l_MRP_ODR_TYP_8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_8.add(((AJ0010010Struct) list.get(i)).getMRP_ODR_TYP_8());
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
			l_PLANT_CD.add(((AJ0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_DELAY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DELAY_TYP == null) {
			l_DELAY_TYP = new ArrayList();
		} else {
			l_DELAY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DELAY_TYP.add(((AJ0010010Struct) list.get(i)).getDELAY_TYP());
		}
		return size;
	}
	public int setL2L_NOT_DELAY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NOT_DELAY_TYP == null) {
			l_NOT_DELAY_TYP = new ArrayList();
		} else {
			l_NOT_DELAY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NOT_DELAY_TYP.add(((AJ0010010Struct) list.get(i)).getNOT_DELAY_TYP());
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
			l_PLANT_NAME.add(((AJ0010010Struct) list.get(i)).getPLANT_NAME());
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
			l_TIME_CTRL.add(((AJ0010010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AJ0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AJ0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_MRP_ODR_TYP = null;
		m_r2_MRP_ODR_TYP = null;
		m_r3_MRP_ODR_TYP = null;
		m_c1_PROGRESS_STS_TYP = null;
		m_PRD_DUE_DATE_FROM = null;
		m_PRD_DUE_DATE_TO = null;
		m_c2_PROGRESS_STS_TYP = null;
		m_PRD_START_DATE_FROM = null;
		m_PRD_START_DATE_TO = null;
		m_c1_ODR_STS_TYP = null;
		m_c2_ODR_STS_TYP = null;
		m_c3_ODR_STS_TYP = null;
		m_DOWNLOAD_FILE = null;
		m_l_PROGRESS_STATUS_DN = null;
		m_l_ODR_STS_TYP_DN = null;
		m_l_OUTSIDE_TYP_DN = null;
		m_l_MRP_ODR_TYP_DN = null;
		m_l_JOB_ODR_TYP_DN = null;
		m_l_OD_GNR_TYP_DN = null;
		m_l_PROGRESS_STATUS = null;
		m_PRD_DUE_TIME_FROM = null;
		m_PRD_DUE_TIME_TO = null;
		m_PRD_START_TIME_FROM = null;
		m_PRD_START_TIME_TO = null;
		m_l_OD_NO = null;
		m_l_ODR_STS_TYP = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_MRP_ODR_TYP = null;
		m_l_ODR_START_DATE = null;
		m_l_PRD_START_DATE = null;
		m_l_PRD_DUE_DATE = null;
		m_OD_GNR_TYP = null;
		m_l_ODR_QTY = null;
		m_l_TOTAL_RCV_QTY = null;
		m_l_RCV_CMPLT_DATE = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_CANCEL_NO = null;
		m_JOB_ODR_TYP = null;
		m_l_ALC_GRP_CD = null;
		m_EXTERNAL_DM_FLG = null;
		m_l_EXTERNAL_PLAN_CD = null;
		m_MRP_TYP = null;
		m_OUTSIDE_TYP = null;
		m_l_RLSD_PUCH_ODR_QTY = null;
		m_l_WORK_IN_PROC_QTY = null;
		m_OD_TYP = null;
		m_l_OPR_RSLT_TYP = null;
		m_l_PLANT_CD = null;
		m_l_BUSINESS_OPR_DATE = null;
		m_l_STOCK_UNIT = null;
		m_l_PRD_DUE_DATE_FROM = null;
		m_l_PRD_DUE_DATE_TO = null;
		m_l_PRD_DUE_DATE_FROM_ZERO = null;
		m_l_PRD_DUE_DATE_TO_ZERO = null;
		m_l_PRD_START_DATE_FROM = null;
		m_l_PRD_START_DATE_TO = null;
		m_l_PRD_START_DATE_FROM_ZERO = null;
		m_l_PRD_START_DATE_TO_ZERO = null;
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_ODR_STS_TYP_1 = null;
		m_ODR_STS_TYP_2 = null;
		m_ODR_STS_TYP_9_DELAYED = null;
		m_l_DELAY_BASE_DATE = null;
		m_ODR_STS_TYP_9_NOT_DELAYED = null;
		m_l_NOT_DELAY_BASE_DATE = null;
		m_ODR_STS_TYP_9 = null;
		m_MRP_ODR_TYP_1 = null;
		m_MRP_ODR_TYP_2 = null;
		m_MRP_ODR_TYP_3 = null;
		m_MRP_ODR_TYP_4 = null;
		m_MRP_ODR_TYP_5 = null;
		m_MRP_ODR_TYP_6 = null;
		m_MRP_ODR_TYP_7 = null;
		m_MRP_ODR_TYP_8 = null;
		m_PLANT_CD = null;
		m_DELAY_TYP = null;
		m_NOT_DELAY_TYP = null;
		m_PLANT_NAME = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r1_MRP_ODR_TYP = null;
		l_r2_MRP_ODR_TYP = null;
		l_r3_MRP_ODR_TYP = null;
		l_c1_PROGRESS_STS_TYP = null;
		l_PRD_DUE_DATE_FROM = null;
		l_PRD_DUE_DATE_TO = null;
		l_c2_PROGRESS_STS_TYP = null;
		l_PRD_START_DATE_FROM = null;
		l_PRD_START_DATE_TO = null;
		l_c1_ODR_STS_TYP = null;
		l_c2_ODR_STS_TYP = null;
		l_c3_ODR_STS_TYP = null;
		l_DOWNLOAD_FILE = null;
		l_l_PROGRESS_STATUS_DN = null;
		l_l_ODR_STS_TYP_DN = null;
		l_l_OUTSIDE_TYP_DN = null;
		l_l_MRP_ODR_TYP_DN = null;
		l_l_JOB_ODR_TYP_DN = null;
		l_l_OD_GNR_TYP_DN = null;
		l_l_PROGRESS_STATUS = null;
		l_PRD_DUE_TIME_FROM = null;
		l_PRD_DUE_TIME_TO = null;
		l_PRD_START_TIME_FROM = null;
		l_PRD_START_TIME_TO = null;
		l_l_OD_NO = null;
		l_l_ODR_STS_TYP = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_MRP_ODR_TYP = null;
		l_l_ODR_START_DATE = null;
		l_l_PRD_START_DATE = null;
		l_l_PRD_DUE_DATE = null;
		l_OD_GNR_TYP = null;
		l_l_ODR_QTY = null;
		l_l_TOTAL_RCV_QTY = null;
		l_l_RCV_CMPLT_DATE = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_CANCEL_NO = null;
		l_JOB_ODR_TYP = null;
		l_l_ALC_GRP_CD = null;
		l_EXTERNAL_DM_FLG = null;
		l_l_EXTERNAL_PLAN_CD = null;
		l_MRP_TYP = null;
		l_OUTSIDE_TYP = null;
		l_l_RLSD_PUCH_ODR_QTY = null;
		l_l_WORK_IN_PROC_QTY = null;
		l_OD_TYP = null;
		l_l_OPR_RSLT_TYP = null;
		l_l_PLANT_CD = null;
		l_l_BUSINESS_OPR_DATE = null;
		l_l_STOCK_UNIT = null;
		l_l_PRD_DUE_DATE_FROM = null;
		l_l_PRD_DUE_DATE_TO = null;
		l_l_PRD_DUE_DATE_FROM_ZERO = null;
		l_l_PRD_DUE_DATE_TO_ZERO = null;
		l_l_PRD_START_DATE_FROM = null;
		l_l_PRD_START_DATE_TO = null;
		l_l_PRD_START_DATE_FROM_ZERO = null;
		l_l_PRD_START_DATE_TO_ZERO = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_ODR_STS_TYP_1 = null;
		l_ODR_STS_TYP_2 = null;
		l_ODR_STS_TYP_9_DELAYED = null;
		l_l_DELAY_BASE_DATE = null;
		l_ODR_STS_TYP_9_NOT_DELAYED = null;
		l_l_NOT_DELAY_BASE_DATE = null;
		l_ODR_STS_TYP_9 = null;
		l_MRP_ODR_TYP_1 = null;
		l_MRP_ODR_TYP_2 = null;
		l_MRP_ODR_TYP_3 = null;
		l_MRP_ODR_TYP_4 = null;
		l_MRP_ODR_TYP_5 = null;
		l_MRP_ODR_TYP_6 = null;
		l_MRP_ODR_TYP_7 = null;
		l_MRP_ODR_TYP_8 = null;
		l_PLANT_CD = null;
		l_DELAY_TYP = null;
		l_NOT_DELAY_TYP = null;
		l_PLANT_NAME = null;
		l_TIME_CTRL = null;
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
	 * medAJ0010010クラスの標準コンストラクタ
	 */
	public AJ0010010Struct()
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
	public void setStruct(AJ0010010Struct struct)
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
	public void setStructM(AJ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_MRP_ODR_TYP(struct.getr1_MRP_ODR_TYP());
			this.setr2_MRP_ODR_TYP(struct.getr2_MRP_ODR_TYP());
			this.setr3_MRP_ODR_TYP(struct.getr3_MRP_ODR_TYP());
			this.setc1_PROGRESS_STS_TYP(struct.getc1_PROGRESS_STS_TYP());
			this.setPRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			this.setPRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO());
			this.setc2_PROGRESS_STS_TYP(struct.getc2_PROGRESS_STS_TYP());
			this.setPRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			this.setPRD_START_DATE_TO(struct.getPRD_START_DATE_TO());
			this.setc1_ODR_STS_TYP(struct.getc1_ODR_STS_TYP());
			this.setc2_ODR_STS_TYP(struct.getc2_ODR_STS_TYP());
			this.setc3_ODR_STS_TYP(struct.getc3_ODR_STS_TYP());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_PROGRESS_STATUS_DN(struct.getl_PROGRESS_STATUS_DN());
			this.setl_ODR_STS_TYP_DN(struct.getl_ODR_STS_TYP_DN());
			this.setl_OUTSIDE_TYP_DN(struct.getl_OUTSIDE_TYP_DN());
			this.setl_MRP_ODR_TYP_DN(struct.getl_MRP_ODR_TYP_DN());
			this.setl_JOB_ODR_TYP_DN(struct.getl_JOB_ODR_TYP_DN());
			this.setl_OD_GNR_TYP_DN(struct.getl_OD_GNR_TYP_DN());
			this.setl_PROGRESS_STATUS(struct.getl_PROGRESS_STATUS());
			this.setPRD_DUE_TIME_FROM(struct.getPRD_DUE_TIME_FROM());
			this.setPRD_DUE_TIME_TO(struct.getPRD_DUE_TIME_TO());
			this.setPRD_START_TIME_FROM(struct.getPRD_START_TIME_FROM());
			this.setPRD_START_TIME_TO(struct.getPRD_START_TIME_TO());
			this.setl_OD_NO(struct.getl_OD_NO());
			this.setl_ODR_STS_TYP(struct.getl_ODR_STS_TYP());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_MRP_ODR_TYP(struct.getl_MRP_ODR_TYP());
			this.setl_ODR_START_DATE(struct.getl_ODR_START_DATE());
			this.setl_PRD_START_DATE(struct.getl_PRD_START_DATE());
			this.setl_PRD_DUE_DATE(struct.getl_PRD_DUE_DATE());
			this.setOD_GNR_TYP(struct.getOD_GNR_TYP());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_TOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
			this.setl_RCV_CMPLT_DATE(struct.getl_RCV_CMPLT_DATE());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setEXTERNAL_DM_FLG(struct.getEXTERNAL_DM_FLG());
			this.setl_EXTERNAL_PLAN_CD(struct.getl_EXTERNAL_PLAN_CD());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setl_RLSD_PUCH_ODR_QTY(struct.getl_RLSD_PUCH_ODR_QTY());
			this.setl_WORK_IN_PROC_QTY(struct.getl_WORK_IN_PROC_QTY());
			this.setOD_TYP(struct.getOD_TYP());
			this.setl_OPR_RSLT_TYP(struct.getl_OPR_RSLT_TYP());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_BUSINESS_OPR_DATE(struct.getl_BUSINESS_OPR_DATE());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_PRD_DUE_DATE_FROM(struct.getl_PRD_DUE_DATE_FROM());
			this.setl_PRD_DUE_DATE_TO(struct.getl_PRD_DUE_DATE_TO());
			this.setl_PRD_DUE_DATE_FROM_ZERO(struct.getl_PRD_DUE_DATE_FROM_ZERO());
			this.setl_PRD_DUE_DATE_TO_ZERO(struct.getl_PRD_DUE_DATE_TO_ZERO());
			this.setl_PRD_START_DATE_FROM(struct.getl_PRD_START_DATE_FROM());
			this.setl_PRD_START_DATE_TO(struct.getl_PRD_START_DATE_TO());
			this.setl_PRD_START_DATE_FROM_ZERO(struct.getl_PRD_START_DATE_FROM_ZERO());
			this.setl_PRD_START_DATE_TO_ZERO(struct.getl_PRD_START_DATE_TO_ZERO());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setODR_STS_TYP_1(struct.getODR_STS_TYP_1());
			this.setODR_STS_TYP_2(struct.getODR_STS_TYP_2());
			this.setODR_STS_TYP_9_DELAYED(struct.getODR_STS_TYP_9_DELAYED());
			this.setl_DELAY_BASE_DATE(struct.getl_DELAY_BASE_DATE());
			this.setODR_STS_TYP_9_NOT_DELAYED(struct.getODR_STS_TYP_9_NOT_DELAYED());
			this.setl_NOT_DELAY_BASE_DATE(struct.getl_NOT_DELAY_BASE_DATE());
			this.setODR_STS_TYP_9(struct.getODR_STS_TYP_9());
			this.setMRP_ODR_TYP_1(struct.getMRP_ODR_TYP_1());
			this.setMRP_ODR_TYP_2(struct.getMRP_ODR_TYP_2());
			this.setMRP_ODR_TYP_3(struct.getMRP_ODR_TYP_3());
			this.setMRP_ODR_TYP_4(struct.getMRP_ODR_TYP_4());
			this.setMRP_ODR_TYP_5(struct.getMRP_ODR_TYP_5());
			this.setMRP_ODR_TYP_6(struct.getMRP_ODR_TYP_6());
			this.setMRP_ODR_TYP_7(struct.getMRP_ODR_TYP_7());
			this.setMRP_ODR_TYP_8(struct.getMRP_ODR_TYP_8());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setDELAY_TYP(struct.getDELAY_TYP());
			this.setNOT_DELAY_TYP(struct.getNOT_DELAY_TYP());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AJ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_MRP_ODR_TYP(struct.getList_r1_MRP_ODR_TYP());
			this.setList_r2_MRP_ODR_TYP(struct.getList_r2_MRP_ODR_TYP());
			this.setList_r3_MRP_ODR_TYP(struct.getList_r3_MRP_ODR_TYP());
			this.setList_c1_PROGRESS_STS_TYP(struct.getList_c1_PROGRESS_STS_TYP());
			this.setList_PRD_DUE_DATE_FROM(struct.getList_PRD_DUE_DATE_FROM());
			this.setList_PRD_DUE_DATE_TO(struct.getList_PRD_DUE_DATE_TO());
			this.setList_c2_PROGRESS_STS_TYP(struct.getList_c2_PROGRESS_STS_TYP());
			this.setList_PRD_START_DATE_FROM(struct.getList_PRD_START_DATE_FROM());
			this.setList_PRD_START_DATE_TO(struct.getList_PRD_START_DATE_TO());
			this.setList_c1_ODR_STS_TYP(struct.getList_c1_ODR_STS_TYP());
			this.setList_c2_ODR_STS_TYP(struct.getList_c2_ODR_STS_TYP());
			this.setList_c3_ODR_STS_TYP(struct.getList_c3_ODR_STS_TYP());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_PROGRESS_STATUS_DN(struct.getList_l_PROGRESS_STATUS_DN());
			this.setList_l_ODR_STS_TYP_DN(struct.getList_l_ODR_STS_TYP_DN());
			this.setList_l_OUTSIDE_TYP_DN(struct.getList_l_OUTSIDE_TYP_DN());
			this.setList_l_MRP_ODR_TYP_DN(struct.getList_l_MRP_ODR_TYP_DN());
			this.setList_l_JOB_ODR_TYP_DN(struct.getList_l_JOB_ODR_TYP_DN());
			this.setList_l_OD_GNR_TYP_DN(struct.getList_l_OD_GNR_TYP_DN());
			this.setList_l_PROGRESS_STATUS(struct.getList_l_PROGRESS_STATUS());
			this.setList_PRD_DUE_TIME_FROM(struct.getList_PRD_DUE_TIME_FROM());
			this.setList_PRD_DUE_TIME_TO(struct.getList_PRD_DUE_TIME_TO());
			this.setList_PRD_START_TIME_FROM(struct.getList_PRD_START_TIME_FROM());
			this.setList_PRD_START_TIME_TO(struct.getList_PRD_START_TIME_TO());
			this.setList_l_OD_NO(struct.getList_l_OD_NO());
			this.setList_l_ODR_STS_TYP(struct.getList_l_ODR_STS_TYP());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_MRP_ODR_TYP(struct.getList_l_MRP_ODR_TYP());
			this.setList_l_ODR_START_DATE(struct.getList_l_ODR_START_DATE());
			this.setList_l_PRD_START_DATE(struct.getList_l_PRD_START_DATE());
			this.setList_l_PRD_DUE_DATE(struct.getList_l_PRD_DUE_DATE());
			this.setList_OD_GNR_TYP(struct.getList_OD_GNR_TYP());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_TOTAL_RCV_QTY(struct.getList_l_TOTAL_RCV_QTY());
			this.setList_l_RCV_CMPLT_DATE(struct.getList_l_RCV_CMPLT_DATE());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_CANCEL_NO(struct.getList_l_JOB_ODR_CANCEL_NO());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_EXTERNAL_DM_FLG(struct.getList_EXTERNAL_DM_FLG());
			this.setList_l_EXTERNAL_PLAN_CD(struct.getList_l_EXTERNAL_PLAN_CD());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_l_RLSD_PUCH_ODR_QTY(struct.getList_l_RLSD_PUCH_ODR_QTY());
			this.setList_l_WORK_IN_PROC_QTY(struct.getList_l_WORK_IN_PROC_QTY());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_l_OPR_RSLT_TYP(struct.getList_l_OPR_RSLT_TYP());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_BUSINESS_OPR_DATE(struct.getList_l_BUSINESS_OPR_DATE());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_PRD_DUE_DATE_FROM(struct.getList_l_PRD_DUE_DATE_FROM());
			this.setList_l_PRD_DUE_DATE_TO(struct.getList_l_PRD_DUE_DATE_TO());
			this.setList_l_PRD_DUE_DATE_FROM_ZERO(struct.getList_l_PRD_DUE_DATE_FROM_ZERO());
			this.setList_l_PRD_DUE_DATE_TO_ZERO(struct.getList_l_PRD_DUE_DATE_TO_ZERO());
			this.setList_l_PRD_START_DATE_FROM(struct.getList_l_PRD_START_DATE_FROM());
			this.setList_l_PRD_START_DATE_TO(struct.getList_l_PRD_START_DATE_TO());
			this.setList_l_PRD_START_DATE_FROM_ZERO(struct.getList_l_PRD_START_DATE_FROM_ZERO());
			this.setList_l_PRD_START_DATE_TO_ZERO(struct.getList_l_PRD_START_DATE_TO_ZERO());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ODR_STS_TYP_1(struct.getList_ODR_STS_TYP_1());
			this.setList_ODR_STS_TYP_2(struct.getList_ODR_STS_TYP_2());
			this.setList_ODR_STS_TYP_9_DELAYED(struct.getList_ODR_STS_TYP_9_DELAYED());
			this.setList_l_DELAY_BASE_DATE(struct.getList_l_DELAY_BASE_DATE());
			this.setList_ODR_STS_TYP_9_NOT_DELAYED(struct.getList_ODR_STS_TYP_9_NOT_DELAYED());
			this.setList_l_NOT_DELAY_BASE_DATE(struct.getList_l_NOT_DELAY_BASE_DATE());
			this.setList_ODR_STS_TYP_9(struct.getList_ODR_STS_TYP_9());
			this.setList_MRP_ODR_TYP_1(struct.getList_MRP_ODR_TYP_1());
			this.setList_MRP_ODR_TYP_2(struct.getList_MRP_ODR_TYP_2());
			this.setList_MRP_ODR_TYP_3(struct.getList_MRP_ODR_TYP_3());
			this.setList_MRP_ODR_TYP_4(struct.getList_MRP_ODR_TYP_4());
			this.setList_MRP_ODR_TYP_5(struct.getList_MRP_ODR_TYP_5());
			this.setList_MRP_ODR_TYP_6(struct.getList_MRP_ODR_TYP_6());
			this.setList_MRP_ODR_TYP_7(struct.getList_MRP_ODR_TYP_7());
			this.setList_MRP_ODR_TYP_8(struct.getList_MRP_ODR_TYP_8());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_DELAY_TYP(struct.getList_DELAY_TYP());
			this.setList_NOT_DELAY_TYP(struct.getList_NOT_DELAY_TYP());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// 第 1 変数初期値： i_r1_MRP_ODR_TYP


	final static String i_r1_MRP_ODR_TYP = null;

	// 第 2 変数初期値： i_r2_MRP_ODR_TYP


	final static String i_r2_MRP_ODR_TYP = null;

	// 第 3 変数初期値： i_r3_MRP_ODR_TYP


	final static String i_r3_MRP_ODR_TYP = null;

	// 第 4 変数初期値： i_c1_PROGRESS_STS_TYP


	final static String i_c1_PROGRESS_STS_TYP = null;

	// 第 5 変数初期値： i_PRD_DUE_DATE_FROM


	final static String i_PRD_DUE_DATE_FROM = null;

	// 第 6 変数初期値： i_PRD_DUE_DATE_TO


	final static String i_PRD_DUE_DATE_TO = null;

	// 第 7 変数初期値： i_c2_PROGRESS_STS_TYP


	final static String i_c2_PROGRESS_STS_TYP = null;

	// 第 8 変数初期値： i_PRD_START_DATE_FROM


	final static String i_PRD_START_DATE_FROM = null;

	// 第 9 変数初期値： i_PRD_START_DATE_TO


	final static String i_PRD_START_DATE_TO = null;

	// 第 10 変数初期値： i_c1_ODR_STS_TYP


	final static String i_c1_ODR_STS_TYP = null;

	// 第 11 変数初期値： i_c2_ODR_STS_TYP


	final static String i_c2_ODR_STS_TYP = null;

	// 第 12 変数初期値： i_c3_ODR_STS_TYP


	final static String i_c3_ODR_STS_TYP = null;

	// 第 13 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 14 変数初期値： i_l_PROGRESS_STATUS_DN


	final static String i_l_PROGRESS_STATUS_DN = null;

	// 第 15 変数初期値： i_l_ODR_STS_TYP_DN


	final static String i_l_ODR_STS_TYP_DN = null;

	// 第 16 変数初期値： i_l_OUTSIDE_TYP_DN


	final static String i_l_OUTSIDE_TYP_DN = null;

	// 第 17 変数初期値： i_l_MRP_ODR_TYP_DN


	final static String i_l_MRP_ODR_TYP_DN = null;

	// 第 18 変数初期値： i_l_JOB_ODR_TYP_DN


	final static String i_l_JOB_ODR_TYP_DN = null;

	// 第 19 変数初期値： i_l_OD_GNR_TYP_DN


	final static String i_l_OD_GNR_TYP_DN = null;

	// 第 20 変数初期値： i_l_PROGRESS_STATUS


	final static Integer i_l_PROGRESS_STATUS = null;

	// 第 21 変数初期値： i_PRD_DUE_TIME_FROM


	final static String i_PRD_DUE_TIME_FROM = null;

	// 第 22 変数初期値： i_PRD_DUE_TIME_TO


	final static String i_PRD_DUE_TIME_TO = null;

	// 第 23 変数初期値： i_PRD_START_TIME_FROM


	final static String i_PRD_START_TIME_FROM = null;

	// 第 24 変数初期値： i_PRD_START_TIME_TO


	final static String i_PRD_START_TIME_TO = null;

	// 第 25 変数初期値： i_l_OD_NO


	final static String i_l_OD_NO = null;

	// 第 26 変数初期値： i_l_ODR_STS_TYP


	final static Integer i_l_ODR_STS_TYP = null;

	// 第 27 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 28 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 29 変数初期値： i_l_MRP_ODR_TYP


	final static Integer i_l_MRP_ODR_TYP = null;

	// 第 30 変数初期値： i_l_ODR_START_DATE


	final static String i_l_ODR_START_DATE = null;

	// 第 31 変数初期値： i_l_PRD_START_DATE


	final static String i_l_PRD_START_DATE = null;

	// 第 32 変数初期値： i_l_PRD_DUE_DATE


	final static String i_l_PRD_DUE_DATE = null;

	// 第 33 変数初期値： i_OD_GNR_TYP


	final static Integer i_OD_GNR_TYP = null;

	// 第 34 変数初期値： i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// 第 35 変数初期値： i_l_TOTAL_RCV_QTY


	final static String i_l_TOTAL_RCV_QTY = null;

	// 第 36 変数初期値： i_l_RCV_CMPLT_DATE


	final static String i_l_RCV_CMPLT_DATE = null;

	// 第 37 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 38 変数初期値： i_l_JOB_ODR_CANCEL_NO


	final static String i_l_JOB_ODR_CANCEL_NO = null;

	// 第 39 変数初期値： i_JOB_ODR_TYP


	final static Integer i_JOB_ODR_TYP = null;

	// 第 40 変数初期値： i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// 第 41 変数初期値： i_EXTERNAL_DM_FLG


	final static Integer i_EXTERNAL_DM_FLG = null;

	// 第 42 変数初期値： i_l_EXTERNAL_PLAN_CD


	final static String i_l_EXTERNAL_PLAN_CD = null;

	// 第 43 変数初期値： i_MRP_TYP


	final static Integer i_MRP_TYP = null;

	// 第 44 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 45 変数初期値： i_l_RLSD_PUCH_ODR_QTY


	final static String i_l_RLSD_PUCH_ODR_QTY = null;

	// 第 46 変数初期値： i_l_WORK_IN_PROC_QTY


	final static String i_l_WORK_IN_PROC_QTY = null;

	// 第 47 変数初期値： i_OD_TYP


	final static Integer i_OD_TYP = null;

	// 第 48 変数初期値： i_l_OPR_RSLT_TYP


	final static Integer i_l_OPR_RSLT_TYP = null;

	// 第 49 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 50 変数初期値： i_l_BUSINESS_OPR_DATE


	final static String i_l_BUSINESS_OPR_DATE = null;

	// 第 51 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 52 変数初期値： i_l_PRD_DUE_DATE_FROM


	final static String i_l_PRD_DUE_DATE_FROM = null;

	// 第 53 変数初期値： i_l_PRD_DUE_DATE_TO


	final static String i_l_PRD_DUE_DATE_TO = null;

	// 第 54 変数初期値： i_l_PRD_DUE_DATE_FROM_ZERO


	final static String i_l_PRD_DUE_DATE_FROM_ZERO = null;

	// 第 55 変数初期値： i_l_PRD_DUE_DATE_TO_ZERO


	final static String i_l_PRD_DUE_DATE_TO_ZERO = null;

	// 第 56 変数初期値： i_l_PRD_START_DATE_FROM


	final static String i_l_PRD_START_DATE_FROM = null;

	// 第 57 変数初期値： i_l_PRD_START_DATE_TO


	final static String i_l_PRD_START_DATE_TO = null;

	// 第 58 変数初期値： i_l_PRD_START_DATE_FROM_ZERO


	final static String i_l_PRD_START_DATE_FROM_ZERO = null;

	// 第 59 変数初期値： i_l_PRD_START_DATE_TO_ZERO


	final static String i_l_PRD_START_DATE_TO_ZERO = null;

	// 第 60 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 61 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 62 変数初期値： i_ODR_STS_TYP_1


	final static String i_ODR_STS_TYP_1 = null;

	// 第 63 変数初期値： i_ODR_STS_TYP_2


	final static String i_ODR_STS_TYP_2 = null;

	// 第 64 変数初期値： i_ODR_STS_TYP_9_DELAYED


	final static String i_ODR_STS_TYP_9_DELAYED = null;

	// 第 65 変数初期値： i_l_DELAY_BASE_DATE


	final static String i_l_DELAY_BASE_DATE = null;

	// 第 66 変数初期値： i_ODR_STS_TYP_9_NOT_DELAYED


	final static String i_ODR_STS_TYP_9_NOT_DELAYED = null;

	// 第 67 変数初期値： i_l_NOT_DELAY_BASE_DATE


	final static String i_l_NOT_DELAY_BASE_DATE = null;

	// 第 68 変数初期値： i_ODR_STS_TYP_9


	final static String i_ODR_STS_TYP_9 = null;

	// 第 69 変数初期値： i_MRP_ODR_TYP_1


	final static String i_MRP_ODR_TYP_1 = null;

	// 第 70 変数初期値： i_MRP_ODR_TYP_2


	final static String i_MRP_ODR_TYP_2 = null;

	// 第 71 変数初期値： i_MRP_ODR_TYP_3


	final static String i_MRP_ODR_TYP_3 = null;

	// 第 72 変数初期値： i_MRP_ODR_TYP_4


	final static String i_MRP_ODR_TYP_4 = null;

	// 第 73 変数初期値： i_MRP_ODR_TYP_5


	final static String i_MRP_ODR_TYP_5 = null;

	// 第 74 変数初期値： i_MRP_ODR_TYP_6


	final static String i_MRP_ODR_TYP_6 = null;

	// 第 75 変数初期値： i_MRP_ODR_TYP_7


	final static String i_MRP_ODR_TYP_7 = null;

	// 第 76 変数初期値： i_MRP_ODR_TYP_8


	final static String i_MRP_ODR_TYP_8 = null;

	// 第 77 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 78 変数初期値： i_DELAY_TYP


	final static String i_DELAY_TYP = null;

	// 第 79 変数初期値： i_NOT_DELAY_TYP


	final static String i_NOT_DELAY_TYP = null;

	// 第 80 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 81 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 82 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 83 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_l_OD_NO
	final static String i_l_OD_NO = null;
	// 第 2 変数初期値： i_l_ODR_STS_TYP
	final static Integer i_l_ODR_STS_TYP = null;
	// 第 3 変数初期値： i_l_ITEM_CD
	final static String i_l_ITEM_CD = null;
	// 第 4 変数初期値： i_l_ITEM_NAME
	final static String i_l_ITEM_NAME = null;
	// 第 5 変数初期値： i_l_MRP_ODR_TYP
	final static Integer i_l_MRP_ODR_TYP = null;
	// 第 6 変数初期値： i_l_ODR_START_DATE
	final static String i_l_ODR_START_DATE = null;
	// 第 7 変数初期値： i_l_PRD_START_DATE
	final static String i_l_PRD_START_DATE = null;
	// 第 8 変数初期値： i_l_PRD_DUE_DATE
	final static String i_l_PRD_DUE_DATE = null;
	// 第 9 変数初期値： i_OD_GNR_TYP
	final static Integer i_OD_GNR_TYP = null;
	// 第 10 変数初期値： i_l_ODR_QTY
	final static String i_l_ODR_QTY = null;
	// 第 11 変数初期値： i_l_TOTAL_RCV_QTY
	final static String i_l_TOTAL_RCV_QTY = null;
	// 第 12 変数初期値： i_l_RCV_CMPLT_DATE
	final static String i_l_RCV_CMPLT_DATE = null;
	// 第 13 変数初期値： i_l_JOB_ODR_CD
	final static String i_l_JOB_ODR_CD = null;
	// 第 14 変数初期値： i_l_JOB_ODR_CANCEL_NO
	final static String i_l_JOB_ODR_CANCEL_NO = null;
	// 第 15 変数初期値： i_JOB_ODR_TYP
	final static Integer i_JOB_ODR_TYP = null;
	// 第 16 変数初期値： i_l_ALC_GRP_CD
	final static String i_l_ALC_GRP_CD = null;
	// 第 17 変数初期値： i_EXTERNAL_DM_FLG
	final static Integer i_EXTERNAL_DM_FLG = null;
	// 第 18 変数初期値： i_l_EXTERNAL_PLAN_CD
	final static String i_l_EXTERNAL_PLAN_CD = null;
	// 第 19 変数初期値： i_MRP_TYP
	final static Integer i_MRP_TYP = null;
	// 第 20 変数初期値： i_OUTSIDE_TYP
	final static Integer i_OUTSIDE_TYP = null;
	// 第 21 変数初期値： i_l_RLSD_PUCH_ODR_QTY
	final static String i_l_RLSD_PUCH_ODR_QTY = null;
	// 第 22 変数初期値： i_l_WORK_IN_PROC_QTY
	final static String i_l_WORK_IN_PROC_QTY = null;
	// 第 23 変数初期値： i_OD_TYP
	final static Integer i_OD_TYP = null;
	// 第 24 変数初期値： i_l_OPR_RSLT_TYP
	final static Integer i_l_OPR_RSLT_TYP = null;
	// 第 25 変数初期値： i_l_ODR_STS_TYP_DN
	final static String i_l_ODR_STS_TYP_DN = null;
	// 第 26 変数初期値： i_l_MRP_ODR_TYP_DN
	final static String i_l_MRP_ODR_TYP_DN = null;
	// 第 27 変数初期値： i_l_JOB_ODR_TYP_DN
	final static String i_l_JOB_ODR_TYP_DN = null;
	// 第 28 変数初期値： i_l_OD_GNR_TYP_DN
	final static String i_l_OD_GNR_TYP_DN = null;
	// 第 29 変数初期値： i_PRD_DUE_DATE_FROM
	final static String i_PRD_DUE_DATE_FROM = null;
	// 第 30 変数初期値： i_PRD_DUE_DATE_TO
	final static String i_PRD_DUE_DATE_TO = null;
	// 第 31 変数初期値： i_PRD_START_DATE_FROM
	final static String i_PRD_START_DATE_FROM = null;
	// 第 32 変数初期値： i_PRD_START_DATE_TO
	final static String i_PRD_START_DATE_TO = null;
	// 第 33 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 34 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 35 変数初期値： i_ODR_STS_TYP_1
	final static String i_ODR_STS_TYP_1 = null;
	// 第 36 変数初期値： i_ODR_STS_TYP_2
	final static String i_ODR_STS_TYP_2 = null;
	// 第 37 変数初期値： i_ODR_STS_TYP_9_DELAYED
	final static String i_ODR_STS_TYP_9_DELAYED = null;
	// 第 38 変数初期値： i_BUSINESS_OPR_DATE_DELAYED
	final static String i_BUSINESS_OPR_DATE_DELAYED = null;
	// 第 39 変数初期値： i_ODR_STS_TYP_9_NOT_DELAYED
	final static String i_ODR_STS_TYP_9_NOT_DELAYED = null;
	// 第 40 変数初期値： i_BUSINESS_OPR_DATE_NOT_DELAYED
	final static String i_BUSINESS_OPR_DATE_NOT_DELAYED = null;
	// 第 41 変数初期値： i_ODR_STS_TYP_9
	final static String i_ODR_STS_TYP_9 = null;
	// 第 42 変数初期値： i_MRP_ODR_TYP_1
	final static String i_MRP_ODR_TYP_1 = null;
	// 第 43 変数初期値： i_MRP_ODR_TYP_2
	final static String i_MRP_ODR_TYP_2 = null;
	// 第 44 変数初期値： i_MRP_ODR_TYP_3
	final static String i_MRP_ODR_TYP_3 = null;
	// 第 45 変数初期値： i_MRP_ODR_TYP_4
	final static String i_MRP_ODR_TYP_4 = null;
	// 第 46 変数初期値： i_MRP_ODR_TYP_5
	final static String i_MRP_ODR_TYP_5 = null;
	// 第 47 変数初期値： i_MRP_ODR_TYP_6
	final static String i_MRP_ODR_TYP_6 = null;
	// 第 48 変数初期値： i_MRP_ODR_TYP_7
	final static String i_MRP_ODR_TYP_7 = null;
	// 第 49 変数初期値： i_MRP_ODR_TYP_8
	final static String i_MRP_ODR_TYP_8 = null;
	// 第 50 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 51 変数初期値： i_r1_MRP_ODR_TYP
	final static String i_r1_MRP_ODR_TYP = null;
	// 第 52 変数初期値： i_r2_MRP_ODR_TYP
	final static String i_r2_MRP_ODR_TYP = null;
	// 第 53 変数初期値： i_r3_MRP_ODR_TYP
	final static String i_r3_MRP_ODR_TYP = null;
	// 第 54 変数初期値： i_c1_PROGRESS_STS_TYP
	final static String i_c1_PROGRESS_STS_TYP = null;
	// 第 55 変数初期値： i_c2_PROGRESS_STS_TYP
	final static String i_c2_PROGRESS_STS_TYP = null;
	// 第 56 変数初期値： i_c1_ODR_STS_TYP
	final static String i_c1_ODR_STS_TYP = null;
	// 第 57 変数初期値： i_c2_ODR_STS_TYP
	final static String i_c2_ODR_STS_TYP = null;
	// 第 58 変数初期値： i_c3_ODR_STS_TYP
	final static String i_c3_ODR_STS_TYP = null;
	// 第 59 変数初期値： i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;
	// 第 60 変数初期値： i_l_PROGRESS_STATUS_DN
	final static String i_l_PROGRESS_STATUS_DN = null;
	// 第 61 変数初期値： i_l_OUTSIDE_TYP_DN
	final static String i_l_OUTSIDE_TYP_DN = null;
	// 第 62 変数初期値： i_l_PROGRESS_STATUS
	final static Integer i_l_PROGRESS_STATUS = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_l_OD_NO = i_l_OD_NO;
		m_l_ODR_STS_TYP = i_l_ODR_STS_TYP;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_MRP_ODR_TYP = i_l_MRP_ODR_TYP;
		m_l_ODR_START_DATE = i_l_ODR_START_DATE;
		m_l_PRD_START_DATE = i_l_PRD_START_DATE;
		m_l_PRD_DUE_DATE = i_l_PRD_DUE_DATE;
		m_OD_GNR_TYP = i_OD_GNR_TYP;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_TOTAL_RCV_QTY = i_l_TOTAL_RCV_QTY;
		m_l_RCV_CMPLT_DATE = i_l_RCV_CMPLT_DATE;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_JOB_ODR_CANCEL_NO = i_l_JOB_ODR_CANCEL_NO;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_EXTERNAL_DM_FLG = i_EXTERNAL_DM_FLG;
		m_l_EXTERNAL_PLAN_CD = i_l_EXTERNAL_PLAN_CD;
		m_MRP_TYP = i_MRP_TYP;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_l_RLSD_PUCH_ODR_QTY = i_l_RLSD_PUCH_ODR_QTY;
		m_l_WORK_IN_PROC_QTY = i_l_WORK_IN_PROC_QTY;
		m_OD_TYP = i_OD_TYP;
		m_l_OPR_RSLT_TYP = i_l_OPR_RSLT_TYP;
		m_l_ODR_STS_TYP_DN = i_l_ODR_STS_TYP_DN;
		m_l_MRP_ODR_TYP_DN = i_l_MRP_ODR_TYP_DN;
		m_l_JOB_ODR_TYP_DN = i_l_JOB_ODR_TYP_DN;
		m_l_OD_GNR_TYP_DN = i_l_OD_GNR_TYP_DN;
		m_PRD_DUE_DATE_FROM = i_PRD_DUE_DATE_FROM;
		m_PRD_DUE_DATE_TO = i_PRD_DUE_DATE_TO;
		m_PRD_START_DATE_FROM = i_PRD_START_DATE_FROM;
		m_PRD_START_DATE_TO = i_PRD_START_DATE_TO;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ODR_STS_TYP_1 = i_ODR_STS_TYP_1;
		m_ODR_STS_TYP_2 = i_ODR_STS_TYP_2;
		m_ODR_STS_TYP_9_DELAYED = i_ODR_STS_TYP_9_DELAYED;
		m_ODR_STS_TYP_9_NOT_DELAYED = i_ODR_STS_TYP_9_NOT_DELAYED;
		m_ODR_STS_TYP_9 = i_ODR_STS_TYP_9;
		m_MRP_ODR_TYP_1 = i_MRP_ODR_TYP_1;
		m_MRP_ODR_TYP_2 = i_MRP_ODR_TYP_2;
		m_MRP_ODR_TYP_3 = i_MRP_ODR_TYP_3;
		m_MRP_ODR_TYP_4 = i_MRP_ODR_TYP_4;
		m_MRP_ODR_TYP_5 = i_MRP_ODR_TYP_5;
		m_MRP_ODR_TYP_6 = i_MRP_ODR_TYP_6;
		m_MRP_ODR_TYP_7 = i_MRP_ODR_TYP_7;
		m_MRP_ODR_TYP_8 = i_MRP_ODR_TYP_8;
		m_PLANT_CD = i_PLANT_CD;
		m_r1_MRP_ODR_TYP = i_r1_MRP_ODR_TYP;
		m_r2_MRP_ODR_TYP = i_r2_MRP_ODR_TYP;
		m_r3_MRP_ODR_TYP = i_r3_MRP_ODR_TYP;
		m_c1_PROGRESS_STS_TYP = i_c1_PROGRESS_STS_TYP;
		m_c2_PROGRESS_STS_TYP = i_c2_PROGRESS_STS_TYP;
		m_c1_ODR_STS_TYP = i_c1_ODR_STS_TYP;
		m_c2_ODR_STS_TYP = i_c2_ODR_STS_TYP;
		m_c3_ODR_STS_TYP = i_c3_ODR_STS_TYP;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_PROGRESS_STATUS_DN = i_l_PROGRESS_STATUS_DN;
		m_l_OUTSIDE_TYP_DN = i_l_OUTSIDE_TYP_DN;
		m_l_PROGRESS_STATUS = i_l_PROGRESS_STATUS;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
