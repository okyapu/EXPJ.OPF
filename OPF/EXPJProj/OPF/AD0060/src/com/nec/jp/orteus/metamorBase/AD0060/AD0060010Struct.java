/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0060/src/com/nec/jp/orteus/metamorBase/AD0060/AD0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0060;

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
 * CLASS     : AD0060010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/11/05 07:06:10 $
 *
 */
//}}user_implement_code_header

public class AD0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_PRINT_QTY */
	public String m_PRINT_QTY = null;
	/** �� 2 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 3 �ϐ��F m_ORI_IDENT_CARD_QTY */
	public String m_ORI_IDENT_CARD_QTY = null;
	/** �� 4 �ϐ��F m_TEMP_IDENT_CARD_QTY */
	public String m_TEMP_IDENT_CARD_QTY = null;
	/** �� 5 �ϐ��F m_T_IDENT_CARD_CTL_NO */
	public String m_T_IDENT_CARD_CTL_NO = null;
	/** �� 6 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 7 �ϐ��F m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** �� 8 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 9 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 10 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 11 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 12 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 13 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 14 �ϐ��F m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** �� 15 �ϐ��F m_FIRST_IDENT_CARD_QTY */
	public String m_FIRST_IDENT_CARD_QTY = null;
	/** �� 16 �ϐ��F m_IDENT_CARD_QTY */
	public String m_IDENT_CARD_QTY = null;
	/** �� 17 �ϐ��F m_PKG_UNIT_QTY */
	public String m_PKG_UNIT_QTY = null;
	/** �� 18 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 19 �ϐ��F m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** �� 20 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 21 �ϐ��F m_h_UNIT_QTY_TYP */
	public String m_h_UNIT_QTY_TYP = null;
	/** �� 22 �ϐ��F m_IDENT_CARD_CTL_NO */
	public String m_IDENT_CARD_CTL_NO = null;
	/** �� 23 �ϐ��F m_SYS_COMPANY_CD */
	public String m_SYS_COMPANY_CD = null;
	/** �� 24 �ϐ��F m_UPD_IDENT_CARD_QTY */
	public String m_UPD_IDENT_CARD_QTY = null;
	/** �� 25 �ϐ��F m_UPD_PRINT_QTY */
	public String m_UPD_PRINT_QTY = null;
	/** �� 26 �ϐ��F m_UPD_UPDATED_BY */
	public String m_UPD_UPDATED_BY = null;
	/** �� 27 �ϐ��F m_UPD_UPDATED_PRG_NM */
	public String m_UPD_UPDATED_PRG_NM = null;
	/** �� 28 �ϐ��F m_UPD_IDENT_CARD_CTL_NO */
	public String m_UPD_IDENT_CARD_CTL_NO = null;
	/** �� 29 �ϐ��F m_UPD_MODIFY_COUNT */
	public String m_UPD_MODIFY_COUNT = null;
	/** �� 30 �ϐ��F m_TMP_IDENT_CARD_CTL_NO */
	public String m_TMP_IDENT_CARD_CTL_NO = null;
	/** �� 31 �ϐ��F m_TMP_OPR_INST_CD */
	public String m_TMP_OPR_INST_CD = null;
	/** �� 32 �ϐ��F m_TMP_PARTIAL_PRD_NO */
	public String m_TMP_PARTIAL_PRD_NO = null;
	/** �� 33 �ϐ��F m_TMP_RCV_ISSUE_CTRL_CD */
	public String m_TMP_RCV_ISSUE_CTRL_CD = null;
	/** �� 34 �ϐ��F m_TMP_ITEM_CD */
	public String m_TMP_ITEM_CD = null;
	/** �� 35 �ϐ��F m_TMP_JOB_ODR_CD */
	public String m_TMP_JOB_ODR_CD = null;
	/** �� 36 �ϐ��F m_TMP_FIRST_IDENT_CARD_QTY */
	public String m_TMP_FIRST_IDENT_CARD_QTY = null;
	/** �� 37 �ϐ��F m_TMP_IDENT_CARD_QTY */
	public String m_TMP_IDENT_CARD_QTY = null;
	/** �� 38 �ϐ��F m_TMP_OPR_DATE */
	public String m_TMP_OPR_DATE = null;
	/** �� 39 �ϐ��F m_TMP_PKG_UNIT_QTY */
	public String m_TMP_PKG_UNIT_QTY = null;
	/** �� 40 �ϐ��F m_TMP_PLANT_CD */
	public String m_TMP_PLANT_CD = null;
	/** �� 41 �ϐ��F m_TMP_WS_CD */
	public String m_TMP_WS_CD = null;
	/** �� 42 �ϐ��F m_INS_PRINT_GRP_NO */
	public String m_INS_PRINT_GRP_NO = null;
	/** �� 43 �ϐ��F m_INS_PAGE_NO */
	public String m_INS_PAGE_NO = null;
	/** �� 44 �ϐ��F m_INS_IDENT_CARD_CTL_NO */
	public String m_INS_IDENT_CARD_CTL_NO = null;
	/** �� 45 �ϐ��F m_INS_OPR_INST_CD */
	public String m_INS_OPR_INST_CD = null;
	/** �� 46 �ϐ��F m_INS_PARTIAL_PRD_NO */
	public String m_INS_PARTIAL_PRD_NO = null;
	/** �� 47 �ϐ��F m_INS_RCV_ISSUE_CTRL_CD */
	public String m_INS_RCV_ISSUE_CTRL_CD = null;
	/** �� 48 �ϐ��F m_INS_ITEM_CD */
	public String m_INS_ITEM_CD = null;
	/** �� 49 �ϐ��F m_INS_JOB_ODR_CD */
	public String m_INS_JOB_ODR_CD = null;
	/** �� 50 �ϐ��F m_INS_FIRST_IDENT_CARD_QTY */
	public String m_INS_FIRST_IDENT_CARD_QTY = null;
	/** �� 51 �ϐ��F m_INS_IDENT_CARD_QTY */
	public String m_INS_IDENT_CARD_QTY = null;
	/** �� 52 �ϐ��F m_INS_OPR_DATE */
	public String m_INS_OPR_DATE = null;
	/** �� 53 �ϐ��F m_INS_PKG_UNIT_QTY */
	public String m_INS_PKG_UNIT_QTY = null;
	/** �� 54 �ϐ��F m_INS_PLANT_CD */
	public String m_INS_PLANT_CD = null;
	/** �� 55 �ϐ��F m_INS_WS_CD */
	public String m_INS_WS_CD = null;
	/** �� 56 �ϐ��F m_INS_CREATED_BY */
	public String m_INS_CREATED_BY = null;
	/** �� 57 �ϐ��F m_INS_CREATED_PRG_NM */
	public String m_INS_CREATED_PRG_NM = null;
	/** �� 58 �ϐ��F m_INS_UPDATED_BY */
	public String m_INS_UPDATED_BY = null;
	/** �� 59 �ϐ��F m_INS_UPDATED_PRG_NM */
	public String m_INS_UPDATED_PRG_NM = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_PRINT_QTY */
	public List l_PRINT_QTY = null;

	/** �� 2 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 3 List�ϐ��F l_ORI_IDENT_CARD_QTY */
	public List l_ORI_IDENT_CARD_QTY = null;

	/** �� 4 List�ϐ��F l_TEMP_IDENT_CARD_QTY */
	public List l_TEMP_IDENT_CARD_QTY = null;

	/** �� 5 List�ϐ��F l_T_IDENT_CARD_CTL_NO */
	public List l_T_IDENT_CARD_CTL_NO = null;

	/** �� 6 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 7 List�ϐ��F l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** �� 8 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 9 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 10 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 11 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 12 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 13 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 14 List�ϐ��F l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** �� 15 List�ϐ��F l_FIRST_IDENT_CARD_QTY */
	public List l_FIRST_IDENT_CARD_QTY = null;

	/** �� 16 List�ϐ��F l_IDENT_CARD_QTY */
	public List l_IDENT_CARD_QTY = null;

	/** �� 17 List�ϐ��F l_PKG_UNIT_QTY */
	public List l_PKG_UNIT_QTY = null;

	/** �� 18 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** �� 20 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 21 List�ϐ��F l_h_UNIT_QTY_TYP */
	public List l_h_UNIT_QTY_TYP = null;

	/** �� 22 List�ϐ��F l_IDENT_CARD_CTL_NO */
	public List l_IDENT_CARD_CTL_NO = null;

	/** �� 23 List�ϐ��F l_SYS_COMPANY_CD */
	public List l_SYS_COMPANY_CD = null;

	/** �� 24 List�ϐ��F l_UPD_IDENT_CARD_QTY */
	public List l_UPD_IDENT_CARD_QTY = null;

	/** �� 25 List�ϐ��F l_UPD_PRINT_QTY */
	public List l_UPD_PRINT_QTY = null;

	/** �� 26 List�ϐ��F l_UPD_UPDATED_BY */
	public List l_UPD_UPDATED_BY = null;

	/** �� 27 List�ϐ��F l_UPD_UPDATED_PRG_NM */
	public List l_UPD_UPDATED_PRG_NM = null;

	/** �� 28 List�ϐ��F l_UPD_IDENT_CARD_CTL_NO */
	public List l_UPD_IDENT_CARD_CTL_NO = null;

	/** �� 29 List�ϐ��F l_UPD_MODIFY_COUNT */
	public List l_UPD_MODIFY_COUNT = null;

	/** �� 30 List�ϐ��F l_TMP_IDENT_CARD_CTL_NO */
	public List l_TMP_IDENT_CARD_CTL_NO = null;

	/** �� 31 List�ϐ��F l_TMP_OPR_INST_CD */
	public List l_TMP_OPR_INST_CD = null;

	/** �� 32 List�ϐ��F l_TMP_PARTIAL_PRD_NO */
	public List l_TMP_PARTIAL_PRD_NO = null;

	/** �� 33 List�ϐ��F l_TMP_RCV_ISSUE_CTRL_CD */
	public List l_TMP_RCV_ISSUE_CTRL_CD = null;

	/** �� 34 List�ϐ��F l_TMP_ITEM_CD */
	public List l_TMP_ITEM_CD = null;

	/** �� 35 List�ϐ��F l_TMP_JOB_ODR_CD */
	public List l_TMP_JOB_ODR_CD = null;

	/** �� 36 List�ϐ��F l_TMP_FIRST_IDENT_CARD_QTY */
	public List l_TMP_FIRST_IDENT_CARD_QTY = null;

	/** �� 37 List�ϐ��F l_TMP_IDENT_CARD_QTY */
	public List l_TMP_IDENT_CARD_QTY = null;

	/** �� 38 List�ϐ��F l_TMP_OPR_DATE */
	public List l_TMP_OPR_DATE = null;

	/** �� 39 List�ϐ��F l_TMP_PKG_UNIT_QTY */
	public List l_TMP_PKG_UNIT_QTY = null;

	/** �� 40 List�ϐ��F l_TMP_PLANT_CD */
	public List l_TMP_PLANT_CD = null;

	/** �� 41 List�ϐ��F l_TMP_WS_CD */
	public List l_TMP_WS_CD = null;

	/** �� 42 List�ϐ��F l_INS_PRINT_GRP_NO */
	public List l_INS_PRINT_GRP_NO = null;

	/** �� 43 List�ϐ��F l_INS_PAGE_NO */
	public List l_INS_PAGE_NO = null;

	/** �� 44 List�ϐ��F l_INS_IDENT_CARD_CTL_NO */
	public List l_INS_IDENT_CARD_CTL_NO = null;

	/** �� 45 List�ϐ��F l_INS_OPR_INST_CD */
	public List l_INS_OPR_INST_CD = null;

	/** �� 46 List�ϐ��F l_INS_PARTIAL_PRD_NO */
	public List l_INS_PARTIAL_PRD_NO = null;

	/** �� 47 List�ϐ��F l_INS_RCV_ISSUE_CTRL_CD */
	public List l_INS_RCV_ISSUE_CTRL_CD = null;

	/** �� 48 List�ϐ��F l_INS_ITEM_CD */
	public List l_INS_ITEM_CD = null;

	/** �� 49 List�ϐ��F l_INS_JOB_ODR_CD */
	public List l_INS_JOB_ODR_CD = null;

	/** �� 50 List�ϐ��F l_INS_FIRST_IDENT_CARD_QTY */
	public List l_INS_FIRST_IDENT_CARD_QTY = null;

	/** �� 51 List�ϐ��F l_INS_IDENT_CARD_QTY */
	public List l_INS_IDENT_CARD_QTY = null;

	/** �� 52 List�ϐ��F l_INS_OPR_DATE */
	public List l_INS_OPR_DATE = null;

	/** �� 53 List�ϐ��F l_INS_PKG_UNIT_QTY */
	public List l_INS_PKG_UNIT_QTY = null;

	/** �� 54 List�ϐ��F l_INS_PLANT_CD */
	public List l_INS_PLANT_CD = null;

	/** �� 55 List�ϐ��F l_INS_WS_CD */
	public List l_INS_WS_CD = null;

	/** �� 56 List�ϐ��F l_INS_CREATED_BY */
	public List l_INS_CREATED_BY = null;

	/** �� 57 List�ϐ��F l_INS_CREATED_PRG_NM */
	public List l_INS_CREATED_PRG_NM = null;

	/** �� 58 List�ϐ��F l_INS_UPDATED_BY */
	public List l_INS_UPDATED_BY = null;

	/** �� 59 List�ϐ��F l_INS_UPDATED_PRG_NM */
	public List l_INS_UPDATED_PRG_NM = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPRINT_QTY() { return m_PRINT_QTY; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getORI_IDENT_CARD_QTY() { return m_ORI_IDENT_CARD_QTY; }
	public String getTEMP_IDENT_CARD_QTY() { return m_TEMP_IDENT_CARD_QTY; }
	public String getT_IDENT_CARD_CTL_NO() { return m_T_IDENT_CARD_CTL_NO; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getFIRST_IDENT_CARD_QTY() { return m_FIRST_IDENT_CARD_QTY; }
	public String getIDENT_CARD_QTY() { return m_IDENT_CARD_QTY; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String geth_UNIT_QTY_TYP() { return m_h_UNIT_QTY_TYP; }
	public String getIDENT_CARD_CTL_NO() { return m_IDENT_CARD_CTL_NO; }
	public String getSYS_COMPANY_CD() { return m_SYS_COMPANY_CD; }
	public String getUPD_IDENT_CARD_QTY() { return m_UPD_IDENT_CARD_QTY; }
	public String getUPD_PRINT_QTY() { return m_UPD_PRINT_QTY; }
	public String getUPD_UPDATED_BY() { return m_UPD_UPDATED_BY; }
	public String getUPD_UPDATED_PRG_NM() { return m_UPD_UPDATED_PRG_NM; }
	public String getUPD_IDENT_CARD_CTL_NO() { return m_UPD_IDENT_CARD_CTL_NO; }
	public String getUPD_MODIFY_COUNT() { return m_UPD_MODIFY_COUNT; }
	public String getTMP_IDENT_CARD_CTL_NO() { return m_TMP_IDENT_CARD_CTL_NO; }
	public String getTMP_OPR_INST_CD() { return m_TMP_OPR_INST_CD; }
	public String getTMP_PARTIAL_PRD_NO() { return m_TMP_PARTIAL_PRD_NO; }
	public String getTMP_RCV_ISSUE_CTRL_CD() { return m_TMP_RCV_ISSUE_CTRL_CD; }
	public String getTMP_ITEM_CD() { return m_TMP_ITEM_CD; }
	public String getTMP_JOB_ODR_CD() { return m_TMP_JOB_ODR_CD; }
	public String getTMP_FIRST_IDENT_CARD_QTY() { return m_TMP_FIRST_IDENT_CARD_QTY; }
	public String getTMP_IDENT_CARD_QTY() { return m_TMP_IDENT_CARD_QTY; }
	public String getTMP_OPR_DATE() { return m_TMP_OPR_DATE; }
	public String getTMP_PKG_UNIT_QTY() { return m_TMP_PKG_UNIT_QTY; }
	public String getTMP_PLANT_CD() { return m_TMP_PLANT_CD; }
	public String getTMP_WS_CD() { return m_TMP_WS_CD; }
	public String getINS_PRINT_GRP_NO() { return m_INS_PRINT_GRP_NO; }
	public String getINS_PAGE_NO() { return m_INS_PAGE_NO; }
	public String getINS_IDENT_CARD_CTL_NO() { return m_INS_IDENT_CARD_CTL_NO; }
	public String getINS_OPR_INST_CD() { return m_INS_OPR_INST_CD; }
	public String getINS_PARTIAL_PRD_NO() { return m_INS_PARTIAL_PRD_NO; }
	public String getINS_RCV_ISSUE_CTRL_CD() { return m_INS_RCV_ISSUE_CTRL_CD; }
	public String getINS_ITEM_CD() { return m_INS_ITEM_CD; }
	public String getINS_JOB_ODR_CD() { return m_INS_JOB_ODR_CD; }
	public String getINS_FIRST_IDENT_CARD_QTY() { return m_INS_FIRST_IDENT_CARD_QTY; }
	public String getINS_IDENT_CARD_QTY() { return m_INS_IDENT_CARD_QTY; }
	public String getINS_OPR_DATE() { return m_INS_OPR_DATE; }
	public String getINS_PKG_UNIT_QTY() { return m_INS_PKG_UNIT_QTY; }
	public String getINS_PLANT_CD() { return m_INS_PLANT_CD; }
	public String getINS_WS_CD() { return m_INS_WS_CD; }
	public String getINS_CREATED_BY() { return m_INS_CREATED_BY; }
	public String getINS_CREATED_PRG_NM() { return m_INS_CREATED_PRG_NM; }
	public String getINS_UPDATED_BY() { return m_INS_UPDATED_BY; }
	public String getINS_UPDATED_PRG_NM() { return m_INS_UPDATED_PRG_NM; }

	public List getList_PRINT_QTY() { return l_PRINT_QTY; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_ORI_IDENT_CARD_QTY() { return l_ORI_IDENT_CARD_QTY; }
	public List getList_TEMP_IDENT_CARD_QTY() { return l_TEMP_IDENT_CARD_QTY; }
	public List getList_T_IDENT_CARD_CTL_NO() { return l_T_IDENT_CARD_CTL_NO; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_FIRST_IDENT_CARD_QTY() { return l_FIRST_IDENT_CARD_QTY; }
	public List getList_IDENT_CARD_QTY() { return l_IDENT_CARD_QTY; }
	public List getList_PKG_UNIT_QTY() { return l_PKG_UNIT_QTY; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_h_UNIT_QTY_TYP() { return l_h_UNIT_QTY_TYP; }
	public List getList_IDENT_CARD_CTL_NO() { return l_IDENT_CARD_CTL_NO; }
	public List getList_SYS_COMPANY_CD() { return l_SYS_COMPANY_CD; }
	public List getList_UPD_IDENT_CARD_QTY() { return l_UPD_IDENT_CARD_QTY; }
	public List getList_UPD_PRINT_QTY() { return l_UPD_PRINT_QTY; }
	public List getList_UPD_UPDATED_BY() { return l_UPD_UPDATED_BY; }
	public List getList_UPD_UPDATED_PRG_NM() { return l_UPD_UPDATED_PRG_NM; }
	public List getList_UPD_IDENT_CARD_CTL_NO() { return l_UPD_IDENT_CARD_CTL_NO; }
	public List getList_UPD_MODIFY_COUNT() { return l_UPD_MODIFY_COUNT; }
	public List getList_TMP_IDENT_CARD_CTL_NO() { return l_TMP_IDENT_CARD_CTL_NO; }
	public List getList_TMP_OPR_INST_CD() { return l_TMP_OPR_INST_CD; }
	public List getList_TMP_PARTIAL_PRD_NO() { return l_TMP_PARTIAL_PRD_NO; }
	public List getList_TMP_RCV_ISSUE_CTRL_CD() { return l_TMP_RCV_ISSUE_CTRL_CD; }
	public List getList_TMP_ITEM_CD() { return l_TMP_ITEM_CD; }
	public List getList_TMP_JOB_ODR_CD() { return l_TMP_JOB_ODR_CD; }
	public List getList_TMP_FIRST_IDENT_CARD_QTY() { return l_TMP_FIRST_IDENT_CARD_QTY; }
	public List getList_TMP_IDENT_CARD_QTY() { return l_TMP_IDENT_CARD_QTY; }
	public List getList_TMP_OPR_DATE() { return l_TMP_OPR_DATE; }
	public List getList_TMP_PKG_UNIT_QTY() { return l_TMP_PKG_UNIT_QTY; }
	public List getList_TMP_PLANT_CD() { return l_TMP_PLANT_CD; }
	public List getList_TMP_WS_CD() { return l_TMP_WS_CD; }
	public List getList_INS_PRINT_GRP_NO() { return l_INS_PRINT_GRP_NO; }
	public List getList_INS_PAGE_NO() { return l_INS_PAGE_NO; }
	public List getList_INS_IDENT_CARD_CTL_NO() { return l_INS_IDENT_CARD_CTL_NO; }
	public List getList_INS_OPR_INST_CD() { return l_INS_OPR_INST_CD; }
	public List getList_INS_PARTIAL_PRD_NO() { return l_INS_PARTIAL_PRD_NO; }
	public List getList_INS_RCV_ISSUE_CTRL_CD() { return l_INS_RCV_ISSUE_CTRL_CD; }
	public List getList_INS_ITEM_CD() { return l_INS_ITEM_CD; }
	public List getList_INS_JOB_ODR_CD() { return l_INS_JOB_ODR_CD; }
	public List getList_INS_FIRST_IDENT_CARD_QTY() { return l_INS_FIRST_IDENT_CARD_QTY; }
	public List getList_INS_IDENT_CARD_QTY() { return l_INS_IDENT_CARD_QTY; }
	public List getList_INS_OPR_DATE() { return l_INS_OPR_DATE; }
	public List getList_INS_PKG_UNIT_QTY() { return l_INS_PKG_UNIT_QTY; }
	public List getList_INS_PLANT_CD() { return l_INS_PLANT_CD; }
	public List getList_INS_WS_CD() { return l_INS_WS_CD; }
	public List getList_INS_CREATED_BY() { return l_INS_CREATED_BY; }
	public List getList_INS_CREATED_PRG_NM() { return l_INS_CREATED_PRG_NM; }
	public List getList_INS_UPDATED_BY() { return l_INS_UPDATED_BY; }
	public List getList_INS_UPDATED_PRG_NM() { return l_INS_UPDATED_PRG_NM; }

	public void setPRINT_QTY(String val) { m_PRINT_QTY = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setORI_IDENT_CARD_QTY(String val) { m_ORI_IDENT_CARD_QTY = val; }
	public void setTEMP_IDENT_CARD_QTY(String val) { m_TEMP_IDENT_CARD_QTY = val; }
	public void setT_IDENT_CARD_CTL_NO(String val) { m_T_IDENT_CARD_CTL_NO = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setFIRST_IDENT_CARD_QTY(String val) { m_FIRST_IDENT_CARD_QTY = val; }
	public void setIDENT_CARD_QTY(String val) { m_IDENT_CARD_QTY = val; }
	public void setPKG_UNIT_QTY(String val) { m_PKG_UNIT_QTY = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void seth_UNIT_QTY_TYP(String val) { m_h_UNIT_QTY_TYP = val; }
	public void setIDENT_CARD_CTL_NO(String val) { m_IDENT_CARD_CTL_NO = val; }
	public void setSYS_COMPANY_CD(String val) { m_SYS_COMPANY_CD = val; }
	public void setUPD_IDENT_CARD_QTY(String val) { m_UPD_IDENT_CARD_QTY = val; }
	public void setUPD_PRINT_QTY(String val) { m_UPD_PRINT_QTY = val; }
	public void setUPD_UPDATED_BY(String val) { m_UPD_UPDATED_BY = val; }
	public void setUPD_UPDATED_PRG_NM(String val) { m_UPD_UPDATED_PRG_NM = val; }
	public void setUPD_IDENT_CARD_CTL_NO(String val) { m_UPD_IDENT_CARD_CTL_NO = val; }
	public void setUPD_MODIFY_COUNT(String val) { m_UPD_MODIFY_COUNT = val; }
	public void setTMP_IDENT_CARD_CTL_NO(String val) { m_TMP_IDENT_CARD_CTL_NO = val; }
	public void setTMP_OPR_INST_CD(String val) { m_TMP_OPR_INST_CD = val; }
	public void setTMP_PARTIAL_PRD_NO(String val) { m_TMP_PARTIAL_PRD_NO = val; }
	public void setTMP_RCV_ISSUE_CTRL_CD(String val) { m_TMP_RCV_ISSUE_CTRL_CD = val; }
	public void setTMP_ITEM_CD(String val) { m_TMP_ITEM_CD = val; }
	public void setTMP_JOB_ODR_CD(String val) { m_TMP_JOB_ODR_CD = val; }
	public void setTMP_FIRST_IDENT_CARD_QTY(String val) { m_TMP_FIRST_IDENT_CARD_QTY = val; }
	public void setTMP_IDENT_CARD_QTY(String val) { m_TMP_IDENT_CARD_QTY = val; }
	public void setTMP_OPR_DATE(String val) { m_TMP_OPR_DATE = val; }
	public void setTMP_PKG_UNIT_QTY(String val) { m_TMP_PKG_UNIT_QTY = val; }
	public void setTMP_PLANT_CD(String val) { m_TMP_PLANT_CD = val; }
	public void setTMP_WS_CD(String val) { m_TMP_WS_CD = val; }
	public void setINS_PRINT_GRP_NO(String val) { m_INS_PRINT_GRP_NO = val; }
	public void setINS_PAGE_NO(String val) { m_INS_PAGE_NO = val; }
	public void setINS_IDENT_CARD_CTL_NO(String val) { m_INS_IDENT_CARD_CTL_NO = val; }
	public void setINS_OPR_INST_CD(String val) { m_INS_OPR_INST_CD = val; }
	public void setINS_PARTIAL_PRD_NO(String val) { m_INS_PARTIAL_PRD_NO = val; }
	public void setINS_RCV_ISSUE_CTRL_CD(String val) { m_INS_RCV_ISSUE_CTRL_CD = val; }
	public void setINS_ITEM_CD(String val) { m_INS_ITEM_CD = val; }
	public void setINS_JOB_ODR_CD(String val) { m_INS_JOB_ODR_CD = val; }
	public void setINS_FIRST_IDENT_CARD_QTY(String val) { m_INS_FIRST_IDENT_CARD_QTY = val; }
	public void setINS_IDENT_CARD_QTY(String val) { m_INS_IDENT_CARD_QTY = val; }
	public void setINS_OPR_DATE(String val) { m_INS_OPR_DATE = val; }
	public void setINS_PKG_UNIT_QTY(String val) { m_INS_PKG_UNIT_QTY = val; }
	public void setINS_PLANT_CD(String val) { m_INS_PLANT_CD = val; }
	public void setINS_WS_CD(String val) { m_INS_WS_CD = val; }
	public void setINS_CREATED_BY(String val) { m_INS_CREATED_BY = val; }
	public void setINS_CREATED_PRG_NM(String val) { m_INS_CREATED_PRG_NM = val; }
	public void setINS_UPDATED_BY(String val) { m_INS_UPDATED_BY = val; }
	public void setINS_UPDATED_PRG_NM(String val) { m_INS_UPDATED_PRG_NM = val; }


	public void setList_PRINT_QTY(List list) { l_PRINT_QTY = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_ORI_IDENT_CARD_QTY(List list) { l_ORI_IDENT_CARD_QTY = list; }
	public void setList_TEMP_IDENT_CARD_QTY(List list) { l_TEMP_IDENT_CARD_QTY = list; }
	public void setList_T_IDENT_CARD_CTL_NO(List list) { l_T_IDENT_CARD_CTL_NO = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_FIRST_IDENT_CARD_QTY(List list) { l_FIRST_IDENT_CARD_QTY = list; }
	public void setList_IDENT_CARD_QTY(List list) { l_IDENT_CARD_QTY = list; }
	public void setList_PKG_UNIT_QTY(List list) { l_PKG_UNIT_QTY = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_h_UNIT_QTY_TYP(List list) { l_h_UNIT_QTY_TYP = list; }
	public void setList_IDENT_CARD_CTL_NO(List list) { l_IDENT_CARD_CTL_NO = list; }
	public void setList_SYS_COMPANY_CD(List list) { l_SYS_COMPANY_CD = list; }
	public void setList_UPD_IDENT_CARD_QTY(List list) { l_UPD_IDENT_CARD_QTY = list; }
	public void setList_UPD_PRINT_QTY(List list) { l_UPD_PRINT_QTY = list; }
	public void setList_UPD_UPDATED_BY(List list) { l_UPD_UPDATED_BY = list; }
	public void setList_UPD_UPDATED_PRG_NM(List list) { l_UPD_UPDATED_PRG_NM = list; }
	public void setList_UPD_IDENT_CARD_CTL_NO(List list) { l_UPD_IDENT_CARD_CTL_NO = list; }
	public void setList_UPD_MODIFY_COUNT(List list) { l_UPD_MODIFY_COUNT = list; }
	public void setList_TMP_IDENT_CARD_CTL_NO(List list) { l_TMP_IDENT_CARD_CTL_NO = list; }
	public void setList_TMP_OPR_INST_CD(List list) { l_TMP_OPR_INST_CD = list; }
	public void setList_TMP_PARTIAL_PRD_NO(List list) { l_TMP_PARTIAL_PRD_NO = list; }
	public void setList_TMP_RCV_ISSUE_CTRL_CD(List list) { l_TMP_RCV_ISSUE_CTRL_CD = list; }
	public void setList_TMP_ITEM_CD(List list) { l_TMP_ITEM_CD = list; }
	public void setList_TMP_JOB_ODR_CD(List list) { l_TMP_JOB_ODR_CD = list; }
	public void setList_TMP_FIRST_IDENT_CARD_QTY(List list) { l_TMP_FIRST_IDENT_CARD_QTY = list; }
	public void setList_TMP_IDENT_CARD_QTY(List list) { l_TMP_IDENT_CARD_QTY = list; }
	public void setList_TMP_OPR_DATE(List list) { l_TMP_OPR_DATE = list; }
	public void setList_TMP_PKG_UNIT_QTY(List list) { l_TMP_PKG_UNIT_QTY = list; }
	public void setList_TMP_PLANT_CD(List list) { l_TMP_PLANT_CD = list; }
	public void setList_TMP_WS_CD(List list) { l_TMP_WS_CD = list; }
	public void setList_INS_PRINT_GRP_NO(List list) { l_INS_PRINT_GRP_NO = list; }
	public void setList_INS_PAGE_NO(List list) { l_INS_PAGE_NO = list; }
	public void setList_INS_IDENT_CARD_CTL_NO(List list) { l_INS_IDENT_CARD_CTL_NO = list; }
	public void setList_INS_OPR_INST_CD(List list) { l_INS_OPR_INST_CD = list; }
	public void setList_INS_PARTIAL_PRD_NO(List list) { l_INS_PARTIAL_PRD_NO = list; }
	public void setList_INS_RCV_ISSUE_CTRL_CD(List list) { l_INS_RCV_ISSUE_CTRL_CD = list; }
	public void setList_INS_ITEM_CD(List list) { l_INS_ITEM_CD = list; }
	public void setList_INS_JOB_ODR_CD(List list) { l_INS_JOB_ODR_CD = list; }
	public void setList_INS_FIRST_IDENT_CARD_QTY(List list) { l_INS_FIRST_IDENT_CARD_QTY = list; }
	public void setList_INS_IDENT_CARD_QTY(List list) { l_INS_IDENT_CARD_QTY = list; }
	public void setList_INS_OPR_DATE(List list) { l_INS_OPR_DATE = list; }
	public void setList_INS_PKG_UNIT_QTY(List list) { l_INS_PKG_UNIT_QTY = list; }
	public void setList_INS_PLANT_CD(List list) { l_INS_PLANT_CD = list; }
	public void setList_INS_WS_CD(List list) { l_INS_WS_CD = list; }
	public void setList_INS_CREATED_BY(List list) { l_INS_CREATED_BY = list; }
	public void setList_INS_CREATED_PRG_NM(List list) { l_INS_CREATED_PRG_NM = list; }
	public void setList_INS_UPDATED_BY(List list) { l_INS_UPDATED_BY = list; }
	public void setList_INS_UPDATED_PRG_NM(List list) { l_INS_UPDATED_PRG_NM = list; }

	public int setL2L_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_QTY == null) {
			l_PRINT_QTY = new ArrayList();
		} else {
			l_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_QTY.add(((AD0060010Struct) list.get(i)).getPRINT_QTY());
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
			l_DOWNLOAD_FILE.add(((AD0060010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_ORI_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORI_IDENT_CARD_QTY == null) {
			l_ORI_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_ORI_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORI_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getORI_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_IDENT_CARD_QTY == null) {
			l_TEMP_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_TEMP_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getTEMP_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_T_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_IDENT_CARD_CTL_NO == null) {
			l_T_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_T_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_IDENT_CARD_CTL_NO.add(((AD0060010Struct) list.get(i)).getT_IDENT_CARD_CTL_NO());
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
			l_OPR_INST_CD.add(((AD0060010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_PRD_NO == null) {
			l_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_PRD_NO.add(((AD0060010Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_ITEM_CD.add(((AD0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AD0060010Struct) list.get(i)).getITEM_NAME());
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
			l_WS_CD.add(((AD0060010Struct) list.get(i)).getWS_CD());
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
			l_WS_NAME.add(((AD0060010Struct) list.get(i)).getWS_NAME());
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
			l_JOB_ODR_CD.add(((AD0060010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AD0060010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE == null) {
			l_OPR_DATE = new ArrayList();
		} else {
			l_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE.add(((AD0060010Struct) list.get(i)).getOPR_DATE());
		}
		return size;
	}
	public int setL2L_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_IDENT_CARD_QTY == null) {
			l_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getFIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_QTY == null) {
			l_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getIDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT_QTY == null) {
			l_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT_QTY.add(((AD0060010Struct) list.get(i)).getPKG_UNIT_QTY());
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
			l_PLANT_CD.add(((AD0060010Struct) list.get(i)).getPLANT_CD());
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
			l_DEL_FLG.add(((AD0060010Struct) list.get(i)).getDEL_FLG());
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
			l_MODIFY_COUNT.add(((AD0060010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_QTY_TYP == null) {
			l_h_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_h_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_QTY_TYP.add(((AD0060010Struct) list.get(i)).geth_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IDENT_CARD_CTL_NO == null) {
			l_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IDENT_CARD_CTL_NO.add(((AD0060010Struct) list.get(i)).getIDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_SYS_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_COMPANY_CD == null) {
			l_SYS_COMPANY_CD = new ArrayList();
		} else {
			l_SYS_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_COMPANY_CD.add(((AD0060010Struct) list.get(i)).getSYS_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_UPD_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_IDENT_CARD_QTY == null) {
			l_UPD_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_UPD_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getUPD_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_UPD_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_PRINT_QTY == null) {
			l_UPD_PRINT_QTY = new ArrayList();
		} else {
			l_UPD_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_PRINT_QTY.add(((AD0060010Struct) list.get(i)).getUPD_PRINT_QTY());
		}
		return size;
	}
	public int setL2L_UPD_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_UPDATED_BY == null) {
			l_UPD_UPDATED_BY = new ArrayList();
		} else {
			l_UPD_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_UPDATED_BY.add(((AD0060010Struct) list.get(i)).getUPD_UPDATED_BY());
		}
		return size;
	}
	public int setL2L_UPD_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_UPDATED_PRG_NM == null) {
			l_UPD_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_UPD_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_UPDATED_PRG_NM.add(((AD0060010Struct) list.get(i)).getUPD_UPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_UPD_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_IDENT_CARD_CTL_NO == null) {
			l_UPD_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_UPD_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_IDENT_CARD_CTL_NO.add(((AD0060010Struct) list.get(i)).getUPD_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_UPD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPD_MODIFY_COUNT == null) {
			l_UPD_MODIFY_COUNT = new ArrayList();
		} else {
			l_UPD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPD_MODIFY_COUNT.add(((AD0060010Struct) list.get(i)).getUPD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_TMP_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_IDENT_CARD_CTL_NO == null) {
			l_TMP_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_TMP_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_IDENT_CARD_CTL_NO.add(((AD0060010Struct) list.get(i)).getTMP_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_TMP_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_OPR_INST_CD == null) {
			l_TMP_OPR_INST_CD = new ArrayList();
		} else {
			l_TMP_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_OPR_INST_CD.add(((AD0060010Struct) list.get(i)).getTMP_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_TMP_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PARTIAL_PRD_NO == null) {
			l_TMP_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_TMP_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PARTIAL_PRD_NO.add(((AD0060010Struct) list.get(i)).getTMP_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_TMP_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_RCV_ISSUE_CTRL_CD == null) {
			l_TMP_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_TMP_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_RCV_ISSUE_CTRL_CD.add(((AD0060010Struct) list.get(i)).getTMP_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_TMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_ITEM_CD == null) {
			l_TMP_ITEM_CD = new ArrayList();
		} else {
			l_TMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_ITEM_CD.add(((AD0060010Struct) list.get(i)).getTMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TMP_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_JOB_ODR_CD == null) {
			l_TMP_JOB_ODR_CD = new ArrayList();
		} else {
			l_TMP_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_JOB_ODR_CD.add(((AD0060010Struct) list.get(i)).getTMP_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_TMP_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_FIRST_IDENT_CARD_QTY == null) {
			l_TMP_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_TMP_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_FIRST_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getTMP_FIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_TMP_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_IDENT_CARD_QTY == null) {
			l_TMP_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_TMP_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getTMP_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_TMP_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_OPR_DATE == null) {
			l_TMP_OPR_DATE = new ArrayList();
		} else {
			l_TMP_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_OPR_DATE.add(((AD0060010Struct) list.get(i)).getTMP_OPR_DATE());
		}
		return size;
	}
	public int setL2L_TMP_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PKG_UNIT_QTY == null) {
			l_TMP_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_TMP_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PKG_UNIT_QTY.add(((AD0060010Struct) list.get(i)).getTMP_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_TMP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PLANT_CD == null) {
			l_TMP_PLANT_CD = new ArrayList();
		} else {
			l_TMP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PLANT_CD.add(((AD0060010Struct) list.get(i)).getTMP_PLANT_CD());
		}
		return size;
	}
	public int setL2L_TMP_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_WS_CD == null) {
			l_TMP_WS_CD = new ArrayList();
		} else {
			l_TMP_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_WS_CD.add(((AD0060010Struct) list.get(i)).getTMP_WS_CD());
		}
		return size;
	}
	public int setL2L_INS_PRINT_GRP_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PRINT_GRP_NO == null) {
			l_INS_PRINT_GRP_NO = new ArrayList();
		} else {
			l_INS_PRINT_GRP_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PRINT_GRP_NO.add(((AD0060010Struct) list.get(i)).getINS_PRINT_GRP_NO());
		}
		return size;
	}
	public int setL2L_INS_PAGE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PAGE_NO == null) {
			l_INS_PAGE_NO = new ArrayList();
		} else {
			l_INS_PAGE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PAGE_NO.add(((AD0060010Struct) list.get(i)).getINS_PAGE_NO());
		}
		return size;
	}
	public int setL2L_INS_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_IDENT_CARD_CTL_NO == null) {
			l_INS_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_INS_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_IDENT_CARD_CTL_NO.add(((AD0060010Struct) list.get(i)).getINS_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_INS_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_OPR_INST_CD == null) {
			l_INS_OPR_INST_CD = new ArrayList();
		} else {
			l_INS_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_OPR_INST_CD.add(((AD0060010Struct) list.get(i)).getINS_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_INS_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PARTIAL_PRD_NO == null) {
			l_INS_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_INS_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PARTIAL_PRD_NO.add(((AD0060010Struct) list.get(i)).getINS_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_INS_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_RCV_ISSUE_CTRL_CD == null) {
			l_INS_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_INS_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_RCV_ISSUE_CTRL_CD.add(((AD0060010Struct) list.get(i)).getINS_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_INS_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_ITEM_CD == null) {
			l_INS_ITEM_CD = new ArrayList();
		} else {
			l_INS_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_ITEM_CD.add(((AD0060010Struct) list.get(i)).getINS_ITEM_CD());
		}
		return size;
	}
	public int setL2L_INS_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_JOB_ODR_CD == null) {
			l_INS_JOB_ODR_CD = new ArrayList();
		} else {
			l_INS_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_JOB_ODR_CD.add(((AD0060010Struct) list.get(i)).getINS_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_INS_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_FIRST_IDENT_CARD_QTY == null) {
			l_INS_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_INS_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_FIRST_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getINS_FIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_INS_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_IDENT_CARD_QTY == null) {
			l_INS_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_INS_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_IDENT_CARD_QTY.add(((AD0060010Struct) list.get(i)).getINS_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_INS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_OPR_DATE == null) {
			l_INS_OPR_DATE = new ArrayList();
		} else {
			l_INS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_OPR_DATE.add(((AD0060010Struct) list.get(i)).getINS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_INS_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PKG_UNIT_QTY == null) {
			l_INS_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_INS_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PKG_UNIT_QTY.add(((AD0060010Struct) list.get(i)).getINS_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_INS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PLANT_CD == null) {
			l_INS_PLANT_CD = new ArrayList();
		} else {
			l_INS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PLANT_CD.add(((AD0060010Struct) list.get(i)).getINS_PLANT_CD());
		}
		return size;
	}
	public int setL2L_INS_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_WS_CD == null) {
			l_INS_WS_CD = new ArrayList();
		} else {
			l_INS_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_WS_CD.add(((AD0060010Struct) list.get(i)).getINS_WS_CD());
		}
		return size;
	}
	public int setL2L_INS_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_CREATED_BY == null) {
			l_INS_CREATED_BY = new ArrayList();
		} else {
			l_INS_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_CREATED_BY.add(((AD0060010Struct) list.get(i)).getINS_CREATED_BY());
		}
		return size;
	}
	public int setL2L_INS_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_CREATED_PRG_NM == null) {
			l_INS_CREATED_PRG_NM = new ArrayList();
		} else {
			l_INS_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_CREATED_PRG_NM.add(((AD0060010Struct) list.get(i)).getINS_CREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_INS_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_UPDATED_BY == null) {
			l_INS_UPDATED_BY = new ArrayList();
		} else {
			l_INS_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_UPDATED_BY.add(((AD0060010Struct) list.get(i)).getINS_UPDATED_BY());
		}
		return size;
	}
	public int setL2L_INS_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_UPDATED_PRG_NM == null) {
			l_INS_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_INS_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_UPDATED_PRG_NM.add(((AD0060010Struct) list.get(i)).getINS_UPDATED_PRG_NM());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PRINT_QTY = null;
		m_DOWNLOAD_FILE = null;
		m_ORI_IDENT_CARD_QTY = null;
		m_TEMP_IDENT_CARD_QTY = null;
		m_T_IDENT_CARD_CTL_NO = null;
		m_OPR_INST_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_JOB_ODR_CD = null;
		m_LOT_NO = null;
		m_OPR_DATE = null;
		m_FIRST_IDENT_CARD_QTY = null;
		m_IDENT_CARD_QTY = null;
		m_PKG_UNIT_QTY = null;
		m_PLANT_CD = null;
		m_DEL_FLG = null;
		m_MODIFY_COUNT = null;
		m_h_UNIT_QTY_TYP = null;
		m_IDENT_CARD_CTL_NO = null;
		m_SYS_COMPANY_CD = null;
		m_UPD_IDENT_CARD_QTY = null;
		m_UPD_PRINT_QTY = null;
		m_UPD_UPDATED_BY = null;
		m_UPD_UPDATED_PRG_NM = null;
		m_UPD_IDENT_CARD_CTL_NO = null;
		m_UPD_MODIFY_COUNT = null;
		m_TMP_IDENT_CARD_CTL_NO = null;
		m_TMP_OPR_INST_CD = null;
		m_TMP_PARTIAL_PRD_NO = null;
		m_TMP_RCV_ISSUE_CTRL_CD = null;
		m_TMP_ITEM_CD = null;
		m_TMP_JOB_ODR_CD = null;
		m_TMP_FIRST_IDENT_CARD_QTY = null;
		m_TMP_IDENT_CARD_QTY = null;
		m_TMP_OPR_DATE = null;
		m_TMP_PKG_UNIT_QTY = null;
		m_TMP_PLANT_CD = null;
		m_TMP_WS_CD = null;
		m_INS_PRINT_GRP_NO = null;
		m_INS_PAGE_NO = null;
		m_INS_IDENT_CARD_CTL_NO = null;
		m_INS_OPR_INST_CD = null;
		m_INS_PARTIAL_PRD_NO = null;
		m_INS_RCV_ISSUE_CTRL_CD = null;
		m_INS_ITEM_CD = null;
		m_INS_JOB_ODR_CD = null;
		m_INS_FIRST_IDENT_CARD_QTY = null;
		m_INS_IDENT_CARD_QTY = null;
		m_INS_OPR_DATE = null;
		m_INS_PKG_UNIT_QTY = null;
		m_INS_PLANT_CD = null;
		m_INS_WS_CD = null;
		m_INS_CREATED_BY = null;
		m_INS_CREATED_PRG_NM = null;
		m_INS_UPDATED_BY = null;
		m_INS_UPDATED_PRG_NM = null;

		l_PRINT_QTY = null;
		l_DOWNLOAD_FILE = null;
		l_ORI_IDENT_CARD_QTY = null;
		l_TEMP_IDENT_CARD_QTY = null;
		l_T_IDENT_CARD_CTL_NO = null;
		l_OPR_INST_CD = null;
		l_PARTIAL_PRD_NO = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_JOB_ODR_CD = null;
		l_LOT_NO = null;
		l_OPR_DATE = null;
		l_FIRST_IDENT_CARD_QTY = null;
		l_IDENT_CARD_QTY = null;
		l_PKG_UNIT_QTY = null;
		l_PLANT_CD = null;
		l_DEL_FLG = null;
		l_MODIFY_COUNT = null;
		l_h_UNIT_QTY_TYP = null;
		l_IDENT_CARD_CTL_NO = null;
		l_SYS_COMPANY_CD = null;
		l_UPD_IDENT_CARD_QTY = null;
		l_UPD_PRINT_QTY = null;
		l_UPD_UPDATED_BY = null;
		l_UPD_UPDATED_PRG_NM = null;
		l_UPD_IDENT_CARD_CTL_NO = null;
		l_UPD_MODIFY_COUNT = null;
		l_TMP_IDENT_CARD_CTL_NO = null;
		l_TMP_OPR_INST_CD = null;
		l_TMP_PARTIAL_PRD_NO = null;
		l_TMP_RCV_ISSUE_CTRL_CD = null;
		l_TMP_ITEM_CD = null;
		l_TMP_JOB_ODR_CD = null;
		l_TMP_FIRST_IDENT_CARD_QTY = null;
		l_TMP_IDENT_CARD_QTY = null;
		l_TMP_OPR_DATE = null;
		l_TMP_PKG_UNIT_QTY = null;
		l_TMP_PLANT_CD = null;
		l_TMP_WS_CD = null;
		l_INS_PRINT_GRP_NO = null;
		l_INS_PAGE_NO = null;
		l_INS_IDENT_CARD_CTL_NO = null;
		l_INS_OPR_INST_CD = null;
		l_INS_PARTIAL_PRD_NO = null;
		l_INS_RCV_ISSUE_CTRL_CD = null;
		l_INS_ITEM_CD = null;
		l_INS_JOB_ODR_CD = null;
		l_INS_FIRST_IDENT_CARD_QTY = null;
		l_INS_IDENT_CARD_QTY = null;
		l_INS_OPR_DATE = null;
		l_INS_PKG_UNIT_QTY = null;
		l_INS_PLANT_CD = null;
		l_INS_WS_CD = null;
		l_INS_CREATED_BY = null;
		l_INS_CREATED_PRG_NM = null;
		l_INS_UPDATED_BY = null;
		l_INS_UPDATED_PRG_NM = null;

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
	 * medAD0060010�N���X�̕W���R���X�g���N�^
	 */
	public AD0060010Struct()
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
	public void setStruct(AD0060010Struct struct)
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
	public void setStructM(AD0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPRINT_QTY(struct.getPRINT_QTY());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setORI_IDENT_CARD_QTY(struct.getORI_IDENT_CARD_QTY());
			this.setTEMP_IDENT_CARD_QTY(struct.getTEMP_IDENT_CARD_QTY());
			this.setT_IDENT_CARD_CTL_NO(struct.getT_IDENT_CARD_CTL_NO());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setLOT_NO(struct.getLOT_NO());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setFIRST_IDENT_CARD_QTY(struct.getFIRST_IDENT_CARD_QTY());
			this.setIDENT_CARD_QTY(struct.getIDENT_CARD_QTY());
			this.setPKG_UNIT_QTY(struct.getPKG_UNIT_QTY());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.seth_UNIT_QTY_TYP(struct.geth_UNIT_QTY_TYP());
			this.setIDENT_CARD_CTL_NO(struct.getIDENT_CARD_CTL_NO());
			this.setSYS_COMPANY_CD(struct.getSYS_COMPANY_CD());
			this.setUPD_IDENT_CARD_QTY(struct.getUPD_IDENT_CARD_QTY());
			this.setUPD_PRINT_QTY(struct.getUPD_PRINT_QTY());
			this.setUPD_UPDATED_BY(struct.getUPD_UPDATED_BY());
			this.setUPD_UPDATED_PRG_NM(struct.getUPD_UPDATED_PRG_NM());
			this.setUPD_IDENT_CARD_CTL_NO(struct.getUPD_IDENT_CARD_CTL_NO());
			this.setUPD_MODIFY_COUNT(struct.getUPD_MODIFY_COUNT());
			this.setTMP_IDENT_CARD_CTL_NO(struct.getTMP_IDENT_CARD_CTL_NO());
			this.setTMP_OPR_INST_CD(struct.getTMP_OPR_INST_CD());
			this.setTMP_PARTIAL_PRD_NO(struct.getTMP_PARTIAL_PRD_NO());
			this.setTMP_RCV_ISSUE_CTRL_CD(struct.getTMP_RCV_ISSUE_CTRL_CD());
			this.setTMP_ITEM_CD(struct.getTMP_ITEM_CD());
			this.setTMP_JOB_ODR_CD(struct.getTMP_JOB_ODR_CD());
			this.setTMP_FIRST_IDENT_CARD_QTY(struct.getTMP_FIRST_IDENT_CARD_QTY());
			this.setTMP_IDENT_CARD_QTY(struct.getTMP_IDENT_CARD_QTY());
			this.setTMP_OPR_DATE(struct.getTMP_OPR_DATE());
			this.setTMP_PKG_UNIT_QTY(struct.getTMP_PKG_UNIT_QTY());
			this.setTMP_PLANT_CD(struct.getTMP_PLANT_CD());
			this.setTMP_WS_CD(struct.getTMP_WS_CD());
			this.setINS_PRINT_GRP_NO(struct.getINS_PRINT_GRP_NO());
			this.setINS_PAGE_NO(struct.getINS_PAGE_NO());
			this.setINS_IDENT_CARD_CTL_NO(struct.getINS_IDENT_CARD_CTL_NO());
			this.setINS_OPR_INST_CD(struct.getINS_OPR_INST_CD());
			this.setINS_PARTIAL_PRD_NO(struct.getINS_PARTIAL_PRD_NO());
			this.setINS_RCV_ISSUE_CTRL_CD(struct.getINS_RCV_ISSUE_CTRL_CD());
			this.setINS_ITEM_CD(struct.getINS_ITEM_CD());
			this.setINS_JOB_ODR_CD(struct.getINS_JOB_ODR_CD());
			this.setINS_FIRST_IDENT_CARD_QTY(struct.getINS_FIRST_IDENT_CARD_QTY());
			this.setINS_IDENT_CARD_QTY(struct.getINS_IDENT_CARD_QTY());
			this.setINS_OPR_DATE(struct.getINS_OPR_DATE());
			this.setINS_PKG_UNIT_QTY(struct.getINS_PKG_UNIT_QTY());
			this.setINS_PLANT_CD(struct.getINS_PLANT_CD());
			this.setINS_WS_CD(struct.getINS_WS_CD());
			this.setINS_CREATED_BY(struct.getINS_CREATED_BY());
			this.setINS_CREATED_PRG_NM(struct.getINS_CREATED_PRG_NM());
			this.setINS_UPDATED_BY(struct.getINS_UPDATED_BY());
			this.setINS_UPDATED_PRG_NM(struct.getINS_UPDATED_PRG_NM());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PRINT_QTY(struct.getList_PRINT_QTY());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_ORI_IDENT_CARD_QTY(struct.getList_ORI_IDENT_CARD_QTY());
			this.setList_TEMP_IDENT_CARD_QTY(struct.getList_TEMP_IDENT_CARD_QTY());
			this.setList_T_IDENT_CARD_CTL_NO(struct.getList_T_IDENT_CARD_CTL_NO());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_FIRST_IDENT_CARD_QTY(struct.getList_FIRST_IDENT_CARD_QTY());
			this.setList_IDENT_CARD_QTY(struct.getList_IDENT_CARD_QTY());
			this.setList_PKG_UNIT_QTY(struct.getList_PKG_UNIT_QTY());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_h_UNIT_QTY_TYP(struct.getList_h_UNIT_QTY_TYP());
			this.setList_IDENT_CARD_CTL_NO(struct.getList_IDENT_CARD_CTL_NO());
			this.setList_SYS_COMPANY_CD(struct.getList_SYS_COMPANY_CD());
			this.setList_UPD_IDENT_CARD_QTY(struct.getList_UPD_IDENT_CARD_QTY());
			this.setList_UPD_PRINT_QTY(struct.getList_UPD_PRINT_QTY());
			this.setList_UPD_UPDATED_BY(struct.getList_UPD_UPDATED_BY());
			this.setList_UPD_UPDATED_PRG_NM(struct.getList_UPD_UPDATED_PRG_NM());
			this.setList_UPD_IDENT_CARD_CTL_NO(struct.getList_UPD_IDENT_CARD_CTL_NO());
			this.setList_UPD_MODIFY_COUNT(struct.getList_UPD_MODIFY_COUNT());
			this.setList_TMP_IDENT_CARD_CTL_NO(struct.getList_TMP_IDENT_CARD_CTL_NO());
			this.setList_TMP_OPR_INST_CD(struct.getList_TMP_OPR_INST_CD());
			this.setList_TMP_PARTIAL_PRD_NO(struct.getList_TMP_PARTIAL_PRD_NO());
			this.setList_TMP_RCV_ISSUE_CTRL_CD(struct.getList_TMP_RCV_ISSUE_CTRL_CD());
			this.setList_TMP_ITEM_CD(struct.getList_TMP_ITEM_CD());
			this.setList_TMP_JOB_ODR_CD(struct.getList_TMP_JOB_ODR_CD());
			this.setList_TMP_FIRST_IDENT_CARD_QTY(struct.getList_TMP_FIRST_IDENT_CARD_QTY());
			this.setList_TMP_IDENT_CARD_QTY(struct.getList_TMP_IDENT_CARD_QTY());
			this.setList_TMP_OPR_DATE(struct.getList_TMP_OPR_DATE());
			this.setList_TMP_PKG_UNIT_QTY(struct.getList_TMP_PKG_UNIT_QTY());
			this.setList_TMP_PLANT_CD(struct.getList_TMP_PLANT_CD());
			this.setList_TMP_WS_CD(struct.getList_TMP_WS_CD());
			this.setList_INS_PRINT_GRP_NO(struct.getList_INS_PRINT_GRP_NO());
			this.setList_INS_PAGE_NO(struct.getList_INS_PAGE_NO());
			this.setList_INS_IDENT_CARD_CTL_NO(struct.getList_INS_IDENT_CARD_CTL_NO());
			this.setList_INS_OPR_INST_CD(struct.getList_INS_OPR_INST_CD());
			this.setList_INS_PARTIAL_PRD_NO(struct.getList_INS_PARTIAL_PRD_NO());
			this.setList_INS_RCV_ISSUE_CTRL_CD(struct.getList_INS_RCV_ISSUE_CTRL_CD());
			this.setList_INS_ITEM_CD(struct.getList_INS_ITEM_CD());
			this.setList_INS_JOB_ODR_CD(struct.getList_INS_JOB_ODR_CD());
			this.setList_INS_FIRST_IDENT_CARD_QTY(struct.getList_INS_FIRST_IDENT_CARD_QTY());
			this.setList_INS_IDENT_CARD_QTY(struct.getList_INS_IDENT_CARD_QTY());
			this.setList_INS_OPR_DATE(struct.getList_INS_OPR_DATE());
			this.setList_INS_PKG_UNIT_QTY(struct.getList_INS_PKG_UNIT_QTY());
			this.setList_INS_PLANT_CD(struct.getList_INS_PLANT_CD());
			this.setList_INS_WS_CD(struct.getList_INS_WS_CD());
			this.setList_INS_CREATED_BY(struct.getList_INS_CREATED_BY());
			this.setList_INS_CREATED_PRG_NM(struct.getList_INS_CREATED_PRG_NM());
			this.setList_INS_UPDATED_BY(struct.getList_INS_UPDATED_BY());
			this.setList_INS_UPDATED_PRG_NM(struct.getList_INS_UPDATED_PRG_NM());
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
	// �� 1 �ϐ������l�F i_PRINT_QTY


	final static String i_PRINT_QTY = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_ORI_IDENT_CARD_QTY


	final static String i_ORI_IDENT_CARD_QTY = null;

	// �� 4 �ϐ������l�F i_TEMP_IDENT_CARD_QTY


	final static String i_TEMP_IDENT_CARD_QTY = null;

	// �� 5 �ϐ������l�F i_T_IDENT_CARD_CTL_NO


	final static String i_T_IDENT_CARD_CTL_NO = null;

	// �� 6 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 7 �ϐ������l�F i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// �� 8 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 9 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 10 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 11 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 12 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 13 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 14 �ϐ������l�F i_OPR_DATE


	final static String i_OPR_DATE = null;

	// �� 15 �ϐ������l�F i_FIRST_IDENT_CARD_QTY


	final static String i_FIRST_IDENT_CARD_QTY = null;

	// �� 16 �ϐ������l�F i_IDENT_CARD_QTY


	final static String i_IDENT_CARD_QTY = null;

	// �� 17 �ϐ������l�F i_PKG_UNIT_QTY


	final static String i_PKG_UNIT_QTY = null;

	// �� 18 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_DEL_FLG


	final static String i_DEL_FLG = null;

	// �� 20 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 21 �ϐ������l�F i_h_UNIT_QTY_TYP


	final static String i_h_UNIT_QTY_TYP = null;

	// �� 22 �ϐ������l�F i_IDENT_CARD_CTL_NO


	final static String i_IDENT_CARD_CTL_NO = null;

	// �� 23 �ϐ������l�F i_SYS_COMPANY_CD


	final static String i_SYS_COMPANY_CD = null;

	// �� 24 �ϐ������l�F i_UPD_IDENT_CARD_QTY


	final static String i_UPD_IDENT_CARD_QTY = null;

	// �� 25 �ϐ������l�F i_UPD_PRINT_QTY


	final static String i_UPD_PRINT_QTY = null;

	// �� 26 �ϐ������l�F i_UPD_UPDATED_BY


	final static String i_UPD_UPDATED_BY = null;

	// �� 27 �ϐ������l�F i_UPD_UPDATED_PRG_NM


	final static String i_UPD_UPDATED_PRG_NM = null;

	// �� 28 �ϐ������l�F i_UPD_IDENT_CARD_CTL_NO


	final static String i_UPD_IDENT_CARD_CTL_NO = null;

	// �� 29 �ϐ������l�F i_UPD_MODIFY_COUNT


	final static String i_UPD_MODIFY_COUNT = null;

	// �� 30 �ϐ������l�F i_TMP_IDENT_CARD_CTL_NO


	final static String i_TMP_IDENT_CARD_CTL_NO = null;

	// �� 31 �ϐ������l�F i_TMP_OPR_INST_CD


	final static String i_TMP_OPR_INST_CD = null;

	// �� 32 �ϐ������l�F i_TMP_PARTIAL_PRD_NO


	final static String i_TMP_PARTIAL_PRD_NO = null;

	// �� 33 �ϐ������l�F i_TMP_RCV_ISSUE_CTRL_CD


	final static String i_TMP_RCV_ISSUE_CTRL_CD = null;

	// �� 34 �ϐ������l�F i_TMP_ITEM_CD


	final static String i_TMP_ITEM_CD = null;

	// �� 35 �ϐ������l�F i_TMP_JOB_ODR_CD


	final static String i_TMP_JOB_ODR_CD = null;

	// �� 36 �ϐ������l�F i_TMP_FIRST_IDENT_CARD_QTY


	final static String i_TMP_FIRST_IDENT_CARD_QTY = null;

	// �� 37 �ϐ������l�F i_TMP_IDENT_CARD_QTY


	final static String i_TMP_IDENT_CARD_QTY = null;

	// �� 38 �ϐ������l�F i_TMP_OPR_DATE


	final static String i_TMP_OPR_DATE = null;

	// �� 39 �ϐ������l�F i_TMP_PKG_UNIT_QTY


	final static String i_TMP_PKG_UNIT_QTY = null;

	// �� 40 �ϐ������l�F i_TMP_PLANT_CD


	final static String i_TMP_PLANT_CD = null;

	// �� 41 �ϐ������l�F i_TMP_WS_CD


	final static String i_TMP_WS_CD = null;

	// �� 42 �ϐ������l�F i_INS_PRINT_GRP_NO


	final static String i_INS_PRINT_GRP_NO = null;

	// �� 43 �ϐ������l�F i_INS_PAGE_NO


	final static String i_INS_PAGE_NO = null;

	// �� 44 �ϐ������l�F i_INS_IDENT_CARD_CTL_NO


	final static String i_INS_IDENT_CARD_CTL_NO = null;

	// �� 45 �ϐ������l�F i_INS_OPR_INST_CD


	final static String i_INS_OPR_INST_CD = null;

	// �� 46 �ϐ������l�F i_INS_PARTIAL_PRD_NO


	final static String i_INS_PARTIAL_PRD_NO = null;

	// �� 47 �ϐ������l�F i_INS_RCV_ISSUE_CTRL_CD


	final static String i_INS_RCV_ISSUE_CTRL_CD = null;

	// �� 48 �ϐ������l�F i_INS_ITEM_CD


	final static String i_INS_ITEM_CD = null;

	// �� 49 �ϐ������l�F i_INS_JOB_ODR_CD


	final static String i_INS_JOB_ODR_CD = null;

	// �� 50 �ϐ������l�F i_INS_FIRST_IDENT_CARD_QTY


	final static String i_INS_FIRST_IDENT_CARD_QTY = null;

	// �� 51 �ϐ������l�F i_INS_IDENT_CARD_QTY


	final static String i_INS_IDENT_CARD_QTY = null;

	// �� 52 �ϐ������l�F i_INS_OPR_DATE


	final static String i_INS_OPR_DATE = null;

	// �� 53 �ϐ������l�F i_INS_PKG_UNIT_QTY


	final static String i_INS_PKG_UNIT_QTY = null;

	// �� 54 �ϐ������l�F i_INS_PLANT_CD


	final static String i_INS_PLANT_CD = null;

	// �� 55 �ϐ������l�F i_INS_WS_CD


	final static String i_INS_WS_CD = null;

	// �� 56 �ϐ������l�F i_INS_CREATED_BY


	final static String i_INS_CREATED_BY = null;

	// �� 57 �ϐ������l�F i_INS_CREATED_PRG_NM


	final static String i_INS_CREATED_PRG_NM = null;

	// �� 58 �ϐ������l�F i_INS_UPDATED_BY


	final static String i_INS_UPDATED_BY = null;

	// �� 59 �ϐ������l�F i_INS_UPDATED_PRG_NM


	final static String i_INS_UPDATED_PRG_NM = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_PRINT_QTY

	final static String i_PRINT_QTY = null;

	// �� 2 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 3 �ϐ������l�F i_ORI_IDENT_CARD_QTY

	final static String i_ORI_IDENT_CARD_QTY = null;

	// �� 4 �ϐ������l�F i_TEMP_IDENT_CARD_QTY

	final static String i_TEMP_IDENT_CARD_QTY = null;

	// �� 5 �ϐ������l�F i_T_IDENT_CARD_CTL_NO

	final static String i_T_IDENT_CARD_CTL_NO = null;

	// �� 6 �ϐ������l�F i_SYS_COMPANY_CD

	final static String i_SYS_COMPANY_CD = null;

	// �� 7 �ϐ������l�F i_OPR_INST_CD

	final static String i_OPR_INST_CD = null;

	// �� 8 �ϐ������l�F i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// �� 9 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 10 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 11 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 12 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 13 �ϐ������l�F i_OPR_DATE

	final static String i_OPR_DATE = null;

	// �� 14 �ϐ������l�F i_FIRST_IDENT_CARD_QTY

	final static String i_FIRST_IDENT_CARD_QTY = null;

	// �� 15 �ϐ������l�F i_IDENT_CARD_QTY

	final static String i_IDENT_CARD_QTY = null;

	// �� 16 �ϐ������l�F i_PKG_UNIT_QTY

	final static String i_PKG_UNIT_QTY = null;

	// �� 17 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_DEL_FLG

	final static String i_DEL_FLG = null;

	// �� 19 �ϐ������l�F i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// �� 20 �ϐ������l�F i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// �� 21 �ϐ������l�F i_IDENT_CARD_CTL_NO

	final static String i_IDENT_CARD_CTL_NO = null;

	// �� 22 �ϐ������l�F i_UPD_IDENT_CARD_QTY

	final static String i_UPD_IDENT_CARD_QTY = null;

	// �� 23 �ϐ������l�F i_UPD_PRINT_QTY

	final static String i_UPD_PRINT_QTY = null;

	// �� 24 �ϐ������l�F i_UPD_UPDATED_BY

	final static String i_UPD_UPDATED_BY = null;

	// �� 25 �ϐ������l�F i_UPD_UPDATED_PRG_NM

	final static String i_UPD_UPDATED_PRG_NM = null;

	// �� 26 �ϐ������l�F i_UPD_IDENT_CARD_CTL_NO

	final static String i_UPD_IDENT_CARD_CTL_NO = null;

	// �� 27 �ϐ������l�F i_UPD_MODIFY_COUNT

	final static String i_UPD_MODIFY_COUNT = null;

	// �� 28 �ϐ������l�F i_TMP_IDENT_CARD_CTL_NO

	final static String i_TMP_IDENT_CARD_CTL_NO = null;

	// �� 29 �ϐ������l�F i_TMP_OPR_INST_CD

	final static String i_TMP_OPR_INST_CD = null;

	// �� 30 �ϐ������l�F i_TMP_PARTIAL_PRD_NO

	final static String i_TMP_PARTIAL_PRD_NO = null;

	// �� 31 �ϐ������l�F i_TMP_RCV_ISSUE_CTRL_CD

	final static String i_TMP_RCV_ISSUE_CTRL_CD = null;

	// �� 32 �ϐ������l�F i_TMP_ITEM_CD

	final static String i_TMP_ITEM_CD = null;

	// �� 33 �ϐ������l�F i_TMP_JOB_ODR_CD

	final static String i_TMP_JOB_ODR_CD = null;

	// �� 34 �ϐ������l�F i_TMP_FIRST_IDENT_CARD_QTY

	final static String i_TMP_FIRST_IDENT_CARD_QTY = null;

	// �� 35 �ϐ������l�F i_TMP_IDENT_CARD_QTY

	final static String i_TMP_IDENT_CARD_QTY = null;

	// �� 36 �ϐ������l�F i_TMP_OPR_DATE

	final static String i_TMP_OPR_DATE = null;

	// �� 37 �ϐ������l�F i_TMP_PKG_UNIT_QTY

	final static String i_TMP_PKG_UNIT_QTY = null;

	// �� 38 �ϐ������l�F i_TMP_PLANT_CD

	final static String i_TMP_PLANT_CD = null;

	// �� 39 �ϐ������l�F i_TMP_WS_CD

	final static String i_TMP_WS_CD = null;

	// �� 40 �ϐ������l�F i_INS_PRINT_GRP_NO

	final static String i_INS_PRINT_GRP_NO = null;

	// �� 41 �ϐ������l�F i_INS_PAGE_NO

	final static String i_INS_PAGE_NO = null;

	// �� 42 �ϐ������l�F i_INS_IDENT_CARD_CTL_NO

	final static String i_INS_IDENT_CARD_CTL_NO = null;

	// �� 43 �ϐ������l�F i_INS_OPR_INST_CD

	final static String i_INS_OPR_INST_CD = null;

	// �� 44 �ϐ������l�F i_INS_PARTIAL_PRD_NO

	final static String i_INS_PARTIAL_PRD_NO = null;

	// �� 45 �ϐ������l�F i_INS_RCV_ISSUE_CTRL_CD

	final static String i_INS_RCV_ISSUE_CTRL_CD = null;

	// �� 46 �ϐ������l�F i_INS_ITEM_CD

	final static String i_INS_ITEM_CD = null;

	// �� 47 �ϐ������l�F i_INS_JOB_ODR_CD

	final static String i_INS_JOB_ODR_CD = null;

	// �� 48 �ϐ������l�F i_INS_FIRST_IDENT_CARD_QTY

	final static String i_INS_FIRST_IDENT_CARD_QTY = null;

	// �� 49 �ϐ������l�F i_INS_IDENT_CARD_QTY

	final static String i_INS_IDENT_CARD_QTY = null;

	// �� 50 �ϐ������l�F i_INS_OPR_DATE

	final static String i_INS_OPR_DATE = null;

	// �� 51 �ϐ������l�F i_INS_PKG_UNIT_QTY

	final static String i_INS_PKG_UNIT_QTY = null;

	// �� 52 �ϐ������l�F i_INS_PLANT_CD

	final static String i_INS_PLANT_CD = null;

	// �� 53 �ϐ������l�F i_INS_WS_CD

	final static String i_INS_WS_CD = null;

	// �� 54 �ϐ������l�F i_INS_CREATED_BY

	final static String i_INS_CREATED_BY = null;

	// �� 55 �ϐ������l�F i_INS_CREATED_PRG_NM

	final static String i_INS_CREATED_PRG_NM = null;

	// �� 56 �ϐ������l�F i_INS_UPDATED_BY

	final static String i_INS_UPDATED_BY = null;

	// �� 57 �ϐ������l�F i_INS_UPDATED_PRG_NM

	final static String i_INS_UPDATED_PRG_NM = null;
	
	// �� 58 �ϐ������l�F i_LOT_NO
	
	final static String i_LOT_NO = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_PRINT_QTY = i_PRINT_QTY;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_ORI_IDENT_CARD_QTY = i_ORI_IDENT_CARD_QTY;
		m_TEMP_IDENT_CARD_QTY = i_TEMP_IDENT_CARD_QTY;
		m_T_IDENT_CARD_CTL_NO = i_T_IDENT_CARD_CTL_NO;
		m_SYS_COMPANY_CD = i_SYS_COMPANY_CD;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_WS_CD = i_WS_CD;
		m_WS_NAME = i_WS_NAME;
		m_OPR_DATE = i_OPR_DATE;
		m_FIRST_IDENT_CARD_QTY = i_FIRST_IDENT_CARD_QTY;
		m_IDENT_CARD_QTY = i_IDENT_CARD_QTY;
		m_PKG_UNIT_QTY = i_PKG_UNIT_QTY;
		m_PLANT_CD = i_PLANT_CD;
		m_DEL_FLG = i_DEL_FLG;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_IDENT_CARD_CTL_NO = i_IDENT_CARD_CTL_NO;
		m_UPD_IDENT_CARD_QTY = i_UPD_IDENT_CARD_QTY;
		m_UPD_PRINT_QTY = i_UPD_PRINT_QTY;
		m_UPD_UPDATED_BY = i_UPD_UPDATED_BY;
		m_UPD_UPDATED_PRG_NM = i_UPD_UPDATED_PRG_NM;
		m_UPD_IDENT_CARD_CTL_NO = i_UPD_IDENT_CARD_CTL_NO;
		m_UPD_MODIFY_COUNT = i_UPD_MODIFY_COUNT;
		m_TMP_IDENT_CARD_CTL_NO = i_TMP_IDENT_CARD_CTL_NO;
		m_TMP_OPR_INST_CD = i_TMP_OPR_INST_CD;
		m_TMP_PARTIAL_PRD_NO = i_TMP_PARTIAL_PRD_NO;
		m_TMP_RCV_ISSUE_CTRL_CD = i_TMP_RCV_ISSUE_CTRL_CD;
		m_TMP_ITEM_CD = i_TMP_ITEM_CD;
		m_TMP_JOB_ODR_CD = i_TMP_JOB_ODR_CD;
		m_TMP_FIRST_IDENT_CARD_QTY = i_TMP_FIRST_IDENT_CARD_QTY;
		m_TMP_IDENT_CARD_QTY = i_TMP_IDENT_CARD_QTY;
		m_TMP_OPR_DATE = i_TMP_OPR_DATE;
		m_TMP_PKG_UNIT_QTY = i_TMP_PKG_UNIT_QTY;
		m_TMP_PLANT_CD = i_TMP_PLANT_CD;
		m_TMP_WS_CD = i_TMP_WS_CD;
		m_INS_PRINT_GRP_NO = i_INS_PRINT_GRP_NO;
		m_INS_PAGE_NO = i_INS_PAGE_NO;
		m_INS_IDENT_CARD_CTL_NO = i_INS_IDENT_CARD_CTL_NO;
		m_INS_OPR_INST_CD = i_INS_OPR_INST_CD;
		m_INS_PARTIAL_PRD_NO = i_INS_PARTIAL_PRD_NO;
		m_INS_RCV_ISSUE_CTRL_CD = i_INS_RCV_ISSUE_CTRL_CD;
		m_INS_ITEM_CD = i_INS_ITEM_CD;
		m_INS_JOB_ODR_CD = i_INS_JOB_ODR_CD;
		m_INS_FIRST_IDENT_CARD_QTY = i_INS_FIRST_IDENT_CARD_QTY;
		m_INS_IDENT_CARD_QTY = i_INS_IDENT_CARD_QTY;
		m_INS_OPR_DATE = i_INS_OPR_DATE;
		m_INS_PKG_UNIT_QTY = i_INS_PKG_UNIT_QTY;
		m_INS_PLANT_CD = i_INS_PLANT_CD;
		m_INS_WS_CD = i_INS_WS_CD;
		m_INS_CREATED_BY = i_INS_CREATED_BY;
		m_INS_CREATED_PRG_NM = i_INS_CREATED_PRG_NM;
		m_INS_UPDATED_BY = i_INS_UPDATED_BY;
		m_INS_UPDATED_PRG_NM = i_INS_UPDATED_PRG_NM;
		m_LOT_NO = i_LOT_NO;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
