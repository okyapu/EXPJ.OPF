/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0010/src/com/nec/jp/orteus/metamorBase/KP0010/KP0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0010;

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
 * CLASS     : KP0010010Control クラス
 * ファイル・クラス説明
 * @author $Author: shao-guangfeng $
 * @version $Revision: 1.9 $ $Date: 2011/01/30 04:03:10 $
 *
 */
//}}user_implement_code_header

public class KP0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_NO */
	public String m_NO = null;
	/** 第 2 変数： m_PLN_TERM_TYP_DN */
	public String m_PLN_TERM_TYP_DN = null;
	/** 第 3 変数： m_TEMP_ADD_TO_OD_FLG */
	public String m_TEMP_ADD_TO_OD_FLG = null;
	/** 第 4 変数： m_chkADD_TO_OD */
	public String m_chkADD_TO_OD = null;
	/** 第 5 変数： m_h_NO */
	public String m_h_NO = null;
	/** 第 6 変数： m_IN_PLN_TERM_TYP */
	public String m_IN_PLN_TERM_TYP = null;
	/** 第 7 変数： m_IN_PLN_TERM_TYP_name */
	public String m_IN_PLN_TERM_TYP_name = null;
	/** 第 8 変数： m_IN_PLN_TERM_TYP_val */
	public String m_IN_PLN_TERM_TYP_val = null;
	/** 第 9 変数： m_IN_PLN_STR_DATE */
	public String m_IN_PLN_STR_DATE = null;
	/** 第 10 変数： m_IN_PLN_END_DATE */
	public String m_IN_PLN_END_DATE = null;
	/** 第 11 変数： m_IN_PLN_QTY */
	public String m_IN_PLN_QTY = null;
	/** 第 12 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 13 変数： m_SALES_PLAN_CD */
	public String m_SALES_PLAN_CD = null;
	/** 第 14 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 15 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 16 変数： m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** 第 17 変数： m_IN_CUST_CD */
	public String m_IN_CUST_CD = null;
	/** 第 18 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 19 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 20 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 21 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 22 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 23 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 24 変数： m_IN_CUST_ITEM_CD */
	public String m_IN_CUST_ITEM_CD = null;
	/** 第 25 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 26 変数： m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** 第 27 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 28 変数： m_IN_DLV_LOC_CD */
	public String m_IN_DLV_LOC_CD = null;
	/** 第 29 変数： m_PLN_STR_DATE */
	public String m_PLN_STR_DATE = null;
	/** 第 30 変数： m_PLN_END_DATE */
	public String m_PLN_END_DATE = null;
	/** 第 31 変数： m_TERM_DAYS */
	public String m_TERM_DAYS = null;
	/** 第 32 変数： m_PLN_TERM_TYP */
	public String m_PLN_TERM_TYP = null;
	/** 第 33 変数： m_PLN_QTY */
	public String m_PLN_QTY = null;
	/** 第 34 変数： m_ADD_TO_OD_FLG */
	public String m_ADD_TO_OD_FLG = null;
	/** 第 35 変数： m_ADD_TO_OD_FLG_DN */
	public String m_ADD_TO_OD_FLG_DN = null;
	/** 第 36 変数： m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_NO */
	public List l_NO = null;

	/** 第 2 List変数： l_PLN_TERM_TYP_DN */
	public List l_PLN_TERM_TYP_DN = null;

	/** 第 3 List変数： l_TEMP_ADD_TO_OD_FLG */
	public List l_TEMP_ADD_TO_OD_FLG = null;

	/** 第 4 List変数： l_chkADD_TO_OD */
	public List l_chkADD_TO_OD = null;

	/** 第 5 List変数： l_h_NO */
	public List l_h_NO = null;

	/** 第 6 List変数： l_IN_PLN_TERM_TYP */
	public List l_IN_PLN_TERM_TYP = null;

	/** 第 7 List変数： l_IN_PLN_TERM_TYP_name */
	public List l_IN_PLN_TERM_TYP_name = null;

	/** 第 8 List変数： l_IN_PLN_TERM_TYP_val */
	public List l_IN_PLN_TERM_TYP_val = null;

	/** 第 9 List変数： l_IN_PLN_STR_DATE */
	public List l_IN_PLN_STR_DATE = null;

	/** 第 10 List変数： l_IN_PLN_END_DATE */
	public List l_IN_PLN_END_DATE = null;

	/** 第 11 List変数： l_IN_PLN_QTY */
	public List l_IN_PLN_QTY = null;

	/** 第 12 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 13 List変数： l_SALES_PLAN_CD */
	public List l_SALES_PLAN_CD = null;

	/** 第 14 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 15 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 16 List変数： l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** 第 17 List変数： l_IN_CUST_CD */
	public List l_IN_CUST_CD = null;

	/** 第 18 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 19 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 20 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 21 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 22 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 23 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 24 List変数： l_IN_CUST_ITEM_CD */
	public List l_IN_CUST_ITEM_CD = null;

	/** 第 25 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 26 List変数： l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** 第 27 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 28 List変数： l_IN_DLV_LOC_CD */
	public List l_IN_DLV_LOC_CD = null;

	/** 第 29 List変数： l_PLN_STR_DATE */
	public List l_PLN_STR_DATE = null;

	/** 第 30 List変数： l_PLN_END_DATE */
	public List l_PLN_END_DATE = null;

	/** 第 31 List変数： l_TERM_DAYS */
	public List l_TERM_DAYS = null;

	/** 第 32 List変数： l_PLN_TERM_TYP */
	public List l_PLN_TERM_TYP = null;

	/** 第 33 List変数： l_PLN_QTY */
	public List l_PLN_QTY = null;

	/** 第 34 List変数： l_ADD_TO_OD_FLG */
	public List l_ADD_TO_OD_FLG = null;

	/** 第 35 List変数： l_ADD_TO_OD_FLG_DN */
	public List l_ADD_TO_OD_FLG_DN = null;

	/** 第 36 List変数： l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getNO() { return m_NO; }
	public String getPLN_TERM_TYP_DN() { return m_PLN_TERM_TYP_DN; }
	public String getTEMP_ADD_TO_OD_FLG() { return m_TEMP_ADD_TO_OD_FLG; }
	public String getchkADD_TO_OD() { return m_chkADD_TO_OD; }
	public String geth_NO() { return m_h_NO; }
	public String getIN_PLN_TERM_TYP() { return m_IN_PLN_TERM_TYP; }
	public String getIN_PLN_TERM_TYP_name() { return m_IN_PLN_TERM_TYP_name; }
	public String getIN_PLN_TERM_TYP_val() { return m_IN_PLN_TERM_TYP_val; }
	public String getIN_PLN_STR_DATE() { return m_IN_PLN_STR_DATE; }
	public String getIN_PLN_END_DATE() { return m_IN_PLN_END_DATE; }
	public String getIN_PLN_QTY() { return m_IN_PLN_QTY; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getSALES_PLAN_CD() { return m_SALES_PLAN_CD; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getIN_CUST_CD() { return m_IN_CUST_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getIN_CUST_ITEM_CD() { return m_IN_CUST_ITEM_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getIN_DLV_LOC_CD() { return m_IN_DLV_LOC_CD; }
	public String getPLN_STR_DATE() { return m_PLN_STR_DATE; }
	public String getPLN_END_DATE() { return m_PLN_END_DATE; }
	public String getTERM_DAYS() { return m_TERM_DAYS; }
	public String getPLN_TERM_TYP() { return m_PLN_TERM_TYP; }
	public String getPLN_QTY() { return m_PLN_QTY; }
	public String getADD_TO_OD_FLG() { return m_ADD_TO_OD_FLG; }
	public String getADD_TO_OD_FLG_DN() { return m_ADD_TO_OD_FLG_DN; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }

	public List getList_NO() { return l_NO; }
	public List getList_PLN_TERM_TYP_DN() { return l_PLN_TERM_TYP_DN; }
	public List getList_TEMP_ADD_TO_OD_FLG() { return l_TEMP_ADD_TO_OD_FLG; }
	public List getList_chkADD_TO_OD() { return l_chkADD_TO_OD; }
	public List getList_h_NO() { return l_h_NO; }
	public List getList_IN_PLN_TERM_TYP() { return l_IN_PLN_TERM_TYP; }
	public List getList_IN_PLN_TERM_TYP_name() { return l_IN_PLN_TERM_TYP_name; }
	public List getList_IN_PLN_TERM_TYP_val() { return l_IN_PLN_TERM_TYP_val; }
	public List getList_IN_PLN_STR_DATE() { return l_IN_PLN_STR_DATE; }
	public List getList_IN_PLN_END_DATE() { return l_IN_PLN_END_DATE; }
	public List getList_IN_PLN_QTY() { return l_IN_PLN_QTY; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_SALES_PLAN_CD() { return l_SALES_PLAN_CD; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_IN_CUST_CD() { return l_IN_CUST_CD; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_IN_CUST_ITEM_CD() { return l_IN_CUST_ITEM_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_IN_DLV_LOC_CD() { return l_IN_DLV_LOC_CD; }
	public List getList_PLN_STR_DATE() { return l_PLN_STR_DATE; }
	public List getList_PLN_END_DATE() { return l_PLN_END_DATE; }
	public List getList_TERM_DAYS() { return l_TERM_DAYS; }
	public List getList_PLN_TERM_TYP() { return l_PLN_TERM_TYP; }
	public List getList_PLN_QTY() { return l_PLN_QTY; }
	public List getList_ADD_TO_OD_FLG() { return l_ADD_TO_OD_FLG; }
	public List getList_ADD_TO_OD_FLG_DN() { return l_ADD_TO_OD_FLG_DN; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }

	public void setNO(String val) { m_NO = val; }
	public void setPLN_TERM_TYP_DN(String val) { m_PLN_TERM_TYP_DN = val; }
	public void setTEMP_ADD_TO_OD_FLG(String val) { m_TEMP_ADD_TO_OD_FLG = val; }
	public void setchkADD_TO_OD(String val) { m_chkADD_TO_OD = val; }
	public void seth_NO(String val) { m_h_NO = val; }
	public void setIN_PLN_TERM_TYP(String val) { m_IN_PLN_TERM_TYP = val; }
	public void setIN_PLN_TERM_TYP_name(String val) { m_IN_PLN_TERM_TYP_name = val; }
	public void setIN_PLN_TERM_TYP_val(String val) { m_IN_PLN_TERM_TYP_val = val; }
	public void setIN_PLN_STR_DATE(String val) { m_IN_PLN_STR_DATE = val; }
	public void setIN_PLN_END_DATE(String val) { m_IN_PLN_END_DATE = val; }
	public void setIN_PLN_QTY(String val) { m_IN_PLN_QTY = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setSALES_PLAN_CD(String val) { m_SALES_PLAN_CD = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setIN_CUST_CD(String val) { m_IN_CUST_CD = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setIN_CUST_ITEM_CD(String val) { m_IN_CUST_ITEM_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setIN_DLV_LOC_CD(String val) { m_IN_DLV_LOC_CD = val; }
	public void setPLN_STR_DATE(String val) { m_PLN_STR_DATE = val; }
	public void setPLN_END_DATE(String val) { m_PLN_END_DATE = val; }
	public void setTERM_DAYS(String val) { m_TERM_DAYS = val; }
	public void setPLN_TERM_TYP(String val) { m_PLN_TERM_TYP = val; }
	public void setPLN_QTY(String val) { m_PLN_QTY = val; }
	public void setADD_TO_OD_FLG(String val) { m_ADD_TO_OD_FLG = val; }
	public void setADD_TO_OD_FLG_DN(String val) { m_ADD_TO_OD_FLG_DN = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }


	public void setList_NO(List list) { l_NO = list; }
	public void setList_PLN_TERM_TYP_DN(List list) { l_PLN_TERM_TYP_DN = list; }
	public void setList_TEMP_ADD_TO_OD_FLG(List list) { l_TEMP_ADD_TO_OD_FLG = list; }
	public void setList_chkADD_TO_OD(List list) { l_chkADD_TO_OD = list; }
	public void setList_h_NO(List list) { l_h_NO = list; }
	public void setList_IN_PLN_TERM_TYP(List list) { l_IN_PLN_TERM_TYP = list; }
	public void setList_IN_PLN_TERM_TYP_name(List list) { l_IN_PLN_TERM_TYP_name = list; }
	public void setList_IN_PLN_TERM_TYP_val(List list) { l_IN_PLN_TERM_TYP_val = list; }
	public void setList_IN_PLN_STR_DATE(List list) { l_IN_PLN_STR_DATE = list; }
	public void setList_IN_PLN_END_DATE(List list) { l_IN_PLN_END_DATE = list; }
	public void setList_IN_PLN_QTY(List list) { l_IN_PLN_QTY = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_SALES_PLAN_CD(List list) { l_SALES_PLAN_CD = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_IN_CUST_CD(List list) { l_IN_CUST_CD = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_IN_CUST_ITEM_CD(List list) { l_IN_CUST_ITEM_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_IN_DLV_LOC_CD(List list) { l_IN_DLV_LOC_CD = list; }
	public void setList_PLN_STR_DATE(List list) { l_PLN_STR_DATE = list; }
	public void setList_PLN_END_DATE(List list) { l_PLN_END_DATE = list; }
	public void setList_TERM_DAYS(List list) { l_TERM_DAYS = list; }
	public void setList_PLN_TERM_TYP(List list) { l_PLN_TERM_TYP = list; }
	public void setList_PLN_QTY(List list) { l_PLN_QTY = list; }
	public void setList_ADD_TO_OD_FLG(List list) { l_ADD_TO_OD_FLG = list; }
	public void setList_ADD_TO_OD_FLG_DN(List list) { l_ADD_TO_OD_FLG_DN = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }

	public int setL2L_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NO == null) {
			l_NO = new ArrayList();
		} else {
			l_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NO.add(((KP0010010Struct) list.get(i)).getNO());
		}
		return size;
	}
	public int setL2L_PLN_TERM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_TERM_TYP_DN == null) {
			l_PLN_TERM_TYP_DN = new ArrayList();
		} else {
			l_PLN_TERM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_TERM_TYP_DN.add(((KP0010010Struct) list.get(i)).getPLN_TERM_TYP_DN());
		}
		return size;
	}
	public int setL2L_TEMP_ADD_TO_OD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_ADD_TO_OD_FLG == null) {
			l_TEMP_ADD_TO_OD_FLG = new ArrayList();
		} else {
			l_TEMP_ADD_TO_OD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_ADD_TO_OD_FLG.add(((KP0010010Struct) list.get(i)).getTEMP_ADD_TO_OD_FLG());
		}
		return size;
	}
	public int setL2L_chkADD_TO_OD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkADD_TO_OD == null) {
			l_chkADD_TO_OD = new ArrayList();
		} else {
			l_chkADD_TO_OD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkADD_TO_OD.add(((KP0010010Struct) list.get(i)).getchkADD_TO_OD());
		}
		return size;
	}
	public int setL2L_h_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NO == null) {
			l_h_NO = new ArrayList();
		} else {
			l_h_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NO.add(((KP0010010Struct) list.get(i)).geth_NO());
		}
		return size;
	}
	public int setL2L_IN_PLN_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_TERM_TYP == null) {
			l_IN_PLN_TERM_TYP = new ArrayList();
		} else {
			l_IN_PLN_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_TERM_TYP.add(((KP0010010Struct) list.get(i)).getIN_PLN_TERM_TYP());
		}
		return size;
	}
	public int setL2L_IN_PLN_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_TERM_TYP_name == null) {
			l_IN_PLN_TERM_TYP_name = new ArrayList();
		} else {
			l_IN_PLN_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_TERM_TYP_name.add(((KP0010010Struct) list.get(i)).getIN_PLN_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_IN_PLN_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_TERM_TYP_val == null) {
			l_IN_PLN_TERM_TYP_val = new ArrayList();
		} else {
			l_IN_PLN_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_TERM_TYP_val.add(((KP0010010Struct) list.get(i)).getIN_PLN_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_IN_PLN_STR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_STR_DATE == null) {
			l_IN_PLN_STR_DATE = new ArrayList();
		} else {
			l_IN_PLN_STR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_STR_DATE.add(((KP0010010Struct) list.get(i)).getIN_PLN_STR_DATE());
		}
		return size;
	}
	public int setL2L_IN_PLN_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_END_DATE == null) {
			l_IN_PLN_END_DATE = new ArrayList();
		} else {
			l_IN_PLN_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_END_DATE.add(((KP0010010Struct) list.get(i)).getIN_PLN_END_DATE());
		}
		return size;
	}
	public int setL2L_IN_PLN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLN_QTY == null) {
			l_IN_PLN_QTY = new ArrayList();
		} else {
			l_IN_PLN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLN_QTY.add(((KP0010010Struct) list.get(i)).getIN_PLN_QTY());
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
			l_COMPANY_CD.add(((KP0010010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_SALES_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_PLAN_CD == null) {
			l_SALES_PLAN_CD = new ArrayList();
		} else {
			l_SALES_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_PLAN_CD.add(((KP0010010Struct) list.get(i)).getSALES_PLAN_CD());
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
			l_UNIT_QTY_TYP.add(((KP0010010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_CUST_CD.add(((KP0010010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ANAME == null) {
			l_CUST_ANAME = new ArrayList();
		} else {
			l_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ANAME.add(((KP0010010Struct) list.get(i)).getCUST_ANAME());
		}
		return size;
	}
	public int setL2L_IN_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_CD == null) {
			l_IN_CUST_CD = new ArrayList();
		} else {
			l_IN_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_CD.add(((KP0010010Struct) list.get(i)).getIN_CUST_CD());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_CD == null) {
			l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_CD.add(((KP0010010Struct) list.get(i)).getCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_NAME == null) {
			l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_NAME.add(((KP0010010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_ITEM_CD.add(((KP0010010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KP0010010Struct) list.get(i)).getITEM_NAME());
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
			l_STOCK_UNIT.add(((KP0010010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_MRP_ODR_TYP.add(((KP0010010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_IN_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_ITEM_CD == null) {
			l_IN_CUST_ITEM_CD = new ArrayList();
		} else {
			l_IN_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_ITEM_CD.add(((KP0010010Struct) list.get(i)).getIN_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_CD == null) {
			l_DLV_LOC_CD = new ArrayList();
		} else {
			l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_CD.add(((KP0010010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_NAME == null) {
			l_DLV_LOC_NAME = new ArrayList();
		} else {
			l_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_NAME.add(((KP0010010Struct) list.get(i)).getDLV_LOC_NAME());
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
			l_PLANT_CD.add(((KP0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_DLV_LOC_CD == null) {
			l_IN_DLV_LOC_CD = new ArrayList();
		} else {
			l_IN_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_DLV_LOC_CD.add(((KP0010010Struct) list.get(i)).getIN_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_PLN_STR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_STR_DATE == null) {
			l_PLN_STR_DATE = new ArrayList();
		} else {
			l_PLN_STR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_STR_DATE.add(((KP0010010Struct) list.get(i)).getPLN_STR_DATE());
		}
		return size;
	}
	public int setL2L_PLN_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_END_DATE == null) {
			l_PLN_END_DATE = new ArrayList();
		} else {
			l_PLN_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_END_DATE.add(((KP0010010Struct) list.get(i)).getPLN_END_DATE());
		}
		return size;
	}
	public int setL2L_TERM_DAYS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TERM_DAYS == null) {
			l_TERM_DAYS = new ArrayList();
		} else {
			l_TERM_DAYS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TERM_DAYS.add(((KP0010010Struct) list.get(i)).getTERM_DAYS());
		}
		return size;
	}
	public int setL2L_PLN_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_TERM_TYP == null) {
			l_PLN_TERM_TYP = new ArrayList();
		} else {
			l_PLN_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_TERM_TYP.add(((KP0010010Struct) list.get(i)).getPLN_TERM_TYP());
		}
		return size;
	}
	public int setL2L_PLN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_QTY == null) {
			l_PLN_QTY = new ArrayList();
		} else {
			l_PLN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_QTY.add(((KP0010010Struct) list.get(i)).getPLN_QTY());
		}
		return size;
	}
	public int setL2L_ADD_TO_OD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADD_TO_OD_FLG == null) {
			l_ADD_TO_OD_FLG = new ArrayList();
		} else {
			l_ADD_TO_OD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADD_TO_OD_FLG.add(((KP0010010Struct) list.get(i)).getADD_TO_OD_FLG());
		}
		return size;
	}
	public int setL2L_ADD_TO_OD_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADD_TO_OD_FLG_DN == null) {
			l_ADD_TO_OD_FLG_DN = new ArrayList();
		} else {
			l_ADD_TO_OD_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADD_TO_OD_FLG_DN.add(((KP0010010Struct) list.get(i)).getADD_TO_OD_FLG_DN());
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
			l_MRP_ODR_TYP_DN.add(((KP0010010Struct) list.get(i)).getMRP_ODR_TYP_DN());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_NO = null;
		m_PLN_TERM_TYP_DN = null;
		m_TEMP_ADD_TO_OD_FLG = null;
		m_chkADD_TO_OD = null;
		m_h_NO = null;
		m_IN_PLN_TERM_TYP = null;
		m_IN_PLN_TERM_TYP_name = null;
		m_IN_PLN_TERM_TYP_val = null;
		m_IN_PLN_STR_DATE = null;
		m_IN_PLN_END_DATE = null;
		m_IN_PLN_QTY = null;
		m_COMPANY_CD = null;
		m_SALES_PLAN_CD = null;
		m_UNIT_QTY_TYP = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_IN_CUST_CD = null;
		m_CUST_ITEM_CD = null;
		m_CUST_ITEM_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_MRP_ODR_TYP = null;
		m_IN_CUST_ITEM_CD = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME = null;
		m_PLANT_CD = null;
		m_IN_DLV_LOC_CD = null;
		m_PLN_STR_DATE = null;
		m_PLN_END_DATE = null;
		m_TERM_DAYS = null;
		m_PLN_TERM_TYP = null;
		m_PLN_QTY = null;
		m_ADD_TO_OD_FLG = null;
		m_ADD_TO_OD_FLG_DN = null;
		m_MRP_ODR_TYP_DN = null;

		l_NO = null;
		l_PLN_TERM_TYP_DN = null;
		l_TEMP_ADD_TO_OD_FLG = null;
		l_chkADD_TO_OD = null;
		l_h_NO = null;
		l_IN_PLN_TERM_TYP = null;
		l_IN_PLN_TERM_TYP_name = null;
		l_IN_PLN_TERM_TYP_val = null;
		l_IN_PLN_STR_DATE = null;
		l_IN_PLN_END_DATE = null;
		l_IN_PLN_QTY = null;
		l_COMPANY_CD = null;
		l_SALES_PLAN_CD = null;
		l_UNIT_QTY_TYP = null;
		l_CUST_CD = null;
		l_CUST_ANAME = null;
		l_IN_CUST_CD = null;
		l_CUST_ITEM_CD = null;
		l_CUST_ITEM_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_MRP_ODR_TYP = null;
		l_IN_CUST_ITEM_CD = null;
		l_DLV_LOC_CD = null;
		l_DLV_LOC_NAME = null;
		l_PLANT_CD = null;
		l_IN_DLV_LOC_CD = null;
		l_PLN_STR_DATE = null;
		l_PLN_END_DATE = null;
		l_TERM_DAYS = null;
		l_PLN_TERM_TYP = null;
		l_PLN_QTY = null;
		l_ADD_TO_OD_FLG = null;
		l_ADD_TO_OD_FLG_DN = null;
		l_MRP_ODR_TYP_DN = null;

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
	 * medKP0010010クラスの標準コンストラクタ
	 */
	public KP0010010Struct()
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
	public void setStruct(KP0010010Struct struct)
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
	public void setStructM(KP0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setNO(struct.getNO());
			this.setPLN_TERM_TYP_DN(struct.getPLN_TERM_TYP_DN());
			this.setTEMP_ADD_TO_OD_FLG(struct.getTEMP_ADD_TO_OD_FLG());
			this.setchkADD_TO_OD(struct.getchkADD_TO_OD());
			this.seth_NO(struct.geth_NO());
			this.setIN_PLN_TERM_TYP(struct.getIN_PLN_TERM_TYP());
			this.setIN_PLN_TERM_TYP_name(struct.getIN_PLN_TERM_TYP_name());
			this.setIN_PLN_TERM_TYP_val(struct.getIN_PLN_TERM_TYP_val());
			this.setIN_PLN_STR_DATE(struct.getIN_PLN_STR_DATE());
			this.setIN_PLN_END_DATE(struct.getIN_PLN_END_DATE());
			this.setIN_PLN_QTY(struct.getIN_PLN_QTY());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setSALES_PLAN_CD(struct.getSALES_PLAN_CD());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setIN_CUST_CD(struct.getIN_CUST_CD());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
			this.setPLN_STR_DATE(struct.getPLN_STR_DATE());
			this.setPLN_END_DATE(struct.getPLN_END_DATE());
			this.setTERM_DAYS(struct.getTERM_DAYS());
			this.setPLN_TERM_TYP(struct.getPLN_TERM_TYP());
			this.setPLN_QTY(struct.getPLN_QTY());
			this.setADD_TO_OD_FLG(struct.getADD_TO_OD_FLG());
			this.setADD_TO_OD_FLG_DN(struct.getADD_TO_OD_FLG_DN());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KP0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_NO(struct.getList_NO());
			this.setList_PLN_TERM_TYP_DN(struct.getList_PLN_TERM_TYP_DN());
			this.setList_TEMP_ADD_TO_OD_FLG(struct.getList_TEMP_ADD_TO_OD_FLG());
			this.setList_chkADD_TO_OD(struct.getList_chkADD_TO_OD());
			this.setList_h_NO(struct.getList_h_NO());
			this.setList_IN_PLN_TERM_TYP(struct.getList_IN_PLN_TERM_TYP());
			this.setList_IN_PLN_TERM_TYP_name(struct.getList_IN_PLN_TERM_TYP_name());
			this.setList_IN_PLN_TERM_TYP_val(struct.getList_IN_PLN_TERM_TYP_val());
			this.setList_IN_PLN_STR_DATE(struct.getList_IN_PLN_STR_DATE());
			this.setList_IN_PLN_END_DATE(struct.getList_IN_PLN_END_DATE());
			this.setList_IN_PLN_QTY(struct.getList_IN_PLN_QTY());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_SALES_PLAN_CD(struct.getList_SALES_PLAN_CD());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_IN_CUST_CD(struct.getList_IN_CUST_CD());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_IN_CUST_ITEM_CD(struct.getList_IN_CUST_ITEM_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_IN_DLV_LOC_CD(struct.getList_IN_DLV_LOC_CD());
			this.setList_PLN_STR_DATE(struct.getList_PLN_STR_DATE());
			this.setList_PLN_END_DATE(struct.getList_PLN_END_DATE());
			this.setList_TERM_DAYS(struct.getList_TERM_DAYS());
			this.setList_PLN_TERM_TYP(struct.getList_PLN_TERM_TYP());
			this.setList_PLN_QTY(struct.getList_PLN_QTY());
			this.setList_ADD_TO_OD_FLG(struct.getList_ADD_TO_OD_FLG());
			this.setList_ADD_TO_OD_FLG_DN(struct.getList_ADD_TO_OD_FLG_DN());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
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
	// 第 1 変数初期値： i_NO


	final static String i_NO = null;

	// 第 2 変数初期値： i_PLN_TERM_TYP_DN


	final static String i_PLN_TERM_TYP_DN = null;

	// 第 3 変数初期値： i_TEMP_ADD_TO_OD_FLG


	final static String i_TEMP_ADD_TO_OD_FLG = null;

	// 第 4 変数初期値： i_chkADD_TO_OD


	final static String i_chkADD_TO_OD = null;

	// 第 5 変数初期値： i_h_NO


	final static String i_h_NO = null;

	// 第 6 変数初期値： i_IN_PLN_TERM_TYP


	final static String i_IN_PLN_TERM_TYP = null;

	// 第 7 変数初期値： i_IN_PLN_TERM_TYP_name


	final static String i_IN_PLN_TERM_TYP_name = null;

	// 第 8 変数初期値： i_IN_PLN_TERM_TYP_val


	final static String i_IN_PLN_TERM_TYP_val = null;

	// 第 9 変数初期値： i_IN_PLN_STR_DATE


	final static String i_IN_PLN_STR_DATE = null;

	// 第 10 変数初期値： i_IN_PLN_END_DATE


	final static String i_IN_PLN_END_DATE = null;

	// 第 11 変数初期値： i_IN_PLN_QTY


	final static String i_IN_PLN_QTY = null;

	// 第 12 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 13 変数初期値： i_SALES_PLAN_CD


	final static String i_SALES_PLAN_CD = null;

	// 第 14 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 15 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 16 変数初期値： i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// 第 17 変数初期値： i_IN_CUST_CD


	final static String i_IN_CUST_CD = null;

	// 第 18 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 19 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 20 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 21 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 22 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 23 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 24 変数初期値： i_IN_CUST_ITEM_CD


	final static String i_IN_CUST_ITEM_CD = null;

	// 第 25 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 26 変数初期値： i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// 第 27 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 28 変数初期値： i_IN_DLV_LOC_CD


	final static String i_IN_DLV_LOC_CD = null;

	// 第 29 変数初期値： i_PLN_STR_DATE


	final static String i_PLN_STR_DATE = null;

	// 第 30 変数初期値： i_PLN_END_DATE


	final static String i_PLN_END_DATE = null;

	// 第 31 変数初期値： i_TERM_DAYS


	final static String i_TERM_DAYS = null;

	// 第 32 変数初期値： i_PLN_TERM_TYP


	final static String i_PLN_TERM_TYP = null;

	// 第 33 変数初期値： i_PLN_QTY


	final static String i_PLN_QTY = null;

	// 第 34 変数初期値： i_ADD_TO_OD_FLG


	final static String i_ADD_TO_OD_FLG = null;

	// 第 35 変数初期値： i_ADD_TO_OD_FLG_DN


	final static String i_ADD_TO_OD_FLG_DN = null;

	// 第 36 変数初期値： i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_NO

	final static String i_NO = null;

	// 第 2 変数初期値： i_PLN_TERM_TYP_DN

	final static String i_PLN_TERM_TYP_DN = null;

	// 第 3 変数初期値： i_TEMP_ADD_TO_OD_FLG

	final static String i_TEMP_ADD_TO_OD_FLG = null;

	// 第 4 変数初期値： i_chkADD_TO_OD

	final static String i_chkADD_TO_OD = null;

	// 第 5 変数初期値： i_h_NO

	final static String i_h_NO = null;

	// 第 6 変数初期値： i_IN_PLN_TERM_TYP

	final static String i_IN_PLN_TERM_TYP = null;

	// 第 7 変数初期値： i_IN_PLN_TERM_TYP_name

	final static String i_IN_PLN_TERM_TYP_name = null;

	// 第 8 変数初期値： i_IN_PLN_TERM_TYP_val

	final static String i_IN_PLN_TERM_TYP_val = null;

	// 第 9 変数初期値： i_IN_PLN_STR_DATE

	final static String i_IN_PLN_STR_DATE = null;

	// 第 10 変数初期値： i_IN_PLN_END_DATE

	final static String i_IN_PLN_END_DATE = null;

	// 第 11 変数初期値： i_IN_PLN_QTY

	final static String i_IN_PLN_QTY = null;

	// 第 12 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 13 変数初期値： i_SALES_PLAN_CD

	final static String i_SALES_PLAN_CD = null;

	// 第 14 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 15 変数初期値： i_CUST_ANAME

	final static String i_CUST_ANAME = null;

	// 第 16 変数初期値： i_IN_CUST_CD

	final static String i_IN_CUST_CD = null;

	// 第 17 変数初期値： i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// 第 18 変数初期値： i_CUST_ITEM_NAME

	final static String i_CUST_ITEM_NAME = null;

	// 第 19 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 20 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 21 変数初期値： i_IN_CUST_ITEM_CD

	final static String i_IN_CUST_ITEM_CD = null;

	// 第 22 変数初期値： i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// 第 23 変数初期値： i_DLV_LOC_NAME

	final static String i_DLV_LOC_NAME = null;

	// 第 24 変数初期値： i_IN_DLV_LOC_CD

	final static String i_IN_DLV_LOC_CD = null;

	// 第 25 変数初期値： i_PLN_STR_DATE

	final static String i_PLN_STR_DATE = null;

	// 第 26 変数初期値： i_PLN_END_DATE

	final static String i_PLN_END_DATE = null;

	// 第 27 変数初期値： i_TERM_DAYS

	final static String i_TERM_DAYS = null;

	// 第 28 変数初期値： i_PLN_TERM_TYP

	final static String i_PLN_TERM_TYP = null;

	// 第 29 変数初期値： i_PLN_QTY

	final static String i_PLN_QTY = null;

	// 第 30 変数初期値： i_ADD_TO_OD_FLG

	final static String i_ADD_TO_OD_FLG = null;

	// 第 31 変数初期値： i_ADD_TO_OD_FLG_DN

	final static String i_ADD_TO_OD_FLG_DN = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_NO = i_NO;
		m_PLN_TERM_TYP_DN = i_PLN_TERM_TYP_DN;
		m_TEMP_ADD_TO_OD_FLG = i_TEMP_ADD_TO_OD_FLG;
		m_chkADD_TO_OD = i_chkADD_TO_OD;
		m_h_NO = i_h_NO;
		m_IN_PLN_TERM_TYP = i_IN_PLN_TERM_TYP;
		m_IN_PLN_TERM_TYP_name = i_IN_PLN_TERM_TYP_name;
		m_IN_PLN_TERM_TYP_val = i_IN_PLN_TERM_TYP_val;
		m_IN_PLN_STR_DATE = i_IN_PLN_STR_DATE;
		m_IN_PLN_END_DATE = i_IN_PLN_END_DATE;
		m_IN_PLN_QTY = i_IN_PLN_QTY;
		m_COMPANY_CD = i_COMPANY_CD;
		m_SALES_PLAN_CD = i_SALES_PLAN_CD;
		m_CUST_CD = i_CUST_CD;
		m_CUST_ANAME = i_CUST_ANAME;
		m_IN_CUST_CD = i_IN_CUST_CD;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_CUST_ITEM_NAME = i_CUST_ITEM_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_IN_CUST_ITEM_CD = i_IN_CUST_ITEM_CD;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_DLV_LOC_NAME = i_DLV_LOC_NAME;
		m_IN_DLV_LOC_CD = i_IN_DLV_LOC_CD;
		m_PLN_STR_DATE = i_PLN_STR_DATE;
		m_PLN_END_DATE = i_PLN_END_DATE;
		m_TERM_DAYS = i_TERM_DAYS;
		m_PLN_TERM_TYP = i_PLN_TERM_TYP;
		m_PLN_QTY = i_PLN_QTY;
		m_ADD_TO_OD_FLG = i_ADD_TO_OD_FLG;
		m_ADD_TO_OD_FLG_DN = i_ADD_TO_OD_FLG_DN;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
