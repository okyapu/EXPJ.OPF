/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

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
 * CLASS     : KM0040010Control クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 03:14:59 $
 *
 */
//}}user_implement_code_header

public class KM0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_CHECK_1 */
	public String m_CHECK_1 = null;
	/** 第 2 変数： m_C1_PROJECT_STAT */
	public String m_C1_PROJECT_STAT = null;
	/** 第 3 変数： m_C2_PROJECT_STAT */
	public String m_C2_PROJECT_STAT = null;
	/** 第 4 変数： m_C3_PROJECT_STAT */
	public String m_C3_PROJECT_STAT = null;
	/** 第 5 変数： m_C4_PROJECT_STAT */
	public String m_C4_PROJECT_STAT = null;
	/** 第 6 変数： m_C5_PROJECT_STAT */
	public String m_C5_PROJECT_STAT = null;
	/** 第 7 変数： m_TXT_FILE */
	public String m_TXT_FILE = null;
	/** 第 8 変数： m_IN_PJ_USER_NAME */
	public String m_IN_PJ_USER_NAME = null;
	/** 第 9 変数： m_IN_ES_USER_NAME */
	public String m_IN_ES_USER_NAME = null;
	/** 第 10 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 11 変数： m_I_PROJECT_STAT */
	public String m_I_PROJECT_STAT = null;
	/** 第 12 変数： m_C6_PROJECT_STAT */
	public String m_C6_PROJECT_STAT = null;
	/** 第 13 変数： m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** 第 14 変数： m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** 第 15 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 16 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 17 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 18 変数： m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** 第 19 変数： m_ACCURACY */
	public String m_ACCURACY = null;
	/** 第 20 変数： m_PROJECT_STAT */
	public String m_PROJECT_STAT = null;
	/** 第 21 変数： m_VEND_DATE */
	public String m_VEND_DATE = null;
	/** 第 22 変数： m_ASSUME_DLV_DATE */
	public String m_ASSUME_DLV_DATE = null;
	/** 第 23 変数： m_ASSUME_AMOUNT */
	public String m_ASSUME_AMOUNT = null;
	/** 第 24 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 25 変数： m_ASSUME_AMOUNT_EXCH_RATES */
	public String m_ASSUME_AMOUNT_EXCH_RATES = null;
	/** 第 26 変数： m_PJ_ORG_CD */
	public String m_PJ_ORG_CD = null;
	/** 第 27 変数： m_ORG_NAME_1 */
	public String m_ORG_NAME_1 = null;
	/** 第 28 変数： m_PJ_USER_CD */
	public String m_PJ_USER_CD = null;
	/** 第 29 変数： m_USER_NAME_1 */
	public String m_USER_NAME_1 = null;
	/** 第 30 変数： m_REMARKS1 */
	public String m_REMARKS1 = null;
	/** 第 31 変数： m_REMARKS2 */
	public String m_REMARKS2 = null;
	/** 第 32 変数： m_REMARKS3 */
	public String m_REMARKS3 = null;
	/** 第 33 変数： m_REMARKS4 */
	public String m_REMARKS4 = null;
	/** 第 34 変数： m_REMARKS5 */
	public String m_REMARKS5 = null;
	/** 第 35 変数： m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** 第 36 変数： m_ESTIMATE_STAT */
	public String m_ESTIMATE_STAT = null;
	/** 第 37 変数： m_ESTIMATE_DATE */
	public String m_ESTIMATE_DATE = null;
	/** 第 38 変数： m_ES_COMMET1 */
	public String m_ES_COMMET1 = null;
	/** 第 39 変数： m_ES_COMMET2 */
	public String m_ES_COMMET2 = null;
	/** 第 40 変数： m_ES_COMMET3 */
	public String m_ES_COMMET3 = null;
	/** 第 41 変数： m_ES_COMMET4 */
	public String m_ES_COMMET4 = null;
	/** 第 42 変数： m_ES_COMMET5 */
	public String m_ES_COMMET5 = null;
	/** 第 43 変数： m_ES_ORG_CD */
	public String m_ES_ORG_CD = null;
	/** 第 44 変数： m_ORG_NAME_2 */
	public String m_ORG_NAME_2 = null;
	/** 第 45 変数： m_ES_USER_CD */
	public String m_ES_USER_CD = null;
	/** 第 46 変数： m_USER_NAME_2 */
	public String m_USER_NAME_2 = null;
	/** 第 47 変数： m_ESTIMATE_AMOUNT */
	public String m_ESTIMATE_AMOUNT = null;
	/** 第 48 変数： m_ESTIMATE_AMOUNT_JPN */
	public String m_ESTIMATE_AMOUNT_JPN = null;
	/** 第 49 変数： m_ESREMARK1 */
	public String m_ESREMARK1 = null;
	/** 第 50 変数： m_ESREMARK2 */
	public String m_ESREMARK2 = null;
	/** 第 51 変数： m_ESREMARK3 */
	public String m_ESREMARK3 = null;
	/** 第 52 変数： m_IN_PROJECT_CD */
	public String m_IN_PROJECT_CD = null;
	/** 第 53 変数： m_IN_CUST_CD */
	public String m_IN_CUST_CD = null;
	/** 第 54 変数： m_IN_PJ_USER_CD */
	public String m_IN_PJ_USER_CD = null;
	/** 第 55 変数： m_IN_ES_USER_CD */
	public String m_IN_ES_USER_CD = null;
	/** 第 56 変数： m_FROM_VEND_DATE */
	public String m_FROM_VEND_DATE = null;
	/** 第 57 変数： m_TO_VEND_DATE */
	public String m_TO_VEND_DATE = null;
	/** 第 58 変数： m_FROM_ASSUME_DLV_DATE */
	public String m_FROM_ASSUME_DLV_DATE = null;
	/** 第 59 変数： m_TO_ASSUME_DLV_DATE */
	public String m_TO_ASSUME_DLV_DATE = null;
	/** 第 60 変数： m_FROM_ESTIMATE_DATE */
	public String m_FROM_ESTIMATE_DATE = null;
	/** 第 61 変数： m_TO_ESTIMATE_DATE */
	public String m_TO_ESTIMATE_DATE = null;
	/** 第 62 変数： m_InC2_PROJECT_STAT */
	public String m_InC2_PROJECT_STAT = null;
	/** 第 63 変数： m_InC3_PROJECT_STAT */
	public String m_InC3_PROJECT_STAT = null;
	/** 第 64 変数： m_InC4_PROJECT_STAT */
	public String m_InC4_PROJECT_STAT = null;
	/** 第 65 変数： m_InC5_PROJECT_STAT */
	public String m_InC5_PROJECT_STAT = null;
	/** 第 66 変数： m_InC6_PROJECT_STAT */
	public String m_InC6_PROJECT_STAT = null;
	/** 第 67 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 68 変数： m_InC1_PROJECT_STAT */
	public String m_InC1_PROJECT_STAT = null;
	/** 第 69 変数： m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_CHECK_1 */
	public List l_CHECK_1 = null;

	/** 第 2 List変数： l_C1_PROJECT_STAT */
	public List l_C1_PROJECT_STAT = null;

	/** 第 3 List変数： l_C2_PROJECT_STAT */
	public List l_C2_PROJECT_STAT = null;

	/** 第 4 List変数： l_C3_PROJECT_STAT */
	public List l_C3_PROJECT_STAT = null;

	/** 第 5 List変数： l_C4_PROJECT_STAT */
	public List l_C4_PROJECT_STAT = null;

	/** 第 6 List変数： l_C5_PROJECT_STAT */
	public List l_C5_PROJECT_STAT = null;

	/** 第 7 List変数： l_TXT_FILE */
	public List l_TXT_FILE = null;

	/** 第 8 List変数： l_IN_PJ_USER_NAME */
	public List l_IN_PJ_USER_NAME = null;

	/** 第 9 List変数： l_IN_ES_USER_NAME */
	public List l_IN_ES_USER_NAME = null;

	/** 第 10 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 11 List変数： l_I_PROJECT_STAT */
	public List l_I_PROJECT_STAT = null;

	/** 第 12 List変数： l_C6_PROJECT_STAT */
	public List l_C6_PROJECT_STAT = null;

	/** 第 13 List変数： l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** 第 14 List変数： l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** 第 15 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 16 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 17 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 18 List変数： l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** 第 19 List変数： l_ACCURACY */
	public List l_ACCURACY = null;

	/** 第 20 List変数： l_PROJECT_STAT */
	public List l_PROJECT_STAT = null;

	/** 第 21 List変数： l_VEND_DATE */
	public List l_VEND_DATE = null;

	/** 第 22 List変数： l_ASSUME_DLV_DATE */
	public List l_ASSUME_DLV_DATE = null;

	/** 第 23 List変数： l_ASSUME_AMOUNT */
	public List l_ASSUME_AMOUNT = null;

	/** 第 24 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 25 List変数： l_ASSUME_AMOUNT_EXCH_RATES */
	public List l_ASSUME_AMOUNT_EXCH_RATES = null;

	/** 第 26 List変数： l_PJ_ORG_CD */
	public List l_PJ_ORG_CD = null;

	/** 第 27 List変数： l_ORG_NAME_1 */
	public List l_ORG_NAME_1 = null;

	/** 第 28 List変数： l_PJ_USER_CD */
	public List l_PJ_USER_CD = null;

	/** 第 29 List変数： l_USER_NAME_1 */
	public List l_USER_NAME_1 = null;

	/** 第 30 List変数： l_REMARKS1 */
	public List l_REMARKS1 = null;

	/** 第 31 List変数： l_REMARKS2 */
	public List l_REMARKS2 = null;

	/** 第 32 List変数： l_REMARKS3 */
	public List l_REMARKS3 = null;

	/** 第 33 List変数： l_REMARKS4 */
	public List l_REMARKS4 = null;

	/** 第 34 List変数： l_REMARKS5 */
	public List l_REMARKS5 = null;

	/** 第 35 List変数： l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** 第 36 List変数： l_ESTIMATE_STAT */
	public List l_ESTIMATE_STAT = null;

	/** 第 37 List変数： l_ESTIMATE_DATE */
	public List l_ESTIMATE_DATE = null;

	/** 第 38 List変数： l_ES_COMMET1 */
	public List l_ES_COMMET1 = null;

	/** 第 39 List変数： l_ES_COMMET2 */
	public List l_ES_COMMET2 = null;

	/** 第 40 List変数： l_ES_COMMET3 */
	public List l_ES_COMMET3 = null;

	/** 第 41 List変数： l_ES_COMMET4 */
	public List l_ES_COMMET4 = null;

	/** 第 42 List変数： l_ES_COMMET5 */
	public List l_ES_COMMET5 = null;

	/** 第 43 List変数： l_ES_ORG_CD */
	public List l_ES_ORG_CD = null;

	/** 第 44 List変数： l_ORG_NAME_2 */
	public List l_ORG_NAME_2 = null;

	/** 第 45 List変数： l_ES_USER_CD */
	public List l_ES_USER_CD = null;

	/** 第 46 List変数： l_USER_NAME_2 */
	public List l_USER_NAME_2 = null;

	/** 第 47 List変数： l_ESTIMATE_AMOUNT */
	public List l_ESTIMATE_AMOUNT = null;

	/** 第 48 List変数： l_ESTIMATE_AMOUNT_JPN */
	public List l_ESTIMATE_AMOUNT_JPN = null;

	/** 第 49 List変数： l_ESREMARK1 */
	public List l_ESREMARK1 = null;

	/** 第 50 List変数： l_ESREMARK2 */
	public List l_ESREMARK2 = null;

	/** 第 51 List変数： l_ESREMARK3 */
	public List l_ESREMARK3 = null;

	/** 第 52 List変数： l_IN_PROJECT_CD */
	public List l_IN_PROJECT_CD = null;

	/** 第 53 List変数： l_IN_CUST_CD */
	public List l_IN_CUST_CD = null;

	/** 第 54 List変数： l_IN_PJ_USER_CD */
	public List l_IN_PJ_USER_CD = null;

	/** 第 55 List変数： l_IN_ES_USER_CD */
	public List l_IN_ES_USER_CD = null;

	/** 第 56 List変数： l_FROM_VEND_DATE */
	public List l_FROM_VEND_DATE = null;

	/** 第 57 List変数： l_TO_VEND_DATE */
	public List l_TO_VEND_DATE = null;

	/** 第 58 List変数： l_FROM_ASSUME_DLV_DATE */
	public List l_FROM_ASSUME_DLV_DATE = null;

	/** 第 59 List変数： l_TO_ASSUME_DLV_DATE */
	public List l_TO_ASSUME_DLV_DATE = null;

	/** 第 60 List変数： l_FROM_ESTIMATE_DATE */
	public List l_FROM_ESTIMATE_DATE = null;

	/** 第 61 List変数： l_TO_ESTIMATE_DATE */
	public List l_TO_ESTIMATE_DATE = null;

	/** 第 62 List変数： l_InC2_PROJECT_STAT */
	public List l_InC2_PROJECT_STAT = null;

	/** 第 63 List変数： l_InC3_PROJECT_STAT */
	public List l_InC3_PROJECT_STAT = null;

	/** 第 64 List変数： l_InC4_PROJECT_STAT */
	public List l_InC4_PROJECT_STAT = null;

	/** 第 65 List変数： l_InC5_PROJECT_STAT */
	public List l_InC5_PROJECT_STAT = null;

	/** 第 66 List変数： l_InC6_PROJECT_STAT */
	public List l_InC6_PROJECT_STAT = null;

	/** 第 67 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 68 List変数： l_InC1_PROJECT_STAT */
	public List l_InC1_PROJECT_STAT = null;

	/** 第 69 List変数： l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getCHECK_1() { return m_CHECK_1; }
	public String getC1_PROJECT_STAT() { return m_C1_PROJECT_STAT; }
	public String getC2_PROJECT_STAT() { return m_C2_PROJECT_STAT; }
	public String getC3_PROJECT_STAT() { return m_C3_PROJECT_STAT; }
	public String getC4_PROJECT_STAT() { return m_C4_PROJECT_STAT; }
	public String getC5_PROJECT_STAT() { return m_C5_PROJECT_STAT; }
	public String getTXT_FILE() { return m_TXT_FILE; }
	public String getIN_PJ_USER_NAME() { return m_IN_PJ_USER_NAME; }
	public String getIN_ES_USER_NAME() { return m_IN_ES_USER_NAME; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getI_PROJECT_STAT() { return m_I_PROJECT_STAT; }
	public String getC6_PROJECT_STAT() { return m_C6_PROJECT_STAT; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getACCURACY() { return m_ACCURACY; }
	public String getPROJECT_STAT() { return m_PROJECT_STAT; }
	public String getVEND_DATE() { return m_VEND_DATE; }
	public String getASSUME_DLV_DATE() { return m_ASSUME_DLV_DATE; }
	public String getASSUME_AMOUNT() { return m_ASSUME_AMOUNT; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getASSUME_AMOUNT_EXCH_RATES() { return m_ASSUME_AMOUNT_EXCH_RATES; }
	public String getPJ_ORG_CD() { return m_PJ_ORG_CD; }
	public String getORG_NAME_1() { return m_ORG_NAME_1; }
	public String getPJ_USER_CD() { return m_PJ_USER_CD; }
	public String getUSER_NAME_1() { return m_USER_NAME_1; }
	public String getREMARKS1() { return m_REMARKS1; }
	public String getREMARKS2() { return m_REMARKS2; }
	public String getREMARKS3() { return m_REMARKS3; }
	public String getREMARKS4() { return m_REMARKS4; }
	public String getREMARKS5() { return m_REMARKS5; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getESTIMATE_STAT() { return m_ESTIMATE_STAT; }
	public String getESTIMATE_DATE() { return m_ESTIMATE_DATE; }
	public String getES_COMMET1() { return m_ES_COMMET1; }
	public String getES_COMMET2() { return m_ES_COMMET2; }
	public String getES_COMMET3() { return m_ES_COMMET3; }
	public String getES_COMMET4() { return m_ES_COMMET4; }
	public String getES_COMMET5() { return m_ES_COMMET5; }
	public String getES_ORG_CD() { return m_ES_ORG_CD; }
	public String getORG_NAME_2() { return m_ORG_NAME_2; }
	public String getES_USER_CD() { return m_ES_USER_CD; }
	public String getUSER_NAME_2() { return m_USER_NAME_2; }
	public String getESTIMATE_AMOUNT() { return m_ESTIMATE_AMOUNT; }
	public String getESTIMATE_AMOUNT_JPN() { return m_ESTIMATE_AMOUNT_JPN; }
	public String getESREMARK1() { return m_ESREMARK1; }
	public String getESREMARK2() { return m_ESREMARK2; }
	public String getESREMARK3() { return m_ESREMARK3; }
	public String getIN_PROJECT_CD() { return m_IN_PROJECT_CD; }
	public String getIN_CUST_CD() { return m_IN_CUST_CD; }
	public String getIN_PJ_USER_CD() { return m_IN_PJ_USER_CD; }
	public String getIN_ES_USER_CD() { return m_IN_ES_USER_CD; }
	public String getFROM_VEND_DATE() { return m_FROM_VEND_DATE; }
	public String getTO_VEND_DATE() { return m_TO_VEND_DATE; }
	public String getFROM_ASSUME_DLV_DATE() { return m_FROM_ASSUME_DLV_DATE; }
	public String getTO_ASSUME_DLV_DATE() { return m_TO_ASSUME_DLV_DATE; }
	public String getFROM_ESTIMATE_DATE() { return m_FROM_ESTIMATE_DATE; }
	public String getTO_ESTIMATE_DATE() { return m_TO_ESTIMATE_DATE; }
	public String getInC2_PROJECT_STAT() { return m_InC2_PROJECT_STAT; }
	public String getInC3_PROJECT_STAT() { return m_InC3_PROJECT_STAT; }
	public String getInC4_PROJECT_STAT() { return m_InC4_PROJECT_STAT; }
	public String getInC5_PROJECT_STAT() { return m_InC5_PROJECT_STAT; }
	public String getInC6_PROJECT_STAT() { return m_InC6_PROJECT_STAT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getInC1_PROJECT_STAT() { return m_InC1_PROJECT_STAT; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }

	public List getList_CHECK_1() { return l_CHECK_1; }
	public List getList_C1_PROJECT_STAT() { return l_C1_PROJECT_STAT; }
	public List getList_C2_PROJECT_STAT() { return l_C2_PROJECT_STAT; }
	public List getList_C3_PROJECT_STAT() { return l_C3_PROJECT_STAT; }
	public List getList_C4_PROJECT_STAT() { return l_C4_PROJECT_STAT; }
	public List getList_C5_PROJECT_STAT() { return l_C5_PROJECT_STAT; }
	public List getList_TXT_FILE() { return l_TXT_FILE; }
	public List getList_IN_PJ_USER_NAME() { return l_IN_PJ_USER_NAME; }
	public List getList_IN_ES_USER_NAME() { return l_IN_ES_USER_NAME; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_I_PROJECT_STAT() { return l_I_PROJECT_STAT; }
	public List getList_C6_PROJECT_STAT() { return l_C6_PROJECT_STAT; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_ACCURACY() { return l_ACCURACY; }
	public List getList_PROJECT_STAT() { return l_PROJECT_STAT; }
	public List getList_VEND_DATE() { return l_VEND_DATE; }
	public List getList_ASSUME_DLV_DATE() { return l_ASSUME_DLV_DATE; }
	public List getList_ASSUME_AMOUNT() { return l_ASSUME_AMOUNT; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_ASSUME_AMOUNT_EXCH_RATES() { return l_ASSUME_AMOUNT_EXCH_RATES; }
	public List getList_PJ_ORG_CD() { return l_PJ_ORG_CD; }
	public List getList_ORG_NAME_1() { return l_ORG_NAME_1; }
	public List getList_PJ_USER_CD() { return l_PJ_USER_CD; }
	public List getList_USER_NAME_1() { return l_USER_NAME_1; }
	public List getList_REMARKS1() { return l_REMARKS1; }
	public List getList_REMARKS2() { return l_REMARKS2; }
	public List getList_REMARKS3() { return l_REMARKS3; }
	public List getList_REMARKS4() { return l_REMARKS4; }
	public List getList_REMARKS5() { return l_REMARKS5; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_ESTIMATE_STAT() { return l_ESTIMATE_STAT; }
	public List getList_ESTIMATE_DATE() { return l_ESTIMATE_DATE; }
	public List getList_ES_COMMET1() { return l_ES_COMMET1; }
	public List getList_ES_COMMET2() { return l_ES_COMMET2; }
	public List getList_ES_COMMET3() { return l_ES_COMMET3; }
	public List getList_ES_COMMET4() { return l_ES_COMMET4; }
	public List getList_ES_COMMET5() { return l_ES_COMMET5; }
	public List getList_ES_ORG_CD() { return l_ES_ORG_CD; }
	public List getList_ORG_NAME_2() { return l_ORG_NAME_2; }
	public List getList_ES_USER_CD() { return l_ES_USER_CD; }
	public List getList_USER_NAME_2() { return l_USER_NAME_2; }
	public List getList_ESTIMATE_AMOUNT() { return l_ESTIMATE_AMOUNT; }
	public List getList_ESTIMATE_AMOUNT_JPN() { return l_ESTIMATE_AMOUNT_JPN; }
	public List getList_ESREMARK1() { return l_ESREMARK1; }
	public List getList_ESREMARK2() { return l_ESREMARK2; }
	public List getList_ESREMARK3() { return l_ESREMARK3; }
	public List getList_IN_PROJECT_CD() { return l_IN_PROJECT_CD; }
	public List getList_IN_CUST_CD() { return l_IN_CUST_CD; }
	public List getList_IN_PJ_USER_CD() { return l_IN_PJ_USER_CD; }
	public List getList_IN_ES_USER_CD() { return l_IN_ES_USER_CD; }
	public List getList_FROM_VEND_DATE() { return l_FROM_VEND_DATE; }
	public List getList_TO_VEND_DATE() { return l_TO_VEND_DATE; }
	public List getList_FROM_ASSUME_DLV_DATE() { return l_FROM_ASSUME_DLV_DATE; }
	public List getList_TO_ASSUME_DLV_DATE() { return l_TO_ASSUME_DLV_DATE; }
	public List getList_FROM_ESTIMATE_DATE() { return l_FROM_ESTIMATE_DATE; }
	public List getList_TO_ESTIMATE_DATE() { return l_TO_ESTIMATE_DATE; }
	public List getList_InC2_PROJECT_STAT() { return l_InC2_PROJECT_STAT; }
	public List getList_InC3_PROJECT_STAT() { return l_InC3_PROJECT_STAT; }
	public List getList_InC4_PROJECT_STAT() { return l_InC4_PROJECT_STAT; }
	public List getList_InC5_PROJECT_STAT() { return l_InC5_PROJECT_STAT; }
	public List getList_InC6_PROJECT_STAT() { return l_InC6_PROJECT_STAT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_InC1_PROJECT_STAT() { return l_InC1_PROJECT_STAT; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }

	public void setCHECK_1(String val) { m_CHECK_1 = val; }
	public void setC1_PROJECT_STAT(String val) { m_C1_PROJECT_STAT = val; }
	public void setC2_PROJECT_STAT(String val) { m_C2_PROJECT_STAT = val; }
	public void setC3_PROJECT_STAT(String val) { m_C3_PROJECT_STAT = val; }
	public void setC4_PROJECT_STAT(String val) { m_C4_PROJECT_STAT = val; }
	public void setC5_PROJECT_STAT(String val) { m_C5_PROJECT_STAT = val; }
	public void setTXT_FILE(String val) { m_TXT_FILE = val; }
	public void setIN_PJ_USER_NAME(String val) { m_IN_PJ_USER_NAME = val; }
	public void setIN_ES_USER_NAME(String val) { m_IN_ES_USER_NAME = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setI_PROJECT_STAT(String val) { m_I_PROJECT_STAT = val; }
	public void setC6_PROJECT_STAT(String val) { m_C6_PROJECT_STAT = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setACCURACY(String val) { m_ACCURACY = val; }
	public void setPROJECT_STAT(String val) { m_PROJECT_STAT = val; }
	public void setVEND_DATE(String val) { m_VEND_DATE = val; }
	public void setASSUME_DLV_DATE(String val) { m_ASSUME_DLV_DATE = val; }
	public void setASSUME_AMOUNT(String val) { m_ASSUME_AMOUNT = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setASSUME_AMOUNT_EXCH_RATES(String val) { m_ASSUME_AMOUNT_EXCH_RATES = val; }
	public void setPJ_ORG_CD(String val) { m_PJ_ORG_CD = val; }
	public void setORG_NAME_1(String val) { m_ORG_NAME_1 = val; }
	public void setPJ_USER_CD(String val) { m_PJ_USER_CD = val; }
	public void setUSER_NAME_1(String val) { m_USER_NAME_1 = val; }
	public void setREMARKS1(String val) { m_REMARKS1 = val; }
	public void setREMARKS2(String val) { m_REMARKS2 = val; }
	public void setREMARKS3(String val) { m_REMARKS3 = val; }
	public void setREMARKS4(String val) { m_REMARKS4 = val; }
	public void setREMARKS5(String val) { m_REMARKS5 = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setESTIMATE_STAT(String val) { m_ESTIMATE_STAT = val; }
	public void setESTIMATE_DATE(String val) { m_ESTIMATE_DATE = val; }
	public void setES_COMMET1(String val) { m_ES_COMMET1 = val; }
	public void setES_COMMET2(String val) { m_ES_COMMET2 = val; }
	public void setES_COMMET3(String val) { m_ES_COMMET3 = val; }
	public void setES_COMMET4(String val) { m_ES_COMMET4 = val; }
	public void setES_COMMET5(String val) { m_ES_COMMET5 = val; }
	public void setES_ORG_CD(String val) { m_ES_ORG_CD = val; }
	public void setORG_NAME_2(String val) { m_ORG_NAME_2 = val; }
	public void setES_USER_CD(String val) { m_ES_USER_CD = val; }
	public void setUSER_NAME_2(String val) { m_USER_NAME_2 = val; }
	public void setESTIMATE_AMOUNT(String val) { m_ESTIMATE_AMOUNT = val; }
	public void setESTIMATE_AMOUNT_JPN(String val) { m_ESTIMATE_AMOUNT_JPN = val; }
	public void setESREMARK1(String val) { m_ESREMARK1 = val; }
	public void setESREMARK2(String val) { m_ESREMARK2 = val; }
	public void setESREMARK3(String val) { m_ESREMARK3 = val; }
	public void setIN_PROJECT_CD(String val) { m_IN_PROJECT_CD = val; }
	public void setIN_CUST_CD(String val) { m_IN_CUST_CD = val; }
	public void setIN_PJ_USER_CD(String val) { m_IN_PJ_USER_CD = val; }
	public void setIN_ES_USER_CD(String val) { m_IN_ES_USER_CD = val; }
	public void setFROM_VEND_DATE(String val) { m_FROM_VEND_DATE = val; }
	public void setTO_VEND_DATE(String val) { m_TO_VEND_DATE = val; }
	public void setFROM_ASSUME_DLV_DATE(String val) { m_FROM_ASSUME_DLV_DATE = val; }
	public void setTO_ASSUME_DLV_DATE(String val) { m_TO_ASSUME_DLV_DATE = val; }
	public void setFROM_ESTIMATE_DATE(String val) { m_FROM_ESTIMATE_DATE = val; }
	public void setTO_ESTIMATE_DATE(String val) { m_TO_ESTIMATE_DATE = val; }
	public void setInC2_PROJECT_STAT(String val) { m_InC2_PROJECT_STAT = val; }
	public void setInC3_PROJECT_STAT(String val) { m_InC3_PROJECT_STAT = val; }
	public void setInC4_PROJECT_STAT(String val) { m_InC4_PROJECT_STAT = val; }
	public void setInC5_PROJECT_STAT(String val) { m_InC5_PROJECT_STAT = val; }
	public void setInC6_PROJECT_STAT(String val) { m_InC6_PROJECT_STAT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setInC1_PROJECT_STAT(String val) { m_InC1_PROJECT_STAT = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }


	public void setList_CHECK_1(List list) { l_CHECK_1 = list; }
	public void setList_C1_PROJECT_STAT(List list) { l_C1_PROJECT_STAT = list; }
	public void setList_C2_PROJECT_STAT(List list) { l_C2_PROJECT_STAT = list; }
	public void setList_C3_PROJECT_STAT(List list) { l_C3_PROJECT_STAT = list; }
	public void setList_C4_PROJECT_STAT(List list) { l_C4_PROJECT_STAT = list; }
	public void setList_C5_PROJECT_STAT(List list) { l_C5_PROJECT_STAT = list; }
	public void setList_TXT_FILE(List list) { l_TXT_FILE = list; }
	public void setList_IN_PJ_USER_NAME(List list) { l_IN_PJ_USER_NAME = list; }
	public void setList_IN_ES_USER_NAME(List list) { l_IN_ES_USER_NAME = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_I_PROJECT_STAT(List list) { l_I_PROJECT_STAT = list; }
	public void setList_C6_PROJECT_STAT(List list) { l_C6_PROJECT_STAT = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_ACCURACY(List list) { l_ACCURACY = list; }
	public void setList_PROJECT_STAT(List list) { l_PROJECT_STAT = list; }
	public void setList_VEND_DATE(List list) { l_VEND_DATE = list; }
	public void setList_ASSUME_DLV_DATE(List list) { l_ASSUME_DLV_DATE = list; }
	public void setList_ASSUME_AMOUNT(List list) { l_ASSUME_AMOUNT = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_ASSUME_AMOUNT_EXCH_RATES(List list) { l_ASSUME_AMOUNT_EXCH_RATES = list; }
	public void setList_PJ_ORG_CD(List list) { l_PJ_ORG_CD = list; }
	public void setList_ORG_NAME_1(List list) { l_ORG_NAME_1 = list; }
	public void setList_PJ_USER_CD(List list) { l_PJ_USER_CD = list; }
	public void setList_USER_NAME_1(List list) { l_USER_NAME_1 = list; }
	public void setList_REMARKS1(List list) { l_REMARKS1 = list; }
	public void setList_REMARKS2(List list) { l_REMARKS2 = list; }
	public void setList_REMARKS3(List list) { l_REMARKS3 = list; }
	public void setList_REMARKS4(List list) { l_REMARKS4 = list; }
	public void setList_REMARKS5(List list) { l_REMARKS5 = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_ESTIMATE_STAT(List list) { l_ESTIMATE_STAT = list; }
	public void setList_ESTIMATE_DATE(List list) { l_ESTIMATE_DATE = list; }
	public void setList_ES_COMMET1(List list) { l_ES_COMMET1 = list; }
	public void setList_ES_COMMET2(List list) { l_ES_COMMET2 = list; }
	public void setList_ES_COMMET3(List list) { l_ES_COMMET3 = list; }
	public void setList_ES_COMMET4(List list) { l_ES_COMMET4 = list; }
	public void setList_ES_COMMET5(List list) { l_ES_COMMET5 = list; }
	public void setList_ES_ORG_CD(List list) { l_ES_ORG_CD = list; }
	public void setList_ORG_NAME_2(List list) { l_ORG_NAME_2 = list; }
	public void setList_ES_USER_CD(List list) { l_ES_USER_CD = list; }
	public void setList_USER_NAME_2(List list) { l_USER_NAME_2 = list; }
	public void setList_ESTIMATE_AMOUNT(List list) { l_ESTIMATE_AMOUNT = list; }
	public void setList_ESTIMATE_AMOUNT_JPN(List list) { l_ESTIMATE_AMOUNT_JPN = list; }
	public void setList_ESREMARK1(List list) { l_ESREMARK1 = list; }
	public void setList_ESREMARK2(List list) { l_ESREMARK2 = list; }
	public void setList_ESREMARK3(List list) { l_ESREMARK3 = list; }
	public void setList_IN_PROJECT_CD(List list) { l_IN_PROJECT_CD = list; }
	public void setList_IN_CUST_CD(List list) { l_IN_CUST_CD = list; }
	public void setList_IN_PJ_USER_CD(List list) { l_IN_PJ_USER_CD = list; }
	public void setList_IN_ES_USER_CD(List list) { l_IN_ES_USER_CD = list; }
	public void setList_FROM_VEND_DATE(List list) { l_FROM_VEND_DATE = list; }
	public void setList_TO_VEND_DATE(List list) { l_TO_VEND_DATE = list; }
	public void setList_FROM_ASSUME_DLV_DATE(List list) { l_FROM_ASSUME_DLV_DATE = list; }
	public void setList_TO_ASSUME_DLV_DATE(List list) { l_TO_ASSUME_DLV_DATE = list; }
	public void setList_FROM_ESTIMATE_DATE(List list) { l_FROM_ESTIMATE_DATE = list; }
	public void setList_TO_ESTIMATE_DATE(List list) { l_TO_ESTIMATE_DATE = list; }
	public void setList_InC2_PROJECT_STAT(List list) { l_InC2_PROJECT_STAT = list; }
	public void setList_InC3_PROJECT_STAT(List list) { l_InC3_PROJECT_STAT = list; }
	public void setList_InC4_PROJECT_STAT(List list) { l_InC4_PROJECT_STAT = list; }
	public void setList_InC5_PROJECT_STAT(List list) { l_InC5_PROJECT_STAT = list; }
	public void setList_InC6_PROJECT_STAT(List list) { l_InC6_PROJECT_STAT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_InC1_PROJECT_STAT(List list) { l_InC1_PROJECT_STAT = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }

	public int setL2L_CHECK_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_1 == null) {
			l_CHECK_1 = new ArrayList();
		} else {
			l_CHECK_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_1.add(((KM0040010Struct) list.get(i)).getCHECK_1());
		}
		return size;
	}
	public int setL2L_C1_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C1_PROJECT_STAT == null) {
			l_C1_PROJECT_STAT = new ArrayList();
		} else {
			l_C1_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C1_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC1_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_C2_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C2_PROJECT_STAT == null) {
			l_C2_PROJECT_STAT = new ArrayList();
		} else {
			l_C2_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C2_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC2_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_C3_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C3_PROJECT_STAT == null) {
			l_C3_PROJECT_STAT = new ArrayList();
		} else {
			l_C3_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C3_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC3_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_C4_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C4_PROJECT_STAT == null) {
			l_C4_PROJECT_STAT = new ArrayList();
		} else {
			l_C4_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C4_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC4_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_C5_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C5_PROJECT_STAT == null) {
			l_C5_PROJECT_STAT = new ArrayList();
		} else {
			l_C5_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C5_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC5_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_TXT_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TXT_FILE == null) {
			l_TXT_FILE = new ArrayList();
		} else {
			l_TXT_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TXT_FILE.add(((KM0040010Struct) list.get(i)).getTXT_FILE());
		}
		return size;
	}
	public int setL2L_IN_PJ_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PJ_USER_NAME == null) {
			l_IN_PJ_USER_NAME = new ArrayList();
		} else {
			l_IN_PJ_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PJ_USER_NAME.add(((KM0040010Struct) list.get(i)).getIN_PJ_USER_NAME());
		}
		return size;
	}
	public int setL2L_IN_ES_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ES_USER_NAME == null) {
			l_IN_ES_USER_NAME = new ArrayList();
		} else {
			l_IN_ES_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ES_USER_NAME.add(((KM0040010Struct) list.get(i)).getIN_ES_USER_NAME());
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
			l_DOWNLOAD_FILE.add(((KM0040010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_I_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_I_PROJECT_STAT == null) {
			l_I_PROJECT_STAT = new ArrayList();
		} else {
			l_I_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_I_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getI_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_C6_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C6_PROJECT_STAT == null) {
			l_C6_PROJECT_STAT = new ArrayList();
		} else {
			l_C6_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C6_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getC6_PROJECT_STAT());
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
			l_PROJECT_CD.add(((KM0040010Struct) list.get(i)).getPROJECT_CD());
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
			l_PROJECT_NAME.add(((KM0040010Struct) list.get(i)).getPROJECT_NAME());
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
			l_CUST_CD.add(((KM0040010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_NAME.add(((KM0040010Struct) list.get(i)).getCUST_NAME());
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
			l_DLV_LOC_CD.add(((KM0040010Struct) list.get(i)).getDLV_LOC_CD());
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
			l_DLV_LOC_NAME.add(((KM0040010Struct) list.get(i)).getDLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_ACCURACY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCURACY == null) {
			l_ACCURACY = new ArrayList();
		} else {
			l_ACCURACY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCURACY.add(((KM0040010Struct) list.get(i)).getACCURACY());
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
			l_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getPROJECT_STAT());
		}
		return size;
	}
	public int setL2L_VEND_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_DATE == null) {
			l_VEND_DATE = new ArrayList();
		} else {
			l_VEND_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_DATE.add(((KM0040010Struct) list.get(i)).getVEND_DATE());
		}
		return size;
	}
	public int setL2L_ASSUME_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASSUME_DLV_DATE == null) {
			l_ASSUME_DLV_DATE = new ArrayList();
		} else {
			l_ASSUME_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASSUME_DLV_DATE.add(((KM0040010Struct) list.get(i)).getASSUME_DLV_DATE());
		}
		return size;
	}
	public int setL2L_ASSUME_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASSUME_AMOUNT == null) {
			l_ASSUME_AMOUNT = new ArrayList();
		} else {
			l_ASSUME_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASSUME_AMOUNT.add(((KM0040010Struct) list.get(i)).getASSUME_AMOUNT());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((KM0040010Struct) list.get(i)).getCUR_UNIT());
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
			l_ASSUME_AMOUNT_EXCH_RATES.add(((KM0040010Struct) list.get(i)).getASSUME_AMOUNT_EXCH_RATES());
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
			l_PJ_ORG_CD.add(((KM0040010Struct) list.get(i)).getPJ_ORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME_1 == null) {
			l_ORG_NAME_1 = new ArrayList();
		} else {
			l_ORG_NAME_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME_1.add(((KM0040010Struct) list.get(i)).getORG_NAME_1());
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
			l_PJ_USER_CD.add(((KM0040010Struct) list.get(i)).getPJ_USER_CD());
		}
		return size;
	}
	public int setL2L_USER_NAME_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME_1 == null) {
			l_USER_NAME_1 = new ArrayList();
		} else {
			l_USER_NAME_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME_1.add(((KM0040010Struct) list.get(i)).getUSER_NAME_1());
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
			l_REMARKS1.add(((KM0040010Struct) list.get(i)).getREMARKS1());
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
			l_REMARKS2.add(((KM0040010Struct) list.get(i)).getREMARKS2());
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
			l_REMARKS3.add(((KM0040010Struct) list.get(i)).getREMARKS3());
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
			l_REMARKS4.add(((KM0040010Struct) list.get(i)).getREMARKS4());
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
			l_REMARKS5.add(((KM0040010Struct) list.get(i)).getREMARKS5());
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
			l_ESTIMATE_NO.add(((KM0040010Struct) list.get(i)).getESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_ESTIMATE_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_STAT == null) {
			l_ESTIMATE_STAT = new ArrayList();
		} else {
			l_ESTIMATE_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_STAT.add(((KM0040010Struct) list.get(i)).getESTIMATE_STAT());
		}
		return size;
	}
	public int setL2L_ESTIMATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_DATE == null) {
			l_ESTIMATE_DATE = new ArrayList();
		} else {
			l_ESTIMATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_DATE.add(((KM0040010Struct) list.get(i)).getESTIMATE_DATE());
		}
		return size;
	}
	public int setL2L_ES_COMMET1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET1 == null) {
			l_ES_COMMET1 = new ArrayList();
		} else {
			l_ES_COMMET1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET1.add(((KM0040010Struct) list.get(i)).getES_COMMET1());
		}
		return size;
	}
	public int setL2L_ES_COMMET2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET2 == null) {
			l_ES_COMMET2 = new ArrayList();
		} else {
			l_ES_COMMET2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET2.add(((KM0040010Struct) list.get(i)).getES_COMMET2());
		}
		return size;
	}
	public int setL2L_ES_COMMET3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET3 == null) {
			l_ES_COMMET3 = new ArrayList();
		} else {
			l_ES_COMMET3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET3.add(((KM0040010Struct) list.get(i)).getES_COMMET3());
		}
		return size;
	}
	public int setL2L_ES_COMMET4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET4 == null) {
			l_ES_COMMET4 = new ArrayList();
		} else {
			l_ES_COMMET4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET4.add(((KM0040010Struct) list.get(i)).getES_COMMET4());
		}
		return size;
	}
	public int setL2L_ES_COMMET5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET5 == null) {
			l_ES_COMMET5 = new ArrayList();
		} else {
			l_ES_COMMET5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET5.add(((KM0040010Struct) list.get(i)).getES_COMMET5());
		}
		return size;
	}
	public int setL2L_ES_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_ORG_CD == null) {
			l_ES_ORG_CD = new ArrayList();
		} else {
			l_ES_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_ORG_CD.add(((KM0040010Struct) list.get(i)).getES_ORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME_2 == null) {
			l_ORG_NAME_2 = new ArrayList();
		} else {
			l_ORG_NAME_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME_2.add(((KM0040010Struct) list.get(i)).getORG_NAME_2());
		}
		return size;
	}
	public int setL2L_ES_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_USER_CD == null) {
			l_ES_USER_CD = new ArrayList();
		} else {
			l_ES_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_USER_CD.add(((KM0040010Struct) list.get(i)).getES_USER_CD());
		}
		return size;
	}
	public int setL2L_USER_NAME_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME_2 == null) {
			l_USER_NAME_2 = new ArrayList();
		} else {
			l_USER_NAME_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME_2.add(((KM0040010Struct) list.get(i)).getUSER_NAME_2());
		}
		return size;
	}
	public int setL2L_ESTIMATE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_AMOUNT == null) {
			l_ESTIMATE_AMOUNT = new ArrayList();
		} else {
			l_ESTIMATE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_AMOUNT.add(((KM0040010Struct) list.get(i)).getESTIMATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_ESTIMATE_AMOUNT_JPN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_AMOUNT_JPN == null) {
			l_ESTIMATE_AMOUNT_JPN = new ArrayList();
		} else {
			l_ESTIMATE_AMOUNT_JPN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_AMOUNT_JPN.add(((KM0040010Struct) list.get(i)).getESTIMATE_AMOUNT_JPN());
		}
		return size;
	}
	public int setL2L_ESREMARK1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK1 == null) {
			l_ESREMARK1 = new ArrayList();
		} else {
			l_ESREMARK1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK1.add(((KM0040010Struct) list.get(i)).getESREMARK1());
		}
		return size;
	}
	public int setL2L_ESREMARK2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK2 == null) {
			l_ESREMARK2 = new ArrayList();
		} else {
			l_ESREMARK2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK2.add(((KM0040010Struct) list.get(i)).getESREMARK2());
		}
		return size;
	}
	public int setL2L_ESREMARK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK3 == null) {
			l_ESREMARK3 = new ArrayList();
		} else {
			l_ESREMARK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK3.add(((KM0040010Struct) list.get(i)).getESREMARK3());
		}
		return size;
	}
	public int setL2L_IN_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PROJECT_CD == null) {
			l_IN_PROJECT_CD = new ArrayList();
		} else {
			l_IN_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PROJECT_CD.add(((KM0040010Struct) list.get(i)).getIN_PROJECT_CD());
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
			l_IN_CUST_CD.add(((KM0040010Struct) list.get(i)).getIN_CUST_CD());
		}
		return size;
	}
	public int setL2L_IN_PJ_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PJ_USER_CD == null) {
			l_IN_PJ_USER_CD = new ArrayList();
		} else {
			l_IN_PJ_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PJ_USER_CD.add(((KM0040010Struct) list.get(i)).getIN_PJ_USER_CD());
		}
		return size;
	}
	public int setL2L_IN_ES_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ES_USER_CD == null) {
			l_IN_ES_USER_CD = new ArrayList();
		} else {
			l_IN_ES_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ES_USER_CD.add(((KM0040010Struct) list.get(i)).getIN_ES_USER_CD());
		}
		return size;
	}
	public int setL2L_FROM_VEND_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_VEND_DATE == null) {
			l_FROM_VEND_DATE = new ArrayList();
		} else {
			l_FROM_VEND_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_VEND_DATE.add(((KM0040010Struct) list.get(i)).getFROM_VEND_DATE());
		}
		return size;
	}
	public int setL2L_TO_VEND_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_VEND_DATE == null) {
			l_TO_VEND_DATE = new ArrayList();
		} else {
			l_TO_VEND_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_VEND_DATE.add(((KM0040010Struct) list.get(i)).getTO_VEND_DATE());
		}
		return size;
	}
	public int setL2L_FROM_ASSUME_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ASSUME_DLV_DATE == null) {
			l_FROM_ASSUME_DLV_DATE = new ArrayList();
		} else {
			l_FROM_ASSUME_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ASSUME_DLV_DATE.add(((KM0040010Struct) list.get(i)).getFROM_ASSUME_DLV_DATE());
		}
		return size;
	}
	public int setL2L_TO_ASSUME_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ASSUME_DLV_DATE == null) {
			l_TO_ASSUME_DLV_DATE = new ArrayList();
		} else {
			l_TO_ASSUME_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ASSUME_DLV_DATE.add(((KM0040010Struct) list.get(i)).getTO_ASSUME_DLV_DATE());
		}
		return size;
	}
	public int setL2L_FROM_ESTIMATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ESTIMATE_DATE == null) {
			l_FROM_ESTIMATE_DATE = new ArrayList();
		} else {
			l_FROM_ESTIMATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ESTIMATE_DATE.add(((KM0040010Struct) list.get(i)).getFROM_ESTIMATE_DATE());
		}
		return size;
	}
	public int setL2L_TO_ESTIMATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ESTIMATE_DATE == null) {
			l_TO_ESTIMATE_DATE = new ArrayList();
		} else {
			l_TO_ESTIMATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ESTIMATE_DATE.add(((KM0040010Struct) list.get(i)).getTO_ESTIMATE_DATE());
		}
		return size;
	}
	public int setL2L_InC2_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC2_PROJECT_STAT == null) {
			l_InC2_PROJECT_STAT = new ArrayList();
		} else {
			l_InC2_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC2_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC2_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_InC3_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC3_PROJECT_STAT == null) {
			l_InC3_PROJECT_STAT = new ArrayList();
		} else {
			l_InC3_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC3_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC3_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_InC4_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC4_PROJECT_STAT == null) {
			l_InC4_PROJECT_STAT = new ArrayList();
		} else {
			l_InC4_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC4_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC4_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_InC5_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC5_PROJECT_STAT == null) {
			l_InC5_PROJECT_STAT = new ArrayList();
		} else {
			l_InC5_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC5_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC5_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_InC6_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC6_PROJECT_STAT == null) {
			l_InC6_PROJECT_STAT = new ArrayList();
		} else {
			l_InC6_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC6_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC6_PROJECT_STAT());
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
			l_ROW_COUNT.add(((KM0040010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_InC1_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InC1_PROJECT_STAT == null) {
			l_InC1_PROJECT_STAT = new ArrayList();
		} else {
			l_InC1_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InC1_PROJECT_STAT.add(((KM0040010Struct) list.get(i)).getInC1_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_strCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCOMPANY_CD == null) {
			l_strCOMPANY_CD = new ArrayList();
		} else {
			l_strCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCOMPANY_CD.add(((KM0040010Struct) list.get(i)).getstrCOMPANY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CHECK_1 = null;
		m_C1_PROJECT_STAT = null;
		m_C2_PROJECT_STAT = null;
		m_C3_PROJECT_STAT = null;
		m_C4_PROJECT_STAT = null;
		m_C5_PROJECT_STAT = null;
		m_TXT_FILE = null;
		m_IN_PJ_USER_NAME = null;
		m_IN_ES_USER_NAME = null;
		m_DOWNLOAD_FILE = null;
		m_I_PROJECT_STAT = null;
		m_C6_PROJECT_STAT = null;
		m_PROJECT_CD = null;
		m_PROJECT_NAME = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME = null;
		m_ACCURACY = null;
		m_PROJECT_STAT = null;
		m_VEND_DATE = null;
		m_ASSUME_DLV_DATE = null;
		m_ASSUME_AMOUNT = null;
		m_CUR_UNIT = null;
		m_ASSUME_AMOUNT_EXCH_RATES = null;
		m_PJ_ORG_CD = null;
		m_ORG_NAME_1 = null;
		m_PJ_USER_CD = null;
		m_USER_NAME_1 = null;
		m_REMARKS1 = null;
		m_REMARKS2 = null;
		m_REMARKS3 = null;
		m_REMARKS4 = null;
		m_REMARKS5 = null;
		m_ESTIMATE_NO = null;
		m_ESTIMATE_STAT = null;
		m_ESTIMATE_DATE = null;
		m_ES_COMMET1 = null;
		m_ES_COMMET2 = null;
		m_ES_COMMET3 = null;
		m_ES_COMMET4 = null;
		m_ES_COMMET5 = null;
		m_ES_ORG_CD = null;
		m_ORG_NAME_2 = null;
		m_ES_USER_CD = null;
		m_USER_NAME_2 = null;
		m_ESTIMATE_AMOUNT = null;
		m_ESTIMATE_AMOUNT_JPN = null;
		m_ESREMARK1 = null;
		m_ESREMARK2 = null;
		m_ESREMARK3 = null;
		m_IN_PROJECT_CD = null;
		m_IN_CUST_CD = null;
		m_IN_PJ_USER_CD = null;
		m_IN_ES_USER_CD = null;
		m_FROM_VEND_DATE = null;
		m_TO_VEND_DATE = null;
		m_FROM_ASSUME_DLV_DATE = null;
		m_TO_ASSUME_DLV_DATE = null;
		m_FROM_ESTIMATE_DATE = null;
		m_TO_ESTIMATE_DATE = null;
		m_InC2_PROJECT_STAT = null;
		m_InC3_PROJECT_STAT = null;
		m_InC4_PROJECT_STAT = null;
		m_InC5_PROJECT_STAT = null;
		m_InC6_PROJECT_STAT = null;
		m_ROW_COUNT = null;
		m_InC1_PROJECT_STAT = null;
		m_strCOMPANY_CD = null;

		l_CHECK_1 = null;
		l_C1_PROJECT_STAT = null;
		l_C2_PROJECT_STAT = null;
		l_C3_PROJECT_STAT = null;
		l_C4_PROJECT_STAT = null;
		l_C5_PROJECT_STAT = null;
		l_TXT_FILE = null;
		l_IN_PJ_USER_NAME = null;
		l_IN_ES_USER_NAME = null;
		l_DOWNLOAD_FILE = null;
		l_I_PROJECT_STAT = null;
		l_C6_PROJECT_STAT = null;
		l_PROJECT_CD = null;
		l_PROJECT_NAME = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_DLV_LOC_CD = null;
		l_DLV_LOC_NAME = null;
		l_ACCURACY = null;
		l_PROJECT_STAT = null;
		l_VEND_DATE = null;
		l_ASSUME_DLV_DATE = null;
		l_ASSUME_AMOUNT = null;
		l_CUR_UNIT = null;
		l_ASSUME_AMOUNT_EXCH_RATES = null;
		l_PJ_ORG_CD = null;
		l_ORG_NAME_1 = null;
		l_PJ_USER_CD = null;
		l_USER_NAME_1 = null;
		l_REMARKS1 = null;
		l_REMARKS2 = null;
		l_REMARKS3 = null;
		l_REMARKS4 = null;
		l_REMARKS5 = null;
		l_ESTIMATE_NO = null;
		l_ESTIMATE_STAT = null;
		l_ESTIMATE_DATE = null;
		l_ES_COMMET1 = null;
		l_ES_COMMET2 = null;
		l_ES_COMMET3 = null;
		l_ES_COMMET4 = null;
		l_ES_COMMET5 = null;
		l_ES_ORG_CD = null;
		l_ORG_NAME_2 = null;
		l_ES_USER_CD = null;
		l_USER_NAME_2 = null;
		l_ESTIMATE_AMOUNT = null;
		l_ESTIMATE_AMOUNT_JPN = null;
		l_ESREMARK1 = null;
		l_ESREMARK2 = null;
		l_ESREMARK3 = null;
		l_IN_PROJECT_CD = null;
		l_IN_CUST_CD = null;
		l_IN_PJ_USER_CD = null;
		l_IN_ES_USER_CD = null;
		l_FROM_VEND_DATE = null;
		l_TO_VEND_DATE = null;
		l_FROM_ASSUME_DLV_DATE = null;
		l_TO_ASSUME_DLV_DATE = null;
		l_FROM_ESTIMATE_DATE = null;
		l_TO_ESTIMATE_DATE = null;
		l_InC2_PROJECT_STAT = null;
		l_InC3_PROJECT_STAT = null;
		l_InC4_PROJECT_STAT = null;
		l_InC5_PROJECT_STAT = null;
		l_InC6_PROJECT_STAT = null;
		l_ROW_COUNT = null;
		l_InC1_PROJECT_STAT = null;
		l_strCOMPANY_CD = null;

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
	 * medKM0040010クラスの標準コンストラクタ
	 */
	public KM0040010Struct()
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
	public void setStruct(KM0040010Struct struct)
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
	public void setStructM(KM0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCHECK_1(struct.getCHECK_1());
			this.setC1_PROJECT_STAT(struct.getC1_PROJECT_STAT());
			this.setC2_PROJECT_STAT(struct.getC2_PROJECT_STAT());
			this.setC3_PROJECT_STAT(struct.getC3_PROJECT_STAT());
			this.setC4_PROJECT_STAT(struct.getC4_PROJECT_STAT());
			this.setC5_PROJECT_STAT(struct.getC5_PROJECT_STAT());
			this.setTXT_FILE(struct.getTXT_FILE());
			this.setIN_PJ_USER_NAME(struct.getIN_PJ_USER_NAME());
			this.setIN_ES_USER_NAME(struct.getIN_ES_USER_NAME());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setI_PROJECT_STAT(struct.getI_PROJECT_STAT());
			this.setC6_PROJECT_STAT(struct.getC6_PROJECT_STAT());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setACCURACY(struct.getACCURACY());
			this.setPROJECT_STAT(struct.getPROJECT_STAT());
			this.setVEND_DATE(struct.getVEND_DATE());
			this.setASSUME_DLV_DATE(struct.getASSUME_DLV_DATE());
			this.setASSUME_AMOUNT(struct.getASSUME_AMOUNT());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setASSUME_AMOUNT_EXCH_RATES(struct.getASSUME_AMOUNT_EXCH_RATES());
			this.setPJ_ORG_CD(struct.getPJ_ORG_CD());
			this.setORG_NAME_1(struct.getORG_NAME_1());
			this.setPJ_USER_CD(struct.getPJ_USER_CD());
			this.setUSER_NAME_1(struct.getUSER_NAME_1());
			this.setREMARKS1(struct.getREMARKS1());
			this.setREMARKS2(struct.getREMARKS2());
			this.setREMARKS3(struct.getREMARKS3());
			this.setREMARKS4(struct.getREMARKS4());
			this.setREMARKS5(struct.getREMARKS5());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setESTIMATE_STAT(struct.getESTIMATE_STAT());
			this.setESTIMATE_DATE(struct.getESTIMATE_DATE());
			this.setES_COMMET1(struct.getES_COMMET1());
			this.setES_COMMET2(struct.getES_COMMET2());
			this.setES_COMMET3(struct.getES_COMMET3());
			this.setES_COMMET4(struct.getES_COMMET4());
			this.setES_COMMET5(struct.getES_COMMET5());
			this.setES_ORG_CD(struct.getES_ORG_CD());
			this.setORG_NAME_2(struct.getORG_NAME_2());
			this.setES_USER_CD(struct.getES_USER_CD());
			this.setUSER_NAME_2(struct.getUSER_NAME_2());
			this.setESTIMATE_AMOUNT(struct.getESTIMATE_AMOUNT());
			this.setESTIMATE_AMOUNT_JPN(struct.getESTIMATE_AMOUNT_JPN());
			this.setESREMARK1(struct.getESREMARK1());
			this.setESREMARK2(struct.getESREMARK2());
			this.setESREMARK3(struct.getESREMARK3());
			this.setIN_PROJECT_CD(struct.getIN_PROJECT_CD());
			this.setIN_CUST_CD(struct.getIN_CUST_CD());
			this.setIN_PJ_USER_CD(struct.getIN_PJ_USER_CD());
			this.setIN_ES_USER_CD(struct.getIN_ES_USER_CD());
			this.setFROM_VEND_DATE(struct.getFROM_VEND_DATE());
			this.setTO_VEND_DATE(struct.getTO_VEND_DATE());
			this.setFROM_ASSUME_DLV_DATE(struct.getFROM_ASSUME_DLV_DATE());
			this.setTO_ASSUME_DLV_DATE(struct.getTO_ASSUME_DLV_DATE());
			this.setFROM_ESTIMATE_DATE(struct.getFROM_ESTIMATE_DATE());
			this.setTO_ESTIMATE_DATE(struct.getTO_ESTIMATE_DATE());
			this.setInC2_PROJECT_STAT(struct.getInC2_PROJECT_STAT());
			this.setInC3_PROJECT_STAT(struct.getInC3_PROJECT_STAT());
			this.setInC4_PROJECT_STAT(struct.getInC4_PROJECT_STAT());
			this.setInC5_PROJECT_STAT(struct.getInC5_PROJECT_STAT());
			this.setInC6_PROJECT_STAT(struct.getInC6_PROJECT_STAT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setInC1_PROJECT_STAT(struct.getInC1_PROJECT_STAT());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KM0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CHECK_1(struct.getList_CHECK_1());
			this.setList_C1_PROJECT_STAT(struct.getList_C1_PROJECT_STAT());
			this.setList_C2_PROJECT_STAT(struct.getList_C2_PROJECT_STAT());
			this.setList_C3_PROJECT_STAT(struct.getList_C3_PROJECT_STAT());
			this.setList_C4_PROJECT_STAT(struct.getList_C4_PROJECT_STAT());
			this.setList_C5_PROJECT_STAT(struct.getList_C5_PROJECT_STAT());
			this.setList_TXT_FILE(struct.getList_TXT_FILE());
			this.setList_IN_PJ_USER_NAME(struct.getList_IN_PJ_USER_NAME());
			this.setList_IN_ES_USER_NAME(struct.getList_IN_ES_USER_NAME());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_I_PROJECT_STAT(struct.getList_I_PROJECT_STAT());
			this.setList_C6_PROJECT_STAT(struct.getList_C6_PROJECT_STAT());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_ACCURACY(struct.getList_ACCURACY());
			this.setList_PROJECT_STAT(struct.getList_PROJECT_STAT());
			this.setList_VEND_DATE(struct.getList_VEND_DATE());
			this.setList_ASSUME_DLV_DATE(struct.getList_ASSUME_DLV_DATE());
			this.setList_ASSUME_AMOUNT(struct.getList_ASSUME_AMOUNT());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_ASSUME_AMOUNT_EXCH_RATES(struct.getList_ASSUME_AMOUNT_EXCH_RATES());
			this.setList_PJ_ORG_CD(struct.getList_PJ_ORG_CD());
			this.setList_ORG_NAME_1(struct.getList_ORG_NAME_1());
			this.setList_PJ_USER_CD(struct.getList_PJ_USER_CD());
			this.setList_USER_NAME_1(struct.getList_USER_NAME_1());
			this.setList_REMARKS1(struct.getList_REMARKS1());
			this.setList_REMARKS2(struct.getList_REMARKS2());
			this.setList_REMARKS3(struct.getList_REMARKS3());
			this.setList_REMARKS4(struct.getList_REMARKS4());
			this.setList_REMARKS5(struct.getList_REMARKS5());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_ESTIMATE_STAT(struct.getList_ESTIMATE_STAT());
			this.setList_ESTIMATE_DATE(struct.getList_ESTIMATE_DATE());
			this.setList_ES_COMMET1(struct.getList_ES_COMMET1());
			this.setList_ES_COMMET2(struct.getList_ES_COMMET2());
			this.setList_ES_COMMET3(struct.getList_ES_COMMET3());
			this.setList_ES_COMMET4(struct.getList_ES_COMMET4());
			this.setList_ES_COMMET5(struct.getList_ES_COMMET5());
			this.setList_ES_ORG_CD(struct.getList_ES_ORG_CD());
			this.setList_ORG_NAME_2(struct.getList_ORG_NAME_2());
			this.setList_ES_USER_CD(struct.getList_ES_USER_CD());
			this.setList_USER_NAME_2(struct.getList_USER_NAME_2());
			this.setList_ESTIMATE_AMOUNT(struct.getList_ESTIMATE_AMOUNT());
			this.setList_ESTIMATE_AMOUNT_JPN(struct.getList_ESTIMATE_AMOUNT_JPN());
			this.setList_ESREMARK1(struct.getList_ESREMARK1());
			this.setList_ESREMARK2(struct.getList_ESREMARK2());
			this.setList_ESREMARK3(struct.getList_ESREMARK3());
			this.setList_IN_PROJECT_CD(struct.getList_IN_PROJECT_CD());
			this.setList_IN_CUST_CD(struct.getList_IN_CUST_CD());
			this.setList_IN_PJ_USER_CD(struct.getList_IN_PJ_USER_CD());
			this.setList_IN_ES_USER_CD(struct.getList_IN_ES_USER_CD());
			this.setList_FROM_VEND_DATE(struct.getList_FROM_VEND_DATE());
			this.setList_TO_VEND_DATE(struct.getList_TO_VEND_DATE());
			this.setList_FROM_ASSUME_DLV_DATE(struct.getList_FROM_ASSUME_DLV_DATE());
			this.setList_TO_ASSUME_DLV_DATE(struct.getList_TO_ASSUME_DLV_DATE());
			this.setList_FROM_ESTIMATE_DATE(struct.getList_FROM_ESTIMATE_DATE());
			this.setList_TO_ESTIMATE_DATE(struct.getList_TO_ESTIMATE_DATE());
			this.setList_InC2_PROJECT_STAT(struct.getList_InC2_PROJECT_STAT());
			this.setList_InC3_PROJECT_STAT(struct.getList_InC3_PROJECT_STAT());
			this.setList_InC4_PROJECT_STAT(struct.getList_InC4_PROJECT_STAT());
			this.setList_InC5_PROJECT_STAT(struct.getList_InC5_PROJECT_STAT());
			this.setList_InC6_PROJECT_STAT(struct.getList_InC6_PROJECT_STAT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_InC1_PROJECT_STAT(struct.getList_InC1_PROJECT_STAT());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
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
	// 第 1 変数初期値： i_CHECK_1


	final static String i_CHECK_1 = null;

	// 第 2 変数初期値： i_C1_PROJECT_STAT


	final static String i_C1_PROJECT_STAT = null;

	// 第 3 変数初期値： i_C2_PROJECT_STAT


	final static String i_C2_PROJECT_STAT = null;

	// 第 4 変数初期値： i_C3_PROJECT_STAT


	final static String i_C3_PROJECT_STAT = null;

	// 第 5 変数初期値： i_C4_PROJECT_STAT


	final static String i_C4_PROJECT_STAT = null;

	// 第 6 変数初期値： i_C5_PROJECT_STAT


	final static String i_C5_PROJECT_STAT = null;

	// 第 7 変数初期値： i_TXT_FILE


	final static String i_TXT_FILE = null;

	// 第 8 変数初期値： i_IN_PJ_USER_NAME


	final static String i_IN_PJ_USER_NAME = null;

	// 第 9 変数初期値： i_IN_ES_USER_NAME


	final static String i_IN_ES_USER_NAME = null;

	// 第 10 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 11 変数初期値： i_I_PROJECT_STAT


	final static String i_I_PROJECT_STAT = null;

	// 第 12 変数初期値： i_C6_PROJECT_STAT


	final static String i_C6_PROJECT_STAT = null;

	// 第 13 変数初期値： i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// 第 14 変数初期値： i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// 第 15 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 16 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 17 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 18 変数初期値： i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// 第 19 変数初期値： i_ACCURACY


	final static String i_ACCURACY = null;

	// 第 20 変数初期値： i_PROJECT_STAT


	final static String i_PROJECT_STAT = null;

	// 第 21 変数初期値： i_VEND_DATE


	final static String i_VEND_DATE = null;

	// 第 22 変数初期値： i_ASSUME_DLV_DATE


	final static String i_ASSUME_DLV_DATE = null;

	// 第 23 変数初期値： i_ASSUME_AMOUNT


	final static String i_ASSUME_AMOUNT = null;

	// 第 24 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 25 変数初期値： i_ASSUME_AMOUNT_EXCH_RATES


	final static String i_ASSUME_AMOUNT_EXCH_RATES = null;

	// 第 26 変数初期値： i_PJ_ORG_CD


	final static String i_PJ_ORG_CD = null;

	// 第 27 変数初期値： i_ORG_NAME_1


	final static String i_ORG_NAME_1 = null;

	// 第 28 変数初期値： i_PJ_USER_CD


	final static String i_PJ_USER_CD = null;

	// 第 29 変数初期値： i_USER_NAME_1


	final static String i_USER_NAME_1 = null;

	// 第 30 変数初期値： i_REMARKS1


	final static String i_REMARKS1 = null;

	// 第 31 変数初期値： i_REMARKS2


	final static String i_REMARKS2 = null;

	// 第 32 変数初期値： i_REMARKS3


	final static String i_REMARKS3 = null;

	// 第 33 変数初期値： i_REMARKS4


	final static String i_REMARKS4 = null;

	// 第 34 変数初期値： i_REMARKS5


	final static String i_REMARKS5 = null;

	// 第 35 変数初期値： i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// 第 36 変数初期値： i_ESTIMATE_STAT


	final static String i_ESTIMATE_STAT = null;

	// 第 37 変数初期値： i_ESTIMATE_DATE


	final static String i_ESTIMATE_DATE = null;

	// 第 38 変数初期値： i_ES_COMMET1


	final static String i_ES_COMMET1 = null;

	// 第 39 変数初期値： i_ES_COMMET2


	final static String i_ES_COMMET2 = null;

	// 第 40 変数初期値： i_ES_COMMET3


	final static String i_ES_COMMET3 = null;

	// 第 41 変数初期値： i_ES_COMMET4


	final static String i_ES_COMMET4 = null;

	// 第 42 変数初期値： i_ES_COMMET5


	final static String i_ES_COMMET5 = null;

	// 第 43 変数初期値： i_ES_ORG_CD


	final static String i_ES_ORG_CD = null;

	// 第 44 変数初期値： i_ORG_NAME_2


	final static String i_ORG_NAME_2 = null;

	// 第 45 変数初期値： i_ES_USER_CD


	final static String i_ES_USER_CD = null;

	// 第 46 変数初期値： i_USER_NAME_2


	final static String i_USER_NAME_2 = null;

	// 第 47 変数初期値： i_ESTIMATE_AMOUNT


	final static String i_ESTIMATE_AMOUNT = null;

	// 第 48 変数初期値： i_ESTIMATE_AMOUNT_JPN


	final static String i_ESTIMATE_AMOUNT_JPN = null;

	// 第 49 変数初期値： i_ESREMARK1


	final static String i_ESREMARK1 = null;

	// 第 50 変数初期値： i_ESREMARK2


	final static String i_ESREMARK2 = null;

	// 第 51 変数初期値： i_ESREMARK3


	final static String i_ESREMARK3 = null;

	// 第 52 変数初期値： i_IN_PROJECT_CD


	final static String i_IN_PROJECT_CD = null;

	// 第 53 変数初期値： i_IN_CUST_CD


	final static String i_IN_CUST_CD = null;

	// 第 54 変数初期値： i_IN_PJ_USER_CD


	final static String i_IN_PJ_USER_CD = null;

	// 第 55 変数初期値： i_IN_ES_USER_CD


	final static String i_IN_ES_USER_CD = null;

	// 第 56 変数初期値： i_FROM_VEND_DATE


	final static String i_FROM_VEND_DATE = null;

	// 第 57 変数初期値： i_TO_VEND_DATE


	final static String i_TO_VEND_DATE = null;

	// 第 58 変数初期値： i_FROM_ASSUME_DLV_DATE


	final static String i_FROM_ASSUME_DLV_DATE = null;

	// 第 59 変数初期値： i_TO_ASSUME_DLV_DATE


	final static String i_TO_ASSUME_DLV_DATE = null;

	// 第 60 変数初期値： i_FROM_ESTIMATE_DATE


	final static String i_FROM_ESTIMATE_DATE = null;

	// 第 61 変数初期値： i_TO_ESTIMATE_DATE


	final static String i_TO_ESTIMATE_DATE = null;

	// 第 62 変数初期値： i_InC2_PROJECT_STAT


	final static String i_InC2_PROJECT_STAT = null;

	// 第 63 変数初期値： i_InC3_PROJECT_STAT


	final static String i_InC3_PROJECT_STAT = null;

	// 第 64 変数初期値： i_InC4_PROJECT_STAT


	final static String i_InC4_PROJECT_STAT = null;

	// 第 65 変数初期値： i_InC5_PROJECT_STAT


	final static String i_InC5_PROJECT_STAT = null;

	// 第 66 変数初期値： i_InC6_PROJECT_STAT


	final static String i_InC6_PROJECT_STAT = null;

	// 第 67 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 68 変数初期値： i_InC1_PROJECT_STAT


	final static String i_InC1_PROJECT_STAT = null;

	// 第 69 変数初期値： i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
