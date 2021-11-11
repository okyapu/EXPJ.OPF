/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/medKQ0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
 * CLASS     : medKQ0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:37 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medKQ0010B001 クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/11/29),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class medKQ0010B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_strODR_NO;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_strODR_TYP;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_strODR_CTL_NO;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_strCUST_ODR_NO;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_strCUST_CHRG_ORG_CD;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_strCUST_CHRG_PSN_CD;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_strODR_ACPT_ORG_CD;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_strODR_ACPT_PSN_CD;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_strCURRNCY_CD;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_strDLV_LOC_CD;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_strDLV_LOC_CD_EIAJ;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_strDLV_LOC_NAME_KANJI;

	/**
	 * 第 13 mediator変数
	 */
	protected Double m_strODR_UNIT_PRICE;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_strSPCL_PRICE_TYP;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_strDESINATED_DLV_DATE;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_strSTD_DESINATED_RCV_DATE;

	/**
	 * 第 17 mediator変数
	 */
	protected Double m_strODR_QTY;

	/**
	 * 第 18 mediator変数
	 */
	protected Double m_strREMAIN_UNCONFIRM_ODR_QTY;

	/**
	 * 第 19 mediator変数
	 */
	protected Double m_strCANCELED_UNCONFIRM_ODR_QTY;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_strUNIT_CD;

	/**
	 * 第 21 mediator変数
	 */
	protected Double m_strUNCONFIRM_ODR_BALANCE;

	/**
	 * 第 22 mediator変数
	 */
	protected Double m_strODR_AMOUNT;

	/**
	 * 第 23 mediator変数
	 */
	protected Double m_strODR_AMOUNT_EXCH_RATES;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_strCUS_DLV_CD;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_strCUS_DLV_KEY_CD;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_strPART_NAME;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_strTRANSPORT_CD;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_strTAX_APPLY_TYP;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_strTAX_CD;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_strTAX_CALC_TYP;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_strREMARKS;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_strODR_ACPT_DATE;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_strPARTIAL_SHIP_INST_FLG;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_strDEPO_TYP;

	/**
	 * 第 35 mediator変数
	 */
	protected Double m_strEXCH_TYP;

	/**
	 * 第 36 mediator変数
	 */
	protected Double m_strSHIP_PLAN_REMAIN_QTY;

	/**
	 * 第 37 mediator変数
	 */
	protected Double m_strIF_CTL_NO;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_strTRANSPORT_TYP;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_strPKG_UNIT;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_strSLIP_PRICE_PRINT_TYP;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_strINSPC_TYP;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_strCLIENT_REMARK;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_strCLIENT_REMARK_KANJI;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_strCLIENT_BARCODE_INF;

	/**
	 * 第 45 mediator変数
	 */
	protected Double m_strODR_SEQ;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_strUNIT_CD_ORG;

	/**
	 * 第 47 mediator変数
	 */
	protected Double m_strPUCH_ODR_QTY_TOTAL;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_strBUYER_NAME;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_strBUYER_ORG_CD;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_strCOCK_TYP;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_strCUST_CD;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_strCUST_ITEM_CD;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_strITEM_CD;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_strCUST_ITEM_NAME;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_strITEM_NAME;

	/**
	 * 第 56 mediator変数
	 */
	protected Double m_strRSLT_CTL_SEQ_CD;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_strUNIT;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_strDLV_PLACE_CD;

	/**
	 * 第 59 mediator変数
	 */
	protected Double m_strUNIT_PRICE;

	/**
	 * 第 60 mediator変数
	 */
	protected String m_strCUR_CD;

	/**
	 * 第 61 mediator変数
	 */
	protected String m_strSPCL_PRICE_CO;

	/**
	 * 第 62 mediator変数
	 */
	protected String m_strCUST_DLV_CD;

	/**
	 * 第 63 mediator変数
	 */
	protected String m_strCUST_DLV_KEY_CD;

	/**
	 * 第 64 mediator変数
	 */
	protected String m_strDESINATED_SHIP_DATE;

	/**
	 * 第 65 mediator変数
	 */
	protected Double m_strDESINATED_SHIP_QTY;

	/**
	 * 第 66 mediator変数
	 */
	protected Double m_strREST_SHIP_ODR_QTY;

	/**
	 * 第 67 mediator変数
	 */
	protected String m_strLAST_ANS_DLV_DATE_RCD;

	/**
	 * 第 68 mediator変数
	 */
	protected String m_hisFIXED_ODR_NO;

	/**
	 * 第 69 mediator変数
	 */
	protected Double m_hisALCTED_SEQ_CD;

	/**
	 * 第 70 mediator変数
	 */
	protected String m_hisALCTED_UNCONFIRM_ODR_NO;

	/**
	 * 第 71 mediator変数
	 */
	protected Double m_hisALCTED_UNCONFIRM_ODR_QTY;

	/**
	 * 第 72 mediator変数
	 */
	protected String m_strCUST_ANAME;

	/**
	 * 第 73 mediator変数
	 */
	protected String m_strCOMPANY_CD;

	/**
	 * 第 74 mediator変数
	 */
	protected String m_strOWN_ORG_CD;

	/**
	 * 第 75 mediator変数
	 */
	protected String m_strOWN_PERSON_CD;

	/**
	 * 第 76 mediator変数
	 */
	protected Double m_strUNCONFIRM_ODR_EFF_PRIOD;

	/**
	 * 第 77 mediator変数
	 */
	protected String m_strUNCONFIRM_ODR_EFF_TERM_FLG;

	/**
	 * 第 78 mediator変数
	 */
	protected String m_strROUND_TYP;

	/**
	 * 第 79 mediator変数
	 */
	protected Double m_strTRANSPORT_LT;

	/**
	 * 第 80 mediator変数
	 */
	protected String m_strCAL_NO;

	/**
	 * 第 81 mediator変数
	 */
	protected String m_strDLV_LOC_NAME;

	/**
	 * 第 82 mediator変数
	 */
	protected String m_strDEPO_WH_CD;

	/**
	 * 第 83 mediator変数
	 */
	protected String m_strSHIP_WH_CD;

	/**
	 * 第 84 mediator変数
	 */
	protected String m_strSHIP_PLANT_CD;

	/**
	 * 第 85 mediator変数
	 */
	protected String m_strSTOCK_UNIT;

	/**
	 * 第 86 mediator変数
	 */
	protected String m_strUNIT_QTY_TYP;

	/**
	 * 第 87 mediator変数
	 */
	protected String m_strsTAX_CD;

	/**
	 * 第 88 mediator変数
	 */
	protected String m_strEFF_PHASE_IN_DATE;

	/**
	 * 第 89 mediator変数
	 */
	protected String m_strUSER_NAME;

	/**
	 * 第 90 mediator変数
	 */
	protected String m_strSECTION_CD;

	/**
	 * 第 91 mediator変数
	 */
	protected String m_strORG_CD;

	/**
	 * 第 92 mediator変数
	 */
	protected String m_strORG_NAME;

	/**
	 * 第 93 mediator変数
	 */
	protected String m_strORG_ANAME;

	/**
	 * 第 94 mediator変数
	 */
	protected String m_strUSER_CD;

	/**
	 * 第 95 mediator変数
	 */
	protected String m_strBUSINESS_OPR_DATE;

	/**
	 * 第 96 mediator変数
	 */
	protected String m_strPLANT_CD;

	/**
	 * 第 97 mediator変数
	 */
	protected Double m_nijREMAIN_UNCONFIRM_ODR_QTY;

	/**
	 * 第 98 mediator変数
	 */
	protected Double m_nijUNCONFIRM_ODR_BALANCE;

	/**
	 * 第 99 mediator変数
	 */
	protected String m_nijODR_NO;

	/**
	 * 第 100 mediator変数
	 */
	protected Double m_g_ODR_INFO_COM_IF_CTRL_NO;

	/**
	 * 第 101 mediator変数
	 */
	protected Double m_g_ODR_SEQ;

	/**
	 * 第 102 mediator変数
	 */
	protected String m_g_ODR_TYP;

	/**
	 * 第 103 mediator変数
	 */
	protected String m_g_IF_TYP;

	/**
	 * 第 104 mediator変数
	 */
	protected String m_g_INFO_TYP_CD;

	/**
	 * 第 105 mediator変数
	 */
	protected String m_g_CUST_ODR_NO;

	/**
	 * 第 106 mediator変数
	 */
	protected String m_g_ODR_ACPT_DATE;

	/**
	 * 第 107 mediator変数
	 */
	protected String m_g_CUST_CD;

	/**
	 * 第 108 mediator変数
	 */
	protected String m_g_CUST_ITEM_CD;

	/**
	 * 第 109 mediator変数
	 */
	protected String m_g_PART_NAME;

	/**
	 * 第 110 mediator変数
	 */
	protected String m_g_PROC_TYP;

	/**
	 * 第 111 mediator変数
	 */
	protected String m_g_COCK_TYP;

	/**
	 * 第 112 mediator変数
	 */
	protected String m_g_UNIT_CD;

	/**
	 * 第 113 mediator変数
	 */
	protected Double m_g_UNIT_COST;

	/**
	 * 第 114 mediator変数
	 */
	protected String m_g_UNIT_COST_TYP;

	/**
	 * 第 115 mediator変数
	 */
	protected String m_g_DESINATED_DLV_DATE;

	/**
	 * 第 116 mediator変数
	 */
	protected Double m_g_PUCH_ODR_QTY;

	/**
	 * 第 117 mediator変数
	 */
	protected String m_g_PKG_UNIT;

	/**
	 * 第 118 mediator変数
	 */
	protected String m_g_INSPC_TYP;

	/**
	 * 第 119 mediator変数
	 */
	protected String m_g_DLV_LOC_CD;

	/**
	 * 第 120 mediator変数
	 */
	protected String m_g_DLV_LOC_CD_EIAJ;

	/**
	 * 第 121 mediator変数
	 */
	protected String m_g_DLV_LOC_NAME_KANJI;

	/**
	 * 第 122 mediator変数
	 */
	protected String m_g_CUS_DLV_CD;

	/**
	 * 第 123 mediator変数
	 */
	protected String m_g_CUS_DLV_KEY_CD;

	/**
	 * 第 124 mediator変数
	 */
	protected String m_g_FREE_REMARK;

	/**
	 * 第 125 mediator変数
	 */
	protected String m_g_REMARK;

	/**
	 * 第 126 mediator変数
	 */
	protected String m_g_CLIENT_BARCODE_INF;

	/**
	 * 第 127 mediator変数
	 */
	protected String m_g_CLIENT_REMARK;

	/**
	 * 第 128 mediator変数
	 */
	protected String m_g_CLIENT_REMARK_KANJI;

	/**
	 * 第 129 mediator変数
	 */
	protected String m_g_SLIP_PRICE_PRINT_TYP;

	/**
	 * 第 130 mediator変数
	 */
	protected String m_g_CUR_CD;

	/**
	 * 第 131 mediator変数
	 */
	protected String m_g_OLD_ITEM_ODR_ACPT_F;

	/**
	 * 第 132 mediator変数
	 */
	protected String m_g_FORCED_ERR_ITEM_ODR_ACPT_F;

	/**
	 * 第 133 mediator変数
	 */
	protected String m_g_BUYER_NAME;

	/**
	 * 第 134 mediator変数
	 */
	protected Double m_g_PUCH_ODR_QTY_TOTAL;

	/**
	 * 第 135 mediator変数
	 */
	protected String m_g_UNIT_CD_ORG;

	/**
	 * 第 136 mediator変数
	 */
	protected String m_g_BUYER_ORG_CD;

	/**
	 * 第 137 mediator変数
	 */
	protected String m_g_SYSTEM_PROC_TYP;

	/**
	 * 第 138 mediator変数
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * 第 139 mediator変数
	 */
	protected String m_sysBusinessMEG;

	/**
	 * 第 140 mediator変数
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * 第 141 mediator変数
	 */
	protected Double m_errCTL_SEQ_NO;

	/**
	 * 第 142 mediator変数
	 */
	protected String m_errSTATUS;

	/**
	 * 第 143 mediator変数
	 */
	protected String m_errMSSGE_CD;

	/**
	 * 第 144 mediator変数
	 */
	protected String m_errMSSGE;

	/**
	 * 第 145 mediator変数
	 */
	protected String m_errCUST_CD;

	/**
	 * 第 146 mediator変数
	 */
	protected String m_errCUST_ITEM_CD;

	/**
	 * 第 147 mediator変数
	 */
	protected String m_errITEM_CD;

	/**
	 * 第 148 mediator変数
	 */
	protected String m_errCUST_ODR_NO;

	/**
	 * 第 149 mediator変数
	 */
	protected String m_errCUST_CHRG_PSN_CD;

	/**
	 * 第 150 mediator変数
	 */
	protected String m_errERR_REC_TYPE;

	/**
	 * 第 151 mediator変数
	 */
	protected Double m_errACTUAL_UNIT_PRICE;

	/**
	 * 第 152 mediator変数
	 */
	protected Double m_errMASTER_UNIT_PRICE;

	/**
	 * 第 153 mediator変数
	 */
	protected Double m_errQTY;

	/**
	 * 第 154 mediator変数
	 */
	protected String m_errODR_NO;

	/**
	 * 第 155 mediator変数
	 */
	protected String m_errDESINATED_DLV_DATE;

	/**
	 * 第 156 mediator変数
	 */
	protected String m_errSLIP_NO;

	/**
	 * 第 157 mediator変数
	 */
	protected Double m_errIF_CTL_NO;

	/**
	 * 第 158 mediator変数
	 */
	protected String m_errPROC_TYP;

	/**
	 * 第 159 mediator変数
	 */
	protected Double m_errODR_SEQ;

	/**
	 * 第 160 mediator変数
	 */
	protected String m_nijCUST_CD;

	/**
	 * 第 161 mediator変数
	 */
	protected String m_nijODR_CTL_NO;

	/**
	 * 第 162 mediator変数
	 */
	protected String m_nijDESINATED_DLV_DATE;

	/**
	 * 第 163 mediator変数
	 */
	protected String m_nijCURRNCY_CD;

	/**
	 * 第 164 mediator変数
	 */
	protected Double m_nijODR_UNIT_PRICE;

	/**
	 * 第 165 mediator変数
	 */
	protected String m_nijODR_TYP;

	/**
	 * 第 166 mediator変数
	 */
	protected String m_nijCUST_ITEM_CD;

	/**
	 * 第 167 mediator変数
	 */
	protected String m_sysCODE;

	/**
	 * 第 168 mediator変数
	 */
	protected String m_sysCLASS_CODE;

	/**
	 * 第 169 mediator変数
	 */
	protected String m_sysHomeCurCd;

	/**
	 * tbl_T_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * tbl_T_ODR_CTL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * tbl_T_ODR_ACPT_RSLT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * tbl_T_ANS_DLV_DATE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * tbl_T_ALLOC_FIXED_ODR_RSLT entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * tbl_M_CUST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * tbl_M_CUR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * tbl_M_CUST_BASE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * tbl_M_ITEM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * tbl_M_ITEM_SPEC entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * tbl_M_UNIT_COST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * getUserInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * getGyomuDate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * getSEQ_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * getSEQ_ODR_CTL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * getSEQ_RSLT_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * getCompanyInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * naiji_T_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity17=null;

	/**
	 * INDATA entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity18=null;

	/**
	 * readSysBusinessMessage entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity19=null;

	/**
	 * writeErrWngLst entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity20=null;

	/**
	 * getSEQ_ERR_WNG_LST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity21=null;

	/**
	 * tbl_M_CUST_BASE_check entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity22=null;

	/**
	 * naiji_T_ODR_hinban entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity23=null;

	/**
	 * getSYS_CLASS_CODE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity24=null;

	/**
	 * getSYS_HOME_CUR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity25=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="KQ0010B001";

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

	public String getstrODR_NO() { return m_strODR_NO; }
	public String getstrODR_TYP() { return m_strODR_TYP; }
	public String getstrODR_CTL_NO() { return m_strODR_CTL_NO; }
	public String getstrCUST_ODR_NO() { return m_strCUST_ODR_NO; }
	public String getstrCUST_CHRG_ORG_CD() { return m_strCUST_CHRG_ORG_CD; }
	public String getstrCUST_CHRG_PSN_CD() { return m_strCUST_CHRG_PSN_CD; }
	public String getstrODR_ACPT_ORG_CD() { return m_strODR_ACPT_ORG_CD; }
	public String getstrODR_ACPT_PSN_CD() { return m_strODR_ACPT_PSN_CD; }
	public String getstrCURRNCY_CD() { return m_strCURRNCY_CD; }
	public String getstrDLV_LOC_CD() { return m_strDLV_LOC_CD; }
	public String getstrDLV_LOC_CD_EIAJ() { return m_strDLV_LOC_CD_EIAJ; }
	public String getstrDLV_LOC_NAME_KANJI() { return m_strDLV_LOC_NAME_KANJI; }
	public Double getstrODR_UNIT_PRICE() { return m_strODR_UNIT_PRICE; }
	public String getstrSPCL_PRICE_TYP() { return m_strSPCL_PRICE_TYP; }
	public String getstrDESINATED_DLV_DATE() { return m_strDESINATED_DLV_DATE; }
	public String getstrSTD_DESINATED_RCV_DATE() { return m_strSTD_DESINATED_RCV_DATE; }
	public Double getstrODR_QTY() { return m_strODR_QTY; }
	public Double getstrREMAIN_UNCONFIRM_ODR_QTY() { return m_strREMAIN_UNCONFIRM_ODR_QTY; }
	public Double getstrCANCELED_UNCONFIRM_ODR_QTY() { return m_strCANCELED_UNCONFIRM_ODR_QTY; }
	public String getstrUNIT_CD() { return m_strUNIT_CD; }
	public Double getstrUNCONFIRM_ODR_BALANCE() { return m_strUNCONFIRM_ODR_BALANCE; }
	public Double getstrODR_AMOUNT() { return m_strODR_AMOUNT; }
	public Double getstrODR_AMOUNT_EXCH_RATES() { return m_strODR_AMOUNT_EXCH_RATES; }
	public String getstrCUS_DLV_CD() { return m_strCUS_DLV_CD; }
	public String getstrCUS_DLV_KEY_CD() { return m_strCUS_DLV_KEY_CD; }
	public String getstrPART_NAME() { return m_strPART_NAME; }
	public String getstrTRANSPORT_CD() { return m_strTRANSPORT_CD; }
	public String getstrTAX_APPLY_TYP() { return m_strTAX_APPLY_TYP; }
	public String getstrTAX_CD() { return m_strTAX_CD; }
	public String getstrTAX_CALC_TYP() { return m_strTAX_CALC_TYP; }
	public String getstrREMARKS() { return m_strREMARKS; }
	public String getstrODR_ACPT_DATE() { return m_strODR_ACPT_DATE; }
	public String getstrPARTIAL_SHIP_INST_FLG() { return m_strPARTIAL_SHIP_INST_FLG; }
	public String getstrDEPO_TYP() { return m_strDEPO_TYP; }
	public Double getstrEXCH_TYP() { return m_strEXCH_TYP; }
	public Double getstrSHIP_PLAN_REMAIN_QTY() { return m_strSHIP_PLAN_REMAIN_QTY; }
	public Double getstrIF_CTL_NO() { return m_strIF_CTL_NO; }
	public String getstrTRANSPORT_TYP() { return m_strTRANSPORT_TYP; }
	public String getstrPKG_UNIT() { return m_strPKG_UNIT; }
	public String getstrSLIP_PRICE_PRINT_TYP() { return m_strSLIP_PRICE_PRINT_TYP; }
	public String getstrINSPC_TYP() { return m_strINSPC_TYP; }
	public String getstrCLIENT_REMARK() { return m_strCLIENT_REMARK; }
	public String getstrCLIENT_REMARK_KANJI() { return m_strCLIENT_REMARK_KANJI; }
	public String getstrCLIENT_BARCODE_INF() { return m_strCLIENT_BARCODE_INF; }
	public Double getstrODR_SEQ() { return m_strODR_SEQ; }
	public String getstrUNIT_CD_ORG() { return m_strUNIT_CD_ORG; }
	public Double getstrPUCH_ODR_QTY_TOTAL() { return m_strPUCH_ODR_QTY_TOTAL; }
	public String getstrBUYER_NAME() { return m_strBUYER_NAME; }
	public String getstrBUYER_ORG_CD() { return m_strBUYER_ORG_CD; }
	public String getstrCOCK_TYP() { return m_strCOCK_TYP; }
	public String getstrCUST_CD() { return m_strCUST_CD; }
	public String getstrCUST_ITEM_CD() { return m_strCUST_ITEM_CD; }
	public String getstrITEM_CD() { return m_strITEM_CD; }
	public String getstrCUST_ITEM_NAME() { return m_strCUST_ITEM_NAME; }
	public String getstrITEM_NAME() { return m_strITEM_NAME; }
	public Double getstrRSLT_CTL_SEQ_CD() { return m_strRSLT_CTL_SEQ_CD; }
	public String getstrUNIT() { return m_strUNIT; }
	public String getstrDLV_PLACE_CD() { return m_strDLV_PLACE_CD; }
	public Double getstrUNIT_PRICE() { return m_strUNIT_PRICE; }
	public String getstrCUR_CD() { return m_strCUR_CD; }
	public String getstrSPCL_PRICE_CO() { return m_strSPCL_PRICE_CO; }
	public String getstrCUST_DLV_CD() { return m_strCUST_DLV_CD; }
	public String getstrCUST_DLV_KEY_CD() { return m_strCUST_DLV_KEY_CD; }
	public String getstrDESINATED_SHIP_DATE() { return m_strDESINATED_SHIP_DATE; }
	public Double getstrDESINATED_SHIP_QTY() { return m_strDESINATED_SHIP_QTY; }
	public Double getstrREST_SHIP_ODR_QTY() { return m_strREST_SHIP_ODR_QTY; }
	public String getstrLAST_ANS_DLV_DATE_RCD() { return m_strLAST_ANS_DLV_DATE_RCD; }
	public String gethisFIXED_ODR_NO() { return m_hisFIXED_ODR_NO; }
	public Double gethisALCTED_SEQ_CD() { return m_hisALCTED_SEQ_CD; }
	public String gethisALCTED_UNCONFIRM_ODR_NO() { return m_hisALCTED_UNCONFIRM_ODR_NO; }
	public Double gethisALCTED_UNCONFIRM_ODR_QTY() { return m_hisALCTED_UNCONFIRM_ODR_QTY; }
	public String getstrCUST_ANAME() { return m_strCUST_ANAME; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getstrOWN_ORG_CD() { return m_strOWN_ORG_CD; }
	public String getstrOWN_PERSON_CD() { return m_strOWN_PERSON_CD; }
	public Double getstrUNCONFIRM_ODR_EFF_PRIOD() { return m_strUNCONFIRM_ODR_EFF_PRIOD; }
	public String getstrUNCONFIRM_ODR_EFF_TERM_FLG() { return m_strUNCONFIRM_ODR_EFF_TERM_FLG; }
	public String getstrROUND_TYP() { return m_strROUND_TYP; }
	public Double getstrTRANSPORT_LT() { return m_strTRANSPORT_LT; }
	public String getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrDLV_LOC_NAME() { return m_strDLV_LOC_NAME; }
	public String getstrDEPO_WH_CD() { return m_strDEPO_WH_CD; }
	public String getstrSHIP_WH_CD() { return m_strSHIP_WH_CD; }
	public String getstrSHIP_PLANT_CD() { return m_strSHIP_PLANT_CD; }
	public String getstrSTOCK_UNIT() { return m_strSTOCK_UNIT; }
	public String getstrUNIT_QTY_TYP() { return m_strUNIT_QTY_TYP; }
	public String getstrsTAX_CD() { return m_strsTAX_CD; }
	public String getstrEFF_PHASE_IN_DATE() { return m_strEFF_PHASE_IN_DATE; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrORG_CD() { return m_strORG_CD; }
	public String getstrORG_NAME() { return m_strORG_NAME; }
	public String getstrORG_ANAME() { return m_strORG_ANAME; }
	public String getstrUSER_CD() { return m_strUSER_CD; }
	public String getstrBUSINESS_OPR_DATE() { return m_strBUSINESS_OPR_DATE; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public Double getnijREMAIN_UNCONFIRM_ODR_QTY() { return m_nijREMAIN_UNCONFIRM_ODR_QTY; }
	public Double getnijUNCONFIRM_ODR_BALANCE() { return m_nijUNCONFIRM_ODR_BALANCE; }
	public String getnijODR_NO() { return m_nijODR_NO; }
	public Double getg_ODR_INFO_COM_IF_CTRL_NO() { return m_g_ODR_INFO_COM_IF_CTRL_NO; }
	public Double getg_ODR_SEQ() { return m_g_ODR_SEQ; }
	public String getg_ODR_TYP() { return m_g_ODR_TYP; }
	public String getg_IF_TYP() { return m_g_IF_TYP; }
	public String getg_INFO_TYP_CD() { return m_g_INFO_TYP_CD; }
	public String getg_CUST_ODR_NO() { return m_g_CUST_ODR_NO; }
	public String getg_ODR_ACPT_DATE() { return m_g_ODR_ACPT_DATE; }
	public String getg_CUST_CD() { return m_g_CUST_CD; }
	public String getg_CUST_ITEM_CD() { return m_g_CUST_ITEM_CD; }
	public String getg_PART_NAME() { return m_g_PART_NAME; }
	public String getg_PROC_TYP() { return m_g_PROC_TYP; }
	public String getg_COCK_TYP() { return m_g_COCK_TYP; }
	public String getg_UNIT_CD() { return m_g_UNIT_CD; }
	public Double getg_UNIT_COST() { return m_g_UNIT_COST; }
	public String getg_UNIT_COST_TYP() { return m_g_UNIT_COST_TYP; }
	public String getg_DESINATED_DLV_DATE() { return m_g_DESINATED_DLV_DATE; }
	public Double getg_PUCH_ODR_QTY() { return m_g_PUCH_ODR_QTY; }
	public String getg_PKG_UNIT() { return m_g_PKG_UNIT; }
	public String getg_INSPC_TYP() { return m_g_INSPC_TYP; }
	public String getg_DLV_LOC_CD() { return m_g_DLV_LOC_CD; }
	public String getg_DLV_LOC_CD_EIAJ() { return m_g_DLV_LOC_CD_EIAJ; }
	public String getg_DLV_LOC_NAME_KANJI() { return m_g_DLV_LOC_NAME_KANJI; }
	public String getg_CUS_DLV_CD() { return m_g_CUS_DLV_CD; }
	public String getg_CUS_DLV_KEY_CD() { return m_g_CUS_DLV_KEY_CD; }
	public String getg_FREE_REMARK() { return m_g_FREE_REMARK; }
	public String getg_REMARK() { return m_g_REMARK; }
	public String getg_CLIENT_BARCODE_INF() { return m_g_CLIENT_BARCODE_INF; }
	public String getg_CLIENT_REMARK() { return m_g_CLIENT_REMARK; }
	public String getg_CLIENT_REMARK_KANJI() { return m_g_CLIENT_REMARK_KANJI; }
	public String getg_SLIP_PRICE_PRINT_TYP() { return m_g_SLIP_PRICE_PRINT_TYP; }
	public String getg_CUR_CD() { return m_g_CUR_CD; }
	public String getg_OLD_ITEM_ODR_ACPT_F() { return m_g_OLD_ITEM_ODR_ACPT_F; }
	public String getg_FORCED_ERR_ITEM_ODR_ACPT_F() { return m_g_FORCED_ERR_ITEM_ODR_ACPT_F; }
	public String getg_BUYER_NAME() { return m_g_BUYER_NAME; }
	public Double getg_PUCH_ODR_QTY_TOTAL() { return m_g_PUCH_ODR_QTY_TOTAL; }
	public String getg_UNIT_CD_ORG() { return m_g_UNIT_CD_ORG; }
	public String getg_BUYER_ORG_CD() { return m_g_BUYER_ORG_CD; }
	public String getg_SYSTEM_PROC_TYP() { return m_g_SYSTEM_PROC_TYP; }
	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public Double geterrCTL_SEQ_NO() { return m_errCTL_SEQ_NO; }
	public String geterrSTATUS() { return m_errSTATUS; }
	public String geterrMSSGE_CD() { return m_errMSSGE_CD; }
	public String geterrMSSGE() { return m_errMSSGE; }
	public String geterrCUST_CD() { return m_errCUST_CD; }
	public String geterrCUST_ITEM_CD() { return m_errCUST_ITEM_CD; }
	public String geterrITEM_CD() { return m_errITEM_CD; }
	public String geterrCUST_ODR_NO() { return m_errCUST_ODR_NO; }
	public String geterrCUST_CHRG_PSN_CD() { return m_errCUST_CHRG_PSN_CD; }
	public String geterrERR_REC_TYPE() { return m_errERR_REC_TYPE; }
	public Double geterrACTUAL_UNIT_PRICE() { return m_errACTUAL_UNIT_PRICE; }
	public Double geterrMASTER_UNIT_PRICE() { return m_errMASTER_UNIT_PRICE; }
	public Double geterrQTY() { return m_errQTY; }
	public String geterrODR_NO() { return m_errODR_NO; }
	public String geterrDESINATED_DLV_DATE() { return m_errDESINATED_DLV_DATE; }
	public String geterrSLIP_NO() { return m_errSLIP_NO; }
	public Double geterrIF_CTL_NO() { return m_errIF_CTL_NO; }
	public String geterrPROC_TYP() { return m_errPROC_TYP; }
	public Double geterrODR_SEQ() { return m_errODR_SEQ; }
	public String getnijCUST_CD() { return m_nijCUST_CD; }
	public String getnijODR_CTL_NO() { return m_nijODR_CTL_NO; }
	public String getnijDESINATED_DLV_DATE() { return m_nijDESINATED_DLV_DATE; }
	public String getnijCURRNCY_CD() { return m_nijCURRNCY_CD; }
	public Double getnijODR_UNIT_PRICE() { return m_nijODR_UNIT_PRICE; }
	public String getnijODR_TYP() { return m_nijODR_TYP; }
	public String getnijCUST_ITEM_CD() { return m_nijCUST_ITEM_CD; }
	public String getsysCODE() { return m_sysCODE; }
	public String getsysCLASS_CODE() { return m_sysCLASS_CODE; }
	public String getsysHomeCurCd() { return m_sysHomeCurCd; }
	public void setstrODR_NO(String arg) { m_strODR_NO = arg; }
	public void setstrODR_TYP(String arg) { m_strODR_TYP = arg; }
	public void setstrODR_CTL_NO(String arg) { m_strODR_CTL_NO = arg; }
	public void setstrCUST_ODR_NO(String arg) { m_strCUST_ODR_NO = arg; }
	public void setstrCUST_CHRG_ORG_CD(String arg) { m_strCUST_CHRG_ORG_CD = arg; }
	public void setstrCUST_CHRG_PSN_CD(String arg) { m_strCUST_CHRG_PSN_CD = arg; }
	public void setstrODR_ACPT_ORG_CD(String arg) { m_strODR_ACPT_ORG_CD = arg; }
	public void setstrODR_ACPT_PSN_CD(String arg) { m_strODR_ACPT_PSN_CD = arg; }
	public void setstrCURRNCY_CD(String arg) { m_strCURRNCY_CD = arg; }
	public void setstrDLV_LOC_CD(String arg) { m_strDLV_LOC_CD = arg; }
	public void setstrDLV_LOC_CD_EIAJ(String arg) { m_strDLV_LOC_CD_EIAJ = arg; }
	public void setstrDLV_LOC_NAME_KANJI(String arg) { m_strDLV_LOC_NAME_KANJI = arg; }
	public void setstrODR_UNIT_PRICE(Double arg) { m_strODR_UNIT_PRICE = arg; }
	public void setstrSPCL_PRICE_TYP(String arg) { m_strSPCL_PRICE_TYP = arg; }
	public void setstrDESINATED_DLV_DATE(String arg) { m_strDESINATED_DLV_DATE = arg; }
	public void setstrSTD_DESINATED_RCV_DATE(String arg) { m_strSTD_DESINATED_RCV_DATE = arg; }
	public void setstrODR_QTY(Double arg) { m_strODR_QTY = arg; }
	public void setstrREMAIN_UNCONFIRM_ODR_QTY(Double arg) { m_strREMAIN_UNCONFIRM_ODR_QTY = arg; }
	public void setstrCANCELED_UNCONFIRM_ODR_QTY(Double arg) { m_strCANCELED_UNCONFIRM_ODR_QTY = arg; }
	public void setstrUNIT_CD(String arg) { m_strUNIT_CD = arg; }
	public void setstrUNCONFIRM_ODR_BALANCE(Double arg) { m_strUNCONFIRM_ODR_BALANCE = arg; }
	public void setstrODR_AMOUNT(Double arg) { m_strODR_AMOUNT = arg; }
	public void setstrODR_AMOUNT_EXCH_RATES(Double arg) { m_strODR_AMOUNT_EXCH_RATES = arg; }
	public void setstrCUS_DLV_CD(String arg) { m_strCUS_DLV_CD = arg; }
	public void setstrCUS_DLV_KEY_CD(String arg) { m_strCUS_DLV_KEY_CD = arg; }
	public void setstrPART_NAME(String arg) { m_strPART_NAME = arg; }
	public void setstrTRANSPORT_CD(String arg) { m_strTRANSPORT_CD = arg; }
	public void setstrTAX_APPLY_TYP(String arg) { m_strTAX_APPLY_TYP = arg; }
	public void setstrTAX_CD(String arg) { m_strTAX_CD = arg; }
	public void setstrTAX_CALC_TYP(String arg) { m_strTAX_CALC_TYP = arg; }
	public void setstrREMARKS(String arg) { m_strREMARKS = arg; }
	public void setstrODR_ACPT_DATE(String arg) { m_strODR_ACPT_DATE = arg; }
	public void setstrPARTIAL_SHIP_INST_FLG(String arg) { m_strPARTIAL_SHIP_INST_FLG = arg; }
	public void setstrDEPO_TYP(String arg) { m_strDEPO_TYP = arg; }
	public void setstrEXCH_TYP(Double arg) { m_strEXCH_TYP = arg; }
	public void setstrSHIP_PLAN_REMAIN_QTY(Double arg) { m_strSHIP_PLAN_REMAIN_QTY = arg; }
	public void setstrIF_CTL_NO(Double arg) { m_strIF_CTL_NO = arg; }
	public void setstrTRANSPORT_TYP(String arg) { m_strTRANSPORT_TYP = arg; }
	public void setstrPKG_UNIT(String arg) { m_strPKG_UNIT = arg; }
	public void setstrSLIP_PRICE_PRINT_TYP(String arg) { m_strSLIP_PRICE_PRINT_TYP = arg; }
	public void setstrINSPC_TYP(String arg) { m_strINSPC_TYP = arg; }
	public void setstrCLIENT_REMARK(String arg) { m_strCLIENT_REMARK = arg; }
	public void setstrCLIENT_REMARK_KANJI(String arg) { m_strCLIENT_REMARK_KANJI = arg; }
	public void setstrCLIENT_BARCODE_INF(String arg) { m_strCLIENT_BARCODE_INF = arg; }
	public void setstrODR_SEQ(Double arg) { m_strODR_SEQ = arg; }
	public void setstrUNIT_CD_ORG(String arg) { m_strUNIT_CD_ORG = arg; }
	public void setstrPUCH_ODR_QTY_TOTAL(Double arg) { m_strPUCH_ODR_QTY_TOTAL = arg; }
	public void setstrBUYER_NAME(String arg) { m_strBUYER_NAME = arg; }
	public void setstrBUYER_ORG_CD(String arg) { m_strBUYER_ORG_CD = arg; }
	public void setstrCOCK_TYP(String arg) { m_strCOCK_TYP = arg; }
	public void setstrCUST_CD(String arg) { m_strCUST_CD = arg; }
	public void setstrCUST_ITEM_CD(String arg) { m_strCUST_ITEM_CD = arg; }
	public void setstrITEM_CD(String arg) { m_strITEM_CD = arg; }
	public void setstrCUST_ITEM_NAME(String arg) { m_strCUST_ITEM_NAME = arg; }
	public void setstrITEM_NAME(String arg) { m_strITEM_NAME = arg; }
	public void setstrRSLT_CTL_SEQ_CD(Double arg) { m_strRSLT_CTL_SEQ_CD = arg; }
	public void setstrUNIT(String arg) { m_strUNIT = arg; }
	public void setstrDLV_PLACE_CD(String arg) { m_strDLV_PLACE_CD = arg; }
	public void setstrUNIT_PRICE(Double arg) { m_strUNIT_PRICE = arg; }
	public void setstrCUR_CD(String arg) { m_strCUR_CD = arg; }
	public void setstrSPCL_PRICE_CO(String arg) { m_strSPCL_PRICE_CO = arg; }
	public void setstrCUST_DLV_CD(String arg) { m_strCUST_DLV_CD = arg; }
	public void setstrCUST_DLV_KEY_CD(String arg) { m_strCUST_DLV_KEY_CD = arg; }
	public void setstrDESINATED_SHIP_DATE(String arg) { m_strDESINATED_SHIP_DATE = arg; }
	public void setstrDESINATED_SHIP_QTY(Double arg) { m_strDESINATED_SHIP_QTY = arg; }
	public void setstrREST_SHIP_ODR_QTY(Double arg) { m_strREST_SHIP_ODR_QTY = arg; }
	public void setstrLAST_ANS_DLV_DATE_RCD(String arg) { m_strLAST_ANS_DLV_DATE_RCD = arg; }
	public void sethisFIXED_ODR_NO(String arg) { m_hisFIXED_ODR_NO = arg; }
	public void sethisALCTED_SEQ_CD(Double arg) { m_hisALCTED_SEQ_CD = arg; }
	public void sethisALCTED_UNCONFIRM_ODR_NO(String arg) { m_hisALCTED_UNCONFIRM_ODR_NO = arg; }
	public void sethisALCTED_UNCONFIRM_ODR_QTY(Double arg) { m_hisALCTED_UNCONFIRM_ODR_QTY = arg; }
	public void setstrCUST_ANAME(String arg) { m_strCUST_ANAME = arg; }
	public void setstrCOMPANY_CD(String arg) { m_strCOMPANY_CD = arg; }
	public void setstrOWN_ORG_CD(String arg) { m_strOWN_ORG_CD = arg; }
	public void setstrOWN_PERSON_CD(String arg) { m_strOWN_PERSON_CD = arg; }
	public void setstrUNCONFIRM_ODR_EFF_PRIOD(Double arg) { m_strUNCONFIRM_ODR_EFF_PRIOD = arg; }
	public void setstrUNCONFIRM_ODR_EFF_TERM_FLG(String arg) { m_strUNCONFIRM_ODR_EFF_TERM_FLG = arg; }
	public void setstrROUND_TYP(String arg) { m_strROUND_TYP = arg; }
	public void setstrTRANSPORT_LT(Double arg) { m_strTRANSPORT_LT = arg; }
	public void setstrCAL_NO(String arg) { m_strCAL_NO = arg; }
	public void setstrDLV_LOC_NAME(String arg) { m_strDLV_LOC_NAME = arg; }
	public void setstrDEPO_WH_CD(String arg) { m_strDEPO_WH_CD = arg; }
	public void setstrSHIP_WH_CD(String arg) { m_strSHIP_WH_CD = arg; }
	public void setstrSHIP_PLANT_CD(String arg) { m_strSHIP_PLANT_CD = arg; }
	public void setstrSTOCK_UNIT(String arg) { m_strSTOCK_UNIT = arg; }
	public void setstrUNIT_QTY_TYP(String arg) { m_strUNIT_QTY_TYP = arg; }
	public void setstrsTAX_CD(String arg) { m_strsTAX_CD = arg; }
	public void setstrEFF_PHASE_IN_DATE(String arg) { m_strEFF_PHASE_IN_DATE = arg; }
	public void setstrUSER_NAME(String arg) { m_strUSER_NAME = arg; }
	public void setstrSECTION_CD(String arg) { m_strSECTION_CD = arg; }
	public void setstrORG_CD(String arg) { m_strORG_CD = arg; }
	public void setstrORG_NAME(String arg) { m_strORG_NAME = arg; }
	public void setstrORG_ANAME(String arg) { m_strORG_ANAME = arg; }
	public void setstrUSER_CD(String arg) { m_strUSER_CD = arg; }
	public void setstrBUSINESS_OPR_DATE(String arg) { m_strBUSINESS_OPR_DATE = arg; }
	public void setstrPLANT_CD(String arg) { m_strPLANT_CD = arg; }
	public void setnijREMAIN_UNCONFIRM_ODR_QTY(Double arg) { m_nijREMAIN_UNCONFIRM_ODR_QTY = arg; }
	public void setnijUNCONFIRM_ODR_BALANCE(Double arg) { m_nijUNCONFIRM_ODR_BALANCE = arg; }
	public void setnijODR_NO(String arg) { m_nijODR_NO = arg; }
	public void setg_ODR_INFO_COM_IF_CTRL_NO(Double arg) { m_g_ODR_INFO_COM_IF_CTRL_NO = arg; }
	public void setg_ODR_SEQ(Double arg) { m_g_ODR_SEQ = arg; }
	public void setg_ODR_TYP(String arg) { m_g_ODR_TYP = arg; }
	public void setg_IF_TYP(String arg) { m_g_IF_TYP = arg; }
	public void setg_INFO_TYP_CD(String arg) { m_g_INFO_TYP_CD = arg; }
	public void setg_CUST_ODR_NO(String arg) { m_g_CUST_ODR_NO = arg; }
	public void setg_ODR_ACPT_DATE(String arg) { m_g_ODR_ACPT_DATE = arg; }
	public void setg_CUST_CD(String arg) { m_g_CUST_CD = arg; }
	public void setg_CUST_ITEM_CD(String arg) { m_g_CUST_ITEM_CD = arg; }
	public void setg_PART_NAME(String arg) { m_g_PART_NAME = arg; }
	public void setg_PROC_TYP(String arg) { m_g_PROC_TYP = arg; }
	public void setg_COCK_TYP(String arg) { m_g_COCK_TYP = arg; }
	public void setg_UNIT_CD(String arg) { m_g_UNIT_CD = arg; }
	public void setg_UNIT_COST(Double arg) { m_g_UNIT_COST = arg; }
	public void setg_UNIT_COST_TYP(String arg) { m_g_UNIT_COST_TYP = arg; }
	public void setg_DESINATED_DLV_DATE(String arg) { m_g_DESINATED_DLV_DATE = arg; }
	public void setg_PUCH_ODR_QTY(Double arg) { m_g_PUCH_ODR_QTY = arg; }
	public void setg_PKG_UNIT(String arg) { m_g_PKG_UNIT = arg; }
	public void setg_INSPC_TYP(String arg) { m_g_INSPC_TYP = arg; }
	public void setg_DLV_LOC_CD(String arg) { m_g_DLV_LOC_CD = arg; }
	public void setg_DLV_LOC_CD_EIAJ(String arg) { m_g_DLV_LOC_CD_EIAJ = arg; }
	public void setg_DLV_LOC_NAME_KANJI(String arg) { m_g_DLV_LOC_NAME_KANJI = arg; }
	public void setg_CUS_DLV_CD(String arg) { m_g_CUS_DLV_CD = arg; }
	public void setg_CUS_DLV_KEY_CD(String arg) { m_g_CUS_DLV_KEY_CD = arg; }
	public void setg_FREE_REMARK(String arg) { m_g_FREE_REMARK = arg; }
	public void setg_REMARK(String arg) { m_g_REMARK = arg; }
	public void setg_CLIENT_BARCODE_INF(String arg) { m_g_CLIENT_BARCODE_INF = arg; }
	public void setg_CLIENT_REMARK(String arg) { m_g_CLIENT_REMARK = arg; }
	public void setg_CLIENT_REMARK_KANJI(String arg) { m_g_CLIENT_REMARK_KANJI = arg; }
	public void setg_SLIP_PRICE_PRINT_TYP(String arg) { m_g_SLIP_PRICE_PRINT_TYP = arg; }
	public void setg_CUR_CD(String arg) { m_g_CUR_CD = arg; }
	public void setg_OLD_ITEM_ODR_ACPT_F(String arg) { m_g_OLD_ITEM_ODR_ACPT_F = arg; }
	public void setg_FORCED_ERR_ITEM_ODR_ACPT_F(String arg) { m_g_FORCED_ERR_ITEM_ODR_ACPT_F = arg; }
	public void setg_BUYER_NAME(String arg) { m_g_BUYER_NAME = arg; }
	public void setg_PUCH_ODR_QTY_TOTAL(Double arg) { m_g_PUCH_ODR_QTY_TOTAL = arg; }
	public void setg_UNIT_CD_ORG(String arg) { m_g_UNIT_CD_ORG = arg; }
	public void setg_BUYER_ORG_CD(String arg) { m_g_BUYER_ORG_CD = arg; }
	public void setg_SYSTEM_PROC_TYP(String arg) { m_g_SYSTEM_PROC_TYP = arg; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void seterrCTL_SEQ_NO(Double arg) { m_errCTL_SEQ_NO = arg; }
	public void seterrSTATUS(String arg) { m_errSTATUS = arg; }
	public void seterrMSSGE_CD(String arg) { m_errMSSGE_CD = arg; }
	public void seterrMSSGE(String arg) { m_errMSSGE = arg; }
	public void seterrCUST_CD(String arg) { m_errCUST_CD = arg; }
	public void seterrCUST_ITEM_CD(String arg) { m_errCUST_ITEM_CD = arg; }
	public void seterrITEM_CD(String arg) { m_errITEM_CD = arg; }
	public void seterrCUST_ODR_NO(String arg) { m_errCUST_ODR_NO = arg; }
	public void seterrCUST_CHRG_PSN_CD(String arg) { m_errCUST_CHRG_PSN_CD = arg; }
	public void seterrERR_REC_TYPE(String arg) { m_errERR_REC_TYPE = arg; }
	public void seterrACTUAL_UNIT_PRICE(Double arg) { m_errACTUAL_UNIT_PRICE = arg; }
	public void seterrMASTER_UNIT_PRICE(Double arg) { m_errMASTER_UNIT_PRICE = arg; }
	public void seterrQTY(Double arg) { m_errQTY = arg; }
	public void seterrODR_NO(String arg) { m_errODR_NO = arg; }
	public void seterrDESINATED_DLV_DATE(String arg) { m_errDESINATED_DLV_DATE = arg; }
	public void seterrSLIP_NO(String arg) { m_errSLIP_NO = arg; }
	public void seterrIF_CTL_NO(Double arg) { m_errIF_CTL_NO = arg; }
	public void seterrPROC_TYP(String arg) { m_errPROC_TYP = arg; }
	public void seterrODR_SEQ(Double arg) { m_errODR_SEQ = arg; }
	public void setnijCUST_CD(String arg) { m_nijCUST_CD = arg; }
	public void setnijODR_CTL_NO(String arg) { m_nijODR_CTL_NO = arg; }
	public void setnijDESINATED_DLV_DATE(String arg) { m_nijDESINATED_DLV_DATE = arg; }
	public void setnijCURRNCY_CD(String arg) { m_nijCURRNCY_CD = arg; }
	public void setnijODR_UNIT_PRICE(Double arg) { m_nijODR_UNIT_PRICE = arg; }
	public void setnijODR_TYP(String arg) { m_nijODR_TYP = arg; }
	public void setnijCUST_ITEM_CD(String arg) { m_nijCUST_ITEM_CD = arg; }
	public void setsysCODE(String arg) { m_sysCODE = arg; }
	public void setsysCLASS_CODE(String arg) { m_sysCLASS_CODE = arg; }
	public void setsysHomeCurCd(String arg) { m_sysHomeCurCd = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity gettbl_T_ODR() { return m_entity0; }
	public void settbl_T_ODR(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity gettbl_T_ODR_CTL() { return m_entity1; }
	public void settbl_T_ODR_CTL(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity gettbl_T_ODR_ACPT_RSLT() { return m_entity2; }
	public void settbl_T_ODR_ACPT_RSLT(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity gettbl_T_ANS_DLV_DATE() { return m_entity3; }
	public void settbl_T_ANS_DLV_DATE(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity gettbl_T_ALLOC_FIXED_ODR_RSLT() { return m_entity4; }
	public void settbl_T_ALLOC_FIXED_ODR_RSLT(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity gettbl_M_CUST() { return m_entity5; }
	public void settbl_M_CUST(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity gettbl_M_CUR() { return m_entity6; }
	public void settbl_M_CUR(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity gettbl_M_CUST_BASE() { return m_entity7; }
	public void settbl_M_CUST_BASE(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity gettbl_M_ITEM() { return m_entity8; }
	public void settbl_M_ITEM(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity gettbl_M_ITEM_SPEC() { return m_entity9; }
	public void settbl_M_ITEM_SPEC(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity gettbl_M_UNIT_COST() { return m_entity10; }
	public void settbl_M_UNIT_COST(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getgetUserInfo() { return m_entity11; }
	public void setgetUserInfo(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getgetGyomuDate() { return m_entity12; }
	public void setgetGyomuDate(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getgetSEQ_ODR() { return m_entity13; }
	public void setgetSEQ_ODR(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getgetSEQ_ODR_CTL() { return m_entity14; }
	public void setgetSEQ_ODR_CTL(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public AbstractBatchAppEntity getgetSEQ_RSLT_ODR() { return m_entity15; }
	public void setgetSEQ_RSLT_ODR(AbstractBatchAppEntity obj) { m_entity15 = obj; }
	public AbstractBatchAppEntity getgetCompanyInfo() { return m_entity16; }
	public void setgetCompanyInfo(AbstractBatchAppEntity obj) { m_entity16 = obj; }
	public AbstractBatchAppEntity getnaiji_T_ODR() { return m_entity17; }
	public void setnaiji_T_ODR(AbstractBatchAppEntity obj) { m_entity17 = obj; }
	public AbstractBatchAppEntity getINDATA() { return m_entity18; }
	public void setINDATA(AbstractBatchAppEntity obj) { m_entity18 = obj; }
	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity19; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity19 = obj; }
	public AbstractBatchAppEntity getwriteErrWngLst() { return m_entity20; }
	public void setwriteErrWngLst(AbstractBatchAppEntity obj) { m_entity20 = obj; }
	public AbstractBatchAppEntity getgetSEQ_ERR_WNG_LST() { return m_entity21; }
	public void setgetSEQ_ERR_WNG_LST(AbstractBatchAppEntity obj) { m_entity21 = obj; }
	public AbstractBatchAppEntity gettbl_M_CUST_BASE_check() { return m_entity22; }
	public void settbl_M_CUST_BASE_check(AbstractBatchAppEntity obj) { m_entity22 = obj; }
	public AbstractBatchAppEntity getnaiji_T_ODR_hinban() { return m_entity23; }
	public void setnaiji_T_ODR_hinban(AbstractBatchAppEntity obj) { m_entity23 = obj; }
	public AbstractBatchAppEntity getgetSYS_CLASS_CODE() { return m_entity24; }
	public void setgetSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity24 = obj; }
	public AbstractBatchAppEntity getgetSYS_HOME_CUR() { return m_entity25; }
	public void setgetSYS_HOME_CUR(AbstractBatchAppEntity obj) { m_entity25 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKQ0010B001クラスの標準コンストラクタ
	 *
		 */
	public medKQ0010B001()
	{
		// mediator変数を初期化します
		m_strODR_NO = null;
		m_strODR_TYP = null;
		m_strODR_CTL_NO = null;
		m_strCUST_ODR_NO = null;
		m_strCUST_CHRG_ORG_CD = null;
		m_strCUST_CHRG_PSN_CD = null;
		m_strODR_ACPT_ORG_CD = null;
		m_strODR_ACPT_PSN_CD = null;
		m_strCURRNCY_CD = null;
		m_strDLV_LOC_CD = null;
		m_strDLV_LOC_CD_EIAJ = null;
		m_strDLV_LOC_NAME_KANJI = null;
		m_strODR_UNIT_PRICE = null;
		m_strSPCL_PRICE_TYP = null;
		m_strDESINATED_DLV_DATE = null;
		m_strSTD_DESINATED_RCV_DATE = null;
		m_strODR_QTY = null;
		m_strREMAIN_UNCONFIRM_ODR_QTY = null;
		m_strCANCELED_UNCONFIRM_ODR_QTY = null;
		m_strUNIT_CD = null;
		m_strUNCONFIRM_ODR_BALANCE = null;
		m_strODR_AMOUNT = null;
		m_strODR_AMOUNT_EXCH_RATES = null;
		m_strCUS_DLV_CD = null;
		m_strCUS_DLV_KEY_CD = null;
		m_strPART_NAME = null;
		m_strTRANSPORT_CD = null;
		m_strTAX_APPLY_TYP = null;
		m_strTAX_CD = null;
		m_strTAX_CALC_TYP = null;
		m_strREMARKS = null;
		m_strODR_ACPT_DATE = null;
		m_strPARTIAL_SHIP_INST_FLG = null;
		m_strDEPO_TYP = null;
		m_strEXCH_TYP = null;
		m_strSHIP_PLAN_REMAIN_QTY = null;
		m_strIF_CTL_NO = null;
		m_strTRANSPORT_TYP = null;
		m_strPKG_UNIT = null;
		m_strSLIP_PRICE_PRINT_TYP = null;
		m_strINSPC_TYP = null;
		m_strCLIENT_REMARK = null;
		m_strCLIENT_REMARK_KANJI = null;
		m_strCLIENT_BARCODE_INF = null;
		m_strODR_SEQ = null;
		m_strUNIT_CD_ORG = null;
		m_strPUCH_ODR_QTY_TOTAL = null;
		m_strBUYER_NAME = null;
		m_strBUYER_ORG_CD = null;
		m_strCOCK_TYP = null;
		m_strCUST_CD = null;
		m_strCUST_ITEM_CD = null;
		m_strITEM_CD = null;
		m_strCUST_ITEM_NAME = null;
		m_strITEM_NAME = null;
		m_strRSLT_CTL_SEQ_CD = null;
		m_strUNIT = null;
		m_strDLV_PLACE_CD = null;
		m_strUNIT_PRICE = null;
		m_strCUR_CD = null;
		m_strSPCL_PRICE_CO = null;
		m_strCUST_DLV_CD = null;
		m_strCUST_DLV_KEY_CD = null;
		m_strDESINATED_SHIP_DATE = null;
		m_strDESINATED_SHIP_QTY = null;
		m_strREST_SHIP_ODR_QTY = null;
		m_strLAST_ANS_DLV_DATE_RCD = null;
		m_hisFIXED_ODR_NO = null;
		m_hisALCTED_SEQ_CD = null;
		m_hisALCTED_UNCONFIRM_ODR_NO = null;
		m_hisALCTED_UNCONFIRM_ODR_QTY = null;
		m_strCUST_ANAME = null;
		m_strCOMPANY_CD = null;
		m_strOWN_ORG_CD = null;
		m_strOWN_PERSON_CD = null;
		m_strUNCONFIRM_ODR_EFF_PRIOD = null;
		m_strUNCONFIRM_ODR_EFF_TERM_FLG = null;
		m_strROUND_TYP = null;
		m_strTRANSPORT_LT = null;
		m_strCAL_NO = null;
		m_strDLV_LOC_NAME = null;
		m_strDEPO_WH_CD = null;
		m_strSHIP_WH_CD = null;
		m_strSHIP_PLANT_CD = null;
		m_strSTOCK_UNIT = null;
		m_strUNIT_QTY_TYP = null;
		m_strsTAX_CD = null;
		m_strEFF_PHASE_IN_DATE = null;
		m_strUSER_NAME = null;
		m_strSECTION_CD = null;
		m_strORG_CD = null;
		m_strORG_NAME = null;
		m_strORG_ANAME = null;
		m_strUSER_CD = null;
		m_strBUSINESS_OPR_DATE = null;
		m_strPLANT_CD = null;
		m_nijREMAIN_UNCONFIRM_ODR_QTY = null;
		m_nijUNCONFIRM_ODR_BALANCE = null;
		m_nijODR_NO = null;
		m_g_ODR_INFO_COM_IF_CTRL_NO = null;
		m_g_ODR_SEQ = null;
		m_g_ODR_TYP = null;
		m_g_IF_TYP = null;
		m_g_INFO_TYP_CD = null;
		m_g_CUST_ODR_NO = null;
		m_g_ODR_ACPT_DATE = null;
		m_g_CUST_CD = null;
		m_g_CUST_ITEM_CD = null;
		m_g_PART_NAME = null;
		m_g_PROC_TYP = null;
		m_g_COCK_TYP = null;
		m_g_UNIT_CD = null;
		m_g_UNIT_COST = null;
		m_g_UNIT_COST_TYP = null;
		m_g_DESINATED_DLV_DATE = null;
		m_g_PUCH_ODR_QTY = null;
		m_g_PKG_UNIT = null;
		m_g_INSPC_TYP = null;
		m_g_DLV_LOC_CD = null;
		m_g_DLV_LOC_CD_EIAJ = null;
		m_g_DLV_LOC_NAME_KANJI = null;
		m_g_CUS_DLV_CD = null;
		m_g_CUS_DLV_KEY_CD = null;
		m_g_FREE_REMARK = null;
		m_g_REMARK = null;
		m_g_CLIENT_BARCODE_INF = null;
		m_g_CLIENT_REMARK = null;
		m_g_CLIENT_REMARK_KANJI = null;
		m_g_SLIP_PRICE_PRINT_TYP = null;
		m_g_CUR_CD = null;
		m_g_OLD_ITEM_ODR_ACPT_F = null;
		m_g_FORCED_ERR_ITEM_ODR_ACPT_F = null;
		m_g_BUYER_NAME = null;
		m_g_PUCH_ODR_QTY_TOTAL = null;
		m_g_UNIT_CD_ORG = null;
		m_g_BUYER_ORG_CD = null;
		m_g_SYSTEM_PROC_TYP = null;
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_errCTL_SEQ_NO = null;
		m_errSTATUS = null;
		m_errMSSGE_CD = null;
		m_errMSSGE = null;
		m_errCUST_CD = null;
		m_errCUST_ITEM_CD = null;
		m_errITEM_CD = null;
		m_errCUST_ODR_NO = null;
		m_errCUST_CHRG_PSN_CD = null;
		m_errERR_REC_TYPE = null;
		m_errACTUAL_UNIT_PRICE = null;
		m_errMASTER_UNIT_PRICE = null;
		m_errQTY = null;
		m_errODR_NO = null;
		m_errDESINATED_DLV_DATE = null;
		m_errSLIP_NO = null;
		m_errIF_CTL_NO = null;
		m_errPROC_TYP = null;
		m_errODR_SEQ = null;
		m_nijCUST_CD = null;
		m_nijODR_CTL_NO = null;
		m_nijDESINATED_DLV_DATE = null;
		m_nijCURRNCY_CD = null;
		m_nijODR_UNIT_PRICE = null;
		m_nijODR_TYP = null;
		m_nijCUST_ITEM_CD = null;
		m_sysCODE = null;
		m_sysCLASS_CODE = null;
		m_sysHomeCurCd = null;

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
