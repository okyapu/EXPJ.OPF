/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080;

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
 * CLASS     : AD0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/22 09:52:46 $
 *
 */
//}}user_implement_code_header

public class AD0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FileName */
	public String m_FileName = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** 第 4 変数： m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** 第 5 変数： m_OPR_RSLT_TEMP_CTL_NO */
	public String m_OPR_RSLT_TEMP_CTL_NO = null;
	/** 第 6 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 7 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 8 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 9 変数： m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** 第 10 変数： m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** 第 11 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 12 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 13 変数： m_OPR_RSLT_PERSON */
	public String m_OPR_RSLT_PERSON = null;
	/** 第 14 変数： m_OPR_RSLT_COMMENT */
	public String m_OPR_RSLT_COMMENT = null;
	/** 第 15 変数： m_OPR_TIME_UNIT_TYP */
	public String m_OPR_TIME_UNIT_TYP = null;
	/** 第 16 変数： m_PRE_ARRANGEMENT_TIME */
	public String m_PRE_ARRANGEMENT_TIME = null;
	/** 第 17 変数： m_POST_ARRANGEMENT_TIME */
	public String m_POST_ARRANGEMENT_TIME = null;
	/** 第 18 変数： m_OPR_TIME */
	public String m_OPR_TIME = null;
	/** 第 19 変数： m_CESSATION_TIME */
	public String m_CESSATION_TIME = null;
	/** 第 20 変数： m_CESSATION_CAUSE */
	public String m_CESSATION_CAUSE = null;
	/** 第 21 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 22 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 23 変数： m_DEFECT_CAUSE_CD1 */
	public String m_DEFECT_CAUSE_CD1 = null;
	/** 第 24 変数： m_DEFECT_QTY1 */
	public String m_DEFECT_QTY1 = null;
	/** 第 25 変数： m_DEFECT_COMMENT1 */
	public String m_DEFECT_COMMENT1 = null;
	/** 第 26 変数： m_DEFECT_CAUSE_CD2 */
	public String m_DEFECT_CAUSE_CD2 = null;
	/** 第 27 変数： m_DEFECT_QTY2 */
	public String m_DEFECT_QTY2 = null;
	/** 第 28 変数： m_DEFECT_COMMENT2 */
	public String m_DEFECT_COMMENT2 = null;
	/** 第 29 変数： m_DEFECT_CAUSE_CD3 */
	public String m_DEFECT_CAUSE_CD3 = null;
	/** 第 30 変数： m_DEFECT_QTY3 */
	public String m_DEFECT_QTY3 = null;
	/** 第 31 変数： m_DEFECT_COMMENT3 */
	public String m_DEFECT_COMMENT3 = null;
	/** 第 32 変数： m_DEFECT_CAUSE_CD4 */
	public String m_DEFECT_CAUSE_CD4 = null;
	/** 第 33 変数： m_DEFECT_QTY4 */
	public String m_DEFECT_QTY4 = null;
	/** 第 34 変数： m_DEFECT_COMMENT4 */
	public String m_DEFECT_COMMENT4 = null;
	/** 第 35 変数： m_DEFECT_CAUSE_CD5 */
	public String m_DEFECT_CAUSE_CD5 = null;
	/** 第 36 変数： m_DEFECT_QTY5 */
	public String m_DEFECT_QTY5 = null;
	/** 第 37 変数： m_DEFECT_COMMENT5 */
	public String m_DEFECT_COMMENT5 = null;
	/** 第 38 変数： m_OPR_CMPLT_FLG */
	public String m_OPR_CMPLT_FLG = null;
	/** 第 39 変数： m_TAKE_DATE */
	public String m_TAKE_DATE = null;
	/** 第 40 変数： m_CHILD_RSLTUPDATE_FLG */
	public String m_CHILD_RSLTUPDATE_FLG = null;
	/** 第 41 変数： m_USER_CD */
	public String m_USER_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** 第 4 List変数： l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** 第 5 List変数： l_OPR_RSLT_TEMP_CTL_NO */
	public List l_OPR_RSLT_TEMP_CTL_NO = null;

	/** 第 6 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 7 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 8 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 9 List変数： l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** 第 10 List変数： l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** 第 11 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 12 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 13 List変数： l_OPR_RSLT_PERSON */
	public List l_OPR_RSLT_PERSON = null;

	/** 第 14 List変数： l_OPR_RSLT_COMMENT */
	public List l_OPR_RSLT_COMMENT = null;

	/** 第 15 List変数： l_OPR_TIME_UNIT_TYP */
	public List l_OPR_TIME_UNIT_TYP = null;

	/** 第 16 List変数： l_PRE_ARRANGEMENT_TIME */
	public List l_PRE_ARRANGEMENT_TIME = null;

	/** 第 17 List変数： l_POST_ARRANGEMENT_TIME */
	public List l_POST_ARRANGEMENT_TIME = null;

	/** 第 18 List変数： l_OPR_TIME */
	public List l_OPR_TIME = null;

	/** 第 19 List変数： l_CESSATION_TIME */
	public List l_CESSATION_TIME = null;

	/** 第 20 List変数： l_CESSATION_CAUSE */
	public List l_CESSATION_CAUSE = null;

	/** 第 21 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 22 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 23 List変数： l_DEFECT_CAUSE_CD1 */
	public List l_DEFECT_CAUSE_CD1 = null;

	/** 第 24 List変数： l_DEFECT_QTY1 */
	public List l_DEFECT_QTY1 = null;

	/** 第 25 List変数： l_DEFECT_COMMENT1 */
	public List l_DEFECT_COMMENT1 = null;

	/** 第 26 List変数： l_DEFECT_CAUSE_CD2 */
	public List l_DEFECT_CAUSE_CD2 = null;

	/** 第 27 List変数： l_DEFECT_QTY2 */
	public List l_DEFECT_QTY2 = null;

	/** 第 28 List変数： l_DEFECT_COMMENT2 */
	public List l_DEFECT_COMMENT2 = null;

	/** 第 29 List変数： l_DEFECT_CAUSE_CD3 */
	public List l_DEFECT_CAUSE_CD3 = null;

	/** 第 30 List変数： l_DEFECT_QTY3 */
	public List l_DEFECT_QTY3 = null;

	/** 第 31 List変数： l_DEFECT_COMMENT3 */
	public List l_DEFECT_COMMENT3 = null;

	/** 第 32 List変数： l_DEFECT_CAUSE_CD4 */
	public List l_DEFECT_CAUSE_CD4 = null;

	/** 第 33 List変数： l_DEFECT_QTY4 */
	public List l_DEFECT_QTY4 = null;

	/** 第 34 List変数： l_DEFECT_COMMENT4 */
	public List l_DEFECT_COMMENT4 = null;

	/** 第 35 List変数： l_DEFECT_CAUSE_CD5 */
	public List l_DEFECT_CAUSE_CD5 = null;

	/** 第 36 List変数： l_DEFECT_QTY5 */
	public List l_DEFECT_QTY5 = null;

	/** 第 37 List変数： l_DEFECT_COMMENT5 */
	public List l_DEFECT_COMMENT5 = null;

	/** 第 38 List変数： l_OPR_CMPLT_FLG */
	public List l_OPR_CMPLT_FLG = null;

	/** 第 39 List変数： l_TAKE_DATE */
	public List l_TAKE_DATE = null;

	/** 第 40 List変数： l_CHILD_RSLTUPDATE_FLG */
	public List l_CHILD_RSLTUPDATE_FLG = null;

	/** 第 41 List変数： l_USER_CD */
	public List l_USER_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getOPR_RSLT_TEMP_CTL_NO() { return m_OPR_RSLT_TEMP_CTL_NO; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOPR_RSLT_PERSON() { return m_OPR_RSLT_PERSON; }
	public String getOPR_RSLT_COMMENT() { return m_OPR_RSLT_COMMENT; }
	public String getOPR_TIME_UNIT_TYP() { return m_OPR_TIME_UNIT_TYP; }
	public String getPRE_ARRANGEMENT_TIME() { return m_PRE_ARRANGEMENT_TIME; }
	public String getPOST_ARRANGEMENT_TIME() { return m_POST_ARRANGEMENT_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getCESSATION_TIME() { return m_CESSATION_TIME; }
	public String getCESSATION_CAUSE() { return m_CESSATION_CAUSE; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getDEFECT_CAUSE_CD1() { return m_DEFECT_CAUSE_CD1; }
	public String getDEFECT_QTY1() { return m_DEFECT_QTY1; }
	public String getDEFECT_COMMENT1() { return m_DEFECT_COMMENT1; }
	public String getDEFECT_CAUSE_CD2() { return m_DEFECT_CAUSE_CD2; }
	public String getDEFECT_QTY2() { return m_DEFECT_QTY2; }
	public String getDEFECT_COMMENT2() { return m_DEFECT_COMMENT2; }
	public String getDEFECT_CAUSE_CD3() { return m_DEFECT_CAUSE_CD3; }
	public String getDEFECT_QTY3() { return m_DEFECT_QTY3; }
	public String getDEFECT_COMMENT3() { return m_DEFECT_COMMENT3; }
	public String getDEFECT_CAUSE_CD4() { return m_DEFECT_CAUSE_CD4; }
	public String getDEFECT_QTY4() { return m_DEFECT_QTY4; }
	public String getDEFECT_COMMENT4() { return m_DEFECT_COMMENT4; }
	public String getDEFECT_CAUSE_CD5() { return m_DEFECT_CAUSE_CD5; }
	public String getDEFECT_QTY5() { return m_DEFECT_QTY5; }
	public String getDEFECT_COMMENT5() { return m_DEFECT_COMMENT5; }
	public String getOPR_CMPLT_FLG() { return m_OPR_CMPLT_FLG; }
	public String getTAKE_DATE() { return m_TAKE_DATE; }
	public String getCHILD_RSLTUPDATE_FLG() { return m_CHILD_RSLTUPDATE_FLG; }
	public String getUSER_CD() { return m_USER_CD; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_OPR_RSLT_TEMP_CTL_NO() { return l_OPR_RSLT_TEMP_CTL_NO; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OPR_RSLT_PERSON() { return l_OPR_RSLT_PERSON; }
	public List getList_OPR_RSLT_COMMENT() { return l_OPR_RSLT_COMMENT; }
	public List getList_OPR_TIME_UNIT_TYP() { return l_OPR_TIME_UNIT_TYP; }
	public List getList_PRE_ARRANGEMENT_TIME() { return l_PRE_ARRANGEMENT_TIME; }
	public List getList_POST_ARRANGEMENT_TIME() { return l_POST_ARRANGEMENT_TIME; }
	public List getList_OPR_TIME() { return l_OPR_TIME; }
	public List getList_CESSATION_TIME() { return l_CESSATION_TIME; }
	public List getList_CESSATION_CAUSE() { return l_CESSATION_CAUSE; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_DEFECT_CAUSE_CD1() { return l_DEFECT_CAUSE_CD1; }
	public List getList_DEFECT_QTY1() { return l_DEFECT_QTY1; }
	public List getList_DEFECT_COMMENT1() { return l_DEFECT_COMMENT1; }
	public List getList_DEFECT_CAUSE_CD2() { return l_DEFECT_CAUSE_CD2; }
	public List getList_DEFECT_QTY2() { return l_DEFECT_QTY2; }
	public List getList_DEFECT_COMMENT2() { return l_DEFECT_COMMENT2; }
	public List getList_DEFECT_CAUSE_CD3() { return l_DEFECT_CAUSE_CD3; }
	public List getList_DEFECT_QTY3() { return l_DEFECT_QTY3; }
	public List getList_DEFECT_COMMENT3() { return l_DEFECT_COMMENT3; }
	public List getList_DEFECT_CAUSE_CD4() { return l_DEFECT_CAUSE_CD4; }
	public List getList_DEFECT_QTY4() { return l_DEFECT_QTY4; }
	public List getList_DEFECT_COMMENT4() { return l_DEFECT_COMMENT4; }
	public List getList_DEFECT_CAUSE_CD5() { return l_DEFECT_CAUSE_CD5; }
	public List getList_DEFECT_QTY5() { return l_DEFECT_QTY5; }
	public List getList_DEFECT_COMMENT5() { return l_DEFECT_COMMENT5; }
	public List getList_OPR_CMPLT_FLG() { return l_OPR_CMPLT_FLG; }
	public List getList_TAKE_DATE() { return l_TAKE_DATE; }
	public List getList_CHILD_RSLTUPDATE_FLG() { return l_CHILD_RSLTUPDATE_FLG; }
	public List getList_USER_CD() { return l_USER_CD; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setOPR_RSLT_TEMP_CTL_NO(String val) { m_OPR_RSLT_TEMP_CTL_NO = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOPR_RSLT_PERSON(String val) { m_OPR_RSLT_PERSON = val; }
	public void setOPR_RSLT_COMMENT(String val) { m_OPR_RSLT_COMMENT = val; }
	public void setOPR_TIME_UNIT_TYP(String val) { m_OPR_TIME_UNIT_TYP = val; }
	public void setPRE_ARRANGEMENT_TIME(String val) { m_PRE_ARRANGEMENT_TIME = val; }
	public void setPOST_ARRANGEMENT_TIME(String val) { m_POST_ARRANGEMENT_TIME = val; }
	public void setOPR_TIME(String val) { m_OPR_TIME = val; }
	public void setCESSATION_TIME(String val) { m_CESSATION_TIME = val; }
	public void setCESSATION_CAUSE(String val) { m_CESSATION_CAUSE = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setDEFECT_CAUSE_CD1(String val) { m_DEFECT_CAUSE_CD1 = val; }
	public void setDEFECT_QTY1(String val) { m_DEFECT_QTY1 = val; }
	public void setDEFECT_COMMENT1(String val) { m_DEFECT_COMMENT1 = val; }
	public void setDEFECT_CAUSE_CD2(String val) { m_DEFECT_CAUSE_CD2 = val; }
	public void setDEFECT_QTY2(String val) { m_DEFECT_QTY2 = val; }
	public void setDEFECT_COMMENT2(String val) { m_DEFECT_COMMENT2 = val; }
	public void setDEFECT_CAUSE_CD3(String val) { m_DEFECT_CAUSE_CD3 = val; }
	public void setDEFECT_QTY3(String val) { m_DEFECT_QTY3 = val; }
	public void setDEFECT_COMMENT3(String val) { m_DEFECT_COMMENT3 = val; }
	public void setDEFECT_CAUSE_CD4(String val) { m_DEFECT_CAUSE_CD4 = val; }
	public void setDEFECT_QTY4(String val) { m_DEFECT_QTY4 = val; }
	public void setDEFECT_COMMENT4(String val) { m_DEFECT_COMMENT4 = val; }
	public void setDEFECT_CAUSE_CD5(String val) { m_DEFECT_CAUSE_CD5 = val; }
	public void setDEFECT_QTY5(String val) { m_DEFECT_QTY5 = val; }
	public void setDEFECT_COMMENT5(String val) { m_DEFECT_COMMENT5 = val; }
	public void setOPR_CMPLT_FLG(String val) { m_OPR_CMPLT_FLG = val; }
	public void setTAKE_DATE(String val) { m_TAKE_DATE = val; }
	public void setCHILD_RSLTUPDATE_FLG(String val) { m_CHILD_RSLTUPDATE_FLG = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_OPR_RSLT_TEMP_CTL_NO(List list) { l_OPR_RSLT_TEMP_CTL_NO = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OPR_RSLT_PERSON(List list) { l_OPR_RSLT_PERSON = list; }
	public void setList_OPR_RSLT_COMMENT(List list) { l_OPR_RSLT_COMMENT = list; }
	public void setList_OPR_TIME_UNIT_TYP(List list) { l_OPR_TIME_UNIT_TYP = list; }
	public void setList_PRE_ARRANGEMENT_TIME(List list) { l_PRE_ARRANGEMENT_TIME = list; }
	public void setList_POST_ARRANGEMENT_TIME(List list) { l_POST_ARRANGEMENT_TIME = list; }
	public void setList_OPR_TIME(List list) { l_OPR_TIME = list; }
	public void setList_CESSATION_TIME(List list) { l_CESSATION_TIME = list; }
	public void setList_CESSATION_CAUSE(List list) { l_CESSATION_CAUSE = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_DEFECT_CAUSE_CD1(List list) { l_DEFECT_CAUSE_CD1 = list; }
	public void setList_DEFECT_QTY1(List list) { l_DEFECT_QTY1 = list; }
	public void setList_DEFECT_COMMENT1(List list) { l_DEFECT_COMMENT1 = list; }
	public void setList_DEFECT_CAUSE_CD2(List list) { l_DEFECT_CAUSE_CD2 = list; }
	public void setList_DEFECT_QTY2(List list) { l_DEFECT_QTY2 = list; }
	public void setList_DEFECT_COMMENT2(List list) { l_DEFECT_COMMENT2 = list; }
	public void setList_DEFECT_CAUSE_CD3(List list) { l_DEFECT_CAUSE_CD3 = list; }
	public void setList_DEFECT_QTY3(List list) { l_DEFECT_QTY3 = list; }
	public void setList_DEFECT_COMMENT3(List list) { l_DEFECT_COMMENT3 = list; }
	public void setList_DEFECT_CAUSE_CD4(List list) { l_DEFECT_CAUSE_CD4 = list; }
	public void setList_DEFECT_QTY4(List list) { l_DEFECT_QTY4 = list; }
	public void setList_DEFECT_COMMENT4(List list) { l_DEFECT_COMMENT4 = list; }
	public void setList_DEFECT_CAUSE_CD5(List list) { l_DEFECT_CAUSE_CD5 = list; }
	public void setList_DEFECT_QTY5(List list) { l_DEFECT_QTY5 = list; }
	public void setList_DEFECT_COMMENT5(List list) { l_DEFECT_COMMENT5 = list; }
	public void setList_OPR_CMPLT_FLG(List list) { l_OPR_CMPLT_FLG = list; }
	public void setList_TAKE_DATE(List list) { l_TAKE_DATE = list; }
	public void setList_CHILD_RSLTUPDATE_FLG(List list) { l_CHILD_RSLTUPDATE_FLG = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }

	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AD0080010Struct) list.get(i)).getFileName());
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
			l_DOWNLOAD_FILE.add(((AD0080010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AD0080010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AD0080010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TEMP_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TEMP_CTL_NO == null) {
			l_OPR_RSLT_TEMP_CTL_NO = new ArrayList();
		} else {
			l_OPR_RSLT_TEMP_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TEMP_CTL_NO.add(((AD0080010Struct) list.get(i)).getOPR_RSLT_TEMP_CTL_NO());
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
			l_OPR_INST_CD.add(((AD0080010Struct) list.get(i)).getOPR_INST_CD());
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
			l_ITEM_CD.add(((AD0080010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AD0080010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY == null) {
			l_DEFECT_QTY = new ArrayList();
		} else {
			l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY());
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
			l_OPR_DATE.add(((AD0080010Struct) list.get(i)).getOPR_DATE());
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
			l_WH_CD.add(((AD0080010Struct) list.get(i)).getWH_CD());
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
			l_WS_CD.add(((AD0080010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_PERSON == null) {
			l_OPR_RSLT_PERSON = new ArrayList();
		} else {
			l_OPR_RSLT_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_PERSON.add(((AD0080010Struct) list.get(i)).getOPR_RSLT_PERSON());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_COMMENT == null) {
			l_OPR_RSLT_COMMENT = new ArrayList();
		} else {
			l_OPR_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_COMMENT.add(((AD0080010Struct) list.get(i)).getOPR_RSLT_COMMENT());
		}
		return size;
	}
	public int setL2L_OPR_TIME_UNIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME_UNIT_TYP == null) {
			l_OPR_TIME_UNIT_TYP = new ArrayList();
		} else {
			l_OPR_TIME_UNIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME_UNIT_TYP.add(((AD0080010Struct) list.get(i)).getOPR_TIME_UNIT_TYP());
		}
		return size;
	}
	public int setL2L_PRE_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRE_ARRANGEMENT_TIME == null) {
			l_PRE_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_PRE_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRE_ARRANGEMENT_TIME.add(((AD0080010Struct) list.get(i)).getPRE_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_POST_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_POST_ARRANGEMENT_TIME == null) {
			l_POST_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_POST_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_POST_ARRANGEMENT_TIME.add(((AD0080010Struct) list.get(i)).getPOST_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME == null) {
			l_OPR_TIME = new ArrayList();
		} else {
			l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME.add(((AD0080010Struct) list.get(i)).getOPR_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_TIME == null) {
			l_CESSATION_TIME = new ArrayList();
		} else {
			l_CESSATION_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_TIME.add(((AD0080010Struct) list.get(i)).getCESSATION_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_CAUSE == null) {
			l_CESSATION_CAUSE = new ArrayList();
		} else {
			l_CESSATION_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_CAUSE.add(((AD0080010Struct) list.get(i)).getCESSATION_CAUSE());
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
			l_LOT_NO.add(((AD0080010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AD0080010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD1 == null) {
			l_DEFECT_CAUSE_CD1 = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD1.add(((AD0080010Struct) list.get(i)).getDEFECT_CAUSE_CD1());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY1 == null) {
			l_DEFECT_QTY1 = new ArrayList();
		} else {
			l_DEFECT_QTY1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY1.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY1());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT1 == null) {
			l_DEFECT_COMMENT1 = new ArrayList();
		} else {
			l_DEFECT_COMMENT1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT1.add(((AD0080010Struct) list.get(i)).getDEFECT_COMMENT1());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD2 == null) {
			l_DEFECT_CAUSE_CD2 = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD2.add(((AD0080010Struct) list.get(i)).getDEFECT_CAUSE_CD2());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY2 == null) {
			l_DEFECT_QTY2 = new ArrayList();
		} else {
			l_DEFECT_QTY2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY2.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY2());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT2 == null) {
			l_DEFECT_COMMENT2 = new ArrayList();
		} else {
			l_DEFECT_COMMENT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT2.add(((AD0080010Struct) list.get(i)).getDEFECT_COMMENT2());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD3 == null) {
			l_DEFECT_CAUSE_CD3 = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD3.add(((AD0080010Struct) list.get(i)).getDEFECT_CAUSE_CD3());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY3 == null) {
			l_DEFECT_QTY3 = new ArrayList();
		} else {
			l_DEFECT_QTY3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY3.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY3());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT3 == null) {
			l_DEFECT_COMMENT3 = new ArrayList();
		} else {
			l_DEFECT_COMMENT3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT3.add(((AD0080010Struct) list.get(i)).getDEFECT_COMMENT3());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD4 == null) {
			l_DEFECT_CAUSE_CD4 = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD4.add(((AD0080010Struct) list.get(i)).getDEFECT_CAUSE_CD4());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY4 == null) {
			l_DEFECT_QTY4 = new ArrayList();
		} else {
			l_DEFECT_QTY4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY4.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY4());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT4 == null) {
			l_DEFECT_COMMENT4 = new ArrayList();
		} else {
			l_DEFECT_COMMENT4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT4.add(((AD0080010Struct) list.get(i)).getDEFECT_COMMENT4());
		}
		return size;
	}
	public int setL2L_DEFECT_CAUSE_CD5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_CAUSE_CD5 == null) {
			l_DEFECT_CAUSE_CD5 = new ArrayList();
		} else {
			l_DEFECT_CAUSE_CD5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_CAUSE_CD5.add(((AD0080010Struct) list.get(i)).getDEFECT_CAUSE_CD5());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY5 == null) {
			l_DEFECT_QTY5 = new ArrayList();
		} else {
			l_DEFECT_QTY5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY5.add(((AD0080010Struct) list.get(i)).getDEFECT_QTY5());
		}
		return size;
	}
	public int setL2L_DEFECT_COMMENT5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_COMMENT5 == null) {
			l_DEFECT_COMMENT5 = new ArrayList();
		} else {
			l_DEFECT_COMMENT5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_COMMENT5.add(((AD0080010Struct) list.get(i)).getDEFECT_COMMENT5());
		}
		return size;
	}
	public int setL2L_OPR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_CMPLT_FLG == null) {
			l_OPR_CMPLT_FLG = new ArrayList();
		} else {
			l_OPR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_CMPLT_FLG.add(((AD0080010Struct) list.get(i)).getOPR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_TAKE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAKE_DATE == null) {
			l_TAKE_DATE = new ArrayList();
		} else {
			l_TAKE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAKE_DATE.add(((AD0080010Struct) list.get(i)).getTAKE_DATE());
		}
		return size;
	}
	public int setL2L_CHILD_RSLTUPDATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHILD_RSLTUPDATE_FLG == null) {
			l_CHILD_RSLTUPDATE_FLG = new ArrayList();
		} else {
			l_CHILD_RSLTUPDATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHILD_RSLTUPDATE_FLG.add(((AD0080010Struct) list.get(i)).getCHILD_RSLTUPDATE_FLG());
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
			l_USER_CD.add(((AD0080010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_INFO = null;
		m_OPR_RSLT_TEMP_CTL_NO = null;
		m_OPR_INST_CD = null;
		m_ITEM_CD = null;
		m_ACPT_QTY = null;
		m_DEFECT_QTY = null;
		m_OPR_DATE = null;
		m_WH_CD = null;
		m_WS_CD = null;
		m_OPR_RSLT_PERSON = null;
		m_OPR_RSLT_COMMENT = null;
		m_OPR_TIME_UNIT_TYP = null;
		m_PRE_ARRANGEMENT_TIME = null;
		m_POST_ARRANGEMENT_TIME = null;
		m_OPR_TIME = null;
		m_CESSATION_TIME = null;
		m_CESSATION_CAUSE = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_DEFECT_CAUSE_CD1 = null;
		m_DEFECT_QTY1 = null;
		m_DEFECT_COMMENT1 = null;
		m_DEFECT_CAUSE_CD2 = null;
		m_DEFECT_QTY2 = null;
		m_DEFECT_COMMENT2 = null;
		m_DEFECT_CAUSE_CD3 = null;
		m_DEFECT_QTY3 = null;
		m_DEFECT_COMMENT3 = null;
		m_DEFECT_CAUSE_CD4 = null;
		m_DEFECT_QTY4 = null;
		m_DEFECT_COMMENT4 = null;
		m_DEFECT_CAUSE_CD5 = null;
		m_DEFECT_QTY5 = null;
		m_DEFECT_COMMENT5 = null;
		m_OPR_CMPLT_FLG = null;
		m_TAKE_DATE = null;
		m_CHILD_RSLTUPDATE_FLG = null;
		m_USER_CD = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_INFO = null;
		l_OPR_RSLT_TEMP_CTL_NO = null;
		l_OPR_INST_CD = null;
		l_ITEM_CD = null;
		l_ACPT_QTY = null;
		l_DEFECT_QTY = null;
		l_OPR_DATE = null;
		l_WH_CD = null;
		l_WS_CD = null;
		l_OPR_RSLT_PERSON = null;
		l_OPR_RSLT_COMMENT = null;
		l_OPR_TIME_UNIT_TYP = null;
		l_PRE_ARRANGEMENT_TIME = null;
		l_POST_ARRANGEMENT_TIME = null;
		l_OPR_TIME = null;
		l_CESSATION_TIME = null;
		l_CESSATION_CAUSE = null;
		l_LOT_NO = null;
		l_VEND_LOT_NO = null;
		l_DEFECT_CAUSE_CD1 = null;
		l_DEFECT_QTY1 = null;
		l_DEFECT_COMMENT1 = null;
		l_DEFECT_CAUSE_CD2 = null;
		l_DEFECT_QTY2 = null;
		l_DEFECT_COMMENT2 = null;
		l_DEFECT_CAUSE_CD3 = null;
		l_DEFECT_QTY3 = null;
		l_DEFECT_COMMENT3 = null;
		l_DEFECT_CAUSE_CD4 = null;
		l_DEFECT_QTY4 = null;
		l_DEFECT_COMMENT4 = null;
		l_DEFECT_CAUSE_CD5 = null;
		l_DEFECT_QTY5 = null;
		l_DEFECT_COMMENT5 = null;
		l_OPR_CMPLT_FLG = null;
		l_TAKE_DATE = null;
		l_CHILD_RSLTUPDATE_FLG = null;
		l_USER_CD = null;

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
	 * medAD0080010クラスの標準コンストラクタ
	 */
	public AD0080010Struct()
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
	public void setStruct(AD0080010Struct struct)
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
	public void setStructM(AD0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setOPR_RSLT_TEMP_CTL_NO(struct.getOPR_RSLT_TEMP_CTL_NO());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setWH_CD(struct.getWH_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setOPR_RSLT_PERSON(struct.getOPR_RSLT_PERSON());
			this.setOPR_RSLT_COMMENT(struct.getOPR_RSLT_COMMENT());
			this.setOPR_TIME_UNIT_TYP(struct.getOPR_TIME_UNIT_TYP());
			this.setPRE_ARRANGEMENT_TIME(struct.getPRE_ARRANGEMENT_TIME());
			this.setPOST_ARRANGEMENT_TIME(struct.getPOST_ARRANGEMENT_TIME());
			this.setOPR_TIME(struct.getOPR_TIME());
			this.setCESSATION_TIME(struct.getCESSATION_TIME());
			this.setCESSATION_CAUSE(struct.getCESSATION_CAUSE());
			this.setLOT_NO(struct.getLOT_NO());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setDEFECT_CAUSE_CD1(struct.getDEFECT_CAUSE_CD1());
			this.setDEFECT_QTY1(struct.getDEFECT_QTY1());
			this.setDEFECT_COMMENT1(struct.getDEFECT_COMMENT1());
			this.setDEFECT_CAUSE_CD2(struct.getDEFECT_CAUSE_CD2());
			this.setDEFECT_QTY2(struct.getDEFECT_QTY2());
			this.setDEFECT_COMMENT2(struct.getDEFECT_COMMENT2());
			this.setDEFECT_CAUSE_CD3(struct.getDEFECT_CAUSE_CD3());
			this.setDEFECT_QTY3(struct.getDEFECT_QTY3());
			this.setDEFECT_COMMENT3(struct.getDEFECT_COMMENT3());
			this.setDEFECT_CAUSE_CD4(struct.getDEFECT_CAUSE_CD4());
			this.setDEFECT_QTY4(struct.getDEFECT_QTY4());
			this.setDEFECT_COMMENT4(struct.getDEFECT_COMMENT4());
			this.setDEFECT_CAUSE_CD5(struct.getDEFECT_CAUSE_CD5());
			this.setDEFECT_QTY5(struct.getDEFECT_QTY5());
			this.setDEFECT_COMMENT5(struct.getDEFECT_COMMENT5());
			this.setOPR_CMPLT_FLG(struct.getOPR_CMPLT_FLG());
			this.setTAKE_DATE(struct.getTAKE_DATE());
			this.setCHILD_RSLTUPDATE_FLG(struct.getCHILD_RSLTUPDATE_FLG());
			this.setUSER_CD(struct.getUSER_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_OPR_RSLT_TEMP_CTL_NO(struct.getList_OPR_RSLT_TEMP_CTL_NO());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OPR_RSLT_PERSON(struct.getList_OPR_RSLT_PERSON());
			this.setList_OPR_RSLT_COMMENT(struct.getList_OPR_RSLT_COMMENT());
			this.setList_OPR_TIME_UNIT_TYP(struct.getList_OPR_TIME_UNIT_TYP());
			this.setList_PRE_ARRANGEMENT_TIME(struct.getList_PRE_ARRANGEMENT_TIME());
			this.setList_POST_ARRANGEMENT_TIME(struct.getList_POST_ARRANGEMENT_TIME());
			this.setList_OPR_TIME(struct.getList_OPR_TIME());
			this.setList_CESSATION_TIME(struct.getList_CESSATION_TIME());
			this.setList_CESSATION_CAUSE(struct.getList_CESSATION_CAUSE());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_DEFECT_CAUSE_CD1(struct.getList_DEFECT_CAUSE_CD1());
			this.setList_DEFECT_QTY1(struct.getList_DEFECT_QTY1());
			this.setList_DEFECT_COMMENT1(struct.getList_DEFECT_COMMENT1());
			this.setList_DEFECT_CAUSE_CD2(struct.getList_DEFECT_CAUSE_CD2());
			this.setList_DEFECT_QTY2(struct.getList_DEFECT_QTY2());
			this.setList_DEFECT_COMMENT2(struct.getList_DEFECT_COMMENT2());
			this.setList_DEFECT_CAUSE_CD3(struct.getList_DEFECT_CAUSE_CD3());
			this.setList_DEFECT_QTY3(struct.getList_DEFECT_QTY3());
			this.setList_DEFECT_COMMENT3(struct.getList_DEFECT_COMMENT3());
			this.setList_DEFECT_CAUSE_CD4(struct.getList_DEFECT_CAUSE_CD4());
			this.setList_DEFECT_QTY4(struct.getList_DEFECT_QTY4());
			this.setList_DEFECT_COMMENT4(struct.getList_DEFECT_COMMENT4());
			this.setList_DEFECT_CAUSE_CD5(struct.getList_DEFECT_CAUSE_CD5());
			this.setList_DEFECT_QTY5(struct.getList_DEFECT_QTY5());
			this.setList_DEFECT_COMMENT5(struct.getList_DEFECT_COMMENT5());
			this.setList_OPR_CMPLT_FLG(struct.getList_OPR_CMPLT_FLG());
			this.setList_TAKE_DATE(struct.getList_TAKE_DATE());
			this.setList_CHILD_RSLTUPDATE_FLG(struct.getList_CHILD_RSLTUPDATE_FLG());
			this.setList_USER_CD(struct.getList_USER_CD());
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
	// 第 1 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// 第 5 変数初期値： i_OPR_RSLT_TEMP_CTL_NO


	final static String i_OPR_RSLT_TEMP_CTL_NO = null;

	// 第 6 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 7 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 8 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 9 変数初期値： i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// 第 10 変数初期値： i_OPR_DATE


	final static String i_OPR_DATE = null;

	// 第 11 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 12 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 13 変数初期値： i_OPR_RSLT_PERSON


	final static String i_OPR_RSLT_PERSON = null;

	// 第 14 変数初期値： i_OPR_RSLT_COMMENT


	final static String i_OPR_RSLT_COMMENT = null;

	// 第 15 変数初期値： i_OPR_TIME_UNIT_TYP


	final static String i_OPR_TIME_UNIT_TYP = null;

	// 第 16 変数初期値： i_PRE_ARRANGEMENT_TIME


	final static String i_PRE_ARRANGEMENT_TIME = null;

	// 第 17 変数初期値： i_POST_ARRANGEMENT_TIME


	final static String i_POST_ARRANGEMENT_TIME = null;

	// 第 18 変数初期値： i_OPR_TIME


	final static String i_OPR_TIME = null;

	// 第 19 変数初期値： i_CESSATION_TIME


	final static String i_CESSATION_TIME = null;

	// 第 20 変数初期値： i_CESSATION_CAUSE


	final static String i_CESSATION_CAUSE = null;

	// 第 21 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 22 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 23 変数初期値： i_DEFECT_CAUSE_CD1


	final static String i_DEFECT_CAUSE_CD1 = null;

	// 第 24 変数初期値： i_DEFECT_QTY1


	final static String i_DEFECT_QTY1 = null;

	// 第 25 変数初期値： i_DEFECT_COMMENT1


	final static String i_DEFECT_COMMENT1 = null;

	// 第 26 変数初期値： i_DEFECT_CAUSE_CD2


	final static String i_DEFECT_CAUSE_CD2 = null;

	// 第 27 変数初期値： i_DEFECT_QTY2


	final static String i_DEFECT_QTY2 = null;

	// 第 28 変数初期値： i_DEFECT_COMMENT2


	final static String i_DEFECT_COMMENT2 = null;

	// 第 29 変数初期値： i_DEFECT_CAUSE_CD3


	final static String i_DEFECT_CAUSE_CD3 = null;

	// 第 30 変数初期値： i_DEFECT_QTY3


	final static String i_DEFECT_QTY3 = null;

	// 第 31 変数初期値： i_DEFECT_COMMENT3


	final static String i_DEFECT_COMMENT3 = null;

	// 第 32 変数初期値： i_DEFECT_CAUSE_CD4


	final static String i_DEFECT_CAUSE_CD4 = null;

	// 第 33 変数初期値： i_DEFECT_QTY4


	final static String i_DEFECT_QTY4 = null;

	// 第 34 変数初期値： i_DEFECT_COMMENT4


	final static String i_DEFECT_COMMENT4 = null;

	// 第 35 変数初期値： i_DEFECT_CAUSE_CD5


	final static String i_DEFECT_CAUSE_CD5 = null;

	// 第 36 変数初期値： i_DEFECT_QTY5


	final static String i_DEFECT_QTY5 = null;

	// 第 37 変数初期値： i_DEFECT_COMMENT5


	final static String i_DEFECT_COMMENT5 = null;

	// 第 38 変数初期値： i_OPR_CMPLT_FLG


	final static String i_OPR_CMPLT_FLG = null;

	// 第 39 変数初期値： i_TAKE_DATE


	final static String i_TAKE_DATE = null;

	// 第 40 変数初期値： i_CHILD_RSLTUPDATE_FLG


	final static String i_CHILD_RSLTUPDATE_FLG = null;

	// 第 41 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FileName

	final static String i_FileName = null;

	// 第 2 変数初期値： i_ERROR_IN

	final static String i_ERROR_IN = null;

	// 第 3 変数初期値： i_ERR_INFO

	final static String i_ERR_INFO = null;

	// 第 4 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 5 変数初期値： i_PROC_USER_CD

	final static String i_PROC_USER_CD = null;

	// 第 6 変数初期値： i_CSV_TIME

	final static String i_CSV_TIME = null;

	// 第 7 変数初期値： i_ROW_NO

	final static String i_ROW_NO = null;

	// 第 8 変数初期値： i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// 第 9 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 10 変数初期値： i_ACPT_QTY

	final static String i_ACPT_QTY = null;

	// 第 11 変数初期値： i_DEFECT_QTY

	final static String i_DEFECT_QTY = null;

	// 第 12 変数初期値： i_OPR_DATE

	final static String i_OPR_DATE = null;

	// 第 13 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 14 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 15 変数初期値： i_OPR_RSLT_PERSON

	final static String i_OPR_RSLT_PERSON = null;

	// 第 16 変数初期値： i_OPR_RSLT_COMMENT

	final static String i_OPR_RSLT_COMMENT = null;

	// 第 17 変数初期値： i_OPR_TIME_UNIT_TYP

	final static String i_OPR_TIME_UNIT_TYP = null;

	// 第 18 変数初期値： i_PRE_ARRANGEMENT_TIME

	final static String i_PRE_ARRANGEMENT_TIME = null;

	// 第 19 変数初期値： i_POST_ARRANGEMENT_TIME

	final static String i_POST_ARRANGEMENT_TIME = null;

	// 第 20 変数初期値： i_OPR_TIME

	final static String i_OPR_TIME = null;

	// 第 21 変数初期値： i_CESSATION_TIME

	final static String i_CESSATION_TIME = null;

	// 第 22 変数初期値： i_CESSATION_CAUSE

	final static String i_CESSATION_CAUSE = null;

	// 第 23 変数初期値： i_LOT_NO

	final static String i_LOT_NO = null;

	// 第 24 変数初期値： i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// 第 25 変数初期値： i_DEFECT_CAUSE_CD1

	final static String i_DEFECT_CAUSE_CD1 = null;

	// 第 26 変数初期値： i_DEFECT_QTY1

	final static String i_DEFECT_QTY1 = null;

	// 第 27 変数初期値： i_DEFECT_COMMENT1

	final static String i_DEFECT_COMMENT1 = null;

	// 第 28 変数初期値： i_DEFECT_CAUSE_CD2

	final static String i_DEFECT_CAUSE_CD2 = null;

	// 第 29 変数初期値： i_DEFECT_QTY2

	final static String i_DEFECT_QTY2 = null;

	// 第 30 変数初期値： i_DEFECT_COMMENT2

	final static String i_DEFECT_COMMENT2 = null;

	// 第 31 変数初期値： i_DEFECT_CAUSE_CD3

	final static String i_DEFECT_CAUSE_CD3 = null;

	// 第 32 変数初期値： i_DEFECT_QTY3

	final static String i_DEFECT_QTY3 = null;

	// 第 33 変数初期値： i_DEFECT_COMMENT3

	final static String i_DEFECT_COMMENT3 = null;

	// 第 34 変数初期値： i_DEFECT_CAUSE_CD4

	final static String i_DEFECT_CAUSE_CD4 = null;

	// 第 35 変数初期値： i_DEFECT_QTY4

	final static String i_DEFECT_QTY4 = null;

	// 第 36 変数初期値： i_DEFECT_COMMENT4

	final static String i_DEFECT_COMMENT4 = null;

	// 第 37 変数初期値： i_DEFECT_CAUSE_CD5

	final static String i_DEFECT_CAUSE_CD5 = null;

	// 第 38 変数初期値： i_DEFECT_QTY5

	final static String i_DEFECT_QTY5 = null;

	// 第 39 変数初期値： i_DEFECT_COMMENT5

	final static String i_DEFECT_COMMENT5 = null;

	// 第 40 変数初期値： i_OPR_CMPLT_FLG

	final static String i_OPR_CMPLT_FLG = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ACPT_QTY = i_ACPT_QTY;
		m_DEFECT_QTY = i_DEFECT_QTY;
		m_OPR_DATE = i_OPR_DATE;
		m_WH_CD = i_WH_CD;
		m_WS_CD = i_WS_CD;
		m_OPR_RSLT_PERSON = i_OPR_RSLT_PERSON;
		m_OPR_RSLT_COMMENT = i_OPR_RSLT_COMMENT;
		m_OPR_TIME_UNIT_TYP = i_OPR_TIME_UNIT_TYP;
		m_PRE_ARRANGEMENT_TIME = i_PRE_ARRANGEMENT_TIME;
		m_POST_ARRANGEMENT_TIME = i_POST_ARRANGEMENT_TIME;
		m_OPR_TIME = i_OPR_TIME;
		m_CESSATION_TIME = i_CESSATION_TIME;
		m_CESSATION_CAUSE = i_CESSATION_CAUSE;
		m_LOT_NO = i_LOT_NO;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_DEFECT_CAUSE_CD1 = i_DEFECT_CAUSE_CD1;
		m_DEFECT_QTY1 = i_DEFECT_QTY1;
		m_DEFECT_COMMENT1 = i_DEFECT_COMMENT1;
		m_DEFECT_CAUSE_CD2 = i_DEFECT_CAUSE_CD2;
		m_DEFECT_QTY2 = i_DEFECT_QTY2;
		m_DEFECT_COMMENT2 = i_DEFECT_COMMENT2;
		m_DEFECT_CAUSE_CD3 = i_DEFECT_CAUSE_CD3;
		m_DEFECT_QTY3 = i_DEFECT_QTY3;
		m_DEFECT_COMMENT3 = i_DEFECT_COMMENT3;
		m_DEFECT_CAUSE_CD4 = i_DEFECT_CAUSE_CD4;
		m_DEFECT_QTY4 = i_DEFECT_QTY4;
		m_DEFECT_COMMENT4 = i_DEFECT_COMMENT4;
		m_DEFECT_CAUSE_CD5 = i_DEFECT_CAUSE_CD5;
		m_DEFECT_QTY5 = i_DEFECT_QTY5;
		m_DEFECT_COMMENT5 = i_DEFECT_COMMENT5;
		m_OPR_CMPLT_FLG = i_OPR_CMPLT_FLG;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
