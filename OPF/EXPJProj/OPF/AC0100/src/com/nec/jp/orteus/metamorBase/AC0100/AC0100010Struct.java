/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/src/com/nec/jp/orteus/metamorBase/AC0100/AC0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0100;

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

public class AC0100010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 2 変数： m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** 第 3 変数： m_l_STOCK_ON_HAND_QTY */
	public String m_l_STOCK_ON_HAND_QTY = null;
	/** 第 4 変数： m_l_ODR_STS_TYP_DN */
	public String m_l_ODR_STS_TYP_DN = null;
	/** 第 5 変数： m_l_PRD_DUE_DATE */
	public String m_l_PRD_DUE_DATE = null;
	/** 第 6 変数： m_l_TOTAL_RCV_QTY */
	public String m_l_TOTAL_RCV_QTY = null;
	/** 第 7 変数： m_l_ODR_START_DATE */
	public String m_l_ODR_START_DATE = null;
	/** 第 8 変数： m_l_PRD_START_DATE */
	public String m_l_PRD_START_DATE = null;
	/** 第 9 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 10 変数： m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** 第 11 変数： m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** 第 12 変数： m_l_JOB_ODR_STS_TYP_DN */
	public String m_l_JOB_ODR_STS_TYP_DN = null;
	/** 第 13 変数： m_l_ODR_STS_TYP */
	public String m_l_ODR_STS_TYP = null;
	/** 第 14 変数： m_l_JOB_ODR_STS_TYP */
	public String m_l_JOB_ODR_STS_TYP = null;
	/** 第 15 変数： m_ALLOCATABLE_QTY */
	public String m_ALLOCATABLE_QTY = null;
	/** 第 16 変数： m_l_ALLOCATABLE_QTY */
	public String m_l_ALLOCATABLE_QTY = null;
	/** 第 17 変数： m_SUM_OF_ALLOCATABLE_QTY */
	public String m_SUM_OF_ALLOCATABLE_QTY = null;
	/** 第 18 変数： m_STOCK_UNIT_2 */
	public String m_STOCK_UNIT_2 = null;
	/** 第 19 変数： m_STOCK_UNIT_3 */
	public String m_STOCK_UNIT_3 = null;
	/** 第 20 変数： m_STOCK_UNIT_1 */
	public String m_STOCK_UNIT_1 = null;
	/** 第 21 変数： m_STOCK_UNIT_4 */
	public String m_STOCK_UNIT_4 = null;
	/** 第 22 変数： m_STOCK_UNIT_5 */
	public String m_STOCK_UNIT_5 = null;
	/** 第 23 変数： m_STOCK_UNIT_6 */
	public String m_STOCK_UNIT_6 = null;
	/** 第 24 変数： m_STOCK_UNIT_7 */
	public String m_STOCK_UNIT_7 = null;
	/** 第 25 変数： m_STOCK_UNIT_8 */
	public String m_STOCK_UNIT_8 = null;
	/** 第 26 変数： m_STOCK_UNIT_9 */
	public String m_STOCK_UNIT_9 = null;
	/** 第 27 変数： m_STOCK_UNIT_10 */
	public String m_STOCK_UNIT_10 = null;
	/** 第 28 変数： m_STOCK_UNIT_11 */
	public String m_STOCK_UNIT_11 = null;
	/** 第 29 変数： m_SUM_OF_ALC_REMAIN_QTY */
	public String m_SUM_OF_ALC_REMAIN_QTY = null;
	/** 第 30 変数： m_l_OD_NO */
	public String m_l_OD_NO = null;
	/** 第 31 変数： m_l_JOB_ODR_DETAIL_NO */
	public String m_l_JOB_ODR_DETAIL_NO = null;
	/** 第 32 変数： m_l_JOB_ODR_CANCEL_NO */
	public String m_l_JOB_ODR_CANCEL_NO = null;
	/** 第 33 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 34 変数： m_l_JOB_ODR_EXP_TYP */
	public String m_l_JOB_ODR_EXP_TYP = null;
	/** 第 35 変数： m_l_MRP_TYP */
	public String m_l_MRP_TYP = null;
	/** 第 36 変数： m_JOB_ODR_STS_TYP_2 */
	public String m_JOB_ODR_STS_TYP_2 = null;
	/** 第 37 変数： m_ALC_GRP_CD_2 */
	public String m_ALC_GRP_CD_2 = null;
	/** 第 38 変数： m_l_ALC_TYP_2 */
	public String m_l_ALC_TYP_2 = null;
	/** 第 39 変数： m_l_ALC_TYP_2_DN */
	public String m_l_ALC_TYP_2_DN = null;
	/** 第 40 変数： m_l_ISSUEED_QTY */
	public String m_l_ISSUEED_QTY = null;
	/** 第 41 変数： m_ALC_TYP_2 */
	public String m_ALC_TYP_2 = null;
	/** 第 42 変数： m_JOB_ODR_DETAIL_NO_2 */
	public String m_JOB_ODR_DETAIL_NO_2 = null;
	/** 第 43 変数： m_JOB_ODR_CANCEL_NO_2 */
	public String m_JOB_ODR_CANCEL_NO_2 = null;
	/** 第 44 変数： m_l_ISSUE_REMAIN_QTY */
	public String m_l_ISSUE_REMAIN_QTY = null;
	/** 第 45 変数： m_h_OD_NO */
	public String m_h_OD_NO = null;
	/** 第 46 変数： m_DM_STS_TYP_DN */
	public String m_DM_STS_TYP_DN = null;
	/** 第 47 変数： m_ODR_STS_TYP_DN */
	public String m_ODR_STS_TYP_DN = null;
	/** 第 48 変数： m_ALC_TYP_2_DN */
	public String m_ALC_TYP_2_DN = null;
	/** 第 49 変数： m_UNIT_QTY_TYP_DN */
	public String m_UNIT_QTY_TYP_DN = null;
	/** 第 50 変数： m_JOB_ODR_STS_TYP_DN_2 */
	public String m_JOB_ODR_STS_TYP_DN_2 = null;
	/** 第 51 変数： m_JOB_ODR_STS_TYP_DN */
	public String m_JOB_ODR_STS_TYP_DN = null;
	/** 第 52 変数： m_DUE_TIME */
	public String m_DUE_TIME = null;
	/** 第 53 変数： m_PRD_DUE_TIME */
	public String m_PRD_DUE_TIME = null;
	/** 第 54 変数： m_ODR_START_TIME */
	public String m_ODR_START_TIME = null;
	/** 第 55 変数： m_PRD_START_TIME */
	public String m_PRD_START_TIME = null;
	/** 第 56 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 57 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 58 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 59 変数： m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** 第 60 変数： m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** 第 61 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 62 変数： m_DM_QTY */
	public String m_DM_QTY = null;
	/** 第 63 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 64 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 65 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 66 変数： m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** 第 67 変数： m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** 第 68 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 69 変数： m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** 第 70 変数： m_OD_CALC_FLG */
	public String m_OD_CALC_FLG = null;
	/** 第 71 変数： m_JOB_ODR_EXP_TYP */
	public String m_JOB_ODR_EXP_TYP = null;
	/** 第 72 変数： m_MRP_TYP */
	public String m_MRP_TYP = null;
	/** 第 73 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 74 変数： m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** 第 75 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 76 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 77 変数： m_SUM_OF_WORK_IN_PROC_QTY */
	public String m_SUM_OF_WORK_IN_PROC_QTY = null;
	/** 第 78 変数： m_TOTAL_RCV_QTY */
	public String m_TOTAL_RCV_QTY = null;
	/** 第 79 変数： m_ODR_STS_TYP */
	public String m_ODR_STS_TYP = null;
	/** 第 80 変数： m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** 第 81 変数： m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** 第 82 変数： m_PRD_START_DATE */
	public String m_PRD_START_DATE = null;
	/** 第 83 変数： m_OD_MNT_FLG */
	public String m_OD_MNT_FLG = null;
	/** 第 84 変数： m_JOB_ODR_ALC_CD */
	public String m_JOB_ODR_ALC_CD = null;
	/** 第 85 変数： m_ALC_STOCK_TYP */
	public String m_ALC_STOCK_TYP = null;
	/** 第 86 変数： m_ALCD_QTY */
	public String m_ALCD_QTY = null;
	/** 第 87 変数： m_ISSUEED_QTY */
	public String m_ISSUEED_QTY = null;
	/** 第 88 変数： m_ISSUE_CMPLT_FLG */
	public String m_ISSUE_CMPLT_FLG = null;
	/** 第 89 変数： m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** 第 90 変数： m_SUM_OF_ISSUEED_QTY */
	public String m_SUM_OF_ISSUEED_QTY = null;
	/** 第 91 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 92 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 93 変数： m_ISSUE_REMAIN_QTY */
	public String m_ISSUE_REMAIN_QTY = null;
	/** 第 94 変数： m_OD_GNR_TYP */
	public String m_OD_GNR_TYP = null;
	/** 第 95 変数： m_SUM_OF_ISSUED_QTY */
	public String m_SUM_OF_ISSUED_QTY = null;
	/** 第 96 変数： m_SUM_OF_STOCK_ON_HAND_QTY */
	public String m_SUM_OF_STOCK_ON_HAND_QTY = null;
	/** 第 97 変数： m_SUM_OF_ALCD_QTY */
	public String m_SUM_OF_ALCD_QTY = null;
	/** 第 98 変数： m_JOB_ODR_CD_2 */
	public String m_JOB_ODR_CD_2 = null;
	/** 第 99 変数： m_SEL_OD_NO */
	public String m_SEL_OD_NO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 2 List変数： l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** 第 3 List変数： l_l_STOCK_ON_HAND_QTY */
	public List l_l_STOCK_ON_HAND_QTY = null;

	/** 第 4 List変数： l_l_ODR_STS_TYP_DN */
	public List l_l_ODR_STS_TYP_DN = null;

	/** 第 5 List変数： l_l_PRD_DUE_DATE */
	public List l_l_PRD_DUE_DATE = null;

	/** 第 6 List変数： l_l_TOTAL_RCV_QTY */
	public List l_l_TOTAL_RCV_QTY = null;

	/** 第 7 List変数： l_l_ODR_START_DATE */
	public List l_l_ODR_START_DATE = null;

	/** 第 8 List変数： l_l_PRD_START_DATE */
	public List l_l_PRD_START_DATE = null;

	/** 第 9 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 10 List変数： l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** 第 11 List変数： l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** 第 12 List変数： l_l_JOB_ODR_STS_TYP_DN */
	public List l_l_JOB_ODR_STS_TYP_DN = null;

	/** 第 13 List変数： l_l_ODR_STS_TYP */
	public List l_l_ODR_STS_TYP = null;

	/** 第 14 List変数： l_l_JOB_ODR_STS_TYP */
	public List l_l_JOB_ODR_STS_TYP = null;

	/** 第 15 List変数： l_ALLOCATABLE_QTY */
	public List l_ALLOCATABLE_QTY = null;

	/** 第 16 List変数： l_l_ALLOCATABLE_QTY */
	public List l_l_ALLOCATABLE_QTY = null;

	/** 第 17 List変数： l_SUM_OF_ALLOCATABLE_QTY */
	public List l_SUM_OF_ALLOCATABLE_QTY = null;

	/** 第 18 List変数： l_STOCK_UNIT_2 */
	public List l_STOCK_UNIT_2 = null;

	/** 第 19 List変数： l_STOCK_UNIT_3 */
	public List l_STOCK_UNIT_3 = null;

	/** 第 20 List変数： l_STOCK_UNIT_1 */
	public List l_STOCK_UNIT_1 = null;

	/** 第 21 List変数： l_STOCK_UNIT_4 */
	public List l_STOCK_UNIT_4 = null;

	/** 第 22 List変数： l_STOCK_UNIT_5 */
	public List l_STOCK_UNIT_5 = null;

	/** 第 23 List変数： l_STOCK_UNIT_6 */
	public List l_STOCK_UNIT_6 = null;

	/** 第 24 List変数： l_STOCK_UNIT_7 */
	public List l_STOCK_UNIT_7 = null;

	/** 第 25 List変数： l_STOCK_UNIT_8 */
	public List l_STOCK_UNIT_8 = null;

	/** 第 26 List変数： l_STOCK_UNIT_9 */
	public List l_STOCK_UNIT_9 = null;

	/** 第 27 List変数： l_STOCK_UNIT_10 */
	public List l_STOCK_UNIT_10 = null;

	/** 第 28 List変数： l_STOCK_UNIT_11 */
	public List l_STOCK_UNIT_11 = null;

	/** 第 29 List変数： l_SUM_OF_ALC_REMAIN_QTY */
	public List l_SUM_OF_ALC_REMAIN_QTY = null;

	/** 第 30 List変数： l_l_OD_NO */
	public List l_l_OD_NO = null;

	/** 第 31 List変数： l_l_JOB_ODR_DETAIL_NO */
	public List l_l_JOB_ODR_DETAIL_NO = null;

	/** 第 32 List変数： l_l_JOB_ODR_CANCEL_NO */
	public List l_l_JOB_ODR_CANCEL_NO = null;

	/** 第 33 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 34 List変数： l_l_JOB_ODR_EXP_TYP */
	public List l_l_JOB_ODR_EXP_TYP = null;

	/** 第 35 List変数： l_l_MRP_TYP */
	public List l_l_MRP_TYP = null;

	/** 第 36 List変数： l_JOB_ODR_STS_TYP_2 */
	public List l_JOB_ODR_STS_TYP_2 = null;

	/** 第 37 List変数： l_ALC_GRP_CD_2 */
	public List l_ALC_GRP_CD_2 = null;

	/** 第 38 List変数： l_l_ALC_TYP_2 */
	public List l_l_ALC_TYP_2 = null;

	/** 第 39 List変数： l_l_ALC_TYP_2_DN */
	public List l_l_ALC_TYP_2_DN = null;

	/** 第 40 List変数： l_l_ISSUEED_QTY */
	public List l_l_ISSUEED_QTY = null;

	/** 第 41 List変数： l_ALC_TYP_2 */
	public List l_ALC_TYP_2 = null;

	/** 第 42 List変数： l_JOB_ODR_DETAIL_NO_2 */
	public List l_JOB_ODR_DETAIL_NO_2 = null;

	/** 第 43 List変数： l_JOB_ODR_CANCEL_NO_2 */
	public List l_JOB_ODR_CANCEL_NO_2 = null;

	/** 第 44 List変数： l_l_ISSUE_REMAIN_QTY */
	public List l_l_ISSUE_REMAIN_QTY = null;

	/** 第 45 List変数： l_h_OD_NO */
	public List l_h_OD_NO = null;

	/** 第 46 List変数： l_DM_STS_TYP_DN */
	public List l_DM_STS_TYP_DN = null;

	/** 第 47 List変数： l_ODR_STS_TYP_DN */
	public List l_ODR_STS_TYP_DN = null;

	/** 第 48 List変数： l_ALC_TYP_2_DN */
	public List l_ALC_TYP_2_DN = null;

	/** 第 49 List変数： l_UNIT_QTY_TYP_DN */
	public List l_UNIT_QTY_TYP_DN = null;

	/** 第 50 List変数： l_JOB_ODR_STS_TYP_DN_2 */
	public List l_JOB_ODR_STS_TYP_DN_2 = null;

	/** 第 51 List変数： l_JOB_ODR_STS_TYP_DN */
	public List l_JOB_ODR_STS_TYP_DN = null;

	/** 第 52 List変数： l_DUE_TIME */
	public List l_DUE_TIME = null;

	/** 第 53 List変数： l_PRD_DUE_TIME */
	public List l_PRD_DUE_TIME = null;

	/** 第 54 List変数： l_ODR_START_TIME */
	public List l_ODR_START_TIME = null;

	/** 第 55 List変数： l_PRD_START_TIME */
	public List l_PRD_START_TIME = null;

	/** 第 56 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 57 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 58 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 59 List変数： l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** 第 60 List変数： l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** 第 61 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 62 List変数： l_DM_QTY */
	public List l_DM_QTY = null;

	/** 第 63 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 64 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 65 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 66 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 67 List変数： l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** 第 68 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 69 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 70 List変数： l_OD_CALC_FLG */
	public List l_OD_CALC_FLG = null;

	/** 第 71 List変数： l_JOB_ODR_EXP_TYP */
	public List l_JOB_ODR_EXP_TYP = null;

	/** 第 72 List変数： l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** 第 73 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 74 List変数： l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** 第 75 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 76 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 77 List変数： l_SUM_OF_WORK_IN_PROC_QTY */
	public List l_SUM_OF_WORK_IN_PROC_QTY = null;

	/** 第 78 List変数： l_TOTAL_RCV_QTY */
	public List l_TOTAL_RCV_QTY = null;

	/** 第 79 List変数： l_ODR_STS_TYP */
	public List l_ODR_STS_TYP = null;

	/** 第 80 List変数： l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** 第 81 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 82 List変数： l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** 第 83 List変数： l_OD_MNT_FLG */
	public List l_OD_MNT_FLG = null;

	/** 第 84 List変数： l_JOB_ODR_ALC_CD */
	public List l_JOB_ODR_ALC_CD = null;

	/** 第 85 List変数： l_ALC_STOCK_TYP */
	public List l_ALC_STOCK_TYP = null;

	/** 第 86 List変数： l_ALCD_QTY */
	public List l_ALCD_QTY = null;

	/** 第 87 List変数： l_ISSUEED_QTY */
	public List l_ISSUEED_QTY = null;

	/** 第 88 List変数： l_ISSUE_CMPLT_FLG */
	public List l_ISSUE_CMPLT_FLG = null;

	/** 第 89 List変数： l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** 第 90 List変数： l_SUM_OF_ISSUEED_QTY */
	public List l_SUM_OF_ISSUEED_QTY = null;

	/** 第 91 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 92 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 93 List変数： l_ISSUE_REMAIN_QTY */
	public List l_ISSUE_REMAIN_QTY = null;

	/** 第 94 List変数： l_OD_GNR_TYP */
	public List l_OD_GNR_TYP = null;

	/** 第 95 List変数： l_SUM_OF_ISSUED_QTY */
	public List l_SUM_OF_ISSUED_QTY = null;

	/** 第 96 List変数： l_SUM_OF_STOCK_ON_HAND_QTY */
	public List l_SUM_OF_STOCK_ON_HAND_QTY = null;

	/** 第 97 List変数： l_SUM_OF_ALCD_QTY */
	public List l_SUM_OF_ALCD_QTY = null;

	/** 第 98 List変数： l_JOB_ODR_CD_2 */
	public List l_JOB_ODR_CD_2 = null;

	/** 第 99 List変数： l_SEL_OD_NO */
	public List l_SEL_OD_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getl_STOCK_ON_HAND_QTY() { return m_l_STOCK_ON_HAND_QTY; }
	public String getl_ODR_STS_TYP_DN() { return m_l_ODR_STS_TYP_DN; }
	public String getl_PRD_DUE_DATE() { return m_l_PRD_DUE_DATE; }
	public String getl_TOTAL_RCV_QTY() { return m_l_TOTAL_RCV_QTY; }
	public String getl_ODR_START_DATE() { return m_l_ODR_START_DATE; }
	public String getl_PRD_START_DATE() { return m_l_PRD_START_DATE; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_JOB_ODR_STS_TYP_DN() { return m_l_JOB_ODR_STS_TYP_DN; }
	public String getl_ODR_STS_TYP() { return m_l_ODR_STS_TYP; }
	public String getl_JOB_ODR_STS_TYP() { return m_l_JOB_ODR_STS_TYP; }
	public String getALLOCATABLE_QTY() { return m_ALLOCATABLE_QTY; }
	public String getl_ALLOCATABLE_QTY() { return m_l_ALLOCATABLE_QTY; }
	public String getSUM_OF_ALLOCATABLE_QTY() { return m_SUM_OF_ALLOCATABLE_QTY; }
	public String getSTOCK_UNIT_2() { return m_STOCK_UNIT_2; }
	public String getSTOCK_UNIT_3() { return m_STOCK_UNIT_3; }
	public String getSTOCK_UNIT_1() { return m_STOCK_UNIT_1; }
	public String getSTOCK_UNIT_4() { return m_STOCK_UNIT_4; }
	public String getSTOCK_UNIT_5() { return m_STOCK_UNIT_5; }
	public String getSTOCK_UNIT_6() { return m_STOCK_UNIT_6; }
	public String getSTOCK_UNIT_7() { return m_STOCK_UNIT_7; }
	public String getSTOCK_UNIT_8() { return m_STOCK_UNIT_8; }
	public String getSTOCK_UNIT_9() { return m_STOCK_UNIT_9; }
	public String getSTOCK_UNIT_10() { return m_STOCK_UNIT_10; }
	public String getSTOCK_UNIT_11() { return m_STOCK_UNIT_11; }
	public String getSUM_OF_ALC_REMAIN_QTY() { return m_SUM_OF_ALC_REMAIN_QTY; }
	public String getl_OD_NO() { return m_l_OD_NO; }
	public String getl_JOB_ODR_DETAIL_NO() { return m_l_JOB_ODR_DETAIL_NO; }
	public String getl_JOB_ODR_CANCEL_NO() { return m_l_JOB_ODR_CANCEL_NO; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_JOB_ODR_EXP_TYP() { return m_l_JOB_ODR_EXP_TYP; }
	public String getl_MRP_TYP() { return m_l_MRP_TYP; }
	public String getJOB_ODR_STS_TYP_2() { return m_JOB_ODR_STS_TYP_2; }
	public String getALC_GRP_CD_2() { return m_ALC_GRP_CD_2; }
	public String getl_ALC_TYP_2() { return m_l_ALC_TYP_2; }
	public String getl_ALC_TYP_2_DN() { return m_l_ALC_TYP_2_DN; }
	public String getl_ISSUEED_QTY() { return m_l_ISSUEED_QTY; }
	public String getALC_TYP_2() { return m_ALC_TYP_2; }
	public String getJOB_ODR_DETAIL_NO_2() { return m_JOB_ODR_DETAIL_NO_2; }
	public String getJOB_ODR_CANCEL_NO_2() { return m_JOB_ODR_CANCEL_NO_2; }
	public String getl_ISSUE_REMAIN_QTY() { return m_l_ISSUE_REMAIN_QTY; }
	public String geth_OD_NO() { return m_h_OD_NO; }
	public String getDM_STS_TYP_DN() { return m_DM_STS_TYP_DN; }
	public String getODR_STS_TYP_DN() { return m_ODR_STS_TYP_DN; }
	public String getALC_TYP_2_DN() { return m_ALC_TYP_2_DN; }
	public String getUNIT_QTY_TYP_DN() { return m_UNIT_QTY_TYP_DN; }
	public String getJOB_ODR_STS_TYP_DN_2() { return m_JOB_ODR_STS_TYP_DN_2; }
	public String getJOB_ODR_STS_TYP_DN() { return m_JOB_ODR_STS_TYP_DN; }
	public String getDUE_TIME() { return m_DUE_TIME; }
	public String getPRD_DUE_TIME() { return m_PRD_DUE_TIME; }
	public String getODR_START_TIME() { return m_ODR_START_TIME; }
	public String getPRD_START_TIME() { return m_PRD_START_TIME; }
	public String getOD_NO() { return m_OD_NO; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getOD_CALC_FLG() { return m_OD_CALC_FLG; }
	public String getJOB_ODR_EXP_TYP() { return m_JOB_ODR_EXP_TYP; }
	public String getMRP_TYP() { return m_MRP_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getSUM_OF_WORK_IN_PROC_QTY() { return m_SUM_OF_WORK_IN_PROC_QTY; }
	public String getTOTAL_RCV_QTY() { return m_TOTAL_RCV_QTY; }
	public String getODR_STS_TYP() { return m_ODR_STS_TYP; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getOD_MNT_FLG() { return m_OD_MNT_FLG; }
	public String getJOB_ODR_ALC_CD() { return m_JOB_ODR_ALC_CD; }
	public String getALC_STOCK_TYP() { return m_ALC_STOCK_TYP; }
	public String getALCD_QTY() { return m_ALCD_QTY; }
	public String getISSUEED_QTY() { return m_ISSUEED_QTY; }
	public String getISSUE_CMPLT_FLG() { return m_ISSUE_CMPLT_FLG; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getSUM_OF_ISSUEED_QTY() { return m_SUM_OF_ISSUEED_QTY; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getISSUE_REMAIN_QTY() { return m_ISSUE_REMAIN_QTY; }
	public String getOD_GNR_TYP() { return m_OD_GNR_TYP; }
	public String getSUM_OF_ISSUED_QTY() { return m_SUM_OF_ISSUED_QTY; }
	public String getSUM_OF_STOCK_ON_HAND_QTY() { return m_SUM_OF_STOCK_ON_HAND_QTY; }
	public String getSUM_OF_ALCD_QTY() { return m_SUM_OF_ALCD_QTY; }
	public String getJOB_ODR_CD_2() { return m_JOB_ODR_CD_2; }
	public String getSEL_OD_NO() { return m_SEL_OD_NO; }

	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_l_STOCK_ON_HAND_QTY() { return l_l_STOCK_ON_HAND_QTY; }
	public List getList_l_ODR_STS_TYP_DN() { return l_l_ODR_STS_TYP_DN; }
	public List getList_l_PRD_DUE_DATE() { return l_l_PRD_DUE_DATE; }
	public List getList_l_TOTAL_RCV_QTY() { return l_l_TOTAL_RCV_QTY; }
	public List getList_l_ODR_START_DATE() { return l_l_ODR_START_DATE; }
	public List getList_l_PRD_START_DATE() { return l_l_PRD_START_DATE; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_JOB_ODR_STS_TYP_DN() { return l_l_JOB_ODR_STS_TYP_DN; }
	public List getList_l_ODR_STS_TYP() { return l_l_ODR_STS_TYP; }
	public List getList_l_JOB_ODR_STS_TYP() { return l_l_JOB_ODR_STS_TYP; }
	public List getList_ALLOCATABLE_QTY() { return l_ALLOCATABLE_QTY; }
	public List getList_l_ALLOCATABLE_QTY() { return l_l_ALLOCATABLE_QTY; }
	public List getList_SUM_OF_ALLOCATABLE_QTY() { return l_SUM_OF_ALLOCATABLE_QTY; }
	public List getList_STOCK_UNIT_2() { return l_STOCK_UNIT_2; }
	public List getList_STOCK_UNIT_3() { return l_STOCK_UNIT_3; }
	public List getList_STOCK_UNIT_1() { return l_STOCK_UNIT_1; }
	public List getList_STOCK_UNIT_4() { return l_STOCK_UNIT_4; }
	public List getList_STOCK_UNIT_5() { return l_STOCK_UNIT_5; }
	public List getList_STOCK_UNIT_6() { return l_STOCK_UNIT_6; }
	public List getList_STOCK_UNIT_7() { return l_STOCK_UNIT_7; }
	public List getList_STOCK_UNIT_8() { return l_STOCK_UNIT_8; }
	public List getList_STOCK_UNIT_9() { return l_STOCK_UNIT_9; }
	public List getList_STOCK_UNIT_10() { return l_STOCK_UNIT_10; }
	public List getList_STOCK_UNIT_11() { return l_STOCK_UNIT_11; }
	public List getList_SUM_OF_ALC_REMAIN_QTY() { return l_SUM_OF_ALC_REMAIN_QTY; }
	public List getList_l_OD_NO() { return l_l_OD_NO; }
	public List getList_l_JOB_ODR_DETAIL_NO() { return l_l_JOB_ODR_DETAIL_NO; }
	public List getList_l_JOB_ODR_CANCEL_NO() { return l_l_JOB_ODR_CANCEL_NO; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_JOB_ODR_EXP_TYP() { return l_l_JOB_ODR_EXP_TYP; }
	public List getList_l_MRP_TYP() { return l_l_MRP_TYP; }
	public List getList_JOB_ODR_STS_TYP_2() { return l_JOB_ODR_STS_TYP_2; }
	public List getList_ALC_GRP_CD_2() { return l_ALC_GRP_CD_2; }
	public List getList_l_ALC_TYP_2() { return l_l_ALC_TYP_2; }
	public List getList_l_ALC_TYP_2_DN() { return l_l_ALC_TYP_2_DN; }
	public List getList_l_ISSUEED_QTY() { return l_l_ISSUEED_QTY; }
	public List getList_ALC_TYP_2() { return l_ALC_TYP_2; }
	public List getList_JOB_ODR_DETAIL_NO_2() { return l_JOB_ODR_DETAIL_NO_2; }
	public List getList_JOB_ODR_CANCEL_NO_2() { return l_JOB_ODR_CANCEL_NO_2; }
	public List getList_l_ISSUE_REMAIN_QTY() { return l_l_ISSUE_REMAIN_QTY; }
	public List getList_h_OD_NO() { return l_h_OD_NO; }
	public List getList_DM_STS_TYP_DN() { return l_DM_STS_TYP_DN; }
	public List getList_ODR_STS_TYP_DN() { return l_ODR_STS_TYP_DN; }
	public List getList_ALC_TYP_2_DN() { return l_ALC_TYP_2_DN; }
	public List getList_UNIT_QTY_TYP_DN() { return l_UNIT_QTY_TYP_DN; }
	public List getList_JOB_ODR_STS_TYP_DN_2() { return l_JOB_ODR_STS_TYP_DN_2; }
	public List getList_JOB_ODR_STS_TYP_DN() { return l_JOB_ODR_STS_TYP_DN; }
	public List getList_DUE_TIME() { return l_DUE_TIME; }
	public List getList_PRD_DUE_TIME() { return l_PRD_DUE_TIME; }
	public List getList_ODR_START_TIME() { return l_ODR_START_TIME; }
	public List getList_PRD_START_TIME() { return l_PRD_START_TIME; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_OD_CALC_FLG() { return l_OD_CALC_FLG; }
	public List getList_JOB_ODR_EXP_TYP() { return l_JOB_ODR_EXP_TYP; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_SUM_OF_WORK_IN_PROC_QTY() { return l_SUM_OF_WORK_IN_PROC_QTY; }
	public List getList_TOTAL_RCV_QTY() { return l_TOTAL_RCV_QTY; }
	public List getList_ODR_STS_TYP() { return l_ODR_STS_TYP; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_OD_MNT_FLG() { return l_OD_MNT_FLG; }
	public List getList_JOB_ODR_ALC_CD() { return l_JOB_ODR_ALC_CD; }
	public List getList_ALC_STOCK_TYP() { return l_ALC_STOCK_TYP; }
	public List getList_ALCD_QTY() { return l_ALCD_QTY; }
	public List getList_ISSUEED_QTY() { return l_ISSUEED_QTY; }
	public List getList_ISSUE_CMPLT_FLG() { return l_ISSUE_CMPLT_FLG; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_SUM_OF_ISSUEED_QTY() { return l_SUM_OF_ISSUEED_QTY; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_ISSUE_REMAIN_QTY() { return l_ISSUE_REMAIN_QTY; }
	public List getList_OD_GNR_TYP() { return l_OD_GNR_TYP; }
	public List getList_SUM_OF_ISSUED_QTY() { return l_SUM_OF_ISSUED_QTY; }
	public List getList_SUM_OF_STOCK_ON_HAND_QTY() { return l_SUM_OF_STOCK_ON_HAND_QTY; }
	public List getList_SUM_OF_ALCD_QTY() { return l_SUM_OF_ALCD_QTY; }
	public List getList_JOB_ODR_CD_2() { return l_JOB_ODR_CD_2; }
	public List getList_SEL_OD_NO() { return l_SEL_OD_NO; }

	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setl_STOCK_ON_HAND_QTY(String val) { m_l_STOCK_ON_HAND_QTY = val; }
	public void setl_ODR_STS_TYP_DN(String val) { m_l_ODR_STS_TYP_DN = val; }
	public void setl_PRD_DUE_DATE(String val) { m_l_PRD_DUE_DATE = val; }
	public void setl_TOTAL_RCV_QTY(String val) { m_l_TOTAL_RCV_QTY = val; }
	public void setl_ODR_START_DATE(String val) { m_l_ODR_START_DATE = val; }
	public void setl_PRD_START_DATE(String val) { m_l_PRD_START_DATE = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_JOB_ODR_STS_TYP_DN(String val) { m_l_JOB_ODR_STS_TYP_DN = val; }
	public void setl_ODR_STS_TYP(String val) { m_l_ODR_STS_TYP = val; }
	public void setl_JOB_ODR_STS_TYP(String val) { m_l_JOB_ODR_STS_TYP = val; }
	public void setALLOCATABLE_QTY(String val) { m_ALLOCATABLE_QTY = val; }
	public void setl_ALLOCATABLE_QTY(String val) { m_l_ALLOCATABLE_QTY = val; }
	public void setSUM_OF_ALLOCATABLE_QTY(String val) { m_SUM_OF_ALLOCATABLE_QTY = val; }
	public void setSTOCK_UNIT_2(String val) { m_STOCK_UNIT_2 = val; }
	public void setSTOCK_UNIT_3(String val) { m_STOCK_UNIT_3 = val; }
	public void setSTOCK_UNIT_1(String val) { m_STOCK_UNIT_1 = val; }
	public void setSTOCK_UNIT_4(String val) { m_STOCK_UNIT_4 = val; }
	public void setSTOCK_UNIT_5(String val) { m_STOCK_UNIT_5 = val; }
	public void setSTOCK_UNIT_6(String val) { m_STOCK_UNIT_6 = val; }
	public void setSTOCK_UNIT_7(String val) { m_STOCK_UNIT_7 = val; }
	public void setSTOCK_UNIT_8(String val) { m_STOCK_UNIT_8 = val; }
	public void setSTOCK_UNIT_9(String val) { m_STOCK_UNIT_9 = val; }
	public void setSTOCK_UNIT_10(String val) { m_STOCK_UNIT_10 = val; }
	public void setSTOCK_UNIT_11(String val) { m_STOCK_UNIT_11 = val; }
	public void setSUM_OF_ALC_REMAIN_QTY(String val) { m_SUM_OF_ALC_REMAIN_QTY = val; }
	public void setl_OD_NO(String val) { m_l_OD_NO = val; }
	public void setl_JOB_ODR_DETAIL_NO(String val) { m_l_JOB_ODR_DETAIL_NO = val; }
	public void setl_JOB_ODR_CANCEL_NO(String val) { m_l_JOB_ODR_CANCEL_NO = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_JOB_ODR_EXP_TYP(String val) { m_l_JOB_ODR_EXP_TYP = val; }
	public void setl_MRP_TYP(String val) { m_l_MRP_TYP = val; }
	public void setJOB_ODR_STS_TYP_2(String val) { m_JOB_ODR_STS_TYP_2 = val; }
	public void setALC_GRP_CD_2(String val) { m_ALC_GRP_CD_2 = val; }
	public void setl_ALC_TYP_2(String val) { m_l_ALC_TYP_2 = val; }
	public void setl_ALC_TYP_2_DN(String val) { m_l_ALC_TYP_2_DN = val; }
	public void setl_ISSUEED_QTY(String val) { m_l_ISSUEED_QTY = val; }
	public void setALC_TYP_2(String val) { m_ALC_TYP_2 = val; }
	public void setJOB_ODR_DETAIL_NO_2(String val) { m_JOB_ODR_DETAIL_NO_2 = val; }
	public void setJOB_ODR_CANCEL_NO_2(String val) { m_JOB_ODR_CANCEL_NO_2 = val; }
	public void setl_ISSUE_REMAIN_QTY(String val) { m_l_ISSUE_REMAIN_QTY = val; }
	public void seth_OD_NO(String val) { m_h_OD_NO = val; }
	public void setDM_STS_TYP_DN(String val) { m_DM_STS_TYP_DN = val; }
	public void setODR_STS_TYP_DN(String val) { m_ODR_STS_TYP_DN = val; }
	public void setALC_TYP_2_DN(String val) { m_ALC_TYP_2_DN = val; }
	public void setUNIT_QTY_TYP_DN(String val) { m_UNIT_QTY_TYP_DN = val; }
	public void setJOB_ODR_STS_TYP_DN_2(String val) { m_JOB_ODR_STS_TYP_DN_2 = val; }
	public void setJOB_ODR_STS_TYP_DN(String val) { m_JOB_ODR_STS_TYP_DN = val; }
	public void setDUE_TIME(String val) { m_DUE_TIME = val; }
	public void setPRD_DUE_TIME(String val) { m_PRD_DUE_TIME = val; }
	public void setODR_START_TIME(String val) { m_ODR_START_TIME = val; }
	public void setPRD_START_TIME(String val) { m_PRD_START_TIME = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setOD_CALC_FLG(String val) { m_OD_CALC_FLG = val; }
	public void setJOB_ODR_EXP_TYP(String val) { m_JOB_ODR_EXP_TYP = val; }
	public void setMRP_TYP(String val) { m_MRP_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setSUM_OF_WORK_IN_PROC_QTY(String val) { m_SUM_OF_WORK_IN_PROC_QTY = val; }
	public void setTOTAL_RCV_QTY(String val) { m_TOTAL_RCV_QTY = val; }
	public void setODR_STS_TYP(String val) { m_ODR_STS_TYP = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }
	public void setOD_MNT_FLG(String val) { m_OD_MNT_FLG = val; }
	public void setJOB_ODR_ALC_CD(String val) { m_JOB_ODR_ALC_CD = val; }
	public void setALC_STOCK_TYP(String val) { m_ALC_STOCK_TYP = val; }
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	public void setISSUEED_QTY(String val) { m_ISSUEED_QTY = val; }
	public void setISSUE_CMPLT_FLG(String val) { m_ISSUE_CMPLT_FLG = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setSUM_OF_ISSUEED_QTY(String val) { m_SUM_OF_ISSUEED_QTY = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setISSUE_REMAIN_QTY(String val) { m_ISSUE_REMAIN_QTY = val; }
	public void setOD_GNR_TYP(String val) { m_OD_GNR_TYP = val; }
	public void setSUM_OF_ISSUED_QTY(String val) { m_SUM_OF_ISSUED_QTY = val; }
	public void setSUM_OF_STOCK_ON_HAND_QTY(String val) { m_SUM_OF_STOCK_ON_HAND_QTY = val; }
	public void setSUM_OF_ALCD_QTY(String val) { m_SUM_OF_ALCD_QTY = val; }
	public void setJOB_ODR_CD_2(String val) { m_JOB_ODR_CD_2 = val; }
	public void setSEL_OD_NO(String val) { m_SEL_OD_NO = val; }


	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_l_STOCK_ON_HAND_QTY(List list) { l_l_STOCK_ON_HAND_QTY = list; }
	public void setList_l_ODR_STS_TYP_DN(List list) { l_l_ODR_STS_TYP_DN = list; }
	public void setList_l_PRD_DUE_DATE(List list) { l_l_PRD_DUE_DATE = list; }
	public void setList_l_TOTAL_RCV_QTY(List list) { l_l_TOTAL_RCV_QTY = list; }
	public void setList_l_ODR_START_DATE(List list) { l_l_ODR_START_DATE = list; }
	public void setList_l_PRD_START_DATE(List list) { l_l_PRD_START_DATE = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_JOB_ODR_STS_TYP_DN(List list) { l_l_JOB_ODR_STS_TYP_DN = list; }
	public void setList_l_ODR_STS_TYP(List list) { l_l_ODR_STS_TYP = list; }
	public void setList_l_JOB_ODR_STS_TYP(List list) { l_l_JOB_ODR_STS_TYP = list; }
	public void setList_ALLOCATABLE_QTY(List list) { l_ALLOCATABLE_QTY = list; }
	public void setList_l_ALLOCATABLE_QTY(List list) { l_l_ALLOCATABLE_QTY = list; }
	public void setList_SUM_OF_ALLOCATABLE_QTY(List list) { l_SUM_OF_ALLOCATABLE_QTY = list; }
	public void setList_STOCK_UNIT_2(List list) { l_STOCK_UNIT_2 = list; }
	public void setList_STOCK_UNIT_3(List list) { l_STOCK_UNIT_3 = list; }
	public void setList_STOCK_UNIT_1(List list) { l_STOCK_UNIT_1 = list; }
	public void setList_STOCK_UNIT_4(List list) { l_STOCK_UNIT_4 = list; }
	public void setList_STOCK_UNIT_5(List list) { l_STOCK_UNIT_5 = list; }
	public void setList_STOCK_UNIT_6(List list) { l_STOCK_UNIT_6 = list; }
	public void setList_STOCK_UNIT_7(List list) { l_STOCK_UNIT_7 = list; }
	public void setList_STOCK_UNIT_8(List list) { l_STOCK_UNIT_8 = list; }
	public void setList_STOCK_UNIT_9(List list) { l_STOCK_UNIT_9 = list; }
	public void setList_STOCK_UNIT_10(List list) { l_STOCK_UNIT_10 = list; }
	public void setList_STOCK_UNIT_11(List list) { l_STOCK_UNIT_11 = list; }
	public void setList_SUM_OF_ALC_REMAIN_QTY(List list) { l_SUM_OF_ALC_REMAIN_QTY = list; }
	public void setList_l_OD_NO(List list) { l_l_OD_NO = list; }
	public void setList_l_JOB_ODR_DETAIL_NO(List list) { l_l_JOB_ODR_DETAIL_NO = list; }
	public void setList_l_JOB_ODR_CANCEL_NO(List list) { l_l_JOB_ODR_CANCEL_NO = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_JOB_ODR_EXP_TYP(List list) { l_l_JOB_ODR_EXP_TYP = list; }
	public void setList_l_MRP_TYP(List list) { l_l_MRP_TYP = list; }
	public void setList_JOB_ODR_STS_TYP_2(List list) { l_JOB_ODR_STS_TYP_2 = list; }
	public void setList_ALC_GRP_CD_2(List list) { l_ALC_GRP_CD_2 = list; }
	public void setList_l_ALC_TYP_2(List list) { l_l_ALC_TYP_2 = list; }
	public void setList_l_ALC_TYP_2_DN(List list) { l_l_ALC_TYP_2_DN = list; }
	public void setList_l_ISSUEED_QTY(List list) { l_l_ISSUEED_QTY = list; }
	public void setList_ALC_TYP_2(List list) { l_ALC_TYP_2 = list; }
	public void setList_JOB_ODR_DETAIL_NO_2(List list) { l_JOB_ODR_DETAIL_NO_2 = list; }
	public void setList_JOB_ODR_CANCEL_NO_2(List list) { l_JOB_ODR_CANCEL_NO_2 = list; }
	public void setList_l_ISSUE_REMAIN_QTY(List list) { l_l_ISSUE_REMAIN_QTY = list; }
	public void setList_h_OD_NO(List list) { l_h_OD_NO = list; }
	public void setList_DM_STS_TYP_DN(List list) { l_DM_STS_TYP_DN = list; }
	public void setList_ODR_STS_TYP_DN(List list) { l_ODR_STS_TYP_DN = list; }
	public void setList_ALC_TYP_2_DN(List list) { l_ALC_TYP_2_DN = list; }
	public void setList_UNIT_QTY_TYP_DN(List list) { l_UNIT_QTY_TYP_DN = list; }
	public void setList_JOB_ODR_STS_TYP_DN_2(List list) { l_JOB_ODR_STS_TYP_DN_2 = list; }
	public void setList_JOB_ODR_STS_TYP_DN(List list) { l_JOB_ODR_STS_TYP_DN = list; }
	public void setList_DUE_TIME(List list) { l_DUE_TIME = list; }
	public void setList_PRD_DUE_TIME(List list) { l_PRD_DUE_TIME = list; }
	public void setList_ODR_START_TIME(List list) { l_ODR_START_TIME = list; }
	public void setList_PRD_START_TIME(List list) { l_PRD_START_TIME = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_OD_CALC_FLG(List list) { l_OD_CALC_FLG = list; }
	public void setList_JOB_ODR_EXP_TYP(List list) { l_JOB_ODR_EXP_TYP = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_SUM_OF_WORK_IN_PROC_QTY(List list) { l_SUM_OF_WORK_IN_PROC_QTY = list; }
	public void setList_TOTAL_RCV_QTY(List list) { l_TOTAL_RCV_QTY = list; }
	public void setList_ODR_STS_TYP(List list) { l_ODR_STS_TYP = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_OD_MNT_FLG(List list) { l_OD_MNT_FLG = list; }
	public void setList_JOB_ODR_ALC_CD(List list) { l_JOB_ODR_ALC_CD = list; }
	public void setList_ALC_STOCK_TYP(List list) { l_ALC_STOCK_TYP = list; }
	public void setList_ALCD_QTY(List list) { l_ALCD_QTY = list; }
	public void setList_ISSUEED_QTY(List list) { l_ISSUEED_QTY = list; }
	public void setList_ISSUE_CMPLT_FLG(List list) { l_ISSUE_CMPLT_FLG = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_SUM_OF_ISSUEED_QTY(List list) { l_SUM_OF_ISSUEED_QTY = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_ISSUE_REMAIN_QTY(List list) { l_ISSUE_REMAIN_QTY = list; }
	public void setList_OD_GNR_TYP(List list) { l_OD_GNR_TYP = list; }
	public void setList_SUM_OF_ISSUED_QTY(List list) { l_SUM_OF_ISSUED_QTY = list; }
	public void setList_SUM_OF_STOCK_ON_HAND_QTY(List list) { l_SUM_OF_STOCK_ON_HAND_QTY = list; }
	public void setList_SUM_OF_ALCD_QTY(List list) { l_SUM_OF_ALCD_QTY = list; }
	public void setList_JOB_ODR_CD_2(List list) { l_JOB_ODR_CD_2 = list; }
	public void setList_SEL_OD_NO(List list) { l_SEL_OD_NO = list; }

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
			l_l_JOB_ODR_CD.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_ALCD_QTY.add(((AC0100010Struct) list.get(i)).getl_ALCD_QTY());
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
			l_l_STOCK_ON_HAND_QTY.add(((AC0100010Struct) list.get(i)).getl_STOCK_ON_HAND_QTY());
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
			l_l_ODR_STS_TYP_DN.add(((AC0100010Struct) list.get(i)).getl_ODR_STS_TYP_DN());
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
			l_l_PRD_DUE_DATE.add(((AC0100010Struct) list.get(i)).getl_PRD_DUE_DATE());
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
			l_l_TOTAL_RCV_QTY.add(((AC0100010Struct) list.get(i)).getl_TOTAL_RCV_QTY());
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
			l_l_ODR_START_DATE.add(((AC0100010Struct) list.get(i)).getl_ODR_START_DATE());
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
			l_l_PRD_START_DATE.add(((AC0100010Struct) list.get(i)).getl_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ON_HAND_QTY == null) {
			l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ON_HAND_QTY.add(((AC0100010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
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
			l_l_ODR_QTY.add(((AC0100010Struct) list.get(i)).getl_ODR_QTY());
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
			l_l_ALC_GRP_CD.add(((AC0100010Struct) list.get(i)).getl_ALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_STS_TYP_DN == null) {
			l_l_JOB_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_l_JOB_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_STS_TYP_DN.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_STS_TYP_DN());
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
			l_l_ODR_STS_TYP.add(((AC0100010Struct) list.get(i)).getl_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_STS_TYP == null) {
			l_l_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_l_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_STS_TYP.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_ALLOCATABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALLOCATABLE_QTY == null) {
			l_ALLOCATABLE_QTY = new ArrayList();
		} else {
			l_ALLOCATABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALLOCATABLE_QTY.add(((AC0100010Struct) list.get(i)).getALLOCATABLE_QTY());
		}
		return size;
	}
	public int setL2L_l_ALLOCATABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALLOCATABLE_QTY == null) {
			l_l_ALLOCATABLE_QTY = new ArrayList();
		} else {
			l_l_ALLOCATABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALLOCATABLE_QTY.add(((AC0100010Struct) list.get(i)).getl_ALLOCATABLE_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OF_ALLOCATABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_ALLOCATABLE_QTY == null) {
			l_SUM_OF_ALLOCATABLE_QTY = new ArrayList();
		} else {
			l_SUM_OF_ALLOCATABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_ALLOCATABLE_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_ALLOCATABLE_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_2 == null) {
			l_STOCK_UNIT_2 = new ArrayList();
		} else {
			l_STOCK_UNIT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_2.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_2());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_3 == null) {
			l_STOCK_UNIT_3 = new ArrayList();
		} else {
			l_STOCK_UNIT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_3.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_3());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_1 == null) {
			l_STOCK_UNIT_1 = new ArrayList();
		} else {
			l_STOCK_UNIT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_1.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_1());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_4 == null) {
			l_STOCK_UNIT_4 = new ArrayList();
		} else {
			l_STOCK_UNIT_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_4.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_4());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_5 == null) {
			l_STOCK_UNIT_5 = new ArrayList();
		} else {
			l_STOCK_UNIT_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_5.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_5());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_6 == null) {
			l_STOCK_UNIT_6 = new ArrayList();
		} else {
			l_STOCK_UNIT_6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_6.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_6());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_7 == null) {
			l_STOCK_UNIT_7 = new ArrayList();
		} else {
			l_STOCK_UNIT_7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_7.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_7());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_8 == null) {
			l_STOCK_UNIT_8 = new ArrayList();
		} else {
			l_STOCK_UNIT_8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_8.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_8());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_9 == null) {
			l_STOCK_UNIT_9 = new ArrayList();
		} else {
			l_STOCK_UNIT_9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_9.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_9());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_10 == null) {
			l_STOCK_UNIT_10 = new ArrayList();
		} else {
			l_STOCK_UNIT_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_10.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_10());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_11 == null) {
			l_STOCK_UNIT_11 = new ArrayList();
		} else {
			l_STOCK_UNIT_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_11.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT_11());
		}
		return size;
	}
	public int setL2L_SUM_OF_ALC_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_ALC_REMAIN_QTY == null) {
			l_SUM_OF_ALC_REMAIN_QTY = new ArrayList();
		} else {
			l_SUM_OF_ALC_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_ALC_REMAIN_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_ALC_REMAIN_QTY());
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
			l_l_OD_NO.add(((AC0100010Struct) list.get(i)).getl_OD_NO());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_DETAIL_NO == null) {
			l_l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_DETAIL_NO.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_DETAIL_NO());
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
			l_l_JOB_ODR_CANCEL_NO.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_CANCEL_NO());
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
			l_l_MODIFY_COUNT.add(((AC0100010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_EXP_TYP == null) {
			l_l_JOB_ODR_EXP_TYP = new ArrayList();
		} else {
			l_l_JOB_ODR_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_EXP_TYP.add(((AC0100010Struct) list.get(i)).getl_JOB_ODR_EXP_TYP());
		}
		return size;
	}
	public int setL2L_l_MRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_TYP == null) {
			l_l_MRP_TYP = new ArrayList();
		} else {
			l_l_MRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_TYP.add(((AC0100010Struct) list.get(i)).getl_MRP_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP_2 == null) {
			l_JOB_ODR_STS_TYP_2 = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP_2.add(((AC0100010Struct) list.get(i)).getJOB_ODR_STS_TYP_2());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD_2 == null) {
			l_ALC_GRP_CD_2 = new ArrayList();
		} else {
			l_ALC_GRP_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD_2.add(((AC0100010Struct) list.get(i)).getALC_GRP_CD_2());
		}
		return size;
	}
	public int setL2L_l_ALC_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_TYP_2 == null) {
			l_l_ALC_TYP_2 = new ArrayList();
		} else {
			l_l_ALC_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_TYP_2.add(((AC0100010Struct) list.get(i)).getl_ALC_TYP_2());
		}
		return size;
	}
	public int setL2L_l_ALC_TYP_2_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_TYP_2_DN == null) {
			l_l_ALC_TYP_2_DN = new ArrayList();
		} else {
			l_l_ALC_TYP_2_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_TYP_2_DN.add(((AC0100010Struct) list.get(i)).getl_ALC_TYP_2_DN());
		}
		return size;
	}
	public int setL2L_l_ISSUEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUEED_QTY == null) {
			l_l_ISSUEED_QTY = new ArrayList();
		} else {
			l_l_ISSUEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUEED_QTY.add(((AC0100010Struct) list.get(i)).getl_ISSUEED_QTY());
		}
		return size;
	}
	public int setL2L_ALC_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_TYP_2 == null) {
			l_ALC_TYP_2 = new ArrayList();
		} else {
			l_ALC_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_TYP_2.add(((AC0100010Struct) list.get(i)).getALC_TYP_2());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO_2 == null) {
			l_JOB_ODR_DETAIL_NO_2 = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO_2.add(((AC0100010Struct) list.get(i)).getJOB_ODR_DETAIL_NO_2());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO_2 == null) {
			l_JOB_ODR_CANCEL_NO_2 = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO_2.add(((AC0100010Struct) list.get(i)).getJOB_ODR_CANCEL_NO_2());
		}
		return size;
	}
	public int setL2L_l_ISSUE_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ISSUE_REMAIN_QTY == null) {
			l_l_ISSUE_REMAIN_QTY = new ArrayList();
		} else {
			l_l_ISSUE_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ISSUE_REMAIN_QTY.add(((AC0100010Struct) list.get(i)).getl_ISSUE_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_h_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OD_NO == null) {
			l_h_OD_NO = new ArrayList();
		} else {
			l_h_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OD_NO.add(((AC0100010Struct) list.get(i)).geth_OD_NO());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_DN == null) {
			l_DM_STS_TYP_DN = new ArrayList();
		} else {
			l_DM_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_DN.add(((AC0100010Struct) list.get(i)).getDM_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_DN == null) {
			l_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_DN.add(((AC0100010Struct) list.get(i)).getODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_ALC_TYP_2_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_TYP_2_DN == null) {
			l_ALC_TYP_2_DN = new ArrayList();
		} else {
			l_ALC_TYP_2_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_TYP_2_DN.add(((AC0100010Struct) list.get(i)).getALC_TYP_2_DN());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_DN == null) {
			l_UNIT_QTY_TYP_DN = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_DN.add(((AC0100010Struct) list.get(i)).getUNIT_QTY_TYP_DN());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP_DN_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP_DN_2 == null) {
			l_JOB_ODR_STS_TYP_DN_2 = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP_DN_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP_DN_2.add(((AC0100010Struct) list.get(i)).getJOB_ODR_STS_TYP_DN_2());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP_DN == null) {
			l_JOB_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP_DN.add(((AC0100010Struct) list.get(i)).getJOB_ODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_TIME == null) {
			l_DUE_TIME = new ArrayList();
		} else {
			l_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_TIME.add(((AC0100010Struct) list.get(i)).getDUE_TIME());
		}
		return size;
	}
	public int setL2L_PRD_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_TIME == null) {
			l_PRD_DUE_TIME = new ArrayList();
		} else {
			l_PRD_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_TIME.add(((AC0100010Struct) list.get(i)).getPRD_DUE_TIME());
		}
		return size;
	}
	public int setL2L_ODR_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_TIME == null) {
			l_ODR_START_TIME = new ArrayList();
		} else {
			l_ODR_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_TIME.add(((AC0100010Struct) list.get(i)).getODR_START_TIME());
		}
		return size;
	}
	public int setL2L_PRD_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_TIME == null) {
			l_PRD_START_TIME = new ArrayList();
		} else {
			l_PRD_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_TIME.add(((AC0100010Struct) list.get(i)).getPRD_START_TIME());
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
			l_OD_NO.add(((AC0100010Struct) list.get(i)).getOD_NO());
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
			l_JOB_ODR_CD.add(((AC0100010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AC0100010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_JOB_ODR_CANCEL_NO.add(((AC0100010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_ALC_GRP_CD.add(((AC0100010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((AC0100010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AC0100010Struct) list.get(i)).getDM_QTY());
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
			l_ITEM_NAME.add(((AC0100010Struct) list.get(i)).getITEM_NAME());
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
			l_UNIT_QTY_TYP.add(((AC0100010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AC0100010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_JOB_ODR_STS_TYP.add(((AC0100010Struct) list.get(i)).getJOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP == null) {
			l_DM_STS_TYP = new ArrayList();
		} else {
			l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP.add(((AC0100010Struct) list.get(i)).getDM_STS_TYP());
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
			l_TOTAL_ISSUE_QTY.add(((AC0100010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE == null) {
			l_DUE_DATE = new ArrayList();
		} else {
			l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE.add(((AC0100010Struct) list.get(i)).getDUE_DATE());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG == null) {
			l_OD_CALC_FLG = new ArrayList();
		} else {
			l_OD_CALC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG.add(((AC0100010Struct) list.get(i)).getOD_CALC_FLG());
		}
		return size;
	}
	public int setL2L_JOB_ODR_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_EXP_TYP == null) {
			l_JOB_ODR_EXP_TYP = new ArrayList();
		} else {
			l_JOB_ODR_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_EXP_TYP.add(((AC0100010Struct) list.get(i)).getJOB_ODR_EXP_TYP());
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
			l_MRP_TYP.add(((AC0100010Struct) list.get(i)).getMRP_TYP());
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
			l_MRP_ODR_TYP.add(((AC0100010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_PARENT_OD_NO.add(((AC0100010Struct) list.get(i)).getPARENT_OD_NO());
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
			l_ITEM_CD.add(((AC0100010Struct) list.get(i)).getITEM_CD());
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
			l_PLANT_CD.add(((AC0100010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_SUM_OF_WORK_IN_PROC_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_WORK_IN_PROC_QTY == null) {
			l_SUM_OF_WORK_IN_PROC_QTY = new ArrayList();
		} else {
			l_SUM_OF_WORK_IN_PROC_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_WORK_IN_PROC_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_WORK_IN_PROC_QTY());
		}
		return size;
	}
	public int setL2L_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_RCV_QTY == null) {
			l_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_RCV_QTY.add(((AC0100010Struct) list.get(i)).getTOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP == null) {
			l_ODR_STS_TYP = new ArrayList();
		} else {
			l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP.add(((AC0100010Struct) list.get(i)).getODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0100010Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE == null) {
			l_ODR_START_DATE = new ArrayList();
		} else {
			l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE.add(((AC0100010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE == null) {
			l_PRD_START_DATE = new ArrayList();
		} else {
			l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE.add(((AC0100010Struct) list.get(i)).getPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_OD_MNT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MNT_FLG == null) {
			l_OD_MNT_FLG = new ArrayList();
		} else {
			l_OD_MNT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MNT_FLG.add(((AC0100010Struct) list.get(i)).getOD_MNT_FLG());
		}
		return size;
	}
	public int setL2L_JOB_ODR_ALC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_ALC_CD == null) {
			l_JOB_ODR_ALC_CD = new ArrayList();
		} else {
			l_JOB_ODR_ALC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_ALC_CD.add(((AC0100010Struct) list.get(i)).getJOB_ODR_ALC_CD());
		}
		return size;
	}
	public int setL2L_ALC_STOCK_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_STOCK_TYP == null) {
			l_ALC_STOCK_TYP = new ArrayList();
		} else {
			l_ALC_STOCK_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_STOCK_TYP.add(((AC0100010Struct) list.get(i)).getALC_STOCK_TYP());
		}
		return size;
	}
	public int setL2L_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALCD_QTY == null) {
			l_ALCD_QTY = new ArrayList();
		} else {
			l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALCD_QTY.add(((AC0100010Struct) list.get(i)).getALCD_QTY());
		}
		return size;
	}
	public int setL2L_ISSUEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUEED_QTY == null) {
			l_ISSUEED_QTY = new ArrayList();
		} else {
			l_ISSUEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUEED_QTY.add(((AC0100010Struct) list.get(i)).getISSUEED_QTY());
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
			l_ISSUE_CMPLT_FLG.add(((AC0100010Struct) list.get(i)).getISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPOIL == null) {
			l_ITEM_SPOIL = new ArrayList();
		} else {
			l_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPOIL.add(((AC0100010Struct) list.get(i)).getITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_SUM_OF_ISSUEED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_ISSUEED_QTY == null) {
			l_SUM_OF_ISSUEED_QTY = new ArrayList();
		} else {
			l_SUM_OF_ISSUEED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_ISSUEED_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_ISSUEED_QTY());
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
			l_MODIFY_COUNT.add(((AC0100010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_JOB_ODR_TYP.add(((AC0100010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_REMAIN_QTY == null) {
			l_ISSUE_REMAIN_QTY = new ArrayList();
		} else {
			l_ISSUE_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_REMAIN_QTY.add(((AC0100010Struct) list.get(i)).getISSUE_REMAIN_QTY());
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
			l_OD_GNR_TYP.add(((AC0100010Struct) list.get(i)).getOD_GNR_TYP());
		}
		return size;
	}
	public int setL2L_SUM_OF_ISSUED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_ISSUED_QTY == null) {
			l_SUM_OF_ISSUED_QTY = new ArrayList();
		} else {
			l_SUM_OF_ISSUED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_ISSUED_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_ISSUED_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OF_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_STOCK_ON_HAND_QTY == null) {
			l_SUM_OF_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_SUM_OF_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_STOCK_ON_HAND_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OF_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OF_ALCD_QTY == null) {
			l_SUM_OF_ALCD_QTY = new ArrayList();
		} else {
			l_SUM_OF_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OF_ALCD_QTY.add(((AC0100010Struct) list.get(i)).getSUM_OF_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD_2 == null) {
			l_JOB_ODR_CD_2 = new ArrayList();
		} else {
			l_JOB_ODR_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD_2.add(((AC0100010Struct) list.get(i)).getJOB_ODR_CD_2());
		}
		return size;
	}
	public int setL2L_SEL_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_OD_NO == null) {
			l_SEL_OD_NO = new ArrayList();
		} else {
			l_SEL_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_OD_NO.add(((AC0100010Struct) list.get(i)).getSEL_OD_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_JOB_ODR_CD = null;
		m_l_ALCD_QTY = null;
		m_l_STOCK_ON_HAND_QTY = null;
		m_l_ODR_STS_TYP_DN = null;
		m_l_PRD_DUE_DATE = null;
		m_l_TOTAL_RCV_QTY = null;
		m_l_ODR_START_DATE = null;
		m_l_PRD_START_DATE = null;
		m_STOCK_ON_HAND_QTY = null;
		m_l_ODR_QTY = null;
		m_l_ALC_GRP_CD = null;
		m_l_JOB_ODR_STS_TYP_DN = null;
		m_l_ODR_STS_TYP = null;
		m_l_JOB_ODR_STS_TYP = null;
		m_ALLOCATABLE_QTY = null;
		m_l_ALLOCATABLE_QTY = null;
		m_SUM_OF_ALLOCATABLE_QTY = null;
		m_STOCK_UNIT_2 = null;
		m_STOCK_UNIT_3 = null;
		m_STOCK_UNIT_1 = null;
		m_STOCK_UNIT_4 = null;
		m_STOCK_UNIT_5 = null;
		m_STOCK_UNIT_6 = null;
		m_STOCK_UNIT_7 = null;
		m_STOCK_UNIT_8 = null;
		m_STOCK_UNIT_9 = null;
		m_STOCK_UNIT_10 = null;
		m_STOCK_UNIT_11 = null;
		m_SUM_OF_ALC_REMAIN_QTY = null;
		m_l_OD_NO = null;
		m_l_JOB_ODR_DETAIL_NO = null;
		m_l_JOB_ODR_CANCEL_NO = null;
		m_l_MODIFY_COUNT = null;
		m_l_JOB_ODR_EXP_TYP = null;
		m_l_MRP_TYP = null;
		m_JOB_ODR_STS_TYP_2 = null;
		m_ALC_GRP_CD_2 = null;
		m_l_ALC_TYP_2 = null;
		m_l_ALC_TYP_2_DN = null;
		m_l_ISSUEED_QTY = null;
		m_ALC_TYP_2 = null;
		m_JOB_ODR_DETAIL_NO_2 = null;
		m_JOB_ODR_CANCEL_NO_2 = null;
		m_l_ISSUE_REMAIN_QTY = null;
		m_h_OD_NO = null;
		m_DM_STS_TYP_DN = null;
		m_ODR_STS_TYP_DN = null;
		m_ALC_TYP_2_DN = null;
		m_UNIT_QTY_TYP_DN = null;
		m_JOB_ODR_STS_TYP_DN_2 = null;
		m_JOB_ODR_STS_TYP_DN = null;
		m_DUE_TIME = null;
		m_PRD_DUE_TIME = null;
		m_ODR_START_TIME = null;
		m_PRD_START_TIME = null;
		m_OD_NO = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_ALC_GRP_CD = null;
		m_ODR_QTY = null;
		m_DM_QTY = null;
		m_ITEM_NAME = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_JOB_ODR_STS_TYP = null;
		m_DM_STS_TYP = null;
		m_TOTAL_ISSUE_QTY = null;
		m_DUE_DATE = null;
		m_OD_CALC_FLG = null;
		m_JOB_ODR_EXP_TYP = null;
		m_MRP_TYP = null;
		m_MRP_ODR_TYP = null;
		m_PARENT_OD_NO = null;
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_SUM_OF_WORK_IN_PROC_QTY = null;
		m_TOTAL_RCV_QTY = null;
		m_ODR_STS_TYP = null;
		m_PRD_DUE_DATE = null;
		m_ODR_START_DATE = null;
		m_PRD_START_DATE = null;
		m_OD_MNT_FLG = null;
		m_JOB_ODR_ALC_CD = null;
		m_ALC_STOCK_TYP = null;
		m_ALCD_QTY = null;
		m_ISSUEED_QTY = null;
		m_ISSUE_CMPLT_FLG = null;
		m_ITEM_SPOIL = null;
		m_SUM_OF_ISSUEED_QTY = null;
		m_MODIFY_COUNT = null;
		m_JOB_ODR_TYP = null;
		m_ISSUE_REMAIN_QTY = null;
		m_OD_GNR_TYP = null;
		m_SUM_OF_ISSUED_QTY = null;
		m_SUM_OF_STOCK_ON_HAND_QTY = null;
		m_SUM_OF_ALCD_QTY = null;
		m_JOB_ODR_CD_2 = null;
		m_SEL_OD_NO = null;

		l_l_JOB_ODR_CD = null;
		l_l_ALCD_QTY = null;
		l_l_STOCK_ON_HAND_QTY = null;
		l_l_ODR_STS_TYP_DN = null;
		l_l_PRD_DUE_DATE = null;
		l_l_TOTAL_RCV_QTY = null;
		l_l_ODR_START_DATE = null;
		l_l_PRD_START_DATE = null;
		l_STOCK_ON_HAND_QTY = null;
		l_l_ODR_QTY = null;
		l_l_ALC_GRP_CD = null;
		l_l_JOB_ODR_STS_TYP_DN = null;
		l_l_ODR_STS_TYP = null;
		l_l_JOB_ODR_STS_TYP = null;
		l_ALLOCATABLE_QTY = null;
		l_l_ALLOCATABLE_QTY = null;
		l_SUM_OF_ALLOCATABLE_QTY = null;
		l_STOCK_UNIT_2 = null;
		l_STOCK_UNIT_3 = null;
		l_STOCK_UNIT_1 = null;
		l_STOCK_UNIT_4 = null;
		l_STOCK_UNIT_5 = null;
		l_STOCK_UNIT_6 = null;
		l_STOCK_UNIT_7 = null;
		l_STOCK_UNIT_8 = null;
		l_STOCK_UNIT_9 = null;
		l_STOCK_UNIT_10 = null;
		l_STOCK_UNIT_11 = null;
		l_SUM_OF_ALC_REMAIN_QTY = null;
		l_l_OD_NO = null;
		l_l_JOB_ODR_DETAIL_NO = null;
		l_l_JOB_ODR_CANCEL_NO = null;
		l_l_MODIFY_COUNT = null;
		l_l_JOB_ODR_EXP_TYP = null;
		l_l_MRP_TYP = null;
		l_JOB_ODR_STS_TYP_2 = null;
		l_ALC_GRP_CD_2 = null;
		l_l_ALC_TYP_2 = null;
		l_l_ALC_TYP_2_DN = null;
		l_l_ISSUEED_QTY = null;
		l_ALC_TYP_2 = null;
		l_JOB_ODR_DETAIL_NO_2 = null;
		l_JOB_ODR_CANCEL_NO_2 = null;
		l_l_ISSUE_REMAIN_QTY = null;
		l_h_OD_NO = null;
		l_DM_STS_TYP_DN = null;
		l_ODR_STS_TYP_DN = null;
		l_ALC_TYP_2_DN = null;
		l_UNIT_QTY_TYP_DN = null;
		l_JOB_ODR_STS_TYP_DN_2 = null;
		l_JOB_ODR_STS_TYP_DN = null;
		l_DUE_TIME = null;
		l_PRD_DUE_TIME = null;
		l_ODR_START_TIME = null;
		l_PRD_START_TIME = null;
		l_OD_NO = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_ALC_GRP_CD = null;
		l_ODR_QTY = null;
		l_DM_QTY = null;
		l_ITEM_NAME = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_JOB_ODR_STS_TYP = null;
		l_DM_STS_TYP = null;
		l_TOTAL_ISSUE_QTY = null;
		l_DUE_DATE = null;
		l_OD_CALC_FLG = null;
		l_JOB_ODR_EXP_TYP = null;
		l_MRP_TYP = null;
		l_MRP_ODR_TYP = null;
		l_PARENT_OD_NO = null;
		l_ITEM_CD = null;
		l_PLANT_CD = null;
		l_SUM_OF_WORK_IN_PROC_QTY = null;
		l_TOTAL_RCV_QTY = null;
		l_ODR_STS_TYP = null;
		l_PRD_DUE_DATE = null;
		l_ODR_START_DATE = null;
		l_PRD_START_DATE = null;
		l_OD_MNT_FLG = null;
		l_JOB_ODR_ALC_CD = null;
		l_ALC_STOCK_TYP = null;
		l_ALCD_QTY = null;
		l_ISSUEED_QTY = null;
		l_ISSUE_CMPLT_FLG = null;
		l_ITEM_SPOIL = null;
		l_SUM_OF_ISSUEED_QTY = null;
		l_MODIFY_COUNT = null;
		l_JOB_ODR_TYP = null;
		l_ISSUE_REMAIN_QTY = null;
		l_OD_GNR_TYP = null;
		l_SUM_OF_ISSUED_QTY = null;
		l_SUM_OF_STOCK_ON_HAND_QTY = null;
		l_SUM_OF_ALCD_QTY = null;
		l_JOB_ODR_CD_2 = null;
		l_SEL_OD_NO = null;

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
	 * medAC0100010クラスの標準コンストラクタ
	 */
	public AC0100010Struct()
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
	public void setStruct(AC0100010Struct struct)
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
	public void setStructM(AC0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setl_STOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
			this.setl_ODR_STS_TYP_DN(struct.getl_ODR_STS_TYP_DN());
			this.setl_PRD_DUE_DATE(struct.getl_PRD_DUE_DATE());
			this.setl_TOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
			this.setl_ODR_START_DATE(struct.getl_ODR_START_DATE());
			this.setl_PRD_START_DATE(struct.getl_PRD_START_DATE());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_JOB_ODR_STS_TYP_DN(struct.getl_JOB_ODR_STS_TYP_DN());
			this.setl_ODR_STS_TYP(struct.getl_ODR_STS_TYP());
			this.setl_JOB_ODR_STS_TYP(struct.getl_JOB_ODR_STS_TYP());
			this.setALLOCATABLE_QTY(struct.getALLOCATABLE_QTY());
			this.setl_ALLOCATABLE_QTY(struct.getl_ALLOCATABLE_QTY());
			this.setSUM_OF_ALLOCATABLE_QTY(struct.getSUM_OF_ALLOCATABLE_QTY());
			this.setSTOCK_UNIT_2(struct.getSTOCK_UNIT_2());
			this.setSTOCK_UNIT_3(struct.getSTOCK_UNIT_3());
			this.setSTOCK_UNIT_1(struct.getSTOCK_UNIT_1());
			this.setSTOCK_UNIT_4(struct.getSTOCK_UNIT_4());
			this.setSTOCK_UNIT_5(struct.getSTOCK_UNIT_5());
			this.setSTOCK_UNIT_6(struct.getSTOCK_UNIT_6());
			this.setSTOCK_UNIT_7(struct.getSTOCK_UNIT_7());
			this.setSTOCK_UNIT_8(struct.getSTOCK_UNIT_8());
			this.setSTOCK_UNIT_9(struct.getSTOCK_UNIT_9());
			this.setSTOCK_UNIT_10(struct.getSTOCK_UNIT_10());
			this.setSTOCK_UNIT_11(struct.getSTOCK_UNIT_11());
			this.setSUM_OF_ALC_REMAIN_QTY(struct.getSUM_OF_ALC_REMAIN_QTY());
			this.setl_OD_NO(struct.getl_OD_NO());
			this.setl_JOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
			this.setl_JOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_JOB_ODR_EXP_TYP(struct.getl_JOB_ODR_EXP_TYP());
			this.setl_MRP_TYP(struct.getl_MRP_TYP());
			this.setJOB_ODR_STS_TYP_2(struct.getJOB_ODR_STS_TYP_2());
			this.setALC_GRP_CD_2(struct.getALC_GRP_CD_2());
			this.setl_ALC_TYP_2(struct.getl_ALC_TYP_2());
			this.setl_ALC_TYP_2_DN(struct.getl_ALC_TYP_2_DN());
			this.setl_ISSUEED_QTY(struct.getl_ISSUEED_QTY());
			this.setALC_TYP_2(struct.getALC_TYP_2());
			this.setJOB_ODR_DETAIL_NO_2(struct.getJOB_ODR_DETAIL_NO_2());
			this.setJOB_ODR_CANCEL_NO_2(struct.getJOB_ODR_CANCEL_NO_2());
			this.setl_ISSUE_REMAIN_QTY(struct.getl_ISSUE_REMAIN_QTY());
			this.seth_OD_NO(struct.geth_OD_NO());
			this.setDM_STS_TYP_DN(struct.getDM_STS_TYP_DN());
			this.setODR_STS_TYP_DN(struct.getODR_STS_TYP_DN());
			this.setALC_TYP_2_DN(struct.getALC_TYP_2_DN());
			this.setUNIT_QTY_TYP_DN(struct.getUNIT_QTY_TYP_DN());
			this.setJOB_ODR_STS_TYP_DN_2(struct.getJOB_ODR_STS_TYP_DN_2());
			this.setJOB_ODR_STS_TYP_DN(struct.getJOB_ODR_STS_TYP_DN());
			this.setDUE_TIME(struct.getDUE_TIME());
			this.setPRD_DUE_TIME(struct.getPRD_DUE_TIME());
			this.setODR_START_TIME(struct.getODR_START_TIME());
			this.setPRD_START_TIME(struct.getPRD_START_TIME());
			this.setOD_NO(struct.getOD_NO());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setODR_QTY(struct.getODR_QTY());
			this.setDM_QTY(struct.getDM_QTY());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setOD_CALC_FLG(struct.getOD_CALC_FLG());
			this.setJOB_ODR_EXP_TYP(struct.getJOB_ODR_EXP_TYP());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setSUM_OF_WORK_IN_PROC_QTY(struct.getSUM_OF_WORK_IN_PROC_QTY());
			this.setTOTAL_RCV_QTY(struct.getTOTAL_RCV_QTY());
			this.setODR_STS_TYP(struct.getODR_STS_TYP());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setOD_MNT_FLG(struct.getOD_MNT_FLG());
			this.setJOB_ODR_ALC_CD(struct.getJOB_ODR_ALC_CD());
			this.setALC_STOCK_TYP(struct.getALC_STOCK_TYP());
			this.setALCD_QTY(struct.getALCD_QTY());
			this.setISSUEED_QTY(struct.getISSUEED_QTY());
			this.setISSUE_CMPLT_FLG(struct.getISSUE_CMPLT_FLG());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setSUM_OF_ISSUEED_QTY(struct.getSUM_OF_ISSUEED_QTY());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setISSUE_REMAIN_QTY(struct.getISSUE_REMAIN_QTY());
			this.setOD_GNR_TYP(struct.getOD_GNR_TYP());
			this.setSUM_OF_ISSUED_QTY(struct.getSUM_OF_ISSUED_QTY());
			this.setSUM_OF_STOCK_ON_HAND_QTY(struct.getSUM_OF_STOCK_ON_HAND_QTY());
			this.setSUM_OF_ALCD_QTY(struct.getSUM_OF_ALCD_QTY());
			this.setJOB_ODR_CD_2(struct.getJOB_ODR_CD_2());
			this.setSEL_OD_NO(struct.getSEL_OD_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_l_STOCK_ON_HAND_QTY(struct.getList_l_STOCK_ON_HAND_QTY());
			this.setList_l_ODR_STS_TYP_DN(struct.getList_l_ODR_STS_TYP_DN());
			this.setList_l_PRD_DUE_DATE(struct.getList_l_PRD_DUE_DATE());
			this.setList_l_TOTAL_RCV_QTY(struct.getList_l_TOTAL_RCV_QTY());
			this.setList_l_ODR_START_DATE(struct.getList_l_ODR_START_DATE());
			this.setList_l_PRD_START_DATE(struct.getList_l_PRD_START_DATE());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_JOB_ODR_STS_TYP_DN(struct.getList_l_JOB_ODR_STS_TYP_DN());
			this.setList_l_ODR_STS_TYP(struct.getList_l_ODR_STS_TYP());
			this.setList_l_JOB_ODR_STS_TYP(struct.getList_l_JOB_ODR_STS_TYP());
			this.setList_ALLOCATABLE_QTY(struct.getList_ALLOCATABLE_QTY());
			this.setList_l_ALLOCATABLE_QTY(struct.getList_l_ALLOCATABLE_QTY());
			this.setList_SUM_OF_ALLOCATABLE_QTY(struct.getList_SUM_OF_ALLOCATABLE_QTY());
			this.setList_STOCK_UNIT_2(struct.getList_STOCK_UNIT_2());
			this.setList_STOCK_UNIT_3(struct.getList_STOCK_UNIT_3());
			this.setList_STOCK_UNIT_1(struct.getList_STOCK_UNIT_1());
			this.setList_STOCK_UNIT_4(struct.getList_STOCK_UNIT_4());
			this.setList_STOCK_UNIT_5(struct.getList_STOCK_UNIT_5());
			this.setList_STOCK_UNIT_6(struct.getList_STOCK_UNIT_6());
			this.setList_STOCK_UNIT_7(struct.getList_STOCK_UNIT_7());
			this.setList_STOCK_UNIT_8(struct.getList_STOCK_UNIT_8());
			this.setList_STOCK_UNIT_9(struct.getList_STOCK_UNIT_9());
			this.setList_STOCK_UNIT_10(struct.getList_STOCK_UNIT_10());
			this.setList_STOCK_UNIT_11(struct.getList_STOCK_UNIT_11());
			this.setList_SUM_OF_ALC_REMAIN_QTY(struct.getList_SUM_OF_ALC_REMAIN_QTY());
			this.setList_l_OD_NO(struct.getList_l_OD_NO());
			this.setList_l_JOB_ODR_DETAIL_NO(struct.getList_l_JOB_ODR_DETAIL_NO());
			this.setList_l_JOB_ODR_CANCEL_NO(struct.getList_l_JOB_ODR_CANCEL_NO());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_JOB_ODR_EXP_TYP(struct.getList_l_JOB_ODR_EXP_TYP());
			this.setList_l_MRP_TYP(struct.getList_l_MRP_TYP());
			this.setList_JOB_ODR_STS_TYP_2(struct.getList_JOB_ODR_STS_TYP_2());
			this.setList_ALC_GRP_CD_2(struct.getList_ALC_GRP_CD_2());
			this.setList_l_ALC_TYP_2(struct.getList_l_ALC_TYP_2());
			this.setList_l_ALC_TYP_2_DN(struct.getList_l_ALC_TYP_2_DN());
			this.setList_l_ISSUEED_QTY(struct.getList_l_ISSUEED_QTY());
			this.setList_ALC_TYP_2(struct.getList_ALC_TYP_2());
			this.setList_JOB_ODR_DETAIL_NO_2(struct.getList_JOB_ODR_DETAIL_NO_2());
			this.setList_JOB_ODR_CANCEL_NO_2(struct.getList_JOB_ODR_CANCEL_NO_2());
			this.setList_l_ISSUE_REMAIN_QTY(struct.getList_l_ISSUE_REMAIN_QTY());
			this.setList_h_OD_NO(struct.getList_h_OD_NO());
			this.setList_DM_STS_TYP_DN(struct.getList_DM_STS_TYP_DN());
			this.setList_ODR_STS_TYP_DN(struct.getList_ODR_STS_TYP_DN());
			this.setList_ALC_TYP_2_DN(struct.getList_ALC_TYP_2_DN());
			this.setList_UNIT_QTY_TYP_DN(struct.getList_UNIT_QTY_TYP_DN());
			this.setList_JOB_ODR_STS_TYP_DN_2(struct.getList_JOB_ODR_STS_TYP_DN_2());
			this.setList_JOB_ODR_STS_TYP_DN(struct.getList_JOB_ODR_STS_TYP_DN());
			this.setList_DUE_TIME(struct.getList_DUE_TIME());
			this.setList_PRD_DUE_TIME(struct.getList_PRD_DUE_TIME());
			this.setList_ODR_START_TIME(struct.getList_ODR_START_TIME());
			this.setList_PRD_START_TIME(struct.getList_PRD_START_TIME());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_OD_CALC_FLG(struct.getList_OD_CALC_FLG());
			this.setList_JOB_ODR_EXP_TYP(struct.getList_JOB_ODR_EXP_TYP());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_SUM_OF_WORK_IN_PROC_QTY(struct.getList_SUM_OF_WORK_IN_PROC_QTY());
			this.setList_TOTAL_RCV_QTY(struct.getList_TOTAL_RCV_QTY());
			this.setList_ODR_STS_TYP(struct.getList_ODR_STS_TYP());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_OD_MNT_FLG(struct.getList_OD_MNT_FLG());
			this.setList_JOB_ODR_ALC_CD(struct.getList_JOB_ODR_ALC_CD());
			this.setList_ALC_STOCK_TYP(struct.getList_ALC_STOCK_TYP());
			this.setList_ALCD_QTY(struct.getList_ALCD_QTY());
			this.setList_ISSUEED_QTY(struct.getList_ISSUEED_QTY());
			this.setList_ISSUE_CMPLT_FLG(struct.getList_ISSUE_CMPLT_FLG());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_SUM_OF_ISSUEED_QTY(struct.getList_SUM_OF_ISSUEED_QTY());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_ISSUE_REMAIN_QTY(struct.getList_ISSUE_REMAIN_QTY());
			this.setList_OD_GNR_TYP(struct.getList_OD_GNR_TYP());
			this.setList_SUM_OF_ISSUED_QTY(struct.getList_SUM_OF_ISSUED_QTY());
			this.setList_SUM_OF_STOCK_ON_HAND_QTY(struct.getList_SUM_OF_STOCK_ON_HAND_QTY());
			this.setList_SUM_OF_ALCD_QTY(struct.getList_SUM_OF_ALCD_QTY());
			this.setList_JOB_ODR_CD_2(struct.getList_JOB_ODR_CD_2());
			this.setList_SEL_OD_NO(struct.getList_SEL_OD_NO());
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
	// 第 1 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 2 変数初期値： i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// 第 3 変数初期値： i_l_STOCK_ON_HAND_QTY


	final static String i_l_STOCK_ON_HAND_QTY = null;

	// 第 4 変数初期値： i_l_ODR_STS_TYP_DN


	final static String i_l_ODR_STS_TYP_DN = null;

	// 第 5 変数初期値： i_l_PRD_DUE_DATE


	final static String i_l_PRD_DUE_DATE = null;

	// 第 6 変数初期値： i_l_TOTAL_RCV_QTY


	final static String i_l_TOTAL_RCV_QTY = null;

	// 第 7 変数初期値： i_l_ODR_START_DATE


	final static String i_l_ODR_START_DATE = null;

	// 第 8 変数初期値： i_l_PRD_START_DATE


	final static String i_l_PRD_START_DATE = null;

	// 第 9 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 10 変数初期値： i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// 第 11 変数初期値： i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// 第 12 変数初期値： i_l_JOB_ODR_STS_TYP_DN


	final static String i_l_JOB_ODR_STS_TYP_DN = null;

	// 第 13 変数初期値： i_l_ODR_STS_TYP


	final static String i_l_ODR_STS_TYP = null;

	// 第 14 変数初期値： i_l_JOB_ODR_STS_TYP


	final static String i_l_JOB_ODR_STS_TYP = null;

	// 第 15 変数初期値： i_ALLOCATABLE_QTY


	final static String i_ALLOCATABLE_QTY = null;

	// 第 16 変数初期値： i_l_ALLOCATABLE_QTY


	final static String i_l_ALLOCATABLE_QTY = null;

	// 第 17 変数初期値： i_SUM_OF_ALLOCATABLE_QTY


	final static String i_SUM_OF_ALLOCATABLE_QTY = null;

	// 第 18 変数初期値： i_STOCK_UNIT_2


	final static String i_STOCK_UNIT_2 = null;

	// 第 19 変数初期値： i_STOCK_UNIT_3


	final static String i_STOCK_UNIT_3 = null;

	// 第 20 変数初期値： i_STOCK_UNIT_1


	final static String i_STOCK_UNIT_1 = null;

	// 第 21 変数初期値： i_STOCK_UNIT_4


	final static String i_STOCK_UNIT_4 = null;

	// 第 22 変数初期値： i_STOCK_UNIT_5


	final static String i_STOCK_UNIT_5 = null;

	// 第 23 変数初期値： i_STOCK_UNIT_6


	final static String i_STOCK_UNIT_6 = null;

	// 第 24 変数初期値： i_STOCK_UNIT_7


	final static String i_STOCK_UNIT_7 = null;

	// 第 25 変数初期値： i_STOCK_UNIT_8


	final static String i_STOCK_UNIT_8 = null;

	// 第 26 変数初期値： i_STOCK_UNIT_9


	final static String i_STOCK_UNIT_9 = null;

	// 第 27 変数初期値： i_STOCK_UNIT_10


	final static String i_STOCK_UNIT_10 = null;

	// 第 28 変数初期値： i_STOCK_UNIT_11


	final static String i_STOCK_UNIT_11 = null;

	// 第 29 変数初期値： i_SUM_OF_ALC_REMAIN_QTY


	final static String i_SUM_OF_ALC_REMAIN_QTY = null;

	// 第 30 変数初期値： i_l_OD_NO


	final static String i_l_OD_NO = null;

	// 第 31 変数初期値： i_l_JOB_ODR_DETAIL_NO


	final static String i_l_JOB_ODR_DETAIL_NO = null;

	// 第 32 変数初期値： i_l_JOB_ODR_CANCEL_NO


	final static String i_l_JOB_ODR_CANCEL_NO = null;

	// 第 33 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 34 変数初期値： i_l_JOB_ODR_EXP_TYP


	final static String i_l_JOB_ODR_EXP_TYP = null;

	// 第 35 変数初期値： i_l_MRP_TYP


	final static String i_l_MRP_TYP = null;

	// 第 36 変数初期値： i_JOB_ODR_STS_TYP_2


	final static String i_JOB_ODR_STS_TYP_2 = null;

	// 第 37 変数初期値： i_ALC_GRP_CD_2


	final static String i_ALC_GRP_CD_2 = null;

	// 第 38 変数初期値： i_l_ALC_TYP_2


	final static String i_l_ALC_TYP_2 = null;

	// 第 39 変数初期値： i_l_ALC_TYP_2_DN


	final static String i_l_ALC_TYP_2_DN = null;

	// 第 40 変数初期値： i_l_ISSUEED_QTY


	final static String i_l_ISSUEED_QTY = null;

	// 第 41 変数初期値： i_ALC_TYP_2


	final static String i_ALC_TYP_2 = null;

	// 第 42 変数初期値： i_JOB_ODR_DETAIL_NO_2


	final static String i_JOB_ODR_DETAIL_NO_2 = null;

	// 第 43 変数初期値： i_JOB_ODR_CANCEL_NO_2


	final static String i_JOB_ODR_CANCEL_NO_2 = null;

	// 第 44 変数初期値： i_l_ISSUE_REMAIN_QTY


	final static String i_l_ISSUE_REMAIN_QTY = null;

	// 第 45 変数初期値： i_h_OD_NO


	final static String i_h_OD_NO = null;

	// 第 46 変数初期値： i_DM_STS_TYP_DN


	final static String i_DM_STS_TYP_DN = null;

	// 第 47 変数初期値： i_ODR_STS_TYP_DN


	final static String i_ODR_STS_TYP_DN = null;

	// 第 48 変数初期値： i_ALC_TYP_2_DN


	final static String i_ALC_TYP_2_DN = null;

	// 第 49 変数初期値： i_UNIT_QTY_TYP_DN


	final static String i_UNIT_QTY_TYP_DN = null;

	// 第 50 変数初期値： i_JOB_ODR_STS_TYP_DN_2


	final static String i_JOB_ODR_STS_TYP_DN_2 = null;

	// 第 51 変数初期値： i_JOB_ODR_STS_TYP_DN


	final static String i_JOB_ODR_STS_TYP_DN = null;

	// 第 52 変数初期値： i_DUE_TIME


	final static String i_DUE_TIME = null;

	// 第 53 変数初期値： i_PRD_DUE_TIME


	final static String i_PRD_DUE_TIME = null;

	// 第 54 変数初期値： i_ODR_START_TIME


	final static String i_ODR_START_TIME = null;

	// 第 55 変数初期値： i_PRD_START_TIME


	final static String i_PRD_START_TIME = null;

	// 第 56 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 57 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 58 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 59 変数初期値： i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 60 変数初期値： i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// 第 61 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 62 変数初期値： i_DM_QTY


	final static String i_DM_QTY = null;

	// 第 63 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 64 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 65 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 66 変数初期値： i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// 第 67 変数初期値： i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// 第 68 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 69 変数初期値： i_DUE_DATE


	final static String i_DUE_DATE = null;

	// 第 70 変数初期値： i_OD_CALC_FLG


	final static String i_OD_CALC_FLG = null;

	// 第 71 変数初期値： i_JOB_ODR_EXP_TYP


	final static String i_JOB_ODR_EXP_TYP = null;

	// 第 72 変数初期値： i_MRP_TYP


	final static String i_MRP_TYP = null;

	// 第 73 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 74 変数初期値： i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// 第 75 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 76 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 77 変数初期値： i_SUM_OF_WORK_IN_PROC_QTY


	final static String i_SUM_OF_WORK_IN_PROC_QTY = null;

	// 第 78 変数初期値： i_TOTAL_RCV_QTY


	final static String i_TOTAL_RCV_QTY = null;

	// 第 79 変数初期値： i_ODR_STS_TYP


	final static String i_ODR_STS_TYP = null;

	// 第 80 変数初期値： i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// 第 81 変数初期値： i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// 第 82 変数初期値： i_PRD_START_DATE


	final static String i_PRD_START_DATE = null;

	// 第 83 変数初期値： i_OD_MNT_FLG


	final static String i_OD_MNT_FLG = null;

	// 第 84 変数初期値： i_JOB_ODR_ALC_CD


	final static String i_JOB_ODR_ALC_CD = null;

	// 第 85 変数初期値： i_ALC_STOCK_TYP


	final static String i_ALC_STOCK_TYP = null;

	// 第 86 変数初期値： i_ALCD_QTY


	final static String i_ALCD_QTY = null;

	// 第 87 変数初期値： i_ISSUEED_QTY


	final static String i_ISSUEED_QTY = null;

	// 第 88 変数初期値： i_ISSUE_CMPLT_FLG


	final static String i_ISSUE_CMPLT_FLG = null;

	// 第 89 変数初期値： i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// 第 90 変数初期値： i_SUM_OF_ISSUEED_QTY


	final static String i_SUM_OF_ISSUEED_QTY = null;

	// 第 91 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 92 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 93 変数初期値： i_ISSUE_REMAIN_QTY


	final static String i_ISSUE_REMAIN_QTY = null;

	// 第 94 変数初期値： i_OD_GNR_TYP


	final static String i_OD_GNR_TYP = null;

	// 第 95 変数初期値： i_SUM_OF_ISSUED_QTY


	final static String i_SUM_OF_ISSUED_QTY = null;

	// 第 96 変数初期値： i_SUM_OF_STOCK_ON_HAND_QTY


	final static String i_SUM_OF_STOCK_ON_HAND_QTY = null;

	// 第 97 変数初期値： i_SUM_OF_ALCD_QTY


	final static String i_SUM_OF_ALCD_QTY = null;

	// 第 98 変数初期値： i_JOB_ODR_CD_2


	final static String i_JOB_ODR_CD_2 = null;

	// 第 99 変数初期値： i_SEL_OD_NO


	final static String i_SEL_OD_NO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_OD_NO
	final static String i_OD_NO = null;
	// 第 2 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 3 変数初期値： i_JOB_ODR_DETAIL_NO
	final static String i_JOB_ODR_DETAIL_NO = null;
	// 第 4 変数初期値： i_JOB_ODR_CANCEL_NO
	final static String i_JOB_ODR_CANCEL_NO = null;
	// 第 5 変数初期値： i_ALC_GRP_CD
	final static String i_ALC_GRP_CD = null;
	// 第 6 変数初期値： i_ODR_QTY
	final static String i_ODR_QTY = null;
	// 第 7 変数初期値： i_DM_QTY
	final static String i_DM_QTY = null;
	// 第 8 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 9 変数初期値： i_UNIT_QTY_TYP
	final static String i_UNIT_QTY_TYP = null;
	// 第 10 変数初期値： i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// 第 11 変数初期値： i_JOB_ODR_STS_TYP
	final static String i_JOB_ODR_STS_TYP = null;
	// 第 12 変数初期値： i_DM_STS_TYP
	final static String i_DM_STS_TYP = null;
	// 第 13 変数初期値： i_TOTAL_ISSUE_QTY
	final static String i_TOTAL_ISSUE_QTY = null;
	// 第 14 変数初期値： i_DUE_DATE
	final static String i_DUE_DATE = null;
	// 第 15 変数初期値： i_OD_CALC_FLG
	final static String i_OD_CALC_FLG = null;
	// 第 16 変数初期値： i_JOB_ODR_EXP_TYP
	final static String i_JOB_ODR_EXP_TYP = null;
	// 第 17 変数初期値： i_MRP_TYP
	final static String i_MRP_TYP = null;
	// 第 18 変数初期値： i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;
	// 第 19 変数初期値： i_PARENT_OD_NO
	final static String i_PARENT_OD_NO = null;
	// 第 20 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 21 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 22 変数初期値： i_SUM_OF_WORK_IN_PROC_QTY
	final static String i_SUM_OF_WORK_IN_PROC_QTY = null;
	// 第 23 変数初期値： i_TOTAL_RCV_QTY
	final static String i_TOTAL_RCV_QTY = null;
	// 第 24 変数初期値： i_ODR_STS_TYP
	final static String i_ODR_STS_TYP = null;
	// 第 25 変数初期値： i_ODR_STS_TYP_DN
	final static String i_ODR_STS_TYP_DN = null;
	// 第 26 変数初期値： i_PRD_DUE_DATE
	final static String i_PRD_DUE_DATE = null;
	// 第 27 変数初期値： i_ODR_START_DATE
	final static String i_ODR_START_DATE = null;
	// 第 28 変数初期値： i_PRD_START_DATE
	final static String i_PRD_START_DATE = null;
	// 第 29 変数初期値： i_JOB_ODR_STS_TYP_DN
	final static String i_JOB_ODR_STS_TYP_DN = null;
	// 第 30 変数初期値： i_OD_MNT_FLG
	final static String i_OD_MNT_FLG = null;
	// 第 31 変数初期値： i_JOB_ODR_ALC_CD
	final static String i_JOB_ODR_ALC_CD = null;
	// 第 32 変数初期値： i_ALC_STOCK_TYP
	final static String i_ALC_STOCK_TYP = null;
	// 第 33 変数初期値： i_ALCD_QTY
	final static String i_ALCD_QTY = null;
	// 第 34 変数初期値： i_ISSUEED_QTY
	final static String i_ISSUEED_QTY = null;
	// 第 35 変数初期値： i_ISSUE_CMPLT_FLG
	final static String i_ISSUE_CMPLT_FLG = null;
	// 第 36 変数初期値： i_DM_STS_TYP_DN
	final static String i_DM_STS_TYP_DN = null;
	// 第 37 変数初期値： i_ITEM_SPOIL
	final static String i_ITEM_SPOIL = null;
	// 第 38 変数初期値： i_SUM_OF_ISSUEED_QTY
	final static String i_SUM_OF_ISSUEED_QTY = null;
	// 第 39 変数初期値： i_MODIFY_COUNT
	final static String i_MODIFY_COUNT = null;
	// 第 40 変数初期値： i_JOB_ODR_TYP
	final static String i_JOB_ODR_TYP = null;
	// 第 41 変数初期値： i_ISSUE_REMAIN_QTY
	final static String i_ISSUE_REMAIN_QTY = null;
	// 第 42 変数初期値： i_OD_GNR_TYP
	final static String i_OD_GNR_TYP = null;
	// 第 43 変数初期値： i_SUM_OF_ISSUED_QTY
	final static String i_SUM_OF_ISSUED_QTY = null;
	// 第 44 変数初期値： i_SUM_OF_STOCK_ON_HAND_QTY
	final static String i_SUM_OF_STOCK_ON_HAND_QTY = null;
	// 第 45 変数初期値： i_SUM_OF_ALCD_QTY
	final static String i_SUM_OF_ALCD_QTY = null;
	// 第 46 変数初期値： i_l_JOB_ODR_CD
	final static String i_l_JOB_ODR_CD = null;
	// 第 47 変数初期値： i_l_ALCD_QTY
	final static String i_l_ALCD_QTY = null;
	// 第 48 変数初期値： i_l_STOCK_ON_HAND_QTY
	final static String i_l_STOCK_ON_HAND_QTY = null;
	// 第 49 変数初期値： i_l_ODR_STS_TYP_DN
	final static String i_l_ODR_STS_TYP_DN = null;
	// 第 50 変数初期値： i_l_PRD_DUE_DATE
	final static String i_l_PRD_DUE_DATE = null;
	// 第 51 変数初期値： i_l_TOTAL_RCV_QTY
	final static String i_l_TOTAL_RCV_QTY = null;
	// 第 52 変数初期値： i_l_ODR_START_DATE
	final static String i_l_ODR_START_DATE = null;
	// 第 53 変数初期値： i_l_PRD_START_DATE
	final static String i_l_PRD_START_DATE = null;
	// 第 54 変数初期値： i_STOCK_ON_HAND_QTY
	final static String i_STOCK_ON_HAND_QTY = null;
	// 第 55 変数初期値： i_l_ODR_QTY
	final static String i_l_ODR_QTY = null;
	// 第 56 変数初期値： i_l_ALC_GRP_CD
	final static String i_l_ALC_GRP_CD = null;
	// 第 57 変数初期値： i_l_JOB_ODR_STS_TYP_DN
	final static String i_l_JOB_ODR_STS_TYP_DN = null;
	// 第 58 変数初期値： i_l_ODR_STS_TYP
	final static String i_l_ODR_STS_TYP = null;
	// 第 59 変数初期値： i_l_JOB_ODR_STS_TYP
	final static String i_l_JOB_ODR_STS_TYP = null;
	// 第 60 変数初期値： i_ALLOCATABLE_QTY
	final static String i_ALLOCATABLE_QTY = null;
	// 第 61 変数初期値： i_l_ALLOCATABLE_QTY
	final static String i_l_ALLOCATABLE_QTY = null;
	// 第 62 変数初期値： i_SUM_OF_ALLOCATABLE_QTY
	final static String i_SUM_OF_ALLOCATABLE_QTY = null;
	// 第 63 変数初期値： i_STOCK_UNIT_2
	final static String i_STOCK_UNIT_2 = null;
	// 第 64 変数初期値： i_STOCK_UNIT_3
	final static String i_STOCK_UNIT_3 = null;
	// 第 65 変数初期値： i_STOCK_UNIT_1
	final static String i_STOCK_UNIT_1 = null;
	// 第 66 変数初期値： i_STOCK_UNIT_4
	final static String i_STOCK_UNIT_4 = null;
	// 第 67 変数初期値： i_STOCK_UNIT_5
	final static String i_STOCK_UNIT_5 = null;
	// 第 68 変数初期値： i_STOCK_UNIT_6
	final static String i_STOCK_UNIT_6 = null;
	// 第 69 変数初期値： i_STOCK_UNIT_7
	final static String i_STOCK_UNIT_7 = null;
	// 第 70 変数初期値： i_STOCK_UNIT_8
	final static String i_STOCK_UNIT_8 = null;
	// 第 71 変数初期値： i_STOCK_UNIT_9
	final static String i_STOCK_UNIT_9 = null;
	// 第 72 変数初期値： i_STOCK_UNIT_10
	final static String i_STOCK_UNIT_10 = null;
	// 第 73 変数初期値： i_STOCK_UNIT_11
	final static String i_STOCK_UNIT_11 = null;
	// 第 74 変数初期値： i_SUM_OF_ALC_REMAIN_QTY
	final static String i_SUM_OF_ALC_REMAIN_QTY = null;
	// 第 75 変数初期値： i_l_OD_NO
	final static String i_l_OD_NO = null;
	// 第 76 変数初期値： i_l_JOB_ODR_DETAIL_NO
	final static String i_l_JOB_ODR_DETAIL_NO = null;
	// 第 77 変数初期値： i_l_JOB_ODR_CANCEL_NO
	final static String i_l_JOB_ODR_CANCEL_NO = null;
	// 第 78 変数初期値： i_l_MODIFY_COUNT
	final static String i_l_MODIFY_COUNT = null;
	// 第 79 変数初期値： i_l_JOB_ODR_EXP_TYP
	final static String i_l_JOB_ODR_EXP_TYP = null;
	// 第 80 変数初期値： i_l_MRP_TYP
	final static String i_l_MRP_TYP = null;
	// 第 81 変数初期値： i_JOB_ODR_STS_TYP_2
	final static String i_JOB_ODR_STS_TYP_2 = null;
	// 第 82 変数初期値： i_ALC_GRP_CD_2
	final static String i_ALC_GRP_CD_2 = null;
	// 第 83 変数初期値： i_l_ALC_TYP_2
	final static String i_l_ALC_TYP_2 = null;
	// 第 84 変数初期値： i_l_ALC_TYP_2_DN
	final static String i_l_ALC_TYP_2_DN = null;
	// 第 85 変数初期値： i_l_ISSUEED_QTY
	final static String i_l_ISSUEED_QTY = null;
	// 第 86 変数初期値： i_ALC_TYP_2
	final static String i_ALC_TYP_2 = null;
	// 第 87 変数初期値： i_JOB_ODR_CD_2
	final static String i_JOB_ODR_CD_2 = null;
	// 第 88 変数初期値： i_JOB_ODR_DETAIL_NO_2
	final static String i_JOB_ODR_DETAIL_NO_2 = null;
	// 第 89 変数初期値： i_JOB_ODR_CANCEL_NO_2
	final static String i_JOB_ODR_CANCEL_NO_2 = null;
	// 第 90 変数初期値： i_l_ISSUE_REMAIN_QTY
	final static String i_l_ISSUE_REMAIN_QTY = null;
	// 第 91 変数初期値： i_h_OD_NO
	final static String i_h_OD_NO = null;
	// 第 92 変数初期値： i_ALC_TYP_2_DN
	final static String i_ALC_TYP_2_DN = null;
	// 第 93 変数初期値： i_UNIT_QTY_TYP_DN
	final static String i_UNIT_QTY_TYP_DN = null;
	// 第 94 変数初期値： i_JOB_ODR_STS_TYP_DN_2
	final static String i_JOB_ODR_STS_TYP_DN_2 = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_OD_NO = i_OD_NO;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_ODR_QTY = i_ODR_QTY;
		m_DM_QTY = i_DM_QTY;
		m_ITEM_NAME = i_ITEM_NAME;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_DM_STS_TYP = i_DM_STS_TYP;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_DUE_DATE = i_DUE_DATE;
		m_OD_CALC_FLG = i_OD_CALC_FLG;
		m_JOB_ODR_EXP_TYP = i_JOB_ODR_EXP_TYP;
		m_MRP_TYP = i_MRP_TYP;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_PARENT_OD_NO = i_PARENT_OD_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_SUM_OF_WORK_IN_PROC_QTY = i_SUM_OF_WORK_IN_PROC_QTY;
		m_TOTAL_RCV_QTY = i_TOTAL_RCV_QTY;
		m_ODR_STS_TYP = i_ODR_STS_TYP;
		m_ODR_STS_TYP_DN = i_ODR_STS_TYP_DN;
		m_PRD_DUE_DATE = i_PRD_DUE_DATE;
		m_ODR_START_DATE = i_ODR_START_DATE;
		m_PRD_START_DATE = i_PRD_START_DATE;
		m_JOB_ODR_STS_TYP_DN = i_JOB_ODR_STS_TYP_DN;
		m_OD_MNT_FLG = i_OD_MNT_FLG;
		m_JOB_ODR_ALC_CD = i_JOB_ODR_ALC_CD;
		m_ALC_STOCK_TYP = i_ALC_STOCK_TYP;
		m_ALCD_QTY = i_ALCD_QTY;
		m_ISSUEED_QTY = i_ISSUEED_QTY;
		m_ISSUE_CMPLT_FLG = i_ISSUE_CMPLT_FLG;
		m_DM_STS_TYP_DN = i_DM_STS_TYP_DN;
		m_ITEM_SPOIL = i_ITEM_SPOIL;
		m_SUM_OF_ISSUEED_QTY = i_SUM_OF_ISSUEED_QTY;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_ISSUE_REMAIN_QTY = i_ISSUE_REMAIN_QTY;
		m_OD_GNR_TYP = i_OD_GNR_TYP;
		m_SUM_OF_ISSUED_QTY = i_SUM_OF_ISSUED_QTY;
		m_SUM_OF_STOCK_ON_HAND_QTY = i_SUM_OF_STOCK_ON_HAND_QTY;
		m_SUM_OF_ALCD_QTY = i_SUM_OF_ALCD_QTY;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_ALCD_QTY = i_l_ALCD_QTY;
		m_l_STOCK_ON_HAND_QTY = i_l_STOCK_ON_HAND_QTY;
		m_l_ODR_STS_TYP_DN = i_l_ODR_STS_TYP_DN;
		m_l_PRD_DUE_DATE = i_l_PRD_DUE_DATE;
		m_l_TOTAL_RCV_QTY = i_l_TOTAL_RCV_QTY;
		m_l_ODR_START_DATE = i_l_ODR_START_DATE;
		m_l_PRD_START_DATE = i_l_PRD_START_DATE;
		m_STOCK_ON_HAND_QTY = i_STOCK_ON_HAND_QTY;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_l_JOB_ODR_STS_TYP_DN = i_l_JOB_ODR_STS_TYP_DN;
		m_l_ODR_STS_TYP = i_l_ODR_STS_TYP;
		m_l_JOB_ODR_STS_TYP = i_l_JOB_ODR_STS_TYP;
		m_ALLOCATABLE_QTY = i_ALLOCATABLE_QTY;
		m_l_ALLOCATABLE_QTY = i_l_ALLOCATABLE_QTY;
		m_SUM_OF_ALLOCATABLE_QTY = i_SUM_OF_ALLOCATABLE_QTY;
		m_STOCK_UNIT_2 = i_STOCK_UNIT_2;
		m_STOCK_UNIT_3 = i_STOCK_UNIT_3;
		m_STOCK_UNIT_1 = i_STOCK_UNIT_1;
		m_STOCK_UNIT_4 = i_STOCK_UNIT_4;
		m_STOCK_UNIT_5 = i_STOCK_UNIT_5;
		m_STOCK_UNIT_6 = i_STOCK_UNIT_6;
		m_STOCK_UNIT_7 = i_STOCK_UNIT_7;
		m_STOCK_UNIT_8 = i_STOCK_UNIT_8;
		m_STOCK_UNIT_9 = i_STOCK_UNIT_9;
		m_STOCK_UNIT_10 = i_STOCK_UNIT_10;
		m_STOCK_UNIT_11 = i_STOCK_UNIT_11;
		m_SUM_OF_ALC_REMAIN_QTY = i_SUM_OF_ALC_REMAIN_QTY;
		m_l_OD_NO = i_l_OD_NO;
		m_l_JOB_ODR_DETAIL_NO = i_l_JOB_ODR_DETAIL_NO;
		m_l_JOB_ODR_CANCEL_NO = i_l_JOB_ODR_CANCEL_NO;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_l_JOB_ODR_EXP_TYP = i_l_JOB_ODR_EXP_TYP;
		m_l_MRP_TYP = i_l_MRP_TYP;
		m_JOB_ODR_STS_TYP_2 = i_JOB_ODR_STS_TYP_2;
		m_ALC_GRP_CD_2 = i_ALC_GRP_CD_2;
		m_l_ALC_TYP_2 = i_l_ALC_TYP_2;
		m_l_ALC_TYP_2_DN = i_l_ALC_TYP_2_DN;
		m_l_ISSUEED_QTY = i_l_ISSUEED_QTY;
		m_ALC_TYP_2 = i_ALC_TYP_2;
		m_JOB_ODR_CD_2 = i_JOB_ODR_CD_2;
		m_JOB_ODR_DETAIL_NO_2 = i_JOB_ODR_DETAIL_NO_2;
		m_JOB_ODR_CANCEL_NO_2 = i_JOB_ODR_CANCEL_NO_2;
		m_l_ISSUE_REMAIN_QTY = i_l_ISSUE_REMAIN_QTY;
		m_h_OD_NO = i_h_OD_NO;
		m_ALC_TYP_2_DN = i_ALC_TYP_2_DN;
		m_UNIT_QTY_TYP_DN = i_UNIT_QTY_TYP_DN;
		m_JOB_ODR_STS_TYP_DN_2 = i_JOB_ODR_STS_TYP_DN_2;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
