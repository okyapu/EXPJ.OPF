/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0020/src/com/nec/jp/orteus/metamorBase/AK0020/AK0020030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0020;

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
 * CLASS     : AK0020030Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:27:46 $
 *
 */
//}}user_implement_code_header

public class AK0020030Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FINAL_MONTHLY_PROC_EXEC_DATE */
	public String m_FINAL_MONTHLY_PROC_EXEC_DATE = null;
	/** 第 2 変数： m_SYSDATE */
	public String m_SYSDATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FINAL_MONTHLY_PROC_EXEC_DATE */
	public List l_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	/** 第 2 List変数： l_SYSDATE */
	public List l_SYSDATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFINAL_MONTHLY_PROC_EXEC_DATE() { return m_FINAL_MONTHLY_PROC_EXEC_DATE; }
	public String getSYSDATE() { return m_SYSDATE; }

	public List getList_FINAL_MONTHLY_PROC_EXEC_DATE() { return l_FINAL_MONTHLY_PROC_EXEC_DATE; }
	public List getList_SYSDATE() { return l_SYSDATE; }

	public void setFINAL_MONTHLY_PROC_EXEC_DATE(String val) { m_FINAL_MONTHLY_PROC_EXEC_DATE = val; }
	public void setSYSDATE(String val) { m_SYSDATE = val; }


	public void setList_FINAL_MONTHLY_PROC_EXEC_DATE(List list) { l_FINAL_MONTHLY_PROC_EXEC_DATE = list; }
	public void setList_SYSDATE(List list) { l_SYSDATE = list; }

	public int setL2L_FINAL_MONTHLY_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_MONTHLY_PROC_EXEC_DATE == null) {
			l_FINAL_MONTHLY_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_FINAL_MONTHLY_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_MONTHLY_PROC_EXEC_DATE.add(((AK0020030Struct) list.get(i)).getFINAL_MONTHLY_PROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_SYSDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYSDATE == null) {
			l_SYSDATE = new ArrayList();
		} else {
			l_SYSDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYSDATE.add(((AK0020030Struct) list.get(i)).getSYSDATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FINAL_MONTHLY_PROC_EXEC_DATE = null;
		m_SYSDATE = null;

		l_FINAL_MONTHLY_PROC_EXEC_DATE = null;
		l_SYSDATE = null;

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
	 * medAK0020030クラスの標準コンストラクタ
	 */
	public AK0020030Struct()
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
	public void setStruct(AK0020030Struct struct)
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
	public void setStructM(AK0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFINAL_MONTHLY_PROC_EXEC_DATE(struct.getFINAL_MONTHLY_PROC_EXEC_DATE());
			this.setSYSDATE(struct.getSYSDATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AK0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FINAL_MONTHLY_PROC_EXEC_DATE(struct.getList_FINAL_MONTHLY_PROC_EXEC_DATE());
			this.setList_SYSDATE(struct.getList_SYSDATE());
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
	// 第 1 変数初期値： i_FINAL_MONTHLY_PROC_EXEC_DATE


	final static String i_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	// 第 2 変数初期値： i_SYSDATE


	final static String i_SYSDATE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FINAL_MONTHLY_PROC_EXEC_DATE

	final static String i_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	// 第 2 変数初期値： i_SYSDATE

	final static String i_SYSDATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FINAL_MONTHLY_PROC_EXEC_DATE = i_FINAL_MONTHLY_PROC_EXEC_DATE;
		m_SYSDATE = i_SYSDATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
