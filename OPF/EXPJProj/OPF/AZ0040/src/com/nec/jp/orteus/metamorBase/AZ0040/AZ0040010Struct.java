/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/src/com/nec/jp/orteus/metamorBase/AZ0040/AZ0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0040;

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
 * CLASS     : AZ0040010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.13 $ $Date: 2017/01/09 08:54:38 $
 *
 */
//}}user_implement_code_header

public class AZ0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_sub1COLUMN_TYPE */
	public String m_sub1COLUMN_TYPE = null;
	/** 第 2 変数： m_sub1COND_TYPE */
	public String m_sub1COND_TYPE = null;
	/** 第 3 変数： m_sub1COND_TYPE_name */
	public String m_sub1COND_TYPE_name = null;
	/** 第 4 変数： m_sub1COND_TYPE_val */
	public String m_sub1COND_TYPE_val = null;
	/** 第 5 変数： m_sub1COND_VALUE1 */
	public String m_sub1COND_VALUE1 = null;
	/** 第 6 変数： m_sub1COND_VALUE2 */
	public String m_sub1COND_VALUE2 = null;
	/** 第 7 変数： m_sub1DISPLAY_FLG */
	public String m_sub1DISPLAY_FLG = null;
	/** 第 8 変数： m_sub1SORT_TYPE */
	public String m_sub1SORT_TYPE = null;
	/** 第 9 変数： m_sub1SORT_TYPE_name */
	public String m_sub1SORT_TYPE_name = null;
	/** 第 10 変数： m_sub1SORT_TYPE_val */
	public String m_sub1SORT_TYPE_val = null;
	/** 第 11 変数： m_sub1SORTKEY_PRI */
	public String m_sub1SORTKEY_PRI = null;
	/** 第 12 変数： m_sub1TABLE_NAME_COMMENT */
	public String m_sub1TABLE_NAME_COMMENT = null;
	/** 第 13 変数： m_sub1TABLE_NAME */
	public String m_sub1TABLE_NAME = null;
	/** 第 14 変数： m_sub1COLUMN_NAME */
	public String m_sub1COLUMN_NAME = null;
	/** 第 15 変数： m_sub1COLUMN_NAME_COMMENT */
	public String m_sub1COLUMN_NAME_COMMENT = null;
	/** 第 16 変数： m_EDIT_NAME */
	public String m_EDIT_NAME = null;
	/** 第 17 変数： m_h_TABLE_TO */
	public String m_h_TABLE_TO = null;
	/** 第 18 変数： m_h_TABLE_COMMENT_TO */
	public String m_h_TABLE_COMMENT_TO = null;
	/** 第 19 変数： m_h_TABLE_ALIAS_TO */
	public String m_h_TABLE_ALIAS_TO = null;
	/** 第 20 変数： m_h_LEFT_TABLE_NAME */
	public String m_h_LEFT_TABLE_NAME = null;
	/** 第 21 変数： m_h_LEFT_TABLE_ALIAS */
	public String m_h_LEFT_TABLE_ALIAS = null;
	/** 第 22 変数： m_h_LEFT_COLUMN */
	public String m_h_LEFT_COLUMN = null;
	/** 第 23 変数： m_h_RIGHT_TABLE_NAME */
	public String m_h_RIGHT_TABLE_NAME = null;
	/** 第 24 変数： m_h_RIGHT_TABLE_ALIAS */
	public String m_h_RIGHT_TABLE_ALIAS = null;
	/** 第 25 変数： m_h_RIGHT_COLUMN */
	public String m_h_RIGHT_COLUMN = null;
	/** 第 26 変数： m_h_CONDITION */
	public String m_h_CONDITION = null;
	/** 第 27 変数： m_h_COLUMN */
	public String m_h_COLUMN = null;
	/** 第 28 変数： m_h_TABLE_ALIAS */
	public String m_h_TABLE_ALIAS = null;
	/** 第 29 変数： m_h_TABLE_NAME */
	public String m_h_TABLE_NAME = null;
	/** 第 30 変数： m_EDIT_TYP */
	public String m_EDIT_TYP = null;
	/** 第 31 変数： m_QUERY_NAME */
	public String m_QUERY_NAME = null;
	/** 第 32 変数： m_QUERY_GROUP */
	public String m_QUERY_GROUP = null;
	/** 第 33 変数： m_QUERY_MEMO */
	public String m_QUERY_MEMO = null;
	/** 第 34 変数： m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** 第 35 変数： m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** 第 36 変数： m_UPDATED_DATE */
	public String m_UPDATED_DATE = null;
	/** 第 37 変数： m_UPDATED_BY */
	public String m_UPDATED_BY = null;
	/** 第 38 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 39 変数： m_QUERY_CD */
	public String m_QUERY_CD = null;
	/** 第 40 変数： m_SQL_INFO */
	public String m_SQL_INFO = null;
	/** 第 41 変数： m_CREATED_PRG_NM */
	public String m_CREATED_PRG_NM = null;
	/** 第 42 変数： m_UPDATED_PRG_NM */
	public String m_UPDATED_PRG_NM = null;
	/** 第 43 変数： m_w_USER_CD */
	public String m_w_USER_CD = null;
	/** 第 44 変数： m_w_QUERY_NAME */
	public String m_w_QUERY_NAME = null;
	/** 第 45 変数： m_w_QUERY_GROUP */
	public String m_w_QUERY_GROUP = null;
	/** 第 46 変数： m_w_MEMO */
	public String m_w_MEMO = null;
	/** 第 47 変数： m_w_CREATED_BY */
	public String m_w_CREATED_BY = null;
	/** 第 48 変数： m_w_CREATED_DATE_FROM */
	public String m_w_CREATED_DATE_FROM = null;
	/** 第 49 変数： m_w_CREATED_DATE_TO */
	public String m_w_CREATED_DATE_TO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_sub1COLUMN_TYPE */
	public List l_sub1COLUMN_TYPE = null;

	/** 第 2 List変数： l_sub1COND_TYPE */
	public List l_sub1COND_TYPE = null;

	/** 第 3 List変数： l_sub1COND_TYPE_name */
	public List l_sub1COND_TYPE_name = null;

	/** 第 4 List変数： l_sub1COND_TYPE_val */
	public List l_sub1COND_TYPE_val = null;

	/** 第 5 List変数： l_sub1COND_VALUE1 */
	public List l_sub1COND_VALUE1 = null;

	/** 第 6 List変数： l_sub1COND_VALUE2 */
	public List l_sub1COND_VALUE2 = null;

	/** 第 7 List変数： l_sub1DISPLAY_FLG */
	public List l_sub1DISPLAY_FLG = null;

	/** 第 8 List変数： l_sub1SORT_TYPE */
	public List l_sub1SORT_TYPE = null;

	/** 第 9 List変数： l_sub1SORT_TYPE_name */
	public List l_sub1SORT_TYPE_name = null;

	/** 第 10 List変数： l_sub1SORT_TYPE_val */
	public List l_sub1SORT_TYPE_val = null;

	/** 第 11 List変数： l_sub1SORTKEY_PRI */
	public List l_sub1SORTKEY_PRI = null;

	/** 第 12 List変数： l_sub1TABLE_NAME_COMMENT */
	public List l_sub1TABLE_NAME_COMMENT = null;

	/** 第 13 List変数： l_sub1TABLE_NAME */
	public List l_sub1TABLE_NAME = null;

	/** 第 14 List変数： l_sub1COLUMN_NAME */
	public List l_sub1COLUMN_NAME = null;

	/** 第 15 List変数： l_sub1COLUMN_NAME_COMMENT */
	public List l_sub1COLUMN_NAME_COMMENT = null;

	/** 第 16 List変数： l_EDIT_NAME */
	public List l_EDIT_NAME = null;

	/** 第 17 List変数： l_h_TABLE_TO */
	public List l_h_TABLE_TO = null;

	/** 第 18 List変数： l_h_TABLE_COMMENT_TO */
	public List l_h_TABLE_COMMENT_TO = null;

	/** 第 19 List変数： l_h_TABLE_ALIAS_TO */
	public List l_h_TABLE_ALIAS_TO = null;

	/** 第 20 List変数： l_h_LEFT_TABLE_NAME */
	public List l_h_LEFT_TABLE_NAME = null;

	/** 第 21 List変数： l_h_LEFT_TABLE_ALIAS */
	public List l_h_LEFT_TABLE_ALIAS = null;

	/** 第 22 List変数： l_h_LEFT_COLUMN */
	public List l_h_LEFT_COLUMN = null;

	/** 第 23 List変数： l_h_RIGHT_TABLE_NAME */
	public List l_h_RIGHT_TABLE_NAME = null;

	/** 第 24 List変数： l_h_RIGHT_TABLE_ALIAS */
	public List l_h_RIGHT_TABLE_ALIAS = null;

	/** 第 25 List変数： l_h_RIGHT_COLUMN */
	public List l_h_RIGHT_COLUMN = null;

	/** 第 26 List変数： l_h_CONDITION */
	public List l_h_CONDITION = null;

	/** 第 27 List変数： l_h_COLUMN */
	public List l_h_COLUMN = null;

	/** 第 28 List変数： l_h_TABLE_ALIAS */
	public List l_h_TABLE_ALIAS = null;

	/** 第 29 List変数： l_h_TABLE_NAME */
	public List l_h_TABLE_NAME = null;

	/** 第 30 List変数： l_EDIT_TYP */
	public List l_EDIT_TYP = null;

	/** 第 31 List変数： l_QUERY_NAME */
	public List l_QUERY_NAME = null;

	/** 第 32 List変数： l_QUERY_GROUP */
	public List l_QUERY_GROUP = null;

	/** 第 33 List変数： l_QUERY_MEMO */
	public List l_QUERY_MEMO = null;

	/** 第 34 List変数： l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** 第 35 List変数： l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** 第 36 List変数： l_UPDATED_DATE */
	public List l_UPDATED_DATE = null;

	/** 第 37 List変数： l_UPDATED_BY */
	public List l_UPDATED_BY = null;

	/** 第 38 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 39 List変数： l_QUERY_CD */
	public List l_QUERY_CD = null;

	/** 第 40 List変数： l_SQL_INFO */
	public List l_SQL_INFO = null;

	/** 第 41 List変数： l_CREATED_PRG_NM */
	public List l_CREATED_PRG_NM = null;

	/** 第 42 List変数： l_UPDATED_PRG_NM */
	public List l_UPDATED_PRG_NM = null;

	/** 第 43 List変数： l_w_USER_CD */
	public List l_w_USER_CD = null;

	/** 第 44 List変数： l_w_QUERY_NAME */
	public List l_w_QUERY_NAME = null;

	/** 第 45 List変数： l_w_QUERY_GROUP */
	public List l_w_QUERY_GROUP = null;

	/** 第 46 List変数： l_w_MEMO */
	public List l_w_MEMO = null;

	/** 第 47 List変数： l_w_CREATED_BY */
	public List l_w_CREATED_BY = null;

	/** 第 48 List変数： l_w_CREATED_DATE_FROM */
	public List l_w_CREATED_DATE_FROM = null;

	/** 第 49 List変数： l_w_CREATED_DATE_TO */
	public List l_w_CREATED_DATE_TO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getsub1COLUMN_TYPE() { return m_sub1COLUMN_TYPE; }
	public String getsub1COND_TYPE() { return m_sub1COND_TYPE; }
	public String getsub1COND_TYPE_name() { return m_sub1COND_TYPE_name; }
	public String getsub1COND_TYPE_val() { return m_sub1COND_TYPE_val; }
	public String getsub1COND_VALUE1() { return m_sub1COND_VALUE1; }
	public String getsub1COND_VALUE2() { return m_sub1COND_VALUE2; }
	public String getsub1DISPLAY_FLG() { return m_sub1DISPLAY_FLG; }
	public String getsub1SORT_TYPE() { return m_sub1SORT_TYPE; }
	public String getsub1SORT_TYPE_name() { return m_sub1SORT_TYPE_name; }
	public String getsub1SORT_TYPE_val() { return m_sub1SORT_TYPE_val; }
	public String getsub1SORTKEY_PRI() { return m_sub1SORTKEY_PRI; }
	public String getsub1TABLE_NAME_COMMENT() { return m_sub1TABLE_NAME_COMMENT; }
	public String getsub1TABLE_NAME() { return m_sub1TABLE_NAME; }
	public String getsub1COLUMN_NAME() { return m_sub1COLUMN_NAME; }
	public String getsub1COLUMN_NAME_COMMENT() { return m_sub1COLUMN_NAME_COMMENT; }
	public String getEDIT_NAME() { return m_EDIT_NAME; }
	public String geth_TABLE_TO() { return m_h_TABLE_TO; }
	public String geth_TABLE_COMMENT_TO() { return m_h_TABLE_COMMENT_TO; }
	public String geth_TABLE_ALIAS_TO() { return m_h_TABLE_ALIAS_TO; }
	public String geth_LEFT_TABLE_NAME() { return m_h_LEFT_TABLE_NAME; }
	public String geth_LEFT_TABLE_ALIAS() { return m_h_LEFT_TABLE_ALIAS; }
	public String geth_LEFT_COLUMN() { return m_h_LEFT_COLUMN; }
	public String geth_RIGHT_TABLE_NAME() { return m_h_RIGHT_TABLE_NAME; }
	public String geth_RIGHT_TABLE_ALIAS() { return m_h_RIGHT_TABLE_ALIAS; }
	public String geth_RIGHT_COLUMN() { return m_h_RIGHT_COLUMN; }
	public String geth_CONDITION() { return m_h_CONDITION; }
	public String geth_COLUMN() { return m_h_COLUMN; }
	public String geth_TABLE_ALIAS() { return m_h_TABLE_ALIAS; }
	public String geth_TABLE_NAME() { return m_h_TABLE_NAME; }
	public String getEDIT_TYP() { return m_EDIT_TYP; }
	public String getQUERY_NAME() { return m_QUERY_NAME; }
	public String getQUERY_GROUP() { return m_QUERY_GROUP; }
	public String getQUERY_MEMO() { return m_QUERY_MEMO; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getUPDATED_BY() { return m_UPDATED_BY; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getQUERY_CD() { return m_QUERY_CD; }
	public String getSQL_INFO() { return m_SQL_INFO; }
	public String getCREATED_PRG_NM() { return m_CREATED_PRG_NM; }
	public String getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String getw_USER_CD() { return m_w_USER_CD; }
	public String getw_QUERY_NAME() { return m_w_QUERY_NAME; }
	public String getw_QUERY_GROUP() { return m_w_QUERY_GROUP; }
	public String getw_MEMO() { return m_w_MEMO; }
	public String getw_CREATED_BY() { return m_w_CREATED_BY; }
	public String getw_CREATED_DATE_FROM() { return m_w_CREATED_DATE_FROM; }
	public String getw_CREATED_DATE_TO() { return m_w_CREATED_DATE_TO; }

	public List getList_sub1COLUMN_TYPE() { return l_sub1COLUMN_TYPE; }
	public List getList_sub1COND_TYPE() { return l_sub1COND_TYPE; }
	public List getList_sub1COND_TYPE_name() { return l_sub1COND_TYPE_name; }
	public List getList_sub1COND_TYPE_val() { return l_sub1COND_TYPE_val; }
	public List getList_sub1COND_VALUE1() { return l_sub1COND_VALUE1; }
	public List getList_sub1COND_VALUE2() { return l_sub1COND_VALUE2; }
	public List getList_sub1DISPLAY_FLG() { return l_sub1DISPLAY_FLG; }
	public List getList_sub1SORT_TYPE() { return l_sub1SORT_TYPE; }
	public List getList_sub1SORT_TYPE_name() { return l_sub1SORT_TYPE_name; }
	public List getList_sub1SORT_TYPE_val() { return l_sub1SORT_TYPE_val; }
	public List getList_sub1SORTKEY_PRI() { return l_sub1SORTKEY_PRI; }
	public List getList_sub1TABLE_NAME_COMMENT() { return l_sub1TABLE_NAME_COMMENT; }
	public List getList_sub1TABLE_NAME() { return l_sub1TABLE_NAME; }
	public List getList_sub1COLUMN_NAME() { return l_sub1COLUMN_NAME; }
	public List getList_sub1COLUMN_NAME_COMMENT() { return l_sub1COLUMN_NAME_COMMENT; }
	public List getList_EDIT_NAME() { return l_EDIT_NAME; }
	public List getList_h_TABLE_TO() { return l_h_TABLE_TO; }
	public List getList_h_TABLE_COMMENT_TO() { return l_h_TABLE_COMMENT_TO; }
	public List getList_h_TABLE_ALIAS_TO() { return l_h_TABLE_ALIAS_TO; }
	public List getList_h_LEFT_TABLE_NAME() { return l_h_LEFT_TABLE_NAME; }
	public List getList_h_LEFT_TABLE_ALIAS() { return l_h_LEFT_TABLE_ALIAS; }
	public List getList_h_LEFT_COLUMN() { return l_h_LEFT_COLUMN; }
	public List getList_h_RIGHT_TABLE_NAME() { return l_h_RIGHT_TABLE_NAME; }
	public List getList_h_RIGHT_TABLE_ALIAS() { return l_h_RIGHT_TABLE_ALIAS; }
	public List getList_h_RIGHT_COLUMN() { return l_h_RIGHT_COLUMN; }
	public List getList_h_CONDITION() { return l_h_CONDITION; }
	public List getList_h_COLUMN() { return l_h_COLUMN; }
	public List getList_h_TABLE_ALIAS() { return l_h_TABLE_ALIAS; }
	public List getList_h_TABLE_NAME() { return l_h_TABLE_NAME; }
	public List getList_EDIT_TYP() { return l_EDIT_TYP; }
	public List getList_QUERY_NAME() { return l_QUERY_NAME; }
	public List getList_QUERY_GROUP() { return l_QUERY_GROUP; }
	public List getList_QUERY_MEMO() { return l_QUERY_MEMO; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_UPDATED_DATE() { return l_UPDATED_DATE; }
	public List getList_UPDATED_BY() { return l_UPDATED_BY; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_QUERY_CD() { return l_QUERY_CD; }
	public List getList_SQL_INFO() { return l_SQL_INFO; }
	public List getList_CREATED_PRG_NM() { return l_CREATED_PRG_NM; }
	public List getList_UPDATED_PRG_NM() { return l_UPDATED_PRG_NM; }
	public List getList_w_USER_CD() { return l_w_USER_CD; }
	public List getList_w_QUERY_NAME() { return l_w_QUERY_NAME; }
	public List getList_w_QUERY_GROUP() { return l_w_QUERY_GROUP; }
	public List getList_w_MEMO() { return l_w_MEMO; }
	public List getList_w_CREATED_BY() { return l_w_CREATED_BY; }
	public List getList_w_CREATED_DATE_FROM() { return l_w_CREATED_DATE_FROM; }
	public List getList_w_CREATED_DATE_TO() { return l_w_CREATED_DATE_TO; }

	public void setsub1COLUMN_TYPE(String val) { m_sub1COLUMN_TYPE = val; }
	public void setsub1COND_TYPE(String val) { m_sub1COND_TYPE = val; }
	public void setsub1COND_TYPE_name(String val) { m_sub1COND_TYPE_name = val; }
	public void setsub1COND_TYPE_val(String val) { m_sub1COND_TYPE_val = val; }
	public void setsub1COND_VALUE1(String val) { m_sub1COND_VALUE1 = val; }
	public void setsub1COND_VALUE2(String val) { m_sub1COND_VALUE2 = val; }
	public void setsub1DISPLAY_FLG(String val) { m_sub1DISPLAY_FLG = val; }
	public void setsub1SORT_TYPE(String val) { m_sub1SORT_TYPE = val; }
	public void setsub1SORT_TYPE_name(String val) { m_sub1SORT_TYPE_name = val; }
	public void setsub1SORT_TYPE_val(String val) { m_sub1SORT_TYPE_val = val; }
	public void setsub1SORTKEY_PRI(String val) { m_sub1SORTKEY_PRI = val; }
	public void setsub1TABLE_NAME_COMMENT(String val) { m_sub1TABLE_NAME_COMMENT = val; }
	public void setsub1TABLE_NAME(String val) { m_sub1TABLE_NAME = val; }
	public void setsub1COLUMN_NAME(String val) { m_sub1COLUMN_NAME = val; }
	public void setsub1COLUMN_NAME_COMMENT(String val) { m_sub1COLUMN_NAME_COMMENT = val; }
	public void setEDIT_NAME(String val) { m_EDIT_NAME = val; }
	public void seth_TABLE_TO(String val) { m_h_TABLE_TO = val; }
	public void seth_TABLE_COMMENT_TO(String val) { m_h_TABLE_COMMENT_TO = val; }
	public void seth_TABLE_ALIAS_TO(String val) { m_h_TABLE_ALIAS_TO = val; }
	public void seth_LEFT_TABLE_NAME(String val) { m_h_LEFT_TABLE_NAME = val; }
	public void seth_LEFT_TABLE_ALIAS(String val) { m_h_LEFT_TABLE_ALIAS = val; }
	public void seth_LEFT_COLUMN(String val) { m_h_LEFT_COLUMN = val; }
	public void seth_RIGHT_TABLE_NAME(String val) { m_h_RIGHT_TABLE_NAME = val; }
	public void seth_RIGHT_TABLE_ALIAS(String val) { m_h_RIGHT_TABLE_ALIAS = val; }
	public void seth_RIGHT_COLUMN(String val) { m_h_RIGHT_COLUMN = val; }
	public void seth_CONDITION(String val) { m_h_CONDITION = val; }
	public void seth_COLUMN(String val) { m_h_COLUMN = val; }
	public void seth_TABLE_ALIAS(String val) { m_h_TABLE_ALIAS = val; }
	public void seth_TABLE_NAME(String val) { m_h_TABLE_NAME = val; }
	public void setEDIT_TYP(String val) { m_EDIT_TYP = val; }
	public void setQUERY_NAME(String val) { m_QUERY_NAME = val; }
	public void setQUERY_GROUP(String val) { m_QUERY_GROUP = val; }
	public void setQUERY_MEMO(String val) { m_QUERY_MEMO = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setUPDATED_DATE(String val) { m_UPDATED_DATE = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setQUERY_CD(String val) { m_QUERY_CD = val; }
	public void setSQL_INFO(String val) { m_SQL_INFO = val; }
	public void setCREATED_PRG_NM(String val) { m_CREATED_PRG_NM = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setw_USER_CD(String val) { m_w_USER_CD = val; }
	public void setw_QUERY_NAME(String val) { m_w_QUERY_NAME = val; }
	public void setw_QUERY_GROUP(String val) { m_w_QUERY_GROUP = val; }
	public void setw_MEMO(String val) { m_w_MEMO = val; }
	public void setw_CREATED_BY(String val) { m_w_CREATED_BY = val; }
	public void setw_CREATED_DATE_FROM(String val) { m_w_CREATED_DATE_FROM = val; }
	public void setw_CREATED_DATE_TO(String val) { m_w_CREATED_DATE_TO = val; }


	public void setList_sub1COLUMN_TYPE(List list) { l_sub1COLUMN_TYPE = list; }
	public void setList_sub1COND_TYPE(List list) { l_sub1COND_TYPE = list; }
	public void setList_sub1COND_TYPE_name(List list) { l_sub1COND_TYPE_name = list; }
	public void setList_sub1COND_TYPE_val(List list) { l_sub1COND_TYPE_val = list; }
	public void setList_sub1COND_VALUE1(List list) { l_sub1COND_VALUE1 = list; }
	public void setList_sub1COND_VALUE2(List list) { l_sub1COND_VALUE2 = list; }
	public void setList_sub1DISPLAY_FLG(List list) { l_sub1DISPLAY_FLG = list; }
	public void setList_sub1SORT_TYPE(List list) { l_sub1SORT_TYPE = list; }
	public void setList_sub1SORT_TYPE_name(List list) { l_sub1SORT_TYPE_name = list; }
	public void setList_sub1SORT_TYPE_val(List list) { l_sub1SORT_TYPE_val = list; }
	public void setList_sub1SORTKEY_PRI(List list) { l_sub1SORTKEY_PRI = list; }
	public void setList_sub1TABLE_NAME_COMMENT(List list) { l_sub1TABLE_NAME_COMMENT = list; }
	public void setList_sub1TABLE_NAME(List list) { l_sub1TABLE_NAME = list; }
	public void setList_sub1COLUMN_NAME(List list) { l_sub1COLUMN_NAME = list; }
	public void setList_sub1COLUMN_NAME_COMMENT(List list) { l_sub1COLUMN_NAME_COMMENT = list; }
	public void setList_EDIT_NAME(List list) { l_EDIT_NAME = list; }
	public void setList_h_TABLE_TO(List list) { l_h_TABLE_TO = list; }
	public void setList_h_TABLE_COMMENT_TO(List list) { l_h_TABLE_COMMENT_TO = list; }
	public void setList_h_TABLE_ALIAS_TO(List list) { l_h_TABLE_ALIAS_TO = list; }
	public void setList_h_LEFT_TABLE_NAME(List list) { l_h_LEFT_TABLE_NAME = list; }
	public void setList_h_LEFT_TABLE_ALIAS(List list) { l_h_LEFT_TABLE_ALIAS = list; }
	public void setList_h_LEFT_COLUMN(List list) { l_h_LEFT_COLUMN = list; }
	public void setList_h_RIGHT_TABLE_NAME(List list) { l_h_RIGHT_TABLE_NAME = list; }
	public void setList_h_RIGHT_TABLE_ALIAS(List list) { l_h_RIGHT_TABLE_ALIAS = list; }
	public void setList_h_RIGHT_COLUMN(List list) { l_h_RIGHT_COLUMN = list; }
	public void setList_h_CONDITION(List list) { l_h_CONDITION = list; }
	public void setList_h_COLUMN(List list) { l_h_COLUMN = list; }
	public void setList_h_TABLE_ALIAS(List list) { l_h_TABLE_ALIAS = list; }
	public void setList_h_TABLE_NAME(List list) { l_h_TABLE_NAME = list; }
	public void setList_EDIT_TYP(List list) { l_EDIT_TYP = list; }
	public void setList_QUERY_NAME(List list) { l_QUERY_NAME = list; }
	public void setList_QUERY_GROUP(List list) { l_QUERY_GROUP = list; }
	public void setList_QUERY_MEMO(List list) { l_QUERY_MEMO = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_UPDATED_DATE(List list) { l_UPDATED_DATE = list; }
	public void setList_UPDATED_BY(List list) { l_UPDATED_BY = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_QUERY_CD(List list) { l_QUERY_CD = list; }
	public void setList_SQL_INFO(List list) { l_SQL_INFO = list; }
	public void setList_CREATED_PRG_NM(List list) { l_CREATED_PRG_NM = list; }
	public void setList_UPDATED_PRG_NM(List list) { l_UPDATED_PRG_NM = list; }
	public void setList_w_USER_CD(List list) { l_w_USER_CD = list; }
	public void setList_w_QUERY_NAME(List list) { l_w_QUERY_NAME = list; }
	public void setList_w_QUERY_GROUP(List list) { l_w_QUERY_GROUP = list; }
	public void setList_w_MEMO(List list) { l_w_MEMO = list; }
	public void setList_w_CREATED_BY(List list) { l_w_CREATED_BY = list; }
	public void setList_w_CREATED_DATE_FROM(List list) { l_w_CREATED_DATE_FROM = list; }
	public void setList_w_CREATED_DATE_TO(List list) { l_w_CREATED_DATE_TO = list; }

	public int setL2L_sub1COLUMN_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COLUMN_TYPE == null) {
			l_sub1COLUMN_TYPE = new ArrayList();
		} else {
			l_sub1COLUMN_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COLUMN_TYPE.add(((AZ0040010Struct) list.get(i)).getsub1COLUMN_TYPE());
		}
		return size;
	}
	public int setL2L_sub1COND_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COND_TYPE == null) {
			l_sub1COND_TYPE = new ArrayList();
		} else {
			l_sub1COND_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COND_TYPE.add(((AZ0040010Struct) list.get(i)).getsub1COND_TYPE());
		}
		return size;
	}
	public int setL2L_sub1COND_TYPE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COND_TYPE_name == null) {
			l_sub1COND_TYPE_name = new ArrayList();
		} else {
			l_sub1COND_TYPE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COND_TYPE_name.add(((AZ0040010Struct) list.get(i)).getsub1COND_TYPE_name());
		}
		return size;
	}
	public int setL2L_sub1COND_TYPE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COND_TYPE_val == null) {
			l_sub1COND_TYPE_val = new ArrayList();
		} else {
			l_sub1COND_TYPE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COND_TYPE_val.add(((AZ0040010Struct) list.get(i)).getsub1COND_TYPE_val());
		}
		return size;
	}
	public int setL2L_sub1COND_VALUE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COND_VALUE1 == null) {
			l_sub1COND_VALUE1 = new ArrayList();
		} else {
			l_sub1COND_VALUE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COND_VALUE1.add(((AZ0040010Struct) list.get(i)).getsub1COND_VALUE1());
		}
		return size;
	}
	public int setL2L_sub1COND_VALUE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COND_VALUE2 == null) {
			l_sub1COND_VALUE2 = new ArrayList();
		} else {
			l_sub1COND_VALUE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COND_VALUE2.add(((AZ0040010Struct) list.get(i)).getsub1COND_VALUE2());
		}
		return size;
	}
	public int setL2L_sub1DISPLAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1DISPLAY_FLG == null) {
			l_sub1DISPLAY_FLG = new ArrayList();
		} else {
			l_sub1DISPLAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1DISPLAY_FLG.add(((AZ0040010Struct) list.get(i)).getsub1DISPLAY_FLG());
		}
		return size;
	}
	public int setL2L_sub1SORT_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1SORT_TYPE == null) {
			l_sub1SORT_TYPE = new ArrayList();
		} else {
			l_sub1SORT_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1SORT_TYPE.add(((AZ0040010Struct) list.get(i)).getsub1SORT_TYPE());
		}
		return size;
	}
	public int setL2L_sub1SORT_TYPE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1SORT_TYPE_name == null) {
			l_sub1SORT_TYPE_name = new ArrayList();
		} else {
			l_sub1SORT_TYPE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1SORT_TYPE_name.add(((AZ0040010Struct) list.get(i)).getsub1SORT_TYPE_name());
		}
		return size;
	}
	public int setL2L_sub1SORT_TYPE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1SORT_TYPE_val == null) {
			l_sub1SORT_TYPE_val = new ArrayList();
		} else {
			l_sub1SORT_TYPE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1SORT_TYPE_val.add(((AZ0040010Struct) list.get(i)).getsub1SORT_TYPE_val());
		}
		return size;
	}
	public int setL2L_sub1SORTKEY_PRI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1SORTKEY_PRI == null) {
			l_sub1SORTKEY_PRI = new ArrayList();
		} else {
			l_sub1SORTKEY_PRI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1SORTKEY_PRI.add(((AZ0040010Struct) list.get(i)).getsub1SORTKEY_PRI());
		}
		return size;
	}
	public int setL2L_sub1TABLE_NAME_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1TABLE_NAME_COMMENT == null) {
			l_sub1TABLE_NAME_COMMENT = new ArrayList();
		} else {
			l_sub1TABLE_NAME_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1TABLE_NAME_COMMENT.add(((AZ0040010Struct) list.get(i)).getsub1TABLE_NAME_COMMENT());
		}
		return size;
	}
	public int setL2L_sub1TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1TABLE_NAME == null) {
			l_sub1TABLE_NAME = new ArrayList();
		} else {
			l_sub1TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1TABLE_NAME.add(((AZ0040010Struct) list.get(i)).getsub1TABLE_NAME());
		}
		return size;
	}
	public int setL2L_sub1COLUMN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COLUMN_NAME == null) {
			l_sub1COLUMN_NAME = new ArrayList();
		} else {
			l_sub1COLUMN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COLUMN_NAME.add(((AZ0040010Struct) list.get(i)).getsub1COLUMN_NAME());
		}
		return size;
	}
	public int setL2L_sub1COLUMN_NAME_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1COLUMN_NAME_COMMENT == null) {
			l_sub1COLUMN_NAME_COMMENT = new ArrayList();
		} else {
			l_sub1COLUMN_NAME_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1COLUMN_NAME_COMMENT.add(((AZ0040010Struct) list.get(i)).getsub1COLUMN_NAME_COMMENT());
		}
		return size;
	}
	public int setL2L_EDIT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDIT_NAME == null) {
			l_EDIT_NAME = new ArrayList();
		} else {
			l_EDIT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDIT_NAME.add(((AZ0040010Struct) list.get(i)).getEDIT_NAME());
		}
		return size;
	}
	public int setL2L_h_TABLE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_TO == null) {
			l_h_TABLE_TO = new ArrayList();
		} else {
			l_h_TABLE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_TO.add(((AZ0040010Struct) list.get(i)).geth_TABLE_TO());
		}
		return size;
	}
	public int setL2L_h_TABLE_COMMENT_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_COMMENT_TO == null) {
			l_h_TABLE_COMMENT_TO = new ArrayList();
		} else {
			l_h_TABLE_COMMENT_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_COMMENT_TO.add(((AZ0040010Struct) list.get(i)).geth_TABLE_COMMENT_TO());
		}
		return size;
	}
	public int setL2L_h_TABLE_ALIAS_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_ALIAS_TO == null) {
			l_h_TABLE_ALIAS_TO = new ArrayList();
		} else {
			l_h_TABLE_ALIAS_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_ALIAS_TO.add(((AZ0040010Struct) list.get(i)).geth_TABLE_ALIAS_TO());
		}
		return size;
	}
	public int setL2L_h_LEFT_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_TABLE_NAME == null) {
			l_h_LEFT_TABLE_NAME = new ArrayList();
		} else {
			l_h_LEFT_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_TABLE_NAME.add(((AZ0040010Struct) list.get(i)).geth_LEFT_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_h_LEFT_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_TABLE_ALIAS == null) {
			l_h_LEFT_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_LEFT_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_TABLE_ALIAS.add(((AZ0040010Struct) list.get(i)).geth_LEFT_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_LEFT_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_COLUMN == null) {
			l_h_LEFT_COLUMN = new ArrayList();
		} else {
			l_h_LEFT_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_COLUMN.add(((AZ0040010Struct) list.get(i)).geth_LEFT_COLUMN());
		}
		return size;
	}
	public int setL2L_h_RIGHT_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_TABLE_NAME == null) {
			l_h_RIGHT_TABLE_NAME = new ArrayList();
		} else {
			l_h_RIGHT_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_TABLE_NAME.add(((AZ0040010Struct) list.get(i)).geth_RIGHT_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_h_RIGHT_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_TABLE_ALIAS == null) {
			l_h_RIGHT_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_RIGHT_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_TABLE_ALIAS.add(((AZ0040010Struct) list.get(i)).geth_RIGHT_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_RIGHT_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_COLUMN == null) {
			l_h_RIGHT_COLUMN = new ArrayList();
		} else {
			l_h_RIGHT_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_COLUMN.add(((AZ0040010Struct) list.get(i)).geth_RIGHT_COLUMN());
		}
		return size;
	}
	public int setL2L_h_CONDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CONDITION == null) {
			l_h_CONDITION = new ArrayList();
		} else {
			l_h_CONDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CONDITION.add(((AZ0040010Struct) list.get(i)).geth_CONDITION());
		}
		return size;
	}
	public int setL2L_h_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COLUMN == null) {
			l_h_COLUMN = new ArrayList();
		} else {
			l_h_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COLUMN.add(((AZ0040010Struct) list.get(i)).geth_COLUMN());
		}
		return size;
	}
	public int setL2L_h_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_ALIAS == null) {
			l_h_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_ALIAS.add(((AZ0040010Struct) list.get(i)).geth_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_NAME == null) {
			l_h_TABLE_NAME = new ArrayList();
		} else {
			l_h_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_NAME.add(((AZ0040010Struct) list.get(i)).geth_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_EDIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDIT_TYP == null) {
			l_EDIT_TYP = new ArrayList();
		} else {
			l_EDIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDIT_TYP.add(((AZ0040010Struct) list.get(i)).getEDIT_TYP());
		}
		return size;
	}
	public int setL2L_QUERY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_NAME == null) {
			l_QUERY_NAME = new ArrayList();
		} else {
			l_QUERY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_NAME.add(((AZ0040010Struct) list.get(i)).getQUERY_NAME());
		}
		return size;
	}
	public int setL2L_QUERY_GROUP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_GROUP == null) {
			l_QUERY_GROUP = new ArrayList();
		} else {
			l_QUERY_GROUP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_GROUP.add(((AZ0040010Struct) list.get(i)).getQUERY_GROUP());
		}
		return size;
	}
	public int setL2L_QUERY_MEMO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_MEMO == null) {
			l_QUERY_MEMO = new ArrayList();
		} else {
			l_QUERY_MEMO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_MEMO.add(((AZ0040010Struct) list.get(i)).getQUERY_MEMO());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((AZ0040010Struct) list.get(i)).getCREATED_DATE());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((AZ0040010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_DATE == null) {
			l_UPDATED_DATE = new ArrayList();
		} else {
			l_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_DATE.add(((AZ0040010Struct) list.get(i)).getUPDATED_DATE());
		}
		return size;
	}
	public int setL2L_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_BY == null) {
			l_UPDATED_BY = new ArrayList();
		} else {
			l_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_BY.add(((AZ0040010Struct) list.get(i)).getUPDATED_BY());
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
			l_MODIFY_COUNT.add(((AZ0040010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_QUERY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_CD == null) {
			l_QUERY_CD = new ArrayList();
		} else {
			l_QUERY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_CD.add(((AZ0040010Struct) list.get(i)).getQUERY_CD());
		}
		return size;
	}
	public int setL2L_SQL_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SQL_INFO == null) {
			l_SQL_INFO = new ArrayList();
		} else {
			l_SQL_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SQL_INFO.add(((AZ0040010Struct) list.get(i)).getSQL_INFO());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM == null) {
			l_CREATED_PRG_NM = new ArrayList();
		} else {
			l_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM.add(((AZ0040010Struct) list.get(i)).getCREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_PRG_NM == null) {
			l_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_PRG_NM.add(((AZ0040010Struct) list.get(i)).getUPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_w_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_USER_CD == null) {
			l_w_USER_CD = new ArrayList();
		} else {
			l_w_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_USER_CD.add(((AZ0040010Struct) list.get(i)).getw_USER_CD());
		}
		return size;
	}
	public int setL2L_w_QUERY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_QUERY_NAME == null) {
			l_w_QUERY_NAME = new ArrayList();
		} else {
			l_w_QUERY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_QUERY_NAME.add(((AZ0040010Struct) list.get(i)).getw_QUERY_NAME());
		}
		return size;
	}
	public int setL2L_w_QUERY_GROUP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_QUERY_GROUP == null) {
			l_w_QUERY_GROUP = new ArrayList();
		} else {
			l_w_QUERY_GROUP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_QUERY_GROUP.add(((AZ0040010Struct) list.get(i)).getw_QUERY_GROUP());
		}
		return size;
	}
	public int setL2L_w_MEMO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MEMO == null) {
			l_w_MEMO = new ArrayList();
		} else {
			l_w_MEMO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MEMO.add(((AZ0040010Struct) list.get(i)).getw_MEMO());
		}
		return size;
	}
	public int setL2L_w_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_BY == null) {
			l_w_CREATED_BY = new ArrayList();
		} else {
			l_w_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_BY.add(((AZ0040010Struct) list.get(i)).getw_CREATED_BY());
		}
		return size;
	}
	public int setL2L_w_CREATED_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_DATE_FROM == null) {
			l_w_CREATED_DATE_FROM = new ArrayList();
		} else {
			l_w_CREATED_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_DATE_FROM.add(((AZ0040010Struct) list.get(i)).getw_CREATED_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_CREATED_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_DATE_TO == null) {
			l_w_CREATED_DATE_TO = new ArrayList();
		} else {
			l_w_CREATED_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_DATE_TO.add(((AZ0040010Struct) list.get(i)).getw_CREATED_DATE_TO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_sub1COLUMN_TYPE = null;
		m_sub1COND_TYPE = null;
		m_sub1COND_TYPE_name = null;
		m_sub1COND_TYPE_val = null;
		m_sub1COND_VALUE1 = null;
		m_sub1COND_VALUE2 = null;
		m_sub1DISPLAY_FLG = null;
		m_sub1SORT_TYPE = null;
		m_sub1SORT_TYPE_name = null;
		m_sub1SORT_TYPE_val = null;
		m_sub1SORTKEY_PRI = null;
		m_sub1TABLE_NAME_COMMENT = null;
		m_sub1TABLE_NAME = null;
		m_sub1COLUMN_NAME = null;
		m_sub1COLUMN_NAME_COMMENT = null;
		m_EDIT_NAME = null;
		m_h_TABLE_TO = null;
		m_h_TABLE_COMMENT_TO = null;
		m_h_TABLE_ALIAS_TO = null;
		m_h_LEFT_TABLE_NAME = null;
		m_h_LEFT_TABLE_ALIAS = null;
		m_h_LEFT_COLUMN = null;
		m_h_RIGHT_TABLE_NAME = null;
		m_h_RIGHT_TABLE_ALIAS = null;
		m_h_RIGHT_COLUMN = null;
		m_h_CONDITION = null;
		m_h_COLUMN = null;
		m_h_TABLE_ALIAS = null;
		m_h_TABLE_NAME = null;
		m_EDIT_TYP = null;
		m_QUERY_NAME = null;
		m_QUERY_GROUP = null;
		m_QUERY_MEMO = null;
		m_CREATED_DATE = null;
		m_CREATED_BY = null;
		m_UPDATED_DATE = null;
		m_UPDATED_BY = null;
		m_MODIFY_COUNT = null;
		m_QUERY_CD = null;
		m_SQL_INFO = null;
		m_CREATED_PRG_NM = null;
		m_UPDATED_PRG_NM = null;
		m_w_USER_CD = null;
		m_w_QUERY_NAME = null;
		m_w_QUERY_GROUP = null;
		m_w_MEMO = null;
		m_w_CREATED_BY = null;
		m_w_CREATED_DATE_FROM = null;
		m_w_CREATED_DATE_TO = null;

		l_sub1COLUMN_TYPE = null;
		l_sub1COND_TYPE = null;
		l_sub1COND_TYPE_name = null;
		l_sub1COND_TYPE_val = null;
		l_sub1COND_VALUE1 = null;
		l_sub1COND_VALUE2 = null;
		l_sub1DISPLAY_FLG = null;
		l_sub1SORT_TYPE = null;
		l_sub1SORT_TYPE_name = null;
		l_sub1SORT_TYPE_val = null;
		l_sub1SORTKEY_PRI = null;
		l_sub1TABLE_NAME_COMMENT = null;
		l_sub1TABLE_NAME = null;
		l_sub1COLUMN_NAME = null;
		l_sub1COLUMN_NAME_COMMENT = null;
		l_EDIT_NAME = null;
		l_h_TABLE_TO = null;
		l_h_TABLE_COMMENT_TO = null;
		l_h_TABLE_ALIAS_TO = null;
		l_h_LEFT_TABLE_NAME = null;
		l_h_LEFT_TABLE_ALIAS = null;
		l_h_LEFT_COLUMN = null;
		l_h_RIGHT_TABLE_NAME = null;
		l_h_RIGHT_TABLE_ALIAS = null;
		l_h_RIGHT_COLUMN = null;
		l_h_CONDITION = null;
		l_h_COLUMN = null;
		l_h_TABLE_ALIAS = null;
		l_h_TABLE_NAME = null;
		l_EDIT_TYP = null;
		l_QUERY_NAME = null;
		l_QUERY_GROUP = null;
		l_QUERY_MEMO = null;
		l_CREATED_DATE = null;
		l_CREATED_BY = null;
		l_UPDATED_DATE = null;
		l_UPDATED_BY = null;
		l_MODIFY_COUNT = null;
		l_QUERY_CD = null;
		l_SQL_INFO = null;
		l_CREATED_PRG_NM = null;
		l_UPDATED_PRG_NM = null;
		l_w_USER_CD = null;
		l_w_QUERY_NAME = null;
		l_w_QUERY_GROUP = null;
		l_w_MEMO = null;
		l_w_CREATED_BY = null;
		l_w_CREATED_DATE_FROM = null;
		l_w_CREATED_DATE_TO = null;

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
	 * medAZ0040010クラスの標準コンストラクタ
	 */
	public AZ0040010Struct()
	{
		//{{user_implement_code_constractor
			//initialize();
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
	public void setStruct(AZ0040010Struct struct)
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
	public void setStructM(AZ0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setsub1COLUMN_TYPE(struct.getsub1COLUMN_TYPE());
			this.setsub1COND_TYPE(struct.getsub1COND_TYPE());
			this.setsub1COND_TYPE_name(struct.getsub1COND_TYPE_name());
			this.setsub1COND_TYPE_val(struct.getsub1COND_TYPE_val());
			this.setsub1COND_VALUE1(struct.getsub1COND_VALUE1());
			this.setsub1COND_VALUE2(struct.getsub1COND_VALUE2());
			this.setsub1DISPLAY_FLG(struct.getsub1DISPLAY_FLG());
			this.setsub1SORT_TYPE(struct.getsub1SORT_TYPE());
			this.setsub1SORT_TYPE_name(struct.getsub1SORT_TYPE_name());
			this.setsub1SORT_TYPE_val(struct.getsub1SORT_TYPE_val());
			this.setsub1SORTKEY_PRI(struct.getsub1SORTKEY_PRI());
			this.setsub1TABLE_NAME_COMMENT(struct.getsub1TABLE_NAME_COMMENT());
			this.setsub1TABLE_NAME(struct.getsub1TABLE_NAME());
			this.setsub1COLUMN_NAME(struct.getsub1COLUMN_NAME());
			this.setsub1COLUMN_NAME_COMMENT(struct.getsub1COLUMN_NAME_COMMENT());
			this.setEDIT_NAME(struct.getEDIT_NAME());
			this.seth_TABLE_TO(struct.geth_TABLE_TO());
			this.seth_TABLE_COMMENT_TO(struct.geth_TABLE_COMMENT_TO());
			this.seth_TABLE_ALIAS_TO(struct.geth_TABLE_ALIAS_TO());
			this.seth_LEFT_TABLE_NAME(struct.geth_LEFT_TABLE_NAME());
			this.seth_LEFT_TABLE_ALIAS(struct.geth_LEFT_TABLE_ALIAS());
			this.seth_LEFT_COLUMN(struct.geth_LEFT_COLUMN());
			this.seth_RIGHT_TABLE_NAME(struct.geth_RIGHT_TABLE_NAME());
			this.seth_RIGHT_TABLE_ALIAS(struct.geth_RIGHT_TABLE_ALIAS());
			this.seth_RIGHT_COLUMN(struct.geth_RIGHT_COLUMN());
			this.seth_CONDITION(struct.geth_CONDITION());
			this.seth_COLUMN(struct.geth_COLUMN());
			this.seth_TABLE_ALIAS(struct.geth_TABLE_ALIAS());
			this.seth_TABLE_NAME(struct.geth_TABLE_NAME());
			this.setEDIT_TYP(struct.getEDIT_TYP());
			this.setQUERY_NAME(struct.getQUERY_NAME());
			this.setQUERY_GROUP(struct.getQUERY_GROUP());
			this.setQUERY_MEMO(struct.getQUERY_MEMO());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setUPDATED_DATE(struct.getUPDATED_DATE());
			this.setUPDATED_BY(struct.getUPDATED_BY());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setQUERY_CD(struct.getQUERY_CD());
			this.setSQL_INFO(struct.getSQL_INFO());
			this.setCREATED_PRG_NM(struct.getCREATED_PRG_NM());
			this.setUPDATED_PRG_NM(struct.getUPDATED_PRG_NM());
			this.setw_USER_CD(struct.getw_USER_CD());
			this.setw_QUERY_NAME(struct.getw_QUERY_NAME());
			this.setw_QUERY_GROUP(struct.getw_QUERY_GROUP());
			this.setw_MEMO(struct.getw_MEMO());
			this.setw_CREATED_BY(struct.getw_CREATED_BY());
			this.setw_CREATED_DATE_FROM(struct.getw_CREATED_DATE_FROM());
			this.setw_CREATED_DATE_TO(struct.getw_CREATED_DATE_TO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AZ0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_sub1COLUMN_TYPE(struct.getList_sub1COLUMN_TYPE());
			this.setList_sub1COND_TYPE(struct.getList_sub1COND_TYPE());
			this.setList_sub1COND_TYPE_name(struct.getList_sub1COND_TYPE_name());
			this.setList_sub1COND_TYPE_val(struct.getList_sub1COND_TYPE_val());
			this.setList_sub1COND_VALUE1(struct.getList_sub1COND_VALUE1());
			this.setList_sub1COND_VALUE2(struct.getList_sub1COND_VALUE2());
			this.setList_sub1DISPLAY_FLG(struct.getList_sub1DISPLAY_FLG());
			this.setList_sub1SORT_TYPE(struct.getList_sub1SORT_TYPE());
			this.setList_sub1SORT_TYPE_name(struct.getList_sub1SORT_TYPE_name());
			this.setList_sub1SORT_TYPE_val(struct.getList_sub1SORT_TYPE_val());
			this.setList_sub1SORTKEY_PRI(struct.getList_sub1SORTKEY_PRI());
			this.setList_sub1TABLE_NAME_COMMENT(struct.getList_sub1TABLE_NAME_COMMENT());
			this.setList_sub1TABLE_NAME(struct.getList_sub1TABLE_NAME());
			this.setList_sub1COLUMN_NAME(struct.getList_sub1COLUMN_NAME());
			this.setList_sub1COLUMN_NAME_COMMENT(struct.getList_sub1COLUMN_NAME_COMMENT());
			this.setList_EDIT_NAME(struct.getList_EDIT_NAME());
			this.setList_h_TABLE_TO(struct.getList_h_TABLE_TO());
			this.setList_h_TABLE_COMMENT_TO(struct.getList_h_TABLE_COMMENT_TO());
			this.setList_h_TABLE_ALIAS_TO(struct.getList_h_TABLE_ALIAS_TO());
			this.setList_h_LEFT_TABLE_NAME(struct.getList_h_LEFT_TABLE_NAME());
			this.setList_h_LEFT_TABLE_ALIAS(struct.getList_h_LEFT_TABLE_ALIAS());
			this.setList_h_LEFT_COLUMN(struct.getList_h_LEFT_COLUMN());
			this.setList_h_RIGHT_TABLE_NAME(struct.getList_h_RIGHT_TABLE_NAME());
			this.setList_h_RIGHT_TABLE_ALIAS(struct.getList_h_RIGHT_TABLE_ALIAS());
			this.setList_h_RIGHT_COLUMN(struct.getList_h_RIGHT_COLUMN());
			this.setList_h_CONDITION(struct.getList_h_CONDITION());
			this.setList_h_COLUMN(struct.getList_h_COLUMN());
			this.setList_h_TABLE_ALIAS(struct.getList_h_TABLE_ALIAS());
			this.setList_h_TABLE_NAME(struct.getList_h_TABLE_NAME());
			this.setList_EDIT_TYP(struct.getList_EDIT_TYP());
			this.setList_QUERY_NAME(struct.getList_QUERY_NAME());
			this.setList_QUERY_GROUP(struct.getList_QUERY_GROUP());
			this.setList_QUERY_MEMO(struct.getList_QUERY_MEMO());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_UPDATED_DATE(struct.getList_UPDATED_DATE());
			this.setList_UPDATED_BY(struct.getList_UPDATED_BY());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_QUERY_CD(struct.getList_QUERY_CD());
			this.setList_SQL_INFO(struct.getList_SQL_INFO());
			this.setList_CREATED_PRG_NM(struct.getList_CREATED_PRG_NM());
			this.setList_UPDATED_PRG_NM(struct.getList_UPDATED_PRG_NM());
			this.setList_w_USER_CD(struct.getList_w_USER_CD());
			this.setList_w_QUERY_NAME(struct.getList_w_QUERY_NAME());
			this.setList_w_QUERY_GROUP(struct.getList_w_QUERY_GROUP());
			this.setList_w_MEMO(struct.getList_w_MEMO());
			this.setList_w_CREATED_BY(struct.getList_w_CREATED_BY());
			this.setList_w_CREATED_DATE_FROM(struct.getList_w_CREATED_DATE_FROM());
			this.setList_w_CREATED_DATE_TO(struct.getList_w_CREATED_DATE_TO());
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
	// 第 1 変数初期値： i_sub1COLUMN_TYPE


	final static String i_sub1COLUMN_TYPE = null;

	// 第 2 変数初期値： i_sub1COND_TYPE


	final static String i_sub1COND_TYPE = null;

	// 第 3 変数初期値： i_sub1COND_TYPE_name


	final static String i_sub1COND_TYPE_name = null;

	// 第 4 変数初期値： i_sub1COND_TYPE_val


	final static String i_sub1COND_TYPE_val = null;

	// 第 5 変数初期値： i_sub1COND_VALUE1


	final static String i_sub1COND_VALUE1 = null;

	// 第 6 変数初期値： i_sub1COND_VALUE2


	final static String i_sub1COND_VALUE2 = null;

	// 第 7 変数初期値： i_sub1DISPLAY_FLG


	final static String i_sub1DISPLAY_FLG = null;

	// 第 8 変数初期値： i_sub1SORT_TYPE


	final static String i_sub1SORT_TYPE = null;

	// 第 9 変数初期値： i_sub1SORT_TYPE_name


	final static String i_sub1SORT_TYPE_name = null;

	// 第 10 変数初期値： i_sub1SORT_TYPE_val


	final static String i_sub1SORT_TYPE_val = null;

	// 第 11 変数初期値： i_sub1SORTKEY_PRI


	final static String i_sub1SORTKEY_PRI = null;

	// 第 12 変数初期値： i_sub1TABLE_NAME_COMMENT


	final static String i_sub1TABLE_NAME_COMMENT = null;

	// 第 13 変数初期値： i_sub1TABLE_NAME


	final static String i_sub1TABLE_NAME = null;

	// 第 14 変数初期値： i_sub1COLUMN_NAME


	final static String i_sub1COLUMN_NAME = null;

	// 第 15 変数初期値： i_sub1COLUMN_NAME_COMMENT


	final static String i_sub1COLUMN_NAME_COMMENT = null;

	// 第 16 変数初期値： i_EDIT_NAME


	final static String i_EDIT_NAME = null;

	// 第 17 変数初期値： i_h_TABLE_TO


	final static String i_h_TABLE_TO = null;

	// 第 18 変数初期値： i_h_TABLE_COMMENT_TO


	final static String i_h_TABLE_COMMENT_TO = null;

	// 第 19 変数初期値： i_h_TABLE_ALIAS_TO


	final static String i_h_TABLE_ALIAS_TO = null;

	// 第 20 変数初期値： i_h_LEFT_TABLE_NAME


	final static String i_h_LEFT_TABLE_NAME = null;

	// 第 21 変数初期値： i_h_LEFT_TABLE_ALIAS


	final static String i_h_LEFT_TABLE_ALIAS = null;

	// 第 22 変数初期値： i_h_LEFT_COLUMN


	final static String i_h_LEFT_COLUMN = null;

	// 第 23 変数初期値： i_h_RIGHT_TABLE_NAME


	final static String i_h_RIGHT_TABLE_NAME = null;

	// 第 24 変数初期値： i_h_RIGHT_TABLE_ALIAS


	final static String i_h_RIGHT_TABLE_ALIAS = null;

	// 第 25 変数初期値： i_h_RIGHT_COLUMN


	final static String i_h_RIGHT_COLUMN = null;

	// 第 26 変数初期値： i_h_CONDITION


	final static String i_h_CONDITION = null;

	// 第 27 変数初期値： i_h_COLUMN


	final static String i_h_COLUMN = null;

	// 第 28 変数初期値： i_h_TABLE_ALIAS


	final static String i_h_TABLE_ALIAS = null;

	// 第 29 変数初期値： i_h_TABLE_NAME


	final static String i_h_TABLE_NAME = null;

	// 第 30 変数初期値： i_EDIT_TYP


	final static String i_EDIT_TYP = null;

	// 第 31 変数初期値： i_QUERY_NAME


	final static String i_QUERY_NAME = null;

	// 第 32 変数初期値： i_QUERY_GROUP


	final static String i_QUERY_GROUP = null;

	// 第 33 変数初期値： i_QUERY_MEMO


	final static String i_QUERY_MEMO = null;

	// 第 34 変数初期値： i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// 第 35 変数初期値： i_CREATED_BY


	final static String i_CREATED_BY = null;

	// 第 36 変数初期値： i_UPDATED_DATE


	final static String i_UPDATED_DATE = null;

	// 第 37 変数初期値： i_UPDATED_BY


	final static String i_UPDATED_BY = null;

	// 第 38 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 39 変数初期値： i_QUERY_CD


	final static String i_QUERY_CD = null;

	// 第 40 変数初期値： i_SQL_INFO


	final static String i_SQL_INFO = null;

	// 第 41 変数初期値： i_CREATED_PRG_NM


	final static String i_CREATED_PRG_NM = null;

	// 第 42 変数初期値： i_UPDATED_PRG_NM


	final static String i_UPDATED_PRG_NM = null;

	// 第 43 変数初期値： i_w_USER_CD


	final static String i_w_USER_CD = null;

	// 第 44 変数初期値： i_w_QUERY_NAME


	final static String i_w_QUERY_NAME = null;

	// 第 45 変数初期値： i_w_QUERY_GROUP


	final static String i_w_QUERY_GROUP = null;

	// 第 46 変数初期値： i_w_MEMO


	final static String i_w_MEMO = null;

	// 第 47 変数初期値： i_w_CREATED_BY


	final static String i_w_CREATED_BY = null;

	// 第 48 変数初期値： i_w_CREATED_DATE_FROM


	final static String i_w_CREATED_DATE_FROM = null;

	// 第 49 変数初期値： i_w_CREATED_DATE_TO


	final static String i_w_CREATED_DATE_TO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_sub1COLUMN_TYPE

	final static String i_sub1COLUMN_TYPE = null;

	// 第 2 変数初期値： i_sub1COND_TYPE

	final static String i_sub1COND_TYPE = null;

	// 第 3 変数初期値： i_sub1COND_TYPE_name

	final static String i_sub1COND_TYPE_name = null;

	// 第 4 変数初期値： i_sub1COND_TYPE_val

	final static String i_sub1COND_TYPE_val = null;

	// 第 5 変数初期値： i_sub1COND_VALUE1

	final static String i_sub1COND_VALUE1 = null;

	// 第 6 変数初期値： i_sub1COND_VALUE2

	final static String i_sub1COND_VALUE2 = null;

	// 第 7 変数初期値： i_sub1DISPLAY_FLG

	final static String i_sub1DISPLAY_FLG = null;

	// 第 8 変数初期値： i_sub1SORT_TYPE

	final static String i_sub1SORT_TYPE = null;

	// 第 9 変数初期値： i_sub1SORT_TYPE_name

	final static String i_sub1SORT_TYPE_name = null;

	// 第 10 変数初期値： i_sub1SORT_TYPE_val

	final static String i_sub1SORT_TYPE_val = null;

	// 第 11 変数初期値： i_sub1SORTKEY_PRI

	final static String i_sub1SORTKEY_PRI = null;

	// 第 12 変数初期値： i_sub1TABLE_NAME_COMMENT

	final static String i_sub1TABLE_NAME_COMMENT = null;

	// 第 13 変数初期値： i_sub1TABLE_NAME

	final static String i_sub1TABLE_NAME = null;

	// 第 14 変数初期値： i_sub1COLUMN_NAME

	final static String i_sub1COLUMN_NAME = null;

	// 第 15 変数初期値： i_sub1COLUMN_NAME_COMMENT

	final static String i_sub1COLUMN_NAME_COMMENT = null;

	// 第 16 変数初期値： i_EDIT_NAME

	final static String i_EDIT_NAME = null;

	// 第 17 変数初期値： i_QUERY_CD

	final static String i_QUERY_CD = null;

	// 第 18 変数初期値： i_SQL_INFO

	final static String i_SQL_INFO = null;

	// 第 19 変数初期値： i_CREATED_PRG_NM

	final static String i_CREATED_PRG_NM = null;

	// 第 20 変数初期値： i_UPDATED_PRG_NM

	final static String i_UPDATED_PRG_NM = null;

	// 第 21 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 22 変数初期値： i_h_TABLE_TO

	final static String i_h_TABLE_TO = null;

	// 第 23 変数初期値： i_h_TABLE_COMMENT_TO

	final static String i_h_TABLE_COMMENT_TO = null;

	// 第 24 変数初期値： i_h_TABLE_ALIAS_TO

	final static String i_h_TABLE_ALIAS_TO = null;

	// 第 25 変数初期値： i_h_LEFT_TABLE_NAME

	final static String i_h_LEFT_TABLE_NAME = null;

	// 第 26 変数初期値： i_h_LEFT_TABLE_ALIAS

	final static String i_h_LEFT_TABLE_ALIAS = null;

	// 第 27 変数初期値： i_h_LEFT_COLUMN

	final static String i_h_LEFT_COLUMN = null;

	// 第 28 変数初期値： i_h_RIGHT_TABLE_NAME

	final static String i_h_RIGHT_TABLE_NAME = null;

	// 第 29 変数初期値： i_h_RIGHT_TABLE_ALIAS

	final static String i_h_RIGHT_TABLE_ALIAS = null;

	// 第 30 変数初期値： i_h_RIGHT_COLUMN

	final static String i_h_RIGHT_COLUMN = null;

	// 第 31 変数初期値： i_h_CONDITION

	final static String i_h_CONDITION = null;

	// 第 32 変数初期値： i_h_COLUMN

	final static String i_h_COLUMN = null;

	// 第 33 変数初期値： i_h_TABLE_ALIAS

	final static String i_h_TABLE_ALIAS = null;

	// 第 34 変数初期値： i_h_TABLE_NAME

	final static String i_h_TABLE_NAME = null;

	// 第 35 変数初期値： i_EDIT_TYP

	final static String i_EDIT_TYP = null;

	// 第 36 変数初期値： i_QUERY_NAME

	final static String i_QUERY_NAME = null;

	// 第 37 変数初期値： i_QUERY_GROUP

	final static String i_QUERY_GROUP = null;

	// 第 38 変数初期値： i_QUERY_MEMO

	final static String i_QUERY_MEMO = null;

	// 第 39 変数初期値： i_CREATED_DATE

	final static String i_CREATED_DATE = null;

	// 第 40 変数初期値： i_CREATED_BY

	final static String i_CREATED_BY = null;

	// 第 41 変数初期値： i_UPDATED_DATE

	final static String i_UPDATED_DATE = null;

	// 第 42 変数初期値： i_UPDATED_BY

	final static String i_UPDATED_BY = null;

	// 第 43 変数初期値： i_w_USER_CD

	final static String i_w_USER_CD = null;

	// 第 44 変数初期値： i_w_QUERY_NAME

	final static String i_w_QUERY_NAME = null;

	// 第 45 変数初期値： i_w_QUERY_GROUP

	final static String i_w_QUERY_GROUP = null;

	// 第 46 変数初期値： i_w_MEMO

	final static String i_w_MEMO = null;

	// 第 47 変数初期値： i_w_CREATED_BY

	final static String i_w_CREATED_BY = null;

	// 第 48 変数初期値： i_w_CREATED_DATE_FROM

	final static String i_w_CREATED_DATE_FROM = null;

	// 第 49 変数初期値： i_w_CREATED_DATE_TO

	final static String i_w_CREATED_DATE_TO = null;


		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
               /**	
                * 直持ち変数のコピー	
                * @param s コピー元	
                */	
               public void copy(AZ0040010Struct s)	
               {	
                clear();
                if(s.m_EDIT_TYP != null) m_EDIT_TYP = new String(s.m_EDIT_TYP);
                if(s.m_QUERY_NAME != null) m_QUERY_NAME = new String(s.m_QUERY_NAME);
                if(s.m_QUERY_GROUP != null) m_QUERY_GROUP = new String(s.m_QUERY_GROUP);
                if(s.m_QUERY_MEMO != null) m_QUERY_MEMO = new String(s.m_QUERY_MEMO);
                if(s.m_CREATED_DATE != null) m_CREATED_DATE = new String(s.m_CREATED_DATE);
                if(s.m_CREATED_BY != null) m_CREATED_BY = new String(s.m_CREATED_BY);
                if(s.m_UPDATED_DATE != null) m_UPDATED_DATE = new String(s.m_UPDATED_DATE);
                if(s.m_UPDATED_BY != null) m_UPDATED_BY = new String(s.m_UPDATED_BY);
                if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
                if(s.m_QUERY_CD != null) m_QUERY_CD = new String(s.m_QUERY_CD);
                if(s.m_SQL_INFO != null) m_SQL_INFO = new String(s.m_SQL_INFO);
                if(s.m_CREATED_PRG_NM != null) m_CREATED_PRG_NM = new String(s.m_CREATED_PRG_NM);
                if(s.m_UPDATED_PRG_NM != null) m_UPDATED_PRG_NM = new String(s.m_UPDATED_PRG_NM);
                if(s.m_w_QUERY_NAME != null) m_w_QUERY_NAME = new String(s.m_w_QUERY_NAME);
                if(s.m_w_QUERY_GROUP != null) m_w_QUERY_GROUP = new String(s.m_w_QUERY_GROUP);
                if(s.m_w_MEMO != null) m_w_MEMO = new String(s.m_w_MEMO);
                if(s.m_w_CREATED_BY != null) m_w_CREATED_BY = new String(s.m_w_CREATED_BY);
                if(s.m_w_CREATED_DATE_FROM != null) m_w_CREATED_DATE_FROM = new String(s.m_w_CREATED_DATE_FROM);
                if(s.m_w_CREATED_DATE_TO != null) m_w_CREATED_DATE_TO = new String(s.m_w_CREATED_DATE_TO);
                if(s.m_sub1COLUMN_TYPE != null) m_sub1COLUMN_TYPE = new String(s.m_sub1COLUMN_TYPE);
                if(s.m_sub1COND_TYPE != null) m_sub1COND_TYPE = new String(s.m_sub1COND_TYPE);
                if(s.m_sub1COND_TYPE_name != null) m_sub1COND_TYPE_name = new String(s.m_sub1COND_TYPE_name);
                if(s.m_sub1COND_TYPE_val != null) m_sub1COND_TYPE_val = new String(s.m_sub1COND_TYPE_val);
                if(s.m_sub1COND_VALUE1 != null) m_sub1COND_VALUE1 = new String(s.m_sub1COND_VALUE1);
                if(s.m_sub1COND_VALUE2 != null) m_sub1COND_VALUE2 = new String(s.m_sub1COND_VALUE2);
                if(s.m_sub1DISPLAY_FLG != null) m_sub1DISPLAY_FLG = new String(s.m_sub1DISPLAY_FLG);
                if(s.m_sub1SORT_TYPE != null) m_sub1SORT_TYPE = new String(s.m_sub1SORT_TYPE);
                if(s.m_sub1SORT_TYPE_name != null) m_sub1SORT_TYPE_name = new String(s.m_sub1SORT_TYPE_name);
                if(s.m_sub1SORT_TYPE_val != null) m_sub1SORT_TYPE_val = new String(s.m_sub1SORT_TYPE_val);
                if(s.m_sub1SORTKEY_PRI != null) m_sub1SORTKEY_PRI = new String(s.m_sub1SORTKEY_PRI);
                if(s.m_sub1TABLE_NAME_COMMENT != null) m_sub1TABLE_NAME_COMMENT = new String(s.m_sub1TABLE_NAME_COMMENT);
                if(s.m_sub1TABLE_NAME != null) m_sub1TABLE_NAME = new String(s.m_sub1TABLE_NAME);
                if(s.m_sub1COLUMN_NAME != null) m_sub1COLUMN_NAME = new String(s.m_sub1COLUMN_NAME);
                if(s.m_sub1COLUMN_NAME_COMMENT != null) m_sub1COLUMN_NAME_COMMENT = new String(s.m_sub1COLUMN_NAME_COMMENT);
                if(s.m_h_TABLE_TO != null) m_h_TABLE_TO = new String(s.m_h_TABLE_TO);
                if(s.m_h_TABLE_COMMENT_TO != null) m_h_TABLE_COMMENT_TO = new String(s.m_h_TABLE_COMMENT_TO);
                if(s.m_h_TABLE_ALIAS_TO != null) m_h_TABLE_ALIAS_TO = new String(s.m_h_TABLE_ALIAS_TO);
                if(s.m_h_LEFT_TABLE_NAME != null) m_h_LEFT_TABLE_NAME = new String(s.m_h_LEFT_TABLE_NAME);
                if(s.m_h_LEFT_TABLE_ALIAS != null) m_h_LEFT_TABLE_ALIAS = new String(s.m_h_LEFT_TABLE_ALIAS);
                if(s.m_h_LEFT_COLUMN != null) m_h_LEFT_COLUMN = new String(s.m_h_LEFT_COLUMN);
                if(s.m_h_RIGHT_TABLE_NAME != null) m_h_RIGHT_TABLE_NAME = new String(s.m_h_RIGHT_TABLE_NAME);
                if(s.m_h_RIGHT_TABLE_ALIAS != null) m_h_RIGHT_TABLE_ALIAS = new String(s.m_h_RIGHT_TABLE_ALIAS);
                if(s.m_h_RIGHT_COLUMN != null) m_h_RIGHT_COLUMN = new String(s.m_h_RIGHT_COLUMN);
                if(s.m_h_CONDITION != null) m_h_CONDITION = new String(s.m_h_CONDITION);
                if(s.m_h_COLUMN != null) m_h_COLUMN = new String(s.m_h_COLUMN);
                if(s.m_h_TABLE_ALIAS != null) m_h_TABLE_ALIAS = new String(s.m_h_TABLE_ALIAS);
                if(s.m_h_TABLE_NAME != null) m_h_TABLE_NAME = new String(s.m_h_TABLE_NAME);
              
              
              
              
              
               }	
              
              
               /**
                * コピーコンストラクタ
                */
                public AZ0040010Struct(AZ0040010Struct struct)
                {
                 copy(struct);
                }
                /**
                 * 初期化
                 * クリア＆規定値設定を行う。
                 */
                public void initialize()
                {
                 clear();
                return;
                }
              
                /**
                 * 設定条件データのStruct構造体への展開
                 * 条件文字列は ' を削除してStructに設定。
                 */
                public void importColumnInfo(AZ0040ColumnInfo in)
                {
                // データ展開
                m_sub1TABLE_NAME_COMMENT  = in.getTable_Name_Comment();
                m_sub1TABLE_NAME 	  = in.getTable_Name_Alias();
                m_sub1COLUMN_NAME 	  = in.getColumn_Name();
                m_sub1COLUMN_NAME_COMMENT = in.getColumn_Name_Comment();
                m_sub1COLUMN_TYPE 	  = String.valueOf(in.getColumn_Type());
                if( in.getCond_Type() == 0 ){
                 m_sub1COND_TYPE   = null;
                } else {
                 m_sub1COND_TYPE   = String.valueOf(in.getCond_Type());
                }
              
                if((in.getCond_Value1() != null && AZ0040Const.C_VARCHAR.equals(in.getColumn_Type_Ora())) ||
                	(in.getCond_Value1() != null && AZ0040Const.C_DATE.equals(in.getColumn_Type_Ora()) && in.getCond_Type() == 1)){
                 m_sub1COND_VALUE1 = AZ0040Common.UnescapeSQL(in.getCond_Value1());
                }else if(in.getCond_Value1() != null && AZ0040Const.C_DATE.equals(in.getColumn_Type_Ora()) && in.getCond_Type() != 1){
                 m_sub1COND_VALUE1 = AZ0040Common.UnescapeSQL_Date(in.getCond_Value1());
                } else {
                 m_sub1COND_VALUE1 	  = in.getCond_Value1();
                }
              
                if(in.getCond_Value2() != null && AZ0040Const.C_VARCHAR.equals(in.getColumn_Type_Ora())){
                 m_sub1COND_VALUE2 = AZ0040Common.UnescapeSQL(in.getCond_Value2());
                }else if(in.getCond_Value2() != null && AZ0040Const.C_DATE.equals(in.getColumn_Type_Ora())){
                 m_sub1COND_VALUE2 = AZ0040Common.UnescapeSQL_Date(in.getCond_Value2());
                } else {
                 m_sub1COND_VALUE2 	  = in.getCond_Value2();
                }
              
                if( in.getDisplay_Flg() == false ){
                 m_sub1DISPLAY_FLG   = null;
                } else {
                 m_sub1DISPLAY_FLG   = String.valueOf(in.getDisplay_Flg());
                }
              
                if( in.getSort_Type() == 0 ){
                 m_sub1SORT_TYPE   = null;
                } else {
                 m_sub1SORT_TYPE   = String.valueOf(in.getSort_Type());
                }
              
                if(in.getSort_No() == 0){
                 m_sub1SORTKEY_PRI   = null;
                } else {
                 m_sub1SORTKEY_PRI   = String.valueOf(in.getSort_No());
                }
              
                return;
                }
              
                /**
                 * Struct構造体からのデータ展開
                 * 条件文字列は 'を付与して設定。
                 */
                public void exportColumnInfo(AZ0040ColumnInfo out)
                {
                // データ展開
                if( m_sub1COND_TYPE == null || "".equals(m_sub1COND_TYPE)){
                 out.setCond_Type(AZ0040Const.C_NONE);
                } else {
                 out.setCond_Type(Integer.parseInt(m_sub1COND_TYPE));
                }
              
                if((m_sub1COND_VALUE1 != null && AZ0040Const.C_VARCHAR.equals(out.getColumn_Type_Ora())) ||
                	(m_sub1COND_VALUE1 != null && AZ0040Const.C_DATE.equals(out.getColumn_Type_Ora()) && out.getCond_Type() == 1)){
                 out.setCond_Value1(AZ0040Common.EscapeSQL(m_sub1COND_VALUE1));
                }else if(m_sub1COND_VALUE1 != null && AZ0040Const.C_DATE.equals(out.getColumn_Type_Ora()) && out.getCond_Type() != 1){
                 out.setCond_Value1(AZ0040Common.EscapeSQL_Date(m_sub1COND_VALUE1));
                } else {
                 out.setCond_Value1(m_sub1COND_VALUE1);
                }
                if(m_sub1COND_VALUE2 != null && AZ0040Const.C_VARCHAR.equals(out.getColumn_Type_Ora())){
                 out.setCond_Value2(AZ0040Common.EscapeSQL(m_sub1COND_VALUE2));
                }else if(m_sub1COND_VALUE2 != null && AZ0040Const.C_DATE.equals(out.getColumn_Type_Ora())){
                 out.setCond_Value2(AZ0040Common.EscapeSQL_Date(m_sub1COND_VALUE2));
                } else {
                 out.setCond_Value2(m_sub1COND_VALUE2);
                }
              
                out.setDisplay_Flg("true".equals(m_sub1DISPLAY_FLG)? true : false);
              
                if( m_sub1SORT_TYPE == null || "".equals(m_sub1SORT_TYPE)){
                 out.setSort_Type(AZ0040Const.C_NONE);
                } else {
                 out.setSort_Type(Integer.parseInt(m_sub1SORT_TYPE));
                }
              
                if( m_sub1SORTKEY_PRI == null || "".equals(m_sub1SORTKEY_PRI)){
                 out.setSort_No(AZ0040Const.C_NONE);
                } else {
                 out.setSort_No(Integer.parseInt(m_sub1SORTKEY_PRI));
                }
              
                return;
                }
              
                /**
                 * Struct構造体からのデータ展開
                 * 条件文字列は 'を付与して設定。
                 */
               public void clearList()
               {
                l_h_TABLE_TO = new ArrayList();
                l_h_TABLE_COMMENT_TO = new ArrayList();
                l_h_TABLE_ALIAS_TO = new ArrayList();
                l_h_LEFT_TABLE_NAME = new ArrayList();
                l_h_LEFT_TABLE_ALIAS = new ArrayList();
                l_h_LEFT_COLUMN = new ArrayList();
                l_h_RIGHT_TABLE_NAME = new ArrayList();
                l_h_RIGHT_TABLE_ALIAS = new ArrayList();
                l_h_RIGHT_COLUMN = new ArrayList();
                l_h_CONDITION = new ArrayList();
                l_h_COLUMN = new ArrayList();
                l_h_TABLE_ALIAS = new ArrayList();
                l_h_TABLE_NAME = new ArrayList();
               }
        //}}user_implement_code

	//////////////////////////////

}
