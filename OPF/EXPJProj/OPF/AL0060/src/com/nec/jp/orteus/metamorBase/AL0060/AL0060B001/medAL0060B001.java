/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/src/com/nec/jp/orteus/metamorBase/AL0060/AL0060B001/medAL0060B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0060.AL0060B001;

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
 * CLASS     : medAL0060B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2014/11/05 07:19:55 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAL0060B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_PROGRAM_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_BUSINESS_CD;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_FILE_PATH;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_FILE_NAME;

	/**
	 * 第 7 mediator変数
	 */
	protected Double m_LOG_MODE_TYP;

	/**
	 * 第 8 mediator変数
	 */
	protected Double m_OUTPUT_MODE_TYP;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_pvc2LogMode;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_pvc2OutputMode;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_pvc2OutputPath;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_pvc2OutputName;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_pvc2UserId;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_pvc2BusinessName;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_pvc2PlantCd;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_pdtmCalcFromDate;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_pdtmCalcToDate;

	/**
	 * readSysBatParm entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * callSqlLoadCalcBat entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AL0060B001";

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

	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public Double getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public Double getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpdtmCalcFromDate() { return m_pdtmCalcFromDate; }
	public String getpdtmCalcToDate() { return m_pdtmCalcToDate; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(Double arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(Double arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpdtmCalcFromDate(String arg) { m_pdtmCalcFromDate = arg; }
	public void setpdtmCalcToDate(String arg) { m_pdtmCalcToDate = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBatParm() { return m_entity0; }
	public void setreadSysBatParm(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getcallSqlLoadCalcBat() { return m_entity1; }
	public void setcallSqlLoadCalcBat(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAL0060B001クラスの標準コンストラクタ
	 *
		 */
	public medAL0060B001()
	{
		// mediator変数を初期化します
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pdtmCalcFromDate = null;
		m_pdtmCalcToDate = null;

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
