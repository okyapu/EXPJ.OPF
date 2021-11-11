/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0040/src/com/nec/jp/orteus/metamorBase/AA0040/AA0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0040;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_MRP_ODR_NAME */
	public String m_w_MRP_ODR_NAME = null;
	/** 第 2 変数： m_w_OUTSIDE_NAME */
	public String m_w_OUTSIDE_NAME = null;
	/** 第 3 変数： m_UNIT_COST_NAME */
	public String m_UNIT_COST_NAME = null;
	/** 第 4 変数： m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** 第 5 変数： m_UNIT_COST_TYP_val */
	public Integer m_UNIT_COST_TYP_val = null;
	/** 第 6 変数： m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** 第 7 変数： m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** 第 8 変数： m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** 第 9 変数： m_p_APPR_REMARKS */
	public String m_p_APPR_REMARKS = null;
	/** 第 10 変数： m_h_APR_PUCH_UNIT_COST */
	public String m_h_APR_PUCH_UNIT_COST = null;
	/** 第 11 変数： m_h_PUCH_PRIORITY_REF_NO_1 */
	public String m_h_PUCH_PRIORITY_REF_NO_1 = null;
	/** 第 12 変数： m_h_VEND_ITEM_CD_1 */
	public String m_h_VEND_ITEM_CD_1 = null;
	/** 第 13 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 14 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 15 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 16 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 17 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 18 変数： m_PUCH_SIZE */
	public String m_PUCH_SIZE = null;
	/** 第 19 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 20 変数： m_UNIT_COST_TYP */
	public Integer m_UNIT_COST_TYP = null;
	/** 第 21 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 22 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 23 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 24 変数： m_PUCH_PRIORITY_REF_NO */
	public String m_PUCH_PRIORITY_REF_NO = null;
	/** 第 25 変数： m_VEND_ITEM_CD */
	public String m_VEND_ITEM_CD = null;
	/** 第 26 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 27 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 28 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 29 変数： m_w_OUTSIDE_TYP */
	public String m_w_OUTSIDE_TYP = null;
	/** 第 30 変数： m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** 第 31 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 32 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 33 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 34 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 35 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 36 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 37 変数： m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** 第 38 変数： m_w_MODIFY_COUNT_H */
	public String m_w_MODIFY_COUNT_H = null;
	/** 第 39 変数： m_p_PLANT_CD */
	public String m_p_PLANT_CD = null;
	/** 第 40 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 41 変数： m_p_BUSINESS_DATE */
	public String m_p_BUSINESS_DATE = null;
	/** 第 42 変数： m_p_VALUE */
	public String m_p_VALUE = null;
	/** 第 43 変数： m_p_NAME */
	public String m_p_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_MRP_ODR_NAME */
	public List l_w_MRP_ODR_NAME = null;

	/** 第 2 List変数： l_w_OUTSIDE_NAME */
	public List l_w_OUTSIDE_NAME = null;

	/** 第 3 List変数： l_UNIT_COST_NAME */
	public List l_UNIT_COST_NAME = null;

	/** 第 4 List変数： l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** 第 5 List変数： l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** 第 6 List変数： l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** 第 7 List変数： l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** 第 8 List変数： l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** 第 9 List変数： l_p_APPR_REMARKS */
	public List l_p_APPR_REMARKS = null;

	/** 第 10 List変数： l_h_APR_PUCH_UNIT_COST */
	public List l_h_APR_PUCH_UNIT_COST = null;

	/** 第 11 List変数： l_h_PUCH_PRIORITY_REF_NO_1 */
	public List l_h_PUCH_PRIORITY_REF_NO_1 = null;

	/** 第 12 List変数： l_h_VEND_ITEM_CD_1 */
	public List l_h_VEND_ITEM_CD_1 = null;

	/** 第 13 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 14 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 15 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 16 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 17 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 18 List変数： l_PUCH_SIZE */
	public List l_PUCH_SIZE = null;

	/** 第 19 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 20 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 21 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 22 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 23 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 24 List変数： l_PUCH_PRIORITY_REF_NO */
	public List l_PUCH_PRIORITY_REF_NO = null;

	/** 第 25 List変数： l_VEND_ITEM_CD */
	public List l_VEND_ITEM_CD = null;

	/** 第 26 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 27 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 28 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 29 List変数： l_w_OUTSIDE_TYP */
	public List l_w_OUTSIDE_TYP = null;

	/** 第 30 List変数： l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** 第 31 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 32 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 33 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 34 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 35 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 36 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 37 List変数： l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** 第 38 List変数： l_w_MODIFY_COUNT_H */
	public List l_w_MODIFY_COUNT_H = null;

	/** 第 39 List変数： l_p_PLANT_CD */
	public List l_p_PLANT_CD = null;

	/** 第 40 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 41 List変数： l_p_BUSINESS_DATE */
	public List l_p_BUSINESS_DATE = null;

	/** 第 42 List変数： l_p_VALUE */
	public List l_p_VALUE = null;

	/** 第 43 List変数： l_p_NAME */
	public List l_p_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_MRP_ODR_NAME() { return m_w_MRP_ODR_NAME; }
	public String getw_OUTSIDE_NAME() { return m_w_OUTSIDE_NAME; }
	public String getUNIT_COST_NAME() { return m_UNIT_COST_NAME; }
	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public Integer getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String getp_APPR_REMARKS() { return m_p_APPR_REMARKS; }
	public String geth_APR_PUCH_UNIT_COST() { return m_h_APR_PUCH_UNIT_COST; }
	public String geth_PUCH_PRIORITY_REF_NO_1() { return m_h_PUCH_PRIORITY_REF_NO_1; }
	public String geth_VEND_ITEM_CD_1() { return m_h_VEND_ITEM_CD_1; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getPUCH_SIZE() { return m_PUCH_SIZE; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public Integer getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_PRIORITY_REF_NO() { return m_PUCH_PRIORITY_REF_NO; }
	public String getVEND_ITEM_CD() { return m_VEND_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getw_OUTSIDE_TYP() { return m_w_OUTSIDE_TYP; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public String getw_MODIFY_COUNT_H() { return m_w_MODIFY_COUNT_H; }
	public String getp_PLANT_CD() { return m_p_PLANT_CD; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getp_BUSINESS_DATE() { return m_p_BUSINESS_DATE; }
	public String getp_VALUE() { return m_p_VALUE; }
	public String getp_NAME() { return m_p_NAME; }

	public List getList_w_MRP_ODR_NAME() { return l_w_MRP_ODR_NAME; }
	public List getList_w_OUTSIDE_NAME() { return l_w_OUTSIDE_NAME; }
	public List getList_UNIT_COST_NAME() { return l_UNIT_COST_NAME; }
	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_p_APPR_REMARKS() { return l_p_APPR_REMARKS; }
	public List getList_h_APR_PUCH_UNIT_COST() { return l_h_APR_PUCH_UNIT_COST; }
	public List getList_h_PUCH_PRIORITY_REF_NO_1() { return l_h_PUCH_PRIORITY_REF_NO_1; }
	public List getList_h_VEND_ITEM_CD_1() { return l_h_VEND_ITEM_CD_1; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_PUCH_SIZE() { return l_PUCH_SIZE; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_PRIORITY_REF_NO() { return l_PUCH_PRIORITY_REF_NO; }
	public List getList_VEND_ITEM_CD() { return l_VEND_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_w_OUTSIDE_TYP() { return l_w_OUTSIDE_TYP; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_w_MODIFY_COUNT_H() { return l_w_MODIFY_COUNT_H; }
	public List getList_p_PLANT_CD() { return l_p_PLANT_CD; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_p_BUSINESS_DATE() { return l_p_BUSINESS_DATE; }
	public List getList_p_VALUE() { return l_p_VALUE; }
	public List getList_p_NAME() { return l_p_NAME; }

	public void setw_MRP_ODR_NAME(String val) { m_w_MRP_ODR_NAME = val; }
	public void setw_OUTSIDE_NAME(String val) { m_w_OUTSIDE_NAME = val; }
	public void setUNIT_COST_NAME(String val) { m_UNIT_COST_NAME = val; }
	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(Integer val) { m_UNIT_COST_TYP_val = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void setp_APPR_REMARKS(String val) { m_p_APPR_REMARKS = val; }
	public void seth_APR_PUCH_UNIT_COST(String val) { m_h_APR_PUCH_UNIT_COST = val; }
	public void seth_PUCH_PRIORITY_REF_NO_1(String val) { m_h_PUCH_PRIORITY_REF_NO_1 = val; }
	public void seth_VEND_ITEM_CD_1(String val) { m_h_VEND_ITEM_CD_1 = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setPUCH_SIZE(String val) { m_PUCH_SIZE = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP(Integer val) { m_UNIT_COST_TYP = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_PRIORITY_REF_NO(String val) { m_PUCH_PRIORITY_REF_NO = val; }
	public void setVEND_ITEM_CD(String val) { m_VEND_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setw_OUTSIDE_TYP(String val) { m_w_OUTSIDE_TYP = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setw_MODIFY_COUNT_H(String val) { m_w_MODIFY_COUNT_H = val; }
	public void setp_PLANT_CD(String val) { m_p_PLANT_CD = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setp_BUSINESS_DATE(String val) { m_p_BUSINESS_DATE = val; }
	public void setp_VALUE(String val) { m_p_VALUE = val; }
	public void setp_NAME(String val) { m_p_NAME = val; }

	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = getInteger(val); }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = getInteger(val); }

	public void setList_w_MRP_ODR_NAME(List list) { l_w_MRP_ODR_NAME = list; }
	public void setList_w_OUTSIDE_NAME(List list) { l_w_OUTSIDE_NAME = list; }
	public void setList_UNIT_COST_NAME(List list) { l_UNIT_COST_NAME = list; }
	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_p_APPR_REMARKS(List list) { l_p_APPR_REMARKS = list; }
	public void setList_h_APR_PUCH_UNIT_COST(List list) { l_h_APR_PUCH_UNIT_COST = list; }
	public void setList_h_PUCH_PRIORITY_REF_NO_1(List list) { l_h_PUCH_PRIORITY_REF_NO_1 = list; }
	public void setList_h_VEND_ITEM_CD_1(List list) { l_h_VEND_ITEM_CD_1 = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_PUCH_SIZE(List list) { l_PUCH_SIZE = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_PRIORITY_REF_NO(List list) { l_PUCH_PRIORITY_REF_NO = list; }
	public void setList_VEND_ITEM_CD(List list) { l_VEND_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_w_OUTSIDE_TYP(List list) { l_w_OUTSIDE_TYP = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_w_MODIFY_COUNT_H(List list) { l_w_MODIFY_COUNT_H = list; }
	public void setList_p_PLANT_CD(List list) { l_p_PLANT_CD = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_p_BUSINESS_DATE(List list) { l_p_BUSINESS_DATE = list; }
	public void setList_p_VALUE(List list) { l_p_VALUE = list; }
	public void setList_p_NAME(List list) { l_p_NAME = list; }

	public int setL2L_w_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_NAME == null) {
			l_w_MRP_ODR_NAME = new ArrayList();
		} else {
			l_w_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_NAME.add(((AA0040010Struct) list.get(i)).getw_MRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_NAME == null) {
			l_w_OUTSIDE_NAME = new ArrayList();
		} else {
			l_w_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_NAME.add(((AA0040010Struct) list.get(i)).getw_OUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_COST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_NAME == null) {
			l_UNIT_COST_NAME = new ArrayList();
		} else {
			l_UNIT_COST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_NAME.add(((AA0040010Struct) list.get(i)).getUNIT_COST_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_name == null) {
			l_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_name.add(((AA0040010Struct) list.get(i)).getUNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_val == null) {
			l_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_val.add(((AA0040010Struct) list.get(i)).getUNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_h_SCREENMOVE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREENMOVE_TYP == null) {
			l_h_SCREENMOVE_TYP = new ArrayList();
		} else {
			l_h_SCREENMOVE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREENMOVE_TYP.add(((AA0040010Struct) list.get(i)).geth_SCREENMOVE_TYP());
		}
		return size;
	}
	public int setL2L_h_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_ID == null) {
			l_h_APPR_ID = new ArrayList();
		} else {
			l_h_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_ID.add(((AA0040010Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((AA0040010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_p_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_APPR_REMARKS == null) {
			l_p_APPR_REMARKS = new ArrayList();
		} else {
			l_p_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_APPR_REMARKS.add(((AA0040010Struct) list.get(i)).getp_APPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_PUCH_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_PUCH_UNIT_COST == null) {
			l_h_APR_PUCH_UNIT_COST = new ArrayList();
		} else {
			l_h_APR_PUCH_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_PUCH_UNIT_COST.add(((AA0040010Struct) list.get(i)).geth_APR_PUCH_UNIT_COST());
		}
		return size;
	}
	public int setL2L_h_PUCH_PRIORITY_REF_NO_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_PRIORITY_REF_NO_1 == null) {
			l_h_PUCH_PRIORITY_REF_NO_1 = new ArrayList();
		} else {
			l_h_PUCH_PRIORITY_REF_NO_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_PRIORITY_REF_NO_1.add(((AA0040010Struct) list.get(i)).geth_PUCH_PRIORITY_REF_NO_1());
		}
		return size;
	}
	public int setL2L_h_VEND_ITEM_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VEND_ITEM_CD_1 == null) {
			l_h_VEND_ITEM_CD_1 = new ArrayList();
		} else {
			l_h_VEND_ITEM_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VEND_ITEM_CD_1.add(((AA0040010Struct) list.get(i)).geth_VEND_ITEM_CD_1());
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
			l_w_PLANT_CD.add(((AA0040010Struct) list.get(i)).getw_PLANT_CD());
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
			l_COMPANY_CD.add(((AA0040010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AA0040010Struct) list.get(i)).getVEND_CD());
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
			l_ITEM_CD.add(((AA0040010Struct) list.get(i)).getITEM_CD());
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
			l_EFF_PHASE_IN_DATE.add(((AA0040010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_PUCH_SIZE.add(((AA0040010Struct) list.get(i)).getPUCH_SIZE());
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
			l_UNIT_COST.add(((AA0040010Struct) list.get(i)).getUNIT_COST());
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
			l_UNIT_COST_TYP.add(((AA0040010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_PROCESSING_COST.add(((AA0040010Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AA0040010Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AA0040010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_PUCH_PRIORITY_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_PRIORITY_REF_NO == null) {
			l_PUCH_PRIORITY_REF_NO = new ArrayList();
		} else {
			l_PUCH_PRIORITY_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_PRIORITY_REF_NO.add(((AA0040010Struct) list.get(i)).getPUCH_PRIORITY_REF_NO());
		}
		return size;
	}
	public int setL2L_VEND_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ITEM_CD == null) {
			l_VEND_ITEM_CD = new ArrayList();
		} else {
			l_VEND_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ITEM_CD.add(((AA0040010Struct) list.get(i)).getVEND_ITEM_CD());
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
			l_ITEM_NAME.add(((AA0040010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0040010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0040010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP == null) {
			l_w_OUTSIDE_TYP = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP.add(((AA0040010Struct) list.get(i)).getw_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP == null) {
			l_w_MRP_ODR_TYP = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP.add(((AA0040010Struct) list.get(i)).getw_MRP_ODR_TYP());
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
			l_STOCK_UNIT.add(((AA0040010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ANAME == null) {
			l_VEND_ANAME = new ArrayList();
		} else {
			l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ANAME.add(((AA0040010Struct) list.get(i)).getVEND_ANAME());
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
			l_CUR_CD.add(((AA0040010Struct) list.get(i)).getCUR_CD());
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
			l_ROUND_TYP.add(((AA0040010Struct) list.get(i)).getROUND_TYP());
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
			l_CUR_NAME.add(((AA0040010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AA0040010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AA0040010Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT_H(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT_H == null) {
			l_w_MODIFY_COUNT_H = new ArrayList();
		} else {
			l_w_MODIFY_COUNT_H.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT_H.add(((AA0040010Struct) list.get(i)).getw_MODIFY_COUNT_H());
		}
		return size;
	}
	public int setL2L_p_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_PLANT_CD == null) {
			l_p_PLANT_CD = new ArrayList();
		} else {
			l_p_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_PLANT_CD.add(((AA0040010Struct) list.get(i)).getp_PLANT_CD());
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
			l_USER_CD.add(((AA0040010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}
	public int setL2L_p_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_BUSINESS_DATE == null) {
			l_p_BUSINESS_DATE = new ArrayList();
		} else {
			l_p_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_BUSINESS_DATE.add(((AA0040010Struct) list.get(i)).getp_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_p_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_VALUE == null) {
			l_p_VALUE = new ArrayList();
		} else {
			l_p_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_VALUE.add(((AA0040010Struct) list.get(i)).getp_VALUE());
		}
		return size;
	}
	public int setL2L_p_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_NAME == null) {
			l_p_NAME = new ArrayList();
		} else {
			l_p_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_NAME.add(((AA0040010Struct) list.get(i)).getp_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_MRP_ODR_NAME = null;
		m_w_OUTSIDE_NAME = null;
		m_UNIT_COST_NAME = null;
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_p_APPR_REMARKS = null;
		m_h_APR_PUCH_UNIT_COST = null;
		m_h_PUCH_PRIORITY_REF_NO_1 = null;
		m_h_VEND_ITEM_CD_1 = null;
		m_w_PLANT_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_ITEM_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_PUCH_SIZE = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_PRIORITY_REF_NO = null;
		m_VEND_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_w_OUTSIDE_TYP = null;
		m_w_MRP_ODR_TYP = null;
		m_STOCK_UNIT = null;
		m_VEND_ANAME = null;
		m_CUR_CD = null;
		m_ROUND_TYP = null;
		m_CUR_NAME = null;
		m_DECIMAL_FIG = null;
		m_w_MODIFY_COUNT = null;
		m_w_MODIFY_COUNT_H = null;
		m_p_PLANT_CD = null;
		m_USER_CD = null;
		m_p_BUSINESS_DATE = null;
		m_p_VALUE = null;
		m_p_NAME = null;

		l_w_MRP_ODR_NAME = null;
		l_w_OUTSIDE_NAME = null;
		l_UNIT_COST_NAME = null;
		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_p_APPR_REMARKS = null;
		l_h_APR_PUCH_UNIT_COST = null;
		l_h_PUCH_PRIORITY_REF_NO_1 = null;
		l_h_VEND_ITEM_CD_1 = null;
		l_w_PLANT_CD = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_ITEM_CD = null;
		l_EFF_PHASE_IN_DATE = null;
		l_PUCH_SIZE = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_PRIORITY_REF_NO = null;
		l_VEND_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_w_OUTSIDE_TYP = null;
		l_w_MRP_ODR_TYP = null;
		l_STOCK_UNIT = null;
		l_VEND_ANAME = null;
		l_CUR_CD = null;
		l_ROUND_TYP = null;
		l_CUR_NAME = null;
		l_DECIMAL_FIG = null;
		l_w_MODIFY_COUNT = null;
		l_w_MODIFY_COUNT_H = null;
		l_p_PLANT_CD = null;
		l_USER_CD = null;
		l_p_BUSINESS_DATE = null;
		l_p_VALUE = null;
		l_p_NAME = null;

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
	 * medAA0040010クラスの標準コンストラクタ
	 */
	public AA0040010Struct()
	{
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                initialize();
                //------------------------------------------------------------------
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
	public void setStruct(AA0040010Struct struct)
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
	public void setStructM(AA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_MRP_ODR_NAME(struct.getw_MRP_ODR_NAME());
			this.setw_OUTSIDE_NAME(struct.getw_OUTSIDE_NAME());
			this.setUNIT_COST_NAME(struct.getUNIT_COST_NAME());
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.setp_APPR_REMARKS(struct.getp_APPR_REMARKS());
			this.seth_APR_PUCH_UNIT_COST(struct.geth_APR_PUCH_UNIT_COST());
			this.seth_PUCH_PRIORITY_REF_NO_1(struct.geth_PUCH_PRIORITY_REF_NO_1());
			this.seth_VEND_ITEM_CD_1(struct.geth_VEND_ITEM_CD_1());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setPUCH_SIZE(struct.getPUCH_SIZE());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_PRIORITY_REF_NO(struct.getPUCH_PRIORITY_REF_NO());
			this.setVEND_ITEM_CD(struct.getVEND_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setw_OUTSIDE_TYP(struct.getw_OUTSIDE_TYP());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setw_MODIFY_COUNT_H(struct.getw_MODIFY_COUNT_H());
			this.setp_PLANT_CD(struct.getp_PLANT_CD());
			this.setUSER_CD(struct.getUSER_CD());
			this.setp_BUSINESS_DATE(struct.getp_BUSINESS_DATE());
			this.setp_VALUE(struct.getp_VALUE());
			this.setp_NAME(struct.getp_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_MRP_ODR_NAME(struct.getList_w_MRP_ODR_NAME());
			this.setList_w_OUTSIDE_NAME(struct.getList_w_OUTSIDE_NAME());
			this.setList_UNIT_COST_NAME(struct.getList_UNIT_COST_NAME());
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_p_APPR_REMARKS(struct.getList_p_APPR_REMARKS());
			this.setList_h_APR_PUCH_UNIT_COST(struct.getList_h_APR_PUCH_UNIT_COST());
			this.setList_h_PUCH_PRIORITY_REF_NO_1(struct.getList_h_PUCH_PRIORITY_REF_NO_1());
			this.setList_h_VEND_ITEM_CD_1(struct.getList_h_VEND_ITEM_CD_1());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_PUCH_SIZE(struct.getList_PUCH_SIZE());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_PRIORITY_REF_NO(struct.getList_PUCH_PRIORITY_REF_NO());
			this.setList_VEND_ITEM_CD(struct.getList_VEND_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_w_OUTSIDE_TYP(struct.getList_w_OUTSIDE_TYP());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_w_MODIFY_COUNT_H(struct.getList_w_MODIFY_COUNT_H());
			this.setList_p_PLANT_CD(struct.getList_p_PLANT_CD());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_p_BUSINESS_DATE(struct.getList_p_BUSINESS_DATE());
			this.setList_p_VALUE(struct.getList_p_VALUE());
			this.setList_p_NAME(struct.getList_p_NAME());
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
	// 第 1 変数初期値： i_w_MRP_ODR_NAME


	final static String i_w_MRP_ODR_NAME = null;

	// 第 2 変数初期値： i_w_OUTSIDE_NAME


	final static String i_w_OUTSIDE_NAME = null;

	// 第 3 変数初期値： i_UNIT_COST_NAME


	final static String i_UNIT_COST_NAME = null;

	// 第 4 変数初期値： i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// 第 5 変数初期値： i_UNIT_COST_TYP_val


	final static Integer i_UNIT_COST_TYP_val = null;

	// 第 6 変数初期値： i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// 第 7 変数初期値： i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// 第 8 変数初期値： i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// 第 9 変数初期値： i_p_APPR_REMARKS


	final static String i_p_APPR_REMARKS = null;

	// 第 10 変数初期値： i_h_APR_PUCH_UNIT_COST


	final static String i_h_APR_PUCH_UNIT_COST = null;

	// 第 11 変数初期値： i_h_PUCH_PRIORITY_REF_NO_1


	final static String i_h_PUCH_PRIORITY_REF_NO_1 = null;

	// 第 12 変数初期値： i_h_VEND_ITEM_CD_1


	final static String i_h_VEND_ITEM_CD_1 = null;

	// 第 13 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 14 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 15 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 16 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 17 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 18 変数初期値： i_PUCH_SIZE


	final static String i_PUCH_SIZE = null;

	// 第 19 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 20 変数初期値： i_UNIT_COST_TYP


	final static Integer i_UNIT_COST_TYP = null;

	// 第 21 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 22 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 23 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 24 変数初期値： i_PUCH_PRIORITY_REF_NO


	final static String i_PUCH_PRIORITY_REF_NO = null;

	// 第 25 変数初期値： i_VEND_ITEM_CD


	final static String i_VEND_ITEM_CD = null;

	// 第 26 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 27 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 28 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 29 変数初期値： i_w_OUTSIDE_TYP


	final static String i_w_OUTSIDE_TYP = null;

	// 第 30 変数初期値： i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// 第 31 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 32 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 33 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 34 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 35 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 36 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 37 変数初期値： i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// 第 38 変数初期値： i_w_MODIFY_COUNT_H


	final static String i_w_MODIFY_COUNT_H = null;

	// 第 39 変数初期値： i_p_PLANT_CD


	final static String i_p_PLANT_CD = null;

	// 第 40 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 41 変数初期値： i_p_BUSINESS_DATE


	final static String i_p_BUSINESS_DATE = null;

	// 第 42 変数初期値： i_p_VALUE


	final static String i_p_VALUE = null;

	// 第 43 変数初期値： i_p_NAME


	final static String i_p_NAME = null;

*/

	//{{user_implement_code

	/**
	 * 初期化
	 */
	public void initialize()
	{
		m_PUCH_PRIORITY_REF_NO = new String("1");
		m_VEND_ITEM_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_ITEM_CD = null;
		m_VEND_CD = null;
		m_COMPANY_CD = null;
		m_w_PLANT_CD = null;
		m_ITEM_NAME = null;
		m_VEND_ANAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_w_OUTSIDE_TYP = null;
		m_w_MRP_ODR_TYP = null;
		m_UNIT_COST_TYP_val = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST_TYP_name = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;

		l_PUCH_PRIORITY_REF_NO = new ArrayList(0);
		l_VEND_ITEM_CD = new ArrayList(0);
		l_EFF_PHASE_IN_DATE = new ArrayList(0);
		l_UNIT_COST = new ArrayList(0);
		l_UNIT_COST_TYP = new ArrayList(0);
		l_PROCESSING_COST = new ArrayList(0);
		l_MATERIAL_COST = new ArrayList(0);
		l_OTHER_OVERHEADS = new ArrayList(0);
		l_ITEM_CD = new ArrayList(0);
		l_VEND_CD = new ArrayList(0);
		l_COMPANY_CD = new ArrayList(0);
		l_w_PLANT_CD = new ArrayList(0);
		l_ITEM_NAME = new ArrayList(0);
		l_VEND_ANAME = new ArrayList(0);
		l_DRAW_CD = new ArrayList(0);
		l_SPEC = new ArrayList(0);
		l_w_OUTSIDE_TYP = new ArrayList(0);
		l_w_MRP_ODR_TYP = new ArrayList(0);
		l_UNIT_COST_TYP = new ArrayList(0);
		l_UNIT_COST_TYP_name = new ArrayList(0);
	}

	/**
	 * サブフォーム用データコピー
	 */

	public void copy(AA0040010Struct struct){

		if(struct.m_COMPANY_CD != null){ 
			m_COMPANY_CD = new String(struct.m_COMPANY_CD);
		}

		if(struct.m_w_PLANT_CD != null){ 
			m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		}

		if(struct.m_ITEM_CD != null){ 
			m_ITEM_CD = new String(struct.m_ITEM_CD);
		}

		if(struct.m_ITEM_NAME != null){ 
			m_ITEM_NAME = new String(struct.m_ITEM_NAME);
		}

		if(struct.m_VEND_CD != null){ 
			m_VEND_CD = new String(struct.m_VEND_CD);
		}

		if(struct.m_VEND_ANAME != null){ 
			m_VEND_ANAME = new String(struct.m_VEND_ANAME);
		}

		if(struct.m_VEND_ITEM_CD != null){ 
			m_VEND_ITEM_CD = new String(struct.m_VEND_ITEM_CD);
		}
		
		if(struct.m_PUCH_PRIORITY_REF_NO != null){ 
			m_PUCH_PRIORITY_REF_NO = new String(struct.m_PUCH_PRIORITY_REF_NO);
		}
		if(struct.m_UNIT_COST_TYP != null){ 
			m_UNIT_COST_TYP = new Integer(struct.m_UNIT_COST_TYP.intValue());
		}
		
		if(struct.m_PUCH_SIZE != null){
        	m_PUCH_SIZE = new String(struct.m_PUCH_SIZE);
        }else{
        	m_PUCH_SIZE = null;
        }

		if(struct.m_PROCESSING_COST != null){ 
			m_PROCESSING_COST = new String(struct.m_PROCESSING_COST);
		}

		if(struct.m_MATERIAL_COST != null){ 
			m_MATERIAL_COST = new String(struct.m_MATERIAL_COST);
		}

		if(struct.m_OTHER_OVERHEADS != null){ 
			m_OTHER_OVERHEADS = new String(struct.m_OTHER_OVERHEADS);
		}

		if(struct.m_DRAW_CD != null){ 
			m_DRAW_CD = new String(struct.m_DRAW_CD);
		}

		if(struct.m_SPEC != null){ 
			m_SPEC = new String(struct.m_SPEC);
		}

		if(struct.m_w_MRP_ODR_TYP != null){
			m_w_MRP_ODR_TYP = new String(struct.m_w_MRP_ODR_TYP);
		}

		if(struct.m_w_OUTSIDE_TYP != null){
			m_w_OUTSIDE_TYP = new String(struct.m_w_OUTSIDE_TYP);
		}

		if(struct.m_w_MODIFY_COUNT != null){ 
			m_w_MODIFY_COUNT = new String(struct.m_w_MODIFY_COUNT);
		}

		if(struct.m_w_MODIFY_COUNT_H != null){ 
			m_w_MODIFY_COUNT_H = new String(struct.m_w_MODIFY_COUNT_H);
		}

		//サブ画面用
		if(struct.m_EFF_PHASE_IN_DATE != null){ 
			m_EFF_PHASE_IN_DATE = new String(struct.m_EFF_PHASE_IN_DATE);
		}

		if(struct.m_UNIT_COST != null){ 
			m_UNIT_COST = new String(struct.m_UNIT_COST);
		}

		if(struct.m_CUR_CD != null){ 
			m_CUR_CD = new String(struct.m_CUR_CD);
		}
		
		if(struct.m_CUR_NAME != null){ 
			m_CUR_NAME = new String(struct.m_CUR_NAME);
		}
		
		if(struct.m_h_APR_PUCH_UNIT_COST != null){
			m_h_APR_PUCH_UNIT_COST = new String(struct.m_h_APR_PUCH_UNIT_COST);
		}
		
	}
	public void keycopy(AA0040010Struct struct){

		if(struct.m_COMPANY_CD != null){ 
			m_COMPANY_CD = new String(struct.m_COMPANY_CD);
		}else{
			m_COMPANY_CD = null;
		}
		
		if(struct.m_w_PLANT_CD != null){ 
			m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		}else{
			m_w_PLANT_CD = null;
		}
		
		if(struct.m_ITEM_CD != null){ 
			m_ITEM_CD = new String(struct.m_ITEM_CD);
		}else{
			m_ITEM_CD = null;
		}

		if(struct.m_VEND_CD != null){ 
			m_VEND_CD = new String(struct.m_VEND_CD);
		}else{
			m_VEND_CD = null;
		}

		if(struct.m_ITEM_NAME != null){ 
			m_ITEM_NAME = new String(struct.m_ITEM_NAME);
		}else{
			m_ITEM_NAME = null;
		}

		if(struct.m_VEND_ANAME != null){ 
			m_VEND_ANAME = new String(struct.m_VEND_ANAME);
		}else{
			m_VEND_ANAME = null;
		}

		if(struct.m_PUCH_PRIORITY_REF_NO != null){ 
			m_PUCH_PRIORITY_REF_NO = new String(struct.m_PUCH_PRIORITY_REF_NO);
		}else{
			m_PUCH_PRIORITY_REF_NO = null;
		}

		if(struct.m_VEND_ITEM_CD != null){ 
			m_VEND_ITEM_CD = new String(struct.m_VEND_ITEM_CD);
		}else{
			m_VEND_ITEM_CD = null;
		}

		if(struct.m_DRAW_CD != null){ 
			m_DRAW_CD = new String(struct.m_DRAW_CD);
		}else{
			m_DRAW_CD = null;
		}

		if(struct.m_SPEC != null){ 
			m_SPEC = new String(struct.m_SPEC);
		}else{
			m_SPEC = null;
		}

		if(struct.m_w_MRP_ODR_TYP != null){
			m_w_MRP_ODR_TYP = new String(struct.m_w_MRP_ODR_TYP);
		}else{
			m_w_MRP_ODR_TYP = null;
		}

		if(struct.m_w_OUTSIDE_TYP != null){
			m_w_OUTSIDE_TYP = new String(struct.m_w_OUTSIDE_TYP);
		}else{
			m_w_OUTSIDE_TYP = null;
		}

		if(struct.m_CUR_CD != null){
			m_CUR_CD = new String(struct.m_CUR_CD);
		}else{
			m_CUR_CD = null;
		}

		if(struct.m_CUR_NAME != null){
			m_CUR_NAME = new String(struct.m_CUR_NAME);
		}else{
			m_CUR_NAME = null;
		}

		if(struct.m_w_MODIFY_COUNT_H != null){
			m_w_MODIFY_COUNT_H = new String(struct.m_w_MODIFY_COUNT_H);
		}else{
			m_w_MODIFY_COUNT_H = null;
		}
		if(struct.m_h_APR_PUCH_UNIT_COST!= null){
			m_h_APR_PUCH_UNIT_COST = new String(struct.m_h_APR_PUCH_UNIT_COST);
		}else{
			m_h_APR_PUCH_UNIT_COST = null;
		}
		if(struct.m_h_APPR_ID != null){
       	 	m_h_APPR_ID = new String(struct.m_h_APPR_ID);
        }else{
        	m_h_APPR_ID = null;
        }
		
        if(struct.m_h_SCREENMOVE_TYP != null){
        	m_h_SCREENMOVE_TYP = new String(struct.m_h_SCREENMOVE_TYP);
        }else{
        	m_h_SCREENMOVE_TYP = null;
        }
        
        if(struct.m_EFF_PHASE_IN_DATE != null){
        	m_EFF_PHASE_IN_DATE = new String(struct.m_EFF_PHASE_IN_DATE);
        }else{
        	m_EFF_PHASE_IN_DATE = null;
        }
        
        if(struct.m_PUCH_SIZE != null){
        	m_PUCH_SIZE = new String(struct.m_PUCH_SIZE);
        }else{
        	m_PUCH_SIZE = null;
        }
        
	}

        //}}user_implement_code

	//////////////////////////////

}
