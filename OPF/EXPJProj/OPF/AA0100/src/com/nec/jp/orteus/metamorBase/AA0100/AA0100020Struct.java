/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/src/com/nec/jp/orteus/metamorBase/AA0100/AA0100020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0100;

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

public class AA0100020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_HOLIDAY_DATE */
	public String m_HOLIDAY_DATE = null;
	/** 第 2 変数： m_HOLIDAY_NAME */
	public String m_HOLIDAY_NAME = null;
	/** 第 3 変数： m_HOLIDAY_COMMENT */
	public String m_HOLIDAY_COMMENT = null;
	/** 第 4 変数： m_SRC_YEAR */
	public String m_SRC_YEAR = null;
	/** 第 5 変数： m_DST_YEAR */
	public String m_DST_YEAR = null;
	/** 第 6 変数： m_COPY_SRC_YEAR */
	public String m_COPY_SRC_YEAR = null;
	/** 第 7 変数： m_COPY_DST_YEAR */
	public String m_COPY_DST_YEAR = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_HOLIDAY_DATE */
	public List l_HOLIDAY_DATE = null;

	/** 第 2 List変数： l_HOLIDAY_NAME */
	public List l_HOLIDAY_NAME = null;

	/** 第 3 List変数： l_HOLIDAY_COMMENT */
	public List l_HOLIDAY_COMMENT = null;

	/** 第 4 List変数： l_SRC_YEAR */
	public List l_SRC_YEAR = null;

	/** 第 5 List変数： l_DST_YEAR */
	public List l_DST_YEAR = null;

	/** 第 6 List変数： l_COPY_SRC_YEAR */
	public List l_COPY_SRC_YEAR = null;

	/** 第 7 List変数： l_COPY_DST_YEAR */
	public List l_COPY_DST_YEAR = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getHOLIDAY_DATE() { return m_HOLIDAY_DATE; }
	public String getHOLIDAY_NAME() { return m_HOLIDAY_NAME; }
	public String getHOLIDAY_COMMENT() { return m_HOLIDAY_COMMENT; }
	public String getSRC_YEAR() { return m_SRC_YEAR; }
	public String getDST_YEAR() { return m_DST_YEAR; }
	public String getCOPY_SRC_YEAR() { return m_COPY_SRC_YEAR; }
	public String getCOPY_DST_YEAR() { return m_COPY_DST_YEAR; }

	public List getList_HOLIDAY_DATE() { return l_HOLIDAY_DATE; }
	public List getList_HOLIDAY_NAME() { return l_HOLIDAY_NAME; }
	public List getList_HOLIDAY_COMMENT() { return l_HOLIDAY_COMMENT; }
	public List getList_SRC_YEAR() { return l_SRC_YEAR; }
	public List getList_DST_YEAR() { return l_DST_YEAR; }
	public List getList_COPY_SRC_YEAR() { return l_COPY_SRC_YEAR; }
	public List getList_COPY_DST_YEAR() { return l_COPY_DST_YEAR; }

	public void setHOLIDAY_DATE(String val) { m_HOLIDAY_DATE = val; }
	public void setHOLIDAY_NAME(String val) { m_HOLIDAY_NAME = val; }
	public void setHOLIDAY_COMMENT(String val) { m_HOLIDAY_COMMENT = val; }
	public void setSRC_YEAR(String val) { m_SRC_YEAR = val; }
	public void setDST_YEAR(String val) { m_DST_YEAR = val; }
	public void setCOPY_SRC_YEAR(String val) { m_COPY_SRC_YEAR = val; }
	public void setCOPY_DST_YEAR(String val) { m_COPY_DST_YEAR = val; }


	public void setList_HOLIDAY_DATE(List list) { l_HOLIDAY_DATE = list; }
	public void setList_HOLIDAY_NAME(List list) { l_HOLIDAY_NAME = list; }
	public void setList_HOLIDAY_COMMENT(List list) { l_HOLIDAY_COMMENT = list; }
	public void setList_SRC_YEAR(List list) { l_SRC_YEAR = list; }
	public void setList_DST_YEAR(List list) { l_DST_YEAR = list; }
	public void setList_COPY_SRC_YEAR(List list) { l_COPY_SRC_YEAR = list; }
	public void setList_COPY_DST_YEAR(List list) { l_COPY_DST_YEAR = list; }

	public int setL2L_HOLIDAY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_DATE == null) {
			l_HOLIDAY_DATE = new ArrayList();
		} else {
			l_HOLIDAY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_DATE.add(((AA0100020Struct) list.get(i)).getHOLIDAY_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_NAME == null) {
			l_HOLIDAY_NAME = new ArrayList();
		} else {
			l_HOLIDAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_NAME.add(((AA0100020Struct) list.get(i)).getHOLIDAY_NAME());
		}
		return size;
	}
	public int setL2L_HOLIDAY_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_COMMENT == null) {
			l_HOLIDAY_COMMENT = new ArrayList();
		} else {
			l_HOLIDAY_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_COMMENT.add(((AA0100020Struct) list.get(i)).getHOLIDAY_COMMENT());
		}
		return size;
	}
	public int setL2L_SRC_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SRC_YEAR == null) {
			l_SRC_YEAR = new ArrayList();
		} else {
			l_SRC_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SRC_YEAR.add(((AA0100020Struct) list.get(i)).getSRC_YEAR());
		}
		return size;
	}
	public int setL2L_DST_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DST_YEAR == null) {
			l_DST_YEAR = new ArrayList();
		} else {
			l_DST_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DST_YEAR.add(((AA0100020Struct) list.get(i)).getDST_YEAR());
		}
		return size;
	}
	public int setL2L_COPY_SRC_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COPY_SRC_YEAR == null) {
			l_COPY_SRC_YEAR = new ArrayList();
		} else {
			l_COPY_SRC_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COPY_SRC_YEAR.add(((AA0100020Struct) list.get(i)).getCOPY_SRC_YEAR());
		}
		return size;
	}
	public int setL2L_COPY_DST_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COPY_DST_YEAR == null) {
			l_COPY_DST_YEAR = new ArrayList();
		} else {
			l_COPY_DST_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COPY_DST_YEAR.add(((AA0100020Struct) list.get(i)).getCOPY_DST_YEAR());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HOLIDAY_DATE = null;
		m_HOLIDAY_NAME = null;
		m_HOLIDAY_COMMENT = null;
		m_SRC_YEAR = null;
		m_DST_YEAR = null;
		m_COPY_SRC_YEAR = null;
		m_COPY_DST_YEAR = null;

		l_HOLIDAY_DATE = null;
		l_HOLIDAY_NAME = null;
		l_HOLIDAY_COMMENT = null;
		l_SRC_YEAR = null;
		l_DST_YEAR = null;
		l_COPY_SRC_YEAR = null;
		l_COPY_DST_YEAR = null;

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
	 * medAA0100020クラスの標準コンストラクタ
	 */
	public AA0100020Struct()
	{
		//{{user_implement_code_constractor
                //------------------------------------------------------------------------------
                initialize();
                //------------------------------------------------------------------------------
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
	public void setStruct(AA0100020Struct struct)
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
	public void setStructM(AA0100020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHOLIDAY_DATE(struct.getHOLIDAY_DATE());
			this.setHOLIDAY_NAME(struct.getHOLIDAY_NAME());
			this.setHOLIDAY_COMMENT(struct.getHOLIDAY_COMMENT());
			this.setSRC_YEAR(struct.getSRC_YEAR());
			this.setDST_YEAR(struct.getDST_YEAR());
			this.setCOPY_SRC_YEAR(struct.getCOPY_SRC_YEAR());
			this.setCOPY_DST_YEAR(struct.getCOPY_DST_YEAR());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0100020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HOLIDAY_DATE(struct.getList_HOLIDAY_DATE());
			this.setList_HOLIDAY_NAME(struct.getList_HOLIDAY_NAME());
			this.setList_HOLIDAY_COMMENT(struct.getList_HOLIDAY_COMMENT());
			this.setList_SRC_YEAR(struct.getList_SRC_YEAR());
			this.setList_DST_YEAR(struct.getList_DST_YEAR());
			this.setList_COPY_SRC_YEAR(struct.getList_COPY_SRC_YEAR());
			this.setList_COPY_DST_YEAR(struct.getList_COPY_DST_YEAR());
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
	// 第 1 変数初期値： i_HOLIDAY_DATE


	final static String i_HOLIDAY_DATE = null;

	// 第 2 変数初期値： i_HOLIDAY_NAME


	final static String i_HOLIDAY_NAME = null;

	// 第 3 変数初期値： i_HOLIDAY_COMMENT


	final static String i_HOLIDAY_COMMENT = null;

	// 第 4 変数初期値： i_SRC_YEAR


	final static String i_SRC_YEAR = null;

	// 第 5 変数初期値： i_DST_YEAR


	final static String i_DST_YEAR = null;

	// 第 6 変数初期値： i_COPY_SRC_YEAR


	final static String i_COPY_SRC_YEAR = null;

	// 第 7 変数初期値： i_COPY_DST_YEAR


	final static String i_COPY_DST_YEAR = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        /**
         * 初期設定
         */
        public void initialize()
        {
         clear();
        }
       
        /**
         * 内容コピー
         */
        public void copy(AA0100020Struct struct)
        {
         if(struct.m_HOLIDAY_DATE != null)			{m_HOLIDAY_DATE				=	new String(struct.m_HOLIDAY_DATE);				}
         else										{m_HOLIDAY_DATE				=	null;											}
       
         if(struct.m_HOLIDAY_NAME != null)			{m_HOLIDAY_NAME				=	new String(struct.m_HOLIDAY_NAME);				}
         else										{m_HOLIDAY_NAME				=	null;											}
       
         if(struct.m_HOLIDAY_COMMENT != null)		{m_HOLIDAY_COMMENT			=	new String(struct.m_HOLIDAY_COMMENT);			}
         else										{m_HOLIDAY_COMMENT			=	null;											}
       
         if(struct.m_SRC_YEAR != null)				{m_SRC_YEAR					=	new String(struct.m_SRC_YEAR);					}
         else										{m_SRC_YEAR					=	null;											}
       
         if(struct.m_DST_YEAR != null)				{m_DST_YEAR					=	new String(struct.m_DST_YEAR);					}
         else										{m_DST_YEAR					=	null;											}
       
         if(struct.m_COPY_SRC_YEAR != null)			{m_COPY_SRC_YEAR			=	new String(struct.m_COPY_SRC_YEAR);				}
         else										{m_COPY_SRC_YEAR			=	null;											}
       
         if(struct.m_COPY_DST_YEAR != null)			{m_COPY_DST_YEAR			=	new String(struct.m_COPY_DST_YEAR);				}
         else										{m_COPY_DST_YEAR			=	null;											}
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
