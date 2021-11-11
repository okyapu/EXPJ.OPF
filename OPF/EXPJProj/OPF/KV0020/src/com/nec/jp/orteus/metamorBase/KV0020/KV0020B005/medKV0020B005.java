/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/medKV0020B005.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

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
 * CLASS     : medKV0020B005 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:56:00 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKV0020B005 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_INSPC_ACPT_INFO_IF_CTRL_NO;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_DATA_PROC_CD;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_INFO_TYP_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_DATA_CREATED_DATE;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_CLIENT_CD;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_TRUSTEE_CD;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_BUYER_ORG_CD;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_CUST_ODR_CD;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_PRDCT_ODR_CD;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_MODIFICATION_CODE;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_COCK_TYP;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_UNIT_CD;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_UNIT_PRICE_EXCH_RATES;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_UNIT_PRICE_TYP;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_ODR_QTY;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_BUYER_CD;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_DROWING_EDITION;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_ITEM_NAME;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_OWN_ITEM_CD;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_CUST_ITEM_CD;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_DLV_LOC_CD;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_DLV_CD;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_DLV_QTY;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_SHIP_DATE;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_DLV_DATE;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_PART_DLV_COUNT;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_SHORT_QTY;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_REJECT_QTY;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_INSPC_ACPT_UNIT_PRICE_EXCH_RAT;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_INSPC_ACPT_AMOUNT_EXCH_RATES;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_INSPC_ACPT_QTY;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_INSPC_ACPT_DATE;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_INSPC_ACPT_TYP;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_INSPC_ACPT_SLIP_CD;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_SHIP_PACKING_CD;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_REMARKS;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_TAX_TYP;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_TRADE_TYP;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_TAXATION_TYP;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_TAX_AMOUNT_EXCH_RATES;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_TOTAL_AMOUNT_EXCH_RATES;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_INSPC_ACPT_MONTH;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_DLV_KEY_CD;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_DLV_LOC_NAME;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_OWN_BARCODE_INF;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_OWN_REMARKS;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_CONTRACT_COND_TYP;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_QTY_CONTRACT_TYP;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_BUYER_ORG_NAME;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_BUYER_NAME_KANJI;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_ITEM_NAME_KANJI;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_REMARKS_KANJI;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_DLV_LOC_NAME_KANJI;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_OWN_REMARKS_KANJI;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_BUYER_ORG_CD_KANJI;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_CUR_CD;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_UNIT_PRICE;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_INSPC_ACPT_UNIT_PRICE;

	/**
	 * 第 59 mediator変数
	 */
	protected String m_INSPC_ACPT_AMOUNT;

	/**
	 * 第 60 mediator変数
	 */
	protected String m_TAX_AMOUNT;

	/**
	 * 第 61 mediator変数
	 */
	protected String m_TOTAL_AMOUNT;

	/**
	 * 第 62 mediator変数
	 */
	protected String m_STEEL_SHIP_LIST;

	/**
	 * 第 63 mediator変数
	 */
	protected String m_STEEL_SLIP_CD;

	/**
	 * 第 64 mediator変数
	 */
	protected String m_STEEL_POC_INDUSTRY;

	/**
	 * 第 65 mediator変数
	 */
	protected String m_STEEL_DLV_LOC;

	/**
	 * 第 66 mediator変数
	 */
	protected String m_STEEL_DEM_FACTRY_CD;

	/**
	 * 第 67 mediator変数
	 */
	protected String m_STEEL_TR_COMP_ORG_CD;

	/**
	 * 第 68 mediator変数
	 */
	protected String m_STEEL_TR_COMP_ORG_INQUIRY_CD;

	/**
	 * 第 69 mediator変数
	 */
	protected String m_STEEL_DSP_SPEC;

	/**
	 * 第 70 mediator変数
	 */
	protected String m_STEEL_SIZE;

	/**
	 * 第 71 mediator変数
	 */
	protected String m_STEEL_POC_COST;

	/**
	 * 第 72 mediator変数
	 */
	protected String m_SYSTEM_PROC_TYP;

	/**
	 * 第 73 mediator変数
	 */
	protected String m_DEL_FLG;

	/**
	 * 第 74 mediator変数
	 */
	protected String m_AR_INSTALL_CNT;

	/**
	 * 第 75 mediator変数
	 */
	protected String m_COMPANY_CD;

	/**
	 * 第 76 mediator変数
	 */
	protected String m_PLANT_CD;

	/**
	 * 第 77 mediator変数
	 */
	protected String m_BUSINESS_OPR_DATE;

	/**
	 * 第 78 mediator変数
	 */
	protected String m_CTRL_NO;

	/**
	 * 第 79 mediator変数
	 */
	protected String m_STATUS;

	/**
	 * 第 80 mediator変数
	 */
	protected String m_MSG_CD;

	/**
	 * 第 81 mediator変数
	 */
	protected String m_MSG_TXT;

	/**
	 * 第 82 mediator変数
	 */
	protected String m_CUST_CD;

	/**
	 * 第 83 mediator変数
	 */
	protected String m_ITEM_CD;

	/**
	 * 第 84 mediator変数
	 */
	protected String m_CUST_CHRG_PSN_CD;

	/**
	 * 第 85 mediator変数
	 */
	protected String m_IN_UNIT_PRICE;

	/**
	 * 第 86 mediator変数
	 */
	protected String m_UNIT_COST;

	/**
	 * 第 87 mediator変数
	 */
	protected String m_IN_QTY;

	/**
	 * 第 88 mediator変数
	 */
	protected String m_IN_DATE;

	/**
	 * 第 89 mediator変数
	 */
	protected String m_SHIP_ODR_NO;

	/**
	 * 第 90 mediator変数
	 */
	protected String m_SLIP_CD;

	/**
	 * 第 91 mediator変数
	 */
	protected String m_CUST_NAME;

	/**
	 * 第 92 mediator変数
	 */
	protected String m_USER_CD;

	/**
	 * 第 93 mediator変数
	 */
	protected String m_IN_AMOUNT;

	/**
	 * 第 94 mediator変数
	 */
	protected String m_IN_AMOUNT_EXCH_RATES;

	/**
	 * 第 95 mediator変数
	 */
	protected String m_PKG_UNIT_QTY;

	/**
	 * 第 96 mediator変数
	 */
	protected String m_DEPO_WH_CD;

	/**
	 * 第 97 mediator変数
	 */
	protected String m_SALES_DEPT_CD;

	/**
	 * 第 98 mediator変数
	 */
	protected String m_EXTERNAL_TAX_SALES_AMOUNT;

	/**
	 * 第 99 mediator変数
	 */
	protected String m_INTERNAL_TAX_SALES_AMOUNT;

	/**
	 * 第 100 mediator変数
	 */
	protected String m_TAXFREE_SALES_AMOUNT;

	/**
	 * 第 101 mediator変数
	 */
	protected String m_TAX_CREDIT_SALES_AMOUNT;

	/**
	 * 第 102 mediator変数
	 */
	protected String m_EXTERNAL_TAX_AMOUNT;

	/**
	 * 第 103 mediator変数
	 */
	protected String m_INTERNAL_TAX_AMOUNT;

	/**
	 * 第 104 mediator変数
	 */
	protected String m_TAX_AMOUNT_1;

	/**
	 * 第 105 mediator変数
	 */
	protected String m_TAX_AMOUNT_2;

	/**
	 * 第 106 mediator変数
	 */
	protected String m_TAX_AMOUNT_3;

	/**
	 * 第 107 mediator変数
	 */
	protected String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT;

	/**
	 * 第 108 mediator変数
	 */
	protected String m_EXCH_RATE;

	/**
	 * 第 109 mediator変数
	 */
	protected String m_ITEM_STOK_PLANT_CD;

	/**
	 * 第 110 mediator変数
	 */
	protected String m_RCV_ISSUE_CTRL_CD;

	/**
	 * 第 111 mediator変数
	 */
	protected String m_DETAIL_ROUND_TYP;

	/**
	 * 第 112 mediator変数
	 */
	protected String m_EXCH_TYP;

	/**
	 * 第 113 mediator変数
	 */
	protected String m_TAX_APPLY_TYP;

	/**
	 * 第 114 mediator変数
	 */
	protected String m_CUST_TAX_CD;

	/**
	 * 第 115 mediator変数
	 */
	protected String m_OWN_ORG_CD;

	/**
	 * 第 116 mediator変数
	 */
	protected String m_DECIMAL_FIG;

	/**
	 * 第 117 mediator変数
	 */
	protected String m_WH_PLANT_CD;

	/**
	 * 第 118 mediator変数
	 */
	protected String m_TAX_CD;

	/**
	 * 第 119 mediator変数
	 */
	protected String m_DEPO_TYP;

	/**
	 * 第 120 mediator変数
	 */
	protected String m_OLD_TAX_RATE_1;

	/**
	 * 第 121 mediator変数
	 */
	protected String m_OLD_TAX_RATE_2;

	/**
	 * 第 122 mediator変数
	 */
	protected String m_OLD_TAX_RATE_3;

	/**
	 * 第 123 mediator変数
	 */
	protected String m_TAX_RATE_1;

	/**
	 * 第 124 mediator変数
	 */
	protected String m_TAX_RATE_2;

	/**
	 * 第 125 mediator変数
	 */
	protected String m_TAX_RATE_3;

	/**
	 * 第 126 mediator変数
	 */
	protected String m_TAX_START_DATE;

	/**
	 * 第 127 mediator変数
	 */
	protected String m_TAX_ROUND_TYP;

	/**
	 * T_INSPC_ACPT_INFO_IF entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * chkSysInstallOptions entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * getCompanyInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * getPlantCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * getBusinessOprDate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * getHomeCurCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * T_INSPC_ACPT_INFO_IF_1 entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * T_ERR_WNG_LST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * T_SHIP_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * T_SHIP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * T_SALES entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * T_ITEM_STOCK entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * T_RCV_ISSUE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * M_CUST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * M_ITEM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * M_UNIT_COST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * M_CUST_BASE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * M_CUR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity17=null;

	/**
	 * M_EXCH_RATE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity18=null;

	/**
	 * M_WH entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity19=null;

	/**
	 * M_ITEM_SPEC entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity20=null;

	/**
	 * inFikeConvert entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity21=null;

	/**
	 * M_TAX entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity22=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="KV0020B005";

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

	public String getINSPC_ACPT_INFO_IF_CTRL_NO() { return m_INSPC_ACPT_INFO_IF_CTRL_NO; }
	public String getDATA_PROC_CD() { return m_DATA_PROC_CD; }
	public String getINFO_TYP_CD() { return m_INFO_TYP_CD; }
	public String getDATA_CREATED_DATE() { return m_DATA_CREATED_DATE; }
	public String getCLIENT_CD() { return m_CLIENT_CD; }
	public String getTRUSTEE_CD() { return m_TRUSTEE_CD; }
	public String getBUYER_ORG_CD() { return m_BUYER_ORG_CD; }
	public String getCUST_ODR_CD() { return m_CUST_ODR_CD; }
	public String getPRDCT_ODR_CD() { return m_PRDCT_ODR_CD; }
	public String getMODIFICATION_CODE() { return m_MODIFICATION_CODE; }
	public String getCOCK_TYP() { return m_COCK_TYP; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getUNIT_PRICE_EXCH_RATES() { return m_UNIT_PRICE_EXCH_RATES; }
	public String getUNIT_PRICE_TYP() { return m_UNIT_PRICE_TYP; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getBUYER_CD() { return m_BUYER_CD; }
	public String getDROWING_EDITION() { return m_DROWING_EDITION; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getOWN_ITEM_CD() { return m_OWN_ITEM_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getDLV_QTY() { return m_DLV_QTY; }
	public String getSHIP_DATE() { return m_SHIP_DATE; }
	public String getDLV_DATE() { return m_DLV_DATE; }
	public String getPART_DLV_COUNT() { return m_PART_DLV_COUNT; }
	public String getSHORT_QTY() { return m_SHORT_QTY; }
	public String getREJECT_QTY() { return m_REJECT_QTY; }
	public String getINSPC_ACPT_UNIT_PRICE_EXCH_RAT() { return m_INSPC_ACPT_UNIT_PRICE_EXCH_RAT; }
	public String getINSPC_ACPT_AMOUNT_EXCH_RATES() { return m_INSPC_ACPT_AMOUNT_EXCH_RATES; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getINSPC_ACPT_SLIP_CD() { return m_INSPC_ACPT_SLIP_CD; }
	public String getSHIP_PACKING_CD() { return m_SHIP_PACKING_CD; }
	public String getREMARKS() { return m_REMARKS; }
	public String getTAX_TYP() { return m_TAX_TYP; }
	public String getTRADE_TYP() { return m_TRADE_TYP; }
	public String getTAXATION_TYP() { return m_TAXATION_TYP; }
	public String getTAX_AMOUNT_EXCH_RATES() { return m_TAX_AMOUNT_EXCH_RATES; }
	public String getTOTAL_AMOUNT_EXCH_RATES() { return m_TOTAL_AMOUNT_EXCH_RATES; }
	public String getINSPC_ACPT_MONTH() { return m_INSPC_ACPT_MONTH; }
	public String getDLV_KEY_CD() { return m_DLV_KEY_CD; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getOWN_BARCODE_INF() { return m_OWN_BARCODE_INF; }
	public String getOWN_REMARKS() { return m_OWN_REMARKS; }
	public String getCONTRACT_COND_TYP() { return m_CONTRACT_COND_TYP; }
	public String getQTY_CONTRACT_TYP() { return m_QTY_CONTRACT_TYP; }
	public String getBUYER_ORG_NAME() { return m_BUYER_ORG_NAME; }
	public String getBUYER_NAME_KANJI() { return m_BUYER_NAME_KANJI; }
	public String getITEM_NAME_KANJI() { return m_ITEM_NAME_KANJI; }
	public String getREMARKS_KANJI() { return m_REMARKS_KANJI; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getOWN_REMARKS_KANJI() { return m_OWN_REMARKS_KANJI; }
	public String getBUYER_ORG_CD_KANJI() { return m_BUYER_ORG_CD_KANJI; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getUNIT_PRICE() { return m_UNIT_PRICE; }
	public String getINSPC_ACPT_UNIT_PRICE() { return m_INSPC_ACPT_UNIT_PRICE; }
	public String getINSPC_ACPT_AMOUNT() { return m_INSPC_ACPT_AMOUNT; }
	public String getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public String getTOTAL_AMOUNT() { return m_TOTAL_AMOUNT; }
	public String getSTEEL_SHIP_LIST() { return m_STEEL_SHIP_LIST; }
	public String getSTEEL_SLIP_CD() { return m_STEEL_SLIP_CD; }
	public String getSTEEL_POC_INDUSTRY() { return m_STEEL_POC_INDUSTRY; }
	public String getSTEEL_DLV_LOC() { return m_STEEL_DLV_LOC; }
	public String getSTEEL_DEM_FACTRY_CD() { return m_STEEL_DEM_FACTRY_CD; }
	public String getSTEEL_TR_COMP_ORG_CD() { return m_STEEL_TR_COMP_ORG_CD; }
	public String getSTEEL_TR_COMP_ORG_INQUIRY_CD() { return m_STEEL_TR_COMP_ORG_INQUIRY_CD; }
	public String getSTEEL_DSP_SPEC() { return m_STEEL_DSP_SPEC; }
	public String getSTEEL_SIZE() { return m_STEEL_SIZE; }
	public String getSTEEL_POC_COST() { return m_STEEL_POC_COST; }
	public String getSYSTEM_PROC_TYP() { return m_SYSTEM_PROC_TYP; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getAR_INSTALL_CNT() { return m_AR_INSTALL_CNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getCTRL_NO() { return m_CTRL_NO; }
	public String getSTATUS() { return m_STATUS; }
	public String getMSG_CD() { return m_MSG_CD; }
	public String getMSG_TXT() { return m_MSG_TXT; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getIN_UNIT_PRICE() { return m_IN_UNIT_PRICE; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getIN_QTY() { return m_IN_QTY; }
	public String getIN_DATE() { return m_IN_DATE; }
	public String getSHIP_ODR_NO() { return m_SHIP_ODR_NO; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getIN_AMOUNT() { return m_IN_AMOUNT; }
	public String getIN_AMOUNT_EXCH_RATES() { return m_IN_AMOUNT_EXCH_RATES; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public String getDEPO_WH_CD() { return m_DEPO_WH_CD; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getEXTERNAL_TAX_SALES_AMOUNT() { return m_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getINTERNAL_TAX_SALES_AMOUNT() { return m_INTERNAL_TAX_SALES_AMOUNT; }
	public String getTAXFREE_SALES_AMOUNT() { return m_TAXFREE_SALES_AMOUNT; }
	public String getTAX_CREDIT_SALES_AMOUNT() { return m_TAX_CREDIT_SALES_AMOUNT; }
	public String getEXTERNAL_TAX_AMOUNT() { return m_EXTERNAL_TAX_AMOUNT; }
	public String getINTERNAL_TAX_AMOUNT() { return m_INTERNAL_TAX_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getITEM_STOK_PLANT_CD() { return m_ITEM_STOK_PLANT_CD; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getCUST_TAX_CD() { return m_CUST_TAX_CD; }
	public String getOWN_ORG_CD() { return m_OWN_ORG_CD; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getWH_PLANT_CD() { return m_WH_PLANT_CD; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getOLD_TAX_RATE_1() { return m_OLD_TAX_RATE_1; }
	public String getOLD_TAX_RATE_2() { return m_OLD_TAX_RATE_2; }
	public String getOLD_TAX_RATE_3() { return m_OLD_TAX_RATE_3; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_START_DATE() { return m_TAX_START_DATE; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public void setINSPC_ACPT_INFO_IF_CTRL_NO(String arg) { m_INSPC_ACPT_INFO_IF_CTRL_NO = arg; }
	public void setDATA_PROC_CD(String arg) { m_DATA_PROC_CD = arg; }
	public void setINFO_TYP_CD(String arg) { m_INFO_TYP_CD = arg; }
	public void setDATA_CREATED_DATE(String arg) { m_DATA_CREATED_DATE = arg; }
	public void setCLIENT_CD(String arg) { m_CLIENT_CD = arg; }
	public void setTRUSTEE_CD(String arg) { m_TRUSTEE_CD = arg; }
	public void setBUYER_ORG_CD(String arg) { m_BUYER_ORG_CD = arg; }
	public void setCUST_ODR_CD(String arg) { m_CUST_ODR_CD = arg; }
	public void setPRDCT_ODR_CD(String arg) { m_PRDCT_ODR_CD = arg; }
	public void setMODIFICATION_CODE(String arg) { m_MODIFICATION_CODE = arg; }
	public void setCOCK_TYP(String arg) { m_COCK_TYP = arg; }
	public void setUNIT_CD(String arg) { m_UNIT_CD = arg; }
	public void setUNIT_PRICE_EXCH_RATES(String arg) { m_UNIT_PRICE_EXCH_RATES = arg; }
	public void setUNIT_PRICE_TYP(String arg) { m_UNIT_PRICE_TYP = arg; }
	public void setODR_QTY(String arg) { m_ODR_QTY = arg; }
	public void setBUYER_CD(String arg) { m_BUYER_CD = arg; }
	public void setDROWING_EDITION(String arg) { m_DROWING_EDITION = arg; }
	public void setITEM_NAME(String arg) { m_ITEM_NAME = arg; }
	public void setOWN_ITEM_CD(String arg) { m_OWN_ITEM_CD = arg; }
	public void setCUST_ITEM_CD(String arg) { m_CUST_ITEM_CD = arg; }
	public void setDLV_LOC_CD(String arg) { m_DLV_LOC_CD = arg; }
	public void setDLV_CD(String arg) { m_DLV_CD = arg; }
	public void setDLV_QTY(String arg) { m_DLV_QTY = arg; }
	public void setSHIP_DATE(String arg) { m_SHIP_DATE = arg; }
	public void setDLV_DATE(String arg) { m_DLV_DATE = arg; }
	public void setPART_DLV_COUNT(String arg) { m_PART_DLV_COUNT = arg; }
	public void setSHORT_QTY(String arg) { m_SHORT_QTY = arg; }
	public void setREJECT_QTY(String arg) { m_REJECT_QTY = arg; }
	public void setINSPC_ACPT_UNIT_PRICE_EXCH_RAT(String arg) { m_INSPC_ACPT_UNIT_PRICE_EXCH_RAT = arg; }
	public void setINSPC_ACPT_AMOUNT_EXCH_RATES(String arg) { m_INSPC_ACPT_AMOUNT_EXCH_RATES = arg; }
	public void setINSPC_ACPT_QTY(String arg) { m_INSPC_ACPT_QTY = arg; }
	public void setINSPC_ACPT_DATE(String arg) { m_INSPC_ACPT_DATE = arg; }
	public void setINSPC_ACPT_TYP(String arg) { m_INSPC_ACPT_TYP = arg; }
	public void setINSPC_ACPT_SLIP_CD(String arg) { m_INSPC_ACPT_SLIP_CD = arg; }
	public void setSHIP_PACKING_CD(String arg) { m_SHIP_PACKING_CD = arg; }
	public void setREMARKS(String arg) { m_REMARKS = arg; }
	public void setTAX_TYP(String arg) { m_TAX_TYP = arg; }
	public void setTRADE_TYP(String arg) { m_TRADE_TYP = arg; }
	public void setTAXATION_TYP(String arg) { m_TAXATION_TYP = arg; }
	public void setTAX_AMOUNT_EXCH_RATES(String arg) { m_TAX_AMOUNT_EXCH_RATES = arg; }
	public void setTOTAL_AMOUNT_EXCH_RATES(String arg) { m_TOTAL_AMOUNT_EXCH_RATES = arg; }
	public void setINSPC_ACPT_MONTH(String arg) { m_INSPC_ACPT_MONTH = arg; }
	public void setDLV_KEY_CD(String arg) { m_DLV_KEY_CD = arg; }
	public void setDLV_LOC_NAME(String arg) { m_DLV_LOC_NAME = arg; }
	public void setOWN_BARCODE_INF(String arg) { m_OWN_BARCODE_INF = arg; }
	public void setOWN_REMARKS(String arg) { m_OWN_REMARKS = arg; }
	public void setCONTRACT_COND_TYP(String arg) { m_CONTRACT_COND_TYP = arg; }
	public void setQTY_CONTRACT_TYP(String arg) { m_QTY_CONTRACT_TYP = arg; }
	public void setBUYER_ORG_NAME(String arg) { m_BUYER_ORG_NAME = arg; }
	public void setBUYER_NAME_KANJI(String arg) { m_BUYER_NAME_KANJI = arg; }
	public void setITEM_NAME_KANJI(String arg) { m_ITEM_NAME_KANJI = arg; }
	public void setREMARKS_KANJI(String arg) { m_REMARKS_KANJI = arg; }
	public void setDLV_LOC_NAME_KANJI(String arg) { m_DLV_LOC_NAME_KANJI = arg; }
	public void setOWN_REMARKS_KANJI(String arg) { m_OWN_REMARKS_KANJI = arg; }
	public void setBUYER_ORG_CD_KANJI(String arg) { m_BUYER_ORG_CD_KANJI = arg; }
	public void setCUR_CD(String arg) { m_CUR_CD = arg; }
	public void setUNIT_PRICE(String arg) { m_UNIT_PRICE = arg; }
	public void setINSPC_ACPT_UNIT_PRICE(String arg) { m_INSPC_ACPT_UNIT_PRICE = arg; }
	public void setINSPC_ACPT_AMOUNT(String arg) { m_INSPC_ACPT_AMOUNT = arg; }
	public void setTAX_AMOUNT(String arg) { m_TAX_AMOUNT = arg; }
	public void setTOTAL_AMOUNT(String arg) { m_TOTAL_AMOUNT = arg; }
	public void setSTEEL_SHIP_LIST(String arg) { m_STEEL_SHIP_LIST = arg; }
	public void setSTEEL_SLIP_CD(String arg) { m_STEEL_SLIP_CD = arg; }
	public void setSTEEL_POC_INDUSTRY(String arg) { m_STEEL_POC_INDUSTRY = arg; }
	public void setSTEEL_DLV_LOC(String arg) { m_STEEL_DLV_LOC = arg; }
	public void setSTEEL_DEM_FACTRY_CD(String arg) { m_STEEL_DEM_FACTRY_CD = arg; }
	public void setSTEEL_TR_COMP_ORG_CD(String arg) { m_STEEL_TR_COMP_ORG_CD = arg; }
	public void setSTEEL_TR_COMP_ORG_INQUIRY_CD(String arg) { m_STEEL_TR_COMP_ORG_INQUIRY_CD = arg; }
	public void setSTEEL_DSP_SPEC(String arg) { m_STEEL_DSP_SPEC = arg; }
	public void setSTEEL_SIZE(String arg) { m_STEEL_SIZE = arg; }
	public void setSTEEL_POC_COST(String arg) { m_STEEL_POC_COST = arg; }
	public void setSYSTEM_PROC_TYP(String arg) { m_SYSTEM_PROC_TYP = arg; }
	public void setDEL_FLG(String arg) { m_DEL_FLG = arg; }
	public void setAR_INSTALL_CNT(String arg) { m_AR_INSTALL_CNT = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setBUSINESS_OPR_DATE(String arg) { m_BUSINESS_OPR_DATE = arg; }
	public void setCTRL_NO(String arg) { m_CTRL_NO = arg; }
	public void setSTATUS(String arg) { m_STATUS = arg; }
	public void setMSG_CD(String arg) { m_MSG_CD = arg; }
	public void setMSG_TXT(String arg) { m_MSG_TXT = arg; }
	public void setCUST_CD(String arg) { m_CUST_CD = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setCUST_CHRG_PSN_CD(String arg) { m_CUST_CHRG_PSN_CD = arg; }
	public void setIN_UNIT_PRICE(String arg) { m_IN_UNIT_PRICE = arg; }
	public void setUNIT_COST(String arg) { m_UNIT_COST = arg; }
	public void setIN_QTY(String arg) { m_IN_QTY = arg; }
	public void setIN_DATE(String arg) { m_IN_DATE = arg; }
	public void setSHIP_ODR_NO(String arg) { m_SHIP_ODR_NO = arg; }
	public void setSLIP_CD(String arg) { m_SLIP_CD = arg; }
	public void setCUST_NAME(String arg) { m_CUST_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setIN_AMOUNT(String arg) { m_IN_AMOUNT = arg; }
	public void setIN_AMOUNT_EXCH_RATES(String arg) { m_IN_AMOUNT_EXCH_RATES = arg; }
	public void setPKG_UNIT_QTY(String arg) { m_PKG_UNIT_QTY = arg; }
	public void setDEPO_WH_CD(String arg) { m_DEPO_WH_CD = arg; }
	public void setSALES_DEPT_CD(String arg) { m_SALES_DEPT_CD = arg; }
	public void setEXTERNAL_TAX_SALES_AMOUNT(String arg) { m_EXTERNAL_TAX_SALES_AMOUNT = arg; }
	public void setINTERNAL_TAX_SALES_AMOUNT(String arg) { m_INTERNAL_TAX_SALES_AMOUNT = arg; }
	public void setTAXFREE_SALES_AMOUNT(String arg) { m_TAXFREE_SALES_AMOUNT = arg; }
	public void setTAX_CREDIT_SALES_AMOUNT(String arg) { m_TAX_CREDIT_SALES_AMOUNT = arg; }
	public void setEXTERNAL_TAX_AMOUNT(String arg) { m_EXTERNAL_TAX_AMOUNT = arg; }
	public void setINTERNAL_TAX_AMOUNT(String arg) { m_INTERNAL_TAX_AMOUNT = arg; }
	public void setTAX_AMOUNT_1(String arg) { m_TAX_AMOUNT_1 = arg; }
	public void setTAX_AMOUNT_2(String arg) { m_TAX_AMOUNT_2 = arg; }
	public void setTAX_AMOUNT_3(String arg) { m_TAX_AMOUNT_3 = arg; }
	public void setOWN_CUR_TAXCREDIT_SALES_AMOUNT(String arg) { m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = arg; }
	public void setEXCH_RATE(String arg) { m_EXCH_RATE = arg; }
	public void setITEM_STOK_PLANT_CD(String arg) { m_ITEM_STOK_PLANT_CD = arg; }
	public void setRCV_ISSUE_CTRL_CD(String arg) { m_RCV_ISSUE_CTRL_CD = arg; }
	public void setDETAIL_ROUND_TYP(String arg) { m_DETAIL_ROUND_TYP = arg; }
	public void setEXCH_TYP(String arg) { m_EXCH_TYP = arg; }
	public void setTAX_APPLY_TYP(String arg) { m_TAX_APPLY_TYP = arg; }
	public void setCUST_TAX_CD(String arg) { m_CUST_TAX_CD = arg; }
	public void setOWN_ORG_CD(String arg) { m_OWN_ORG_CD = arg; }
	public void setDECIMAL_FIG(String arg) { m_DECIMAL_FIG = arg; }
	public void setWH_PLANT_CD(String arg) { m_WH_PLANT_CD = arg; }
	public void setTAX_CD(String arg) { m_TAX_CD = arg; }
	public void setDEPO_TYP(String arg) { m_DEPO_TYP = arg; }
	public void setOLD_TAX_RATE_1(String arg) { m_OLD_TAX_RATE_1 = arg; }
	public void setOLD_TAX_RATE_2(String arg) { m_OLD_TAX_RATE_2 = arg; }
	public void setOLD_TAX_RATE_3(String arg) { m_OLD_TAX_RATE_3 = arg; }
	public void setTAX_RATE_1(String arg) { m_TAX_RATE_1 = arg; }
	public void setTAX_RATE_2(String arg) { m_TAX_RATE_2 = arg; }
	public void setTAX_RATE_3(String arg) { m_TAX_RATE_3 = arg; }
	public void setTAX_START_DATE(String arg) { m_TAX_START_DATE = arg; }
	public void setTAX_ROUND_TYP(String arg) { m_TAX_ROUND_TYP = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getT_INSPC_ACPT_INFO_IF() { return m_entity0; }
	public void setT_INSPC_ACPT_INFO_IF(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getchkSysInstallOptions() { return m_entity1; }
	public void setchkSysInstallOptions(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getgetCompanyInfo() { return m_entity2; }
	public void setgetCompanyInfo(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getgetPlantCd() { return m_entity3; }
	public void setgetPlantCd(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getgetBusinessOprDate() { return m_entity4; }
	public void setgetBusinessOprDate(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getgetHomeCurCd() { return m_entity5; }
	public void setgetHomeCurCd(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getT_INSPC_ACPT_INFO_IF_1() { return m_entity6; }
	public void setT_INSPC_ACPT_INFO_IF_1(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getT_ERR_WNG_LST() { return m_entity7; }
	public void setT_ERR_WNG_LST(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getT_SHIP_ODR() { return m_entity8; }
	public void setT_SHIP_ODR(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getT_SHIP() { return m_entity9; }
	public void setT_SHIP(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getT_SALES() { return m_entity10; }
	public void setT_SALES(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getT_ITEM_STOCK() { return m_entity11; }
	public void setT_ITEM_STOCK(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getT_RCV_ISSUE() { return m_entity12; }
	public void setT_RCV_ISSUE(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getM_CUST() { return m_entity13; }
	public void setM_CUST(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getM_ITEM() { return m_entity14; }
	public void setM_ITEM(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public AbstractBatchAppEntity getM_UNIT_COST() { return m_entity15; }
	public void setM_UNIT_COST(AbstractBatchAppEntity obj) { m_entity15 = obj; }
	public AbstractBatchAppEntity getM_CUST_BASE() { return m_entity16; }
	public void setM_CUST_BASE(AbstractBatchAppEntity obj) { m_entity16 = obj; }
	public AbstractBatchAppEntity getM_CUR() { return m_entity17; }
	public void setM_CUR(AbstractBatchAppEntity obj) { m_entity17 = obj; }
	public AbstractBatchAppEntity getM_EXCH_RATE() { return m_entity18; }
	public void setM_EXCH_RATE(AbstractBatchAppEntity obj) { m_entity18 = obj; }
	public AbstractBatchAppEntity getM_WH() { return m_entity19; }
	public void setM_WH(AbstractBatchAppEntity obj) { m_entity19 = obj; }
	public AbstractBatchAppEntity getM_ITEM_SPEC() { return m_entity20; }
	public void setM_ITEM_SPEC(AbstractBatchAppEntity obj) { m_entity20 = obj; }
	public AbstractBatchAppEntity getinFikeConvert() { return m_entity21; }
	public void setinFikeConvert(AbstractBatchAppEntity obj) { m_entity21 = obj; }
	public AbstractBatchAppEntity getM_TAX() { return m_entity22; }
	public void setM_TAX(AbstractBatchAppEntity obj) { m_entity22 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKV0020B005クラスの標準コンストラクタ
	 *
		 */
	public medKV0020B005()
	{
		// mediator変数を初期化します
		m_INSPC_ACPT_INFO_IF_CTRL_NO = null;
		m_DATA_PROC_CD = null;
		m_INFO_TYP_CD = null;
		m_DATA_CREATED_DATE = null;
		m_CLIENT_CD = null;
		m_TRUSTEE_CD = null;
		m_BUYER_ORG_CD = null;
		m_CUST_ODR_CD = null;
		m_PRDCT_ODR_CD = null;
		m_MODIFICATION_CODE = null;
		m_COCK_TYP = null;
		m_UNIT_CD = null;
		m_UNIT_PRICE_EXCH_RATES = null;
		m_UNIT_PRICE_TYP = null;
		m_ODR_QTY = null;
		m_BUYER_CD = null;
		m_DROWING_EDITION = null;
		m_ITEM_NAME = null;
		m_OWN_ITEM_CD = null;
		m_CUST_ITEM_CD = null;
		m_DLV_LOC_CD = null;
		m_DLV_CD = null;
		m_DLV_QTY = null;
		m_SHIP_DATE = null;
		m_DLV_DATE = null;
		m_PART_DLV_COUNT = null;
		m_SHORT_QTY = null;
		m_REJECT_QTY = null;
		m_INSPC_ACPT_UNIT_PRICE_EXCH_RAT = null;
		m_INSPC_ACPT_AMOUNT_EXCH_RATES = null;
		m_INSPC_ACPT_QTY = null;
		m_INSPC_ACPT_DATE = null;
		m_INSPC_ACPT_TYP = null;
		m_INSPC_ACPT_SLIP_CD = null;
		m_SHIP_PACKING_CD = null;
		m_REMARKS = null;
		m_TAX_TYP = null;
		m_TRADE_TYP = null;
		m_TAXATION_TYP = null;
		m_TAX_AMOUNT_EXCH_RATES = null;
		m_TOTAL_AMOUNT_EXCH_RATES = null;
		m_INSPC_ACPT_MONTH = null;
		m_DLV_KEY_CD = null;
		m_DLV_LOC_NAME = null;
		m_OWN_BARCODE_INF = null;
		m_OWN_REMARKS = null;
		m_CONTRACT_COND_TYP = null;
		m_QTY_CONTRACT_TYP = null;
		m_BUYER_ORG_NAME = null;
		m_BUYER_NAME_KANJI = null;
		m_ITEM_NAME_KANJI = null;
		m_REMARKS_KANJI = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_OWN_REMARKS_KANJI = null;
		m_BUYER_ORG_CD_KANJI = null;
		m_CUR_CD = null;
		m_UNIT_PRICE = null;
		m_INSPC_ACPT_UNIT_PRICE = null;
		m_INSPC_ACPT_AMOUNT = null;
		m_TAX_AMOUNT = null;
		m_TOTAL_AMOUNT = null;
		m_STEEL_SHIP_LIST = null;
		m_STEEL_SLIP_CD = null;
		m_STEEL_POC_INDUSTRY = null;
		m_STEEL_DLV_LOC = null;
		m_STEEL_DEM_FACTRY_CD = null;
		m_STEEL_TR_COMP_ORG_CD = null;
		m_STEEL_TR_COMP_ORG_INQUIRY_CD = null;
		m_STEEL_DSP_SPEC = null;
		m_STEEL_SIZE = null;
		m_STEEL_POC_COST = null;
		m_SYSTEM_PROC_TYP = null;
		m_DEL_FLG = null;
		m_AR_INSTALL_CNT = null;
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_CTRL_NO = null;
		m_STATUS = null;
		m_MSG_CD = null;
		m_MSG_TXT = null;
		m_CUST_CD = null;
		m_ITEM_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_IN_UNIT_PRICE = null;
		m_UNIT_COST = null;
		m_IN_QTY = null;
		m_IN_DATE = null;
		m_SHIP_ODR_NO = null;
		m_SLIP_CD = null;
		m_CUST_NAME = null;
		m_USER_CD = null;
		m_IN_AMOUNT = null;
		m_IN_AMOUNT_EXCH_RATES = null;
		m_PKG_UNIT_QTY = null;
		m_DEPO_WH_CD = null;
		m_SALES_DEPT_CD = null;
		m_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_INTERNAL_TAX_SALES_AMOUNT = null;
		m_TAXFREE_SALES_AMOUNT = null;
		m_TAX_CREDIT_SALES_AMOUNT = null;
		m_EXTERNAL_TAX_AMOUNT = null;
		m_INTERNAL_TAX_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_EXCH_RATE = null;
		m_ITEM_STOK_PLANT_CD = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_DETAIL_ROUND_TYP = null;
		m_EXCH_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_CUST_TAX_CD = null;
		m_OWN_ORG_CD = null;
		m_DECIMAL_FIG = null;
		m_WH_PLANT_CD = null;
		m_TAX_CD = null;
		m_DEPO_TYP = null;
		m_OLD_TAX_RATE_1 = null;
		m_OLD_TAX_RATE_2 = null;
		m_OLD_TAX_RATE_3 = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_START_DATE = null;
		m_TAX_ROUND_TYP = null;

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
