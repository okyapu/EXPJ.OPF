/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030040Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

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
 * CLASS     : AD0030040Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.21 $ $Date: 2016/05/23 08:12:42 $
 *
 */
//}}user_implement_code_header

public class AD0030040Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r1_MODE */
	public String m_r1_MODE = null;
	/** 第 2 変数： m_c_RE_PRINT */
	public String m_c_RE_PRINT = null;
	/** 第 3 変数： m_r2_MODE */
	public String m_r2_MODE = null;
	/** 第 4 変数： m_PRINT_PATTERN */
	public String m_PRINT_PATTERN = null;
	/** 第 5 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 6 変数： m_l_OPR_INST_SLIP_ISS_FLG_DN */
	public String m_l_OPR_INST_SLIP_ISS_FLG_DN = null;
	/** 第 7 変数： m_DATE */
	public String m_DATE = null;
	/** 第 8 変数： m_TIME */
	public String m_TIME = null;
	/** 第 9 変数： m_PAGE */
	public String m_PAGE = null;
	/** 第 10 変数： m_TOTAL_PAGE */
	public String m_TOTAL_PAGE = null;
	/** 第 11 変数： m_BARCODE1 */
	public String m_BARCODE1 = null;
	/** 第 12 変数： m_OPR_INST_START_TIME */
	public String m_OPR_INST_START_TIME = null;
	/** 第 13 変数： m_WORK_ODR_DLV_TIME */
	public String m_WORK_ODR_DLV_TIME = null;
	/** 第 14 変数： m_c_CARD_PRINT */
	public String m_c_CARD_PRINT = null;
	/** 第 15 変数： m_INST_PRINTED */
	public String m_INST_PRINTED = null;
	/** 第 16 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 17 変数： m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** 第 18 変数： m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** 第 19 変数： m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** 第 20 変数： m_l_WORK_IN_PROC_CD */
	public String m_l_WORK_IN_PROC_CD = null;
	/** 第 21 変数： m_l_PROC_NAME */
	public String m_l_PROC_NAME = null;
	/** 第 22 変数： m_l_PROC_NO */
	public String m_l_PROC_NO = null;
	/** 第 23 変数： m_l_OPR_INST_CD */
	public String m_l_OPR_INST_CD = null;
	/** 第 24 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 25 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 26 変数： m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** 第 27 変数： m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** 第 28 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 29 変数： m_l_OPR_INST_START_DATE */
	public String m_l_OPR_INST_START_DATE = null;
	/** 第 30 変数： m_l_WORK_ODR_DLV_DATE */
	public String m_l_WORK_ODR_DLV_DATE = null;
	/** 第 31 変数： m_l_OPR_INST_QTY */
	public String m_l_OPR_INST_QTY = null;
	/** 第 32 変数： m_l_WORK_IN_PROC_COMMENT */
	public String m_l_WORK_IN_PROC_COMMENT = null;
	/** 第 33 変数： m_l_OPR_INST_SLIP_ISS_DATE */
	public String m_l_OPR_INST_SLIP_ISS_DATE = null;
	/** 第 34 変数： m_l_OPR_INST_SLIP_ISS_FLG */
	public String m_l_OPR_INST_SLIP_ISS_FLG = null;
	/** 第 35 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 36 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 37 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 38 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 39 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 40 変数： m_l_CARD_PRINTED_FLG */
	public String m_l_CARD_PRINTED_FLG = null;
	/** 第 41 変数： m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** 第 42 変数： m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** 第 43 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 44 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 45 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 46 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 47 変数： m_OPR_INST_SLIP_ISS_FLG */
	public String m_OPR_INST_SLIP_ISS_FLG = null;
	/** 第 48 変数： m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** 第 49 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 50 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 51 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 52 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 53 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 54 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 55 変数： m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** 第 56 変数： m_IDENT_CARD_QTY */
	public String m_IDENT_CARD_QTY = null;
	/** 第 57 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 58 変数： m_PKG_UNIT_QTY */
	public String m_PKG_UNIT_QTY = null;
	/** 第 59 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 60 変数： m_IDENT_CARD_CTL_NO */
	public String m_IDENT_CARD_CTL_NO = null;
	/** 第 61 変数： m_FIRST_IDENT_CARD_QTY */
	public String m_FIRST_IDENT_CARD_QTY = null;
	/** 第 62 変数： m_PRINT_QTY */
	public String m_PRINT_QTY = null;
	/** 第 63 変数： m_IDENT_CARD */
	public String m_IDENT_CARD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r1_MODE */
	public List l_r1_MODE = null;

	/** 第 2 List変数： l_c_RE_PRINT */
	public List l_c_RE_PRINT = null;

	/** 第 3 List変数： l_r2_MODE */
	public List l_r2_MODE = null;

	/** 第 4 List変数： l_PRINT_PATTERN */
	public List l_PRINT_PATTERN = null;

	/** 第 5 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 6 List変数： l_l_OPR_INST_SLIP_ISS_FLG_DN */
	public List l_l_OPR_INST_SLIP_ISS_FLG_DN = null;

	/** 第 7 List変数： l_DATE */
	public List l_DATE = null;

	/** 第 8 List変数： l_TIME */
	public List l_TIME = null;

	/** 第 9 List変数： l_PAGE */
	public List l_PAGE = null;

	/** 第 10 List変数： l_TOTAL_PAGE */
	public List l_TOTAL_PAGE = null;

	/** 第 11 List変数： l_BARCODE1 */
	public List l_BARCODE1 = null;

	/** 第 12 List変数： l_OPR_INST_START_TIME */
	public List l_OPR_INST_START_TIME = null;

	/** 第 13 List変数： l_WORK_ODR_DLV_TIME */
	public List l_WORK_ODR_DLV_TIME = null;

	/** 第 14 List変数： l_c_CARD_PRINT */
	public List l_c_CARD_PRINT = null;

	/** 第 15 List変数： l_INST_PRINTED */
	public List l_INST_PRINTED = null;

	/** 第 16 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 17 List変数： l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** 第 18 List変数： l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** 第 19 List変数： l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** 第 20 List変数： l_l_WORK_IN_PROC_CD */
	public List l_l_WORK_IN_PROC_CD = null;

	/** 第 21 List変数： l_l_PROC_NAME */
	public List l_l_PROC_NAME = null;

	/** 第 22 List変数： l_l_PROC_NO */
	public List l_l_PROC_NO = null;

	/** 第 23 List変数： l_l_OPR_INST_CD */
	public List l_l_OPR_INST_CD = null;

	/** 第 24 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 25 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 26 List変数： l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** 第 27 List変数： l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** 第 28 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 29 List変数： l_l_OPR_INST_START_DATE */
	public List l_l_OPR_INST_START_DATE = null;

	/** 第 30 List変数： l_l_WORK_ODR_DLV_DATE */
	public List l_l_WORK_ODR_DLV_DATE = null;

	/** 第 31 List変数： l_l_OPR_INST_QTY */
	public List l_l_OPR_INST_QTY = null;

	/** 第 32 List変数： l_l_WORK_IN_PROC_COMMENT */
	public List l_l_WORK_IN_PROC_COMMENT = null;

	/** 第 33 List変数： l_l_OPR_INST_SLIP_ISS_DATE */
	public List l_l_OPR_INST_SLIP_ISS_DATE = null;

	/** 第 34 List変数： l_l_OPR_INST_SLIP_ISS_FLG */
	public List l_l_OPR_INST_SLIP_ISS_FLG = null;

	/** 第 35 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 36 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 37 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 38 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 39 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 40 List変数： l_l_CARD_PRINTED_FLG */
	public List l_l_CARD_PRINTED_FLG = null;

	/** 第 41 List変数： l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** 第 42 List変数： l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** 第 43 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 44 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 45 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 46 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 47 List変数： l_OPR_INST_SLIP_ISS_FLG */
	public List l_OPR_INST_SLIP_ISS_FLG = null;

	/** 第 48 List変数： l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** 第 49 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 50 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 51 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 52 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 53 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 54 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 55 List変数： l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** 第 56 List変数： l_IDENT_CARD_QTY */
	public List l_IDENT_CARD_QTY = null;

	/** 第 57 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 58 List変数： l_PKG_UNIT_QTY */
	public List l_PKG_UNIT_QTY = null;

	/** 第 59 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 60 List変数： l_IDENT_CARD_CTL_NO */
	public List l_IDENT_CARD_CTL_NO = null;

	/** 第 61 List変数： l_FIRST_IDENT_CARD_QTY */
	public List l_FIRST_IDENT_CARD_QTY = null;

	/** 第 62 List変数： l_PRINT_QTY */
	public List l_PRINT_QTY = null;

	/** 第 63 List変数： l_IDENT_CARD */
	public List l_IDENT_CARD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr1_MODE() { return m_r1_MODE; }
	public String getc_RE_PRINT() { return m_c_RE_PRINT; }
	public String getr2_MODE() { return m_r2_MODE; }
	public String getPRINT_PATTERN() { return m_PRINT_PATTERN; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_OPR_INST_SLIP_ISS_FLG_DN() { return m_l_OPR_INST_SLIP_ISS_FLG_DN; }
	public String getDATE() { return m_DATE; }
	public String getTIME() { return m_TIME; }
	public String getPAGE() { return m_PAGE; }
	public String getTOTAL_PAGE() { return m_TOTAL_PAGE; }
	public String getBARCODE1() { return m_BARCODE1; }
	public String getOPR_INST_START_TIME() { return m_OPR_INST_START_TIME; }
	public String getWORK_ODR_DLV_TIME() { return m_WORK_ODR_DLV_TIME; }
	public String getc_CARD_PRINT() { return m_c_CARD_PRINT; }
	public String getINST_PRINTED() { return m_INST_PRINTED; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String getl_WORK_IN_PROC_CD() { return m_l_WORK_IN_PROC_CD; }
	public String getl_PROC_NAME() { return m_l_PROC_NAME; }
	public String getl_PROC_NO() { return m_l_PROC_NO; }
	public String getl_OPR_INST_CD() { return m_l_OPR_INST_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_OPR_INST_START_DATE() { return m_l_OPR_INST_START_DATE; }
	public String getl_WORK_ODR_DLV_DATE() { return m_l_WORK_ODR_DLV_DATE; }
	public String getl_OPR_INST_QTY() { return m_l_OPR_INST_QTY; }
	public String getl_WORK_IN_PROC_COMMENT() { return m_l_WORK_IN_PROC_COMMENT; }
	public String getl_OPR_INST_SLIP_ISS_DATE() { return m_l_OPR_INST_SLIP_ISS_DATE; }
	public String getl_OPR_INST_SLIP_ISS_FLG() { return m_l_OPR_INST_SLIP_ISS_FLG; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_CARD_PRINTED_FLG() { return m_l_CARD_PRINTED_FLG; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getOPR_INST_SLIP_ISS_FLG() { return m_OPR_INST_SLIP_ISS_FLG; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getIDENT_CARD_QTY() { return m_IDENT_CARD_QTY; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getIDENT_CARD_CTL_NO() { return m_IDENT_CARD_CTL_NO; }
	public String getFIRST_IDENT_CARD_QTY() { return m_FIRST_IDENT_CARD_QTY; }
	public String getPRINT_QTY() { return m_PRINT_QTY; }
	public String getIDENT_CARD() { return m_IDENT_CARD; }

	public List getList_r1_MODE() { return l_r1_MODE; }
	public List getList_c_RE_PRINT() { return l_c_RE_PRINT; }
	public List getList_r2_MODE() { return l_r2_MODE; }
	public List getList_PRINT_PATTERN() { return l_PRINT_PATTERN; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_OPR_INST_SLIP_ISS_FLG_DN() { return l_l_OPR_INST_SLIP_ISS_FLG_DN; }
	public List getList_DATE() { return l_DATE; }
	public List getList_TIME() { return l_TIME; }
	public List getList_PAGE() { return l_PAGE; }
	public List getList_TOTAL_PAGE() { return l_TOTAL_PAGE; }
	public List getList_BARCODE1() { return l_BARCODE1; }
	public List getList_OPR_INST_START_TIME() { return l_OPR_INST_START_TIME; }
	public List getList_WORK_ODR_DLV_TIME() { return l_WORK_ODR_DLV_TIME; }
	public List getList_c_CARD_PRINT() { return l_c_CARD_PRINT; }
	public List getList_INST_PRINTED() { return l_INST_PRINTED; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_l_WORK_IN_PROC_CD() { return l_l_WORK_IN_PROC_CD; }
	public List getList_l_PROC_NAME() { return l_l_PROC_NAME; }
	public List getList_l_PROC_NO() { return l_l_PROC_NO; }
	public List getList_l_OPR_INST_CD() { return l_l_OPR_INST_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_OPR_INST_START_DATE() { return l_l_OPR_INST_START_DATE; }
	public List getList_l_WORK_ODR_DLV_DATE() { return l_l_WORK_ODR_DLV_DATE; }
	public List getList_l_OPR_INST_QTY() { return l_l_OPR_INST_QTY; }
	public List getList_l_WORK_IN_PROC_COMMENT() { return l_l_WORK_IN_PROC_COMMENT; }
	public List getList_l_OPR_INST_SLIP_ISS_DATE() { return l_l_OPR_INST_SLIP_ISS_DATE; }
	public List getList_l_OPR_INST_SLIP_ISS_FLG() { return l_l_OPR_INST_SLIP_ISS_FLG; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_CARD_PRINTED_FLG() { return l_l_CARD_PRINTED_FLG; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_OPR_INST_SLIP_ISS_FLG() { return l_OPR_INST_SLIP_ISS_FLG; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_IDENT_CARD_QTY() { return l_IDENT_CARD_QTY; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_PKG_UNIT_QTY() { return l_PKG_UNIT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_IDENT_CARD_CTL_NO() { return l_IDENT_CARD_CTL_NO; }
	public List getList_FIRST_IDENT_CARD_QTY() { return l_FIRST_IDENT_CARD_QTY; }
	public List getList_PRINT_QTY() { return l_PRINT_QTY; }
	public List getList_IDENT_CARD() { return l_IDENT_CARD; }

	public void setr1_MODE(String val) { m_r1_MODE = val; }
	public void setc_RE_PRINT(String val) { m_c_RE_PRINT = val; }
	public void setr2_MODE(String val) { m_r2_MODE = val; }
	public void setPRINT_PATTERN(String val) { m_PRINT_PATTERN = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_OPR_INST_SLIP_ISS_FLG_DN(String val) { m_l_OPR_INST_SLIP_ISS_FLG_DN = val; }
	public void setDATE(String val) { m_DATE = val; }
	public void setTIME(String val) { m_TIME = val; }
	public void setPAGE(String val) { m_PAGE = val; }
	public void setTOTAL_PAGE(String val) { m_TOTAL_PAGE = val; }
	public void setBARCODE1(String val) { m_BARCODE1 = val; }
	public void setOPR_INST_START_TIME(String val) { m_OPR_INST_START_TIME = val; }
	public void setWORK_ODR_DLV_TIME(String val) { m_WORK_ODR_DLV_TIME = val; }
	public void setc_CARD_PRINT(String val) { m_c_CARD_PRINT = val; }
	public void setINST_PRINTED(String val) { m_INST_PRINTED = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void setl_WORK_IN_PROC_CD(String val) { m_l_WORK_IN_PROC_CD = val; }
	public void setl_PROC_NAME(String val) { m_l_PROC_NAME = val; }
	public void setl_PROC_NO(String val) { m_l_PROC_NO = val; }
	public void setl_OPR_INST_CD(String val) { m_l_OPR_INST_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_OPR_INST_START_DATE(String val) { m_l_OPR_INST_START_DATE = val; }
	public void setl_WORK_ODR_DLV_DATE(String val) { m_l_WORK_ODR_DLV_DATE = val; }
	public void setl_OPR_INST_QTY(String val) { m_l_OPR_INST_QTY = val; }
	public void setl_WORK_IN_PROC_COMMENT(String val) { m_l_WORK_IN_PROC_COMMENT = val; }
	public void setl_OPR_INST_SLIP_ISS_DATE(String val) { m_l_OPR_INST_SLIP_ISS_DATE = val; }
	public void setl_OPR_INST_SLIP_ISS_FLG(String val) { m_l_OPR_INST_SLIP_ISS_FLG = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_CARD_PRINTED_FLG(String val) { m_l_CARD_PRINTED_FLG = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setOPR_INST_SLIP_ISS_FLG(String val) { m_OPR_INST_SLIP_ISS_FLG = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setIDENT_CARD_QTY(String val) { m_IDENT_CARD_QTY = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setPKG_UNIT_QTY(String val) { m_PKG_UNIT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setIDENT_CARD_CTL_NO(String val) { m_IDENT_CARD_CTL_NO = val; }
	public void setFIRST_IDENT_CARD_QTY(String val) { m_FIRST_IDENT_CARD_QTY = val; }
	public void setPRINT_QTY(String val) { m_PRINT_QTY = val; }
	public void setIDENT_CARD(String val) { m_IDENT_CARD = val; }


	public void setList_r1_MODE(List list) { l_r1_MODE = list; }
	public void setList_c_RE_PRINT(List list) { l_c_RE_PRINT = list; }
	public void setList_r2_MODE(List list) { l_r2_MODE = list; }
	public void setList_PRINT_PATTERN(List list) { l_PRINT_PATTERN = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_OPR_INST_SLIP_ISS_FLG_DN(List list) { l_l_OPR_INST_SLIP_ISS_FLG_DN = list; }
	public void setList_DATE(List list) { l_DATE = list; }
	public void setList_TIME(List list) { l_TIME = list; }
	public void setList_PAGE(List list) { l_PAGE = list; }
	public void setList_TOTAL_PAGE(List list) { l_TOTAL_PAGE = list; }
	public void setList_BARCODE1(List list) { l_BARCODE1 = list; }
	public void setList_OPR_INST_START_TIME(List list) { l_OPR_INST_START_TIME = list; }
	public void setList_WORK_ODR_DLV_TIME(List list) { l_WORK_ODR_DLV_TIME = list; }
	public void setList_c_CARD_PRINT(List list) { l_c_CARD_PRINT = list; }
	public void setList_INST_PRINTED(List list) { l_INST_PRINTED = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_l_WORK_IN_PROC_CD(List list) { l_l_WORK_IN_PROC_CD = list; }
	public void setList_l_PROC_NAME(List list) { l_l_PROC_NAME = list; }
	public void setList_l_PROC_NO(List list) { l_l_PROC_NO = list; }
	public void setList_l_OPR_INST_CD(List list) { l_l_OPR_INST_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_OPR_INST_START_DATE(List list) { l_l_OPR_INST_START_DATE = list; }
	public void setList_l_WORK_ODR_DLV_DATE(List list) { l_l_WORK_ODR_DLV_DATE = list; }
	public void setList_l_OPR_INST_QTY(List list) { l_l_OPR_INST_QTY = list; }
	public void setList_l_WORK_IN_PROC_COMMENT(List list) { l_l_WORK_IN_PROC_COMMENT = list; }
	public void setList_l_OPR_INST_SLIP_ISS_DATE(List list) { l_l_OPR_INST_SLIP_ISS_DATE = list; }
	public void setList_l_OPR_INST_SLIP_ISS_FLG(List list) { l_l_OPR_INST_SLIP_ISS_FLG = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_CARD_PRINTED_FLG(List list) { l_l_CARD_PRINTED_FLG = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_OPR_INST_SLIP_ISS_FLG(List list) { l_OPR_INST_SLIP_ISS_FLG = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_IDENT_CARD_QTY(List list) { l_IDENT_CARD_QTY = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_PKG_UNIT_QTY(List list) { l_PKG_UNIT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_IDENT_CARD_CTL_NO(List list) { l_IDENT_CARD_CTL_NO = list; }
	public void setList_FIRST_IDENT_CARD_QTY(List list) { l_FIRST_IDENT_CARD_QTY = list; }
	public void setList_PRINT_QTY(List list) { l_PRINT_QTY = list; }
	public void setList_IDENT_CARD(List list) { l_IDENT_CARD = list; }

	public int setL2L_r1_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_MODE == null) {
			l_r1_MODE = new ArrayList();
		} else {
			l_r1_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_MODE.add(((AD0030040Struct) list.get(i)).getr1_MODE());
		}
		return size;
	}
	public int setL2L_c_RE_PRINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_RE_PRINT == null) {
			l_c_RE_PRINT = new ArrayList();
		} else {
			l_c_RE_PRINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_RE_PRINT.add(((AD0030040Struct) list.get(i)).getc_RE_PRINT());
		}
		return size;
	}
	public int setL2L_r2_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_MODE == null) {
			l_r2_MODE = new ArrayList();
		} else {
			l_r2_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_MODE.add(((AD0030040Struct) list.get(i)).getr2_MODE());
		}
		return size;
	}
	public int setL2L_PRINT_PATTERN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_PATTERN == null) {
			l_PRINT_PATTERN = new ArrayList();
		} else {
			l_PRINT_PATTERN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_PATTERN.add(((AD0030040Struct) list.get(i)).getPRINT_PATTERN());
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
			l_DOWNLOAD_FILE.add(((AD0030040Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_SLIP_ISS_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_SLIP_ISS_FLG_DN == null) {
			l_l_OPR_INST_SLIP_ISS_FLG_DN = new ArrayList();
		} else {
			l_l_OPR_INST_SLIP_ISS_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_SLIP_ISS_FLG_DN.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_SLIP_ISS_FLG_DN());
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
			l_DATE.add(((AD0030040Struct) list.get(i)).getDATE());
		}
		return size;
	}
	public int setL2L_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME == null) {
			l_TIME = new ArrayList();
		} else {
			l_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME.add(((AD0030040Struct) list.get(i)).getTIME());
		}
		return size;
	}
	public int setL2L_PAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAGE == null) {
			l_PAGE = new ArrayList();
		} else {
			l_PAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAGE.add(((AD0030040Struct) list.get(i)).getPAGE());
		}
		return size;
	}
	public int setL2L_TOTAL_PAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PAGE == null) {
			l_TOTAL_PAGE = new ArrayList();
		} else {
			l_TOTAL_PAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PAGE.add(((AD0030040Struct) list.get(i)).getTOTAL_PAGE());
		}
		return size;
	}
	public int setL2L_BARCODE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BARCODE1 == null) {
			l_BARCODE1 = new ArrayList();
		} else {
			l_BARCODE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BARCODE1.add(((AD0030040Struct) list.get(i)).getBARCODE1());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_TIME == null) {
			l_OPR_INST_START_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_TIME.add(((AD0030040Struct) list.get(i)).getOPR_INST_START_TIME());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_TIME == null) {
			l_WORK_ODR_DLV_TIME = new ArrayList();
		} else {
			l_WORK_ODR_DLV_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_TIME.add(((AD0030040Struct) list.get(i)).getWORK_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_c_CARD_PRINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CARD_PRINT == null) {
			l_c_CARD_PRINT = new ArrayList();
		} else {
			l_c_CARD_PRINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CARD_PRINT.add(((AD0030040Struct) list.get(i)).getc_CARD_PRINT());
		}
		return size;
	}
	public int setL2L_INST_PRINTED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INST_PRINTED == null) {
			l_INST_PRINTED = new ArrayList();
		} else {
			l_INST_PRINTED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INST_PRINTED.add(((AD0030040Struct) list.get(i)).getINST_PRINTED());
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
			l_LOT_NO.add(((AD0030040Struct) list.get(i)).getLOT_NO());
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
			l_PARTIAL_PRD_NO.add(((AD0030040Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_OPR_DATE.add(((AD0030040Struct) list.get(i)).getOPR_DATE());
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
			l_l_WORK_ODR_CD.add(((AD0030040Struct) list.get(i)).getl_WORK_ODR_CD());
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
			l_l_WORK_IN_PROC_CD.add(((AD0030040Struct) list.get(i)).getl_WORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_NAME == null) {
			l_l_PROC_NAME = new ArrayList();
		} else {
			l_l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_NAME.add(((AD0030040Struct) list.get(i)).getl_PROC_NAME());
		}
		return size;
	}
	public int setL2L_l_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_NO == null) {
			l_l_PROC_NO = new ArrayList();
		} else {
			l_l_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_NO.add(((AD0030040Struct) list.get(i)).getl_PROC_NO());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_CD == null) {
			l_l_OPR_INST_CD = new ArrayList();
		} else {
			l_l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_CD.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_CD());
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
			l_l_ITEM_CD.add(((AD0030040Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AD0030040Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_CD == null) {
			l_l_WS_CD = new ArrayList();
		} else {
			l_l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_CD.add(((AD0030040Struct) list.get(i)).getl_WS_CD());
		}
		return size;
	}
	public int setL2L_l_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_NAME == null) {
			l_l_WS_NAME = new ArrayList();
		} else {
			l_l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_NAME.add(((AD0030040Struct) list.get(i)).getl_WS_NAME());
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
			l_l_JOB_ODR_CD.add(((AD0030040Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_START_DATE == null) {
			l_l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_START_DATE.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_DLV_DATE == null) {
			l_l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_DLV_DATE.add(((AD0030040Struct) list.get(i)).getl_WORK_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_QTY == null) {
			l_l_OPR_INST_QTY = new ArrayList();
		} else {
			l_l_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_QTY.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_l_WORK_IN_PROC_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_IN_PROC_COMMENT == null) {
			l_l_WORK_IN_PROC_COMMENT = new ArrayList();
		} else {
			l_l_WORK_IN_PROC_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_IN_PROC_COMMENT.add(((AD0030040Struct) list.get(i)).getl_WORK_IN_PROC_COMMENT());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_SLIP_ISS_DATE == null) {
			l_l_OPR_INST_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_SLIP_ISS_DATE.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_SLIP_ISS_FLG == null) {
			l_l_OPR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_l_OPR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_SLIP_ISS_FLG.add(((AD0030040Struct) list.get(i)).getl_OPR_INST_SLIP_ISS_FLG());
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
			l_DRAW_CD.add(((AD0030040Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0030040Struct) list.get(i)).getSPEC());
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
			l_l_STOCK_UNIT.add(((AD0030040Struct) list.get(i)).getl_STOCK_UNIT());
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
			l_PLANT_NAME.add(((AD0030040Struct) list.get(i)).getPLANT_NAME());
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
			l_l_MODIFY_COUNT.add(((AD0030040Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_CARD_PRINTED_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CARD_PRINTED_FLG == null) {
			l_l_CARD_PRINTED_FLG = new ArrayList();
		} else {
			l_l_CARD_PRINTED_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CARD_PRINTED_FLG.add(((AD0030040Struct) list.get(i)).getl_CARD_PRINTED_FLG());
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
			l_OPR_INST_START_DATE.add(((AD0030040Struct) list.get(i)).getOPR_INST_START_DATE());
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
			l_WORK_ODR_DLV_DATE.add(((AD0030040Struct) list.get(i)).getWORK_ODR_DLV_DATE());
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
			l_JOB_ODR_CD.add(((AD0030040Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AD0030040Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0030040Struct) list.get(i)).getWS_CD());
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
			l_PLANT_CD.add(((AD0030040Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_SLIP_ISS_FLG == null) {
			l_OPR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_OPR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_SLIP_ISS_FLG.add(((AD0030040Struct) list.get(i)).getOPR_INST_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AD0030040Struct) list.get(i)).getDISPLAY_NAME());
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
			l_OUTSIDE_TYP.add(((AD0030040Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_BUSINESS_OPR_DATE.add(((AD0030040Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_TIME_CTRL.add(((AD0030040Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AD0030040Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AD0030040Struct) list.get(i)).getROW_COUNT());
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
			l_ITEM_NAME.add(((AD0030040Struct) list.get(i)).getITEM_NAME());
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
			l_OPR_INST_QTY.add(((AD0030040Struct) list.get(i)).getOPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_QTY == null) {
			l_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_QTY.add(((AD0030040Struct) list.get(i)).getIDENT_CARD_QTY());
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
			l_OPR_INST_CD.add(((AD0030040Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT_QTY == null) {
			l_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT_QTY.add(((AD0030040Struct) list.get(i)).getPKG_UNIT_QTY());
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
			l_STOCK_UNIT.add(((AD0030040Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_CTL_NO == null) {
			l_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_CTL_NO.add(((AD0030040Struct) list.get(i)).getIDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_IDENT_CARD_QTY == null) {
			l_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_IDENT_CARD_QTY.add(((AD0030040Struct) list.get(i)).getFIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_QTY == null) {
			l_PRINT_QTY = new ArrayList();
		} else {
			l_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_QTY.add(((AD0030040Struct) list.get(i)).getPRINT_QTY());
		}
		return size;
	}
	public int setL2L_IDENT_CARD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD == null) {
			l_IDENT_CARD = new ArrayList();
		} else {
			l_IDENT_CARD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD.add(((AD0030040Struct) list.get(i)).getIDENT_CARD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_MODE = null;
		m_c_RE_PRINT = null;
		m_r2_MODE = null;
		m_PRINT_PATTERN = null;
		m_DOWNLOAD_FILE = null;
		m_l_OPR_INST_SLIP_ISS_FLG_DN = null;
		m_DATE = null;
		m_TIME = null;
		m_PAGE = null;
		m_TOTAL_PAGE = null;
		m_BARCODE1 = null;
		m_OPR_INST_START_TIME = null;
		m_WORK_ODR_DLV_TIME = null;
		m_c_CARD_PRINT = null;
		m_INST_PRINTED = null;
		m_LOT_NO = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_DATE = null;
		m_l_WORK_ODR_CD = null;
		m_l_WORK_IN_PROC_CD = null;
		m_l_PROC_NAME = null;
		m_l_PROC_NO = null;
		m_l_OPR_INST_CD = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_WS_CD = null;
		m_l_WS_NAME = null;
		m_l_JOB_ODR_CD = null;
		m_l_OPR_INST_START_DATE = null;
		m_l_WORK_ODR_DLV_DATE = null;
		m_l_OPR_INST_QTY = null;
		m_l_WORK_IN_PROC_COMMENT = null;
		m_l_OPR_INST_SLIP_ISS_DATE = null;
		m_l_OPR_INST_SLIP_ISS_FLG = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_l_STOCK_UNIT = null;
		m_PLANT_NAME = null;
		m_l_MODIFY_COUNT = null;
		m_l_CARD_PRINTED_FLG = null;
		m_OPR_INST_START_DATE = null;
		m_WORK_ODR_DLV_DATE = null;
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_PLANT_CD = null;
		m_OPR_INST_SLIP_ISS_FLG = null;
		m_DISPLAY_NAME = null;
		m_OUTSIDE_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_ITEM_NAME = null;
		m_OPR_INST_QTY = null;
		m_IDENT_CARD_QTY = null;
		m_OPR_INST_CD = null;
		m_PKG_UNIT_QTY = null;
		m_STOCK_UNIT = null;
		m_IDENT_CARD_CTL_NO = null;
		m_FIRST_IDENT_CARD_QTY = null;
		m_PRINT_QTY = null;
		m_IDENT_CARD = null;

		l_r1_MODE = null;
		l_c_RE_PRINT = null;
		l_r2_MODE = null;
		l_PRINT_PATTERN = null;
		l_DOWNLOAD_FILE = null;
		l_l_OPR_INST_SLIP_ISS_FLG_DN = null;
		l_DATE = null;
		l_TIME = null;
		l_PAGE = null;
		l_TOTAL_PAGE = null;
		l_BARCODE1 = null;
		l_OPR_INST_START_TIME = null;
		l_WORK_ODR_DLV_TIME = null;
		l_c_CARD_PRINT = null;
		l_INST_PRINTED = null;
		l_LOT_NO = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_DATE = null;
		l_l_WORK_ODR_CD = null;
		l_l_WORK_IN_PROC_CD = null;
		l_l_PROC_NAME = null;
		l_l_PROC_NO = null;
		l_l_OPR_INST_CD = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_WS_CD = null;
		l_l_WS_NAME = null;
		l_l_JOB_ODR_CD = null;
		l_l_OPR_INST_START_DATE = null;
		l_l_WORK_ODR_DLV_DATE = null;
		l_l_OPR_INST_QTY = null;
		l_l_WORK_IN_PROC_COMMENT = null;
		l_l_OPR_INST_SLIP_ISS_DATE = null;
		l_l_OPR_INST_SLIP_ISS_FLG = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_l_STOCK_UNIT = null;
		l_PLANT_NAME = null;
		l_l_MODIFY_COUNT = null;
		l_l_CARD_PRINTED_FLG = null;
		l_OPR_INST_START_DATE = null;
		l_WORK_ODR_DLV_DATE = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_PLANT_CD = null;
		l_OPR_INST_SLIP_ISS_FLG = null;
		l_DISPLAY_NAME = null;
		l_OUTSIDE_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_TIME_CTRL = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_ITEM_NAME = null;
		l_OPR_INST_QTY = null;
		l_IDENT_CARD_QTY = null;
		l_OPR_INST_CD = null;
		l_PKG_UNIT_QTY = null;
		l_STOCK_UNIT = null;
		l_IDENT_CARD_CTL_NO = null;
		l_FIRST_IDENT_CARD_QTY = null;
		l_PRINT_QTY = null;
		l_IDENT_CARD = null;

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
	 * medAD0030040クラスの標準コンストラクタ
	 */
	public AD0030040Struct()
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
	public void setStruct(AD0030040Struct struct)
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
	public void setStructM(AD0030040Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_MODE(struct.getr1_MODE());
			this.setc_RE_PRINT(struct.getc_RE_PRINT());
			this.setr2_MODE(struct.getr2_MODE());
			this.setPRINT_PATTERN(struct.getPRINT_PATTERN());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_OPR_INST_SLIP_ISS_FLG_DN(struct.getl_OPR_INST_SLIP_ISS_FLG_DN());
			this.setDATE(struct.getDATE());
			this.setTIME(struct.getTIME());
			this.setPAGE(struct.getPAGE());
			this.setTOTAL_PAGE(struct.getTOTAL_PAGE());
			this.setBARCODE1(struct.getBARCODE1());
			this.setOPR_INST_START_TIME(struct.getOPR_INST_START_TIME());
			this.setWORK_ODR_DLV_TIME(struct.getWORK_ODR_DLV_TIME());
			this.setc_CARD_PRINT(struct.getc_CARD_PRINT());
			this.setINST_PRINTED(struct.getINST_PRINTED());
			this.setLOT_NO(struct.getLOT_NO());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.setl_WORK_IN_PROC_CD(struct.getl_WORK_IN_PROC_CD());
			this.setl_PROC_NAME(struct.getl_PROC_NAME());
			this.setl_PROC_NO(struct.getl_PROC_NO());
			this.setl_OPR_INST_CD(struct.getl_OPR_INST_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_OPR_INST_START_DATE(struct.getl_OPR_INST_START_DATE());
			this.setl_WORK_ODR_DLV_DATE(struct.getl_WORK_ODR_DLV_DATE());
			this.setl_OPR_INST_QTY(struct.getl_OPR_INST_QTY());
			this.setl_WORK_IN_PROC_COMMENT(struct.getl_WORK_IN_PROC_COMMENT());
			this.setl_OPR_INST_SLIP_ISS_DATE(struct.getl_OPR_INST_SLIP_ISS_DATE());
			this.setl_OPR_INST_SLIP_ISS_FLG(struct.getl_OPR_INST_SLIP_ISS_FLG());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_CARD_PRINTED_FLG(struct.getl_CARD_PRINTED_FLG());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setOPR_INST_SLIP_ISS_FLG(struct.getOPR_INST_SLIP_ISS_FLG());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setIDENT_CARD_QTY(struct.getIDENT_CARD_QTY());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setPKG_UNIT_QTY(struct.getPKG_UNIT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setIDENT_CARD_CTL_NO(struct.getIDENT_CARD_CTL_NO());
			this.setFIRST_IDENT_CARD_QTY(struct.getFIRST_IDENT_CARD_QTY());
			this.setPRINT_QTY(struct.getPRINT_QTY());
			this.setIDENT_CARD(struct.getIDENT_CARD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0030040Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_MODE(struct.getList_r1_MODE());
			this.setList_c_RE_PRINT(struct.getList_c_RE_PRINT());
			this.setList_r2_MODE(struct.getList_r2_MODE());
			this.setList_PRINT_PATTERN(struct.getList_PRINT_PATTERN());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_OPR_INST_SLIP_ISS_FLG_DN(struct.getList_l_OPR_INST_SLIP_ISS_FLG_DN());
			this.setList_DATE(struct.getList_DATE());
			this.setList_TIME(struct.getList_TIME());
			this.setList_PAGE(struct.getList_PAGE());
			this.setList_TOTAL_PAGE(struct.getList_TOTAL_PAGE());
			this.setList_BARCODE1(struct.getList_BARCODE1());
			this.setList_OPR_INST_START_TIME(struct.getList_OPR_INST_START_TIME());
			this.setList_WORK_ODR_DLV_TIME(struct.getList_WORK_ODR_DLV_TIME());
			this.setList_c_CARD_PRINT(struct.getList_c_CARD_PRINT());
			this.setList_INST_PRINTED(struct.getList_INST_PRINTED());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_l_WORK_IN_PROC_CD(struct.getList_l_WORK_IN_PROC_CD());
			this.setList_l_PROC_NAME(struct.getList_l_PROC_NAME());
			this.setList_l_PROC_NO(struct.getList_l_PROC_NO());
			this.setList_l_OPR_INST_CD(struct.getList_l_OPR_INST_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_OPR_INST_START_DATE(struct.getList_l_OPR_INST_START_DATE());
			this.setList_l_WORK_ODR_DLV_DATE(struct.getList_l_WORK_ODR_DLV_DATE());
			this.setList_l_OPR_INST_QTY(struct.getList_l_OPR_INST_QTY());
			this.setList_l_WORK_IN_PROC_COMMENT(struct.getList_l_WORK_IN_PROC_COMMENT());
			this.setList_l_OPR_INST_SLIP_ISS_DATE(struct.getList_l_OPR_INST_SLIP_ISS_DATE());
			this.setList_l_OPR_INST_SLIP_ISS_FLG(struct.getList_l_OPR_INST_SLIP_ISS_FLG());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_CARD_PRINTED_FLG(struct.getList_l_CARD_PRINTED_FLG());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_OPR_INST_SLIP_ISS_FLG(struct.getList_OPR_INST_SLIP_ISS_FLG());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_IDENT_CARD_QTY(struct.getList_IDENT_CARD_QTY());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_PKG_UNIT_QTY(struct.getList_PKG_UNIT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_IDENT_CARD_CTL_NO(struct.getList_IDENT_CARD_CTL_NO());
			this.setList_FIRST_IDENT_CARD_QTY(struct.getList_FIRST_IDENT_CARD_QTY());
			this.setList_PRINT_QTY(struct.getList_PRINT_QTY());
			this.setList_IDENT_CARD(struct.getList_IDENT_CARD());
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
	// 第 1 変数初期値： i_r1_MODE


	final static String i_r1_MODE = null;

	// 第 2 変数初期値： i_c_RE_PRINT


	final static String i_c_RE_PRINT = null;

	// 第 3 変数初期値： i_r2_MODE


	final static String i_r2_MODE = null;

	// 第 4 変数初期値： i_PRINT_PATTERN


	final static String i_PRINT_PATTERN = null;

	// 第 5 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 6 変数初期値： i_l_OPR_INST_SLIP_ISS_FLG_DN


	final static String i_l_OPR_INST_SLIP_ISS_FLG_DN = null;

	// 第 7 変数初期値： i_DATE


	final static String i_DATE = null;

	// 第 8 変数初期値： i_TIME


	final static String i_TIME = null;

	// 第 9 変数初期値： i_PAGE


	final static String i_PAGE = null;

	// 第 10 変数初期値： i_TOTAL_PAGE


	final static String i_TOTAL_PAGE = null;

	// 第 11 変数初期値： i_BARCODE1


	final static String i_BARCODE1 = null;

	// 第 12 変数初期値： i_OPR_INST_START_TIME


	final static String i_OPR_INST_START_TIME = null;

	// 第 13 変数初期値： i_WORK_ODR_DLV_TIME


	final static String i_WORK_ODR_DLV_TIME = null;

	// 第 14 変数初期値： i_c_CARD_PRINT


	final static String i_c_CARD_PRINT = null;

	// 第 15 変数初期値： i_INST_PRINTED


	final static String i_INST_PRINTED = null;

	// 第 16 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 17 変数初期値： i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// 第 18 変数初期値： i_OPR_DATE


	final static String i_OPR_DATE = null;

	// 第 19 変数初期値： i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// 第 20 変数初期値： i_l_WORK_IN_PROC_CD


	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 21 変数初期値： i_l_PROC_NAME


	final static String i_l_PROC_NAME = null;

	// 第 22 変数初期値： i_l_PROC_NO


	final static String i_l_PROC_NO = null;

	// 第 23 変数初期値： i_l_OPR_INST_CD


	final static String i_l_OPR_INST_CD = null;

	// 第 24 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 25 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 26 変数初期値： i_l_WS_CD


	final static String i_l_WS_CD = null;

	// 第 27 変数初期値： i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// 第 28 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 29 変数初期値： i_l_OPR_INST_START_DATE


	final static String i_l_OPR_INST_START_DATE = null;

	// 第 30 変数初期値： i_l_WORK_ODR_DLV_DATE


	final static String i_l_WORK_ODR_DLV_DATE = null;

	// 第 31 変数初期値： i_l_OPR_INST_QTY


	final static String i_l_OPR_INST_QTY = null;

	// 第 32 変数初期値： i_l_WORK_IN_PROC_COMMENT


	final static String i_l_WORK_IN_PROC_COMMENT = null;

	// 第 33 変数初期値： i_l_OPR_INST_SLIP_ISS_DATE


	final static String i_l_OPR_INST_SLIP_ISS_DATE = null;

	// 第 34 変数初期値： i_l_OPR_INST_SLIP_ISS_FLG


	final static String i_l_OPR_INST_SLIP_ISS_FLG = null;

	// 第 35 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 36 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 37 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 38 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 39 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 40 変数初期値： i_l_CARD_PRINTED_FLG


	final static String i_l_CARD_PRINTED_FLG = null;

	// 第 41 変数初期値： i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// 第 42 変数初期値： i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// 第 43 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 44 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 45 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 46 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 47 変数初期値： i_OPR_INST_SLIP_ISS_FLG


	final static String i_OPR_INST_SLIP_ISS_FLG = null;

	// 第 48 変数初期値： i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// 第 49 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 50 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 51 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 52 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 53 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 54 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 55 変数初期値： i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// 第 56 変数初期値： i_IDENT_CARD_QTY


	final static String i_IDENT_CARD_QTY = null;

	// 第 57 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 58 変数初期値： i_PKG_UNIT_QTY


	final static String i_PKG_UNIT_QTY = null;

	// 第 59 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 60 変数初期値： i_IDENT_CARD_CTL_NO


	final static String i_IDENT_CARD_CTL_NO = null;

	// 第 61 変数初期値： i_FIRST_IDENT_CARD_QTY


	final static String i_FIRST_IDENT_CARD_QTY = null;

	// 第 62 変数初期値： i_PRINT_QTY


	final static String i_PRINT_QTY = null;

	// 第 63 変数初期値： i_IDENT_CARD


	final static String i_IDENT_CARD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r1_MODE

	final static String i_r1_MODE = null;

	// 第 2 変数初期値： i_c_RE_PRINT

	final static String i_c_RE_PRINT = null;

	// 第 3 変数初期値： i_r2_MODE

	final static String i_r2_MODE = null;

	// 第 4 変数初期値： i_PRINT_PATTERN

	final static String i_PRINT_PATTERN = null;

	// 第 5 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 6 変数初期値： i_l_OPR_INST_SLIP_ISS_FLG_DN

	final static String i_l_OPR_INST_SLIP_ISS_FLG_DN = null;

	// 第 7 変数初期値： i_l_WORK_ODR_CD

	final static String i_l_WORK_ODR_CD = null;

	// 第 8 変数初期値： i_l_WORK_IN_PROC_CD

	final static String i_l_WORK_IN_PROC_CD = null;

	// 第 9 変数初期値： i_l_PROC_NAME

	final static String i_l_PROC_NAME = null;

	// 第 10 変数初期値： i_l_PROC_NO

	final static String i_l_PROC_NO = null;

	// 第 11 変数初期値： i_l_OPR_INST_CD

	final static String i_l_OPR_INST_CD = null;

	// 第 12 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 13 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 14 変数初期値： i_l_WS_CD

	final static String i_l_WS_CD = null;

	// 第 15 変数初期値： i_l_WS_NAME

	final static String i_l_WS_NAME = null;

	// 第 16 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 17 変数初期値： i_l_OPR_INST_START_DATE

	final static String i_l_OPR_INST_START_DATE = null;

	// 第 18 変数初期値： i_l_WORK_ODR_DLV_DATE

	final static String i_l_WORK_ODR_DLV_DATE = null;

	// 第 19 変数初期値： i_l_OPR_INST_QTY

	final static String i_l_OPR_INST_QTY = null;

	// 第 20 変数初期値： i_l_WORK_IN_PROC_COMMENT

	final static String i_l_WORK_IN_PROC_COMMENT = null;

	// 第 21 変数初期値： i_l_OPR_INST_SLIP_ISS_DATE

	final static String i_l_OPR_INST_SLIP_ISS_DATE = null;

	// 第 22 変数初期値： i_l_OPR_INST_SLIP_ISS_FLG

	final static String i_l_OPR_INST_SLIP_ISS_FLG = null;

	// 第 23 変数初期値： i_DRAW_CD

	final static String i_DRAW_CD = null;

	// 第 24 変数初期値： i_SPEC

	final static String i_SPEC = null;

	// 第 25 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 26 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 27 変数初期値： i_l_MODIFY_COUNT

	final static String i_l_MODIFY_COUNT = null;

	// 第 28 変数初期値： i_OPR_INST_START_DATE

	final static String i_OPR_INST_START_DATE = null;

	// 第 29 変数初期値： i_WORK_ODR_DLV_DATE

	final static String i_WORK_ODR_DLV_DATE = null;

	// 第 30 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 31 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 33 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 34 変数初期値： i_OPR_INST_SLIP_ISS_FLG

	final static String i_OPR_INST_SLIP_ISS_FLG = null;

	// 第 35 変数初期値： i_DISPLAY_NAME

	final static String i_DISPLAY_NAME = null;

	// 第 36 変数初期値： i_OUTSIDE_TYP

	final static String i_OUTSIDE_TYP = null;

	// 第 37 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_MODE = i_r1_MODE;
		m_c_RE_PRINT = i_c_RE_PRINT;
		m_r2_MODE = i_r2_MODE;
		m_PRINT_PATTERN = i_PRINT_PATTERN;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_OPR_INST_SLIP_ISS_FLG_DN = i_l_OPR_INST_SLIP_ISS_FLG_DN;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_l_WORK_IN_PROC_CD = i_l_WORK_IN_PROC_CD;
		m_l_PROC_NAME = i_l_PROC_NAME;
		m_l_PROC_NO = i_l_PROC_NO;
		m_l_OPR_INST_CD = i_l_OPR_INST_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_WS_CD = i_l_WS_CD;
		m_l_WS_NAME = i_l_WS_NAME;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_OPR_INST_START_DATE = i_l_OPR_INST_START_DATE;
		m_l_WORK_ODR_DLV_DATE = i_l_WORK_ODR_DLV_DATE;
		m_l_OPR_INST_QTY = i_l_OPR_INST_QTY;
		m_l_WORK_IN_PROC_COMMENT = i_l_WORK_IN_PROC_COMMENT;
		m_l_OPR_INST_SLIP_ISS_DATE = i_l_OPR_INST_SLIP_ISS_DATE;
		m_l_OPR_INST_SLIP_ISS_FLG = i_l_OPR_INST_SLIP_ISS_FLG;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_PLANT_NAME = i_PLANT_NAME;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_WS_CD = i_WS_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_OPR_INST_SLIP_ISS_FLG = i_OPR_INST_SLIP_ISS_FLG;
		m_DISPLAY_NAME = i_DISPLAY_NAME;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
