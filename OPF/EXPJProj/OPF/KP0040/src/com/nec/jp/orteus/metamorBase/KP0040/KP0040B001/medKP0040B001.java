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
 * �e���v���[�g�����F
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 * EXPJ    (2004/03/21),EXPLANNER/J�p�ɉ���
 *                      SystemLog�̋L�q��ǉ��B
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

/**
 * CLASS     : medKP0040B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.13 $ $Date: 2015/12/03 08:53:22 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKP0040B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected Double m_ODR_INFO_IF_CTRL_NO;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected Double m_DATA_PROC_CD;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_INFO_TYP_CD;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_DATA_CREATED_DATE;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_CLIENT_CD;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_TRUSTEE_CD;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_BUYER_ORG_CD;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_PUCH_ODR_CD;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_PRDCT_ODR_CD;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_MODIFICATION_CODE;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_COCK_TYP;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_PUCH_ODR_DATE;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_UNIT;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_UNIT_PRICE;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_PRICE_TYP;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected Double m_PUCH_ODR_QTY;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected Double m_PUCH_ODR_AMOUNT;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_CONS_TYP;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_BUYER_NAME;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_MATR_SPEC_SIZE;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_SPECTP;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_DROWING_EDITION;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_PART_NAME;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_OWN_ITEM_CD;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_CUST_ITEM_CD;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected Double m_DROW_SPEC_QTY;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_PKG_UNIT;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_DIRECT_DLV_TYP;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_DLV_LOC_CD;

	/**
	 * �� 33 mediator�ϐ�
	 */
	protected String m_INSPC_TYP;

	/**
	 * �� 34 mediator�ϐ�
	 */
	protected String m_DLV_INST_TYP;

	/**
	 * �� 35 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_1;

	/**
	 * �� 36 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_1;

	/**
	 * �� 37 mediator�ϐ�
	 */
	protected String m_DLV_CD_1;

	/**
	 * �� 38 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_2;

	/**
	 * �� 39 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_2;

	/**
	 * �� 40 mediator�ϐ�
	 */
	protected String m_DLV_CD_2;

	/**
	 * �� 41 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_3;

	/**
	 * �� 42 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_3;

	/**
	 * �� 43 mediator�ϐ�
	 */
	protected String m_DLV_CD_3;

	/**
	 * �� 44 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_4;

	/**
	 * �� 45 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_4;

	/**
	 * �� 46 mediator�ϐ�
	 */
	protected String m_DLV_CD_4;

	/**
	 * �� 47 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_5;

	/**
	 * �� 48 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_5;

	/**
	 * �� 49 mediator�ϐ�
	 */
	protected String m_DLV_CD_5;

	/**
	 * �� 50 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_6;

	/**
	 * �� 51 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_6;

	/**
	 * �� 52 mediator�ϐ�
	 */
	protected String m_DLV_CD_6;

	/**
	 * �� 53 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_7;

	/**
	 * �� 54 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_7;

	/**
	 * �� 55 mediator�ϐ�
	 */
	protected String m_DLV_CD_7;

	/**
	 * �� 56 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_8;

	/**
	 * �� 57 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_8;

	/**
	 * �� 58 mediator�ϐ�
	 */
	protected String m_DLV_CD_8;

	/**
	 * �� 59 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_9;

	/**
	 * �� 60 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_9;

	/**
	 * �� 61 mediator�ϐ�
	 */
	protected String m_DLV_CD_9;

	/**
	 * �� 62 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_10;

	/**
	 * �� 63 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_10;

	/**
	 * �� 64 mediator�ϐ�
	 */
	protected String m_DLV_CD_10;

	/**
	 * �� 65 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_11;

	/**
	 * �� 66 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_11;

	/**
	 * �� 67 mediator�ϐ�
	 */
	protected String m_DLV_CD_11;

	/**
	 * �� 68 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_12;

	/**
	 * �� 69 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_12;

	/**
	 * �� 70 mediator�ϐ�
	 */
	protected String m_DLV_CD_12;

	/**
	 * �� 71 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_13;

	/**
	 * �� 72 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_13;

	/**
	 * �� 73 mediator�ϐ�
	 */
	protected String m_DLV_CD_13;

	/**
	 * �� 74 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_14;

	/**
	 * �� 75 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_14;

	/**
	 * �� 76 mediator�ϐ�
	 */
	protected String m_DLV_CD_14;

	/**
	 * �� 77 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_15;

	/**
	 * �� 78 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_15;

	/**
	 * �� 79 mediator�ϐ�
	 */
	protected String m_DLV_CD_15;

	/**
	 * �� 80 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_16;

	/**
	 * �� 81 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_16;

	/**
	 * �� 82 mediator�ϐ�
	 */
	protected String m_DLV_CD_16;

	/**
	 * �� 83 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_17;

	/**
	 * �� 84 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_17;

	/**
	 * �� 85 mediator�ϐ�
	 */
	protected String m_DLV_CD_17;

	/**
	 * �� 86 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_18;

	/**
	 * �� 87 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_18;

	/**
	 * �� 88 mediator�ϐ�
	 */
	protected String m_DLV_CD_18;

	/**
	 * �� 89 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_19;

	/**
	 * �� 90 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_19;

	/**
	 * �� 91 mediator�ϐ�
	 */
	protected String m_DLV_CD_19;

	/**
	 * �� 92 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_20;

	/**
	 * �� 93 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_20;

	/**
	 * �� 94 mediator�ϐ�
	 */
	protected String m_DLV_CD_20;

	/**
	 * �� 95 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_21;

	/**
	 * �� 96 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_21;

	/**
	 * �� 97 mediator�ϐ�
	 */
	protected String m_DLV_CD_21;

	/**
	 * �� 98 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_22;

	/**
	 * �� 99 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_22;

	/**
	 * �� 100 mediator�ϐ�
	 */
	protected String m_DLV_CD_22;

	/**
	 * �� 101 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_23;

	/**
	 * �� 102 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_23;

	/**
	 * �� 103 mediator�ϐ�
	 */
	protected String m_DLV_CD_23;

	/**
	 * �� 104 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_24;

	/**
	 * �� 105 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_24;

	/**
	 * �� 106 mediator�ϐ�
	 */
	protected String m_DLV_CD_24;

	/**
	 * �� 107 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_25;

	/**
	 * �� 108 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_25;

	/**
	 * �� 109 mediator�ϐ�
	 */
	protected String m_DLV_CD_25;

	/**
	 * �� 110 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_26;

	/**
	 * �� 111 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_26;

	/**
	 * �� 112 mediator�ϐ�
	 */
	protected String m_DLV_CD_26;

	/**
	 * �� 113 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_27;

	/**
	 * �� 114 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_27;

	/**
	 * �� 115 mediator�ϐ�
	 */
	protected String m_DLV_CD_27;

	/**
	 * �� 116 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_28;

	/**
	 * �� 117 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_28;

	/**
	 * �� 118 mediator�ϐ�
	 */
	protected String m_DLV_CD_28;

	/**
	 * �� 119 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_29;

	/**
	 * �� 120 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_29;

	/**
	 * �� 121 mediator�ϐ�
	 */
	protected String m_DLV_CD_29;

	/**
	 * �� 122 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_30;

	/**
	 * �� 123 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_30;

	/**
	 * �� 124 mediator�ϐ�
	 */
	protected String m_DLV_CD_30;

	/**
	 * �� 125 mediator�ϐ�
	 */
	protected String m_SCDL_DLV_DATE_31;

	/**
	 * �� 126 mediator�ϐ�
	 */
	protected Double m_SCDL_DLV_QTY_31;

	/**
	 * �� 127 mediator�ϐ�
	 */
	protected String m_DLV_CD_31;

	/**
	 * �� 128 mediator�ϐ�
	 */
	protected String m_FREE_TEXT;

	/**
	 * �� 129 mediator�ϐ�
	 */
	protected String m_REMARKS;

	/**
	 * �� 130 mediator�ϐ�
	 */
	protected String m_TAX_TYP;

	/**
	 * �� 131 mediator�ϐ�
	 */
	protected String m_CUST_TAXATION_TYP;

	/**
	 * �� 132 mediator�ϐ�
	 */
	protected Double m_TAX_AMOUNT;

	/**
	 * �� 133 mediator�ϐ�
	 */
	protected Double m_CUST_TOTAL_AMOUNT;

	/**
	 * �� 134 mediator�ϐ�
	 */
	protected String m_UNCONFIRM_ODR_CD;

	/**
	 * �� 135 mediator�ϐ�
	 */
	protected String m_UNCONFIRM_ODR_DATE;

	/**
	 * �� 136 mediator�ϐ�
	 */
	protected Double m_UNCONFIRM_ODR_QTY;

	/**
	 * �� 137 mediator�ϐ�
	 */
	protected Double m_UNCONFIRM_ODR_AMOUNT;

	/**
	 * �� 138 mediator�ϐ�
	 */
	protected String m_ESTIMATE_REQST_CD;

	/**
	 * �� 139 mediator�ϐ�
	 */
	protected String m_STL_COND_CD;

	/**
	 * �� 140 mediator�ϐ�
	 */
	protected String m_END_USER_NAME;

	/**
	 * �� 141 mediator�ϐ�
	 */
	protected String m_DLV_ZIP_CD;

	/**
	 * �� 142 mediator�ϐ�
	 */
	protected String m_DLV_ADDRESS;

	/**
	 * �� 143 mediator�ϐ�
	 */
	protected String m_DLV_ADDRESSEE;

	/**
	 * �� 144 mediator�ϐ�
	 */
	protected String m_CUST_COMM_SUBNAME;

	/**
	 * �� 145 mediator�ϐ�
	 */
	protected String m_CUST_COMM_SUBCD;

	/**
	 * �� 146 mediator�ϐ�
	 */
	protected String m_END_USER_ODR_CD;

	/**
	 * �� 147 mediator�ϐ�
	 */
	protected String m_CUST_DESINATED_MAKER;

	/**
	 * �� 148 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_1;

	/**
	 * �� 149 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_2;

	/**
	 * �� 150 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_3;

	/**
	 * �� 151 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_4;

	/**
	 * �� 152 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_5;

	/**
	 * �� 153 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_6;

	/**
	 * �� 154 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_7;

	/**
	 * �� 155 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_8;

	/**
	 * �� 156 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_9;

	/**
	 * �� 157 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_10;

	/**
	 * �� 158 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_11;

	/**
	 * �� 159 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_12;

	/**
	 * �� 160 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_13;

	/**
	 * �� 161 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_14;

	/**
	 * �� 162 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_15;

	/**
	 * �� 163 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_16;

	/**
	 * �� 164 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_17;

	/**
	 * �� 165 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_18;

	/**
	 * �� 166 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_19;

	/**
	 * �� 167 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_20;

	/**
	 * �� 168 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_21;

	/**
	 * �� 169 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_22;

	/**
	 * �� 170 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_23;

	/**
	 * �� 171 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_24;

	/**
	 * �� 172 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_25;

	/**
	 * �� 173 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_26;

	/**
	 * �� 174 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_27;

	/**
	 * �� 175 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_28;

	/**
	 * �� 176 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_29;

	/**
	 * �� 177 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_30;

	/**
	 * �� 178 mediator�ϐ�
	 */
	protected String m_DLV_KEY_NO_31;

	/**
	 * �� 179 mediator�ϐ�
	 */
	protected String m_DLV_LOC_NAME;

	/**
	 * �� 180 mediator�ϐ�
	 */
	protected String m_CLIENT_BARCODE_INF;

	/**
	 * �� 181 mediator�ϐ�
	 */
	protected String m_CLIENT_REMARK;

	/**
	 * �� 182 mediator�ϐ�
	 */
	protected String m_CONTRACT_COND_TYP;

	/**
	 * �� 183 mediator�ϐ�
	 */
	protected String m_PUCH_ODR_SHAP_TYP;

	/**
	 * �� 184 mediator�ϐ�
	 */
	protected String m_MASTER_PUCH_ODR_CD;

	/**
	 * �� 185 mediator�ϐ�
	 */
	protected String m_QTY_CONTRACT_TYP;

	/**
	 * �� 186 mediator�ϐ�
	 */
	protected String m_ODR_MODIFICATION_TYP_1;

	/**
	 * �� 187 mediator�ϐ�
	 */
	protected String m_ODR_MODIFICATION_TYP_2;

	/**
	 * �� 188 mediator�ϐ�
	 */
	protected String m_ODR_MODIFICATION_TYP_3;

	/**
	 * �� 189 mediator�ϐ�
	 */
	protected String m_MACHINE_TYP_CD;

	/**
	 * �� 190 mediator�ϐ�
	 */
	protected String m_ENGINNERING_CHG_CD;

	/**
	 * �� 191 mediator�ϐ�
	 */
	protected String m_DROW_SPEC_CD;

	/**
	 * �� 192 mediator�ϐ�
	 */
	protected String m_DLV_DOC_FORM_1;

	/**
	 * �� 193 mediator�ϐ�
	 */
	protected Double m_DLV_DOC_COPY_NUM_1;

	/**
	 * �� 194 mediator�ϐ�
	 */
	protected String m_DLV_DOC_LANG_1;

	/**
	 * �� 195 mediator�ϐ�
	 */
	protected String m_DLV_DOC_FORM_2;

	/**
	 * �� 196 mediator�ϐ�
	 */
	protected Double m_DLV_DOC_COPY_NUM_2;

	/**
	 * �� 197 mediator�ϐ�
	 */
	protected String m_DLV_DOC_LANG_2;

	/**
	 * �� 198 mediator�ϐ�
	 */
	protected String m_DLV_DOC_FORM_3;

	/**
	 * �� 199 mediator�ϐ�
	 */
	protected Double m_DLV_DOC_COPY_NUM_3;

	/**
	 * �� 200 mediator�ϐ�
	 */
	protected String m_DLV_DOC_LANG_3;

	/**
	 * �� 201 mediator�ϐ�
	 */
	protected String m_DLV_DOC_FORM_4;

	/**
	 * �� 202 mediator�ϐ�
	 */
	protected Double m_DLV_DOC_COPY_NUM_4;

	/**
	 * �� 203 mediator�ϐ�
	 */
	protected String m_DLV_DOC_LANG_4;

	/**
	 * �� 204 mediator�ϐ�
	 */
	protected String m_STRATEGIC_GOODS_TYP;

	/**
	 * �� 205 mediator�ϐ�
	 */
	protected String m_ORGN_PLACE_CD_1;

	/**
	 * �� 206 mediator�ϐ�
	 */
	protected String m_ORGN_PLACE_CD_2;

	/**
	 * �� 207 mediator�ϐ�
	 */
	protected String m_ORGN_PLACE_CD_3;

	/**
	 * �� 208 mediator�ϐ�
	 */
	protected String m_ORGN_PLACE_CD_4;

	/**
	 * �� 209 mediator�ϐ�
	 */
	protected String m_ORGN_PLACE_CD_5;

	/**
	 * �� 210 mediator�ϐ�
	 */
	protected String m_DLV_TIME_1;

	/**
	 * �� 211 mediator�ϐ�
	 */
	protected String m_DLV_TIME_2;

	/**
	 * �� 212 mediator�ϐ�
	 */
	protected String m_DLV_TIME_3;

	/**
	 * �� 213 mediator�ϐ�
	 */
	protected String m_DLV_TIME_4;

	/**
	 * �� 214 mediator�ϐ�
	 */
	protected String m_DLV_TIME_5;

	/**
	 * �� 215 mediator�ϐ�
	 */
	protected String m_DLV_TIME_6;

	/**
	 * �� 216 mediator�ϐ�
	 */
	protected String m_DLV_TIME_7;

	/**
	 * �� 217 mediator�ϐ�
	 */
	protected String m_DLV_TIME_8;

	/**
	 * �� 218 mediator�ϐ�
	 */
	protected String m_DLV_TIME_9;

	/**
	 * �� 219 mediator�ϐ�
	 */
	protected String m_DLV_TIME_10;

	/**
	 * �� 220 mediator�ϐ�
	 */
	protected String m_DLV_TIME_11;

	/**
	 * �� 221 mediator�ϐ�
	 */
	protected String m_DLV_TIME_12;

	/**
	 * �� 222 mediator�ϐ�
	 */
	protected String m_DLV_TIME_13;

	/**
	 * �� 223 mediator�ϐ�
	 */
	protected String m_DLV_TIME_14;

	/**
	 * �� 224 mediator�ϐ�
	 */
	protected String m_DLV_TIME_15;

	/**
	 * �� 225 mediator�ϐ�
	 */
	protected String m_DLV_TIME_16;

	/**
	 * �� 226 mediator�ϐ�
	 */
	protected String m_DLV_TIME_17;

	/**
	 * �� 227 mediator�ϐ�
	 */
	protected String m_DLV_TIME_18;

	/**
	 * �� 228 mediator�ϐ�
	 */
	protected String m_DLV_TIME_19;

	/**
	 * �� 229 mediator�ϐ�
	 */
	protected String m_DLV_TIME_20;

	/**
	 * �� 230 mediator�ϐ�
	 */
	protected String m_DLV_TIME_21;

	/**
	 * �� 231 mediator�ϐ�
	 */
	protected String m_DLV_TIME_22;

	/**
	 * �� 232 mediator�ϐ�
	 */
	protected String m_DLV_TIME_23;

	/**
	 * �� 233 mediator�ϐ�
	 */
	protected String m_DLV_TIME_24;

	/**
	 * �� 234 mediator�ϐ�
	 */
	protected String m_DLV_TIME_25;

	/**
	 * �� 235 mediator�ϐ�
	 */
	protected String m_DLV_TIME_26;

	/**
	 * �� 236 mediator�ϐ�
	 */
	protected String m_DLV_TIME_27;

	/**
	 * �� 237 mediator�ϐ�
	 */
	protected String m_DLV_TIME_28;

	/**
	 * �� 238 mediator�ϐ�
	 */
	protected String m_DLV_TIME_29;

	/**
	 * �� 239 mediator�ϐ�
	 */
	protected String m_DLV_TIME_30;

	/**
	 * �� 240 mediator�ϐ�
	 */
	protected String m_DLV_TIME_31;

	/**
	 * �� 241 mediator�ϐ�
	 */
	protected String m_PACKAGE_DLV_CD;

	/**
	 * �� 242 mediator�ϐ�
	 */
	protected String m_SPEC;

	/**
	 * �� 243 mediator�ϐ�
	 */
	protected String m_BUYER_ORG_NAME;

	/**
	 * �� 244 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_1;

	/**
	 * �� 245 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_1;

	/**
	 * �� 246 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_2;

	/**
	 * �� 247 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_2;

	/**
	 * �� 248 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_3;

	/**
	 * �� 249 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_3;

	/**
	 * �� 250 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_4;

	/**
	 * �� 251 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_4;

	/**
	 * �� 252 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_5;

	/**
	 * �� 253 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_5;

	/**
	 * �� 254 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_6;

	/**
	 * �� 255 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_6;

	/**
	 * �� 256 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_7;

	/**
	 * �� 257 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_7;

	/**
	 * �� 258 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_8;

	/**
	 * �� 259 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_8;

	/**
	 * �� 260 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_9;

	/**
	 * �� 261 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_9;

	/**
	 * �� 262 mediator�ϐ�
	 */
	protected Double m_DLV_PART_LEN_10;

	/**
	 * �� 263 mediator�ϐ�
	 */
	protected Double m_DLV_PART_QTY_10;

	/**
	 * �� 264 mediator�ϐ�
	 */
	protected String m_DLV_PART_UNIT;

	/**
	 * �� 265 mediator�ϐ�
	 */
	protected String m_CUST_CONSTRUCT_NAME;

	/**
	 * �� 266 mediator�ϐ�
	 */
	protected String m_MATERIAL_CD;

	/**
	 * �� 267 mediator�ϐ�
	 */
	protected Double m_MATERIAL_UNIT_PRICE;

	/**
	 * �� 268 mediator�ϐ�
	 */
	protected String m_MATERIAL_UNIT;

	/**
	 * �� 269 mediator�ϐ�
	 */
	protected String m_TEST_REPORT_NEED_TYP;

	/**
	 * �� 270 mediator�ϐ�
	 */
	protected String m_TEST_REPORT_CHK_TYP;

	/**
	 * �� 271 mediator�ϐ�
	 */
	protected String m_TEST_REPORT_PRESENT_TYP;

	/**
	 * �� 272 mediator�ϐ�
	 */
	protected String m_MUNICIPAL_CD;

	/**
	 * �� 273 mediator�ϐ�
	 */
	protected String m_DLV_CONTACT_TEL;

	/**
	 * �� 274 mediator�ϐ�
	 */
	protected String m_SLIP_PRICE_PRINT_TYP;

	/**
	 * �� 275 mediator�ϐ�
	 */
	protected String m_BUYER_NAME_KANJI;

	/**
	 * �� 276 mediator�ϐ�
	 */
	protected String m_SPEC_KANJI;

	/**
	 * �� 277 mediator�ϐ�
	 */
	protected String m_ITEM_NAME_KANJI;

	/**
	 * �� 278 mediator�ϐ�
	 */
	protected String m_REMARKS_KANJI;

	/**
	 * �� 279 mediator�ϐ�
	 */
	protected String m_END_USER_NAME_KANJI;

	/**
	 * �� 280 mediator�ϐ�
	 */
	protected String m_DLV_ADDRESS_KANJI;

	/**
	 * �� 281 mediator�ϐ�
	 */
	protected String m_DLV_ADDRESSEE_KANJI;

	/**
	 * �� 282 mediator�ϐ�
	 */
	protected String m_END_USER_ITEM_NAME_KANJI;

	/**
	 * �� 283 mediator�ϐ�
	 */
	protected String m_CUST_DESINATED_MAKER_KANJI;

	/**
	 * �� 284 mediator�ϐ�
	 */
	protected String m_DLV_LOC_NAME_KANJI;

	/**
	 * �� 285 mediator�ϐ�
	 */
	protected String m_CLIENT_REMARK_KANJI;

	/**
	 * �� 286 mediator�ϐ�
	 */
	protected String m_MACHINE_TYPE_NAME_KANJI;

	/**
	 * �� 287 mediator�ϐ�
	 */
	protected String m_CUST_SPC_KANJI;

	/**
	 * �� 288 mediator�ϐ�
	 */
	protected String m_BUYER_ORG_NAME_KANJI;

	/**
	 * �� 289 mediator�ϐ�
	 */
	protected String m_CUST_CONSTRUCT_NAME_KANJI;

	/**
	 * �� 290 mediator�ϐ�
	 */
	protected String m_CUR_CD;

	/**
	 * �� 291 mediator�ϐ�
	 */
	protected Double m_UNIT_PRICE_EXCH_RATES;

	/**
	 * �� 292 mediator�ϐ�
	 */
	protected Double m_ODR_AMOUNT_EXCH_RATES;

	/**
	 * �� 293 mediator�ϐ�
	 */
	protected Double m_TAX_AMOUNT_EXCH_RATES;

	/**
	 * �� 294 mediator�ϐ�
	 */
	protected Double m_TOTAL_AMOUNT_EXCH_RATES;

	/**
	 * �� 295 mediator�ϐ�
	 */
	protected Double m_UNCONFIRM_AMOUNT_EXCH_RATES;

	/**
	 * �� 296 mediator�ϐ�
	 */
	protected Double m_MATERIAL_CD_EXCH_RATES;

	/**
	 * �� 297 mediator�ϐ�
	 */
	protected String m_PLANNING_ODR_CD;

	/**
	 * �� 298 mediator�ϐ�
	 */
	protected String m_PLANNING_ODR_DATE;

	/**
	 * �� 299 mediator�ϐ�
	 */
	protected Double m_STANDARD_DLV_TERM;

	/**
	 * �� 300 mediator�ϐ�
	 */
	protected Double m_REQUIRED_TERM;

	/**
	 * readSysBusinessMessage entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_ODR_INFO_EDI_IF entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SEQ_ODR_INFO_IF_CTRL_NO entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="KP0040B001";

	/**
	 * �v���O��������Ԃ��܂�
	 *
	 * @return �v���O������
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * �v���O��������mediator�Ɋi�[���܂�
	 *
	 * @param �v���O������
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 *
	 * @return �������t
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * �������t��mediator�Ɋi�[���܂�
	 *
	 * @param �������t
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * �o�^��/�X�V�҂��i�[���܂�
	 */
	protected String Username = "orteus_system";

	/**
	 * �o�^��/�X�V�҂��擾���܂�
	 *
	 * @return �o�^��/�X�V��
	 */
	public String getUsername() { return Username; }

	/**
	 * �o�^��/�X�V�҂�mediator�Ɋi�[���܂�
	 *
	 * @param �o�^��/�X�V��
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * ���������i�[���܂�
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * �R�}���h���C���̈���������z���Ԃ��܂�
	 *
	 * @return ����������z��
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * �R�}���h���C���̈���������z���mediator�Ɋi�[���܂�
	 *
	 * @param ����������z��
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

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
	 * medKP0040B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKP0040B001()
	{
		// mediator�ϐ������������܂�
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
			// TODO: �����ɏ����������L�q���Ă�������
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	protected void finalize()
	{

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �V�X�e�����O
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_dev:original

	//////////////////////////////

}
