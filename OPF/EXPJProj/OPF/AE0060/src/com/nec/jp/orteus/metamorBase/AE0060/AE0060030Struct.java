/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
// TODO: ここにimportパッケージを記述してください
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060030Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ACPT_STS_TYP_DN */
	public String m_ACPT_STS_TYP_DN = null;
	/** 第 2 変数： m_c_COMPLETE */
	public String m_c_COMPLETE = null;
	/** 第 3 変数： m_ACPT_INSPC_TYP_DN */
	public String m_ACPT_INSPC_TYP_DN = null;
	/** 第 4 変数： m_INSPC_CMPLT_FLG_DN */
	public String m_INSPC_CMPLT_FLG_DN = null;
	/** 第 5 変数： m_SPL_ITEM_TYP_DN */
	public String m_SPL_ITEM_TYP_DN = null;
	/** 第 6 変数： m_PRODUCT_TYP_DN */
	public String m_PRODUCT_TYP_DN = null;
	/** 第 7 変数： m_PUCH_ODR_STS_TYP_DN */
	public String m_PUCH_ODR_STS_TYP_DN = null;
	/** 第 8 変数： m_NON_NO_ITEM_FLG_DN */
	public String m_NON_NO_ITEM_FLG_DN = null;
	/** 第 9 変数： m_h_PUCH_ODR_CD */
	public String m_h_PUCH_ODR_CD = null;
	/** 第 10 変数： m_h_ACPT_NO */
	public String m_h_ACPT_NO = null;
	/** 第 11 変数： m_UNIT_QTY_TYP_DN */
	public String m_UNIT_QTY_TYP_DN = null;
	/** 第 12 変数： m_h_INSPEC_DATE */
	public String m_h_INSPEC_DATE = null;
	/** 第 13 変数： m_l_DEFECT_CAUSE_CD_name */
	public String m_l_DEFECT_CAUSE_CD_name = null;
	/** 第 14 変数： m_l_DEFECT_CAUSE_CD_val */
	public String m_l_DEFECT_CAUSE_CD_val = null;
	/** 第 15 変数： m_h_INSPECTED_QTY */
	public String m_h_INSPECTED_QTY = null;
	/** 第 16 変数： m_l_DEFECT_CAUSE_CD */
	public String m_l_DEFECT_CAUSE_CD = null;
	/** 第 17 変数： m_l_DEFECT_INSPC_QTY */
	public String m_l_DEFECT_INSPC_QTY = null;
	/** 第 18 変数： m_l_DEFECT_COMMENT */
	public String m_l_DEFECT_COMMENT = null;
	/** 第 19 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 20 変数： m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** 第 21 変数： m_ITEM_CD_M */
	public String m_ITEM_CD_M = null;
	/** 第 22 変数： m_ITEM_NAME_M */
	public String m_ITEM_NAME_M = null;
	/** 第 23 変数： m_PUCH_ODR_MODIFY_COUNT */
	public String m_PUCH_ODR_MODIFY_COUNT = null;
	/** 第 24 変数： m_ACPT_MODIFY_COUNT */
	public String m_ACPT_MODIFY_COUNT = null;
	/** 第 25 変数： m_INSPC_MODIFY_COUNT */
	public String m_INSPC_MODIFY_COUNT = null;
	/** 第 26 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 27 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 28 変数： m_ACPT_STS_TYP */
	public String m_ACPT_STS_TYP = null;
	/** 第 29 変数： m_INSPECTED_QTY */
	public String m_INSPECTED_QTY = null;
	/** 第 30 変数： m_ACCEPTED_QTY */
	public String m_ACCEPTED_QTY = null;
	/** 第 31 変数： m_DEFECTED_QTY */
	public String m_DEFECTED_QTY = null;
	/** 第 32 変数： m_INSPEC_DATE */
	public String m_INSPEC_DATE = null;
	/** 第 33 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 34 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 35 変数： m_INSPEC_RSLT_COMMENT */
	public String m_INSPEC_RSLT_COMMENT = null;
	/** 第 36 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 37 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 38 変数： m_INSPC_WH_CD */
	public String m_INSPC_WH_CD = null;
	/** 第 39 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 40 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 41 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 42 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 43 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 44 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 45 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 46 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 47 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 48 変数： m_SUM_ACPT_QTY */
	public String m_SUM_ACPT_QTY = null;
	/** 第 49 変数： m_INSPC_CMPLT_FLG */
	public String m_INSPC_CMPLT_FLG = null;
	/** 第 50 変数： m_PUCH_ODR_SLIP_ISS_DATE */
	public String m_PUCH_ODR_SLIP_ISS_DATE = null;
	/** 第 51 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 52 変数： m_CONFIRM_DLV_DATE */
	public String m_CONFIRM_DLV_DATE = null;
	/** 第 53 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 54 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 55 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 56 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 57 変数： m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** 第 58 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 59 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 60 変数： m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** 第 61 変数： m_NON_NO_ITEM_FLG */
	public String m_NON_NO_ITEM_FLG = null;
	/** 第 62 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 63 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 64 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 65 変数： m_PUCH_ODR_COMMENT */
	public String m_PUCH_ODR_COMMENT = null;
	/** 第 66 変数： m_ACPT_DATE */
	public String m_ACPT_DATE = null;
	/** 第 67 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 68 変数： m_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 69 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 70 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 71 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 72 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 73 変数： m_INSPC_WH_NAME */
	public String m_INSPC_WH_NAME = null;
	/** 第 74 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 75 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ACPT_STS_TYP_DN */
	public List l_ACPT_STS_TYP_DN = null;

	/** 第 2 List変数： l_c_COMPLETE */
	public List l_c_COMPLETE = null;

	/** 第 3 List変数： l_ACPT_INSPC_TYP_DN */
	public List l_ACPT_INSPC_TYP_DN = null;

	/** 第 4 List変数： l_INSPC_CMPLT_FLG_DN */
	public List l_INSPC_CMPLT_FLG_DN = null;

	/** 第 5 List変数： l_SPL_ITEM_TYP_DN */
	public List l_SPL_ITEM_TYP_DN = null;

	/** 第 6 List変数： l_PRODUCT_TYP_DN */
	public List l_PRODUCT_TYP_DN = null;

	/** 第 7 List変数： l_PUCH_ODR_STS_TYP_DN */
	public List l_PUCH_ODR_STS_TYP_DN = null;

	/** 第 8 List変数： l_NON_NO_ITEM_FLG_DN */
	public List l_NON_NO_ITEM_FLG_DN = null;

	/** 第 9 List変数： l_h_PUCH_ODR_CD */
	public List l_h_PUCH_ODR_CD = null;

	/** 第 10 List変数： l_h_ACPT_NO */
	public List l_h_ACPT_NO = null;

	/** 第 11 List変数： l_UNIT_QTY_TYP_DN */
	public List l_UNIT_QTY_TYP_DN = null;

	/** 第 12 List変数： l_h_INSPEC_DATE */
	public List l_h_INSPEC_DATE = null;

	/** 第 13 List変数： l_l_DEFECT_CAUSE_CD_name */
	public List l_l_DEFECT_CAUSE_CD_name = null;

	/** 第 14 List変数： l_l_DEFECT_CAUSE_CD_val */
	public List l_l_DEFECT_CAUSE_CD_val = null;

	/** 第 15 List変数： l_h_INSPECTED_QTY */
	public List l_h_INSPECTED_QTY = null;

	/** 第 16 List変数： l_l_DEFECT_CAUSE_CD */
	public List l_l_DEFECT_CAUSE_CD = null;

	/** 第 17 List変数： l_l_DEFECT_INSPC_QTY */
	public List l_l_DEFECT_INSPC_QTY = null;

	/** 第 18 List変数： l_l_DEFECT_COMMENT */
	public List l_l_DEFECT_COMMENT = null;

	/** 第 19 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 20 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 21 List変数： l_ITEM_CD_M */
	public List l_ITEM_CD_M = null;

	/** 第 22 List変数： l_ITEM_NAME_M */
	public List l_ITEM_NAME_M = null;

	/** 第 23 List変数： l_PUCH_ODR_MODIFY_COUNT */
	public List l_PUCH_ODR_MODIFY_COUNT = null;

	/** 第 24 List変数： l_ACPT_MODIFY_COUNT */
	public List l_ACPT_MODIFY_COUNT = null;

	/** 第 25 List変数： l_INSPC_MODIFY_COUNT */
	public List l_INSPC_MODIFY_COUNT = null;

	/** 第 26 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 27 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 28 List変数： l_ACPT_STS_TYP */
	public List l_ACPT_STS_TYP = null;

	/** 第 29 List変数： l_INSPECTED_QTY */
	public List l_INSPECTED_QTY = null;

	/** 第 30 List変数： l_ACCEPTED_QTY */
	public List l_ACCEPTED_QTY = null;

	/** 第 31 List変数： l_DEFECTED_QTY */
	public List l_DEFECTED_QTY = null;

	/** 第 32 List変数： l_INSPEC_DATE */
	public List l_INSPEC_DATE = null;

	/** 第 33 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 34 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 35 List変数： l_INSPEC_RSLT_COMMENT */
	public List l_INSPEC_RSLT_COMMENT = null;

	/** 第 36 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 37 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 38 List変数： l_INSPC_WH_CD */
	public List l_INSPC_WH_CD = null;

	/** 第 39 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 40 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 41 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 42 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 43 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 44 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 45 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 46 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 47 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 48 List変数： l_SUM_ACPT_QTY */
	public List l_SUM_ACPT_QTY = null;

	/** 第 49 List変数： l_INSPC_CMPLT_FLG */
	public List l_INSPC_CMPLT_FLG = null;

	/** 第 50 List変数： l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** 第 51 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 52 List変数： l_CONFIRM_DLV_DATE */
	public List l_CONFIRM_DLV_DATE = null;

	/** 第 53 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 54 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 55 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 56 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 57 List変数： l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** 第 58 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 59 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 60 List変数： l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** 第 61 List変数： l_NON_NO_ITEM_FLG */
	public List l_NON_NO_ITEM_FLG = null;

	/** 第 62 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 63 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 64 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 65 List変数： l_PUCH_ODR_COMMENT */
	public List l_PUCH_ODR_COMMENT = null;

	/** 第 66 List変数： l_ACPT_DATE */
	public List l_ACPT_DATE = null;

	/** 第 67 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 68 List変数： l_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 69 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 70 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 71 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 72 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 73 List変数： l_INSPC_WH_NAME */
	public List l_INSPC_WH_NAME = null;

	/** 第 74 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 75 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getACPT_STS_TYP_DN() { return m_ACPT_STS_TYP_DN; }
	public String getc_COMPLETE() { return m_c_COMPLETE; }
	public String getACPT_INSPC_TYP_DN() { return m_ACPT_INSPC_TYP_DN; }
	public String getINSPC_CMPLT_FLG_DN() { return m_INSPC_CMPLT_FLG_DN; }
	public String getSPL_ITEM_TYP_DN() { return m_SPL_ITEM_TYP_DN; }
	public String getPRODUCT_TYP_DN() { return m_PRODUCT_TYP_DN; }
	public String getPUCH_ODR_STS_TYP_DN() { return m_PUCH_ODR_STS_TYP_DN; }
	public String getNON_NO_ITEM_FLG_DN() { return m_NON_NO_ITEM_FLG_DN; }
	public String geth_PUCH_ODR_CD() { return m_h_PUCH_ODR_CD; }
	public String geth_ACPT_NO() { return m_h_ACPT_NO; }
	public String getUNIT_QTY_TYP_DN() { return m_UNIT_QTY_TYP_DN; }
	public String geth_INSPEC_DATE() { return m_h_INSPEC_DATE; }
	public String getl_DEFECT_CAUSE_CD_name() { return m_l_DEFECT_CAUSE_CD_name; }
	public String getl_DEFECT_CAUSE_CD_val() { return m_l_DEFECT_CAUSE_CD_val; }
	public String geth_INSPECTED_QTY() { return m_h_INSPECTED_QTY; }
	public String getl_DEFECT_CAUSE_CD() { return m_l_DEFECT_CAUSE_CD; }
	public String getl_DEFECT_INSPC_QTY() { return m_l_DEFECT_INSPC_QTY; }
	public String getl_DEFECT_COMMENT() { return m_l_DEFECT_COMMENT; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getITEM_CD_M() { return m_ITEM_CD_M; }
	public String getITEM_NAME_M() { return m_ITEM_NAME_M; }
	public String getPUCH_ODR_MODIFY_COUNT() { return m_PUCH_ODR_MODIFY_COUNT; }
	public String getACPT_MODIFY_COUNT() { return m_ACPT_MODIFY_COUNT; }
	public String getINSPC_MODIFY_COUNT() { return m_INSPC_MODIFY_COUNT; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getACPT_STS_TYP() { return m_ACPT_STS_TYP; }
	public String getINSPECTED_QTY() { return m_INSPECTED_QTY; }
	public String getACCEPTED_QTY() { return m_ACCEPTED_QTY; }
	public String getDEFECTED_QTY() { return m_DEFECTED_QTY; }
	public String getINSPEC_DATE() { return m_INSPEC_DATE; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getINSPEC_RSLT_COMMENT() { return m_INSPEC_RSLT_COMMENT; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getINSPC_WH_CD() { return m_INSPC_WH_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getINSPC_CMPLT_FLG() { return m_INSPC_CMPLT_FLG; }
	public String getPUCH_ODR_SLIP_ISS_DATE() { return m_PUCH_ODR_SLIP_ISS_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getCONFIRM_DLV_DATE() { return m_CONFIRM_DLV_DATE; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String getACPT_DATE() { return m_ACPT_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getODR_CANCEL_SLIP_ISS_FLG() { return m_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getINSPC_WH_NAME() { return m_INSPC_WH_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_ACPT_STS_TYP_DN() { return l_ACPT_STS_TYP_DN; }
	public List getList_c_COMPLETE() { return l_c_COMPLETE; }
	public List getList_ACPT_INSPC_TYP_DN() { return l_ACPT_INSPC_TYP_DN; }
	public List getList_INSPC_CMPLT_FLG_DN() { return l_INSPC_CMPLT_FLG_DN; }
	public List getList_SPL_ITEM_TYP_DN() { return l_SPL_ITEM_TYP_DN; }
	public List getList_PRODUCT_TYP_DN() { return l_PRODUCT_TYP_DN; }
	public List getList_PUCH_ODR_STS_TYP_DN() { return l_PUCH_ODR_STS_TYP_DN; }
	public List getList_NON_NO_ITEM_FLG_DN() { return l_NON_NO_ITEM_FLG_DN; }
	public List getList_h_PUCH_ODR_CD() { return l_h_PUCH_ODR_CD; }
	public List getList_h_ACPT_NO() { return l_h_ACPT_NO; }
	public List getList_UNIT_QTY_TYP_DN() { return l_UNIT_QTY_TYP_DN; }
	public List getList_h_INSPEC_DATE() { return l_h_INSPEC_DATE; }
	public List getList_l_DEFECT_CAUSE_CD_name() { return l_l_DEFECT_CAUSE_CD_name; }
	public List getList_l_DEFECT_CAUSE_CD_val() { return l_l_DEFECT_CAUSE_CD_val; }
	public List getList_h_INSPECTED_QTY() { return l_h_INSPECTED_QTY; }
	public List getList_l_DEFECT_CAUSE_CD() { return l_l_DEFECT_CAUSE_CD; }
	public List getList_l_DEFECT_INSPC_QTY() { return l_l_DEFECT_INSPC_QTY; }
	public List getList_l_DEFECT_COMMENT() { return l_l_DEFECT_COMMENT; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ITEM_CD_M() { return l_ITEM_CD_M; }
	public List getList_ITEM_NAME_M() { return l_ITEM_NAME_M; }
	public List getList_PUCH_ODR_MODIFY_COUNT() { return l_PUCH_ODR_MODIFY_COUNT; }
	public List getList_ACPT_MODIFY_COUNT() { return l_ACPT_MODIFY_COUNT; }
	public List getList_INSPC_MODIFY_COUNT() { return l_INSPC_MODIFY_COUNT; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_ACPT_STS_TYP() { return l_ACPT_STS_TYP; }
	public List getList_INSPECTED_QTY() { return l_INSPECTED_QTY; }
	public List getList_ACCEPTED_QTY() { return l_ACCEPTED_QTY; }
	public List getList_DEFECTED_QTY() { return l_DEFECTED_QTY; }
	public List getList_INSPEC_DATE() { return l_INSPEC_DATE; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_INSPEC_RSLT_COMMENT() { return l_INSPEC_RSLT_COMMENT; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_INSPC_WH_CD() { return l_INSPC_WH_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_SUM_ACPT_QTY() { return l_SUM_ACPT_QTY; }
	public List getList_INSPC_CMPLT_FLG() { return l_INSPC_CMPLT_FLG; }
	public List getList_PUCH_ODR_SLIP_ISS_DATE() { return l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_CONFIRM_DLV_DATE() { return l_CONFIRM_DLV_DATE; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_NON_NO_ITEM_FLG() { return l_NON_NO_ITEM_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PUCH_ODR_COMMENT() { return l_PUCH_ODR_COMMENT; }
	public List getList_ACPT_DATE() { return l_ACPT_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ODR_CANCEL_SLIP_ISS_FLG() { return l_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_INSPC_WH_NAME() { return l_INSPC_WH_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setACPT_STS_TYP_DN(String val) { m_ACPT_STS_TYP_DN = val; }
	public void setc_COMPLETE(String val) { m_c_COMPLETE = val; }
	public void setACPT_INSPC_TYP_DN(String val) { m_ACPT_INSPC_TYP_DN = val; }
	public void setINSPC_CMPLT_FLG_DN(String val) { m_INSPC_CMPLT_FLG_DN = val; }
	public void setSPL_ITEM_TYP_DN(String val) { m_SPL_ITEM_TYP_DN = val; }
	public void setPRODUCT_TYP_DN(String val) { m_PRODUCT_TYP_DN = val; }
	public void setPUCH_ODR_STS_TYP_DN(String val) { m_PUCH_ODR_STS_TYP_DN = val; }
	public void setNON_NO_ITEM_FLG_DN(String val) { m_NON_NO_ITEM_FLG_DN = val; }
	public void seth_PUCH_ODR_CD(String val) { m_h_PUCH_ODR_CD = val; }
	public void seth_ACPT_NO(String val) { m_h_ACPT_NO = val; }
	public void setUNIT_QTY_TYP_DN(String val) { m_UNIT_QTY_TYP_DN = val; }
	public void seth_INSPEC_DATE(String val) { m_h_INSPEC_DATE = val; }
	public void setl_DEFECT_CAUSE_CD_name(String val) { m_l_DEFECT_CAUSE_CD_name = val; }
	public void setl_DEFECT_CAUSE_CD_val(String val) { m_l_DEFECT_CAUSE_CD_val = val; }
	public void seth_INSPECTED_QTY(String val) { m_h_INSPECTED_QTY = val; }
	public void setl_DEFECT_CAUSE_CD(String val) { m_l_DEFECT_CAUSE_CD = val; }
	public void setl_DEFECT_INSPC_QTY(String val) { m_l_DEFECT_INSPC_QTY = val; }
	public void setl_DEFECT_COMMENT(String val) { m_l_DEFECT_COMMENT = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setITEM_CD_M(String val) { m_ITEM_CD_M = val; }
	public void setITEM_NAME_M(String val) { m_ITEM_NAME_M = val; }
	public void setPUCH_ODR_MODIFY_COUNT(String val) { m_PUCH_ODR_MODIFY_COUNT = val; }
	public void setACPT_MODIFY_COUNT(String val) { m_ACPT_MODIFY_COUNT = val; }
	public void setINSPC_MODIFY_COUNT(String val) { m_INSPC_MODIFY_COUNT = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setACPT_STS_TYP(String val) { m_ACPT_STS_TYP = val; }
	public void setINSPECTED_QTY(String val) { m_INSPECTED_QTY = val; }
	public void setACCEPTED_QTY(String val) { m_ACCEPTED_QTY = val; }
	public void setDEFECTED_QTY(String val) { m_DEFECTED_QTY = val; }
	public void setINSPEC_DATE(String val) { m_INSPEC_DATE = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setINSPEC_RSLT_COMMENT(String val) { m_INSPEC_RSLT_COMMENT = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setINSPC_WH_CD(String val) { m_INSPC_WH_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setSUM_ACPT_QTY(String val) { m_SUM_ACPT_QTY = val; }
	public void setINSPC_CMPLT_FLG(String val) { m_INSPC_CMPLT_FLG = val; }
	public void setPUCH_ODR_SLIP_ISS_DATE(String val) { m_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setCONFIRM_DLV_DATE(String val) { m_CONFIRM_DLV_DATE = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setNON_NO_ITEM_FLG(String val) { m_NON_NO_ITEM_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPUCH_ODR_COMMENT(String val) { m_PUCH_ODR_COMMENT = val; }
	public void setACPT_DATE(String val) { m_ACPT_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setODR_CANCEL_SLIP_ISS_FLG(String val) { m_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setINSPC_WH_NAME(String val) { m_INSPC_WH_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_ACPT_STS_TYP_DN(List list) { l_ACPT_STS_TYP_DN = list; }
	public void setList_c_COMPLETE(List list) { l_c_COMPLETE = list; }
	public void setList_ACPT_INSPC_TYP_DN(List list) { l_ACPT_INSPC_TYP_DN = list; }
	public void setList_INSPC_CMPLT_FLG_DN(List list) { l_INSPC_CMPLT_FLG_DN = list; }
	public void setList_SPL_ITEM_TYP_DN(List list) { l_SPL_ITEM_TYP_DN = list; }
	public void setList_PRODUCT_TYP_DN(List list) { l_PRODUCT_TYP_DN = list; }
	public void setList_PUCH_ODR_STS_TYP_DN(List list) { l_PUCH_ODR_STS_TYP_DN = list; }
	public void setList_NON_NO_ITEM_FLG_DN(List list) { l_NON_NO_ITEM_FLG_DN = list; }
	public void setList_h_PUCH_ODR_CD(List list) { l_h_PUCH_ODR_CD = list; }
	public void setList_h_ACPT_NO(List list) { l_h_ACPT_NO = list; }
	public void setList_UNIT_QTY_TYP_DN(List list) { l_UNIT_QTY_TYP_DN = list; }
	public void setList_h_INSPEC_DATE(List list) { l_h_INSPEC_DATE = list; }
	public void setList_l_DEFECT_CAUSE_CD_name(List list) { l_l_DEFECT_CAUSE_CD_name = list; }
	public void setList_l_DEFECT_CAUSE_CD_val(List list) { l_l_DEFECT_CAUSE_CD_val = list; }
	public void setList_h_INSPECTED_QTY(List list) { l_h_INSPECTED_QTY = list; }
	public void setList_l_DEFECT_CAUSE_CD(List list) { l_l_DEFECT_CAUSE_CD = list; }
	public void setList_l_DEFECT_INSPC_QTY(List list) { l_l_DEFECT_INSPC_QTY = list; }
	public void setList_l_DEFECT_COMMENT(List list) { l_l_DEFECT_COMMENT = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ITEM_CD_M(List list) { l_ITEM_CD_M = list; }
	public void setList_ITEM_NAME_M(List list) { l_ITEM_NAME_M = list; }
	public void setList_PUCH_ODR_MODIFY_COUNT(List list) { l_PUCH_ODR_MODIFY_COUNT = list; }
	public void setList_ACPT_MODIFY_COUNT(List list) { l_ACPT_MODIFY_COUNT = list; }
	public void setList_INSPC_MODIFY_COUNT(List list) { l_INSPC_MODIFY_COUNT = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_ACPT_STS_TYP(List list) { l_ACPT_STS_TYP = list; }
	public void setList_INSPECTED_QTY(List list) { l_INSPECTED_QTY = list; }
	public void setList_ACCEPTED_QTY(List list) { l_ACCEPTED_QTY = list; }
	public void setList_DEFECTED_QTY(List list) { l_DEFECTED_QTY = list; }
	public void setList_INSPEC_DATE(List list) { l_INSPEC_DATE = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_INSPEC_RSLT_COMMENT(List list) { l_INSPEC_RSLT_COMMENT = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_INSPC_WH_CD(List list) { l_INSPC_WH_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_SUM_ACPT_QTY(List list) { l_SUM_ACPT_QTY = list; }
	public void setList_INSPC_CMPLT_FLG(List list) { l_INSPC_CMPLT_FLG = list; }
	public void setList_PUCH_ODR_SLIP_ISS_DATE(List list) { l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_CONFIRM_DLV_DATE(List list) { l_CONFIRM_DLV_DATE = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_NON_NO_ITEM_FLG(List list) { l_NON_NO_ITEM_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PUCH_ODR_COMMENT(List list) { l_PUCH_ODR_COMMENT = list; }
	public void setList_ACPT_DATE(List list) { l_ACPT_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_INSPC_WH_NAME(List list) { l_INSPC_WH_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_ACPT_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_STS_TYP_DN == null) {
			l_ACPT_STS_TYP_DN = new ArrayList();
		} else {
			l_ACPT_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_STS_TYP_DN.add(((AE0060030Struct) list.get(i)).getACPT_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_c_COMPLETE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_COMPLETE == null) {
			l_c_COMPLETE = new ArrayList();
		} else {
			l_c_COMPLETE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_COMPLETE.add(((AE0060030Struct) list.get(i)).getc_COMPLETE());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_DN == null) {
			l_ACPT_INSPC_TYP_DN = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_DN.add(((AE0060030Struct) list.get(i)).getACPT_INSPC_TYP_DN());
		}
		return size;
	}
	public int setL2L_INSPC_CMPLT_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_CMPLT_FLG_DN == null) {
			l_INSPC_CMPLT_FLG_DN = new ArrayList();
		} else {
			l_INSPC_CMPLT_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_CMPLT_FLG_DN.add(((AE0060030Struct) list.get(i)).getINSPC_CMPLT_FLG_DN());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP_DN == null) {
			l_SPL_ITEM_TYP_DN = new ArrayList();
		} else {
			l_SPL_ITEM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP_DN.add(((AE0060030Struct) list.get(i)).getSPL_ITEM_TYP_DN());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_DN == null) {
			l_PRODUCT_TYP_DN = new ArrayList();
		} else {
			l_PRODUCT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_DN.add(((AE0060030Struct) list.get(i)).getPRODUCT_TYP_DN());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP_DN == null) {
			l_PUCH_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP_DN.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_FLG_DN == null) {
			l_NON_NO_ITEM_FLG_DN = new ArrayList();
		} else {
			l_NON_NO_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_FLG_DN.add(((AE0060030Struct) list.get(i)).getNON_NO_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_h_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_CD == null) {
			l_h_PUCH_ODR_CD = new ArrayList();
		} else {
			l_h_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_CD.add(((AE0060030Struct) list.get(i)).geth_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ACPT_NO == null) {
			l_h_ACPT_NO = new ArrayList();
		} else {
			l_h_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ACPT_NO.add(((AE0060030Struct) list.get(i)).geth_ACPT_NO());
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
			l_UNIT_QTY_TYP_DN.add(((AE0060030Struct) list.get(i)).getUNIT_QTY_TYP_DN());
		}
		return size;
	}
	public int setL2L_h_INSPEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSPEC_DATE == null) {
			l_h_INSPEC_DATE = new ArrayList();
		} else {
			l_h_INSPEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSPEC_DATE.add(((AE0060030Struct) list.get(i)).geth_INSPEC_DATE());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD_name == null) {
			l_l_DEFECT_CAUSE_CD_name = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD_name.add(((AE0060030Struct) list.get(i)).getl_DEFECT_CAUSE_CD_name());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD_val == null) {
			l_l_DEFECT_CAUSE_CD_val = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD_val.add(((AE0060030Struct) list.get(i)).getl_DEFECT_CAUSE_CD_val());
		}
		return size;
	}
	public int setL2L_h_INSPECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSPECTED_QTY == null) {
			l_h_INSPECTED_QTY = new ArrayList();
		} else {
			l_h_INSPECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSPECTED_QTY.add(((AE0060030Struct) list.get(i)).geth_INSPECTED_QTY());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD == null) {
			l_l_DEFECT_CAUSE_CD = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD.add(((AE0060030Struct) list.get(i)).getl_DEFECT_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_l_DEFECT_INSPC_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_INSPC_QTY == null) {
			l_l_DEFECT_INSPC_QTY = new ArrayList();
		} else {
			l_l_DEFECT_INSPC_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_INSPC_QTY.add(((AE0060030Struct) list.get(i)).getl_DEFECT_INSPC_QTY());
		}
		return size;
	}
	public int setL2L_l_DEFECT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_COMMENT == null) {
			l_l_DEFECT_COMMENT = new ArrayList();
		} else {
			l_l_DEFECT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_COMMENT.add(((AE0060030Struct) list.get(i)).getl_DEFECT_COMMENT());
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
			l_PUCH_ODR_CD.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ACPT_NO.add(((AE0060030Struct) list.get(i)).getACPT_NO());
		}
		return size;
	}
	public int setL2L_ITEM_CD_M(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD_M == null) {
			l_ITEM_CD_M = new ArrayList();
		} else {
			l_ITEM_CD_M.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD_M.add(((AE0060030Struct) list.get(i)).getITEM_CD_M());
		}
		return size;
	}
	public int setL2L_ITEM_NAME_M(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME_M == null) {
			l_ITEM_NAME_M = new ArrayList();
		} else {
			l_ITEM_NAME_M.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME_M.add(((AE0060030Struct) list.get(i)).getITEM_NAME_M());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_MODIFY_COUNT == null) {
			l_PUCH_ODR_MODIFY_COUNT = new ArrayList();
		} else {
			l_PUCH_ODR_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_MODIFY_COUNT.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ACPT_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_MODIFY_COUNT == null) {
			l_ACPT_MODIFY_COUNT = new ArrayList();
		} else {
			l_ACPT_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_MODIFY_COUNT.add(((AE0060030Struct) list.get(i)).getACPT_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_INSPC_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_MODIFY_COUNT == null) {
			l_INSPC_MODIFY_COUNT = new ArrayList();
		} else {
			l_INSPC_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_MODIFY_COUNT.add(((AE0060030Struct) list.get(i)).getINSPC_MODIFY_COUNT());
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
			l_ACPT_QTY.add(((AE0060030Struct) list.get(i)).getACPT_QTY());
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
			l_STOCK_UNIT.add(((AE0060030Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_ACPT_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_STS_TYP == null) {
			l_ACPT_STS_TYP = new ArrayList();
		} else {
			l_ACPT_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_STS_TYP.add(((AE0060030Struct) list.get(i)).getACPT_STS_TYP());
		}
		return size;
	}
	public int setL2L_INSPECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPECTED_QTY == null) {
			l_INSPECTED_QTY = new ArrayList();
		} else {
			l_INSPECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPECTED_QTY.add(((AE0060030Struct) list.get(i)).getINSPECTED_QTY());
		}
		return size;
	}
	public int setL2L_ACCEPTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCEPTED_QTY == null) {
			l_ACCEPTED_QTY = new ArrayList();
		} else {
			l_ACCEPTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCEPTED_QTY.add(((AE0060030Struct) list.get(i)).getACCEPTED_QTY());
		}
		return size;
	}
	public int setL2L_DEFECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECTED_QTY == null) {
			l_DEFECTED_QTY = new ArrayList();
		} else {
			l_DEFECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECTED_QTY.add(((AE0060030Struct) list.get(i)).getDEFECTED_QTY());
		}
		return size;
	}
	public int setL2L_INSPEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_DATE == null) {
			l_INSPEC_DATE = new ArrayList();
		} else {
			l_INSPEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_DATE.add(((AE0060030Struct) list.get(i)).getINSPEC_DATE());
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
			l_VEND_LOT_NO.add(((AE0060030Struct) list.get(i)).getVEND_LOT_NO());
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
			l_LOT_NO.add(((AE0060030Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_INSPEC_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_RSLT_COMMENT == null) {
			l_INSPEC_RSLT_COMMENT = new ArrayList();
		} else {
			l_INSPEC_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_RSLT_COMMENT.add(((AE0060030Struct) list.get(i)).getINSPEC_RSLT_COMMENT());
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
			l_WH_CD.add(((AE0060030Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AE0060030Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_INSPC_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_WH_CD == null) {
			l_INSPC_WH_CD = new ArrayList();
		} else {
			l_INSPC_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_WH_CD.add(((AE0060030Struct) list.get(i)).getINSPC_WH_CD());
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
			l_ITEM_CD.add(((AE0060030Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0060030Struct) list.get(i)).getITEM_NAME());
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
			l_JOB_ODR_CD.add(((AE0060030Struct) list.get(i)).getJOB_ODR_CD());
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
			l_DRAW_CD.add(((AE0060030Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AE0060030Struct) list.get(i)).getSPEC());
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
			l_UNIT_QTY_TYP.add(((AE0060030Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_VEND_CD.add(((AE0060030Struct) list.get(i)).getVEND_CD());
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
			l_VEND_NAME.add(((AE0060030Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY == null) {
			l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ACPT_QTY == null) {
			l_SUM_ACPT_QTY = new ArrayList();
		} else {
			l_SUM_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ACPT_QTY.add(((AE0060030Struct) list.get(i)).getSUM_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_INSPC_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_CMPLT_FLG == null) {
			l_INSPC_CMPLT_FLG = new ArrayList();
		} else {
			l_INSPC_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_CMPLT_FLG.add(((AE0060030Struct) list.get(i)).getINSPC_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE == null) {
			l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONFIRM_DLV_DATE == null) {
			l_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONFIRM_DLV_DATE.add(((AE0060030Struct) list.get(i)).getCONFIRM_DLV_DATE());
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
			l_WORK_IN_PROC_CD.add(((AE0060030Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AE0060030Struct) list.get(i)).getPROC_NAME());
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
			l_PUCH_ODR_PERSON.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((AE0060030Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP == null) {
			l_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_STS_TYP());
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
			l_SPL_ITEM_TYP.add(((AE0060030Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_ACPT_INSPC_TYP.add(((AE0060030Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP == null) {
			l_PRODUCT_TYP = new ArrayList();
		} else {
			l_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP.add(((AE0060030Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_FLG == null) {
			l_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_FLG.add(((AE0060030Struct) list.get(i)).getNON_NO_ITEM_FLG());
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
			l_PLANT_CD.add(((AE0060030Struct) list.get(i)).getPLANT_CD());
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
			l_TAX_CD.add(((AE0060030Struct) list.get(i)).getTAX_CD());
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
			l_BUSINESS_OPR_DATE.add(((AE0060030Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_COMMENT == null) {
			l_PUCH_ODR_COMMENT = new ArrayList();
		} else {
			l_PUCH_ODR_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_COMMENT.add(((AE0060030Struct) list.get(i)).getPUCH_ODR_COMMENT());
		}
		return size;
	}
	public int setL2L_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE == null) {
			l_ACPT_DATE = new ArrayList();
		} else {
			l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE.add(((AE0060030Struct) list.get(i)).getACPT_DATE());
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
			l_EXCH_RATE.add(((AE0060030Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_FLG == null) {
			l_ODR_CANCEL_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0060030Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_FLG());
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
			l_THIS_MONTH.add(((AE0060030Struct) list.get(i)).getTHIS_MONTH());
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
			l_INSTALL_FLG.add(((AE0060030Struct) list.get(i)).getINSTALL_FLG());
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
			l_PAST_RESULT_ENTRY_TYP.add(((AE0060030Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
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
			l_PROC_EXEC_DATE.add(((AE0060030Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_INSPC_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_WH_NAME == null) {
			l_INSPC_WH_NAME = new ArrayList();
		} else {
			l_INSPC_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_WH_NAME.add(((AE0060030Struct) list.get(i)).getINSPC_WH_NAME());
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
			l_l_COUNT.add(((AE0060030Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0060030Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ACPT_STS_TYP_DN = null;
		m_c_COMPLETE = null;
		m_ACPT_INSPC_TYP_DN = null;
		m_INSPC_CMPLT_FLG_DN = null;
		m_SPL_ITEM_TYP_DN = null;
		m_PRODUCT_TYP_DN = null;
		m_PUCH_ODR_STS_TYP_DN = null;
		m_NON_NO_ITEM_FLG_DN = null;
		m_h_PUCH_ODR_CD = null;
		m_h_ACPT_NO = null;
		m_UNIT_QTY_TYP_DN = null;
		m_h_INSPEC_DATE = null;
		m_l_DEFECT_CAUSE_CD_name = null;
		m_l_DEFECT_CAUSE_CD_val = null;
		m_h_INSPECTED_QTY = null;
		m_l_DEFECT_CAUSE_CD = null;
		m_l_DEFECT_INSPC_QTY = null;
		m_l_DEFECT_COMMENT = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_ITEM_CD_M = null;
		m_ITEM_NAME_M = null;
		m_PUCH_ODR_MODIFY_COUNT = null;
		m_ACPT_MODIFY_COUNT = null;
		m_INSPC_MODIFY_COUNT = null;
		m_ACPT_QTY = null;
		m_STOCK_UNIT = null;
		m_ACPT_STS_TYP = null;
		m_INSPECTED_QTY = null;
		m_ACCEPTED_QTY = null;
		m_DEFECTED_QTY = null;
		m_INSPEC_DATE = null;
		m_VEND_LOT_NO = null;
		m_LOT_NO = null;
		m_INSPEC_RSLT_COMMENT = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_INSPC_WH_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_UNIT_QTY_TYP = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_PUCH_ODR_QTY = null;
		m_SUM_ACPT_QTY = null;
		m_INSPC_CMPLT_FLG = null;
		m_PUCH_ODR_SLIP_ISS_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_CONFIRM_DLV_DATE = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_PUCH_ODR_PERSON = null;
		m_USER_NAME = null;
		m_PUCH_ODR_STS_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_PRODUCT_TYP = null;
		m_NON_NO_ITEM_FLG = null;
		m_PLANT_CD = null;
		m_TAX_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_PUCH_ODR_COMMENT = null;
		m_ACPT_DATE = null;
		m_EXCH_RATE = null;
		m_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_THIS_MONTH = null;
		m_INSTALL_FLG = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_INSPC_WH_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_ACPT_STS_TYP_DN = null;
		l_c_COMPLETE = null;
		l_ACPT_INSPC_TYP_DN = null;
		l_INSPC_CMPLT_FLG_DN = null;
		l_SPL_ITEM_TYP_DN = null;
		l_PRODUCT_TYP_DN = null;
		l_PUCH_ODR_STS_TYP_DN = null;
		l_NON_NO_ITEM_FLG_DN = null;
		l_h_PUCH_ODR_CD = null;
		l_h_ACPT_NO = null;
		l_UNIT_QTY_TYP_DN = null;
		l_h_INSPEC_DATE = null;
		l_l_DEFECT_CAUSE_CD_name = null;
		l_l_DEFECT_CAUSE_CD_val = null;
		l_h_INSPECTED_QTY = null;
		l_l_DEFECT_CAUSE_CD = null;
		l_l_DEFECT_INSPC_QTY = null;
		l_l_DEFECT_COMMENT = null;
		l_PUCH_ODR_CD = null;
		l_ACPT_NO = null;
		l_ITEM_CD_M = null;
		l_ITEM_NAME_M = null;
		l_PUCH_ODR_MODIFY_COUNT = null;
		l_ACPT_MODIFY_COUNT = null;
		l_INSPC_MODIFY_COUNT = null;
		l_ACPT_QTY = null;
		l_STOCK_UNIT = null;
		l_ACPT_STS_TYP = null;
		l_INSPECTED_QTY = null;
		l_ACCEPTED_QTY = null;
		l_DEFECTED_QTY = null;
		l_INSPEC_DATE = null;
		l_VEND_LOT_NO = null;
		l_LOT_NO = null;
		l_INSPEC_RSLT_COMMENT = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_INSPC_WH_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_UNIT_QTY_TYP = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_PUCH_ODR_QTY = null;
		l_SUM_ACPT_QTY = null;
		l_INSPC_CMPLT_FLG = null;
		l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_CONFIRM_DLV_DATE = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_PUCH_ODR_PERSON = null;
		l_USER_NAME = null;
		l_PUCH_ODR_STS_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_PRODUCT_TYP = null;
		l_NON_NO_ITEM_FLG = null;
		l_PLANT_CD = null;
		l_TAX_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_PUCH_ODR_COMMENT = null;
		l_ACPT_DATE = null;
		l_EXCH_RATE = null;
		l_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_THIS_MONTH = null;
		l_INSTALL_FLG = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_INSPC_WH_NAME = null;
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
	 * medAE0060030クラスの標準コンストラクタ
	 */
	public AE0060030Struct()
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
	public void setStruct(AE0060030Struct struct)
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
	public void setStructM(AE0060030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setACPT_STS_TYP_DN(struct.getACPT_STS_TYP_DN());
			this.setc_COMPLETE(struct.getc_COMPLETE());
			this.setACPT_INSPC_TYP_DN(struct.getACPT_INSPC_TYP_DN());
			this.setINSPC_CMPLT_FLG_DN(struct.getINSPC_CMPLT_FLG_DN());
			this.setSPL_ITEM_TYP_DN(struct.getSPL_ITEM_TYP_DN());
			this.setPRODUCT_TYP_DN(struct.getPRODUCT_TYP_DN());
			this.setPUCH_ODR_STS_TYP_DN(struct.getPUCH_ODR_STS_TYP_DN());
			this.setNON_NO_ITEM_FLG_DN(struct.getNON_NO_ITEM_FLG_DN());
			this.seth_PUCH_ODR_CD(struct.geth_PUCH_ODR_CD());
			this.seth_ACPT_NO(struct.geth_ACPT_NO());
			this.setUNIT_QTY_TYP_DN(struct.getUNIT_QTY_TYP_DN());
			this.seth_INSPEC_DATE(struct.geth_INSPEC_DATE());
			this.setl_DEFECT_CAUSE_CD_name(struct.getl_DEFECT_CAUSE_CD_name());
			this.setl_DEFECT_CAUSE_CD_val(struct.getl_DEFECT_CAUSE_CD_val());
			this.seth_INSPECTED_QTY(struct.geth_INSPECTED_QTY());
			this.setl_DEFECT_CAUSE_CD(struct.getl_DEFECT_CAUSE_CD());
			this.setl_DEFECT_INSPC_QTY(struct.getl_DEFECT_INSPC_QTY());
			this.setl_DEFECT_COMMENT(struct.getl_DEFECT_COMMENT());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setACPT_NO(struct.getACPT_NO());
			this.setITEM_CD_M(struct.getITEM_CD_M());
			this.setITEM_NAME_M(struct.getITEM_NAME_M());
			this.setPUCH_ODR_MODIFY_COUNT(struct.getPUCH_ODR_MODIFY_COUNT());
			this.setACPT_MODIFY_COUNT(struct.getACPT_MODIFY_COUNT());
			this.setINSPC_MODIFY_COUNT(struct.getINSPC_MODIFY_COUNT());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setACPT_STS_TYP(struct.getACPT_STS_TYP());
			this.setINSPECTED_QTY(struct.getINSPECTED_QTY());
			this.setACCEPTED_QTY(struct.getACCEPTED_QTY());
			this.setDEFECTED_QTY(struct.getDEFECTED_QTY());
			this.setINSPEC_DATE(struct.getINSPEC_DATE());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setLOT_NO(struct.getLOT_NO());
			this.setINSPEC_RSLT_COMMENT(struct.getINSPEC_RSLT_COMMENT());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setINSPC_WH_CD(struct.getINSPC_WH_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setSUM_ACPT_QTY(struct.getSUM_ACPT_QTY());
			this.setINSPC_CMPLT_FLG(struct.getINSPC_CMPLT_FLG());
			this.setPUCH_ODR_SLIP_ISS_DATE(struct.getPUCH_ODR_SLIP_ISS_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setCONFIRM_DLV_DATE(struct.getCONFIRM_DLV_DATE());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setNON_NO_ITEM_FLG(struct.getNON_NO_ITEM_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setTAX_CD(struct.getTAX_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPUCH_ODR_COMMENT(struct.getPUCH_ODR_COMMENT());
			this.setACPT_DATE(struct.getACPT_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setODR_CANCEL_SLIP_ISS_FLG(struct.getODR_CANCEL_SLIP_ISS_FLG());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setINSPC_WH_NAME(struct.getINSPC_WH_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0060030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ACPT_STS_TYP_DN(struct.getList_ACPT_STS_TYP_DN());
			this.setList_c_COMPLETE(struct.getList_c_COMPLETE());
			this.setList_ACPT_INSPC_TYP_DN(struct.getList_ACPT_INSPC_TYP_DN());
			this.setList_INSPC_CMPLT_FLG_DN(struct.getList_INSPC_CMPLT_FLG_DN());
			this.setList_SPL_ITEM_TYP_DN(struct.getList_SPL_ITEM_TYP_DN());
			this.setList_PRODUCT_TYP_DN(struct.getList_PRODUCT_TYP_DN());
			this.setList_PUCH_ODR_STS_TYP_DN(struct.getList_PUCH_ODR_STS_TYP_DN());
			this.setList_NON_NO_ITEM_FLG_DN(struct.getList_NON_NO_ITEM_FLG_DN());
			this.setList_h_PUCH_ODR_CD(struct.getList_h_PUCH_ODR_CD());
			this.setList_h_ACPT_NO(struct.getList_h_ACPT_NO());
			this.setList_UNIT_QTY_TYP_DN(struct.getList_UNIT_QTY_TYP_DN());
			this.setList_h_INSPEC_DATE(struct.getList_h_INSPEC_DATE());
			this.setList_l_DEFECT_CAUSE_CD_name(struct.getList_l_DEFECT_CAUSE_CD_name());
			this.setList_l_DEFECT_CAUSE_CD_val(struct.getList_l_DEFECT_CAUSE_CD_val());
			this.setList_h_INSPECTED_QTY(struct.getList_h_INSPECTED_QTY());
			this.setList_l_DEFECT_CAUSE_CD(struct.getList_l_DEFECT_CAUSE_CD());
			this.setList_l_DEFECT_INSPC_QTY(struct.getList_l_DEFECT_INSPC_QTY());
			this.setList_l_DEFECT_COMMENT(struct.getList_l_DEFECT_COMMENT());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ITEM_CD_M(struct.getList_ITEM_CD_M());
			this.setList_ITEM_NAME_M(struct.getList_ITEM_NAME_M());
			this.setList_PUCH_ODR_MODIFY_COUNT(struct.getList_PUCH_ODR_MODIFY_COUNT());
			this.setList_ACPT_MODIFY_COUNT(struct.getList_ACPT_MODIFY_COUNT());
			this.setList_INSPC_MODIFY_COUNT(struct.getList_INSPC_MODIFY_COUNT());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_ACPT_STS_TYP(struct.getList_ACPT_STS_TYP());
			this.setList_INSPECTED_QTY(struct.getList_INSPECTED_QTY());
			this.setList_ACCEPTED_QTY(struct.getList_ACCEPTED_QTY());
			this.setList_DEFECTED_QTY(struct.getList_DEFECTED_QTY());
			this.setList_INSPEC_DATE(struct.getList_INSPEC_DATE());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_INSPEC_RSLT_COMMENT(struct.getList_INSPEC_RSLT_COMMENT());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_INSPC_WH_CD(struct.getList_INSPC_WH_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_SUM_ACPT_QTY(struct.getList_SUM_ACPT_QTY());
			this.setList_INSPC_CMPLT_FLG(struct.getList_INSPC_CMPLT_FLG());
			this.setList_PUCH_ODR_SLIP_ISS_DATE(struct.getList_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_CONFIRM_DLV_DATE(struct.getList_CONFIRM_DLV_DATE());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_NON_NO_ITEM_FLG(struct.getList_NON_NO_ITEM_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PUCH_ODR_COMMENT(struct.getList_PUCH_ODR_COMMENT());
			this.setList_ACPT_DATE(struct.getList_ACPT_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_INSPC_WH_NAME(struct.getList_INSPC_WH_NAME());
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
	// 第 1 変数初期値： i_ACPT_STS_TYP_DN


	final static String i_ACPT_STS_TYP_DN = null;

	// 第 2 変数初期値： i_c_COMPLETE


	final static String i_c_COMPLETE = null;

	// 第 3 変数初期値： i_ACPT_INSPC_TYP_DN


	final static String i_ACPT_INSPC_TYP_DN = null;

	// 第 4 変数初期値： i_INSPC_CMPLT_FLG_DN


	final static String i_INSPC_CMPLT_FLG_DN = null;

	// 第 5 変数初期値： i_SPL_ITEM_TYP_DN


	final static String i_SPL_ITEM_TYP_DN = null;

	// 第 6 変数初期値： i_PRODUCT_TYP_DN


	final static String i_PRODUCT_TYP_DN = null;

	// 第 7 変数初期値： i_PUCH_ODR_STS_TYP_DN


	final static String i_PUCH_ODR_STS_TYP_DN = null;

	// 第 8 変数初期値： i_NON_NO_ITEM_FLG_DN


	final static String i_NON_NO_ITEM_FLG_DN = null;

	// 第 9 変数初期値： i_h_PUCH_ODR_CD


	final static String i_h_PUCH_ODR_CD = null;

	// 第 10 変数初期値： i_h_ACPT_NO


	final static String i_h_ACPT_NO = null;

	// 第 11 変数初期値： i_UNIT_QTY_TYP_DN


	final static String i_UNIT_QTY_TYP_DN = null;

	// 第 12 変数初期値： i_h_INSPEC_DATE


	final static String i_h_INSPEC_DATE = null;

	// 第 13 変数初期値： i_l_DEFECT_CAUSE_CD_name


	final static String i_l_DEFECT_CAUSE_CD_name = null;

	// 第 14 変数初期値： i_l_DEFECT_CAUSE_CD_val


	final static String i_l_DEFECT_CAUSE_CD_val = null;

	// 第 15 変数初期値： i_h_INSPECTED_QTY


	final static String i_h_INSPECTED_QTY = null;

	// 第 16 変数初期値： i_l_DEFECT_CAUSE_CD


	final static String i_l_DEFECT_CAUSE_CD = null;

	// 第 17 変数初期値： i_l_DEFECT_INSPC_QTY


	final static String i_l_DEFECT_INSPC_QTY = null;

	// 第 18 変数初期値： i_l_DEFECT_COMMENT


	final static String i_l_DEFECT_COMMENT = null;

	// 第 19 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 20 変数初期値： i_ACPT_NO


	final static String i_ACPT_NO = null;

	// 第 21 変数初期値： i_ITEM_CD_M


	final static String i_ITEM_CD_M = null;

	// 第 22 変数初期値： i_ITEM_NAME_M


	final static String i_ITEM_NAME_M = null;

	// 第 23 変数初期値： i_PUCH_ODR_MODIFY_COUNT


	final static String i_PUCH_ODR_MODIFY_COUNT = null;

	// 第 24 変数初期値： i_ACPT_MODIFY_COUNT


	final static String i_ACPT_MODIFY_COUNT = null;

	// 第 25 変数初期値： i_INSPC_MODIFY_COUNT


	final static String i_INSPC_MODIFY_COUNT = null;

	// 第 26 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 27 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 28 変数初期値： i_ACPT_STS_TYP


	final static String i_ACPT_STS_TYP = null;

	// 第 29 変数初期値： i_INSPECTED_QTY


	final static String i_INSPECTED_QTY = null;

	// 第 30 変数初期値： i_ACCEPTED_QTY


	final static String i_ACCEPTED_QTY = null;

	// 第 31 変数初期値： i_DEFECTED_QTY


	final static String i_DEFECTED_QTY = null;

	// 第 32 変数初期値： i_INSPEC_DATE


	final static String i_INSPEC_DATE = null;

	// 第 33 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 34 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 35 変数初期値： i_INSPEC_RSLT_COMMENT


	final static String i_INSPEC_RSLT_COMMENT = null;

	// 第 36 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 37 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 38 変数初期値： i_INSPC_WH_CD


	final static String i_INSPC_WH_CD = null;

	// 第 39 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 40 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 41 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 42 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 43 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 44 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 45 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 46 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 47 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 48 変数初期値： i_SUM_ACPT_QTY


	final static String i_SUM_ACPT_QTY = null;

	// 第 49 変数初期値： i_INSPC_CMPLT_FLG


	final static String i_INSPC_CMPLT_FLG = null;

	// 第 50 変数初期値： i_PUCH_ODR_SLIP_ISS_DATE


	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 51 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 52 変数初期値： i_CONFIRM_DLV_DATE


	final static String i_CONFIRM_DLV_DATE = null;

	// 第 53 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 54 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 55 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 56 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 57 変数初期値： i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 58 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 59 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 60 変数初期値： i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// 第 61 変数初期値： i_NON_NO_ITEM_FLG


	final static String i_NON_NO_ITEM_FLG = null;

	// 第 62 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 63 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 65 変数初期値： i_PUCH_ODR_COMMENT


	final static String i_PUCH_ODR_COMMENT = null;

	// 第 66 変数初期値： i_ACPT_DATE


	final static String i_ACPT_DATE = null;

	// 第 67 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 68 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 69 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 70 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 71 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 72 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 73 変数初期値： i_INSPC_WH_NAME


	final static String i_INSPC_WH_NAME = null;

	// 第 74 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 75 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
	// TODO: 初期化で使う定数は、ここに記述してください。
	// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_l_DEFECT_CAUSE_CD
	final static String i_l_DEFECT_CAUSE_CD = null;
	// 第 2 変数初期値： i_l_DEFECT_INSPC_QTY
	final static String i_l_DEFECT_INSPC_QTY = null;
	// 第 3 変数初期値： i_l_DEFECT_COMMENT
	final static String i_l_DEFECT_COMMENT = null;
	// 第 4 変数初期値： i_PUCH_ODR_CD
	final static String i_PUCH_ODR_CD = null;
	// 第 5 変数初期値： i_ACPT_NO
	final static String i_ACPT_NO = null;
	// 第 6 変数初期値： i_PUCH_ODR_MODIFY_COUNT
	final static String i_PUCH_ODR_MODIFY_COUNT = null;
	// 第 7 変数初期値： i_ACPT_MODIFY_COUNT
	final static String i_ACPT_MODIFY_COUNT = null;
	// 第 8 変数初期値： i_INSPC_MODIFY_COUNT
	final static String i_INSPC_MODIFY_COUNT = null;
	// 第 9 変数初期値： i_ACPT_QTY
	final static String i_ACPT_QTY = null;
	// 第 10 変数初期値： i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// 第 11 変数初期値： i_ACPT_STS_TYP_DN
	final static String i_ACPT_STS_TYP_DN = null;
	// 第 12 変数初期値： i_ACPT_STS_TYP
	final static String i_ACPT_STS_TYP = null;
	// 第 13 変数初期値： i_INSPECTED_QTY
	final static String i_INSPECTED_QTY = null;
	// 第 14 変数初期値： i_ACCEPTED_QTY
	final static String i_ACCEPTED_QTY = null;
	// 第 15 変数初期値： i_DEFECTED_QTY
	final static String i_DEFECTED_QTY = null;
	// 第 16 変数初期値： i_INSPEC_DATE
	final static String i_INSPEC_DATE = null;
	// 第 17 変数初期値： i_VEND_LOT_NO
	final static String i_VEND_LOT_NO = null;
	// 第 18 変数初期値： i_INSPEC_RSLT_COMMENT
	final static String i_INSPEC_RSLT_COMMENT = null;
	// 第 19 変数初期値： i_WH_CD
	final static String i_WH_CD = null;
	// 第 20 変数初期値： i_WH_NAME
	final static String i_WH_NAME = null;
	// 第 21 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 22 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 23 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 24 変数初期値： i_DRAW_CD
	final static String i_DRAW_CD = null;
	// 第 25 変数初期値： i_SPEC
	final static String i_SPEC = null;
	// 第 26 変数初期値： i_UNIT_QTY_TYP_DN
	final static String i_UNIT_QTY_TYP_DN = null;
	// 第 27 変数初期値： i_UNIT_QTY_TYP
	final static String i_UNIT_QTY_TYP = null;
	// 第 28 変数初期値： i_VEND_CD
	final static String i_VEND_CD = null;
	// 第 29 変数初期値： i_VEND_NAME
	final static String i_VEND_NAME = null;
	// 第 30 変数初期値： i_PUCH_ODR_QTY
	final static String i_PUCH_ODR_QTY = null;
	// 第 31 変数初期値： i_SUM_ACPT_QTY
	final static String i_SUM_ACPT_QTY = null;
	// 第 32 変数初期値： i_INSPC_CMPLT_FLG_DN
	final static String i_INSPC_CMPLT_FLG_DN = null;
	// 第 33 変数初期値： i_INSPC_CMPLT_FLG
	final static String i_INSPC_CMPLT_FLG = null;
	// 第 34 変数初期値： i_PUCH_ODR_SLIP_ISS_DATE
	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;
	// 第 35 変数初期値： i_PUCH_ODR_DLV_DATE
	final static String i_PUCH_ODR_DLV_DATE = null;
	// 第 36 変数初期値： i_CONFIRM_DLV_DATE
	final static String i_CONFIRM_DLV_DATE = null;
	// 第 37 変数初期値： i_WORK_IN_PROC_CD
	final static String i_WORK_IN_PROC_CD = null;
	// 第 38 変数初期値： i_PROC_NAME
	final static String i_PROC_NAME = null;
	// 第 39 変数初期値： i_PUCH_ODR_PERSON
	final static String i_PUCH_ODR_PERSON = null;
	// 第 40 変数初期値： i_USER_NAME
	final static String i_USER_NAME = null;
	// 第 41 変数初期値： i_PUCH_ODR_STS_TYP_DN
	final static String i_PUCH_ODR_STS_TYP_DN = null;
	// 第 42 変数初期値： i_PUCH_ODR_STS_TYP
	final static String i_PUCH_ODR_STS_TYP = null;
	// 第 43 変数初期値： i_SPL_ITEM_TYP_DN
	final static String i_SPL_ITEM_TYP_DN = null;
	// 第 44 変数初期値： i_SPL_ITEM_TYP
	final static String i_SPL_ITEM_TYP = null;
	// 第 45 変数初期値： i_ACPT_INSPC_TYP_DN
	final static String i_ACPT_INSPC_TYP_DN = null;
	// 第 46 変数初期値： i_ACPT_INSPC_TYP
	final static String i_ACPT_INSPC_TYP = null;
	// 第 47 変数初期値： i_PRODUCT_TYP_DN
	final static String i_PRODUCT_TYP_DN = null;
	// 第 48 変数初期値： i_PRODUCT_TYP
	final static String i_PRODUCT_TYP = null;
	// 第 49 変数初期値： i_NON_NO_ITEM_FLG_DN
	final static String i_NON_NO_ITEM_FLG_DN = null;
	// 第 50 変数初期値： i_NON_NO_ITEM_FLG
	final static String i_NON_NO_ITEM_FLG = null;
	// 第 51 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 52 変数初期値： i_TAX_CD
	final static String i_TAX_CD = null;
	// 第 53 変数初期値： i_BUSINESS_OPR_DATE
	final static String i_BUSINESS_OPR_DATE = null;
	// 第 54 変数初期値： i_c_COMPLETE
	final static String i_c_COMPLETE = null;
	// 第 55 変数初期値： i_h_PUCH_ODR_CD
	final static String i_h_PUCH_ODR_CD = null;
	// 第 56 変数初期値： i_h_ACPT_NO
	final static String i_h_ACPT_NO = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize() {

		clear();

		m_l_DEFECT_CAUSE_CD = i_l_DEFECT_CAUSE_CD;
		m_l_DEFECT_INSPC_QTY = i_l_DEFECT_INSPC_QTY;
		m_l_DEFECT_COMMENT = i_l_DEFECT_COMMENT;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ACPT_NO = i_ACPT_NO;
		m_PUCH_ODR_MODIFY_COUNT = i_PUCH_ODR_MODIFY_COUNT;
		m_ACPT_MODIFY_COUNT = i_ACPT_MODIFY_COUNT;
		m_INSPC_MODIFY_COUNT = i_INSPC_MODIFY_COUNT;
		m_ACPT_QTY = i_ACPT_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_ACPT_STS_TYP_DN = i_ACPT_STS_TYP_DN;
		m_ACPT_STS_TYP = i_ACPT_STS_TYP;
		m_INSPECTED_QTY = i_INSPECTED_QTY;
		m_ACCEPTED_QTY = i_ACCEPTED_QTY;
		m_DEFECTED_QTY = i_DEFECTED_QTY;
		m_INSPEC_DATE = i_INSPEC_DATE;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_INSPEC_RSLT_COMMENT = i_INSPEC_RSLT_COMMENT;
		m_WH_CD = i_WH_CD;
		m_WH_NAME = i_WH_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_UNIT_QTY_TYP_DN = i_UNIT_QTY_TYP_DN;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_VEND_CD = i_VEND_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_SUM_ACPT_QTY = i_SUM_ACPT_QTY;
		m_INSPC_CMPLT_FLG_DN = i_INSPC_CMPLT_FLG_DN;
		m_INSPC_CMPLT_FLG = i_INSPC_CMPLT_FLG;
		m_PUCH_ODR_SLIP_ISS_DATE = i_PUCH_ODR_SLIP_ISS_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_CONFIRM_DLV_DATE = i_CONFIRM_DLV_DATE;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_USER_NAME = i_USER_NAME;
		m_PUCH_ODR_STS_TYP_DN = i_PUCH_ODR_STS_TYP_DN;
		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
		m_SPL_ITEM_TYP_DN = i_SPL_ITEM_TYP_DN;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_ACPT_INSPC_TYP_DN = i_ACPT_INSPC_TYP_DN;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_PRODUCT_TYP_DN = i_PRODUCT_TYP_DN;
		m_PRODUCT_TYP = i_PRODUCT_TYP;
		m_NON_NO_ITEM_FLG_DN = i_NON_NO_ITEM_FLG_DN;
		m_NON_NO_ITEM_FLG = i_NON_NO_ITEM_FLG;
		m_PLANT_CD = i_PLANT_CD;
		m_TAX_CD = i_TAX_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_c_COMPLETE = i_c_COMPLETE;
		m_h_PUCH_ODR_CD = i_h_PUCH_ODR_CD;
		m_h_ACPT_NO = i_h_ACPT_NO;
	}

	// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
