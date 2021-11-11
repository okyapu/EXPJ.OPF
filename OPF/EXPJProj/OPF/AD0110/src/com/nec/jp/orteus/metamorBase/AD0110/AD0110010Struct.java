/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0110/src/com/nec/jp/orteus/metamorBase/AD0110/AD0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0110;

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
 * CLASS     : AD0110010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.4 $ $Date: 2015/12/22 10:04:33 $
 *
 */
//}}user_implement_code_header

public class AD0110010Struct extends DataStruct
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
	/** 第 7 変数： m_l_ERR_PLANT_CD */
	public String m_l_ERR_PLANT_CD = null;
	/** 第 8 変数： m_l_ERR_ITEM_CD */
	public String m_l_ERR_ITEM_CD = null;
	/** 第 9 変数： m_l_ERR_WS_CD */
	public String m_l_ERR_WS_CD = null;
	/** 第 10 変数： m_l_ERR_OPR_DATE */
	public String m_l_ERR_OPR_DATE = null;
	/** 第 11 変数： m_l_ERR_ACPT_QTY */
	public String m_l_ERR_ACPT_QTY = null;
	/** 第 12 変数： m_l_ERR_DEFECT_QTY */
	public String m_l_ERR_DEFECT_QTY = null;
	/** 第 13 変数： m_l_ERR_OPR_TIME */
	public String m_l_ERR_OPR_TIME = null;
	/** 第 14 変数： m_l_ERR_LOT_NO */
	public String m_l_ERR_LOT_NO = null;
	/** 第 15 変数： m_l_ERR_WH_CD */
	public String m_l_ERR_WH_CD = null;
	/** 第 16 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 17 変数： m_TEMP_PLAN_QTY */
	public String m_TEMP_PLAN_QTY = null;
	/** 第 18 変数： m_TEMP_USEOVER_QTY */
	public String m_TEMP_USEOVER_QTY = null;
	/** 第 19 変数： m_TEMP_PLANOUT_QTY */
	public String m_TEMP_PLANOUT_QTY = null;
	/** 第 20 変数： m_TEMP_USE_QTY */
	public String m_TEMP_USE_QTY = null;
	/** 第 21 変数： m_l_ERR_DEFECT_QTY_KEEP */
	public String m_l_ERR_DEFECT_QTY_KEEP = null;
	/** 第 22 変数： m_l_ERR_ACPT_QTY_KEEP */
	public String m_l_ERR_ACPT_QTY_KEEP = null;
	/** 第 23 変数： m_l_LOT_NO_KEEP */
	public String m_l_LOT_NO_KEEP = null;
	/** 第 24 変数： m_OUTPUT_RSLT_CD */
	public String m_OUTPUT_RSLT_CD = null;
	/** 第 25 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 26 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 27 変数： m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** 第 28 変数： m_DEFECT_CAUSE_CD */
	public String m_DEFECT_CAUSE_CD = null;
	/** 第 29 変数： m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** 第 30 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 31 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 32 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 33 変数： m_OUTPUT_RSLT_PERSON */
	public String m_OUTPUT_RSLT_PERSON = null;
	/** 第 34 変数： m_OUTPUT_RSLT_COMMENT */
	public String m_OUTPUT_RSLT_COMMENT = null;
	/** 第 35 変数： m_OPR_TIME_UNIT_TYP */
	public String m_OPR_TIME_UNIT_TYP = null;
	/** 第 36 変数： m_PRE_ARRANGEMENT_TIME */
	public String m_PRE_ARRANGEMENT_TIME = null;
	/** 第 37 変数： m_POST_ARRANGEMENT_TIME */
	public String m_POST_ARRANGEMENT_TIME = null;
	/** 第 38 変数： m_OPR_TIME */
	public String m_OPR_TIME = null;
	/** 第 39 変数： m_CESSATION_TIME */
	public String m_CESSATION_TIME = null;
	/** 第 40 変数： m_CESSATION_CAUSE */
	public String m_CESSATION_CAUSE = null;
	/** 第 41 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 42 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 43 変数： m_DEFECT_COMMENT */
	public String m_DEFECT_COMMENT = null;
	/** 第 44 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 45 変数： m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** 第 46 変数： m_OPR_CRCT_NO */
	public String m_OPR_CRCT_NO = null;
	/** 第 47 変数： m_dateOPR_DATE */
	public String m_dateOPR_DATE = null;
	/** 第 48 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 49 変数： m_vc2ITEM_CD */
	public String m_vc2ITEM_CD = null;
	/** 第 50 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 51 変数： m_LOT_NUMBERING_TYP */
	public String m_LOT_NUMBERING_TYP = null;
	/** 第 52 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 53 変数： m_COUNT */
	public String m_COUNT = null;
	/** 第 54 変数： m_vc2PLANT_CD */
	public String m_vc2PLANT_CD = null;
	/** 第 55 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 56 変数： m_vc2LOT_NO */
	public String m_vc2LOT_NO = null;
	/** 第 57 変数： m_vc2WORK_ODR_CD */
	public String m_vc2WORK_ODR_CD = null;
	/** 第 58 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 59 変数： m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** 第 60 変数： m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** 第 61 変数： m_MODIFY_COUNT_BY_ITEM */
	public String m_MODIFY_COUNT_BY_ITEM = null;
	/** 第 62 変数： m_vc2OPR_INST_CD */
	public String m_vc2OPR_INST_CD = null;
	/** 第 63 変数： m_VALUE */
	public String m_VALUE = null;
	/** 第 64 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 65 変数： m_MAX_PRD_NO */
	public String m_MAX_PRD_NO = null;
	/** 第 66 変数： m_MAX_OPR_DATE */
	public String m_MAX_OPR_DATE = null;
	/** 第 67 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 68 変数： m_RCV_ISSUE_TYP */
	public String m_RCV_ISSUE_TYP = null;
	/** 第 69 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 70 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 71 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 72 変数： m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** 第 73 変数： m_ACPT_RSLT_CRCT_NO */
	public String m_ACPT_RSLT_CRCT_NO = null;
	/** 第 74 変数： m_INSPEC_RSLT_CRCT_NO */
	public String m_INSPEC_RSLT_CRCT_NO = null;
	/** 第 75 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 76 変数： m_OPR_RSLT_CRCT_NO */
	public String m_OPR_RSLT_CRCT_NO = null;
	/** 第 77 変数： m_h_ISSUE_INST_CD */
	public String m_h_ISSUE_INST_CD = null;
	/** 第 78 変数： m_SAVE_STOCK_ON_HAND_QTY */
	public String m_SAVE_STOCK_ON_HAND_QTY = null;
	/** 第 79 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 80 変数： m_RCV_ISSUE_AMOUNT */
	public String m_RCV_ISSUE_AMOUNT = null;
	/** 第 81 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 82 変数： m_RCV_ISSUE_GNR_TYP */
	public String m_RCV_ISSUE_GNR_TYP = null;
	/** 第 83 変数： m_RCV_ISSUE_ODD_QTY */
	public String m_RCV_ISSUE_ODD_QTY = null;
	/** 第 84 変数： m_STOCK_UPD_TYP */
	public String m_STOCK_UPD_TYP = null;
	/** 第 85 変数： m_RCV_ISSUE_CMPLT_FLG */
	public String m_RCV_ISSUE_CMPLT_FLG = null;
	/** 第 86 変数： m_RCV_ISSUE_COMMENT */
	public String m_RCV_ISSUE_COMMENT = null;
	/** 第 87 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 88 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 89 変数： m_SUM_OPR_RSLT_QTY */
	public String m_SUM_OPR_RSLT_QTY = null;
	/** 第 90 変数： m_vc2OUTPUT_RSLT_CD */
	public String m_vc2OUTPUT_RSLT_CD = null;
	/** 第 91 変数： m_ISSUE_TYP */
	public String m_ISSUE_TYP = null;
	/** 第 92 変数： m_ISSUE_INST_UNIT_DENOMINATOR */
	public String m_ISSUE_INST_UNIT_DENOMINATOR = null;
	/** 第 93 変数： m_ISSUE_INST_UNIT_NUMERATOR */
	public String m_ISSUE_INST_UNIT_NUMERATOR = null;
	/** 第 94 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 95 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 96 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 97 変数： m_l_UNIT_QTY_TYP */
	public String m_l_UNIT_QTY_TYP = null;
	/** 第 98 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 99 変数： m_SUPPLIED_ISSUE_QTY */
	public String m_SUPPLIED_ISSUE_QTY = null;
	/** 第 100 変数： m_count_RCV_ISSUE */
	public String m_count_RCV_ISSUE = null;
	/** 第 101 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 102 変数： m_ISSUE_QTY */
	public String m_ISSUE_QTY = null;
	/** 第 103 変数： m_ISSUE_DATE */
	public String m_ISSUE_DATE = null;
	/** 第 104 変数： m_SPENT_QTY */
	public String m_SPENT_QTY = null;
	/** 第 105 変数： m_NEXTVAL */
	public String m_NEXTVAL = null;
	/** 第 106 変数： m_RSLT_CTL_SEQ_NO */
	public String m_RSLT_CTL_SEQ_NO = null;
	/** 第 107 変数： m_PART_SUPPLIED_COMMENT */
	public String m_PART_SUPPLIED_COMMENT = null;
	/** 第 108 変数： m_SUPPLIED_DATE */
	public String m_SUPPLIED_DATE = null;
	/** 第 109 変数： m_ALCD_QTY */
	public String m_ALCD_QTY = null;
	/** 第 110 変数： m_PROC_EXEC_DATE */
	public String m_PROC_EXEC_DATE = null;
	/** 第 111 変数： m_FROM_PUCH_ODR_CD */
	public String m_FROM_PUCH_ODR_CD = null;
	/** 第 112 変数： m_TO_PUCH_ODR_CD */
	public String m_TO_PUCH_ODR_CD = null;
	/** 第 113 変数： m_FROM_ITEM_CD */
	public String m_FROM_ITEM_CD = null;
	/** 第 114 変数： m_FROM_LOT_NO */
	public String m_FROM_LOT_NO = null;
	/** 第 115 変数： m_TO_ITEM_CD */
	public String m_TO_ITEM_CD = null;
	/** 第 116 変数： m_TO_LOT_NO */
	public String m_TO_LOT_NO = null;

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

	/** 第 7 List変数： l_l_ERR_PLANT_CD */
	public List l_l_ERR_PLANT_CD = null;

	/** 第 8 List変数： l_l_ERR_ITEM_CD */
	public List l_l_ERR_ITEM_CD = null;

	/** 第 9 List変数： l_l_ERR_WS_CD */
	public List l_l_ERR_WS_CD = null;

	/** 第 10 List変数： l_l_ERR_OPR_DATE */
	public List l_l_ERR_OPR_DATE = null;

	/** 第 11 List変数： l_l_ERR_ACPT_QTY */
	public List l_l_ERR_ACPT_QTY = null;

	/** 第 12 List変数： l_l_ERR_DEFECT_QTY */
	public List l_l_ERR_DEFECT_QTY = null;

	/** 第 13 List変数： l_l_ERR_OPR_TIME */
	public List l_l_ERR_OPR_TIME = null;

	/** 第 14 List変数： l_l_ERR_LOT_NO */
	public List l_l_ERR_LOT_NO = null;

	/** 第 15 List変数： l_l_ERR_WH_CD */
	public List l_l_ERR_WH_CD = null;

	/** 第 16 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 17 List変数： l_TEMP_PLAN_QTY */
	public List l_TEMP_PLAN_QTY = null;

	/** 第 18 List変数： l_TEMP_USEOVER_QTY */
	public List l_TEMP_USEOVER_QTY = null;

	/** 第 19 List変数： l_TEMP_PLANOUT_QTY */
	public List l_TEMP_PLANOUT_QTY = null;

	/** 第 20 List変数： l_TEMP_USE_QTY */
	public List l_TEMP_USE_QTY = null;

	/** 第 21 List変数： l_l_ERR_DEFECT_QTY_KEEP */
	public List l_l_ERR_DEFECT_QTY_KEEP = null;

	/** 第 22 List変数： l_l_ERR_ACPT_QTY_KEEP */
	public List l_l_ERR_ACPT_QTY_KEEP = null;

	/** 第 23 List変数： l_l_LOT_NO_KEEP */
	public List l_l_LOT_NO_KEEP = null;

	/** 第 24 List変数： l_OUTPUT_RSLT_CD */
	public List l_OUTPUT_RSLT_CD = null;

	/** 第 25 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 26 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 27 List変数： l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** 第 28 List変数： l_DEFECT_CAUSE_CD */
	public List l_DEFECT_CAUSE_CD = null;

	/** 第 29 List変数： l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** 第 30 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 31 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 32 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 33 List変数： l_OUTPUT_RSLT_PERSON */
	public List l_OUTPUT_RSLT_PERSON = null;

	/** 第 34 List変数： l_OUTPUT_RSLT_COMMENT */
	public List l_OUTPUT_RSLT_COMMENT = null;

	/** 第 35 List変数： l_OPR_TIME_UNIT_TYP */
	public List l_OPR_TIME_UNIT_TYP = null;

	/** 第 36 List変数： l_PRE_ARRANGEMENT_TIME */
	public List l_PRE_ARRANGEMENT_TIME = null;

	/** 第 37 List変数： l_POST_ARRANGEMENT_TIME */
	public List l_POST_ARRANGEMENT_TIME = null;

	/** 第 38 List変数： l_OPR_TIME */
	public List l_OPR_TIME = null;

	/** 第 39 List変数： l_CESSATION_TIME */
	public List l_CESSATION_TIME = null;

	/** 第 40 List変数： l_CESSATION_CAUSE */
	public List l_CESSATION_CAUSE = null;

	/** 第 41 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 42 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 43 List変数： l_DEFECT_COMMENT */
	public List l_DEFECT_COMMENT = null;

	/** 第 44 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 45 List変数： l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** 第 46 List変数： l_OPR_CRCT_NO */
	public List l_OPR_CRCT_NO = null;

	/** 第 47 List変数： l_dateOPR_DATE */
	public List l_dateOPR_DATE = null;

	/** 第 48 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 49 List変数： l_vc2ITEM_CD */
	public List l_vc2ITEM_CD = null;

	/** 第 50 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 51 List変数： l_LOT_NUMBERING_TYP */
	public List l_LOT_NUMBERING_TYP = null;

	/** 第 52 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 53 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 54 List変数： l_vc2PLANT_CD */
	public List l_vc2PLANT_CD = null;

	/** 第 55 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 56 List変数： l_vc2LOT_NO */
	public List l_vc2LOT_NO = null;

	/** 第 57 List変数： l_vc2WORK_ODR_CD */
	public List l_vc2WORK_ODR_CD = null;

	/** 第 58 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 59 List変数： l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** 第 60 List変数： l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** 第 61 List変数： l_MODIFY_COUNT_BY_ITEM */
	public List l_MODIFY_COUNT_BY_ITEM = null;

	/** 第 62 List変数： l_vc2OPR_INST_CD */
	public List l_vc2OPR_INST_CD = null;

	/** 第 63 List変数： l_VALUE */
	public List l_VALUE = null;

	/** 第 64 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 65 List変数： l_MAX_PRD_NO */
	public List l_MAX_PRD_NO = null;

	/** 第 66 List変数： l_MAX_OPR_DATE */
	public List l_MAX_OPR_DATE = null;

	/** 第 67 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 68 List変数： l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** 第 69 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 70 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 71 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 72 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 73 List変数： l_ACPT_RSLT_CRCT_NO */
	public List l_ACPT_RSLT_CRCT_NO = null;

	/** 第 74 List変数： l_INSPEC_RSLT_CRCT_NO */
	public List l_INSPEC_RSLT_CRCT_NO = null;

	/** 第 75 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 76 List変数： l_OPR_RSLT_CRCT_NO */
	public List l_OPR_RSLT_CRCT_NO = null;

	/** 第 77 List変数： l_h_ISSUE_INST_CD */
	public List l_h_ISSUE_INST_CD = null;

	/** 第 78 List変数： l_SAVE_STOCK_ON_HAND_QTY */
	public List l_SAVE_STOCK_ON_HAND_QTY = null;

	/** 第 79 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 80 List変数： l_RCV_ISSUE_AMOUNT */
	public List l_RCV_ISSUE_AMOUNT = null;

	/** 第 81 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 82 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 83 List変数： l_RCV_ISSUE_ODD_QTY */
	public List l_RCV_ISSUE_ODD_QTY = null;

	/** 第 84 List変数： l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** 第 85 List変数： l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** 第 86 List変数： l_RCV_ISSUE_COMMENT */
	public List l_RCV_ISSUE_COMMENT = null;

	/** 第 87 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 88 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 89 List変数： l_SUM_OPR_RSLT_QTY */
	public List l_SUM_OPR_RSLT_QTY = null;

	/** 第 90 List変数： l_vc2OUTPUT_RSLT_CD */
	public List l_vc2OUTPUT_RSLT_CD = null;

	/** 第 91 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 92 List変数： l_ISSUE_INST_UNIT_DENOMINATOR */
	public List l_ISSUE_INST_UNIT_DENOMINATOR = null;

	/** 第 93 List変数： l_ISSUE_INST_UNIT_NUMERATOR */
	public List l_ISSUE_INST_UNIT_NUMERATOR = null;

	/** 第 94 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 95 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 96 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 97 List変数： l_l_UNIT_QTY_TYP */
	public List l_l_UNIT_QTY_TYP = null;

	/** 第 98 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 99 List変数： l_SUPPLIED_ISSUE_QTY */
	public List l_SUPPLIED_ISSUE_QTY = null;

	/** 第 100 List変数： l_count_RCV_ISSUE */
	public List l_count_RCV_ISSUE = null;

	/** 第 101 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 102 List変数： l_ISSUE_QTY */
	public List l_ISSUE_QTY = null;

	/** 第 103 List変数： l_ISSUE_DATE */
	public List l_ISSUE_DATE = null;

	/** 第 104 List変数： l_SPENT_QTY */
	public List l_SPENT_QTY = null;

	/** 第 105 List変数： l_NEXTVAL */
	public List l_NEXTVAL = null;

	/** 第 106 List変数： l_RSLT_CTL_SEQ_NO */
	public List l_RSLT_CTL_SEQ_NO = null;

	/** 第 107 List変数： l_PART_SUPPLIED_COMMENT */
	public List l_PART_SUPPLIED_COMMENT = null;

	/** 第 108 List変数： l_SUPPLIED_DATE */
	public List l_SUPPLIED_DATE = null;

	/** 第 109 List変数： l_ALCD_QTY */
	public List l_ALCD_QTY = null;

	/** 第 110 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 111 List変数： l_FROM_PUCH_ODR_CD */
	public List l_FROM_PUCH_ODR_CD = null;

	/** 第 112 List変数： l_TO_PUCH_ODR_CD */
	public List l_TO_PUCH_ODR_CD = null;

	/** 第 113 List変数： l_FROM_ITEM_CD */
	public List l_FROM_ITEM_CD = null;

	/** 第 114 List変数： l_FROM_LOT_NO */
	public List l_FROM_LOT_NO = null;

	/** 第 115 List変数： l_TO_ITEM_CD */
	public List l_TO_ITEM_CD = null;

	/** 第 116 List変数： l_TO_LOT_NO */
	public List l_TO_LOT_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_PLANT_CD() { return m_l_ERR_PLANT_CD; }
	public String getl_ERR_ITEM_CD() { return m_l_ERR_ITEM_CD; }
	public String getl_ERR_WS_CD() { return m_l_ERR_WS_CD; }
	public String getl_ERR_OPR_DATE() { return m_l_ERR_OPR_DATE; }
	public String getl_ERR_ACPT_QTY() { return m_l_ERR_ACPT_QTY; }
	public String getl_ERR_DEFECT_QTY() { return m_l_ERR_DEFECT_QTY; }
	public String getl_ERR_OPR_TIME() { return m_l_ERR_OPR_TIME; }
	public String getl_ERR_LOT_NO() { return m_l_ERR_LOT_NO; }
	public String getl_ERR_WH_CD() { return m_l_ERR_WH_CD; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getTEMP_PLAN_QTY() { return m_TEMP_PLAN_QTY; }
	public String getTEMP_USEOVER_QTY() { return m_TEMP_USEOVER_QTY; }
	public String getTEMP_PLANOUT_QTY() { return m_TEMP_PLANOUT_QTY; }
	public String getTEMP_USE_QTY() { return m_TEMP_USE_QTY; }
	public String getl_ERR_DEFECT_QTY_KEEP() { return m_l_ERR_DEFECT_QTY_KEEP; }
	public String getl_ERR_ACPT_QTY_KEEP() { return m_l_ERR_ACPT_QTY_KEEP; }
	public String getl_LOT_NO_KEEP() { return m_l_LOT_NO_KEEP; }
	public String getOUTPUT_RSLT_CD() { return m_OUTPUT_RSLT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getDEFECT_CAUSE_CD() { return m_DEFECT_CAUSE_CD; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOUTPUT_RSLT_PERSON() { return m_OUTPUT_RSLT_PERSON; }
	public String getOUTPUT_RSLT_COMMENT() { return m_OUTPUT_RSLT_COMMENT; }
	public String getOPR_TIME_UNIT_TYP() { return m_OPR_TIME_UNIT_TYP; }
	public String getPRE_ARRANGEMENT_TIME() { return m_PRE_ARRANGEMENT_TIME; }
	public String getPOST_ARRANGEMENT_TIME() { return m_POST_ARRANGEMENT_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getCESSATION_TIME() { return m_CESSATION_TIME; }
	public String getCESSATION_CAUSE() { return m_CESSATION_CAUSE; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getDEFECT_COMMENT() { return m_DEFECT_COMMENT; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getOPR_CRCT_NO() { return m_OPR_CRCT_NO; }
	public String getdateOPR_DATE() { return m_dateOPR_DATE; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getvc2ITEM_CD() { return m_vc2ITEM_CD; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getCOUNT() { return m_COUNT; }
	public String getvc2PLANT_CD() { return m_vc2PLANT_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getvc2LOT_NO() { return m_vc2LOT_NO; }
	public String getvc2WORK_ODR_CD() { return m_vc2WORK_ODR_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getMODIFY_COUNT_BY_ITEM() { return m_MODIFY_COUNT_BY_ITEM; }
	public String getvc2OPR_INST_CD() { return m_vc2OPR_INST_CD; }
	public String getVALUE() { return m_VALUE; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getMAX_PRD_NO() { return m_MAX_PRD_NO; }
	public String getMAX_OPR_DATE() { return m_MAX_OPR_DATE; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getACPT_RSLT_CRCT_NO() { return m_ACPT_RSLT_CRCT_NO; }
	public String getINSPEC_RSLT_CRCT_NO() { return m_INSPEC_RSLT_CRCT_NO; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String geth_ISSUE_INST_CD() { return m_h_ISSUE_INST_CD; }
	public String getSAVE_STOCK_ON_HAND_QTY() { return m_SAVE_STOCK_ON_HAND_QTY; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_AMOUNT() { return m_RCV_ISSUE_AMOUNT; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getRCV_ISSUE_ODD_QTY() { return m_RCV_ISSUE_ODD_QTY; }
	public String getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getRCV_ISSUE_COMMENT() { return m_RCV_ISSUE_COMMENT; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getSUM_OPR_RSLT_QTY() { return m_SUM_OPR_RSLT_QTY; }
	public String getvc2OUTPUT_RSLT_CD() { return m_vc2OUTPUT_RSLT_CD; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getISSUE_INST_UNIT_DENOMINATOR() { return m_ISSUE_INST_UNIT_DENOMINATOR; }
	public String getISSUE_INST_UNIT_NUMERATOR() { return m_ISSUE_INST_UNIT_NUMERATOR; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getl_UNIT_QTY_TYP() { return m_l_UNIT_QTY_TYP; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getSUPPLIED_ISSUE_QTY() { return m_SUPPLIED_ISSUE_QTY; }
	public String getcount_RCV_ISSUE() { return m_count_RCV_ISSUE; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getISSUE_QTY() { return m_ISSUE_QTY; }
	public String getISSUE_DATE() { return m_ISSUE_DATE; }
	public String getSPENT_QTY() { return m_SPENT_QTY; }
	public String getNEXTVAL() { return m_NEXTVAL; }
	public String getRSLT_CTL_SEQ_NO() { return m_RSLT_CTL_SEQ_NO; }
	public String getPART_SUPPLIED_COMMENT() { return m_PART_SUPPLIED_COMMENT; }
	public String getSUPPLIED_DATE() { return m_SUPPLIED_DATE; }
	public String getALCD_QTY() { return m_ALCD_QTY; }
	public String getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getFROM_PUCH_ODR_CD() { return m_FROM_PUCH_ODR_CD; }
	public String getTO_PUCH_ODR_CD() { return m_TO_PUCH_ODR_CD; }
	public String getFROM_ITEM_CD() { return m_FROM_ITEM_CD; }
	public String getFROM_LOT_NO() { return m_FROM_LOT_NO; }
	public String getTO_ITEM_CD() { return m_TO_ITEM_CD; }
	public String getTO_LOT_NO() { return m_TO_LOT_NO; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_PLANT_CD() { return l_l_ERR_PLANT_CD; }
	public List getList_l_ERR_ITEM_CD() { return l_l_ERR_ITEM_CD; }
	public List getList_l_ERR_WS_CD() { return l_l_ERR_WS_CD; }
	public List getList_l_ERR_OPR_DATE() { return l_l_ERR_OPR_DATE; }
	public List getList_l_ERR_ACPT_QTY() { return l_l_ERR_ACPT_QTY; }
	public List getList_l_ERR_DEFECT_QTY() { return l_l_ERR_DEFECT_QTY; }
	public List getList_l_ERR_OPR_TIME() { return l_l_ERR_OPR_TIME; }
	public List getList_l_ERR_LOT_NO() { return l_l_ERR_LOT_NO; }
	public List getList_l_ERR_WH_CD() { return l_l_ERR_WH_CD; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_TEMP_PLAN_QTY() { return l_TEMP_PLAN_QTY; }
	public List getList_TEMP_USEOVER_QTY() { return l_TEMP_USEOVER_QTY; }
	public List getList_TEMP_PLANOUT_QTY() { return l_TEMP_PLANOUT_QTY; }
	public List getList_TEMP_USE_QTY() { return l_TEMP_USE_QTY; }
	public List getList_l_ERR_DEFECT_QTY_KEEP() { return l_l_ERR_DEFECT_QTY_KEEP; }
	public List getList_l_ERR_ACPT_QTY_KEEP() { return l_l_ERR_ACPT_QTY_KEEP; }
	public List getList_l_LOT_NO_KEEP() { return l_l_LOT_NO_KEEP; }
	public List getList_OUTPUT_RSLT_CD() { return l_OUTPUT_RSLT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_DEFECT_CAUSE_CD() { return l_DEFECT_CAUSE_CD; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OUTPUT_RSLT_PERSON() { return l_OUTPUT_RSLT_PERSON; }
	public List getList_OUTPUT_RSLT_COMMENT() { return l_OUTPUT_RSLT_COMMENT; }
	public List getList_OPR_TIME_UNIT_TYP() { return l_OPR_TIME_UNIT_TYP; }
	public List getList_PRE_ARRANGEMENT_TIME() { return l_PRE_ARRANGEMENT_TIME; }
	public List getList_POST_ARRANGEMENT_TIME() { return l_POST_ARRANGEMENT_TIME; }
	public List getList_OPR_TIME() { return l_OPR_TIME; }
	public List getList_CESSATION_TIME() { return l_CESSATION_TIME; }
	public List getList_CESSATION_CAUSE() { return l_CESSATION_CAUSE; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_DEFECT_COMMENT() { return l_DEFECT_COMMENT; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_CRCT_NO() { return l_OPR_CRCT_NO; }
	public List getList_dateOPR_DATE() { return l_dateOPR_DATE; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_vc2ITEM_CD() { return l_vc2ITEM_CD; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_LOT_NUMBERING_TYP() { return l_LOT_NUMBERING_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_vc2PLANT_CD() { return l_vc2PLANT_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_vc2LOT_NO() { return l_vc2LOT_NO; }
	public List getList_vc2WORK_ODR_CD() { return l_vc2WORK_ODR_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_MODIFY_COUNT_BY_ITEM() { return l_MODIFY_COUNT_BY_ITEM; }
	public List getList_vc2OPR_INST_CD() { return l_vc2OPR_INST_CD; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_MAX_PRD_NO() { return l_MAX_PRD_NO; }
	public List getList_MAX_OPR_DATE() { return l_MAX_OPR_DATE; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_RSLT_CRCT_NO() { return l_ACPT_RSLT_CRCT_NO; }
	public List getList_INSPEC_RSLT_CRCT_NO() { return l_INSPEC_RSLT_CRCT_NO; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_OPR_RSLT_CRCT_NO() { return l_OPR_RSLT_CRCT_NO; }
	public List getList_h_ISSUE_INST_CD() { return l_h_ISSUE_INST_CD; }
	public List getList_SAVE_STOCK_ON_HAND_QTY() { return l_SAVE_STOCK_ON_HAND_QTY; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_AMOUNT() { return l_RCV_ISSUE_AMOUNT; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_RCV_ISSUE_ODD_QTY() { return l_RCV_ISSUE_ODD_QTY; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_RCV_ISSUE_COMMENT() { return l_RCV_ISSUE_COMMENT; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_SUM_OPR_RSLT_QTY() { return l_SUM_OPR_RSLT_QTY; }
	public List getList_vc2OUTPUT_RSLT_CD() { return l_vc2OUTPUT_RSLT_CD; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_ISSUE_INST_UNIT_DENOMINATOR() { return l_ISSUE_INST_UNIT_DENOMINATOR; }
	public List getList_ISSUE_INST_UNIT_NUMERATOR() { return l_ISSUE_INST_UNIT_NUMERATOR; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_l_UNIT_QTY_TYP() { return l_l_UNIT_QTY_TYP; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_SUPPLIED_ISSUE_QTY() { return l_SUPPLIED_ISSUE_QTY; }
	public List getList_count_RCV_ISSUE() { return l_count_RCV_ISSUE; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_ISSUE_QTY() { return l_ISSUE_QTY; }
	public List getList_ISSUE_DATE() { return l_ISSUE_DATE; }
	public List getList_SPENT_QTY() { return l_SPENT_QTY; }
	public List getList_NEXTVAL() { return l_NEXTVAL; }
	public List getList_RSLT_CTL_SEQ_NO() { return l_RSLT_CTL_SEQ_NO; }
	public List getList_PART_SUPPLIED_COMMENT() { return l_PART_SUPPLIED_COMMENT; }
	public List getList_SUPPLIED_DATE() { return l_SUPPLIED_DATE; }
	public List getList_ALCD_QTY() { return l_ALCD_QTY; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_FROM_PUCH_ODR_CD() { return l_FROM_PUCH_ODR_CD; }
	public List getList_TO_PUCH_ODR_CD() { return l_TO_PUCH_ODR_CD; }
	public List getList_FROM_ITEM_CD() { return l_FROM_ITEM_CD; }
	public List getList_FROM_LOT_NO() { return l_FROM_LOT_NO; }
	public List getList_TO_ITEM_CD() { return l_TO_ITEM_CD; }
	public List getList_TO_LOT_NO() { return l_TO_LOT_NO; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_PLANT_CD(String val) { m_l_ERR_PLANT_CD = val; }
	public void setl_ERR_ITEM_CD(String val) { m_l_ERR_ITEM_CD = val; }
	public void setl_ERR_WS_CD(String val) { m_l_ERR_WS_CD = val; }
	public void setl_ERR_OPR_DATE(String val) { m_l_ERR_OPR_DATE = val; }
	public void setl_ERR_ACPT_QTY(String val) { m_l_ERR_ACPT_QTY = val; }
	public void setl_ERR_DEFECT_QTY(String val) { m_l_ERR_DEFECT_QTY = val; }
	public void setl_ERR_OPR_TIME(String val) { m_l_ERR_OPR_TIME = val; }
	public void setl_ERR_LOT_NO(String val) { m_l_ERR_LOT_NO = val; }
	public void setl_ERR_WH_CD(String val) { m_l_ERR_WH_CD = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setTEMP_PLAN_QTY(String val) { m_TEMP_PLAN_QTY = val; }
	public void setTEMP_USEOVER_QTY(String val) { m_TEMP_USEOVER_QTY = val; }
	public void setTEMP_PLANOUT_QTY(String val) { m_TEMP_PLANOUT_QTY = val; }
	public void setTEMP_USE_QTY(String val) { m_TEMP_USE_QTY = val; }
	public void setl_ERR_DEFECT_QTY_KEEP(String val) { m_l_ERR_DEFECT_QTY_KEEP = val; }
	public void setl_ERR_ACPT_QTY_KEEP(String val) { m_l_ERR_ACPT_QTY_KEEP = val; }
	public void setl_LOT_NO_KEEP(String val) { m_l_LOT_NO_KEEP = val; }
	public void setOUTPUT_RSLT_CD(String val) { m_OUTPUT_RSLT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setDEFECT_CAUSE_CD(String val) { m_DEFECT_CAUSE_CD = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOUTPUT_RSLT_PERSON(String val) { m_OUTPUT_RSLT_PERSON = val; }
	public void setOUTPUT_RSLT_COMMENT(String val) { m_OUTPUT_RSLT_COMMENT = val; }
	public void setOPR_TIME_UNIT_TYP(String val) { m_OPR_TIME_UNIT_TYP = val; }
	public void setPRE_ARRANGEMENT_TIME(String val) { m_PRE_ARRANGEMENT_TIME = val; }
	public void setPOST_ARRANGEMENT_TIME(String val) { m_POST_ARRANGEMENT_TIME = val; }
	public void setOPR_TIME(String val) { m_OPR_TIME = val; }
	public void setCESSATION_TIME(String val) { m_CESSATION_TIME = val; }
	public void setCESSATION_CAUSE(String val) { m_CESSATION_CAUSE = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setDEFECT_COMMENT(String val) { m_DEFECT_COMMENT = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_CRCT_NO(String val) { m_OPR_CRCT_NO = val; }
	public void setdateOPR_DATE(String val) { m_dateOPR_DATE = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setvc2ITEM_CD(String val) { m_vc2ITEM_CD = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setLOT_NUMBERING_TYP(String val) { m_LOT_NUMBERING_TYP = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setvc2PLANT_CD(String val) { m_vc2PLANT_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setvc2LOT_NO(String val) { m_vc2LOT_NO = val; }
	public void setvc2WORK_ODR_CD(String val) { m_vc2WORK_ODR_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setMODIFY_COUNT_BY_ITEM(String val) { m_MODIFY_COUNT_BY_ITEM = val; }
	public void setvc2OPR_INST_CD(String val) { m_vc2OPR_INST_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setMAX_PRD_NO(String val) { m_MAX_PRD_NO = val; }
	public void setMAX_OPR_DATE(String val) { m_MAX_OPR_DATE = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setACPT_RSLT_CRCT_NO(String val) { m_ACPT_RSLT_CRCT_NO = val; }
	public void setINSPEC_RSLT_CRCT_NO(String val) { m_INSPEC_RSLT_CRCT_NO = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = val; }
	public void seth_ISSUE_INST_CD(String val) { m_h_ISSUE_INST_CD = val; }
	public void setSAVE_STOCK_ON_HAND_QTY(String val) { m_SAVE_STOCK_ON_HAND_QTY = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_AMOUNT(String val) { m_RCV_ISSUE_AMOUNT = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_ODD_QTY(String val) { m_RCV_ISSUE_ODD_QTY = val; }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setRCV_ISSUE_COMMENT(String val) { m_RCV_ISSUE_COMMENT = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setSUM_OPR_RSLT_QTY(String val) { m_SUM_OPR_RSLT_QTY = val; }
	public void setvc2OUTPUT_RSLT_CD(String val) { m_vc2OUTPUT_RSLT_CD = val; }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = val; }
	public void setISSUE_INST_UNIT_DENOMINATOR(String val) { m_ISSUE_INST_UNIT_DENOMINATOR = val; }
	public void setISSUE_INST_UNIT_NUMERATOR(String val) { m_ISSUE_INST_UNIT_NUMERATOR = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setl_UNIT_QTY_TYP(String val) { m_l_UNIT_QTY_TYP = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setSUPPLIED_ISSUE_QTY(String val) { m_SUPPLIED_ISSUE_QTY = val; }
	public void setcount_RCV_ISSUE(String val) { m_count_RCV_ISSUE = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setISSUE_QTY(String val) { m_ISSUE_QTY = val; }
	public void setISSUE_DATE(String val) { m_ISSUE_DATE = val; }
	public void setSPENT_QTY(String val) { m_SPENT_QTY = val; }
	public void setNEXTVAL(String val) { m_NEXTVAL = val; }
	public void setRSLT_CTL_SEQ_NO(String val) { m_RSLT_CTL_SEQ_NO = val; }
	public void setPART_SUPPLIED_COMMENT(String val) { m_PART_SUPPLIED_COMMENT = val; }
	public void setSUPPLIED_DATE(String val) { m_SUPPLIED_DATE = val; }
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	public void setPROC_EXEC_DATE(String val) { m_PROC_EXEC_DATE = val; }
	public void setFROM_PUCH_ODR_CD(String val) { m_FROM_PUCH_ODR_CD = val; }
	public void setTO_PUCH_ODR_CD(String val) { m_TO_PUCH_ODR_CD = val; }
	public void setFROM_ITEM_CD(String val) { m_FROM_ITEM_CD = val; }
	public void setFROM_LOT_NO(String val) { m_FROM_LOT_NO = val; }
	public void setTO_ITEM_CD(String val) { m_TO_ITEM_CD = val; }
	public void setTO_LOT_NO(String val) { m_TO_LOT_NO = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_PLANT_CD(List list) { l_l_ERR_PLANT_CD = list; }
	public void setList_l_ERR_ITEM_CD(List list) { l_l_ERR_ITEM_CD = list; }
	public void setList_l_ERR_WS_CD(List list) { l_l_ERR_WS_CD = list; }
	public void setList_l_ERR_OPR_DATE(List list) { l_l_ERR_OPR_DATE = list; }
	public void setList_l_ERR_ACPT_QTY(List list) { l_l_ERR_ACPT_QTY = list; }
	public void setList_l_ERR_DEFECT_QTY(List list) { l_l_ERR_DEFECT_QTY = list; }
	public void setList_l_ERR_OPR_TIME(List list) { l_l_ERR_OPR_TIME = list; }
	public void setList_l_ERR_LOT_NO(List list) { l_l_ERR_LOT_NO = list; }
	public void setList_l_ERR_WH_CD(List list) { l_l_ERR_WH_CD = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_TEMP_PLAN_QTY(List list) { l_TEMP_PLAN_QTY = list; }
	public void setList_TEMP_USEOVER_QTY(List list) { l_TEMP_USEOVER_QTY = list; }
	public void setList_TEMP_PLANOUT_QTY(List list) { l_TEMP_PLANOUT_QTY = list; }
	public void setList_TEMP_USE_QTY(List list) { l_TEMP_USE_QTY = list; }
	public void setList_l_ERR_DEFECT_QTY_KEEP(List list) { l_l_ERR_DEFECT_QTY_KEEP = list; }
	public void setList_l_ERR_ACPT_QTY_KEEP(List list) { l_l_ERR_ACPT_QTY_KEEP = list; }
	public void setList_l_LOT_NO_KEEP(List list) { l_l_LOT_NO_KEEP = list; }
	public void setList_OUTPUT_RSLT_CD(List list) { l_OUTPUT_RSLT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_DEFECT_CAUSE_CD(List list) { l_DEFECT_CAUSE_CD = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OUTPUT_RSLT_PERSON(List list) { l_OUTPUT_RSLT_PERSON = list; }
	public void setList_OUTPUT_RSLT_COMMENT(List list) { l_OUTPUT_RSLT_COMMENT = list; }
	public void setList_OPR_TIME_UNIT_TYP(List list) { l_OPR_TIME_UNIT_TYP = list; }
	public void setList_PRE_ARRANGEMENT_TIME(List list) { l_PRE_ARRANGEMENT_TIME = list; }
	public void setList_POST_ARRANGEMENT_TIME(List list) { l_POST_ARRANGEMENT_TIME = list; }
	public void setList_OPR_TIME(List list) { l_OPR_TIME = list; }
	public void setList_CESSATION_TIME(List list) { l_CESSATION_TIME = list; }
	public void setList_CESSATION_CAUSE(List list) { l_CESSATION_CAUSE = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_DEFECT_COMMENT(List list) { l_DEFECT_COMMENT = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_CRCT_NO(List list) { l_OPR_CRCT_NO = list; }
	public void setList_dateOPR_DATE(List list) { l_dateOPR_DATE = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_vc2ITEM_CD(List list) { l_vc2ITEM_CD = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_LOT_NUMBERING_TYP(List list) { l_LOT_NUMBERING_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_vc2PLANT_CD(List list) { l_vc2PLANT_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_vc2LOT_NO(List list) { l_vc2LOT_NO = list; }
	public void setList_vc2WORK_ODR_CD(List list) { l_vc2WORK_ODR_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_MODIFY_COUNT_BY_ITEM(List list) { l_MODIFY_COUNT_BY_ITEM = list; }
	public void setList_vc2OPR_INST_CD(List list) { l_vc2OPR_INST_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_MAX_PRD_NO(List list) { l_MAX_PRD_NO = list; }
	public void setList_MAX_OPR_DATE(List list) { l_MAX_OPR_DATE = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_RSLT_CRCT_NO(List list) { l_ACPT_RSLT_CRCT_NO = list; }
	public void setList_INSPEC_RSLT_CRCT_NO(List list) { l_INSPEC_RSLT_CRCT_NO = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_OPR_RSLT_CRCT_NO(List list) { l_OPR_RSLT_CRCT_NO = list; }
	public void setList_h_ISSUE_INST_CD(List list) { l_h_ISSUE_INST_CD = list; }
	public void setList_SAVE_STOCK_ON_HAND_QTY(List list) { l_SAVE_STOCK_ON_HAND_QTY = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_AMOUNT(List list) { l_RCV_ISSUE_AMOUNT = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_RCV_ISSUE_ODD_QTY(List list) { l_RCV_ISSUE_ODD_QTY = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_RCV_ISSUE_COMMENT(List list) { l_RCV_ISSUE_COMMENT = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_SUM_OPR_RSLT_QTY(List list) { l_SUM_OPR_RSLT_QTY = list; }
	public void setList_vc2OUTPUT_RSLT_CD(List list) { l_vc2OUTPUT_RSLT_CD = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_ISSUE_INST_UNIT_DENOMINATOR(List list) { l_ISSUE_INST_UNIT_DENOMINATOR = list; }
	public void setList_ISSUE_INST_UNIT_NUMERATOR(List list) { l_ISSUE_INST_UNIT_NUMERATOR = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_l_UNIT_QTY_TYP(List list) { l_l_UNIT_QTY_TYP = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_SUPPLIED_ISSUE_QTY(List list) { l_SUPPLIED_ISSUE_QTY = list; }
	public void setList_count_RCV_ISSUE(List list) { l_count_RCV_ISSUE = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_ISSUE_QTY(List list) { l_ISSUE_QTY = list; }
	public void setList_ISSUE_DATE(List list) { l_ISSUE_DATE = list; }
	public void setList_SPENT_QTY(List list) { l_SPENT_QTY = list; }
	public void setList_NEXTVAL(List list) { l_NEXTVAL = list; }
	public void setList_RSLT_CTL_SEQ_NO(List list) { l_RSLT_CTL_SEQ_NO = list; }
	public void setList_PART_SUPPLIED_COMMENT(List list) { l_PART_SUPPLIED_COMMENT = list; }
	public void setList_SUPPLIED_DATE(List list) { l_SUPPLIED_DATE = list; }
	public void setList_ALCD_QTY(List list) { l_ALCD_QTY = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_FROM_PUCH_ODR_CD(List list) { l_FROM_PUCH_ODR_CD = list; }
	public void setList_TO_PUCH_ODR_CD(List list) { l_TO_PUCH_ODR_CD = list; }
	public void setList_FROM_ITEM_CD(List list) { l_FROM_ITEM_CD = list; }
	public void setList_FROM_LOT_NO(List list) { l_FROM_LOT_NO = list; }
	public void setList_TO_ITEM_CD(List list) { l_TO_ITEM_CD = list; }
	public void setList_TO_LOT_NO(List list) { l_TO_LOT_NO = list; }

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
			l_FileName.add(((AD0110010Struct) list.get(i)).getFileName());
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
			l_DOWNLOAD_FILE.add(((AD0110010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_l_ERROR_IN.add(((AD0110010Struct) list.get(i)).getl_ERROR_IN());
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
			l_l_ERR_TYP.add(((AD0110010Struct) list.get(i)).getl_ERR_TYP());
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
			l_l_ERR_INFO.add(((AD0110010Struct) list.get(i)).getl_ERR_INFO());
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
			l_l_ERR_CTR_NM.add(((AD0110010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PLANT_CD == null) {
			l_l_ERR_PLANT_CD = new ArrayList();
		} else {
			l_l_ERR_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PLANT_CD.add(((AD0110010Struct) list.get(i)).getl_ERR_PLANT_CD());
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
			l_l_ERR_ITEM_CD.add(((AD0110010Struct) list.get(i)).getl_ERR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WS_CD == null) {
			l_l_ERR_WS_CD = new ArrayList();
		} else {
			l_l_ERR_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WS_CD.add(((AD0110010Struct) list.get(i)).getl_ERR_WS_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_OPR_DATE == null) {
			l_l_ERR_OPR_DATE = new ArrayList();
		} else {
			l_l_ERR_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_OPR_DATE.add(((AD0110010Struct) list.get(i)).getl_ERR_OPR_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ACPT_QTY == null) {
			l_l_ERR_ACPT_QTY = new ArrayList();
		} else {
			l_l_ERR_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ACPT_QTY.add(((AD0110010Struct) list.get(i)).getl_ERR_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_DEFECT_QTY == null) {
			l_l_ERR_DEFECT_QTY = new ArrayList();
		} else {
			l_l_ERR_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_DEFECT_QTY.add(((AD0110010Struct) list.get(i)).getl_ERR_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_OPR_TIME == null) {
			l_l_ERR_OPR_TIME = new ArrayList();
		} else {
			l_l_ERR_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_OPR_TIME.add(((AD0110010Struct) list.get(i)).getl_ERR_OPR_TIME());
		}
		return size;
	}
	public int setL2L_l_ERR_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_LOT_NO == null) {
			l_l_ERR_LOT_NO = new ArrayList();
		} else {
			l_l_ERR_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_LOT_NO.add(((AD0110010Struct) list.get(i)).getl_ERR_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_ERR_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WH_CD == null) {
			l_l_ERR_WH_CD = new ArrayList();
		} else {
			l_l_ERR_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WH_CD.add(((AD0110010Struct) list.get(i)).getl_ERR_WH_CD());
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
			l_w_COLUMN_FLG.add(((AD0110010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_PLAN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_PLAN_QTY == null) {
			l_TEMP_PLAN_QTY = new ArrayList();
		} else {
			l_TEMP_PLAN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_PLAN_QTY.add(((AD0110010Struct) list.get(i)).getTEMP_PLAN_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_USEOVER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_USEOVER_QTY == null) {
			l_TEMP_USEOVER_QTY = new ArrayList();
		} else {
			l_TEMP_USEOVER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_USEOVER_QTY.add(((AD0110010Struct) list.get(i)).getTEMP_USEOVER_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_PLANOUT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_PLANOUT_QTY == null) {
			l_TEMP_PLANOUT_QTY = new ArrayList();
		} else {
			l_TEMP_PLANOUT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_PLANOUT_QTY.add(((AD0110010Struct) list.get(i)).getTEMP_PLANOUT_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_USE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_USE_QTY == null) {
			l_TEMP_USE_QTY = new ArrayList();
		} else {
			l_TEMP_USE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_USE_QTY.add(((AD0110010Struct) list.get(i)).getTEMP_USE_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_DEFECT_QTY_KEEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_DEFECT_QTY_KEEP == null) {
			l_l_ERR_DEFECT_QTY_KEEP = new ArrayList();
		} else {
			l_l_ERR_DEFECT_QTY_KEEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_DEFECT_QTY_KEEP.add(((AD0110010Struct) list.get(i)).getl_ERR_DEFECT_QTY_KEEP());
		}
		return size;
	}
	public int setL2L_l_ERR_ACPT_QTY_KEEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ACPT_QTY_KEEP == null) {
			l_l_ERR_ACPT_QTY_KEEP = new ArrayList();
		} else {
			l_l_ERR_ACPT_QTY_KEEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ACPT_QTY_KEEP.add(((AD0110010Struct) list.get(i)).getl_ERR_ACPT_QTY_KEEP());
		}
		return size;
	}
	public int setL2L_l_LOT_NO_KEEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOT_NO_KEEP == null) {
			l_l_LOT_NO_KEEP = new ArrayList();
		} else {
			l_l_LOT_NO_KEEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOT_NO_KEEP.add(((AD0110010Struct) list.get(i)).getl_LOT_NO_KEEP());
		}
		return size;
	}
	public int setL2L_OUTPUT_RSLT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_RSLT_CD == null) {
			l_OUTPUT_RSLT_CD = new ArrayList();
		} else {
			l_OUTPUT_RSLT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_RSLT_CD.add(((AD0110010Struct) list.get(i)).getOUTPUT_RSLT_CD());
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
			l_ITEM_CD.add(((AD0110010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AD0110010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY == null) {
			l_DEFECT_QTY = new ArrayList();
		} else {
			l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY.add(((AD0110010Struct) list.get(i)).getDEFECT_QTY());
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
			l_DEFECT_CAUSE_CD.add(((AD0110010Struct) list.get(i)).getDEFECT_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE == null) {
			l_OPR_DATE = new ArrayList();
		} else {
			l_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE.add(((AD0110010Struct) list.get(i)).getOPR_DATE());
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
			l_PLANT_CD.add(((AD0110010Struct) list.get(i)).getPLANT_CD());
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
			l_WH_CD.add(((AD0110010Struct) list.get(i)).getWH_CD());
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
			l_WS_CD.add(((AD0110010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_OUTPUT_RSLT_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_RSLT_PERSON == null) {
			l_OUTPUT_RSLT_PERSON = new ArrayList();
		} else {
			l_OUTPUT_RSLT_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_RSLT_PERSON.add(((AD0110010Struct) list.get(i)).getOUTPUT_RSLT_PERSON());
		}
		return size;
	}
	public int setL2L_OUTPUT_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_RSLT_COMMENT == null) {
			l_OUTPUT_RSLT_COMMENT = new ArrayList();
		} else {
			l_OUTPUT_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_RSLT_COMMENT.add(((AD0110010Struct) list.get(i)).getOUTPUT_RSLT_COMMENT());
		}
		return size;
	}
	public int setL2L_OPR_TIME_UNIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME_UNIT_TYP == null) {
			l_OPR_TIME_UNIT_TYP = new ArrayList();
		} else {
			l_OPR_TIME_UNIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME_UNIT_TYP.add(((AD0110010Struct) list.get(i)).getOPR_TIME_UNIT_TYP());
		}
		return size;
	}
	public int setL2L_PRE_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRE_ARRANGEMENT_TIME == null) {
			l_PRE_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_PRE_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRE_ARRANGEMENT_TIME.add(((AD0110010Struct) list.get(i)).getPRE_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_POST_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_POST_ARRANGEMENT_TIME == null) {
			l_POST_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_POST_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_POST_ARRANGEMENT_TIME.add(((AD0110010Struct) list.get(i)).getPOST_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME == null) {
			l_OPR_TIME = new ArrayList();
		} else {
			l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME.add(((AD0110010Struct) list.get(i)).getOPR_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_TIME == null) {
			l_CESSATION_TIME = new ArrayList();
		} else {
			l_CESSATION_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_TIME.add(((AD0110010Struct) list.get(i)).getCESSATION_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_CAUSE == null) {
			l_CESSATION_CAUSE = new ArrayList();
		} else {
			l_CESSATION_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_CAUSE.add(((AD0110010Struct) list.get(i)).getCESSATION_CAUSE());
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
			l_LOT_NO.add(((AD0110010Struct) list.get(i)).getLOT_NO());
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
			l_VEND_LOT_NO.add(((AD0110010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT == null) {
			l_DEFECT_COMMENT = new ArrayList();
		} else {
			l_DEFECT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT.add(((AD0110010Struct) list.get(i)).getDEFECT_COMMENT());
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
			l_OPR_INST_CD.add(((AD0110010Struct) list.get(i)).getOPR_INST_CD());
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
			l_PARTIAL_PRD_NO.add(((AD0110010Struct) list.get(i)).getPARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_OPR_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_CRCT_NO == null) {
			l_OPR_CRCT_NO = new ArrayList();
		} else {
			l_OPR_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_CRCT_NO.add(((AD0110010Struct) list.get(i)).getOPR_CRCT_NO());
		}
		return size;
	}
	public int setL2L_dateOPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_dateOPR_DATE == null) {
			l_dateOPR_DATE = new ArrayList();
		} else {
			l_dateOPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_dateOPR_DATE.add(((AD0110010Struct) list.get(i)).getdateOPR_DATE());
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
			l_WORK_ODR_CD.add(((AD0110010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_vc2ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2ITEM_CD == null) {
			l_vc2ITEM_CD = new ArrayList();
		} else {
			l_vc2ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2ITEM_CD.add(((AD0110010Struct) list.get(i)).getvc2ITEM_CD());
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
			l_LOT_CTRL_FLG.add(((AD0110010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NUMBERING_TYP == null) {
			l_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NUMBERING_TYP.add(((AD0110010Struct) list.get(i)).getLOT_NUMBERING_TYP());
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
			l_UNIT_QTY_TYP.add(((AD0110010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_COUNT.add(((AD0110010Struct) list.get(i)).getCOUNT());
		}
		return size;
	}
	public int setL2L_vc2PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2PLANT_CD == null) {
			l_vc2PLANT_CD = new ArrayList();
		} else {
			l_vc2PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2PLANT_CD.add(((AD0110010Struct) list.get(i)).getvc2PLANT_CD());
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
			l_BUSINESS_OPR_DATE.add(((AD0110010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_vc2LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2LOT_NO == null) {
			l_vc2LOT_NO = new ArrayList();
		} else {
			l_vc2LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2LOT_NO.add(((AD0110010Struct) list.get(i)).getvc2LOT_NO());
		}
		return size;
	}
	public int setL2L_vc2WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2WORK_ODR_CD == null) {
			l_vc2WORK_ODR_CD = new ArrayList();
		} else {
			l_vc2WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2WORK_ODR_CD.add(((AD0110010Struct) list.get(i)).getvc2WORK_ODR_CD());
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
			l_OD_NO.add(((AD0110010Struct) list.get(i)).getOD_NO());
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
			l_OPR_INST_QTY.add(((AD0110010Struct) list.get(i)).getOPR_INST_QTY());
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
			l_WORK_STS_TYP.add(((AD0110010Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_BY_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_BY_ITEM == null) {
			l_MODIFY_COUNT_BY_ITEM = new ArrayList();
		} else {
			l_MODIFY_COUNT_BY_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_BY_ITEM.add(((AD0110010Struct) list.get(i)).getMODIFY_COUNT_BY_ITEM());
		}
		return size;
	}
	public int setL2L_vc2OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2OPR_INST_CD == null) {
			l_vc2OPR_INST_CD = new ArrayList();
		} else {
			l_vc2OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2OPR_INST_CD.add(((AD0110010Struct) list.get(i)).getvc2OPR_INST_CD());
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
			l_VALUE.add(((AD0110010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AD0110010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}
	public int setL2L_MAX_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_PRD_NO == null) {
			l_MAX_PRD_NO = new ArrayList();
		} else {
			l_MAX_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_PRD_NO.add(((AD0110010Struct) list.get(i)).getMAX_PRD_NO());
		}
		return size;
	}
	public int setL2L_MAX_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_OPR_DATE == null) {
			l_MAX_OPR_DATE = new ArrayList();
		} else {
			l_MAX_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_OPR_DATE.add(((AD0110010Struct) list.get(i)).getMAX_OPR_DATE());
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
			l_RCV_ISSUE_CTRL_CD.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
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
			l_RCV_ISSUE_TYP.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_TYP());
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
			l_JOB_ODR_CD.add(((AD0110010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AD0110010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_PUCH_ODR_CD.add(((AD0110010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ACPT_NO.add(((AD0110010Struct) list.get(i)).getACPT_NO());
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
			l_ACPT_RSLT_CRCT_NO.add(((AD0110010Struct) list.get(i)).getACPT_RSLT_CRCT_NO());
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
			l_INSPEC_RSLT_CRCT_NO.add(((AD0110010Struct) list.get(i)).getINSPEC_RSLT_CRCT_NO());
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
			l_WORK_IN_PROC_CD.add(((AD0110010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_OPR_RSLT_CRCT_NO.add(((AD0110010Struct) list.get(i)).getOPR_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_h_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_INST_CD == null) {
			l_h_ISSUE_INST_CD = new ArrayList();
		} else {
			l_h_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_INST_CD.add(((AD0110010Struct) list.get(i)).geth_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_SAVE_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAVE_STOCK_ON_HAND_QTY == null) {
			l_SAVE_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_SAVE_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAVE_STOCK_ON_HAND_QTY.add(((AD0110010Struct) list.get(i)).getSAVE_STOCK_ON_HAND_QTY());
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
			l_RCV_ISSUE_QTY.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AMOUNT == null) {
			l_RCV_ISSUE_AMOUNT = new ArrayList();
		} else {
			l_RCV_ISSUE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AMOUNT.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_AMOUNT());
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
			l_RCV_ISSUE_DATE.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_RCV_ISSUE_GNR_TYP.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_ODD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_ODD_QTY == null) {
			l_RCV_ISSUE_ODD_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_ODD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_ODD_QTY.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_ODD_QTY());
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
			l_STOCK_UPD_TYP.add(((AD0110010Struct) list.get(i)).getSTOCK_UPD_TYP());
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
			l_RCV_ISSUE_CMPLT_FLG.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
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
			l_RCV_ISSUE_COMMENT.add(((AD0110010Struct) list.get(i)).getRCV_ISSUE_COMMENT());
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
			l_CONS_TYP.add(((AD0110010Struct) list.get(i)).getCONS_TYP());
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
			l_COMPANY_CD.add(((AD0110010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_SUM_OPR_RSLT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OPR_RSLT_QTY == null) {
			l_SUM_OPR_RSLT_QTY = new ArrayList();
		} else {
			l_SUM_OPR_RSLT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OPR_RSLT_QTY.add(((AD0110010Struct) list.get(i)).getSUM_OPR_RSLT_QTY());
		}
		return size;
	}
	public int setL2L_vc2OUTPUT_RSLT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_vc2OUTPUT_RSLT_CD == null) {
			l_vc2OUTPUT_RSLT_CD = new ArrayList();
		} else {
			l_vc2OUTPUT_RSLT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_vc2OUTPUT_RSLT_CD.add(((AD0110010Struct) list.get(i)).getvc2OUTPUT_RSLT_CD());
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
			l_ISSUE_TYP.add(((AD0110010Struct) list.get(i)).getISSUE_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_DENOMINATOR == null) {
			l_ISSUE_INST_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_DENOMINATOR.add(((AD0110010Struct) list.get(i)).getISSUE_INST_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_NUMERATOR == null) {
			l_ISSUE_INST_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_NUMERATOR.add(((AD0110010Struct) list.get(i)).getISSUE_INST_UNIT_NUMERATOR());
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
			l_ITEM_NAME.add(((AD0110010Struct) list.get(i)).getITEM_NAME());
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
			l_MRP_ODR_TYP.add(((AD0110010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_WH_NAME.add(((AD0110010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_l_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_QTY_TYP == null) {
			l_l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_QTY_TYP.add(((AD0110010Struct) list.get(i)).getl_UNIT_QTY_TYP());
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
			l_TOTAL_ISSUE_QTY.add(((AD0110010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_SUPPLIED_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLIED_ISSUE_QTY == null) {
			l_SUPPLIED_ISSUE_QTY = new ArrayList();
		} else {
			l_SUPPLIED_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLIED_ISSUE_QTY.add(((AD0110010Struct) list.get(i)).getSUPPLIED_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_count_RCV_ISSUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_count_RCV_ISSUE == null) {
			l_count_RCV_ISSUE = new ArrayList();
		} else {
			l_count_RCV_ISSUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_count_RCV_ISSUE.add(((AD0110010Struct) list.get(i)).getcount_RCV_ISSUE());
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
			l_STOCK_ON_HAND_QTY.add(((AD0110010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
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
			l_ISSUE_QTY.add(((AD0110010Struct) list.get(i)).getISSUE_QTY());
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
			l_ISSUE_DATE.add(((AD0110010Struct) list.get(i)).getISSUE_DATE());
		}
		return size;
	}
	public int setL2L_SPENT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPENT_QTY == null) {
			l_SPENT_QTY = new ArrayList();
		} else {
			l_SPENT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPENT_QTY.add(((AD0110010Struct) list.get(i)).getSPENT_QTY());
		}
		return size;
	}
	public int setL2L_NEXTVAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXTVAL == null) {
			l_NEXTVAL = new ArrayList();
		} else {
			l_NEXTVAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXTVAL.add(((AD0110010Struct) list.get(i)).getNEXTVAL());
		}
		return size;
	}
	public int setL2L_RSLT_CTL_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSLT_CTL_SEQ_NO == null) {
			l_RSLT_CTL_SEQ_NO = new ArrayList();
		} else {
			l_RSLT_CTL_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSLT_CTL_SEQ_NO.add(((AD0110010Struct) list.get(i)).getRSLT_CTL_SEQ_NO());
		}
		return size;
	}
	public int setL2L_PART_SUPPLIED_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_SUPPLIED_COMMENT == null) {
			l_PART_SUPPLIED_COMMENT = new ArrayList();
		} else {
			l_PART_SUPPLIED_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_SUPPLIED_COMMENT.add(((AD0110010Struct) list.get(i)).getPART_SUPPLIED_COMMENT());
		}
		return size;
	}
	public int setL2L_SUPPLIED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLIED_DATE == null) {
			l_SUPPLIED_DATE = new ArrayList();
		} else {
			l_SUPPLIED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLIED_DATE.add(((AD0110010Struct) list.get(i)).getSUPPLIED_DATE());
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
			l_ALCD_QTY.add(((AD0110010Struct) list.get(i)).getALCD_QTY());
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
			l_PROC_EXEC_DATE.add(((AD0110010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_FROM_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_PUCH_ODR_CD == null) {
			l_FROM_PUCH_ODR_CD = new ArrayList();
		} else {
			l_FROM_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_PUCH_ODR_CD.add(((AD0110010Struct) list.get(i)).getFROM_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_TO_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_PUCH_ODR_CD == null) {
			l_TO_PUCH_ODR_CD = new ArrayList();
		} else {
			l_TO_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_PUCH_ODR_CD.add(((AD0110010Struct) list.get(i)).getTO_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_FROM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ITEM_CD == null) {
			l_FROM_ITEM_CD = new ArrayList();
		} else {
			l_FROM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ITEM_CD.add(((AD0110010Struct) list.get(i)).getFROM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FROM_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_LOT_NO == null) {
			l_FROM_LOT_NO = new ArrayList();
		} else {
			l_FROM_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_LOT_NO.add(((AD0110010Struct) list.get(i)).getFROM_LOT_NO());
		}
		return size;
	}
	public int setL2L_TO_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ITEM_CD == null) {
			l_TO_ITEM_CD = new ArrayList();
		} else {
			l_TO_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ITEM_CD.add(((AD0110010Struct) list.get(i)).getTO_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TO_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_LOT_NO == null) {
			l_TO_LOT_NO = new ArrayList();
		} else {
			l_TO_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_LOT_NO.add(((AD0110010Struct) list.get(i)).getTO_LOT_NO());
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
		m_l_ERR_PLANT_CD = null;
		m_l_ERR_ITEM_CD = null;
		m_l_ERR_WS_CD = null;
		m_l_ERR_OPR_DATE = null;
		m_l_ERR_ACPT_QTY = null;
		m_l_ERR_DEFECT_QTY = null;
		m_l_ERR_OPR_TIME = null;
		m_l_ERR_LOT_NO = null;
		m_l_ERR_WH_CD = null;
		m_w_COLUMN_FLG = null;
		m_TEMP_PLAN_QTY = null;
		m_TEMP_USEOVER_QTY = null;
		m_TEMP_PLANOUT_QTY = null;
		m_TEMP_USE_QTY = null;
		m_l_ERR_DEFECT_QTY_KEEP = null;
		m_l_ERR_ACPT_QTY_KEEP = null;
		m_l_LOT_NO_KEEP = null;
		m_OUTPUT_RSLT_CD = null;
		m_ITEM_CD = null;
		m_ACPT_QTY = null;
		m_DEFECT_QTY = null;
		m_DEFECT_CAUSE_CD = null;
		m_OPR_DATE = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_WS_CD = null;
		m_OUTPUT_RSLT_PERSON = null;
		m_OUTPUT_RSLT_COMMENT = null;
		m_OPR_TIME_UNIT_TYP = null;
		m_PRE_ARRANGEMENT_TIME = null;
		m_POST_ARRANGEMENT_TIME = null;
		m_OPR_TIME = null;
		m_CESSATION_TIME = null;
		m_CESSATION_CAUSE = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_DEFECT_COMMENT = null;
		m_OPR_INST_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_CRCT_NO = null;
		m_dateOPR_DATE = null;
		m_WORK_ODR_CD = null;
		m_vc2ITEM_CD = null;
		m_LOT_CTRL_FLG = null;
		m_LOT_NUMBERING_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_COUNT = null;
		m_vc2PLANT_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_vc2LOT_NO = null;
		m_vc2WORK_ODR_CD = null;
		m_OD_NO = null;
		m_OPR_INST_QTY = null;
		m_WORK_STS_TYP = null;
		m_MODIFY_COUNT_BY_ITEM = null;
		m_vc2OPR_INST_CD = null;
		m_VALUE = null;
		m_USER_CD = null;
		m_MAX_PRD_NO = null;
		m_MAX_OPR_DATE = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_ACPT_RSLT_CRCT_NO = null;
		m_INSPEC_RSLT_CRCT_NO = null;
		m_WORK_IN_PROC_CD = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_h_ISSUE_INST_CD = null;
		m_SAVE_STOCK_ON_HAND_QTY = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_AMOUNT = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_ODD_QTY = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_RCV_ISSUE_COMMENT = null;
		m_CONS_TYP = null;
		m_COMPANY_CD = null;
		m_SUM_OPR_RSLT_QTY = null;
		m_vc2OUTPUT_RSLT_CD = null;
		m_ISSUE_TYP = null;
		m_ISSUE_INST_UNIT_DENOMINATOR = null;
		m_ISSUE_INST_UNIT_NUMERATOR = null;
		m_ITEM_NAME = null;
		m_MRP_ODR_TYP = null;
		m_WH_NAME = null;
		m_l_UNIT_QTY_TYP = null;
		m_TOTAL_ISSUE_QTY = null;
		m_SUPPLIED_ISSUE_QTY = null;
		m_count_RCV_ISSUE = null;
		m_STOCK_ON_HAND_QTY = null;
		m_ISSUE_QTY = null;
		m_ISSUE_DATE = null;
		m_SPENT_QTY = null;
		m_NEXTVAL = null;
		m_RSLT_CTL_SEQ_NO = null;
		m_PART_SUPPLIED_COMMENT = null;
		m_SUPPLIED_DATE = null;
		m_ALCD_QTY = null;
		m_PROC_EXEC_DATE = null;
		m_FROM_PUCH_ODR_CD = null;
		m_TO_PUCH_ODR_CD = null;
		m_FROM_ITEM_CD = null;
		m_FROM_LOT_NO = null;
		m_TO_ITEM_CD = null;
		m_TO_LOT_NO = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_TYP = null;
		l_l_ERR_INFO = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_PLANT_CD = null;
		l_l_ERR_ITEM_CD = null;
		l_l_ERR_WS_CD = null;
		l_l_ERR_OPR_DATE = null;
		l_l_ERR_ACPT_QTY = null;
		l_l_ERR_DEFECT_QTY = null;
		l_l_ERR_OPR_TIME = null;
		l_l_ERR_LOT_NO = null;
		l_l_ERR_WH_CD = null;
		l_w_COLUMN_FLG = null;
		l_TEMP_PLAN_QTY = null;
		l_TEMP_USEOVER_QTY = null;
		l_TEMP_PLANOUT_QTY = null;
		l_TEMP_USE_QTY = null;
		l_l_ERR_DEFECT_QTY_KEEP = null;
		l_l_ERR_ACPT_QTY_KEEP = null;
		l_l_LOT_NO_KEEP = null;
		l_OUTPUT_RSLT_CD = null;
		l_ITEM_CD = null;
		l_ACPT_QTY = null;
		l_DEFECT_QTY = null;
		l_DEFECT_CAUSE_CD = null;
		l_OPR_DATE = null;
		l_PLANT_CD = null;
		l_WH_CD = null;
		l_WS_CD = null;
		l_OUTPUT_RSLT_PERSON = null;
		l_OUTPUT_RSLT_COMMENT = null;
		l_OPR_TIME_UNIT_TYP = null;
		l_PRE_ARRANGEMENT_TIME = null;
		l_POST_ARRANGEMENT_TIME = null;
		l_OPR_TIME = null;
		l_CESSATION_TIME = null;
		l_CESSATION_CAUSE = null;
		l_LOT_NO = null;
		l_VEND_LOT_NO = null;
		l_DEFECT_COMMENT = null;
		l_OPR_INST_CD = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_CRCT_NO = null;
		l_dateOPR_DATE = null;
		l_WORK_ODR_CD = null;
		l_vc2ITEM_CD = null;
		l_LOT_CTRL_FLG = null;
		l_LOT_NUMBERING_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_COUNT = null;
		l_vc2PLANT_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_vc2LOT_NO = null;
		l_vc2WORK_ODR_CD = null;
		l_OD_NO = null;
		l_OPR_INST_QTY = null;
		l_WORK_STS_TYP = null;
		l_MODIFY_COUNT_BY_ITEM = null;
		l_vc2OPR_INST_CD = null;
		l_VALUE = null;
		l_USER_CD = null;
		l_MAX_PRD_NO = null;
		l_MAX_OPR_DATE = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_PUCH_ODR_CD = null;
		l_ACPT_NO = null;
		l_ACPT_RSLT_CRCT_NO = null;
		l_INSPEC_RSLT_CRCT_NO = null;
		l_WORK_IN_PROC_CD = null;
		l_OPR_RSLT_CRCT_NO = null;
		l_h_ISSUE_INST_CD = null;
		l_SAVE_STOCK_ON_HAND_QTY = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_AMOUNT = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_RCV_ISSUE_ODD_QTY = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_RCV_ISSUE_COMMENT = null;
		l_CONS_TYP = null;
		l_COMPANY_CD = null;
		l_SUM_OPR_RSLT_QTY = null;
		l_vc2OUTPUT_RSLT_CD = null;
		l_ISSUE_TYP = null;
		l_ISSUE_INST_UNIT_DENOMINATOR = null;
		l_ISSUE_INST_UNIT_NUMERATOR = null;
		l_ITEM_NAME = null;
		l_MRP_ODR_TYP = null;
		l_WH_NAME = null;
		l_l_UNIT_QTY_TYP = null;
		l_TOTAL_ISSUE_QTY = null;
		l_SUPPLIED_ISSUE_QTY = null;
		l_count_RCV_ISSUE = null;
		l_STOCK_ON_HAND_QTY = null;
		l_ISSUE_QTY = null;
		l_ISSUE_DATE = null;
		l_SPENT_QTY = null;
		l_NEXTVAL = null;
		l_RSLT_CTL_SEQ_NO = null;
		l_PART_SUPPLIED_COMMENT = null;
		l_SUPPLIED_DATE = null;
		l_ALCD_QTY = null;
		l_PROC_EXEC_DATE = null;
		l_FROM_PUCH_ODR_CD = null;
		l_TO_PUCH_ODR_CD = null;
		l_FROM_ITEM_CD = null;
		l_FROM_LOT_NO = null;
		l_TO_ITEM_CD = null;
		l_TO_LOT_NO = null;

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
	 * medAD0110010クラスの標準コンストラクタ
	 */
	public AD0110010Struct()
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
	public void setStruct(AD0110010Struct struct)
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
	public void setStructM(AD0110010Struct struct)
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
			this.setl_ERR_PLANT_CD(struct.getl_ERR_PLANT_CD());
			this.setl_ERR_ITEM_CD(struct.getl_ERR_ITEM_CD());
			this.setl_ERR_WS_CD(struct.getl_ERR_WS_CD());
			this.setl_ERR_OPR_DATE(struct.getl_ERR_OPR_DATE());
			this.setl_ERR_ACPT_QTY(struct.getl_ERR_ACPT_QTY());
			this.setl_ERR_DEFECT_QTY(struct.getl_ERR_DEFECT_QTY());
			this.setl_ERR_OPR_TIME(struct.getl_ERR_OPR_TIME());
			this.setl_ERR_LOT_NO(struct.getl_ERR_LOT_NO());
			this.setl_ERR_WH_CD(struct.getl_ERR_WH_CD());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setTEMP_PLAN_QTY(struct.getTEMP_PLAN_QTY());
			this.setTEMP_USEOVER_QTY(struct.getTEMP_USEOVER_QTY());
			this.setTEMP_PLANOUT_QTY(struct.getTEMP_PLANOUT_QTY());
			this.setTEMP_USE_QTY(struct.getTEMP_USE_QTY());
			this.setl_ERR_DEFECT_QTY_KEEP(struct.getl_ERR_DEFECT_QTY_KEEP());
			this.setl_ERR_ACPT_QTY_KEEP(struct.getl_ERR_ACPT_QTY_KEEP());
			this.setl_LOT_NO_KEEP(struct.getl_LOT_NO_KEEP());
			this.setOUTPUT_RSLT_CD(struct.getOUTPUT_RSLT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setDEFECT_CAUSE_CD(struct.getDEFECT_CAUSE_CD());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setOUTPUT_RSLT_PERSON(struct.getOUTPUT_RSLT_PERSON());
			this.setOUTPUT_RSLT_COMMENT(struct.getOUTPUT_RSLT_COMMENT());
			this.setOPR_TIME_UNIT_TYP(struct.getOPR_TIME_UNIT_TYP());
			this.setPRE_ARRANGEMENT_TIME(struct.getPRE_ARRANGEMENT_TIME());
			this.setPOST_ARRANGEMENT_TIME(struct.getPOST_ARRANGEMENT_TIME());
			this.setOPR_TIME(struct.getOPR_TIME());
			this.setCESSATION_TIME(struct.getCESSATION_TIME());
			this.setCESSATION_CAUSE(struct.getCESSATION_CAUSE());
			this.setLOT_NO(struct.getLOT_NO());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setDEFECT_COMMENT(struct.getDEFECT_COMMENT());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_CRCT_NO(struct.getOPR_CRCT_NO());
			this.setdateOPR_DATE(struct.getdateOPR_DATE());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setvc2ITEM_CD(struct.getvc2ITEM_CD());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setCOUNT(struct.getCOUNT());
			this.setvc2PLANT_CD(struct.getvc2PLANT_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setvc2LOT_NO(struct.getvc2LOT_NO());
			this.setvc2WORK_ODR_CD(struct.getvc2WORK_ODR_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setMODIFY_COUNT_BY_ITEM(struct.getMODIFY_COUNT_BY_ITEM());
			this.setvc2OPR_INST_CD(struct.getvc2OPR_INST_CD());
			this.setVALUE(struct.getVALUE());
			this.setUSER_CD(struct.getUSER_CD());
			this.setMAX_PRD_NO(struct.getMAX_PRD_NO());
			this.setMAX_OPR_DATE(struct.getMAX_OPR_DATE());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_RSLT_CRCT_NO(struct.getACPT_RSLT_CRCT_NO());
			this.setINSPEC_RSLT_CRCT_NO(struct.getINSPEC_RSLT_CRCT_NO());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setOPR_RSLT_CRCT_NO(struct.getOPR_RSLT_CRCT_NO());
			this.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.setSAVE_STOCK_ON_HAND_QTY(struct.getSAVE_STOCK_ON_HAND_QTY());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_AMOUNT(struct.getRCV_ISSUE_AMOUNT());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setRCV_ISSUE_ODD_QTY(struct.getRCV_ISSUE_ODD_QTY());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setRCV_ISSUE_COMMENT(struct.getRCV_ISSUE_COMMENT());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setSUM_OPR_RSLT_QTY(struct.getSUM_OPR_RSLT_QTY());
			this.setvc2OUTPUT_RSLT_CD(struct.getvc2OUTPUT_RSLT_CD());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setISSUE_INST_UNIT_DENOMINATOR(struct.getISSUE_INST_UNIT_DENOMINATOR());
			this.setISSUE_INST_UNIT_NUMERATOR(struct.getISSUE_INST_UNIT_NUMERATOR());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setWH_NAME(struct.getWH_NAME());
			this.setl_UNIT_QTY_TYP(struct.getl_UNIT_QTY_TYP());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setSUPPLIED_ISSUE_QTY(struct.getSUPPLIED_ISSUE_QTY());
			this.setcount_RCV_ISSUE(struct.getcount_RCV_ISSUE());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setISSUE_QTY(struct.getISSUE_QTY());
			this.setISSUE_DATE(struct.getISSUE_DATE());
			this.setSPENT_QTY(struct.getSPENT_QTY());
			this.setNEXTVAL(struct.getNEXTVAL());
			this.setRSLT_CTL_SEQ_NO(struct.getRSLT_CTL_SEQ_NO());
			this.setPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
			this.setSUPPLIED_DATE(struct.getSUPPLIED_DATE());
			this.setALCD_QTY(struct.getALCD_QTY());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setFROM_PUCH_ODR_CD(struct.getFROM_PUCH_ODR_CD());
			this.setTO_PUCH_ODR_CD(struct.getTO_PUCH_ODR_CD());
			this.setFROM_ITEM_CD(struct.getFROM_ITEM_CD());
			this.setFROM_LOT_NO(struct.getFROM_LOT_NO());
			this.setTO_ITEM_CD(struct.getTO_ITEM_CD());
			this.setTO_LOT_NO(struct.getTO_LOT_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0110010Struct struct)
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
			this.setList_l_ERR_PLANT_CD(struct.getList_l_ERR_PLANT_CD());
			this.setList_l_ERR_ITEM_CD(struct.getList_l_ERR_ITEM_CD());
			this.setList_l_ERR_WS_CD(struct.getList_l_ERR_WS_CD());
			this.setList_l_ERR_OPR_DATE(struct.getList_l_ERR_OPR_DATE());
			this.setList_l_ERR_ACPT_QTY(struct.getList_l_ERR_ACPT_QTY());
			this.setList_l_ERR_DEFECT_QTY(struct.getList_l_ERR_DEFECT_QTY());
			this.setList_l_ERR_OPR_TIME(struct.getList_l_ERR_OPR_TIME());
			this.setList_l_ERR_LOT_NO(struct.getList_l_ERR_LOT_NO());
			this.setList_l_ERR_WH_CD(struct.getList_l_ERR_WH_CD());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_TEMP_PLAN_QTY(struct.getList_TEMP_PLAN_QTY());
			this.setList_TEMP_USEOVER_QTY(struct.getList_TEMP_USEOVER_QTY());
			this.setList_TEMP_PLANOUT_QTY(struct.getList_TEMP_PLANOUT_QTY());
			this.setList_TEMP_USE_QTY(struct.getList_TEMP_USE_QTY());
			this.setList_l_ERR_DEFECT_QTY_KEEP(struct.getList_l_ERR_DEFECT_QTY_KEEP());
			this.setList_l_ERR_ACPT_QTY_KEEP(struct.getList_l_ERR_ACPT_QTY_KEEP());
			this.setList_l_LOT_NO_KEEP(struct.getList_l_LOT_NO_KEEP());
			this.setList_OUTPUT_RSLT_CD(struct.getList_OUTPUT_RSLT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_DEFECT_CAUSE_CD(struct.getList_DEFECT_CAUSE_CD());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OUTPUT_RSLT_PERSON(struct.getList_OUTPUT_RSLT_PERSON());
			this.setList_OUTPUT_RSLT_COMMENT(struct.getList_OUTPUT_RSLT_COMMENT());
			this.setList_OPR_TIME_UNIT_TYP(struct.getList_OPR_TIME_UNIT_TYP());
			this.setList_PRE_ARRANGEMENT_TIME(struct.getList_PRE_ARRANGEMENT_TIME());
			this.setList_POST_ARRANGEMENT_TIME(struct.getList_POST_ARRANGEMENT_TIME());
			this.setList_OPR_TIME(struct.getList_OPR_TIME());
			this.setList_CESSATION_TIME(struct.getList_CESSATION_TIME());
			this.setList_CESSATION_CAUSE(struct.getList_CESSATION_CAUSE());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_DEFECT_COMMENT(struct.getList_DEFECT_COMMENT());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_CRCT_NO(struct.getList_OPR_CRCT_NO());
			this.setList_dateOPR_DATE(struct.getList_dateOPR_DATE());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_vc2ITEM_CD(struct.getList_vc2ITEM_CD());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_LOT_NUMBERING_TYP(struct.getList_LOT_NUMBERING_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_vc2PLANT_CD(struct.getList_vc2PLANT_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_vc2LOT_NO(struct.getList_vc2LOT_NO());
			this.setList_vc2WORK_ODR_CD(struct.getList_vc2WORK_ODR_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_MODIFY_COUNT_BY_ITEM(struct.getList_MODIFY_COUNT_BY_ITEM());
			this.setList_vc2OPR_INST_CD(struct.getList_vc2OPR_INST_CD());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_MAX_PRD_NO(struct.getList_MAX_PRD_NO());
			this.setList_MAX_OPR_DATE(struct.getList_MAX_OPR_DATE());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_RSLT_CRCT_NO(struct.getList_ACPT_RSLT_CRCT_NO());
			this.setList_INSPEC_RSLT_CRCT_NO(struct.getList_INSPEC_RSLT_CRCT_NO());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_OPR_RSLT_CRCT_NO(struct.getList_OPR_RSLT_CRCT_NO());
			this.setList_h_ISSUE_INST_CD(struct.getList_h_ISSUE_INST_CD());
			this.setList_SAVE_STOCK_ON_HAND_QTY(struct.getList_SAVE_STOCK_ON_HAND_QTY());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_AMOUNT(struct.getList_RCV_ISSUE_AMOUNT());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_RCV_ISSUE_ODD_QTY(struct.getList_RCV_ISSUE_ODD_QTY());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_RCV_ISSUE_COMMENT(struct.getList_RCV_ISSUE_COMMENT());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_SUM_OPR_RSLT_QTY(struct.getList_SUM_OPR_RSLT_QTY());
			this.setList_vc2OUTPUT_RSLT_CD(struct.getList_vc2OUTPUT_RSLT_CD());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_ISSUE_INST_UNIT_DENOMINATOR(struct.getList_ISSUE_INST_UNIT_DENOMINATOR());
			this.setList_ISSUE_INST_UNIT_NUMERATOR(struct.getList_ISSUE_INST_UNIT_NUMERATOR());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_l_UNIT_QTY_TYP(struct.getList_l_UNIT_QTY_TYP());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_SUPPLIED_ISSUE_QTY(struct.getList_SUPPLIED_ISSUE_QTY());
			this.setList_count_RCV_ISSUE(struct.getList_count_RCV_ISSUE());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_ISSUE_QTY(struct.getList_ISSUE_QTY());
			this.setList_ISSUE_DATE(struct.getList_ISSUE_DATE());
			this.setList_SPENT_QTY(struct.getList_SPENT_QTY());
			this.setList_NEXTVAL(struct.getList_NEXTVAL());
			this.setList_RSLT_CTL_SEQ_NO(struct.getList_RSLT_CTL_SEQ_NO());
			this.setList_PART_SUPPLIED_COMMENT(struct.getList_PART_SUPPLIED_COMMENT());
			this.setList_SUPPLIED_DATE(struct.getList_SUPPLIED_DATE());
			this.setList_ALCD_QTY(struct.getList_ALCD_QTY());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_FROM_PUCH_ODR_CD(struct.getList_FROM_PUCH_ODR_CD());
			this.setList_TO_PUCH_ODR_CD(struct.getList_TO_PUCH_ODR_CD());
			this.setList_FROM_ITEM_CD(struct.getList_FROM_ITEM_CD());
			this.setList_FROM_LOT_NO(struct.getList_FROM_LOT_NO());
			this.setList_TO_ITEM_CD(struct.getList_TO_ITEM_CD());
			this.setList_TO_LOT_NO(struct.getList_TO_LOT_NO());
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

	// 第 7 変数初期値： i_l_ERR_PLANT_CD


	final static String i_l_ERR_PLANT_CD = null;

	// 第 8 変数初期値： i_l_ERR_ITEM_CD


	final static String i_l_ERR_ITEM_CD = null;

	// 第 9 変数初期値： i_l_ERR_WS_CD


	final static String i_l_ERR_WS_CD = null;

	// 第 10 変数初期値： i_l_ERR_OPR_DATE


	final static String i_l_ERR_OPR_DATE = null;

	// 第 11 変数初期値： i_l_ERR_ACPT_QTY


	final static String i_l_ERR_ACPT_QTY = null;

	// 第 12 変数初期値： i_l_ERR_DEFECT_QTY


	final static String i_l_ERR_DEFECT_QTY = null;

	// 第 13 変数初期値： i_l_ERR_OPR_TIME


	final static String i_l_ERR_OPR_TIME = null;

	// 第 14 変数初期値： i_l_ERR_LOT_NO


	final static String i_l_ERR_LOT_NO = null;

	// 第 15 変数初期値： i_l_ERR_WH_CD


	final static String i_l_ERR_WH_CD = null;

	// 第 16 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 17 変数初期値： i_TEMP_PLAN_QTY


	final static String i_TEMP_PLAN_QTY = null;

	// 第 18 変数初期値： i_TEMP_USEOVER_QTY


	final static String i_TEMP_USEOVER_QTY = null;

	// 第 19 変数初期値： i_TEMP_PLANOUT_QTY


	final static String i_TEMP_PLANOUT_QTY = null;

	// 第 20 変数初期値： i_TEMP_USE_QTY


	final static String i_TEMP_USE_QTY = null;

	// 第 21 変数初期値： i_l_ERR_DEFECT_QTY_KEEP


	final static String i_l_ERR_DEFECT_QTY_KEEP = null;

	// 第 22 変数初期値： i_l_ERR_ACPT_QTY_KEEP


	final static String i_l_ERR_ACPT_QTY_KEEP = null;

	// 第 23 変数初期値： i_l_LOT_NO_KEEP


	final static String i_l_LOT_NO_KEEP = null;

	// 第 24 変数初期値： i_OUTPUT_RSLT_CD


	final static String i_OUTPUT_RSLT_CD = null;

	// 第 25 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 26 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 27 変数初期値： i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// 第 28 変数初期値： i_DEFECT_CAUSE_CD


	final static String i_DEFECT_CAUSE_CD = null;

	// 第 29 変数初期値： i_OPR_DATE


	final static String i_OPR_DATE = null;

	// 第 30 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 31 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 32 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 33 変数初期値： i_OUTPUT_RSLT_PERSON


	final static String i_OUTPUT_RSLT_PERSON = null;

	// 第 34 変数初期値： i_OUTPUT_RSLT_COMMENT


	final static String i_OUTPUT_RSLT_COMMENT = null;

	// 第 35 変数初期値： i_OPR_TIME_UNIT_TYP


	final static String i_OPR_TIME_UNIT_TYP = null;

	// 第 36 変数初期値： i_PRE_ARRANGEMENT_TIME


	final static String i_PRE_ARRANGEMENT_TIME = null;

	// 第 37 変数初期値： i_POST_ARRANGEMENT_TIME


	final static String i_POST_ARRANGEMENT_TIME = null;

	// 第 38 変数初期値： i_OPR_TIME


	final static String i_OPR_TIME = null;

	// 第 39 変数初期値： i_CESSATION_TIME


	final static String i_CESSATION_TIME = null;

	// 第 40 変数初期値： i_CESSATION_CAUSE


	final static String i_CESSATION_CAUSE = null;

	// 第 41 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 42 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 43 変数初期値： i_DEFECT_COMMENT


	final static String i_DEFECT_COMMENT = null;

	// 第 44 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 45 変数初期値： i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// 第 46 変数初期値： i_OPR_CRCT_NO


	final static String i_OPR_CRCT_NO = null;

	// 第 47 変数初期値： i_dateOPR_DATE


	final static String i_dateOPR_DATE = null;

	// 第 48 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 49 変数初期値： i_vc2ITEM_CD


	final static String i_vc2ITEM_CD = null;

	// 第 50 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 51 変数初期値： i_LOT_NUMBERING_TYP


	final static String i_LOT_NUMBERING_TYP = null;

	// 第 52 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 53 変数初期値： i_COUNT


	final static String i_COUNT = null;

	// 第 54 変数初期値： i_vc2PLANT_CD


	final static String i_vc2PLANT_CD = null;

	// 第 55 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 56 変数初期値： i_vc2LOT_NO


	final static String i_vc2LOT_NO = null;

	// 第 57 変数初期値： i_vc2WORK_ODR_CD


	final static String i_vc2WORK_ODR_CD = null;

	// 第 58 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 59 変数初期値： i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// 第 60 変数初期値： i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// 第 61 変数初期値： i_MODIFY_COUNT_BY_ITEM


	final static String i_MODIFY_COUNT_BY_ITEM = null;

	// 第 62 変数初期値： i_vc2OPR_INST_CD


	final static String i_vc2OPR_INST_CD = null;

	// 第 63 変数初期値： i_VALUE


	final static String i_VALUE = null;

	// 第 64 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 65 変数初期値： i_MAX_PRD_NO


	final static String i_MAX_PRD_NO = null;

	// 第 66 変数初期値： i_MAX_OPR_DATE


	final static String i_MAX_OPR_DATE = null;

	// 第 67 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 68 変数初期値： i_RCV_ISSUE_TYP


	final static String i_RCV_ISSUE_TYP = null;

	// 第 69 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 70 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 71 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 72 変数初期値： i_ACPT_NO


	final static String i_ACPT_NO = null;

	// 第 73 変数初期値： i_ACPT_RSLT_CRCT_NO


	final static String i_ACPT_RSLT_CRCT_NO = null;

	// 第 74 変数初期値： i_INSPEC_RSLT_CRCT_NO


	final static String i_INSPEC_RSLT_CRCT_NO = null;

	// 第 75 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 76 変数初期値： i_OPR_RSLT_CRCT_NO


	final static String i_OPR_RSLT_CRCT_NO = null;

	// 第 77 変数初期値： i_h_ISSUE_INST_CD


	final static String i_h_ISSUE_INST_CD = null;

	// 第 78 変数初期値： i_SAVE_STOCK_ON_HAND_QTY


	final static String i_SAVE_STOCK_ON_HAND_QTY = null;

	// 第 79 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 80 変数初期値： i_RCV_ISSUE_AMOUNT


	final static String i_RCV_ISSUE_AMOUNT = null;

	// 第 81 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 82 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static String i_RCV_ISSUE_GNR_TYP = null;

	// 第 83 変数初期値： i_RCV_ISSUE_ODD_QTY


	final static String i_RCV_ISSUE_ODD_QTY = null;

	// 第 84 変数初期値： i_STOCK_UPD_TYP


	final static String i_STOCK_UPD_TYP = null;

	// 第 85 変数初期値： i_RCV_ISSUE_CMPLT_FLG


	final static String i_RCV_ISSUE_CMPLT_FLG = null;

	// 第 86 変数初期値： i_RCV_ISSUE_COMMENT


	final static String i_RCV_ISSUE_COMMENT = null;

	// 第 87 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 88 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 89 変数初期値： i_SUM_OPR_RSLT_QTY


	final static String i_SUM_OPR_RSLT_QTY = null;

	// 第 90 変数初期値： i_vc2OUTPUT_RSLT_CD


	final static String i_vc2OUTPUT_RSLT_CD = null;

	// 第 91 変数初期値： i_ISSUE_TYP


	final static String i_ISSUE_TYP = null;

	// 第 92 変数初期値： i_ISSUE_INST_UNIT_DENOMINATOR


	final static String i_ISSUE_INST_UNIT_DENOMINATOR = null;

	// 第 93 変数初期値： i_ISSUE_INST_UNIT_NUMERATOR


	final static String i_ISSUE_INST_UNIT_NUMERATOR = null;

	// 第 94 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 95 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 96 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 97 変数初期値： i_l_UNIT_QTY_TYP


	final static String i_l_UNIT_QTY_TYP = null;

	// 第 98 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 99 変数初期値： i_SUPPLIED_ISSUE_QTY


	final static String i_SUPPLIED_ISSUE_QTY = null;

	// 第 100 変数初期値： i_count_RCV_ISSUE


	final static String i_count_RCV_ISSUE = null;

	// 第 101 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 102 変数初期値： i_ISSUE_QTY


	final static String i_ISSUE_QTY = null;

	// 第 103 変数初期値： i_ISSUE_DATE


	final static String i_ISSUE_DATE = null;

	// 第 104 変数初期値： i_SPENT_QTY


	final static String i_SPENT_QTY = null;

	// 第 105 変数初期値： i_NEXTVAL


	final static String i_NEXTVAL = null;

	// 第 106 変数初期値： i_RSLT_CTL_SEQ_NO


	final static String i_RSLT_CTL_SEQ_NO = null;

	// 第 107 変数初期値： i_PART_SUPPLIED_COMMENT


	final static String i_PART_SUPPLIED_COMMENT = null;

	// 第 108 変数初期値： i_SUPPLIED_DATE


	final static String i_SUPPLIED_DATE = null;

	// 第 109 変数初期値： i_ALCD_QTY


	final static String i_ALCD_QTY = null;

	// 第 110 変数初期値： i_PROC_EXEC_DATE


	final static String i_PROC_EXEC_DATE = null;

	// 第 111 変数初期値： i_FROM_PUCH_ODR_CD


	final static String i_FROM_PUCH_ODR_CD = null;

	// 第 112 変数初期値： i_TO_PUCH_ODR_CD


	final static String i_TO_PUCH_ODR_CD = null;

	// 第 113 変数初期値： i_FROM_ITEM_CD


	final static String i_FROM_ITEM_CD = null;

	// 第 114 変数初期値： i_FROM_LOT_NO


	final static String i_FROM_LOT_NO = null;

	// 第 115 変数初期値： i_TO_ITEM_CD


	final static String i_TO_ITEM_CD = null;

	// 第 116 変数初期値： i_TO_LOT_NO


	final static String i_TO_LOT_NO = null;

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

	// 第 7 変数初期値： i_l_ERR_PLANT_CD

	final static String i_l_ERR_PLANT_CD = null;

	// 第 8 変数初期値： i_l_ERR_ITEM_CD

	final static String i_l_ERR_ITEM_CD = null;

	// 第 9 変数初期値： i_l_ERR_WS_CD

	final static String i_l_ERR_WS_CD = null;

	// 第 10 変数初期値： i_l_ERR_OPR_DATE

	final static String i_l_ERR_OPR_DATE = null;

	// 第 11 変数初期値： i_l_ERR_ACPT_QTY

	final static String i_l_ERR_ACPT_QTY = null;

	// 第 12 変数初期値： i_l_ERR_DEFECT_QTY

	final static String i_l_ERR_DEFECT_QTY = null;

	// 第 13 変数初期値： i_l_ERR_OPR_TIME

	final static String i_l_ERR_OPR_TIME = null;

	// 第 14 変数初期値： i_l_ERR_LOT_NO

	final static String i_l_ERR_LOT_NO = null;

	// 第 15 変数初期値： i_w_COLUMN_FLG

	final static String i_w_COLUMN_FLG = null;

	// 第 16 変数初期値： i_OUTPUT_RSLT_CD

	final static String i_OUTPUT_RSLT_CD = null;

	// 第 17 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 18 変数初期値： i_ACPT_QTY

	final static String i_ACPT_QTY = null;

	// 第 19 変数初期値： i_DEFECT_QTY

	final static String i_DEFECT_QTY = null;

	// 第 20 変数初期値： i_DEFECT_CAUSE_CD

	final static String i_DEFECT_CAUSE_CD = null;

	// 第 21 変数初期値： i_OPR_DATE

	final static String i_OPR_DATE = null;

	// 第 22 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 23 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 24 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 25 変数初期値： i_OUTPUT_RSLT_PERSON

	final static String i_OUTPUT_RSLT_PERSON = null;

	// 第 26 変数初期値： i_OUTPUT_RSLT_COMMENT

	final static String i_OUTPUT_RSLT_COMMENT = null;

	// 第 27 変数初期値： i_OPR_TIME_UNIT_TYP

	final static String i_OPR_TIME_UNIT_TYP = null;

	// 第 28 変数初期値： i_PRE_ARRANGEMENT_TIME

	final static String i_PRE_ARRANGEMENT_TIME = null;

	// 第 29 変数初期値： i_POST_ARRANGEMENT_TIME

	final static String i_POST_ARRANGEMENT_TIME = null;

	// 第 30 変数初期値： i_OPR_TIME

	final static String i_OPR_TIME = null;

	// 第 31 変数初期値： i_CESSATION_TIME

	final static String i_CESSATION_TIME = null;

	// 第 32 変数初期値： i_CESSATION_CAUSE

	final static String i_CESSATION_CAUSE = null;

	// 第 33 変数初期値： i_LOT_NO

	final static String i_LOT_NO = null;

	// 第 34 変数初期値： i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// 第 35 変数初期値： i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// 第 36 変数初期値： i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// 第 37 変数初期値： i_dateOPR_DATE

	final static String i_dateOPR_DATE = null;

	// 第 38 変数初期値： i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// 第 39 変数初期値： i_vc2ITEM_CD

	final static String i_vc2ITEM_CD = null;

	// 第 40 変数初期値： i_LOT_CTRL_FLG

	final static String i_LOT_CTRL_FLG = null;

	// 第 41 変数初期値： i_LOT_NUMBERING_TYP

	final static String i_LOT_NUMBERING_TYP = null;

	// 第 42 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 43 変数初期値： i_COUNT

	final static String i_COUNT = null;

	// 第 44 変数初期値： i_vc2PLANT_CD

	final static String i_vc2PLANT_CD = null;

	// 第 45 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// 第 46 変数初期値： i_vc2LOT_NO

	final static String i_vc2LOT_NO = null;

	// 第 47 変数初期値： i_vc2WORK_ODR_CD

	final static String i_vc2WORK_ODR_CD = null;

	// 第 48 変数初期値： i_vc2OPR_INST_CD

	final static String i_vc2OPR_INST_CD = null;

	// 第 49 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 50 変数初期値： i_MAX_PRD_NO

	final static String i_MAX_PRD_NO = null;

	// 第 51 変数初期値： i_MAX_OPR_DATE

	final static String i_MAX_OPR_DATE = null;


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
		m_l_ERR_PLANT_CD = i_l_ERR_PLANT_CD;
		m_l_ERR_ITEM_CD = i_l_ERR_ITEM_CD;
		m_l_ERR_WS_CD = i_l_ERR_WS_CD;
		m_l_ERR_OPR_DATE = i_l_ERR_OPR_DATE;
		m_l_ERR_ACPT_QTY = i_l_ERR_ACPT_QTY;
		m_l_ERR_DEFECT_QTY = i_l_ERR_DEFECT_QTY;
		m_l_ERR_OPR_TIME = i_l_ERR_OPR_TIME;
		m_l_ERR_LOT_NO = i_l_ERR_LOT_NO;
		m_w_COLUMN_FLG = i_w_COLUMN_FLG;
		m_OUTPUT_RSLT_CD = i_OUTPUT_RSLT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ACPT_QTY = i_ACPT_QTY;
		m_DEFECT_QTY = i_DEFECT_QTY;
		m_DEFECT_CAUSE_CD = i_DEFECT_CAUSE_CD;
		m_OPR_DATE = i_OPR_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_WH_CD = i_WH_CD;
		m_WS_CD = i_WS_CD;
		m_OUTPUT_RSLT_PERSON = i_OUTPUT_RSLT_PERSON;
		m_OUTPUT_RSLT_COMMENT = i_OUTPUT_RSLT_COMMENT;
		m_OPR_TIME_UNIT_TYP = i_OPR_TIME_UNIT_TYP;
		m_PRE_ARRANGEMENT_TIME = i_PRE_ARRANGEMENT_TIME;
		m_POST_ARRANGEMENT_TIME = i_POST_ARRANGEMENT_TIME;
		m_OPR_TIME = i_OPR_TIME;
		m_CESSATION_TIME = i_CESSATION_TIME;
		m_CESSATION_CAUSE = i_CESSATION_CAUSE;
		m_LOT_NO = i_LOT_NO;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_dateOPR_DATE = i_dateOPR_DATE;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_vc2ITEM_CD = i_vc2ITEM_CD;
		m_LOT_CTRL_FLG = i_LOT_CTRL_FLG;
		m_LOT_NUMBERING_TYP = i_LOT_NUMBERING_TYP;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_COUNT = i_COUNT;
		m_vc2PLANT_CD = i_vc2PLANT_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_vc2LOT_NO = i_vc2LOT_NO;
		m_vc2WORK_ODR_CD = i_vc2WORK_ODR_CD;
		m_vc2OPR_INST_CD = i_vc2OPR_INST_CD;
		m_USER_CD = i_USER_CD;
		m_MAX_PRD_NO = i_MAX_PRD_NO;
		m_MAX_OPR_DATE = i_MAX_OPR_DATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
