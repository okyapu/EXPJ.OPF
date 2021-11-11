/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0100/src/com/nec/jp/orteus/metamorBase/DB0100/DB0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0100;

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
 * CLASS     : DB0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:22:25 $
 *
 */
//}}user_implement_code_header

public class DB0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** �� 2 �ϐ��F m_COST_TYP_val */
	public String m_COST_TYP_val = null;
	/** �� 3 �ϐ��F m_c_DB0010B001 */
	public String m_c_DB0010B001 = null;
	/** �� 4 �ϐ��F m_c_DB0020B001 */
	public String m_c_DB0020B001 = null;
	/** �� 5 �ϐ��F m_c_DB0030B001 */
	public String m_c_DB0030B001 = null;
	/** �� 6 �ϐ��F m_c_DB0040B001 */
	public String m_c_DB0040B001 = null;
	/** �� 7 �ϐ��F m_c_ReOut */
	public String m_c_ReOut = null;
	/** �� 8 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 9 �ϐ��F m_DB0010B001_0_COUNT */
	public String m_DB0010B001_0_COUNT = null;
	/** �� 10 �ϐ��F m_DB0010B001_1_COUNT */
	public String m_DB0010B001_1_COUNT = null;
	/** �� 11 �ϐ��F m_DB0020B001_0_COUNT */
	public String m_DB0020B001_0_COUNT = null;
	/** �� 12 �ϐ��F m_DB0020B001_1_COUNT */
	public String m_DB0020B001_1_COUNT = null;
	/** �� 13 �ϐ��F m_DB0030B001_0_COUNT */
	public String m_DB0030B001_0_COUNT = null;
	/** �� 14 �ϐ��F m_DB0030B001_1_COUNT */
	public String m_DB0030B001_1_COUNT = null;
	/** �� 15 �ϐ��F m_DB0040B001_0_COUNT */
	public String m_DB0040B001_0_COUNT = null;
	/** �� 16 �ϐ��F m_DB0040B001_1_COUNT */
	public String m_DB0040B001_1_COUNT = null;
	/** �� 17 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 18 �ϐ��F m_COST_TYP */
	public String m_COST_TYP = null;
	/** �� 19 �ϐ��F m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** �� 20 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 21 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 22 �ϐ��F m_PROGRAM_CD */
	public String m_PROGRAM_CD = null;
	/** �� 23 �ϐ��F m_PROGRAM_NAME */
	public String m_PROGRAM_NAME = null;
	/** �� 24 �ϐ��F m_COST_TYP_DN */
	public String m_COST_TYP_DN = null;
	/** �� 25 �ϐ��F m_CS_ERROR_CD */
	public String m_CS_ERROR_CD = null;
	/** �� 26 �ϐ��F m_BATCH_TYP_DN */
	public String m_BATCH_TYP_DN = null;
	/** �� 27 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 28 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 29 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 30 �ϐ��F m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** �� 31 �ϐ��F m_EFFECTIVE_START_DATE */
	public String m_EFFECTIVE_START_DATE = null;
	/** �� 32 �ϐ��F m_TRANSACTION_TYP_DN */
	public String m_TRANSACTION_TYP_DN = null;
	/** �� 33 �ϐ��F m_MESSAGE_CD */
	public String m_MESSAGE_CD = null;
	/** �� 34 �ϐ��F m_MESSAGE */
	public String m_MESSAGE = null;
	/** �� 35 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 36 �ϐ��F m_LIST_ISS_FLG */
	public String m_LIST_ISS_FLG = null;
	/** �� 37 �ϐ��F m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** �� 38 �ϐ��F m_CREATED_PRG_NM_1 */
	public String m_CREATED_PRG_NM_1 = null;
	/** �� 39 �ϐ��F m_CREATED_PRG_NM_2 */
	public String m_CREATED_PRG_NM_2 = null;
	/** �� 40 �ϐ��F m_CREATED_PRG_NM_3 */
	public String m_CREATED_PRG_NM_3 = null;
	/** �� 41 �ϐ��F m_CREATED_PRG_NM_4 */
	public String m_CREATED_PRG_NM_4 = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** �� 2 List�ϐ��F l_COST_TYP_val */
	public List l_COST_TYP_val = null;

	/** �� 3 List�ϐ��F l_c_DB0010B001 */
	public List l_c_DB0010B001 = null;

	/** �� 4 List�ϐ��F l_c_DB0020B001 */
	public List l_c_DB0020B001 = null;

	/** �� 5 List�ϐ��F l_c_DB0030B001 */
	public List l_c_DB0030B001 = null;

	/** �� 6 List�ϐ��F l_c_DB0040B001 */
	public List l_c_DB0040B001 = null;

	/** �� 7 List�ϐ��F l_c_ReOut */
	public List l_c_ReOut = null;

	/** �� 8 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 9 List�ϐ��F l_DB0010B001_0_COUNT */
	public List l_DB0010B001_0_COUNT = null;

	/** �� 10 List�ϐ��F l_DB0010B001_1_COUNT */
	public List l_DB0010B001_1_COUNT = null;

	/** �� 11 List�ϐ��F l_DB0020B001_0_COUNT */
	public List l_DB0020B001_0_COUNT = null;

	/** �� 12 List�ϐ��F l_DB0020B001_1_COUNT */
	public List l_DB0020B001_1_COUNT = null;

	/** �� 13 List�ϐ��F l_DB0030B001_0_COUNT */
	public List l_DB0030B001_0_COUNT = null;

	/** �� 14 List�ϐ��F l_DB0030B001_1_COUNT */
	public List l_DB0030B001_1_COUNT = null;

	/** �� 15 List�ϐ��F l_DB0040B001_0_COUNT */
	public List l_DB0040B001_0_COUNT = null;

	/** �� 16 List�ϐ��F l_DB0040B001_1_COUNT */
	public List l_DB0040B001_1_COUNT = null;

	/** �� 17 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 18 List�ϐ��F l_COST_TYP */
	public List l_COST_TYP = null;

	/** �� 19 List�ϐ��F l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** �� 20 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 21 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 22 List�ϐ��F l_PROGRAM_CD */
	public List l_PROGRAM_CD = null;

	/** �� 23 List�ϐ��F l_PROGRAM_NAME */
	public List l_PROGRAM_NAME = null;

	/** �� 24 List�ϐ��F l_COST_TYP_DN */
	public List l_COST_TYP_DN = null;

	/** �� 25 List�ϐ��F l_CS_ERROR_CD */
	public List l_CS_ERROR_CD = null;

	/** �� 26 List�ϐ��F l_BATCH_TYP_DN */
	public List l_BATCH_TYP_DN = null;

	/** �� 27 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 28 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 29 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 30 List�ϐ��F l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** �� 31 List�ϐ��F l_EFFECTIVE_START_DATE */
	public List l_EFFECTIVE_START_DATE = null;

	/** �� 32 List�ϐ��F l_TRANSACTION_TYP_DN */
	public List l_TRANSACTION_TYP_DN = null;

	/** �� 33 List�ϐ��F l_MESSAGE_CD */
	public List l_MESSAGE_CD = null;

	/** �� 34 List�ϐ��F l_MESSAGE */
	public List l_MESSAGE = null;

	/** �� 35 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 36 List�ϐ��F l_LIST_ISS_FLG */
	public List l_LIST_ISS_FLG = null;

	/** �� 37 List�ϐ��F l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** �� 38 List�ϐ��F l_CREATED_PRG_NM_1 */
	public List l_CREATED_PRG_NM_1 = null;

	/** �� 39 List�ϐ��F l_CREATED_PRG_NM_2 */
	public List l_CREATED_PRG_NM_2 = null;

	/** �� 40 List�ϐ��F l_CREATED_PRG_NM_3 */
	public List l_CREATED_PRG_NM_3 = null;

	/** �� 41 List�ϐ��F l_CREATED_PRG_NM_4 */
	public List l_CREATED_PRG_NM_4 = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }
	public String getc_DB0010B001() { return m_c_DB0010B001; }
	public String getc_DB0020B001() { return m_c_DB0020B001; }
	public String getc_DB0030B001() { return m_c_DB0030B001; }
	public String getc_DB0040B001() { return m_c_DB0040B001; }
	public String getc_ReOut() { return m_c_ReOut; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getDB0010B001_0_COUNT() { return m_DB0010B001_0_COUNT; }
	public String getDB0010B001_1_COUNT() { return m_DB0010B001_1_COUNT; }
	public String getDB0020B001_0_COUNT() { return m_DB0020B001_0_COUNT; }
	public String getDB0020B001_1_COUNT() { return m_DB0020B001_1_COUNT; }
	public String getDB0030B001_0_COUNT() { return m_DB0030B001_0_COUNT; }
	public String getDB0030B001_1_COUNT() { return m_DB0030B001_1_COUNT; }
	public String getDB0040B001_0_COUNT() { return m_DB0040B001_0_COUNT; }
	public String getDB0040B001_1_COUNT() { return m_DB0040B001_1_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getPROGRAM_NAME() { return m_PROGRAM_NAME; }
	public String getCOST_TYP_DN() { return m_COST_TYP_DN; }
	public String getCS_ERROR_CD() { return m_CS_ERROR_CD; }
	public String getBATCH_TYP_DN() { return m_BATCH_TYP_DN; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getEFFECTIVE_START_DATE() { return m_EFFECTIVE_START_DATE; }
	public String getTRANSACTION_TYP_DN() { return m_TRANSACTION_TYP_DN; }
	public String getMESSAGE_CD() { return m_MESSAGE_CD; }
	public String getMESSAGE() { return m_MESSAGE; }
	public String getREMARKS() { return m_REMARKS; }
	public String getLIST_ISS_FLG() { return m_LIST_ISS_FLG; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_PRG_NM_1() { return m_CREATED_PRG_NM_1; }
	public String getCREATED_PRG_NM_2() { return m_CREATED_PRG_NM_2; }
	public String getCREATED_PRG_NM_3() { return m_CREATED_PRG_NM_3; }
	public String getCREATED_PRG_NM_4() { return m_CREATED_PRG_NM_4; }

	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }
	public List getList_c_DB0010B001() { return l_c_DB0010B001; }
	public List getList_c_DB0020B001() { return l_c_DB0020B001; }
	public List getList_c_DB0030B001() { return l_c_DB0030B001; }
	public List getList_c_DB0040B001() { return l_c_DB0040B001; }
	public List getList_c_ReOut() { return l_c_ReOut; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_DB0010B001_0_COUNT() { return l_DB0010B001_0_COUNT; }
	public List getList_DB0010B001_1_COUNT() { return l_DB0010B001_1_COUNT; }
	public List getList_DB0020B001_0_COUNT() { return l_DB0020B001_0_COUNT; }
	public List getList_DB0020B001_1_COUNT() { return l_DB0020B001_1_COUNT; }
	public List getList_DB0030B001_0_COUNT() { return l_DB0030B001_0_COUNT; }
	public List getList_DB0030B001_1_COUNT() { return l_DB0030B001_1_COUNT; }
	public List getList_DB0040B001_0_COUNT() { return l_DB0040B001_0_COUNT; }
	public List getList_DB0040B001_1_COUNT() { return l_DB0040B001_1_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PROGRAM_CD() { return l_PROGRAM_CD; }
	public List getList_PROGRAM_NAME() { return l_PROGRAM_NAME; }
	public List getList_COST_TYP_DN() { return l_COST_TYP_DN; }
	public List getList_CS_ERROR_CD() { return l_CS_ERROR_CD; }
	public List getList_BATCH_TYP_DN() { return l_BATCH_TYP_DN; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_EFFECTIVE_START_DATE() { return l_EFFECTIVE_START_DATE; }
	public List getList_TRANSACTION_TYP_DN() { return l_TRANSACTION_TYP_DN; }
	public List getList_MESSAGE_CD() { return l_MESSAGE_CD; }
	public List getList_MESSAGE() { return l_MESSAGE; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_LIST_ISS_FLG() { return l_LIST_ISS_FLG; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_PRG_NM_1() { return l_CREATED_PRG_NM_1; }
	public List getList_CREATED_PRG_NM_2() { return l_CREATED_PRG_NM_2; }
	public List getList_CREATED_PRG_NM_3() { return l_CREATED_PRG_NM_3; }
	public List getList_CREATED_PRG_NM_4() { return l_CREATED_PRG_NM_4; }

	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }
	public void setc_DB0010B001(String val) { m_c_DB0010B001 = val; }
	public void setc_DB0020B001(String val) { m_c_DB0020B001 = val; }
	public void setc_DB0030B001(String val) { m_c_DB0030B001 = val; }
	public void setc_DB0040B001(String val) { m_c_DB0040B001 = val; }
	public void setc_ReOut(String val) { m_c_ReOut = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setDB0010B001_0_COUNT(String val) { m_DB0010B001_0_COUNT = val; }
	public void setDB0010B001_1_COUNT(String val) { m_DB0010B001_1_COUNT = val; }
	public void setDB0020B001_0_COUNT(String val) { m_DB0020B001_0_COUNT = val; }
	public void setDB0020B001_1_COUNT(String val) { m_DB0020B001_1_COUNT = val; }
	public void setDB0030B001_0_COUNT(String val) { m_DB0030B001_0_COUNT = val; }
	public void setDB0030B001_1_COUNT(String val) { m_DB0030B001_1_COUNT = val; }
	public void setDB0040B001_0_COUNT(String val) { m_DB0040B001_0_COUNT = val; }
	public void setDB0040B001_1_COUNT(String val) { m_DB0040B001_1_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPROGRAM_CD(String val) { m_PROGRAM_CD = val; }
	public void setPROGRAM_NAME(String val) { m_PROGRAM_NAME = val; }
	public void setCOST_TYP_DN(String val) { m_COST_TYP_DN = val; }
	public void setCS_ERROR_CD(String val) { m_CS_ERROR_CD = val; }
	public void setBATCH_TYP_DN(String val) { m_BATCH_TYP_DN = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setEFFECTIVE_START_DATE(String val) { m_EFFECTIVE_START_DATE = val; }
	public void setTRANSACTION_TYP_DN(String val) { m_TRANSACTION_TYP_DN = val; }
	public void setMESSAGE_CD(String val) { m_MESSAGE_CD = val; }
	public void setMESSAGE(String val) { m_MESSAGE = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setLIST_ISS_FLG(String val) { m_LIST_ISS_FLG = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_PRG_NM_1(String val) { m_CREATED_PRG_NM_1 = val; }
	public void setCREATED_PRG_NM_2(String val) { m_CREATED_PRG_NM_2 = val; }
	public void setCREATED_PRG_NM_3(String val) { m_CREATED_PRG_NM_3 = val; }
	public void setCREATED_PRG_NM_4(String val) { m_CREATED_PRG_NM_4 = val; }


	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }
	public void setList_c_DB0010B001(List list) { l_c_DB0010B001 = list; }
	public void setList_c_DB0020B001(List list) { l_c_DB0020B001 = list; }
	public void setList_c_DB0030B001(List list) { l_c_DB0030B001 = list; }
	public void setList_c_DB0040B001(List list) { l_c_DB0040B001 = list; }
	public void setList_c_ReOut(List list) { l_c_ReOut = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_DB0010B001_0_COUNT(List list) { l_DB0010B001_0_COUNT = list; }
	public void setList_DB0010B001_1_COUNT(List list) { l_DB0010B001_1_COUNT = list; }
	public void setList_DB0020B001_0_COUNT(List list) { l_DB0020B001_0_COUNT = list; }
	public void setList_DB0020B001_1_COUNT(List list) { l_DB0020B001_1_COUNT = list; }
	public void setList_DB0030B001_0_COUNT(List list) { l_DB0030B001_0_COUNT = list; }
	public void setList_DB0030B001_1_COUNT(List list) { l_DB0030B001_1_COUNT = list; }
	public void setList_DB0040B001_0_COUNT(List list) { l_DB0040B001_0_COUNT = list; }
	public void setList_DB0040B001_1_COUNT(List list) { l_DB0040B001_1_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PROGRAM_CD(List list) { l_PROGRAM_CD = list; }
	public void setList_PROGRAM_NAME(List list) { l_PROGRAM_NAME = list; }
	public void setList_COST_TYP_DN(List list) { l_COST_TYP_DN = list; }
	public void setList_CS_ERROR_CD(List list) { l_CS_ERROR_CD = list; }
	public void setList_BATCH_TYP_DN(List list) { l_BATCH_TYP_DN = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_EFFECTIVE_START_DATE(List list) { l_EFFECTIVE_START_DATE = list; }
	public void setList_TRANSACTION_TYP_DN(List list) { l_TRANSACTION_TYP_DN = list; }
	public void setList_MESSAGE_CD(List list) { l_MESSAGE_CD = list; }
	public void setList_MESSAGE(List list) { l_MESSAGE = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_LIST_ISS_FLG(List list) { l_LIST_ISS_FLG = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_PRG_NM_1(List list) { l_CREATED_PRG_NM_1 = list; }
	public void setList_CREATED_PRG_NM_2(List list) { l_CREATED_PRG_NM_2 = list; }
	public void setList_CREATED_PRG_NM_3(List list) { l_CREATED_PRG_NM_3 = list; }
	public void setList_CREATED_PRG_NM_4(List list) { l_CREATED_PRG_NM_4 = list; }

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
			l_COST_TYP_name.add(((DB0100010Struct) list.get(i)).getCOST_TYP_name());
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
			l_COST_TYP_val.add(((DB0100010Struct) list.get(i)).getCOST_TYP_val());
		}
		return size;
	}
	public int setL2L_c_DB0010B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DB0010B001 == null) {
			l_c_DB0010B001 = new ArrayList();
		} else {
			l_c_DB0010B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DB0010B001.add(((DB0100010Struct) list.get(i)).getc_DB0010B001());
		}
		return size;
	}
	public int setL2L_c_DB0020B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DB0020B001 == null) {
			l_c_DB0020B001 = new ArrayList();
		} else {
			l_c_DB0020B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DB0020B001.add(((DB0100010Struct) list.get(i)).getc_DB0020B001());
		}
		return size;
	}
	public int setL2L_c_DB0030B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DB0030B001 == null) {
			l_c_DB0030B001 = new ArrayList();
		} else {
			l_c_DB0030B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DB0030B001.add(((DB0100010Struct) list.get(i)).getc_DB0030B001());
		}
		return size;
	}
	public int setL2L_c_DB0040B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DB0040B001 == null) {
			l_c_DB0040B001 = new ArrayList();
		} else {
			l_c_DB0040B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DB0040B001.add(((DB0100010Struct) list.get(i)).getc_DB0040B001());
		}
		return size;
	}
	public int setL2L_c_ReOut(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ReOut == null) {
			l_c_ReOut = new ArrayList();
		} else {
			l_c_ReOut.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ReOut.add(((DB0100010Struct) list.get(i)).getc_ReOut());
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
			l_DOWNLOAD_FILE.add(((DB0100010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_DB0010B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0010B001_0_COUNT == null) {
			l_DB0010B001_0_COUNT = new ArrayList();
		} else {
			l_DB0010B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0010B001_0_COUNT.add(((DB0100010Struct) list.get(i)).getDB0010B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DB0010B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0010B001_1_COUNT == null) {
			l_DB0010B001_1_COUNT = new ArrayList();
		} else {
			l_DB0010B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0010B001_1_COUNT.add(((DB0100010Struct) list.get(i)).getDB0010B001_1_COUNT());
		}
		return size;
	}
	public int setL2L_DB0020B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0020B001_0_COUNT == null) {
			l_DB0020B001_0_COUNT = new ArrayList();
		} else {
			l_DB0020B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0020B001_0_COUNT.add(((DB0100010Struct) list.get(i)).getDB0020B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DB0020B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0020B001_1_COUNT == null) {
			l_DB0020B001_1_COUNT = new ArrayList();
		} else {
			l_DB0020B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0020B001_1_COUNT.add(((DB0100010Struct) list.get(i)).getDB0020B001_1_COUNT());
		}
		return size;
	}
	public int setL2L_DB0030B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0030B001_0_COUNT == null) {
			l_DB0030B001_0_COUNT = new ArrayList();
		} else {
			l_DB0030B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0030B001_0_COUNT.add(((DB0100010Struct) list.get(i)).getDB0030B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DB0030B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0030B001_1_COUNT == null) {
			l_DB0030B001_1_COUNT = new ArrayList();
		} else {
			l_DB0030B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0030B001_1_COUNT.add(((DB0100010Struct) list.get(i)).getDB0030B001_1_COUNT());
		}
		return size;
	}
	public int setL2L_DB0040B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0040B001_0_COUNT == null) {
			l_DB0040B001_0_COUNT = new ArrayList();
		} else {
			l_DB0040B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0040B001_0_COUNT.add(((DB0100010Struct) list.get(i)).getDB0040B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DB0040B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DB0040B001_1_COUNT == null) {
			l_DB0040B001_1_COUNT = new ArrayList();
		} else {
			l_DB0040B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DB0040B001_1_COUNT.add(((DB0100010Struct) list.get(i)).getDB0040B001_1_COUNT());
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
			l_PLANT_CD.add(((DB0100010Struct) list.get(i)).getPLANT_CD());
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
			l_COST_TYP.add(((DB0100010Struct) list.get(i)).getCOST_TYP());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((DB0100010Struct) list.get(i)).getCREATED_BY());
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
			l_PLANT_NAME.add(((DB0100010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((DB0100010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_CD == null) {
			l_PROGRAM_CD = new ArrayList();
		} else {
			l_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_CD.add(((DB0100010Struct) list.get(i)).getPROGRAM_CD());
		}
		return size;
	}
	public int setL2L_PROGRAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_NAME == null) {
			l_PROGRAM_NAME = new ArrayList();
		} else {
			l_PROGRAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_NAME.add(((DB0100010Struct) list.get(i)).getPROGRAM_NAME());
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
			l_COST_TYP_DN.add(((DB0100010Struct) list.get(i)).getCOST_TYP_DN());
		}
		return size;
	}
	public int setL2L_CS_ERROR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_ERROR_CD == null) {
			l_CS_ERROR_CD = new ArrayList();
		} else {
			l_CS_ERROR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_ERROR_CD.add(((DB0100010Struct) list.get(i)).getCS_ERROR_CD());
		}
		return size;
	}
	public int setL2L_BATCH_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BATCH_TYP_DN == null) {
			l_BATCH_TYP_DN = new ArrayList();
		} else {
			l_BATCH_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BATCH_TYP_DN.add(((DB0100010Struct) list.get(i)).getBATCH_TYP_DN());
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
			l_ITEM_CD.add(((DB0100010Struct) list.get(i)).getITEM_CD());
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
			l_CS_PROC_CD.add(((DB0100010Struct) list.get(i)).getCS_PROC_CD());
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
			l_VEND_CD.add(((DB0100010Struct) list.get(i)).getVEND_CD());
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
			l_PROC_COST_CLS_CD.add(((DB0100010Struct) list.get(i)).getPROC_COST_CLS_CD());
		}
		return size;
	}
	public int setL2L_EFFECTIVE_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFFECTIVE_START_DATE == null) {
			l_EFFECTIVE_START_DATE = new ArrayList();
		} else {
			l_EFFECTIVE_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFFECTIVE_START_DATE.add(((DB0100010Struct) list.get(i)).getEFFECTIVE_START_DATE());
		}
		return size;
	}
	public int setL2L_TRANSACTION_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSACTION_TYP_DN == null) {
			l_TRANSACTION_TYP_DN = new ArrayList();
		} else {
			l_TRANSACTION_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSACTION_TYP_DN.add(((DB0100010Struct) list.get(i)).getTRANSACTION_TYP_DN());
		}
		return size;
	}
	public int setL2L_MESSAGE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MESSAGE_CD == null) {
			l_MESSAGE_CD = new ArrayList();
		} else {
			l_MESSAGE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MESSAGE_CD.add(((DB0100010Struct) list.get(i)).getMESSAGE_CD());
		}
		return size;
	}
	public int setL2L_MESSAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MESSAGE == null) {
			l_MESSAGE = new ArrayList();
		} else {
			l_MESSAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MESSAGE.add(((DB0100010Struct) list.get(i)).getMESSAGE());
		}
		return size;
	}
	public int setL2L_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS == null) {
			l_REMARKS = new ArrayList();
		} else {
			l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS.add(((DB0100010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_LIST_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LIST_ISS_FLG == null) {
			l_LIST_ISS_FLG = new ArrayList();
		} else {
			l_LIST_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LIST_ISS_FLG.add(((DB0100010Struct) list.get(i)).getLIST_ISS_FLG());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((DB0100010Struct) list.get(i)).getCREATED_DATE());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM_1 == null) {
			l_CREATED_PRG_NM_1 = new ArrayList();
		} else {
			l_CREATED_PRG_NM_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM_1.add(((DB0100010Struct) list.get(i)).getCREATED_PRG_NM_1());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM_2 == null) {
			l_CREATED_PRG_NM_2 = new ArrayList();
		} else {
			l_CREATED_PRG_NM_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM_2.add(((DB0100010Struct) list.get(i)).getCREATED_PRG_NM_2());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM_3 == null) {
			l_CREATED_PRG_NM_3 = new ArrayList();
		} else {
			l_CREATED_PRG_NM_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM_3.add(((DB0100010Struct) list.get(i)).getCREATED_PRG_NM_3());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM_4 == null) {
			l_CREATED_PRG_NM_4 = new ArrayList();
		} else {
			l_CREATED_PRG_NM_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM_4.add(((DB0100010Struct) list.get(i)).getCREATED_PRG_NM_4());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;
		m_c_DB0010B001 = null;
		m_c_DB0020B001 = null;
		m_c_DB0030B001 = null;
		m_c_DB0040B001 = null;
		m_c_ReOut = null;
		m_DOWNLOAD_FILE = null;
		m_DB0010B001_0_COUNT = null;
		m_DB0010B001_1_COUNT = null;
		m_DB0020B001_0_COUNT = null;
		m_DB0020B001_1_COUNT = null;
		m_DB0030B001_0_COUNT = null;
		m_DB0030B001_1_COUNT = null;
		m_DB0040B001_0_COUNT = null;
		m_DB0040B001_1_COUNT = null;
		m_PLANT_CD = null;
		m_COST_TYP = null;
		m_CREATED_BY = null;
		m_PLANT_NAME = null;
		m_USER_NAME = null;
		m_PROGRAM_CD = null;
		m_PROGRAM_NAME = null;
		m_COST_TYP_DN = null;
		m_CS_ERROR_CD = null;
		m_BATCH_TYP_DN = null;
		m_ITEM_CD = null;
		m_CS_PROC_CD = null;
		m_VEND_CD = null;
		m_PROC_COST_CLS_CD = null;
		m_EFFECTIVE_START_DATE = null;
		m_TRANSACTION_TYP_DN = null;
		m_MESSAGE_CD = null;
		m_MESSAGE = null;
		m_REMARKS = null;
		m_LIST_ISS_FLG = null;
		m_CREATED_DATE = null;
		m_CREATED_PRG_NM_1 = null;
		m_CREATED_PRG_NM_2 = null;
		m_CREATED_PRG_NM_3 = null;
		m_CREATED_PRG_NM_4 = null;

		l_COST_TYP_name = null;
		l_COST_TYP_val = null;
		l_c_DB0010B001 = null;
		l_c_DB0020B001 = null;
		l_c_DB0030B001 = null;
		l_c_DB0040B001 = null;
		l_c_ReOut = null;
		l_DOWNLOAD_FILE = null;
		l_DB0010B001_0_COUNT = null;
		l_DB0010B001_1_COUNT = null;
		l_DB0020B001_0_COUNT = null;
		l_DB0020B001_1_COUNT = null;
		l_DB0030B001_0_COUNT = null;
		l_DB0030B001_1_COUNT = null;
		l_DB0040B001_0_COUNT = null;
		l_DB0040B001_1_COUNT = null;
		l_PLANT_CD = null;
		l_COST_TYP = null;
		l_CREATED_BY = null;
		l_PLANT_NAME = null;
		l_USER_NAME = null;
		l_PROGRAM_CD = null;
		l_PROGRAM_NAME = null;
		l_COST_TYP_DN = null;
		l_CS_ERROR_CD = null;
		l_BATCH_TYP_DN = null;
		l_ITEM_CD = null;
		l_CS_PROC_CD = null;
		l_VEND_CD = null;
		l_PROC_COST_CLS_CD = null;
		l_EFFECTIVE_START_DATE = null;
		l_TRANSACTION_TYP_DN = null;
		l_MESSAGE_CD = null;
		l_MESSAGE = null;
		l_REMARKS = null;
		l_LIST_ISS_FLG = null;
		l_CREATED_DATE = null;
		l_CREATED_PRG_NM_1 = null;
		l_CREATED_PRG_NM_2 = null;
		l_CREATED_PRG_NM_3 = null;
		l_CREATED_PRG_NM_4 = null;

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
	 * medDB0100010�N���X�̕W���R���X�g���N�^
	 */
	public DB0100010Struct()
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
	public void setStruct(DB0100010Struct struct)
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
	public void setStructM(DB0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
			this.setc_DB0010B001(struct.getc_DB0010B001());
			this.setc_DB0020B001(struct.getc_DB0020B001());
			this.setc_DB0030B001(struct.getc_DB0030B001());
			this.setc_DB0040B001(struct.getc_DB0040B001());
			this.setc_ReOut(struct.getc_ReOut());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setDB0010B001_0_COUNT(struct.getDB0010B001_0_COUNT());
			this.setDB0010B001_1_COUNT(struct.getDB0010B001_1_COUNT());
			this.setDB0020B001_0_COUNT(struct.getDB0020B001_0_COUNT());
			this.setDB0020B001_1_COUNT(struct.getDB0020B001_1_COUNT());
			this.setDB0030B001_0_COUNT(struct.getDB0030B001_0_COUNT());
			this.setDB0030B001_1_COUNT(struct.getDB0030B001_1_COUNT());
			this.setDB0040B001_0_COUNT(struct.getDB0040B001_0_COUNT());
			this.setDB0040B001_1_COUNT(struct.getDB0040B001_1_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPROGRAM_CD(struct.getPROGRAM_CD());
			this.setPROGRAM_NAME(struct.getPROGRAM_NAME());
			this.setCOST_TYP_DN(struct.getCOST_TYP_DN());
			this.setCS_ERROR_CD(struct.getCS_ERROR_CD());
			this.setBATCH_TYP_DN(struct.getBATCH_TYP_DN());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setEFFECTIVE_START_DATE(struct.getEFFECTIVE_START_DATE());
			this.setTRANSACTION_TYP_DN(struct.getTRANSACTION_TYP_DN());
			this.setMESSAGE_CD(struct.getMESSAGE_CD());
			this.setMESSAGE(struct.getMESSAGE());
			this.setREMARKS(struct.getREMARKS());
			this.setLIST_ISS_FLG(struct.getLIST_ISS_FLG());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_PRG_NM_1(struct.getCREATED_PRG_NM_1());
			this.setCREATED_PRG_NM_2(struct.getCREATED_PRG_NM_2());
			this.setCREATED_PRG_NM_3(struct.getCREATED_PRG_NM_3());
			this.setCREATED_PRG_NM_4(struct.getCREATED_PRG_NM_4());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DB0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
			this.setList_c_DB0010B001(struct.getList_c_DB0010B001());
			this.setList_c_DB0020B001(struct.getList_c_DB0020B001());
			this.setList_c_DB0030B001(struct.getList_c_DB0030B001());
			this.setList_c_DB0040B001(struct.getList_c_DB0040B001());
			this.setList_c_ReOut(struct.getList_c_ReOut());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_DB0010B001_0_COUNT(struct.getList_DB0010B001_0_COUNT());
			this.setList_DB0010B001_1_COUNT(struct.getList_DB0010B001_1_COUNT());
			this.setList_DB0020B001_0_COUNT(struct.getList_DB0020B001_0_COUNT());
			this.setList_DB0020B001_1_COUNT(struct.getList_DB0020B001_1_COUNT());
			this.setList_DB0030B001_0_COUNT(struct.getList_DB0030B001_0_COUNT());
			this.setList_DB0030B001_1_COUNT(struct.getList_DB0030B001_1_COUNT());
			this.setList_DB0040B001_0_COUNT(struct.getList_DB0040B001_0_COUNT());
			this.setList_DB0040B001_1_COUNT(struct.getList_DB0040B001_1_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PROGRAM_CD(struct.getList_PROGRAM_CD());
			this.setList_PROGRAM_NAME(struct.getList_PROGRAM_NAME());
			this.setList_COST_TYP_DN(struct.getList_COST_TYP_DN());
			this.setList_CS_ERROR_CD(struct.getList_CS_ERROR_CD());
			this.setList_BATCH_TYP_DN(struct.getList_BATCH_TYP_DN());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_EFFECTIVE_START_DATE(struct.getList_EFFECTIVE_START_DATE());
			this.setList_TRANSACTION_TYP_DN(struct.getList_TRANSACTION_TYP_DN());
			this.setList_MESSAGE_CD(struct.getList_MESSAGE_CD());
			this.setList_MESSAGE(struct.getList_MESSAGE());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_LIST_ISS_FLG(struct.getList_LIST_ISS_FLG());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_PRG_NM_1(struct.getList_CREATED_PRG_NM_1());
			this.setList_CREATED_PRG_NM_2(struct.getList_CREATED_PRG_NM_2());
			this.setList_CREATED_PRG_NM_3(struct.getList_CREATED_PRG_NM_3());
			this.setList_CREATED_PRG_NM_4(struct.getList_CREATED_PRG_NM_4());
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
	// �� 1 �ϐ������l�F i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_COST_TYP_val


	final static String i_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_c_DB0010B001


	final static String i_c_DB0010B001 = null;

	// �� 4 �ϐ������l�F i_c_DB0020B001


	final static String i_c_DB0020B001 = null;

	// �� 5 �ϐ������l�F i_c_DB0030B001


	final static String i_c_DB0030B001 = null;

	// �� 6 �ϐ������l�F i_c_DB0040B001


	final static String i_c_DB0040B001 = null;

	// �� 7 �ϐ������l�F i_c_ReOut


	final static String i_c_ReOut = null;

	// �� 8 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 9 �ϐ������l�F i_DB0010B001_0_COUNT


	final static String i_DB0010B001_0_COUNT = null;

	// �� 10 �ϐ������l�F i_DB0010B001_1_COUNT


	final static String i_DB0010B001_1_COUNT = null;

	// �� 11 �ϐ������l�F i_DB0020B001_0_COUNT


	final static String i_DB0020B001_0_COUNT = null;

	// �� 12 �ϐ������l�F i_DB0020B001_1_COUNT


	final static String i_DB0020B001_1_COUNT = null;

	// �� 13 �ϐ������l�F i_DB0030B001_0_COUNT


	final static String i_DB0030B001_0_COUNT = null;

	// �� 14 �ϐ������l�F i_DB0030B001_1_COUNT


	final static String i_DB0030B001_1_COUNT = null;

	// �� 15 �ϐ������l�F i_DB0040B001_0_COUNT


	final static String i_DB0040B001_0_COUNT = null;

	// �� 16 �ϐ������l�F i_DB0040B001_1_COUNT


	final static String i_DB0040B001_1_COUNT = null;

	// �� 17 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_COST_TYP


	final static String i_COST_TYP = null;

	// �� 19 �ϐ������l�F i_CREATED_BY


	final static String i_CREATED_BY = null;

	// �� 20 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 21 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 22 �ϐ������l�F i_PROGRAM_CD


	final static String i_PROGRAM_CD = null;

	// �� 23 �ϐ������l�F i_PROGRAM_NAME


	final static String i_PROGRAM_NAME = null;

	// �� 24 �ϐ������l�F i_COST_TYP_DN


	final static String i_COST_TYP_DN = null;

	// �� 25 �ϐ������l�F i_CS_ERROR_CD


	final static String i_CS_ERROR_CD = null;

	// �� 26 �ϐ������l�F i_BATCH_TYP_DN


	final static String i_BATCH_TYP_DN = null;

	// �� 27 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 28 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 29 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 30 �ϐ������l�F i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// �� 31 �ϐ������l�F i_EFFECTIVE_START_DATE


	final static String i_EFFECTIVE_START_DATE = null;

	// �� 32 �ϐ������l�F i_TRANSACTION_TYP_DN


	final static String i_TRANSACTION_TYP_DN = null;

	// �� 33 �ϐ������l�F i_MESSAGE_CD


	final static String i_MESSAGE_CD = null;

	// �� 34 �ϐ������l�F i_MESSAGE


	final static String i_MESSAGE = null;

	// �� 35 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 36 �ϐ������l�F i_LIST_ISS_FLG


	final static String i_LIST_ISS_FLG = null;

	// �� 37 �ϐ������l�F i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// �� 38 �ϐ������l�F i_CREATED_PRG_NM_1


	final static String i_CREATED_PRG_NM_1 = null;

	// �� 39 �ϐ������l�F i_CREATED_PRG_NM_2


	final static String i_CREATED_PRG_NM_2 = null;

	// �� 40 �ϐ������l�F i_CREATED_PRG_NM_3


	final static String i_CREATED_PRG_NM_3 = null;

	// �� 41 �ϐ������l�F i_CREATED_PRG_NM_4


	final static String i_CREATED_PRG_NM_4 = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_COST_TYP_name

	final static String i_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_COST_TYP_val

	final static String i_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_c_DB0010B001

	final static String i_c_DB0010B001 = null;

	// �� 4 �ϐ������l�F i_c_DB0020B001

	final static String i_c_DB0020B001 = null;

	// �� 5 �ϐ������l�F i_c_DB0030B001

	final static String i_c_DB0030B001 = null;

	// �� 6 �ϐ������l�F i_c_DB0040B001

	final static String i_c_DB0040B001 = null;

	// �� 7 �ϐ������l�F i_c_ReOut

	final static String i_c_ReOut = null;

	// �� 8 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 9 �ϐ������l�F i_DB0010B001_0_COUNT

	final static String i_DB0010B001_0_COUNT = null;

	// �� 10 �ϐ������l�F i_DB0010B001_1_COUNT

	final static String i_DB0010B001_1_COUNT = null;

	// �� 11 �ϐ������l�F i_DB0020B001_0_COUNT

	final static String i_DB0020B001_0_COUNT = null;

	// �� 12 �ϐ������l�F i_DB0020B001_1_COUNT

	final static String i_DB0020B001_1_COUNT = null;

	// �� 13 �ϐ������l�F i_DB0030B001_0_COUNT

	final static String i_DB0030B001_0_COUNT = null;

	// �� 14 �ϐ������l�F i_DB0030B001_1_COUNT

	final static String i_DB0030B001_1_COUNT = null;

	// �� 15 �ϐ������l�F i_DB0040B001_0_COUNT

	final static String i_DB0040B001_0_COUNT = null;

	// �� 16 �ϐ������l�F i_DB0040B001_1_COUNT

	final static String i_DB0040B001_1_COUNT = null;

	// �� 17 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_COST_TYP

	final static String i_COST_TYP = null;

	// �� 19 �ϐ������l�F i_CREATED_BY

	final static String i_CREATED_BY = null;

	// �� 20 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 21 �ϐ������l�F i_USER_NAME

	final static String i_USER_NAME = null;

	// �� 22 �ϐ������l�F i_PROGRAM_CD

	final static String i_PROGRAM_CD = null;

	// �� 23 �ϐ������l�F i_PROGRAM_NAME

	final static String i_PROGRAM_NAME = null;

	// �� 24 �ϐ������l�F i_COST_TYP_DN

	final static String i_COST_TYP_DN = null;

	// �� 25 �ϐ������l�F i_CS_ERROR_CD

	final static String i_CS_ERROR_CD = null;

	// �� 26 �ϐ������l�F i_BATCH_TYP_DN

	final static String i_BATCH_TYP_DN = null;

	// �� 27 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 28 �ϐ������l�F i_CS_PROC_CD

	final static String i_CS_PROC_CD = null;

	// �� 29 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 30 �ϐ������l�F i_PROC_COST_CLS_CD

	final static String i_PROC_COST_CLS_CD = null;

	// �� 31 �ϐ������l�F i_EFFECTIVE_START_DATE

	final static String i_EFFECTIVE_START_DATE = null;

	// �� 32 �ϐ������l�F i_TRANSACTION_TYP_DN

	final static String i_TRANSACTION_TYP_DN = null;

	// �� 33 �ϐ������l�F i_MESSAGE_CD

	final static String i_MESSAGE_CD = null;

	// �� 34 �ϐ������l�F i_MESSAGE

	final static String i_MESSAGE = null;

	// �� 35 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 36 �ϐ������l�F i_LIST_ISS_FLG

	final static String i_LIST_ISS_FLG = null;

	// �� 37 �ϐ������l�F i_CREATED_DATE

	final static String i_CREATED_DATE = null;

	// �� 38 �ϐ������l�F i_CREATED_PRG_NM_1

	final static String i_CREATED_PRG_NM_1 = null;

	// �� 39 �ϐ������l�F i_CREATED_PRG_NM_2

	final static String i_CREATED_PRG_NM_2 = null;

	// �� 40 �ϐ������l�F i_CREATED_PRG_NM_3

	final static String i_CREATED_PRG_NM_3 = null;

	// �� 41 �ϐ������l�F i_CREATED_PRG_NM_4

	final static String i_CREATED_PRG_NM_4 = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_COST_TYP_name = i_COST_TYP_name;
		m_COST_TYP_val = i_COST_TYP_val;
		m_c_DB0010B001 = i_c_DB0010B001;
		m_c_DB0020B001 = i_c_DB0020B001;
		m_c_DB0030B001 = i_c_DB0030B001;
		m_c_DB0040B001 = i_c_DB0040B001;
		m_c_ReOut = i_c_ReOut;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_DB0010B001_0_COUNT = i_DB0010B001_0_COUNT;
		m_DB0010B001_1_COUNT = i_DB0010B001_1_COUNT;
		m_DB0020B001_0_COUNT = i_DB0020B001_0_COUNT;
		m_DB0020B001_1_COUNT = i_DB0020B001_1_COUNT;
		m_DB0030B001_0_COUNT = i_DB0030B001_0_COUNT;
		m_DB0030B001_1_COUNT = i_DB0030B001_1_COUNT;
		m_DB0040B001_0_COUNT = i_DB0040B001_0_COUNT;
		m_DB0040B001_1_COUNT = i_DB0040B001_1_COUNT;
		m_PLANT_CD = i_PLANT_CD;
		m_COST_TYP = i_COST_TYP;
		m_CREATED_BY = i_CREATED_BY;
		m_PLANT_NAME = i_PLANT_NAME;
		m_USER_NAME = i_USER_NAME;
		m_PROGRAM_CD = i_PROGRAM_CD;
		m_PROGRAM_NAME = i_PROGRAM_NAME;
		m_COST_TYP_DN = i_COST_TYP_DN;
		m_CS_ERROR_CD = i_CS_ERROR_CD;
		m_BATCH_TYP_DN = i_BATCH_TYP_DN;
		m_ITEM_CD = i_ITEM_CD;
		m_CS_PROC_CD = i_CS_PROC_CD;
		m_VEND_CD = i_VEND_CD;
		m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
		m_EFFECTIVE_START_DATE = i_EFFECTIVE_START_DATE;
		m_TRANSACTION_TYP_DN = i_TRANSACTION_TYP_DN;
		m_MESSAGE_CD = i_MESSAGE_CD;
		m_MESSAGE = i_MESSAGE;
		m_REMARKS = i_REMARKS;
		m_LIST_ISS_FLG = i_LIST_ISS_FLG;
		m_CREATED_DATE = i_CREATED_DATE;
		m_CREATED_PRG_NM_1 = i_CREATED_PRG_NM_1;
		m_CREATED_PRG_NM_2 = i_CREATED_PRG_NM_2;
		m_CREATED_PRG_NM_3 = i_CREATED_PRG_NM_3;
		m_CREATED_PRG_NM_4 = i_CREATED_PRG_NM_4;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
