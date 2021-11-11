/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0050/src/com/nec/jp/orteus/metamorBase/AE0050/AE0050020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0050;

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
 * CLASS     : AE0050020Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.14 $ $Date: 2014/11/05 07:10:25 $
 *
 */
//}}user_implement_code_header

public class AE0050020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** 第 3 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 4 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 5 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 6 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 7 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 8 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 9 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 10 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 11 変数： m_ISSUE_DATE */
	public String m_ISSUE_DATE = null;
	/** 第 12 変数： m_ISSUE_QTY */
	public String m_ISSUE_QTY = null;
	/** 第 13 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 14 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 15 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 16 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 17 変数： m_ONEROUS_CONS_COMMENT */
	public String m_ONEROUS_CONS_COMMENT = null;
	/** 第 18 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 19 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 20 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** 第 3 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 4 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 5 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 6 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 7 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 8 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 9 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 10 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 11 List変数： l_ISSUE_DATE */
	public List l_ISSUE_DATE = null;

	/** 第 12 List変数： l_ISSUE_QTY */
	public List l_ISSUE_QTY = null;

	/** 第 13 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 14 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 15 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 16 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 17 List変数： l_ONEROUS_CONS_COMMENT */
	public List l_ONEROUS_CONS_COMMENT = null;

	/** 第 18 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 19 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 20 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getISSUE_DATE() { return m_ISSUE_DATE; }
	public String getISSUE_QTY() { return m_ISSUE_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getONEROUS_CONS_COMMENT() { return m_ONEROUS_CONS_COMMENT; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_ISSUE_DATE() { return l_ISSUE_DATE; }
	public List getList_ISSUE_QTY() { return l_ISSUE_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_ONEROUS_CONS_COMMENT() { return l_ONEROUS_CONS_COMMENT; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setISSUE_DATE(String val) { m_ISSUE_DATE = val; }
	public void setISSUE_QTY(String val) { m_ISSUE_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setONEROUS_CONS_COMMENT(String val) { m_ONEROUS_CONS_COMMENT = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_ISSUE_DATE(List list) { l_ISSUE_DATE = list; }
	public void setList_ISSUE_QTY(List list) { l_ISSUE_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_ONEROUS_CONS_COMMENT(List list) { l_ONEROUS_CONS_COMMENT = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }

	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AE0050020Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_NO == null) {
			l_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_NO.add(((AE0050020Struct) list.get(i)).getONEROUS_CONS_NO());
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
			l_PLANT_CD.add(((AE0050020Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AE0050020Struct) list.get(i)).getPLANT_NAME());
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
			l_COMPANY_CD.add(((AE0050020Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CD == null) {
			l_VEND_CD = new ArrayList();
		} else {
			l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CD.add(((AE0050020Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AE0050020Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AE0050020Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((AE0050020Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AE0050020Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE == null) {
			l_ISSUE_DATE = new ArrayList();
		} else {
			l_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE.add(((AE0050020Struct) list.get(i)).getISSUE_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_QTY == null) {
			l_ISSUE_QTY = new ArrayList();
		} else {
			l_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_QTY.add(((AE0050020Struct) list.get(i)).getISSUE_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((AE0050020Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AE0050020Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((AE0050020Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AE0050020Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_COMMENT == null) {
			l_ONEROUS_CONS_COMMENT = new ArrayList();
		} else {
			l_ONEROUS_CONS_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_COMMENT.add(((AE0050020Struct) list.get(i)).getONEROUS_CONS_COMMENT());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AE0050020Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AE0050020Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_OPR_DATE == null) {
			l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_OPR_DATE.add(((AE0050020Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_ONEROUS_CONS_NO = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_ISSUE_DATE = null;
		m_ISSUE_QTY = null;
		m_STOCK_UNIT = null;
		m_UNIT_COST = null;
		m_CUR_UNIT = null;
		m_UNIT_COST_TYP = null;
		m_ONEROUS_CONS_COMMENT = null;
		m_VEND_LOT_NO = null;
		m_PUCH_ODR_CD = null;
		m_BUSINESS_OPR_DATE = null;

		l_DOWNLOAD_FILE = null;
		l_ONEROUS_CONS_NO = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_ISSUE_DATE = null;
		l_ISSUE_QTY = null;
		l_STOCK_UNIT = null;
		l_UNIT_COST = null;
		l_CUR_UNIT = null;
		l_UNIT_COST_TYP = null;
		l_ONEROUS_CONS_COMMENT = null;
		l_VEND_LOT_NO = null;
		l_PUCH_ODR_CD = null;
		l_BUSINESS_OPR_DATE = null;

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
	 * medAE0050020クラスの標準コンストラクタ
	 */
	public AE0050020Struct()
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
	public void setStruct(AE0050020Struct struct)
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
	public void setStructM(AE0050020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setISSUE_DATE(struct.getISSUE_DATE());
			this.setISSUE_QTY(struct.getISSUE_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setONEROUS_CONS_COMMENT(struct.getONEROUS_CONS_COMMENT());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0050020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_ISSUE_DATE(struct.getList_ISSUE_DATE());
			this.setList_ISSUE_QTY(struct.getList_ISSUE_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_ONEROUS_CONS_COMMENT(struct.getList_ONEROUS_CONS_COMMENT());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
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
	// 第 1 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// 第 3 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 4 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 5 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 6 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 7 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 8 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 9 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 10 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 11 変数初期値： i_ISSUE_DATE


	final static String i_ISSUE_DATE = null;

	// 第 12 変数初期値： i_ISSUE_QTY


	final static String i_ISSUE_QTY = null;

	// 第 13 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 14 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 15 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 16 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 17 変数初期値： i_ONEROUS_CONS_COMMENT


	final static String i_ONEROUS_CONS_COMMENT = null;

	// 第 18 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 19 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 20 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_ONEROUS_CONS_NO

	final static String i_ONEROUS_CONS_NO = null;

	// 第 3 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 4 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 5 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 6 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 7 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 8 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 9 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 10 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 11 変数初期値： i_ISSUE_DATE

	final static String i_ISSUE_DATE = null;

	// 第 12 変数初期値： i_ISSUE_QTY

	final static String i_ISSUE_QTY = null;

	// 第 13 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 14 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 15 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 16 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 17 変数初期値： i_ONEROUS_CONS_COMMENT

	final static String i_ONEROUS_CONS_COMMENT = null;

	// 第 18 変数初期値： i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// 第 19 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 20 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_ONEROUS_CONS_NO = i_ONEROUS_CONS_NO;
		m_PLANT_CD = i_PLANT_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_ISSUE_DATE = i_ISSUE_DATE;
		m_ISSUE_QTY = i_ISSUE_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_UNIT_COST = i_UNIT_COST;
		m_CUR_UNIT = i_CUR_UNIT;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_ONEROUS_CONS_COMMENT = i_ONEROUS_CONS_COMMENT;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
