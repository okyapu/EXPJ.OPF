/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/src/com/nec/jp/orteus/metamorBase/AC0130/AC0130010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0130;

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
 * CLASS     : AC0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:03:25 $
 *
 */
//}}user_implement_code_header

public class AC0130010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_c1_JOB_ODR_STS */
	public String m_c1_JOB_ODR_STS = null;
	/** 第 2 変数： m_c4_JOB_ODR_STS */
	public String m_c4_JOB_ODR_STS = null;
	/** 第 3 変数： m_c2_JOB_ODR_STS */
	public String m_c2_JOB_ODR_STS = null;
	/** 第 4 変数： m_c5_JOB_ODR_STS */
	public String m_c5_JOB_ODR_STS = null;
	/** 第 5 変数： m_c3_JOB_ODR_STS */
	public String m_c3_JOB_ODR_STS = null;
	/** 第 6 変数： m_c9_JOB_ODR_STS */
	public String m_c9_JOB_ODR_STS = null;
	/** 第 7 変数： m_l_JOB_ODR_STS_NAME */
	public String m_l_JOB_ODR_STS_NAME = null;
	/** 第 8 変数： m_l_JOB_ODR_NAME */
	public String m_l_JOB_ODR_NAME = null;
	/** 第 9 変数： m_l_PLAN_NAME */
	public String m_l_PLAN_NAME = null;
	/** 第 10 変数： m_l_JobOdrExpect */
	public String m_l_JobOdrExpect = null;
	/** 第 11 変数： m_JOB_ODR_TYP_name */
	public String m_JOB_ODR_TYP_name = null;
	/** 第 12 変数： m_JOB_ODR_TYP_val */
	public String m_JOB_ODR_TYP_val = null;
	/** 第 13 変数： m_c1_JOB_ODR_CANCEL */
	public String m_c1_JOB_ODR_CANCEL = null;
	/** 第 14 変数： m_c2_JOB_ODR_CANCEL */
	public String m_c2_JOB_ODR_CANCEL = null;
	/** 第 15 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 16 変数： m_l_JOB_ODR_CANCEL_NO */
	public String m_l_JOB_ODR_CANCEL_NO = null;
	/** 第 17 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 18 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 19 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 20 変数： m_l_JOB_ODR_QTY */
	public String m_l_JOB_ODR_QTY = null;
	/** 第 21 変数： m_l_JOB_ODR_DLV_DATE */
	public String m_l_JOB_ODR_DLV_DATE = null;
	/** 第 22 変数： m_l_JOB_ODR_STS_TYP */
	public String m_l_JOB_ODR_STS_TYP = null;
	/** 第 23 変数： m_l_JOB_ODR_TYP */
	public String m_l_JOB_ODR_TYP = null;
	/** 第 24 変数： m_l_PLAN_TYP */
	public String m_l_PLAN_TYP = null;
	/** 第 25 変数： m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** 第 26 変数： m_l_JOB_ODR_DEL_FLG */
	public String m_l_JOB_ODR_DEL_FLG = null;
	/** 第 27 変数： m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** 第 28 変数： m_l_ALCD_ENABLE_QTY */
	public String m_l_ALCD_ENABLE_QTY = null;
	/** 第 29 変数： m_JobOdrExpectFlg */
	public String m_JobOdrExpectFlg = null;
	/** 第 30 変数： m_sys_PLANT_CD */
	public String m_sys_PLANT_CD = null;
	/** 第 31 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 32 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 33 変数： m_JOB_ODR_DLV_DATE_FROM */
	public String m_JOB_ODR_DLV_DATE_FROM = null;
	/** 第 34 変数： m_JOB_ODR_DLV_DATE_TO */
	public String m_JOB_ODR_DLV_DATE_TO = null;
	/** 第 35 変数： m_InC1_JOB_ODR_STS_TYP */
	public String m_InC1_JOB_ODR_STS_TYP = null;
	/** 第 36 変数： m_InC2_JOB_ODR_STS_TYP */
	public String m_InC2_JOB_ODR_STS_TYP = null;
	/** 第 37 変数： m_InC3_JOB_ODR_STS_TYP */
	public String m_InC3_JOB_ODR_STS_TYP = null;
	/** 第 38 変数： m_InC4_JOB_ODR_STS_TYP */
	public String m_InC4_JOB_ODR_STS_TYP = null;
	/** 第 39 変数： m_InC5_JOB_ODR_STS_TYP */
	public String m_InC5_JOB_ODR_STS_TYP = null;
	/** 第 40 変数： m_InC9_JOB_ODR_STS_TYP */
	public String m_InC9_JOB_ODR_STS_TYP = null;
	/** 第 41 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 42 変数： m_InC1_JOB_ODR_CANCEL */
	public String m_InC1_JOB_ODR_CANCEL = null;
	/** 第 43 変数： m_InC2_JOB_ODR_CANCEL */
	public String m_InC2_JOB_ODR_CANCEL = null;
	/** 第 44 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 45 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_c1_JOB_ODR_STS */
	public List l_c1_JOB_ODR_STS = null;

	/** 第 2 List変数： l_c4_JOB_ODR_STS */
	public List l_c4_JOB_ODR_STS = null;

	/** 第 3 List変数： l_c2_JOB_ODR_STS */
	public List l_c2_JOB_ODR_STS = null;

	/** 第 4 List変数： l_c5_JOB_ODR_STS */
	public List l_c5_JOB_ODR_STS = null;

	/** 第 5 List変数： l_c3_JOB_ODR_STS */
	public List l_c3_JOB_ODR_STS = null;

	/** 第 6 List変数： l_c9_JOB_ODR_STS */
	public List l_c9_JOB_ODR_STS = null;

	/** 第 7 List変数： l_l_JOB_ODR_STS_NAME */
	public List l_l_JOB_ODR_STS_NAME = null;

	/** 第 8 List変数： l_l_JOB_ODR_NAME */
	public List l_l_JOB_ODR_NAME = null;

	/** 第 9 List変数： l_l_PLAN_NAME */
	public List l_l_PLAN_NAME = null;

	/** 第 10 List変数： l_l_JobOdrExpect */
	public List l_l_JobOdrExpect = null;

	/** 第 11 List変数： l_JOB_ODR_TYP_name */
	public List l_JOB_ODR_TYP_name = null;

	/** 第 12 List変数： l_JOB_ODR_TYP_val */
	public List l_JOB_ODR_TYP_val = null;

	/** 第 13 List変数： l_c1_JOB_ODR_CANCEL */
	public List l_c1_JOB_ODR_CANCEL = null;

	/** 第 14 List変数： l_c2_JOB_ODR_CANCEL */
	public List l_c2_JOB_ODR_CANCEL = null;

	/** 第 15 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 16 List変数： l_l_JOB_ODR_CANCEL_NO */
	public List l_l_JOB_ODR_CANCEL_NO = null;

	/** 第 17 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 18 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 19 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 20 List変数： l_l_JOB_ODR_QTY */
	public List l_l_JOB_ODR_QTY = null;

	/** 第 21 List変数： l_l_JOB_ODR_DLV_DATE */
	public List l_l_JOB_ODR_DLV_DATE = null;

	/** 第 22 List変数： l_l_JOB_ODR_STS_TYP */
	public List l_l_JOB_ODR_STS_TYP = null;

	/** 第 23 List変数： l_l_JOB_ODR_TYP */
	public List l_l_JOB_ODR_TYP = null;

	/** 第 24 List変数： l_l_PLAN_TYP */
	public List l_l_PLAN_TYP = null;

	/** 第 25 List変数： l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** 第 26 List変数： l_l_JOB_ODR_DEL_FLG */
	public List l_l_JOB_ODR_DEL_FLG = null;

	/** 第 27 List変数： l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** 第 28 List変数： l_l_ALCD_ENABLE_QTY */
	public List l_l_ALCD_ENABLE_QTY = null;

	/** 第 29 List変数： l_JobOdrExpectFlg */
	public List l_JobOdrExpectFlg = null;

	/** 第 30 List変数： l_sys_PLANT_CD */
	public List l_sys_PLANT_CD = null;

	/** 第 31 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 32 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 33 List変数： l_JOB_ODR_DLV_DATE_FROM */
	public List l_JOB_ODR_DLV_DATE_FROM = null;

	/** 第 34 List変数： l_JOB_ODR_DLV_DATE_TO */
	public List l_JOB_ODR_DLV_DATE_TO = null;

	/** 第 35 List変数： l_InC1_JOB_ODR_STS_TYP */
	public List l_InC1_JOB_ODR_STS_TYP = null;

	/** 第 36 List変数： l_InC2_JOB_ODR_STS_TYP */
	public List l_InC2_JOB_ODR_STS_TYP = null;

	/** 第 37 List変数： l_InC3_JOB_ODR_STS_TYP */
	public List l_InC3_JOB_ODR_STS_TYP = null;

	/** 第 38 List変数： l_InC4_JOB_ODR_STS_TYP */
	public List l_InC4_JOB_ODR_STS_TYP = null;

	/** 第 39 List変数： l_InC5_JOB_ODR_STS_TYP */
	public List l_InC5_JOB_ODR_STS_TYP = null;

	/** 第 40 List変数： l_InC9_JOB_ODR_STS_TYP */
	public List l_InC9_JOB_ODR_STS_TYP = null;

	/** 第 41 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 42 List変数： l_InC1_JOB_ODR_CANCEL */
	public List l_InC1_JOB_ODR_CANCEL = null;

	/** 第 43 List変数： l_InC2_JOB_ODR_CANCEL */
	public List l_InC2_JOB_ODR_CANCEL = null;

	/** 第 44 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 45 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getc1_JOB_ODR_STS() { return m_c1_JOB_ODR_STS; }
	public String getc4_JOB_ODR_STS() { return m_c4_JOB_ODR_STS; }
	public String getc2_JOB_ODR_STS() { return m_c2_JOB_ODR_STS; }
	public String getc5_JOB_ODR_STS() { return m_c5_JOB_ODR_STS; }
	public String getc3_JOB_ODR_STS() { return m_c3_JOB_ODR_STS; }
	public String getc9_JOB_ODR_STS() { return m_c9_JOB_ODR_STS; }
	public String getl_JOB_ODR_STS_NAME() { return m_l_JOB_ODR_STS_NAME; }
	public String getl_JOB_ODR_NAME() { return m_l_JOB_ODR_NAME; }
	public String getl_PLAN_NAME() { return m_l_PLAN_NAME; }
	public String getl_JobOdrExpect() { return m_l_JobOdrExpect; }
	public String getJOB_ODR_TYP_name() { return m_JOB_ODR_TYP_name; }
	public String getJOB_ODR_TYP_val() { return m_JOB_ODR_TYP_val; }
	public String getc1_JOB_ODR_CANCEL() { return m_c1_JOB_ODR_CANCEL; }
	public String getc2_JOB_ODR_CANCEL() { return m_c2_JOB_ODR_CANCEL; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_CANCEL_NO() { return m_l_JOB_ODR_CANCEL_NO; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_JOB_ODR_QTY() { return m_l_JOB_ODR_QTY; }
	public String getl_JOB_ODR_DLV_DATE() { return m_l_JOB_ODR_DLV_DATE; }
	public String getl_JOB_ODR_STS_TYP() { return m_l_JOB_ODR_STS_TYP; }
	public String getl_JOB_ODR_TYP() { return m_l_JOB_ODR_TYP; }
	public String getl_PLAN_TYP() { return m_l_PLAN_TYP; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_JOB_ODR_DEL_FLG() { return m_l_JOB_ODR_DEL_FLG; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getl_ALCD_ENABLE_QTY() { return m_l_ALCD_ENABLE_QTY; }
	public String getJobOdrExpectFlg() { return m_JobOdrExpectFlg; }
	public String getsys_PLANT_CD() { return m_sys_PLANT_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getJOB_ODR_DLV_DATE_FROM() { return m_JOB_ODR_DLV_DATE_FROM; }
	public String getJOB_ODR_DLV_DATE_TO() { return m_JOB_ODR_DLV_DATE_TO; }
	public String getInC1_JOB_ODR_STS_TYP() { return m_InC1_JOB_ODR_STS_TYP; }
	public String getInC2_JOB_ODR_STS_TYP() { return m_InC2_JOB_ODR_STS_TYP; }
	public String getInC3_JOB_ODR_STS_TYP() { return m_InC3_JOB_ODR_STS_TYP; }
	public String getInC4_JOB_ODR_STS_TYP() { return m_InC4_JOB_ODR_STS_TYP; }
	public String getInC5_JOB_ODR_STS_TYP() { return m_InC5_JOB_ODR_STS_TYP; }
	public String getInC9_JOB_ODR_STS_TYP() { return m_InC9_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getInC1_JOB_ODR_CANCEL() { return m_InC1_JOB_ODR_CANCEL; }
	public String getInC2_JOB_ODR_CANCEL() { return m_InC2_JOB_ODR_CANCEL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_c1_JOB_ODR_STS() { return l_c1_JOB_ODR_STS; }
	public List getList_c4_JOB_ODR_STS() { return l_c4_JOB_ODR_STS; }
	public List getList_c2_JOB_ODR_STS() { return l_c2_JOB_ODR_STS; }
	public List getList_c5_JOB_ODR_STS() { return l_c5_JOB_ODR_STS; }
	public List getList_c3_JOB_ODR_STS() { return l_c3_JOB_ODR_STS; }
	public List getList_c9_JOB_ODR_STS() { return l_c9_JOB_ODR_STS; }
	public List getList_l_JOB_ODR_STS_NAME() { return l_l_JOB_ODR_STS_NAME; }
	public List getList_l_JOB_ODR_NAME() { return l_l_JOB_ODR_NAME; }
	public List getList_l_PLAN_NAME() { return l_l_PLAN_NAME; }
	public List getList_l_JobOdrExpect() { return l_l_JobOdrExpect; }
	public List getList_JOB_ODR_TYP_name() { return l_JOB_ODR_TYP_name; }
	public List getList_JOB_ODR_TYP_val() { return l_JOB_ODR_TYP_val; }
	public List getList_c1_JOB_ODR_CANCEL() { return l_c1_JOB_ODR_CANCEL; }
	public List getList_c2_JOB_ODR_CANCEL() { return l_c2_JOB_ODR_CANCEL; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_CANCEL_NO() { return l_l_JOB_ODR_CANCEL_NO; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_JOB_ODR_QTY() { return l_l_JOB_ODR_QTY; }
	public List getList_l_JOB_ODR_DLV_DATE() { return l_l_JOB_ODR_DLV_DATE; }
	public List getList_l_JOB_ODR_STS_TYP() { return l_l_JOB_ODR_STS_TYP; }
	public List getList_l_JOB_ODR_TYP() { return l_l_JOB_ODR_TYP; }
	public List getList_l_PLAN_TYP() { return l_l_PLAN_TYP; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_JOB_ODR_DEL_FLG() { return l_l_JOB_ODR_DEL_FLG; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_l_ALCD_ENABLE_QTY() { return l_l_ALCD_ENABLE_QTY; }
	public List getList_JobOdrExpectFlg() { return l_JobOdrExpectFlg; }
	public List getList_sys_PLANT_CD() { return l_sys_PLANT_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_DLV_DATE_FROM() { return l_JOB_ODR_DLV_DATE_FROM; }
	public List getList_JOB_ODR_DLV_DATE_TO() { return l_JOB_ODR_DLV_DATE_TO; }
	public List getList_InC1_JOB_ODR_STS_TYP() { return l_InC1_JOB_ODR_STS_TYP; }
	public List getList_InC2_JOB_ODR_STS_TYP() { return l_InC2_JOB_ODR_STS_TYP; }
	public List getList_InC3_JOB_ODR_STS_TYP() { return l_InC3_JOB_ODR_STS_TYP; }
	public List getList_InC4_JOB_ODR_STS_TYP() { return l_InC4_JOB_ODR_STS_TYP; }
	public List getList_InC5_JOB_ODR_STS_TYP() { return l_InC5_JOB_ODR_STS_TYP; }
	public List getList_InC9_JOB_ODR_STS_TYP() { return l_InC9_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_InC1_JOB_ODR_CANCEL() { return l_InC1_JOB_ODR_CANCEL; }
	public List getList_InC2_JOB_ODR_CANCEL() { return l_InC2_JOB_ODR_CANCEL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setc1_JOB_ODR_STS(String val) { m_c1_JOB_ODR_STS = val; }
	public void setc4_JOB_ODR_STS(String val) { m_c4_JOB_ODR_STS = val; }
	public void setc2_JOB_ODR_STS(String val) { m_c2_JOB_ODR_STS = val; }
	public void setc5_JOB_ODR_STS(String val) { m_c5_JOB_ODR_STS = val; }
	public void setc3_JOB_ODR_STS(String val) { m_c3_JOB_ODR_STS = val; }
	public void setc9_JOB_ODR_STS(String val) { m_c9_JOB_ODR_STS = val; }
	public void setl_JOB_ODR_STS_NAME(String val) { m_l_JOB_ODR_STS_NAME = val; }
	public void setl_JOB_ODR_NAME(String val) { m_l_JOB_ODR_NAME = val; }
	public void setl_PLAN_NAME(String val) { m_l_PLAN_NAME = val; }
	public void setl_JobOdrExpect(String val) { m_l_JobOdrExpect = val; }
	public void setJOB_ODR_TYP_name(String val) { m_JOB_ODR_TYP_name = val; }
	public void setJOB_ODR_TYP_val(String val) { m_JOB_ODR_TYP_val = val; }
	public void setc1_JOB_ODR_CANCEL(String val) { m_c1_JOB_ODR_CANCEL = val; }
	public void setc2_JOB_ODR_CANCEL(String val) { m_c2_JOB_ODR_CANCEL = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_CANCEL_NO(String val) { m_l_JOB_ODR_CANCEL_NO = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_JOB_ODR_QTY(String val) { m_l_JOB_ODR_QTY = val; }
	public void setl_JOB_ODR_DLV_DATE(String val) { m_l_JOB_ODR_DLV_DATE = val; }
	public void setl_JOB_ODR_STS_TYP(String val) { m_l_JOB_ODR_STS_TYP = val; }
	public void setl_JOB_ODR_TYP(String val) { m_l_JOB_ODR_TYP = val; }
	public void setl_PLAN_TYP(String val) { m_l_PLAN_TYP = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_JOB_ODR_DEL_FLG(String val) { m_l_JOB_ODR_DEL_FLG = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setl_ALCD_ENABLE_QTY(String val) { m_l_ALCD_ENABLE_QTY = val; }
	public void setJobOdrExpectFlg(String val) { m_JobOdrExpectFlg = val; }
	public void setsys_PLANT_CD(String val) { m_sys_PLANT_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_DLV_DATE_FROM(String val) { m_JOB_ODR_DLV_DATE_FROM = val; }
	public void setJOB_ODR_DLV_DATE_TO(String val) { m_JOB_ODR_DLV_DATE_TO = val; }
	public void setInC1_JOB_ODR_STS_TYP(String val) { m_InC1_JOB_ODR_STS_TYP = val; }
	public void setInC2_JOB_ODR_STS_TYP(String val) { m_InC2_JOB_ODR_STS_TYP = val; }
	public void setInC3_JOB_ODR_STS_TYP(String val) { m_InC3_JOB_ODR_STS_TYP = val; }
	public void setInC4_JOB_ODR_STS_TYP(String val) { m_InC4_JOB_ODR_STS_TYP = val; }
	public void setInC5_JOB_ODR_STS_TYP(String val) { m_InC5_JOB_ODR_STS_TYP = val; }
	public void setInC9_JOB_ODR_STS_TYP(String val) { m_InC9_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setInC1_JOB_ODR_CANCEL(String val) { m_InC1_JOB_ODR_CANCEL = val; }
	public void setInC2_JOB_ODR_CANCEL(String val) { m_InC2_JOB_ODR_CANCEL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_c1_JOB_ODR_STS(List list) { l_c1_JOB_ODR_STS = list; }
	public void setList_c4_JOB_ODR_STS(List list) { l_c4_JOB_ODR_STS = list; }
	public void setList_c2_JOB_ODR_STS(List list) { l_c2_JOB_ODR_STS = list; }
	public void setList_c5_JOB_ODR_STS(List list) { l_c5_JOB_ODR_STS = list; }
	public void setList_c3_JOB_ODR_STS(List list) { l_c3_JOB_ODR_STS = list; }
	public void setList_c9_JOB_ODR_STS(List list) { l_c9_JOB_ODR_STS = list; }
	public void setList_l_JOB_ODR_STS_NAME(List list) { l_l_JOB_ODR_STS_NAME = list; }
	public void setList_l_JOB_ODR_NAME(List list) { l_l_JOB_ODR_NAME = list; }
	public void setList_l_PLAN_NAME(List list) { l_l_PLAN_NAME = list; }
	public void setList_l_JobOdrExpect(List list) { l_l_JobOdrExpect = list; }
	public void setList_JOB_ODR_TYP_name(List list) { l_JOB_ODR_TYP_name = list; }
	public void setList_JOB_ODR_TYP_val(List list) { l_JOB_ODR_TYP_val = list; }
	public void setList_c1_JOB_ODR_CANCEL(List list) { l_c1_JOB_ODR_CANCEL = list; }
	public void setList_c2_JOB_ODR_CANCEL(List list) { l_c2_JOB_ODR_CANCEL = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_CANCEL_NO(List list) { l_l_JOB_ODR_CANCEL_NO = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_JOB_ODR_QTY(List list) { l_l_JOB_ODR_QTY = list; }
	public void setList_l_JOB_ODR_DLV_DATE(List list) { l_l_JOB_ODR_DLV_DATE = list; }
	public void setList_l_JOB_ODR_STS_TYP(List list) { l_l_JOB_ODR_STS_TYP = list; }
	public void setList_l_JOB_ODR_TYP(List list) { l_l_JOB_ODR_TYP = list; }
	public void setList_l_PLAN_TYP(List list) { l_l_PLAN_TYP = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_JOB_ODR_DEL_FLG(List list) { l_l_JOB_ODR_DEL_FLG = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_l_ALCD_ENABLE_QTY(List list) { l_l_ALCD_ENABLE_QTY = list; }
	public void setList_JobOdrExpectFlg(List list) { l_JobOdrExpectFlg = list; }
	public void setList_sys_PLANT_CD(List list) { l_sys_PLANT_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_DLV_DATE_FROM(List list) { l_JOB_ODR_DLV_DATE_FROM = list; }
	public void setList_JOB_ODR_DLV_DATE_TO(List list) { l_JOB_ODR_DLV_DATE_TO = list; }
	public void setList_InC1_JOB_ODR_STS_TYP(List list) { l_InC1_JOB_ODR_STS_TYP = list; }
	public void setList_InC2_JOB_ODR_STS_TYP(List list) { l_InC2_JOB_ODR_STS_TYP = list; }
	public void setList_InC3_JOB_ODR_STS_TYP(List list) { l_InC3_JOB_ODR_STS_TYP = list; }
	public void setList_InC4_JOB_ODR_STS_TYP(List list) { l_InC4_JOB_ODR_STS_TYP = list; }
	public void setList_InC5_JOB_ODR_STS_TYP(List list) { l_InC5_JOB_ODR_STS_TYP = list; }
	public void setList_InC9_JOB_ODR_STS_TYP(List list) { l_InC9_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_InC1_JOB_ODR_CANCEL(List list) { l_InC1_JOB_ODR_CANCEL = list; }
	public void setList_InC2_JOB_ODR_CANCEL(List list) { l_InC2_JOB_ODR_CANCEL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_c1_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_JOB_ODR_STS == null) {
			l_c1_JOB_ODR_STS = new ArrayList();
		} else {
			l_c1_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc1_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_c4_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c4_JOB_ODR_STS == null) {
			l_c4_JOB_ODR_STS = new ArrayList();
		} else {
			l_c4_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c4_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc4_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_c2_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_JOB_ODR_STS == null) {
			l_c2_JOB_ODR_STS = new ArrayList();
		} else {
			l_c2_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc2_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_c5_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c5_JOB_ODR_STS == null) {
			l_c5_JOB_ODR_STS = new ArrayList();
		} else {
			l_c5_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c5_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc5_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_c3_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_JOB_ODR_STS == null) {
			l_c3_JOB_ODR_STS = new ArrayList();
		} else {
			l_c3_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc3_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_c9_JOB_ODR_STS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c9_JOB_ODR_STS == null) {
			l_c9_JOB_ODR_STS = new ArrayList();
		} else {
			l_c9_JOB_ODR_STS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c9_JOB_ODR_STS.add(((AC0130010Struct) list.get(i)).getc9_JOB_ODR_STS());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_STS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_STS_NAME == null) {
			l_l_JOB_ODR_STS_NAME = new ArrayList();
		} else {
			l_l_JOB_ODR_STS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_STS_NAME.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_STS_NAME());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_NAME == null) {
			l_l_JOB_ODR_NAME = new ArrayList();
		} else {
			l_l_JOB_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_NAME.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_NAME());
		}
		return size;
	}
	public int setL2L_l_PLAN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLAN_NAME == null) {
			l_l_PLAN_NAME = new ArrayList();
		} else {
			l_l_PLAN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLAN_NAME.add(((AC0130010Struct) list.get(i)).getl_PLAN_NAME());
		}
		return size;
	}
	public int setL2L_l_JobOdrExpect(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JobOdrExpect == null) {
			l_l_JobOdrExpect = new ArrayList();
		} else {
			l_l_JobOdrExpect.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JobOdrExpect.add(((AC0130010Struct) list.get(i)).getl_JobOdrExpect());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_name == null) {
			l_JOB_ODR_TYP_name = new ArrayList();
		} else {
			l_JOB_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_name.add(((AC0130010Struct) list.get(i)).getJOB_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_val == null) {
			l_JOB_ODR_TYP_val = new ArrayList();
		} else {
			l_JOB_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_val.add(((AC0130010Struct) list.get(i)).getJOB_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_c1_JOB_ODR_CANCEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_JOB_ODR_CANCEL == null) {
			l_c1_JOB_ODR_CANCEL = new ArrayList();
		} else {
			l_c1_JOB_ODR_CANCEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_JOB_ODR_CANCEL.add(((AC0130010Struct) list.get(i)).getc1_JOB_ODR_CANCEL());
		}
		return size;
	}
	public int setL2L_c2_JOB_ODR_CANCEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_JOB_ODR_CANCEL == null) {
			l_c2_JOB_ODR_CANCEL = new ArrayList();
		} else {
			l_c2_JOB_ODR_CANCEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_JOB_ODR_CANCEL.add(((AC0130010Struct) list.get(i)).getc2_JOB_ODR_CANCEL());
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
			l_l_JOB_ODR_CD.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_JOB_ODR_CANCEL_NO.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_CANCEL_NO());
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
			l_l_ITEM_CD.add(((AC0130010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AC0130010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_STOCK_UNIT.add(((AC0130010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_QTY == null) {
			l_l_JOB_ODR_QTY = new ArrayList();
		} else {
			l_l_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_QTY.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_DLV_DATE == null) {
			l_l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_DLV_DATE.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_DLV_DATE());
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
			l_l_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_TYP == null) {
			l_l_JOB_ODR_TYP = new ArrayList();
		} else {
			l_l_JOB_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_TYP.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_PLAN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLAN_TYP == null) {
			l_l_PLAN_TYP = new ArrayList();
		} else {
			l_l_PLAN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLAN_TYP.add(((AC0130010Struct) list.get(i)).getl_PLAN_TYP());
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
			l_l_ALC_GRP_CD.add(((AC0130010Struct) list.get(i)).getl_ALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_DEL_FLG == null) {
			l_l_JOB_ODR_DEL_FLG = new ArrayList();
		} else {
			l_l_JOB_ODR_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_DEL_FLG.add(((AC0130010Struct) list.get(i)).getl_JOB_ODR_DEL_FLG());
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
			l_l_ALCD_QTY.add(((AC0130010Struct) list.get(i)).getl_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_l_ALCD_ENABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCD_ENABLE_QTY == null) {
			l_l_ALCD_ENABLE_QTY = new ArrayList();
		} else {
			l_l_ALCD_ENABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCD_ENABLE_QTY.add(((AC0130010Struct) list.get(i)).getl_ALCD_ENABLE_QTY());
		}
		return size;
	}
	public int setL2L_JobOdrExpectFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JobOdrExpectFlg == null) {
			l_JobOdrExpectFlg = new ArrayList();
		} else {
			l_JobOdrExpectFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JobOdrExpectFlg.add(((AC0130010Struct) list.get(i)).getJobOdrExpectFlg());
		}
		return size;
	}
	public int setL2L_sys_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sys_PLANT_CD == null) {
			l_sys_PLANT_CD = new ArrayList();
		} else {
			l_sys_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sys_PLANT_CD.add(((AC0130010Struct) list.get(i)).getsys_PLANT_CD());
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
			l_JOB_ODR_CD.add(((AC0130010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_ITEM_CD.add(((AC0130010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE_FROM == null) {
			l_JOB_ODR_DLV_DATE_FROM = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE_FROM.add(((AC0130010Struct) list.get(i)).getJOB_ODR_DLV_DATE_FROM());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE_TO == null) {
			l_JOB_ODR_DLV_DATE_TO = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE_TO.add(((AC0130010Struct) list.get(i)).getJOB_ODR_DLV_DATE_TO());
		}
		return size;
	}
	public int setL2L_InC1_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC1_JOB_ODR_STS_TYP == null) {
			l_InC1_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC1_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC1_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC1_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC2_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC2_JOB_ODR_STS_TYP == null) {
			l_InC2_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC2_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC2_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC2_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC3_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC3_JOB_ODR_STS_TYP == null) {
			l_InC3_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC3_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC3_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC3_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC4_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC4_JOB_ODR_STS_TYP == null) {
			l_InC4_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC4_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC4_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC4_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC5_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC5_JOB_ODR_STS_TYP == null) {
			l_InC5_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC5_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC5_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC5_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_InC9_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC9_JOB_ODR_STS_TYP == null) {
			l_InC9_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_InC9_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC9_JOB_ODR_STS_TYP.add(((AC0130010Struct) list.get(i)).getInC9_JOB_ODR_STS_TYP());
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
			l_JOB_ODR_TYP.add(((AC0130010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_InC1_JOB_ODR_CANCEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC1_JOB_ODR_CANCEL == null) {
			l_InC1_JOB_ODR_CANCEL = new ArrayList();
		} else {
			l_InC1_JOB_ODR_CANCEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC1_JOB_ODR_CANCEL.add(((AC0130010Struct) list.get(i)).getInC1_JOB_ODR_CANCEL());
		}
		return size;
	}
	public int setL2L_InC2_JOB_ODR_CANCEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC2_JOB_ODR_CANCEL == null) {
			l_InC2_JOB_ODR_CANCEL = new ArrayList();
		} else {
			l_InC2_JOB_ODR_CANCEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC2_JOB_ODR_CANCEL.add(((AC0130010Struct) list.get(i)).getInC2_JOB_ODR_CANCEL());
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
			l_l_COUNT.add(((AC0130010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0130010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_c1_JOB_ODR_STS = null;
		m_c4_JOB_ODR_STS = null;
		m_c2_JOB_ODR_STS = null;
		m_c5_JOB_ODR_STS = null;
		m_c3_JOB_ODR_STS = null;
		m_c9_JOB_ODR_STS = null;
		m_l_JOB_ODR_STS_NAME = null;
		m_l_JOB_ODR_NAME = null;
		m_l_PLAN_NAME = null;
		m_l_JobOdrExpect = null;
		m_JOB_ODR_TYP_name = null;
		m_JOB_ODR_TYP_val = null;
		m_c1_JOB_ODR_CANCEL = null;
		m_c2_JOB_ODR_CANCEL = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_CANCEL_NO = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_STOCK_UNIT = null;
		m_l_JOB_ODR_QTY = null;
		m_l_JOB_ODR_DLV_DATE = null;
		m_l_JOB_ODR_STS_TYP = null;
		m_l_JOB_ODR_TYP = null;
		m_l_PLAN_TYP = null;
		m_l_ALC_GRP_CD = null;
		m_l_JOB_ODR_DEL_FLG = null;
		m_l_ALCD_QTY = null;
		m_l_ALCD_ENABLE_QTY = null;
		m_JobOdrExpectFlg = null;
		m_sys_PLANT_CD = null;
		m_JOB_ODR_CD = null;
		m_ITEM_CD = null;
		m_JOB_ODR_DLV_DATE_FROM = null;
		m_JOB_ODR_DLV_DATE_TO = null;
		m_InC1_JOB_ODR_STS_TYP = null;
		m_InC2_JOB_ODR_STS_TYP = null;
		m_InC3_JOB_ODR_STS_TYP = null;
		m_InC4_JOB_ODR_STS_TYP = null;
		m_InC5_JOB_ODR_STS_TYP = null;
		m_InC9_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_TYP = null;
		m_InC1_JOB_ODR_CANCEL = null;
		m_InC2_JOB_ODR_CANCEL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_c1_JOB_ODR_STS = null;
		l_c4_JOB_ODR_STS = null;
		l_c2_JOB_ODR_STS = null;
		l_c5_JOB_ODR_STS = null;
		l_c3_JOB_ODR_STS = null;
		l_c9_JOB_ODR_STS = null;
		l_l_JOB_ODR_STS_NAME = null;
		l_l_JOB_ODR_NAME = null;
		l_l_PLAN_NAME = null;
		l_l_JobOdrExpect = null;
		l_JOB_ODR_TYP_name = null;
		l_JOB_ODR_TYP_val = null;
		l_c1_JOB_ODR_CANCEL = null;
		l_c2_JOB_ODR_CANCEL = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_CANCEL_NO = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_STOCK_UNIT = null;
		l_l_JOB_ODR_QTY = null;
		l_l_JOB_ODR_DLV_DATE = null;
		l_l_JOB_ODR_STS_TYP = null;
		l_l_JOB_ODR_TYP = null;
		l_l_PLAN_TYP = null;
		l_l_ALC_GRP_CD = null;
		l_l_JOB_ODR_DEL_FLG = null;
		l_l_ALCD_QTY = null;
		l_l_ALCD_ENABLE_QTY = null;
		l_JobOdrExpectFlg = null;
		l_sys_PLANT_CD = null;
		l_JOB_ODR_CD = null;
		l_ITEM_CD = null;
		l_JOB_ODR_DLV_DATE_FROM = null;
		l_JOB_ODR_DLV_DATE_TO = null;
		l_InC1_JOB_ODR_STS_TYP = null;
		l_InC2_JOB_ODR_STS_TYP = null;
		l_InC3_JOB_ODR_STS_TYP = null;
		l_InC4_JOB_ODR_STS_TYP = null;
		l_InC5_JOB_ODR_STS_TYP = null;
		l_InC9_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_TYP = null;
		l_InC1_JOB_ODR_CANCEL = null;
		l_InC2_JOB_ODR_CANCEL = null;
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
	 * medAC0130010クラスの標準コンストラクタ
	 */
	public AC0130010Struct()
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
	public void setStruct(AC0130010Struct struct)
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
	public void setStructM(AC0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setc1_JOB_ODR_STS(struct.getc1_JOB_ODR_STS());
			this.setc4_JOB_ODR_STS(struct.getc4_JOB_ODR_STS());
			this.setc2_JOB_ODR_STS(struct.getc2_JOB_ODR_STS());
			this.setc5_JOB_ODR_STS(struct.getc5_JOB_ODR_STS());
			this.setc3_JOB_ODR_STS(struct.getc3_JOB_ODR_STS());
			this.setc9_JOB_ODR_STS(struct.getc9_JOB_ODR_STS());
			this.setl_JOB_ODR_STS_NAME(struct.getl_JOB_ODR_STS_NAME());
			this.setl_JOB_ODR_NAME(struct.getl_JOB_ODR_NAME());
			this.setl_PLAN_NAME(struct.getl_PLAN_NAME());
			this.setl_JobOdrExpect(struct.getl_JobOdrExpect());
			this.setJOB_ODR_TYP_name(struct.getJOB_ODR_TYP_name());
			this.setJOB_ODR_TYP_val(struct.getJOB_ODR_TYP_val());
			this.setc1_JOB_ODR_CANCEL(struct.getc1_JOB_ODR_CANCEL());
			this.setc2_JOB_ODR_CANCEL(struct.getc2_JOB_ODR_CANCEL());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_JOB_ODR_QTY(struct.getl_JOB_ODR_QTY());
			this.setl_JOB_ODR_DLV_DATE(struct.getl_JOB_ODR_DLV_DATE());
			this.setl_JOB_ODR_STS_TYP(struct.getl_JOB_ODR_STS_TYP());
			this.setl_JOB_ODR_TYP(struct.getl_JOB_ODR_TYP());
			this.setl_PLAN_TYP(struct.getl_PLAN_TYP());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_JOB_ODR_DEL_FLG(struct.getl_JOB_ODR_DEL_FLG());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setl_ALCD_ENABLE_QTY(struct.getl_ALCD_ENABLE_QTY());
			this.setJobOdrExpectFlg(struct.getJobOdrExpectFlg());
			this.setsys_PLANT_CD(struct.getsys_PLANT_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_DLV_DATE_FROM(struct.getJOB_ODR_DLV_DATE_FROM());
			this.setJOB_ODR_DLV_DATE_TO(struct.getJOB_ODR_DLV_DATE_TO());
			this.setInC1_JOB_ODR_STS_TYP(struct.getInC1_JOB_ODR_STS_TYP());
			this.setInC2_JOB_ODR_STS_TYP(struct.getInC2_JOB_ODR_STS_TYP());
			this.setInC3_JOB_ODR_STS_TYP(struct.getInC3_JOB_ODR_STS_TYP());
			this.setInC4_JOB_ODR_STS_TYP(struct.getInC4_JOB_ODR_STS_TYP());
			this.setInC5_JOB_ODR_STS_TYP(struct.getInC5_JOB_ODR_STS_TYP());
			this.setInC9_JOB_ODR_STS_TYP(struct.getInC9_JOB_ODR_STS_TYP());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setInC1_JOB_ODR_CANCEL(struct.getInC1_JOB_ODR_CANCEL());
			this.setInC2_JOB_ODR_CANCEL(struct.getInC2_JOB_ODR_CANCEL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_c1_JOB_ODR_STS(struct.getList_c1_JOB_ODR_STS());
			this.setList_c4_JOB_ODR_STS(struct.getList_c4_JOB_ODR_STS());
			this.setList_c2_JOB_ODR_STS(struct.getList_c2_JOB_ODR_STS());
			this.setList_c5_JOB_ODR_STS(struct.getList_c5_JOB_ODR_STS());
			this.setList_c3_JOB_ODR_STS(struct.getList_c3_JOB_ODR_STS());
			this.setList_c9_JOB_ODR_STS(struct.getList_c9_JOB_ODR_STS());
			this.setList_l_JOB_ODR_STS_NAME(struct.getList_l_JOB_ODR_STS_NAME());
			this.setList_l_JOB_ODR_NAME(struct.getList_l_JOB_ODR_NAME());
			this.setList_l_PLAN_NAME(struct.getList_l_PLAN_NAME());
			this.setList_l_JobOdrExpect(struct.getList_l_JobOdrExpect());
			this.setList_JOB_ODR_TYP_name(struct.getList_JOB_ODR_TYP_name());
			this.setList_JOB_ODR_TYP_val(struct.getList_JOB_ODR_TYP_val());
			this.setList_c1_JOB_ODR_CANCEL(struct.getList_c1_JOB_ODR_CANCEL());
			this.setList_c2_JOB_ODR_CANCEL(struct.getList_c2_JOB_ODR_CANCEL());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_CANCEL_NO(struct.getList_l_JOB_ODR_CANCEL_NO());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_JOB_ODR_QTY(struct.getList_l_JOB_ODR_QTY());
			this.setList_l_JOB_ODR_DLV_DATE(struct.getList_l_JOB_ODR_DLV_DATE());
			this.setList_l_JOB_ODR_STS_TYP(struct.getList_l_JOB_ODR_STS_TYP());
			this.setList_l_JOB_ODR_TYP(struct.getList_l_JOB_ODR_TYP());
			this.setList_l_PLAN_TYP(struct.getList_l_PLAN_TYP());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_JOB_ODR_DEL_FLG(struct.getList_l_JOB_ODR_DEL_FLG());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_l_ALCD_ENABLE_QTY(struct.getList_l_ALCD_ENABLE_QTY());
			this.setList_JobOdrExpectFlg(struct.getList_JobOdrExpectFlg());
			this.setList_sys_PLANT_CD(struct.getList_sys_PLANT_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_DLV_DATE_FROM(struct.getList_JOB_ODR_DLV_DATE_FROM());
			this.setList_JOB_ODR_DLV_DATE_TO(struct.getList_JOB_ODR_DLV_DATE_TO());
			this.setList_InC1_JOB_ODR_STS_TYP(struct.getList_InC1_JOB_ODR_STS_TYP());
			this.setList_InC2_JOB_ODR_STS_TYP(struct.getList_InC2_JOB_ODR_STS_TYP());
			this.setList_InC3_JOB_ODR_STS_TYP(struct.getList_InC3_JOB_ODR_STS_TYP());
			this.setList_InC4_JOB_ODR_STS_TYP(struct.getList_InC4_JOB_ODR_STS_TYP());
			this.setList_InC5_JOB_ODR_STS_TYP(struct.getList_InC5_JOB_ODR_STS_TYP());
			this.setList_InC9_JOB_ODR_STS_TYP(struct.getList_InC9_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_InC1_JOB_ODR_CANCEL(struct.getList_InC1_JOB_ODR_CANCEL());
			this.setList_InC2_JOB_ODR_CANCEL(struct.getList_InC2_JOB_ODR_CANCEL());
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
	// 第 1 変数初期値： i_c1_JOB_ODR_STS


	final static String i_c1_JOB_ODR_STS = null;

	// 第 2 変数初期値： i_c4_JOB_ODR_STS


	final static String i_c4_JOB_ODR_STS = null;

	// 第 3 変数初期値： i_c2_JOB_ODR_STS


	final static String i_c2_JOB_ODR_STS = null;

	// 第 4 変数初期値： i_c5_JOB_ODR_STS


	final static String i_c5_JOB_ODR_STS = null;

	// 第 5 変数初期値： i_c3_JOB_ODR_STS


	final static String i_c3_JOB_ODR_STS = null;

	// 第 6 変数初期値： i_c9_JOB_ODR_STS


	final static String i_c9_JOB_ODR_STS = null;

	// 第 7 変数初期値： i_l_JOB_ODR_STS_NAME


	final static String i_l_JOB_ODR_STS_NAME = null;

	// 第 8 変数初期値： i_l_JOB_ODR_NAME


	final static String i_l_JOB_ODR_NAME = null;

	// 第 9 変数初期値： i_l_PLAN_NAME


	final static String i_l_PLAN_NAME = null;

	// 第 10 変数初期値： i_l_JobOdrExpect


	final static String i_l_JobOdrExpect = null;

	// 第 11 変数初期値： i_JOB_ODR_TYP_name


	final static String i_JOB_ODR_TYP_name = null;

	// 第 12 変数初期値： i_JOB_ODR_TYP_val


	final static String i_JOB_ODR_TYP_val = null;

	// 第 13 変数初期値： i_c1_JOB_ODR_CANCEL


	final static String i_c1_JOB_ODR_CANCEL = null;

	// 第 14 変数初期値： i_c2_JOB_ODR_CANCEL


	final static String i_c2_JOB_ODR_CANCEL = null;

	// 第 15 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 16 変数初期値： i_l_JOB_ODR_CANCEL_NO


	final static String i_l_JOB_ODR_CANCEL_NO = null;

	// 第 17 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 18 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 19 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 20 変数初期値： i_l_JOB_ODR_QTY


	final static String i_l_JOB_ODR_QTY = null;

	// 第 21 変数初期値： i_l_JOB_ODR_DLV_DATE


	final static String i_l_JOB_ODR_DLV_DATE = null;

	// 第 22 変数初期値： i_l_JOB_ODR_STS_TYP


	final static String i_l_JOB_ODR_STS_TYP = null;

	// 第 23 変数初期値： i_l_JOB_ODR_TYP


	final static String i_l_JOB_ODR_TYP = null;

	// 第 24 変数初期値： i_l_PLAN_TYP


	final static String i_l_PLAN_TYP = null;

	// 第 25 変数初期値： i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// 第 26 変数初期値： i_l_JOB_ODR_DEL_FLG


	final static String i_l_JOB_ODR_DEL_FLG = null;

	// 第 27 変数初期値： i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// 第 28 変数初期値： i_l_ALCD_ENABLE_QTY


	final static String i_l_ALCD_ENABLE_QTY = null;

	// 第 29 変数初期値： i_JobOdrExpectFlg


	final static String i_JobOdrExpectFlg = null;

	// 第 30 変数初期値： i_sys_PLANT_CD


	final static String i_sys_PLANT_CD = null;

	// 第 31 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 32 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 33 変数初期値： i_JOB_ODR_DLV_DATE_FROM


	final static String i_JOB_ODR_DLV_DATE_FROM = null;

	// 第 34 変数初期値： i_JOB_ODR_DLV_DATE_TO


	final static String i_JOB_ODR_DLV_DATE_TO = null;

	// 第 35 変数初期値： i_InC1_JOB_ODR_STS_TYP


	final static String i_InC1_JOB_ODR_STS_TYP = null;

	// 第 36 変数初期値： i_InC2_JOB_ODR_STS_TYP


	final static String i_InC2_JOB_ODR_STS_TYP = null;

	// 第 37 変数初期値： i_InC3_JOB_ODR_STS_TYP


	final static String i_InC3_JOB_ODR_STS_TYP = null;

	// 第 38 変数初期値： i_InC4_JOB_ODR_STS_TYP


	final static String i_InC4_JOB_ODR_STS_TYP = null;

	// 第 39 変数初期値： i_InC5_JOB_ODR_STS_TYP


	final static String i_InC5_JOB_ODR_STS_TYP = null;

	// 第 40 変数初期値： i_InC9_JOB_ODR_STS_TYP


	final static String i_InC9_JOB_ODR_STS_TYP = null;

	// 第 41 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 42 変数初期値： i_InC1_JOB_ODR_CANCEL


	final static String i_InC1_JOB_ODR_CANCEL = null;

	// 第 43 変数初期値： i_InC2_JOB_ODR_CANCEL


	final static String i_InC2_JOB_ODR_CANCEL = null;

	// 第 44 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 45 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_c1_JOB_ODR_STS

	final static String i_c1_JOB_ODR_STS = null;

	// 第 2 変数初期値： i_c4_JOB_ODR_STS

	final static String i_c4_JOB_ODR_STS = null;

	// 第 3 変数初期値： i_c2_JOB_ODR_STS

	final static String i_c2_JOB_ODR_STS = null;

	// 第 4 変数初期値： i_c5_JOB_ODR_STS

	final static String i_c5_JOB_ODR_STS = null;

	// 第 5 変数初期値： i_c3_JOB_ODR_STS

	final static String i_c3_JOB_ODR_STS = null;

	// 第 6 変数初期値： i_c9_JOB_ODR_STS

	final static String i_c9_JOB_ODR_STS = null;

	// 第 7 変数初期値： i_l_JOB_ODR_STS_NAME

	final static String i_l_JOB_ODR_STS_NAME = null;

	// 第 8 変数初期値： i_l_JOB_ODR_NAME

	final static String i_l_JOB_ODR_NAME = null;

	// 第 9 変数初期値： i_l_PLAN_NAME

	final static String i_l_PLAN_NAME = null;

	// 第 10 変数初期値： i_l_JOB_ODR_EXP_NAME

	final static String i_l_JOB_ODR_EXP_NAME = null;

	// 第 11 変数初期値： i_l_JobOdrExpect

	final static String i_l_JobOdrExpect = null;

	// 第 12 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 13 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 14 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 15 変数初期値： i_l_JOB_ODR_QTY

	final static String i_l_JOB_ODR_QTY = null;

	// 第 16 変数初期値： i_l_JOB_ODR_DLV_DATE

	final static String i_l_JOB_ODR_DLV_DATE = null;

	// 第 17 変数初期値： i_l_JOB_ODR_STS_TYP

	final static String i_l_JOB_ODR_STS_TYP = null;

	// 第 18 変数初期値： i_l_JOB_ODR_TYP

	final static String i_l_JOB_ODR_TYP = null;

	// 第 19 変数初期値： i_l_PLAN_TYP

	final static String i_l_PLAN_TYP = null;

	// 第 20 変数初期値： i_l_ALC_GRP_CD

	final static String i_l_ALC_GRP_CD = null;

	// 第 21 変数初期値： i_l_JOB_ODR_EXP_TYP

	final static String i_l_JOB_ODR_EXP_TYP = null;

	// 第 22 変数初期値： i_l_JOB_ODR_DEL_FLG

	final static String i_l_JOB_ODR_DEL_FLG = null;

	// 第 23 変数初期値： i_l_ALCD_QTY

	final static String i_l_ALCD_QTY = null;

	// 第 24 変数初期値： i_l_ALCD_ENABLE_QTY

	final static String i_l_ALCD_ENABLE_QTY = null;

	// 第 25 変数初期値： i_sys_PLANT_CD

	final static String i_sys_PLANT_CD = null;

	// 第 26 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 27 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 28 変数初期値： i_JOB_ODR_DLV_DATE_FROM

	final static String i_JOB_ODR_DLV_DATE_FROM = null;

	// 第 29 変数初期値： i_JOB_ODR_DLV_DATE_TO

	final static String i_JOB_ODR_DLV_DATE_TO = null;

	// 第 30 変数初期値： i_InC1_JOB_ODR_STS_TYP

	final static String i_InC1_JOB_ODR_STS_TYP = null;

	// 第 31 変数初期値： i_InC2_JOB_ODR_STS_TYP

	final static String i_InC2_JOB_ODR_STS_TYP = null;

	// 第 32 変数初期値： i_InC3_JOB_ODR_STS_TYP

	final static String i_InC3_JOB_ODR_STS_TYP = null;

	// 第 33 変数初期値： i_InC4_JOB_ODR_STS_TYP

	final static String i_InC4_JOB_ODR_STS_TYP = null;

	// 第 34 変数初期値： i_InC5_JOB_ODR_STS_TYP

	final static String i_InC5_JOB_ODR_STS_TYP = null;

	// 第 35 変数初期値： i_InC9_JOB_ODR_STS_TYP

	final static String i_InC9_JOB_ODR_STS_TYP = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_c1_JOB_ODR_STS = i_c1_JOB_ODR_STS;
		m_c4_JOB_ODR_STS = i_c4_JOB_ODR_STS;
		m_c2_JOB_ODR_STS = i_c2_JOB_ODR_STS;
		m_c5_JOB_ODR_STS = i_c5_JOB_ODR_STS;
		m_c3_JOB_ODR_STS = i_c3_JOB_ODR_STS;
		m_c9_JOB_ODR_STS = i_c9_JOB_ODR_STS;
		m_l_JOB_ODR_STS_NAME = i_l_JOB_ODR_STS_NAME;
		m_l_JOB_ODR_NAME = i_l_JOB_ODR_NAME;
		m_l_PLAN_NAME = i_l_PLAN_NAME;
		m_l_JobOdrExpect = i_l_JobOdrExpect;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_JOB_ODR_QTY = i_l_JOB_ODR_QTY;
		m_l_JOB_ODR_DLV_DATE = i_l_JOB_ODR_DLV_DATE;
		m_l_JOB_ODR_STS_TYP = i_l_JOB_ODR_STS_TYP;
		m_l_JOB_ODR_TYP = i_l_JOB_ODR_TYP;
		m_l_PLAN_TYP = i_l_PLAN_TYP;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_l_JOB_ODR_DEL_FLG = i_l_JOB_ODR_DEL_FLG;
		m_l_ALCD_QTY = i_l_ALCD_QTY;
		m_l_ALCD_ENABLE_QTY = i_l_ALCD_ENABLE_QTY;
		m_sys_PLANT_CD = i_sys_PLANT_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_JOB_ODR_DLV_DATE_FROM = i_JOB_ODR_DLV_DATE_FROM;
		m_JOB_ODR_DLV_DATE_TO = i_JOB_ODR_DLV_DATE_TO;
		m_InC1_JOB_ODR_STS_TYP = i_InC1_JOB_ODR_STS_TYP;
		m_InC2_JOB_ODR_STS_TYP = i_InC2_JOB_ODR_STS_TYP;
		m_InC3_JOB_ODR_STS_TYP = i_InC3_JOB_ODR_STS_TYP;
		m_InC4_JOB_ODR_STS_TYP = i_InC4_JOB_ODR_STS_TYP;
		m_InC5_JOB_ODR_STS_TYP = i_InC5_JOB_ODR_STS_TYP;
		m_InC9_JOB_ODR_STS_TYP = i_InC9_JOB_ODR_STS_TYP;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
