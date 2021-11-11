/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070B001/medAH0070B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070.AH0070B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
//}}user_implement_dev:import

/**
 * CLASS     : medAH0070B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $ $Date: 2014/11/05 07:13:47 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAH0070B001 クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2004/1/13),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class medAH0070B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_APR_INV_CTRL;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_APPR_FLG;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_INV_DATE;

	/**
	 * USER_MST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * M_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_TYPE_VALUE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * T_INV_CTRL entity インスタンスを格納します
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
	protected String m_Progname="AH0070B001";

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

	public String getUSER_CD() { return m_USER_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getAPR_INV_CTRL() { return m_APR_INV_CTRL; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getINV_DATE() { return m_INV_DATE; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setAPR_INV_CTRL(String arg) { m_APR_INV_CTRL = arg; }
	public void setAPPR_FLG(String arg) { m_APPR_FLG = arg; }
	public void setINV_DATE(String arg) { m_INV_DATE = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getUSER_MST() { return m_entity0; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity1; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_TYPE_VALUE() { return m_entity2; }
	public void setSYS_TYPE_VALUE(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getT_INV_CTRL() { return m_entity3; }
	public void setT_INV_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAH0070B001クラスの標準コンストラクタ
	 *
		 */
	public medAH0070B001()
	{
		// mediator変数を初期化します
		m_USER_CD = null;
		m_PLANT_CD = null;
		m_APR_INV_CTRL = null;
		m_APPR_FLG = null;
		m_INV_DATE = null;

               //{{user_implement_dev:constractor
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
        //}}user_implement_dev:original

	//////////////////////////////

}
