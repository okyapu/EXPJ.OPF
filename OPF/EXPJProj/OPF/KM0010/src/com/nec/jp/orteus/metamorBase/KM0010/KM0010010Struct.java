/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0010/src/com/nec/jp/orteus/metamorBase/KM0010/KM0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0010;

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
 * CLASS     : KM0010010Control クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 02:13:31 $
 *
 */
//}}user_implement_code_header

public class KM0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_PROJECT_CD */
	public String m_h_PROJECT_CD = null;
	/** 第 2 変数： m_PROJECT_STAT_name */
	public String m_PROJECT_STAT_name = null;
	/** 第 3 変数： m_PROJECT_STAT_val */
	public String m_PROJECT_STAT_val = null;
	/** 第 4 変数： m_COMPLETE_STAT */
	public String m_COMPLETE_STAT = null;
	/** 第 5 変数： m_ACCURACY_LEVEL_name */
	public String m_ACCURACY_LEVEL_name = null;
	/** 第 6 変数： m_ACCURACY_LEVEL_val */
	public String m_ACCURACY_LEVEL_val = null;
	/** 第 7 変数： m_OD_COMP_FLG */
	public String m_OD_COMP_FLG = null;
	/** 第 8 変数： m_PJ_CLASS_01_TYP */
	public String m_PJ_CLASS_01_TYP = null;
	/** 第 9 変数： m_PJ_CLASS_01_NAME */
	public String m_PJ_CLASS_01_NAME = null;
	/** 第 10 変数： m_PJ_CLASS_02_TYP */
	public String m_PJ_CLASS_02_TYP = null;
	/** 第 11 変数： m_PJ_CLASS_02_NAME */
	public String m_PJ_CLASS_02_NAME = null;
	/** 第 12 変数： m_PJ_CLASS_03_TYP */
	public String m_PJ_CLASS_03_TYP = null;
	/** 第 13 変数： m_PJ_CLASS_03_NAME */
	public String m_PJ_CLASS_03_NAME = null;
	/** 第 14 変数： m_PJ_CLASS_04_TYP */
	public String m_PJ_CLASS_04_TYP = null;
	/** 第 15 変数： m_PJ_CLASS_04_NAME */
	public String m_PJ_CLASS_04_NAME = null;
	/** 第 16 変数： m_PJ_CLASS_05_TYP */
	public String m_PJ_CLASS_05_TYP = null;
	/** 第 17 変数： m_PJ_CLASS_05_NAME */
	public String m_PJ_CLASS_05_NAME = null;
	/** 第 18 変数： m_PJ_CLASS_06_TYP */
	public String m_PJ_CLASS_06_TYP = null;
	/** 第 19 変数： m_PJ_CLASS_06_NAME */
	public String m_PJ_CLASS_06_NAME = null;
	/** 第 20 変数： m_PJ_CLASS_07_TYP */
	public String m_PJ_CLASS_07_TYP = null;
	/** 第 21 変数： m_PJ_CLASS_07_NAME */
	public String m_PJ_CLASS_07_NAME = null;
	/** 第 22 変数： m_PJ_CLASS_08_TYP */
	public String m_PJ_CLASS_08_TYP = null;
	/** 第 23 変数： m_PJ_CLASS_08_NAME */
	public String m_PJ_CLASS_08_NAME = null;
	/** 第 24 変数： m_PJ_CLASS_09_TYP */
	public String m_PJ_CLASS_09_TYP = null;
	/** 第 25 変数： m_PJ_CLASS_09_NAME */
	public String m_PJ_CLASS_09_NAME = null;
	/** 第 26 変数： m_PJ_CLASS_10_TYP */
	public String m_PJ_CLASS_10_TYP = null;
	/** 第 27 変数： m_PJ_CLASS_10_NAME */
	public String m_PJ_CLASS_10_NAME = null;
	/** 第 28 変数： m_PJ_CLASS_11_TYP */
	public String m_PJ_CLASS_11_TYP = null;
	/** 第 29 変数： m_PJ_CLASS_11_NAME */
	public String m_PJ_CLASS_11_NAME = null;
	/** 第 30 変数： m_PJ_CLASS_12_TYP */
	public String m_PJ_CLASS_12_TYP = null;
	/** 第 31 変数： m_PJ_CLASS_12_NAME */
	public String m_PJ_CLASS_12_NAME = null;
	/** 第 32 変数： m_PROJECT_CD_FLG */
	public String m_PROJECT_CD_FLG = null;
	/** 第 33 変数： m_h_PROJECT_STAT */
	public String m_h_PROJECT_STAT = null;
	/** 第 34 変数： m_h_ESTIMATE */
	public String m_h_ESTIMATE = null;
	/** 第 35 変数： m_h_COMPLETE_STAT */
	public String m_h_COMPLETE_STAT = null;
	/** 第 36 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 37 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 38 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 39 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 40 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 41 変数： m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** 第 42 変数： m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** 第 43 変数： m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** 第 44 変数： m_PROJECT_STAT */
	public String m_PROJECT_STAT = null;
	/** 第 45 変数： m_ACCURACY_LEVEL */
	public String m_ACCURACY_LEVEL = null;
	/** 第 46 変数： m_Vend_Date */
	public String m_Vend_Date = null;
	/** 第 47 変数： m_AssumeDlv_date */
	public String m_AssumeDlv_date = null;
	/** 第 48 変数： m_AssumeAmount */
	public String m_AssumeAmount = null;
	/** 第 49 変数： m_ASSUME_AMOUNT_EXCH_RATES */
	public String m_ASSUME_AMOUNT_EXCH_RATES = null;
	/** 第 50 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 51 変数： m_PJ_ORG_CD */
	public String m_PJ_ORG_CD = null;
	/** 第 52 変数： m_PJ_USER_CD */
	public String m_PJ_USER_CD = null;
	/** 第 53 変数： m_REMARKS1 */
	public String m_REMARKS1 = null;
	/** 第 54 変数： m_REMARKS2 */
	public String m_REMARKS2 = null;
	/** 第 55 変数： m_REMARKS3 */
	public String m_REMARKS3 = null;
	/** 第 56 変数： m_REMARKS4 */
	public String m_REMARKS4 = null;
	/** 第 57 変数： m_REMARKS5 */
	public String m_REMARKS5 = null;
	/** 第 58 変数： m_h_OD_COMP_FLG */
	public String m_h_OD_COMP_FLG = null;
	/** 第 59 変数： m_PJ_CLASS_01_CD */
	public String m_PJ_CLASS_01_CD = null;
	/** 第 60 変数： m_PJ_CLASS_02_CD */
	public String m_PJ_CLASS_02_CD = null;
	/** 第 61 変数： m_PJ_CLASS_03_CD */
	public String m_PJ_CLASS_03_CD = null;
	/** 第 62 変数： m_PJ_CLASS_04_CD */
	public String m_PJ_CLASS_04_CD = null;
	/** 第 63 変数： m_PJ_CLASS_05_CD */
	public String m_PJ_CLASS_05_CD = null;
	/** 第 64 変数： m_PJ_CLASS_06_CD */
	public String m_PJ_CLASS_06_CD = null;
	/** 第 65 変数： m_PJ_CLASS_07_CD */
	public String m_PJ_CLASS_07_CD = null;
	/** 第 66 変数： m_PJ_CLASS_08_CD */
	public String m_PJ_CLASS_08_CD = null;
	/** 第 67 変数： m_PJ_CLASS_09_CD */
	public String m_PJ_CLASS_09_CD = null;
	/** 第 68 変数： m_PJ_CLASS_10_CD */
	public String m_PJ_CLASS_10_CD = null;
	/** 第 69 変数： m_PJ_CLASS_11_CD */
	public String m_PJ_CLASS_11_CD = null;
	/** 第 70 変数： m_PJ_CLASS_12_CD */
	public String m_PJ_CLASS_12_CD = null;
	/** 第 71 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 72 変数： m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** 第 73 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 74 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 75 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 76 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 77 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 78 変数： m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** 第 79 変数： m_DETAL_NO */
	public String m_DETAL_NO = null;
	/** 第 80 変数： m_ODR_CMPLT_FLG */
	public String m_ODR_CMPLT_FLG = null;
	/** 第 81 変数： m_Auto_PROJECT_CD */
	public String m_Auto_PROJECT_CD = null;
	/** 第 82 変数： m_CurUnit */
	public String m_CurUnit = null;
	/** 第 83 変数： m_ESTIMATE_TYPE */
	public String m_ESTIMATE_TYPE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_PROJECT_CD */
	public List l_h_PROJECT_CD = null;

	/** 第 2 List変数： l_PROJECT_STAT_name */
	public List l_PROJECT_STAT_name = null;

	/** 第 3 List変数： l_PROJECT_STAT_val */
	public List l_PROJECT_STAT_val = null;

	/** 第 4 List変数： l_COMPLETE_STAT */
	public List l_COMPLETE_STAT = null;

	/** 第 5 List変数： l_ACCURACY_LEVEL_name */
	public List l_ACCURACY_LEVEL_name = null;

	/** 第 6 List変数： l_ACCURACY_LEVEL_val */
	public List l_ACCURACY_LEVEL_val = null;

	/** 第 7 List変数： l_OD_COMP_FLG */
	public List l_OD_COMP_FLG = null;

	/** 第 8 List変数： l_PJ_CLASS_01_TYP */
	public List l_PJ_CLASS_01_TYP = null;

	/** 第 9 List変数： l_PJ_CLASS_01_NAME */
	public List l_PJ_CLASS_01_NAME = null;

	/** 第 10 List変数： l_PJ_CLASS_02_TYP */
	public List l_PJ_CLASS_02_TYP = null;

	/** 第 11 List変数： l_PJ_CLASS_02_NAME */
	public List l_PJ_CLASS_02_NAME = null;

	/** 第 12 List変数： l_PJ_CLASS_03_TYP */
	public List l_PJ_CLASS_03_TYP = null;

	/** 第 13 List変数： l_PJ_CLASS_03_NAME */
	public List l_PJ_CLASS_03_NAME = null;

	/** 第 14 List変数： l_PJ_CLASS_04_TYP */
	public List l_PJ_CLASS_04_TYP = null;

	/** 第 15 List変数： l_PJ_CLASS_04_NAME */
	public List l_PJ_CLASS_04_NAME = null;

	/** 第 16 List変数： l_PJ_CLASS_05_TYP */
	public List l_PJ_CLASS_05_TYP = null;

	/** 第 17 List変数： l_PJ_CLASS_05_NAME */
	public List l_PJ_CLASS_05_NAME = null;

	/** 第 18 List変数： l_PJ_CLASS_06_TYP */
	public List l_PJ_CLASS_06_TYP = null;

	/** 第 19 List変数： l_PJ_CLASS_06_NAME */
	public List l_PJ_CLASS_06_NAME = null;

	/** 第 20 List変数： l_PJ_CLASS_07_TYP */
	public List l_PJ_CLASS_07_TYP = null;

	/** 第 21 List変数： l_PJ_CLASS_07_NAME */
	public List l_PJ_CLASS_07_NAME = null;

	/** 第 22 List変数： l_PJ_CLASS_08_TYP */
	public List l_PJ_CLASS_08_TYP = null;

	/** 第 23 List変数： l_PJ_CLASS_08_NAME */
	public List l_PJ_CLASS_08_NAME = null;

	/** 第 24 List変数： l_PJ_CLASS_09_TYP */
	public List l_PJ_CLASS_09_TYP = null;

	/** 第 25 List変数： l_PJ_CLASS_09_NAME */
	public List l_PJ_CLASS_09_NAME = null;

	/** 第 26 List変数： l_PJ_CLASS_10_TYP */
	public List l_PJ_CLASS_10_TYP = null;

	/** 第 27 List変数： l_PJ_CLASS_10_NAME */
	public List l_PJ_CLASS_10_NAME = null;

	/** 第 28 List変数： l_PJ_CLASS_11_TYP */
	public List l_PJ_CLASS_11_TYP = null;

	/** 第 29 List変数： l_PJ_CLASS_11_NAME */
	public List l_PJ_CLASS_11_NAME = null;

	/** 第 30 List変数： l_PJ_CLASS_12_TYP */
	public List l_PJ_CLASS_12_TYP = null;

	/** 第 31 List変数： l_PJ_CLASS_12_NAME */
	public List l_PJ_CLASS_12_NAME = null;

	/** 第 32 List変数： l_PROJECT_CD_FLG */
	public List l_PROJECT_CD_FLG = null;

	/** 第 33 List変数： l_h_PROJECT_STAT */
	public List l_h_PROJECT_STAT = null;

	/** 第 34 List変数： l_h_ESTIMATE */
	public List l_h_ESTIMATE = null;

	/** 第 35 List変数： l_h_COMPLETE_STAT */
	public List l_h_COMPLETE_STAT = null;

	/** 第 36 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 37 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 38 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 39 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 40 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 41 List変数： l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** 第 42 List変数： l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** 第 43 List変数： l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** 第 44 List変数： l_PROJECT_STAT */
	public List l_PROJECT_STAT = null;

	/** 第 45 List変数： l_ACCURACY_LEVEL */
	public List l_ACCURACY_LEVEL = null;

	/** 第 46 List変数： l_Vend_Date */
	public List l_Vend_Date = null;

	/** 第 47 List変数： l_AssumeDlv_date */
	public List l_AssumeDlv_date = null;

	/** 第 48 List変数： l_AssumeAmount */
	public List l_AssumeAmount = null;

	/** 第 49 List変数： l_ASSUME_AMOUNT_EXCH_RATES */
	public List l_ASSUME_AMOUNT_EXCH_RATES = null;

	/** 第 50 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 51 List変数： l_PJ_ORG_CD */
	public List l_PJ_ORG_CD = null;

	/** 第 52 List変数： l_PJ_USER_CD */
	public List l_PJ_USER_CD = null;

	/** 第 53 List変数： l_REMARKS1 */
	public List l_REMARKS1 = null;

	/** 第 54 List変数： l_REMARKS2 */
	public List l_REMARKS2 = null;

	/** 第 55 List変数： l_REMARKS3 */
	public List l_REMARKS3 = null;

	/** 第 56 List変数： l_REMARKS4 */
	public List l_REMARKS4 = null;

	/** 第 57 List変数： l_REMARKS5 */
	public List l_REMARKS5 = null;

	/** 第 58 List変数： l_h_OD_COMP_FLG */
	public List l_h_OD_COMP_FLG = null;

	/** 第 59 List変数： l_PJ_CLASS_01_CD */
	public List l_PJ_CLASS_01_CD = null;

	/** 第 60 List変数： l_PJ_CLASS_02_CD */
	public List l_PJ_CLASS_02_CD = null;

	/** 第 61 List変数： l_PJ_CLASS_03_CD */
	public List l_PJ_CLASS_03_CD = null;

	/** 第 62 List変数： l_PJ_CLASS_04_CD */
	public List l_PJ_CLASS_04_CD = null;

	/** 第 63 List変数： l_PJ_CLASS_05_CD */
	public List l_PJ_CLASS_05_CD = null;

	/** 第 64 List変数： l_PJ_CLASS_06_CD */
	public List l_PJ_CLASS_06_CD = null;

	/** 第 65 List変数： l_PJ_CLASS_07_CD */
	public List l_PJ_CLASS_07_CD = null;

	/** 第 66 List変数： l_PJ_CLASS_08_CD */
	public List l_PJ_CLASS_08_CD = null;

	/** 第 67 List変数： l_PJ_CLASS_09_CD */
	public List l_PJ_CLASS_09_CD = null;

	/** 第 68 List変数： l_PJ_CLASS_10_CD */
	public List l_PJ_CLASS_10_CD = null;

	/** 第 69 List変数： l_PJ_CLASS_11_CD */
	public List l_PJ_CLASS_11_CD = null;

	/** 第 70 List変数： l_PJ_CLASS_12_CD */
	public List l_PJ_CLASS_12_CD = null;

	/** 第 71 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 72 List変数： l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** 第 73 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 74 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 75 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 76 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 77 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 78 List変数： l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** 第 79 List変数： l_DETAL_NO */
	public List l_DETAL_NO = null;

	/** 第 80 List変数： l_ODR_CMPLT_FLG */
	public List l_ODR_CMPLT_FLG = null;

	/** 第 81 List変数： l_Auto_PROJECT_CD */
	public List l_Auto_PROJECT_CD = null;

	/** 第 82 List変数： l_CurUnit */
	public List l_CurUnit = null;

	/** 第 83 List変数： l_ESTIMATE_TYPE */
	public List l_ESTIMATE_TYPE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_PROJECT_CD() { return m_h_PROJECT_CD; }
	public String getPROJECT_STAT_name() { return m_PROJECT_STAT_name; }
	public String getPROJECT_STAT_val() { return m_PROJECT_STAT_val; }
	public String getCOMPLETE_STAT() { return m_COMPLETE_STAT; }
	public String getACCURACY_LEVEL_name() { return m_ACCURACY_LEVEL_name; }
	public String getACCURACY_LEVEL_val() { return m_ACCURACY_LEVEL_val; }
	public String getOD_COMP_FLG() { return m_OD_COMP_FLG; }
	public String getPJ_CLASS_01_TYP() { return m_PJ_CLASS_01_TYP; }
	public String getPJ_CLASS_01_NAME() { return m_PJ_CLASS_01_NAME; }
	public String getPJ_CLASS_02_TYP() { return m_PJ_CLASS_02_TYP; }
	public String getPJ_CLASS_02_NAME() { return m_PJ_CLASS_02_NAME; }
	public String getPJ_CLASS_03_TYP() { return m_PJ_CLASS_03_TYP; }
	public String getPJ_CLASS_03_NAME() { return m_PJ_CLASS_03_NAME; }
	public String getPJ_CLASS_04_TYP() { return m_PJ_CLASS_04_TYP; }
	public String getPJ_CLASS_04_NAME() { return m_PJ_CLASS_04_NAME; }
	public String getPJ_CLASS_05_TYP() { return m_PJ_CLASS_05_TYP; }
	public String getPJ_CLASS_05_NAME() { return m_PJ_CLASS_05_NAME; }
	public String getPJ_CLASS_06_TYP() { return m_PJ_CLASS_06_TYP; }
	public String getPJ_CLASS_06_NAME() { return m_PJ_CLASS_06_NAME; }
	public String getPJ_CLASS_07_TYP() { return m_PJ_CLASS_07_TYP; }
	public String getPJ_CLASS_07_NAME() { return m_PJ_CLASS_07_NAME; }
	public String getPJ_CLASS_08_TYP() { return m_PJ_CLASS_08_TYP; }
	public String getPJ_CLASS_08_NAME() { return m_PJ_CLASS_08_NAME; }
	public String getPJ_CLASS_09_TYP() { return m_PJ_CLASS_09_TYP; }
	public String getPJ_CLASS_09_NAME() { return m_PJ_CLASS_09_NAME; }
	public String getPJ_CLASS_10_TYP() { return m_PJ_CLASS_10_TYP; }
	public String getPJ_CLASS_10_NAME() { return m_PJ_CLASS_10_NAME; }
	public String getPJ_CLASS_11_TYP() { return m_PJ_CLASS_11_TYP; }
	public String getPJ_CLASS_11_NAME() { return m_PJ_CLASS_11_NAME; }
	public String getPJ_CLASS_12_TYP() { return m_PJ_CLASS_12_TYP; }
	public String getPJ_CLASS_12_NAME() { return m_PJ_CLASS_12_NAME; }
	public String getPROJECT_CD_FLG() { return m_PROJECT_CD_FLG; }
	public String geth_PROJECT_STAT() { return m_h_PROJECT_STAT; }
	public String geth_ESTIMATE() { return m_h_ESTIMATE; }
	public String geth_COMPLETE_STAT() { return m_h_COMPLETE_STAT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String getPROJECT_STAT() { return m_PROJECT_STAT; }
	public String getACCURACY_LEVEL() { return m_ACCURACY_LEVEL; }
	public String getVend_Date() { return m_Vend_Date; }
	public String getAssumeDlv_date() { return m_AssumeDlv_date; }
	public String getAssumeAmount() { return m_AssumeAmount; }
	public String getASSUME_AMOUNT_EXCH_RATES() { return m_ASSUME_AMOUNT_EXCH_RATES; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getPJ_ORG_CD() { return m_PJ_ORG_CD; }
	public String getPJ_USER_CD() { return m_PJ_USER_CD; }
	public String getREMARKS1() { return m_REMARKS1; }
	public String getREMARKS2() { return m_REMARKS2; }
	public String getREMARKS3() { return m_REMARKS3; }
	public String getREMARKS4() { return m_REMARKS4; }
	public String getREMARKS5() { return m_REMARKS5; }
	public String geth_OD_COMP_FLG() { return m_h_OD_COMP_FLG; }
	public String getPJ_CLASS_01_CD() { return m_PJ_CLASS_01_CD; }
	public String getPJ_CLASS_02_CD() { return m_PJ_CLASS_02_CD; }
	public String getPJ_CLASS_03_CD() { return m_PJ_CLASS_03_CD; }
	public String getPJ_CLASS_04_CD() { return m_PJ_CLASS_04_CD; }
	public String getPJ_CLASS_05_CD() { return m_PJ_CLASS_05_CD; }
	public String getPJ_CLASS_06_CD() { return m_PJ_CLASS_06_CD; }
	public String getPJ_CLASS_07_CD() { return m_PJ_CLASS_07_CD; }
	public String getPJ_CLASS_08_CD() { return m_PJ_CLASS_08_CD; }
	public String getPJ_CLASS_09_CD() { return m_PJ_CLASS_09_CD; }
	public String getPJ_CLASS_10_CD() { return m_PJ_CLASS_10_CD; }
	public String getPJ_CLASS_11_CD() { return m_PJ_CLASS_11_CD; }
	public String getPJ_CLASS_12_CD() { return m_PJ_CLASS_12_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getDETAL_NO() { return m_DETAL_NO; }
	public String getODR_CMPLT_FLG() { return m_ODR_CMPLT_FLG; }
	public String getAuto_PROJECT_CD() { return m_Auto_PROJECT_CD; }
	public String getCurUnit() { return m_CurUnit; }
	public String getESTIMATE_TYPE() { return m_ESTIMATE_TYPE; }

	public List getList_h_PROJECT_CD() { return l_h_PROJECT_CD; }
	public List getList_PROJECT_STAT_name() { return l_PROJECT_STAT_name; }
	public List getList_PROJECT_STAT_val() { return l_PROJECT_STAT_val; }
	public List getList_COMPLETE_STAT() { return l_COMPLETE_STAT; }
	public List getList_ACCURACY_LEVEL_name() { return l_ACCURACY_LEVEL_name; }
	public List getList_ACCURACY_LEVEL_val() { return l_ACCURACY_LEVEL_val; }
	public List getList_OD_COMP_FLG() { return l_OD_COMP_FLG; }
	public List getList_PJ_CLASS_01_TYP() { return l_PJ_CLASS_01_TYP; }
	public List getList_PJ_CLASS_01_NAME() { return l_PJ_CLASS_01_NAME; }
	public List getList_PJ_CLASS_02_TYP() { return l_PJ_CLASS_02_TYP; }
	public List getList_PJ_CLASS_02_NAME() { return l_PJ_CLASS_02_NAME; }
	public List getList_PJ_CLASS_03_TYP() { return l_PJ_CLASS_03_TYP; }
	public List getList_PJ_CLASS_03_NAME() { return l_PJ_CLASS_03_NAME; }
	public List getList_PJ_CLASS_04_TYP() { return l_PJ_CLASS_04_TYP; }
	public List getList_PJ_CLASS_04_NAME() { return l_PJ_CLASS_04_NAME; }
	public List getList_PJ_CLASS_05_TYP() { return l_PJ_CLASS_05_TYP; }
	public List getList_PJ_CLASS_05_NAME() { return l_PJ_CLASS_05_NAME; }
	public List getList_PJ_CLASS_06_TYP() { return l_PJ_CLASS_06_TYP; }
	public List getList_PJ_CLASS_06_NAME() { return l_PJ_CLASS_06_NAME; }
	public List getList_PJ_CLASS_07_TYP() { return l_PJ_CLASS_07_TYP; }
	public List getList_PJ_CLASS_07_NAME() { return l_PJ_CLASS_07_NAME; }
	public List getList_PJ_CLASS_08_TYP() { return l_PJ_CLASS_08_TYP; }
	public List getList_PJ_CLASS_08_NAME() { return l_PJ_CLASS_08_NAME; }
	public List getList_PJ_CLASS_09_TYP() { return l_PJ_CLASS_09_TYP; }
	public List getList_PJ_CLASS_09_NAME() { return l_PJ_CLASS_09_NAME; }
	public List getList_PJ_CLASS_10_TYP() { return l_PJ_CLASS_10_TYP; }
	public List getList_PJ_CLASS_10_NAME() { return l_PJ_CLASS_10_NAME; }
	public List getList_PJ_CLASS_11_TYP() { return l_PJ_CLASS_11_TYP; }
	public List getList_PJ_CLASS_11_NAME() { return l_PJ_CLASS_11_NAME; }
	public List getList_PJ_CLASS_12_TYP() { return l_PJ_CLASS_12_TYP; }
	public List getList_PJ_CLASS_12_NAME() { return l_PJ_CLASS_12_NAME; }
	public List getList_PROJECT_CD_FLG() { return l_PROJECT_CD_FLG; }
	public List getList_h_PROJECT_STAT() { return l_h_PROJECT_STAT; }
	public List getList_h_ESTIMATE() { return l_h_ESTIMATE; }
	public List getList_h_COMPLETE_STAT() { return l_h_COMPLETE_STAT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_PROJECT_STAT() { return l_PROJECT_STAT; }
	public List getList_ACCURACY_LEVEL() { return l_ACCURACY_LEVEL; }
	public List getList_Vend_Date() { return l_Vend_Date; }
	public List getList_AssumeDlv_date() { return l_AssumeDlv_date; }
	public List getList_AssumeAmount() { return l_AssumeAmount; }
	public List getList_ASSUME_AMOUNT_EXCH_RATES() { return l_ASSUME_AMOUNT_EXCH_RATES; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_PJ_ORG_CD() { return l_PJ_ORG_CD; }
	public List getList_PJ_USER_CD() { return l_PJ_USER_CD; }
	public List getList_REMARKS1() { return l_REMARKS1; }
	public List getList_REMARKS2() { return l_REMARKS2; }
	public List getList_REMARKS3() { return l_REMARKS3; }
	public List getList_REMARKS4() { return l_REMARKS4; }
	public List getList_REMARKS5() { return l_REMARKS5; }
	public List getList_h_OD_COMP_FLG() { return l_h_OD_COMP_FLG; }
	public List getList_PJ_CLASS_01_CD() { return l_PJ_CLASS_01_CD; }
	public List getList_PJ_CLASS_02_CD() { return l_PJ_CLASS_02_CD; }
	public List getList_PJ_CLASS_03_CD() { return l_PJ_CLASS_03_CD; }
	public List getList_PJ_CLASS_04_CD() { return l_PJ_CLASS_04_CD; }
	public List getList_PJ_CLASS_05_CD() { return l_PJ_CLASS_05_CD; }
	public List getList_PJ_CLASS_06_CD() { return l_PJ_CLASS_06_CD; }
	public List getList_PJ_CLASS_07_CD() { return l_PJ_CLASS_07_CD; }
	public List getList_PJ_CLASS_08_CD() { return l_PJ_CLASS_08_CD; }
	public List getList_PJ_CLASS_09_CD() { return l_PJ_CLASS_09_CD; }
	public List getList_PJ_CLASS_10_CD() { return l_PJ_CLASS_10_CD; }
	public List getList_PJ_CLASS_11_CD() { return l_PJ_CLASS_11_CD; }
	public List getList_PJ_CLASS_12_CD() { return l_PJ_CLASS_12_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_DETAL_NO() { return l_DETAL_NO; }
	public List getList_ODR_CMPLT_FLG() { return l_ODR_CMPLT_FLG; }
	public List getList_Auto_PROJECT_CD() { return l_Auto_PROJECT_CD; }
	public List getList_CurUnit() { return l_CurUnit; }
	public List getList_ESTIMATE_TYPE() { return l_ESTIMATE_TYPE; }

	public void seth_PROJECT_CD(String val) { m_h_PROJECT_CD = val; }
	public void setPROJECT_STAT_name(String val) { m_PROJECT_STAT_name = val; }
	public void setPROJECT_STAT_val(String val) { m_PROJECT_STAT_val = val; }
	public void setCOMPLETE_STAT(String val) { m_COMPLETE_STAT = val; }
	public void setACCURACY_LEVEL_name(String val) { m_ACCURACY_LEVEL_name = val; }
	public void setACCURACY_LEVEL_val(String val) { m_ACCURACY_LEVEL_val = val; }
	public void setOD_COMP_FLG(String val) { m_OD_COMP_FLG = val; }
	public void setPJ_CLASS_01_TYP(String val) { m_PJ_CLASS_01_TYP = val; }
	public void setPJ_CLASS_01_NAME(String val) { m_PJ_CLASS_01_NAME = val; }
	public void setPJ_CLASS_02_TYP(String val) { m_PJ_CLASS_02_TYP = val; }
	public void setPJ_CLASS_02_NAME(String val) { m_PJ_CLASS_02_NAME = val; }
	public void setPJ_CLASS_03_TYP(String val) { m_PJ_CLASS_03_TYP = val; }
	public void setPJ_CLASS_03_NAME(String val) { m_PJ_CLASS_03_NAME = val; }
	public void setPJ_CLASS_04_TYP(String val) { m_PJ_CLASS_04_TYP = val; }
	public void setPJ_CLASS_04_NAME(String val) { m_PJ_CLASS_04_NAME = val; }
	public void setPJ_CLASS_05_TYP(String val) { m_PJ_CLASS_05_TYP = val; }
	public void setPJ_CLASS_05_NAME(String val) { m_PJ_CLASS_05_NAME = val; }
	public void setPJ_CLASS_06_TYP(String val) { m_PJ_CLASS_06_TYP = val; }
	public void setPJ_CLASS_06_NAME(String val) { m_PJ_CLASS_06_NAME = val; }
	public void setPJ_CLASS_07_TYP(String val) { m_PJ_CLASS_07_TYP = val; }
	public void setPJ_CLASS_07_NAME(String val) { m_PJ_CLASS_07_NAME = val; }
	public void setPJ_CLASS_08_TYP(String val) { m_PJ_CLASS_08_TYP = val; }
	public void setPJ_CLASS_08_NAME(String val) { m_PJ_CLASS_08_NAME = val; }
	public void setPJ_CLASS_09_TYP(String val) { m_PJ_CLASS_09_TYP = val; }
	public void setPJ_CLASS_09_NAME(String val) { m_PJ_CLASS_09_NAME = val; }
	public void setPJ_CLASS_10_TYP(String val) { m_PJ_CLASS_10_TYP = val; }
	public void setPJ_CLASS_10_NAME(String val) { m_PJ_CLASS_10_NAME = val; }
	public void setPJ_CLASS_11_TYP(String val) { m_PJ_CLASS_11_TYP = val; }
	public void setPJ_CLASS_11_NAME(String val) { m_PJ_CLASS_11_NAME = val; }
	public void setPJ_CLASS_12_TYP(String val) { m_PJ_CLASS_12_TYP = val; }
	public void setPJ_CLASS_12_NAME(String val) { m_PJ_CLASS_12_NAME = val; }
	public void setPROJECT_CD_FLG(String val) { m_PROJECT_CD_FLG = val; }
	public void seth_PROJECT_STAT(String val) { m_h_PROJECT_STAT = val; }
	public void seth_ESTIMATE(String val) { m_h_ESTIMATE = val; }
	public void seth_COMPLETE_STAT(String val) { m_h_COMPLETE_STAT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void setPROJECT_STAT(String val) { m_PROJECT_STAT = val; }
	public void setACCURACY_LEVEL(String val) { m_ACCURACY_LEVEL = val; }
	public void setVend_Date(String val) { m_Vend_Date = val; }
	public void setAssumeDlv_date(String val) { m_AssumeDlv_date = val; }
	public void setAssumeAmount(String val) { m_AssumeAmount = val; }
	public void setASSUME_AMOUNT_EXCH_RATES(String val) { m_ASSUME_AMOUNT_EXCH_RATES = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setPJ_ORG_CD(String val) { m_PJ_ORG_CD = val; }
	public void setPJ_USER_CD(String val) { m_PJ_USER_CD = val; }
	public void setREMARKS1(String val) { m_REMARKS1 = val; }
	public void setREMARKS2(String val) { m_REMARKS2 = val; }
	public void setREMARKS3(String val) { m_REMARKS3 = val; }
	public void setREMARKS4(String val) { m_REMARKS4 = val; }
	public void setREMARKS5(String val) { m_REMARKS5 = val; }
	public void seth_OD_COMP_FLG(String val) { m_h_OD_COMP_FLG = val; }
	public void setPJ_CLASS_01_CD(String val) { m_PJ_CLASS_01_CD = val; }
	public void setPJ_CLASS_02_CD(String val) { m_PJ_CLASS_02_CD = val; }
	public void setPJ_CLASS_03_CD(String val) { m_PJ_CLASS_03_CD = val; }
	public void setPJ_CLASS_04_CD(String val) { m_PJ_CLASS_04_CD = val; }
	public void setPJ_CLASS_05_CD(String val) { m_PJ_CLASS_05_CD = val; }
	public void setPJ_CLASS_06_CD(String val) { m_PJ_CLASS_06_CD = val; }
	public void setPJ_CLASS_07_CD(String val) { m_PJ_CLASS_07_CD = val; }
	public void setPJ_CLASS_08_CD(String val) { m_PJ_CLASS_08_CD = val; }
	public void setPJ_CLASS_09_CD(String val) { m_PJ_CLASS_09_CD = val; }
	public void setPJ_CLASS_10_CD(String val) { m_PJ_CLASS_10_CD = val; }
	public void setPJ_CLASS_11_CD(String val) { m_PJ_CLASS_11_CD = val; }
	public void setPJ_CLASS_12_CD(String val) { m_PJ_CLASS_12_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setDETAL_NO(String val) { m_DETAL_NO = val; }
	public void setODR_CMPLT_FLG(String val) { m_ODR_CMPLT_FLG = val; }
	public void setAuto_PROJECT_CD(String val) { m_Auto_PROJECT_CD = val; }
	public void setCurUnit(String val) { m_CurUnit = val; }
	public void setESTIMATE_TYPE(String val) { m_ESTIMATE_TYPE = val; }


	public void setList_h_PROJECT_CD(List list) { l_h_PROJECT_CD = list; }
	public void setList_PROJECT_STAT_name(List list) { l_PROJECT_STAT_name = list; }
	public void setList_PROJECT_STAT_val(List list) { l_PROJECT_STAT_val = list; }
	public void setList_COMPLETE_STAT(List list) { l_COMPLETE_STAT = list; }
	public void setList_ACCURACY_LEVEL_name(List list) { l_ACCURACY_LEVEL_name = list; }
	public void setList_ACCURACY_LEVEL_val(List list) { l_ACCURACY_LEVEL_val = list; }
	public void setList_OD_COMP_FLG(List list) { l_OD_COMP_FLG = list; }
	public void setList_PJ_CLASS_01_TYP(List list) { l_PJ_CLASS_01_TYP = list; }
	public void setList_PJ_CLASS_01_NAME(List list) { l_PJ_CLASS_01_NAME = list; }
	public void setList_PJ_CLASS_02_TYP(List list) { l_PJ_CLASS_02_TYP = list; }
	public void setList_PJ_CLASS_02_NAME(List list) { l_PJ_CLASS_02_NAME = list; }
	public void setList_PJ_CLASS_03_TYP(List list) { l_PJ_CLASS_03_TYP = list; }
	public void setList_PJ_CLASS_03_NAME(List list) { l_PJ_CLASS_03_NAME = list; }
	public void setList_PJ_CLASS_04_TYP(List list) { l_PJ_CLASS_04_TYP = list; }
	public void setList_PJ_CLASS_04_NAME(List list) { l_PJ_CLASS_04_NAME = list; }
	public void setList_PJ_CLASS_05_TYP(List list) { l_PJ_CLASS_05_TYP = list; }
	public void setList_PJ_CLASS_05_NAME(List list) { l_PJ_CLASS_05_NAME = list; }
	public void setList_PJ_CLASS_06_TYP(List list) { l_PJ_CLASS_06_TYP = list; }
	public void setList_PJ_CLASS_06_NAME(List list) { l_PJ_CLASS_06_NAME = list; }
	public void setList_PJ_CLASS_07_TYP(List list) { l_PJ_CLASS_07_TYP = list; }
	public void setList_PJ_CLASS_07_NAME(List list) { l_PJ_CLASS_07_NAME = list; }
	public void setList_PJ_CLASS_08_TYP(List list) { l_PJ_CLASS_08_TYP = list; }
	public void setList_PJ_CLASS_08_NAME(List list) { l_PJ_CLASS_08_NAME = list; }
	public void setList_PJ_CLASS_09_TYP(List list) { l_PJ_CLASS_09_TYP = list; }
	public void setList_PJ_CLASS_09_NAME(List list) { l_PJ_CLASS_09_NAME = list; }
	public void setList_PJ_CLASS_10_TYP(List list) { l_PJ_CLASS_10_TYP = list; }
	public void setList_PJ_CLASS_10_NAME(List list) { l_PJ_CLASS_10_NAME = list; }
	public void setList_PJ_CLASS_11_TYP(List list) { l_PJ_CLASS_11_TYP = list; }
	public void setList_PJ_CLASS_11_NAME(List list) { l_PJ_CLASS_11_NAME = list; }
	public void setList_PJ_CLASS_12_TYP(List list) { l_PJ_CLASS_12_TYP = list; }
	public void setList_PJ_CLASS_12_NAME(List list) { l_PJ_CLASS_12_NAME = list; }
	public void setList_PROJECT_CD_FLG(List list) { l_PROJECT_CD_FLG = list; }
	public void setList_h_PROJECT_STAT(List list) { l_h_PROJECT_STAT = list; }
	public void setList_h_ESTIMATE(List list) { l_h_ESTIMATE = list; }
	public void setList_h_COMPLETE_STAT(List list) { l_h_COMPLETE_STAT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_PROJECT_STAT(List list) { l_PROJECT_STAT = list; }
	public void setList_ACCURACY_LEVEL(List list) { l_ACCURACY_LEVEL = list; }
	public void setList_Vend_Date(List list) { l_Vend_Date = list; }
	public void setList_AssumeDlv_date(List list) { l_AssumeDlv_date = list; }
	public void setList_AssumeAmount(List list) { l_AssumeAmount = list; }
	public void setList_ASSUME_AMOUNT_EXCH_RATES(List list) { l_ASSUME_AMOUNT_EXCH_RATES = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_PJ_ORG_CD(List list) { l_PJ_ORG_CD = list; }
	public void setList_PJ_USER_CD(List list) { l_PJ_USER_CD = list; }
	public void setList_REMARKS1(List list) { l_REMARKS1 = list; }
	public void setList_REMARKS2(List list) { l_REMARKS2 = list; }
	public void setList_REMARKS3(List list) { l_REMARKS3 = list; }
	public void setList_REMARKS4(List list) { l_REMARKS4 = list; }
	public void setList_REMARKS5(List list) { l_REMARKS5 = list; }
	public void setList_h_OD_COMP_FLG(List list) { l_h_OD_COMP_FLG = list; }
	public void setList_PJ_CLASS_01_CD(List list) { l_PJ_CLASS_01_CD = list; }
	public void setList_PJ_CLASS_02_CD(List list) { l_PJ_CLASS_02_CD = list; }
	public void setList_PJ_CLASS_03_CD(List list) { l_PJ_CLASS_03_CD = list; }
	public void setList_PJ_CLASS_04_CD(List list) { l_PJ_CLASS_04_CD = list; }
	public void setList_PJ_CLASS_05_CD(List list) { l_PJ_CLASS_05_CD = list; }
	public void setList_PJ_CLASS_06_CD(List list) { l_PJ_CLASS_06_CD = list; }
	public void setList_PJ_CLASS_07_CD(List list) { l_PJ_CLASS_07_CD = list; }
	public void setList_PJ_CLASS_08_CD(List list) { l_PJ_CLASS_08_CD = list; }
	public void setList_PJ_CLASS_09_CD(List list) { l_PJ_CLASS_09_CD = list; }
	public void setList_PJ_CLASS_10_CD(List list) { l_PJ_CLASS_10_CD = list; }
	public void setList_PJ_CLASS_11_CD(List list) { l_PJ_CLASS_11_CD = list; }
	public void setList_PJ_CLASS_12_CD(List list) { l_PJ_CLASS_12_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_DETAL_NO(List list) { l_DETAL_NO = list; }
	public void setList_ODR_CMPLT_FLG(List list) { l_ODR_CMPLT_FLG = list; }
	public void setList_Auto_PROJECT_CD(List list) { l_Auto_PROJECT_CD = list; }
	public void setList_CurUnit(List list) { l_CurUnit = list; }
	public void setList_ESTIMATE_TYPE(List list) { l_ESTIMATE_TYPE = list; }

	public int setL2L_h_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROJECT_CD == null) {
			l_h_PROJECT_CD = new ArrayList();
		} else {
			l_h_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROJECT_CD.add(((KM0010010Struct) list.get(i)).geth_PROJECT_CD());
		}
		return size;
	}
	public int setL2L_PROJECT_STAT_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_STAT_name == null) {
			l_PROJECT_STAT_name = new ArrayList();
		} else {
			l_PROJECT_STAT_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_STAT_name.add(((KM0010010Struct) list.get(i)).getPROJECT_STAT_name());
		}
		return size;
	}
	public int setL2L_PROJECT_STAT_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_STAT_val == null) {
			l_PROJECT_STAT_val = new ArrayList();
		} else {
			l_PROJECT_STAT_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_STAT_val.add(((KM0010010Struct) list.get(i)).getPROJECT_STAT_val());
		}
		return size;
	}
	public int setL2L_COMPLETE_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPLETE_STAT == null) {
			l_COMPLETE_STAT = new ArrayList();
		} else {
			l_COMPLETE_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPLETE_STAT.add(((KM0010010Struct) list.get(i)).getCOMPLETE_STAT());
		}
		return size;
	}
	public int setL2L_ACCURACY_LEVEL_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCURACY_LEVEL_name == null) {
			l_ACCURACY_LEVEL_name = new ArrayList();
		} else {
			l_ACCURACY_LEVEL_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCURACY_LEVEL_name.add(((KM0010010Struct) list.get(i)).getACCURACY_LEVEL_name());
		}
		return size;
	}
	public int setL2L_ACCURACY_LEVEL_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCURACY_LEVEL_val == null) {
			l_ACCURACY_LEVEL_val = new ArrayList();
		} else {
			l_ACCURACY_LEVEL_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCURACY_LEVEL_val.add(((KM0010010Struct) list.get(i)).getACCURACY_LEVEL_val());
		}
		return size;
	}
	public int setL2L_OD_COMP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_COMP_FLG == null) {
			l_OD_COMP_FLG = new ArrayList();
		} else {
			l_OD_COMP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_COMP_FLG.add(((KM0010010Struct) list.get(i)).getOD_COMP_FLG());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_01_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_01_TYP == null) {
			l_PJ_CLASS_01_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_01_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_01_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_01_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_01_NAME == null) {
			l_PJ_CLASS_01_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_01_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_01_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_02_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_02_TYP == null) {
			l_PJ_CLASS_02_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_02_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_02_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_02_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_02_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_02_NAME == null) {
			l_PJ_CLASS_02_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_02_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_02_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_02_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_03_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_03_TYP == null) {
			l_PJ_CLASS_03_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_03_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_03_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_03_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_03_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_03_NAME == null) {
			l_PJ_CLASS_03_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_03_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_03_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_03_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_04_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_04_TYP == null) {
			l_PJ_CLASS_04_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_04_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_04_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_04_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_04_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_04_NAME == null) {
			l_PJ_CLASS_04_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_04_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_04_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_04_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_05_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_05_TYP == null) {
			l_PJ_CLASS_05_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_05_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_05_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_05_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_05_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_05_NAME == null) {
			l_PJ_CLASS_05_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_05_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_05_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_05_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_06_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_06_TYP == null) {
			l_PJ_CLASS_06_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_06_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_06_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_06_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_06_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_06_NAME == null) {
			l_PJ_CLASS_06_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_06_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_06_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_06_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_07_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_07_TYP == null) {
			l_PJ_CLASS_07_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_07_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_07_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_07_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_07_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_07_NAME == null) {
			l_PJ_CLASS_07_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_07_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_07_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_07_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_08_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_08_TYP == null) {
			l_PJ_CLASS_08_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_08_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_08_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_08_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_08_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_08_NAME == null) {
			l_PJ_CLASS_08_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_08_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_08_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_08_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_09_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_09_TYP == null) {
			l_PJ_CLASS_09_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_09_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_09_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_09_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_09_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_09_NAME == null) {
			l_PJ_CLASS_09_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_09_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_09_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_09_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_10_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_10_TYP == null) {
			l_PJ_CLASS_10_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_10_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_10_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_10_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_10_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_10_NAME == null) {
			l_PJ_CLASS_10_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_10_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_10_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_10_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_11_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_11_TYP == null) {
			l_PJ_CLASS_11_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_11_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_11_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_11_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_11_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_11_NAME == null) {
			l_PJ_CLASS_11_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_11_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_11_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_11_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_12_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_12_TYP == null) {
			l_PJ_CLASS_12_TYP = new ArrayList();
		} else {
			l_PJ_CLASS_12_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_12_TYP.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_12_TYP());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_12_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_12_NAME == null) {
			l_PJ_CLASS_12_NAME = new ArrayList();
		} else {
			l_PJ_CLASS_12_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_12_NAME.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_12_NAME());
		}
		return size;
	}
	public int setL2L_PROJECT_CD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_CD_FLG == null) {
			l_PROJECT_CD_FLG = new ArrayList();
		} else {
			l_PROJECT_CD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_CD_FLG.add(((KM0010010Struct) list.get(i)).getPROJECT_CD_FLG());
		}
		return size;
	}
	public int setL2L_h_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROJECT_STAT == null) {
			l_h_PROJECT_STAT = new ArrayList();
		} else {
			l_h_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROJECT_STAT.add(((KM0010010Struct) list.get(i)).geth_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_h_ESTIMATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ESTIMATE == null) {
			l_h_ESTIMATE = new ArrayList();
		} else {
			l_h_ESTIMATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ESTIMATE.add(((KM0010010Struct) list.get(i)).geth_ESTIMATE());
		}
		return size;
	}
	public int setL2L_h_COMPLETE_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COMPLETE_STAT == null) {
			l_h_COMPLETE_STAT = new ArrayList();
		} else {
			l_h_COMPLETE_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COMPLETE_STAT.add(((KM0010010Struct) list.get(i)).geth_COMPLETE_STAT());
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
			l_COMPANY_CD.add(((KM0010010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUST_CD.add(((KM0010010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_NAME == null) {
			l_CUST_NAME = new ArrayList();
		} else {
			l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_NAME.add(((KM0010010Struct) list.get(i)).getCUST_NAME());
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
			l_CUR_CD.add(((KM0010010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP == null) {
			l_EXCH_TYP = new ArrayList();
		} else {
			l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP.add(((KM0010010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_ROUND_TYP == null) {
			l_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_ROUND_TYP.add(((KM0010010Struct) list.get(i)).getDETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_CD == null) {
			l_PROJECT_CD = new ArrayList();
		} else {
			l_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_CD.add(((KM0010010Struct) list.get(i)).getPROJECT_CD());
		}
		return size;
	}
	public int setL2L_PROJECT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_NAME == null) {
			l_PROJECT_NAME = new ArrayList();
		} else {
			l_PROJECT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_NAME.add(((KM0010010Struct) list.get(i)).getPROJECT_NAME());
		}
		return size;
	}
	public int setL2L_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_STAT == null) {
			l_PROJECT_STAT = new ArrayList();
		} else {
			l_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_STAT.add(((KM0010010Struct) list.get(i)).getPROJECT_STAT());
		}
		return size;
	}
	public int setL2L_ACCURACY_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCURACY_LEVEL == null) {
			l_ACCURACY_LEVEL = new ArrayList();
		} else {
			l_ACCURACY_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCURACY_LEVEL.add(((KM0010010Struct) list.get(i)).getACCURACY_LEVEL());
		}
		return size;
	}
	public int setL2L_Vend_Date(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Vend_Date == null) {
			l_Vend_Date = new ArrayList();
		} else {
			l_Vend_Date.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Vend_Date.add(((KM0010010Struct) list.get(i)).getVend_Date());
		}
		return size;
	}
	public int setL2L_AssumeDlv_date(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AssumeDlv_date == null) {
			l_AssumeDlv_date = new ArrayList();
		} else {
			l_AssumeDlv_date.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AssumeDlv_date.add(((KM0010010Struct) list.get(i)).getAssumeDlv_date());
		}
		return size;
	}
	public int setL2L_AssumeAmount(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AssumeAmount == null) {
			l_AssumeAmount = new ArrayList();
		} else {
			l_AssumeAmount.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AssumeAmount.add(((KM0010010Struct) list.get(i)).getAssumeAmount());
		}
		return size;
	}
	public int setL2L_ASSUME_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASSUME_AMOUNT_EXCH_RATES == null) {
			l_ASSUME_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_ASSUME_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASSUME_AMOUNT_EXCH_RATES.add(((KM0010010Struct) list.get(i)).getASSUME_AMOUNT_EXCH_RATES());
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
			l_DLV_LOC_CD.add(((KM0010010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_PJ_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_ORG_CD == null) {
			l_PJ_ORG_CD = new ArrayList();
		} else {
			l_PJ_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_ORG_CD.add(((KM0010010Struct) list.get(i)).getPJ_ORG_CD());
		}
		return size;
	}
	public int setL2L_PJ_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_USER_CD == null) {
			l_PJ_USER_CD = new ArrayList();
		} else {
			l_PJ_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_USER_CD.add(((KM0010010Struct) list.get(i)).getPJ_USER_CD());
		}
		return size;
	}
	public int setL2L_REMARKS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS1 == null) {
			l_REMARKS1 = new ArrayList();
		} else {
			l_REMARKS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS1.add(((KM0010010Struct) list.get(i)).getREMARKS1());
		}
		return size;
	}
	public int setL2L_REMARKS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS2 == null) {
			l_REMARKS2 = new ArrayList();
		} else {
			l_REMARKS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS2.add(((KM0010010Struct) list.get(i)).getREMARKS2());
		}
		return size;
	}
	public int setL2L_REMARKS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS3 == null) {
			l_REMARKS3 = new ArrayList();
		} else {
			l_REMARKS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS3.add(((KM0010010Struct) list.get(i)).getREMARKS3());
		}
		return size;
	}
	public int setL2L_REMARKS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS4 == null) {
			l_REMARKS4 = new ArrayList();
		} else {
			l_REMARKS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS4.add(((KM0010010Struct) list.get(i)).getREMARKS4());
		}
		return size;
	}
	public int setL2L_REMARKS5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS5 == null) {
			l_REMARKS5 = new ArrayList();
		} else {
			l_REMARKS5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS5.add(((KM0010010Struct) list.get(i)).getREMARKS5());
		}
		return size;
	}
	public int setL2L_h_OD_COMP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OD_COMP_FLG == null) {
			l_h_OD_COMP_FLG = new ArrayList();
		} else {
			l_h_OD_COMP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OD_COMP_FLG.add(((KM0010010Struct) list.get(i)).geth_OD_COMP_FLG());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_01_CD == null) {
			l_PJ_CLASS_01_CD = new ArrayList();
		} else {
			l_PJ_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_01_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_02_CD == null) {
			l_PJ_CLASS_02_CD = new ArrayList();
		} else {
			l_PJ_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_02_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_03_CD == null) {
			l_PJ_CLASS_03_CD = new ArrayList();
		} else {
			l_PJ_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_03_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_04_CD == null) {
			l_PJ_CLASS_04_CD = new ArrayList();
		} else {
			l_PJ_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_04_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_05_CD == null) {
			l_PJ_CLASS_05_CD = new ArrayList();
		} else {
			l_PJ_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_05_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_06_CD == null) {
			l_PJ_CLASS_06_CD = new ArrayList();
		} else {
			l_PJ_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_06_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_07_CD == null) {
			l_PJ_CLASS_07_CD = new ArrayList();
		} else {
			l_PJ_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_07_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_08_CD == null) {
			l_PJ_CLASS_08_CD = new ArrayList();
		} else {
			l_PJ_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_08_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_09_CD == null) {
			l_PJ_CLASS_09_CD = new ArrayList();
		} else {
			l_PJ_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_09_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_10_CD == null) {
			l_PJ_CLASS_10_CD = new ArrayList();
		} else {
			l_PJ_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_10_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_11_CD == null) {
			l_PJ_CLASS_11_CD = new ArrayList();
		} else {
			l_PJ_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_11_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_PJ_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CLASS_12_CD == null) {
			l_PJ_CLASS_12_CD = new ArrayList();
		} else {
			l_PJ_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CLASS_12_CD.add(((KM0010010Struct) list.get(i)).getPJ_CLASS_12_CD());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((KM0010010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_DLV_LOC_NAME.add(((KM0010010Struct) list.get(i)).getDLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((KM0010010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((KM0010010Struct) list.get(i)).getORG_NAME());
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
			l_USER_CD.add(((KM0010010Struct) list.get(i)).getUSER_CD());
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
			l_USER_NAME.add(((KM0010010Struct) list.get(i)).getUSER_NAME());
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
			l_ODR_NO.add(((KM0010010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_NO == null) {
			l_ESTIMATE_NO = new ArrayList();
		} else {
			l_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_NO.add(((KM0010010Struct) list.get(i)).getESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAL_NO == null) {
			l_DETAL_NO = new ArrayList();
		} else {
			l_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAL_NO.add(((KM0010010Struct) list.get(i)).getDETAL_NO());
		}
		return size;
	}
	public int setL2L_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CMPLT_FLG == null) {
			l_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CMPLT_FLG.add(((KM0010010Struct) list.get(i)).getODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_Auto_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Auto_PROJECT_CD == null) {
			l_Auto_PROJECT_CD = new ArrayList();
		} else {
			l_Auto_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Auto_PROJECT_CD.add(((KM0010010Struct) list.get(i)).getAuto_PROJECT_CD());
		}
		return size;
	}
	public int setL2L_CurUnit(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CurUnit == null) {
			l_CurUnit = new ArrayList();
		} else {
			l_CurUnit.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CurUnit.add(((KM0010010Struct) list.get(i)).getCurUnit());
		}
		return size;
	}
	public int setL2L_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_TYPE == null) {
			l_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_TYPE.add(((KM0010010Struct) list.get(i)).getESTIMATE_TYPE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_PROJECT_CD = null;
		m_PROJECT_STAT_name = null;
		m_PROJECT_STAT_val = null;
		m_COMPLETE_STAT = null;
		m_ACCURACY_LEVEL_name = null;
		m_ACCURACY_LEVEL_val = null;
		m_OD_COMP_FLG = null;
		m_PJ_CLASS_01_TYP = null;
		m_PJ_CLASS_01_NAME = null;
		m_PJ_CLASS_02_TYP = null;
		m_PJ_CLASS_02_NAME = null;
		m_PJ_CLASS_03_TYP = null;
		m_PJ_CLASS_03_NAME = null;
		m_PJ_CLASS_04_TYP = null;
		m_PJ_CLASS_04_NAME = null;
		m_PJ_CLASS_05_TYP = null;
		m_PJ_CLASS_05_NAME = null;
		m_PJ_CLASS_06_TYP = null;
		m_PJ_CLASS_06_NAME = null;
		m_PJ_CLASS_07_TYP = null;
		m_PJ_CLASS_07_NAME = null;
		m_PJ_CLASS_08_TYP = null;
		m_PJ_CLASS_08_NAME = null;
		m_PJ_CLASS_09_TYP = null;
		m_PJ_CLASS_09_NAME = null;
		m_PJ_CLASS_10_TYP = null;
		m_PJ_CLASS_10_NAME = null;
		m_PJ_CLASS_11_TYP = null;
		m_PJ_CLASS_11_NAME = null;
		m_PJ_CLASS_12_TYP = null;
		m_PJ_CLASS_12_NAME = null;
		m_PROJECT_CD_FLG = null;
		m_h_PROJECT_STAT = null;
		m_h_ESTIMATE = null;
		m_h_COMPLETE_STAT = null;
		m_COMPANY_CD = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_PROJECT_CD = null;
		m_PROJECT_NAME = null;
		m_PROJECT_STAT = null;
		m_ACCURACY_LEVEL = null;
		m_Vend_Date = null;
		m_AssumeDlv_date = null;
		m_AssumeAmount = null;
		m_ASSUME_AMOUNT_EXCH_RATES = null;
		m_DLV_LOC_CD = null;
		m_PJ_ORG_CD = null;
		m_PJ_USER_CD = null;
		m_REMARKS1 = null;
		m_REMARKS2 = null;
		m_REMARKS3 = null;
		m_REMARKS4 = null;
		m_REMARKS5 = null;
		m_h_OD_COMP_FLG = null;
		m_PJ_CLASS_01_CD = null;
		m_PJ_CLASS_02_CD = null;
		m_PJ_CLASS_03_CD = null;
		m_PJ_CLASS_04_CD = null;
		m_PJ_CLASS_05_CD = null;
		m_PJ_CLASS_06_CD = null;
		m_PJ_CLASS_07_CD = null;
		m_PJ_CLASS_08_CD = null;
		m_PJ_CLASS_09_CD = null;
		m_PJ_CLASS_10_CD = null;
		m_PJ_CLASS_11_CD = null;
		m_PJ_CLASS_12_CD = null;
		m_h_MODIFY_COUNT = null;
		m_DLV_LOC_NAME = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_USER_CD = null;
		m_USER_NAME = null;
		m_ODR_NO = null;
		m_ESTIMATE_NO = null;
		m_DETAL_NO = null;
		m_ODR_CMPLT_FLG = null;
		m_Auto_PROJECT_CD = null;
		m_CurUnit = null;
		m_ESTIMATE_TYPE = null;

		l_h_PROJECT_CD = null;
		l_PROJECT_STAT_name = null;
		l_PROJECT_STAT_val = null;
		l_COMPLETE_STAT = null;
		l_ACCURACY_LEVEL_name = null;
		l_ACCURACY_LEVEL_val = null;
		l_OD_COMP_FLG = null;
		l_PJ_CLASS_01_TYP = null;
		l_PJ_CLASS_01_NAME = null;
		l_PJ_CLASS_02_TYP = null;
		l_PJ_CLASS_02_NAME = null;
		l_PJ_CLASS_03_TYP = null;
		l_PJ_CLASS_03_NAME = null;
		l_PJ_CLASS_04_TYP = null;
		l_PJ_CLASS_04_NAME = null;
		l_PJ_CLASS_05_TYP = null;
		l_PJ_CLASS_05_NAME = null;
		l_PJ_CLASS_06_TYP = null;
		l_PJ_CLASS_06_NAME = null;
		l_PJ_CLASS_07_TYP = null;
		l_PJ_CLASS_07_NAME = null;
		l_PJ_CLASS_08_TYP = null;
		l_PJ_CLASS_08_NAME = null;
		l_PJ_CLASS_09_TYP = null;
		l_PJ_CLASS_09_NAME = null;
		l_PJ_CLASS_10_TYP = null;
		l_PJ_CLASS_10_NAME = null;
		l_PJ_CLASS_11_TYP = null;
		l_PJ_CLASS_11_NAME = null;
		l_PJ_CLASS_12_TYP = null;
		l_PJ_CLASS_12_NAME = null;
		l_PROJECT_CD_FLG = null;
		l_h_PROJECT_STAT = null;
		l_h_ESTIMATE = null;
		l_h_COMPLETE_STAT = null;
		l_COMPANY_CD = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_PROJECT_CD = null;
		l_PROJECT_NAME = null;
		l_PROJECT_STAT = null;
		l_ACCURACY_LEVEL = null;
		l_Vend_Date = null;
		l_AssumeDlv_date = null;
		l_AssumeAmount = null;
		l_ASSUME_AMOUNT_EXCH_RATES = null;
		l_DLV_LOC_CD = null;
		l_PJ_ORG_CD = null;
		l_PJ_USER_CD = null;
		l_REMARKS1 = null;
		l_REMARKS2 = null;
		l_REMARKS3 = null;
		l_REMARKS4 = null;
		l_REMARKS5 = null;
		l_h_OD_COMP_FLG = null;
		l_PJ_CLASS_01_CD = null;
		l_PJ_CLASS_02_CD = null;
		l_PJ_CLASS_03_CD = null;
		l_PJ_CLASS_04_CD = null;
		l_PJ_CLASS_05_CD = null;
		l_PJ_CLASS_06_CD = null;
		l_PJ_CLASS_07_CD = null;
		l_PJ_CLASS_08_CD = null;
		l_PJ_CLASS_09_CD = null;
		l_PJ_CLASS_10_CD = null;
		l_PJ_CLASS_11_CD = null;
		l_PJ_CLASS_12_CD = null;
		l_h_MODIFY_COUNT = null;
		l_DLV_LOC_NAME = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_USER_CD = null;
		l_USER_NAME = null;
		l_ODR_NO = null;
		l_ESTIMATE_NO = null;
		l_DETAL_NO = null;
		l_ODR_CMPLT_FLG = null;
		l_Auto_PROJECT_CD = null;
		l_CurUnit = null;
		l_ESTIMATE_TYPE = null;

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
	 * medKM0010010クラスの標準コンストラクタ
	 */
	public KM0010010Struct()
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
	public void setStruct(KM0010010Struct struct)
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
	public void setStructM(KM0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_PROJECT_CD(struct.geth_PROJECT_CD());
			this.setPROJECT_STAT_name(struct.getPROJECT_STAT_name());
			this.setPROJECT_STAT_val(struct.getPROJECT_STAT_val());
			this.setCOMPLETE_STAT(struct.getCOMPLETE_STAT());
			this.setACCURACY_LEVEL_name(struct.getACCURACY_LEVEL_name());
			this.setACCURACY_LEVEL_val(struct.getACCURACY_LEVEL_val());
			this.setOD_COMP_FLG(struct.getOD_COMP_FLG());
			this.setPJ_CLASS_01_TYP(struct.getPJ_CLASS_01_TYP());
			this.setPJ_CLASS_01_NAME(struct.getPJ_CLASS_01_NAME());
			this.setPJ_CLASS_02_TYP(struct.getPJ_CLASS_02_TYP());
			this.setPJ_CLASS_02_NAME(struct.getPJ_CLASS_02_NAME());
			this.setPJ_CLASS_03_TYP(struct.getPJ_CLASS_03_TYP());
			this.setPJ_CLASS_03_NAME(struct.getPJ_CLASS_03_NAME());
			this.setPJ_CLASS_04_TYP(struct.getPJ_CLASS_04_TYP());
			this.setPJ_CLASS_04_NAME(struct.getPJ_CLASS_04_NAME());
			this.setPJ_CLASS_05_TYP(struct.getPJ_CLASS_05_TYP());
			this.setPJ_CLASS_05_NAME(struct.getPJ_CLASS_05_NAME());
			this.setPJ_CLASS_06_TYP(struct.getPJ_CLASS_06_TYP());
			this.setPJ_CLASS_06_NAME(struct.getPJ_CLASS_06_NAME());
			this.setPJ_CLASS_07_TYP(struct.getPJ_CLASS_07_TYP());
			this.setPJ_CLASS_07_NAME(struct.getPJ_CLASS_07_NAME());
			this.setPJ_CLASS_08_TYP(struct.getPJ_CLASS_08_TYP());
			this.setPJ_CLASS_08_NAME(struct.getPJ_CLASS_08_NAME());
			this.setPJ_CLASS_09_TYP(struct.getPJ_CLASS_09_TYP());
			this.setPJ_CLASS_09_NAME(struct.getPJ_CLASS_09_NAME());
			this.setPJ_CLASS_10_TYP(struct.getPJ_CLASS_10_TYP());
			this.setPJ_CLASS_10_NAME(struct.getPJ_CLASS_10_NAME());
			this.setPJ_CLASS_11_TYP(struct.getPJ_CLASS_11_TYP());
			this.setPJ_CLASS_11_NAME(struct.getPJ_CLASS_11_NAME());
			this.setPJ_CLASS_12_TYP(struct.getPJ_CLASS_12_TYP());
			this.setPJ_CLASS_12_NAME(struct.getPJ_CLASS_12_NAME());
			this.setPROJECT_CD_FLG(struct.getPROJECT_CD_FLG());
			this.seth_PROJECT_STAT(struct.geth_PROJECT_STAT());
			this.seth_ESTIMATE(struct.geth_ESTIMATE());
			this.seth_COMPLETE_STAT(struct.geth_COMPLETE_STAT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.setPROJECT_STAT(struct.getPROJECT_STAT());
			this.setACCURACY_LEVEL(struct.getACCURACY_LEVEL());
			this.setVend_Date(struct.getVend_Date());
			this.setAssumeDlv_date(struct.getAssumeDlv_date());
			this.setAssumeAmount(struct.getAssumeAmount());
			this.setASSUME_AMOUNT_EXCH_RATES(struct.getASSUME_AMOUNT_EXCH_RATES());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setPJ_ORG_CD(struct.getPJ_ORG_CD());
			this.setPJ_USER_CD(struct.getPJ_USER_CD());
			this.setREMARKS1(struct.getREMARKS1());
			this.setREMARKS2(struct.getREMARKS2());
			this.setREMARKS3(struct.getREMARKS3());
			this.setREMARKS4(struct.getREMARKS4());
			this.setREMARKS5(struct.getREMARKS5());
			this.seth_OD_COMP_FLG(struct.geth_OD_COMP_FLG());
			this.setPJ_CLASS_01_CD(struct.getPJ_CLASS_01_CD());
			this.setPJ_CLASS_02_CD(struct.getPJ_CLASS_02_CD());
			this.setPJ_CLASS_03_CD(struct.getPJ_CLASS_03_CD());
			this.setPJ_CLASS_04_CD(struct.getPJ_CLASS_04_CD());
			this.setPJ_CLASS_05_CD(struct.getPJ_CLASS_05_CD());
			this.setPJ_CLASS_06_CD(struct.getPJ_CLASS_06_CD());
			this.setPJ_CLASS_07_CD(struct.getPJ_CLASS_07_CD());
			this.setPJ_CLASS_08_CD(struct.getPJ_CLASS_08_CD());
			this.setPJ_CLASS_09_CD(struct.getPJ_CLASS_09_CD());
			this.setPJ_CLASS_10_CD(struct.getPJ_CLASS_10_CD());
			this.setPJ_CLASS_11_CD(struct.getPJ_CLASS_11_CD());
			this.setPJ_CLASS_12_CD(struct.getPJ_CLASS_12_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setUSER_CD(struct.getUSER_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setODR_NO(struct.getODR_NO());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setDETAL_NO(struct.getDETAL_NO());
			this.setODR_CMPLT_FLG(struct.getODR_CMPLT_FLG());
			this.setAuto_PROJECT_CD(struct.getAuto_PROJECT_CD());
			this.setCurUnit(struct.getCurUnit());
			this.setESTIMATE_TYPE(struct.getESTIMATE_TYPE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KM0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_PROJECT_CD(struct.getList_h_PROJECT_CD());
			this.setList_PROJECT_STAT_name(struct.getList_PROJECT_STAT_name());
			this.setList_PROJECT_STAT_val(struct.getList_PROJECT_STAT_val());
			this.setList_COMPLETE_STAT(struct.getList_COMPLETE_STAT());
			this.setList_ACCURACY_LEVEL_name(struct.getList_ACCURACY_LEVEL_name());
			this.setList_ACCURACY_LEVEL_val(struct.getList_ACCURACY_LEVEL_val());
			this.setList_OD_COMP_FLG(struct.getList_OD_COMP_FLG());
			this.setList_PJ_CLASS_01_TYP(struct.getList_PJ_CLASS_01_TYP());
			this.setList_PJ_CLASS_01_NAME(struct.getList_PJ_CLASS_01_NAME());
			this.setList_PJ_CLASS_02_TYP(struct.getList_PJ_CLASS_02_TYP());
			this.setList_PJ_CLASS_02_NAME(struct.getList_PJ_CLASS_02_NAME());
			this.setList_PJ_CLASS_03_TYP(struct.getList_PJ_CLASS_03_TYP());
			this.setList_PJ_CLASS_03_NAME(struct.getList_PJ_CLASS_03_NAME());
			this.setList_PJ_CLASS_04_TYP(struct.getList_PJ_CLASS_04_TYP());
			this.setList_PJ_CLASS_04_NAME(struct.getList_PJ_CLASS_04_NAME());
			this.setList_PJ_CLASS_05_TYP(struct.getList_PJ_CLASS_05_TYP());
			this.setList_PJ_CLASS_05_NAME(struct.getList_PJ_CLASS_05_NAME());
			this.setList_PJ_CLASS_06_TYP(struct.getList_PJ_CLASS_06_TYP());
			this.setList_PJ_CLASS_06_NAME(struct.getList_PJ_CLASS_06_NAME());
			this.setList_PJ_CLASS_07_TYP(struct.getList_PJ_CLASS_07_TYP());
			this.setList_PJ_CLASS_07_NAME(struct.getList_PJ_CLASS_07_NAME());
			this.setList_PJ_CLASS_08_TYP(struct.getList_PJ_CLASS_08_TYP());
			this.setList_PJ_CLASS_08_NAME(struct.getList_PJ_CLASS_08_NAME());
			this.setList_PJ_CLASS_09_TYP(struct.getList_PJ_CLASS_09_TYP());
			this.setList_PJ_CLASS_09_NAME(struct.getList_PJ_CLASS_09_NAME());
			this.setList_PJ_CLASS_10_TYP(struct.getList_PJ_CLASS_10_TYP());
			this.setList_PJ_CLASS_10_NAME(struct.getList_PJ_CLASS_10_NAME());
			this.setList_PJ_CLASS_11_TYP(struct.getList_PJ_CLASS_11_TYP());
			this.setList_PJ_CLASS_11_NAME(struct.getList_PJ_CLASS_11_NAME());
			this.setList_PJ_CLASS_12_TYP(struct.getList_PJ_CLASS_12_TYP());
			this.setList_PJ_CLASS_12_NAME(struct.getList_PJ_CLASS_12_NAME());
			this.setList_PROJECT_CD_FLG(struct.getList_PROJECT_CD_FLG());
			this.setList_h_PROJECT_STAT(struct.getList_h_PROJECT_STAT());
			this.setList_h_ESTIMATE(struct.getList_h_ESTIMATE());
			this.setList_h_COMPLETE_STAT(struct.getList_h_COMPLETE_STAT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_PROJECT_STAT(struct.getList_PROJECT_STAT());
			this.setList_ACCURACY_LEVEL(struct.getList_ACCURACY_LEVEL());
			this.setList_Vend_Date(struct.getList_Vend_Date());
			this.setList_AssumeDlv_date(struct.getList_AssumeDlv_date());
			this.setList_AssumeAmount(struct.getList_AssumeAmount());
			this.setList_ASSUME_AMOUNT_EXCH_RATES(struct.getList_ASSUME_AMOUNT_EXCH_RATES());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_PJ_ORG_CD(struct.getList_PJ_ORG_CD());
			this.setList_PJ_USER_CD(struct.getList_PJ_USER_CD());
			this.setList_REMARKS1(struct.getList_REMARKS1());
			this.setList_REMARKS2(struct.getList_REMARKS2());
			this.setList_REMARKS3(struct.getList_REMARKS3());
			this.setList_REMARKS4(struct.getList_REMARKS4());
			this.setList_REMARKS5(struct.getList_REMARKS5());
			this.setList_h_OD_COMP_FLG(struct.getList_h_OD_COMP_FLG());
			this.setList_PJ_CLASS_01_CD(struct.getList_PJ_CLASS_01_CD());
			this.setList_PJ_CLASS_02_CD(struct.getList_PJ_CLASS_02_CD());
			this.setList_PJ_CLASS_03_CD(struct.getList_PJ_CLASS_03_CD());
			this.setList_PJ_CLASS_04_CD(struct.getList_PJ_CLASS_04_CD());
			this.setList_PJ_CLASS_05_CD(struct.getList_PJ_CLASS_05_CD());
			this.setList_PJ_CLASS_06_CD(struct.getList_PJ_CLASS_06_CD());
			this.setList_PJ_CLASS_07_CD(struct.getList_PJ_CLASS_07_CD());
			this.setList_PJ_CLASS_08_CD(struct.getList_PJ_CLASS_08_CD());
			this.setList_PJ_CLASS_09_CD(struct.getList_PJ_CLASS_09_CD());
			this.setList_PJ_CLASS_10_CD(struct.getList_PJ_CLASS_10_CD());
			this.setList_PJ_CLASS_11_CD(struct.getList_PJ_CLASS_11_CD());
			this.setList_PJ_CLASS_12_CD(struct.getList_PJ_CLASS_12_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_DETAL_NO(struct.getList_DETAL_NO());
			this.setList_ODR_CMPLT_FLG(struct.getList_ODR_CMPLT_FLG());
			this.setList_Auto_PROJECT_CD(struct.getList_Auto_PROJECT_CD());
			this.setList_CurUnit(struct.getList_CurUnit());
			this.setList_ESTIMATE_TYPE(struct.getList_ESTIMATE_TYPE());
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
	// 第 1 変数初期値： i_h_PROJECT_CD


	final static String i_h_PROJECT_CD = null;

	// 第 2 変数初期値： i_PROJECT_STAT_name


	final static String i_PROJECT_STAT_name = null;

	// 第 3 変数初期値： i_PROJECT_STAT_val


	final static String i_PROJECT_STAT_val = null;

	// 第 4 変数初期値： i_COMPLETE_STAT


	final static String i_COMPLETE_STAT = null;

	// 第 5 変数初期値： i_ACCURACY_LEVEL_name


	final static String i_ACCURACY_LEVEL_name = null;

	// 第 6 変数初期値： i_ACCURACY_LEVEL_val


	final static String i_ACCURACY_LEVEL_val = null;

	// 第 7 変数初期値： i_OD_COMP_FLG


	final static String i_OD_COMP_FLG = null;

	// 第 8 変数初期値： i_PJ_CLASS_01_TYP


	final static String i_PJ_CLASS_01_TYP = null;

	// 第 9 変数初期値： i_PJ_CLASS_01_NAME


	final static String i_PJ_CLASS_01_NAME = null;

	// 第 10 変数初期値： i_PJ_CLASS_02_TYP


	final static String i_PJ_CLASS_02_TYP = null;

	// 第 11 変数初期値： i_PJ_CLASS_02_NAME


	final static String i_PJ_CLASS_02_NAME = null;

	// 第 12 変数初期値： i_PJ_CLASS_03_TYP


	final static String i_PJ_CLASS_03_TYP = null;

	// 第 13 変数初期値： i_PJ_CLASS_03_NAME


	final static String i_PJ_CLASS_03_NAME = null;

	// 第 14 変数初期値： i_PJ_CLASS_04_TYP


	final static String i_PJ_CLASS_04_TYP = null;

	// 第 15 変数初期値： i_PJ_CLASS_04_NAME


	final static String i_PJ_CLASS_04_NAME = null;

	// 第 16 変数初期値： i_PJ_CLASS_05_TYP


	final static String i_PJ_CLASS_05_TYP = null;

	// 第 17 変数初期値： i_PJ_CLASS_05_NAME


	final static String i_PJ_CLASS_05_NAME = null;

	// 第 18 変数初期値： i_PJ_CLASS_06_TYP


	final static String i_PJ_CLASS_06_TYP = null;

	// 第 19 変数初期値： i_PJ_CLASS_06_NAME


	final static String i_PJ_CLASS_06_NAME = null;

	// 第 20 変数初期値： i_PJ_CLASS_07_TYP


	final static String i_PJ_CLASS_07_TYP = null;

	// 第 21 変数初期値： i_PJ_CLASS_07_NAME


	final static String i_PJ_CLASS_07_NAME = null;

	// 第 22 変数初期値： i_PJ_CLASS_08_TYP


	final static String i_PJ_CLASS_08_TYP = null;

	// 第 23 変数初期値： i_PJ_CLASS_08_NAME


	final static String i_PJ_CLASS_08_NAME = null;

	// 第 24 変数初期値： i_PJ_CLASS_09_TYP


	final static String i_PJ_CLASS_09_TYP = null;

	// 第 25 変数初期値： i_PJ_CLASS_09_NAME


	final static String i_PJ_CLASS_09_NAME = null;

	// 第 26 変数初期値： i_PJ_CLASS_10_TYP


	final static String i_PJ_CLASS_10_TYP = null;

	// 第 27 変数初期値： i_PJ_CLASS_10_NAME


	final static String i_PJ_CLASS_10_NAME = null;

	// 第 28 変数初期値： i_PJ_CLASS_11_TYP


	final static String i_PJ_CLASS_11_TYP = null;

	// 第 29 変数初期値： i_PJ_CLASS_11_NAME


	final static String i_PJ_CLASS_11_NAME = null;

	// 第 30 変数初期値： i_PJ_CLASS_12_TYP


	final static String i_PJ_CLASS_12_TYP = null;

	// 第 31 変数初期値： i_PJ_CLASS_12_NAME


	final static String i_PJ_CLASS_12_NAME = null;

	// 第 32 変数初期値： i_PROJECT_CD_FLG


	final static String i_PROJECT_CD_FLG = null;

	// 第 33 変数初期値： i_h_PROJECT_STAT


	final static String i_h_PROJECT_STAT = null;

	// 第 34 変数初期値： i_h_ESTIMATE


	final static String i_h_ESTIMATE = null;

	// 第 35 変数初期値： i_h_COMPLETE_STAT


	final static String i_h_COMPLETE_STAT = null;

	// 第 36 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 37 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 38 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 39 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 40 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 41 変数初期値： i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// 第 42 変数初期値： i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// 第 43 変数初期値： i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// 第 44 変数初期値： i_PROJECT_STAT


	final static String i_PROJECT_STAT = null;

	// 第 45 変数初期値： i_ACCURACY_LEVEL


	final static String i_ACCURACY_LEVEL = null;

	// 第 46 変数初期値： i_Vend_Date


	final static String i_Vend_Date = null;

	// 第 47 変数初期値： i_AssumeDlv_date


	final static String i_AssumeDlv_date = null;

	// 第 48 変数初期値： i_AssumeAmount


	final static String i_AssumeAmount = null;

	// 第 49 変数初期値： i_ASSUME_AMOUNT_EXCH_RATES


	final static String i_ASSUME_AMOUNT_EXCH_RATES = null;

	// 第 50 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 51 変数初期値： i_PJ_ORG_CD


	final static String i_PJ_ORG_CD = null;

	// 第 52 変数初期値： i_PJ_USER_CD


	final static String i_PJ_USER_CD = null;

	// 第 53 変数初期値： i_REMARKS1


	final static String i_REMARKS1 = null;

	// 第 54 変数初期値： i_REMARKS2


	final static String i_REMARKS2 = null;

	// 第 55 変数初期値： i_REMARKS3


	final static String i_REMARKS3 = null;

	// 第 56 変数初期値： i_REMARKS4


	final static String i_REMARKS4 = null;

	// 第 57 変数初期値： i_REMARKS5


	final static String i_REMARKS5 = null;

	// 第 58 変数初期値： i_h_OD_COMP_FLG


	final static String i_h_OD_COMP_FLG = null;

	// 第 59 変数初期値： i_PJ_CLASS_01_CD


	final static String i_PJ_CLASS_01_CD = null;

	// 第 60 変数初期値： i_PJ_CLASS_02_CD


	final static String i_PJ_CLASS_02_CD = null;

	// 第 61 変数初期値： i_PJ_CLASS_03_CD


	final static String i_PJ_CLASS_03_CD = null;

	// 第 62 変数初期値： i_PJ_CLASS_04_CD


	final static String i_PJ_CLASS_04_CD = null;

	// 第 63 変数初期値： i_PJ_CLASS_05_CD


	final static String i_PJ_CLASS_05_CD = null;

	// 第 64 変数初期値： i_PJ_CLASS_06_CD


	final static String i_PJ_CLASS_06_CD = null;

	// 第 65 変数初期値： i_PJ_CLASS_07_CD


	final static String i_PJ_CLASS_07_CD = null;

	// 第 66 変数初期値： i_PJ_CLASS_08_CD


	final static String i_PJ_CLASS_08_CD = null;

	// 第 67 変数初期値： i_PJ_CLASS_09_CD


	final static String i_PJ_CLASS_09_CD = null;

	// 第 68 変数初期値： i_PJ_CLASS_10_CD


	final static String i_PJ_CLASS_10_CD = null;

	// 第 69 変数初期値： i_PJ_CLASS_11_CD


	final static String i_PJ_CLASS_11_CD = null;

	// 第 70 変数初期値： i_PJ_CLASS_12_CD


	final static String i_PJ_CLASS_12_CD = null;

	// 第 71 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 72 変数初期値： i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// 第 73 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 74 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 75 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 76 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 77 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 78 変数初期値： i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// 第 79 変数初期値： i_DETAL_NO


	final static String i_DETAL_NO = null;

	// 第 80 変数初期値： i_ODR_CMPLT_FLG


	final static String i_ODR_CMPLT_FLG = null;

	// 第 81 変数初期値： i_Auto_PROJECT_CD


	final static String i_Auto_PROJECT_CD = null;

	// 第 82 変数初期値： i_CurUnit


	final static String i_CurUnit = null;

	// 第 83 変数初期値： i_ESTIMATE_TYPE


	final static String i_ESTIMATE_TYPE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_h_PROJECT_CD

	final static String i_h_PROJECT_CD = null;

	// 第 2 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 3 変数初期値： i_PROJECT_STAT_name

	final static String i_PROJECT_STAT_name = null;

	// 第 4 変数初期値： i_PROJECT_STAT_val

	final static String i_PROJECT_STAT_val = null;

	// 第 5 変数初期値： i_COMPLETE_STAT

	final static String i_COMPLETE_STAT = null;

	// 第 6 変数初期値： i_ACCURACY_LEVEL_name

	final static String i_ACCURACY_LEVEL_name = null;

	// 第 7 変数初期値： i_ACCURACY_LEVEL_val

	final static String i_ACCURACY_LEVEL_val = null;

	// 第 8 変数初期値： i_CurUnit

	final static String i_CurUnit = null;

	// 第 9 変数初期値： i_DLV_LOC_NAME

	final static String i_DLV_LOC_NAME = null;

	// 第 10 変数初期値： i_ORG_NAME

	final static String i_ORG_NAME = null;

	// 第 11 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 12 変数初期値： i_PROJECT_CD_FLG

	final static String  i_PROJECT_CD_FLG = null;

	// 第 13 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 14 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 15 変数初期値： i_PROJECT_CD

	final static String i_PROJECT_CD = null;

	// 第 16 変数初期値： i_PROJECT_NAME

	final static String i_PROJECT_NAME = null;

	// 第 17 変数初期値： i_PROJECT_STAT

	final static String i_PROJECT_STAT = null;

	// 第 18 変数初期値： i_ACCURACY_LEVEL

	final static String i_ACCURACY_LEVEL = null;

	// 第 19 変数初期値： i_Vend_Date

	final static String i_Vend_Date = null;

	// 第 20 変数初期値： i_AssumeDlv_date

	final static String i_AssumeDlv_date = null;

	// 第 21 変数初期値： i_AssumeAmount

	final static String i_AssumeAmount = null;

	// 第 22 変数初期値： i_ASSUME_AMOUNT_EXCH_RATES

	final static String i_ASSUME_AMOUNT_EXCH_RATES = null;

	// 第 23 変数初期値： i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// 第 24 変数初期値： i_PJ_ORG_CD

	final static String i_PJ_ORG_CD = null;

	// 第 25 変数初期値： i_PJ_USER_CD

	final static String i_PJ_USER_CD = null;

	// 第 26 変数初期値： i_REMARKS1

	final static String i_REMARKS1 = null;

	// 第 27 変数初期値： i_REMARKS2

	final static String i_REMARKS2 = null;

	// 第 28 変数初期値： i_REMARKS3

	final static String i_REMARKS3 = null;

	// 第 29 変数初期値： i_REMARKS4

	final static String i_REMARKS4 = null;

	// 第 30 変数初期値： i_REMARKS5

	final static String i_REMARKS5 = null;

	// 第 31 変数初期値： i_OD_COMP_FLG

	final static String i_OD_COMP_FLG = null;

	// 第 32 変数初期値： i_PJ_CLASS_01_TYP

	final static String i_PJ_CLASS_01_TYP = null;

	// 第 33 変数初期値： i_PJ_CLASS_01_CD

	final static String i_PJ_CLASS_01_CD = null;

	// 第 34 変数初期値： i_PJ_CLASS_01_NAME

	final static String i_PJ_CLASS_01_NAME = null;

	// 第 35 変数初期値： i_PJ_CLASS_02_TYP

	final static String i_PJ_CLASS_02_TYP = null;

	// 第 36 変数初期値： i_PJ_CLASS_02_CD

	final static String i_PJ_CLASS_02_CD = null;

	// 第 37 変数初期値： i_PJ_CLASS_02_NAME

	final static String i_PJ_CLASS_02_NAME = null;

	// 第 38 変数初期値： i_PJ_CLASS_03_TYP

	final static String i_PJ_CLASS_03_TYP = null;

	// 第 39 変数初期値： i_PJ_CLASS_03_CD

	final static String i_PJ_CLASS_03_CD = null;

	// 第 40 変数初期値： i_PJ_CLASS_03_NAME

	final static String i_PJ_CLASS_03_NAME = null;

	// 第 41 変数初期値： i_PJ_CLASS_04_TYP

	final static String i_PJ_CLASS_04_TYP = null;

	// 第 42 変数初期値： i_PJ_CLASS_04_CD

	final static String i_PJ_CLASS_04_CD = null;

	// 第 43 変数初期値： i_PJ_CLASS_04_NAME

	final static String i_PJ_CLASS_04_NAME = null;

	// 第 44 変数初期値： i_PJ_CLASS_05_TYP

	final static String i_PJ_CLASS_05_TYP = null;

	// 第 45 変数初期値： i_PJ_CLASS_05_CD

	final static String i_PJ_CLASS_05_CD = null;

	// 第 46 変数初期値： i_PJ_CLASS_05_NAME

	final static String i_PJ_CLASS_05_NAME = null;

	// 第 47 変数初期値： i_PJ_CLASS_06_TYP

	final static String i_PJ_CLASS_06_TYP = null;

	// 第 48 変数初期値： i_PJ_CLASS_06_CD

	final static String i_PJ_CLASS_06_CD = null;

	// 第 49 変数初期値： i_PJ_CLASS_06_NAME

	final static String i_PJ_CLASS_06_NAME = null;

	// 第 50 変数初期値： i_PJ_CLASS_07_TYP

	final static String i_PJ_CLASS_07_TYP = null;

	// 第 51 変数初期値： i_PJ_CLASS_07_CD

	final static String i_PJ_CLASS_07_CD = null;

	// 第 52 変数初期値： i_PJ_CLASS_07_NAME

	final static String i_PJ_CLASS_07_NAME = null;

	// 第 53 変数初期値： i_PJ_CLASS_08_TYP

	final static String i_PJ_CLASS_08_TYP = null;

	// 第 54 変数初期値： i_PJ_CLASS_08_CD

	final static String i_PJ_CLASS_08_CD = null;

	// 第 55 変数初期値： i_PJ_CLASS_08_NAME

	final static String i_PJ_CLASS_08_NAME = null;

	// 第 56 変数初期値： i_PJ_CLASS_09_TYP

	final static String i_PJ_CLASS_09_TYP = null;

	// 第 57 変数初期値： i_PJ_CLASS_09_CD

	final static String i_PJ_CLASS_09_CD = null;

	// 第 58 変数初期値： i_PJ_CLASS_09_NAME

	final static String i_PJ_CLASS_09_NAME = null;

	// 第 59 変数初期値： i_PJ_CLASS_10_TYP

	final static String i_PJ_CLASS_10_TYP = null;

	// 第 60 変数初期値： i_PJ_CLASS_10_CD

	final static String i_PJ_CLASS_10_CD = null;

	// 第 61 変数初期値： i_PJ_CLASS_10_NAME

	final static String i_PJ_CLASS_10_NAME = null;

	// 第 62 変数初期値： i_PJ_CLASS_11_TYP

	final static String i_PJ_CLASS_11_TYP = null;

	// 第 63 変数初期値： i_PJ_CLASS_11_CD

	final static String i_PJ_CLASS_11_CD = null;

	// 第 64 変数初期値： i_PJ_CLASS_11_NAME

	final static String i_PJ_CLASS_11_NAME = null;

	// 第 65 変数初期値： i_PJ_CLASS_12_TYP

	final static String i_PJ_CLASS_12_TYP = null;

	// 第 66 変数初期値： i_PJ_CLASS_12_CD

	final static String i_PJ_CLASS_12_CD = null;

	// 第 67 変数初期値： i_PJ_CLASS_12_NAME

	final static String i_PJ_CLASS_12_NAME = null;

	// 第 68 変数初期値： i_ORG_CD

	final static String i_ORG_CD = null;

	// 第 69 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 70 変数初期値： i_ESTIMATE_NO

	final static String i_ESTIMATE_NO = null;

	// 第 71 変数初期値： i_DETAL_NO

	final static String i_DETAL_NO = null;

	// 第 72 変数初期値： i_ESTIMATE_TYPE

	final static String i_ESTIMATE_TYPE = null;

	// 第 73 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 74 変数初期値： i_ODR_CMPLT_FLG

	final static String i_ODR_CMPLT_FLG = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_h_PROJECT_CD = i_h_PROJECT_CD;
		m_CUST_NAME = i_CUST_NAME;
		m_PROJECT_STAT_name = i_PROJECT_STAT_name;
		m_PROJECT_STAT_val = i_PROJECT_STAT_val;
		m_COMPLETE_STAT = i_COMPLETE_STAT;
		m_ACCURACY_LEVEL_name = i_ACCURACY_LEVEL_name;
		m_ACCURACY_LEVEL_val = i_ACCURACY_LEVEL_val;
		m_CurUnit = i_CurUnit;
		m_DLV_LOC_NAME = i_DLV_LOC_NAME;
		m_ORG_NAME = i_ORG_NAME;
		m_USER_NAME = i_USER_NAME;
		m_PROJECT_CD_FLG = i_PROJECT_CD_FLG;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CUST_CD = i_CUST_CD;
		m_PROJECT_CD = i_PROJECT_CD;
		m_PROJECT_NAME = i_PROJECT_NAME;
		m_PROJECT_STAT = i_PROJECT_STAT;
		m_ACCURACY_LEVEL = i_ACCURACY_LEVEL;
		m_Vend_Date = i_Vend_Date;
		m_AssumeDlv_date = i_AssumeDlv_date;
		m_AssumeAmount = i_AssumeAmount;
		m_ASSUME_AMOUNT_EXCH_RATES = i_ASSUME_AMOUNT_EXCH_RATES;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_PJ_ORG_CD = i_PJ_ORG_CD;
		m_PJ_USER_CD = i_PJ_USER_CD;
		m_REMARKS1 = i_REMARKS1;
		m_REMARKS2 = i_REMARKS2;
		m_REMARKS3 = i_REMARKS3;
		m_REMARKS4 = i_REMARKS4;
		m_REMARKS5 = i_REMARKS5;
		m_OD_COMP_FLG = i_OD_COMP_FLG;
		m_PJ_CLASS_01_TYP = i_PJ_CLASS_01_TYP;
		m_PJ_CLASS_01_CD = i_PJ_CLASS_01_CD;
		m_PJ_CLASS_01_NAME = i_PJ_CLASS_01_NAME;
		m_PJ_CLASS_02_TYP = i_PJ_CLASS_02_TYP;
		m_PJ_CLASS_02_CD = i_PJ_CLASS_02_CD;
		m_PJ_CLASS_02_NAME = i_PJ_CLASS_02_NAME;
		m_PJ_CLASS_03_TYP = i_PJ_CLASS_03_TYP;
		m_PJ_CLASS_03_CD = i_PJ_CLASS_03_CD;
		m_PJ_CLASS_03_NAME = i_PJ_CLASS_03_NAME;
		m_PJ_CLASS_04_TYP = i_PJ_CLASS_04_TYP;
		m_PJ_CLASS_04_CD = i_PJ_CLASS_04_CD;
		m_PJ_CLASS_04_NAME = i_PJ_CLASS_04_NAME;
		m_PJ_CLASS_05_TYP = i_PJ_CLASS_05_TYP;
		m_PJ_CLASS_05_CD = i_PJ_CLASS_05_CD;
		m_PJ_CLASS_05_NAME = i_PJ_CLASS_05_NAME;
		m_PJ_CLASS_06_TYP = i_PJ_CLASS_06_TYP;
		m_PJ_CLASS_06_CD = i_PJ_CLASS_06_CD;
		m_PJ_CLASS_06_NAME = i_PJ_CLASS_06_NAME;
		m_PJ_CLASS_07_TYP = i_PJ_CLASS_07_TYP;
		m_PJ_CLASS_07_CD = i_PJ_CLASS_07_CD;
		m_PJ_CLASS_07_NAME = i_PJ_CLASS_07_NAME;
		m_PJ_CLASS_08_TYP = i_PJ_CLASS_08_TYP;
		m_PJ_CLASS_08_CD = i_PJ_CLASS_08_CD;
		m_PJ_CLASS_08_NAME = i_PJ_CLASS_08_NAME;
		m_PJ_CLASS_09_TYP = i_PJ_CLASS_09_TYP;
		m_PJ_CLASS_09_CD = i_PJ_CLASS_09_CD;
		m_PJ_CLASS_09_NAME = i_PJ_CLASS_09_NAME;
		m_PJ_CLASS_10_TYP = i_PJ_CLASS_10_TYP;
		m_PJ_CLASS_10_CD = i_PJ_CLASS_10_CD;
		m_PJ_CLASS_10_NAME = i_PJ_CLASS_10_NAME;
		m_PJ_CLASS_11_TYP = i_PJ_CLASS_11_TYP;
		m_PJ_CLASS_11_CD = i_PJ_CLASS_11_CD;
		m_PJ_CLASS_11_NAME = i_PJ_CLASS_11_NAME;
		m_PJ_CLASS_12_TYP = i_PJ_CLASS_12_TYP;
		m_PJ_CLASS_12_CD = i_PJ_CLASS_12_CD;
		m_PJ_CLASS_12_NAME = i_PJ_CLASS_12_NAME;
		m_ORG_CD = i_ORG_CD;
		m_USER_CD = i_USER_CD;
		m_ESTIMATE_NO = i_ESTIMATE_NO;
		m_DETAL_NO = i_DETAL_NO;
		m_ESTIMATE_TYPE = i_ESTIMATE_TYPE;
		m_ODR_NO = i_ODR_NO;
		m_ODR_CMPLT_FLG = i_ODR_CMPLT_FLG;
	}
	
	/**
	 * コピー
	 * @param struct コピー対象のStruct
	 */
	public void copy(KM0010010Struct struct){
    this.setPJ_CLASS_01_CD(struct.getPJ_CLASS_01_CD());
	this.setPJ_CLASS_02_CD(struct.getPJ_CLASS_02_CD());
	this.setPJ_CLASS_03_CD(struct.getPJ_CLASS_03_CD());
	this.setPJ_CLASS_04_CD(struct.getPJ_CLASS_04_CD());
	this.setPJ_CLASS_05_CD(struct.getPJ_CLASS_05_CD());
	this.setPJ_CLASS_06_CD(struct.getPJ_CLASS_06_CD());
	this.setPJ_CLASS_07_CD(struct.getPJ_CLASS_07_CD());
	this.setPJ_CLASS_08_CD(struct.getPJ_CLASS_08_CD());
	this.setPJ_CLASS_09_CD(struct.getPJ_CLASS_09_CD());
	this.setPJ_CLASS_10_CD(struct.getPJ_CLASS_10_CD());
	this.setPJ_CLASS_11_CD(struct.getPJ_CLASS_11_CD());
	this.setPJ_CLASS_12_CD(struct.getPJ_CLASS_12_CD());

	this.setPJ_CLASS_01_NAME(struct.getPJ_CLASS_01_NAME());
	this.setPJ_CLASS_02_NAME(struct.getPJ_CLASS_02_NAME());
	this.setPJ_CLASS_03_NAME(struct.getPJ_CLASS_03_NAME());
	this.setPJ_CLASS_04_NAME(struct.getPJ_CLASS_04_NAME());
	this.setPJ_CLASS_05_NAME(struct.getPJ_CLASS_05_NAME());
	this.setPJ_CLASS_06_NAME(struct.getPJ_CLASS_06_NAME());
	this.setPJ_CLASS_07_NAME(struct.getPJ_CLASS_07_NAME());
	this.setPJ_CLASS_08_NAME(struct.getPJ_CLASS_08_NAME());
	this.setPJ_CLASS_09_NAME(struct.getPJ_CLASS_09_NAME());
	this.setPJ_CLASS_10_NAME(struct.getPJ_CLASS_10_NAME());
	this.setPJ_CLASS_11_NAME(struct.getPJ_CLASS_11_NAME());
	this.setPJ_CLASS_12_NAME(struct.getPJ_CLASS_12_NAME());
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
