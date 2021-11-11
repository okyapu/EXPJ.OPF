/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

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

public class AA0080030Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_CAL_NO_TO */
	public String m_CAL_NO_TO = null;
	/** 第 2 変数： m_CAL_NO */
	public Integer m_CAL_NO = null;
	/** 第 3 変数： m_CAL_NAME */
	public String m_CAL_NAME = null;
	/** 第 4 変数： m_CAL_NO_FROM */
	public String m_CAL_NO_FROM = null;
	/** 第 5 変数： m_CAL_DATE */
	public String m_CAL_DATE = null;
	/** 第 6 変数： m_HOLIDAY_FLG */
	public Integer m_HOLIDAY_FLG = null;
	/** 第 7 変数： m_CAL_COMMENT */
	public String m_CAL_COMMENT = null;
	/** 第 8 変数： m_CAL_YEAR */
	public String m_CAL_YEAR = null;
	/** 第 9 変数： m_CAL_YEAR_HOLIDAY */
	public String m_CAL_YEAR_HOLIDAY = null;
	/** 第 10 変数： m_CAL_NAME_TO */
	public String m_CAL_NAME_TO = null;
	/** 第 11 変数： m_CAL_NAME_FROM */
	public String m_CAL_NAME_FROM = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_CAL_NO_TO */
	public List l_CAL_NO_TO = null;

	/** 第 2 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 3 List変数： l_CAL_NAME */
	public List l_CAL_NAME = null;

	/** 第 4 List変数： l_CAL_NO_FROM */
	public List l_CAL_NO_FROM = null;

	/** 第 5 List変数： l_CAL_DATE */
	public List l_CAL_DATE = null;

	/** 第 6 List変数： l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** 第 7 List変数： l_CAL_COMMENT */
	public List l_CAL_COMMENT = null;

	/** 第 8 List変数： l_CAL_YEAR */
	public List l_CAL_YEAR = null;

	/** 第 9 List変数： l_CAL_YEAR_HOLIDAY */
	public List l_CAL_YEAR_HOLIDAY = null;

	/** 第 10 List変数： l_CAL_NAME_TO */
	public List l_CAL_NAME_TO = null;

	/** 第 11 List変数： l_CAL_NAME_FROM */
	public List l_CAL_NAME_FROM = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getCAL_NO_TO() { return m_CAL_NO_TO; }
	public Integer getCAL_NO() { return m_CAL_NO; }
	public String getCAL_NAME() { return m_CAL_NAME; }
	public String getCAL_NO_FROM() { return m_CAL_NO_FROM; }
	public String getCAL_DATE() { return m_CAL_DATE; }
	public Integer getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getCAL_COMMENT() { return m_CAL_COMMENT; }
	public String getCAL_YEAR() { return m_CAL_YEAR; }
	public String getCAL_YEAR_HOLIDAY() { return m_CAL_YEAR_HOLIDAY; }
	public String getCAL_NAME_TO() { return m_CAL_NAME_TO; }
	public String getCAL_NAME_FROM() { return m_CAL_NAME_FROM; }

	public List getList_CAL_NO_TO() { return l_CAL_NO_TO; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_CAL_NAME() { return l_CAL_NAME; }
	public List getList_CAL_NO_FROM() { return l_CAL_NO_FROM; }
	public List getList_CAL_DATE() { return l_CAL_DATE; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_CAL_COMMENT() { return l_CAL_COMMENT; }
	public List getList_CAL_YEAR() { return l_CAL_YEAR; }
	public List getList_CAL_YEAR_HOLIDAY() { return l_CAL_YEAR_HOLIDAY; }
	public List getList_CAL_NAME_TO() { return l_CAL_NAME_TO; }
	public List getList_CAL_NAME_FROM() { return l_CAL_NAME_FROM; }

	public void setCAL_NO_TO(String val) { m_CAL_NO_TO = val; }
	public void setCAL_NO(Integer val) { m_CAL_NO = val; }
	public void setCAL_NAME(String val) { m_CAL_NAME = val; }
	public void setCAL_NO_FROM(String val) { m_CAL_NO_FROM = val; }
	public void setCAL_DATE(String val) { m_CAL_DATE = val; }
	public void setHOLIDAY_FLG(Integer val) { m_HOLIDAY_FLG = val; }
	public void setCAL_COMMENT(String val) { m_CAL_COMMENT = val; }
	public void setCAL_YEAR(String val) { m_CAL_YEAR = val; }
	public void setCAL_YEAR_HOLIDAY(String val) { m_CAL_YEAR_HOLIDAY = val; }
	public void setCAL_NAME_TO(String val) { m_CAL_NAME_TO = val; }
	public void setCAL_NAME_FROM(String val) { m_CAL_NAME_FROM = val; }

	public void setCAL_NO(String val) { m_CAL_NO = getInteger(val); }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = getInteger(val); }

	public void setList_CAL_NO_TO(List list) { l_CAL_NO_TO = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_CAL_NAME(List list) { l_CAL_NAME = list; }
	public void setList_CAL_NO_FROM(List list) { l_CAL_NO_FROM = list; }
	public void setList_CAL_DATE(List list) { l_CAL_DATE = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_CAL_COMMENT(List list) { l_CAL_COMMENT = list; }
	public void setList_CAL_YEAR(List list) { l_CAL_YEAR = list; }
	public void setList_CAL_YEAR_HOLIDAY(List list) { l_CAL_YEAR_HOLIDAY = list; }
	public void setList_CAL_NAME_TO(List list) { l_CAL_NAME_TO = list; }
	public void setList_CAL_NAME_FROM(List list) { l_CAL_NAME_FROM = list; }

	public int setL2L_CAL_NO_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO_TO == null) {
			l_CAL_NO_TO = new ArrayList();
		} else {
			l_CAL_NO_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO_TO.add(((AA0080030Struct) list.get(i)).getCAL_NO_TO());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AA0080030Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_CAL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME == null) {
			l_CAL_NAME = new ArrayList();
		} else {
			l_CAL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME.add(((AA0080030Struct) list.get(i)).getCAL_NAME());
		}
		return size;
	}
	public int setL2L_CAL_NO_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO_FROM == null) {
			l_CAL_NO_FROM = new ArrayList();
		} else {
			l_CAL_NO_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO_FROM.add(((AA0080030Struct) list.get(i)).getCAL_NO_FROM());
		}
		return size;
	}
	public int setL2L_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_DATE == null) {
			l_CAL_DATE = new ArrayList();
		} else {
			l_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_DATE.add(((AA0080030Struct) list.get(i)).getCAL_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AA0080030Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_CAL_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_COMMENT == null) {
			l_CAL_COMMENT = new ArrayList();
		} else {
			l_CAL_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_COMMENT.add(((AA0080030Struct) list.get(i)).getCAL_COMMENT());
		}
		return size;
	}
	public int setL2L_CAL_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_YEAR == null) {
			l_CAL_YEAR = new ArrayList();
		} else {
			l_CAL_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_YEAR.add(((AA0080030Struct) list.get(i)).getCAL_YEAR());
		}
		return size;
	}
	public int setL2L_CAL_YEAR_HOLIDAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_YEAR_HOLIDAY == null) {
			l_CAL_YEAR_HOLIDAY = new ArrayList();
		} else {
			l_CAL_YEAR_HOLIDAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_YEAR_HOLIDAY.add(((AA0080030Struct) list.get(i)).getCAL_YEAR_HOLIDAY());
		}
		return size;
	}
	public int setL2L_CAL_NAME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME_TO == null) {
			l_CAL_NAME_TO = new ArrayList();
		} else {
			l_CAL_NAME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME_TO.add(((AA0080030Struct) list.get(i)).getCAL_NAME_TO());
		}
		return size;
	}
	public int setL2L_CAL_NAME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME_FROM == null) {
			l_CAL_NAME_FROM = new ArrayList();
		} else {
			l_CAL_NAME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME_FROM.add(((AA0080030Struct) list.get(i)).getCAL_NAME_FROM());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CAL_NO_TO = null;
		m_CAL_NO = null;
		m_CAL_NAME = null;
		m_CAL_NO_FROM = null;
		m_CAL_DATE = null;
		m_HOLIDAY_FLG = null;
		m_CAL_COMMENT = null;
		m_CAL_YEAR = null;
		m_CAL_YEAR_HOLIDAY = null;
		m_CAL_NAME_TO = null;
		m_CAL_NAME_FROM = null;

		l_CAL_NO_TO = null;
		l_CAL_NO = null;
		l_CAL_NAME = null;
		l_CAL_NO_FROM = null;
		l_CAL_DATE = null;
		l_HOLIDAY_FLG = null;
		l_CAL_COMMENT = null;
		l_CAL_YEAR = null;
		l_CAL_YEAR_HOLIDAY = null;
		l_CAL_NAME_TO = null;
		l_CAL_NAME_FROM = null;

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
	 * medAA0080030クラスの標準コンストラクタ
	 */
	public AA0080030Struct()
	{
		//{{user_implement_code_constractor
                 
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
	public void setStruct(AA0080030Struct struct)
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
	public void setStructM(AA0080030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCAL_NO_TO(struct.getCAL_NO_TO());
			this.setCAL_NO(struct.getCAL_NO());
			this.setCAL_NAME(struct.getCAL_NAME());
			this.setCAL_NO_FROM(struct.getCAL_NO_FROM());
			this.setCAL_DATE(struct.getCAL_DATE());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setCAL_COMMENT(struct.getCAL_COMMENT());
			this.setCAL_YEAR(struct.getCAL_YEAR());
			this.setCAL_YEAR_HOLIDAY(struct.getCAL_YEAR_HOLIDAY());
			this.setCAL_NAME_TO(struct.getCAL_NAME_TO());
			this.setCAL_NAME_FROM(struct.getCAL_NAME_FROM());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0080030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CAL_NO_TO(struct.getList_CAL_NO_TO());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_CAL_NAME(struct.getList_CAL_NAME());
			this.setList_CAL_NO_FROM(struct.getList_CAL_NO_FROM());
			this.setList_CAL_DATE(struct.getList_CAL_DATE());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_CAL_COMMENT(struct.getList_CAL_COMMENT());
			this.setList_CAL_YEAR(struct.getList_CAL_YEAR());
			this.setList_CAL_YEAR_HOLIDAY(struct.getList_CAL_YEAR_HOLIDAY());
			this.setList_CAL_NAME_TO(struct.getList_CAL_NAME_TO());
			this.setList_CAL_NAME_FROM(struct.getList_CAL_NAME_FROM());
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
	// 第 1 変数初期値： i_CAL_NO_TO


	final static String i_CAL_NO_TO = null;

	// 第 2 変数初期値： i_CAL_NO


	final static Integer i_CAL_NO = null;

	// 第 3 変数初期値： i_CAL_NAME


	final static String i_CAL_NAME = null;

	// 第 4 変数初期値： i_CAL_NO_FROM


	final static String i_CAL_NO_FROM = null;

	// 第 5 変数初期値： i_CAL_DATE


	final static String i_CAL_DATE = null;

	// 第 6 変数初期値： i_HOLIDAY_FLG


	final static Integer i_HOLIDAY_FLG = null;

	// 第 7 変数初期値： i_CAL_COMMENT


	final static String i_CAL_COMMENT = null;

	// 第 8 変数初期値： i_CAL_YEAR


	final static String i_CAL_YEAR = null;

	// 第 9 変数初期値： i_CAL_YEAR_HOLIDAY


	final static String i_CAL_YEAR_HOLIDAY = null;

	// 第 10 変数初期値： i_CAL_NAME_TO


	final static String i_CAL_NAME_TO = null;

	// 第 11 変数初期値： i_CAL_NAME_FROM


	final static String i_CAL_NAME_FROM = null;

*/

	//{{user_implement_code
         
        //}}user_implement_code

	//////////////////////////////

}
