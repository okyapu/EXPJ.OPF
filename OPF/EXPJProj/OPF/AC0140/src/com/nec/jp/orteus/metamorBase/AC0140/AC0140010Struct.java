/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0140/src/com/nec/jp/orteus/metamorBase/AC0140/AC0140010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0140;

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

public class AC0140010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_jobOdrCd */
	public String m_jobOdrCd = null;
	/** 第 2 変数： m_txtjobOdrCd */
	public String m_txtjobOdrCd = null;
	/** 第 3 変数： m_sysPlantCd */
	public String m_sysPlantCd = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_jobOdrCd */
	public List l_jobOdrCd = null;

	/** 第 2 List変数： l_txtjobOdrCd */
	public List l_txtjobOdrCd = null;

	/** 第 3 List変数： l_sysPlantCd */
	public List l_sysPlantCd = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getjobOdrCd() { return m_jobOdrCd; }
	public String gettxtjobOdrCd() { return m_txtjobOdrCd; }
	public String getsysPlantCd() { return m_sysPlantCd; }

	public List getList_jobOdrCd() { return l_jobOdrCd; }
	public List getList_txtjobOdrCd() { return l_txtjobOdrCd; }
	public List getList_sysPlantCd() { return l_sysPlantCd; }

	public void setjobOdrCd(String val) { m_jobOdrCd = val; }
	public void settxtjobOdrCd(String val) { m_txtjobOdrCd = val; }
	public void setsysPlantCd(String val) { m_sysPlantCd = val; }


	public void setList_jobOdrCd(List list) { l_jobOdrCd = list; }
	public void setList_txtjobOdrCd(List list) { l_txtjobOdrCd = list; }
	public void setList_sysPlantCd(List list) { l_sysPlantCd = list; }

	public int setL2L_jobOdrCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_jobOdrCd == null) {
			l_jobOdrCd = new ArrayList();
		} else {
			l_jobOdrCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_jobOdrCd.add(((AC0140010Struct) list.get(i)).getjobOdrCd());
		}
		return size;
	}
	public int setL2L_txtjobOdrCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtjobOdrCd == null) {
			l_txtjobOdrCd = new ArrayList();
		} else {
			l_txtjobOdrCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtjobOdrCd.add(((AC0140010Struct) list.get(i)).gettxtjobOdrCd());
		}
		return size;
	}
	public int setL2L_sysPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysPlantCd == null) {
			l_sysPlantCd = new ArrayList();
		} else {
			l_sysPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysPlantCd.add(((AC0140010Struct) list.get(i)).getsysPlantCd());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_jobOdrCd = null;
		m_txtjobOdrCd = null;
		m_sysPlantCd = null;

		l_jobOdrCd = null;
		l_txtjobOdrCd = null;
		l_sysPlantCd = null;

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
	 * medAC0140010クラスの標準コンストラクタ
	 */
	public AC0140010Struct()
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
	public void setStruct(AC0140010Struct struct)
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
	public void setStructM(AC0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setjobOdrCd(struct.getjobOdrCd());
			this.settxtjobOdrCd(struct.gettxtjobOdrCd());
			this.setsysPlantCd(struct.getsysPlantCd());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_jobOdrCd(struct.getList_jobOdrCd());
			this.setList_txtjobOdrCd(struct.getList_txtjobOdrCd());
			this.setList_sysPlantCd(struct.getList_sysPlantCd());
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
	// 第 1 変数初期値： i_jobOdrCd


	final static String i_jobOdrCd = null;

	// 第 2 変数初期値： i_txtjobOdrCd


	final static String i_txtjobOdrCd = null;

	// 第 3 変数初期値： i_sysPlantCd


	final static String i_sysPlantCd = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_jobOdrCd
        final static String i_jobOdrCd = null;
        // 第 2 変数初期値： i_txtjobOdrCd
        final static String i_txtjobOdrCd = null;

       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_jobOdrCd = i_jobOdrCd;
         m_txtjobOdrCd = i_txtjobOdrCd;

        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
