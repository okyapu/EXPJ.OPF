/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0060/src/com/nec/jp/orteus/metamorBase/KP0060/KP0060B001/medKP0060B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0060.KP0060B001;

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
 * CLASS     : medKP0060B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.10 $ $Date: 2015/12/03 08:54:25 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKP0060B001 extends Object
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
	protected String m_ODR_NO;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_ODR_TYP;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_DESINATED_DLV_DATE;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_ODR_QTY;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_REMAIN_UNCONFIRM_ODR_QTY;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_BUSINESS_OPR_DATE;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_TRANSPORT_LT;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_MRP_ODR_TYP;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_OUTSIDE_TYP;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_ISSUE_TYP;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_ODR_LT;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_FIXED_LT;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_PROP_LT;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_SAFETY_LT;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_ISSUE_LT;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_PROP_LOT_SIZE;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_HIGH_LEVEL_NO;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_ITEM_SPOIL;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_WH_PLANT_CD;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_TOTAL_SHIP_QTY;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_sysBusinessMEG;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_KP_ADD_MONTH;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_KP_SUB_MONTH;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_CLASS_CD;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_inOD_NO;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_DUE_DATE;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_DM_QTY;

	/**
	 * readSYS_MY_COMPANY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readM_PLANT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * deleteT_OD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * readT_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * readTOTAL_SHIP_QTY entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * readSysBusinessMessage entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * readKP_ADD_MONTH entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * readKP_SUB_MONTH entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * readSYS_CLASS_CODE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * insertT_OD entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="KP0060B001";

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
	public String getODR_NO() { return m_ODR_NO; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getREMAIN_UNCONFIRM_ODR_QTY() { return m_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getTRANSPORT_LT() { return m_TRANSPORT_LT; }
	public String getITEM_CD() { return m_ITEM_CD; }
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
	public String getWH_PLANT_CD() { return m_WH_PLANT_CD; }
	public String getTOTAL_SHIP_QTY() { return m_TOTAL_SHIP_QTY; }
	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public String getKP_ADD_MONTH() { return m_KP_ADD_MONTH; }
	public String getKP_SUB_MONTH() { return m_KP_SUB_MONTH; }
	public String getCLASS_CD() { return m_CLASS_CD; }
	public String getinOD_NO() { return m_inOD_NO; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getDM_QTY() { return m_DM_QTY; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setinPLANT_CD(String arg) { m_inPLANT_CD = arg; }
	public void setODR_NO(String arg) { m_ODR_NO = arg; }
	public void setODR_TYP(String arg) { m_ODR_TYP = arg; }
	public void setDESINATED_DLV_DATE(String arg) { m_DESINATED_DLV_DATE = arg; }
	public void setODR_QTY(String arg) { m_ODR_QTY = arg; }
	public void setREMAIN_UNCONFIRM_ODR_QTY(String arg) { m_REMAIN_UNCONFIRM_ODR_QTY = arg; }
	public void setBUSINESS_OPR_DATE(String arg) { m_BUSINESS_OPR_DATE = arg; }
	public void setTRANSPORT_LT(String arg) { m_TRANSPORT_LT = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
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
	public void setWH_PLANT_CD(String arg) { m_WH_PLANT_CD = arg; }
	public void setTOTAL_SHIP_QTY(String arg) { m_TOTAL_SHIP_QTY = arg; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setKP_ADD_MONTH(String arg) { m_KP_ADD_MONTH = arg; }
	public void setKP_SUB_MONTH(String arg) { m_KP_SUB_MONTH = arg; }
	public void setCLASS_CD(String arg) { m_CLASS_CD = arg; }
	public void setinOD_NO(String arg) { m_inOD_NO = arg; }
	public void setDUE_DATE(String arg) { m_DUE_DATE = arg; }
	public void setDM_QTY(String arg) { m_DM_QTY = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSYS_MY_COMPANY() { return m_entity0; }
	public void setreadSYS_MY_COMPANY(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadM_PLANT() { return m_entity1; }
	public void setreadM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getdeleteT_OD() { return m_entity2; }
	public void setdeleteT_OD(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getreadT_ODR() { return m_entity3; }
	public void setreadT_ODR(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getreadTOTAL_SHIP_QTY() { return m_entity4; }
	public void setreadTOTAL_SHIP_QTY(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity5; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getreadKP_ADD_MONTH() { return m_entity6; }
	public void setreadKP_ADD_MONTH(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getreadKP_SUB_MONTH() { return m_entity7; }
	public void setreadKP_SUB_MONTH(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getreadSYS_CLASS_CODE() { return m_entity8; }
	public void setreadSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getinsertT_OD() { return m_entity9; }
	public void setinsertT_OD(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKP0060B001クラスの標準コンストラクタ
	 *
		 */
	public medKP0060B001()
	{
		// mediator変数を初期化します
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_inPLANT_CD = null;
		m_ODR_NO = null;
		m_ODR_TYP = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_QTY = null;
		m_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_TRANSPORT_LT = null;
		m_ITEM_CD = null;
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
		m_WH_PLANT_CD = null;
		m_TOTAL_SHIP_QTY = null;
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_KP_ADD_MONTH = null;
		m_KP_SUB_MONTH = null;
		m_CLASS_CD = null;
		m_inOD_NO = null;
		m_DUE_DATE = null;
		m_DM_QTY = null;

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
