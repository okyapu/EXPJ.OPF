/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0080/src/com/nec/jp/orteus/metamorBase/AN0080/AN0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0080;

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

public class AN0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 2 変数： m_h_IssueInst_MODIFY_COUNT */
	public String m_h_IssueInst_MODIFY_COUNT = null;
	/** 第 3 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 4 変数： m_h_OprInst_MODIFY_COUNT */
	public String m_h_OprInst_MODIFY_COUNT = null;
	/** 第 5 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 6 変数： m_h_PuchOdr_MODIFY_COUNT */
	public String m_h_PuchOdr_MODIFY_COUNT = null;
	/** 第 7 変数： m_TRANSPORT_SLIP_CD */
	public String m_TRANSPORT_SLIP_CD = null;
	/** 第 8 変数： m_h_TransportSlip_MODIFY_COUNT */
	public String m_h_TransportSlip_MODIFY_COUNT = null;
	/** 第 9 変数： m_JOB_ODR_CD_PREFIX */
	public String m_JOB_ODR_CD_PREFIX = null;
	/** 第 10 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 11 変数： m_h_JobOdr_MODIFY_COUNT */
	public String m_h_JobOdr_MODIFY_COUNT = null;
	/** 第 12 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 13 変数： m_h_WorkOdr_MODIFY_COUNT */
	public String m_h_WorkOdr_MODIFY_COUNT = null;
	/** 第 14 変数： m_EXTERNAL_PLAN_CD */
	public String m_EXTERNAL_PLAN_CD = null;
	/** 第 15 変数： m_h_ExternalPlan_MODIFY_COUNT */
	public String m_h_ExternalPlan_MODIFY_COUNT = null;
	/** 第 16 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 17 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 18 変数： m_h_ISSUE_INST_CD */
	public String m_h_ISSUE_INST_CD = null;
	/** 第 19 変数： m_h_OPR_INST_CD */
	public String m_h_OPR_INST_CD = null;
	/** 第 20 変数： m_h_WORK_ODR_CD */
	public String m_h_WORK_ODR_CD = null;
	/** 第 21 変数： m_h_PUCH_ODR_CD */
	public String m_h_PUCH_ODR_CD = null;
	/** 第 22 変数： m_h_TRANSPORT_SLIP_CD */
	public String m_h_TRANSPORT_SLIP_CD = null;
	/** 第 23 変数： m_h_EXTERNAL_PLAN_CD */
	public String m_h_EXTERNAL_PLAN_CD = null;
	/** 第 24 変数： m_h_JOB_ODR_CD_PREFIX */
	public String m_h_JOB_ODR_CD_PREFIX = null;
	/** 第 25 変数： m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 2 List変数： l_h_IssueInst_MODIFY_COUNT */
	public List l_h_IssueInst_MODIFY_COUNT = null;

	/** 第 3 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 4 List変数： l_h_OprInst_MODIFY_COUNT */
	public List l_h_OprInst_MODIFY_COUNT = null;

	/** 第 5 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 6 List変数： l_h_PuchOdr_MODIFY_COUNT */
	public List l_h_PuchOdr_MODIFY_COUNT = null;

	/** 第 7 List変数： l_TRANSPORT_SLIP_CD */
	public List l_TRANSPORT_SLIP_CD = null;

	/** 第 8 List変数： l_h_TransportSlip_MODIFY_COUNT */
	public List l_h_TransportSlip_MODIFY_COUNT = null;

	/** 第 9 List変数： l_JOB_ODR_CD_PREFIX */
	public List l_JOB_ODR_CD_PREFIX = null;

	/** 第 10 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 11 List変数： l_h_JobOdr_MODIFY_COUNT */
	public List l_h_JobOdr_MODIFY_COUNT = null;

	/** 第 12 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 13 List変数： l_h_WorkOdr_MODIFY_COUNT */
	public List l_h_WorkOdr_MODIFY_COUNT = null;

	/** 第 14 List変数： l_EXTERNAL_PLAN_CD */
	public List l_EXTERNAL_PLAN_CD = null;

	/** 第 15 List変数： l_h_ExternalPlan_MODIFY_COUNT */
	public List l_h_ExternalPlan_MODIFY_COUNT = null;

	/** 第 16 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 17 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 18 List変数： l_h_ISSUE_INST_CD */
	public List l_h_ISSUE_INST_CD = null;

	/** 第 19 List変数： l_h_OPR_INST_CD */
	public List l_h_OPR_INST_CD = null;

	/** 第 20 List変数： l_h_WORK_ODR_CD */
	public List l_h_WORK_ODR_CD = null;

	/** 第 21 List変数： l_h_PUCH_ODR_CD */
	public List l_h_PUCH_ODR_CD = null;

	/** 第 22 List変数： l_h_TRANSPORT_SLIP_CD */
	public List l_h_TRANSPORT_SLIP_CD = null;

	/** 第 23 List変数： l_h_EXTERNAL_PLAN_CD */
	public List l_h_EXTERNAL_PLAN_CD = null;

	/** 第 24 List変数： l_h_JOB_ODR_CD_PREFIX */
	public List l_h_JOB_ODR_CD_PREFIX = null;

	/** 第 25 List変数： l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String geth_IssueInst_MODIFY_COUNT() { return m_h_IssueInst_MODIFY_COUNT; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String geth_OprInst_MODIFY_COUNT() { return m_h_OprInst_MODIFY_COUNT; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String geth_PuchOdr_MODIFY_COUNT() { return m_h_PuchOdr_MODIFY_COUNT; }
	public String getTRANSPORT_SLIP_CD() { return m_TRANSPORT_SLIP_CD; }
	public String geth_TransportSlip_MODIFY_COUNT() { return m_h_TransportSlip_MODIFY_COUNT; }
	public String getJOB_ODR_CD_PREFIX() { return m_JOB_ODR_CD_PREFIX; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String geth_JobOdr_MODIFY_COUNT() { return m_h_JobOdr_MODIFY_COUNT; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String geth_WorkOdr_MODIFY_COUNT() { return m_h_WorkOdr_MODIFY_COUNT; }
	public String getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }
	public String geth_ExternalPlan_MODIFY_COUNT() { return m_h_ExternalPlan_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String geth_ISSUE_INST_CD() { return m_h_ISSUE_INST_CD; }
	public String geth_OPR_INST_CD() { return m_h_OPR_INST_CD; }
	public String geth_WORK_ODR_CD() { return m_h_WORK_ODR_CD; }
	public String geth_PUCH_ODR_CD() { return m_h_PUCH_ODR_CD; }
	public String geth_TRANSPORT_SLIP_CD() { return m_h_TRANSPORT_SLIP_CD; }
	public String geth_EXTERNAL_PLAN_CD() { return m_h_EXTERNAL_PLAN_CD; }
	public String geth_JOB_ODR_CD_PREFIX() { return m_h_JOB_ODR_CD_PREFIX; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }

	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_h_IssueInst_MODIFY_COUNT() { return l_h_IssueInst_MODIFY_COUNT; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_h_OprInst_MODIFY_COUNT() { return l_h_OprInst_MODIFY_COUNT; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_h_PuchOdr_MODIFY_COUNT() { return l_h_PuchOdr_MODIFY_COUNT; }
	public List getList_TRANSPORT_SLIP_CD() { return l_TRANSPORT_SLIP_CD; }
	public List getList_h_TransportSlip_MODIFY_COUNT() { return l_h_TransportSlip_MODIFY_COUNT; }
	public List getList_JOB_ODR_CD_PREFIX() { return l_JOB_ODR_CD_PREFIX; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_h_JobOdr_MODIFY_COUNT() { return l_h_JobOdr_MODIFY_COUNT; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_h_WorkOdr_MODIFY_COUNT() { return l_h_WorkOdr_MODIFY_COUNT; }
	public List getList_EXTERNAL_PLAN_CD() { return l_EXTERNAL_PLAN_CD; }
	public List getList_h_ExternalPlan_MODIFY_COUNT() { return l_h_ExternalPlan_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_h_ISSUE_INST_CD() { return l_h_ISSUE_INST_CD; }
	public List getList_h_OPR_INST_CD() { return l_h_OPR_INST_CD; }
	public List getList_h_WORK_ODR_CD() { return l_h_WORK_ODR_CD; }
	public List getList_h_PUCH_ODR_CD() { return l_h_PUCH_ODR_CD; }
	public List getList_h_TRANSPORT_SLIP_CD() { return l_h_TRANSPORT_SLIP_CD; }
	public List getList_h_EXTERNAL_PLAN_CD() { return l_h_EXTERNAL_PLAN_CD; }
	public List getList_h_JOB_ODR_CD_PREFIX() { return l_h_JOB_ODR_CD_PREFIX; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }

	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void seth_IssueInst_MODIFY_COUNT(String val) { m_h_IssueInst_MODIFY_COUNT = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void seth_OprInst_MODIFY_COUNT(String val) { m_h_OprInst_MODIFY_COUNT = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void seth_PuchOdr_MODIFY_COUNT(String val) { m_h_PuchOdr_MODIFY_COUNT = val; }
	public void setTRANSPORT_SLIP_CD(String val) { m_TRANSPORT_SLIP_CD = val; }
	public void seth_TransportSlip_MODIFY_COUNT(String val) { m_h_TransportSlip_MODIFY_COUNT = val; }
	public void setJOB_ODR_CD_PREFIX(String val) { m_JOB_ODR_CD_PREFIX = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void seth_JobOdr_MODIFY_COUNT(String val) { m_h_JobOdr_MODIFY_COUNT = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void seth_WorkOdr_MODIFY_COUNT(String val) { m_h_WorkOdr_MODIFY_COUNT = val; }
	public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }
	public void seth_ExternalPlan_MODIFY_COUNT(String val) { m_h_ExternalPlan_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void seth_ISSUE_INST_CD(String val) { m_h_ISSUE_INST_CD = val; }
	public void seth_OPR_INST_CD(String val) { m_h_OPR_INST_CD = val; }
	public void seth_WORK_ODR_CD(String val) { m_h_WORK_ODR_CD = val; }
	public void seth_PUCH_ODR_CD(String val) { m_h_PUCH_ODR_CD = val; }
	public void seth_TRANSPORT_SLIP_CD(String val) { m_h_TRANSPORT_SLIP_CD = val; }
	public void seth_EXTERNAL_PLAN_CD(String val) { m_h_EXTERNAL_PLAN_CD = val; }
	public void seth_JOB_ODR_CD_PREFIX(String val) { m_h_JOB_ODR_CD_PREFIX = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }


	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_h_IssueInst_MODIFY_COUNT(List list) { l_h_IssueInst_MODIFY_COUNT = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_h_OprInst_MODIFY_COUNT(List list) { l_h_OprInst_MODIFY_COUNT = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_h_PuchOdr_MODIFY_COUNT(List list) { l_h_PuchOdr_MODIFY_COUNT = list; }
	public void setList_TRANSPORT_SLIP_CD(List list) { l_TRANSPORT_SLIP_CD = list; }
	public void setList_h_TransportSlip_MODIFY_COUNT(List list) { l_h_TransportSlip_MODIFY_COUNT = list; }
	public void setList_JOB_ODR_CD_PREFIX(List list) { l_JOB_ODR_CD_PREFIX = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_h_JobOdr_MODIFY_COUNT(List list) { l_h_JobOdr_MODIFY_COUNT = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_h_WorkOdr_MODIFY_COUNT(List list) { l_h_WorkOdr_MODIFY_COUNT = list; }
	public void setList_EXTERNAL_PLAN_CD(List list) { l_EXTERNAL_PLAN_CD = list; }
	public void setList_h_ExternalPlan_MODIFY_COUNT(List list) { l_h_ExternalPlan_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_h_ISSUE_INST_CD(List list) { l_h_ISSUE_INST_CD = list; }
	public void setList_h_OPR_INST_CD(List list) { l_h_OPR_INST_CD = list; }
	public void setList_h_WORK_ODR_CD(List list) { l_h_WORK_ODR_CD = list; }
	public void setList_h_PUCH_ODR_CD(List list) { l_h_PUCH_ODR_CD = list; }
	public void setList_h_TRANSPORT_SLIP_CD(List list) { l_h_TRANSPORT_SLIP_CD = list; }
	public void setList_h_EXTERNAL_PLAN_CD(List list) { l_h_EXTERNAL_PLAN_CD = list; }
	public void setList_h_JOB_ODR_CD_PREFIX(List list) { l_h_JOB_ODR_CD_PREFIX = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }

	public int setL2L_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_CD == null) {
			l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_CD.add(((AN0080010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_h_IssueInst_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_IssueInst_MODIFY_COUNT == null) {
			l_h_IssueInst_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_IssueInst_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_IssueInst_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_IssueInst_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AN0080010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_h_OprInst_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OprInst_MODIFY_COUNT == null) {
			l_h_OprInst_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_OprInst_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OprInst_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_OprInst_MODIFY_COUNT());
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
			l_PUCH_ODR_CD.add(((AN0080010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_PuchOdr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PuchOdr_MODIFY_COUNT == null) {
			l_h_PuchOdr_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_PuchOdr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PuchOdr_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_PuchOdr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_TRANSPORT_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_SLIP_CD == null) {
			l_TRANSPORT_SLIP_CD = new ArrayList();
		} else {
			l_TRANSPORT_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_SLIP_CD.add(((AN0080010Struct) list.get(i)).getTRANSPORT_SLIP_CD());
		}
		return size;
	}
	public int setL2L_h_TransportSlip_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TransportSlip_MODIFY_COUNT == null) {
			l_h_TransportSlip_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_TransportSlip_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TransportSlip_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_TransportSlip_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD_PREFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD_PREFIX == null) {
			l_JOB_ODR_CD_PREFIX = new ArrayList();
		} else {
			l_JOB_ODR_CD_PREFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD_PREFIX.add(((AN0080010Struct) list.get(i)).getJOB_ODR_CD_PREFIX());
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
			l_JOB_ODR_CD.add(((AN0080010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_JobOdr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JobOdr_MODIFY_COUNT == null) {
			l_h_JobOdr_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_JobOdr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JobOdr_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_JobOdr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AN0080010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_WorkOdr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WorkOdr_MODIFY_COUNT == null) {
			l_h_WorkOdr_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_WorkOdr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WorkOdr_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_WorkOdr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_CD == null) {
			l_EXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_CD.add(((AN0080010Struct) list.get(i)).getEXTERNAL_PLAN_CD());
		}
		return size;
	}
	public int setL2L_h_ExternalPlan_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ExternalPlan_MODIFY_COUNT == null) {
			l_h_ExternalPlan_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_ExternalPlan_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ExternalPlan_MODIFY_COUNT.add(((AN0080010Struct) list.get(i)).geth_ExternalPlan_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AN0080010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AN0080010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_h_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_INST_CD == null) {
			l_h_ISSUE_INST_CD = new ArrayList();
		} else {
			l_h_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_INST_CD.add(((AN0080010Struct) list.get(i)).geth_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_h_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_INST_CD == null) {
			l_h_OPR_INST_CD = new ArrayList();
		} else {
			l_h_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_INST_CD.add(((AN0080010Struct) list.get(i)).geth_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_h_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_ODR_CD == null) {
			l_h_WORK_ODR_CD = new ArrayList();
		} else {
			l_h_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_ODR_CD.add(((AN0080010Struct) list.get(i)).geth_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_CD == null) {
			l_h_PUCH_ODR_CD = new ArrayList();
		} else {
			l_h_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_CD.add(((AN0080010Struct) list.get(i)).geth_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_TRANSPORT_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TRANSPORT_SLIP_CD == null) {
			l_h_TRANSPORT_SLIP_CD = new ArrayList();
		} else {
			l_h_TRANSPORT_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TRANSPORT_SLIP_CD.add(((AN0080010Struct) list.get(i)).geth_TRANSPORT_SLIP_CD());
		}
		return size;
	}
	public int setL2L_h_EXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EXTERNAL_PLAN_CD == null) {
			l_h_EXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_h_EXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EXTERNAL_PLAN_CD.add(((AN0080010Struct) list.get(i)).geth_EXTERNAL_PLAN_CD());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD_PREFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD_PREFIX == null) {
			l_h_JOB_ODR_CD_PREFIX = new ArrayList();
		} else {
			l_h_JOB_ODR_CD_PREFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD_PREFIX.add(((AN0080010Struct) list.get(i)).geth_JOB_ODR_CD_PREFIX());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD == null) {
			l_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD.add(((AN0080010Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ISSUE_INST_CD = null;
		m_h_IssueInst_MODIFY_COUNT = null;
		m_OPR_INST_CD = null;
		m_h_OprInst_MODIFY_COUNT = null;
		m_PUCH_ODR_CD = null;
		m_h_PuchOdr_MODIFY_COUNT = null;
		m_TRANSPORT_SLIP_CD = null;
		m_h_TransportSlip_MODIFY_COUNT = null;
		m_JOB_ODR_CD_PREFIX = null;
		m_JOB_ODR_CD = null;
		m_h_JobOdr_MODIFY_COUNT = null;
		m_WORK_ODR_CD = null;
		m_h_WorkOdr_MODIFY_COUNT = null;
		m_EXTERNAL_PLAN_CD = null;
		m_h_ExternalPlan_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_h_ISSUE_INST_CD = null;
		m_h_OPR_INST_CD = null;
		m_h_WORK_ODR_CD = null;
		m_h_PUCH_ODR_CD = null;
		m_h_TRANSPORT_SLIP_CD = null;
		m_h_EXTERNAL_PLAN_CD = null;
		m_h_JOB_ODR_CD_PREFIX = null;
		m_h_JOB_ODR_CD = null;

		l_ISSUE_INST_CD = null;
		l_h_IssueInst_MODIFY_COUNT = null;
		l_OPR_INST_CD = null;
		l_h_OprInst_MODIFY_COUNT = null;
		l_PUCH_ODR_CD = null;
		l_h_PuchOdr_MODIFY_COUNT = null;
		l_TRANSPORT_SLIP_CD = null;
		l_h_TransportSlip_MODIFY_COUNT = null;
		l_JOB_ODR_CD_PREFIX = null;
		l_JOB_ODR_CD = null;
		l_h_JobOdr_MODIFY_COUNT = null;
		l_WORK_ODR_CD = null;
		l_h_WorkOdr_MODIFY_COUNT = null;
		l_EXTERNAL_PLAN_CD = null;
		l_h_ExternalPlan_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_h_ISSUE_INST_CD = null;
		l_h_OPR_INST_CD = null;
		l_h_WORK_ODR_CD = null;
		l_h_PUCH_ODR_CD = null;
		l_h_TRANSPORT_SLIP_CD = null;
		l_h_EXTERNAL_PLAN_CD = null;
		l_h_JOB_ODR_CD_PREFIX = null;
		l_h_JOB_ODR_CD = null;

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
	 * medAN0080010クラスの標準コンストラクタ
	 */
	public AN0080010Struct()
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
	public void setStruct(AN0080010Struct struct)
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
	public void setStructM(AN0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.seth_IssueInst_MODIFY_COUNT(struct.geth_IssueInst_MODIFY_COUNT());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.seth_OprInst_MODIFY_COUNT(struct.geth_OprInst_MODIFY_COUNT());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.seth_PuchOdr_MODIFY_COUNT(struct.geth_PuchOdr_MODIFY_COUNT());
			this.setTRANSPORT_SLIP_CD(struct.getTRANSPORT_SLIP_CD());
			this.seth_TransportSlip_MODIFY_COUNT(struct.geth_TransportSlip_MODIFY_COUNT());
			this.setJOB_ODR_CD_PREFIX(struct.getJOB_ODR_CD_PREFIX());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.seth_JobOdr_MODIFY_COUNT(struct.geth_JobOdr_MODIFY_COUNT());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.seth_WorkOdr_MODIFY_COUNT(struct.geth_WorkOdr_MODIFY_COUNT());
			this.setEXTERNAL_PLAN_CD(struct.getEXTERNAL_PLAN_CD());
			this.seth_ExternalPlan_MODIFY_COUNT(struct.geth_ExternalPlan_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.seth_OPR_INST_CD(struct.geth_OPR_INST_CD());
			this.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());
			this.seth_PUCH_ODR_CD(struct.geth_PUCH_ODR_CD());
			this.seth_TRANSPORT_SLIP_CD(struct.geth_TRANSPORT_SLIP_CD());
			this.seth_EXTERNAL_PLAN_CD(struct.geth_EXTERNAL_PLAN_CD());
			this.seth_JOB_ODR_CD_PREFIX(struct.geth_JOB_ODR_CD_PREFIX());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AN0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_h_IssueInst_MODIFY_COUNT(struct.getList_h_IssueInst_MODIFY_COUNT());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_h_OprInst_MODIFY_COUNT(struct.getList_h_OprInst_MODIFY_COUNT());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_h_PuchOdr_MODIFY_COUNT(struct.getList_h_PuchOdr_MODIFY_COUNT());
			this.setList_TRANSPORT_SLIP_CD(struct.getList_TRANSPORT_SLIP_CD());
			this.setList_h_TransportSlip_MODIFY_COUNT(struct.getList_h_TransportSlip_MODIFY_COUNT());
			this.setList_JOB_ODR_CD_PREFIX(struct.getList_JOB_ODR_CD_PREFIX());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_h_JobOdr_MODIFY_COUNT(struct.getList_h_JobOdr_MODIFY_COUNT());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_h_WorkOdr_MODIFY_COUNT(struct.getList_h_WorkOdr_MODIFY_COUNT());
			this.setList_EXTERNAL_PLAN_CD(struct.getList_EXTERNAL_PLAN_CD());
			this.setList_h_ExternalPlan_MODIFY_COUNT(struct.getList_h_ExternalPlan_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_h_ISSUE_INST_CD(struct.getList_h_ISSUE_INST_CD());
			this.setList_h_OPR_INST_CD(struct.getList_h_OPR_INST_CD());
			this.setList_h_WORK_ODR_CD(struct.getList_h_WORK_ODR_CD());
			this.setList_h_PUCH_ODR_CD(struct.getList_h_PUCH_ODR_CD());
			this.setList_h_TRANSPORT_SLIP_CD(struct.getList_h_TRANSPORT_SLIP_CD());
			this.setList_h_EXTERNAL_PLAN_CD(struct.getList_h_EXTERNAL_PLAN_CD());
			this.setList_h_JOB_ODR_CD_PREFIX(struct.getList_h_JOB_ODR_CD_PREFIX());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
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
	// 第 1 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 2 変数初期値： i_h_IssueInst_MODIFY_COUNT


	final static String i_h_IssueInst_MODIFY_COUNT = null;

	// 第 3 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 4 変数初期値： i_h_OprInst_MODIFY_COUNT


	final static String i_h_OprInst_MODIFY_COUNT = null;

	// 第 5 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 6 変数初期値： i_h_PuchOdr_MODIFY_COUNT


	final static String i_h_PuchOdr_MODIFY_COUNT = null;

	// 第 7 変数初期値： i_TRANSPORT_SLIP_CD


	final static String i_TRANSPORT_SLIP_CD = null;

	// 第 8 変数初期値： i_h_TransportSlip_MODIFY_COUNT


	final static String i_h_TransportSlip_MODIFY_COUNT = null;

	// 第 9 変数初期値： i_JOB_ODR_CD_PREFIX


	final static String i_JOB_ODR_CD_PREFIX = null;

	// 第 10 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 11 変数初期値： i_h_JobOdr_MODIFY_COUNT


	final static String i_h_JobOdr_MODIFY_COUNT = null;

	// 第 12 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 13 変数初期値： i_h_WorkOdr_MODIFY_COUNT


	final static String i_h_WorkOdr_MODIFY_COUNT = null;

	// 第 14 変数初期値： i_EXTERNAL_PLAN_CD


	final static String i_EXTERNAL_PLAN_CD = null;

	// 第 15 変数初期値： i_h_ExternalPlan_MODIFY_COUNT


	final static String i_h_ExternalPlan_MODIFY_COUNT = null;

	// 第 16 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 17 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 18 変数初期値： i_h_ISSUE_INST_CD


	final static String i_h_ISSUE_INST_CD = null;

	// 第 19 変数初期値： i_h_OPR_INST_CD


	final static String i_h_OPR_INST_CD = null;

	// 第 20 変数初期値： i_h_WORK_ODR_CD


	final static String i_h_WORK_ODR_CD = null;

	// 第 21 変数初期値： i_h_PUCH_ODR_CD


	final static String i_h_PUCH_ODR_CD = null;

	// 第 22 変数初期値： i_h_TRANSPORT_SLIP_CD


	final static String i_h_TRANSPORT_SLIP_CD = null;

	// 第 23 変数初期値： i_h_EXTERNAL_PLAN_CD


	final static String i_h_EXTERNAL_PLAN_CD = null;

	// 第 24 変数初期値： i_h_JOB_ODR_CD_PREFIX


	final static String i_h_JOB_ODR_CD_PREFIX = null;

	// 第 25 変数初期値： i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_ISSUE_INST_CD
        final static String i_ISSUE_INST_CD = null;
        // 第 2 変数初期値： i_h_IssueInst_MODIFY_COUNT
        final static String i_h_IssueInst_MODIFY_COUNT = null;
        // 第 3 変数初期値： i_OPR_INST_CD
        final static String i_OPR_INST_CD = null;
        // 第 4 変数初期値： i_h_OprInst_MODIFY_COUNT
        final static String i_h_OprInst_MODIFY_COUNT = null;
        // 第 5 変数初期値： i_PUCH_ODR_CD
        final static String i_PUCH_ODR_CD = null;
        // 第 6 変数初期値： i_h_PuchOdr_MODIFY_COUNT
        final static String i_h_PuchOdr_MODIFY_COUNT = null;
        // 第 7 変数初期値： i_TRANSPORT_SLIP_CD
        final static String i_TRANSPORT_SLIP_CD = null;
        // 第 8 変数初期値： i_h_TransportSlip_MODIFY_COUNT
        final static String i_h_TransportSlip_MODIFY_COUNT = null;
        // 第 9 変数初期値： i_JOB_ODR_CD_PREFIX
        final static String i_JOB_ODR_CD_PREFIX = null;
        // 第 10 変数初期値： i_JOB_ODR_CD
        final static String i_JOB_ODR_CD = null;
        // 第 11 変数初期値： i_h_JobOdr_MODIFY_COUNT
        final static String i_h_JobOdr_MODIFY_COUNT = null;
        // 第 12 変数初期値： i_WORK_ODR_CD
        final static String i_WORK_ODR_CD = null;
        // 第 13 変数初期値： i_h_WorkOdr_MODIFY_COUNT
        final static String i_h_WorkOdr_MODIFY_COUNT = null;
        // 第 14 変数初期値： i_EXTERNAL_PLAN_CD
        final static String i_EXTERNAL_PLAN_CD = null;
        // 第 15 変数初期値： i_h_ExternalPlan_MODIFY_COUNT
        final static String i_h_ExternalPlan_MODIFY_COUNT = null;
        // 第 16 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 17 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_ISSUE_INST_CD = i_ISSUE_INST_CD;
         m_h_IssueInst_MODIFY_COUNT = i_h_IssueInst_MODIFY_COUNT;
         m_OPR_INST_CD = i_OPR_INST_CD;
         m_h_OprInst_MODIFY_COUNT = i_h_OprInst_MODIFY_COUNT;
         m_PUCH_ODR_CD = i_PUCH_ODR_CD;
         m_h_PuchOdr_MODIFY_COUNT = i_h_PuchOdr_MODIFY_COUNT;
         m_TRANSPORT_SLIP_CD = i_TRANSPORT_SLIP_CD;
         m_h_TransportSlip_MODIFY_COUNT = i_h_TransportSlip_MODIFY_COUNT;
         m_JOB_ODR_CD_PREFIX = i_JOB_ODR_CD_PREFIX;
         m_JOB_ODR_CD = i_JOB_ODR_CD;
         m_h_JobOdr_MODIFY_COUNT = i_h_JobOdr_MODIFY_COUNT;
         m_WORK_ODR_CD = i_WORK_ODR_CD;
         m_h_WorkOdr_MODIFY_COUNT = i_h_WorkOdr_MODIFY_COUNT;
         m_EXTERNAL_PLAN_CD = i_EXTERNAL_PLAN_CD;
         m_h_ExternalPlan_MODIFY_COUNT = i_h_ExternalPlan_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PLANT_NAME = i_PLANT_NAME;
        }
       
        /**
         * Structの編集領域の複写
         * @param fromStruct コピー元Struct
         */
        public void copyStructEditArea(AN0080010Struct fromStruct)
        {
         setISSUE_INST_CD(fromStruct.getISSUE_INST_CD());
         seth_ISSUE_INST_CD(fromStruct.getISSUE_INST_CD());
         seth_IssueInst_MODIFY_COUNT(fromStruct.geth_IssueInst_MODIFY_COUNT());
         setOPR_INST_CD(fromStruct.getOPR_INST_CD());
         seth_OPR_INST_CD(fromStruct.getOPR_INST_CD());
         seth_OprInst_MODIFY_COUNT(fromStruct.geth_OprInst_MODIFY_COUNT());
         setPUCH_ODR_CD(fromStruct.getPUCH_ODR_CD());
         seth_PUCH_ODR_CD(fromStruct.getPUCH_ODR_CD());
         seth_PuchOdr_MODIFY_COUNT(fromStruct.geth_PuchOdr_MODIFY_COUNT());
         setTRANSPORT_SLIP_CD(fromStruct.getTRANSPORT_SLIP_CD());
         seth_TRANSPORT_SLIP_CD(fromStruct.getTRANSPORT_SLIP_CD());
         seth_TransportSlip_MODIFY_COUNT(fromStruct.geth_TransportSlip_MODIFY_COUNT());
         setJOB_ODR_CD_PREFIX(fromStruct.getJOB_ODR_CD_PREFIX());
         seth_JOB_ODR_CD_PREFIX(fromStruct.getJOB_ODR_CD_PREFIX());
         setJOB_ODR_CD(fromStruct.getJOB_ODR_CD());
         seth_JOB_ODR_CD(fromStruct.getJOB_ODR_CD());
         seth_JobOdr_MODIFY_COUNT(fromStruct.geth_JobOdr_MODIFY_COUNT());
         setWORK_ODR_CD(fromStruct.getWORK_ODR_CD());
         seth_WORK_ODR_CD(fromStruct.getWORK_ODR_CD());
         seth_WorkOdr_MODIFY_COUNT(fromStruct.geth_WorkOdr_MODIFY_COUNT());
         setEXTERNAL_PLAN_CD(fromStruct.getEXTERNAL_PLAN_CD());
         seth_EXTERNAL_PLAN_CD(fromStruct.getEXTERNAL_PLAN_CD());
         seth_ExternalPlan_MODIFY_COUNT(fromStruct.geth_ExternalPlan_MODIFY_COUNT());
        }
       
        //}}user_implement_code

	//////////////////////////////

}
