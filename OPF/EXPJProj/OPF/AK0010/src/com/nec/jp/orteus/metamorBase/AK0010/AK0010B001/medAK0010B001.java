/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0010/src/com/nec/jp/orteus/metamorBase/AK0010/AK0010B001/medAK0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0010.AK0010B001;

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
 * CLASS     : medAK0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.7 $ $Date: 2016/05/23 08:26:42 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAK0010B001 extends Object
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
	protected String m_pvc2FinalDailyProcExecDate;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_pvc2BusinessOprDate;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_programCd;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_functionName;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_businessGroupCd;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_businessCd;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_filePath;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_fileName;

	/**
	 * 第 16 mediator変数
	 */
	protected Integer m_logModeTyp;

	/**
	 * 第 17 mediator変数
	 */
	protected Integer m_outputModeTyp;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_allPlantCd;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_finalDailyProcExecDate;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_finalPlantCd;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_chPlantCd;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_wherePlantCd;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_chUserCd;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_whereUserCd;

	/**
	 * callSqlDailyProc entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysBatParm entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * selectPlantCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * readFinalDailyProcExecDate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * checkPlantCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * checkUserCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AK0010B001";

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
	public String getpvc2FinalDailyProcExecDate() { return m_pvc2FinalDailyProcExecDate; }
	public String getpvc2BusinessOprDate() { return m_pvc2BusinessOprDate; }
	public String getprogramCd() { return m_programCd; }
	public String getfunctionName() { return m_functionName; }
	public String getbusinessGroupCd() { return m_businessGroupCd; }
	public String getbusinessCd() { return m_businessCd; }
	public String getfilePath() { return m_filePath; }
	public String getfileName() { return m_fileName; }
	public Integer getlogModeTyp() { return m_logModeTyp; }
	public Integer getoutputModeTyp() { return m_outputModeTyp; }
	public String getallPlantCd() { return m_allPlantCd; }
	public String getfinalDailyProcExecDate() { return m_finalDailyProcExecDate; }
	public String getfinalPlantCd() { return m_finalPlantCd; }
	public String getchPlantCd() { return m_chPlantCd; }
	public String getwherePlantCd() { return m_wherePlantCd; }
	public String getchUserCd() { return m_chUserCd; }
	public String getwhereUserCd() { return m_whereUserCd; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2FinalDailyProcExecDate(String arg) { m_pvc2FinalDailyProcExecDate = arg; }
	public void setpvc2BusinessOprDate(String arg) { m_pvc2BusinessOprDate = arg; }
	public void setprogramCd(String arg) { m_programCd = arg; }
	public void setfunctionName(String arg) { m_functionName = arg; }
	public void setbusinessGroupCd(String arg) { m_businessGroupCd = arg; }
	public void setbusinessCd(String arg) { m_businessCd = arg; }
	public void setfilePath(String arg) { m_filePath = arg; }
	public void setfileName(String arg) { m_fileName = arg; }
	public void setlogModeTyp(Integer arg) { m_logModeTyp = arg; }
	public void setoutputModeTyp(Integer arg) { m_outputModeTyp = arg; }
	public void setallPlantCd(String arg) { m_allPlantCd = arg; }
	public void setfinalDailyProcExecDate(String arg) { m_finalDailyProcExecDate = arg; }
	public void setfinalPlantCd(String arg) { m_finalPlantCd = arg; }
	public void setchPlantCd(String arg) { m_chPlantCd = arg; }
	public void setwherePlantCd(String arg) { m_wherePlantCd = arg; }
	public void setchUserCd(String arg) { m_chUserCd = arg; }
	public void setwhereUserCd(String arg) { m_whereUserCd = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getcallSqlDailyProc() { return m_entity0; }
	public void setcallSqlDailyProc(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysBatParm() { return m_entity1; }
	public void setreadSysBatParm(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getselectPlantCd() { return m_entity2; }
	public void setselectPlantCd(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getreadFinalDailyProcExecDate() { return m_entity3; }
	public void setreadFinalDailyProcExecDate(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getcheckPlantCd() { return m_entity4; }
	public void setcheckPlantCd(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getcheckUserCd() { return m_entity5; }
	public void setcheckUserCd(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAK0010B001クラスの標準コンストラクタ
	 *
		 */
	public medAK0010B001()
	{
		// mediator変数を初期化します
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2FinalDailyProcExecDate = null;
		m_pvc2BusinessOprDate = null;
		m_programCd = null;
		m_functionName = null;
		m_businessGroupCd = null;
		m_businessCd = null;
		m_filePath = null;
		m_fileName = null;
		m_logModeTyp = null;
		m_outputModeTyp = null;
		m_allPlantCd = null;
		m_finalDailyProcExecDate = null;
		m_finalPlantCd = null;
		m_chPlantCd = null;
		m_wherePlantCd = null;
		m_chUserCd = null;
		m_whereUserCd = null;

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
