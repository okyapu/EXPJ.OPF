/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0100/src/com/nec/jp/orteus/metamorBase/AN0100/AN0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0100;

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

public class AN0100010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_l_OPTION_ID */
	public String m_l_OPTION_ID = null;
	/** 第 2 変数： m_l_OPTION_NAME */
	public String m_l_OPTION_NAME = null;
	/** 第 3 変数： m_l_INSTALL_FLG */
	public String m_l_INSTALL_FLG = null;
	/** 第 4 変数： m_l_INSTALL_DATE */
	public String m_l_INSTALL_DATE = null;
	/** 第 5 変数： m_l_h_INSTALL_FLG */
	public String m_l_h_INSTALL_FLG = null;
	/** 第 6 変数： m_l_h_INSTALL_DATE */
	public String m_l_h_INSTALL_DATE = null;
	/** 第 7 変数： m_l_h_MODIFY_COUNT */
	public String m_l_h_MODIFY_COUNT = null;
	/** 第 8 変数： m_l_INSTALL_FLG_name */
	public String m_l_INSTALL_FLG_name = null;
	/** 第 9 変数： m_l_INSTALL_FLG_val */
	public String m_l_INSTALL_FLG_val = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_l_OPTION_ID */
	public List l_l_OPTION_ID = null;

	/** 第 2 List変数： l_l_OPTION_NAME */
	public List l_l_OPTION_NAME = null;

	/** 第 3 List変数： l_l_INSTALL_FLG */
	public List l_l_INSTALL_FLG = null;

	/** 第 4 List変数： l_l_INSTALL_DATE */
	public List l_l_INSTALL_DATE = null;

	/** 第 5 List変数： l_l_h_INSTALL_FLG */
	public List l_l_h_INSTALL_FLG = null;

	/** 第 6 List変数： l_l_h_INSTALL_DATE */
	public List l_l_h_INSTALL_DATE = null;

	/** 第 7 List変数： l_l_h_MODIFY_COUNT */
	public List l_l_h_MODIFY_COUNT = null;

	/** 第 8 List変数： l_l_INSTALL_FLG_name */
	public List l_l_INSTALL_FLG_name = null;

	/** 第 9 List変数： l_l_INSTALL_FLG_val */
	public List l_l_INSTALL_FLG_val = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getl_OPTION_ID() { return m_l_OPTION_ID; }
	public String getl_OPTION_NAME() { return m_l_OPTION_NAME; }
	public String getl_INSTALL_FLG() { return m_l_INSTALL_FLG; }
	public String getl_INSTALL_DATE() { return m_l_INSTALL_DATE; }
	public String getl_h_INSTALL_FLG() { return m_l_h_INSTALL_FLG; }
	public String getl_h_INSTALL_DATE() { return m_l_h_INSTALL_DATE; }
	public String getl_h_MODIFY_COUNT() { return m_l_h_MODIFY_COUNT; }
	public String getl_INSTALL_FLG_name() { return m_l_INSTALL_FLG_name; }
	public String getl_INSTALL_FLG_val() { return m_l_INSTALL_FLG_val; }

	public List getList_l_OPTION_ID() { return l_l_OPTION_ID; }
	public List getList_l_OPTION_NAME() { return l_l_OPTION_NAME; }
	public List getList_l_INSTALL_FLG() { return l_l_INSTALL_FLG; }
	public List getList_l_INSTALL_DATE() { return l_l_INSTALL_DATE; }
	public List getList_l_h_INSTALL_FLG() { return l_l_h_INSTALL_FLG; }
	public List getList_l_h_INSTALL_DATE() { return l_l_h_INSTALL_DATE; }
	public List getList_l_h_MODIFY_COUNT() { return l_l_h_MODIFY_COUNT; }
	public List getList_l_INSTALL_FLG_name() { return l_l_INSTALL_FLG_name; }
	public List getList_l_INSTALL_FLG_val() { return l_l_INSTALL_FLG_val; }

	public void setl_OPTION_ID(String val) { m_l_OPTION_ID = val; }
	public void setl_OPTION_NAME(String val) { m_l_OPTION_NAME = val; }
	public void setl_INSTALL_FLG(String val) { m_l_INSTALL_FLG = val; }
	public void setl_INSTALL_DATE(String val) { m_l_INSTALL_DATE = val; }
	public void setl_h_INSTALL_FLG(String val) { m_l_h_INSTALL_FLG = val; }
	public void setl_h_INSTALL_DATE(String val) { m_l_h_INSTALL_DATE = val; }
	public void setl_h_MODIFY_COUNT(String val) { m_l_h_MODIFY_COUNT = val; }
	public void setl_INSTALL_FLG_name(String val) { m_l_INSTALL_FLG_name = val; }
	public void setl_INSTALL_FLG_val(String val) { m_l_INSTALL_FLG_val = val; }


	public void setList_l_OPTION_ID(List list) { l_l_OPTION_ID = list; }
	public void setList_l_OPTION_NAME(List list) { l_l_OPTION_NAME = list; }
	public void setList_l_INSTALL_FLG(List list) { l_l_INSTALL_FLG = list; }
	public void setList_l_INSTALL_DATE(List list) { l_l_INSTALL_DATE = list; }
	public void setList_l_h_INSTALL_FLG(List list) { l_l_h_INSTALL_FLG = list; }
	public void setList_l_h_INSTALL_DATE(List list) { l_l_h_INSTALL_DATE = list; }
	public void setList_l_h_MODIFY_COUNT(List list) { l_l_h_MODIFY_COUNT = list; }
	public void setList_l_INSTALL_FLG_name(List list) { l_l_INSTALL_FLG_name = list; }
	public void setList_l_INSTALL_FLG_val(List list) { l_l_INSTALL_FLG_val = list; }

	public int setL2L_l_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPTION_ID == null) {
			l_l_OPTION_ID = new ArrayList();
		} else {
			l_l_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPTION_ID.add(((AN0100010Struct) list.get(i)).getl_OPTION_ID());
		}
		return size;
	}
	public int setL2L_l_OPTION_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPTION_NAME == null) {
			l_l_OPTION_NAME = new ArrayList();
		} else {
			l_l_OPTION_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPTION_NAME.add(((AN0100010Struct) list.get(i)).getl_OPTION_NAME());
		}
		return size;
	}
	public int setL2L_l_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSTALL_FLG == null) {
			l_l_INSTALL_FLG = new ArrayList();
		} else {
			l_l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSTALL_FLG.add(((AN0100010Struct) list.get(i)).getl_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_l_INSTALL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSTALL_DATE == null) {
			l_l_INSTALL_DATE = new ArrayList();
		} else {
			l_l_INSTALL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSTALL_DATE.add(((AN0100010Struct) list.get(i)).getl_INSTALL_DATE());
		}
		return size;
	}
	public int setL2L_l_h_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_INSTALL_FLG == null) {
			l_l_h_INSTALL_FLG = new ArrayList();
		} else {
			l_l_h_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_INSTALL_FLG.add(((AN0100010Struct) list.get(i)).getl_h_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_l_h_INSTALL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_INSTALL_DATE == null) {
			l_l_h_INSTALL_DATE = new ArrayList();
		} else {
			l_l_h_INSTALL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_INSTALL_DATE.add(((AN0100010Struct) list.get(i)).getl_h_INSTALL_DATE());
		}
		return size;
	}
	public int setL2L_l_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_MODIFY_COUNT == null) {
			l_l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_MODIFY_COUNT.add(((AN0100010Struct) list.get(i)).getl_h_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_INSTALL_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSTALL_FLG_name == null) {
			l_l_INSTALL_FLG_name = new ArrayList();
		} else {
			l_l_INSTALL_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSTALL_FLG_name.add(((AN0100010Struct) list.get(i)).getl_INSTALL_FLG_name());
		}
		return size;
	}
	public int setL2L_l_INSTALL_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSTALL_FLG_val == null) {
			l_l_INSTALL_FLG_val = new ArrayList();
		} else {
			l_l_INSTALL_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSTALL_FLG_val.add(((AN0100010Struct) list.get(i)).getl_INSTALL_FLG_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_OPTION_ID = null;
		m_l_OPTION_NAME = null;
		m_l_INSTALL_FLG = null;
		m_l_INSTALL_DATE = null;
		m_l_h_INSTALL_FLG = null;
		m_l_h_INSTALL_DATE = null;
		m_l_h_MODIFY_COUNT = null;
		m_l_INSTALL_FLG_name = null;
		m_l_INSTALL_FLG_val = null;

		l_l_OPTION_ID = null;
		l_l_OPTION_NAME = null;
		l_l_INSTALL_FLG = null;
		l_l_INSTALL_DATE = null;
		l_l_h_INSTALL_FLG = null;
		l_l_h_INSTALL_DATE = null;
		l_l_h_MODIFY_COUNT = null;
		l_l_INSTALL_FLG_name = null;
		l_l_INSTALL_FLG_val = null;

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
	 * medAN0100010クラスの標準コンストラクタ
	 */
	public AN0100010Struct()
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
	public void setStruct(AN0100010Struct struct)
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
	public void setStructM(AN0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_OPTION_ID(struct.getl_OPTION_ID());
			this.setl_OPTION_NAME(struct.getl_OPTION_NAME());
			this.setl_INSTALL_FLG(struct.getl_INSTALL_FLG());
			this.setl_INSTALL_DATE(struct.getl_INSTALL_DATE());
			this.setl_h_INSTALL_FLG(struct.getl_h_INSTALL_FLG());
			this.setl_h_INSTALL_DATE(struct.getl_h_INSTALL_DATE());
			this.setl_h_MODIFY_COUNT(struct.getl_h_MODIFY_COUNT());
			this.setl_INSTALL_FLG_name(struct.getl_INSTALL_FLG_name());
			this.setl_INSTALL_FLG_val(struct.getl_INSTALL_FLG_val());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_OPTION_ID(struct.getList_l_OPTION_ID());
			this.setList_l_OPTION_NAME(struct.getList_l_OPTION_NAME());
			this.setList_l_INSTALL_FLG(struct.getList_l_INSTALL_FLG());
			this.setList_l_INSTALL_DATE(struct.getList_l_INSTALL_DATE());
			this.setList_l_h_INSTALL_FLG(struct.getList_l_h_INSTALL_FLG());
			this.setList_l_h_INSTALL_DATE(struct.getList_l_h_INSTALL_DATE());
			this.setList_l_h_MODIFY_COUNT(struct.getList_l_h_MODIFY_COUNT());
			this.setList_l_INSTALL_FLG_name(struct.getList_l_INSTALL_FLG_name());
			this.setList_l_INSTALL_FLG_val(struct.getList_l_INSTALL_FLG_val());
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
	// 第 1 変数初期値： i_l_OPTION_ID


	final static String i_l_OPTION_ID = null;

	// 第 2 変数初期値： i_l_OPTION_NAME


	final static String i_l_OPTION_NAME = null;

	// 第 3 変数初期値： i_l_INSTALL_FLG


	final static String i_l_INSTALL_FLG = null;

	// 第 4 変数初期値： i_l_INSTALL_DATE


	final static String i_l_INSTALL_DATE = null;

	// 第 5 変数初期値： i_l_h_INSTALL_FLG


	final static String i_l_h_INSTALL_FLG = null;

	// 第 6 変数初期値： i_l_h_INSTALL_DATE


	final static String i_l_h_INSTALL_DATE = null;

	// 第 7 変数初期値： i_l_h_MODIFY_COUNT


	final static String i_l_h_MODIFY_COUNT = null;

	// 第 8 変数初期値： i_l_INSTALL_FLG_name


	final static String i_l_INSTALL_FLG_name = null;

	// 第 9 変数初期値： i_l_INSTALL_FLG_val


	final static String i_l_INSTALL_FLG_val = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_l_OPTION_ID
        final static String i_l_OPTION_ID = null;
        // 第 2 変数初期値： i_l_OPTION_NAME
        final static String i_l_OPTION_NAME = null;
        // 第 3 変数初期値： i_l_INSTALL_FLG
        final static String i_l_INSTALL_FLG = null;
        // 第 4 変数初期値： i_l_INSTALL_DATE
        final static String i_l_INSTALL_DATE = null;
        // 第 5 変数初期値： i_l_h_INSTALL_FLG
        final static String i_l_h_INSTALL_FLG = null;
        // 第 6 変数初期値： i_l_h_INSTALL_DATE
        final static String i_l_h_INSTALL_DATE = null;
        // 第 7 変数初期値： i_l_h_MODIFY_COUNT
        final static String i_l_h_MODIFY_COUNT = null;
        // 第 8 変数初期値： i_l_INSTALL_FLG_name
        final static String i_l_INSTALL_FLG_name = null;
        // 第 9 変数初期値： i_l_INSTALL_FLG_val
        final static String i_l_INSTALL_FLG_val = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_OPTION_ID = i_l_OPTION_ID;
         m_l_OPTION_NAME = i_l_OPTION_NAME;
         m_l_INSTALL_FLG = i_l_INSTALL_FLG;
         m_l_INSTALL_DATE = i_l_INSTALL_DATE;
         m_l_h_INSTALL_FLG = i_l_h_INSTALL_FLG;
         m_l_h_INSTALL_DATE = i_l_h_INSTALL_DATE;
         m_l_h_MODIFY_COUNT = i_l_h_MODIFY_COUNT;
         m_l_INSTALL_FLG_name = i_l_INSTALL_FLG_name;
         m_l_INSTALL_FLG_val = i_l_INSTALL_FLG_val;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
