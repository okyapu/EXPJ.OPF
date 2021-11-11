/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0040/src/com/nec/jp/orteus/metamorBase/DA0040/DA0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0040;

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

public class DA0040010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** �� 2 �ϐ��F m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** �� 3 �ϐ��F m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** �� 4 �ϐ��F m_COST_TYP_val */
	public String m_COST_TYP_val = null;
	/** �� 5 �ϐ��F m_HALF_TERM_TYP_DN */
	public String m_HALF_TERM_TYP_DN = null;
	/** �� 6 �ϐ��F m_COST_TYP_DN */
	public String m_COST_TYP_DN = null;
	/** �� 7 �ϐ��F m_ONEROUS_CONS_FLG_name */
	public String m_ONEROUS_CONS_FLG_name = null;
	/** �� 8 �ϐ��F m_ONEROUS_CONS_FLG_val */
	public String m_ONEROUS_CONS_FLG_val = null;
	/** �� 9 �ϐ��F m_c_NoCheckClasificationCd */
	public String m_c_NoCheckClasificationCd = null;
	/** �� 10 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 11 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 12 �ϐ��F m_l_PROC_COST_CLS_CD */
	public String m_l_PROC_COST_CLS_CD = null;
	/** �� 13 �ϐ��F m_l_PROC_COST_CLS_NAME */
	public String m_l_PROC_COST_CLS_NAME = null;
	/** �� 14 �ϐ��F m_l_CLASIFICATION_CD */
	public String m_l_CLASIFICATION_CD = null;
	/** �� 15 �ϐ��F m_l_ONEROUS_CONS_FLG_DN */
	public String m_l_ONEROUS_CONS_FLG_DN = null;
	/** �� 16 �ϐ��F m_l_HOME_CUR_UNIT */
	public String m_l_HOME_CUR_UNIT = null;
	/** �� 17 �ϐ��F m_l_PROC_COST_01 */
	public String m_l_PROC_COST_01 = null;
	/** �� 18 �ϐ��F m_l_PROC_COST_02 */
	public String m_l_PROC_COST_02 = null;
	/** �� 19 �ϐ��F m_l_PROC_COST_03 */
	public String m_l_PROC_COST_03 = null;
	/** �� 20 �ϐ��F m_l_PROC_COST_04 */
	public String m_l_PROC_COST_04 = null;
	/** �� 21 �ϐ��F m_l_PROC_COST_05 */
	public String m_l_PROC_COST_05 = null;
	/** �� 22 �ϐ��F m_l_PROC_COST_06 */
	public String m_l_PROC_COST_06 = null;
	/** �� 23 �ϐ��F m_l_PROC_COST_07 */
	public String m_l_PROC_COST_07 = null;
	/** �� 24 �ϐ��F m_l_PROC_COST_08 */
	public String m_l_PROC_COST_08 = null;
	/** �� 25 �ϐ��F m_l_PROC_COST_09 */
	public String m_l_PROC_COST_09 = null;
	/** �� 26 �ϐ��F m_l_PROC_COST_10 */
	public String m_l_PROC_COST_10 = null;
	/** �� 27 �ϐ��F m_l_PROC_COST_11 */
	public String m_l_PROC_COST_11 = null;
	/** �� 28 �ϐ��F m_l_PROC_COST_12 */
	public String m_l_PROC_COST_12 = null;
	/** �� 29 �ϐ��F m_l_PROC_COST_SUM */
	public String m_l_PROC_COST_SUM = null;
	/** �� 30 �ϐ��F m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** �� 31 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 32 �ϐ��F m_YEAR */
	public String m_YEAR = null;
	/** �� 33 �ϐ��F m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** �� 34 �ϐ��F m_COST_TYP */
	public String m_COST_TYP = null;
	/** �� 35 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 36 �ϐ��F m_IN_ITEM_CD */
	public String m_IN_ITEM_CD = null;
	/** �� 37 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 38 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 39 �ϐ��F m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** �� 40 �ϐ��F m_PROC_COST_CLS_NAME */
	public String m_PROC_COST_CLS_NAME = null;
	/** �� 41 �ϐ��F m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** �� 42 �ϐ��F m_ONEROUS_CONS_FLG */
	public String m_ONEROUS_CONS_FLG = null;
	/** �� 43 �ϐ��F m_PROC_COST_UNIT_QTY */
	public String m_PROC_COST_UNIT_QTY = null;
	/** �� 44 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 45 �ϐ��F m_PROC_COST_01 */
	public String m_PROC_COST_01 = null;
	/** �� 46 �ϐ��F m_PROC_COST_02 */
	public String m_PROC_COST_02 = null;
	/** �� 47 �ϐ��F m_PROC_COST_03 */
	public String m_PROC_COST_03 = null;
	/** �� 48 �ϐ��F m_PROC_COST_04 */
	public String m_PROC_COST_04 = null;
	/** �� 49 �ϐ��F m_PROC_COST_05 */
	public String m_PROC_COST_05 = null;
	/** �� 50 �ϐ��F m_PROC_COST_06 */
	public String m_PROC_COST_06 = null;
	/** �� 51 �ϐ��F m_PROC_COST_07 */
	public String m_PROC_COST_07 = null;
	/** �� 52 �ϐ��F m_PROC_COST_08 */
	public String m_PROC_COST_08 = null;
	/** �� 53 �ϐ��F m_PROC_COST_09 */
	public String m_PROC_COST_09 = null;
	/** �� 54 �ϐ��F m_PROC_COST_10 */
	public String m_PROC_COST_10 = null;
	/** �� 55 �ϐ��F m_PROC_COST_11 */
	public String m_PROC_COST_11 = null;
	/** �� 56 �ϐ��F m_PROC_COST_12 */
	public String m_PROC_COST_12 = null;
	/** �� 57 �ϐ��F m_PROC_COST_SUM */
	public String m_PROC_COST_SUM = null;
	/** �� 58 �ϐ��F m_PROC_COST_01_NAME */
	public String m_PROC_COST_01_NAME = null;
	/** �� 59 �ϐ��F m_PROC_COST_02_NAME */
	public String m_PROC_COST_02_NAME = null;
	/** �� 60 �ϐ��F m_PROC_COST_03_NAME */
	public String m_PROC_COST_03_NAME = null;
	/** �� 61 �ϐ��F m_PROC_COST_04_NAME */
	public String m_PROC_COST_04_NAME = null;
	/** �� 62 �ϐ��F m_PROC_COST_05_NAME */
	public String m_PROC_COST_05_NAME = null;
	/** �� 63 �ϐ��F m_PROC_COST_06_NAME */
	public String m_PROC_COST_06_NAME = null;
	/** �� 64 �ϐ��F m_PROC_COST_07_NAME */
	public String m_PROC_COST_07_NAME = null;
	/** �� 65 �ϐ��F m_PROC_COST_08_NAME */
	public String m_PROC_COST_08_NAME = null;
	/** �� 66 �ϐ��F m_PROC_COST_09_NAME */
	public String m_PROC_COST_09_NAME = null;
	/** �� 67 �ϐ��F m_PROC_COST_10_NAME */
	public String m_PROC_COST_10_NAME = null;
	/** �� 68 �ϐ��F m_PROC_COST_11_NAME */
	public String m_PROC_COST_11_NAME = null;
	/** �� 69 �ϐ��F m_PROC_COST_12_NAME */
	public String m_PROC_COST_12_NAME = null;
	/** �� 70 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 71 �ϐ��F m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** �� 72 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 73 �ϐ��F m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** �� 74 �ϐ��F m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** �� 75 �ϐ��F m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** �� 76 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 77 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** �� 2 List�ϐ��F l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** �� 3 List�ϐ��F l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** �� 4 List�ϐ��F l_COST_TYP_val */
	public List l_COST_TYP_val = null;

	/** �� 5 List�ϐ��F l_HALF_TERM_TYP_DN */
	public List l_HALF_TERM_TYP_DN = null;

	/** �� 6 List�ϐ��F l_COST_TYP_DN */
	public List l_COST_TYP_DN = null;

	/** �� 7 List�ϐ��F l_ONEROUS_CONS_FLG_name */
	public List l_ONEROUS_CONS_FLG_name = null;

	/** �� 8 List�ϐ��F l_ONEROUS_CONS_FLG_val */
	public List l_ONEROUS_CONS_FLG_val = null;

	/** �� 9 List�ϐ��F l_c_NoCheckClasificationCd */
	public List l_c_NoCheckClasificationCd = null;

	/** �� 10 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 12 List�ϐ��F l_l_PROC_COST_CLS_CD */
	public List l_l_PROC_COST_CLS_CD = null;

	/** �� 13 List�ϐ��F l_l_PROC_COST_CLS_NAME */
	public List l_l_PROC_COST_CLS_NAME = null;

	/** �� 14 List�ϐ��F l_l_CLASIFICATION_CD */
	public List l_l_CLASIFICATION_CD = null;

	/** �� 15 List�ϐ��F l_l_ONEROUS_CONS_FLG_DN */
	public List l_l_ONEROUS_CONS_FLG_DN = null;

	/** �� 16 List�ϐ��F l_l_HOME_CUR_UNIT */
	public List l_l_HOME_CUR_UNIT = null;

	/** �� 17 List�ϐ��F l_l_PROC_COST_01 */
	public List l_l_PROC_COST_01 = null;

	/** �� 18 List�ϐ��F l_l_PROC_COST_02 */
	public List l_l_PROC_COST_02 = null;

	/** �� 19 List�ϐ��F l_l_PROC_COST_03 */
	public List l_l_PROC_COST_03 = null;

	/** �� 20 List�ϐ��F l_l_PROC_COST_04 */
	public List l_l_PROC_COST_04 = null;

	/** �� 21 List�ϐ��F l_l_PROC_COST_05 */
	public List l_l_PROC_COST_05 = null;

	/** �� 22 List�ϐ��F l_l_PROC_COST_06 */
	public List l_l_PROC_COST_06 = null;

	/** �� 23 List�ϐ��F l_l_PROC_COST_07 */
	public List l_l_PROC_COST_07 = null;

	/** �� 24 List�ϐ��F l_l_PROC_COST_08 */
	public List l_l_PROC_COST_08 = null;

	/** �� 25 List�ϐ��F l_l_PROC_COST_09 */
	public List l_l_PROC_COST_09 = null;

	/** �� 26 List�ϐ��F l_l_PROC_COST_10 */
	public List l_l_PROC_COST_10 = null;

	/** �� 27 List�ϐ��F l_l_PROC_COST_11 */
	public List l_l_PROC_COST_11 = null;

	/** �� 28 List�ϐ��F l_l_PROC_COST_12 */
	public List l_l_PROC_COST_12 = null;

	/** �� 29 List�ϐ��F l_l_PROC_COST_SUM */
	public List l_l_PROC_COST_SUM = null;

	/** �� 30 List�ϐ��F l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** �� 31 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 32 List�ϐ��F l_YEAR */
	public List l_YEAR = null;

	/** �� 33 List�ϐ��F l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** �� 34 List�ϐ��F l_COST_TYP */
	public List l_COST_TYP = null;

	/** �� 35 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 36 List�ϐ��F l_IN_ITEM_CD */
	public List l_IN_ITEM_CD = null;

	/** �� 37 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 38 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 39 List�ϐ��F l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** �� 40 List�ϐ��F l_PROC_COST_CLS_NAME */
	public List l_PROC_COST_CLS_NAME = null;

	/** �� 41 List�ϐ��F l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** �� 42 List�ϐ��F l_ONEROUS_CONS_FLG */
	public List l_ONEROUS_CONS_FLG = null;

	/** �� 43 List�ϐ��F l_PROC_COST_UNIT_QTY */
	public List l_PROC_COST_UNIT_QTY = null;

	/** �� 44 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 45 List�ϐ��F l_PROC_COST_01 */
	public List l_PROC_COST_01 = null;

	/** �� 46 List�ϐ��F l_PROC_COST_02 */
	public List l_PROC_COST_02 = null;

	/** �� 47 List�ϐ��F l_PROC_COST_03 */
	public List l_PROC_COST_03 = null;

	/** �� 48 List�ϐ��F l_PROC_COST_04 */
	public List l_PROC_COST_04 = null;

	/** �� 49 List�ϐ��F l_PROC_COST_05 */
	public List l_PROC_COST_05 = null;

	/** �� 50 List�ϐ��F l_PROC_COST_06 */
	public List l_PROC_COST_06 = null;

	/** �� 51 List�ϐ��F l_PROC_COST_07 */
	public List l_PROC_COST_07 = null;

	/** �� 52 List�ϐ��F l_PROC_COST_08 */
	public List l_PROC_COST_08 = null;

	/** �� 53 List�ϐ��F l_PROC_COST_09 */
	public List l_PROC_COST_09 = null;

	/** �� 54 List�ϐ��F l_PROC_COST_10 */
	public List l_PROC_COST_10 = null;

	/** �� 55 List�ϐ��F l_PROC_COST_11 */
	public List l_PROC_COST_11 = null;

	/** �� 56 List�ϐ��F l_PROC_COST_12 */
	public List l_PROC_COST_12 = null;

	/** �� 57 List�ϐ��F l_PROC_COST_SUM */
	public List l_PROC_COST_SUM = null;

	/** �� 58 List�ϐ��F l_PROC_COST_01_NAME */
	public List l_PROC_COST_01_NAME = null;

	/** �� 59 List�ϐ��F l_PROC_COST_02_NAME */
	public List l_PROC_COST_02_NAME = null;

	/** �� 60 List�ϐ��F l_PROC_COST_03_NAME */
	public List l_PROC_COST_03_NAME = null;

	/** �� 61 List�ϐ��F l_PROC_COST_04_NAME */
	public List l_PROC_COST_04_NAME = null;

	/** �� 62 List�ϐ��F l_PROC_COST_05_NAME */
	public List l_PROC_COST_05_NAME = null;

	/** �� 63 List�ϐ��F l_PROC_COST_06_NAME */
	public List l_PROC_COST_06_NAME = null;

	/** �� 64 List�ϐ��F l_PROC_COST_07_NAME */
	public List l_PROC_COST_07_NAME = null;

	/** �� 65 List�ϐ��F l_PROC_COST_08_NAME */
	public List l_PROC_COST_08_NAME = null;

	/** �� 66 List�ϐ��F l_PROC_COST_09_NAME */
	public List l_PROC_COST_09_NAME = null;

	/** �� 67 List�ϐ��F l_PROC_COST_10_NAME */
	public List l_PROC_COST_10_NAME = null;

	/** �� 68 List�ϐ��F l_PROC_COST_11_NAME */
	public List l_PROC_COST_11_NAME = null;

	/** �� 69 List�ϐ��F l_PROC_COST_12_NAME */
	public List l_PROC_COST_12_NAME = null;

	/** �� 70 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 71 List�ϐ��F l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** �� 72 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 73 List�ϐ��F l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** �� 74 List�ϐ��F l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** �� 75 List�ϐ��F l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** �� 76 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 77 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }
	public String getHALF_TERM_TYP_DN() { return m_HALF_TERM_TYP_DN; }
	public String getCOST_TYP_DN() { return m_COST_TYP_DN; }
	public String getONEROUS_CONS_FLG_name() { return m_ONEROUS_CONS_FLG_name; }
	public String getONEROUS_CONS_FLG_val() { return m_ONEROUS_CONS_FLG_val; }
	public String getc_NoCheckClasificationCd() { return m_c_NoCheckClasificationCd; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PROC_COST_CLS_CD() { return m_l_PROC_COST_CLS_CD; }
	public String getl_PROC_COST_CLS_NAME() { return m_l_PROC_COST_CLS_NAME; }
	public String getl_CLASIFICATION_CD() { return m_l_CLASIFICATION_CD; }
	public String getl_ONEROUS_CONS_FLG_DN() { return m_l_ONEROUS_CONS_FLG_DN; }
	public String getl_HOME_CUR_UNIT() { return m_l_HOME_CUR_UNIT; }
	public String getl_PROC_COST_01() { return m_l_PROC_COST_01; }
	public String getl_PROC_COST_02() { return m_l_PROC_COST_02; }
	public String getl_PROC_COST_03() { return m_l_PROC_COST_03; }
	public String getl_PROC_COST_04() { return m_l_PROC_COST_04; }
	public String getl_PROC_COST_05() { return m_l_PROC_COST_05; }
	public String getl_PROC_COST_06() { return m_l_PROC_COST_06; }
	public String getl_PROC_COST_07() { return m_l_PROC_COST_07; }
	public String getl_PROC_COST_08() { return m_l_PROC_COST_08; }
	public String getl_PROC_COST_09() { return m_l_PROC_COST_09; }
	public String getl_PROC_COST_10() { return m_l_PROC_COST_10; }
	public String getl_PROC_COST_11() { return m_l_PROC_COST_11; }
	public String getl_PROC_COST_12() { return m_l_PROC_COST_12; }
	public String getl_PROC_COST_SUM() { return m_l_PROC_COST_SUM; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getIN_ITEM_CD() { return m_IN_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getPROC_COST_CLS_NAME() { return m_PROC_COST_CLS_NAME; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getONEROUS_CONS_FLG() { return m_ONEROUS_CONS_FLG; }
	public String getPROC_COST_UNIT_QTY() { return m_PROC_COST_UNIT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPROC_COST_01() { return m_PROC_COST_01; }
	public String getPROC_COST_02() { return m_PROC_COST_02; }
	public String getPROC_COST_03() { return m_PROC_COST_03; }
	public String getPROC_COST_04() { return m_PROC_COST_04; }
	public String getPROC_COST_05() { return m_PROC_COST_05; }
	public String getPROC_COST_06() { return m_PROC_COST_06; }
	public String getPROC_COST_07() { return m_PROC_COST_07; }
	public String getPROC_COST_08() { return m_PROC_COST_08; }
	public String getPROC_COST_09() { return m_PROC_COST_09; }
	public String getPROC_COST_10() { return m_PROC_COST_10; }
	public String getPROC_COST_11() { return m_PROC_COST_11; }
	public String getPROC_COST_12() { return m_PROC_COST_12; }
	public String getPROC_COST_SUM() { return m_PROC_COST_SUM; }
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
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }
	public List getList_HALF_TERM_TYP_DN() { return l_HALF_TERM_TYP_DN; }
	public List getList_COST_TYP_DN() { return l_COST_TYP_DN; }
	public List getList_ONEROUS_CONS_FLG_name() { return l_ONEROUS_CONS_FLG_name; }
	public List getList_ONEROUS_CONS_FLG_val() { return l_ONEROUS_CONS_FLG_val; }
	public List getList_c_NoCheckClasificationCd() { return l_c_NoCheckClasificationCd; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PROC_COST_CLS_CD() { return l_l_PROC_COST_CLS_CD; }
	public List getList_l_PROC_COST_CLS_NAME() { return l_l_PROC_COST_CLS_NAME; }
	public List getList_l_CLASIFICATION_CD() { return l_l_CLASIFICATION_CD; }
	public List getList_l_ONEROUS_CONS_FLG_DN() { return l_l_ONEROUS_CONS_FLG_DN; }
	public List getList_l_HOME_CUR_UNIT() { return l_l_HOME_CUR_UNIT; }
	public List getList_l_PROC_COST_01() { return l_l_PROC_COST_01; }
	public List getList_l_PROC_COST_02() { return l_l_PROC_COST_02; }
	public List getList_l_PROC_COST_03() { return l_l_PROC_COST_03; }
	public List getList_l_PROC_COST_04() { return l_l_PROC_COST_04; }
	public List getList_l_PROC_COST_05() { return l_l_PROC_COST_05; }
	public List getList_l_PROC_COST_06() { return l_l_PROC_COST_06; }
	public List getList_l_PROC_COST_07() { return l_l_PROC_COST_07; }
	public List getList_l_PROC_COST_08() { return l_l_PROC_COST_08; }
	public List getList_l_PROC_COST_09() { return l_l_PROC_COST_09; }
	public List getList_l_PROC_COST_10() { return l_l_PROC_COST_10; }
	public List getList_l_PROC_COST_11() { return l_l_PROC_COST_11; }
	public List getList_l_PROC_COST_12() { return l_l_PROC_COST_12; }
	public List getList_l_PROC_COST_SUM() { return l_l_PROC_COST_SUM; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_IN_ITEM_CD() { return l_IN_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_PROC_COST_CLS_NAME() { return l_PROC_COST_CLS_NAME; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_ONEROUS_CONS_FLG() { return l_ONEROUS_CONS_FLG; }
	public List getList_PROC_COST_UNIT_QTY() { return l_PROC_COST_UNIT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PROC_COST_01() { return l_PROC_COST_01; }
	public List getList_PROC_COST_02() { return l_PROC_COST_02; }
	public List getList_PROC_COST_03() { return l_PROC_COST_03; }
	public List getList_PROC_COST_04() { return l_PROC_COST_04; }
	public List getList_PROC_COST_05() { return l_PROC_COST_05; }
	public List getList_PROC_COST_06() { return l_PROC_COST_06; }
	public List getList_PROC_COST_07() { return l_PROC_COST_07; }
	public List getList_PROC_COST_08() { return l_PROC_COST_08; }
	public List getList_PROC_COST_09() { return l_PROC_COST_09; }
	public List getList_PROC_COST_10() { return l_PROC_COST_10; }
	public List getList_PROC_COST_11() { return l_PROC_COST_11; }
	public List getList_PROC_COST_12() { return l_PROC_COST_12; }
	public List getList_PROC_COST_SUM() { return l_PROC_COST_SUM; }
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
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }
	public void setHALF_TERM_TYP_DN(String val) { m_HALF_TERM_TYP_DN = val; }
	public void setCOST_TYP_DN(String val) { m_COST_TYP_DN = val; }
	public void setONEROUS_CONS_FLG_name(String val) { m_ONEROUS_CONS_FLG_name = val; }
	public void setONEROUS_CONS_FLG_val(String val) { m_ONEROUS_CONS_FLG_val = val; }
	public void setc_NoCheckClasificationCd(String val) { m_c_NoCheckClasificationCd = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PROC_COST_CLS_CD(String val) { m_l_PROC_COST_CLS_CD = val; }
	public void setl_PROC_COST_CLS_NAME(String val) { m_l_PROC_COST_CLS_NAME = val; }
	public void setl_CLASIFICATION_CD(String val) { m_l_CLASIFICATION_CD = val; }
	public void setl_ONEROUS_CONS_FLG_DN(String val) { m_l_ONEROUS_CONS_FLG_DN = val; }
	public void setl_HOME_CUR_UNIT(String val) { m_l_HOME_CUR_UNIT = val; }
	public void setl_PROC_COST_01(String val) { m_l_PROC_COST_01 = val; }
	public void setl_PROC_COST_02(String val) { m_l_PROC_COST_02 = val; }
	public void setl_PROC_COST_03(String val) { m_l_PROC_COST_03 = val; }
	public void setl_PROC_COST_04(String val) { m_l_PROC_COST_04 = val; }
	public void setl_PROC_COST_05(String val) { m_l_PROC_COST_05 = val; }
	public void setl_PROC_COST_06(String val) { m_l_PROC_COST_06 = val; }
	public void setl_PROC_COST_07(String val) { m_l_PROC_COST_07 = val; }
	public void setl_PROC_COST_08(String val) { m_l_PROC_COST_08 = val; }
	public void setl_PROC_COST_09(String val) { m_l_PROC_COST_09 = val; }
	public void setl_PROC_COST_10(String val) { m_l_PROC_COST_10 = val; }
	public void setl_PROC_COST_11(String val) { m_l_PROC_COST_11 = val; }
	public void setl_PROC_COST_12(String val) { m_l_PROC_COST_12 = val; }
	public void setl_PROC_COST_SUM(String val) { m_l_PROC_COST_SUM = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setIN_ITEM_CD(String val) { m_IN_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setPROC_COST_CLS_NAME(String val) { m_PROC_COST_CLS_NAME = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setONEROUS_CONS_FLG(String val) { m_ONEROUS_CONS_FLG = val; }
	public void setPROC_COST_UNIT_QTY(String val) { m_PROC_COST_UNIT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPROC_COST_01(String val) { m_PROC_COST_01 = val; }
	public void setPROC_COST_02(String val) { m_PROC_COST_02 = val; }
	public void setPROC_COST_03(String val) { m_PROC_COST_03 = val; }
	public void setPROC_COST_04(String val) { m_PROC_COST_04 = val; }
	public void setPROC_COST_05(String val) { m_PROC_COST_05 = val; }
	public void setPROC_COST_06(String val) { m_PROC_COST_06 = val; }
	public void setPROC_COST_07(String val) { m_PROC_COST_07 = val; }
	public void setPROC_COST_08(String val) { m_PROC_COST_08 = val; }
	public void setPROC_COST_09(String val) { m_PROC_COST_09 = val; }
	public void setPROC_COST_10(String val) { m_PROC_COST_10 = val; }
	public void setPROC_COST_11(String val) { m_PROC_COST_11 = val; }
	public void setPROC_COST_12(String val) { m_PROC_COST_12 = val; }
	public void setPROC_COST_SUM(String val) { m_PROC_COST_SUM = val; }
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
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }
	public void setList_HALF_TERM_TYP_DN(List list) { l_HALF_TERM_TYP_DN = list; }
	public void setList_COST_TYP_DN(List list) { l_COST_TYP_DN = list; }
	public void setList_ONEROUS_CONS_FLG_name(List list) { l_ONEROUS_CONS_FLG_name = list; }
	public void setList_ONEROUS_CONS_FLG_val(List list) { l_ONEROUS_CONS_FLG_val = list; }
	public void setList_c_NoCheckClasificationCd(List list) { l_c_NoCheckClasificationCd = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PROC_COST_CLS_CD(List list) { l_l_PROC_COST_CLS_CD = list; }
	public void setList_l_PROC_COST_CLS_NAME(List list) { l_l_PROC_COST_CLS_NAME = list; }
	public void setList_l_CLASIFICATION_CD(List list) { l_l_CLASIFICATION_CD = list; }
	public void setList_l_ONEROUS_CONS_FLG_DN(List list) { l_l_ONEROUS_CONS_FLG_DN = list; }
	public void setList_l_HOME_CUR_UNIT(List list) { l_l_HOME_CUR_UNIT = list; }
	public void setList_l_PROC_COST_01(List list) { l_l_PROC_COST_01 = list; }
	public void setList_l_PROC_COST_02(List list) { l_l_PROC_COST_02 = list; }
	public void setList_l_PROC_COST_03(List list) { l_l_PROC_COST_03 = list; }
	public void setList_l_PROC_COST_04(List list) { l_l_PROC_COST_04 = list; }
	public void setList_l_PROC_COST_05(List list) { l_l_PROC_COST_05 = list; }
	public void setList_l_PROC_COST_06(List list) { l_l_PROC_COST_06 = list; }
	public void setList_l_PROC_COST_07(List list) { l_l_PROC_COST_07 = list; }
	public void setList_l_PROC_COST_08(List list) { l_l_PROC_COST_08 = list; }
	public void setList_l_PROC_COST_09(List list) { l_l_PROC_COST_09 = list; }
	public void setList_l_PROC_COST_10(List list) { l_l_PROC_COST_10 = list; }
	public void setList_l_PROC_COST_11(List list) { l_l_PROC_COST_11 = list; }
	public void setList_l_PROC_COST_12(List list) { l_l_PROC_COST_12 = list; }
	public void setList_l_PROC_COST_SUM(List list) { l_l_PROC_COST_SUM = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_IN_ITEM_CD(List list) { l_IN_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_PROC_COST_CLS_NAME(List list) { l_PROC_COST_CLS_NAME = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_ONEROUS_CONS_FLG(List list) { l_ONEROUS_CONS_FLG = list; }
	public void setList_PROC_COST_UNIT_QTY(List list) { l_PROC_COST_UNIT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PROC_COST_01(List list) { l_PROC_COST_01 = list; }
	public void setList_PROC_COST_02(List list) { l_PROC_COST_02 = list; }
	public void setList_PROC_COST_03(List list) { l_PROC_COST_03 = list; }
	public void setList_PROC_COST_04(List list) { l_PROC_COST_04 = list; }
	public void setList_PROC_COST_05(List list) { l_PROC_COST_05 = list; }
	public void setList_PROC_COST_06(List list) { l_PROC_COST_06 = list; }
	public void setList_PROC_COST_07(List list) { l_PROC_COST_07 = list; }
	public void setList_PROC_COST_08(List list) { l_PROC_COST_08 = list; }
	public void setList_PROC_COST_09(List list) { l_PROC_COST_09 = list; }
	public void setList_PROC_COST_10(List list) { l_PROC_COST_10 = list; }
	public void setList_PROC_COST_11(List list) { l_PROC_COST_11 = list; }
	public void setList_PROC_COST_12(List list) { l_PROC_COST_12 = list; }
	public void setList_PROC_COST_SUM(List list) { l_PROC_COST_SUM = list; }
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
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_HALF_TERM_TYP_name.add(((DA0040010Struct) list.get(i)).getHALF_TERM_TYP_name());
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
			l_HALF_TERM_TYP_val.add(((DA0040010Struct) list.get(i)).getHALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_name == null) {
			l_COST_TYP_name = new ArrayList();
		} else {
			l_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_name.add(((DA0040010Struct) list.get(i)).getCOST_TYP_name());
		}
		return size;
	}
	public int setL2L_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_val == null) {
			l_COST_TYP_val = new ArrayList();
		} else {
			l_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_val.add(((DA0040010Struct) list.get(i)).getCOST_TYP_val());
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
			l_HALF_TERM_TYP_DN.add(((DA0040010Struct) list.get(i)).getHALF_TERM_TYP_DN());
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
			l_COST_TYP_DN.add(((DA0040010Struct) list.get(i)).getCOST_TYP_DN());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG_name == null) {
			l_ONEROUS_CONS_FLG_name = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG_name.add(((DA0040010Struct) list.get(i)).getONEROUS_CONS_FLG_name());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG_val == null) {
			l_ONEROUS_CONS_FLG_val = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG_val.add(((DA0040010Struct) list.get(i)).getONEROUS_CONS_FLG_val());
		}
		return size;
	}
	public int setL2L_c_NoCheckClasificationCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_NoCheckClasificationCd == null) {
			l_c_NoCheckClasificationCd = new ArrayList();
		} else {
			l_c_NoCheckClasificationCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_NoCheckClasificationCd.add(((DA0040010Struct) list.get(i)).getc_NoCheckClasificationCd());
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
			l_l_ITEM_CD.add(((DA0040010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((DA0040010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_CLS_CD == null) {
			l_l_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_l_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_CLS_CD.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_CLS_CD());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_CLS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_CLS_NAME == null) {
			l_l_PROC_COST_CLS_NAME = new ArrayList();
		} else {
			l_l_PROC_COST_CLS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_CLS_NAME.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_CLS_NAME());
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
			l_l_CLASIFICATION_CD.add(((DA0040010Struct) list.get(i)).getl_CLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_l_ONEROUS_CONS_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ONEROUS_CONS_FLG_DN == null) {
			l_l_ONEROUS_CONS_FLG_DN = new ArrayList();
		} else {
			l_l_ONEROUS_CONS_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ONEROUS_CONS_FLG_DN.add(((DA0040010Struct) list.get(i)).getl_ONEROUS_CONS_FLG_DN());
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
			l_l_HOME_CUR_UNIT.add(((DA0040010Struct) list.get(i)).getl_HOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_01 == null) {
			l_l_PROC_COST_01 = new ArrayList();
		} else {
			l_l_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_01.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_02 == null) {
			l_l_PROC_COST_02 = new ArrayList();
		} else {
			l_l_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_02.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_03 == null) {
			l_l_PROC_COST_03 = new ArrayList();
		} else {
			l_l_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_03.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_04 == null) {
			l_l_PROC_COST_04 = new ArrayList();
		} else {
			l_l_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_04.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_05 == null) {
			l_l_PROC_COST_05 = new ArrayList();
		} else {
			l_l_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_05.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_06 == null) {
			l_l_PROC_COST_06 = new ArrayList();
		} else {
			l_l_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_06.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_07 == null) {
			l_l_PROC_COST_07 = new ArrayList();
		} else {
			l_l_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_07.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_08 == null) {
			l_l_PROC_COST_08 = new ArrayList();
		} else {
			l_l_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_08.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_09 == null) {
			l_l_PROC_COST_09 = new ArrayList();
		} else {
			l_l_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_09.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_10 == null) {
			l_l_PROC_COST_10 = new ArrayList();
		} else {
			l_l_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_10.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_11 == null) {
			l_l_PROC_COST_11 = new ArrayList();
		} else {
			l_l_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_11.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_12 == null) {
			l_l_PROC_COST_12 = new ArrayList();
		} else {
			l_l_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_12.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_l_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_COST_SUM == null) {
			l_l_PROC_COST_SUM = new ArrayList();
		} else {
			l_l_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_COST_SUM.add(((DA0040010Struct) list.get(i)).getl_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((DA0040010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_PLANT_CD.add(((DA0040010Struct) list.get(i)).getPLANT_CD());
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
			l_YEAR.add(((DA0040010Struct) list.get(i)).getYEAR());
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
			l_HALF_TERM_TYP.add(((DA0040010Struct) list.get(i)).getHALF_TERM_TYP());
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
			l_COST_TYP.add(((DA0040010Struct) list.get(i)).getCOST_TYP());
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
			l_CS_PROC_CD.add(((DA0040010Struct) list.get(i)).getCS_PROC_CD());
		}
		return size;
	}
	public int setL2L_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ITEM_CD == null) {
			l_IN_ITEM_CD = new ArrayList();
		} else {
			l_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ITEM_CD.add(((DA0040010Struct) list.get(i)).getIN_ITEM_CD());
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
			l_ITEM_CD.add(((DA0040010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((DA0040010Struct) list.get(i)).getITEM_NAME());
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
			l_PROC_COST_CLS_CD.add(((DA0040010Struct) list.get(i)).getPROC_COST_CLS_CD());
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
			l_PROC_COST_CLS_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_CLS_NAME());
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
			l_CLASIFICATION_CD.add(((DA0040010Struct) list.get(i)).getCLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG == null) {
			l_ONEROUS_CONS_FLG = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG.add(((DA0040010Struct) list.get(i)).getONEROUS_CONS_FLG());
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
			l_PROC_COST_UNIT_QTY.add(((DA0040010Struct) list.get(i)).getPROC_COST_UNIT_QTY());
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
			l_STOCK_UNIT.add(((DA0040010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01 == null) {
			l_PROC_COST_01 = new ArrayList();
		} else {
			l_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01.add(((DA0040010Struct) list.get(i)).getPROC_COST_01());
		}
		return size;
	}
	public int setL2L_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02 == null) {
			l_PROC_COST_02 = new ArrayList();
		} else {
			l_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02.add(((DA0040010Struct) list.get(i)).getPROC_COST_02());
		}
		return size;
	}
	public int setL2L_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03 == null) {
			l_PROC_COST_03 = new ArrayList();
		} else {
			l_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03.add(((DA0040010Struct) list.get(i)).getPROC_COST_03());
		}
		return size;
	}
	public int setL2L_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04 == null) {
			l_PROC_COST_04 = new ArrayList();
		} else {
			l_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04.add(((DA0040010Struct) list.get(i)).getPROC_COST_04());
		}
		return size;
	}
	public int setL2L_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05 == null) {
			l_PROC_COST_05 = new ArrayList();
		} else {
			l_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05.add(((DA0040010Struct) list.get(i)).getPROC_COST_05());
		}
		return size;
	}
	public int setL2L_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06 == null) {
			l_PROC_COST_06 = new ArrayList();
		} else {
			l_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06.add(((DA0040010Struct) list.get(i)).getPROC_COST_06());
		}
		return size;
	}
	public int setL2L_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07 == null) {
			l_PROC_COST_07 = new ArrayList();
		} else {
			l_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07.add(((DA0040010Struct) list.get(i)).getPROC_COST_07());
		}
		return size;
	}
	public int setL2L_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08 == null) {
			l_PROC_COST_08 = new ArrayList();
		} else {
			l_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08.add(((DA0040010Struct) list.get(i)).getPROC_COST_08());
		}
		return size;
	}
	public int setL2L_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09 == null) {
			l_PROC_COST_09 = new ArrayList();
		} else {
			l_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09.add(((DA0040010Struct) list.get(i)).getPROC_COST_09());
		}
		return size;
	}
	public int setL2L_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10 == null) {
			l_PROC_COST_10 = new ArrayList();
		} else {
			l_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10.add(((DA0040010Struct) list.get(i)).getPROC_COST_10());
		}
		return size;
	}
	public int setL2L_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11 == null) {
			l_PROC_COST_11 = new ArrayList();
		} else {
			l_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11.add(((DA0040010Struct) list.get(i)).getPROC_COST_11());
		}
		return size;
	}
	public int setL2L_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12 == null) {
			l_PROC_COST_12 = new ArrayList();
		} else {
			l_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12.add(((DA0040010Struct) list.get(i)).getPROC_COST_12());
		}
		return size;
	}
	public int setL2L_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_SUM == null) {
			l_PROC_COST_SUM = new ArrayList();
		} else {
			l_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_SUM.add(((DA0040010Struct) list.get(i)).getPROC_COST_SUM());
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
			l_PROC_COST_01_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_01_NAME());
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
			l_PROC_COST_02_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_02_NAME());
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
			l_PROC_COST_03_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_03_NAME());
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
			l_PROC_COST_04_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_04_NAME());
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
			l_PROC_COST_05_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_05_NAME());
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
			l_PROC_COST_06_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_06_NAME());
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
			l_PROC_COST_07_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_07_NAME());
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
			l_PROC_COST_08_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_08_NAME());
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
			l_PROC_COST_09_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_09_NAME());
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
			l_PROC_COST_10_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_10_NAME());
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
			l_PROC_COST_11_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_11_NAME());
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
			l_PROC_COST_12_NAME.add(((DA0040010Struct) list.get(i)).getPROC_COST_12_NAME());
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
			l_MODIFY_COUNT.add(((DA0040010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_CURRENT_YEAR.add(((DA0040010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_PLANT_NAME.add(((DA0040010Struct) list.get(i)).getPLANT_NAME());
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
			l_CS_PROC_NAME.add(((DA0040010Struct) list.get(i)).getCS_PROC_NAME());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((DA0040010Struct) list.get(i)).getDEL_FLG());
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
			l_HOME_CUR_UNIT.add(((DA0040010Struct) list.get(i)).getHOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((DA0040010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_ROW_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT == null) {
			l_ROW_COUNT = new ArrayList();
		} else {
			l_ROW_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT.add(((DA0040010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;
		m_HALF_TERM_TYP_DN = null;
		m_COST_TYP_DN = null;
		m_ONEROUS_CONS_FLG_name = null;
		m_ONEROUS_CONS_FLG_val = null;
		m_c_NoCheckClasificationCd = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PROC_COST_CLS_CD = null;
		m_l_PROC_COST_CLS_NAME = null;
		m_l_CLASIFICATION_CD = null;
		m_l_ONEROUS_CONS_FLG_DN = null;
		m_l_HOME_CUR_UNIT = null;
		m_l_PROC_COST_01 = null;
		m_l_PROC_COST_02 = null;
		m_l_PROC_COST_03 = null;
		m_l_PROC_COST_04 = null;
		m_l_PROC_COST_05 = null;
		m_l_PROC_COST_06 = null;
		m_l_PROC_COST_07 = null;
		m_l_PROC_COST_08 = null;
		m_l_PROC_COST_09 = null;
		m_l_PROC_COST_10 = null;
		m_l_PROC_COST_11 = null;
		m_l_PROC_COST_12 = null;
		m_l_PROC_COST_SUM = null;
		m_l_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_CS_PROC_CD = null;
		m_IN_ITEM_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_PROC_COST_CLS_CD = null;
		m_PROC_COST_CLS_NAME = null;
		m_CLASIFICATION_CD = null;
		m_ONEROUS_CONS_FLG = null;
		m_PROC_COST_UNIT_QTY = null;
		m_STOCK_UNIT = null;
		m_PROC_COST_01 = null;
		m_PROC_COST_02 = null;
		m_PROC_COST_03 = null;
		m_PROC_COST_04 = null;
		m_PROC_COST_05 = null;
		m_PROC_COST_06 = null;
		m_PROC_COST_07 = null;
		m_PROC_COST_08 = null;
		m_PROC_COST_09 = null;
		m_PROC_COST_10 = null;
		m_PROC_COST_11 = null;
		m_PROC_COST_12 = null;
		m_PROC_COST_SUM = null;
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
		m_MODIFY_COUNT = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_CS_PROC_NAME = null;
		m_DEL_FLG = null;
		m_HOME_CUR_UNIT = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_COST_TYP_name = null;
		l_COST_TYP_val = null;
		l_HALF_TERM_TYP_DN = null;
		l_COST_TYP_DN = null;
		l_ONEROUS_CONS_FLG_name = null;
		l_ONEROUS_CONS_FLG_val = null;
		l_c_NoCheckClasificationCd = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PROC_COST_CLS_CD = null;
		l_l_PROC_COST_CLS_NAME = null;
		l_l_CLASIFICATION_CD = null;
		l_l_ONEROUS_CONS_FLG_DN = null;
		l_l_HOME_CUR_UNIT = null;
		l_l_PROC_COST_01 = null;
		l_l_PROC_COST_02 = null;
		l_l_PROC_COST_03 = null;
		l_l_PROC_COST_04 = null;
		l_l_PROC_COST_05 = null;
		l_l_PROC_COST_06 = null;
		l_l_PROC_COST_07 = null;
		l_l_PROC_COST_08 = null;
		l_l_PROC_COST_09 = null;
		l_l_PROC_COST_10 = null;
		l_l_PROC_COST_11 = null;
		l_l_PROC_COST_12 = null;
		l_l_PROC_COST_SUM = null;
		l_l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_COST_TYP = null;
		l_CS_PROC_CD = null;
		l_IN_ITEM_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_PROC_COST_CLS_CD = null;
		l_PROC_COST_CLS_NAME = null;
		l_CLASIFICATION_CD = null;
		l_ONEROUS_CONS_FLG = null;
		l_PROC_COST_UNIT_QTY = null;
		l_STOCK_UNIT = null;
		l_PROC_COST_01 = null;
		l_PROC_COST_02 = null;
		l_PROC_COST_03 = null;
		l_PROC_COST_04 = null;
		l_PROC_COST_05 = null;
		l_PROC_COST_06 = null;
		l_PROC_COST_07 = null;
		l_PROC_COST_08 = null;
		l_PROC_COST_09 = null;
		l_PROC_COST_10 = null;
		l_PROC_COST_11 = null;
		l_PROC_COST_12 = null;
		l_PROC_COST_SUM = null;
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
		l_MODIFY_COUNT = null;
		l_CURRENT_YEAR = null;
		l_PLANT_NAME = null;
		l_CS_PROC_NAME = null;
		l_DEL_FLG = null;
		l_HOME_CUR_UNIT = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

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
	 * medDA0040010�N���X�̕W���R���X�g���N�^
	 */
	public DA0040010Struct()
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
	public void setStruct(DA0040010Struct struct)
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
	public void setStructM(DA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
			this.setHALF_TERM_TYP_DN(struct.getHALF_TERM_TYP_DN());
			this.setCOST_TYP_DN(struct.getCOST_TYP_DN());
			this.setONEROUS_CONS_FLG_name(struct.getONEROUS_CONS_FLG_name());
			this.setONEROUS_CONS_FLG_val(struct.getONEROUS_CONS_FLG_val());
			this.setc_NoCheckClasificationCd(struct.getc_NoCheckClasificationCd());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
			this.setl_PROC_COST_CLS_NAME(struct.getl_PROC_COST_CLS_NAME());
			this.setl_CLASIFICATION_CD(struct.getl_CLASIFICATION_CD());
			this.setl_ONEROUS_CONS_FLG_DN(struct.getl_ONEROUS_CONS_FLG_DN());
			this.setl_HOME_CUR_UNIT(struct.getl_HOME_CUR_UNIT());
			this.setl_PROC_COST_01(struct.getl_PROC_COST_01());
			this.setl_PROC_COST_02(struct.getl_PROC_COST_02());
			this.setl_PROC_COST_03(struct.getl_PROC_COST_03());
			this.setl_PROC_COST_04(struct.getl_PROC_COST_04());
			this.setl_PROC_COST_05(struct.getl_PROC_COST_05());
			this.setl_PROC_COST_06(struct.getl_PROC_COST_06());
			this.setl_PROC_COST_07(struct.getl_PROC_COST_07());
			this.setl_PROC_COST_08(struct.getl_PROC_COST_08());
			this.setl_PROC_COST_09(struct.getl_PROC_COST_09());
			this.setl_PROC_COST_10(struct.getl_PROC_COST_10());
			this.setl_PROC_COST_11(struct.getl_PROC_COST_11());
			this.setl_PROC_COST_12(struct.getl_PROC_COST_12());
			this.setl_PROC_COST_SUM(struct.getl_PROC_COST_SUM());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setIN_ITEM_CD(struct.getIN_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setPROC_COST_CLS_NAME(struct.getPROC_COST_CLS_NAME());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setONEROUS_CONS_FLG(struct.getONEROUS_CONS_FLG());
			this.setPROC_COST_UNIT_QTY(struct.getPROC_COST_UNIT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPROC_COST_01(struct.getPROC_COST_01());
			this.setPROC_COST_02(struct.getPROC_COST_02());
			this.setPROC_COST_03(struct.getPROC_COST_03());
			this.setPROC_COST_04(struct.getPROC_COST_04());
			this.setPROC_COST_05(struct.getPROC_COST_05());
			this.setPROC_COST_06(struct.getPROC_COST_06());
			this.setPROC_COST_07(struct.getPROC_COST_07());
			this.setPROC_COST_08(struct.getPROC_COST_08());
			this.setPROC_COST_09(struct.getPROC_COST_09());
			this.setPROC_COST_10(struct.getPROC_COST_10());
			this.setPROC_COST_11(struct.getPROC_COST_11());
			this.setPROC_COST_12(struct.getPROC_COST_12());
			this.setPROC_COST_SUM(struct.getPROC_COST_SUM());
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
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
			this.setList_HALF_TERM_TYP_DN(struct.getList_HALF_TERM_TYP_DN());
			this.setList_COST_TYP_DN(struct.getList_COST_TYP_DN());
			this.setList_ONEROUS_CONS_FLG_name(struct.getList_ONEROUS_CONS_FLG_name());
			this.setList_ONEROUS_CONS_FLG_val(struct.getList_ONEROUS_CONS_FLG_val());
			this.setList_c_NoCheckClasificationCd(struct.getList_c_NoCheckClasificationCd());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PROC_COST_CLS_CD(struct.getList_l_PROC_COST_CLS_CD());
			this.setList_l_PROC_COST_CLS_NAME(struct.getList_l_PROC_COST_CLS_NAME());
			this.setList_l_CLASIFICATION_CD(struct.getList_l_CLASIFICATION_CD());
			this.setList_l_ONEROUS_CONS_FLG_DN(struct.getList_l_ONEROUS_CONS_FLG_DN());
			this.setList_l_HOME_CUR_UNIT(struct.getList_l_HOME_CUR_UNIT());
			this.setList_l_PROC_COST_01(struct.getList_l_PROC_COST_01());
			this.setList_l_PROC_COST_02(struct.getList_l_PROC_COST_02());
			this.setList_l_PROC_COST_03(struct.getList_l_PROC_COST_03());
			this.setList_l_PROC_COST_04(struct.getList_l_PROC_COST_04());
			this.setList_l_PROC_COST_05(struct.getList_l_PROC_COST_05());
			this.setList_l_PROC_COST_06(struct.getList_l_PROC_COST_06());
			this.setList_l_PROC_COST_07(struct.getList_l_PROC_COST_07());
			this.setList_l_PROC_COST_08(struct.getList_l_PROC_COST_08());
			this.setList_l_PROC_COST_09(struct.getList_l_PROC_COST_09());
			this.setList_l_PROC_COST_10(struct.getList_l_PROC_COST_10());
			this.setList_l_PROC_COST_11(struct.getList_l_PROC_COST_11());
			this.setList_l_PROC_COST_12(struct.getList_l_PROC_COST_12());
			this.setList_l_PROC_COST_SUM(struct.getList_l_PROC_COST_SUM());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_IN_ITEM_CD(struct.getList_IN_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_PROC_COST_CLS_NAME(struct.getList_PROC_COST_CLS_NAME());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_ONEROUS_CONS_FLG(struct.getList_ONEROUS_CONS_FLG());
			this.setList_PROC_COST_UNIT_QTY(struct.getList_PROC_COST_UNIT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PROC_COST_01(struct.getList_PROC_COST_01());
			this.setList_PROC_COST_02(struct.getList_PROC_COST_02());
			this.setList_PROC_COST_03(struct.getList_PROC_COST_03());
			this.setList_PROC_COST_04(struct.getList_PROC_COST_04());
			this.setList_PROC_COST_05(struct.getList_PROC_COST_05());
			this.setList_PROC_COST_06(struct.getList_PROC_COST_06());
			this.setList_PROC_COST_07(struct.getList_PROC_COST_07());
			this.setList_PROC_COST_08(struct.getList_PROC_COST_08());
			this.setList_PROC_COST_09(struct.getList_PROC_COST_09());
			this.setList_PROC_COST_10(struct.getList_PROC_COST_10());
			this.setList_PROC_COST_11(struct.getList_PROC_COST_11());
			this.setList_PROC_COST_12(struct.getList_PROC_COST_12());
			this.setList_PROC_COST_SUM(struct.getList_PROC_COST_SUM());
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
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
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

	// �� 3 �ϐ������l�F i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// �� 4 �ϐ������l�F i_COST_TYP_val


	final static String i_COST_TYP_val = null;

	// �� 5 �ϐ������l�F i_HALF_TERM_TYP_DN


	final static String i_HALF_TERM_TYP_DN = null;

	// �� 6 �ϐ������l�F i_COST_TYP_DN


	final static String i_COST_TYP_DN = null;

	// �� 7 �ϐ������l�F i_ONEROUS_CONS_FLG_name


	final static String i_ONEROUS_CONS_FLG_name = null;

	// �� 8 �ϐ������l�F i_ONEROUS_CONS_FLG_val


	final static String i_ONEROUS_CONS_FLG_val = null;

	// �� 9 �ϐ������l�F i_c_NoCheckClasificationCd


	final static String i_c_NoCheckClasificationCd = null;

	// �� 10 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 12 �ϐ������l�F i_l_PROC_COST_CLS_CD


	final static String i_l_PROC_COST_CLS_CD = null;

	// �� 13 �ϐ������l�F i_l_PROC_COST_CLS_NAME


	final static String i_l_PROC_COST_CLS_NAME = null;

	// �� 14 �ϐ������l�F i_l_CLASIFICATION_CD


	final static String i_l_CLASIFICATION_CD = null;

	// �� 15 �ϐ������l�F i_l_ONEROUS_CONS_FLG_DN


	final static String i_l_ONEROUS_CONS_FLG_DN = null;

	// �� 16 �ϐ������l�F i_l_HOME_CUR_UNIT


	final static String i_l_HOME_CUR_UNIT = null;

	// �� 17 �ϐ������l�F i_l_PROC_COST_01


	final static String i_l_PROC_COST_01 = null;

	// �� 18 �ϐ������l�F i_l_PROC_COST_02


	final static String i_l_PROC_COST_02 = null;

	// �� 19 �ϐ������l�F i_l_PROC_COST_03


	final static String i_l_PROC_COST_03 = null;

	// �� 20 �ϐ������l�F i_l_PROC_COST_04


	final static String i_l_PROC_COST_04 = null;

	// �� 21 �ϐ������l�F i_l_PROC_COST_05


	final static String i_l_PROC_COST_05 = null;

	// �� 22 �ϐ������l�F i_l_PROC_COST_06


	final static String i_l_PROC_COST_06 = null;

	// �� 23 �ϐ������l�F i_l_PROC_COST_07


	final static String i_l_PROC_COST_07 = null;

	// �� 24 �ϐ������l�F i_l_PROC_COST_08


	final static String i_l_PROC_COST_08 = null;

	// �� 25 �ϐ������l�F i_l_PROC_COST_09


	final static String i_l_PROC_COST_09 = null;

	// �� 26 �ϐ������l�F i_l_PROC_COST_10


	final static String i_l_PROC_COST_10 = null;

	// �� 27 �ϐ������l�F i_l_PROC_COST_11


	final static String i_l_PROC_COST_11 = null;

	// �� 28 �ϐ������l�F i_l_PROC_COST_12


	final static String i_l_PROC_COST_12 = null;

	// �� 29 �ϐ������l�F i_l_PROC_COST_SUM


	final static String i_l_PROC_COST_SUM = null;

	// �� 30 �ϐ������l�F i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// �� 31 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 32 �ϐ������l�F i_YEAR


	final static String i_YEAR = null;

	// �� 33 �ϐ������l�F i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// �� 34 �ϐ������l�F i_COST_TYP


	final static String i_COST_TYP = null;

	// �� 35 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 36 �ϐ������l�F i_IN_ITEM_CD


	final static String i_IN_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// �� 40 �ϐ������l�F i_PROC_COST_CLS_NAME


	final static String i_PROC_COST_CLS_NAME = null;

	// �� 41 �ϐ������l�F i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// �� 42 �ϐ������l�F i_ONEROUS_CONS_FLG


	final static String i_ONEROUS_CONS_FLG = null;

	// �� 43 �ϐ������l�F i_PROC_COST_UNIT_QTY


	final static String i_PROC_COST_UNIT_QTY = null;

	// �� 44 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 45 �ϐ������l�F i_PROC_COST_01


	final static String i_PROC_COST_01 = null;

	// �� 46 �ϐ������l�F i_PROC_COST_02


	final static String i_PROC_COST_02 = null;

	// �� 47 �ϐ������l�F i_PROC_COST_03


	final static String i_PROC_COST_03 = null;

	// �� 48 �ϐ������l�F i_PROC_COST_04


	final static String i_PROC_COST_04 = null;

	// �� 49 �ϐ������l�F i_PROC_COST_05


	final static String i_PROC_COST_05 = null;

	// �� 50 �ϐ������l�F i_PROC_COST_06


	final static String i_PROC_COST_06 = null;

	// �� 51 �ϐ������l�F i_PROC_COST_07


	final static String i_PROC_COST_07 = null;

	// �� 52 �ϐ������l�F i_PROC_COST_08


	final static String i_PROC_COST_08 = null;

	// �� 53 �ϐ������l�F i_PROC_COST_09


	final static String i_PROC_COST_09 = null;

	// �� 54 �ϐ������l�F i_PROC_COST_10


	final static String i_PROC_COST_10 = null;

	// �� 55 �ϐ������l�F i_PROC_COST_11


	final static String i_PROC_COST_11 = null;

	// �� 56 �ϐ������l�F i_PROC_COST_12


	final static String i_PROC_COST_12 = null;

	// �� 57 �ϐ������l�F i_PROC_COST_SUM


	final static String i_PROC_COST_SUM = null;

	// �� 58 �ϐ������l�F i_PROC_COST_01_NAME


	final static String i_PROC_COST_01_NAME = null;

	// �� 59 �ϐ������l�F i_PROC_COST_02_NAME


	final static String i_PROC_COST_02_NAME = null;

	// �� 60 �ϐ������l�F i_PROC_COST_03_NAME


	final static String i_PROC_COST_03_NAME = null;

	// �� 61 �ϐ������l�F i_PROC_COST_04_NAME


	final static String i_PROC_COST_04_NAME = null;

	// �� 62 �ϐ������l�F i_PROC_COST_05_NAME


	final static String i_PROC_COST_05_NAME = null;

	// �� 63 �ϐ������l�F i_PROC_COST_06_NAME


	final static String i_PROC_COST_06_NAME = null;

	// �� 64 �ϐ������l�F i_PROC_COST_07_NAME


	final static String i_PROC_COST_07_NAME = null;

	// �� 65 �ϐ������l�F i_PROC_COST_08_NAME


	final static String i_PROC_COST_08_NAME = null;

	// �� 66 �ϐ������l�F i_PROC_COST_09_NAME


	final static String i_PROC_COST_09_NAME = null;

	// �� 67 �ϐ������l�F i_PROC_COST_10_NAME


	final static String i_PROC_COST_10_NAME = null;

	// �� 68 �ϐ������l�F i_PROC_COST_11_NAME


	final static String i_PROC_COST_11_NAME = null;

	// �� 69 �ϐ������l�F i_PROC_COST_12_NAME


	final static String i_PROC_COST_12_NAME = null;

	// �� 70 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 71 �ϐ������l�F i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// �� 72 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 73 �ϐ������l�F i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// �� 74 �ϐ������l�F i_DEL_FLG


	final static String i_DEL_FLG = null;

	// �� 75 �ϐ������l�F i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// �� 76 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 77 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // �� 2 �ϐ������l�F i_l_ITEM_NAME
        final static String i_l_ITEM_NAME = null;
        // �� 3 �ϐ������l�F i_l_PROC_COST_CLS_CD
        final static String i_l_PROC_COST_CLS_CD = null;
        // �� 4 �ϐ������l�F i_l_PROC_COST_CLS_NAME
        final static String i_l_PROC_COST_CLS_NAME = null;
        // �� 5 �ϐ������l�F i_l_CLASIFICATION_CD
        final static String i_l_CLASIFICATION_CD = null;
        // �� 6 �ϐ������l�F i_l_ONEROUS_CONS_FLG_DN
        final static String i_l_ONEROUS_CONS_FLG_DN = null;
        // �� 7 �ϐ������l�F i_l_PROC_COST_01
        final static String i_l_PROC_COST_01 = null;
        // �� 8 �ϐ������l�F i_l_PROC_COST_02
        final static String i_l_PROC_COST_02 = null;
        // �� 9 �ϐ������l�F i_l_PROC_COST_03
        final static String i_l_PROC_COST_03 = null;
        // �� 10 �ϐ������l�F i_l_PROC_COST_04
        final static String i_l_PROC_COST_04 = null;
        // �� 11 �ϐ������l�F i_l_PROC_COST_05
        final static String i_l_PROC_COST_05 = null;
        // �� 12 �ϐ������l�F i_l_PROC_COST_06
        final static String i_l_PROC_COST_06 = null;
        // �� 13 �ϐ������l�F i_l_PROC_COST_07
        final static String i_l_PROC_COST_07 = null;
        // �� 14 �ϐ������l�F i_l_PROC_COST_08
        final static String i_l_PROC_COST_08 = null;
        // �� 15 �ϐ������l�F i_l_PROC_COST_09
        final static String i_l_PROC_COST_09 = null;
        // �� 16 �ϐ������l�F i_l_PROC_COST_10
        final static String i_l_PROC_COST_10 = null;
        // �� 17 �ϐ������l�F i_l_PROC_COST_11
        final static String i_l_PROC_COST_11 = null;
        // �� 18 �ϐ������l�F i_l_PROC_COST_12
        final static String i_l_PROC_COST_12 = null;
        // �� 19 �ϐ������l�F i_l_PROC_COST_SUM
        final static String i_l_PROC_COST_SUM = null;
        // �� 20 �ϐ������l�F i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // �� 21 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 22 �ϐ������l�F i_YEAR
        final static String i_YEAR = null;
        // �� 23 �ϐ������l�F i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // �� 24 �ϐ������l�F i_COST_TYP
        final static String i_COST_TYP = null;
        // �� 25 �ϐ������l�F i_CS_PROC_CD
        final static String i_CS_PROC_CD = null;
        // �� 26 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 27 �ϐ������l�F i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // �� 28 �ϐ������l�F i_PROC_COST_CLS_CD
        final static String i_PROC_COST_CLS_CD = null;
        // �� 29 �ϐ������l�F i_PROC_COST_CLS_NAME
        final static String i_PROC_COST_CLS_NAME = null;
        // �� 30 �ϐ������l�F i_CLASIFICATION_CD
        final static String i_CLASIFICATION_CD = null;
        // �� 31 �ϐ������l�F i_ONEROUS_CONS_FLG
        final static String i_ONEROUS_CONS_FLG = null;
        // �� 32 �ϐ������l�F i_PROC_COST_UNIT_QTY
        final static String i_PROC_COST_UNIT_QTY = null;
        // �� 33 �ϐ������l�F i_STOCK_UNIT
        final static String i_STOCK_UNIT = null;
        // �� 34 �ϐ������l�F i_PROC_COST_01
        final static String i_PROC_COST_01 = null;
        // �� 35 �ϐ������l�F i_PROC_COST_02
        final static String i_PROC_COST_02 = null;
        // �� 36 �ϐ������l�F i_PROC_COST_03
        final static String i_PROC_COST_03 = null;
        // �� 37 �ϐ������l�F i_PROC_COST_04
        final static String i_PROC_COST_04 = null;
        // �� 38 �ϐ������l�F i_PROC_COST_05
        final static String i_PROC_COST_05 = null;
        // �� 39 �ϐ������l�F i_PROC_COST_06
        final static String i_PROC_COST_06 = null;
        // �� 40 �ϐ������l�F i_PROC_COST_07
        final static String i_PROC_COST_07 = null;
        // �� 41 �ϐ������l�F i_PROC_COST_08
        final static String i_PROC_COST_08 = null;
        // �� 42 �ϐ������l�F i_PROC_COST_09
        final static String i_PROC_COST_09 = null;
        // �� 43 �ϐ������l�F i_PROC_COST_10
        final static String i_PROC_COST_10 = null;
        // �� 44 �ϐ������l�F i_PROC_COST_11
        final static String i_PROC_COST_11 = null;
        // �� 45 �ϐ������l�F i_PROC_COST_12
        final static String i_PROC_COST_12 = null;
        // �� 46 �ϐ������l�F i_PROC_COST_SUM
        final static String i_PROC_COST_SUM = null;
        // �� 47 �ϐ������l�F i_PROC_COST_01_NAME
        final static String i_PROC_COST_01_NAME = null;
        // �� 48 �ϐ������l�F i_PROC_COST_02_NAME
        final static String i_PROC_COST_02_NAME = null;
        // �� 49 �ϐ������l�F i_PROC_COST_03_NAME
        final static String i_PROC_COST_03_NAME = null;
        // �� 50 �ϐ������l�F i_PROC_COST_04_NAME
        final static String i_PROC_COST_04_NAME = null;
        // �� 51 �ϐ������l�F i_PROC_COST_05_NAME
        final static String i_PROC_COST_05_NAME = null;
        // �� 52 �ϐ������l�F i_PROC_COST_06_NAME
        final static String i_PROC_COST_06_NAME = null;
        // �� 53 �ϐ������l�F i_PROC_COST_07_NAME
        final static String i_PROC_COST_07_NAME = null;
        // �� 54 �ϐ������l�F i_PROC_COST_08_NAME
        final static String i_PROC_COST_08_NAME = null;
        // �� 55 �ϐ������l�F i_PROC_COST_09_NAME
        final static String i_PROC_COST_09_NAME = null;
        // �� 56 �ϐ������l�F i_PROC_COST_10_NAME
        final static String i_PROC_COST_10_NAME = null;
        // �� 57 �ϐ������l�F i_PROC_COST_11_NAME
        final static String i_PROC_COST_11_NAME = null;
        // �� 58 �ϐ������l�F i_PROC_COST_12_NAME
        final static String i_PROC_COST_12_NAME = null;
        // �� 59 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 60 �ϐ������l�F i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // �� 61 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 62 �ϐ������l�F i_CS_PROC_NAME
        final static String i_CS_PROC_NAME = null;
        // �� 63 �ϐ������l�F i_DEL_FLG
        final static String i_DEL_FLG = null;
        // �� 64 �ϐ������l�F i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // �� 65 �ϐ������l�F i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // �� 66 �ϐ������l�F i_COST_TYP_name
        final static String i_COST_TYP_name = null;
        // �� 67 �ϐ������l�F i_COST_TYP_val
        final static String i_COST_TYP_val = null;
        // �� 68 �ϐ������l�F i_HALF_TERM_TYP_DN
        final static String i_HALF_TERM_TYP_DN = null;
        // �� 69 �ϐ������l�F i_COST_TYP_DN
        final static String i_COST_TYP_DN = null;
        // �� 70 �ϐ������l�F i_ONEROUS_CONS_FLG_name
        final static String i_ONEROUS_CONS_FLG_name = null;
        // �� 71 �ϐ������l�F i_ONEROUS_CONS_FLG_val
        final static String i_ONEROUS_CONS_FLG_val = null;
        // �� 72 �ϐ������l�F i_NoCheckClasificationCdFlg
        final static String i_NoCheckClasificationCdFlg = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_ITEM_CD = i_l_ITEM_CD;
         m_l_ITEM_NAME = i_l_ITEM_NAME;
         m_l_PROC_COST_CLS_CD = i_l_PROC_COST_CLS_CD;
         m_l_PROC_COST_CLS_NAME = i_l_PROC_COST_CLS_NAME;
         m_l_CLASIFICATION_CD = i_l_CLASIFICATION_CD;
         m_l_ONEROUS_CONS_FLG_DN = i_l_ONEROUS_CONS_FLG_DN;
         m_l_PROC_COST_01 = i_l_PROC_COST_01;
         m_l_PROC_COST_02 = i_l_PROC_COST_02;
         m_l_PROC_COST_03 = i_l_PROC_COST_03;
         m_l_PROC_COST_04 = i_l_PROC_COST_04;
         m_l_PROC_COST_05 = i_l_PROC_COST_05;
         m_l_PROC_COST_06 = i_l_PROC_COST_06;
         m_l_PROC_COST_07 = i_l_PROC_COST_07;
         m_l_PROC_COST_08 = i_l_PROC_COST_08;
         m_l_PROC_COST_09 = i_l_PROC_COST_09;
         m_l_PROC_COST_10 = i_l_PROC_COST_10;
         m_l_PROC_COST_11 = i_l_PROC_COST_11;
         m_l_PROC_COST_12 = i_l_PROC_COST_12;
         m_l_PROC_COST_SUM = i_l_PROC_COST_SUM;
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_YEAR = i_YEAR;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_COST_TYP = i_COST_TYP;
         m_CS_PROC_CD = i_CS_PROC_CD;
         m_ITEM_CD = i_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
         m_PROC_COST_CLS_NAME = i_PROC_COST_CLS_NAME;
         m_CLASIFICATION_CD = i_CLASIFICATION_CD;
         m_ONEROUS_CONS_FLG = i_ONEROUS_CONS_FLG;
         m_PROC_COST_UNIT_QTY = i_PROC_COST_UNIT_QTY;
         m_STOCK_UNIT = i_STOCK_UNIT;
         m_PROC_COST_01 = i_PROC_COST_01;
         m_PROC_COST_02 = i_PROC_COST_02;
         m_PROC_COST_03 = i_PROC_COST_03;
         m_PROC_COST_04 = i_PROC_COST_04;
         m_PROC_COST_05 = i_PROC_COST_05;
         m_PROC_COST_06 = i_PROC_COST_06;
         m_PROC_COST_07 = i_PROC_COST_07;
         m_PROC_COST_08 = i_PROC_COST_08;
         m_PROC_COST_09 = i_PROC_COST_09;
         m_PROC_COST_10 = i_PROC_COST_10;
         m_PROC_COST_11 = i_PROC_COST_11;
         m_PROC_COST_12 = i_PROC_COST_12;
         m_PROC_COST_SUM = i_PROC_COST_SUM;
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
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_PLANT_NAME = i_PLANT_NAME;
         m_CS_PROC_NAME = i_CS_PROC_NAME;
         m_DEL_FLG = i_DEL_FLG;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_COST_TYP_name = i_COST_TYP_name;
         m_COST_TYP_val = i_COST_TYP_val;
         m_HALF_TERM_TYP_DN = i_HALF_TERM_TYP_DN;
         m_COST_TYP_DN = i_COST_TYP_DN;
         m_ONEROUS_CONS_FLG_name = i_ONEROUS_CONS_FLG_name;
         m_ONEROUS_CONS_FLG_val = i_ONEROUS_CONS_FLG_val;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
