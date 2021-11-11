/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B001/medKP0040B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B001;

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
 * CLASS     : medKP0040B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.13 $ $Date: 2015/12/03 08:53:22 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKP0040B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_sysBusinessMEG;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected Double m_ODR_INFO_IF_CTRL_NO;

	/**
	 * 第 5 mediator変数
	 */
	protected Double m_DATA_PROC_CD;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_INFO_TYP_CD;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_DATA_CREATED_DATE;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_CLIENT_CD;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_TRUSTEE_CD;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_BUYER_ORG_CD;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_PUCH_ODR_CD;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_PRDCT_ODR_CD;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_MODIFICATION_CODE;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_COCK_TYP;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_PUCH_ODR_DATE;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_UNIT;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_UNIT_PRICE;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_PRICE_TYP;

	/**
	 * 第 19 mediator変数
	 */
	protected Double m_PUCH_ODR_QTY;

	/**
	 * 第 20 mediator変数
	 */
	protected Double m_PUCH_ODR_AMOUNT;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_CONS_TYP;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_BUYER_NAME;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_MATR_SPEC_SIZE;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_SPECTP;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_DROWING_EDITION;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_PART_NAME;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_OWN_ITEM_CD;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_CUST_ITEM_CD;

	/**
	 * 第 29 mediator変数
	 */
	protected Double m_DROW_SPEC_QTY;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_PKG_UNIT;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_DIRECT_DLV_TYP;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_DLV_LOC_CD;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_INSPC_TYP;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_DLV_INST_TYP;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_1;

	/**
	 * 第 36 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_1;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_DLV_CD_1;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_2;

	/**
	 * 第 39 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_2;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_DLV_CD_2;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_3;

	/**
	 * 第 42 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_3;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_DLV_CD_3;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_4;

	/**
	 * 第 45 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_4;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_DLV_CD_4;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_5;

	/**
	 * 第 48 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_5;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_DLV_CD_5;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_6;

	/**
	 * 第 51 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_6;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_DLV_CD_6;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_7;

	/**
	 * 第 54 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_7;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_DLV_CD_7;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_8;

	/**
	 * 第 57 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_8;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_DLV_CD_8;

	/**
	 * 第 59 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_9;

	/**
	 * 第 60 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_9;

	/**
	 * 第 61 mediator変数
	 */
	protected String m_DLV_CD_9;

	/**
	 * 第 62 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_10;

	/**
	 * 第 63 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_10;

	/**
	 * 第 64 mediator変数
	 */
	protected String m_DLV_CD_10;

	/**
	 * 第 65 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_11;

	/**
	 * 第 66 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_11;

	/**
	 * 第 67 mediator変数
	 */
	protected String m_DLV_CD_11;

	/**
	 * 第 68 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_12;

	/**
	 * 第 69 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_12;

	/**
	 * 第 70 mediator変数
	 */
	protected String m_DLV_CD_12;

	/**
	 * 第 71 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_13;

	/**
	 * 第 72 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_13;

	/**
	 * 第 73 mediator変数
	 */
	protected String m_DLV_CD_13;

	/**
	 * 第 74 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_14;

	/**
	 * 第 75 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_14;

	/**
	 * 第 76 mediator変数
	 */
	protected String m_DLV_CD_14;

	/**
	 * 第 77 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_15;

	/**
	 * 第 78 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_15;

	/**
	 * 第 79 mediator変数
	 */
	protected String m_DLV_CD_15;

	/**
	 * 第 80 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_16;

	/**
	 * 第 81 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_16;

	/**
	 * 第 82 mediator変数
	 */
	protected String m_DLV_CD_16;

	/**
	 * 第 83 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_17;

	/**
	 * 第 84 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_17;

	/**
	 * 第 85 mediator変数
	 */
	protected String m_DLV_CD_17;

	/**
	 * 第 86 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_18;

	/**
	 * 第 87 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_18;

	/**
	 * 第 88 mediator変数
	 */
	protected String m_DLV_CD_18;

	/**
	 * 第 89 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_19;

	/**
	 * 第 90 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_19;

	/**
	 * 第 91 mediator変数
	 */
	protected String m_DLV_CD_19;

	/**
	 * 第 92 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_20;

	/**
	 * 第 93 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_20;

	/**
	 * 第 94 mediator変数
	 */
	protected String m_DLV_CD_20;

	/**
	 * 第 95 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_21;

	/**
	 * 第 96 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_21;

	/**
	 * 第 97 mediator変数
	 */
	protected String m_DLV_CD_21;

	/**
	 * 第 98 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_22;

	/**
	 * 第 99 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_22;

	/**
	 * 第 100 mediator変数
	 */
	protected String m_DLV_CD_22;

	/**
	 * 第 101 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_23;

	/**
	 * 第 102 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_23;

	/**
	 * 第 103 mediator変数
	 */
	protected String m_DLV_CD_23;

	/**
	 * 第 104 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_24;

	/**
	 * 第 105 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_24;

	/**
	 * 第 106 mediator変数
	 */
	protected String m_DLV_CD_24;

	/**
	 * 第 107 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_25;

	/**
	 * 第 108 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_25;

	/**
	 * 第 109 mediator変数
	 */
	protected String m_DLV_CD_25;

	/**
	 * 第 110 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_26;

	/**
	 * 第 111 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_26;

	/**
	 * 第 112 mediator変数
	 */
	protected String m_DLV_CD_26;

	/**
	 * 第 113 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_27;

	/**
	 * 第 114 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_27;

	/**
	 * 第 115 mediator変数
	 */
	protected String m_DLV_CD_27;

	/**
	 * 第 116 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_28;

	/**
	 * 第 117 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_28;

	/**
	 * 第 118 mediator変数
	 */
	protected String m_DLV_CD_28;

	/**
	 * 第 119 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_29;

	/**
	 * 第 120 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_29;

	/**
	 * 第 121 mediator変数
	 */
	protected String m_DLV_CD_29;

	/**
	 * 第 122 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_30;

	/**
	 * 第 123 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_30;

	/**
	 * 第 124 mediator変数
	 */
	protected String m_DLV_CD_30;

	/**
	 * 第 125 mediator変数
	 */
	protected String m_SCDL_DLV_DATE_31;

	/**
	 * 第 126 mediator変数
	 */
	protected Double m_SCDL_DLV_QTY_31;

	/**
	 * 第 127 mediator変数
	 */
	protected String m_DLV_CD_31;

	/**
	 * 第 128 mediator変数
	 */
	protected String m_FREE_TEXT;

	/**
	 * 第 129 mediator変数
	 */
	protected String m_REMARKS;

	/**
	 * 第 130 mediator変数
	 */
	protected String m_TAX_TYP;

	/**
	 * 第 131 mediator変数
	 */
	protected String m_CUST_TAXATION_TYP;

	/**
	 * 第 132 mediator変数
	 */
	protected Double m_TAX_AMOUNT;

	/**
	 * 第 133 mediator変数
	 */
	protected Double m_CUST_TOTAL_AMOUNT;

	/**
	 * 第 134 mediator変数
	 */
	protected String m_UNCONFIRM_ODR_CD;

	/**
	 * 第 135 mediator変数
	 */
	protected String m_UNCONFIRM_ODR_DATE;

	/**
	 * 第 136 mediator変数
	 */
	protected Double m_UNCONFIRM_ODR_QTY;

	/**
	 * 第 137 mediator変数
	 */
	protected Double m_UNCONFIRM_ODR_AMOUNT;

	/**
	 * 第 138 mediator変数
	 */
	protected String m_ESTIMATE_REQST_CD;

	/**
	 * 第 139 mediator変数
	 */
	protected String m_STL_COND_CD;

	/**
	 * 第 140 mediator変数
	 */
	protected String m_END_USER_NAME;

	/**
	 * 第 141 mediator変数
	 */
	protected String m_DLV_ZIP_CD;

	/**
	 * 第 142 mediator変数
	 */
	protected String m_DLV_ADDRESS;

	/**
	 * 第 143 mediator変数
	 */
	protected String m_DLV_ADDRESSEE;

	/**
	 * 第 144 mediator変数
	 */
	protected String m_CUST_COMM_SUBNAME;

	/**
	 * 第 145 mediator変数
	 */
	protected String m_CUST_COMM_SUBCD;

	/**
	 * 第 146 mediator変数
	 */
	protected String m_END_USER_ODR_CD;

	/**
	 * 第 147 mediator変数
	 */
	protected String m_CUST_DESINATED_MAKER;

	/**
	 * 第 148 mediator変数
	 */
	protected String m_DLV_KEY_NO_1;

	/**
	 * 第 149 mediator変数
	 */
	protected String m_DLV_KEY_NO_2;

	/**
	 * 第 150 mediator変数
	 */
	protected String m_DLV_KEY_NO_3;

	/**
	 * 第 151 mediator変数
	 */
	protected String m_DLV_KEY_NO_4;

	/**
	 * 第 152 mediator変数
	 */
	protected String m_DLV_KEY_NO_5;

	/**
	 * 第 153 mediator変数
	 */
	protected String m_DLV_KEY_NO_6;

	/**
	 * 第 154 mediator変数
	 */
	protected String m_DLV_KEY_NO_7;

	/**
	 * 第 155 mediator変数
	 */
	protected String m_DLV_KEY_NO_8;

	/**
	 * 第 156 mediator変数
	 */
	protected String m_DLV_KEY_NO_9;

	/**
	 * 第 157 mediator変数
	 */
	protected String m_DLV_KEY_NO_10;

	/**
	 * 第 158 mediator変数
	 */
	protected String m_DLV_KEY_NO_11;

	/**
	 * 第 159 mediator変数
	 */
	protected String m_DLV_KEY_NO_12;

	/**
	 * 第 160 mediator変数
	 */
	protected String m_DLV_KEY_NO_13;

	/**
	 * 第 161 mediator変数
	 */
	protected String m_DLV_KEY_NO_14;

	/**
	 * 第 162 mediator変数
	 */
	protected String m_DLV_KEY_NO_15;

	/**
	 * 第 163 mediator変数
	 */
	protected String m_DLV_KEY_NO_16;

	/**
	 * 第 164 mediator変数
	 */
	protected String m_DLV_KEY_NO_17;

	/**
	 * 第 165 mediator変数
	 */
	protected String m_DLV_KEY_NO_18;

	/**
	 * 第 166 mediator変数
	 */
	protected String m_DLV_KEY_NO_19;

	/**
	 * 第 167 mediator変数
	 */
	protected String m_DLV_KEY_NO_20;

	/**
	 * 第 168 mediator変数
	 */
	protected String m_DLV_KEY_NO_21;

	/**
	 * 第 169 mediator変数
	 */
	protected String m_DLV_KEY_NO_22;

	/**
	 * 第 170 mediator変数
	 */
	protected String m_DLV_KEY_NO_23;

	/**
	 * 第 171 mediator変数
	 */
	protected String m_DLV_KEY_NO_24;

	/**
	 * 第 172 mediator変数
	 */
	protected String m_DLV_KEY_NO_25;

	/**
	 * 第 173 mediator変数
	 */
	protected String m_DLV_KEY_NO_26;

	/**
	 * 第 174 mediator変数
	 */
	protected String m_DLV_KEY_NO_27;

	/**
	 * 第 175 mediator変数
	 */
	protected String m_DLV_KEY_NO_28;

	/**
	 * 第 176 mediator変数
	 */
	protected String m_DLV_KEY_NO_29;

	/**
	 * 第 177 mediator変数
	 */
	protected String m_DLV_KEY_NO_30;

	/**
	 * 第 178 mediator変数
	 */
	protected String m_DLV_KEY_NO_31;

	/**
	 * 第 179 mediator変数
	 */
	protected String m_DLV_LOC_NAME;

	/**
	 * 第 180 mediator変数
	 */
	protected String m_CLIENT_BARCODE_INF;

	/**
	 * 第 181 mediator変数
	 */
	protected String m_CLIENT_REMARK;

	/**
	 * 第 182 mediator変数
	 */
	protected String m_CONTRACT_COND_TYP;

	/**
	 * 第 183 mediator変数
	 */
	protected String m_PUCH_ODR_SHAP_TYP;

	/**
	 * 第 184 mediator変数
	 */
	protected String m_MASTER_PUCH_ODR_CD;

	/**
	 * 第 185 mediator変数
	 */
	protected String m_QTY_CONTRACT_TYP;

	/**
	 * 第 186 mediator変数
	 */
	protected String m_ODR_MODIFICATION_TYP_1;

	/**
	 * 第 187 mediator変数
	 */
	protected String m_ODR_MODIFICATION_TYP_2;

	/**
	 * 第 188 mediator変数
	 */
	protected String m_ODR_MODIFICATION_TYP_3;

	/**
	 * 第 189 mediator変数
	 */
	protected String m_MACHINE_TYP_CD;

	/**
	 * 第 190 mediator変数
	 */
	protected String m_ENGINNERING_CHG_CD;

	/**
	 * 第 191 mediator変数
	 */
	protected String m_DROW_SPEC_CD;

	/**
	 * 第 192 mediator変数
	 */
	protected String m_DLV_DOC_FORM_1;

	/**
	 * 第 193 mediator変数
	 */
	protected Double m_DLV_DOC_COPY_NUM_1;

	/**
	 * 第 194 mediator変数
	 */
	protected String m_DLV_DOC_LANG_1;

	/**
	 * 第 195 mediator変数
	 */
	protected String m_DLV_DOC_FORM_2;

	/**
	 * 第 196 mediator変数
	 */
	protected Double m_DLV_DOC_COPY_NUM_2;

	/**
	 * 第 197 mediator変数
	 */
	protected String m_DLV_DOC_LANG_2;

	/**
	 * 第 198 mediator変数
	 */
	protected String m_DLV_DOC_FORM_3;

	/**
	 * 第 199 mediator変数
	 */
	protected Double m_DLV_DOC_COPY_NUM_3;

	/**
	 * 第 200 mediator変数
	 */
	protected String m_DLV_DOC_LANG_3;

	/**
	 * 第 201 mediator変数
	 */
	protected String m_DLV_DOC_FORM_4;

	/**
	 * 第 202 mediator変数
	 */
	protected Double m_DLV_DOC_COPY_NUM_4;

	/**
	 * 第 203 mediator変数
	 */
	protected String m_DLV_DOC_LANG_4;

	/**
	 * 第 204 mediator変数
	 */
	protected String m_STRATEGIC_GOODS_TYP;

	/**
	 * 第 205 mediator変数
	 */
	protected String m_ORGN_PLACE_CD_1;

	/**
	 * 第 206 mediator変数
	 */
	protected String m_ORGN_PLACE_CD_2;

	/**
	 * 第 207 mediator変数
	 */
	protected String m_ORGN_PLACE_CD_3;

	/**
	 * 第 208 mediator変数
	 */
	protected String m_ORGN_PLACE_CD_4;

	/**
	 * 第 209 mediator変数
	 */
	protected String m_ORGN_PLACE_CD_5;

	/**
	 * 第 210 mediator変数
	 */
	protected String m_DLV_TIME_1;

	/**
	 * 第 211 mediator変数
	 */
	protected String m_DLV_TIME_2;

	/**
	 * 第 212 mediator変数
	 */
	protected String m_DLV_TIME_3;

	/**
	 * 第 213 mediator変数
	 */
	protected String m_DLV_TIME_4;

	/**
	 * 第 214 mediator変数
	 */
	protected String m_DLV_TIME_5;

	/**
	 * 第 215 mediator変数
	 */
	protected String m_DLV_TIME_6;

	/**
	 * 第 216 mediator変数
	 */
	protected String m_DLV_TIME_7;

	/**
	 * 第 217 mediator変数
	 */
	protected String m_DLV_TIME_8;

	/**
	 * 第 218 mediator変数
	 */
	protected String m_DLV_TIME_9;

	/**
	 * 第 219 mediator変数
	 */
	protected String m_DLV_TIME_10;

	/**
	 * 第 220 mediator変数
	 */
	protected String m_DLV_TIME_11;

	/**
	 * 第 221 mediator変数
	 */
	protected String m_DLV_TIME_12;

	/**
	 * 第 222 mediator変数
	 */
	protected String m_DLV_TIME_13;

	/**
	 * 第 223 mediator変数
	 */
	protected String m_DLV_TIME_14;

	/**
	 * 第 224 mediator変数
	 */
	protected String m_DLV_TIME_15;

	/**
	 * 第 225 mediator変数
	 */
	protected String m_DLV_TIME_16;

	/**
	 * 第 226 mediator変数
	 */
	protected String m_DLV_TIME_17;

	/**
	 * 第 227 mediator変数
	 */
	protected String m_DLV_TIME_18;

	/**
	 * 第 228 mediator変数
	 */
	protected String m_DLV_TIME_19;

	/**
	 * 第 229 mediator変数
	 */
	protected String m_DLV_TIME_20;

	/**
	 * 第 230 mediator変数
	 */
	protected String m_DLV_TIME_21;

	/**
	 * 第 231 mediator変数
	 */
	protected String m_DLV_TIME_22;

	/**
	 * 第 232 mediator変数
	 */
	protected String m_DLV_TIME_23;

	/**
	 * 第 233 mediator変数
	 */
	protected String m_DLV_TIME_24;

	/**
	 * 第 234 mediator変数
	 */
	protected String m_DLV_TIME_25;

	/**
	 * 第 235 mediator変数
	 */
	protected String m_DLV_TIME_26;

	/**
	 * 第 236 mediator変数
	 */
	protected String m_DLV_TIME_27;

	/**
	 * 第 237 mediator変数
	 */
	protected String m_DLV_TIME_28;

	/**
	 * 第 238 mediator変数
	 */
	protected String m_DLV_TIME_29;

	/**
	 * 第 239 mediator変数
	 */
	protected String m_DLV_TIME_30;

	/**
	 * 第 240 mediator変数
	 */
	protected String m_DLV_TIME_31;

	/**
	 * 第 241 mediator変数
	 */
	protected String m_PACKAGE_DLV_CD;

	/**
	 * 第 242 mediator変数
	 */
	protected String m_SPEC;

	/**
	 * 第 243 mediator変数
	 */
	protected String m_BUYER_ORG_NAME;

	/**
	 * 第 244 mediator変数
	 */
	protected Double m_DLV_PART_LEN_1;

	/**
	 * 第 245 mediator変数
	 */
	protected Double m_DLV_PART_QTY_1;

	/**
	 * 第 246 mediator変数
	 */
	protected Double m_DLV_PART_LEN_2;

	/**
	 * 第 247 mediator変数
	 */
	protected Double m_DLV_PART_QTY_2;

	/**
	 * 第 248 mediator変数
	 */
	protected Double m_DLV_PART_LEN_3;

	/**
	 * 第 249 mediator変数
	 */
	protected Double m_DLV_PART_QTY_3;

	/**
	 * 第 250 mediator変数
	 */
	protected Double m_DLV_PART_LEN_4;

	/**
	 * 第 251 mediator変数
	 */
	protected Double m_DLV_PART_QTY_4;

	/**
	 * 第 252 mediator変数
	 */
	protected Double m_DLV_PART_LEN_5;

	/**
	 * 第 253 mediator変数
	 */
	protected Double m_DLV_PART_QTY_5;

	/**
	 * 第 254 mediator変数
	 */
	protected Double m_DLV_PART_LEN_6;

	/**
	 * 第 255 mediator変数
	 */
	protected Double m_DLV_PART_QTY_6;

	/**
	 * 第 256 mediator変数
	 */
	protected Double m_DLV_PART_LEN_7;

	/**
	 * 第 257 mediator変数
	 */
	protected Double m_DLV_PART_QTY_7;

	/**
	 * 第 258 mediator変数
	 */
	protected Double m_DLV_PART_LEN_8;

	/**
	 * 第 259 mediator変数
	 */
	protected Double m_DLV_PART_QTY_8;

	/**
	 * 第 260 mediator変数
	 */
	protected Double m_DLV_PART_LEN_9;

	/**
	 * 第 261 mediator変数
	 */
	protected Double m_DLV_PART_QTY_9;

	/**
	 * 第 262 mediator変数
	 */
	protected Double m_DLV_PART_LEN_10;

	/**
	 * 第 263 mediator変数
	 */
	protected Double m_DLV_PART_QTY_10;

	/**
	 * 第 264 mediator変数
	 */
	protected String m_DLV_PART_UNIT;

	/**
	 * 第 265 mediator変数
	 */
	protected String m_CUST_CONSTRUCT_NAME;

	/**
	 * 第 266 mediator変数
	 */
	protected String m_MATERIAL_CD;

	/**
	 * 第 267 mediator変数
	 */
	protected Double m_MATERIAL_UNIT_PRICE;

	/**
	 * 第 268 mediator変数
	 */
	protected String m_MATERIAL_UNIT;

	/**
	 * 第 269 mediator変数
	 */
	protected String m_TEST_REPORT_NEED_TYP;

	/**
	 * 第 270 mediator変数
	 */
	protected String m_TEST_REPORT_CHK_TYP;

	/**
	 * 第 271 mediator変数
	 */
	protected String m_TEST_REPORT_PRESENT_TYP;

	/**
	 * 第 272 mediator変数
	 */
	protected String m_MUNICIPAL_CD;

	/**
	 * 第 273 mediator変数
	 */
	protected String m_DLV_CONTACT_TEL;

	/**
	 * 第 274 mediator変数
	 */
	protected String m_SLIP_PRICE_PRINT_TYP;

	/**
	 * 第 275 mediator変数
	 */
	protected String m_BUYER_NAME_KANJI;

	/**
	 * 第 276 mediator変数
	 */
	protected String m_SPEC_KANJI;

	/**
	 * 第 277 mediator変数
	 */
	protected String m_ITEM_NAME_KANJI;

	/**
	 * 第 278 mediator変数
	 */
	protected String m_REMARKS_KANJI;

	/**
	 * 第 279 mediator変数
	 */
	protected String m_END_USER_NAME_KANJI;

	/**
	 * 第 280 mediator変数
	 */
	protected String m_DLV_ADDRESS_KANJI;

	/**
	 * 第 281 mediator変数
	 */
	protected String m_DLV_ADDRESSEE_KANJI;

	/**
	 * 第 282 mediator変数
	 */
	protected String m_END_USER_ITEM_NAME_KANJI;

	/**
	 * 第 283 mediator変数
	 */
	protected String m_CUST_DESINATED_MAKER_KANJI;

	/**
	 * 第 284 mediator変数
	 */
	protected String m_DLV_LOC_NAME_KANJI;

	/**
	 * 第 285 mediator変数
	 */
	protected String m_CLIENT_REMARK_KANJI;

	/**
	 * 第 286 mediator変数
	 */
	protected String m_MACHINE_TYPE_NAME_KANJI;

	/**
	 * 第 287 mediator変数
	 */
	protected String m_CUST_SPC_KANJI;

	/**
	 * 第 288 mediator変数
	 */
	protected String m_BUYER_ORG_NAME_KANJI;

	/**
	 * 第 289 mediator変数
	 */
	protected String m_CUST_CONSTRUCT_NAME_KANJI;

	/**
	 * 第 290 mediator変数
	 */
	protected String m_CUR_CD;

	/**
	 * 第 291 mediator変数
	 */
	protected Double m_UNIT_PRICE_EXCH_RATES;

	/**
	 * 第 292 mediator変数
	 */
	protected Double m_ODR_AMOUNT_EXCH_RATES;

	/**
	 * 第 293 mediator変数
	 */
	protected Double m_TAX_AMOUNT_EXCH_RATES;

	/**
	 * 第 294 mediator変数
	 */
	protected Double m_TOTAL_AMOUNT_EXCH_RATES;

	/**
	 * 第 295 mediator変数
	 */
	protected Double m_UNCONFIRM_AMOUNT_EXCH_RATES;

	/**
	 * 第 296 mediator変数
	 */
	protected Double m_MATERIAL_CD_EXCH_RATES;

	/**
	 * 第 297 mediator変数
	 */
	protected String m_PLANNING_ODR_CD;

	/**
	 * 第 298 mediator変数
	 */
	protected String m_PLANNING_ODR_DATE;

	/**
	 * 第 299 mediator変数
	 */
	protected Double m_STANDARD_DLV_TERM;

	/**
	 * 第 300 mediator変数
	 */
	protected Double m_REQUIRED_TERM;

	/**
	 * readSysBusinessMessage entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_ODR_INFO_EDI_IF entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SEQ_ODR_INFO_IF_CTRL_NO entity インスタンスを格納します
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
	protected String m_Progname="KP0040B001";

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

	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public Double getODR_INFO_IF_CTRL_NO() { return m_ODR_INFO_IF_CTRL_NO; }
	public Double getDATA_PROC_CD() { return m_DATA_PROC_CD; }
	public String getINFO_TYP_CD() { return m_INFO_TYP_CD; }
	public String getDATA_CREATED_DATE() { return m_DATA_CREATED_DATE; }
	public String getCLIENT_CD() { return m_CLIENT_CD; }
	public String getTRUSTEE_CD() { return m_TRUSTEE_CD; }
	public String getBUYER_ORG_CD() { return m_BUYER_ORG_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getPRDCT_ODR_CD() { return m_PRDCT_ODR_CD; }
	public String getMODIFICATION_CODE() { return m_MODIFICATION_CODE; }
	public String getCOCK_TYP() { return m_COCK_TYP; }
	public String getPUCH_ODR_DATE() { return m_PUCH_ODR_DATE; }
	public String getUNIT() { return m_UNIT; }
	public String getUNIT_PRICE() { return m_UNIT_PRICE; }
	public String getPRICE_TYP() { return m_PRICE_TYP; }
	public Double getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public Double getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getBUYER_NAME() { return m_BUYER_NAME; }
	public String getMATR_SPEC_SIZE() { return m_MATR_SPEC_SIZE; }
	public String getSPECTP() { return m_SPECTP; }
	public String getDROWING_EDITION() { return m_DROWING_EDITION; }
	public String getPART_NAME() { return m_PART_NAME; }
	public String getOWN_ITEM_CD() { return m_OWN_ITEM_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public Double getDROW_SPEC_QTY() { return m_DROW_SPEC_QTY; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getDIRECT_DLV_TYP() { return m_DIRECT_DLV_TYP; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getINSPC_TYP() { return m_INSPC_TYP; }
	public String getDLV_INST_TYP() { return m_DLV_INST_TYP; }
	public String getSCDL_DLV_DATE_1() { return m_SCDL_DLV_DATE_1; }
	public Double getSCDL_DLV_QTY_1() { return m_SCDL_DLV_QTY_1; }
	public String getDLV_CD_1() { return m_DLV_CD_1; }
	public String getSCDL_DLV_DATE_2() { return m_SCDL_DLV_DATE_2; }
	public Double getSCDL_DLV_QTY_2() { return m_SCDL_DLV_QTY_2; }
	public String getDLV_CD_2() { return m_DLV_CD_2; }
	public String getSCDL_DLV_DATE_3() { return m_SCDL_DLV_DATE_3; }
	public Double getSCDL_DLV_QTY_3() { return m_SCDL_DLV_QTY_3; }
	public String getDLV_CD_3() { return m_DLV_CD_3; }
	public String getSCDL_DLV_DATE_4() { return m_SCDL_DLV_DATE_4; }
	public Double getSCDL_DLV_QTY_4() { return m_SCDL_DLV_QTY_4; }
	public String getDLV_CD_4() { return m_DLV_CD_4; }
	public String getSCDL_DLV_DATE_5() { return m_SCDL_DLV_DATE_5; }
	public Double getSCDL_DLV_QTY_5() { return m_SCDL_DLV_QTY_5; }
	public String getDLV_CD_5() { return m_DLV_CD_5; }
	public String getSCDL_DLV_DATE_6() { return m_SCDL_DLV_DATE_6; }
	public Double getSCDL_DLV_QTY_6() { return m_SCDL_DLV_QTY_6; }
	public String getDLV_CD_6() { return m_DLV_CD_6; }
	public String getSCDL_DLV_DATE_7() { return m_SCDL_DLV_DATE_7; }
	public Double getSCDL_DLV_QTY_7() { return m_SCDL_DLV_QTY_7; }
	public String getDLV_CD_7() { return m_DLV_CD_7; }
	public String getSCDL_DLV_DATE_8() { return m_SCDL_DLV_DATE_8; }
	public Double getSCDL_DLV_QTY_8() { return m_SCDL_DLV_QTY_8; }
	public String getDLV_CD_8() { return m_DLV_CD_8; }
	public String getSCDL_DLV_DATE_9() { return m_SCDL_DLV_DATE_9; }
	public Double getSCDL_DLV_QTY_9() { return m_SCDL_DLV_QTY_9; }
	public String getDLV_CD_9() { return m_DLV_CD_9; }
	public String getSCDL_DLV_DATE_10() { return m_SCDL_DLV_DATE_10; }
	public Double getSCDL_DLV_QTY_10() { return m_SCDL_DLV_QTY_10; }
	public String getDLV_CD_10() { return m_DLV_CD_10; }
	public String getSCDL_DLV_DATE_11() { return m_SCDL_DLV_DATE_11; }
	public Double getSCDL_DLV_QTY_11() { return m_SCDL_DLV_QTY_11; }
	public String getDLV_CD_11() { return m_DLV_CD_11; }
	public String getSCDL_DLV_DATE_12() { return m_SCDL_DLV_DATE_12; }
	public Double getSCDL_DLV_QTY_12() { return m_SCDL_DLV_QTY_12; }
	public String getDLV_CD_12() { return m_DLV_CD_12; }
	public String getSCDL_DLV_DATE_13() { return m_SCDL_DLV_DATE_13; }
	public Double getSCDL_DLV_QTY_13() { return m_SCDL_DLV_QTY_13; }
	public String getDLV_CD_13() { return m_DLV_CD_13; }
	public String getSCDL_DLV_DATE_14() { return m_SCDL_DLV_DATE_14; }
	public Double getSCDL_DLV_QTY_14() { return m_SCDL_DLV_QTY_14; }
	public String getDLV_CD_14() { return m_DLV_CD_14; }
	public String getSCDL_DLV_DATE_15() { return m_SCDL_DLV_DATE_15; }
	public Double getSCDL_DLV_QTY_15() { return m_SCDL_DLV_QTY_15; }
	public String getDLV_CD_15() { return m_DLV_CD_15; }
	public String getSCDL_DLV_DATE_16() { return m_SCDL_DLV_DATE_16; }
	public Double getSCDL_DLV_QTY_16() { return m_SCDL_DLV_QTY_16; }
	public String getDLV_CD_16() { return m_DLV_CD_16; }
	public String getSCDL_DLV_DATE_17() { return m_SCDL_DLV_DATE_17; }
	public Double getSCDL_DLV_QTY_17() { return m_SCDL_DLV_QTY_17; }
	public String getDLV_CD_17() { return m_DLV_CD_17; }
	public String getSCDL_DLV_DATE_18() { return m_SCDL_DLV_DATE_18; }
	public Double getSCDL_DLV_QTY_18() { return m_SCDL_DLV_QTY_18; }
	public String getDLV_CD_18() { return m_DLV_CD_18; }
	public String getSCDL_DLV_DATE_19() { return m_SCDL_DLV_DATE_19; }
	public Double getSCDL_DLV_QTY_19() { return m_SCDL_DLV_QTY_19; }
	public String getDLV_CD_19() { return m_DLV_CD_19; }
	public String getSCDL_DLV_DATE_20() { return m_SCDL_DLV_DATE_20; }
	public Double getSCDL_DLV_QTY_20() { return m_SCDL_DLV_QTY_20; }
	public String getDLV_CD_20() { return m_DLV_CD_20; }
	public String getSCDL_DLV_DATE_21() { return m_SCDL_DLV_DATE_21; }
	public Double getSCDL_DLV_QTY_21() { return m_SCDL_DLV_QTY_21; }
	public String getDLV_CD_21() { return m_DLV_CD_21; }
	public String getSCDL_DLV_DATE_22() { return m_SCDL_DLV_DATE_22; }
	public Double getSCDL_DLV_QTY_22() { return m_SCDL_DLV_QTY_22; }
	public String getDLV_CD_22() { return m_DLV_CD_22; }
	public String getSCDL_DLV_DATE_23() { return m_SCDL_DLV_DATE_23; }
	public Double getSCDL_DLV_QTY_23() { return m_SCDL_DLV_QTY_23; }
	public String getDLV_CD_23() { return m_DLV_CD_23; }
	public String getSCDL_DLV_DATE_24() { return m_SCDL_DLV_DATE_24; }
	public Double getSCDL_DLV_QTY_24() { return m_SCDL_DLV_QTY_24; }
	public String getDLV_CD_24() { return m_DLV_CD_24; }
	public String getSCDL_DLV_DATE_25() { return m_SCDL_DLV_DATE_25; }
	public Double getSCDL_DLV_QTY_25() { return m_SCDL_DLV_QTY_25; }
	public String getDLV_CD_25() { return m_DLV_CD_25; }
	public String getSCDL_DLV_DATE_26() { return m_SCDL_DLV_DATE_26; }
	public Double getSCDL_DLV_QTY_26() { return m_SCDL_DLV_QTY_26; }
	public String getDLV_CD_26() { return m_DLV_CD_26; }
	public String getSCDL_DLV_DATE_27() { return m_SCDL_DLV_DATE_27; }
	public Double getSCDL_DLV_QTY_27() { return m_SCDL_DLV_QTY_27; }
	public String getDLV_CD_27() { return m_DLV_CD_27; }
	public String getSCDL_DLV_DATE_28() { return m_SCDL_DLV_DATE_28; }
	public Double getSCDL_DLV_QTY_28() { return m_SCDL_DLV_QTY_28; }
	public String getDLV_CD_28() { return m_DLV_CD_28; }
	public String getSCDL_DLV_DATE_29() { return m_SCDL_DLV_DATE_29; }
	public Double getSCDL_DLV_QTY_29() { return m_SCDL_DLV_QTY_29; }
	public String getDLV_CD_29() { return m_DLV_CD_29; }
	public String getSCDL_DLV_DATE_30() { return m_SCDL_DLV_DATE_30; }
	public Double getSCDL_DLV_QTY_30() { return m_SCDL_DLV_QTY_30; }
	public String getDLV_CD_30() { return m_DLV_CD_30; }
	public String getSCDL_DLV_DATE_31() { return m_SCDL_DLV_DATE_31; }
	public Double getSCDL_DLV_QTY_31() { return m_SCDL_DLV_QTY_31; }
	public String getDLV_CD_31() { return m_DLV_CD_31; }
	public String getFREE_TEXT() { return m_FREE_TEXT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getTAX_TYP() { return m_TAX_TYP; }
	public String getCUST_TAXATION_TYP() { return m_CUST_TAXATION_TYP; }
	public Double getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public Double getCUST_TOTAL_AMOUNT() { return m_CUST_TOTAL_AMOUNT; }
	public String getUNCONFIRM_ODR_CD() { return m_UNCONFIRM_ODR_CD; }
	public String getUNCONFIRM_ODR_DATE() { return m_UNCONFIRM_ODR_DATE; }
	public Double getUNCONFIRM_ODR_QTY() { return m_UNCONFIRM_ODR_QTY; }
	public Double getUNCONFIRM_ODR_AMOUNT() { return m_UNCONFIRM_ODR_AMOUNT; }
	public String getESTIMATE_REQST_CD() { return m_ESTIMATE_REQST_CD; }
	public String getSTL_COND_CD() { return m_STL_COND_CD; }
	public String getEND_USER_NAME() { return m_END_USER_NAME; }
	public String getDLV_ZIP_CD() { return m_DLV_ZIP_CD; }
	public String getDLV_ADDRESS() { return m_DLV_ADDRESS; }
	public String getDLV_ADDRESSEE() { return m_DLV_ADDRESSEE; }
	public String getCUST_COMM_SUBNAME() { return m_CUST_COMM_SUBNAME; }
	public String getCUST_COMM_SUBCD() { return m_CUST_COMM_SUBCD; }
	public String getEND_USER_ODR_CD() { return m_END_USER_ODR_CD; }
	public String getCUST_DESINATED_MAKER() { return m_CUST_DESINATED_MAKER; }
	public String getDLV_KEY_NO_1() { return m_DLV_KEY_NO_1; }
	public String getDLV_KEY_NO_2() { return m_DLV_KEY_NO_2; }
	public String getDLV_KEY_NO_3() { return m_DLV_KEY_NO_3; }
	public String getDLV_KEY_NO_4() { return m_DLV_KEY_NO_4; }
	public String getDLV_KEY_NO_5() { return m_DLV_KEY_NO_5; }
	public String getDLV_KEY_NO_6() { return m_DLV_KEY_NO_6; }
	public String getDLV_KEY_NO_7() { return m_DLV_KEY_NO_7; }
	public String getDLV_KEY_NO_8() { return m_DLV_KEY_NO_8; }
	public String getDLV_KEY_NO_9() { return m_DLV_KEY_NO_9; }
	public String getDLV_KEY_NO_10() { return m_DLV_KEY_NO_10; }
	public String getDLV_KEY_NO_11() { return m_DLV_KEY_NO_11; }
	public String getDLV_KEY_NO_12() { return m_DLV_KEY_NO_12; }
	public String getDLV_KEY_NO_13() { return m_DLV_KEY_NO_13; }
	public String getDLV_KEY_NO_14() { return m_DLV_KEY_NO_14; }
	public String getDLV_KEY_NO_15() { return m_DLV_KEY_NO_15; }
	public String getDLV_KEY_NO_16() { return m_DLV_KEY_NO_16; }
	public String getDLV_KEY_NO_17() { return m_DLV_KEY_NO_17; }
	public String getDLV_KEY_NO_18() { return m_DLV_KEY_NO_18; }
	public String getDLV_KEY_NO_19() { return m_DLV_KEY_NO_19; }
	public String getDLV_KEY_NO_20() { return m_DLV_KEY_NO_20; }
	public String getDLV_KEY_NO_21() { return m_DLV_KEY_NO_21; }
	public String getDLV_KEY_NO_22() { return m_DLV_KEY_NO_22; }
	public String getDLV_KEY_NO_23() { return m_DLV_KEY_NO_23; }
	public String getDLV_KEY_NO_24() { return m_DLV_KEY_NO_24; }
	public String getDLV_KEY_NO_25() { return m_DLV_KEY_NO_25; }
	public String getDLV_KEY_NO_26() { return m_DLV_KEY_NO_26; }
	public String getDLV_KEY_NO_27() { return m_DLV_KEY_NO_27; }
	public String getDLV_KEY_NO_28() { return m_DLV_KEY_NO_28; }
	public String getDLV_KEY_NO_29() { return m_DLV_KEY_NO_29; }
	public String getDLV_KEY_NO_30() { return m_DLV_KEY_NO_30; }
	public String getDLV_KEY_NO_31() { return m_DLV_KEY_NO_31; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getCLIENT_BARCODE_INF() { return m_CLIENT_BARCODE_INF; }
	public String getCLIENT_REMARK() { return m_CLIENT_REMARK; }
	public String getCONTRACT_COND_TYP() { return m_CONTRACT_COND_TYP; }
	public String getPUCH_ODR_SHAP_TYP() { return m_PUCH_ODR_SHAP_TYP; }
	public String getMASTER_PUCH_ODR_CD() { return m_MASTER_PUCH_ODR_CD; }
	public String getQTY_CONTRACT_TYP() { return m_QTY_CONTRACT_TYP; }
	public String getODR_MODIFICATION_TYP_1() { return m_ODR_MODIFICATION_TYP_1; }
	public String getODR_MODIFICATION_TYP_2() { return m_ODR_MODIFICATION_TYP_2; }
	public String getODR_MODIFICATION_TYP_3() { return m_ODR_MODIFICATION_TYP_3; }
	public String getMACHINE_TYP_CD() { return m_MACHINE_TYP_CD; }
	public String getENGINNERING_CHG_CD() { return m_ENGINNERING_CHG_CD; }
	public String getDROW_SPEC_CD() { return m_DROW_SPEC_CD; }
	public String getDLV_DOC_FORM_1() { return m_DLV_DOC_FORM_1; }
	public Double getDLV_DOC_COPY_NUM_1() { return m_DLV_DOC_COPY_NUM_1; }
	public String getDLV_DOC_LANG_1() { return m_DLV_DOC_LANG_1; }
	public String getDLV_DOC_FORM_2() { return m_DLV_DOC_FORM_2; }
	public Double getDLV_DOC_COPY_NUM_2() { return m_DLV_DOC_COPY_NUM_2; }
	public String getDLV_DOC_LANG_2() { return m_DLV_DOC_LANG_2; }
	public String getDLV_DOC_FORM_3() { return m_DLV_DOC_FORM_3; }
	public Double getDLV_DOC_COPY_NUM_3() { return m_DLV_DOC_COPY_NUM_3; }
	public String getDLV_DOC_LANG_3() { return m_DLV_DOC_LANG_3; }
	public String getDLV_DOC_FORM_4() { return m_DLV_DOC_FORM_4; }
	public Double getDLV_DOC_COPY_NUM_4() { return m_DLV_DOC_COPY_NUM_4; }
	public String getDLV_DOC_LANG_4() { return m_DLV_DOC_LANG_4; }
	public String getSTRATEGIC_GOODS_TYP() { return m_STRATEGIC_GOODS_TYP; }
	public String getORGN_PLACE_CD_1() { return m_ORGN_PLACE_CD_1; }
	public String getORGN_PLACE_CD_2() { return m_ORGN_PLACE_CD_2; }
	public String getORGN_PLACE_CD_3() { return m_ORGN_PLACE_CD_3; }
	public String getORGN_PLACE_CD_4() { return m_ORGN_PLACE_CD_4; }
	public String getORGN_PLACE_CD_5() { return m_ORGN_PLACE_CD_5; }
	public String getDLV_TIME_1() { return m_DLV_TIME_1; }
	public String getDLV_TIME_2() { return m_DLV_TIME_2; }
	public String getDLV_TIME_3() { return m_DLV_TIME_3; }
	public String getDLV_TIME_4() { return m_DLV_TIME_4; }
	public String getDLV_TIME_5() { return m_DLV_TIME_5; }
	public String getDLV_TIME_6() { return m_DLV_TIME_6; }
	public String getDLV_TIME_7() { return m_DLV_TIME_7; }
	public String getDLV_TIME_8() { return m_DLV_TIME_8; }
	public String getDLV_TIME_9() { return m_DLV_TIME_9; }
	public String getDLV_TIME_10() { return m_DLV_TIME_10; }
	public String getDLV_TIME_11() { return m_DLV_TIME_11; }
	public String getDLV_TIME_12() { return m_DLV_TIME_12; }
	public String getDLV_TIME_13() { return m_DLV_TIME_13; }
	public String getDLV_TIME_14() { return m_DLV_TIME_14; }
	public String getDLV_TIME_15() { return m_DLV_TIME_15; }
	public String getDLV_TIME_16() { return m_DLV_TIME_16; }
	public String getDLV_TIME_17() { return m_DLV_TIME_17; }
	public String getDLV_TIME_18() { return m_DLV_TIME_18; }
	public String getDLV_TIME_19() { return m_DLV_TIME_19; }
	public String getDLV_TIME_20() { return m_DLV_TIME_20; }
	public String getDLV_TIME_21() { return m_DLV_TIME_21; }
	public String getDLV_TIME_22() { return m_DLV_TIME_22; }
	public String getDLV_TIME_23() { return m_DLV_TIME_23; }
	public String getDLV_TIME_24() { return m_DLV_TIME_24; }
	public String getDLV_TIME_25() { return m_DLV_TIME_25; }
	public String getDLV_TIME_26() { return m_DLV_TIME_26; }
	public String getDLV_TIME_27() { return m_DLV_TIME_27; }
	public String getDLV_TIME_28() { return m_DLV_TIME_28; }
	public String getDLV_TIME_29() { return m_DLV_TIME_29; }
	public String getDLV_TIME_30() { return m_DLV_TIME_30; }
	public String getDLV_TIME_31() { return m_DLV_TIME_31; }
	public String getPACKAGE_DLV_CD() { return m_PACKAGE_DLV_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getBUYER_ORG_NAME() { return m_BUYER_ORG_NAME; }
	public Double getDLV_PART_LEN_1() { return m_DLV_PART_LEN_1; }
	public Double getDLV_PART_QTY_1() { return m_DLV_PART_QTY_1; }
	public Double getDLV_PART_LEN_2() { return m_DLV_PART_LEN_2; }
	public Double getDLV_PART_QTY_2() { return m_DLV_PART_QTY_2; }
	public Double getDLV_PART_LEN_3() { return m_DLV_PART_LEN_3; }
	public Double getDLV_PART_QTY_3() { return m_DLV_PART_QTY_3; }
	public Double getDLV_PART_LEN_4() { return m_DLV_PART_LEN_4; }
	public Double getDLV_PART_QTY_4() { return m_DLV_PART_QTY_4; }
	public Double getDLV_PART_LEN_5() { return m_DLV_PART_LEN_5; }
	public Double getDLV_PART_QTY_5() { return m_DLV_PART_QTY_5; }
	public Double getDLV_PART_LEN_6() { return m_DLV_PART_LEN_6; }
	public Double getDLV_PART_QTY_6() { return m_DLV_PART_QTY_6; }
	public Double getDLV_PART_LEN_7() { return m_DLV_PART_LEN_7; }
	public Double getDLV_PART_QTY_7() { return m_DLV_PART_QTY_7; }
	public Double getDLV_PART_LEN_8() { return m_DLV_PART_LEN_8; }
	public Double getDLV_PART_QTY_8() { return m_DLV_PART_QTY_8; }
	public Double getDLV_PART_LEN_9() { return m_DLV_PART_LEN_9; }
	public Double getDLV_PART_QTY_9() { return m_DLV_PART_QTY_9; }
	public Double getDLV_PART_LEN_10() { return m_DLV_PART_LEN_10; }
	public Double getDLV_PART_QTY_10() { return m_DLV_PART_QTY_10; }
	public String getDLV_PART_UNIT() { return m_DLV_PART_UNIT; }
	public String getCUST_CONSTRUCT_NAME() { return m_CUST_CONSTRUCT_NAME; }
	public String getMATERIAL_CD() { return m_MATERIAL_CD; }
	public Double getMATERIAL_UNIT_PRICE() { return m_MATERIAL_UNIT_PRICE; }
	public String getMATERIAL_UNIT() { return m_MATERIAL_UNIT; }
	public String getTEST_REPORT_NEED_TYP() { return m_TEST_REPORT_NEED_TYP; }
	public String getTEST_REPORT_CHK_TYP() { return m_TEST_REPORT_CHK_TYP; }
	public String getTEST_REPORT_PRESENT_TYP() { return m_TEST_REPORT_PRESENT_TYP; }
	public String getMUNICIPAL_CD() { return m_MUNICIPAL_CD; }
	public String getDLV_CONTACT_TEL() { return m_DLV_CONTACT_TEL; }
	public String getSLIP_PRICE_PRINT_TYP() { return m_SLIP_PRICE_PRINT_TYP; }
	public String getBUYER_NAME_KANJI() { return m_BUYER_NAME_KANJI; }
	public String getSPEC_KANJI() { return m_SPEC_KANJI; }
	public String getITEM_NAME_KANJI() { return m_ITEM_NAME_KANJI; }
	public String getREMARKS_KANJI() { return m_REMARKS_KANJI; }
	public String getEND_USER_NAME_KANJI() { return m_END_USER_NAME_KANJI; }
	public String getDLV_ADDRESS_KANJI() { return m_DLV_ADDRESS_KANJI; }
	public String getDLV_ADDRESSEE_KANJI() { return m_DLV_ADDRESSEE_KANJI; }
	public String getEND_USER_ITEM_NAME_KANJI() { return m_END_USER_ITEM_NAME_KANJI; }
	public String getCUST_DESINATED_MAKER_KANJI() { return m_CUST_DESINATED_MAKER_KANJI; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getCLIENT_REMARK_KANJI() { return m_CLIENT_REMARK_KANJI; }
	public String getMACHINE_TYPE_NAME_KANJI() { return m_MACHINE_TYPE_NAME_KANJI; }
	public String getCUST_SPC_KANJI() { return m_CUST_SPC_KANJI; }
	public String getBUYER_ORG_NAME_KANJI() { return m_BUYER_ORG_NAME_KANJI; }
	public String getCUST_CONSTRUCT_NAME_KANJI() { return m_CUST_CONSTRUCT_NAME_KANJI; }
	public String getCUR_CD() { return m_CUR_CD; }
	public Double getUNIT_PRICE_EXCH_RATES() { return m_UNIT_PRICE_EXCH_RATES; }
	public Double getODR_AMOUNT_EXCH_RATES() { return m_ODR_AMOUNT_EXCH_RATES; }
	public Double getTAX_AMOUNT_EXCH_RATES() { return m_TAX_AMOUNT_EXCH_RATES; }
	public Double getTOTAL_AMOUNT_EXCH_RATES() { return m_TOTAL_AMOUNT_EXCH_RATES; }
	public Double getUNCONFIRM_AMOUNT_EXCH_RATES() { return m_UNCONFIRM_AMOUNT_EXCH_RATES; }
	public Double getMATERIAL_CD_EXCH_RATES() { return m_MATERIAL_CD_EXCH_RATES; }
	public String getPLANNING_ODR_CD() { return m_PLANNING_ODR_CD; }
	public String getPLANNING_ODR_DATE() { return m_PLANNING_ODR_DATE; }
	public Double getSTANDARD_DLV_TERM() { return m_STANDARD_DLV_TERM; }
	public Double getREQUIRED_TERM() { return m_REQUIRED_TERM; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setODR_INFO_IF_CTRL_NO(Double arg) { m_ODR_INFO_IF_CTRL_NO = arg; }
	public void setDATA_PROC_CD(Double arg) { m_DATA_PROC_CD = arg; }
	public void setINFO_TYP_CD(String arg) { m_INFO_TYP_CD = arg; }
	public void setDATA_CREATED_DATE(String arg) { m_DATA_CREATED_DATE = arg; }
	public void setCLIENT_CD(String arg) { m_CLIENT_CD = arg; }
	public void setTRUSTEE_CD(String arg) { m_TRUSTEE_CD = arg; }
	public void setBUYER_ORG_CD(String arg) { m_BUYER_ORG_CD = arg; }
	public void setPUCH_ODR_CD(String arg) { m_PUCH_ODR_CD = arg; }
	public void setPRDCT_ODR_CD(String arg) { m_PRDCT_ODR_CD = arg; }
	public void setMODIFICATION_CODE(String arg) { m_MODIFICATION_CODE = arg; }
	public void setCOCK_TYP(String arg) { m_COCK_TYP = arg; }
	public void setPUCH_ODR_DATE(String arg) { m_PUCH_ODR_DATE = arg; }
	public void setUNIT(String arg) { m_UNIT = arg; }
	public void setUNIT_PRICE(String arg) { m_UNIT_PRICE = arg; }
	public void setPRICE_TYP(String arg) { m_PRICE_TYP = arg; }
	public void setPUCH_ODR_QTY(Double arg) { m_PUCH_ODR_QTY = arg; }
	public void setPUCH_ODR_AMOUNT(Double arg) { m_PUCH_ODR_AMOUNT = arg; }
	public void setCONS_TYP(String arg) { m_CONS_TYP = arg; }
	public void setBUYER_NAME(String arg) { m_BUYER_NAME = arg; }
	public void setMATR_SPEC_SIZE(String arg) { m_MATR_SPEC_SIZE = arg; }
	public void setSPECTP(String arg) { m_SPECTP = arg; }
	public void setDROWING_EDITION(String arg) { m_DROWING_EDITION = arg; }
	public void setPART_NAME(String arg) { m_PART_NAME = arg; }
	public void setOWN_ITEM_CD(String arg) { m_OWN_ITEM_CD = arg; }
	public void setCUST_ITEM_CD(String arg) { m_CUST_ITEM_CD = arg; }
	public void setDROW_SPEC_QTY(Double arg) { m_DROW_SPEC_QTY = arg; }
	public void setPKG_UNIT(String arg) { m_PKG_UNIT = arg; }
	public void setDIRECT_DLV_TYP(String arg) { m_DIRECT_DLV_TYP = arg; }
	public void setDLV_LOC_CD(String arg) { m_DLV_LOC_CD = arg; }
	public void setINSPC_TYP(String arg) { m_INSPC_TYP = arg; }
	public void setDLV_INST_TYP(String arg) { m_DLV_INST_TYP = arg; }
	public void setSCDL_DLV_DATE_1(String arg) { m_SCDL_DLV_DATE_1 = arg; }
	public void setSCDL_DLV_QTY_1(Double arg) { m_SCDL_DLV_QTY_1 = arg; }
	public void setDLV_CD_1(String arg) { m_DLV_CD_1 = arg; }
	public void setSCDL_DLV_DATE_2(String arg) { m_SCDL_DLV_DATE_2 = arg; }
	public void setSCDL_DLV_QTY_2(Double arg) { m_SCDL_DLV_QTY_2 = arg; }
	public void setDLV_CD_2(String arg) { m_DLV_CD_2 = arg; }
	public void setSCDL_DLV_DATE_3(String arg) { m_SCDL_DLV_DATE_3 = arg; }
	public void setSCDL_DLV_QTY_3(Double arg) { m_SCDL_DLV_QTY_3 = arg; }
	public void setDLV_CD_3(String arg) { m_DLV_CD_3 = arg; }
	public void setSCDL_DLV_DATE_4(String arg) { m_SCDL_DLV_DATE_4 = arg; }
	public void setSCDL_DLV_QTY_4(Double arg) { m_SCDL_DLV_QTY_4 = arg; }
	public void setDLV_CD_4(String arg) { m_DLV_CD_4 = arg; }
	public void setSCDL_DLV_DATE_5(String arg) { m_SCDL_DLV_DATE_5 = arg; }
	public void setSCDL_DLV_QTY_5(Double arg) { m_SCDL_DLV_QTY_5 = arg; }
	public void setDLV_CD_5(String arg) { m_DLV_CD_5 = arg; }
	public void setSCDL_DLV_DATE_6(String arg) { m_SCDL_DLV_DATE_6 = arg; }
	public void setSCDL_DLV_QTY_6(Double arg) { m_SCDL_DLV_QTY_6 = arg; }
	public void setDLV_CD_6(String arg) { m_DLV_CD_6 = arg; }
	public void setSCDL_DLV_DATE_7(String arg) { m_SCDL_DLV_DATE_7 = arg; }
	public void setSCDL_DLV_QTY_7(Double arg) { m_SCDL_DLV_QTY_7 = arg; }
	public void setDLV_CD_7(String arg) { m_DLV_CD_7 = arg; }
	public void setSCDL_DLV_DATE_8(String arg) { m_SCDL_DLV_DATE_8 = arg; }
	public void setSCDL_DLV_QTY_8(Double arg) { m_SCDL_DLV_QTY_8 = arg; }
	public void setDLV_CD_8(String arg) { m_DLV_CD_8 = arg; }
	public void setSCDL_DLV_DATE_9(String arg) { m_SCDL_DLV_DATE_9 = arg; }
	public void setSCDL_DLV_QTY_9(Double arg) { m_SCDL_DLV_QTY_9 = arg; }
	public void setDLV_CD_9(String arg) { m_DLV_CD_9 = arg; }
	public void setSCDL_DLV_DATE_10(String arg) { m_SCDL_DLV_DATE_10 = arg; }
	public void setSCDL_DLV_QTY_10(Double arg) { m_SCDL_DLV_QTY_10 = arg; }
	public void setDLV_CD_10(String arg) { m_DLV_CD_10 = arg; }
	public void setSCDL_DLV_DATE_11(String arg) { m_SCDL_DLV_DATE_11 = arg; }
	public void setSCDL_DLV_QTY_11(Double arg) { m_SCDL_DLV_QTY_11 = arg; }
	public void setDLV_CD_11(String arg) { m_DLV_CD_11 = arg; }
	public void setSCDL_DLV_DATE_12(String arg) { m_SCDL_DLV_DATE_12 = arg; }
	public void setSCDL_DLV_QTY_12(Double arg) { m_SCDL_DLV_QTY_12 = arg; }
	public void setDLV_CD_12(String arg) { m_DLV_CD_12 = arg; }
	public void setSCDL_DLV_DATE_13(String arg) { m_SCDL_DLV_DATE_13 = arg; }
	public void setSCDL_DLV_QTY_13(Double arg) { m_SCDL_DLV_QTY_13 = arg; }
	public void setDLV_CD_13(String arg) { m_DLV_CD_13 = arg; }
	public void setSCDL_DLV_DATE_14(String arg) { m_SCDL_DLV_DATE_14 = arg; }
	public void setSCDL_DLV_QTY_14(Double arg) { m_SCDL_DLV_QTY_14 = arg; }
	public void setDLV_CD_14(String arg) { m_DLV_CD_14 = arg; }
	public void setSCDL_DLV_DATE_15(String arg) { m_SCDL_DLV_DATE_15 = arg; }
	public void setSCDL_DLV_QTY_15(Double arg) { m_SCDL_DLV_QTY_15 = arg; }
	public void setDLV_CD_15(String arg) { m_DLV_CD_15 = arg; }
	public void setSCDL_DLV_DATE_16(String arg) { m_SCDL_DLV_DATE_16 = arg; }
	public void setSCDL_DLV_QTY_16(Double arg) { m_SCDL_DLV_QTY_16 = arg; }
	public void setDLV_CD_16(String arg) { m_DLV_CD_16 = arg; }
	public void setSCDL_DLV_DATE_17(String arg) { m_SCDL_DLV_DATE_17 = arg; }
	public void setSCDL_DLV_QTY_17(Double arg) { m_SCDL_DLV_QTY_17 = arg; }
	public void setDLV_CD_17(String arg) { m_DLV_CD_17 = arg; }
	public void setSCDL_DLV_DATE_18(String arg) { m_SCDL_DLV_DATE_18 = arg; }
	public void setSCDL_DLV_QTY_18(Double arg) { m_SCDL_DLV_QTY_18 = arg; }
	public void setDLV_CD_18(String arg) { m_DLV_CD_18 = arg; }
	public void setSCDL_DLV_DATE_19(String arg) { m_SCDL_DLV_DATE_19 = arg; }
	public void setSCDL_DLV_QTY_19(Double arg) { m_SCDL_DLV_QTY_19 = arg; }
	public void setDLV_CD_19(String arg) { m_DLV_CD_19 = arg; }
	public void setSCDL_DLV_DATE_20(String arg) { m_SCDL_DLV_DATE_20 = arg; }
	public void setSCDL_DLV_QTY_20(Double arg) { m_SCDL_DLV_QTY_20 = arg; }
	public void setDLV_CD_20(String arg) { m_DLV_CD_20 = arg; }
	public void setSCDL_DLV_DATE_21(String arg) { m_SCDL_DLV_DATE_21 = arg; }
	public void setSCDL_DLV_QTY_21(Double arg) { m_SCDL_DLV_QTY_21 = arg; }
	public void setDLV_CD_21(String arg) { m_DLV_CD_21 = arg; }
	public void setSCDL_DLV_DATE_22(String arg) { m_SCDL_DLV_DATE_22 = arg; }
	public void setSCDL_DLV_QTY_22(Double arg) { m_SCDL_DLV_QTY_22 = arg; }
	public void setDLV_CD_22(String arg) { m_DLV_CD_22 = arg; }
	public void setSCDL_DLV_DATE_23(String arg) { m_SCDL_DLV_DATE_23 = arg; }
	public void setSCDL_DLV_QTY_23(Double arg) { m_SCDL_DLV_QTY_23 = arg; }
	public void setDLV_CD_23(String arg) { m_DLV_CD_23 = arg; }
	public void setSCDL_DLV_DATE_24(String arg) { m_SCDL_DLV_DATE_24 = arg; }
	public void setSCDL_DLV_QTY_24(Double arg) { m_SCDL_DLV_QTY_24 = arg; }
	public void setDLV_CD_24(String arg) { m_DLV_CD_24 = arg; }
	public void setSCDL_DLV_DATE_25(String arg) { m_SCDL_DLV_DATE_25 = arg; }
	public void setSCDL_DLV_QTY_25(Double arg) { m_SCDL_DLV_QTY_25 = arg; }
	public void setDLV_CD_25(String arg) { m_DLV_CD_25 = arg; }
	public void setSCDL_DLV_DATE_26(String arg) { m_SCDL_DLV_DATE_26 = arg; }
	public void setSCDL_DLV_QTY_26(Double arg) { m_SCDL_DLV_QTY_26 = arg; }
	public void setDLV_CD_26(String arg) { m_DLV_CD_26 = arg; }
	public void setSCDL_DLV_DATE_27(String arg) { m_SCDL_DLV_DATE_27 = arg; }
	public void setSCDL_DLV_QTY_27(Double arg) { m_SCDL_DLV_QTY_27 = arg; }
	public void setDLV_CD_27(String arg) { m_DLV_CD_27 = arg; }
	public void setSCDL_DLV_DATE_28(String arg) { m_SCDL_DLV_DATE_28 = arg; }
	public void setSCDL_DLV_QTY_28(Double arg) { m_SCDL_DLV_QTY_28 = arg; }
	public void setDLV_CD_28(String arg) { m_DLV_CD_28 = arg; }
	public void setSCDL_DLV_DATE_29(String arg) { m_SCDL_DLV_DATE_29 = arg; }
	public void setSCDL_DLV_QTY_29(Double arg) { m_SCDL_DLV_QTY_29 = arg; }
	public void setDLV_CD_29(String arg) { m_DLV_CD_29 = arg; }
	public void setSCDL_DLV_DATE_30(String arg) { m_SCDL_DLV_DATE_30 = arg; }
	public void setSCDL_DLV_QTY_30(Double arg) { m_SCDL_DLV_QTY_30 = arg; }
	public void setDLV_CD_30(String arg) { m_DLV_CD_30 = arg; }
	public void setSCDL_DLV_DATE_31(String arg) { m_SCDL_DLV_DATE_31 = arg; }
	public void setSCDL_DLV_QTY_31(Double arg) { m_SCDL_DLV_QTY_31 = arg; }
	public void setDLV_CD_31(String arg) { m_DLV_CD_31 = arg; }
	public void setFREE_TEXT(String arg) { m_FREE_TEXT = arg; }
	public void setREMARKS(String arg) { m_REMARKS = arg; }
	public void setTAX_TYP(String arg) { m_TAX_TYP = arg; }
	public void setCUST_TAXATION_TYP(String arg) { m_CUST_TAXATION_TYP = arg; }
	public void setTAX_AMOUNT(Double arg) { m_TAX_AMOUNT = arg; }
	public void setCUST_TOTAL_AMOUNT(Double arg) { m_CUST_TOTAL_AMOUNT = arg; }
	public void setUNCONFIRM_ODR_CD(String arg) { m_UNCONFIRM_ODR_CD = arg; }
	public void setUNCONFIRM_ODR_DATE(String arg) { m_UNCONFIRM_ODR_DATE = arg; }
	public void setUNCONFIRM_ODR_QTY(Double arg) { m_UNCONFIRM_ODR_QTY = arg; }
	public void setUNCONFIRM_ODR_AMOUNT(Double arg) { m_UNCONFIRM_ODR_AMOUNT = arg; }
	public void setESTIMATE_REQST_CD(String arg) { m_ESTIMATE_REQST_CD = arg; }
	public void setSTL_COND_CD(String arg) { m_STL_COND_CD = arg; }
	public void setEND_USER_NAME(String arg) { m_END_USER_NAME = arg; }
	public void setDLV_ZIP_CD(String arg) { m_DLV_ZIP_CD = arg; }
	public void setDLV_ADDRESS(String arg) { m_DLV_ADDRESS = arg; }
	public void setDLV_ADDRESSEE(String arg) { m_DLV_ADDRESSEE = arg; }
	public void setCUST_COMM_SUBNAME(String arg) { m_CUST_COMM_SUBNAME = arg; }
	public void setCUST_COMM_SUBCD(String arg) { m_CUST_COMM_SUBCD = arg; }
	public void setEND_USER_ODR_CD(String arg) { m_END_USER_ODR_CD = arg; }
	public void setCUST_DESINATED_MAKER(String arg) { m_CUST_DESINATED_MAKER = arg; }
	public void setDLV_KEY_NO_1(String arg) { m_DLV_KEY_NO_1 = arg; }
	public void setDLV_KEY_NO_2(String arg) { m_DLV_KEY_NO_2 = arg; }
	public void setDLV_KEY_NO_3(String arg) { m_DLV_KEY_NO_3 = arg; }
	public void setDLV_KEY_NO_4(String arg) { m_DLV_KEY_NO_4 = arg; }
	public void setDLV_KEY_NO_5(String arg) { m_DLV_KEY_NO_5 = arg; }
	public void setDLV_KEY_NO_6(String arg) { m_DLV_KEY_NO_6 = arg; }
	public void setDLV_KEY_NO_7(String arg) { m_DLV_KEY_NO_7 = arg; }
	public void setDLV_KEY_NO_8(String arg) { m_DLV_KEY_NO_8 = arg; }
	public void setDLV_KEY_NO_9(String arg) { m_DLV_KEY_NO_9 = arg; }
	public void setDLV_KEY_NO_10(String arg) { m_DLV_KEY_NO_10 = arg; }
	public void setDLV_KEY_NO_11(String arg) { m_DLV_KEY_NO_11 = arg; }
	public void setDLV_KEY_NO_12(String arg) { m_DLV_KEY_NO_12 = arg; }
	public void setDLV_KEY_NO_13(String arg) { m_DLV_KEY_NO_13 = arg; }
	public void setDLV_KEY_NO_14(String arg) { m_DLV_KEY_NO_14 = arg; }
	public void setDLV_KEY_NO_15(String arg) { m_DLV_KEY_NO_15 = arg; }
	public void setDLV_KEY_NO_16(String arg) { m_DLV_KEY_NO_16 = arg; }
	public void setDLV_KEY_NO_17(String arg) { m_DLV_KEY_NO_17 = arg; }
	public void setDLV_KEY_NO_18(String arg) { m_DLV_KEY_NO_18 = arg; }
	public void setDLV_KEY_NO_19(String arg) { m_DLV_KEY_NO_19 = arg; }
	public void setDLV_KEY_NO_20(String arg) { m_DLV_KEY_NO_20 = arg; }
	public void setDLV_KEY_NO_21(String arg) { m_DLV_KEY_NO_21 = arg; }
	public void setDLV_KEY_NO_22(String arg) { m_DLV_KEY_NO_22 = arg; }
	public void setDLV_KEY_NO_23(String arg) { m_DLV_KEY_NO_23 = arg; }
	public void setDLV_KEY_NO_24(String arg) { m_DLV_KEY_NO_24 = arg; }
	public void setDLV_KEY_NO_25(String arg) { m_DLV_KEY_NO_25 = arg; }
	public void setDLV_KEY_NO_26(String arg) { m_DLV_KEY_NO_26 = arg; }
	public void setDLV_KEY_NO_27(String arg) { m_DLV_KEY_NO_27 = arg; }
	public void setDLV_KEY_NO_28(String arg) { m_DLV_KEY_NO_28 = arg; }
	public void setDLV_KEY_NO_29(String arg) { m_DLV_KEY_NO_29 = arg; }
	public void setDLV_KEY_NO_30(String arg) { m_DLV_KEY_NO_30 = arg; }
	public void setDLV_KEY_NO_31(String arg) { m_DLV_KEY_NO_31 = arg; }
	public void setDLV_LOC_NAME(String arg) { m_DLV_LOC_NAME = arg; }
	public void setCLIENT_BARCODE_INF(String arg) { m_CLIENT_BARCODE_INF = arg; }
	public void setCLIENT_REMARK(String arg) { m_CLIENT_REMARK = arg; }
	public void setCONTRACT_COND_TYP(String arg) { m_CONTRACT_COND_TYP = arg; }
	public void setPUCH_ODR_SHAP_TYP(String arg) { m_PUCH_ODR_SHAP_TYP = arg; }
	public void setMASTER_PUCH_ODR_CD(String arg) { m_MASTER_PUCH_ODR_CD = arg; }
	public void setQTY_CONTRACT_TYP(String arg) { m_QTY_CONTRACT_TYP = arg; }
	public void setODR_MODIFICATION_TYP_1(String arg) { m_ODR_MODIFICATION_TYP_1 = arg; }
	public void setODR_MODIFICATION_TYP_2(String arg) { m_ODR_MODIFICATION_TYP_2 = arg; }
	public void setODR_MODIFICATION_TYP_3(String arg) { m_ODR_MODIFICATION_TYP_3 = arg; }
	public void setMACHINE_TYP_CD(String arg) { m_MACHINE_TYP_CD = arg; }
	public void setENGINNERING_CHG_CD(String arg) { m_ENGINNERING_CHG_CD = arg; }
	public void setDROW_SPEC_CD(String arg) { m_DROW_SPEC_CD = arg; }
	public void setDLV_DOC_FORM_1(String arg) { m_DLV_DOC_FORM_1 = arg; }
	public void setDLV_DOC_COPY_NUM_1(Double arg) { m_DLV_DOC_COPY_NUM_1 = arg; }
	public void setDLV_DOC_LANG_1(String arg) { m_DLV_DOC_LANG_1 = arg; }
	public void setDLV_DOC_FORM_2(String arg) { m_DLV_DOC_FORM_2 = arg; }
	public void setDLV_DOC_COPY_NUM_2(Double arg) { m_DLV_DOC_COPY_NUM_2 = arg; }
	public void setDLV_DOC_LANG_2(String arg) { m_DLV_DOC_LANG_2 = arg; }
	public void setDLV_DOC_FORM_3(String arg) { m_DLV_DOC_FORM_3 = arg; }
	public void setDLV_DOC_COPY_NUM_3(Double arg) { m_DLV_DOC_COPY_NUM_3 = arg; }
	public void setDLV_DOC_LANG_3(String arg) { m_DLV_DOC_LANG_3 = arg; }
	public void setDLV_DOC_FORM_4(String arg) { m_DLV_DOC_FORM_4 = arg; }
	public void setDLV_DOC_COPY_NUM_4(Double arg) { m_DLV_DOC_COPY_NUM_4 = arg; }
	public void setDLV_DOC_LANG_4(String arg) { m_DLV_DOC_LANG_4 = arg; }
	public void setSTRATEGIC_GOODS_TYP(String arg) { m_STRATEGIC_GOODS_TYP = arg; }
	public void setORGN_PLACE_CD_1(String arg) { m_ORGN_PLACE_CD_1 = arg; }
	public void setORGN_PLACE_CD_2(String arg) { m_ORGN_PLACE_CD_2 = arg; }
	public void setORGN_PLACE_CD_3(String arg) { m_ORGN_PLACE_CD_3 = arg; }
	public void setORGN_PLACE_CD_4(String arg) { m_ORGN_PLACE_CD_4 = arg; }
	public void setORGN_PLACE_CD_5(String arg) { m_ORGN_PLACE_CD_5 = arg; }
	public void setDLV_TIME_1(String arg) { m_DLV_TIME_1 = arg; }
	public void setDLV_TIME_2(String arg) { m_DLV_TIME_2 = arg; }
	public void setDLV_TIME_3(String arg) { m_DLV_TIME_3 = arg; }
	public void setDLV_TIME_4(String arg) { m_DLV_TIME_4 = arg; }
	public void setDLV_TIME_5(String arg) { m_DLV_TIME_5 = arg; }
	public void setDLV_TIME_6(String arg) { m_DLV_TIME_6 = arg; }
	public void setDLV_TIME_7(String arg) { m_DLV_TIME_7 = arg; }
	public void setDLV_TIME_8(String arg) { m_DLV_TIME_8 = arg; }
	public void setDLV_TIME_9(String arg) { m_DLV_TIME_9 = arg; }
	public void setDLV_TIME_10(String arg) { m_DLV_TIME_10 = arg; }
	public void setDLV_TIME_11(String arg) { m_DLV_TIME_11 = arg; }
	public void setDLV_TIME_12(String arg) { m_DLV_TIME_12 = arg; }
	public void setDLV_TIME_13(String arg) { m_DLV_TIME_13 = arg; }
	public void setDLV_TIME_14(String arg) { m_DLV_TIME_14 = arg; }
	public void setDLV_TIME_15(String arg) { m_DLV_TIME_15 = arg; }
	public void setDLV_TIME_16(String arg) { m_DLV_TIME_16 = arg; }
	public void setDLV_TIME_17(String arg) { m_DLV_TIME_17 = arg; }
	public void setDLV_TIME_18(String arg) { m_DLV_TIME_18 = arg; }
	public void setDLV_TIME_19(String arg) { m_DLV_TIME_19 = arg; }
	public void setDLV_TIME_20(String arg) { m_DLV_TIME_20 = arg; }
	public void setDLV_TIME_21(String arg) { m_DLV_TIME_21 = arg; }
	public void setDLV_TIME_22(String arg) { m_DLV_TIME_22 = arg; }
	public void setDLV_TIME_23(String arg) { m_DLV_TIME_23 = arg; }
	public void setDLV_TIME_24(String arg) { m_DLV_TIME_24 = arg; }
	public void setDLV_TIME_25(String arg) { m_DLV_TIME_25 = arg; }
	public void setDLV_TIME_26(String arg) { m_DLV_TIME_26 = arg; }
	public void setDLV_TIME_27(String arg) { m_DLV_TIME_27 = arg; }
	public void setDLV_TIME_28(String arg) { m_DLV_TIME_28 = arg; }
	public void setDLV_TIME_29(String arg) { m_DLV_TIME_29 = arg; }
	public void setDLV_TIME_30(String arg) { m_DLV_TIME_30 = arg; }
	public void setDLV_TIME_31(String arg) { m_DLV_TIME_31 = arg; }
	public void setPACKAGE_DLV_CD(String arg) { m_PACKAGE_DLV_CD = arg; }
	public void setSPEC(String arg) { m_SPEC = arg; }
	public void setBUYER_ORG_NAME(String arg) { m_BUYER_ORG_NAME = arg; }
	public void setDLV_PART_LEN_1(Double arg) { m_DLV_PART_LEN_1 = arg; }
	public void setDLV_PART_QTY_1(Double arg) { m_DLV_PART_QTY_1 = arg; }
	public void setDLV_PART_LEN_2(Double arg) { m_DLV_PART_LEN_2 = arg; }
	public void setDLV_PART_QTY_2(Double arg) { m_DLV_PART_QTY_2 = arg; }
	public void setDLV_PART_LEN_3(Double arg) { m_DLV_PART_LEN_3 = arg; }
	public void setDLV_PART_QTY_3(Double arg) { m_DLV_PART_QTY_3 = arg; }
	public void setDLV_PART_LEN_4(Double arg) { m_DLV_PART_LEN_4 = arg; }
	public void setDLV_PART_QTY_4(Double arg) { m_DLV_PART_QTY_4 = arg; }
	public void setDLV_PART_LEN_5(Double arg) { m_DLV_PART_LEN_5 = arg; }
	public void setDLV_PART_QTY_5(Double arg) { m_DLV_PART_QTY_5 = arg; }
	public void setDLV_PART_LEN_6(Double arg) { m_DLV_PART_LEN_6 = arg; }
	public void setDLV_PART_QTY_6(Double arg) { m_DLV_PART_QTY_6 = arg; }
	public void setDLV_PART_LEN_7(Double arg) { m_DLV_PART_LEN_7 = arg; }
	public void setDLV_PART_QTY_7(Double arg) { m_DLV_PART_QTY_7 = arg; }
	public void setDLV_PART_LEN_8(Double arg) { m_DLV_PART_LEN_8 = arg; }
	public void setDLV_PART_QTY_8(Double arg) { m_DLV_PART_QTY_8 = arg; }
	public void setDLV_PART_LEN_9(Double arg) { m_DLV_PART_LEN_9 = arg; }
	public void setDLV_PART_QTY_9(Double arg) { m_DLV_PART_QTY_9 = arg; }
	public void setDLV_PART_LEN_10(Double arg) { m_DLV_PART_LEN_10 = arg; }
	public void setDLV_PART_QTY_10(Double arg) { m_DLV_PART_QTY_10 = arg; }
	public void setDLV_PART_UNIT(String arg) { m_DLV_PART_UNIT = arg; }
	public void setCUST_CONSTRUCT_NAME(String arg) { m_CUST_CONSTRUCT_NAME = arg; }
	public void setMATERIAL_CD(String arg) { m_MATERIAL_CD = arg; }
	public void setMATERIAL_UNIT_PRICE(Double arg) { m_MATERIAL_UNIT_PRICE = arg; }
	public void setMATERIAL_UNIT(String arg) { m_MATERIAL_UNIT = arg; }
	public void setTEST_REPORT_NEED_TYP(String arg) { m_TEST_REPORT_NEED_TYP = arg; }
	public void setTEST_REPORT_CHK_TYP(String arg) { m_TEST_REPORT_CHK_TYP = arg; }
	public void setTEST_REPORT_PRESENT_TYP(String arg) { m_TEST_REPORT_PRESENT_TYP = arg; }
	public void setMUNICIPAL_CD(String arg) { m_MUNICIPAL_CD = arg; }
	public void setDLV_CONTACT_TEL(String arg) { m_DLV_CONTACT_TEL = arg; }
	public void setSLIP_PRICE_PRINT_TYP(String arg) { m_SLIP_PRICE_PRINT_TYP = arg; }
	public void setBUYER_NAME_KANJI(String arg) { m_BUYER_NAME_KANJI = arg; }
	public void setSPEC_KANJI(String arg) { m_SPEC_KANJI = arg; }
	public void setITEM_NAME_KANJI(String arg) { m_ITEM_NAME_KANJI = arg; }
	public void setREMARKS_KANJI(String arg) { m_REMARKS_KANJI = arg; }
	public void setEND_USER_NAME_KANJI(String arg) { m_END_USER_NAME_KANJI = arg; }
	public void setDLV_ADDRESS_KANJI(String arg) { m_DLV_ADDRESS_KANJI = arg; }
	public void setDLV_ADDRESSEE_KANJI(String arg) { m_DLV_ADDRESSEE_KANJI = arg; }
	public void setEND_USER_ITEM_NAME_KANJI(String arg) { m_END_USER_ITEM_NAME_KANJI = arg; }
	public void setCUST_DESINATED_MAKER_KANJI(String arg) { m_CUST_DESINATED_MAKER_KANJI = arg; }
	public void setDLV_LOC_NAME_KANJI(String arg) { m_DLV_LOC_NAME_KANJI = arg; }
	public void setCLIENT_REMARK_KANJI(String arg) { m_CLIENT_REMARK_KANJI = arg; }
	public void setMACHINE_TYPE_NAME_KANJI(String arg) { m_MACHINE_TYPE_NAME_KANJI = arg; }
	public void setCUST_SPC_KANJI(String arg) { m_CUST_SPC_KANJI = arg; }
	public void setBUYER_ORG_NAME_KANJI(String arg) { m_BUYER_ORG_NAME_KANJI = arg; }
	public void setCUST_CONSTRUCT_NAME_KANJI(String arg) { m_CUST_CONSTRUCT_NAME_KANJI = arg; }
	public void setCUR_CD(String arg) { m_CUR_CD = arg; }
	public void setUNIT_PRICE_EXCH_RATES(Double arg) { m_UNIT_PRICE_EXCH_RATES = arg; }
	public void setODR_AMOUNT_EXCH_RATES(Double arg) { m_ODR_AMOUNT_EXCH_RATES = arg; }
	public void setTAX_AMOUNT_EXCH_RATES(Double arg) { m_TAX_AMOUNT_EXCH_RATES = arg; }
	public void setTOTAL_AMOUNT_EXCH_RATES(Double arg) { m_TOTAL_AMOUNT_EXCH_RATES = arg; }
	public void setUNCONFIRM_AMOUNT_EXCH_RATES(Double arg) { m_UNCONFIRM_AMOUNT_EXCH_RATES = arg; }
	public void setMATERIAL_CD_EXCH_RATES(Double arg) { m_MATERIAL_CD_EXCH_RATES = arg; }
	public void setPLANNING_ODR_CD(String arg) { m_PLANNING_ODR_CD = arg; }
	public void setPLANNING_ODR_DATE(String arg) { m_PLANNING_ODR_DATE = arg; }
	public void setSTANDARD_DLV_TERM(Double arg) { m_STANDARD_DLV_TERM = arg; }
	public void setREQUIRED_TERM(Double arg) { m_REQUIRED_TERM = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity0; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getT_ODR_INFO_EDI_IF() { return m_entity1; }
	public void setT_ODR_INFO_EDI_IF(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSEQ_ODR_INFO_IF_CTRL_NO() { return m_entity2; }
	public void setSEQ_ODR_INFO_IF_CTRL_NO(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKP0040B001クラスの標準コンストラクタ
	 *
		 */
	public medKP0040B001()
	{
		// mediator変数を初期化します
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_ODR_INFO_IF_CTRL_NO = null;
		m_DATA_PROC_CD = null;
		m_INFO_TYP_CD = null;
		m_DATA_CREATED_DATE = null;
		m_CLIENT_CD = null;
		m_TRUSTEE_CD = null;
		m_BUYER_ORG_CD = null;
		m_PUCH_ODR_CD = null;
		m_PRDCT_ODR_CD = null;
		m_MODIFICATION_CODE = null;
		m_COCK_TYP = null;
		m_PUCH_ODR_DATE = null;
		m_UNIT = null;
		m_UNIT_PRICE = null;
		m_PRICE_TYP = null;
		m_PUCH_ODR_QTY = null;
		m_PUCH_ODR_AMOUNT = null;
		m_CONS_TYP = null;
		m_BUYER_NAME = null;
		m_MATR_SPEC_SIZE = null;
		m_SPECTP = null;
		m_DROWING_EDITION = null;
		m_PART_NAME = null;
		m_OWN_ITEM_CD = null;
		m_CUST_ITEM_CD = null;
		m_DROW_SPEC_QTY = null;
		m_PKG_UNIT = null;
		m_DIRECT_DLV_TYP = null;
		m_DLV_LOC_CD = null;
		m_INSPC_TYP = null;
		m_DLV_INST_TYP = null;
		m_SCDL_DLV_DATE_1 = null;
		m_SCDL_DLV_QTY_1 = null;
		m_DLV_CD_1 = null;
		m_SCDL_DLV_DATE_2 = null;
		m_SCDL_DLV_QTY_2 = null;
		m_DLV_CD_2 = null;
		m_SCDL_DLV_DATE_3 = null;
		m_SCDL_DLV_QTY_3 = null;
		m_DLV_CD_3 = null;
		m_SCDL_DLV_DATE_4 = null;
		m_SCDL_DLV_QTY_4 = null;
		m_DLV_CD_4 = null;
		m_SCDL_DLV_DATE_5 = null;
		m_SCDL_DLV_QTY_5 = null;
		m_DLV_CD_5 = null;
		m_SCDL_DLV_DATE_6 = null;
		m_SCDL_DLV_QTY_6 = null;
		m_DLV_CD_6 = null;
		m_SCDL_DLV_DATE_7 = null;
		m_SCDL_DLV_QTY_7 = null;
		m_DLV_CD_7 = null;
		m_SCDL_DLV_DATE_8 = null;
		m_SCDL_DLV_QTY_8 = null;
		m_DLV_CD_8 = null;
		m_SCDL_DLV_DATE_9 = null;
		m_SCDL_DLV_QTY_9 = null;
		m_DLV_CD_9 = null;
		m_SCDL_DLV_DATE_10 = null;
		m_SCDL_DLV_QTY_10 = null;
		m_DLV_CD_10 = null;
		m_SCDL_DLV_DATE_11 = null;
		m_SCDL_DLV_QTY_11 = null;
		m_DLV_CD_11 = null;
		m_SCDL_DLV_DATE_12 = null;
		m_SCDL_DLV_QTY_12 = null;
		m_DLV_CD_12 = null;
		m_SCDL_DLV_DATE_13 = null;
		m_SCDL_DLV_QTY_13 = null;
		m_DLV_CD_13 = null;
		m_SCDL_DLV_DATE_14 = null;
		m_SCDL_DLV_QTY_14 = null;
		m_DLV_CD_14 = null;
		m_SCDL_DLV_DATE_15 = null;
		m_SCDL_DLV_QTY_15 = null;
		m_DLV_CD_15 = null;
		m_SCDL_DLV_DATE_16 = null;
		m_SCDL_DLV_QTY_16 = null;
		m_DLV_CD_16 = null;
		m_SCDL_DLV_DATE_17 = null;
		m_SCDL_DLV_QTY_17 = null;
		m_DLV_CD_17 = null;
		m_SCDL_DLV_DATE_18 = null;
		m_SCDL_DLV_QTY_18 = null;
		m_DLV_CD_18 = null;
		m_SCDL_DLV_DATE_19 = null;
		m_SCDL_DLV_QTY_19 = null;
		m_DLV_CD_19 = null;
		m_SCDL_DLV_DATE_20 = null;
		m_SCDL_DLV_QTY_20 = null;
		m_DLV_CD_20 = null;
		m_SCDL_DLV_DATE_21 = null;
		m_SCDL_DLV_QTY_21 = null;
		m_DLV_CD_21 = null;
		m_SCDL_DLV_DATE_22 = null;
		m_SCDL_DLV_QTY_22 = null;
		m_DLV_CD_22 = null;
		m_SCDL_DLV_DATE_23 = null;
		m_SCDL_DLV_QTY_23 = null;
		m_DLV_CD_23 = null;
		m_SCDL_DLV_DATE_24 = null;
		m_SCDL_DLV_QTY_24 = null;
		m_DLV_CD_24 = null;
		m_SCDL_DLV_DATE_25 = null;
		m_SCDL_DLV_QTY_25 = null;
		m_DLV_CD_25 = null;
		m_SCDL_DLV_DATE_26 = null;
		m_SCDL_DLV_QTY_26 = null;
		m_DLV_CD_26 = null;
		m_SCDL_DLV_DATE_27 = null;
		m_SCDL_DLV_QTY_27 = null;
		m_DLV_CD_27 = null;
		m_SCDL_DLV_DATE_28 = null;
		m_SCDL_DLV_QTY_28 = null;
		m_DLV_CD_28 = null;
		m_SCDL_DLV_DATE_29 = null;
		m_SCDL_DLV_QTY_29 = null;
		m_DLV_CD_29 = null;
		m_SCDL_DLV_DATE_30 = null;
		m_SCDL_DLV_QTY_30 = null;
		m_DLV_CD_30 = null;
		m_SCDL_DLV_DATE_31 = null;
		m_SCDL_DLV_QTY_31 = null;
		m_DLV_CD_31 = null;
		m_FREE_TEXT = null;
		m_REMARKS = null;
		m_TAX_TYP = null;
		m_CUST_TAXATION_TYP = null;
		m_TAX_AMOUNT = null;
		m_CUST_TOTAL_AMOUNT = null;
		m_UNCONFIRM_ODR_CD = null;
		m_UNCONFIRM_ODR_DATE = null;
		m_UNCONFIRM_ODR_QTY = null;
		m_UNCONFIRM_ODR_AMOUNT = null;
		m_ESTIMATE_REQST_CD = null;
		m_STL_COND_CD = null;
		m_END_USER_NAME = null;
		m_DLV_ZIP_CD = null;
		m_DLV_ADDRESS = null;
		m_DLV_ADDRESSEE = null;
		m_CUST_COMM_SUBNAME = null;
		m_CUST_COMM_SUBCD = null;
		m_END_USER_ODR_CD = null;
		m_CUST_DESINATED_MAKER = null;
		m_DLV_KEY_NO_1 = null;
		m_DLV_KEY_NO_2 = null;
		m_DLV_KEY_NO_3 = null;
		m_DLV_KEY_NO_4 = null;
		m_DLV_KEY_NO_5 = null;
		m_DLV_KEY_NO_6 = null;
		m_DLV_KEY_NO_7 = null;
		m_DLV_KEY_NO_8 = null;
		m_DLV_KEY_NO_9 = null;
		m_DLV_KEY_NO_10 = null;
		m_DLV_KEY_NO_11 = null;
		m_DLV_KEY_NO_12 = null;
		m_DLV_KEY_NO_13 = null;
		m_DLV_KEY_NO_14 = null;
		m_DLV_KEY_NO_15 = null;
		m_DLV_KEY_NO_16 = null;
		m_DLV_KEY_NO_17 = null;
		m_DLV_KEY_NO_18 = null;
		m_DLV_KEY_NO_19 = null;
		m_DLV_KEY_NO_20 = null;
		m_DLV_KEY_NO_21 = null;
		m_DLV_KEY_NO_22 = null;
		m_DLV_KEY_NO_23 = null;
		m_DLV_KEY_NO_24 = null;
		m_DLV_KEY_NO_25 = null;
		m_DLV_KEY_NO_26 = null;
		m_DLV_KEY_NO_27 = null;
		m_DLV_KEY_NO_28 = null;
		m_DLV_KEY_NO_29 = null;
		m_DLV_KEY_NO_30 = null;
		m_DLV_KEY_NO_31 = null;
		m_DLV_LOC_NAME = null;
		m_CLIENT_BARCODE_INF = null;
		m_CLIENT_REMARK = null;
		m_CONTRACT_COND_TYP = null;
		m_PUCH_ODR_SHAP_TYP = null;
		m_MASTER_PUCH_ODR_CD = null;
		m_QTY_CONTRACT_TYP = null;
		m_ODR_MODIFICATION_TYP_1 = null;
		m_ODR_MODIFICATION_TYP_2 = null;
		m_ODR_MODIFICATION_TYP_3 = null;
		m_MACHINE_TYP_CD = null;
		m_ENGINNERING_CHG_CD = null;
		m_DROW_SPEC_CD = null;
		m_DLV_DOC_FORM_1 = null;
		m_DLV_DOC_COPY_NUM_1 = null;
		m_DLV_DOC_LANG_1 = null;
		m_DLV_DOC_FORM_2 = null;
		m_DLV_DOC_COPY_NUM_2 = null;
		m_DLV_DOC_LANG_2 = null;
		m_DLV_DOC_FORM_3 = null;
		m_DLV_DOC_COPY_NUM_3 = null;
		m_DLV_DOC_LANG_3 = null;
		m_DLV_DOC_FORM_4 = null;
		m_DLV_DOC_COPY_NUM_4 = null;
		m_DLV_DOC_LANG_4 = null;
		m_STRATEGIC_GOODS_TYP = null;
		m_ORGN_PLACE_CD_1 = null;
		m_ORGN_PLACE_CD_2 = null;
		m_ORGN_PLACE_CD_3 = null;
		m_ORGN_PLACE_CD_4 = null;
		m_ORGN_PLACE_CD_5 = null;
		m_DLV_TIME_1 = null;
		m_DLV_TIME_2 = null;
		m_DLV_TIME_3 = null;
		m_DLV_TIME_4 = null;
		m_DLV_TIME_5 = null;
		m_DLV_TIME_6 = null;
		m_DLV_TIME_7 = null;
		m_DLV_TIME_8 = null;
		m_DLV_TIME_9 = null;
		m_DLV_TIME_10 = null;
		m_DLV_TIME_11 = null;
		m_DLV_TIME_12 = null;
		m_DLV_TIME_13 = null;
		m_DLV_TIME_14 = null;
		m_DLV_TIME_15 = null;
		m_DLV_TIME_16 = null;
		m_DLV_TIME_17 = null;
		m_DLV_TIME_18 = null;
		m_DLV_TIME_19 = null;
		m_DLV_TIME_20 = null;
		m_DLV_TIME_21 = null;
		m_DLV_TIME_22 = null;
		m_DLV_TIME_23 = null;
		m_DLV_TIME_24 = null;
		m_DLV_TIME_25 = null;
		m_DLV_TIME_26 = null;
		m_DLV_TIME_27 = null;
		m_DLV_TIME_28 = null;
		m_DLV_TIME_29 = null;
		m_DLV_TIME_30 = null;
		m_DLV_TIME_31 = null;
		m_PACKAGE_DLV_CD = null;
		m_SPEC = null;
		m_BUYER_ORG_NAME = null;
		m_DLV_PART_LEN_1 = null;
		m_DLV_PART_QTY_1 = null;
		m_DLV_PART_LEN_2 = null;
		m_DLV_PART_QTY_2 = null;
		m_DLV_PART_LEN_3 = null;
		m_DLV_PART_QTY_3 = null;
		m_DLV_PART_LEN_4 = null;
		m_DLV_PART_QTY_4 = null;
		m_DLV_PART_LEN_5 = null;
		m_DLV_PART_QTY_5 = null;
		m_DLV_PART_LEN_6 = null;
		m_DLV_PART_QTY_6 = null;
		m_DLV_PART_LEN_7 = null;
		m_DLV_PART_QTY_7 = null;
		m_DLV_PART_LEN_8 = null;
		m_DLV_PART_QTY_8 = null;
		m_DLV_PART_LEN_9 = null;
		m_DLV_PART_QTY_9 = null;
		m_DLV_PART_LEN_10 = null;
		m_DLV_PART_QTY_10 = null;
		m_DLV_PART_UNIT = null;
		m_CUST_CONSTRUCT_NAME = null;
		m_MATERIAL_CD = null;
		m_MATERIAL_UNIT_PRICE = null;
		m_MATERIAL_UNIT = null;
		m_TEST_REPORT_NEED_TYP = null;
		m_TEST_REPORT_CHK_TYP = null;
		m_TEST_REPORT_PRESENT_TYP = null;
		m_MUNICIPAL_CD = null;
		m_DLV_CONTACT_TEL = null;
		m_SLIP_PRICE_PRINT_TYP = null;
		m_BUYER_NAME_KANJI = null;
		m_SPEC_KANJI = null;
		m_ITEM_NAME_KANJI = null;
		m_REMARKS_KANJI = null;
		m_END_USER_NAME_KANJI = null;
		m_DLV_ADDRESS_KANJI = null;
		m_DLV_ADDRESSEE_KANJI = null;
		m_END_USER_ITEM_NAME_KANJI = null;
		m_CUST_DESINATED_MAKER_KANJI = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_CLIENT_REMARK_KANJI = null;
		m_MACHINE_TYPE_NAME_KANJI = null;
		m_CUST_SPC_KANJI = null;
		m_BUYER_ORG_NAME_KANJI = null;
		m_CUST_CONSTRUCT_NAME_KANJI = null;
		m_CUR_CD = null;
		m_UNIT_PRICE_EXCH_RATES = null;
		m_ODR_AMOUNT_EXCH_RATES = null;
		m_TAX_AMOUNT_EXCH_RATES = null;
		m_TOTAL_AMOUNT_EXCH_RATES = null;
		m_UNCONFIRM_AMOUNT_EXCH_RATES = null;
		m_MATERIAL_CD_EXCH_RATES = null;
		m_PLANNING_ODR_CD = null;
		m_PLANNING_ODR_DATE = null;
		m_STANDARD_DLV_TERM = null;
		m_REQUIRED_TERM = null;

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
