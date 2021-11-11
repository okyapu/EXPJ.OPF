/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0070/src/com/nec/jp/orteus/metamorBase/AE0070/AE0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0070;

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
 * CLASS     : AE0070010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.13 $ $Date: 2014/11/05 07:11:35 $
 *
 */
//}}user_implement_code_header

public class AE0070010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_ReOutputFlg */
	public String m_ReOutputFlg = null;
	/** 第 3 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 4 変数： m_l_PUCH_ODR_START_DATE */
	public String m_l_PUCH_ODR_START_DATE = null;
	/** 第 5 変数： m_l_PUCH_ODR_DLV_DATE */
	public String m_l_PUCH_ODR_DLV_DATE = null;
	/** 第 6 変数： m_l_PUCH_ODR_QTY */
	public String m_l_PUCH_ODR_QTY = null;
	/** 第 7 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 8 変数： m_l_PUCH_ODR_SLIP_ISS_DATE */
	public String m_l_PUCH_ODR_SLIP_ISS_DATE = null;
	/** 第 9 変数： m_l_ACPT_DATE */
	public String m_l_ACPT_DATE = null;
	/** 第 10 変数： m_l_ODR_CANCEL_SLIP_ISS_DATE */
	public String m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
	/** 第 11 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 12 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 13 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 14 変数： m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** 第 15 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 16 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 17 変数： m_l_PUCH_ODR_PERSON */
	public String m_l_PUCH_ODR_PERSON = null;
	/** 第 18 変数： m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** 第 19 変数： m_l_ODR_CANCEL_CAUSE_CD */
	public String m_l_ODR_CANCEL_CAUSE_CD = null;
	/** 第 20 変数： m_l_ACPT_RSLT_COMMENT */
	public String m_l_ACPT_RSLT_COMMENT = null;
	/** 第 21 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 22 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 23 変数： m_PUCH_ODR_START_DATE_FROM */
	public String m_PUCH_ODR_START_DATE_FROM = null;
	/** 第 24 変数： m_PUCH_ODR_START_DATE_TO */
	public String m_PUCH_ODR_START_DATE_TO = null;
	/** 第 25 変数： m_PUCH_ODR_DLV_DATE_FROM */
	public String m_PUCH_ODR_DLV_DATE_FROM = null;
	/** 第 26 変数： m_PUCH_ODR_DLV_DATE_TO */
	public String m_PUCH_ODR_DLV_DATE_TO = null;
	/** 第 27 変数： m_ACPT_DATE_FROM */
	public String m_ACPT_DATE_FROM = null;
	/** 第 28 変数： m_ACPT_DATE_TO */
	public String m_ACPT_DATE_TO = null;
	/** 第 29 変数： m_ODR_CANCEL_SLIP_ISS_DATE_FROM */
	public String m_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;
	/** 第 30 変数： m_ODR_CANCEL_SLIP_ISS_DATE_TO */
	public String m_ODR_CANCEL_SLIP_ISS_DATE_TO = null;
	/** 第 31 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 32 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 33 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 34 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 35 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 36 変数： m_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 37 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 38 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 39 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 40 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 41 変数： m_ODR_CANCEL_SLIP_ISS_DATE */
	public String m_ODR_CANCEL_SLIP_ISS_DATE = null;
	/** 第 42 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 43 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 44 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_ReOutputFlg */
	public List l_ReOutputFlg = null;

	/** 第 3 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 4 List変数： l_l_PUCH_ODR_START_DATE */
	public List l_l_PUCH_ODR_START_DATE = null;

	/** 第 5 List変数： l_l_PUCH_ODR_DLV_DATE */
	public List l_l_PUCH_ODR_DLV_DATE = null;

	/** 第 6 List変数： l_l_PUCH_ODR_QTY */
	public List l_l_PUCH_ODR_QTY = null;

	/** 第 7 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 8 List変数： l_l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** 第 9 List変数： l_l_ACPT_DATE */
	public List l_l_ACPT_DATE = null;

	/** 第 10 List変数： l_l_ODR_CANCEL_SLIP_ISS_DATE */
	public List l_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	/** 第 11 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 12 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 13 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 14 List変数： l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** 第 15 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 16 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 17 List変数： l_l_PUCH_ODR_PERSON */
	public List l_l_PUCH_ODR_PERSON = null;

	/** 第 18 List変数： l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** 第 19 List変数： l_l_ODR_CANCEL_CAUSE_CD */
	public List l_l_ODR_CANCEL_CAUSE_CD = null;

	/** 第 20 List変数： l_l_ACPT_RSLT_COMMENT */
	public List l_l_ACPT_RSLT_COMMENT = null;

	/** 第 21 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 22 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 23 List変数： l_PUCH_ODR_START_DATE_FROM */
	public List l_PUCH_ODR_START_DATE_FROM = null;

	/** 第 24 List変数： l_PUCH_ODR_START_DATE_TO */
	public List l_PUCH_ODR_START_DATE_TO = null;

	/** 第 25 List変数： l_PUCH_ODR_DLV_DATE_FROM */
	public List l_PUCH_ODR_DLV_DATE_FROM = null;

	/** 第 26 List変数： l_PUCH_ODR_DLV_DATE_TO */
	public List l_PUCH_ODR_DLV_DATE_TO = null;

	/** 第 27 List変数： l_ACPT_DATE_FROM */
	public List l_ACPT_DATE_FROM = null;

	/** 第 28 List変数： l_ACPT_DATE_TO */
	public List l_ACPT_DATE_TO = null;

	/** 第 29 List変数： l_ODR_CANCEL_SLIP_ISS_DATE_FROM */
	public List l_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;

	/** 第 30 List変数： l_ODR_CANCEL_SLIP_ISS_DATE_TO */
	public List l_ODR_CANCEL_SLIP_ISS_DATE_TO = null;

	/** 第 31 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 32 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 33 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 34 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 35 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 36 List変数： l_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 37 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 38 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 39 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 40 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 41 List変数： l_ODR_CANCEL_SLIP_ISS_DATE */
	public List l_ODR_CANCEL_SLIP_ISS_DATE = null;

	/** 第 42 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 43 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 44 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getReOutputFlg() { return m_ReOutputFlg; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_PUCH_ODR_START_DATE() { return m_l_PUCH_ODR_START_DATE; }
	public String getl_PUCH_ODR_DLV_DATE() { return m_l_PUCH_ODR_DLV_DATE; }
	public String getl_PUCH_ODR_QTY() { return m_l_PUCH_ODR_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_PUCH_ODR_SLIP_ISS_DATE() { return m_l_PUCH_ODR_SLIP_ISS_DATE; }
	public String getl_ACPT_DATE() { return m_l_ACPT_DATE; }
	public String getl_ODR_CANCEL_SLIP_ISS_DATE() { return m_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PUCH_ODR_PERSON() { return m_l_PUCH_ODR_PERSON; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_ODR_CANCEL_CAUSE_CD() { return m_l_ODR_CANCEL_CAUSE_CD; }
	public String getl_ACPT_RSLT_COMMENT() { return m_l_ACPT_RSLT_COMMENT; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_START_DATE_FROM() { return m_PUCH_ODR_START_DATE_FROM; }
	public String getPUCH_ODR_START_DATE_TO() { return m_PUCH_ODR_START_DATE_TO; }
	public String getPUCH_ODR_DLV_DATE_FROM() { return m_PUCH_ODR_DLV_DATE_FROM; }
	public String getPUCH_ODR_DLV_DATE_TO() { return m_PUCH_ODR_DLV_DATE_TO; }
	public String getACPT_DATE_FROM() { return m_ACPT_DATE_FROM; }
	public String getACPT_DATE_TO() { return m_ACPT_DATE_TO; }
	public String getODR_CANCEL_SLIP_ISS_DATE_FROM() { return m_ODR_CANCEL_SLIP_ISS_DATE_FROM; }
	public String getODR_CANCEL_SLIP_ISS_DATE_TO() { return m_ODR_CANCEL_SLIP_ISS_DATE_TO; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getODR_CANCEL_SLIP_ISS_FLG() { return m_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getODR_CANCEL_SLIP_ISS_DATE() { return m_ODR_CANCEL_SLIP_ISS_DATE; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_ReOutputFlg() { return l_ReOutputFlg; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_PUCH_ODR_START_DATE() { return l_l_PUCH_ODR_START_DATE; }
	public List getList_l_PUCH_ODR_DLV_DATE() { return l_l_PUCH_ODR_DLV_DATE; }
	public List getList_l_PUCH_ODR_QTY() { return l_l_PUCH_ODR_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_PUCH_ODR_SLIP_ISS_DATE() { return l_l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_l_ACPT_DATE() { return l_l_ACPT_DATE; }
	public List getList_l_ODR_CANCEL_SLIP_ISS_DATE() { return l_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PUCH_ODR_PERSON() { return l_l_PUCH_ODR_PERSON; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_ODR_CANCEL_CAUSE_CD() { return l_l_ODR_CANCEL_CAUSE_CD; }
	public List getList_l_ACPT_RSLT_COMMENT() { return l_l_ACPT_RSLT_COMMENT; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_START_DATE_FROM() { return l_PUCH_ODR_START_DATE_FROM; }
	public List getList_PUCH_ODR_START_DATE_TO() { return l_PUCH_ODR_START_DATE_TO; }
	public List getList_PUCH_ODR_DLV_DATE_FROM() { return l_PUCH_ODR_DLV_DATE_FROM; }
	public List getList_PUCH_ODR_DLV_DATE_TO() { return l_PUCH_ODR_DLV_DATE_TO; }
	public List getList_ACPT_DATE_FROM() { return l_ACPT_DATE_FROM; }
	public List getList_ACPT_DATE_TO() { return l_ACPT_DATE_TO; }
	public List getList_ODR_CANCEL_SLIP_ISS_DATE_FROM() { return l_ODR_CANCEL_SLIP_ISS_DATE_FROM; }
	public List getList_ODR_CANCEL_SLIP_ISS_DATE_TO() { return l_ODR_CANCEL_SLIP_ISS_DATE_TO; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_ODR_CANCEL_SLIP_ISS_FLG() { return l_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_ODR_CANCEL_SLIP_ISS_DATE() { return l_ODR_CANCEL_SLIP_ISS_DATE; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setReOutputFlg(String val) { m_ReOutputFlg = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_PUCH_ODR_START_DATE(String val) { m_l_PUCH_ODR_START_DATE = val; }
	public void setl_PUCH_ODR_DLV_DATE(String val) { m_l_PUCH_ODR_DLV_DATE = val; }
	public void setl_PUCH_ODR_QTY(String val) { m_l_PUCH_ODR_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_PUCH_ODR_SLIP_ISS_DATE(String val) { m_l_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setl_ACPT_DATE(String val) { m_l_ACPT_DATE = val; }
	public void setl_ODR_CANCEL_SLIP_ISS_DATE(String val) { m_l_ODR_CANCEL_SLIP_ISS_DATE = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PUCH_ODR_PERSON(String val) { m_l_PUCH_ODR_PERSON = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_ODR_CANCEL_CAUSE_CD(String val) { m_l_ODR_CANCEL_CAUSE_CD = val; }
	public void setl_ACPT_RSLT_COMMENT(String val) { m_l_ACPT_RSLT_COMMENT = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_START_DATE_FROM(String val) { m_PUCH_ODR_START_DATE_FROM = val; }
	public void setPUCH_ODR_START_DATE_TO(String val) { m_PUCH_ODR_START_DATE_TO = val; }
	public void setPUCH_ODR_DLV_DATE_FROM(String val) { m_PUCH_ODR_DLV_DATE_FROM = val; }
	public void setPUCH_ODR_DLV_DATE_TO(String val) { m_PUCH_ODR_DLV_DATE_TO = val; }
	public void setACPT_DATE_FROM(String val) { m_ACPT_DATE_FROM = val; }
	public void setACPT_DATE_TO(String val) { m_ACPT_DATE_TO = val; }
	public void setODR_CANCEL_SLIP_ISS_DATE_FROM(String val) { m_ODR_CANCEL_SLIP_ISS_DATE_FROM = val; }
	public void setODR_CANCEL_SLIP_ISS_DATE_TO(String val) { m_ODR_CANCEL_SLIP_ISS_DATE_TO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setODR_CANCEL_SLIP_ISS_FLG(String val) { m_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setODR_CANCEL_SLIP_ISS_DATE(String val) { m_ODR_CANCEL_SLIP_ISS_DATE = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_ReOutputFlg(List list) { l_ReOutputFlg = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_PUCH_ODR_START_DATE(List list) { l_l_PUCH_ODR_START_DATE = list; }
	public void setList_l_PUCH_ODR_DLV_DATE(List list) { l_l_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_PUCH_ODR_QTY(List list) { l_l_PUCH_ODR_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_PUCH_ODR_SLIP_ISS_DATE(List list) { l_l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_l_ACPT_DATE(List list) { l_l_ACPT_DATE = list; }
	public void setList_l_ODR_CANCEL_SLIP_ISS_DATE(List list) { l_l_ODR_CANCEL_SLIP_ISS_DATE = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PUCH_ODR_PERSON(List list) { l_l_PUCH_ODR_PERSON = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_ODR_CANCEL_CAUSE_CD(List list) { l_l_ODR_CANCEL_CAUSE_CD = list; }
	public void setList_l_ACPT_RSLT_COMMENT(List list) { l_l_ACPT_RSLT_COMMENT = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_START_DATE_FROM(List list) { l_PUCH_ODR_START_DATE_FROM = list; }
	public void setList_PUCH_ODR_START_DATE_TO(List list) { l_PUCH_ODR_START_DATE_TO = list; }
	public void setList_PUCH_ODR_DLV_DATE_FROM(List list) { l_PUCH_ODR_DLV_DATE_FROM = list; }
	public void setList_PUCH_ODR_DLV_DATE_TO(List list) { l_PUCH_ODR_DLV_DATE_TO = list; }
	public void setList_ACPT_DATE_FROM(List list) { l_ACPT_DATE_FROM = list; }
	public void setList_ACPT_DATE_TO(List list) { l_ACPT_DATE_TO = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_DATE_FROM(List list) { l_ODR_CANCEL_SLIP_ISS_DATE_FROM = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_DATE_TO(List list) { l_ODR_CANCEL_SLIP_ISS_DATE_TO = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_DATE(List list) { l_ODR_CANCEL_SLIP_ISS_DATE = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_DOWNLOAD_FILE.add(((AE0070010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_ReOutputFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ReOutputFlg == null) {
			l_ReOutputFlg = new ArrayList();
		} else {
			l_ReOutputFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ReOutputFlg.add(((AE0070010Struct) list.get(i)).getReOutputFlg());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AE0070010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_START_DATE == null) {
			l_l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_START_DATE.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_DLV_DATE == null) {
			l_l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_DLV_DATE.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_QTY == null) {
			l_l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_QTY.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_QTY());
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
			l_l_STOCK_UNIT.add(((AE0070010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_DATE == null) {
			l_l_ACPT_DATE = new ArrayList();
		} else {
			l_l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_DATE.add(((AE0070010Struct) list.get(i)).getl_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_SLIP_ISS_DATE == null) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.add(((AE0070010Struct) list.get(i)).getl_ODR_CANCEL_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_CD());
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
			l_l_JOB_ODR_CD.add(((AE0070010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AE0070010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AE0070010Struct) list.get(i)).getl_VEND_ANAME());
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
			l_l_ITEM_CD.add(((AE0070010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0070010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_PERSON == null) {
			l_l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_PERSON.add(((AE0070010Struct) list.get(i)).getl_PUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_l_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_NAME == null) {
			l_l_USER_NAME = new ArrayList();
		} else {
			l_l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_NAME.add(((AE0070010Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_CAUSE_CD == null) {
			l_l_ODR_CANCEL_CAUSE_CD = new ArrayList();
		} else {
			l_l_ODR_CANCEL_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_CAUSE_CD.add(((AE0070010Struct) list.get(i)).getl_ODR_CANCEL_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_l_ACPT_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_RSLT_COMMENT == null) {
			l_l_ACPT_RSLT_COMMENT = new ArrayList();
		} else {
			l_l_ACPT_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_RSLT_COMMENT.add(((AE0070010Struct) list.get(i)).getl_ACPT_RSLT_COMMENT());
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
			l_l_MODIFY_COUNT.add(((AE0070010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AE0070010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE_FROM == null) {
			l_PUCH_ODR_START_DATE_FROM = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE_FROM.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE_TO == null) {
			l_PUCH_ODR_START_DATE_TO = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE_TO.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE_FROM == null) {
			l_PUCH_ODR_DLV_DATE_FROM = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE_FROM.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_DLV_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE_TO == null) {
			l_PUCH_ODR_DLV_DATE_TO = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE_TO.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_DLV_DATE_TO());
		}
		return size;
	}
	public int setL2L_ACPT_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE_FROM == null) {
			l_ACPT_DATE_FROM = new ArrayList();
		} else {
			l_ACPT_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE_FROM.add(((AE0070010Struct) list.get(i)).getACPT_DATE_FROM());
		}
		return size;
	}
	public int setL2L_ACPT_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE_TO == null) {
			l_ACPT_DATE_TO = new ArrayList();
		} else {
			l_ACPT_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE_TO.add(((AE0070010Struct) list.get(i)).getACPT_DATE_TO());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_DATE_FROM == null) {
			l_ODR_CANCEL_SLIP_ISS_DATE_FROM = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_DATE_FROM.add(((AE0070010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_DATE_FROM());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_DATE_TO == null) {
			l_ODR_CANCEL_SLIP_ISS_DATE_TO = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_DATE_TO.add(((AE0070010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_DATE_TO());
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
			l_PUCH_ODR_CD.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_JOB_ODR_CD.add(((AE0070010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_VEND_CD.add(((AE0070010Struct) list.get(i)).getVEND_CD());
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
			l_ITEM_CD.add(((AE0070010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AE0070010Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_FLG == null) {
			l_ODR_CANCEL_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0070010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_FLG());
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
			l_PLANT_NAME.add(((AE0070010Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_NAME.add(((AE0070010Struct) list.get(i)).getVEND_NAME());
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
			l_ITEM_NAME.add(((AE0070010Struct) list.get(i)).getITEM_NAME());
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
			l_USER_NAME.add(((AE0070010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_DATE == null) {
			l_ODR_CANCEL_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_DATE.add(((AE0070010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_DATE());
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
			l_BUSINESS_OPR_DATE.add(((AE0070010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_l_COUNT.add(((AE0070010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0070010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_ReOutputFlg = null;
		m_l_PLANT_CD = null;
		m_l_PUCH_ODR_START_DATE = null;
		m_l_PUCH_ODR_DLV_DATE = null;
		m_l_PUCH_ODR_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_PUCH_ODR_SLIP_ISS_DATE = null;
		m_l_ACPT_DATE = null;
		m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		m_l_PUCH_ODR_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PUCH_ODR_PERSON = null;
		m_l_USER_NAME = null;
		m_l_ODR_CANCEL_CAUSE_CD = null;
		m_l_ACPT_RSLT_COMMENT = null;
		m_l_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_START_DATE_FROM = null;
		m_PUCH_ODR_START_DATE_TO = null;
		m_PUCH_ODR_DLV_DATE_FROM = null;
		m_PUCH_ODR_DLV_DATE_TO = null;
		m_ACPT_DATE_FROM = null;
		m_ACPT_DATE_TO = null;
		m_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;
		m_ODR_CANCEL_SLIP_ISS_DATE_TO = null;
		m_PUCH_ODR_CD = null;
		m_JOB_ODR_CD = null;
		m_VEND_CD = null;
		m_ITEM_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_ITEM_NAME = null;
		m_USER_NAME = null;
		m_ODR_CANCEL_SLIP_ISS_DATE = null;
		m_BUSINESS_OPR_DATE = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_ReOutputFlg = null;
		l_l_PLANT_CD = null;
		l_l_PUCH_ODR_START_DATE = null;
		l_l_PUCH_ODR_DLV_DATE = null;
		l_l_PUCH_ODR_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_l_ACPT_DATE = null;
		l_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		l_l_PUCH_ODR_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PUCH_ODR_PERSON = null;
		l_l_USER_NAME = null;
		l_l_ODR_CANCEL_CAUSE_CD = null;
		l_l_ACPT_RSLT_COMMENT = null;
		l_l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_START_DATE_FROM = null;
		l_PUCH_ODR_START_DATE_TO = null;
		l_PUCH_ODR_DLV_DATE_FROM = null;
		l_PUCH_ODR_DLV_DATE_TO = null;
		l_ACPT_DATE_FROM = null;
		l_ACPT_DATE_TO = null;
		l_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;
		l_ODR_CANCEL_SLIP_ISS_DATE_TO = null;
		l_PUCH_ODR_CD = null;
		l_JOB_ODR_CD = null;
		l_VEND_CD = null;
		l_ITEM_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_ITEM_NAME = null;
		l_USER_NAME = null;
		l_ODR_CANCEL_SLIP_ISS_DATE = null;
		l_BUSINESS_OPR_DATE = null;
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
	 * medAE0070010クラスの標準コンストラクタ
	 */
	public AE0070010Struct()
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
	public void setStruct(AE0070010Struct struct)
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
	public void setStructM(AE0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setReOutputFlg(struct.getReOutputFlg());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_PUCH_ODR_START_DATE(struct.getl_PUCH_ODR_START_DATE());
			this.setl_PUCH_ODR_DLV_DATE(struct.getl_PUCH_ODR_DLV_DATE());
			this.setl_PUCH_ODR_QTY(struct.getl_PUCH_ODR_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_PUCH_ODR_SLIP_ISS_DATE(struct.getl_PUCH_ODR_SLIP_ISS_DATE());
			this.setl_ACPT_DATE(struct.getl_ACPT_DATE());
			this.setl_ODR_CANCEL_SLIP_ISS_DATE(struct.getl_ODR_CANCEL_SLIP_ISS_DATE());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PUCH_ODR_PERSON(struct.getl_PUCH_ODR_PERSON());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_ODR_CANCEL_CAUSE_CD(struct.getl_ODR_CANCEL_CAUSE_CD());
			this.setl_ACPT_RSLT_COMMENT(struct.getl_ACPT_RSLT_COMMENT());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_START_DATE_FROM(struct.getPUCH_ODR_START_DATE_FROM());
			this.setPUCH_ODR_START_DATE_TO(struct.getPUCH_ODR_START_DATE_TO());
			this.setPUCH_ODR_DLV_DATE_FROM(struct.getPUCH_ODR_DLV_DATE_FROM());
			this.setPUCH_ODR_DLV_DATE_TO(struct.getPUCH_ODR_DLV_DATE_TO());
			this.setACPT_DATE_FROM(struct.getACPT_DATE_FROM());
			this.setACPT_DATE_TO(struct.getACPT_DATE_TO());
			this.setODR_CANCEL_SLIP_ISS_DATE_FROM(struct.getODR_CANCEL_SLIP_ISS_DATE_FROM());
			this.setODR_CANCEL_SLIP_ISS_DATE_TO(struct.getODR_CANCEL_SLIP_ISS_DATE_TO());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setODR_CANCEL_SLIP_ISS_FLG(struct.getODR_CANCEL_SLIP_ISS_FLG());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setODR_CANCEL_SLIP_ISS_DATE(struct.getODR_CANCEL_SLIP_ISS_DATE());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_ReOutputFlg(struct.getList_ReOutputFlg());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_PUCH_ODR_START_DATE(struct.getList_l_PUCH_ODR_START_DATE());
			this.setList_l_PUCH_ODR_DLV_DATE(struct.getList_l_PUCH_ODR_DLV_DATE());
			this.setList_l_PUCH_ODR_QTY(struct.getList_l_PUCH_ODR_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_PUCH_ODR_SLIP_ISS_DATE(struct.getList_l_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_l_ACPT_DATE(struct.getList_l_ACPT_DATE());
			this.setList_l_ODR_CANCEL_SLIP_ISS_DATE(struct.getList_l_ODR_CANCEL_SLIP_ISS_DATE());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PUCH_ODR_PERSON(struct.getList_l_PUCH_ODR_PERSON());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_ODR_CANCEL_CAUSE_CD(struct.getList_l_ODR_CANCEL_CAUSE_CD());
			this.setList_l_ACPT_RSLT_COMMENT(struct.getList_l_ACPT_RSLT_COMMENT());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_START_DATE_FROM(struct.getList_PUCH_ODR_START_DATE_FROM());
			this.setList_PUCH_ODR_START_DATE_TO(struct.getList_PUCH_ODR_START_DATE_TO());
			this.setList_PUCH_ODR_DLV_DATE_FROM(struct.getList_PUCH_ODR_DLV_DATE_FROM());
			this.setList_PUCH_ODR_DLV_DATE_TO(struct.getList_PUCH_ODR_DLV_DATE_TO());
			this.setList_ACPT_DATE_FROM(struct.getList_ACPT_DATE_FROM());
			this.setList_ACPT_DATE_TO(struct.getList_ACPT_DATE_TO());
			this.setList_ODR_CANCEL_SLIP_ISS_DATE_FROM(struct.getList_ODR_CANCEL_SLIP_ISS_DATE_FROM());
			this.setList_ODR_CANCEL_SLIP_ISS_DATE_TO(struct.getList_ODR_CANCEL_SLIP_ISS_DATE_TO());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_ODR_CANCEL_SLIP_ISS_DATE(struct.getList_ODR_CANCEL_SLIP_ISS_DATE());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
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
	// 第 1 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_ReOutputFlg


	final static String i_ReOutputFlg = null;

	// 第 3 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 4 変数初期値： i_l_PUCH_ODR_START_DATE


	final static String i_l_PUCH_ODR_START_DATE = null;

	// 第 5 変数初期値： i_l_PUCH_ODR_DLV_DATE


	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// 第 6 変数初期値： i_l_PUCH_ODR_QTY


	final static String i_l_PUCH_ODR_QTY = null;

	// 第 7 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 8 変数初期値： i_l_PUCH_ODR_SLIP_ISS_DATE


	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 9 変数初期値： i_l_ACPT_DATE


	final static String i_l_ACPT_DATE = null;

	// 第 10 変数初期値： i_l_ODR_CANCEL_SLIP_ISS_DATE


	final static String i_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 11 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 12 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 13 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 14 変数初期値： i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// 第 15 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 16 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 17 変数初期値： i_l_PUCH_ODR_PERSON


	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 18 変数初期値： i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// 第 19 変数初期値： i_l_ODR_CANCEL_CAUSE_CD


	final static String i_l_ODR_CANCEL_CAUSE_CD = null;

	// 第 20 変数初期値： i_l_ACPT_RSLT_COMMENT


	final static String i_l_ACPT_RSLT_COMMENT = null;

	// 第 21 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 22 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 23 変数初期値： i_PUCH_ODR_START_DATE_FROM


	final static String i_PUCH_ODR_START_DATE_FROM = null;

	// 第 24 変数初期値： i_PUCH_ODR_START_DATE_TO


	final static String i_PUCH_ODR_START_DATE_TO = null;

	// 第 25 変数初期値： i_PUCH_ODR_DLV_DATE_FROM


	final static String i_PUCH_ODR_DLV_DATE_FROM = null;

	// 第 26 変数初期値： i_PUCH_ODR_DLV_DATE_TO


	final static String i_PUCH_ODR_DLV_DATE_TO = null;

	// 第 27 変数初期値： i_ACPT_DATE_FROM


	final static String i_ACPT_DATE_FROM = null;

	// 第 28 変数初期値： i_ACPT_DATE_TO


	final static String i_ACPT_DATE_TO = null;

	// 第 29 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE_FROM


	final static String i_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;

	// 第 30 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE_TO


	final static String i_ODR_CANCEL_SLIP_ISS_DATE_TO = null;

	// 第 31 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 32 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 33 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 34 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 35 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 36 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 37 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 38 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 39 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 40 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 41 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE


	final static String i_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 42 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 43 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 44 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_ReOutputFlg

	final static String i_ReOutputFlg = null;

	// 第 3 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 4 変数初期値： i_l_PUCH_ODR_START_DATE

	final static String i_l_PUCH_ODR_START_DATE = null;

	// 第 5 変数初期値： i_l_PUCH_ODR_DLV_DATE

	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// 第 6 変数初期値： i_l_PUCH_ODR_QTY

	final static String i_l_PUCH_ODR_QTY = null;

	// 第 7 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 8 変数初期値： i_l_PUCH_ODR_SLIP_ISS_DATE

	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 9 変数初期値： i_l_ACPT_DATE

	final static String i_l_ACPT_DATE = null;

	// 第 10 変数初期値： i_l_ODR_CANCEL_SLIP_ISS_DATE

	final static String i_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 11 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 12 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 13 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 14 変数初期値： i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// 第 15 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 16 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 17 変数初期値： i_l_PUCH_ODR_PERSON

	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 18 変数初期値： i_l_USER_NAME

	final static String i_l_USER_NAME = null;

	// 第 19 変数初期値： i_l_ODR_CANCEL_CAUSE_CD

	final static String i_l_ODR_CANCEL_CAUSE_CD = null;

	// 第 20 変数初期値： i_l_ACPT_RSLT_COMMENT

	final static String i_l_ACPT_RSLT_COMMENT = null;

	// 第 21 変数初期値： i_l_MODIFY_COUNT

	final static String i_l_MODIFY_COUNT = null;

	// 第 22 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 23 変数初期値： i_PUCH_ODR_START_DATE_FROM

	final static String i_PUCH_ODR_START_DATE_FROM = null;

	// 第 24 変数初期値： i_PUCH_ODR_START_DATE_TO

	final static String i_PUCH_ODR_START_DATE_TO = null;

	// 第 25 変数初期値： i_PUCH_ODR_DLV_DATE_FROM

	final static String i_PUCH_ODR_DLV_DATE_FROM = null;

	// 第 26 変数初期値： i_PUCH_ODR_DLV_DATE_TO

	final static String i_PUCH_ODR_DLV_DATE_TO = null;

	// 第 27 変数初期値： i_ACPT_DATE_FROM

	final static String i_ACPT_DATE_FROM = null;

	// 第 28 変数初期値： i_ACPT_DATE_TO

	final static String i_ACPT_DATE_TO = null;

	// 第 29 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE_FROM

	final static String i_ODR_CANCEL_SLIP_ISS_DATE_FROM = null;

	// 第 30 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE_TO

	final static String i_ODR_CANCEL_SLIP_ISS_DATE_TO = null;

	// 第 31 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 32 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 33 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 34 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 35 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 36 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG

	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 37 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 38 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 39 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 40 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 41 変数初期値： i_ODR_CANCEL_SLIP_ISS_DATE

	final static String i_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 42 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_ReOutputFlg = i_ReOutputFlg;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_PUCH_ODR_START_DATE = i_l_PUCH_ODR_START_DATE;
		m_l_PUCH_ODR_DLV_DATE = i_l_PUCH_ODR_DLV_DATE;
		m_l_PUCH_ODR_QTY = i_l_PUCH_ODR_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_PUCH_ODR_SLIP_ISS_DATE = i_l_PUCH_ODR_SLIP_ISS_DATE;
		m_l_ACPT_DATE = i_l_ACPT_DATE;
		m_l_ODR_CANCEL_SLIP_ISS_DATE = i_l_ODR_CANCEL_SLIP_ISS_DATE;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_PUCH_ODR_PERSON = i_l_PUCH_ODR_PERSON;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_ODR_CANCEL_CAUSE_CD = i_l_ODR_CANCEL_CAUSE_CD;
		m_l_ACPT_RSLT_COMMENT = i_l_ACPT_RSLT_COMMENT;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_PLANT_CD = i_PLANT_CD;
		m_PUCH_ODR_START_DATE_FROM = i_PUCH_ODR_START_DATE_FROM;
		m_PUCH_ODR_START_DATE_TO = i_PUCH_ODR_START_DATE_TO;
		m_PUCH_ODR_DLV_DATE_FROM = i_PUCH_ODR_DLV_DATE_FROM;
		m_PUCH_ODR_DLV_DATE_TO = i_PUCH_ODR_DLV_DATE_TO;
		m_ACPT_DATE_FROM = i_ACPT_DATE_FROM;
		m_ACPT_DATE_TO = i_ACPT_DATE_TO;
		m_ODR_CANCEL_SLIP_ISS_DATE_FROM = i_ODR_CANCEL_SLIP_ISS_DATE_FROM;
		m_ODR_CANCEL_SLIP_ISS_DATE_TO = i_ODR_CANCEL_SLIP_ISS_DATE_TO;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_VEND_CD = i_VEND_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_ODR_CANCEL_SLIP_ISS_FLG = i_ODR_CANCEL_SLIP_ISS_FLG;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_ITEM_NAME = i_ITEM_NAME;
		m_USER_NAME = i_USER_NAME;
		m_ODR_CANCEL_SLIP_ISS_DATE = i_ODR_CANCEL_SLIP_ISS_DATE;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
