/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0070/src/com/nec/jp/orteus/metamorBase/AN0070/AN0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0070;

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
//}}user_implement_code_header

public class AN0070010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_PRD_PLAN_FINAL_DAY_TYP_name */
	public String m_PRD_PLAN_FINAL_DAY_TYP_name = null;
	/** 第 2 変数： m_PRD_PLAN_FINAL_DAY_TYP_val */
	public String m_PRD_PLAN_FINAL_DAY_TYP_val = null;
	/** 第 3 変数： m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** 第 4 変数： m_PLAN_SPAN */
	public String m_PLAN_SPAN = null;
	/** 第 5 変数： m_PRD_PLAN_FINAL_DAY_TYP */
	public String m_PRD_PLAN_FINAL_DAY_TYP = null;
	/** 第 6 変数： m_h_PRD_PLAN_PERIOD_TYP */
	public String m_h_PRD_PLAN_PERIOD_TYP = null;
	/** 第 7 変数： m_h_PLAN_SPAN */
	public String m_h_PLAN_SPAN = null;
	/** 第 8 変数： m_h_PRD_PLAN_FINAL_DAY_TYP */
	public String m_h_PRD_PLAN_FINAL_DAY_TYP = null;
	/** 第 9 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_PRD_PLAN_FINAL_DAY_TYP_name */
	public List l_PRD_PLAN_FINAL_DAY_TYP_name = null;

	/** 第 2 List変数： l_PRD_PLAN_FINAL_DAY_TYP_val */
	public List l_PRD_PLAN_FINAL_DAY_TYP_val = null;

	/** 第 3 List変数： l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** 第 4 List変数： l_PLAN_SPAN */
	public List l_PLAN_SPAN = null;

	/** 第 5 List変数： l_PRD_PLAN_FINAL_DAY_TYP */
	public List l_PRD_PLAN_FINAL_DAY_TYP = null;

	/** 第 6 List変数： l_h_PRD_PLAN_PERIOD_TYP */
	public List l_h_PRD_PLAN_PERIOD_TYP = null;

	/** 第 7 List変数： l_h_PLAN_SPAN */
	public List l_h_PLAN_SPAN = null;

	/** 第 8 List変数： l_h_PRD_PLAN_FINAL_DAY_TYP */
	public List l_h_PRD_PLAN_FINAL_DAY_TYP = null;

	/** 第 9 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getPRD_PLAN_FINAL_DAY_TYP_name() { return m_PRD_PLAN_FINAL_DAY_TYP_name; }
	public String getPRD_PLAN_FINAL_DAY_TYP_val() { return m_PRD_PLAN_FINAL_DAY_TYP_val; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getPLAN_SPAN() { return m_PLAN_SPAN; }
	public String getPRD_PLAN_FINAL_DAY_TYP() { return m_PRD_PLAN_FINAL_DAY_TYP; }
	public String geth_PRD_PLAN_PERIOD_TYP() { return m_h_PRD_PLAN_PERIOD_TYP; }
	public String geth_PLAN_SPAN() { return m_h_PLAN_SPAN; }
	public String geth_PRD_PLAN_FINAL_DAY_TYP() { return m_h_PRD_PLAN_FINAL_DAY_TYP; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }

	public List getList_PRD_PLAN_FINAL_DAY_TYP_name() { return l_PRD_PLAN_FINAL_DAY_TYP_name; }
	public List getList_PRD_PLAN_FINAL_DAY_TYP_val() { return l_PRD_PLAN_FINAL_DAY_TYP_val; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_PLAN_SPAN() { return l_PLAN_SPAN; }
	public List getList_PRD_PLAN_FINAL_DAY_TYP() { return l_PRD_PLAN_FINAL_DAY_TYP; }
	public List getList_h_PRD_PLAN_PERIOD_TYP() { return l_h_PRD_PLAN_PERIOD_TYP; }
	public List getList_h_PLAN_SPAN() { return l_h_PLAN_SPAN; }
	public List getList_h_PRD_PLAN_FINAL_DAY_TYP() { return l_h_PRD_PLAN_FINAL_DAY_TYP; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }

	public void setPRD_PLAN_FINAL_DAY_TYP_name(String val) { m_PRD_PLAN_FINAL_DAY_TYP_name = val; }
	public void setPRD_PLAN_FINAL_DAY_TYP_val(String val) { m_PRD_PLAN_FINAL_DAY_TYP_val = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setPLAN_SPAN(String val) { m_PLAN_SPAN = val; }
	public void setPRD_PLAN_FINAL_DAY_TYP(String val) { m_PRD_PLAN_FINAL_DAY_TYP = val; }
	public void seth_PRD_PLAN_PERIOD_TYP(String val) { m_h_PRD_PLAN_PERIOD_TYP = val; }
	public void seth_PLAN_SPAN(String val) { m_h_PLAN_SPAN = val; }
	public void seth_PRD_PLAN_FINAL_DAY_TYP(String val) { m_h_PRD_PLAN_FINAL_DAY_TYP = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }


	public void setList_PRD_PLAN_FINAL_DAY_TYP_name(List list) { l_PRD_PLAN_FINAL_DAY_TYP_name = list; }
	public void setList_PRD_PLAN_FINAL_DAY_TYP_val(List list) { l_PRD_PLAN_FINAL_DAY_TYP_val = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_PLAN_SPAN(List list) { l_PLAN_SPAN = list; }
	public void setList_PRD_PLAN_FINAL_DAY_TYP(List list) { l_PRD_PLAN_FINAL_DAY_TYP = list; }
	public void setList_h_PRD_PLAN_PERIOD_TYP(List list) { l_h_PRD_PLAN_PERIOD_TYP = list; }
	public void setList_h_PLAN_SPAN(List list) { l_h_PLAN_SPAN = list; }
	public void setList_h_PRD_PLAN_FINAL_DAY_TYP(List list) { l_h_PRD_PLAN_FINAL_DAY_TYP = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }

	public int setL2L_PRD_PLAN_FINAL_DAY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_PLAN_FINAL_DAY_TYP_name == null) {
			l_PRD_PLAN_FINAL_DAY_TYP_name = new ArrayList();
		} else {
			l_PRD_PLAN_FINAL_DAY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_PLAN_FINAL_DAY_TYP_name.add(((AN0070010Struct) list.get(i)).getPRD_PLAN_FINAL_DAY_TYP_name());
		}
		return size;
	}
	public int setL2L_PRD_PLAN_FINAL_DAY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_PLAN_FINAL_DAY_TYP_val == null) {
			l_PRD_PLAN_FINAL_DAY_TYP_val = new ArrayList();
		} else {
			l_PRD_PLAN_FINAL_DAY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_PLAN_FINAL_DAY_TYP_val.add(((AN0070010Struct) list.get(i)).getPRD_PLAN_FINAL_DAY_TYP_val());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AN0070010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_PLAN_SPAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLAN_SPAN == null) {
			l_PLAN_SPAN = new ArrayList();
		} else {
			l_PLAN_SPAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLAN_SPAN.add(((AN0070010Struct) list.get(i)).getPLAN_SPAN());
		}
		return size;
	}
	public int setL2L_PRD_PLAN_FINAL_DAY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_PLAN_FINAL_DAY_TYP == null) {
			l_PRD_PLAN_FINAL_DAY_TYP = new ArrayList();
		} else {
			l_PRD_PLAN_FINAL_DAY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_PLAN_FINAL_DAY_TYP.add(((AN0070010Struct) list.get(i)).getPRD_PLAN_FINAL_DAY_TYP());
		}
		return size;
	}
	public int setL2L_h_PRD_PLAN_PERIOD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_PLAN_PERIOD_TYP == null) {
			l_h_PRD_PLAN_PERIOD_TYP = new ArrayList();
		} else {
			l_h_PRD_PLAN_PERIOD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_PLAN_PERIOD_TYP.add(((AN0070010Struct) list.get(i)).geth_PRD_PLAN_PERIOD_TYP());
		}
		return size;
	}
	public int setL2L_h_PLAN_SPAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLAN_SPAN == null) {
			l_h_PLAN_SPAN = new ArrayList();
		} else {
			l_h_PLAN_SPAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLAN_SPAN.add(((AN0070010Struct) list.get(i)).geth_PLAN_SPAN());
		}
		return size;
	}
	public int setL2L_h_PRD_PLAN_FINAL_DAY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_PLAN_FINAL_DAY_TYP == null) {
			l_h_PRD_PLAN_FINAL_DAY_TYP = new ArrayList();
		} else {
			l_h_PRD_PLAN_FINAL_DAY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_PLAN_FINAL_DAY_TYP.add(((AN0070010Struct) list.get(i)).geth_PRD_PLAN_FINAL_DAY_TYP());
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
			l_h_MODIFY_COUNT.add(((AN0070010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PRD_PLAN_FINAL_DAY_TYP_name = null;
		m_PRD_PLAN_FINAL_DAY_TYP_val = null;
		m_DISPLAY_NAME = null;
		m_PLAN_SPAN = null;
		m_PRD_PLAN_FINAL_DAY_TYP = null;
		m_h_PRD_PLAN_PERIOD_TYP = null;
		m_h_PLAN_SPAN = null;
		m_h_PRD_PLAN_FINAL_DAY_TYP = null;
		m_h_MODIFY_COUNT = null;

		l_PRD_PLAN_FINAL_DAY_TYP_name = null;
		l_PRD_PLAN_FINAL_DAY_TYP_val = null;
		l_DISPLAY_NAME = null;
		l_PLAN_SPAN = null;
		l_PRD_PLAN_FINAL_DAY_TYP = null;
		l_h_PRD_PLAN_PERIOD_TYP = null;
		l_h_PLAN_SPAN = null;
		l_h_PRD_PLAN_FINAL_DAY_TYP = null;
		l_h_MODIFY_COUNT = null;

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
	 * medAN0070010クラスの標準コンストラクタ
	 */
	public AN0070010Struct()
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
	public void setStruct(AN0070010Struct struct)
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
	public void setStructM(AN0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPRD_PLAN_FINAL_DAY_TYP_name(struct.getPRD_PLAN_FINAL_DAY_TYP_name());
			this.setPRD_PLAN_FINAL_DAY_TYP_val(struct.getPRD_PLAN_FINAL_DAY_TYP_val());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setPLAN_SPAN(struct.getPLAN_SPAN());
			this.setPRD_PLAN_FINAL_DAY_TYP(struct.getPRD_PLAN_FINAL_DAY_TYP());
			this.seth_PRD_PLAN_PERIOD_TYP(struct.geth_PRD_PLAN_PERIOD_TYP());
			this.seth_PLAN_SPAN(struct.geth_PLAN_SPAN());
			this.seth_PRD_PLAN_FINAL_DAY_TYP(struct.geth_PRD_PLAN_FINAL_DAY_TYP());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PRD_PLAN_FINAL_DAY_TYP_name(struct.getList_PRD_PLAN_FINAL_DAY_TYP_name());
			this.setList_PRD_PLAN_FINAL_DAY_TYP_val(struct.getList_PRD_PLAN_FINAL_DAY_TYP_val());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_PLAN_SPAN(struct.getList_PLAN_SPAN());
			this.setList_PRD_PLAN_FINAL_DAY_TYP(struct.getList_PRD_PLAN_FINAL_DAY_TYP());
			this.setList_h_PRD_PLAN_PERIOD_TYP(struct.getList_h_PRD_PLAN_PERIOD_TYP());
			this.setList_h_PLAN_SPAN(struct.getList_h_PLAN_SPAN());
			this.setList_h_PRD_PLAN_FINAL_DAY_TYP(struct.getList_h_PRD_PLAN_FINAL_DAY_TYP());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
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
	// 第 1 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP_name


	final static String i_PRD_PLAN_FINAL_DAY_TYP_name = null;

	// 第 2 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP_val


	final static String i_PRD_PLAN_FINAL_DAY_TYP_val = null;

	// 第 3 変数初期値： i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// 第 4 変数初期値： i_PLAN_SPAN


	final static String i_PLAN_SPAN = null;

	// 第 5 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP


	final static String i_PRD_PLAN_FINAL_DAY_TYP = null;

	// 第 6 変数初期値： i_h_PRD_PLAN_PERIOD_TYP


	final static String i_h_PRD_PLAN_PERIOD_TYP = null;

	// 第 7 変数初期値： i_h_PLAN_SPAN


	final static String i_h_PLAN_SPAN = null;

	// 第 8 変数初期値： i_h_PRD_PLAN_FINAL_DAY_TYP


	final static String i_h_PRD_PLAN_FINAL_DAY_TYP = null;

	// 第 9 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_PLAN_SPAN
        final static String i_PLAN_SPAN = null;
        // 第 2 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP
        final static String i_PRD_PLAN_FINAL_DAY_TYP = null;
        // 第 3 変数初期値： i_h_PRD_PLAN_PERIOD_TYP
        final static String i_h_PRD_PLAN_PERIOD_TYP = null;
        // 第 4 変数初期値： i_DISPLAY_NAME
        final static String i_DISPLAY_NAME = null;
        // 第 5 変数初期値： i_h_PLAN_SPAN
        final static String i_h_PLAN_SPAN = null;
        // 第 6 変数初期値： i_h_PRD_PLAN_FINAL_DAY_TYP
        final static String i_h_PRD_PLAN_FINAL_DAY_TYP = null;
        // 第 7 変数初期値： i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // 第 8 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP_name
       //	final static String i_PRD_PLAN_FINAL_DAY_TYP_name = null;
        // 第 9 変数初期値： i_PRD_PLAN_FINAL_DAY_TYP_val
       //	final static String i_PRD_PLAN_FINAL_DAY_TYP_val = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
         m_PLAN_SPAN = i_PLAN_SPAN;
         m_PRD_PLAN_FINAL_DAY_TYP = i_PRD_PLAN_FINAL_DAY_TYP;
         m_h_PRD_PLAN_PERIOD_TYP = i_h_PRD_PLAN_PERIOD_TYP;
         m_DISPLAY_NAME = i_DISPLAY_NAME;
         m_h_PLAN_SPAN = i_h_PLAN_SPAN;
         m_h_PRD_PLAN_FINAL_DAY_TYP = i_h_PRD_PLAN_FINAL_DAY_TYP;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
       //		m_PRD_PLAN_FINAL_DAY_TYP_name = i_PRD_PLAN_FINAL_DAY_TYP_name;
       //		m_PRD_PLAN_FINAL_DAY_TYP_val = i_PRD_PLAN_FINAL_DAY_TYP_val;
        }
       
        //}}user_implement_code

	//////////////////////////////

}
