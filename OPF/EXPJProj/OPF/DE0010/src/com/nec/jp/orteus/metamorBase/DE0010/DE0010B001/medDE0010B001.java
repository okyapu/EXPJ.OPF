/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0010/src/com/nec/jp/orteus/metamorBase/DE0010/DE0010B001/medDE0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0010.DE0010B001;

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
 * CLASS     : medDE0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:25:39 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDE0010B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_PLANT_NAME;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_USER_NAME;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_START_MONTH;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_AFTER_YEAR;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_AFTER_MONTH;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_AFTER_HALF_TERM_TYP;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_AFTER_TERM;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_CURRENT_YEAR;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_CURRENT_MONTH;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_TERM;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * M_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * USER_MST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_COST_CTRL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="DE0010B001";

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

	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getAFTER_YEAR() { return m_AFTER_YEAR; }
	public String getAFTER_MONTH() { return m_AFTER_MONTH; }
	public String getAFTER_HALF_TERM_TYP() { return m_AFTER_HALF_TERM_TYP; }
	public String getAFTER_TERM() { return m_AFTER_TERM; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getCURRENT_MONTH() { return m_CURRENT_MONTH; }
	public String getTERM() { return m_TERM; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setSTART_MONTH(String arg) { m_START_MONTH = arg; }
	public void setAFTER_YEAR(String arg) { m_AFTER_YEAR = arg; }
	public void setAFTER_MONTH(String arg) { m_AFTER_MONTH = arg; }
	public void setAFTER_HALF_TERM_TYP(String arg) { m_AFTER_HALF_TERM_TYP = arg; }
	public void setAFTER_TERM(String arg) { m_AFTER_TERM = arg; }
	public void setCURRENT_YEAR(String arg) { m_CURRENT_YEAR = arg; }
	public void setCURRENT_MONTH(String arg) { m_CURRENT_MONTH = arg; }
	public void setTERM(String arg) { m_TERM = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_PLANT() { return m_entity0; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity1; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity2; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDE0010B001クラスの標準コンストラクタ
	 *
		 */
	public medDE0010B001()
	{
		// mediator変数を初期化します
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_START_MONTH = null;
		m_AFTER_YEAR = null;
		m_AFTER_MONTH = null;
		m_AFTER_HALF_TERM_TYP = null;
		m_AFTER_TERM = null;
		m_CURRENT_YEAR = null;
		m_CURRENT_MONTH = null;
		m_TERM = null;
		m_HALF_TERM_TYP = null;

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
