/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0110/src/com/nec/jp/orteus/metamorBase/AA0110/AA0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0110;

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

public class AA0110010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_CUR_CD */
	public String m_h_CUR_CD = null;
	/** 第 2 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 3 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 4 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 5 変数： m_CUR_SYMBOL */
	public String m_CUR_SYMBOL = null;
	/** 第 6 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 7 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_CUR_CD */
	public List l_h_CUR_CD = null;

	/** 第 2 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 3 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 4 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 5 List変数： l_CUR_SYMBOL */
	public List l_CUR_SYMBOL = null;

	/** 第 6 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 7 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_CUR_CD() { return m_h_CUR_CD; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCUR_SYMBOL() { return m_CUR_SYMBOL; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }

	public List getList_h_CUR_CD() { return l_h_CUR_CD; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CUR_SYMBOL() { return l_CUR_SYMBOL; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }

	public void seth_CUR_CD(String val) { m_h_CUR_CD = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCUR_SYMBOL(String val) { m_CUR_SYMBOL = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }


	public void setList_h_CUR_CD(List list) { l_h_CUR_CD = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CUR_SYMBOL(List list) { l_CUR_SYMBOL = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }

	public int setL2L_h_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUR_CD == null) {
			l_h_CUR_CD = new ArrayList();
		} else {
			l_h_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUR_CD.add(((AA0110010Struct) list.get(i)).geth_CUR_CD());
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
			l_CUR_CD.add(((AA0110010Struct) list.get(i)).getCUR_CD());
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
			l_CUR_UNIT.add(((AA0110010Struct) list.get(i)).getCUR_UNIT());
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
			l_CUR_NAME.add(((AA0110010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_CUR_SYMBOL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_SYMBOL == null) {
			l_CUR_SYMBOL = new ArrayList();
		} else {
			l_CUR_SYMBOL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_SYMBOL.add(((AA0110010Struct) list.get(i)).getCUR_SYMBOL());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AA0110010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_MODIFY_COUNT.add(((AA0110010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_CUR_CD = null;
		m_CUR_CD = null;
		m_CUR_UNIT = null;
		m_CUR_NAME = null;
		m_CUR_SYMBOL = null;
		m_DECIMAL_FIG = null;
		m_MODIFY_COUNT = null;

		l_h_CUR_CD = null;
		l_CUR_CD = null;
		l_CUR_UNIT = null;
		l_CUR_NAME = null;
		l_CUR_SYMBOL = null;
		l_DECIMAL_FIG = null;
		l_MODIFY_COUNT = null;

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
	 * medAA0110010クラスの標準コンストラクタ
	 */
	public AA0110010Struct()
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
	public void setStruct(AA0110010Struct struct)
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
	public void setStructM(AA0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_CUR_CD(struct.geth_CUR_CD());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCUR_SYMBOL(struct.getCUR_SYMBOL());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_CUR_CD(struct.getList_h_CUR_CD());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CUR_SYMBOL(struct.getList_CUR_SYMBOL());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
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
	// 第 1 変数初期値： i_h_CUR_CD


	final static String i_h_CUR_CD = null;

	// 第 2 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 3 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 4 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 5 変数初期値： i_CUR_SYMBOL


	final static String i_CUR_SYMBOL = null;

	// 第 6 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 7 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_CUR_CD
        final static String i_CUR_CD = null;
        // 第 2 変数初期値： i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // 第 3 変数初期値： i_CUR_NAME
        final static String i_CUR_NAME = null;
        // 第 4 変数初期値： i_CUR_SYMBOL
        final static String i_CUR_SYMBOL = null;
        // 第 5 変数初期値： i_DECIMAL_FIG
        final static String i_DECIMAL_FIG = null;
        // 第 6 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 7 変数初期値： i_h_CUR_CD
        final static String i_h_CUR_CD = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CUR_CD = i_CUR_CD;
         m_CUR_UNIT = i_CUR_UNIT;
         m_CUR_NAME = i_CUR_NAME;
         m_CUR_SYMBOL = i_CUR_SYMBOL;
         m_DECIMAL_FIG = i_DECIMAL_FIG;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_h_CUR_CD = i_h_CUR_CD;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
