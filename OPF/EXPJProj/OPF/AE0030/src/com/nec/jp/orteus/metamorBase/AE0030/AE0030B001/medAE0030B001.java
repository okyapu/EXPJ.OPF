/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030B001/medAE0030B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030.AE0030B001;

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
 * CLASS     : medAE0030B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.19 $ $Date: 2014/11/05 07:09:54 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAE0030B001 クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/10/3),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class medAE0030B001 extends Object
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
	protected String m_pvc2StartDate;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_pvc2DlvDate;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_pvc2PuchOdrCd;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_pvc2VendCd;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_pvc2PuchOdrPerson;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_pvc2JobOdrCd;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_pvc2ApprPurInst;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_pvc2ApprPowerTyp;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_PROGRAM_CD;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_BUSINESS_CD;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_FILE_PATH;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_FILE_NAME;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * CallSQLPUCHODRINST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * SelectSYS_BAT_PARM entity インスタンスを格納します
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
	protected String m_Progname="AE0030B001";

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
	public String getpvc2StartDate() { return m_pvc2StartDate; }
	public String getpvc2DlvDate() { return m_pvc2DlvDate; }
	public String getpvc2PuchOdrCd() { return m_pvc2PuchOdrCd; }
	public String getpvc2VendCd() { return m_pvc2VendCd; }
	public String getpvc2PuchOdrPerson() { return m_pvc2PuchOdrPerson; }
	public String getpvc2JobOdrCd() { return m_pvc2JobOdrCd; }
	public String getpvc2ApprPurInst() { return m_pvc2ApprPurInst; }
	public String getpvc2ApprPowerTyp() { return m_pvc2ApprPowerTyp; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2StartDate(String arg) { m_pvc2StartDate = arg; }
	public void setpvc2DlvDate(String arg) { m_pvc2DlvDate = arg; }
	public void setpvc2PuchOdrCd(String arg) { m_pvc2PuchOdrCd = arg; }
	public void setpvc2VendCd(String arg) { m_pvc2VendCd = arg; }
	public void setpvc2PuchOdrPerson(String arg) { m_pvc2PuchOdrPerson = arg; }
	public void setpvc2JobOdrCd(String arg) { m_pvc2JobOdrCd = arg; }
	public void setpvc2ApprPurInst(String arg) { m_pvc2ApprPurInst = arg; }
	public void setpvc2ApprPowerTyp(String arg) { m_pvc2ApprPowerTyp = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getCallSQLPUCHODRINST() { return m_entity0; }
	public void setCallSQLPUCHODRINST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getSelectSYS_BAT_PARM() { return m_entity1; }
	public void setSelectSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAE0030B001クラスの標準コンストラクタ
	 *
		 */
	public medAE0030B001()
	{
		// mediator変数を初期化します
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2StartDate = null;
		m_pvc2DlvDate = null;
		m_pvc2PuchOdrCd = null;
		m_pvc2VendCd = null;
		m_pvc2PuchOdrPerson = null;
		m_pvc2JobOdrCd = null;
		m_pvc2ApprPurInst = null;
		m_pvc2ApprPowerTyp = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;

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
