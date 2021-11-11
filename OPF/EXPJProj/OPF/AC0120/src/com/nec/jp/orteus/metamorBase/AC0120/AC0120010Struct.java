/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/src/com/nec/jp/orteus/metamorBase/AC0120/AC0120010Struct.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 * EXPJ    (2004/04/01),setStructメソッドの個別メンバのみ版setStructMと、リストメンバのみ版setStructLを追加。
 *                      initializeでのデータセットは、clearを呼んでから行うように修正。
 * EXPJ    (2004/03/31),初期値のコメントアウトのバグを修正。
 * EXPJ    (2004/03/20),レビュー結果を反映。
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 *                      初期生成時に初期値をnullで作成。
 *                      初期化メソッドinitialize、データセットメソッドsetStruct追加。
 *                      コンストラクタのユーザ記述部にinitializeメソッド呼出追加。
 *                      initialize()メソッド、setStruct()メソッド追加。
 * 4.1.0.0 (2003/07/16),setL2L_xxxメソッド追加
 * 4.0.0.1 (2003/06/05),javadocコメントエラー修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.0.0 (2003/03/19),Time,Timestamp型対応
 * 2.1.0.0 (2002/12/17),Logging package修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AC0120;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AC0120010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.18 $ $Date: 2014/12/31 02:48:29 $
 *
 */
//}}user_implement_code_header

