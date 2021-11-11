/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0040;

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
 * CLASS     : KV0040010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:25:57 $
 *
 */
//}}user_implement_code_header

public class KV0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DELETE_RECKON_YM */
	public String m_DELETE_RECKON_YM = null;
	/** 第 2 変数： m_SALES_PLAN_TERM_LAST_YM */
	public String m_SALES_PLAN_TERM_LAST_YM = null;
	/** 第 3 変数： m_ODR_SHIP_TERM_LAST_YM */
	public String m_ODR_SHIP_TERM_LAST_YM = null;
	/** 第 4 変数： m_SALES_TERM_LAST_YM */
	public String m_SALES_TERM_LAST_YM = null;
	/** 第 5 変数： m_EDI_TERM_LAST_YM */
	public String m_EDI_TERM_LAST_YM = null;
	/** 第 6 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 7 変数： m_BUSINESS_CTRL_DATE */
	public String m_BUSINESS_CTRL_DATE = null;
	/** 第 8 変数： m_CODE */
	public String m_CODE = null;
	/** 第 9 変数： m_SALES_PLAN_TERM */
	public String m_SALES_PLAN_TERM = null;
	/** 第 10 変数： m_ODR_SHIP_TERM */
	public String m_ODR_SHIP_TERM = null;
	/** 第 11 変数： m_SALES_TERM */
	public String m_SALES_TERM = null;
	/** 第 12 変数： m_EDI_TERM */
	public String m_EDI_TERM = null;
	/** 第 13 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DELETE_RECKON_YM */
	public List l_DELETE_RECKON_YM = null;

	/** 第 2 List変数： l_SALES_PLAN_TERM_LAST_YM */
	public List l_SALES_PLAN_TERM_LAST_YM = null;

	/** 第 3 List変数： l_ODR_SHIP_TERM_LAST_YM */
	public List l_ODR_SHIP_TERM_LAST_YM = null;

	/** 第 4 List変数： l_SALES_TERM_LAST_YM */
	public List l_SALES_TERM_LAST_YM = null;

	/** 第 5 List変数： l_EDI_TERM_LAST_YM */
	public List l_EDI_TERM_LAST_YM = null;

	/** 第 6 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 7 List変数： l_BUSINESS_CTRL_DATE */
	public List l_BUSINESS_CTRL_DATE = null;

	/** 第 8 List変数： l_CODE */
	public List l_CODE = null;

	/** 第 9 List変数： l_SALES_PLAN_TERM */
	public List l_SALES_PLAN_TERM = null;

	/** 第 10 List変数： l_ODR_SHIP_TERM */
	public List l_ODR_SHIP_TERM = null;

	/** 第 11 List変数： l_SALES_TERM */
	public List l_SALES_TERM = null;

	/** 第 12 List変数： l_EDI_TERM */
	public List l_EDI_TERM = null;

	/** 第 13 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDELETE_RECKON_YM() { return m_DELETE_RECKON_YM; }
	public String getSALES_PLAN_TERM_LAST_YM() { return m_SALES_PLAN_TERM_LAST_YM; }
	public String getODR_SHIP_TERM_LAST_YM() { return m_ODR_SHIP_TERM_LAST_YM; }
	public String getSALES_TERM_LAST_YM() { return m_SALES_TERM_LAST_YM; }
	public String getEDI_TERM_LAST_YM() { return m_EDI_TERM_LAST_YM; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getBUSINESS_CTRL_DATE() { return m_BUSINESS_CTRL_DATE; }
	public String getCODE() { return m_CODE; }
	public String getSALES_PLAN_TERM() { return m_SALES_PLAN_TERM; }
	public String getODR_SHIP_TERM() { return m_ODR_SHIP_TERM; }
	public String getSALES_TERM() { return m_SALES_TERM; }
	public String getEDI_TERM() { return m_EDI_TERM; }
	public String getPLANT_CD() { return m_PLANT_CD; }

	public List getList_DELETE_RECKON_YM() { return l_DELETE_RECKON_YM; }
	public List getList_SALES_PLAN_TERM_LAST_YM() { return l_SALES_PLAN_TERM_LAST_YM; }
	public List getList_ODR_SHIP_TERM_LAST_YM() { return l_ODR_SHIP_TERM_LAST_YM; }
	public List getList_SALES_TERM_LAST_YM() { return l_SALES_TERM_LAST_YM; }
	public List getList_EDI_TERM_LAST_YM() { return l_EDI_TERM_LAST_YM; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_BUSINESS_CTRL_DATE() { return l_BUSINESS_CTRL_DATE; }
	public List getList_CODE() { return l_CODE; }
	public List getList_SALES_PLAN_TERM() { return l_SALES_PLAN_TERM; }
	public List getList_ODR_SHIP_TERM() { return l_ODR_SHIP_TERM; }
	public List getList_SALES_TERM() { return l_SALES_TERM; }
	public List getList_EDI_TERM() { return l_EDI_TERM; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }

	public void setDELETE_RECKON_YM(String val) { m_DELETE_RECKON_YM = val; }
	public void setSALES_PLAN_TERM_LAST_YM(String val) { m_SALES_PLAN_TERM_LAST_YM = val; }
	public void setODR_SHIP_TERM_LAST_YM(String val) { m_ODR_SHIP_TERM_LAST_YM = val; }
	public void setSALES_TERM_LAST_YM(String val) { m_SALES_TERM_LAST_YM = val; }
	public void setEDI_TERM_LAST_YM(String val) { m_EDI_TERM_LAST_YM = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setBUSINESS_CTRL_DATE(String val) { m_BUSINESS_CTRL_DATE = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setSALES_PLAN_TERM(String val) { m_SALES_PLAN_TERM = val; }
	public void setODR_SHIP_TERM(String val) { m_ODR_SHIP_TERM = val; }
	public void setSALES_TERM(String val) { m_SALES_TERM = val; }
	public void setEDI_TERM(String val) { m_EDI_TERM = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }


	public void setList_DELETE_RECKON_YM(List list) { l_DELETE_RECKON_YM = list; }
	public void setList_SALES_PLAN_TERM_LAST_YM(List list) { l_SALES_PLAN_TERM_LAST_YM = list; }
	public void setList_ODR_SHIP_TERM_LAST_YM(List list) { l_ODR_SHIP_TERM_LAST_YM = list; }
	public void setList_SALES_TERM_LAST_YM(List list) { l_SALES_TERM_LAST_YM = list; }
	public void setList_EDI_TERM_LAST_YM(List list) { l_EDI_TERM_LAST_YM = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_BUSINESS_CTRL_DATE(List list) { l_BUSINESS_CTRL_DATE = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_SALES_PLAN_TERM(List list) { l_SALES_PLAN_TERM = list; }
	public void setList_ODR_SHIP_TERM(List list) { l_ODR_SHIP_TERM = list; }
	public void setList_SALES_TERM(List list) { l_SALES_TERM = list; }
	public void setList_EDI_TERM(List list) { l_EDI_TERM = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }

	public int setL2L_DELETE_RECKON_YM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DELETE_RECKON_YM == null) {
			l_DELETE_RECKON_YM = new ArrayList();
		} else {
			l_DELETE_RECKON_YM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DELETE_RECKON_YM.add(((KV0040010Struct) list.get(i)).getDELETE_RECKON_YM());
		}
		return size;
	}
	public int setL2L_SALES_PLAN_TERM_LAST_YM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_PLAN_TERM_LAST_YM == null) {
			l_SALES_PLAN_TERM_LAST_YM = new ArrayList();
		} else {
			l_SALES_PLAN_TERM_LAST_YM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_PLAN_TERM_LAST_YM.add(((KV0040010Struct) list.get(i)).getSALES_PLAN_TERM_LAST_YM());
		}
		return size;
	}
	public int setL2L_ODR_SHIP_TERM_LAST_YM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_SHIP_TERM_LAST_YM == null) {
			l_ODR_SHIP_TERM_LAST_YM = new ArrayList();
		} else {
			l_ODR_SHIP_TERM_LAST_YM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_SHIP_TERM_LAST_YM.add(((KV0040010Struct) list.get(i)).getODR_SHIP_TERM_LAST_YM());
		}
		return size;
	}
	public int setL2L_SALES_TERM_LAST_YM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_TERM_LAST_YM == null) {
			l_SALES_TERM_LAST_YM = new ArrayList();
		} else {
			l_SALES_TERM_LAST_YM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_TERM_LAST_YM.add(((KV0040010Struct) list.get(i)).getSALES_TERM_LAST_YM());
		}
		return size;
	}
	public int setL2L_EDI_TERM_LAST_YM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_TERM_LAST_YM == null) {
			l_EDI_TERM_LAST_YM = new ArrayList();
		} else {
			l_EDI_TERM_LAST_YM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_TERM_LAST_YM.add(((KV0040010Struct) list.get(i)).getEDI_TERM_LAST_YM());
		}
		return size;
	}
	public int setL2L_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPANY_CD == null) {
			l_COMPANY_CD = new ArrayList();
		} else {
			l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPANY_CD.add(((KV0040010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_CTRL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_CTRL_DATE == null) {
			l_BUSINESS_CTRL_DATE = new ArrayList();
		} else {
			l_BUSINESS_CTRL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_CTRL_DATE.add(((KV0040010Struct) list.get(i)).getBUSINESS_CTRL_DATE());
		}
		return size;
	}
	public int setL2L_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CODE == null) {
			l_CODE = new ArrayList();
		} else {
			l_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CODE.add(((KV0040010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_SALES_PLAN_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_PLAN_TERM == null) {
			l_SALES_PLAN_TERM = new ArrayList();
		} else {
			l_SALES_PLAN_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_PLAN_TERM.add(((KV0040010Struct) list.get(i)).getSALES_PLAN_TERM());
		}
		return size;
	}
	public int setL2L_ODR_SHIP_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_SHIP_TERM == null) {
			l_ODR_SHIP_TERM = new ArrayList();
		} else {
			l_ODR_SHIP_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_SHIP_TERM.add(((KV0040010Struct) list.get(i)).getODR_SHIP_TERM());
		}
		return size;
	}
	public int setL2L_SALES_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_TERM == null) {
			l_SALES_TERM = new ArrayList();
		} else {
			l_SALES_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_TERM.add(((KV0040010Struct) list.get(i)).getSALES_TERM());
		}
		return size;
	}
	public int setL2L_EDI_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_TERM == null) {
			l_EDI_TERM = new ArrayList();
		} else {
			l_EDI_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_TERM.add(((KV0040010Struct) list.get(i)).getEDI_TERM());
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
			l_PLANT_CD.add(((KV0040010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DELETE_RECKON_YM = null;
		m_SALES_PLAN_TERM_LAST_YM = null;
		m_ODR_SHIP_TERM_LAST_YM = null;
		m_SALES_TERM_LAST_YM = null;
		m_EDI_TERM_LAST_YM = null;
		m_COMPANY_CD = null;
		m_BUSINESS_CTRL_DATE = null;
		m_CODE = null;
		m_SALES_PLAN_TERM = null;
		m_ODR_SHIP_TERM = null;
		m_SALES_TERM = null;
		m_EDI_TERM = null;
		m_PLANT_CD = null;

		l_DELETE_RECKON_YM = null;
		l_SALES_PLAN_TERM_LAST_YM = null;
		l_ODR_SHIP_TERM_LAST_YM = null;
		l_SALES_TERM_LAST_YM = null;
		l_EDI_TERM_LAST_YM = null;
		l_COMPANY_CD = null;
		l_BUSINESS_CTRL_DATE = null;
		l_CODE = null;
		l_SALES_PLAN_TERM = null;
		l_ODR_SHIP_TERM = null;
		l_SALES_TERM = null;
		l_EDI_TERM = null;
		l_PLANT_CD = null;

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
	 * medKV0040010クラスの標準コンストラクタ
	 */
	public KV0040010Struct()
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
	public void setStruct(KV0040010Struct struct)
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
	public void setStructM(KV0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDELETE_RECKON_YM(struct.getDELETE_RECKON_YM());
			this.setSALES_PLAN_TERM_LAST_YM(struct.getSALES_PLAN_TERM_LAST_YM());
			this.setODR_SHIP_TERM_LAST_YM(struct.getODR_SHIP_TERM_LAST_YM());
			this.setSALES_TERM_LAST_YM(struct.getSALES_TERM_LAST_YM());
			this.setEDI_TERM_LAST_YM(struct.getEDI_TERM_LAST_YM());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setBUSINESS_CTRL_DATE(struct.getBUSINESS_CTRL_DATE());
			this.setCODE(struct.getCODE());
			this.setSALES_PLAN_TERM(struct.getSALES_PLAN_TERM());
			this.setODR_SHIP_TERM(struct.getODR_SHIP_TERM());
			this.setSALES_TERM(struct.getSALES_TERM());
			this.setEDI_TERM(struct.getEDI_TERM());
			this.setPLANT_CD(struct.getPLANT_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KV0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DELETE_RECKON_YM(struct.getList_DELETE_RECKON_YM());
			this.setList_SALES_PLAN_TERM_LAST_YM(struct.getList_SALES_PLAN_TERM_LAST_YM());
			this.setList_ODR_SHIP_TERM_LAST_YM(struct.getList_ODR_SHIP_TERM_LAST_YM());
			this.setList_SALES_TERM_LAST_YM(struct.getList_SALES_TERM_LAST_YM());
			this.setList_EDI_TERM_LAST_YM(struct.getList_EDI_TERM_LAST_YM());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_BUSINESS_CTRL_DATE(struct.getList_BUSINESS_CTRL_DATE());
			this.setList_CODE(struct.getList_CODE());
			this.setList_SALES_PLAN_TERM(struct.getList_SALES_PLAN_TERM());
			this.setList_ODR_SHIP_TERM(struct.getList_ODR_SHIP_TERM());
			this.setList_SALES_TERM(struct.getList_SALES_TERM());
			this.setList_EDI_TERM(struct.getList_EDI_TERM());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
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
	// 第 1 変数初期値： i_DELETE_RECKON_YM


	final static String i_DELETE_RECKON_YM = null;

	// 第 2 変数初期値： i_SALES_PLAN_TERM_LAST_YM


	final static String i_SALES_PLAN_TERM_LAST_YM = null;

	// 第 3 変数初期値： i_ODR_SHIP_TERM_LAST_YM


	final static String i_ODR_SHIP_TERM_LAST_YM = null;

	// 第 4 変数初期値： i_SALES_TERM_LAST_YM


	final static String i_SALES_TERM_LAST_YM = null;

	// 第 5 変数初期値： i_EDI_TERM_LAST_YM


	final static String i_EDI_TERM_LAST_YM = null;

	// 第 6 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 7 変数初期値： i_BUSINESS_CTRL_DATE


	final static String i_BUSINESS_CTRL_DATE = null;

	// 第 8 変数初期値： i_CODE


	final static String i_CODE = null;

	// 第 9 変数初期値： i_SALES_PLAN_TERM


	final static String i_SALES_PLAN_TERM = null;

	// 第 10 変数初期値： i_ODR_SHIP_TERM


	final static String i_ODR_SHIP_TERM = null;

	// 第 11 変数初期値： i_SALES_TERM


	final static String i_SALES_TERM = null;

	// 第 12 変数初期値： i_EDI_TERM


	final static String i_EDI_TERM = null;

	// 第 13 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DELETE_RECKON_YM

	final static String i_DELETE_RECKON_YM = null;

	// 第 2 変数初期値： i_SALES_PLAN_TERM_LAST_YM

	final static String i_SALES_PLAN_TERM_LAST_YM = null;

	// 第 3 変数初期値： i_ODR_SHIP_TERM_LAST_YM

	final static String i_ODR_SHIP_TERM_LAST_YM = null;

	// 第 4 変数初期値： i_SALES_TERM_LAST_YM

	final static String i_SALES_TERM_LAST_YM = null;

	// 第 5 変数初期値： i_EDI_TERM_LAST_YM

	final static String i_EDI_TERM_LAST_YM = null;

	// 第 6 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 7 変数初期値： i_BUSINESS_CTRL_DATE

	final static String i_BUSINESS_CTRL_DATE = null;

	// 第 8 変数初期値： i_CODE

	final static String i_CODE = null;

	// 第 9 変数初期値： i_SALES_PLAN_TERM

	final static String i_SALES_PLAN_TERM = null;

	// 第 10 変数初期値： i_ODR_SHIP_TERM

	final static String i_ODR_SHIP_TERM = null;

	// 第 11 変数初期値： i_SALES_TERM

	final static String i_SALES_TERM = null;

	// 第 12 変数初期値： i_EDI_TERM

	final static String i_EDI_TERM = null;

	// 第 13 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DELETE_RECKON_YM = i_DELETE_RECKON_YM;
		m_SALES_PLAN_TERM_LAST_YM = i_SALES_PLAN_TERM_LAST_YM;
		m_ODR_SHIP_TERM_LAST_YM = i_ODR_SHIP_TERM_LAST_YM;
		m_SALES_TERM_LAST_YM = i_SALES_TERM_LAST_YM;
		m_EDI_TERM_LAST_YM = i_EDI_TERM_LAST_YM;
		m_COMPANY_CD = i_COMPANY_CD;
		m_BUSINESS_CTRL_DATE = i_BUSINESS_CTRL_DATE;
		m_CODE = i_CODE;
		m_SALES_PLAN_TERM = i_SALES_PLAN_TERM;
		m_ODR_SHIP_TERM = i_ODR_SHIP_TERM;
		m_SALES_TERM = i_SALES_TERM;
		m_EDI_TERM = i_EDI_TERM;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
