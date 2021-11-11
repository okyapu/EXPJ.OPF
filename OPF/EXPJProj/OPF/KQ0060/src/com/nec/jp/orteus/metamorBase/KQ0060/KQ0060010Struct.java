/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0060/src/com/nec/jp/orteus/metamorBase/KQ0060/KQ0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0060;

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
 * CLASS     : KQ0060010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.14 $ $Date: 2014/06/17 03:21:02 $
 *
 */
//}}user_implement_code_header

public class KQ0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_w_BUSINESS_OPR_DATE */
	public String m_w_BUSINESS_OPR_DATE = null;
	/** 第 3 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 4 変数： m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** 第 5 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 6 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 7 変数： m_SUM_ODR_QTY */
	public String m_SUM_ODR_QTY = null;
	/** 第 8 変数： m_UNCONFIRM_ODR_QTY */
	public String m_UNCONFIRM_ODR_QTY = null;
	/** 第 9 変数： m_PLN_QTY_REMAIN */
	public String m_PLN_QTY_REMAIN = null;
	/** 第 10 変数： m_SHIP_QTY */
	public String m_SHIP_QTY = null;
	/** 第 11 変数： m_ODR_REM_QTY */
	public String m_ODR_REM_QTY = null;
	/** 第 12 変数： m_SUM_OD */
	public String m_SUM_OD = null;
	/** 第 13 変数： m_SUM_STOCK_ON_HAND_QTY */
	public String m_SUM_STOCK_ON_HAND_QTY = null;
	/** 第 14 変数： m_QTY_DIFF */
	public String m_QTY_DIFF = null;
	/** 第 15 変数： m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** 第 16 変数： m_IN_DATE */
	public String m_IN_DATE = null;
	/** 第 17 変数： m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_w_BUSINESS_OPR_DATE */
	public List l_w_BUSINESS_OPR_DATE = null;

	/** 第 3 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 4 List変数： l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** 第 5 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 6 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 7 List変数： l_SUM_ODR_QTY */
	public List l_SUM_ODR_QTY = null;

	/** 第 8 List変数： l_UNCONFIRM_ODR_QTY */
	public List l_UNCONFIRM_ODR_QTY = null;

	/** 第 9 List変数： l_PLN_QTY_REMAIN */
	public List l_PLN_QTY_REMAIN = null;

	/** 第 10 List変数： l_SHIP_QTY */
	public List l_SHIP_QTY = null;

	/** 第 11 List変数： l_ODR_REM_QTY */
	public List l_ODR_REM_QTY = null;

	/** 第 12 List変数： l_SUM_OD */
	public List l_SUM_OD = null;

	/** 第 13 List変数： l_SUM_STOCK_ON_HAND_QTY */
	public List l_SUM_STOCK_ON_HAND_QTY = null;

	/** 第 14 List変数： l_QTY_DIFF */
	public List l_QTY_DIFF = null;

	/** 第 15 List変数： l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** 第 16 List変数： l_IN_DATE */
	public List l_IN_DATE = null;

	/** 第 17 List変数： l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_BUSINESS_OPR_DATE() { return m_w_BUSINESS_OPR_DATE; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSUM_ODR_QTY() { return m_SUM_ODR_QTY; }
	public String getUNCONFIRM_ODR_QTY() { return m_UNCONFIRM_ODR_QTY; }
	public String getPLN_QTY_REMAIN() { return m_PLN_QTY_REMAIN; }
	public String getSHIP_QTY() { return m_SHIP_QTY; }
	public String getODR_REM_QTY() { return m_ODR_REM_QTY; }
	public String getSUM_OD() { return m_SUM_OD; }
	public String getSUM_STOCK_ON_HAND_QTY() { return m_SUM_STOCK_ON_HAND_QTY; }
	public String getQTY_DIFF() { return m_QTY_DIFF; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getIN_DATE() { return m_IN_DATE; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_BUSINESS_OPR_DATE() { return l_w_BUSINESS_OPR_DATE; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_SUM_ODR_QTY() { return l_SUM_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_QTY() { return l_UNCONFIRM_ODR_QTY; }
	public List getList_PLN_QTY_REMAIN() { return l_PLN_QTY_REMAIN; }
	public List getList_SHIP_QTY() { return l_SHIP_QTY; }
	public List getList_ODR_REM_QTY() { return l_ODR_REM_QTY; }
	public List getList_SUM_OD() { return l_SUM_OD; }
	public List getList_SUM_STOCK_ON_HAND_QTY() { return l_SUM_STOCK_ON_HAND_QTY; }
	public List getList_QTY_DIFF() { return l_QTY_DIFF; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_IN_DATE() { return l_IN_DATE; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_BUSINESS_OPR_DATE(String val) { m_w_BUSINESS_OPR_DATE = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSUM_ODR_QTY(String val) { m_SUM_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_QTY(String val) { m_UNCONFIRM_ODR_QTY = val; }
	public void setPLN_QTY_REMAIN(String val) { m_PLN_QTY_REMAIN = val; }
	public void setSHIP_QTY(String val) { m_SHIP_QTY = val; }
	public void setODR_REM_QTY(String val) { m_ODR_REM_QTY = val; }
	public void setSUM_OD(String val) { m_SUM_OD = val; }
	public void setSUM_STOCK_ON_HAND_QTY(String val) { m_SUM_STOCK_ON_HAND_QTY = val; }
	public void setQTY_DIFF(String val) { m_QTY_DIFF = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setIN_DATE(String val) { m_IN_DATE = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_BUSINESS_OPR_DATE(List list) { l_w_BUSINESS_OPR_DATE = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_SUM_ODR_QTY(List list) { l_SUM_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_QTY(List list) { l_UNCONFIRM_ODR_QTY = list; }
	public void setList_PLN_QTY_REMAIN(List list) { l_PLN_QTY_REMAIN = list; }
	public void setList_SHIP_QTY(List list) { l_SHIP_QTY = list; }
	public void setList_ODR_REM_QTY(List list) { l_ODR_REM_QTY = list; }
	public void setList_SUM_OD(List list) { l_SUM_OD = list; }
	public void setList_SUM_STOCK_ON_HAND_QTY(List list) { l_SUM_STOCK_ON_HAND_QTY = list; }
	public void setList_QTY_DIFF(List list) { l_QTY_DIFF = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_IN_DATE(List list) { l_IN_DATE = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }

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
			l_DOWNLOAD_FILE.add(((KQ0060010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_w_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BUSINESS_OPR_DATE == null) {
			l_w_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_w_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BUSINESS_OPR_DATE.add(((KQ0060010Struct) list.get(i)).getw_BUSINESS_OPR_DATE());
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
			l_w_PLANT_CD.add(((KQ0060010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMPANY_CD == null) {
			l_w_COMPANY_CD = new ArrayList();
		} else {
			l_w_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMPANY_CD.add(((KQ0060010Struct) list.get(i)).getw_COMPANY_CD());
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
			l_ITEM_CD.add(((KQ0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KQ0060010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_SUM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ODR_QTY == null) {
			l_SUM_ODR_QTY = new ArrayList();
		} else {
			l_SUM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ODR_QTY.add(((KQ0060010Struct) list.get(i)).getSUM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_QTY == null) {
			l_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_QTY.add(((KQ0060010Struct) list.get(i)).getUNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_PLN_QTY_REMAIN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLN_QTY_REMAIN == null) {
			l_PLN_QTY_REMAIN = new ArrayList();
		} else {
			l_PLN_QTY_REMAIN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLN_QTY_REMAIN.add(((KQ0060010Struct) list.get(i)).getPLN_QTY_REMAIN());
		}
		return size;
	}
	public int setL2L_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_QTY == null) {
			l_SHIP_QTY = new ArrayList();
		} else {
			l_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_QTY.add(((KQ0060010Struct) list.get(i)).getSHIP_QTY());
		}
		return size;
	}
	public int setL2L_ODR_REM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_REM_QTY == null) {
			l_ODR_REM_QTY = new ArrayList();
		} else {
			l_ODR_REM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_REM_QTY.add(((KQ0060010Struct) list.get(i)).getODR_REM_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OD == null) {
			l_SUM_OD = new ArrayList();
		} else {
			l_SUM_OD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OD.add(((KQ0060010Struct) list.get(i)).getSUM_OD());
		}
		return size;
	}
	public int setL2L_SUM_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_STOCK_ON_HAND_QTY == null) {
			l_SUM_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_SUM_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_STOCK_ON_HAND_QTY.add(((KQ0060010Struct) list.get(i)).getSUM_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_QTY_DIFF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QTY_DIFF == null) {
			l_QTY_DIFF = new ArrayList();
		} else {
			l_QTY_DIFF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QTY_DIFF.add(((KQ0060010Struct) list.get(i)).getQTY_DIFF());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((KQ0060010Struct) list.get(i)).getPKG_UNIT());
		}
		return size;
	}
	public int setL2L_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_DATE == null) {
			l_IN_DATE = new ArrayList();
		} else {
			l_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_DATE.add(((KQ0060010Struct) list.get(i)).getIN_DATE());
		}
		return size;
	}
	public int setL2L_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_CD == null) {
			l_IN_ITEM_CD = new ArrayList();
		} else {
			l_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_CD.add(((KQ0060010Struct) list.get(i)).getIN_ITEM_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_w_BUSINESS_OPR_DATE = null;
		m_w_PLANT_CD = null;
		m_w_COMPANY_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_SUM_ODR_QTY = null;
		m_UNCONFIRM_ODR_QTY = null;
		m_PLN_QTY_REMAIN = null;
		m_SHIP_QTY = null;
		m_ODR_REM_QTY = null;
		m_SUM_OD = null;
		m_SUM_STOCK_ON_HAND_QTY = null;
		m_QTY_DIFF = null;
		m_PKG_UNIT = null;
		m_IN_DATE = null;
		m_IN_ITEM_CD = null;

		l_DOWNLOAD_FILE = null;
		l_w_BUSINESS_OPR_DATE = null;
		l_w_PLANT_CD = null;
		l_w_COMPANY_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_SUM_ODR_QTY = null;
		l_UNCONFIRM_ODR_QTY = null;
		l_PLN_QTY_REMAIN = null;
		l_SHIP_QTY = null;
		l_ODR_REM_QTY = null;
		l_SUM_OD = null;
		l_SUM_STOCK_ON_HAND_QTY = null;
		l_QTY_DIFF = null;
		l_PKG_UNIT = null;
		l_IN_DATE = null;
		l_IN_ITEM_CD = null;

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
	 * medKQ0060010クラスの標準コンストラクタ
	 */
	public KQ0060010Struct()
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
	public void setStruct(KQ0060010Struct struct)
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
	public void setStructM(KQ0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_BUSINESS_OPR_DATE(struct.getw_BUSINESS_OPR_DATE());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSUM_ODR_QTY(struct.getSUM_ODR_QTY());
			this.setUNCONFIRM_ODR_QTY(struct.getUNCONFIRM_ODR_QTY());
			this.setPLN_QTY_REMAIN(struct.getPLN_QTY_REMAIN());
			this.setSHIP_QTY(struct.getSHIP_QTY());
			this.setODR_REM_QTY(struct.getODR_REM_QTY());
			this.setSUM_OD(struct.getSUM_OD());
			this.setSUM_STOCK_ON_HAND_QTY(struct.getSUM_STOCK_ON_HAND_QTY());
			this.setQTY_DIFF(struct.getQTY_DIFF());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setIN_DATE(struct.getIN_DATE());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KQ0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_BUSINESS_OPR_DATE(struct.getList_w_BUSINESS_OPR_DATE());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_SUM_ODR_QTY(struct.getList_SUM_ODR_QTY());
			this.setList_UNCONFIRM_ODR_QTY(struct.getList_UNCONFIRM_ODR_QTY());
			this.setList_PLN_QTY_REMAIN(struct.getList_PLN_QTY_REMAIN());
			this.setList_SHIP_QTY(struct.getList_SHIP_QTY());
			this.setList_ODR_REM_QTY(struct.getList_ODR_REM_QTY());
			this.setList_SUM_OD(struct.getList_SUM_OD());
			this.setList_SUM_STOCK_ON_HAND_QTY(struct.getList_SUM_STOCK_ON_HAND_QTY());
			this.setList_QTY_DIFF(struct.getList_QTY_DIFF());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_IN_DATE(struct.getList_IN_DATE());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
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

	// 第 2 変数初期値： i_w_BUSINESS_OPR_DATE


	final static String i_w_BUSINESS_OPR_DATE = null;

	// 第 3 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 4 変数初期値： i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// 第 5 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 6 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 7 変数初期値： i_SUM_ODR_QTY


	final static String i_SUM_ODR_QTY = null;

	// 第 8 変数初期値： i_UNCONFIRM_ODR_QTY


	final static String i_UNCONFIRM_ODR_QTY = null;

	// 第 9 変数初期値： i_PLN_QTY_REMAIN


	final static String i_PLN_QTY_REMAIN = null;

	// 第 10 変数初期値： i_SHIP_QTY


	final static String i_SHIP_QTY = null;

	// 第 11 変数初期値： i_ODR_REM_QTY


	final static String i_ODR_REM_QTY = null;

	// 第 12 変数初期値： i_SUM_OD


	final static String i_SUM_OD = null;

	// 第 13 変数初期値： i_SUM_STOCK_ON_HAND_QTY


	final static String i_SUM_STOCK_ON_HAND_QTY = null;

	// 第 14 変数初期値： i_QTY_DIFF


	final static String i_QTY_DIFF = null;

	// 第 15 変数初期値： i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// 第 16 変数初期値： i_IN_DATE


	final static String i_IN_DATE = null;

	// 第 17 変数初期値： i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_w_BUSINESS_OPR_DATE

	final static String i_w_BUSINESS_OPR_DATE = null;

	// 第 3 変数初期値： i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// 第 4 変数初期値： i_w_COMPANY_CD

	final static String i_w_COMPANY_CD = null;

	// 第 5 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 6 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 7 変数初期値： i_SUM_ODR_QTY

	final static String i_SUM_ODR_QTY = null;

	// 第 8 変数初期値： i_UNCONFIRM_ODR_QTY

	final static String i_UNCONFIRM_ODR_QTY = null;

	// 第 9 変数初期値： i_PLN_QTY_REMAIN

	final static String i_PLN_QTY_REMAIN = null;

	// 第 10 変数初期値： i_SHIP_QTY

	final static String i_SHIP_QTY = null;

	// 第 11 変数初期値： i_ODR_REM_QTY

	final static String i_ODR_REM_QTY = null;

	// 第 12 変数初期値： i_SUM_OD

	final static String i_SUM_OD = null;

	// 第 13 変数初期値： i_SUM_STOCK_ON_HAND_QTY

	final static String i_SUM_STOCK_ON_HAND_QTY = null;

	// 第 14 変数初期値： i_QTY_DIFF

	final static String i_QTY_DIFF = null;

	// 第 15 変数初期値： i_PKG_UNIT

	final static String i_PKG_UNIT = null;

	// 第 16 変数初期値： i_IN_DATE

	final static String i_IN_DATE = null;

	// 第 17 変数初期値： i_IN_ITEM_CD

	final static String i_IN_ITEM_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_w_BUSINESS_OPR_DATE = i_w_BUSINESS_OPR_DATE;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_w_COMPANY_CD = i_w_COMPANY_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_SUM_ODR_QTY = i_SUM_ODR_QTY;
		m_UNCONFIRM_ODR_QTY = i_UNCONFIRM_ODR_QTY;
		m_PLN_QTY_REMAIN = i_PLN_QTY_REMAIN;
		m_SHIP_QTY = i_SHIP_QTY;
		m_ODR_REM_QTY = i_ODR_REM_QTY;
		m_SUM_OD = i_SUM_OD;
		m_SUM_STOCK_ON_HAND_QTY = i_SUM_STOCK_ON_HAND_QTY;
		m_QTY_DIFF = i_QTY_DIFF;
		m_PKG_UNIT = i_PKG_UNIT;
		m_IN_DATE = i_IN_DATE;
		m_IN_ITEM_CD = i_IN_ITEM_CD;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
