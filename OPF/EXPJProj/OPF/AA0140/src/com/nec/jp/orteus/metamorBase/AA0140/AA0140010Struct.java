/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0140/src/com/nec/jp/orteus/metamorBase/AA0140/AA0140010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0140;

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
 * CLASS     : AA0140010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $ $Date: 2012/10/25 07:48:14 $
 *
 */
//}}user_implement_code_header

public class AA0140010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 3 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 4 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 5 変数： m_PUCH_PRIORITY_REF_NO */
	public String m_PUCH_PRIORITY_REF_NO = null;
	/** 第 6 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 7 変数： m_PUCH_SIZE */
	public String m_PUCH_SIZE = null;
	/** 第 8 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 9 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 10 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 11 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 12 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 13 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 14 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 15 変数： m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** 第 16 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 17 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 18 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 3 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 4 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 5 List変数： l_PUCH_PRIORITY_REF_NO */
	public List l_PUCH_PRIORITY_REF_NO = null;

	/** 第 6 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 7 List変数： l_PUCH_SIZE */
	public List l_PUCH_SIZE = null;

	/** 第 8 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 9 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 10 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 11 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 12 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 13 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 14 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 15 List変数： l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** 第 16 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 17 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 18 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getPUCH_PRIORITY_REF_NO() { return m_PUCH_PRIORITY_REF_NO; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_SIZE() { return m_PUCH_SIZE; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_PUCH_PRIORITY_REF_NO() { return l_PUCH_PRIORITY_REF_NO; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_SIZE() { return l_PUCH_SIZE; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setPUCH_PRIORITY_REF_NO(String val) { m_PUCH_PRIORITY_REF_NO = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_SIZE(String val) { m_PUCH_SIZE = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_PUCH_PRIORITY_REF_NO(List list) { l_PUCH_PRIORITY_REF_NO = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_SIZE(List list) { l_PUCH_SIZE = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_DOWNLOAD_FILE.add(((AA0140010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AA0140010Struct) list.get(i)).getw_ITEM_CD());
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
			l_ITEM_NAME.add(((AA0140010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((AA0140010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_PUCH_PRIORITY_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_PRIORITY_REF_NO == null) {
			l_PUCH_PRIORITY_REF_NO = new ArrayList();
		} else {
			l_PUCH_PRIORITY_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_PRIORITY_REF_NO.add(((AA0140010Struct) list.get(i)).getPUCH_PRIORITY_REF_NO());
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
			l_VEND_CD.add(((AA0140010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_PUCH_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_SIZE == null) {
			l_PUCH_SIZE = new ArrayList();
		} else {
			l_PUCH_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_SIZE.add(((AA0140010Struct) list.get(i)).getPUCH_SIZE());
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
			l_UNIT_COST.add(((AA0140010Struct) list.get(i)).getUNIT_COST());
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
			l_CUR_UNIT.add(((AA0140010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AA0140010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AA0140010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AA0140010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AA0140010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_VEND_NAME.add(((AA0140010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AA0140010Struct) list.get(i)).getDISPLAY_NAME());
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
			l_ITEM_CD.add(((AA0140010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((AA0140010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_ROW_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT == null) {
			l_ROW_COUNT = new ArrayList();
		} else {
			l_ROW_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT.add(((AA0140010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_w_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_w_PLANT_CD = null;
		m_PUCH_PRIORITY_REF_NO = null;
		m_VEND_CD = null;
		m_PUCH_SIZE = null;
		m_UNIT_COST = null;
		m_CUR_UNIT = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_EFF_PHASE_IN_DATE = null;
		m_VEND_NAME = null;
		m_DISPLAY_NAME = null;
		m_ITEM_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_w_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_w_PLANT_CD = null;
		l_PUCH_PRIORITY_REF_NO = null;
		l_VEND_CD = null;
		l_PUCH_SIZE = null;
		l_UNIT_COST = null;
		l_CUR_UNIT = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_EFF_PHASE_IN_DATE = null;
		l_VEND_NAME = null;
		l_DISPLAY_NAME = null;
		l_ITEM_CD = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

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
	 * medAA0140010クラスの標準コンストラクタ
	 */
	public AA0140010Struct()
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
	public void setStruct(AA0140010Struct struct)
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
	public void setStructM(AA0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setPUCH_PRIORITY_REF_NO(struct.getPUCH_PRIORITY_REF_NO());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_SIZE(struct.getPUCH_SIZE());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_PUCH_PRIORITY_REF_NO(struct.getList_PUCH_PRIORITY_REF_NO());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_SIZE(struct.getList_PUCH_SIZE());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
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

	// 第 2 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 3 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 4 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 5 変数初期値： i_PUCH_PRIORITY_REF_NO


	final static String i_PUCH_PRIORITY_REF_NO = null;

	// 第 6 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 7 変数初期値： i_PUCH_SIZE


	final static String i_PUCH_SIZE = null;

	// 第 8 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 9 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 10 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 11 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 12 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 13 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 14 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 15 変数初期値： i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// 第 16 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 17 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 18 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_w_ITEM_CD

	final static String i_w_ITEM_CD = null;

	// 第 3 変数初期値： i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// 第 4 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 5 変数初期値： i_PUCH_PRIORITY_REF_NO

	final static String i_PUCH_PRIORITY_REF_NO = null;

	// 第 6 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 7 変数初期値： i_PUCH_SIZE

	final static String i_PUCH_SIZE = null;

	// 第 8 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 9 変数初期値： i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 10 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 11 変数初期値： i_DISPLAY_NAME

	final static String i_DISPLAY_NAME = null;

	// 第 12 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_w_ITEM_CD = i_w_ITEM_CD;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PUCH_PRIORITY_REF_NO = i_PUCH_PRIORITY_REF_NO;
		m_VEND_CD = i_VEND_CD;
		m_PUCH_SIZE = i_PUCH_SIZE;
		m_UNIT_COST = i_UNIT_COST;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_VEND_NAME = i_VEND_NAME;
		m_DISPLAY_NAME = i_DISPLAY_NAME;
		m_ITEM_CD = i_ITEM_CD;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
