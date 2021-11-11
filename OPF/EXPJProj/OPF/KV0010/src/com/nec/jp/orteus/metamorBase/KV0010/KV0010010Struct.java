/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0010/src/com/nec/jp/orteus/metamorBase/KV0010/KV0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0010;

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

public class KV0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** 第 2 変数： m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** 第 3 変数： m_rdoPlantTyp3 */
	public String m_rdoPlantTyp3 = null;
	/** 第 4 変数： m_rdoPlantTyp4 */
	public String m_rdoPlantTyp4 = null;
	/** 第 5 変数： m_rdoPlantTyp5 */
	public String m_rdoPlantTyp5 = null;
	/** 第 6 変数： m_g_DIRECT_DLV_FLG */
	public String m_g_DIRECT_DLV_FLG = null;
	/** 第 7 変数： m_rdoPlantTyp6 */
	public String m_rdoPlantTyp6 = null;
	/** 第 8 変数： m_rdoPlantTyp7 */
	public String m_rdoPlantTyp7 = null;
	/** 第 9 変数： m_rdoPlantTyp8 */
	public String m_rdoPlantTyp8 = null;
	/** 第 10 変数： m_rdoPlantTyp9 */
	public String m_rdoPlantTyp9 = null;
	/** 第 11 変数： m_my_COMPANY_CD */
	public String m_my_COMPANY_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** 第 2 List変数： l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** 第 3 List変数： l_rdoPlantTyp3 */
	public List l_rdoPlantTyp3 = null;

	/** 第 4 List変数： l_rdoPlantTyp4 */
	public List l_rdoPlantTyp4 = null;

	/** 第 5 List変数： l_rdoPlantTyp5 */
	public List l_rdoPlantTyp5 = null;

	/** 第 6 List変数： l_g_DIRECT_DLV_FLG */
	public List l_g_DIRECT_DLV_FLG = null;

	/** 第 7 List変数： l_rdoPlantTyp6 */
	public List l_rdoPlantTyp6 = null;

	/** 第 8 List変数： l_rdoPlantTyp7 */
	public List l_rdoPlantTyp7 = null;

	/** 第 9 List変数： l_rdoPlantTyp8 */
	public List l_rdoPlantTyp8 = null;

	/** 第 10 List変数： l_rdoPlantTyp9 */
	public List l_rdoPlantTyp9 = null;

	/** 第 11 List変数： l_my_COMPANY_CD */
	public List l_my_COMPANY_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getrdoPlantTyp3() { return m_rdoPlantTyp3; }
	public String getrdoPlantTyp4() { return m_rdoPlantTyp4; }
	public String getrdoPlantTyp5() { return m_rdoPlantTyp5; }
	public String getg_DIRECT_DLV_FLG() { return m_g_DIRECT_DLV_FLG; }
	public String getrdoPlantTyp6() { return m_rdoPlantTyp6; }
	public String getrdoPlantTyp7() { return m_rdoPlantTyp7; }
	public String getrdoPlantTyp8() { return m_rdoPlantTyp8; }
	public String getrdoPlantTyp9() { return m_rdoPlantTyp9; }
	public String getmy_COMPANY_CD() { return m_my_COMPANY_CD; }

	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_rdoPlantTyp3() { return l_rdoPlantTyp3; }
	public List getList_rdoPlantTyp4() { return l_rdoPlantTyp4; }
	public List getList_rdoPlantTyp5() { return l_rdoPlantTyp5; }
	public List getList_g_DIRECT_DLV_FLG() { return l_g_DIRECT_DLV_FLG; }
	public List getList_rdoPlantTyp6() { return l_rdoPlantTyp6; }
	public List getList_rdoPlantTyp7() { return l_rdoPlantTyp7; }
	public List getList_rdoPlantTyp8() { return l_rdoPlantTyp8; }
	public List getList_rdoPlantTyp9() { return l_rdoPlantTyp9; }
	public List getList_my_COMPANY_CD() { return l_my_COMPANY_CD; }

	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setrdoPlantTyp3(String val) { m_rdoPlantTyp3 = val; }
	public void setrdoPlantTyp4(String val) { m_rdoPlantTyp4 = val; }
	public void setrdoPlantTyp5(String val) { m_rdoPlantTyp5 = val; }
	public void setg_DIRECT_DLV_FLG(String val) { m_g_DIRECT_DLV_FLG = val; }
	public void setrdoPlantTyp6(String val) { m_rdoPlantTyp6 = val; }
	public void setrdoPlantTyp7(String val) { m_rdoPlantTyp7 = val; }
	public void setrdoPlantTyp8(String val) { m_rdoPlantTyp8 = val; }
	public void setrdoPlantTyp9(String val) { m_rdoPlantTyp9 = val; }
	public void setmy_COMPANY_CD(String val) { m_my_COMPANY_CD = val; }


	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_rdoPlantTyp3(List list) { l_rdoPlantTyp3 = list; }
	public void setList_rdoPlantTyp4(List list) { l_rdoPlantTyp4 = list; }
	public void setList_rdoPlantTyp5(List list) { l_rdoPlantTyp5 = list; }
	public void setList_g_DIRECT_DLV_FLG(List list) { l_g_DIRECT_DLV_FLG = list; }
	public void setList_rdoPlantTyp6(List list) { l_rdoPlantTyp6 = list; }
	public void setList_rdoPlantTyp7(List list) { l_rdoPlantTyp7 = list; }
	public void setList_rdoPlantTyp8(List list) { l_rdoPlantTyp8 = list; }
	public void setList_rdoPlantTyp9(List list) { l_rdoPlantTyp9 = list; }
	public void setList_my_COMPANY_CD(List list) { l_my_COMPANY_CD = list; }

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
			l_rdoPlantTyp1.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp1());
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
			l_rdoPlantTyp2.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp3 == null) {
			l_rdoPlantTyp3 = new ArrayList();
		} else {
			l_rdoPlantTyp3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp3.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp3());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp4 == null) {
			l_rdoPlantTyp4 = new ArrayList();
		} else {
			l_rdoPlantTyp4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp4.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp4());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp5 == null) {
			l_rdoPlantTyp5 = new ArrayList();
		} else {
			l_rdoPlantTyp5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp5.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp5());
		}
		return size;
	}
	public int setL2L_g_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_DIRECT_DLV_FLG == null) {
			l_g_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_g_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_DIRECT_DLV_FLG.add(((KV0010010Struct) list.get(i)).getg_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp6 == null) {
			l_rdoPlantTyp6 = new ArrayList();
		} else {
			l_rdoPlantTyp6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp6.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp6());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp7 == null) {
			l_rdoPlantTyp7 = new ArrayList();
		} else {
			l_rdoPlantTyp7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp7.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp7());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp8 == null) {
			l_rdoPlantTyp8 = new ArrayList();
		} else {
			l_rdoPlantTyp8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp8.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp8());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp9 == null) {
			l_rdoPlantTyp9 = new ArrayList();
		} else {
			l_rdoPlantTyp9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp9.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp9());
		}
		return size;
	}
	public int setL2L_my_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_my_COMPANY_CD == null) {
			l_my_COMPANY_CD = new ArrayList();
		} else {
			l_my_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_my_COMPANY_CD.add(((KV0010010Struct) list.get(i)).getmy_COMPANY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_rdoPlantTyp3 = null;
		m_rdoPlantTyp4 = null;
		m_rdoPlantTyp5 = null;
		m_g_DIRECT_DLV_FLG = null;
		m_rdoPlantTyp6 = null;
		m_rdoPlantTyp7 = null;
		m_rdoPlantTyp8 = null;
		m_rdoPlantTyp9 = null;
		m_my_COMPANY_CD = null;

		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_rdoPlantTyp3 = null;
		l_rdoPlantTyp4 = null;
		l_rdoPlantTyp5 = null;
		l_g_DIRECT_DLV_FLG = null;
		l_rdoPlantTyp6 = null;
		l_rdoPlantTyp7 = null;
		l_rdoPlantTyp8 = null;
		l_rdoPlantTyp9 = null;
		l_my_COMPANY_CD = null;

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
	 * medKV0010010クラスの標準コンストラクタ
	 */
	public KV0010010Struct()
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
	public void setStruct(KV0010010Struct struct)
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
	public void setStructM(KV0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setrdoPlantTyp3(struct.getrdoPlantTyp3());
			this.setrdoPlantTyp4(struct.getrdoPlantTyp4());
			this.setrdoPlantTyp5(struct.getrdoPlantTyp5());
			this.setg_DIRECT_DLV_FLG(struct.getg_DIRECT_DLV_FLG());
			this.setrdoPlantTyp6(struct.getrdoPlantTyp6());
			this.setrdoPlantTyp7(struct.getrdoPlantTyp7());
			this.setrdoPlantTyp8(struct.getrdoPlantTyp8());
			this.setrdoPlantTyp9(struct.getrdoPlantTyp9());
			this.setmy_COMPANY_CD(struct.getmy_COMPANY_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KV0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_rdoPlantTyp3(struct.getList_rdoPlantTyp3());
			this.setList_rdoPlantTyp4(struct.getList_rdoPlantTyp4());
			this.setList_rdoPlantTyp5(struct.getList_rdoPlantTyp5());
			this.setList_g_DIRECT_DLV_FLG(struct.getList_g_DIRECT_DLV_FLG());
			this.setList_rdoPlantTyp6(struct.getList_rdoPlantTyp6());
			this.setList_rdoPlantTyp7(struct.getList_rdoPlantTyp7());
			this.setList_rdoPlantTyp8(struct.getList_rdoPlantTyp8());
			this.setList_rdoPlantTyp9(struct.getList_rdoPlantTyp9());
			this.setList_my_COMPANY_CD(struct.getList_my_COMPANY_CD());
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
	// 第 1 変数初期値： i_rdoPlantTyp1


	final static String i_rdoPlantTyp1 = null;

	// 第 2 変数初期値： i_rdoPlantTyp2


	final static String i_rdoPlantTyp2 = null;

	// 第 3 変数初期値： i_rdoPlantTyp3


	final static String i_rdoPlantTyp3 = null;

	// 第 4 変数初期値： i_rdoPlantTyp4


	final static String i_rdoPlantTyp4 = null;

	// 第 5 変数初期値： i_rdoPlantTyp5


	final static String i_rdoPlantTyp5 = null;

	// 第 6 変数初期値： i_g_DIRECT_DLV_FLG


	final static String i_g_DIRECT_DLV_FLG = null;

	// 第 7 変数初期値： i_rdoPlantTyp6


	final static String i_rdoPlantTyp6 = null;

	// 第 8 変数初期値： i_rdoPlantTyp7


	final static String i_rdoPlantTyp7 = null;

	// 第 9 変数初期値： i_rdoPlantTyp8


	final static String i_rdoPlantTyp8 = null;

	// 第 10 変数初期値： i_rdoPlantTyp9


	final static String i_rdoPlantTyp9 = null;

	// 第 11 変数初期値： i_my_COMPANY_CD


	final static String i_my_COMPANY_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_my_COMPANY_CD
        final static String i_my_COMPANY_CD = null;
        // 第 2 変数初期値： i_rdoPlantTyp1
        final static String i_rdoPlantTyp1 = null;
        // 第 3 変数初期値： i_rdoPlantTyp2
        final static String i_rdoPlantTyp2 = null;
        // 第 4 変数初期値： i_rdoPlantTyp3
        final static String i_rdoPlantTyp3 = null;
        // 第 5 変数初期値： i_rdoPlantTyp4
        final static String i_rdoPlantTyp4 = null;
        // 第 6 変数初期値： i_rdoPlantTyp5
        final static String i_rdoPlantTyp5 = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_my_COMPANY_CD = i_my_COMPANY_CD;
         m_rdoPlantTyp1 = i_rdoPlantTyp1;
         m_rdoPlantTyp2 = i_rdoPlantTyp2;
         m_rdoPlantTyp3 = i_rdoPlantTyp3;
         m_rdoPlantTyp4 = i_rdoPlantTyp4;
         m_rdoPlantTyp5 = i_rdoPlantTyp5;
         
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
