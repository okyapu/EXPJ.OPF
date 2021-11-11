/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B002/medAD0080B002.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B002;

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
 * CLASS     : medAD0080B002 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.4 $ $Date: 2015/12/22 09:52:57 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAD0080B002 extends Object
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
	protected String m_PLANT_NAME;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_USER_NAME;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_CODE;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_CODE_NAME;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_CODE2;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_CODE_NAME2;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_SYS_CLASS;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_CLASS_CODE;

	/**
	 * SQLOPRRSLTINTERFACE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * SYS_BAT_PARM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * M_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * USER_MST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * SYS_CLASS_CODE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AD0080B002";

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
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getCODE() { return m_CODE; }
	public String getCODE_NAME() { return m_CODE_NAME; }
	public String getCODE2() { return m_CODE2; }
	public String getCODE_NAME2() { return m_CODE_NAME2; }
	public String getSYS_CLASS() { return m_SYS_CLASS; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
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
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setCODE(String arg) { m_CODE = arg; }
	public void setCODE_NAME(String arg) { m_CODE_NAME = arg; }
	public void setCODE2(String arg) { m_CODE2 = arg; }
	public void setCODE_NAME2(String arg) { m_CODE_NAME2 = arg; }
	public void setSYS_CLASS(String arg) { m_SYS_CLASS = arg; }
	public void setCLASS_CODE(String arg) { m_CLASS_CODE = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getSQLOPRRSLTINTERFACE() { return m_entity0; }
	public void setSQLOPRRSLTINTERFACE(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity1; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity2; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity3; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getSYS_CLASS_CODE() { return m_entity4; }
	public void setSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAD0080B002クラスの標準コンストラクタ
	 *
		 */
	public medAD0080B002()
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
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_CODE = null;
		m_CODE_NAME = null;
		m_CODE2 = null;
		m_CODE_NAME2 = null;
		m_SYS_CLASS = null;
		m_CLASS_CODE = null;

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
