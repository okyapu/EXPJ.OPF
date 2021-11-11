/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0010/src/com/nec/jp/orteus/metamorBase/AD0010/AD0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0010;

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
 * CLASS     : AD0010010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.17 $ $Date: 2015/03/26 04:00:37 $
 *
 */
//}}user_implement_code_header

public class AD0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** 第 2 変数： m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** 第 3 変数： m_h_SUB_FLG */
	public String m_h_SUB_FLG = null;
	/** 第 4 変数： m_h_flg */
	public String m_h_flg = null;
	/** 第 5 変数： m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;
	/** 第 6 変数： m_OPR_RSLT_TYP_DN */
	public String m_OPR_RSLT_TYP_DN = null;
	/** 第 7 変数： m_h_OPR_INST_QTY */
	public String m_h_OPR_INST_QTY = null;
	/** 第 8 変数： m_h_WORK_ODR_CD */
	public String m_h_WORK_ODR_CD = null;
	/** 第 9 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 10 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 11 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 12 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 13 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 14 変数： m_OPR_INST_START_DATE_ALL */
	public String m_OPR_INST_START_DATE_ALL = null;
	/** 第 15 変数： m_WORK_ODR_DLV_DATE_ALL */
	public String m_WORK_ODR_DLV_DATE_ALL = null;
	/** 第 16 変数： m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** 第 17 変数： m_OPR_RSLT_TYP */
	public String m_OPR_RSLT_TYP = null;
	/** 第 18 変数： m_WORK_IN_PROC_COMMENT */
	public String m_WORK_IN_PROC_COMMENT = null;
	/** 第 19 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 20 変数： m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** 第 21 変数： m_CREATED_PRG_NM */
	public String m_CREATED_PRG_NM = null;
	/** 第 22 変数： m_UPDATED_BY */
	public String m_UPDATED_BY = null;
	/** 第 23 変数： m_UPDATED_PRG_NM */
	public String m_UPDATED_PRG_NM = null;
	/** 第 24 変数： m_h_UNIT_QTY_TYP */
	public String m_h_UNIT_QTY_TYP = null;
	/** 第 25 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 26 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 27 変数： m_h_JOB_ODR_DLV_DATE */
	public String m_h_JOB_ODR_DLV_DATE = null;
	/** 第 28 変数： m_h_PARENT_OD_NO */
	public String m_h_PARENT_OD_NO = null;
	/** 第 29 変数： m_h_DUE_DATE */
	public String m_h_DUE_DATE = null;
	/** 第 30 変数： m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** 第 31 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 32 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 33 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 34 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 35 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 36 変数： m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** 第 37 変数： m_h_JOB_ODR_DLV_DATE_TIME */
	public String m_h_JOB_ODR_DLV_DATE_TIME = null;
	/** 第 38 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 39 変数： m_h_PROC_NO */
	public String m_h_PROC_NO = null;
	/** 第 40 変数： m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** 第 41 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 42 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 43 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 44 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 45 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 46 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 47 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 48 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 49 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 50 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 51 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 52 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 53 変数： m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** 第 54 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 55 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 56 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 57 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 58 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 59 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 60 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 61 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 62 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 63 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 64 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 65 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 66 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 67 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 68 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 69 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 70 変数： m_VEND_CUR_UNIT */
	public String m_VEND_CUR_UNIT = null;
	/** 第 71 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 72 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 73 変数： m_PUCH_SIZE */
	public String m_PUCH_SIZE = null;
	/** 第 74 変数： m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** 第 75 変数： m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** 第 76 変数： m_OWN_PERSON_NAME */
	public String m_OWN_PERSON_NAME = null;
	/** 第 77 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 78 変数： m_HOLIDAY_FLG */
	public String m_HOLIDAY_FLG = null;
	/** 第 79 変数： m_DATE */
	public String m_DATE = null;
	/** 第 80 変数： m_LOG_CD */
	public String m_LOG_CD = null;
	/** 第 81 変数： m_BUSINESS_NAME */
	public String m_BUSINESS_NAME = null;
	/** 第 82 変数： m_MSG_CD */
	public String m_MSG_CD = null;
	/** 第 83 変数： m_MSG */
	public String m_MSG = null;
	/** 第 84 変数： m_DATA_STRING */
	public String m_DATA_STRING = null;
	/** 第 85 変数： m_WORK_ODR_DLV_DATE_TIME */
	public String m_WORK_ODR_DLV_DATE_TIME = null;
	/** 第 86 変数： m_OPR_INST_START_DATE_TIME */
	public String m_OPR_INST_START_DATE_TIME = null;
	/** 第 87 変数： m_ITEM_PLANT_CD */
	public String m_ITEM_PLANT_CD = null;
	/** 第 88 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 89 変数： m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** 第 90 変数： m_PROC_EXPLOSION_FLG */
	public String m_PROC_EXPLOSION_FLG = null;
	/** 第 91 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 92 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 93 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 94 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 95 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 96 変数： m_h_ODR_START_DATE */
	public String m_h_ODR_START_DATE = null;
	/** 第 97 変数： m_h_ODR_START_DATE_TIME */
	public String m_h_ODR_START_DATE_TIME = null;
	/** 第 98 変数： m_h_DUE_DATE_TIME */
	public String m_h_DUE_DATE_TIME = null;
	/** 第 99 変数： m_h_MANHOUR_TYP */
	public String m_h_MANHOUR_TYP = null;
	/** 第 100 変数： m_countOD_NO */
	public String m_countOD_NO = null;
	/** 第 101 変数： m_JOB_ODR_ALC_CD */
	public String m_JOB_ODR_ALC_CD = null;
	/** 第 102 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 103 変数： m_ASP_INSTALL_FLG */
	public String m_ASP_INSTALL_FLG = null;
	/** 第 104 変数： m_CAL_NO */
	public String m_CAL_NO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** 第 2 List変数： l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** 第 3 List変数： l_h_SUB_FLG */
	public List l_h_SUB_FLG = null;

	/** 第 4 List変数： l_h_flg */
	public List l_h_flg = null;

	/** 第 5 List変数： l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;

	/** 第 6 List変数： l_OPR_RSLT_TYP_DN */
	public List l_OPR_RSLT_TYP_DN = null;

	/** 第 7 List変数： l_h_OPR_INST_QTY */
	public List l_h_OPR_INST_QTY = null;

	/** 第 8 List変数： l_h_WORK_ODR_CD */
	public List l_h_WORK_ODR_CD = null;

	/** 第 9 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 10 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 11 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 12 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 13 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 14 List変数： l_OPR_INST_START_DATE_ALL */
	public List l_OPR_INST_START_DATE_ALL = null;

	/** 第 15 List変数： l_WORK_ODR_DLV_DATE_ALL */
	public List l_WORK_ODR_DLV_DATE_ALL = null;

	/** 第 16 List変数： l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** 第 17 List変数： l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** 第 18 List変数： l_WORK_IN_PROC_COMMENT */
	public List l_WORK_IN_PROC_COMMENT = null;

	/** 第 19 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 20 List変数： l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** 第 21 List変数： l_CREATED_PRG_NM */
	public List l_CREATED_PRG_NM = null;

	/** 第 22 List変数： l_UPDATED_BY */
	public List l_UPDATED_BY = null;

	/** 第 23 List変数： l_UPDATED_PRG_NM */
	public List l_UPDATED_PRG_NM = null;

	/** 第 24 List変数： l_h_UNIT_QTY_TYP */
	public List l_h_UNIT_QTY_TYP = null;

	/** 第 25 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 26 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 27 List変数： l_h_JOB_ODR_DLV_DATE */
	public List l_h_JOB_ODR_DLV_DATE = null;

	/** 第 28 List変数： l_h_PARENT_OD_NO */
	public List l_h_PARENT_OD_NO = null;

	/** 第 29 List変数： l_h_DUE_DATE */
	public List l_h_DUE_DATE = null;

	/** 第 30 List変数： l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** 第 31 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 32 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 33 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 34 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 35 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 36 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 37 List変数： l_h_JOB_ODR_DLV_DATE_TIME */
	public List l_h_JOB_ODR_DLV_DATE_TIME = null;

	/** 第 38 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 39 List変数： l_h_PROC_NO */
	public List l_h_PROC_NO = null;

	/** 第 40 List変数： l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** 第 41 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 42 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 43 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 44 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 45 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 46 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 47 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 48 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 49 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 50 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 51 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 52 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 53 List変数： l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** 第 54 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 55 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 56 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 57 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 58 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 59 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 60 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 61 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 62 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 63 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 64 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 65 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 66 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 67 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 68 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 69 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 70 List変数： l_VEND_CUR_UNIT */
	public List l_VEND_CUR_UNIT = null;

	/** 第 71 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 72 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 73 List変数： l_PUCH_SIZE */
	public List l_PUCH_SIZE = null;

	/** 第 74 List変数： l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** 第 75 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 76 List変数： l_OWN_PERSON_NAME */
	public List l_OWN_PERSON_NAME = null;

	/** 第 77 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 78 List変数： l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** 第 79 List変数： l_DATE */
	public List l_DATE = null;

	/** 第 80 List変数： l_LOG_CD */
	public List l_LOG_CD = null;

	/** 第 81 List変数： l_BUSINESS_NAME */
	public List l_BUSINESS_NAME = null;

	/** 第 82 List変数： l_MSG_CD */
	public List l_MSG_CD = null;

	/** 第 83 List変数： l_MSG */
	public List l_MSG = null;

	/** 第 84 List変数： l_DATA_STRING */
	public List l_DATA_STRING = null;

	/** 第 85 List変数： l_WORK_ODR_DLV_DATE_TIME */
	public List l_WORK_ODR_DLV_DATE_TIME = null;

	/** 第 86 List変数： l_OPR_INST_START_DATE_TIME */
	public List l_OPR_INST_START_DATE_TIME = null;

	/** 第 87 List変数： l_ITEM_PLANT_CD */
	public List l_ITEM_PLANT_CD = null;

	/** 第 88 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 89 List変数： l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** 第 90 List変数： l_PROC_EXPLOSION_FLG */
	public List l_PROC_EXPLOSION_FLG = null;

	/** 第 91 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 92 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 93 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 94 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 95 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 96 List変数： l_h_ODR_START_DATE */
	public List l_h_ODR_START_DATE = null;

	/** 第 97 List変数： l_h_ODR_START_DATE_TIME */
	public List l_h_ODR_START_DATE_TIME = null;

	/** 第 98 List変数： l_h_DUE_DATE_TIME */
	public List l_h_DUE_DATE_TIME = null;

	/** 第 99 List変数： l_h_MANHOUR_TYP */
	public List l_h_MANHOUR_TYP = null;

	/** 第 100 List変数： l_countOD_NO */
	public List l_countOD_NO = null;

	/** 第 101 List変数： l_JOB_ODR_ALC_CD */
	public List l_JOB_ODR_ALC_CD = null;

	/** 第 102 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 103 List変数： l_ASP_INSTALL_FLG */
	public List l_ASP_INSTALL_FLG = null;

	/** 第 104 List変数： l_CAL_NO */
	public List l_CAL_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String geth_SUB_FLG() { return m_h_SUB_FLG; }
	public String geth_flg() { return m_h_flg; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }
	public String getOPR_RSLT_TYP_DN() { return m_OPR_RSLT_TYP_DN; }
	public String geth_OPR_INST_QTY() { return m_h_OPR_INST_QTY; }
	public String geth_WORK_ODR_CD() { return m_h_WORK_ODR_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOPR_INST_START_DATE_ALL() { return m_OPR_INST_START_DATE_ALL; }
	public String getWORK_ODR_DLV_DATE_ALL() { return m_WORK_ODR_DLV_DATE_ALL; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public String getWORK_IN_PROC_COMMENT() { return m_WORK_IN_PROC_COMMENT; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getCREATED_PRG_NM() { return m_CREATED_PRG_NM; }
	public String getUPDATED_BY() { return m_UPDATED_BY; }
	public String getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String geth_UNIT_QTY_TYP() { return m_h_UNIT_QTY_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String geth_JOB_ODR_DLV_DATE() { return m_h_JOB_ODR_DLV_DATE; }
	public String geth_PARENT_OD_NO() { return m_h_PARENT_OD_NO; }
	public String geth_DUE_DATE() { return m_h_DUE_DATE; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String geth_JOB_ODR_DLV_DATE_TIME() { return m_h_JOB_ODR_DLV_DATE_TIME; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String geth_PROC_NO() { return m_h_PROC_NO; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getWH_CD() { return m_WH_CD; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getVEND_CUR_UNIT() { return m_VEND_CUR_UNIT; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getPUCH_SIZE() { return m_PUCH_SIZE; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getOWN_PERSON_NAME() { return m_OWN_PERSON_NAME; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getDATE() { return m_DATE; }
	public String getLOG_CD() { return m_LOG_CD; }
	public String getBUSINESS_NAME() { return m_BUSINESS_NAME; }
	public String getMSG_CD() { return m_MSG_CD; }
	public String getMSG() { return m_MSG; }
	public String getDATA_STRING() { return m_DATA_STRING; }
	public String getWORK_ODR_DLV_DATE_TIME() { return m_WORK_ODR_DLV_DATE_TIME; }
	public String getOPR_INST_START_DATE_TIME() { return m_OPR_INST_START_DATE_TIME; }
	public String getITEM_PLANT_CD() { return m_ITEM_PLANT_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getPROC_EXPLOSION_FLG() { return m_PROC_EXPLOSION_FLG; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String geth_ODR_START_DATE() { return m_h_ODR_START_DATE; }
	public String geth_ODR_START_DATE_TIME() { return m_h_ODR_START_DATE_TIME; }
	public String geth_DUE_DATE_TIME() { return m_h_DUE_DATE_TIME; }
	public String geth_MANHOUR_TYP() { return m_h_MANHOUR_TYP; }
	public String getcountOD_NO() { return m_countOD_NO; }
	public String getJOB_ODR_ALC_CD() { return m_JOB_ODR_ALC_CD; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getASP_INSTALL_FLG() { return m_ASP_INSTALL_FLG; }
	public String getCAL_NO() { return m_CAL_NO; }

	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_h_SUB_FLG() { return l_h_SUB_FLG; }
	public List getList_h_flg() { return l_h_flg; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }
	public List getList_OPR_RSLT_TYP_DN() { return l_OPR_RSLT_TYP_DN; }
	public List getList_h_OPR_INST_QTY() { return l_h_OPR_INST_QTY; }
	public List getList_h_WORK_ODR_CD() { return l_h_WORK_ODR_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OPR_INST_START_DATE_ALL() { return l_OPR_INST_START_DATE_ALL; }
	public List getList_WORK_ODR_DLV_DATE_ALL() { return l_WORK_ODR_DLV_DATE_ALL; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_WORK_IN_PROC_COMMENT() { return l_WORK_IN_PROC_COMMENT; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_CREATED_PRG_NM() { return l_CREATED_PRG_NM; }
	public List getList_UPDATED_BY() { return l_UPDATED_BY; }
	public List getList_UPDATED_PRG_NM() { return l_UPDATED_PRG_NM; }
	public List getList_h_UNIT_QTY_TYP() { return l_h_UNIT_QTY_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_h_JOB_ODR_DLV_DATE() { return l_h_JOB_ODR_DLV_DATE; }
	public List getList_h_PARENT_OD_NO() { return l_h_PARENT_OD_NO; }
	public List getList_h_DUE_DATE() { return l_h_DUE_DATE; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_h_JOB_ODR_DLV_DATE_TIME() { return l_h_JOB_ODR_DLV_DATE_TIME; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_h_PROC_NO() { return l_h_PROC_NO; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_VEND_CUR_UNIT() { return l_VEND_CUR_UNIT; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_PUCH_SIZE() { return l_PUCH_SIZE; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_OWN_PERSON_NAME() { return l_OWN_PERSON_NAME; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_DATE() { return l_DATE; }
	public List getList_LOG_CD() { return l_LOG_CD; }
	public List getList_BUSINESS_NAME() { return l_BUSINESS_NAME; }
	public List getList_MSG_CD() { return l_MSG_CD; }
	public List getList_MSG() { return l_MSG; }
	public List getList_DATA_STRING() { return l_DATA_STRING; }
	public List getList_WORK_ODR_DLV_DATE_TIME() { return l_WORK_ODR_DLV_DATE_TIME; }
	public List getList_OPR_INST_START_DATE_TIME() { return l_OPR_INST_START_DATE_TIME; }
	public List getList_ITEM_PLANT_CD() { return l_ITEM_PLANT_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_PROC_EXPLOSION_FLG() { return l_PROC_EXPLOSION_FLG; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_h_ODR_START_DATE() { return l_h_ODR_START_DATE; }
	public List getList_h_ODR_START_DATE_TIME() { return l_h_ODR_START_DATE_TIME; }
	public List getList_h_DUE_DATE_TIME() { return l_h_DUE_DATE_TIME; }
	public List getList_h_MANHOUR_TYP() { return l_h_MANHOUR_TYP; }
	public List getList_countOD_NO() { return l_countOD_NO; }
	public List getList_JOB_ODR_ALC_CD() { return l_JOB_ODR_ALC_CD; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_ASP_INSTALL_FLG() { return l_ASP_INSTALL_FLG; }
	public List getList_CAL_NO() { return l_CAL_NO; }

	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void seth_SUB_FLG(String val) { m_h_SUB_FLG = val; }
	public void seth_flg(String val) { m_h_flg = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }
	public void setOPR_RSLT_TYP_DN(String val) { m_OPR_RSLT_TYP_DN = val; }
	public void seth_OPR_INST_QTY(String val) { m_h_OPR_INST_QTY = val; }
	public void seth_WORK_ODR_CD(String val) { m_h_WORK_ODR_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOPR_INST_START_DATE_ALL(String val) { m_OPR_INST_START_DATE_ALL = val; }
	public void setWORK_ODR_DLV_DATE_ALL(String val) { m_WORK_ODR_DLV_DATE_ALL = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = val; }
	public void setWORK_IN_PROC_COMMENT(String val) { m_WORK_IN_PROC_COMMENT = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setCREATED_PRG_NM(String val) { m_CREATED_PRG_NM = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void seth_UNIT_QTY_TYP(String val) { m_h_UNIT_QTY_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void seth_JOB_ODR_DLV_DATE(String val) { m_h_JOB_ODR_DLV_DATE = val; }
	public void seth_PARENT_OD_NO(String val) { m_h_PARENT_OD_NO = val; }
	public void seth_DUE_DATE(String val) { m_h_DUE_DATE = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void seth_JOB_ODR_DLV_DATE_TIME(String val) { m_h_JOB_ODR_DLV_DATE_TIME = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void seth_PROC_NO(String val) { m_h_PROC_NO = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setVEND_CUR_UNIT(String val) { m_VEND_CUR_UNIT = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setPUCH_SIZE(String val) { m_PUCH_SIZE = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setOWN_PERSON_NAME(String val) { m_OWN_PERSON_NAME = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = val; }
	public void setDATE(String val) { m_DATE = val; }
	public void setLOG_CD(String val) { m_LOG_CD = val; }
	public void setBUSINESS_NAME(String val) { m_BUSINESS_NAME = val; }
	public void setMSG_CD(String val) { m_MSG_CD = val; }
	public void setMSG(String val) { m_MSG = val; }
	public void setDATA_STRING(String val) { m_DATA_STRING = val; }
	public void setWORK_ODR_DLV_DATE_TIME(String val) { m_WORK_ODR_DLV_DATE_TIME = val; }
	public void setOPR_INST_START_DATE_TIME(String val) { m_OPR_INST_START_DATE_TIME = val; }
	public void setITEM_PLANT_CD(String val) { m_ITEM_PLANT_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setPROC_EXPLOSION_FLG(String val) { m_PROC_EXPLOSION_FLG = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void seth_ODR_START_DATE(String val) { m_h_ODR_START_DATE = val; }
	public void seth_ODR_START_DATE_TIME(String val) { m_h_ODR_START_DATE_TIME = val; }
	public void seth_DUE_DATE_TIME(String val) { m_h_DUE_DATE_TIME = val; }
	public void seth_MANHOUR_TYP(String val) { m_h_MANHOUR_TYP = val; }
	public void setcountOD_NO(String val) { m_countOD_NO = val; }
	public void setJOB_ODR_ALC_CD(String val) { m_JOB_ODR_ALC_CD = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setASP_INSTALL_FLG(String val) { m_ASP_INSTALL_FLG = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }


	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_h_SUB_FLG(List list) { l_h_SUB_FLG = list; }
	public void setList_h_flg(List list) { l_h_flg = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }
	public void setList_OPR_RSLT_TYP_DN(List list) { l_OPR_RSLT_TYP_DN = list; }
	public void setList_h_OPR_INST_QTY(List list) { l_h_OPR_INST_QTY = list; }
	public void setList_h_WORK_ODR_CD(List list) { l_h_WORK_ODR_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OPR_INST_START_DATE_ALL(List list) { l_OPR_INST_START_DATE_ALL = list; }
	public void setList_WORK_ODR_DLV_DATE_ALL(List list) { l_WORK_ODR_DLV_DATE_ALL = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_WORK_IN_PROC_COMMENT(List list) { l_WORK_IN_PROC_COMMENT = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_CREATED_PRG_NM(List list) { l_CREATED_PRG_NM = list; }
	public void setList_UPDATED_BY(List list) { l_UPDATED_BY = list; }
	public void setList_UPDATED_PRG_NM(List list) { l_UPDATED_PRG_NM = list; }
	public void setList_h_UNIT_QTY_TYP(List list) { l_h_UNIT_QTY_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_h_JOB_ODR_DLV_DATE(List list) { l_h_JOB_ODR_DLV_DATE = list; }
	public void setList_h_PARENT_OD_NO(List list) { l_h_PARENT_OD_NO = list; }
	public void setList_h_DUE_DATE(List list) { l_h_DUE_DATE = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_h_JOB_ODR_DLV_DATE_TIME(List list) { l_h_JOB_ODR_DLV_DATE_TIME = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_h_PROC_NO(List list) { l_h_PROC_NO = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_VEND_CUR_UNIT(List list) { l_VEND_CUR_UNIT = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_PUCH_SIZE(List list) { l_PUCH_SIZE = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_OWN_PERSON_NAME(List list) { l_OWN_PERSON_NAME = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_DATE(List list) { l_DATE = list; }
	public void setList_LOG_CD(List list) { l_LOG_CD = list; }
	public void setList_BUSINESS_NAME(List list) { l_BUSINESS_NAME = list; }
	public void setList_MSG_CD(List list) { l_MSG_CD = list; }
	public void setList_MSG(List list) { l_MSG = list; }
	public void setList_DATA_STRING(List list) { l_DATA_STRING = list; }
	public void setList_WORK_ODR_DLV_DATE_TIME(List list) { l_WORK_ODR_DLV_DATE_TIME = list; }
	public void setList_OPR_INST_START_DATE_TIME(List list) { l_OPR_INST_START_DATE_TIME = list; }
	public void setList_ITEM_PLANT_CD(List list) { l_ITEM_PLANT_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_PROC_EXPLOSION_FLG(List list) { l_PROC_EXPLOSION_FLG = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_h_ODR_START_DATE(List list) { l_h_ODR_START_DATE = list; }
	public void setList_h_ODR_START_DATE_TIME(List list) { l_h_ODR_START_DATE_TIME = list; }
	public void setList_h_DUE_DATE_TIME(List list) { l_h_DUE_DATE_TIME = list; }
	public void setList_h_MANHOUR_TYP(List list) { l_h_MANHOUR_TYP = list; }
	public void setList_countOD_NO(List list) { l_countOD_NO = list; }
	public void setList_JOB_ODR_ALC_CD(List list) { l_JOB_ODR_ALC_CD = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_ASP_INSTALL_FLG(List list) { l_ASP_INSTALL_FLG = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }

	public int setL2L_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_name == null) {
			l_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_name.add(((AD0010010Struct) list.get(i)).getOUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_val == null) {
			l_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_val.add(((AD0010010Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_h_SUB_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SUB_FLG == null) {
			l_h_SUB_FLG = new ArrayList();
		} else {
			l_h_SUB_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SUB_FLG.add(((AD0010010Struct) list.get(i)).geth_SUB_FLG());
		}
		return size;
	}
	public int setL2L_h_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_flg == null) {
			l_h_flg = new ArrayList();
		} else {
			l_h_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_flg.add(((AD0010010Struct) list.get(i)).geth_flg());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_DN == null) {
			l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_DN.add(((AD0010010Struct) list.get(i)).getMRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_DN == null) {
			l_OPR_RSLT_TYP_DN = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_DN.add(((AD0010010Struct) list.get(i)).getOPR_RSLT_TYP_DN());
		}
		return size;
	}
	public int setL2L_h_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_INST_QTY == null) {
			l_h_OPR_INST_QTY = new ArrayList();
		} else {
			l_h_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_INST_QTY.add(((AD0010010Struct) list.get(i)).geth_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_h_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_ODR_CD == null) {
			l_h_WORK_ODR_CD = new ArrayList();
		} else {
			l_h_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_ODR_CD.add(((AD0010010Struct) list.get(i)).geth_WORK_ODR_CD());
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
			l_WORK_ODR_CD.add(((AD0010010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_PLANT_CD.add(((AD0010010Struct) list.get(i)).getPLANT_CD());
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
			l_OD_NO.add(((AD0010010Struct) list.get(i)).getOD_NO());
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
			l_ITEM_CD.add(((AD0010010Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0010010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_ALL == null) {
			l_OPR_INST_START_DATE_ALL = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_ALL.add(((AD0010010Struct) list.get(i)).getOPR_INST_START_DATE_ALL());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_ALL == null) {
			l_WORK_ODR_DLV_DATE_ALL = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_ALL.add(((AD0010010Struct) list.get(i)).getWORK_ODR_DLV_DATE_ALL());
		}
		return size;
	}
	public int setL2L_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_QTY == null) {
			l_OPR_INST_QTY = new ArrayList();
		} else {
			l_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_QTY.add(((AD0010010Struct) list.get(i)).getOPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP == null) {
			l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP.add(((AD0010010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_COMMENT == null) {
			l_WORK_IN_PROC_COMMENT = new ArrayList();
		} else {
			l_WORK_IN_PROC_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_COMMENT.add(((AD0010010Struct) list.get(i)).getWORK_IN_PROC_COMMENT());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AD0010010Struct) list.get(i)).getOPR_INST_CD());
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
			l_CREATED_BY.add(((AD0010010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM == null) {
			l_CREATED_PRG_NM = new ArrayList();
		} else {
			l_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM.add(((AD0010010Struct) list.get(i)).getCREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_BY == null) {
			l_UPDATED_BY = new ArrayList();
		} else {
			l_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_BY.add(((AD0010010Struct) list.get(i)).getUPDATED_BY());
		}
		return size;
	}
	public int setL2L_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_PRG_NM == null) {
			l_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_PRG_NM.add(((AD0010010Struct) list.get(i)).getUPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_h_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_QTY_TYP == null) {
			l_h_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_h_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_QTY_TYP.add(((AD0010010Struct) list.get(i)).geth_UNIT_QTY_TYP());
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
			l_MRP_ODR_TYP.add(((AD0010010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_JOB_ODR_CD.add(((AD0010010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_DLV_DATE == null) {
			l_h_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_h_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_DLV_DATE.add(((AD0010010Struct) list.get(i)).geth_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_h_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARENT_OD_NO == null) {
			l_h_PARENT_OD_NO = new ArrayList();
		} else {
			l_h_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARENT_OD_NO.add(((AD0010010Struct) list.get(i)).geth_PARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_h_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DUE_DATE == null) {
			l_h_DUE_DATE = new ArrayList();
		} else {
			l_h_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DUE_DATE.add(((AD0010010Struct) list.get(i)).geth_DUE_DATE());
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
			l_h_BUSINESS_OPR_DATE.add(((AD0010010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((AD0010010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AD0010010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AD0010010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AD0010010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AD0010010Struct) list.get(i)).getPROP_LOT_SIZE());
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
			l_ODR_START_DATE.add(((AD0010010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_DLV_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_DLV_DATE_TIME == null) {
			l_h_JOB_ODR_DLV_DATE_TIME = new ArrayList();
		} else {
			l_h_JOB_ODR_DLV_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_DLV_DATE_TIME.add(((AD0010010Struct) list.get(i)).geth_JOB_ODR_DLV_DATE_TIME());
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
			l_JOB_ODR_TYP.add(((AD0010010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROC_NO == null) {
			l_h_PROC_NO = new ArrayList();
		} else {
			l_h_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROC_NO.add(((AD0010010Struct) list.get(i)).geth_PROC_NO());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE == null) {
			l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE.add(((AD0010010Struct) list.get(i)).getWORK_ODR_DLV_DATE());
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
			l_PUCH_ODR_CD.add(((AD0010010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_COMPANY_CD.add(((AD0010010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AD0010010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AD0010010Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_UNIT_COST_TYP.add(((AD0010010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AD0010010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AD0010010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AD0010010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AD0010010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_AMOUNT == null) {
			l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_AMOUNT.add(((AD0010010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP == null) {
			l_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP.add(((AD0010010Struct) list.get(i)).getSPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP == null) {
			l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP.add(((AD0010010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RATE_JUDGE_DATE == null) {
			l_RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RATE_JUDGE_DATE.add(((AD0010010Struct) list.get(i)).getRATE_JUDGE_DATE());
		}
		return size;
	}
	public int setL2L_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_1 == null) {
			l_TAX_RATE_1 = new ArrayList();
		} else {
			l_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_1.add(((AD0010010Struct) list.get(i)).getTAX_RATE_1());
		}
		return size;
	}
	public int setL2L_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_2 == null) {
			l_TAX_RATE_2 = new ArrayList();
		} else {
			l_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_2.add(((AD0010010Struct) list.get(i)).getTAX_RATE_2());
		}
		return size;
	}
	public int setL2L_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_3 == null) {
			l_TAX_RATE_3 = new ArrayList();
		} else {
			l_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_3.add(((AD0010010Struct) list.get(i)).getTAX_RATE_3());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT == null) {
			l_NET_AMOUNT = new ArrayList();
		} else {
			l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT.add(((AD0010010Struct) list.get(i)).getNET_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_1 == null) {
			l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_1.add(((AD0010010Struct) list.get(i)).getTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_2 == null) {
			l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_2.add(((AD0010010Struct) list.get(i)).getTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_3 == null) {
			l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_3.add(((AD0010010Struct) list.get(i)).getTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AMOUNT_INCLUDE_TAX == null) {
			l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AMOUNT_INCLUDE_TAX.add(((AD0010010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_AMOUNT == null) {
			l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_AMOUNT.add(((AD0010010Struct) list.get(i)).getHOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AD0010010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_ROUND_TYP == null) {
			l_TAX_ROUND_TYP = new ArrayList();
		} else {
			l_TAX_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_ROUND_TYP.add(((AD0010010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_WH_CD.add(((AD0010010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((AD0010010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP == null) {
			l_EXCH_TYP = new ArrayList();
		} else {
			l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP.add(((AD0010010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((AD0010010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((AD0010010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_VEND_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CUR_UNIT == null) {
			l_VEND_CUR_UNIT = new ArrayList();
		} else {
			l_VEND_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CUR_UNIT.add(((AD0010010Struct) list.get(i)).getVEND_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_VEND_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_DECIMAL_FIG == null) {
			l_VEND_DECIMAL_FIG = new ArrayList();
		} else {
			l_VEND_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_DECIMAL_FIG.add(((AD0010010Struct) list.get(i)).getVEND_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AD0010010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_SIZE == null) {
			l_PUCH_SIZE = new ArrayList();
		} else {
			l_PUCH_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_SIZE.add(((AD0010010Struct) list.get(i)).getPUCH_SIZE());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE == null) {
			l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE.add(((AD0010010Struct) list.get(i)).getOPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP == null) {
			l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP.add(((AD0010010Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_NAME == null) {
			l_OWN_PERSON_NAME = new ArrayList();
		} else {
			l_OWN_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_NAME.add(((AD0010010Struct) list.get(i)).getOWN_PERSON_NAME());
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
			l_ROUND_TYP.add(((AD0010010Struct) list.get(i)).getROUND_TYP());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AD0010010Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATE == null) {
			l_DATE = new ArrayList();
		} else {
			l_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATE.add(((AD0010010Struct) list.get(i)).getDATE());
		}
		return size;
	}
	public int setL2L_LOG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOG_CD == null) {
			l_LOG_CD = new ArrayList();
		} else {
			l_LOG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOG_CD.add(((AD0010010Struct) list.get(i)).getLOG_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_NAME == null) {
			l_BUSINESS_NAME = new ArrayList();
		} else {
			l_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_NAME.add(((AD0010010Struct) list.get(i)).getBUSINESS_NAME());
		}
		return size;
	}
	public int setL2L_MSG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG_CD == null) {
			l_MSG_CD = new ArrayList();
		} else {
			l_MSG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG_CD.add(((AD0010010Struct) list.get(i)).getMSG_CD());
		}
		return size;
	}
	public int setL2L_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG == null) {
			l_MSG = new ArrayList();
		} else {
			l_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG.add(((AD0010010Struct) list.get(i)).getMSG());
		}
		return size;
	}
	public int setL2L_DATA_STRING(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_STRING == null) {
			l_DATA_STRING = new ArrayList();
		} else {
			l_DATA_STRING.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_STRING.add(((AD0010010Struct) list.get(i)).getDATA_STRING());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_TIME == null) {
			l_WORK_ODR_DLV_DATE_TIME = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_TIME.add(((AD0010010Struct) list.get(i)).getWORK_ODR_DLV_DATE_TIME());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_TIME == null) {
			l_OPR_INST_START_DATE_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_TIME.add(((AD0010010Struct) list.get(i)).getOPR_INST_START_DATE_TIME());
		}
		return size;
	}
	public int setL2L_ITEM_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PLANT_CD == null) {
			l_ITEM_PLANT_CD = new ArrayList();
		} else {
			l_ITEM_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PLANT_CD.add(((AD0010010Struct) list.get(i)).getITEM_PLANT_CD());
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
			l_WS_NAME.add(((AD0010010Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_STS_TYP == null) {
			l_WORK_STS_TYP = new ArrayList();
		} else {
			l_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_STS_TYP.add(((AD0010010Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXPLOSION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXPLOSION_FLG == null) {
			l_PROC_EXPLOSION_FLG = new ArrayList();
		} else {
			l_PROC_EXPLOSION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXPLOSION_FLG.add(((AD0010010Struct) list.get(i)).getPROC_EXPLOSION_FLG());
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
			l_ITEM_NAME.add(((AD0010010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AD0010010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0010010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AD0010010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_OUTSIDE_TYP.add(((AD0010010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_START_DATE == null) {
			l_h_ODR_START_DATE = new ArrayList();
		} else {
			l_h_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_START_DATE.add(((AD0010010Struct) list.get(i)).geth_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_h_ODR_START_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_START_DATE_TIME == null) {
			l_h_ODR_START_DATE_TIME = new ArrayList();
		} else {
			l_h_ODR_START_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_START_DATE_TIME.add(((AD0010010Struct) list.get(i)).geth_ODR_START_DATE_TIME());
		}
		return size;
	}
	public int setL2L_h_DUE_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DUE_DATE_TIME == null) {
			l_h_DUE_DATE_TIME = new ArrayList();
		} else {
			l_h_DUE_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DUE_DATE_TIME.add(((AD0010010Struct) list.get(i)).geth_DUE_DATE_TIME());
		}
		return size;
	}
	public int setL2L_h_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MANHOUR_TYP == null) {
			l_h_MANHOUR_TYP = new ArrayList();
		} else {
			l_h_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MANHOUR_TYP.add(((AD0010010Struct) list.get(i)).geth_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_countOD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_countOD_NO == null) {
			l_countOD_NO = new ArrayList();
		} else {
			l_countOD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_countOD_NO.add(((AD0010010Struct) list.get(i)).getcountOD_NO());
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
			l_JOB_ODR_ALC_CD.add(((AD0010010Struct) list.get(i)).getJOB_ODR_ALC_CD());
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
			l_TIME_CTRL.add(((AD0010010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_ASP_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASP_INSTALL_FLG == null) {
			l_ASP_INSTALL_FLG = new ArrayList();
		} else {
			l_ASP_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASP_INSTALL_FLG.add(((AD0010010Struct) list.get(i)).getASP_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AD0010010Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_h_SUB_FLG = null;
		m_h_flg = null;
		m_MRP_ODR_TYP_DN = null;
		m_OPR_RSLT_TYP_DN = null;
		m_h_OPR_INST_QTY = null;
		m_h_WORK_ODR_CD = null;
		m_WORK_ODR_CD = null;
		m_PLANT_CD = null;
		m_OD_NO = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_OPR_INST_START_DATE_ALL = null;
		m_WORK_ODR_DLV_DATE_ALL = null;
		m_OPR_INST_QTY = null;
		m_OPR_RSLT_TYP = null;
		m_WORK_IN_PROC_COMMENT = null;
		m_OPR_INST_CD = null;
		m_CREATED_BY = null;
		m_CREATED_PRG_NM = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_h_UNIT_QTY_TYP = null;
		m_MRP_ODR_TYP = null;
		m_JOB_ODR_CD = null;
		m_h_JOB_ODR_DLV_DATE = null;
		m_h_PARENT_OD_NO = null;
		m_h_DUE_DATE = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_h_MODIFY_COUNT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_PROP_LOT_SIZE = null;
		m_ODR_START_DATE = null;
		m_h_JOB_ODR_DLV_DATE_TIME = null;
		m_JOB_ODR_TYP = null;
		m_h_PROC_NO = null;
		m_WORK_ODR_DLV_DATE = null;
		m_PUCH_ODR_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_ODR_AMOUNT = null;
		m_SPL_ITEM_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_RATE_JUDGE_DATE = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_NET_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_TAX_CD = null;
		m_TAX_ROUND_TYP = null;
		m_WH_CD = null;
		m_EXCH_RATE = null;
		m_EXCH_TYP = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_VEND_CUR_UNIT = null;
		m_VEND_DECIMAL_FIG = null;
		m_EFF_PHASE_IN_DATE = null;
		m_PUCH_SIZE = null;
		m_OPR_INST_START_DATE = null;
		m_TAX_APPLY_TYP = null;
		m_OWN_PERSON_NAME = null;
		m_ROUND_TYP = null;
		m_HOLIDAY_FLG = null;
		m_DATE = null;
		m_LOG_CD = null;
		m_BUSINESS_NAME = null;
		m_MSG_CD = null;
		m_MSG = null;
		m_DATA_STRING = null;
		m_WORK_ODR_DLV_DATE_TIME = null;
		m_OPR_INST_START_DATE_TIME = null;
		m_ITEM_PLANT_CD = null;
		m_WS_NAME = null;
		m_WORK_STS_TYP = null;
		m_PROC_EXPLOSION_FLG = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_OUTSIDE_TYP = null;
		m_h_ODR_START_DATE = null;
		m_h_ODR_START_DATE_TIME = null;
		m_h_DUE_DATE_TIME = null;
		m_h_MANHOUR_TYP = null;
		m_countOD_NO = null;
		m_JOB_ODR_ALC_CD = null;
		m_TIME_CTRL = null;
		m_ASP_INSTALL_FLG = null;
		m_CAL_NO = null;

		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_h_SUB_FLG = null;
		l_h_flg = null;
		l_MRP_ODR_TYP_DN = null;
		l_OPR_RSLT_TYP_DN = null;
		l_h_OPR_INST_QTY = null;
		l_h_WORK_ODR_CD = null;
		l_WORK_ODR_CD = null;
		l_PLANT_CD = null;
		l_OD_NO = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_OPR_INST_START_DATE_ALL = null;
		l_WORK_ODR_DLV_DATE_ALL = null;
		l_OPR_INST_QTY = null;
		l_OPR_RSLT_TYP = null;
		l_WORK_IN_PROC_COMMENT = null;
		l_OPR_INST_CD = null;
		l_CREATED_BY = null;
		l_CREATED_PRG_NM = null;
		l_UPDATED_BY = null;
		l_UPDATED_PRG_NM = null;
		l_h_UNIT_QTY_TYP = null;
		l_MRP_ODR_TYP = null;
		l_JOB_ODR_CD = null;
		l_h_JOB_ODR_DLV_DATE = null;
		l_h_PARENT_OD_NO = null;
		l_h_DUE_DATE = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_h_MODIFY_COUNT = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_PROP_LOT_SIZE = null;
		l_ODR_START_DATE = null;
		l_h_JOB_ODR_DLV_DATE_TIME = null;
		l_JOB_ODR_TYP = null;
		l_h_PROC_NO = null;
		l_WORK_ODR_DLV_DATE = null;
		l_PUCH_ODR_CD = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_ODR_AMOUNT = null;
		l_SPL_ITEM_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_RATE_JUDGE_DATE = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_NET_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_TAX_CD = null;
		l_TAX_ROUND_TYP = null;
		l_WH_CD = null;
		l_EXCH_RATE = null;
		l_EXCH_TYP = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_VEND_CUR_UNIT = null;
		l_VEND_DECIMAL_FIG = null;
		l_EFF_PHASE_IN_DATE = null;
		l_PUCH_SIZE = null;
		l_OPR_INST_START_DATE = null;
		l_TAX_APPLY_TYP = null;
		l_OWN_PERSON_NAME = null;
		l_ROUND_TYP = null;
		l_HOLIDAY_FLG = null;
		l_DATE = null;
		l_LOG_CD = null;
		l_BUSINESS_NAME = null;
		l_MSG_CD = null;
		l_MSG = null;
		l_DATA_STRING = null;
		l_WORK_ODR_DLV_DATE_TIME = null;
		l_OPR_INST_START_DATE_TIME = null;
		l_ITEM_PLANT_CD = null;
		l_WS_NAME = null;
		l_WORK_STS_TYP = null;
		l_PROC_EXPLOSION_FLG = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_OUTSIDE_TYP = null;
		l_h_ODR_START_DATE = null;
		l_h_ODR_START_DATE_TIME = null;
		l_h_DUE_DATE_TIME = null;
		l_h_MANHOUR_TYP = null;
		l_countOD_NO = null;
		l_JOB_ODR_ALC_CD = null;
		l_TIME_CTRL = null;
		l_ASP_INSTALL_FLG = null;
		l_CAL_NO = null;

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
	 * medAD0010010クラスの標準コンストラクタ
	 */
	public AD0010010Struct()
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
	public void setStruct(AD0010010Struct struct)
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
	public void setStructM(AD0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.seth_SUB_FLG(struct.geth_SUB_FLG());
			this.seth_flg(struct.geth_flg());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
			this.setOPR_RSLT_TYP_DN(struct.getOPR_RSLT_TYP_DN());
			this.seth_OPR_INST_QTY(struct.geth_OPR_INST_QTY());
			this.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setOPR_INST_START_DATE_ALL(struct.getOPR_INST_START_DATE_ALL());
			this.setWORK_ODR_DLV_DATE_ALL(struct.getWORK_ODR_DLV_DATE_ALL());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setWORK_IN_PROC_COMMENT(struct.getWORK_IN_PROC_COMMENT());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setCREATED_PRG_NM(struct.getCREATED_PRG_NM());
			this.setUPDATED_BY(struct.getUPDATED_BY());
			this.setUPDATED_PRG_NM(struct.getUPDATED_PRG_NM());
			this.seth_UNIT_QTY_TYP(struct.geth_UNIT_QTY_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.seth_JOB_ODR_DLV_DATE(struct.geth_JOB_ODR_DLV_DATE());
			this.seth_PARENT_OD_NO(struct.geth_PARENT_OD_NO());
			this.seth_DUE_DATE(struct.geth_DUE_DATE());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.seth_JOB_ODR_DLV_DATE_TIME(struct.geth_JOB_ODR_DLV_DATE_TIME());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.seth_PROC_NO(struct.geth_PROC_NO());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setWH_CD(struct.getWH_CD());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setVEND_CUR_UNIT(struct.getVEND_CUR_UNIT());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setPUCH_SIZE(struct.getPUCH_SIZE());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setOWN_PERSON_NAME(struct.getOWN_PERSON_NAME());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setDATE(struct.getDATE());
			this.setLOG_CD(struct.getLOG_CD());
			this.setBUSINESS_NAME(struct.getBUSINESS_NAME());
			this.setMSG_CD(struct.getMSG_CD());
			this.setMSG(struct.getMSG());
			this.setDATA_STRING(struct.getDATA_STRING());
			this.setWORK_ODR_DLV_DATE_TIME(struct.getWORK_ODR_DLV_DATE_TIME());
			this.setOPR_INST_START_DATE_TIME(struct.getOPR_INST_START_DATE_TIME());
			this.setITEM_PLANT_CD(struct.getITEM_PLANT_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setPROC_EXPLOSION_FLG(struct.getPROC_EXPLOSION_FLG());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.seth_ODR_START_DATE(struct.geth_ODR_START_DATE());
			this.seth_ODR_START_DATE_TIME(struct.geth_ODR_START_DATE_TIME());
			this.seth_DUE_DATE_TIME(struct.geth_DUE_DATE_TIME());
			this.seth_MANHOUR_TYP(struct.geth_MANHOUR_TYP());
			this.setcountOD_NO(struct.getcountOD_NO());
			this.setJOB_ODR_ALC_CD(struct.getJOB_ODR_ALC_CD());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setASP_INSTALL_FLG(struct.getASP_INSTALL_FLG());
			this.setCAL_NO(struct.getCAL_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_h_SUB_FLG(struct.getList_h_SUB_FLG());
			this.setList_h_flg(struct.getList_h_flg());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
			this.setList_OPR_RSLT_TYP_DN(struct.getList_OPR_RSLT_TYP_DN());
			this.setList_h_OPR_INST_QTY(struct.getList_h_OPR_INST_QTY());
			this.setList_h_WORK_ODR_CD(struct.getList_h_WORK_ODR_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OPR_INST_START_DATE_ALL(struct.getList_OPR_INST_START_DATE_ALL());
			this.setList_WORK_ODR_DLV_DATE_ALL(struct.getList_WORK_ODR_DLV_DATE_ALL());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_WORK_IN_PROC_COMMENT(struct.getList_WORK_IN_PROC_COMMENT());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_CREATED_PRG_NM(struct.getList_CREATED_PRG_NM());
			this.setList_UPDATED_BY(struct.getList_UPDATED_BY());
			this.setList_UPDATED_PRG_NM(struct.getList_UPDATED_PRG_NM());
			this.setList_h_UNIT_QTY_TYP(struct.getList_h_UNIT_QTY_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_h_JOB_ODR_DLV_DATE(struct.getList_h_JOB_ODR_DLV_DATE());
			this.setList_h_PARENT_OD_NO(struct.getList_h_PARENT_OD_NO());
			this.setList_h_DUE_DATE(struct.getList_h_DUE_DATE());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_h_JOB_ODR_DLV_DATE_TIME(struct.getList_h_JOB_ODR_DLV_DATE_TIME());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_h_PROC_NO(struct.getList_h_PROC_NO());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_VEND_CUR_UNIT(struct.getList_VEND_CUR_UNIT());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_PUCH_SIZE(struct.getList_PUCH_SIZE());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_OWN_PERSON_NAME(struct.getList_OWN_PERSON_NAME());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_DATE(struct.getList_DATE());
			this.setList_LOG_CD(struct.getList_LOG_CD());
			this.setList_BUSINESS_NAME(struct.getList_BUSINESS_NAME());
			this.setList_MSG_CD(struct.getList_MSG_CD());
			this.setList_MSG(struct.getList_MSG());
			this.setList_DATA_STRING(struct.getList_DATA_STRING());
			this.setList_WORK_ODR_DLV_DATE_TIME(struct.getList_WORK_ODR_DLV_DATE_TIME());
			this.setList_OPR_INST_START_DATE_TIME(struct.getList_OPR_INST_START_DATE_TIME());
			this.setList_ITEM_PLANT_CD(struct.getList_ITEM_PLANT_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_PROC_EXPLOSION_FLG(struct.getList_PROC_EXPLOSION_FLG());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_h_ODR_START_DATE(struct.getList_h_ODR_START_DATE());
			this.setList_h_ODR_START_DATE_TIME(struct.getList_h_ODR_START_DATE_TIME());
			this.setList_h_DUE_DATE_TIME(struct.getList_h_DUE_DATE_TIME());
			this.setList_h_MANHOUR_TYP(struct.getList_h_MANHOUR_TYP());
			this.setList_countOD_NO(struct.getList_countOD_NO());
			this.setList_JOB_ODR_ALC_CD(struct.getList_JOB_ODR_ALC_CD());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_ASP_INSTALL_FLG(struct.getList_ASP_INSTALL_FLG());
			this.setList_CAL_NO(struct.getList_CAL_NO());
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
	// 第 1 変数初期値： i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// 第 2 変数初期値： i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// 第 3 変数初期値： i_h_SUB_FLG


	final static String i_h_SUB_FLG = null;

	// 第 4 変数初期値： i_h_flg


	final static String i_h_flg = null;

	// 第 5 変数初期値： i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

	// 第 6 変数初期値： i_OPR_RSLT_TYP_DN


	final static String i_OPR_RSLT_TYP_DN = null;

	// 第 7 変数初期値： i_h_OPR_INST_QTY


	final static String i_h_OPR_INST_QTY = null;

	// 第 8 変数初期値： i_h_WORK_ODR_CD


	final static String i_h_WORK_ODR_CD = null;

	// 第 9 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 10 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 11 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 12 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 13 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 14 変数初期値： i_OPR_INST_START_DATE_ALL


	final static String i_OPR_INST_START_DATE_ALL = null;

	// 第 15 変数初期値： i_WORK_ODR_DLV_DATE_ALL


	final static String i_WORK_ODR_DLV_DATE_ALL = null;

	// 第 16 変数初期値： i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// 第 17 変数初期値： i_OPR_RSLT_TYP


	final static String i_OPR_RSLT_TYP = null;

	// 第 18 変数初期値： i_WORK_IN_PROC_COMMENT


	final static String i_WORK_IN_PROC_COMMENT = null;

	// 第 19 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 20 変数初期値： i_CREATED_BY


	final static String i_CREATED_BY = null;

	// 第 21 変数初期値： i_CREATED_PRG_NM


	final static String i_CREATED_PRG_NM = null;

	// 第 22 変数初期値： i_UPDATED_BY


	final static String i_UPDATED_BY = null;

	// 第 23 変数初期値： i_UPDATED_PRG_NM


	final static String i_UPDATED_PRG_NM = null;

	// 第 24 変数初期値： i_h_UNIT_QTY_TYP


	final static String i_h_UNIT_QTY_TYP = null;

	// 第 25 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 26 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 27 変数初期値： i_h_JOB_ODR_DLV_DATE


	final static String i_h_JOB_ODR_DLV_DATE = null;

	// 第 28 変数初期値： i_h_PARENT_OD_NO


	final static String i_h_PARENT_OD_NO = null;

	// 第 29 変数初期値： i_h_DUE_DATE


	final static String i_h_DUE_DATE = null;

	// 第 30 変数初期値： i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 31 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 32 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 33 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 34 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 35 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 36 変数初期値： i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// 第 37 変数初期値： i_h_JOB_ODR_DLV_DATE_TIME


	final static String i_h_JOB_ODR_DLV_DATE_TIME = null;

	// 第 38 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 39 変数初期値： i_h_PROC_NO


	final static String i_h_PROC_NO = null;

	// 第 40 変数初期値： i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// 第 41 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 42 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 43 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 44 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 45 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 46 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 47 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 48 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 49 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 50 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 51 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 52 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 53 変数初期値： i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// 第 54 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 55 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 56 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 57 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 58 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 59 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 60 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 61 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 62 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 63 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 65 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 66 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 67 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 68 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 69 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 70 変数初期値： i_VEND_CUR_UNIT


	final static String i_VEND_CUR_UNIT = null;

	// 第 71 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 72 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 73 変数初期値： i_PUCH_SIZE


	final static String i_PUCH_SIZE = null;

	// 第 74 変数初期値： i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// 第 75 変数初期値： i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// 第 76 変数初期値： i_OWN_PERSON_NAME


	final static String i_OWN_PERSON_NAME = null;

	// 第 77 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 78 変数初期値： i_HOLIDAY_FLG


	final static String i_HOLIDAY_FLG = null;

	// 第 79 変数初期値： i_DATE


	final static String i_DATE = null;

	// 第 80 変数初期値： i_LOG_CD


	final static String i_LOG_CD = null;

	// 第 81 変数初期値： i_BUSINESS_NAME


	final static String i_BUSINESS_NAME = null;

	// 第 82 変数初期値： i_MSG_CD


	final static String i_MSG_CD = null;

	// 第 83 変数初期値： i_MSG


	final static String i_MSG = null;

	// 第 84 変数初期値： i_DATA_STRING


	final static String i_DATA_STRING = null;

	// 第 85 変数初期値： i_WORK_ODR_DLV_DATE_TIME


	final static String i_WORK_ODR_DLV_DATE_TIME = null;

	// 第 86 変数初期値： i_OPR_INST_START_DATE_TIME


	final static String i_OPR_INST_START_DATE_TIME = null;

	// 第 87 変数初期値： i_ITEM_PLANT_CD


	final static String i_ITEM_PLANT_CD = null;

	// 第 88 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 89 変数初期値： i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// 第 90 変数初期値： i_PROC_EXPLOSION_FLG


	final static String i_PROC_EXPLOSION_FLG = null;

	// 第 91 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 92 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 93 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 94 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 95 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 96 変数初期値： i_h_ODR_START_DATE


	final static String i_h_ODR_START_DATE = null;

	// 第 97 変数初期値： i_h_ODR_START_DATE_TIME


	final static String i_h_ODR_START_DATE_TIME = null;

	// 第 98 変数初期値： i_h_DUE_DATE_TIME


	final static String i_h_DUE_DATE_TIME = null;

	// 第 99 変数初期値： i_h_MANHOUR_TYP


	final static String i_h_MANHOUR_TYP = null;

	// 第 100 変数初期値： i_countOD_NO


	final static String i_countOD_NO = null;

	// 第 101 変数初期値： i_JOB_ODR_ALC_CD


	final static String i_JOB_ODR_ALC_CD = null;

	// 第 102 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 103 変数初期値： i_ASP_INSTALL_FLG


	final static String i_ASP_INSTALL_FLG = null;

	// 第 104 変数初期値： i_CAL_NO


	final static String i_CAL_NO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_OUTSIDE_TYP_name

	final static String i_OUTSIDE_TYP_name = null;

	// 第 2 変数初期値： i_OUTSIDE_TYP_val

	final static String i_OUTSIDE_TYP_val = null;

	// 第 3 変数初期値： i_h_SUB_FLG

	final static String i_h_SUB_FLG = null;

	// 第 4 変数初期値： i_h_flg

	final static String i_h_flg = null;

	// 第 5 変数初期値： i_MRP_ODR_TYP_DN

	final static String i_MRP_ODR_TYP_DN = null;

	// 第 6 変数初期値： i_OPR_RSLT_TYP_DN

	final static String i_OPR_RSLT_TYP_DN = null;

	// 第 7 変数初期値： i_h_OPR_INST_QTY

	final static String i_h_OPR_INST_QTY = null;

	// 第 8 変数初期値： i_h_WORK_ODR_CD

	final static String i_h_WORK_ODR_CD = null;

	// 第 9 変数初期値： i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// 第 10 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 11 変数初期値： i_OD_NO

	final static String i_OD_NO = null;

	// 第 12 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 13 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 14 変数初期値： i_OPR_INST_START_DATE_ALL

	final static String i_OPR_INST_START_DATE_ALL = null;

	// 第 15 変数初期値： i_WORK_ODR_DLV_DATE_ALL

	final static String i_WORK_ODR_DLV_DATE_ALL = null;

	// 第 16 変数初期値： i_OPR_INST_QTY

	final static String i_OPR_INST_QTY = null;

	// 第 17 変数初期値： i_OPR_RSLT_TYP

	final static String i_OPR_RSLT_TYP = null;

	// 第 18 変数初期値： i_WORK_IN_PROC_COMMENT

	final static String i_WORK_IN_PROC_COMMENT = null;

	// 第 19 変数初期値： i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// 第 20 変数初期値： i_CREATED_BY

	final static String i_CREATED_BY = null;

	// 第 21 変数初期値： i_CREATED_PRG_NM

	final static String i_CREATED_PRG_NM = null;

	// 第 22 変数初期値： i_UPDATED_BY

	final static String i_UPDATED_BY = null;

	// 第 23 変数初期値： i_UPDATED_PRG_NM

	final static String i_UPDATED_PRG_NM = null;

	// 第 24 変数初期値： i_h_UNIT_QTY_TYP

	final static String i_h_UNIT_QTY_TYP = null;

	// 第 25 変数初期値： i_MRP_ODR_TYP

	final static String i_MRP_ODR_TYP = null;

	// 第 26 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 27 変数初期値： i_h_JOB_ODR_DLV_DATE

	final static String i_h_JOB_ODR_DLV_DATE = null;

	// 第 28 変数初期値： i_h_PARENT_OD_NO

	final static String i_h_PARENT_OD_NO = null;

	// 第 29 変数初期値： i_h_DUE_DATE

	final static String i_h_DUE_DATE = null;

	// 第 30 変数初期値： i_h_BUSINESS_OPR_DATE

	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 31 変数初期値： i_h_MODIFY_COUNT

	final static String i_h_MODIFY_COUNT = null;

	// 第 32 変数初期値： i_FIXED_LT

	final static String i_FIXED_LT = null;

	// 第 33 変数初期値： i_PROP_LT

	final static String i_PROP_LT = null;

	// 第 34 変数初期値： i_SAFETY_LT

	final static String i_SAFETY_LT = null;

	// 第 35 変数初期値： i_PROP_LOT_SIZE

	final static String i_PROP_LOT_SIZE = null;

	// 第 36 変数初期値： i_ODR_START_DATE

	final static String i_ODR_START_DATE = null;

	// 第 37 変数初期値： i_h_JOB_ODR_DLV_DATE_TIME

	final static String i_h_JOB_ODR_DLV_DATE_TIME = null;

	// 第 38 変数初期値： i_JOB_ODR_TYP

	final static String i_JOB_ODR_TYP = null;

	// 第 39 変数初期値： i_h_PROC_NO

	final static String i_h_PROC_NO = null;

	// 第 40 変数初期値： i_WORK_ODR_DLV_DATE

	final static String i_WORK_ODR_DLV_DATE = null;

	// 第 41 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 42 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 43 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 44 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 45 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 46 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 47 変数初期値： i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// 第 48 変数初期値： i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// 第 49 変数初期値： i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// 第 50 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 51 変数初期値： i_SPL_ITEM_TYP

	final static String i_SPL_ITEM_TYP = null;

	// 第 52 変数初期値： i_ACPT_INSPC_TYP

	final static String i_ACPT_INSPC_TYP = null;

	// 第 53 変数初期値： i_RATE_JUDGE_DATE

	final static String i_RATE_JUDGE_DATE = null;

	// 第 54 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 55 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 56 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 57 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 58 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 59 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 60 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 61 変数初期値： i_AMOUNT_INCLUDE_TAX

	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 62 変数初期値： i_HOME_CUR_AMOUNT

	final static String i_HOME_CUR_AMOUNT = null;

	// 第 63 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 65 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 66 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 67 変数初期値： i_EXCH_TYP

	final static String i_EXCH_TYP = null;

	// 第 68 変数初期値： i_CUR_CD

	final static String i_CUR_CD = null;

	// 第 69 変数初期値： i_CUR_NAME

	final static String i_CUR_NAME = null;

	// 第 70 変数初期値： i_VEND_CUR_UNIT

	final static String i_VEND_CUR_UNIT = null;

	// 第 71 変数初期値： i_VEND_DECIMAL_FIG

	final static String i_VEND_DECIMAL_FIG = null;

	// 第 72 変数初期値： i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 73 変数初期値： i_PUCH_SIZE

	final static String i_PUCH_SIZE = null;

	// 第 74 変数初期値： i_OPR_INST_START_DATE

	final static String i_OPR_INST_START_DATE = null;

	// 第 75 変数初期値： i_TAX_APPLY_TYP

	final static String i_TAX_APPLY_TYP = null;

	// 第 76 変数初期値： i_OWN_PERSON_NAME

	final static String i_OWN_PERSON_NAME = null;

	// 第 77 変数初期値： i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// 第 78 変数初期値： i_HOLIDAY_FLG

	final static String i_HOLIDAY_FLG = null;

	// 第 79 変数初期値： i_DATE

	final static String i_DATE = null;

	// 第 80 変数初期値： i_LOG_CD

	final static String i_LOG_CD = null;

	// 第 81 変数初期値： i_BUSINESS_NAME

	final static String i_BUSINESS_NAME = null;

	// 第 82 変数初期値： i_MSG_CD

	final static String i_MSG_CD = null;

	// 第 83 変数初期値： i_MSG

	final static String i_MSG = null;

	// 第 84 変数初期値： i_DATA_STRING

	final static String i_DATA_STRING = null;

	// 第 85 変数初期値： i_WORK_ODR_DLV_DATE_TIME

	final static String i_WORK_ODR_DLV_DATE_TIME = null;

	// 第 86 変数初期値： i_OPR_INST_START_DATE_TIME

	final static String i_OPR_INST_START_DATE_TIME = null;

	// 第 87 変数初期値： i_ITEM_PLANT_CD

	final static String i_ITEM_PLANT_CD = null;

	// 第 88 変数初期値： i_WS_NAME

	final static String i_WS_NAME = null;

	// 第 89 変数初期値： i_WORK_STS_TYP

	final static String i_WORK_STS_TYP = null;

	// 第 90 変数初期値： i_PROC_EXPLOSION_FLG

	final static String i_PROC_EXPLOSION_FLG = null;

	// 第 91 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 92 変数初期値： i_DRAW_CD

	final static String i_DRAW_CD = null;

	// 第 93 変数初期値： i_SPEC

	final static String i_SPEC = null;

	// 第 94 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 95 変数初期値： i_OUTSIDE_TYP

	final static String i_OUTSIDE_TYP = null;

	// 第 96 変数初期値： i_h_ODR_START_DATE

	final static String i_h_ODR_START_DATE = null;

	// 第 97 変数初期値： i_h_ODR_START_DATE_TIME

	final static String i_h_ODR_START_DATE_TIME = null;

	// 第 98 変数初期値： i_h_DUE_DATE_TIME

	final static String i_h_DUE_DATE_TIME = null;

	// 第 99 変数初期値： i_h_MANHOUR_TYP

	final static String i_h_MANHOUR_TYP = null;

	// 第 100 変数初期値： i_countOD_NO

	final static String i_countOD_NO = null;

	// 第 101 変数初期値： i_JOB_ODR_ALC_CD

	final static String i_JOB_ODR_ALC_CD = null;

	// 第 102 変数初期値： i_TIME_CTRL

	final static String i_TIME_CTRL = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_OUTSIDE_TYP_name = i_OUTSIDE_TYP_name;
		m_OUTSIDE_TYP_val = i_OUTSIDE_TYP_val;
		m_h_SUB_FLG = i_h_SUB_FLG;
		m_h_flg = i_h_flg;
		m_MRP_ODR_TYP_DN = i_MRP_ODR_TYP_DN;
		m_OPR_RSLT_TYP_DN = i_OPR_RSLT_TYP_DN;
		m_h_OPR_INST_QTY = i_h_OPR_INST_QTY;
		m_h_WORK_ODR_CD = i_h_WORK_ODR_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_OD_NO = i_OD_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_WS_CD = i_WS_CD;
		m_OPR_INST_START_DATE_ALL = i_OPR_INST_START_DATE_ALL;
		m_WORK_ODR_DLV_DATE_ALL = i_WORK_ODR_DLV_DATE_ALL;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_OPR_RSLT_TYP = i_OPR_RSLT_TYP;
		m_WORK_IN_PROC_COMMENT = i_WORK_IN_PROC_COMMENT;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_CREATED_BY = i_CREATED_BY;
		m_CREATED_PRG_NM = i_CREATED_PRG_NM;
		m_UPDATED_BY = i_UPDATED_BY;
		m_UPDATED_PRG_NM = i_UPDATED_PRG_NM;
		m_h_UNIT_QTY_TYP = i_h_UNIT_QTY_TYP;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_h_JOB_ODR_DLV_DATE = i_h_JOB_ODR_DLV_DATE;
		m_h_PARENT_OD_NO = i_h_PARENT_OD_NO;
		m_h_DUE_DATE = i_h_DUE_DATE;
		m_h_BUSINESS_OPR_DATE = i_h_BUSINESS_OPR_DATE;
		m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
		m_FIXED_LT = i_FIXED_LT;
		m_PROP_LT = i_PROP_LT;
		m_SAFETY_LT = i_SAFETY_LT;
		m_PROP_LOT_SIZE = i_PROP_LOT_SIZE;
		m_ODR_START_DATE = i_ODR_START_DATE;
		m_h_JOB_ODR_DLV_DATE_TIME = i_h_JOB_ODR_DLV_DATE_TIME;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_h_PROC_NO = i_h_PROC_NO;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_TAX_CD = i_TAX_CD;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_WH_CD = i_WH_CD;
		m_EXCH_RATE = i_EXCH_RATE;
		m_EXCH_TYP = i_EXCH_TYP;
		m_CUR_CD = i_CUR_CD;
		m_CUR_NAME = i_CUR_NAME;
		m_VEND_CUR_UNIT = i_VEND_CUR_UNIT;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_PUCH_SIZE = i_PUCH_SIZE;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_TAX_APPLY_TYP = i_TAX_APPLY_TYP;
		m_OWN_PERSON_NAME = i_OWN_PERSON_NAME;
		m_ROUND_TYP = i_ROUND_TYP;
		m_HOLIDAY_FLG = i_HOLIDAY_FLG;
		m_DATE = i_DATE;
		m_LOG_CD = i_LOG_CD;
		m_BUSINESS_NAME = i_BUSINESS_NAME;
		m_MSG_CD = i_MSG_CD;
		m_MSG = i_MSG;
		m_DATA_STRING = i_DATA_STRING;
		m_WORK_ODR_DLV_DATE_TIME = i_WORK_ODR_DLV_DATE_TIME;
		m_OPR_INST_START_DATE_TIME = i_OPR_INST_START_DATE_TIME;
		m_ITEM_PLANT_CD = i_ITEM_PLANT_CD;
		m_WS_NAME = i_WS_NAME;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
		m_PROC_EXPLOSION_FLG = i_PROC_EXPLOSION_FLG;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_h_ODR_START_DATE = i_h_ODR_START_DATE;
		m_h_ODR_START_DATE_TIME = i_h_ODR_START_DATE_TIME;
		m_h_DUE_DATE_TIME = i_h_DUE_DATE_TIME;
		m_h_MANHOUR_TYP = i_h_MANHOUR_TYP;
		m_countOD_NO = i_countOD_NO;
		m_JOB_ODR_ALC_CD = i_JOB_ODR_ALC_CD;
		m_TIME_CTRL = i_TIME_CTRL;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
