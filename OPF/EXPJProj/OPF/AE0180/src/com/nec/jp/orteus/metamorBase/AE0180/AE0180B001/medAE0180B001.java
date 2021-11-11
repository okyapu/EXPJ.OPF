/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180B001/medAE0180B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180.AE0180B001;

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
 * CLASS     : medAE0180B001 クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:15:55 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAE0180B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_pvc2LogMode;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_pvc2OutputMode;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_pvc2OutputPath;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_pvc2OutputName;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_pvc2UserId;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_pvc2BusinessName;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_pvc2PlantCd;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_pnumCsvTakeTyp;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_pvc2CsvTakePath;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_pvc2CsvBackupPath;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_pnumReturn;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_PROGRAM_CD;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_BUSINESS_CD;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_FILE_PATH;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_FILE_NAME;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_PUCH_ODR_TEMP_CTL_NO;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_PUCH_ODR_DLV_DATE;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_PUCH_ODR_START_DATE;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_PUCH_ODR_QTY;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_VEND_CD;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_JOB_ODR_CD;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_CONFIRM_DLV_DATE;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_WH_CD;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_PUCH_ODR_COMMENT;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_NON_NO_ITEM_FLG;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_NON_NO_ITEM_NAME;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_NON_NO_ITEM_TYP;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_NON_NO_ITEM_PUCH_ODR_UNIT;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_UNIT_COST_TYP;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_UNIT_COST;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_PROCESSING_COST;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_MATERIAL_COST;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_OTHER_OVERHEADS;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_NET_AMOUNT;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_EXCH_RATE;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_ACCT_CD;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_DEPT_CD;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_PJ_CD;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_SEG_CONTENTS1;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_SEG_CONTENTS2;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_SEG_CONTENTS3;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_SEG_CONTENTS4;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_USER_NAME;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_PLANT_NAME;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_CODE;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_CODE_NAME;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_CODE2;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_CODE_NAME2;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_SYS_CLASS;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_CLASS_CODE;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * SQLPUCHODRINTERFACE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * SYS_BAT_PARM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_PUCH_ODR_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * USER_MST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * M_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * SYS_CLASS_CODE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * SYS_MY_COMPANY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * deleteT_PUCH_ODR_TEMP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AE0180B001";

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

	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpnumCsvTakeTyp() { return m_pnumCsvTakeTyp; }
	public String getpvc2CsvTakePath() { return m_pvc2CsvTakePath; }
	public String getpvc2CsvBackupPath() { return m_pvc2CsvBackupPath; }
	public String getpnumReturn() { return m_pnumReturn; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getPUCH_ODR_TEMP_CTL_NO() { return m_PUCH_ODR_TEMP_CTL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getCONFIRM_DLV_DATE() { return m_CONFIRM_DLV_DATE; }
	public String getWH_CD() { return m_WH_CD; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getNON_NO_ITEM_NAME() { return m_NON_NO_ITEM_NAME; }
	public String getNON_NO_ITEM_TYP() { return m_NON_NO_ITEM_TYP; }
	public String getNON_NO_ITEM_PUCH_ODR_UNIT() { return m_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getACCT_CD() { return m_ACCT_CD; }
	public String getDEPT_CD() { return m_DEPT_CD; }
	public String getPJ_CD() { return m_PJ_CD; }
	public String getSEG_CONTENTS1() { return m_SEG_CONTENTS1; }
	public String getSEG_CONTENTS2() { return m_SEG_CONTENTS2; }
	public String getSEG_CONTENTS3() { return m_SEG_CONTENTS3; }
	public String getSEG_CONTENTS4() { return m_SEG_CONTENTS4; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCODE() { return m_CODE; }
	public String getCODE_NAME() { return m_CODE_NAME; }
	public String getCODE2() { return m_CODE2; }
	public String getCODE_NAME2() { return m_CODE_NAME2; }
	public String getSYS_CLASS() { return m_SYS_CLASS; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpnumCsvTakeTyp(String arg) { m_pnumCsvTakeTyp = arg; }
	public void setpvc2CsvTakePath(String arg) { m_pvc2CsvTakePath = arg; }
	public void setpvc2CsvBackupPath(String arg) { m_pvc2CsvBackupPath = arg; }
	public void setpnumReturn(String arg) { m_pnumReturn = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setPUCH_ODR_TEMP_CTL_NO(String arg) { m_PUCH_ODR_TEMP_CTL_NO = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setPUCH_ODR_DLV_DATE(String arg) { m_PUCH_ODR_DLV_DATE = arg; }
	public void setPUCH_ODR_START_DATE(String arg) { m_PUCH_ODR_START_DATE = arg; }
	public void setPUCH_ODR_QTY(String arg) { m_PUCH_ODR_QTY = arg; }
	public void setVEND_CD(String arg) { m_VEND_CD = arg; }
	public void setJOB_ODR_CD(String arg) { m_JOB_ODR_CD = arg; }
	public void setCONFIRM_DLV_DATE(String arg) { m_CONFIRM_DLV_DATE = arg; }
	public void setWH_CD(String arg) { m_WH_CD = arg; }
	public void setPUCH_ODR_COMMENT(String arg) { m_PUCH_ODR_COMMENT = arg; }
	public void setNON_NO_ITEM_FLG(String arg) { m_NON_NO_ITEM_FLG = arg; }
	public void setNON_NO_ITEM_NAME(String arg) { m_NON_NO_ITEM_NAME = arg; }
	public void setNON_NO_ITEM_TYP(String arg) { m_NON_NO_ITEM_TYP = arg; }
	public void setNON_NO_ITEM_PUCH_ODR_UNIT(String arg) { m_NON_NO_ITEM_PUCH_ODR_UNIT = arg; }
	public void setUNIT_COST_TYP(String arg) { m_UNIT_COST_TYP = arg; }
	public void setUNIT_COST(String arg) { m_UNIT_COST = arg; }
	public void setPROCESSING_COST(String arg) { m_PROCESSING_COST = arg; }
	public void setMATERIAL_COST(String arg) { m_MATERIAL_COST = arg; }
	public void setOTHER_OVERHEADS(String arg) { m_OTHER_OVERHEADS = arg; }
	public void setNET_AMOUNT(String arg) { m_NET_AMOUNT = arg; }
	public void setEXCH_RATE(String arg) { m_EXCH_RATE = arg; }
	public void setACCT_CD(String arg) { m_ACCT_CD = arg; }
	public void setDEPT_CD(String arg) { m_DEPT_CD = arg; }
	public void setPJ_CD(String arg) { m_PJ_CD = arg; }
	public void setSEG_CONTENTS1(String arg) { m_SEG_CONTENTS1 = arg; }
	public void setSEG_CONTENTS2(String arg) { m_SEG_CONTENTS2 = arg; }
	public void setSEG_CONTENTS3(String arg) { m_SEG_CONTENTS3 = arg; }
	public void setSEG_CONTENTS4(String arg) { m_SEG_CONTENTS4 = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setCODE(String arg) { m_CODE = arg; }
	public void setCODE_NAME(String arg) { m_CODE_NAME = arg; }
	public void setCODE2(String arg) { m_CODE2 = arg; }
	public void setCODE_NAME2(String arg) { m_CODE_NAME2 = arg; }
	public void setSYS_CLASS(String arg) { m_SYS_CLASS = arg; }
	public void setCLASS_CODE(String arg) { m_CLASS_CODE = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getSQLPUCHODRINTERFACE() { return m_entity0; }
	public void setSQLPUCHODRINTERFACE(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity1; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_PUCH_ODR_TEMP() { return m_entity2; }
	public void setT_PUCH_ODR_TEMP(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity3; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity4; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getSYS_CLASS_CODE() { return m_entity5; }
	public void setSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getSYS_MY_COMPANY() { return m_entity6; }
	public void setSYS_MY_COMPANY(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getdeleteT_PUCH_ODR_TEMP() { return m_entity7; }
	public void setdeleteT_PUCH_ODR_TEMP(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAE0180B001クラスの標準コンストラクタ
	 *
		 */
	public medAE0180B001()
	{
		// mediator変数を初期化します
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pnumCsvTakeTyp = null;
		m_pvc2CsvTakePath = null;
		m_pvc2CsvBackupPath = null;
		m_pnumReturn = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_PUCH_ODR_TEMP_CTL_NO = null;
		m_ITEM_CD = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_VEND_CD = null;
		m_JOB_ODR_CD = null;
		m_CONFIRM_DLV_DATE = null;
		m_WH_CD = null;
		m_PUCH_ODR_COMMENT = null;
		m_NON_NO_ITEM_FLG = null;
		m_NON_NO_ITEM_NAME = null;
		m_NON_NO_ITEM_TYP = null;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_NET_AMOUNT = null;
		m_EXCH_RATE = null;
		m_ACCT_CD = null;
		m_DEPT_CD = null;
		m_PJ_CD = null;
		m_SEG_CONTENTS1 = null;
		m_SEG_CONTENTS2 = null;
		m_SEG_CONTENTS3 = null;
		m_SEG_CONTENTS4 = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_CODE = null;
		m_CODE_NAME = null;
		m_CODE2 = null;
		m_CODE_NAME2 = null;
		m_SYS_CLASS = null;
		m_CLASS_CODE = null;
		m_COMPANY_CD = null;

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
