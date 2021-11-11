/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/src/com/nec/jp/orteus/metamorBase/AL0040/AL0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0040;

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
//}}user_implement_code_header

public class AL0040010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_Shift_Date */
	public String m_Shift_Date = null;
	/** 第 2 変数： m_hidden_High_Color */
	public String m_hidden_High_Color = null;
	/** 第 3 変数： m_hidden_Midd_Color */
	public String m_hidden_Midd_Color = null;
	/** 第 4 変数： m_hidden_Low_Color */
	public String m_hidden_Low_Color = null;
	/** 第 5 変数： m_hidden_DateFrom */
	public String m_hidden_DateFrom = null;
	/** 第 6 変数： m_hidden_DateTo */
	public String m_hidden_DateTo = null;
	/** 第 7 変数： m_S_LOAD_DATE */
	public String m_S_LOAD_DATE = null;
	/** 第 8 変数： m_w_AlInstalledFlg */
	public String m_w_AlInstalledFlg = null;
	/** 第 9 変数： m_NECK_PROC_NAME */
	public String m_NECK_PROC_NAME = null;
	/** 第 10 変数： m_NECK_PROC_CD */
	public String m_NECK_PROC_CD = null;
	/** 第 11 変数： m_LOAD_QTY1 */
	public String m_LOAD_QTY1 = null;
	/** 第 12 変数： m_LOAD_QTY2 */
	public String m_LOAD_QTY2 = null;
	/** 第 13 変数： m_LOAD_QTY3 */
	public String m_LOAD_QTY3 = null;
	/** 第 14 変数： m_LOAD_QTY4 */
	public String m_LOAD_QTY4 = null;
	/** 第 15 変数： m_LOAD_QTY5 */
	public String m_LOAD_QTY5 = null;
	/** 第 16 変数： m_LOAD_QTY6 */
	public String m_LOAD_QTY6 = null;
	/** 第 17 変数： m_LOAD_QTY7 */
	public String m_LOAD_QTY7 = null;
	/** 第 18 変数： m_LOAD_QTY8 */
	public String m_LOAD_QTY8 = null;
	/** 第 19 変数： m_LOAD_QTY9 */
	public String m_LOAD_QTY9 = null;
	/** 第 20 変数： m_LOAD_QTY10 */
	public String m_LOAD_QTY10 = null;
	/** 第 21 変数： m_LOAD_QTY11 */
	public String m_LOAD_QTY11 = null;
	/** 第 22 変数： m_LOAD_QTY12 */
	public String m_LOAD_QTY12 = null;
	/** 第 23 変数： m_LOAD_QTY13 */
	public String m_LOAD_QTY13 = null;
	/** 第 24 変数： m_LOAD_QTY14 */
	public String m_LOAD_QTY14 = null;
	/** 第 25 変数： m_LOAD_QTY15 */
	public String m_LOAD_QTY15 = null;
	/** 第 26 変数： m_LOAD_QTY16 */
	public String m_LOAD_QTY16 = null;
	/** 第 27 変数： m_LOAD_QTY17 */
	public String m_LOAD_QTY17 = null;
	/** 第 28 変数： m_LOAD_QTY18 */
	public String m_LOAD_QTY18 = null;
	/** 第 29 変数： m_LOAD_QTY19 */
	public String m_LOAD_QTY19 = null;
	/** 第 30 変数： m_LOAD_QTY20 */
	public String m_LOAD_QTY20 = null;
	/** 第 31 変数： m_LOAD_QTY21 */
	public String m_LOAD_QTY21 = null;
	/** 第 32 変数： m_LOAD_QTY22 */
	public String m_LOAD_QTY22 = null;
	/** 第 33 変数： m_LOAD_QTY23 */
	public String m_LOAD_QTY23 = null;
	/** 第 34 変数： m_LOAD_QTY24 */
	public String m_LOAD_QTY24 = null;
	/** 第 35 変数： m_LOAD_QTY25 */
	public String m_LOAD_QTY25 = null;
	/** 第 36 変数： m_LOAD_QTY26 */
	public String m_LOAD_QTY26 = null;
	/** 第 37 変数： m_LOAD_QTY27 */
	public String m_LOAD_QTY27 = null;
	/** 第 38 変数： m_LOAD_QTY28 */
	public String m_LOAD_QTY28 = null;
	/** 第 39 変数： m_LOAD_QTY29 */
	public String m_LOAD_QTY29 = null;
	/** 第 40 変数： m_LOAD_QTY30 */
	public String m_LOAD_QTY30 = null;
	/** 第 41 変数： m_LOAD_QTY31 */
	public String m_LOAD_QTY31 = null;
	/** 第 42 変数： m_LOAD_QTY32 */
	public String m_LOAD_QTY32 = null;
	/** 第 43 変数： m_LOAD_QTY33 */
	public String m_LOAD_QTY33 = null;
	/** 第 44 変数： m_LOAD_QTY34 */
	public String m_LOAD_QTY34 = null;
	/** 第 45 変数： m_LOAD_QTY35 */
	public String m_LOAD_QTY35 = null;
	/** 第 46 変数： m_LOAD_QTY36 */
	public String m_LOAD_QTY36 = null;
	/** 第 47 変数： m_LOAD_QTY37 */
	public String m_LOAD_QTY37 = null;
	/** 第 48 変数： m_LOAD_QTY38 */
	public String m_LOAD_QTY38 = null;
	/** 第 49 変数： m_LOAD_QTY39 */
	public String m_LOAD_QTY39 = null;
	/** 第 50 変数： m_LOAD_QTY40 */
	public String m_LOAD_QTY40 = null;
	/** 第 51 変数： m_LOAD_QTY41 */
	public String m_LOAD_QTY41 = null;
	/** 第 52 変数： m_LOAD_QTY42 */
	public String m_LOAD_QTY42 = null;
	/** 第 53 変数： m_LOAD_QTY43 */
	public String m_LOAD_QTY43 = null;
	/** 第 54 変数： m_LOAD_QTY44 */
	public String m_LOAD_QTY44 = null;
	/** 第 55 変数： m_LOAD_QTY45 */
	public String m_LOAD_QTY45 = null;
	/** 第 56 変数： m_LOAD_QTY46 */
	public String m_LOAD_QTY46 = null;
	/** 第 57 変数： m_LOAD_QTY47 */
	public String m_LOAD_QTY47 = null;
	/** 第 58 変数： m_LOAD_QTY48 */
	public String m_LOAD_QTY48 = null;
	/** 第 59 変数： m_LOAD_QTY49 */
	public String m_LOAD_QTY49 = null;
	/** 第 60 変数： m_LOAD_QTY50 */
	public String m_LOAD_QTY50 = null;
	/** 第 61 変数： m_LOAD_QTY51 */
	public String m_LOAD_QTY51 = null;
	/** 第 62 変数： m_LOAD_QTY52 */
	public String m_LOAD_QTY52 = null;
	/** 第 63 変数： m_LOAD_QTY53 */
	public String m_LOAD_QTY53 = null;
	/** 第 64 変数： m_LOAD_QTY54 */
	public String m_LOAD_QTY54 = null;
	/** 第 65 変数： m_LOAD_QTY55 */
	public String m_LOAD_QTY55 = null;
	/** 第 66 変数： m_LOAD_QTY56 */
	public String m_LOAD_QTY56 = null;
	/** 第 67 変数： m_LOAD_QTY57 */
	public String m_LOAD_QTY57 = null;
	/** 第 68 変数： m_LOAD_QTY58 */
	public String m_LOAD_QTY58 = null;
	/** 第 69 変数： m_LOAD_QTY59 */
	public String m_LOAD_QTY59 = null;
	/** 第 70 変数： m_LOAD_QTY60 */
	public String m_LOAD_QTY60 = null;
	/** 第 71 変数： m_LOAD_QTY61 */
	public String m_LOAD_QTY61 = null;
	/** 第 72 変数： m_LOAD_QTY62 */
	public String m_LOAD_QTY62 = null;
	/** 第 73 変数： m_LOAD_QTY63 */
	public String m_LOAD_QTY63 = null;
	/** 第 74 変数： m_LOAD_QTY64 */
	public String m_LOAD_QTY64 = null;
	/** 第 75 変数： m_LOAD_QTY65 */
	public String m_LOAD_QTY65 = null;
	/** 第 76 変数： m_LOAD_QTY66 */
	public String m_LOAD_QTY66 = null;
	/** 第 77 変数： m_LOAD_QTY67 */
	public String m_LOAD_QTY67 = null;
	/** 第 78 変数： m_LOAD_QTY68 */
	public String m_LOAD_QTY68 = null;
	/** 第 79 変数： m_LOAD_QTY69 */
	public String m_LOAD_QTY69 = null;
	/** 第 80 変数： m_LOAD_QTY70 */
	public String m_LOAD_QTY70 = null;
	/** 第 81 変数： m_LOAD_QTY71 */
	public String m_LOAD_QTY71 = null;
	/** 第 82 変数： m_LOAD_QTY72 */
	public String m_LOAD_QTY72 = null;
	/** 第 83 変数： m_LOAD_QTY73 */
	public String m_LOAD_QTY73 = null;
	/** 第 84 変数： m_LOAD_QTY74 */
	public String m_LOAD_QTY74 = null;
	/** 第 85 変数： m_LOAD_QTY75 */
	public String m_LOAD_QTY75 = null;
	/** 第 86 変数： m_LOAD_QTY76 */
	public String m_LOAD_QTY76 = null;
	/** 第 87 変数： m_LOAD_QTY77 */
	public String m_LOAD_QTY77 = null;
	/** 第 88 変数： m_LOAD_QTY78 */
	public String m_LOAD_QTY78 = null;
	/** 第 89 変数： m_LOAD_QTY79 */
	public String m_LOAD_QTY79 = null;
	/** 第 90 変数： m_LOAD_QTY80 */
	public String m_LOAD_QTY80 = null;
	/** 第 91 変数： m_LOAD_QTY81 */
	public String m_LOAD_QTY81 = null;
	/** 第 92 変数： m_LOAD_QTY82 */
	public String m_LOAD_QTY82 = null;
	/** 第 93 変数： m_LOAD_QTY83 */
	public String m_LOAD_QTY83 = null;
	/** 第 94 変数： m_LOAD_QTY84 */
	public String m_LOAD_QTY84 = null;
	/** 第 95 変数： m_LOAD_QTY85 */
	public String m_LOAD_QTY85 = null;
	/** 第 96 変数： m_LOAD_QTY86 */
	public String m_LOAD_QTY86 = null;
	/** 第 97 変数： m_LOAD_QTY87 */
	public String m_LOAD_QTY87 = null;
	/** 第 98 変数： m_LOAD_QTY88 */
	public String m_LOAD_QTY88 = null;
	/** 第 99 変数： m_LOAD_QTY89 */
	public String m_LOAD_QTY89 = null;
	/** 第 100 変数： m_LOAD_QTY90 */
	public String m_LOAD_QTY90 = null;
	/** 第 101 変数： m_DateFrom */
	public String m_DateFrom = null;
	/** 第 102 変数： m_DateTo */
	public String m_DateTo = null;
	/** 第 103 変数： m_K_PLANT_CD */
	public String m_K_PLANT_CD = null;
	/** 第 104 変数： m_CAL_DATE */
	public String m_CAL_DATE = null;
	/** 第 105 変数： m_Holiday_Flg */
	public String m_Holiday_Flg = null;
	/** 第 106 変数： m_L_NECK_PROC_CD */
	public String m_L_NECK_PROC_CD = null;
	/** 第 107 変数： m_L_LOAD_DATE */
	public String m_L_LOAD_DATE = null;
	/** 第 108 変数： m_L_LOAD_QTY */
	public String m_L_LOAD_QTY = null;
	/** 第 109 変数： m_L_ODR_STS_TYP */
	public String m_L_ODR_STS_TYP = null;
	/** 第 110 変数： m_K_NECK_PROC_CD */
	public String m_K_NECK_PROC_CD = null;
	/** 第 111 変数： m_K_LOAD_DATE */
	public String m_K_LOAD_DATE = null;
	/** 第 112 変数： m_L_CHT_DIM */
	public Integer m_L_CHT_DIM = null;
	/** 第 113 変数： m_L_CHT_TYPE */
	public Integer m_L_CHT_TYPE = null;
	/** 第 114 変数： m_L_BG_C_R */
	public Integer m_L_BG_C_R = null;
	/** 第 115 変数： m_L_BG_C_G */
	public Integer m_L_BG_C_G = null;
	/** 第 116 変数： m_L_BG_C_B */
	public Integer m_L_BG_C_B = null;
	/** 第 117 変数： m_L_MAX_SCALE */
	public Double m_L_MAX_SCALE = null;
	/** 第 118 変数： m_L_SCALE_STEP */
	public Double m_L_SCALE_STEP = null;
	/** 第 119 変数： m_L_CHT_C0_R */
	public Integer m_L_CHT_C0_R = null;
	/** 第 120 変数： m_L_CHT_C0_G */
	public Integer m_L_CHT_C0_G = null;
	/** 第 121 変数： m_L_CHT_C0_B */
	public Integer m_L_CHT_C0_B = null;
	/** 第 122 変数： m_L_CHT_C1_R */
	public Integer m_L_CHT_C1_R = null;
	/** 第 123 変数： m_L_CHT_C1_G */
	public Integer m_L_CHT_C1_G = null;
	/** 第 124 変数： m_L_CHT_C1_B */
	public Integer m_L_CHT_C1_B = null;
	/** 第 125 変数： m_L_CHT_C2_R */
	public Integer m_L_CHT_C2_R = null;
	/** 第 126 変数： m_L_CHT_C2_G */
	public Integer m_L_CHT_C2_G = null;
	/** 第 127 変数： m_L_CHT_C2_B */
	public Integer m_L_CHT_C2_B = null;
	/** 第 128 変数： m_L_CHT_C9_R */
	public Integer m_L_CHT_C9_R = null;
	/** 第 129 変数： m_L_CHT_C9_G */
	public Integer m_L_CHT_C9_G = null;
	/** 第 130 変数： m_L_CHT_C9_B */
	public Integer m_L_CHT_C9_B = null;
	/** 第 131 変数： m_L_HIGH_LOAD */
	public Integer m_L_HIGH_LOAD = null;
	/** 第 132 変数： m_L_H_LOAD_C_R */
	public Integer m_L_H_LOAD_C_R = null;
	/** 第 133 変数： m_L_H_LOAD_C_G */
	public Integer m_L_H_LOAD_C_G = null;
	/** 第 134 変数： m_L_H_LOAD_C_B */
	public Integer m_L_H_LOAD_C_B = null;
	/** 第 135 変数： m_L_MIDD_LOAD */
	public Integer m_L_MIDD_LOAD = null;
	/** 第 136 変数： m_L_M_LOAD_C_R */
	public Integer m_L_M_LOAD_C_R = null;
	/** 第 137 変数： m_L_M_LOAD_C_G */
	public Integer m_L_M_LOAD_C_G = null;
	/** 第 138 変数： m_L_M_LOAD_C_B */
	public Integer m_L_M_LOAD_C_B = null;
	/** 第 139 変数： m_L_LOW_LOAD */
	public Integer m_L_LOW_LOAD = null;
	/** 第 140 変数： m_L_L_LOAD_C_R */
	public Integer m_L_L_LOAD_C_R = null;
	/** 第 141 変数： m_L_L_LOAD_C_G */
	public Integer m_L_L_LOAD_C_G = null;
	/** 第 142 変数： m_L_L_LOAD_C_B */
	public Integer m_L_L_LOAD_C_B = null;
	/** 第 143 変数： m_LKM_ITEM_CD */
	public String m_LKM_ITEM_CD = null;
	/** 第 144 変数： m_LKM_ITEM_NAME */
	public String m_LKM_ITEM_NAME = null;
	/** 第 145 変数： m_LKM_JOB_ODR_CD */
	public String m_LKM_JOB_ODR_CD = null;
	/** 第 146 変数： m_LKM_ODR_STS_TYP */
	public String m_LKM_ODR_STS_TYP = null;
	/** 第 147 変数： m_LKM_PRD_START_DATE */
	public String m_LKM_PRD_START_DATE = null;
	/** 第 148 変数： m_LKM_PRD_DUE_DATE */
	public String m_LKM_PRD_DUE_DATE = null;
	/** 第 149 変数： m_LKM_ODR_QTY */
	public String m_LKM_ODR_QTY = null;
	/** 第 150 変数： m_LKM_TOTAL_RCV_QTY */
	public String m_LKM_TOTAL_RCV_QTY = null;
	/** 第 151 変数： m_LKM_UNIT_LOAD */
	public String m_LKM_UNIT_LOAD = null;
	/** 第 152 変数： m_LKM_LOAD_QTY */
	public String m_LKM_LOAD_QTY = null;
	/** 第 153 変数： m_KM_LOAD_DATE */
	public String m_KM_LOAD_DATE = null;
	/** 第 154 変数： m_LKM_SUM_LOAD_QTY */
	public String m_LKM_SUM_LOAD_QTY = null;
	/** 第 155 変数： m_LKM_OVR_LOAD_QTY */
	public String m_LKM_OVR_LOAD_QTY = null;
	/** 第 156 変数： m_LKM_NECK_PROC_CD */
	public String m_LKM_NECK_PROC_CD = null;
	/** 第 157 変数： m_LKM_LOAD_DATE */
	public String m_LKM_LOAD_DATE = null;
	/** 第 158 変数： m_LKM_NECK_PROC_NAME */
	public String m_LKM_NECK_PROC_NAME = null;
	/** 第 159 変数： m_LKM_NECK_PROC_CAPA */
	public String m_LKM_NECK_PROC_CAPA = null;
	/** 第 160 変数： m_LKM_NECK_PROC_CAPA_UNIT */
	public String m_LKM_NECK_PROC_CAPA_UNIT = null;
	/** 第 161 変数： m_FLG1 */
	public String m_FLG1 = null;
	/** 第 162 変数： m_FLG2 */
	public String m_FLG2 = null;
	/** 第 163 変数： m_FLG3 */
	public String m_FLG3 = null;
	/** 第 164 変数： m_FLG4 */
	public String m_FLG4 = null;
	/** 第 165 変数： m_FLG5 */
	public String m_FLG5 = null;
	/** 第 166 変数： m_FLG6 */
	public String m_FLG6 = null;
	/** 第 167 変数： m_FLG7 */
	public String m_FLG7 = null;
	/** 第 168 変数： m_FLG8 */
	public String m_FLG8 = null;
	/** 第 169 変数： m_FLG9 */
	public String m_FLG9 = null;
	/** 第 170 変数： m_FLG10 */
	public String m_FLG10 = null;
	/** 第 171 変数： m_FLG11 */
	public String m_FLG11 = null;
	/** 第 172 変数： m_FLG12 */
	public String m_FLG12 = null;
	/** 第 173 変数： m_FLG13 */
	public String m_FLG13 = null;
	/** 第 174 変数： m_FLG14 */
	public String m_FLG14 = null;
	/** 第 175 変数： m_FLG15 */
	public String m_FLG15 = null;
	/** 第 176 変数： m_FLG16 */
	public String m_FLG16 = null;
	/** 第 177 変数： m_FLG17 */
	public String m_FLG17 = null;
	/** 第 178 変数： m_FLG18 */
	public String m_FLG18 = null;
	/** 第 179 変数： m_FLG19 */
	public String m_FLG19 = null;
	/** 第 180 変数： m_FLG20 */
	public String m_FLG20 = null;
	/** 第 181 変数： m_FLG21 */
	public String m_FLG21 = null;
	/** 第 182 変数： m_FLG22 */
	public String m_FLG22 = null;
	/** 第 183 変数： m_FLG23 */
	public String m_FLG23 = null;
	/** 第 184 変数： m_FLG24 */
	public String m_FLG24 = null;
	/** 第 185 変数： m_FLG25 */
	public String m_FLG25 = null;
	/** 第 186 変数： m_FLG26 */
	public String m_FLG26 = null;
	/** 第 187 変数： m_FLG27 */
	public String m_FLG27 = null;
	/** 第 188 変数： m_FLG28 */
	public String m_FLG28 = null;
	/** 第 189 変数： m_FLG29 */
	public String m_FLG29 = null;
	/** 第 190 変数： m_FLG30 */
	public String m_FLG30 = null;
	/** 第 191 変数： m_FLG31 */
	public String m_FLG31 = null;
	/** 第 192 変数： m_FLG32 */
	public String m_FLG32 = null;
	/** 第 193 変数： m_FLG33 */
	public String m_FLG33 = null;
	/** 第 194 変数： m_FLG34 */
	public String m_FLG34 = null;
	/** 第 195 変数： m_FLG35 */
	public String m_FLG35 = null;
	/** 第 196 変数： m_FLG36 */
	public String m_FLG36 = null;
	/** 第 197 変数： m_FLG37 */
	public String m_FLG37 = null;
	/** 第 198 変数： m_FLG38 */
	public String m_FLG38 = null;
	/** 第 199 変数： m_FLG39 */
	public String m_FLG39 = null;
	/** 第 200 変数： m_FLG40 */
	public String m_FLG40 = null;
	/** 第 201 変数： m_FLG41 */
	public String m_FLG41 = null;
	/** 第 202 変数： m_FLG42 */
	public String m_FLG42 = null;
	/** 第 203 変数： m_FLG43 */
	public String m_FLG43 = null;
	/** 第 204 変数： m_FLG44 */
	public String m_FLG44 = null;
	/** 第 205 変数： m_FLG45 */
	public String m_FLG45 = null;
	/** 第 206 変数： m_FLG46 */
	public String m_FLG46 = null;
	/** 第 207 変数： m_FLG47 */
	public String m_FLG47 = null;
	/** 第 208 変数： m_FLG48 */
	public String m_FLG48 = null;
	/** 第 209 変数： m_FLG49 */
	public String m_FLG49 = null;
	/** 第 210 変数： m_FLG50 */
	public String m_FLG50 = null;
	/** 第 211 変数： m_FLG51 */
	public String m_FLG51 = null;
	/** 第 212 変数： m_FLG52 */
	public String m_FLG52 = null;
	/** 第 213 変数： m_FLG53 */
	public String m_FLG53 = null;
	/** 第 214 変数： m_FLG54 */
	public String m_FLG54 = null;
	/** 第 215 変数： m_FLG55 */
	public String m_FLG55 = null;
	/** 第 216 変数： m_FLG56 */
	public String m_FLG56 = null;
	/** 第 217 変数： m_FLG57 */
	public String m_FLG57 = null;
	/** 第 218 変数： m_FLG58 */
	public String m_FLG58 = null;
	/** 第 219 変数： m_FLG59 */
	public String m_FLG59 = null;
	/** 第 220 変数： m_FLG60 */
	public String m_FLG60 = null;
	/** 第 221 変数： m_FLG61 */
	public String m_FLG61 = null;
	/** 第 222 変数： m_FLG62 */
	public String m_FLG62 = null;
	/** 第 223 変数： m_FLG63 */
	public String m_FLG63 = null;
	/** 第 224 変数： m_FLG64 */
	public String m_FLG64 = null;
	/** 第 225 変数： m_FLG65 */
	public String m_FLG65 = null;
	/** 第 226 変数： m_FLG66 */
	public String m_FLG66 = null;
	/** 第 227 変数： m_FLG67 */
	public String m_FLG67 = null;
	/** 第 228 変数： m_FLG68 */
	public String m_FLG68 = null;
	/** 第 229 変数： m_FLG69 */
	public String m_FLG69 = null;
	/** 第 230 変数： m_FLG70 */
	public String m_FLG70 = null;
	/** 第 231 変数： m_FLG71 */
	public String m_FLG71 = null;
	/** 第 232 変数： m_FLG72 */
	public String m_FLG72 = null;
	/** 第 233 変数： m_FLG73 */
	public String m_FLG73 = null;
	/** 第 234 変数： m_FLG74 */
	public String m_FLG74 = null;
	/** 第 235 変数： m_FLG75 */
	public String m_FLG75 = null;
	/** 第 236 変数： m_FLG76 */
	public String m_FLG76 = null;
	/** 第 237 変数： m_FLG77 */
	public String m_FLG77 = null;
	/** 第 238 変数： m_FLG78 */
	public String m_FLG78 = null;
	/** 第 239 変数： m_FLG79 */
	public String m_FLG79 = null;
	/** 第 240 変数： m_FLG80 */
	public String m_FLG80 = null;
	/** 第 241 変数： m_FLG81 */
	public String m_FLG81 = null;
	/** 第 242 変数： m_FLG82 */
	public String m_FLG82 = null;
	/** 第 243 変数： m_FLG83 */
	public String m_FLG83 = null;
	/** 第 244 変数： m_FLG84 */
	public String m_FLG84 = null;
	/** 第 245 変数： m_FLG85 */
	public String m_FLG85 = null;
	/** 第 246 変数： m_FLG86 */
	public String m_FLG86 = null;
	/** 第 247 変数： m_FLG87 */
	public String m_FLG87 = null;
	/** 第 248 変数： m_FLG88 */
	public String m_FLG88 = null;
	/** 第 249 変数： m_FLG89 */
	public String m_FLG89 = null;
	/** 第 250 変数： m_FLG90 */
	public String m_FLG90 = null;
	/** 第 251 変数： m_L_NECK_PROC_NAME */
	public String m_L_NECK_PROC_NAME = null;
	/** 第 252 変数： m_L_NECK_PROC_CAPA */
	public String m_L_NECK_PROC_CAPA = null;
	/** 第 253 変数： m_L_NECK_PROC_CAPA_UNIT */
	public String m_L_NECK_PROC_CAPA_UNIT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_Shift_Date */
	public List l_Shift_Date = null;

	/** 第 2 List変数： l_hidden_High_Color */
	public List l_hidden_High_Color = null;

	/** 第 3 List変数： l_hidden_Midd_Color */
	public List l_hidden_Midd_Color = null;

	/** 第 4 List変数： l_hidden_Low_Color */
	public List l_hidden_Low_Color = null;

	/** 第 5 List変数： l_hidden_DateFrom */
	public List l_hidden_DateFrom = null;

	/** 第 6 List変数： l_hidden_DateTo */
	public List l_hidden_DateTo = null;

	/** 第 7 List変数： l_S_LOAD_DATE */
	public List l_S_LOAD_DATE = null;

	/** 第 8 List変数： l_w_AlInstalledFlg */
	public List l_w_AlInstalledFlg = null;

	/** 第 9 List変数： l_NECK_PROC_NAME */
	public List l_NECK_PROC_NAME = null;

	/** 第 10 List変数： l_NECK_PROC_CD */
	public List l_NECK_PROC_CD = null;

	/** 第 11 List変数： l_LOAD_QTY1 */
	public List l_LOAD_QTY1 = null;

	/** 第 12 List変数： l_LOAD_QTY2 */
	public List l_LOAD_QTY2 = null;

	/** 第 13 List変数： l_LOAD_QTY3 */
	public List l_LOAD_QTY3 = null;

	/** 第 14 List変数： l_LOAD_QTY4 */
	public List l_LOAD_QTY4 = null;

	/** 第 15 List変数： l_LOAD_QTY5 */
	public List l_LOAD_QTY5 = null;

	/** 第 16 List変数： l_LOAD_QTY6 */
	public List l_LOAD_QTY6 = null;

	/** 第 17 List変数： l_LOAD_QTY7 */
	public List l_LOAD_QTY7 = null;

	/** 第 18 List変数： l_LOAD_QTY8 */
	public List l_LOAD_QTY8 = null;

	/** 第 19 List変数： l_LOAD_QTY9 */
	public List l_LOAD_QTY9 = null;

	/** 第 20 List変数： l_LOAD_QTY10 */
	public List l_LOAD_QTY10 = null;

	/** 第 21 List変数： l_LOAD_QTY11 */
	public List l_LOAD_QTY11 = null;

	/** 第 22 List変数： l_LOAD_QTY12 */
	public List l_LOAD_QTY12 = null;

	/** 第 23 List変数： l_LOAD_QTY13 */
	public List l_LOAD_QTY13 = null;

	/** 第 24 List変数： l_LOAD_QTY14 */
	public List l_LOAD_QTY14 = null;

	/** 第 25 List変数： l_LOAD_QTY15 */
	public List l_LOAD_QTY15 = null;

	/** 第 26 List変数： l_LOAD_QTY16 */
	public List l_LOAD_QTY16 = null;

	/** 第 27 List変数： l_LOAD_QTY17 */
	public List l_LOAD_QTY17 = null;

	/** 第 28 List変数： l_LOAD_QTY18 */
	public List l_LOAD_QTY18 = null;

	/** 第 29 List変数： l_LOAD_QTY19 */
	public List l_LOAD_QTY19 = null;

	/** 第 30 List変数： l_LOAD_QTY20 */
	public List l_LOAD_QTY20 = null;

	/** 第 31 List変数： l_LOAD_QTY21 */
	public List l_LOAD_QTY21 = null;

	/** 第 32 List変数： l_LOAD_QTY22 */
	public List l_LOAD_QTY22 = null;

	/** 第 33 List変数： l_LOAD_QTY23 */
	public List l_LOAD_QTY23 = null;

	/** 第 34 List変数： l_LOAD_QTY24 */
	public List l_LOAD_QTY24 = null;

	/** 第 35 List変数： l_LOAD_QTY25 */
	public List l_LOAD_QTY25 = null;

	/** 第 36 List変数： l_LOAD_QTY26 */
	public List l_LOAD_QTY26 = null;

	/** 第 37 List変数： l_LOAD_QTY27 */
	public List l_LOAD_QTY27 = null;

	/** 第 38 List変数： l_LOAD_QTY28 */
	public List l_LOAD_QTY28 = null;

	/** 第 39 List変数： l_LOAD_QTY29 */
	public List l_LOAD_QTY29 = null;

	/** 第 40 List変数： l_LOAD_QTY30 */
	public List l_LOAD_QTY30 = null;

	/** 第 41 List変数： l_LOAD_QTY31 */
	public List l_LOAD_QTY31 = null;

	/** 第 42 List変数： l_LOAD_QTY32 */
	public List l_LOAD_QTY32 = null;

	/** 第 43 List変数： l_LOAD_QTY33 */
	public List l_LOAD_QTY33 = null;

	/** 第 44 List変数： l_LOAD_QTY34 */
	public List l_LOAD_QTY34 = null;

	/** 第 45 List変数： l_LOAD_QTY35 */
	public List l_LOAD_QTY35 = null;

	/** 第 46 List変数： l_LOAD_QTY36 */
	public List l_LOAD_QTY36 = null;

	/** 第 47 List変数： l_LOAD_QTY37 */
	public List l_LOAD_QTY37 = null;

	/** 第 48 List変数： l_LOAD_QTY38 */
	public List l_LOAD_QTY38 = null;

	/** 第 49 List変数： l_LOAD_QTY39 */
	public List l_LOAD_QTY39 = null;

	/** 第 50 List変数： l_LOAD_QTY40 */
	public List l_LOAD_QTY40 = null;

	/** 第 51 List変数： l_LOAD_QTY41 */
	public List l_LOAD_QTY41 = null;

	/** 第 52 List変数： l_LOAD_QTY42 */
	public List l_LOAD_QTY42 = null;

	/** 第 53 List変数： l_LOAD_QTY43 */
	public List l_LOAD_QTY43 = null;

	/** 第 54 List変数： l_LOAD_QTY44 */
	public List l_LOAD_QTY44 = null;

	/** 第 55 List変数： l_LOAD_QTY45 */
	public List l_LOAD_QTY45 = null;

	/** 第 56 List変数： l_LOAD_QTY46 */
	public List l_LOAD_QTY46 = null;

	/** 第 57 List変数： l_LOAD_QTY47 */
	public List l_LOAD_QTY47 = null;

	/** 第 58 List変数： l_LOAD_QTY48 */
	public List l_LOAD_QTY48 = null;

	/** 第 59 List変数： l_LOAD_QTY49 */
	public List l_LOAD_QTY49 = null;

	/** 第 60 List変数： l_LOAD_QTY50 */
	public List l_LOAD_QTY50 = null;

	/** 第 61 List変数： l_LOAD_QTY51 */
	public List l_LOAD_QTY51 = null;

	/** 第 62 List変数： l_LOAD_QTY52 */
	public List l_LOAD_QTY52 = null;

	/** 第 63 List変数： l_LOAD_QTY53 */
	public List l_LOAD_QTY53 = null;

	/** 第 64 List変数： l_LOAD_QTY54 */
	public List l_LOAD_QTY54 = null;

	/** 第 65 List変数： l_LOAD_QTY55 */
	public List l_LOAD_QTY55 = null;

	/** 第 66 List変数： l_LOAD_QTY56 */
	public List l_LOAD_QTY56 = null;

	/** 第 67 List変数： l_LOAD_QTY57 */
	public List l_LOAD_QTY57 = null;

	/** 第 68 List変数： l_LOAD_QTY58 */
	public List l_LOAD_QTY58 = null;

	/** 第 69 List変数： l_LOAD_QTY59 */
	public List l_LOAD_QTY59 = null;

	/** 第 70 List変数： l_LOAD_QTY60 */
	public List l_LOAD_QTY60 = null;

	/** 第 71 List変数： l_LOAD_QTY61 */
	public List l_LOAD_QTY61 = null;

	/** 第 72 List変数： l_LOAD_QTY62 */
	public List l_LOAD_QTY62 = null;

	/** 第 73 List変数： l_LOAD_QTY63 */
	public List l_LOAD_QTY63 = null;

	/** 第 74 List変数： l_LOAD_QTY64 */
	public List l_LOAD_QTY64 = null;

	/** 第 75 List変数： l_LOAD_QTY65 */
	public List l_LOAD_QTY65 = null;

	/** 第 76 List変数： l_LOAD_QTY66 */
	public List l_LOAD_QTY66 = null;

	/** 第 77 List変数： l_LOAD_QTY67 */
	public List l_LOAD_QTY67 = null;

	/** 第 78 List変数： l_LOAD_QTY68 */
	public List l_LOAD_QTY68 = null;

	/** 第 79 List変数： l_LOAD_QTY69 */
	public List l_LOAD_QTY69 = null;

	/** 第 80 List変数： l_LOAD_QTY70 */
	public List l_LOAD_QTY70 = null;

	/** 第 81 List変数： l_LOAD_QTY71 */
	public List l_LOAD_QTY71 = null;

	/** 第 82 List変数： l_LOAD_QTY72 */
	public List l_LOAD_QTY72 = null;

	/** 第 83 List変数： l_LOAD_QTY73 */
	public List l_LOAD_QTY73 = null;

	/** 第 84 List変数： l_LOAD_QTY74 */
	public List l_LOAD_QTY74 = null;

	/** 第 85 List変数： l_LOAD_QTY75 */
	public List l_LOAD_QTY75 = null;

	/** 第 86 List変数： l_LOAD_QTY76 */
	public List l_LOAD_QTY76 = null;

	/** 第 87 List変数： l_LOAD_QTY77 */
	public List l_LOAD_QTY77 = null;

	/** 第 88 List変数： l_LOAD_QTY78 */
	public List l_LOAD_QTY78 = null;

	/** 第 89 List変数： l_LOAD_QTY79 */
	public List l_LOAD_QTY79 = null;

	/** 第 90 List変数： l_LOAD_QTY80 */
	public List l_LOAD_QTY80 = null;

	/** 第 91 List変数： l_LOAD_QTY81 */
	public List l_LOAD_QTY81 = null;

	/** 第 92 List変数： l_LOAD_QTY82 */
	public List l_LOAD_QTY82 = null;

	/** 第 93 List変数： l_LOAD_QTY83 */
	public List l_LOAD_QTY83 = null;

	/** 第 94 List変数： l_LOAD_QTY84 */
	public List l_LOAD_QTY84 = null;

	/** 第 95 List変数： l_LOAD_QTY85 */
	public List l_LOAD_QTY85 = null;

	/** 第 96 List変数： l_LOAD_QTY86 */
	public List l_LOAD_QTY86 = null;

	/** 第 97 List変数： l_LOAD_QTY87 */
	public List l_LOAD_QTY87 = null;

	/** 第 98 List変数： l_LOAD_QTY88 */
	public List l_LOAD_QTY88 = null;

	/** 第 99 List変数： l_LOAD_QTY89 */
	public List l_LOAD_QTY89 = null;

	/** 第 100 List変数： l_LOAD_QTY90 */
	public List l_LOAD_QTY90 = null;

	/** 第 101 List変数： l_DateFrom */
	public List l_DateFrom = null;

	/** 第 102 List変数： l_DateTo */
	public List l_DateTo = null;

	/** 第 103 List変数： l_K_PLANT_CD */
	public List l_K_PLANT_CD = null;

	/** 第 104 List変数： l_CAL_DATE */
	public List l_CAL_DATE = null;

	/** 第 105 List変数： l_Holiday_Flg */
	public List l_Holiday_Flg = null;

	/** 第 106 List変数： l_L_NECK_PROC_CD */
	public List l_L_NECK_PROC_CD = null;

	/** 第 107 List変数： l_L_LOAD_DATE */
	public List l_L_LOAD_DATE = null;

	/** 第 108 List変数： l_L_LOAD_QTY */
	public List l_L_LOAD_QTY = null;

	/** 第 109 List変数： l_L_ODR_STS_TYP */
	public List l_L_ODR_STS_TYP = null;

	/** 第 110 List変数： l_K_NECK_PROC_CD */
	public List l_K_NECK_PROC_CD = null;

	/** 第 111 List変数： l_K_LOAD_DATE */
	public List l_K_LOAD_DATE = null;

	/** 第 112 List変数： l_L_CHT_DIM */
	public List l_L_CHT_DIM = null;

	/** 第 113 List変数： l_L_CHT_TYPE */
	public List l_L_CHT_TYPE = null;

	/** 第 114 List変数： l_L_BG_C_R */
	public List l_L_BG_C_R = null;

	/** 第 115 List変数： l_L_BG_C_G */
	public List l_L_BG_C_G = null;

	/** 第 116 List変数： l_L_BG_C_B */
	public List l_L_BG_C_B = null;

	/** 第 117 List変数： l_L_MAX_SCALE */
	public List l_L_MAX_SCALE = null;

	/** 第 118 List変数： l_L_SCALE_STEP */
	public List l_L_SCALE_STEP = null;

	/** 第 119 List変数： l_L_CHT_C0_R */
	public List l_L_CHT_C0_R = null;

	/** 第 120 List変数： l_L_CHT_C0_G */
	public List l_L_CHT_C0_G = null;

	/** 第 121 List変数： l_L_CHT_C0_B */
	public List l_L_CHT_C0_B = null;

	/** 第 122 List変数： l_L_CHT_C1_R */
	public List l_L_CHT_C1_R = null;

	/** 第 123 List変数： l_L_CHT_C1_G */
	public List l_L_CHT_C1_G = null;

	/** 第 124 List変数： l_L_CHT_C1_B */
	public List l_L_CHT_C1_B = null;

	/** 第 125 List変数： l_L_CHT_C2_R */
	public List l_L_CHT_C2_R = null;

	/** 第 126 List変数： l_L_CHT_C2_G */
	public List l_L_CHT_C2_G = null;

	/** 第 127 List変数： l_L_CHT_C2_B */
	public List l_L_CHT_C2_B = null;

	/** 第 128 List変数： l_L_CHT_C9_R */
	public List l_L_CHT_C9_R = null;

	/** 第 129 List変数： l_L_CHT_C9_G */
	public List l_L_CHT_C9_G = null;

	/** 第 130 List変数： l_L_CHT_C9_B */
	public List l_L_CHT_C9_B = null;

	/** 第 131 List変数： l_L_HIGH_LOAD */
	public List l_L_HIGH_LOAD = null;

	/** 第 132 List変数： l_L_H_LOAD_C_R */
	public List l_L_H_LOAD_C_R = null;

	/** 第 133 List変数： l_L_H_LOAD_C_G */
	public List l_L_H_LOAD_C_G = null;

	/** 第 134 List変数： l_L_H_LOAD_C_B */
	public List l_L_H_LOAD_C_B = null;

	/** 第 135 List変数： l_L_MIDD_LOAD */
	public List l_L_MIDD_LOAD = null;

	/** 第 136 List変数： l_L_M_LOAD_C_R */
	public List l_L_M_LOAD_C_R = null;

	/** 第 137 List変数： l_L_M_LOAD_C_G */
	public List l_L_M_LOAD_C_G = null;

	/** 第 138 List変数： l_L_M_LOAD_C_B */
	public List l_L_M_LOAD_C_B = null;

	/** 第 139 List変数： l_L_LOW_LOAD */
	public List l_L_LOW_LOAD = null;

	/** 第 140 List変数： l_L_L_LOAD_C_R */
	public List l_L_L_LOAD_C_R = null;

	/** 第 141 List変数： l_L_L_LOAD_C_G */
	public List l_L_L_LOAD_C_G = null;

	/** 第 142 List変数： l_L_L_LOAD_C_B */
	public List l_L_L_LOAD_C_B = null;

	/** 第 143 List変数： l_LKM_ITEM_CD */
	public List l_LKM_ITEM_CD = null;

	/** 第 144 List変数： l_LKM_ITEM_NAME */
	public List l_LKM_ITEM_NAME = null;

	/** 第 145 List変数： l_LKM_JOB_ODR_CD */
	public List l_LKM_JOB_ODR_CD = null;

	/** 第 146 List変数： l_LKM_ODR_STS_TYP */
	public List l_LKM_ODR_STS_TYP = null;

	/** 第 147 List変数： l_LKM_PRD_START_DATE */
	public List l_LKM_PRD_START_DATE = null;

	/** 第 148 List変数： l_LKM_PRD_DUE_DATE */
	public List l_LKM_PRD_DUE_DATE = null;

	/** 第 149 List変数： l_LKM_ODR_QTY */
	public List l_LKM_ODR_QTY = null;

	/** 第 150 List変数： l_LKM_TOTAL_RCV_QTY */
	public List l_LKM_TOTAL_RCV_QTY = null;

	/** 第 151 List変数： l_LKM_UNIT_LOAD */
	public List l_LKM_UNIT_LOAD = null;

	/** 第 152 List変数： l_LKM_LOAD_QTY */
	public List l_LKM_LOAD_QTY = null;

	/** 第 153 List変数： l_KM_LOAD_DATE */
	public List l_KM_LOAD_DATE = null;

	/** 第 154 List変数： l_LKM_SUM_LOAD_QTY */
	public List l_LKM_SUM_LOAD_QTY = null;

	/** 第 155 List変数： l_LKM_OVR_LOAD_QTY */
	public List l_LKM_OVR_LOAD_QTY = null;

	/** 第 156 List変数： l_LKM_NECK_PROC_CD */
	public List l_LKM_NECK_PROC_CD = null;

	/** 第 157 List変数： l_LKM_LOAD_DATE */
	public List l_LKM_LOAD_DATE = null;

	/** 第 158 List変数： l_LKM_NECK_PROC_NAME */
	public List l_LKM_NECK_PROC_NAME = null;

	/** 第 159 List変数： l_LKM_NECK_PROC_CAPA */
	public List l_LKM_NECK_PROC_CAPA = null;

	/** 第 160 List変数： l_LKM_NECK_PROC_CAPA_UNIT */
	public List l_LKM_NECK_PROC_CAPA_UNIT = null;

	/** 第 161 List変数： l_FLG1 */
	public List l_FLG1 = null;

	/** 第 162 List変数： l_FLG2 */
	public List l_FLG2 = null;

	/** 第 163 List変数： l_FLG3 */
	public List l_FLG3 = null;

	/** 第 164 List変数： l_FLG4 */
	public List l_FLG4 = null;

	/** 第 165 List変数： l_FLG5 */
	public List l_FLG5 = null;

	/** 第 166 List変数： l_FLG6 */
	public List l_FLG6 = null;

	/** 第 167 List変数： l_FLG7 */
	public List l_FLG7 = null;

	/** 第 168 List変数： l_FLG8 */
	public List l_FLG8 = null;

	/** 第 169 List変数： l_FLG9 */
	public List l_FLG9 = null;

	/** 第 170 List変数： l_FLG10 */
	public List l_FLG10 = null;

	/** 第 171 List変数： l_FLG11 */
	public List l_FLG11 = null;

	/** 第 172 List変数： l_FLG12 */
	public List l_FLG12 = null;

	/** 第 173 List変数： l_FLG13 */
	public List l_FLG13 = null;

	/** 第 174 List変数： l_FLG14 */
	public List l_FLG14 = null;

	/** 第 175 List変数： l_FLG15 */
	public List l_FLG15 = null;

	/** 第 176 List変数： l_FLG16 */
	public List l_FLG16 = null;

	/** 第 177 List変数： l_FLG17 */
	public List l_FLG17 = null;

	/** 第 178 List変数： l_FLG18 */
	public List l_FLG18 = null;

	/** 第 179 List変数： l_FLG19 */
	public List l_FLG19 = null;

	/** 第 180 List変数： l_FLG20 */
	public List l_FLG20 = null;

	/** 第 181 List変数： l_FLG21 */
	public List l_FLG21 = null;

	/** 第 182 List変数： l_FLG22 */
	public List l_FLG22 = null;

	/** 第 183 List変数： l_FLG23 */
	public List l_FLG23 = null;

	/** 第 184 List変数： l_FLG24 */
	public List l_FLG24 = null;

	/** 第 185 List変数： l_FLG25 */
	public List l_FLG25 = null;

	/** 第 186 List変数： l_FLG26 */
	public List l_FLG26 = null;

	/** 第 187 List変数： l_FLG27 */
	public List l_FLG27 = null;

	/** 第 188 List変数： l_FLG28 */
	public List l_FLG28 = null;

	/** 第 189 List変数： l_FLG29 */
	public List l_FLG29 = null;

	/** 第 190 List変数： l_FLG30 */
	public List l_FLG30 = null;

	/** 第 191 List変数： l_FLG31 */
	public List l_FLG31 = null;

	/** 第 192 List変数： l_FLG32 */
	public List l_FLG32 = null;

	/** 第 193 List変数： l_FLG33 */
	public List l_FLG33 = null;

	/** 第 194 List変数： l_FLG34 */
	public List l_FLG34 = null;

	/** 第 195 List変数： l_FLG35 */
	public List l_FLG35 = null;

	/** 第 196 List変数： l_FLG36 */
	public List l_FLG36 = null;

	/** 第 197 List変数： l_FLG37 */
	public List l_FLG37 = null;

	/** 第 198 List変数： l_FLG38 */
	public List l_FLG38 = null;

	/** 第 199 List変数： l_FLG39 */
	public List l_FLG39 = null;

	/** 第 200 List変数： l_FLG40 */
	public List l_FLG40 = null;

	/** 第 201 List変数： l_FLG41 */
	public List l_FLG41 = null;

	/** 第 202 List変数： l_FLG42 */
	public List l_FLG42 = null;

	/** 第 203 List変数： l_FLG43 */
	public List l_FLG43 = null;

	/** 第 204 List変数： l_FLG44 */
	public List l_FLG44 = null;

	/** 第 205 List変数： l_FLG45 */
	public List l_FLG45 = null;

	/** 第 206 List変数： l_FLG46 */
	public List l_FLG46 = null;

	/** 第 207 List変数： l_FLG47 */
	public List l_FLG47 = null;

	/** 第 208 List変数： l_FLG48 */
	public List l_FLG48 = null;

	/** 第 209 List変数： l_FLG49 */
	public List l_FLG49 = null;

	/** 第 210 List変数： l_FLG50 */
	public List l_FLG50 = null;

	/** 第 211 List変数： l_FLG51 */
	public List l_FLG51 = null;

	/** 第 212 List変数： l_FLG52 */
	public List l_FLG52 = null;

	/** 第 213 List変数： l_FLG53 */
	public List l_FLG53 = null;

	/** 第 214 List変数： l_FLG54 */
	public List l_FLG54 = null;

	/** 第 215 List変数： l_FLG55 */
	public List l_FLG55 = null;

	/** 第 216 List変数： l_FLG56 */
	public List l_FLG56 = null;

	/** 第 217 List変数： l_FLG57 */
	public List l_FLG57 = null;

	/** 第 218 List変数： l_FLG58 */
	public List l_FLG58 = null;

	/** 第 219 List変数： l_FLG59 */
	public List l_FLG59 = null;

	/** 第 220 List変数： l_FLG60 */
	public List l_FLG60 = null;

	/** 第 221 List変数： l_FLG61 */
	public List l_FLG61 = null;

	/** 第 222 List変数： l_FLG62 */
	public List l_FLG62 = null;

	/** 第 223 List変数： l_FLG63 */
	public List l_FLG63 = null;

	/** 第 224 List変数： l_FLG64 */
	public List l_FLG64 = null;

	/** 第 225 List変数： l_FLG65 */
	public List l_FLG65 = null;

	/** 第 226 List変数： l_FLG66 */
	public List l_FLG66 = null;

	/** 第 227 List変数： l_FLG67 */
	public List l_FLG67 = null;

	/** 第 228 List変数： l_FLG68 */
	public List l_FLG68 = null;

	/** 第 229 List変数： l_FLG69 */
	public List l_FLG69 = null;

	/** 第 230 List変数： l_FLG70 */
	public List l_FLG70 = null;

	/** 第 231 List変数： l_FLG71 */
	public List l_FLG71 = null;

	/** 第 232 List変数： l_FLG72 */
	public List l_FLG72 = null;

	/** 第 233 List変数： l_FLG73 */
	public List l_FLG73 = null;

	/** 第 234 List変数： l_FLG74 */
	public List l_FLG74 = null;

	/** 第 235 List変数： l_FLG75 */
	public List l_FLG75 = null;

	/** 第 236 List変数： l_FLG76 */
	public List l_FLG76 = null;

	/** 第 237 List変数： l_FLG77 */
	public List l_FLG77 = null;

	/** 第 238 List変数： l_FLG78 */
	public List l_FLG78 = null;

	/** 第 239 List変数： l_FLG79 */
	public List l_FLG79 = null;

	/** 第 240 List変数： l_FLG80 */
	public List l_FLG80 = null;

	/** 第 241 List変数： l_FLG81 */
	public List l_FLG81 = null;

	/** 第 242 List変数： l_FLG82 */
	public List l_FLG82 = null;

	/** 第 243 List変数： l_FLG83 */
	public List l_FLG83 = null;

	/** 第 244 List変数： l_FLG84 */
	public List l_FLG84 = null;

	/** 第 245 List変数： l_FLG85 */
	public List l_FLG85 = null;

	/** 第 246 List変数： l_FLG86 */
	public List l_FLG86 = null;

	/** 第 247 List変数： l_FLG87 */
	public List l_FLG87 = null;

	/** 第 248 List変数： l_FLG88 */
	public List l_FLG88 = null;

	/** 第 249 List変数： l_FLG89 */
	public List l_FLG89 = null;

	/** 第 250 List変数： l_FLG90 */
	public List l_FLG90 = null;

	/** 第 251 List変数： l_L_NECK_PROC_NAME */
	public List l_L_NECK_PROC_NAME = null;

	/** 第 252 List変数： l_L_NECK_PROC_CAPA */
	public List l_L_NECK_PROC_CAPA = null;

	/** 第 253 List変数： l_L_NECK_PROC_CAPA_UNIT */
	public List l_L_NECK_PROC_CAPA_UNIT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getShift_Date() { return m_Shift_Date; }
	public String gethidden_High_Color() { return m_hidden_High_Color; }
	public String gethidden_Midd_Color() { return m_hidden_Midd_Color; }
	public String gethidden_Low_Color() { return m_hidden_Low_Color; }
	public String gethidden_DateFrom() { return m_hidden_DateFrom; }
	public String gethidden_DateTo() { return m_hidden_DateTo; }
	public String getS_LOAD_DATE() { return m_S_LOAD_DATE; }
	public String getw_AlInstalledFlg() { return m_w_AlInstalledFlg; }
	public String getNECK_PROC_NAME() { return m_NECK_PROC_NAME; }
	public String getNECK_PROC_CD() { return m_NECK_PROC_CD; }
	public String getLOAD_QTY1() { return m_LOAD_QTY1; }
	public String getLOAD_QTY2() { return m_LOAD_QTY2; }
	public String getLOAD_QTY3() { return m_LOAD_QTY3; }
	public String getLOAD_QTY4() { return m_LOAD_QTY4; }
	public String getLOAD_QTY5() { return m_LOAD_QTY5; }
	public String getLOAD_QTY6() { return m_LOAD_QTY6; }
	public String getLOAD_QTY7() { return m_LOAD_QTY7; }
	public String getLOAD_QTY8() { return m_LOAD_QTY8; }
	public String getLOAD_QTY9() { return m_LOAD_QTY9; }
	public String getLOAD_QTY10() { return m_LOAD_QTY10; }
	public String getLOAD_QTY11() { return m_LOAD_QTY11; }
	public String getLOAD_QTY12() { return m_LOAD_QTY12; }
	public String getLOAD_QTY13() { return m_LOAD_QTY13; }
	public String getLOAD_QTY14() { return m_LOAD_QTY14; }
	public String getLOAD_QTY15() { return m_LOAD_QTY15; }
	public String getLOAD_QTY16() { return m_LOAD_QTY16; }
	public String getLOAD_QTY17() { return m_LOAD_QTY17; }
	public String getLOAD_QTY18() { return m_LOAD_QTY18; }
	public String getLOAD_QTY19() { return m_LOAD_QTY19; }
	public String getLOAD_QTY20() { return m_LOAD_QTY20; }
	public String getLOAD_QTY21() { return m_LOAD_QTY21; }
	public String getLOAD_QTY22() { return m_LOAD_QTY22; }
	public String getLOAD_QTY23() { return m_LOAD_QTY23; }
	public String getLOAD_QTY24() { return m_LOAD_QTY24; }
	public String getLOAD_QTY25() { return m_LOAD_QTY25; }
	public String getLOAD_QTY26() { return m_LOAD_QTY26; }
	public String getLOAD_QTY27() { return m_LOAD_QTY27; }
	public String getLOAD_QTY28() { return m_LOAD_QTY28; }
	public String getLOAD_QTY29() { return m_LOAD_QTY29; }
	public String getLOAD_QTY30() { return m_LOAD_QTY30; }
	public String getLOAD_QTY31() { return m_LOAD_QTY31; }
	public String getLOAD_QTY32() { return m_LOAD_QTY32; }
	public String getLOAD_QTY33() { return m_LOAD_QTY33; }
	public String getLOAD_QTY34() { return m_LOAD_QTY34; }
	public String getLOAD_QTY35() { return m_LOAD_QTY35; }
	public String getLOAD_QTY36() { return m_LOAD_QTY36; }
	public String getLOAD_QTY37() { return m_LOAD_QTY37; }
	public String getLOAD_QTY38() { return m_LOAD_QTY38; }
	public String getLOAD_QTY39() { return m_LOAD_QTY39; }
	public String getLOAD_QTY40() { return m_LOAD_QTY40; }
	public String getLOAD_QTY41() { return m_LOAD_QTY41; }
	public String getLOAD_QTY42() { return m_LOAD_QTY42; }
	public String getLOAD_QTY43() { return m_LOAD_QTY43; }
	public String getLOAD_QTY44() { return m_LOAD_QTY44; }
	public String getLOAD_QTY45() { return m_LOAD_QTY45; }
	public String getLOAD_QTY46() { return m_LOAD_QTY46; }
	public String getLOAD_QTY47() { return m_LOAD_QTY47; }
	public String getLOAD_QTY48() { return m_LOAD_QTY48; }
	public String getLOAD_QTY49() { return m_LOAD_QTY49; }
	public String getLOAD_QTY50() { return m_LOAD_QTY50; }
	public String getLOAD_QTY51() { return m_LOAD_QTY51; }
	public String getLOAD_QTY52() { return m_LOAD_QTY52; }
	public String getLOAD_QTY53() { return m_LOAD_QTY53; }
	public String getLOAD_QTY54() { return m_LOAD_QTY54; }
	public String getLOAD_QTY55() { return m_LOAD_QTY55; }
	public String getLOAD_QTY56() { return m_LOAD_QTY56; }
	public String getLOAD_QTY57() { return m_LOAD_QTY57; }
	public String getLOAD_QTY58() { return m_LOAD_QTY58; }
	public String getLOAD_QTY59() { return m_LOAD_QTY59; }
	public String getLOAD_QTY60() { return m_LOAD_QTY60; }
	public String getLOAD_QTY61() { return m_LOAD_QTY61; }
	public String getLOAD_QTY62() { return m_LOAD_QTY62; }
	public String getLOAD_QTY63() { return m_LOAD_QTY63; }
	public String getLOAD_QTY64() { return m_LOAD_QTY64; }
	public String getLOAD_QTY65() { return m_LOAD_QTY65; }
	public String getLOAD_QTY66() { return m_LOAD_QTY66; }
	public String getLOAD_QTY67() { return m_LOAD_QTY67; }
	public String getLOAD_QTY68() { return m_LOAD_QTY68; }
	public String getLOAD_QTY69() { return m_LOAD_QTY69; }
	public String getLOAD_QTY70() { return m_LOAD_QTY70; }
	public String getLOAD_QTY71() { return m_LOAD_QTY71; }
	public String getLOAD_QTY72() { return m_LOAD_QTY72; }
	public String getLOAD_QTY73() { return m_LOAD_QTY73; }
	public String getLOAD_QTY74() { return m_LOAD_QTY74; }
	public String getLOAD_QTY75() { return m_LOAD_QTY75; }
	public String getLOAD_QTY76() { return m_LOAD_QTY76; }
	public String getLOAD_QTY77() { return m_LOAD_QTY77; }
	public String getLOAD_QTY78() { return m_LOAD_QTY78; }
	public String getLOAD_QTY79() { return m_LOAD_QTY79; }
	public String getLOAD_QTY80() { return m_LOAD_QTY80; }
	public String getLOAD_QTY81() { return m_LOAD_QTY81; }
	public String getLOAD_QTY82() { return m_LOAD_QTY82; }
	public String getLOAD_QTY83() { return m_LOAD_QTY83; }
	public String getLOAD_QTY84() { return m_LOAD_QTY84; }
	public String getLOAD_QTY85() { return m_LOAD_QTY85; }
	public String getLOAD_QTY86() { return m_LOAD_QTY86; }
	public String getLOAD_QTY87() { return m_LOAD_QTY87; }
	public String getLOAD_QTY88() { return m_LOAD_QTY88; }
	public String getLOAD_QTY89() { return m_LOAD_QTY89; }
	public String getLOAD_QTY90() { return m_LOAD_QTY90; }
	public String getDateFrom() { return m_DateFrom; }
	public String getDateTo() { return m_DateTo; }
	public String getK_PLANT_CD() { return m_K_PLANT_CD; }
	public String getCAL_DATE() { return m_CAL_DATE; }
	public String getHoliday_Flg() { return m_Holiday_Flg; }
	public String getL_NECK_PROC_CD() { return m_L_NECK_PROC_CD; }
	public String getL_LOAD_DATE() { return m_L_LOAD_DATE; }
	public String getL_LOAD_QTY() { return m_L_LOAD_QTY; }
	public String getL_ODR_STS_TYP() { return m_L_ODR_STS_TYP; }
	public String getK_NECK_PROC_CD() { return m_K_NECK_PROC_CD; }
	public String getK_LOAD_DATE() { return m_K_LOAD_DATE; }
	public Integer getL_CHT_DIM() { return m_L_CHT_DIM; }
	public Integer getL_CHT_TYPE() { return m_L_CHT_TYPE; }
	public Integer getL_BG_C_R() { return m_L_BG_C_R; }
	public Integer getL_BG_C_G() { return m_L_BG_C_G; }
	public Integer getL_BG_C_B() { return m_L_BG_C_B; }
	public Double getL_MAX_SCALE() { return m_L_MAX_SCALE; }
	public Double getL_SCALE_STEP() { return m_L_SCALE_STEP; }
	public Integer getL_CHT_C0_R() { return m_L_CHT_C0_R; }
	public Integer getL_CHT_C0_G() { return m_L_CHT_C0_G; }
	public Integer getL_CHT_C0_B() { return m_L_CHT_C0_B; }
	public Integer getL_CHT_C1_R() { return m_L_CHT_C1_R; }
	public Integer getL_CHT_C1_G() { return m_L_CHT_C1_G; }
	public Integer getL_CHT_C1_B() { return m_L_CHT_C1_B; }
	public Integer getL_CHT_C2_R() { return m_L_CHT_C2_R; }
	public Integer getL_CHT_C2_G() { return m_L_CHT_C2_G; }
	public Integer getL_CHT_C2_B() { return m_L_CHT_C2_B; }
	public Integer getL_CHT_C9_R() { return m_L_CHT_C9_R; }
	public Integer getL_CHT_C9_G() { return m_L_CHT_C9_G; }
	public Integer getL_CHT_C9_B() { return m_L_CHT_C9_B; }
	public Integer getL_HIGH_LOAD() { return m_L_HIGH_LOAD; }
	public Integer getL_H_LOAD_C_R() { return m_L_H_LOAD_C_R; }
	public Integer getL_H_LOAD_C_G() { return m_L_H_LOAD_C_G; }
	public Integer getL_H_LOAD_C_B() { return m_L_H_LOAD_C_B; }
	public Integer getL_MIDD_LOAD() { return m_L_MIDD_LOAD; }
	public Integer getL_M_LOAD_C_R() { return m_L_M_LOAD_C_R; }
	public Integer getL_M_LOAD_C_G() { return m_L_M_LOAD_C_G; }
	public Integer getL_M_LOAD_C_B() { return m_L_M_LOAD_C_B; }
	public Integer getL_LOW_LOAD() { return m_L_LOW_LOAD; }
	public Integer getL_L_LOAD_C_R() { return m_L_L_LOAD_C_R; }
	public Integer getL_L_LOAD_C_G() { return m_L_L_LOAD_C_G; }
	public Integer getL_L_LOAD_C_B() { return m_L_L_LOAD_C_B; }
	public String getLKM_ITEM_CD() { return m_LKM_ITEM_CD; }
	public String getLKM_ITEM_NAME() { return m_LKM_ITEM_NAME; }
	public String getLKM_JOB_ODR_CD() { return m_LKM_JOB_ODR_CD; }
	public String getLKM_ODR_STS_TYP() { return m_LKM_ODR_STS_TYP; }
	public String getLKM_PRD_START_DATE() { return m_LKM_PRD_START_DATE; }
	public String getLKM_PRD_DUE_DATE() { return m_LKM_PRD_DUE_DATE; }
	public String getLKM_ODR_QTY() { return m_LKM_ODR_QTY; }
	public String getLKM_TOTAL_RCV_QTY() { return m_LKM_TOTAL_RCV_QTY; }
	public String getLKM_UNIT_LOAD() { return m_LKM_UNIT_LOAD; }
	public String getLKM_LOAD_QTY() { return m_LKM_LOAD_QTY; }
	public String getKM_LOAD_DATE() { return m_KM_LOAD_DATE; }
	public String getLKM_SUM_LOAD_QTY() { return m_LKM_SUM_LOAD_QTY; }
	public String getLKM_OVR_LOAD_QTY() { return m_LKM_OVR_LOAD_QTY; }
	public String getLKM_NECK_PROC_CD() { return m_LKM_NECK_PROC_CD; }
	public String getLKM_LOAD_DATE() { return m_LKM_LOAD_DATE; }
	public String getLKM_NECK_PROC_NAME() { return m_LKM_NECK_PROC_NAME; }
	public String getLKM_NECK_PROC_CAPA() { return m_LKM_NECK_PROC_CAPA; }
	public String getLKM_NECK_PROC_CAPA_UNIT() { return m_LKM_NECK_PROC_CAPA_UNIT; }
	public String getFLG1() { return m_FLG1; }
	public String getFLG2() { return m_FLG2; }
	public String getFLG3() { return m_FLG3; }
	public String getFLG4() { return m_FLG4; }
	public String getFLG5() { return m_FLG5; }
	public String getFLG6() { return m_FLG6; }
	public String getFLG7() { return m_FLG7; }
	public String getFLG8() { return m_FLG8; }
	public String getFLG9() { return m_FLG9; }
	public String getFLG10() { return m_FLG10; }
	public String getFLG11() { return m_FLG11; }
	public String getFLG12() { return m_FLG12; }
	public String getFLG13() { return m_FLG13; }
	public String getFLG14() { return m_FLG14; }
	public String getFLG15() { return m_FLG15; }
	public String getFLG16() { return m_FLG16; }
	public String getFLG17() { return m_FLG17; }
	public String getFLG18() { return m_FLG18; }
	public String getFLG19() { return m_FLG19; }
	public String getFLG20() { return m_FLG20; }
	public String getFLG21() { return m_FLG21; }
	public String getFLG22() { return m_FLG22; }
	public String getFLG23() { return m_FLG23; }
	public String getFLG24() { return m_FLG24; }
	public String getFLG25() { return m_FLG25; }
	public String getFLG26() { return m_FLG26; }
	public String getFLG27() { return m_FLG27; }
	public String getFLG28() { return m_FLG28; }
	public String getFLG29() { return m_FLG29; }
	public String getFLG30() { return m_FLG30; }
	public String getFLG31() { return m_FLG31; }
	public String getFLG32() { return m_FLG32; }
	public String getFLG33() { return m_FLG33; }
	public String getFLG34() { return m_FLG34; }
	public String getFLG35() { return m_FLG35; }
	public String getFLG36() { return m_FLG36; }
	public String getFLG37() { return m_FLG37; }
	public String getFLG38() { return m_FLG38; }
	public String getFLG39() { return m_FLG39; }
	public String getFLG40() { return m_FLG40; }
	public String getFLG41() { return m_FLG41; }
	public String getFLG42() { return m_FLG42; }
	public String getFLG43() { return m_FLG43; }
	public String getFLG44() { return m_FLG44; }
	public String getFLG45() { return m_FLG45; }
	public String getFLG46() { return m_FLG46; }
	public String getFLG47() { return m_FLG47; }
	public String getFLG48() { return m_FLG48; }
	public String getFLG49() { return m_FLG49; }
	public String getFLG50() { return m_FLG50; }
	public String getFLG51() { return m_FLG51; }
	public String getFLG52() { return m_FLG52; }
	public String getFLG53() { return m_FLG53; }
	public String getFLG54() { return m_FLG54; }
	public String getFLG55() { return m_FLG55; }
	public String getFLG56() { return m_FLG56; }
	public String getFLG57() { return m_FLG57; }
	public String getFLG58() { return m_FLG58; }
	public String getFLG59() { return m_FLG59; }
	public String getFLG60() { return m_FLG60; }
	public String getFLG61() { return m_FLG61; }
	public String getFLG62() { return m_FLG62; }
	public String getFLG63() { return m_FLG63; }
	public String getFLG64() { return m_FLG64; }
	public String getFLG65() { return m_FLG65; }
	public String getFLG66() { return m_FLG66; }
	public String getFLG67() { return m_FLG67; }
	public String getFLG68() { return m_FLG68; }
	public String getFLG69() { return m_FLG69; }
	public String getFLG70() { return m_FLG70; }
	public String getFLG71() { return m_FLG71; }
	public String getFLG72() { return m_FLG72; }
	public String getFLG73() { return m_FLG73; }
	public String getFLG74() { return m_FLG74; }
	public String getFLG75() { return m_FLG75; }
	public String getFLG76() { return m_FLG76; }
	public String getFLG77() { return m_FLG77; }
	public String getFLG78() { return m_FLG78; }
	public String getFLG79() { return m_FLG79; }
	public String getFLG80() { return m_FLG80; }
	public String getFLG81() { return m_FLG81; }
	public String getFLG82() { return m_FLG82; }
	public String getFLG83() { return m_FLG83; }
	public String getFLG84() { return m_FLG84; }
	public String getFLG85() { return m_FLG85; }
	public String getFLG86() { return m_FLG86; }
	public String getFLG87() { return m_FLG87; }
	public String getFLG88() { return m_FLG88; }
	public String getFLG89() { return m_FLG89; }
	public String getFLG90() { return m_FLG90; }
	public String getL_NECK_PROC_NAME() { return m_L_NECK_PROC_NAME; }
	public String getL_NECK_PROC_CAPA() { return m_L_NECK_PROC_CAPA; }
	public String getL_NECK_PROC_CAPA_UNIT() { return m_L_NECK_PROC_CAPA_UNIT; }

	public List getList_Shift_Date() { return l_Shift_Date; }
	public List getList_hidden_High_Color() { return l_hidden_High_Color; }
	public List getList_hidden_Midd_Color() { return l_hidden_Midd_Color; }
	public List getList_hidden_Low_Color() { return l_hidden_Low_Color; }
	public List getList_hidden_DateFrom() { return l_hidden_DateFrom; }
	public List getList_hidden_DateTo() { return l_hidden_DateTo; }
	public List getList_S_LOAD_DATE() { return l_S_LOAD_DATE; }
	public List getList_w_AlInstalledFlg() { return l_w_AlInstalledFlg; }
	public List getList_NECK_PROC_NAME() { return l_NECK_PROC_NAME; }
	public List getList_NECK_PROC_CD() { return l_NECK_PROC_CD; }
	public List getList_LOAD_QTY1() { return l_LOAD_QTY1; }
	public List getList_LOAD_QTY2() { return l_LOAD_QTY2; }
	public List getList_LOAD_QTY3() { return l_LOAD_QTY3; }
	public List getList_LOAD_QTY4() { return l_LOAD_QTY4; }
	public List getList_LOAD_QTY5() { return l_LOAD_QTY5; }
	public List getList_LOAD_QTY6() { return l_LOAD_QTY6; }
	public List getList_LOAD_QTY7() { return l_LOAD_QTY7; }
	public List getList_LOAD_QTY8() { return l_LOAD_QTY8; }
	public List getList_LOAD_QTY9() { return l_LOAD_QTY9; }
	public List getList_LOAD_QTY10() { return l_LOAD_QTY10; }
	public List getList_LOAD_QTY11() { return l_LOAD_QTY11; }
	public List getList_LOAD_QTY12() { return l_LOAD_QTY12; }
	public List getList_LOAD_QTY13() { return l_LOAD_QTY13; }
	public List getList_LOAD_QTY14() { return l_LOAD_QTY14; }
	public List getList_LOAD_QTY15() { return l_LOAD_QTY15; }
	public List getList_LOAD_QTY16() { return l_LOAD_QTY16; }
	public List getList_LOAD_QTY17() { return l_LOAD_QTY17; }
	public List getList_LOAD_QTY18() { return l_LOAD_QTY18; }
	public List getList_LOAD_QTY19() { return l_LOAD_QTY19; }
	public List getList_LOAD_QTY20() { return l_LOAD_QTY20; }
	public List getList_LOAD_QTY21() { return l_LOAD_QTY21; }
	public List getList_LOAD_QTY22() { return l_LOAD_QTY22; }
	public List getList_LOAD_QTY23() { return l_LOAD_QTY23; }
	public List getList_LOAD_QTY24() { return l_LOAD_QTY24; }
	public List getList_LOAD_QTY25() { return l_LOAD_QTY25; }
	public List getList_LOAD_QTY26() { return l_LOAD_QTY26; }
	public List getList_LOAD_QTY27() { return l_LOAD_QTY27; }
	public List getList_LOAD_QTY28() { return l_LOAD_QTY28; }
	public List getList_LOAD_QTY29() { return l_LOAD_QTY29; }
	public List getList_LOAD_QTY30() { return l_LOAD_QTY30; }
	public List getList_LOAD_QTY31() { return l_LOAD_QTY31; }
	public List getList_LOAD_QTY32() { return l_LOAD_QTY32; }
	public List getList_LOAD_QTY33() { return l_LOAD_QTY33; }
	public List getList_LOAD_QTY34() { return l_LOAD_QTY34; }
	public List getList_LOAD_QTY35() { return l_LOAD_QTY35; }
	public List getList_LOAD_QTY36() { return l_LOAD_QTY36; }
	public List getList_LOAD_QTY37() { return l_LOAD_QTY37; }
	public List getList_LOAD_QTY38() { return l_LOAD_QTY38; }
	public List getList_LOAD_QTY39() { return l_LOAD_QTY39; }
	public List getList_LOAD_QTY40() { return l_LOAD_QTY40; }
	public List getList_LOAD_QTY41() { return l_LOAD_QTY41; }
	public List getList_LOAD_QTY42() { return l_LOAD_QTY42; }
	public List getList_LOAD_QTY43() { return l_LOAD_QTY43; }
	public List getList_LOAD_QTY44() { return l_LOAD_QTY44; }
	public List getList_LOAD_QTY45() { return l_LOAD_QTY45; }
	public List getList_LOAD_QTY46() { return l_LOAD_QTY46; }
	public List getList_LOAD_QTY47() { return l_LOAD_QTY47; }
	public List getList_LOAD_QTY48() { return l_LOAD_QTY48; }
	public List getList_LOAD_QTY49() { return l_LOAD_QTY49; }
	public List getList_LOAD_QTY50() { return l_LOAD_QTY50; }
	public List getList_LOAD_QTY51() { return l_LOAD_QTY51; }
	public List getList_LOAD_QTY52() { return l_LOAD_QTY52; }
	public List getList_LOAD_QTY53() { return l_LOAD_QTY53; }
	public List getList_LOAD_QTY54() { return l_LOAD_QTY54; }
	public List getList_LOAD_QTY55() { return l_LOAD_QTY55; }
	public List getList_LOAD_QTY56() { return l_LOAD_QTY56; }
	public List getList_LOAD_QTY57() { return l_LOAD_QTY57; }
	public List getList_LOAD_QTY58() { return l_LOAD_QTY58; }
	public List getList_LOAD_QTY59() { return l_LOAD_QTY59; }
	public List getList_LOAD_QTY60() { return l_LOAD_QTY60; }
	public List getList_LOAD_QTY61() { return l_LOAD_QTY61; }
	public List getList_LOAD_QTY62() { return l_LOAD_QTY62; }
	public List getList_LOAD_QTY63() { return l_LOAD_QTY63; }
	public List getList_LOAD_QTY64() { return l_LOAD_QTY64; }
	public List getList_LOAD_QTY65() { return l_LOAD_QTY65; }
	public List getList_LOAD_QTY66() { return l_LOAD_QTY66; }
	public List getList_LOAD_QTY67() { return l_LOAD_QTY67; }
	public List getList_LOAD_QTY68() { return l_LOAD_QTY68; }
	public List getList_LOAD_QTY69() { return l_LOAD_QTY69; }
	public List getList_LOAD_QTY70() { return l_LOAD_QTY70; }
	public List getList_LOAD_QTY71() { return l_LOAD_QTY71; }
	public List getList_LOAD_QTY72() { return l_LOAD_QTY72; }
	public List getList_LOAD_QTY73() { return l_LOAD_QTY73; }
	public List getList_LOAD_QTY74() { return l_LOAD_QTY74; }
	public List getList_LOAD_QTY75() { return l_LOAD_QTY75; }
	public List getList_LOAD_QTY76() { return l_LOAD_QTY76; }
	public List getList_LOAD_QTY77() { return l_LOAD_QTY77; }
	public List getList_LOAD_QTY78() { return l_LOAD_QTY78; }
	public List getList_LOAD_QTY79() { return l_LOAD_QTY79; }
	public List getList_LOAD_QTY80() { return l_LOAD_QTY80; }
	public List getList_LOAD_QTY81() { return l_LOAD_QTY81; }
	public List getList_LOAD_QTY82() { return l_LOAD_QTY82; }
	public List getList_LOAD_QTY83() { return l_LOAD_QTY83; }
	public List getList_LOAD_QTY84() { return l_LOAD_QTY84; }
	public List getList_LOAD_QTY85() { return l_LOAD_QTY85; }
	public List getList_LOAD_QTY86() { return l_LOAD_QTY86; }
	public List getList_LOAD_QTY87() { return l_LOAD_QTY87; }
	public List getList_LOAD_QTY88() { return l_LOAD_QTY88; }
	public List getList_LOAD_QTY89() { return l_LOAD_QTY89; }
	public List getList_LOAD_QTY90() { return l_LOAD_QTY90; }
	public List getList_DateFrom() { return l_DateFrom; }
	public List getList_DateTo() { return l_DateTo; }
	public List getList_K_PLANT_CD() { return l_K_PLANT_CD; }
	public List getList_CAL_DATE() { return l_CAL_DATE; }
	public List getList_Holiday_Flg() { return l_Holiday_Flg; }
	public List getList_L_NECK_PROC_CD() { return l_L_NECK_PROC_CD; }
	public List getList_L_LOAD_DATE() { return l_L_LOAD_DATE; }
	public List getList_L_LOAD_QTY() { return l_L_LOAD_QTY; }
	public List getList_L_ODR_STS_TYP() { return l_L_ODR_STS_TYP; }
	public List getList_K_NECK_PROC_CD() { return l_K_NECK_PROC_CD; }
	public List getList_K_LOAD_DATE() { return l_K_LOAD_DATE; }
	public List getList_L_CHT_DIM() { return l_L_CHT_DIM; }
	public List getList_L_CHT_TYPE() { return l_L_CHT_TYPE; }
	public List getList_L_BG_C_R() { return l_L_BG_C_R; }
	public List getList_L_BG_C_G() { return l_L_BG_C_G; }
	public List getList_L_BG_C_B() { return l_L_BG_C_B; }
	public List getList_L_MAX_SCALE() { return l_L_MAX_SCALE; }
	public List getList_L_SCALE_STEP() { return l_L_SCALE_STEP; }
	public List getList_L_CHT_C0_R() { return l_L_CHT_C0_R; }
	public List getList_L_CHT_C0_G() { return l_L_CHT_C0_G; }
	public List getList_L_CHT_C0_B() { return l_L_CHT_C0_B; }
	public List getList_L_CHT_C1_R() { return l_L_CHT_C1_R; }
	public List getList_L_CHT_C1_G() { return l_L_CHT_C1_G; }
	public List getList_L_CHT_C1_B() { return l_L_CHT_C1_B; }
	public List getList_L_CHT_C2_R() { return l_L_CHT_C2_R; }
	public List getList_L_CHT_C2_G() { return l_L_CHT_C2_G; }
	public List getList_L_CHT_C2_B() { return l_L_CHT_C2_B; }
	public List getList_L_CHT_C9_R() { return l_L_CHT_C9_R; }
	public List getList_L_CHT_C9_G() { return l_L_CHT_C9_G; }
	public List getList_L_CHT_C9_B() { return l_L_CHT_C9_B; }
	public List getList_L_HIGH_LOAD() { return l_L_HIGH_LOAD; }
	public List getList_L_H_LOAD_C_R() { return l_L_H_LOAD_C_R; }
	public List getList_L_H_LOAD_C_G() { return l_L_H_LOAD_C_G; }
	public List getList_L_H_LOAD_C_B() { return l_L_H_LOAD_C_B; }
	public List getList_L_MIDD_LOAD() { return l_L_MIDD_LOAD; }
	public List getList_L_M_LOAD_C_R() { return l_L_M_LOAD_C_R; }
	public List getList_L_M_LOAD_C_G() { return l_L_M_LOAD_C_G; }
	public List getList_L_M_LOAD_C_B() { return l_L_M_LOAD_C_B; }
	public List getList_L_LOW_LOAD() { return l_L_LOW_LOAD; }
	public List getList_L_L_LOAD_C_R() { return l_L_L_LOAD_C_R; }
	public List getList_L_L_LOAD_C_G() { return l_L_L_LOAD_C_G; }
	public List getList_L_L_LOAD_C_B() { return l_L_L_LOAD_C_B; }
	public List getList_LKM_ITEM_CD() { return l_LKM_ITEM_CD; }
	public List getList_LKM_ITEM_NAME() { return l_LKM_ITEM_NAME; }
	public List getList_LKM_JOB_ODR_CD() { return l_LKM_JOB_ODR_CD; }
	public List getList_LKM_ODR_STS_TYP() { return l_LKM_ODR_STS_TYP; }
	public List getList_LKM_PRD_START_DATE() { return l_LKM_PRD_START_DATE; }
	public List getList_LKM_PRD_DUE_DATE() { return l_LKM_PRD_DUE_DATE; }
	public List getList_LKM_ODR_QTY() { return l_LKM_ODR_QTY; }
	public List getList_LKM_TOTAL_RCV_QTY() { return l_LKM_TOTAL_RCV_QTY; }
	public List getList_LKM_UNIT_LOAD() { return l_LKM_UNIT_LOAD; }
	public List getList_LKM_LOAD_QTY() { return l_LKM_LOAD_QTY; }
	public List getList_KM_LOAD_DATE() { return l_KM_LOAD_DATE; }
	public List getList_LKM_SUM_LOAD_QTY() { return l_LKM_SUM_LOAD_QTY; }
	public List getList_LKM_OVR_LOAD_QTY() { return l_LKM_OVR_LOAD_QTY; }
	public List getList_LKM_NECK_PROC_CD() { return l_LKM_NECK_PROC_CD; }
	public List getList_LKM_LOAD_DATE() { return l_LKM_LOAD_DATE; }
	public List getList_LKM_NECK_PROC_NAME() { return l_LKM_NECK_PROC_NAME; }
	public List getList_LKM_NECK_PROC_CAPA() { return l_LKM_NECK_PROC_CAPA; }
	public List getList_LKM_NECK_PROC_CAPA_UNIT() { return l_LKM_NECK_PROC_CAPA_UNIT; }
	public List getList_FLG1() { return l_FLG1; }
	public List getList_FLG2() { return l_FLG2; }
	public List getList_FLG3() { return l_FLG3; }
	public List getList_FLG4() { return l_FLG4; }
	public List getList_FLG5() { return l_FLG5; }
	public List getList_FLG6() { return l_FLG6; }
	public List getList_FLG7() { return l_FLG7; }
	public List getList_FLG8() { return l_FLG8; }
	public List getList_FLG9() { return l_FLG9; }
	public List getList_FLG10() { return l_FLG10; }
	public List getList_FLG11() { return l_FLG11; }
	public List getList_FLG12() { return l_FLG12; }
	public List getList_FLG13() { return l_FLG13; }
	public List getList_FLG14() { return l_FLG14; }
	public List getList_FLG15() { return l_FLG15; }
	public List getList_FLG16() { return l_FLG16; }
	public List getList_FLG17() { return l_FLG17; }
	public List getList_FLG18() { return l_FLG18; }
	public List getList_FLG19() { return l_FLG19; }
	public List getList_FLG20() { return l_FLG20; }
	public List getList_FLG21() { return l_FLG21; }
	public List getList_FLG22() { return l_FLG22; }
	public List getList_FLG23() { return l_FLG23; }
	public List getList_FLG24() { return l_FLG24; }
	public List getList_FLG25() { return l_FLG25; }
	public List getList_FLG26() { return l_FLG26; }
	public List getList_FLG27() { return l_FLG27; }
	public List getList_FLG28() { return l_FLG28; }
	public List getList_FLG29() { return l_FLG29; }
	public List getList_FLG30() { return l_FLG30; }
	public List getList_FLG31() { return l_FLG31; }
	public List getList_FLG32() { return l_FLG32; }
	public List getList_FLG33() { return l_FLG33; }
	public List getList_FLG34() { return l_FLG34; }
	public List getList_FLG35() { return l_FLG35; }
	public List getList_FLG36() { return l_FLG36; }
	public List getList_FLG37() { return l_FLG37; }
	public List getList_FLG38() { return l_FLG38; }
	public List getList_FLG39() { return l_FLG39; }
	public List getList_FLG40() { return l_FLG40; }
	public List getList_FLG41() { return l_FLG41; }
	public List getList_FLG42() { return l_FLG42; }
	public List getList_FLG43() { return l_FLG43; }
	public List getList_FLG44() { return l_FLG44; }
	public List getList_FLG45() { return l_FLG45; }
	public List getList_FLG46() { return l_FLG46; }
	public List getList_FLG47() { return l_FLG47; }
	public List getList_FLG48() { return l_FLG48; }
	public List getList_FLG49() { return l_FLG49; }
	public List getList_FLG50() { return l_FLG50; }
	public List getList_FLG51() { return l_FLG51; }
	public List getList_FLG52() { return l_FLG52; }
	public List getList_FLG53() { return l_FLG53; }
	public List getList_FLG54() { return l_FLG54; }
	public List getList_FLG55() { return l_FLG55; }
	public List getList_FLG56() { return l_FLG56; }
	public List getList_FLG57() { return l_FLG57; }
	public List getList_FLG58() { return l_FLG58; }
	public List getList_FLG59() { return l_FLG59; }
	public List getList_FLG60() { return l_FLG60; }
	public List getList_FLG61() { return l_FLG61; }
	public List getList_FLG62() { return l_FLG62; }
	public List getList_FLG63() { return l_FLG63; }
	public List getList_FLG64() { return l_FLG64; }
	public List getList_FLG65() { return l_FLG65; }
	public List getList_FLG66() { return l_FLG66; }
	public List getList_FLG67() { return l_FLG67; }
	public List getList_FLG68() { return l_FLG68; }
	public List getList_FLG69() { return l_FLG69; }
	public List getList_FLG70() { return l_FLG70; }
	public List getList_FLG71() { return l_FLG71; }
	public List getList_FLG72() { return l_FLG72; }
	public List getList_FLG73() { return l_FLG73; }
	public List getList_FLG74() { return l_FLG74; }
	public List getList_FLG75() { return l_FLG75; }
	public List getList_FLG76() { return l_FLG76; }
	public List getList_FLG77() { return l_FLG77; }
	public List getList_FLG78() { return l_FLG78; }
	public List getList_FLG79() { return l_FLG79; }
	public List getList_FLG80() { return l_FLG80; }
	public List getList_FLG81() { return l_FLG81; }
	public List getList_FLG82() { return l_FLG82; }
	public List getList_FLG83() { return l_FLG83; }
	public List getList_FLG84() { return l_FLG84; }
	public List getList_FLG85() { return l_FLG85; }
	public List getList_FLG86() { return l_FLG86; }
	public List getList_FLG87() { return l_FLG87; }
	public List getList_FLG88() { return l_FLG88; }
	public List getList_FLG89() { return l_FLG89; }
	public List getList_FLG90() { return l_FLG90; }
	public List getList_L_NECK_PROC_NAME() { return l_L_NECK_PROC_NAME; }
	public List getList_L_NECK_PROC_CAPA() { return l_L_NECK_PROC_CAPA; }
	public List getList_L_NECK_PROC_CAPA_UNIT() { return l_L_NECK_PROC_CAPA_UNIT; }

	public void setShift_Date(String val) { m_Shift_Date = val; }
	public void sethidden_High_Color(String val) { m_hidden_High_Color = val; }
	public void sethidden_Midd_Color(String val) { m_hidden_Midd_Color = val; }
	public void sethidden_Low_Color(String val) { m_hidden_Low_Color = val; }
	public void sethidden_DateFrom(String val) { m_hidden_DateFrom = val; }
	public void sethidden_DateTo(String val) { m_hidden_DateTo = val; }
	public void setS_LOAD_DATE(String val) { m_S_LOAD_DATE = val; }
	public void setw_AlInstalledFlg(String val) { m_w_AlInstalledFlg = val; }
	public void setNECK_PROC_NAME(String val) { m_NECK_PROC_NAME = val; }
	public void setNECK_PROC_CD(String val) { m_NECK_PROC_CD = val; }
	public void setLOAD_QTY1(String val) { m_LOAD_QTY1 = val; }
	public void setLOAD_QTY2(String val) { m_LOAD_QTY2 = val; }
	public void setLOAD_QTY3(String val) { m_LOAD_QTY3 = val; }
	public void setLOAD_QTY4(String val) { m_LOAD_QTY4 = val; }
	public void setLOAD_QTY5(String val) { m_LOAD_QTY5 = val; }
	public void setLOAD_QTY6(String val) { m_LOAD_QTY6 = val; }
	public void setLOAD_QTY7(String val) { m_LOAD_QTY7 = val; }
	public void setLOAD_QTY8(String val) { m_LOAD_QTY8 = val; }
	public void setLOAD_QTY9(String val) { m_LOAD_QTY9 = val; }
	public void setLOAD_QTY10(String val) { m_LOAD_QTY10 = val; }
	public void setLOAD_QTY11(String val) { m_LOAD_QTY11 = val; }
	public void setLOAD_QTY12(String val) { m_LOAD_QTY12 = val; }
	public void setLOAD_QTY13(String val) { m_LOAD_QTY13 = val; }
	public void setLOAD_QTY14(String val) { m_LOAD_QTY14 = val; }
	public void setLOAD_QTY15(String val) { m_LOAD_QTY15 = val; }
	public void setLOAD_QTY16(String val) { m_LOAD_QTY16 = val; }
	public void setLOAD_QTY17(String val) { m_LOAD_QTY17 = val; }
	public void setLOAD_QTY18(String val) { m_LOAD_QTY18 = val; }
	public void setLOAD_QTY19(String val) { m_LOAD_QTY19 = val; }
	public void setLOAD_QTY20(String val) { m_LOAD_QTY20 = val; }
	public void setLOAD_QTY21(String val) { m_LOAD_QTY21 = val; }
	public void setLOAD_QTY22(String val) { m_LOAD_QTY22 = val; }
	public void setLOAD_QTY23(String val) { m_LOAD_QTY23 = val; }
	public void setLOAD_QTY24(String val) { m_LOAD_QTY24 = val; }
	public void setLOAD_QTY25(String val) { m_LOAD_QTY25 = val; }
	public void setLOAD_QTY26(String val) { m_LOAD_QTY26 = val; }
	public void setLOAD_QTY27(String val) { m_LOAD_QTY27 = val; }
	public void setLOAD_QTY28(String val) { m_LOAD_QTY28 = val; }
	public void setLOAD_QTY29(String val) { m_LOAD_QTY29 = val; }
	public void setLOAD_QTY30(String val) { m_LOAD_QTY30 = val; }
	public void setLOAD_QTY31(String val) { m_LOAD_QTY31 = val; }
	public void setLOAD_QTY32(String val) { m_LOAD_QTY32 = val; }
	public void setLOAD_QTY33(String val) { m_LOAD_QTY33 = val; }
	public void setLOAD_QTY34(String val) { m_LOAD_QTY34 = val; }
	public void setLOAD_QTY35(String val) { m_LOAD_QTY35 = val; }
	public void setLOAD_QTY36(String val) { m_LOAD_QTY36 = val; }
	public void setLOAD_QTY37(String val) { m_LOAD_QTY37 = val; }
	public void setLOAD_QTY38(String val) { m_LOAD_QTY38 = val; }
	public void setLOAD_QTY39(String val) { m_LOAD_QTY39 = val; }
	public void setLOAD_QTY40(String val) { m_LOAD_QTY40 = val; }
	public void setLOAD_QTY41(String val) { m_LOAD_QTY41 = val; }
	public void setLOAD_QTY42(String val) { m_LOAD_QTY42 = val; }
	public void setLOAD_QTY43(String val) { m_LOAD_QTY43 = val; }
	public void setLOAD_QTY44(String val) { m_LOAD_QTY44 = val; }
	public void setLOAD_QTY45(String val) { m_LOAD_QTY45 = val; }
	public void setLOAD_QTY46(String val) { m_LOAD_QTY46 = val; }
	public void setLOAD_QTY47(String val) { m_LOAD_QTY47 = val; }
	public void setLOAD_QTY48(String val) { m_LOAD_QTY48 = val; }
	public void setLOAD_QTY49(String val) { m_LOAD_QTY49 = val; }
	public void setLOAD_QTY50(String val) { m_LOAD_QTY50 = val; }
	public void setLOAD_QTY51(String val) { m_LOAD_QTY51 = val; }
	public void setLOAD_QTY52(String val) { m_LOAD_QTY52 = val; }
	public void setLOAD_QTY53(String val) { m_LOAD_QTY53 = val; }
	public void setLOAD_QTY54(String val) { m_LOAD_QTY54 = val; }
	public void setLOAD_QTY55(String val) { m_LOAD_QTY55 = val; }
	public void setLOAD_QTY56(String val) { m_LOAD_QTY56 = val; }
	public void setLOAD_QTY57(String val) { m_LOAD_QTY57 = val; }
	public void setLOAD_QTY58(String val) { m_LOAD_QTY58 = val; }
	public void setLOAD_QTY59(String val) { m_LOAD_QTY59 = val; }
	public void setLOAD_QTY60(String val) { m_LOAD_QTY60 = val; }
	public void setLOAD_QTY61(String val) { m_LOAD_QTY61 = val; }
	public void setLOAD_QTY62(String val) { m_LOAD_QTY62 = val; }
	public void setLOAD_QTY63(String val) { m_LOAD_QTY63 = val; }
	public void setLOAD_QTY64(String val) { m_LOAD_QTY64 = val; }
	public void setLOAD_QTY65(String val) { m_LOAD_QTY65 = val; }
	public void setLOAD_QTY66(String val) { m_LOAD_QTY66 = val; }
	public void setLOAD_QTY67(String val) { m_LOAD_QTY67 = val; }
	public void setLOAD_QTY68(String val) { m_LOAD_QTY68 = val; }
	public void setLOAD_QTY69(String val) { m_LOAD_QTY69 = val; }
	public void setLOAD_QTY70(String val) { m_LOAD_QTY70 = val; }
	public void setLOAD_QTY71(String val) { m_LOAD_QTY71 = val; }
	public void setLOAD_QTY72(String val) { m_LOAD_QTY72 = val; }
	public void setLOAD_QTY73(String val) { m_LOAD_QTY73 = val; }
	public void setLOAD_QTY74(String val) { m_LOAD_QTY74 = val; }
	public void setLOAD_QTY75(String val) { m_LOAD_QTY75 = val; }
	public void setLOAD_QTY76(String val) { m_LOAD_QTY76 = val; }
	public void setLOAD_QTY77(String val) { m_LOAD_QTY77 = val; }
	public void setLOAD_QTY78(String val) { m_LOAD_QTY78 = val; }
	public void setLOAD_QTY79(String val) { m_LOAD_QTY79 = val; }
	public void setLOAD_QTY80(String val) { m_LOAD_QTY80 = val; }
	public void setLOAD_QTY81(String val) { m_LOAD_QTY81 = val; }
	public void setLOAD_QTY82(String val) { m_LOAD_QTY82 = val; }
	public void setLOAD_QTY83(String val) { m_LOAD_QTY83 = val; }
	public void setLOAD_QTY84(String val) { m_LOAD_QTY84 = val; }
	public void setLOAD_QTY85(String val) { m_LOAD_QTY85 = val; }
	public void setLOAD_QTY86(String val) { m_LOAD_QTY86 = val; }
	public void setLOAD_QTY87(String val) { m_LOAD_QTY87 = val; }
	public void setLOAD_QTY88(String val) { m_LOAD_QTY88 = val; }
	public void setLOAD_QTY89(String val) { m_LOAD_QTY89 = val; }
	public void setLOAD_QTY90(String val) { m_LOAD_QTY90 = val; }
	public void setDateFrom(String val) { m_DateFrom = val; }
	public void setDateTo(String val) { m_DateTo = val; }
	public void setK_PLANT_CD(String val) { m_K_PLANT_CD = val; }
	public void setCAL_DATE(String val) { m_CAL_DATE = val; }
	public void setHoliday_Flg(String val) { m_Holiday_Flg = val; }
	public void setL_NECK_PROC_CD(String val) { m_L_NECK_PROC_CD = val; }
	public void setL_LOAD_DATE(String val) { m_L_LOAD_DATE = val; }
	public void setL_LOAD_QTY(String val) { m_L_LOAD_QTY = val; }
	public void setL_ODR_STS_TYP(String val) { m_L_ODR_STS_TYP = val; }
	public void setK_NECK_PROC_CD(String val) { m_K_NECK_PROC_CD = val; }
	public void setK_LOAD_DATE(String val) { m_K_LOAD_DATE = val; }
	public void setL_CHT_DIM(Integer val) { m_L_CHT_DIM = val; }
	public void setL_CHT_TYPE(Integer val) { m_L_CHT_TYPE = val; }
	public void setL_BG_C_R(Integer val) { m_L_BG_C_R = val; }
	public void setL_BG_C_G(Integer val) { m_L_BG_C_G = val; }
	public void setL_BG_C_B(Integer val) { m_L_BG_C_B = val; }
	public void setL_MAX_SCALE(Double val) { m_L_MAX_SCALE = val; }
	public void setL_SCALE_STEP(Double val) { m_L_SCALE_STEP = val; }
	public void setL_CHT_C0_R(Integer val) { m_L_CHT_C0_R = val; }
	public void setL_CHT_C0_G(Integer val) { m_L_CHT_C0_G = val; }
	public void setL_CHT_C0_B(Integer val) { m_L_CHT_C0_B = val; }
	public void setL_CHT_C1_R(Integer val) { m_L_CHT_C1_R = val; }
	public void setL_CHT_C1_G(Integer val) { m_L_CHT_C1_G = val; }
	public void setL_CHT_C1_B(Integer val) { m_L_CHT_C1_B = val; }
	public void setL_CHT_C2_R(Integer val) { m_L_CHT_C2_R = val; }
	public void setL_CHT_C2_G(Integer val) { m_L_CHT_C2_G = val; }
	public void setL_CHT_C2_B(Integer val) { m_L_CHT_C2_B = val; }
	public void setL_CHT_C9_R(Integer val) { m_L_CHT_C9_R = val; }
	public void setL_CHT_C9_G(Integer val) { m_L_CHT_C9_G = val; }
	public void setL_CHT_C9_B(Integer val) { m_L_CHT_C9_B = val; }
	public void setL_HIGH_LOAD(Integer val) { m_L_HIGH_LOAD = val; }
	public void setL_H_LOAD_C_R(Integer val) { m_L_H_LOAD_C_R = val; }
	public void setL_H_LOAD_C_G(Integer val) { m_L_H_LOAD_C_G = val; }
	public void setL_H_LOAD_C_B(Integer val) { m_L_H_LOAD_C_B = val; }
	public void setL_MIDD_LOAD(Integer val) { m_L_MIDD_LOAD = val; }
	public void setL_M_LOAD_C_R(Integer val) { m_L_M_LOAD_C_R = val; }
	public void setL_M_LOAD_C_G(Integer val) { m_L_M_LOAD_C_G = val; }
	public void setL_M_LOAD_C_B(Integer val) { m_L_M_LOAD_C_B = val; }
	public void setL_LOW_LOAD(Integer val) { m_L_LOW_LOAD = val; }
	public void setL_L_LOAD_C_R(Integer val) { m_L_L_LOAD_C_R = val; }
	public void setL_L_LOAD_C_G(Integer val) { m_L_L_LOAD_C_G = val; }
	public void setL_L_LOAD_C_B(Integer val) { m_L_L_LOAD_C_B = val; }
	public void setLKM_ITEM_CD(String val) { m_LKM_ITEM_CD = val; }
	public void setLKM_ITEM_NAME(String val) { m_LKM_ITEM_NAME = val; }
	public void setLKM_JOB_ODR_CD(String val) { m_LKM_JOB_ODR_CD = val; }
	public void setLKM_ODR_STS_TYP(String val) { m_LKM_ODR_STS_TYP = val; }
	public void setLKM_PRD_START_DATE(String val) { m_LKM_PRD_START_DATE = val; }
	public void setLKM_PRD_DUE_DATE(String val) { m_LKM_PRD_DUE_DATE = val; }
	public void setLKM_ODR_QTY(String val) { m_LKM_ODR_QTY = val; }
	public void setLKM_TOTAL_RCV_QTY(String val) { m_LKM_TOTAL_RCV_QTY = val; }
	public void setLKM_UNIT_LOAD(String val) { m_LKM_UNIT_LOAD = val; }
	public void setLKM_LOAD_QTY(String val) { m_LKM_LOAD_QTY = val; }
	public void setKM_LOAD_DATE(String val) { m_KM_LOAD_DATE = val; }
	public void setLKM_SUM_LOAD_QTY(String val) { m_LKM_SUM_LOAD_QTY = val; }
	public void setLKM_OVR_LOAD_QTY(String val) { m_LKM_OVR_LOAD_QTY = val; }
	public void setLKM_NECK_PROC_CD(String val) { m_LKM_NECK_PROC_CD = val; }
	public void setLKM_LOAD_DATE(String val) { m_LKM_LOAD_DATE = val; }
	public void setLKM_NECK_PROC_NAME(String val) { m_LKM_NECK_PROC_NAME = val; }
	public void setLKM_NECK_PROC_CAPA(String val) { m_LKM_NECK_PROC_CAPA = val; }
	public void setLKM_NECK_PROC_CAPA_UNIT(String val) { m_LKM_NECK_PROC_CAPA_UNIT = val; }
	public void setFLG1(String val) { m_FLG1 = val; }
	public void setFLG2(String val) { m_FLG2 = val; }
	public void setFLG3(String val) { m_FLG3 = val; }
	public void setFLG4(String val) { m_FLG4 = val; }
	public void setFLG5(String val) { m_FLG5 = val; }
	public void setFLG6(String val) { m_FLG6 = val; }
	public void setFLG7(String val) { m_FLG7 = val; }
	public void setFLG8(String val) { m_FLG8 = val; }
	public void setFLG9(String val) { m_FLG9 = val; }
	public void setFLG10(String val) { m_FLG10 = val; }
	public void setFLG11(String val) { m_FLG11 = val; }
	public void setFLG12(String val) { m_FLG12 = val; }
	public void setFLG13(String val) { m_FLG13 = val; }
	public void setFLG14(String val) { m_FLG14 = val; }
	public void setFLG15(String val) { m_FLG15 = val; }
	public void setFLG16(String val) { m_FLG16 = val; }
	public void setFLG17(String val) { m_FLG17 = val; }
	public void setFLG18(String val) { m_FLG18 = val; }
	public void setFLG19(String val) { m_FLG19 = val; }
	public void setFLG20(String val) { m_FLG20 = val; }
	public void setFLG21(String val) { m_FLG21 = val; }
	public void setFLG22(String val) { m_FLG22 = val; }
	public void setFLG23(String val) { m_FLG23 = val; }
	public void setFLG24(String val) { m_FLG24 = val; }
	public void setFLG25(String val) { m_FLG25 = val; }
	public void setFLG26(String val) { m_FLG26 = val; }
	public void setFLG27(String val) { m_FLG27 = val; }
	public void setFLG28(String val) { m_FLG28 = val; }
	public void setFLG29(String val) { m_FLG29 = val; }
	public void setFLG30(String val) { m_FLG30 = val; }
	public void setFLG31(String val) { m_FLG31 = val; }
	public void setFLG32(String val) { m_FLG32 = val; }
	public void setFLG33(String val) { m_FLG33 = val; }
	public void setFLG34(String val) { m_FLG34 = val; }
	public void setFLG35(String val) { m_FLG35 = val; }
	public void setFLG36(String val) { m_FLG36 = val; }
	public void setFLG37(String val) { m_FLG37 = val; }
	public void setFLG38(String val) { m_FLG38 = val; }
	public void setFLG39(String val) { m_FLG39 = val; }
	public void setFLG40(String val) { m_FLG40 = val; }
	public void setFLG41(String val) { m_FLG41 = val; }
	public void setFLG42(String val) { m_FLG42 = val; }
	public void setFLG43(String val) { m_FLG43 = val; }
	public void setFLG44(String val) { m_FLG44 = val; }
	public void setFLG45(String val) { m_FLG45 = val; }
	public void setFLG46(String val) { m_FLG46 = val; }
	public void setFLG47(String val) { m_FLG47 = val; }
	public void setFLG48(String val) { m_FLG48 = val; }
	public void setFLG49(String val) { m_FLG49 = val; }
	public void setFLG50(String val) { m_FLG50 = val; }
	public void setFLG51(String val) { m_FLG51 = val; }
	public void setFLG52(String val) { m_FLG52 = val; }
	public void setFLG53(String val) { m_FLG53 = val; }
	public void setFLG54(String val) { m_FLG54 = val; }
	public void setFLG55(String val) { m_FLG55 = val; }
	public void setFLG56(String val) { m_FLG56 = val; }
	public void setFLG57(String val) { m_FLG57 = val; }
	public void setFLG58(String val) { m_FLG58 = val; }
	public void setFLG59(String val) { m_FLG59 = val; }
	public void setFLG60(String val) { m_FLG60 = val; }
	public void setFLG61(String val) { m_FLG61 = val; }
	public void setFLG62(String val) { m_FLG62 = val; }
	public void setFLG63(String val) { m_FLG63 = val; }
	public void setFLG64(String val) { m_FLG64 = val; }
	public void setFLG65(String val) { m_FLG65 = val; }
	public void setFLG66(String val) { m_FLG66 = val; }
	public void setFLG67(String val) { m_FLG67 = val; }
	public void setFLG68(String val) { m_FLG68 = val; }
	public void setFLG69(String val) { m_FLG69 = val; }
	public void setFLG70(String val) { m_FLG70 = val; }
	public void setFLG71(String val) { m_FLG71 = val; }
	public void setFLG72(String val) { m_FLG72 = val; }
	public void setFLG73(String val) { m_FLG73 = val; }
	public void setFLG74(String val) { m_FLG74 = val; }
	public void setFLG75(String val) { m_FLG75 = val; }
	public void setFLG76(String val) { m_FLG76 = val; }
	public void setFLG77(String val) { m_FLG77 = val; }
	public void setFLG78(String val) { m_FLG78 = val; }
	public void setFLG79(String val) { m_FLG79 = val; }
	public void setFLG80(String val) { m_FLG80 = val; }
	public void setFLG81(String val) { m_FLG81 = val; }
	public void setFLG82(String val) { m_FLG82 = val; }
	public void setFLG83(String val) { m_FLG83 = val; }
	public void setFLG84(String val) { m_FLG84 = val; }
	public void setFLG85(String val) { m_FLG85 = val; }
	public void setFLG86(String val) { m_FLG86 = val; }
	public void setFLG87(String val) { m_FLG87 = val; }
	public void setFLG88(String val) { m_FLG88 = val; }
	public void setFLG89(String val) { m_FLG89 = val; }
	public void setFLG90(String val) { m_FLG90 = val; }
	public void setL_NECK_PROC_NAME(String val) { m_L_NECK_PROC_NAME = val; }
	public void setL_NECK_PROC_CAPA(String val) { m_L_NECK_PROC_CAPA = val; }
	public void setL_NECK_PROC_CAPA_UNIT(String val) { m_L_NECK_PROC_CAPA_UNIT = val; }

	public void setL_CHT_DIM(String val) { m_L_CHT_DIM = getInteger(val); }
	public void setL_CHT_TYPE(String val) { m_L_CHT_TYPE = getInteger(val); }
	public void setL_BG_C_R(String val) { m_L_BG_C_R = getInteger(val); }
	public void setL_BG_C_G(String val) { m_L_BG_C_G = getInteger(val); }
	public void setL_BG_C_B(String val) { m_L_BG_C_B = getInteger(val); }
	public void setL_CHT_C0_R(String val) { m_L_CHT_C0_R = getInteger(val); }
	public void setL_CHT_C0_G(String val) { m_L_CHT_C0_G = getInteger(val); }
	public void setL_CHT_C0_B(String val) { m_L_CHT_C0_B = getInteger(val); }
	public void setL_CHT_C1_R(String val) { m_L_CHT_C1_R = getInteger(val); }
	public void setL_CHT_C1_G(String val) { m_L_CHT_C1_G = getInteger(val); }
	public void setL_CHT_C1_B(String val) { m_L_CHT_C1_B = getInteger(val); }
	public void setL_CHT_C2_R(String val) { m_L_CHT_C2_R = getInteger(val); }
	public void setL_CHT_C2_G(String val) { m_L_CHT_C2_G = getInteger(val); }
	public void setL_CHT_C2_B(String val) { m_L_CHT_C2_B = getInteger(val); }
	public void setL_CHT_C9_R(String val) { m_L_CHT_C9_R = getInteger(val); }
	public void setL_CHT_C9_G(String val) { m_L_CHT_C9_G = getInteger(val); }
	public void setL_CHT_C9_B(String val) { m_L_CHT_C9_B = getInteger(val); }
	public void setL_HIGH_LOAD(String val) { m_L_HIGH_LOAD = getInteger(val); }
	public void setL_H_LOAD_C_R(String val) { m_L_H_LOAD_C_R = getInteger(val); }
	public void setL_H_LOAD_C_G(String val) { m_L_H_LOAD_C_G = getInteger(val); }
	public void setL_H_LOAD_C_B(String val) { m_L_H_LOAD_C_B = getInteger(val); }
	public void setL_MIDD_LOAD(String val) { m_L_MIDD_LOAD = getInteger(val); }
	public void setL_M_LOAD_C_R(String val) { m_L_M_LOAD_C_R = getInteger(val); }
	public void setL_M_LOAD_C_G(String val) { m_L_M_LOAD_C_G = getInteger(val); }
	public void setL_M_LOAD_C_B(String val) { m_L_M_LOAD_C_B = getInteger(val); }
	public void setL_LOW_LOAD(String val) { m_L_LOW_LOAD = getInteger(val); }
	public void setL_L_LOAD_C_R(String val) { m_L_L_LOAD_C_R = getInteger(val); }
	public void setL_L_LOAD_C_G(String val) { m_L_L_LOAD_C_G = getInteger(val); }
	public void setL_L_LOAD_C_B(String val) { m_L_L_LOAD_C_B = getInteger(val); }

	public void setList_Shift_Date(List list) { l_Shift_Date = list; }
	public void setList_hidden_High_Color(List list) { l_hidden_High_Color = list; }
	public void setList_hidden_Midd_Color(List list) { l_hidden_Midd_Color = list; }
	public void setList_hidden_Low_Color(List list) { l_hidden_Low_Color = list; }
	public void setList_hidden_DateFrom(List list) { l_hidden_DateFrom = list; }
	public void setList_hidden_DateTo(List list) { l_hidden_DateTo = list; }
	public void setList_S_LOAD_DATE(List list) { l_S_LOAD_DATE = list; }
	public void setList_w_AlInstalledFlg(List list) { l_w_AlInstalledFlg = list; }
	public void setList_NECK_PROC_NAME(List list) { l_NECK_PROC_NAME = list; }
	public void setList_NECK_PROC_CD(List list) { l_NECK_PROC_CD = list; }
	public void setList_LOAD_QTY1(List list) { l_LOAD_QTY1 = list; }
	public void setList_LOAD_QTY2(List list) { l_LOAD_QTY2 = list; }
	public void setList_LOAD_QTY3(List list) { l_LOAD_QTY3 = list; }
	public void setList_LOAD_QTY4(List list) { l_LOAD_QTY4 = list; }
	public void setList_LOAD_QTY5(List list) { l_LOAD_QTY5 = list; }
	public void setList_LOAD_QTY6(List list) { l_LOAD_QTY6 = list; }
	public void setList_LOAD_QTY7(List list) { l_LOAD_QTY7 = list; }
	public void setList_LOAD_QTY8(List list) { l_LOAD_QTY8 = list; }
	public void setList_LOAD_QTY9(List list) { l_LOAD_QTY9 = list; }
	public void setList_LOAD_QTY10(List list) { l_LOAD_QTY10 = list; }
	public void setList_LOAD_QTY11(List list) { l_LOAD_QTY11 = list; }
	public void setList_LOAD_QTY12(List list) { l_LOAD_QTY12 = list; }
	public void setList_LOAD_QTY13(List list) { l_LOAD_QTY13 = list; }
	public void setList_LOAD_QTY14(List list) { l_LOAD_QTY14 = list; }
	public void setList_LOAD_QTY15(List list) { l_LOAD_QTY15 = list; }
	public void setList_LOAD_QTY16(List list) { l_LOAD_QTY16 = list; }
	public void setList_LOAD_QTY17(List list) { l_LOAD_QTY17 = list; }
	public void setList_LOAD_QTY18(List list) { l_LOAD_QTY18 = list; }
	public void setList_LOAD_QTY19(List list) { l_LOAD_QTY19 = list; }
	public void setList_LOAD_QTY20(List list) { l_LOAD_QTY20 = list; }
	public void setList_LOAD_QTY21(List list) { l_LOAD_QTY21 = list; }
	public void setList_LOAD_QTY22(List list) { l_LOAD_QTY22 = list; }
	public void setList_LOAD_QTY23(List list) { l_LOAD_QTY23 = list; }
	public void setList_LOAD_QTY24(List list) { l_LOAD_QTY24 = list; }
	public void setList_LOAD_QTY25(List list) { l_LOAD_QTY25 = list; }
	public void setList_LOAD_QTY26(List list) { l_LOAD_QTY26 = list; }
	public void setList_LOAD_QTY27(List list) { l_LOAD_QTY27 = list; }
	public void setList_LOAD_QTY28(List list) { l_LOAD_QTY28 = list; }
	public void setList_LOAD_QTY29(List list) { l_LOAD_QTY29 = list; }
	public void setList_LOAD_QTY30(List list) { l_LOAD_QTY30 = list; }
	public void setList_LOAD_QTY31(List list) { l_LOAD_QTY31 = list; }
	public void setList_LOAD_QTY32(List list) { l_LOAD_QTY32 = list; }
	public void setList_LOAD_QTY33(List list) { l_LOAD_QTY33 = list; }
	public void setList_LOAD_QTY34(List list) { l_LOAD_QTY34 = list; }
	public void setList_LOAD_QTY35(List list) { l_LOAD_QTY35 = list; }
	public void setList_LOAD_QTY36(List list) { l_LOAD_QTY36 = list; }
	public void setList_LOAD_QTY37(List list) { l_LOAD_QTY37 = list; }
	public void setList_LOAD_QTY38(List list) { l_LOAD_QTY38 = list; }
	public void setList_LOAD_QTY39(List list) { l_LOAD_QTY39 = list; }
	public void setList_LOAD_QTY40(List list) { l_LOAD_QTY40 = list; }
	public void setList_LOAD_QTY41(List list) { l_LOAD_QTY41 = list; }
	public void setList_LOAD_QTY42(List list) { l_LOAD_QTY42 = list; }
	public void setList_LOAD_QTY43(List list) { l_LOAD_QTY43 = list; }
	public void setList_LOAD_QTY44(List list) { l_LOAD_QTY44 = list; }
	public void setList_LOAD_QTY45(List list) { l_LOAD_QTY45 = list; }
	public void setList_LOAD_QTY46(List list) { l_LOAD_QTY46 = list; }
	public void setList_LOAD_QTY47(List list) { l_LOAD_QTY47 = list; }
	public void setList_LOAD_QTY48(List list) { l_LOAD_QTY48 = list; }
	public void setList_LOAD_QTY49(List list) { l_LOAD_QTY49 = list; }
	public void setList_LOAD_QTY50(List list) { l_LOAD_QTY50 = list; }
	public void setList_LOAD_QTY51(List list) { l_LOAD_QTY51 = list; }
	public void setList_LOAD_QTY52(List list) { l_LOAD_QTY52 = list; }
	public void setList_LOAD_QTY53(List list) { l_LOAD_QTY53 = list; }
	public void setList_LOAD_QTY54(List list) { l_LOAD_QTY54 = list; }
	public void setList_LOAD_QTY55(List list) { l_LOAD_QTY55 = list; }
	public void setList_LOAD_QTY56(List list) { l_LOAD_QTY56 = list; }
	public void setList_LOAD_QTY57(List list) { l_LOAD_QTY57 = list; }
	public void setList_LOAD_QTY58(List list) { l_LOAD_QTY58 = list; }
	public void setList_LOAD_QTY59(List list) { l_LOAD_QTY59 = list; }
	public void setList_LOAD_QTY60(List list) { l_LOAD_QTY60 = list; }
	public void setList_LOAD_QTY61(List list) { l_LOAD_QTY61 = list; }
	public void setList_LOAD_QTY62(List list) { l_LOAD_QTY62 = list; }
	public void setList_LOAD_QTY63(List list) { l_LOAD_QTY63 = list; }
	public void setList_LOAD_QTY64(List list) { l_LOAD_QTY64 = list; }
	public void setList_LOAD_QTY65(List list) { l_LOAD_QTY65 = list; }
	public void setList_LOAD_QTY66(List list) { l_LOAD_QTY66 = list; }
	public void setList_LOAD_QTY67(List list) { l_LOAD_QTY67 = list; }
	public void setList_LOAD_QTY68(List list) { l_LOAD_QTY68 = list; }
	public void setList_LOAD_QTY69(List list) { l_LOAD_QTY69 = list; }
	public void setList_LOAD_QTY70(List list) { l_LOAD_QTY70 = list; }
	public void setList_LOAD_QTY71(List list) { l_LOAD_QTY71 = list; }
	public void setList_LOAD_QTY72(List list) { l_LOAD_QTY72 = list; }
	public void setList_LOAD_QTY73(List list) { l_LOAD_QTY73 = list; }
	public void setList_LOAD_QTY74(List list) { l_LOAD_QTY74 = list; }
	public void setList_LOAD_QTY75(List list) { l_LOAD_QTY75 = list; }
	public void setList_LOAD_QTY76(List list) { l_LOAD_QTY76 = list; }
	public void setList_LOAD_QTY77(List list) { l_LOAD_QTY77 = list; }
	public void setList_LOAD_QTY78(List list) { l_LOAD_QTY78 = list; }
	public void setList_LOAD_QTY79(List list) { l_LOAD_QTY79 = list; }
	public void setList_LOAD_QTY80(List list) { l_LOAD_QTY80 = list; }
	public void setList_LOAD_QTY81(List list) { l_LOAD_QTY81 = list; }
	public void setList_LOAD_QTY82(List list) { l_LOAD_QTY82 = list; }
	public void setList_LOAD_QTY83(List list) { l_LOAD_QTY83 = list; }
	public void setList_LOAD_QTY84(List list) { l_LOAD_QTY84 = list; }
	public void setList_LOAD_QTY85(List list) { l_LOAD_QTY85 = list; }
	public void setList_LOAD_QTY86(List list) { l_LOAD_QTY86 = list; }
	public void setList_LOAD_QTY87(List list) { l_LOAD_QTY87 = list; }
	public void setList_LOAD_QTY88(List list) { l_LOAD_QTY88 = list; }
	public void setList_LOAD_QTY89(List list) { l_LOAD_QTY89 = list; }
	public void setList_LOAD_QTY90(List list) { l_LOAD_QTY90 = list; }
	public void setList_DateFrom(List list) { l_DateFrom = list; }
	public void setList_DateTo(List list) { l_DateTo = list; }
	public void setList_K_PLANT_CD(List list) { l_K_PLANT_CD = list; }
	public void setList_CAL_DATE(List list) { l_CAL_DATE = list; }
	public void setList_Holiday_Flg(List list) { l_Holiday_Flg = list; }
	public void setList_L_NECK_PROC_CD(List list) { l_L_NECK_PROC_CD = list; }
	public void setList_L_LOAD_DATE(List list) { l_L_LOAD_DATE = list; }
	public void setList_L_LOAD_QTY(List list) { l_L_LOAD_QTY = list; }
	public void setList_L_ODR_STS_TYP(List list) { l_L_ODR_STS_TYP = list; }
	public void setList_K_NECK_PROC_CD(List list) { l_K_NECK_PROC_CD = list; }
	public void setList_K_LOAD_DATE(List list) { l_K_LOAD_DATE = list; }
	public void setList_L_CHT_DIM(List list) { l_L_CHT_DIM = list; }
	public void setList_L_CHT_TYPE(List list) { l_L_CHT_TYPE = list; }
	public void setList_L_BG_C_R(List list) { l_L_BG_C_R = list; }
	public void setList_L_BG_C_G(List list) { l_L_BG_C_G = list; }
	public void setList_L_BG_C_B(List list) { l_L_BG_C_B = list; }
	public void setList_L_MAX_SCALE(List list) { l_L_MAX_SCALE = list; }
	public void setList_L_SCALE_STEP(List list) { l_L_SCALE_STEP = list; }
	public void setList_L_CHT_C0_R(List list) { l_L_CHT_C0_R = list; }
	public void setList_L_CHT_C0_G(List list) { l_L_CHT_C0_G = list; }
	public void setList_L_CHT_C0_B(List list) { l_L_CHT_C0_B = list; }
	public void setList_L_CHT_C1_R(List list) { l_L_CHT_C1_R = list; }
	public void setList_L_CHT_C1_G(List list) { l_L_CHT_C1_G = list; }
	public void setList_L_CHT_C1_B(List list) { l_L_CHT_C1_B = list; }
	public void setList_L_CHT_C2_R(List list) { l_L_CHT_C2_R = list; }
	public void setList_L_CHT_C2_G(List list) { l_L_CHT_C2_G = list; }
	public void setList_L_CHT_C2_B(List list) { l_L_CHT_C2_B = list; }
	public void setList_L_CHT_C9_R(List list) { l_L_CHT_C9_R = list; }
	public void setList_L_CHT_C9_G(List list) { l_L_CHT_C9_G = list; }
	public void setList_L_CHT_C9_B(List list) { l_L_CHT_C9_B = list; }
	public void setList_L_HIGH_LOAD(List list) { l_L_HIGH_LOAD = list; }
	public void setList_L_H_LOAD_C_R(List list) { l_L_H_LOAD_C_R = list; }
	public void setList_L_H_LOAD_C_G(List list) { l_L_H_LOAD_C_G = list; }
	public void setList_L_H_LOAD_C_B(List list) { l_L_H_LOAD_C_B = list; }
	public void setList_L_MIDD_LOAD(List list) { l_L_MIDD_LOAD = list; }
	public void setList_L_M_LOAD_C_R(List list) { l_L_M_LOAD_C_R = list; }
	public void setList_L_M_LOAD_C_G(List list) { l_L_M_LOAD_C_G = list; }
	public void setList_L_M_LOAD_C_B(List list) { l_L_M_LOAD_C_B = list; }
	public void setList_L_LOW_LOAD(List list) { l_L_LOW_LOAD = list; }
	public void setList_L_L_LOAD_C_R(List list) { l_L_L_LOAD_C_R = list; }
	public void setList_L_L_LOAD_C_G(List list) { l_L_L_LOAD_C_G = list; }
	public void setList_L_L_LOAD_C_B(List list) { l_L_L_LOAD_C_B = list; }
	public void setList_LKM_ITEM_CD(List list) { l_LKM_ITEM_CD = list; }
	public void setList_LKM_ITEM_NAME(List list) { l_LKM_ITEM_NAME = list; }
	public void setList_LKM_JOB_ODR_CD(List list) { l_LKM_JOB_ODR_CD = list; }
	public void setList_LKM_ODR_STS_TYP(List list) { l_LKM_ODR_STS_TYP = list; }
	public void setList_LKM_PRD_START_DATE(List list) { l_LKM_PRD_START_DATE = list; }
	public void setList_LKM_PRD_DUE_DATE(List list) { l_LKM_PRD_DUE_DATE = list; }
	public void setList_LKM_ODR_QTY(List list) { l_LKM_ODR_QTY = list; }
	public void setList_LKM_TOTAL_RCV_QTY(List list) { l_LKM_TOTAL_RCV_QTY = list; }
	public void setList_LKM_UNIT_LOAD(List list) { l_LKM_UNIT_LOAD = list; }
	public void setList_LKM_LOAD_QTY(List list) { l_LKM_LOAD_QTY = list; }
	public void setList_KM_LOAD_DATE(List list) { l_KM_LOAD_DATE = list; }
	public void setList_LKM_SUM_LOAD_QTY(List list) { l_LKM_SUM_LOAD_QTY = list; }
	public void setList_LKM_OVR_LOAD_QTY(List list) { l_LKM_OVR_LOAD_QTY = list; }
	public void setList_LKM_NECK_PROC_CD(List list) { l_LKM_NECK_PROC_CD = list; }
	public void setList_LKM_LOAD_DATE(List list) { l_LKM_LOAD_DATE = list; }
	public void setList_LKM_NECK_PROC_NAME(List list) { l_LKM_NECK_PROC_NAME = list; }
	public void setList_LKM_NECK_PROC_CAPA(List list) { l_LKM_NECK_PROC_CAPA = list; }
	public void setList_LKM_NECK_PROC_CAPA_UNIT(List list) { l_LKM_NECK_PROC_CAPA_UNIT = list; }
	public void setList_FLG1(List list) { l_FLG1 = list; }
	public void setList_FLG2(List list) { l_FLG2 = list; }
	public void setList_FLG3(List list) { l_FLG3 = list; }
	public void setList_FLG4(List list) { l_FLG4 = list; }
	public void setList_FLG5(List list) { l_FLG5 = list; }
	public void setList_FLG6(List list) { l_FLG6 = list; }
	public void setList_FLG7(List list) { l_FLG7 = list; }
	public void setList_FLG8(List list) { l_FLG8 = list; }
	public void setList_FLG9(List list) { l_FLG9 = list; }
	public void setList_FLG10(List list) { l_FLG10 = list; }
	public void setList_FLG11(List list) { l_FLG11 = list; }
	public void setList_FLG12(List list) { l_FLG12 = list; }
	public void setList_FLG13(List list) { l_FLG13 = list; }
	public void setList_FLG14(List list) { l_FLG14 = list; }
	public void setList_FLG15(List list) { l_FLG15 = list; }
	public void setList_FLG16(List list) { l_FLG16 = list; }
	public void setList_FLG17(List list) { l_FLG17 = list; }
	public void setList_FLG18(List list) { l_FLG18 = list; }
	public void setList_FLG19(List list) { l_FLG19 = list; }
	public void setList_FLG20(List list) { l_FLG20 = list; }
	public void setList_FLG21(List list) { l_FLG21 = list; }
	public void setList_FLG22(List list) { l_FLG22 = list; }
	public void setList_FLG23(List list) { l_FLG23 = list; }
	public void setList_FLG24(List list) { l_FLG24 = list; }
	public void setList_FLG25(List list) { l_FLG25 = list; }
	public void setList_FLG26(List list) { l_FLG26 = list; }
	public void setList_FLG27(List list) { l_FLG27 = list; }
	public void setList_FLG28(List list) { l_FLG28 = list; }
	public void setList_FLG29(List list) { l_FLG29 = list; }
	public void setList_FLG30(List list) { l_FLG30 = list; }
	public void setList_FLG31(List list) { l_FLG31 = list; }
	public void setList_FLG32(List list) { l_FLG32 = list; }
	public void setList_FLG33(List list) { l_FLG33 = list; }
	public void setList_FLG34(List list) { l_FLG34 = list; }
	public void setList_FLG35(List list) { l_FLG35 = list; }
	public void setList_FLG36(List list) { l_FLG36 = list; }
	public void setList_FLG37(List list) { l_FLG37 = list; }
	public void setList_FLG38(List list) { l_FLG38 = list; }
	public void setList_FLG39(List list) { l_FLG39 = list; }
	public void setList_FLG40(List list) { l_FLG40 = list; }
	public void setList_FLG41(List list) { l_FLG41 = list; }
	public void setList_FLG42(List list) { l_FLG42 = list; }
	public void setList_FLG43(List list) { l_FLG43 = list; }
	public void setList_FLG44(List list) { l_FLG44 = list; }
	public void setList_FLG45(List list) { l_FLG45 = list; }
	public void setList_FLG46(List list) { l_FLG46 = list; }
	public void setList_FLG47(List list) { l_FLG47 = list; }
	public void setList_FLG48(List list) { l_FLG48 = list; }
	public void setList_FLG49(List list) { l_FLG49 = list; }
	public void setList_FLG50(List list) { l_FLG50 = list; }
	public void setList_FLG51(List list) { l_FLG51 = list; }
	public void setList_FLG52(List list) { l_FLG52 = list; }
	public void setList_FLG53(List list) { l_FLG53 = list; }
	public void setList_FLG54(List list) { l_FLG54 = list; }
	public void setList_FLG55(List list) { l_FLG55 = list; }
	public void setList_FLG56(List list) { l_FLG56 = list; }
	public void setList_FLG57(List list) { l_FLG57 = list; }
	public void setList_FLG58(List list) { l_FLG58 = list; }
	public void setList_FLG59(List list) { l_FLG59 = list; }
	public void setList_FLG60(List list) { l_FLG60 = list; }
	public void setList_FLG61(List list) { l_FLG61 = list; }
	public void setList_FLG62(List list) { l_FLG62 = list; }
	public void setList_FLG63(List list) { l_FLG63 = list; }
	public void setList_FLG64(List list) { l_FLG64 = list; }
	public void setList_FLG65(List list) { l_FLG65 = list; }
	public void setList_FLG66(List list) { l_FLG66 = list; }
	public void setList_FLG67(List list) { l_FLG67 = list; }
	public void setList_FLG68(List list) { l_FLG68 = list; }
	public void setList_FLG69(List list) { l_FLG69 = list; }
	public void setList_FLG70(List list) { l_FLG70 = list; }
	public void setList_FLG71(List list) { l_FLG71 = list; }
	public void setList_FLG72(List list) { l_FLG72 = list; }
	public void setList_FLG73(List list) { l_FLG73 = list; }
	public void setList_FLG74(List list) { l_FLG74 = list; }
	public void setList_FLG75(List list) { l_FLG75 = list; }
	public void setList_FLG76(List list) { l_FLG76 = list; }
	public void setList_FLG77(List list) { l_FLG77 = list; }
	public void setList_FLG78(List list) { l_FLG78 = list; }
	public void setList_FLG79(List list) { l_FLG79 = list; }
	public void setList_FLG80(List list) { l_FLG80 = list; }
	public void setList_FLG81(List list) { l_FLG81 = list; }
	public void setList_FLG82(List list) { l_FLG82 = list; }
	public void setList_FLG83(List list) { l_FLG83 = list; }
	public void setList_FLG84(List list) { l_FLG84 = list; }
	public void setList_FLG85(List list) { l_FLG85 = list; }
	public void setList_FLG86(List list) { l_FLG86 = list; }
	public void setList_FLG87(List list) { l_FLG87 = list; }
	public void setList_FLG88(List list) { l_FLG88 = list; }
	public void setList_FLG89(List list) { l_FLG89 = list; }
	public void setList_FLG90(List list) { l_FLG90 = list; }
	public void setList_L_NECK_PROC_NAME(List list) { l_L_NECK_PROC_NAME = list; }
	public void setList_L_NECK_PROC_CAPA(List list) { l_L_NECK_PROC_CAPA = list; }
	public void setList_L_NECK_PROC_CAPA_UNIT(List list) { l_L_NECK_PROC_CAPA_UNIT = list; }

	public int setL2L_Shift_Date(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Shift_Date == null) {
			l_Shift_Date = new ArrayList();
		} else {
			l_Shift_Date.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Shift_Date.add(((AL0040010Struct) list.get(i)).getShift_Date());
		}
		return size;
	}
	public int setL2L_hidden_High_Color(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_High_Color == null) {
			l_hidden_High_Color = new ArrayList();
		} else {
			l_hidden_High_Color.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_High_Color.add(((AL0040010Struct) list.get(i)).gethidden_High_Color());
		}
		return size;
	}
	public int setL2L_hidden_Midd_Color(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_Midd_Color == null) {
			l_hidden_Midd_Color = new ArrayList();
		} else {
			l_hidden_Midd_Color.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_Midd_Color.add(((AL0040010Struct) list.get(i)).gethidden_Midd_Color());
		}
		return size;
	}
	public int setL2L_hidden_Low_Color(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_Low_Color == null) {
			l_hidden_Low_Color = new ArrayList();
		} else {
			l_hidden_Low_Color.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_Low_Color.add(((AL0040010Struct) list.get(i)).gethidden_Low_Color());
		}
		return size;
	}
	public int setL2L_hidden_DateFrom(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_DateFrom == null) {
			l_hidden_DateFrom = new ArrayList();
		} else {
			l_hidden_DateFrom.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_DateFrom.add(((AL0040010Struct) list.get(i)).gethidden_DateFrom());
		}
		return size;
	}
	public int setL2L_hidden_DateTo(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_DateTo == null) {
			l_hidden_DateTo = new ArrayList();
		} else {
			l_hidden_DateTo.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_DateTo.add(((AL0040010Struct) list.get(i)).gethidden_DateTo());
		}
		return size;
	}
	public int setL2L_S_LOAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_S_LOAD_DATE == null) {
			l_S_LOAD_DATE = new ArrayList();
		} else {
			l_S_LOAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_S_LOAD_DATE.add(((AL0040010Struct) list.get(i)).getS_LOAD_DATE());
		}
		return size;
	}
	public int setL2L_w_AlInstalledFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_AlInstalledFlg == null) {
			l_w_AlInstalledFlg = new ArrayList();
		} else {
			l_w_AlInstalledFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_AlInstalledFlg.add(((AL0040010Struct) list.get(i)).getw_AlInstalledFlg());
		}
		return size;
	}
	public int setL2L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_NAME == null) {
			l_NECK_PROC_NAME = new ArrayList();
		} else {
			l_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_NAME.add(((AL0040010Struct) list.get(i)).getNECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CD == null) {
			l_NECK_PROC_CD = new ArrayList();
		} else {
			l_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CD.add(((AL0040010Struct) list.get(i)).getNECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_LOAD_QTY1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY1 == null) {
			l_LOAD_QTY1 = new ArrayList();
		} else {
			l_LOAD_QTY1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY1.add(((AL0040010Struct) list.get(i)).getLOAD_QTY1());
		}
		return size;
	}
	public int setL2L_LOAD_QTY2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY2 == null) {
			l_LOAD_QTY2 = new ArrayList();
		} else {
			l_LOAD_QTY2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY2.add(((AL0040010Struct) list.get(i)).getLOAD_QTY2());
		}
		return size;
	}
	public int setL2L_LOAD_QTY3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY3 == null) {
			l_LOAD_QTY3 = new ArrayList();
		} else {
			l_LOAD_QTY3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY3.add(((AL0040010Struct) list.get(i)).getLOAD_QTY3());
		}
		return size;
	}
	public int setL2L_LOAD_QTY4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY4 == null) {
			l_LOAD_QTY4 = new ArrayList();
		} else {
			l_LOAD_QTY4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY4.add(((AL0040010Struct) list.get(i)).getLOAD_QTY4());
		}
		return size;
	}
	public int setL2L_LOAD_QTY5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY5 == null) {
			l_LOAD_QTY5 = new ArrayList();
		} else {
			l_LOAD_QTY5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY5.add(((AL0040010Struct) list.get(i)).getLOAD_QTY5());
		}
		return size;
	}
	public int setL2L_LOAD_QTY6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY6 == null) {
			l_LOAD_QTY6 = new ArrayList();
		} else {
			l_LOAD_QTY6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY6.add(((AL0040010Struct) list.get(i)).getLOAD_QTY6());
		}
		return size;
	}
	public int setL2L_LOAD_QTY7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY7 == null) {
			l_LOAD_QTY7 = new ArrayList();
		} else {
			l_LOAD_QTY7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY7.add(((AL0040010Struct) list.get(i)).getLOAD_QTY7());
		}
		return size;
	}
	public int setL2L_LOAD_QTY8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY8 == null) {
			l_LOAD_QTY8 = new ArrayList();
		} else {
			l_LOAD_QTY8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY8.add(((AL0040010Struct) list.get(i)).getLOAD_QTY8());
		}
		return size;
	}
	public int setL2L_LOAD_QTY9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY9 == null) {
			l_LOAD_QTY9 = new ArrayList();
		} else {
			l_LOAD_QTY9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY9.add(((AL0040010Struct) list.get(i)).getLOAD_QTY9());
		}
		return size;
	}
	public int setL2L_LOAD_QTY10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY10 == null) {
			l_LOAD_QTY10 = new ArrayList();
		} else {
			l_LOAD_QTY10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY10.add(((AL0040010Struct) list.get(i)).getLOAD_QTY10());
		}
		return size;
	}
	public int setL2L_LOAD_QTY11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY11 == null) {
			l_LOAD_QTY11 = new ArrayList();
		} else {
			l_LOAD_QTY11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY11.add(((AL0040010Struct) list.get(i)).getLOAD_QTY11());
		}
		return size;
	}
	public int setL2L_LOAD_QTY12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY12 == null) {
			l_LOAD_QTY12 = new ArrayList();
		} else {
			l_LOAD_QTY12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY12.add(((AL0040010Struct) list.get(i)).getLOAD_QTY12());
		}
		return size;
	}
	public int setL2L_LOAD_QTY13(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY13 == null) {
			l_LOAD_QTY13 = new ArrayList();
		} else {
			l_LOAD_QTY13.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY13.add(((AL0040010Struct) list.get(i)).getLOAD_QTY13());
		}
		return size;
	}
	public int setL2L_LOAD_QTY14(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY14 == null) {
			l_LOAD_QTY14 = new ArrayList();
		} else {
			l_LOAD_QTY14.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY14.add(((AL0040010Struct) list.get(i)).getLOAD_QTY14());
		}
		return size;
	}
	public int setL2L_LOAD_QTY15(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY15 == null) {
			l_LOAD_QTY15 = new ArrayList();
		} else {
			l_LOAD_QTY15.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY15.add(((AL0040010Struct) list.get(i)).getLOAD_QTY15());
		}
		return size;
	}
	public int setL2L_LOAD_QTY16(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY16 == null) {
			l_LOAD_QTY16 = new ArrayList();
		} else {
			l_LOAD_QTY16.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY16.add(((AL0040010Struct) list.get(i)).getLOAD_QTY16());
		}
		return size;
	}
	public int setL2L_LOAD_QTY17(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY17 == null) {
			l_LOAD_QTY17 = new ArrayList();
		} else {
			l_LOAD_QTY17.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY17.add(((AL0040010Struct) list.get(i)).getLOAD_QTY17());
		}
		return size;
	}
	public int setL2L_LOAD_QTY18(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY18 == null) {
			l_LOAD_QTY18 = new ArrayList();
		} else {
			l_LOAD_QTY18.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY18.add(((AL0040010Struct) list.get(i)).getLOAD_QTY18());
		}
		return size;
	}
	public int setL2L_LOAD_QTY19(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY19 == null) {
			l_LOAD_QTY19 = new ArrayList();
		} else {
			l_LOAD_QTY19.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY19.add(((AL0040010Struct) list.get(i)).getLOAD_QTY19());
		}
		return size;
	}
	public int setL2L_LOAD_QTY20(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY20 == null) {
			l_LOAD_QTY20 = new ArrayList();
		} else {
			l_LOAD_QTY20.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY20.add(((AL0040010Struct) list.get(i)).getLOAD_QTY20());
		}
		return size;
	}
	public int setL2L_LOAD_QTY21(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY21 == null) {
			l_LOAD_QTY21 = new ArrayList();
		} else {
			l_LOAD_QTY21.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY21.add(((AL0040010Struct) list.get(i)).getLOAD_QTY21());
		}
		return size;
	}
	public int setL2L_LOAD_QTY22(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY22 == null) {
			l_LOAD_QTY22 = new ArrayList();
		} else {
			l_LOAD_QTY22.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY22.add(((AL0040010Struct) list.get(i)).getLOAD_QTY22());
		}
		return size;
	}
	public int setL2L_LOAD_QTY23(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY23 == null) {
			l_LOAD_QTY23 = new ArrayList();
		} else {
			l_LOAD_QTY23.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY23.add(((AL0040010Struct) list.get(i)).getLOAD_QTY23());
		}
		return size;
	}
	public int setL2L_LOAD_QTY24(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY24 == null) {
			l_LOAD_QTY24 = new ArrayList();
		} else {
			l_LOAD_QTY24.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY24.add(((AL0040010Struct) list.get(i)).getLOAD_QTY24());
		}
		return size;
	}
	public int setL2L_LOAD_QTY25(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY25 == null) {
			l_LOAD_QTY25 = new ArrayList();
		} else {
			l_LOAD_QTY25.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY25.add(((AL0040010Struct) list.get(i)).getLOAD_QTY25());
		}
		return size;
	}
	public int setL2L_LOAD_QTY26(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY26 == null) {
			l_LOAD_QTY26 = new ArrayList();
		} else {
			l_LOAD_QTY26.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY26.add(((AL0040010Struct) list.get(i)).getLOAD_QTY26());
		}
		return size;
	}
	public int setL2L_LOAD_QTY27(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY27 == null) {
			l_LOAD_QTY27 = new ArrayList();
		} else {
			l_LOAD_QTY27.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY27.add(((AL0040010Struct) list.get(i)).getLOAD_QTY27());
		}
		return size;
	}
	public int setL2L_LOAD_QTY28(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY28 == null) {
			l_LOAD_QTY28 = new ArrayList();
		} else {
			l_LOAD_QTY28.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY28.add(((AL0040010Struct) list.get(i)).getLOAD_QTY28());
		}
		return size;
	}
	public int setL2L_LOAD_QTY29(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY29 == null) {
			l_LOAD_QTY29 = new ArrayList();
		} else {
			l_LOAD_QTY29.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY29.add(((AL0040010Struct) list.get(i)).getLOAD_QTY29());
		}
		return size;
	}
	public int setL2L_LOAD_QTY30(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY30 == null) {
			l_LOAD_QTY30 = new ArrayList();
		} else {
			l_LOAD_QTY30.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY30.add(((AL0040010Struct) list.get(i)).getLOAD_QTY30());
		}
		return size;
	}
	public int setL2L_LOAD_QTY31(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY31 == null) {
			l_LOAD_QTY31 = new ArrayList();
		} else {
			l_LOAD_QTY31.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY31.add(((AL0040010Struct) list.get(i)).getLOAD_QTY31());
		}
		return size;
	}
	public int setL2L_LOAD_QTY32(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY32 == null) {
			l_LOAD_QTY32 = new ArrayList();
		} else {
			l_LOAD_QTY32.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY32.add(((AL0040010Struct) list.get(i)).getLOAD_QTY32());
		}
		return size;
	}
	public int setL2L_LOAD_QTY33(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY33 == null) {
			l_LOAD_QTY33 = new ArrayList();
		} else {
			l_LOAD_QTY33.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY33.add(((AL0040010Struct) list.get(i)).getLOAD_QTY33());
		}
		return size;
	}
	public int setL2L_LOAD_QTY34(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY34 == null) {
			l_LOAD_QTY34 = new ArrayList();
		} else {
			l_LOAD_QTY34.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY34.add(((AL0040010Struct) list.get(i)).getLOAD_QTY34());
		}
		return size;
	}
	public int setL2L_LOAD_QTY35(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY35 == null) {
			l_LOAD_QTY35 = new ArrayList();
		} else {
			l_LOAD_QTY35.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY35.add(((AL0040010Struct) list.get(i)).getLOAD_QTY35());
		}
		return size;
	}
	public int setL2L_LOAD_QTY36(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY36 == null) {
			l_LOAD_QTY36 = new ArrayList();
		} else {
			l_LOAD_QTY36.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY36.add(((AL0040010Struct) list.get(i)).getLOAD_QTY36());
		}
		return size;
	}
	public int setL2L_LOAD_QTY37(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY37 == null) {
			l_LOAD_QTY37 = new ArrayList();
		} else {
			l_LOAD_QTY37.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY37.add(((AL0040010Struct) list.get(i)).getLOAD_QTY37());
		}
		return size;
	}
	public int setL2L_LOAD_QTY38(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY38 == null) {
			l_LOAD_QTY38 = new ArrayList();
		} else {
			l_LOAD_QTY38.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY38.add(((AL0040010Struct) list.get(i)).getLOAD_QTY38());
		}
		return size;
	}
	public int setL2L_LOAD_QTY39(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY39 == null) {
			l_LOAD_QTY39 = new ArrayList();
		} else {
			l_LOAD_QTY39.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY39.add(((AL0040010Struct) list.get(i)).getLOAD_QTY39());
		}
		return size;
	}
	public int setL2L_LOAD_QTY40(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY40 == null) {
			l_LOAD_QTY40 = new ArrayList();
		} else {
			l_LOAD_QTY40.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY40.add(((AL0040010Struct) list.get(i)).getLOAD_QTY40());
		}
		return size;
	}
	public int setL2L_LOAD_QTY41(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY41 == null) {
			l_LOAD_QTY41 = new ArrayList();
		} else {
			l_LOAD_QTY41.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY41.add(((AL0040010Struct) list.get(i)).getLOAD_QTY41());
		}
		return size;
	}
	public int setL2L_LOAD_QTY42(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY42 == null) {
			l_LOAD_QTY42 = new ArrayList();
		} else {
			l_LOAD_QTY42.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY42.add(((AL0040010Struct) list.get(i)).getLOAD_QTY42());
		}
		return size;
	}
	public int setL2L_LOAD_QTY43(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY43 == null) {
			l_LOAD_QTY43 = new ArrayList();
		} else {
			l_LOAD_QTY43.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY43.add(((AL0040010Struct) list.get(i)).getLOAD_QTY43());
		}
		return size;
	}
	public int setL2L_LOAD_QTY44(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY44 == null) {
			l_LOAD_QTY44 = new ArrayList();
		} else {
			l_LOAD_QTY44.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY44.add(((AL0040010Struct) list.get(i)).getLOAD_QTY44());
		}
		return size;
	}
	public int setL2L_LOAD_QTY45(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY45 == null) {
			l_LOAD_QTY45 = new ArrayList();
		} else {
			l_LOAD_QTY45.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY45.add(((AL0040010Struct) list.get(i)).getLOAD_QTY45());
		}
		return size;
	}
	public int setL2L_LOAD_QTY46(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY46 == null) {
			l_LOAD_QTY46 = new ArrayList();
		} else {
			l_LOAD_QTY46.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY46.add(((AL0040010Struct) list.get(i)).getLOAD_QTY46());
		}
		return size;
	}
	public int setL2L_LOAD_QTY47(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY47 == null) {
			l_LOAD_QTY47 = new ArrayList();
		} else {
			l_LOAD_QTY47.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY47.add(((AL0040010Struct) list.get(i)).getLOAD_QTY47());
		}
		return size;
	}
	public int setL2L_LOAD_QTY48(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY48 == null) {
			l_LOAD_QTY48 = new ArrayList();
		} else {
			l_LOAD_QTY48.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY48.add(((AL0040010Struct) list.get(i)).getLOAD_QTY48());
		}
		return size;
	}
	public int setL2L_LOAD_QTY49(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY49 == null) {
			l_LOAD_QTY49 = new ArrayList();
		} else {
			l_LOAD_QTY49.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY49.add(((AL0040010Struct) list.get(i)).getLOAD_QTY49());
		}
		return size;
	}
	public int setL2L_LOAD_QTY50(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY50 == null) {
			l_LOAD_QTY50 = new ArrayList();
		} else {
			l_LOAD_QTY50.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY50.add(((AL0040010Struct) list.get(i)).getLOAD_QTY50());
		}
		return size;
	}
	public int setL2L_LOAD_QTY51(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY51 == null) {
			l_LOAD_QTY51 = new ArrayList();
		} else {
			l_LOAD_QTY51.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY51.add(((AL0040010Struct) list.get(i)).getLOAD_QTY51());
		}
		return size;
	}
	public int setL2L_LOAD_QTY52(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY52 == null) {
			l_LOAD_QTY52 = new ArrayList();
		} else {
			l_LOAD_QTY52.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY52.add(((AL0040010Struct) list.get(i)).getLOAD_QTY52());
		}
		return size;
	}
	public int setL2L_LOAD_QTY53(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY53 == null) {
			l_LOAD_QTY53 = new ArrayList();
		} else {
			l_LOAD_QTY53.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY53.add(((AL0040010Struct) list.get(i)).getLOAD_QTY53());
		}
		return size;
	}
	public int setL2L_LOAD_QTY54(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY54 == null) {
			l_LOAD_QTY54 = new ArrayList();
		} else {
			l_LOAD_QTY54.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY54.add(((AL0040010Struct) list.get(i)).getLOAD_QTY54());
		}
		return size;
	}
	public int setL2L_LOAD_QTY55(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY55 == null) {
			l_LOAD_QTY55 = new ArrayList();
		} else {
			l_LOAD_QTY55.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY55.add(((AL0040010Struct) list.get(i)).getLOAD_QTY55());
		}
		return size;
	}
	public int setL2L_LOAD_QTY56(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY56 == null) {
			l_LOAD_QTY56 = new ArrayList();
		} else {
			l_LOAD_QTY56.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY56.add(((AL0040010Struct) list.get(i)).getLOAD_QTY56());
		}
		return size;
	}
	public int setL2L_LOAD_QTY57(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY57 == null) {
			l_LOAD_QTY57 = new ArrayList();
		} else {
			l_LOAD_QTY57.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY57.add(((AL0040010Struct) list.get(i)).getLOAD_QTY57());
		}
		return size;
	}
	public int setL2L_LOAD_QTY58(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY58 == null) {
			l_LOAD_QTY58 = new ArrayList();
		} else {
			l_LOAD_QTY58.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY58.add(((AL0040010Struct) list.get(i)).getLOAD_QTY58());
		}
		return size;
	}
	public int setL2L_LOAD_QTY59(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY59 == null) {
			l_LOAD_QTY59 = new ArrayList();
		} else {
			l_LOAD_QTY59.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY59.add(((AL0040010Struct) list.get(i)).getLOAD_QTY59());
		}
		return size;
	}
	public int setL2L_LOAD_QTY60(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY60 == null) {
			l_LOAD_QTY60 = new ArrayList();
		} else {
			l_LOAD_QTY60.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY60.add(((AL0040010Struct) list.get(i)).getLOAD_QTY60());
		}
		return size;
	}
	public int setL2L_LOAD_QTY61(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY61 == null) {
			l_LOAD_QTY61 = new ArrayList();
		} else {
			l_LOAD_QTY61.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY61.add(((AL0040010Struct) list.get(i)).getLOAD_QTY61());
		}
		return size;
	}
	public int setL2L_LOAD_QTY62(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY62 == null) {
			l_LOAD_QTY62 = new ArrayList();
		} else {
			l_LOAD_QTY62.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY62.add(((AL0040010Struct) list.get(i)).getLOAD_QTY62());
		}
		return size;
	}
	public int setL2L_LOAD_QTY63(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY63 == null) {
			l_LOAD_QTY63 = new ArrayList();
		} else {
			l_LOAD_QTY63.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY63.add(((AL0040010Struct) list.get(i)).getLOAD_QTY63());
		}
		return size;
	}
	public int setL2L_LOAD_QTY64(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY64 == null) {
			l_LOAD_QTY64 = new ArrayList();
		} else {
			l_LOAD_QTY64.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY64.add(((AL0040010Struct) list.get(i)).getLOAD_QTY64());
		}
		return size;
	}
	public int setL2L_LOAD_QTY65(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY65 == null) {
			l_LOAD_QTY65 = new ArrayList();
		} else {
			l_LOAD_QTY65.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY65.add(((AL0040010Struct) list.get(i)).getLOAD_QTY65());
		}
		return size;
	}
	public int setL2L_LOAD_QTY66(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY66 == null) {
			l_LOAD_QTY66 = new ArrayList();
		} else {
			l_LOAD_QTY66.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY66.add(((AL0040010Struct) list.get(i)).getLOAD_QTY66());
		}
		return size;
	}
	public int setL2L_LOAD_QTY67(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY67 == null) {
			l_LOAD_QTY67 = new ArrayList();
		} else {
			l_LOAD_QTY67.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY67.add(((AL0040010Struct) list.get(i)).getLOAD_QTY67());
		}
		return size;
	}
	public int setL2L_LOAD_QTY68(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY68 == null) {
			l_LOAD_QTY68 = new ArrayList();
		} else {
			l_LOAD_QTY68.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY68.add(((AL0040010Struct) list.get(i)).getLOAD_QTY68());
		}
		return size;
	}
	public int setL2L_LOAD_QTY69(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY69 == null) {
			l_LOAD_QTY69 = new ArrayList();
		} else {
			l_LOAD_QTY69.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY69.add(((AL0040010Struct) list.get(i)).getLOAD_QTY69());
		}
		return size;
	}
	public int setL2L_LOAD_QTY70(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY70 == null) {
			l_LOAD_QTY70 = new ArrayList();
		} else {
			l_LOAD_QTY70.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY70.add(((AL0040010Struct) list.get(i)).getLOAD_QTY70());
		}
		return size;
	}
	public int setL2L_LOAD_QTY71(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY71 == null) {
			l_LOAD_QTY71 = new ArrayList();
		} else {
			l_LOAD_QTY71.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY71.add(((AL0040010Struct) list.get(i)).getLOAD_QTY71());
		}
		return size;
	}
	public int setL2L_LOAD_QTY72(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY72 == null) {
			l_LOAD_QTY72 = new ArrayList();
		} else {
			l_LOAD_QTY72.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY72.add(((AL0040010Struct) list.get(i)).getLOAD_QTY72());
		}
		return size;
	}
	public int setL2L_LOAD_QTY73(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY73 == null) {
			l_LOAD_QTY73 = new ArrayList();
		} else {
			l_LOAD_QTY73.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY73.add(((AL0040010Struct) list.get(i)).getLOAD_QTY73());
		}
		return size;
	}
	public int setL2L_LOAD_QTY74(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY74 == null) {
			l_LOAD_QTY74 = new ArrayList();
		} else {
			l_LOAD_QTY74.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY74.add(((AL0040010Struct) list.get(i)).getLOAD_QTY74());
		}
		return size;
	}
	public int setL2L_LOAD_QTY75(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY75 == null) {
			l_LOAD_QTY75 = new ArrayList();
		} else {
			l_LOAD_QTY75.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY75.add(((AL0040010Struct) list.get(i)).getLOAD_QTY75());
		}
		return size;
	}
	public int setL2L_LOAD_QTY76(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY76 == null) {
			l_LOAD_QTY76 = new ArrayList();
		} else {
			l_LOAD_QTY76.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY76.add(((AL0040010Struct) list.get(i)).getLOAD_QTY76());
		}
		return size;
	}
	public int setL2L_LOAD_QTY77(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY77 == null) {
			l_LOAD_QTY77 = new ArrayList();
		} else {
			l_LOAD_QTY77.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY77.add(((AL0040010Struct) list.get(i)).getLOAD_QTY77());
		}
		return size;
	}
	public int setL2L_LOAD_QTY78(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY78 == null) {
			l_LOAD_QTY78 = new ArrayList();
		} else {
			l_LOAD_QTY78.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY78.add(((AL0040010Struct) list.get(i)).getLOAD_QTY78());
		}
		return size;
	}
	public int setL2L_LOAD_QTY79(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY79 == null) {
			l_LOAD_QTY79 = new ArrayList();
		} else {
			l_LOAD_QTY79.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY79.add(((AL0040010Struct) list.get(i)).getLOAD_QTY79());
		}
		return size;
	}
	public int setL2L_LOAD_QTY80(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY80 == null) {
			l_LOAD_QTY80 = new ArrayList();
		} else {
			l_LOAD_QTY80.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY80.add(((AL0040010Struct) list.get(i)).getLOAD_QTY80());
		}
		return size;
	}
	public int setL2L_LOAD_QTY81(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY81 == null) {
			l_LOAD_QTY81 = new ArrayList();
		} else {
			l_LOAD_QTY81.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY81.add(((AL0040010Struct) list.get(i)).getLOAD_QTY81());
		}
		return size;
	}
	public int setL2L_LOAD_QTY82(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY82 == null) {
			l_LOAD_QTY82 = new ArrayList();
		} else {
			l_LOAD_QTY82.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY82.add(((AL0040010Struct) list.get(i)).getLOAD_QTY82());
		}
		return size;
	}
	public int setL2L_LOAD_QTY83(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY83 == null) {
			l_LOAD_QTY83 = new ArrayList();
		} else {
			l_LOAD_QTY83.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY83.add(((AL0040010Struct) list.get(i)).getLOAD_QTY83());
		}
		return size;
	}
	public int setL2L_LOAD_QTY84(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY84 == null) {
			l_LOAD_QTY84 = new ArrayList();
		} else {
			l_LOAD_QTY84.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY84.add(((AL0040010Struct) list.get(i)).getLOAD_QTY84());
		}
		return size;
	}
	public int setL2L_LOAD_QTY85(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY85 == null) {
			l_LOAD_QTY85 = new ArrayList();
		} else {
			l_LOAD_QTY85.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY85.add(((AL0040010Struct) list.get(i)).getLOAD_QTY85());
		}
		return size;
	}
	public int setL2L_LOAD_QTY86(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY86 == null) {
			l_LOAD_QTY86 = new ArrayList();
		} else {
			l_LOAD_QTY86.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY86.add(((AL0040010Struct) list.get(i)).getLOAD_QTY86());
		}
		return size;
	}
	public int setL2L_LOAD_QTY87(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY87 == null) {
			l_LOAD_QTY87 = new ArrayList();
		} else {
			l_LOAD_QTY87.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY87.add(((AL0040010Struct) list.get(i)).getLOAD_QTY87());
		}
		return size;
	}
	public int setL2L_LOAD_QTY88(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY88 == null) {
			l_LOAD_QTY88 = new ArrayList();
		} else {
			l_LOAD_QTY88.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY88.add(((AL0040010Struct) list.get(i)).getLOAD_QTY88());
		}
		return size;
	}
	public int setL2L_LOAD_QTY89(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY89 == null) {
			l_LOAD_QTY89 = new ArrayList();
		} else {
			l_LOAD_QTY89.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY89.add(((AL0040010Struct) list.get(i)).getLOAD_QTY89());
		}
		return size;
	}
	public int setL2L_LOAD_QTY90(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_QTY90 == null) {
			l_LOAD_QTY90 = new ArrayList();
		} else {
			l_LOAD_QTY90.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_QTY90.add(((AL0040010Struct) list.get(i)).getLOAD_QTY90());
		}
		return size;
	}
	public int setL2L_DateFrom(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DateFrom == null) {
			l_DateFrom = new ArrayList();
		} else {
			l_DateFrom.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DateFrom.add(((AL0040010Struct) list.get(i)).getDateFrom());
		}
		return size;
	}
	public int setL2L_DateTo(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DateTo == null) {
			l_DateTo = new ArrayList();
		} else {
			l_DateTo.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DateTo.add(((AL0040010Struct) list.get(i)).getDateTo());
		}
		return size;
	}
	public int setL2L_K_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_K_PLANT_CD == null) {
			l_K_PLANT_CD = new ArrayList();
		} else {
			l_K_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_K_PLANT_CD.add(((AL0040010Struct) list.get(i)).getK_PLANT_CD());
		}
		return size;
	}
	public int setL2L_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_DATE == null) {
			l_CAL_DATE = new ArrayList();
		} else {
			l_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_DATE.add(((AL0040010Struct) list.get(i)).getCAL_DATE());
		}
		return size;
	}
	public int setL2L_Holiday_Flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Holiday_Flg == null) {
			l_Holiday_Flg = new ArrayList();
		} else {
			l_Holiday_Flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Holiday_Flg.add(((AL0040010Struct) list.get(i)).getHoliday_Flg());
		}
		return size;
	}
	public int setL2L_L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_NECK_PROC_CD == null) {
			l_L_NECK_PROC_CD = new ArrayList();
		} else {
			l_L_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_NECK_PROC_CD.add(((AL0040010Struct) list.get(i)).getL_NECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_L_LOAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_LOAD_DATE == null) {
			l_L_LOAD_DATE = new ArrayList();
		} else {
			l_L_LOAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_LOAD_DATE.add(((AL0040010Struct) list.get(i)).getL_LOAD_DATE());
		}
		return size;
	}
	public int setL2L_L_LOAD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_LOAD_QTY == null) {
			l_L_LOAD_QTY = new ArrayList();
		} else {
			l_L_LOAD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_LOAD_QTY.add(((AL0040010Struct) list.get(i)).getL_LOAD_QTY());
		}
		return size;
	}
	public int setL2L_L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_ODR_STS_TYP == null) {
			l_L_ODR_STS_TYP = new ArrayList();
		} else {
			l_L_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_ODR_STS_TYP.add(((AL0040010Struct) list.get(i)).getL_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_K_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_K_NECK_PROC_CD == null) {
			l_K_NECK_PROC_CD = new ArrayList();
		} else {
			l_K_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_K_NECK_PROC_CD.add(((AL0040010Struct) list.get(i)).getK_NECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_K_LOAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_K_LOAD_DATE == null) {
			l_K_LOAD_DATE = new ArrayList();
		} else {
			l_K_LOAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_K_LOAD_DATE.add(((AL0040010Struct) list.get(i)).getK_LOAD_DATE());
		}
		return size;
	}
	public int setL2L_L_CHT_DIM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_DIM == null) {
			l_L_CHT_DIM = new ArrayList();
		} else {
			l_L_CHT_DIM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_DIM.add(((AL0040010Struct) list.get(i)).getL_CHT_DIM());
		}
		return size;
	}
	public int setL2L_L_CHT_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_TYPE == null) {
			l_L_CHT_TYPE = new ArrayList();
		} else {
			l_L_CHT_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_TYPE.add(((AL0040010Struct) list.get(i)).getL_CHT_TYPE());
		}
		return size;
	}
	public int setL2L_L_BG_C_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_BG_C_R == null) {
			l_L_BG_C_R = new ArrayList();
		} else {
			l_L_BG_C_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_BG_C_R.add(((AL0040010Struct) list.get(i)).getL_BG_C_R());
		}
		return size;
	}
	public int setL2L_L_BG_C_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_BG_C_G == null) {
			l_L_BG_C_G = new ArrayList();
		} else {
			l_L_BG_C_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_BG_C_G.add(((AL0040010Struct) list.get(i)).getL_BG_C_G());
		}
		return size;
	}
	public int setL2L_L_BG_C_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_BG_C_B == null) {
			l_L_BG_C_B = new ArrayList();
		} else {
			l_L_BG_C_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_BG_C_B.add(((AL0040010Struct) list.get(i)).getL_BG_C_B());
		}
		return size;
	}
	public int setL2L_L_MAX_SCALE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_MAX_SCALE == null) {
			l_L_MAX_SCALE = new ArrayList();
		} else {
			l_L_MAX_SCALE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_MAX_SCALE.add(((AL0040010Struct) list.get(i)).getL_MAX_SCALE());
		}
		return size;
	}
	public int setL2L_L_SCALE_STEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_SCALE_STEP == null) {
			l_L_SCALE_STEP = new ArrayList();
		} else {
			l_L_SCALE_STEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_SCALE_STEP.add(((AL0040010Struct) list.get(i)).getL_SCALE_STEP());
		}
		return size;
	}
	public int setL2L_L_CHT_C0_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C0_R == null) {
			l_L_CHT_C0_R = new ArrayList();
		} else {
			l_L_CHT_C0_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C0_R.add(((AL0040010Struct) list.get(i)).getL_CHT_C0_R());
		}
		return size;
	}
	public int setL2L_L_CHT_C0_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C0_G == null) {
			l_L_CHT_C0_G = new ArrayList();
		} else {
			l_L_CHT_C0_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C0_G.add(((AL0040010Struct) list.get(i)).getL_CHT_C0_G());
		}
		return size;
	}
	public int setL2L_L_CHT_C0_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C0_B == null) {
			l_L_CHT_C0_B = new ArrayList();
		} else {
			l_L_CHT_C0_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C0_B.add(((AL0040010Struct) list.get(i)).getL_CHT_C0_B());
		}
		return size;
	}
	public int setL2L_L_CHT_C1_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C1_R == null) {
			l_L_CHT_C1_R = new ArrayList();
		} else {
			l_L_CHT_C1_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C1_R.add(((AL0040010Struct) list.get(i)).getL_CHT_C1_R());
		}
		return size;
	}
	public int setL2L_L_CHT_C1_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C1_G == null) {
			l_L_CHT_C1_G = new ArrayList();
		} else {
			l_L_CHT_C1_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C1_G.add(((AL0040010Struct) list.get(i)).getL_CHT_C1_G());
		}
		return size;
	}
	public int setL2L_L_CHT_C1_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C1_B == null) {
			l_L_CHT_C1_B = new ArrayList();
		} else {
			l_L_CHT_C1_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C1_B.add(((AL0040010Struct) list.get(i)).getL_CHT_C1_B());
		}
		return size;
	}
	public int setL2L_L_CHT_C2_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C2_R == null) {
			l_L_CHT_C2_R = new ArrayList();
		} else {
			l_L_CHT_C2_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C2_R.add(((AL0040010Struct) list.get(i)).getL_CHT_C2_R());
		}
		return size;
	}
	public int setL2L_L_CHT_C2_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C2_G == null) {
			l_L_CHT_C2_G = new ArrayList();
		} else {
			l_L_CHT_C2_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C2_G.add(((AL0040010Struct) list.get(i)).getL_CHT_C2_G());
		}
		return size;
	}
	public int setL2L_L_CHT_C2_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C2_B == null) {
			l_L_CHT_C2_B = new ArrayList();
		} else {
			l_L_CHT_C2_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C2_B.add(((AL0040010Struct) list.get(i)).getL_CHT_C2_B());
		}
		return size;
	}
	public int setL2L_L_CHT_C9_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C9_R == null) {
			l_L_CHT_C9_R = new ArrayList();
		} else {
			l_L_CHT_C9_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C9_R.add(((AL0040010Struct) list.get(i)).getL_CHT_C9_R());
		}
		return size;
	}
	public int setL2L_L_CHT_C9_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C9_G == null) {
			l_L_CHT_C9_G = new ArrayList();
		} else {
			l_L_CHT_C9_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C9_G.add(((AL0040010Struct) list.get(i)).getL_CHT_C9_G());
		}
		return size;
	}
	public int setL2L_L_CHT_C9_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_CHT_C9_B == null) {
			l_L_CHT_C9_B = new ArrayList();
		} else {
			l_L_CHT_C9_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_CHT_C9_B.add(((AL0040010Struct) list.get(i)).getL_CHT_C9_B());
		}
		return size;
	}
	public int setL2L_L_HIGH_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_HIGH_LOAD == null) {
			l_L_HIGH_LOAD = new ArrayList();
		} else {
			l_L_HIGH_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_HIGH_LOAD.add(((AL0040010Struct) list.get(i)).getL_HIGH_LOAD());
		}
		return size;
	}
	public int setL2L_L_H_LOAD_C_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_H_LOAD_C_R == null) {
			l_L_H_LOAD_C_R = new ArrayList();
		} else {
			l_L_H_LOAD_C_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_H_LOAD_C_R.add(((AL0040010Struct) list.get(i)).getL_H_LOAD_C_R());
		}
		return size;
	}
	public int setL2L_L_H_LOAD_C_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_H_LOAD_C_G == null) {
			l_L_H_LOAD_C_G = new ArrayList();
		} else {
			l_L_H_LOAD_C_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_H_LOAD_C_G.add(((AL0040010Struct) list.get(i)).getL_H_LOAD_C_G());
		}
		return size;
	}
	public int setL2L_L_H_LOAD_C_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_H_LOAD_C_B == null) {
			l_L_H_LOAD_C_B = new ArrayList();
		} else {
			l_L_H_LOAD_C_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_H_LOAD_C_B.add(((AL0040010Struct) list.get(i)).getL_H_LOAD_C_B());
		}
		return size;
	}
	public int setL2L_L_MIDD_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_MIDD_LOAD == null) {
			l_L_MIDD_LOAD = new ArrayList();
		} else {
			l_L_MIDD_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_MIDD_LOAD.add(((AL0040010Struct) list.get(i)).getL_MIDD_LOAD());
		}
		return size;
	}
	public int setL2L_L_M_LOAD_C_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_M_LOAD_C_R == null) {
			l_L_M_LOAD_C_R = new ArrayList();
		} else {
			l_L_M_LOAD_C_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_M_LOAD_C_R.add(((AL0040010Struct) list.get(i)).getL_M_LOAD_C_R());
		}
		return size;
	}
	public int setL2L_L_M_LOAD_C_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_M_LOAD_C_G == null) {
			l_L_M_LOAD_C_G = new ArrayList();
		} else {
			l_L_M_LOAD_C_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_M_LOAD_C_G.add(((AL0040010Struct) list.get(i)).getL_M_LOAD_C_G());
		}
		return size;
	}
	public int setL2L_L_M_LOAD_C_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_M_LOAD_C_B == null) {
			l_L_M_LOAD_C_B = new ArrayList();
		} else {
			l_L_M_LOAD_C_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_M_LOAD_C_B.add(((AL0040010Struct) list.get(i)).getL_M_LOAD_C_B());
		}
		return size;
	}
	public int setL2L_L_LOW_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_LOW_LOAD == null) {
			l_L_LOW_LOAD = new ArrayList();
		} else {
			l_L_LOW_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_LOW_LOAD.add(((AL0040010Struct) list.get(i)).getL_LOW_LOAD());
		}
		return size;
	}
	public int setL2L_L_L_LOAD_C_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_L_LOAD_C_R == null) {
			l_L_L_LOAD_C_R = new ArrayList();
		} else {
			l_L_L_LOAD_C_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_L_LOAD_C_R.add(((AL0040010Struct) list.get(i)).getL_L_LOAD_C_R());
		}
		return size;
	}
	public int setL2L_L_L_LOAD_C_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_L_LOAD_C_G == null) {
			l_L_L_LOAD_C_G = new ArrayList();
		} else {
			l_L_L_LOAD_C_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_L_LOAD_C_G.add(((AL0040010Struct) list.get(i)).getL_L_LOAD_C_G());
		}
		return size;
	}
	public int setL2L_L_L_LOAD_C_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_L_LOAD_C_B == null) {
			l_L_L_LOAD_C_B = new ArrayList();
		} else {
			l_L_L_LOAD_C_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_L_LOAD_C_B.add(((AL0040010Struct) list.get(i)).getL_L_LOAD_C_B());
		}
		return size;
	}
	public int setL2L_LKM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_ITEM_CD == null) {
			l_LKM_ITEM_CD = new ArrayList();
		} else {
			l_LKM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_ITEM_CD.add(((AL0040010Struct) list.get(i)).getLKM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_LKM_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_ITEM_NAME == null) {
			l_LKM_ITEM_NAME = new ArrayList();
		} else {
			l_LKM_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_ITEM_NAME.add(((AL0040010Struct) list.get(i)).getLKM_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_LKM_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_JOB_ODR_CD == null) {
			l_LKM_JOB_ODR_CD = new ArrayList();
		} else {
			l_LKM_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_JOB_ODR_CD.add(((AL0040010Struct) list.get(i)).getLKM_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_LKM_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_ODR_STS_TYP == null) {
			l_LKM_ODR_STS_TYP = new ArrayList();
		} else {
			l_LKM_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_ODR_STS_TYP.add(((AL0040010Struct) list.get(i)).getLKM_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_LKM_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_PRD_START_DATE == null) {
			l_LKM_PRD_START_DATE = new ArrayList();
		} else {
			l_LKM_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_PRD_START_DATE.add(((AL0040010Struct) list.get(i)).getLKM_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_LKM_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_PRD_DUE_DATE == null) {
			l_LKM_PRD_DUE_DATE = new ArrayList();
		} else {
			l_LKM_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_PRD_DUE_DATE.add(((AL0040010Struct) list.get(i)).getLKM_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_LKM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_ODR_QTY == null) {
			l_LKM_ODR_QTY = new ArrayList();
		} else {
			l_LKM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_ODR_QTY.add(((AL0040010Struct) list.get(i)).getLKM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_LKM_TOTAL_RCV_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_TOTAL_RCV_QTY == null) {
			l_LKM_TOTAL_RCV_QTY = new ArrayList();
		} else {
			l_LKM_TOTAL_RCV_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_TOTAL_RCV_QTY.add(((AL0040010Struct) list.get(i)).getLKM_TOTAL_RCV_QTY());
		}
		return size;
	}
	public int setL2L_LKM_UNIT_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_UNIT_LOAD == null) {
			l_LKM_UNIT_LOAD = new ArrayList();
		} else {
			l_LKM_UNIT_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_UNIT_LOAD.add(((AL0040010Struct) list.get(i)).getLKM_UNIT_LOAD());
		}
		return size;
	}
	public int setL2L_LKM_LOAD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_LOAD_QTY == null) {
			l_LKM_LOAD_QTY = new ArrayList();
		} else {
			l_LKM_LOAD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_LOAD_QTY.add(((AL0040010Struct) list.get(i)).getLKM_LOAD_QTY());
		}
		return size;
	}
	public int setL2L_KM_LOAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_KM_LOAD_DATE == null) {
			l_KM_LOAD_DATE = new ArrayList();
		} else {
			l_KM_LOAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_KM_LOAD_DATE.add(((AL0040010Struct) list.get(i)).getKM_LOAD_DATE());
		}
		return size;
	}
	public int setL2L_LKM_SUM_LOAD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_SUM_LOAD_QTY == null) {
			l_LKM_SUM_LOAD_QTY = new ArrayList();
		} else {
			l_LKM_SUM_LOAD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_SUM_LOAD_QTY.add(((AL0040010Struct) list.get(i)).getLKM_SUM_LOAD_QTY());
		}
		return size;
	}
	public int setL2L_LKM_OVR_LOAD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_OVR_LOAD_QTY == null) {
			l_LKM_OVR_LOAD_QTY = new ArrayList();
		} else {
			l_LKM_OVR_LOAD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_OVR_LOAD_QTY.add(((AL0040010Struct) list.get(i)).getLKM_OVR_LOAD_QTY());
		}
		return size;
	}
	public int setL2L_LKM_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_NECK_PROC_CD == null) {
			l_LKM_NECK_PROC_CD = new ArrayList();
		} else {
			l_LKM_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_NECK_PROC_CD.add(((AL0040010Struct) list.get(i)).getLKM_NECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_LKM_LOAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_LOAD_DATE == null) {
			l_LKM_LOAD_DATE = new ArrayList();
		} else {
			l_LKM_LOAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_LOAD_DATE.add(((AL0040010Struct) list.get(i)).getLKM_LOAD_DATE());
		}
		return size;
	}
	public int setL2L_LKM_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_NECK_PROC_NAME == null) {
			l_LKM_NECK_PROC_NAME = new ArrayList();
		} else {
			l_LKM_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_NECK_PROC_NAME.add(((AL0040010Struct) list.get(i)).getLKM_NECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_LKM_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_NECK_PROC_CAPA == null) {
			l_LKM_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_LKM_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_NECK_PROC_CAPA.add(((AL0040010Struct) list.get(i)).getLKM_NECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_LKM_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LKM_NECK_PROC_CAPA_UNIT == null) {
			l_LKM_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_LKM_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LKM_NECK_PROC_CAPA_UNIT.add(((AL0040010Struct) list.get(i)).getLKM_NECK_PROC_CAPA_UNIT());
		}
		return size;
	}
	public int setL2L_FLG1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG1 == null) {
			l_FLG1 = new ArrayList();
		} else {
			l_FLG1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG1.add(((AL0040010Struct) list.get(i)).getFLG1());
		}
		return size;
	}
	public int setL2L_FLG2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG2 == null) {
			l_FLG2 = new ArrayList();
		} else {
			l_FLG2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG2.add(((AL0040010Struct) list.get(i)).getFLG2());
		}
		return size;
	}
	public int setL2L_FLG3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG3 == null) {
			l_FLG3 = new ArrayList();
		} else {
			l_FLG3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG3.add(((AL0040010Struct) list.get(i)).getFLG3());
		}
		return size;
	}
	public int setL2L_FLG4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG4 == null) {
			l_FLG4 = new ArrayList();
		} else {
			l_FLG4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG4.add(((AL0040010Struct) list.get(i)).getFLG4());
		}
		return size;
	}
	public int setL2L_FLG5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG5 == null) {
			l_FLG5 = new ArrayList();
		} else {
			l_FLG5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG5.add(((AL0040010Struct) list.get(i)).getFLG5());
		}
		return size;
	}
	public int setL2L_FLG6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG6 == null) {
			l_FLG6 = new ArrayList();
		} else {
			l_FLG6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG6.add(((AL0040010Struct) list.get(i)).getFLG6());
		}
		return size;
	}
	public int setL2L_FLG7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG7 == null) {
			l_FLG7 = new ArrayList();
		} else {
			l_FLG7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG7.add(((AL0040010Struct) list.get(i)).getFLG7());
		}
		return size;
	}
	public int setL2L_FLG8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG8 == null) {
			l_FLG8 = new ArrayList();
		} else {
			l_FLG8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG8.add(((AL0040010Struct) list.get(i)).getFLG8());
		}
		return size;
	}
	public int setL2L_FLG9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG9 == null) {
			l_FLG9 = new ArrayList();
		} else {
			l_FLG9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG9.add(((AL0040010Struct) list.get(i)).getFLG9());
		}
		return size;
	}
	public int setL2L_FLG10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG10 == null) {
			l_FLG10 = new ArrayList();
		} else {
			l_FLG10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG10.add(((AL0040010Struct) list.get(i)).getFLG10());
		}
		return size;
	}
	public int setL2L_FLG11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG11 == null) {
			l_FLG11 = new ArrayList();
		} else {
			l_FLG11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG11.add(((AL0040010Struct) list.get(i)).getFLG11());
		}
		return size;
	}
	public int setL2L_FLG12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG12 == null) {
			l_FLG12 = new ArrayList();
		} else {
			l_FLG12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG12.add(((AL0040010Struct) list.get(i)).getFLG12());
		}
		return size;
	}
	public int setL2L_FLG13(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG13 == null) {
			l_FLG13 = new ArrayList();
		} else {
			l_FLG13.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG13.add(((AL0040010Struct) list.get(i)).getFLG13());
		}
		return size;
	}
	public int setL2L_FLG14(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG14 == null) {
			l_FLG14 = new ArrayList();
		} else {
			l_FLG14.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG14.add(((AL0040010Struct) list.get(i)).getFLG14());
		}
		return size;
	}
	public int setL2L_FLG15(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG15 == null) {
			l_FLG15 = new ArrayList();
		} else {
			l_FLG15.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG15.add(((AL0040010Struct) list.get(i)).getFLG15());
		}
		return size;
	}
	public int setL2L_FLG16(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG16 == null) {
			l_FLG16 = new ArrayList();
		} else {
			l_FLG16.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG16.add(((AL0040010Struct) list.get(i)).getFLG16());
		}
		return size;
	}
	public int setL2L_FLG17(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG17 == null) {
			l_FLG17 = new ArrayList();
		} else {
			l_FLG17.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG17.add(((AL0040010Struct) list.get(i)).getFLG17());
		}
		return size;
	}
	public int setL2L_FLG18(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG18 == null) {
			l_FLG18 = new ArrayList();
		} else {
			l_FLG18.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG18.add(((AL0040010Struct) list.get(i)).getFLG18());
		}
		return size;
	}
	public int setL2L_FLG19(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG19 == null) {
			l_FLG19 = new ArrayList();
		} else {
			l_FLG19.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG19.add(((AL0040010Struct) list.get(i)).getFLG19());
		}
		return size;
	}
	public int setL2L_FLG20(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG20 == null) {
			l_FLG20 = new ArrayList();
		} else {
			l_FLG20.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG20.add(((AL0040010Struct) list.get(i)).getFLG20());
		}
		return size;
	}
	public int setL2L_FLG21(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG21 == null) {
			l_FLG21 = new ArrayList();
		} else {
			l_FLG21.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG21.add(((AL0040010Struct) list.get(i)).getFLG21());
		}
		return size;
	}
	public int setL2L_FLG22(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG22 == null) {
			l_FLG22 = new ArrayList();
		} else {
			l_FLG22.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG22.add(((AL0040010Struct) list.get(i)).getFLG22());
		}
		return size;
	}
	public int setL2L_FLG23(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG23 == null) {
			l_FLG23 = new ArrayList();
		} else {
			l_FLG23.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG23.add(((AL0040010Struct) list.get(i)).getFLG23());
		}
		return size;
	}
	public int setL2L_FLG24(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG24 == null) {
			l_FLG24 = new ArrayList();
		} else {
			l_FLG24.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG24.add(((AL0040010Struct) list.get(i)).getFLG24());
		}
		return size;
	}
	public int setL2L_FLG25(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG25 == null) {
			l_FLG25 = new ArrayList();
		} else {
			l_FLG25.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG25.add(((AL0040010Struct) list.get(i)).getFLG25());
		}
		return size;
	}
	public int setL2L_FLG26(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG26 == null) {
			l_FLG26 = new ArrayList();
		} else {
			l_FLG26.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG26.add(((AL0040010Struct) list.get(i)).getFLG26());
		}
		return size;
	}
	public int setL2L_FLG27(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG27 == null) {
			l_FLG27 = new ArrayList();
		} else {
			l_FLG27.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG27.add(((AL0040010Struct) list.get(i)).getFLG27());
		}
		return size;
	}
	public int setL2L_FLG28(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG28 == null) {
			l_FLG28 = new ArrayList();
		} else {
			l_FLG28.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG28.add(((AL0040010Struct) list.get(i)).getFLG28());
		}
		return size;
	}
	public int setL2L_FLG29(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG29 == null) {
			l_FLG29 = new ArrayList();
		} else {
			l_FLG29.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG29.add(((AL0040010Struct) list.get(i)).getFLG29());
		}
		return size;
	}
	public int setL2L_FLG30(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG30 == null) {
			l_FLG30 = new ArrayList();
		} else {
			l_FLG30.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG30.add(((AL0040010Struct) list.get(i)).getFLG30());
		}
		return size;
	}
	public int setL2L_FLG31(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG31 == null) {
			l_FLG31 = new ArrayList();
		} else {
			l_FLG31.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG31.add(((AL0040010Struct) list.get(i)).getFLG31());
		}
		return size;
	}
	public int setL2L_FLG32(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG32 == null) {
			l_FLG32 = new ArrayList();
		} else {
			l_FLG32.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG32.add(((AL0040010Struct) list.get(i)).getFLG32());
		}
		return size;
	}
	public int setL2L_FLG33(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG33 == null) {
			l_FLG33 = new ArrayList();
		} else {
			l_FLG33.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG33.add(((AL0040010Struct) list.get(i)).getFLG33());
		}
		return size;
	}
	public int setL2L_FLG34(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG34 == null) {
			l_FLG34 = new ArrayList();
		} else {
			l_FLG34.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG34.add(((AL0040010Struct) list.get(i)).getFLG34());
		}
		return size;
	}
	public int setL2L_FLG35(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG35 == null) {
			l_FLG35 = new ArrayList();
		} else {
			l_FLG35.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG35.add(((AL0040010Struct) list.get(i)).getFLG35());
		}
		return size;
	}
	public int setL2L_FLG36(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG36 == null) {
			l_FLG36 = new ArrayList();
		} else {
			l_FLG36.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG36.add(((AL0040010Struct) list.get(i)).getFLG36());
		}
		return size;
	}
	public int setL2L_FLG37(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG37 == null) {
			l_FLG37 = new ArrayList();
		} else {
			l_FLG37.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG37.add(((AL0040010Struct) list.get(i)).getFLG37());
		}
		return size;
	}
	public int setL2L_FLG38(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG38 == null) {
			l_FLG38 = new ArrayList();
		} else {
			l_FLG38.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG38.add(((AL0040010Struct) list.get(i)).getFLG38());
		}
		return size;
	}
	public int setL2L_FLG39(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG39 == null) {
			l_FLG39 = new ArrayList();
		} else {
			l_FLG39.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG39.add(((AL0040010Struct) list.get(i)).getFLG39());
		}
		return size;
	}
	public int setL2L_FLG40(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG40 == null) {
			l_FLG40 = new ArrayList();
		} else {
			l_FLG40.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG40.add(((AL0040010Struct) list.get(i)).getFLG40());
		}
		return size;
	}
	public int setL2L_FLG41(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG41 == null) {
			l_FLG41 = new ArrayList();
		} else {
			l_FLG41.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG41.add(((AL0040010Struct) list.get(i)).getFLG41());
		}
		return size;
	}
	public int setL2L_FLG42(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG42 == null) {
			l_FLG42 = new ArrayList();
		} else {
			l_FLG42.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG42.add(((AL0040010Struct) list.get(i)).getFLG42());
		}
		return size;
	}
	public int setL2L_FLG43(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG43 == null) {
			l_FLG43 = new ArrayList();
		} else {
			l_FLG43.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG43.add(((AL0040010Struct) list.get(i)).getFLG43());
		}
		return size;
	}
	public int setL2L_FLG44(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG44 == null) {
			l_FLG44 = new ArrayList();
		} else {
			l_FLG44.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG44.add(((AL0040010Struct) list.get(i)).getFLG44());
		}
		return size;
	}
	public int setL2L_FLG45(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG45 == null) {
			l_FLG45 = new ArrayList();
		} else {
			l_FLG45.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG45.add(((AL0040010Struct) list.get(i)).getFLG45());
		}
		return size;
	}
	public int setL2L_FLG46(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG46 == null) {
			l_FLG46 = new ArrayList();
		} else {
			l_FLG46.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG46.add(((AL0040010Struct) list.get(i)).getFLG46());
		}
		return size;
	}
	public int setL2L_FLG47(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG47 == null) {
			l_FLG47 = new ArrayList();
		} else {
			l_FLG47.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG47.add(((AL0040010Struct) list.get(i)).getFLG47());
		}
		return size;
	}
	public int setL2L_FLG48(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG48 == null) {
			l_FLG48 = new ArrayList();
		} else {
			l_FLG48.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG48.add(((AL0040010Struct) list.get(i)).getFLG48());
		}
		return size;
	}
	public int setL2L_FLG49(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG49 == null) {
			l_FLG49 = new ArrayList();
		} else {
			l_FLG49.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG49.add(((AL0040010Struct) list.get(i)).getFLG49());
		}
		return size;
	}
	public int setL2L_FLG50(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG50 == null) {
			l_FLG50 = new ArrayList();
		} else {
			l_FLG50.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG50.add(((AL0040010Struct) list.get(i)).getFLG50());
		}
		return size;
	}
	public int setL2L_FLG51(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG51 == null) {
			l_FLG51 = new ArrayList();
		} else {
			l_FLG51.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG51.add(((AL0040010Struct) list.get(i)).getFLG51());
		}
		return size;
	}
	public int setL2L_FLG52(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG52 == null) {
			l_FLG52 = new ArrayList();
		} else {
			l_FLG52.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG52.add(((AL0040010Struct) list.get(i)).getFLG52());
		}
		return size;
	}
	public int setL2L_FLG53(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG53 == null) {
			l_FLG53 = new ArrayList();
		} else {
			l_FLG53.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG53.add(((AL0040010Struct) list.get(i)).getFLG53());
		}
		return size;
	}
	public int setL2L_FLG54(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG54 == null) {
			l_FLG54 = new ArrayList();
		} else {
			l_FLG54.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG54.add(((AL0040010Struct) list.get(i)).getFLG54());
		}
		return size;
	}
	public int setL2L_FLG55(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG55 == null) {
			l_FLG55 = new ArrayList();
		} else {
			l_FLG55.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG55.add(((AL0040010Struct) list.get(i)).getFLG55());
		}
		return size;
	}
	public int setL2L_FLG56(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG56 == null) {
			l_FLG56 = new ArrayList();
		} else {
			l_FLG56.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG56.add(((AL0040010Struct) list.get(i)).getFLG56());
		}
		return size;
	}
	public int setL2L_FLG57(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG57 == null) {
			l_FLG57 = new ArrayList();
		} else {
			l_FLG57.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG57.add(((AL0040010Struct) list.get(i)).getFLG57());
		}
		return size;
	}
	public int setL2L_FLG58(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG58 == null) {
			l_FLG58 = new ArrayList();
		} else {
			l_FLG58.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG58.add(((AL0040010Struct) list.get(i)).getFLG58());
		}
		return size;
	}
	public int setL2L_FLG59(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG59 == null) {
			l_FLG59 = new ArrayList();
		} else {
			l_FLG59.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG59.add(((AL0040010Struct) list.get(i)).getFLG59());
		}
		return size;
	}
	public int setL2L_FLG60(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG60 == null) {
			l_FLG60 = new ArrayList();
		} else {
			l_FLG60.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG60.add(((AL0040010Struct) list.get(i)).getFLG60());
		}
		return size;
	}
	public int setL2L_FLG61(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG61 == null) {
			l_FLG61 = new ArrayList();
		} else {
			l_FLG61.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG61.add(((AL0040010Struct) list.get(i)).getFLG61());
		}
		return size;
	}
	public int setL2L_FLG62(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG62 == null) {
			l_FLG62 = new ArrayList();
		} else {
			l_FLG62.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG62.add(((AL0040010Struct) list.get(i)).getFLG62());
		}
		return size;
	}
	public int setL2L_FLG63(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG63 == null) {
			l_FLG63 = new ArrayList();
		} else {
			l_FLG63.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG63.add(((AL0040010Struct) list.get(i)).getFLG63());
		}
		return size;
	}
	public int setL2L_FLG64(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG64 == null) {
			l_FLG64 = new ArrayList();
		} else {
			l_FLG64.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG64.add(((AL0040010Struct) list.get(i)).getFLG64());
		}
		return size;
	}
	public int setL2L_FLG65(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG65 == null) {
			l_FLG65 = new ArrayList();
		} else {
			l_FLG65.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG65.add(((AL0040010Struct) list.get(i)).getFLG65());
		}
		return size;
	}
	public int setL2L_FLG66(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG66 == null) {
			l_FLG66 = new ArrayList();
		} else {
			l_FLG66.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG66.add(((AL0040010Struct) list.get(i)).getFLG66());
		}
		return size;
	}
	public int setL2L_FLG67(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG67 == null) {
			l_FLG67 = new ArrayList();
		} else {
			l_FLG67.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG67.add(((AL0040010Struct) list.get(i)).getFLG67());
		}
		return size;
	}
	public int setL2L_FLG68(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG68 == null) {
			l_FLG68 = new ArrayList();
		} else {
			l_FLG68.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG68.add(((AL0040010Struct) list.get(i)).getFLG68());
		}
		return size;
	}
	public int setL2L_FLG69(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG69 == null) {
			l_FLG69 = new ArrayList();
		} else {
			l_FLG69.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG69.add(((AL0040010Struct) list.get(i)).getFLG69());
		}
		return size;
	}
	public int setL2L_FLG70(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG70 == null) {
			l_FLG70 = new ArrayList();
		} else {
			l_FLG70.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG70.add(((AL0040010Struct) list.get(i)).getFLG70());
		}
		return size;
	}
	public int setL2L_FLG71(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG71 == null) {
			l_FLG71 = new ArrayList();
		} else {
			l_FLG71.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG71.add(((AL0040010Struct) list.get(i)).getFLG71());
		}
		return size;
	}
	public int setL2L_FLG72(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG72 == null) {
			l_FLG72 = new ArrayList();
		} else {
			l_FLG72.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG72.add(((AL0040010Struct) list.get(i)).getFLG72());
		}
		return size;
	}
	public int setL2L_FLG73(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG73 == null) {
			l_FLG73 = new ArrayList();
		} else {
			l_FLG73.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG73.add(((AL0040010Struct) list.get(i)).getFLG73());
		}
		return size;
	}
	public int setL2L_FLG74(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG74 == null) {
			l_FLG74 = new ArrayList();
		} else {
			l_FLG74.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG74.add(((AL0040010Struct) list.get(i)).getFLG74());
		}
		return size;
	}
	public int setL2L_FLG75(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG75 == null) {
			l_FLG75 = new ArrayList();
		} else {
			l_FLG75.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG75.add(((AL0040010Struct) list.get(i)).getFLG75());
		}
		return size;
	}
	public int setL2L_FLG76(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG76 == null) {
			l_FLG76 = new ArrayList();
		} else {
			l_FLG76.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG76.add(((AL0040010Struct) list.get(i)).getFLG76());
		}
		return size;
	}
	public int setL2L_FLG77(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG77 == null) {
			l_FLG77 = new ArrayList();
		} else {
			l_FLG77.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG77.add(((AL0040010Struct) list.get(i)).getFLG77());
		}
		return size;
	}
	public int setL2L_FLG78(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG78 == null) {
			l_FLG78 = new ArrayList();
		} else {
			l_FLG78.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG78.add(((AL0040010Struct) list.get(i)).getFLG78());
		}
		return size;
	}
	public int setL2L_FLG79(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG79 == null) {
			l_FLG79 = new ArrayList();
		} else {
			l_FLG79.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG79.add(((AL0040010Struct) list.get(i)).getFLG79());
		}
		return size;
	}
	public int setL2L_FLG80(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG80 == null) {
			l_FLG80 = new ArrayList();
		} else {
			l_FLG80.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG80.add(((AL0040010Struct) list.get(i)).getFLG80());
		}
		return size;
	}
	public int setL2L_FLG81(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG81 == null) {
			l_FLG81 = new ArrayList();
		} else {
			l_FLG81.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG81.add(((AL0040010Struct) list.get(i)).getFLG81());
		}
		return size;
	}
	public int setL2L_FLG82(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG82 == null) {
			l_FLG82 = new ArrayList();
		} else {
			l_FLG82.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG82.add(((AL0040010Struct) list.get(i)).getFLG82());
		}
		return size;
	}
	public int setL2L_FLG83(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG83 == null) {
			l_FLG83 = new ArrayList();
		} else {
			l_FLG83.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG83.add(((AL0040010Struct) list.get(i)).getFLG83());
		}
		return size;
	}
	public int setL2L_FLG84(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG84 == null) {
			l_FLG84 = new ArrayList();
		} else {
			l_FLG84.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG84.add(((AL0040010Struct) list.get(i)).getFLG84());
		}
		return size;
	}
	public int setL2L_FLG85(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG85 == null) {
			l_FLG85 = new ArrayList();
		} else {
			l_FLG85.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG85.add(((AL0040010Struct) list.get(i)).getFLG85());
		}
		return size;
	}
	public int setL2L_FLG86(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG86 == null) {
			l_FLG86 = new ArrayList();
		} else {
			l_FLG86.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG86.add(((AL0040010Struct) list.get(i)).getFLG86());
		}
		return size;
	}
	public int setL2L_FLG87(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG87 == null) {
			l_FLG87 = new ArrayList();
		} else {
			l_FLG87.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG87.add(((AL0040010Struct) list.get(i)).getFLG87());
		}
		return size;
	}
	public int setL2L_FLG88(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG88 == null) {
			l_FLG88 = new ArrayList();
		} else {
			l_FLG88.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG88.add(((AL0040010Struct) list.get(i)).getFLG88());
		}
		return size;
	}
	public int setL2L_FLG89(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG89 == null) {
			l_FLG89 = new ArrayList();
		} else {
			l_FLG89.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG89.add(((AL0040010Struct) list.get(i)).getFLG89());
		}
		return size;
	}
	public int setL2L_FLG90(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FLG90 == null) {
			l_FLG90 = new ArrayList();
		} else {
			l_FLG90.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FLG90.add(((AL0040010Struct) list.get(i)).getFLG90());
		}
		return size;
	}
	public int setL2L_L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_NECK_PROC_NAME == null) {
			l_L_NECK_PROC_NAME = new ArrayList();
		} else {
			l_L_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_NECK_PROC_NAME.add(((AL0040010Struct) list.get(i)).getL_NECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_L_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_NECK_PROC_CAPA == null) {
			l_L_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_L_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_NECK_PROC_CAPA.add(((AL0040010Struct) list.get(i)).getL_NECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_L_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_NECK_PROC_CAPA_UNIT == null) {
			l_L_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_L_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_NECK_PROC_CAPA_UNIT.add(((AL0040010Struct) list.get(i)).getL_NECK_PROC_CAPA_UNIT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_Shift_Date = null;
		m_hidden_High_Color = null;
		m_hidden_Midd_Color = null;
		m_hidden_Low_Color = null;
		m_hidden_DateFrom = null;
		m_hidden_DateTo = null;
		m_S_LOAD_DATE = null;
		m_w_AlInstalledFlg = null;
		m_NECK_PROC_NAME = null;
		m_NECK_PROC_CD = null;
		m_LOAD_QTY1 = null;
		m_LOAD_QTY2 = null;
		m_LOAD_QTY3 = null;
		m_LOAD_QTY4 = null;
		m_LOAD_QTY5 = null;
		m_LOAD_QTY6 = null;
		m_LOAD_QTY7 = null;
		m_LOAD_QTY8 = null;
		m_LOAD_QTY9 = null;
		m_LOAD_QTY10 = null;
		m_LOAD_QTY11 = null;
		m_LOAD_QTY12 = null;
		m_LOAD_QTY13 = null;
		m_LOAD_QTY14 = null;
		m_LOAD_QTY15 = null;
		m_LOAD_QTY16 = null;
		m_LOAD_QTY17 = null;
		m_LOAD_QTY18 = null;
		m_LOAD_QTY19 = null;
		m_LOAD_QTY20 = null;
		m_LOAD_QTY21 = null;
		m_LOAD_QTY22 = null;
		m_LOAD_QTY23 = null;
		m_LOAD_QTY24 = null;
		m_LOAD_QTY25 = null;
		m_LOAD_QTY26 = null;
		m_LOAD_QTY27 = null;
		m_LOAD_QTY28 = null;
		m_LOAD_QTY29 = null;
		m_LOAD_QTY30 = null;
		m_LOAD_QTY31 = null;
		m_LOAD_QTY32 = null;
		m_LOAD_QTY33 = null;
		m_LOAD_QTY34 = null;
		m_LOAD_QTY35 = null;
		m_LOAD_QTY36 = null;
		m_LOAD_QTY37 = null;
		m_LOAD_QTY38 = null;
		m_LOAD_QTY39 = null;
		m_LOAD_QTY40 = null;
		m_LOAD_QTY41 = null;
		m_LOAD_QTY42 = null;
		m_LOAD_QTY43 = null;
		m_LOAD_QTY44 = null;
		m_LOAD_QTY45 = null;
		m_LOAD_QTY46 = null;
		m_LOAD_QTY47 = null;
		m_LOAD_QTY48 = null;
		m_LOAD_QTY49 = null;
		m_LOAD_QTY50 = null;
		m_LOAD_QTY51 = null;
		m_LOAD_QTY52 = null;
		m_LOAD_QTY53 = null;
		m_LOAD_QTY54 = null;
		m_LOAD_QTY55 = null;
		m_LOAD_QTY56 = null;
		m_LOAD_QTY57 = null;
		m_LOAD_QTY58 = null;
		m_LOAD_QTY59 = null;
		m_LOAD_QTY60 = null;
		m_LOAD_QTY61 = null;
		m_LOAD_QTY62 = null;
		m_LOAD_QTY63 = null;
		m_LOAD_QTY64 = null;
		m_LOAD_QTY65 = null;
		m_LOAD_QTY66 = null;
		m_LOAD_QTY67 = null;
		m_LOAD_QTY68 = null;
		m_LOAD_QTY69 = null;
		m_LOAD_QTY70 = null;
		m_LOAD_QTY71 = null;
		m_LOAD_QTY72 = null;
		m_LOAD_QTY73 = null;
		m_LOAD_QTY74 = null;
		m_LOAD_QTY75 = null;
		m_LOAD_QTY76 = null;
		m_LOAD_QTY77 = null;
		m_LOAD_QTY78 = null;
		m_LOAD_QTY79 = null;
		m_LOAD_QTY80 = null;
		m_LOAD_QTY81 = null;
		m_LOAD_QTY82 = null;
		m_LOAD_QTY83 = null;
		m_LOAD_QTY84 = null;
		m_LOAD_QTY85 = null;
		m_LOAD_QTY86 = null;
		m_LOAD_QTY87 = null;
		m_LOAD_QTY88 = null;
		m_LOAD_QTY89 = null;
		m_LOAD_QTY90 = null;
		m_DateFrom = null;
		m_DateTo = null;
		m_K_PLANT_CD = null;
		m_CAL_DATE = null;
		m_Holiday_Flg = null;
		m_L_NECK_PROC_CD = null;
		m_L_LOAD_DATE = null;
		m_L_LOAD_QTY = null;
		m_L_ODR_STS_TYP = null;
		m_K_NECK_PROC_CD = null;
		m_K_LOAD_DATE = null;
		m_L_CHT_DIM = null;
		m_L_CHT_TYPE = null;
		m_L_BG_C_R = null;
		m_L_BG_C_G = null;
		m_L_BG_C_B = null;
		m_L_MAX_SCALE = null;
		m_L_SCALE_STEP = null;
		m_L_CHT_C0_R = null;
		m_L_CHT_C0_G = null;
		m_L_CHT_C0_B = null;
		m_L_CHT_C1_R = null;
		m_L_CHT_C1_G = null;
		m_L_CHT_C1_B = null;
		m_L_CHT_C2_R = null;
		m_L_CHT_C2_G = null;
		m_L_CHT_C2_B = null;
		m_L_CHT_C9_R = null;
		m_L_CHT_C9_G = null;
		m_L_CHT_C9_B = null;
		m_L_HIGH_LOAD = null;
		m_L_H_LOAD_C_R = null;
		m_L_H_LOAD_C_G = null;
		m_L_H_LOAD_C_B = null;
		m_L_MIDD_LOAD = null;
		m_L_M_LOAD_C_R = null;
		m_L_M_LOAD_C_G = null;
		m_L_M_LOAD_C_B = null;
		m_L_LOW_LOAD = null;
		m_L_L_LOAD_C_R = null;
		m_L_L_LOAD_C_G = null;
		m_L_L_LOAD_C_B = null;
		m_LKM_ITEM_CD = null;
		m_LKM_ITEM_NAME = null;
		m_LKM_JOB_ODR_CD = null;
		m_LKM_ODR_STS_TYP = null;
		m_LKM_PRD_START_DATE = null;
		m_LKM_PRD_DUE_DATE = null;
		m_LKM_ODR_QTY = null;
		m_LKM_TOTAL_RCV_QTY = null;
		m_LKM_UNIT_LOAD = null;
		m_LKM_LOAD_QTY = null;
		m_KM_LOAD_DATE = null;
		m_LKM_SUM_LOAD_QTY = null;
		m_LKM_OVR_LOAD_QTY = null;
		m_LKM_NECK_PROC_CD = null;
		m_LKM_LOAD_DATE = null;
		m_LKM_NECK_PROC_NAME = null;
		m_LKM_NECK_PROC_CAPA = null;
		m_LKM_NECK_PROC_CAPA_UNIT = null;
		m_FLG1 = null;
		m_FLG2 = null;
		m_FLG3 = null;
		m_FLG4 = null;
		m_FLG5 = null;
		m_FLG6 = null;
		m_FLG7 = null;
		m_FLG8 = null;
		m_FLG9 = null;
		m_FLG10 = null;
		m_FLG11 = null;
		m_FLG12 = null;
		m_FLG13 = null;
		m_FLG14 = null;
		m_FLG15 = null;
		m_FLG16 = null;
		m_FLG17 = null;
		m_FLG18 = null;
		m_FLG19 = null;
		m_FLG20 = null;
		m_FLG21 = null;
		m_FLG22 = null;
		m_FLG23 = null;
		m_FLG24 = null;
		m_FLG25 = null;
		m_FLG26 = null;
		m_FLG27 = null;
		m_FLG28 = null;
		m_FLG29 = null;
		m_FLG30 = null;
		m_FLG31 = null;
		m_FLG32 = null;
		m_FLG33 = null;
		m_FLG34 = null;
		m_FLG35 = null;
		m_FLG36 = null;
		m_FLG37 = null;
		m_FLG38 = null;
		m_FLG39 = null;
		m_FLG40 = null;
		m_FLG41 = null;
		m_FLG42 = null;
		m_FLG43 = null;
		m_FLG44 = null;
		m_FLG45 = null;
		m_FLG46 = null;
		m_FLG47 = null;
		m_FLG48 = null;
		m_FLG49 = null;
		m_FLG50 = null;
		m_FLG51 = null;
		m_FLG52 = null;
		m_FLG53 = null;
		m_FLG54 = null;
		m_FLG55 = null;
		m_FLG56 = null;
		m_FLG57 = null;
		m_FLG58 = null;
		m_FLG59 = null;
		m_FLG60 = null;
		m_FLG61 = null;
		m_FLG62 = null;
		m_FLG63 = null;
		m_FLG64 = null;
		m_FLG65 = null;
		m_FLG66 = null;
		m_FLG67 = null;
		m_FLG68 = null;
		m_FLG69 = null;
		m_FLG70 = null;
		m_FLG71 = null;
		m_FLG72 = null;
		m_FLG73 = null;
		m_FLG74 = null;
		m_FLG75 = null;
		m_FLG76 = null;
		m_FLG77 = null;
		m_FLG78 = null;
		m_FLG79 = null;
		m_FLG80 = null;
		m_FLG81 = null;
		m_FLG82 = null;
		m_FLG83 = null;
		m_FLG84 = null;
		m_FLG85 = null;
		m_FLG86 = null;
		m_FLG87 = null;
		m_FLG88 = null;
		m_FLG89 = null;
		m_FLG90 = null;
		m_L_NECK_PROC_NAME = null;
		m_L_NECK_PROC_CAPA = null;
		m_L_NECK_PROC_CAPA_UNIT = null;

		l_Shift_Date = null;
		l_hidden_High_Color = null;
		l_hidden_Midd_Color = null;
		l_hidden_Low_Color = null;
		l_hidden_DateFrom = null;
		l_hidden_DateTo = null;
		l_S_LOAD_DATE = null;
		l_w_AlInstalledFlg = null;
		l_NECK_PROC_NAME = null;
		l_NECK_PROC_CD = null;
		l_LOAD_QTY1 = null;
		l_LOAD_QTY2 = null;
		l_LOAD_QTY3 = null;
		l_LOAD_QTY4 = null;
		l_LOAD_QTY5 = null;
		l_LOAD_QTY6 = null;
		l_LOAD_QTY7 = null;
		l_LOAD_QTY8 = null;
		l_LOAD_QTY9 = null;
		l_LOAD_QTY10 = null;
		l_LOAD_QTY11 = null;
		l_LOAD_QTY12 = null;
		l_LOAD_QTY13 = null;
		l_LOAD_QTY14 = null;
		l_LOAD_QTY15 = null;
		l_LOAD_QTY16 = null;
		l_LOAD_QTY17 = null;
		l_LOAD_QTY18 = null;
		l_LOAD_QTY19 = null;
		l_LOAD_QTY20 = null;
		l_LOAD_QTY21 = null;
		l_LOAD_QTY22 = null;
		l_LOAD_QTY23 = null;
		l_LOAD_QTY24 = null;
		l_LOAD_QTY25 = null;
		l_LOAD_QTY26 = null;
		l_LOAD_QTY27 = null;
		l_LOAD_QTY28 = null;
		l_LOAD_QTY29 = null;
		l_LOAD_QTY30 = null;
		l_LOAD_QTY31 = null;
		l_LOAD_QTY32 = null;
		l_LOAD_QTY33 = null;
		l_LOAD_QTY34 = null;
		l_LOAD_QTY35 = null;
		l_LOAD_QTY36 = null;
		l_LOAD_QTY37 = null;
		l_LOAD_QTY38 = null;
		l_LOAD_QTY39 = null;
		l_LOAD_QTY40 = null;
		l_LOAD_QTY41 = null;
		l_LOAD_QTY42 = null;
		l_LOAD_QTY43 = null;
		l_LOAD_QTY44 = null;
		l_LOAD_QTY45 = null;
		l_LOAD_QTY46 = null;
		l_LOAD_QTY47 = null;
		l_LOAD_QTY48 = null;
		l_LOAD_QTY49 = null;
		l_LOAD_QTY50 = null;
		l_LOAD_QTY51 = null;
		l_LOAD_QTY52 = null;
		l_LOAD_QTY53 = null;
		l_LOAD_QTY54 = null;
		l_LOAD_QTY55 = null;
		l_LOAD_QTY56 = null;
		l_LOAD_QTY57 = null;
		l_LOAD_QTY58 = null;
		l_LOAD_QTY59 = null;
		l_LOAD_QTY60 = null;
		l_LOAD_QTY61 = null;
		l_LOAD_QTY62 = null;
		l_LOAD_QTY63 = null;
		l_LOAD_QTY64 = null;
		l_LOAD_QTY65 = null;
		l_LOAD_QTY66 = null;
		l_LOAD_QTY67 = null;
		l_LOAD_QTY68 = null;
		l_LOAD_QTY69 = null;
		l_LOAD_QTY70 = null;
		l_LOAD_QTY71 = null;
		l_LOAD_QTY72 = null;
		l_LOAD_QTY73 = null;
		l_LOAD_QTY74 = null;
		l_LOAD_QTY75 = null;
		l_LOAD_QTY76 = null;
		l_LOAD_QTY77 = null;
		l_LOAD_QTY78 = null;
		l_LOAD_QTY79 = null;
		l_LOAD_QTY80 = null;
		l_LOAD_QTY81 = null;
		l_LOAD_QTY82 = null;
		l_LOAD_QTY83 = null;
		l_LOAD_QTY84 = null;
		l_LOAD_QTY85 = null;
		l_LOAD_QTY86 = null;
		l_LOAD_QTY87 = null;
		l_LOAD_QTY88 = null;
		l_LOAD_QTY89 = null;
		l_LOAD_QTY90 = null;
		l_DateFrom = null;
		l_DateTo = null;
		l_K_PLANT_CD = null;
		l_CAL_DATE = null;
		l_Holiday_Flg = null;
		l_L_NECK_PROC_CD = null;
		l_L_LOAD_DATE = null;
		l_L_LOAD_QTY = null;
		l_L_ODR_STS_TYP = null;
		l_K_NECK_PROC_CD = null;
		l_K_LOAD_DATE = null;
		l_L_CHT_DIM = null;
		l_L_CHT_TYPE = null;
		l_L_BG_C_R = null;
		l_L_BG_C_G = null;
		l_L_BG_C_B = null;
		l_L_MAX_SCALE = null;
		l_L_SCALE_STEP = null;
		l_L_CHT_C0_R = null;
		l_L_CHT_C0_G = null;
		l_L_CHT_C0_B = null;
		l_L_CHT_C1_R = null;
		l_L_CHT_C1_G = null;
		l_L_CHT_C1_B = null;
		l_L_CHT_C2_R = null;
		l_L_CHT_C2_G = null;
		l_L_CHT_C2_B = null;
		l_L_CHT_C9_R = null;
		l_L_CHT_C9_G = null;
		l_L_CHT_C9_B = null;
		l_L_HIGH_LOAD = null;
		l_L_H_LOAD_C_R = null;
		l_L_H_LOAD_C_G = null;
		l_L_H_LOAD_C_B = null;
		l_L_MIDD_LOAD = null;
		l_L_M_LOAD_C_R = null;
		l_L_M_LOAD_C_G = null;
		l_L_M_LOAD_C_B = null;
		l_L_LOW_LOAD = null;
		l_L_L_LOAD_C_R = null;
		l_L_L_LOAD_C_G = null;
		l_L_L_LOAD_C_B = null;
		l_LKM_ITEM_CD = null;
		l_LKM_ITEM_NAME = null;
		l_LKM_JOB_ODR_CD = null;
		l_LKM_ODR_STS_TYP = null;
		l_LKM_PRD_START_DATE = null;
		l_LKM_PRD_DUE_DATE = null;
		l_LKM_ODR_QTY = null;
		l_LKM_TOTAL_RCV_QTY = null;
		l_LKM_UNIT_LOAD = null;
		l_LKM_LOAD_QTY = null;
		l_KM_LOAD_DATE = null;
		l_LKM_SUM_LOAD_QTY = null;
		l_LKM_OVR_LOAD_QTY = null;
		l_LKM_NECK_PROC_CD = null;
		l_LKM_LOAD_DATE = null;
		l_LKM_NECK_PROC_NAME = null;
		l_LKM_NECK_PROC_CAPA = null;
		l_LKM_NECK_PROC_CAPA_UNIT = null;
		l_FLG1 = null;
		l_FLG2 = null;
		l_FLG3 = null;
		l_FLG4 = null;
		l_FLG5 = null;
		l_FLG6 = null;
		l_FLG7 = null;
		l_FLG8 = null;
		l_FLG9 = null;
		l_FLG10 = null;
		l_FLG11 = null;
		l_FLG12 = null;
		l_FLG13 = null;
		l_FLG14 = null;
		l_FLG15 = null;
		l_FLG16 = null;
		l_FLG17 = null;
		l_FLG18 = null;
		l_FLG19 = null;
		l_FLG20 = null;
		l_FLG21 = null;
		l_FLG22 = null;
		l_FLG23 = null;
		l_FLG24 = null;
		l_FLG25 = null;
		l_FLG26 = null;
		l_FLG27 = null;
		l_FLG28 = null;
		l_FLG29 = null;
		l_FLG30 = null;
		l_FLG31 = null;
		l_FLG32 = null;
		l_FLG33 = null;
		l_FLG34 = null;
		l_FLG35 = null;
		l_FLG36 = null;
		l_FLG37 = null;
		l_FLG38 = null;
		l_FLG39 = null;
		l_FLG40 = null;
		l_FLG41 = null;
		l_FLG42 = null;
		l_FLG43 = null;
		l_FLG44 = null;
		l_FLG45 = null;
		l_FLG46 = null;
		l_FLG47 = null;
		l_FLG48 = null;
		l_FLG49 = null;
		l_FLG50 = null;
		l_FLG51 = null;
		l_FLG52 = null;
		l_FLG53 = null;
		l_FLG54 = null;
		l_FLG55 = null;
		l_FLG56 = null;
		l_FLG57 = null;
		l_FLG58 = null;
		l_FLG59 = null;
		l_FLG60 = null;
		l_FLG61 = null;
		l_FLG62 = null;
		l_FLG63 = null;
		l_FLG64 = null;
		l_FLG65 = null;
		l_FLG66 = null;
		l_FLG67 = null;
		l_FLG68 = null;
		l_FLG69 = null;
		l_FLG70 = null;
		l_FLG71 = null;
		l_FLG72 = null;
		l_FLG73 = null;
		l_FLG74 = null;
		l_FLG75 = null;
		l_FLG76 = null;
		l_FLG77 = null;
		l_FLG78 = null;
		l_FLG79 = null;
		l_FLG80 = null;
		l_FLG81 = null;
		l_FLG82 = null;
		l_FLG83 = null;
		l_FLG84 = null;
		l_FLG85 = null;
		l_FLG86 = null;
		l_FLG87 = null;
		l_FLG88 = null;
		l_FLG89 = null;
		l_FLG90 = null;
		l_L_NECK_PROC_NAME = null;
		l_L_NECK_PROC_CAPA = null;
		l_L_NECK_PROC_CAPA_UNIT = null;

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
	 * medAL0040010クラスの標準コンストラクタ
	 */
	public AL0040010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AL0040010Struct struct)
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
	public void setStructM(AL0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setShift_Date(struct.getShift_Date());
			this.sethidden_High_Color(struct.gethidden_High_Color());
			this.sethidden_Midd_Color(struct.gethidden_Midd_Color());
			this.sethidden_Low_Color(struct.gethidden_Low_Color());
			this.sethidden_DateFrom(struct.gethidden_DateFrom());
			this.sethidden_DateTo(struct.gethidden_DateTo());
			this.setS_LOAD_DATE(struct.getS_LOAD_DATE());
			this.setw_AlInstalledFlg(struct.getw_AlInstalledFlg());
			this.setNECK_PROC_NAME(struct.getNECK_PROC_NAME());
			this.setNECK_PROC_CD(struct.getNECK_PROC_CD());
			this.setLOAD_QTY1(struct.getLOAD_QTY1());
			this.setLOAD_QTY2(struct.getLOAD_QTY2());
			this.setLOAD_QTY3(struct.getLOAD_QTY3());
			this.setLOAD_QTY4(struct.getLOAD_QTY4());
			this.setLOAD_QTY5(struct.getLOAD_QTY5());
			this.setLOAD_QTY6(struct.getLOAD_QTY6());
			this.setLOAD_QTY7(struct.getLOAD_QTY7());
			this.setLOAD_QTY8(struct.getLOAD_QTY8());
			this.setLOAD_QTY9(struct.getLOAD_QTY9());
			this.setLOAD_QTY10(struct.getLOAD_QTY10());
			this.setLOAD_QTY11(struct.getLOAD_QTY11());
			this.setLOAD_QTY12(struct.getLOAD_QTY12());
			this.setLOAD_QTY13(struct.getLOAD_QTY13());
			this.setLOAD_QTY14(struct.getLOAD_QTY14());
			this.setLOAD_QTY15(struct.getLOAD_QTY15());
			this.setLOAD_QTY16(struct.getLOAD_QTY16());
			this.setLOAD_QTY17(struct.getLOAD_QTY17());
			this.setLOAD_QTY18(struct.getLOAD_QTY18());
			this.setLOAD_QTY19(struct.getLOAD_QTY19());
			this.setLOAD_QTY20(struct.getLOAD_QTY20());
			this.setLOAD_QTY21(struct.getLOAD_QTY21());
			this.setLOAD_QTY22(struct.getLOAD_QTY22());
			this.setLOAD_QTY23(struct.getLOAD_QTY23());
			this.setLOAD_QTY24(struct.getLOAD_QTY24());
			this.setLOAD_QTY25(struct.getLOAD_QTY25());
			this.setLOAD_QTY26(struct.getLOAD_QTY26());
			this.setLOAD_QTY27(struct.getLOAD_QTY27());
			this.setLOAD_QTY28(struct.getLOAD_QTY28());
			this.setLOAD_QTY29(struct.getLOAD_QTY29());
			this.setLOAD_QTY30(struct.getLOAD_QTY30());
			this.setLOAD_QTY31(struct.getLOAD_QTY31());
			this.setLOAD_QTY32(struct.getLOAD_QTY32());
			this.setLOAD_QTY33(struct.getLOAD_QTY33());
			this.setLOAD_QTY34(struct.getLOAD_QTY34());
			this.setLOAD_QTY35(struct.getLOAD_QTY35());
			this.setLOAD_QTY36(struct.getLOAD_QTY36());
			this.setLOAD_QTY37(struct.getLOAD_QTY37());
			this.setLOAD_QTY38(struct.getLOAD_QTY38());
			this.setLOAD_QTY39(struct.getLOAD_QTY39());
			this.setLOAD_QTY40(struct.getLOAD_QTY40());
			this.setLOAD_QTY41(struct.getLOAD_QTY41());
			this.setLOAD_QTY42(struct.getLOAD_QTY42());
			this.setLOAD_QTY43(struct.getLOAD_QTY43());
			this.setLOAD_QTY44(struct.getLOAD_QTY44());
			this.setLOAD_QTY45(struct.getLOAD_QTY45());
			this.setLOAD_QTY46(struct.getLOAD_QTY46());
			this.setLOAD_QTY47(struct.getLOAD_QTY47());
			this.setLOAD_QTY48(struct.getLOAD_QTY48());
			this.setLOAD_QTY49(struct.getLOAD_QTY49());
			this.setLOAD_QTY50(struct.getLOAD_QTY50());
			this.setLOAD_QTY51(struct.getLOAD_QTY51());
			this.setLOAD_QTY52(struct.getLOAD_QTY52());
			this.setLOAD_QTY53(struct.getLOAD_QTY53());
			this.setLOAD_QTY54(struct.getLOAD_QTY54());
			this.setLOAD_QTY55(struct.getLOAD_QTY55());
			this.setLOAD_QTY56(struct.getLOAD_QTY56());
			this.setLOAD_QTY57(struct.getLOAD_QTY57());
			this.setLOAD_QTY58(struct.getLOAD_QTY58());
			this.setLOAD_QTY59(struct.getLOAD_QTY59());
			this.setLOAD_QTY60(struct.getLOAD_QTY60());
			this.setLOAD_QTY61(struct.getLOAD_QTY61());
			this.setLOAD_QTY62(struct.getLOAD_QTY62());
			this.setLOAD_QTY63(struct.getLOAD_QTY63());
			this.setLOAD_QTY64(struct.getLOAD_QTY64());
			this.setLOAD_QTY65(struct.getLOAD_QTY65());
			this.setLOAD_QTY66(struct.getLOAD_QTY66());
			this.setLOAD_QTY67(struct.getLOAD_QTY67());
			this.setLOAD_QTY68(struct.getLOAD_QTY68());
			this.setLOAD_QTY69(struct.getLOAD_QTY69());
			this.setLOAD_QTY70(struct.getLOAD_QTY70());
			this.setLOAD_QTY71(struct.getLOAD_QTY71());
			this.setLOAD_QTY72(struct.getLOAD_QTY72());
			this.setLOAD_QTY73(struct.getLOAD_QTY73());
			this.setLOAD_QTY74(struct.getLOAD_QTY74());
			this.setLOAD_QTY75(struct.getLOAD_QTY75());
			this.setLOAD_QTY76(struct.getLOAD_QTY76());
			this.setLOAD_QTY77(struct.getLOAD_QTY77());
			this.setLOAD_QTY78(struct.getLOAD_QTY78());
			this.setLOAD_QTY79(struct.getLOAD_QTY79());
			this.setLOAD_QTY80(struct.getLOAD_QTY80());
			this.setLOAD_QTY81(struct.getLOAD_QTY81());
			this.setLOAD_QTY82(struct.getLOAD_QTY82());
			this.setLOAD_QTY83(struct.getLOAD_QTY83());
			this.setLOAD_QTY84(struct.getLOAD_QTY84());
			this.setLOAD_QTY85(struct.getLOAD_QTY85());
			this.setLOAD_QTY86(struct.getLOAD_QTY86());
			this.setLOAD_QTY87(struct.getLOAD_QTY87());
			this.setLOAD_QTY88(struct.getLOAD_QTY88());
			this.setLOAD_QTY89(struct.getLOAD_QTY89());
			this.setLOAD_QTY90(struct.getLOAD_QTY90());
			this.setDateFrom(struct.getDateFrom());
			this.setDateTo(struct.getDateTo());
			this.setK_PLANT_CD(struct.getK_PLANT_CD());
			this.setCAL_DATE(struct.getCAL_DATE());
			this.setHoliday_Flg(struct.getHoliday_Flg());
			this.setL_NECK_PROC_CD(struct.getL_NECK_PROC_CD());
			this.setL_LOAD_DATE(struct.getL_LOAD_DATE());
			this.setL_LOAD_QTY(struct.getL_LOAD_QTY());
			this.setL_ODR_STS_TYP(struct.getL_ODR_STS_TYP());
			this.setK_NECK_PROC_CD(struct.getK_NECK_PROC_CD());
			this.setK_LOAD_DATE(struct.getK_LOAD_DATE());
			this.setL_CHT_DIM(struct.getL_CHT_DIM());
			this.setL_CHT_TYPE(struct.getL_CHT_TYPE());
			this.setL_BG_C_R(struct.getL_BG_C_R());
			this.setL_BG_C_G(struct.getL_BG_C_G());
			this.setL_BG_C_B(struct.getL_BG_C_B());
			this.setL_MAX_SCALE(struct.getL_MAX_SCALE());
			this.setL_SCALE_STEP(struct.getL_SCALE_STEP());
			this.setL_CHT_C0_R(struct.getL_CHT_C0_R());
			this.setL_CHT_C0_G(struct.getL_CHT_C0_G());
			this.setL_CHT_C0_B(struct.getL_CHT_C0_B());
			this.setL_CHT_C1_R(struct.getL_CHT_C1_R());
			this.setL_CHT_C1_G(struct.getL_CHT_C1_G());
			this.setL_CHT_C1_B(struct.getL_CHT_C1_B());
			this.setL_CHT_C2_R(struct.getL_CHT_C2_R());
			this.setL_CHT_C2_G(struct.getL_CHT_C2_G());
			this.setL_CHT_C2_B(struct.getL_CHT_C2_B());
			this.setL_CHT_C9_R(struct.getL_CHT_C9_R());
			this.setL_CHT_C9_G(struct.getL_CHT_C9_G());
			this.setL_CHT_C9_B(struct.getL_CHT_C9_B());
			this.setL_HIGH_LOAD(struct.getL_HIGH_LOAD());
			this.setL_H_LOAD_C_R(struct.getL_H_LOAD_C_R());
			this.setL_H_LOAD_C_G(struct.getL_H_LOAD_C_G());
			this.setL_H_LOAD_C_B(struct.getL_H_LOAD_C_B());
			this.setL_MIDD_LOAD(struct.getL_MIDD_LOAD());
			this.setL_M_LOAD_C_R(struct.getL_M_LOAD_C_R());
			this.setL_M_LOAD_C_G(struct.getL_M_LOAD_C_G());
			this.setL_M_LOAD_C_B(struct.getL_M_LOAD_C_B());
			this.setL_LOW_LOAD(struct.getL_LOW_LOAD());
			this.setL_L_LOAD_C_R(struct.getL_L_LOAD_C_R());
			this.setL_L_LOAD_C_G(struct.getL_L_LOAD_C_G());
			this.setL_L_LOAD_C_B(struct.getL_L_LOAD_C_B());
			this.setLKM_ITEM_CD(struct.getLKM_ITEM_CD());
			this.setLKM_ITEM_NAME(struct.getLKM_ITEM_NAME());
			this.setLKM_JOB_ODR_CD(struct.getLKM_JOB_ODR_CD());
			this.setLKM_ODR_STS_TYP(struct.getLKM_ODR_STS_TYP());
			this.setLKM_PRD_START_DATE(struct.getLKM_PRD_START_DATE());
			this.setLKM_PRD_DUE_DATE(struct.getLKM_PRD_DUE_DATE());
			this.setLKM_ODR_QTY(struct.getLKM_ODR_QTY());
			this.setLKM_TOTAL_RCV_QTY(struct.getLKM_TOTAL_RCV_QTY());
			this.setLKM_UNIT_LOAD(struct.getLKM_UNIT_LOAD());
			this.setLKM_LOAD_QTY(struct.getLKM_LOAD_QTY());
			this.setKM_LOAD_DATE(struct.getKM_LOAD_DATE());
			this.setLKM_SUM_LOAD_QTY(struct.getLKM_SUM_LOAD_QTY());
			this.setLKM_OVR_LOAD_QTY(struct.getLKM_OVR_LOAD_QTY());
			this.setLKM_NECK_PROC_CD(struct.getLKM_NECK_PROC_CD());
			this.setLKM_LOAD_DATE(struct.getLKM_LOAD_DATE());
			this.setLKM_NECK_PROC_NAME(struct.getLKM_NECK_PROC_NAME());
			this.setLKM_NECK_PROC_CAPA(struct.getLKM_NECK_PROC_CAPA());
			this.setLKM_NECK_PROC_CAPA_UNIT(struct.getLKM_NECK_PROC_CAPA_UNIT());
			this.setFLG1(struct.getFLG1());
			this.setFLG2(struct.getFLG2());
			this.setFLG3(struct.getFLG3());
			this.setFLG4(struct.getFLG4());
			this.setFLG5(struct.getFLG5());
			this.setFLG6(struct.getFLG6());
			this.setFLG7(struct.getFLG7());
			this.setFLG8(struct.getFLG8());
			this.setFLG9(struct.getFLG9());
			this.setFLG10(struct.getFLG10());
			this.setFLG11(struct.getFLG11());
			this.setFLG12(struct.getFLG12());
			this.setFLG13(struct.getFLG13());
			this.setFLG14(struct.getFLG14());
			this.setFLG15(struct.getFLG15());
			this.setFLG16(struct.getFLG16());
			this.setFLG17(struct.getFLG17());
			this.setFLG18(struct.getFLG18());
			this.setFLG19(struct.getFLG19());
			this.setFLG20(struct.getFLG20());
			this.setFLG21(struct.getFLG21());
			this.setFLG22(struct.getFLG22());
			this.setFLG23(struct.getFLG23());
			this.setFLG24(struct.getFLG24());
			this.setFLG25(struct.getFLG25());
			this.setFLG26(struct.getFLG26());
			this.setFLG27(struct.getFLG27());
			this.setFLG28(struct.getFLG28());
			this.setFLG29(struct.getFLG29());
			this.setFLG30(struct.getFLG30());
			this.setFLG31(struct.getFLG31());
			this.setFLG32(struct.getFLG32());
			this.setFLG33(struct.getFLG33());
			this.setFLG34(struct.getFLG34());
			this.setFLG35(struct.getFLG35());
			this.setFLG36(struct.getFLG36());
			this.setFLG37(struct.getFLG37());
			this.setFLG38(struct.getFLG38());
			this.setFLG39(struct.getFLG39());
			this.setFLG40(struct.getFLG40());
			this.setFLG41(struct.getFLG41());
			this.setFLG42(struct.getFLG42());
			this.setFLG43(struct.getFLG43());
			this.setFLG44(struct.getFLG44());
			this.setFLG45(struct.getFLG45());
			this.setFLG46(struct.getFLG46());
			this.setFLG47(struct.getFLG47());
			this.setFLG48(struct.getFLG48());
			this.setFLG49(struct.getFLG49());
			this.setFLG50(struct.getFLG50());
			this.setFLG51(struct.getFLG51());
			this.setFLG52(struct.getFLG52());
			this.setFLG53(struct.getFLG53());
			this.setFLG54(struct.getFLG54());
			this.setFLG55(struct.getFLG55());
			this.setFLG56(struct.getFLG56());
			this.setFLG57(struct.getFLG57());
			this.setFLG58(struct.getFLG58());
			this.setFLG59(struct.getFLG59());
			this.setFLG60(struct.getFLG60());
			this.setFLG61(struct.getFLG61());
			this.setFLG62(struct.getFLG62());
			this.setFLG63(struct.getFLG63());
			this.setFLG64(struct.getFLG64());
			this.setFLG65(struct.getFLG65());
			this.setFLG66(struct.getFLG66());
			this.setFLG67(struct.getFLG67());
			this.setFLG68(struct.getFLG68());
			this.setFLG69(struct.getFLG69());
			this.setFLG70(struct.getFLG70());
			this.setFLG71(struct.getFLG71());
			this.setFLG72(struct.getFLG72());
			this.setFLG73(struct.getFLG73());
			this.setFLG74(struct.getFLG74());
			this.setFLG75(struct.getFLG75());
			this.setFLG76(struct.getFLG76());
			this.setFLG77(struct.getFLG77());
			this.setFLG78(struct.getFLG78());
			this.setFLG79(struct.getFLG79());
			this.setFLG80(struct.getFLG80());
			this.setFLG81(struct.getFLG81());
			this.setFLG82(struct.getFLG82());
			this.setFLG83(struct.getFLG83());
			this.setFLG84(struct.getFLG84());
			this.setFLG85(struct.getFLG85());
			this.setFLG86(struct.getFLG86());
			this.setFLG87(struct.getFLG87());
			this.setFLG88(struct.getFLG88());
			this.setFLG89(struct.getFLG89());
			this.setFLG90(struct.getFLG90());
			this.setL_NECK_PROC_NAME(struct.getL_NECK_PROC_NAME());
			this.setL_NECK_PROC_CAPA(struct.getL_NECK_PROC_CAPA());
			this.setL_NECK_PROC_CAPA_UNIT(struct.getL_NECK_PROC_CAPA_UNIT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AL0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_Shift_Date(struct.getList_Shift_Date());
			this.setList_hidden_High_Color(struct.getList_hidden_High_Color());
			this.setList_hidden_Midd_Color(struct.getList_hidden_Midd_Color());
			this.setList_hidden_Low_Color(struct.getList_hidden_Low_Color());
			this.setList_hidden_DateFrom(struct.getList_hidden_DateFrom());
			this.setList_hidden_DateTo(struct.getList_hidden_DateTo());
			this.setList_S_LOAD_DATE(struct.getList_S_LOAD_DATE());
			this.setList_w_AlInstalledFlg(struct.getList_w_AlInstalledFlg());
			this.setList_NECK_PROC_NAME(struct.getList_NECK_PROC_NAME());
			this.setList_NECK_PROC_CD(struct.getList_NECK_PROC_CD());
			this.setList_LOAD_QTY1(struct.getList_LOAD_QTY1());
			this.setList_LOAD_QTY2(struct.getList_LOAD_QTY2());
			this.setList_LOAD_QTY3(struct.getList_LOAD_QTY3());
			this.setList_LOAD_QTY4(struct.getList_LOAD_QTY4());
			this.setList_LOAD_QTY5(struct.getList_LOAD_QTY5());
			this.setList_LOAD_QTY6(struct.getList_LOAD_QTY6());
			this.setList_LOAD_QTY7(struct.getList_LOAD_QTY7());
			this.setList_LOAD_QTY8(struct.getList_LOAD_QTY8());
			this.setList_LOAD_QTY9(struct.getList_LOAD_QTY9());
			this.setList_LOAD_QTY10(struct.getList_LOAD_QTY10());
			this.setList_LOAD_QTY11(struct.getList_LOAD_QTY11());
			this.setList_LOAD_QTY12(struct.getList_LOAD_QTY12());
			this.setList_LOAD_QTY13(struct.getList_LOAD_QTY13());
			this.setList_LOAD_QTY14(struct.getList_LOAD_QTY14());
			this.setList_LOAD_QTY15(struct.getList_LOAD_QTY15());
			this.setList_LOAD_QTY16(struct.getList_LOAD_QTY16());
			this.setList_LOAD_QTY17(struct.getList_LOAD_QTY17());
			this.setList_LOAD_QTY18(struct.getList_LOAD_QTY18());
			this.setList_LOAD_QTY19(struct.getList_LOAD_QTY19());
			this.setList_LOAD_QTY20(struct.getList_LOAD_QTY20());
			this.setList_LOAD_QTY21(struct.getList_LOAD_QTY21());
			this.setList_LOAD_QTY22(struct.getList_LOAD_QTY22());
			this.setList_LOAD_QTY23(struct.getList_LOAD_QTY23());
			this.setList_LOAD_QTY24(struct.getList_LOAD_QTY24());
			this.setList_LOAD_QTY25(struct.getList_LOAD_QTY25());
			this.setList_LOAD_QTY26(struct.getList_LOAD_QTY26());
			this.setList_LOAD_QTY27(struct.getList_LOAD_QTY27());
			this.setList_LOAD_QTY28(struct.getList_LOAD_QTY28());
			this.setList_LOAD_QTY29(struct.getList_LOAD_QTY29());
			this.setList_LOAD_QTY30(struct.getList_LOAD_QTY30());
			this.setList_LOAD_QTY31(struct.getList_LOAD_QTY31());
			this.setList_LOAD_QTY32(struct.getList_LOAD_QTY32());
			this.setList_LOAD_QTY33(struct.getList_LOAD_QTY33());
			this.setList_LOAD_QTY34(struct.getList_LOAD_QTY34());
			this.setList_LOAD_QTY35(struct.getList_LOAD_QTY35());
			this.setList_LOAD_QTY36(struct.getList_LOAD_QTY36());
			this.setList_LOAD_QTY37(struct.getList_LOAD_QTY37());
			this.setList_LOAD_QTY38(struct.getList_LOAD_QTY38());
			this.setList_LOAD_QTY39(struct.getList_LOAD_QTY39());
			this.setList_LOAD_QTY40(struct.getList_LOAD_QTY40());
			this.setList_LOAD_QTY41(struct.getList_LOAD_QTY41());
			this.setList_LOAD_QTY42(struct.getList_LOAD_QTY42());
			this.setList_LOAD_QTY43(struct.getList_LOAD_QTY43());
			this.setList_LOAD_QTY44(struct.getList_LOAD_QTY44());
			this.setList_LOAD_QTY45(struct.getList_LOAD_QTY45());
			this.setList_LOAD_QTY46(struct.getList_LOAD_QTY46());
			this.setList_LOAD_QTY47(struct.getList_LOAD_QTY47());
			this.setList_LOAD_QTY48(struct.getList_LOAD_QTY48());
			this.setList_LOAD_QTY49(struct.getList_LOAD_QTY49());
			this.setList_LOAD_QTY50(struct.getList_LOAD_QTY50());
			this.setList_LOAD_QTY51(struct.getList_LOAD_QTY51());
			this.setList_LOAD_QTY52(struct.getList_LOAD_QTY52());
			this.setList_LOAD_QTY53(struct.getList_LOAD_QTY53());
			this.setList_LOAD_QTY54(struct.getList_LOAD_QTY54());
			this.setList_LOAD_QTY55(struct.getList_LOAD_QTY55());
			this.setList_LOAD_QTY56(struct.getList_LOAD_QTY56());
			this.setList_LOAD_QTY57(struct.getList_LOAD_QTY57());
			this.setList_LOAD_QTY58(struct.getList_LOAD_QTY58());
			this.setList_LOAD_QTY59(struct.getList_LOAD_QTY59());
			this.setList_LOAD_QTY60(struct.getList_LOAD_QTY60());
			this.setList_LOAD_QTY61(struct.getList_LOAD_QTY61());
			this.setList_LOAD_QTY62(struct.getList_LOAD_QTY62());
			this.setList_LOAD_QTY63(struct.getList_LOAD_QTY63());
			this.setList_LOAD_QTY64(struct.getList_LOAD_QTY64());
			this.setList_LOAD_QTY65(struct.getList_LOAD_QTY65());
			this.setList_LOAD_QTY66(struct.getList_LOAD_QTY66());
			this.setList_LOAD_QTY67(struct.getList_LOAD_QTY67());
			this.setList_LOAD_QTY68(struct.getList_LOAD_QTY68());
			this.setList_LOAD_QTY69(struct.getList_LOAD_QTY69());
			this.setList_LOAD_QTY70(struct.getList_LOAD_QTY70());
			this.setList_LOAD_QTY71(struct.getList_LOAD_QTY71());
			this.setList_LOAD_QTY72(struct.getList_LOAD_QTY72());
			this.setList_LOAD_QTY73(struct.getList_LOAD_QTY73());
			this.setList_LOAD_QTY74(struct.getList_LOAD_QTY74());
			this.setList_LOAD_QTY75(struct.getList_LOAD_QTY75());
			this.setList_LOAD_QTY76(struct.getList_LOAD_QTY76());
			this.setList_LOAD_QTY77(struct.getList_LOAD_QTY77());
			this.setList_LOAD_QTY78(struct.getList_LOAD_QTY78());
			this.setList_LOAD_QTY79(struct.getList_LOAD_QTY79());
			this.setList_LOAD_QTY80(struct.getList_LOAD_QTY80());
			this.setList_LOAD_QTY81(struct.getList_LOAD_QTY81());
			this.setList_LOAD_QTY82(struct.getList_LOAD_QTY82());
			this.setList_LOAD_QTY83(struct.getList_LOAD_QTY83());
			this.setList_LOAD_QTY84(struct.getList_LOAD_QTY84());
			this.setList_LOAD_QTY85(struct.getList_LOAD_QTY85());
			this.setList_LOAD_QTY86(struct.getList_LOAD_QTY86());
			this.setList_LOAD_QTY87(struct.getList_LOAD_QTY87());
			this.setList_LOAD_QTY88(struct.getList_LOAD_QTY88());
			this.setList_LOAD_QTY89(struct.getList_LOAD_QTY89());
			this.setList_LOAD_QTY90(struct.getList_LOAD_QTY90());
			this.setList_DateFrom(struct.getList_DateFrom());
			this.setList_DateTo(struct.getList_DateTo());
			this.setList_K_PLANT_CD(struct.getList_K_PLANT_CD());
			this.setList_CAL_DATE(struct.getList_CAL_DATE());
			this.setList_Holiday_Flg(struct.getList_Holiday_Flg());
			this.setList_L_NECK_PROC_CD(struct.getList_L_NECK_PROC_CD());
			this.setList_L_LOAD_DATE(struct.getList_L_LOAD_DATE());
			this.setList_L_LOAD_QTY(struct.getList_L_LOAD_QTY());
			this.setList_L_ODR_STS_TYP(struct.getList_L_ODR_STS_TYP());
			this.setList_K_NECK_PROC_CD(struct.getList_K_NECK_PROC_CD());
			this.setList_K_LOAD_DATE(struct.getList_K_LOAD_DATE());
			this.setList_L_CHT_DIM(struct.getList_L_CHT_DIM());
			this.setList_L_CHT_TYPE(struct.getList_L_CHT_TYPE());
			this.setList_L_BG_C_R(struct.getList_L_BG_C_R());
			this.setList_L_BG_C_G(struct.getList_L_BG_C_G());
			this.setList_L_BG_C_B(struct.getList_L_BG_C_B());
			this.setList_L_MAX_SCALE(struct.getList_L_MAX_SCALE());
			this.setList_L_SCALE_STEP(struct.getList_L_SCALE_STEP());
			this.setList_L_CHT_C0_R(struct.getList_L_CHT_C0_R());
			this.setList_L_CHT_C0_G(struct.getList_L_CHT_C0_G());
			this.setList_L_CHT_C0_B(struct.getList_L_CHT_C0_B());
			this.setList_L_CHT_C1_R(struct.getList_L_CHT_C1_R());
			this.setList_L_CHT_C1_G(struct.getList_L_CHT_C1_G());
			this.setList_L_CHT_C1_B(struct.getList_L_CHT_C1_B());
			this.setList_L_CHT_C2_R(struct.getList_L_CHT_C2_R());
			this.setList_L_CHT_C2_G(struct.getList_L_CHT_C2_G());
			this.setList_L_CHT_C2_B(struct.getList_L_CHT_C2_B());
			this.setList_L_CHT_C9_R(struct.getList_L_CHT_C9_R());
			this.setList_L_CHT_C9_G(struct.getList_L_CHT_C9_G());
			this.setList_L_CHT_C9_B(struct.getList_L_CHT_C9_B());
			this.setList_L_HIGH_LOAD(struct.getList_L_HIGH_LOAD());
			this.setList_L_H_LOAD_C_R(struct.getList_L_H_LOAD_C_R());
			this.setList_L_H_LOAD_C_G(struct.getList_L_H_LOAD_C_G());
			this.setList_L_H_LOAD_C_B(struct.getList_L_H_LOAD_C_B());
			this.setList_L_MIDD_LOAD(struct.getList_L_MIDD_LOAD());
			this.setList_L_M_LOAD_C_R(struct.getList_L_M_LOAD_C_R());
			this.setList_L_M_LOAD_C_G(struct.getList_L_M_LOAD_C_G());
			this.setList_L_M_LOAD_C_B(struct.getList_L_M_LOAD_C_B());
			this.setList_L_LOW_LOAD(struct.getList_L_LOW_LOAD());
			this.setList_L_L_LOAD_C_R(struct.getList_L_L_LOAD_C_R());
			this.setList_L_L_LOAD_C_G(struct.getList_L_L_LOAD_C_G());
			this.setList_L_L_LOAD_C_B(struct.getList_L_L_LOAD_C_B());
			this.setList_LKM_ITEM_CD(struct.getList_LKM_ITEM_CD());
			this.setList_LKM_ITEM_NAME(struct.getList_LKM_ITEM_NAME());
			this.setList_LKM_JOB_ODR_CD(struct.getList_LKM_JOB_ODR_CD());
			this.setList_LKM_ODR_STS_TYP(struct.getList_LKM_ODR_STS_TYP());
			this.setList_LKM_PRD_START_DATE(struct.getList_LKM_PRD_START_DATE());
			this.setList_LKM_PRD_DUE_DATE(struct.getList_LKM_PRD_DUE_DATE());
			this.setList_LKM_ODR_QTY(struct.getList_LKM_ODR_QTY());
			this.setList_LKM_TOTAL_RCV_QTY(struct.getList_LKM_TOTAL_RCV_QTY());
			this.setList_LKM_UNIT_LOAD(struct.getList_LKM_UNIT_LOAD());
			this.setList_LKM_LOAD_QTY(struct.getList_LKM_LOAD_QTY());
			this.setList_KM_LOAD_DATE(struct.getList_KM_LOAD_DATE());
			this.setList_LKM_SUM_LOAD_QTY(struct.getList_LKM_SUM_LOAD_QTY());
			this.setList_LKM_OVR_LOAD_QTY(struct.getList_LKM_OVR_LOAD_QTY());
			this.setList_LKM_NECK_PROC_CD(struct.getList_LKM_NECK_PROC_CD());
			this.setList_LKM_LOAD_DATE(struct.getList_LKM_LOAD_DATE());
			this.setList_LKM_NECK_PROC_NAME(struct.getList_LKM_NECK_PROC_NAME());
			this.setList_LKM_NECK_PROC_CAPA(struct.getList_LKM_NECK_PROC_CAPA());
			this.setList_LKM_NECK_PROC_CAPA_UNIT(struct.getList_LKM_NECK_PROC_CAPA_UNIT());
			this.setList_FLG1(struct.getList_FLG1());
			this.setList_FLG2(struct.getList_FLG2());
			this.setList_FLG3(struct.getList_FLG3());
			this.setList_FLG4(struct.getList_FLG4());
			this.setList_FLG5(struct.getList_FLG5());
			this.setList_FLG6(struct.getList_FLG6());
			this.setList_FLG7(struct.getList_FLG7());
			this.setList_FLG8(struct.getList_FLG8());
			this.setList_FLG9(struct.getList_FLG9());
			this.setList_FLG10(struct.getList_FLG10());
			this.setList_FLG11(struct.getList_FLG11());
			this.setList_FLG12(struct.getList_FLG12());
			this.setList_FLG13(struct.getList_FLG13());
			this.setList_FLG14(struct.getList_FLG14());
			this.setList_FLG15(struct.getList_FLG15());
			this.setList_FLG16(struct.getList_FLG16());
			this.setList_FLG17(struct.getList_FLG17());
			this.setList_FLG18(struct.getList_FLG18());
			this.setList_FLG19(struct.getList_FLG19());
			this.setList_FLG20(struct.getList_FLG20());
			this.setList_FLG21(struct.getList_FLG21());
			this.setList_FLG22(struct.getList_FLG22());
			this.setList_FLG23(struct.getList_FLG23());
			this.setList_FLG24(struct.getList_FLG24());
			this.setList_FLG25(struct.getList_FLG25());
			this.setList_FLG26(struct.getList_FLG26());
			this.setList_FLG27(struct.getList_FLG27());
			this.setList_FLG28(struct.getList_FLG28());
			this.setList_FLG29(struct.getList_FLG29());
			this.setList_FLG30(struct.getList_FLG30());
			this.setList_FLG31(struct.getList_FLG31());
			this.setList_FLG32(struct.getList_FLG32());
			this.setList_FLG33(struct.getList_FLG33());
			this.setList_FLG34(struct.getList_FLG34());
			this.setList_FLG35(struct.getList_FLG35());
			this.setList_FLG36(struct.getList_FLG36());
			this.setList_FLG37(struct.getList_FLG37());
			this.setList_FLG38(struct.getList_FLG38());
			this.setList_FLG39(struct.getList_FLG39());
			this.setList_FLG40(struct.getList_FLG40());
			this.setList_FLG41(struct.getList_FLG41());
			this.setList_FLG42(struct.getList_FLG42());
			this.setList_FLG43(struct.getList_FLG43());
			this.setList_FLG44(struct.getList_FLG44());
			this.setList_FLG45(struct.getList_FLG45());
			this.setList_FLG46(struct.getList_FLG46());
			this.setList_FLG47(struct.getList_FLG47());
			this.setList_FLG48(struct.getList_FLG48());
			this.setList_FLG49(struct.getList_FLG49());
			this.setList_FLG50(struct.getList_FLG50());
			this.setList_FLG51(struct.getList_FLG51());
			this.setList_FLG52(struct.getList_FLG52());
			this.setList_FLG53(struct.getList_FLG53());
			this.setList_FLG54(struct.getList_FLG54());
			this.setList_FLG55(struct.getList_FLG55());
			this.setList_FLG56(struct.getList_FLG56());
			this.setList_FLG57(struct.getList_FLG57());
			this.setList_FLG58(struct.getList_FLG58());
			this.setList_FLG59(struct.getList_FLG59());
			this.setList_FLG60(struct.getList_FLG60());
			this.setList_FLG61(struct.getList_FLG61());
			this.setList_FLG62(struct.getList_FLG62());
			this.setList_FLG63(struct.getList_FLG63());
			this.setList_FLG64(struct.getList_FLG64());
			this.setList_FLG65(struct.getList_FLG65());
			this.setList_FLG66(struct.getList_FLG66());
			this.setList_FLG67(struct.getList_FLG67());
			this.setList_FLG68(struct.getList_FLG68());
			this.setList_FLG69(struct.getList_FLG69());
			this.setList_FLG70(struct.getList_FLG70());
			this.setList_FLG71(struct.getList_FLG71());
			this.setList_FLG72(struct.getList_FLG72());
			this.setList_FLG73(struct.getList_FLG73());
			this.setList_FLG74(struct.getList_FLG74());
			this.setList_FLG75(struct.getList_FLG75());
			this.setList_FLG76(struct.getList_FLG76());
			this.setList_FLG77(struct.getList_FLG77());
			this.setList_FLG78(struct.getList_FLG78());
			this.setList_FLG79(struct.getList_FLG79());
			this.setList_FLG80(struct.getList_FLG80());
			this.setList_FLG81(struct.getList_FLG81());
			this.setList_FLG82(struct.getList_FLG82());
			this.setList_FLG83(struct.getList_FLG83());
			this.setList_FLG84(struct.getList_FLG84());
			this.setList_FLG85(struct.getList_FLG85());
			this.setList_FLG86(struct.getList_FLG86());
			this.setList_FLG87(struct.getList_FLG87());
			this.setList_FLG88(struct.getList_FLG88());
			this.setList_FLG89(struct.getList_FLG89());
			this.setList_FLG90(struct.getList_FLG90());
			this.setList_L_NECK_PROC_NAME(struct.getList_L_NECK_PROC_NAME());
			this.setList_L_NECK_PROC_CAPA(struct.getList_L_NECK_PROC_CAPA());
			this.setList_L_NECK_PROC_CAPA_UNIT(struct.getList_L_NECK_PROC_CAPA_UNIT());
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
	// 第 1 変数初期値： i_Shift_Date


	final static String i_Shift_Date = null;

	// 第 2 変数初期値： i_hidden_High_Color


	final static String i_hidden_High_Color = null;

	// 第 3 変数初期値： i_hidden_Midd_Color


	final static String i_hidden_Midd_Color = null;

	// 第 4 変数初期値： i_hidden_Low_Color


	final static String i_hidden_Low_Color = null;

	// 第 5 変数初期値： i_hidden_DateFrom


	final static String i_hidden_DateFrom = null;

	// 第 6 変数初期値： i_hidden_DateTo


	final static String i_hidden_DateTo = null;

	// 第 7 変数初期値： i_S_LOAD_DATE


	final static String i_S_LOAD_DATE = null;

	// 第 8 変数初期値： i_w_AlInstalledFlg


	final static String i_w_AlInstalledFlg = null;

	// 第 9 変数初期値： i_NECK_PROC_NAME


	final static String i_NECK_PROC_NAME = null;

	// 第 10 変数初期値： i_NECK_PROC_CD


	final static String i_NECK_PROC_CD = null;

	// 第 11 変数初期値： i_LOAD_QTY1


	final static String i_LOAD_QTY1 = null;

	// 第 12 変数初期値： i_LOAD_QTY2


	final static String i_LOAD_QTY2 = null;

	// 第 13 変数初期値： i_LOAD_QTY3


	final static String i_LOAD_QTY3 = null;

	// 第 14 変数初期値： i_LOAD_QTY4


	final static String i_LOAD_QTY4 = null;

	// 第 15 変数初期値： i_LOAD_QTY5


	final static String i_LOAD_QTY5 = null;

	// 第 16 変数初期値： i_LOAD_QTY6


	final static String i_LOAD_QTY6 = null;

	// 第 17 変数初期値： i_LOAD_QTY7


	final static String i_LOAD_QTY7 = null;

	// 第 18 変数初期値： i_LOAD_QTY8


	final static String i_LOAD_QTY8 = null;

	// 第 19 変数初期値： i_LOAD_QTY9


	final static String i_LOAD_QTY9 = null;

	// 第 20 変数初期値： i_LOAD_QTY10


	final static String i_LOAD_QTY10 = null;

	// 第 21 変数初期値： i_LOAD_QTY11


	final static String i_LOAD_QTY11 = null;

	// 第 22 変数初期値： i_LOAD_QTY12


	final static String i_LOAD_QTY12 = null;

	// 第 23 変数初期値： i_LOAD_QTY13


	final static String i_LOAD_QTY13 = null;

	// 第 24 変数初期値： i_LOAD_QTY14


	final static String i_LOAD_QTY14 = null;

	// 第 25 変数初期値： i_LOAD_QTY15


	final static String i_LOAD_QTY15 = null;

	// 第 26 変数初期値： i_LOAD_QTY16


	final static String i_LOAD_QTY16 = null;

	// 第 27 変数初期値： i_LOAD_QTY17


	final static String i_LOAD_QTY17 = null;

	// 第 28 変数初期値： i_LOAD_QTY18


	final static String i_LOAD_QTY18 = null;

	// 第 29 変数初期値： i_LOAD_QTY19


	final static String i_LOAD_QTY19 = null;

	// 第 30 変数初期値： i_LOAD_QTY20


	final static String i_LOAD_QTY20 = null;

	// 第 31 変数初期値： i_LOAD_QTY21


	final static String i_LOAD_QTY21 = null;

	// 第 32 変数初期値： i_LOAD_QTY22


	final static String i_LOAD_QTY22 = null;

	// 第 33 変数初期値： i_LOAD_QTY23


	final static String i_LOAD_QTY23 = null;

	// 第 34 変数初期値： i_LOAD_QTY24


	final static String i_LOAD_QTY24 = null;

	// 第 35 変数初期値： i_LOAD_QTY25


	final static String i_LOAD_QTY25 = null;

	// 第 36 変数初期値： i_LOAD_QTY26


	final static String i_LOAD_QTY26 = null;

	// 第 37 変数初期値： i_LOAD_QTY27


	final static String i_LOAD_QTY27 = null;

	// 第 38 変数初期値： i_LOAD_QTY28


	final static String i_LOAD_QTY28 = null;

	// 第 39 変数初期値： i_LOAD_QTY29


	final static String i_LOAD_QTY29 = null;

	// 第 40 変数初期値： i_LOAD_QTY30


	final static String i_LOAD_QTY30 = null;

	// 第 41 変数初期値： i_LOAD_QTY31


	final static String i_LOAD_QTY31 = null;

	// 第 42 変数初期値： i_LOAD_QTY32


	final static String i_LOAD_QTY32 = null;

	// 第 43 変数初期値： i_LOAD_QTY33


	final static String i_LOAD_QTY33 = null;

	// 第 44 変数初期値： i_LOAD_QTY34


	final static String i_LOAD_QTY34 = null;

	// 第 45 変数初期値： i_LOAD_QTY35


	final static String i_LOAD_QTY35 = null;

	// 第 46 変数初期値： i_LOAD_QTY36


	final static String i_LOAD_QTY36 = null;

	// 第 47 変数初期値： i_LOAD_QTY37


	final static String i_LOAD_QTY37 = null;

	// 第 48 変数初期値： i_LOAD_QTY38


	final static String i_LOAD_QTY38 = null;

	// 第 49 変数初期値： i_LOAD_QTY39


	final static String i_LOAD_QTY39 = null;

	// 第 50 変数初期値： i_LOAD_QTY40


	final static String i_LOAD_QTY40 = null;

	// 第 51 変数初期値： i_LOAD_QTY41


	final static String i_LOAD_QTY41 = null;

	// 第 52 変数初期値： i_LOAD_QTY42


	final static String i_LOAD_QTY42 = null;

	// 第 53 変数初期値： i_LOAD_QTY43


	final static String i_LOAD_QTY43 = null;

	// 第 54 変数初期値： i_LOAD_QTY44


	final static String i_LOAD_QTY44 = null;

	// 第 55 変数初期値： i_LOAD_QTY45


	final static String i_LOAD_QTY45 = null;

	// 第 56 変数初期値： i_LOAD_QTY46


	final static String i_LOAD_QTY46 = null;

	// 第 57 変数初期値： i_LOAD_QTY47


	final static String i_LOAD_QTY47 = null;

	// 第 58 変数初期値： i_LOAD_QTY48


	final static String i_LOAD_QTY48 = null;

	// 第 59 変数初期値： i_LOAD_QTY49


	final static String i_LOAD_QTY49 = null;

	// 第 60 変数初期値： i_LOAD_QTY50


	final static String i_LOAD_QTY50 = null;

	// 第 61 変数初期値： i_LOAD_QTY51


	final static String i_LOAD_QTY51 = null;

	// 第 62 変数初期値： i_LOAD_QTY52


	final static String i_LOAD_QTY52 = null;

	// 第 63 変数初期値： i_LOAD_QTY53


	final static String i_LOAD_QTY53 = null;

	// 第 64 変数初期値： i_LOAD_QTY54


	final static String i_LOAD_QTY54 = null;

	// 第 65 変数初期値： i_LOAD_QTY55


	final static String i_LOAD_QTY55 = null;

	// 第 66 変数初期値： i_LOAD_QTY56


	final static String i_LOAD_QTY56 = null;

	// 第 67 変数初期値： i_LOAD_QTY57


	final static String i_LOAD_QTY57 = null;

	// 第 68 変数初期値： i_LOAD_QTY58


	final static String i_LOAD_QTY58 = null;

	// 第 69 変数初期値： i_LOAD_QTY59


	final static String i_LOAD_QTY59 = null;

	// 第 70 変数初期値： i_LOAD_QTY60


	final static String i_LOAD_QTY60 = null;

	// 第 71 変数初期値： i_LOAD_QTY61


	final static String i_LOAD_QTY61 = null;

	// 第 72 変数初期値： i_LOAD_QTY62


	final static String i_LOAD_QTY62 = null;

	// 第 73 変数初期値： i_LOAD_QTY63


	final static String i_LOAD_QTY63 = null;

	// 第 74 変数初期値： i_LOAD_QTY64


	final static String i_LOAD_QTY64 = null;

	// 第 75 変数初期値： i_LOAD_QTY65


	final static String i_LOAD_QTY65 = null;

	// 第 76 変数初期値： i_LOAD_QTY66


	final static String i_LOAD_QTY66 = null;

	// 第 77 変数初期値： i_LOAD_QTY67


	final static String i_LOAD_QTY67 = null;

	// 第 78 変数初期値： i_LOAD_QTY68


	final static String i_LOAD_QTY68 = null;

	// 第 79 変数初期値： i_LOAD_QTY69


	final static String i_LOAD_QTY69 = null;

	// 第 80 変数初期値： i_LOAD_QTY70


	final static String i_LOAD_QTY70 = null;

	// 第 81 変数初期値： i_LOAD_QTY71


	final static String i_LOAD_QTY71 = null;

	// 第 82 変数初期値： i_LOAD_QTY72


	final static String i_LOAD_QTY72 = null;

	// 第 83 変数初期値： i_LOAD_QTY73


	final static String i_LOAD_QTY73 = null;

	// 第 84 変数初期値： i_LOAD_QTY74


	final static String i_LOAD_QTY74 = null;

	// 第 85 変数初期値： i_LOAD_QTY75


	final static String i_LOAD_QTY75 = null;

	// 第 86 変数初期値： i_LOAD_QTY76


	final static String i_LOAD_QTY76 = null;

	// 第 87 変数初期値： i_LOAD_QTY77


	final static String i_LOAD_QTY77 = null;

	// 第 88 変数初期値： i_LOAD_QTY78


	final static String i_LOAD_QTY78 = null;

	// 第 89 変数初期値： i_LOAD_QTY79


	final static String i_LOAD_QTY79 = null;

	// 第 90 変数初期値： i_LOAD_QTY80


	final static String i_LOAD_QTY80 = null;

	// 第 91 変数初期値： i_LOAD_QTY81


	final static String i_LOAD_QTY81 = null;

	// 第 92 変数初期値： i_LOAD_QTY82


	final static String i_LOAD_QTY82 = null;

	// 第 93 変数初期値： i_LOAD_QTY83


	final static String i_LOAD_QTY83 = null;

	// 第 94 変数初期値： i_LOAD_QTY84


	final static String i_LOAD_QTY84 = null;

	// 第 95 変数初期値： i_LOAD_QTY85


	final static String i_LOAD_QTY85 = null;

	// 第 96 変数初期値： i_LOAD_QTY86


	final static String i_LOAD_QTY86 = null;

	// 第 97 変数初期値： i_LOAD_QTY87


	final static String i_LOAD_QTY87 = null;

	// 第 98 変数初期値： i_LOAD_QTY88


	final static String i_LOAD_QTY88 = null;

	// 第 99 変数初期値： i_LOAD_QTY89


	final static String i_LOAD_QTY89 = null;

	// 第 100 変数初期値： i_LOAD_QTY90


	final static String i_LOAD_QTY90 = null;

	// 第 101 変数初期値： i_DateFrom


	final static String i_DateFrom = null;

	// 第 102 変数初期値： i_DateTo


	final static String i_DateTo = null;

	// 第 103 変数初期値： i_K_PLANT_CD


	final static String i_K_PLANT_CD = null;

	// 第 104 変数初期値： i_CAL_DATE


	final static String i_CAL_DATE = null;

	// 第 105 変数初期値： i_Holiday_Flg


	final static String i_Holiday_Flg = null;

	// 第 106 変数初期値： i_L_NECK_PROC_CD


	final static String i_L_NECK_PROC_CD = null;

	// 第 107 変数初期値： i_L_LOAD_DATE


	final static String i_L_LOAD_DATE = null;

	// 第 108 変数初期値： i_L_LOAD_QTY


	final static String i_L_LOAD_QTY = null;

	// 第 109 変数初期値： i_L_ODR_STS_TYP


	final static String i_L_ODR_STS_TYP = null;

	// 第 110 変数初期値： i_K_NECK_PROC_CD


	final static String i_K_NECK_PROC_CD = null;

	// 第 111 変数初期値： i_K_LOAD_DATE


	final static String i_K_LOAD_DATE = null;

	// 第 112 変数初期値： i_L_CHT_DIM


	final static Integer i_L_CHT_DIM = null;

	// 第 113 変数初期値： i_L_CHT_TYPE


	final static Integer i_L_CHT_TYPE = null;

	// 第 114 変数初期値： i_L_BG_C_R


	final static Integer i_L_BG_C_R = null;

	// 第 115 変数初期値： i_L_BG_C_G


	final static Integer i_L_BG_C_G = null;

	// 第 116 変数初期値： i_L_BG_C_B


	final static Integer i_L_BG_C_B = null;

	// 第 117 変数初期値： i_L_MAX_SCALE


	final static Double i_L_MAX_SCALE = null;

	// 第 118 変数初期値： i_L_SCALE_STEP


	final static Double i_L_SCALE_STEP = null;

	// 第 119 変数初期値： i_L_CHT_C0_R


	final static Integer i_L_CHT_C0_R = null;

	// 第 120 変数初期値： i_L_CHT_C0_G


	final static Integer i_L_CHT_C0_G = null;

	// 第 121 変数初期値： i_L_CHT_C0_B


	final static Integer i_L_CHT_C0_B = null;

	// 第 122 変数初期値： i_L_CHT_C1_R


	final static Integer i_L_CHT_C1_R = null;

	// 第 123 変数初期値： i_L_CHT_C1_G


	final static Integer i_L_CHT_C1_G = null;

	// 第 124 変数初期値： i_L_CHT_C1_B


	final static Integer i_L_CHT_C1_B = null;

	// 第 125 変数初期値： i_L_CHT_C2_R


	final static Integer i_L_CHT_C2_R = null;

	// 第 126 変数初期値： i_L_CHT_C2_G


	final static Integer i_L_CHT_C2_G = null;

	// 第 127 変数初期値： i_L_CHT_C2_B


	final static Integer i_L_CHT_C2_B = null;

	// 第 128 変数初期値： i_L_CHT_C9_R


	final static Integer i_L_CHT_C9_R = null;

	// 第 129 変数初期値： i_L_CHT_C9_G


	final static Integer i_L_CHT_C9_G = null;

	// 第 130 変数初期値： i_L_CHT_C9_B


	final static Integer i_L_CHT_C9_B = null;

	// 第 131 変数初期値： i_L_HIGH_LOAD


	final static Integer i_L_HIGH_LOAD = null;

	// 第 132 変数初期値： i_L_H_LOAD_C_R


	final static Integer i_L_H_LOAD_C_R = null;

	// 第 133 変数初期値： i_L_H_LOAD_C_G


	final static Integer i_L_H_LOAD_C_G = null;

	// 第 134 変数初期値： i_L_H_LOAD_C_B


	final static Integer i_L_H_LOAD_C_B = null;

	// 第 135 変数初期値： i_L_MIDD_LOAD


	final static Integer i_L_MIDD_LOAD = null;

	// 第 136 変数初期値： i_L_M_LOAD_C_R


	final static Integer i_L_M_LOAD_C_R = null;

	// 第 137 変数初期値： i_L_M_LOAD_C_G


	final static Integer i_L_M_LOAD_C_G = null;

	// 第 138 変数初期値： i_L_M_LOAD_C_B


	final static Integer i_L_M_LOAD_C_B = null;

	// 第 139 変数初期値： i_L_LOW_LOAD


	final static Integer i_L_LOW_LOAD = null;

	// 第 140 変数初期値： i_L_L_LOAD_C_R


	final static Integer i_L_L_LOAD_C_R = null;

	// 第 141 変数初期値： i_L_L_LOAD_C_G


	final static Integer i_L_L_LOAD_C_G = null;

	// 第 142 変数初期値： i_L_L_LOAD_C_B


	final static Integer i_L_L_LOAD_C_B = null;

	// 第 143 変数初期値： i_LKM_ITEM_CD


	final static String i_LKM_ITEM_CD = null;

	// 第 144 変数初期値： i_LKM_ITEM_NAME


	final static String i_LKM_ITEM_NAME = null;

	// 第 145 変数初期値： i_LKM_JOB_ODR_CD


	final static String i_LKM_JOB_ODR_CD = null;

	// 第 146 変数初期値： i_LKM_ODR_STS_TYP


	final static String i_LKM_ODR_STS_TYP = null;

	// 第 147 変数初期値： i_LKM_PRD_START_DATE


	final static String i_LKM_PRD_START_DATE = null;

	// 第 148 変数初期値： i_LKM_PRD_DUE_DATE


	final static String i_LKM_PRD_DUE_DATE = null;

	// 第 149 変数初期値： i_LKM_ODR_QTY


	final static String i_LKM_ODR_QTY = null;

	// 第 150 変数初期値： i_LKM_TOTAL_RCV_QTY


	final static String i_LKM_TOTAL_RCV_QTY = null;

	// 第 151 変数初期値： i_LKM_UNIT_LOAD


	final static String i_LKM_UNIT_LOAD = null;

	// 第 152 変数初期値： i_LKM_LOAD_QTY


	final static String i_LKM_LOAD_QTY = null;

	// 第 153 変数初期値： i_KM_LOAD_DATE


	final static String i_KM_LOAD_DATE = null;

	// 第 154 変数初期値： i_LKM_SUM_LOAD_QTY


	final static String i_LKM_SUM_LOAD_QTY = null;

	// 第 155 変数初期値： i_LKM_OVR_LOAD_QTY


	final static String i_LKM_OVR_LOAD_QTY = null;

	// 第 156 変数初期値： i_LKM_NECK_PROC_CD


	final static String i_LKM_NECK_PROC_CD = null;

	// 第 157 変数初期値： i_LKM_LOAD_DATE


	final static String i_LKM_LOAD_DATE = null;

	// 第 158 変数初期値： i_LKM_NECK_PROC_NAME


	final static String i_LKM_NECK_PROC_NAME = null;

	// 第 159 変数初期値： i_LKM_NECK_PROC_CAPA


	final static String i_LKM_NECK_PROC_CAPA = null;

	// 第 160 変数初期値： i_LKM_NECK_PROC_CAPA_UNIT


	final static String i_LKM_NECK_PROC_CAPA_UNIT = null;

	// 第 161 変数初期値： i_FLG1


	final static String i_FLG1 = null;

	// 第 162 変数初期値： i_FLG2


	final static String i_FLG2 = null;

	// 第 163 変数初期値： i_FLG3


	final static String i_FLG3 = null;

	// 第 164 変数初期値： i_FLG4


	final static String i_FLG4 = null;

	// 第 165 変数初期値： i_FLG5


	final static String i_FLG5 = null;

	// 第 166 変数初期値： i_FLG6


	final static String i_FLG6 = null;

	// 第 167 変数初期値： i_FLG7


	final static String i_FLG7 = null;

	// 第 168 変数初期値： i_FLG8


	final static String i_FLG8 = null;

	// 第 169 変数初期値： i_FLG9


	final static String i_FLG9 = null;

	// 第 170 変数初期値： i_FLG10


	final static String i_FLG10 = null;

	// 第 171 変数初期値： i_FLG11


	final static String i_FLG11 = null;

	// 第 172 変数初期値： i_FLG12


	final static String i_FLG12 = null;

	// 第 173 変数初期値： i_FLG13


	final static String i_FLG13 = null;

	// 第 174 変数初期値： i_FLG14


	final static String i_FLG14 = null;

	// 第 175 変数初期値： i_FLG15


	final static String i_FLG15 = null;

	// 第 176 変数初期値： i_FLG16


	final static String i_FLG16 = null;

	// 第 177 変数初期値： i_FLG17


	final static String i_FLG17 = null;

	// 第 178 変数初期値： i_FLG18


	final static String i_FLG18 = null;

	// 第 179 変数初期値： i_FLG19


	final static String i_FLG19 = null;

	// 第 180 変数初期値： i_FLG20


	final static String i_FLG20 = null;

	// 第 181 変数初期値： i_FLG21


	final static String i_FLG21 = null;

	// 第 182 変数初期値： i_FLG22


	final static String i_FLG22 = null;

	// 第 183 変数初期値： i_FLG23


	final static String i_FLG23 = null;

	// 第 184 変数初期値： i_FLG24


	final static String i_FLG24 = null;

	// 第 185 変数初期値： i_FLG25


	final static String i_FLG25 = null;

	// 第 186 変数初期値： i_FLG26


	final static String i_FLG26 = null;

	// 第 187 変数初期値： i_FLG27


	final static String i_FLG27 = null;

	// 第 188 変数初期値： i_FLG28


	final static String i_FLG28 = null;

	// 第 189 変数初期値： i_FLG29


	final static String i_FLG29 = null;

	// 第 190 変数初期値： i_FLG30


	final static String i_FLG30 = null;

	// 第 191 変数初期値： i_FLG31


	final static String i_FLG31 = null;

	// 第 192 変数初期値： i_FLG32


	final static String i_FLG32 = null;

	// 第 193 変数初期値： i_FLG33


	final static String i_FLG33 = null;

	// 第 194 変数初期値： i_FLG34


	final static String i_FLG34 = null;

	// 第 195 変数初期値： i_FLG35


	final static String i_FLG35 = null;

	// 第 196 変数初期値： i_FLG36


	final static String i_FLG36 = null;

	// 第 197 変数初期値： i_FLG37


	final static String i_FLG37 = null;

	// 第 198 変数初期値： i_FLG38


	final static String i_FLG38 = null;

	// 第 199 変数初期値： i_FLG39


	final static String i_FLG39 = null;

	// 第 200 変数初期値： i_FLG40


	final static String i_FLG40 = null;

	// 第 201 変数初期値： i_FLG41


	final static String i_FLG41 = null;

	// 第 202 変数初期値： i_FLG42


	final static String i_FLG42 = null;

	// 第 203 変数初期値： i_FLG43


	final static String i_FLG43 = null;

	// 第 204 変数初期値： i_FLG44


	final static String i_FLG44 = null;

	// 第 205 変数初期値： i_FLG45


	final static String i_FLG45 = null;

	// 第 206 変数初期値： i_FLG46


	final static String i_FLG46 = null;

	// 第 207 変数初期値： i_FLG47


	final static String i_FLG47 = null;

	// 第 208 変数初期値： i_FLG48


	final static String i_FLG48 = null;

	// 第 209 変数初期値： i_FLG49


	final static String i_FLG49 = null;

	// 第 210 変数初期値： i_FLG50


	final static String i_FLG50 = null;

	// 第 211 変数初期値： i_FLG51


	final static String i_FLG51 = null;

	// 第 212 変数初期値： i_FLG52


	final static String i_FLG52 = null;

	// 第 213 変数初期値： i_FLG53


	final static String i_FLG53 = null;

	// 第 214 変数初期値： i_FLG54


	final static String i_FLG54 = null;

	// 第 215 変数初期値： i_FLG55


	final static String i_FLG55 = null;

	// 第 216 変数初期値： i_FLG56


	final static String i_FLG56 = null;

	// 第 217 変数初期値： i_FLG57


	final static String i_FLG57 = null;

	// 第 218 変数初期値： i_FLG58


	final static String i_FLG58 = null;

	// 第 219 変数初期値： i_FLG59


	final static String i_FLG59 = null;

	// 第 220 変数初期値： i_FLG60


	final static String i_FLG60 = null;

	// 第 221 変数初期値： i_FLG61


	final static String i_FLG61 = null;

	// 第 222 変数初期値： i_FLG62


	final static String i_FLG62 = null;

	// 第 223 変数初期値： i_FLG63


	final static String i_FLG63 = null;

	// 第 224 変数初期値： i_FLG64


	final static String i_FLG64 = null;

	// 第 225 変数初期値： i_FLG65


	final static String i_FLG65 = null;

	// 第 226 変数初期値： i_FLG66


	final static String i_FLG66 = null;

	// 第 227 変数初期値： i_FLG67


	final static String i_FLG67 = null;

	// 第 228 変数初期値： i_FLG68


	final static String i_FLG68 = null;

	// 第 229 変数初期値： i_FLG69


	final static String i_FLG69 = null;

	// 第 230 変数初期値： i_FLG70


	final static String i_FLG70 = null;

	// 第 231 変数初期値： i_FLG71


	final static String i_FLG71 = null;

	// 第 232 変数初期値： i_FLG72


	final static String i_FLG72 = null;

	// 第 233 変数初期値： i_FLG73


	final static String i_FLG73 = null;

	// 第 234 変数初期値： i_FLG74


	final static String i_FLG74 = null;

	// 第 235 変数初期値： i_FLG75


	final static String i_FLG75 = null;

	// 第 236 変数初期値： i_FLG76


	final static String i_FLG76 = null;

	// 第 237 変数初期値： i_FLG77


	final static String i_FLG77 = null;

	// 第 238 変数初期値： i_FLG78


	final static String i_FLG78 = null;

	// 第 239 変数初期値： i_FLG79


	final static String i_FLG79 = null;

	// 第 240 変数初期値： i_FLG80


	final static String i_FLG80 = null;

	// 第 241 変数初期値： i_FLG81


	final static String i_FLG81 = null;

	// 第 242 変数初期値： i_FLG82


	final static String i_FLG82 = null;

	// 第 243 変数初期値： i_FLG83


	final static String i_FLG83 = null;

	// 第 244 変数初期値： i_FLG84


	final static String i_FLG84 = null;

	// 第 245 変数初期値： i_FLG85


	final static String i_FLG85 = null;

	// 第 246 変数初期値： i_FLG86


	final static String i_FLG86 = null;

	// 第 247 変数初期値： i_FLG87


	final static String i_FLG87 = null;

	// 第 248 変数初期値： i_FLG88


	final static String i_FLG88 = null;

	// 第 249 変数初期値： i_FLG89


	final static String i_FLG89 = null;

	// 第 250 変数初期値： i_FLG90


	final static String i_FLG90 = null;

	// 第 251 変数初期値： i_L_NECK_PROC_NAME


	final static String i_L_NECK_PROC_NAME = null;

	// 第 252 変数初期値： i_L_NECK_PROC_CAPA


	final static String i_L_NECK_PROC_CAPA = null;

	// 第 253 変数初期値： i_L_NECK_PROC_CAPA_UNIT


	final static String i_L_NECK_PROC_CAPA_UNIT = null;

*/

	//{{user_implement_code
        // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
