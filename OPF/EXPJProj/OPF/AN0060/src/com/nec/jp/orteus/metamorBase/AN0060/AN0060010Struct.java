/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0060/src/com/nec/jp/orteus/metamorBase/AN0060/AN0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0060;

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

public class AN0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rowSelected */
	public String m_rowSelected = null;
	/** 第 2 変数： m_l_VALUE */
	public String m_l_VALUE = null;
	/** 第 3 変数： m_l_DISPLAY_NAME */
	public String m_l_DISPLAY_NAME = null;
	/** 第 4 変数： m_l_h_DISPLAY_NAME */
	public String m_l_h_DISPLAY_NAME = null;
	/** 第 5 変数： m_l_h_CHANGEABLE_TYP */
	public String m_l_h_CHANGEABLE_TYP = null;
	/** 第 6 変数： m_l_h_MODIFY_COUNT */
	public String m_l_h_MODIFY_COUNT = null;
	/** 第 7 変数： m_TYPE_CD */
	public String m_TYPE_CD = null;
	/** 第 8 変数： m_TYPE_NAME */
	public String m_TYPE_NAME = null;
	/** 第 9 変数： m_h_TYPE_NAME */
	public String m_h_TYPE_NAME = null;
	/** 第 10 変数： m_h_INSERTABLE_TYP */
	public String m_h_INSERTABLE_TYP = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rowSelected */
	public List l_rowSelected = null;

	/** 第 2 List変数： l_l_VALUE */
	public List l_l_VALUE = null;

	/** 第 3 List変数： l_l_DISPLAY_NAME */
	public List l_l_DISPLAY_NAME = null;

	/** 第 4 List変数： l_l_h_DISPLAY_NAME */
	public List l_l_h_DISPLAY_NAME = null;

	/** 第 5 List変数： l_l_h_CHANGEABLE_TYP */
	public List l_l_h_CHANGEABLE_TYP = null;

	/** 第 6 List変数： l_l_h_MODIFY_COUNT */
	public List l_l_h_MODIFY_COUNT = null;

	/** 第 7 List変数： l_TYPE_CD */
	public List l_TYPE_CD = null;

	/** 第 8 List変数： l_TYPE_NAME */
	public List l_TYPE_NAME = null;

	/** 第 9 List変数： l_h_TYPE_NAME */
	public List l_h_TYPE_NAME = null;

	/** 第 10 List変数： l_h_INSERTABLE_TYP */
	public List l_h_INSERTABLE_TYP = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrowSelected() { return m_rowSelected; }
	public String getl_VALUE() { return m_l_VALUE; }
	public String getl_DISPLAY_NAME() { return m_l_DISPLAY_NAME; }
	public String getl_h_DISPLAY_NAME() { return m_l_h_DISPLAY_NAME; }
	public String getl_h_CHANGEABLE_TYP() { return m_l_h_CHANGEABLE_TYP; }
	public String getl_h_MODIFY_COUNT() { return m_l_h_MODIFY_COUNT; }
	public String getTYPE_CD() { return m_TYPE_CD; }
	public String getTYPE_NAME() { return m_TYPE_NAME; }
	public String geth_TYPE_NAME() { return m_h_TYPE_NAME; }
	public String geth_INSERTABLE_TYP() { return m_h_INSERTABLE_TYP; }

	public List getList_rowSelected() { return l_rowSelected; }
	public List getList_l_VALUE() { return l_l_VALUE; }
	public List getList_l_DISPLAY_NAME() { return l_l_DISPLAY_NAME; }
	public List getList_l_h_DISPLAY_NAME() { return l_l_h_DISPLAY_NAME; }
	public List getList_l_h_CHANGEABLE_TYP() { return l_l_h_CHANGEABLE_TYP; }
	public List getList_l_h_MODIFY_COUNT() { return l_l_h_MODIFY_COUNT; }
	public List getList_TYPE_CD() { return l_TYPE_CD; }
	public List getList_TYPE_NAME() { return l_TYPE_NAME; }
	public List getList_h_TYPE_NAME() { return l_h_TYPE_NAME; }
	public List getList_h_INSERTABLE_TYP() { return l_h_INSERTABLE_TYP; }

	public void setrowSelected(String val) { m_rowSelected = val; }
	public void setl_VALUE(String val) { m_l_VALUE = val; }
	public void setl_DISPLAY_NAME(String val) { m_l_DISPLAY_NAME = val; }
	public void setl_h_DISPLAY_NAME(String val) { m_l_h_DISPLAY_NAME = val; }
	public void setl_h_CHANGEABLE_TYP(String val) { m_l_h_CHANGEABLE_TYP = val; }
	public void setl_h_MODIFY_COUNT(String val) { m_l_h_MODIFY_COUNT = val; }
	public void setTYPE_CD(String val) { m_TYPE_CD = val; }
	public void setTYPE_NAME(String val) { m_TYPE_NAME = val; }
	public void seth_TYPE_NAME(String val) { m_h_TYPE_NAME = val; }
	public void seth_INSERTABLE_TYP(String val) { m_h_INSERTABLE_TYP = val; }


	public void setList_rowSelected(List list) { l_rowSelected = list; }
	public void setList_l_VALUE(List list) { l_l_VALUE = list; }
	public void setList_l_DISPLAY_NAME(List list) { l_l_DISPLAY_NAME = list; }
	public void setList_l_h_DISPLAY_NAME(List list) { l_l_h_DISPLAY_NAME = list; }
	public void setList_l_h_CHANGEABLE_TYP(List list) { l_l_h_CHANGEABLE_TYP = list; }
	public void setList_l_h_MODIFY_COUNT(List list) { l_l_h_MODIFY_COUNT = list; }
	public void setList_TYPE_CD(List list) { l_TYPE_CD = list; }
	public void setList_TYPE_NAME(List list) { l_TYPE_NAME = list; }
	public void setList_h_TYPE_NAME(List list) { l_h_TYPE_NAME = list; }
	public void setList_h_INSERTABLE_TYP(List list) { l_h_INSERTABLE_TYP = list; }

	public int setL2L_rowSelected(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rowSelected == null) {
			l_rowSelected = new ArrayList();
		} else {
			l_rowSelected.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rowSelected.add(((AN0060010Struct) list.get(i)).getrowSelected());
		}
		return size;
	}
	public int setL2L_l_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VALUE == null) {
			l_l_VALUE = new ArrayList();
		} else {
			l_l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VALUE.add(((AN0060010Struct) list.get(i)).getl_VALUE());
		}
		return size;
	}
	public int setL2L_l_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISPLAY_NAME == null) {
			l_l_DISPLAY_NAME = new ArrayList();
		} else {
			l_l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISPLAY_NAME.add(((AN0060010Struct) list.get(i)).getl_DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_l_h_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_DISPLAY_NAME == null) {
			l_l_h_DISPLAY_NAME = new ArrayList();
		} else {
			l_l_h_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_DISPLAY_NAME.add(((AN0060010Struct) list.get(i)).getl_h_DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_l_h_CHANGEABLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_CHANGEABLE_TYP == null) {
			l_l_h_CHANGEABLE_TYP = new ArrayList();
		} else {
			l_l_h_CHANGEABLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_CHANGEABLE_TYP.add(((AN0060010Struct) list.get(i)).getl_h_CHANGEABLE_TYP());
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
			l_l_h_MODIFY_COUNT.add(((AN0060010Struct) list.get(i)).getl_h_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_TYPE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYPE_CD == null) {
			l_TYPE_CD = new ArrayList();
		} else {
			l_TYPE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYPE_CD.add(((AN0060010Struct) list.get(i)).getTYPE_CD());
		}
		return size;
	}
	public int setL2L_TYPE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYPE_NAME == null) {
			l_TYPE_NAME = new ArrayList();
		} else {
			l_TYPE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYPE_NAME.add(((AN0060010Struct) list.get(i)).getTYPE_NAME());
		}
		return size;
	}
	public int setL2L_h_TYPE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TYPE_NAME == null) {
			l_h_TYPE_NAME = new ArrayList();
		} else {
			l_h_TYPE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TYPE_NAME.add(((AN0060010Struct) list.get(i)).geth_TYPE_NAME());
		}
		return size;
	}
	public int setL2L_h_INSERTABLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSERTABLE_TYP == null) {
			l_h_INSERTABLE_TYP = new ArrayList();
		} else {
			l_h_INSERTABLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSERTABLE_TYP.add(((AN0060010Struct) list.get(i)).geth_INSERTABLE_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rowSelected = null;
		m_l_VALUE = null;
		m_l_DISPLAY_NAME = null;
		m_l_h_DISPLAY_NAME = null;
		m_l_h_CHANGEABLE_TYP = null;
		m_l_h_MODIFY_COUNT = null;
		m_TYPE_CD = null;
		m_TYPE_NAME = null;
		m_h_TYPE_NAME = null;
		m_h_INSERTABLE_TYP = null;

		l_rowSelected = null;
		l_l_VALUE = null;
		l_l_DISPLAY_NAME = null;
		l_l_h_DISPLAY_NAME = null;
		l_l_h_CHANGEABLE_TYP = null;
		l_l_h_MODIFY_COUNT = null;
		l_TYPE_CD = null;
		l_TYPE_NAME = null;
		l_h_TYPE_NAME = null;
		l_h_INSERTABLE_TYP = null;

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
	 * medAN0060010クラスの標準コンストラクタ
	 */
	public AN0060010Struct()
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
	public void setStruct(AN0060010Struct struct)
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
	public void setStructM(AN0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrowSelected(struct.getrowSelected());
			this.setl_VALUE(struct.getl_VALUE());
			this.setl_DISPLAY_NAME(struct.getl_DISPLAY_NAME());
			this.setl_h_DISPLAY_NAME(struct.getl_h_DISPLAY_NAME());
			this.setl_h_CHANGEABLE_TYP(struct.getl_h_CHANGEABLE_TYP());
			this.setl_h_MODIFY_COUNT(struct.getl_h_MODIFY_COUNT());
			this.setTYPE_CD(struct.getTYPE_CD());
			this.setTYPE_NAME(struct.getTYPE_NAME());
			this.seth_TYPE_NAME(struct.geth_TYPE_NAME());
			this.seth_INSERTABLE_TYP(struct.geth_INSERTABLE_TYP());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rowSelected(struct.getList_rowSelected());
			this.setList_l_VALUE(struct.getList_l_VALUE());
			this.setList_l_DISPLAY_NAME(struct.getList_l_DISPLAY_NAME());
			this.setList_l_h_DISPLAY_NAME(struct.getList_l_h_DISPLAY_NAME());
			this.setList_l_h_CHANGEABLE_TYP(struct.getList_l_h_CHANGEABLE_TYP());
			this.setList_l_h_MODIFY_COUNT(struct.getList_l_h_MODIFY_COUNT());
			this.setList_TYPE_CD(struct.getList_TYPE_CD());
			this.setList_TYPE_NAME(struct.getList_TYPE_NAME());
			this.setList_h_TYPE_NAME(struct.getList_h_TYPE_NAME());
			this.setList_h_INSERTABLE_TYP(struct.getList_h_INSERTABLE_TYP());
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
	// 第 1 変数初期値： i_rowSelected


	final static String i_rowSelected = null;

	// 第 2 変数初期値： i_l_VALUE


	final static String i_l_VALUE = null;

	// 第 3 変数初期値： i_l_DISPLAY_NAME


	final static String i_l_DISPLAY_NAME = null;

	// 第 4 変数初期値： i_l_h_DISPLAY_NAME


	final static String i_l_h_DISPLAY_NAME = null;

	// 第 5 変数初期値： i_l_h_CHANGEABLE_TYP


	final static String i_l_h_CHANGEABLE_TYP = null;

	// 第 6 変数初期値： i_l_h_MODIFY_COUNT


	final static String i_l_h_MODIFY_COUNT = null;

	// 第 7 変数初期値： i_TYPE_CD


	final static String i_TYPE_CD = null;

	// 第 8 変数初期値： i_TYPE_NAME


	final static String i_TYPE_NAME = null;

	// 第 9 変数初期値： i_h_TYPE_NAME


	final static String i_h_TYPE_NAME = null;

	// 第 10 変数初期値： i_h_INSERTABLE_TYP


	final static String i_h_INSERTABLE_TYP = null;

*/

	//{{user_implement_code
       
        // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_l_VALUE
        final static String i_l_VALUE = null;
        // 第 2 変数初期値： i_l_DISPLAY_NAME
        final static String i_l_DISPLAY_NAME = null;
        // 第 3 変数初期値： i_l_h_DISPLAY_NAME
        final static String i_l_h_DISPLAY_NAME = null;
        // 第 4 変数初期値： i_l_h_CHANGEABLE_TYP
        final static String i_l_h_CHANGEABLE_TYP = null;
        // 第 5 変数初期値： i_l_h_MODIFY_COUNT
        final static String i_l_h_MODIFY_COUNT = null;
        // 第 6 変数初期値： i_TYPE_CD
        final static String i_TYPE_CD = null;
        // 第 7 変数初期値： i_TYPE_NAME
        final static String i_TYPE_NAME = null;
        // 第 8 変数初期値： i_h_TYPE_NAME
        final static String i_h_TYPE_NAME = null;
        // 第 9 変数初期値： i_h_INSERTABLE_TYP
        final static String i_h_INSERTABLE_TYP = null;
        // 第 10 変数初期値： i_rowSelected
        final static String i_rowSelected = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_VALUE = i_l_VALUE;
         m_l_DISPLAY_NAME = i_l_DISPLAY_NAME;
         m_l_h_DISPLAY_NAME = i_l_h_DISPLAY_NAME;
         m_l_h_CHANGEABLE_TYP = i_l_h_CHANGEABLE_TYP;
         m_l_h_MODIFY_COUNT = i_l_h_MODIFY_COUNT;
         m_TYPE_CD = i_TYPE_CD;
         m_TYPE_NAME = i_TYPE_NAME;
         m_h_TYPE_NAME = i_h_TYPE_NAME;
         m_h_INSERTABLE_TYP = i_h_INSERTABLE_TYP;
         m_rowSelected = i_rowSelected;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
