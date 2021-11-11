/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/src/com/nec/jp/orteus/metamorBase/DD0010/DD0010020Struct.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN�Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 * EXPJ    (2004/04/01),setStruct���\�b�h�̌ʃ����o�̂ݔ�setStructM�ƁA���X�g�����o�̂ݔ�setStructL��ǉ��B
 *                      initialize�ł̃f�[�^�Z�b�g�́Aclear���Ă�ł���s���悤�ɏC���B
 * EXPJ    (2004/03/31),�����l�̃R�����g�A�E�g�̃o�O���C���B
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f�B
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ����i�\�[�X�w�b�_�E�N���X�w�b�_�ύX�j
 *                      �����������ɏ����l��null�ō쐬�B
 *                      ���������\�b�hinitialize�A�f�[�^�Z�b�g���\�b�hsetStruct�ǉ��B
 *                      �R���X�g���N�^�̃��[�U�L�q����initialize���\�b�h�ďo�ǉ��B
 *                      initialize()���\�b�h�AsetStruct()���\�b�h�ǉ��B
 * 4.1.0.0 (2003/07/16),setL2L_xxx���\�b�h�ǉ�
 * 4.0.0.1 (2003/06/05),javadoc�R�����g�G���[�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.0.0 (2003/03/19),Time,Timestamp�^�Ή�
 * 2.1.0.0 (2002/12/17),Logging package�C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.DD0010;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DD0010020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** �� 2 �ϐ��F m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** �� 3 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 4 �ϐ��F m_HALF_TERM_TYP_DN */
	public String m_HALF_TERM_TYP_DN = null;
	/** �� 5 �ϐ��F m_COST_TYP_DN */
	public String m_COST_TYP_DN = null;
	/** �� 6 �ϐ��F m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** �� 7 �ϐ��F m_PROC_OUTSIDE_TYP_DN */
	public String m_PROC_OUTSIDE_TYP_DN = null;
	/** �� 8 �ϐ��F m_TOTAL_MATR_COST */
	public String m_TOTAL_MATR_COST = null;
	/** �� 9 �ϐ��F m_TOTAL_SBCNT_MATR_COST */
	public String m_TOTAL_SBCNT_MATR_COST = null;
	/** �� 10 �ϐ��F m_TOTAL_PROC_COST_SUM_ALL */
	public String m_TOTAL_PROC_COST_SUM_ALL = null;
	/** �� 11 �ϐ��F m_TOTAL_COST */
	public String m_TOTAL_COST = null;
	/** �� 12 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 13 �ϐ��F m_YEAR */
	public String m_YEAR = null;
	/** �� 14 �ϐ��F m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** �� 15 �ϐ��F m_ROOT_ITEM_CD */
	public String m_ROOT_ITEM_CD = null;
	/** �� 16 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 17 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 18 �ϐ��F m_l_PARENT_ITEM_CD */
	public String m_l_PARENT_ITEM_CD = null;
	/** �� 19 �ϐ��F m_l_OUTSIDE_TYP_DN */
	public String m_l_OUTSIDE_TYP_DN = null;
	/** �� 20 �ϐ��F m_l_PROC_OUTSIDE_TYP_DN */
	public String m_l_PROC_OUTSIDE_TYP_DN = null;
	/** �� 21 �ϐ��F m_l_CLASIFICATION_CD */
	public String m_l_CLASIFICATION_CD = null;
	/** �� 22 �ϐ��F m_l_CS_PROC_CD */
	public String m_l_CS_PROC_CD = null;
	/** �� 23 �ϐ��F m_l_CS_PROC_NAME */
	public String m_l_CS_PROC_NAME = null;
	/** �� 24 �ϐ��F m_l_NECESSARY_QTY */
	public String m_l_NECESSARY_QTY = null;
	/** �� 25 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 26 �ϐ��F m_l_HOME_CUR_UNIT */
	public String m_l_HOME_CUR_UNIT = null;
	/** �� 27 �ϐ��F m_l_OWN_MATR_COST */
	public String m_l_OWN_MATR_COST = null;
	/** �� 28 �ϐ��F m_l_TOTAL_MATR_COST */
	public String m_l_TOTAL_MATR_COST = null;
	/** �� 29 �ϐ��F m_l_OWN_SBCNT_MATR_COST */
	public String m_l_OWN_SBCNT_MATR_COST = null;
	/** �� 30 �ϐ��F m_l_TOTAL_SBCNT_MATR_COST */
	public String m_l_TOTAL_SBCNT_MATR_COST = null;
	/** �� 31 �ϐ��F m_l_OWN_PROC_COST_SUM_ALL */
	public String m_l_OWN_PROC_COST_SUM_ALL = null;
	/** �� 32 �ϐ��F m_l_TOTAL_PROC_COST_SUM_ALL */
	public String m_l_TOTAL_PROC_COST_SUM_ALL = null;
	/** �� 33 �ϐ��F m_COST_TYP */
	public String m_COST_TYP = null;
	/** �� 34 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 35 �ϐ��F m_ROOT_ITEM_NAME */
	public String m_ROOT_ITEM_NAME = null;
	/** �� 36 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 37 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** �� 38 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 39 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 40 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 41 �ϐ��F m_COST_STATEMENT_NO */
	public String m_COST_STATEMENT_NO = null;
	/** �� 42 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 43 �ϐ��F m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** �� 44 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 45 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 46 �ϐ��F m_ORG_CD */
	public String m_ORG_CD = null;
	/** �� 47 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 48 �ϐ��F m_NECESSARY_QTY */
	public String m_NECESSARY_QTY = null;
	/** �� 49 �ϐ��F m_PS_INPUT_RATIO */
	public String m_PS_INPUT_RATIO = null;
	/** �� 50 �ϐ��F m_ITEM_INPUT_RATIO */
	public String m_ITEM_INPUT_RATIO = null;
	/** �� 51 �ϐ��F m_OWN_MATR_COST */
	public String m_OWN_MATR_COST = null;
	/** �� 52 �ϐ��F m_OWN_SBCNT_MATR_COST */
	public String m_OWN_SBCNT_MATR_COST = null;
	/** �� 53 �ϐ��F m_OWN_PROC_COST_SUM_ALL */
	public String m_OWN_PROC_COST_SUM_ALL = null;
	/** �� 54 �ϐ��F m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** �� 55 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 56 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 57 �ϐ��F m_PARENT_COST_STATEMENT_NO */
	public String m_PARENT_COST_STATEMENT_NO = null;
	/** �� 58 �ϐ��F m_PARENT_ITEM_STOCK_UNIT */
	public String m_PARENT_ITEM_STOCK_UNIT = null;
	/** �� 59 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 60 �ϐ��F m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** �� 61 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 62 �ϐ��F m_PROC_OUTSIDE_TYP */
	public String m_PROC_OUTSIDE_TYP = null;
	/** �� 63 �ϐ��F m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** �� 64 �ϐ��F m_PROC_COST_CLS_NAME */
	public String m_PROC_COST_CLS_NAME = null;
	/** �� 65 �ϐ��F m_PROC_COST_UNIT_QTY */
	public String m_PROC_COST_UNIT_QTY = null;
	/** �� 66 �ϐ��F m_PROC_COST_UNIT_QTY_UNIT */
	public String m_PROC_COST_UNIT_QTY_UNIT = null;
	/** �� 67 �ϐ��F m_OWN_PROC_COST_01 */
	public String m_OWN_PROC_COST_01 = null;
	/** �� 68 �ϐ��F m_OWN_PROC_COST_02 */
	public String m_OWN_PROC_COST_02 = null;
	/** �� 69 �ϐ��F m_OWN_PROC_COST_03 */
	public String m_OWN_PROC_COST_03 = null;
	/** �� 70 �ϐ��F m_OWN_PROC_COST_04 */
	public String m_OWN_PROC_COST_04 = null;
	/** �� 71 �ϐ��F m_OWN_PROC_COST_05 */
	public String m_OWN_PROC_COST_05 = null;
	/** �� 72 �ϐ��F m_OWN_PROC_COST_06 */
	public String m_OWN_PROC_COST_06 = null;
	/** �� 73 �ϐ��F m_OWN_PROC_COST_07 */
	public String m_OWN_PROC_COST_07 = null;
	/** �� 74 �ϐ��F m_OWN_PROC_COST_08 */
	public String m_OWN_PROC_COST_08 = null;
	/** �� 75 �ϐ��F m_OWN_PROC_COST_09 */
	public String m_OWN_PROC_COST_09 = null;
	/** �� 76 �ϐ��F m_OWN_PROC_COST_10 */
	public String m_OWN_PROC_COST_10 = null;
	/** �� 77 �ϐ��F m_OWN_PROC_COST_11 */
	public String m_OWN_PROC_COST_11 = null;
	/** �� 78 �ϐ��F m_OWN_PROC_COST_12 */
	public String m_OWN_PROC_COST_12 = null;
	/** �� 79 �ϐ��F m_OWN_PROC_COST_SUM */
	public String m_OWN_PROC_COST_SUM = null;
	/** �� 80 �ϐ��F m_TOTAL_PROC_COST_01 */
	public String m_TOTAL_PROC_COST_01 = null;
	/** �� 81 �ϐ��F m_TOTAL_PROC_COST_02 */
	public String m_TOTAL_PROC_COST_02 = null;
	/** �� 82 �ϐ��F m_TOTAL_PROC_COST_03 */
	public String m_TOTAL_PROC_COST_03 = null;
	/** �� 83 �ϐ��F m_TOTAL_PROC_COST_04 */
	public String m_TOTAL_PROC_COST_04 = null;
	/** �� 84 �ϐ��F m_TOTAL_PROC_COST_05 */
	public String m_TOTAL_PROC_COST_05 = null;
	/** �� 85 �ϐ��F m_TOTAL_PROC_COST_06 */
	public String m_TOTAL_PROC_COST_06 = null;
	/** �� 86 �ϐ��F m_TOTAL_PROC_COST_07 */
	public String m_TOTAL_PROC_COST_07 = null;
	/** �� 87 �ϐ��F m_TOTAL_PROC_COST_08 */
	public String m_TOTAL_PROC_COST_08 = null;
	/** �� 88 �ϐ��F m_TOTAL_PROC_COST_09 */
	public String m_TOTAL_PROC_COST_09 = null;
	/** �� 89 �ϐ��F m_TOTAL_PROC_COST_10 */
	public String m_TOTAL_PROC_COST_10 = null;
	/** �� 90 �ϐ��F m_TOTAL_PROC_COST_11 */
	public String m_TOTAL_PROC_COST_11 = null;
	/** �� 91 �ϐ��F m_TOTAL_PROC_COST_12 */
	public String m_TOTAL_PROC_COST_12 = null;
	/** �� 92 �ϐ��F m_TOTAL_PROC_COST_SUM */
	public String m_TOTAL_PROC_COST_SUM = null;
	/** �� 93 �ϐ��F m_PROC_COST_01_NAME */
	public String m_PROC_COST_01_NAME = null;
	/** �� 94 �ϐ��F m_PROC_COST_02_NAME */
	public String m_PROC_COST_02_NAME = null;
	/** �� 95 �ϐ��F m_PROC_COST_03_NAME */
	public String m_PROC_COST_03_NAME = null;
	/** �� 96 �ϐ��F m_PROC_COST_04_NAME */
	public String m_PROC_COST_04_NAME = null;
	/** �� 97 �ϐ��F m_PROC_COST_05_NAME */
	public String m_PROC_COST_05_NAME = null;
	/** �� 98 �ϐ��F m_PROC_COST_06_NAME */
	public String m_PROC_COST_06_NAME = null;
	/** �� 99 �ϐ��F m_PROC_COST_07_NAME */
	public String m_PROC_COST_07_NAME = null;
	/** �� 100 �ϐ��F m_PROC_COST_08_NAME */
	public String m_PROC_COST_08_NAME = null;
	/** �� 101 �ϐ��F m_PROC_COST_09_NAME */
	public String m_PROC_COST_09_NAME = null;
	/** �� 102 �ϐ��F m_PROC_COST_10_NAME */
	public String m_PROC_COST_10_NAME = null;
	/** �� 103 �ϐ��F m_PROC_COST_11_NAME */
	public String m_PROC_COST_11_NAME = null;
	/** �� 104 �ϐ��F m_PROC_COST_12_NAME */
	public String m_PROC_COST_12_NAME = null;
	/** �� 105 �ϐ��F m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** �� 2 List�ϐ��F l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** �� 3 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 4 List�ϐ��F l_HALF_TERM_TYP_DN */
	public List l_HALF_TERM_TYP_DN = null;

	/** �� 5 List�ϐ��F l_COST_TYP_DN */
	public List l_COST_TYP_DN = null;

	/** �� 6 List�ϐ��F l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** �� 7 List�ϐ��F l_PROC_OUTSIDE_TYP_DN */
	public List l_PROC_OUTSIDE_TYP_DN = null;

	/** �� 8 List�ϐ��F l_TOTAL_MATR_COST */
	public List l_TOTAL_MATR_COST = null;

	/** �� 9 List�ϐ��F l_TOTAL_SBCNT_MATR_COST */
	public List l_TOTAL_SBCNT_MATR_COST = null;

	/** �� 10 List�ϐ��F l_TOTAL_PROC_COST_SUM_ALL */
	public List l_TOTAL_PROC_COST_SUM_ALL = null;

	/** �� 11 List�ϐ��F l_TOTAL_COST */
	public List l_TOTAL_COST = null;

	/** �� 12 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 13 List�ϐ��F l_YEAR */
	public List l_YEAR = null;

	/** �� 14 List�ϐ��F l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** �� 15 List�ϐ��F l_ROOT_ITEM_CD */
	public List l_ROOT_ITEM_CD = null;

	/** �� 16 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 17 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 18 List�ϐ��F l_l_PARENT_ITEM_CD */
	public List l_l_PARENT_ITEM_CD = null;

	/** �� 19 List�ϐ��F l_l_OUTSIDE_TYP_DN */
	public List l_l_OUTSIDE_TYP_DN = null;

	/** �� 20 List�ϐ��F l_l_PROC_OUTSIDE_TYP_DN */
	public List l_l_PROC_OUTSIDE_TYP_DN = null;

	/** �� 21 List�ϐ��F l_l_CLASIFICATION_CD */
	public List l_l_CLASIFICATION_CD = null;

	/** �� 22 List�ϐ��F l_l_CS_PROC_CD */
	public List l_l_CS_PROC_CD = null;

	/** �� 23 List�ϐ��F l_l_CS_PROC_NAME */
	public List l_l_CS_PROC_NAME = null;

	/** �� 24 List�ϐ��F l_l_NECESSARY_QTY */
	public List l_l_NECESSARY_QTY = null;

	/** �� 25 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 26 List�ϐ��F l_l_HOME_CUR_UNIT */
	public List l_l_HOME_CUR_UNIT = null;

	/** �� 27 List�ϐ��F l_l_OWN_MATR_COST */
	public List l_l_OWN_MATR_COST = null;

	/** �� 28 List�ϐ��F l_l_TOTAL_MATR_COST */
	public List l_l_TOTAL_MATR_COST = null;

	/** �� 29 List�ϐ��F l_l_OWN_SBCNT_MATR_COST */
	public List l_l_OWN_SBCNT_MATR_COST = null;

	/** �� 30 List�ϐ��F l_l_TOTAL_SBCNT_MATR_COST */
	public List l_l_TOTAL_SBCNT_MATR_COST = null;

	/** �� 31 List�ϐ��F l_l_OWN_PROC_COST_SUM_ALL */
	public List l_l_OWN_PROC_COST_SUM_ALL = null;

	/** �� 32 List�ϐ��F l_l_TOTAL_PROC_COST_SUM_ALL */
	public List l_l_TOTAL_PROC_COST_SUM_ALL = null;

	/** �� 33 List�ϐ��F l_COST_TYP */
	public List l_COST_TYP = null;

	/** �� 34 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 35 List�ϐ��F l_ROOT_ITEM_NAME */
	public List l_ROOT_ITEM_NAME = null;

	/** �� 36 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 37 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** �� 38 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 39 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 40 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 41 List�ϐ��F l_COST_STATEMENT_NO */
	public List l_COST_STATEMENT_NO = null;

	/** �� 42 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 43 List�ϐ��F l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** �� 44 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 45 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 46 List�ϐ��F l_ORG_CD */
	public List l_ORG_CD = null;

	/** �� 47 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 48 List�ϐ��F l_NECESSARY_QTY */
	public List l_NECESSARY_QTY = null;

	/** �� 49 List�ϐ��F l_PS_INPUT_RATIO */
	public List l_PS_INPUT_RATIO = null;

	/** �� 50 List�ϐ��F l_ITEM_INPUT_RATIO */
	public List l_ITEM_INPUT_RATIO = null;

	/** �� 51 List�ϐ��F l_OWN_MATR_COST */
	public List l_OWN_MATR_COST = null;

	/** �� 52 List�ϐ��F l_OWN_SBCNT_MATR_COST */
	public List l_OWN_SBCNT_MATR_COST = null;

	/** �� 53 List�ϐ��F l_OWN_PROC_COST_SUM_ALL */
	public List l_OWN_PROC_COST_SUM_ALL = null;

	/** �� 54 List�ϐ��F l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** �� 55 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 56 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 57 List�ϐ��F l_PARENT_COST_STATEMENT_NO */
	public List l_PARENT_COST_STATEMENT_NO = null;

	/** �� 58 List�ϐ��F l_PARENT_ITEM_STOCK_UNIT */
	public List l_PARENT_ITEM_STOCK_UNIT = null;

	/** �� 59 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 60 List�ϐ��F l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** �� 61 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 62 List�ϐ��F l_PROC_OUTSIDE_TYP */
	public List l_PROC_OUTSIDE_TYP = null;

	/** �� 63 List�ϐ��F l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** �� 64 List�ϐ��F l_PROC_COST_CLS_NAME */
	public List l_PROC_COST_CLS_NAME = null;

	/** �� 65 List�ϐ��F l_PROC_COST_UNIT_QTY */
	public List l_PROC_COST_UNIT_QTY = null;

	/** �� 66 List�ϐ��F l_PROC_COST_UNIT_QTY_UNIT */
	public List l_PROC_COST_UNIT_QTY_UNIT = null;

	/** �� 67 List�ϐ��F l_OWN_PROC_COST_01 */
	public List l_OWN_PROC_COST_01 = null;

	/** �� 68 List�ϐ��F l_OWN_PROC_COST_02 */
	public List l_OWN_PROC_COST_02 = null;

	/** �� 69 List�ϐ��F l_OWN_PROC_COST_03 */
	public List l_OWN_PROC_COST_03 = null;

	/** �� 70 List�ϐ��F l_OWN_PROC_COST_04 */
	public List l_OWN_PROC_COST_04 = null;

	/** �� 71 List�ϐ��F l_OWN_PROC_COST_05 */
	public List l_OWN_PROC_COST_05 = null;

	/** �� 72 List�ϐ��F l_OWN_PROC_COST_06 */
	public List l_OWN_PROC_COST_06 = null;

	/** �� 73 List�ϐ��F l_OWN_PROC_COST_07 */
	public List l_OWN_PROC_COST_07 = null;

	/** �� 74 List�ϐ��F l_OWN_PROC_COST_08 */
	public List l_OWN_PROC_COST_08 = null;

	/** �� 75 List�ϐ��F l_OWN_PROC_COST_09 */
	public List l_OWN_PROC_COST_09 = null;

	/** �� 76 List�ϐ��F l_OWN_PROC_COST_10 */
	public List l_OWN_PROC_COST_10 = null;

	/** �� 77 List�ϐ��F l_OWN_PROC_COST_11 */
	public List l_OWN_PROC_COST_11 = null;

	/** �� 78 List�ϐ��F l_OWN_PROC_COST_12 */
	public List l_OWN_PROC_COST_12 = null;

	/** �� 79 List�ϐ��F l_OWN_PROC_COST_SUM */
	public List l_OWN_PROC_COST_SUM = null;

	/** �� 80 List�ϐ��F l_TOTAL_PROC_COST_01 */
	public List l_TOTAL_PROC_COST_01 = null;

	/** �� 81 List�ϐ��F l_TOTAL_PROC_COST_02 */
	public List l_TOTAL_PROC_COST_02 = null;

	/** �� 82 List�ϐ��F l_TOTAL_PROC_COST_03 */
	public List l_TOTAL_PROC_COST_03 = null;

	/** �� 83 List�ϐ��F l_TOTAL_PROC_COST_04 */
	public List l_TOTAL_PROC_COST_04 = null;

	/** �� 84 List�ϐ��F l_TOTAL_PROC_COST_05 */
	public List l_TOTAL_PROC_COST_05 = null;

	/** �� 85 List�ϐ��F l_TOTAL_PROC_COST_06 */
	public List l_TOTAL_PROC_COST_06 = null;

	/** �� 86 List�ϐ��F l_TOTAL_PROC_COST_07 */
	public List l_TOTAL_PROC_COST_07 = null;

	/** �� 87 List�ϐ��F l_TOTAL_PROC_COST_08 */
	public List l_TOTAL_PROC_COST_08 = null;

	/** �� 88 List�ϐ��F l_TOTAL_PROC_COST_09 */
	public List l_TOTAL_PROC_COST_09 = null;

	/** �� 89 List�ϐ��F l_TOTAL_PROC_COST_10 */
	public List l_TOTAL_PROC_COST_10 = null;

	/** �� 90 List�ϐ��F l_TOTAL_PROC_COST_11 */
	public List l_TOTAL_PROC_COST_11 = null;

	/** �� 91 List�ϐ��F l_TOTAL_PROC_COST_12 */
	public List l_TOTAL_PROC_COST_12 = null;

	/** �� 92 List�ϐ��F l_TOTAL_PROC_COST_SUM */
	public List l_TOTAL_PROC_COST_SUM = null;

	/** �� 93 List�ϐ��F l_PROC_COST_01_NAME */
	public List l_PROC_COST_01_NAME = null;

	/** �� 94 List�ϐ��F l_PROC_COST_02_NAME */
	public List l_PROC_COST_02_NAME = null;

	/** �� 95 List�ϐ��F l_PROC_COST_03_NAME */
	public List l_PROC_COST_03_NAME = null;

	/** �� 96 List�ϐ��F l_PROC_COST_04_NAME */
	public List l_PROC_COST_04_NAME = null;

	/** �� 97 List�ϐ��F l_PROC_COST_05_NAME */
	public List l_PROC_COST_05_NAME = null;

	/** �� 98 List�ϐ��F l_PROC_COST_06_NAME */
	public List l_PROC_COST_06_NAME = null;

	/** �� 99 List�ϐ��F l_PROC_COST_07_NAME */
	public List l_PROC_COST_07_NAME = null;

	/** �� 100 List�ϐ��F l_PROC_COST_08_NAME */
	public List l_PROC_COST_08_NAME = null;

	/** �� 101 List�ϐ��F l_PROC_COST_09_NAME */
	public List l_PROC_COST_09_NAME = null;

	/** �� 102 List�ϐ��F l_PROC_COST_10_NAME */
	public List l_PROC_COST_10_NAME = null;

	/** �� 103 List�ϐ��F l_PROC_COST_11_NAME */
	public List l_PROC_COST_11_NAME = null;

	/** �� 104 List�ϐ��F l_PROC_COST_12_NAME */
	public List l_PROC_COST_12_NAME = null;

	/** �� 105 List�ϐ��F l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getHALF_TERM_TYP_DN() { return m_HALF_TERM_TYP_DN; }
	public String getCOST_TYP_DN() { return m_COST_TYP_DN; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getPROC_OUTSIDE_TYP_DN() { return m_PROC_OUTSIDE_TYP_DN; }
	public String getTOTAL_MATR_COST() { return m_TOTAL_MATR_COST; }
	public String getTOTAL_SBCNT_MATR_COST() { return m_TOTAL_SBCNT_MATR_COST; }
	public String getTOTAL_PROC_COST_SUM_ALL() { return m_TOTAL_PROC_COST_SUM_ALL; }
	public String getTOTAL_COST() { return m_TOTAL_COST; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getROOT_ITEM_CD() { return m_ROOT_ITEM_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PARENT_ITEM_CD() { return m_l_PARENT_ITEM_CD; }
	public String getl_OUTSIDE_TYP_DN() { return m_l_OUTSIDE_TYP_DN; }
	public String getl_PROC_OUTSIDE_TYP_DN() { return m_l_PROC_OUTSIDE_TYP_DN; }
	public String getl_CLASIFICATION_CD() { return m_l_CLASIFICATION_CD; }
	public String getl_CS_PROC_CD() { return m_l_CS_PROC_CD; }
	public String getl_CS_PROC_NAME() { return m_l_CS_PROC_NAME; }
	public String getl_NECESSARY_QTY() { return m_l_NECESSARY_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_HOME_CUR_UNIT() { return m_l_HOME_CUR_UNIT; }
	public String getl_OWN_MATR_COST() { return m_l_OWN_MATR_COST; }
	public String getl_TOTAL_MATR_COST() { return m_l_TOTAL_MATR_COST; }
	public String getl_OWN_SBCNT_MATR_COST() { return m_l_OWN_SBCNT_MATR_COST; }
	public String getl_TOTAL_SBCNT_MATR_COST() { return m_l_TOTAL_SBCNT_MATR_COST; }
	public String getl_OWN_PROC_COST_SUM_ALL() { return m_l_OWN_PROC_COST_SUM_ALL; }
	public String getl_TOTAL_PROC_COST_SUM_ALL() { return m_l_TOTAL_PROC_COST_SUM_ALL; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getROOT_ITEM_NAME() { return m_ROOT_ITEM_NAME; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getCOST_STATEMENT_NO() { return m_COST_STATEMENT_NO; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getNECESSARY_QTY() { return m_NECESSARY_QTY; }
	public String getPS_INPUT_RATIO() { return m_PS_INPUT_RATIO; }
	public String getITEM_INPUT_RATIO() { return m_ITEM_INPUT_RATIO; }
	public String getOWN_MATR_COST() { return m_OWN_MATR_COST; }
	public String getOWN_SBCNT_MATR_COST() { return m_OWN_SBCNT_MATR_COST; }
	public String getOWN_PROC_COST_SUM_ALL() { return m_OWN_PROC_COST_SUM_ALL; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getPARENT_COST_STATEMENT_NO() { return m_PARENT_COST_STATEMENT_NO; }
	public String getPARENT_ITEM_STOCK_UNIT() { return m_PARENT_ITEM_STOCK_UNIT; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getPROC_OUTSIDE_TYP() { return m_PROC_OUTSIDE_TYP; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getPROC_COST_CLS_NAME() { return m_PROC_COST_CLS_NAME; }
	public String getPROC_COST_UNIT_QTY() { return m_PROC_COST_UNIT_QTY; }
	public String getPROC_COST_UNIT_QTY_UNIT() { return m_PROC_COST_UNIT_QTY_UNIT; }
	public String getOWN_PROC_COST_01() { return m_OWN_PROC_COST_01; }
	public String getOWN_PROC_COST_02() { return m_OWN_PROC_COST_02; }
	public String getOWN_PROC_COST_03() { return m_OWN_PROC_COST_03; }
	public String getOWN_PROC_COST_04() { return m_OWN_PROC_COST_04; }
	public String getOWN_PROC_COST_05() { return m_OWN_PROC_COST_05; }
	public String getOWN_PROC_COST_06() { return m_OWN_PROC_COST_06; }
	public String getOWN_PROC_COST_07() { return m_OWN_PROC_COST_07; }
	public String getOWN_PROC_COST_08() { return m_OWN_PROC_COST_08; }
	public String getOWN_PROC_COST_09() { return m_OWN_PROC_COST_09; }
	public String getOWN_PROC_COST_10() { return m_OWN_PROC_COST_10; }
	public String getOWN_PROC_COST_11() { return m_OWN_PROC_COST_11; }
	public String getOWN_PROC_COST_12() { return m_OWN_PROC_COST_12; }
	public String getOWN_PROC_COST_SUM() { return m_OWN_PROC_COST_SUM; }
	public String getTOTAL_PROC_COST_01() { return m_TOTAL_PROC_COST_01; }
	public String getTOTAL_PROC_COST_02() { return m_TOTAL_PROC_COST_02; }
	public String getTOTAL_PROC_COST_03() { return m_TOTAL_PROC_COST_03; }
	public String getTOTAL_PROC_COST_04() { return m_TOTAL_PROC_COST_04; }
	public String getTOTAL_PROC_COST_05() { return m_TOTAL_PROC_COST_05; }
	public String getTOTAL_PROC_COST_06() { return m_TOTAL_PROC_COST_06; }
	public String getTOTAL_PROC_COST_07() { return m_TOTAL_PROC_COST_07; }
	public String getTOTAL_PROC_COST_08() { return m_TOTAL_PROC_COST_08; }
	public String getTOTAL_PROC_COST_09() { return m_TOTAL_PROC_COST_09; }
	public String getTOTAL_PROC_COST_10() { return m_TOTAL_PROC_COST_10; }
	public String getTOTAL_PROC_COST_11() { return m_TOTAL_PROC_COST_11; }
	public String getTOTAL_PROC_COST_12() { return m_TOTAL_PROC_COST_12; }
	public String getTOTAL_PROC_COST_SUM() { return m_TOTAL_PROC_COST_SUM; }
	public String getPROC_COST_01_NAME() { return m_PROC_COST_01_NAME; }
	public String getPROC_COST_02_NAME() { return m_PROC_COST_02_NAME; }
	public String getPROC_COST_03_NAME() { return m_PROC_COST_03_NAME; }
	public String getPROC_COST_04_NAME() { return m_PROC_COST_04_NAME; }
	public String getPROC_COST_05_NAME() { return m_PROC_COST_05_NAME; }
	public String getPROC_COST_06_NAME() { return m_PROC_COST_06_NAME; }
	public String getPROC_COST_07_NAME() { return m_PROC_COST_07_NAME; }
	public String getPROC_COST_08_NAME() { return m_PROC_COST_08_NAME; }
	public String getPROC_COST_09_NAME() { return m_PROC_COST_09_NAME; }
	public String getPROC_COST_10_NAME() { return m_PROC_COST_10_NAME; }
	public String getPROC_COST_11_NAME() { return m_PROC_COST_11_NAME; }
	public String getPROC_COST_12_NAME() { return m_PROC_COST_12_NAME; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }

	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_HALF_TERM_TYP_DN() { return l_HALF_TERM_TYP_DN; }
	public List getList_COST_TYP_DN() { return l_COST_TYP_DN; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_PROC_OUTSIDE_TYP_DN() { return l_PROC_OUTSIDE_TYP_DN; }
	public List getList_TOTAL_MATR_COST() { return l_TOTAL_MATR_COST; }
	public List getList_TOTAL_SBCNT_MATR_COST() { return l_TOTAL_SBCNT_MATR_COST; }
	public List getList_TOTAL_PROC_COST_SUM_ALL() { return l_TOTAL_PROC_COST_SUM_ALL; }
	public List getList_TOTAL_COST() { return l_TOTAL_COST; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_ROOT_ITEM_CD() { return l_ROOT_ITEM_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PARENT_ITEM_CD() { return l_l_PARENT_ITEM_CD; }
	public List getList_l_OUTSIDE_TYP_DN() { return l_l_OUTSIDE_TYP_DN; }
	public List getList_l_PROC_OUTSIDE_TYP_DN() { return l_l_PROC_OUTSIDE_TYP_DN; }
	public List getList_l_CLASIFICATION_CD() { return l_l_CLASIFICATION_CD; }
	public List getList_l_CS_PROC_CD() { return l_l_CS_PROC_CD; }
	public List getList_l_CS_PROC_NAME() { return l_l_CS_PROC_NAME; }
	public List getList_l_NECESSARY_QTY() { return l_l_NECESSARY_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_HOME_CUR_UNIT() { return l_l_HOME_CUR_UNIT; }
	public List getList_l_OWN_MATR_COST() { return l_l_OWN_MATR_COST; }
	public List getList_l_TOTAL_MATR_COST() { return l_l_TOTAL_MATR_COST; }
	public List getList_l_OWN_SBCNT_MATR_COST() { return l_l_OWN_SBCNT_MATR_COST; }
	public List getList_l_TOTAL_SBCNT_MATR_COST() { return l_l_TOTAL_SBCNT_MATR_COST; }
	public List getList_l_OWN_PROC_COST_SUM_ALL() { return l_l_OWN_PROC_COST_SUM_ALL; }
	public List getList_l_TOTAL_PROC_COST_SUM_ALL() { return l_l_TOTAL_PROC_COST_SUM_ALL; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_ROOT_ITEM_NAME() { return l_ROOT_ITEM_NAME; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_COST_STATEMENT_NO() { return l_COST_STATEMENT_NO; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_NECESSARY_QTY() { return l_NECESSARY_QTY; }
	public List getList_PS_INPUT_RATIO() { return l_PS_INPUT_RATIO; }
	public List getList_ITEM_INPUT_RATIO() { return l_ITEM_INPUT_RATIO; }
	public List getList_OWN_MATR_COST() { return l_OWN_MATR_COST; }
	public List getList_OWN_SBCNT_MATR_COST() { return l_OWN_SBCNT_MATR_COST; }
	public List getList_OWN_PROC_COST_SUM_ALL() { return l_OWN_PROC_COST_SUM_ALL; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_PARENT_COST_STATEMENT_NO() { return l_PARENT_COST_STATEMENT_NO; }
	public List getList_PARENT_ITEM_STOCK_UNIT() { return l_PARENT_ITEM_STOCK_UNIT; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_PROC_OUTSIDE_TYP() { return l_PROC_OUTSIDE_TYP; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_PROC_COST_CLS_NAME() { return l_PROC_COST_CLS_NAME; }
	public List getList_PROC_COST_UNIT_QTY() { return l_PROC_COST_UNIT_QTY; }
	public List getList_PROC_COST_UNIT_QTY_UNIT() { return l_PROC_COST_UNIT_QTY_UNIT; }
	public List getList_OWN_PROC_COST_01() { return l_OWN_PROC_COST_01; }
	public List getList_OWN_PROC_COST_02() { return l_OWN_PROC_COST_02; }
	public List getList_OWN_PROC_COST_03() { return l_OWN_PROC_COST_03; }
	public List getList_OWN_PROC_COST_04() { return l_OWN_PROC_COST_04; }
	public List getList_OWN_PROC_COST_05() { return l_OWN_PROC_COST_05; }
	public List getList_OWN_PROC_COST_06() { return l_OWN_PROC_COST_06; }
	public List getList_OWN_PROC_COST_07() { return l_OWN_PROC_COST_07; }
	public List getList_OWN_PROC_COST_08() { return l_OWN_PROC_COST_08; }
	public List getList_OWN_PROC_COST_09() { return l_OWN_PROC_COST_09; }
	public List getList_OWN_PROC_COST_10() { return l_OWN_PROC_COST_10; }
	public List getList_OWN_PROC_COST_11() { return l_OWN_PROC_COST_11; }
	public List getList_OWN_PROC_COST_12() { return l_OWN_PROC_COST_12; }
	public List getList_OWN_PROC_COST_SUM() { return l_OWN_PROC_COST_SUM; }
	public List getList_TOTAL_PROC_COST_01() { return l_TOTAL_PROC_COST_01; }
	public List getList_TOTAL_PROC_COST_02() { return l_TOTAL_PROC_COST_02; }
	public List getList_TOTAL_PROC_COST_03() { return l_TOTAL_PROC_COST_03; }
	public List getList_TOTAL_PROC_COST_04() { return l_TOTAL_PROC_COST_04; }
	public List getList_TOTAL_PROC_COST_05() { return l_TOTAL_PROC_COST_05; }
	public List getList_TOTAL_PROC_COST_06() { return l_TOTAL_PROC_COST_06; }
	public List getList_TOTAL_PROC_COST_07() { return l_TOTAL_PROC_COST_07; }
	public List getList_TOTAL_PROC_COST_08() { return l_TOTAL_PROC_COST_08; }
	public List getList_TOTAL_PROC_COST_09() { return l_TOTAL_PROC_COST_09; }
	public List getList_TOTAL_PROC_COST_10() { return l_TOTAL_PROC_COST_10; }
	public List getList_TOTAL_PROC_COST_11() { return l_TOTAL_PROC_COST_11; }
	public List getList_TOTAL_PROC_COST_12() { return l_TOTAL_PROC_COST_12; }
	public List getList_TOTAL_PROC_COST_SUM() { return l_TOTAL_PROC_COST_SUM; }
	public List getList_PROC_COST_01_NAME() { return l_PROC_COST_01_NAME; }
	public List getList_PROC_COST_02_NAME() { return l_PROC_COST_02_NAME; }
	public List getList_PROC_COST_03_NAME() { return l_PROC_COST_03_NAME; }
	public List getList_PROC_COST_04_NAME() { return l_PROC_COST_04_NAME; }
	public List getList_PROC_COST_05_NAME() { return l_PROC_COST_05_NAME; }
	public List getList_PROC_COST_06_NAME() { return l_PROC_COST_06_NAME; }
	public List getList_PROC_COST_07_NAME() { return l_PROC_COST_07_NAME; }
	public List getList_PROC_COST_08_NAME() { return l_PROC_COST_08_NAME; }
	public List getList_PROC_COST_09_NAME() { return l_PROC_COST_09_NAME; }
	public List getList_PROC_COST_10_NAME() { return l_PROC_COST_10_NAME; }
	public List getList_PROC_COST_11_NAME() { return l_PROC_COST_11_NAME; }
	public List getList_PROC_COST_12_NAME() { return l_PROC_COST_12_NAME; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }

	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setHALF_TERM_TYP_DN(String val) { m_HALF_TERM_TYP_DN = val; }
	public void setCOST_TYP_DN(String val) { m_COST_TYP_DN = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setPROC_OUTSIDE_TYP_DN(String val) { m_PROC_OUTSIDE_TYP_DN = val; }
	public void setTOTAL_MATR_COST(String val) { m_TOTAL_MATR_COST = val; }
	public void setTOTAL_SBCNT_MATR_COST(String val) { m_TOTAL_SBCNT_MATR_COST = val; }
	public void setTOTAL_PROC_COST_SUM_ALL(String val) { m_TOTAL_PROC_COST_SUM_ALL = val; }
	public void setTOTAL_COST(String val) { m_TOTAL_COST = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setROOT_ITEM_CD(String val) { m_ROOT_ITEM_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PARENT_ITEM_CD(String val) { m_l_PARENT_ITEM_CD = val; }
	public void setl_OUTSIDE_TYP_DN(String val) { m_l_OUTSIDE_TYP_DN = val; }
	public void setl_PROC_OUTSIDE_TYP_DN(String val) { m_l_PROC_OUTSIDE_TYP_DN = val; }
	public void setl_CLASIFICATION_CD(String val) { m_l_CLASIFICATION_CD = val; }
	public void setl_CS_PROC_CD(String val) { m_l_CS_PROC_CD = val; }
	public void setl_CS_PROC_NAME(String val) { m_l_CS_PROC_NAME = val; }
	public void setl_NECESSARY_QTY(String val) { m_l_NECESSARY_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_HOME_CUR_UNIT(String val) { m_l_HOME_CUR_UNIT = val; }
	public void setl_OWN_MATR_COST(String val) { m_l_OWN_MATR_COST = val; }
	public void setl_TOTAL_MATR_COST(String val) { m_l_TOTAL_MATR_COST = val; }
	public void setl_OWN_SBCNT_MATR_COST(String val) { m_l_OWN_SBCNT_MATR_COST = val; }
	public void setl_TOTAL_SBCNT_MATR_COST(String val) { m_l_TOTAL_SBCNT_MATR_COST = val; }
	public void setl_OWN_PROC_COST_SUM_ALL(String val) { m_l_OWN_PROC_COST_SUM_ALL = val; }
	public void setl_TOTAL_PROC_COST_SUM_ALL(String val) { m_l_TOTAL_PROC_COST_SUM_ALL = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setROOT_ITEM_NAME(String val) { m_ROOT_ITEM_NAME = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setCOST_STATEMENT_NO(String val) { m_COST_STATEMENT_NO = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setNECESSARY_QTY(String val) { m_NECESSARY_QTY = val; }
	public void setPS_INPUT_RATIO(String val) { m_PS_INPUT_RATIO = val; }
	public void setITEM_INPUT_RATIO(String val) { m_ITEM_INPUT_RATIO = val; }
	public void setOWN_MATR_COST(String val) { m_OWN_MATR_COST = val; }
	public void setOWN_SBCNT_MATR_COST(String val) { m_OWN_SBCNT_MATR_COST = val; }
	public void setOWN_PROC_COST_SUM_ALL(String val) { m_OWN_PROC_COST_SUM_ALL = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setPARENT_COST_STATEMENT_NO(String val) { m_PARENT_COST_STATEMENT_NO = val; }
	public void setPARENT_ITEM_STOCK_UNIT(String val) { m_PARENT_ITEM_STOCK_UNIT = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setPROC_OUTSIDE_TYP(String val) { m_PROC_OUTSIDE_TYP = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setPROC_COST_CLS_NAME(String val) { m_PROC_COST_CLS_NAME = val; }
	public void setPROC_COST_UNIT_QTY(String val) { m_PROC_COST_UNIT_QTY = val; }
	public void setPROC_COST_UNIT_QTY_UNIT(String val) { m_PROC_COST_UNIT_QTY_UNIT = val; }
	public void setOWN_PROC_COST_01(String val) { m_OWN_PROC_COST_01 = val; }
	public void setOWN_PROC_COST_02(String val) { m_OWN_PROC_COST_02 = val; }
	public void setOWN_PROC_COST_03(String val) { m_OWN_PROC_COST_03 = val; }
	public void setOWN_PROC_COST_04(String val) { m_OWN_PROC_COST_04 = val; }
	public void setOWN_PROC_COST_05(String val) { m_OWN_PROC_COST_05 = val; }
	public void setOWN_PROC_COST_06(String val) { m_OWN_PROC_COST_06 = val; }
	public void setOWN_PROC_COST_07(String val) { m_OWN_PROC_COST_07 = val; }
	public void setOWN_PROC_COST_08(String val) { m_OWN_PROC_COST_08 = val; }
	public void setOWN_PROC_COST_09(String val) { m_OWN_PROC_COST_09 = val; }
	public void setOWN_PROC_COST_10(String val) { m_OWN_PROC_COST_10 = val; }
	public void setOWN_PROC_COST_11(String val) { m_OWN_PROC_COST_11 = val; }
	public void setOWN_PROC_COST_12(String val) { m_OWN_PROC_COST_12 = val; }
	public void setOWN_PROC_COST_SUM(String val) { m_OWN_PROC_COST_SUM = val; }
	public void setTOTAL_PROC_COST_01(String val) { m_TOTAL_PROC_COST_01 = val; }
	public void setTOTAL_PROC_COST_02(String val) { m_TOTAL_PROC_COST_02 = val; }
	public void setTOTAL_PROC_COST_03(String val) { m_TOTAL_PROC_COST_03 = val; }
	public void setTOTAL_PROC_COST_04(String val) { m_TOTAL_PROC_COST_04 = val; }
	public void setTOTAL_PROC_COST_05(String val) { m_TOTAL_PROC_COST_05 = val; }
	public void setTOTAL_PROC_COST_06(String val) { m_TOTAL_PROC_COST_06 = val; }
	public void setTOTAL_PROC_COST_07(String val) { m_TOTAL_PROC_COST_07 = val; }
	public void setTOTAL_PROC_COST_08(String val) { m_TOTAL_PROC_COST_08 = val; }
	public void setTOTAL_PROC_COST_09(String val) { m_TOTAL_PROC_COST_09 = val; }
	public void setTOTAL_PROC_COST_10(String val) { m_TOTAL_PROC_COST_10 = val; }
	public void setTOTAL_PROC_COST_11(String val) { m_TOTAL_PROC_COST_11 = val; }
	public void setTOTAL_PROC_COST_12(String val) { m_TOTAL_PROC_COST_12 = val; }
	public void setTOTAL_PROC_COST_SUM(String val) { m_TOTAL_PROC_COST_SUM = val; }
	public void setPROC_COST_01_NAME(String val) { m_PROC_COST_01_NAME = val; }
	public void setPROC_COST_02_NAME(String val) { m_PROC_COST_02_NAME = val; }
	public void setPROC_COST_03_NAME(String val) { m_PROC_COST_03_NAME = val; }
	public void setPROC_COST_04_NAME(String val) { m_PROC_COST_04_NAME = val; }
	public void setPROC_COST_05_NAME(String val) { m_PROC_COST_05_NAME = val; }
	public void setPROC_COST_06_NAME(String val) { m_PROC_COST_06_NAME = val; }
	public void setPROC_COST_07_NAME(String val) { m_PROC_COST_07_NAME = val; }
	public void setPROC_COST_08_NAME(String val) { m_PROC_COST_08_NAME = val; }
	public void setPROC_COST_09_NAME(String val) { m_PROC_COST_09_NAME = val; }
	public void setPROC_COST_10_NAME(String val) { m_PROC_COST_10_NAME = val; }
	public void setPROC_COST_11_NAME(String val) { m_PROC_COST_11_NAME = val; }
	public void setPROC_COST_12_NAME(String val) { m_PROC_COST_12_NAME = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }


	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_HALF_TERM_TYP_DN(List list) { l_HALF_TERM_TYP_DN = list; }
	public void setList_COST_TYP_DN(List list) { l_COST_TYP_DN = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_PROC_OUTSIDE_TYP_DN(List list) { l_PROC_OUTSIDE_TYP_DN = list; }
	public void setList_TOTAL_MATR_COST(List list) { l_TOTAL_MATR_COST = list; }
	public void setList_TOTAL_SBCNT_MATR_COST(List list) { l_TOTAL_SBCNT_MATR_COST = list; }
	public void setList_TOTAL_PROC_COST_SUM_ALL(List list) { l_TOTAL_PROC_COST_SUM_ALL = list; }
	public void setList_TOTAL_COST(List list) { l_TOTAL_COST = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_ROOT_ITEM_CD(List list) { l_ROOT_ITEM_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PARENT_ITEM_CD(List list) { l_l_PARENT_ITEM_CD = list; }
	public void setList_l_OUTSIDE_TYP_DN(List list) { l_l_OUTSIDE_TYP_DN = list; }
	public void setList_l_PROC_OUTSIDE_TYP_DN(List list) { l_l_PROC_OUTSIDE_TYP_DN = list; }
	public void setList_l_CLASIFICATION_CD(List list) { l_l_CLASIFICATION_CD = list; }
	public void setList_l_CS_PROC_CD(List list) { l_l_CS_PROC_CD = list; }
	public void setList_l_CS_PROC_NAME(List list) { l_l_CS_PROC_NAME = list; }
	public void setList_l_NECESSARY_QTY(List list) { l_l_NECESSARY_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_HOME_CUR_UNIT(List list) { l_l_HOME_CUR_UNIT = list; }
	public void setList_l_OWN_MATR_COST(List list) { l_l_OWN_MATR_COST = list; }
	public void setList_l_TOTAL_MATR_COST(List list) { l_l_TOTAL_MATR_COST = list; }
	public void setList_l_OWN_SBCNT_MATR_COST(List list) { l_l_OWN_SBCNT_MATR_COST = list; }
	public void setList_l_TOTAL_SBCNT_MATR_COST(List list) { l_l_TOTAL_SBCNT_MATR_COST = list; }
	public void setList_l_OWN_PROC_COST_SUM_ALL(List list) { l_l_OWN_PROC_COST_SUM_ALL = list; }
	public void setList_l_TOTAL_PROC_COST_SUM_ALL(List list) { l_l_TOTAL_PROC_COST_SUM_ALL = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_ROOT_ITEM_NAME(List list) { l_ROOT_ITEM_NAME = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_COST_STATEMENT_NO(List list) { l_COST_STATEMENT_NO = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_NECESSARY_QTY(List list) { l_NECESSARY_QTY = list; }
	public void setList_PS_INPUT_RATIO(List list) { l_PS_INPUT_RATIO = list; }
	public void setList_ITEM_INPUT_RATIO(List list) { l_ITEM_INPUT_RATIO = list; }
	public void setList_OWN_MATR_COST(List list) { l_OWN_MATR_COST = list; }
	public void setList_OWN_SBCNT_MATR_COST(List list) { l_OWN_SBCNT_MATR_COST = list; }
	public void setList_OWN_PROC_COST_SUM_ALL(List list) { l_OWN_PROC_COST_SUM_ALL = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_PARENT_COST_STATEMENT_NO(List list) { l_PARENT_COST_STATEMENT_NO = list; }
	public void setList_PARENT_ITEM_STOCK_UNIT(List list) { l_PARENT_ITEM_STOCK_UNIT = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_PROC_OUTSIDE_TYP(List list) { l_PROC_OUTSIDE_TYP = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_PROC_COST_CLS_NAME(List list) { l_PROC_COST_CLS_NAME = list; }
	public void setList_PROC_COST_UNIT_QTY(List list) { l_PROC_COST_UNIT_QTY = list; }
	public void setList_PROC_COST_UNIT_QTY_UNIT(List list) { l_PROC_COST_UNIT_QTY_UNIT = list; }
	public void setList_OWN_PROC_COST_01(List list) { l_OWN_PROC_COST_01 = list; }
	public void setList_OWN_PROC_COST_02(List list) { l_OWN_PROC_COST_02 = list; }
	public void setList_OWN_PROC_COST_03(List list) { l_OWN_PROC_COST_03 = list; }
	public void setList_OWN_PROC_COST_04(List list) { l_OWN_PROC_COST_04 = list; }
	public void setList_OWN_PROC_COST_05(List list) { l_OWN_PROC_COST_05 = list; }
	public void setList_OWN_PROC_COST_06(List list) { l_OWN_PROC_COST_06 = list; }
	public void setList_OWN_PROC_COST_07(List list) { l_OWN_PROC_COST_07 = list; }
	public void setList_OWN_PROC_COST_08(List list) { l_OWN_PROC_COST_08 = list; }
	public void setList_OWN_PROC_COST_09(List list) { l_OWN_PROC_COST_09 = list; }
	public void setList_OWN_PROC_COST_10(List list) { l_OWN_PROC_COST_10 = list; }
	public void setList_OWN_PROC_COST_11(List list) { l_OWN_PROC_COST_11 = list; }
	public void setList_OWN_PROC_COST_12(List list) { l_OWN_PROC_COST_12 = list; }
	public void setList_OWN_PROC_COST_SUM(List list) { l_OWN_PROC_COST_SUM = list; }
	public void setList_TOTAL_PROC_COST_01(List list) { l_TOTAL_PROC_COST_01 = list; }
	public void setList_TOTAL_PROC_COST_02(List list) { l_TOTAL_PROC_COST_02 = list; }
	public void setList_TOTAL_PROC_COST_03(List list) { l_TOTAL_PROC_COST_03 = list; }
	public void setList_TOTAL_PROC_COST_04(List list) { l_TOTAL_PROC_COST_04 = list; }
	public void setList_TOTAL_PROC_COST_05(List list) { l_TOTAL_PROC_COST_05 = list; }
	public void setList_TOTAL_PROC_COST_06(List list) { l_TOTAL_PROC_COST_06 = list; }
	public void setList_TOTAL_PROC_COST_07(List list) { l_TOTAL_PROC_COST_07 = list; }
	public void setList_TOTAL_PROC_COST_08(List list) { l_TOTAL_PROC_COST_08 = list; }
	public void setList_TOTAL_PROC_COST_09(List list) { l_TOTAL_PROC_COST_09 = list; }
	public void setList_TOTAL_PROC_COST_10(List list) { l_TOTAL_PROC_COST_10 = list; }
	public void setList_TOTAL_PROC_COST_11(List list) { l_TOTAL_PROC_COST_11 = list; }
	public void setList_TOTAL_PROC_COST_12(List list) { l_TOTAL_PROC_COST_12 = list; }
	public void setList_TOTAL_PROC_COST_SUM(List list) { l_TOTAL_PROC_COST_SUM = list; }
	public void setList_PROC_COST_01_NAME(List list) { l_PROC_COST_01_NAME = list; }
	public void setList_PROC_COST_02_NAME(List list) { l_PROC_COST_02_NAME = list; }
	public void setList_PROC_COST_03_NAME(List list) { l_PROC_COST_03_NAME = list; }
	public void setList_PROC_COST_04_NAME(List list) { l_PROC_COST_04_NAME = list; }
	public void setList_PROC_COST_05_NAME(List list) { l_PROC_COST_05_NAME = list; }
	public void setList_PROC_COST_06_NAME(List list) { l_PROC_COST_06_NAME = list; }
	public void setList_PROC_COST_07_NAME(List list) { l_PROC_COST_07_NAME = list; }
	public void setList_PROC_COST_08_NAME(List list) { l_PROC_COST_08_NAME = list; }
	public void setList_PROC_COST_09_NAME(List list) { l_PROC_COST_09_NAME = list; }
	public void setList_PROC_COST_10_NAME(List list) { l_PROC_COST_10_NAME = list; }
	public void setList_PROC_COST_11_NAME(List list) { l_PROC_COST_11_NAME = list; }
	public void setList_PROC_COST_12_NAME(List list) { l_PROC_COST_12_NAME = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }

	public int setL2L_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_name == null) {
			l_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_name.add(((DD0010020Struct) list.get(i)).getHALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_val == null) {
			l_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_val.add(((DD0010020Struct) list.get(i)).getHALF_TERM_TYP_val());
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
			l_DOWNLOAD_FILE.add(((DD0010020Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_DN == null) {
			l_HALF_TERM_TYP_DN = new ArrayList();
		} else {
			l_HALF_TERM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_DN.add(((DD0010020Struct) list.get(i)).getHALF_TERM_TYP_DN());
		}
		return size;
	}
	public int setL2L_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_DN == null) {
			l_COST_TYP_DN = new ArrayList();
		} else {
			l_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_DN.add(((DD0010020Struct) list.get(i)).getCOST_TYP_DN());
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
			l_OUTSIDE_TYP_DN.add(((DD0010020Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_PROC_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_OUTSIDE_TYP_DN == null) {
			l_PROC_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_PROC_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_OUTSIDE_TYP_DN.add(((DD0010020Struct) list.get(i)).getPROC_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_TOTAL_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_MATR_COST == null) {
			l_TOTAL_MATR_COST = new ArrayList();
		} else {
			l_TOTAL_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_MATR_COST.add(((DD0010020Struct) list.get(i)).getTOTAL_MATR_COST());
		}
		return size;
	}
	public int setL2L_TOTAL_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_SBCNT_MATR_COST == null) {
			l_TOTAL_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_TOTAL_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_SBCNT_MATR_COST.add(((DD0010020Struct) list.get(i)).getTOTAL_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_SUM_ALL == null) {
			l_TOTAL_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_SUM_ALL.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_TOTAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_COST == null) {
			l_TOTAL_COST = new ArrayList();
		} else {
			l_TOTAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_COST.add(((DD0010020Struct) list.get(i)).getTOTAL_COST());
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
			l_PLANT_CD.add(((DD0010020Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_YEAR == null) {
			l_YEAR = new ArrayList();
		} else {
			l_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_YEAR.add(((DD0010020Struct) list.get(i)).getYEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP == null) {
			l_HALF_TERM_TYP = new ArrayList();
		} else {
			l_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP.add(((DD0010020Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_CD == null) {
			l_ROOT_ITEM_CD = new ArrayList();
		} else {
			l_ROOT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_CD.add(((DD0010020Struct) list.get(i)).getROOT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_CD == null) {
			l_l_ITEM_CD = new ArrayList();
		} else {
			l_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_CD.add(((DD0010020Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_NAME == null) {
			l_l_ITEM_NAME = new ArrayList();
		} else {
			l_l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_NAME.add(((DD0010020Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PARENT_ITEM_CD == null) {
			l_l_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_l_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PARENT_ITEM_CD.add(((DD0010020Struct) list.get(i)).getl_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OUTSIDE_TYP_DN == null) {
			l_l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OUTSIDE_TYP_DN.add(((DD0010020Struct) list.get(i)).getl_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_PROC_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_OUTSIDE_TYP_DN == null) {
			l_l_PROC_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_l_PROC_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_OUTSIDE_TYP_DN.add(((DD0010020Struct) list.get(i)).getl_PROC_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CLASIFICATION_CD == null) {
			l_l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CLASIFICATION_CD.add(((DD0010020Struct) list.get(i)).getl_CLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_l_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CS_PROC_CD == null) {
			l_l_CS_PROC_CD = new ArrayList();
		} else {
			l_l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CS_PROC_CD.add(((DD0010020Struct) list.get(i)).getl_CS_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CS_PROC_NAME == null) {
			l_l_CS_PROC_NAME = new ArrayList();
		} else {
			l_l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CS_PROC_NAME.add(((DD0010020Struct) list.get(i)).getl_CS_PROC_NAME());
		}
		return size;
	}
	public int setL2L_l_NECESSARY_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NECESSARY_QTY == null) {
			l_l_NECESSARY_QTY = new ArrayList();
		} else {
			l_l_NECESSARY_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NECESSARY_QTY.add(((DD0010020Struct) list.get(i)).getl_NECESSARY_QTY());
		}
		return size;
	}
	public int setL2L_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_UNIT == null) {
			l_l_STOCK_UNIT = new ArrayList();
		} else {
			l_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_UNIT.add(((DD0010020Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_UNIT == null) {
			l_l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_UNIT.add(((DD0010020Struct) list.get(i)).getl_HOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_OWN_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_MATR_COST == null) {
			l_l_OWN_MATR_COST = new ArrayList();
		} else {
			l_l_OWN_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_MATR_COST.add(((DD0010020Struct) list.get(i)).getl_OWN_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_TOTAL_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_MATR_COST == null) {
			l_l_TOTAL_MATR_COST = new ArrayList();
		} else {
			l_l_TOTAL_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_MATR_COST.add(((DD0010020Struct) list.get(i)).getl_TOTAL_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_OWN_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_SBCNT_MATR_COST == null) {
			l_l_OWN_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_l_OWN_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_SBCNT_MATR_COST.add(((DD0010020Struct) list.get(i)).getl_OWN_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_TOTAL_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_SBCNT_MATR_COST == null) {
			l_l_TOTAL_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_l_TOTAL_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_SBCNT_MATR_COST.add(((DD0010020Struct) list.get(i)).getl_TOTAL_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_OWN_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PROC_COST_SUM_ALL == null) {
			l_l_OWN_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_l_OWN_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PROC_COST_SUM_ALL.add(((DD0010020Struct) list.get(i)).getl_OWN_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_l_TOTAL_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_PROC_COST_SUM_ALL == null) {
			l_l_TOTAL_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_l_TOTAL_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_PROC_COST_SUM_ALL.add(((DD0010020Struct) list.get(i)).getl_TOTAL_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DD0010020Struct) list.get(i)).getCOST_TYP());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((DD0010020Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_NAME == null) {
			l_ROOT_ITEM_NAME = new ArrayList();
		} else {
			l_ROOT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_NAME.add(((DD0010020Struct) list.get(i)).getROOT_ITEM_NAME());
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
			l_PARENT_ITEM_CD.add(((DD0010020Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_PARENT_ITEM_NAME.add(((DD0010020Struct) list.get(i)).getPARENT_ITEM_NAME());
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
			l_ITEM_CD.add(((DD0010020Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((DD0010020Struct) list.get(i)).getITEM_NAME());
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
			l_PS_EDITION.add(((DD0010020Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_COST_STATEMENT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_STATEMENT_NO == null) {
			l_COST_STATEMENT_NO = new ArrayList();
		} else {
			l_COST_STATEMENT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_STATEMENT_NO.add(((DD0010020Struct) list.get(i)).getCOST_STATEMENT_NO());
		}
		return size;
	}
	public int setL2L_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_CD == null) {
			l_CS_PROC_CD = new ArrayList();
		} else {
			l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_CD.add(((DD0010020Struct) list.get(i)).getCS_PROC_CD());
		}
		return size;
	}
	public int setL2L_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_NAME == null) {
			l_CS_PROC_NAME = new ArrayList();
		} else {
			l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_NAME.add(((DD0010020Struct) list.get(i)).getCS_PROC_NAME());
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
			l_WS_CD.add(((DD0010020Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_NAME == null) {
			l_WS_NAME = new ArrayList();
		} else {
			l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_NAME.add(((DD0010020Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((DD0010020Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((DD0010020Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_NECESSARY_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECESSARY_QTY == null) {
			l_NECESSARY_QTY = new ArrayList();
		} else {
			l_NECESSARY_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECESSARY_QTY.add(((DD0010020Struct) list.get(i)).getNECESSARY_QTY());
		}
		return size;
	}
	public int setL2L_PS_INPUT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_INPUT_RATIO == null) {
			l_PS_INPUT_RATIO = new ArrayList();
		} else {
			l_PS_INPUT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_INPUT_RATIO.add(((DD0010020Struct) list.get(i)).getPS_INPUT_RATIO());
		}
		return size;
	}
	public int setL2L_ITEM_INPUT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_INPUT_RATIO == null) {
			l_ITEM_INPUT_RATIO = new ArrayList();
		} else {
			l_ITEM_INPUT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_INPUT_RATIO.add(((DD0010020Struct) list.get(i)).getITEM_INPUT_RATIO());
		}
		return size;
	}
	public int setL2L_OWN_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_MATR_COST == null) {
			l_OWN_MATR_COST = new ArrayList();
		} else {
			l_OWN_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_MATR_COST.add(((DD0010020Struct) list.get(i)).getOWN_MATR_COST());
		}
		return size;
	}
	public int setL2L_OWN_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_SBCNT_MATR_COST == null) {
			l_OWN_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_OWN_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_SBCNT_MATR_COST.add(((DD0010020Struct) list.get(i)).getOWN_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_SUM_ALL == null) {
			l_OWN_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_OWN_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_SUM_ALL.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_UNIT == null) {
			l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_UNIT.add(((DD0010020Struct) list.get(i)).getHOME_CUR_UNIT());
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
			l_EFF_PHASE_IN_DATE.add(((DD0010020Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((DD0010020Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_PARENT_COST_STATEMENT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_COST_STATEMENT_NO == null) {
			l_PARENT_COST_STATEMENT_NO = new ArrayList();
		} else {
			l_PARENT_COST_STATEMENT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_COST_STATEMENT_NO.add(((DD0010020Struct) list.get(i)).getPARENT_COST_STATEMENT_NO());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_STOCK_UNIT == null) {
			l_PARENT_ITEM_STOCK_UNIT = new ArrayList();
		} else {
			l_PARENT_ITEM_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_STOCK_UNIT.add(((DD0010020Struct) list.get(i)).getPARENT_ITEM_STOCK_UNIT());
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
			l_STOCK_UNIT.add(((DD0010020Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASIFICATION_CD == null) {
			l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASIFICATION_CD.add(((DD0010020Struct) list.get(i)).getCLASIFICATION_CD());
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
			l_OUTSIDE_TYP.add(((DD0010020Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_PROC_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_OUTSIDE_TYP == null) {
			l_PROC_OUTSIDE_TYP = new ArrayList();
		} else {
			l_PROC_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_OUTSIDE_TYP.add(((DD0010020Struct) list.get(i)).getPROC_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_CD == null) {
			l_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_CD.add(((DD0010020Struct) list.get(i)).getPROC_COST_CLS_CD());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_NAME == null) {
			l_PROC_COST_CLS_NAME = new ArrayList();
		} else {
			l_PROC_COST_CLS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_CLS_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_UNIT_QTY == null) {
			l_PROC_COST_UNIT_QTY = new ArrayList();
		} else {
			l_PROC_COST_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_UNIT_QTY.add(((DD0010020Struct) list.get(i)).getPROC_COST_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_PROC_COST_UNIT_QTY_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_UNIT_QTY_UNIT == null) {
			l_PROC_COST_UNIT_QTY_UNIT = new ArrayList();
		} else {
			l_PROC_COST_UNIT_QTY_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_UNIT_QTY_UNIT.add(((DD0010020Struct) list.get(i)).getPROC_COST_UNIT_QTY_UNIT());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_01 == null) {
			l_OWN_PROC_COST_01 = new ArrayList();
		} else {
			l_OWN_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_01.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_02 == null) {
			l_OWN_PROC_COST_02 = new ArrayList();
		} else {
			l_OWN_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_02.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_03 == null) {
			l_OWN_PROC_COST_03 = new ArrayList();
		} else {
			l_OWN_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_03.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_04 == null) {
			l_OWN_PROC_COST_04 = new ArrayList();
		} else {
			l_OWN_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_04.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_05 == null) {
			l_OWN_PROC_COST_05 = new ArrayList();
		} else {
			l_OWN_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_05.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_06 == null) {
			l_OWN_PROC_COST_06 = new ArrayList();
		} else {
			l_OWN_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_06.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_07 == null) {
			l_OWN_PROC_COST_07 = new ArrayList();
		} else {
			l_OWN_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_07.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_08 == null) {
			l_OWN_PROC_COST_08 = new ArrayList();
		} else {
			l_OWN_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_08.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_09 == null) {
			l_OWN_PROC_COST_09 = new ArrayList();
		} else {
			l_OWN_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_09.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_10 == null) {
			l_OWN_PROC_COST_10 = new ArrayList();
		} else {
			l_OWN_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_10.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_11 == null) {
			l_OWN_PROC_COST_11 = new ArrayList();
		} else {
			l_OWN_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_11.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_12 == null) {
			l_OWN_PROC_COST_12 = new ArrayList();
		} else {
			l_OWN_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_12.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_SUM == null) {
			l_OWN_PROC_COST_SUM = new ArrayList();
		} else {
			l_OWN_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_SUM.add(((DD0010020Struct) list.get(i)).getOWN_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_01 == null) {
			l_TOTAL_PROC_COST_01 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_01.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_02 == null) {
			l_TOTAL_PROC_COST_02 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_02.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_03 == null) {
			l_TOTAL_PROC_COST_03 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_03.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_04 == null) {
			l_TOTAL_PROC_COST_04 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_04.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_05 == null) {
			l_TOTAL_PROC_COST_05 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_05.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_06 == null) {
			l_TOTAL_PROC_COST_06 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_06.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_07 == null) {
			l_TOTAL_PROC_COST_07 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_07.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_08 == null) {
			l_TOTAL_PROC_COST_08 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_08.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_09 == null) {
			l_TOTAL_PROC_COST_09 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_09.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_10 == null) {
			l_TOTAL_PROC_COST_10 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_10.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_11 == null) {
			l_TOTAL_PROC_COST_11 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_11.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_12 == null) {
			l_TOTAL_PROC_COST_12 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_12.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_SUM == null) {
			l_TOTAL_PROC_COST_SUM = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_SUM.add(((DD0010020Struct) list.get(i)).getTOTAL_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_PROC_COST_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01_NAME == null) {
			l_PROC_COST_01_NAME = new ArrayList();
		} else {
			l_PROC_COST_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_01_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_02_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02_NAME == null) {
			l_PROC_COST_02_NAME = new ArrayList();
		} else {
			l_PROC_COST_02_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_02_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_03_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03_NAME == null) {
			l_PROC_COST_03_NAME = new ArrayList();
		} else {
			l_PROC_COST_03_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_03_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_04_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04_NAME == null) {
			l_PROC_COST_04_NAME = new ArrayList();
		} else {
			l_PROC_COST_04_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_04_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_05_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05_NAME == null) {
			l_PROC_COST_05_NAME = new ArrayList();
		} else {
			l_PROC_COST_05_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_05_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_06_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06_NAME == null) {
			l_PROC_COST_06_NAME = new ArrayList();
		} else {
			l_PROC_COST_06_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_06_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_07_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07_NAME == null) {
			l_PROC_COST_07_NAME = new ArrayList();
		} else {
			l_PROC_COST_07_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_07_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_08_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08_NAME == null) {
			l_PROC_COST_08_NAME = new ArrayList();
		} else {
			l_PROC_COST_08_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_08_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_09_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09_NAME == null) {
			l_PROC_COST_09_NAME = new ArrayList();
		} else {
			l_PROC_COST_09_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_09_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_10_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10_NAME == null) {
			l_PROC_COST_10_NAME = new ArrayList();
		} else {
			l_PROC_COST_10_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_10_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_11_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11_NAME == null) {
			l_PROC_COST_11_NAME = new ArrayList();
		} else {
			l_PROC_COST_11_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_11_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_12_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12_NAME == null) {
			l_PROC_COST_12_NAME = new ArrayList();
		} else {
			l_PROC_COST_12_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12_NAME.add(((DD0010020Struct) list.get(i)).getPROC_COST_12_NAME());
		}
		return size;
	}
	public int setL2L_CURRENT_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_YEAR == null) {
			l_CURRENT_YEAR = new ArrayList();
		} else {
			l_CURRENT_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_YEAR.add(((DD0010020Struct) list.get(i)).getCURRENT_YEAR());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_DOWNLOAD_FILE = null;
		m_HALF_TERM_TYP_DN = null;
		m_COST_TYP_DN = null;
		m_OUTSIDE_TYP_DN = null;
		m_PROC_OUTSIDE_TYP_DN = null;
		m_TOTAL_MATR_COST = null;
		m_TOTAL_SBCNT_MATR_COST = null;
		m_TOTAL_PROC_COST_SUM_ALL = null;
		m_TOTAL_COST = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_ROOT_ITEM_CD = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PARENT_ITEM_CD = null;
		m_l_OUTSIDE_TYP_DN = null;
		m_l_PROC_OUTSIDE_TYP_DN = null;
		m_l_CLASIFICATION_CD = null;
		m_l_CS_PROC_CD = null;
		m_l_CS_PROC_NAME = null;
		m_l_NECESSARY_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_HOME_CUR_UNIT = null;
		m_l_OWN_MATR_COST = null;
		m_l_TOTAL_MATR_COST = null;
		m_l_OWN_SBCNT_MATR_COST = null;
		m_l_TOTAL_SBCNT_MATR_COST = null;
		m_l_OWN_PROC_COST_SUM_ALL = null;
		m_l_TOTAL_PROC_COST_SUM_ALL = null;
		m_COST_TYP = null;
		m_PLANT_NAME = null;
		m_ROOT_ITEM_NAME = null;
		m_PARENT_ITEM_CD = null;
		m_PARENT_ITEM_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_PS_EDITION = null;
		m_COST_STATEMENT_NO = null;
		m_CS_PROC_CD = null;
		m_CS_PROC_NAME = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_NECESSARY_QTY = null;
		m_PS_INPUT_RATIO = null;
		m_ITEM_INPUT_RATIO = null;
		m_OWN_MATR_COST = null;
		m_OWN_SBCNT_MATR_COST = null;
		m_OWN_PROC_COST_SUM_ALL = null;
		m_HOME_CUR_UNIT = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_PARENT_COST_STATEMENT_NO = null;
		m_PARENT_ITEM_STOCK_UNIT = null;
		m_STOCK_UNIT = null;
		m_CLASIFICATION_CD = null;
		m_OUTSIDE_TYP = null;
		m_PROC_OUTSIDE_TYP = null;
		m_PROC_COST_CLS_CD = null;
		m_PROC_COST_CLS_NAME = null;
		m_PROC_COST_UNIT_QTY = null;
		m_PROC_COST_UNIT_QTY_UNIT = null;
		m_OWN_PROC_COST_01 = null;
		m_OWN_PROC_COST_02 = null;
		m_OWN_PROC_COST_03 = null;
		m_OWN_PROC_COST_04 = null;
		m_OWN_PROC_COST_05 = null;
		m_OWN_PROC_COST_06 = null;
		m_OWN_PROC_COST_07 = null;
		m_OWN_PROC_COST_08 = null;
		m_OWN_PROC_COST_09 = null;
		m_OWN_PROC_COST_10 = null;
		m_OWN_PROC_COST_11 = null;
		m_OWN_PROC_COST_12 = null;
		m_OWN_PROC_COST_SUM = null;
		m_TOTAL_PROC_COST_01 = null;
		m_TOTAL_PROC_COST_02 = null;
		m_TOTAL_PROC_COST_03 = null;
		m_TOTAL_PROC_COST_04 = null;
		m_TOTAL_PROC_COST_05 = null;
		m_TOTAL_PROC_COST_06 = null;
		m_TOTAL_PROC_COST_07 = null;
		m_TOTAL_PROC_COST_08 = null;
		m_TOTAL_PROC_COST_09 = null;
		m_TOTAL_PROC_COST_10 = null;
		m_TOTAL_PROC_COST_11 = null;
		m_TOTAL_PROC_COST_12 = null;
		m_TOTAL_PROC_COST_SUM = null;
		m_PROC_COST_01_NAME = null;
		m_PROC_COST_02_NAME = null;
		m_PROC_COST_03_NAME = null;
		m_PROC_COST_04_NAME = null;
		m_PROC_COST_05_NAME = null;
		m_PROC_COST_06_NAME = null;
		m_PROC_COST_07_NAME = null;
		m_PROC_COST_08_NAME = null;
		m_PROC_COST_09_NAME = null;
		m_PROC_COST_10_NAME = null;
		m_PROC_COST_11_NAME = null;
		m_PROC_COST_12_NAME = null;
		m_CURRENT_YEAR = null;

		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_DOWNLOAD_FILE = null;
		l_HALF_TERM_TYP_DN = null;
		l_COST_TYP_DN = null;
		l_OUTSIDE_TYP_DN = null;
		l_PROC_OUTSIDE_TYP_DN = null;
		l_TOTAL_MATR_COST = null;
		l_TOTAL_SBCNT_MATR_COST = null;
		l_TOTAL_PROC_COST_SUM_ALL = null;
		l_TOTAL_COST = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_ROOT_ITEM_CD = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PARENT_ITEM_CD = null;
		l_l_OUTSIDE_TYP_DN = null;
		l_l_PROC_OUTSIDE_TYP_DN = null;
		l_l_CLASIFICATION_CD = null;
		l_l_CS_PROC_CD = null;
		l_l_CS_PROC_NAME = null;
		l_l_NECESSARY_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_HOME_CUR_UNIT = null;
		l_l_OWN_MATR_COST = null;
		l_l_TOTAL_MATR_COST = null;
		l_l_OWN_SBCNT_MATR_COST = null;
		l_l_TOTAL_SBCNT_MATR_COST = null;
		l_l_OWN_PROC_COST_SUM_ALL = null;
		l_l_TOTAL_PROC_COST_SUM_ALL = null;
		l_COST_TYP = null;
		l_PLANT_NAME = null;
		l_ROOT_ITEM_NAME = null;
		l_PARENT_ITEM_CD = null;
		l_PARENT_ITEM_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_PS_EDITION = null;
		l_COST_STATEMENT_NO = null;
		l_CS_PROC_CD = null;
		l_CS_PROC_NAME = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_NECESSARY_QTY = null;
		l_PS_INPUT_RATIO = null;
		l_ITEM_INPUT_RATIO = null;
		l_OWN_MATR_COST = null;
		l_OWN_SBCNT_MATR_COST = null;
		l_OWN_PROC_COST_SUM_ALL = null;
		l_HOME_CUR_UNIT = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_PARENT_COST_STATEMENT_NO = null;
		l_PARENT_ITEM_STOCK_UNIT = null;
		l_STOCK_UNIT = null;
		l_CLASIFICATION_CD = null;
		l_OUTSIDE_TYP = null;
		l_PROC_OUTSIDE_TYP = null;
		l_PROC_COST_CLS_CD = null;
		l_PROC_COST_CLS_NAME = null;
		l_PROC_COST_UNIT_QTY = null;
		l_PROC_COST_UNIT_QTY_UNIT = null;
		l_OWN_PROC_COST_01 = null;
		l_OWN_PROC_COST_02 = null;
		l_OWN_PROC_COST_03 = null;
		l_OWN_PROC_COST_04 = null;
		l_OWN_PROC_COST_05 = null;
		l_OWN_PROC_COST_06 = null;
		l_OWN_PROC_COST_07 = null;
		l_OWN_PROC_COST_08 = null;
		l_OWN_PROC_COST_09 = null;
		l_OWN_PROC_COST_10 = null;
		l_OWN_PROC_COST_11 = null;
		l_OWN_PROC_COST_12 = null;
		l_OWN_PROC_COST_SUM = null;
		l_TOTAL_PROC_COST_01 = null;
		l_TOTAL_PROC_COST_02 = null;
		l_TOTAL_PROC_COST_03 = null;
		l_TOTAL_PROC_COST_04 = null;
		l_TOTAL_PROC_COST_05 = null;
		l_TOTAL_PROC_COST_06 = null;
		l_TOTAL_PROC_COST_07 = null;
		l_TOTAL_PROC_COST_08 = null;
		l_TOTAL_PROC_COST_09 = null;
		l_TOTAL_PROC_COST_10 = null;
		l_TOTAL_PROC_COST_11 = null;
		l_TOTAL_PROC_COST_12 = null;
		l_TOTAL_PROC_COST_SUM = null;
		l_PROC_COST_01_NAME = null;
		l_PROC_COST_02_NAME = null;
		l_PROC_COST_03_NAME = null;
		l_PROC_COST_04_NAME = null;
		l_PROC_COST_05_NAME = null;
		l_PROC_COST_06_NAME = null;
		l_PROC_COST_07_NAME = null;
		l_PROC_COST_08_NAME = null;
		l_PROC_COST_09_NAME = null;
		l_PROC_COST_10_NAME = null;
		l_PROC_COST_11_NAME = null;
		l_PROC_COST_12_NAME = null;
		l_CURRENT_YEAR = null;

		return;
	}

	//////////////////////////////
	// Orteus�W��Struct
	// ���[�U�R�[�h
	public String sUser_ID = null;
	// set/get���\�b�h
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// �g�D�R�[�h
	public String sOrganization_CD = null;
	// set/get���\�b�h
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// �������t
	public String sSysdate = null;
	// set/get���\�b�h
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medDD0010020�N���X�̕W���R���X�g���N�^
	 */
	public DD0010020Struct()
	{
		//{{user_implement_code_constractor
                 initialize();
                 // TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�E���X�g�����o����)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStruct(DD0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructM(DD0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setHALF_TERM_TYP_DN(struct.getHALF_TERM_TYP_DN());
			this.setCOST_TYP_DN(struct.getCOST_TYP_DN());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setPROC_OUTSIDE_TYP_DN(struct.getPROC_OUTSIDE_TYP_DN());
			this.setTOTAL_MATR_COST(struct.getTOTAL_MATR_COST());
			this.setTOTAL_SBCNT_MATR_COST(struct.getTOTAL_SBCNT_MATR_COST());
			this.setTOTAL_PROC_COST_SUM_ALL(struct.getTOTAL_PROC_COST_SUM_ALL());
			this.setTOTAL_COST(struct.getTOTAL_COST());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setROOT_ITEM_CD(struct.getROOT_ITEM_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PARENT_ITEM_CD(struct.getl_PARENT_ITEM_CD());
			this.setl_OUTSIDE_TYP_DN(struct.getl_OUTSIDE_TYP_DN());
			this.setl_PROC_OUTSIDE_TYP_DN(struct.getl_PROC_OUTSIDE_TYP_DN());
			this.setl_CLASIFICATION_CD(struct.getl_CLASIFICATION_CD());
			this.setl_CS_PROC_CD(struct.getl_CS_PROC_CD());
			this.setl_CS_PROC_NAME(struct.getl_CS_PROC_NAME());
			this.setl_NECESSARY_QTY(struct.getl_NECESSARY_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_HOME_CUR_UNIT(struct.getl_HOME_CUR_UNIT());
			this.setl_OWN_MATR_COST(struct.getl_OWN_MATR_COST());
			this.setl_TOTAL_MATR_COST(struct.getl_TOTAL_MATR_COST());
			this.setl_OWN_SBCNT_MATR_COST(struct.getl_OWN_SBCNT_MATR_COST());
			this.setl_TOTAL_SBCNT_MATR_COST(struct.getl_TOTAL_SBCNT_MATR_COST());
			this.setl_OWN_PROC_COST_SUM_ALL(struct.getl_OWN_PROC_COST_SUM_ALL());
			this.setl_TOTAL_PROC_COST_SUM_ALL(struct.getl_TOTAL_PROC_COST_SUM_ALL());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setROOT_ITEM_NAME(struct.getROOT_ITEM_NAME());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setCOST_STATEMENT_NO(struct.getCOST_STATEMENT_NO());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setNECESSARY_QTY(struct.getNECESSARY_QTY());
			this.setPS_INPUT_RATIO(struct.getPS_INPUT_RATIO());
			this.setITEM_INPUT_RATIO(struct.getITEM_INPUT_RATIO());
			this.setOWN_MATR_COST(struct.getOWN_MATR_COST());
			this.setOWN_SBCNT_MATR_COST(struct.getOWN_SBCNT_MATR_COST());
			this.setOWN_PROC_COST_SUM_ALL(struct.getOWN_PROC_COST_SUM_ALL());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setPARENT_COST_STATEMENT_NO(struct.getPARENT_COST_STATEMENT_NO());
			this.setPARENT_ITEM_STOCK_UNIT(struct.getPARENT_ITEM_STOCK_UNIT());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setPROC_OUTSIDE_TYP(struct.getPROC_OUTSIDE_TYP());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setPROC_COST_CLS_NAME(struct.getPROC_COST_CLS_NAME());
			this.setPROC_COST_UNIT_QTY(struct.getPROC_COST_UNIT_QTY());
			this.setPROC_COST_UNIT_QTY_UNIT(struct.getPROC_COST_UNIT_QTY_UNIT());
			this.setOWN_PROC_COST_01(struct.getOWN_PROC_COST_01());
			this.setOWN_PROC_COST_02(struct.getOWN_PROC_COST_02());
			this.setOWN_PROC_COST_03(struct.getOWN_PROC_COST_03());
			this.setOWN_PROC_COST_04(struct.getOWN_PROC_COST_04());
			this.setOWN_PROC_COST_05(struct.getOWN_PROC_COST_05());
			this.setOWN_PROC_COST_06(struct.getOWN_PROC_COST_06());
			this.setOWN_PROC_COST_07(struct.getOWN_PROC_COST_07());
			this.setOWN_PROC_COST_08(struct.getOWN_PROC_COST_08());
			this.setOWN_PROC_COST_09(struct.getOWN_PROC_COST_09());
			this.setOWN_PROC_COST_10(struct.getOWN_PROC_COST_10());
			this.setOWN_PROC_COST_11(struct.getOWN_PROC_COST_11());
			this.setOWN_PROC_COST_12(struct.getOWN_PROC_COST_12());
			this.setOWN_PROC_COST_SUM(struct.getOWN_PROC_COST_SUM());
			this.setTOTAL_PROC_COST_01(struct.getTOTAL_PROC_COST_01());
			this.setTOTAL_PROC_COST_02(struct.getTOTAL_PROC_COST_02());
			this.setTOTAL_PROC_COST_03(struct.getTOTAL_PROC_COST_03());
			this.setTOTAL_PROC_COST_04(struct.getTOTAL_PROC_COST_04());
			this.setTOTAL_PROC_COST_05(struct.getTOTAL_PROC_COST_05());
			this.setTOTAL_PROC_COST_06(struct.getTOTAL_PROC_COST_06());
			this.setTOTAL_PROC_COST_07(struct.getTOTAL_PROC_COST_07());
			this.setTOTAL_PROC_COST_08(struct.getTOTAL_PROC_COST_08());
			this.setTOTAL_PROC_COST_09(struct.getTOTAL_PROC_COST_09());
			this.setTOTAL_PROC_COST_10(struct.getTOTAL_PROC_COST_10());
			this.setTOTAL_PROC_COST_11(struct.getTOTAL_PROC_COST_11());
			this.setTOTAL_PROC_COST_12(struct.getTOTAL_PROC_COST_12());
			this.setTOTAL_PROC_COST_SUM(struct.getTOTAL_PROC_COST_SUM());
			this.setPROC_COST_01_NAME(struct.getPROC_COST_01_NAME());
			this.setPROC_COST_02_NAME(struct.getPROC_COST_02_NAME());
			this.setPROC_COST_03_NAME(struct.getPROC_COST_03_NAME());
			this.setPROC_COST_04_NAME(struct.getPROC_COST_04_NAME());
			this.setPROC_COST_05_NAME(struct.getPROC_COST_05_NAME());
			this.setPROC_COST_06_NAME(struct.getPROC_COST_06_NAME());
			this.setPROC_COST_07_NAME(struct.getPROC_COST_07_NAME());
			this.setPROC_COST_08_NAME(struct.getPROC_COST_08_NAME());
			this.setPROC_COST_09_NAME(struct.getPROC_COST_09_NAME());
			this.setPROC_COST_10_NAME(struct.getPROC_COST_10_NAME());
			this.setPROC_COST_11_NAME(struct.getPROC_COST_11_NAME());
			this.setPROC_COST_12_NAME(struct.getPROC_COST_12_NAME());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DD0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_HALF_TERM_TYP_DN(struct.getList_HALF_TERM_TYP_DN());
			this.setList_COST_TYP_DN(struct.getList_COST_TYP_DN());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_PROC_OUTSIDE_TYP_DN(struct.getList_PROC_OUTSIDE_TYP_DN());
			this.setList_TOTAL_MATR_COST(struct.getList_TOTAL_MATR_COST());
			this.setList_TOTAL_SBCNT_MATR_COST(struct.getList_TOTAL_SBCNT_MATR_COST());
			this.setList_TOTAL_PROC_COST_SUM_ALL(struct.getList_TOTAL_PROC_COST_SUM_ALL());
			this.setList_TOTAL_COST(struct.getList_TOTAL_COST());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_ROOT_ITEM_CD(struct.getList_ROOT_ITEM_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PARENT_ITEM_CD(struct.getList_l_PARENT_ITEM_CD());
			this.setList_l_OUTSIDE_TYP_DN(struct.getList_l_OUTSIDE_TYP_DN());
			this.setList_l_PROC_OUTSIDE_TYP_DN(struct.getList_l_PROC_OUTSIDE_TYP_DN());
			this.setList_l_CLASIFICATION_CD(struct.getList_l_CLASIFICATION_CD());
			this.setList_l_CS_PROC_CD(struct.getList_l_CS_PROC_CD());
			this.setList_l_CS_PROC_NAME(struct.getList_l_CS_PROC_NAME());
			this.setList_l_NECESSARY_QTY(struct.getList_l_NECESSARY_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_HOME_CUR_UNIT(struct.getList_l_HOME_CUR_UNIT());
			this.setList_l_OWN_MATR_COST(struct.getList_l_OWN_MATR_COST());
			this.setList_l_TOTAL_MATR_COST(struct.getList_l_TOTAL_MATR_COST());
			this.setList_l_OWN_SBCNT_MATR_COST(struct.getList_l_OWN_SBCNT_MATR_COST());
			this.setList_l_TOTAL_SBCNT_MATR_COST(struct.getList_l_TOTAL_SBCNT_MATR_COST());
			this.setList_l_OWN_PROC_COST_SUM_ALL(struct.getList_l_OWN_PROC_COST_SUM_ALL());
			this.setList_l_TOTAL_PROC_COST_SUM_ALL(struct.getList_l_TOTAL_PROC_COST_SUM_ALL());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_ROOT_ITEM_NAME(struct.getList_ROOT_ITEM_NAME());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_COST_STATEMENT_NO(struct.getList_COST_STATEMENT_NO());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_NECESSARY_QTY(struct.getList_NECESSARY_QTY());
			this.setList_PS_INPUT_RATIO(struct.getList_PS_INPUT_RATIO());
			this.setList_ITEM_INPUT_RATIO(struct.getList_ITEM_INPUT_RATIO());
			this.setList_OWN_MATR_COST(struct.getList_OWN_MATR_COST());
			this.setList_OWN_SBCNT_MATR_COST(struct.getList_OWN_SBCNT_MATR_COST());
			this.setList_OWN_PROC_COST_SUM_ALL(struct.getList_OWN_PROC_COST_SUM_ALL());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_PARENT_COST_STATEMENT_NO(struct.getList_PARENT_COST_STATEMENT_NO());
			this.setList_PARENT_ITEM_STOCK_UNIT(struct.getList_PARENT_ITEM_STOCK_UNIT());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_PROC_OUTSIDE_TYP(struct.getList_PROC_OUTSIDE_TYP());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_PROC_COST_CLS_NAME(struct.getList_PROC_COST_CLS_NAME());
			this.setList_PROC_COST_UNIT_QTY(struct.getList_PROC_COST_UNIT_QTY());
			this.setList_PROC_COST_UNIT_QTY_UNIT(struct.getList_PROC_COST_UNIT_QTY_UNIT());
			this.setList_OWN_PROC_COST_01(struct.getList_OWN_PROC_COST_01());
			this.setList_OWN_PROC_COST_02(struct.getList_OWN_PROC_COST_02());
			this.setList_OWN_PROC_COST_03(struct.getList_OWN_PROC_COST_03());
			this.setList_OWN_PROC_COST_04(struct.getList_OWN_PROC_COST_04());
			this.setList_OWN_PROC_COST_05(struct.getList_OWN_PROC_COST_05());
			this.setList_OWN_PROC_COST_06(struct.getList_OWN_PROC_COST_06());
			this.setList_OWN_PROC_COST_07(struct.getList_OWN_PROC_COST_07());
			this.setList_OWN_PROC_COST_08(struct.getList_OWN_PROC_COST_08());
			this.setList_OWN_PROC_COST_09(struct.getList_OWN_PROC_COST_09());
			this.setList_OWN_PROC_COST_10(struct.getList_OWN_PROC_COST_10());
			this.setList_OWN_PROC_COST_11(struct.getList_OWN_PROC_COST_11());
			this.setList_OWN_PROC_COST_12(struct.getList_OWN_PROC_COST_12());
			this.setList_OWN_PROC_COST_SUM(struct.getList_OWN_PROC_COST_SUM());
			this.setList_TOTAL_PROC_COST_01(struct.getList_TOTAL_PROC_COST_01());
			this.setList_TOTAL_PROC_COST_02(struct.getList_TOTAL_PROC_COST_02());
			this.setList_TOTAL_PROC_COST_03(struct.getList_TOTAL_PROC_COST_03());
			this.setList_TOTAL_PROC_COST_04(struct.getList_TOTAL_PROC_COST_04());
			this.setList_TOTAL_PROC_COST_05(struct.getList_TOTAL_PROC_COST_05());
			this.setList_TOTAL_PROC_COST_06(struct.getList_TOTAL_PROC_COST_06());
			this.setList_TOTAL_PROC_COST_07(struct.getList_TOTAL_PROC_COST_07());
			this.setList_TOTAL_PROC_COST_08(struct.getList_TOTAL_PROC_COST_08());
			this.setList_TOTAL_PROC_COST_09(struct.getList_TOTAL_PROC_COST_09());
			this.setList_TOTAL_PROC_COST_10(struct.getList_TOTAL_PROC_COST_10());
			this.setList_TOTAL_PROC_COST_11(struct.getList_TOTAL_PROC_COST_11());
			this.setList_TOTAL_PROC_COST_12(struct.getList_TOTAL_PROC_COST_12());
			this.setList_TOTAL_PROC_COST_SUM(struct.getList_TOTAL_PROC_COST_SUM());
			this.setList_PROC_COST_01_NAME(struct.getList_PROC_COST_01_NAME());
			this.setList_PROC_COST_02_NAME(struct.getList_PROC_COST_02_NAME());
			this.setList_PROC_COST_03_NAME(struct.getList_PROC_COST_03_NAME());
			this.setList_PROC_COST_04_NAME(struct.getList_PROC_COST_04_NAME());
			this.setList_PROC_COST_05_NAME(struct.getList_PROC_COST_05_NAME());
			this.setList_PROC_COST_06_NAME(struct.getList_PROC_COST_06_NAME());
			this.setList_PROC_COST_07_NAME(struct.getList_PROC_COST_07_NAME());
			this.setList_PROC_COST_08_NAME(struct.getList_PROC_COST_08_NAME());
			this.setList_PROC_COST_09_NAME(struct.getList_PROC_COST_09_NAME());
			this.setList_PROC_COST_10_NAME(struct.getList_PROC_COST_10_NAME());
			this.setList_PROC_COST_11_NAME(struct.getList_PROC_COST_11_NAME());
			this.setList_PROC_COST_12_NAME(struct.getList_PROC_COST_12_NAME());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
		}
	}

	/**
	 * �I�u�W�F�N�g�̕�����\����Ԃ��܂��B
	 * �����ł́AgetXXXX�Ŏ擾�ł��邱�̃N���X�̑����l�i���X�g�͏����j��Ԃ��܂��B
	 * @return �I�u�W�F�N�g�̕�����\��
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
	// �����l��`
	// �ȉ��ɏ������Ɏg���萔�̎Q�l�Ƃ��čĐ����̂��тɎ����I�ɑS�����o�[�̃T���v�����R�����g�A�E�g���ďo�͂��Ă��܂��B
/*
	// �� 1 �ϐ������l�F i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// �� 2 �ϐ������l�F i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// �� 3 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 4 �ϐ������l�F i_HALF_TERM_TYP_DN


	final static String i_HALF_TERM_TYP_DN = null;

	// �� 5 �ϐ������l�F i_COST_TYP_DN


	final static String i_COST_TYP_DN = null;

	// �� 6 �ϐ������l�F i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// �� 7 �ϐ������l�F i_PROC_OUTSIDE_TYP_DN


	final static String i_PROC_OUTSIDE_TYP_DN = null;

	// �� 8 �ϐ������l�F i_TOTAL_MATR_COST


	final static String i_TOTAL_MATR_COST = null;

	// �� 9 �ϐ������l�F i_TOTAL_SBCNT_MATR_COST


	final static String i_TOTAL_SBCNT_MATR_COST = null;

	// �� 10 �ϐ������l�F i_TOTAL_PROC_COST_SUM_ALL


	final static String i_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 11 �ϐ������l�F i_TOTAL_COST


	final static String i_TOTAL_COST = null;

	// �� 12 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 13 �ϐ������l�F i_YEAR


	final static String i_YEAR = null;

	// �� 14 �ϐ������l�F i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// �� 15 �ϐ������l�F i_ROOT_ITEM_CD


	final static String i_ROOT_ITEM_CD = null;

	// �� 16 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 18 �ϐ������l�F i_l_PARENT_ITEM_CD


	final static String i_l_PARENT_ITEM_CD = null;

	// �� 19 �ϐ������l�F i_l_OUTSIDE_TYP_DN


	final static String i_l_OUTSIDE_TYP_DN = null;

	// �� 20 �ϐ������l�F i_l_PROC_OUTSIDE_TYP_DN


	final static String i_l_PROC_OUTSIDE_TYP_DN = null;

	// �� 21 �ϐ������l�F i_l_CLASIFICATION_CD


	final static String i_l_CLASIFICATION_CD = null;

	// �� 22 �ϐ������l�F i_l_CS_PROC_CD


	final static String i_l_CS_PROC_CD = null;

	// �� 23 �ϐ������l�F i_l_CS_PROC_NAME


	final static String i_l_CS_PROC_NAME = null;

	// �� 24 �ϐ������l�F i_l_NECESSARY_QTY


	final static String i_l_NECESSARY_QTY = null;

	// �� 25 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 26 �ϐ������l�F i_l_HOME_CUR_UNIT


	final static String i_l_HOME_CUR_UNIT = null;

	// �� 27 �ϐ������l�F i_l_OWN_MATR_COST


	final static String i_l_OWN_MATR_COST = null;

	// �� 28 �ϐ������l�F i_l_TOTAL_MATR_COST


	final static String i_l_TOTAL_MATR_COST = null;

	// �� 29 �ϐ������l�F i_l_OWN_SBCNT_MATR_COST


	final static String i_l_OWN_SBCNT_MATR_COST = null;

	// �� 30 �ϐ������l�F i_l_TOTAL_SBCNT_MATR_COST


	final static String i_l_TOTAL_SBCNT_MATR_COST = null;

	// �� 31 �ϐ������l�F i_l_OWN_PROC_COST_SUM_ALL


	final static String i_l_OWN_PROC_COST_SUM_ALL = null;

	// �� 32 �ϐ������l�F i_l_TOTAL_PROC_COST_SUM_ALL


	final static String i_l_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 33 �ϐ������l�F i_COST_TYP


	final static String i_COST_TYP = null;

	// �� 34 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 35 �ϐ������l�F i_ROOT_ITEM_NAME


	final static String i_ROOT_ITEM_NAME = null;

	// �� 36 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 39 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 40 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 41 �ϐ������l�F i_COST_STATEMENT_NO


	final static String i_COST_STATEMENT_NO = null;

	// �� 42 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 43 �ϐ������l�F i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// �� 44 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 45 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 46 �ϐ������l�F i_ORG_CD


	final static String i_ORG_CD = null;

	// �� 47 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 48 �ϐ������l�F i_NECESSARY_QTY


	final static String i_NECESSARY_QTY = null;

	// �� 49 �ϐ������l�F i_PS_INPUT_RATIO


	final static String i_PS_INPUT_RATIO = null;

	// �� 50 �ϐ������l�F i_ITEM_INPUT_RATIO


	final static String i_ITEM_INPUT_RATIO = null;

	// �� 51 �ϐ������l�F i_OWN_MATR_COST


	final static String i_OWN_MATR_COST = null;

	// �� 52 �ϐ������l�F i_OWN_SBCNT_MATR_COST


	final static String i_OWN_SBCNT_MATR_COST = null;

	// �� 53 �ϐ������l�F i_OWN_PROC_COST_SUM_ALL


	final static String i_OWN_PROC_COST_SUM_ALL = null;

	// �� 54 �ϐ������l�F i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// �� 55 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 56 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 57 �ϐ������l�F i_PARENT_COST_STATEMENT_NO


	final static String i_PARENT_COST_STATEMENT_NO = null;

	// �� 58 �ϐ������l�F i_PARENT_ITEM_STOCK_UNIT


	final static String i_PARENT_ITEM_STOCK_UNIT = null;

	// �� 59 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 60 �ϐ������l�F i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// �� 61 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 62 �ϐ������l�F i_PROC_OUTSIDE_TYP


	final static String i_PROC_OUTSIDE_TYP = null;

	// �� 63 �ϐ������l�F i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// �� 64 �ϐ������l�F i_PROC_COST_CLS_NAME


	final static String i_PROC_COST_CLS_NAME = null;

	// �� 65 �ϐ������l�F i_PROC_COST_UNIT_QTY


	final static String i_PROC_COST_UNIT_QTY = null;

	// �� 66 �ϐ������l�F i_PROC_COST_UNIT_QTY_UNIT


	final static String i_PROC_COST_UNIT_QTY_UNIT = null;

	// �� 67 �ϐ������l�F i_OWN_PROC_COST_01


	final static String i_OWN_PROC_COST_01 = null;

	// �� 68 �ϐ������l�F i_OWN_PROC_COST_02


	final static String i_OWN_PROC_COST_02 = null;

	// �� 69 �ϐ������l�F i_OWN_PROC_COST_03


	final static String i_OWN_PROC_COST_03 = null;

	// �� 70 �ϐ������l�F i_OWN_PROC_COST_04


	final static String i_OWN_PROC_COST_04 = null;

	// �� 71 �ϐ������l�F i_OWN_PROC_COST_05


	final static String i_OWN_PROC_COST_05 = null;

	// �� 72 �ϐ������l�F i_OWN_PROC_COST_06


	final static String i_OWN_PROC_COST_06 = null;

	// �� 73 �ϐ������l�F i_OWN_PROC_COST_07


	final static String i_OWN_PROC_COST_07 = null;

	// �� 74 �ϐ������l�F i_OWN_PROC_COST_08


	final static String i_OWN_PROC_COST_08 = null;

	// �� 75 �ϐ������l�F i_OWN_PROC_COST_09


	final static String i_OWN_PROC_COST_09 = null;

	// �� 76 �ϐ������l�F i_OWN_PROC_COST_10


	final static String i_OWN_PROC_COST_10 = null;

	// �� 77 �ϐ������l�F i_OWN_PROC_COST_11


	final static String i_OWN_PROC_COST_11 = null;

	// �� 78 �ϐ������l�F i_OWN_PROC_COST_12


	final static String i_OWN_PROC_COST_12 = null;

	// �� 79 �ϐ������l�F i_OWN_PROC_COST_SUM


	final static String i_OWN_PROC_COST_SUM = null;

	// �� 80 �ϐ������l�F i_TOTAL_PROC_COST_01


	final static String i_TOTAL_PROC_COST_01 = null;

	// �� 81 �ϐ������l�F i_TOTAL_PROC_COST_02


	final static String i_TOTAL_PROC_COST_02 = null;

	// �� 82 �ϐ������l�F i_TOTAL_PROC_COST_03


	final static String i_TOTAL_PROC_COST_03 = null;

	// �� 83 �ϐ������l�F i_TOTAL_PROC_COST_04


	final static String i_TOTAL_PROC_COST_04 = null;

	// �� 84 �ϐ������l�F i_TOTAL_PROC_COST_05


	final static String i_TOTAL_PROC_COST_05 = null;

	// �� 85 �ϐ������l�F i_TOTAL_PROC_COST_06


	final static String i_TOTAL_PROC_COST_06 = null;

	// �� 86 �ϐ������l�F i_TOTAL_PROC_COST_07


	final static String i_TOTAL_PROC_COST_07 = null;

	// �� 87 �ϐ������l�F i_TOTAL_PROC_COST_08


	final static String i_TOTAL_PROC_COST_08 = null;

	// �� 88 �ϐ������l�F i_TOTAL_PROC_COST_09


	final static String i_TOTAL_PROC_COST_09 = null;

	// �� 89 �ϐ������l�F i_TOTAL_PROC_COST_10


	final static String i_TOTAL_PROC_COST_10 = null;

	// �� 90 �ϐ������l�F i_TOTAL_PROC_COST_11


	final static String i_TOTAL_PROC_COST_11 = null;

	// �� 91 �ϐ������l�F i_TOTAL_PROC_COST_12


	final static String i_TOTAL_PROC_COST_12 = null;

	// �� 92 �ϐ������l�F i_TOTAL_PROC_COST_SUM


	final static String i_TOTAL_PROC_COST_SUM = null;

	// �� 93 �ϐ������l�F i_PROC_COST_01_NAME


	final static String i_PROC_COST_01_NAME = null;

	// �� 94 �ϐ������l�F i_PROC_COST_02_NAME


	final static String i_PROC_COST_02_NAME = null;

	// �� 95 �ϐ������l�F i_PROC_COST_03_NAME


	final static String i_PROC_COST_03_NAME = null;

	// �� 96 �ϐ������l�F i_PROC_COST_04_NAME


	final static String i_PROC_COST_04_NAME = null;

	// �� 97 �ϐ������l�F i_PROC_COST_05_NAME


	final static String i_PROC_COST_05_NAME = null;

	// �� 98 �ϐ������l�F i_PROC_COST_06_NAME


	final static String i_PROC_COST_06_NAME = null;

	// �� 99 �ϐ������l�F i_PROC_COST_07_NAME


	final static String i_PROC_COST_07_NAME = null;

	// �� 100 �ϐ������l�F i_PROC_COST_08_NAME


	final static String i_PROC_COST_08_NAME = null;

	// �� 101 �ϐ������l�F i_PROC_COST_09_NAME


	final static String i_PROC_COST_09_NAME = null;

	// �� 102 �ϐ������l�F i_PROC_COST_10_NAME


	final static String i_PROC_COST_10_NAME = null;

	// �� 103 �ϐ������l�F i_PROC_COST_11_NAME


	final static String i_PROC_COST_11_NAME = null;

	// �� 104 �ϐ������l�F i_PROC_COST_12_NAME


	final static String i_PROC_COST_12_NAME = null;

	// �� 105 �ϐ������l�F i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_TOTAL_MATR_COST
        final static String i_TOTAL_MATR_COST = null;
        // �� 2 �ϐ������l�F i_TOTAL_SBCNT_MATR_COST
        final static String i_TOTAL_SBCNT_MATR_COST = null;
        // �� 3 �ϐ������l�F i_TOTAL_PROC_COST_SUM_ALL
        final static String i_TOTAL_PROC_COST_SUM_ALL = null;
        // �� 4 �ϐ������l�F i_TOTAL_COST
        final static String i_TOTAL_COST = null;
        // �� 5 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 6 �ϐ������l�F i_YEAR
        final static String i_YEAR = null;
        // �� 7 �ϐ������l�F i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // �� 8 �ϐ������l�F i_ROOT_ITEM_CD
        final static String i_ROOT_ITEM_CD = null;
        // �� 9 �ϐ������l�F i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // �� 10 �ϐ������l�F i_l_ITEM_NAME
        final static String i_l_ITEM_NAME = null;
        // �� 11 �ϐ������l�F i_l_PARENT_ITEM_CD
        final static String i_l_PARENT_ITEM_CD = null;
        // �� 12 �ϐ������l�F i_l_OUTSIDE_TYP_DN
        final static String i_l_OUTSIDE_TYP_DN = null;
        // �� 13 �ϐ������l�F i_l_PROC_OUTSIDE_TYP_DN
        final static String i_l_PROC_OUTSIDE_TYP_DN = null;
        // �� 14 �ϐ������l�F i_l_CLASIFICATION_CD
        final static String i_l_CLASIFICATION_CD = null;
        // �� 15 �ϐ������l�F i_l_CS_PROC_CD
        final static String i_l_CS_PROC_CD = null;
        // �� 16 �ϐ������l�F i_l_CS_PROC_NAME
        final static String i_l_CS_PROC_NAME = null;
        // �� 17 �ϐ������l�F i_l_NECESSARY_QTY
        final static String i_l_NECESSARY_QTY = null;
        // �� 18 �ϐ������l�F i_l_STOCK_UNIT
        final static String i_l_STOCK_UNIT = null;
        // �� 19 �ϐ������l�F i_l_HOME_CUR_UNIT
        final static String i_l_HOME_CUR_UNIT = null;
        // �� 20 �ϐ������l�F i_l_OWN_MATR_COST
        final static String i_l_OWN_MATR_COST = null;
        // �� 21 �ϐ������l�F i_l_TOTAL_MATR_COST
        final static String i_l_TOTAL_MATR_COST = null;
        // �� 22 �ϐ������l�F i_l_OWN_SBCNT_MATR_COST
        final static String i_l_OWN_SBCNT_MATR_COST = null;
        // �� 23 �ϐ������l�F i_l_TOTAL_SBCNT_MATR_COST
        final static String i_l_TOTAL_SBCNT_MATR_COST = null;
        // �� 24 �ϐ������l�F i_l_OWN_PROC_COST_SUM_ALL
        final static String i_l_OWN_PROC_COST_SUM_ALL = null;
        // �� 25 �ϐ������l�F i_l_TOTAL_PROC_COST_SUM_ALL
        final static String i_l_TOTAL_PROC_COST_SUM_ALL = null;
        // �� 26 �ϐ������l�F i_HALF_TERM_TYP_DN
        final static String i_HALF_TERM_TYP_DN = null;
        // �� 27 �ϐ������l�F i_COST_TYP
        final static String i_COST_TYP = null;
        // �� 28 �ϐ������l�F i_COST_TYP_DN
        final static String i_COST_TYP_DN = null;
        // �� 29 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 30 �ϐ������l�F i_ROOT_ITEM_NAME
        final static String i_ROOT_ITEM_NAME = null;
        // �� 31 �ϐ������l�F i_PARENT_ITEM_CD
        final static String i_PARENT_ITEM_CD = null;
        // �� 32 �ϐ������l�F i_PARENT_ITEM_NAME
        final static String i_PARENT_ITEM_NAME = null;
        // �� 33 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 34 �ϐ������l�F i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // �� 35 �ϐ������l�F i_PS_EDITION
        final static String i_PS_EDITION = null;
        // �� 36 �ϐ������l�F i_COST_STATEMENT_NO
        final static String i_COST_STATEMENT_NO = null;
        // �� 37 �ϐ������l�F i_CS_PROC_CD
        final static String i_CS_PROC_CD = null;
        // �� 38 �ϐ������l�F i_CS_PROC_NAME
        final static String i_CS_PROC_NAME = null;
        // �� 39 �ϐ������l�F i_WS_CD
        final static String i_WS_CD = null;
        // �� 40 �ϐ������l�F i_WS_NAME
        final static String i_WS_NAME = null;
        // �� 41 �ϐ������l�F i_ORG_CD
        final static String i_ORG_CD = null;
        // �� 42 �ϐ������l�F i_ORG_NAME
        final static String i_ORG_NAME = null;
        // �� 43 �ϐ������l�F i_NECESSARY_QTY
        final static String i_NECESSARY_QTY = null;
        // �� 44 �ϐ������l�F i_PS_INPUT_RATIO
        final static String i_PS_INPUT_RATIO = null;
        // �� 45 �ϐ������l�F i_ITEM_INPUT_RATIO
        final static String i_ITEM_INPUT_RATIO = null;
        // �� 46 �ϐ������l�F i_OWN_MATR_COST
        final static String i_OWN_MATR_COST = null;
        // �� 47 �ϐ������l�F i_OWN_SBCNT_MATR_COST
        final static String i_OWN_SBCNT_MATR_COST = null;
        // �� 48 �ϐ������l�F i_OWN_PROC_COST_SUM_ALL
        final static String i_OWN_PROC_COST_SUM_ALL = null;
        // �� 49 �ϐ������l�F i_HOME_CUR_UNIT
        final static String i_HOME_CUR_UNIT = null;
        // �� 50 �ϐ������l�F i_EFF_PHASE_IN_DATE
        final static String i_EFF_PHASE_IN_DATE = null;
        // �� 51 �ϐ������l�F i_EFF_PHASE_OUT_DATE
        final static String i_EFF_PHASE_OUT_DATE = null;
        // �� 52 �ϐ������l�F i_PARENT_COST_STATEMENT_NO
        final static String i_PARENT_COST_STATEMENT_NO = null;
        // �� 53 �ϐ������l�F i_PARENT_ITEM_STOCK_UNIT
        final static String i_PARENT_ITEM_STOCK_UNIT = null;
        // �� 54 �ϐ������l�F i_STOCK_UNIT
        final static String i_STOCK_UNIT = null;
        // �� 55 �ϐ������l�F i_CLASIFICATION_CD
        final static String i_CLASIFICATION_CD = null;
        // �� 56 �ϐ������l�F i_OUTSIDE_TYP
        final static String i_OUTSIDE_TYP = null;
        // �� 57 �ϐ������l�F i_OUTSIDE_TYP_DN
        final static String i_OUTSIDE_TYP_DN = null;
        // �� 58 �ϐ������l�F i_PROC_OUTSIDE_TYP
        final static String i_PROC_OUTSIDE_TYP = null;
        // �� 59 �ϐ������l�F i_PROC_OUTSIDE_TYP_DN
        final static String i_PROC_OUTSIDE_TYP_DN = null;
        // �� 60 �ϐ������l�F i_PROC_COST_CLS_CD
        final static String i_PROC_COST_CLS_CD = null;
        // �� 61 �ϐ������l�F i_PROC_COST_CLS_NAME
        final static String i_PROC_COST_CLS_NAME = null;
        // �� 62 �ϐ������l�F i_PROC_COST_UNIT_QTY
        final static String i_PROC_COST_UNIT_QTY = null;
        // �� 63 �ϐ������l�F i_PROC_COST_UNIT_QTY_UNIT
        final static String i_PROC_COST_UNIT_QTY_UNIT = null;
        // �� 64 �ϐ������l�F i_OWN_PROC_COST_01
        final static String i_OWN_PROC_COST_01 = null;
        // �� 65 �ϐ������l�F i_OWN_PROC_COST_02
        final static String i_OWN_PROC_COST_02 = null;
        // �� 66 �ϐ������l�F i_OWN_PROC_COST_03
        final static String i_OWN_PROC_COST_03 = null;
        // �� 67 �ϐ������l�F i_OWN_PROC_COST_04
        final static String i_OWN_PROC_COST_04 = null;
        // �� 68 �ϐ������l�F i_OWN_PROC_COST_05
        final static String i_OWN_PROC_COST_05 = null;
        // �� 69 �ϐ������l�F i_OWN_PROC_COST_06
        final static String i_OWN_PROC_COST_06 = null;
        // �� 70 �ϐ������l�F i_OWN_PROC_COST_07
        final static String i_OWN_PROC_COST_07 = null;
        // �� 71 �ϐ������l�F i_OWN_PROC_COST_08
        final static String i_OWN_PROC_COST_08 = null;
        // �� 72 �ϐ������l�F i_OWN_PROC_COST_09
        final static String i_OWN_PROC_COST_09 = null;
        // �� 73 �ϐ������l�F i_OWN_PROC_COST_10
        final static String i_OWN_PROC_COST_10 = null;
        // �� 74 �ϐ������l�F i_OWN_PROC_COST_11
        final static String i_OWN_PROC_COST_11 = null;
        // �� 75 �ϐ������l�F i_OWN_PROC_COST_12
        final static String i_OWN_PROC_COST_12 = null;
        // �� 76 �ϐ������l�F i_OWN_PROC_COST_SUM
        final static String i_OWN_PROC_COST_SUM = null;
        // �� 77 �ϐ������l�F i_TOTAL_PROC_COST_01
        final static String i_TOTAL_PROC_COST_01 = null;
        // �� 78 �ϐ������l�F i_TOTAL_PROC_COST_02
        final static String i_TOTAL_PROC_COST_02 = null;
        // �� 79 �ϐ������l�F i_TOTAL_PROC_COST_03
        final static String i_TOTAL_PROC_COST_03 = null;
        // �� 80 �ϐ������l�F i_TOTAL_PROC_COST_04
        final static String i_TOTAL_PROC_COST_04 = null;
        // �� 81 �ϐ������l�F i_TOTAL_PROC_COST_05
        final static String i_TOTAL_PROC_COST_05 = null;
        // �� 82 �ϐ������l�F i_TOTAL_PROC_COST_06
        final static String i_TOTAL_PROC_COST_06 = null;
        // �� 83 �ϐ������l�F i_TOTAL_PROC_COST_07
        final static String i_TOTAL_PROC_COST_07 = null;
        // �� 84 �ϐ������l�F i_TOTAL_PROC_COST_08
        final static String i_TOTAL_PROC_COST_08 = null;
        // �� 85 �ϐ������l�F i_TOTAL_PROC_COST_09
        final static String i_TOTAL_PROC_COST_09 = null;
        // �� 86 �ϐ������l�F i_TOTAL_PROC_COST_10
        final static String i_TOTAL_PROC_COST_10 = null;
        // �� 87 �ϐ������l�F i_TOTAL_PROC_COST_11
        final static String i_TOTAL_PROC_COST_11 = null;
        // �� 88 �ϐ������l�F i_TOTAL_PROC_COST_12
        final static String i_TOTAL_PROC_COST_12 = null;
        // �� 89 �ϐ������l�F i_TOTAL_PROC_COST_SUM
        final static String i_TOTAL_PROC_COST_SUM = null;
        // �� 90 �ϐ������l�F i_PROC_COST_01_NAME
        final static String i_PROC_COST_01_NAME = null;
        // �� 91 �ϐ������l�F i_PROC_COST_02_NAME
        final static String i_PROC_COST_02_NAME = null;
        // �� 92 �ϐ������l�F i_PROC_COST_03_NAME
        final static String i_PROC_COST_03_NAME = null;
        // �� 93 �ϐ������l�F i_PROC_COST_04_NAME
        final static String i_PROC_COST_04_NAME = null;
        // �� 94 �ϐ������l�F i_PROC_COST_05_NAME
        final static String i_PROC_COST_05_NAME = null;
        // �� 95 �ϐ������l�F i_PROC_COST_06_NAME
        final static String i_PROC_COST_06_NAME = null;
        // �� 96 �ϐ������l�F i_PROC_COST_07_NAME
        final static String i_PROC_COST_07_NAME = null;
        // �� 97 �ϐ������l�F i_PROC_COST_08_NAME
        final static String i_PROC_COST_08_NAME = null;
        // �� 98 �ϐ������l�F i_PROC_COST_09_NAME
        final static String i_PROC_COST_09_NAME = null;
        // �� 99 �ϐ������l�F i_PROC_COST_10_NAME
        final static String i_PROC_COST_10_NAME = null;
        // �� 100 �ϐ������l�F i_PROC_COST_11_NAME
        final static String i_PROC_COST_11_NAME = null;
        // �� 101 �ϐ������l�F i_PROC_COST_12_NAME
        final static String i_PROC_COST_12_NAME = null;
        // �� 102 �ϐ������l�F i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // �� 103 �ϐ������l�F i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // �� 104 �ϐ������l�F i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // �� 105 �ϐ������l�F i_DOWNLOAD_FILE
        final static String i_DOWNLOAD_FILE = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_TOTAL_MATR_COST = i_TOTAL_MATR_COST;
         m_TOTAL_SBCNT_MATR_COST = i_TOTAL_SBCNT_MATR_COST;
         m_TOTAL_PROC_COST_SUM_ALL = i_TOTAL_PROC_COST_SUM_ALL;
         m_TOTAL_COST = i_TOTAL_COST;
         m_PLANT_CD = i_PLANT_CD;
         m_YEAR = i_YEAR;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_ROOT_ITEM_CD = i_ROOT_ITEM_CD;
         m_l_ITEM_CD = i_l_ITEM_CD;
         m_l_ITEM_NAME = i_l_ITEM_NAME;
         m_l_PARENT_ITEM_CD = i_l_PARENT_ITEM_CD;
         m_l_OUTSIDE_TYP_DN = i_l_OUTSIDE_TYP_DN;
         m_l_PROC_OUTSIDE_TYP_DN = i_l_PROC_OUTSIDE_TYP_DN;
         m_l_CLASIFICATION_CD = i_l_CLASIFICATION_CD;
         m_l_CS_PROC_CD = i_l_CS_PROC_CD;
         m_l_CS_PROC_NAME = i_l_CS_PROC_NAME;
         m_l_NECESSARY_QTY = i_l_NECESSARY_QTY;
         m_l_STOCK_UNIT = i_l_STOCK_UNIT;
         m_l_HOME_CUR_UNIT = i_l_HOME_CUR_UNIT;
         m_l_OWN_MATR_COST = i_l_OWN_MATR_COST;
         m_l_TOTAL_MATR_COST = i_l_TOTAL_MATR_COST;
         m_l_OWN_SBCNT_MATR_COST = i_l_OWN_SBCNT_MATR_COST;
         m_l_TOTAL_SBCNT_MATR_COST = i_l_TOTAL_SBCNT_MATR_COST;
         m_l_OWN_PROC_COST_SUM_ALL = i_l_OWN_PROC_COST_SUM_ALL;
         m_l_TOTAL_PROC_COST_SUM_ALL = i_l_TOTAL_PROC_COST_SUM_ALL;
         m_HALF_TERM_TYP_DN = i_HALF_TERM_TYP_DN;
         m_COST_TYP = i_COST_TYP;
         m_COST_TYP_DN = i_COST_TYP_DN;
         m_PLANT_NAME = i_PLANT_NAME;
         m_ROOT_ITEM_NAME = i_ROOT_ITEM_NAME;
         m_PARENT_ITEM_CD = i_PARENT_ITEM_CD;
         m_PARENT_ITEM_NAME = i_PARENT_ITEM_NAME;
         m_ITEM_CD = i_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_PS_EDITION = i_PS_EDITION;
         m_COST_STATEMENT_NO = i_COST_STATEMENT_NO;
         m_CS_PROC_CD = i_CS_PROC_CD;
         m_CS_PROC_NAME = i_CS_PROC_NAME;
         m_WS_CD = i_WS_CD;
         m_WS_NAME = i_WS_NAME;
         m_ORG_CD = i_ORG_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_NECESSARY_QTY = i_NECESSARY_QTY;
         m_PS_INPUT_RATIO = i_PS_INPUT_RATIO;
         m_ITEM_INPUT_RATIO = i_ITEM_INPUT_RATIO;
         m_OWN_MATR_COST = i_OWN_MATR_COST;
         m_OWN_SBCNT_MATR_COST = i_OWN_SBCNT_MATR_COST;
         m_OWN_PROC_COST_SUM_ALL = i_OWN_PROC_COST_SUM_ALL;
         m_HOME_CUR_UNIT = i_HOME_CUR_UNIT;
         m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
         m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
         m_PARENT_COST_STATEMENT_NO = i_PARENT_COST_STATEMENT_NO;
         m_PARENT_ITEM_STOCK_UNIT = i_PARENT_ITEM_STOCK_UNIT;
         m_STOCK_UNIT = i_STOCK_UNIT;
         m_CLASIFICATION_CD = i_CLASIFICATION_CD;
         m_OUTSIDE_TYP = i_OUTSIDE_TYP;
         m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
         m_PROC_OUTSIDE_TYP = i_PROC_OUTSIDE_TYP;
         m_PROC_OUTSIDE_TYP_DN = i_PROC_OUTSIDE_TYP_DN;
         m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
         m_PROC_COST_CLS_NAME = i_PROC_COST_CLS_NAME;
         m_PROC_COST_UNIT_QTY = i_PROC_COST_UNIT_QTY;
         m_PROC_COST_UNIT_QTY_UNIT = i_PROC_COST_UNIT_QTY_UNIT;
         m_OWN_PROC_COST_01 = i_OWN_PROC_COST_01;
         m_OWN_PROC_COST_02 = i_OWN_PROC_COST_02;
         m_OWN_PROC_COST_03 = i_OWN_PROC_COST_03;
         m_OWN_PROC_COST_04 = i_OWN_PROC_COST_04;
         m_OWN_PROC_COST_05 = i_OWN_PROC_COST_05;
         m_OWN_PROC_COST_06 = i_OWN_PROC_COST_06;
         m_OWN_PROC_COST_07 = i_OWN_PROC_COST_07;
         m_OWN_PROC_COST_08 = i_OWN_PROC_COST_08;
         m_OWN_PROC_COST_09 = i_OWN_PROC_COST_09;
         m_OWN_PROC_COST_10 = i_OWN_PROC_COST_10;
         m_OWN_PROC_COST_11 = i_OWN_PROC_COST_11;
         m_OWN_PROC_COST_12 = i_OWN_PROC_COST_12;
         m_OWN_PROC_COST_SUM = i_OWN_PROC_COST_SUM;
         m_TOTAL_PROC_COST_01 = i_TOTAL_PROC_COST_01;
         m_TOTAL_PROC_COST_02 = i_TOTAL_PROC_COST_02;
         m_TOTAL_PROC_COST_03 = i_TOTAL_PROC_COST_03;
         m_TOTAL_PROC_COST_04 = i_TOTAL_PROC_COST_04;
         m_TOTAL_PROC_COST_05 = i_TOTAL_PROC_COST_05;
         m_TOTAL_PROC_COST_06 = i_TOTAL_PROC_COST_06;
         m_TOTAL_PROC_COST_07 = i_TOTAL_PROC_COST_07;
         m_TOTAL_PROC_COST_08 = i_TOTAL_PROC_COST_08;
         m_TOTAL_PROC_COST_09 = i_TOTAL_PROC_COST_09;
         m_TOTAL_PROC_COST_10 = i_TOTAL_PROC_COST_10;
         m_TOTAL_PROC_COST_11 = i_TOTAL_PROC_COST_11;
         m_TOTAL_PROC_COST_12 = i_TOTAL_PROC_COST_12;
         m_TOTAL_PROC_COST_SUM = i_TOTAL_PROC_COST_SUM;
         m_PROC_COST_01_NAME = i_PROC_COST_01_NAME;
         m_PROC_COST_02_NAME = i_PROC_COST_02_NAME;
         m_PROC_COST_03_NAME = i_PROC_COST_03_NAME;
         m_PROC_COST_04_NAME = i_PROC_COST_04_NAME;
         m_PROC_COST_05_NAME = i_PROC_COST_05_NAME;
         m_PROC_COST_06_NAME = i_PROC_COST_06_NAME;
         m_PROC_COST_07_NAME = i_PROC_COST_07_NAME;
         m_PROC_COST_08_NAME = i_PROC_COST_08_NAME;
         m_PROC_COST_09_NAME = i_PROC_COST_09_NAME;
         m_PROC_COST_10_NAME = i_PROC_COST_10_NAME;
         m_PROC_COST_11_NAME = i_PROC_COST_11_NAME;
         m_PROC_COST_12_NAME = i_PROC_COST_12_NAME;
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
