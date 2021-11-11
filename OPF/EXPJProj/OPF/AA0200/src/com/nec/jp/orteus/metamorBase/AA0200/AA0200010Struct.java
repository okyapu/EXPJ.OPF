/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0200/src/com/nec/jp/orteus/metamorBase/AA0200/AA0200010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0200;

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
 * CLASS     : AA0200010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2015/10/27 08:06:35 $
 *
 */
//}}user_implement_code_header

public class AA0200010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rdoInsert */
	public String m_rdoInsert = null;
	/** 第 2 変数： m_rdoUpdate */
	public String m_rdoUpdate = null;
	/** 第 3 変数： m_rdoDelete */
	public String m_rdoDelete = null;
	/** 第 4 変数： m_DO_CHK */
	public String m_DO_CHK = null;
	/** 第 5 変数： m_FileName */
	public String m_FileName = null;
	/** 第 6 変数： m_CANCEL_FILE */
	public String m_CANCEL_FILE = null;
	/** 第 7 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 8 変数： m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** 第 9 変数： m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** 第 10 変数： m_l_ERR_CTR_NM */
	public String m_l_ERR_CTR_NM = null;
	/** 第 11 変数： m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** 第 12 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 13 変数： m_w_BELONG_FLG */
	public String m_w_BELONG_FLG = null;
	/** 第 14 変数： m_o_USER_CD */
	public String m_o_USER_CD = null;
	/** 第 15 変数： m_l_USER_CD */
	public String m_l_USER_CD = null;
	/** 第 16 変数： m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** 第 17 変数： m_l_PASSWORD */
	public String m_l_PASSWORD = null;
	/** 第 18 変数： m_l_COMPANY_CD */
	public String m_l_COMPANY_CD = null;
	/** 第 19 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 20 変数： m_l_SECTION_CD */
	public String m_l_SECTION_CD = null;
	/** 第 21 変数： m_l_LOCALE */
	public String m_l_LOCALE = null;
	/** 第 22 変数： m_l_ADDRESS */
	public String m_l_ADDRESS = null;
	/** 第 23 変数： m_l_APPR_POWER_TYP */
	public String m_l_APPR_POWER_TYP = null;
	/** 第 24 変数： m_l_PASSWORD_CHG_DATE */
	public String m_l_PASSWORD_CHG_DATE = null;
	/** 第 25 変数： m_l_BELONG_GROUP_CD */
	public String m_l_BELONG_GROUP_CD = null;
	/** 第 26 変数： m_l_BUSINESS_OPR_DATE */
	public String m_l_BUSINESS_OPR_DATE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rdoInsert */
	public List l_rdoInsert = null;

	/** 第 2 List変数： l_rdoUpdate */
	public List l_rdoUpdate = null;

	/** 第 3 List変数： l_rdoDelete */
	public List l_rdoDelete = null;

	/** 第 4 List変数： l_DO_CHK */
	public List l_DO_CHK = null;

	/** 第 5 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 6 List変数： l_CANCEL_FILE */
	public List l_CANCEL_FILE = null;

	/** 第 7 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 8 List変数： l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** 第 9 List変数： l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** 第 10 List変数： l_l_ERR_CTR_NM */
	public List l_l_ERR_CTR_NM = null;

	/** 第 11 List変数： l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** 第 12 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 13 List変数： l_w_BELONG_FLG */
	public List l_w_BELONG_FLG = null;

	/** 第 14 List変数： l_o_USER_CD */
	public List l_o_USER_CD = null;

	/** 第 15 List変数： l_l_USER_CD */
	public List l_l_USER_CD = null;

	/** 第 16 List変数： l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** 第 17 List変数： l_l_PASSWORD */
	public List l_l_PASSWORD = null;

	/** 第 18 List変数： l_l_COMPANY_CD */
	public List l_l_COMPANY_CD = null;

	/** 第 19 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 20 List変数： l_l_SECTION_CD */
	public List l_l_SECTION_CD = null;

	/** 第 21 List変数： l_l_LOCALE */
	public List l_l_LOCALE = null;

	/** 第 22 List変数： l_l_ADDRESS */
	public List l_l_ADDRESS = null;

	/** 第 23 List変数： l_l_APPR_POWER_TYP */
	public List l_l_APPR_POWER_TYP = null;

	/** 第 24 List変数： l_l_PASSWORD_CHG_DATE */
	public List l_l_PASSWORD_CHG_DATE = null;

	/** 第 25 List変数： l_l_BELONG_GROUP_CD */
	public List l_l_BELONG_GROUP_CD = null;

	/** 第 26 List変数： l_l_BUSINESS_OPR_DATE */
	public List l_l_BUSINESS_OPR_DATE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrdoInsert() { return m_rdoInsert; }
	public String getrdoUpdate() { return m_rdoUpdate; }
	public String getrdoDelete() { return m_rdoDelete; }
	public String getDO_CHK() { return m_DO_CHK; }
	public String getFileName() { return m_FileName; }
	public String getCANCEL_FILE() { return m_CANCEL_FILE; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getw_BELONG_FLG() { return m_w_BELONG_FLG; }
	public String geto_USER_CD() { return m_o_USER_CD; }
	public String getl_USER_CD() { return m_l_USER_CD; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_PASSWORD() { return m_l_PASSWORD; }
	public String getl_COMPANY_CD() { return m_l_COMPANY_CD; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_SECTION_CD() { return m_l_SECTION_CD; }
	public String getl_LOCALE() { return m_l_LOCALE; }
	public String getl_ADDRESS() { return m_l_ADDRESS; }
	public String getl_APPR_POWER_TYP() { return m_l_APPR_POWER_TYP; }
	public String getl_PASSWORD_CHG_DATE() { return m_l_PASSWORD_CHG_DATE; }
	public String getl_BELONG_GROUP_CD() { return m_l_BELONG_GROUP_CD; }
	public String getl_BUSINESS_OPR_DATE() { return m_l_BUSINESS_OPR_DATE; }

	public List getList_rdoInsert() { return l_rdoInsert; }
	public List getList_rdoUpdate() { return l_rdoUpdate; }
	public List getList_rdoDelete() { return l_rdoDelete; }
	public List getList_DO_CHK() { return l_DO_CHK; }
	public List getList_FileName() { return l_FileName; }
	public List getList_CANCEL_FILE() { return l_CANCEL_FILE; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_w_BELONG_FLG() { return l_w_BELONG_FLG; }
	public List getList_o_USER_CD() { return l_o_USER_CD; }
	public List getList_l_USER_CD() { return l_l_USER_CD; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_PASSWORD() { return l_l_PASSWORD; }
	public List getList_l_COMPANY_CD() { return l_l_COMPANY_CD; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_SECTION_CD() { return l_l_SECTION_CD; }
	public List getList_l_LOCALE() { return l_l_LOCALE; }
	public List getList_l_ADDRESS() { return l_l_ADDRESS; }
	public List getList_l_APPR_POWER_TYP() { return l_l_APPR_POWER_TYP; }
	public List getList_l_PASSWORD_CHG_DATE() { return l_l_PASSWORD_CHG_DATE; }
	public List getList_l_BELONG_GROUP_CD() { return l_l_BELONG_GROUP_CD; }
	public List getList_l_BUSINESS_OPR_DATE() { return l_l_BUSINESS_OPR_DATE; }

	public void setrdoInsert(String val) { m_rdoInsert = val; }
	public void setrdoUpdate(String val) { m_rdoUpdate = val; }
	public void setrdoDelete(String val) { m_rdoDelete = val; }
	public void setDO_CHK(String val) { m_DO_CHK = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void setCANCEL_FILE(String val) { m_CANCEL_FILE = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setw_BELONG_FLG(String val) { m_w_BELONG_FLG = val; }
	public void seto_USER_CD(String val) { m_o_USER_CD = val; }
	public void setl_USER_CD(String val) { m_l_USER_CD = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_PASSWORD(String val) { m_l_PASSWORD = val; }
	public void setl_COMPANY_CD(String val) { m_l_COMPANY_CD = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_SECTION_CD(String val) { m_l_SECTION_CD = val; }
	public void setl_LOCALE(String val) { m_l_LOCALE = val; }
	public void setl_ADDRESS(String val) { m_l_ADDRESS = val; }
	public void setl_APPR_POWER_TYP(String val) { m_l_APPR_POWER_TYP = val; }
	public void setl_PASSWORD_CHG_DATE(String val) { m_l_PASSWORD_CHG_DATE = val; }
	public void setl_BELONG_GROUP_CD(String val) { m_l_BELONG_GROUP_CD = val; }
	public void setl_BUSINESS_OPR_DATE(String val) { m_l_BUSINESS_OPR_DATE = val; }


	public void setList_rdoInsert(List list) { l_rdoInsert = list; }
	public void setList_rdoUpdate(List list) { l_rdoUpdate = list; }
	public void setList_rdoDelete(List list) { l_rdoDelete = list; }
	public void setList_DO_CHK(List list) { l_DO_CHK = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_CANCEL_FILE(List list) { l_CANCEL_FILE = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_w_BELONG_FLG(List list) { l_w_BELONG_FLG = list; }
	public void setList_o_USER_CD(List list) { l_o_USER_CD = list; }
	public void setList_l_USER_CD(List list) { l_l_USER_CD = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_PASSWORD(List list) { l_l_PASSWORD = list; }
	public void setList_l_COMPANY_CD(List list) { l_l_COMPANY_CD = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_SECTION_CD(List list) { l_l_SECTION_CD = list; }
	public void setList_l_LOCALE(List list) { l_l_LOCALE = list; }
	public void setList_l_ADDRESS(List list) { l_l_ADDRESS = list; }
	public void setList_l_APPR_POWER_TYP(List list) { l_l_APPR_POWER_TYP = list; }
	public void setList_l_PASSWORD_CHG_DATE(List list) { l_l_PASSWORD_CHG_DATE = list; }
	public void setList_l_BELONG_GROUP_CD(List list) { l_l_BELONG_GROUP_CD = list; }
	public void setList_l_BUSINESS_OPR_DATE(List list) { l_l_BUSINESS_OPR_DATE = list; }

	public int setL2L_rdoInsert(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoInsert == null) {
			l_rdoInsert = new ArrayList();
		} else {
			l_rdoInsert.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoInsert.add(((AA0200010Struct) list.get(i)).getrdoInsert());
		}
		return size;
	}
	public int setL2L_rdoUpdate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoUpdate == null) {
			l_rdoUpdate = new ArrayList();
		} else {
			l_rdoUpdate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoUpdate.add(((AA0200010Struct) list.get(i)).getrdoUpdate());
		}
		return size;
	}
	public int setL2L_rdoDelete(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoDelete == null) {
			l_rdoDelete = new ArrayList();
		} else {
			l_rdoDelete.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoDelete.add(((AA0200010Struct) list.get(i)).getrdoDelete());
		}
		return size;
	}
	public int setL2L_DO_CHK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DO_CHK == null) {
			l_DO_CHK = new ArrayList();
		} else {
			l_DO_CHK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DO_CHK.add(((AA0200010Struct) list.get(i)).getDO_CHK());
		}
		return size;
	}
	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AA0200010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_CANCEL_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCEL_FILE == null) {
			l_CANCEL_FILE = new ArrayList();
		} else {
			l_CANCEL_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCEL_FILE.add(((AA0200010Struct) list.get(i)).getCANCEL_FILE());
		}
		return size;
	}
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
			l_DOWNLOAD_FILE.add(((AA0200010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AA0200010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AA0200010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CTR_NM == null) {
			l_l_ERR_CTR_NM = new ArrayList();
		} else {
			l_l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CTR_NM.add(((AA0200010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AA0200010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AA0200010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_w_BELONG_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BELONG_FLG == null) {
			l_w_BELONG_FLG = new ArrayList();
		} else {
			l_w_BELONG_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BELONG_FLG.add(((AA0200010Struct) list.get(i)).getw_BELONG_FLG());
		}
		return size;
	}
	public int setL2L_o_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_o_USER_CD == null) {
			l_o_USER_CD = new ArrayList();
		} else {
			l_o_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_o_USER_CD.add(((AA0200010Struct) list.get(i)).geto_USER_CD());
		}
		return size;
	}
	public int setL2L_l_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_CD == null) {
			l_l_USER_CD = new ArrayList();
		} else {
			l_l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_CD.add(((AA0200010Struct) list.get(i)).getl_USER_CD());
		}
		return size;
	}
	public int setL2L_l_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_NAME == null) {
			l_l_USER_NAME = new ArrayList();
		} else {
			l_l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_NAME.add(((AA0200010Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_PASSWORD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PASSWORD == null) {
			l_l_PASSWORD = new ArrayList();
		} else {
			l_l_PASSWORD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PASSWORD.add(((AA0200010Struct) list.get(i)).getl_PASSWORD());
		}
		return size;
	}
	public int setL2L_l_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COMPANY_CD == null) {
			l_l_COMPANY_CD = new ArrayList();
		} else {
			l_l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COMPANY_CD.add(((AA0200010Struct) list.get(i)).getl_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AA0200010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_SECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SECTION_CD == null) {
			l_l_SECTION_CD = new ArrayList();
		} else {
			l_l_SECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SECTION_CD.add(((AA0200010Struct) list.get(i)).getl_SECTION_CD());
		}
		return size;
	}
	public int setL2L_l_LOCALE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOCALE == null) {
			l_l_LOCALE = new ArrayList();
		} else {
			l_l_LOCALE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOCALE.add(((AA0200010Struct) list.get(i)).getl_LOCALE());
		}
		return size;
	}
	public int setL2L_l_ADDRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADDRESS == null) {
			l_l_ADDRESS = new ArrayList();
		} else {
			l_l_ADDRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADDRESS.add(((AA0200010Struct) list.get(i)).getl_ADDRESS());
		}
		return size;
	}
	public int setL2L_l_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_POWER_TYP == null) {
			l_l_APPR_POWER_TYP = new ArrayList();
		} else {
			l_l_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_POWER_TYP.add(((AA0200010Struct) list.get(i)).getl_APPR_POWER_TYP());
		}
		return size;
	}
	public int setL2L_l_PASSWORD_CHG_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PASSWORD_CHG_DATE == null) {
			l_l_PASSWORD_CHG_DATE = new ArrayList();
		} else {
			l_l_PASSWORD_CHG_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PASSWORD_CHG_DATE.add(((AA0200010Struct) list.get(i)).getl_PASSWORD_CHG_DATE());
		}
		return size;
	}
	public int setL2L_l_BELONG_GROUP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_BELONG_GROUP_CD == null) {
			l_l_BELONG_GROUP_CD = new ArrayList();
		} else {
			l_l_BELONG_GROUP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_BELONG_GROUP_CD.add(((AA0200010Struct) list.get(i)).getl_BELONG_GROUP_CD());
		}
		return size;
	}
	public int setL2L_l_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_BUSINESS_OPR_DATE == null) {
			l_l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_BUSINESS_OPR_DATE.add(((AA0200010Struct) list.get(i)).getl_BUSINESS_OPR_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoInsert = null;
		m_rdoUpdate = null;
		m_rdoDelete = null;
		m_DO_CHK = null;
		m_FileName = null;
		m_CANCEL_FILE = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_TYP = null;
		m_l_ERR_CTR_NM = null;
		m_l_ERR_INFO = null;
		m_w_COLUMN_FLG = null;
		m_w_BELONG_FLG = null;
		m_o_USER_CD = null;
		m_l_USER_CD = null;
		m_l_USER_NAME = null;
		m_l_PASSWORD = null;
		m_l_COMPANY_CD = null;
		m_l_PLANT_CD = null;
		m_l_SECTION_CD = null;
		m_l_LOCALE = null;
		m_l_ADDRESS = null;
		m_l_APPR_POWER_TYP = null;
		m_l_PASSWORD_CHG_DATE = null;
		m_l_BELONG_GROUP_CD = null;
		m_l_BUSINESS_OPR_DATE = null;

		l_rdoInsert = null;
		l_rdoUpdate = null;
		l_rdoDelete = null;
		l_DO_CHK = null;
		l_FileName = null;
		l_CANCEL_FILE = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_TYP = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_INFO = null;
		l_w_COLUMN_FLG = null;
		l_w_BELONG_FLG = null;
		l_o_USER_CD = null;
		l_l_USER_CD = null;
		l_l_USER_NAME = null;
		l_l_PASSWORD = null;
		l_l_COMPANY_CD = null;
		l_l_PLANT_CD = null;
		l_l_SECTION_CD = null;
		l_l_LOCALE = null;
		l_l_ADDRESS = null;
		l_l_APPR_POWER_TYP = null;
		l_l_PASSWORD_CHG_DATE = null;
		l_l_BELONG_GROUP_CD = null;
		l_l_BUSINESS_OPR_DATE = null;

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
	 * medAA0200010クラスの標準コンストラクタ
	 */
	public AA0200010Struct()
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
	public void setStruct(AA0200010Struct struct)
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
	public void setStructM(AA0200010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoInsert(struct.getrdoInsert());
			this.setrdoUpdate(struct.getrdoUpdate());
			this.setrdoDelete(struct.getrdoDelete());
			this.setDO_CHK(struct.getDO_CHK());
			this.setFileName(struct.getFileName());
			this.setCANCEL_FILE(struct.getCANCEL_FILE());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setl_ERR_CTR_NM(struct.getl_ERR_CTR_NM());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setw_BELONG_FLG(struct.getw_BELONG_FLG());
			this.seto_USER_CD(struct.geto_USER_CD());
			this.setl_USER_CD(struct.getl_USER_CD());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_PASSWORD(struct.getl_PASSWORD());
			this.setl_COMPANY_CD(struct.getl_COMPANY_CD());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_SECTION_CD(struct.getl_SECTION_CD());
			this.setl_LOCALE(struct.getl_LOCALE());
			this.setl_ADDRESS(struct.getl_ADDRESS());
			this.setl_APPR_POWER_TYP(struct.getl_APPR_POWER_TYP());
			this.setl_PASSWORD_CHG_DATE(struct.getl_PASSWORD_CHG_DATE());
			this.setl_BELONG_GROUP_CD(struct.getl_BELONG_GROUP_CD());
			this.setl_BUSINESS_OPR_DATE(struct.getl_BUSINESS_OPR_DATE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0200010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoInsert(struct.getList_rdoInsert());
			this.setList_rdoUpdate(struct.getList_rdoUpdate());
			this.setList_rdoDelete(struct.getList_rdoDelete());
			this.setList_DO_CHK(struct.getList_DO_CHK());
			this.setList_FileName(struct.getList_FileName());
			this.setList_CANCEL_FILE(struct.getList_CANCEL_FILE());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_l_ERR_CTR_NM(struct.getList_l_ERR_CTR_NM());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_w_BELONG_FLG(struct.getList_w_BELONG_FLG());
			this.setList_o_USER_CD(struct.getList_o_USER_CD());
			this.setList_l_USER_CD(struct.getList_l_USER_CD());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_PASSWORD(struct.getList_l_PASSWORD());
			this.setList_l_COMPANY_CD(struct.getList_l_COMPANY_CD());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_SECTION_CD(struct.getList_l_SECTION_CD());
			this.setList_l_LOCALE(struct.getList_l_LOCALE());
			this.setList_l_ADDRESS(struct.getList_l_ADDRESS());
			this.setList_l_APPR_POWER_TYP(struct.getList_l_APPR_POWER_TYP());
			this.setList_l_PASSWORD_CHG_DATE(struct.getList_l_PASSWORD_CHG_DATE());
			this.setList_l_BELONG_GROUP_CD(struct.getList_l_BELONG_GROUP_CD());
			this.setList_l_BUSINESS_OPR_DATE(struct.getList_l_BUSINESS_OPR_DATE());
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
	// 第 1 変数初期値： i_rdoInsert


	final static String i_rdoInsert = null;

	// 第 2 変数初期値： i_rdoUpdate


	final static String i_rdoUpdate = null;

	// 第 3 変数初期値： i_rdoDelete


	final static String i_rdoDelete = null;

	// 第 4 変数初期値： i_DO_CHK


	final static String i_DO_CHK = null;

	// 第 5 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 6 変数初期値： i_CANCEL_FILE


	final static String i_CANCEL_FILE = null;

	// 第 7 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 8 変数初期値： i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// 第 9 変数初期値： i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// 第 10 変数初期値： i_l_ERR_CTR_NM


	final static String i_l_ERR_CTR_NM = null;

	// 第 11 変数初期値： i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// 第 12 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 13 変数初期値： i_w_BELONG_FLG


	final static String i_w_BELONG_FLG = null;

	// 第 14 変数初期値： i_o_USER_CD


	final static String i_o_USER_CD = null;

	// 第 15 変数初期値： i_l_USER_CD


	final static String i_l_USER_CD = null;

	// 第 16 変数初期値： i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// 第 17 変数初期値： i_l_PASSWORD


	final static String i_l_PASSWORD = null;

	// 第 18 変数初期値： i_l_COMPANY_CD


	final static String i_l_COMPANY_CD = null;

	// 第 19 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 20 変数初期値： i_l_SECTION_CD


	final static String i_l_SECTION_CD = null;

	// 第 21 変数初期値： i_l_LOCALE


	final static String i_l_LOCALE = null;

	// 第 22 変数初期値： i_l_ADDRESS


	final static String i_l_ADDRESS = null;

	// 第 23 変数初期値： i_l_APPR_POWER_TYP


	final static String i_l_APPR_POWER_TYP = null;

	// 第 24 変数初期値： i_l_PASSWORD_CHG_DATE


	final static String i_l_PASSWORD_CHG_DATE = null;

	// 第 25 変数初期値： i_l_BELONG_GROUP_CD


	final static String i_l_BELONG_GROUP_CD = null;

	// 第 26 変数初期値： i_l_BUSINESS_OPR_DATE


	final static String i_l_BUSINESS_OPR_DATE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_rdoInsert

	final static String i_rdoInsert = null;

	// 第 2 変数初期値： i_rdoUpdate

	final static String i_rdoUpdate = null;

	// 第 3 変数初期値： i_rdoDelete

	final static String i_rdoDelete = null;

	// 第 4 変数初期値： i_DO_CHK

	final static String i_DO_CHK = null;

	// 第 5 変数初期値： i_FileName

	final static String i_FileName = null;

	// 第 6 変数初期値： i_CANCEL_FILE

	final static String i_CANCEL_FILE = null;

	// 第 7 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 8 変数初期値： i_l_ERROR_IN

	final static String i_l_ERROR_IN = null;

	// 第 9 変数初期値： i_l_ERR_TYP

	final static String i_l_ERR_TYP = null;

	// 第 10 変数初期値： i_l_USER_CD

	final static String i_l_USER_CD = null;

	// 第 11 変数初期値： i_l_ERR_CTR_NM

	final static String i_l_ERR_CTR_NM = null;

	// 第 12 変数初期値： i_l_ERR_INFO

	final static String i_l_ERR_INFO = null;

	// 第 13 変数初期値： i_w_COLUMN_FLG

	final static String i_w_COLUMN_FLG = null;

	// 第 14 変数初期値： i_w_BELONG_FLG

	final static String i_w_BELONG_FLG = null;

	// 第 15 変数初期値： i_o_USER_CD

	final static String i_o_USER_CD = null;

	// 第 16 変数初期値： i_l_USER_NAME

	final static String i_l_USER_NAME = null;

	// 第 17 変数初期値： i_l_PASSWORD

	final static String i_l_PASSWORD = null;

	// 第 18 変数初期値： i_l_COMPANY_CD

	final static String i_l_COMPANY_CD = null;

	// 第 19 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 20 変数初期値： i_l_SECTION_CD

	final static String i_l_SECTION_CD = null;

	// 第 21 変数初期値： i_l_LOCALE

	final static String i_l_LOCALE = null;

	// 第 22 変数初期値： i_l_ADDRESS

	final static String i_l_ADDRESS = null;

	// 第 23 変数初期値： i_l_APPR_POWER_TYP

	final static String i_l_APPR_POWER_TYP = null;

	// 第 24 変数初期値： i_l_PASSWORD_CHG_DATE

	final static String i_l_PASSWORD_CHG_DATE = null;

	// 第 25 変数初期値： i_l_BELONG_GROUP_CD

	final static String i_l_BELONG_GROUP_CD = null;

	// 第 26 変数初期値： i_l_BUSINESS_OPR_DATE

	final static String i_l_BUSINESS_OPR_DATE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_rdoInsert = i_rdoInsert;
		m_rdoUpdate = i_rdoUpdate;
		m_rdoDelete = i_rdoDelete;
		m_DO_CHK = i_DO_CHK;
		m_FileName = i_FileName;
		m_CANCEL_FILE = i_CANCEL_FILE;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_ERROR_IN = i_l_ERROR_IN;
		m_l_ERR_TYP = i_l_ERR_TYP;
		m_l_USER_CD = i_l_USER_CD;
		m_l_ERR_CTR_NM = i_l_ERR_CTR_NM;
		m_l_ERR_INFO = i_l_ERR_INFO;
		m_w_COLUMN_FLG = i_w_COLUMN_FLG;
		m_w_BELONG_FLG = i_w_BELONG_FLG;
		m_o_USER_CD = i_o_USER_CD;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_PASSWORD = i_l_PASSWORD;
		m_l_COMPANY_CD = i_l_COMPANY_CD;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_SECTION_CD = i_l_SECTION_CD;
		m_l_LOCALE = i_l_LOCALE;
		m_l_ADDRESS = i_l_ADDRESS;
		m_l_APPR_POWER_TYP = i_l_APPR_POWER_TYP;
		m_l_PASSWORD_CHG_DATE = i_l_PASSWORD_CHG_DATE;
		m_l_BELONG_GROUP_CD = i_l_BELONG_GROUP_CD;
		m_l_BUSINESS_OPR_DATE = i_l_BUSINESS_OPR_DATE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
