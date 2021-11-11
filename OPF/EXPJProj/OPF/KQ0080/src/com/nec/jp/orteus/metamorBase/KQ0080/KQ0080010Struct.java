/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0080/src/com/nec/jp/orteus/metamorBase/KQ0080/KQ0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0080;

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
 * CLASS     : KQ0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.6 $ $Date: 2015/11/23 08:55:28 $
 *
 */
//}}user_implement_code_header

public class KQ0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r2_JOB_ODR_SET_FLG */
	public String m_r2_JOB_ODR_SET_FLG = null;
	/** 第 2 変数： m_r1_JOB_ODR_SET_FLG */
	public String m_r1_JOB_ODR_SET_FLG = null;
	/** 第 3 変数： m_c_JOB_ODR_STS_TYP */
	public String m_c_JOB_ODR_STS_TYP = null;
	/** 第 4 変数： m_h_JOB_ODR_DLV_DATE */
	public String m_h_JOB_ODR_DLV_DATE = null;
	/** 第 5 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 6 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 7 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 8 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 9 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 10 変数： m_l1_ODR_NO */
	public String m_l1_ODR_NO = null;
	/** 第 11 変数： m_l1_CUST_NAME */
	public String m_l1_CUST_NAME = null;
	/** 第 12 変数： m_l1_DLV_LOC_NAME */
	public String m_l1_DLV_LOC_NAME = null;
	/** 第 13 変数： m_l1_DESINATED_DLV_DATE */
	public String m_l1_DESINATED_DLV_DATE = null;
	/** 第 14 変数： m_l1_ODR_QTY */
	public String m_l1_ODR_QTY = null;
	/** 第 15 変数： m_l1_JOB_ODR_CD */
	public String m_l1_JOB_ODR_CD = null;
	/** 第 16 変数： m_l1_PLANT_CD */
	public String m_l1_PLANT_CD = null;
	/** 第 17 変数： m_l1_ODR_STATUS_TYP */
	public String m_l1_ODR_STATUS_TYP = null;
	/** 第 18 変数： m_l1_MODIFY_COUNT */
	public String m_l1_MODIFY_COUNT = null;
	/** 第 19 変数： m_w_CUST_CD */
	public String m_w_CUST_CD = null;
	/** 第 20 変数： m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** 第 21 変数： m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** 第 22 変数： m_w_ODR_NO */
	public String m_w_ODR_NO = null;
	/** 第 23 変数： m_h_JOB_ODR_SET_FLG */
	public String m_h_JOB_ODR_SET_FLG = null;
	/** 第 24 変数： m_l2_JOB_ODR_CD */
	public String m_l2_JOB_ODR_CD = null;
	/** 第 25 変数： m_h_COMPANY_CD */
	public String m_h_COMPANY_CD = null;
	/** 第 26 変数： m_JOB_ODR_SET_FLG */
	public String m_JOB_ODR_SET_FLG = null;
	/** 第 27 変数： m_l2_PLANT_NAME */
	public String m_l2_PLANT_NAME = null;
	/** 第 28 変数： m_l2_JOB_ODR_DLV_DATE */
	public String m_l2_JOB_ODR_DLV_DATE = null;
	/** 第 29 変数： m_l2_JOB_ODR_QTY */
	public String m_l2_JOB_ODR_QTY = null;
	/** 第 30 変数： m_l2_JOB_ODR_STS_TYP */
	public String m_l2_JOB_ODR_STS_TYP = null;
	/** 第 31 変数： m_l2_PLANT_CD */
	public String m_l2_PLANT_CD = null;
	/** 第 32 変数： m_l2_ALCD_ENABLE_QTY */
	public String m_l2_ALCD_ENABLE_QTY = null;
	/** 第 33 変数： m_l2_h_JOB_ODR_CD */
	public String m_l2_h_JOB_ODR_CD = null;
	/** 第 34 変数： m_w_JOB_ODR_CD */
	public String m_w_JOB_ODR_CD = null;
	/** 第 35 変数： m_h_JOB_ODR_STS_TYP */
	public String m_h_JOB_ODR_STS_TYP = null;
	/** 第 36 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 37 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 38 変数： m_SEL_MODIFY_COUNT */
	public String m_SEL_MODIFY_COUNT = null;
	/** 第 39 変数： m_SEL_JOB_ODR_CD */
	public String m_SEL_JOB_ODR_CD = null;
	/** 第 40 変数： m_SET_JOB_ODR_CD */
	public String m_SET_JOB_ODR_CD = null;
	/** 第 41 変数： m_SEL_ODR_NO */
	public String m_SEL_ODR_NO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r2_JOB_ODR_SET_FLG */
	public List l_r2_JOB_ODR_SET_FLG = null;

	/** 第 2 List変数： l_r1_JOB_ODR_SET_FLG */
	public List l_r1_JOB_ODR_SET_FLG = null;

	/** 第 3 List変数： l_c_JOB_ODR_STS_TYP */
	public List l_c_JOB_ODR_STS_TYP = null;

	/** 第 4 List変数： l_h_JOB_ODR_DLV_DATE */
	public List l_h_JOB_ODR_DLV_DATE = null;

	/** 第 5 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 6 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 7 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 8 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 9 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 10 List変数： l_l1_ODR_NO */
	public List l_l1_ODR_NO = null;

	/** 第 11 List変数： l_l1_CUST_NAME */
	public List l_l1_CUST_NAME = null;

	/** 第 12 List変数： l_l1_DLV_LOC_NAME */
	public List l_l1_DLV_LOC_NAME = null;

	/** 第 13 List変数： l_l1_DESINATED_DLV_DATE */
	public List l_l1_DESINATED_DLV_DATE = null;

	/** 第 14 List変数： l_l1_ODR_QTY */
	public List l_l1_ODR_QTY = null;

	/** 第 15 List変数： l_l1_JOB_ODR_CD */
	public List l_l1_JOB_ODR_CD = null;

	/** 第 16 List変数： l_l1_PLANT_CD */
	public List l_l1_PLANT_CD = null;

	/** 第 17 List変数： l_l1_ODR_STATUS_TYP */
	public List l_l1_ODR_STATUS_TYP = null;

	/** 第 18 List変数： l_l1_MODIFY_COUNT */
	public List l_l1_MODIFY_COUNT = null;

	/** 第 19 List変数： l_w_CUST_CD */
	public List l_w_CUST_CD = null;

	/** 第 20 List変数： l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** 第 21 List変数： l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** 第 22 List変数： l_w_ODR_NO */
	public List l_w_ODR_NO = null;

	/** 第 23 List変数： l_h_JOB_ODR_SET_FLG */
	public List l_h_JOB_ODR_SET_FLG = null;

	/** 第 24 List変数： l_l2_JOB_ODR_CD */
	public List l_l2_JOB_ODR_CD = null;

	/** 第 25 List変数： l_h_COMPANY_CD */
	public List l_h_COMPANY_CD = null;

	/** 第 26 List変数： l_JOB_ODR_SET_FLG */
	public List l_JOB_ODR_SET_FLG = null;

	/** 第 27 List変数： l_l2_PLANT_NAME */
	public List l_l2_PLANT_NAME = null;

	/** 第 28 List変数： l_l2_JOB_ODR_DLV_DATE */
	public List l_l2_JOB_ODR_DLV_DATE = null;

	/** 第 29 List変数： l_l2_JOB_ODR_QTY */
	public List l_l2_JOB_ODR_QTY = null;

	/** 第 30 List変数： l_l2_JOB_ODR_STS_TYP */
	public List l_l2_JOB_ODR_STS_TYP = null;

	/** 第 31 List変数： l_l2_PLANT_CD */
	public List l_l2_PLANT_CD = null;

	/** 第 32 List変数： l_l2_ALCD_ENABLE_QTY */
	public List l_l2_ALCD_ENABLE_QTY = null;

	/** 第 33 List変数： l_l2_h_JOB_ODR_CD */
	public List l_l2_h_JOB_ODR_CD = null;

	/** 第 34 List変数： l_w_JOB_ODR_CD */
	public List l_w_JOB_ODR_CD = null;

	/** 第 35 List変数： l_h_JOB_ODR_STS_TYP */
	public List l_h_JOB_ODR_STS_TYP = null;

	/** 第 36 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 37 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 38 List変数： l_SEL_MODIFY_COUNT */
	public List l_SEL_MODIFY_COUNT = null;

	/** 第 39 List変数： l_SEL_JOB_ODR_CD */
	public List l_SEL_JOB_ODR_CD = null;

	/** 第 40 List変数： l_SET_JOB_ODR_CD */
	public List l_SET_JOB_ODR_CD = null;

	/** 第 41 List変数： l_SEL_ODR_NO */
	public List l_SEL_ODR_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr2_JOB_ODR_SET_FLG() { return m_r2_JOB_ODR_SET_FLG; }
	public String getr1_JOB_ODR_SET_FLG() { return m_r1_JOB_ODR_SET_FLG; }
	public String getc_JOB_ODR_STS_TYP() { return m_c_JOB_ODR_STS_TYP; }
	public String geth_JOB_ODR_DLV_DATE() { return m_h_JOB_ODR_DLV_DATE; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getl1_ODR_NO() { return m_l1_ODR_NO; }
	public String getl1_CUST_NAME() { return m_l1_CUST_NAME; }
	public String getl1_DLV_LOC_NAME() { return m_l1_DLV_LOC_NAME; }
	public String getl1_DESINATED_DLV_DATE() { return m_l1_DESINATED_DLV_DATE; }
	public String getl1_ODR_QTY() { return m_l1_ODR_QTY; }
	public String getl1_JOB_ODR_CD() { return m_l1_JOB_ODR_CD; }
	public String getl1_PLANT_CD() { return m_l1_PLANT_CD; }
	public String getl1_ODR_STATUS_TYP() { return m_l1_ODR_STATUS_TYP; }
	public String getl1_MODIFY_COUNT() { return m_l1_MODIFY_COUNT; }
	public String getw_CUST_CD() { return m_w_CUST_CD; }
	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getw_ODR_NO() { return m_w_ODR_NO; }
	public String geth_JOB_ODR_SET_FLG() { return m_h_JOB_ODR_SET_FLG; }
	public String getl2_JOB_ODR_CD() { return m_l2_JOB_ODR_CD; }
	public String geth_COMPANY_CD() { return m_h_COMPANY_CD; }
	public String getJOB_ODR_SET_FLG() { return m_JOB_ODR_SET_FLG; }
	public String getl2_PLANT_NAME() { return m_l2_PLANT_NAME; }
	public String getl2_JOB_ODR_DLV_DATE() { return m_l2_JOB_ODR_DLV_DATE; }
	public String getl2_JOB_ODR_QTY() { return m_l2_JOB_ODR_QTY; }
	public String getl2_JOB_ODR_STS_TYP() { return m_l2_JOB_ODR_STS_TYP; }
	public String getl2_PLANT_CD() { return m_l2_PLANT_CD; }
	public String getl2_ALCD_ENABLE_QTY() { return m_l2_ALCD_ENABLE_QTY; }
	public String getl2_h_JOB_ODR_CD() { return m_l2_h_JOB_ODR_CD; }
	public String getw_JOB_ODR_CD() { return m_w_JOB_ODR_CD; }
	public String geth_JOB_ODR_STS_TYP() { return m_h_JOB_ODR_STS_TYP; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getSEL_MODIFY_COUNT() { return m_SEL_MODIFY_COUNT; }
	public String getSEL_JOB_ODR_CD() { return m_SEL_JOB_ODR_CD; }
	public String getSET_JOB_ODR_CD() { return m_SET_JOB_ODR_CD; }
	public String getSEL_ODR_NO() { return m_SEL_ODR_NO; }

	public List getList_r2_JOB_ODR_SET_FLG() { return l_r2_JOB_ODR_SET_FLG; }
	public List getList_r1_JOB_ODR_SET_FLG() { return l_r1_JOB_ODR_SET_FLG; }
	public List getList_c_JOB_ODR_STS_TYP() { return l_c_JOB_ODR_STS_TYP; }
	public List getList_h_JOB_ODR_DLV_DATE() { return l_h_JOB_ODR_DLV_DATE; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_l1_ODR_NO() { return l_l1_ODR_NO; }
	public List getList_l1_CUST_NAME() { return l_l1_CUST_NAME; }
	public List getList_l1_DLV_LOC_NAME() { return l_l1_DLV_LOC_NAME; }
	public List getList_l1_DESINATED_DLV_DATE() { return l_l1_DESINATED_DLV_DATE; }
	public List getList_l1_ODR_QTY() { return l_l1_ODR_QTY; }
	public List getList_l1_JOB_ODR_CD() { return l_l1_JOB_ODR_CD; }
	public List getList_l1_PLANT_CD() { return l_l1_PLANT_CD; }
	public List getList_l1_ODR_STATUS_TYP() { return l_l1_ODR_STATUS_TYP; }
	public List getList_l1_MODIFY_COUNT() { return l_l1_MODIFY_COUNT; }
	public List getList_w_CUST_CD() { return l_w_CUST_CD; }
	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_w_ODR_NO() { return l_w_ODR_NO; }
	public List getList_h_JOB_ODR_SET_FLG() { return l_h_JOB_ODR_SET_FLG; }
	public List getList_l2_JOB_ODR_CD() { return l_l2_JOB_ODR_CD; }
	public List getList_h_COMPANY_CD() { return l_h_COMPANY_CD; }
	public List getList_JOB_ODR_SET_FLG() { return l_JOB_ODR_SET_FLG; }
	public List getList_l2_PLANT_NAME() { return l_l2_PLANT_NAME; }
	public List getList_l2_JOB_ODR_DLV_DATE() { return l_l2_JOB_ODR_DLV_DATE; }
	public List getList_l2_JOB_ODR_QTY() { return l_l2_JOB_ODR_QTY; }
	public List getList_l2_JOB_ODR_STS_TYP() { return l_l2_JOB_ODR_STS_TYP; }
	public List getList_l2_PLANT_CD() { return l_l2_PLANT_CD; }
	public List getList_l2_ALCD_ENABLE_QTY() { return l_l2_ALCD_ENABLE_QTY; }
	public List getList_l2_h_JOB_ODR_CD() { return l_l2_h_JOB_ODR_CD; }
	public List getList_w_JOB_ODR_CD() { return l_w_JOB_ODR_CD; }
	public List getList_h_JOB_ODR_STS_TYP() { return l_h_JOB_ODR_STS_TYP; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_SEL_MODIFY_COUNT() { return l_SEL_MODIFY_COUNT; }
	public List getList_SEL_JOB_ODR_CD() { return l_SEL_JOB_ODR_CD; }
	public List getList_SET_JOB_ODR_CD() { return l_SET_JOB_ODR_CD; }
	public List getList_SEL_ODR_NO() { return l_SEL_ODR_NO; }

	public void setr2_JOB_ODR_SET_FLG(String val) { m_r2_JOB_ODR_SET_FLG = val; }
	public void setr1_JOB_ODR_SET_FLG(String val) { m_r1_JOB_ODR_SET_FLG = val; }
	public void setc_JOB_ODR_STS_TYP(String val) { m_c_JOB_ODR_STS_TYP = val; }
	public void seth_JOB_ODR_DLV_DATE(String val) { m_h_JOB_ODR_DLV_DATE = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setl1_ODR_NO(String val) { m_l1_ODR_NO = val; }
	public void setl1_CUST_NAME(String val) { m_l1_CUST_NAME = val; }
	public void setl1_DLV_LOC_NAME(String val) { m_l1_DLV_LOC_NAME = val; }
	public void setl1_DESINATED_DLV_DATE(String val) { m_l1_DESINATED_DLV_DATE = val; }
	public void setl1_ODR_QTY(String val) { m_l1_ODR_QTY = val; }
	public void setl1_JOB_ODR_CD(String val) { m_l1_JOB_ODR_CD = val; }
	public void setl1_PLANT_CD(String val) { m_l1_PLANT_CD = val; }
	public void setl1_ODR_STATUS_TYP(String val) { m_l1_ODR_STATUS_TYP = val; }
	public void setl1_MODIFY_COUNT(String val) { m_l1_MODIFY_COUNT = val; }
	public void setw_CUST_CD(String val) { m_w_CUST_CD = val; }
	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setw_ODR_NO(String val) { m_w_ODR_NO = val; }
	public void seth_JOB_ODR_SET_FLG(String val) { m_h_JOB_ODR_SET_FLG = val; }
	public void setl2_JOB_ODR_CD(String val) { m_l2_JOB_ODR_CD = val; }
	public void seth_COMPANY_CD(String val) { m_h_COMPANY_CD = val; }
	public void setJOB_ODR_SET_FLG(String val) { m_JOB_ODR_SET_FLG = val; }
	public void setl2_PLANT_NAME(String val) { m_l2_PLANT_NAME = val; }
	public void setl2_JOB_ODR_DLV_DATE(String val) { m_l2_JOB_ODR_DLV_DATE = val; }
	public void setl2_JOB_ODR_QTY(String val) { m_l2_JOB_ODR_QTY = val; }
	public void setl2_JOB_ODR_STS_TYP(String val) { m_l2_JOB_ODR_STS_TYP = val; }
	public void setl2_PLANT_CD(String val) { m_l2_PLANT_CD = val; }
	public void setl2_ALCD_ENABLE_QTY(String val) { m_l2_ALCD_ENABLE_QTY = val; }
	public void setl2_h_JOB_ODR_CD(String val) { m_l2_h_JOB_ODR_CD = val; }
	public void setw_JOB_ODR_CD(String val) { m_w_JOB_ODR_CD = val; }
	public void seth_JOB_ODR_STS_TYP(String val) { m_h_JOB_ODR_STS_TYP = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setSEL_MODIFY_COUNT(String val) { m_SEL_MODIFY_COUNT = val; }
	public void setSEL_JOB_ODR_CD(String val) { m_SEL_JOB_ODR_CD = val; }
	public void setSET_JOB_ODR_CD(String val) { m_SET_JOB_ODR_CD = val; }
	public void setSEL_ODR_NO(String val) { m_SEL_ODR_NO = val; }


	public void setList_r2_JOB_ODR_SET_FLG(List list) { l_r2_JOB_ODR_SET_FLG = list; }
	public void setList_r1_JOB_ODR_SET_FLG(List list) { l_r1_JOB_ODR_SET_FLG = list; }
	public void setList_c_JOB_ODR_STS_TYP(List list) { l_c_JOB_ODR_STS_TYP = list; }
	public void setList_h_JOB_ODR_DLV_DATE(List list) { l_h_JOB_ODR_DLV_DATE = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_l1_ODR_NO(List list) { l_l1_ODR_NO = list; }
	public void setList_l1_CUST_NAME(List list) { l_l1_CUST_NAME = list; }
	public void setList_l1_DLV_LOC_NAME(List list) { l_l1_DLV_LOC_NAME = list; }
	public void setList_l1_DESINATED_DLV_DATE(List list) { l_l1_DESINATED_DLV_DATE = list; }
	public void setList_l1_ODR_QTY(List list) { l_l1_ODR_QTY = list; }
	public void setList_l1_JOB_ODR_CD(List list) { l_l1_JOB_ODR_CD = list; }
	public void setList_l1_PLANT_CD(List list) { l_l1_PLANT_CD = list; }
	public void setList_l1_ODR_STATUS_TYP(List list) { l_l1_ODR_STATUS_TYP = list; }
	public void setList_l1_MODIFY_COUNT(List list) { l_l1_MODIFY_COUNT = list; }
	public void setList_w_CUST_CD(List list) { l_w_CUST_CD = list; }
	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_w_ODR_NO(List list) { l_w_ODR_NO = list; }
	public void setList_h_JOB_ODR_SET_FLG(List list) { l_h_JOB_ODR_SET_FLG = list; }
	public void setList_l2_JOB_ODR_CD(List list) { l_l2_JOB_ODR_CD = list; }
	public void setList_h_COMPANY_CD(List list) { l_h_COMPANY_CD = list; }
	public void setList_JOB_ODR_SET_FLG(List list) { l_JOB_ODR_SET_FLG = list; }
	public void setList_l2_PLANT_NAME(List list) { l_l2_PLANT_NAME = list; }
	public void setList_l2_JOB_ODR_DLV_DATE(List list) { l_l2_JOB_ODR_DLV_DATE = list; }
	public void setList_l2_JOB_ODR_QTY(List list) { l_l2_JOB_ODR_QTY = list; }
	public void setList_l2_JOB_ODR_STS_TYP(List list) { l_l2_JOB_ODR_STS_TYP = list; }
	public void setList_l2_PLANT_CD(List list) { l_l2_PLANT_CD = list; }
	public void setList_l2_ALCD_ENABLE_QTY(List list) { l_l2_ALCD_ENABLE_QTY = list; }
	public void setList_l2_h_JOB_ODR_CD(List list) { l_l2_h_JOB_ODR_CD = list; }
	public void setList_w_JOB_ODR_CD(List list) { l_w_JOB_ODR_CD = list; }
	public void setList_h_JOB_ODR_STS_TYP(List list) { l_h_JOB_ODR_STS_TYP = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_SEL_MODIFY_COUNT(List list) { l_SEL_MODIFY_COUNT = list; }
	public void setList_SEL_JOB_ODR_CD(List list) { l_SEL_JOB_ODR_CD = list; }
	public void setList_SET_JOB_ODR_CD(List list) { l_SET_JOB_ODR_CD = list; }
	public void setList_SEL_ODR_NO(List list) { l_SEL_ODR_NO = list; }

	public int setL2L_r2_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_JOB_ODR_SET_FLG == null) {
			l_r2_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_r2_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_JOB_ODR_SET_FLG.add(((KQ0080010Struct) list.get(i)).getr2_JOB_ODR_SET_FLG());
		}
		return size;
	}
	public int setL2L_r1_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_JOB_ODR_SET_FLG == null) {
			l_r1_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_r1_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_JOB_ODR_SET_FLG.add(((KQ0080010Struct) list.get(i)).getr1_JOB_ODR_SET_FLG());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_STS_TYP == null) {
			l_c_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_c_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_STS_TYP.add(((KQ0080010Struct) list.get(i)).getc_JOB_ODR_STS_TYP());
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
			l_h_JOB_ODR_DLV_DATE.add(((KQ0080010Struct) list.get(i)).geth_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((KQ0080010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((KQ0080010Struct) list.get(i)).getw_PLANT_CD());
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
			l_PLANT_NAME.add(((KQ0080010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((KQ0080010Struct) list.get(i)).getw_ITEM_CD());
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
			l_ITEM_NAME.add(((KQ0080010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_l1_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_ODR_NO == null) {
			l_l1_ODR_NO = new ArrayList();
		} else {
			l_l1_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_ODR_NO.add(((KQ0080010Struct) list.get(i)).getl1_ODR_NO());
		}
		return size;
	}
	public int setL2L_l1_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_CUST_NAME == null) {
			l_l1_CUST_NAME = new ArrayList();
		} else {
			l_l1_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_CUST_NAME.add(((KQ0080010Struct) list.get(i)).getl1_CUST_NAME());
		}
		return size;
	}
	public int setL2L_l1_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_DLV_LOC_NAME == null) {
			l_l1_DLV_LOC_NAME = new ArrayList();
		} else {
			l_l1_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_DLV_LOC_NAME.add(((KQ0080010Struct) list.get(i)).getl1_DLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_l1_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_DESINATED_DLV_DATE == null) {
			l_l1_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_l1_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_DESINATED_DLV_DATE.add(((KQ0080010Struct) list.get(i)).getl1_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l1_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_ODR_QTY == null) {
			l_l1_ODR_QTY = new ArrayList();
		} else {
			l_l1_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_ODR_QTY.add(((KQ0080010Struct) list.get(i)).getl1_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l1_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_JOB_ODR_CD == null) {
			l_l1_JOB_ODR_CD = new ArrayList();
		} else {
			l_l1_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getl1_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l1_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_PLANT_CD == null) {
			l_l1_PLANT_CD = new ArrayList();
		} else {
			l_l1_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_PLANT_CD.add(((KQ0080010Struct) list.get(i)).getl1_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l1_ODR_STATUS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_ODR_STATUS_TYP == null) {
			l_l1_ODR_STATUS_TYP = new ArrayList();
		} else {
			l_l1_ODR_STATUS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_ODR_STATUS_TYP.add(((KQ0080010Struct) list.get(i)).getl1_ODR_STATUS_TYP());
		}
		return size;
	}
	public int setL2L_l1_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l1_MODIFY_COUNT == null) {
			l_l1_MODIFY_COUNT = new ArrayList();
		} else {
			l_l1_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l1_MODIFY_COUNT.add(((KQ0080010Struct) list.get(i)).getl1_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CUST_CD == null) {
			l_w_CUST_CD = new ArrayList();
		} else {
			l_w_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CUST_CD.add(((KQ0080010Struct) list.get(i)).getw_CUST_CD());
		}
		return size;
	}
	public int setL2L_w_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM == null) {
			l_w_DATE_FROM = new ArrayList();
		} else {
			l_w_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM.add(((KQ0080010Struct) list.get(i)).getw_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO == null) {
			l_w_DATE_TO = new ArrayList();
		} else {
			l_w_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO.add(((KQ0080010Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_NO == null) {
			l_w_ODR_NO = new ArrayList();
		} else {
			l_w_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_NO.add(((KQ0080010Struct) list.get(i)).getw_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_SET_FLG == null) {
			l_h_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_h_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_SET_FLG.add(((KQ0080010Struct) list.get(i)).geth_JOB_ODR_SET_FLG());
		}
		return size;
	}
	public int setL2L_l2_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_JOB_ODR_CD == null) {
			l_l2_JOB_ODR_CD = new ArrayList();
		} else {
			l_l2_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getl2_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COMPANY_CD == null) {
			l_h_COMPANY_CD = new ArrayList();
		} else {
			l_h_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COMPANY_CD.add(((KQ0080010Struct) list.get(i)).geth_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_SET_FLG == null) {
			l_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_SET_FLG.add(((KQ0080010Struct) list.get(i)).getJOB_ODR_SET_FLG());
		}
		return size;
	}
	public int setL2L_l2_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_PLANT_NAME == null) {
			l_l2_PLANT_NAME = new ArrayList();
		} else {
			l_l2_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_PLANT_NAME.add(((KQ0080010Struct) list.get(i)).getl2_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_l2_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_JOB_ODR_DLV_DATE == null) {
			l_l2_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l2_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_JOB_ODR_DLV_DATE.add(((KQ0080010Struct) list.get(i)).getl2_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l2_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_JOB_ODR_QTY == null) {
			l_l2_JOB_ODR_QTY = new ArrayList();
		} else {
			l_l2_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_JOB_ODR_QTY.add(((KQ0080010Struct) list.get(i)).getl2_JOB_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l2_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_JOB_ODR_STS_TYP == null) {
			l_l2_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_l2_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_JOB_ODR_STS_TYP.add(((KQ0080010Struct) list.get(i)).getl2_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_l2_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_PLANT_CD == null) {
			l_l2_PLANT_CD = new ArrayList();
		} else {
			l_l2_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_PLANT_CD.add(((KQ0080010Struct) list.get(i)).getl2_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l2_ALCD_ENABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_ALCD_ENABLE_QTY == null) {
			l_l2_ALCD_ENABLE_QTY = new ArrayList();
		} else {
			l_l2_ALCD_ENABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_ALCD_ENABLE_QTY.add(((KQ0080010Struct) list.get(i)).getl2_ALCD_ENABLE_QTY());
		}
		return size;
	}
	public int setL2L_l2_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l2_h_JOB_ODR_CD == null) {
			l_l2_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_l2_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l2_h_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getl2_h_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_CD == null) {
			l_w_JOB_ODR_CD = new ArrayList();
		} else {
			l_w_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getw_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_STS_TYP == null) {
			l_h_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_h_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_STS_TYP.add(((KQ0080010Struct) list.get(i)).geth_JOB_ODR_STS_TYP());
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
			l_l_COUNT.add(((KQ0080010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KQ0080010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_SEL_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_MODIFY_COUNT == null) {
			l_SEL_MODIFY_COUNT = new ArrayList();
		} else {
			l_SEL_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_MODIFY_COUNT.add(((KQ0080010Struct) list.get(i)).getSEL_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_SEL_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_JOB_ODR_CD == null) {
			l_SEL_JOB_ODR_CD = new ArrayList();
		} else {
			l_SEL_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getSEL_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SET_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SET_JOB_ODR_CD == null) {
			l_SET_JOB_ODR_CD = new ArrayList();
		} else {
			l_SET_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SET_JOB_ODR_CD.add(((KQ0080010Struct) list.get(i)).getSET_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SEL_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_ODR_NO == null) {
			l_SEL_ODR_NO = new ArrayList();
		} else {
			l_SEL_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_ODR_NO.add(((KQ0080010Struct) list.get(i)).getSEL_ODR_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r2_JOB_ODR_SET_FLG = null;
		m_r1_JOB_ODR_SET_FLG = null;
		m_c_JOB_ODR_STS_TYP = null;
		m_h_JOB_ODR_DLV_DATE = null;
		m_h_PLANT_CD = null;
		m_w_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_w_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_l1_ODR_NO = null;
		m_l1_CUST_NAME = null;
		m_l1_DLV_LOC_NAME = null;
		m_l1_DESINATED_DLV_DATE = null;
		m_l1_ODR_QTY = null;
		m_l1_JOB_ODR_CD = null;
		m_l1_PLANT_CD = null;
		m_l1_ODR_STATUS_TYP = null;
		m_l1_MODIFY_COUNT = null;
		m_w_CUST_CD = null;
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_w_ODR_NO = null;
		m_h_JOB_ODR_SET_FLG = null;
		m_l2_JOB_ODR_CD = null;
		m_h_COMPANY_CD = null;
		m_JOB_ODR_SET_FLG = null;
		m_l2_PLANT_NAME = null;
		m_l2_JOB_ODR_DLV_DATE = null;
		m_l2_JOB_ODR_QTY = null;
		m_l2_JOB_ODR_STS_TYP = null;
		m_l2_PLANT_CD = null;
		m_l2_ALCD_ENABLE_QTY = null;
		m_l2_h_JOB_ODR_CD = null;
		m_w_JOB_ODR_CD = null;
		m_h_JOB_ODR_STS_TYP = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_SEL_MODIFY_COUNT = null;
		m_SEL_JOB_ODR_CD = null;
		m_SET_JOB_ODR_CD = null;
		m_SEL_ODR_NO = null;

		l_r2_JOB_ODR_SET_FLG = null;
		l_r1_JOB_ODR_SET_FLG = null;
		l_c_JOB_ODR_STS_TYP = null;
		l_h_JOB_ODR_DLV_DATE = null;
		l_h_PLANT_CD = null;
		l_w_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_w_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_l1_ODR_NO = null;
		l_l1_CUST_NAME = null;
		l_l1_DLV_LOC_NAME = null;
		l_l1_DESINATED_DLV_DATE = null;
		l_l1_ODR_QTY = null;
		l_l1_JOB_ODR_CD = null;
		l_l1_PLANT_CD = null;
		l_l1_ODR_STATUS_TYP = null;
		l_l1_MODIFY_COUNT = null;
		l_w_CUST_CD = null;
		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_w_ODR_NO = null;
		l_h_JOB_ODR_SET_FLG = null;
		l_l2_JOB_ODR_CD = null;
		l_h_COMPANY_CD = null;
		l_JOB_ODR_SET_FLG = null;
		l_l2_PLANT_NAME = null;
		l_l2_JOB_ODR_DLV_DATE = null;
		l_l2_JOB_ODR_QTY = null;
		l_l2_JOB_ODR_STS_TYP = null;
		l_l2_PLANT_CD = null;
		l_l2_ALCD_ENABLE_QTY = null;
		l_l2_h_JOB_ODR_CD = null;
		l_w_JOB_ODR_CD = null;
		l_h_JOB_ODR_STS_TYP = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_SEL_MODIFY_COUNT = null;
		l_SEL_JOB_ODR_CD = null;
		l_SET_JOB_ODR_CD = null;
		l_SEL_ODR_NO = null;

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
	 * medKQ0080010クラスの標準コンストラクタ
	 */
	public KQ0080010Struct()
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
	public void setStruct(KQ0080010Struct struct)
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
	public void setStructM(KQ0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr2_JOB_ODR_SET_FLG(struct.getr2_JOB_ODR_SET_FLG());
			this.setr1_JOB_ODR_SET_FLG(struct.getr1_JOB_ODR_SET_FLG());
			this.setc_JOB_ODR_STS_TYP(struct.getc_JOB_ODR_STS_TYP());
			this.seth_JOB_ODR_DLV_DATE(struct.geth_JOB_ODR_DLV_DATE());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setl1_ODR_NO(struct.getl1_ODR_NO());
			this.setl1_CUST_NAME(struct.getl1_CUST_NAME());
			this.setl1_DLV_LOC_NAME(struct.getl1_DLV_LOC_NAME());
			this.setl1_DESINATED_DLV_DATE(struct.getl1_DESINATED_DLV_DATE());
			this.setl1_ODR_QTY(struct.getl1_ODR_QTY());
			this.setl1_JOB_ODR_CD(struct.getl1_JOB_ODR_CD());
			this.setl1_PLANT_CD(struct.getl1_PLANT_CD());
			this.setl1_ODR_STATUS_TYP(struct.getl1_ODR_STATUS_TYP());
			this.setl1_MODIFY_COUNT(struct.getl1_MODIFY_COUNT());
			this.setw_CUST_CD(struct.getw_CUST_CD());
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setw_ODR_NO(struct.getw_ODR_NO());
			this.seth_JOB_ODR_SET_FLG(struct.geth_JOB_ODR_SET_FLG());
			this.setl2_JOB_ODR_CD(struct.getl2_JOB_ODR_CD());
			this.seth_COMPANY_CD(struct.geth_COMPANY_CD());
			this.setJOB_ODR_SET_FLG(struct.getJOB_ODR_SET_FLG());
			this.setl2_PLANT_NAME(struct.getl2_PLANT_NAME());
			this.setl2_JOB_ODR_DLV_DATE(struct.getl2_JOB_ODR_DLV_DATE());
			this.setl2_JOB_ODR_QTY(struct.getl2_JOB_ODR_QTY());
			this.setl2_JOB_ODR_STS_TYP(struct.getl2_JOB_ODR_STS_TYP());
			this.setl2_PLANT_CD(struct.getl2_PLANT_CD());
			this.setl2_ALCD_ENABLE_QTY(struct.getl2_ALCD_ENABLE_QTY());
			this.setl2_h_JOB_ODR_CD(struct.getl2_h_JOB_ODR_CD());
			this.setw_JOB_ODR_CD(struct.getw_JOB_ODR_CD());
			this.seth_JOB_ODR_STS_TYP(struct.geth_JOB_ODR_STS_TYP());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setSEL_MODIFY_COUNT(struct.getSEL_MODIFY_COUNT());
			this.setSEL_JOB_ODR_CD(struct.getSEL_JOB_ODR_CD());
			this.setSET_JOB_ODR_CD(struct.getSET_JOB_ODR_CD());
			this.setSEL_ODR_NO(struct.getSEL_ODR_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KQ0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r2_JOB_ODR_SET_FLG(struct.getList_r2_JOB_ODR_SET_FLG());
			this.setList_r1_JOB_ODR_SET_FLG(struct.getList_r1_JOB_ODR_SET_FLG());
			this.setList_c_JOB_ODR_STS_TYP(struct.getList_c_JOB_ODR_STS_TYP());
			this.setList_h_JOB_ODR_DLV_DATE(struct.getList_h_JOB_ODR_DLV_DATE());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_l1_ODR_NO(struct.getList_l1_ODR_NO());
			this.setList_l1_CUST_NAME(struct.getList_l1_CUST_NAME());
			this.setList_l1_DLV_LOC_NAME(struct.getList_l1_DLV_LOC_NAME());
			this.setList_l1_DESINATED_DLV_DATE(struct.getList_l1_DESINATED_DLV_DATE());
			this.setList_l1_ODR_QTY(struct.getList_l1_ODR_QTY());
			this.setList_l1_JOB_ODR_CD(struct.getList_l1_JOB_ODR_CD());
			this.setList_l1_PLANT_CD(struct.getList_l1_PLANT_CD());
			this.setList_l1_ODR_STATUS_TYP(struct.getList_l1_ODR_STATUS_TYP());
			this.setList_l1_MODIFY_COUNT(struct.getList_l1_MODIFY_COUNT());
			this.setList_w_CUST_CD(struct.getList_w_CUST_CD());
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_w_ODR_NO(struct.getList_w_ODR_NO());
			this.setList_h_JOB_ODR_SET_FLG(struct.getList_h_JOB_ODR_SET_FLG());
			this.setList_l2_JOB_ODR_CD(struct.getList_l2_JOB_ODR_CD());
			this.setList_h_COMPANY_CD(struct.getList_h_COMPANY_CD());
			this.setList_JOB_ODR_SET_FLG(struct.getList_JOB_ODR_SET_FLG());
			this.setList_l2_PLANT_NAME(struct.getList_l2_PLANT_NAME());
			this.setList_l2_JOB_ODR_DLV_DATE(struct.getList_l2_JOB_ODR_DLV_DATE());
			this.setList_l2_JOB_ODR_QTY(struct.getList_l2_JOB_ODR_QTY());
			this.setList_l2_JOB_ODR_STS_TYP(struct.getList_l2_JOB_ODR_STS_TYP());
			this.setList_l2_PLANT_CD(struct.getList_l2_PLANT_CD());
			this.setList_l2_ALCD_ENABLE_QTY(struct.getList_l2_ALCD_ENABLE_QTY());
			this.setList_l2_h_JOB_ODR_CD(struct.getList_l2_h_JOB_ODR_CD());
			this.setList_w_JOB_ODR_CD(struct.getList_w_JOB_ODR_CD());
			this.setList_h_JOB_ODR_STS_TYP(struct.getList_h_JOB_ODR_STS_TYP());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_SEL_MODIFY_COUNT(struct.getList_SEL_MODIFY_COUNT());
			this.setList_SEL_JOB_ODR_CD(struct.getList_SEL_JOB_ODR_CD());
			this.setList_SET_JOB_ODR_CD(struct.getList_SET_JOB_ODR_CD());
			this.setList_SEL_ODR_NO(struct.getList_SEL_ODR_NO());
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
	// 第 1 変数初期値： i_r2_JOB_ODR_SET_FLG


	final static String i_r2_JOB_ODR_SET_FLG = null;

	// 第 2 変数初期値： i_r1_JOB_ODR_SET_FLG


	final static String i_r1_JOB_ODR_SET_FLG = null;

	// 第 3 変数初期値： i_c_JOB_ODR_STS_TYP


	final static String i_c_JOB_ODR_STS_TYP = null;

	// 第 4 変数初期値： i_h_JOB_ODR_DLV_DATE


	final static String i_h_JOB_ODR_DLV_DATE = null;

	// 第 5 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 6 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 7 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 8 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 9 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 10 変数初期値： i_l1_ODR_NO


	final static String i_l1_ODR_NO = null;

	// 第 11 変数初期値： i_l1_CUST_NAME


	final static String i_l1_CUST_NAME = null;

	// 第 12 変数初期値： i_l1_DLV_LOC_NAME


	final static String i_l1_DLV_LOC_NAME = null;

	// 第 13 変数初期値： i_l1_DESINATED_DLV_DATE


	final static String i_l1_DESINATED_DLV_DATE = null;

	// 第 14 変数初期値： i_l1_ODR_QTY


	final static String i_l1_ODR_QTY = null;

	// 第 15 変数初期値： i_l1_JOB_ODR_CD


	final static String i_l1_JOB_ODR_CD = null;

	// 第 16 変数初期値： i_l1_PLANT_CD


	final static String i_l1_PLANT_CD = null;

	// 第 17 変数初期値： i_l1_ODR_STATUS_TYP


	final static String i_l1_ODR_STATUS_TYP = null;

	// 第 18 変数初期値： i_l1_MODIFY_COUNT


	final static String i_l1_MODIFY_COUNT = null;

	// 第 19 変数初期値： i_w_CUST_CD


	final static String i_w_CUST_CD = null;

	// 第 20 変数初期値： i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// 第 21 変数初期値： i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// 第 22 変数初期値： i_w_ODR_NO


	final static String i_w_ODR_NO = null;

	// 第 23 変数初期値： i_h_JOB_ODR_SET_FLG


	final static String i_h_JOB_ODR_SET_FLG = null;

	// 第 24 変数初期値： i_l2_JOB_ODR_CD


	final static String i_l2_JOB_ODR_CD = null;

	// 第 25 変数初期値： i_h_COMPANY_CD


	final static String i_h_COMPANY_CD = null;

	// 第 26 変数初期値： i_JOB_ODR_SET_FLG


	final static String i_JOB_ODR_SET_FLG = null;

	// 第 27 変数初期値： i_l2_PLANT_NAME


	final static String i_l2_PLANT_NAME = null;

	// 第 28 変数初期値： i_l2_JOB_ODR_DLV_DATE


	final static String i_l2_JOB_ODR_DLV_DATE = null;

	// 第 29 変数初期値： i_l2_JOB_ODR_QTY


	final static String i_l2_JOB_ODR_QTY = null;

	// 第 30 変数初期値： i_l2_JOB_ODR_STS_TYP


	final static String i_l2_JOB_ODR_STS_TYP = null;

	// 第 31 変数初期値： i_l2_PLANT_CD


	final static String i_l2_PLANT_CD = null;

	// 第 32 変数初期値： i_l2_ALCD_ENABLE_QTY


	final static String i_l2_ALCD_ENABLE_QTY = null;

	// 第 33 変数初期値： i_l2_h_JOB_ODR_CD


	final static String i_l2_h_JOB_ODR_CD = null;

	// 第 34 変数初期値： i_w_JOB_ODR_CD


	final static String i_w_JOB_ODR_CD = null;

	// 第 35 変数初期値： i_h_JOB_ODR_STS_TYP


	final static String i_h_JOB_ODR_STS_TYP = null;

	// 第 36 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 37 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 38 変数初期値： i_SEL_MODIFY_COUNT


	final static String i_SEL_MODIFY_COUNT = null;

	// 第 39 変数初期値： i_SEL_JOB_ODR_CD


	final static String i_SEL_JOB_ODR_CD = null;

	// 第 40 変数初期値： i_SET_JOB_ODR_CD


	final static String i_SET_JOB_ODR_CD = null;

	// 第 41 変数初期値： i_SEL_ODR_NO


	final static String i_SEL_ODR_NO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r2_JOB_ODR_SET_FLG

	final static String i_r2_JOB_ODR_SET_FLG = null;

	// 第 2 変数初期値： i_r1_JOB_ODR_SET_FLG

	final static String i_r1_JOB_ODR_SET_FLG = null;

	// 第 3 変数初期値： i_c_JOB_ODR_STS_TYP

	final static String i_c_JOB_ODR_STS_TYP = null;

	// 第 4 変数初期値： i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// 第 5 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 6 変数初期値： i_w_ITEM_CD

	final static String i_w_ITEM_CD = null;

	// 第 7 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 8 変数初期値： i_l1_ODR_NO

	final static String i_l1_ODR_NO = null;

	// 第 9 変数初期値： i_l1_CUST_NAME

	final static String i_l1_CUST_NAME = null;

	// 第 10 変数初期値： i_l1_DLV_LOC_NAME

	final static String i_l1_DLV_LOC_NAME = null;

	// 第 11 変数初期値： i_l1_DESINATED_DLV_DATE

	final static String i_l1_DESINATED_DLV_DATE = null;

	// 第 12 変数初期値： i_l1_ODR_QTY

	final static String i_l1_ODR_QTY = null;

	// 第 13 変数初期値： i_l1_JOB_ODR_CD

	final static String i_l1_JOB_ODR_CD = null;

	// 第 14 変数初期値： i_w_CUST_CD

	final static String i_w_CUST_CD = null;

	// 第 15 変数初期値： i_w_DATE_FROM

	final static String i_w_DATE_FROM = null;

	// 第 16 変数初期値： i_w_DATE_TO

	final static String i_w_DATE_TO = null;

	// 第 17 変数初期値： i_w_ODR_NO

	final static String i_w_ODR_NO = null;

	// 第 18 変数初期値： i_h_JOB_ODR_SET_FLG

	final static String i_h_JOB_ODR_SET_FLG = null;

	// 第 19 変数初期値： i_l2_JOB_ODR_CD

	final static String i_l2_JOB_ODR_CD = null;

	// 第 20 変数初期値： i_l2_PLANT_NAME

	final static String i_l2_PLANT_NAME = null;

	// 第 21 変数初期値： i_l2_JOB_ODR_DLV_DATE

	final static String i_l2_JOB_ODR_DLV_DATE = null;

	// 第 22 変数初期値： i_l2_JOB_ODR_QTY

	final static String i_l2_JOB_ODR_QTY = null;

	// 第 23 変数初期値： i_l2_SUM_ALCD_QTY

	final static String i_l2_SUM_ALCD_QTY = null;

	// 第 24 変数初期値： i_l2_JOB_ODR_STS_TYP

	final static String i_l2_JOB_ODR_STS_TYP = null;

	// 第 25 変数初期値： i_w_JOB_ODR_CD

	final static String i_w_JOB_ODR_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r2_JOB_ODR_SET_FLG = i_r2_JOB_ODR_SET_FLG;
		m_r1_JOB_ODR_SET_FLG = i_r1_JOB_ODR_SET_FLG;
		m_c_JOB_ODR_STS_TYP = i_c_JOB_ODR_STS_TYP;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_w_ITEM_CD = i_w_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_l1_ODR_NO = i_l1_ODR_NO;
		m_l1_CUST_NAME = i_l1_CUST_NAME;
		m_l1_DLV_LOC_NAME = i_l1_DLV_LOC_NAME;
		m_l1_DESINATED_DLV_DATE = i_l1_DESINATED_DLV_DATE;
		m_l1_ODR_QTY = i_l1_ODR_QTY;
		m_l1_JOB_ODR_CD = i_l1_JOB_ODR_CD;
		m_w_CUST_CD = i_w_CUST_CD;
		m_w_DATE_FROM = i_w_DATE_FROM;
		m_w_DATE_TO = i_w_DATE_TO;
		m_w_ODR_NO = i_w_ODR_NO;
		m_h_JOB_ODR_SET_FLG = i_h_JOB_ODR_SET_FLG;
		m_l2_JOB_ODR_CD = i_l2_JOB_ODR_CD;
		m_l2_PLANT_NAME = i_l2_PLANT_NAME;
		m_l2_JOB_ODR_DLV_DATE = i_l2_JOB_ODR_DLV_DATE;
		m_l2_JOB_ODR_QTY = i_l2_JOB_ODR_QTY;
		m_l2_JOB_ODR_STS_TYP = i_l2_JOB_ODR_STS_TYP;
		m_w_JOB_ODR_CD = i_w_JOB_ODR_CD;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
