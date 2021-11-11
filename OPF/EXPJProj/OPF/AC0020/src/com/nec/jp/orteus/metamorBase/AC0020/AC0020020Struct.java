/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020;

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

public class AC0020020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_txtEntryDate */
	public String m_txtEntryDate = null;
	/** 第 2 変数： m_rdoOutsideTyp1 */
	public String m_rdoOutsideTyp1 = null;
	/** 第 3 変数： m_rdoOutsideTyp2 */
	public String m_rdoOutsideTyp2 = null;
	/** 第 4 変数： m_rdoOutsideTyp3 */
	public String m_rdoOutsideTyp3 = null;
	/** 第 5 変数： m_rdoEntry1Typ1 */
	public String m_rdoEntry1Typ1 = null;
	/** 第 6 変数： m_rdoEntry1Typ2 */
	public String m_rdoEntry1Typ2 = null;
	/** 第 7 変数： m_rdoEntry1Typ3 */
	public String m_rdoEntry1Typ3 = null;
	/** 第 8 変数： m_rdoOutsideTyp */
	public String m_rdoOutsideTyp = null;
	/** 第 9 変数： m_rdoEntry1Typ */
	public String m_rdoEntry1Typ = null;
	/** 第 10 変数： m_txtEntryTime */
	public String m_txtEntryTime = null;
	/** 第 11 変数： m_hdnBusinessOprDate */
	public String m_hdnBusinessOprDate = null;
	/** 第 12 変数： m_plantCd */
	public String m_plantCd = null;
	/** 第 13 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_txtEntryDate */
	public List l_txtEntryDate = null;

	/** 第 2 List変数： l_rdoOutsideTyp1 */
	public List l_rdoOutsideTyp1 = null;

	/** 第 3 List変数： l_rdoOutsideTyp2 */
	public List l_rdoOutsideTyp2 = null;

	/** 第 4 List変数： l_rdoOutsideTyp3 */
	public List l_rdoOutsideTyp3 = null;

	/** 第 5 List変数： l_rdoEntry1Typ1 */
	public List l_rdoEntry1Typ1 = null;

	/** 第 6 List変数： l_rdoEntry1Typ2 */
	public List l_rdoEntry1Typ2 = null;

	/** 第 7 List変数： l_rdoEntry1Typ3 */
	public List l_rdoEntry1Typ3 = null;

	/** 第 8 List変数： l_rdoOutsideTyp */
	public List l_rdoOutsideTyp = null;

	/** 第 9 List変数： l_rdoEntry1Typ */
	public List l_rdoEntry1Typ = null;

	/** 第 10 List変数： l_txtEntryTime */
	public List l_txtEntryTime = null;

	/** 第 11 List変数： l_hdnBusinessOprDate */
	public List l_hdnBusinessOprDate = null;

	/** 第 12 List変数： l_plantCd */
	public List l_plantCd = null;

	/** 第 13 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String gettxtEntryDate() { return m_txtEntryDate; }
	public String getrdoOutsideTyp1() { return m_rdoOutsideTyp1; }
	public String getrdoOutsideTyp2() { return m_rdoOutsideTyp2; }
	public String getrdoOutsideTyp3() { return m_rdoOutsideTyp3; }
	public String getrdoEntry1Typ1() { return m_rdoEntry1Typ1; }
	public String getrdoEntry1Typ2() { return m_rdoEntry1Typ2; }
	public String getrdoEntry1Typ3() { return m_rdoEntry1Typ3; }
	public String getrdoOutsideTyp() { return m_rdoOutsideTyp; }
	public String getrdoEntry1Typ() { return m_rdoEntry1Typ; }
	public String gettxtEntryTime() { return m_txtEntryTime; }
	public String gethdnBusinessOprDate() { return m_hdnBusinessOprDate; }
	public String getplantCd() { return m_plantCd; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }

	public List getList_txtEntryDate() { return l_txtEntryDate; }
	public List getList_rdoOutsideTyp1() { return l_rdoOutsideTyp1; }
	public List getList_rdoOutsideTyp2() { return l_rdoOutsideTyp2; }
	public List getList_rdoOutsideTyp3() { return l_rdoOutsideTyp3; }
	public List getList_rdoEntry1Typ1() { return l_rdoEntry1Typ1; }
	public List getList_rdoEntry1Typ2() { return l_rdoEntry1Typ2; }
	public List getList_rdoEntry1Typ3() { return l_rdoEntry1Typ3; }
	public List getList_rdoOutsideTyp() { return l_rdoOutsideTyp; }
	public List getList_rdoEntry1Typ() { return l_rdoEntry1Typ; }
	public List getList_txtEntryTime() { return l_txtEntryTime; }
	public List getList_hdnBusinessOprDate() { return l_hdnBusinessOprDate; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }

	public void settxtEntryDate(String val) { m_txtEntryDate = val; }
	public void setrdoOutsideTyp1(String val) { m_rdoOutsideTyp1 = val; }
	public void setrdoOutsideTyp2(String val) { m_rdoOutsideTyp2 = val; }
	public void setrdoOutsideTyp3(String val) { m_rdoOutsideTyp3 = val; }
	public void setrdoEntry1Typ1(String val) { m_rdoEntry1Typ1 = val; }
	public void setrdoEntry1Typ2(String val) { m_rdoEntry1Typ2 = val; }
	public void setrdoEntry1Typ3(String val) { m_rdoEntry1Typ3 = val; }
	public void setrdoOutsideTyp(String val) { m_rdoOutsideTyp = val; }
	public void setrdoEntry1Typ(String val) { m_rdoEntry1Typ = val; }
	public void settxtEntryTime(String val) { m_txtEntryTime = val; }
	public void sethdnBusinessOprDate(String val) { m_hdnBusinessOprDate = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }


	public void setList_txtEntryDate(List list) { l_txtEntryDate = list; }
	public void setList_rdoOutsideTyp1(List list) { l_rdoOutsideTyp1 = list; }
	public void setList_rdoOutsideTyp2(List list) { l_rdoOutsideTyp2 = list; }
	public void setList_rdoOutsideTyp3(List list) { l_rdoOutsideTyp3 = list; }
	public void setList_rdoEntry1Typ1(List list) { l_rdoEntry1Typ1 = list; }
	public void setList_rdoEntry1Typ2(List list) { l_rdoEntry1Typ2 = list; }
	public void setList_rdoEntry1Typ3(List list) { l_rdoEntry1Typ3 = list; }
	public void setList_rdoOutsideTyp(List list) { l_rdoOutsideTyp = list; }
	public void setList_rdoEntry1Typ(List list) { l_rdoEntry1Typ = list; }
	public void setList_txtEntryTime(List list) { l_txtEntryTime = list; }
	public void setList_hdnBusinessOprDate(List list) { l_hdnBusinessOprDate = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }

	public int setL2L_txtEntryDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtEntryDate == null) {
			l_txtEntryDate = new ArrayList();
		} else {
			l_txtEntryDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtEntryDate.add(((AC0020020Struct) list.get(i)).gettxtEntryDate());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp1 == null) {
			l_rdoOutsideTyp1 = new ArrayList();
		} else {
			l_rdoOutsideTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp1.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp1());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp2 == null) {
			l_rdoOutsideTyp2 = new ArrayList();
		} else {
			l_rdoOutsideTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp2.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp2());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp3 == null) {
			l_rdoOutsideTyp3 = new ArrayList();
		} else {
			l_rdoOutsideTyp3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp3.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp3());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ1 == null) {
			l_rdoEntry1Typ1 = new ArrayList();
		} else {
			l_rdoEntry1Typ1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ1.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ1());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ2 == null) {
			l_rdoEntry1Typ2 = new ArrayList();
		} else {
			l_rdoEntry1Typ2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ2.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ2());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ3 == null) {
			l_rdoEntry1Typ3 = new ArrayList();
		} else {
			l_rdoEntry1Typ3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ3.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ3());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp == null) {
			l_rdoOutsideTyp = new ArrayList();
		} else {
			l_rdoOutsideTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ == null) {
			l_rdoEntry1Typ = new ArrayList();
		} else {
			l_rdoEntry1Typ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ());
		}
		return size;
	}
	public int setL2L_txtEntryTime(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtEntryTime == null) {
			l_txtEntryTime = new ArrayList();
		} else {
			l_txtEntryTime.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtEntryTime.add(((AC0020020Struct) list.get(i)).gettxtEntryTime());
		}
		return size;
	}
	public int setL2L_hdnBusinessOprDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hdnBusinessOprDate == null) {
			l_hdnBusinessOprDate = new ArrayList();
		} else {
			l_hdnBusinessOprDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hdnBusinessOprDate.add(((AC0020020Struct) list.get(i)).gethdnBusinessOprDate());
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
			l_plantCd.add(((AC0020020Struct) list.get(i)).getplantCd());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AC0020020Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_txtEntryDate = null;
		m_rdoOutsideTyp1 = null;
		m_rdoOutsideTyp2 = null;
		m_rdoOutsideTyp3 = null;
		m_rdoEntry1Typ1 = null;
		m_rdoEntry1Typ2 = null;
		m_rdoEntry1Typ3 = null;
		m_rdoOutsideTyp = null;
		m_rdoEntry1Typ = null;
		m_txtEntryTime = null;
		m_hdnBusinessOprDate = null;
		m_plantCd = null;
		m_TIME_CTRL = null;

		l_txtEntryDate = null;
		l_rdoOutsideTyp1 = null;
		l_rdoOutsideTyp2 = null;
		l_rdoOutsideTyp3 = null;
		l_rdoEntry1Typ1 = null;
		l_rdoEntry1Typ2 = null;
		l_rdoEntry1Typ3 = null;
		l_rdoOutsideTyp = null;
		l_rdoEntry1Typ = null;
		l_txtEntryTime = null;
		l_hdnBusinessOprDate = null;
		l_plantCd = null;
		l_TIME_CTRL = null;

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
	 * medAC0020020クラスの標準コンストラクタ
	 */
	public AC0020020Struct()
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
	public void setStruct(AC0020020Struct struct)
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
	public void setStructM(AC0020020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.settxtEntryDate(struct.gettxtEntryDate());
			this.setrdoOutsideTyp1(struct.getrdoOutsideTyp1());
			this.setrdoOutsideTyp2(struct.getrdoOutsideTyp2());
			this.setrdoOutsideTyp3(struct.getrdoOutsideTyp3());
			this.setrdoEntry1Typ1(struct.getrdoEntry1Typ1());
			this.setrdoEntry1Typ2(struct.getrdoEntry1Typ2());
			this.setrdoEntry1Typ3(struct.getrdoEntry1Typ3());
			this.setrdoOutsideTyp(struct.getrdoOutsideTyp());
			this.setrdoEntry1Typ(struct.getrdoEntry1Typ());
			this.settxtEntryTime(struct.gettxtEntryTime());
			this.sethdnBusinessOprDate(struct.gethdnBusinessOprDate());
			this.setplantCd(struct.getplantCd());
			this.setTIME_CTRL(struct.getTIME_CTRL());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0020020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_txtEntryDate(struct.getList_txtEntryDate());
			this.setList_rdoOutsideTyp1(struct.getList_rdoOutsideTyp1());
			this.setList_rdoOutsideTyp2(struct.getList_rdoOutsideTyp2());
			this.setList_rdoOutsideTyp3(struct.getList_rdoOutsideTyp3());
			this.setList_rdoEntry1Typ1(struct.getList_rdoEntry1Typ1());
			this.setList_rdoEntry1Typ2(struct.getList_rdoEntry1Typ2());
			this.setList_rdoEntry1Typ3(struct.getList_rdoEntry1Typ3());
			this.setList_rdoOutsideTyp(struct.getList_rdoOutsideTyp());
			this.setList_rdoEntry1Typ(struct.getList_rdoEntry1Typ());
			this.setList_txtEntryTime(struct.getList_txtEntryTime());
			this.setList_hdnBusinessOprDate(struct.getList_hdnBusinessOprDate());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// 第 1 変数初期値： i_txtEntryDate


	final static String i_txtEntryDate = null;

	// 第 2 変数初期値： i_rdoOutsideTyp1


	final static String i_rdoOutsideTyp1 = null;

	// 第 3 変数初期値： i_rdoOutsideTyp2


	final static String i_rdoOutsideTyp2 = null;

	// 第 4 変数初期値： i_rdoOutsideTyp3


	final static String i_rdoOutsideTyp3 = null;

	// 第 5 変数初期値： i_rdoEntry1Typ1


	final static String i_rdoEntry1Typ1 = null;

	// 第 6 変数初期値： i_rdoEntry1Typ2


	final static String i_rdoEntry1Typ2 = null;

	// 第 7 変数初期値： i_rdoEntry1Typ3


	final static String i_rdoEntry1Typ3 = null;

	// 第 8 変数初期値： i_rdoOutsideTyp


	final static String i_rdoOutsideTyp = null;

	// 第 9 変数初期値： i_rdoEntry1Typ


	final static String i_rdoEntry1Typ = null;

	// 第 10 変数初期値： i_txtEntryTime


	final static String i_txtEntryTime = null;

	// 第 11 変数初期値： i_hdnBusinessOprDate


	final static String i_hdnBusinessOprDate = null;

	// 第 12 変数初期値： i_plantCd


	final static String i_plantCd = null;

	// 第 13 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_hdnBusinessOprDate
        final static String i_hdnBusinessOprDate = null;
        // 第 2 変数初期値： i_plantCd
        final static String i_plantCd = null;
        // 第 3 変数初期値： i_txtEntryDate
        final static String i_txtEntryDate = null;
        // 第 5 変数初期値： i_rdoOutsideTyp1
        final static String i_rdoOutsideTyp1 = null;
        // 第 6 変数初期値： i_rdoOutsideTyp2
        final static String i_rdoOutsideTyp2 = null;
        // 第 7 変数初期値： i_rdoOutsideTyp3
        final static String i_rdoOutsideTyp3 = null;
        // 第 8 変数初期値： i_rdoEntry1Typ1
        final static String i_rdoEntry1Typ1 = null;
        // 第 9 変数初期値： i_rdoEntry2Typ1
        //final static String i_rdoEntry2Typ1 = null;
        // 第 10 変数初期値： i_rdoEntry1Typ2
        final static String i_rdoEntry1Typ2 = null;
        // 第 11 変数初期値： i_rdoEntry2Typ2
        //final static String i_rdoEntry2Typ2 = null;
        // 第 12 変数初期値： i_rdoEntry1Typ3
        final static String i_rdoEntry1Typ3 = null;
        // 第 13 変数初期値： i_rdoEntry2Typ3
        //final static String i_rdoEntry2Typ3 = null;
        // 第 14 変数初期値： i_rdoEntry2Typ4
        //final static String i_rdoEntry2Typ4 = null;
        // 第 15 変数初期値： i_rdoOutsideTyp
        final static String i_rdoOutsideTyp = null;
        // 第 16 変数初期値： i_rdoEntry1Typ
        final static String i_rdoEntry1Typ = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_hdnBusinessOprDate = i_hdnBusinessOprDate;
         m_plantCd = i_plantCd;
         m_txtEntryDate = i_txtEntryDate;
         m_rdoOutsideTyp = i_rdoOutsideTyp;
         m_rdoOutsideTyp1 = i_rdoOutsideTyp1;
         m_rdoOutsideTyp2 = i_rdoOutsideTyp2;
         m_rdoOutsideTyp3 = i_rdoOutsideTyp3;
         m_rdoEntry1Typ = i_rdoEntry1Typ;
         m_rdoEntry1Typ1 = i_rdoEntry1Typ1;
         m_rdoEntry1Typ2 = i_rdoEntry1Typ2;
         m_rdoEntry1Typ3 = i_rdoEntry1Typ3;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
