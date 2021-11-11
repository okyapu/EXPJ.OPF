/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/src/com/nec/jp/orteus/metamorBase/AC0010/AC0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0010;

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

public class AC0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rdoPlantTyp */
	public String m_rdoPlantTyp = null;
	/** 第 2 変数： m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** 第 3 変数： m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** 第 4 変数： m_plantCd */
	public String m_plantCd = null;
	/** 第 5 変数： m_txtPlantCd */
	public String m_txtPlantCd = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rdoPlantTyp */
	public List l_rdoPlantTyp = null;

	/** 第 2 List変数： l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** 第 3 List変数： l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** 第 4 List変数： l_plantCd */
	public List l_plantCd = null;

	/** 第 5 List変数： l_txtPlantCd */
	public List l_txtPlantCd = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrdoPlantTyp() { return m_rdoPlantTyp; }
	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getplantCd() { return m_plantCd; }
	public String gettxtPlantCd() { return m_txtPlantCd; }

	public List getList_rdoPlantTyp() { return l_rdoPlantTyp; }
	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_txtPlantCd() { return l_txtPlantCd; }

	public void setrdoPlantTyp(String val) { m_rdoPlantTyp = val; }
	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void settxtPlantCd(String val) { m_txtPlantCd = val; }


	public void setList_rdoPlantTyp(List list) { l_rdoPlantTyp = list; }
	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_txtPlantCd(List list) { l_txtPlantCd = list; }

	public int setL2L_rdoPlantTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp == null) {
			l_rdoPlantTyp = new ArrayList();
		} else {
			l_rdoPlantTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp1 == null) {
			l_rdoPlantTyp1 = new ArrayList();
		} else {
			l_rdoPlantTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp1.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp1());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp2 == null) {
			l_rdoPlantTyp2 = new ArrayList();
		} else {
			l_rdoPlantTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp2.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_plantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_plantCd == null) {
			l_plantCd = new ArrayList();
		} else {
			l_plantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_plantCd.add(((AC0010010Struct) list.get(i)).getplantCd());
		}
		return size;
	}
	public int setL2L_txtPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtPlantCd == null) {
			l_txtPlantCd = new ArrayList();
		} else {
			l_txtPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtPlantCd.add(((AC0010010Struct) list.get(i)).gettxtPlantCd());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlantTyp = null;
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_plantCd = null;
		m_txtPlantCd = null;

		l_rdoPlantTyp = null;
		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_plantCd = null;
		l_txtPlantCd = null;

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
	 * medAC0010010クラスの標準コンストラクタ
	 */
	public AC0010010Struct()
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
	public void setStruct(AC0010010Struct struct)
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
	public void setStructM(AC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlantTyp(struct.getrdoPlantTyp());
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setplantCd(struct.getplantCd());
			this.settxtPlantCd(struct.gettxtPlantCd());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlantTyp(struct.getList_rdoPlantTyp());
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_txtPlantCd(struct.getList_txtPlantCd());
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
	// 第 1 変数初期値： i_rdoPlantTyp


	final static String i_rdoPlantTyp = null;

	// 第 2 変数初期値： i_rdoPlantTyp1


	final static String i_rdoPlantTyp1 = null;

	// 第 3 変数初期値： i_rdoPlantTyp2


	final static String i_rdoPlantTyp2 = null;

	// 第 4 変数初期値： i_plantCd


	final static String i_plantCd = null;

	// 第 5 変数初期値： i_txtPlantCd


	final static String i_txtPlantCd = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_plantCd
        final static String i_plantCd = null;
        // 第 2 変数初期値： i_txtPlantCd
        final static String i_txtPlantCd = null;
        // 第 3 変数初期値： i_rdoPlantTyp
        final static String i_rdoPlantTyp = null;
        // 第 4 変数初期値： i_rdoPlantTyp1
        final static String i_rdoPlantTyp1 = null;
        // 第 5 変数初期値： i_rdoPlantTyp2
        final static String i_rdoPlantTyp2 = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_plantCd = i_plantCd;
         m_txtPlantCd = i_txtPlantCd;
         m_rdoPlantTyp = i_rdoPlantTyp;
         m_rdoPlantTyp1 = i_rdoPlantTyp1;
         m_rdoPlantTyp2 = i_rdoPlantTyp2;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
