/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/medAD0080B001.java,v $
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
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 * EXPJ    (2004/03/21),EXPLANNER/J用に改造
 *                      SystemLogの記述を追加。
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : medAD0080B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.13 $ $Date: 2015/12/22 09:52:54 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAD0080B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_FIRST_WORK_FLG;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_PARTIAL_PRD_NO;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_USE_LOT_NO;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_USE_ACPT_QTY;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_USE_DEFECT_QTY;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_OPR_INST_CD;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_OPR_RSLT_TEMP_CTL_NO;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_ACPT_QTY;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_DEFECT_QTY;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_OPR_DATE;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_WH_CD;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_WS_CD;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_OPR_RSLT_PERSON;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_OPR_RSLT_COMMENT;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_OPR_TIME_UNIT_TYP;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_PRE_ARRANGEMENT_TIME;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_POST_ARRANGEMENT_TIME;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_OPR_TIME;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_CESSATION_TIME;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_CESSATION_CAUSE;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_LOT_NO;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_VEND_LOT_NO;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD1;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_DEFECT_QTY1;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_DEFECT_COMMENT1;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD2;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_DEFECT_QTY2;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_DEFECT_COMMENT2;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD3;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_DEFECT_QTY3;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_DEFECT_COMMENT3;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD4;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_DEFECT_QTY4;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_DEFECT_COMMENT4;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD5;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_DEFECT_QTY5;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_DEFECT_COMMENT5;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_OPR_CMPLT_FLG;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_SUM_DEFECT_QTY;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_TAKE_DATE;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_CHILD_RSLTUPDATE_FLG;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_INTAKE_TERM_FROM;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_INTAKE_TERM_TO;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_DEFECT_CAUSE_CD;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_BEST_BEFORE_DATE;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_PRG_NM;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_RSLT_TAKE_ERR_TYP;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_RSLT_TAKE_ERR_INFO;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_IDENT_CARD_CTL_NO;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_PKG_UNIT_QTY;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_RCV_ISSUE_CTRL_CD;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_JOB_ODR_CD;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_FIRST_IDENT_CARD_QTY;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_IDENT_CARD_QTY;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 59 mediator変数
	 */
	protected String m_SUM_ACPT_QTY;

	/**
	 * 第 60 mediator変数
	 */
	protected String m_PRODUCT_TYP;

	/**
	 * 第 61 mediator変数
	 */
	protected String m_WH_TYP;

	/**
	 * 第 62 mediator変数
	 */
	protected String m_NEXT_WH_CD;

	/**
	 * 第 63 mediator変数
	 */
	protected String m_WH_CD_COUNT;

	/**
	 * 第 64 mediator変数
	 */
	protected String m_FIRST_OPR_INST_CD;

	/**
	 * 第 65 mediator変数
	 */
	protected String m_FIRST_PROC_NO;

	/**
	 * 第 66 mediator変数
	 */
	protected String m_WORK_ODR_CD;

	/**
	 * 第 67 mediator変数
	 */
	protected String m_NEXT_WORK_ODR_CD;

	/**
	 * 第 68 mediator変数
	 */
	protected String m_NEXT_OPR_INST_CD;

	/**
	 * 第 69 mediator変数
	 */
	protected String m_NEXT_PROC_NO;

	/**
	 * 第 70 mediator変数
	 */
	protected String m_NEXT_WS_CD;

	/**
	 * 第 71 mediator変数
	 */
	protected String m_PROC_NO;

	/**
	 * 第 72 mediator変数
	 */
	protected String m_PREV_WORK_ODR_CD;

	/**
	 * 第 73 mediator変数
	 */
	protected String m_PREV_OPR_INST_CD;

	/**
	 * 第 74 mediator変数
	 */
	protected String m_PREV_PARTIAL_PRD_NO;

	/**
	 * 第 75 mediator変数
	 */
	protected String m_PREV_PROC_NO;

	/**
	 * 第 76 mediator変数
	 */
	protected String m_PREV_WH_CD;

	/**
	 * 第 77 mediator変数
	 */
	protected String m_DATA_COUNT;

	/**
	 * T_OPR_RSLT_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * OPR_INST_LIST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_TYPE_VALUE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * T_LOT_CTRL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * lockT_OPR_RSLT_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * insertT_OPR_RSLT_TEMP_HISTORY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * deleteT_OPR_RSLT_TEMP_HISTORY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * selectGetIdentCardCtlNo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * insertIdentCard entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * selectSumQty entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * selectPRODUCT_TYP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * selSYS_MY_COMPANY_CD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * SelectWhTyp entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * SelectWhCdCount entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * CheckFirstWork entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * GetNextWorkInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * GetPrevWorkInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * SelectTworkProcByProc entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity17=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AD0080B001";

	/**
	 * プログラム名を返します
	 *
	 * @return プログラム名
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * プログラム名をmediatorに格納します
	 *
	 * @param プログラム名
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 *
	 * @return 処理日付
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * 処理日付をmediatorに格納します
	 *
	 * @param 処理日付
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * 登録者/更新者を格納します
	 */
	protected String Username = "orteus_system";

	/**
	 * 登録者/更新者を取得します
	 *
	 * @return 登録者/更新者
	 */
	public String getUsername() { return Username; }

	/**
	 * 登録者/更新者をmediatorに格納します
	 *
	 * @param 登録者/更新者
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * 引数情報を格納します
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * コマンドラインの引数文字列配列を返します
	 *
	 * @return 引数文字列配列
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * コマンドラインの引数文字列配列をmediatorに格納します
	 *
	 * @param 引数文字列配列
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getFIRST_WORK_FLG() { return m_FIRST_WORK_FLG; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getUSE_LOT_NO() { return m_USE_LOT_NO; }
	public String getUSE_ACPT_QTY() { return m_USE_ACPT_QTY; }
	public String getUSE_DEFECT_QTY() { return m_USE_DEFECT_QTY; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getOPR_RSLT_TEMP_CTL_NO() { return m_OPR_RSLT_TEMP_CTL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOPR_RSLT_PERSON() { return m_OPR_RSLT_PERSON; }
	public String getOPR_RSLT_COMMENT() { return m_OPR_RSLT_COMMENT; }
	public String getOPR_TIME_UNIT_TYP() { return m_OPR_TIME_UNIT_TYP; }
	public String getPRE_ARRANGEMENT_TIME() { return m_PRE_ARRANGEMENT_TIME; }
	public String getPOST_ARRANGEMENT_TIME() { return m_POST_ARRANGEMENT_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getCESSATION_TIME() { return m_CESSATION_TIME; }
	public String getCESSATION_CAUSE() { return m_CESSATION_CAUSE; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getDEFECT_CAUSE_CD1() { return m_DEFECT_CAUSE_CD1; }
	public String getDEFECT_QTY1() { return m_DEFECT_QTY1; }
	public String getDEFECT_COMMENT1() { return m_DEFECT_COMMENT1; }
	public String getDEFECT_CAUSE_CD2() { return m_DEFECT_CAUSE_CD2; }
	public String getDEFECT_QTY2() { return m_DEFECT_QTY2; }
	public String getDEFECT_COMMENT2() { return m_DEFECT_COMMENT2; }
	public String getDEFECT_CAUSE_CD3() { return m_DEFECT_CAUSE_CD3; }
	public String getDEFECT_QTY3() { return m_DEFECT_QTY3; }
	public String getDEFECT_COMMENT3() { return m_DEFECT_COMMENT3; }
	public String getDEFECT_CAUSE_CD4() { return m_DEFECT_CAUSE_CD4; }
	public String getDEFECT_QTY4() { return m_DEFECT_QTY4; }
	public String getDEFECT_COMMENT4() { return m_DEFECT_COMMENT4; }
	public String getDEFECT_CAUSE_CD5() { return m_DEFECT_CAUSE_CD5; }
	public String getDEFECT_QTY5() { return m_DEFECT_QTY5; }
	public String getDEFECT_COMMENT5() { return m_DEFECT_COMMENT5; }
	public String getOPR_CMPLT_FLG() { return m_OPR_CMPLT_FLG; }
	public String getSUM_DEFECT_QTY() { return m_SUM_DEFECT_QTY; }
	public String getTAKE_DATE() { return m_TAKE_DATE; }
	public String getCHILD_RSLTUPDATE_FLG() { return m_CHILD_RSLTUPDATE_FLG; }
	public String getINTAKE_TERM_FROM() { return m_INTAKE_TERM_FROM; }
	public String getINTAKE_TERM_TO() { return m_INTAKE_TERM_TO; }
	public String getDEFECT_CAUSE_CD() { return m_DEFECT_CAUSE_CD; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPRG_NM() { return m_PRG_NM; }
	public String getRSLT_TAKE_ERR_TYP() { return m_RSLT_TAKE_ERR_TYP; }
	public String getRSLT_TAKE_ERR_INFO() { return m_RSLT_TAKE_ERR_INFO; }
	public String getIDENT_CARD_CTL_NO() { return m_IDENT_CARD_CTL_NO; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getFIRST_IDENT_CARD_QTY() { return m_FIRST_IDENT_CARD_QTY; }
	public String getIDENT_CARD_QTY() { return m_IDENT_CARD_QTY; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getNEXT_WH_CD() { return m_NEXT_WH_CD; }
	public String getWH_CD_COUNT() { return m_WH_CD_COUNT; }
	public String getFIRST_OPR_INST_CD() { return m_FIRST_OPR_INST_CD; }
	public String getFIRST_PROC_NO() { return m_FIRST_PROC_NO; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getNEXT_WORK_ODR_CD() { return m_NEXT_WORK_ODR_CD; }
	public String getNEXT_OPR_INST_CD() { return m_NEXT_OPR_INST_CD; }
	public String getNEXT_PROC_NO() { return m_NEXT_PROC_NO; }
	public String getNEXT_WS_CD() { return m_NEXT_WS_CD; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getPREV_WORK_ODR_CD() { return m_PREV_WORK_ODR_CD; }
	public String getPREV_OPR_INST_CD() { return m_PREV_OPR_INST_CD; }
	public String getPREV_PARTIAL_PRD_NO() { return m_PREV_PARTIAL_PRD_NO; }
	public String getPREV_PROC_NO() { return m_PREV_PROC_NO; }
	public String getPREV_WH_CD() { return m_PREV_WH_CD; }
	public String getDATA_COUNT() { return m_DATA_COUNT; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setFIRST_WORK_FLG(String arg) { m_FIRST_WORK_FLG = arg; }
	public void setPARTIAL_PRD_NO(String arg) { m_PARTIAL_PRD_NO = arg; }
	public void setUSE_LOT_NO(String arg) { m_USE_LOT_NO = arg; }
	public void setUSE_ACPT_QTY(String arg) { m_USE_ACPT_QTY = arg; }
	public void setUSE_DEFECT_QTY(String arg) { m_USE_DEFECT_QTY = arg; }
	public void setOPR_INST_CD(String arg) { m_OPR_INST_CD = arg; }
	public void setOPR_RSLT_TEMP_CTL_NO(String arg) { m_OPR_RSLT_TEMP_CTL_NO = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setACPT_QTY(String arg) { m_ACPT_QTY = arg; }
	public void setDEFECT_QTY(String arg) { m_DEFECT_QTY = arg; }
	public void setOPR_DATE(String arg) { m_OPR_DATE = arg; }
	public void setWH_CD(String arg) { m_WH_CD = arg; }
	public void setWS_CD(String arg) { m_WS_CD = arg; }
	public void setOPR_RSLT_PERSON(String arg) { m_OPR_RSLT_PERSON = arg; }
	public void setOPR_RSLT_COMMENT(String arg) { m_OPR_RSLT_COMMENT = arg; }
	public void setOPR_TIME_UNIT_TYP(String arg) { m_OPR_TIME_UNIT_TYP = arg; }
	public void setPRE_ARRANGEMENT_TIME(String arg) { m_PRE_ARRANGEMENT_TIME = arg; }
	public void setPOST_ARRANGEMENT_TIME(String arg) { m_POST_ARRANGEMENT_TIME = arg; }
	public void setOPR_TIME(String arg) { m_OPR_TIME = arg; }
	public void setCESSATION_TIME(String arg) { m_CESSATION_TIME = arg; }
	public void setCESSATION_CAUSE(String arg) { m_CESSATION_CAUSE = arg; }
	public void setLOT_NO(String arg) { m_LOT_NO = arg; }
	public void setVEND_LOT_NO(String arg) { m_VEND_LOT_NO = arg; }
	public void setDEFECT_CAUSE_CD1(String arg) { m_DEFECT_CAUSE_CD1 = arg; }
	public void setDEFECT_QTY1(String arg) { m_DEFECT_QTY1 = arg; }
	public void setDEFECT_COMMENT1(String arg) { m_DEFECT_COMMENT1 = arg; }
	public void setDEFECT_CAUSE_CD2(String arg) { m_DEFECT_CAUSE_CD2 = arg; }
	public void setDEFECT_QTY2(String arg) { m_DEFECT_QTY2 = arg; }
	public void setDEFECT_COMMENT2(String arg) { m_DEFECT_COMMENT2 = arg; }
	public void setDEFECT_CAUSE_CD3(String arg) { m_DEFECT_CAUSE_CD3 = arg; }
	public void setDEFECT_QTY3(String arg) { m_DEFECT_QTY3 = arg; }
	public void setDEFECT_COMMENT3(String arg) { m_DEFECT_COMMENT3 = arg; }
	public void setDEFECT_CAUSE_CD4(String arg) { m_DEFECT_CAUSE_CD4 = arg; }
	public void setDEFECT_QTY4(String arg) { m_DEFECT_QTY4 = arg; }
	public void setDEFECT_COMMENT4(String arg) { m_DEFECT_COMMENT4 = arg; }
	public void setDEFECT_CAUSE_CD5(String arg) { m_DEFECT_CAUSE_CD5 = arg; }
	public void setDEFECT_QTY5(String arg) { m_DEFECT_QTY5 = arg; }
	public void setDEFECT_COMMENT5(String arg) { m_DEFECT_COMMENT5 = arg; }
	public void setOPR_CMPLT_FLG(String arg) { m_OPR_CMPLT_FLG = arg; }
	public void setSUM_DEFECT_QTY(String arg) { m_SUM_DEFECT_QTY = arg; }
	public void setTAKE_DATE(String arg) { m_TAKE_DATE = arg; }
	public void setCHILD_RSLTUPDATE_FLG(String arg) { m_CHILD_RSLTUPDATE_FLG = arg; }
	public void setINTAKE_TERM_FROM(String arg) { m_INTAKE_TERM_FROM = arg; }
	public void setINTAKE_TERM_TO(String arg) { m_INTAKE_TERM_TO = arg; }
	public void setDEFECT_CAUSE_CD(String arg) { m_DEFECT_CAUSE_CD = arg; }
	public void setBEST_BEFORE_DATE(String arg) { m_BEST_BEFORE_DATE = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPRG_NM(String arg) { m_PRG_NM = arg; }
	public void setRSLT_TAKE_ERR_TYP(String arg) { m_RSLT_TAKE_ERR_TYP = arg; }
	public void setRSLT_TAKE_ERR_INFO(String arg) { m_RSLT_TAKE_ERR_INFO = arg; }
	public void setIDENT_CARD_CTL_NO(String arg) { m_IDENT_CARD_CTL_NO = arg; }
	public void setPKG_UNIT_QTY(String arg) { m_PKG_UNIT_QTY = arg; }
	public void setRCV_ISSUE_CTRL_CD(String arg) { m_RCV_ISSUE_CTRL_CD = arg; }
	public void setJOB_ODR_CD(String arg) { m_JOB_ODR_CD = arg; }
	public void setFIRST_IDENT_CARD_QTY(String arg) { m_FIRST_IDENT_CARD_QTY = arg; }
	public void setIDENT_CARD_QTY(String arg) { m_IDENT_CARD_QTY = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setSUM_ACPT_QTY(String arg) { m_SUM_ACPT_QTY = arg; }
	public void setPRODUCT_TYP(String arg) { m_PRODUCT_TYP = arg; }
	public void setWH_TYP(String arg) { m_WH_TYP = arg; }
	public void setNEXT_WH_CD(String arg) { m_NEXT_WH_CD = arg; }
	public void setWH_CD_COUNT(String arg) { m_WH_CD_COUNT = arg; }
	public void setFIRST_OPR_INST_CD(String arg) { m_FIRST_OPR_INST_CD = arg; }
	public void setFIRST_PROC_NO(String arg) { m_FIRST_PROC_NO = arg; }
	public void setWORK_ODR_CD(String arg) { m_WORK_ODR_CD = arg; }
	public void setNEXT_WORK_ODR_CD(String arg) { m_NEXT_WORK_ODR_CD = arg; }
	public void setNEXT_OPR_INST_CD(String arg) { m_NEXT_OPR_INST_CD = arg; }
	public void setNEXT_PROC_NO(String arg) { m_NEXT_PROC_NO = arg; }
	public void setNEXT_WS_CD(String arg) { m_NEXT_WS_CD = arg; }
	public void setPROC_NO(String arg) { m_PROC_NO = arg; }
	public void setPREV_WORK_ODR_CD(String arg) { m_PREV_WORK_ODR_CD = arg; }
	public void setPREV_OPR_INST_CD(String arg) { m_PREV_OPR_INST_CD = arg; }
	public void setPREV_PARTIAL_PRD_NO(String arg) { m_PREV_PARTIAL_PRD_NO = arg; }
	public void setPREV_PROC_NO(String arg) { m_PREV_PROC_NO = arg; }
	public void setPREV_WH_CD(String arg) { m_PREV_WH_CD = arg; }
	public void setDATA_COUNT(String arg) { m_DATA_COUNT = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getT_OPR_RSLT_TEMP() { return m_entity0; }
	public void setT_OPR_RSLT_TEMP(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getOPR_INST_LIST() { return m_entity1; }
	public void setOPR_INST_LIST(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_TYPE_VALUE() { return m_entity2; }
	public void setSYS_TYPE_VALUE(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getT_LOT_CTRL() { return m_entity3; }
	public void setT_LOT_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getlockT_OPR_RSLT_TEMP() { return m_entity4; }
	public void setlockT_OPR_RSLT_TEMP(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getinsertT_OPR_RSLT_TEMP_HISTORY() { return m_entity5; }
	public void setinsertT_OPR_RSLT_TEMP_HISTORY(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getdeleteT_OPR_RSLT_TEMP_HISTORY() { return m_entity6; }
	public void setdeleteT_OPR_RSLT_TEMP_HISTORY(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getselectGetIdentCardCtlNo() { return m_entity7; }
	public void setselectGetIdentCardCtlNo(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getinsertIdentCard() { return m_entity8; }
	public void setinsertIdentCard(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getselectSumQty() { return m_entity9; }
	public void setselectSumQty(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getselectPRODUCT_TYP() { return m_entity10; }
	public void setselectPRODUCT_TYP(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getselSYS_MY_COMPANY_CD() { return m_entity11; }
	public void setselSYS_MY_COMPANY_CD(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getSelectWhTyp() { return m_entity12; }
	public void setSelectWhTyp(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getSelectWhCdCount() { return m_entity13; }
	public void setSelectWhCdCount(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getCheckFirstWork() { return m_entity14; }
	public void setCheckFirstWork(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public AbstractBatchAppEntity getGetNextWorkInfo() { return m_entity15; }
	public void setGetNextWorkInfo(AbstractBatchAppEntity obj) { m_entity15 = obj; }
	public AbstractBatchAppEntity getGetPrevWorkInfo() { return m_entity16; }
	public void setGetPrevWorkInfo(AbstractBatchAppEntity obj) { m_entity16 = obj; }
	public AbstractBatchAppEntity getSelectTworkProcByProc() { return m_entity17; }
	public void setSelectTworkProcByProc(AbstractBatchAppEntity obj) { m_entity17 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAD0080B001クラスの標準コンストラクタ
	 *
		 */
	public medAD0080B001()
	{
		// mediator変数を初期化します
		m_COMPANY_CD = null;
		m_FIRST_WORK_FLG = null;
		m_PARTIAL_PRD_NO = null;
		m_USE_LOT_NO = null;
		m_USE_ACPT_QTY = null;
		m_USE_DEFECT_QTY = null;
		m_OPR_INST_CD = null;
		m_OPR_RSLT_TEMP_CTL_NO = null;
		m_ITEM_CD = null;
		m_ACPT_QTY = null;
		m_DEFECT_QTY = null;
		m_OPR_DATE = null;
		m_WH_CD = null;
		m_WS_CD = null;
		m_OPR_RSLT_PERSON = null;
		m_OPR_RSLT_COMMENT = null;
		m_OPR_TIME_UNIT_TYP = null;
		m_PRE_ARRANGEMENT_TIME = null;
		m_POST_ARRANGEMENT_TIME = null;
		m_OPR_TIME = null;
		m_CESSATION_TIME = null;
		m_CESSATION_CAUSE = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_DEFECT_CAUSE_CD1 = null;
		m_DEFECT_QTY1 = null;
		m_DEFECT_COMMENT1 = null;
		m_DEFECT_CAUSE_CD2 = null;
		m_DEFECT_QTY2 = null;
		m_DEFECT_COMMENT2 = null;
		m_DEFECT_CAUSE_CD3 = null;
		m_DEFECT_QTY3 = null;
		m_DEFECT_COMMENT3 = null;
		m_DEFECT_CAUSE_CD4 = null;
		m_DEFECT_QTY4 = null;
		m_DEFECT_COMMENT4 = null;
		m_DEFECT_CAUSE_CD5 = null;
		m_DEFECT_QTY5 = null;
		m_DEFECT_COMMENT5 = null;
		m_OPR_CMPLT_FLG = null;
		m_SUM_DEFECT_QTY = null;
		m_TAKE_DATE = null;
		m_CHILD_RSLTUPDATE_FLG = null;
		m_INTAKE_TERM_FROM = null;
		m_INTAKE_TERM_TO = null;
		m_DEFECT_CAUSE_CD = null;
		m_BEST_BEFORE_DATE = null;
		m_USER_CD = null;
		m_PRG_NM = null;
		m_RSLT_TAKE_ERR_TYP = null;
		m_RSLT_TAKE_ERR_INFO = null;
		m_IDENT_CARD_CTL_NO = null;
		m_PKG_UNIT_QTY = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_JOB_ODR_CD = null;
		m_FIRST_IDENT_CARD_QTY = null;
		m_IDENT_CARD_QTY = null;
		m_PLANT_CD = null;
		m_SUM_ACPT_QTY = null;
		m_PRODUCT_TYP = null;
		m_WH_TYP = null;
		m_NEXT_WH_CD = null;
		m_WH_CD_COUNT = null;
		m_FIRST_OPR_INST_CD = null;
		m_FIRST_PROC_NO = null;
		m_WORK_ODR_CD = null;
		m_NEXT_WORK_ODR_CD = null;
		m_NEXT_OPR_INST_CD = null;
		m_NEXT_PROC_NO = null;
		m_NEXT_WS_CD = null;
		m_PROC_NO = null;
		m_PREV_WORK_ODR_CD = null;
		m_PREV_OPR_INST_CD = null;
		m_PREV_PARTIAL_PRD_NO = null;
		m_PREV_PROC_NO = null;
		m_PREV_WH_CD = null;
		m_DATA_COUNT = null;

               //{{user_implement_dev:constractor
			// TODO: ここに初期処理を記述してください
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
		 */
	protected void finalize()
	{

		// todo: インスタンス消滅時に実行する処理を記述してください

		return;
	}

	/**
	 * システムログ
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_dev:original

	//////////////////////////////

}
