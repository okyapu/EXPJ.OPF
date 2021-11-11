/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/src/com/nec/jp/orteus/metamorBase/AL0060/AL0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0060;

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

public class AL0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_LOAD_CALC_FROM */
	public String m_LOAD_CALC_FROM = null;
	/** 第 2 変数： m_LOAD_CALC_TO */
	public String m_LOAD_CALC_TO = null;
	/** 第 3 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 4 変数： m_h_LOAD_CALC */
	public String m_h_LOAD_CALC = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_LOAD_CALC_FROM */
	public List l_LOAD_CALC_FROM = null;

	/** 第 2 List変数： l_LOAD_CALC_TO */
	public List l_LOAD_CALC_TO = null;

	/** 第 3 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 4 List変数： l_h_LOAD_CALC */
	public List l_h_LOAD_CALC = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getLOAD_CALC_FROM() { return m_LOAD_CALC_FROM; }
	public String getLOAD_CALC_TO() { return m_LOAD_CALC_TO; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String geth_LOAD_CALC() { return m_h_LOAD_CALC; }

	public List getList_LOAD_CALC_FROM() { return l_LOAD_CALC_FROM; }
	public List getList_LOAD_CALC_TO() { return l_LOAD_CALC_TO; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_h_LOAD_CALC() { return l_h_LOAD_CALC; }

	public void setLOAD_CALC_FROM(String val) { m_LOAD_CALC_FROM = val; }
	public void setLOAD_CALC_TO(String val) { m_LOAD_CALC_TO = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void seth_LOAD_CALC(String val) { m_h_LOAD_CALC = val; }


	public void setList_LOAD_CALC_FROM(List list) { l_LOAD_CALC_FROM = list; }
	public void setList_LOAD_CALC_TO(List list) { l_LOAD_CALC_TO = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_h_LOAD_CALC(List list) { l_h_LOAD_CALC = list; }

	public int setL2L_LOAD_CALC_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_CALC_FROM == null) {
			l_LOAD_CALC_FROM = new ArrayList();
		} else {
			l_LOAD_CALC_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_CALC_FROM.add(((AL0060010Struct) list.get(i)).getLOAD_CALC_FROM());
		}
		return size;
	}
	public int setL2L_LOAD_CALC_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_CALC_TO == null) {
			l_LOAD_CALC_TO = new ArrayList();
		} else {
			l_LOAD_CALC_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_CALC_TO.add(((AL0060010Struct) list.get(i)).getLOAD_CALC_TO());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((AL0060010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_LOAD_CALC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOAD_CALC == null) {
			l_h_LOAD_CALC = new ArrayList();
		} else {
			l_h_LOAD_CALC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOAD_CALC.add(((AL0060010Struct) list.get(i)).geth_LOAD_CALC());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_LOAD_CALC_FROM = null;
		m_LOAD_CALC_TO = null;
		m_h_PLANT_CD = null;
		m_h_LOAD_CALC = null;

		l_LOAD_CALC_FROM = null;
		l_LOAD_CALC_TO = null;
		l_h_PLANT_CD = null;
		l_h_LOAD_CALC = null;

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
	 * medAL0060010クラスの標準コンストラクタ
	 */
	public AL0060010Struct()
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
	public void setStruct(AL0060010Struct struct)
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
	public void setStructM(AL0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setLOAD_CALC_FROM(struct.getLOAD_CALC_FROM());
			this.setLOAD_CALC_TO(struct.getLOAD_CALC_TO());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.seth_LOAD_CALC(struct.geth_LOAD_CALC());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AL0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_LOAD_CALC_FROM(struct.getList_LOAD_CALC_FROM());
			this.setList_LOAD_CALC_TO(struct.getList_LOAD_CALC_TO());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_h_LOAD_CALC(struct.getList_h_LOAD_CALC());
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
	// 第 1 変数初期値： i_LOAD_CALC_FROM


	final static String i_LOAD_CALC_FROM = null;

	// 第 2 変数初期値： i_LOAD_CALC_TO


	final static String i_LOAD_CALC_TO = null;

	// 第 3 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 4 変数初期値： i_h_LOAD_CALC


	final static String i_h_LOAD_CALC = null;

*/

	//{{user_implement_code
        //////////////////////////////
        // 初期値定義
       
         // TODO: 初期化で使う定数は、ここに記述してください。
        /** 第 1 変数初期値： i_LOAD_CALC_FROM */
        final static String i_LOAD_CALC_FROM = null;
        /** 第 2 変数初期値： i_LOAD_CALC_TO */
        final static String i_LOAD_CALC_TO = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
         m_LOAD_CALC_FROM = i_LOAD_CALC_FROM;
         m_LOAD_CALC_TO = i_LOAD_CALC_TO;
       
         l_LOAD_CALC_FROM = null;
         l_LOAD_CALC_TO = null;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
