/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0010/src/com/nec/jp/orteus/metamorBase/DB0010/DB0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0010;

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

public class DB0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_c_Extract */
	public String m_c_Extract = null;
	/** 第 2 変数： m_r1_UpdateMode */
	public String m_r1_UpdateMode = null;
	/** 第 3 変数： m_r2_UpdateMode */
	public String m_r2_UpdateMode = null;
	/** 第 4 変数： m_c_ShelfRegist */
	public String m_c_ShelfRegist = null;
	/** 第 5 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 6 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 7 変数： m_PC_FLG */
	public String m_PC_FLG = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_c_Extract */
	public List l_c_Extract = null;

	/** 第 2 List変数： l_r1_UpdateMode */
	public List l_r1_UpdateMode = null;

	/** 第 3 List変数： l_r2_UpdateMode */
	public List l_r2_UpdateMode = null;

	/** 第 4 List変数： l_c_ShelfRegist */
	public List l_c_ShelfRegist = null;

	/** 第 5 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 6 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 7 List変数： l_PC_FLG */
	public List l_PC_FLG = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getc_Extract() { return m_c_Extract; }
	public String getr1_UpdateMode() { return m_r1_UpdateMode; }
	public String getr2_UpdateMode() { return m_r2_UpdateMode; }
	public String getc_ShelfRegist() { return m_c_ShelfRegist; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPC_FLG() { return m_PC_FLG; }

	public List getList_c_Extract() { return l_c_Extract; }
	public List getList_r1_UpdateMode() { return l_r1_UpdateMode; }
	public List getList_r2_UpdateMode() { return l_r2_UpdateMode; }
	public List getList_c_ShelfRegist() { return l_c_ShelfRegist; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PC_FLG() { return l_PC_FLG; }

	public void setc_Extract(String val) { m_c_Extract = val; }
	public void setr1_UpdateMode(String val) { m_r1_UpdateMode = val; }
	public void setr2_UpdateMode(String val) { m_r2_UpdateMode = val; }
	public void setc_ShelfRegist(String val) { m_c_ShelfRegist = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPC_FLG(String val) { m_PC_FLG = val; }


	public void setList_c_Extract(List list) { l_c_Extract = list; }
	public void setList_r1_UpdateMode(List list) { l_r1_UpdateMode = list; }
	public void setList_r2_UpdateMode(List list) { l_r2_UpdateMode = list; }
	public void setList_c_ShelfRegist(List list) { l_c_ShelfRegist = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PC_FLG(List list) { l_PC_FLG = list; }

	public int setL2L_c_Extract(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_Extract == null) {
			l_c_Extract = new ArrayList();
		} else {
			l_c_Extract.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_Extract.add(((DB0010010Struct) list.get(i)).getc_Extract());
		}
		return size;
	}
	public int setL2L_r1_UpdateMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_UpdateMode == null) {
			l_r1_UpdateMode = new ArrayList();
		} else {
			l_r1_UpdateMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_UpdateMode.add(((DB0010010Struct) list.get(i)).getr1_UpdateMode());
		}
		return size;
	}
	public int setL2L_r2_UpdateMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_UpdateMode == null) {
			l_r2_UpdateMode = new ArrayList();
		} else {
			l_r2_UpdateMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_UpdateMode.add(((DB0010010Struct) list.get(i)).getr2_UpdateMode());
		}
		return size;
	}
	public int setL2L_c_ShelfRegist(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ShelfRegist == null) {
			l_c_ShelfRegist = new ArrayList();
		} else {
			l_c_ShelfRegist.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ShelfRegist.add(((DB0010010Struct) list.get(i)).getc_ShelfRegist());
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
			l_PLANT_CD.add(((DB0010010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((DB0010010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_PC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PC_FLG == null) {
			l_PC_FLG = new ArrayList();
		} else {
			l_PC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PC_FLG.add(((DB0010010Struct) list.get(i)).getPC_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_c_Extract = null;
		m_r1_UpdateMode = null;
		m_r2_UpdateMode = null;
		m_c_ShelfRegist = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_PC_FLG = null;

		l_c_Extract = null;
		l_r1_UpdateMode = null;
		l_r2_UpdateMode = null;
		l_c_ShelfRegist = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_PC_FLG = null;

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
	 * medDB0010010クラスの標準コンストラクタ
	 */
	public DB0010010Struct()
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
	public void setStruct(DB0010010Struct struct)
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
	public void setStructM(DB0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setc_Extract(struct.getc_Extract());
			this.setr1_UpdateMode(struct.getr1_UpdateMode());
			this.setr2_UpdateMode(struct.getr2_UpdateMode());
			this.setc_ShelfRegist(struct.getc_ShelfRegist());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPC_FLG(struct.getPC_FLG());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DB0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_c_Extract(struct.getList_c_Extract());
			this.setList_r1_UpdateMode(struct.getList_r1_UpdateMode());
			this.setList_r2_UpdateMode(struct.getList_r2_UpdateMode());
			this.setList_c_ShelfRegist(struct.getList_c_ShelfRegist());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PC_FLG(struct.getList_PC_FLG());
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
	// 第 1 変数初期値： i_c_Extract


	final static String i_c_Extract = null;

	// 第 2 変数初期値： i_r1_UpdateMode


	final static String i_r1_UpdateMode = null;

	// 第 3 変数初期値： i_r2_UpdateMode


	final static String i_r2_UpdateMode = null;

	// 第 4 変数初期値： i_c_ShelfRegist


	final static String i_c_ShelfRegist = null;

	// 第 5 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 6 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 7 変数初期値： i_PC_FLG


	final static String i_PC_FLG = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 2 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 3 変数初期値： i_c_Extract
        final static String i_c_Extract = null;
        // 第 4 変数初期値： i_r1_UpdateMode
        final static String i_r1_UpdateMode = null;
        // 第 5 変数初期値： i_r2_UpdateMode
        final static String i_r2_UpdateMode = null;
        // 第 6 変数初期値： i_c_ShelfRegist
        final static String i_c_ShelfRegist = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PLANT_CD = i_PLANT_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_c_Extract = i_c_Extract;
         m_r1_UpdateMode = i_r1_UpdateMode;
         m_r2_UpdateMode = i_r2_UpdateMode;
         m_c_ShelfRegist = i_c_ShelfRegist;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
