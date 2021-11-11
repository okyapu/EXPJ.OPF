/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/src/com/nec/jp/orteus/metamorBase/KV0030/KV0030B001/medKV0030B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0030.KV0030B001;

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
 * CLASS     : medKV0030B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:57:29 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKV0030B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_inPLANT_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_sysBusinessMEG;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_OD_NO;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_ODR_NO;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_PART_DLV_SEQ_NO;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_DESINATED_SHIP_DATE;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_DESINATED_SHIP_QTY;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_MRP_ODR_TYP;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_OUTSIDE_TYP;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_ISSUE_TYP;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_ODR_LT;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_FIXED_LT;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_PROP_LT;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_SAFETY_LT;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_ISSUE_LT;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_PROP_LOT_SIZE;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_HIGH_LEVEL_NO;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_ITEM_SPOIL;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_SUM_TOTAL_SHIP_QTY;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_inOD_NO;

	/**
	 * readSYS_MY_COMPANY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readM_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * readSysBusinessMessage entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * readT_ANS_DLV_DATE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * insertT_OD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * updateT_ANS_DLV_DATE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * updateT_OD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * deleteT_OD entity インスタンスを格納します
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
	protected String m_Progname="KV0030B001";

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

	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getinPLANT_CD() { return m_inPLANT_CD; }
	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getDESINATED_SHIP_DATE() { return m_DESINATED_SHIP_DATE; }
	public String getDESINATED_SHIP_QTY() { return m_DESINATED_SHIP_QTY; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getISSUE_LT() { return m_ISSUE_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getHIGH_LEVEL_NO() { return m_HIGH_LEVEL_NO; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getSUM_TOTAL_SHIP_QTY() { return m_SUM_TOTAL_SHIP_QTY; }
	public String getinOD_NO() { return m_inOD_NO; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setinPLANT_CD(String arg) { m_inPLANT_CD = arg; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setOD_NO(String arg) { m_OD_NO = arg; }
	public void setODR_NO(String arg) { m_ODR_NO = arg; }
	public void setPART_DLV_SEQ_NO(String arg) { m_PART_DLV_SEQ_NO = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setDESINATED_SHIP_DATE(String arg) { m_DESINATED_SHIP_DATE = arg; }
	public void setDESINATED_SHIP_QTY(String arg) { m_DESINATED_SHIP_QTY = arg; }
	public void setMRP_ODR_TYP(String arg) { m_MRP_ODR_TYP = arg; }
	public void setOUTSIDE_TYP(String arg) { m_OUTSIDE_TYP = arg; }
	public void setISSUE_TYP(String arg) { m_ISSUE_TYP = arg; }
	public void setODR_LT(String arg) { m_ODR_LT = arg; }
	public void setFIXED_LT(String arg) { m_FIXED_LT = arg; }
	public void setPROP_LT(String arg) { m_PROP_LT = arg; }
	public void setSAFETY_LT(String arg) { m_SAFETY_LT = arg; }
	public void setISSUE_LT(String arg) { m_ISSUE_LT = arg; }
	public void setPROP_LOT_SIZE(String arg) { m_PROP_LOT_SIZE = arg; }
	public void setHIGH_LEVEL_NO(String arg) { m_HIGH_LEVEL_NO = arg; }
	public void setITEM_SPOIL(String arg) { m_ITEM_SPOIL = arg; }
	public void setSUM_TOTAL_SHIP_QTY(String arg) { m_SUM_TOTAL_SHIP_QTY = arg; }
	public void setinOD_NO(String arg) { m_inOD_NO = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSYS_MY_COMPANY() { return m_entity0; }
	public void setreadSYS_MY_COMPANY(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadM_PLANT() { return m_entity1; }
	public void setreadM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity2; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getreadT_ANS_DLV_DATE() { return m_entity3; }
	public void setreadT_ANS_DLV_DATE(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getinsertT_OD() { return m_entity4; }
	public void setinsertT_OD(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getupdateT_ANS_DLV_DATE() { return m_entity5; }
	public void setupdateT_ANS_DLV_DATE(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getupdateT_OD() { return m_entity6; }
	public void setupdateT_OD(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getdeleteT_OD() { return m_entity7; }
	public void setdeleteT_OD(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKV0030B001クラスの標準コンストラクタ
	 *
		 */
	public medKV0030B001()
	{
		// mediator変数を初期化します
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_inPLANT_CD = null;
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_OD_NO = null;
		m_ODR_NO = null;
		m_PART_DLV_SEQ_NO = null;
		m_ITEM_CD = null;
		m_DESINATED_SHIP_DATE = null;
		m_DESINATED_SHIP_QTY = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ISSUE_TYP = null;
		m_ODR_LT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_ISSUE_LT = null;
		m_PROP_LOT_SIZE = null;
		m_HIGH_LEVEL_NO = null;
		m_ITEM_SPOIL = null;
		m_SUM_TOTAL_SHIP_QTY = null;
		m_inOD_NO = null;

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
