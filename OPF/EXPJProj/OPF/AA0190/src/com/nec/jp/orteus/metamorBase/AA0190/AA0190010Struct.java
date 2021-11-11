/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0190/src/com/nec/jp/orteus/metamorBase/AA0190/AA0190010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0190;

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
 * CLASS     : AA0190010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2017/01/09 08:38:51 $
 *
 */
//}}user_implement_code_header

public class AA0190010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_CLASS_CD1 */
	public String m_h_CLASS_CD1 = null;
	/** 第 2 変数： m_h_CLASS_CD2 */
	public String m_h_CLASS_CD2 = null;
	/** 第 3 変数： m_WriteStatus */
	public String m_WriteStatus = null;
	/** 第 4 変数： m_CLASS_NAME1 */
	public String m_CLASS_NAME1 = null;
	/** 第 5 変数： m_MODIFY_COUNT_CD1 */
	public String m_MODIFY_COUNT_CD1 = null;
	/** 第 6 変数： m_CLASS_CD1 */
	public String m_CLASS_CD1 = null;
	/** 第 7 変数： m_CLASS_NAME2 */
	public String m_CLASS_NAME2 = null;
	/** 第 8 変数： m_MODIFY_COUNT_CD2 */
	public String m_MODIFY_COUNT_CD2 = null;
	/** 第 9 変数： m_CLASS_CD2 */
	public String m_CLASS_CD2 = null;
	/** 第 10 変数： m_CLASS_CD3 */
	public String m_CLASS_CD3 = null;
	/** 第 11 変数： m_CLASS_NAME3 */
	public String m_CLASS_NAME3 = null;
	/** 第 12 変数： m_MODIFY_COUNT_CD3 */
	public String m_MODIFY_COUNT_CD3 = null;
	/** 第 13 変数： m_CUST_CLASS_01_CD */
	public String m_CUST_CLASS_01_CD = null;
	/** 第 14 変数： m_CUST_CLASS_02_CD */
	public String m_CUST_CLASS_02_CD = null;
	/** 第 15 変数： m_CUST_CLASS_03_CD */
	public String m_CUST_CLASS_03_CD = null;
	/** 第 16 変数： m_CUST_CLASS_04_CD */
	public String m_CUST_CLASS_04_CD = null;
	/** 第 17 変数： m_CUST_CLASS_05_CD */
	public String m_CUST_CLASS_05_CD = null;
	/** 第 18 変数： m_CUST_CLASS_06_CD */
	public String m_CUST_CLASS_06_CD = null;
	/** 第 19 変数： m_CUST_CLASS_07_CD */
	public String m_CUST_CLASS_07_CD = null;
	/** 第 20 変数： m_CUST_CLASS_08_CD */
	public String m_CUST_CLASS_08_CD = null;
	/** 第 21 変数： m_CUST_CLASS_09_CD */
	public String m_CUST_CLASS_09_CD = null;
	/** 第 22 変数： m_CUST_CLASS_10_CD */
	public String m_CUST_CLASS_10_CD = null;
	/** 第 23 変数： m_VEND_CLASS_01_CD */
	public String m_VEND_CLASS_01_CD = null;
	/** 第 24 変数： m_VEND_CLASS_02_CD */
	public String m_VEND_CLASS_02_CD = null;
	/** 第 25 変数： m_VEND_CLASS_03_CD */
	public String m_VEND_CLASS_03_CD = null;
	/** 第 26 変数： m_VEND_CLASS_04_CD */
	public String m_VEND_CLASS_04_CD = null;
	/** 第 27 変数： m_VEND_CLASS_05_CD */
	public String m_VEND_CLASS_05_CD = null;
	/** 第 28 変数： m_VEND_CLASS_06_CD */
	public String m_VEND_CLASS_06_CD = null;
	/** 第 29 変数： m_VEND_CLASS_07_CD */
	public String m_VEND_CLASS_07_CD = null;
	/** 第 30 変数： m_VEND_CLASS_08_CD */
	public String m_VEND_CLASS_08_CD = null;
	/** 第 31 変数： m_VEND_CLASS_09_CD */
	public String m_VEND_CLASS_09_CD = null;
	/** 第 32 変数： m_VEND_CLASS_10_CD */
	public String m_VEND_CLASS_10_CD = null;
	/** 第 33 変数： m_ITEM_CLASS_01_CD */
	public String m_ITEM_CLASS_01_CD = null;
	/** 第 34 変数： m_ITEM_CLASS_02_CD */
	public String m_ITEM_CLASS_02_CD = null;
	/** 第 35 変数： m_ITEM_CLASS_03_CD */
	public String m_ITEM_CLASS_03_CD = null;
	/** 第 36 変数： m_ITEM_CLASS_04_CD */
	public String m_ITEM_CLASS_04_CD = null;
	/** 第 37 変数： m_ITEM_CLASS_05_CD */
	public String m_ITEM_CLASS_05_CD = null;
	/** 第 38 変数： m_ITEM_CLASS_06_CD */
	public String m_ITEM_CLASS_06_CD = null;
	/** 第 39 変数： m_ITEM_CLASS_07_CD */
	public String m_ITEM_CLASS_07_CD = null;
	/** 第 40 変数： m_ITEM_CLASS_08_CD */
	public String m_ITEM_CLASS_08_CD = null;
	/** 第 41 変数： m_ITEM_CLASS_09_CD */
	public String m_ITEM_CLASS_09_CD = null;
	/** 第 42 変数： m_ITEM_CLASS_10_CD */
	public String m_ITEM_CLASS_10_CD = null;
	/** 第 43 変数： m_ITEM_CLASS_11_CD */
	public String m_ITEM_CLASS_11_CD = null;
	/** 第 44 変数： m_ITEM_CLASS_12_CD */
	public String m_ITEM_CLASS_12_CD = null;
	/** 第 45 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 46 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 47 変数： m_SEL_CLASS_CD1 */
	public String m_SEL_CLASS_CD1 = null;
	/** 第 48 変数： m_SEL_CLASS_CD2 */
	public String m_SEL_CLASS_CD2 = null;
	/** 第 49 変数： m_SEL_CLASS_CD3 */
	public String m_SEL_CLASS_CD3 = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_CLASS_CD1 */
	public List l_h_CLASS_CD1 = null;

	/** 第 2 List変数： l_h_CLASS_CD2 */
	public List l_h_CLASS_CD2 = null;

	/** 第 3 List変数： l_WriteStatus */
	public List l_WriteStatus = null;

	/** 第 4 List変数： l_CLASS_NAME1 */
	public List l_CLASS_NAME1 = null;

	/** 第 5 List変数： l_MODIFY_COUNT_CD1 */
	public List l_MODIFY_COUNT_CD1 = null;

	/** 第 6 List変数： l_CLASS_CD1 */
	public List l_CLASS_CD1 = null;

	/** 第 7 List変数： l_CLASS_NAME2 */
	public List l_CLASS_NAME2 = null;

	/** 第 8 List変数： l_MODIFY_COUNT_CD2 */
	public List l_MODIFY_COUNT_CD2 = null;

	/** 第 9 List変数： l_CLASS_CD2 */
	public List l_CLASS_CD2 = null;

	/** 第 10 List変数： l_CLASS_CD3 */
	public List l_CLASS_CD3 = null;

	/** 第 11 List変数： l_CLASS_NAME3 */
	public List l_CLASS_NAME3 = null;

	/** 第 12 List変数： l_MODIFY_COUNT_CD3 */
	public List l_MODIFY_COUNT_CD3 = null;

	/** 第 13 List変数： l_CUST_CLASS_01_CD */
	public List l_CUST_CLASS_01_CD = null;

	/** 第 14 List変数： l_CUST_CLASS_02_CD */
	public List l_CUST_CLASS_02_CD = null;

	/** 第 15 List変数： l_CUST_CLASS_03_CD */
	public List l_CUST_CLASS_03_CD = null;

	/** 第 16 List変数： l_CUST_CLASS_04_CD */
	public List l_CUST_CLASS_04_CD = null;

	/** 第 17 List変数： l_CUST_CLASS_05_CD */
	public List l_CUST_CLASS_05_CD = null;

	/** 第 18 List変数： l_CUST_CLASS_06_CD */
	public List l_CUST_CLASS_06_CD = null;

	/** 第 19 List変数： l_CUST_CLASS_07_CD */
	public List l_CUST_CLASS_07_CD = null;

	/** 第 20 List変数： l_CUST_CLASS_08_CD */
	public List l_CUST_CLASS_08_CD = null;

	/** 第 21 List変数： l_CUST_CLASS_09_CD */
	public List l_CUST_CLASS_09_CD = null;

	/** 第 22 List変数： l_CUST_CLASS_10_CD */
	public List l_CUST_CLASS_10_CD = null;

	/** 第 23 List変数： l_VEND_CLASS_01_CD */
	public List l_VEND_CLASS_01_CD = null;

	/** 第 24 List変数： l_VEND_CLASS_02_CD */
	public List l_VEND_CLASS_02_CD = null;

	/** 第 25 List変数： l_VEND_CLASS_03_CD */
	public List l_VEND_CLASS_03_CD = null;

	/** 第 26 List変数： l_VEND_CLASS_04_CD */
	public List l_VEND_CLASS_04_CD = null;

	/** 第 27 List変数： l_VEND_CLASS_05_CD */
	public List l_VEND_CLASS_05_CD = null;

	/** 第 28 List変数： l_VEND_CLASS_06_CD */
	public List l_VEND_CLASS_06_CD = null;

	/** 第 29 List変数： l_VEND_CLASS_07_CD */
	public List l_VEND_CLASS_07_CD = null;

	/** 第 30 List変数： l_VEND_CLASS_08_CD */
	public List l_VEND_CLASS_08_CD = null;

	/** 第 31 List変数： l_VEND_CLASS_09_CD */
	public List l_VEND_CLASS_09_CD = null;

	/** 第 32 List変数： l_VEND_CLASS_10_CD */
	public List l_VEND_CLASS_10_CD = null;

	/** 第 33 List変数： l_ITEM_CLASS_01_CD */
	public List l_ITEM_CLASS_01_CD = null;

	/** 第 34 List変数： l_ITEM_CLASS_02_CD */
	public List l_ITEM_CLASS_02_CD = null;

	/** 第 35 List変数： l_ITEM_CLASS_03_CD */
	public List l_ITEM_CLASS_03_CD = null;

	/** 第 36 List変数： l_ITEM_CLASS_04_CD */
	public List l_ITEM_CLASS_04_CD = null;

	/** 第 37 List変数： l_ITEM_CLASS_05_CD */
	public List l_ITEM_CLASS_05_CD = null;

	/** 第 38 List変数： l_ITEM_CLASS_06_CD */
	public List l_ITEM_CLASS_06_CD = null;

	/** 第 39 List変数： l_ITEM_CLASS_07_CD */
	public List l_ITEM_CLASS_07_CD = null;

	/** 第 40 List変数： l_ITEM_CLASS_08_CD */
	public List l_ITEM_CLASS_08_CD = null;

	/** 第 41 List変数： l_ITEM_CLASS_09_CD */
	public List l_ITEM_CLASS_09_CD = null;

	/** 第 42 List変数： l_ITEM_CLASS_10_CD */
	public List l_ITEM_CLASS_10_CD = null;

	/** 第 43 List変数： l_ITEM_CLASS_11_CD */
	public List l_ITEM_CLASS_11_CD = null;

	/** 第 44 List変数： l_ITEM_CLASS_12_CD */
	public List l_ITEM_CLASS_12_CD = null;

	/** 第 45 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 46 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 47 List変数： l_SEL_CLASS_CD1 */
	public List l_SEL_CLASS_CD1 = null;

	/** 第 48 List変数： l_SEL_CLASS_CD2 */
	public List l_SEL_CLASS_CD2 = null;

	/** 第 49 List変数： l_SEL_CLASS_CD3 */
	public List l_SEL_CLASS_CD3 = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_CLASS_CD1() { return m_h_CLASS_CD1; }
	public String geth_CLASS_CD2() { return m_h_CLASS_CD2; }
	public String getWriteStatus() { return m_WriteStatus; }
	public String getCLASS_NAME1() { return m_CLASS_NAME1; }
	public String getMODIFY_COUNT_CD1() { return m_MODIFY_COUNT_CD1; }
	public String getCLASS_CD1() { return m_CLASS_CD1; }
	public String getCLASS_NAME2() { return m_CLASS_NAME2; }
	public String getMODIFY_COUNT_CD2() { return m_MODIFY_COUNT_CD2; }
	public String getCLASS_CD2() { return m_CLASS_CD2; }
	public String getCLASS_CD3() { return m_CLASS_CD3; }
	public String getCLASS_NAME3() { return m_CLASS_NAME3; }
	public String getMODIFY_COUNT_CD3() { return m_MODIFY_COUNT_CD3; }
	public String getCUST_CLASS_01_CD() { return m_CUST_CLASS_01_CD; }
	public String getCUST_CLASS_02_CD() { return m_CUST_CLASS_02_CD; }
	public String getCUST_CLASS_03_CD() { return m_CUST_CLASS_03_CD; }
	public String getCUST_CLASS_04_CD() { return m_CUST_CLASS_04_CD; }
	public String getCUST_CLASS_05_CD() { return m_CUST_CLASS_05_CD; }
	public String getCUST_CLASS_06_CD() { return m_CUST_CLASS_06_CD; }
	public String getCUST_CLASS_07_CD() { return m_CUST_CLASS_07_CD; }
	public String getCUST_CLASS_08_CD() { return m_CUST_CLASS_08_CD; }
	public String getCUST_CLASS_09_CD() { return m_CUST_CLASS_09_CD; }
	public String getCUST_CLASS_10_CD() { return m_CUST_CLASS_10_CD; }
	public String getVEND_CLASS_01_CD() { return m_VEND_CLASS_01_CD; }
	public String getVEND_CLASS_02_CD() { return m_VEND_CLASS_02_CD; }
	public String getVEND_CLASS_03_CD() { return m_VEND_CLASS_03_CD; }
	public String getVEND_CLASS_04_CD() { return m_VEND_CLASS_04_CD; }
	public String getVEND_CLASS_05_CD() { return m_VEND_CLASS_05_CD; }
	public String getVEND_CLASS_06_CD() { return m_VEND_CLASS_06_CD; }
	public String getVEND_CLASS_07_CD() { return m_VEND_CLASS_07_CD; }
	public String getVEND_CLASS_08_CD() { return m_VEND_CLASS_08_CD; }
	public String getVEND_CLASS_09_CD() { return m_VEND_CLASS_09_CD; }
	public String getVEND_CLASS_10_CD() { return m_VEND_CLASS_10_CD; }
	public String getITEM_CLASS_01_CD() { return m_ITEM_CLASS_01_CD; }
	public String getITEM_CLASS_02_CD() { return m_ITEM_CLASS_02_CD; }
	public String getITEM_CLASS_03_CD() { return m_ITEM_CLASS_03_CD; }
	public String getITEM_CLASS_04_CD() { return m_ITEM_CLASS_04_CD; }
	public String getITEM_CLASS_05_CD() { return m_ITEM_CLASS_05_CD; }
	public String getITEM_CLASS_06_CD() { return m_ITEM_CLASS_06_CD; }
	public String getITEM_CLASS_07_CD() { return m_ITEM_CLASS_07_CD; }
	public String getITEM_CLASS_08_CD() { return m_ITEM_CLASS_08_CD; }
	public String getITEM_CLASS_09_CD() { return m_ITEM_CLASS_09_CD; }
	public String getITEM_CLASS_10_CD() { return m_ITEM_CLASS_10_CD; }
	public String getITEM_CLASS_11_CD() { return m_ITEM_CLASS_11_CD; }
	public String getITEM_CLASS_12_CD() { return m_ITEM_CLASS_12_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getSEL_CLASS_CD1() { return m_SEL_CLASS_CD1; }
	public String getSEL_CLASS_CD2() { return m_SEL_CLASS_CD2; }
	public String getSEL_CLASS_CD3() { return m_SEL_CLASS_CD3; }

	public List getList_h_CLASS_CD1() { return l_h_CLASS_CD1; }
	public List getList_h_CLASS_CD2() { return l_h_CLASS_CD2; }
	public List getList_WriteStatus() { return l_WriteStatus; }
	public List getList_CLASS_NAME1() { return l_CLASS_NAME1; }
	public List getList_MODIFY_COUNT_CD1() { return l_MODIFY_COUNT_CD1; }
	public List getList_CLASS_CD1() { return l_CLASS_CD1; }
	public List getList_CLASS_NAME2() { return l_CLASS_NAME2; }
	public List getList_MODIFY_COUNT_CD2() { return l_MODIFY_COUNT_CD2; }
	public List getList_CLASS_CD2() { return l_CLASS_CD2; }
	public List getList_CLASS_CD3() { return l_CLASS_CD3; }
	public List getList_CLASS_NAME3() { return l_CLASS_NAME3; }
	public List getList_MODIFY_COUNT_CD3() { return l_MODIFY_COUNT_CD3; }
	public List getList_CUST_CLASS_01_CD() { return l_CUST_CLASS_01_CD; }
	public List getList_CUST_CLASS_02_CD() { return l_CUST_CLASS_02_CD; }
	public List getList_CUST_CLASS_03_CD() { return l_CUST_CLASS_03_CD; }
	public List getList_CUST_CLASS_04_CD() { return l_CUST_CLASS_04_CD; }
	public List getList_CUST_CLASS_05_CD() { return l_CUST_CLASS_05_CD; }
	public List getList_CUST_CLASS_06_CD() { return l_CUST_CLASS_06_CD; }
	public List getList_CUST_CLASS_07_CD() { return l_CUST_CLASS_07_CD; }
	public List getList_CUST_CLASS_08_CD() { return l_CUST_CLASS_08_CD; }
	public List getList_CUST_CLASS_09_CD() { return l_CUST_CLASS_09_CD; }
	public List getList_CUST_CLASS_10_CD() { return l_CUST_CLASS_10_CD; }
	public List getList_VEND_CLASS_01_CD() { return l_VEND_CLASS_01_CD; }
	public List getList_VEND_CLASS_02_CD() { return l_VEND_CLASS_02_CD; }
	public List getList_VEND_CLASS_03_CD() { return l_VEND_CLASS_03_CD; }
	public List getList_VEND_CLASS_04_CD() { return l_VEND_CLASS_04_CD; }
	public List getList_VEND_CLASS_05_CD() { return l_VEND_CLASS_05_CD; }
	public List getList_VEND_CLASS_06_CD() { return l_VEND_CLASS_06_CD; }
	public List getList_VEND_CLASS_07_CD() { return l_VEND_CLASS_07_CD; }
	public List getList_VEND_CLASS_08_CD() { return l_VEND_CLASS_08_CD; }
	public List getList_VEND_CLASS_09_CD() { return l_VEND_CLASS_09_CD; }
	public List getList_VEND_CLASS_10_CD() { return l_VEND_CLASS_10_CD; }
	public List getList_ITEM_CLASS_01_CD() { return l_ITEM_CLASS_01_CD; }
	public List getList_ITEM_CLASS_02_CD() { return l_ITEM_CLASS_02_CD; }
	public List getList_ITEM_CLASS_03_CD() { return l_ITEM_CLASS_03_CD; }
	public List getList_ITEM_CLASS_04_CD() { return l_ITEM_CLASS_04_CD; }
	public List getList_ITEM_CLASS_05_CD() { return l_ITEM_CLASS_05_CD; }
	public List getList_ITEM_CLASS_06_CD() { return l_ITEM_CLASS_06_CD; }
	public List getList_ITEM_CLASS_07_CD() { return l_ITEM_CLASS_07_CD; }
	public List getList_ITEM_CLASS_08_CD() { return l_ITEM_CLASS_08_CD; }
	public List getList_ITEM_CLASS_09_CD() { return l_ITEM_CLASS_09_CD; }
	public List getList_ITEM_CLASS_10_CD() { return l_ITEM_CLASS_10_CD; }
	public List getList_ITEM_CLASS_11_CD() { return l_ITEM_CLASS_11_CD; }
	public List getList_ITEM_CLASS_12_CD() { return l_ITEM_CLASS_12_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_SEL_CLASS_CD1() { return l_SEL_CLASS_CD1; }
	public List getList_SEL_CLASS_CD2() { return l_SEL_CLASS_CD2; }
	public List getList_SEL_CLASS_CD3() { return l_SEL_CLASS_CD3; }

	public void seth_CLASS_CD1(String val) { m_h_CLASS_CD1 = val; }
	public void seth_CLASS_CD2(String val) { m_h_CLASS_CD2 = val; }
	public void setWriteStatus(String val) { m_WriteStatus = val; }
	public void setCLASS_NAME1(String val) { m_CLASS_NAME1 = val; }
	public void setMODIFY_COUNT_CD1(String val) { m_MODIFY_COUNT_CD1 = val; }
	public void setCLASS_CD1(String val) { m_CLASS_CD1 = val; }
	public void setCLASS_NAME2(String val) { m_CLASS_NAME2 = val; }
	public void setMODIFY_COUNT_CD2(String val) { m_MODIFY_COUNT_CD2 = val; }
	public void setCLASS_CD2(String val) { m_CLASS_CD2 = val; }
	public void setCLASS_CD3(String val) { m_CLASS_CD3 = val; }
	public void setCLASS_NAME3(String val) { m_CLASS_NAME3 = val; }
	public void setMODIFY_COUNT_CD3(String val) { m_MODIFY_COUNT_CD3 = val; }
	public void setCUST_CLASS_01_CD(String val) { m_CUST_CLASS_01_CD = val; }
	public void setCUST_CLASS_02_CD(String val) { m_CUST_CLASS_02_CD = val; }
	public void setCUST_CLASS_03_CD(String val) { m_CUST_CLASS_03_CD = val; }
	public void setCUST_CLASS_04_CD(String val) { m_CUST_CLASS_04_CD = val; }
	public void setCUST_CLASS_05_CD(String val) { m_CUST_CLASS_05_CD = val; }
	public void setCUST_CLASS_06_CD(String val) { m_CUST_CLASS_06_CD = val; }
	public void setCUST_CLASS_07_CD(String val) { m_CUST_CLASS_07_CD = val; }
	public void setCUST_CLASS_08_CD(String val) { m_CUST_CLASS_08_CD = val; }
	public void setCUST_CLASS_09_CD(String val) { m_CUST_CLASS_09_CD = val; }
	public void setCUST_CLASS_10_CD(String val) { m_CUST_CLASS_10_CD = val; }
	public void setVEND_CLASS_01_CD(String val) { m_VEND_CLASS_01_CD = val; }
	public void setVEND_CLASS_02_CD(String val) { m_VEND_CLASS_02_CD = val; }
	public void setVEND_CLASS_03_CD(String val) { m_VEND_CLASS_03_CD = val; }
	public void setVEND_CLASS_04_CD(String val) { m_VEND_CLASS_04_CD = val; }
	public void setVEND_CLASS_05_CD(String val) { m_VEND_CLASS_05_CD = val; }
	public void setVEND_CLASS_06_CD(String val) { m_VEND_CLASS_06_CD = val; }
	public void setVEND_CLASS_07_CD(String val) { m_VEND_CLASS_07_CD = val; }
	public void setVEND_CLASS_08_CD(String val) { m_VEND_CLASS_08_CD = val; }
	public void setVEND_CLASS_09_CD(String val) { m_VEND_CLASS_09_CD = val; }
	public void setVEND_CLASS_10_CD(String val) { m_VEND_CLASS_10_CD = val; }
	public void setITEM_CLASS_01_CD(String val) { m_ITEM_CLASS_01_CD = val; }
	public void setITEM_CLASS_02_CD(String val) { m_ITEM_CLASS_02_CD = val; }
	public void setITEM_CLASS_03_CD(String val) { m_ITEM_CLASS_03_CD = val; }
	public void setITEM_CLASS_04_CD(String val) { m_ITEM_CLASS_04_CD = val; }
	public void setITEM_CLASS_05_CD(String val) { m_ITEM_CLASS_05_CD = val; }
	public void setITEM_CLASS_06_CD(String val) { m_ITEM_CLASS_06_CD = val; }
	public void setITEM_CLASS_07_CD(String val) { m_ITEM_CLASS_07_CD = val; }
	public void setITEM_CLASS_08_CD(String val) { m_ITEM_CLASS_08_CD = val; }
	public void setITEM_CLASS_09_CD(String val) { m_ITEM_CLASS_09_CD = val; }
	public void setITEM_CLASS_10_CD(String val) { m_ITEM_CLASS_10_CD = val; }
	public void setITEM_CLASS_11_CD(String val) { m_ITEM_CLASS_11_CD = val; }
	public void setITEM_CLASS_12_CD(String val) { m_ITEM_CLASS_12_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setSEL_CLASS_CD1(String val) { m_SEL_CLASS_CD1 = val; }
	public void setSEL_CLASS_CD2(String val) { m_SEL_CLASS_CD2 = val; }
	public void setSEL_CLASS_CD3(String val) { m_SEL_CLASS_CD3 = val; }


	public void setList_h_CLASS_CD1(List list) { l_h_CLASS_CD1 = list; }
	public void setList_h_CLASS_CD2(List list) { l_h_CLASS_CD2 = list; }
	public void setList_WriteStatus(List list) { l_WriteStatus = list; }
	public void setList_CLASS_NAME1(List list) { l_CLASS_NAME1 = list; }
	public void setList_MODIFY_COUNT_CD1(List list) { l_MODIFY_COUNT_CD1 = list; }
	public void setList_CLASS_CD1(List list) { l_CLASS_CD1 = list; }
	public void setList_CLASS_NAME2(List list) { l_CLASS_NAME2 = list; }
	public void setList_MODIFY_COUNT_CD2(List list) { l_MODIFY_COUNT_CD2 = list; }
	public void setList_CLASS_CD2(List list) { l_CLASS_CD2 = list; }
	public void setList_CLASS_CD3(List list) { l_CLASS_CD3 = list; }
	public void setList_CLASS_NAME3(List list) { l_CLASS_NAME3 = list; }
	public void setList_MODIFY_COUNT_CD3(List list) { l_MODIFY_COUNT_CD3 = list; }
	public void setList_CUST_CLASS_01_CD(List list) { l_CUST_CLASS_01_CD = list; }
	public void setList_CUST_CLASS_02_CD(List list) { l_CUST_CLASS_02_CD = list; }
	public void setList_CUST_CLASS_03_CD(List list) { l_CUST_CLASS_03_CD = list; }
	public void setList_CUST_CLASS_04_CD(List list) { l_CUST_CLASS_04_CD = list; }
	public void setList_CUST_CLASS_05_CD(List list) { l_CUST_CLASS_05_CD = list; }
	public void setList_CUST_CLASS_06_CD(List list) { l_CUST_CLASS_06_CD = list; }
	public void setList_CUST_CLASS_07_CD(List list) { l_CUST_CLASS_07_CD = list; }
	public void setList_CUST_CLASS_08_CD(List list) { l_CUST_CLASS_08_CD = list; }
	public void setList_CUST_CLASS_09_CD(List list) { l_CUST_CLASS_09_CD = list; }
	public void setList_CUST_CLASS_10_CD(List list) { l_CUST_CLASS_10_CD = list; }
	public void setList_VEND_CLASS_01_CD(List list) { l_VEND_CLASS_01_CD = list; }
	public void setList_VEND_CLASS_02_CD(List list) { l_VEND_CLASS_02_CD = list; }
	public void setList_VEND_CLASS_03_CD(List list) { l_VEND_CLASS_03_CD = list; }
	public void setList_VEND_CLASS_04_CD(List list) { l_VEND_CLASS_04_CD = list; }
	public void setList_VEND_CLASS_05_CD(List list) { l_VEND_CLASS_05_CD = list; }
	public void setList_VEND_CLASS_06_CD(List list) { l_VEND_CLASS_06_CD = list; }
	public void setList_VEND_CLASS_07_CD(List list) { l_VEND_CLASS_07_CD = list; }
	public void setList_VEND_CLASS_08_CD(List list) { l_VEND_CLASS_08_CD = list; }
	public void setList_VEND_CLASS_09_CD(List list) { l_VEND_CLASS_09_CD = list; }
	public void setList_VEND_CLASS_10_CD(List list) { l_VEND_CLASS_10_CD = list; }
	public void setList_ITEM_CLASS_01_CD(List list) { l_ITEM_CLASS_01_CD = list; }
	public void setList_ITEM_CLASS_02_CD(List list) { l_ITEM_CLASS_02_CD = list; }
	public void setList_ITEM_CLASS_03_CD(List list) { l_ITEM_CLASS_03_CD = list; }
	public void setList_ITEM_CLASS_04_CD(List list) { l_ITEM_CLASS_04_CD = list; }
	public void setList_ITEM_CLASS_05_CD(List list) { l_ITEM_CLASS_05_CD = list; }
	public void setList_ITEM_CLASS_06_CD(List list) { l_ITEM_CLASS_06_CD = list; }
	public void setList_ITEM_CLASS_07_CD(List list) { l_ITEM_CLASS_07_CD = list; }
	public void setList_ITEM_CLASS_08_CD(List list) { l_ITEM_CLASS_08_CD = list; }
	public void setList_ITEM_CLASS_09_CD(List list) { l_ITEM_CLASS_09_CD = list; }
	public void setList_ITEM_CLASS_10_CD(List list) { l_ITEM_CLASS_10_CD = list; }
	public void setList_ITEM_CLASS_11_CD(List list) { l_ITEM_CLASS_11_CD = list; }
	public void setList_ITEM_CLASS_12_CD(List list) { l_ITEM_CLASS_12_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_SEL_CLASS_CD1(List list) { l_SEL_CLASS_CD1 = list; }
	public void setList_SEL_CLASS_CD2(List list) { l_SEL_CLASS_CD2 = list; }
	public void setList_SEL_CLASS_CD3(List list) { l_SEL_CLASS_CD3 = list; }

	public int setL2L_h_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CLASS_CD1 == null) {
			l_h_CLASS_CD1 = new ArrayList();
		} else {
			l_h_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CLASS_CD1.add(((AA0190010Struct) list.get(i)).geth_CLASS_CD1());
		}
		return size;
	}
	public int setL2L_h_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CLASS_CD2 == null) {
			l_h_CLASS_CD2 = new ArrayList();
		} else {
			l_h_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CLASS_CD2.add(((AA0190010Struct) list.get(i)).geth_CLASS_CD2());
		}
		return size;
	}
	public int setL2L_WriteStatus(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WriteStatus == null) {
			l_WriteStatus = new ArrayList();
		} else {
			l_WriteStatus.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WriteStatus.add(((AA0190010Struct) list.get(i)).getWriteStatus());
		}
		return size;
	}
	public int setL2L_CLASS_NAME1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME1 == null) {
			l_CLASS_NAME1 = new ArrayList();
		} else {
			l_CLASS_NAME1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME1.add(((AA0190010Struct) list.get(i)).getCLASS_NAME1());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD1 == null) {
			l_MODIFY_COUNT_CD1 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD1.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD1());
		}
		return size;
	}
	public int setL2L_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD1 == null) {
			l_CLASS_CD1 = new ArrayList();
		} else {
			l_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD1.add(((AA0190010Struct) list.get(i)).getCLASS_CD1());
		}
		return size;
	}
	public int setL2L_CLASS_NAME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME2 == null) {
			l_CLASS_NAME2 = new ArrayList();
		} else {
			l_CLASS_NAME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME2.add(((AA0190010Struct) list.get(i)).getCLASS_NAME2());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD2 == null) {
			l_MODIFY_COUNT_CD2 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD2.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD2());
		}
		return size;
	}
	public int setL2L_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD2 == null) {
			l_CLASS_CD2 = new ArrayList();
		} else {
			l_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD2.add(((AA0190010Struct) list.get(i)).getCLASS_CD2());
		}
		return size;
	}
	public int setL2L_CLASS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD3 == null) {
			l_CLASS_CD3 = new ArrayList();
		} else {
			l_CLASS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD3.add(((AA0190010Struct) list.get(i)).getCLASS_CD3());
		}
		return size;
	}
	public int setL2L_CLASS_NAME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME3 == null) {
			l_CLASS_NAME3 = new ArrayList();
		} else {
			l_CLASS_NAME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME3.add(((AA0190010Struct) list.get(i)).getCLASS_NAME3());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD3 == null) {
			l_MODIFY_COUNT_CD3 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD3.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD3());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_01_CD == null) {
			l_CUST_CLASS_01_CD = new ArrayList();
		} else {
			l_CUST_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_02_CD == null) {
			l_CUST_CLASS_02_CD = new ArrayList();
		} else {
			l_CUST_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_03_CD == null) {
			l_CUST_CLASS_03_CD = new ArrayList();
		} else {
			l_CUST_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_04_CD == null) {
			l_CUST_CLASS_04_CD = new ArrayList();
		} else {
			l_CUST_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_05_CD == null) {
			l_CUST_CLASS_05_CD = new ArrayList();
		} else {
			l_CUST_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_06_CD == null) {
			l_CUST_CLASS_06_CD = new ArrayList();
		} else {
			l_CUST_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_07_CD == null) {
			l_CUST_CLASS_07_CD = new ArrayList();
		} else {
			l_CUST_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_08_CD == null) {
			l_CUST_CLASS_08_CD = new ArrayList();
		} else {
			l_CUST_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_09_CD == null) {
			l_CUST_CLASS_09_CD = new ArrayList();
		} else {
			l_CUST_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_10_CD == null) {
			l_CUST_CLASS_10_CD = new ArrayList();
		} else {
			l_CUST_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_01_CD == null) {
			l_VEND_CLASS_01_CD = new ArrayList();
		} else {
			l_VEND_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_02_CD == null) {
			l_VEND_CLASS_02_CD = new ArrayList();
		} else {
			l_VEND_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_03_CD == null) {
			l_VEND_CLASS_03_CD = new ArrayList();
		} else {
			l_VEND_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_04_CD == null) {
			l_VEND_CLASS_04_CD = new ArrayList();
		} else {
			l_VEND_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_05_CD == null) {
			l_VEND_CLASS_05_CD = new ArrayList();
		} else {
			l_VEND_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_06_CD == null) {
			l_VEND_CLASS_06_CD = new ArrayList();
		} else {
			l_VEND_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_07_CD == null) {
			l_VEND_CLASS_07_CD = new ArrayList();
		} else {
			l_VEND_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_08_CD == null) {
			l_VEND_CLASS_08_CD = new ArrayList();
		} else {
			l_VEND_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_09_CD == null) {
			l_VEND_CLASS_09_CD = new ArrayList();
		} else {
			l_VEND_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_10_CD == null) {
			l_VEND_CLASS_10_CD = new ArrayList();
		} else {
			l_VEND_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_01_CD == null) {
			l_ITEM_CLASS_01_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_02_CD == null) {
			l_ITEM_CLASS_02_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_03_CD == null) {
			l_ITEM_CLASS_03_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_04_CD == null) {
			l_ITEM_CLASS_04_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_05_CD == null) {
			l_ITEM_CLASS_05_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_06_CD == null) {
			l_ITEM_CLASS_06_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_07_CD == null) {
			l_ITEM_CLASS_07_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_08_CD == null) {
			l_ITEM_CLASS_08_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_09_CD == null) {
			l_ITEM_CLASS_09_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_10_CD == null) {
			l_ITEM_CLASS_10_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_11_CD == null) {
			l_ITEM_CLASS_11_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_11_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_12_CD == null) {
			l_ITEM_CLASS_12_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_12_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_12_CD());
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
			l_l_COUNT.add(((AA0190010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AA0190010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD1 == null) {
			l_SEL_CLASS_CD1 = new ArrayList();
		} else {
			l_SEL_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD1.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD1());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD2 == null) {
			l_SEL_CLASS_CD2 = new ArrayList();
		} else {
			l_SEL_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD2.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD2());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD3 == null) {
			l_SEL_CLASS_CD3 = new ArrayList();
		} else {
			l_SEL_CLASS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD3.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD3());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_CLASS_CD1 = null;
		m_h_CLASS_CD2 = null;
		m_WriteStatus = null;
		m_CLASS_NAME1 = null;
		m_MODIFY_COUNT_CD1 = null;
		m_CLASS_CD1 = null;
		m_CLASS_NAME2 = null;
		m_MODIFY_COUNT_CD2 = null;
		m_CLASS_CD2 = null;
		m_CLASS_CD3 = null;
		m_CLASS_NAME3 = null;
		m_MODIFY_COUNT_CD3 = null;
		m_CUST_CLASS_01_CD = null;
		m_CUST_CLASS_02_CD = null;
		m_CUST_CLASS_03_CD = null;
		m_CUST_CLASS_04_CD = null;
		m_CUST_CLASS_05_CD = null;
		m_CUST_CLASS_06_CD = null;
		m_CUST_CLASS_07_CD = null;
		m_CUST_CLASS_08_CD = null;
		m_CUST_CLASS_09_CD = null;
		m_CUST_CLASS_10_CD = null;
		m_VEND_CLASS_01_CD = null;
		m_VEND_CLASS_02_CD = null;
		m_VEND_CLASS_03_CD = null;
		m_VEND_CLASS_04_CD = null;
		m_VEND_CLASS_05_CD = null;
		m_VEND_CLASS_06_CD = null;
		m_VEND_CLASS_07_CD = null;
		m_VEND_CLASS_08_CD = null;
		m_VEND_CLASS_09_CD = null;
		m_VEND_CLASS_10_CD = null;
		m_ITEM_CLASS_01_CD = null;
		m_ITEM_CLASS_02_CD = null;
		m_ITEM_CLASS_03_CD = null;
		m_ITEM_CLASS_04_CD = null;
		m_ITEM_CLASS_05_CD = null;
		m_ITEM_CLASS_06_CD = null;
		m_ITEM_CLASS_07_CD = null;
		m_ITEM_CLASS_08_CD = null;
		m_ITEM_CLASS_09_CD = null;
		m_ITEM_CLASS_10_CD = null;
		m_ITEM_CLASS_11_CD = null;
		m_ITEM_CLASS_12_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_SEL_CLASS_CD1 = null;
		m_SEL_CLASS_CD2 = null;
		m_SEL_CLASS_CD3 = null;

		l_h_CLASS_CD1 = null;
		l_h_CLASS_CD2 = null;
		l_WriteStatus = null;
		l_CLASS_NAME1 = null;
		l_MODIFY_COUNT_CD1 = null;
		l_CLASS_CD1 = null;
		l_CLASS_NAME2 = null;
		l_MODIFY_COUNT_CD2 = null;
		l_CLASS_CD2 = null;
		l_CLASS_CD3 = null;
		l_CLASS_NAME3 = null;
		l_MODIFY_COUNT_CD3 = null;
		l_CUST_CLASS_01_CD = null;
		l_CUST_CLASS_02_CD = null;
		l_CUST_CLASS_03_CD = null;
		l_CUST_CLASS_04_CD = null;
		l_CUST_CLASS_05_CD = null;
		l_CUST_CLASS_06_CD = null;
		l_CUST_CLASS_07_CD = null;
		l_CUST_CLASS_08_CD = null;
		l_CUST_CLASS_09_CD = null;
		l_CUST_CLASS_10_CD = null;
		l_VEND_CLASS_01_CD = null;
		l_VEND_CLASS_02_CD = null;
		l_VEND_CLASS_03_CD = null;
		l_VEND_CLASS_04_CD = null;
		l_VEND_CLASS_05_CD = null;
		l_VEND_CLASS_06_CD = null;
		l_VEND_CLASS_07_CD = null;
		l_VEND_CLASS_08_CD = null;
		l_VEND_CLASS_09_CD = null;
		l_VEND_CLASS_10_CD = null;
		l_ITEM_CLASS_01_CD = null;
		l_ITEM_CLASS_02_CD = null;
		l_ITEM_CLASS_03_CD = null;
		l_ITEM_CLASS_04_CD = null;
		l_ITEM_CLASS_05_CD = null;
		l_ITEM_CLASS_06_CD = null;
		l_ITEM_CLASS_07_CD = null;
		l_ITEM_CLASS_08_CD = null;
		l_ITEM_CLASS_09_CD = null;
		l_ITEM_CLASS_10_CD = null;
		l_ITEM_CLASS_11_CD = null;
		l_ITEM_CLASS_12_CD = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_SEL_CLASS_CD1 = null;
		l_SEL_CLASS_CD2 = null;
		l_SEL_CLASS_CD3 = null;

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
	 * medAA0190010クラスの標準コンストラクタ
	 */
	public AA0190010Struct()
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
	public void setStruct(AA0190010Struct struct)
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
	public void setStructM(AA0190010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_CLASS_CD1(struct.geth_CLASS_CD1());
			this.seth_CLASS_CD2(struct.geth_CLASS_CD2());
			this.setWriteStatus(struct.getWriteStatus());
			this.setCLASS_NAME1(struct.getCLASS_NAME1());
			this.setMODIFY_COUNT_CD1(struct.getMODIFY_COUNT_CD1());
			this.setCLASS_CD1(struct.getCLASS_CD1());
			this.setCLASS_NAME2(struct.getCLASS_NAME2());
			this.setMODIFY_COUNT_CD2(struct.getMODIFY_COUNT_CD2());
			this.setCLASS_CD2(struct.getCLASS_CD2());
			this.setCLASS_CD3(struct.getCLASS_CD3());
			this.setCLASS_NAME3(struct.getCLASS_NAME3());
			this.setMODIFY_COUNT_CD3(struct.getMODIFY_COUNT_CD3());
			this.setCUST_CLASS_01_CD(struct.getCUST_CLASS_01_CD());
			this.setCUST_CLASS_02_CD(struct.getCUST_CLASS_02_CD());
			this.setCUST_CLASS_03_CD(struct.getCUST_CLASS_03_CD());
			this.setCUST_CLASS_04_CD(struct.getCUST_CLASS_04_CD());
			this.setCUST_CLASS_05_CD(struct.getCUST_CLASS_05_CD());
			this.setCUST_CLASS_06_CD(struct.getCUST_CLASS_06_CD());
			this.setCUST_CLASS_07_CD(struct.getCUST_CLASS_07_CD());
			this.setCUST_CLASS_08_CD(struct.getCUST_CLASS_08_CD());
			this.setCUST_CLASS_09_CD(struct.getCUST_CLASS_09_CD());
			this.setCUST_CLASS_10_CD(struct.getCUST_CLASS_10_CD());
			this.setVEND_CLASS_01_CD(struct.getVEND_CLASS_01_CD());
			this.setVEND_CLASS_02_CD(struct.getVEND_CLASS_02_CD());
			this.setVEND_CLASS_03_CD(struct.getVEND_CLASS_03_CD());
			this.setVEND_CLASS_04_CD(struct.getVEND_CLASS_04_CD());
			this.setVEND_CLASS_05_CD(struct.getVEND_CLASS_05_CD());
			this.setVEND_CLASS_06_CD(struct.getVEND_CLASS_06_CD());
			this.setVEND_CLASS_07_CD(struct.getVEND_CLASS_07_CD());
			this.setVEND_CLASS_08_CD(struct.getVEND_CLASS_08_CD());
			this.setVEND_CLASS_09_CD(struct.getVEND_CLASS_09_CD());
			this.setVEND_CLASS_10_CD(struct.getVEND_CLASS_10_CD());
			this.setITEM_CLASS_01_CD(struct.getITEM_CLASS_01_CD());
			this.setITEM_CLASS_02_CD(struct.getITEM_CLASS_02_CD());
			this.setITEM_CLASS_03_CD(struct.getITEM_CLASS_03_CD());
			this.setITEM_CLASS_04_CD(struct.getITEM_CLASS_04_CD());
			this.setITEM_CLASS_05_CD(struct.getITEM_CLASS_05_CD());
			this.setITEM_CLASS_06_CD(struct.getITEM_CLASS_06_CD());
			this.setITEM_CLASS_07_CD(struct.getITEM_CLASS_07_CD());
			this.setITEM_CLASS_08_CD(struct.getITEM_CLASS_08_CD());
			this.setITEM_CLASS_09_CD(struct.getITEM_CLASS_09_CD());
			this.setITEM_CLASS_10_CD(struct.getITEM_CLASS_10_CD());
			this.setITEM_CLASS_11_CD(struct.getITEM_CLASS_11_CD());
			this.setITEM_CLASS_12_CD(struct.getITEM_CLASS_12_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setSEL_CLASS_CD1(struct.getSEL_CLASS_CD1());
			this.setSEL_CLASS_CD2(struct.getSEL_CLASS_CD2());
			this.setSEL_CLASS_CD3(struct.getSEL_CLASS_CD3());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0190010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_CLASS_CD1(struct.getList_h_CLASS_CD1());
			this.setList_h_CLASS_CD2(struct.getList_h_CLASS_CD2());
			this.setList_WriteStatus(struct.getList_WriteStatus());
			this.setList_CLASS_NAME1(struct.getList_CLASS_NAME1());
			this.setList_MODIFY_COUNT_CD1(struct.getList_MODIFY_COUNT_CD1());
			this.setList_CLASS_CD1(struct.getList_CLASS_CD1());
			this.setList_CLASS_NAME2(struct.getList_CLASS_NAME2());
			this.setList_MODIFY_COUNT_CD2(struct.getList_MODIFY_COUNT_CD2());
			this.setList_CLASS_CD2(struct.getList_CLASS_CD2());
			this.setList_CLASS_CD3(struct.getList_CLASS_CD3());
			this.setList_CLASS_NAME3(struct.getList_CLASS_NAME3());
			this.setList_MODIFY_COUNT_CD3(struct.getList_MODIFY_COUNT_CD3());
			this.setList_CUST_CLASS_01_CD(struct.getList_CUST_CLASS_01_CD());
			this.setList_CUST_CLASS_02_CD(struct.getList_CUST_CLASS_02_CD());
			this.setList_CUST_CLASS_03_CD(struct.getList_CUST_CLASS_03_CD());
			this.setList_CUST_CLASS_04_CD(struct.getList_CUST_CLASS_04_CD());
			this.setList_CUST_CLASS_05_CD(struct.getList_CUST_CLASS_05_CD());
			this.setList_CUST_CLASS_06_CD(struct.getList_CUST_CLASS_06_CD());
			this.setList_CUST_CLASS_07_CD(struct.getList_CUST_CLASS_07_CD());
			this.setList_CUST_CLASS_08_CD(struct.getList_CUST_CLASS_08_CD());
			this.setList_CUST_CLASS_09_CD(struct.getList_CUST_CLASS_09_CD());
			this.setList_CUST_CLASS_10_CD(struct.getList_CUST_CLASS_10_CD());
			this.setList_VEND_CLASS_01_CD(struct.getList_VEND_CLASS_01_CD());
			this.setList_VEND_CLASS_02_CD(struct.getList_VEND_CLASS_02_CD());
			this.setList_VEND_CLASS_03_CD(struct.getList_VEND_CLASS_03_CD());
			this.setList_VEND_CLASS_04_CD(struct.getList_VEND_CLASS_04_CD());
			this.setList_VEND_CLASS_05_CD(struct.getList_VEND_CLASS_05_CD());
			this.setList_VEND_CLASS_06_CD(struct.getList_VEND_CLASS_06_CD());
			this.setList_VEND_CLASS_07_CD(struct.getList_VEND_CLASS_07_CD());
			this.setList_VEND_CLASS_08_CD(struct.getList_VEND_CLASS_08_CD());
			this.setList_VEND_CLASS_09_CD(struct.getList_VEND_CLASS_09_CD());
			this.setList_VEND_CLASS_10_CD(struct.getList_VEND_CLASS_10_CD());
			this.setList_ITEM_CLASS_01_CD(struct.getList_ITEM_CLASS_01_CD());
			this.setList_ITEM_CLASS_02_CD(struct.getList_ITEM_CLASS_02_CD());
			this.setList_ITEM_CLASS_03_CD(struct.getList_ITEM_CLASS_03_CD());
			this.setList_ITEM_CLASS_04_CD(struct.getList_ITEM_CLASS_04_CD());
			this.setList_ITEM_CLASS_05_CD(struct.getList_ITEM_CLASS_05_CD());
			this.setList_ITEM_CLASS_06_CD(struct.getList_ITEM_CLASS_06_CD());
			this.setList_ITEM_CLASS_07_CD(struct.getList_ITEM_CLASS_07_CD());
			this.setList_ITEM_CLASS_08_CD(struct.getList_ITEM_CLASS_08_CD());
			this.setList_ITEM_CLASS_09_CD(struct.getList_ITEM_CLASS_09_CD());
			this.setList_ITEM_CLASS_10_CD(struct.getList_ITEM_CLASS_10_CD());
			this.setList_ITEM_CLASS_11_CD(struct.getList_ITEM_CLASS_11_CD());
			this.setList_ITEM_CLASS_12_CD(struct.getList_ITEM_CLASS_12_CD());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_SEL_CLASS_CD1(struct.getList_SEL_CLASS_CD1());
			this.setList_SEL_CLASS_CD2(struct.getList_SEL_CLASS_CD2());
			this.setList_SEL_CLASS_CD3(struct.getList_SEL_CLASS_CD3());
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
	// 第 1 変数初期値： i_h_CLASS_CD1


	final static String i_h_CLASS_CD1 = null;

	// 第 2 変数初期値： i_h_CLASS_CD2


	final static String i_h_CLASS_CD2 = null;

	// 第 3 変数初期値： i_WriteStatus


	final static String i_WriteStatus = null;

	// 第 4 変数初期値： i_CLASS_NAME1


	final static String i_CLASS_NAME1 = null;

	// 第 5 変数初期値： i_MODIFY_COUNT_CD1


	final static String i_MODIFY_COUNT_CD1 = null;

	// 第 6 変数初期値： i_CLASS_CD1


	final static String i_CLASS_CD1 = null;

	// 第 7 変数初期値： i_CLASS_NAME2


	final static String i_CLASS_NAME2 = null;

	// 第 8 変数初期値： i_MODIFY_COUNT_CD2


	final static String i_MODIFY_COUNT_CD2 = null;

	// 第 9 変数初期値： i_CLASS_CD2


	final static String i_CLASS_CD2 = null;

	// 第 10 変数初期値： i_CLASS_CD3


	final static String i_CLASS_CD3 = null;

	// 第 11 変数初期値： i_CLASS_NAME3


	final static String i_CLASS_NAME3 = null;

	// 第 12 変数初期値： i_MODIFY_COUNT_CD3


	final static String i_MODIFY_COUNT_CD3 = null;

	// 第 13 変数初期値： i_CUST_CLASS_01_CD


	final static String i_CUST_CLASS_01_CD = null;

	// 第 14 変数初期値： i_CUST_CLASS_02_CD


	final static String i_CUST_CLASS_02_CD = null;

	// 第 15 変数初期値： i_CUST_CLASS_03_CD


	final static String i_CUST_CLASS_03_CD = null;

	// 第 16 変数初期値： i_CUST_CLASS_04_CD


	final static String i_CUST_CLASS_04_CD = null;

	// 第 17 変数初期値： i_CUST_CLASS_05_CD


	final static String i_CUST_CLASS_05_CD = null;

	// 第 18 変数初期値： i_CUST_CLASS_06_CD


	final static String i_CUST_CLASS_06_CD = null;

	// 第 19 変数初期値： i_CUST_CLASS_07_CD


	final static String i_CUST_CLASS_07_CD = null;

	// 第 20 変数初期値： i_CUST_CLASS_08_CD


	final static String i_CUST_CLASS_08_CD = null;

	// 第 21 変数初期値： i_CUST_CLASS_09_CD


	final static String i_CUST_CLASS_09_CD = null;

	// 第 22 変数初期値： i_CUST_CLASS_10_CD


	final static String i_CUST_CLASS_10_CD = null;

	// 第 23 変数初期値： i_VEND_CLASS_01_CD


	final static String i_VEND_CLASS_01_CD = null;

	// 第 24 変数初期値： i_VEND_CLASS_02_CD


	final static String i_VEND_CLASS_02_CD = null;

	// 第 25 変数初期値： i_VEND_CLASS_03_CD


	final static String i_VEND_CLASS_03_CD = null;

	// 第 26 変数初期値： i_VEND_CLASS_04_CD


	final static String i_VEND_CLASS_04_CD = null;

	// 第 27 変数初期値： i_VEND_CLASS_05_CD


	final static String i_VEND_CLASS_05_CD = null;

	// 第 28 変数初期値： i_VEND_CLASS_06_CD


	final static String i_VEND_CLASS_06_CD = null;

	// 第 29 変数初期値： i_VEND_CLASS_07_CD


	final static String i_VEND_CLASS_07_CD = null;

	// 第 30 変数初期値： i_VEND_CLASS_08_CD


	final static String i_VEND_CLASS_08_CD = null;

	// 第 31 変数初期値： i_VEND_CLASS_09_CD


	final static String i_VEND_CLASS_09_CD = null;

	// 第 32 変数初期値： i_VEND_CLASS_10_CD


	final static String i_VEND_CLASS_10_CD = null;

	// 第 33 変数初期値： i_ITEM_CLASS_01_CD


	final static String i_ITEM_CLASS_01_CD = null;

	// 第 34 変数初期値： i_ITEM_CLASS_02_CD


	final static String i_ITEM_CLASS_02_CD = null;

	// 第 35 変数初期値： i_ITEM_CLASS_03_CD


	final static String i_ITEM_CLASS_03_CD = null;

	// 第 36 変数初期値： i_ITEM_CLASS_04_CD


	final static String i_ITEM_CLASS_04_CD = null;

	// 第 37 変数初期値： i_ITEM_CLASS_05_CD


	final static String i_ITEM_CLASS_05_CD = null;

	// 第 38 変数初期値： i_ITEM_CLASS_06_CD


	final static String i_ITEM_CLASS_06_CD = null;

	// 第 39 変数初期値： i_ITEM_CLASS_07_CD


	final static String i_ITEM_CLASS_07_CD = null;

	// 第 40 変数初期値： i_ITEM_CLASS_08_CD


	final static String i_ITEM_CLASS_08_CD = null;

	// 第 41 変数初期値： i_ITEM_CLASS_09_CD


	final static String i_ITEM_CLASS_09_CD = null;

	// 第 42 変数初期値： i_ITEM_CLASS_10_CD


	final static String i_ITEM_CLASS_10_CD = null;

	// 第 43 変数初期値： i_ITEM_CLASS_11_CD


	final static String i_ITEM_CLASS_11_CD = null;

	// 第 44 変数初期値： i_ITEM_CLASS_12_CD


	final static String i_ITEM_CLASS_12_CD = null;

	// 第 45 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 46 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 47 変数初期値： i_SEL_CLASS_CD1


	final static String i_SEL_CLASS_CD1 = null;

	// 第 48 変数初期値： i_SEL_CLASS_CD2


	final static String i_SEL_CLASS_CD2 = null;

	// 第 49 変数初期値： i_SEL_CLASS_CD3


	final static String i_SEL_CLASS_CD3 = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_CLASS_CD1

	final static String i_CLASS_CD1 = null;

	// 第 2 変数初期値： i_CLASS_CD2

	final static String i_CLASS_CD2 = null;

	// 第 3 変数初期値： i_CLASS_NAME1

	final static String i_CLASS_NAME1 = null;

	// 第 4 変数初期値： i_CLASS_NAME2

	final static String i_CLASS_NAME2 = null;

	// 第 5 変数初期値： i_DEL_FLG

	final static String i_DEL_FLG = null;

	// 第 6 変数初期値： i_CLASS_CD3

	final static String i_CLASS_CD3 = null;

	// 第 7 変数初期値： i_CLASS_NAME3

	final static String i_CLASS_NAME3 = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_CLASS_CD1 = i_CLASS_CD1;
		m_CLASS_CD2 = i_CLASS_CD2;
		m_CLASS_NAME1 = i_CLASS_NAME1;
		m_CLASS_NAME2 = i_CLASS_NAME2;
/*		m_DEL_FLG = i_DEL_FLG;*/
		m_CLASS_CD3 = i_CLASS_CD3;
		m_CLASS_NAME3 = i_CLASS_NAME3;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
