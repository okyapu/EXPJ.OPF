/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0050/src/com/nec/jp/orteus/metamorBase/AN0050/AN0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0050;

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

public class AN0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_MAX_DISPLAY_ROWNUM */
	public String m_h_MAX_DISPLAY_ROWNUM = null;
	/** 第 2 変数： m_l_SERVLET_CD */
	public String m_l_SERVLET_CD = null;
	/** 第 3 変数： m_l_DISPLAY_CD */
	public String m_l_DISPLAY_CD = null;
	/** 第 4 変数： m_MAX_DISPLAY_ROWNUM */
	public String m_MAX_DISPLAY_ROWNUM = null;
	/** 第 5 変数： m_SCREEN_COMMENT */
	public String m_SCREEN_COMMENT = null;
	/** 第 6 変数： m_SCREEN_COMMENT_EN */
	public String m_SCREEN_COMMENT_EN = null;
	/** 第 7 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 8 変数： m_SERVLET_CD */
	public String m_SERVLET_CD = null;
	/** 第 9 変数： m_DISPLAY_CD */
	public String m_DISPLAY_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_MAX_DISPLAY_ROWNUM */
	public List l_h_MAX_DISPLAY_ROWNUM = null;

	/** 第 2 List変数： l_l_SERVLET_CD */
	public List l_l_SERVLET_CD = null;

	/** 第 3 List変数： l_l_DISPLAY_CD */
	public List l_l_DISPLAY_CD = null;

	/** 第 4 List変数： l_MAX_DISPLAY_ROWNUM */
	public List l_MAX_DISPLAY_ROWNUM = null;

	/** 第 5 List変数： l_SCREEN_COMMENT */
	public List l_SCREEN_COMMENT = null;

	/** 第 6 List変数： l_SCREEN_COMMENT_EN */
	public List l_SCREEN_COMMENT_EN = null;

	/** 第 7 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 8 List変数： l_SERVLET_CD */
	public List l_SERVLET_CD = null;

	/** 第 9 List変数： l_DISPLAY_CD */
	public List l_DISPLAY_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_MAX_DISPLAY_ROWNUM() { return m_h_MAX_DISPLAY_ROWNUM; }
	public String getl_SERVLET_CD() { return m_l_SERVLET_CD; }
	public String getl_DISPLAY_CD() { return m_l_DISPLAY_CD; }
	public String getMAX_DISPLAY_ROWNUM() { return m_MAX_DISPLAY_ROWNUM; }
	public String getSCREEN_COMMENT() { return m_SCREEN_COMMENT; }
	public String getSCREEN_COMMENT_EN() { return m_SCREEN_COMMENT_EN; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getSERVLET_CD() { return m_SERVLET_CD; }
	public String getDISPLAY_CD() { return m_DISPLAY_CD; }

	public List getList_h_MAX_DISPLAY_ROWNUM() { return l_h_MAX_DISPLAY_ROWNUM; }
	public List getList_l_SERVLET_CD() { return l_l_SERVLET_CD; }
	public List getList_l_DISPLAY_CD() { return l_l_DISPLAY_CD; }
	public List getList_MAX_DISPLAY_ROWNUM() { return l_MAX_DISPLAY_ROWNUM; }
	public List getList_SCREEN_COMMENT() { return l_SCREEN_COMMENT; }
	public List getList_SCREEN_COMMENT_EN() { return l_SCREEN_COMMENT_EN; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_SERVLET_CD() { return l_SERVLET_CD; }
	public List getList_DISPLAY_CD() { return l_DISPLAY_CD; }

	public void seth_MAX_DISPLAY_ROWNUM(String val) { m_h_MAX_DISPLAY_ROWNUM = val; }
	public void setl_SERVLET_CD(String val) { m_l_SERVLET_CD = val; }
	public void setl_DISPLAY_CD(String val) { m_l_DISPLAY_CD = val; }
	public void setMAX_DISPLAY_ROWNUM(String val) { m_MAX_DISPLAY_ROWNUM = val; }
	public void setSCREEN_COMMENT(String val) { m_SCREEN_COMMENT = val; }
	public void setSCREEN_COMMENT_EN(String val) { m_SCREEN_COMMENT_EN = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setSERVLET_CD(String val) { m_SERVLET_CD = val; }
	public void setDISPLAY_CD(String val) { m_DISPLAY_CD = val; }


	public void setList_h_MAX_DISPLAY_ROWNUM(List list) { l_h_MAX_DISPLAY_ROWNUM = list; }
	public void setList_l_SERVLET_CD(List list) { l_l_SERVLET_CD = list; }
	public void setList_l_DISPLAY_CD(List list) { l_l_DISPLAY_CD = list; }
	public void setList_MAX_DISPLAY_ROWNUM(List list) { l_MAX_DISPLAY_ROWNUM = list; }
	public void setList_SCREEN_COMMENT(List list) { l_SCREEN_COMMENT = list; }
	public void setList_SCREEN_COMMENT_EN(List list) { l_SCREEN_COMMENT_EN = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_SERVLET_CD(List list) { l_SERVLET_CD = list; }
	public void setList_DISPLAY_CD(List list) { l_DISPLAY_CD = list; }

	public int setL2L_h_MAX_DISPLAY_ROWNUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MAX_DISPLAY_ROWNUM == null) {
			l_h_MAX_DISPLAY_ROWNUM = new ArrayList();
		} else {
			l_h_MAX_DISPLAY_ROWNUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MAX_DISPLAY_ROWNUM.add(((AN0050010Struct) list.get(i)).geth_MAX_DISPLAY_ROWNUM());
		}
		return size;
	}
	public int setL2L_l_SERVLET_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SERVLET_CD == null) {
			l_l_SERVLET_CD = new ArrayList();
		} else {
			l_l_SERVLET_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SERVLET_CD.add(((AN0050010Struct) list.get(i)).getl_SERVLET_CD());
		}
		return size;
	}
	public int setL2L_l_DISPLAY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISPLAY_CD == null) {
			l_l_DISPLAY_CD = new ArrayList();
		} else {
			l_l_DISPLAY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISPLAY_CD.add(((AN0050010Struct) list.get(i)).getl_DISPLAY_CD());
		}
		return size;
	}
	public int setL2L_MAX_DISPLAY_ROWNUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_DISPLAY_ROWNUM == null) {
			l_MAX_DISPLAY_ROWNUM = new ArrayList();
		} else {
			l_MAX_DISPLAY_ROWNUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_DISPLAY_ROWNUM.add(((AN0050010Struct) list.get(i)).getMAX_DISPLAY_ROWNUM());
		}
		return size;
	}
	public int setL2L_SCREEN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCREEN_COMMENT == null) {
			l_SCREEN_COMMENT = new ArrayList();
		} else {
			l_SCREEN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCREEN_COMMENT.add(((AN0050010Struct) list.get(i)).getSCREEN_COMMENT());
		}
		return size;
	}
	public int setL2L_SCREEN_COMMENT_EN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCREEN_COMMENT_EN == null) {
			l_SCREEN_COMMENT_EN = new ArrayList();
		} else {
			l_SCREEN_COMMENT_EN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCREEN_COMMENT_EN.add(((AN0050010Struct) list.get(i)).getSCREEN_COMMENT_EN());
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
			l_h_MODIFY_COUNT.add(((AN0050010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_SERVLET_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVLET_CD == null) {
			l_SERVLET_CD = new ArrayList();
		} else {
			l_SERVLET_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVLET_CD.add(((AN0050010Struct) list.get(i)).getSERVLET_CD());
		}
		return size;
	}
	public int setL2L_DISPLAY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_CD == null) {
			l_DISPLAY_CD = new ArrayList();
		} else {
			l_DISPLAY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_CD.add(((AN0050010Struct) list.get(i)).getDISPLAY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_MAX_DISPLAY_ROWNUM = null;
		m_l_SERVLET_CD = null;
		m_l_DISPLAY_CD = null;
		m_MAX_DISPLAY_ROWNUM = null;
		m_SCREEN_COMMENT = null;
		m_SCREEN_COMMENT_EN = null;
		m_h_MODIFY_COUNT = null;
		m_SERVLET_CD = null;
		m_DISPLAY_CD = null;

		l_h_MAX_DISPLAY_ROWNUM = null;
		l_l_SERVLET_CD = null;
		l_l_DISPLAY_CD = null;
		l_MAX_DISPLAY_ROWNUM = null;
		l_SCREEN_COMMENT = null;
		l_SCREEN_COMMENT_EN = null;
		l_h_MODIFY_COUNT = null;
		l_SERVLET_CD = null;
		l_DISPLAY_CD = null;

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
	 * medAN0050010クラスの標準コンストラクタ
	 */
	public AN0050010Struct()
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
	public void setStruct(AN0050010Struct struct)
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
	public void setStructM(AN0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_MAX_DISPLAY_ROWNUM(struct.geth_MAX_DISPLAY_ROWNUM());
			this.setl_SERVLET_CD(struct.getl_SERVLET_CD());
			this.setl_DISPLAY_CD(struct.getl_DISPLAY_CD());
			this.setMAX_DISPLAY_ROWNUM(struct.getMAX_DISPLAY_ROWNUM());
			this.setSCREEN_COMMENT(struct.getSCREEN_COMMENT());
			this.setSCREEN_COMMENT_EN(struct.getSCREEN_COMMENT_EN());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setSERVLET_CD(struct.getSERVLET_CD());
			this.setDISPLAY_CD(struct.getDISPLAY_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_MAX_DISPLAY_ROWNUM(struct.getList_h_MAX_DISPLAY_ROWNUM());
			this.setList_l_SERVLET_CD(struct.getList_l_SERVLET_CD());
			this.setList_l_DISPLAY_CD(struct.getList_l_DISPLAY_CD());
			this.setList_MAX_DISPLAY_ROWNUM(struct.getList_MAX_DISPLAY_ROWNUM());
			this.setList_SCREEN_COMMENT(struct.getList_SCREEN_COMMENT());
			this.setList_SCREEN_COMMENT_EN(struct.getList_SCREEN_COMMENT_EN());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_SERVLET_CD(struct.getList_SERVLET_CD());
			this.setList_DISPLAY_CD(struct.getList_DISPLAY_CD());
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
	// 第 1 変数初期値： i_h_MAX_DISPLAY_ROWNUM


	final static String i_h_MAX_DISPLAY_ROWNUM = null;

	// 第 2 変数初期値： i_l_SERVLET_CD


	final static String i_l_SERVLET_CD = null;

	// 第 3 変数初期値： i_l_DISPLAY_CD


	final static String i_l_DISPLAY_CD = null;

	// 第 4 変数初期値： i_MAX_DISPLAY_ROWNUM


	final static String i_MAX_DISPLAY_ROWNUM = null;

	// 第 5 変数初期値： i_SCREEN_COMMENT


	final static String i_SCREEN_COMMENT = null;

	// 第 6 変数初期値： i_SCREEN_COMMENT_EN


	final static String i_SCREEN_COMMENT_EN = null;

	// 第 7 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 8 変数初期値： i_SERVLET_CD


	final static String i_SERVLET_CD = null;

	// 第 9 変数初期値： i_DISPLAY_CD


	final static String i_DISPLAY_CD = null;

*/

	//{{user_implement_code
       
        // 第 1 変数初期値： i_l_SERVLET_CD
        final static String i_l_SERVLET_CD = null;
        // 第 2 変数初期値： i_l_DISPLAY_CD
        final static String i_l_DISPLAY_CD = null;
        // 第 3 変数初期値： i_MAX_DISPLAY_ROWNUM
        final static String i_MAX_DISPLAY_ROWNUM = null;
        // 第 4 変数初期値： i_SCREEN_COMMENT
        final static String i_SCREEN_COMMENT = null;
        // 第 5 変数初期値： i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // 第 6 変数初期値： i_SERVLET_CD
        final static String i_SERVLET_CD = null;
        // 第 7 変数初期値： i_DISPLAY_CD
        final static String i_DISPLAY_CD = null;
        // 第 8 変数初期値： i_h_MAX_DISPLAY_ROWNUM
        final static String i_h_MAX_DISPLAY_ROWNUM = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
         m_l_SERVLET_CD = i_l_SERVLET_CD;
         m_l_DISPLAY_CD = i_l_DISPLAY_CD;
         m_MAX_DISPLAY_ROWNUM = i_MAX_DISPLAY_ROWNUM;
         m_SCREEN_COMMENT = i_SCREEN_COMMENT;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_SERVLET_CD = i_SERVLET_CD;
         m_DISPLAY_CD = i_DISPLAY_CD;
         m_h_MAX_DISPLAY_ROWNUM = i_h_MAX_DISPLAY_ROWNUM;
       
         l_l_SERVLET_CD = null;
         l_l_DISPLAY_CD = null;
         l_MAX_DISPLAY_ROWNUM = null;
         l_SCREEN_COMMENT = null;
         l_h_MODIFY_COUNT = null;
         l_SERVLET_CD = null;
         l_DISPLAY_CD = null;
         l_h_MAX_DISPLAY_ROWNUM = null;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
