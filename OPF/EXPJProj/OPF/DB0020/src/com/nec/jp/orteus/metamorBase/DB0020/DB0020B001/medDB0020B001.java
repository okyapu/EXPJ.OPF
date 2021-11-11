/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0020/src/com/nec/jp/orteus/metamorBase/DB0020/DB0020B001/medDB0020B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0020.DB0020B001;

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
 * CLASS     : medDB0020B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.9 $ $Date: 2014/11/05 07:21:12 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDB0020B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_PUCH_PRIORITY_REF_NO;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_EFF_PHASE_IN_DATE;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_VEND_CD;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_UNIT_COST;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_UNIT_COST_TYP;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_CUR_CD;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_EXCH_RATE;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_PUCH_UNIT_QTY;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_CLASIFICATION_CD;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_ORG_CD;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_STOCK_UNIT;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_ONEROUS_FLG;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_UPDATED_DATE;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_TRANSACTION_TYP;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_SAVE_UPDATED_DATE;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_YEAR;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_COST_TYP;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_YYYYMM;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_PROC_CD;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_RCY_VAL_UNIT_COST;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_RCY_RECOUP_RATE;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_CS_PUCH_TYP;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_UPD_FLG;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_START_MONTH;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_PRIORITY_TYP;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_UPDATE_TYP;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_CS_ERROR_CD;

	/**
	 * 第 32 mediator変数
	 */
	protected Integer m_BATCH_TYP;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_BUSINESS_ID;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_MESSAGE_CD;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_READ_COUNT;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_REMARKS;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_PROGRAM_CD;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_BUSINESS_CD;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_FILE_PATH;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_FILE_NAME;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_pvc2LogMode;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_pvc2OutPutMode;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_pvc2OutPutPath;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_pvc2OutPutName;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_pvc2UserId;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_pvc2BusinessName;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_pvc2PlantCd;

	/**
	 * 第 53 mediator変数
	 */
	protected Integer m_pnumYear;

	/**
	 * 第 54 mediator変数
	 */
	protected Integer m_pnumHalfTermTyp;

	/**
	 * 第 55 mediator変数
	 */
	protected Integer m_pnumCostTyp;

	/**
	 * 第 56 mediator変数
	 */
	protected Integer m_pnumYyyyMm;

	/**
	 * 第 57 mediator変数
	 */
	protected Integer m_pnumExecuteTyp;

	/**
	 * 第 58 mediator変数
	 */
	protected Integer m_pnumUpdateMode;

	/**
	 * 第 59 mediator変数
	 */
	protected Integer m_pnumReturn;

	/**
	 * M_PUCH_UNIT_COST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_CS_PUCH_IF entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_CS_PUCH_IF_delete entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * SYS_COST_CTRL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * M_ITEM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * M_CS_PUCH entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * M_CS_PUCH_subUpdate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * M_CS_PUCH_delete entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * T_CS_ERROR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * M_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * USER_MST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * T_CS_PUCH_IF_UpdFlgOff entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * T_CS_PUCH_IF_UpdFlgOn entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * SEQ_CS_ERROR_CD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * SYS_BAT_PARM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * SQLCSPUCHOUT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * SQLCSPUCHALL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="DB0020B001";

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

	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_PRIORITY_REF_NO() { return m_PUCH_PRIORITY_REF_NO; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getPUCH_UNIT_QTY() { return m_PUCH_UNIT_QTY; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getTRANSACTION_TYP() { return m_TRANSACTION_TYP; }
	public String getSAVE_UPDATED_DATE() { return m_SAVE_UPDATED_DATE; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getYYYYMM() { return m_YYYYMM; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getRCY_VAL_UNIT_COST() { return m_RCY_VAL_UNIT_COST; }
	public String getRCY_RECOUP_RATE() { return m_RCY_RECOUP_RATE; }
	public String getCS_PUCH_TYP() { return m_CS_PUCH_TYP; }
	public String getUPD_FLG() { return m_UPD_FLG; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getPRIORITY_TYP() { return m_PRIORITY_TYP; }
	public String getUPDATE_TYP() { return m_UPDATE_TYP; }
	public String getCS_ERROR_CD() { return m_CS_ERROR_CD; }
	public Integer getBATCH_TYP() { return m_BATCH_TYP; }
	public String getBUSINESS_ID() { return m_BUSINESS_ID; }
	public String getMESSAGE_CD() { return m_MESSAGE_CD; }
	public String getREAD_COUNT() { return m_READ_COUNT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutPutMode() { return m_pvc2OutPutMode; }
	public String getpvc2OutPutPath() { return m_pvc2OutPutPath; }
	public String getpvc2OutPutName() { return m_pvc2OutPutName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public Integer getpnumYear() { return m_pnumYear; }
	public Integer getpnumHalfTermTyp() { return m_pnumHalfTermTyp; }
	public Integer getpnumCostTyp() { return m_pnumCostTyp; }
	public Integer getpnumYyyyMm() { return m_pnumYyyyMm; }
	public Integer getpnumExecuteTyp() { return m_pnumExecuteTyp; }
	public Integer getpnumUpdateMode() { return m_pnumUpdateMode; }
	public Integer getpnumReturn() { return m_pnumReturn; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setPUCH_PRIORITY_REF_NO(String arg) { m_PUCH_PRIORITY_REF_NO = arg; }
	public void setEFF_PHASE_IN_DATE(String arg) { m_EFF_PHASE_IN_DATE = arg; }
	public void setVEND_CD(String arg) { m_VEND_CD = arg; }
	public void setUNIT_COST(String arg) { m_UNIT_COST = arg; }
	public void setUNIT_COST_TYP(String arg) { m_UNIT_COST_TYP = arg; }
	public void setCUR_CD(String arg) { m_CUR_CD = arg; }
	public void setEXCH_RATE(String arg) { m_EXCH_RATE = arg; }
	public void setPUCH_UNIT_QTY(String arg) { m_PUCH_UNIT_QTY = arg; }
	public void setCLASIFICATION_CD(String arg) { m_CLASIFICATION_CD = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setORG_CD(String arg) { m_ORG_CD = arg; }
	public void setSTOCK_UNIT(String arg) { m_STOCK_UNIT = arg; }
	public void setONEROUS_FLG(String arg) { m_ONEROUS_FLG = arg; }
	public void setUPDATED_DATE(String arg) { m_UPDATED_DATE = arg; }
	public void setTRANSACTION_TYP(String arg) { m_TRANSACTION_TYP = arg; }
	public void setSAVE_UPDATED_DATE(String arg) { m_SAVE_UPDATED_DATE = arg; }
	public void setYEAR(String arg) { m_YEAR = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }
	public void setCOST_TYP(String arg) { m_COST_TYP = arg; }
	public void setYYYYMM(String arg) { m_YYYYMM = arg; }
	public void setPROC_CD(String arg) { m_PROC_CD = arg; }
	public void setRCY_VAL_UNIT_COST(String arg) { m_RCY_VAL_UNIT_COST = arg; }
	public void setRCY_RECOUP_RATE(String arg) { m_RCY_RECOUP_RATE = arg; }
	public void setCS_PUCH_TYP(String arg) { m_CS_PUCH_TYP = arg; }
	public void setUPD_FLG(String arg) { m_UPD_FLG = arg; }
	public void setSTART_MONTH(String arg) { m_START_MONTH = arg; }
	public void setPRIORITY_TYP(String arg) { m_PRIORITY_TYP = arg; }
	public void setUPDATE_TYP(String arg) { m_UPDATE_TYP = arg; }
	public void setCS_ERROR_CD(String arg) { m_CS_ERROR_CD = arg; }
	public void setBATCH_TYP(Integer arg) { m_BATCH_TYP = arg; }
	public void setBUSINESS_ID(String arg) { m_BUSINESS_ID = arg; }
	public void setMESSAGE_CD(String arg) { m_MESSAGE_CD = arg; }
	public void setREAD_COUNT(String arg) { m_READ_COUNT = arg; }
	public void setREMARKS(String arg) { m_REMARKS = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutPutMode(String arg) { m_pvc2OutPutMode = arg; }
	public void setpvc2OutPutPath(String arg) { m_pvc2OutPutPath = arg; }
	public void setpvc2OutPutName(String arg) { m_pvc2OutPutName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpnumYear(Integer arg) { m_pnumYear = arg; }
	public void setpnumHalfTermTyp(Integer arg) { m_pnumHalfTermTyp = arg; }
	public void setpnumCostTyp(Integer arg) { m_pnumCostTyp = arg; }
	public void setpnumYyyyMm(Integer arg) { m_pnumYyyyMm = arg; }
	public void setpnumExecuteTyp(Integer arg) { m_pnumExecuteTyp = arg; }
	public void setpnumUpdateMode(Integer arg) { m_pnumUpdateMode = arg; }
	public void setpnumReturn(Integer arg) { m_pnumReturn = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_PUCH_UNIT_COST() { return m_entity0; }
	public void setM_PUCH_UNIT_COST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF() { return m_entity1; }
	public void setT_CS_PUCH_IF(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_delete() { return m_entity2; }
	public void setT_CS_PUCH_IF_delete(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity3; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getM_ITEM() { return m_entity4; }
	public void setM_ITEM(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getM_CS_PUCH() { return m_entity5; }
	public void setM_CS_PUCH(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getM_CS_PUCH_subUpdate() { return m_entity6; }
	public void setM_CS_PUCH_subUpdate(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getM_CS_PUCH_delete() { return m_entity7; }
	public void setM_CS_PUCH_delete(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getT_CS_ERROR() { return m_entity8; }
	public void setT_CS_ERROR(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity9; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity10; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_UpdFlgOff() { return m_entity11; }
	public void setT_CS_PUCH_IF_UpdFlgOff(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_UpdFlgOn() { return m_entity12; }
	public void setT_CS_PUCH_IF_UpdFlgOn(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getSEQ_CS_ERROR_CD() { return m_entity13; }
	public void setSEQ_CS_ERROR_CD(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity14; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public AbstractBatchAppEntity getSQLCSPUCHOUT() { return m_entity15; }
	public void setSQLCSPUCHOUT(AbstractBatchAppEntity obj) { m_entity15 = obj; }
	public AbstractBatchAppEntity getSQLCSPUCHALL() { return m_entity16; }
	public void setSQLCSPUCHALL(AbstractBatchAppEntity obj) { m_entity16 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDB0020B001クラスの標準コンストラクタ
	 *
		 */
	public medDB0020B001()
	{
		// mediator変数を初期化します
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_PUCH_PRIORITY_REF_NO = null;
		m_EFF_PHASE_IN_DATE = null;
		m_VEND_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_CUR_CD = null;
		m_EXCH_RATE = null;
		m_PUCH_UNIT_QTY = null;
		m_CLASIFICATION_CD = null;
		m_COMPANY_CD = null;
		m_ORG_CD = null;
		m_STOCK_UNIT = null;
		m_ONEROUS_FLG = null;
		m_UPDATED_DATE = null;
		m_TRANSACTION_TYP = null;
		m_SAVE_UPDATED_DATE = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_YYYYMM = null;
		m_PROC_CD = null;
		m_RCY_VAL_UNIT_COST = null;
		m_RCY_RECOUP_RATE = null;
		m_CS_PUCH_TYP = null;
		m_UPD_FLG = null;
		m_START_MONTH = null;
		m_PRIORITY_TYP = null;
		m_UPDATE_TYP = null;
		m_CS_ERROR_CD = null;
		m_BATCH_TYP = null;
		m_BUSINESS_ID = null;
		m_MESSAGE_CD = null;
		m_READ_COUNT = null;
		m_REMARKS = null;
		m_USER_CD = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_pvc2LogMode = null;
		m_pvc2OutPutMode = null;
		m_pvc2OutPutPath = null;
		m_pvc2OutPutName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pnumYear = null;
		m_pnumHalfTermTyp = null;
		m_pnumCostTyp = null;
		m_pnumYyyyMm = null;
		m_pnumExecuteTyp = null;
		m_pnumUpdateMode = null;
		m_pnumReturn = null;

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
