/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0020/src/com/nec/jp/orteus/metamorBase/KU0020/KU0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0020;

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
 * CLASS     : KU0020010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:30:19 $
 *
 */
//}}user_implement_code_header

public class KU0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r1_PrintType */
	public String m_r1_PrintType = null;
	/** 第 2 変数： m_r2_PrintType */
	public String m_r2_PrintType = null;
	/** 第 3 変数： m_r3_PrintType */
	public String m_r3_PrintType = null;
	/** 第 4 変数： m_c_ReOut */
	public String m_c_ReOut = null;
	/** 第 5 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 6 変数： m_MIN_DESINATED_SHIP_DATE */
	public String m_MIN_DESINATED_SHIP_DATE = null;
	/** 第 7 変数： m_MAX_DESINATED_SHIP_DATE */
	public String m_MAX_DESINATED_SHIP_DATE = null;
	/** 第 8 変数： m_DESINATED_SHIP_DATE_FROM */
	public String m_DESINATED_SHIP_DATE_FROM = null;
	/** 第 9 変数： m_DESINATED_SHIP_DATE_TO */
	public String m_DESINATED_SHIP_DATE_TO = null;
	/** 第 10 変数： m_SLIP_CD_FROM */
	public String m_SLIP_CD_FROM = null;
	/** 第 11 変数： m_SLIP_CD_TO */
	public String m_SLIP_CD_TO = null;
	/** 第 12 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 13 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 14 変数： m_PRINT_FLG */
	public String m_PRINT_FLG = null;
	/** 第 15 変数： m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO */
	public String m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;
	/** 第 16 変数： m_T_UN_SHIP_LIST__CUST_CD */
	public String m_T_UN_SHIP_LIST__CUST_CD = null;
	/** 第 17 変数： m_M_CUST__CUST_NAME */
	public String m_M_CUST__CUST_NAME = null;
	/** 第 18 変数： m_T_ODR_CTL__CUST_ITEM_CD */
	public String m_T_ODR_CTL__CUST_ITEM_CD = null;
	/** 第 19 変数： m_T_UN_SHIP_LIST__ITEM_CD */
	public String m_T_UN_SHIP_LIST__ITEM_CD = null;
	/** 第 20 変数： m_T_ODR__CUST_ODR_NO */
	public String m_T_ODR__CUST_ODR_NO = null;
	/** 第 21 変数： m_T_UN_SHIP_LIST__UN_SHIP_QTY */
	public String m_T_UN_SHIP_LIST__UN_SHIP_QTY = null;
	/** 第 22 変数： m_M_ITEM__STOCK_UNIT */
	public String m_M_ITEM__STOCK_UNIT = null;
	/** 第 23 変数： m_T_UN_SHIP_LIST__WH_CD */
	public String m_T_UN_SHIP_LIST__WH_CD = null;
	/** 第 24 変数： m_T_UN_SHIP_LIST__ACPT_ODR_CD */
	public String m_T_UN_SHIP_LIST__ACPT_ODR_CD = null;
	/** 第 25 変数： m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO */
	public String m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;
	/** 第 26 変数： m_T_SHIP_SLIP__SLIP_CD */
	public String m_T_SHIP_SLIP__SLIP_CD = null;
	/** 第 27 変数： m_T_SHIP_SLIP__ITEM_CD */
	public String m_T_SHIP_SLIP__ITEM_CD = null;
	/** 第 28 変数： m_T_SHIP_SLIP__CUST_ITEM_CD */
	public String m_T_SHIP_SLIP__CUST_ITEM_CD = null;
	/** 第 29 変数： m_T_SHIP_SLIP__PART_NAME */
	public String m_T_SHIP_SLIP__PART_NAME = null;
	/** 第 30 変数： m_T_SHIP_SLIP__CUST_ODR_NO */
	public String m_T_SHIP_SLIP__CUST_ODR_NO = null;
	/** 第 31 変数： m_T_SHIP_SLIP__CUST_NAME */
	public String m_T_SHIP_SLIP__CUST_NAME = null;
	/** 第 32 変数： m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI */
	public String m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;
	/** 第 33 変数： m_T_SHIP_SLIP__BUYER_NAME */
	public String m_T_SHIP_SLIP__BUYER_NAME = null;
	/** 第 34 変数： m_T_SHIP_SLIP__CUS_DLV_KEY_CD */
	public String m_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;
	/** 第 35 変数： m_T_SHIP_SLIP__DESINATED_SHIP_DATE */
	public String m_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;
	/** 第 36 変数： m_T_SHIP_SLIP__DESINATED_DLV_DATE */
	public String m_T_SHIP_SLIP__DESINATED_DLV_DATE = null;
	/** 第 37 変数： m_T_SHIP_SLIP__SCDL_DLV_DATE */
	public String m_T_SHIP_SLIP__SCDL_DLV_DATE = null;
	/** 第 38 変数： m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL */
	public String m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;
	/** 第 39 変数： m_T_SHIP_SLIP__DLV_ODR_QTY */
	public String m_T_SHIP_SLIP__DLV_ODR_QTY = null;
	/** 第 40 変数： m_T_SHIP_SLIP__SHIP_ODR_QTY */
	public String m_T_SHIP_SLIP__SHIP_ODR_QTY = null;
	/** 第 41 変数： m_T_SHIP_SLIP__UNIT_CD */
	public String m_T_SHIP_SLIP__UNIT_CD = null;
	/** 第 42 変数： m_T_SHIP_SLIP__UNIT_PRICE */
	public String m_T_SHIP_SLIP__UNIT_PRICE = null;
	/** 第 43 変数： m_T_SHIP_SLIP__SHIP_ODR_AMOUNT */
	public String m_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;
	/** 第 44 変数： m_T_SHIP_SLIP__TAX_AMOUNT */
	public String m_T_SHIP_SLIP__TAX_AMOUNT = null;
	/** 第 45 変数： m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX */
	public String m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;
	/** 第 46 変数： m_T_SHIP_SLIP__CLIENT_REMARK_KANJI */
	public String m_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;
	/** 第 47 変数： m_T_SHIP_SLIP__CLIENT_BARCODE_INF */
	public String m_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;
	/** 第 48 変数： m_CODE_NAME */
	public String m_CODE_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r1_PrintType */
	public List l_r1_PrintType = null;

	/** 第 2 List変数： l_r2_PrintType */
	public List l_r2_PrintType = null;

	/** 第 3 List変数： l_r3_PrintType */
	public List l_r3_PrintType = null;

	/** 第 4 List変数： l_c_ReOut */
	public List l_c_ReOut = null;

	/** 第 5 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 6 List変数： l_MIN_DESINATED_SHIP_DATE */
	public List l_MIN_DESINATED_SHIP_DATE = null;

	/** 第 7 List変数： l_MAX_DESINATED_SHIP_DATE */
	public List l_MAX_DESINATED_SHIP_DATE = null;

	/** 第 8 List変数： l_DESINATED_SHIP_DATE_FROM */
	public List l_DESINATED_SHIP_DATE_FROM = null;

	/** 第 9 List変数： l_DESINATED_SHIP_DATE_TO */
	public List l_DESINATED_SHIP_DATE_TO = null;

	/** 第 10 List変数： l_SLIP_CD_FROM */
	public List l_SLIP_CD_FROM = null;

	/** 第 11 List変数： l_SLIP_CD_TO */
	public List l_SLIP_CD_TO = null;

	/** 第 12 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 13 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 14 List変数： l_PRINT_FLG */
	public List l_PRINT_FLG = null;

	/** 第 15 List変数： l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO */
	public List l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;

	/** 第 16 List変数： l_T_UN_SHIP_LIST__CUST_CD */
	public List l_T_UN_SHIP_LIST__CUST_CD = null;

	/** 第 17 List変数： l_M_CUST__CUST_NAME */
	public List l_M_CUST__CUST_NAME = null;

	/** 第 18 List変数： l_T_ODR_CTL__CUST_ITEM_CD */
	public List l_T_ODR_CTL__CUST_ITEM_CD = null;

	/** 第 19 List変数： l_T_UN_SHIP_LIST__ITEM_CD */
	public List l_T_UN_SHIP_LIST__ITEM_CD = null;

	/** 第 20 List変数： l_T_ODR__CUST_ODR_NO */
	public List l_T_ODR__CUST_ODR_NO = null;

	/** 第 21 List変数： l_T_UN_SHIP_LIST__UN_SHIP_QTY */
	public List l_T_UN_SHIP_LIST__UN_SHIP_QTY = null;

	/** 第 22 List変数： l_M_ITEM__STOCK_UNIT */
	public List l_M_ITEM__STOCK_UNIT = null;

	/** 第 23 List変数： l_T_UN_SHIP_LIST__WH_CD */
	public List l_T_UN_SHIP_LIST__WH_CD = null;

	/** 第 24 List変数： l_T_UN_SHIP_LIST__ACPT_ODR_CD */
	public List l_T_UN_SHIP_LIST__ACPT_ODR_CD = null;

	/** 第 25 List変数： l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO */
	public List l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;

	/** 第 26 List変数： l_T_SHIP_SLIP__SLIP_CD */
	public List l_T_SHIP_SLIP__SLIP_CD = null;

	/** 第 27 List変数： l_T_SHIP_SLIP__ITEM_CD */
	public List l_T_SHIP_SLIP__ITEM_CD = null;

	/** 第 28 List変数： l_T_SHIP_SLIP__CUST_ITEM_CD */
	public List l_T_SHIP_SLIP__CUST_ITEM_CD = null;

	/** 第 29 List変数： l_T_SHIP_SLIP__PART_NAME */
	public List l_T_SHIP_SLIP__PART_NAME = null;

	/** 第 30 List変数： l_T_SHIP_SLIP__CUST_ODR_NO */
	public List l_T_SHIP_SLIP__CUST_ODR_NO = null;

	/** 第 31 List変数： l_T_SHIP_SLIP__CUST_NAME */
	public List l_T_SHIP_SLIP__CUST_NAME = null;

	/** 第 32 List変数： l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI */
	public List l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;

	/** 第 33 List変数： l_T_SHIP_SLIP__BUYER_NAME */
	public List l_T_SHIP_SLIP__BUYER_NAME = null;

	/** 第 34 List変数： l_T_SHIP_SLIP__CUS_DLV_KEY_CD */
	public List l_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;

	/** 第 35 List変数： l_T_SHIP_SLIP__DESINATED_SHIP_DATE */
	public List l_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;

	/** 第 36 List変数： l_T_SHIP_SLIP__DESINATED_DLV_DATE */
	public List l_T_SHIP_SLIP__DESINATED_DLV_DATE = null;

	/** 第 37 List変数： l_T_SHIP_SLIP__SCDL_DLV_DATE */
	public List l_T_SHIP_SLIP__SCDL_DLV_DATE = null;

	/** 第 38 List変数： l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL */
	public List l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;

	/** 第 39 List変数： l_T_SHIP_SLIP__DLV_ODR_QTY */
	public List l_T_SHIP_SLIP__DLV_ODR_QTY = null;

	/** 第 40 List変数： l_T_SHIP_SLIP__SHIP_ODR_QTY */
	public List l_T_SHIP_SLIP__SHIP_ODR_QTY = null;

	/** 第 41 List変数： l_T_SHIP_SLIP__UNIT_CD */
	public List l_T_SHIP_SLIP__UNIT_CD = null;

	/** 第 42 List変数： l_T_SHIP_SLIP__UNIT_PRICE */
	public List l_T_SHIP_SLIP__UNIT_PRICE = null;

	/** 第 43 List変数： l_T_SHIP_SLIP__SHIP_ODR_AMOUNT */
	public List l_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;

	/** 第 44 List変数： l_T_SHIP_SLIP__TAX_AMOUNT */
	public List l_T_SHIP_SLIP__TAX_AMOUNT = null;

	/** 第 45 List変数： l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX */
	public List l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;

	/** 第 46 List変数： l_T_SHIP_SLIP__CLIENT_REMARK_KANJI */
	public List l_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;

	/** 第 47 List変数： l_T_SHIP_SLIP__CLIENT_BARCODE_INF */
	public List l_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;

	/** 第 48 List変数： l_CODE_NAME */
	public List l_CODE_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr1_PrintType() { return m_r1_PrintType; }
	public String getr2_PrintType() { return m_r2_PrintType; }
	public String getr3_PrintType() { return m_r3_PrintType; }
	public String getc_ReOut() { return m_c_ReOut; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getMIN_DESINATED_SHIP_DATE() { return m_MIN_DESINATED_SHIP_DATE; }
	public String getMAX_DESINATED_SHIP_DATE() { return m_MAX_DESINATED_SHIP_DATE; }
	public String getDESINATED_SHIP_DATE_FROM() { return m_DESINATED_SHIP_DATE_FROM; }
	public String getDESINATED_SHIP_DATE_TO() { return m_DESINATED_SHIP_DATE_TO; }
	public String getSLIP_CD_FROM() { return m_SLIP_CD_FROM; }
	public String getSLIP_CD_TO() { return m_SLIP_CD_TO; }
	public String getWH_CD() { return m_WH_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getPRINT_FLG() { return m_PRINT_FLG; }
	public String getT_UN_SHIP_LIST__UN_SHIP_SEQ_NO() { return m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO; }
	public String getT_UN_SHIP_LIST__CUST_CD() { return m_T_UN_SHIP_LIST__CUST_CD; }
	public String getM_CUST__CUST_NAME() { return m_M_CUST__CUST_NAME; }
	public String getT_ODR_CTL__CUST_ITEM_CD() { return m_T_ODR_CTL__CUST_ITEM_CD; }
	public String getT_UN_SHIP_LIST__ITEM_CD() { return m_T_UN_SHIP_LIST__ITEM_CD; }
	public String getT_ODR__CUST_ODR_NO() { return m_T_ODR__CUST_ODR_NO; }
	public String getT_UN_SHIP_LIST__UN_SHIP_QTY() { return m_T_UN_SHIP_LIST__UN_SHIP_QTY; }
	public String getM_ITEM__STOCK_UNIT() { return m_M_ITEM__STOCK_UNIT; }
	public String getT_UN_SHIP_LIST__WH_CD() { return m_T_UN_SHIP_LIST__WH_CD; }
	public String getT_UN_SHIP_LIST__ACPT_ODR_CD() { return m_T_UN_SHIP_LIST__ACPT_ODR_CD; }
	public String getT_UN_SHIP_LIST__PART_DLV_SEQ_NO() { return m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO; }
	public String getT_SHIP_SLIP__SLIP_CD() { return m_T_SHIP_SLIP__SLIP_CD; }
	public String getT_SHIP_SLIP__ITEM_CD() { return m_T_SHIP_SLIP__ITEM_CD; }
	public String getT_SHIP_SLIP__CUST_ITEM_CD() { return m_T_SHIP_SLIP__CUST_ITEM_CD; }
	public String getT_SHIP_SLIP__PART_NAME() { return m_T_SHIP_SLIP__PART_NAME; }
	public String getT_SHIP_SLIP__CUST_ODR_NO() { return m_T_SHIP_SLIP__CUST_ODR_NO; }
	public String getT_SHIP_SLIP__CUST_NAME() { return m_T_SHIP_SLIP__CUST_NAME; }
	public String getT_SHIP_SLIP__DLV_LOC_NAME_KANJI() { return m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI; }
	public String getT_SHIP_SLIP__BUYER_NAME() { return m_T_SHIP_SLIP__BUYER_NAME; }
	public String getT_SHIP_SLIP__CUS_DLV_KEY_CD() { return m_T_SHIP_SLIP__CUS_DLV_KEY_CD; }
	public String getT_SHIP_SLIP__DESINATED_SHIP_DATE() { return m_T_SHIP_SLIP__DESINATED_SHIP_DATE; }
	public String getT_SHIP_SLIP__DESINATED_DLV_DATE() { return m_T_SHIP_SLIP__DESINATED_DLV_DATE; }
	public String getT_SHIP_SLIP__SCDL_DLV_DATE() { return m_T_SHIP_SLIP__SCDL_DLV_DATE; }
	public String getT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL() { return m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL; }
	public String getT_SHIP_SLIP__DLV_ODR_QTY() { return m_T_SHIP_SLIP__DLV_ODR_QTY; }
	public String getT_SHIP_SLIP__SHIP_ODR_QTY() { return m_T_SHIP_SLIP__SHIP_ODR_QTY; }
	public String getT_SHIP_SLIP__UNIT_CD() { return m_T_SHIP_SLIP__UNIT_CD; }
	public String getT_SHIP_SLIP__UNIT_PRICE() { return m_T_SHIP_SLIP__UNIT_PRICE; }
	public String getT_SHIP_SLIP__SHIP_ODR_AMOUNT() { return m_T_SHIP_SLIP__SHIP_ODR_AMOUNT; }
	public String getT_SHIP_SLIP__TAX_AMOUNT() { return m_T_SHIP_SLIP__TAX_AMOUNT; }
	public String getT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX() { return m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX; }
	public String getT_SHIP_SLIP__CLIENT_REMARK_KANJI() { return m_T_SHIP_SLIP__CLIENT_REMARK_KANJI; }
	public String getT_SHIP_SLIP__CLIENT_BARCODE_INF() { return m_T_SHIP_SLIP__CLIENT_BARCODE_INF; }
	public String getCODE_NAME() { return m_CODE_NAME; }

	public List getList_r1_PrintType() { return l_r1_PrintType; }
	public List getList_r2_PrintType() { return l_r2_PrintType; }
	public List getList_r3_PrintType() { return l_r3_PrintType; }
	public List getList_c_ReOut() { return l_c_ReOut; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_MIN_DESINATED_SHIP_DATE() { return l_MIN_DESINATED_SHIP_DATE; }
	public List getList_MAX_DESINATED_SHIP_DATE() { return l_MAX_DESINATED_SHIP_DATE; }
	public List getList_DESINATED_SHIP_DATE_FROM() { return l_DESINATED_SHIP_DATE_FROM; }
	public List getList_DESINATED_SHIP_DATE_TO() { return l_DESINATED_SHIP_DATE_TO; }
	public List getList_SLIP_CD_FROM() { return l_SLIP_CD_FROM; }
	public List getList_SLIP_CD_TO() { return l_SLIP_CD_TO; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_PRINT_FLG() { return l_PRINT_FLG; }
	public List getList_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO() { return l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO; }
	public List getList_T_UN_SHIP_LIST__CUST_CD() { return l_T_UN_SHIP_LIST__CUST_CD; }
	public List getList_M_CUST__CUST_NAME() { return l_M_CUST__CUST_NAME; }
	public List getList_T_ODR_CTL__CUST_ITEM_CD() { return l_T_ODR_CTL__CUST_ITEM_CD; }
	public List getList_T_UN_SHIP_LIST__ITEM_CD() { return l_T_UN_SHIP_LIST__ITEM_CD; }
	public List getList_T_ODR__CUST_ODR_NO() { return l_T_ODR__CUST_ODR_NO; }
	public List getList_T_UN_SHIP_LIST__UN_SHIP_QTY() { return l_T_UN_SHIP_LIST__UN_SHIP_QTY; }
	public List getList_M_ITEM__STOCK_UNIT() { return l_M_ITEM__STOCK_UNIT; }
	public List getList_T_UN_SHIP_LIST__WH_CD() { return l_T_UN_SHIP_LIST__WH_CD; }
	public List getList_T_UN_SHIP_LIST__ACPT_ODR_CD() { return l_T_UN_SHIP_LIST__ACPT_ODR_CD; }
	public List getList_T_UN_SHIP_LIST__PART_DLV_SEQ_NO() { return l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO; }
	public List getList_T_SHIP_SLIP__SLIP_CD() { return l_T_SHIP_SLIP__SLIP_CD; }
	public List getList_T_SHIP_SLIP__ITEM_CD() { return l_T_SHIP_SLIP__ITEM_CD; }
	public List getList_T_SHIP_SLIP__CUST_ITEM_CD() { return l_T_SHIP_SLIP__CUST_ITEM_CD; }
	public List getList_T_SHIP_SLIP__PART_NAME() { return l_T_SHIP_SLIP__PART_NAME; }
	public List getList_T_SHIP_SLIP__CUST_ODR_NO() { return l_T_SHIP_SLIP__CUST_ODR_NO; }
	public List getList_T_SHIP_SLIP__CUST_NAME() { return l_T_SHIP_SLIP__CUST_NAME; }
	public List getList_T_SHIP_SLIP__DLV_LOC_NAME_KANJI() { return l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI; }
	public List getList_T_SHIP_SLIP__BUYER_NAME() { return l_T_SHIP_SLIP__BUYER_NAME; }
	public List getList_T_SHIP_SLIP__CUS_DLV_KEY_CD() { return l_T_SHIP_SLIP__CUS_DLV_KEY_CD; }
	public List getList_T_SHIP_SLIP__DESINATED_SHIP_DATE() { return l_T_SHIP_SLIP__DESINATED_SHIP_DATE; }
	public List getList_T_SHIP_SLIP__DESINATED_DLV_DATE() { return l_T_SHIP_SLIP__DESINATED_DLV_DATE; }
	public List getList_T_SHIP_SLIP__SCDL_DLV_DATE() { return l_T_SHIP_SLIP__SCDL_DLV_DATE; }
	public List getList_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL() { return l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL; }
	public List getList_T_SHIP_SLIP__DLV_ODR_QTY() { return l_T_SHIP_SLIP__DLV_ODR_QTY; }
	public List getList_T_SHIP_SLIP__SHIP_ODR_QTY() { return l_T_SHIP_SLIP__SHIP_ODR_QTY; }
	public List getList_T_SHIP_SLIP__UNIT_CD() { return l_T_SHIP_SLIP__UNIT_CD; }
	public List getList_T_SHIP_SLIP__UNIT_PRICE() { return l_T_SHIP_SLIP__UNIT_PRICE; }
	public List getList_T_SHIP_SLIP__SHIP_ODR_AMOUNT() { return l_T_SHIP_SLIP__SHIP_ODR_AMOUNT; }
	public List getList_T_SHIP_SLIP__TAX_AMOUNT() { return l_T_SHIP_SLIP__TAX_AMOUNT; }
	public List getList_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX() { return l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX; }
	public List getList_T_SHIP_SLIP__CLIENT_REMARK_KANJI() { return l_T_SHIP_SLIP__CLIENT_REMARK_KANJI; }
	public List getList_T_SHIP_SLIP__CLIENT_BARCODE_INF() { return l_T_SHIP_SLIP__CLIENT_BARCODE_INF; }
	public List getList_CODE_NAME() { return l_CODE_NAME; }

	public void setr1_PrintType(String val) { m_r1_PrintType = val; }
	public void setr2_PrintType(String val) { m_r2_PrintType = val; }
	public void setr3_PrintType(String val) { m_r3_PrintType = val; }
	public void setc_ReOut(String val) { m_c_ReOut = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setMIN_DESINATED_SHIP_DATE(String val) { m_MIN_DESINATED_SHIP_DATE = val; }
	public void setMAX_DESINATED_SHIP_DATE(String val) { m_MAX_DESINATED_SHIP_DATE = val; }
	public void setDESINATED_SHIP_DATE_FROM(String val) { m_DESINATED_SHIP_DATE_FROM = val; }
	public void setDESINATED_SHIP_DATE_TO(String val) { m_DESINATED_SHIP_DATE_TO = val; }
	public void setSLIP_CD_FROM(String val) { m_SLIP_CD_FROM = val; }
	public void setSLIP_CD_TO(String val) { m_SLIP_CD_TO = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setPRINT_FLG(String val) { m_PRINT_FLG = val; }
	public void setT_UN_SHIP_LIST__UN_SHIP_SEQ_NO(String val) { m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = val; }
	public void setT_UN_SHIP_LIST__CUST_CD(String val) { m_T_UN_SHIP_LIST__CUST_CD = val; }
	public void setM_CUST__CUST_NAME(String val) { m_M_CUST__CUST_NAME = val; }
	public void setT_ODR_CTL__CUST_ITEM_CD(String val) { m_T_ODR_CTL__CUST_ITEM_CD = val; }
	public void setT_UN_SHIP_LIST__ITEM_CD(String val) { m_T_UN_SHIP_LIST__ITEM_CD = val; }
	public void setT_ODR__CUST_ODR_NO(String val) { m_T_ODR__CUST_ODR_NO = val; }
	public void setT_UN_SHIP_LIST__UN_SHIP_QTY(String val) { m_T_UN_SHIP_LIST__UN_SHIP_QTY = val; }
	public void setM_ITEM__STOCK_UNIT(String val) { m_M_ITEM__STOCK_UNIT = val; }
	public void setT_UN_SHIP_LIST__WH_CD(String val) { m_T_UN_SHIP_LIST__WH_CD = val; }
	public void setT_UN_SHIP_LIST__ACPT_ODR_CD(String val) { m_T_UN_SHIP_LIST__ACPT_ODR_CD = val; }
	public void setT_UN_SHIP_LIST__PART_DLV_SEQ_NO(String val) { m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = val; }
	public void setT_SHIP_SLIP__SLIP_CD(String val) { m_T_SHIP_SLIP__SLIP_CD = val; }
	public void setT_SHIP_SLIP__ITEM_CD(String val) { m_T_SHIP_SLIP__ITEM_CD = val; }
	public void setT_SHIP_SLIP__CUST_ITEM_CD(String val) { m_T_SHIP_SLIP__CUST_ITEM_CD = val; }
	public void setT_SHIP_SLIP__PART_NAME(String val) { m_T_SHIP_SLIP__PART_NAME = val; }
	public void setT_SHIP_SLIP__CUST_ODR_NO(String val) { m_T_SHIP_SLIP__CUST_ODR_NO = val; }
	public void setT_SHIP_SLIP__CUST_NAME(String val) { m_T_SHIP_SLIP__CUST_NAME = val; }
	public void setT_SHIP_SLIP__DLV_LOC_NAME_KANJI(String val) { m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = val; }
	public void setT_SHIP_SLIP__BUYER_NAME(String val) { m_T_SHIP_SLIP__BUYER_NAME = val; }
	public void setT_SHIP_SLIP__CUS_DLV_KEY_CD(String val) { m_T_SHIP_SLIP__CUS_DLV_KEY_CD = val; }
	public void setT_SHIP_SLIP__DESINATED_SHIP_DATE(String val) { m_T_SHIP_SLIP__DESINATED_SHIP_DATE = val; }
	public void setT_SHIP_SLIP__DESINATED_DLV_DATE(String val) { m_T_SHIP_SLIP__DESINATED_DLV_DATE = val; }
	public void setT_SHIP_SLIP__SCDL_DLV_DATE(String val) { m_T_SHIP_SLIP__SCDL_DLV_DATE = val; }
	public void setT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(String val) { m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = val; }
	public void setT_SHIP_SLIP__DLV_ODR_QTY(String val) { m_T_SHIP_SLIP__DLV_ODR_QTY = val; }
	public void setT_SHIP_SLIP__SHIP_ODR_QTY(String val) { m_T_SHIP_SLIP__SHIP_ODR_QTY = val; }
	public void setT_SHIP_SLIP__UNIT_CD(String val) { m_T_SHIP_SLIP__UNIT_CD = val; }
	public void setT_SHIP_SLIP__UNIT_PRICE(String val) { m_T_SHIP_SLIP__UNIT_PRICE = val; }
	public void setT_SHIP_SLIP__SHIP_ODR_AMOUNT(String val) { m_T_SHIP_SLIP__SHIP_ODR_AMOUNT = val; }
	public void setT_SHIP_SLIP__TAX_AMOUNT(String val) { m_T_SHIP_SLIP__TAX_AMOUNT = val; }
	public void setT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(String val) { m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = val; }
	public void setT_SHIP_SLIP__CLIENT_REMARK_KANJI(String val) { m_T_SHIP_SLIP__CLIENT_REMARK_KANJI = val; }
	public void setT_SHIP_SLIP__CLIENT_BARCODE_INF(String val) { m_T_SHIP_SLIP__CLIENT_BARCODE_INF = val; }
	public void setCODE_NAME(String val) { m_CODE_NAME = val; }


	public void setList_r1_PrintType(List list) { l_r1_PrintType = list; }
	public void setList_r2_PrintType(List list) { l_r2_PrintType = list; }
	public void setList_r3_PrintType(List list) { l_r3_PrintType = list; }
	public void setList_c_ReOut(List list) { l_c_ReOut = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_MIN_DESINATED_SHIP_DATE(List list) { l_MIN_DESINATED_SHIP_DATE = list; }
	public void setList_MAX_DESINATED_SHIP_DATE(List list) { l_MAX_DESINATED_SHIP_DATE = list; }
	public void setList_DESINATED_SHIP_DATE_FROM(List list) { l_DESINATED_SHIP_DATE_FROM = list; }
	public void setList_DESINATED_SHIP_DATE_TO(List list) { l_DESINATED_SHIP_DATE_TO = list; }
	public void setList_SLIP_CD_FROM(List list) { l_SLIP_CD_FROM = list; }
	public void setList_SLIP_CD_TO(List list) { l_SLIP_CD_TO = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_PRINT_FLG(List list) { l_PRINT_FLG = list; }
	public void setList_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO(List list) { l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = list; }
	public void setList_T_UN_SHIP_LIST__CUST_CD(List list) { l_T_UN_SHIP_LIST__CUST_CD = list; }
	public void setList_M_CUST__CUST_NAME(List list) { l_M_CUST__CUST_NAME = list; }
	public void setList_T_ODR_CTL__CUST_ITEM_CD(List list) { l_T_ODR_CTL__CUST_ITEM_CD = list; }
	public void setList_T_UN_SHIP_LIST__ITEM_CD(List list) { l_T_UN_SHIP_LIST__ITEM_CD = list; }
	public void setList_T_ODR__CUST_ODR_NO(List list) { l_T_ODR__CUST_ODR_NO = list; }
	public void setList_T_UN_SHIP_LIST__UN_SHIP_QTY(List list) { l_T_UN_SHIP_LIST__UN_SHIP_QTY = list; }
	public void setList_M_ITEM__STOCK_UNIT(List list) { l_M_ITEM__STOCK_UNIT = list; }
	public void setList_T_UN_SHIP_LIST__WH_CD(List list) { l_T_UN_SHIP_LIST__WH_CD = list; }
	public void setList_T_UN_SHIP_LIST__ACPT_ODR_CD(List list) { l_T_UN_SHIP_LIST__ACPT_ODR_CD = list; }
	public void setList_T_UN_SHIP_LIST__PART_DLV_SEQ_NO(List list) { l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = list; }
	public void setList_T_SHIP_SLIP__SLIP_CD(List list) { l_T_SHIP_SLIP__SLIP_CD = list; }
	public void setList_T_SHIP_SLIP__ITEM_CD(List list) { l_T_SHIP_SLIP__ITEM_CD = list; }
	public void setList_T_SHIP_SLIP__CUST_ITEM_CD(List list) { l_T_SHIP_SLIP__CUST_ITEM_CD = list; }
	public void setList_T_SHIP_SLIP__PART_NAME(List list) { l_T_SHIP_SLIP__PART_NAME = list; }
	public void setList_T_SHIP_SLIP__CUST_ODR_NO(List list) { l_T_SHIP_SLIP__CUST_ODR_NO = list; }
	public void setList_T_SHIP_SLIP__CUST_NAME(List list) { l_T_SHIP_SLIP__CUST_NAME = list; }
	public void setList_T_SHIP_SLIP__DLV_LOC_NAME_KANJI(List list) { l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = list; }
	public void setList_T_SHIP_SLIP__BUYER_NAME(List list) { l_T_SHIP_SLIP__BUYER_NAME = list; }
	public void setList_T_SHIP_SLIP__CUS_DLV_KEY_CD(List list) { l_T_SHIP_SLIP__CUS_DLV_KEY_CD = list; }
	public void setList_T_SHIP_SLIP__DESINATED_SHIP_DATE(List list) { l_T_SHIP_SLIP__DESINATED_SHIP_DATE = list; }
	public void setList_T_SHIP_SLIP__DESINATED_DLV_DATE(List list) { l_T_SHIP_SLIP__DESINATED_DLV_DATE = list; }
	public void setList_T_SHIP_SLIP__SCDL_DLV_DATE(List list) { l_T_SHIP_SLIP__SCDL_DLV_DATE = list; }
	public void setList_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(List list) { l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = list; }
	public void setList_T_SHIP_SLIP__DLV_ODR_QTY(List list) { l_T_SHIP_SLIP__DLV_ODR_QTY = list; }
	public void setList_T_SHIP_SLIP__SHIP_ODR_QTY(List list) { l_T_SHIP_SLIP__SHIP_ODR_QTY = list; }
	public void setList_T_SHIP_SLIP__UNIT_CD(List list) { l_T_SHIP_SLIP__UNIT_CD = list; }
	public void setList_T_SHIP_SLIP__UNIT_PRICE(List list) { l_T_SHIP_SLIP__UNIT_PRICE = list; }
	public void setList_T_SHIP_SLIP__SHIP_ODR_AMOUNT(List list) { l_T_SHIP_SLIP__SHIP_ODR_AMOUNT = list; }
	public void setList_T_SHIP_SLIP__TAX_AMOUNT(List list) { l_T_SHIP_SLIP__TAX_AMOUNT = list; }
	public void setList_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(List list) { l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = list; }
	public void setList_T_SHIP_SLIP__CLIENT_REMARK_KANJI(List list) { l_T_SHIP_SLIP__CLIENT_REMARK_KANJI = list; }
	public void setList_T_SHIP_SLIP__CLIENT_BARCODE_INF(List list) { l_T_SHIP_SLIP__CLIENT_BARCODE_INF = list; }
	public void setList_CODE_NAME(List list) { l_CODE_NAME = list; }

	public int setL2L_r1_PrintType(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_PrintType == null) {
			l_r1_PrintType = new ArrayList();
		} else {
			l_r1_PrintType.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_PrintType.add(((KU0020010Struct) list.get(i)).getr1_PrintType());
		}
		return size;
	}
	public int setL2L_r2_PrintType(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_PrintType == null) {
			l_r2_PrintType = new ArrayList();
		} else {
			l_r2_PrintType.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_PrintType.add(((KU0020010Struct) list.get(i)).getr2_PrintType());
		}
		return size;
	}
	public int setL2L_r3_PrintType(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_PrintType == null) {
			l_r3_PrintType = new ArrayList();
		} else {
			l_r3_PrintType.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_PrintType.add(((KU0020010Struct) list.get(i)).getr3_PrintType());
		}
		return size;
	}
	public int setL2L_c_ReOut(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ReOut == null) {
			l_c_ReOut = new ArrayList();
		} else {
			l_c_ReOut.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ReOut.add(((KU0020010Struct) list.get(i)).getc_ReOut());
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
			l_DOWNLOAD_FILE.add(((KU0020010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_MIN_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_DESINATED_SHIP_DATE == null) {
			l_MIN_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_MIN_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_DESINATED_SHIP_DATE.add(((KU0020010Struct) list.get(i)).getMIN_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_MAX_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_DESINATED_SHIP_DATE == null) {
			l_MAX_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_MAX_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_DESINATED_SHIP_DATE.add(((KU0020010Struct) list.get(i)).getMAX_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_DESINATED_SHIP_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_SHIP_DATE_FROM == null) {
			l_DESINATED_SHIP_DATE_FROM = new ArrayList();
		} else {
			l_DESINATED_SHIP_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_SHIP_DATE_FROM.add(((KU0020010Struct) list.get(i)).getDESINATED_SHIP_DATE_FROM());
		}
		return size;
	}
	public int setL2L_DESINATED_SHIP_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_SHIP_DATE_TO == null) {
			l_DESINATED_SHIP_DATE_TO = new ArrayList();
		} else {
			l_DESINATED_SHIP_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_SHIP_DATE_TO.add(((KU0020010Struct) list.get(i)).getDESINATED_SHIP_DATE_TO());
		}
		return size;
	}
	public int setL2L_SLIP_CD_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CD_FROM == null) {
			l_SLIP_CD_FROM = new ArrayList();
		} else {
			l_SLIP_CD_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CD_FROM.add(((KU0020010Struct) list.get(i)).getSLIP_CD_FROM());
		}
		return size;
	}
	public int setL2L_SLIP_CD_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CD_TO == null) {
			l_SLIP_CD_TO = new ArrayList();
		} else {
			l_SLIP_CD_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CD_TO.add(((KU0020010Struct) list.get(i)).getSLIP_CD_TO());
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
			l_WH_CD.add(((KU0020010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CD == null) {
			l_CUST_CD = new ArrayList();
		} else {
			l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CD.add(((KU0020010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_FLG == null) {
			l_PRINT_FLG = new ArrayList();
		} else {
			l_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_FLG.add(((KU0020010Struct) list.get(i)).getPRINT_FLG());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO == null) {
			l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__UN_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__CUST_CD == null) {
			l_T_UN_SHIP_LIST__CUST_CD = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__CUST_CD.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__CUST_CD());
		}
		return size;
	}
	public int setL2L_M_CUST__CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CUST__CUST_NAME == null) {
			l_M_CUST__CUST_NAME = new ArrayList();
		} else {
			l_M_CUST__CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CUST__CUST_NAME.add(((KU0020010Struct) list.get(i)).getM_CUST__CUST_NAME());
		}
		return size;
	}
	public int setL2L_T_ODR_CTL__CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ODR_CTL__CUST_ITEM_CD == null) {
			l_T_ODR_CTL__CUST_ITEM_CD = new ArrayList();
		} else {
			l_T_ODR_CTL__CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ODR_CTL__CUST_ITEM_CD.add(((KU0020010Struct) list.get(i)).getT_ODR_CTL__CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__ITEM_CD == null) {
			l_T_UN_SHIP_LIST__ITEM_CD = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__ITEM_CD.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__ITEM_CD());
		}
		return size;
	}
	public int setL2L_T_ODR__CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ODR__CUST_ODR_NO == null) {
			l_T_ODR__CUST_ODR_NO = new ArrayList();
		} else {
			l_T_ODR__CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ODR__CUST_ODR_NO.add(((KU0020010Struct) list.get(i)).getT_ODR__CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__UN_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__UN_SHIP_QTY == null) {
			l_T_UN_SHIP_LIST__UN_SHIP_QTY = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__UN_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__UN_SHIP_QTY.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__UN_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_M_ITEM__STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__STOCK_UNIT == null) {
			l_M_ITEM__STOCK_UNIT = new ArrayList();
		} else {
			l_M_ITEM__STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__STOCK_UNIT.add(((KU0020010Struct) list.get(i)).getM_ITEM__STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__WH_CD == null) {
			l_T_UN_SHIP_LIST__WH_CD = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__WH_CD.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__WH_CD());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__ACPT_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__ACPT_ODR_CD == null) {
			l_T_UN_SHIP_LIST__ACPT_ODR_CD = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__ACPT_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__ACPT_ODR_CD.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__ACPT_ODR_CD());
		}
		return size;
	}
	public int setL2L_T_UN_SHIP_LIST__PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO == null) {
			l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO.add(((KU0020010Struct) list.get(i)).getT_UN_SHIP_LIST__PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__SLIP_CD == null) {
			l_T_SHIP_SLIP__SLIP_CD = new ArrayList();
		} else {
			l_T_SHIP_SLIP__SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__SLIP_CD.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__SLIP_CD());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__ITEM_CD == null) {
			l_T_SHIP_SLIP__ITEM_CD = new ArrayList();
		} else {
			l_T_SHIP_SLIP__ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__ITEM_CD.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__ITEM_CD());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CUST_ITEM_CD == null) {
			l_T_SHIP_SLIP__CUST_ITEM_CD = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CUST_ITEM_CD.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__PART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__PART_NAME == null) {
			l_T_SHIP_SLIP__PART_NAME = new ArrayList();
		} else {
			l_T_SHIP_SLIP__PART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__PART_NAME.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__PART_NAME());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CUST_ODR_NO == null) {
			l_T_SHIP_SLIP__CUST_ODR_NO = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CUST_ODR_NO.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CUST_NAME == null) {
			l_T_SHIP_SLIP__CUST_NAME = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CUST_NAME.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CUST_NAME());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI == null) {
			l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__DLV_LOC_NAME_KANJI());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__BUYER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__BUYER_NAME == null) {
			l_T_SHIP_SLIP__BUYER_NAME = new ArrayList();
		} else {
			l_T_SHIP_SLIP__BUYER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__BUYER_NAME.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__BUYER_NAME());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CUS_DLV_KEY_CD == null) {
			l_T_SHIP_SLIP__CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CUS_DLV_KEY_CD.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__DESINATED_SHIP_DATE == null) {
			l_T_SHIP_SLIP__DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_T_SHIP_SLIP__DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__DESINATED_SHIP_DATE.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__DESINATED_DLV_DATE == null) {
			l_T_SHIP_SLIP__DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_T_SHIP_SLIP__DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__DESINATED_DLV_DATE.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__SCDL_DLV_DATE == null) {
			l_T_SHIP_SLIP__SCDL_DLV_DATE = new ArrayList();
		} else {
			l_T_SHIP_SLIP__SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__SCDL_DLV_DATE.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL == null) {
			l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = new ArrayList();
		} else {
			l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__DLV_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__DLV_ODR_QTY == null) {
			l_T_SHIP_SLIP__DLV_ODR_QTY = new ArrayList();
		} else {
			l_T_SHIP_SLIP__DLV_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__DLV_ODR_QTY.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__DLV_ODR_QTY());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__SHIP_ODR_QTY == null) {
			l_T_SHIP_SLIP__SHIP_ODR_QTY = new ArrayList();
		} else {
			l_T_SHIP_SLIP__SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__SHIP_ODR_QTY.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__UNIT_CD == null) {
			l_T_SHIP_SLIP__UNIT_CD = new ArrayList();
		} else {
			l_T_SHIP_SLIP__UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__UNIT_CD.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__UNIT_CD());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__UNIT_PRICE == null) {
			l_T_SHIP_SLIP__UNIT_PRICE = new ArrayList();
		} else {
			l_T_SHIP_SLIP__UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__UNIT_PRICE.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__SHIP_ODR_AMOUNT == null) {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__TAX_AMOUNT == null) {
			l_T_SHIP_SLIP__TAX_AMOUNT = new ArrayList();
		} else {
			l_T_SHIP_SLIP__TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__TAX_AMOUNT.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX == null) {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = new ArrayList();
		} else {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CLIENT_REMARK_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CLIENT_REMARK_KANJI == null) {
			l_T_SHIP_SLIP__CLIENT_REMARK_KANJI = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CLIENT_REMARK_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CLIENT_REMARK_KANJI.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CLIENT_REMARK_KANJI());
		}
		return size;
	}
	public int setL2L_T_SHIP_SLIP__CLIENT_BARCODE_INF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_SHIP_SLIP__CLIENT_BARCODE_INF == null) {
			l_T_SHIP_SLIP__CLIENT_BARCODE_INF = new ArrayList();
		} else {
			l_T_SHIP_SLIP__CLIENT_BARCODE_INF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_SHIP_SLIP__CLIENT_BARCODE_INF.add(((KU0020010Struct) list.get(i)).getT_SHIP_SLIP__CLIENT_BARCODE_INF());
		}
		return size;
	}
	public int setL2L_CODE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CODE_NAME == null) {
			l_CODE_NAME = new ArrayList();
		} else {
			l_CODE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CODE_NAME.add(((KU0020010Struct) list.get(i)).getCODE_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_PrintType = null;
		m_r2_PrintType = null;
		m_r3_PrintType = null;
		m_c_ReOut = null;
		m_DOWNLOAD_FILE = null;
		m_MIN_DESINATED_SHIP_DATE = null;
		m_MAX_DESINATED_SHIP_DATE = null;
		m_DESINATED_SHIP_DATE_FROM = null;
		m_DESINATED_SHIP_DATE_TO = null;
		m_SLIP_CD_FROM = null;
		m_SLIP_CD_TO = null;
		m_WH_CD = null;
		m_CUST_CD = null;
		m_PRINT_FLG = null;
		m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;
		m_T_UN_SHIP_LIST__CUST_CD = null;
		m_M_CUST__CUST_NAME = null;
		m_T_ODR_CTL__CUST_ITEM_CD = null;
		m_T_UN_SHIP_LIST__ITEM_CD = null;
		m_T_ODR__CUST_ODR_NO = null;
		m_T_UN_SHIP_LIST__UN_SHIP_QTY = null;
		m_M_ITEM__STOCK_UNIT = null;
		m_T_UN_SHIP_LIST__WH_CD = null;
		m_T_UN_SHIP_LIST__ACPT_ODR_CD = null;
		m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;
		m_T_SHIP_SLIP__SLIP_CD = null;
		m_T_SHIP_SLIP__ITEM_CD = null;
		m_T_SHIP_SLIP__CUST_ITEM_CD = null;
		m_T_SHIP_SLIP__PART_NAME = null;
		m_T_SHIP_SLIP__CUST_ODR_NO = null;
		m_T_SHIP_SLIP__CUST_NAME = null;
		m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;
		m_T_SHIP_SLIP__BUYER_NAME = null;
		m_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;
		m_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;
		m_T_SHIP_SLIP__DESINATED_DLV_DATE = null;
		m_T_SHIP_SLIP__SCDL_DLV_DATE = null;
		m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;
		m_T_SHIP_SLIP__DLV_ODR_QTY = null;
		m_T_SHIP_SLIP__SHIP_ODR_QTY = null;
		m_T_SHIP_SLIP__UNIT_CD = null;
		m_T_SHIP_SLIP__UNIT_PRICE = null;
		m_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;
		m_T_SHIP_SLIP__TAX_AMOUNT = null;
		m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;
		m_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;
		m_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;
		m_CODE_NAME = null;

		l_r1_PrintType = null;
		l_r2_PrintType = null;
		l_r3_PrintType = null;
		l_c_ReOut = null;
		l_DOWNLOAD_FILE = null;
		l_MIN_DESINATED_SHIP_DATE = null;
		l_MAX_DESINATED_SHIP_DATE = null;
		l_DESINATED_SHIP_DATE_FROM = null;
		l_DESINATED_SHIP_DATE_TO = null;
		l_SLIP_CD_FROM = null;
		l_SLIP_CD_TO = null;
		l_WH_CD = null;
		l_CUST_CD = null;
		l_PRINT_FLG = null;
		l_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;
		l_T_UN_SHIP_LIST__CUST_CD = null;
		l_M_CUST__CUST_NAME = null;
		l_T_ODR_CTL__CUST_ITEM_CD = null;
		l_T_UN_SHIP_LIST__ITEM_CD = null;
		l_T_ODR__CUST_ODR_NO = null;
		l_T_UN_SHIP_LIST__UN_SHIP_QTY = null;
		l_M_ITEM__STOCK_UNIT = null;
		l_T_UN_SHIP_LIST__WH_CD = null;
		l_T_UN_SHIP_LIST__ACPT_ODR_CD = null;
		l_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;
		l_T_SHIP_SLIP__SLIP_CD = null;
		l_T_SHIP_SLIP__ITEM_CD = null;
		l_T_SHIP_SLIP__CUST_ITEM_CD = null;
		l_T_SHIP_SLIP__PART_NAME = null;
		l_T_SHIP_SLIP__CUST_ODR_NO = null;
		l_T_SHIP_SLIP__CUST_NAME = null;
		l_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;
		l_T_SHIP_SLIP__BUYER_NAME = null;
		l_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;
		l_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;
		l_T_SHIP_SLIP__DESINATED_DLV_DATE = null;
		l_T_SHIP_SLIP__SCDL_DLV_DATE = null;
		l_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;
		l_T_SHIP_SLIP__DLV_ODR_QTY = null;
		l_T_SHIP_SLIP__SHIP_ODR_QTY = null;
		l_T_SHIP_SLIP__UNIT_CD = null;
		l_T_SHIP_SLIP__UNIT_PRICE = null;
		l_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;
		l_T_SHIP_SLIP__TAX_AMOUNT = null;
		l_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;
		l_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;
		l_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;
		l_CODE_NAME = null;

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
	 * medKU0020010クラスの標準コンストラクタ
	 */
	public KU0020010Struct()
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
	public void setStruct(KU0020010Struct struct)
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
	public void setStructM(KU0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_PrintType(struct.getr1_PrintType());
			this.setr2_PrintType(struct.getr2_PrintType());
			this.setr3_PrintType(struct.getr3_PrintType());
			this.setc_ReOut(struct.getc_ReOut());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setMIN_DESINATED_SHIP_DATE(struct.getMIN_DESINATED_SHIP_DATE());
			this.setMAX_DESINATED_SHIP_DATE(struct.getMAX_DESINATED_SHIP_DATE());
			this.setDESINATED_SHIP_DATE_FROM(struct.getDESINATED_SHIP_DATE_FROM());
			this.setDESINATED_SHIP_DATE_TO(struct.getDESINATED_SHIP_DATE_TO());
			this.setSLIP_CD_FROM(struct.getSLIP_CD_FROM());
			this.setSLIP_CD_TO(struct.getSLIP_CD_TO());
			this.setWH_CD(struct.getWH_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setPRINT_FLG(struct.getPRINT_FLG());
			this.setT_UN_SHIP_LIST__UN_SHIP_SEQ_NO(struct.getT_UN_SHIP_LIST__UN_SHIP_SEQ_NO());
			this.setT_UN_SHIP_LIST__CUST_CD(struct.getT_UN_SHIP_LIST__CUST_CD());
			this.setM_CUST__CUST_NAME(struct.getM_CUST__CUST_NAME());
			this.setT_ODR_CTL__CUST_ITEM_CD(struct.getT_ODR_CTL__CUST_ITEM_CD());
			this.setT_UN_SHIP_LIST__ITEM_CD(struct.getT_UN_SHIP_LIST__ITEM_CD());
			this.setT_ODR__CUST_ODR_NO(struct.getT_ODR__CUST_ODR_NO());
			this.setT_UN_SHIP_LIST__UN_SHIP_QTY(struct.getT_UN_SHIP_LIST__UN_SHIP_QTY());
			this.setM_ITEM__STOCK_UNIT(struct.getM_ITEM__STOCK_UNIT());
			this.setT_UN_SHIP_LIST__WH_CD(struct.getT_UN_SHIP_LIST__WH_CD());
			this.setT_UN_SHIP_LIST__ACPT_ODR_CD(struct.getT_UN_SHIP_LIST__ACPT_ODR_CD());
			this.setT_UN_SHIP_LIST__PART_DLV_SEQ_NO(struct.getT_UN_SHIP_LIST__PART_DLV_SEQ_NO());
			this.setT_SHIP_SLIP__SLIP_CD(struct.getT_SHIP_SLIP__SLIP_CD());
			this.setT_SHIP_SLIP__ITEM_CD(struct.getT_SHIP_SLIP__ITEM_CD());
			this.setT_SHIP_SLIP__CUST_ITEM_CD(struct.getT_SHIP_SLIP__CUST_ITEM_CD());
			this.setT_SHIP_SLIP__PART_NAME(struct.getT_SHIP_SLIP__PART_NAME());
			this.setT_SHIP_SLIP__CUST_ODR_NO(struct.getT_SHIP_SLIP__CUST_ODR_NO());
			this.setT_SHIP_SLIP__CUST_NAME(struct.getT_SHIP_SLIP__CUST_NAME());
			this.setT_SHIP_SLIP__DLV_LOC_NAME_KANJI(struct.getT_SHIP_SLIP__DLV_LOC_NAME_KANJI());
			this.setT_SHIP_SLIP__BUYER_NAME(struct.getT_SHIP_SLIP__BUYER_NAME());
			this.setT_SHIP_SLIP__CUS_DLV_KEY_CD(struct.getT_SHIP_SLIP__CUS_DLV_KEY_CD());
			this.setT_SHIP_SLIP__DESINATED_SHIP_DATE(struct.getT_SHIP_SLIP__DESINATED_SHIP_DATE());
			this.setT_SHIP_SLIP__DESINATED_DLV_DATE(struct.getT_SHIP_SLIP__DESINATED_DLV_DATE());
			this.setT_SHIP_SLIP__SCDL_DLV_DATE(struct.getT_SHIP_SLIP__SCDL_DLV_DATE());
			this.setT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(struct.getT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL());
			this.setT_SHIP_SLIP__DLV_ODR_QTY(struct.getT_SHIP_SLIP__DLV_ODR_QTY());
			this.setT_SHIP_SLIP__SHIP_ODR_QTY(struct.getT_SHIP_SLIP__SHIP_ODR_QTY());
			this.setT_SHIP_SLIP__UNIT_CD(struct.getT_SHIP_SLIP__UNIT_CD());
			this.setT_SHIP_SLIP__UNIT_PRICE(struct.getT_SHIP_SLIP__UNIT_PRICE());
			this.setT_SHIP_SLIP__SHIP_ODR_AMOUNT(struct.getT_SHIP_SLIP__SHIP_ODR_AMOUNT());
			this.setT_SHIP_SLIP__TAX_AMOUNT(struct.getT_SHIP_SLIP__TAX_AMOUNT());
			this.setT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(struct.getT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX());
			this.setT_SHIP_SLIP__CLIENT_REMARK_KANJI(struct.getT_SHIP_SLIP__CLIENT_REMARK_KANJI());
			this.setT_SHIP_SLIP__CLIENT_BARCODE_INF(struct.getT_SHIP_SLIP__CLIENT_BARCODE_INF());
			this.setCODE_NAME(struct.getCODE_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KU0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_PrintType(struct.getList_r1_PrintType());
			this.setList_r2_PrintType(struct.getList_r2_PrintType());
			this.setList_r3_PrintType(struct.getList_r3_PrintType());
			this.setList_c_ReOut(struct.getList_c_ReOut());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_MIN_DESINATED_SHIP_DATE(struct.getList_MIN_DESINATED_SHIP_DATE());
			this.setList_MAX_DESINATED_SHIP_DATE(struct.getList_MAX_DESINATED_SHIP_DATE());
			this.setList_DESINATED_SHIP_DATE_FROM(struct.getList_DESINATED_SHIP_DATE_FROM());
			this.setList_DESINATED_SHIP_DATE_TO(struct.getList_DESINATED_SHIP_DATE_TO());
			this.setList_SLIP_CD_FROM(struct.getList_SLIP_CD_FROM());
			this.setList_SLIP_CD_TO(struct.getList_SLIP_CD_TO());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_PRINT_FLG(struct.getList_PRINT_FLG());
			this.setList_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO(struct.getList_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO());
			this.setList_T_UN_SHIP_LIST__CUST_CD(struct.getList_T_UN_SHIP_LIST__CUST_CD());
			this.setList_M_CUST__CUST_NAME(struct.getList_M_CUST__CUST_NAME());
			this.setList_T_ODR_CTL__CUST_ITEM_CD(struct.getList_T_ODR_CTL__CUST_ITEM_CD());
			this.setList_T_UN_SHIP_LIST__ITEM_CD(struct.getList_T_UN_SHIP_LIST__ITEM_CD());
			this.setList_T_ODR__CUST_ODR_NO(struct.getList_T_ODR__CUST_ODR_NO());
			this.setList_T_UN_SHIP_LIST__UN_SHIP_QTY(struct.getList_T_UN_SHIP_LIST__UN_SHIP_QTY());
			this.setList_M_ITEM__STOCK_UNIT(struct.getList_M_ITEM__STOCK_UNIT());
			this.setList_T_UN_SHIP_LIST__WH_CD(struct.getList_T_UN_SHIP_LIST__WH_CD());
			this.setList_T_UN_SHIP_LIST__ACPT_ODR_CD(struct.getList_T_UN_SHIP_LIST__ACPT_ODR_CD());
			this.setList_T_UN_SHIP_LIST__PART_DLV_SEQ_NO(struct.getList_T_UN_SHIP_LIST__PART_DLV_SEQ_NO());
			this.setList_T_SHIP_SLIP__SLIP_CD(struct.getList_T_SHIP_SLIP__SLIP_CD());
			this.setList_T_SHIP_SLIP__ITEM_CD(struct.getList_T_SHIP_SLIP__ITEM_CD());
			this.setList_T_SHIP_SLIP__CUST_ITEM_CD(struct.getList_T_SHIP_SLIP__CUST_ITEM_CD());
			this.setList_T_SHIP_SLIP__PART_NAME(struct.getList_T_SHIP_SLIP__PART_NAME());
			this.setList_T_SHIP_SLIP__CUST_ODR_NO(struct.getList_T_SHIP_SLIP__CUST_ODR_NO());
			this.setList_T_SHIP_SLIP__CUST_NAME(struct.getList_T_SHIP_SLIP__CUST_NAME());
			this.setList_T_SHIP_SLIP__DLV_LOC_NAME_KANJI(struct.getList_T_SHIP_SLIP__DLV_LOC_NAME_KANJI());
			this.setList_T_SHIP_SLIP__BUYER_NAME(struct.getList_T_SHIP_SLIP__BUYER_NAME());
			this.setList_T_SHIP_SLIP__CUS_DLV_KEY_CD(struct.getList_T_SHIP_SLIP__CUS_DLV_KEY_CD());
			this.setList_T_SHIP_SLIP__DESINATED_SHIP_DATE(struct.getList_T_SHIP_SLIP__DESINATED_SHIP_DATE());
			this.setList_T_SHIP_SLIP__DESINATED_DLV_DATE(struct.getList_T_SHIP_SLIP__DESINATED_DLV_DATE());
			this.setList_T_SHIP_SLIP__SCDL_DLV_DATE(struct.getList_T_SHIP_SLIP__SCDL_DLV_DATE());
			this.setList_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(struct.getList_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL());
			this.setList_T_SHIP_SLIP__DLV_ODR_QTY(struct.getList_T_SHIP_SLIP__DLV_ODR_QTY());
			this.setList_T_SHIP_SLIP__SHIP_ODR_QTY(struct.getList_T_SHIP_SLIP__SHIP_ODR_QTY());
			this.setList_T_SHIP_SLIP__UNIT_CD(struct.getList_T_SHIP_SLIP__UNIT_CD());
			this.setList_T_SHIP_SLIP__UNIT_PRICE(struct.getList_T_SHIP_SLIP__UNIT_PRICE());
			this.setList_T_SHIP_SLIP__SHIP_ODR_AMOUNT(struct.getList_T_SHIP_SLIP__SHIP_ODR_AMOUNT());
			this.setList_T_SHIP_SLIP__TAX_AMOUNT(struct.getList_T_SHIP_SLIP__TAX_AMOUNT());
			this.setList_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(struct.getList_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX());
			this.setList_T_SHIP_SLIP__CLIENT_REMARK_KANJI(struct.getList_T_SHIP_SLIP__CLIENT_REMARK_KANJI());
			this.setList_T_SHIP_SLIP__CLIENT_BARCODE_INF(struct.getList_T_SHIP_SLIP__CLIENT_BARCODE_INF());
			this.setList_CODE_NAME(struct.getList_CODE_NAME());
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
	// 第 1 変数初期値： i_r1_PrintType


	final static String i_r1_PrintType = null;

	// 第 2 変数初期値： i_r2_PrintType


	final static String i_r2_PrintType = null;

	// 第 3 変数初期値： i_r3_PrintType


	final static String i_r3_PrintType = null;

	// 第 4 変数初期値： i_c_ReOut


	final static String i_c_ReOut = null;

	// 第 5 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 6 変数初期値： i_MIN_DESINATED_SHIP_DATE


	final static String i_MIN_DESINATED_SHIP_DATE = null;

	// 第 7 変数初期値： i_MAX_DESINATED_SHIP_DATE


	final static String i_MAX_DESINATED_SHIP_DATE = null;

	// 第 8 変数初期値： i_DESINATED_SHIP_DATE_FROM


	final static String i_DESINATED_SHIP_DATE_FROM = null;

	// 第 9 変数初期値： i_DESINATED_SHIP_DATE_TO


	final static String i_DESINATED_SHIP_DATE_TO = null;

	// 第 10 変数初期値： i_SLIP_CD_FROM


	final static String i_SLIP_CD_FROM = null;

	// 第 11 変数初期値： i_SLIP_CD_TO


	final static String i_SLIP_CD_TO = null;

	// 第 12 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 13 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 14 変数初期値： i_PRINT_FLG


	final static String i_PRINT_FLG = null;

	// 第 15 変数初期値： i_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO


	final static String i_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;

	// 第 16 変数初期値： i_T_UN_SHIP_LIST__CUST_CD


	final static String i_T_UN_SHIP_LIST__CUST_CD = null;

	// 第 17 変数初期値： i_M_CUST__CUST_NAME


	final static String i_M_CUST__CUST_NAME = null;

	// 第 18 変数初期値： i_T_ODR_CTL__CUST_ITEM_CD


	final static String i_T_ODR_CTL__CUST_ITEM_CD = null;

	// 第 19 変数初期値： i_T_UN_SHIP_LIST__ITEM_CD


	final static String i_T_UN_SHIP_LIST__ITEM_CD = null;

	// 第 20 変数初期値： i_T_ODR__CUST_ODR_NO


	final static String i_T_ODR__CUST_ODR_NO = null;

	// 第 21 変数初期値： i_T_UN_SHIP_LIST__UN_SHIP_QTY


	final static String i_T_UN_SHIP_LIST__UN_SHIP_QTY = null;

	// 第 22 変数初期値： i_M_ITEM__STOCK_UNIT


	final static String i_M_ITEM__STOCK_UNIT = null;

	// 第 23 変数初期値： i_T_UN_SHIP_LIST__WH_CD


	final static String i_T_UN_SHIP_LIST__WH_CD = null;

	// 第 24 変数初期値： i_T_UN_SHIP_LIST__ACPT_ODR_CD


	final static String i_T_UN_SHIP_LIST__ACPT_ODR_CD = null;

	// 第 25 変数初期値： i_T_UN_SHIP_LIST__PART_DLV_SEQ_NO


	final static String i_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;

	// 第 26 変数初期値： i_T_SHIP_SLIP__SLIP_CD


	final static String i_T_SHIP_SLIP__SLIP_CD = null;

	// 第 27 変数初期値： i_T_SHIP_SLIP__ITEM_CD


	final static String i_T_SHIP_SLIP__ITEM_CD = null;

	// 第 28 変数初期値： i_T_SHIP_SLIP__CUST_ITEM_CD


	final static String i_T_SHIP_SLIP__CUST_ITEM_CD = null;

	// 第 29 変数初期値： i_T_SHIP_SLIP__PART_NAME


	final static String i_T_SHIP_SLIP__PART_NAME = null;

	// 第 30 変数初期値： i_T_SHIP_SLIP__CUST_ODR_NO


	final static String i_T_SHIP_SLIP__CUST_ODR_NO = null;

	// 第 31 変数初期値： i_T_SHIP_SLIP__CUST_NAME


	final static String i_T_SHIP_SLIP__CUST_NAME = null;

	// 第 32 変数初期値： i_T_SHIP_SLIP__DLV_LOC_NAME_KANJI


	final static String i_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;

	// 第 33 変数初期値： i_T_SHIP_SLIP__BUYER_NAME


	final static String i_T_SHIP_SLIP__BUYER_NAME = null;

	// 第 34 変数初期値： i_T_SHIP_SLIP__CUS_DLV_KEY_CD


	final static String i_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;

	// 第 35 変数初期値： i_T_SHIP_SLIP__DESINATED_SHIP_DATE


	final static String i_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;

	// 第 36 変数初期値： i_T_SHIP_SLIP__DESINATED_DLV_DATE


	final static String i_T_SHIP_SLIP__DESINATED_DLV_DATE = null;

	// 第 37 変数初期値： i_T_SHIP_SLIP__SCDL_DLV_DATE


	final static String i_T_SHIP_SLIP__SCDL_DLV_DATE = null;

	// 第 38 変数初期値： i_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL


	final static String i_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;

	// 第 39 変数初期値： i_T_SHIP_SLIP__DLV_ODR_QTY


	final static String i_T_SHIP_SLIP__DLV_ODR_QTY = null;

	// 第 40 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_QTY


	final static String i_T_SHIP_SLIP__SHIP_ODR_QTY = null;

	// 第 41 変数初期値： i_T_SHIP_SLIP__UNIT_CD


	final static String i_T_SHIP_SLIP__UNIT_CD = null;

	// 第 42 変数初期値： i_T_SHIP_SLIP__UNIT_PRICE


	final static String i_T_SHIP_SLIP__UNIT_PRICE = null;

	// 第 43 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_AMOUNT


	final static String i_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;

	// 第 44 変数初期値： i_T_SHIP_SLIP__TAX_AMOUNT


	final static String i_T_SHIP_SLIP__TAX_AMOUNT = null;

	// 第 45 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX


	final static String i_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;

	// 第 46 変数初期値： i_T_SHIP_SLIP__CLIENT_REMARK_KANJI


	final static String i_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;

	// 第 47 変数初期値： i_T_SHIP_SLIP__CLIENT_BARCODE_INF


	final static String i_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;

	// 第 48 変数初期値： i_CODE_NAME


	final static String i_CODE_NAME = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r1_PrintType

	final static String i_r1_PrintType = null;

	// 第 2 変数初期値： i_r2_PrintType

	final static String i_r2_PrintType = null;

	// 第 3 変数初期値： i_r3_PrintType

	final static String i_r3_PrintType = null;

	// 第 4 変数初期値： i_c_ReOut

	final static String i_c_ReOut = null;

	// 第 5 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 6 変数初期値： i_MIN_DESINATED_SHIP_DATE

	final static String i_MIN_DESINATED_SHIP_DATE = null;

	// 第 7 変数初期値： i_MAX_DESINATED_SHIP_DATE

	final static String i_MAX_DESINATED_SHIP_DATE = null;

	// 第 8 変数初期値： i_DESINATED_SHIP_DATE_FROM

	final static String i_DESINATED_SHIP_DATE_FROM = null;

	// 第 9 変数初期値： i_DESINATED_SHIP_DATE_TO

	final static String i_DESINATED_SHIP_DATE_TO = null;

	// 第 10 変数初期値： i_SLIP_CD_FROM

	final static String i_SLIP_CD_FROM = null;

	// 第 11 変数初期値： i_SLIP_CD_TO

	final static String i_SLIP_CD_TO = null;

	// 第 12 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 13 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 14 変数初期値： i_PRINT_FLG

	final static String i_PRINT_FLG = null;

	// 第 15 変数初期値： i_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO

	final static String i_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = null;

	// 第 16 変数初期値： i_T_UN_SHIP_LIST__CUST_CD

	final static String i_T_UN_SHIP_LIST__CUST_CD = null;

	// 第 17 変数初期値： i_M_CUST__CUST_NAME

	final static String i_M_CUST__CUST_NAME = null;

	// 第 18 変数初期値： i_T_ODR_CTL__CUST_ITEM_CD

	final static String i_T_ODR_CTL__CUST_ITEM_CD = null;

	// 第 19 変数初期値： i_T_UN_SHIP_LIST__ITEM_CD

	final static String i_T_UN_SHIP_LIST__ITEM_CD = null;

	// 第 20 変数初期値： i_T_ODR__CUST_ODR_NO

	final static String i_T_ODR__CUST_ODR_NO = null;

	// 第 21 変数初期値： i_T_UN_SHIP_LIST__UN_SHIP_QTY

	final static String i_T_UN_SHIP_LIST__UN_SHIP_QTY = null;

	// 第 22 変数初期値： i_M_ITEM__STOCK_UNIT

	final static String i_M_ITEM__STOCK_UNIT = null;

	// 第 23 変数初期値： i_T_UN_SHIP_LIST__WH_CD

	final static String i_T_UN_SHIP_LIST__WH_CD = null;

	// 第 24 変数初期値： i_T_UN_SHIP_LIST__ACPT_ODR_CD

	final static String i_T_UN_SHIP_LIST__ACPT_ODR_CD = null;

	// 第 25 変数初期値： i_T_UN_SHIP_LIST__PART_DLV_SEQ_NO

	final static String i_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = null;

	// 第 26 変数初期値： i_T_SHIP_SLIP__SLIP_CD

	final static String i_T_SHIP_SLIP__SLIP_CD = null;

	// 第 27 変数初期値： i_T_SHIP_SLIP__ITEM_CD

	final static String i_T_SHIP_SLIP__ITEM_CD = null;

	// 第 28 変数初期値： i_T_SHIP_SLIP__CUST_ITEM_CD

	final static String i_T_SHIP_SLIP__CUST_ITEM_CD = null;

	// 第 29 変数初期値： i_T_SHIP_SLIP__PART_NAME

	final static String i_T_SHIP_SLIP__PART_NAME = null;

	// 第 30 変数初期値： i_T_SHIP_SLIP__CUST_ODR_NO

	final static String i_T_SHIP_SLIP__CUST_ODR_NO = null;

	// 第 31 変数初期値： i_T_SHIP_SLIP__CUST_NAME

	final static String i_T_SHIP_SLIP__CUST_NAME = null;

	// 第 32 変数初期値： i_T_SHIP_SLIP__DLV_LOC_NAME_KANJI

	final static String i_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = null;

	// 第 33 変数初期値： i_T_SHIP_SLIP__BUYER_NAME

	final static String i_T_SHIP_SLIP__BUYER_NAME = null;

	// 第 34 変数初期値： i_T_SHIP_SLIP__CUS_DLV_KEY_CD

	final static String i_T_SHIP_SLIP__CUS_DLV_KEY_CD = null;

	// 第 35 変数初期値： i_T_SHIP_SLIP__DESINATED_SHIP_DATE

	final static String i_T_SHIP_SLIP__DESINATED_SHIP_DATE = null;

	// 第 36 変数初期値： i_T_SHIP_SLIP__DESINATED_DLV_DATE

	final static String i_T_SHIP_SLIP__DESINATED_DLV_DATE = null;

	// 第 37 変数初期値： i_T_SHIP_SLIP__SCDL_DLV_DATE

	final static String i_T_SHIP_SLIP__SCDL_DLV_DATE = null;

	// 第 38 変数初期値： i_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL

	final static String i_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = null;

	// 第 39 変数初期値： i_T_SHIP_SLIP__DLV_ODR_QTY

	final static String i_T_SHIP_SLIP__DLV_ODR_QTY = null;

	// 第 40 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_QTY

	final static String i_T_SHIP_SLIP__SHIP_ODR_QTY = null;

	// 第 41 変数初期値： i_T_SHIP_SLIP__UNIT_CD

	final static String i_T_SHIP_SLIP__UNIT_CD = null;

	// 第 42 変数初期値： i_T_SHIP_SLIP__UNIT_PRICE

	final static String i_T_SHIP_SLIP__UNIT_PRICE = null;

	// 第 43 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_AMOUNT

	final static String i_T_SHIP_SLIP__SHIP_ODR_AMOUNT = null;

	// 第 44 変数初期値： i_T_SHIP_SLIP__TAX_AMOUNT

	final static String i_T_SHIP_SLIP__TAX_AMOUNT = null;

	// 第 45 変数初期値： i_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX

	final static String i_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = null;

	// 第 46 変数初期値： i_T_SHIP_SLIP__CLIENT_REMARK_KANJI

	final static String i_T_SHIP_SLIP__CLIENT_REMARK_KANJI = null;

	// 第 47 変数初期値： i_T_SHIP_SLIP__CLIENT_BARCODE_INF

	final static String i_T_SHIP_SLIP__CLIENT_BARCODE_INF = null;

	// 第 48 変数初期値： i_T_SHIP_ODR__SLIP_CD

	final static String i_T_SHIP_ODR__SLIP_CD = null;

	// 第 49 変数初期値： i_CODE_NAME

	final static String i_CODE_NAME = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_PrintType = i_r1_PrintType;
		m_r2_PrintType = i_r2_PrintType;
		m_r3_PrintType = i_r3_PrintType;
		m_c_ReOut = i_c_ReOut;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_MIN_DESINATED_SHIP_DATE = i_MIN_DESINATED_SHIP_DATE;
		m_MAX_DESINATED_SHIP_DATE = i_MAX_DESINATED_SHIP_DATE;
		m_DESINATED_SHIP_DATE_FROM = i_DESINATED_SHIP_DATE_FROM;
		m_DESINATED_SHIP_DATE_TO = i_DESINATED_SHIP_DATE_TO;
		m_SLIP_CD_FROM = i_SLIP_CD_FROM;
		m_SLIP_CD_TO = i_SLIP_CD_TO;
		m_WH_CD = i_WH_CD;
		m_CUST_CD = i_CUST_CD;
		m_PRINT_FLG = i_PRINT_FLG;
		m_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO = i_T_UN_SHIP_LIST__UN_SHIP_SEQ_NO;
		m_T_UN_SHIP_LIST__CUST_CD = i_T_UN_SHIP_LIST__CUST_CD;
		m_M_CUST__CUST_NAME = i_M_CUST__CUST_NAME;
		m_T_ODR_CTL__CUST_ITEM_CD = i_T_ODR_CTL__CUST_ITEM_CD;
		m_T_UN_SHIP_LIST__ITEM_CD = i_T_UN_SHIP_LIST__ITEM_CD;
		m_T_ODR__CUST_ODR_NO = i_T_ODR__CUST_ODR_NO;
		m_T_UN_SHIP_LIST__UN_SHIP_QTY = i_T_UN_SHIP_LIST__UN_SHIP_QTY;
		m_M_ITEM__STOCK_UNIT = i_M_ITEM__STOCK_UNIT;
		m_T_UN_SHIP_LIST__WH_CD = i_T_UN_SHIP_LIST__WH_CD;
		m_T_UN_SHIP_LIST__ACPT_ODR_CD = i_T_UN_SHIP_LIST__ACPT_ODR_CD;
		m_T_UN_SHIP_LIST__PART_DLV_SEQ_NO = i_T_UN_SHIP_LIST__PART_DLV_SEQ_NO;
		m_T_SHIP_SLIP__SLIP_CD = i_T_SHIP_SLIP__SLIP_CD;
		m_T_SHIP_SLIP__ITEM_CD = i_T_SHIP_SLIP__ITEM_CD;
		m_T_SHIP_SLIP__CUST_ITEM_CD = i_T_SHIP_SLIP__CUST_ITEM_CD;
		m_T_SHIP_SLIP__PART_NAME = i_T_SHIP_SLIP__PART_NAME;
		m_T_SHIP_SLIP__CUST_ODR_NO = i_T_SHIP_SLIP__CUST_ODR_NO;
		m_T_SHIP_SLIP__CUST_NAME = i_T_SHIP_SLIP__CUST_NAME;
		m_T_SHIP_SLIP__DLV_LOC_NAME_KANJI = i_T_SHIP_SLIP__DLV_LOC_NAME_KANJI;
		m_T_SHIP_SLIP__BUYER_NAME = i_T_SHIP_SLIP__BUYER_NAME;
		m_T_SHIP_SLIP__CUS_DLV_KEY_CD = i_T_SHIP_SLIP__CUS_DLV_KEY_CD;
		m_T_SHIP_SLIP__DESINATED_SHIP_DATE = i_T_SHIP_SLIP__DESINATED_SHIP_DATE;
		m_T_SHIP_SLIP__DESINATED_DLV_DATE = i_T_SHIP_SLIP__DESINATED_DLV_DATE;
		m_T_SHIP_SLIP__SCDL_DLV_DATE = i_T_SHIP_SLIP__SCDL_DLV_DATE;
		m_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL = i_T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL;
		m_T_SHIP_SLIP__DLV_ODR_QTY = i_T_SHIP_SLIP__DLV_ODR_QTY;
		m_T_SHIP_SLIP__SHIP_ODR_QTY = i_T_SHIP_SLIP__SHIP_ODR_QTY;
		m_T_SHIP_SLIP__UNIT_CD = i_T_SHIP_SLIP__UNIT_CD;
		m_T_SHIP_SLIP__UNIT_PRICE = i_T_SHIP_SLIP__UNIT_PRICE;
		m_T_SHIP_SLIP__SHIP_ODR_AMOUNT = i_T_SHIP_SLIP__SHIP_ODR_AMOUNT;
		m_T_SHIP_SLIP__TAX_AMOUNT = i_T_SHIP_SLIP__TAX_AMOUNT;
		m_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX = i_T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX;
		m_T_SHIP_SLIP__CLIENT_REMARK_KANJI = i_T_SHIP_SLIP__CLIENT_REMARK_KANJI;
		m_T_SHIP_SLIP__CLIENT_BARCODE_INF = i_T_SHIP_SLIP__CLIENT_BARCODE_INF;
		m_CODE_NAME = i_CODE_NAME;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
