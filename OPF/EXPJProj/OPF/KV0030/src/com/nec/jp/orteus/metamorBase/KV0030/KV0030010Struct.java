/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/src/com/nec/jp/orteus/metamorBase/KV0030/KV0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0030;

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

public class KV0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** 第 2 変数： m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** 第 3 変数： m_rdoPlantTyp */
	public String m_rdoPlantTyp = null;
	/** 第 4 変数： m_SYS_PARAM_NAME */
	public String m_SYS_PARAM_NAME = null;
	/** 第 5 変数： m_SYS_PARAM_VALUE */
	public String m_SYS_PARAM_VALUE = null;
	/** 第 6 変数： m_plantCd */
	public String m_plantCd = null;
	/** 第 7 変数： m_txtPlantCd */
	public String m_txtPlantCd = null;
	/** 第 8 変数： m_strUSER_NAME */
	public String m_strUSER_NAME = null;
	/** 第 9 変数： m_strPLANT_CD */
	public String m_strPLANT_CD = null;
	/** 第 10 変数： m_strSECTION_CD */
	public String m_strSECTION_CD = null;
	/** 第 11 変数： m_strORG_CD */
	public String m_strORG_CD = null;
	/** 第 12 変数： m_strORG_NAME */
	public String m_strORG_NAME = null;
	/** 第 13 変数： m_strORG_ANAME */
	public String m_strORG_ANAME = null;
	/** 第 14 変数： m_strPLANT_NAME */
	public String m_strPLANT_NAME = null;
	/** 第 15 変数： m_strPLANT_ANAME */
	public String m_strPLANT_ANAME = null;
	/** 第 16 変数： m_strCAL_NO */
	public Double m_strCAL_NO = null;
	/** 第 17 変数： m_strUSER_CD */
	public String m_strUSER_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** 第 2 List変数： l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** 第 3 List変数： l_rdoPlantTyp */
	public List l_rdoPlantTyp = null;

	/** 第 4 List変数： l_SYS_PARAM_NAME */
	public List l_SYS_PARAM_NAME = null;

	/** 第 5 List変数： l_SYS_PARAM_VALUE */
	public List l_SYS_PARAM_VALUE = null;

	/** 第 6 List変数： l_plantCd */
	public List l_plantCd = null;

	/** 第 7 List変数： l_txtPlantCd */
	public List l_txtPlantCd = null;

	/** 第 8 List変数： l_strUSER_NAME */
	public List l_strUSER_NAME = null;

	/** 第 9 List変数： l_strPLANT_CD */
	public List l_strPLANT_CD = null;

	/** 第 10 List変数： l_strSECTION_CD */
	public List l_strSECTION_CD = null;

	/** 第 11 List変数： l_strORG_CD */
	public List l_strORG_CD = null;

	/** 第 12 List変数： l_strORG_NAME */
	public List l_strORG_NAME = null;

	/** 第 13 List変数： l_strORG_ANAME */
	public List l_strORG_ANAME = null;

	/** 第 14 List変数： l_strPLANT_NAME */
	public List l_strPLANT_NAME = null;

	/** 第 15 List変数： l_strPLANT_ANAME */
	public List l_strPLANT_ANAME = null;

	/** 第 16 List変数： l_strCAL_NO */
	public List l_strCAL_NO = null;

	/** 第 17 List変数： l_strUSER_CD */
	public List l_strUSER_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getrdoPlantTyp() { return m_rdoPlantTyp; }
	public String getSYS_PARAM_NAME() { return m_SYS_PARAM_NAME; }
	public String getSYS_PARAM_VALUE() { return m_SYS_PARAM_VALUE; }
	public String getplantCd() { return m_plantCd; }
	public String gettxtPlantCd() { return m_txtPlantCd; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrORG_CD() { return m_strORG_CD; }
	public String getstrORG_NAME() { return m_strORG_NAME; }
	public String getstrORG_ANAME() { return m_strORG_ANAME; }
	public String getstrPLANT_NAME() { return m_strPLANT_NAME; }
	public String getstrPLANT_ANAME() { return m_strPLANT_ANAME; }
	public Double getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrUSER_CD() { return m_strUSER_CD; }

	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_rdoPlantTyp() { return l_rdoPlantTyp; }
	public List getList_SYS_PARAM_NAME() { return l_SYS_PARAM_NAME; }
	public List getList_SYS_PARAM_VALUE() { return l_SYS_PARAM_VALUE; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_txtPlantCd() { return l_txtPlantCd; }
	public List getList_strUSER_NAME() { return l_strUSER_NAME; }
	public List getList_strPLANT_CD() { return l_strPLANT_CD; }
	public List getList_strSECTION_CD() { return l_strSECTION_CD; }
	public List getList_strORG_CD() { return l_strORG_CD; }
	public List getList_strORG_NAME() { return l_strORG_NAME; }
	public List getList_strORG_ANAME() { return l_strORG_ANAME; }
	public List getList_strPLANT_NAME() { return l_strPLANT_NAME; }
	public List getList_strPLANT_ANAME() { return l_strPLANT_ANAME; }
	public List getList_strCAL_NO() { return l_strCAL_NO; }
	public List getList_strUSER_CD() { return l_strUSER_CD; }

	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setrdoPlantTyp(String val) { m_rdoPlantTyp = val; }
	public void setSYS_PARAM_NAME(String val) { m_SYS_PARAM_NAME = val; }
	public void setSYS_PARAM_VALUE(String val) { m_SYS_PARAM_VALUE = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void settxtPlantCd(String val) { m_txtPlantCd = val; }
	public void setstrUSER_NAME(String val) { m_strUSER_NAME = val; }
	public void setstrPLANT_CD(String val) { m_strPLANT_CD = val; }
	public void setstrSECTION_CD(String val) { m_strSECTION_CD = val; }
	public void setstrORG_CD(String val) { m_strORG_CD = val; }
	public void setstrORG_NAME(String val) { m_strORG_NAME = val; }
	public void setstrORG_ANAME(String val) { m_strORG_ANAME = val; }
	public void setstrPLANT_NAME(String val) { m_strPLANT_NAME = val; }
	public void setstrPLANT_ANAME(String val) { m_strPLANT_ANAME = val; }
	public void setstrCAL_NO(Double val) { m_strCAL_NO = val; }
	public void setstrUSER_CD(String val) { m_strUSER_CD = val; }


	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_rdoPlantTyp(List list) { l_rdoPlantTyp = list; }
	public void setList_SYS_PARAM_NAME(List list) { l_SYS_PARAM_NAME = list; }
	public void setList_SYS_PARAM_VALUE(List list) { l_SYS_PARAM_VALUE = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_txtPlantCd(List list) { l_txtPlantCd = list; }
	public void setList_strUSER_NAME(List list) { l_strUSER_NAME = list; }
	public void setList_strPLANT_CD(List list) { l_strPLANT_CD = list; }
	public void setList_strSECTION_CD(List list) { l_strSECTION_CD = list; }
	public void setList_strORG_CD(List list) { l_strORG_CD = list; }
	public void setList_strORG_NAME(List list) { l_strORG_NAME = list; }
	public void setList_strORG_ANAME(List list) { l_strORG_ANAME = list; }
	public void setList_strPLANT_NAME(List list) { l_strPLANT_NAME = list; }
	public void setList_strPLANT_ANAME(List list) { l_strPLANT_ANAME = list; }
	public void setList_strCAL_NO(List list) { l_strCAL_NO = list; }
	public void setList_strUSER_CD(List list) { l_strUSER_CD = list; }

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
			l_rdoPlantTyp1.add(((KV0030010Struct) list.get(i)).getrdoPlantTyp1());
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
			l_rdoPlantTyp2.add(((KV0030010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp == null) {
			l_rdoPlantTyp = new ArrayList();
		} else {
			l_rdoPlantTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp.add(((KV0030010Struct) list.get(i)).getrdoPlantTyp());
		}
		return size;
	}
	public int setL2L_SYS_PARAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAM_NAME == null) {
			l_SYS_PARAM_NAME = new ArrayList();
		} else {
			l_SYS_PARAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAM_NAME.add(((KV0030010Struct) list.get(i)).getSYS_PARAM_NAME());
		}
		return size;
	}
	public int setL2L_SYS_PARAM_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAM_VALUE == null) {
			l_SYS_PARAM_VALUE = new ArrayList();
		} else {
			l_SYS_PARAM_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAM_VALUE.add(((KV0030010Struct) list.get(i)).getSYS_PARAM_VALUE());
		}
		return size;
	}
	public int setL2L_plantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_plantCd == null) {
			l_plantCd = new ArrayList();
		} else {
			l_plantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_plantCd.add(((KV0030010Struct) list.get(i)).getplantCd());
		}
		return size;
	}
	public int setL2L_txtPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtPlantCd == null) {
			l_txtPlantCd = new ArrayList();
		} else {
			l_txtPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtPlantCd.add(((KV0030010Struct) list.get(i)).gettxtPlantCd());
		}
		return size;
	}
	public int setL2L_strUSER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_NAME == null) {
			l_strUSER_NAME = new ArrayList();
		} else {
			l_strUSER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_NAME.add(((KV0030010Struct) list.get(i)).getstrUSER_NAME());
		}
		return size;
	}
	public int setL2L_strPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_CD == null) {
			l_strPLANT_CD = new ArrayList();
		} else {
			l_strPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_CD.add(((KV0030010Struct) list.get(i)).getstrPLANT_CD());
		}
		return size;
	}
	public int setL2L_strSECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSECTION_CD == null) {
			l_strSECTION_CD = new ArrayList();
		} else {
			l_strSECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSECTION_CD.add(((KV0030010Struct) list.get(i)).getstrSECTION_CD());
		}
		return size;
	}
	public int setL2L_strORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_CD == null) {
			l_strORG_CD = new ArrayList();
		} else {
			l_strORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_CD.add(((KV0030010Struct) list.get(i)).getstrORG_CD());
		}
		return size;
	}
	public int setL2L_strORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_NAME == null) {
			l_strORG_NAME = new ArrayList();
		} else {
			l_strORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_NAME.add(((KV0030010Struct) list.get(i)).getstrORG_NAME());
		}
		return size;
	}
	public int setL2L_strORG_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_ANAME == null) {
			l_strORG_ANAME = new ArrayList();
		} else {
			l_strORG_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_ANAME.add(((KV0030010Struct) list.get(i)).getstrORG_ANAME());
		}
		return size;
	}
	public int setL2L_strPLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_NAME == null) {
			l_strPLANT_NAME = new ArrayList();
		} else {
			l_strPLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_NAME.add(((KV0030010Struct) list.get(i)).getstrPLANT_NAME());
		}
		return size;
	}
	public int setL2L_strPLANT_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_ANAME == null) {
			l_strPLANT_ANAME = new ArrayList();
		} else {
			l_strPLANT_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_ANAME.add(((KV0030010Struct) list.get(i)).getstrPLANT_ANAME());
		}
		return size;
	}
	public int setL2L_strCAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCAL_NO == null) {
			l_strCAL_NO = new ArrayList();
		} else {
			l_strCAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCAL_NO.add(((KV0030010Struct) list.get(i)).getstrCAL_NO());
		}
		return size;
	}
	public int setL2L_strUSER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_CD == null) {
			l_strUSER_CD = new ArrayList();
		} else {
			l_strUSER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_CD.add(((KV0030010Struct) list.get(i)).getstrUSER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_rdoPlantTyp = null;
		m_SYS_PARAM_NAME = null;
		m_SYS_PARAM_VALUE = null;
		m_plantCd = null;
		m_txtPlantCd = null;
		m_strUSER_NAME = null;
		m_strPLANT_CD = null;
		m_strSECTION_CD = null;
		m_strORG_CD = null;
		m_strORG_NAME = null;
		m_strORG_ANAME = null;
		m_strPLANT_NAME = null;
		m_strPLANT_ANAME = null;
		m_strCAL_NO = null;
		m_strUSER_CD = null;

		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_rdoPlantTyp = null;
		l_SYS_PARAM_NAME = null;
		l_SYS_PARAM_VALUE = null;
		l_plantCd = null;
		l_txtPlantCd = null;
		l_strUSER_NAME = null;
		l_strPLANT_CD = null;
		l_strSECTION_CD = null;
		l_strORG_CD = null;
		l_strORG_NAME = null;
		l_strORG_ANAME = null;
		l_strPLANT_NAME = null;
		l_strPLANT_ANAME = null;
		l_strCAL_NO = null;
		l_strUSER_CD = null;

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
	 * medKV0030010クラスの標準コンストラクタ
	 */
	public KV0030010Struct()
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
	public void setStruct(KV0030010Struct struct)
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
	public void setStructM(KV0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setrdoPlantTyp(struct.getrdoPlantTyp());
			this.setSYS_PARAM_NAME(struct.getSYS_PARAM_NAME());
			this.setSYS_PARAM_VALUE(struct.getSYS_PARAM_VALUE());
			this.setplantCd(struct.getplantCd());
			this.settxtPlantCd(struct.gettxtPlantCd());
			this.setstrUSER_NAME(struct.getstrUSER_NAME());
			this.setstrPLANT_CD(struct.getstrPLANT_CD());
			this.setstrSECTION_CD(struct.getstrSECTION_CD());
			this.setstrORG_CD(struct.getstrORG_CD());
			this.setstrORG_NAME(struct.getstrORG_NAME());
			this.setstrORG_ANAME(struct.getstrORG_ANAME());
			this.setstrPLANT_NAME(struct.getstrPLANT_NAME());
			this.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
			this.setstrCAL_NO(struct.getstrCAL_NO());
			this.setstrUSER_CD(struct.getstrUSER_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KV0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_rdoPlantTyp(struct.getList_rdoPlantTyp());
			this.setList_SYS_PARAM_NAME(struct.getList_SYS_PARAM_NAME());
			this.setList_SYS_PARAM_VALUE(struct.getList_SYS_PARAM_VALUE());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_txtPlantCd(struct.getList_txtPlantCd());
			this.setList_strUSER_NAME(struct.getList_strUSER_NAME());
			this.setList_strPLANT_CD(struct.getList_strPLANT_CD());
			this.setList_strSECTION_CD(struct.getList_strSECTION_CD());
			this.setList_strORG_CD(struct.getList_strORG_CD());
			this.setList_strORG_NAME(struct.getList_strORG_NAME());
			this.setList_strORG_ANAME(struct.getList_strORG_ANAME());
			this.setList_strPLANT_NAME(struct.getList_strPLANT_NAME());
			this.setList_strPLANT_ANAME(struct.getList_strPLANT_ANAME());
			this.setList_strCAL_NO(struct.getList_strCAL_NO());
			this.setList_strUSER_CD(struct.getList_strUSER_CD());
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

	// 第 3 変数初期値： i_rdoPlantTyp


	final static String i_rdoPlantTyp = null;

	// 第 4 変数初期値： i_SYS_PARAM_NAME


	final static String i_SYS_PARAM_NAME = null;

	// 第 5 変数初期値： i_SYS_PARAM_VALUE


	final static String i_SYS_PARAM_VALUE = null;

	// 第 6 変数初期値： i_plantCd


	final static String i_plantCd = null;

	// 第 7 変数初期値： i_txtPlantCd


	final static String i_txtPlantCd = null;

	// 第 8 変数初期値： i_strUSER_NAME


	final static String i_strUSER_NAME = null;

	// 第 9 変数初期値： i_strPLANT_CD


	final static String i_strPLANT_CD = null;

	// 第 10 変数初期値： i_strSECTION_CD


	final static String i_strSECTION_CD = null;

	// 第 11 変数初期値： i_strORG_CD


	final static String i_strORG_CD = null;

	// 第 12 変数初期値： i_strORG_NAME


	final static String i_strORG_NAME = null;

	// 第 13 変数初期値： i_strORG_ANAME


	final static String i_strORG_ANAME = null;

	// 第 14 変数初期値： i_strPLANT_NAME


	final static String i_strPLANT_NAME = null;

	// 第 15 変数初期値： i_strPLANT_ANAME


	final static String i_strPLANT_ANAME = null;

	// 第 16 変数初期値： i_strCAL_NO


	final static Double i_strCAL_NO = null;

	// 第 17 変数初期値： i_strUSER_CD


	final static String i_strUSER_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_plantCd
        final static String i_plantCd = null;
        // 第 2 変数初期値： i_txtPlantCd
        final static String i_txtPlantCd = null;
        // 第 3 変数初期値： i_rdoPlantTyp1
        final static String i_rdoPlantTyp1 = null;
        // 第 4 変数初期値： i_rdoPlantTyp2
        final static String i_rdoPlantTyp2 = null;
        // 第 5 変数初期値： i_rdoPlantTyp
        final static String i_rdoPlantTyp = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_plantCd = i_plantCd;
         m_txtPlantCd = i_txtPlantCd;
         m_rdoPlantTyp1 = i_rdoPlantTyp1;
         m_rdoPlantTyp2 = i_rdoPlantTyp2;
         m_rdoPlantTyp = i_rdoPlantTyp;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
