/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160B001/medAE0160B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160.AE0160B001;

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
 * CLASS     : medAE0160B001 クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.12 $ $Date: 2017/01/09 08:43:58 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAE0160B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_COMPLETE_FLG;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_TAX_ROUND_TYP;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_TEMP_PUCH_ODR_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_LINE_COUNT;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_DATEFROM;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_DATETO;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_TEMP_ACPT_RSLT_TEMP_CTL_NO;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_TEMP_ITEM_CD;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_TEMP_WH_CD;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_TEMP_ACPT_DATE;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_TEMP_ACPT_QTY;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_TEMP_UNIT_COST_TYP;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_TEMP_UNIT_COST;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_TEMP_PROCESSING_COST;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_TEMP_MATERIAL_COST;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_TEMP_OTHER_OVERHEADS;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_TEMP_DISC_AMOUNT;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_TEMP_EXCH_RATE;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_TEMP_LOT_NO;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_TEMP_VEND_LOT_NO;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_TEMP_DLV_CD;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_TEMP_ACPT_RSLT_COMMENT;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_TEMP_ACPT_RSLT_COMP;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_TEMP_TAKE_DATE;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_PUCH_ODR_CD;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_PUCH_ODR_STS_TYP;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_SPL_ITEM_TYP;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_ACPT_INSPC_TYP;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_NON_NO_ITEM_FLG;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_WORK_ODR_CD;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_WORK_IN_PROC_CD;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_PUCH_ODR_SLIP_ISS_DATE;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_PUCH_ODR_QTY;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_TAX_RATE_1;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_TAX_RATE_2;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_TAX_RATE_3;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_TAX_CD;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_VEND_CD;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_PUCH_ODR_START_DATE;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_ITEM_NAME;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_LOT_CTRL_FLG;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_LOT_NUMBERING_TYP;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_UNIT_QTY_TYP;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_FINAL_PROC_FLG;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_LOT_NO;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_TEMP_BEST_BEFORE_DATE;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_PRG_NM;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_ALREADY_ACPT_QTY;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_TEMP_ACPT_NO;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_PROC_EXEC_DATE;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_WH_CD;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_ACPT_RSLT_TEMP_CTL_NO;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_ACPT_RSLT_TAKE_ERR_TYP;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_ACPT_RSLT_TAKE_ERR_INFO;

	/**
	 * selectT_ACPT_RSLT_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * selectT_ACPT_RSLT_TEMPByPuchOdrCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_RLSD_PUCH_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * M_ITEM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * T_WORK_IN_PROC_BY_PROC entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * T_LOT_CTRL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * T_ACPT_RSLT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * SYS_ACTUAL_COST_CTRL_AC entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * check_VEND_WH entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * deleteT_ACPT_RSLT_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * lockT_ACPT_RSLT_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * insertT_ACPT_RSLT_TEMP_HISTORY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * selectT_ACPT_RSLT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * M_TAX entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AE0160B001";

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

	public String getCOMPLETE_FLG() { return m_COMPLETE_FLG; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getTEMP_PUCH_ODR_CD() { return m_TEMP_PUCH_ODR_CD; }
	public String getLINE_COUNT() { return m_LINE_COUNT; }
	public String getDATEFROM() { return m_DATEFROM; }
	public String getDATETO() { return m_DATETO; }
	public String getTEMP_ACPT_RSLT_TEMP_CTL_NO() { return m_TEMP_ACPT_RSLT_TEMP_CTL_NO; }
	public String getTEMP_ITEM_CD() { return m_TEMP_ITEM_CD; }
	public String getTEMP_WH_CD() { return m_TEMP_WH_CD; }
	public String getTEMP_ACPT_DATE() { return m_TEMP_ACPT_DATE; }
	public String getTEMP_ACPT_QTY() { return m_TEMP_ACPT_QTY; }
	public String getTEMP_UNIT_COST_TYP() { return m_TEMP_UNIT_COST_TYP; }
	public String getTEMP_UNIT_COST() { return m_TEMP_UNIT_COST; }
	public String getTEMP_PROCESSING_COST() { return m_TEMP_PROCESSING_COST; }
	public String getTEMP_MATERIAL_COST() { return m_TEMP_MATERIAL_COST; }
	public String getTEMP_OTHER_OVERHEADS() { return m_TEMP_OTHER_OVERHEADS; }
	public String getTEMP_DISC_AMOUNT() { return m_TEMP_DISC_AMOUNT; }
	public String getTEMP_EXCH_RATE() { return m_TEMP_EXCH_RATE; }
	public String getTEMP_LOT_NO() { return m_TEMP_LOT_NO; }
	public String getTEMP_VEND_LOT_NO() { return m_TEMP_VEND_LOT_NO; }
	public String getTEMP_DLV_CD() { return m_TEMP_DLV_CD; }
	public String getTEMP_ACPT_RSLT_COMMENT() { return m_TEMP_ACPT_RSLT_COMMENT; }
	public String getTEMP_ACPT_RSLT_COMP() { return m_TEMP_ACPT_RSLT_COMP; }
	public String getTEMP_TAKE_DATE() { return m_TEMP_TAKE_DATE; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPUCH_ODR_SLIP_ISS_DATE() { return m_PUCH_ODR_SLIP_ISS_DATE; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getFINAL_PROC_FLG() { return m_FINAL_PROC_FLG; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getTEMP_BEST_BEFORE_DATE() { return m_TEMP_BEST_BEFORE_DATE; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPRG_NM() { return m_PRG_NM; }
	public String getALREADY_ACPT_QTY() { return m_ALREADY_ACPT_QTY; }
	public String getTEMP_ACPT_NO() { return m_TEMP_ACPT_NO; }
	public String getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getACPT_RSLT_TEMP_CTL_NO() { return m_ACPT_RSLT_TEMP_CTL_NO; }
	public String getACPT_RSLT_TAKE_ERR_TYP() { return m_ACPT_RSLT_TAKE_ERR_TYP; }
	public String getACPT_RSLT_TAKE_ERR_INFO() { return m_ACPT_RSLT_TAKE_ERR_INFO; }
	public void setCOMPLETE_FLG(String arg) { m_COMPLETE_FLG = arg; }
	public void setTAX_ROUND_TYP(String arg) { m_TAX_ROUND_TYP = arg; }
	public void setTEMP_PUCH_ODR_CD(String arg) { m_TEMP_PUCH_ODR_CD = arg; }
	public void setLINE_COUNT(String arg) { m_LINE_COUNT = arg; }
	public void setDATEFROM(String arg) { m_DATEFROM = arg; }
	public void setDATETO(String arg) { m_DATETO = arg; }
	public void setTEMP_ACPT_RSLT_TEMP_CTL_NO(String arg) { m_TEMP_ACPT_RSLT_TEMP_CTL_NO = arg; }
	public void setTEMP_ITEM_CD(String arg) { m_TEMP_ITEM_CD = arg; }
	public void setTEMP_WH_CD(String arg) { m_TEMP_WH_CD = arg; }
	public void setTEMP_ACPT_DATE(String arg) { m_TEMP_ACPT_DATE = arg; }
	public void setTEMP_ACPT_QTY(String arg) { m_TEMP_ACPT_QTY = arg; }
	public void setTEMP_UNIT_COST_TYP(String arg) { m_TEMP_UNIT_COST_TYP = arg; }
	public void setTEMP_UNIT_COST(String arg) { m_TEMP_UNIT_COST = arg; }
	public void setTEMP_PROCESSING_COST(String arg) { m_TEMP_PROCESSING_COST = arg; }
	public void setTEMP_MATERIAL_COST(String arg) { m_TEMP_MATERIAL_COST = arg; }
	public void setTEMP_OTHER_OVERHEADS(String arg) { m_TEMP_OTHER_OVERHEADS = arg; }
	public void setTEMP_DISC_AMOUNT(String arg) { m_TEMP_DISC_AMOUNT = arg; }
	public void setTEMP_EXCH_RATE(String arg) { m_TEMP_EXCH_RATE = arg; }
	public void setTEMP_LOT_NO(String arg) { m_TEMP_LOT_NO = arg; }
	public void setTEMP_VEND_LOT_NO(String arg) { m_TEMP_VEND_LOT_NO = arg; }
	public void setTEMP_DLV_CD(String arg) { m_TEMP_DLV_CD = arg; }
	public void setTEMP_ACPT_RSLT_COMMENT(String arg) { m_TEMP_ACPT_RSLT_COMMENT = arg; }
	public void setTEMP_ACPT_RSLT_COMP(String arg) { m_TEMP_ACPT_RSLT_COMP = arg; }
	public void setTEMP_TAKE_DATE(String arg) { m_TEMP_TAKE_DATE = arg; }
	public void setPUCH_ODR_CD(String arg) { m_PUCH_ODR_CD = arg; }
	public void setPUCH_ODR_STS_TYP(String arg) { m_PUCH_ODR_STS_TYP = arg; }
	public void setSPL_ITEM_TYP(String arg) { m_SPL_ITEM_TYP = arg; }
	public void setACPT_INSPC_TYP(String arg) { m_ACPT_INSPC_TYP = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setNON_NO_ITEM_FLG(String arg) { m_NON_NO_ITEM_FLG = arg; }
	public void setWORK_ODR_CD(String arg) { m_WORK_ODR_CD = arg; }
	public void setWORK_IN_PROC_CD(String arg) { m_WORK_IN_PROC_CD = arg; }
	public void setPUCH_ODR_SLIP_ISS_DATE(String arg) { m_PUCH_ODR_SLIP_ISS_DATE = arg; }
	public void setPUCH_ODR_QTY(String arg) { m_PUCH_ODR_QTY = arg; }
	public void setTAX_RATE_1(String arg) { m_TAX_RATE_1 = arg; }
	public void setTAX_RATE_2(String arg) { m_TAX_RATE_2 = arg; }
	public void setTAX_RATE_3(String arg) { m_TAX_RATE_3 = arg; }
	public void setTAX_CD(String arg) { m_TAX_CD = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setVEND_CD(String arg) { m_VEND_CD = arg; }
	public void setPUCH_ODR_START_DATE(String arg) { m_PUCH_ODR_START_DATE = arg; }
	public void setITEM_NAME(String arg) { m_ITEM_NAME = arg; }
	public void setLOT_CTRL_FLG(String arg) { m_LOT_CTRL_FLG = arg; }
	public void setLOT_NUMBERING_TYP(String arg) { m_LOT_NUMBERING_TYP = arg; }
	public void setUNIT_QTY_TYP(String arg) { m_UNIT_QTY_TYP = arg; }
	public void setFINAL_PROC_FLG(String arg) { m_FINAL_PROC_FLG = arg; }
	public void setLOT_NO(String arg) { m_LOT_NO = arg; }
	public void setTEMP_BEST_BEFORE_DATE(String arg) { m_TEMP_BEST_BEFORE_DATE = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPRG_NM(String arg) { m_PRG_NM = arg; }
	public void setALREADY_ACPT_QTY(String arg) { m_ALREADY_ACPT_QTY = arg; }
	public void setTEMP_ACPT_NO(String arg) { m_TEMP_ACPT_NO = arg; }
	public void setPROC_EXEC_DATE(String arg) { m_PROC_EXEC_DATE = arg; }
	public void setWH_CD(String arg) { m_WH_CD = arg; }
	public void setACPT_RSLT_TEMP_CTL_NO(String arg) { m_ACPT_RSLT_TEMP_CTL_NO = arg; }
	public void setACPT_RSLT_TAKE_ERR_TYP(String arg) { m_ACPT_RSLT_TAKE_ERR_TYP = arg; }
	public void setACPT_RSLT_TAKE_ERR_INFO(String arg) { m_ACPT_RSLT_TAKE_ERR_INFO = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getselectT_ACPT_RSLT_TEMP() { return m_entity0; }
	public void setselectT_ACPT_RSLT_TEMP(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getselectT_ACPT_RSLT_TEMPByPuchOdrCd() { return m_entity1; }
	public void setselectT_ACPT_RSLT_TEMPByPuchOdrCd(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_RLSD_PUCH_ODR() { return m_entity2; }
	public void setT_RLSD_PUCH_ODR(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getM_ITEM() { return m_entity3; }
	public void setM_ITEM(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getT_WORK_IN_PROC_BY_PROC() { return m_entity4; }
	public void setT_WORK_IN_PROC_BY_PROC(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getT_LOT_CTRL() { return m_entity5; }
	public void setT_LOT_CTRL(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getT_ACPT_RSLT() { return m_entity6; }
	public void setT_ACPT_RSLT(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getSYS_ACTUAL_COST_CTRL_AC() { return m_entity7; }
	public void setSYS_ACTUAL_COST_CTRL_AC(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getcheck_VEND_WH() { return m_entity8; }
	public void setcheck_VEND_WH(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getdeleteT_ACPT_RSLT_TEMP() { return m_entity9; }
	public void setdeleteT_ACPT_RSLT_TEMP(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getlockT_ACPT_RSLT_TEMP() { return m_entity10; }
	public void setlockT_ACPT_RSLT_TEMP(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getinsertT_ACPT_RSLT_TEMP_HISTORY() { return m_entity11; }
	public void setinsertT_ACPT_RSLT_TEMP_HISTORY(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getselectT_ACPT_RSLT() { return m_entity12; }
	public void setselectT_ACPT_RSLT(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getM_TAX() { return m_entity13; }
	public void setM_TAX(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAE0160B001クラスの標準コンストラクタ
	 *
		 */
	public medAE0160B001()
	{
		// mediator変数を初期化します
		m_COMPLETE_FLG = null;
		m_TAX_ROUND_TYP = null;
		m_TEMP_PUCH_ODR_CD = null;
		m_LINE_COUNT = null;
		m_DATEFROM = null;
		m_DATETO = null;
		m_TEMP_ACPT_RSLT_TEMP_CTL_NO = null;
		m_TEMP_ITEM_CD = null;
		m_TEMP_WH_CD = null;
		m_TEMP_ACPT_DATE = null;
		m_TEMP_ACPT_QTY = null;
		m_TEMP_UNIT_COST_TYP = null;
		m_TEMP_UNIT_COST = null;
		m_TEMP_PROCESSING_COST = null;
		m_TEMP_MATERIAL_COST = null;
		m_TEMP_OTHER_OVERHEADS = null;
		m_TEMP_DISC_AMOUNT = null;
		m_TEMP_EXCH_RATE = null;
		m_TEMP_LOT_NO = null;
		m_TEMP_VEND_LOT_NO = null;
		m_TEMP_DLV_CD = null;
		m_TEMP_ACPT_RSLT_COMMENT = null;
		m_TEMP_ACPT_RSLT_COMP = null;
		m_TEMP_TAKE_DATE = null;
		m_PUCH_ODR_CD = null;
		m_PUCH_ODR_STS_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_NON_NO_ITEM_FLG = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PUCH_ODR_SLIP_ISS_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_PUCH_ODR_START_DATE = null;
		m_ITEM_NAME = null;
		m_LOT_CTRL_FLG = null;
		m_LOT_NUMBERING_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_FINAL_PROC_FLG = null;
		m_LOT_NO = null;
		m_TEMP_BEST_BEFORE_DATE = null;
		m_USER_CD = null;
		m_PRG_NM = null;
		m_ALREADY_ACPT_QTY = null;
		m_TEMP_ACPT_NO = null;
		m_PROC_EXEC_DATE = null;
		m_WH_CD = null;
		m_ACPT_RSLT_TEMP_CTL_NO = null;
		m_ACPT_RSLT_TAKE_ERR_TYP = null;
		m_ACPT_RSLT_TAKE_ERR_INFO = null;

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
