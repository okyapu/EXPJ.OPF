/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0090/src/com/nec/jp/orteus/metamorBase/KA0090/KA0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0090;

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

public class KA0090010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_RESULT */
	public String m_h_RESULT = null;
	/** 第 2 変数： m_k_MODE */
	public String m_k_MODE = null;
	/** 第 3 変数： m_h_ORG_CD */
	public String m_h_ORG_CD = null;
	/** 第 4 変数： m_SYS_COMPANY_CD */
	public String m_SYS_COMPANY_CD = null;
	/** 第 5 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 6 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 7 変数： m_ORG_ANAME */
	public String m_ORG_ANAME = null;
	/** 第 8 変数： m_ORG_KNAME */
	public String m_ORG_KNAME = null;
	/** 第 9 変数： m_ORG_ENAME */
	public String m_ORG_ENAME = null;
	/** 第 10 変数： m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** 第 11 変数： m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** 第 12 変数： m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** 第 13 変数： m_ADDRESS_K_1 */
	public String m_ADDRESS_K_1 = null;
	/** 第 14 変数： m_ADDRESS_K_2 */
	public String m_ADDRESS_K_2 = null;
	/** 第 15 変数： m_TEL */
	public String m_TEL = null;
	/** 第 16 変数： m_FAX */
	public String m_FAX = null;
	/** 第 17 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 18 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 19 変数： m_BILL_ADDRESSEE_CD */
	public String m_BILL_ADDRESSEE_CD = null;
	/** 第 20 変数： m_SLIP_TYP */
	public String m_SLIP_TYP = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_RESULT */
	public List l_h_RESULT = null;

	/** 第 2 List変数： l_k_MODE */
	public List l_k_MODE = null;

	/** 第 3 List変数： l_h_ORG_CD */
	public List l_h_ORG_CD = null;

	/** 第 4 List変数： l_SYS_COMPANY_CD */
	public List l_SYS_COMPANY_CD = null;

	/** 第 5 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 6 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 7 List変数： l_ORG_ANAME */
	public List l_ORG_ANAME = null;

	/** 第 8 List変数： l_ORG_KNAME */
	public List l_ORG_KNAME = null;

	/** 第 9 List変数： l_ORG_ENAME */
	public List l_ORG_ENAME = null;

	/** 第 10 List変数： l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** 第 11 List変数： l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** 第 12 List変数： l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** 第 13 List変数： l_ADDRESS_K_1 */
	public List l_ADDRESS_K_1 = null;

	/** 第 14 List変数： l_ADDRESS_K_2 */
	public List l_ADDRESS_K_2 = null;

	/** 第 15 List変数： l_TEL */
	public List l_TEL = null;

	/** 第 16 List変数： l_FAX */
	public List l_FAX = null;

	/** 第 17 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 18 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 19 List変数： l_BILL_ADDRESSEE_CD */
	public List l_BILL_ADDRESSEE_CD = null;

	/** 第 20 List変数： l_SLIP_TYP */
	public List l_SLIP_TYP = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_RESULT() { return m_h_RESULT; }
	public String getk_MODE() { return m_k_MODE; }
	public String geth_ORG_CD() { return m_h_ORG_CD; }
	public String getSYS_COMPANY_CD() { return m_SYS_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getORG_ANAME() { return m_ORG_ANAME; }
	public String getORG_KNAME() { return m_ORG_KNAME; }
	public String getORG_ENAME() { return m_ORG_ENAME; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getADDRESS_K_1() { return m_ADDRESS_K_1; }
	public String getADDRESS_K_2() { return m_ADDRESS_K_2; }
	public String getTEL() { return m_TEL; }
	public String getFAX() { return m_FAX; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getBILL_ADDRESSEE_CD() { return m_BILL_ADDRESSEE_CD; }
	public String getSLIP_TYP() { return m_SLIP_TYP; }

	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_h_ORG_CD() { return l_h_ORG_CD; }
	public List getList_SYS_COMPANY_CD() { return l_SYS_COMPANY_CD; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_ORG_ANAME() { return l_ORG_ANAME; }
	public List getList_ORG_KNAME() { return l_ORG_KNAME; }
	public List getList_ORG_ENAME() { return l_ORG_ENAME; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_ADDRESS_K_1() { return l_ADDRESS_K_1; }
	public List getList_ADDRESS_K_2() { return l_ADDRESS_K_2; }
	public List getList_TEL() { return l_TEL; }
	public List getList_FAX() { return l_FAX; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_BILL_ADDRESSEE_CD() { return l_BILL_ADDRESSEE_CD; }
	public List getList_SLIP_TYP() { return l_SLIP_TYP; }

	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setk_MODE(String val) { m_k_MODE = val; }
	public void seth_ORG_CD(String val) { m_h_ORG_CD = val; }
	public void setSYS_COMPANY_CD(String val) { m_SYS_COMPANY_CD = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setORG_ANAME(String val) { m_ORG_ANAME = val; }
	public void setORG_KNAME(String val) { m_ORG_KNAME = val; }
	public void setORG_ENAME(String val) { m_ORG_ENAME = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setADDRESS_K_1(String val) { m_ADDRESS_K_1 = val; }
	public void setADDRESS_K_2(String val) { m_ADDRESS_K_2 = val; }
	public void setTEL(String val) { m_TEL = val; }
	public void setFAX(String val) { m_FAX = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setBILL_ADDRESSEE_CD(String val) { m_BILL_ADDRESSEE_CD = val; }
	public void setSLIP_TYP(String val) { m_SLIP_TYP = val; }


	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_h_ORG_CD(List list) { l_h_ORG_CD = list; }
	public void setList_SYS_COMPANY_CD(List list) { l_SYS_COMPANY_CD = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_ORG_ANAME(List list) { l_ORG_ANAME = list; }
	public void setList_ORG_KNAME(List list) { l_ORG_KNAME = list; }
	public void setList_ORG_ENAME(List list) { l_ORG_ENAME = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_ADDRESS_K_1(List list) { l_ADDRESS_K_1 = list; }
	public void setList_ADDRESS_K_2(List list) { l_ADDRESS_K_2 = list; }
	public void setList_TEL(List list) { l_TEL = list; }
	public void setList_FAX(List list) { l_FAX = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_BILL_ADDRESSEE_CD(List list) { l_BILL_ADDRESSEE_CD = list; }
	public void setList_SLIP_TYP(List list) { l_SLIP_TYP = list; }

	public int setL2L_h_RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RESULT == null) {
			l_h_RESULT = new ArrayList();
		} else {
			l_h_RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RESULT.add(((KA0090010Struct) list.get(i)).geth_RESULT());
		}
		return size;
	}
	public int setL2L_k_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_MODE == null) {
			l_k_MODE = new ArrayList();
		} else {
			l_k_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_MODE.add(((KA0090010Struct) list.get(i)).getk_MODE());
		}
		return size;
	}
	public int setL2L_h_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ORG_CD == null) {
			l_h_ORG_CD = new ArrayList();
		} else {
			l_h_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ORG_CD.add(((KA0090010Struct) list.get(i)).geth_ORG_CD());
		}
		return size;
	}
	public int setL2L_SYS_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_COMPANY_CD == null) {
			l_SYS_COMPANY_CD = new ArrayList();
		} else {
			l_SYS_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_COMPANY_CD.add(((KA0090010Struct) list.get(i)).getSYS_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((KA0090010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((KA0090010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_ORG_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_ANAME == null) {
			l_ORG_ANAME = new ArrayList();
		} else {
			l_ORG_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_ANAME.add(((KA0090010Struct) list.get(i)).getORG_ANAME());
		}
		return size;
	}
	public int setL2L_ORG_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_KNAME == null) {
			l_ORG_KNAME = new ArrayList();
		} else {
			l_ORG_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_KNAME.add(((KA0090010Struct) list.get(i)).getORG_KNAME());
		}
		return size;
	}
	public int setL2L_ORG_ENAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_ENAME == null) {
			l_ORG_ENAME = new ArrayList();
		} else {
			l_ORG_ENAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_ENAME.add(((KA0090010Struct) list.get(i)).getORG_ENAME());
		}
		return size;
	}
	public int setL2L_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ZIP_CD == null) {
			l_ZIP_CD = new ArrayList();
		} else {
			l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ZIP_CD.add(((KA0090010Struct) list.get(i)).getZIP_CD());
		}
		return size;
	}
	public int setL2L_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_1 == null) {
			l_ADDRESS_1 = new ArrayList();
		} else {
			l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_1.add(((KA0090010Struct) list.get(i)).getADDRESS_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_2 == null) {
			l_ADDRESS_2 = new ArrayList();
		} else {
			l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_2.add(((KA0090010Struct) list.get(i)).getADDRESS_2());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_1 == null) {
			l_ADDRESS_K_1 = new ArrayList();
		} else {
			l_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_1.add(((KA0090010Struct) list.get(i)).getADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_K_2 == null) {
			l_ADDRESS_K_2 = new ArrayList();
		} else {
			l_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_K_2.add(((KA0090010Struct) list.get(i)).getADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEL == null) {
			l_TEL = new ArrayList();
		} else {
			l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEL.add(((KA0090010Struct) list.get(i)).getTEL());
		}
		return size;
	}
	public int setL2L_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FAX == null) {
			l_FAX = new ArrayList();
		} else {
			l_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FAX.add(((KA0090010Struct) list.get(i)).getFAX());
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
			l_h_MODIFY_COUNT.add(((KA0090010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CD == null) {
			l_CUST_CD = new ArrayList();
		} else {
			l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CD.add(((KA0090010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_BILL_ADDRESSEE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BILL_ADDRESSEE_CD == null) {
			l_BILL_ADDRESSEE_CD = new ArrayList();
		} else {
			l_BILL_ADDRESSEE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BILL_ADDRESSEE_CD.add(((KA0090010Struct) list.get(i)).getBILL_ADDRESSEE_CD());
		}
		return size;
	}
	public int setL2L_SLIP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_TYP == null) {
			l_SLIP_TYP = new ArrayList();
		} else {
			l_SLIP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_TYP.add(((KA0090010Struct) list.get(i)).getSLIP_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_RESULT = null;
		m_k_MODE = null;
		m_h_ORG_CD = null;
		m_SYS_COMPANY_CD = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_ORG_ANAME = null;
		m_ORG_KNAME = null;
		m_ORG_ENAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_ADDRESS_K_1 = null;
		m_ADDRESS_K_2 = null;
		m_TEL = null;
		m_FAX = null;
		m_h_MODIFY_COUNT = null;
		m_CUST_CD = null;
		m_BILL_ADDRESSEE_CD = null;
		m_SLIP_TYP = null;

		l_h_RESULT = null;
		l_k_MODE = null;
		l_h_ORG_CD = null;
		l_SYS_COMPANY_CD = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_ORG_ANAME = null;
		l_ORG_KNAME = null;
		l_ORG_ENAME = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_ADDRESS_K_1 = null;
		l_ADDRESS_K_2 = null;
		l_TEL = null;
		l_FAX = null;
		l_h_MODIFY_COUNT = null;
		l_CUST_CD = null;
		l_BILL_ADDRESSEE_CD = null;
		l_SLIP_TYP = null;

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
	 * medKA0090010クラスの標準コンストラクタ
	 */
	public KA0090010Struct()
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
	public void setStruct(KA0090010Struct struct)
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
	public void setStructM(KA0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_RESULT(struct.geth_RESULT());
			this.setk_MODE(struct.getk_MODE());
			this.seth_ORG_CD(struct.geth_ORG_CD());
			this.setSYS_COMPANY_CD(struct.getSYS_COMPANY_CD());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setORG_ANAME(struct.getORG_ANAME());
			this.setORG_KNAME(struct.getORG_KNAME());
			this.setORG_ENAME(struct.getORG_ENAME());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setADDRESS_K_1(struct.getADDRESS_K_1());
			this.setADDRESS_K_2(struct.getADDRESS_K_2());
			this.setTEL(struct.getTEL());
			this.setFAX(struct.getFAX());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setCUST_CD(struct.getCUST_CD());
			this.setBILL_ADDRESSEE_CD(struct.getBILL_ADDRESSEE_CD());
			this.setSLIP_TYP(struct.getSLIP_TYP());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KA0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_h_ORG_CD(struct.getList_h_ORG_CD());
			this.setList_SYS_COMPANY_CD(struct.getList_SYS_COMPANY_CD());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_ORG_ANAME(struct.getList_ORG_ANAME());
			this.setList_ORG_KNAME(struct.getList_ORG_KNAME());
			this.setList_ORG_ENAME(struct.getList_ORG_ENAME());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_ADDRESS_K_1(struct.getList_ADDRESS_K_1());
			this.setList_ADDRESS_K_2(struct.getList_ADDRESS_K_2());
			this.setList_TEL(struct.getList_TEL());
			this.setList_FAX(struct.getList_FAX());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_BILL_ADDRESSEE_CD(struct.getList_BILL_ADDRESSEE_CD());
			this.setList_SLIP_TYP(struct.getList_SLIP_TYP());
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
	// 第 1 変数初期値： i_h_RESULT


	final static String i_h_RESULT = null;

	// 第 2 変数初期値： i_k_MODE


	final static String i_k_MODE = null;

	// 第 3 変数初期値： i_h_ORG_CD


	final static String i_h_ORG_CD = null;

	// 第 4 変数初期値： i_SYS_COMPANY_CD


	final static String i_SYS_COMPANY_CD = null;

	// 第 5 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 6 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 7 変数初期値： i_ORG_ANAME


	final static String i_ORG_ANAME = null;

	// 第 8 変数初期値： i_ORG_KNAME


	final static String i_ORG_KNAME = null;

	// 第 9 変数初期値： i_ORG_ENAME


	final static String i_ORG_ENAME = null;

	// 第 10 変数初期値： i_ZIP_CD


	final static String i_ZIP_CD = null;

	// 第 11 変数初期値： i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// 第 12 変数初期値： i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// 第 13 変数初期値： i_ADDRESS_K_1


	final static String i_ADDRESS_K_1 = null;

	// 第 14 変数初期値： i_ADDRESS_K_2


	final static String i_ADDRESS_K_2 = null;

	// 第 15 変数初期値： i_TEL


	final static String i_TEL = null;

	// 第 16 変数初期値： i_FAX


	final static String i_FAX = null;

	// 第 17 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 18 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 19 変数初期値： i_BILL_ADDRESSEE_CD


	final static String i_BILL_ADDRESSEE_CD = null;

	// 第 20 変数初期値： i_SLIP_TYP


	final static String i_SLIP_TYP = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_ORG_CD
        final static String i_ORG_CD = null;
        // 第 2 変数初期値： i_ORG_NAME
        final static String i_ORG_NAME = null;
        // 第 3 変数初期値： i_ORG_ANAME
        final static String i_ORG_ANAME = null;
        // 第 4 変数初期値： i_ORG_KNAME
        final static String i_ORG_KNAME = null;
        // 第 5 変数初期値： i_ORG_ENAME
        final static String i_ORG_ENAME = null;
        // 第 6 変数初期値： i_ZIP_CD
        final static String i_ZIP_CD = null;
        // 第 7 変数初期値： i_ADDRESS_1
        final static String i_ADDRESS_1 = null;
        // 第 8 変数初期値： i_ADDRESS_2
        final static String i_ADDRESS_2 = null;
        // 第 9 変数初期値： i_ADDRESS_K_1
        final static String i_ADDRESS_K_1 = null;
        // 第 10 変数初期値： i_ADDRESS_K_2
        final static String i_ADDRESS_K_2 = null;
        // 第 11 変数初期値： i_TEL
        final static String i_TEL = null;
        // 第 12 変数初期値： i_FAX
        final static String i_FAX = null;
        // 第 13 変数初期値： i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // 第 14 変数初期値： i_SYS_COMPANY_CD
        final static String i_SYS_COMPANY_CD = null;
        // 第 15 変数初期値： i_h_RESULT
        final static String i_h_RESULT = null;
        // 第 16 変数初期値： i_k_MODE
        final static String i_k_MODE = null;
        // 第 17 変数初期値： i_h_ORG_CD
        final static String i_h_ORG_CD = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_ORG_CD = i_ORG_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_ORG_ANAME = i_ORG_ANAME;
         m_ORG_KNAME = i_ORG_KNAME;
         m_ORG_ENAME = i_ORG_ENAME;
         m_ZIP_CD = i_ZIP_CD;
         m_ADDRESS_1 = i_ADDRESS_1;
         m_ADDRESS_2 = i_ADDRESS_2;
         m_ADDRESS_K_1 = i_ADDRESS_K_1;
         m_ADDRESS_K_2 = i_ADDRESS_K_2;
         m_TEL = i_TEL;
         m_FAX = i_FAX;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_SYS_COMPANY_CD = i_SYS_COMPANY_CD;
         m_h_RESULT = i_h_RESULT;
         m_k_MODE = i_k_MODE;
         m_h_ORG_CD = i_h_ORG_CD;
        }
       
        public void copy(KA0090010Struct s)
        {
         clear();
         if(s.m_ORG_CD != null) m_ORG_CD = new String(s.m_ORG_CD);
         if(s.m_ORG_NAME != null) m_ORG_NAME = new String(s.m_ORG_NAME);
         if(s.m_ORG_ANAME != null) m_ORG_ANAME = new String(s.m_ORG_ANAME);
         if(s.m_ORG_KNAME != null) m_ORG_KNAME = new String(s.m_ORG_KNAME);
         if(s.m_ORG_ENAME != null) m_ORG_ENAME = new String(s.m_ORG_ENAME);
         if(s.m_ZIP_CD != null) m_ZIP_CD = new String(s.m_ZIP_CD);
         if(s.m_ADDRESS_1 != null) m_ADDRESS_1 = new String(s.m_ADDRESS_1);
         if(s.m_ADDRESS_2 != null) m_ADDRESS_2 = new String(s.m_ADDRESS_2);
         if(s.m_ADDRESS_K_1 != null) m_ADDRESS_K_1 = new String(s.m_ADDRESS_K_1);
         if(s.m_ADDRESS_K_2 != null) m_ADDRESS_K_2 = new String(s.m_ADDRESS_K_2);
         if(s.m_TEL != null) m_TEL = new String(s.m_TEL);
         if(s.m_FAX != null) m_FAX = new String(s.m_FAX);
         if(s.m_SYS_COMPANY_CD != null) m_SYS_COMPANY_CD = new String(s.m_SYS_COMPANY_CD);
         if(s.m_h_MODIFY_COUNT != null) m_h_MODIFY_COUNT = new String(s.m_h_MODIFY_COUNT);
        }
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
