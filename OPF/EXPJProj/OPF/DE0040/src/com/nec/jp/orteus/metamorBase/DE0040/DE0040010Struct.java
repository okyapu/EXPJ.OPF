/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0040/src/com/nec/jp/orteus/metamorBase/DE0040/DE0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0040;

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

public class DE0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 2 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 3 変数： m_CS_CALC_TRN_PERIOD */
	public String m_CS_CALC_TRN_PERIOD = null;
	/** 第 4 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 5 変数： m_COST_TYP */
	public String m_COST_TYP = null;
	/** 第 6 変数： m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** 第 7 変数： m_COST_TYP_val */
	public String m_COST_TYP_val = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 2 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 3 List変数： l_CS_CALC_TRN_PERIOD */
	public List l_CS_CALC_TRN_PERIOD = null;

	/** 第 4 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 5 List変数： l_COST_TYP */
	public List l_COST_TYP = null;

	/** 第 6 List変数： l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** 第 7 List変数： l_COST_TYP_val */
	public List l_COST_TYP_val = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCS_CALC_TRN_PERIOD() { return m_CS_CALC_TRN_PERIOD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }

	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CS_CALC_TRN_PERIOD() { return l_CS_CALC_TRN_PERIOD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }

	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCS_CALC_TRN_PERIOD(String val) { m_CS_CALC_TRN_PERIOD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }


	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CS_CALC_TRN_PERIOD(List list) { l_CS_CALC_TRN_PERIOD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }

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
			l_PLANT_NAME.add(((DE0040010Struct) list.get(i)).getPLANT_NAME());
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
			l_PLANT_CD.add(((DE0040010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_CS_CALC_TRN_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_TRN_PERIOD == null) {
			l_CS_CALC_TRN_PERIOD = new ArrayList();
		} else {
			l_CS_CALC_TRN_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_TRN_PERIOD.add(((DE0040010Struct) list.get(i)).getCS_CALC_TRN_PERIOD());
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
			l_MODIFY_COUNT.add(((DE0040010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DE0040010Struct) list.get(i)).getCOST_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_name == null) {
			l_COST_TYP_name = new ArrayList();
		} else {
			l_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_name.add(((DE0040010Struct) list.get(i)).getCOST_TYP_name());
		}
		return size;
	}
	public int setL2L_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_val == null) {
			l_COST_TYP_val = new ArrayList();
		} else {
			l_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_val.add(((DE0040010Struct) list.get(i)).getCOST_TYP_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_CS_CALC_TRN_PERIOD = null;
		m_MODIFY_COUNT = null;
		m_COST_TYP = null;
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;

		l_PLANT_NAME = null;
		l_PLANT_CD = null;
		l_CS_CALC_TRN_PERIOD = null;
		l_MODIFY_COUNT = null;
		l_COST_TYP = null;
		l_COST_TYP_name = null;
		l_COST_TYP_val = null;

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
	 * medDE0040010クラスの標準コンストラクタ
	 */
	public DE0040010Struct()
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
	public void setStruct(DE0040010Struct struct)
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
	public void setStructM(DE0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCS_CALC_TRN_PERIOD(struct.getCS_CALC_TRN_PERIOD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DE0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CS_CALC_TRN_PERIOD(struct.getList_CS_CALC_TRN_PERIOD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
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
	// 第 1 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 2 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 3 変数初期値： i_CS_CALC_TRN_PERIOD


	final static String i_CS_CALC_TRN_PERIOD = null;

	// 第 4 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 5 変数初期値： i_COST_TYP


	final static String i_COST_TYP = null;

	// 第 6 変数初期値： i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// 第 7 変数初期値： i_COST_TYP_val


	final static String i_COST_TYP_val = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 2 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 3 変数初期値： i_CS_CALC_TRN_PERIOD
        final static String i_CS_CALC_TRN_PERIOD = null;
        // 第 4 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 5 変数初期値： i_COST_TYP
        final static String i_COST_TYP = null;
        // 第 6 変数初期値： i_COST_TYP_name
        final static String i_COST_TYP_name = null;
        // 第 7 変数初期値： i_COST_TYP_val
        final static String i_COST_TYP_val = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PLANT_NAME = i_PLANT_NAME;
         m_PLANT_CD = i_PLANT_CD;
         m_CS_CALC_TRN_PERIOD = i_CS_CALC_TRN_PERIOD;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_COST_TYP = i_COST_TYP;
         m_COST_TYP_name = i_COST_TYP_name;
         m_COST_TYP_val = i_COST_TYP_val;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
