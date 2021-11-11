/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0030/src/com/nec/jp/orteus/metamorBase/AN0030/AN0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0030;

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

public class AN0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_MNT_PERIOD */
	public String m_h_MNT_PERIOD = null;
	/** 第 2 変数： m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** 第 3 変数： m_h_MNT_DATA_TYP */
	public String m_h_MNT_DATA_TYP = null;
	/** 第 4 変数： m_MNT_PERIOD */
	public String m_MNT_PERIOD = null;
	/** 第 5 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 6 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 7 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_MNT_PERIOD */
	public List l_h_MNT_PERIOD = null;

	/** 第 2 List変数： l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** 第 3 List変数： l_h_MNT_DATA_TYP */
	public List l_h_MNT_DATA_TYP = null;

	/** 第 4 List変数： l_MNT_PERIOD */
	public List l_MNT_PERIOD = null;

	/** 第 5 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 6 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 7 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_MNT_PERIOD() { return m_h_MNT_PERIOD; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String geth_MNT_DATA_TYP() { return m_h_MNT_DATA_TYP; }
	public String getMNT_PERIOD() { return m_MNT_PERIOD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }

	public List getList_h_MNT_PERIOD() { return l_h_MNT_PERIOD; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_h_MNT_DATA_TYP() { return l_h_MNT_DATA_TYP; }
	public List getList_MNT_PERIOD() { return l_MNT_PERIOD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }

	public void seth_MNT_PERIOD(String val) { m_h_MNT_PERIOD = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void seth_MNT_DATA_TYP(String val) { m_h_MNT_DATA_TYP = val; }
	public void setMNT_PERIOD(String val) { m_MNT_PERIOD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }


	public void setList_h_MNT_PERIOD(List list) { l_h_MNT_PERIOD = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_h_MNT_DATA_TYP(List list) { l_h_MNT_DATA_TYP = list; }
	public void setList_MNT_PERIOD(List list) { l_MNT_PERIOD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }

	public int setL2L_h_MNT_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MNT_PERIOD == null) {
			l_h_MNT_PERIOD = new ArrayList();
		} else {
			l_h_MNT_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MNT_PERIOD.add(((AN0030010Struct) list.get(i)).geth_MNT_PERIOD());
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
			l_DISPLAY_NAME.add(((AN0030010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_h_MNT_DATA_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MNT_DATA_TYP == null) {
			l_h_MNT_DATA_TYP = new ArrayList();
		} else {
			l_h_MNT_DATA_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MNT_DATA_TYP.add(((AN0030010Struct) list.get(i)).geth_MNT_DATA_TYP());
		}
		return size;
	}
	public int setL2L_MNT_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MNT_PERIOD == null) {
			l_MNT_PERIOD = new ArrayList();
		} else {
			l_MNT_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MNT_PERIOD.add(((AN0030010Struct) list.get(i)).getMNT_PERIOD());
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
			l_h_MODIFY_COUNT.add(((AN0030010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AN0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((AN0030010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_MNT_PERIOD = null;
		m_DISPLAY_NAME = null;
		m_h_MNT_DATA_TYP = null;
		m_MNT_PERIOD = null;
		m_h_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;

		l_h_MNT_PERIOD = null;
		l_DISPLAY_NAME = null;
		l_h_MNT_DATA_TYP = null;
		l_MNT_PERIOD = null;
		l_h_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;

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
	 * medAN0030010クラスの標準コンストラクタ
	 */
	public AN0030010Struct()
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
	public void setStruct(AN0030010Struct struct)
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
	public void setStructM(AN0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_MNT_PERIOD(struct.geth_MNT_PERIOD());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.seth_MNT_DATA_TYP(struct.geth_MNT_DATA_TYP());
			this.setMNT_PERIOD(struct.getMNT_PERIOD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_MNT_PERIOD(struct.getList_h_MNT_PERIOD());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_h_MNT_DATA_TYP(struct.getList_h_MNT_DATA_TYP());
			this.setList_MNT_PERIOD(struct.getList_MNT_PERIOD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
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
	// 第 1 変数初期値： i_h_MNT_PERIOD


	final static String i_h_MNT_PERIOD = null;

	// 第 2 変数初期値： i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// 第 3 変数初期値： i_h_MNT_DATA_TYP


	final static String i_h_MNT_DATA_TYP = null;

	// 第 4 変数初期値： i_MNT_PERIOD


	final static String i_MNT_PERIOD = null;

	// 第 5 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 7 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

*/

	//{{user_implement_code
       
        // 第 1 変数初期値： i_h_MNT_DATA_TYP
        final static String i_h_MNT_DATA_TYP = null;
        // 第 2 変数初期値： i_MNT_PERIOD
        final static String i_MNT_PERIOD = null;
        // 第 3 変数初期値： i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // 第 4 変数初期値： i_DISPLAY_NAME
        final static String i_DISPLAY_NAME = null;
        // 第 5 変数初期値： i_h_MNT_PERIOD
        final static String i_h_MNT_PERIOD = null;
        // 第 6 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
       
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
         m_h_MNT_DATA_TYP = i_h_MNT_DATA_TYP;
         m_MNT_PERIOD = i_MNT_PERIOD;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_DISPLAY_NAME = i_DISPLAY_NAME;
         m_h_MNT_PERIOD = i_h_MNT_PERIOD;
         m_PLANT_NAME = i_PLANT_NAME;
       
         l_h_MNT_DATA_TYP = null;
         l_MNT_PERIOD = null;
         l_h_MODIFY_COUNT = null;
         l_DISPLAY_NAME = null;
         l_PLANT_CD = null;
         l_PLANT_NAME = null;
         l_h_MNT_PERIOD = null;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
