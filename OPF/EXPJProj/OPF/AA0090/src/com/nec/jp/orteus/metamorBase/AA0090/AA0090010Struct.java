/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/src/com/nec/jp/orteus/metamorBase/AA0090/AA0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0090;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import java.util.ArrayList;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0090010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 2 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 3 変数： m_PLANT_ANAME */
	public String m_PLANT_ANAME = null;
	/** 第 4 変数： m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** 第 5 変数： m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** 第 6 変数： m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** 第 7 変数： m_ADDRESS_K_1 */
	public String m_ADDRESS_K_1 = null;
	/** 第 8 変数： m_ADDRESS_K_2 */
	public String m_ADDRESS_K_2 = null;
	/** 第 9 変数： m_TEL */
	public String m_TEL = null;
	/** 第 10 変数： m_FAX */
	public String m_FAX = null;
	/** 第 11 変数： m_CAL_NO */
	public String m_CAL_NO = null;
	/** 第 12 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 13 変数： m_CAL_NAME */
	public String m_CAL_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 2 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 3 List変数： l_PLANT_ANAME */
	public List l_PLANT_ANAME = null;

	/** 第 4 List変数： l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** 第 5 List変数： l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** 第 6 List変数： l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** 第 7 List変数： l_ADDRESS_K_1 */
	public List l_ADDRESS_K_1 = null;

	/** 第 8 List変数： l_ADDRESS_K_2 */
	public List l_ADDRESS_K_2 = null;

	/** 第 9 List変数： l_TEL */
	public List l_TEL = null;

	/** 第 10 List変数： l_FAX */
	public List l_FAX = null;

	/** 第 11 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 12 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 13 List変数： l_CAL_NAME */
	public List l_CAL_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_ANAME() { return m_PLANT_ANAME; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getADDRESS_K_1() { return m_ADDRESS_K_1; }
	public String getADDRESS_K_2() { return m_ADDRESS_K_2; }
	public String getTEL() { return m_TEL; }
	public String getFAX() { return m_FAX; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCAL_NAME() { return m_CAL_NAME; }

	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PLANT_ANAME() { return l_PLANT_ANAME; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_ADDRESS_K_1() { return l_ADDRESS_K_1; }
	public List getList_ADDRESS_K_2() { return l_ADDRESS_K_2; }
	public List getList_TEL() { return l_TEL; }
	public List getList_FAX() { return l_FAX; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_CAL_NAME() { return l_CAL_NAME; }

	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPLANT_ANAME(String val) { m_PLANT_ANAME = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setADDRESS_K_1(String val) { m_ADDRESS_K_1 = val; }
	public void setADDRESS_K_2(String val) { m_ADDRESS_K_2 = val; }
	public void setTEL(String val) { m_TEL = val; }
	public void setFAX(String val) { m_FAX = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCAL_NAME(String val) { m_CAL_NAME = val; }


	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PLANT_ANAME(List list) { l_PLANT_ANAME = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_ADDRESS_K_1(List list) { l_ADDRESS_K_1 = list; }
	public void setList_ADDRESS_K_2(List list) { l_ADDRESS_K_2 = list; }
	public void setList_TEL(List list) { l_TEL = list; }
	public void setList_FAX(List list) { l_FAX = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_CAL_NAME(List list) { l_CAL_NAME = list; }

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
			l_PLANT_CD.add(((AA0090010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AA0090010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_PLANT_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_ANAME == null) {
			l_PLANT_ANAME = new ArrayList();
		} else {
			l_PLANT_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_ANAME.add(((AA0090010Struct) list.get(i)).getPLANT_ANAME());
		}
		return size;
	}
	public int setL2L_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ZIP_CD == null) {
			l_ZIP_CD = new ArrayList();
		} else {
			l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ZIP_CD.add(((AA0090010Struct) list.get(i)).getZIP_CD());
		}
		return size;
	}
	public int setL2L_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_1 == null) {
			l_ADDRESS_1 = new ArrayList();
		} else {
			l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_1.add(((AA0090010Struct) list.get(i)).getADDRESS_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_2 == null) {
			l_ADDRESS_2 = new ArrayList();
		} else {
			l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_2.add(((AA0090010Struct) list.get(i)).getADDRESS_2());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_1 == null) {
			l_ADDRESS_K_1 = new ArrayList();
		} else {
			l_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_1.add(((AA0090010Struct) list.get(i)).getADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_2 == null) {
			l_ADDRESS_K_2 = new ArrayList();
		} else {
			l_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_2.add(((AA0090010Struct) list.get(i)).getADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEL == null) {
			l_TEL = new ArrayList();
		} else {
			l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEL.add(((AA0090010Struct) list.get(i)).getTEL());
		}
		return size;
	}
	public int setL2L_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FAX == null) {
			l_FAX = new ArrayList();
		} else {
			l_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FAX.add(((AA0090010Struct) list.get(i)).getFAX());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AA0090010Struct) list.get(i)).getCAL_NO());
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
			l_MODIFY_COUNT.add(((AA0090010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_CAL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME == null) {
			l_CAL_NAME = new ArrayList();
		} else {
			l_CAL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME.add(((AA0090010Struct) list.get(i)).getCAL_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_PLANT_ANAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_CAL_NO = null;
		m_MODIFY_COUNT = null;
		m_CAL_NAME = null;

		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_PLANT_ANAME = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_ADDRESS_K_1 = null;
		l_ADDRESS_K_2 = null;
		l_TEL = null;
		l_FAX = null;
		l_CAL_NO = null;
		l_MODIFY_COUNT = null;
		l_CAL_NAME = null;

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
	 * medAA0090010クラスの標準コンストラクタ
	 */
	public AA0090010Struct()
	{
		//{{user_implement_code_constractor
		l_PLANT_CD = new ArrayList(0);
		l_PLANT_NAME = new ArrayList(0);
		l_PLANT_ANAME = new ArrayList(0);
		l_ZIP_CD = new ArrayList(0);
		l_ADDRESS_1 = new ArrayList(0);
		l_ADDRESS_2 = new ArrayList(0);
		l_ADDRESS_K_1 = new ArrayList(0);
		l_ADDRESS_K_2 = new ArrayList(0);
		l_TEL = new ArrayList(0);
		l_FAX = new ArrayList(0);
		l_CAL_NO = new ArrayList(0);
		l_CAL_NAME = new ArrayList(0);
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
	public void setStruct(AA0090010Struct struct)
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
	public void setStructM(AA0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPLANT_ANAME(struct.getPLANT_ANAME());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setADDRESS_K_1(struct.getADDRESS_K_1());
			this.setADDRESS_K_2(struct.getADDRESS_K_2());
			this.setTEL(struct.getTEL());
			this.setFAX(struct.getFAX());
			this.setCAL_NO(struct.getCAL_NO());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCAL_NAME(struct.getCAL_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PLANT_ANAME(struct.getList_PLANT_ANAME());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_ADDRESS_K_1(struct.getList_ADDRESS_K_1());
			this.setList_ADDRESS_K_2(struct.getList_ADDRESS_K_2());
			this.setList_TEL(struct.getList_TEL());
			this.setList_FAX(struct.getList_FAX());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_CAL_NAME(struct.getList_CAL_NAME());
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
	// 第 1 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 2 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 3 変数初期値： i_PLANT_ANAME


	final static String i_PLANT_ANAME = null;

	// 第 4 変数初期値： i_ZIP_CD


	final static String i_ZIP_CD = null;

	// 第 5 変数初期値： i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// 第 6 変数初期値： i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// 第 7 変数初期値： i_ADDRESS_K_1


	final static String i_ADDRESS_K_1 = null;

	// 第 8 変数初期値： i_ADDRESS_K_2


	final static String i_ADDRESS_K_2 = null;

	// 第 9 変数初期値： i_TEL


	final static String i_TEL = null;

	// 第 10 変数初期値： i_FAX


	final static String i_FAX = null;

	// 第 11 変数初期値： i_CAL_NO


	final static String i_CAL_NO = null;

	// 第 12 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 13 変数初期値： i_CAL_NAME


	final static String i_CAL_NAME = null;

*/

	//{{user_implement_code
	/**
	 * インスタンス破壊時に行う処理
	 *
	 * @param なし
	 */
	public void initialize()
	{
		clear();

		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_PLANT_ANAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_CAL_NO = null;
		m_MODIFY_COUNT = null;
		m_CAL_NAME = null;

		l_PLANT_CD = new ArrayList(0);
		l_PLANT_NAME = new ArrayList(0);
		l_PLANT_ANAME = new ArrayList(0);
		l_ZIP_CD = new ArrayList(0);
		l_ADDRESS_1 = new ArrayList(0);
		l_ADDRESS_2 = new ArrayList(0);
		l_ADDRESS_K_1 = new ArrayList(0);
		l_ADDRESS_K_2 = new ArrayList(0);
		l_TEL = new ArrayList(0);
		l_FAX = new ArrayList(0);
		l_CAL_NO = new ArrayList(0);
		l_CAL_NAME = new ArrayList(0);

		return;
	}

	public void copy(AA0090010Struct struct)
	{

		if(struct.m_PLANT_CD != null)		{m_PLANT_CD			=	new String(struct.m_PLANT_CD);					}
		else								{m_PLANT_CD			=	null;											}

		if(struct.m_PLANT_NAME != null)		{m_PLANT_NAME		=	new String(struct.m_PLANT_NAME);				}
		else								{m_PLANT_NAME		=	null;											}

		if(struct.m_PLANT_ANAME != null)	{m_PLANT_ANAME		=	new String(struct.m_PLANT_ANAME);				}
		else								{m_PLANT_ANAME		=	null;											}

		if(struct.m_ZIP_CD != null)			{m_ZIP_CD			=	new String(struct.m_ZIP_CD);					}
		else								{m_ZIP_CD			=	null;											}

		if(struct.m_ADDRESS_1 != null)		{m_ADDRESS_1		=	new String(struct.m_ADDRESS_1);					}
		else								{m_ADDRESS_1		=	null;											}

		if(struct.m_ADDRESS_2 != null)		{m_ADDRESS_2		=	new String(struct.m_ADDRESS_2);					}
		else								{m_ADDRESS_2		=	null;											}

		if(struct.m_ADDRESS_K_1 != null)	{m_ADDRESS_K_1		=	new String(struct.m_ADDRESS_K_1);				}
		else								{m_ADDRESS_K_1		=	null;											}

		if(struct.m_ADDRESS_K_2 != null)	{m_ADDRESS_K_2		=	new String(struct.m_ADDRESS_K_2);				}
		else								{m_ADDRESS_K_2		=	null;											}

		if(struct.m_TEL != null)			{m_TEL				=	new String(struct.m_TEL);						}
		else								{m_TEL				=	null;											}

		if(struct.m_FAX != null)			{m_FAX				=	new String(struct.m_FAX);						}
		else								{m_FAX				=	null;											}

		if(struct.m_CAL_NO != null)			{m_CAL_NO			=	new String(struct.m_CAL_NO);					}
		else								{m_CAL_NO			=	null;											}

		if(struct.m_MODIFY_COUNT != null)	{m_MODIFY_COUNT		=	new String(struct.m_MODIFY_COUNT);				}
		else								{m_MODIFY_COUNT		=	null;											}

		if(struct.m_CAL_NAME != null)		{m_CAL_NAME			=	new String(struct.m_CAL_NAME);					}
		else								{m_CAL_NAME			=	null;											}
	}
        //}}user_implement_code

	//////////////////////////////

}
