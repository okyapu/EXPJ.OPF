/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

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

public class AH0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 2 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 3 変数： m_h_RADIO_TYPE */
	public String m_h_RADIO_TYPE = null;
	/** 第 4 変数： m_r_PLANT_TYPE1 */
	public String m_r_PLANT_TYPE1 = null;
	/** 第 5 変数： m_r_PLANT_TYPE2 */
	public String m_r_PLANT_TYPE2 = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 2 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 3 List変数： l_h_RADIO_TYPE */
	public List l_h_RADIO_TYPE = null;

	/** 第 4 List変数： l_r_PLANT_TYPE1 */
	public List l_r_PLANT_TYPE1 = null;

	/** 第 5 List変数： l_r_PLANT_TYPE2 */
	public List l_r_PLANT_TYPE2 = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String geth_RADIO_TYPE() { return m_h_RADIO_TYPE; }
	public String getr_PLANT_TYPE1() { return m_r_PLANT_TYPE1; }
	public String getr_PLANT_TYPE2() { return m_r_PLANT_TYPE2; }

	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_h_RADIO_TYPE() { return l_h_RADIO_TYPE; }
	public List getList_r_PLANT_TYPE1() { return l_r_PLANT_TYPE1; }
	public List getList_r_PLANT_TYPE2() { return l_r_PLANT_TYPE2; }

	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void seth_RADIO_TYPE(String val) { m_h_RADIO_TYPE = val; }
	public void setr_PLANT_TYPE1(String val) { m_r_PLANT_TYPE1 = val; }
	public void setr_PLANT_TYPE2(String val) { m_r_PLANT_TYPE2 = val; }


	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_h_RADIO_TYPE(List list) { l_h_RADIO_TYPE = list; }
	public void setList_r_PLANT_TYPE1(List list) { l_r_PLANT_TYPE1 = list; }
	public void setList_r_PLANT_TYPE2(List list) { l_r_PLANT_TYPE2 = list; }

	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AH0010010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_CD == null) {
			l_PLANT_CD = new ArrayList();
		} else {
			l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_CD.add(((AH0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_h_RADIO_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RADIO_TYPE == null) {
			l_h_RADIO_TYPE = new ArrayList();
		} else {
			l_h_RADIO_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RADIO_TYPE.add(((AH0010010Struct) list.get(i)).geth_RADIO_TYPE());
		}
		return size;
	}
	public int setL2L_r_PLANT_TYPE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT_TYPE1 == null) {
			l_r_PLANT_TYPE1 = new ArrayList();
		} else {
			l_r_PLANT_TYPE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT_TYPE1.add(((AH0010010Struct) list.get(i)).getr_PLANT_TYPE1());
		}
		return size;
	}
	public int setL2L_r_PLANT_TYPE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT_TYPE2 == null) {
			l_r_PLANT_TYPE2 = new ArrayList();
		} else {
			l_r_PLANT_TYPE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT_TYPE2.add(((AH0010010Struct) list.get(i)).getr_PLANT_TYPE2());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_h_RADIO_TYPE = null;
		m_r_PLANT_TYPE1 = null;
		m_r_PLANT_TYPE2 = null;

		l_ITEM_CD = null;
		l_PLANT_CD = null;
		l_h_RADIO_TYPE = null;
		l_r_PLANT_TYPE1 = null;
		l_r_PLANT_TYPE2 = null;

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
	 * medAH0010010クラスの標準コンストラクタ
	 */
	public AH0010010Struct()
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
	public void setStruct(AH0010010Struct struct)
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
	public void setStructM(AH0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setITEM_CD(struct.getITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.seth_RADIO_TYPE(struct.geth_RADIO_TYPE());
			this.setr_PLANT_TYPE1(struct.getr_PLANT_TYPE1());
			this.setr_PLANT_TYPE2(struct.getr_PLANT_TYPE2());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AH0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_h_RADIO_TYPE(struct.getList_h_RADIO_TYPE());
			this.setList_r_PLANT_TYPE1(struct.getList_r_PLANT_TYPE1());
			this.setList_r_PLANT_TYPE2(struct.getList_r_PLANT_TYPE2());
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
	// 第 1 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 2 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 3 変数初期値： i_h_RADIO_TYPE


	final static String i_h_RADIO_TYPE = null;

	// 第 4 変数初期値： i_r_PLANT_TYPE1


	final static String i_r_PLANT_TYPE1 = null;

	// 第 5 変数初期値： i_r_PLANT_TYPE2


	final static String i_r_PLANT_TYPE2 = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------------------
       
        /**
         * 初期化
         */
        public void init()
        {
         m_h_RADIO_TYPE = "1";
         m_r_PLANT_TYPE1 = null;		// ラジオ初期選択値（全工場）
         m_r_PLANT_TYPE2 = "true";	// ラジオ初期選択値（自工場）
        }
         
        //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
