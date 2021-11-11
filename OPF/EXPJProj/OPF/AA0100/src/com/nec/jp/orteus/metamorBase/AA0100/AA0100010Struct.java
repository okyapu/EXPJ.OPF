/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/src/com/nec/jp/orteus/metamorBase/AA0100/AA0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0100;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0100010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** 第 2 変数： m_w_REC_COUNT */
	public Integer m_w_REC_COUNT = null;
	/** 第 3 変数： m_p_HOLIDAY_DATE */
	public String m_p_HOLIDAY_DATE = null;
	/** 第 4 変数： m_HOLIDAY_MMDD */
	public String m_HOLIDAY_MMDD = null;
	/** 第 5 変数： m_p_HOLIDAY_NAME */
	public String m_p_HOLIDAY_NAME = null;
	/** 第 6 変数： m_HOLIDAY_DATE */
	public String m_HOLIDAY_DATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** 第 2 List変数： l_w_REC_COUNT */
	public List l_w_REC_COUNT = null;

	/** 第 3 List変数： l_p_HOLIDAY_DATE */
	public List l_p_HOLIDAY_DATE = null;

	/** 第 4 List変数： l_HOLIDAY_MMDD */
	public List l_HOLIDAY_MMDD = null;

	/** 第 5 List変数： l_p_HOLIDAY_NAME */
	public List l_p_HOLIDAY_NAME = null;

	/** 第 6 List変数： l_HOLIDAY_DATE */
	public List l_HOLIDAY_DATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public Integer getw_REC_COUNT() { return m_w_REC_COUNT; }
	public String getp_HOLIDAY_DATE() { return m_p_HOLIDAY_DATE; }
	public String getHOLIDAY_MMDD() { return m_HOLIDAY_MMDD; }
	public String getp_HOLIDAY_NAME() { return m_p_HOLIDAY_NAME; }
	public String getHOLIDAY_DATE() { return m_HOLIDAY_DATE; }

	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_w_REC_COUNT() { return l_w_REC_COUNT; }
	public List getList_p_HOLIDAY_DATE() { return l_p_HOLIDAY_DATE; }
	public List getList_HOLIDAY_MMDD() { return l_HOLIDAY_MMDD; }
	public List getList_p_HOLIDAY_NAME() { return l_p_HOLIDAY_NAME; }
	public List getList_HOLIDAY_DATE() { return l_HOLIDAY_DATE; }

	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setw_REC_COUNT(Integer val) { m_w_REC_COUNT = val; }
	public void setp_HOLIDAY_DATE(String val) { m_p_HOLIDAY_DATE = val; }
	public void setHOLIDAY_MMDD(String val) { m_HOLIDAY_MMDD = val; }
	public void setp_HOLIDAY_NAME(String val) { m_p_HOLIDAY_NAME = val; }
	public void setHOLIDAY_DATE(String val) { m_HOLIDAY_DATE = val; }

	public void setw_REC_COUNT(String val) { m_w_REC_COUNT = getInteger(val); }

	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_w_REC_COUNT(List list) { l_w_REC_COUNT = list; }
	public void setList_p_HOLIDAY_DATE(List list) { l_p_HOLIDAY_DATE = list; }
	public void setList_HOLIDAY_MMDD(List list) { l_HOLIDAY_MMDD = list; }
	public void setList_p_HOLIDAY_NAME(List list) { l_p_HOLIDAY_NAME = list; }
	public void setList_HOLIDAY_DATE(List list) { l_HOLIDAY_DATE = list; }

	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AA0100010Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_REC_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_REC_COUNT == null) {
			l_w_REC_COUNT = new ArrayList();
		} else {
			l_w_REC_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_REC_COUNT.add(((AA0100010Struct) list.get(i)).getw_REC_COUNT());
		}
		return size;
	}
	public int setL2L_p_HOLIDAY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_HOLIDAY_DATE == null) {
			l_p_HOLIDAY_DATE = new ArrayList();
		} else {
			l_p_HOLIDAY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_HOLIDAY_DATE.add(((AA0100010Struct) list.get(i)).getp_HOLIDAY_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_MMDD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_MMDD == null) {
			l_HOLIDAY_MMDD = new ArrayList();
		} else {
			l_HOLIDAY_MMDD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_MMDD.add(((AA0100010Struct) list.get(i)).getHOLIDAY_MMDD());
		}
		return size;
	}
	public int setL2L_p_HOLIDAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_HOLIDAY_NAME == null) {
			l_p_HOLIDAY_NAME = new ArrayList();
		} else {
			l_p_HOLIDAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_HOLIDAY_NAME.add(((AA0100010Struct) list.get(i)).getp_HOLIDAY_NAME());
		}
		return size;
	}
	public int setL2L_HOLIDAY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_DATE == null) {
			l_HOLIDAY_DATE = new ArrayList();
		} else {
			l_HOLIDAY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_DATE.add(((AA0100010Struct) list.get(i)).getHOLIDAY_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_MODIFY_COUNT = null;
		m_w_REC_COUNT = null;
		m_p_HOLIDAY_DATE = null;
		m_HOLIDAY_MMDD = null;
		m_p_HOLIDAY_NAME = null;
		m_HOLIDAY_DATE = null;

		l_w_MODIFY_COUNT = null;
		l_w_REC_COUNT = null;
		l_p_HOLIDAY_DATE = null;
		l_HOLIDAY_MMDD = null;
		l_p_HOLIDAY_NAME = null;
		l_HOLIDAY_DATE = null;

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
	 * medAA0100010クラスの標準コンストラクタ
	 */
	public AA0100010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AA0100010Struct struct)
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
	public void setStructM(AA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setw_REC_COUNT(struct.getw_REC_COUNT());
			this.setp_HOLIDAY_DATE(struct.getp_HOLIDAY_DATE());
			this.setHOLIDAY_MMDD(struct.getHOLIDAY_MMDD());
			this.setp_HOLIDAY_NAME(struct.getp_HOLIDAY_NAME());
			this.setHOLIDAY_DATE(struct.getHOLIDAY_DATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_w_REC_COUNT(struct.getList_w_REC_COUNT());
			this.setList_p_HOLIDAY_DATE(struct.getList_p_HOLIDAY_DATE());
			this.setList_HOLIDAY_MMDD(struct.getList_HOLIDAY_MMDD());
			this.setList_p_HOLIDAY_NAME(struct.getList_p_HOLIDAY_NAME());
			this.setList_HOLIDAY_DATE(struct.getList_HOLIDAY_DATE());
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
	// 第 1 変数初期値： i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// 第 2 変数初期値： i_w_REC_COUNT


	final static Integer i_w_REC_COUNT = null;

	// 第 3 変数初期値： i_p_HOLIDAY_DATE


	final static String i_p_HOLIDAY_DATE = null;

	// 第 4 変数初期値： i_HOLIDAY_MMDD


	final static String i_HOLIDAY_MMDD = null;

	// 第 5 変数初期値： i_p_HOLIDAY_NAME


	final static String i_p_HOLIDAY_NAME = null;

	// 第 6 変数初期値： i_HOLIDAY_DATE


	final static String i_HOLIDAY_DATE = null;

*/

	//{{user_implement_code
        //--------------------------------------------------------------------------
       
        /**
         * 初期化
         */
        public void initialize()
        {
         m_p_HOLIDAY_DATE = null;
         m_p_HOLIDAY_NAME = null;
         m_w_MODIFY_COUNT = null;
         m_HOLIDAY_DATE = null;
        }
       
        /**
         * 直持ち変数のコピー
         * @param コピー元
         */
        public void copy(AA0100010Struct s)
        {
         clear();
         if(s.m_p_HOLIDAY_DATE != null) m_p_HOLIDAY_DATE = new String(s.m_p_HOLIDAY_DATE);
         if(s.m_HOLIDAY_MMDD != null) m_HOLIDAY_MMDD = new String(s.m_HOLIDAY_MMDD);
         if(s.m_p_HOLIDAY_NAME != null) m_p_HOLIDAY_NAME = new String(s.m_p_HOLIDAY_NAME);
         if(s.m_w_MODIFY_COUNT != null) m_w_MODIFY_COUNT = new String(s.m_w_MODIFY_COUNT);
         if(s.m_HOLIDAY_DATE != null) m_HOLIDAY_DATE = new String(s.m_HOLIDAY_DATE);
         if(s.m_w_REC_COUNT != null) m_w_REC_COUNT = new Integer(s.m_w_REC_COUNT.intValue());
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sOrganization_CD != null) sOrganization_CD = new String(s.sOrganization_CD);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
        }
        /**
         * 年月日のコピー
         * @param キーのコピー元
         */
        public void keycopy(AA0100010Struct struct)
        {
         if(struct.m_HOLIDAY_DATE != null){
          m_HOLIDAY_DATE = new String(struct.m_HOLIDAY_DATE);
         }
        }
        /**
         * 年＆その他をそれぞれ持つインスタンスの情報をマージ。
         * 年月日の設定も行う<br>
         * 月日の情報は その他情報に設定されている形式に関わらず MM/DD形式を設定。
         * @param AA0100010Struct year 年の情報を持つインスタンス
         * @param AA0100010Struct other その他情報を持つインスタンス
         * @return true:OK / false:NG(フォーマット不正等)
         */
        public boolean merge(AA0100010Struct year, AA0100010Struct other)
        {
         // 日付形式の変換
         String tmpDate = year.m_HOLIDAY_DATE + "/" + other.m_HOLIDAY_MMDD;
         DateConverter conv = new DateConverter();
         String yymmdd = null, mmdd = null;
         if((yymmdd = conv.str2formal(tmpDate)) == null || (mmdd = conv.str2mmdd(tmpDate)) == null)
          return false;
       
         copy(other);
         keycopy(year);
       
         m_p_HOLIDAY_DATE = new String(yymmdd);
         m_HOLIDAY_MMDD = new String(mmdd);
         return true;
        }
        /**
         * 自身の内容を文字列返却
         * @return 情報
         */
        public String contents()
        {
         String s = "p_HOLIDAY_DATE[" + m_p_HOLIDAY_DATE + "] "
         + "HOLIDAY_MMDD[" + m_HOLIDAY_MMDD + "] "
         + "p_HOLIDAY_NAME[" + m_p_HOLIDAY_NAME + "] "
         + "w_MODIFY_COUNT[" + m_w_MODIFY_COUNT + "] "
         + "HOLIDAY_DATE[" + m_HOLIDAY_DATE + "] "
         + "w_REC_COUNT[" + m_w_REC_COUNT + "]";
         return s;
        }
       
        //}}user_implement_code

	//////////////////////////////

}
