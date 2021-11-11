/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080;

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
/**
 * CLASS     : AD0080020Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/22 09:52:48 $
 *
 */
//}}user_implement_code_header

public class AD0080020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_INTAKE_TERM_FROM */
	public String m_INTAKE_TERM_FROM = null;
	/** 第 2 変数： m_INTAKE_TERM_TO */
	public String m_INTAKE_TERM_TO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_INTAKE_TERM_FROM */
	public List l_INTAKE_TERM_FROM = null;

	/** 第 2 List変数： l_INTAKE_TERM_TO */
	public List l_INTAKE_TERM_TO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getINTAKE_TERM_FROM() { return m_INTAKE_TERM_FROM; }
	public String getINTAKE_TERM_TO() { return m_INTAKE_TERM_TO; }

	public List getList_INTAKE_TERM_FROM() { return l_INTAKE_TERM_FROM; }
	public List getList_INTAKE_TERM_TO() { return l_INTAKE_TERM_TO; }

	public void setINTAKE_TERM_FROM(String val) { m_INTAKE_TERM_FROM = val; }
	public void setINTAKE_TERM_TO(String val) { m_INTAKE_TERM_TO = val; }


	public void setList_INTAKE_TERM_FROM(List list) { l_INTAKE_TERM_FROM = list; }
	public void setList_INTAKE_TERM_TO(List list) { l_INTAKE_TERM_TO = list; }

	public int setL2L_INTAKE_TERM_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTAKE_TERM_FROM == null) {
			l_INTAKE_TERM_FROM = new ArrayList();
		} else {
			l_INTAKE_TERM_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTAKE_TERM_FROM.add(((AD0080020Struct) list.get(i)).getINTAKE_TERM_FROM());
		}
		return size;
	}
	public int setL2L_INTAKE_TERM_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTAKE_TERM_TO == null) {
			l_INTAKE_TERM_TO = new ArrayList();
		} else {
			l_INTAKE_TERM_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTAKE_TERM_TO.add(((AD0080020Struct) list.get(i)).getINTAKE_TERM_TO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_INTAKE_TERM_FROM = null;
		m_INTAKE_TERM_TO = null;

		l_INTAKE_TERM_FROM = null;
		l_INTAKE_TERM_TO = null;

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
	 * medAD0080020クラスの標準コンストラクタ
	 */
	public AD0080020Struct()
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
	public void setStruct(AD0080020Struct struct)
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
	public void setStructM(AD0080020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setINTAKE_TERM_FROM(struct.getINTAKE_TERM_FROM());
			this.setINTAKE_TERM_TO(struct.getINTAKE_TERM_TO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0080020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_INTAKE_TERM_FROM(struct.getList_INTAKE_TERM_FROM());
			this.setList_INTAKE_TERM_TO(struct.getList_INTAKE_TERM_TO());
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
	// 第 1 変数初期値： i_INTAKE_TERM_FROM


	final static String i_INTAKE_TERM_FROM = null;

	// 第 2 変数初期値： i_INTAKE_TERM_TO


	final static String i_INTAKE_TERM_TO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_INTAKE_TERM_FROM

	final static String i_INTAKE_TERM_FROM = null;

	// 第 2 変数初期値： i_INTAKE_TERM_TO

	final static String i_INTAKE_TERM_TO = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_INTAKE_TERM_FROM = i_INTAKE_TERM_FROM;
		m_INTAKE_TERM_TO = i_INTAKE_TERM_TO;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
