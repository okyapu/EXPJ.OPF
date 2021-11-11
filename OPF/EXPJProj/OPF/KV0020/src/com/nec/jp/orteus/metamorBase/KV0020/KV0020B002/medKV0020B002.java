/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B002/medKV0020B002.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B002;

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
 * CLASS     : medKV0020B002 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2015/12/03 08:55:52 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKV0020B002 extends Object
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
	protected Double m_EdiODR_INFO_IF_CTRL_NO;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected Double m_EdiDATA_PROC_CD;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_EdiINFO_TYP_CD;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_EdiDATA_CREATED_DATE;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_EdiCLIENT_CD;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_EdiTRUSTEE_CD;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_EdiBUYER_ORG_CD;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_EdiPUCH_ODR_CD;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_EdiPRDCT_ODR_CD;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_EdiMODIFICATION_CODE;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_EdiCOCK_TYP;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_EdiPUCH_ODR_DATE;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_EdiUNIT;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected Double m_EdiUNIT_PRICE;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_EdiPRICE_TYP;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected Double m_EdiPUCH_ODR_QTY;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected Double m_EdiPUCH_ODR_AMOUNT;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_EdiCONS_TYP;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_EdiBUYER_NAME;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_EdiMATR_SPEC_SIZE;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_EdiSPECTP;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_EdiDROWING_EDITION;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_EdiPART_NAME;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_EdiOWN_ITEM_CD;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_EdiCUST_ITEM_CD;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected Double m_EdiDROW_SPEC_QTY;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_EdiPKG_UNIT;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_EdiDIRECT_DLV_TYP;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_EdiDLV_LOC_CD;

	/**
	 * �� 33 mediator�ϐ�
	 */
	protected String m_EdiINSPC_TYP;

	/**
	 * �� 34 mediator�ϐ�
	 */
	protected String m_EdiDLV_INST_TYP;

	/**
	 * �� 35 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_1;

	/**
	 * �� 36 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_1;

	/**
	 * �� 37 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_1;

	/**
	 * �� 38 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_2;

	/**
	 * �� 39 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_2;

	/**
	 * �� 40 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_2;

	/**
	 * �� 41 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_3;

	/**
	 * �� 42 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_3;

	/**
	 * �� 43 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_3;

	/**
	 * �� 44 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_4;

	/**
	 * �� 45 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_4;

	/**
	 * �� 46 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_4;

	/**
	 * �� 47 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_5;

	/**
	 * �� 48 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_5;

	/**
	 * �� 49 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_5;

	/**
	 * �� 50 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_6;

	/**
	 * �� 51 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_6;

	/**
	 * �� 52 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_6;

	/**
	 * �� 53 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_7;

	/**
	 * �� 54 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_7;

	/**
	 * �� 55 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_7;

	/**
	 * �� 56 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_8;

	/**
	 * �� 57 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_8;

	/**
	 * �� 58 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_8;

	/**
	 * �� 59 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_9;

	/**
	 * �� 60 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_9;

	/**
	 * �� 61 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_9;

	/**
	 * �� 62 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_10;

	/**
	 * �� 63 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_10;

	/**
	 * �� 64 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_10;

	/**
	 * �� 65 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_11;

	/**
	 * �� 66 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_11;

	/**
	 * �� 67 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_11;

	/**
	 * �� 68 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_12;

	/**
	 * �� 69 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_12;

	/**
	 * �� 70 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_12;

	/**
	 * �� 71 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_13;

	/**
	 * �� 72 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_13;

	/**
	 * �� 73 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_13;

	/**
	 * �� 74 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_14;

	/**
	 * �� 75 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_14;

	/**
	 * �� 76 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_14;

	/**
	 * �� 77 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_15;

	/**
	 * �� 78 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_15;

	/**
	 * �� 79 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_15;

	/**
	 * �� 80 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_16;

	/**
	 * �� 81 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_16;

	/**
	 * �� 82 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_16;

	/**
	 * �� 83 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_17;

	/**
	 * �� 84 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_17;

	/**
	 * �� 85 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_17;

	/**
	 * �� 86 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_18;

	/**
	 * �� 87 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_18;

	/**
	 * �� 88 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_18;

	/**
	 * �� 89 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_19;

	/**
	 * �� 90 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_19;

	/**
	 * �� 91 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_19;

	/**
	 * �� 92 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_20;

	/**
	 * �� 93 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_20;

	/**
	 * �� 94 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_20;

	/**
	 * �� 95 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_21;

	/**
	 * �� 96 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_21;

	/**
	 * �� 97 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_21;

	/**
	 * �� 98 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_22;

	/**
	 * �� 99 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_22;

	/**
	 * �� 100 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_22;

	/**
	 * �� 101 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_23;

	/**
	 * �� 102 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_23;

	/**
	 * �� 103 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_23;

	/**
	 * �� 104 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_24;

	/**
	 * �� 105 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_24;

	/**
	 * �� 106 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_24;

	/**
	 * �� 107 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_25;

	/**
	 * �� 108 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_25;

	/**
	 * �� 109 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_25;

	/**
	 * �� 110 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_26;

	/**
	 * �� 111 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_26;

	/**
	 * �� 112 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_26;

	/**
	 * �� 113 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_27;

	/**
	 * �� 114 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_27;

	/**
	 * �� 115 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_27;

	/**
	 * �� 116 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_28;

	/**
	 * �� 117 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_28;

	/**
	 * �� 118 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_28;

	/**
	 * �� 119 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_29;

	/**
	 * �� 120 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_29;

	/**
	 * �� 121 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_29;

	/**
	 * �� 122 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_30;

	/**
	 * �� 123 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_30;

	/**
	 * �� 124 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_30;

	/**
	 * �� 125 mediator�ϐ�
	 */
	protected String m_EdiSCDL_DLV_DATE_31;

	/**
	 * �� 126 mediator�ϐ�
	 */
	protected Double m_EdiSCDL_DLV_QTY_31;

	/**
	 * �� 127 mediator�ϐ�
	 */
	protected String m_EdiDLV_CD_31;

	/**
	 * �� 128 mediator�ϐ�
	 */
	protected String m_EdiFREE_TEXT;

	/**
	 * �� 129 mediator�ϐ�
	 */
	protected String m_EdiREMARKS;

	/**
	 * �� 130 mediator�ϐ�
	 */
	protected String m_EdiTAX_TYP;

	/**
	 * �� 131 mediator�ϐ�
	 */
	protected String m_EdiCUST_TAXATION_TYP;

	/**
	 * �� 132 mediator�ϐ�
	 */
	protected Double m_EdiTAX_AMOUNT;

	/**
	 * �� 133 mediator�ϐ�
	 */
	protected Double m_EdiCUST_TOTAL_AMOUNT;

	/**
	 * �� 134 mediator�ϐ�
	 */
	protected String m_EdiUNCONFIRM_ODR_CD;

	/**
	 * �� 135 mediator�ϐ�
	 */
	protected String m_EdiUNCONFIRM_ODR_DATE;

	/**
	 * �� 136 mediator�ϐ�
	 */
	protected Double m_EdiUNCONFIRM_ODR_QTY;

	/**
	 * �� 137 mediator�ϐ�
	 */
	protected Double m_EdiUNCONFIRM_ODR_AMOUNT;

	/**
	 * �� 138 mediator�ϐ�
	 */
	protected String m_EdiESTIMATE_REQST_CD;

	/**
	 * �� 139 mediator�ϐ�
	 */
	protected String m_EdiSTL_COND_CD;

	/**
	 * �� 140 mediator�ϐ�
	 */
	protected String m_EdiEND_USER_NAME;

	/**
	 * �� 141 mediator�ϐ�
	 */
	protected String m_EdiDLV_ZIP_CD;

	/**
	 * �� 142 mediator�ϐ�
	 */
	protected String m_EdiDLV_ADDRESS;

	/**
	 * �� 143 mediator�ϐ�
	 */
	protected String m_EdiDLV_ADDRESSEE;

	/**
	 * �� 144 mediator�ϐ�
	 */
	protected String m_EdiCUST_COMM_SUBNAME;

	/**
	 * �� 145 mediator�ϐ�
	 */
	protected String m_EdiCUST_COMM_SUBCD;

	/**
	 * �� 146 mediator�ϐ�
	 */
	protected String m_EdiEND_USER_ODR_CD;

	/**
	 * �� 147 mediator�ϐ�
	 */
	protected String m_EdiCUST_DESINATED_MAKER;

	/**
	 * �� 148 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_1;

	/**
	 * �� 149 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_2;

	/**
	 * �� 150 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_3;

	/**
	 * �� 151 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_4;

	/**
	 * �� 152 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_5;

	/**
	 * �� 153 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_6;

	/**
	 * �� 154 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_7;

	/**
	 * �� 155 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_8;

	/**
	 * �� 156 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_9;

	/**
	 * �� 157 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_10;

	/**
	 * �� 158 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_11;

	/**
	 * �� 159 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_12;

	/**
	 * �� 160 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_13;

	/**
	 * �� 161 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_14;

	/**
	 * �� 162 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_15;

	/**
	 * �� 163 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_16;

	/**
	 * �� 164 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_17;

	/**
	 * �� 165 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_18;

	/**
	 * �� 166 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_19;

	/**
	 * �� 167 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_20;

	/**
	 * �� 168 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_21;

	/**
	 * �� 169 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_22;

	/**
	 * �� 170 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_23;

	/**
	 * �� 171 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_24;

	/**
	 * �� 172 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_25;

	/**
	 * �� 173 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_26;

	/**
	 * �� 174 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_27;

	/**
	 * �� 175 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_28;

	/**
	 * �� 176 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_29;

	/**
	 * �� 177 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_30;

	/**
	 * �� 178 mediator�ϐ�
	 */
	protected String m_EdiDLV_KEY_NO_31;

	/**
	 * �� 179 mediator�ϐ�
	 */
	protected String m_EdiDLV_LOC_NAME;

	/**
	 * �� 180 mediator�ϐ�
	 */
	protected String m_EdiCLIENT_BARCODE_INF;

	/**
	 * �� 181 mediator�ϐ�
	 */
	protected String m_EdiCLIENT_REMARK;

	/**
	 * �� 182 mediator�ϐ�
	 */
	protected String m_EdiCONTRACT_COND_TYP;

	/**
	 * �� 183 mediator�ϐ�
	 */
	protected String m_EdiPUCH_ODR_SHAP_TYP;

	/**
	 * �� 184 mediator�ϐ�
	 */
	protected String m_EdiMASTER_PUCH_ODR_CD;

	/**
	 * �� 185 mediator�ϐ�
	 */
	protected String m_EdiQTY_CONTRACT_TYP;

	/**
	 * �� 186 mediator�ϐ�
	 */
	protected String m_EdiODR_MODIFICATION_TYP_1;

	/**
	 * �� 187 mediator�ϐ�
	 */
	protected String m_EdiODR_MODIFICATION_TYP_2;

	/**
	 * �� 188 mediator�ϐ�
	 */
	protected String m_EdiODR_MODIFICATION_TYP_3;

	/**
	 * �� 189 mediator�ϐ�
	 */
	protected String m_EdiMACHINE_TYP_CD;

	/**
	 * �� 190 mediator�ϐ�
	 */
	protected String m_EdiENGINNERING_CHG_CD;

	/**
	 * �� 191 mediator�ϐ�
	 */
	protected String m_EdiDROW_SPEC_CD;

	/**
	 * �� 192 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_FORM_1;

	/**
	 * �� 193 mediator�ϐ�
	 */
	protected Double m_EdiDLV_DOC_COPY_NUM_1;

	/**
	 * �� 194 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_LANG_1;

	/**
	 * �� 195 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_FORM_2;

	/**
	 * �� 196 mediator�ϐ�
	 */
	protected Double m_EdiDLV_DOC_COPY_NUM_2;

	/**
	 * �� 197 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_LANG_2;

	/**
	 * �� 198 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_FORM_3;

	/**
	 * �� 199 mediator�ϐ�
	 */
	protected Double m_EdiDLV_DOC_COPY_NUM_3;

	/**
	 * �� 200 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_LANG_3;

	/**
	 * �� 201 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_FORM_4;

	/**
	 * �� 202 mediator�ϐ�
	 */
	protected Double m_EdiDLV_DOC_COPY_NUM_4;

	/**
	 * �� 203 mediator�ϐ�
	 */
	protected String m_EdiDLV_DOC_LANG_4;

	/**
	 * �� 204 mediator�ϐ�
	 */
	protected String m_EdiSTRATEGIC_GOODS_TYP;

	/**
	 * �� 205 mediator�ϐ�
	 */
	protected String m_EdiORGN_PLACE_CD_1;

	/**
	 * �� 206 mediator�ϐ�
	 */
	protected String m_EdiORGN_PLACE_CD_2;

	/**
	 * �� 207 mediator�ϐ�
	 */
	protected String m_EdiORGN_PLACE_CD_3;

	/**
	 * �� 208 mediator�ϐ�
	 */
	protected String m_EdiORGN_PLACE_CD_4;

	/**
	 * �� 209 mediator�ϐ�
	 */
	protected String m_EdiORGN_PLACE_CD_5;

	/**
	 * �� 210 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_1;

	/**
	 * �� 211 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_2;

	/**
	 * �� 212 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_3;

	/**
	 * �� 213 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_4;

	/**
	 * �� 214 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_5;

	/**
	 * �� 215 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_6;

	/**
	 * �� 216 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_7;

	/**
	 * �� 217 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_8;

	/**
	 * �� 218 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_9;

	/**
	 * �� 219 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_10;

	/**
	 * �� 220 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_11;

	/**
	 * �� 221 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_12;

	/**
	 * �� 222 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_13;

	/**
	 * �� 223 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_14;

	/**
	 * �� 224 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_15;

	/**
	 * �� 225 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_16;

	/**
	 * �� 226 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_17;

	/**
	 * �� 227 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_18;

	/**
	 * �� 228 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_19;

	/**
	 * �� 229 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_20;

	/**
	 * �� 230 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_21;

	/**
	 * �� 231 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_22;

	/**
	 * �� 232 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_23;

	/**
	 * �� 233 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_24;

	/**
	 * �� 234 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_25;

	/**
	 * �� 235 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_26;

	/**
	 * �� 236 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_27;

	/**
	 * �� 237 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_28;

	/**
	 * �� 238 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_29;

	/**
	 * �� 239 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_30;

	/**
	 * �� 240 mediator�ϐ�
	 */
	protected String m_EdiDLV_TIME_31;

	/**
	 * �� 241 mediator�ϐ�
	 */
	protected String m_EdiPACKAGE_DLV_CD;

	/**
	 * �� 242 mediator�ϐ�
	 */
	protected String m_EdiSPEC;

	/**
	 * �� 243 mediator�ϐ�
	 */
	protected String m_EdiBUYER_ORG_NAME;

	/**
	 * �� 244 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_1;

	/**
	 * �� 245 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_1;

	/**
	 * �� 246 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_2;

	/**
	 * �� 247 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_2;

	/**
	 * �� 248 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_3;

	/**
	 * �� 249 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_3;

	/**
	 * �� 250 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_4;

	/**
	 * �� 251 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_4;

	/**
	 * �� 252 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_5;

	/**
	 * �� 253 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_5;

	/**
	 * �� 254 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_6;

	/**
	 * �� 255 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_6;

	/**
	 * �� 256 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_7;

	/**
	 * �� 257 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_7;

	/**
	 * �� 258 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_8;

	/**
	 * �� 259 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_8;

	/**
	 * �� 260 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_9;

	/**
	 * �� 261 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_9;

	/**
	 * �� 262 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_LEN_10;

	/**
	 * �� 263 mediator�ϐ�
	 */
	protected Double m_EdiDLV_PART_QTY_10;

	/**
	 * �� 264 mediator�ϐ�
	 */
	protected String m_EdiDLV_PART_UNIT;

	/**
	 * �� 265 mediator�ϐ�
	 */
	protected String m_EdiCUST_CONSTRUCT_NAME;

	/**
	 * �� 266 mediator�ϐ�
	 */
	protected String m_EdiMATERIAL_CD;

	/**
	 * �� 267 mediator�ϐ�
	 */
	protected Double m_EdiMATERIAL_UNIT_PRICE;

	/**
	 * �� 268 mediator�ϐ�
	 */
	protected String m_EdiMATERIAL_UNIT;

	/**
	 * �� 269 mediator�ϐ�
	 */
	protected String m_EdiTEST_REPORT_NEED_TYP;

	/**
	 * �� 270 mediator�ϐ�
	 */
	protected String m_EdiTEST_REPORT_CHK_TYP;

	/**
	 * �� 271 mediator�ϐ�
	 */
	protected String m_EdiTEST_REPORT_PRESENT_TYP;

	/**
	 * �� 272 mediator�ϐ�
	 */
	protected String m_EdiMUNICIPAL_CD;

	/**
	 * �� 273 mediator�ϐ�
	 */
	protected String m_EdiDLV_CONTACT_TEL;

	/**
	 * �� 274 mediator�ϐ�
	 */
	protected String m_EdiSLIP_PRICE_PRINT_TYP;

	/**
	 * �� 275 mediator�ϐ�
	 */
	protected String m_EdiBUYER_NAME_KANJI;

	/**
	 * �� 276 mediator�ϐ�
	 */
	protected String m_EdiSPEC_KANJI;

	/**
	 * �� 277 mediator�ϐ�
	 */
	protected String m_EdiITEM_NAME_KANJI;

	/**
	 * �� 278 mediator�ϐ�
	 */
	protected String m_EdiREMARKS_KANJI;

	/**
	 * �� 279 mediator�ϐ�
	 */
	protected String m_EdiEND_USER_NAME_KANJI;

	/**
	 * �� 280 mediator�ϐ�
	 */
	protected String m_EdiDLV_ADDRESS_KANJI;

	/**
	 * �� 281 mediator�ϐ�
	 */
	protected String m_EdiDLV_ADDRESSEE_KANJI;

	/**
	 * �� 282 mediator�ϐ�
	 */
	protected String m_EdiEND_USER_ITEM_NAME_KANJI;

	/**
	 * �� 283 mediator�ϐ�
	 */
	protected String m_EdiCUST_DESINATED_MAKER_KANJI;

	/**
	 * �� 284 mediator�ϐ�
	 */
	protected String m_EdiDLV_LOC_NAME_KANJI;

	/**
	 * �� 285 mediator�ϐ�
	 */
	protected String m_EdiCLIENT_REMARK_KANJI;

	/**
	 * �� 286 mediator�ϐ�
	 */
	protected String m_EdiMACHINE_TYPE_NAME_KANJI;

	/**
	 * �� 287 mediator�ϐ�
	 */
	protected String m_EdiCUST_SPC_KANJI;

	/**
	 * �� 288 mediator�ϐ�
	 */
	protected String m_EdiBUYER_ORG_NAME_KANJI;

	/**
	 * �� 289 mediator�ϐ�
	 */
	protected String m_EdiCUST_CONSTRUCT_NAME_KANJI;

	/**
	 * �� 290 mediator�ϐ�
	 */
	protected String m_EdiCUR_CD;

	/**
	 * �� 291 mediator�ϐ�
	 */
	protected Double m_EdiUNIT_PRICE_EXCH_RATES;

	/**
	 * �� 292 mediator�ϐ�
	 */
	protected Double m_EdiODR_AMOUNT_EXCH_RATES;

	/**
	 * �� 293 mediator�ϐ�
	 */
	protected Double m_EdiTAX_AMOUNT_EXCH_RATES;

	/**
	 * �� 294 mediator�ϐ�
	 */
	protected Double m_EdiTOTAL_AMOUNT_EXCH_RATES;

	/**
	 * �� 295 mediator�ϐ�
	 */
	protected Double m_EdiUNCONFIRM_AMOUNT_EXCH_RATES;

	/**
	 * �� 296 mediator�ϐ�
	 */
	protected Double m_EdiMATERIAL_CD_EXCH_RATES;

	/**
	 * �� 297 mediator�ϐ�
	 */
	protected String m_EdiPLANNING_ODR_CD;

	/**
	 * �� 298 mediator�ϐ�
	 */
	protected String m_EdiPLANNING_ODR_DATE;

	/**
	 * �� 299 mediator�ϐ�
	 */
	protected Double m_EdiSTANDARD_DLV_TERM;

	/**
	 * �� 300 mediator�ϐ�
	 */
	protected Double m_EdiREQUIRED_TERM;

	/**
	 * �� 301 mediator�ϐ�
	 */
	protected String m_EdiSYSTEM_PROC_TYP;

	/**
	 * �� 302 mediator�ϐ�
	 */
	protected Double m_ODR_INFO_COM_IF_CTRL_NO;

	/**
	 * �� 303 mediator�ϐ�
	 */
	protected Double m_ODR_SEQ;

	/**
	 * �� 304 mediator�ϐ�
	 */
	protected String m_ODR_TYP;

	/**
	 * �� 305 mediator�ϐ�
	 */
	protected String m_INFO_TYP_CD;

	/**
	 * �� 306 mediator�ϐ�
	 */
	protected String m_CUST_ODR_NO;

	/**
	 * �� 307 mediator�ϐ�
	 */
	protected String m_ODR_ACPT_DATE;

	/**
	 * �� 308 mediator�ϐ�
	 */
	protected String m_CUST_CD;

	/**
	 * �� 309 mediator�ϐ�
	 */
	protected String m_CUST_ITEM_CD;

	/**
	 * �� 310 mediator�ϐ�
	 */
	protected String m_PART_NAME;

	/**
	 * �� 311 mediator�ϐ�
	 */
	protected String m_PROC_TYP;

	/**
	 * �� 312 mediator�ϐ�
	 */
	protected String m_COCK_TYP;

	/**
	 * �� 313 mediator�ϐ�
	 */
	protected String m_UNIT_CD;

	/**
	 * �� 314 mediator�ϐ�
	 */
	protected Double m_UNIT_COST;

	/**
	 * �� 315 mediator�ϐ�
	 */
	protected String m_UNIT_COST_TYP;

	/**
	 * �� 316 mediator�ϐ�
	 */
	protected String m_DESINATED_DLV_DATE;

	/**
	 * �� 317 mediator�ϐ�
	 */
	protected Double m_PUCH_ODR_QTY;

	/**
	 * �� 318 mediator�ϐ�
	 */
	protected String m_PKG_UNIT;

	/**
	 * �� 319 mediator�ϐ�
	 */
	protected String m_INSPC_TYP;

	/**
	 * �� 320 mediator�ϐ�
	 */
	protected String m_DLV_LOC_CD;

	/**
	 * �� 321 mediator�ϐ�
	 */
	protected String m_DLV_LOC_CD_EIAJ;

	/**
	 * �� 322 mediator�ϐ�
	 */
	protected String m_DLV_LOC_NAME_KANJI;

	/**
	 * �� 323 mediator�ϐ�
	 */
	protected String m_CUS_DLV_CD;

	/**
	 * �� 324 mediator�ϐ�
	 */
	protected String m_CUS_DLV_KEY_CD;

	/**
	 * �� 325 mediator�ϐ�
	 */
	protected String m_FREE_REMARK;

	/**
	 * �� 326 mediator�ϐ�
	 */
	protected String m_REMARK;

	/**
	 * �� 327 mediator�ϐ�
	 */
	protected String m_CLIENT_BARCODE_INF;

	/**
	 * �� 328 mediator�ϐ�
	 */
	protected String m_CLIENT_REMARK;

	/**
	 * �� 329 mediator�ϐ�
	 */
	protected String m_CLIENT_REMARK_KANJI;

	/**
	 * �� 330 mediator�ϐ�
	 */
	protected String m_SLIP_PRICE_PRINT_TYP;

	/**
	 * �� 331 mediator�ϐ�
	 */
	protected String m_CUR_CD;

	/**
	 * �� 332 mediator�ϐ�
	 */
	protected String m_UNIT_CD_ORG;

	/**
	 * �� 333 mediator�ϐ�
	 */
	protected Double m_PUCH_ODR_QTY_TOTAL;

	/**
	 * �� 334 mediator�ϐ�
	 */
	protected String m_BUYER_NAME;

	/**
	 * �� 335 mediator�ϐ�
	 */
	protected Double m_ODR_ACPT_PROC_ODR;

	/**
	 * �� 336 mediator�ϐ�
	 */
	protected String m_BUYER_ORG_CD;

	/**
	 * �� 337 mediator�ϐ�
	 */
	protected String m_btBUSINESS_OPR_DATE;

	/**
	 * �� 338 mediator�ϐ�
	 */
	protected String m_btPLANT_CD;

	/**
	 * �� 339 mediator�ϐ�
	 */
	protected String m_strJP_CUR;

	/**
	 * �� 340 mediator�ϐ�
	 */
	protected String m_custCUST_CD;

	/**
	 * �� 341 mediator�ϐ�
	 */
	protected String m_custCUR_CD;

	/**
	 * �� 342 mediator�ϐ�
	 */
	protected String m_custEDI_CUST_VEND_CD;

	/**
	 * readSysBusinessMessage entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_ODR_INFO_EDI_IF entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_ODR_INFO_COM_IF entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * BatchGyomuDate entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * JpCurrency entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * SYS_CLASS_CODE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * M_CUST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="KV0020B002";

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
	public Double getEdiODR_INFO_IF_CTRL_NO() { return m_EdiODR_INFO_IF_CTRL_NO; }
	public Double getEdiDATA_PROC_CD() { return m_EdiDATA_PROC_CD; }
	public String getEdiINFO_TYP_CD() { return m_EdiINFO_TYP_CD; }
	public String getEdiDATA_CREATED_DATE() { return m_EdiDATA_CREATED_DATE; }
	public String getEdiCLIENT_CD() { return m_EdiCLIENT_CD; }
	public String getEdiTRUSTEE_CD() { return m_EdiTRUSTEE_CD; }
	public String getEdiBUYER_ORG_CD() { return m_EdiBUYER_ORG_CD; }
	public String getEdiPUCH_ODR_CD() { return m_EdiPUCH_ODR_CD; }
	public String getEdiPRDCT_ODR_CD() { return m_EdiPRDCT_ODR_CD; }
	public String getEdiMODIFICATION_CODE() { return m_EdiMODIFICATION_CODE; }
	public String getEdiCOCK_TYP() { return m_EdiCOCK_TYP; }
	public String getEdiPUCH_ODR_DATE() { return m_EdiPUCH_ODR_DATE; }
	public String getEdiUNIT() { return m_EdiUNIT; }
	public Double getEdiUNIT_PRICE() { return m_EdiUNIT_PRICE; }
	public String getEdiPRICE_TYP() { return m_EdiPRICE_TYP; }
	public Double getEdiPUCH_ODR_QTY() { return m_EdiPUCH_ODR_QTY; }
	public Double getEdiPUCH_ODR_AMOUNT() { return m_EdiPUCH_ODR_AMOUNT; }
	public String getEdiCONS_TYP() { return m_EdiCONS_TYP; }
	public String getEdiBUYER_NAME() { return m_EdiBUYER_NAME; }
	public String getEdiMATR_SPEC_SIZE() { return m_EdiMATR_SPEC_SIZE; }
	public String getEdiSPECTP() { return m_EdiSPECTP; }
	public String getEdiDROWING_EDITION() { return m_EdiDROWING_EDITION; }
	public String getEdiPART_NAME() { return m_EdiPART_NAME; }
	public String getEdiOWN_ITEM_CD() { return m_EdiOWN_ITEM_CD; }
	public String getEdiCUST_ITEM_CD() { return m_EdiCUST_ITEM_CD; }
	public Double getEdiDROW_SPEC_QTY() { return m_EdiDROW_SPEC_QTY; }
	public String getEdiPKG_UNIT() { return m_EdiPKG_UNIT; }
	public String getEdiDIRECT_DLV_TYP() { return m_EdiDIRECT_DLV_TYP; }
	public String getEdiDLV_LOC_CD() { return m_EdiDLV_LOC_CD; }
	public String getEdiINSPC_TYP() { return m_EdiINSPC_TYP; }
	public String getEdiDLV_INST_TYP() { return m_EdiDLV_INST_TYP; }
	public String getEdiSCDL_DLV_DATE_1() { return m_EdiSCDL_DLV_DATE_1; }
	public Double getEdiSCDL_DLV_QTY_1() { return m_EdiSCDL_DLV_QTY_1; }
	public String getEdiDLV_CD_1() { return m_EdiDLV_CD_1; }
	public String getEdiSCDL_DLV_DATE_2() { return m_EdiSCDL_DLV_DATE_2; }
	public Double getEdiSCDL_DLV_QTY_2() { return m_EdiSCDL_DLV_QTY_2; }
	public String getEdiDLV_CD_2() { return m_EdiDLV_CD_2; }
	public String getEdiSCDL_DLV_DATE_3() { return m_EdiSCDL_DLV_DATE_3; }
	public Double getEdiSCDL_DLV_QTY_3() { return m_EdiSCDL_DLV_QTY_3; }
	public String getEdiDLV_CD_3() { return m_EdiDLV_CD_3; }
	public String getEdiSCDL_DLV_DATE_4() { return m_EdiSCDL_DLV_DATE_4; }
	public Double getEdiSCDL_DLV_QTY_4() { return m_EdiSCDL_DLV_QTY_4; }
	public String getEdiDLV_CD_4() { return m_EdiDLV_CD_4; }
	public String getEdiSCDL_DLV_DATE_5() { return m_EdiSCDL_DLV_DATE_5; }
	public Double getEdiSCDL_DLV_QTY_5() { return m_EdiSCDL_DLV_QTY_5; }
	public String getEdiDLV_CD_5() { return m_EdiDLV_CD_5; }
	public String getEdiSCDL_DLV_DATE_6() { return m_EdiSCDL_DLV_DATE_6; }
	public Double getEdiSCDL_DLV_QTY_6() { return m_EdiSCDL_DLV_QTY_6; }
	public String getEdiDLV_CD_6() { return m_EdiDLV_CD_6; }
	public String getEdiSCDL_DLV_DATE_7() { return m_EdiSCDL_DLV_DATE_7; }
	public Double getEdiSCDL_DLV_QTY_7() { return m_EdiSCDL_DLV_QTY_7; }
	public String getEdiDLV_CD_7() { return m_EdiDLV_CD_7; }
	public String getEdiSCDL_DLV_DATE_8() { return m_EdiSCDL_DLV_DATE_8; }
	public Double getEdiSCDL_DLV_QTY_8() { return m_EdiSCDL_DLV_QTY_8; }
	public String getEdiDLV_CD_8() { return m_EdiDLV_CD_8; }
	public String getEdiSCDL_DLV_DATE_9() { return m_EdiSCDL_DLV_DATE_9; }
	public Double getEdiSCDL_DLV_QTY_9() { return m_EdiSCDL_DLV_QTY_9; }
	public String getEdiDLV_CD_9() { return m_EdiDLV_CD_9; }
	public String getEdiSCDL_DLV_DATE_10() { return m_EdiSCDL_DLV_DATE_10; }
	public Double getEdiSCDL_DLV_QTY_10() { return m_EdiSCDL_DLV_QTY_10; }
	public String getEdiDLV_CD_10() { return m_EdiDLV_CD_10; }
	public String getEdiSCDL_DLV_DATE_11() { return m_EdiSCDL_DLV_DATE_11; }
	public Double getEdiSCDL_DLV_QTY_11() { return m_EdiSCDL_DLV_QTY_11; }
	public String getEdiDLV_CD_11() { return m_EdiDLV_CD_11; }
	public String getEdiSCDL_DLV_DATE_12() { return m_EdiSCDL_DLV_DATE_12; }
	public Double getEdiSCDL_DLV_QTY_12() { return m_EdiSCDL_DLV_QTY_12; }
	public String getEdiDLV_CD_12() { return m_EdiDLV_CD_12; }
	public String getEdiSCDL_DLV_DATE_13() { return m_EdiSCDL_DLV_DATE_13; }
	public Double getEdiSCDL_DLV_QTY_13() { return m_EdiSCDL_DLV_QTY_13; }
	public String getEdiDLV_CD_13() { return m_EdiDLV_CD_13; }
	public String getEdiSCDL_DLV_DATE_14() { return m_EdiSCDL_DLV_DATE_14; }
	public Double getEdiSCDL_DLV_QTY_14() { return m_EdiSCDL_DLV_QTY_14; }
	public String getEdiDLV_CD_14() { return m_EdiDLV_CD_14; }
	public String getEdiSCDL_DLV_DATE_15() { return m_EdiSCDL_DLV_DATE_15; }
	public Double getEdiSCDL_DLV_QTY_15() { return m_EdiSCDL_DLV_QTY_15; }
	public String getEdiDLV_CD_15() { return m_EdiDLV_CD_15; }
	public String getEdiSCDL_DLV_DATE_16() { return m_EdiSCDL_DLV_DATE_16; }
	public Double getEdiSCDL_DLV_QTY_16() { return m_EdiSCDL_DLV_QTY_16; }
	public String getEdiDLV_CD_16() { return m_EdiDLV_CD_16; }
	public String getEdiSCDL_DLV_DATE_17() { return m_EdiSCDL_DLV_DATE_17; }
	public Double getEdiSCDL_DLV_QTY_17() { return m_EdiSCDL_DLV_QTY_17; }
	public String getEdiDLV_CD_17() { return m_EdiDLV_CD_17; }
	public String getEdiSCDL_DLV_DATE_18() { return m_EdiSCDL_DLV_DATE_18; }
	public Double getEdiSCDL_DLV_QTY_18() { return m_EdiSCDL_DLV_QTY_18; }
	public String getEdiDLV_CD_18() { return m_EdiDLV_CD_18; }
	public String getEdiSCDL_DLV_DATE_19() { return m_EdiSCDL_DLV_DATE_19; }
	public Double getEdiSCDL_DLV_QTY_19() { return m_EdiSCDL_DLV_QTY_19; }
	public String getEdiDLV_CD_19() { return m_EdiDLV_CD_19; }
	public String getEdiSCDL_DLV_DATE_20() { return m_EdiSCDL_DLV_DATE_20; }
	public Double getEdiSCDL_DLV_QTY_20() { return m_EdiSCDL_DLV_QTY_20; }
	public String getEdiDLV_CD_20() { return m_EdiDLV_CD_20; }
	public String getEdiSCDL_DLV_DATE_21() { return m_EdiSCDL_DLV_DATE_21; }
	public Double getEdiSCDL_DLV_QTY_21() { return m_EdiSCDL_DLV_QTY_21; }
	public String getEdiDLV_CD_21() { return m_EdiDLV_CD_21; }
	public String getEdiSCDL_DLV_DATE_22() { return m_EdiSCDL_DLV_DATE_22; }
	public Double getEdiSCDL_DLV_QTY_22() { return m_EdiSCDL_DLV_QTY_22; }
	public String getEdiDLV_CD_22() { return m_EdiDLV_CD_22; }
	public String getEdiSCDL_DLV_DATE_23() { return m_EdiSCDL_DLV_DATE_23; }
	public Double getEdiSCDL_DLV_QTY_23() { return m_EdiSCDL_DLV_QTY_23; }
	public String getEdiDLV_CD_23() { return m_EdiDLV_CD_23; }
	public String getEdiSCDL_DLV_DATE_24() { return m_EdiSCDL_DLV_DATE_24; }
	public Double getEdiSCDL_DLV_QTY_24() { return m_EdiSCDL_DLV_QTY_24; }
	public String getEdiDLV_CD_24() { return m_EdiDLV_CD_24; }
	public String getEdiSCDL_DLV_DATE_25() { return m_EdiSCDL_DLV_DATE_25; }
	public Double getEdiSCDL_DLV_QTY_25() { return m_EdiSCDL_DLV_QTY_25; }
	public String getEdiDLV_CD_25() { return m_EdiDLV_CD_25; }
	public String getEdiSCDL_DLV_DATE_26() { return m_EdiSCDL_DLV_DATE_26; }
	public Double getEdiSCDL_DLV_QTY_26() { return m_EdiSCDL_DLV_QTY_26; }
	public String getEdiDLV_CD_26() { return m_EdiDLV_CD_26; }
	public String getEdiSCDL_DLV_DATE_27() { return m_EdiSCDL_DLV_DATE_27; }
	public Double getEdiSCDL_DLV_QTY_27() { return m_EdiSCDL_DLV_QTY_27; }
	public String getEdiDLV_CD_27() { return m_EdiDLV_CD_27; }
	public String getEdiSCDL_DLV_DATE_28() { return m_EdiSCDL_DLV_DATE_28; }
	public Double getEdiSCDL_DLV_QTY_28() { return m_EdiSCDL_DLV_QTY_28; }
	public String getEdiDLV_CD_28() { return m_EdiDLV_CD_28; }
	public String getEdiSCDL_DLV_DATE_29() { return m_EdiSCDL_DLV_DATE_29; }
	public Double getEdiSCDL_DLV_QTY_29() { return m_EdiSCDL_DLV_QTY_29; }
	public String getEdiDLV_CD_29() { return m_EdiDLV_CD_29; }
	public String getEdiSCDL_DLV_DATE_30() { return m_EdiSCDL_DLV_DATE_30; }
	public Double getEdiSCDL_DLV_QTY_30() { return m_EdiSCDL_DLV_QTY_30; }
	public String getEdiDLV_CD_30() { return m_EdiDLV_CD_30; }
	public String getEdiSCDL_DLV_DATE_31() { return m_EdiSCDL_DLV_DATE_31; }
	public Double getEdiSCDL_DLV_QTY_31() { return m_EdiSCDL_DLV_QTY_31; }
	public String getEdiDLV_CD_31() { return m_EdiDLV_CD_31; }
	public String getEdiFREE_TEXT() { return m_EdiFREE_TEXT; }
	public String getEdiREMARKS() { return m_EdiREMARKS; }
	public String getEdiTAX_TYP() { return m_EdiTAX_TYP; }
	public String getEdiCUST_TAXATION_TYP() { return m_EdiCUST_TAXATION_TYP; }
	public Double getEdiTAX_AMOUNT() { return m_EdiTAX_AMOUNT; }
	public Double getEdiCUST_TOTAL_AMOUNT() { return m_EdiCUST_TOTAL_AMOUNT; }
	public String getEdiUNCONFIRM_ODR_CD() { return m_EdiUNCONFIRM_ODR_CD; }
	public String getEdiUNCONFIRM_ODR_DATE() { return m_EdiUNCONFIRM_ODR_DATE; }
	public Double getEdiUNCONFIRM_ODR_QTY() { return m_EdiUNCONFIRM_ODR_QTY; }
	public Double getEdiUNCONFIRM_ODR_AMOUNT() { return m_EdiUNCONFIRM_ODR_AMOUNT; }
	public String getEdiESTIMATE_REQST_CD() { return m_EdiESTIMATE_REQST_CD; }
	public String getEdiSTL_COND_CD() { return m_EdiSTL_COND_CD; }
	public String getEdiEND_USER_NAME() { return m_EdiEND_USER_NAME; }
	public String getEdiDLV_ZIP_CD() { return m_EdiDLV_ZIP_CD; }
	public String getEdiDLV_ADDRESS() { return m_EdiDLV_ADDRESS; }
	public String getEdiDLV_ADDRESSEE() { return m_EdiDLV_ADDRESSEE; }
	public String getEdiCUST_COMM_SUBNAME() { return m_EdiCUST_COMM_SUBNAME; }
	public String getEdiCUST_COMM_SUBCD() { return m_EdiCUST_COMM_SUBCD; }
	public String getEdiEND_USER_ODR_CD() { return m_EdiEND_USER_ODR_CD; }
	public String getEdiCUST_DESINATED_MAKER() { return m_EdiCUST_DESINATED_MAKER; }
	public String getEdiDLV_KEY_NO_1() { return m_EdiDLV_KEY_NO_1; }
	public String getEdiDLV_KEY_NO_2() { return m_EdiDLV_KEY_NO_2; }
	public String getEdiDLV_KEY_NO_3() { return m_EdiDLV_KEY_NO_3; }
	public String getEdiDLV_KEY_NO_4() { return m_EdiDLV_KEY_NO_4; }
	public String getEdiDLV_KEY_NO_5() { return m_EdiDLV_KEY_NO_5; }
	public String getEdiDLV_KEY_NO_6() { return m_EdiDLV_KEY_NO_6; }
	public String getEdiDLV_KEY_NO_7() { return m_EdiDLV_KEY_NO_7; }
	public String getEdiDLV_KEY_NO_8() { return m_EdiDLV_KEY_NO_8; }
	public String getEdiDLV_KEY_NO_9() { return m_EdiDLV_KEY_NO_9; }
	public String getEdiDLV_KEY_NO_10() { return m_EdiDLV_KEY_NO_10; }
	public String getEdiDLV_KEY_NO_11() { return m_EdiDLV_KEY_NO_11; }
	public String getEdiDLV_KEY_NO_12() { return m_EdiDLV_KEY_NO_12; }
	public String getEdiDLV_KEY_NO_13() { return m_EdiDLV_KEY_NO_13; }
	public String getEdiDLV_KEY_NO_14() { return m_EdiDLV_KEY_NO_14; }
	public String getEdiDLV_KEY_NO_15() { return m_EdiDLV_KEY_NO_15; }
	public String getEdiDLV_KEY_NO_16() { return m_EdiDLV_KEY_NO_16; }
	public String getEdiDLV_KEY_NO_17() { return m_EdiDLV_KEY_NO_17; }
	public String getEdiDLV_KEY_NO_18() { return m_EdiDLV_KEY_NO_18; }
	public String getEdiDLV_KEY_NO_19() { return m_EdiDLV_KEY_NO_19; }
	public String getEdiDLV_KEY_NO_20() { return m_EdiDLV_KEY_NO_20; }
	public String getEdiDLV_KEY_NO_21() { return m_EdiDLV_KEY_NO_21; }
	public String getEdiDLV_KEY_NO_22() { return m_EdiDLV_KEY_NO_22; }
	public String getEdiDLV_KEY_NO_23() { return m_EdiDLV_KEY_NO_23; }
	public String getEdiDLV_KEY_NO_24() { return m_EdiDLV_KEY_NO_24; }
	public String getEdiDLV_KEY_NO_25() { return m_EdiDLV_KEY_NO_25; }
	public String getEdiDLV_KEY_NO_26() { return m_EdiDLV_KEY_NO_26; }
	public String getEdiDLV_KEY_NO_27() { return m_EdiDLV_KEY_NO_27; }
	public String getEdiDLV_KEY_NO_28() { return m_EdiDLV_KEY_NO_28; }
	public String getEdiDLV_KEY_NO_29() { return m_EdiDLV_KEY_NO_29; }
	public String getEdiDLV_KEY_NO_30() { return m_EdiDLV_KEY_NO_30; }
	public String getEdiDLV_KEY_NO_31() { return m_EdiDLV_KEY_NO_31; }
	public String getEdiDLV_LOC_NAME() { return m_EdiDLV_LOC_NAME; }
	public String getEdiCLIENT_BARCODE_INF() { return m_EdiCLIENT_BARCODE_INF; }
	public String getEdiCLIENT_REMARK() { return m_EdiCLIENT_REMARK; }
	public String getEdiCONTRACT_COND_TYP() { return m_EdiCONTRACT_COND_TYP; }
	public String getEdiPUCH_ODR_SHAP_TYP() { return m_EdiPUCH_ODR_SHAP_TYP; }
	public String getEdiMASTER_PUCH_ODR_CD() { return m_EdiMASTER_PUCH_ODR_CD; }
	public String getEdiQTY_CONTRACT_TYP() { return m_EdiQTY_CONTRACT_TYP; }
	public String getEdiODR_MODIFICATION_TYP_1() { return m_EdiODR_MODIFICATION_TYP_1; }
	public String getEdiODR_MODIFICATION_TYP_2() { return m_EdiODR_MODIFICATION_TYP_2; }
	public String getEdiODR_MODIFICATION_TYP_3() { return m_EdiODR_MODIFICATION_TYP_3; }
	public String getEdiMACHINE_TYP_CD() { return m_EdiMACHINE_TYP_CD; }
	public String getEdiENGINNERING_CHG_CD() { return m_EdiENGINNERING_CHG_CD; }
	public String getEdiDROW_SPEC_CD() { return m_EdiDROW_SPEC_CD; }
	public String getEdiDLV_DOC_FORM_1() { return m_EdiDLV_DOC_FORM_1; }
	public Double getEdiDLV_DOC_COPY_NUM_1() { return m_EdiDLV_DOC_COPY_NUM_1; }
	public String getEdiDLV_DOC_LANG_1() { return m_EdiDLV_DOC_LANG_1; }
	public String getEdiDLV_DOC_FORM_2() { return m_EdiDLV_DOC_FORM_2; }
	public Double getEdiDLV_DOC_COPY_NUM_2() { return m_EdiDLV_DOC_COPY_NUM_2; }
	public String getEdiDLV_DOC_LANG_2() { return m_EdiDLV_DOC_LANG_2; }
	public String getEdiDLV_DOC_FORM_3() { return m_EdiDLV_DOC_FORM_3; }
	public Double getEdiDLV_DOC_COPY_NUM_3() { return m_EdiDLV_DOC_COPY_NUM_3; }
	public String getEdiDLV_DOC_LANG_3() { return m_EdiDLV_DOC_LANG_3; }
	public String getEdiDLV_DOC_FORM_4() { return m_EdiDLV_DOC_FORM_4; }
	public Double getEdiDLV_DOC_COPY_NUM_4() { return m_EdiDLV_DOC_COPY_NUM_4; }
	public String getEdiDLV_DOC_LANG_4() { return m_EdiDLV_DOC_LANG_4; }
	public String getEdiSTRATEGIC_GOODS_TYP() { return m_EdiSTRATEGIC_GOODS_TYP; }
	public String getEdiORGN_PLACE_CD_1() { return m_EdiORGN_PLACE_CD_1; }
	public String getEdiORGN_PLACE_CD_2() { return m_EdiORGN_PLACE_CD_2; }
	public String getEdiORGN_PLACE_CD_3() { return m_EdiORGN_PLACE_CD_3; }
	public String getEdiORGN_PLACE_CD_4() { return m_EdiORGN_PLACE_CD_4; }
	public String getEdiORGN_PLACE_CD_5() { return m_EdiORGN_PLACE_CD_5; }
	public String getEdiDLV_TIME_1() { return m_EdiDLV_TIME_1; }
	public String getEdiDLV_TIME_2() { return m_EdiDLV_TIME_2; }
	public String getEdiDLV_TIME_3() { return m_EdiDLV_TIME_3; }
	public String getEdiDLV_TIME_4() { return m_EdiDLV_TIME_4; }
	public String getEdiDLV_TIME_5() { return m_EdiDLV_TIME_5; }
	public String getEdiDLV_TIME_6() { return m_EdiDLV_TIME_6; }
	public String getEdiDLV_TIME_7() { return m_EdiDLV_TIME_7; }
	public String getEdiDLV_TIME_8() { return m_EdiDLV_TIME_8; }
	public String getEdiDLV_TIME_9() { return m_EdiDLV_TIME_9; }
	public String getEdiDLV_TIME_10() { return m_EdiDLV_TIME_10; }
	public String getEdiDLV_TIME_11() { return m_EdiDLV_TIME_11; }
	public String getEdiDLV_TIME_12() { return m_EdiDLV_TIME_12; }
	public String getEdiDLV_TIME_13() { return m_EdiDLV_TIME_13; }
	public String getEdiDLV_TIME_14() { return m_EdiDLV_TIME_14; }
	public String getEdiDLV_TIME_15() { return m_EdiDLV_TIME_15; }
	public String getEdiDLV_TIME_16() { return m_EdiDLV_TIME_16; }
	public String getEdiDLV_TIME_17() { return m_EdiDLV_TIME_17; }
	public String getEdiDLV_TIME_18() { return m_EdiDLV_TIME_18; }
	public String getEdiDLV_TIME_19() { return m_EdiDLV_TIME_19; }
	public String getEdiDLV_TIME_20() { return m_EdiDLV_TIME_20; }
	public String getEdiDLV_TIME_21() { return m_EdiDLV_TIME_21; }
	public String getEdiDLV_TIME_22() { return m_EdiDLV_TIME_22; }
	public String getEdiDLV_TIME_23() { return m_EdiDLV_TIME_23; }
	public String getEdiDLV_TIME_24() { return m_EdiDLV_TIME_24; }
	public String getEdiDLV_TIME_25() { return m_EdiDLV_TIME_25; }
	public String getEdiDLV_TIME_26() { return m_EdiDLV_TIME_26; }
	public String getEdiDLV_TIME_27() { return m_EdiDLV_TIME_27; }
	public String getEdiDLV_TIME_28() { return m_EdiDLV_TIME_28; }
	public String getEdiDLV_TIME_29() { return m_EdiDLV_TIME_29; }
	public String getEdiDLV_TIME_30() { return m_EdiDLV_TIME_30; }
	public String getEdiDLV_TIME_31() { return m_EdiDLV_TIME_31; }
	public String getEdiPACKAGE_DLV_CD() { return m_EdiPACKAGE_DLV_CD; }
	public String getEdiSPEC() { return m_EdiSPEC; }
	public String getEdiBUYER_ORG_NAME() { return m_EdiBUYER_ORG_NAME; }
	public Double getEdiDLV_PART_LEN_1() { return m_EdiDLV_PART_LEN_1; }
	public Double getEdiDLV_PART_QTY_1() { return m_EdiDLV_PART_QTY_1; }
	public Double getEdiDLV_PART_LEN_2() { return m_EdiDLV_PART_LEN_2; }
	public Double getEdiDLV_PART_QTY_2() { return m_EdiDLV_PART_QTY_2; }
	public Double getEdiDLV_PART_LEN_3() { return m_EdiDLV_PART_LEN_3; }
	public Double getEdiDLV_PART_QTY_3() { return m_EdiDLV_PART_QTY_3; }
	public Double getEdiDLV_PART_LEN_4() { return m_EdiDLV_PART_LEN_4; }
	public Double getEdiDLV_PART_QTY_4() { return m_EdiDLV_PART_QTY_4; }
	public Double getEdiDLV_PART_LEN_5() { return m_EdiDLV_PART_LEN_5; }
	public Double getEdiDLV_PART_QTY_5() { return m_EdiDLV_PART_QTY_5; }
	public Double getEdiDLV_PART_LEN_6() { return m_EdiDLV_PART_LEN_6; }
	public Double getEdiDLV_PART_QTY_6() { return m_EdiDLV_PART_QTY_6; }
	public Double getEdiDLV_PART_LEN_7() { return m_EdiDLV_PART_LEN_7; }
	public Double getEdiDLV_PART_QTY_7() { return m_EdiDLV_PART_QTY_7; }
	public Double getEdiDLV_PART_LEN_8() { return m_EdiDLV_PART_LEN_8; }
	public Double getEdiDLV_PART_QTY_8() { return m_EdiDLV_PART_QTY_8; }
	public Double getEdiDLV_PART_LEN_9() { return m_EdiDLV_PART_LEN_9; }
	public Double getEdiDLV_PART_QTY_9() { return m_EdiDLV_PART_QTY_9; }
	public Double getEdiDLV_PART_LEN_10() { return m_EdiDLV_PART_LEN_10; }
	public Double getEdiDLV_PART_QTY_10() { return m_EdiDLV_PART_QTY_10; }
	public String getEdiDLV_PART_UNIT() { return m_EdiDLV_PART_UNIT; }
	public String getEdiCUST_CONSTRUCT_NAME() { return m_EdiCUST_CONSTRUCT_NAME; }
	public String getEdiMATERIAL_CD() { return m_EdiMATERIAL_CD; }
	public Double getEdiMATERIAL_UNIT_PRICE() { return m_EdiMATERIAL_UNIT_PRICE; }
	public String getEdiMATERIAL_UNIT() { return m_EdiMATERIAL_UNIT; }
	public String getEdiTEST_REPORT_NEED_TYP() { return m_EdiTEST_REPORT_NEED_TYP; }
	public String getEdiTEST_REPORT_CHK_TYP() { return m_EdiTEST_REPORT_CHK_TYP; }
	public String getEdiTEST_REPORT_PRESENT_TYP() { return m_EdiTEST_REPORT_PRESENT_TYP; }
	public String getEdiMUNICIPAL_CD() { return m_EdiMUNICIPAL_CD; }
	public String getEdiDLV_CONTACT_TEL() { return m_EdiDLV_CONTACT_TEL; }
	public String getEdiSLIP_PRICE_PRINT_TYP() { return m_EdiSLIP_PRICE_PRINT_TYP; }
	public String getEdiBUYER_NAME_KANJI() { return m_EdiBUYER_NAME_KANJI; }
	public String getEdiSPEC_KANJI() { return m_EdiSPEC_KANJI; }
	public String getEdiITEM_NAME_KANJI() { return m_EdiITEM_NAME_KANJI; }
	public String getEdiREMARKS_KANJI() { return m_EdiREMARKS_KANJI; }
	public String getEdiEND_USER_NAME_KANJI() { return m_EdiEND_USER_NAME_KANJI; }
	public String getEdiDLV_ADDRESS_KANJI() { return m_EdiDLV_ADDRESS_KANJI; }
	public String getEdiDLV_ADDRESSEE_KANJI() { return m_EdiDLV_ADDRESSEE_KANJI; }
	public String getEdiEND_USER_ITEM_NAME_KANJI() { return m_EdiEND_USER_ITEM_NAME_KANJI; }
	public String getEdiCUST_DESINATED_MAKER_KANJI() { return m_EdiCUST_DESINATED_MAKER_KANJI; }
	public String getEdiDLV_LOC_NAME_KANJI() { return m_EdiDLV_LOC_NAME_KANJI; }
	public String getEdiCLIENT_REMARK_KANJI() { return m_EdiCLIENT_REMARK_KANJI; }
	public String getEdiMACHINE_TYPE_NAME_KANJI() { return m_EdiMACHINE_TYPE_NAME_KANJI; }
	public String getEdiCUST_SPC_KANJI() { return m_EdiCUST_SPC_KANJI; }
	public String getEdiBUYER_ORG_NAME_KANJI() { return m_EdiBUYER_ORG_NAME_KANJI; }
	public String getEdiCUST_CONSTRUCT_NAME_KANJI() { return m_EdiCUST_CONSTRUCT_NAME_KANJI; }
	public String getEdiCUR_CD() { return m_EdiCUR_CD; }
	public Double getEdiUNIT_PRICE_EXCH_RATES() { return m_EdiUNIT_PRICE_EXCH_RATES; }
	public Double getEdiODR_AMOUNT_EXCH_RATES() { return m_EdiODR_AMOUNT_EXCH_RATES; }
	public Double getEdiTAX_AMOUNT_EXCH_RATES() { return m_EdiTAX_AMOUNT_EXCH_RATES; }
	public Double getEdiTOTAL_AMOUNT_EXCH_RATES() { return m_EdiTOTAL_AMOUNT_EXCH_RATES; }
	public Double getEdiUNCONFIRM_AMOUNT_EXCH_RATES() { return m_EdiUNCONFIRM_AMOUNT_EXCH_RATES; }
	public Double getEdiMATERIAL_CD_EXCH_RATES() { return m_EdiMATERIAL_CD_EXCH_RATES; }
	public String getEdiPLANNING_ODR_CD() { return m_EdiPLANNING_ODR_CD; }
	public String getEdiPLANNING_ODR_DATE() { return m_EdiPLANNING_ODR_DATE; }
	public Double getEdiSTANDARD_DLV_TERM() { return m_EdiSTANDARD_DLV_TERM; }
	public Double getEdiREQUIRED_TERM() { return m_EdiREQUIRED_TERM; }
	public String getEdiSYSTEM_PROC_TYP() { return m_EdiSYSTEM_PROC_TYP; }
	public Double getODR_INFO_COM_IF_CTRL_NO() { return m_ODR_INFO_COM_IF_CTRL_NO; }
	public Double getODR_SEQ() { return m_ODR_SEQ; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getINFO_TYP_CD() { return m_INFO_TYP_CD; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getPART_NAME() { return m_PART_NAME; }
	public String getPROC_TYP() { return m_PROC_TYP; }
	public String getCOCK_TYP() { return m_COCK_TYP; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public Double getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public Double getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getINSPC_TYP() { return m_INSPC_TYP; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_CD_EIAJ() { return m_DLV_LOC_CD_EIAJ; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getCUS_DLV_CD() { return m_CUS_DLV_CD; }
	public String getCUS_DLV_KEY_CD() { return m_CUS_DLV_KEY_CD; }
	public String getFREE_REMARK() { return m_FREE_REMARK; }
	public String getREMARK() { return m_REMARK; }
	public String getCLIENT_BARCODE_INF() { return m_CLIENT_BARCODE_INF; }
	public String getCLIENT_REMARK() { return m_CLIENT_REMARK; }
	public String getCLIENT_REMARK_KANJI() { return m_CLIENT_REMARK_KANJI; }
	public String getSLIP_PRICE_PRINT_TYP() { return m_SLIP_PRICE_PRINT_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getUNIT_CD_ORG() { return m_UNIT_CD_ORG; }
	public Double getPUCH_ODR_QTY_TOTAL() { return m_PUCH_ODR_QTY_TOTAL; }
	public String getBUYER_NAME() { return m_BUYER_NAME; }
	public Double getODR_ACPT_PROC_ODR() { return m_ODR_ACPT_PROC_ODR; }
	public String getBUYER_ORG_CD() { return m_BUYER_ORG_CD; }
	public String getbtBUSINESS_OPR_DATE() { return m_btBUSINESS_OPR_DATE; }
	public String getbtPLANT_CD() { return m_btPLANT_CD; }
	public String getstrJP_CUR() { return m_strJP_CUR; }
	public String getcustCUST_CD() { return m_custCUST_CD; }
	public String getcustCUR_CD() { return m_custCUR_CD; }
	public String getcustEDI_CUST_VEND_CD() { return m_custEDI_CUST_VEND_CD; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setEdiODR_INFO_IF_CTRL_NO(Double arg) { m_EdiODR_INFO_IF_CTRL_NO = arg; }
	public void setEdiDATA_PROC_CD(Double arg) { m_EdiDATA_PROC_CD = arg; }
	public void setEdiINFO_TYP_CD(String arg) { m_EdiINFO_TYP_CD = arg; }
	public void setEdiDATA_CREATED_DATE(String arg) { m_EdiDATA_CREATED_DATE = arg; }
	public void setEdiCLIENT_CD(String arg) { m_EdiCLIENT_CD = arg; }
	public void setEdiTRUSTEE_CD(String arg) { m_EdiTRUSTEE_CD = arg; }
	public void setEdiBUYER_ORG_CD(String arg) { m_EdiBUYER_ORG_CD = arg; }
	public void setEdiPUCH_ODR_CD(String arg) { m_EdiPUCH_ODR_CD = arg; }
	public void setEdiPRDCT_ODR_CD(String arg) { m_EdiPRDCT_ODR_CD = arg; }
	public void setEdiMODIFICATION_CODE(String arg) { m_EdiMODIFICATION_CODE = arg; }
	public void setEdiCOCK_TYP(String arg) { m_EdiCOCK_TYP = arg; }
	public void setEdiPUCH_ODR_DATE(String arg) { m_EdiPUCH_ODR_DATE = arg; }
	public void setEdiUNIT(String arg) { m_EdiUNIT = arg; }
	public void setEdiUNIT_PRICE(Double arg) { m_EdiUNIT_PRICE = arg; }
	public void setEdiPRICE_TYP(String arg) { m_EdiPRICE_TYP = arg; }
	public void setEdiPUCH_ODR_QTY(Double arg) { m_EdiPUCH_ODR_QTY = arg; }
	public void setEdiPUCH_ODR_AMOUNT(Double arg) { m_EdiPUCH_ODR_AMOUNT = arg; }
	public void setEdiCONS_TYP(String arg) { m_EdiCONS_TYP = arg; }
	public void setEdiBUYER_NAME(String arg) { m_EdiBUYER_NAME = arg; }
	public void setEdiMATR_SPEC_SIZE(String arg) { m_EdiMATR_SPEC_SIZE = arg; }
	public void setEdiSPECTP(String arg) { m_EdiSPECTP = arg; }
	public void setEdiDROWING_EDITION(String arg) { m_EdiDROWING_EDITION = arg; }
	public void setEdiPART_NAME(String arg) { m_EdiPART_NAME = arg; }
	public void setEdiOWN_ITEM_CD(String arg) { m_EdiOWN_ITEM_CD = arg; }
	public void setEdiCUST_ITEM_CD(String arg) { m_EdiCUST_ITEM_CD = arg; }
	public void setEdiDROW_SPEC_QTY(Double arg) { m_EdiDROW_SPEC_QTY = arg; }
	public void setEdiPKG_UNIT(String arg) { m_EdiPKG_UNIT = arg; }
	public void setEdiDIRECT_DLV_TYP(String arg) { m_EdiDIRECT_DLV_TYP = arg; }
	public void setEdiDLV_LOC_CD(String arg) { m_EdiDLV_LOC_CD = arg; }
	public void setEdiINSPC_TYP(String arg) { m_EdiINSPC_TYP = arg; }
	public void setEdiDLV_INST_TYP(String arg) { m_EdiDLV_INST_TYP = arg; }
	public void setEdiSCDL_DLV_DATE_1(String arg) { m_EdiSCDL_DLV_DATE_1 = arg; }
	public void setEdiSCDL_DLV_QTY_1(Double arg) { m_EdiSCDL_DLV_QTY_1 = arg; }
	public void setEdiDLV_CD_1(String arg) { m_EdiDLV_CD_1 = arg; }
	public void setEdiSCDL_DLV_DATE_2(String arg) { m_EdiSCDL_DLV_DATE_2 = arg; }
	public void setEdiSCDL_DLV_QTY_2(Double arg) { m_EdiSCDL_DLV_QTY_2 = arg; }
	public void setEdiDLV_CD_2(String arg) { m_EdiDLV_CD_2 = arg; }
	public void setEdiSCDL_DLV_DATE_3(String arg) { m_EdiSCDL_DLV_DATE_3 = arg; }
	public void setEdiSCDL_DLV_QTY_3(Double arg) { m_EdiSCDL_DLV_QTY_3 = arg; }
	public void setEdiDLV_CD_3(String arg) { m_EdiDLV_CD_3 = arg; }
	public void setEdiSCDL_DLV_DATE_4(String arg) { m_EdiSCDL_DLV_DATE_4 = arg; }
	public void setEdiSCDL_DLV_QTY_4(Double arg) { m_EdiSCDL_DLV_QTY_4 = arg; }
	public void setEdiDLV_CD_4(String arg) { m_EdiDLV_CD_4 = arg; }
	public void setEdiSCDL_DLV_DATE_5(String arg) { m_EdiSCDL_DLV_DATE_5 = arg; }
	public void setEdiSCDL_DLV_QTY_5(Double arg) { m_EdiSCDL_DLV_QTY_5 = arg; }
	public void setEdiDLV_CD_5(String arg) { m_EdiDLV_CD_5 = arg; }
	public void setEdiSCDL_DLV_DATE_6(String arg) { m_EdiSCDL_DLV_DATE_6 = arg; }
	public void setEdiSCDL_DLV_QTY_6(Double arg) { m_EdiSCDL_DLV_QTY_6 = arg; }
	public void setEdiDLV_CD_6(String arg) { m_EdiDLV_CD_6 = arg; }
	public void setEdiSCDL_DLV_DATE_7(String arg) { m_EdiSCDL_DLV_DATE_7 = arg; }
	public void setEdiSCDL_DLV_QTY_7(Double arg) { m_EdiSCDL_DLV_QTY_7 = arg; }
	public void setEdiDLV_CD_7(String arg) { m_EdiDLV_CD_7 = arg; }
	public void setEdiSCDL_DLV_DATE_8(String arg) { m_EdiSCDL_DLV_DATE_8 = arg; }
	public void setEdiSCDL_DLV_QTY_8(Double arg) { m_EdiSCDL_DLV_QTY_8 = arg; }
	public void setEdiDLV_CD_8(String arg) { m_EdiDLV_CD_8 = arg; }
	public void setEdiSCDL_DLV_DATE_9(String arg) { m_EdiSCDL_DLV_DATE_9 = arg; }
	public void setEdiSCDL_DLV_QTY_9(Double arg) { m_EdiSCDL_DLV_QTY_9 = arg; }
	public void setEdiDLV_CD_9(String arg) { m_EdiDLV_CD_9 = arg; }
	public void setEdiSCDL_DLV_DATE_10(String arg) { m_EdiSCDL_DLV_DATE_10 = arg; }
	public void setEdiSCDL_DLV_QTY_10(Double arg) { m_EdiSCDL_DLV_QTY_10 = arg; }
	public void setEdiDLV_CD_10(String arg) { m_EdiDLV_CD_10 = arg; }
	public void setEdiSCDL_DLV_DATE_11(String arg) { m_EdiSCDL_DLV_DATE_11 = arg; }
	public void setEdiSCDL_DLV_QTY_11(Double arg) { m_EdiSCDL_DLV_QTY_11 = arg; }
	public void setEdiDLV_CD_11(String arg) { m_EdiDLV_CD_11 = arg; }
	public void setEdiSCDL_DLV_DATE_12(String arg) { m_EdiSCDL_DLV_DATE_12 = arg; }
	public void setEdiSCDL_DLV_QTY_12(Double arg) { m_EdiSCDL_DLV_QTY_12 = arg; }
	public void setEdiDLV_CD_12(String arg) { m_EdiDLV_CD_12 = arg; }
	public void setEdiSCDL_DLV_DATE_13(String arg) { m_EdiSCDL_DLV_DATE_13 = arg; }
	public void setEdiSCDL_DLV_QTY_13(Double arg) { m_EdiSCDL_DLV_QTY_13 = arg; }
	public void setEdiDLV_CD_13(String arg) { m_EdiDLV_CD_13 = arg; }
	public void setEdiSCDL_DLV_DATE_14(String arg) { m_EdiSCDL_DLV_DATE_14 = arg; }
	public void setEdiSCDL_DLV_QTY_14(Double arg) { m_EdiSCDL_DLV_QTY_14 = arg; }
	public void setEdiDLV_CD_14(String arg) { m_EdiDLV_CD_14 = arg; }
	public void setEdiSCDL_DLV_DATE_15(String arg) { m_EdiSCDL_DLV_DATE_15 = arg; }
	public void setEdiSCDL_DLV_QTY_15(Double arg) { m_EdiSCDL_DLV_QTY_15 = arg; }
	public void setEdiDLV_CD_15(String arg) { m_EdiDLV_CD_15 = arg; }
	public void setEdiSCDL_DLV_DATE_16(String arg) { m_EdiSCDL_DLV_DATE_16 = arg; }
	public void setEdiSCDL_DLV_QTY_16(Double arg) { m_EdiSCDL_DLV_QTY_16 = arg; }
	public void setEdiDLV_CD_16(String arg) { m_EdiDLV_CD_16 = arg; }
	public void setEdiSCDL_DLV_DATE_17(String arg) { m_EdiSCDL_DLV_DATE_17 = arg; }
	public void setEdiSCDL_DLV_QTY_17(Double arg) { m_EdiSCDL_DLV_QTY_17 = arg; }
	public void setEdiDLV_CD_17(String arg) { m_EdiDLV_CD_17 = arg; }
	public void setEdiSCDL_DLV_DATE_18(String arg) { m_EdiSCDL_DLV_DATE_18 = arg; }
	public void setEdiSCDL_DLV_QTY_18(Double arg) { m_EdiSCDL_DLV_QTY_18 = arg; }
	public void setEdiDLV_CD_18(String arg) { m_EdiDLV_CD_18 = arg; }
	public void setEdiSCDL_DLV_DATE_19(String arg) { m_EdiSCDL_DLV_DATE_19 = arg; }
	public void setEdiSCDL_DLV_QTY_19(Double arg) { m_EdiSCDL_DLV_QTY_19 = arg; }
	public void setEdiDLV_CD_19(String arg) { m_EdiDLV_CD_19 = arg; }
	public void setEdiSCDL_DLV_DATE_20(String arg) { m_EdiSCDL_DLV_DATE_20 = arg; }
	public void setEdiSCDL_DLV_QTY_20(Double arg) { m_EdiSCDL_DLV_QTY_20 = arg; }
	public void setEdiDLV_CD_20(String arg) { m_EdiDLV_CD_20 = arg; }
	public void setEdiSCDL_DLV_DATE_21(String arg) { m_EdiSCDL_DLV_DATE_21 = arg; }
	public void setEdiSCDL_DLV_QTY_21(Double arg) { m_EdiSCDL_DLV_QTY_21 = arg; }
	public void setEdiDLV_CD_21(String arg) { m_EdiDLV_CD_21 = arg; }
	public void setEdiSCDL_DLV_DATE_22(String arg) { m_EdiSCDL_DLV_DATE_22 = arg; }
	public void setEdiSCDL_DLV_QTY_22(Double arg) { m_EdiSCDL_DLV_QTY_22 = arg; }
	public void setEdiDLV_CD_22(String arg) { m_EdiDLV_CD_22 = arg; }
	public void setEdiSCDL_DLV_DATE_23(String arg) { m_EdiSCDL_DLV_DATE_23 = arg; }
	public void setEdiSCDL_DLV_QTY_23(Double arg) { m_EdiSCDL_DLV_QTY_23 = arg; }
	public void setEdiDLV_CD_23(String arg) { m_EdiDLV_CD_23 = arg; }
	public void setEdiSCDL_DLV_DATE_24(String arg) { m_EdiSCDL_DLV_DATE_24 = arg; }
	public void setEdiSCDL_DLV_QTY_24(Double arg) { m_EdiSCDL_DLV_QTY_24 = arg; }
	public void setEdiDLV_CD_24(String arg) { m_EdiDLV_CD_24 = arg; }
	public void setEdiSCDL_DLV_DATE_25(String arg) { m_EdiSCDL_DLV_DATE_25 = arg; }
	public void setEdiSCDL_DLV_QTY_25(Double arg) { m_EdiSCDL_DLV_QTY_25 = arg; }
	public void setEdiDLV_CD_25(String arg) { m_EdiDLV_CD_25 = arg; }
	public void setEdiSCDL_DLV_DATE_26(String arg) { m_EdiSCDL_DLV_DATE_26 = arg; }
	public void setEdiSCDL_DLV_QTY_26(Double arg) { m_EdiSCDL_DLV_QTY_26 = arg; }
	public void setEdiDLV_CD_26(String arg) { m_EdiDLV_CD_26 = arg; }
	public void setEdiSCDL_DLV_DATE_27(String arg) { m_EdiSCDL_DLV_DATE_27 = arg; }
	public void setEdiSCDL_DLV_QTY_27(Double arg) { m_EdiSCDL_DLV_QTY_27 = arg; }
	public void setEdiDLV_CD_27(String arg) { m_EdiDLV_CD_27 = arg; }
	public void setEdiSCDL_DLV_DATE_28(String arg) { m_EdiSCDL_DLV_DATE_28 = arg; }
	public void setEdiSCDL_DLV_QTY_28(Double arg) { m_EdiSCDL_DLV_QTY_28 = arg; }
	public void setEdiDLV_CD_28(String arg) { m_EdiDLV_CD_28 = arg; }
	public void setEdiSCDL_DLV_DATE_29(String arg) { m_EdiSCDL_DLV_DATE_29 = arg; }
	public void setEdiSCDL_DLV_QTY_29(Double arg) { m_EdiSCDL_DLV_QTY_29 = arg; }
	public void setEdiDLV_CD_29(String arg) { m_EdiDLV_CD_29 = arg; }
	public void setEdiSCDL_DLV_DATE_30(String arg) { m_EdiSCDL_DLV_DATE_30 = arg; }
	public void setEdiSCDL_DLV_QTY_30(Double arg) { m_EdiSCDL_DLV_QTY_30 = arg; }
	public void setEdiDLV_CD_30(String arg) { m_EdiDLV_CD_30 = arg; }
	public void setEdiSCDL_DLV_DATE_31(String arg) { m_EdiSCDL_DLV_DATE_31 = arg; }
	public void setEdiSCDL_DLV_QTY_31(Double arg) { m_EdiSCDL_DLV_QTY_31 = arg; }
	public void setEdiDLV_CD_31(String arg) { m_EdiDLV_CD_31 = arg; }
	public void setEdiFREE_TEXT(String arg) { m_EdiFREE_TEXT = arg; }
	public void setEdiREMARKS(String arg) { m_EdiREMARKS = arg; }
	public void setEdiTAX_TYP(String arg) { m_EdiTAX_TYP = arg; }
	public void setEdiCUST_TAXATION_TYP(String arg) { m_EdiCUST_TAXATION_TYP = arg; }
	public void setEdiTAX_AMOUNT(Double arg) { m_EdiTAX_AMOUNT = arg; }
	public void setEdiCUST_TOTAL_AMOUNT(Double arg) { m_EdiCUST_TOTAL_AMOUNT = arg; }
	public void setEdiUNCONFIRM_ODR_CD(String arg) { m_EdiUNCONFIRM_ODR_CD = arg; }
	public void setEdiUNCONFIRM_ODR_DATE(String arg) { m_EdiUNCONFIRM_ODR_DATE = arg; }
	public void setEdiUNCONFIRM_ODR_QTY(Double arg) { m_EdiUNCONFIRM_ODR_QTY = arg; }
	public void setEdiUNCONFIRM_ODR_AMOUNT(Double arg) { m_EdiUNCONFIRM_ODR_AMOUNT = arg; }
	public void setEdiESTIMATE_REQST_CD(String arg) { m_EdiESTIMATE_REQST_CD = arg; }
	public void setEdiSTL_COND_CD(String arg) { m_EdiSTL_COND_CD = arg; }
	public void setEdiEND_USER_NAME(String arg) { m_EdiEND_USER_NAME = arg; }
	public void setEdiDLV_ZIP_CD(String arg) { m_EdiDLV_ZIP_CD = arg; }
	public void setEdiDLV_ADDRESS(String arg) { m_EdiDLV_ADDRESS = arg; }
	public void setEdiDLV_ADDRESSEE(String arg) { m_EdiDLV_ADDRESSEE = arg; }
	public void setEdiCUST_COMM_SUBNAME(String arg) { m_EdiCUST_COMM_SUBNAME = arg; }
	public void setEdiCUST_COMM_SUBCD(String arg) { m_EdiCUST_COMM_SUBCD = arg; }
	public void setEdiEND_USER_ODR_CD(String arg) { m_EdiEND_USER_ODR_CD = arg; }
	public void setEdiCUST_DESINATED_MAKER(String arg) { m_EdiCUST_DESINATED_MAKER = arg; }
	public void setEdiDLV_KEY_NO_1(String arg) { m_EdiDLV_KEY_NO_1 = arg; }
	public void setEdiDLV_KEY_NO_2(String arg) { m_EdiDLV_KEY_NO_2 = arg; }
	public void setEdiDLV_KEY_NO_3(String arg) { m_EdiDLV_KEY_NO_3 = arg; }
	public void setEdiDLV_KEY_NO_4(String arg) { m_EdiDLV_KEY_NO_4 = arg; }
	public void setEdiDLV_KEY_NO_5(String arg) { m_EdiDLV_KEY_NO_5 = arg; }
	public void setEdiDLV_KEY_NO_6(String arg) { m_EdiDLV_KEY_NO_6 = arg; }
	public void setEdiDLV_KEY_NO_7(String arg) { m_EdiDLV_KEY_NO_7 = arg; }
	public void setEdiDLV_KEY_NO_8(String arg) { m_EdiDLV_KEY_NO_8 = arg; }
	public void setEdiDLV_KEY_NO_9(String arg) { m_EdiDLV_KEY_NO_9 = arg; }
	public void setEdiDLV_KEY_NO_10(String arg) { m_EdiDLV_KEY_NO_10 = arg; }
	public void setEdiDLV_KEY_NO_11(String arg) { m_EdiDLV_KEY_NO_11 = arg; }
	public void setEdiDLV_KEY_NO_12(String arg) { m_EdiDLV_KEY_NO_12 = arg; }
	public void setEdiDLV_KEY_NO_13(String arg) { m_EdiDLV_KEY_NO_13 = arg; }
	public void setEdiDLV_KEY_NO_14(String arg) { m_EdiDLV_KEY_NO_14 = arg; }
	public void setEdiDLV_KEY_NO_15(String arg) { m_EdiDLV_KEY_NO_15 = arg; }
	public void setEdiDLV_KEY_NO_16(String arg) { m_EdiDLV_KEY_NO_16 = arg; }
	public void setEdiDLV_KEY_NO_17(String arg) { m_EdiDLV_KEY_NO_17 = arg; }
	public void setEdiDLV_KEY_NO_18(String arg) { m_EdiDLV_KEY_NO_18 = arg; }
	public void setEdiDLV_KEY_NO_19(String arg) { m_EdiDLV_KEY_NO_19 = arg; }
	public void setEdiDLV_KEY_NO_20(String arg) { m_EdiDLV_KEY_NO_20 = arg; }
	public void setEdiDLV_KEY_NO_21(String arg) { m_EdiDLV_KEY_NO_21 = arg; }
	public void setEdiDLV_KEY_NO_22(String arg) { m_EdiDLV_KEY_NO_22 = arg; }
	public void setEdiDLV_KEY_NO_23(String arg) { m_EdiDLV_KEY_NO_23 = arg; }
	public void setEdiDLV_KEY_NO_24(String arg) { m_EdiDLV_KEY_NO_24 = arg; }
	public void setEdiDLV_KEY_NO_25(String arg) { m_EdiDLV_KEY_NO_25 = arg; }
	public void setEdiDLV_KEY_NO_26(String arg) { m_EdiDLV_KEY_NO_26 = arg; }
	public void setEdiDLV_KEY_NO_27(String arg) { m_EdiDLV_KEY_NO_27 = arg; }
	public void setEdiDLV_KEY_NO_28(String arg) { m_EdiDLV_KEY_NO_28 = arg; }
	public void setEdiDLV_KEY_NO_29(String arg) { m_EdiDLV_KEY_NO_29 = arg; }
	public void setEdiDLV_KEY_NO_30(String arg) { m_EdiDLV_KEY_NO_30 = arg; }
	public void setEdiDLV_KEY_NO_31(String arg) { m_EdiDLV_KEY_NO_31 = arg; }
	public void setEdiDLV_LOC_NAME(String arg) { m_EdiDLV_LOC_NAME = arg; }
	public void setEdiCLIENT_BARCODE_INF(String arg) { m_EdiCLIENT_BARCODE_INF = arg; }
	public void setEdiCLIENT_REMARK(String arg) { m_EdiCLIENT_REMARK = arg; }
	public void setEdiCONTRACT_COND_TYP(String arg) { m_EdiCONTRACT_COND_TYP = arg; }
	public void setEdiPUCH_ODR_SHAP_TYP(String arg) { m_EdiPUCH_ODR_SHAP_TYP = arg; }
	public void setEdiMASTER_PUCH_ODR_CD(String arg) { m_EdiMASTER_PUCH_ODR_CD = arg; }
	public void setEdiQTY_CONTRACT_TYP(String arg) { m_EdiQTY_CONTRACT_TYP = arg; }
	public void setEdiODR_MODIFICATION_TYP_1(String arg) { m_EdiODR_MODIFICATION_TYP_1 = arg; }
	public void setEdiODR_MODIFICATION_TYP_2(String arg) { m_EdiODR_MODIFICATION_TYP_2 = arg; }
	public void setEdiODR_MODIFICATION_TYP_3(String arg) { m_EdiODR_MODIFICATION_TYP_3 = arg; }
	public void setEdiMACHINE_TYP_CD(String arg) { m_EdiMACHINE_TYP_CD = arg; }
	public void setEdiENGINNERING_CHG_CD(String arg) { m_EdiENGINNERING_CHG_CD = arg; }
	public void setEdiDROW_SPEC_CD(String arg) { m_EdiDROW_SPEC_CD = arg; }
	public void setEdiDLV_DOC_FORM_1(String arg) { m_EdiDLV_DOC_FORM_1 = arg; }
	public void setEdiDLV_DOC_COPY_NUM_1(Double arg) { m_EdiDLV_DOC_COPY_NUM_1 = arg; }
	public void setEdiDLV_DOC_LANG_1(String arg) { m_EdiDLV_DOC_LANG_1 = arg; }
	public void setEdiDLV_DOC_FORM_2(String arg) { m_EdiDLV_DOC_FORM_2 = arg; }
	public void setEdiDLV_DOC_COPY_NUM_2(Double arg) { m_EdiDLV_DOC_COPY_NUM_2 = arg; }
	public void setEdiDLV_DOC_LANG_2(String arg) { m_EdiDLV_DOC_LANG_2 = arg; }
	public void setEdiDLV_DOC_FORM_3(String arg) { m_EdiDLV_DOC_FORM_3 = arg; }
	public void setEdiDLV_DOC_COPY_NUM_3(Double arg) { m_EdiDLV_DOC_COPY_NUM_3 = arg; }
	public void setEdiDLV_DOC_LANG_3(String arg) { m_EdiDLV_DOC_LANG_3 = arg; }
	public void setEdiDLV_DOC_FORM_4(String arg) { m_EdiDLV_DOC_FORM_4 = arg; }
	public void setEdiDLV_DOC_COPY_NUM_4(Double arg) { m_EdiDLV_DOC_COPY_NUM_4 = arg; }
	public void setEdiDLV_DOC_LANG_4(String arg) { m_EdiDLV_DOC_LANG_4 = arg; }
	public void setEdiSTRATEGIC_GOODS_TYP(String arg) { m_EdiSTRATEGIC_GOODS_TYP = arg; }
	public void setEdiORGN_PLACE_CD_1(String arg) { m_EdiORGN_PLACE_CD_1 = arg; }
	public void setEdiORGN_PLACE_CD_2(String arg) { m_EdiORGN_PLACE_CD_2 = arg; }
	public void setEdiORGN_PLACE_CD_3(String arg) { m_EdiORGN_PLACE_CD_3 = arg; }
	public void setEdiORGN_PLACE_CD_4(String arg) { m_EdiORGN_PLACE_CD_4 = arg; }
	public void setEdiORGN_PLACE_CD_5(String arg) { m_EdiORGN_PLACE_CD_5 = arg; }
	public void setEdiDLV_TIME_1(String arg) { m_EdiDLV_TIME_1 = arg; }
	public void setEdiDLV_TIME_2(String arg) { m_EdiDLV_TIME_2 = arg; }
	public void setEdiDLV_TIME_3(String arg) { m_EdiDLV_TIME_3 = arg; }
	public void setEdiDLV_TIME_4(String arg) { m_EdiDLV_TIME_4 = arg; }
	public void setEdiDLV_TIME_5(String arg) { m_EdiDLV_TIME_5 = arg; }
	public void setEdiDLV_TIME_6(String arg) { m_EdiDLV_TIME_6 = arg; }
	public void setEdiDLV_TIME_7(String arg) { m_EdiDLV_TIME_7 = arg; }
	public void setEdiDLV_TIME_8(String arg) { m_EdiDLV_TIME_8 = arg; }
	public void setEdiDLV_TIME_9(String arg) { m_EdiDLV_TIME_9 = arg; }
	public void setEdiDLV_TIME_10(String arg) { m_EdiDLV_TIME_10 = arg; }
	public void setEdiDLV_TIME_11(String arg) { m_EdiDLV_TIME_11 = arg; }
	public void setEdiDLV_TIME_12(String arg) { m_EdiDLV_TIME_12 = arg; }
	public void setEdiDLV_TIME_13(String arg) { m_EdiDLV_TIME_13 = arg; }
	public void setEdiDLV_TIME_14(String arg) { m_EdiDLV_TIME_14 = arg; }
	public void setEdiDLV_TIME_15(String arg) { m_EdiDLV_TIME_15 = arg; }
	public void setEdiDLV_TIME_16(String arg) { m_EdiDLV_TIME_16 = arg; }
	public void setEdiDLV_TIME_17(String arg) { m_EdiDLV_TIME_17 = arg; }
	public void setEdiDLV_TIME_18(String arg) { m_EdiDLV_TIME_18 = arg; }
	public void setEdiDLV_TIME_19(String arg) { m_EdiDLV_TIME_19 = arg; }
	public void setEdiDLV_TIME_20(String arg) { m_EdiDLV_TIME_20 = arg; }
	public void setEdiDLV_TIME_21(String arg) { m_EdiDLV_TIME_21 = arg; }
	public void setEdiDLV_TIME_22(String arg) { m_EdiDLV_TIME_22 = arg; }
	public void setEdiDLV_TIME_23(String arg) { m_EdiDLV_TIME_23 = arg; }
	public void setEdiDLV_TIME_24(String arg) { m_EdiDLV_TIME_24 = arg; }
	public void setEdiDLV_TIME_25(String arg) { m_EdiDLV_TIME_25 = arg; }
	public void setEdiDLV_TIME_26(String arg) { m_EdiDLV_TIME_26 = arg; }
	public void setEdiDLV_TIME_27(String arg) { m_EdiDLV_TIME_27 = arg; }
	public void setEdiDLV_TIME_28(String arg) { m_EdiDLV_TIME_28 = arg; }
	public void setEdiDLV_TIME_29(String arg) { m_EdiDLV_TIME_29 = arg; }
	public void setEdiDLV_TIME_30(String arg) { m_EdiDLV_TIME_30 = arg; }
	public void setEdiDLV_TIME_31(String arg) { m_EdiDLV_TIME_31 = arg; }
	public void setEdiPACKAGE_DLV_CD(String arg) { m_EdiPACKAGE_DLV_CD = arg; }
	public void setEdiSPEC(String arg) { m_EdiSPEC = arg; }
	public void setEdiBUYER_ORG_NAME(String arg) { m_EdiBUYER_ORG_NAME = arg; }
	public void setEdiDLV_PART_LEN_1(Double arg) { m_EdiDLV_PART_LEN_1 = arg; }
	public void setEdiDLV_PART_QTY_1(Double arg) { m_EdiDLV_PART_QTY_1 = arg; }
	public void setEdiDLV_PART_LEN_2(Double arg) { m_EdiDLV_PART_LEN_2 = arg; }
	public void setEdiDLV_PART_QTY_2(Double arg) { m_EdiDLV_PART_QTY_2 = arg; }
	public void setEdiDLV_PART_LEN_3(Double arg) { m_EdiDLV_PART_LEN_3 = arg; }
	public void setEdiDLV_PART_QTY_3(Double arg) { m_EdiDLV_PART_QTY_3 = arg; }
	public void setEdiDLV_PART_LEN_4(Double arg) { m_EdiDLV_PART_LEN_4 = arg; }
	public void setEdiDLV_PART_QTY_4(Double arg) { m_EdiDLV_PART_QTY_4 = arg; }
	public void setEdiDLV_PART_LEN_5(Double arg) { m_EdiDLV_PART_LEN_5 = arg; }
	public void setEdiDLV_PART_QTY_5(Double arg) { m_EdiDLV_PART_QTY_5 = arg; }
	public void setEdiDLV_PART_LEN_6(Double arg) { m_EdiDLV_PART_LEN_6 = arg; }
	public void setEdiDLV_PART_QTY_6(Double arg) { m_EdiDLV_PART_QTY_6 = arg; }
	public void setEdiDLV_PART_LEN_7(Double arg) { m_EdiDLV_PART_LEN_7 = arg; }
	public void setEdiDLV_PART_QTY_7(Double arg) { m_EdiDLV_PART_QTY_7 = arg; }
	public void setEdiDLV_PART_LEN_8(Double arg) { m_EdiDLV_PART_LEN_8 = arg; }
	public void setEdiDLV_PART_QTY_8(Double arg) { m_EdiDLV_PART_QTY_8 = arg; }
	public void setEdiDLV_PART_LEN_9(Double arg) { m_EdiDLV_PART_LEN_9 = arg; }
	public void setEdiDLV_PART_QTY_9(Double arg) { m_EdiDLV_PART_QTY_9 = arg; }
	public void setEdiDLV_PART_LEN_10(Double arg) { m_EdiDLV_PART_LEN_10 = arg; }
	public void setEdiDLV_PART_QTY_10(Double arg) { m_EdiDLV_PART_QTY_10 = arg; }
	public void setEdiDLV_PART_UNIT(String arg) { m_EdiDLV_PART_UNIT = arg; }
	public void setEdiCUST_CONSTRUCT_NAME(String arg) { m_EdiCUST_CONSTRUCT_NAME = arg; }
	public void setEdiMATERIAL_CD(String arg) { m_EdiMATERIAL_CD = arg; }
	public void setEdiMATERIAL_UNIT_PRICE(Double arg) { m_EdiMATERIAL_UNIT_PRICE = arg; }
	public void setEdiMATERIAL_UNIT(String arg) { m_EdiMATERIAL_UNIT = arg; }
	public void setEdiTEST_REPORT_NEED_TYP(String arg) { m_EdiTEST_REPORT_NEED_TYP = arg; }
	public void setEdiTEST_REPORT_CHK_TYP(String arg) { m_EdiTEST_REPORT_CHK_TYP = arg; }
	public void setEdiTEST_REPORT_PRESENT_TYP(String arg) { m_EdiTEST_REPORT_PRESENT_TYP = arg; }
	public void setEdiMUNICIPAL_CD(String arg) { m_EdiMUNICIPAL_CD = arg; }
	public void setEdiDLV_CONTACT_TEL(String arg) { m_EdiDLV_CONTACT_TEL = arg; }
	public void setEdiSLIP_PRICE_PRINT_TYP(String arg) { m_EdiSLIP_PRICE_PRINT_TYP = arg; }
	public void setEdiBUYER_NAME_KANJI(String arg) { m_EdiBUYER_NAME_KANJI = arg; }
	public void setEdiSPEC_KANJI(String arg) { m_EdiSPEC_KANJI = arg; }
	public void setEdiITEM_NAME_KANJI(String arg) { m_EdiITEM_NAME_KANJI = arg; }
	public void setEdiREMARKS_KANJI(String arg) { m_EdiREMARKS_KANJI = arg; }
	public void setEdiEND_USER_NAME_KANJI(String arg) { m_EdiEND_USER_NAME_KANJI = arg; }
	public void setEdiDLV_ADDRESS_KANJI(String arg) { m_EdiDLV_ADDRESS_KANJI = arg; }
	public void setEdiDLV_ADDRESSEE_KANJI(String arg) { m_EdiDLV_ADDRESSEE_KANJI = arg; }
	public void setEdiEND_USER_ITEM_NAME_KANJI(String arg) { m_EdiEND_USER_ITEM_NAME_KANJI = arg; }
	public void setEdiCUST_DESINATED_MAKER_KANJI(String arg) { m_EdiCUST_DESINATED_MAKER_KANJI = arg; }
	public void setEdiDLV_LOC_NAME_KANJI(String arg) { m_EdiDLV_LOC_NAME_KANJI = arg; }
	public void setEdiCLIENT_REMARK_KANJI(String arg) { m_EdiCLIENT_REMARK_KANJI = arg; }
	public void setEdiMACHINE_TYPE_NAME_KANJI(String arg) { m_EdiMACHINE_TYPE_NAME_KANJI = arg; }
	public void setEdiCUST_SPC_KANJI(String arg) { m_EdiCUST_SPC_KANJI = arg; }
	public void setEdiBUYER_ORG_NAME_KANJI(String arg) { m_EdiBUYER_ORG_NAME_KANJI = arg; }
	public void setEdiCUST_CONSTRUCT_NAME_KANJI(String arg) { m_EdiCUST_CONSTRUCT_NAME_KANJI = arg; }
	public void setEdiCUR_CD(String arg) { m_EdiCUR_CD = arg; }
	public void setEdiUNIT_PRICE_EXCH_RATES(Double arg) { m_EdiUNIT_PRICE_EXCH_RATES = arg; }
	public void setEdiODR_AMOUNT_EXCH_RATES(Double arg) { m_EdiODR_AMOUNT_EXCH_RATES = arg; }
	public void setEdiTAX_AMOUNT_EXCH_RATES(Double arg) { m_EdiTAX_AMOUNT_EXCH_RATES = arg; }
	public void setEdiTOTAL_AMOUNT_EXCH_RATES(Double arg) { m_EdiTOTAL_AMOUNT_EXCH_RATES = arg; }
	public void setEdiUNCONFIRM_AMOUNT_EXCH_RATES(Double arg) { m_EdiUNCONFIRM_AMOUNT_EXCH_RATES = arg; }
	public void setEdiMATERIAL_CD_EXCH_RATES(Double arg) { m_EdiMATERIAL_CD_EXCH_RATES = arg; }
	public void setEdiPLANNING_ODR_CD(String arg) { m_EdiPLANNING_ODR_CD = arg; }
	public void setEdiPLANNING_ODR_DATE(String arg) { m_EdiPLANNING_ODR_DATE = arg; }
	public void setEdiSTANDARD_DLV_TERM(Double arg) { m_EdiSTANDARD_DLV_TERM = arg; }
	public void setEdiREQUIRED_TERM(Double arg) { m_EdiREQUIRED_TERM = arg; }
	public void setEdiSYSTEM_PROC_TYP(String arg) { m_EdiSYSTEM_PROC_TYP = arg; }
	public void setODR_INFO_COM_IF_CTRL_NO(Double arg) { m_ODR_INFO_COM_IF_CTRL_NO = arg; }
	public void setODR_SEQ(Double arg) { m_ODR_SEQ = arg; }
	public void setODR_TYP(String arg) { m_ODR_TYP = arg; }
	public void setINFO_TYP_CD(String arg) { m_INFO_TYP_CD = arg; }
	public void setCUST_ODR_NO(String arg) { m_CUST_ODR_NO = arg; }
	public void setODR_ACPT_DATE(String arg) { m_ODR_ACPT_DATE = arg; }
	public void setCUST_CD(String arg) { m_CUST_CD = arg; }
	public void setCUST_ITEM_CD(String arg) { m_CUST_ITEM_CD = arg; }
	public void setPART_NAME(String arg) { m_PART_NAME = arg; }
	public void setPROC_TYP(String arg) { m_PROC_TYP = arg; }
	public void setCOCK_TYP(String arg) { m_COCK_TYP = arg; }
	public void setUNIT_CD(String arg) { m_UNIT_CD = arg; }
	public void setUNIT_COST(Double arg) { m_UNIT_COST = arg; }
	public void setUNIT_COST_TYP(String arg) { m_UNIT_COST_TYP = arg; }
	public void setDESINATED_DLV_DATE(String arg) { m_DESINATED_DLV_DATE = arg; }
	public void setPUCH_ODR_QTY(Double arg) { m_PUCH_ODR_QTY = arg; }
	public void setPKG_UNIT(String arg) { m_PKG_UNIT = arg; }
	public void setINSPC_TYP(String arg) { m_INSPC_TYP = arg; }
	public void setDLV_LOC_CD(String arg) { m_DLV_LOC_CD = arg; }
	public void setDLV_LOC_CD_EIAJ(String arg) { m_DLV_LOC_CD_EIAJ = arg; }
	public void setDLV_LOC_NAME_KANJI(String arg) { m_DLV_LOC_NAME_KANJI = arg; }
	public void setCUS_DLV_CD(String arg) { m_CUS_DLV_CD = arg; }
	public void setCUS_DLV_KEY_CD(String arg) { m_CUS_DLV_KEY_CD = arg; }
	public void setFREE_REMARK(String arg) { m_FREE_REMARK = arg; }
	public void setREMARK(String arg) { m_REMARK = arg; }
	public void setCLIENT_BARCODE_INF(String arg) { m_CLIENT_BARCODE_INF = arg; }
	public void setCLIENT_REMARK(String arg) { m_CLIENT_REMARK = arg; }
	public void setCLIENT_REMARK_KANJI(String arg) { m_CLIENT_REMARK_KANJI = arg; }
	public void setSLIP_PRICE_PRINT_TYP(String arg) { m_SLIP_PRICE_PRINT_TYP = arg; }
	public void setCUR_CD(String arg) { m_CUR_CD = arg; }
	public void setUNIT_CD_ORG(String arg) { m_UNIT_CD_ORG = arg; }
	public void setPUCH_ODR_QTY_TOTAL(Double arg) { m_PUCH_ODR_QTY_TOTAL = arg; }
	public void setBUYER_NAME(String arg) { m_BUYER_NAME = arg; }
	public void setODR_ACPT_PROC_ODR(Double arg) { m_ODR_ACPT_PROC_ODR = arg; }
	public void setBUYER_ORG_CD(String arg) { m_BUYER_ORG_CD = arg; }
	public void setbtBUSINESS_OPR_DATE(String arg) { m_btBUSINESS_OPR_DATE = arg; }
	public void setbtPLANT_CD(String arg) { m_btPLANT_CD = arg; }
	public void setstrJP_CUR(String arg) { m_strJP_CUR = arg; }
	public void setcustCUST_CD(String arg) { m_custCUST_CD = arg; }
	public void setcustCUR_CD(String arg) { m_custCUR_CD = arg; }
	public void setcustEDI_CUST_VEND_CD(String arg) { m_custEDI_CUST_VEND_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity0; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getT_ODR_INFO_EDI_IF() { return m_entity1; }
	public void setT_ODR_INFO_EDI_IF(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_ODR_INFO_COM_IF() { return m_entity2; }
	public void setT_ODR_INFO_COM_IF(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getBatchGyomuDate() { return m_entity3; }
	public void setBatchGyomuDate(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getJpCurrency() { return m_entity4; }
	public void setJpCurrency(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getSYS_CLASS_CODE() { return m_entity5; }
	public void setSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getM_CUST() { return m_entity6; }
	public void setM_CUST(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKV0020B002�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKV0020B002()
	{
		// mediator�ϐ������������܂�
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_EdiODR_INFO_IF_CTRL_NO = null;
		m_EdiDATA_PROC_CD = null;
		m_EdiINFO_TYP_CD = null;
		m_EdiDATA_CREATED_DATE = null;
		m_EdiCLIENT_CD = null;
		m_EdiTRUSTEE_CD = null;
		m_EdiBUYER_ORG_CD = null;
		m_EdiPUCH_ODR_CD = null;
		m_EdiPRDCT_ODR_CD = null;
		m_EdiMODIFICATION_CODE = null;
		m_EdiCOCK_TYP = null;
		m_EdiPUCH_ODR_DATE = null;
		m_EdiUNIT = null;
		m_EdiUNIT_PRICE = null;
		m_EdiPRICE_TYP = null;
		m_EdiPUCH_ODR_QTY = null;
		m_EdiPUCH_ODR_AMOUNT = null;
		m_EdiCONS_TYP = null;
		m_EdiBUYER_NAME = null;
		m_EdiMATR_SPEC_SIZE = null;
		m_EdiSPECTP = null;
		m_EdiDROWING_EDITION = null;
		m_EdiPART_NAME = null;
		m_EdiOWN_ITEM_CD = null;
		m_EdiCUST_ITEM_CD = null;
		m_EdiDROW_SPEC_QTY = null;
		m_EdiPKG_UNIT = null;
		m_EdiDIRECT_DLV_TYP = null;
		m_EdiDLV_LOC_CD = null;
		m_EdiINSPC_TYP = null;
		m_EdiDLV_INST_TYP = null;
		m_EdiSCDL_DLV_DATE_1 = null;
		m_EdiSCDL_DLV_QTY_1 = null;
		m_EdiDLV_CD_1 = null;
		m_EdiSCDL_DLV_DATE_2 = null;
		m_EdiSCDL_DLV_QTY_2 = null;
		m_EdiDLV_CD_2 = null;
		m_EdiSCDL_DLV_DATE_3 = null;
		m_EdiSCDL_DLV_QTY_3 = null;
		m_EdiDLV_CD_3 = null;
		m_EdiSCDL_DLV_DATE_4 = null;
		m_EdiSCDL_DLV_QTY_4 = null;
		m_EdiDLV_CD_4 = null;
		m_EdiSCDL_DLV_DATE_5 = null;
		m_EdiSCDL_DLV_QTY_5 = null;
		m_EdiDLV_CD_5 = null;
		m_EdiSCDL_DLV_DATE_6 = null;
		m_EdiSCDL_DLV_QTY_6 = null;
		m_EdiDLV_CD_6 = null;
		m_EdiSCDL_DLV_DATE_7 = null;
		m_EdiSCDL_DLV_QTY_7 = null;
		m_EdiDLV_CD_7 = null;
		m_EdiSCDL_DLV_DATE_8 = null;
		m_EdiSCDL_DLV_QTY_8 = null;
		m_EdiDLV_CD_8 = null;
		m_EdiSCDL_DLV_DATE_9 = null;
		m_EdiSCDL_DLV_QTY_9 = null;
		m_EdiDLV_CD_9 = null;
		m_EdiSCDL_DLV_DATE_10 = null;
		m_EdiSCDL_DLV_QTY_10 = null;
		m_EdiDLV_CD_10 = null;
		m_EdiSCDL_DLV_DATE_11 = null;
		m_EdiSCDL_DLV_QTY_11 = null;
		m_EdiDLV_CD_11 = null;
		m_EdiSCDL_DLV_DATE_12 = null;
		m_EdiSCDL_DLV_QTY_12 = null;
		m_EdiDLV_CD_12 = null;
		m_EdiSCDL_DLV_DATE_13 = null;
		m_EdiSCDL_DLV_QTY_13 = null;
		m_EdiDLV_CD_13 = null;
		m_EdiSCDL_DLV_DATE_14 = null;
		m_EdiSCDL_DLV_QTY_14 = null;
		m_EdiDLV_CD_14 = null;
		m_EdiSCDL_DLV_DATE_15 = null;
		m_EdiSCDL_DLV_QTY_15 = null;
		m_EdiDLV_CD_15 = null;
		m_EdiSCDL_DLV_DATE_16 = null;
		m_EdiSCDL_DLV_QTY_16 = null;
		m_EdiDLV_CD_16 = null;
		m_EdiSCDL_DLV_DATE_17 = null;
		m_EdiSCDL_DLV_QTY_17 = null;
		m_EdiDLV_CD_17 = null;
		m_EdiSCDL_DLV_DATE_18 = null;
		m_EdiSCDL_DLV_QTY_18 = null;
		m_EdiDLV_CD_18 = null;
		m_EdiSCDL_DLV_DATE_19 = null;
		m_EdiSCDL_DLV_QTY_19 = null;
		m_EdiDLV_CD_19 = null;
		m_EdiSCDL_DLV_DATE_20 = null;
		m_EdiSCDL_DLV_QTY_20 = null;
		m_EdiDLV_CD_20 = null;
		m_EdiSCDL_DLV_DATE_21 = null;
		m_EdiSCDL_DLV_QTY_21 = null;
		m_EdiDLV_CD_21 = null;
		m_EdiSCDL_DLV_DATE_22 = null;
		m_EdiSCDL_DLV_QTY_22 = null;
		m_EdiDLV_CD_22 = null;
		m_EdiSCDL_DLV_DATE_23 = null;
		m_EdiSCDL_DLV_QTY_23 = null;
		m_EdiDLV_CD_23 = null;
		m_EdiSCDL_DLV_DATE_24 = null;
		m_EdiSCDL_DLV_QTY_24 = null;
		m_EdiDLV_CD_24 = null;
		m_EdiSCDL_DLV_DATE_25 = null;
		m_EdiSCDL_DLV_QTY_25 = null;
		m_EdiDLV_CD_25 = null;
		m_EdiSCDL_DLV_DATE_26 = null;
		m_EdiSCDL_DLV_QTY_26 = null;
		m_EdiDLV_CD_26 = null;
		m_EdiSCDL_DLV_DATE_27 = null;
		m_EdiSCDL_DLV_QTY_27 = null;
		m_EdiDLV_CD_27 = null;
		m_EdiSCDL_DLV_DATE_28 = null;
		m_EdiSCDL_DLV_QTY_28 = null;
		m_EdiDLV_CD_28 = null;
		m_EdiSCDL_DLV_DATE_29 = null;
		m_EdiSCDL_DLV_QTY_29 = null;
		m_EdiDLV_CD_29 = null;
		m_EdiSCDL_DLV_DATE_30 = null;
		m_EdiSCDL_DLV_QTY_30 = null;
		m_EdiDLV_CD_30 = null;
		m_EdiSCDL_DLV_DATE_31 = null;
		m_EdiSCDL_DLV_QTY_31 = null;
		m_EdiDLV_CD_31 = null;
		m_EdiFREE_TEXT = null;
		m_EdiREMARKS = null;
		m_EdiTAX_TYP = null;
		m_EdiCUST_TAXATION_TYP = null;
		m_EdiTAX_AMOUNT = null;
		m_EdiCUST_TOTAL_AMOUNT = null;
		m_EdiUNCONFIRM_ODR_CD = null;
		m_EdiUNCONFIRM_ODR_DATE = null;
		m_EdiUNCONFIRM_ODR_QTY = null;
		m_EdiUNCONFIRM_ODR_AMOUNT = null;
		m_EdiESTIMATE_REQST_CD = null;
		m_EdiSTL_COND_CD = null;
		m_EdiEND_USER_NAME = null;
		m_EdiDLV_ZIP_CD = null;
		m_EdiDLV_ADDRESS = null;
		m_EdiDLV_ADDRESSEE = null;
		m_EdiCUST_COMM_SUBNAME = null;
		m_EdiCUST_COMM_SUBCD = null;
		m_EdiEND_USER_ODR_CD = null;
		m_EdiCUST_DESINATED_MAKER = null;
		m_EdiDLV_KEY_NO_1 = null;
		m_EdiDLV_KEY_NO_2 = null;
		m_EdiDLV_KEY_NO_3 = null;
		m_EdiDLV_KEY_NO_4 = null;
		m_EdiDLV_KEY_NO_5 = null;
		m_EdiDLV_KEY_NO_6 = null;
		m_EdiDLV_KEY_NO_7 = null;
		m_EdiDLV_KEY_NO_8 = null;
		m_EdiDLV_KEY_NO_9 = null;
		m_EdiDLV_KEY_NO_10 = null;
		m_EdiDLV_KEY_NO_11 = null;
		m_EdiDLV_KEY_NO_12 = null;
		m_EdiDLV_KEY_NO_13 = null;
		m_EdiDLV_KEY_NO_14 = null;
		m_EdiDLV_KEY_NO_15 = null;
		m_EdiDLV_KEY_NO_16 = null;
		m_EdiDLV_KEY_NO_17 = null;
		m_EdiDLV_KEY_NO_18 = null;
		m_EdiDLV_KEY_NO_19 = null;
		m_EdiDLV_KEY_NO_20 = null;
		m_EdiDLV_KEY_NO_21 = null;
		m_EdiDLV_KEY_NO_22 = null;
		m_EdiDLV_KEY_NO_23 = null;
		m_EdiDLV_KEY_NO_24 = null;
		m_EdiDLV_KEY_NO_25 = null;
		m_EdiDLV_KEY_NO_26 = null;
		m_EdiDLV_KEY_NO_27 = null;
		m_EdiDLV_KEY_NO_28 = null;
		m_EdiDLV_KEY_NO_29 = null;
		m_EdiDLV_KEY_NO_30 = null;
		m_EdiDLV_KEY_NO_31 = null;
		m_EdiDLV_LOC_NAME = null;
		m_EdiCLIENT_BARCODE_INF = null;
		m_EdiCLIENT_REMARK = null;
		m_EdiCONTRACT_COND_TYP = null;
		m_EdiPUCH_ODR_SHAP_TYP = null;
		m_EdiMASTER_PUCH_ODR_CD = null;
		m_EdiQTY_CONTRACT_TYP = null;
		m_EdiODR_MODIFICATION_TYP_1 = null;
		m_EdiODR_MODIFICATION_TYP_2 = null;
		m_EdiODR_MODIFICATION_TYP_3 = null;
		m_EdiMACHINE_TYP_CD = null;
		m_EdiENGINNERING_CHG_CD = null;
		m_EdiDROW_SPEC_CD = null;
		m_EdiDLV_DOC_FORM_1 = null;
		m_EdiDLV_DOC_COPY_NUM_1 = null;
		m_EdiDLV_DOC_LANG_1 = null;
		m_EdiDLV_DOC_FORM_2 = null;
		m_EdiDLV_DOC_COPY_NUM_2 = null;
		m_EdiDLV_DOC_LANG_2 = null;
		m_EdiDLV_DOC_FORM_3 = null;
		m_EdiDLV_DOC_COPY_NUM_3 = null;
		m_EdiDLV_DOC_LANG_3 = null;
		m_EdiDLV_DOC_FORM_4 = null;
		m_EdiDLV_DOC_COPY_NUM_4 = null;
		m_EdiDLV_DOC_LANG_4 = null;
		m_EdiSTRATEGIC_GOODS_TYP = null;
		m_EdiORGN_PLACE_CD_1 = null;
		m_EdiORGN_PLACE_CD_2 = null;
		m_EdiORGN_PLACE_CD_3 = null;
		m_EdiORGN_PLACE_CD_4 = null;
		m_EdiORGN_PLACE_CD_5 = null;
		m_EdiDLV_TIME_1 = null;
		m_EdiDLV_TIME_2 = null;
		m_EdiDLV_TIME_3 = null;
		m_EdiDLV_TIME_4 = null;
		m_EdiDLV_TIME_5 = null;
		m_EdiDLV_TIME_6 = null;
		m_EdiDLV_TIME_7 = null;
		m_EdiDLV_TIME_8 = null;
		m_EdiDLV_TIME_9 = null;
		m_EdiDLV_TIME_10 = null;
		m_EdiDLV_TIME_11 = null;
		m_EdiDLV_TIME_12 = null;
		m_EdiDLV_TIME_13 = null;
		m_EdiDLV_TIME_14 = null;
		m_EdiDLV_TIME_15 = null;
		m_EdiDLV_TIME_16 = null;
		m_EdiDLV_TIME_17 = null;
		m_EdiDLV_TIME_18 = null;
		m_EdiDLV_TIME_19 = null;
		m_EdiDLV_TIME_20 = null;
		m_EdiDLV_TIME_21 = null;
		m_EdiDLV_TIME_22 = null;
		m_EdiDLV_TIME_23 = null;
		m_EdiDLV_TIME_24 = null;
		m_EdiDLV_TIME_25 = null;
		m_EdiDLV_TIME_26 = null;
		m_EdiDLV_TIME_27 = null;
		m_EdiDLV_TIME_28 = null;
		m_EdiDLV_TIME_29 = null;
		m_EdiDLV_TIME_30 = null;
		m_EdiDLV_TIME_31 = null;
		m_EdiPACKAGE_DLV_CD = null;
		m_EdiSPEC = null;
		m_EdiBUYER_ORG_NAME = null;
		m_EdiDLV_PART_LEN_1 = null;
		m_EdiDLV_PART_QTY_1 = null;
		m_EdiDLV_PART_LEN_2 = null;
		m_EdiDLV_PART_QTY_2 = null;
		m_EdiDLV_PART_LEN_3 = null;
		m_EdiDLV_PART_QTY_3 = null;
		m_EdiDLV_PART_LEN_4 = null;
		m_EdiDLV_PART_QTY_4 = null;
		m_EdiDLV_PART_LEN_5 = null;
		m_EdiDLV_PART_QTY_5 = null;
		m_EdiDLV_PART_LEN_6 = null;
		m_EdiDLV_PART_QTY_6 = null;
		m_EdiDLV_PART_LEN_7 = null;
		m_EdiDLV_PART_QTY_7 = null;
		m_EdiDLV_PART_LEN_8 = null;
		m_EdiDLV_PART_QTY_8 = null;
		m_EdiDLV_PART_LEN_9 = null;
		m_EdiDLV_PART_QTY_9 = null;
		m_EdiDLV_PART_LEN_10 = null;
		m_EdiDLV_PART_QTY_10 = null;
		m_EdiDLV_PART_UNIT = null;
		m_EdiCUST_CONSTRUCT_NAME = null;
		m_EdiMATERIAL_CD = null;
		m_EdiMATERIAL_UNIT_PRICE = null;
		m_EdiMATERIAL_UNIT = null;
		m_EdiTEST_REPORT_NEED_TYP = null;
		m_EdiTEST_REPORT_CHK_TYP = null;
		m_EdiTEST_REPORT_PRESENT_TYP = null;
		m_EdiMUNICIPAL_CD = null;
		m_EdiDLV_CONTACT_TEL = null;
		m_EdiSLIP_PRICE_PRINT_TYP = null;
		m_EdiBUYER_NAME_KANJI = null;
		m_EdiSPEC_KANJI = null;
		m_EdiITEM_NAME_KANJI = null;
		m_EdiREMARKS_KANJI = null;
		m_EdiEND_USER_NAME_KANJI = null;
		m_EdiDLV_ADDRESS_KANJI = null;
		m_EdiDLV_ADDRESSEE_KANJI = null;
		m_EdiEND_USER_ITEM_NAME_KANJI = null;
		m_EdiCUST_DESINATED_MAKER_KANJI = null;
		m_EdiDLV_LOC_NAME_KANJI = null;
		m_EdiCLIENT_REMARK_KANJI = null;
		m_EdiMACHINE_TYPE_NAME_KANJI = null;
		m_EdiCUST_SPC_KANJI = null;
		m_EdiBUYER_ORG_NAME_KANJI = null;
		m_EdiCUST_CONSTRUCT_NAME_KANJI = null;
		m_EdiCUR_CD = null;
		m_EdiUNIT_PRICE_EXCH_RATES = null;
		m_EdiODR_AMOUNT_EXCH_RATES = null;
		m_EdiTAX_AMOUNT_EXCH_RATES = null;
		m_EdiTOTAL_AMOUNT_EXCH_RATES = null;
		m_EdiUNCONFIRM_AMOUNT_EXCH_RATES = null;
		m_EdiMATERIAL_CD_EXCH_RATES = null;
		m_EdiPLANNING_ODR_CD = null;
		m_EdiPLANNING_ODR_DATE = null;
		m_EdiSTANDARD_DLV_TERM = null;
		m_EdiREQUIRED_TERM = null;
		m_EdiSYSTEM_PROC_TYP = null;
		m_ODR_INFO_COM_IF_CTRL_NO = null;
		m_ODR_SEQ = null;
		m_ODR_TYP = null;
		m_INFO_TYP_CD = null;
		m_CUST_ODR_NO = null;
		m_ODR_ACPT_DATE = null;
		m_CUST_CD = null;
		m_CUST_ITEM_CD = null;
		m_PART_NAME = null;
		m_PROC_TYP = null;
		m_COCK_TYP = null;
		m_UNIT_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_DESINATED_DLV_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_PKG_UNIT = null;
		m_INSPC_TYP = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_CD_EIAJ = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_CUS_DLV_CD = null;
		m_CUS_DLV_KEY_CD = null;
		m_FREE_REMARK = null;
		m_REMARK = null;
		m_CLIENT_BARCODE_INF = null;
		m_CLIENT_REMARK = null;
		m_CLIENT_REMARK_KANJI = null;
		m_SLIP_PRICE_PRINT_TYP = null;
		m_CUR_CD = null;
		m_UNIT_CD_ORG = null;
		m_PUCH_ODR_QTY_TOTAL = null;
		m_BUYER_NAME = null;
		m_ODR_ACPT_PROC_ODR = null;
		m_BUYER_ORG_CD = null;
		m_btBUSINESS_OPR_DATE = null;
		m_btPLANT_CD = null;
		m_strJP_CUR = null;
		m_custCUST_CD = null;
		m_custCUR_CD = null;
		m_custEDI_CUST_VEND_CD = null;

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