public class AC0120010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_InitLevel */
	public String m_InitLevel = null;
	/** 第 2 変数： m_id */
	public String m_id = null;
	/** 第 3 変数： m_lvl */
	public String m_lvl = null;
	/** 第 4 変数： m_parent */
	public String m_parent = null;
	/** 第 5 変数： m_label */
	public String m_label = null;
	/** 第 6 変数： m_ctx */
	public String m_ctx = null;
	/** 第 7 変数： m_maxid */
	public String m_maxid = null;
	/** 第 8 変数： m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** 第 9 変数： m_UNIT_QTY_TYP_DN */
	public String m_UNIT_QTY_TYP_DN = null;
	/** 第 10 変数： m_ODR_STS_TYP_DN */
	public String m_ODR_STS_TYP_DN = null;
	/** 第 11 変数： m_DM_STS_TYP_DN */
	public String m_DM_STS_TYP_DN = null;
	/** 第 12 変数： m_OD_TYP_DN */
	public String m_OD_TYP_DN = null;
	/** 第 13 変数： m_Sub1_OUTSIDE_TYP_name */
	public String m_Sub1_OUTSIDE_TYP_name = null;
	/** 第 14 変数： m_Sub1_OUTSIDE_TYP_val */
	public String m_Sub1_OUTSIDE_TYP_val = null;
	/** 第 15 変数： m_Sub1_MRP_ODR_TYP_DN */
	public String m_Sub1_MRP_ODR_TYP_DN = null;
	/** 第 16 変数： m_Sub1_UNIT_QTY_TYP_DN */
	public String m_Sub1_UNIT_QTY_TYP_DN = null;
	/** 第 17 変数： m_AC0120010tree1 */
	public String m_AC0120010tree1 = null;
	/** 第 18 変数： m_c_JOB_ODR_DEL */
	public String m_c_JOB_ODR_DEL = null;
	/** 第 19 変数： m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** 第 20 変数： m_OD_GNR_TYP_DN */
	public String m_OD_GNR_TYP_DN = null;
	/** 第 21 変数： m_Sub1_DUE_TIME */
	public String m_Sub1_DUE_TIME = null;
	/** 第 22 変数： m_Sub1_DUE_TIME2 */
	public String m_Sub1_DUE_TIME2 = null;
	/** 第 23 変数： m_Sub1_DUE_TIME3 */
	public String m_Sub1_DUE_TIME3 = null;
	/** 第 24 変数： m_Sub1_PRD_DUE_TIME */
	public String m_Sub1_PRD_DUE_TIME = null;
	/** 第 25 変数： m_Sub1_PRD_START_TIME */
	public String m_Sub1_PRD_START_TIME = null;
	/** 第 26 変数： m_Sub1_ODR_START_TIME */
	public String m_Sub1_ODR_START_TIME = null;
	/** 第 27 変数： m_MANHOUR_TYP_DN */
	public String m_MANHOUR_TYP_DN = null;
	/** 第 28 変数： m_OPR_RSLT_TYP_DN */
	public String m_OPR_RSLT_TYP_DN = null;
	/** 第 29 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 30 変数： m_JOB_ODR_STS_TYP1 */
	public String m_JOB_ODR_STS_TYP1 = null;
	/** 第 31 変数： m_h_DM_STS_TYP */
	public String m_h_DM_STS_TYP = null;
	/** 第 32 変数： m_h_ODR_STS_TYP */
	public String m_h_ODR_STS_TYP = null;
	/** 第 33 変数： m_h_size */
	public String m_h_size = null;
	/** 第 34 変数： m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** 第 35 変数： m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** 第 36 変数： m_UNIT_QTY_TYP_name */
	public String m_UNIT_QTY_TYP_name = null;
	/** 第 37 変数： m_UNIT_QTY_TYP_val */
	public String m_UNIT_QTY_TYP_val = null;
	/** 第 38 変数： m_JOB_ODR_TYP_DN */
	public String m_JOB_ODR_TYP_DN = null;
	/** 第 39 変数： m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;
	/** 第 40 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 41 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 42 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 43 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 44 変数： m_OD_TYP */
	public String m_OD_TYP = null;
	/** 第 45 変数： m_ODR_STS_TYP */
	public String m_ODR_STS_TYP = null;
	/** 第 46 変数： m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** 第 47 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 48 変数： m_MRP_TYP */
	public String m_MRP_TYP = null;
	/** 第 49 変数： m_Sub1_OUTSIDE_TYP */
	public String m_Sub1_OUTSIDE_TYP = null;
	/** 第 50 変数： m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** 第 51 変数： m_JOB_ODR_EXP_TYP */
	public String m_JOB_ODR_EXP_TYP = null;
	/** 第 52 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 53 変数： m_MANHOUR_TYP */
	public String m_MANHOUR_TYP = null;
	/** 第 54 変数： m_TOTAL_RCV_QTY */
	public String m_TOTAL_RCV_QTY = null;
	/** 第 55 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 56 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 57 変数： m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** 第 58 変数： m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** 第 59 変数： m_CHIID_OD_NO */
	public String m_CHIID_OD_NO = null;
	/** 第 60 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 61 変数： m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** 第 62 変数： m_Detail_ITEM_NAME */
	public String m_Detail_ITEM_NAME = null;
	/** 第 63 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 64 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 65 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 66 変数： m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** 第 67 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 68 変数： m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** 第 69 変数： m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** 第 70 変数： m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** 第 71 変数： m_PRD_START_DATE */
	public String m_PRD_START_DATE = null;
	/** 第 72 変数： m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** 第 73 変数： m_SUM_PUCH_ODR_QTY */
	public String m_SUM_PUCH_ODR_QTY = null;
	/** 第 74 変数： m_SUM_OPR_INST_QTY */
	public String m_SUM_OPR_INST_QTY = null;
	/** 第 75 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 76 変数： m_DM_QTY */
	public String m_DM_QTY = null;
	/** 第 77 変数： m_SUM_ALCD_QTY */
	public String m_SUM_ALCD_QTY = null;
	/** 第 78 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 79 変数： m_OD_GNR_TYP */
	public String m_OD_GNR_TYP = null;
	/** 第 80 変数： m_OPR_RSLT_TYP */
	public String m_OPR_RSLT_TYP = null;
	/** 第 81 変数： m_Sub1_PARENT_OD_NO */
	public String m_Sub1_PARENT_OD_NO = null;
	/** 第 82 変数： m_Sub1_Parent_ITEM_CD */
	public String m_Sub1_Parent_ITEM_CD = null;
	/** 第 83 変数： m_Sub1_Parent_ITEM_NAME */
	public String m_Sub1_Parent_ITEM_NAME = null;
	/** 第 84 変数： m_h_Sub1_Parent_OD_LEVEL_NO */
	public String m_h_Sub1_Parent_OD_LEVEL_NO = null;
	/** 第 85 変数： m_h_Parent_OD_MODIFY_COUNT */
	public String m_h_Parent_OD_MODIFY_COUNT = null;
	/** 第 86 変数： m_h_Sub1_Parent_ODR_QTY */
	public String m_h_Sub1_Parent_ODR_QTY = null;
	/** 第 87 変数： m_h_Sub1_Parent_ODR_START_DATE */
	public String m_h_Sub1_Parent_ODR_START_DATE = null;
	/** 第 88 変数： m_h_Sub1_Parent_ALC_GRP_CD */
	public String m_h_Sub1_Parent_ALC_GRP_CD = null;
	/** 第 89 変数： m_h_Sub1_ODR_STS_TYP */
	public String m_h_Sub1_ODR_STS_TYP = null;
	/** 第 90 変数： m_h_Sub1_DM_STS_TYP */
	public String m_h_Sub1_DM_STS_TYP = null;
	/** 第 91 変数： m_Sub1_Comp_ITEM_CD */
	public String m_Sub1_Comp_ITEM_CD = null;
	/** 第 92 変数： m_Sub1_Comp_ITEM_NAME */
	public String m_Sub1_Comp_ITEM_NAME = null;
	/** 第 93 変数： m_Sub1_DRAW_CD */
	public String m_Sub1_DRAW_CD = null;
	/** 第 94 変数： m_Sub1_SPEC */
	public String m_Sub1_SPEC = null;
	/** 第 95 変数： m_h_Sub1_MRP_ODR_TYP */
	public String m_h_Sub1_MRP_ODR_TYP = null;
	/** 第 96 変数： m_Sub1_ITEM_SPOIL */
	public String m_Sub1_ITEM_SPOIL = null;
	/** 第 97 変数： m_Sub1_PS_SPOIL */
	public String m_Sub1_PS_SPOIL = null;
	/** 第 98 変数： m_h_Sub1_UNIT_QTY_TYP */
	public String m_h_Sub1_UNIT_QTY_TYP = null;
	/** 第 99 変数： m_Sub1_DUE_DATE */
	public String m_Sub1_DUE_DATE = null;
	/** 第 100 変数： m_Sub1_PRD_DUE_DATE */
	public String m_Sub1_PRD_DUE_DATE = null;
	/** 第 101 変数： m_Sub1_PRD_START_DATE */
	public String m_Sub1_PRD_START_DATE = null;
	/** 第 102 変数： m_Sub1_ODR_START_DATE */
	public String m_Sub1_ODR_START_DATE = null;
	/** 第 103 変数： m_Sub1_ODR_QTY */
	public String m_Sub1_ODR_QTY = null;
	/** 第 104 変数： m_Sub1_DM_QTY */
	public String m_Sub1_DM_QTY = null;
	/** 第 105 変数： m_Sub1_STOCK_UNIT */
	public String m_Sub1_STOCK_UNIT = null;
	/** 第 106 変数： m_Sub1_PS_UNIT_DENOMINATOR */
	public String m_Sub1_PS_UNIT_DENOMINATOR = null;
	/** 第 107 変数： m_Sub1_PS_UNIT_NUMERATOR */
	public String m_Sub1_PS_UNIT_NUMERATOR = null;
	/** 第 108 変数： m_ODR_LT */
	public String m_ODR_LT = null;
	/** 第 109 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 110 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 111 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 112 変数： m_ISSUE_LT */
	public String m_ISSUE_LT = null;
	/** 第 113 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 114 変数： m_h_Comp_ITEM_MODIFY_COUNT */
	public String m_h_Comp_ITEM_MODIFY_COUNT = null;
	/** 第 115 変数： m_Sub1_OD_TYP */
	public String m_Sub1_OD_TYP = null;
	/** 第 116 変数： m_h_Sub1_PS_UNIT_QTY */
	public String m_h_Sub1_PS_UNIT_QTY = null;
	/** 第 117 変数： m_h_Sub1_OD_MODIFY_COUNT */
	public String m_h_Sub1_OD_MODIFY_COUNT = null;
	/** 第 118 変数： m_h_Sub1_MANHOUR_TYP */
	public String m_h_Sub1_MANHOUR_TYP = null;
	/** 第 119 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 120 変数： m_L_Sub1_DUE_DATE */
	public String m_L_Sub1_DUE_DATE = null;
	/** 第 121 変数： m_L_Sub1_ODR_START_DATE */
	public String m_L_Sub1_ODR_START_DATE = null;
	/** 第 122 変数： m_L_Sub1_PRD_DUE_DATE */
	public String m_L_Sub1_PRD_DUE_DATE = null;
	/** 第 123 変数： m_L_Sub1_PRD_START_DATE */
	public String m_L_Sub1_PRD_START_DATE = null;
	/** 第 124 変数： m_Sub1_MRP_ODR_TYP */
	public String m_Sub1_MRP_ODR_TYP = null;
	/** 第 125 変数： m_ISSUE_TYP */
	public String m_ISSUE_TYP = null;
	/** 第 126 変数： m_Sub1_PS_UNIT_QTY */
	public String m_Sub1_PS_UNIT_QTY = null;
	/** 第 127 変数： m_OD_LEVEL_NO */
	public String m_OD_LEVEL_NO = null;
	/** 第 128 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 129 変数： m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** 第 130 変数： m_setDM_QTY */
	public String m_setDM_QTY = null;
	/** 第 131 変数： m_setOUTSIDE_TYP */
	public String m_setOUTSIDE_TYP = null;
	/** 第 132 変数： m_setPS_UNIT_QTY */
	public String m_setPS_UNIT_QTY = null;
	/** 第 133 変数： m_setPS_SPOIL */
	public String m_setPS_SPOIL = null;
	/** 第 134 変数： m_setPS_UNIT_DENOMINATOR */
	public String m_setPS_UNIT_DENOMINATOR = null;
	/** 第 135 変数： m_setPS_UNIT_NUMERATOR */
	public String m_setPS_UNIT_NUMERATOR = null;
	/** 第 136 変数： m_setMRP_TYP */
	public String m_setMRP_TYP = null;
	/** 第 137 変数： m_setITEM_SPOIL */
	public String m_setITEM_SPOIL = null;
	/** 第 138 変数： m_setOD_NO */
	public String m_setOD_NO = null;
	/** 第 139 変数： m_h_Sub1_ISSUE_TYP */
	public String m_h_Sub1_ISSUE_TYP = null;
	/** 第 140 変数： m_CAL_NO */
	public String m_CAL_NO = null;
	/** 第 141 変数： m_ITEM_MODIFY_COUNT */
	public String m_ITEM_MODIFY_COUNT = null;
	/** 第 142 変数： m_OD_MODIFY_COUNT */
	public String m_OD_MODIFY_COUNT = null;
	/** 第 143 変数： m_PROC_CD */
	public String m_PROC_CD = null;
	/** 第 144 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 145 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 146 変数： m_setDUE_DATE */
	public String m_setDUE_DATE = null;
	/** 第 147 変数： m_setPRD_DUE_DATE */
	public String m_setPRD_DUE_DATE = null;
	/** 第 148 変数： m_setPRD_START_DATE */
	public String m_setPRD_START_DATE = null;
	/** 第 149 変数： m_setODR_START_DATE */
	public String m_setODR_START_DATE = null;
	/** 第 150 変数： m_setODR_QTY */
	public String m_setODR_QTY = null;
	/** 第 151 変数： m_setOD_TYP */
	public String m_setOD_TYP = null;
	/** 第 152 変数： m_setODR_STS_TYP */
	public String m_setODR_STS_TYP = null;
	/** 第 153 変数： m_MIN_CAL_DATE */
	public String m_MIN_CAL_DATE = null;
	/** 第 154 変数： m_MAX_CAL_DATE */
	public String m_MAX_CAL_DATE = null;
	/** 第 155 変数： m_OD_CALC_FLG */
	public String m_OD_CALC_FLG = null;
	/** 第 156 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 157 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 158 変数： m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** 第 159 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 160 変数： m_PROC_EXPLOSION_FLG */
	public String m_PROC_EXPLOSION_FLG = null;
	/** 第 161 変数： m_Sub1_PUCH_ODR_CD */
	public String m_Sub1_PUCH_ODR_CD = null;
	/** 第 162 変数： m_Sub1_COMPANY_CD */
	public String m_Sub1_COMPANY_CD = null;
	/** 第 163 変数： m_Sub1_VEND_CD */
	public String m_Sub1_VEND_CD = null;
	/** 第 164 変数： m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** 第 165 変数： m_COUNT */
	public String m_COUNT = null;
	/** 第 166 変数： m_FINAL_PROC_FLG */
	public String m_FINAL_PROC_FLG = null;
	/** 第 167 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 168 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 169 変数： m_TOTAL_ACPT_QTY */
	public String m_TOTAL_ACPT_QTY = null;
	/** 第 170 変数： m_TOTAL_DEFECT_QTY */
	public String m_TOTAL_DEFECT_QTY = null;
	/** 第 171 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 172 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 173 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 174 変数： m_Sub1_WORK_IN_PROC_CD */
	public String m_Sub1_WORK_IN_PROC_CD = null;
	/** 第 175 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 176 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 177 変数： m_ONEROUS_FLG */
	public String m_ONEROUS_FLG = null;
	/** 第 178 変数： m_SysPLANT_CD */
	public String m_SysPLANT_CD = null;
	/** 第 179 変数： m_VALUE */
	public String m_VALUE = null;
	/** 第 180 変数： m_NAME */
	public String m_NAME = null;
	/** 第 181 変数： m_MY_COMPANY */
	public String m_MY_COMPANY = null;
	/** 第 182 変数： m_PVEND_CD */
	public String m_PVEND_CD = null;
	/** 第 183 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 184 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 185 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 186 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 187 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 188 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 189 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 190 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 191 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 192 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 193 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 194 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 195 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 196 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 197 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 198 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 199 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 200 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 201 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 202 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 203 変数： m_WH_CD1 */
	public String m_WH_CD1 = null;
	/** 第 204 変数： m_WH_CD2 */
	public String m_WH_CD2 = null;
	/** 第 205 変数： m_WH_CD3 */
	public String m_WH_CD3 = null;
	/** 第 206 変数： m_OWN_PERSON_NAME */
	public String m_OWN_PERSON_NAME = null;
	/** 第 207 変数： m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** 第 208 変数： m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** 第 209 変数： m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** 第 210 変数： m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** 第 211 変数： m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** 第 212 変数： m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** 第 213 変数： m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** 第 214 変数： m_PVC2TAXID */
	public String m_PVC2TAXID = null;
	/** 第 215 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 216 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 217 変数： m_PNUMTAXOUTAMOUNT */
	public String m_PNUMTAXOUTAMOUNT = null;
	/** 第 218 変数： m_PNUMTAXAMOUNT */
	public String m_PNUMTAXAMOUNT = null;
	/** 第 219 変数： m_PNUMEXTERNALTAXSALESAMOUNT */
	public String m_PNUMEXTERNALTAXSALESAMOUNT = null;
	/** 第 220 変数： m_PNUMINTERNALTAXSALESAMOUNT */
	public String m_PNUMINTERNALTAXSALESAMOUNT = null;
	/** 第 221 変数： m_PNUMTAXFREESALESAMOUNT */
	public String m_PNUMTAXFREESALESAMOUNT = null;
	/** 第 222 変数： m_PNUMEXTERNALTAXAMOUNT */
	public String m_PNUMEXTERNALTAXAMOUNT = null;
	/** 第 223 変数： m_PNUMINTERNALTAXAMOUNT */
	public String m_PNUMINTERNALTAXAMOUNT = null;
	/** 第 224 変数： m_PVC2ERRCD */
	public String m_PVC2ERRCD = null;
	/** 第 225 変数： m_PNUMSTATUS */
	public String m_PNUMSTATUS = null;
	/** 第 226 変数： m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** 第 227 変数： m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** 第 228 変数： m_PARENT_DRAW_CD */
	public String m_PARENT_DRAW_CD = null;
	/** 第 229 変数： m_PARENT_SPEC */
	public String m_PARENT_SPEC = null;
	/** 第 230 変数： m_PARENT_OUTSIDE_TYP */
	public String m_PARENT_OUTSIDE_TYP = null;
	/** 第 231 変数： m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** 第 232 変数： m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** 第 233 変数： m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** 第 234 変数： m_PS_SPOIL */
	public String m_PS_SPOIL = null;
	/** 第 235 変数： m_PS_LT_FLG */
	public String m_PS_LT_FLG = null;
	/** 第 236 変数： m_PS_KEY */
	public String m_PS_KEY = null;
	/** 第 237 変数： m_CHILD_ITEM_NAME */
	public String m_CHILD_ITEM_NAME = null;
	/** 第 238 変数： m_CHILD_DRAW_CD */
	public String m_CHILD_DRAW_CD = null;
	/** 第 239 変数： m_CHILD_SPEC */
	public String m_CHILD_SPEC = null;
	/** 第 240 変数： m_CHILD_OUTSIDE_TYP */
	public String m_CHILD_OUTSIDE_TYP = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_InitLevel */
	public List l_InitLevel = null;

	/** 第 2 List変数： l_id */
	public List l_id = null;

	/** 第 3 List変数： l_lvl */
	public List l_lvl = null;

	/** 第 4 List変数： l_parent */
	public List l_parent = null;

	/** 第 5 List変数： l_label */
	public List l_label = null;

	/** 第 6 List変数： l_ctx */
	public List l_ctx = null;

	/** 第 7 List変数： l_maxid */
	public List l_maxid = null;

	/** 第 8 List変数： l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** 第 9 List変数： l_UNIT_QTY_TYP_DN */
	public List l_UNIT_QTY_TYP_DN = null;

	/** 第 10 List変数： l_ODR_STS_TYP_DN */
	public List l_ODR_STS_TYP_DN = null;

	/** 第 11 List変数： l_DM_STS_TYP_DN */
	public List l_DM_STS_TYP_DN = null;

	/** 第 12 List変数： l_OD_TYP_DN */
	public List l_OD_TYP_DN = null;

	/** 第 13 List変数： l_Sub1_OUTSIDE_TYP_name */
	public List l_Sub1_OUTSIDE_TYP_name = null;

	/** 第 14 List変数： l_Sub1_OUTSIDE_TYP_val */
	public List l_Sub1_OUTSIDE_TYP_val = null;

	/** 第 15 List変数： l_Sub1_MRP_ODR_TYP_DN */
	public List l_Sub1_MRP_ODR_TYP_DN = null;

	/** 第 16 List変数： l_Sub1_UNIT_QTY_TYP_DN */
	public List l_Sub1_UNIT_QTY_TYP_DN = null;

	/** 第 17 List変数： l_AC0120010tree1 */
	public List l_AC0120010tree1 = null;

	/** 第 18 List変数： l_c_JOB_ODR_DEL */
	public List l_c_JOB_ODR_DEL = null;

	/** 第 19 List変数： l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** 第 20 List変数： l_OD_GNR_TYP_DN */
	public List l_OD_GNR_TYP_DN = null;

	/** 第 21 List変数： l_Sub1_DUE_TIME */
	public List l_Sub1_DUE_TIME = null;

	/** 第 22 List変数： l_Sub1_DUE_TIME2 */
	public List l_Sub1_DUE_TIME2 = null;

	/** 第 23 List変数： l_Sub1_DUE_TIME3 */
	public List l_Sub1_DUE_TIME3 = null;

	/** 第 24 List変数： l_Sub1_PRD_DUE_TIME */
	public List l_Sub1_PRD_DUE_TIME = null;

	/** 第 25 List変数： l_Sub1_PRD_START_TIME */
	public List l_Sub1_PRD_START_TIME = null;

	/** 第 26 List変数： l_Sub1_ODR_START_TIME */
	public List l_Sub1_ODR_START_TIME = null;

	/** 第 27 List変数： l_MANHOUR_TYP_DN */
	public List l_MANHOUR_TYP_DN = null;

	/** 第 28 List変数： l_OPR_RSLT_TYP_DN */
	public List l_OPR_RSLT_TYP_DN = null;

	/** 第 29 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 30 List変数： l_JOB_ODR_STS_TYP1 */
	public List l_JOB_ODR_STS_TYP1 = null;

	/** 第 31 List変数： l_h_DM_STS_TYP */
	public List l_h_DM_STS_TYP = null;

	/** 第 32 List変数： l_h_ODR_STS_TYP */
	public List l_h_ODR_STS_TYP = null;

	/** 第 33 List変数： l_h_size */
	public List l_h_size = null;

	/** 第 34 List変数： l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** 第 35 List変数： l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** 第 36 List変数： l_UNIT_QTY_TYP_name */
	public List l_UNIT_QTY_TYP_name = null;

	/** 第 37 List変数： l_UNIT_QTY_TYP_val */
	public List l_UNIT_QTY_TYP_val = null;

	/** 第 38 List変数： l_JOB_ODR_TYP_DN */
	public List l_JOB_ODR_TYP_DN = null;

	/** 第 39 List変数： l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;

	/** 第 40 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 41 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 42 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 43 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 44 List変数： l_OD_TYP */
	public List l_OD_TYP = null;

	/** 第 45 List変数： l_ODR_STS_TYP */
	public List l_ODR_STS_TYP = null;

	/** 第 46 List変数： l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** 第 47 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 48 List変数： l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** 第 49 List変数： l_Sub1_OUTSIDE_TYP */
	public List l_Sub1_OUTSIDE_TYP = null;

	/** 第 50 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 51 List変数： l_JOB_ODR_EXP_TYP */
	public List l_JOB_ODR_EXP_TYP = null;

	/** 第 52 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 53 List変数： l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** 第 54 List変数： l_TOTAL_RCV_QTY */
	public List l_TOTAL_RCV_QTY = null;

	/** 第 55 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 56 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 57 List変数： l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** 第 58 List変数： l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** 第 59 List変数： l_CHIID_OD_NO */
	public List l_CHIID_OD_NO = null;

	/** 第 60 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 61 List変数： l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** 第 62 List変数： l_Detail_ITEM_NAME */
	public List l_Detail_ITEM_NAME = null;

	/** 第 63 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 64 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 65 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 66 List変数： l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** 第 67 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 68 List変数： l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** 第 69 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 70 List変数： l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** 第 71 List変数： l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** 第 72 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 73 List変数： l_SUM_PUCH_ODR_QTY */
	public List l_SUM_PUCH_ODR_QTY = null;

	/** 第 74 List変数： l_SUM_OPR_INST_QTY */
	public List l_SUM_OPR_INST_QTY = null;

	/** 第 75 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 76 List変数： l_DM_QTY */
	public List l_DM_QTY = null;

	/** 第 77 List変数： l_SUM_ALCD_QTY */
	public List l_SUM_ALCD_QTY = null;

	/** 第 78 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 79 List変数： l_OD_GNR_TYP */
	public List l_OD_GNR_TYP = null;

	/** 第 80 List変数： l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** 第 81 List変数： l_Sub1_PARENT_OD_NO */
	public List l_Sub1_PARENT_OD_NO = null;

	/** 第 82 List変数： l_Sub1_Parent_ITEM_CD */
	public List l_Sub1_Parent_ITEM_CD = null;

	/** 第 83 List変数： l_Sub1_Parent_ITEM_NAME */
	public List l_Sub1_Parent_ITEM_NAME = null;

	/** 第 84 List変数： l_h_Sub1_Parent_OD_LEVEL_NO */
	public List l_h_Sub1_Parent_OD_LEVEL_NO = null;

	/** 第 85 List変数： l_h_Parent_OD_MODIFY_COUNT */
	public List l_h_Parent_OD_MODIFY_COUNT = null;

	/** 第 86 List変数： l_h_Sub1_Parent_ODR_QTY */
	public List l_h_Sub1_Parent_ODR_QTY = null;

	/** 第 87 List変数： l_h_Sub1_Parent_ODR_START_DATE */
	public List l_h_Sub1_Parent_ODR_START_DATE = null;

	/** 第 88 List変数： l_h_Sub1_Parent_ALC_GRP_CD */
	public List l_h_Sub1_Parent_ALC_GRP_CD = null;

	/** 第 89 List変数： l_h_Sub1_ODR_STS_TYP */
	public List l_h_Sub1_ODR_STS_TYP = null;

	/** 第 90 List変数： l_h_Sub1_DM_STS_TYP */
	public List l_h_Sub1_DM_STS_TYP = null;

	/** 第 91 List変数： l_Sub1_Comp_ITEM_CD */
	public List l_Sub1_Comp_ITEM_CD = null;

	/** 第 92 List変数： l_Sub1_Comp_ITEM_NAME */
	public List l_Sub1_Comp_ITEM_NAME = null;

	/** 第 93 List変数： l_Sub1_DRAW_CD */
	public List l_Sub1_DRAW_CD = null;

	/** 第 94 List変数： l_Sub1_SPEC */
	public List l_Sub1_SPEC = null;

	/** 第 95 List変数： l_h_Sub1_MRP_ODR_TYP */
	public List l_h_Sub1_MRP_ODR_TYP = null;

	/** 第 96 List変数： l_Sub1_ITEM_SPOIL */
	public List l_Sub1_ITEM_SPOIL = null;

	/** 第 97 List変数： l_Sub1_PS_SPOIL */
	public List l_Sub1_PS_SPOIL = null;

	/** 第 98 List変数： l_h_Sub1_UNIT_QTY_TYP */
	public List l_h_Sub1_UNIT_QTY_TYP = null;

	/** 第 99 List変数： l_Sub1_DUE_DATE */
	public List l_Sub1_DUE_DATE = null;

	/** 第 100 List変数： l_Sub1_PRD_DUE_DATE */
	public List l_Sub1_PRD_DUE_DATE = null;

	/** 第 101 List変数： l_Sub1_PRD_START_DATE */
	public List l_Sub1_PRD_START_DATE = null;

	/** 第 102 List変数： l_Sub1_ODR_START_DATE */
	public List l_Sub1_ODR_START_DATE = null;

	/** 第 103 List変数： l_Sub1_ODR_QTY */
	public List l_Sub1_ODR_QTY = null;

	/** 第 104 List変数： l_Sub1_DM_QTY */
	public List l_Sub1_DM_QTY = null;

	/** 第 105 List変数： l_Sub1_STOCK_UNIT */
	public List l_Sub1_STOCK_UNIT = null;

	/** 第 106 List変数： l_Sub1_PS_UNIT_DENOMINATOR */
	public List l_Sub1_PS_UNIT_DENOMINATOR = null;

	/** 第 107 List変数： l_Sub1_PS_UNIT_NUMERATOR */
	public List l_Sub1_PS_UNIT_NUMERATOR = null;

	/** 第 108 List変数： l_ODR_LT */
	public List l_ODR_LT = null;

	/** 第 109 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 110 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 111 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 112 List変数： l_ISSUE_LT */
	public List l_ISSUE_LT = null;

	/** 第 113 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 114 List変数： l_h_Comp_ITEM_MODIFY_COUNT */
	public List l_h_Comp_ITEM_MODIFY_COUNT = null;

	/** 第 115 List変数： l_Sub1_OD_TYP */
	public List l_Sub1_OD_TYP = null;

	/** 第 116 List変数： l_h_Sub1_PS_UNIT_QTY */
	public List l_h_Sub1_PS_UNIT_QTY = null;

	/** 第 117 List変数： l_h_Sub1_OD_MODIFY_COUNT */
	public List l_h_Sub1_OD_MODIFY_COUNT = null;

	/** 第 118 List変数： l_h_Sub1_MANHOUR_TYP */
	public List l_h_Sub1_MANHOUR_TYP = null;

	/** 第 119 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 120 List変数： l_L_Sub1_DUE_DATE */
	public List l_L_Sub1_DUE_DATE = null;

	/** 第 121 List変数： l_L_Sub1_ODR_START_DATE */
	public List l_L_Sub1_ODR_START_DATE = null;

	/** 第 122 List変数： l_L_Sub1_PRD_DUE_DATE */
	public List l_L_Sub1_PRD_DUE_DATE = null;

	/** 第 123 List変数： l_L_Sub1_PRD_START_DATE */
	public List l_L_Sub1_PRD_START_DATE = null;

	/** 第 124 List変数： l_Sub1_MRP_ODR_TYP */
	public List l_Sub1_MRP_ODR_TYP = null;

	/** 第 125 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 126 List変数： l_Sub1_PS_UNIT_QTY */
	public List l_Sub1_PS_UNIT_QTY = null;

	/** 第 127 List変数： l_OD_LEVEL_NO */
	public List l_OD_LEVEL_NO = null;

	/** 第 128 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 129 List変数： l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** 第 130 List変数： l_setDM_QTY */
	public List l_setDM_QTY = null;

	/** 第 131 List変数： l_setOUTSIDE_TYP */
	public List l_setOUTSIDE_TYP = null;

	/** 第 132 List変数： l_setPS_UNIT_QTY */
	public List l_setPS_UNIT_QTY = null;

	/** 第 133 List変数： l_setPS_SPOIL */
	public List l_setPS_SPOIL = null;

	/** 第 134 List変数： l_setPS_UNIT_DENOMINATOR */
	public List l_setPS_UNIT_DENOMINATOR = null;

	/** 第 135 List変数： l_setPS_UNIT_NUMERATOR */
	public List l_setPS_UNIT_NUMERATOR = null;

	/** 第 136 List変数： l_setMRP_TYP */
	public List l_setMRP_TYP = null;

	/** 第 137 List変数： l_setITEM_SPOIL */
	public List l_setITEM_SPOIL = null;

	/** 第 138 List変数： l_setOD_NO */
	public List l_setOD_NO = null;

	/** 第 139 List変数： l_h_Sub1_ISSUE_TYP */
	public List l_h_Sub1_ISSUE_TYP = null;

	/** 第 140 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 141 List変数： l_ITEM_MODIFY_COUNT */
	public List l_ITEM_MODIFY_COUNT = null;

	/** 第 142 List変数： l_OD_MODIFY_COUNT */
	public List l_OD_MODIFY_COUNT = null;

	/** 第 143 List変数： l_PROC_CD */
	public List l_PROC_CD = null;

	/** 第 144 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 145 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 146 List変数： l_setDUE_DATE */
	public List l_setDUE_DATE = null;

	/** 第 147 List変数： l_setPRD_DUE_DATE */
	public List l_setPRD_DUE_DATE = null;

	/** 第 148 List変数： l_setPRD_START_DATE */
	public List l_setPRD_START_DATE = null;

	/** 第 149 List変数： l_setODR_START_DATE */
	public List l_setODR_START_DATE = null;

	/** 第 150 List変数： l_setODR_QTY */
	public List l_setODR_QTY = null;

	/** 第 151 List変数： l_setOD_TYP */
	public List l_setOD_TYP = null;

	/** 第 152 List変数： l_setODR_STS_TYP */
	public List l_setODR_STS_TYP = null;

	/** 第 153 List変数： l_MIN_CAL_DATE */
	public List l_MIN_CAL_DATE = null;

	/** 第 154 List変数： l_MAX_CAL_DATE */
	public List l_MAX_CAL_DATE = null;

	/** 第 155 List変数： l_OD_CALC_FLG */
	public List l_OD_CALC_FLG = null;

	/** 第 156 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 157 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 158 List変数： l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** 第 159 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 160 List変数： l_PROC_EXPLOSION_FLG */
	public List l_PROC_EXPLOSION_FLG = null;

	/** 第 161 List変数： l_Sub1_PUCH_ODR_CD */
	public List l_Sub1_PUCH_ODR_CD = null;

	/** 第 162 List変数： l_Sub1_COMPANY_CD */
	public List l_Sub1_COMPANY_CD = null;

	/** 第 163 List変数： l_Sub1_VEND_CD */
	public List l_Sub1_VEND_CD = null;

	/** 第 164 List変数： l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** 第 165 List変数： l_COUNT */
	public List l_COUNT = null;

	/** 第 166 List変数： l_FINAL_PROC_FLG */
	public List l_FINAL_PROC_FLG = null;

	/** 第 167 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 168 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 169 List変数： l_TOTAL_ACPT_QTY */
	public List l_TOTAL_ACPT_QTY = null;

	/** 第 170 List変数： l_TOTAL_DEFECT_QTY */
	public List l_TOTAL_DEFECT_QTY = null;

	/** 第 171 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 172 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 173 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 174 List変数： l_Sub1_WORK_IN_PROC_CD */
	public List l_Sub1_WORK_IN_PROC_CD = null;

	/** 第 175 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 176 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 177 List変数： l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** 第 178 List変数： l_SysPLANT_CD */
	public List l_SysPLANT_CD = null;

	/** 第 179 List変数： l_VALUE */
	public List l_VALUE = null;

	/** 第 180 List変数： l_NAME */
	public List l_NAME = null;

	/** 第 181 List変数： l_MY_COMPANY */
	public List l_MY_COMPANY = null;

	/** 第 182 List変数： l_PVEND_CD */
	public List l_PVEND_CD = null;

	/** 第 183 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 184 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 185 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 186 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 187 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 188 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 189 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 190 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 191 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 192 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 193 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 194 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 195 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 196 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 197 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 198 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 199 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 200 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 201 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 202 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 203 List変数： l_WH_CD1 */
	public List l_WH_CD1 = null;

	/** 第 204 List変数： l_WH_CD2 */
	public List l_WH_CD2 = null;

	/** 第 205 List変数： l_WH_CD3 */
	public List l_WH_CD3 = null;

	/** 第 206 List変数： l_OWN_PERSON_NAME */
	public List l_OWN_PERSON_NAME = null;

	/** 第 207 List変数： l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** 第 208 List変数： l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** 第 209 List変数： l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** 第 210 List変数： l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** 第 211 List変数： l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** 第 212 List変数： l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** 第 213 List変数： l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** 第 214 List変数： l_PVC2TAXID */
	public List l_PVC2TAXID = null;

	/** 第 215 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 216 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 217 List変数： l_PNUMTAXOUTAMOUNT */
	public List l_PNUMTAXOUTAMOUNT = null;

	/** 第 218 List変数： l_PNUMTAXAMOUNT */
	public List l_PNUMTAXAMOUNT = null;

	/** 第 219 List変数： l_PNUMEXTERNALTAXSALESAMOUNT */
	public List l_PNUMEXTERNALTAXSALESAMOUNT = null;

	/** 第 220 List変数： l_PNUMINTERNALTAXSALESAMOUNT */
	public List l_PNUMINTERNALTAXSALESAMOUNT = null;

	/** 第 221 List変数： l_PNUMTAXFREESALESAMOUNT */
	public List l_PNUMTAXFREESALESAMOUNT = null;

	/** 第 222 List変数： l_PNUMEXTERNALTAXAMOUNT */
	public List l_PNUMEXTERNALTAXAMOUNT = null;

	/** 第 223 List変数： l_PNUMINTERNALTAXAMOUNT */
	public List l_PNUMINTERNALTAXAMOUNT = null;

	/** 第 224 List変数： l_PVC2ERRCD */
	public List l_PVC2ERRCD = null;

	/** 第 225 List変数： l_PNUMSTATUS */
	public List l_PNUMSTATUS = null;

	/** 第 226 List変数： l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** 第 227 List変数： l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** 第 228 List変数： l_PARENT_DRAW_CD */
	public List l_PARENT_DRAW_CD = null;

	/** 第 229 List変数： l_PARENT_SPEC */
	public List l_PARENT_SPEC = null;

	/** 第 230 List変数： l_PARENT_OUTSIDE_TYP */
	public List l_PARENT_OUTSIDE_TYP = null;

	/** 第 231 List変数： l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** 第 232 List変数： l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** 第 233 List変数： l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** 第 234 List変数： l_PS_SPOIL */
	public List l_PS_SPOIL = null;

	/** 第 235 List変数： l_PS_LT_FLG */
	public List l_PS_LT_FLG = null;

	/** 第 236 List変数： l_PS_KEY */
	public List l_PS_KEY = null;

	/** 第 237 List変数： l_CHILD_ITEM_NAME */
	public List l_CHILD_ITEM_NAME = null;

	/** 第 238 List変数： l_CHILD_DRAW_CD */
	public List l_CHILD_DRAW_CD = null;

	/** 第 239 List変数： l_CHILD_SPEC */
	public List l_CHILD_SPEC = null;

	/** 第 240 List変数： l_CHILD_OUTSIDE_TYP */
	public List l_CHILD_OUTSIDE_TYP = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getInitLevel() { return m_InitLevel; }
	public String getid() { return m_id; }
	public String getlvl() { return m_lvl; }
	public String getparent() { return m_parent; }
	public String getlabel() { return m_label; }
	public String getctx() { return m_ctx; }
	public String getmaxid() { return m_maxid; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getUNIT_QTY_TYP_DN() { return m_UNIT_QTY_TYP_DN; }
	public String getODR_STS_TYP_DN() { return m_ODR_STS_TYP_DN; }
	public String getDM_STS_TYP_DN() { return m_DM_STS_TYP_DN; }
	public String getOD_TYP_DN() { return m_OD_TYP_DN; }
	public String getSub1_OUTSIDE_TYP_name() { return m_Sub1_OUTSIDE_TYP_name; }
	public String getSub1_OUTSIDE_TYP_val() { return m_Sub1_OUTSIDE_TYP_val; }
	public String getSub1_MRP_ODR_TYP_DN() { return m_Sub1_MRP_ODR_TYP_DN; }
	public String getSub1_UNIT_QTY_TYP_DN() { return m_Sub1_UNIT_QTY_TYP_DN; }
	public String getAC0120010tree1() { return m_AC0120010tree1; }
	public String getc_JOB_ODR_DEL() { return m_c_JOB_ODR_DEL; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getOD_GNR_TYP_DN() { return m_OD_GNR_TYP_DN; }
	public String getSub1_DUE_TIME() { return m_Sub1_DUE_TIME; }
	public String getSub1_DUE_TIME2() { return m_Sub1_DUE_TIME2; }
	public String getSub1_DUE_TIME3() { return m_Sub1_DUE_TIME3; }
	public String getSub1_PRD_DUE_TIME() { return m_Sub1_PRD_DUE_TIME; }
	public String getSub1_PRD_START_TIME() { return m_Sub1_PRD_START_TIME; }
	public String getSub1_ODR_START_TIME() { return m_Sub1_ODR_START_TIME; }
	public String getMANHOUR_TYP_DN() { return m_MANHOUR_TYP_DN; }
	public String getOPR_RSLT_TYP_DN() { return m_OPR_RSLT_TYP_DN; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getJOB_ODR_STS_TYP1() { return m_JOB_ODR_STS_TYP1; }
	public String geth_DM_STS_TYP() { return m_h_DM_STS_TYP; }
	public String geth_ODR_STS_TYP() { return m_h_ODR_STS_TYP; }
	public String geth_size() { return m_h_size; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getUNIT_QTY_TYP_name() { return m_UNIT_QTY_TYP_name; }
	public String getUNIT_QTY_TYP_val() { return m_UNIT_QTY_TYP_val; }
	public String getJOB_ODR_TYP_DN() { return m_JOB_ODR_TYP_DN; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getOD_TYP() { return m_OD_TYP; }
	public String getODR_STS_TYP() { return m_ODR_STS_TYP; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getMRP_TYP() { return m_MRP_TYP; }
	public String getSub1_OUTSIDE_TYP() { return m_Sub1_OUTSIDE_TYP; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_EXP_TYP() { return m_JOB_ODR_EXP_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getTOTAL_RCV_QTY() { return m_TOTAL_RCV_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getCHIID_OD_NO() { return m_CHIID_OD_NO; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getDetail_ITEM_NAME() { return m_Detail_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getSUM_PUCH_ODR_QTY() { return m_SUM_PUCH_ODR_QTY; }
	public String getSUM_OPR_INST_QTY() { return m_SUM_OPR_INST_QTY; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getSUM_ALCD_QTY() { return m_SUM_ALCD_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getOD_GNR_TYP() { return m_OD_GNR_TYP; }
	public String getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public String getSub1_PARENT_OD_NO() { return m_Sub1_PARENT_OD_NO; }
	public String getSub1_Parent_ITEM_CD() { return m_Sub1_Parent_ITEM_CD; }
	public String getSub1_Parent_ITEM_NAME() { return m_Sub1_Parent_ITEM_NAME; }
	public String geth_Sub1_Parent_OD_LEVEL_NO() { return m_h_Sub1_Parent_OD_LEVEL_NO; }
	public String geth_Parent_OD_MODIFY_COUNT() { return m_h_Parent_OD_MODIFY_COUNT; }
	public String geth_Sub1_Parent_ODR_QTY() { return m_h_Sub1_Parent_ODR_QTY; }
	public String geth_Sub1_Parent_ODR_START_DATE() { return m_h_Sub1_Parent_ODR_START_DATE; }
	public String geth_Sub1_Parent_ALC_GRP_CD() { return m_h_Sub1_Parent_ALC_GRP_CD; }
	public String geth_Sub1_ODR_STS_TYP() { return m_h_Sub1_ODR_STS_TYP; }
	public String geth_Sub1_DM_STS_TYP() { return m_h_Sub1_DM_STS_TYP; }
	public String getSub1_Comp_ITEM_CD() { return m_Sub1_Comp_ITEM_CD; }
	public String getSub1_Comp_ITEM_NAME() { return m_Sub1_Comp_ITEM_NAME; }
	public String getSub1_DRAW_CD() { return m_Sub1_DRAW_CD; }
	public String getSub1_SPEC() { return m_Sub1_SPEC; }
	public String geth_Sub1_MRP_ODR_TYP() { return m_h_Sub1_MRP_ODR_TYP; }
	public String getSub1_ITEM_SPOIL() { return m_Sub1_ITEM_SPOIL; }
	public String getSub1_PS_SPOIL() { return m_Sub1_PS_SPOIL; }
	public String geth_Sub1_UNIT_QTY_TYP() { return m_h_Sub1_UNIT_QTY_TYP; }
	public String getSub1_DUE_DATE() { return m_Sub1_DUE_DATE; }
	public String getSub1_PRD_DUE_DATE() { return m_Sub1_PRD_DUE_DATE; }
	public String getSub1_PRD_START_DATE() { return m_Sub1_PRD_START_DATE; }
	public String getSub1_ODR_START_DATE() { return m_Sub1_ODR_START_DATE; }
	public String getSub1_ODR_QTY() { return m_Sub1_ODR_QTY; }
	public String getSub1_DM_QTY() { return m_Sub1_DM_QTY; }
	public String getSub1_STOCK_UNIT() { return m_Sub1_STOCK_UNIT; }
	public String getSub1_PS_UNIT_DENOMINATOR() { return m_Sub1_PS_UNIT_DENOMINATOR; }
	public String getSub1_PS_UNIT_NUMERATOR() { return m_Sub1_PS_UNIT_NUMERATOR; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getISSUE_LT() { return m_ISSUE_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String geth_Comp_ITEM_MODIFY_COUNT() { return m_h_Comp_ITEM_MODIFY_COUNT; }
	public String getSub1_OD_TYP() { return m_Sub1_OD_TYP; }
	public String geth_Sub1_PS_UNIT_QTY() { return m_h_Sub1_PS_UNIT_QTY; }
	public String geth_Sub1_OD_MODIFY_COUNT() { return m_h_Sub1_OD_MODIFY_COUNT; }
	public String geth_Sub1_MANHOUR_TYP() { return m_h_Sub1_MANHOUR_TYP; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getL_Sub1_DUE_DATE() { return m_L_Sub1_DUE_DATE; }
	public String getL_Sub1_ODR_START_DATE() { return m_L_Sub1_ODR_START_DATE; }
	public String getL_Sub1_PRD_DUE_DATE() { return m_L_Sub1_PRD_DUE_DATE; }
	public String getL_Sub1_PRD_START_DATE() { return m_L_Sub1_PRD_START_DATE; }
	public String getSub1_MRP_ODR_TYP() { return m_Sub1_MRP_ODR_TYP; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getSub1_PS_UNIT_QTY() { return m_Sub1_PS_UNIT_QTY; }
	public String getOD_LEVEL_NO() { return m_OD_LEVEL_NO; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getsetDM_QTY() { return m_setDM_QTY; }
	public String getsetOUTSIDE_TYP() { return m_setOUTSIDE_TYP; }
	public String getsetPS_UNIT_QTY() { return m_setPS_UNIT_QTY; }
	public String getsetPS_SPOIL() { return m_setPS_SPOIL; }
	public String getsetPS_UNIT_DENOMINATOR() { return m_setPS_UNIT_DENOMINATOR; }
	public String getsetPS_UNIT_NUMERATOR() { return m_setPS_UNIT_NUMERATOR; }
	public String getsetMRP_TYP() { return m_setMRP_TYP; }
	public String getsetITEM_SPOIL() { return m_setITEM_SPOIL; }
	public String getsetOD_NO() { return m_setOD_NO; }
	public String geth_Sub1_ISSUE_TYP() { return m_h_Sub1_ISSUE_TYP; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getITEM_MODIFY_COUNT() { return m_ITEM_MODIFY_COUNT; }
	public String getOD_MODIFY_COUNT() { return m_OD_MODIFY_COUNT; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getsetDUE_DATE() { return m_setDUE_DATE; }
	public String getsetPRD_DUE_DATE() { return m_setPRD_DUE_DATE; }
	public String getsetPRD_START_DATE() { return m_setPRD_START_DATE; }
	public String getsetODR_START_DATE() { return m_setODR_START_DATE; }
	public String getsetODR_QTY() { return m_setODR_QTY; }
	public String getsetOD_TYP() { return m_setOD_TYP; }
	public String getsetODR_STS_TYP() { return m_setODR_STS_TYP; }
	public String getMIN_CAL_DATE() { return m_MIN_CAL_DATE; }
	public String getMAX_CAL_DATE() { return m_MAX_CAL_DATE; }
	public String getOD_CALC_FLG() { return m_OD_CALC_FLG; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getWS_CD() { return m_WS_CD; }
	public String getPROC_EXPLOSION_FLG() { return m_PROC_EXPLOSION_FLG; }
	public String getSub1_PUCH_ODR_CD() { return m_Sub1_PUCH_ODR_CD; }
	public String getSub1_COMPANY_CD() { return m_Sub1_COMPANY_CD; }
	public String getSub1_VEND_CD() { return m_Sub1_VEND_CD; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getCOUNT() { return m_COUNT; }
	public String getFINAL_PROC_FLG() { return m_FINAL_PROC_FLG; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getTOTAL_ACPT_QTY() { return m_TOTAL_ACPT_QTY; }
	public String getTOTAL_DEFECT_QTY() { return m_TOTAL_DEFECT_QTY; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getSub1_WORK_IN_PROC_CD() { return m_Sub1_WORK_IN_PROC_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getSysPLANT_CD() { return m_SysPLANT_CD; }
	public String getVALUE() { return m_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getMY_COMPANY() { return m_MY_COMPANY; }
	public String getPVEND_CD() { return m_PVEND_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getWH_CD1() { return m_WH_CD1; }
	public String getWH_CD2() { return m_WH_CD2; }
	public String getWH_CD3() { return m_WH_CD3; }
	public String getOWN_PERSON_NAME() { return m_OWN_PERSON_NAME; }
	public String getPVC2BUSINESSNAME() { return m_PVC2BUSINESSNAME; }
	public String getPVC2OUTPUTPATH() { return m_PVC2OUTPUTPATH; }
	public String getPVC2OUTPUTNAME() { return m_PVC2OUTPUTNAME; }
	public String getPVC2LOGMODE() { return m_PVC2LOGMODE; }
	public String getPVC2OUTPUTMODE() { return m_PVC2OUTPUTMODE; }
	public String getPVC2USERID() { return m_PVC2USERID; }
	public String getPVC2PLANTCD() { return m_PVC2PLANTCD; }
	public String getPVC2TAXID() { return m_PVC2TAXID; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getPNUMTAXOUTAMOUNT() { return m_PNUMTAXOUTAMOUNT; }
	public String getPNUMTAXAMOUNT() { return m_PNUMTAXAMOUNT; }
	public String getPNUMEXTERNALTAXSALESAMOUNT() { return m_PNUMEXTERNALTAXSALESAMOUNT; }
	public String getPNUMINTERNALTAXSALESAMOUNT() { return m_PNUMINTERNALTAXSALESAMOUNT; }
	public String getPNUMTAXFREESALESAMOUNT() { return m_PNUMTAXFREESALESAMOUNT; }
	public String getPNUMEXTERNALTAXAMOUNT() { return m_PNUMEXTERNALTAXAMOUNT; }
	public String getPNUMINTERNALTAXAMOUNT() { return m_PNUMINTERNALTAXAMOUNT; }
	public String getPVC2ERRCD() { return m_PVC2ERRCD; }
	public String getPNUMSTATUS() { return m_PNUMSTATUS; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getPARENT_DRAW_CD() { return m_PARENT_DRAW_CD; }
	public String getPARENT_SPEC() { return m_PARENT_SPEC; }
	public String getPARENT_OUTSIDE_TYP() { return m_PARENT_OUTSIDE_TYP; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getPS_SPOIL() { return m_PS_SPOIL; }
	public String getPS_LT_FLG() { return m_PS_LT_FLG; }
	public String getPS_KEY() { return m_PS_KEY; }
	public String getCHILD_ITEM_NAME() { return m_CHILD_ITEM_NAME; }
	public String getCHILD_DRAW_CD() { return m_CHILD_DRAW_CD; }
	public String getCHILD_SPEC() { return m_CHILD_SPEC; }
	public String getCHILD_OUTSIDE_TYP() { return m_CHILD_OUTSIDE_TYP; }

	public List getList_InitLevel() { return l_InitLevel; }
	public List getList_id() { return l_id; }
	public List getList_lvl() { return l_lvl; }
	public List getList_parent() { return l_parent; }
	public List getList_label() { return l_label; }
	public List getList_ctx() { return l_ctx; }
	public List getList_maxid() { return l_maxid; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_UNIT_QTY_TYP_DN() { return l_UNIT_QTY_TYP_DN; }
	public List getList_ODR_STS_TYP_DN() { return l_ODR_STS_TYP_DN; }
	public List getList_DM_STS_TYP_DN() { return l_DM_STS_TYP_DN; }
	public List getList_OD_TYP_DN() { return l_OD_TYP_DN; }
	public List getList_Sub1_OUTSIDE_TYP_name() { return l_Sub1_OUTSIDE_TYP_name; }
	public List getList_Sub1_OUTSIDE_TYP_val() { return l_Sub1_OUTSIDE_TYP_val; }
	public List getList_Sub1_MRP_ODR_TYP_DN() { return l_Sub1_MRP_ODR_TYP_DN; }
	public List getList_Sub1_UNIT_QTY_TYP_DN() { return l_Sub1_UNIT_QTY_TYP_DN; }
	public List getList_AC0120010tree1() { return l_AC0120010tree1; }
	public List getList_c_JOB_ODR_DEL() { return l_c_JOB_ODR_DEL; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_OD_GNR_TYP_DN() { return l_OD_GNR_TYP_DN; }
	public List getList_Sub1_DUE_TIME() { return l_Sub1_DUE_TIME; }
	public List getList_Sub1_DUE_TIME2() { return l_Sub1_DUE_TIME2; }
	public List getList_Sub1_DUE_TIME3() { return l_Sub1_DUE_TIME3; }
	public List getList_Sub1_PRD_DUE_TIME() { return l_Sub1_PRD_DUE_TIME; }
	public List getList_Sub1_PRD_START_TIME() { return l_Sub1_PRD_START_TIME; }
	public List getList_Sub1_ODR_START_TIME() { return l_Sub1_ODR_START_TIME; }
	public List getList_MANHOUR_TYP_DN() { return l_MANHOUR_TYP_DN; }
	public List getList_OPR_RSLT_TYP_DN() { return l_OPR_RSLT_TYP_DN; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_JOB_ODR_STS_TYP1() { return l_JOB_ODR_STS_TYP1; }
	public List getList_h_DM_STS_TYP() { return l_h_DM_STS_TYP; }
	public List getList_h_ODR_STS_TYP() { return l_h_ODR_STS_TYP; }
	public List getList_h_size() { return l_h_size; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_UNIT_QTY_TYP_name() { return l_UNIT_QTY_TYP_name; }
	public List getList_UNIT_QTY_TYP_val() { return l_UNIT_QTY_TYP_val; }
	public List getList_JOB_ODR_TYP_DN() { return l_JOB_ODR_TYP_DN; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_ODR_STS_TYP() { return l_ODR_STS_TYP; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_Sub1_OUTSIDE_TYP() { return l_Sub1_OUTSIDE_TYP; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_EXP_TYP() { return l_JOB_ODR_EXP_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_TOTAL_RCV_QTY() { return l_TOTAL_RCV_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_CHIID_OD_NO() { return l_CHIID_OD_NO; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_Detail_ITEM_NAME() { return l_Detail_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_SUM_PUCH_ODR_QTY() { return l_SUM_PUCH_ODR_QTY; }
	public List getList_SUM_OPR_INST_QTY() { return l_SUM_OPR_INST_QTY; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_SUM_ALCD_QTY() { return l_SUM_ALCD_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_OD_GNR_TYP() { return l_OD_GNR_TYP; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_Sub1_PARENT_OD_NO() { return l_Sub1_PARENT_OD_NO; }
	public List getList_Sub1_Parent_ITEM_CD() { return l_Sub1_Parent_ITEM_CD; }
	public List getList_Sub1_Parent_ITEM_NAME() { return l_Sub1_Parent_ITEM_NAME; }
	public List getList_h_Sub1_Parent_OD_LEVEL_NO() { return l_h_Sub1_Parent_OD_LEVEL_NO; }
	public List getList_h_Parent_OD_MODIFY_COUNT() { return l_h_Parent_OD_MODIFY_COUNT; }
	public List getList_h_Sub1_Parent_ODR_QTY() { return l_h_Sub1_Parent_ODR_QTY; }
	public List getList_h_Sub1_Parent_ODR_START_DATE() { return l_h_Sub1_Parent_ODR_START_DATE; }
	public List getList_h_Sub1_Parent_ALC_GRP_CD() { return l_h_Sub1_Parent_ALC_GRP_CD; }
	public List getList_h_Sub1_ODR_STS_TYP() { return l_h_Sub1_ODR_STS_TYP; }
	public List getList_h_Sub1_DM_STS_TYP() { return l_h_Sub1_DM_STS_TYP; }
	public List getList_Sub1_Comp_ITEM_CD() { return l_Sub1_Comp_ITEM_CD; }
	public List getList_Sub1_Comp_ITEM_NAME() { return l_Sub1_Comp_ITEM_NAME; }
	public List getList_Sub1_DRAW_CD() { return l_Sub1_DRAW_CD; }
	public List getList_Sub1_SPEC() { return l_Sub1_SPEC; }
	public List getList_h_Sub1_MRP_ODR_TYP() { return l_h_Sub1_MRP_ODR_TYP; }
	public List getList_Sub1_ITEM_SPOIL() { return l_Sub1_ITEM_SPOIL; }
	public List getList_Sub1_PS_SPOIL() { return l_Sub1_PS_SPOIL; }
	public List getList_h_Sub1_UNIT_QTY_TYP() { return l_h_Sub1_UNIT_QTY_TYP; }
	public List getList_Sub1_DUE_DATE() { return l_Sub1_DUE_DATE; }
	public List getList_Sub1_PRD_DUE_DATE() { return l_Sub1_PRD_DUE_DATE; }
	public List getList_Sub1_PRD_START_DATE() { return l_Sub1_PRD_START_DATE; }
	public List getList_Sub1_ODR_START_DATE() { return l_Sub1_ODR_START_DATE; }
	public List getList_Sub1_ODR_QTY() { return l_Sub1_ODR_QTY; }
	public List getList_Sub1_DM_QTY() { return l_Sub1_DM_QTY; }
	public List getList_Sub1_STOCK_UNIT() { return l_Sub1_STOCK_UNIT; }
	public List getList_Sub1_PS_UNIT_DENOMINATOR() { return l_Sub1_PS_UNIT_DENOMINATOR; }
	public List getList_Sub1_PS_UNIT_NUMERATOR() { return l_Sub1_PS_UNIT_NUMERATOR; }
	public List getList_ODR_LT() { return l_ODR_LT; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_ISSUE_LT() { return l_ISSUE_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_h_Comp_ITEM_MODIFY_COUNT() { return l_h_Comp_ITEM_MODIFY_COUNT; }
	public List getList_Sub1_OD_TYP() { return l_Sub1_OD_TYP; }
	public List getList_h_Sub1_PS_UNIT_QTY() { return l_h_Sub1_PS_UNIT_QTY; }
	public List getList_h_Sub1_OD_MODIFY_COUNT() { return l_h_Sub1_OD_MODIFY_COUNT; }
	public List getList_h_Sub1_MANHOUR_TYP() { return l_h_Sub1_MANHOUR_TYP; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_L_Sub1_DUE_DATE() { return l_L_Sub1_DUE_DATE; }
	public List getList_L_Sub1_ODR_START_DATE() { return l_L_Sub1_ODR_START_DATE; }
	public List getList_L_Sub1_PRD_DUE_DATE() { return l_L_Sub1_PRD_DUE_DATE; }
	public List getList_L_Sub1_PRD_START_DATE() { return l_L_Sub1_PRD_START_DATE; }
	public List getList_Sub1_MRP_ODR_TYP() { return l_Sub1_MRP_ODR_TYP; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_Sub1_PS_UNIT_QTY() { return l_Sub1_PS_UNIT_QTY; }
	public List getList_OD_LEVEL_NO() { return l_OD_LEVEL_NO; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_setDM_QTY() { return l_setDM_QTY; }
	public List getList_setOUTSIDE_TYP() { return l_setOUTSIDE_TYP; }
	public List getList_setPS_UNIT_QTY() { return l_setPS_UNIT_QTY; }
	public List getList_setPS_SPOIL() { return l_setPS_SPOIL; }
	public List getList_setPS_UNIT_DENOMINATOR() { return l_setPS_UNIT_DENOMINATOR; }
	public List getList_setPS_UNIT_NUMERATOR() { return l_setPS_UNIT_NUMERATOR; }
	public List getList_setMRP_TYP() { return l_setMRP_TYP; }
	public List getList_setITEM_SPOIL() { return l_setITEM_SPOIL; }
	public List getList_setOD_NO() { return l_setOD_NO; }
	public List getList_h_Sub1_ISSUE_TYP() { return l_h_Sub1_ISSUE_TYP; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_ITEM_MODIFY_COUNT() { return l_ITEM_MODIFY_COUNT; }
	public List getList_OD_MODIFY_COUNT() { return l_OD_MODIFY_COUNT; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_setDUE_DATE() { return l_setDUE_DATE; }
	public List getList_setPRD_DUE_DATE() { return l_setPRD_DUE_DATE; }
	public List getList_setPRD_START_DATE() { return l_setPRD_START_DATE; }
	public List getList_setODR_START_DATE() { return l_setODR_START_DATE; }
	public List getList_setODR_QTY() { return l_setODR_QTY; }
	public List getList_setOD_TYP() { return l_setOD_TYP; }
	public List getList_setODR_STS_TYP() { return l_setODR_STS_TYP; }
	public List getList_MIN_CAL_DATE() { return l_MIN_CAL_DATE; }
	public List getList_MAX_CAL_DATE() { return l_MAX_CAL_DATE; }
	public List getList_OD_CALC_FLG() { return l_OD_CALC_FLG; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_PROC_EXPLOSION_FLG() { return l_PROC_EXPLOSION_FLG; }
	public List getList_Sub1_PUCH_ODR_CD() { return l_Sub1_PUCH_ODR_CD; }
	public List getList_Sub1_COMPANY_CD() { return l_Sub1_COMPANY_CD; }
	public List getList_Sub1_VEND_CD() { return l_Sub1_VEND_CD; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_FINAL_PROC_FLG() { return l_FINAL_PROC_FLG; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_TOTAL_ACPT_QTY() { return l_TOTAL_ACPT_QTY; }
	public List getList_TOTAL_DEFECT_QTY() { return l_TOTAL_DEFECT_QTY; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_Sub1_WORK_IN_PROC_CD() { return l_Sub1_WORK_IN_PROC_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_SysPLANT_CD() { return l_SysPLANT_CD; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_MY_COMPANY() { return l_MY_COMPANY; }
	public List getList_PVEND_CD() { return l_PVEND_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_WH_CD1() { return l_WH_CD1; }
	public List getList_WH_CD2() { return l_WH_CD2; }
	public List getList_WH_CD3() { return l_WH_CD3; }
	public List getList_OWN_PERSON_NAME() { return l_OWN_PERSON_NAME; }
	public List getList_PVC2BUSINESSNAME() { return l_PVC2BUSINESSNAME; }
	public List getList_PVC2OUTPUTPATH() { return l_PVC2OUTPUTPATH; }
	public List getList_PVC2OUTPUTNAME() { return l_PVC2OUTPUTNAME; }
	public List getList_PVC2LOGMODE() { return l_PVC2LOGMODE; }
	public List getList_PVC2OUTPUTMODE() { return l_PVC2OUTPUTMODE; }
	public List getList_PVC2USERID() { return l_PVC2USERID; }
	public List getList_PVC2PLANTCD() { return l_PVC2PLANTCD; }
	public List getList_PVC2TAXID() { return l_PVC2TAXID; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_PNUMTAXOUTAMOUNT() { return l_PNUMTAXOUTAMOUNT; }
	public List getList_PNUMTAXAMOUNT() { return l_PNUMTAXAMOUNT; }
	public List getList_PNUMEXTERNALTAXSALESAMOUNT() { return l_PNUMEXTERNALTAXSALESAMOUNT; }
	public List getList_PNUMINTERNALTAXSALESAMOUNT() { return l_PNUMINTERNALTAXSALESAMOUNT; }
	public List getList_PNUMTAXFREESALESAMOUNT() { return l_PNUMTAXFREESALESAMOUNT; }
	public List getList_PNUMEXTERNALTAXAMOUNT() { return l_PNUMEXTERNALTAXAMOUNT; }
	public List getList_PNUMINTERNALTAXAMOUNT() { return l_PNUMINTERNALTAXAMOUNT; }
	public List getList_PVC2ERRCD() { return l_PVC2ERRCD; }
	public List getList_PNUMSTATUS() { return l_PNUMSTATUS; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_PARENT_DRAW_CD() { return l_PARENT_DRAW_CD; }
	public List getList_PARENT_SPEC() { return l_PARENT_SPEC; }
	public List getList_PARENT_OUTSIDE_TYP() { return l_PARENT_OUTSIDE_TYP; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_PS_SPOIL() { return l_PS_SPOIL; }
	public List getList_PS_LT_FLG() { return l_PS_LT_FLG; }
	public List getList_PS_KEY() { return l_PS_KEY; }
	public List getList_CHILD_ITEM_NAME() { return l_CHILD_ITEM_NAME; }
	public List getList_CHILD_DRAW_CD() { return l_CHILD_DRAW_CD; }
	public List getList_CHILD_SPEC() { return l_CHILD_SPEC; }
	public List getList_CHILD_OUTSIDE_TYP() { return l_CHILD_OUTSIDE_TYP; }

	public void setInitLevel(String val) { m_InitLevel = val; }
	public void setid(String val) { m_id = val; }
	public void setlvl(String val) { m_lvl = val; }
	public void setparent(String val) { m_parent = val; }
	public void setlabel(String val) { m_label = val; }
	public void setctx(String val) { m_ctx = val; }
	public void setmaxid(String val) { m_maxid = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setUNIT_QTY_TYP_DN(String val) { m_UNIT_QTY_TYP_DN = val; }
	public void setODR_STS_TYP_DN(String val) { m_ODR_STS_TYP_DN = val; }
	public void setDM_STS_TYP_DN(String val) { m_DM_STS_TYP_DN = val; }
	public void setOD_TYP_DN(String val) { m_OD_TYP_DN = val; }
	public void setSub1_OUTSIDE_TYP_name(String val) { m_Sub1_OUTSIDE_TYP_name = val; }
	public void setSub1_OUTSIDE_TYP_val(String val) { m_Sub1_OUTSIDE_TYP_val = val; }
	public void setSub1_MRP_ODR_TYP_DN(String val) { m_Sub1_MRP_ODR_TYP_DN = val; }
	public void setSub1_UNIT_QTY_TYP_DN(String val) { m_Sub1_UNIT_QTY_TYP_DN = val; }
	public void setAC0120010tree1(String val) { m_AC0120010tree1 = val; }
	public void setc_JOB_ODR_DEL(String val) { m_c_JOB_ODR_DEL = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setOD_GNR_TYP_DN(String val) { m_OD_GNR_TYP_DN = val; }
	public void setSub1_DUE_TIME(String val) { m_Sub1_DUE_TIME = val; }
	public void setSub1_DUE_TIME2(String val) { m_Sub1_DUE_TIME2 = val; }
	public void setSub1_DUE_TIME3(String val) { m_Sub1_DUE_TIME3 = val; }
	public void setSub1_PRD_DUE_TIME(String val) { m_Sub1_PRD_DUE_TIME = val; }
	public void setSub1_PRD_START_TIME(String val) { m_Sub1_PRD_START_TIME = val; }
	public void setSub1_ODR_START_TIME(String val) { m_Sub1_ODR_START_TIME = val; }
	public void setMANHOUR_TYP_DN(String val) { m_MANHOUR_TYP_DN = val; }
	public void setOPR_RSLT_TYP_DN(String val) { m_OPR_RSLT_TYP_DN = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setJOB_ODR_STS_TYP1(String val) { m_JOB_ODR_STS_TYP1 = val; }
	public void seth_DM_STS_TYP(String val) { m_h_DM_STS_TYP = val; }
	public void seth_ODR_STS_TYP(String val) { m_h_ODR_STS_TYP = val; }
	public void seth_size(String val) { m_h_size = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setUNIT_QTY_TYP_name(String val) { m_UNIT_QTY_TYP_name = val; }
	public void setUNIT_QTY_TYP_val(String val) { m_UNIT_QTY_TYP_val = val; }
	public void setJOB_ODR_TYP_DN(String val) { m_JOB_ODR_TYP_DN = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setOD_TYP(String val) { m_OD_TYP = val; }
	public void setODR_STS_TYP(String val) { m_ODR_STS_TYP = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setMRP_TYP(String val) { m_MRP_TYP = val; }
	public void setSub1_OUTSIDE_TYP(String val) { m_Sub1_OUTSIDE_TYP = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_EXP_TYP(String val) { m_JOB_ODR_EXP_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = val; }
	public void setTOTAL_RCV_QTY(String val) { m_TOTAL_RCV_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setCHIID_OD_NO(String val) { m_CHIID_OD_NO = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setDetail_ITEM_NAME(String val) { m_Detail_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setSUM_PUCH_ODR_QTY(String val) { m_SUM_PUCH_ODR_QTY = val; }
	public void setSUM_OPR_INST_QTY(String val) { m_SUM_OPR_INST_QTY = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setSUM_ALCD_QTY(String val) { m_SUM_ALCD_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setOD_GNR_TYP(String val) { m_OD_GNR_TYP = val; }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = val; }
	public void setSub1_PARENT_OD_NO(String val) { m_Sub1_PARENT_OD_NO = val; }
	public void setSub1_Parent_ITEM_CD(String val) { m_Sub1_Parent_ITEM_CD = val; }
	public void setSub1_Parent_ITEM_NAME(String val) { m_Sub1_Parent_ITEM_NAME = val; }
	public void seth_Sub1_Parent_OD_LEVEL_NO(String val) { m_h_Sub1_Parent_OD_LEVEL_NO = val; }
	public void seth_Parent_OD_MODIFY_COUNT(String val) { m_h_Parent_OD_MODIFY_COUNT = val; }
	public void seth_Sub1_Parent_ODR_QTY(String val) { m_h_Sub1_Parent_ODR_QTY = val; }
	public void seth_Sub1_Parent_ODR_START_DATE(String val) { m_h_Sub1_Parent_ODR_START_DATE = val; }
	public void seth_Sub1_Parent_ALC_GRP_CD(String val) { m_h_Sub1_Parent_ALC_GRP_CD = val; }
	public void seth_Sub1_ODR_STS_TYP(String val) { m_h_Sub1_ODR_STS_TYP = val; }
	public void seth_Sub1_DM_STS_TYP(String val) { m_h_Sub1_DM_STS_TYP = val; }
	public void setSub1_Comp_ITEM_CD(String val) { m_Sub1_Comp_ITEM_CD = val; }
	public void setSub1_Comp_ITEM_NAME(String val) { m_Sub1_Comp_ITEM_NAME = val; }
	public void setSub1_DRAW_CD(String val) { m_Sub1_DRAW_CD = val; }
	public void setSub1_SPEC(String val) { m_Sub1_SPEC = val; }
	public void seth_Sub1_MRP_ODR_TYP(String val) { m_h_Sub1_MRP_ODR_TYP = val; }
	public void setSub1_ITEM_SPOIL(String val) { m_Sub1_ITEM_SPOIL = val; }
	public void setSub1_PS_SPOIL(String val) { m_Sub1_PS_SPOIL = val; }
	public void seth_Sub1_UNIT_QTY_TYP(String val) { m_h_Sub1_UNIT_QTY_TYP = val; }
	public void setSub1_DUE_DATE(String val) { m_Sub1_DUE_DATE = val; }
	public void setSub1_PRD_DUE_DATE(String val) { m_Sub1_PRD_DUE_DATE = val; }
	public void setSub1_PRD_START_DATE(String val) { m_Sub1_PRD_START_DATE = val; }
	public void setSub1_ODR_START_DATE(String val) { m_Sub1_ODR_START_DATE = val; }
	public void setSub1_ODR_QTY(String val) { m_Sub1_ODR_QTY = val; }
	public void setSub1_DM_QTY(String val) { m_Sub1_DM_QTY = val; }
	public void setSub1_STOCK_UNIT(String val) { m_Sub1_STOCK_UNIT = val; }
	public void setSub1_PS_UNIT_DENOMINATOR(String val) { m_Sub1_PS_UNIT_DENOMINATOR = val; }
	public void setSub1_PS_UNIT_NUMERATOR(String val) { m_Sub1_PS_UNIT_NUMERATOR = val; }
	public void setODR_LT(String val) { m_ODR_LT = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setISSUE_LT(String val) { m_ISSUE_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void seth_Comp_ITEM_MODIFY_COUNT(String val) { m_h_Comp_ITEM_MODIFY_COUNT = val; }
	public void setSub1_OD_TYP(String val) { m_Sub1_OD_TYP = val; }
	public void seth_Sub1_PS_UNIT_QTY(String val) { m_h_Sub1_PS_UNIT_QTY = val; }
	public void seth_Sub1_OD_MODIFY_COUNT(String val) { m_h_Sub1_OD_MODIFY_COUNT = val; }
	public void seth_Sub1_MANHOUR_TYP(String val) { m_h_Sub1_MANHOUR_TYP = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setL_Sub1_DUE_DATE(String val) { m_L_Sub1_DUE_DATE = val; }
	public void setL_Sub1_ODR_START_DATE(String val) { m_L_Sub1_ODR_START_DATE = val; }
	public void setL_Sub1_PRD_DUE_DATE(String val) { m_L_Sub1_PRD_DUE_DATE = val; }
	public void setL_Sub1_PRD_START_DATE(String val) { m_L_Sub1_PRD_START_DATE = val; }
	public void setSub1_MRP_ODR_TYP(String val) { m_Sub1_MRP_ODR_TYP = val; }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = val; }
	public void setSub1_PS_UNIT_QTY(String val) { m_Sub1_PS_UNIT_QTY = val; }
	public void setOD_LEVEL_NO(String val) { m_OD_LEVEL_NO = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setsetDM_QTY(String val) { m_setDM_QTY = val; }
	public void setsetOUTSIDE_TYP(String val) { m_setOUTSIDE_TYP = val; }
	public void setsetPS_UNIT_QTY(String val) { m_setPS_UNIT_QTY = val; }
	public void setsetPS_SPOIL(String val) { m_setPS_SPOIL = val; }
	public void setsetPS_UNIT_DENOMINATOR(String val) { m_setPS_UNIT_DENOMINATOR = val; }
	public void setsetPS_UNIT_NUMERATOR(String val) { m_setPS_UNIT_NUMERATOR = val; }
	public void setsetMRP_TYP(String val) { m_setMRP_TYP = val; }
	public void setsetITEM_SPOIL(String val) { m_setITEM_SPOIL = val; }
	public void setsetOD_NO(String val) { m_setOD_NO = val; }
	public void seth_Sub1_ISSUE_TYP(String val) { m_h_Sub1_ISSUE_TYP = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setITEM_MODIFY_COUNT(String val) { m_ITEM_MODIFY_COUNT = val; }
	public void setOD_MODIFY_COUNT(String val) { m_OD_MODIFY_COUNT = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setsetDUE_DATE(String val) { m_setDUE_DATE = val; }
	public void setsetPRD_DUE_DATE(String val) { m_setPRD_DUE_DATE = val; }
	public void setsetPRD_START_DATE(String val) { m_setPRD_START_DATE = val; }
	public void setsetODR_START_DATE(String val) { m_setODR_START_DATE = val; }
	public void setsetODR_QTY(String val) { m_setODR_QTY = val; }
	public void setsetOD_TYP(String val) { m_setOD_TYP = val; }
	public void setsetODR_STS_TYP(String val) { m_setODR_STS_TYP = val; }
	public void setMIN_CAL_DATE(String val) { m_MIN_CAL_DATE = val; }
	public void setMAX_CAL_DATE(String val) { m_MAX_CAL_DATE = val; }
	public void setOD_CALC_FLG(String val) { m_OD_CALC_FLG = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setPROC_EXPLOSION_FLG(String val) { m_PROC_EXPLOSION_FLG = val; }
	public void setSub1_PUCH_ODR_CD(String val) { m_Sub1_PUCH_ODR_CD = val; }
	public void setSub1_COMPANY_CD(String val) { m_Sub1_COMPANY_CD = val; }
	public void setSub1_VEND_CD(String val) { m_Sub1_VEND_CD = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setFINAL_PROC_FLG(String val) { m_FINAL_PROC_FLG = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setTOTAL_ACPT_QTY(String val) { m_TOTAL_ACPT_QTY = val; }
	public void setTOTAL_DEFECT_QTY(String val) { m_TOTAL_DEFECT_QTY = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setSub1_WORK_IN_PROC_CD(String val) { m_Sub1_WORK_IN_PROC_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = val; }
	public void setSysPLANT_CD(String val) { m_SysPLANT_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setMY_COMPANY(String val) { m_MY_COMPANY = val; }
	public void setPVEND_CD(String val) { m_PVEND_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setWH_CD1(String val) { m_WH_CD1 = val; }
	public void setWH_CD2(String val) { m_WH_CD2 = val; }
	public void setWH_CD3(String val) { m_WH_CD3 = val; }
	public void setOWN_PERSON_NAME(String val) { m_OWN_PERSON_NAME = val; }
	public void setPVC2BUSINESSNAME(String val) { m_PVC2BUSINESSNAME = val; }
	public void setPVC2OUTPUTPATH(String val) { m_PVC2OUTPUTPATH = val; }
	public void setPVC2OUTPUTNAME(String val) { m_PVC2OUTPUTNAME = val; }
	public void setPVC2LOGMODE(String val) { m_PVC2LOGMODE = val; }
	public void setPVC2OUTPUTMODE(String val) { m_PVC2OUTPUTMODE = val; }
	public void setPVC2USERID(String val) { m_PVC2USERID = val; }
	public void setPVC2PLANTCD(String val) { m_PVC2PLANTCD = val; }
	public void setPVC2TAXID(String val) { m_PVC2TAXID = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setPNUMTAXOUTAMOUNT(String val) { m_PNUMTAXOUTAMOUNT = val; }
	public void setPNUMTAXAMOUNT(String val) { m_PNUMTAXAMOUNT = val; }
	public void setPNUMEXTERNALTAXSALESAMOUNT(String val) { m_PNUMEXTERNALTAXSALESAMOUNT = val; }
	public void setPNUMINTERNALTAXSALESAMOUNT(String val) { m_PNUMINTERNALTAXSALESAMOUNT = val; }
	public void setPNUMTAXFREESALESAMOUNT(String val) { m_PNUMTAXFREESALESAMOUNT = val; }
	public void setPNUMEXTERNALTAXAMOUNT(String val) { m_PNUMEXTERNALTAXAMOUNT = val; }
	public void setPNUMINTERNALTAXAMOUNT(String val) { m_PNUMINTERNALTAXAMOUNT = val; }
	public void setPVC2ERRCD(String val) { m_PVC2ERRCD = val; }
	public void setPNUMSTATUS(String val) { m_PNUMSTATUS = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setPARENT_DRAW_CD(String val) { m_PARENT_DRAW_CD = val; }
	public void setPARENT_SPEC(String val) { m_PARENT_SPEC = val; }
	public void setPARENT_OUTSIDE_TYP(String val) { m_PARENT_OUTSIDE_TYP = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }
	public void setPS_LT_FLG(String val) { m_PS_LT_FLG = val; }
	public void setPS_KEY(String val) { m_PS_KEY = val; }
	public void setCHILD_ITEM_NAME(String val) { m_CHILD_ITEM_NAME = val; }
	public void setCHILD_DRAW_CD(String val) { m_CHILD_DRAW_CD = val; }
	public void setCHILD_SPEC(String val) { m_CHILD_SPEC = val; }
	public void setCHILD_OUTSIDE_TYP(String val) { m_CHILD_OUTSIDE_TYP = val; }


	public void setList_InitLevel(List list) { l_InitLevel = list; }
	public void setList_id(List list) { l_id = list; }
	public void setList_lvl(List list) { l_lvl = list; }
	public void setList_parent(List list) { l_parent = list; }
	public void setList_label(List list) { l_label = list; }
	public void setList_ctx(List list) { l_ctx = list; }
	public void setList_maxid(List list) { l_maxid = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_UNIT_QTY_TYP_DN(List list) { l_UNIT_QTY_TYP_DN = list; }
	public void setList_ODR_STS_TYP_DN(List list) { l_ODR_STS_TYP_DN = list; }
	public void setList_DM_STS_TYP_DN(List list) { l_DM_STS_TYP_DN = list; }
	public void setList_OD_TYP_DN(List list) { l_OD_TYP_DN = list; }
	public void setList_Sub1_OUTSIDE_TYP_name(List list) { l_Sub1_OUTSIDE_TYP_name = list; }
	public void setList_Sub1_OUTSIDE_TYP_val(List list) { l_Sub1_OUTSIDE_TYP_val = list; }
	public void setList_Sub1_MRP_ODR_TYP_DN(List list) { l_Sub1_MRP_ODR_TYP_DN = list; }
	public void setList_Sub1_UNIT_QTY_TYP_DN(List list) { l_Sub1_UNIT_QTY_TYP_DN = list; }
	public void setList_AC0120010tree1(List list) { l_AC0120010tree1 = list; }
	public void setList_c_JOB_ODR_DEL(List list) { l_c_JOB_ODR_DEL = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_OD_GNR_TYP_DN(List list) { l_OD_GNR_TYP_DN = list; }
	public void setList_Sub1_DUE_TIME(List list) { l_Sub1_DUE_TIME = list; }
	public void setList_Sub1_DUE_TIME2(List list) { l_Sub1_DUE_TIME2 = list; }
	public void setList_Sub1_DUE_TIME3(List list) { l_Sub1_DUE_TIME3 = list; }
	public void setList_Sub1_PRD_DUE_TIME(List list) { l_Sub1_PRD_DUE_TIME = list; }
	public void setList_Sub1_PRD_START_TIME(List list) { l_Sub1_PRD_START_TIME = list; }
	public void setList_Sub1_ODR_START_TIME(List list) { l_Sub1_ODR_START_TIME = list; }
	public void setList_MANHOUR_TYP_DN(List list) { l_MANHOUR_TYP_DN = list; }
	public void setList_OPR_RSLT_TYP_DN(List list) { l_OPR_RSLT_TYP_DN = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_JOB_ODR_STS_TYP1(List list) { l_JOB_ODR_STS_TYP1 = list; }
	public void setList_h_DM_STS_TYP(List list) { l_h_DM_STS_TYP = list; }
	public void setList_h_ODR_STS_TYP(List list) { l_h_ODR_STS_TYP = list; }
	public void setList_h_size(List list) { l_h_size = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_UNIT_QTY_TYP_name(List list) { l_UNIT_QTY_TYP_name = list; }
	public void setList_UNIT_QTY_TYP_val(List list) { l_UNIT_QTY_TYP_val = list; }
	public void setList_JOB_ODR_TYP_DN(List list) { l_JOB_ODR_TYP_DN = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_ODR_STS_TYP(List list) { l_ODR_STS_TYP = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_Sub1_OUTSIDE_TYP(List list) { l_Sub1_OUTSIDE_TYP = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_EXP_TYP(List list) { l_JOB_ODR_EXP_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_TOTAL_RCV_QTY(List list) { l_TOTAL_RCV_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_CHIID_OD_NO(List list) { l_CHIID_OD_NO = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_Detail_ITEM_NAME(List list) { l_Detail_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_SUM_PUCH_ODR_QTY(List list) { l_SUM_PUCH_ODR_QTY = list; }
	public void setList_SUM_OPR_INST_QTY(List list) { l_SUM_OPR_INST_QTY = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_SUM_ALCD_QTY(List list) { l_SUM_ALCD_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_OD_GNR_TYP(List list) { l_OD_GNR_TYP = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_Sub1_PARENT_OD_NO(List list) { l_Sub1_PARENT_OD_NO = list; }
	public void setList_Sub1_Parent_ITEM_CD(List list) { l_Sub1_Parent_ITEM_CD = list; }
	public void setList_Sub1_Parent_ITEM_NAME(List list) { l_Sub1_Parent_ITEM_NAME = list; }
	public void setList_h_Sub1_Parent_OD_LEVEL_NO(List list) { l_h_Sub1_Parent_OD_LEVEL_NO = list; }
	public void setList_h_Parent_OD_MODIFY_COUNT(List list) { l_h_Parent_OD_MODIFY_COUNT = list; }
	public void setList_h_Sub1_Parent_ODR_QTY(List list) { l_h_Sub1_Parent_ODR_QTY = list; }
	public void setList_h_Sub1_Parent_ODR_START_DATE(List list) { l_h_Sub1_Parent_ODR_START_DATE = list; }
	public void setList_h_Sub1_Parent_ALC_GRP_CD(List list) { l_h_Sub1_Parent_ALC_GRP_CD = list; }
	public void setList_h_Sub1_ODR_STS_TYP(List list) { l_h_Sub1_ODR_STS_TYP = list; }
	public void setList_h_Sub1_DM_STS_TYP(List list) { l_h_Sub1_DM_STS_TYP = list; }
	public void setList_Sub1_Comp_ITEM_CD(List list) { l_Sub1_Comp_ITEM_CD = list; }
	public void setList_Sub1_Comp_ITEM_NAME(List list) { l_Sub1_Comp_ITEM_NAME = list; }
	public void setList_Sub1_DRAW_CD(List list) { l_Sub1_DRAW_CD = list; }
	public void setList_Sub1_SPEC(List list) { l_Sub1_SPEC = list; }
	public void setList_h_Sub1_MRP_ODR_TYP(List list) { l_h_Sub1_MRP_ODR_TYP = list; }
	public void setList_Sub1_ITEM_SPOIL(List list) { l_Sub1_ITEM_SPOIL = list; }
	public void setList_Sub1_PS_SPOIL(List list) { l_Sub1_PS_SPOIL = list; }
	public void setList_h_Sub1_UNIT_QTY_TYP(List list) { l_h_Sub1_UNIT_QTY_TYP = list; }
	public void setList_Sub1_DUE_DATE(List list) { l_Sub1_DUE_DATE = list; }
	public void setList_Sub1_PRD_DUE_DATE(List list) { l_Sub1_PRD_DUE_DATE = list; }
	public void setList_Sub1_PRD_START_DATE(List list) { l_Sub1_PRD_START_DATE = list; }
	public void setList_Sub1_ODR_START_DATE(List list) { l_Sub1_ODR_START_DATE = list; }
	public void setList_Sub1_ODR_QTY(List list) { l_Sub1_ODR_QTY = list; }
	public void setList_Sub1_DM_QTY(List list) { l_Sub1_DM_QTY = list; }
	public void setList_Sub1_STOCK_UNIT(List list) { l_Sub1_STOCK_UNIT = list; }
	public void setList_Sub1_PS_UNIT_DENOMINATOR(List list) { l_Sub1_PS_UNIT_DENOMINATOR = list; }
	public void setList_Sub1_PS_UNIT_NUMERATOR(List list) { l_Sub1_PS_UNIT_NUMERATOR = list; }
	public void setList_ODR_LT(List list) { l_ODR_LT = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_ISSUE_LT(List list) { l_ISSUE_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_h_Comp_ITEM_MODIFY_COUNT(List list) { l_h_Comp_ITEM_MODIFY_COUNT = list; }
	public void setList_Sub1_OD_TYP(List list) { l_Sub1_OD_TYP = list; }
	public void setList_h_Sub1_PS_UNIT_QTY(List list) { l_h_Sub1_PS_UNIT_QTY = list; }
	public void setList_h_Sub1_OD_MODIFY_COUNT(List list) { l_h_Sub1_OD_MODIFY_COUNT = list; }
	public void setList_h_Sub1_MANHOUR_TYP(List list) { l_h_Sub1_MANHOUR_TYP = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_L_Sub1_DUE_DATE(List list) { l_L_Sub1_DUE_DATE = list; }
	public void setList_L_Sub1_ODR_START_DATE(List list) { l_L_Sub1_ODR_START_DATE = list; }
	public void setList_L_Sub1_PRD_DUE_DATE(List list) { l_L_Sub1_PRD_DUE_DATE = list; }
	public void setList_L_Sub1_PRD_START_DATE(List list) { l_L_Sub1_PRD_START_DATE = list; }
	public void setList_Sub1_MRP_ODR_TYP(List list) { l_Sub1_MRP_ODR_TYP = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_Sub1_PS_UNIT_QTY(List list) { l_Sub1_PS_UNIT_QTY = list; }
	public void setList_OD_LEVEL_NO(List list) { l_OD_LEVEL_NO = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_setDM_QTY(List list) { l_setDM_QTY = list; }
	public void setList_setOUTSIDE_TYP(List list) { l_setOUTSIDE_TYP = list; }
	public void setList_setPS_UNIT_QTY(List list) { l_setPS_UNIT_QTY = list; }
	public void setList_setPS_SPOIL(List list) { l_setPS_SPOIL = list; }
	public void setList_setPS_UNIT_DENOMINATOR(List list) { l_setPS_UNIT_DENOMINATOR = list; }
	public void setList_setPS_UNIT_NUMERATOR(List list) { l_setPS_UNIT_NUMERATOR = list; }
	public void setList_setMRP_TYP(List list) { l_setMRP_TYP = list; }
	public void setList_setITEM_SPOIL(List list) { l_setITEM_SPOIL = list; }
	public void setList_setOD_NO(List list) { l_setOD_NO = list; }
	public void setList_h_Sub1_ISSUE_TYP(List list) { l_h_Sub1_ISSUE_TYP = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_ITEM_MODIFY_COUNT(List list) { l_ITEM_MODIFY_COUNT = list; }
	public void setList_OD_MODIFY_COUNT(List list) { l_OD_MODIFY_COUNT = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_setDUE_DATE(List list) { l_setDUE_DATE = list; }
	public void setList_setPRD_DUE_DATE(List list) { l_setPRD_DUE_DATE = list; }
	public void setList_setPRD_START_DATE(List list) { l_setPRD_START_DATE = list; }
	public void setList_setODR_START_DATE(List list) { l_setODR_START_DATE = list; }
	public void setList_setODR_QTY(List list) { l_setODR_QTY = list; }
	public void setList_setOD_TYP(List list) { l_setOD_TYP = list; }
	public void setList_setODR_STS_TYP(List list) { l_setODR_STS_TYP = list; }
	public void setList_MIN_CAL_DATE(List list) { l_MIN_CAL_DATE = list; }
	public void setList_MAX_CAL_DATE(List list) { l_MAX_CAL_DATE = list; }
	public void setList_OD_CALC_FLG(List list) { l_OD_CALC_FLG = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_PROC_EXPLOSION_FLG(List list) { l_PROC_EXPLOSION_FLG = list; }
	public void setList_Sub1_PUCH_ODR_CD(List list) { l_Sub1_PUCH_ODR_CD = list; }
	public void setList_Sub1_COMPANY_CD(List list) { l_Sub1_COMPANY_CD = list; }
	public void setList_Sub1_VEND_CD(List list) { l_Sub1_VEND_CD = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_FINAL_PROC_FLG(List list) { l_FINAL_PROC_FLG = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_TOTAL_ACPT_QTY(List list) { l_TOTAL_ACPT_QTY = list; }
	public void setList_TOTAL_DEFECT_QTY(List list) { l_TOTAL_DEFECT_QTY = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_Sub1_WORK_IN_PROC_CD(List list) { l_Sub1_WORK_IN_PROC_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_SysPLANT_CD(List list) { l_SysPLANT_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_MY_COMPANY(List list) { l_MY_COMPANY = list; }
	public void setList_PVEND_CD(List list) { l_PVEND_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_WH_CD1(List list) { l_WH_CD1 = list; }
	public void setList_WH_CD2(List list) { l_WH_CD2 = list; }
	public void setList_WH_CD3(List list) { l_WH_CD3 = list; }
	public void setList_OWN_PERSON_NAME(List list) { l_OWN_PERSON_NAME = list; }
	public void setList_PVC2BUSINESSNAME(List list) { l_PVC2BUSINESSNAME = list; }
	public void setList_PVC2OUTPUTPATH(List list) { l_PVC2OUTPUTPATH = list; }
	public void setList_PVC2OUTPUTNAME(List list) { l_PVC2OUTPUTNAME = list; }
	public void setList_PVC2LOGMODE(List list) { l_PVC2LOGMODE = list; }
	public void setList_PVC2OUTPUTMODE(List list) { l_PVC2OUTPUTMODE = list; }
	public void setList_PVC2USERID(List list) { l_PVC2USERID = list; }
	public void setList_PVC2PLANTCD(List list) { l_PVC2PLANTCD = list; }
	public void setList_PVC2TAXID(List list) { l_PVC2TAXID = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_PNUMTAXOUTAMOUNT(List list) { l_PNUMTAXOUTAMOUNT = list; }
	public void setList_PNUMTAXAMOUNT(List list) { l_PNUMTAXAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXSALESAMOUNT(List list) { l_PNUMEXTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMINTERNALTAXSALESAMOUNT(List list) { l_PNUMINTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMTAXFREESALESAMOUNT(List list) { l_PNUMTAXFREESALESAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXAMOUNT(List list) { l_PNUMEXTERNALTAXAMOUNT = list; }
	public void setList_PNUMINTERNALTAXAMOUNT(List list) { l_PNUMINTERNALTAXAMOUNT = list; }
	public void setList_PVC2ERRCD(List list) { l_PVC2ERRCD = list; }
	public void setList_PNUMSTATUS(List list) { l_PNUMSTATUS = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_PARENT_DRAW_CD(List list) { l_PARENT_DRAW_CD = list; }
	public void setList_PARENT_SPEC(List list) { l_PARENT_SPEC = list; }
	public void setList_PARENT_OUTSIDE_TYP(List list) { l_PARENT_OUTSIDE_TYP = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_PS_SPOIL(List list) { l_PS_SPOIL = list; }
	public void setList_PS_LT_FLG(List list) { l_PS_LT_FLG = list; }
	public void setList_PS_KEY(List list) { l_PS_KEY = list; }
	public void setList_CHILD_ITEM_NAME(List list) { l_CHILD_ITEM_NAME = list; }
	public void setList_CHILD_DRAW_CD(List list) { l_CHILD_DRAW_CD = list; }
	public void setList_CHILD_SPEC(List list) { l_CHILD_SPEC = list; }
	public void setList_CHILD_OUTSIDE_TYP(List list) { l_CHILD_OUTSIDE_TYP = list; }

	public int setL2L_InitLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InitLevel == null) {
			l_InitLevel = new ArrayList();
		} else {
			l_InitLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InitLevel.add(((AC0120010Struct) list.get(i)).getInitLevel());
		}
		return size;
	}
	public int setL2L_id(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_id == null) {
			l_id = new ArrayList();
		} else {
			l_id.clear();
		}
		for (int i = 0; i < size; i++) {
			l_id.add(((AC0120010Struct) list.get(i)).getid());
		}
		return size;
	}
	public int setL2L_lvl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lvl == null) {
			l_lvl = new ArrayList();
		} else {
			l_lvl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lvl.add(((AC0120010Struct) list.get(i)).getlvl());
		}
		return size;
	}
	public int setL2L_parent(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_parent == null) {
			l_parent = new ArrayList();
		} else {
			l_parent.clear();
		}
		for (int i = 0; i < size; i++) {
			l_parent.add(((AC0120010Struct) list.get(i)).getparent());
		}
		return size;
	}
	public int setL2L_label(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_label == null) {
			l_label = new ArrayList();
		} else {
			l_label.clear();
		}
		for (int i = 0; i < size; i++) {
			l_label.add(((AC0120010Struct) list.get(i)).getlabel());
		}
		return size;
	}
	public int setL2L_ctx(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ctx == null) {
			l_ctx = new ArrayList();
		} else {
			l_ctx.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ctx.add(((AC0120010Struct) list.get(i)).getctx());
		}
		return size;
	}
	public int setL2L_maxid(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_maxid == null) {
			l_maxid = new ArrayList();
		} else {
			l_maxid.clear();
		}
		for (int i = 0; i < size; i++) {
			l_maxid.add(((AC0120010Struct) list.get(i)).getmaxid());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_DN == null) {
			l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_DN.add(((AC0120010Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_DN == null) {
			l_UNIT_QTY_TYP_DN = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_DN.add(((AC0120010Struct) list.get(i)).getUNIT_QTY_TYP_DN());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_DN == null) {
			l_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_DN.add(((AC0120010Struct) list.get(i)).getODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_DN == null) {
			l_DM_STS_TYP_DN = new ArrayList();
		} else {
			l_DM_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_DN.add(((AC0120010Struct) list.get(i)).getDM_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_OD_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_DN == null) {
			l_OD_TYP_DN = new ArrayList();
		} else {
			l_OD_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_DN.add(((AC0120010Struct) list.get(i)).getOD_TYP_DN());
		}
		return size;
	}
	public int setL2L_Sub1_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_OUTSIDE_TYP_name == null) {
			l_Sub1_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_Sub1_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_OUTSIDE_TYP_name.add(((AC0120010Struct) list.get(i)).getSub1_OUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_OUTSIDE_TYP_val == null) {
			l_Sub1_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_Sub1_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_OUTSIDE_TYP_val.add(((AC0120010Struct) list.get(i)).getSub1_OUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_ODR_TYP_DN == null) {
			l_Sub1_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_Sub1_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_ODR_TYP_DN.add(((AC0120010Struct) list.get(i)).getSub1_MRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_Sub1_UNIT_QTY_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_UNIT_QTY_TYP_DN == null) {
			l_Sub1_UNIT_QTY_TYP_DN = new ArrayList();
		} else {
			l_Sub1_UNIT_QTY_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_UNIT_QTY_TYP_DN.add(((AC0120010Struct) list.get(i)).getSub1_UNIT_QTY_TYP_DN());
		}
		return size;
	}
	public int setL2L_AC0120010tree1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AC0120010tree1 == null) {
			l_AC0120010tree1 = new ArrayList();
		} else {
			l_AC0120010tree1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AC0120010tree1.add(((AC0120010Struct) list.get(i)).getAC0120010tree1());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_DEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_DEL == null) {
			l_c_JOB_ODR_DEL = new ArrayList();
		} else {
			l_c_JOB_ODR_DEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_DEL.add(((AC0120010Struct) list.get(i)).getc_JOB_ODR_DEL());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((AC0120010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_OD_GNR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_GNR_TYP_DN == null) {
			l_OD_GNR_TYP_DN = new ArrayList();
		} else {
			l_OD_GNR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_GNR_TYP_DN.add(((AC0120010Struct) list.get(i)).getOD_GNR_TYP_DN());
		}
		return size;
	}
	public int setL2L_Sub1_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DUE_TIME == null) {
			l_Sub1_DUE_TIME = new ArrayList();
		} else {
			l_Sub1_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DUE_TIME.add(((AC0120010Struct) list.get(i)).getSub1_DUE_TIME());
		}
		return size;
	}
	public int setL2L_Sub1_DUE_TIME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DUE_TIME2 == null) {
			l_Sub1_DUE_TIME2 = new ArrayList();
		} else {
			l_Sub1_DUE_TIME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DUE_TIME2.add(((AC0120010Struct) list.get(i)).getSub1_DUE_TIME2());
		}
		return size;
	}
	public int setL2L_Sub1_DUE_TIME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DUE_TIME3 == null) {
			l_Sub1_DUE_TIME3 = new ArrayList();
		} else {
			l_Sub1_DUE_TIME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DUE_TIME3.add(((AC0120010Struct) list.get(i)).getSub1_DUE_TIME3());
		}
		return size;
	}
	public int setL2L_Sub1_PRD_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PRD_DUE_TIME == null) {
			l_Sub1_PRD_DUE_TIME = new ArrayList();
		} else {
			l_Sub1_PRD_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PRD_DUE_TIME.add(((AC0120010Struct) list.get(i)).getSub1_PRD_DUE_TIME());
		}
		return size;
	}
	public int setL2L_Sub1_PRD_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PRD_START_TIME == null) {
			l_Sub1_PRD_START_TIME = new ArrayList();
		} else {
			l_Sub1_PRD_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PRD_START_TIME.add(((AC0120010Struct) list.get(i)).getSub1_PRD_START_TIME());
		}
		return size;
	}
	public int setL2L_Sub1_ODR_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_ODR_START_TIME == null) {
			l_Sub1_ODR_START_TIME = new ArrayList();
		} else {
			l_Sub1_ODR_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_ODR_START_TIME.add(((AC0120010Struct) list.get(i)).getSub1_ODR_START_TIME());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP_DN == null) {
			l_MANHOUR_TYP_DN = new ArrayList();
		} else {
			l_MANHOUR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP_DN.add(((AC0120010Struct) list.get(i)).getMANHOUR_TYP_DN());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_DN == null) {
			l_OPR_RSLT_TYP_DN = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_DN.add(((AC0120010Struct) list.get(i)).getOPR_RSLT_TYP_DN());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AC0120010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP1 == null) {
			l_JOB_ODR_STS_TYP1 = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP1.add(((AC0120010Struct) list.get(i)).getJOB_ODR_STS_TYP1());
		}
		return size;
	}
	public int setL2L_h_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DM_STS_TYP == null) {
			l_h_DM_STS_TYP = new ArrayList();
		} else {
			l_h_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DM_STS_TYP.add(((AC0120010Struct) list.get(i)).geth_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_STS_TYP == null) {
			l_h_ODR_STS_TYP = new ArrayList();
		} else {
			l_h_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_STS_TYP.add(((AC0120010Struct) list.get(i)).geth_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_h_size(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_size == null) {
			l_h_size = new ArrayList();
		} else {
			l_h_size.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_size.add(((AC0120010Struct) list.get(i)).geth_size());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_name == null) {
			l_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_name.add(((AC0120010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_val == null) {
			l_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_val.add(((AC0120010Struct) list.get(i)).getMRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_name == null) {
			l_UNIT_QTY_TYP_name = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_name.add(((AC0120010Struct) list.get(i)).getUNIT_QTY_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_val == null) {
			l_UNIT_QTY_TYP_val = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_val.add(((AC0120010Struct) list.get(i)).getUNIT_QTY_TYP_val());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_DN == null) {
			l_JOB_ODR_TYP_DN = new ArrayList();
		} else {
			l_JOB_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_DN.add(((AC0120010Struct) list.get(i)).getJOB_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_DN == null) {
			l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_DN.add(((AC0120010Struct) list.get(i)).getMRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AC0120010Struct) list.get(i)).getOD_NO());
		}
		return size;
	}
	public int setL2L_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_CD == null) {
			l_PLANT_CD = new ArrayList();
		} else {
			l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_CD.add(((AC0120010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AC0120010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP == null) {
			l_OD_TYP = new ArrayList();
		} else {
			l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP.add(((AC0120010Struct) list.get(i)).getOD_TYP());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP == null) {
			l_ODR_STS_TYP = new ArrayList();
		} else {
			l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP.add(((AC0120010Struct) list.get(i)).getODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP == null) {
			l_DM_STS_TYP = new ArrayList();
		} else {
			l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP.add(((AC0120010Struct) list.get(i)).getDM_STS_TYP());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AC0120010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_MRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_TYP == null) {
			l_MRP_TYP = new ArrayList();
		} else {
			l_MRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_TYP.add(((AC0120010Struct) list.get(i)).getMRP_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_OUTSIDE_TYP == null) {
			l_Sub1_OUTSIDE_TYP = new ArrayList();
		} else {
			l_Sub1_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_OUTSIDE_TYP.add(((AC0120010Struct) list.get(i)).getSub1_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP == null) {
			l_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP.add(((AC0120010Struct) list.get(i)).getJOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_EXP_TYP == null) {
			l_JOB_ODR_EXP_TYP = new ArrayList();
		} else {
			l_JOB_ODR_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_EXP_TYP.add(((AC0120010Struct) list.get(i)).getJOB_ODR_EXP_TYP());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT == null) {
			l_MODIFY_COUNT = new ArrayList();
		} else {
			l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP == null) {
			l_MANHOUR_TYP = new ArrayList();
		} else {
			l_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP.add(((AC0120010Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_RCV_QTY == null) {
			l_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_RCV_QTY.add(((AC0120010Struct) list.get(i)).getTOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_ISSUE_QTY == null) {
			l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_ISSUE_QTY.add(((AC0120010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AC0120010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO == null) {
			l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO.add(((AC0120010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OD_NO == null) {
			l_PARENT_OD_NO = new ArrayList();
		} else {
			l_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OD_NO.add(((AC0120010Struct) list.get(i)).getPARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_CHIID_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHIID_OD_NO == null) {
			l_CHIID_OD_NO = new ArrayList();
		} else {
			l_CHIID_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHIID_OD_NO.add(((AC0120010Struct) list.get(i)).getCHIID_OD_NO());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP == null) {
			l_JOB_ODR_TYP = new ArrayList();
		} else {
			l_JOB_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP.add(((AC0120010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD == null) {
			l_ALC_GRP_CD = new ArrayList();
		} else {
			l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD.add(((AC0120010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_Detail_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Detail_ITEM_NAME == null) {
			l_Detail_ITEM_NAME = new ArrayList();
		} else {
			l_Detail_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Detail_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getDetail_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DRAW_CD == null) {
			l_DRAW_CD = new ArrayList();
		} else {
			l_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DRAW_CD.add(((AC0120010Struct) list.get(i)).getDRAW_CD());
		}
		return size;
	}
	public int setL2L_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPEC == null) {
			l_SPEC = new ArrayList();
		} else {
			l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPEC.add(((AC0120010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((AC0120010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPOIL == null) {
			l_ITEM_SPOIL = new ArrayList();
		} else {
			l_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPOIL.add(((AC0120010Struct) list.get(i)).getITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AC0120010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE == null) {
			l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE.add(((AC0120010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE == null) {
			l_DUE_DATE = new ArrayList();
		} else {
			l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE.add(((AC0120010Struct) list.get(i)).getDUE_DATE());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0120010Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE == null) {
			l_PRD_START_DATE = new ArrayList();
		} else {
			l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE.add(((AC0120010Struct) list.get(i)).getPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE == null) {
			l_ODR_START_DATE = new ArrayList();
		} else {
			l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE.add(((AC0120010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_SUM_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_PUCH_ODR_QTY == null) {
			l_SUM_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_SUM_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_PUCH_ODR_QTY.add(((AC0120010Struct) list.get(i)).getSUM_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OPR_INST_QTY == null) {
			l_SUM_OPR_INST_QTY = new ArrayList();
		} else {
			l_SUM_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OPR_INST_QTY.add(((AC0120010Struct) list.get(i)).getSUM_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((AC0120010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AC0120010Struct) list.get(i)).getDM_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ALCD_QTY == null) {
			l_SUM_ALCD_QTY = new ArrayList();
		} else {
			l_SUM_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ALCD_QTY.add(((AC0120010Struct) list.get(i)).getSUM_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((AC0120010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_OD_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_GNR_TYP == null) {
			l_OD_GNR_TYP = new ArrayList();
		} else {
			l_OD_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_GNR_TYP.add(((AC0120010Struct) list.get(i)).getOD_GNR_TYP());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP == null) {
			l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP.add(((AC0120010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PARENT_OD_NO == null) {
			l_Sub1_PARENT_OD_NO = new ArrayList();
		} else {
			l_Sub1_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PARENT_OD_NO.add(((AC0120010Struct) list.get(i)).getSub1_PARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_Sub1_Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Parent_ITEM_CD == null) {
			l_Sub1_Parent_ITEM_CD = new ArrayList();
		} else {
			l_Sub1_Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Parent_ITEM_CD.add(((AC0120010Struct) list.get(i)).getSub1_Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1_Parent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Parent_ITEM_NAME == null) {
			l_Sub1_Parent_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1_Parent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Parent_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getSub1_Parent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_h_Sub1_Parent_OD_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_Parent_OD_LEVEL_NO == null) {
			l_h_Sub1_Parent_OD_LEVEL_NO = new ArrayList();
		} else {
			l_h_Sub1_Parent_OD_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_Parent_OD_LEVEL_NO.add(((AC0120010Struct) list.get(i)).geth_Sub1_Parent_OD_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_h_Parent_OD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Parent_OD_MODIFY_COUNT == null) {
			l_h_Parent_OD_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Parent_OD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Parent_OD_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).geth_Parent_OD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_Sub1_Parent_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_Parent_ODR_QTY == null) {
			l_h_Sub1_Parent_ODR_QTY = new ArrayList();
		} else {
			l_h_Sub1_Parent_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_Parent_ODR_QTY.add(((AC0120010Struct) list.get(i)).geth_Sub1_Parent_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_Sub1_Parent_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_Parent_ODR_START_DATE == null) {
			l_h_Sub1_Parent_ODR_START_DATE = new ArrayList();
		} else {
			l_h_Sub1_Parent_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_Parent_ODR_START_DATE.add(((AC0120010Struct) list.get(i)).geth_Sub1_Parent_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_h_Sub1_Parent_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_Parent_ALC_GRP_CD == null) {
			l_h_Sub1_Parent_ALC_GRP_CD = new ArrayList();
		} else {
			l_h_Sub1_Parent_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_Parent_ALC_GRP_CD.add(((AC0120010Struct) list.get(i)).geth_Sub1_Parent_ALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_h_Sub1_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_ODR_STS_TYP == null) {
			l_h_Sub1_ODR_STS_TYP = new ArrayList();
		} else {
			l_h_Sub1_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_ODR_STS_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_DM_STS_TYP == null) {
			l_h_Sub1_DM_STS_TYP = new ArrayList();
		} else {
			l_h_Sub1_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_DM_STS_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Comp_ITEM_CD == null) {
			l_Sub1_Comp_ITEM_CD = new ArrayList();
		} else {
			l_Sub1_Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Comp_ITEM_CD.add(((AC0120010Struct) list.get(i)).getSub1_Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1_Comp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_Comp_ITEM_NAME == null) {
			l_Sub1_Comp_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1_Comp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_Comp_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getSub1_Comp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub1_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DRAW_CD == null) {
			l_Sub1_DRAW_CD = new ArrayList();
		} else {
			l_Sub1_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DRAW_CD.add(((AC0120010Struct) list.get(i)).getSub1_DRAW_CD());
		}
		return size;
	}
	public int setL2L_Sub1_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_SPEC == null) {
			l_Sub1_SPEC = new ArrayList();
		} else {
			l_Sub1_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_SPEC.add(((AC0120010Struct) list.get(i)).getSub1_SPEC());
		}
		return size;
	}
	public int setL2L_h_Sub1_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_MRP_ODR_TYP == null) {
			l_h_Sub1_MRP_ODR_TYP = new ArrayList();
		} else {
			l_h_Sub1_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_MRP_ODR_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_ITEM_SPOIL == null) {
			l_Sub1_ITEM_SPOIL = new ArrayList();
		} else {
			l_Sub1_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_ITEM_SPOIL.add(((AC0120010Struct) list.get(i)).getSub1_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_Sub1_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_SPOIL == null) {
			l_Sub1_PS_SPOIL = new ArrayList();
		} else {
			l_Sub1_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_SPOIL.add(((AC0120010Struct) list.get(i)).getSub1_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_h_Sub1_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_UNIT_QTY_TYP == null) {
			l_h_Sub1_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_h_Sub1_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_UNIT_QTY_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DUE_DATE == null) {
			l_Sub1_DUE_DATE = new ArrayList();
		} else {
			l_Sub1_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DUE_DATE.add(((AC0120010Struct) list.get(i)).getSub1_DUE_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PRD_DUE_DATE == null) {
			l_Sub1_PRD_DUE_DATE = new ArrayList();
		} else {
			l_Sub1_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PRD_DUE_DATE.add(((AC0120010Struct) list.get(i)).getSub1_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PRD_START_DATE == null) {
			l_Sub1_PRD_START_DATE = new ArrayList();
		} else {
			l_Sub1_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PRD_START_DATE.add(((AC0120010Struct) list.get(i)).getSub1_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_ODR_START_DATE == null) {
			l_Sub1_ODR_START_DATE = new ArrayList();
		} else {
			l_Sub1_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_ODR_START_DATE.add(((AC0120010Struct) list.get(i)).getSub1_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_ODR_QTY == null) {
			l_Sub1_ODR_QTY = new ArrayList();
		} else {
			l_Sub1_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_ODR_QTY.add(((AC0120010Struct) list.get(i)).getSub1_ODR_QTY());
		}
		return size;
	}
	public int setL2L_Sub1_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_DM_QTY == null) {
			l_Sub1_DM_QTY = new ArrayList();
		} else {
			l_Sub1_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_DM_QTY.add(((AC0120010Struct) list.get(i)).getSub1_DM_QTY());
		}
		return size;
	}
	public int setL2L_Sub1_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_STOCK_UNIT == null) {
			l_Sub1_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub1_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_STOCK_UNIT.add(((AC0120010Struct) list.get(i)).getSub1_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_DENOMINATOR == null) {
			l_Sub1_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_DENOMINATOR.add(((AC0120010Struct) list.get(i)).getSub1_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_NUMERATOR == null) {
			l_Sub1_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_NUMERATOR.add(((AC0120010Struct) list.get(i)).getSub1_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_LT == null) {
			l_ODR_LT = new ArrayList();
		} else {
			l_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_LT.add(((AC0120010Struct) list.get(i)).getODR_LT());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AC0120010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AC0120010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AC0120010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_LT == null) {
			l_ISSUE_LT = new ArrayList();
		} else {
			l_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_LT.add(((AC0120010Struct) list.get(i)).getISSUE_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AC0120010Struct) list.get(i)).getPROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_h_Comp_ITEM_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Comp_ITEM_MODIFY_COUNT == null) {
			l_h_Comp_ITEM_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Comp_ITEM_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Comp_ITEM_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).geth_Comp_ITEM_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Sub1_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_OD_TYP == null) {
			l_Sub1_OD_TYP = new ArrayList();
		} else {
			l_Sub1_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_OD_TYP.add(((AC0120010Struct) list.get(i)).getSub1_OD_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_UNIT_QTY == null) {
			l_h_Sub1_PS_UNIT_QTY = new ArrayList();
		} else {
			l_h_Sub1_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_UNIT_QTY.add(((AC0120010Struct) list.get(i)).geth_Sub1_PS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_h_Sub1_OD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_OD_MODIFY_COUNT == null) {
			l_h_Sub1_OD_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Sub1_OD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_OD_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).geth_Sub1_OD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_Sub1_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_MANHOUR_TYP == null) {
			l_h_Sub1_MANHOUR_TYP = new ArrayList();
		} else {
			l_h_Sub1_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_MANHOUR_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO == null) {
			l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO.add(((AC0120010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_L_Sub1_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_Sub1_DUE_DATE == null) {
			l_L_Sub1_DUE_DATE = new ArrayList();
		} else {
			l_L_Sub1_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_Sub1_DUE_DATE.add(((AC0120010Struct) list.get(i)).getL_Sub1_DUE_DATE());
		}
		return size;
	}
	public int setL2L_L_Sub1_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_Sub1_ODR_START_DATE == null) {
			l_L_Sub1_ODR_START_DATE = new ArrayList();
		} else {
			l_L_Sub1_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_Sub1_ODR_START_DATE.add(((AC0120010Struct) list.get(i)).getL_Sub1_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_L_Sub1_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_Sub1_PRD_DUE_DATE == null) {
			l_L_Sub1_PRD_DUE_DATE = new ArrayList();
		} else {
			l_L_Sub1_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_Sub1_PRD_DUE_DATE.add(((AC0120010Struct) list.get(i)).getL_Sub1_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_L_Sub1_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_Sub1_PRD_START_DATE == null) {
			l_L_Sub1_PRD_START_DATE = new ArrayList();
		} else {
			l_L_Sub1_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_Sub1_PRD_START_DATE.add(((AC0120010Struct) list.get(i)).getL_Sub1_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_ODR_TYP == null) {
			l_Sub1_MRP_ODR_TYP = new ArrayList();
		} else {
			l_Sub1_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_ODR_TYP.add(((AC0120010Struct) list.get(i)).getSub1_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP == null) {
			l_ISSUE_TYP = new ArrayList();
		} else {
			l_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP.add(((AC0120010Struct) list.get(i)).getISSUE_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_QTY == null) {
			l_Sub1_PS_UNIT_QTY = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_QTY.add(((AC0120010Struct) list.get(i)).getSub1_PS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_OD_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_LEVEL_NO == null) {
			l_OD_LEVEL_NO = new ArrayList();
		} else {
			l_OD_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_LEVEL_NO.add(((AC0120010Struct) list.get(i)).getOD_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AC0120010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_OUT_DATE == null) {
			l_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_OUT_DATE.add(((AC0120010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_setDM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDM_QTY == null) {
			l_setDM_QTY = new ArrayList();
		} else {
			l_setDM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDM_QTY.add(((AC0120010Struct) list.get(i)).getsetDM_QTY());
		}
		return size;
	}
	public int setL2L_setOUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setOUTSIDE_TYP == null) {
			l_setOUTSIDE_TYP = new ArrayList();
		} else {
			l_setOUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setOUTSIDE_TYP.add(((AC0120010Struct) list.get(i)).getsetOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_setPS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPS_UNIT_QTY == null) {
			l_setPS_UNIT_QTY = new ArrayList();
		} else {
			l_setPS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPS_UNIT_QTY.add(((AC0120010Struct) list.get(i)).getsetPS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_setPS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPS_SPOIL == null) {
			l_setPS_SPOIL = new ArrayList();
		} else {
			l_setPS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPS_SPOIL.add(((AC0120010Struct) list.get(i)).getsetPS_SPOIL());
		}
		return size;
	}
	public int setL2L_setPS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPS_UNIT_DENOMINATOR == null) {
			l_setPS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_setPS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPS_UNIT_DENOMINATOR.add(((AC0120010Struct) list.get(i)).getsetPS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_setPS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPS_UNIT_NUMERATOR == null) {
			l_setPS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_setPS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPS_UNIT_NUMERATOR.add(((AC0120010Struct) list.get(i)).getsetPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_setMRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setMRP_TYP == null) {
			l_setMRP_TYP = new ArrayList();
		} else {
			l_setMRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setMRP_TYP.add(((AC0120010Struct) list.get(i)).getsetMRP_TYP());
		}
		return size;
	}
	public int setL2L_setITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setITEM_SPOIL == null) {
			l_setITEM_SPOIL = new ArrayList();
		} else {
			l_setITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setITEM_SPOIL.add(((AC0120010Struct) list.get(i)).getsetITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_setOD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setOD_NO == null) {
			l_setOD_NO = new ArrayList();
		} else {
			l_setOD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setOD_NO.add(((AC0120010Struct) list.get(i)).getsetOD_NO());
		}
		return size;
	}
	public int setL2L_h_Sub1_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_ISSUE_TYP == null) {
			l_h_Sub1_ISSUE_TYP = new ArrayList();
		} else {
			l_h_Sub1_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_ISSUE_TYP.add(((AC0120010Struct) list.get(i)).geth_Sub1_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AC0120010Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_ITEM_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_MODIFY_COUNT == null) {
			l_ITEM_MODIFY_COUNT = new ArrayList();
		} else {
			l_ITEM_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).getITEM_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_OD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MODIFY_COUNT == null) {
			l_OD_MODIFY_COUNT = new ArrayList();
		} else {
			l_OD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MODIFY_COUNT.add(((AC0120010Struct) list.get(i)).getOD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_CD == null) {
			l_PROC_CD = new ArrayList();
		} else {
			l_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_CD.add(((AC0120010Struct) list.get(i)).getPROC_CD());
		}
		return size;
	}
	public int setL2L_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CD == null) {
			l_VEND_CD = new ArrayList();
		} else {
			l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CD.add(((AC0120010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPANY_CD == null) {
			l_COMPANY_CD = new ArrayList();
		} else {
			l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPANY_CD.add(((AC0120010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_setDUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDUE_DATE == null) {
			l_setDUE_DATE = new ArrayList();
		} else {
			l_setDUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDUE_DATE.add(((AC0120010Struct) list.get(i)).getsetDUE_DATE());
		}
		return size;
	}
	public int setL2L_setPRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPRD_DUE_DATE == null) {
			l_setPRD_DUE_DATE = new ArrayList();
		} else {
			l_setPRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPRD_DUE_DATE.add(((AC0120010Struct) list.get(i)).getsetPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_setPRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPRD_START_DATE == null) {
			l_setPRD_START_DATE = new ArrayList();
		} else {
			l_setPRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPRD_START_DATE.add(((AC0120010Struct) list.get(i)).getsetPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_setODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setODR_START_DATE == null) {
			l_setODR_START_DATE = new ArrayList();
		} else {
			l_setODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setODR_START_DATE.add(((AC0120010Struct) list.get(i)).getsetODR_START_DATE());
		}
		return size;
	}
	public int setL2L_setODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setODR_QTY == null) {
			l_setODR_QTY = new ArrayList();
		} else {
			l_setODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setODR_QTY.add(((AC0120010Struct) list.get(i)).getsetODR_QTY());
		}
		return size;
	}
	public int setL2L_setOD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setOD_TYP == null) {
			l_setOD_TYP = new ArrayList();
		} else {
			l_setOD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setOD_TYP.add(((AC0120010Struct) list.get(i)).getsetOD_TYP());
		}
		return size;
	}
	public int setL2L_setODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setODR_STS_TYP == null) {
			l_setODR_STS_TYP = new ArrayList();
		} else {
			l_setODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setODR_STS_TYP.add(((AC0120010Struct) list.get(i)).getsetODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_MIN_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_CAL_DATE == null) {
			l_MIN_CAL_DATE = new ArrayList();
		} else {
			l_MIN_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_CAL_DATE.add(((AC0120010Struct) list.get(i)).getMIN_CAL_DATE());
		}
		return size;
	}
	public int setL2L_MAX_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_CAL_DATE == null) {
			l_MAX_CAL_DATE = new ArrayList();
		} else {
			l_MAX_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_CAL_DATE.add(((AC0120010Struct) list.get(i)).getMAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG == null) {
			l_OD_CALC_FLG = new ArrayList();
		} else {
			l_OD_CALC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG.add(((AC0120010Struct) list.get(i)).getOD_CALC_FLG());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AC0120010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AC0120010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_STS_TYP == null) {
			l_WORK_STS_TYP = new ArrayList();
		} else {
			l_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_STS_TYP.add(((AC0120010Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AC0120010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_PROC_EXPLOSION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXPLOSION_FLG == null) {
			l_PROC_EXPLOSION_FLG = new ArrayList();
		} else {
			l_PROC_EXPLOSION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXPLOSION_FLG.add(((AC0120010Struct) list.get(i)).getPROC_EXPLOSION_FLG());
		}
		return size;
	}
	public int setL2L_Sub1_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PUCH_ODR_CD == null) {
			l_Sub1_PUCH_ODR_CD = new ArrayList();
		} else {
			l_Sub1_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PUCH_ODR_CD.add(((AC0120010Struct) list.get(i)).getSub1_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_Sub1_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COMPANY_CD == null) {
			l_Sub1_COMPANY_CD = new ArrayList();
		} else {
			l_Sub1_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COMPANY_CD.add(((AC0120010Struct) list.get(i)).getSub1_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_Sub1_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_VEND_CD == null) {
			l_Sub1_VEND_CD = new ArrayList();
		} else {
			l_Sub1_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_VEND_CD.add(((AC0120010Struct) list.get(i)).getSub1_VEND_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP == null) {
			l_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP.add(((AC0120010Struct) list.get(i)).getPUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((AC0120010Struct) list.get(i)).getCOUNT());
		}
		return size;
	}
	public int setL2L_FINAL_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_PROC_FLG == null) {
			l_FINAL_PROC_FLG = new ArrayList();
		} else {
			l_FINAL_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_PROC_FLG.add(((AC0120010Struct) list.get(i)).getFINAL_PROC_FLG());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AC0120010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_CD == null) {
			l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_CD.add(((AC0120010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_TOTAL_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_ACPT_QTY == null) {
			l_TOTAL_ACPT_QTY = new ArrayList();
		} else {
			l_TOTAL_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_ACPT_QTY.add(((AC0120010Struct) list.get(i)).getTOTAL_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_TOTAL_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_DEFECT_QTY == null) {
			l_TOTAL_DEFECT_QTY = new ArrayList();
		} else {
			l_TOTAL_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_DEFECT_QTY.add(((AC0120010Struct) list.get(i)).getTOTAL_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AC0120010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AC0120010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_CD == null) {
			l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_CD.add(((AC0120010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_Sub1_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_WORK_IN_PROC_CD == null) {
			l_Sub1_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_Sub1_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_WORK_IN_PROC_CD.add(((AC0120010Struct) list.get(i)).getSub1_WORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AC0120010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP == null) {
			l_CONS_TYP = new ArrayList();
		} else {
			l_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP.add(((AC0120010Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_ONEROUS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_FLG == null) {
			l_ONEROUS_FLG = new ArrayList();
		} else {
			l_ONEROUS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_FLG.add(((AC0120010Struct) list.get(i)).getONEROUS_FLG());
		}
		return size;
	}
	public int setL2L_SysPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SysPLANT_CD == null) {
			l_SysPLANT_CD = new ArrayList();
		} else {
			l_SysPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SysPLANT_CD.add(((AC0120010Struct) list.get(i)).getSysPLANT_CD());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AC0120010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NAME == null) {
			l_NAME = new ArrayList();
		} else {
			l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NAME.add(((AC0120010Struct) list.get(i)).getNAME());
		}
		return size;
	}
	public int setL2L_MY_COMPANY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MY_COMPANY == null) {
			l_MY_COMPANY = new ArrayList();
		} else {
			l_MY_COMPANY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MY_COMPANY.add(((AC0120010Struct) list.get(i)).getMY_COMPANY());
		}
		return size;
	}
	public int setL2L_PVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVEND_CD == null) {
			l_PVEND_CD = new ArrayList();
		} else {
			l_PVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVEND_CD.add(((AC0120010Struct) list.get(i)).getPVEND_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AC0120010Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AC0120010Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AC0120010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AC0120010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AC0120010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AC0120010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_AMOUNT == null) {
			l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_AMOUNT.add(((AC0120010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP == null) {
			l_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP.add(((AC0120010Struct) list.get(i)).getSPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP == null) {
			l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP.add(((AC0120010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((AC0120010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_1 == null) {
			l_TAX_RATE_1 = new ArrayList();
		} else {
			l_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_1.add(((AC0120010Struct) list.get(i)).getTAX_RATE_1());
		}
		return size;
	}
	public int setL2L_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_2 == null) {
			l_TAX_RATE_2 = new ArrayList();
		} else {
			l_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_2.add(((AC0120010Struct) list.get(i)).getTAX_RATE_2());
		}
		return size;
	}
	public int setL2L_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_3 == null) {
			l_TAX_RATE_3 = new ArrayList();
		} else {
			l_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_3.add(((AC0120010Struct) list.get(i)).getTAX_RATE_3());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_1 == null) {
			l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_1.add(((AC0120010Struct) list.get(i)).getTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_2 == null) {
			l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_2.add(((AC0120010Struct) list.get(i)).getTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_3 == null) {
			l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_3.add(((AC0120010Struct) list.get(i)).getTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AMOUNT_INCLUDE_TAX == null) {
			l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AMOUNT_INCLUDE_TAX.add(((AC0120010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_AMOUNT == null) {
			l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_AMOUNT.add(((AC0120010Struct) list.get(i)).getHOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AC0120010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_ROUND_TYP == null) {
			l_TAX_ROUND_TYP = new ArrayList();
		} else {
			l_TAX_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_ROUND_TYP.add(((AC0120010Struct) list.get(i)).getTAX_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_WH_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD1 == null) {
			l_WH_CD1 = new ArrayList();
		} else {
			l_WH_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD1.add(((AC0120010Struct) list.get(i)).getWH_CD1());
		}
		return size;
	}
	public int setL2L_WH_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD2 == null) {
			l_WH_CD2 = new ArrayList();
		} else {
			l_WH_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD2.add(((AC0120010Struct) list.get(i)).getWH_CD2());
		}
		return size;
	}
	public int setL2L_WH_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD3 == null) {
			l_WH_CD3 = new ArrayList();
		} else {
			l_WH_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD3.add(((AC0120010Struct) list.get(i)).getWH_CD3());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_NAME == null) {
			l_OWN_PERSON_NAME = new ArrayList();
		} else {
			l_OWN_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_NAME.add(((AC0120010Struct) list.get(i)).getOWN_PERSON_NAME());
		}
		return size;
	}
	public int setL2L_PVC2BUSINESSNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BUSINESSNAME == null) {
			l_PVC2BUSINESSNAME = new ArrayList();
		} else {
			l_PVC2BUSINESSNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BUSINESSNAME.add(((AC0120010Struct) list.get(i)).getPVC2BUSINESSNAME());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTPATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTPATH == null) {
			l_PVC2OUTPUTPATH = new ArrayList();
		} else {
			l_PVC2OUTPUTPATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTPATH.add(((AC0120010Struct) list.get(i)).getPVC2OUTPUTPATH());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTNAME == null) {
			l_PVC2OUTPUTNAME = new ArrayList();
		} else {
			l_PVC2OUTPUTNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTNAME.add(((AC0120010Struct) list.get(i)).getPVC2OUTPUTNAME());
		}
		return size;
	}
	public int setL2L_PVC2LOGMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2LOGMODE == null) {
			l_PVC2LOGMODE = new ArrayList();
		} else {
			l_PVC2LOGMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2LOGMODE.add(((AC0120010Struct) list.get(i)).getPVC2LOGMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTMODE == null) {
			l_PVC2OUTPUTMODE = new ArrayList();
		} else {
			l_PVC2OUTPUTMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTMODE.add(((AC0120010Struct) list.get(i)).getPVC2OUTPUTMODE());
		}
		return size;
	}
	public int setL2L_PVC2USERID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2USERID == null) {
			l_PVC2USERID = new ArrayList();
		} else {
			l_PVC2USERID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2USERID.add(((AC0120010Struct) list.get(i)).getPVC2USERID());
		}
		return size;
	}
	public int setL2L_PVC2PLANTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2PLANTCD == null) {
			l_PVC2PLANTCD = new ArrayList();
		} else {
			l_PVC2PLANTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2PLANTCD.add(((AC0120010Struct) list.get(i)).getPVC2PLANTCD());
		}
		return size;
	}
	public int setL2L_PVC2TAXID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2TAXID == null) {
			l_PVC2TAXID = new ArrayList();
		} else {
			l_PVC2TAXID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2TAXID.add(((AC0120010Struct) list.get(i)).getPVC2TAXID());
		}
		return size;
	}
	public int setL2L_VEND_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_DECIMAL_FIG == null) {
			l_VEND_DECIMAL_FIG = new ArrayList();
		} else {
			l_VEND_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_DECIMAL_FIG.add(((AC0120010Struct) list.get(i)).getVEND_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT == null) {
			l_NET_AMOUNT = new ArrayList();
		} else {
			l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT.add(((AC0120010Struct) list.get(i)).getNET_AMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMTAXOUTAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXOUTAMOUNT == null) {
			l_PNUMTAXOUTAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXOUTAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXOUTAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMTAXOUTAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXAMOUNT == null) {
			l_PNUMTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMEXTERNALTAXSALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMEXTERNALTAXSALESAMOUNT == null) {
			l_PNUMEXTERNALTAXSALESAMOUNT = new ArrayList();
		} else {
			l_PNUMEXTERNALTAXSALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMEXTERNALTAXSALESAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMEXTERNALTAXSALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMINTERNALTAXSALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMINTERNALTAXSALESAMOUNT == null) {
			l_PNUMINTERNALTAXSALESAMOUNT = new ArrayList();
		} else {
			l_PNUMINTERNALTAXSALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMINTERNALTAXSALESAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMINTERNALTAXSALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMTAXFREESALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXFREESALESAMOUNT == null) {
			l_PNUMTAXFREESALESAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXFREESALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXFREESALESAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMTAXFREESALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMEXTERNALTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMEXTERNALTAXAMOUNT == null) {
			l_PNUMEXTERNALTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMEXTERNALTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMEXTERNALTAXAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMEXTERNALTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMINTERNALTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMINTERNALTAXAMOUNT == null) {
			l_PNUMINTERNALTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMINTERNALTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMINTERNALTAXAMOUNT.add(((AC0120010Struct) list.get(i)).getPNUMINTERNALTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PVC2ERRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2ERRCD == null) {
			l_PVC2ERRCD = new ArrayList();
		} else {
			l_PVC2ERRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2ERRCD.add(((AC0120010Struct) list.get(i)).getPVC2ERRCD());
		}
		return size;
	}
	public int setL2L_PNUMSTATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMSTATUS == null) {
			l_PNUMSTATUS = new ArrayList();
		} else {
			l_PNUMSTATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMSTATUS.add(((AC0120010Struct) list.get(i)).getPNUMSTATUS());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_CD == null) {
			l_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_CD.add(((AC0120010Struct) list.get(i)).getPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_NAME == null) {
			l_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getPARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_PARENT_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_DRAW_CD == null) {
			l_PARENT_DRAW_CD = new ArrayList();
		} else {
			l_PARENT_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_DRAW_CD.add(((AC0120010Struct) list.get(i)).getPARENT_DRAW_CD());
		}
		return size;
	}
	public int setL2L_PARENT_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_SPEC == null) {
			l_PARENT_SPEC = new ArrayList();
		} else {
			l_PARENT_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_SPEC.add(((AC0120010Struct) list.get(i)).getPARENT_SPEC());
		}
		return size;
	}
	public int setL2L_PARENT_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OUTSIDE_TYP == null) {
			l_PARENT_OUTSIDE_TYP = new ArrayList();
		} else {
			l_PARENT_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OUTSIDE_TYP.add(((AC0120010Struct) list.get(i)).getPARENT_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_EDITION == null) {
			l_PS_EDITION = new ArrayList();
		} else {
			l_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_EDITION.add(((AC0120010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_DENOMINATOR == null) {
			l_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_DENOMINATOR.add(((AC0120010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_NUMERATOR == null) {
			l_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_NUMERATOR.add(((AC0120010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_SPOIL == null) {
			l_PS_SPOIL = new ArrayList();
		} else {
			l_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_SPOIL.add(((AC0120010Struct) list.get(i)).getPS_SPOIL());
		}
		return size;
	}
	public int setL2L_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_LT_FLG == null) {
			l_PS_LT_FLG = new ArrayList();
		} else {
			l_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_LT_FLG.add(((AC0120010Struct) list.get(i)).getPS_LT_FLG());
		}
		return size;
	}
	public int setL2L_PS_KEY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_KEY == null) {
			l_PS_KEY = new ArrayList();
		} else {
			l_PS_KEY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_KEY.add(((AC0120010Struct) list.get(i)).getPS_KEY());
		}
		return size;
	}
	public int setL2L_CHILD_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHILD_ITEM_NAME == null) {
			l_CHILD_ITEM_NAME = new ArrayList();
		} else {
			l_CHILD_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHILD_ITEM_NAME.add(((AC0120010Struct) list.get(i)).getCHILD_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_CHILD_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHILD_DRAW_CD == null) {
			l_CHILD_DRAW_CD = new ArrayList();
		} else {
			l_CHILD_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHILD_DRAW_CD.add(((AC0120010Struct) list.get(i)).getCHILD_DRAW_CD());
		}
		return size;
	}
	public int setL2L_CHILD_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHILD_SPEC == null) {
			l_CHILD_SPEC = new ArrayList();
		} else {
			l_CHILD_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHILD_SPEC.add(((AC0120010Struct) list.get(i)).getCHILD_SPEC());
		}
		return size;
	}
	public int setL2L_CHILD_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHILD_OUTSIDE_TYP == null) {
			l_CHILD_OUTSIDE_TYP = new ArrayList();
		} else {
			l_CHILD_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHILD_OUTSIDE_TYP.add(((AC0120010Struct) list.get(i)).getCHILD_OUTSIDE_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_InitLevel = null;
		m_id = null;
		m_lvl = null;
		m_parent = null;
		m_label = null;
		m_ctx = null;
		m_maxid = null;
		m_OUTSIDE_TYP_DN = null;
		m_UNIT_QTY_TYP_DN = null;
		m_ODR_STS_TYP_DN = null;
		m_DM_STS_TYP_DN = null;
		m_OD_TYP_DN = null;
		m_Sub1_OUTSIDE_TYP_name = null;
		m_Sub1_OUTSIDE_TYP_val = null;
		m_Sub1_MRP_ODR_TYP_DN = null;
		m_Sub1_UNIT_QTY_TYP_DN = null;
		m_AC0120010tree1 = null;
		m_c_JOB_ODR_DEL = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_OD_GNR_TYP_DN = null;
		m_Sub1_DUE_TIME = null;
		m_Sub1_DUE_TIME2 = null;
		m_Sub1_DUE_TIME3 = null;
		m_Sub1_PRD_DUE_TIME = null;
		m_Sub1_PRD_START_TIME = null;
		m_Sub1_ODR_START_TIME = null;
		m_MANHOUR_TYP_DN = null;
		m_OPR_RSLT_TYP_DN = null;
		m_DOWNLOAD_FILE = null;
		m_JOB_ODR_STS_TYP1 = null;
		m_h_DM_STS_TYP = null;
		m_h_ODR_STS_TYP = null;
		m_h_size = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_ODR_TYP_val = null;
		m_UNIT_QTY_TYP_name = null;
		m_UNIT_QTY_TYP_val = null;
		m_JOB_ODR_TYP_DN = null;
		m_MRP_ODR_TYP_DN = null;
		m_OD_NO = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_OD_TYP = null;
		m_ODR_STS_TYP = null;
		m_DM_STS_TYP = null;
		m_MRP_ODR_TYP = null;
		m_MRP_TYP = null;
		m_Sub1_OUTSIDE_TYP = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_EXP_TYP = null;
		m_MODIFY_COUNT = null;
		m_MANHOUR_TYP = null;
		m_TOTAL_RCV_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_PARENT_OD_NO = null;
		m_CHIID_OD_NO = null;
		m_JOB_ODR_TYP = null;
		m_ALC_GRP_CD = null;
		m_Detail_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_OUTSIDE_TYP = null;
		m_ITEM_SPOIL = null;
		m_UNIT_QTY_TYP = null;
		m_JOB_ODR_DLV_DATE = null;
		m_DUE_DATE = null;
		m_PRD_DUE_DATE = null;
		m_PRD_START_DATE = null;
		m_ODR_START_DATE = null;
		m_SUM_PUCH_ODR_QTY = null;
		m_SUM_OPR_INST_QTY = null;
		m_ODR_QTY = null;
		m_DM_QTY = null;
		m_SUM_ALCD_QTY = null;
		m_STOCK_UNIT = null;
		m_OD_GNR_TYP = null;
		m_OPR_RSLT_TYP = null;
		m_Sub1_PARENT_OD_NO = null;
		m_Sub1_Parent_ITEM_CD = null;
		m_Sub1_Parent_ITEM_NAME = null;
		m_h_Sub1_Parent_OD_LEVEL_NO = null;
		m_h_Parent_OD_MODIFY_COUNT = null;
		m_h_Sub1_Parent_ODR_QTY = null;
		m_h_Sub1_Parent_ODR_START_DATE = null;
		m_h_Sub1_Parent_ALC_GRP_CD = null;
		m_h_Sub1_ODR_STS_TYP = null;
		m_h_Sub1_DM_STS_TYP = null;
		m_Sub1_Comp_ITEM_CD = null;
		m_Sub1_Comp_ITEM_NAME = null;
		m_Sub1_DRAW_CD = null;
		m_Sub1_SPEC = null;
		m_h_Sub1_MRP_ODR_TYP = null;
		m_Sub1_ITEM_SPOIL = null;
		m_Sub1_PS_SPOIL = null;
		m_h_Sub1_UNIT_QTY_TYP = null;
		m_Sub1_DUE_DATE = null;
		m_Sub1_PRD_DUE_DATE = null;
		m_Sub1_PRD_START_DATE = null;
		m_Sub1_ODR_START_DATE = null;
		m_Sub1_ODR_QTY = null;
		m_Sub1_DM_QTY = null;
		m_Sub1_STOCK_UNIT = null;
		m_Sub1_PS_UNIT_DENOMINATOR = null;
		m_Sub1_PS_UNIT_NUMERATOR = null;
		m_ODR_LT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_ISSUE_LT = null;
		m_PROP_LOT_SIZE = null;
		m_h_Comp_ITEM_MODIFY_COUNT = null;
		m_Sub1_OD_TYP = null;
		m_h_Sub1_PS_UNIT_QTY = null;
		m_h_Sub1_OD_MODIFY_COUNT = null;
		m_h_Sub1_MANHOUR_TYP = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_L_Sub1_DUE_DATE = null;
		m_L_Sub1_ODR_START_DATE = null;
		m_L_Sub1_PRD_DUE_DATE = null;
		m_L_Sub1_PRD_START_DATE = null;
		m_Sub1_MRP_ODR_TYP = null;
		m_ISSUE_TYP = null;
		m_Sub1_PS_UNIT_QTY = null;
		m_OD_LEVEL_NO = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_setDM_QTY = null;
		m_setOUTSIDE_TYP = null;
		m_setPS_UNIT_QTY = null;
		m_setPS_SPOIL = null;
		m_setPS_UNIT_DENOMINATOR = null;
		m_setPS_UNIT_NUMERATOR = null;
		m_setMRP_TYP = null;
		m_setITEM_SPOIL = null;
		m_setOD_NO = null;
		m_h_Sub1_ISSUE_TYP = null;
		m_CAL_NO = null;
		m_ITEM_MODIFY_COUNT = null;
		m_OD_MODIFY_COUNT = null;
		m_PROC_CD = null;
		m_VEND_CD = null;
		m_COMPANY_CD = null;
		m_setDUE_DATE = null;
		m_setPRD_DUE_DATE = null;
		m_setPRD_START_DATE = null;
		m_setODR_START_DATE = null;
		m_setODR_QTY = null;
		m_setOD_TYP = null;
		m_setODR_STS_TYP = null;
		m_MIN_CAL_DATE = null;
		m_MAX_CAL_DATE = null;
		m_OD_CALC_FLG = null;
		m_TIME_CTRL = null;
		m_WORK_ODR_CD = null;
		m_WORK_STS_TYP = null;
		m_WS_CD = null;
		m_PROC_EXPLOSION_FLG = null;
		m_Sub1_PUCH_ODR_CD = null;
		m_Sub1_COMPANY_CD = null;
		m_Sub1_VEND_CD = null;
		m_PUCH_ODR_STS_TYP = null;
		m_COUNT = null;
		m_FINAL_PROC_FLG = null;
		m_OPR_INST_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_TOTAL_ACPT_QTY = null;
		m_TOTAL_DEFECT_QTY = null;
		m_ACPT_QTY = null;
		m_PUCH_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_Sub1_WORK_IN_PROC_CD = null;
		m_WH_CD = null;
		m_CONS_TYP = null;
		m_ONEROUS_FLG = null;
		m_SysPLANT_CD = null;
		m_VALUE = null;
		m_NAME = null;
		m_MY_COMPANY = null;
		m_PVEND_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_ODR_AMOUNT = null;
		m_SPL_ITEM_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_EXCH_RATE = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_TAX_CD = null;
		m_TAX_ROUND_TYP = null;
		m_WH_CD1 = null;
		m_WH_CD2 = null;
		m_WH_CD3 = null;
		m_OWN_PERSON_NAME = null;
		m_PVC2BUSINESSNAME = null;
		m_PVC2OUTPUTPATH = null;
		m_PVC2OUTPUTNAME = null;
		m_PVC2LOGMODE = null;
		m_PVC2OUTPUTMODE = null;
		m_PVC2USERID = null;
		m_PVC2PLANTCD = null;
		m_PVC2TAXID = null;
		m_VEND_DECIMAL_FIG = null;
		m_NET_AMOUNT = null;
		m_PNUMTAXOUTAMOUNT = null;
		m_PNUMTAXAMOUNT = null;
		m_PNUMEXTERNALTAXSALESAMOUNT = null;
		m_PNUMINTERNALTAXSALESAMOUNT = null;
		m_PNUMTAXFREESALESAMOUNT = null;
		m_PNUMEXTERNALTAXAMOUNT = null;
		m_PNUMINTERNALTAXAMOUNT = null;
		m_PVC2ERRCD = null;
		m_PNUMSTATUS = null;
		m_PARENT_ITEM_CD = null;
		m_PARENT_ITEM_NAME = null;
		m_PARENT_DRAW_CD = null;
		m_PARENT_SPEC = null;
		m_PARENT_OUTSIDE_TYP = null;
		m_PS_EDITION = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_PS_SPOIL = null;
		m_PS_LT_FLG = null;
		m_PS_KEY = null;
		m_CHILD_ITEM_NAME = null;
		m_CHILD_DRAW_CD = null;
		m_CHILD_SPEC = null;
		m_CHILD_OUTSIDE_TYP = null;

		l_InitLevel = null;
		l_id = null;
		l_lvl = null;
		l_parent = null;
		l_label = null;
		l_ctx = null;
		l_maxid = null;
		l_OUTSIDE_TYP_DN = null;
		l_UNIT_QTY_TYP_DN = null;
		l_ODR_STS_TYP_DN = null;
		l_DM_STS_TYP_DN = null;
		l_OD_TYP_DN = null;
		l_Sub1_OUTSIDE_TYP_name = null;
		l_Sub1_OUTSIDE_TYP_val = null;
		l_Sub1_MRP_ODR_TYP_DN = null;
		l_Sub1_UNIT_QTY_TYP_DN = null;
		l_AC0120010tree1 = null;
		l_c_JOB_ODR_DEL = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_OD_GNR_TYP_DN = null;
		l_Sub1_DUE_TIME = null;
		l_Sub1_DUE_TIME2 = null;
		l_Sub1_DUE_TIME3 = null;
		l_Sub1_PRD_DUE_TIME = null;
		l_Sub1_PRD_START_TIME = null;
		l_Sub1_ODR_START_TIME = null;
		l_MANHOUR_TYP_DN = null;
		l_OPR_RSLT_TYP_DN = null;
		l_DOWNLOAD_FILE = null;
		l_JOB_ODR_STS_TYP1 = null;
		l_h_DM_STS_TYP = null;
		l_h_ODR_STS_TYP = null;
		l_h_size = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_ODR_TYP_val = null;
		l_UNIT_QTY_TYP_name = null;
		l_UNIT_QTY_TYP_val = null;
		l_JOB_ODR_TYP_DN = null;
		l_MRP_ODR_TYP_DN = null;
		l_OD_NO = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_OD_TYP = null;
		l_ODR_STS_TYP = null;
		l_DM_STS_TYP = null;
		l_MRP_ODR_TYP = null;
		l_MRP_TYP = null;
		l_Sub1_OUTSIDE_TYP = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_EXP_TYP = null;
		l_MODIFY_COUNT = null;
		l_MANHOUR_TYP = null;
		l_TOTAL_RCV_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_PARENT_OD_NO = null;
		l_CHIID_OD_NO = null;
		l_JOB_ODR_TYP = null;
		l_ALC_GRP_CD = null;
		l_Detail_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_OUTSIDE_TYP = null;
		l_ITEM_SPOIL = null;
		l_UNIT_QTY_TYP = null;
		l_JOB_ODR_DLV_DATE = null;
		l_DUE_DATE = null;
		l_PRD_DUE_DATE = null;
		l_PRD_START_DATE = null;
		l_ODR_START_DATE = null;
		l_SUM_PUCH_ODR_QTY = null;
		l_SUM_OPR_INST_QTY = null;
		l_ODR_QTY = null;
		l_DM_QTY = null;
		l_SUM_ALCD_QTY = null;
		l_STOCK_UNIT = null;
		l_OD_GNR_TYP = null;
		l_OPR_RSLT_TYP = null;
		l_Sub1_PARENT_OD_NO = null;
		l_Sub1_Parent_ITEM_CD = null;
		l_Sub1_Parent_ITEM_NAME = null;
		l_h_Sub1_Parent_OD_LEVEL_NO = null;
		l_h_Parent_OD_MODIFY_COUNT = null;
		l_h_Sub1_Parent_ODR_QTY = null;
		l_h_Sub1_Parent_ODR_START_DATE = null;
		l_h_Sub1_Parent_ALC_GRP_CD = null;
		l_h_Sub1_ODR_STS_TYP = null;
		l_h_Sub1_DM_STS_TYP = null;
		l_Sub1_Comp_ITEM_CD = null;
		l_Sub1_Comp_ITEM_NAME = null;
		l_Sub1_DRAW_CD = null;
		l_Sub1_SPEC = null;
		l_h_Sub1_MRP_ODR_TYP = null;
		l_Sub1_ITEM_SPOIL = null;
		l_Sub1_PS_SPOIL = null;
		l_h_Sub1_UNIT_QTY_TYP = null;
		l_Sub1_DUE_DATE = null;
		l_Sub1_PRD_DUE_DATE = null;
		l_Sub1_PRD_START_DATE = null;
		l_Sub1_ODR_START_DATE = null;
		l_Sub1_ODR_QTY = null;
		l_Sub1_DM_QTY = null;
		l_Sub1_STOCK_UNIT = null;
		l_Sub1_PS_UNIT_DENOMINATOR = null;
		l_Sub1_PS_UNIT_NUMERATOR = null;
		l_ODR_LT = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_ISSUE_LT = null;
		l_PROP_LOT_SIZE = null;
		l_h_Comp_ITEM_MODIFY_COUNT = null;
		l_Sub1_OD_TYP = null;
		l_h_Sub1_PS_UNIT_QTY = null;
		l_h_Sub1_OD_MODIFY_COUNT = null;
		l_h_Sub1_MANHOUR_TYP = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_L_Sub1_DUE_DATE = null;
		l_L_Sub1_ODR_START_DATE = null;
		l_L_Sub1_PRD_DUE_DATE = null;
		l_L_Sub1_PRD_START_DATE = null;
		l_Sub1_MRP_ODR_TYP = null;
		l_ISSUE_TYP = null;
		l_Sub1_PS_UNIT_QTY = null;
		l_OD_LEVEL_NO = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_setDM_QTY = null;
		l_setOUTSIDE_TYP = null;
		l_setPS_UNIT_QTY = null;
		l_setPS_SPOIL = null;
		l_setPS_UNIT_DENOMINATOR = null;
		l_setPS_UNIT_NUMERATOR = null;
		l_setMRP_TYP = null;
		l_setITEM_SPOIL = null;
		l_setOD_NO = null;
		l_h_Sub1_ISSUE_TYP = null;
		l_CAL_NO = null;
		l_ITEM_MODIFY_COUNT = null;
		l_OD_MODIFY_COUNT = null;
		l_PROC_CD = null;
		l_VEND_CD = null;
		l_COMPANY_CD = null;
		l_setDUE_DATE = null;
		l_setPRD_DUE_DATE = null;
		l_setPRD_START_DATE = null;
		l_setODR_START_DATE = null;
		l_setODR_QTY = null;
		l_setOD_TYP = null;
		l_setODR_STS_TYP = null;
		l_MIN_CAL_DATE = null;
		l_MAX_CAL_DATE = null;
		l_OD_CALC_FLG = null;
		l_TIME_CTRL = null;
		l_WORK_ODR_CD = null;
		l_WORK_STS_TYP = null;
		l_WS_CD = null;
		l_PROC_EXPLOSION_FLG = null;
		l_Sub1_PUCH_ODR_CD = null;
		l_Sub1_COMPANY_CD = null;
		l_Sub1_VEND_CD = null;
		l_PUCH_ODR_STS_TYP = null;
		l_COUNT = null;
		l_FINAL_PROC_FLG = null;
		l_OPR_INST_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_TOTAL_ACPT_QTY = null;
		l_TOTAL_DEFECT_QTY = null;
		l_ACPT_QTY = null;
		l_PUCH_ODR_CD = null;
		l_ISSUE_INST_CD = null;
		l_Sub1_WORK_IN_PROC_CD = null;
		l_WH_CD = null;
		l_CONS_TYP = null;
		l_ONEROUS_FLG = null;
		l_SysPLANT_CD = null;
		l_VALUE = null;
		l_NAME = null;
		l_MY_COMPANY = null;
		l_PVEND_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_ODR_AMOUNT = null;
		l_SPL_ITEM_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_EXCH_RATE = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_TAX_CD = null;
		l_TAX_ROUND_TYP = null;
		l_WH_CD1 = null;
		l_WH_CD2 = null;
		l_WH_CD3 = null;
		l_OWN_PERSON_NAME = null;
		l_PVC2BUSINESSNAME = null;
		l_PVC2OUTPUTPATH = null;
		l_PVC2OUTPUTNAME = null;
		l_PVC2LOGMODE = null;
		l_PVC2OUTPUTMODE = null;
		l_PVC2USERID = null;
		l_PVC2PLANTCD = null;
		l_PVC2TAXID = null;
		l_VEND_DECIMAL_FIG = null;
		l_NET_AMOUNT = null;
		l_PNUMTAXOUTAMOUNT = null;
		l_PNUMTAXAMOUNT = null;
		l_PNUMEXTERNALTAXSALESAMOUNT = null;
		l_PNUMINTERNALTAXSALESAMOUNT = null;
		l_PNUMTAXFREESALESAMOUNT = null;
		l_PNUMEXTERNALTAXAMOUNT = null;
		l_PNUMINTERNALTAXAMOUNT = null;
		l_PVC2ERRCD = null;
		l_PNUMSTATUS = null;
		l_PARENT_ITEM_CD = null;
		l_PARENT_ITEM_NAME = null;
		l_PARENT_DRAW_CD = null;
		l_PARENT_SPEC = null;
		l_PARENT_OUTSIDE_TYP = null;
		l_PS_EDITION = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_PS_SPOIL = null;
		l_PS_LT_FLG = null;
		l_PS_KEY = null;
		l_CHILD_ITEM_NAME = null;
		l_CHILD_DRAW_CD = null;
		l_CHILD_SPEC = null;
		l_CHILD_OUTSIDE_TYP = null;

		return;
	}

	//////////////////////////////
	// Orteus標準Struct
	// ユーザコード
	public String sUser_ID = null;
	// set/getメソッド
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// 組織コード
	public String sOrganization_CD = null;
	// set/getメソッド
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// 処理日付
	public String sSysdate = null;
	// set/getメソッド
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medAC0120010クラスの標準コンストラクタ
	 */
	public AC0120010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: ここに初期処理を記述してください
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * データのセット(個別メンバ・リストメンバ両方)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStruct(AC0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * データのセット(個別メンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructM(AC0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setInitLevel(struct.getInitLevel());
			this.setid(struct.getid());
			this.setlvl(struct.getlvl());
			this.setparent(struct.getparent());
			this.setlabel(struct.getlabel());
			this.setctx(struct.getctx());
			this.setmaxid(struct.getmaxid());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setUNIT_QTY_TYP_DN(struct.getUNIT_QTY_TYP_DN());
			this.setODR_STS_TYP_DN(struct.getODR_STS_TYP_DN());
			this.setDM_STS_TYP_DN(struct.getDM_STS_TYP_DN());
			this.setOD_TYP_DN(struct.getOD_TYP_DN());
			this.setSub1_OUTSIDE_TYP_name(struct.getSub1_OUTSIDE_TYP_name());
			this.setSub1_OUTSIDE_TYP_val(struct.getSub1_OUTSIDE_TYP_val());
			this.setSub1_MRP_ODR_TYP_DN(struct.getSub1_MRP_ODR_TYP_DN());
			this.setSub1_UNIT_QTY_TYP_DN(struct.getSub1_UNIT_QTY_TYP_DN());
			this.setAC0120010tree1(struct.getAC0120010tree1());
			this.setc_JOB_ODR_DEL(struct.getc_JOB_ODR_DEL());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setOD_GNR_TYP_DN(struct.getOD_GNR_TYP_DN());
			this.setSub1_DUE_TIME(struct.getSub1_DUE_TIME());
			this.setSub1_DUE_TIME2(struct.getSub1_DUE_TIME2());
			this.setSub1_DUE_TIME3(struct.getSub1_DUE_TIME3());
			this.setSub1_PRD_DUE_TIME(struct.getSub1_PRD_DUE_TIME());
			this.setSub1_PRD_START_TIME(struct.getSub1_PRD_START_TIME());
			this.setSub1_ODR_START_TIME(struct.getSub1_ODR_START_TIME());
			this.setMANHOUR_TYP_DN(struct.getMANHOUR_TYP_DN());
			this.setOPR_RSLT_TYP_DN(struct.getOPR_RSLT_TYP_DN());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setJOB_ODR_STS_TYP1(struct.getJOB_ODR_STS_TYP1());
			this.seth_DM_STS_TYP(struct.geth_DM_STS_TYP());
			this.seth_ODR_STS_TYP(struct.geth_ODR_STS_TYP());
			this.seth_size(struct.geth_size());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setUNIT_QTY_TYP_name(struct.getUNIT_QTY_TYP_name());
			this.setUNIT_QTY_TYP_val(struct.getUNIT_QTY_TYP_val());
			this.setJOB_ODR_TYP_DN(struct.getJOB_ODR_TYP_DN());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
			this.setOD_NO(struct.getOD_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setOD_TYP(struct.getOD_TYP());
			this.setODR_STS_TYP(struct.getODR_STS_TYP());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setSub1_OUTSIDE_TYP(struct.getSub1_OUTSIDE_TYP());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_EXP_TYP(struct.getJOB_ODR_EXP_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setTOTAL_RCV_QTY(struct.getTOTAL_RCV_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setCHIID_OD_NO(struct.getCHIID_OD_NO());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setDetail_ITEM_NAME(struct.getDetail_ITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setSUM_PUCH_ODR_QTY(struct.getSUM_PUCH_ODR_QTY());
			this.setSUM_OPR_INST_QTY(struct.getSUM_OPR_INST_QTY());
			this.setODR_QTY(struct.getODR_QTY());
			this.setDM_QTY(struct.getDM_QTY());
			this.setSUM_ALCD_QTY(struct.getSUM_ALCD_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setOD_GNR_TYP(struct.getOD_GNR_TYP());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setSub1_PARENT_OD_NO(struct.getSub1_PARENT_OD_NO());
			this.setSub1_Parent_ITEM_CD(struct.getSub1_Parent_ITEM_CD());
			this.setSub1_Parent_ITEM_NAME(struct.getSub1_Parent_ITEM_NAME());
			this.seth_Sub1_Parent_OD_LEVEL_NO(struct.geth_Sub1_Parent_OD_LEVEL_NO());
			this.seth_Parent_OD_MODIFY_COUNT(struct.geth_Parent_OD_MODIFY_COUNT());
			this.seth_Sub1_Parent_ODR_QTY(struct.geth_Sub1_Parent_ODR_QTY());
			this.seth_Sub1_Parent_ODR_START_DATE(struct.geth_Sub1_Parent_ODR_START_DATE());
			this.seth_Sub1_Parent_ALC_GRP_CD(struct.geth_Sub1_Parent_ALC_GRP_CD());
			this.seth_Sub1_ODR_STS_TYP(struct.geth_Sub1_ODR_STS_TYP());
			this.seth_Sub1_DM_STS_TYP(struct.geth_Sub1_DM_STS_TYP());
			this.setSub1_Comp_ITEM_CD(struct.getSub1_Comp_ITEM_CD());
			this.setSub1_Comp_ITEM_NAME(struct.getSub1_Comp_ITEM_NAME());
			this.setSub1_DRAW_CD(struct.getSub1_DRAW_CD());
			this.setSub1_SPEC(struct.getSub1_SPEC());
			this.seth_Sub1_MRP_ODR_TYP(struct.geth_Sub1_MRP_ODR_TYP());
			this.setSub1_ITEM_SPOIL(struct.getSub1_ITEM_SPOIL());
			this.setSub1_PS_SPOIL(struct.getSub1_PS_SPOIL());
			this.seth_Sub1_UNIT_QTY_TYP(struct.geth_Sub1_UNIT_QTY_TYP());
			this.setSub1_DUE_DATE(struct.getSub1_DUE_DATE());
			this.setSub1_PRD_DUE_DATE(struct.getSub1_PRD_DUE_DATE());
			this.setSub1_PRD_START_DATE(struct.getSub1_PRD_START_DATE());
			this.setSub1_ODR_START_DATE(struct.getSub1_ODR_START_DATE());
			this.setSub1_ODR_QTY(struct.getSub1_ODR_QTY());
			this.setSub1_DM_QTY(struct.getSub1_DM_QTY());
			this.setSub1_STOCK_UNIT(struct.getSub1_STOCK_UNIT());
			this.setSub1_PS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());
			this.setSub1_PS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());
			this.setODR_LT(struct.getODR_LT());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setISSUE_LT(struct.getISSUE_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.seth_Comp_ITEM_MODIFY_COUNT(struct.geth_Comp_ITEM_MODIFY_COUNT());
			this.setSub1_OD_TYP(struct.getSub1_OD_TYP());
			this.seth_Sub1_PS_UNIT_QTY(struct.geth_Sub1_PS_UNIT_QTY());
			this.seth_Sub1_OD_MODIFY_COUNT(struct.geth_Sub1_OD_MODIFY_COUNT());
			this.seth_Sub1_MANHOUR_TYP(struct.geth_Sub1_MANHOUR_TYP());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setL_Sub1_DUE_DATE(struct.getL_Sub1_DUE_DATE());
			this.setL_Sub1_ODR_START_DATE(struct.getL_Sub1_ODR_START_DATE());
			this.setL_Sub1_PRD_DUE_DATE(struct.getL_Sub1_PRD_DUE_DATE());
			this.setL_Sub1_PRD_START_DATE(struct.getL_Sub1_PRD_START_DATE());
			this.setSub1_MRP_ODR_TYP(struct.getSub1_MRP_ODR_TYP());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setSub1_PS_UNIT_QTY(struct.getSub1_PS_UNIT_QTY());
			this.setOD_LEVEL_NO(struct.getOD_LEVEL_NO());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setsetDM_QTY(struct.getsetDM_QTY());
			this.setsetOUTSIDE_TYP(struct.getsetOUTSIDE_TYP());
			this.setsetPS_UNIT_QTY(struct.getsetPS_UNIT_QTY());
			this.setsetPS_SPOIL(struct.getsetPS_SPOIL());
			this.setsetPS_UNIT_DENOMINATOR(struct.getsetPS_UNIT_DENOMINATOR());
			this.setsetPS_UNIT_NUMERATOR(struct.getsetPS_UNIT_NUMERATOR());
			this.setsetMRP_TYP(struct.getsetMRP_TYP());
			this.setsetITEM_SPOIL(struct.getsetITEM_SPOIL());
			this.setsetOD_NO(struct.getsetOD_NO());
			this.seth_Sub1_ISSUE_TYP(struct.geth_Sub1_ISSUE_TYP());
			this.setCAL_NO(struct.getCAL_NO());
			this.setITEM_MODIFY_COUNT(struct.getITEM_MODIFY_COUNT());
			this.setOD_MODIFY_COUNT(struct.getOD_MODIFY_COUNT());
			this.setPROC_CD(struct.getPROC_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setsetDUE_DATE(struct.getsetDUE_DATE());
			this.setsetPRD_DUE_DATE(struct.getsetPRD_DUE_DATE());
			this.setsetPRD_START_DATE(struct.getsetPRD_START_DATE());
			this.setsetODR_START_DATE(struct.getsetODR_START_DATE());
			this.setsetODR_QTY(struct.getsetODR_QTY());
			this.setsetOD_TYP(struct.getsetOD_TYP());
			this.setsetODR_STS_TYP(struct.getsetODR_STS_TYP());
			this.setMIN_CAL_DATE(struct.getMIN_CAL_DATE());
			this.setMAX_CAL_DATE(struct.getMAX_CAL_DATE());
			this.setOD_CALC_FLG(struct.getOD_CALC_FLG());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setWS_CD(struct.getWS_CD());
			this.setPROC_EXPLOSION_FLG(struct.getPROC_EXPLOSION_FLG());
			this.setSub1_PUCH_ODR_CD(struct.getSub1_PUCH_ODR_CD());
			this.setSub1_COMPANY_CD(struct.getSub1_COMPANY_CD());
			this.setSub1_VEND_CD(struct.getSub1_VEND_CD());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setCOUNT(struct.getCOUNT());
			this.setFINAL_PROC_FLG(struct.getFINAL_PROC_FLG());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setTOTAL_ACPT_QTY(struct.getTOTAL_ACPT_QTY());
			this.setTOTAL_DEFECT_QTY(struct.getTOTAL_DEFECT_QTY());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setSub1_WORK_IN_PROC_CD(struct.getSub1_WORK_IN_PROC_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setSysPLANT_CD(struct.getSysPLANT_CD());
			this.setVALUE(struct.getVALUE());
			this.setNAME(struct.getNAME());
			this.setMY_COMPANY(struct.getMY_COMPANY());
			this.setPVEND_CD(struct.getPVEND_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setWH_CD1(struct.getWH_CD1());
			this.setWH_CD2(struct.getWH_CD2());
			this.setWH_CD3(struct.getWH_CD3());
			this.setOWN_PERSON_NAME(struct.getOWN_PERSON_NAME());
			this.setPVC2BUSINESSNAME(struct.getPVC2BUSINESSNAME());
			this.setPVC2OUTPUTPATH(struct.getPVC2OUTPUTPATH());
			this.setPVC2OUTPUTNAME(struct.getPVC2OUTPUTNAME());
			this.setPVC2LOGMODE(struct.getPVC2LOGMODE());
			this.setPVC2OUTPUTMODE(struct.getPVC2OUTPUTMODE());
			this.setPVC2USERID(struct.getPVC2USERID());
			this.setPVC2PLANTCD(struct.getPVC2PLANTCD());
			this.setPVC2TAXID(struct.getPVC2TAXID());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setPNUMTAXOUTAMOUNT(struct.getPNUMTAXOUTAMOUNT());
			this.setPNUMTAXAMOUNT(struct.getPNUMTAXAMOUNT());
			this.setPNUMEXTERNALTAXSALESAMOUNT(struct.getPNUMEXTERNALTAXSALESAMOUNT());
			this.setPNUMINTERNALTAXSALESAMOUNT(struct.getPNUMINTERNALTAXSALESAMOUNT());
			this.setPNUMTAXFREESALESAMOUNT(struct.getPNUMTAXFREESALESAMOUNT());
			this.setPNUMEXTERNALTAXAMOUNT(struct.getPNUMEXTERNALTAXAMOUNT());
			this.setPNUMINTERNALTAXAMOUNT(struct.getPNUMINTERNALTAXAMOUNT());
			this.setPVC2ERRCD(struct.getPVC2ERRCD());
			this.setPNUMSTATUS(struct.getPNUMSTATUS());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setPARENT_DRAW_CD(struct.getPARENT_DRAW_CD());
			this.setPARENT_SPEC(struct.getPARENT_SPEC());
			this.setPARENT_OUTSIDE_TYP(struct.getPARENT_OUTSIDE_TYP());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setPS_SPOIL(struct.getPS_SPOIL());
			this.setPS_LT_FLG(struct.getPS_LT_FLG());
			this.setPS_KEY(struct.getPS_KEY());
			this.setCHILD_ITEM_NAME(struct.getCHILD_ITEM_NAME());
			this.setCHILD_DRAW_CD(struct.getCHILD_DRAW_CD());
			this.setCHILD_SPEC(struct.getCHILD_SPEC());
			this.setCHILD_OUTSIDE_TYP(struct.getCHILD_OUTSIDE_TYP());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_InitLevel(struct.getList_InitLevel());
			this.setList_id(struct.getList_id());
			this.setList_lvl(struct.getList_lvl());
			this.setList_parent(struct.getList_parent());
			this.setList_label(struct.getList_label());
			this.setList_ctx(struct.getList_ctx());
			this.setList_maxid(struct.getList_maxid());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_UNIT_QTY_TYP_DN(struct.getList_UNIT_QTY_TYP_DN());
			this.setList_ODR_STS_TYP_DN(struct.getList_ODR_STS_TYP_DN());
			this.setList_DM_STS_TYP_DN(struct.getList_DM_STS_TYP_DN());
			this.setList_OD_TYP_DN(struct.getList_OD_TYP_DN());
			this.setList_Sub1_OUTSIDE_TYP_name(struct.getList_Sub1_OUTSIDE_TYP_name());
			this.setList_Sub1_OUTSIDE_TYP_val(struct.getList_Sub1_OUTSIDE_TYP_val());
			this.setList_Sub1_MRP_ODR_TYP_DN(struct.getList_Sub1_MRP_ODR_TYP_DN());
			this.setList_Sub1_UNIT_QTY_TYP_DN(struct.getList_Sub1_UNIT_QTY_TYP_DN());
			this.setList_AC0120010tree1(struct.getList_AC0120010tree1());
			this.setList_c_JOB_ODR_DEL(struct.getList_c_JOB_ODR_DEL());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_OD_GNR_TYP_DN(struct.getList_OD_GNR_TYP_DN());
			this.setList_Sub1_DUE_TIME(struct.getList_Sub1_DUE_TIME());
			this.setList_Sub1_DUE_TIME2(struct.getList_Sub1_DUE_TIME2());
			this.setList_Sub1_DUE_TIME3(struct.getList_Sub1_DUE_TIME3());
			this.setList_Sub1_PRD_DUE_TIME(struct.getList_Sub1_PRD_DUE_TIME());
			this.setList_Sub1_PRD_START_TIME(struct.getList_Sub1_PRD_START_TIME());
			this.setList_Sub1_ODR_START_TIME(struct.getList_Sub1_ODR_START_TIME());
			this.setList_MANHOUR_TYP_DN(struct.getList_MANHOUR_TYP_DN());
			this.setList_OPR_RSLT_TYP_DN(struct.getList_OPR_RSLT_TYP_DN());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_JOB_ODR_STS_TYP1(struct.getList_JOB_ODR_STS_TYP1());
			this.setList_h_DM_STS_TYP(struct.getList_h_DM_STS_TYP());
			this.setList_h_ODR_STS_TYP(struct.getList_h_ODR_STS_TYP());
			this.setList_h_size(struct.getList_h_size());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_UNIT_QTY_TYP_name(struct.getList_UNIT_QTY_TYP_name());
			this.setList_UNIT_QTY_TYP_val(struct.getList_UNIT_QTY_TYP_val());
			this.setList_JOB_ODR_TYP_DN(struct.getList_JOB_ODR_TYP_DN());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_ODR_STS_TYP(struct.getList_ODR_STS_TYP());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_Sub1_OUTSIDE_TYP(struct.getList_Sub1_OUTSIDE_TYP());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_EXP_TYP(struct.getList_JOB_ODR_EXP_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_TOTAL_RCV_QTY(struct.getList_TOTAL_RCV_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_CHIID_OD_NO(struct.getList_CHIID_OD_NO());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_Detail_ITEM_NAME(struct.getList_Detail_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_SUM_PUCH_ODR_QTY(struct.getList_SUM_PUCH_ODR_QTY());
			this.setList_SUM_OPR_INST_QTY(struct.getList_SUM_OPR_INST_QTY());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_SUM_ALCD_QTY(struct.getList_SUM_ALCD_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_OD_GNR_TYP(struct.getList_OD_GNR_TYP());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_Sub1_PARENT_OD_NO(struct.getList_Sub1_PARENT_OD_NO());
			this.setList_Sub1_Parent_ITEM_CD(struct.getList_Sub1_Parent_ITEM_CD());
			this.setList_Sub1_Parent_ITEM_NAME(struct.getList_Sub1_Parent_ITEM_NAME());
			this.setList_h_Sub1_Parent_OD_LEVEL_NO(struct.getList_h_Sub1_Parent_OD_LEVEL_NO());
			this.setList_h_Parent_OD_MODIFY_COUNT(struct.getList_h_Parent_OD_MODIFY_COUNT());
			this.setList_h_Sub1_Parent_ODR_QTY(struct.getList_h_Sub1_Parent_ODR_QTY());
			this.setList_h_Sub1_Parent_ODR_START_DATE(struct.getList_h_Sub1_Parent_ODR_START_DATE());
			this.setList_h_Sub1_Parent_ALC_GRP_CD(struct.getList_h_Sub1_Parent_ALC_GRP_CD());
			this.setList_h_Sub1_ODR_STS_TYP(struct.getList_h_Sub1_ODR_STS_TYP());
			this.setList_h_Sub1_DM_STS_TYP(struct.getList_h_Sub1_DM_STS_TYP());
			this.setList_Sub1_Comp_ITEM_CD(struct.getList_Sub1_Comp_ITEM_CD());
			this.setList_Sub1_Comp_ITEM_NAME(struct.getList_Sub1_Comp_ITEM_NAME());
			this.setList_Sub1_DRAW_CD(struct.getList_Sub1_DRAW_CD());
			this.setList_Sub1_SPEC(struct.getList_Sub1_SPEC());
			this.setList_h_Sub1_MRP_ODR_TYP(struct.getList_h_Sub1_MRP_ODR_TYP());
			this.setList_Sub1_ITEM_SPOIL(struct.getList_Sub1_ITEM_SPOIL());
			this.setList_Sub1_PS_SPOIL(struct.getList_Sub1_PS_SPOIL());
			this.setList_h_Sub1_UNIT_QTY_TYP(struct.getList_h_Sub1_UNIT_QTY_TYP());
			this.setList_Sub1_DUE_DATE(struct.getList_Sub1_DUE_DATE());
			this.setList_Sub1_PRD_DUE_DATE(struct.getList_Sub1_PRD_DUE_DATE());
			this.setList_Sub1_PRD_START_DATE(struct.getList_Sub1_PRD_START_DATE());
			this.setList_Sub1_ODR_START_DATE(struct.getList_Sub1_ODR_START_DATE());
			this.setList_Sub1_ODR_QTY(struct.getList_Sub1_ODR_QTY());
			this.setList_Sub1_DM_QTY(struct.getList_Sub1_DM_QTY());
			this.setList_Sub1_STOCK_UNIT(struct.getList_Sub1_STOCK_UNIT());
			this.setList_Sub1_PS_UNIT_DENOMINATOR(struct.getList_Sub1_PS_UNIT_DENOMINATOR());
			this.setList_Sub1_PS_UNIT_NUMERATOR(struct.getList_Sub1_PS_UNIT_NUMERATOR());
			this.setList_ODR_LT(struct.getList_ODR_LT());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_ISSUE_LT(struct.getList_ISSUE_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_h_Comp_ITEM_MODIFY_COUNT(struct.getList_h_Comp_ITEM_MODIFY_COUNT());
			this.setList_Sub1_OD_TYP(struct.getList_Sub1_OD_TYP());
			this.setList_h_Sub1_PS_UNIT_QTY(struct.getList_h_Sub1_PS_UNIT_QTY());
			this.setList_h_Sub1_OD_MODIFY_COUNT(struct.getList_h_Sub1_OD_MODIFY_COUNT());
			this.setList_h_Sub1_MANHOUR_TYP(struct.getList_h_Sub1_MANHOUR_TYP());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_L_Sub1_DUE_DATE(struct.getList_L_Sub1_DUE_DATE());
			this.setList_L_Sub1_ODR_START_DATE(struct.getList_L_Sub1_ODR_START_DATE());
			this.setList_L_Sub1_PRD_DUE_DATE(struct.getList_L_Sub1_PRD_DUE_DATE());
			this.setList_L_Sub1_PRD_START_DATE(struct.getList_L_Sub1_PRD_START_DATE());
			this.setList_Sub1_MRP_ODR_TYP(struct.getList_Sub1_MRP_ODR_TYP());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_Sub1_PS_UNIT_QTY(struct.getList_Sub1_PS_UNIT_QTY());
			this.setList_OD_LEVEL_NO(struct.getList_OD_LEVEL_NO());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_setDM_QTY(struct.getList_setDM_QTY());
			this.setList_setOUTSIDE_TYP(struct.getList_setOUTSIDE_TYP());
			this.setList_setPS_UNIT_QTY(struct.getList_setPS_UNIT_QTY());
			this.setList_setPS_SPOIL(struct.getList_setPS_SPOIL());
			this.setList_setPS_UNIT_DENOMINATOR(struct.getList_setPS_UNIT_DENOMINATOR());
			this.setList_setPS_UNIT_NUMERATOR(struct.getList_setPS_UNIT_NUMERATOR());
			this.setList_setMRP_TYP(struct.getList_setMRP_TYP());
			this.setList_setITEM_SPOIL(struct.getList_setITEM_SPOIL());
			this.setList_setOD_NO(struct.getList_setOD_NO());
			this.setList_h_Sub1_ISSUE_TYP(struct.getList_h_Sub1_ISSUE_TYP());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_ITEM_MODIFY_COUNT(struct.getList_ITEM_MODIFY_COUNT());
			this.setList_OD_MODIFY_COUNT(struct.getList_OD_MODIFY_COUNT());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_setDUE_DATE(struct.getList_setDUE_DATE());
			this.setList_setPRD_DUE_DATE(struct.getList_setPRD_DUE_DATE());
			this.setList_setPRD_START_DATE(struct.getList_setPRD_START_DATE());
			this.setList_setODR_START_DATE(struct.getList_setODR_START_DATE());
			this.setList_setODR_QTY(struct.getList_setODR_QTY());
			this.setList_setOD_TYP(struct.getList_setOD_TYP());
			this.setList_setODR_STS_TYP(struct.getList_setODR_STS_TYP());
			this.setList_MIN_CAL_DATE(struct.getList_MIN_CAL_DATE());
			this.setList_MAX_CAL_DATE(struct.getList_MAX_CAL_DATE());
			this.setList_OD_CALC_FLG(struct.getList_OD_CALC_FLG());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_PROC_EXPLOSION_FLG(struct.getList_PROC_EXPLOSION_FLG());
			this.setList_Sub1_PUCH_ODR_CD(struct.getList_Sub1_PUCH_ODR_CD());
			this.setList_Sub1_COMPANY_CD(struct.getList_Sub1_COMPANY_CD());
			this.setList_Sub1_VEND_CD(struct.getList_Sub1_VEND_CD());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_FINAL_PROC_FLG(struct.getList_FINAL_PROC_FLG());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_TOTAL_ACPT_QTY(struct.getList_TOTAL_ACPT_QTY());
			this.setList_TOTAL_DEFECT_QTY(struct.getList_TOTAL_DEFECT_QTY());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_Sub1_WORK_IN_PROC_CD(struct.getList_Sub1_WORK_IN_PROC_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_SysPLANT_CD(struct.getList_SysPLANT_CD());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_MY_COMPANY(struct.getList_MY_COMPANY());
			this.setList_PVEND_CD(struct.getList_PVEND_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_WH_CD1(struct.getList_WH_CD1());
			this.setList_WH_CD2(struct.getList_WH_CD2());
			this.setList_WH_CD3(struct.getList_WH_CD3());
			this.setList_OWN_PERSON_NAME(struct.getList_OWN_PERSON_NAME());
			this.setList_PVC2BUSINESSNAME(struct.getList_PVC2BUSINESSNAME());
			this.setList_PVC2OUTPUTPATH(struct.getList_PVC2OUTPUTPATH());
			this.setList_PVC2OUTPUTNAME(struct.getList_PVC2OUTPUTNAME());
			this.setList_PVC2LOGMODE(struct.getList_PVC2LOGMODE());
			this.setList_PVC2OUTPUTMODE(struct.getList_PVC2OUTPUTMODE());
			this.setList_PVC2USERID(struct.getList_PVC2USERID());
			this.setList_PVC2PLANTCD(struct.getList_PVC2PLANTCD());
			this.setList_PVC2TAXID(struct.getList_PVC2TAXID());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_PNUMTAXOUTAMOUNT(struct.getList_PNUMTAXOUTAMOUNT());
			this.setList_PNUMTAXAMOUNT(struct.getList_PNUMTAXAMOUNT());
			this.setList_PNUMEXTERNALTAXSALESAMOUNT(struct.getList_PNUMEXTERNALTAXSALESAMOUNT());
			this.setList_PNUMINTERNALTAXSALESAMOUNT(struct.getList_PNUMINTERNALTAXSALESAMOUNT());
			this.setList_PNUMTAXFREESALESAMOUNT(struct.getList_PNUMTAXFREESALESAMOUNT());
			this.setList_PNUMEXTERNALTAXAMOUNT(struct.getList_PNUMEXTERNALTAXAMOUNT());
			this.setList_PNUMINTERNALTAXAMOUNT(struct.getList_PNUMINTERNALTAXAMOUNT());
			this.setList_PVC2ERRCD(struct.getList_PVC2ERRCD());
			this.setList_PNUMSTATUS(struct.getList_PNUMSTATUS());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_PARENT_DRAW_CD(struct.getList_PARENT_DRAW_CD());
			this.setList_PARENT_SPEC(struct.getList_PARENT_SPEC());
			this.setList_PARENT_OUTSIDE_TYP(struct.getList_PARENT_OUTSIDE_TYP());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_PS_SPOIL(struct.getList_PS_SPOIL());
			this.setList_PS_LT_FLG(struct.getList_PS_LT_FLG());
			this.setList_PS_KEY(struct.getList_PS_KEY());
			this.setList_CHILD_ITEM_NAME(struct.getList_CHILD_ITEM_NAME());
			this.setList_CHILD_DRAW_CD(struct.getList_CHILD_DRAW_CD());
			this.setList_CHILD_SPEC(struct.getList_CHILD_SPEC());
			this.setList_CHILD_OUTSIDE_TYP(struct.getList_CHILD_OUTSIDE_TYP());
		}
	}

	/**
	 * オブジェクトの文字列表現を返します。
	 * ここでは、getXXXXで取得できるこのクラスの属性値（リストは除く）を返します。
	 * @return オブジェクトの文字列表現
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		java.lang.reflect.Method[] method = getClass().getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			String name = method[i].getName();
			if (name.startsWith("get") && !name.startsWith("getList")) {
				try {
					buffer.append(name.substring(3));
					buffer.append("=[");
					buffer.append(method[i].invoke(this, new Object[]{}));
					buffer.append("], ");
				} catch (IllegalAccessException e) {
					buffer.append(name);
					buffer.append("is IllegalAccessException!! , ");
				} catch (java.lang.reflect.InvocationTargetException e) {
					buffer.append(name);
					buffer.append("is InvocationTargetException!! , ");
				}
			}
		}
		if (buffer.length() < 2) {
			return super.toString();
		}
		return buffer.substring(0, buffer.length() - 2);
	}

	//////////////////////////////
	// 初期値定義
	// 以下に初期化に使う定数の参考として再生成のたびに自動的に全メンバーのサンプルをコメントアウトして出力しています。
/*
	// 第 1 変数初期値： i_InitLevel


	final static String i_InitLevel = null;

	// 第 2 変数初期値： i_id


	final static String i_id = null;

	// 第 3 変数初期値： i_lvl


	final static String i_lvl = null;

	// 第 4 変数初期値： i_parent


	final static String i_parent = null;

	// 第 5 変数初期値： i_label


	final static String i_label = null;

	// 第 6 変数初期値： i_ctx


	final static String i_ctx = null;

	// 第 7 変数初期値： i_maxid


	final static String i_maxid = null;

	// 第 8 変数初期値： i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// 第 9 変数初期値： i_UNIT_QTY_TYP_DN


	final static String i_UNIT_QTY_TYP_DN = null;

	// 第 10 変数初期値： i_ODR_STS_TYP_DN


	final static String i_ODR_STS_TYP_DN = null;

	// 第 11 変数初期値： i_DM_STS_TYP_DN


	final static String i_DM_STS_TYP_DN = null;

	// 第 12 変数初期値： i_OD_TYP_DN


	final static String i_OD_TYP_DN = null;

	// 第 13 変数初期値： i_Sub1_OUTSIDE_TYP_name


	final static String i_Sub1_OUTSIDE_TYP_name = null;

	// 第 14 変数初期値： i_Sub1_OUTSIDE_TYP_val


	final static String i_Sub1_OUTSIDE_TYP_val = null;

	// 第 15 変数初期値： i_Sub1_MRP_ODR_TYP_DN


	final static String i_Sub1_MRP_ODR_TYP_DN = null;

	// 第 16 変数初期値： i_Sub1_UNIT_QTY_TYP_DN


	final static String i_Sub1_UNIT_QTY_TYP_DN = null;

	// 第 17 変数初期値： i_AC0120010tree1


	final static String i_AC0120010tree1 = null;

	// 第 18 変数初期値： i_c_JOB_ODR_DEL


	final static String i_c_JOB_ODR_DEL = null;

	// 第 19 変数初期値： i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 20 変数初期値： i_OD_GNR_TYP_DN


	final static String i_OD_GNR_TYP_DN = null;

	// 第 21 変数初期値： i_Sub1_DUE_TIME


	final static String i_Sub1_DUE_TIME = null;

	// 第 22 変数初期値： i_Sub1_DUE_TIME2


	final static String i_Sub1_DUE_TIME2 = null;

	// 第 23 変数初期値： i_Sub1_DUE_TIME3


	final static String i_Sub1_DUE_TIME3 = null;

	// 第 24 変数初期値： i_Sub1_PRD_DUE_TIME


	final static String i_Sub1_PRD_DUE_TIME = null;

	// 第 25 変数初期値： i_Sub1_PRD_START_TIME


	final static String i_Sub1_PRD_START_TIME = null;

	// 第 26 変数初期値： i_Sub1_ODR_START_TIME


	final static String i_Sub1_ODR_START_TIME = null;

	// 第 27 変数初期値： i_MANHOUR_TYP_DN


	final static String i_MANHOUR_TYP_DN = null;

	// 第 28 変数初期値： i_OPR_RSLT_TYP_DN


	final static String i_OPR_RSLT_TYP_DN = null;

	// 第 29 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 30 変数初期値： i_JOB_ODR_STS_TYP1


	final static String i_JOB_ODR_STS_TYP1 = null;

	// 第 31 変数初期値： i_h_DM_STS_TYP


	final static String i_h_DM_STS_TYP = null;

	// 第 32 変数初期値： i_h_ODR_STS_TYP


	final static String i_h_ODR_STS_TYP = null;

	// 第 33 変数初期値： i_h_size


	final static String i_h_size = null;

	// 第 34 変数初期値： i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// 第 35 変数初期値： i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// 第 36 変数初期値： i_UNIT_QTY_TYP_name


	final static String i_UNIT_QTY_TYP_name = null;

	// 第 37 変数初期値： i_UNIT_QTY_TYP_val


	final static String i_UNIT_QTY_TYP_val = null;

	// 第 38 変数初期値： i_JOB_ODR_TYP_DN


	final static String i_JOB_ODR_TYP_DN = null;

	// 第 39 変数初期値： i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

	// 第 40 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 41 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 42 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 43 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 44 変数初期値： i_OD_TYP


	final static String i_OD_TYP = null;

	// 第 45 変数初期値： i_ODR_STS_TYP


	final static String i_ODR_STS_TYP = null;

	// 第 46 変数初期値： i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// 第 47 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 48 変数初期値： i_MRP_TYP


	final static String i_MRP_TYP = null;

	// 第 49 変数初期値： i_Sub1_OUTSIDE_TYP


	final static String i_Sub1_OUTSIDE_TYP = null;

	// 第 50 変数初期値： i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// 第 51 変数初期値： i_JOB_ODR_EXP_TYP


	final static String i_JOB_ODR_EXP_TYP = null;

	// 第 52 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 53 変数初期値： i_MANHOUR_TYP


	final static String i_MANHOUR_TYP = null;

	// 第 54 変数初期値： i_TOTAL_RCV_QTY


	final static String i_TOTAL_RCV_QTY = null;

	// 第 55 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 56 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 57 変数初期値： i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 58 変数初期値： i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// 第 59 変数初期値： i_CHIID_OD_NO


	final static String i_CHIID_OD_NO = null;

	// 第 60 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 61 変数初期値： i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// 第 62 変数初期値： i_Detail_ITEM_NAME


	final static String i_Detail_ITEM_NAME = null;

	// 第 63 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 64 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 65 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 66 変数初期値： i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// 第 67 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 68 変数初期値： i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 69 変数初期値： i_DUE_DATE


	final static String i_DUE_DATE = null;

	// 第 70 変数初期値： i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// 第 71 変数初期値： i_PRD_START_DATE


	final static String i_PRD_START_DATE = null;

	// 第 72 変数初期値： i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// 第 73 変数初期値： i_SUM_PUCH_ODR_QTY


	final static String i_SUM_PUCH_ODR_QTY = null;

	// 第 74 変数初期値： i_SUM_OPR_INST_QTY


	final static String i_SUM_OPR_INST_QTY = null;

	// 第 75 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 76 変数初期値： i_DM_QTY


	final static String i_DM_QTY = null;

	// 第 77 変数初期値： i_SUM_ALCD_QTY


	final static String i_SUM_ALCD_QTY = null;

	// 第 78 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 79 変数初期値： i_OD_GNR_TYP


	final static String i_OD_GNR_TYP = null;

	// 第 80 変数初期値： i_OPR_RSLT_TYP


	final static String i_OPR_RSLT_TYP = null;

	// 第 81 変数初期値： i_Sub1_PARENT_OD_NO


	final static String i_Sub1_PARENT_OD_NO = null;

	// 第 82 変数初期値： i_Sub1_Parent_ITEM_CD


	final static String i_Sub1_Parent_ITEM_CD = null;

	// 第 83 変数初期値： i_Sub1_Parent_ITEM_NAME


	final static String i_Sub1_Parent_ITEM_NAME = null;

	// 第 84 変数初期値： i_h_Sub1_Parent_OD_LEVEL_NO


	final static String i_h_Sub1_Parent_OD_LEVEL_NO = null;

	// 第 85 変数初期値： i_h_Parent_OD_MODIFY_COUNT


	final static String i_h_Parent_OD_MODIFY_COUNT = null;

	// 第 86 変数初期値： i_h_Sub1_Parent_ODR_QTY


	final static String i_h_Sub1_Parent_ODR_QTY = null;

	// 第 87 変数初期値： i_h_Sub1_Parent_ODR_START_DATE


	final static String i_h_Sub1_Parent_ODR_START_DATE = null;

	// 第 88 変数初期値： i_h_Sub1_Parent_ALC_GRP_CD


	final static String i_h_Sub1_Parent_ALC_GRP_CD = null;

	// 第 89 変数初期値： i_h_Sub1_ODR_STS_TYP


	final static String i_h_Sub1_ODR_STS_TYP = null;

	// 第 90 変数初期値： i_h_Sub1_DM_STS_TYP


	final static String i_h_Sub1_DM_STS_TYP = null;

	// 第 91 変数初期値： i_Sub1_Comp_ITEM_CD


	final static String i_Sub1_Comp_ITEM_CD = null;

	// 第 92 変数初期値： i_Sub1_Comp_ITEM_NAME


	final static String i_Sub1_Comp_ITEM_NAME = null;

	// 第 93 変数初期値： i_Sub1_DRAW_CD


	final static String i_Sub1_DRAW_CD = null;

	// 第 94 変数初期値： i_Sub1_SPEC


	final static String i_Sub1_SPEC = null;

	// 第 95 変数初期値： i_h_Sub1_MRP_ODR_TYP


	final static String i_h_Sub1_MRP_ODR_TYP = null;

	// 第 96 変数初期値： i_Sub1_ITEM_SPOIL


	final static String i_Sub1_ITEM_SPOIL = null;

	// 第 97 変数初期値： i_Sub1_PS_SPOIL


	final static String i_Sub1_PS_SPOIL = null;

	// 第 98 変数初期値： i_h_Sub1_UNIT_QTY_TYP


	final static String i_h_Sub1_UNIT_QTY_TYP = null;

	// 第 99 変数初期値： i_Sub1_DUE_DATE


	final static String i_Sub1_DUE_DATE = null;

	// 第 100 変数初期値： i_Sub1_PRD_DUE_DATE


	final static String i_Sub1_PRD_DUE_DATE = null;

	// 第 101 変数初期値： i_Sub1_PRD_START_DATE


	final static String i_Sub1_PRD_START_DATE = null;

	// 第 102 変数初期値： i_Sub1_ODR_START_DATE


	final static String i_Sub1_ODR_START_DATE = null;

	// 第 103 変数初期値： i_Sub1_ODR_QTY


	final static String i_Sub1_ODR_QTY = null;

	// 第 104 変数初期値： i_Sub1_DM_QTY


	final static String i_Sub1_DM_QTY = null;

	// 第 105 変数初期値： i_Sub1_STOCK_UNIT


	final static String i_Sub1_STOCK_UNIT = null;

	// 第 106 変数初期値： i_Sub1_PS_UNIT_DENOMINATOR


	final static String i_Sub1_PS_UNIT_DENOMINATOR = null;

	// 第 107 変数初期値： i_Sub1_PS_UNIT_NUMERATOR


	final static String i_Sub1_PS_UNIT_NUMERATOR = null;

	// 第 108 変数初期値： i_ODR_LT


	final static String i_ODR_LT = null;

	// 第 109 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 110 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 111 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 112 変数初期値： i_ISSUE_LT


	final static String i_ISSUE_LT = null;

	// 第 113 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 114 変数初期値： i_h_Comp_ITEM_MODIFY_COUNT


	final static String i_h_Comp_ITEM_MODIFY_COUNT = null;

	// 第 115 変数初期値： i_Sub1_OD_TYP


	final static String i_Sub1_OD_TYP = null;

	// 第 116 変数初期値： i_h_Sub1_PS_UNIT_QTY


	final static String i_h_Sub1_PS_UNIT_QTY = null;

	// 第 117 変数初期値： i_h_Sub1_OD_MODIFY_COUNT


	final static String i_h_Sub1_OD_MODIFY_COUNT = null;

	// 第 118 変数初期値： i_h_Sub1_MANHOUR_TYP


	final static String i_h_Sub1_MANHOUR_TYP = null;

	// 第 119 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 120 変数初期値： i_L_Sub1_DUE_DATE


	final static String i_L_Sub1_DUE_DATE = null;

	// 第 121 変数初期値： i_L_Sub1_ODR_START_DATE


	final static String i_L_Sub1_ODR_START_DATE = null;

	// 第 122 変数初期値： i_L_Sub1_PRD_DUE_DATE


	final static String i_L_Sub1_PRD_DUE_DATE = null;

	// 第 123 変数初期値： i_L_Sub1_PRD_START_DATE


	final static String i_L_Sub1_PRD_START_DATE = null;

	// 第 124 変数初期値： i_Sub1_MRP_ODR_TYP


	final static String i_Sub1_MRP_ODR_TYP = null;

	// 第 125 変数初期値： i_ISSUE_TYP


	final static String i_ISSUE_TYP = null;

	// 第 126 変数初期値： i_Sub1_PS_UNIT_QTY


	final static String i_Sub1_PS_UNIT_QTY = null;

	// 第 127 変数初期値： i_OD_LEVEL_NO


	final static String i_OD_LEVEL_NO = null;

	// 第 128 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 129 変数初期値： i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// 第 130 変数初期値： i_setDM_QTY


	final static String i_setDM_QTY = null;

	// 第 131 変数初期値： i_setOUTSIDE_TYP


	final static String i_setOUTSIDE_TYP = null;

	// 第 132 変数初期値： i_setPS_UNIT_QTY


	final static String i_setPS_UNIT_QTY = null;

	// 第 133 変数初期値： i_setPS_SPOIL


	final static String i_setPS_SPOIL = null;

	// 第 134 変数初期値： i_setPS_UNIT_DENOMINATOR


	final static String i_setPS_UNIT_DENOMINATOR = null;

	// 第 135 変数初期値： i_setPS_UNIT_NUMERATOR


	final static String i_setPS_UNIT_NUMERATOR = null;

	// 第 136 変数初期値： i_setMRP_TYP


	final static String i_setMRP_TYP = null;

	// 第 137 変数初期値： i_setITEM_SPOIL


	final static String i_setITEM_SPOIL = null;

	// 第 138 変数初期値： i_setOD_NO


	final static String i_setOD_NO = null;

	// 第 139 変数初期値： i_h_Sub1_ISSUE_TYP


	final static String i_h_Sub1_ISSUE_TYP = null;

	// 第 140 変数初期値： i_CAL_NO


	final static String i_CAL_NO = null;

	// 第 141 変数初期値： i_ITEM_MODIFY_COUNT


	final static String i_ITEM_MODIFY_COUNT = null;

	// 第 142 変数初期値： i_OD_MODIFY_COUNT


	final static String i_OD_MODIFY_COUNT = null;

	// 第 143 変数初期値： i_PROC_CD


	final static String i_PROC_CD = null;

	// 第 144 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 145 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 146 変数初期値： i_setDUE_DATE


	final static String i_setDUE_DATE = null;

	// 第 147 変数初期値： i_setPRD_DUE_DATE


	final static String i_setPRD_DUE_DATE = null;

	// 第 148 変数初期値： i_setPRD_START_DATE


	final static String i_setPRD_START_DATE = null;

	// 第 149 変数初期値： i_setODR_START_DATE


	final static String i_setODR_START_DATE = null;

	// 第 150 変数初期値： i_setODR_QTY


	final static String i_setODR_QTY = null;

	// 第 151 変数初期値： i_setOD_TYP


	final static String i_setOD_TYP = null;

	// 第 152 変数初期値： i_setODR_STS_TYP


	final static String i_setODR_STS_TYP = null;

	// 第 153 変数初期値： i_MIN_CAL_DATE


	final static String i_MIN_CAL_DATE = null;

	// 第 154 変数初期値： i_MAX_CAL_DATE


	final static String i_MAX_CAL_DATE = null;

	// 第 155 変数初期値： i_OD_CALC_FLG


	final static String i_OD_CALC_FLG = null;

	// 第 156 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 157 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 158 変数初期値： i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// 第 159 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 160 変数初期値： i_PROC_EXPLOSION_FLG


	final static String i_PROC_EXPLOSION_FLG = null;

	// 第 161 変数初期値： i_Sub1_PUCH_ODR_CD


	final static String i_Sub1_PUCH_ODR_CD = null;

	// 第 162 変数初期値： i_Sub1_COMPANY_CD


	final static String i_Sub1_COMPANY_CD = null;

	// 第 163 変数初期値： i_Sub1_VEND_CD


	final static String i_Sub1_VEND_CD = null;

	// 第 164 変数初期値： i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 165 変数初期値： i_COUNT


	final static String i_COUNT = null;

	// 第 166 変数初期値： i_FINAL_PROC_FLG


	final static String i_FINAL_PROC_FLG = null;

	// 第 167 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 168 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 169 変数初期値： i_TOTAL_ACPT_QTY


	final static String i_TOTAL_ACPT_QTY = null;

	// 第 170 変数初期値： i_TOTAL_DEFECT_QTY


	final static String i_TOTAL_DEFECT_QTY = null;

	// 第 171 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 172 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 173 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 174 変数初期値： i_Sub1_WORK_IN_PROC_CD


	final static String i_Sub1_WORK_IN_PROC_CD = null;

	// 第 175 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 176 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 177 変数初期値： i_ONEROUS_FLG


	final static String i_ONEROUS_FLG = null;

	// 第 178 変数初期値： i_SysPLANT_CD


	final static String i_SysPLANT_CD = null;

	// 第 179 変数初期値： i_VALUE


	final static String i_VALUE = null;

	// 第 180 変数初期値： i_NAME


	final static String i_NAME = null;

	// 第 181 変数初期値： i_MY_COMPANY


	final static String i_MY_COMPANY = null;

	// 第 182 変数初期値： i_PVEND_CD


	final static String i_PVEND_CD = null;

	// 第 183 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 184 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 185 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 186 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 187 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 188 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 189 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 190 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 191 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 192 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 193 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 194 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 195 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 196 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 197 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 198 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 199 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 200 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 201 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 202 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 203 変数初期値： i_WH_CD1


	final static String i_WH_CD1 = null;

	// 第 204 変数初期値： i_WH_CD2


	final static String i_WH_CD2 = null;

	// 第 205 変数初期値： i_WH_CD3


	final static String i_WH_CD3 = null;

	// 第 206 変数初期値： i_OWN_PERSON_NAME


	final static String i_OWN_PERSON_NAME = null;

	// 第 207 変数初期値： i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// 第 208 変数初期値： i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// 第 209 変数初期値： i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// 第 210 変数初期値： i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// 第 211 変数初期値： i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// 第 212 変数初期値： i_PVC2USERID


	final static String i_PVC2USERID = null;

	// 第 213 変数初期値： i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// 第 214 変数初期値： i_PVC2TAXID


	final static String i_PVC2TAXID = null;

	// 第 215 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 216 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 217 変数初期値： i_PNUMTAXOUTAMOUNT


	final static String i_PNUMTAXOUTAMOUNT = null;

	// 第 218 変数初期値： i_PNUMTAXAMOUNT


	final static String i_PNUMTAXAMOUNT = null;

	// 第 219 変数初期値： i_PNUMEXTERNALTAXSALESAMOUNT


	final static String i_PNUMEXTERNALTAXSALESAMOUNT = null;

	// 第 220 変数初期値： i_PNUMINTERNALTAXSALESAMOUNT


	final static String i_PNUMINTERNALTAXSALESAMOUNT = null;

	// 第 221 変数初期値： i_PNUMTAXFREESALESAMOUNT


	final static String i_PNUMTAXFREESALESAMOUNT = null;

	// 第 222 変数初期値： i_PNUMEXTERNALTAXAMOUNT


	final static String i_PNUMEXTERNALTAXAMOUNT = null;

	// 第 223 変数初期値： i_PNUMINTERNALTAXAMOUNT


	final static String i_PNUMINTERNALTAXAMOUNT = null;

	// 第 224 変数初期値： i_PVC2ERRCD


	final static String i_PVC2ERRCD = null;

	// 第 225 変数初期値： i_PNUMSTATUS


	final static String i_PNUMSTATUS = null;

	// 第 226 変数初期値： i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// 第 227 変数初期値： i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// 第 228 変数初期値： i_PARENT_DRAW_CD


	final static String i_PARENT_DRAW_CD = null;

	// 第 229 変数初期値： i_PARENT_SPEC


	final static String i_PARENT_SPEC = null;

	// 第 230 変数初期値： i_PARENT_OUTSIDE_TYP


	final static String i_PARENT_OUTSIDE_TYP = null;

	// 第 231 変数初期値： i_PS_EDITION


	final static String i_PS_EDITION = null;

	// 第 232 変数初期値： i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// 第 233 変数初期値： i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// 第 234 変数初期値： i_PS_SPOIL


	final static String i_PS_SPOIL = null;

	// 第 235 変数初期値： i_PS_LT_FLG


	final static String i_PS_LT_FLG = null;

	// 第 236 変数初期値： i_PS_KEY


	final static String i_PS_KEY = null;

	// 第 237 変数初期値： i_CHILD_ITEM_NAME


	final static String i_CHILD_ITEM_NAME = null;

	// 第 238 変数初期値： i_CHILD_DRAW_CD


	final static String i_CHILD_DRAW_CD = null;

	// 第 239 変数初期値： i_CHILD_SPEC


	final static String i_CHILD_SPEC = null;

	// 第 240 変数初期値： i_CHILD_OUTSIDE_TYP


	final static String i_CHILD_OUTSIDE_TYP = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_InitLevel

	final static String i_InitLevel = null;

	// 第 2 変数初期値： i_id

	final static String i_id = null;

	// 第 3 変数初期値： i_lvl

	final static String i_lvl = null;

	// 第 4 変数初期値： i_parent

	final static String i_parent = null;

	// 第 5 変数初期値： i_label

	final static String i_label = null;

	// 第 6 変数初期値： i_ctx

	final static String i_ctx = null;

	// 第 7 変数初期値： i_maxid

	final static String i_maxid = null;

	// 第 8 変数初期値： i_OUTSIDE_TYP_DN

	final static String i_OUTSIDE_TYP_DN = null;

	// 第 9 変数初期値： i_UNIT_QTY_TYP_DN

	final static String i_UNIT_QTY_TYP_DN = null;

	// 第 10 変数初期値： i_ODR_STS_TYP_DN

	final static String i_ODR_STS_TYP_DN = null;

	// 第 11 変数初期値： i_DM_STS_TYP_DN

	final static String i_DM_STS_TYP_DN = null;

	// 第 12 変数初期値： i_OD_TYP_DN

	final static String i_OD_TYP_DN = null;

	// 第 13 変数初期値： i_Sub1_OUTSIDE_TYP_name

	final static String i_Sub1_OUTSIDE_TYP_name = null;

	// 第 14 変数初期値： i_Sub1_OUTSIDE_TYP_val

	final static String i_Sub1_OUTSIDE_TYP_val = null;

	// 第 15 変数初期値： i_Sub1_MRP_ODR_TYP_DN

	final static String i_Sub1_MRP_ODR_TYP_DN = null;

	// 第 16 変数初期値： i_Sub1_UNIT_QTY_TYP_DN

	final static String i_Sub1_UNIT_QTY_TYP_DN = null;

	// 第 17 変数初期値： i_AC0120010tree1

	final static String i_AC0120010tree1 = null;

	// 第 18 変数初期値： i_c_JOB_ODR_DEL

	final static String i_c_JOB_ODR_DEL = null;

	// 第 19 変数初期値： i_h_BUSINESS_OPR_DATE

	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 20 変数初期値： i_OD_GNR_TYP_DN

	final static String i_OD_GNR_TYP_DN = null;

	// 第 21 変数初期値： i_Sub1_DUE_TIME

	final static String i_Sub1_DUE_TIME = null;

	// 第 22 変数初期値： i_Sub1_DUE_TIME2

	final static String i_Sub1_DUE_TIME2 = null;

	// 第 23 変数初期値： i_Sub1_DUE_TIME3

	final static String i_Sub1_DUE_TIME3 = null;

	// 第 24 変数初期値： i_Sub1_PRD_DUE_TIME

	final static String i_Sub1_PRD_DUE_TIME = null;

	// 第 25 変数初期値： i_Sub1_PRD_START_TIME

	final static String i_Sub1_PRD_START_TIME = null;

	// 第 26 変数初期値： i_Sub1_ODR_START_TIME

	final static String i_Sub1_ODR_START_TIME = null;

	// 第 27 変数初期値： i_MANHOUR_TYP_DN

	final static String i_MANHOUR_TYP_DN = null;

	// 第 28 変数初期値： i_OPR_RSLT_TYP_DN

	final static String i_OPR_RSLT_TYP_DN = null;

	// 第 29 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 30 変数初期値： i_JOB_ODR_STS_TYP1

	final static String i_JOB_ODR_STS_TYP1 = null;

	// 第 31 変数初期値： i_h_DM_STS_TYP

	final static String i_h_DM_STS_TYP = null;

	// 第 32 変数初期値： i_h_ODR_STS_TYP

	final static String i_h_ODR_STS_TYP = null;

	// 第 33 変数初期値： i_h_size

	final static String i_h_size = null;

	// 第 34 変数初期値： i_MRP_ODR_TYP_name

	final static String i_MRP_ODR_TYP_name = null;

	// 第 35 変数初期値： i_MRP_ODR_TYP_val

	final static String i_MRP_ODR_TYP_val = null;

	// 第 36 変数初期値： i_UNIT_QTY_TYP_name

	final static String i_UNIT_QTY_TYP_name = null;

	// 第 37 変数初期値： i_UNIT_QTY_TYP_val

	final static String i_UNIT_QTY_TYP_val = null;

	// 第 38 変数初期値： i_JOB_ODR_TYP_DN

	final static String i_JOB_ODR_TYP_DN = null;

	// 第 39 変数初期値： i_MRP_ODR_TYP_DN

	final static String i_MRP_ODR_TYP_DN = null;

	// 第 40 変数初期値： i_OD_NO

	final static String i_OD_NO = null;

	// 第 41 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 42 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 43 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 44 変数初期値： i_OD_TYP

	final static String i_OD_TYP = null;

	// 第 45 変数初期値： i_ODR_STS_TYP

	final static String i_ODR_STS_TYP = null;

	// 第 46 変数初期値： i_DM_STS_TYP

	final static String i_DM_STS_TYP = null;

	// 第 47 変数初期値： i_MRP_ODR_TYP

	final static String i_MRP_ODR_TYP = null;

	// 第 48 変数初期値： i_MRP_TYP

	final static String i_MRP_TYP = null;

	// 第 49 変数初期値： i_Sub1_OUTSIDE_TYP

	final static String i_Sub1_OUTSIDE_TYP = null;

	// 第 50 変数初期値： i_JOB_ODR_STS_TYP

	final static String i_JOB_ODR_STS_TYP = null;

	// 第 51 変数初期値： i_JOB_ODR_EXP_TYP

	final static String i_JOB_ODR_EXP_TYP = null;

	// 第 52 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 53 変数初期値： i_MANHOUR_TYP

	final static String i_MANHOUR_TYP = null;

	// 第 54 変数初期値： i_TOTAL_RCV_QTY

	final static String i_TOTAL_RCV_QTY = null;

	// 第 55 変数初期値： i_TOTAL_ISSUE_QTY

	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 56 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 57 変数初期値： i_JOB_ODR_CANCEL_NO

	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 58 変数初期値： i_PARENT_OD_NO

	final static String i_PARENT_OD_NO = null;

	// 第 59 変数初期値： i_CHIID_OD_NO

	final static String i_CHIID_OD_NO = null;

	// 第 60 変数初期値： i_JOB_ODR_TYP

	final static String i_JOB_ODR_TYP = null;

	// 第 61 変数初期値： i_ALC_GRP_CD

	final static String i_ALC_GRP_CD = null;

	// 第 62 変数初期値： i_Detail_ITEM_NAME

	final static String i_Detail_ITEM_NAME = null;

	// 第 63 変数初期値： i_DRAW_CD

	final static String i_DRAW_CD = null;

	// 第 64 変数初期値： i_SPEC

	final static String i_SPEC = null;

	// 第 65 変数初期値： i_OUTSIDE_TYP

	final static String i_OUTSIDE_TYP = null;

	// 第 66 変数初期値： i_ITEM_SPOIL

	final static String i_ITEM_SPOIL = null;

	// 第 67 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 68 変数初期値： i_JOB_ODR_DLV_DATE

	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 69 変数初期値： i_DUE_DATE

	final static String i_DUE_DATE = null;

	// 第 70 変数初期値： i_PRD_DUE_DATE

	final static String i_PRD_DUE_DATE = null;

	// 第 71 変数初期値： i_PRD_START_DATE

	final static String i_PRD_START_DATE = null;

	// 第 72 変数初期値： i_ODR_START_DATE

	final static String i_ODR_START_DATE = null;

	// 第 73 変数初期値： i_SUM_PUCH_ODR_QTY

	final static String i_SUM_PUCH_ODR_QTY = null;

	// 第 74 変数初期値： i_SUM_OPR_INST_QTY

	final static String i_SUM_OPR_INST_QTY = null;

	// 第 75 変数初期値： i_ODR_QTY

	final static String i_ODR_QTY = null;

	// 第 76 変数初期値： i_DM_QTY

	final static String i_DM_QTY = null;

	// 第 77 変数初期値： i_SUM_ALCD_QTY

	final static String i_SUM_ALCD_QTY = null;

	// 第 78 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 79 変数初期値： i_OD_GNR_TYP

	final static String i_OD_GNR_TYP = null;

	// 第 80 変数初期値： i_OPR_RSLT_TYP

	final static String i_OPR_RSLT_TYP = null;

	// 第 81 変数初期値： i_Sub1_PARENT_OD_NO

	final static String i_Sub1_PARENT_OD_NO = null;

	// 第 82 変数初期値： i_Sub1_Parent_ITEM_CD

	final static String i_Sub1_Parent_ITEM_CD = null;

	// 第 83 変数初期値： i_Sub1_Parent_ITEM_NAME

	final static String i_Sub1_Parent_ITEM_NAME = null;

	// 第 84 変数初期値： i_h_Sub1_Parent_OD_LEVEL_NO

	final static String i_h_Sub1_Parent_OD_LEVEL_NO = null;

	// 第 85 変数初期値： i_h_Parent_OD_MODIFY_COUNT

	final static String i_h_Parent_OD_MODIFY_COUNT = null;

	// 第 86 変数初期値： i_h_Sub1_Parent_ODR_QTY

	final static String i_h_Sub1_Parent_ODR_QTY = null;

	// 第 87 変数初期値： i_h_Sub1_Parent_ODR_START_DATE

	final static String i_h_Sub1_Parent_ODR_START_DATE = null;

	// 第 88 変数初期値： i_h_Sub1_Parent_ALC_GRP_CD

	final static String i_h_Sub1_Parent_ALC_GRP_CD = null;

	// 第 89 変数初期値： i_h_Sub1_ODR_STS_TYP

	final static String i_h_Sub1_ODR_STS_TYP = null;

	// 第 90 変数初期値： i_h_Sub1_DM_STS_TYP

	final static String i_h_Sub1_DM_STS_TYP = null;

	// 第 91 変数初期値： i_Sub1_Comp_ITEM_CD

	final static String i_Sub1_Comp_ITEM_CD = null;

	// 第 92 変数初期値： i_Sub1_Comp_ITEM_NAME

	final static String i_Sub1_Comp_ITEM_NAME = null;

	// 第 93 変数初期値： i_Sub1_DRAW_CD

	final static String i_Sub1_DRAW_CD = null;

	// 第 94 変数初期値： i_Sub1_SPEC

	final static String i_Sub1_SPEC = null;

	// 第 95 変数初期値： i_h_Sub1_MRP_ODR_TYP

	final static String i_h_Sub1_MRP_ODR_TYP = null;

	// 第 96 変数初期値： i_Sub1_ITEM_SPOIL

	final static String i_Sub1_ITEM_SPOIL = null;

	// 第 97 変数初期値： i_Sub1_PS_SPOIL

	final static String i_Sub1_PS_SPOIL = null;

	// 第 98 変数初期値： i_h_Sub1_UNIT_QTY_TYP

	final static String i_h_Sub1_UNIT_QTY_TYP = null;

	// 第 99 変数初期値： i_Sub1_DUE_DATE

	final static String i_Sub1_DUE_DATE = null;

	// 第 100 変数初期値： i_Sub1_PRD_DUE_DATE

	final static String i_Sub1_PRD_DUE_DATE = null;

	// 第 101 変数初期値： i_Sub1_PRD_START_DATE

	final static String i_Sub1_PRD_START_DATE = null;

	// 第 102 変数初期値： i_Sub1_ODR_START_DATE

	final static String i_Sub1_ODR_START_DATE = null;

	// 第 103 変数初期値： i_Sub1_ODR_QTY

	final static String i_Sub1_ODR_QTY = null;

	// 第 104 変数初期値： i_Sub1_DM_QTY

	final static String i_Sub1_DM_QTY = null;

	// 第 105 変数初期値： i_Sub1_STOCK_UNIT

	final static String i_Sub1_STOCK_UNIT = null;

	// 第 106 変数初期値： i_Sub1_PS_UNIT_DENOMINATOR

	final static String i_Sub1_PS_UNIT_DENOMINATOR = null;

	// 第 107 変数初期値： i_Sub1_PS_UNIT_NUMERATOR

	final static String i_Sub1_PS_UNIT_NUMERATOR = null;

	// 第 108 変数初期値： i_ODR_LT

	final static String i_ODR_LT = null;

	// 第 109 変数初期値： i_FIXED_LT

	final static String i_FIXED_LT = null;

	// 第 110 変数初期値： i_PROP_LT

	final static String i_PROP_LT = null;

	// 第 111 変数初期値： i_SAFETY_LT

	final static String i_SAFETY_LT = null;

	// 第 112 変数初期値： i_ISSUE_LT

	final static String i_ISSUE_LT = null;

	// 第 113 変数初期値： i_PROP_LOT_SIZE

	final static String i_PROP_LOT_SIZE = null;

	// 第 114 変数初期値： i_h_Comp_ITEM_MODIFY_COUNT

	final static String i_h_Comp_ITEM_MODIFY_COUNT = null;

	// 第 115 変数初期値： i_Sub1_OD_TYP

	final static String i_Sub1_OD_TYP = null;

	// 第 116 変数初期値： i_h_Sub1_PS_UNIT_QTY

	final static String i_h_Sub1_PS_UNIT_QTY = null;

	// 第 117 変数初期値： i_h_Sub1_OD_MODIFY_COUNT

	final static String i_h_Sub1_OD_MODIFY_COUNT = null;

	// 第 118 変数初期値： i_h_Sub1_MANHOUR_TYP

	final static String i_h_Sub1_MANHOUR_TYP = null;

	// 第 119 変数初期値： i_JOB_ODR_DETAIL_NO

	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 120 変数初期値： i_L_Sub1_DUE_DATE

	final static String i_L_Sub1_DUE_DATE = null;

	// 第 121 変数初期値： i_L_Sub1_ODR_START_DATE

	final static String i_L_Sub1_ODR_START_DATE = null;

	// 第 122 変数初期値： i_L_Sub1_PRD_DUE_DATE

	final static String i_L_Sub1_PRD_DUE_DATE = null;

	// 第 123 変数初期値： i_L_Sub1_PRD_START_DATE

	final static String i_L_Sub1_PRD_START_DATE = null;

	// 第 124 変数初期値： i_Sub1_MRP_ODR_TYP

	final static String i_Sub1_MRP_ODR_TYP = null;

	// 第 125 変数初期値： i_ISSUE_TYP

	final static String i_ISSUE_TYP = null;

	// 第 126 変数初期値： i_Sub1_PS_UNIT_QTY

	final static String i_Sub1_PS_UNIT_QTY = null;

	// 第 127 変数初期値： i_OD_LEVEL_NO

	final static String i_OD_LEVEL_NO = null;

	// 第 128 変数初期値： i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 129 変数初期値： i_EFF_PHASE_OUT_DATE

	final static String i_EFF_PHASE_OUT_DATE = null;

	// 第 130 変数初期値： i_setDM_QTY

	final static String i_setDM_QTY = null;

	// 第 131 変数初期値： i_setOUTSIDE_TYP

	final static String i_setOUTSIDE_TYP = null;

	// 第 132 変数初期値： i_setPS_UNIT_QTY

	final static String i_setPS_UNIT_QTY = null;

	// 第 133 変数初期値： i_setPS_SPOIL

	final static String i_setPS_SPOIL = null;

	// 第 134 変数初期値： i_setPS_UNIT_DENOMINATOR

	final static String i_setPS_UNIT_DENOMINATOR = null;

	// 第 135 変数初期値： i_setPS_UNIT_NUMERATOR

	final static String i_setPS_UNIT_NUMERATOR = null;

	// 第 136 変数初期値： i_setMRP_TYP

	final static String i_setMRP_TYP = null;

	// 第 137 変数初期値： i_setITEM_SPOIL

	final static String i_setITEM_SPOIL = null;

	// 第 138 変数初期値： i_setOD_NO

	final static String i_setOD_NO = null;

	// 第 139 変数初期値： i_h_Sub1_ISSUE_TYP

	final static String i_h_Sub1_ISSUE_TYP = null;

	// 第 140 変数初期値： i_CAL_NO

	final static String i_CAL_NO = null;

	// 第 141 変数初期値： i_ITEM_MODIFY_COUNT

	final static String i_ITEM_MODIFY_COUNT = null;

	// 第 142 変数初期値： i_OD_MODIFY_COUNT

	final static String i_OD_MODIFY_COUNT = null;

	// 第 143 変数初期値： i_PROC_CD

	final static String i_PROC_CD = null;

	// 第 144 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 145 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 146 変数初期値： i_setDUE_DATE

	final static String i_setDUE_DATE = null;

	// 第 147 変数初期値： i_setPRD_DUE_DATE

	final static String i_setPRD_DUE_DATE = null;

	// 第 148 変数初期値： i_setPRD_START_DATE

	final static String i_setPRD_START_DATE = null;

	// 第 149 変数初期値： i_setODR_START_DATE

	final static String i_setODR_START_DATE = null;

	// 第 150 変数初期値： i_setODR_QTY

	final static String i_setODR_QTY = null;

	// 第 151 変数初期値： i_setOD_TYP

	final static String i_setOD_TYP = null;

	// 第 152 変数初期値： i_setODR_STS_TYP

	final static String i_setODR_STS_TYP = null;

	// 第 153 変数初期値： i_MIN_CAL_DATE

	final static String i_MIN_CAL_DATE = null;

	// 第 154 変数初期値： i_MAX_CAL_DATE

	final static String i_MAX_CAL_DATE = null;

	// 第 155 変数初期値： i_OD_CALC_FLG

	final static String i_OD_CALC_FLG = null;

	// 第 156 変数初期値： i_TIME_CTRL

	final static String i_TIME_CTRL = null;

	// 第 157 変数初期値： i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// 第 158 変数初期値： i_WORK_STS_TYP

	final static String i_WORK_STS_TYP = null;

	// 第 159 変数初期値： i_WS_CD

	final static String i_WS_CD = null;

	// 第 160 変数初期値： i_Sub1_PUCH_ODR_CD

	final static String i_Sub1_PUCH_ODR_CD = null;

	// 第 161 変数初期値： i_Sub1_COMPANY_CD

	final static String i_Sub1_COMPANY_CD = null;

	// 第 162 変数初期値： i_Sub1_VEND_CD

	final static String i_Sub1_VEND_CD = null;

	// 第 163 変数初期値： i_PUCH_ODR_STS_TYP

	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 164 変数初期値： i_COUNT

	final static String i_COUNT = null;

	// 第 165 変数初期値： i_FINAL_PROC_FLG

	final static String i_FINAL_PROC_FLG = null;

	// 第 166 変数初期値： i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// 第 167 変数初期値： i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// 第 168 変数初期値： i_TOTAL_ACPT_QTY

	final static String i_TOTAL_ACPT_QTY = null;

	// 第 169 変数初期値： i_TOTAL_DEFECT_QTY

	final static String i_TOTAL_DEFECT_QTY = null;

	// 第 170 変数初期値： i_ACPT_QTY

	final static String i_ACPT_QTY = null;

	// 第 171 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 172 変数初期値： i_ISSUE_INST_CD

	final static String i_ISSUE_INST_CD = null;

	// 第 173 変数初期値： i_Sub1_WORK_IN_PROC_CD

	final static String i_Sub1_WORK_IN_PROC_CD = null;

	// 第 174 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 175 変数初期値： i_CONS_TYP

	final static String i_CONS_TYP = null;

	// 第 176 変数初期値： i_ONEROUS_FLG

	final static String i_ONEROUS_FLG = null;

	// 第 177 変数初期値： i_SysPLANT_CD

	final static String i_SysPLANT_CD = null;

	// 第 178 変数初期値： i_VALUE

	final static String i_VALUE = null;

	// 第 179 変数初期値： i_NAME

	final static String i_NAME = null;

	// 第 180 変数初期値： i_MY_COMPANY

	final static String i_MY_COMPANY = null;

	// 第 181 変数初期値： i_PVEND_CD

	final static String i_PVEND_CD = null;

	// 第 182 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 183 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 184 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 185 変数初期値： i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// 第 186 変数初期値： i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// 第 187 変数初期値： i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// 第 188 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 189 変数初期値： i_SPL_ITEM_TYP

	final static String i_SPL_ITEM_TYP = null;

	// 第 190 変数初期値： i_ACPT_INSPC_TYP

	final static String i_ACPT_INSPC_TYP = null;

	// 第 191 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 192 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 193 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 194 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 195 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 196 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 197 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 198 変数初期値： i_AMOUNT_INCLUDE_TAX

	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 199 変数初期値： i_HOME_CUR_AMOUNT

	final static String i_HOME_CUR_AMOUNT = null;

	// 第 200 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 201 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 202 変数初期値： i_WH_CD1

	final static String i_WH_CD1 = null;

	// 第 203 変数初期値： i_WH_CD2

	final static String i_WH_CD2 = null;

	// 第 204 変数初期値： i_WH_CD3

	final static String i_WH_CD3 = null;

	// 第 205 変数初期値： i_OWN_PERSON_NAME

	final static String i_OWN_PERSON_NAME = null;

	// 第 206 変数初期値： i_PVC2BUSINESSNAME

	final static String i_PVC2BUSINESSNAME = null;

	// 第 207 変数初期値： i_PVC2OUTPUTPATH

	final static String i_PVC2OUTPUTPATH = null;

	// 第 208 変数初期値： i_PVC2OUTPUTNAME

	final static String i_PVC2OUTPUTNAME = null;

	// 第 209 変数初期値： i_PVC2LOGMODE

	final static String i_PVC2LOGMODE = null;

	// 第 210 変数初期値： i_PVC2OUTPUTMODE

	final static String i_PVC2OUTPUTMODE = null;

	// 第 211 変数初期値： i_PVC2USERID

	final static String i_PVC2USERID = null;

	// 第 212 変数初期値： i_PVC2PLANTCD

	final static String i_PVC2PLANTCD = null;

	// 第 213 変数初期値： i_PVC2TAXID

	final static String i_PVC2TAXID = null;

	// 第 214 変数初期値： i_VEND_DECIMAL_FIG

	final static String i_VEND_DECIMAL_FIG = null;

	// 第 215 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 216 変数初期値： i_PNUMTAXOUTAMOUNT

	final static String i_PNUMTAXOUTAMOUNT = null;

	// 第 217 変数初期値： i_PNUMTAXAMOUNT

	final static String i_PNUMTAXAMOUNT = null;

	// 第 218 変数初期値： i_PNUMEXTERNALTAXSALESAMOUNT

	final static String i_PNUMEXTERNALTAXSALESAMOUNT = null;

	// 第 219 変数初期値： i_PNUMINTERNALTAXSALESAMOUNT

	final static String i_PNUMINTERNALTAXSALESAMOUNT = null;

	// 第 220 変数初期値： i_PNUMTAXFREESALESAMOUNT

	final static String i_PNUMTAXFREESALESAMOUNT = null;

	// 第 221 変数初期値： i_PNUMEXTERNALTAXAMOUNT

	final static String i_PNUMEXTERNALTAXAMOUNT = null;

	// 第 222 変数初期値： i_PNUMINTERNALTAXAMOUNT

	final static String i_PNUMINTERNALTAXAMOUNT = null;

	// 第 223 変数初期値： i_PVC2ERRCD

	final static String i_PVC2ERRCD = null;

	// 第 224 変数初期値： i_PNUMSTATUS

	final static String i_PNUMSTATUS = null;

	// 第 225 変数初期値： i_PARENT_ITEM_CD

	final static String i_PARENT_ITEM_CD = null;

	// 第 226 変数初期値： i_PARENT_ITEM_NAME

	final static String i_PARENT_ITEM_NAME = null;

	// 第 227 変数初期値： i_PARENT_DRAW_CD

	final static String i_PARENT_DRAW_CD = null;

	// 第 228 変数初期値： i_PARENT_SPEC

	final static String i_PARENT_SPEC = null;

	// 第 229 変数初期値： i_PARENT_OUTSIDE_TYP

	final static String i_PARENT_OUTSIDE_TYP = null;

	// 第 230 変数初期値： i_PS_EDITION

	final static String i_PS_EDITION = null;

	// 第 231 変数初期値： i_PS_UNIT_DENOMINATOR

	final static String i_PS_UNIT_DENOMINATOR = null;

	// 第 232 変数初期値： i_PS_UNIT_NUMERATOR

	final static String i_PS_UNIT_NUMERATOR = null;

	// 第 233 変数初期値： i_PS_SPOIL

	final static String i_PS_SPOIL = null;

	// 第 234 変数初期値： i_PS_LT_FLG

	final static String i_PS_LT_FLG = null;

	// 第 235 変数初期値： i_PS_KEY

	final static String i_PS_KEY = null;

	// 第 236 変数初期値： i_CHILD_ITEM_NAME

	final static String i_CHILD_ITEM_NAME = null;

	// 第 237 変数初期値： i_CHILD_DRAW_CD

	final static String i_CHILD_DRAW_CD = null;

	// 第 238 変数初期値： i_CHILD_SPEC

	final static String i_CHILD_SPEC = null;

	// 第 239 変数初期値： i_CHILD_OUTSIDE_TYP

	final static String i_CHILD_OUTSIDE_TYP = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_InitLevel = i_InitLevel;
		m_id = i_id;
		m_lvl = i_lvl;
		m_parent = i_parent;
		m_label = i_label;
		m_ctx = i_ctx;
		m_maxid = i_maxid;
		m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
		m_UNIT_QTY_TYP_DN = i_UNIT_QTY_TYP_DN;
		m_ODR_STS_TYP_DN = i_ODR_STS_TYP_DN;
		m_DM_STS_TYP_DN = i_DM_STS_TYP_DN;
		m_OD_TYP_DN = i_OD_TYP_DN;
		m_Sub1_OUTSIDE_TYP_name = i_Sub1_OUTSIDE_TYP_name;
		m_Sub1_OUTSIDE_TYP_val = i_Sub1_OUTSIDE_TYP_val;
		m_Sub1_MRP_ODR_TYP_DN = i_Sub1_MRP_ODR_TYP_DN;
		m_Sub1_UNIT_QTY_TYP_DN = i_Sub1_UNIT_QTY_TYP_DN;
		m_AC0120010tree1 = i_AC0120010tree1;
		m_c_JOB_ODR_DEL = i_c_JOB_ODR_DEL;
		m_h_BUSINESS_OPR_DATE = i_h_BUSINESS_OPR_DATE;
		m_OD_GNR_TYP_DN = i_OD_GNR_TYP_DN;
		m_Sub1_DUE_TIME = i_Sub1_DUE_TIME;
		m_Sub1_DUE_TIME2 = i_Sub1_DUE_TIME2;
		m_Sub1_DUE_TIME3 = i_Sub1_DUE_TIME3;
		m_Sub1_PRD_DUE_TIME = i_Sub1_PRD_DUE_TIME;
		m_Sub1_PRD_START_TIME = i_Sub1_PRD_START_TIME;
		m_Sub1_ODR_START_TIME = i_Sub1_ODR_START_TIME;
		m_MANHOUR_TYP_DN = i_MANHOUR_TYP_DN;
		m_OPR_RSLT_TYP_DN = i_OPR_RSLT_TYP_DN;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_JOB_ODR_STS_TYP1 = i_JOB_ODR_STS_TYP1;
		m_h_DM_STS_TYP = i_h_DM_STS_TYP;
		m_h_ODR_STS_TYP = i_h_ODR_STS_TYP;
		m_h_size = i_h_size;
		m_MRP_ODR_TYP_name = i_MRP_ODR_TYP_name;
		m_MRP_ODR_TYP_val = i_MRP_ODR_TYP_val;
		m_UNIT_QTY_TYP_name = i_UNIT_QTY_TYP_name;
		m_UNIT_QTY_TYP_val = i_UNIT_QTY_TYP_val;
		m_JOB_ODR_TYP_DN = i_JOB_ODR_TYP_DN;
		m_MRP_ODR_TYP_DN = i_MRP_ODR_TYP_DN;
		m_OD_NO = i_OD_NO;
		m_PLANT_CD = i_PLANT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_OD_TYP = i_OD_TYP;
		m_ODR_STS_TYP = i_ODR_STS_TYP;
		m_DM_STS_TYP = i_DM_STS_TYP;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_MRP_TYP = i_MRP_TYP;
		m_Sub1_OUTSIDE_TYP = i_Sub1_OUTSIDE_TYP;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_EXP_TYP = i_JOB_ODR_EXP_TYP;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_MANHOUR_TYP = i_MANHOUR_TYP;
		m_TOTAL_RCV_QTY = i_TOTAL_RCV_QTY;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_PARENT_OD_NO = i_PARENT_OD_NO;
		m_CHIID_OD_NO = i_CHIID_OD_NO;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_Detail_ITEM_NAME = i_Detail_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_ITEM_SPOIL = i_ITEM_SPOIL;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_DUE_DATE = i_DUE_DATE;
		m_PRD_DUE_DATE = i_PRD_DUE_DATE;
		m_PRD_START_DATE = i_PRD_START_DATE;
		m_ODR_START_DATE = i_ODR_START_DATE;
		m_SUM_PUCH_ODR_QTY = i_SUM_PUCH_ODR_QTY;
		m_SUM_OPR_INST_QTY = i_SUM_OPR_INST_QTY;
		m_ODR_QTY = i_ODR_QTY;
		m_DM_QTY = i_DM_QTY;
		m_SUM_ALCD_QTY = i_SUM_ALCD_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_OD_GNR_TYP = i_OD_GNR_TYP;
		m_OPR_RSLT_TYP = i_OPR_RSLT_TYP;
		m_Sub1_PARENT_OD_NO = i_Sub1_PARENT_OD_NO;
		m_Sub1_Parent_ITEM_CD = i_Sub1_Parent_ITEM_CD;
		m_Sub1_Parent_ITEM_NAME = i_Sub1_Parent_ITEM_NAME;
		m_h_Sub1_Parent_OD_LEVEL_NO = i_h_Sub1_Parent_OD_LEVEL_NO;
		m_h_Parent_OD_MODIFY_COUNT = i_h_Parent_OD_MODIFY_COUNT;
		m_h_Sub1_Parent_ODR_QTY = i_h_Sub1_Parent_ODR_QTY;
		m_h_Sub1_Parent_ODR_START_DATE = i_h_Sub1_Parent_ODR_START_DATE;
		m_h_Sub1_Parent_ALC_GRP_CD = i_h_Sub1_Parent_ALC_GRP_CD;
		m_h_Sub1_ODR_STS_TYP = i_h_Sub1_ODR_STS_TYP;
		m_h_Sub1_DM_STS_TYP = i_h_Sub1_DM_STS_TYP;
		m_Sub1_Comp_ITEM_CD = i_Sub1_Comp_ITEM_CD;
		m_Sub1_Comp_ITEM_NAME = i_Sub1_Comp_ITEM_NAME;
		m_Sub1_DRAW_CD = i_Sub1_DRAW_CD;
		m_Sub1_SPEC = i_Sub1_SPEC;
		m_h_Sub1_MRP_ODR_TYP = i_h_Sub1_MRP_ODR_TYP;
		m_Sub1_ITEM_SPOIL = i_Sub1_ITEM_SPOIL;
		m_Sub1_PS_SPOIL = i_Sub1_PS_SPOIL;
		m_h_Sub1_UNIT_QTY_TYP = i_h_Sub1_UNIT_QTY_TYP;
		m_Sub1_DUE_DATE = i_Sub1_DUE_DATE;
		m_Sub1_PRD_DUE_DATE = i_Sub1_PRD_DUE_DATE;
		m_Sub1_PRD_START_DATE = i_Sub1_PRD_START_DATE;
		m_Sub1_ODR_START_DATE = i_Sub1_ODR_START_DATE;
		m_Sub1_ODR_QTY = i_Sub1_ODR_QTY;
		m_Sub1_DM_QTY = i_Sub1_DM_QTY;
		m_Sub1_STOCK_UNIT = i_Sub1_STOCK_UNIT;
		m_Sub1_PS_UNIT_DENOMINATOR = i_Sub1_PS_UNIT_DENOMINATOR;
		m_Sub1_PS_UNIT_NUMERATOR = i_Sub1_PS_UNIT_NUMERATOR;
		m_ODR_LT = i_ODR_LT;
		m_FIXED_LT = i_FIXED_LT;
		m_PROP_LT = i_PROP_LT;
		m_SAFETY_LT = i_SAFETY_LT;
		m_ISSUE_LT = i_ISSUE_LT;
		m_PROP_LOT_SIZE = i_PROP_LOT_SIZE;
		m_h_Comp_ITEM_MODIFY_COUNT = i_h_Comp_ITEM_MODIFY_COUNT;
		m_Sub1_OD_TYP = i_Sub1_OD_TYP;
		m_h_Sub1_PS_UNIT_QTY = i_h_Sub1_PS_UNIT_QTY;
		m_h_Sub1_OD_MODIFY_COUNT = i_h_Sub1_OD_MODIFY_COUNT;
		m_h_Sub1_MANHOUR_TYP = i_h_Sub1_MANHOUR_TYP;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_L_Sub1_DUE_DATE = i_L_Sub1_DUE_DATE;
		m_L_Sub1_ODR_START_DATE = i_L_Sub1_ODR_START_DATE;
		m_L_Sub1_PRD_DUE_DATE = i_L_Sub1_PRD_DUE_DATE;
		m_L_Sub1_PRD_START_DATE = i_L_Sub1_PRD_START_DATE;
		m_Sub1_MRP_ODR_TYP = i_Sub1_MRP_ODR_TYP;
		m_ISSUE_TYP = i_ISSUE_TYP;
		m_Sub1_PS_UNIT_QTY = i_Sub1_PS_UNIT_QTY;
		m_OD_LEVEL_NO = i_OD_LEVEL_NO;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
		m_setDM_QTY = i_setDM_QTY;
		m_setOUTSIDE_TYP = i_setOUTSIDE_TYP;
		m_setPS_UNIT_QTY = i_setPS_UNIT_QTY;
		m_setPS_SPOIL = i_setPS_SPOIL;
		m_setPS_UNIT_DENOMINATOR = i_setPS_UNIT_DENOMINATOR;
		m_setPS_UNIT_NUMERATOR = i_setPS_UNIT_NUMERATOR;
		m_setMRP_TYP = i_setMRP_TYP;
		m_setITEM_SPOIL = i_setITEM_SPOIL;
		m_setOD_NO = i_setOD_NO;
		m_h_Sub1_ISSUE_TYP = i_h_Sub1_ISSUE_TYP;
		m_CAL_NO = i_CAL_NO;
		m_ITEM_MODIFY_COUNT = i_ITEM_MODIFY_COUNT;
		m_OD_MODIFY_COUNT = i_OD_MODIFY_COUNT;
		m_PROC_CD = i_PROC_CD;
		m_VEND_CD = i_VEND_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_setDUE_DATE = i_setDUE_DATE;
		m_setPRD_DUE_DATE = i_setPRD_DUE_DATE;
		m_setPRD_START_DATE = i_setPRD_START_DATE;
		m_setODR_START_DATE = i_setODR_START_DATE;
		m_setODR_QTY = i_setODR_QTY;
		m_setOD_TYP = i_setOD_TYP;
		m_setODR_STS_TYP = i_setODR_STS_TYP;
		m_MIN_CAL_DATE = i_MIN_CAL_DATE;
		m_MAX_CAL_DATE = i_MAX_CAL_DATE;
		m_OD_CALC_FLG = i_OD_CALC_FLG;
		m_TIME_CTRL = i_TIME_CTRL;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
		m_WS_CD = i_WS_CD;
		m_Sub1_PUCH_ODR_CD = i_Sub1_PUCH_ODR_CD;
		m_Sub1_COMPANY_CD = i_Sub1_COMPANY_CD;
		m_Sub1_VEND_CD = i_Sub1_VEND_CD;
		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
		m_COUNT = i_COUNT;
		m_FINAL_PROC_FLG = i_FINAL_PROC_FLG;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_TOTAL_ACPT_QTY = i_TOTAL_ACPT_QTY;
		m_TOTAL_DEFECT_QTY = i_TOTAL_DEFECT_QTY;
		m_ACPT_QTY = i_ACPT_QTY;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_Sub1_WORK_IN_PROC_CD = i_Sub1_WORK_IN_PROC_CD;
		m_WH_CD = i_WH_CD;
		m_CONS_TYP = i_CONS_TYP;
		m_ONEROUS_FLG = i_ONEROUS_FLG;
		m_SysPLANT_CD = i_SysPLANT_CD;
		m_VALUE = i_VALUE;
		m_NAME = i_NAME;
		m_MY_COMPANY = i_MY_COMPANY;
		m_PVEND_CD = i_PVEND_CD;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_EXCH_RATE = i_EXCH_RATE;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_TAX_CD = i_TAX_CD;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_WH_CD1 = i_WH_CD1;
		m_WH_CD2 = i_WH_CD2;
		m_WH_CD3 = i_WH_CD3;
		m_OWN_PERSON_NAME = i_OWN_PERSON_NAME;
		m_PVC2BUSINESSNAME = i_PVC2BUSINESSNAME;
		m_PVC2OUTPUTPATH = i_PVC2OUTPUTPATH;
		m_PVC2OUTPUTNAME = i_PVC2OUTPUTNAME;
		m_PVC2LOGMODE = i_PVC2LOGMODE;
		m_PVC2OUTPUTMODE = i_PVC2OUTPUTMODE;
		m_PVC2USERID = i_PVC2USERID;
		m_PVC2PLANTCD = i_PVC2PLANTCD;
		m_PVC2TAXID = i_PVC2TAXID;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_PNUMTAXOUTAMOUNT = i_PNUMTAXOUTAMOUNT;
		m_PNUMTAXAMOUNT = i_PNUMTAXAMOUNT;
		m_PNUMEXTERNALTAXSALESAMOUNT = i_PNUMEXTERNALTAXSALESAMOUNT;
		m_PNUMINTERNALTAXSALESAMOUNT = i_PNUMINTERNALTAXSALESAMOUNT;
		m_PNUMTAXFREESALESAMOUNT = i_PNUMTAXFREESALESAMOUNT;
		m_PNUMEXTERNALTAXAMOUNT = i_PNUMEXTERNALTAXAMOUNT;
		m_PNUMINTERNALTAXAMOUNT = i_PNUMINTERNALTAXAMOUNT;
		m_PVC2ERRCD = i_PVC2ERRCD;
		m_PNUMSTATUS = i_PNUMSTATUS;
		m_PARENT_ITEM_CD = i_PARENT_ITEM_CD;
		m_PARENT_ITEM_NAME = i_PARENT_ITEM_NAME;
		m_PARENT_DRAW_CD = i_PARENT_DRAW_CD;
		m_PARENT_SPEC = i_PARENT_SPEC;
		m_PARENT_OUTSIDE_TYP = i_PARENT_OUTSIDE_TYP;
		m_PS_EDITION = i_PS_EDITION;
		m_PS_UNIT_DENOMINATOR = i_PS_UNIT_DENOMINATOR;
		m_PS_UNIT_NUMERATOR = i_PS_UNIT_NUMERATOR;
		m_PS_SPOIL = i_PS_SPOIL;
		m_PS_LT_FLG = i_PS_LT_FLG;
		m_PS_KEY = i_PS_KEY;
		m_CHILD_ITEM_NAME = i_CHILD_ITEM_NAME;
		m_CHILD_DRAW_CD = i_CHILD_DRAW_CD;
		m_CHILD_SPEC = i_CHILD_SPEC;
		m_CHILD_OUTSIDE_TYP = i_CHILD_OUTSIDE_TYP;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
