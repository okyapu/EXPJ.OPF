/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020B001/medAC0020B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020.AC0020B001;

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
 * CLASS     : medAC0020B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:01:34 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAC0020B001 クラス
 * VERSION   : 1.0.0.0
 * DATE      : 2003/08/08
 * AUTHOR    : NEXS
 * HISTORY
 *           : 1.0.0.0　2003/08/08,新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class medAC0020B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_programCd;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_functionName;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_businessGroupCd;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_businessCd;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_filePath;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_fileName;

	/**
	 * 第 7 mediator変数
	 */
	protected Integer m_logModeTyp;

	/**
	 * 第 8 mediator変数
	 */
	protected Integer m_outputModeTyp;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_plantCd;

	/**
	 * 第 10 mediator変数
	 */
	protected Integer m_managementTyp;

	/**
	 * 第 11 mediator変数
	 */
	protected Integer m_batchProcessingTyp;

	/**
	 * 第 12 mediator変数
	 */
	protected Integer m_outsideTyp;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_jobOdrCd;

	/**
	 * 第 14 mediator変数
	 */
	protected Integer m_jobOdrDetailNo;

	/**
	 * 第 15 mediator変数
	 */
	protected Integer m_entry1Typ;

	/**
	 * 第 16 mediator変数
	 */
	protected Integer m_entry2Typ;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_entryDate;

	/**
	 * 第 18 mediator変数
	 */
	protected java.util.Date m_businessOprDate;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_pvc2LogMode;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_pvc2OutputMode;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_pvc2OutputPath;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_pvc2OutputName;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_pvc2UserId;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_pvc2BusinessName;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_pvc2PlantCd;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_pvc2ManagementTyp;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_pvc2OutsideTyp;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_pvc2JobOdrCd;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_pvc2JobOdrDetailNo;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_pvc2Entry1Typ;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_pvc2Entry2Typ;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_pvc2EntryDate;

	/**
	 * readSysBatParm entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysOdReleaseCtrl entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * readSysDateCtrl entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * callSqlOdRelease entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="AC0020B001";

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

	public String getprogramCd() { return m_programCd; }
	public String getfunctionName() { return m_functionName; }
	public String getbusinessGroupCd() { return m_businessGroupCd; }
	public String getbusinessCd() { return m_businessCd; }
	public String getfilePath() { return m_filePath; }
	public String getfileName() { return m_fileName; }
	public Integer getlogModeTyp() { return m_logModeTyp; }
	public Integer getoutputModeTyp() { return m_outputModeTyp; }
	public String getplantCd() { return m_plantCd; }
	public Integer getmanagementTyp() { return m_managementTyp; }
	public Integer getbatchProcessingTyp() { return m_batchProcessingTyp; }
	public Integer getoutsideTyp() { return m_outsideTyp; }
	public String getjobOdrCd() { return m_jobOdrCd; }
	public Integer getjobOdrDetailNo() { return m_jobOdrDetailNo; }
	public Integer getentry1Typ() { return m_entry1Typ; }
	public Integer getentry2Typ() { return m_entry2Typ; }
	public String getentryDate() { return m_entryDate; }
	public java.util.Date getbusinessOprDate() { return m_businessOprDate; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpvc2ManagementTyp() { return m_pvc2ManagementTyp; }
	public String getpvc2OutsideTyp() { return m_pvc2OutsideTyp; }
	public String getpvc2JobOdrCd() { return m_pvc2JobOdrCd; }
	public String getpvc2JobOdrDetailNo() { return m_pvc2JobOdrDetailNo; }
	public String getpvc2Entry1Typ() { return m_pvc2Entry1Typ; }
	public String getpvc2Entry2Typ() { return m_pvc2Entry2Typ; }
	public String getpvc2EntryDate() { return m_pvc2EntryDate; }
	public void setprogramCd(String arg) { m_programCd = arg; }
	public void setfunctionName(String arg) { m_functionName = arg; }
	public void setbusinessGroupCd(String arg) { m_businessGroupCd = arg; }
	public void setbusinessCd(String arg) { m_businessCd = arg; }
	public void setfilePath(String arg) { m_filePath = arg; }
	public void setfileName(String arg) { m_fileName = arg; }
	public void setlogModeTyp(Integer arg) { m_logModeTyp = arg; }
	public void setoutputModeTyp(Integer arg) { m_outputModeTyp = arg; }
	public void setplantCd(String arg) { m_plantCd = arg; }
	public void setmanagementTyp(Integer arg) { m_managementTyp = arg; }
	public void setbatchProcessingTyp(Integer arg) { m_batchProcessingTyp = arg; }
	public void setoutsideTyp(Integer arg) { m_outsideTyp = arg; }
	public void setjobOdrCd(String arg) { m_jobOdrCd = arg; }
	public void setjobOdrDetailNo(Integer arg) { m_jobOdrDetailNo = arg; }
	public void setentry1Typ(Integer arg) { m_entry1Typ = arg; }
	public void setentry2Typ(Integer arg) { m_entry2Typ = arg; }
	public void setentryDate(String arg) { m_entryDate = arg; }
	public void setbusinessOprDate(java.util.Date arg) { m_businessOprDate = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2ManagementTyp(String arg) { m_pvc2ManagementTyp = arg; }
	public void setpvc2OutsideTyp(String arg) { m_pvc2OutsideTyp = arg; }
	public void setpvc2JobOdrCd(String arg) { m_pvc2JobOdrCd = arg; }
	public void setpvc2JobOdrDetailNo(String arg) { m_pvc2JobOdrDetailNo = arg; }
	public void setpvc2Entry1Typ(String arg) { m_pvc2Entry1Typ = arg; }
	public void setpvc2Entry2Typ(String arg) { m_pvc2Entry2Typ = arg; }
	public void setpvc2EntryDate(String arg) { m_pvc2EntryDate = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBatParm() { return m_entity0; }
	public void setreadSysBatParm(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysOdReleaseCtrl() { return m_entity1; }
	public void setreadSysOdReleaseCtrl(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getreadSysDateCtrl() { return m_entity2; }
	public void setreadSysDateCtrl(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getcallSqlOdRelease() { return m_entity3; }
	public void setcallSqlOdRelease(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAC0020B001クラスの標準コンストラクタ
	 *
		 */
	public medAC0020B001()
	{
		// mediator変数を初期化します
		m_programCd = null;
		m_functionName = null;
		m_businessGroupCd = null;
		m_businessCd = null;
		m_filePath = null;
		m_fileName = null;
		m_logModeTyp = null;
		m_outputModeTyp = null;
		m_plantCd = null;
		m_managementTyp = null;
		m_batchProcessingTyp = null;
		m_outsideTyp = null;
		m_jobOdrCd = null;
		m_jobOdrDetailNo = null;
		m_entry1Typ = null;
		m_entry2Typ = null;
		m_entryDate = null;
		m_businessOprDate = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2ManagementTyp = null;
		m_pvc2OutsideTyp = null;
		m_pvc2JobOdrCd = null;
		m_pvc2JobOdrDetailNo = null;
		m_pvc2Entry1Typ = null;
		m_pvc2Entry2Typ = null;
		m_pvc2EntryDate = null;

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
