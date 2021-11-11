/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KT0010/src/com/nec/jp/orteus/metamorBase/KT0010/KT0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KT0010;

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

public class KT0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_l_PARTIAL_SHIP_INST_FLG */
	public String m_l_PARTIAL_SHIP_INST_FLG = null;
	/** 第 2 変数： m_r1_STS_TYP */
	public String m_r1_STS_TYP = null;
	/** 第 3 変数： m_r2_STS_TYP */
	public String m_r2_STS_TYP = null;
	/** 第 4 変数： m_KT0010010view1_selected */
	public String m_KT0010010view1_selected = null;
	/** 第 5 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 6 変数： m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** 第 7 変数： m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** 第 8 変数： m_l_ODR_NO */
	public String m_l_ODR_NO = null;
	/** 第 9 変数： m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** 第 10 変数： m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** 第 11 変数： m_l_SHIP_PLAN_REMAIN_QTY */
	public String m_l_SHIP_PLAN_REMAIN_QTY = null;
	/** 第 12 変数： m_l_DESINATED_SHIP_QTY */
	public String m_l_DESINATED_SHIP_QTY = null;
	/** 第 13 変数： m_l_DEPO_TYP */
	public String m_l_DEPO_TYP = null;
	/** 第 14 変数： m_PARTIAL_SHIP_INST_FLG */
	public String m_PARTIAL_SHIP_INST_FLG = null;
	/** 第 15 変数： m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** 第 16 変数： m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** 第 17 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 18 変数： m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** 第 19 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 20 変数： m_l_PKG_UNIT */
	public String m_l_PKG_UNIT = null;
	/** 第 21 変数： m_l_UNIT_QTY_TYP */
	public String m_l_UNIT_QTY_TYP = null;
	/** 第 22 変数： m_l_CUST_NAME */
	public String m_l_CUST_NAME = null;
	/** 第 23 変数： m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** 第 24 変数： m_l_SHIP_WH_CD */
	public String m_l_SHIP_WH_CD = null;
	/** 第 25 変数： m_l_SHIP_PLANT_CD */
	public String m_l_SHIP_PLANT_CD = null;
	/** 第 26 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 27 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 28 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 29 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 30 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 31 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 32 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 33 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 34 変数： m_l_PART_DLV_SEQ_NO */
	public String m_l_PART_DLV_SEQ_NO = null;
	/** 第 35 変数： m_l_DESINATED_SHIP_DATE */
	public String m_l_DESINATED_SHIP_DATE = null;
	/** 第 36 変数： m_l_bk_DESINATED_SHIP_QTY */
	public String m_l_bk_DESINATED_SHIP_QTY = null;
	/** 第 37 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 38 変数： m_CODE */
	public String m_CODE = null;
	/** 第 39 変数： m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** 第 40 変数： m_l_TRANSPORT_LT */
	public String m_l_TRANSPORT_LT = null;
	/** 第 41 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 42 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_l_PARTIAL_SHIP_INST_FLG */
	public List l_l_PARTIAL_SHIP_INST_FLG = null;

	/** 第 2 List変数： l_r1_STS_TYP */
	public List l_r1_STS_TYP = null;

	/** 第 3 List変数： l_r2_STS_TYP */
	public List l_r2_STS_TYP = null;

	/** 第 4 List変数： l_KT0010010view1_selected */
	public List l_KT0010010view1_selected = null;

	/** 第 5 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 6 List変数： l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** 第 7 List変数： l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** 第 8 List変数： l_l_ODR_NO */
	public List l_l_ODR_NO = null;

	/** 第 9 List変数： l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** 第 10 List変数： l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** 第 11 List変数： l_l_SHIP_PLAN_REMAIN_QTY */
	public List l_l_SHIP_PLAN_REMAIN_QTY = null;

	/** 第 12 List変数： l_l_DESINATED_SHIP_QTY */
	public List l_l_DESINATED_SHIP_QTY = null;

	/** 第 13 List変数： l_l_DEPO_TYP */
	public List l_l_DEPO_TYP = null;

	/** 第 14 List変数： l_PARTIAL_SHIP_INST_FLG */
	public List l_PARTIAL_SHIP_INST_FLG = null;

	/** 第 15 List変数： l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** 第 16 List変数： l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** 第 17 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 18 List変数： l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** 第 19 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 20 List変数： l_l_PKG_UNIT */
	public List l_l_PKG_UNIT = null;

	/** 第 21 List変数： l_l_UNIT_QTY_TYP */
	public List l_l_UNIT_QTY_TYP = null;

	/** 第 22 List変数： l_l_CUST_NAME */
	public List l_l_CUST_NAME = null;

	/** 第 23 List変数： l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** 第 24 List変数： l_l_SHIP_WH_CD */
	public List l_l_SHIP_WH_CD = null;

	/** 第 25 List変数： l_l_SHIP_PLANT_CD */
	public List l_l_SHIP_PLANT_CD = null;

	/** 第 26 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 27 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 28 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 29 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 30 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 31 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 32 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 33 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 34 List変数： l_l_PART_DLV_SEQ_NO */
	public List l_l_PART_DLV_SEQ_NO = null;

	/** 第 35 List変数： l_l_DESINATED_SHIP_DATE */
	public List l_l_DESINATED_SHIP_DATE = null;

	/** 第 36 List変数： l_l_bk_DESINATED_SHIP_QTY */
	public List l_l_bk_DESINATED_SHIP_QTY = null;

	/** 第 37 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 38 List変数： l_CODE */
	public List l_CODE = null;

	/** 第 39 List変数： l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** 第 40 List変数： l_l_TRANSPORT_LT */
	public List l_l_TRANSPORT_LT = null;

	/** 第 41 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 42 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getl_PARTIAL_SHIP_INST_FLG() { return m_l_PARTIAL_SHIP_INST_FLG; }
	public String getr1_STS_TYP() { return m_r1_STS_TYP; }
	public String getr2_STS_TYP() { return m_r2_STS_TYP; }
	public String getKT0010010view1_selected() { return m_KT0010010view1_selected; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_ODR_NO() { return m_l_ODR_NO; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_SHIP_PLAN_REMAIN_QTY() { return m_l_SHIP_PLAN_REMAIN_QTY; }
	public String getl_DESINATED_SHIP_QTY() { return m_l_DESINATED_SHIP_QTY; }
	public String getl_DEPO_TYP() { return m_l_DEPO_TYP; }
	public String getPARTIAL_SHIP_INST_FLG() { return m_PARTIAL_SHIP_INST_FLG; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PKG_UNIT() { return m_l_PKG_UNIT; }
	public String getl_UNIT_QTY_TYP() { return m_l_UNIT_QTY_TYP; }
	public String getl_CUST_NAME() { return m_l_CUST_NAME; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_SHIP_WH_CD() { return m_l_SHIP_WH_CD; }
	public String getl_SHIP_PLANT_CD() { return m_l_SHIP_PLANT_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getl_PART_DLV_SEQ_NO() { return m_l_PART_DLV_SEQ_NO; }
	public String getl_DESINATED_SHIP_DATE() { return m_l_DESINATED_SHIP_DATE; }
	public String getl_bk_DESINATED_SHIP_QTY() { return m_l_bk_DESINATED_SHIP_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getCODE() { return m_CODE; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public String getl_TRANSPORT_LT() { return m_l_TRANSPORT_LT; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_l_PARTIAL_SHIP_INST_FLG() { return l_l_PARTIAL_SHIP_INST_FLG; }
	public List getList_r1_STS_TYP() { return l_r1_STS_TYP; }
	public List getList_r2_STS_TYP() { return l_r2_STS_TYP; }
	public List getList_KT0010010view1_selected() { return l_KT0010010view1_selected; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_ODR_NO() { return l_l_ODR_NO; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_SHIP_PLAN_REMAIN_QTY() { return l_l_SHIP_PLAN_REMAIN_QTY; }
	public List getList_l_DESINATED_SHIP_QTY() { return l_l_DESINATED_SHIP_QTY; }
	public List getList_l_DEPO_TYP() { return l_l_DEPO_TYP; }
	public List getList_PARTIAL_SHIP_INST_FLG() { return l_PARTIAL_SHIP_INST_FLG; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PKG_UNIT() { return l_l_PKG_UNIT; }
	public List getList_l_UNIT_QTY_TYP() { return l_l_UNIT_QTY_TYP; }
	public List getList_l_CUST_NAME() { return l_l_CUST_NAME; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_SHIP_WH_CD() { return l_l_SHIP_WH_CD; }
	public List getList_l_SHIP_PLANT_CD() { return l_l_SHIP_PLANT_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_l_PART_DLV_SEQ_NO() { return l_l_PART_DLV_SEQ_NO; }
	public List getList_l_DESINATED_SHIP_DATE() { return l_l_DESINATED_SHIP_DATE; }
	public List getList_l_bk_DESINATED_SHIP_QTY() { return l_l_bk_DESINATED_SHIP_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_l_TRANSPORT_LT() { return l_l_TRANSPORT_LT; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setl_PARTIAL_SHIP_INST_FLG(String val) { m_l_PARTIAL_SHIP_INST_FLG = val; }
	public void setr1_STS_TYP(String val) { m_r1_STS_TYP = val; }
	public void setr2_STS_TYP(String val) { m_r2_STS_TYP = val; }
	public void setKT0010010view1_selected(String val) { m_KT0010010view1_selected = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_ODR_NO(String val) { m_l_ODR_NO = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_SHIP_PLAN_REMAIN_QTY(String val) { m_l_SHIP_PLAN_REMAIN_QTY = val; }
	public void setl_DESINATED_SHIP_QTY(String val) { m_l_DESINATED_SHIP_QTY = val; }
	public void setl_DEPO_TYP(String val) { m_l_DEPO_TYP = val; }
	public void setPARTIAL_SHIP_INST_FLG(String val) { m_PARTIAL_SHIP_INST_FLG = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PKG_UNIT(String val) { m_l_PKG_UNIT = val; }
	public void setl_UNIT_QTY_TYP(String val) { m_l_UNIT_QTY_TYP = val; }
	public void setl_CUST_NAME(String val) { m_l_CUST_NAME = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_SHIP_WH_CD(String val) { m_l_SHIP_WH_CD = val; }
	public void setl_SHIP_PLANT_CD(String val) { m_l_SHIP_PLANT_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setl_PART_DLV_SEQ_NO(String val) { m_l_PART_DLV_SEQ_NO = val; }
	public void setl_DESINATED_SHIP_DATE(String val) { m_l_DESINATED_SHIP_DATE = val; }
	public void setl_bk_DESINATED_SHIP_QTY(String val) { m_l_bk_DESINATED_SHIP_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setl_TRANSPORT_LT(String val) { m_l_TRANSPORT_LT = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_l_PARTIAL_SHIP_INST_FLG(List list) { l_l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_r1_STS_TYP(List list) { l_r1_STS_TYP = list; }
	public void setList_r2_STS_TYP(List list) { l_r2_STS_TYP = list; }
	public void setList_KT0010010view1_selected(List list) { l_KT0010010view1_selected = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_ODR_NO(List list) { l_l_ODR_NO = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_SHIP_PLAN_REMAIN_QTY(List list) { l_l_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_l_DESINATED_SHIP_QTY(List list) { l_l_DESINATED_SHIP_QTY = list; }
	public void setList_l_DEPO_TYP(List list) { l_l_DEPO_TYP = list; }
	public void setList_PARTIAL_SHIP_INST_FLG(List list) { l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PKG_UNIT(List list) { l_l_PKG_UNIT = list; }
	public void setList_l_UNIT_QTY_TYP(List list) { l_l_UNIT_QTY_TYP = list; }
	public void setList_l_CUST_NAME(List list) { l_l_CUST_NAME = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_SHIP_WH_CD(List list) { l_l_SHIP_WH_CD = list; }
	public void setList_l_SHIP_PLANT_CD(List list) { l_l_SHIP_PLANT_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_l_PART_DLV_SEQ_NO(List list) { l_l_PART_DLV_SEQ_NO = list; }
	public void setList_l_DESINATED_SHIP_DATE(List list) { l_l_DESINATED_SHIP_DATE = list; }
	public void setList_l_bk_DESINATED_SHIP_QTY(List list) { l_l_bk_DESINATED_SHIP_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_l_TRANSPORT_LT(List list) { l_l_TRANSPORT_LT = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_l_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PARTIAL_SHIP_INST_FLG == null) {
			l_l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PARTIAL_SHIP_INST_FLG.add(((KT0010010Struct) list.get(i)).getl_PARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_r1_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_STS_TYP == null) {
			l_r1_STS_TYP = new ArrayList();
		} else {
			l_r1_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_STS_TYP.add(((KT0010010Struct) list.get(i)).getr1_STS_TYP());
		}
		return size;
	}
	public int setL2L_r2_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_STS_TYP == null) {
			l_r2_STS_TYP = new ArrayList();
		} else {
			l_r2_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_STS_TYP.add(((KT0010010Struct) list.get(i)).getr2_STS_TYP());
		}
		return size;
	}
	public int setL2L_KT0010010view1_selected(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_KT0010010view1_selected == null) {
			l_KT0010010view1_selected = new ArrayList();
		} else {
			l_KT0010010view1_selected.clear();
		}
		for (int i = 0; i < size; i++) {
			l_KT0010010view1_selected.add(((KT0010010Struct) list.get(i)).getKT0010010view1_selected());
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
			l_l_ITEM_CD.add(((KT0010010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ODR_NO == null) {
			l_l_CUST_ODR_NO = new ArrayList();
		} else {
			l_l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ODR_NO.add(((KT0010010Struct) list.get(i)).getl_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_DLV_DATE == null) {
			l_l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_DLV_DATE.add(((KT0010010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_NO == null) {
			l_l_ODR_NO = new ArrayList();
		} else {
			l_l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_NO.add(((KT0010010Struct) list.get(i)).getl_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_CD == null) {
			l_l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_CD.add(((KT0010010Struct) list.get(i)).getl_CUST_ITEM_CD());
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
			l_l_ODR_QTY.add(((KT0010010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_PLAN_REMAIN_QTY == null) {
			l_l_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_l_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_PLAN_REMAIN_QTY.add(((KT0010010Struct) list.get(i)).getl_SHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_QTY == null) {
			l_l_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_QTY.add(((KT0010010Struct) list.get(i)).getl_DESINATED_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_l_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_TYP == null) {
			l_l_DEPO_TYP = new ArrayList();
		} else {
			l_l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_TYP.add(((KT0010010Struct) list.get(i)).getl_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_SHIP_INST_FLG == null) {
			l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_SHIP_INST_FLG.add(((KT0010010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_l_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CD == null) {
			l_l_CUST_CD = new ArrayList();
		} else {
			l_l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CD.add(((KT0010010Struct) list.get(i)).getl_CUST_CD());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_CD == null) {
			l_l_DLV_LOC_CD = new ArrayList();
		} else {
			l_l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_CD.add(((KT0010010Struct) list.get(i)).getl_DLV_LOC_CD());
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
			l_l_MODIFY_COUNT.add(((KT0010010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMARKS == null) {
			l_l_REMARKS = new ArrayList();
		} else {
			l_l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMARKS.add(((KT0010010Struct) list.get(i)).getl_REMARKS());
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
			l_l_ITEM_NAME.add(((KT0010010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PKG_UNIT == null) {
			l_l_PKG_UNIT = new ArrayList();
		} else {
			l_l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PKG_UNIT.add(((KT0010010Struct) list.get(i)).getl_PKG_UNIT());
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
			l_l_UNIT_QTY_TYP.add(((KT0010010Struct) list.get(i)).getl_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_l_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_NAME == null) {
			l_l_CUST_NAME = new ArrayList();
		} else {
			l_l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_NAME.add(((KT0010010Struct) list.get(i)).getl_CUST_NAME());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_NAME == null) {
			l_l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_NAME.add(((KT0010010Struct) list.get(i)).getl_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_WH_CD == null) {
			l_l_SHIP_WH_CD = new ArrayList();
		} else {
			l_l_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_WH_CD.add(((KT0010010Struct) list.get(i)).getl_SHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_l_SHIP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_PLANT_CD == null) {
			l_l_SHIP_PLANT_CD = new ArrayList();
		} else {
			l_l_SHIP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_PLANT_CD.add(((KT0010010Struct) list.get(i)).getl_SHIP_PLANT_CD());
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
			l_l_JOB_ODR_CD.add(((KT0010010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_NO == null) {
			l_ODR_NO = new ArrayList();
		} else {
			l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_NO.add(((KT0010010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ODR_NO == null) {
			l_CUST_ODR_NO = new ArrayList();
		} else {
			l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ODR_NO.add(((KT0010010Struct) list.get(i)).getCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_DLV_DATE == null) {
			l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_DLV_DATE.add(((KT0010010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_CUST_CD.add(((KT0010010Struct) list.get(i)).getCUST_CD());
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
			l_ITEM_CD.add(((KT0010010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_PSN_CD == null) {
			l_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_PSN_CD.add(((KT0010010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_COMPANY_CD.add(((KT0010010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_l_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PART_DLV_SEQ_NO == null) {
			l_l_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_l_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PART_DLV_SEQ_NO.add(((KT0010010Struct) list.get(i)).getl_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_DATE == null) {
			l_l_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_DATE.add(((KT0010010Struct) list.get(i)).getl_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_bk_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_bk_DESINATED_SHIP_QTY == null) {
			l_l_bk_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_l_bk_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_bk_DESINATED_SHIP_QTY.add(((KT0010010Struct) list.get(i)).getl_bk_DESINATED_SHIP_QTY());
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
			l_BUSINESS_OPR_DATE.add(((KT0010010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CODE == null) {
			l_CODE = new ArrayList();
		} else {
			l_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CODE.add(((KT0010010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CODE == null) {
			l_CLASS_CODE = new ArrayList();
		} else {
			l_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CODE.add(((KT0010010Struct) list.get(i)).getCLASS_CODE());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_LT == null) {
			l_l_TRANSPORT_LT = new ArrayList();
		} else {
			l_l_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_LT.add(((KT0010010Struct) list.get(i)).getl_TRANSPORT_LT());
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
			l_l_COUNT.add(((KT0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KT0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_PARTIAL_SHIP_INST_FLG = null;
		m_r1_STS_TYP = null;
		m_r2_STS_TYP = null;
		m_KT0010010view1_selected = null;
		m_l_ITEM_CD = null;
		m_l_CUST_ODR_NO = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_ODR_NO = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ODR_QTY = null;
		m_l_SHIP_PLAN_REMAIN_QTY = null;
		m_l_DESINATED_SHIP_QTY = null;
		m_l_DEPO_TYP = null;
		m_PARTIAL_SHIP_INST_FLG = null;
		m_l_CUST_CD = null;
		m_l_DLV_LOC_CD = null;
		m_l_MODIFY_COUNT = null;
		m_l_REMARKS = null;
		m_l_ITEM_NAME = null;
		m_l_PKG_UNIT = null;
		m_l_UNIT_QTY_TYP = null;
		m_l_CUST_NAME = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_SHIP_WH_CD = null;
		m_l_SHIP_PLANT_CD = null;
		m_l_JOB_ODR_CD = null;
		m_ODR_NO = null;
		m_CUST_ODR_NO = null;
		m_DESINATED_DLV_DATE = null;
		m_CUST_CD = null;
		m_ITEM_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_COMPANY_CD = null;
		m_l_PART_DLV_SEQ_NO = null;
		m_l_DESINATED_SHIP_DATE = null;
		m_l_bk_DESINATED_SHIP_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_CODE = null;
		m_CLASS_CODE = null;
		m_l_TRANSPORT_LT = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_l_PARTIAL_SHIP_INST_FLG = null;
		l_r1_STS_TYP = null;
		l_r2_STS_TYP = null;
		l_KT0010010view1_selected = null;
		l_l_ITEM_CD = null;
		l_l_CUST_ODR_NO = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_ODR_NO = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ODR_QTY = null;
		l_l_SHIP_PLAN_REMAIN_QTY = null;
		l_l_DESINATED_SHIP_QTY = null;
		l_l_DEPO_TYP = null;
		l_PARTIAL_SHIP_INST_FLG = null;
		l_l_CUST_CD = null;
		l_l_DLV_LOC_CD = null;
		l_l_MODIFY_COUNT = null;
		l_l_REMARKS = null;
		l_l_ITEM_NAME = null;
		l_l_PKG_UNIT = null;
		l_l_UNIT_QTY_TYP = null;
		l_l_CUST_NAME = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_SHIP_WH_CD = null;
		l_l_SHIP_PLANT_CD = null;
		l_l_JOB_ODR_CD = null;
		l_ODR_NO = null;
		l_CUST_ODR_NO = null;
		l_DESINATED_DLV_DATE = null;
		l_CUST_CD = null;
		l_ITEM_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_COMPANY_CD = null;
		l_l_PART_DLV_SEQ_NO = null;
		l_l_DESINATED_SHIP_DATE = null;
		l_l_bk_DESINATED_SHIP_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_CODE = null;
		l_CLASS_CODE = null;
		l_l_TRANSPORT_LT = null;
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
	 * medKT0010010クラスの標準コンストラクタ
	 */
	public KT0010010Struct()
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
	public void setStruct(KT0010010Struct struct)
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
	public void setStructM(KT0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_PARTIAL_SHIP_INST_FLG(struct.getl_PARTIAL_SHIP_INST_FLG());
			this.setr1_STS_TYP(struct.getr1_STS_TYP());
			this.setr2_STS_TYP(struct.getr2_STS_TYP());
			this.setKT0010010view1_selected(struct.getKT0010010view1_selected());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_ODR_NO(struct.getl_ODR_NO());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_SHIP_PLAN_REMAIN_QTY(struct.getl_SHIP_PLAN_REMAIN_QTY());
			this.setl_DESINATED_SHIP_QTY(struct.getl_DESINATED_SHIP_QTY());
			this.setl_DEPO_TYP(struct.getl_DEPO_TYP());
			this.setPARTIAL_SHIP_INST_FLG(struct.getPARTIAL_SHIP_INST_FLG());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PKG_UNIT(struct.getl_PKG_UNIT());
			this.setl_UNIT_QTY_TYP(struct.getl_UNIT_QTY_TYP());
			this.setl_CUST_NAME(struct.getl_CUST_NAME());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_SHIP_WH_CD(struct.getl_SHIP_WH_CD());
			this.setl_SHIP_PLANT_CD(struct.getl_SHIP_PLANT_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setl_PART_DLV_SEQ_NO(struct.getl_PART_DLV_SEQ_NO());
			this.setl_DESINATED_SHIP_DATE(struct.getl_DESINATED_SHIP_DATE());
			this.setl_bk_DESINATED_SHIP_QTY(struct.getl_bk_DESINATED_SHIP_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setCODE(struct.getCODE());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setl_TRANSPORT_LT(struct.getl_TRANSPORT_LT());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KT0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_PARTIAL_SHIP_INST_FLG(struct.getList_l_PARTIAL_SHIP_INST_FLG());
			this.setList_r1_STS_TYP(struct.getList_r1_STS_TYP());
			this.setList_r2_STS_TYP(struct.getList_r2_STS_TYP());
			this.setList_KT0010010view1_selected(struct.getList_KT0010010view1_selected());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_ODR_NO(struct.getList_l_ODR_NO());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_SHIP_PLAN_REMAIN_QTY(struct.getList_l_SHIP_PLAN_REMAIN_QTY());
			this.setList_l_DESINATED_SHIP_QTY(struct.getList_l_DESINATED_SHIP_QTY());
			this.setList_l_DEPO_TYP(struct.getList_l_DEPO_TYP());
			this.setList_PARTIAL_SHIP_INST_FLG(struct.getList_PARTIAL_SHIP_INST_FLG());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PKG_UNIT(struct.getList_l_PKG_UNIT());
			this.setList_l_UNIT_QTY_TYP(struct.getList_l_UNIT_QTY_TYP());
			this.setList_l_CUST_NAME(struct.getList_l_CUST_NAME());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_SHIP_WH_CD(struct.getList_l_SHIP_WH_CD());
			this.setList_l_SHIP_PLANT_CD(struct.getList_l_SHIP_PLANT_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_l_PART_DLV_SEQ_NO(struct.getList_l_PART_DLV_SEQ_NO());
			this.setList_l_DESINATED_SHIP_DATE(struct.getList_l_DESINATED_SHIP_DATE());
			this.setList_l_bk_DESINATED_SHIP_QTY(struct.getList_l_bk_DESINATED_SHIP_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_l_TRANSPORT_LT(struct.getList_l_TRANSPORT_LT());
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
	// 第 1 変数初期値： i_l_PARTIAL_SHIP_INST_FLG


	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// 第 2 変数初期値： i_r1_STS_TYP


	final static String i_r1_STS_TYP = null;

	// 第 3 変数初期値： i_r2_STS_TYP


	final static String i_r2_STS_TYP = null;

	// 第 4 変数初期値： i_KT0010010view1_selected


	final static String i_KT0010010view1_selected = null;

	// 第 5 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 6 変数初期値： i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// 第 7 変数初期値： i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 8 変数初期値： i_l_ODR_NO


	final static String i_l_ODR_NO = null;

	// 第 9 変数初期値： i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// 第 10 変数初期値： i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// 第 11 変数初期値： i_l_SHIP_PLAN_REMAIN_QTY


	final static String i_l_SHIP_PLAN_REMAIN_QTY = null;

	// 第 12 変数初期値： i_l_DESINATED_SHIP_QTY


	final static String i_l_DESINATED_SHIP_QTY = null;

	// 第 13 変数初期値： i_l_DEPO_TYP


	final static String i_l_DEPO_TYP = null;

	// 第 14 変数初期値： i_PARTIAL_SHIP_INST_FLG


	final static String i_PARTIAL_SHIP_INST_FLG = null;

	// 第 15 変数初期値： i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// 第 16 変数初期値： i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// 第 17 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 18 変数初期値： i_l_REMARKS


	final static String i_l_REMARKS = null;

	// 第 19 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 20 変数初期値： i_l_PKG_UNIT


	final static String i_l_PKG_UNIT = null;

	// 第 21 変数初期値： i_l_UNIT_QTY_TYP


	final static String i_l_UNIT_QTY_TYP = null;

	// 第 22 変数初期値： i_l_CUST_NAME


	final static String i_l_CUST_NAME = null;

	// 第 23 変数初期値： i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// 第 24 変数初期値： i_l_SHIP_WH_CD


	final static String i_l_SHIP_WH_CD = null;

	// 第 25 変数初期値： i_l_SHIP_PLANT_CD


	final static String i_l_SHIP_PLANT_CD = null;

	// 第 26 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 27 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 28 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 29 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 30 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 31 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 33 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 34 変数初期値： i_l_PART_DLV_SEQ_NO


	final static String i_l_PART_DLV_SEQ_NO = null;

	// 第 35 変数初期値： i_l_DESINATED_SHIP_DATE


	final static String i_l_DESINATED_SHIP_DATE = null;

	// 第 36 変数初期値： i_l_bk_DESINATED_SHIP_QTY


	final static String i_l_bk_DESINATED_SHIP_QTY = null;

	// 第 37 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 38 変数初期値： i_CODE


	final static String i_CODE = null;

	// 第 39 変数初期値： i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// 第 40 変数初期値： i_l_TRANSPORT_LT


	final static String i_l_TRANSPORT_LT = null;

	// 第 41 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 42 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // 第 2 変数初期値： i_l_DESINATED_DLV_DATE
        final static String i_l_DESINATED_DLV_DATE = null;
        // 第 3 変数初期値： i_l_ODR_NO
        final static String i_l_ODR_NO = null;
        // 第 4 変数初期値： i_l_CUST_ITEM_CD
        final static String i_l_CUST_ITEM_CD = null;
        // 第 5 変数初期値： i_l_ODR_QTY
        final static String i_l_ODR_QTY = null;
        // 第 6 変数初期値： i_l_SHIP_PLAN_REMAIN_QTY
        final static String i_l_SHIP_PLAN_REMAIN_QTY = null;
        // 第 7 変数初期値： i_l_DESINATED_SHIP_QTY
        final static String i_l_DESINATED_SHIP_QTY = null;
        // 第 8 変数初期値： i_l_DEPO_TYP
        final static String i_l_DEPO_TYP = null;
        // 第 9 変数初期値： i_l_PARTIAL_SHIP_INST_FLG
        final static String i_l_PARTIAL_SHIP_INST_FLG = null;
        // 第 10 変数初期値： i_PARTIAL_SHIP_INST_FLG
        final static String i_PARTIAL_SHIP_INST_FLG = null;
        // 第 11 変数初期値： i_l_CUST_CD
        final static String i_l_CUST_CD = null;
        // 第 12 変数初期値： i_l_DLV_LOC_CD
        final static String i_l_DLV_LOC_CD = null;
        // 第 13 変数初期値： i_ODR_NO
        final static String i_ODR_NO = null;
        // 第 14 変数初期値： i_CUST_CD
        final static String i_CUST_CD = null;
        // 第 15 変数初期値： i_ITEM_CD
        final static String i_ITEM_CD = null;
        // 第 16 変数初期値： i_CUST_CHRG_PSN_CD
        final static String i_CUST_CHRG_PSN_CD = null;
        // 第 17 変数初期値： i_l_PART_DLV_SEQ_NO
        final static String i_l_PART_DLV_SEQ_NO = null;
        // 第 18 変数初期値： i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // 第 19 変数初期値： i_l_DESINATED_SHIP_DATE
        final static String i_l_DESINATED_SHIP_DATE = null;
        // 第 20 変数初期値： i_l_bk_DESINATED_SHIP_QTY
        final static String i_l_bk_DESINATED_SHIP_QTY = null;
        // 第 21 変数初期値： i_BUSINESS_OPR_DATE
        final static String i_BUSINESS_OPR_DATE = null;
        // 第 22 変数初期値： i_CODE
        final static String i_CODE = null;
        // 第 23 変数初期値： i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // 第 24 変数初期値： i_CLASS_CODE
        final static String i_CLASS_CODE = null;
        // 第 25 変数初期値： i_l_TRANSPORT_LT
        final static String i_l_TRANSPORT_LT = null;
        // 第 26 変数初期値： i_r1_STS_TYP
        final static String i_r1_STS_TYP = null;
        // 第 27 変数初期値： i_r2_STS_TYP
        final static String i_r2_STS_TYP = null;
        // 第 28 変数初期値： i_KT0010010view1_selected
        final static String i_KT0010010view1_selected = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_ITEM_CD = i_l_ITEM_CD;
         m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
         m_l_ODR_NO = i_l_ODR_NO;
         m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
         m_l_ODR_QTY = i_l_ODR_QTY;
         m_l_SHIP_PLAN_REMAIN_QTY = i_l_SHIP_PLAN_REMAIN_QTY;
         m_l_DESINATED_SHIP_QTY = i_l_DESINATED_SHIP_QTY;
         m_l_DEPO_TYP = i_l_DEPO_TYP;
         m_l_PARTIAL_SHIP_INST_FLG = i_l_PARTIAL_SHIP_INST_FLG;
         m_PARTIAL_SHIP_INST_FLG = i_PARTIAL_SHIP_INST_FLG;
         m_l_CUST_CD = i_l_CUST_CD;
         m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
         m_ODR_NO = i_ODR_NO;
         m_CUST_CD = i_CUST_CD;
         m_ITEM_CD = i_ITEM_CD;
         m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
         m_l_PART_DLV_SEQ_NO = i_l_PART_DLV_SEQ_NO;
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_l_DESINATED_SHIP_DATE = i_l_DESINATED_SHIP_DATE;
         m_l_bk_DESINATED_SHIP_QTY = i_l_bk_DESINATED_SHIP_QTY;
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_CODE = i_CODE;
         m_COMPANY_CD = i_COMPANY_CD;
         m_CLASS_CODE = i_CLASS_CODE;
         m_l_TRANSPORT_LT = i_l_TRANSPORT_LT;
         m_r1_STS_TYP = i_r1_STS_TYP;
         m_r2_STS_TYP = i_r2_STS_TYP;
         m_KT0010010view1_selected = i_KT0010010view1_selected;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
