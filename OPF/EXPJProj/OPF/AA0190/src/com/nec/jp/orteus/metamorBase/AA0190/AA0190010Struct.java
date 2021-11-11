/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0190/src/com/nec/jp/orteus/metamorBase/AA0190/AA0190010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0190;

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
/**
 * CLASS     : AA0190010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2017/01/09 08:38:51 $
 *
 */
//}}user_implement_code_header

public class AA0190010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_CLASS_CD1 */
	public String m_h_CLASS_CD1 = null;
	/** �� 2 �ϐ��F m_h_CLASS_CD2 */
	public String m_h_CLASS_CD2 = null;
	/** �� 3 �ϐ��F m_WriteStatus */
	public String m_WriteStatus = null;
	/** �� 4 �ϐ��F m_CLASS_NAME1 */
	public String m_CLASS_NAME1 = null;
	/** �� 5 �ϐ��F m_MODIFY_COUNT_CD1 */
	public String m_MODIFY_COUNT_CD1 = null;
	/** �� 6 �ϐ��F m_CLASS_CD1 */
	public String m_CLASS_CD1 = null;
	/** �� 7 �ϐ��F m_CLASS_NAME2 */
	public String m_CLASS_NAME2 = null;
	/** �� 8 �ϐ��F m_MODIFY_COUNT_CD2 */
	public String m_MODIFY_COUNT_CD2 = null;
	/** �� 9 �ϐ��F m_CLASS_CD2 */
	public String m_CLASS_CD2 = null;
	/** �� 10 �ϐ��F m_CLASS_CD3 */
	public String m_CLASS_CD3 = null;
	/** �� 11 �ϐ��F m_CLASS_NAME3 */
	public String m_CLASS_NAME3 = null;
	/** �� 12 �ϐ��F m_MODIFY_COUNT_CD3 */
	public String m_MODIFY_COUNT_CD3 = null;
	/** �� 13 �ϐ��F m_CUST_CLASS_01_CD */
	public String m_CUST_CLASS_01_CD = null;
	/** �� 14 �ϐ��F m_CUST_CLASS_02_CD */
	public String m_CUST_CLASS_02_CD = null;
	/** �� 15 �ϐ��F m_CUST_CLASS_03_CD */
	public String m_CUST_CLASS_03_CD = null;
	/** �� 16 �ϐ��F m_CUST_CLASS_04_CD */
	public String m_CUST_CLASS_04_CD = null;
	/** �� 17 �ϐ��F m_CUST_CLASS_05_CD */
	public String m_CUST_CLASS_05_CD = null;
	/** �� 18 �ϐ��F m_CUST_CLASS_06_CD */
	public String m_CUST_CLASS_06_CD = null;
	/** �� 19 �ϐ��F m_CUST_CLASS_07_CD */
	public String m_CUST_CLASS_07_CD = null;
	/** �� 20 �ϐ��F m_CUST_CLASS_08_CD */
	public String m_CUST_CLASS_08_CD = null;
	/** �� 21 �ϐ��F m_CUST_CLASS_09_CD */
	public String m_CUST_CLASS_09_CD = null;
	/** �� 22 �ϐ��F m_CUST_CLASS_10_CD */
	public String m_CUST_CLASS_10_CD = null;
	/** �� 23 �ϐ��F m_VEND_CLASS_01_CD */
	public String m_VEND_CLASS_01_CD = null;
	/** �� 24 �ϐ��F m_VEND_CLASS_02_CD */
	public String m_VEND_CLASS_02_CD = null;
	/** �� 25 �ϐ��F m_VEND_CLASS_03_CD */
	public String m_VEND_CLASS_03_CD = null;
	/** �� 26 �ϐ��F m_VEND_CLASS_04_CD */
	public String m_VEND_CLASS_04_CD = null;
	/** �� 27 �ϐ��F m_VEND_CLASS_05_CD */
	public String m_VEND_CLASS_05_CD = null;
	/** �� 28 �ϐ��F m_VEND_CLASS_06_CD */
	public String m_VEND_CLASS_06_CD = null;
	/** �� 29 �ϐ��F m_VEND_CLASS_07_CD */
	public String m_VEND_CLASS_07_CD = null;
	/** �� 30 �ϐ��F m_VEND_CLASS_08_CD */
	public String m_VEND_CLASS_08_CD = null;
	/** �� 31 �ϐ��F m_VEND_CLASS_09_CD */
	public String m_VEND_CLASS_09_CD = null;
	/** �� 32 �ϐ��F m_VEND_CLASS_10_CD */
	public String m_VEND_CLASS_10_CD = null;
	/** �� 33 �ϐ��F m_ITEM_CLASS_01_CD */
	public String m_ITEM_CLASS_01_CD = null;
	/** �� 34 �ϐ��F m_ITEM_CLASS_02_CD */
	public String m_ITEM_CLASS_02_CD = null;
	/** �� 35 �ϐ��F m_ITEM_CLASS_03_CD */
	public String m_ITEM_CLASS_03_CD = null;
	/** �� 36 �ϐ��F m_ITEM_CLASS_04_CD */
	public String m_ITEM_CLASS_04_CD = null;
	/** �� 37 �ϐ��F m_ITEM_CLASS_05_CD */
	public String m_ITEM_CLASS_05_CD = null;
	/** �� 38 �ϐ��F m_ITEM_CLASS_06_CD */
	public String m_ITEM_CLASS_06_CD = null;
	/** �� 39 �ϐ��F m_ITEM_CLASS_07_CD */
	public String m_ITEM_CLASS_07_CD = null;
	/** �� 40 �ϐ��F m_ITEM_CLASS_08_CD */
	public String m_ITEM_CLASS_08_CD = null;
	/** �� 41 �ϐ��F m_ITEM_CLASS_09_CD */
	public String m_ITEM_CLASS_09_CD = null;
	/** �� 42 �ϐ��F m_ITEM_CLASS_10_CD */
	public String m_ITEM_CLASS_10_CD = null;
	/** �� 43 �ϐ��F m_ITEM_CLASS_11_CD */
	public String m_ITEM_CLASS_11_CD = null;
	/** �� 44 �ϐ��F m_ITEM_CLASS_12_CD */
	public String m_ITEM_CLASS_12_CD = null;
	/** �� 45 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 46 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 47 �ϐ��F m_SEL_CLASS_CD1 */
	public String m_SEL_CLASS_CD1 = null;
	/** �� 48 �ϐ��F m_SEL_CLASS_CD2 */
	public String m_SEL_CLASS_CD2 = null;
	/** �� 49 �ϐ��F m_SEL_CLASS_CD3 */
	public String m_SEL_CLASS_CD3 = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_CLASS_CD1 */
	public List l_h_CLASS_CD1 = null;

	/** �� 2 List�ϐ��F l_h_CLASS_CD2 */
	public List l_h_CLASS_CD2 = null;

	/** �� 3 List�ϐ��F l_WriteStatus */
	public List l_WriteStatus = null;

	/** �� 4 List�ϐ��F l_CLASS_NAME1 */
	public List l_CLASS_NAME1 = null;

	/** �� 5 List�ϐ��F l_MODIFY_COUNT_CD1 */
	public List l_MODIFY_COUNT_CD1 = null;

	/** �� 6 List�ϐ��F l_CLASS_CD1 */
	public List l_CLASS_CD1 = null;

	/** �� 7 List�ϐ��F l_CLASS_NAME2 */
	public List l_CLASS_NAME2 = null;

	/** �� 8 List�ϐ��F l_MODIFY_COUNT_CD2 */
	public List l_MODIFY_COUNT_CD2 = null;

	/** �� 9 List�ϐ��F l_CLASS_CD2 */
	public List l_CLASS_CD2 = null;

	/** �� 10 List�ϐ��F l_CLASS_CD3 */
	public List l_CLASS_CD3 = null;

	/** �� 11 List�ϐ��F l_CLASS_NAME3 */
	public List l_CLASS_NAME3 = null;

	/** �� 12 List�ϐ��F l_MODIFY_COUNT_CD3 */
	public List l_MODIFY_COUNT_CD3 = null;

	/** �� 13 List�ϐ��F l_CUST_CLASS_01_CD */
	public List l_CUST_CLASS_01_CD = null;

	/** �� 14 List�ϐ��F l_CUST_CLASS_02_CD */
	public List l_CUST_CLASS_02_CD = null;

	/** �� 15 List�ϐ��F l_CUST_CLASS_03_CD */
	public List l_CUST_CLASS_03_CD = null;

	/** �� 16 List�ϐ��F l_CUST_CLASS_04_CD */
	public List l_CUST_CLASS_04_CD = null;

	/** �� 17 List�ϐ��F l_CUST_CLASS_05_CD */
	public List l_CUST_CLASS_05_CD = null;

	/** �� 18 List�ϐ��F l_CUST_CLASS_06_CD */
	public List l_CUST_CLASS_06_CD = null;

	/** �� 19 List�ϐ��F l_CUST_CLASS_07_CD */
	public List l_CUST_CLASS_07_CD = null;

	/** �� 20 List�ϐ��F l_CUST_CLASS_08_CD */
	public List l_CUST_CLASS_08_CD = null;

	/** �� 21 List�ϐ��F l_CUST_CLASS_09_CD */
	public List l_CUST_CLASS_09_CD = null;

	/** �� 22 List�ϐ��F l_CUST_CLASS_10_CD */
	public List l_CUST_CLASS_10_CD = null;

	/** �� 23 List�ϐ��F l_VEND_CLASS_01_CD */
	public List l_VEND_CLASS_01_CD = null;

	/** �� 24 List�ϐ��F l_VEND_CLASS_02_CD */
	public List l_VEND_CLASS_02_CD = null;

	/** �� 25 List�ϐ��F l_VEND_CLASS_03_CD */
	public List l_VEND_CLASS_03_CD = null;

	/** �� 26 List�ϐ��F l_VEND_CLASS_04_CD */
	public List l_VEND_CLASS_04_CD = null;

	/** �� 27 List�ϐ��F l_VEND_CLASS_05_CD */
	public List l_VEND_CLASS_05_CD = null;

	/** �� 28 List�ϐ��F l_VEND_CLASS_06_CD */
	public List l_VEND_CLASS_06_CD = null;

	/** �� 29 List�ϐ��F l_VEND_CLASS_07_CD */
	public List l_VEND_CLASS_07_CD = null;

	/** �� 30 List�ϐ��F l_VEND_CLASS_08_CD */
	public List l_VEND_CLASS_08_CD = null;

	/** �� 31 List�ϐ��F l_VEND_CLASS_09_CD */
	public List l_VEND_CLASS_09_CD = null;

	/** �� 32 List�ϐ��F l_VEND_CLASS_10_CD */
	public List l_VEND_CLASS_10_CD = null;

	/** �� 33 List�ϐ��F l_ITEM_CLASS_01_CD */
	public List l_ITEM_CLASS_01_CD = null;

	/** �� 34 List�ϐ��F l_ITEM_CLASS_02_CD */
	public List l_ITEM_CLASS_02_CD = null;

	/** �� 35 List�ϐ��F l_ITEM_CLASS_03_CD */
	public List l_ITEM_CLASS_03_CD = null;

	/** �� 36 List�ϐ��F l_ITEM_CLASS_04_CD */
	public List l_ITEM_CLASS_04_CD = null;

	/** �� 37 List�ϐ��F l_ITEM_CLASS_05_CD */
	public List l_ITEM_CLASS_05_CD = null;

	/** �� 38 List�ϐ��F l_ITEM_CLASS_06_CD */
	public List l_ITEM_CLASS_06_CD = null;

	/** �� 39 List�ϐ��F l_ITEM_CLASS_07_CD */
	public List l_ITEM_CLASS_07_CD = null;

	/** �� 40 List�ϐ��F l_ITEM_CLASS_08_CD */
	public List l_ITEM_CLASS_08_CD = null;

	/** �� 41 List�ϐ��F l_ITEM_CLASS_09_CD */
	public List l_ITEM_CLASS_09_CD = null;

	/** �� 42 List�ϐ��F l_ITEM_CLASS_10_CD */
	public List l_ITEM_CLASS_10_CD = null;

	/** �� 43 List�ϐ��F l_ITEM_CLASS_11_CD */
	public List l_ITEM_CLASS_11_CD = null;

	/** �� 44 List�ϐ��F l_ITEM_CLASS_12_CD */
	public List l_ITEM_CLASS_12_CD = null;

	/** �� 45 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 46 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 47 List�ϐ��F l_SEL_CLASS_CD1 */
	public List l_SEL_CLASS_CD1 = null;

	/** �� 48 List�ϐ��F l_SEL_CLASS_CD2 */
	public List l_SEL_CLASS_CD2 = null;

	/** �� 49 List�ϐ��F l_SEL_CLASS_CD3 */
	public List l_SEL_CLASS_CD3 = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_CLASS_CD1() { return m_h_CLASS_CD1; }
	public String geth_CLASS_CD2() { return m_h_CLASS_CD2; }
	public String getWriteStatus() { return m_WriteStatus; }
	public String getCLASS_NAME1() { return m_CLASS_NAME1; }
	public String getMODIFY_COUNT_CD1() { return m_MODIFY_COUNT_CD1; }
	public String getCLASS_CD1() { return m_CLASS_CD1; }
	public String getCLASS_NAME2() { return m_CLASS_NAME2; }
	public String getMODIFY_COUNT_CD2() { return m_MODIFY_COUNT_CD2; }
	public String getCLASS_CD2() { return m_CLASS_CD2; }
	public String getCLASS_CD3() { return m_CLASS_CD3; }
	public String getCLASS_NAME3() { return m_CLASS_NAME3; }
	public String getMODIFY_COUNT_CD3() { return m_MODIFY_COUNT_CD3; }
	public String getCUST_CLASS_01_CD() { return m_CUST_CLASS_01_CD; }
	public String getCUST_CLASS_02_CD() { return m_CUST_CLASS_02_CD; }
	public String getCUST_CLASS_03_CD() { return m_CUST_CLASS_03_CD; }
	public String getCUST_CLASS_04_CD() { return m_CUST_CLASS_04_CD; }
	public String getCUST_CLASS_05_CD() { return m_CUST_CLASS_05_CD; }
	public String getCUST_CLASS_06_CD() { return m_CUST_CLASS_06_CD; }
	public String getCUST_CLASS_07_CD() { return m_CUST_CLASS_07_CD; }
	public String getCUST_CLASS_08_CD() { return m_CUST_CLASS_08_CD; }
	public String getCUST_CLASS_09_CD() { return m_CUST_CLASS_09_CD; }
	public String getCUST_CLASS_10_CD() { return m_CUST_CLASS_10_CD; }
	public String getVEND_CLASS_01_CD() { return m_VEND_CLASS_01_CD; }
	public String getVEND_CLASS_02_CD() { return m_VEND_CLASS_02_CD; }
	public String getVEND_CLASS_03_CD() { return m_VEND_CLASS_03_CD; }
	public String getVEND_CLASS_04_CD() { return m_VEND_CLASS_04_CD; }
	public String getVEND_CLASS_05_CD() { return m_VEND_CLASS_05_CD; }
	public String getVEND_CLASS_06_CD() { return m_VEND_CLASS_06_CD; }
	public String getVEND_CLASS_07_CD() { return m_VEND_CLASS_07_CD; }
	public String getVEND_CLASS_08_CD() { return m_VEND_CLASS_08_CD; }
	public String getVEND_CLASS_09_CD() { return m_VEND_CLASS_09_CD; }
	public String getVEND_CLASS_10_CD() { return m_VEND_CLASS_10_CD; }
	public String getITEM_CLASS_01_CD() { return m_ITEM_CLASS_01_CD; }
	public String getITEM_CLASS_02_CD() { return m_ITEM_CLASS_02_CD; }
	public String getITEM_CLASS_03_CD() { return m_ITEM_CLASS_03_CD; }
	public String getITEM_CLASS_04_CD() { return m_ITEM_CLASS_04_CD; }
	public String getITEM_CLASS_05_CD() { return m_ITEM_CLASS_05_CD; }
	public String getITEM_CLASS_06_CD() { return m_ITEM_CLASS_06_CD; }
	public String getITEM_CLASS_07_CD() { return m_ITEM_CLASS_07_CD; }
	public String getITEM_CLASS_08_CD() { return m_ITEM_CLASS_08_CD; }
	public String getITEM_CLASS_09_CD() { return m_ITEM_CLASS_09_CD; }
	public String getITEM_CLASS_10_CD() { return m_ITEM_CLASS_10_CD; }
	public String getITEM_CLASS_11_CD() { return m_ITEM_CLASS_11_CD; }
	public String getITEM_CLASS_12_CD() { return m_ITEM_CLASS_12_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getSEL_CLASS_CD1() { return m_SEL_CLASS_CD1; }
	public String getSEL_CLASS_CD2() { return m_SEL_CLASS_CD2; }
	public String getSEL_CLASS_CD3() { return m_SEL_CLASS_CD3; }

	public List getList_h_CLASS_CD1() { return l_h_CLASS_CD1; }
	public List getList_h_CLASS_CD2() { return l_h_CLASS_CD2; }
	public List getList_WriteStatus() { return l_WriteStatus; }
	public List getList_CLASS_NAME1() { return l_CLASS_NAME1; }
	public List getList_MODIFY_COUNT_CD1() { return l_MODIFY_COUNT_CD1; }
	public List getList_CLASS_CD1() { return l_CLASS_CD1; }
	public List getList_CLASS_NAME2() { return l_CLASS_NAME2; }
	public List getList_MODIFY_COUNT_CD2() { return l_MODIFY_COUNT_CD2; }
	public List getList_CLASS_CD2() { return l_CLASS_CD2; }
	public List getList_CLASS_CD3() { return l_CLASS_CD3; }
	public List getList_CLASS_NAME3() { return l_CLASS_NAME3; }
	public List getList_MODIFY_COUNT_CD3() { return l_MODIFY_COUNT_CD3; }
	public List getList_CUST_CLASS_01_CD() { return l_CUST_CLASS_01_CD; }
	public List getList_CUST_CLASS_02_CD() { return l_CUST_CLASS_02_CD; }
	public List getList_CUST_CLASS_03_CD() { return l_CUST_CLASS_03_CD; }
	public List getList_CUST_CLASS_04_CD() { return l_CUST_CLASS_04_CD; }
	public List getList_CUST_CLASS_05_CD() { return l_CUST_CLASS_05_CD; }
	public List getList_CUST_CLASS_06_CD() { return l_CUST_CLASS_06_CD; }
	public List getList_CUST_CLASS_07_CD() { return l_CUST_CLASS_07_CD; }
	public List getList_CUST_CLASS_08_CD() { return l_CUST_CLASS_08_CD; }
	public List getList_CUST_CLASS_09_CD() { return l_CUST_CLASS_09_CD; }
	public List getList_CUST_CLASS_10_CD() { return l_CUST_CLASS_10_CD; }
	public List getList_VEND_CLASS_01_CD() { return l_VEND_CLASS_01_CD; }
	public List getList_VEND_CLASS_02_CD() { return l_VEND_CLASS_02_CD; }
	public List getList_VEND_CLASS_03_CD() { return l_VEND_CLASS_03_CD; }
	public List getList_VEND_CLASS_04_CD() { return l_VEND_CLASS_04_CD; }
	public List getList_VEND_CLASS_05_CD() { return l_VEND_CLASS_05_CD; }
	public List getList_VEND_CLASS_06_CD() { return l_VEND_CLASS_06_CD; }
	public List getList_VEND_CLASS_07_CD() { return l_VEND_CLASS_07_CD; }
	public List getList_VEND_CLASS_08_CD() { return l_VEND_CLASS_08_CD; }
	public List getList_VEND_CLASS_09_CD() { return l_VEND_CLASS_09_CD; }
	public List getList_VEND_CLASS_10_CD() { return l_VEND_CLASS_10_CD; }
	public List getList_ITEM_CLASS_01_CD() { return l_ITEM_CLASS_01_CD; }
	public List getList_ITEM_CLASS_02_CD() { return l_ITEM_CLASS_02_CD; }
	public List getList_ITEM_CLASS_03_CD() { return l_ITEM_CLASS_03_CD; }
	public List getList_ITEM_CLASS_04_CD() { return l_ITEM_CLASS_04_CD; }
	public List getList_ITEM_CLASS_05_CD() { return l_ITEM_CLASS_05_CD; }
	public List getList_ITEM_CLASS_06_CD() { return l_ITEM_CLASS_06_CD; }
	public List getList_ITEM_CLASS_07_CD() { return l_ITEM_CLASS_07_CD; }
	public List getList_ITEM_CLASS_08_CD() { return l_ITEM_CLASS_08_CD; }
	public List getList_ITEM_CLASS_09_CD() { return l_ITEM_CLASS_09_CD; }
	public List getList_ITEM_CLASS_10_CD() { return l_ITEM_CLASS_10_CD; }
	public List getList_ITEM_CLASS_11_CD() { return l_ITEM_CLASS_11_CD; }
	public List getList_ITEM_CLASS_12_CD() { return l_ITEM_CLASS_12_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_SEL_CLASS_CD1() { return l_SEL_CLASS_CD1; }
	public List getList_SEL_CLASS_CD2() { return l_SEL_CLASS_CD2; }
	public List getList_SEL_CLASS_CD3() { return l_SEL_CLASS_CD3; }

	public void seth_CLASS_CD1(String val) { m_h_CLASS_CD1 = val; }
	public void seth_CLASS_CD2(String val) { m_h_CLASS_CD2 = val; }
	public void setWriteStatus(String val) { m_WriteStatus = val; }
	public void setCLASS_NAME1(String val) { m_CLASS_NAME1 = val; }
	public void setMODIFY_COUNT_CD1(String val) { m_MODIFY_COUNT_CD1 = val; }
	public void setCLASS_CD1(String val) { m_CLASS_CD1 = val; }
	public void setCLASS_NAME2(String val) { m_CLASS_NAME2 = val; }
	public void setMODIFY_COUNT_CD2(String val) { m_MODIFY_COUNT_CD2 = val; }
	public void setCLASS_CD2(String val) { m_CLASS_CD2 = val; }
	public void setCLASS_CD3(String val) { m_CLASS_CD3 = val; }
	public void setCLASS_NAME3(String val) { m_CLASS_NAME3 = val; }
	public void setMODIFY_COUNT_CD3(String val) { m_MODIFY_COUNT_CD3 = val; }
	public void setCUST_CLASS_01_CD(String val) { m_CUST_CLASS_01_CD = val; }
	public void setCUST_CLASS_02_CD(String val) { m_CUST_CLASS_02_CD = val; }
	public void setCUST_CLASS_03_CD(String val) { m_CUST_CLASS_03_CD = val; }
	public void setCUST_CLASS_04_CD(String val) { m_CUST_CLASS_04_CD = val; }
	public void setCUST_CLASS_05_CD(String val) { m_CUST_CLASS_05_CD = val; }
	public void setCUST_CLASS_06_CD(String val) { m_CUST_CLASS_06_CD = val; }
	public void setCUST_CLASS_07_CD(String val) { m_CUST_CLASS_07_CD = val; }
	public void setCUST_CLASS_08_CD(String val) { m_CUST_CLASS_08_CD = val; }
	public void setCUST_CLASS_09_CD(String val) { m_CUST_CLASS_09_CD = val; }
	public void setCUST_CLASS_10_CD(String val) { m_CUST_CLASS_10_CD = val; }
	public void setVEND_CLASS_01_CD(String val) { m_VEND_CLASS_01_CD = val; }
	public void setVEND_CLASS_02_CD(String val) { m_VEND_CLASS_02_CD = val; }
	public void setVEND_CLASS_03_CD(String val) { m_VEND_CLASS_03_CD = val; }
	public void setVEND_CLASS_04_CD(String val) { m_VEND_CLASS_04_CD = val; }
	public void setVEND_CLASS_05_CD(String val) { m_VEND_CLASS_05_CD = val; }
	public void setVEND_CLASS_06_CD(String val) { m_VEND_CLASS_06_CD = val; }
	public void setVEND_CLASS_07_CD(String val) { m_VEND_CLASS_07_CD = val; }
	public void setVEND_CLASS_08_CD(String val) { m_VEND_CLASS_08_CD = val; }
	public void setVEND_CLASS_09_CD(String val) { m_VEND_CLASS_09_CD = val; }
	public void setVEND_CLASS_10_CD(String val) { m_VEND_CLASS_10_CD = val; }
	public void setITEM_CLASS_01_CD(String val) { m_ITEM_CLASS_01_CD = val; }
	public void setITEM_CLASS_02_CD(String val) { m_ITEM_CLASS_02_CD = val; }
	public void setITEM_CLASS_03_CD(String val) { m_ITEM_CLASS_03_CD = val; }
	public void setITEM_CLASS_04_CD(String val) { m_ITEM_CLASS_04_CD = val; }
	public void setITEM_CLASS_05_CD(String val) { m_ITEM_CLASS_05_CD = val; }
	public void setITEM_CLASS_06_CD(String val) { m_ITEM_CLASS_06_CD = val; }
	public void setITEM_CLASS_07_CD(String val) { m_ITEM_CLASS_07_CD = val; }
	public void setITEM_CLASS_08_CD(String val) { m_ITEM_CLASS_08_CD = val; }
	public void setITEM_CLASS_09_CD(String val) { m_ITEM_CLASS_09_CD = val; }
	public void setITEM_CLASS_10_CD(String val) { m_ITEM_CLASS_10_CD = val; }
	public void setITEM_CLASS_11_CD(String val) { m_ITEM_CLASS_11_CD = val; }
	public void setITEM_CLASS_12_CD(String val) { m_ITEM_CLASS_12_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setSEL_CLASS_CD1(String val) { m_SEL_CLASS_CD1 = val; }
	public void setSEL_CLASS_CD2(String val) { m_SEL_CLASS_CD2 = val; }
	public void setSEL_CLASS_CD3(String val) { m_SEL_CLASS_CD3 = val; }


	public void setList_h_CLASS_CD1(List list) { l_h_CLASS_CD1 = list; }
	public void setList_h_CLASS_CD2(List list) { l_h_CLASS_CD2 = list; }
	public void setList_WriteStatus(List list) { l_WriteStatus = list; }
	public void setList_CLASS_NAME1(List list) { l_CLASS_NAME1 = list; }
	public void setList_MODIFY_COUNT_CD1(List list) { l_MODIFY_COUNT_CD1 = list; }
	public void setList_CLASS_CD1(List list) { l_CLASS_CD1 = list; }
	public void setList_CLASS_NAME2(List list) { l_CLASS_NAME2 = list; }
	public void setList_MODIFY_COUNT_CD2(List list) { l_MODIFY_COUNT_CD2 = list; }
	public void setList_CLASS_CD2(List list) { l_CLASS_CD2 = list; }
	public void setList_CLASS_CD3(List list) { l_CLASS_CD3 = list; }
	public void setList_CLASS_NAME3(List list) { l_CLASS_NAME3 = list; }
	public void setList_MODIFY_COUNT_CD3(List list) { l_MODIFY_COUNT_CD3 = list; }
	public void setList_CUST_CLASS_01_CD(List list) { l_CUST_CLASS_01_CD = list; }
	public void setList_CUST_CLASS_02_CD(List list) { l_CUST_CLASS_02_CD = list; }
	public void setList_CUST_CLASS_03_CD(List list) { l_CUST_CLASS_03_CD = list; }
	public void setList_CUST_CLASS_04_CD(List list) { l_CUST_CLASS_04_CD = list; }
	public void setList_CUST_CLASS_05_CD(List list) { l_CUST_CLASS_05_CD = list; }
	public void setList_CUST_CLASS_06_CD(List list) { l_CUST_CLASS_06_CD = list; }
	public void setList_CUST_CLASS_07_CD(List list) { l_CUST_CLASS_07_CD = list; }
	public void setList_CUST_CLASS_08_CD(List list) { l_CUST_CLASS_08_CD = list; }
	public void setList_CUST_CLASS_09_CD(List list) { l_CUST_CLASS_09_CD = list; }
	public void setList_CUST_CLASS_10_CD(List list) { l_CUST_CLASS_10_CD = list; }
	public void setList_VEND_CLASS_01_CD(List list) { l_VEND_CLASS_01_CD = list; }
	public void setList_VEND_CLASS_02_CD(List list) { l_VEND_CLASS_02_CD = list; }
	public void setList_VEND_CLASS_03_CD(List list) { l_VEND_CLASS_03_CD = list; }
	public void setList_VEND_CLASS_04_CD(List list) { l_VEND_CLASS_04_CD = list; }
	public void setList_VEND_CLASS_05_CD(List list) { l_VEND_CLASS_05_CD = list; }
	public void setList_VEND_CLASS_06_CD(List list) { l_VEND_CLASS_06_CD = list; }
	public void setList_VEND_CLASS_07_CD(List list) { l_VEND_CLASS_07_CD = list; }
	public void setList_VEND_CLASS_08_CD(List list) { l_VEND_CLASS_08_CD = list; }
	public void setList_VEND_CLASS_09_CD(List list) { l_VEND_CLASS_09_CD = list; }
	public void setList_VEND_CLASS_10_CD(List list) { l_VEND_CLASS_10_CD = list; }
	public void setList_ITEM_CLASS_01_CD(List list) { l_ITEM_CLASS_01_CD = list; }
	public void setList_ITEM_CLASS_02_CD(List list) { l_ITEM_CLASS_02_CD = list; }
	public void setList_ITEM_CLASS_03_CD(List list) { l_ITEM_CLASS_03_CD = list; }
	public void setList_ITEM_CLASS_04_CD(List list) { l_ITEM_CLASS_04_CD = list; }
	public void setList_ITEM_CLASS_05_CD(List list) { l_ITEM_CLASS_05_CD = list; }
	public void setList_ITEM_CLASS_06_CD(List list) { l_ITEM_CLASS_06_CD = list; }
	public void setList_ITEM_CLASS_07_CD(List list) { l_ITEM_CLASS_07_CD = list; }
	public void setList_ITEM_CLASS_08_CD(List list) { l_ITEM_CLASS_08_CD = list; }
	public void setList_ITEM_CLASS_09_CD(List list) { l_ITEM_CLASS_09_CD = list; }
	public void setList_ITEM_CLASS_10_CD(List list) { l_ITEM_CLASS_10_CD = list; }
	public void setList_ITEM_CLASS_11_CD(List list) { l_ITEM_CLASS_11_CD = list; }
	public void setList_ITEM_CLASS_12_CD(List list) { l_ITEM_CLASS_12_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_SEL_CLASS_CD1(List list) { l_SEL_CLASS_CD1 = list; }
	public void setList_SEL_CLASS_CD2(List list) { l_SEL_CLASS_CD2 = list; }
	public void setList_SEL_CLASS_CD3(List list) { l_SEL_CLASS_CD3 = list; }

	public int setL2L_h_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CLASS_CD1 == null) {
			l_h_CLASS_CD1 = new ArrayList();
		} else {
			l_h_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CLASS_CD1.add(((AA0190010Struct) list.get(i)).geth_CLASS_CD1());
		}
		return size;
	}
	public int setL2L_h_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CLASS_CD2 == null) {
			l_h_CLASS_CD2 = new ArrayList();
		} else {
			l_h_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CLASS_CD2.add(((AA0190010Struct) list.get(i)).geth_CLASS_CD2());
		}
		return size;
	}
	public int setL2L_WriteStatus(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WriteStatus == null) {
			l_WriteStatus = new ArrayList();
		} else {
			l_WriteStatus.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WriteStatus.add(((AA0190010Struct) list.get(i)).getWriteStatus());
		}
		return size;
	}
	public int setL2L_CLASS_NAME1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME1 == null) {
			l_CLASS_NAME1 = new ArrayList();
		} else {
			l_CLASS_NAME1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME1.add(((AA0190010Struct) list.get(i)).getCLASS_NAME1());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD1 == null) {
			l_MODIFY_COUNT_CD1 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD1.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD1());
		}
		return size;
	}
	public int setL2L_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD1 == null) {
			l_CLASS_CD1 = new ArrayList();
		} else {
			l_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD1.add(((AA0190010Struct) list.get(i)).getCLASS_CD1());
		}
		return size;
	}
	public int setL2L_CLASS_NAME2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME2 == null) {
			l_CLASS_NAME2 = new ArrayList();
		} else {
			l_CLASS_NAME2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME2.add(((AA0190010Struct) list.get(i)).getCLASS_NAME2());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD2 == null) {
			l_MODIFY_COUNT_CD2 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD2.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD2());
		}
		return size;
	}
	public int setL2L_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD2 == null) {
			l_CLASS_CD2 = new ArrayList();
		} else {
			l_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD2.add(((AA0190010Struct) list.get(i)).getCLASS_CD2());
		}
		return size;
	}
	public int setL2L_CLASS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CD3 == null) {
			l_CLASS_CD3 = new ArrayList();
		} else {
			l_CLASS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CD3.add(((AA0190010Struct) list.get(i)).getCLASS_CD3());
		}
		return size;
	}
	public int setL2L_CLASS_NAME3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME3 == null) {
			l_CLASS_NAME3 = new ArrayList();
		} else {
			l_CLASS_NAME3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME3.add(((AA0190010Struct) list.get(i)).getCLASS_NAME3());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_CD3 == null) {
			l_MODIFY_COUNT_CD3 = new ArrayList();
		} else {
			l_MODIFY_COUNT_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_CD3.add(((AA0190010Struct) list.get(i)).getMODIFY_COUNT_CD3());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_01_CD == null) {
			l_CUST_CLASS_01_CD = new ArrayList();
		} else {
			l_CUST_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_02_CD == null) {
			l_CUST_CLASS_02_CD = new ArrayList();
		} else {
			l_CUST_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_03_CD == null) {
			l_CUST_CLASS_03_CD = new ArrayList();
		} else {
			l_CUST_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_04_CD == null) {
			l_CUST_CLASS_04_CD = new ArrayList();
		} else {
			l_CUST_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_05_CD == null) {
			l_CUST_CLASS_05_CD = new ArrayList();
		} else {
			l_CUST_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_06_CD == null) {
			l_CUST_CLASS_06_CD = new ArrayList();
		} else {
			l_CUST_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_07_CD == null) {
			l_CUST_CLASS_07_CD = new ArrayList();
		} else {
			l_CUST_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_08_CD == null) {
			l_CUST_CLASS_08_CD = new ArrayList();
		} else {
			l_CUST_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_09_CD == null) {
			l_CUST_CLASS_09_CD = new ArrayList();
		} else {
			l_CUST_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_CUST_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CLASS_10_CD == null) {
			l_CUST_CLASS_10_CD = new ArrayList();
		} else {
			l_CUST_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getCUST_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_01_CD == null) {
			l_VEND_CLASS_01_CD = new ArrayList();
		} else {
			l_VEND_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_02_CD == null) {
			l_VEND_CLASS_02_CD = new ArrayList();
		} else {
			l_VEND_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_03_CD == null) {
			l_VEND_CLASS_03_CD = new ArrayList();
		} else {
			l_VEND_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_04_CD == null) {
			l_VEND_CLASS_04_CD = new ArrayList();
		} else {
			l_VEND_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_05_CD == null) {
			l_VEND_CLASS_05_CD = new ArrayList();
		} else {
			l_VEND_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_06_CD == null) {
			l_VEND_CLASS_06_CD = new ArrayList();
		} else {
			l_VEND_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_07_CD == null) {
			l_VEND_CLASS_07_CD = new ArrayList();
		} else {
			l_VEND_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_08_CD == null) {
			l_VEND_CLASS_08_CD = new ArrayList();
		} else {
			l_VEND_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_09_CD == null) {
			l_VEND_CLASS_09_CD = new ArrayList();
		} else {
			l_VEND_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_VEND_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CLASS_10_CD == null) {
			l_VEND_CLASS_10_CD = new ArrayList();
		} else {
			l_VEND_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getVEND_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_01_CD == null) {
			l_ITEM_CLASS_01_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_01_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_02_CD == null) {
			l_ITEM_CLASS_02_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_02_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_03_CD == null) {
			l_ITEM_CLASS_03_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_03_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_04_CD == null) {
			l_ITEM_CLASS_04_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_04_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_05_CD == null) {
			l_ITEM_CLASS_05_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_05_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_06_CD == null) {
			l_ITEM_CLASS_06_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_06_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_07_CD == null) {
			l_ITEM_CLASS_07_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_07_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_08_CD == null) {
			l_ITEM_CLASS_08_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_08_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_09_CD == null) {
			l_ITEM_CLASS_09_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_09_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_10_CD == null) {
			l_ITEM_CLASS_10_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_10_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_11_CD == null) {
			l_ITEM_CLASS_11_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_11_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_12_CD == null) {
			l_ITEM_CLASS_12_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_12_CD.add(((AA0190010Struct) list.get(i)).getITEM_CLASS_12_CD());
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
			l_l_COUNT.add(((AA0190010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AA0190010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD1 == null) {
			l_SEL_CLASS_CD1 = new ArrayList();
		} else {
			l_SEL_CLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD1.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD1());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD2 == null) {
			l_SEL_CLASS_CD2 = new ArrayList();
		} else {
			l_SEL_CLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD2.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD2());
		}
		return size;
	}
	public int setL2L_SEL_CLASS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_CLASS_CD3 == null) {
			l_SEL_CLASS_CD3 = new ArrayList();
		} else {
			l_SEL_CLASS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_CLASS_CD3.add(((AA0190010Struct) list.get(i)).getSEL_CLASS_CD3());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_CLASS_CD1 = null;
		m_h_CLASS_CD2 = null;
		m_WriteStatus = null;
		m_CLASS_NAME1 = null;
		m_MODIFY_COUNT_CD1 = null;
		m_CLASS_CD1 = null;
		m_CLASS_NAME2 = null;
		m_MODIFY_COUNT_CD2 = null;
		m_CLASS_CD2 = null;
		m_CLASS_CD3 = null;
		m_CLASS_NAME3 = null;
		m_MODIFY_COUNT_CD3 = null;
		m_CUST_CLASS_01_CD = null;
		m_CUST_CLASS_02_CD = null;
		m_CUST_CLASS_03_CD = null;
		m_CUST_CLASS_04_CD = null;
		m_CUST_CLASS_05_CD = null;
		m_CUST_CLASS_06_CD = null;
		m_CUST_CLASS_07_CD = null;
		m_CUST_CLASS_08_CD = null;
		m_CUST_CLASS_09_CD = null;
		m_CUST_CLASS_10_CD = null;
		m_VEND_CLASS_01_CD = null;
		m_VEND_CLASS_02_CD = null;
		m_VEND_CLASS_03_CD = null;
		m_VEND_CLASS_04_CD = null;
		m_VEND_CLASS_05_CD = null;
		m_VEND_CLASS_06_CD = null;
		m_VEND_CLASS_07_CD = null;
		m_VEND_CLASS_08_CD = null;
		m_VEND_CLASS_09_CD = null;
		m_VEND_CLASS_10_CD = null;
		m_ITEM_CLASS_01_CD = null;
		m_ITEM_CLASS_02_CD = null;
		m_ITEM_CLASS_03_CD = null;
		m_ITEM_CLASS_04_CD = null;
		m_ITEM_CLASS_05_CD = null;
		m_ITEM_CLASS_06_CD = null;
		m_ITEM_CLASS_07_CD = null;
		m_ITEM_CLASS_08_CD = null;
		m_ITEM_CLASS_09_CD = null;
		m_ITEM_CLASS_10_CD = null;
		m_ITEM_CLASS_11_CD = null;
		m_ITEM_CLASS_12_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_SEL_CLASS_CD1 = null;
		m_SEL_CLASS_CD2 = null;
		m_SEL_CLASS_CD3 = null;

		l_h_CLASS_CD1 = null;
		l_h_CLASS_CD2 = null;
		l_WriteStatus = null;
		l_CLASS_NAME1 = null;
		l_MODIFY_COUNT_CD1 = null;
		l_CLASS_CD1 = null;
		l_CLASS_NAME2 = null;
		l_MODIFY_COUNT_CD2 = null;
		l_CLASS_CD2 = null;
		l_CLASS_CD3 = null;
		l_CLASS_NAME3 = null;
		l_MODIFY_COUNT_CD3 = null;
		l_CUST_CLASS_01_CD = null;
		l_CUST_CLASS_02_CD = null;
		l_CUST_CLASS_03_CD = null;
		l_CUST_CLASS_04_CD = null;
		l_CUST_CLASS_05_CD = null;
		l_CUST_CLASS_06_CD = null;
		l_CUST_CLASS_07_CD = null;
		l_CUST_CLASS_08_CD = null;
		l_CUST_CLASS_09_CD = null;
		l_CUST_CLASS_10_CD = null;
		l_VEND_CLASS_01_CD = null;
		l_VEND_CLASS_02_CD = null;
		l_VEND_CLASS_03_CD = null;
		l_VEND_CLASS_04_CD = null;
		l_VEND_CLASS_05_CD = null;
		l_VEND_CLASS_06_CD = null;
		l_VEND_CLASS_07_CD = null;
		l_VEND_CLASS_08_CD = null;
		l_VEND_CLASS_09_CD = null;
		l_VEND_CLASS_10_CD = null;
		l_ITEM_CLASS_01_CD = null;
		l_ITEM_CLASS_02_CD = null;
		l_ITEM_CLASS_03_CD = null;
		l_ITEM_CLASS_04_CD = null;
		l_ITEM_CLASS_05_CD = null;
		l_ITEM_CLASS_06_CD = null;
		l_ITEM_CLASS_07_CD = null;
		l_ITEM_CLASS_08_CD = null;
		l_ITEM_CLASS_09_CD = null;
		l_ITEM_CLASS_10_CD = null;
		l_ITEM_CLASS_11_CD = null;
		l_ITEM_CLASS_12_CD = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_SEL_CLASS_CD1 = null;
		l_SEL_CLASS_CD2 = null;
		l_SEL_CLASS_CD3 = null;

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
	 * medAA0190010�N���X�̕W���R���X�g���N�^
	 */
	public AA0190010Struct()
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
	public void setStruct(AA0190010Struct struct)
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
	public void setStructM(AA0190010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_CLASS_CD1(struct.geth_CLASS_CD1());
			this.seth_CLASS_CD2(struct.geth_CLASS_CD2());
			this.setWriteStatus(struct.getWriteStatus());
			this.setCLASS_NAME1(struct.getCLASS_NAME1());
			this.setMODIFY_COUNT_CD1(struct.getMODIFY_COUNT_CD1());
			this.setCLASS_CD1(struct.getCLASS_CD1());
			this.setCLASS_NAME2(struct.getCLASS_NAME2());
			this.setMODIFY_COUNT_CD2(struct.getMODIFY_COUNT_CD2());
			this.setCLASS_CD2(struct.getCLASS_CD2());
			this.setCLASS_CD3(struct.getCLASS_CD3());
			this.setCLASS_NAME3(struct.getCLASS_NAME3());
			this.setMODIFY_COUNT_CD3(struct.getMODIFY_COUNT_CD3());
			this.setCUST_CLASS_01_CD(struct.getCUST_CLASS_01_CD());
			this.setCUST_CLASS_02_CD(struct.getCUST_CLASS_02_CD());
			this.setCUST_CLASS_03_CD(struct.getCUST_CLASS_03_CD());
			this.setCUST_CLASS_04_CD(struct.getCUST_CLASS_04_CD());
			this.setCUST_CLASS_05_CD(struct.getCUST_CLASS_05_CD());
			this.setCUST_CLASS_06_CD(struct.getCUST_CLASS_06_CD());
			this.setCUST_CLASS_07_CD(struct.getCUST_CLASS_07_CD());
			this.setCUST_CLASS_08_CD(struct.getCUST_CLASS_08_CD());
			this.setCUST_CLASS_09_CD(struct.getCUST_CLASS_09_CD());
			this.setCUST_CLASS_10_CD(struct.getCUST_CLASS_10_CD());
			this.setVEND_CLASS_01_CD(struct.getVEND_CLASS_01_CD());
			this.setVEND_CLASS_02_CD(struct.getVEND_CLASS_02_CD());
			this.setVEND_CLASS_03_CD(struct.getVEND_CLASS_03_CD());
			this.setVEND_CLASS_04_CD(struct.getVEND_CLASS_04_CD());
			this.setVEND_CLASS_05_CD(struct.getVEND_CLASS_05_CD());
			this.setVEND_CLASS_06_CD(struct.getVEND_CLASS_06_CD());
			this.setVEND_CLASS_07_CD(struct.getVEND_CLASS_07_CD());
			this.setVEND_CLASS_08_CD(struct.getVEND_CLASS_08_CD());
			this.setVEND_CLASS_09_CD(struct.getVEND_CLASS_09_CD());
			this.setVEND_CLASS_10_CD(struct.getVEND_CLASS_10_CD());
			this.setITEM_CLASS_01_CD(struct.getITEM_CLASS_01_CD());
			this.setITEM_CLASS_02_CD(struct.getITEM_CLASS_02_CD());
			this.setITEM_CLASS_03_CD(struct.getITEM_CLASS_03_CD());
			this.setITEM_CLASS_04_CD(struct.getITEM_CLASS_04_CD());
			this.setITEM_CLASS_05_CD(struct.getITEM_CLASS_05_CD());
			this.setITEM_CLASS_06_CD(struct.getITEM_CLASS_06_CD());
			this.setITEM_CLASS_07_CD(struct.getITEM_CLASS_07_CD());
			this.setITEM_CLASS_08_CD(struct.getITEM_CLASS_08_CD());
			this.setITEM_CLASS_09_CD(struct.getITEM_CLASS_09_CD());
			this.setITEM_CLASS_10_CD(struct.getITEM_CLASS_10_CD());
			this.setITEM_CLASS_11_CD(struct.getITEM_CLASS_11_CD());
			this.setITEM_CLASS_12_CD(struct.getITEM_CLASS_12_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setSEL_CLASS_CD1(struct.getSEL_CLASS_CD1());
			this.setSEL_CLASS_CD2(struct.getSEL_CLASS_CD2());
			this.setSEL_CLASS_CD3(struct.getSEL_CLASS_CD3());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0190010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_CLASS_CD1(struct.getList_h_CLASS_CD1());
			this.setList_h_CLASS_CD2(struct.getList_h_CLASS_CD2());
			this.setList_WriteStatus(struct.getList_WriteStatus());
			this.setList_CLASS_NAME1(struct.getList_CLASS_NAME1());
			this.setList_MODIFY_COUNT_CD1(struct.getList_MODIFY_COUNT_CD1());
			this.setList_CLASS_CD1(struct.getList_CLASS_CD1());
			this.setList_CLASS_NAME2(struct.getList_CLASS_NAME2());
			this.setList_MODIFY_COUNT_CD2(struct.getList_MODIFY_COUNT_CD2());
			this.setList_CLASS_CD2(struct.getList_CLASS_CD2());
			this.setList_CLASS_CD3(struct.getList_CLASS_CD3());
			this.setList_CLASS_NAME3(struct.getList_CLASS_NAME3());
			this.setList_MODIFY_COUNT_CD3(struct.getList_MODIFY_COUNT_CD3());
			this.setList_CUST_CLASS_01_CD(struct.getList_CUST_CLASS_01_CD());
			this.setList_CUST_CLASS_02_CD(struct.getList_CUST_CLASS_02_CD());
			this.setList_CUST_CLASS_03_CD(struct.getList_CUST_CLASS_03_CD());
			this.setList_CUST_CLASS_04_CD(struct.getList_CUST_CLASS_04_CD());
			this.setList_CUST_CLASS_05_CD(struct.getList_CUST_CLASS_05_CD());
			this.setList_CUST_CLASS_06_CD(struct.getList_CUST_CLASS_06_CD());
			this.setList_CUST_CLASS_07_CD(struct.getList_CUST_CLASS_07_CD());
			this.setList_CUST_CLASS_08_CD(struct.getList_CUST_CLASS_08_CD());
			this.setList_CUST_CLASS_09_CD(struct.getList_CUST_CLASS_09_CD());
			this.setList_CUST_CLASS_10_CD(struct.getList_CUST_CLASS_10_CD());
			this.setList_VEND_CLASS_01_CD(struct.getList_VEND_CLASS_01_CD());
			this.setList_VEND_CLASS_02_CD(struct.getList_VEND_CLASS_02_CD());
			this.setList_VEND_CLASS_03_CD(struct.getList_VEND_CLASS_03_CD());
			this.setList_VEND_CLASS_04_CD(struct.getList_VEND_CLASS_04_CD());
			this.setList_VEND_CLASS_05_CD(struct.getList_VEND_CLASS_05_CD());
			this.setList_VEND_CLASS_06_CD(struct.getList_VEND_CLASS_06_CD());
			this.setList_VEND_CLASS_07_CD(struct.getList_VEND_CLASS_07_CD());
			this.setList_VEND_CLASS_08_CD(struct.getList_VEND_CLASS_08_CD());
			this.setList_VEND_CLASS_09_CD(struct.getList_VEND_CLASS_09_CD());
			this.setList_VEND_CLASS_10_CD(struct.getList_VEND_CLASS_10_CD());
			this.setList_ITEM_CLASS_01_CD(struct.getList_ITEM_CLASS_01_CD());
			this.setList_ITEM_CLASS_02_CD(struct.getList_ITEM_CLASS_02_CD());
			this.setList_ITEM_CLASS_03_CD(struct.getList_ITEM_CLASS_03_CD());
			this.setList_ITEM_CLASS_04_CD(struct.getList_ITEM_CLASS_04_CD());
			this.setList_ITEM_CLASS_05_CD(struct.getList_ITEM_CLASS_05_CD());
			this.setList_ITEM_CLASS_06_CD(struct.getList_ITEM_CLASS_06_CD());
			this.setList_ITEM_CLASS_07_CD(struct.getList_ITEM_CLASS_07_CD());
			this.setList_ITEM_CLASS_08_CD(struct.getList_ITEM_CLASS_08_CD());
			this.setList_ITEM_CLASS_09_CD(struct.getList_ITEM_CLASS_09_CD());
			this.setList_ITEM_CLASS_10_CD(struct.getList_ITEM_CLASS_10_CD());
			this.setList_ITEM_CLASS_11_CD(struct.getList_ITEM_CLASS_11_CD());
			this.setList_ITEM_CLASS_12_CD(struct.getList_ITEM_CLASS_12_CD());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_SEL_CLASS_CD1(struct.getList_SEL_CLASS_CD1());
			this.setList_SEL_CLASS_CD2(struct.getList_SEL_CLASS_CD2());
			this.setList_SEL_CLASS_CD3(struct.getList_SEL_CLASS_CD3());
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
	// �� 1 �ϐ������l�F i_h_CLASS_CD1


	final static String i_h_CLASS_CD1 = null;

	// �� 2 �ϐ������l�F i_h_CLASS_CD2


	final static String i_h_CLASS_CD2 = null;

	// �� 3 �ϐ������l�F i_WriteStatus


	final static String i_WriteStatus = null;

	// �� 4 �ϐ������l�F i_CLASS_NAME1


	final static String i_CLASS_NAME1 = null;

	// �� 5 �ϐ������l�F i_MODIFY_COUNT_CD1


	final static String i_MODIFY_COUNT_CD1 = null;

	// �� 6 �ϐ������l�F i_CLASS_CD1


	final static String i_CLASS_CD1 = null;

	// �� 7 �ϐ������l�F i_CLASS_NAME2


	final static String i_CLASS_NAME2 = null;

	// �� 8 �ϐ������l�F i_MODIFY_COUNT_CD2


	final static String i_MODIFY_COUNT_CD2 = null;

	// �� 9 �ϐ������l�F i_CLASS_CD2


	final static String i_CLASS_CD2 = null;

	// �� 10 �ϐ������l�F i_CLASS_CD3


	final static String i_CLASS_CD3 = null;

	// �� 11 �ϐ������l�F i_CLASS_NAME3


	final static String i_CLASS_NAME3 = null;

	// �� 12 �ϐ������l�F i_MODIFY_COUNT_CD3


	final static String i_MODIFY_COUNT_CD3 = null;

	// �� 13 �ϐ������l�F i_CUST_CLASS_01_CD


	final static String i_CUST_CLASS_01_CD = null;

	// �� 14 �ϐ������l�F i_CUST_CLASS_02_CD


	final static String i_CUST_CLASS_02_CD = null;

	// �� 15 �ϐ������l�F i_CUST_CLASS_03_CD


	final static String i_CUST_CLASS_03_CD = null;

	// �� 16 �ϐ������l�F i_CUST_CLASS_04_CD


	final static String i_CUST_CLASS_04_CD = null;

	// �� 17 �ϐ������l�F i_CUST_CLASS_05_CD


	final static String i_CUST_CLASS_05_CD = null;

	// �� 18 �ϐ������l�F i_CUST_CLASS_06_CD


	final static String i_CUST_CLASS_06_CD = null;

	// �� 19 �ϐ������l�F i_CUST_CLASS_07_CD


	final static String i_CUST_CLASS_07_CD = null;

	// �� 20 �ϐ������l�F i_CUST_CLASS_08_CD


	final static String i_CUST_CLASS_08_CD = null;

	// �� 21 �ϐ������l�F i_CUST_CLASS_09_CD


	final static String i_CUST_CLASS_09_CD = null;

	// �� 22 �ϐ������l�F i_CUST_CLASS_10_CD


	final static String i_CUST_CLASS_10_CD = null;

	// �� 23 �ϐ������l�F i_VEND_CLASS_01_CD


	final static String i_VEND_CLASS_01_CD = null;

	// �� 24 �ϐ������l�F i_VEND_CLASS_02_CD


	final static String i_VEND_CLASS_02_CD = null;

	// �� 25 �ϐ������l�F i_VEND_CLASS_03_CD


	final static String i_VEND_CLASS_03_CD = null;

	// �� 26 �ϐ������l�F i_VEND_CLASS_04_CD


	final static String i_VEND_CLASS_04_CD = null;

	// �� 27 �ϐ������l�F i_VEND_CLASS_05_CD


	final static String i_VEND_CLASS_05_CD = null;

	// �� 28 �ϐ������l�F i_VEND_CLASS_06_CD


	final static String i_VEND_CLASS_06_CD = null;

	// �� 29 �ϐ������l�F i_VEND_CLASS_07_CD


	final static String i_VEND_CLASS_07_CD = null;

	// �� 30 �ϐ������l�F i_VEND_CLASS_08_CD


	final static String i_VEND_CLASS_08_CD = null;

	// �� 31 �ϐ������l�F i_VEND_CLASS_09_CD


	final static String i_VEND_CLASS_09_CD = null;

	// �� 32 �ϐ������l�F i_VEND_CLASS_10_CD


	final static String i_VEND_CLASS_10_CD = null;

	// �� 33 �ϐ������l�F i_ITEM_CLASS_01_CD


	final static String i_ITEM_CLASS_01_CD = null;

	// �� 34 �ϐ������l�F i_ITEM_CLASS_02_CD


	final static String i_ITEM_CLASS_02_CD = null;

	// �� 35 �ϐ������l�F i_ITEM_CLASS_03_CD


	final static String i_ITEM_CLASS_03_CD = null;

	// �� 36 �ϐ������l�F i_ITEM_CLASS_04_CD


	final static String i_ITEM_CLASS_04_CD = null;

	// �� 37 �ϐ������l�F i_ITEM_CLASS_05_CD


	final static String i_ITEM_CLASS_05_CD = null;

	// �� 38 �ϐ������l�F i_ITEM_CLASS_06_CD


	final static String i_ITEM_CLASS_06_CD = null;

	// �� 39 �ϐ������l�F i_ITEM_CLASS_07_CD


	final static String i_ITEM_CLASS_07_CD = null;

	// �� 40 �ϐ������l�F i_ITEM_CLASS_08_CD


	final static String i_ITEM_CLASS_08_CD = null;

	// �� 41 �ϐ������l�F i_ITEM_CLASS_09_CD


	final static String i_ITEM_CLASS_09_CD = null;

	// �� 42 �ϐ������l�F i_ITEM_CLASS_10_CD


	final static String i_ITEM_CLASS_10_CD = null;

	// �� 43 �ϐ������l�F i_ITEM_CLASS_11_CD


	final static String i_ITEM_CLASS_11_CD = null;

	// �� 44 �ϐ������l�F i_ITEM_CLASS_12_CD


	final static String i_ITEM_CLASS_12_CD = null;

	// �� 45 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 46 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 47 �ϐ������l�F i_SEL_CLASS_CD1


	final static String i_SEL_CLASS_CD1 = null;

	// �� 48 �ϐ������l�F i_SEL_CLASS_CD2


	final static String i_SEL_CLASS_CD2 = null;

	// �� 49 �ϐ������l�F i_SEL_CLASS_CD3


	final static String i_SEL_CLASS_CD3 = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_CLASS_CD1

	final static String i_CLASS_CD1 = null;

	// �� 2 �ϐ������l�F i_CLASS_CD2

	final static String i_CLASS_CD2 = null;

	// �� 3 �ϐ������l�F i_CLASS_NAME1

	final static String i_CLASS_NAME1 = null;

	// �� 4 �ϐ������l�F i_CLASS_NAME2

	final static String i_CLASS_NAME2 = null;

	// �� 5 �ϐ������l�F i_DEL_FLG

	final static String i_DEL_FLG = null;

	// �� 6 �ϐ������l�F i_CLASS_CD3

	final static String i_CLASS_CD3 = null;

	// �� 7 �ϐ������l�F i_CLASS_NAME3

	final static String i_CLASS_NAME3 = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_CLASS_CD1 = i_CLASS_CD1;
		m_CLASS_CD2 = i_CLASS_CD2;
		m_CLASS_NAME1 = i_CLASS_NAME1;
		m_CLASS_NAME2 = i_CLASS_NAME2;
/*		m_DEL_FLG = i_DEL_FLG;*/
		m_CLASS_CD3 = i_CLASS_CD3;
		m_CLASS_NAME3 = i_CLASS_NAME3;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
