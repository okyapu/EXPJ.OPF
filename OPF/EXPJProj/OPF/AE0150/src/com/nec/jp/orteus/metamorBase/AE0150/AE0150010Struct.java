/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/src/com/nec/jp/orteus/metamorBase/AE0150/AE0150010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0150;

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
 * CLASS     : AE0150010Control クラス
 * ファイル・クラス説明
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.6 $ $Date: 2012/11/29 06:18:12 $
 *
 */
//}}user_implement_code_header

public class AE0150010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r_APPR_1 */
	public String m_r_APPR_1 = null;
	/** 第 2 変数： m_r_APPR_2 */
	public String m_r_APPR_2 = null;
	/** 第 3 変数： m_r_APPR_3 */
	public String m_r_APPR_3 = null;
	/** 第 4 変数： m_r_APPR_4 */
	public String m_r_APPR_4 = null;
	/** 第 5 変数： m_h_APPR_POWER_TYP */
	public String m_h_APPR_POWER_TYP = null;
	/** 第 6 変数： m_l_CRCT_TYP */
	public String m_l_CRCT_TYP = null;
	/** 第 7 変数： m_l_PRODUCT_TYP */
	public String m_l_PRODUCT_TYP = null;
	/** 第 8 変数： m_l_UNIT_COST_TYP */
	public String m_l_UNIT_COST_TYP = null;
	/** 第 9 変数： m_l_SBCNT_PUCH_TYP */
	public String m_l_SBCNT_PUCH_TYP = null;
	/** 第 10 変数： m_l_INV_CTRL_FLG */
	public String m_l_INV_CTRL_FLG = null;
	/** 第 11 変数： m_l_SLIP_TYP */
	public String m_l_SLIP_TYP = null;
	/** 第 12 変数： m_l_PUCH_RTN_FLG */
	public String m_l_PUCH_RTN_FLG = null;
	/** 第 13 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 14 変数： m_l_ROWNO */
	public String m_l_ROWNO = null;
	/** 第 15 変数： m_l_APPR_ID */
	public String m_l_APPR_ID = null;
	/** 第 16 変数： m_l_APPR_DATE */
	public String m_l_APPR_DATE = null;
	/** 第 17 変数： m_l_RESERVE_CAUSE */
	public String m_l_RESERVE_CAUSE = null;
	/** 第 18 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 19 変数： m_l_ACPT_NO */
	public String m_l_ACPT_NO = null;
	/** 第 20 変数： m_l_INSPC_ACPT_NO */
	public String m_l_INSPC_ACPT_NO = null;
	/** 第 21 変数： m_l_CRCT_TYP_CD */
	public String m_l_CRCT_TYP_CD = null;
	/** 第 22 変数： m_l_INSPC_ACPT_DATE */
	public String m_l_INSPC_ACPT_DATE = null;
	/** 第 23 変数： m_l_ACPT_DATE */
	public String m_l_ACPT_DATE = null;
	/** 第 24 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 25 変数： m_l_VEND_NAME */
	public String m_l_VEND_NAME = null;
	/** 第 26 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 27 変数： m_l_PLANT_NAME */
	public String m_l_PLANT_NAME = null;
	/** 第 28 変数： m_l_GNR_ORG_CD */
	public String m_l_GNR_ORG_CD = null;
	/** 第 29 変数： m_l_GNR_ORG_NAME */
	public String m_l_GNR_ORG_NAME = null;
	/** 第 30 変数： m_l_DLV_CD */
	public String m_l_DLV_CD = null;
	/** 第 31 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 32 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 33 変数： m_l_PRODUCT_TYP_CD */
	public String m_l_PRODUCT_TYP_CD = null;
	/** 第 34 変数： m_l_WORK_IN_PROC_CD */
	public String m_l_WORK_IN_PROC_CD = null;
	/** 第 35 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 36 変数： m_l_UNIT_COST_TYP_CD */
	public String m_l_UNIT_COST_TYP_CD = null;
	/** 第 37 変数： m_l_PROCESSING_COST */
	public String m_l_PROCESSING_COST = null;
	/** 第 38 変数： m_l_MATERIAL_COST */
	public String m_l_MATERIAL_COST = null;
	/** 第 39 変数： m_l_OTHER_OVERHEADS */
	public String m_l_OTHER_OVERHEADS = null;
	/** 第 40 変数： m_l_ACPT_QTY_2 */
	public String m_l_ACPT_QTY_2 = null;
	/** 第 41 変数： m_l_INSPC_ACPT_QTY */
	public String m_l_INSPC_ACPT_QTY = null;
	/** 第 42 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 43 変数： m_l_INSPC_ACPT_AMOUNT */
	public String m_l_INSPC_ACPT_AMOUNT = null;
	/** 第 44 変数： m_l_DISC_AMOUNT */
	public String m_l_DISC_AMOUNT = null;
	/** 第 45 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 46 変数： m_l_JOB_ODR_DETAIL_NO */
	public String m_l_JOB_ODR_DETAIL_NO = null;
	/** 第 47 変数： m_l_MANAGEMENT_CD */
	public String m_l_MANAGEMENT_CD = null;
	/** 第 48 変数： m_l_SBCNT_PUCH_TYP_CD */
	public String m_l_SBCNT_PUCH_TYP_CD = null;
	/** 第 49 変数： m_l_INV_CTRL_FLG_CD */
	public String m_l_INV_CTRL_FLG_CD = null;
	/** 第 50 変数： m_l_SLIP_TYP_CD */
	public String m_l_SLIP_TYP_CD = null;
	/** 第 51 変数： m_l_PUCH_RTN_FLG_CD */
	public String m_l_PUCH_RTN_FLG_CD = null;
	/** 第 52 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 53 変数： m_l_AI_AP_IF_FLG */
	public String m_l_AI_AP_IF_FLG = null;
	/** 第 54 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 55 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 56 変数： m_RAPPR */
	public String m_RAPPR = null;
	/** 第 57 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 58 変数： m_INSPC_DATE_FROM */
	public String m_INSPC_DATE_FROM = null;
	/** 第 59 変数： m_INSPC_DATE_TO */
	public String m_INSPC_DATE_TO = null;
	/** 第 60 変数： m_DIRECT_FLG */
	public String m_DIRECT_FLG = null;
	/** 第 61 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 62 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 63 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 64 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 65 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 66 変数： m_RESERVE_CAUSE */
	public String m_RESERVE_CAUSE = null;
	/** 第 67 変数： m_APPR_POWER_TYP */
	public String m_APPR_POWER_TYP = null;
	/** 第 68 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 69 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 70 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r_APPR_1 */
	public List l_r_APPR_1 = null;

	/** 第 2 List変数： l_r_APPR_2 */
	public List l_r_APPR_2 = null;

	/** 第 3 List変数： l_r_APPR_3 */
	public List l_r_APPR_3 = null;

	/** 第 4 List変数： l_r_APPR_4 */
	public List l_r_APPR_4 = null;

	/** 第 5 List変数： l_h_APPR_POWER_TYP */
	public List l_h_APPR_POWER_TYP = null;

	/** 第 6 List変数： l_l_CRCT_TYP */
	public List l_l_CRCT_TYP = null;

	/** 第 7 List変数： l_l_PRODUCT_TYP */
	public List l_l_PRODUCT_TYP = null;

	/** 第 8 List変数： l_l_UNIT_COST_TYP */
	public List l_l_UNIT_COST_TYP = null;

	/** 第 9 List変数： l_l_SBCNT_PUCH_TYP */
	public List l_l_SBCNT_PUCH_TYP = null;

	/** 第 10 List変数： l_l_INV_CTRL_FLG */
	public List l_l_INV_CTRL_FLG = null;

	/** 第 11 List変数： l_l_SLIP_TYP */
	public List l_l_SLIP_TYP = null;

	/** 第 12 List変数： l_l_PUCH_RTN_FLG */
	public List l_l_PUCH_RTN_FLG = null;

	/** 第 13 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 14 List変数： l_l_ROWNO */
	public List l_l_ROWNO = null;

	/** 第 15 List変数： l_l_APPR_ID */
	public List l_l_APPR_ID = null;

	/** 第 16 List変数： l_l_APPR_DATE */
	public List l_l_APPR_DATE = null;

	/** 第 17 List変数： l_l_RESERVE_CAUSE */
	public List l_l_RESERVE_CAUSE = null;

	/** 第 18 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 19 List変数： l_l_ACPT_NO */
	public List l_l_ACPT_NO = null;

	/** 第 20 List変数： l_l_INSPC_ACPT_NO */
	public List l_l_INSPC_ACPT_NO = null;

	/** 第 21 List変数： l_l_CRCT_TYP_CD */
	public List l_l_CRCT_TYP_CD = null;

	/** 第 22 List変数： l_l_INSPC_ACPT_DATE */
	public List l_l_INSPC_ACPT_DATE = null;

	/** 第 23 List変数： l_l_ACPT_DATE */
	public List l_l_ACPT_DATE = null;

	/** 第 24 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 25 List変数： l_l_VEND_NAME */
	public List l_l_VEND_NAME = null;

	/** 第 26 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 27 List変数： l_l_PLANT_NAME */
	public List l_l_PLANT_NAME = null;

	/** 第 28 List変数： l_l_GNR_ORG_CD */
	public List l_l_GNR_ORG_CD = null;

	/** 第 29 List変数： l_l_GNR_ORG_NAME */
	public List l_l_GNR_ORG_NAME = null;

	/** 第 30 List変数： l_l_DLV_CD */
	public List l_l_DLV_CD = null;

	/** 第 31 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 32 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 33 List変数： l_l_PRODUCT_TYP_CD */
	public List l_l_PRODUCT_TYP_CD = null;

	/** 第 34 List変数： l_l_WORK_IN_PROC_CD */
	public List l_l_WORK_IN_PROC_CD = null;

	/** 第 35 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 36 List変数： l_l_UNIT_COST_TYP_CD */
	public List l_l_UNIT_COST_TYP_CD = null;

	/** 第 37 List変数： l_l_PROCESSING_COST */
	public List l_l_PROCESSING_COST = null;

	/** 第 38 List変数： l_l_MATERIAL_COST */
	public List l_l_MATERIAL_COST = null;

	/** 第 39 List変数： l_l_OTHER_OVERHEADS */
	public List l_l_OTHER_OVERHEADS = null;

	/** 第 40 List変数： l_l_ACPT_QTY_2 */
	public List l_l_ACPT_QTY_2 = null;

	/** 第 41 List変数： l_l_INSPC_ACPT_QTY */
	public List l_l_INSPC_ACPT_QTY = null;

	/** 第 42 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 43 List変数： l_l_INSPC_ACPT_AMOUNT */
	public List l_l_INSPC_ACPT_AMOUNT = null;

	/** 第 44 List変数： l_l_DISC_AMOUNT */
	public List l_l_DISC_AMOUNT = null;

	/** 第 45 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 46 List変数： l_l_JOB_ODR_DETAIL_NO */
	public List l_l_JOB_ODR_DETAIL_NO = null;

	/** 第 47 List変数： l_l_MANAGEMENT_CD */
	public List l_l_MANAGEMENT_CD = null;

	/** 第 48 List変数： l_l_SBCNT_PUCH_TYP_CD */
	public List l_l_SBCNT_PUCH_TYP_CD = null;

	/** 第 49 List変数： l_l_INV_CTRL_FLG_CD */
	public List l_l_INV_CTRL_FLG_CD = null;

	/** 第 50 List変数： l_l_SLIP_TYP_CD */
	public List l_l_SLIP_TYP_CD = null;

	/** 第 51 List変数： l_l_PUCH_RTN_FLG_CD */
	public List l_l_PUCH_RTN_FLG_CD = null;

	/** 第 52 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 53 List変数： l_l_AI_AP_IF_FLG */
	public List l_l_AI_AP_IF_FLG = null;

	/** 第 54 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 55 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 56 List変数： l_RAPPR */
	public List l_RAPPR = null;

	/** 第 57 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 58 List変数： l_INSPC_DATE_FROM */
	public List l_INSPC_DATE_FROM = null;

	/** 第 59 List変数： l_INSPC_DATE_TO */
	public List l_INSPC_DATE_TO = null;

	/** 第 60 List変数： l_DIRECT_FLG */
	public List l_DIRECT_FLG = null;

	/** 第 61 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 62 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 63 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 64 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 65 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 66 List変数： l_RESERVE_CAUSE */
	public List l_RESERVE_CAUSE = null;

	/** 第 67 List変数： l_APPR_POWER_TYP */
	public List l_APPR_POWER_TYP = null;

	/** 第 68 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 69 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 70 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr_APPR_1() { return m_r_APPR_1; }
	public String getr_APPR_2() { return m_r_APPR_2; }
	public String getr_APPR_3() { return m_r_APPR_3; }
	public String getr_APPR_4() { return m_r_APPR_4; }
	public String geth_APPR_POWER_TYP() { return m_h_APPR_POWER_TYP; }
	public String getl_CRCT_TYP() { return m_l_CRCT_TYP; }
	public String getl_PRODUCT_TYP() { return m_l_PRODUCT_TYP; }
	public String getl_UNIT_COST_TYP() { return m_l_UNIT_COST_TYP; }
	public String getl_SBCNT_PUCH_TYP() { return m_l_SBCNT_PUCH_TYP; }
	public String getl_INV_CTRL_FLG() { return m_l_INV_CTRL_FLG; }
	public String getl_SLIP_TYP() { return m_l_SLIP_TYP; }
	public String getl_PUCH_RTN_FLG() { return m_l_PUCH_RTN_FLG; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getl_ROWNO() { return m_l_ROWNO; }
	public String getl_APPR_ID() { return m_l_APPR_ID; }
	public String getl_APPR_DATE() { return m_l_APPR_DATE; }
	public String getl_RESERVE_CAUSE() { return m_l_RESERVE_CAUSE; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_ACPT_NO() { return m_l_ACPT_NO; }
	public String getl_INSPC_ACPT_NO() { return m_l_INSPC_ACPT_NO; }
	public String getl_CRCT_TYP_CD() { return m_l_CRCT_TYP_CD; }
	public String getl_INSPC_ACPT_DATE() { return m_l_INSPC_ACPT_DATE; }
	public String getl_ACPT_DATE() { return m_l_ACPT_DATE; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_NAME() { return m_l_VEND_NAME; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_PLANT_NAME() { return m_l_PLANT_NAME; }
	public String getl_GNR_ORG_CD() { return m_l_GNR_ORG_CD; }
	public String getl_GNR_ORG_NAME() { return m_l_GNR_ORG_NAME; }
	public String getl_DLV_CD() { return m_l_DLV_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PRODUCT_TYP_CD() { return m_l_PRODUCT_TYP_CD; }
	public String getl_WORK_IN_PROC_CD() { return m_l_WORK_IN_PROC_CD; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_UNIT_COST_TYP_CD() { return m_l_UNIT_COST_TYP_CD; }
	public String getl_PROCESSING_COST() { return m_l_PROCESSING_COST; }
	public String getl_MATERIAL_COST() { return m_l_MATERIAL_COST; }
	public String getl_OTHER_OVERHEADS() { return m_l_OTHER_OVERHEADS; }
	public String getl_ACPT_QTY_2() { return m_l_ACPT_QTY_2; }
	public String getl_INSPC_ACPT_QTY() { return m_l_INSPC_ACPT_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_INSPC_ACPT_AMOUNT() { return m_l_INSPC_ACPT_AMOUNT; }
	public String getl_DISC_AMOUNT() { return m_l_DISC_AMOUNT; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_DETAIL_NO() { return m_l_JOB_ODR_DETAIL_NO; }
	public String getl_MANAGEMENT_CD() { return m_l_MANAGEMENT_CD; }
	public String getl_SBCNT_PUCH_TYP_CD() { return m_l_SBCNT_PUCH_TYP_CD; }
	public String getl_INV_CTRL_FLG_CD() { return m_l_INV_CTRL_FLG_CD; }
	public String getl_SLIP_TYP_CD() { return m_l_SLIP_TYP_CD; }
	public String getl_PUCH_RTN_FLG_CD() { return m_l_PUCH_RTN_FLG_CD; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_AI_AP_IF_FLG() { return m_l_AI_AP_IF_FLG; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getRAPPR() { return m_RAPPR; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getINSPC_DATE_FROM() { return m_INSPC_DATE_FROM; }
	public String getINSPC_DATE_TO() { return m_INSPC_DATE_TO; }
	public String getDIRECT_FLG() { return m_DIRECT_FLG; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getRESERVE_CAUSE() { return m_RESERVE_CAUSE; }
	public String getAPPR_POWER_TYP() { return m_APPR_POWER_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r_APPR_1() { return l_r_APPR_1; }
	public List getList_r_APPR_2() { return l_r_APPR_2; }
	public List getList_r_APPR_3() { return l_r_APPR_3; }
	public List getList_r_APPR_4() { return l_r_APPR_4; }
	public List getList_h_APPR_POWER_TYP() { return l_h_APPR_POWER_TYP; }
	public List getList_l_CRCT_TYP() { return l_l_CRCT_TYP; }
	public List getList_l_PRODUCT_TYP() { return l_l_PRODUCT_TYP; }
	public List getList_l_UNIT_COST_TYP() { return l_l_UNIT_COST_TYP; }
	public List getList_l_SBCNT_PUCH_TYP() { return l_l_SBCNT_PUCH_TYP; }
	public List getList_l_INV_CTRL_FLG() { return l_l_INV_CTRL_FLG; }
	public List getList_l_SLIP_TYP() { return l_l_SLIP_TYP; }
	public List getList_l_PUCH_RTN_FLG() { return l_l_PUCH_RTN_FLG; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_l_ROWNO() { return l_l_ROWNO; }
	public List getList_l_APPR_ID() { return l_l_APPR_ID; }
	public List getList_l_APPR_DATE() { return l_l_APPR_DATE; }
	public List getList_l_RESERVE_CAUSE() { return l_l_RESERVE_CAUSE; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_ACPT_NO() { return l_l_ACPT_NO; }
	public List getList_l_INSPC_ACPT_NO() { return l_l_INSPC_ACPT_NO; }
	public List getList_l_CRCT_TYP_CD() { return l_l_CRCT_TYP_CD; }
	public List getList_l_INSPC_ACPT_DATE() { return l_l_INSPC_ACPT_DATE; }
	public List getList_l_ACPT_DATE() { return l_l_ACPT_DATE; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_NAME() { return l_l_VEND_NAME; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_PLANT_NAME() { return l_l_PLANT_NAME; }
	public List getList_l_GNR_ORG_CD() { return l_l_GNR_ORG_CD; }
	public List getList_l_GNR_ORG_NAME() { return l_l_GNR_ORG_NAME; }
	public List getList_l_DLV_CD() { return l_l_DLV_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PRODUCT_TYP_CD() { return l_l_PRODUCT_TYP_CD; }
	public List getList_l_WORK_IN_PROC_CD() { return l_l_WORK_IN_PROC_CD; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_UNIT_COST_TYP_CD() { return l_l_UNIT_COST_TYP_CD; }
	public List getList_l_PROCESSING_COST() { return l_l_PROCESSING_COST; }
	public List getList_l_MATERIAL_COST() { return l_l_MATERIAL_COST; }
	public List getList_l_OTHER_OVERHEADS() { return l_l_OTHER_OVERHEADS; }
	public List getList_l_ACPT_QTY_2() { return l_l_ACPT_QTY_2; }
	public List getList_l_INSPC_ACPT_QTY() { return l_l_INSPC_ACPT_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_INSPC_ACPT_AMOUNT() { return l_l_INSPC_ACPT_AMOUNT; }
	public List getList_l_DISC_AMOUNT() { return l_l_DISC_AMOUNT; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_DETAIL_NO() { return l_l_JOB_ODR_DETAIL_NO; }
	public List getList_l_MANAGEMENT_CD() { return l_l_MANAGEMENT_CD; }
	public List getList_l_SBCNT_PUCH_TYP_CD() { return l_l_SBCNT_PUCH_TYP_CD; }
	public List getList_l_INV_CTRL_FLG_CD() { return l_l_INV_CTRL_FLG_CD; }
	public List getList_l_SLIP_TYP_CD() { return l_l_SLIP_TYP_CD; }
	public List getList_l_PUCH_RTN_FLG_CD() { return l_l_PUCH_RTN_FLG_CD; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_AI_AP_IF_FLG() { return l_l_AI_AP_IF_FLG; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_RAPPR() { return l_RAPPR; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_INSPC_DATE_FROM() { return l_INSPC_DATE_FROM; }
	public List getList_INSPC_DATE_TO() { return l_INSPC_DATE_TO; }
	public List getList_DIRECT_FLG() { return l_DIRECT_FLG; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_RESERVE_CAUSE() { return l_RESERVE_CAUSE; }
	public List getList_APPR_POWER_TYP() { return l_APPR_POWER_TYP; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr_APPR_1(String val) { m_r_APPR_1 = val; }
	public void setr_APPR_2(String val) { m_r_APPR_2 = val; }
	public void setr_APPR_3(String val) { m_r_APPR_3 = val; }
	public void setr_APPR_4(String val) { m_r_APPR_4 = val; }
	public void seth_APPR_POWER_TYP(String val) { m_h_APPR_POWER_TYP = val; }
	public void setl_CRCT_TYP(String val) { m_l_CRCT_TYP = val; }
	public void setl_PRODUCT_TYP(String val) { m_l_PRODUCT_TYP = val; }
	public void setl_UNIT_COST_TYP(String val) { m_l_UNIT_COST_TYP = val; }
	public void setl_SBCNT_PUCH_TYP(String val) { m_l_SBCNT_PUCH_TYP = val; }
	public void setl_INV_CTRL_FLG(String val) { m_l_INV_CTRL_FLG = val; }
	public void setl_SLIP_TYP(String val) { m_l_SLIP_TYP = val; }
	public void setl_PUCH_RTN_FLG(String val) { m_l_PUCH_RTN_FLG = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setl_ROWNO(String val) { m_l_ROWNO = val; }
	public void setl_APPR_ID(String val) { m_l_APPR_ID = val; }
	public void setl_APPR_DATE(String val) { m_l_APPR_DATE = val; }
	public void setl_RESERVE_CAUSE(String val) { m_l_RESERVE_CAUSE = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_ACPT_NO(String val) { m_l_ACPT_NO = val; }
	public void setl_INSPC_ACPT_NO(String val) { m_l_INSPC_ACPT_NO = val; }
	public void setl_CRCT_TYP_CD(String val) { m_l_CRCT_TYP_CD = val; }
	public void setl_INSPC_ACPT_DATE(String val) { m_l_INSPC_ACPT_DATE = val; }
	public void setl_ACPT_DATE(String val) { m_l_ACPT_DATE = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_NAME(String val) { m_l_VEND_NAME = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_PLANT_NAME(String val) { m_l_PLANT_NAME = val; }
	public void setl_GNR_ORG_CD(String val) { m_l_GNR_ORG_CD = val; }
	public void setl_GNR_ORG_NAME(String val) { m_l_GNR_ORG_NAME = val; }
	public void setl_DLV_CD(String val) { m_l_DLV_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PRODUCT_TYP_CD(String val) { m_l_PRODUCT_TYP_CD = val; }
	public void setl_WORK_IN_PROC_CD(String val) { m_l_WORK_IN_PROC_CD = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_UNIT_COST_TYP_CD(String val) { m_l_UNIT_COST_TYP_CD = val; }
	public void setl_PROCESSING_COST(String val) { m_l_PROCESSING_COST = val; }
	public void setl_MATERIAL_COST(String val) { m_l_MATERIAL_COST = val; }
	public void setl_OTHER_OVERHEADS(String val) { m_l_OTHER_OVERHEADS = val; }
	public void setl_ACPT_QTY_2(String val) { m_l_ACPT_QTY_2 = val; }
	public void setl_INSPC_ACPT_QTY(String val) { m_l_INSPC_ACPT_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_INSPC_ACPT_AMOUNT(String val) { m_l_INSPC_ACPT_AMOUNT = val; }
	public void setl_DISC_AMOUNT(String val) { m_l_DISC_AMOUNT = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_DETAIL_NO(String val) { m_l_JOB_ODR_DETAIL_NO = val; }
	public void setl_MANAGEMENT_CD(String val) { m_l_MANAGEMENT_CD = val; }
	public void setl_SBCNT_PUCH_TYP_CD(String val) { m_l_SBCNT_PUCH_TYP_CD = val; }
	public void setl_INV_CTRL_FLG_CD(String val) { m_l_INV_CTRL_FLG_CD = val; }
	public void setl_SLIP_TYP_CD(String val) { m_l_SLIP_TYP_CD = val; }
	public void setl_PUCH_RTN_FLG_CD(String val) { m_l_PUCH_RTN_FLG_CD = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_AI_AP_IF_FLG(String val) { m_l_AI_AP_IF_FLG = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setRAPPR(String val) { m_RAPPR = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setINSPC_DATE_FROM(String val) { m_INSPC_DATE_FROM = val; }
	public void setINSPC_DATE_TO(String val) { m_INSPC_DATE_TO = val; }
	public void setDIRECT_FLG(String val) { m_DIRECT_FLG = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setRESERVE_CAUSE(String val) { m_RESERVE_CAUSE = val; }
	public void setAPPR_POWER_TYP(String val) { m_APPR_POWER_TYP = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_r_APPR_1(List list) { l_r_APPR_1 = list; }
	public void setList_r_APPR_2(List list) { l_r_APPR_2 = list; }
	public void setList_r_APPR_3(List list) { l_r_APPR_3 = list; }
	public void setList_r_APPR_4(List list) { l_r_APPR_4 = list; }
	public void setList_h_APPR_POWER_TYP(List list) { l_h_APPR_POWER_TYP = list; }
	public void setList_l_CRCT_TYP(List list) { l_l_CRCT_TYP = list; }
	public void setList_l_PRODUCT_TYP(List list) { l_l_PRODUCT_TYP = list; }
	public void setList_l_UNIT_COST_TYP(List list) { l_l_UNIT_COST_TYP = list; }
	public void setList_l_SBCNT_PUCH_TYP(List list) { l_l_SBCNT_PUCH_TYP = list; }
	public void setList_l_INV_CTRL_FLG(List list) { l_l_INV_CTRL_FLG = list; }
	public void setList_l_SLIP_TYP(List list) { l_l_SLIP_TYP = list; }
	public void setList_l_PUCH_RTN_FLG(List list) { l_l_PUCH_RTN_FLG = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_l_ROWNO(List list) { l_l_ROWNO = list; }
	public void setList_l_APPR_ID(List list) { l_l_APPR_ID = list; }
	public void setList_l_APPR_DATE(List list) { l_l_APPR_DATE = list; }
	public void setList_l_RESERVE_CAUSE(List list) { l_l_RESERVE_CAUSE = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_ACPT_NO(List list) { l_l_ACPT_NO = list; }
	public void setList_l_INSPC_ACPT_NO(List list) { l_l_INSPC_ACPT_NO = list; }
	public void setList_l_CRCT_TYP_CD(List list) { l_l_CRCT_TYP_CD = list; }
	public void setList_l_INSPC_ACPT_DATE(List list) { l_l_INSPC_ACPT_DATE = list; }
	public void setList_l_ACPT_DATE(List list) { l_l_ACPT_DATE = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_NAME(List list) { l_l_VEND_NAME = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_PLANT_NAME(List list) { l_l_PLANT_NAME = list; }
	public void setList_l_GNR_ORG_CD(List list) { l_l_GNR_ORG_CD = list; }
	public void setList_l_GNR_ORG_NAME(List list) { l_l_GNR_ORG_NAME = list; }
	public void setList_l_DLV_CD(List list) { l_l_DLV_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PRODUCT_TYP_CD(List list) { l_l_PRODUCT_TYP_CD = list; }
	public void setList_l_WORK_IN_PROC_CD(List list) { l_l_WORK_IN_PROC_CD = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_UNIT_COST_TYP_CD(List list) { l_l_UNIT_COST_TYP_CD = list; }
	public void setList_l_PROCESSING_COST(List list) { l_l_PROCESSING_COST = list; }
	public void setList_l_MATERIAL_COST(List list) { l_l_MATERIAL_COST = list; }
	public void setList_l_OTHER_OVERHEADS(List list) { l_l_OTHER_OVERHEADS = list; }
	public void setList_l_ACPT_QTY_2(List list) { l_l_ACPT_QTY_2 = list; }
	public void setList_l_INSPC_ACPT_QTY(List list) { l_l_INSPC_ACPT_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_INSPC_ACPT_AMOUNT(List list) { l_l_INSPC_ACPT_AMOUNT = list; }
	public void setList_l_DISC_AMOUNT(List list) { l_l_DISC_AMOUNT = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_DETAIL_NO(List list) { l_l_JOB_ODR_DETAIL_NO = list; }
	public void setList_l_MANAGEMENT_CD(List list) { l_l_MANAGEMENT_CD = list; }
	public void setList_l_SBCNT_PUCH_TYP_CD(List list) { l_l_SBCNT_PUCH_TYP_CD = list; }
	public void setList_l_INV_CTRL_FLG_CD(List list) { l_l_INV_CTRL_FLG_CD = list; }
	public void setList_l_SLIP_TYP_CD(List list) { l_l_SLIP_TYP_CD = list; }
	public void setList_l_PUCH_RTN_FLG_CD(List list) { l_l_PUCH_RTN_FLG_CD = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_AI_AP_IF_FLG(List list) { l_l_AI_AP_IF_FLG = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_RAPPR(List list) { l_RAPPR = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_INSPC_DATE_FROM(List list) { l_INSPC_DATE_FROM = list; }
	public void setList_INSPC_DATE_TO(List list) { l_INSPC_DATE_TO = list; }
	public void setList_DIRECT_FLG(List list) { l_DIRECT_FLG = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_RESERVE_CAUSE(List list) { l_RESERVE_CAUSE = list; }
	public void setList_APPR_POWER_TYP(List list) { l_APPR_POWER_TYP = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_r_APPR_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_1 == null) {
			l_r_APPR_1 = new ArrayList();
		} else {
			l_r_APPR_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_1.add(((AE0150010Struct) list.get(i)).getr_APPR_1());
		}
		return size;
	}
	public int setL2L_r_APPR_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_2 == null) {
			l_r_APPR_2 = new ArrayList();
		} else {
			l_r_APPR_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_2.add(((AE0150010Struct) list.get(i)).getr_APPR_2());
		}
		return size;
	}
	public int setL2L_r_APPR_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_3 == null) {
			l_r_APPR_3 = new ArrayList();
		} else {
			l_r_APPR_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_3.add(((AE0150010Struct) list.get(i)).getr_APPR_3());
		}
		return size;
	}
	public int setL2L_r_APPR_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_4 == null) {
			l_r_APPR_4 = new ArrayList();
		} else {
			l_r_APPR_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_4.add(((AE0150010Struct) list.get(i)).getr_APPR_4());
		}
		return size;
	}
	public int setL2L_h_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_POWER_TYP == null) {
			l_h_APPR_POWER_TYP = new ArrayList();
		} else {
			l_h_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_POWER_TYP.add(((AE0150010Struct) list.get(i)).geth_APPR_POWER_TYP());
		}
		return size;
	}
	public int setL2L_l_CRCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CRCT_TYP == null) {
			l_l_CRCT_TYP = new ArrayList();
		} else {
			l_l_CRCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CRCT_TYP.add(((AE0150010Struct) list.get(i)).getl_CRCT_TYP());
		}
		return size;
	}
	public int setL2L_l_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRODUCT_TYP == null) {
			l_l_PRODUCT_TYP = new ArrayList();
		} else {
			l_l_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRODUCT_TYP.add(((AE0150010Struct) list.get(i)).getl_PRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP == null) {
			l_l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP.add(((AE0150010Struct) list.get(i)).getl_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_l_SBCNT_PUCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SBCNT_PUCH_TYP == null) {
			l_l_SBCNT_PUCH_TYP = new ArrayList();
		} else {
			l_l_SBCNT_PUCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SBCNT_PUCH_TYP.add(((AE0150010Struct) list.get(i)).getl_SBCNT_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_l_INV_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_CTRL_FLG == null) {
			l_l_INV_CTRL_FLG = new ArrayList();
		} else {
			l_l_INV_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_CTRL_FLG.add(((AE0150010Struct) list.get(i)).getl_INV_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_l_SLIP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SLIP_TYP == null) {
			l_l_SLIP_TYP = new ArrayList();
		} else {
			l_l_SLIP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SLIP_TYP.add(((AE0150010Struct) list.get(i)).getl_SLIP_TYP());
		}
		return size;
	}
	public int setL2L_l_PUCH_RTN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_RTN_FLG == null) {
			l_l_PUCH_RTN_FLG = new ArrayList();
		} else {
			l_l_PUCH_RTN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_RTN_FLG.add(((AE0150010Struct) list.get(i)).getl_PUCH_RTN_FLG());
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
			l_INSTALL_FLG.add(((AE0150010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_l_ROWNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ROWNO == null) {
			l_l_ROWNO = new ArrayList();
		} else {
			l_l_ROWNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ROWNO.add(((AE0150010Struct) list.get(i)).getl_ROWNO());
		}
		return size;
	}
	public int setL2L_l_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_ID == null) {
			l_l_APPR_ID = new ArrayList();
		} else {
			l_l_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_ID.add(((AE0150010Struct) list.get(i)).getl_APPR_ID());
		}
		return size;
	}
	public int setL2L_l_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_DATE == null) {
			l_l_APPR_DATE = new ArrayList();
		} else {
			l_l_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_DATE.add(((AE0150010Struct) list.get(i)).getl_APPR_DATE());
		}
		return size;
	}
	public int setL2L_l_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RESERVE_CAUSE == null) {
			l_l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RESERVE_CAUSE.add(((AE0150010Struct) list.get(i)).getl_RESERVE_CAUSE());
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
			l_l_PUCH_ODR_CD.add(((AE0150010Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_NO == null) {
			l_l_ACPT_NO = new ArrayList();
		} else {
			l_l_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_NO.add(((AE0150010Struct) list.get(i)).getl_ACPT_NO());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_NO == null) {
			l_l_INSPC_ACPT_NO = new ArrayList();
		} else {
			l_l_INSPC_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_NO.add(((AE0150010Struct) list.get(i)).getl_INSPC_ACPT_NO());
		}
		return size;
	}
	public int setL2L_l_CRCT_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CRCT_TYP_CD == null) {
			l_l_CRCT_TYP_CD = new ArrayList();
		} else {
			l_l_CRCT_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CRCT_TYP_CD.add(((AE0150010Struct) list.get(i)).getl_CRCT_TYP_CD());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_DATE == null) {
			l_l_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_l_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_DATE.add(((AE0150010Struct) list.get(i)).getl_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_DATE == null) {
			l_l_ACPT_DATE = new ArrayList();
		} else {
			l_l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_DATE.add(((AE0150010Struct) list.get(i)).getl_ACPT_DATE());
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
			l_l_VEND_CD.add(((AE0150010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_NAME == null) {
			l_l_VEND_NAME = new ArrayList();
		} else {
			l_l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_NAME.add(((AE0150010Struct) list.get(i)).getl_VEND_NAME());
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
			l_l_PLANT_CD.add(((AE0150010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_NAME == null) {
			l_l_PLANT_NAME = new ArrayList();
		} else {
			l_l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_NAME.add(((AE0150010Struct) list.get(i)).getl_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_l_GNR_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_GNR_ORG_CD == null) {
			l_l_GNR_ORG_CD = new ArrayList();
		} else {
			l_l_GNR_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_GNR_ORG_CD.add(((AE0150010Struct) list.get(i)).getl_GNR_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_GNR_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_GNR_ORG_NAME == null) {
			l_l_GNR_ORG_NAME = new ArrayList();
		} else {
			l_l_GNR_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_GNR_ORG_NAME.add(((AE0150010Struct) list.get(i)).getl_GNR_ORG_NAME());
		}
		return size;
	}
	public int setL2L_l_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_CD == null) {
			l_l_DLV_CD = new ArrayList();
		} else {
			l_l_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_CD.add(((AE0150010Struct) list.get(i)).getl_DLV_CD());
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
			l_l_ITEM_CD.add(((AE0150010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0150010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PRODUCT_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRODUCT_TYP_CD == null) {
			l_l_PRODUCT_TYP_CD = new ArrayList();
		} else {
			l_l_PRODUCT_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRODUCT_TYP_CD.add(((AE0150010Struct) list.get(i)).getl_PRODUCT_TYP_CD());
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
			l_l_WORK_IN_PROC_CD.add(((AE0150010Struct) list.get(i)).getl_WORK_IN_PROC_CD());
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
			l_l_UNIT_COST.add(((AE0150010Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP_CD == null) {
			l_l_UNIT_COST_TYP_CD = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP_CD.add(((AE0150010Struct) list.get(i)).getl_UNIT_COST_TYP_CD());
		}
		return size;
	}
	public int setL2L_l_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROCESSING_COST == null) {
			l_l_PROCESSING_COST = new ArrayList();
		} else {
			l_l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROCESSING_COST.add(((AE0150010Struct) list.get(i)).getl_PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_l_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MATERIAL_COST == null) {
			l_l_MATERIAL_COST = new ArrayList();
		} else {
			l_l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MATERIAL_COST.add(((AE0150010Struct) list.get(i)).getl_MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_l_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OTHER_OVERHEADS == null) {
			l_l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OTHER_OVERHEADS.add(((AE0150010Struct) list.get(i)).getl_OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_l_ACPT_QTY_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_QTY_2 == null) {
			l_l_ACPT_QTY_2 = new ArrayList();
		} else {
			l_l_ACPT_QTY_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_QTY_2.add(((AE0150010Struct) list.get(i)).getl_ACPT_QTY_2());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_QTY == null) {
			l_l_INSPC_ACPT_QTY = new ArrayList();
		} else {
			l_l_INSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_QTY.add(((AE0150010Struct) list.get(i)).getl_INSPC_ACPT_QTY());
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
			l_l_STOCK_UNIT.add(((AE0150010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_AMOUNT == null) {
			l_l_INSPC_ACPT_AMOUNT = new ArrayList();
		} else {
			l_l_INSPC_ACPT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_AMOUNT.add(((AE0150010Struct) list.get(i)).getl_INSPC_ACPT_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISC_AMOUNT == null) {
			l_l_DISC_AMOUNT = new ArrayList();
		} else {
			l_l_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISC_AMOUNT.add(((AE0150010Struct) list.get(i)).getl_DISC_AMOUNT());
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
			l_l_JOB_ODR_CD.add(((AE0150010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_JOB_ODR_DETAIL_NO.add(((AE0150010Struct) list.get(i)).getl_JOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_l_MANAGEMENT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MANAGEMENT_CD == null) {
			l_l_MANAGEMENT_CD = new ArrayList();
		} else {
			l_l_MANAGEMENT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MANAGEMENT_CD.add(((AE0150010Struct) list.get(i)).getl_MANAGEMENT_CD());
		}
		return size;
	}
	public int setL2L_l_SBCNT_PUCH_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SBCNT_PUCH_TYP_CD == null) {
			l_l_SBCNT_PUCH_TYP_CD = new ArrayList();
		} else {
			l_l_SBCNT_PUCH_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SBCNT_PUCH_TYP_CD.add(((AE0150010Struct) list.get(i)).getl_SBCNT_PUCH_TYP_CD());
		}
		return size;
	}
	public int setL2L_l_INV_CTRL_FLG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_CTRL_FLG_CD == null) {
			l_l_INV_CTRL_FLG_CD = new ArrayList();
		} else {
			l_l_INV_CTRL_FLG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_CTRL_FLG_CD.add(((AE0150010Struct) list.get(i)).getl_INV_CTRL_FLG_CD());
		}
		return size;
	}
	public int setL2L_l_SLIP_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SLIP_TYP_CD == null) {
			l_l_SLIP_TYP_CD = new ArrayList();
		} else {
			l_l_SLIP_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SLIP_TYP_CD.add(((AE0150010Struct) list.get(i)).getl_SLIP_TYP_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_RTN_FLG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_RTN_FLG_CD == null) {
			l_l_PUCH_RTN_FLG_CD = new ArrayList();
		} else {
			l_l_PUCH_RTN_FLG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_RTN_FLG_CD.add(((AE0150010Struct) list.get(i)).getl_PUCH_RTN_FLG_CD());
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
			l_l_MODIFY_COUNT.add(((AE0150010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_AI_AP_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AI_AP_IF_FLG == null) {
			l_l_AI_AP_IF_FLG = new ArrayList();
		} else {
			l_l_AI_AP_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AI_AP_IF_FLG.add(((AE0150010Struct) list.get(i)).getl_AI_AP_IF_FLG());
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
			l_COMPANY_CD.add(((AE0150010Struct) list.get(i)).getCOMPANY_CD());
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
			l_PLANT_CD.add(((AE0150010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_RAPPR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RAPPR == null) {
			l_RAPPR = new ArrayList();
		} else {
			l_RAPPR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RAPPR.add(((AE0150010Struct) list.get(i)).getRAPPR());
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
			l_VEND_CD.add(((AE0150010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_INSPC_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_DATE_FROM == null) {
			l_INSPC_DATE_FROM = new ArrayList();
		} else {
			l_INSPC_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_DATE_FROM.add(((AE0150010Struct) list.get(i)).getINSPC_DATE_FROM());
		}
		return size;
	}
	public int setL2L_INSPC_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_DATE_TO == null) {
			l_INSPC_DATE_TO = new ArrayList();
		} else {
			l_INSPC_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_DATE_TO.add(((AE0150010Struct) list.get(i)).getINSPC_DATE_TO());
		}
		return size;
	}
	public int setL2L_DIRECT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIRECT_FLG == null) {
			l_DIRECT_FLG = new ArrayList();
		} else {
			l_DIRECT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIRECT_FLG.add(((AE0150010Struct) list.get(i)).getDIRECT_FLG());
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
			l_VEND_NAME.add(((AE0150010Struct) list.get(i)).getVEND_NAME());
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
			l_MODIFY_COUNT.add(((AE0150010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_FLG == null) {
			l_APPR_FLG = new ArrayList();
		} else {
			l_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_FLG.add(((AE0150010Struct) list.get(i)).getAPPR_FLG());
		}
		return size;
	}
	public int setL2L_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_ID == null) {
			l_APPR_ID = new ArrayList();
		} else {
			l_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_ID.add(((AE0150010Struct) list.get(i)).getAPPR_ID());
		}
		return size;
	}
	public int setL2L_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_DATE == null) {
			l_APPR_DATE = new ArrayList();
		} else {
			l_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_DATE.add(((AE0150010Struct) list.get(i)).getAPPR_DATE());
		}
		return size;
	}
	public int setL2L_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESERVE_CAUSE == null) {
			l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESERVE_CAUSE.add(((AE0150010Struct) list.get(i)).getRESERVE_CAUSE());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP == null) {
			l_APPR_POWER_TYP = new ArrayList();
		} else {
			l_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP.add(((AE0150010Struct) list.get(i)).getAPPR_POWER_TYP());
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
			l_USER_CD.add(((AE0150010Struct) list.get(i)).getUSER_CD());
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
			l_l_COUNT.add(((AE0150010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0150010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r_APPR_1 = null;
		m_r_APPR_2 = null;
		m_r_APPR_3 = null;
		m_r_APPR_4 = null;
		m_h_APPR_POWER_TYP = null;
		m_l_CRCT_TYP = null;
		m_l_PRODUCT_TYP = null;
		m_l_UNIT_COST_TYP = null;
		m_l_SBCNT_PUCH_TYP = null;
		m_l_INV_CTRL_FLG = null;
		m_l_SLIP_TYP = null;
		m_l_PUCH_RTN_FLG = null;
		m_INSTALL_FLG = null;
		m_l_ROWNO = null;
		m_l_APPR_ID = null;
		m_l_APPR_DATE = null;
		m_l_RESERVE_CAUSE = null;
		m_l_PUCH_ODR_CD = null;
		m_l_ACPT_NO = null;
		m_l_INSPC_ACPT_NO = null;
		m_l_CRCT_TYP_CD = null;
		m_l_INSPC_ACPT_DATE = null;
		m_l_ACPT_DATE = null;
		m_l_VEND_CD = null;
		m_l_VEND_NAME = null;
		m_l_PLANT_CD = null;
		m_l_PLANT_NAME = null;
		m_l_GNR_ORG_CD = null;
		m_l_GNR_ORG_NAME = null;
		m_l_DLV_CD = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PRODUCT_TYP_CD = null;
		m_l_WORK_IN_PROC_CD = null;
		m_l_UNIT_COST = null;
		m_l_UNIT_COST_TYP_CD = null;
		m_l_PROCESSING_COST = null;
		m_l_MATERIAL_COST = null;
		m_l_OTHER_OVERHEADS = null;
		m_l_ACPT_QTY_2 = null;
		m_l_INSPC_ACPT_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_INSPC_ACPT_AMOUNT = null;
		m_l_DISC_AMOUNT = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_DETAIL_NO = null;
		m_l_MANAGEMENT_CD = null;
		m_l_SBCNT_PUCH_TYP_CD = null;
		m_l_INV_CTRL_FLG_CD = null;
		m_l_SLIP_TYP_CD = null;
		m_l_PUCH_RTN_FLG_CD = null;
		m_l_MODIFY_COUNT = null;
		m_l_AI_AP_IF_FLG = null;
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_RAPPR = null;
		m_VEND_CD = null;
		m_INSPC_DATE_FROM = null;
		m_INSPC_DATE_TO = null;
		m_DIRECT_FLG = null;
		m_VEND_NAME = null;
		m_MODIFY_COUNT = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_RESERVE_CAUSE = null;
		m_APPR_POWER_TYP = null;
		m_USER_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r_APPR_1 = null;
		l_r_APPR_2 = null;
		l_r_APPR_3 = null;
		l_r_APPR_4 = null;
		l_h_APPR_POWER_TYP = null;
		l_l_CRCT_TYP = null;
		l_l_PRODUCT_TYP = null;
		l_l_UNIT_COST_TYP = null;
		l_l_SBCNT_PUCH_TYP = null;
		l_l_INV_CTRL_FLG = null;
		l_l_SLIP_TYP = null;
		l_l_PUCH_RTN_FLG = null;
		l_INSTALL_FLG = null;
		l_l_ROWNO = null;
		l_l_APPR_ID = null;
		l_l_APPR_DATE = null;
		l_l_RESERVE_CAUSE = null;
		l_l_PUCH_ODR_CD = null;
		l_l_ACPT_NO = null;
		l_l_INSPC_ACPT_NO = null;
		l_l_CRCT_TYP_CD = null;
		l_l_INSPC_ACPT_DATE = null;
		l_l_ACPT_DATE = null;
		l_l_VEND_CD = null;
		l_l_VEND_NAME = null;
		l_l_PLANT_CD = null;
		l_l_PLANT_NAME = null;
		l_l_GNR_ORG_CD = null;
		l_l_GNR_ORG_NAME = null;
		l_l_DLV_CD = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PRODUCT_TYP_CD = null;
		l_l_WORK_IN_PROC_CD = null;
		l_l_UNIT_COST = null;
		l_l_UNIT_COST_TYP_CD = null;
		l_l_PROCESSING_COST = null;
		l_l_MATERIAL_COST = null;
		l_l_OTHER_OVERHEADS = null;
		l_l_ACPT_QTY_2 = null;
		l_l_INSPC_ACPT_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_INSPC_ACPT_AMOUNT = null;
		l_l_DISC_AMOUNT = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_DETAIL_NO = null;
		l_l_MANAGEMENT_CD = null;
		l_l_SBCNT_PUCH_TYP_CD = null;
		l_l_INV_CTRL_FLG_CD = null;
		l_l_SLIP_TYP_CD = null;
		l_l_PUCH_RTN_FLG_CD = null;
		l_l_MODIFY_COUNT = null;
		l_l_AI_AP_IF_FLG = null;
		l_COMPANY_CD = null;
		l_PLANT_CD = null;
		l_RAPPR = null;
		l_VEND_CD = null;
		l_INSPC_DATE_FROM = null;
		l_INSPC_DATE_TO = null;
		l_DIRECT_FLG = null;
		l_VEND_NAME = null;
		l_MODIFY_COUNT = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_RESERVE_CAUSE = null;
		l_APPR_POWER_TYP = null;
		l_USER_CD = null;
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
	 * medAE0150010クラスの標準コンストラクタ
	 */
	public AE0150010Struct()
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
	public void setStruct(AE0150010Struct struct)
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
	public void setStructM(AE0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr_APPR_1(struct.getr_APPR_1());
			this.setr_APPR_2(struct.getr_APPR_2());
			this.setr_APPR_3(struct.getr_APPR_3());
			this.setr_APPR_4(struct.getr_APPR_4());
			this.seth_APPR_POWER_TYP(struct.geth_APPR_POWER_TYP());
			this.setl_CRCT_TYP(struct.getl_CRCT_TYP());
			this.setl_PRODUCT_TYP(struct.getl_PRODUCT_TYP());
			this.setl_UNIT_COST_TYP(struct.getl_UNIT_COST_TYP());
			this.setl_SBCNT_PUCH_TYP(struct.getl_SBCNT_PUCH_TYP());
			this.setl_INV_CTRL_FLG(struct.getl_INV_CTRL_FLG());
			this.setl_SLIP_TYP(struct.getl_SLIP_TYP());
			this.setl_PUCH_RTN_FLG(struct.getl_PUCH_RTN_FLG());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setl_ROWNO(struct.getl_ROWNO());
			this.setl_APPR_ID(struct.getl_APPR_ID());
			this.setl_APPR_DATE(struct.getl_APPR_DATE());
			this.setl_RESERVE_CAUSE(struct.getl_RESERVE_CAUSE());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_ACPT_NO(struct.getl_ACPT_NO());
			this.setl_INSPC_ACPT_NO(struct.getl_INSPC_ACPT_NO());
			this.setl_CRCT_TYP_CD(struct.getl_CRCT_TYP_CD());
			this.setl_INSPC_ACPT_DATE(struct.getl_INSPC_ACPT_DATE());
			this.setl_ACPT_DATE(struct.getl_ACPT_DATE());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_NAME(struct.getl_VEND_NAME());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_PLANT_NAME(struct.getl_PLANT_NAME());
			this.setl_GNR_ORG_CD(struct.getl_GNR_ORG_CD());
			this.setl_GNR_ORG_NAME(struct.getl_GNR_ORG_NAME());
			this.setl_DLV_CD(struct.getl_DLV_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PRODUCT_TYP_CD(struct.getl_PRODUCT_TYP_CD());
			this.setl_WORK_IN_PROC_CD(struct.getl_WORK_IN_PROC_CD());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_UNIT_COST_TYP_CD(struct.getl_UNIT_COST_TYP_CD());
			this.setl_PROCESSING_COST(struct.getl_PROCESSING_COST());
			this.setl_MATERIAL_COST(struct.getl_MATERIAL_COST());
			this.setl_OTHER_OVERHEADS(struct.getl_OTHER_OVERHEADS());
			this.setl_ACPT_QTY_2(struct.getl_ACPT_QTY_2());
			this.setl_INSPC_ACPT_QTY(struct.getl_INSPC_ACPT_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_INSPC_ACPT_AMOUNT(struct.getl_INSPC_ACPT_AMOUNT());
			this.setl_DISC_AMOUNT(struct.getl_DISC_AMOUNT());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
			this.setl_MANAGEMENT_CD(struct.getl_MANAGEMENT_CD());
			this.setl_SBCNT_PUCH_TYP_CD(struct.getl_SBCNT_PUCH_TYP_CD());
			this.setl_INV_CTRL_FLG_CD(struct.getl_INV_CTRL_FLG_CD());
			this.setl_SLIP_TYP_CD(struct.getl_SLIP_TYP_CD());
			this.setl_PUCH_RTN_FLG_CD(struct.getl_PUCH_RTN_FLG_CD());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_AI_AP_IF_FLG(struct.getl_AI_AP_IF_FLG());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setRAPPR(struct.getRAPPR());
			this.setVEND_CD(struct.getVEND_CD());
			this.setINSPC_DATE_FROM(struct.getINSPC_DATE_FROM());
			this.setINSPC_DATE_TO(struct.getINSPC_DATE_TO());
			this.setDIRECT_FLG(struct.getDIRECT_FLG());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
			this.setAPPR_POWER_TYP(struct.getAPPR_POWER_TYP());
			this.setUSER_CD(struct.getUSER_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r_APPR_1(struct.getList_r_APPR_1());
			this.setList_r_APPR_2(struct.getList_r_APPR_2());
			this.setList_r_APPR_3(struct.getList_r_APPR_3());
			this.setList_r_APPR_4(struct.getList_r_APPR_4());
			this.setList_h_APPR_POWER_TYP(struct.getList_h_APPR_POWER_TYP());
			this.setList_l_CRCT_TYP(struct.getList_l_CRCT_TYP());
			this.setList_l_PRODUCT_TYP(struct.getList_l_PRODUCT_TYP());
			this.setList_l_UNIT_COST_TYP(struct.getList_l_UNIT_COST_TYP());
			this.setList_l_SBCNT_PUCH_TYP(struct.getList_l_SBCNT_PUCH_TYP());
			this.setList_l_INV_CTRL_FLG(struct.getList_l_INV_CTRL_FLG());
			this.setList_l_SLIP_TYP(struct.getList_l_SLIP_TYP());
			this.setList_l_PUCH_RTN_FLG(struct.getList_l_PUCH_RTN_FLG());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_l_ROWNO(struct.getList_l_ROWNO());
			this.setList_l_APPR_ID(struct.getList_l_APPR_ID());
			this.setList_l_APPR_DATE(struct.getList_l_APPR_DATE());
			this.setList_l_RESERVE_CAUSE(struct.getList_l_RESERVE_CAUSE());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_ACPT_NO(struct.getList_l_ACPT_NO());
			this.setList_l_INSPC_ACPT_NO(struct.getList_l_INSPC_ACPT_NO());
			this.setList_l_CRCT_TYP_CD(struct.getList_l_CRCT_TYP_CD());
			this.setList_l_INSPC_ACPT_DATE(struct.getList_l_INSPC_ACPT_DATE());
			this.setList_l_ACPT_DATE(struct.getList_l_ACPT_DATE());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_NAME(struct.getList_l_VEND_NAME());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_PLANT_NAME(struct.getList_l_PLANT_NAME());
			this.setList_l_GNR_ORG_CD(struct.getList_l_GNR_ORG_CD());
			this.setList_l_GNR_ORG_NAME(struct.getList_l_GNR_ORG_NAME());
			this.setList_l_DLV_CD(struct.getList_l_DLV_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PRODUCT_TYP_CD(struct.getList_l_PRODUCT_TYP_CD());
			this.setList_l_WORK_IN_PROC_CD(struct.getList_l_WORK_IN_PROC_CD());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_UNIT_COST_TYP_CD(struct.getList_l_UNIT_COST_TYP_CD());
			this.setList_l_PROCESSING_COST(struct.getList_l_PROCESSING_COST());
			this.setList_l_MATERIAL_COST(struct.getList_l_MATERIAL_COST());
			this.setList_l_OTHER_OVERHEADS(struct.getList_l_OTHER_OVERHEADS());
			this.setList_l_ACPT_QTY_2(struct.getList_l_ACPT_QTY_2());
			this.setList_l_INSPC_ACPT_QTY(struct.getList_l_INSPC_ACPT_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_INSPC_ACPT_AMOUNT(struct.getList_l_INSPC_ACPT_AMOUNT());
			this.setList_l_DISC_AMOUNT(struct.getList_l_DISC_AMOUNT());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_DETAIL_NO(struct.getList_l_JOB_ODR_DETAIL_NO());
			this.setList_l_MANAGEMENT_CD(struct.getList_l_MANAGEMENT_CD());
			this.setList_l_SBCNT_PUCH_TYP_CD(struct.getList_l_SBCNT_PUCH_TYP_CD());
			this.setList_l_INV_CTRL_FLG_CD(struct.getList_l_INV_CTRL_FLG_CD());
			this.setList_l_SLIP_TYP_CD(struct.getList_l_SLIP_TYP_CD());
			this.setList_l_PUCH_RTN_FLG_CD(struct.getList_l_PUCH_RTN_FLG_CD());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_AI_AP_IF_FLG(struct.getList_l_AI_AP_IF_FLG());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_RAPPR(struct.getList_RAPPR());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_INSPC_DATE_FROM(struct.getList_INSPC_DATE_FROM());
			this.setList_INSPC_DATE_TO(struct.getList_INSPC_DATE_TO());
			this.setList_DIRECT_FLG(struct.getList_DIRECT_FLG());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_RESERVE_CAUSE(struct.getList_RESERVE_CAUSE());
			this.setList_APPR_POWER_TYP(struct.getList_APPR_POWER_TYP());
			this.setList_USER_CD(struct.getList_USER_CD());
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
	// 第 1 変数初期値： i_r_APPR_1


	final static String i_r_APPR_1 = null;

	// 第 2 変数初期値： i_r_APPR_2


	final static String i_r_APPR_2 = null;

	// 第 3 変数初期値： i_r_APPR_3


	final static String i_r_APPR_3 = null;

	// 第 4 変数初期値： i_r_APPR_4


	final static String i_r_APPR_4 = null;

	// 第 5 変数初期値： i_h_APPR_POWER_TYP


	final static String i_h_APPR_POWER_TYP = null;

	// 第 6 変数初期値： i_l_CRCT_TYP


	final static String i_l_CRCT_TYP = null;

	// 第 7 変数初期値： i_l_PRODUCT_TYP


	final static String i_l_PRODUCT_TYP = null;

	// 第 8 変数初期値： i_l_UNIT_COST_TYP


	final static String i_l_UNIT_COST_TYP = null;

	// 第 9 変数初期値： i_l_SBCNT_PUCH_TYP


	final static String i_l_SBCNT_PUCH_TYP = null;

	// 第 10 変数初期値： i_l_INV_CTRL_FLG


	final static String i_l_INV_CTRL_FLG = null;

	// 第 11 変数初期値： i_l_SLIP_TYP


	final static String i_l_SLIP_TYP = null;

	// 第 12 変数初期値： i_l_PUCH_RTN_FLG


	final static String i_l_PUCH_RTN_FLG = null;

	// 第 13 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 14 変数初期値： i_l_ROWNO


	final static String i_l_ROWNO = null;

	// 第 15 変数初期値： i_l_APPR_ID


	final static String i_l_APPR_ID = null;

	// 第 16 変数初期値： i_l_APPR_DATE


	final static String i_l_APPR_DATE = null;

	// 第 17 変数初期値： i_l_RESERVE_CAUSE


	final static String i_l_RESERVE_CAUSE = null;

	// 第 18 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 19 変数初期値： i_l_ACPT_NO


	final static String i_l_ACPT_NO = null;

	// 第 20 変数初期値： i_l_INSPC_ACPT_NO


	final static String i_l_INSPC_ACPT_NO = null;

	// 第 21 変数初期値： i_l_CRCT_TYP_CD


	final static String i_l_CRCT_TYP_CD = null;

	// 第 22 変数初期値： i_l_INSPC_ACPT_DATE


	final static String i_l_INSPC_ACPT_DATE = null;

	// 第 23 変数初期値： i_l_ACPT_DATE


	final static String i_l_ACPT_DATE = null;

	// 第 24 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 25 変数初期値： i_l_VEND_NAME


	final static String i_l_VEND_NAME = null;

	// 第 26 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 27 変数初期値： i_l_PLANT_NAME


	final static String i_l_PLANT_NAME = null;

	// 第 28 変数初期値： i_l_GNR_ORG_CD


	final static String i_l_GNR_ORG_CD = null;

	// 第 29 変数初期値： i_l_GNR_ORG_NAME


	final static String i_l_GNR_ORG_NAME = null;

	// 第 30 変数初期値： i_l_DLV_CD


	final static String i_l_DLV_CD = null;

	// 第 31 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 32 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 33 変数初期値： i_l_PRODUCT_TYP_CD


	final static String i_l_PRODUCT_TYP_CD = null;

	// 第 34 変数初期値： i_l_WORK_IN_PROC_CD


	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 35 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 36 変数初期値： i_l_UNIT_COST_TYP_CD


	final static String i_l_UNIT_COST_TYP_CD = null;

	// 第 37 変数初期値： i_l_PROCESSING_COST


	final static String i_l_PROCESSING_COST = null;

	// 第 38 変数初期値： i_l_MATERIAL_COST


	final static String i_l_MATERIAL_COST = null;

	// 第 39 変数初期値： i_l_OTHER_OVERHEADS


	final static String i_l_OTHER_OVERHEADS = null;

	// 第 40 変数初期値： i_l_ACPT_QTY_2


	final static String i_l_ACPT_QTY_2 = null;

	// 第 41 変数初期値： i_l_INSPC_ACPT_QTY


	final static String i_l_INSPC_ACPT_QTY = null;

	// 第 42 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 43 変数初期値： i_l_INSPC_ACPT_AMOUNT


	final static String i_l_INSPC_ACPT_AMOUNT = null;

	// 第 44 変数初期値： i_l_DISC_AMOUNT


	final static String i_l_DISC_AMOUNT = null;

	// 第 45 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 46 変数初期値： i_l_JOB_ODR_DETAIL_NO


	final static String i_l_JOB_ODR_DETAIL_NO = null;

	// 第 47 変数初期値： i_l_MANAGEMENT_CD


	final static String i_l_MANAGEMENT_CD = null;

	// 第 48 変数初期値： i_l_SBCNT_PUCH_TYP_CD


	final static String i_l_SBCNT_PUCH_TYP_CD = null;

	// 第 49 変数初期値： i_l_INV_CTRL_FLG_CD


	final static String i_l_INV_CTRL_FLG_CD = null;

	// 第 50 変数初期値： i_l_SLIP_TYP_CD


	final static String i_l_SLIP_TYP_CD = null;

	// 第 51 変数初期値： i_l_PUCH_RTN_FLG_CD


	final static String i_l_PUCH_RTN_FLG_CD = null;

	// 第 52 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 53 変数初期値： i_l_AI_AP_IF_FLG


	final static String i_l_AI_AP_IF_FLG = null;

	// 第 54 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 55 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 56 変数初期値： i_RAPPR


	final static String i_RAPPR = null;

	// 第 57 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 58 変数初期値： i_INSPC_DATE_FROM


	final static String i_INSPC_DATE_FROM = null;

	// 第 59 変数初期値： i_INSPC_DATE_TO


	final static String i_INSPC_DATE_TO = null;

	// 第 60 変数初期値： i_DIRECT_FLG


	final static String i_DIRECT_FLG = null;

	// 第 61 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 62 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 63 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 64 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 65 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 66 変数初期値： i_RESERVE_CAUSE


	final static String i_RESERVE_CAUSE = null;

	// 第 67 変数初期値： i_APPR_POWER_TYP


	final static String i_APPR_POWER_TYP = null;

	// 第 68 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 69 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 70 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r_APPR_1

	final static String i_r_APPR_1 = null;

	// 第 2 変数初期値： i_r_APPR_2

	final static String i_r_APPR_2 = null;

	// 第 3 変数初期値： i_r_APPR_3

	final static String i_r_APPR_3 = null;

	// 第 4 変数初期値： i_r_APPR_4

	final static String i_r_APPR_4 = null;

	// 第 5 変数初期値： i_INSPC_DATE_FROM

	final static String i_INSPC_DATE_FROM = null;

	// 第 6 変数初期値： i_INSPC_DATE_TO

	final static String i_INSPC_DATE_TO = null;

	// 第 7 変数初期値： i_RESERVE_CAUSE

	final static String i_RESERVE_CAUSE = null;

	// 第 8 変数初期値： i_l_UNIT_COST_TYP_NAME

	final static String i_l_UNIT_COST_TYP_NAME = null;

	// 第 9 変数初期値： i_l_SBCNT_PUCH_TYP_NAME

	final static String i_l_SBCNT_PUCH_TYP_NAME = null;

	// 第 10 変数初期値： i_l_INV_CTRL_FLG_NAME

	final static String i_l_INV_CTRL_FLG_NAME = null;

	// 第 11 変数初期値： i_l_SLIP_TYP_NAME

	final static String i_l_SLIP_TYP_NAME = null;

	// 第 12 変数初期値： i_l_PUCH_RTN_FLG_NAME

	final static String i_l_PUCH_RTN_FLG_NAME = null;

	// 第 13 変数初期値： i_OPTION_ID

	final static String i_OPTION_ID = null;

	// 第 14 変数初期値： i_l_APPR_ID

	final static String i_l_APPR_ID = null;

	// 第 15 変数初期値： i_l_APPR_DATE

	final static String i_l_APPR_DATE = null;

	// 第 16 変数初期値： i_l_RESERVE_CAUSE

	final static String i_l_RESERVE_CAUSE = null;

	// 第 17 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 18 変数初期値： i_l_ACPT_NO

	final static String i_l_ACPT_NO = null;

	// 第 19 変数初期値： i_l_INSPC_ACPT_NO

	final static String i_l_INSPC_ACPT_NO = null;

	// 第 20 変数初期値： i_l_CRCT_TYP

	final static String i_l_CRCT_TYP = null;

	// 第 21 変数初期値： i_l_INSPC_ACPT_DATE

	final static String i_l_INSPC_ACPT_DATE = null;

	// 第 22 変数初期値： i_l_ACPT_DATE

	final static String i_l_ACPT_DATE = null;

	// 第 23 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 24 変数初期値： i_l_VEND_NAME

	final static String i_l_VEND_NAME = null;

	// 第 25 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 26 変数初期値： i_l_PLANT_NAME

	final static String i_l_PLANT_NAME = null;

	// 第 27 変数初期値： i_l_GNR_ORG_CD

	final static String i_l_GNR_ORG_CD = null;

	// 第 28 変数初期値： i_l_GNR_ORG_NAME

	final static String i_l_GNR_ORG_NAME = null;

	// 第 29 変数初期値： i_l_DLV_CD

	final static String i_l_DLV_CD = null;

	// 第 30 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 31 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 32 変数初期値： i_l_PRODUCT_TYP

	final static String i_l_PRODUCT_TYP = null;

	// 第 33 変数初期値： i_l_WORK_IN_PROC_CD

	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 34 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 35 変数初期値： i_l_UNIT_COST_TYP

	final static String i_l_UNIT_COST_TYP = null;

	// 第 36 変数初期値： i_l_PROCESSING_COST

	final static String i_l_PROCESSING_COST = null;

	// 第 37 変数初期値： i_l_MATERIAL_COST

	final static String i_l_MATERIAL_COST = null;

	// 第 38 変数初期値： i_l_OTHER_OVERHEADS

	final static String i_l_OTHER_OVERHEADS = null;

	// 第 39 変数初期値： i_l_ACPT_QTY_2

	final static String i_l_ACPT_QTY_2 = null;

	// 第 40 変数初期値： i_l_INSPC_ACPT_QTY

	final static String i_l_INSPC_ACPT_QTY = null;

	// 第 41 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 42 変数初期値： i_l_INSPC_ACPT_AMOUNT

	final static String i_l_INSPC_ACPT_AMOUNT = null;

	// 第 43 変数初期値： i_l_DISC_AMOUNT

	final static String i_l_DISC_AMOUNT = null;

	// 第 44 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 45 変数初期値： i_l_JOB_ODR_DETAIL_NO

	final static String i_l_JOB_ODR_DETAIL_NO = null;

	// 第 46 変数初期値： i_l_MANAGEMENT_CD

	final static String i_l_MANAGEMENT_CD = null;

	// 第 47 変数初期値： i_l_SBCNT_PUCH_TYP

	final static String i_l_SBCNT_PUCH_TYP = null;

	// 第 48 変数初期値： i_l_INV_CTRL_FLG

	final static String i_l_INV_CTRL_FLG = null;

	// 第 49 変数初期値： i_l_SLIP_TYP

	final static String i_l_SLIP_TYP = null;

	// 第 50 変数初期値： i_l_PUCH_RTN_FLG

	final static String i_l_PUCH_RTN_FLG = null;

	// 第 51 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 52 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 53 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 54 変数初期値： i_RAPPR

	final static String i_RAPPR = null;

	// 第 55 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 56 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 57 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 58 変数初期値： i_APPR_FLG

	final static String i_APPR_FLG = null;

	// 第 59 変数初期値： i_APPR_ID

	final static String i_APPR_ID = null;

	// 第 60 変数初期値： i_APPR_DATE

	final static String i_APPR_DATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r_APPR_1 = i_r_APPR_1;
		m_r_APPR_2 = i_r_APPR_2;
		m_r_APPR_3 = i_r_APPR_3;
		m_r_APPR_4 = i_r_APPR_4;
		m_INSPC_DATE_FROM = i_INSPC_DATE_FROM;
		m_INSPC_DATE_TO = i_INSPC_DATE_TO;
		m_RESERVE_CAUSE = i_RESERVE_CAUSE;


		m_l_APPR_ID = i_l_APPR_ID;
		m_l_APPR_DATE = i_l_APPR_DATE;
		m_l_RESERVE_CAUSE = i_l_RESERVE_CAUSE;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_ACPT_NO = i_l_ACPT_NO;
		m_l_INSPC_ACPT_NO = i_l_INSPC_ACPT_NO;
		m_l_CRCT_TYP = i_l_CRCT_TYP;
		m_l_INSPC_ACPT_DATE = i_l_INSPC_ACPT_DATE;
		m_l_ACPT_DATE = i_l_ACPT_DATE;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_NAME = i_l_VEND_NAME;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_PLANT_NAME = i_l_PLANT_NAME;
		m_l_GNR_ORG_CD = i_l_GNR_ORG_CD;
		m_l_GNR_ORG_NAME = i_l_GNR_ORG_NAME;
		m_l_DLV_CD = i_l_DLV_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_PRODUCT_TYP = i_l_PRODUCT_TYP;
		m_l_WORK_IN_PROC_CD = i_l_WORK_IN_PROC_CD;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_UNIT_COST_TYP = i_l_UNIT_COST_TYP;
		m_l_PROCESSING_COST = i_l_PROCESSING_COST;
		m_l_MATERIAL_COST = i_l_MATERIAL_COST;
		m_l_OTHER_OVERHEADS = i_l_OTHER_OVERHEADS;
		m_l_ACPT_QTY_2 = i_l_ACPT_QTY_2;
		m_l_INSPC_ACPT_QTY = i_l_INSPC_ACPT_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_INSPC_ACPT_AMOUNT = i_l_INSPC_ACPT_AMOUNT;
		m_l_DISC_AMOUNT = i_l_DISC_AMOUNT;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_JOB_ODR_DETAIL_NO = i_l_JOB_ODR_DETAIL_NO;
		m_l_MANAGEMENT_CD = i_l_MANAGEMENT_CD;
		m_l_SBCNT_PUCH_TYP = i_l_SBCNT_PUCH_TYP;
		m_l_INV_CTRL_FLG = i_l_INV_CTRL_FLG;
		m_l_SLIP_TYP = i_l_SLIP_TYP;
		m_l_PUCH_RTN_FLG = i_l_PUCH_RTN_FLG;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_COMPANY_CD = i_COMPANY_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_RAPPR = i_RAPPR;
		m_VEND_NAME = i_VEND_NAME;
		m_VEND_CD = i_VEND_CD;
		m_APPR_FLG = i_APPR_FLG;
		m_APPR_ID = i_APPR_ID;
		m_APPR_DATE = i_APPR_DATE;
	}


	/**	
	 * 引数の情報の保持するリストの変数から指定の順のデータを取得	
	 * @param in リスト保持の情報	
	 * @param index 順番	
	 */	
	public void importData(AE0150010Struct in, int index)	
	{	
		clear();	
		if(in.l_l_ROWNO != null && in.l_l_ROWNO.size() > index)  m_l_ROWNO = (String)(in.l_l_ROWNO.get(index));	
		if(in.l_l_PUCH_ODR_CD != null && in.l_l_PUCH_ODR_CD.size() > index)  m_l_PUCH_ODR_CD = (String)(in.l_l_PUCH_ODR_CD.get(index));
		if(in.l_l_ACPT_NO != null && in.l_l_ACPT_NO.size() > index)  m_l_ACPT_NO = (String)(in.l_l_ACPT_NO.get(index));
		if(in.l_l_INSPC_ACPT_NO != null && in.l_l_INSPC_ACPT_NO.size() > index)  m_l_INSPC_ACPT_NO = (String)(in.l_l_INSPC_ACPT_NO.get(index));
		if(in.l_l_MODIFY_COUNT != null && in.l_l_MODIFY_COUNT.size() > index)  m_l_MODIFY_COUNT = (String)(in.l_l_MODIFY_COUNT.get(index));
		return;
	}	
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
