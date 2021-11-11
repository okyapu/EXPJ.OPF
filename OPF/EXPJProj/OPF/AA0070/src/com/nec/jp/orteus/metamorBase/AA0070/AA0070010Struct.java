/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/src/com/nec/jp/orteus/metamorBase/AA0070/AA0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0070;

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

public class AA0070010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ROUND_TYP_name */
	public String m_ROUND_TYP_name = null;
	/** 第 2 変数： m_ROUND_TYP_val */
	public String m_ROUND_TYP_val = null;
	/** 第 3 変数： m_TAX_APPLY_TYP_name */
	public String m_TAX_APPLY_TYP_name = null;
	/** 第 4 変数： m_TAX_APPLY_TYP_val */
	public String m_TAX_APPLY_TYP_val = null;
	/** 第 5 変数： m_TAX_CALC_TYP_name */
	public String m_TAX_CALC_TYP_name = null;
	/** 第 6 変数： m_TAX_CALC_TYP_val */
	public String m_TAX_CALC_TYP_val = null;
	/** 第 7 変数： m_EXCH_TYP_name */
	public String m_EXCH_TYP_name = null;
	/** 第 8 変数： m_EXCH_TYP_val */
	public String m_EXCH_TYP_val = null;
	/** 第 9 変数： m_IMPORT_TRN_TYP_name */
	public String m_IMPORT_TRN_TYP_name = null;
	/** 第 10 変数： m_IMPORT_TRN_TYP_val */
	public String m_IMPORT_TRN_TYP_val = null;
	/** 第 11 変数： m_INSPC_ACPT_APP_TYP_name */
	public String m_INSPC_ACPT_APP_TYP_name = null;
	/** 第 12 変数： m_INSPC_ACPT_APP_TYP_val */
	public String m_INSPC_ACPT_APP_TYP_val = null;
	/** 第 13 変数： m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** 第 14 変数： m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** 第 15 変数： m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** 第 16 変数： m_h_APR_VEND_CTRL */
	public String m_h_APR_VEND_CTRL = null;
	/** 第 17 変数： m_COUNT */
	public Integer m_COUNT = null;
	/** 第 18 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 19 変数： m_VEND_CLASS_01_TYP */
	public String m_VEND_CLASS_01_TYP = null;
	/** 第 20 変数： m_VEND_CLASS_02_TYP */
	public String m_VEND_CLASS_02_TYP = null;
	/** 第 21 変数： m_VEND_CLASS_03_TYP */
	public String m_VEND_CLASS_03_TYP = null;
	/** 第 22 変数： m_VEND_CLASS_04_TYP */
	public String m_VEND_CLASS_04_TYP = null;
	/** 第 23 変数： m_VEND_CLASS_05_TYP */
	public String m_VEND_CLASS_05_TYP = null;
	/** 第 24 変数： m_VEND_CLASS_06_TYP */
	public String m_VEND_CLASS_06_TYP = null;
	/** 第 25 変数： m_VEND_CLASS_07_TYP */
	public String m_VEND_CLASS_07_TYP = null;
	/** 第 26 変数： m_VEND_CLASS_08_TYP */
	public String m_VEND_CLASS_08_TYP = null;
	/** 第 27 変数： m_VEND_CLASS_09_TYP */
	public String m_VEND_CLASS_09_TYP = null;
	/** 第 28 変数： m_VEND_CLASS_10_TYP */
	public String m_VEND_CLASS_10_TYP = null;
	/** 第 29 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 30 変数： m_h_VEND_CD */
	public String m_h_VEND_CD = null;
	/** 第 31 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 32 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 33 変数： m_VEND_KNAME */
	public String m_VEND_KNAME = null;
	/** 第 34 変数： m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** 第 35 変数： m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** 第 36 変数： m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** 第 37 変数： m_ADDRESS_K_1 */
	public String m_ADDRESS_K_1 = null;
	/** 第 38 変数： m_ADDRESS_K_2 */
	public String m_ADDRESS_K_2 = null;
	/** 第 39 変数： m_TEL */
	public String m_TEL = null;
	/** 第 40 変数： m_FAX */
	public String m_FAX = null;
	/** 第 41 変数： m_EMAIL */
	public String m_EMAIL = null;
	/** 第 42 変数： m_VEND_ORG */
	public String m_VEND_ORG = null;
	/** 第 43 変数： m_VEND_PERSON */
	public String m_VEND_PERSON = null;
	/** 第 44 変数： m_OWN_ORG_CD */
	public String m_OWN_ORG_CD = null;
	/** 第 45 変数： m_OWN_ORG_NAME */
	public String m_OWN_ORG_NAME = null;
	/** 第 46 変数： m_OWN_PERSON_CD */
	public String m_OWN_PERSON_CD = null;
	/** 第 47 変数： m_OWN_PERSON_NAME */
	public String m_OWN_PERSON_NAME = null;
	/** 第 48 変数： m_ROUND_TYP */
	public Integer m_ROUND_TYP = null;
	/** 第 49 変数： m_INSPC_ACPT_APP_TYP */
	public String m_INSPC_ACPT_APP_TYP = null;
	/** 第 50 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 51 変数： m_TAX_APPLY_TYP */
	public Integer m_TAX_APPLY_TYP = null;
	/** 第 52 変数： m_TAX_CALC_TYP */
	public Integer m_TAX_CALC_TYP = null;
	/** 第 53 変数： m_ODR_FORM_FLG */
	public String m_ODR_FORM_FLG = null;
	/** 第 54 変数： m_ODR_EDI_FLG */
	public String m_ODR_EDI_FLG = null;
	/** 第 55 変数： m_ODR_FAX_FLG */
	public String m_ODR_FAX_FLG = null;
	/** 第 56 変数： m_ODR_MAIL_FLG */
	public String m_ODR_MAIL_FLG = null;
	/** 第 57 変数： m_VEND_REM */
	public String m_VEND_REM = null;
	/** 第 58 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 59 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 60 変数： m_IMPORT_TRN_TYP */
	public String m_IMPORT_TRN_TYP = null;
	/** 第 61 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 62 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 63 変数： m_CTRL_CD */
	public String m_CTRL_CD = null;
	/** 第 64 変数： m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** 第 65 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 66 変数： m_w_VEND_CD */
	public String m_w_VEND_CD = null;
	/** 第 67 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 68 変数： m_OPTION_ID */
	public String m_OPTION_ID = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ROUND_TYP_name */
	public List l_ROUND_TYP_name = null;

	/** 第 2 List変数： l_ROUND_TYP_val */
	public List l_ROUND_TYP_val = null;

	/** 第 3 List変数： l_TAX_APPLY_TYP_name */
	public List l_TAX_APPLY_TYP_name = null;

	/** 第 4 List変数： l_TAX_APPLY_TYP_val */
	public List l_TAX_APPLY_TYP_val = null;

	/** 第 5 List変数： l_TAX_CALC_TYP_name */
	public List l_TAX_CALC_TYP_name = null;

	/** 第 6 List変数： l_TAX_CALC_TYP_val */
	public List l_TAX_CALC_TYP_val = null;

	/** 第 7 List変数： l_EXCH_TYP_name */
	public List l_EXCH_TYP_name = null;

	/** 第 8 List変数： l_EXCH_TYP_val */
	public List l_EXCH_TYP_val = null;

	/** 第 9 List変数： l_IMPORT_TRN_TYP_name */
	public List l_IMPORT_TRN_TYP_name = null;

	/** 第 10 List変数： l_IMPORT_TRN_TYP_val */
	public List l_IMPORT_TRN_TYP_val = null;

	/** 第 11 List変数： l_INSPC_ACPT_APP_TYP_name */
	public List l_INSPC_ACPT_APP_TYP_name = null;

	/** 第 12 List変数： l_INSPC_ACPT_APP_TYP_val */
	public List l_INSPC_ACPT_APP_TYP_val = null;

	/** 第 13 List変数： l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** 第 14 List変数： l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** 第 15 List変数： l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** 第 16 List変数： l_h_APR_VEND_CTRL */
	public List l_h_APR_VEND_CTRL = null;

	/** 第 17 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 18 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 19 List変数： l_VEND_CLASS_01_TYP */
	public List l_VEND_CLASS_01_TYP = null;

	/** 第 20 List変数： l_VEND_CLASS_02_TYP */
	public List l_VEND_CLASS_02_TYP = null;

	/** 第 21 List変数： l_VEND_CLASS_03_TYP */
	public List l_VEND_CLASS_03_TYP = null;

	/** 第 22 List変数： l_VEND_CLASS_04_TYP */
	public List l_VEND_CLASS_04_TYP = null;

	/** 第 23 List変数： l_VEND_CLASS_05_TYP */
	public List l_VEND_CLASS_05_TYP = null;

	/** 第 24 List変数： l_VEND_CLASS_06_TYP */
	public List l_VEND_CLASS_06_TYP = null;

	/** 第 25 List変数： l_VEND_CLASS_07_TYP */
	public List l_VEND_CLASS_07_TYP = null;

	/** 第 26 List変数： l_VEND_CLASS_08_TYP */
	public List l_VEND_CLASS_08_TYP = null;

	/** 第 27 List変数： l_VEND_CLASS_09_TYP */
	public List l_VEND_CLASS_09_TYP = null;

	/** 第 28 List変数： l_VEND_CLASS_10_TYP */
	public List l_VEND_CLASS_10_TYP = null;

	/** 第 29 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 30 List変数： l_h_VEND_CD */
	public List l_h_VEND_CD = null;

	/** 第 31 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 32 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 33 List変数： l_VEND_KNAME */
	public List l_VEND_KNAME = null;

	/** 第 34 List変数： l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** 第 35 List変数： l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** 第 36 List変数： l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** 第 37 List変数： l_ADDRESS_K_1 */
	public List l_ADDRESS_K_1 = null;

	/** 第 38 List変数： l_ADDRESS_K_2 */
	public List l_ADDRESS_K_2 = null;

	/** 第 39 List変数： l_TEL */
	public List l_TEL = null;

	/** 第 40 List変数： l_FAX */
	public List l_FAX = null;

	/** 第 41 List変数： l_EMAIL */
	public List l_EMAIL = null;

	/** 第 42 List変数： l_VEND_ORG */
	public List l_VEND_ORG = null;

	/** 第 43 List変数： l_VEND_PERSON */
	public List l_VEND_PERSON = null;

	/** 第 44 List変数： l_OWN_ORG_CD */
	public List l_OWN_ORG_CD = null;

	/** 第 45 List変数： l_OWN_ORG_NAME */
	public List l_OWN_ORG_NAME = null;

	/** 第 46 List変数： l_OWN_PERSON_CD */
	public List l_OWN_PERSON_CD = null;

	/** 第 47 List変数： l_OWN_PERSON_NAME */
	public List l_OWN_PERSON_NAME = null;

	/** 第 48 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 49 List変数： l_INSPC_ACPT_APP_TYP */
	public List l_INSPC_ACPT_APP_TYP = null;

	/** 第 50 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 51 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 52 List変数： l_TAX_CALC_TYP */
	public List l_TAX_CALC_TYP = null;

	/** 第 53 List変数： l_ODR_FORM_FLG */
	public List l_ODR_FORM_FLG = null;

	/** 第 54 List変数： l_ODR_EDI_FLG */
	public List l_ODR_EDI_FLG = null;

	/** 第 55 List変数： l_ODR_FAX_FLG */
	public List l_ODR_FAX_FLG = null;

	/** 第 56 List変数： l_ODR_MAIL_FLG */
	public List l_ODR_MAIL_FLG = null;

	/** 第 57 List変数： l_VEND_REM */
	public List l_VEND_REM = null;

	/** 第 58 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 59 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 60 List変数： l_IMPORT_TRN_TYP */
	public List l_IMPORT_TRN_TYP = null;

	/** 第 61 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 62 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 63 List変数： l_CTRL_CD */
	public List l_CTRL_CD = null;

	/** 第 64 List変数： l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** 第 65 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 66 List変数： l_w_VEND_CD */
	public List l_w_VEND_CD = null;

	/** 第 67 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 68 List変数： l_OPTION_ID */
	public List l_OPTION_ID = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getROUND_TYP_name() { return m_ROUND_TYP_name; }
	public String getROUND_TYP_val() { return m_ROUND_TYP_val; }
	public String getTAX_APPLY_TYP_name() { return m_TAX_APPLY_TYP_name; }
	public String getTAX_APPLY_TYP_val() { return m_TAX_APPLY_TYP_val; }
	public String getTAX_CALC_TYP_name() { return m_TAX_CALC_TYP_name; }
	public String getTAX_CALC_TYP_val() { return m_TAX_CALC_TYP_val; }
	public String getEXCH_TYP_name() { return m_EXCH_TYP_name; }
	public String getEXCH_TYP_val() { return m_EXCH_TYP_val; }
	public String getIMPORT_TRN_TYP_name() { return m_IMPORT_TRN_TYP_name; }
	public String getIMPORT_TRN_TYP_val() { return m_IMPORT_TRN_TYP_val; }
	public String getINSPC_ACPT_APP_TYP_name() { return m_INSPC_ACPT_APP_TYP_name; }
	public String getINSPC_ACPT_APP_TYP_val() { return m_INSPC_ACPT_APP_TYP_val; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_VEND_CTRL() { return m_h_APR_VEND_CTRL; }
	public Integer getCOUNT() { return m_COUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CLASS_01_TYP() { return m_VEND_CLASS_01_TYP; }
	public String getVEND_CLASS_02_TYP() { return m_VEND_CLASS_02_TYP; }
	public String getVEND_CLASS_03_TYP() { return m_VEND_CLASS_03_TYP; }
	public String getVEND_CLASS_04_TYP() { return m_VEND_CLASS_04_TYP; }
	public String getVEND_CLASS_05_TYP() { return m_VEND_CLASS_05_TYP; }
	public String getVEND_CLASS_06_TYP() { return m_VEND_CLASS_06_TYP; }
	public String getVEND_CLASS_07_TYP() { return m_VEND_CLASS_07_TYP; }
	public String getVEND_CLASS_08_TYP() { return m_VEND_CLASS_08_TYP; }
	public String getVEND_CLASS_09_TYP() { return m_VEND_CLASS_09_TYP; }
	public String getVEND_CLASS_10_TYP() { return m_VEND_CLASS_10_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String geth_VEND_CD() { return m_h_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getVEND_KNAME() { return m_VEND_KNAME; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getADDRESS_K_1() { return m_ADDRESS_K_1; }
	public String getADDRESS_K_2() { return m_ADDRESS_K_2; }
	public String getTEL() { return m_TEL; }
	public String getFAX() { return m_FAX; }
	public String getEMAIL() { return m_EMAIL; }
	public String getVEND_ORG() { return m_VEND_ORG; }
	public String getVEND_PERSON() { return m_VEND_PERSON; }
	public String getOWN_ORG_CD() { return m_OWN_ORG_CD; }
	public String getOWN_ORG_NAME() { return m_OWN_ORG_NAME; }
	public String getOWN_PERSON_CD() { return m_OWN_PERSON_CD; }
	public String getOWN_PERSON_NAME() { return m_OWN_PERSON_NAME; }
	public Integer getROUND_TYP() { return m_ROUND_TYP; }
	public String getINSPC_ACPT_APP_TYP() { return m_INSPC_ACPT_APP_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public Integer getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public Integer getTAX_CALC_TYP() { return m_TAX_CALC_TYP; }
	public String getODR_FORM_FLG() { return m_ODR_FORM_FLG; }
	public String getODR_EDI_FLG() { return m_ODR_EDI_FLG; }
	public String getODR_FAX_FLG() { return m_ODR_FAX_FLG; }
	public String getODR_MAIL_FLG() { return m_ODR_MAIL_FLG; }
	public String getVEND_REM() { return m_VEND_REM; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getIMPORT_TRN_TYP() { return m_IMPORT_TRN_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCTRL_CD() { return m_CTRL_CD; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getw_VEND_CD() { return m_w_VEND_CD; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getOPTION_ID() { return m_OPTION_ID; }

	public List getList_ROUND_TYP_name() { return l_ROUND_TYP_name; }
	public List getList_ROUND_TYP_val() { return l_ROUND_TYP_val; }
	public List getList_TAX_APPLY_TYP_name() { return l_TAX_APPLY_TYP_name; }
	public List getList_TAX_APPLY_TYP_val() { return l_TAX_APPLY_TYP_val; }
	public List getList_TAX_CALC_TYP_name() { return l_TAX_CALC_TYP_name; }
	public List getList_TAX_CALC_TYP_val() { return l_TAX_CALC_TYP_val; }
	public List getList_EXCH_TYP_name() { return l_EXCH_TYP_name; }
	public List getList_EXCH_TYP_val() { return l_EXCH_TYP_val; }
	public List getList_IMPORT_TRN_TYP_name() { return l_IMPORT_TRN_TYP_name; }
	public List getList_IMPORT_TRN_TYP_val() { return l_IMPORT_TRN_TYP_val; }
	public List getList_INSPC_ACPT_APP_TYP_name() { return l_INSPC_ACPT_APP_TYP_name; }
	public List getList_INSPC_ACPT_APP_TYP_val() { return l_INSPC_ACPT_APP_TYP_val; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_VEND_CTRL() { return l_h_APR_VEND_CTRL; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CLASS_01_TYP() { return l_VEND_CLASS_01_TYP; }
	public List getList_VEND_CLASS_02_TYP() { return l_VEND_CLASS_02_TYP; }
	public List getList_VEND_CLASS_03_TYP() { return l_VEND_CLASS_03_TYP; }
	public List getList_VEND_CLASS_04_TYP() { return l_VEND_CLASS_04_TYP; }
	public List getList_VEND_CLASS_05_TYP() { return l_VEND_CLASS_05_TYP; }
	public List getList_VEND_CLASS_06_TYP() { return l_VEND_CLASS_06_TYP; }
	public List getList_VEND_CLASS_07_TYP() { return l_VEND_CLASS_07_TYP; }
	public List getList_VEND_CLASS_08_TYP() { return l_VEND_CLASS_08_TYP; }
	public List getList_VEND_CLASS_09_TYP() { return l_VEND_CLASS_09_TYP; }
	public List getList_VEND_CLASS_10_TYP() { return l_VEND_CLASS_10_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_h_VEND_CD() { return l_h_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_VEND_KNAME() { return l_VEND_KNAME; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_ADDRESS_K_1() { return l_ADDRESS_K_1; }
	public List getList_ADDRESS_K_2() { return l_ADDRESS_K_2; }
	public List getList_TEL() { return l_TEL; }
	public List getList_FAX() { return l_FAX; }
	public List getList_EMAIL() { return l_EMAIL; }
	public List getList_VEND_ORG() { return l_VEND_ORG; }
	public List getList_VEND_PERSON() { return l_VEND_PERSON; }
	public List getList_OWN_ORG_CD() { return l_OWN_ORG_CD; }
	public List getList_OWN_ORG_NAME() { return l_OWN_ORG_NAME; }
	public List getList_OWN_PERSON_CD() { return l_OWN_PERSON_CD; }
	public List getList_OWN_PERSON_NAME() { return l_OWN_PERSON_NAME; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_INSPC_ACPT_APP_TYP() { return l_INSPC_ACPT_APP_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_TAX_CALC_TYP() { return l_TAX_CALC_TYP; }
	public List getList_ODR_FORM_FLG() { return l_ODR_FORM_FLG; }
	public List getList_ODR_EDI_FLG() { return l_ODR_EDI_FLG; }
	public List getList_ODR_FAX_FLG() { return l_ODR_FAX_FLG; }
	public List getList_ODR_MAIL_FLG() { return l_ODR_MAIL_FLG; }
	public List getList_VEND_REM() { return l_VEND_REM; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_IMPORT_TRN_TYP() { return l_IMPORT_TRN_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CTRL_CD() { return l_CTRL_CD; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_w_VEND_CD() { return l_w_VEND_CD; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }

	public void setROUND_TYP_name(String val) { m_ROUND_TYP_name = val; }
	public void setROUND_TYP_val(String val) { m_ROUND_TYP_val = val; }
	public void setTAX_APPLY_TYP_name(String val) { m_TAX_APPLY_TYP_name = val; }
	public void setTAX_APPLY_TYP_val(String val) { m_TAX_APPLY_TYP_val = val; }
	public void setTAX_CALC_TYP_name(String val) { m_TAX_CALC_TYP_name = val; }
	public void setTAX_CALC_TYP_val(String val) { m_TAX_CALC_TYP_val = val; }
	public void setEXCH_TYP_name(String val) { m_EXCH_TYP_name = val; }
	public void setEXCH_TYP_val(String val) { m_EXCH_TYP_val = val; }
	public void setIMPORT_TRN_TYP_name(String val) { m_IMPORT_TRN_TYP_name = val; }
	public void setIMPORT_TRN_TYP_val(String val) { m_IMPORT_TRN_TYP_val = val; }
	public void setINSPC_ACPT_APP_TYP_name(String val) { m_INSPC_ACPT_APP_TYP_name = val; }
	public void setINSPC_ACPT_APP_TYP_val(String val) { m_INSPC_ACPT_APP_TYP_val = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_VEND_CTRL(String val) { m_h_APR_VEND_CTRL = val; }
	public void setCOUNT(Integer val) { m_COUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CLASS_01_TYP(String val) { m_VEND_CLASS_01_TYP = val; }
	public void setVEND_CLASS_02_TYP(String val) { m_VEND_CLASS_02_TYP = val; }
	public void setVEND_CLASS_03_TYP(String val) { m_VEND_CLASS_03_TYP = val; }
	public void setVEND_CLASS_04_TYP(String val) { m_VEND_CLASS_04_TYP = val; }
	public void setVEND_CLASS_05_TYP(String val) { m_VEND_CLASS_05_TYP = val; }
	public void setVEND_CLASS_06_TYP(String val) { m_VEND_CLASS_06_TYP = val; }
	public void setVEND_CLASS_07_TYP(String val) { m_VEND_CLASS_07_TYP = val; }
	public void setVEND_CLASS_08_TYP(String val) { m_VEND_CLASS_08_TYP = val; }
	public void setVEND_CLASS_09_TYP(String val) { m_VEND_CLASS_09_TYP = val; }
	public void setVEND_CLASS_10_TYP(String val) { m_VEND_CLASS_10_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void seth_VEND_CD(String val) { m_h_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setVEND_KNAME(String val) { m_VEND_KNAME = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setADDRESS_K_1(String val) { m_ADDRESS_K_1 = val; }
	public void setADDRESS_K_2(String val) { m_ADDRESS_K_2 = val; }
	public void setTEL(String val) { m_TEL = val; }
	public void setFAX(String val) { m_FAX = val; }
	public void setEMAIL(String val) { m_EMAIL = val; }
	public void setVEND_ORG(String val) { m_VEND_ORG = val; }
	public void setVEND_PERSON(String val) { m_VEND_PERSON = val; }
	public void setOWN_ORG_CD(String val) { m_OWN_ORG_CD = val; }
	public void setOWN_ORG_NAME(String val) { m_OWN_ORG_NAME = val; }
	public void setOWN_PERSON_CD(String val) { m_OWN_PERSON_CD = val; }
	public void setOWN_PERSON_NAME(String val) { m_OWN_PERSON_NAME = val; }
	public void setROUND_TYP(Integer val) { m_ROUND_TYP = val; }
	public void setINSPC_ACPT_APP_TYP(String val) { m_INSPC_ACPT_APP_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_APPLY_TYP(Integer val) { m_TAX_APPLY_TYP = val; }
	public void setTAX_CALC_TYP(Integer val) { m_TAX_CALC_TYP = val; }
	public void setODR_FORM_FLG(String val) { m_ODR_FORM_FLG = val; }
	public void setODR_EDI_FLG(String val) { m_ODR_EDI_FLG = val; }
	public void setODR_FAX_FLG(String val) { m_ODR_FAX_FLG = val; }
	public void setODR_MAIL_FLG(String val) { m_ODR_MAIL_FLG = val; }
	public void setVEND_REM(String val) { m_VEND_REM = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setIMPORT_TRN_TYP(String val) { m_IMPORT_TRN_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCTRL_CD(String val) { m_CTRL_CD = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setw_VEND_CD(String val) { m_w_VEND_CD = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }

	public void setCOUNT(String val) { m_COUNT = getInteger(val); }
	public void setROUND_TYP(String val) { m_ROUND_TYP = getInteger(val); }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = getInteger(val); }
	public void setTAX_CALC_TYP(String val) { m_TAX_CALC_TYP = getInteger(val); }

	public void setList_ROUND_TYP_name(List list) { l_ROUND_TYP_name = list; }
	public void setList_ROUND_TYP_val(List list) { l_ROUND_TYP_val = list; }
	public void setList_TAX_APPLY_TYP_name(List list) { l_TAX_APPLY_TYP_name = list; }
	public void setList_TAX_APPLY_TYP_val(List list) { l_TAX_APPLY_TYP_val = list; }
	public void setList_TAX_CALC_TYP_name(List list) { l_TAX_CALC_TYP_name = list; }
	public void setList_TAX_CALC_TYP_val(List list) { l_TAX_CALC_TYP_val = list; }
	public void setList_EXCH_TYP_name(List list) { l_EXCH_TYP_name = list; }
	public void setList_EXCH_TYP_val(List list) { l_EXCH_TYP_val = list; }
	public void setList_IMPORT_TRN_TYP_name(List list) { l_IMPORT_TRN_TYP_name = list; }
	public void setList_IMPORT_TRN_TYP_val(List list) { l_IMPORT_TRN_TYP_val = list; }
	public void setList_INSPC_ACPT_APP_TYP_name(List list) { l_INSPC_ACPT_APP_TYP_name = list; }
	public void setList_INSPC_ACPT_APP_TYP_val(List list) { l_INSPC_ACPT_APP_TYP_val = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_VEND_CTRL(List list) { l_h_APR_VEND_CTRL = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CLASS_01_TYP(List list) { l_VEND_CLASS_01_TYP = list; }
	public void setList_VEND_CLASS_02_TYP(List list) { l_VEND_CLASS_02_TYP = list; }
	public void setList_VEND_CLASS_03_TYP(List list) { l_VEND_CLASS_03_TYP = list; }
	public void setList_VEND_CLASS_04_TYP(List list) { l_VEND_CLASS_04_TYP = list; }
	public void setList_VEND_CLASS_05_TYP(List list) { l_VEND_CLASS_05_TYP = list; }
	public void setList_VEND_CLASS_06_TYP(List list) { l_VEND_CLASS_06_TYP = list; }
	public void setList_VEND_CLASS_07_TYP(List list) { l_VEND_CLASS_07_TYP = list; }
	public void setList_VEND_CLASS_08_TYP(List list) { l_VEND_CLASS_08_TYP = list; }
	public void setList_VEND_CLASS_09_TYP(List list) { l_VEND_CLASS_09_TYP = list; }
	public void setList_VEND_CLASS_10_TYP(List list) { l_VEND_CLASS_10_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_h_VEND_CD(List list) { l_h_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_VEND_KNAME(List list) { l_VEND_KNAME = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_ADDRESS_K_1(List list) { l_ADDRESS_K_1 = list; }
	public void setList_ADDRESS_K_2(List list) { l_ADDRESS_K_2 = list; }
	public void setList_TEL(List list) { l_TEL = list; }
	public void setList_FAX(List list) { l_FAX = list; }
	public void setList_EMAIL(List list) { l_EMAIL = list; }
	public void setList_VEND_ORG(List list) { l_VEND_ORG = list; }
	public void setList_VEND_PERSON(List list) { l_VEND_PERSON = list; }
	public void setList_OWN_ORG_CD(List list) { l_OWN_ORG_CD = list; }
	public void setList_OWN_ORG_NAME(List list) { l_OWN_ORG_NAME = list; }
	public void setList_OWN_PERSON_CD(List list) { l_OWN_PERSON_CD = list; }
	public void setList_OWN_PERSON_NAME(List list) { l_OWN_PERSON_NAME = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_INSPC_ACPT_APP_TYP(List list) { l_INSPC_ACPT_APP_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_TAX_CALC_TYP(List list) { l_TAX_CALC_TYP = list; }
	public void setList_ODR_FORM_FLG(List list) { l_ODR_FORM_FLG = list; }
	public void setList_ODR_EDI_FLG(List list) { l_ODR_EDI_FLG = list; }
	public void setList_ODR_FAX_FLG(List list) { l_ODR_FAX_FLG = list; }
	public void setList_ODR_MAIL_FLG(List list) { l_ODR_MAIL_FLG = list; }
	public void setList_VEND_REM(List list) { l_VEND_REM = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_IMPORT_TRN_TYP(List list) { l_IMPORT_TRN_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CTRL_CD(List list) { l_CTRL_CD = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_w_VEND_CD(List list) { l_w_VEND_CD = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }

	public int setL2L_ROUND_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP_name == null) {
			l_ROUND_TYP_name = new ArrayList();
		} else {
			l_ROUND_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP_name.add(((AA0070010Struct) list.get(i)).getROUND_TYP_name());
		}
		return size;
	}
	public int setL2L_ROUND_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP_val == null) {
			l_ROUND_TYP_val = new ArrayList();
		} else {
			l_ROUND_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP_val.add(((AA0070010Struct) list.get(i)).getROUND_TYP_val());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP_name == null) {
			l_TAX_APPLY_TYP_name = new ArrayList();
		} else {
			l_TAX_APPLY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP_name.add(((AA0070010Struct) list.get(i)).getTAX_APPLY_TYP_name());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP_val == null) {
			l_TAX_APPLY_TYP_val = new ArrayList();
		} else {
			l_TAX_APPLY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP_val.add(((AA0070010Struct) list.get(i)).getTAX_APPLY_TYP_val());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP_name == null) {
			l_TAX_CALC_TYP_name = new ArrayList();
		} else {
			l_TAX_CALC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP_name.add(((AA0070010Struct) list.get(i)).getTAX_CALC_TYP_name());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP_val == null) {
			l_TAX_CALC_TYP_val = new ArrayList();
		} else {
			l_TAX_CALC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP_val.add(((AA0070010Struct) list.get(i)).getTAX_CALC_TYP_val());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_name == null) {
			l_EXCH_TYP_name = new ArrayList();
		} else {
			l_EXCH_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_name.add(((AA0070010Struct) list.get(i)).getEXCH_TYP_name());
		}
		return size;
	}
	public int setL2L_EXCH_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP_val == null) {
			l_EXCH_TYP_val = new ArrayList();
		} else {
			l_EXCH_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP_val.add(((AA0070010Struct) list.get(i)).getEXCH_TYP_val());
		}
		return size;
	}
	public int setL2L_IMPORT_TRN_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IMPORT_TRN_TYP_name == null) {
			l_IMPORT_TRN_TYP_name = new ArrayList();
		} else {
			l_IMPORT_TRN_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IMPORT_TRN_TYP_name.add(((AA0070010Struct) list.get(i)).getIMPORT_TRN_TYP_name());
		}
		return size;
	}
	public int setL2L_IMPORT_TRN_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IMPORT_TRN_TYP_val == null) {
			l_IMPORT_TRN_TYP_val = new ArrayList();
		} else {
			l_IMPORT_TRN_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IMPORT_TRN_TYP_val.add(((AA0070010Struct) list.get(i)).getIMPORT_TRN_TYP_val());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_APP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_APP_TYP_name == null) {
			l_INSPC_ACPT_APP_TYP_name = new ArrayList();
		} else {
			l_INSPC_ACPT_APP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_APP_TYP_name.add(((AA0070010Struct) list.get(i)).getINSPC_ACPT_APP_TYP_name());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_APP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_APP_TYP_val == null) {
			l_INSPC_ACPT_APP_TYP_val = new ArrayList();
		} else {
			l_INSPC_ACPT_APP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_APP_TYP_val.add(((AA0070010Struct) list.get(i)).getINSPC_ACPT_APP_TYP_val());
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
			l_h_SCREENMOVE_TYP.add(((AA0070010Struct) list.get(i)).geth_SCREENMOVE_TYP());
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
			l_h_APPR_ID.add(((AA0070010Struct) list.get(i)).geth_APPR_ID());
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
			l_APPR_REMARKS.add(((AA0070010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_VEND_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_VEND_CTRL == null) {
			l_h_APR_VEND_CTRL = new ArrayList();
		} else {
			l_h_APR_VEND_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_VEND_CTRL.add(((AA0070010Struct) list.get(i)).geth_APR_VEND_CTRL());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AA0070010Struct) list.get(i)).getCOUNT());
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
			l_COMPANY_CD.add(((AA0070010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_01_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_01_TYP == null) {
			l_VEND_CLASS_01_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_01_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_01_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_01_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_02_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_02_TYP == null) {
			l_VEND_CLASS_02_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_02_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_02_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_02_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_03_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_03_TYP == null) {
			l_VEND_CLASS_03_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_03_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_03_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_03_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_04_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_04_TYP == null) {
			l_VEND_CLASS_04_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_04_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_04_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_04_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_05_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_05_TYP == null) {
			l_VEND_CLASS_05_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_05_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_05_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_05_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_06_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_06_TYP == null) {
			l_VEND_CLASS_06_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_06_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_06_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_06_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_07_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_07_TYP == null) {
			l_VEND_CLASS_07_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_07_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_07_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_07_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_08_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_08_TYP == null) {
			l_VEND_CLASS_08_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_08_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_08_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_08_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_09_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_09_TYP == null) {
			l_VEND_CLASS_09_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_09_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_09_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_09_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_10_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_10_TYP == null) {
			l_VEND_CLASS_10_TYP = new ArrayList();
		} else {
			l_VEND_CLASS_10_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_10_TYP.add(((AA0070010Struct) list.get(i)).getVEND_CLASS_10_TYP());
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
			l_VEND_CD.add(((AA0070010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_h_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VEND_CD == null) {
			l_h_VEND_CD = new ArrayList();
		} else {
			l_h_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VEND_CD.add(((AA0070010Struct) list.get(i)).geth_VEND_CD());
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
			l_VEND_NAME.add(((AA0070010Struct) list.get(i)).getVEND_NAME());
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
			l_VEND_ANAME.add(((AA0070010Struct) list.get(i)).getVEND_ANAME());
		}
		return size;
	}
	public int setL2L_VEND_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_KNAME == null) {
			l_VEND_KNAME = new ArrayList();
		} else {
			l_VEND_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_KNAME.add(((AA0070010Struct) list.get(i)).getVEND_KNAME());
		}
		return size;
	}
	public int setL2L_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ZIP_CD == null) {
			l_ZIP_CD = new ArrayList();
		} else {
			l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ZIP_CD.add(((AA0070010Struct) list.get(i)).getZIP_CD());
		}
		return size;
	}
	public int setL2L_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_1 == null) {
			l_ADDRESS_1 = new ArrayList();
		} else {
			l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_1.add(((AA0070010Struct) list.get(i)).getADDRESS_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_2 == null) {
			l_ADDRESS_2 = new ArrayList();
		} else {
			l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_2.add(((AA0070010Struct) list.get(i)).getADDRESS_2());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_1 == null) {
			l_ADDRESS_K_1 = new ArrayList();
		} else {
			l_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_1.add(((AA0070010Struct) list.get(i)).getADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_2 == null) {
			l_ADDRESS_K_2 = new ArrayList();
		} else {
			l_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_2.add(((AA0070010Struct) list.get(i)).getADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEL == null) {
			l_TEL = new ArrayList();
		} else {
			l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEL.add(((AA0070010Struct) list.get(i)).getTEL());
		}
		return size;
	}
	public int setL2L_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FAX == null) {
			l_FAX = new ArrayList();
		} else {
			l_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FAX.add(((AA0070010Struct) list.get(i)).getFAX());
		}
		return size;
	}
	public int setL2L_EMAIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EMAIL == null) {
			l_EMAIL = new ArrayList();
		} else {
			l_EMAIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EMAIL.add(((AA0070010Struct) list.get(i)).getEMAIL());
		}
		return size;
	}
	public int setL2L_VEND_ORG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ORG == null) {
			l_VEND_ORG = new ArrayList();
		} else {
			l_VEND_ORG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ORG.add(((AA0070010Struct) list.get(i)).getVEND_ORG());
		}
		return size;
	}
	public int setL2L_VEND_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_PERSON == null) {
			l_VEND_PERSON = new ArrayList();
		} else {
			l_VEND_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_PERSON.add(((AA0070010Struct) list.get(i)).getVEND_PERSON());
		}
		return size;
	}
	public int setL2L_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_ORG_CD == null) {
			l_OWN_ORG_CD = new ArrayList();
		} else {
			l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_ORG_CD.add(((AA0070010Struct) list.get(i)).getOWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_OWN_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_ORG_NAME == null) {
			l_OWN_ORG_NAME = new ArrayList();
		} else {
			l_OWN_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_ORG_NAME.add(((AA0070010Struct) list.get(i)).getOWN_ORG_NAME());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_CD == null) {
			l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_CD.add(((AA0070010Struct) list.get(i)).getOWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_NAME == null) {
			l_OWN_PERSON_NAME = new ArrayList();
		} else {
			l_OWN_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_NAME.add(((AA0070010Struct) list.get(i)).getOWN_PERSON_NAME());
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
			l_ROUND_TYP.add(((AA0070010Struct) list.get(i)).getROUND_TYP());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_APP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_APP_TYP == null) {
			l_INSPC_ACPT_APP_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_APP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_APP_TYP.add(((AA0070010Struct) list.get(i)).getINSPC_ACPT_APP_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AA0070010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP == null) {
			l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP.add(((AA0070010Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP == null) {
			l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP.add(((AA0070010Struct) list.get(i)).getTAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_ODR_FORM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_FORM_FLG == null) {
			l_ODR_FORM_FLG = new ArrayList();
		} else {
			l_ODR_FORM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_FORM_FLG.add(((AA0070010Struct) list.get(i)).getODR_FORM_FLG());
		}
		return size;
	}
	public int setL2L_ODR_EDI_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_EDI_FLG == null) {
			l_ODR_EDI_FLG = new ArrayList();
		} else {
			l_ODR_EDI_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_EDI_FLG.add(((AA0070010Struct) list.get(i)).getODR_EDI_FLG());
		}
		return size;
	}
	public int setL2L_ODR_FAX_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_FAX_FLG == null) {
			l_ODR_FAX_FLG = new ArrayList();
		} else {
			l_ODR_FAX_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_FAX_FLG.add(((AA0070010Struct) list.get(i)).getODR_FAX_FLG());
		}
		return size;
	}
	public int setL2L_ODR_MAIL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_MAIL_FLG == null) {
			l_ODR_MAIL_FLG = new ArrayList();
		} else {
			l_ODR_MAIL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_MAIL_FLG.add(((AA0070010Struct) list.get(i)).getODR_MAIL_FLG());
		}
		return size;
	}
	public int setL2L_VEND_REM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_REM == null) {
			l_VEND_REM = new ArrayList();
		} else {
			l_VEND_REM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_REM.add(((AA0070010Struct) list.get(i)).getVEND_REM());
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
			l_MODIFY_COUNT.add(((AA0070010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_EXCH_TYP.add(((AA0070010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_IMPORT_TRN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IMPORT_TRN_TYP == null) {
			l_IMPORT_TRN_TYP = new ArrayList();
		} else {
			l_IMPORT_TRN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IMPORT_TRN_TYP.add(((AA0070010Struct) list.get(i)).getIMPORT_TRN_TYP());
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
			l_CUR_CD.add(((AA0070010Struct) list.get(i)).getCUR_CD());
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
			l_CUR_NAME.add(((AA0070010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CTRL_CD == null) {
			l_CTRL_CD = new ArrayList();
		} else {
			l_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CTRL_CD.add(((AA0070010Struct) list.get(i)).getCTRL_CD());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_NO == null) {
			l_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_NO.add(((AA0070010Struct) list.get(i)).getONEROUS_CONS_NO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AA0070010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_VEND_CD == null) {
			l_w_VEND_CD = new ArrayList();
		} else {
			l_w_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_VEND_CD.add(((AA0070010Struct) list.get(i)).getw_VEND_CD());
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
			l_INSTALL_FLG.add(((AA0070010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPTION_ID == null) {
			l_OPTION_ID = new ArrayList();
		} else {
			l_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPTION_ID.add(((AA0070010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ROUND_TYP_name = null;
		m_ROUND_TYP_val = null;
		m_TAX_APPLY_TYP_name = null;
		m_TAX_APPLY_TYP_val = null;
		m_TAX_CALC_TYP_name = null;
		m_TAX_CALC_TYP_val = null;
		m_EXCH_TYP_name = null;
		m_EXCH_TYP_val = null;
		m_IMPORT_TRN_TYP_name = null;
		m_IMPORT_TRN_TYP_val = null;
		m_INSPC_ACPT_APP_TYP_name = null;
		m_INSPC_ACPT_APP_TYP_val = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_h_APR_VEND_CTRL = null;
		m_COUNT = null;
		m_COMPANY_CD = null;
		m_VEND_CLASS_01_TYP = null;
		m_VEND_CLASS_02_TYP = null;
		m_VEND_CLASS_03_TYP = null;
		m_VEND_CLASS_04_TYP = null;
		m_VEND_CLASS_05_TYP = null;
		m_VEND_CLASS_06_TYP = null;
		m_VEND_CLASS_07_TYP = null;
		m_VEND_CLASS_08_TYP = null;
		m_VEND_CLASS_09_TYP = null;
		m_VEND_CLASS_10_TYP = null;
		m_VEND_CD = null;
		m_h_VEND_CD = null;
		m_VEND_NAME = null;
		m_VEND_ANAME = null;
		m_VEND_KNAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_EMAIL = null;
		m_VEND_ORG = null;
		m_VEND_PERSON = null;
		m_OWN_ORG_CD = null;
		m_OWN_ORG_NAME = null;
		m_OWN_PERSON_CD = null;
		m_OWN_PERSON_NAME = null;
		m_ROUND_TYP = null;
		m_INSPC_ACPT_APP_TYP = null;
		m_TAX_CD = null;
		m_TAX_APPLY_TYP = null;
		m_TAX_CALC_TYP = null;
		m_ODR_FORM_FLG = null;
		m_ODR_EDI_FLG = null;
		m_ODR_FAX_FLG = null;
		m_ODR_MAIL_FLG = null;
		m_VEND_REM = null;
		m_MODIFY_COUNT = null;
		m_EXCH_TYP = null;
		m_IMPORT_TRN_TYP = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_CTRL_CD = null;
		m_ONEROUS_CONS_NO = null;
		m_PUCH_ODR_CD = null;
		m_w_VEND_CD = null;
		m_INSTALL_FLG = null;
		m_OPTION_ID = null;

		l_ROUND_TYP_name = null;
		l_ROUND_TYP_val = null;
		l_TAX_APPLY_TYP_name = null;
		l_TAX_APPLY_TYP_val = null;
		l_TAX_CALC_TYP_name = null;
		l_TAX_CALC_TYP_val = null;
		l_EXCH_TYP_name = null;
		l_EXCH_TYP_val = null;
		l_IMPORT_TRN_TYP_name = null;
		l_IMPORT_TRN_TYP_val = null;
		l_INSPC_ACPT_APP_TYP_name = null;
		l_INSPC_ACPT_APP_TYP_val = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_h_APR_VEND_CTRL = null;
		l_COUNT = null;
		l_COMPANY_CD = null;
		l_VEND_CLASS_01_TYP = null;
		l_VEND_CLASS_02_TYP = null;
		l_VEND_CLASS_03_TYP = null;
		l_VEND_CLASS_04_TYP = null;
		l_VEND_CLASS_05_TYP = null;
		l_VEND_CLASS_06_TYP = null;
		l_VEND_CLASS_07_TYP = null;
		l_VEND_CLASS_08_TYP = null;
		l_VEND_CLASS_09_TYP = null;
		l_VEND_CLASS_10_TYP = null;
		l_VEND_CD = null;
		l_h_VEND_CD = null;
		l_VEND_NAME = null;
		l_VEND_ANAME = null;
		l_VEND_KNAME = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_ADDRESS_K_1 = null;
		l_ADDRESS_K_2 = null;
		l_TEL = null;
		l_FAX = null;
		l_EMAIL = null;
		l_VEND_ORG = null;
		l_VEND_PERSON = null;
		l_OWN_ORG_CD = null;
		l_OWN_ORG_NAME = null;
		l_OWN_PERSON_CD = null;
		l_OWN_PERSON_NAME = null;
		l_ROUND_TYP = null;
		l_INSPC_ACPT_APP_TYP = null;
		l_TAX_CD = null;
		l_TAX_APPLY_TYP = null;
		l_TAX_CALC_TYP = null;
		l_ODR_FORM_FLG = null;
		l_ODR_EDI_FLG = null;
		l_ODR_FAX_FLG = null;
		l_ODR_MAIL_FLG = null;
		l_VEND_REM = null;
		l_MODIFY_COUNT = null;
		l_EXCH_TYP = null;
		l_IMPORT_TRN_TYP = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_CTRL_CD = null;
		l_ONEROUS_CONS_NO = null;
		l_PUCH_ODR_CD = null;
		l_w_VEND_CD = null;
		l_INSTALL_FLG = null;
		l_OPTION_ID = null;

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
	 * medAA0070010クラスの標準コンストラクタ
	 */
	public AA0070010Struct()
	{
		//{{user_implement_code_constractor
		m_ROUND_TYP = new Integer(1);
		m_TAX_APPLY_TYP = new Integer(2);
		m_TAX_CALC_TYP = new Integer(1);
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
	public void setStruct(AA0070010Struct struct)
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
	public void setStructM(AA0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setROUND_TYP_name(struct.getROUND_TYP_name());
			this.setROUND_TYP_val(struct.getROUND_TYP_val());
			this.setTAX_APPLY_TYP_name(struct.getTAX_APPLY_TYP_name());
			this.setTAX_APPLY_TYP_val(struct.getTAX_APPLY_TYP_val());
			this.setTAX_CALC_TYP_name(struct.getTAX_CALC_TYP_name());
			this.setTAX_CALC_TYP_val(struct.getTAX_CALC_TYP_val());
			this.setEXCH_TYP_name(struct.getEXCH_TYP_name());
			this.setEXCH_TYP_val(struct.getEXCH_TYP_val());
			this.setIMPORT_TRN_TYP_name(struct.getIMPORT_TRN_TYP_name());
			this.setIMPORT_TRN_TYP_val(struct.getIMPORT_TRN_TYP_val());
			this.setINSPC_ACPT_APP_TYP_name(struct.getINSPC_ACPT_APP_TYP_name());
			this.setINSPC_ACPT_APP_TYP_val(struct.getINSPC_ACPT_APP_TYP_val());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_VEND_CTRL(struct.geth_APR_VEND_CTRL());
			this.setCOUNT(struct.getCOUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CLASS_01_TYP(struct.getVEND_CLASS_01_TYP());
			this.setVEND_CLASS_02_TYP(struct.getVEND_CLASS_02_TYP());
			this.setVEND_CLASS_03_TYP(struct.getVEND_CLASS_03_TYP());
			this.setVEND_CLASS_04_TYP(struct.getVEND_CLASS_04_TYP());
			this.setVEND_CLASS_05_TYP(struct.getVEND_CLASS_05_TYP());
			this.setVEND_CLASS_06_TYP(struct.getVEND_CLASS_06_TYP());
			this.setVEND_CLASS_07_TYP(struct.getVEND_CLASS_07_TYP());
			this.setVEND_CLASS_08_TYP(struct.getVEND_CLASS_08_TYP());
			this.setVEND_CLASS_09_TYP(struct.getVEND_CLASS_09_TYP());
			this.setVEND_CLASS_10_TYP(struct.getVEND_CLASS_10_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.seth_VEND_CD(struct.geth_VEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setVEND_KNAME(struct.getVEND_KNAME());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setADDRESS_K_1(struct.getADDRESS_K_1());
			this.setADDRESS_K_2(struct.getADDRESS_K_2());
			this.setTEL(struct.getTEL());
			this.setFAX(struct.getFAX());
			this.setEMAIL(struct.getEMAIL());
			this.setVEND_ORG(struct.getVEND_ORG());
			this.setVEND_PERSON(struct.getVEND_PERSON());
			this.setOWN_ORG_CD(struct.getOWN_ORG_CD());
			this.setOWN_ORG_NAME(struct.getOWN_ORG_NAME());
			this.setOWN_PERSON_CD(struct.getOWN_PERSON_CD());
			this.setOWN_PERSON_NAME(struct.getOWN_PERSON_NAME());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setINSPC_ACPT_APP_TYP(struct.getINSPC_ACPT_APP_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setTAX_CALC_TYP(struct.getTAX_CALC_TYP());
			this.setODR_FORM_FLG(struct.getODR_FORM_FLG());
			this.setODR_EDI_FLG(struct.getODR_EDI_FLG());
			this.setODR_FAX_FLG(struct.getODR_FAX_FLG());
			this.setODR_MAIL_FLG(struct.getODR_MAIL_FLG());
			this.setVEND_REM(struct.getVEND_REM());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setIMPORT_TRN_TYP(struct.getIMPORT_TRN_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCTRL_CD(struct.getCTRL_CD());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setw_VEND_CD(struct.getw_VEND_CD());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setOPTION_ID(struct.getOPTION_ID());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ROUND_TYP_name(struct.getList_ROUND_TYP_name());
			this.setList_ROUND_TYP_val(struct.getList_ROUND_TYP_val());
			this.setList_TAX_APPLY_TYP_name(struct.getList_TAX_APPLY_TYP_name());
			this.setList_TAX_APPLY_TYP_val(struct.getList_TAX_APPLY_TYP_val());
			this.setList_TAX_CALC_TYP_name(struct.getList_TAX_CALC_TYP_name());
			this.setList_TAX_CALC_TYP_val(struct.getList_TAX_CALC_TYP_val());
			this.setList_EXCH_TYP_name(struct.getList_EXCH_TYP_name());
			this.setList_EXCH_TYP_val(struct.getList_EXCH_TYP_val());
			this.setList_IMPORT_TRN_TYP_name(struct.getList_IMPORT_TRN_TYP_name());
			this.setList_IMPORT_TRN_TYP_val(struct.getList_IMPORT_TRN_TYP_val());
			this.setList_INSPC_ACPT_APP_TYP_name(struct.getList_INSPC_ACPT_APP_TYP_name());
			this.setList_INSPC_ACPT_APP_TYP_val(struct.getList_INSPC_ACPT_APP_TYP_val());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_VEND_CTRL(struct.getList_h_APR_VEND_CTRL());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CLASS_01_TYP(struct.getList_VEND_CLASS_01_TYP());
			this.setList_VEND_CLASS_02_TYP(struct.getList_VEND_CLASS_02_TYP());
			this.setList_VEND_CLASS_03_TYP(struct.getList_VEND_CLASS_03_TYP());
			this.setList_VEND_CLASS_04_TYP(struct.getList_VEND_CLASS_04_TYP());
			this.setList_VEND_CLASS_05_TYP(struct.getList_VEND_CLASS_05_TYP());
			this.setList_VEND_CLASS_06_TYP(struct.getList_VEND_CLASS_06_TYP());
			this.setList_VEND_CLASS_07_TYP(struct.getList_VEND_CLASS_07_TYP());
			this.setList_VEND_CLASS_08_TYP(struct.getList_VEND_CLASS_08_TYP());
			this.setList_VEND_CLASS_09_TYP(struct.getList_VEND_CLASS_09_TYP());
			this.setList_VEND_CLASS_10_TYP(struct.getList_VEND_CLASS_10_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_h_VEND_CD(struct.getList_h_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_VEND_KNAME(struct.getList_VEND_KNAME());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_ADDRESS_K_1(struct.getList_ADDRESS_K_1());
			this.setList_ADDRESS_K_2(struct.getList_ADDRESS_K_2());
			this.setList_TEL(struct.getList_TEL());
			this.setList_FAX(struct.getList_FAX());
			this.setList_EMAIL(struct.getList_EMAIL());
			this.setList_VEND_ORG(struct.getList_VEND_ORG());
			this.setList_VEND_PERSON(struct.getList_VEND_PERSON());
			this.setList_OWN_ORG_CD(struct.getList_OWN_ORG_CD());
			this.setList_OWN_ORG_NAME(struct.getList_OWN_ORG_NAME());
			this.setList_OWN_PERSON_CD(struct.getList_OWN_PERSON_CD());
			this.setList_OWN_PERSON_NAME(struct.getList_OWN_PERSON_NAME());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_INSPC_ACPT_APP_TYP(struct.getList_INSPC_ACPT_APP_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_TAX_CALC_TYP(struct.getList_TAX_CALC_TYP());
			this.setList_ODR_FORM_FLG(struct.getList_ODR_FORM_FLG());
			this.setList_ODR_EDI_FLG(struct.getList_ODR_EDI_FLG());
			this.setList_ODR_FAX_FLG(struct.getList_ODR_FAX_FLG());
			this.setList_ODR_MAIL_FLG(struct.getList_ODR_MAIL_FLG());
			this.setList_VEND_REM(struct.getList_VEND_REM());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_IMPORT_TRN_TYP(struct.getList_IMPORT_TRN_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CTRL_CD(struct.getList_CTRL_CD());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_w_VEND_CD(struct.getList_w_VEND_CD());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
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
	// 第 1 変数初期値： i_ROUND_TYP_name


	final static String i_ROUND_TYP_name = null;

	// 第 2 変数初期値： i_ROUND_TYP_val


	final static String i_ROUND_TYP_val = null;

	// 第 3 変数初期値： i_TAX_APPLY_TYP_name


	final static String i_TAX_APPLY_TYP_name = null;

	// 第 4 変数初期値： i_TAX_APPLY_TYP_val


	final static String i_TAX_APPLY_TYP_val = null;

	// 第 5 変数初期値： i_TAX_CALC_TYP_name


	final static String i_TAX_CALC_TYP_name = null;

	// 第 6 変数初期値： i_TAX_CALC_TYP_val


	final static String i_TAX_CALC_TYP_val = null;

	// 第 7 変数初期値： i_EXCH_TYP_name


	final static String i_EXCH_TYP_name = null;

	// 第 8 変数初期値： i_EXCH_TYP_val


	final static String i_EXCH_TYP_val = null;

	// 第 9 変数初期値： i_IMPORT_TRN_TYP_name


	final static String i_IMPORT_TRN_TYP_name = null;

	// 第 10 変数初期値： i_IMPORT_TRN_TYP_val


	final static String i_IMPORT_TRN_TYP_val = null;

	// 第 11 変数初期値： i_INSPC_ACPT_APP_TYP_name


	final static String i_INSPC_ACPT_APP_TYP_name = null;

	// 第 12 変数初期値： i_INSPC_ACPT_APP_TYP_val


	final static String i_INSPC_ACPT_APP_TYP_val = null;

	// 第 13 変数初期値： i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// 第 14 変数初期値： i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// 第 15 変数初期値： i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// 第 16 変数初期値： i_h_APR_VEND_CTRL


	final static String i_h_APR_VEND_CTRL = null;

	// 第 17 変数初期値： i_COUNT


	final static Integer i_COUNT = null;

	// 第 18 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 19 変数初期値： i_VEND_CLASS_01_TYP


	final static String i_VEND_CLASS_01_TYP = null;

	// 第 20 変数初期値： i_VEND_CLASS_02_TYP


	final static String i_VEND_CLASS_02_TYP = null;

	// 第 21 変数初期値： i_VEND_CLASS_03_TYP


	final static String i_VEND_CLASS_03_TYP = null;

	// 第 22 変数初期値： i_VEND_CLASS_04_TYP


	final static String i_VEND_CLASS_04_TYP = null;

	// 第 23 変数初期値： i_VEND_CLASS_05_TYP


	final static String i_VEND_CLASS_05_TYP = null;

	// 第 24 変数初期値： i_VEND_CLASS_06_TYP


	final static String i_VEND_CLASS_06_TYP = null;

	// 第 25 変数初期値： i_VEND_CLASS_07_TYP


	final static String i_VEND_CLASS_07_TYP = null;

	// 第 26 変数初期値： i_VEND_CLASS_08_TYP


	final static String i_VEND_CLASS_08_TYP = null;

	// 第 27 変数初期値： i_VEND_CLASS_09_TYP


	final static String i_VEND_CLASS_09_TYP = null;

	// 第 28 変数初期値： i_VEND_CLASS_10_TYP


	final static String i_VEND_CLASS_10_TYP = null;

	// 第 29 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 30 変数初期値： i_h_VEND_CD


	final static String i_h_VEND_CD = null;

	// 第 31 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 32 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 33 変数初期値： i_VEND_KNAME


	final static String i_VEND_KNAME = null;

	// 第 34 変数初期値： i_ZIP_CD


	final static String i_ZIP_CD = null;

	// 第 35 変数初期値： i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// 第 36 変数初期値： i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// 第 37 変数初期値： i_ADDRESS_K_1


	final static String i_ADDRESS_K_1 = null;

	// 第 38 変数初期値： i_ADDRESS_K_2


	final static String i_ADDRESS_K_2 = null;

	// 第 39 変数初期値： i_TEL


	final static String i_TEL = null;

	// 第 40 変数初期値： i_FAX


	final static String i_FAX = null;

	// 第 41 変数初期値： i_EMAIL


	final static String i_EMAIL = null;

	// 第 42 変数初期値： i_VEND_ORG


	final static String i_VEND_ORG = null;

	// 第 43 変数初期値： i_VEND_PERSON


	final static String i_VEND_PERSON = null;

	// 第 44 変数初期値： i_OWN_ORG_CD


	final static String i_OWN_ORG_CD = null;

	// 第 45 変数初期値： i_OWN_ORG_NAME


	final static String i_OWN_ORG_NAME = null;

	// 第 46 変数初期値： i_OWN_PERSON_CD


	final static String i_OWN_PERSON_CD = null;

	// 第 47 変数初期値： i_OWN_PERSON_NAME


	final static String i_OWN_PERSON_NAME = null;

	// 第 48 変数初期値： i_ROUND_TYP


	final static Integer i_ROUND_TYP = null;

	// 第 49 変数初期値： i_INSPC_ACPT_APP_TYP


	final static String i_INSPC_ACPT_APP_TYP = null;

	// 第 50 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 51 変数初期値： i_TAX_APPLY_TYP


	final static Integer i_TAX_APPLY_TYP = null;

	// 第 52 変数初期値： i_TAX_CALC_TYP


	final static Integer i_TAX_CALC_TYP = null;

	// 第 53 変数初期値： i_ODR_FORM_FLG


	final static String i_ODR_FORM_FLG = null;

	// 第 54 変数初期値： i_ODR_EDI_FLG


	final static String i_ODR_EDI_FLG = null;

	// 第 55 変数初期値： i_ODR_FAX_FLG


	final static String i_ODR_FAX_FLG = null;

	// 第 56 変数初期値： i_ODR_MAIL_FLG


	final static String i_ODR_MAIL_FLG = null;

	// 第 57 変数初期値： i_VEND_REM


	final static String i_VEND_REM = null;

	// 第 58 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 59 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 60 変数初期値： i_IMPORT_TRN_TYP


	final static String i_IMPORT_TRN_TYP = null;

	// 第 61 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 62 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 63 変数初期値： i_CTRL_CD


	final static String i_CTRL_CD = null;

	// 第 64 変数初期値： i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// 第 65 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 66 変数初期値： i_w_VEND_CD


	final static String i_w_VEND_CD = null;

	// 第 67 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 68 変数初期値： i_OPTION_ID


	final static String i_OPTION_ID = null;

*/

	//{{user_implement_code
	private boolean m_disable = true;
	public boolean isDisabled() {return m_disable;}
	public void setDisabled(boolean disable) {m_disable = disable;}

	public void init()
	{
		m_VEND_CD = null;
		m_h_VEND_CD = null;
		m_VEND_NAME = null;
		m_VEND_ANAME = null;
		m_VEND_KNAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_EMAIL = null;
		m_VEND_ORG = null;
		m_VEND_PERSON = null;
		m_OWN_ORG_CD = null;
		m_OWN_ORG_NAME = null;
		m_OWN_PERSON_CD = null;
		m_OWN_PERSON_NAME = null;
		m_INSPC_ACPT_APP_TYP = null;
		m_ROUND_TYP = new Integer(1);
		m_TAX_CD = null;
		m_TAX_APPLY_TYP = new Integer(2);
		m_TAX_CALC_TYP = new Integer(1);
		m_ODR_FORM_FLG = null;
		m_ODR_EDI_FLG = null;
		m_ODR_FAX_FLG = null;
		m_ODR_MAIL_FLG = null;
		m_VEND_REM = null;
		m_COUNT = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_COMPANY_CD = null;
		m_INSPC_ACPT_APP_TYP_name = null;
		m_INSPC_ACPT_APP_TYP_val = null;
		m_ROUND_TYP_name = null;
		m_ROUND_TYP_val = null;
		m_TAX_APPLY_TYP_name = null;
		m_TAX_APPLY_TYP_val = null;
		m_TAX_CALC_TYP_name = null;
		m_TAX_CALC_TYP_val = null;
		m_EXCH_TYP = null;
		m_EXCH_TYP_name = null;
		m_EXCH_TYP_val = null;
		m_IMPORT_TRN_TYP = null;
		m_IMPORT_TRN_TYP_name = null;
		m_IMPORT_TRN_TYP_val = null;
		m_EXCH_TYP = null;
		m_IMPORT_TRN_TYP = null;
		m_disable = true;
	}

	public void copy(AA0070010Struct s)
	{
		clear();
		if(s.m_VEND_CD != null) m_VEND_CD = new String(s.m_VEND_CD);
		if(s.m_h_VEND_CD != null) m_h_VEND_CD = new String(s.m_h_VEND_CD);
		if(s.m_VEND_NAME != null) m_VEND_NAME = new String(s.m_VEND_NAME);
		if(s.m_VEND_ANAME != null) m_VEND_ANAME = new String(s.m_VEND_ANAME);
		if(s.m_VEND_KNAME != null) m_VEND_KNAME = new String(s.m_VEND_KNAME);
		if(s.m_ZIP_CD != null) m_ZIP_CD = new String(s.m_ZIP_CD);
		if(s.m_ADDRESS_1 != null) m_ADDRESS_1 = new String(s.m_ADDRESS_1);
		if(s.m_ADDRESS_2 != null) m_ADDRESS_2 = new String(s.m_ADDRESS_2);
		if(s.m_ADDRESS_K_1 != null) m_ADDRESS_K_1 = new String(s.m_ADDRESS_K_1);
		if(s.m_ADDRESS_K_2 != null) m_ADDRESS_K_2 = new String(s.m_ADDRESS_K_2);
		if(s.m_TEL != null) m_TEL = new String(s.m_TEL);
		if(s.m_FAX != null) m_FAX = new String(s.m_FAX);
		if(s.m_EMAIL != null) m_EMAIL = new String(s.m_EMAIL);
		if(s.m_VEND_ORG != null) m_VEND_ORG = new String(s.m_VEND_ORG);
		if(s.m_VEND_PERSON != null) m_VEND_PERSON = new String(s.m_VEND_PERSON);
		if(s.m_OWN_ORG_CD != null) m_OWN_ORG_CD = new String(s.m_OWN_ORG_CD);
		if(s.m_OWN_ORG_NAME != null) m_OWN_ORG_NAME = new String(s.m_OWN_ORG_NAME);
		if(s.m_OWN_PERSON_CD != null) m_OWN_PERSON_CD = new String(s.m_OWN_PERSON_CD);
		if(s.m_OWN_PERSON_NAME != null) m_OWN_PERSON_NAME = new String(s.m_OWN_PERSON_NAME);
		if(s.m_INSPC_ACPT_APP_TYP != null) m_INSPC_ACPT_APP_TYP = new String(s.m_INSPC_ACPT_APP_TYP);
		if(s.m_ROUND_TYP != null) m_ROUND_TYP = new Integer(s.m_ROUND_TYP.intValue());
		if(s.m_TAX_CD != null) m_TAX_CD = new String(s.m_TAX_CD);
		if(s.m_TAX_APPLY_TYP != null) m_TAX_APPLY_TYP = new Integer(s.m_TAX_APPLY_TYP.intValue());
		if(s.m_TAX_CALC_TYP != null) m_TAX_CALC_TYP = new Integer(s.m_TAX_CALC_TYP.intValue());
		if(s.m_ODR_FORM_FLG != null) m_ODR_FORM_FLG = new String(s.m_ODR_FORM_FLG);
		if(s.m_ODR_EDI_FLG != null) m_ODR_EDI_FLG = new String(s.m_ODR_EDI_FLG);
		if(s.m_ODR_FAX_FLG != null) m_ODR_FAX_FLG = new String(s.m_ODR_FAX_FLG);
		if(s.m_ODR_MAIL_FLG != null) m_ODR_MAIL_FLG = new String(s.m_ODR_MAIL_FLG);
		if(s.m_VEND_REM != null) m_VEND_REM = new String(s.m_VEND_REM);
		if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
		if(s.m_CUR_CD != null) m_CUR_CD = new String(s.m_CUR_CD);
		if(s.m_CUR_NAME != null) m_CUR_NAME = new String(s.m_CUR_NAME);
		if(s.m_COMPANY_CD != null) m_COMPANY_CD = new String(s.m_COMPANY_CD);
		if(s.m_INSPC_ACPT_APP_TYP_name != null) m_INSPC_ACPT_APP_TYP_name = new String(s.m_INSPC_ACPT_APP_TYP_name);
		if(s.m_INSPC_ACPT_APP_TYP_val != null) m_INSPC_ACPT_APP_TYP_val = new String(s.m_INSPC_ACPT_APP_TYP_val);
		if(s.m_ROUND_TYP_name != null) m_ROUND_TYP_name = new String(s.m_ROUND_TYP_name);
		if(s.m_ROUND_TYP_val != null) m_ROUND_TYP_val = new String(s.m_ROUND_TYP_val);
		if(s.m_TAX_APPLY_TYP_name != null) m_TAX_APPLY_TYP_name = new String(s.m_TAX_APPLY_TYP_name);
		if(s.m_TAX_APPLY_TYP_val != null) m_TAX_APPLY_TYP_val = new String(s.m_TAX_APPLY_TYP_val);
		if(s.m_TAX_CALC_TYP_name != null) m_TAX_CALC_TYP_name = new String(s.m_TAX_CALC_TYP_name);
		if(s.m_TAX_CALC_TYP_val != null) m_TAX_CALC_TYP_val = new String(s.m_TAX_CALC_TYP_val);
		if(s.m_EXCH_TYP_name != null) m_EXCH_TYP_name = new String(s.m_EXCH_TYP_name);
		if(s.m_EXCH_TYP_val != null) m_EXCH_TYP_val = new String(s.m_EXCH_TYP_val);
		if(s.m_IMPORT_TRN_TYP_name != null) m_IMPORT_TRN_TYP_name = new String(s.m_IMPORT_TRN_TYP_name);
		if(s.m_IMPORT_TRN_TYP_val != null) m_IMPORT_TRN_TYP_val = new String(s.m_IMPORT_TRN_TYP_val);
		if(s.m_EXCH_TYP != null) m_EXCH_TYP = new String(s.m_EXCH_TYP);
		if(s.m_IMPORT_TRN_TYP != null) m_IMPORT_TRN_TYP = new String(s.m_IMPORT_TRN_TYP);
		if(s.m_COUNT != null) m_COUNT = new Integer(s.m_COUNT.intValue());
		if(s.m_h_APPR_ID != null) m_h_APPR_ID = new String(s.m_h_APPR_ID);
		if(s.m_h_APR_VEND_CTRL != null) m_h_APR_VEND_CTRL = new String(s.m_h_APR_VEND_CTRL);
		if(s.m_h_SCREENMOVE_TYP != null) m_h_SCREENMOVE_TYP = new String(s.m_h_SCREENMOVE_TYP);
	}

	/**
	 * 値校正処理
	 *
	 * @param なし
	 */
	public void revise()
	{
		if("".equals(m_TAX_CD))
		{
			m_TAX_CD = null;
		}
	}
        //}}user_implement_code

	//////////////////////////////

}
