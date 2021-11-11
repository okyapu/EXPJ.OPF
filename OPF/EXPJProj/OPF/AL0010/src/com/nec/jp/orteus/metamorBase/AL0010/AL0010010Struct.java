/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0010/src/com/nec/jp/orteus/metamorBase/AL0010/AL0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0010;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
 // TODO: ここにimportパッケージを記述してください
 //$Id: AL0010010Struct.java,v 1.4 2011/01/28 11:17:40 shao-guangfeng Exp $
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 2 変数： m_NECK_PROC_CD */
	public String m_NECK_PROC_CD = null;
	/** 第 3 変数： m_NECK_PROC_NAME */
	public String m_NECK_PROC_NAME = null;
	/** 第 4 変数： m_NECK_PROC_CAPA */
	public String m_NECK_PROC_CAPA = null;
	/** 第 5 変数： m_NECK_PROC_CAPA_UNIT */
	public String m_NECK_PROC_CAPA_UNIT = null;
	/** 第 6 変数： m_NECK_PROC_CAPA_RATE */
	public String m_NECK_PROC_CAPA_RATE = null;
	/** 第 7 変数： m_NECK_PROC_SHIFT */
	public String m_NECK_PROC_SHIFT = null;
	/** 第 8 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 9 変数： m_ExistFlag */
	public String m_ExistFlag = null;
	/** 第 10 変数： m_h_NECK_PROC_CD */
	public String m_h_NECK_PROC_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 2 List変数： l_NECK_PROC_CD */
	public List l_NECK_PROC_CD = null;

	/** 第 3 List変数： l_NECK_PROC_NAME */
	public List l_NECK_PROC_NAME = null;

	/** 第 4 List変数： l_NECK_PROC_CAPA */
	public List l_NECK_PROC_CAPA = null;

	/** 第 5 List変数： l_NECK_PROC_CAPA_UNIT */
	public List l_NECK_PROC_CAPA_UNIT = null;

	/** 第 6 List変数： l_NECK_PROC_CAPA_RATE */
	public List l_NECK_PROC_CAPA_RATE = null;

	/** 第 7 List変数： l_NECK_PROC_SHIFT */
	public List l_NECK_PROC_SHIFT = null;

	/** 第 8 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 9 List変数： l_ExistFlag */
	public List l_ExistFlag = null;

	/** 第 10 List変数： l_h_NECK_PROC_CD */
	public List l_h_NECK_PROC_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getNECK_PROC_CD() { return m_NECK_PROC_CD; }
	public String getNECK_PROC_NAME() { return m_NECK_PROC_NAME; }
	public String getNECK_PROC_CAPA() { return m_NECK_PROC_CAPA; }
	public String getNECK_PROC_CAPA_UNIT() { return m_NECK_PROC_CAPA_UNIT; }
	public String getNECK_PROC_CAPA_RATE() { return m_NECK_PROC_CAPA_RATE; }
	public String getNECK_PROC_SHIFT() { return m_NECK_PROC_SHIFT; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getExistFlag() { return m_ExistFlag; }
	public String geth_NECK_PROC_CD() { return m_h_NECK_PROC_CD; }

	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_NECK_PROC_CD() { return l_NECK_PROC_CD; }
	public List getList_NECK_PROC_NAME() { return l_NECK_PROC_NAME; }
	public List getList_NECK_PROC_CAPA() { return l_NECK_PROC_CAPA; }
	public List getList_NECK_PROC_CAPA_UNIT() { return l_NECK_PROC_CAPA_UNIT; }
	public List getList_NECK_PROC_CAPA_RATE() { return l_NECK_PROC_CAPA_RATE; }
	public List getList_NECK_PROC_SHIFT() { return l_NECK_PROC_SHIFT; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_ExistFlag() { return l_ExistFlag; }
	public List getList_h_NECK_PROC_CD() { return l_h_NECK_PROC_CD; }

	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setNECK_PROC_CD(String val) { m_NECK_PROC_CD = val; }
	public void setNECK_PROC_NAME(String val) { m_NECK_PROC_NAME = val; }
	public void setNECK_PROC_CAPA(String val) { m_NECK_PROC_CAPA = val; }
	public void setNECK_PROC_CAPA_UNIT(String val) { m_NECK_PROC_CAPA_UNIT = val; }
	public void setNECK_PROC_CAPA_RATE(String val) { m_NECK_PROC_CAPA_RATE = val; }
	public void setNECK_PROC_SHIFT(String val) { m_NECK_PROC_SHIFT = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setExistFlag(String val) { m_ExistFlag = val; }
	public void seth_NECK_PROC_CD(String val) { m_h_NECK_PROC_CD = val; }


	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_NECK_PROC_CD(List list) { l_NECK_PROC_CD = list; }
	public void setList_NECK_PROC_NAME(List list) { l_NECK_PROC_NAME = list; }
	public void setList_NECK_PROC_CAPA(List list) { l_NECK_PROC_CAPA = list; }
	public void setList_NECK_PROC_CAPA_UNIT(List list) { l_NECK_PROC_CAPA_UNIT = list; }
	public void setList_NECK_PROC_CAPA_RATE(List list) { l_NECK_PROC_CAPA_RATE = list; }
	public void setList_NECK_PROC_SHIFT(List list) { l_NECK_PROC_SHIFT = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_ExistFlag(List list) { l_ExistFlag = list; }
	public void setList_h_NECK_PROC_CD(List list) { l_h_NECK_PROC_CD = list; }

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
			l_h_PLANT_CD.add(((AL0010010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CD == null) {
			l_NECK_PROC_CD = new ArrayList();
		} else {
			l_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CD.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_NAME == null) {
			l_NECK_PROC_NAME = new ArrayList();
		} else {
			l_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_NAME.add(((AL0010010Struct) list.get(i)).getNECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA == null) {
			l_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA_UNIT == null) {
			l_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA_UNIT.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA_UNIT());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA_RATE == null) {
			l_NECK_PROC_CAPA_RATE = new ArrayList();
		} else {
			l_NECK_PROC_CAPA_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA_RATE.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA_RATE());
		}
		return size;
	}
	public int setL2L_NECK_PROC_SHIFT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_SHIFT == null) {
			l_NECK_PROC_SHIFT = new ArrayList();
		} else {
			l_NECK_PROC_SHIFT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_SHIFT.add(((AL0010010Struct) list.get(i)).getNECK_PROC_SHIFT());
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
			l_h_MODIFY_COUNT.add(((AL0010010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ExistFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ExistFlag == null) {
			l_ExistFlag = new ArrayList();
		} else {
			l_ExistFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ExistFlag.add(((AL0010010Struct) list.get(i)).getExistFlag());
		}
		return size;
	}
	public int setL2L_h_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NECK_PROC_CD == null) {
			l_h_NECK_PROC_CD = new ArrayList();
		} else {
			l_h_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NECK_PROC_CD.add(((AL0010010Struct) list.get(i)).geth_NECK_PROC_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_PLANT_CD = null;
		m_NECK_PROC_CD = null;
		m_NECK_PROC_NAME = null;
		m_NECK_PROC_CAPA = null;
		m_NECK_PROC_CAPA_UNIT = null;
		m_NECK_PROC_CAPA_RATE = null;
		m_NECK_PROC_SHIFT = null;
		m_h_MODIFY_COUNT = null;
		m_ExistFlag = null;
		m_h_NECK_PROC_CD = null;

		l_h_PLANT_CD = null;
		l_NECK_PROC_CD = null;
		l_NECK_PROC_NAME = null;
		l_NECK_PROC_CAPA = null;
		l_NECK_PROC_CAPA_UNIT = null;
		l_NECK_PROC_CAPA_RATE = null;
		l_NECK_PROC_SHIFT = null;
		l_h_MODIFY_COUNT = null;
		l_ExistFlag = null;
		l_h_NECK_PROC_CD = null;

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
	 * medAL0010010クラスの標準コンストラクタ
	 */
	public AL0010010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AL0010010Struct struct)
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
	public void setStructM(AL0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setNECK_PROC_CD(struct.getNECK_PROC_CD());
			this.setNECK_PROC_NAME(struct.getNECK_PROC_NAME());
			this.setNECK_PROC_CAPA(struct.getNECK_PROC_CAPA());
			this.setNECK_PROC_CAPA_UNIT(struct.getNECK_PROC_CAPA_UNIT());
			this.setNECK_PROC_CAPA_RATE(struct.getNECK_PROC_CAPA_RATE());
			this.setNECK_PROC_SHIFT(struct.getNECK_PROC_SHIFT());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setExistFlag(struct.getExistFlag());
			this.seth_NECK_PROC_CD(struct.geth_NECK_PROC_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AL0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_NECK_PROC_CD(struct.getList_NECK_PROC_CD());
			this.setList_NECK_PROC_NAME(struct.getList_NECK_PROC_NAME());
			this.setList_NECK_PROC_CAPA(struct.getList_NECK_PROC_CAPA());
			this.setList_NECK_PROC_CAPA_UNIT(struct.getList_NECK_PROC_CAPA_UNIT());
			this.setList_NECK_PROC_CAPA_RATE(struct.getList_NECK_PROC_CAPA_RATE());
			this.setList_NECK_PROC_SHIFT(struct.getList_NECK_PROC_SHIFT());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_ExistFlag(struct.getList_ExistFlag());
			this.setList_h_NECK_PROC_CD(struct.getList_h_NECK_PROC_CD());
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
	// 第 1 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 2 変数初期値： i_NECK_PROC_CD


	final static String i_NECK_PROC_CD = null;

	// 第 3 変数初期値： i_NECK_PROC_NAME


	final static String i_NECK_PROC_NAME = null;

	// 第 4 変数初期値： i_NECK_PROC_CAPA


	final static String i_NECK_PROC_CAPA = null;

	// 第 5 変数初期値： i_NECK_PROC_CAPA_UNIT


	final static String i_NECK_PROC_CAPA_UNIT = null;

	// 第 6 変数初期値： i_NECK_PROC_CAPA_RATE


	final static String i_NECK_PROC_CAPA_RATE = null;

	// 第 7 変数初期値： i_NECK_PROC_SHIFT


	final static String i_NECK_PROC_SHIFT = null;

	// 第 8 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 9 変数初期値： i_ExistFlag


	final static String i_ExistFlag = null;

	// 第 10 変数初期値： i_h_NECK_PROC_CD


	final static String i_h_NECK_PROC_CD = null;

*/

	//{{user_implement_code
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
