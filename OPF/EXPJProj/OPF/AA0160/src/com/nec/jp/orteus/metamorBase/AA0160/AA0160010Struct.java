/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/src/com/nec/jp/orteus/metamorBase/AA0160/AA0160010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0160;

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

public class AA0160010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoInsert */
	public String m_rdoInsert = null;
	/** �� 2 �ϐ��F m_rdoUpdate */
	public String m_rdoUpdate = null;
	/** �� 3 �ϐ��F m_rdoDelete */
	public String m_rdoDelete = null;
	/** �� 4 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 5 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 6 �ϐ��F m_CANCEL_FILE */
	public String m_CANCEL_FILE = null;
	/** �� 7 �ϐ��F m_JUDGMENT_TXT */
	public String m_JUDGMENT_TXT = null;
	/** �� 8 �ϐ��F m_ERROR_IN */
	public String m_ERROR_IN = null;
	/** �� 9 �ϐ��F m_ERR_CTR_NM */
	public String m_ERR_CTR_NM = null;
	/** �� 10 �ϐ��F m_ERR_INFO */
	public String m_ERR_INFO = null;
	/** �� 11 �ϐ��F m_DO_CHK */
	public String m_DO_CHK = null;
	/** �� 12 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 13 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 14 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 15 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** �� 16 �ϐ��F m_readNAME */
	public String m_readNAME = null;
	/** �� 17 �ϐ��F m_readVALUE */
	public String m_readVALUE = null;
	/** �� 18 �ϐ��F m_setNAME */
	public String m_setNAME = null;
	/** �� 19 �ϐ��F m_setVALUE */
	public String m_setVALUE = null;
	/** �� 20 �ϐ��F m_readSYS_P_NAME */
	public String m_readSYS_P_NAME = null;
	/** �� 21 �ϐ��F m_readSYS_P_VALUE */
	public String m_readSYS_P_VALUE = null;
	/** �� 22 �ϐ��F m_setSYS_P_NAME */
	public String m_setSYS_P_NAME = null;
	/** �� 23 �ϐ��F m_readPARENT_ITEM_CD */
	public String m_readPARENT_ITEM_CD = null;
	/** �� 24 �ϐ��F m_readCOMP_ITEM_CD */
	public String m_readCOMP_ITEM_CD = null;
	/** �� 25 �ϐ��F m_readPS_EDITION */
	public String m_readPS_EDITION = null;
	/** �� 26 �ϐ��F m_setPARENT_ITEM_CD */
	public String m_setPARENT_ITEM_CD = null;
	/** �� 27 �ϐ��F m_setCOMP_ITEM_CD */
	public String m_setCOMP_ITEM_CD = null;
	/** �� 28 �ϐ��F m_setPS_EDITION */
	public String m_setPS_EDITION = null;
	/** �� 29 �ϐ��F m_readM_ITEM_ITEM_CD */
	public String m_readM_ITEM_ITEM_CD = null;
	/** �� 30 �ϐ��F m_setM_ITEM_ITEM_CD */
	public String m_setM_ITEM_ITEM_CD = null;
	/** �� 31 �ϐ��F m_h_PARENT_ITEM_CD */
	public String m_h_PARENT_ITEM_CD = null;
	/** �� 32 �ϐ��F m_h_COMP_ITEM_CD */
	public String m_h_COMP_ITEM_CD = null;
	/** �� 33 �ϐ��F m_h_PS_EDITION */
	public String m_h_PS_EDITION = null;
	/** �� 34 �ϐ��F m_h_PS_UNIT_DENOMINATOR */
	public String m_h_PS_UNIT_DENOMINATOR = null;
	/** �� 35 �ϐ��F m_h_PS_UNIT_NUMERATOR */
	public String m_h_PS_UNIT_NUMERATOR = null;
	/** �� 36 �ϐ��F m_h_EFF_PHASE_IN_DATE */
	public String m_h_EFF_PHASE_IN_DATE = null;
	/** �� 37 �ϐ��F m_h_EFF_PHASE_OUT_DATE */
	public String m_h_EFF_PHASE_OUT_DATE = null;
	/** �� 38 �ϐ��F m_h_PS_SPOIL */
	public String m_h_PS_SPOIL = null;
	/** �� 39 �ϐ��F m_h_CONS_TYP */
	public String m_h_CONS_TYP = null;
	/** �� 40 �ϐ��F m_h_PS_LT_FLG */
	public String m_h_PS_LT_FLG = null;
	/** �� 41 �ϐ��F m_h_PS_FIXED_LT */
	public String m_h_PS_FIXED_LT = null;
	/** �� 42 �ϐ��F m_h_PS_PROP_LT */
	public String m_h_PS_PROP_LT = null;
	/** �� 43 �ϐ��F m_h_PS_PROP_LOT_SIZE */
	public String m_h_PS_PROP_LOT_SIZE = null;
	/** �� 44 �ϐ��F m_h_PS_REF_NO */
	public String m_h_PS_REF_NO = null;
	/** �� 45 �ϐ��F m_h_COST_UP_TYP */
	public String m_h_COST_UP_TYP = null;
	/** �� 46 �ϐ��F m_h_MRP_EXP_TYP */
	public String m_h_MRP_EXP_TYP = null;
	/** �� 47 �ϐ��F m_C_PARENT_ITEM_CD */
	public String m_C_PARENT_ITEM_CD = null;
	/** �� 48 �ϐ��F m_C_COMP_ITEM_CD */
	public String m_C_COMP_ITEM_CD = null;
	/** �� 49 �ϐ��F m_C_PS_EDITION */
	public String m_C_PS_EDITION = null;
	/** �� 50 �ϐ��F m_C_PS_UNIT_DENOMINATOR */
	public String m_C_PS_UNIT_DENOMINATOR = null;
	/** �� 51 �ϐ��F m_C_PS_UNIT_NUMERATOR */
	public String m_C_PS_UNIT_NUMERATOR = null;
	/** �� 52 �ϐ��F m_C_EFF_PHASE_IN_DATE */
	public String m_C_EFF_PHASE_IN_DATE = null;
	/** �� 53 �ϐ��F m_C_EFF_PHASE_OUT_DATE */
	public String m_C_EFF_PHASE_OUT_DATE = null;
	/** �� 54 �ϐ��F m_C_PS_SPOIL */
	public String m_C_PS_SPOIL = null;
	/** �� 55 �ϐ��F m_C_CONS_TYP */
	public String m_C_CONS_TYP = null;
	/** �� 56 �ϐ��F m_C_PS_LT_FLG */
	public String m_C_PS_LT_FLG = null;
	/** �� 57 �ϐ��F m_C_PS_FIXED_LT */
	public String m_C_PS_FIXED_LT = null;
	/** �� 58 �ϐ��F m_C_PS_PROP_LT */
	public String m_C_PS_PROP_LT = null;
	/** �� 59 �ϐ��F m_C_PS_PROP_LOT_SIZE */
	public String m_C_PS_PROP_LOT_SIZE = null;
	/** �� 60 �ϐ��F m_C_PS_REF_NO */
	public String m_C_PS_REF_NO = null;
	/** �� 61 �ϐ��F m_C_COST_UP_TYP */
	public String m_C_COST_UP_TYP = null;
	/** �� 62 �ϐ��F m_C_MRP_EXP_TYP */
	public String m_C_MRP_EXP_TYP = null;
	/** �� 63 �ϐ��F m_C_setPARENT_ITEM_CD */
	public String m_C_setPARENT_ITEM_CD = null;
	/** �� 64 �ϐ��F m_C_setCOMP_ITEM_CD */
	public String m_C_setCOMP_ITEM_CD = null;
	/** �� 65 �ϐ��F m_C_setPS_EDITION */
	public String m_C_setPS_EDITION = null;
	/** �� 66 �ϐ��F m_readMAXSEQ_NO */
	public String m_readMAXSEQ_NO = null;
	/** �� 67 �ϐ��F m_h_SEQ_NO */
	public String m_h_SEQ_NO = null;
	/** �� 68 �ϐ��F m_h_ACCESS_TYP */
	public String m_h_ACCESS_TYP = null;
	/** �� 69 �ϐ��F m_h_CMPLT_FLG */
	public String m_h_CMPLT_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoInsert */
	public List l_rdoInsert = null;

	/** �� 2 List�ϐ��F l_rdoUpdate */
	public List l_rdoUpdate = null;

	/** �� 3 List�ϐ��F l_rdoDelete */
	public List l_rdoDelete = null;

	/** �� 4 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 5 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 6 List�ϐ��F l_CANCEL_FILE */
	public List l_CANCEL_FILE = null;

	/** �� 7 List�ϐ��F l_JUDGMENT_TXT */
	public List l_JUDGMENT_TXT = null;

	/** �� 8 List�ϐ��F l_ERROR_IN */
	public List l_ERROR_IN = null;

	/** �� 9 List�ϐ��F l_ERR_CTR_NM */
	public List l_ERR_CTR_NM = null;

	/** �� 10 List�ϐ��F l_ERR_INFO */
	public List l_ERR_INFO = null;

	/** �� 11 List�ϐ��F l_DO_CHK */
	public List l_DO_CHK = null;

	/** �� 12 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 13 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 14 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 15 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** �� 16 List�ϐ��F l_readNAME */
	public List l_readNAME = null;

	/** �� 17 List�ϐ��F l_readVALUE */
	public List l_readVALUE = null;

	/** �� 18 List�ϐ��F l_setNAME */
	public List l_setNAME = null;

	/** �� 19 List�ϐ��F l_setVALUE */
	public List l_setVALUE = null;

	/** �� 20 List�ϐ��F l_readSYS_P_NAME */
	public List l_readSYS_P_NAME = null;

	/** �� 21 List�ϐ��F l_readSYS_P_VALUE */
	public List l_readSYS_P_VALUE = null;

	/** �� 22 List�ϐ��F l_setSYS_P_NAME */
	public List l_setSYS_P_NAME = null;

	/** �� 23 List�ϐ��F l_readPARENT_ITEM_CD */
	public List l_readPARENT_ITEM_CD = null;

	/** �� 24 List�ϐ��F l_readCOMP_ITEM_CD */
	public List l_readCOMP_ITEM_CD = null;

	/** �� 25 List�ϐ��F l_readPS_EDITION */
	public List l_readPS_EDITION = null;

	/** �� 26 List�ϐ��F l_setPARENT_ITEM_CD */
	public List l_setPARENT_ITEM_CD = null;

	/** �� 27 List�ϐ��F l_setCOMP_ITEM_CD */
	public List l_setCOMP_ITEM_CD = null;

	/** �� 28 List�ϐ��F l_setPS_EDITION */
	public List l_setPS_EDITION = null;

	/** �� 29 List�ϐ��F l_readM_ITEM_ITEM_CD */
	public List l_readM_ITEM_ITEM_CD = null;

	/** �� 30 List�ϐ��F l_setM_ITEM_ITEM_CD */
	public List l_setM_ITEM_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_h_PARENT_ITEM_CD */
	public List l_h_PARENT_ITEM_CD = null;

	/** �� 32 List�ϐ��F l_h_COMP_ITEM_CD */
	public List l_h_COMP_ITEM_CD = null;

	/** �� 33 List�ϐ��F l_h_PS_EDITION */
	public List l_h_PS_EDITION = null;

	/** �� 34 List�ϐ��F l_h_PS_UNIT_DENOMINATOR */
	public List l_h_PS_UNIT_DENOMINATOR = null;

	/** �� 35 List�ϐ��F l_h_PS_UNIT_NUMERATOR */
	public List l_h_PS_UNIT_NUMERATOR = null;

	/** �� 36 List�ϐ��F l_h_EFF_PHASE_IN_DATE */
	public List l_h_EFF_PHASE_IN_DATE = null;

	/** �� 37 List�ϐ��F l_h_EFF_PHASE_OUT_DATE */
	public List l_h_EFF_PHASE_OUT_DATE = null;

	/** �� 38 List�ϐ��F l_h_PS_SPOIL */
	public List l_h_PS_SPOIL = null;

	/** �� 39 List�ϐ��F l_h_CONS_TYP */
	public List l_h_CONS_TYP = null;

	/** �� 40 List�ϐ��F l_h_PS_LT_FLG */
	public List l_h_PS_LT_FLG = null;

	/** �� 41 List�ϐ��F l_h_PS_FIXED_LT */
	public List l_h_PS_FIXED_LT = null;

	/** �� 42 List�ϐ��F l_h_PS_PROP_LT */
	public List l_h_PS_PROP_LT = null;

	/** �� 43 List�ϐ��F l_h_PS_PROP_LOT_SIZE */
	public List l_h_PS_PROP_LOT_SIZE = null;

	/** �� 44 List�ϐ��F l_h_PS_REF_NO */
	public List l_h_PS_REF_NO = null;

	/** �� 45 List�ϐ��F l_h_COST_UP_TYP */
	public List l_h_COST_UP_TYP = null;

	/** �� 46 List�ϐ��F l_h_MRP_EXP_TYP */
	public List l_h_MRP_EXP_TYP = null;

	/** �� 47 List�ϐ��F l_C_PARENT_ITEM_CD */
	public List l_C_PARENT_ITEM_CD = null;

	/** �� 48 List�ϐ��F l_C_COMP_ITEM_CD */
	public List l_C_COMP_ITEM_CD = null;

	/** �� 49 List�ϐ��F l_C_PS_EDITION */
	public List l_C_PS_EDITION = null;

	/** �� 50 List�ϐ��F l_C_PS_UNIT_DENOMINATOR */
	public List l_C_PS_UNIT_DENOMINATOR = null;

	/** �� 51 List�ϐ��F l_C_PS_UNIT_NUMERATOR */
	public List l_C_PS_UNIT_NUMERATOR = null;

	/** �� 52 List�ϐ��F l_C_EFF_PHASE_IN_DATE */
	public List l_C_EFF_PHASE_IN_DATE = null;

	/** �� 53 List�ϐ��F l_C_EFF_PHASE_OUT_DATE */
	public List l_C_EFF_PHASE_OUT_DATE = null;

	/** �� 54 List�ϐ��F l_C_PS_SPOIL */
	public List l_C_PS_SPOIL = null;

	/** �� 55 List�ϐ��F l_C_CONS_TYP */
	public List l_C_CONS_TYP = null;

	/** �� 56 List�ϐ��F l_C_PS_LT_FLG */
	public List l_C_PS_LT_FLG = null;

	/** �� 57 List�ϐ��F l_C_PS_FIXED_LT */
	public List l_C_PS_FIXED_LT = null;

	/** �� 58 List�ϐ��F l_C_PS_PROP_LT */
	public List l_C_PS_PROP_LT = null;

	/** �� 59 List�ϐ��F l_C_PS_PROP_LOT_SIZE */
	public List l_C_PS_PROP_LOT_SIZE = null;

	/** �� 60 List�ϐ��F l_C_PS_REF_NO */
	public List l_C_PS_REF_NO = null;

	/** �� 61 List�ϐ��F l_C_COST_UP_TYP */
	public List l_C_COST_UP_TYP = null;

	/** �� 62 List�ϐ��F l_C_MRP_EXP_TYP */
	public List l_C_MRP_EXP_TYP = null;

	/** �� 63 List�ϐ��F l_C_setPARENT_ITEM_CD */
	public List l_C_setPARENT_ITEM_CD = null;

	/** �� 64 List�ϐ��F l_C_setCOMP_ITEM_CD */
	public List l_C_setCOMP_ITEM_CD = null;

	/** �� 65 List�ϐ��F l_C_setPS_EDITION */
	public List l_C_setPS_EDITION = null;

	/** �� 66 List�ϐ��F l_readMAXSEQ_NO */
	public List l_readMAXSEQ_NO = null;

	/** �� 67 List�ϐ��F l_h_SEQ_NO */
	public List l_h_SEQ_NO = null;

	/** �� 68 List�ϐ��F l_h_ACCESS_TYP */
	public List l_h_ACCESS_TYP = null;

	/** �� 69 List�ϐ��F l_h_CMPLT_FLG */
	public List l_h_CMPLT_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoInsert() { return m_rdoInsert; }
	public String getrdoUpdate() { return m_rdoUpdate; }
	public String getrdoDelete() { return m_rdoDelete; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getFileName() { return m_FileName; }
	public String getCANCEL_FILE() { return m_CANCEL_FILE; }
	public String getJUDGMENT_TXT() { return m_JUDGMENT_TXT; }
	public String getERROR_IN() { return m_ERROR_IN; }
	public String getERR_CTR_NM() { return m_ERR_CTR_NM; }
	public String getERR_INFO() { return m_ERR_INFO; }
	public String getDO_CHK() { return m_DO_CHK; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getreadNAME() { return m_readNAME; }
	public String getreadVALUE() { return m_readVALUE; }
	public String getsetNAME() { return m_setNAME; }
	public String getsetVALUE() { return m_setVALUE; }
	public String getreadSYS_P_NAME() { return m_readSYS_P_NAME; }
	public String getreadSYS_P_VALUE() { return m_readSYS_P_VALUE; }
	public String getsetSYS_P_NAME() { return m_setSYS_P_NAME; }
	public String getreadPARENT_ITEM_CD() { return m_readPARENT_ITEM_CD; }
	public String getreadCOMP_ITEM_CD() { return m_readCOMP_ITEM_CD; }
	public String getreadPS_EDITION() { return m_readPS_EDITION; }
	public String getsetPARENT_ITEM_CD() { return m_setPARENT_ITEM_CD; }
	public String getsetCOMP_ITEM_CD() { return m_setCOMP_ITEM_CD; }
	public String getsetPS_EDITION() { return m_setPS_EDITION; }
	public String getreadM_ITEM_ITEM_CD() { return m_readM_ITEM_ITEM_CD; }
	public String getsetM_ITEM_ITEM_CD() { return m_setM_ITEM_ITEM_CD; }
	public String geth_PARENT_ITEM_CD() { return m_h_PARENT_ITEM_CD; }
	public String geth_COMP_ITEM_CD() { return m_h_COMP_ITEM_CD; }
	public String geth_PS_EDITION() { return m_h_PS_EDITION; }
	public String geth_PS_UNIT_DENOMINATOR() { return m_h_PS_UNIT_DENOMINATOR; }
	public String geth_PS_UNIT_NUMERATOR() { return m_h_PS_UNIT_NUMERATOR; }
	public String geth_EFF_PHASE_IN_DATE() { return m_h_EFF_PHASE_IN_DATE; }
	public String geth_EFF_PHASE_OUT_DATE() { return m_h_EFF_PHASE_OUT_DATE; }
	public String geth_PS_SPOIL() { return m_h_PS_SPOIL; }
	public String geth_CONS_TYP() { return m_h_CONS_TYP; }
	public String geth_PS_LT_FLG() { return m_h_PS_LT_FLG; }
	public String geth_PS_FIXED_LT() { return m_h_PS_FIXED_LT; }
	public String geth_PS_PROP_LT() { return m_h_PS_PROP_LT; }
	public String geth_PS_PROP_LOT_SIZE() { return m_h_PS_PROP_LOT_SIZE; }
	public String geth_PS_REF_NO() { return m_h_PS_REF_NO; }
	public String geth_COST_UP_TYP() { return m_h_COST_UP_TYP; }
	public String geth_MRP_EXP_TYP() { return m_h_MRP_EXP_TYP; }
	public String getC_PARENT_ITEM_CD() { return m_C_PARENT_ITEM_CD; }
	public String getC_COMP_ITEM_CD() { return m_C_COMP_ITEM_CD; }
	public String getC_PS_EDITION() { return m_C_PS_EDITION; }
	public String getC_PS_UNIT_DENOMINATOR() { return m_C_PS_UNIT_DENOMINATOR; }
	public String getC_PS_UNIT_NUMERATOR() { return m_C_PS_UNIT_NUMERATOR; }
	public String getC_EFF_PHASE_IN_DATE() { return m_C_EFF_PHASE_IN_DATE; }
	public String getC_EFF_PHASE_OUT_DATE() { return m_C_EFF_PHASE_OUT_DATE; }
	public String getC_PS_SPOIL() { return m_C_PS_SPOIL; }
	public String getC_CONS_TYP() { return m_C_CONS_TYP; }
	public String getC_PS_LT_FLG() { return m_C_PS_LT_FLG; }
	public String getC_PS_FIXED_LT() { return m_C_PS_FIXED_LT; }
	public String getC_PS_PROP_LT() { return m_C_PS_PROP_LT; }
	public String getC_PS_PROP_LOT_SIZE() { return m_C_PS_PROP_LOT_SIZE; }
	public String getC_PS_REF_NO() { return m_C_PS_REF_NO; }
	public String getC_COST_UP_TYP() { return m_C_COST_UP_TYP; }
	public String getC_MRP_EXP_TYP() { return m_C_MRP_EXP_TYP; }
	public String getC_setPARENT_ITEM_CD() { return m_C_setPARENT_ITEM_CD; }
	public String getC_setCOMP_ITEM_CD() { return m_C_setCOMP_ITEM_CD; }
	public String getC_setPS_EDITION() { return m_C_setPS_EDITION; }
	public String getreadMAXSEQ_NO() { return m_readMAXSEQ_NO; }
	public String geth_SEQ_NO() { return m_h_SEQ_NO; }
	public String geth_ACCESS_TYP() { return m_h_ACCESS_TYP; }
	public String geth_CMPLT_FLG() { return m_h_CMPLT_FLG; }

	public List getList_rdoInsert() { return l_rdoInsert; }
	public List getList_rdoUpdate() { return l_rdoUpdate; }
	public List getList_rdoDelete() { return l_rdoDelete; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_FileName() { return l_FileName; }
	public List getList_CANCEL_FILE() { return l_CANCEL_FILE; }
	public List getList_JUDGMENT_TXT() { return l_JUDGMENT_TXT; }
	public List getList_ERROR_IN() { return l_ERROR_IN; }
	public List getList_ERR_CTR_NM() { return l_ERR_CTR_NM; }
	public List getList_ERR_INFO() { return l_ERR_INFO; }
	public List getList_DO_CHK() { return l_DO_CHK; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_COMP_ITEM_CD() { return l_COMP_ITEM_CD; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_readNAME() { return l_readNAME; }
	public List getList_readVALUE() { return l_readVALUE; }
	public List getList_setNAME() { return l_setNAME; }
	public List getList_setVALUE() { return l_setVALUE; }
	public List getList_readSYS_P_NAME() { return l_readSYS_P_NAME; }
	public List getList_readSYS_P_VALUE() { return l_readSYS_P_VALUE; }
	public List getList_setSYS_P_NAME() { return l_setSYS_P_NAME; }
	public List getList_readPARENT_ITEM_CD() { return l_readPARENT_ITEM_CD; }
	public List getList_readCOMP_ITEM_CD() { return l_readCOMP_ITEM_CD; }
	public List getList_readPS_EDITION() { return l_readPS_EDITION; }
	public List getList_setPARENT_ITEM_CD() { return l_setPARENT_ITEM_CD; }
	public List getList_setCOMP_ITEM_CD() { return l_setCOMP_ITEM_CD; }
	public List getList_setPS_EDITION() { return l_setPS_EDITION; }
	public List getList_readM_ITEM_ITEM_CD() { return l_readM_ITEM_ITEM_CD; }
	public List getList_setM_ITEM_ITEM_CD() { return l_setM_ITEM_ITEM_CD; }
	public List getList_h_PARENT_ITEM_CD() { return l_h_PARENT_ITEM_CD; }
	public List getList_h_COMP_ITEM_CD() { return l_h_COMP_ITEM_CD; }
	public List getList_h_PS_EDITION() { return l_h_PS_EDITION; }
	public List getList_h_PS_UNIT_DENOMINATOR() { return l_h_PS_UNIT_DENOMINATOR; }
	public List getList_h_PS_UNIT_NUMERATOR() { return l_h_PS_UNIT_NUMERATOR; }
	public List getList_h_EFF_PHASE_IN_DATE() { return l_h_EFF_PHASE_IN_DATE; }
	public List getList_h_EFF_PHASE_OUT_DATE() { return l_h_EFF_PHASE_OUT_DATE; }
	public List getList_h_PS_SPOIL() { return l_h_PS_SPOIL; }
	public List getList_h_CONS_TYP() { return l_h_CONS_TYP; }
	public List getList_h_PS_LT_FLG() { return l_h_PS_LT_FLG; }
	public List getList_h_PS_FIXED_LT() { return l_h_PS_FIXED_LT; }
	public List getList_h_PS_PROP_LT() { return l_h_PS_PROP_LT; }
	public List getList_h_PS_PROP_LOT_SIZE() { return l_h_PS_PROP_LOT_SIZE; }
	public List getList_h_PS_REF_NO() { return l_h_PS_REF_NO; }
	public List getList_h_COST_UP_TYP() { return l_h_COST_UP_TYP; }
	public List getList_h_MRP_EXP_TYP() { return l_h_MRP_EXP_TYP; }
	public List getList_C_PARENT_ITEM_CD() { return l_C_PARENT_ITEM_CD; }
	public List getList_C_COMP_ITEM_CD() { return l_C_COMP_ITEM_CD; }
	public List getList_C_PS_EDITION() { return l_C_PS_EDITION; }
	public List getList_C_PS_UNIT_DENOMINATOR() { return l_C_PS_UNIT_DENOMINATOR; }
	public List getList_C_PS_UNIT_NUMERATOR() { return l_C_PS_UNIT_NUMERATOR; }
	public List getList_C_EFF_PHASE_IN_DATE() { return l_C_EFF_PHASE_IN_DATE; }
	public List getList_C_EFF_PHASE_OUT_DATE() { return l_C_EFF_PHASE_OUT_DATE; }
	public List getList_C_PS_SPOIL() { return l_C_PS_SPOIL; }
	public List getList_C_CONS_TYP() { return l_C_CONS_TYP; }
	public List getList_C_PS_LT_FLG() { return l_C_PS_LT_FLG; }
	public List getList_C_PS_FIXED_LT() { return l_C_PS_FIXED_LT; }
	public List getList_C_PS_PROP_LT() { return l_C_PS_PROP_LT; }
	public List getList_C_PS_PROP_LOT_SIZE() { return l_C_PS_PROP_LOT_SIZE; }
	public List getList_C_PS_REF_NO() { return l_C_PS_REF_NO; }
	public List getList_C_COST_UP_TYP() { return l_C_COST_UP_TYP; }
	public List getList_C_MRP_EXP_TYP() { return l_C_MRP_EXP_TYP; }
	public List getList_C_setPARENT_ITEM_CD() { return l_C_setPARENT_ITEM_CD; }
	public List getList_C_setCOMP_ITEM_CD() { return l_C_setCOMP_ITEM_CD; }
	public List getList_C_setPS_EDITION() { return l_C_setPS_EDITION; }
	public List getList_readMAXSEQ_NO() { return l_readMAXSEQ_NO; }
	public List getList_h_SEQ_NO() { return l_h_SEQ_NO; }
	public List getList_h_ACCESS_TYP() { return l_h_ACCESS_TYP; }
	public List getList_h_CMPLT_FLG() { return l_h_CMPLT_FLG; }

	public void setrdoInsert(String val) { m_rdoInsert = val; }
	public void setrdoUpdate(String val) { m_rdoUpdate = val; }
	public void setrdoDelete(String val) { m_rdoDelete = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void setCANCEL_FILE(String val) { m_CANCEL_FILE = val; }
	public void setJUDGMENT_TXT(String val) { m_JUDGMENT_TXT = val; }
	public void setERROR_IN(String val) { m_ERROR_IN = val; }
	public void setERR_CTR_NM(String val) { m_ERR_CTR_NM = val; }
	public void setERR_INFO(String val) { m_ERR_INFO = val; }
	public void setDO_CHK(String val) { m_DO_CHK = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setreadNAME(String val) { m_readNAME = val; }
	public void setreadVALUE(String val) { m_readVALUE = val; }
	public void setsetNAME(String val) { m_setNAME = val; }
	public void setsetVALUE(String val) { m_setVALUE = val; }
	public void setreadSYS_P_NAME(String val) { m_readSYS_P_NAME = val; }
	public void setreadSYS_P_VALUE(String val) { m_readSYS_P_VALUE = val; }
	public void setsetSYS_P_NAME(String val) { m_setSYS_P_NAME = val; }
	public void setreadPARENT_ITEM_CD(String val) { m_readPARENT_ITEM_CD = val; }
	public void setreadCOMP_ITEM_CD(String val) { m_readCOMP_ITEM_CD = val; }
	public void setreadPS_EDITION(String val) { m_readPS_EDITION = val; }
	public void setsetPARENT_ITEM_CD(String val) { m_setPARENT_ITEM_CD = val; }
	public void setsetCOMP_ITEM_CD(String val) { m_setCOMP_ITEM_CD = val; }
	public void setsetPS_EDITION(String val) { m_setPS_EDITION = val; }
	public void setreadM_ITEM_ITEM_CD(String val) { m_readM_ITEM_ITEM_CD = val; }
	public void setsetM_ITEM_ITEM_CD(String val) { m_setM_ITEM_ITEM_CD = val; }
	public void seth_PARENT_ITEM_CD(String val) { m_h_PARENT_ITEM_CD = val; }
	public void seth_COMP_ITEM_CD(String val) { m_h_COMP_ITEM_CD = val; }
	public void seth_PS_EDITION(String val) { m_h_PS_EDITION = val; }
	public void seth_PS_UNIT_DENOMINATOR(String val) { m_h_PS_UNIT_DENOMINATOR = val; }
	public void seth_PS_UNIT_NUMERATOR(String val) { m_h_PS_UNIT_NUMERATOR = val; }
	public void seth_EFF_PHASE_IN_DATE(String val) { m_h_EFF_PHASE_IN_DATE = val; }
	public void seth_EFF_PHASE_OUT_DATE(String val) { m_h_EFF_PHASE_OUT_DATE = val; }
	public void seth_PS_SPOIL(String val) { m_h_PS_SPOIL = val; }
	public void seth_CONS_TYP(String val) { m_h_CONS_TYP = val; }
	public void seth_PS_LT_FLG(String val) { m_h_PS_LT_FLG = val; }
	public void seth_PS_FIXED_LT(String val) { m_h_PS_FIXED_LT = val; }
	public void seth_PS_PROP_LT(String val) { m_h_PS_PROP_LT = val; }
	public void seth_PS_PROP_LOT_SIZE(String val) { m_h_PS_PROP_LOT_SIZE = val; }
	public void seth_PS_REF_NO(String val) { m_h_PS_REF_NO = val; }
	public void seth_COST_UP_TYP(String val) { m_h_COST_UP_TYP = val; }
	public void seth_MRP_EXP_TYP(String val) { m_h_MRP_EXP_TYP = val; }
	public void setC_PARENT_ITEM_CD(String val) { m_C_PARENT_ITEM_CD = val; }
	public void setC_COMP_ITEM_CD(String val) { m_C_COMP_ITEM_CD = val; }
	public void setC_PS_EDITION(String val) { m_C_PS_EDITION = val; }
	public void setC_PS_UNIT_DENOMINATOR(String val) { m_C_PS_UNIT_DENOMINATOR = val; }
	public void setC_PS_UNIT_NUMERATOR(String val) { m_C_PS_UNIT_NUMERATOR = val; }
	public void setC_EFF_PHASE_IN_DATE(String val) { m_C_EFF_PHASE_IN_DATE = val; }
	public void setC_EFF_PHASE_OUT_DATE(String val) { m_C_EFF_PHASE_OUT_DATE = val; }
	public void setC_PS_SPOIL(String val) { m_C_PS_SPOIL = val; }
	public void setC_CONS_TYP(String val) { m_C_CONS_TYP = val; }
	public void setC_PS_LT_FLG(String val) { m_C_PS_LT_FLG = val; }
	public void setC_PS_FIXED_LT(String val) { m_C_PS_FIXED_LT = val; }
	public void setC_PS_PROP_LT(String val) { m_C_PS_PROP_LT = val; }
	public void setC_PS_PROP_LOT_SIZE(String val) { m_C_PS_PROP_LOT_SIZE = val; }
	public void setC_PS_REF_NO(String val) { m_C_PS_REF_NO = val; }
	public void setC_COST_UP_TYP(String val) { m_C_COST_UP_TYP = val; }
	public void setC_MRP_EXP_TYP(String val) { m_C_MRP_EXP_TYP = val; }
	public void setC_setPARENT_ITEM_CD(String val) { m_C_setPARENT_ITEM_CD = val; }
	public void setC_setCOMP_ITEM_CD(String val) { m_C_setCOMP_ITEM_CD = val; }
	public void setC_setPS_EDITION(String val) { m_C_setPS_EDITION = val; }
	public void setreadMAXSEQ_NO(String val) { m_readMAXSEQ_NO = val; }
	public void seth_SEQ_NO(String val) { m_h_SEQ_NO = val; }
	public void seth_ACCESS_TYP(String val) { m_h_ACCESS_TYP = val; }
	public void seth_CMPLT_FLG(String val) { m_h_CMPLT_FLG = val; }


	public void setList_rdoInsert(List list) { l_rdoInsert = list; }
	public void setList_rdoUpdate(List list) { l_rdoUpdate = list; }
	public void setList_rdoDelete(List list) { l_rdoDelete = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_CANCEL_FILE(List list) { l_CANCEL_FILE = list; }
	public void setList_JUDGMENT_TXT(List list) { l_JUDGMENT_TXT = list; }
	public void setList_ERROR_IN(List list) { l_ERROR_IN = list; }
	public void setList_ERR_CTR_NM(List list) { l_ERR_CTR_NM = list; }
	public void setList_ERR_INFO(List list) { l_ERR_INFO = list; }
	public void setList_DO_CHK(List list) { l_DO_CHK = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_COMP_ITEM_CD(List list) { l_COMP_ITEM_CD = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_readNAME(List list) { l_readNAME = list; }
	public void setList_readVALUE(List list) { l_readVALUE = list; }
	public void setList_setNAME(List list) { l_setNAME = list; }
	public void setList_setVALUE(List list) { l_setVALUE = list; }
	public void setList_readSYS_P_NAME(List list) { l_readSYS_P_NAME = list; }
	public void setList_readSYS_P_VALUE(List list) { l_readSYS_P_VALUE = list; }
	public void setList_setSYS_P_NAME(List list) { l_setSYS_P_NAME = list; }
	public void setList_readPARENT_ITEM_CD(List list) { l_readPARENT_ITEM_CD = list; }
	public void setList_readCOMP_ITEM_CD(List list) { l_readCOMP_ITEM_CD = list; }
	public void setList_readPS_EDITION(List list) { l_readPS_EDITION = list; }
	public void setList_setPARENT_ITEM_CD(List list) { l_setPARENT_ITEM_CD = list; }
	public void setList_setCOMP_ITEM_CD(List list) { l_setCOMP_ITEM_CD = list; }
	public void setList_setPS_EDITION(List list) { l_setPS_EDITION = list; }
	public void setList_readM_ITEM_ITEM_CD(List list) { l_readM_ITEM_ITEM_CD = list; }
	public void setList_setM_ITEM_ITEM_CD(List list) { l_setM_ITEM_ITEM_CD = list; }
	public void setList_h_PARENT_ITEM_CD(List list) { l_h_PARENT_ITEM_CD = list; }
	public void setList_h_COMP_ITEM_CD(List list) { l_h_COMP_ITEM_CD = list; }
	public void setList_h_PS_EDITION(List list) { l_h_PS_EDITION = list; }
	public void setList_h_PS_UNIT_DENOMINATOR(List list) { l_h_PS_UNIT_DENOMINATOR = list; }
	public void setList_h_PS_UNIT_NUMERATOR(List list) { l_h_PS_UNIT_NUMERATOR = list; }
	public void setList_h_EFF_PHASE_IN_DATE(List list) { l_h_EFF_PHASE_IN_DATE = list; }
	public void setList_h_EFF_PHASE_OUT_DATE(List list) { l_h_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_PS_SPOIL(List list) { l_h_PS_SPOIL = list; }
	public void setList_h_CONS_TYP(List list) { l_h_CONS_TYP = list; }
	public void setList_h_PS_LT_FLG(List list) { l_h_PS_LT_FLG = list; }
	public void setList_h_PS_FIXED_LT(List list) { l_h_PS_FIXED_LT = list; }
	public void setList_h_PS_PROP_LT(List list) { l_h_PS_PROP_LT = list; }
	public void setList_h_PS_PROP_LOT_SIZE(List list) { l_h_PS_PROP_LOT_SIZE = list; }
	public void setList_h_PS_REF_NO(List list) { l_h_PS_REF_NO = list; }
	public void setList_h_COST_UP_TYP(List list) { l_h_COST_UP_TYP = list; }
	public void setList_h_MRP_EXP_TYP(List list) { l_h_MRP_EXP_TYP = list; }
	public void setList_C_PARENT_ITEM_CD(List list) { l_C_PARENT_ITEM_CD = list; }
	public void setList_C_COMP_ITEM_CD(List list) { l_C_COMP_ITEM_CD = list; }
	public void setList_C_PS_EDITION(List list) { l_C_PS_EDITION = list; }
	public void setList_C_PS_UNIT_DENOMINATOR(List list) { l_C_PS_UNIT_DENOMINATOR = list; }
	public void setList_C_PS_UNIT_NUMERATOR(List list) { l_C_PS_UNIT_NUMERATOR = list; }
	public void setList_C_EFF_PHASE_IN_DATE(List list) { l_C_EFF_PHASE_IN_DATE = list; }
	public void setList_C_EFF_PHASE_OUT_DATE(List list) { l_C_EFF_PHASE_OUT_DATE = list; }
	public void setList_C_PS_SPOIL(List list) { l_C_PS_SPOIL = list; }
	public void setList_C_CONS_TYP(List list) { l_C_CONS_TYP = list; }
	public void setList_C_PS_LT_FLG(List list) { l_C_PS_LT_FLG = list; }
	public void setList_C_PS_FIXED_LT(List list) { l_C_PS_FIXED_LT = list; }
	public void setList_C_PS_PROP_LT(List list) { l_C_PS_PROP_LT = list; }
	public void setList_C_PS_PROP_LOT_SIZE(List list) { l_C_PS_PROP_LOT_SIZE = list; }
	public void setList_C_PS_REF_NO(List list) { l_C_PS_REF_NO = list; }
	public void setList_C_COST_UP_TYP(List list) { l_C_COST_UP_TYP = list; }
	public void setList_C_MRP_EXP_TYP(List list) { l_C_MRP_EXP_TYP = list; }
	public void setList_C_setPARENT_ITEM_CD(List list) { l_C_setPARENT_ITEM_CD = list; }
	public void setList_C_setCOMP_ITEM_CD(List list) { l_C_setCOMP_ITEM_CD = list; }
	public void setList_C_setPS_EDITION(List list) { l_C_setPS_EDITION = list; }
	public void setList_readMAXSEQ_NO(List list) { l_readMAXSEQ_NO = list; }
	public void setList_h_SEQ_NO(List list) { l_h_SEQ_NO = list; }
	public void setList_h_ACCESS_TYP(List list) { l_h_ACCESS_TYP = list; }
	public void setList_h_CMPLT_FLG(List list) { l_h_CMPLT_FLG = list; }

	public int setL2L_rdoInsert(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoInsert == null) {
			l_rdoInsert = new ArrayList();
		} else {
			l_rdoInsert.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoInsert.add(((AA0160010Struct) list.get(i)).getrdoInsert());
		}
		return size;
	}
	public int setL2L_rdoUpdate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoUpdate == null) {
			l_rdoUpdate = new ArrayList();
		} else {
			l_rdoUpdate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoUpdate.add(((AA0160010Struct) list.get(i)).getrdoUpdate());
		}
		return size;
	}
	public int setL2L_rdoDelete(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoDelete == null) {
			l_rdoDelete = new ArrayList();
		} else {
			l_rdoDelete.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoDelete.add(((AA0160010Struct) list.get(i)).getrdoDelete());
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
			l_DOWNLOAD_FILE.add(((AA0160010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AA0160010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_CANCEL_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCEL_FILE == null) {
			l_CANCEL_FILE = new ArrayList();
		} else {
			l_CANCEL_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCEL_FILE.add(((AA0160010Struct) list.get(i)).getCANCEL_FILE());
		}
		return size;
	}
	public int setL2L_JUDGMENT_TXT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JUDGMENT_TXT == null) {
			l_JUDGMENT_TXT = new ArrayList();
		} else {
			l_JUDGMENT_TXT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JUDGMENT_TXT.add(((AA0160010Struct) list.get(i)).getJUDGMENT_TXT());
		}
		return size;
	}
	public int setL2L_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERROR_IN == null) {
			l_ERROR_IN = new ArrayList();
		} else {
			l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERROR_IN.add(((AA0160010Struct) list.get(i)).getERROR_IN());
		}
		return size;
	}
	public int setL2L_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_CTR_NM == null) {
			l_ERR_CTR_NM = new ArrayList();
		} else {
			l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_CTR_NM.add(((AA0160010Struct) list.get(i)).getERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_INFO == null) {
			l_ERR_INFO = new ArrayList();
		} else {
			l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_INFO.add(((AA0160010Struct) list.get(i)).getERR_INFO());
		}
		return size;
	}
	public int setL2L_DO_CHK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DO_CHK == null) {
			l_DO_CHK = new ArrayList();
		} else {
			l_DO_CHK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DO_CHK.add(((AA0160010Struct) list.get(i)).getDO_CHK());
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
			l_PARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).getPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_ITEM_CD == null) {
			l_COMP_ITEM_CD = new ArrayList();
		} else {
			l_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).getCOMP_ITEM_CD());
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
			l_PS_EDITION.add(((AA0160010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AA0160010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_readNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readNAME == null) {
			l_readNAME = new ArrayList();
		} else {
			l_readNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readNAME.add(((AA0160010Struct) list.get(i)).getreadNAME());
		}
		return size;
	}
	public int setL2L_readVALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVALUE == null) {
			l_readVALUE = new ArrayList();
		} else {
			l_readVALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVALUE.add(((AA0160010Struct) list.get(i)).getreadVALUE());
		}
		return size;
	}
	public int setL2L_setNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setNAME == null) {
			l_setNAME = new ArrayList();
		} else {
			l_setNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setNAME.add(((AA0160010Struct) list.get(i)).getsetNAME());
		}
		return size;
	}
	public int setL2L_setVALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setVALUE == null) {
			l_setVALUE = new ArrayList();
		} else {
			l_setVALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setVALUE.add(((AA0160010Struct) list.get(i)).getsetVALUE());
		}
		return size;
	}
	public int setL2L_readSYS_P_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSYS_P_NAME == null) {
			l_readSYS_P_NAME = new ArrayList();
		} else {
			l_readSYS_P_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSYS_P_NAME.add(((AA0160010Struct) list.get(i)).getreadSYS_P_NAME());
		}
		return size;
	}
	public int setL2L_readSYS_P_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSYS_P_VALUE == null) {
			l_readSYS_P_VALUE = new ArrayList();
		} else {
			l_readSYS_P_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSYS_P_VALUE.add(((AA0160010Struct) list.get(i)).getreadSYS_P_VALUE());
		}
		return size;
	}
	public int setL2L_setSYS_P_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSYS_P_NAME == null) {
			l_setSYS_P_NAME = new ArrayList();
		} else {
			l_setSYS_P_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSYS_P_NAME.add(((AA0160010Struct) list.get(i)).getsetSYS_P_NAME());
		}
		return size;
	}
	public int setL2L_readPARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPARENT_ITEM_CD == null) {
			l_readPARENT_ITEM_CD = new ArrayList();
		} else {
			l_readPARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).getreadPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readCOMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readCOMP_ITEM_CD == null) {
			l_readCOMP_ITEM_CD = new ArrayList();
		} else {
			l_readCOMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readCOMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).getreadCOMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readPS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPS_EDITION == null) {
			l_readPS_EDITION = new ArrayList();
		} else {
			l_readPS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPS_EDITION.add(((AA0160010Struct) list.get(i)).getreadPS_EDITION());
		}
		return size;
	}
	public int setL2L_setPARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPARENT_ITEM_CD == null) {
			l_setPARENT_ITEM_CD = new ArrayList();
		} else {
			l_setPARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).getsetPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setCOMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCOMP_ITEM_CD == null) {
			l_setCOMP_ITEM_CD = new ArrayList();
		} else {
			l_setCOMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCOMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).getsetCOMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setPS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPS_EDITION == null) {
			l_setPS_EDITION = new ArrayList();
		} else {
			l_setPS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPS_EDITION.add(((AA0160010Struct) list.get(i)).getsetPS_EDITION());
		}
		return size;
	}
	public int setL2L_readM_ITEM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_ITEM_ITEM_CD == null) {
			l_readM_ITEM_ITEM_CD = new ArrayList();
		} else {
			l_readM_ITEM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_ITEM_ITEM_CD.add(((AA0160010Struct) list.get(i)).getreadM_ITEM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setM_ITEM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_ITEM_ITEM_CD == null) {
			l_setM_ITEM_ITEM_CD = new ArrayList();
		} else {
			l_setM_ITEM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_ITEM_ITEM_CD.add(((AA0160010Struct) list.get(i)).getsetM_ITEM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARENT_ITEM_CD == null) {
			l_h_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_h_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).geth_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COMP_ITEM_CD == null) {
			l_h_COMP_ITEM_CD = new ArrayList();
		} else {
			l_h_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).geth_COMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_EDITION == null) {
			l_h_PS_EDITION = new ArrayList();
		} else {
			l_h_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_EDITION.add(((AA0160010Struct) list.get(i)).geth_PS_EDITION());
		}
		return size;
	}
	public int setL2L_h_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_UNIT_DENOMINATOR == null) {
			l_h_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_h_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_UNIT_DENOMINATOR.add(((AA0160010Struct) list.get(i)).geth_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_h_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_UNIT_NUMERATOR == null) {
			l_h_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_h_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_UNIT_NUMERATOR.add(((AA0160010Struct) list.get(i)).geth_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_h_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EFF_PHASE_IN_DATE == null) {
			l_h_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_h_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EFF_PHASE_IN_DATE.add(((AA0160010Struct) list.get(i)).geth_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_h_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EFF_PHASE_OUT_DATE == null) {
			l_h_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_h_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EFF_PHASE_OUT_DATE.add(((AA0160010Struct) list.get(i)).geth_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_SPOIL == null) {
			l_h_PS_SPOIL = new ArrayList();
		} else {
			l_h_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_SPOIL.add(((AA0160010Struct) list.get(i)).geth_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_h_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CONS_TYP == null) {
			l_h_CONS_TYP = new ArrayList();
		} else {
			l_h_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CONS_TYP.add(((AA0160010Struct) list.get(i)).geth_CONS_TYP());
		}
		return size;
	}
	public int setL2L_h_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_LT_FLG == null) {
			l_h_PS_LT_FLG = new ArrayList();
		} else {
			l_h_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_LT_FLG.add(((AA0160010Struct) list.get(i)).geth_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_h_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_FIXED_LT == null) {
			l_h_PS_FIXED_LT = new ArrayList();
		} else {
			l_h_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_FIXED_LT.add(((AA0160010Struct) list.get(i)).geth_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_h_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_PROP_LT == null) {
			l_h_PS_PROP_LT = new ArrayList();
		} else {
			l_h_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_PROP_LT.add(((AA0160010Struct) list.get(i)).geth_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_h_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_PROP_LOT_SIZE == null) {
			l_h_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_h_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_PROP_LOT_SIZE.add(((AA0160010Struct) list.get(i)).geth_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_h_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PS_REF_NO == null) {
			l_h_PS_REF_NO = new ArrayList();
		} else {
			l_h_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PS_REF_NO.add(((AA0160010Struct) list.get(i)).geth_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_h_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COST_UP_TYP == null) {
			l_h_COST_UP_TYP = new ArrayList();
		} else {
			l_h_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COST_UP_TYP.add(((AA0160010Struct) list.get(i)).geth_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_h_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MRP_EXP_TYP == null) {
			l_h_MRP_EXP_TYP = new ArrayList();
		} else {
			l_h_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MRP_EXP_TYP.add(((AA0160010Struct) list.get(i)).geth_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_C_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PARENT_ITEM_CD == null) {
			l_C_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_C_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).getC_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_COMP_ITEM_CD == null) {
			l_C_COMP_ITEM_CD = new ArrayList();
		} else {
			l_C_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_COMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).getC_COMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_EDITION == null) {
			l_C_PS_EDITION = new ArrayList();
		} else {
			l_C_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_EDITION.add(((AA0160010Struct) list.get(i)).getC_PS_EDITION());
		}
		return size;
	}
	public int setL2L_C_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_UNIT_DENOMINATOR == null) {
			l_C_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_C_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_UNIT_DENOMINATOR.add(((AA0160010Struct) list.get(i)).getC_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_C_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_UNIT_NUMERATOR == null) {
			l_C_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_C_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_UNIT_NUMERATOR.add(((AA0160010Struct) list.get(i)).getC_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_C_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_EFF_PHASE_IN_DATE == null) {
			l_C_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_C_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_EFF_PHASE_IN_DATE.add(((AA0160010Struct) list.get(i)).getC_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_C_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_EFF_PHASE_OUT_DATE == null) {
			l_C_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_C_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_EFF_PHASE_OUT_DATE.add(((AA0160010Struct) list.get(i)).getC_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_C_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_SPOIL == null) {
			l_C_PS_SPOIL = new ArrayList();
		} else {
			l_C_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_SPOIL.add(((AA0160010Struct) list.get(i)).getC_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_C_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_CONS_TYP == null) {
			l_C_CONS_TYP = new ArrayList();
		} else {
			l_C_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_CONS_TYP.add(((AA0160010Struct) list.get(i)).getC_CONS_TYP());
		}
		return size;
	}
	public int setL2L_C_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_LT_FLG == null) {
			l_C_PS_LT_FLG = new ArrayList();
		} else {
			l_C_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_LT_FLG.add(((AA0160010Struct) list.get(i)).getC_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_C_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_FIXED_LT == null) {
			l_C_PS_FIXED_LT = new ArrayList();
		} else {
			l_C_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_FIXED_LT.add(((AA0160010Struct) list.get(i)).getC_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_C_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_PROP_LT == null) {
			l_C_PS_PROP_LT = new ArrayList();
		} else {
			l_C_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_PROP_LT.add(((AA0160010Struct) list.get(i)).getC_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_C_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_PROP_LOT_SIZE == null) {
			l_C_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_C_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_PROP_LOT_SIZE.add(((AA0160010Struct) list.get(i)).getC_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_C_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PS_REF_NO == null) {
			l_C_PS_REF_NO = new ArrayList();
		} else {
			l_C_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PS_REF_NO.add(((AA0160010Struct) list.get(i)).getC_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_C_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_COST_UP_TYP == null) {
			l_C_COST_UP_TYP = new ArrayList();
		} else {
			l_C_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_COST_UP_TYP.add(((AA0160010Struct) list.get(i)).getC_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_C_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MRP_EXP_TYP == null) {
			l_C_MRP_EXP_TYP = new ArrayList();
		} else {
			l_C_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MRP_EXP_TYP.add(((AA0160010Struct) list.get(i)).getC_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_C_setPARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_setPARENT_ITEM_CD == null) {
			l_C_setPARENT_ITEM_CD = new ArrayList();
		} else {
			l_C_setPARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_setPARENT_ITEM_CD.add(((AA0160010Struct) list.get(i)).getC_setPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_setCOMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_setCOMP_ITEM_CD == null) {
			l_C_setCOMP_ITEM_CD = new ArrayList();
		} else {
			l_C_setCOMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_setCOMP_ITEM_CD.add(((AA0160010Struct) list.get(i)).getC_setCOMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_setPS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_setPS_EDITION == null) {
			l_C_setPS_EDITION = new ArrayList();
		} else {
			l_C_setPS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_setPS_EDITION.add(((AA0160010Struct) list.get(i)).getC_setPS_EDITION());
		}
		return size;
	}
	public int setL2L_readMAXSEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readMAXSEQ_NO == null) {
			l_readMAXSEQ_NO = new ArrayList();
		} else {
			l_readMAXSEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readMAXSEQ_NO.add(((AA0160010Struct) list.get(i)).getreadMAXSEQ_NO());
		}
		return size;
	}
	public int setL2L_h_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SEQ_NO == null) {
			l_h_SEQ_NO = new ArrayList();
		} else {
			l_h_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SEQ_NO.add(((AA0160010Struct) list.get(i)).geth_SEQ_NO());
		}
		return size;
	}
	public int setL2L_h_ACCESS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ACCESS_TYP == null) {
			l_h_ACCESS_TYP = new ArrayList();
		} else {
			l_h_ACCESS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ACCESS_TYP.add(((AA0160010Struct) list.get(i)).geth_ACCESS_TYP());
		}
		return size;
	}
	public int setL2L_h_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CMPLT_FLG == null) {
			l_h_CMPLT_FLG = new ArrayList();
		} else {
			l_h_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CMPLT_FLG.add(((AA0160010Struct) list.get(i)).geth_CMPLT_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoInsert = null;
		m_rdoUpdate = null;
		m_rdoDelete = null;
		m_DOWNLOAD_FILE = null;
		m_FileName = null;
		m_CANCEL_FILE = null;
		m_JUDGMENT_TXT = null;
		m_ERROR_IN = null;
		m_ERR_CTR_NM = null;
		m_ERR_INFO = null;
		m_DO_CHK = null;
		m_PARENT_ITEM_CD = null;
		m_COMP_ITEM_CD = null;
		m_PS_EDITION = null;
		m_w_COLUMN_FLG = null;
		m_readNAME = null;
		m_readVALUE = null;
		m_setNAME = null;
		m_setVALUE = null;
		m_readSYS_P_NAME = null;
		m_readSYS_P_VALUE = null;
		m_setSYS_P_NAME = null;
		m_readPARENT_ITEM_CD = null;
		m_readCOMP_ITEM_CD = null;
		m_readPS_EDITION = null;
		m_setPARENT_ITEM_CD = null;
		m_setCOMP_ITEM_CD = null;
		m_setPS_EDITION = null;
		m_readM_ITEM_ITEM_CD = null;
		m_setM_ITEM_ITEM_CD = null;
		m_h_PARENT_ITEM_CD = null;
		m_h_COMP_ITEM_CD = null;
		m_h_PS_EDITION = null;
		m_h_PS_UNIT_DENOMINATOR = null;
		m_h_PS_UNIT_NUMERATOR = null;
		m_h_EFF_PHASE_IN_DATE = null;
		m_h_EFF_PHASE_OUT_DATE = null;
		m_h_PS_SPOIL = null;
		m_h_CONS_TYP = null;
		m_h_PS_LT_FLG = null;
		m_h_PS_FIXED_LT = null;
		m_h_PS_PROP_LT = null;
		m_h_PS_PROP_LOT_SIZE = null;
		m_h_PS_REF_NO = null;
		m_h_COST_UP_TYP = null;
		m_h_MRP_EXP_TYP = null;
		m_C_PARENT_ITEM_CD = null;
		m_C_COMP_ITEM_CD = null;
		m_C_PS_EDITION = null;
		m_C_PS_UNIT_DENOMINATOR = null;
		m_C_PS_UNIT_NUMERATOR = null;
		m_C_EFF_PHASE_IN_DATE = null;
		m_C_EFF_PHASE_OUT_DATE = null;
		m_C_PS_SPOIL = null;
		m_C_CONS_TYP = null;
		m_C_PS_LT_FLG = null;
		m_C_PS_FIXED_LT = null;
		m_C_PS_PROP_LT = null;
		m_C_PS_PROP_LOT_SIZE = null;
		m_C_PS_REF_NO = null;
		m_C_COST_UP_TYP = null;
		m_C_MRP_EXP_TYP = null;
		m_C_setPARENT_ITEM_CD = null;
		m_C_setCOMP_ITEM_CD = null;
		m_C_setPS_EDITION = null;
		m_readMAXSEQ_NO = null;
		m_h_SEQ_NO = null;
		m_h_ACCESS_TYP = null;
		m_h_CMPLT_FLG = null;

		l_rdoInsert = null;
		l_rdoUpdate = null;
		l_rdoDelete = null;
		l_DOWNLOAD_FILE = null;
		l_FileName = null;
		l_CANCEL_FILE = null;
		l_JUDGMENT_TXT = null;
		l_ERROR_IN = null;
		l_ERR_CTR_NM = null;
		l_ERR_INFO = null;
		l_DO_CHK = null;
		l_PARENT_ITEM_CD = null;
		l_COMP_ITEM_CD = null;
		l_PS_EDITION = null;
		l_w_COLUMN_FLG = null;
		l_readNAME = null;
		l_readVALUE = null;
		l_setNAME = null;
		l_setVALUE = null;
		l_readSYS_P_NAME = null;
		l_readSYS_P_VALUE = null;
		l_setSYS_P_NAME = null;
		l_readPARENT_ITEM_CD = null;
		l_readCOMP_ITEM_CD = null;
		l_readPS_EDITION = null;
		l_setPARENT_ITEM_CD = null;
		l_setCOMP_ITEM_CD = null;
		l_setPS_EDITION = null;
		l_readM_ITEM_ITEM_CD = null;
		l_setM_ITEM_ITEM_CD = null;
		l_h_PARENT_ITEM_CD = null;
		l_h_COMP_ITEM_CD = null;
		l_h_PS_EDITION = null;
		l_h_PS_UNIT_DENOMINATOR = null;
		l_h_PS_UNIT_NUMERATOR = null;
		l_h_EFF_PHASE_IN_DATE = null;
		l_h_EFF_PHASE_OUT_DATE = null;
		l_h_PS_SPOIL = null;
		l_h_CONS_TYP = null;
		l_h_PS_LT_FLG = null;
		l_h_PS_FIXED_LT = null;
		l_h_PS_PROP_LT = null;
		l_h_PS_PROP_LOT_SIZE = null;
		l_h_PS_REF_NO = null;
		l_h_COST_UP_TYP = null;
		l_h_MRP_EXP_TYP = null;
		l_C_PARENT_ITEM_CD = null;
		l_C_COMP_ITEM_CD = null;
		l_C_PS_EDITION = null;
		l_C_PS_UNIT_DENOMINATOR = null;
		l_C_PS_UNIT_NUMERATOR = null;
		l_C_EFF_PHASE_IN_DATE = null;
		l_C_EFF_PHASE_OUT_DATE = null;
		l_C_PS_SPOIL = null;
		l_C_CONS_TYP = null;
		l_C_PS_LT_FLG = null;
		l_C_PS_FIXED_LT = null;
		l_C_PS_PROP_LT = null;
		l_C_PS_PROP_LOT_SIZE = null;
		l_C_PS_REF_NO = null;
		l_C_COST_UP_TYP = null;
		l_C_MRP_EXP_TYP = null;
		l_C_setPARENT_ITEM_CD = null;
		l_C_setCOMP_ITEM_CD = null;
		l_C_setPS_EDITION = null;
		l_readMAXSEQ_NO = null;
		l_h_SEQ_NO = null;
		l_h_ACCESS_TYP = null;
		l_h_CMPLT_FLG = null;

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
	 * medAA0160010�N���X�̕W���R���X�g���N�^
	 */
	public AA0160010Struct()
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
	public void setStruct(AA0160010Struct struct)
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
	public void setStructM(AA0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoInsert(struct.getrdoInsert());
			this.setrdoUpdate(struct.getrdoUpdate());
			this.setrdoDelete(struct.getrdoDelete());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setFileName(struct.getFileName());
			this.setCANCEL_FILE(struct.getCANCEL_FILE());
			this.setJUDGMENT_TXT(struct.getJUDGMENT_TXT());
			this.setERROR_IN(struct.getERROR_IN());
			this.setERR_CTR_NM(struct.getERR_CTR_NM());
			this.setERR_INFO(struct.getERR_INFO());
			this.setDO_CHK(struct.getDO_CHK());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setreadNAME(struct.getreadNAME());
			this.setreadVALUE(struct.getreadVALUE());
			this.setsetNAME(struct.getsetNAME());
			this.setsetVALUE(struct.getsetVALUE());
			this.setreadSYS_P_NAME(struct.getreadSYS_P_NAME());
			this.setreadSYS_P_VALUE(struct.getreadSYS_P_VALUE());
			this.setsetSYS_P_NAME(struct.getsetSYS_P_NAME());
			this.setreadPARENT_ITEM_CD(struct.getreadPARENT_ITEM_CD());
			this.setreadCOMP_ITEM_CD(struct.getreadCOMP_ITEM_CD());
			this.setreadPS_EDITION(struct.getreadPS_EDITION());
			this.setsetPARENT_ITEM_CD(struct.getsetPARENT_ITEM_CD());
			this.setsetCOMP_ITEM_CD(struct.getsetCOMP_ITEM_CD());
			this.setsetPS_EDITION(struct.getsetPS_EDITION());
			this.setreadM_ITEM_ITEM_CD(struct.getreadM_ITEM_ITEM_CD());
			this.setsetM_ITEM_ITEM_CD(struct.getsetM_ITEM_ITEM_CD());
			this.seth_PARENT_ITEM_CD(struct.geth_PARENT_ITEM_CD());
			this.seth_COMP_ITEM_CD(struct.geth_COMP_ITEM_CD());
			this.seth_PS_EDITION(struct.geth_PS_EDITION());
			this.seth_PS_UNIT_DENOMINATOR(struct.geth_PS_UNIT_DENOMINATOR());
			this.seth_PS_UNIT_NUMERATOR(struct.geth_PS_UNIT_NUMERATOR());
			this.seth_EFF_PHASE_IN_DATE(struct.geth_EFF_PHASE_IN_DATE());
			this.seth_EFF_PHASE_OUT_DATE(struct.geth_EFF_PHASE_OUT_DATE());
			this.seth_PS_SPOIL(struct.geth_PS_SPOIL());
			this.seth_CONS_TYP(struct.geth_CONS_TYP());
			this.seth_PS_LT_FLG(struct.geth_PS_LT_FLG());
			this.seth_PS_FIXED_LT(struct.geth_PS_FIXED_LT());
			this.seth_PS_PROP_LT(struct.geth_PS_PROP_LT());
			this.seth_PS_PROP_LOT_SIZE(struct.geth_PS_PROP_LOT_SIZE());
			this.seth_PS_REF_NO(struct.geth_PS_REF_NO());
			this.seth_COST_UP_TYP(struct.geth_COST_UP_TYP());
			this.seth_MRP_EXP_TYP(struct.geth_MRP_EXP_TYP());
			this.setC_PARENT_ITEM_CD(struct.getC_PARENT_ITEM_CD());
			this.setC_COMP_ITEM_CD(struct.getC_COMP_ITEM_CD());
			this.setC_PS_EDITION(struct.getC_PS_EDITION());
			this.setC_PS_UNIT_DENOMINATOR(struct.getC_PS_UNIT_DENOMINATOR());
			this.setC_PS_UNIT_NUMERATOR(struct.getC_PS_UNIT_NUMERATOR());
			this.setC_EFF_PHASE_IN_DATE(struct.getC_EFF_PHASE_IN_DATE());
			this.setC_EFF_PHASE_OUT_DATE(struct.getC_EFF_PHASE_OUT_DATE());
			this.setC_PS_SPOIL(struct.getC_PS_SPOIL());
			this.setC_CONS_TYP(struct.getC_CONS_TYP());
			this.setC_PS_LT_FLG(struct.getC_PS_LT_FLG());
			this.setC_PS_FIXED_LT(struct.getC_PS_FIXED_LT());
			this.setC_PS_PROP_LT(struct.getC_PS_PROP_LT());
			this.setC_PS_PROP_LOT_SIZE(struct.getC_PS_PROP_LOT_SIZE());
			this.setC_PS_REF_NO(struct.getC_PS_REF_NO());
			this.setC_COST_UP_TYP(struct.getC_COST_UP_TYP());
			this.setC_MRP_EXP_TYP(struct.getC_MRP_EXP_TYP());
			this.setC_setPARENT_ITEM_CD(struct.getC_setPARENT_ITEM_CD());
			this.setC_setCOMP_ITEM_CD(struct.getC_setCOMP_ITEM_CD());
			this.setC_setPS_EDITION(struct.getC_setPS_EDITION());
			this.setreadMAXSEQ_NO(struct.getreadMAXSEQ_NO());
			this.seth_SEQ_NO(struct.geth_SEQ_NO());
			this.seth_ACCESS_TYP(struct.geth_ACCESS_TYP());
			this.seth_CMPLT_FLG(struct.geth_CMPLT_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0160010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoInsert(struct.getList_rdoInsert());
			this.setList_rdoUpdate(struct.getList_rdoUpdate());
			this.setList_rdoDelete(struct.getList_rdoDelete());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_FileName(struct.getList_FileName());
			this.setList_CANCEL_FILE(struct.getList_CANCEL_FILE());
			this.setList_JUDGMENT_TXT(struct.getList_JUDGMENT_TXT());
			this.setList_ERROR_IN(struct.getList_ERROR_IN());
			this.setList_ERR_CTR_NM(struct.getList_ERR_CTR_NM());
			this.setList_ERR_INFO(struct.getList_ERR_INFO());
			this.setList_DO_CHK(struct.getList_DO_CHK());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_COMP_ITEM_CD(struct.getList_COMP_ITEM_CD());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_readNAME(struct.getList_readNAME());
			this.setList_readVALUE(struct.getList_readVALUE());
			this.setList_setNAME(struct.getList_setNAME());
			this.setList_setVALUE(struct.getList_setVALUE());
			this.setList_readSYS_P_NAME(struct.getList_readSYS_P_NAME());
			this.setList_readSYS_P_VALUE(struct.getList_readSYS_P_VALUE());
			this.setList_setSYS_P_NAME(struct.getList_setSYS_P_NAME());
			this.setList_readPARENT_ITEM_CD(struct.getList_readPARENT_ITEM_CD());
			this.setList_readCOMP_ITEM_CD(struct.getList_readCOMP_ITEM_CD());
			this.setList_readPS_EDITION(struct.getList_readPS_EDITION());
			this.setList_setPARENT_ITEM_CD(struct.getList_setPARENT_ITEM_CD());
			this.setList_setCOMP_ITEM_CD(struct.getList_setCOMP_ITEM_CD());
			this.setList_setPS_EDITION(struct.getList_setPS_EDITION());
			this.setList_readM_ITEM_ITEM_CD(struct.getList_readM_ITEM_ITEM_CD());
			this.setList_setM_ITEM_ITEM_CD(struct.getList_setM_ITEM_ITEM_CD());
			this.setList_h_PARENT_ITEM_CD(struct.getList_h_PARENT_ITEM_CD());
			this.setList_h_COMP_ITEM_CD(struct.getList_h_COMP_ITEM_CD());
			this.setList_h_PS_EDITION(struct.getList_h_PS_EDITION());
			this.setList_h_PS_UNIT_DENOMINATOR(struct.getList_h_PS_UNIT_DENOMINATOR());
			this.setList_h_PS_UNIT_NUMERATOR(struct.getList_h_PS_UNIT_NUMERATOR());
			this.setList_h_EFF_PHASE_IN_DATE(struct.getList_h_EFF_PHASE_IN_DATE());
			this.setList_h_EFF_PHASE_OUT_DATE(struct.getList_h_EFF_PHASE_OUT_DATE());
			this.setList_h_PS_SPOIL(struct.getList_h_PS_SPOIL());
			this.setList_h_CONS_TYP(struct.getList_h_CONS_TYP());
			this.setList_h_PS_LT_FLG(struct.getList_h_PS_LT_FLG());
			this.setList_h_PS_FIXED_LT(struct.getList_h_PS_FIXED_LT());
			this.setList_h_PS_PROP_LT(struct.getList_h_PS_PROP_LT());
			this.setList_h_PS_PROP_LOT_SIZE(struct.getList_h_PS_PROP_LOT_SIZE());
			this.setList_h_PS_REF_NO(struct.getList_h_PS_REF_NO());
			this.setList_h_COST_UP_TYP(struct.getList_h_COST_UP_TYP());
			this.setList_h_MRP_EXP_TYP(struct.getList_h_MRP_EXP_TYP());
			this.setList_C_PARENT_ITEM_CD(struct.getList_C_PARENT_ITEM_CD());
			this.setList_C_COMP_ITEM_CD(struct.getList_C_COMP_ITEM_CD());
			this.setList_C_PS_EDITION(struct.getList_C_PS_EDITION());
			this.setList_C_PS_UNIT_DENOMINATOR(struct.getList_C_PS_UNIT_DENOMINATOR());
			this.setList_C_PS_UNIT_NUMERATOR(struct.getList_C_PS_UNIT_NUMERATOR());
			this.setList_C_EFF_PHASE_IN_DATE(struct.getList_C_EFF_PHASE_IN_DATE());
			this.setList_C_EFF_PHASE_OUT_DATE(struct.getList_C_EFF_PHASE_OUT_DATE());
			this.setList_C_PS_SPOIL(struct.getList_C_PS_SPOIL());
			this.setList_C_CONS_TYP(struct.getList_C_CONS_TYP());
			this.setList_C_PS_LT_FLG(struct.getList_C_PS_LT_FLG());
			this.setList_C_PS_FIXED_LT(struct.getList_C_PS_FIXED_LT());
			this.setList_C_PS_PROP_LT(struct.getList_C_PS_PROP_LT());
			this.setList_C_PS_PROP_LOT_SIZE(struct.getList_C_PS_PROP_LOT_SIZE());
			this.setList_C_PS_REF_NO(struct.getList_C_PS_REF_NO());
			this.setList_C_COST_UP_TYP(struct.getList_C_COST_UP_TYP());
			this.setList_C_MRP_EXP_TYP(struct.getList_C_MRP_EXP_TYP());
			this.setList_C_setPARENT_ITEM_CD(struct.getList_C_setPARENT_ITEM_CD());
			this.setList_C_setCOMP_ITEM_CD(struct.getList_C_setCOMP_ITEM_CD());
			this.setList_C_setPS_EDITION(struct.getList_C_setPS_EDITION());
			this.setList_readMAXSEQ_NO(struct.getList_readMAXSEQ_NO());
			this.setList_h_SEQ_NO(struct.getList_h_SEQ_NO());
			this.setList_h_ACCESS_TYP(struct.getList_h_ACCESS_TYP());
			this.setList_h_CMPLT_FLG(struct.getList_h_CMPLT_FLG());
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
	// �� 1 �ϐ������l�F i_rdoInsert


	final static String i_rdoInsert = null;

	// �� 2 �ϐ������l�F i_rdoUpdate


	final static String i_rdoUpdate = null;

	// �� 3 �ϐ������l�F i_rdoDelete


	final static String i_rdoDelete = null;

	// �� 4 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 5 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 6 �ϐ������l�F i_CANCEL_FILE


	final static String i_CANCEL_FILE = null;

	// �� 7 �ϐ������l�F i_JUDGMENT_TXT


	final static String i_JUDGMENT_TXT = null;

	// �� 8 �ϐ������l�F i_ERROR_IN


	final static String i_ERROR_IN = null;

	// �� 9 �ϐ������l�F i_ERR_CTR_NM


	final static String i_ERR_CTR_NM = null;

	// �� 10 �ϐ������l�F i_ERR_INFO


	final static String i_ERR_INFO = null;

	// �� 11 �ϐ������l�F i_DO_CHK


	final static String i_DO_CHK = null;

	// �� 12 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 13 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 14 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 15 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// �� 16 �ϐ������l�F i_readNAME


	final static String i_readNAME = null;

	// �� 17 �ϐ������l�F i_readVALUE


	final static String i_readVALUE = null;

	// �� 18 �ϐ������l�F i_setNAME


	final static String i_setNAME = null;

	// �� 19 �ϐ������l�F i_setVALUE


	final static String i_setVALUE = null;

	// �� 20 �ϐ������l�F i_readSYS_P_NAME


	final static String i_readSYS_P_NAME = null;

	// �� 21 �ϐ������l�F i_readSYS_P_VALUE


	final static String i_readSYS_P_VALUE = null;

	// �� 22 �ϐ������l�F i_setSYS_P_NAME


	final static String i_setSYS_P_NAME = null;

	// �� 23 �ϐ������l�F i_readPARENT_ITEM_CD


	final static String i_readPARENT_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_readCOMP_ITEM_CD


	final static String i_readCOMP_ITEM_CD = null;

	// �� 25 �ϐ������l�F i_readPS_EDITION


	final static String i_readPS_EDITION = null;

	// �� 26 �ϐ������l�F i_setPARENT_ITEM_CD


	final static String i_setPARENT_ITEM_CD = null;

	// �� 27 �ϐ������l�F i_setCOMP_ITEM_CD


	final static String i_setCOMP_ITEM_CD = null;

	// �� 28 �ϐ������l�F i_setPS_EDITION


	final static String i_setPS_EDITION = null;

	// �� 29 �ϐ������l�F i_readM_ITEM_ITEM_CD


	final static String i_readM_ITEM_ITEM_CD = null;

	// �� 30 �ϐ������l�F i_setM_ITEM_ITEM_CD


	final static String i_setM_ITEM_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_h_PARENT_ITEM_CD


	final static String i_h_PARENT_ITEM_CD = null;

	// �� 32 �ϐ������l�F i_h_COMP_ITEM_CD


	final static String i_h_COMP_ITEM_CD = null;

	// �� 33 �ϐ������l�F i_h_PS_EDITION


	final static String i_h_PS_EDITION = null;

	// �� 34 �ϐ������l�F i_h_PS_UNIT_DENOMINATOR


	final static String i_h_PS_UNIT_DENOMINATOR = null;

	// �� 35 �ϐ������l�F i_h_PS_UNIT_NUMERATOR


	final static String i_h_PS_UNIT_NUMERATOR = null;

	// �� 36 �ϐ������l�F i_h_EFF_PHASE_IN_DATE


	final static String i_h_EFF_PHASE_IN_DATE = null;

	// �� 37 �ϐ������l�F i_h_EFF_PHASE_OUT_DATE


	final static String i_h_EFF_PHASE_OUT_DATE = null;

	// �� 38 �ϐ������l�F i_h_PS_SPOIL


	final static String i_h_PS_SPOIL = null;

	// �� 39 �ϐ������l�F i_h_CONS_TYP


	final static String i_h_CONS_TYP = null;

	// �� 40 �ϐ������l�F i_h_PS_LT_FLG


	final static String i_h_PS_LT_FLG = null;

	// �� 41 �ϐ������l�F i_h_PS_FIXED_LT


	final static String i_h_PS_FIXED_LT = null;

	// �� 42 �ϐ������l�F i_h_PS_PROP_LT


	final static String i_h_PS_PROP_LT = null;

	// �� 43 �ϐ������l�F i_h_PS_PROP_LOT_SIZE


	final static String i_h_PS_PROP_LOT_SIZE = null;

	// �� 44 �ϐ������l�F i_h_PS_REF_NO


	final static String i_h_PS_REF_NO = null;

	// �� 45 �ϐ������l�F i_h_COST_UP_TYP


	final static String i_h_COST_UP_TYP = null;

	// �� 46 �ϐ������l�F i_h_MRP_EXP_TYP


	final static String i_h_MRP_EXP_TYP = null;

	// �� 47 �ϐ������l�F i_C_PARENT_ITEM_CD


	final static String i_C_PARENT_ITEM_CD = null;

	// �� 48 �ϐ������l�F i_C_COMP_ITEM_CD


	final static String i_C_COMP_ITEM_CD = null;

	// �� 49 �ϐ������l�F i_C_PS_EDITION


	final static String i_C_PS_EDITION = null;

	// �� 50 �ϐ������l�F i_C_PS_UNIT_DENOMINATOR


	final static String i_C_PS_UNIT_DENOMINATOR = null;

	// �� 51 �ϐ������l�F i_C_PS_UNIT_NUMERATOR


	final static String i_C_PS_UNIT_NUMERATOR = null;

	// �� 52 �ϐ������l�F i_C_EFF_PHASE_IN_DATE


	final static String i_C_EFF_PHASE_IN_DATE = null;

	// �� 53 �ϐ������l�F i_C_EFF_PHASE_OUT_DATE


	final static String i_C_EFF_PHASE_OUT_DATE = null;

	// �� 54 �ϐ������l�F i_C_PS_SPOIL


	final static String i_C_PS_SPOIL = null;

	// �� 55 �ϐ������l�F i_C_CONS_TYP


	final static String i_C_CONS_TYP = null;

	// �� 56 �ϐ������l�F i_C_PS_LT_FLG


	final static String i_C_PS_LT_FLG = null;

	// �� 57 �ϐ������l�F i_C_PS_FIXED_LT


	final static String i_C_PS_FIXED_LT = null;

	// �� 58 �ϐ������l�F i_C_PS_PROP_LT


	final static String i_C_PS_PROP_LT = null;

	// �� 59 �ϐ������l�F i_C_PS_PROP_LOT_SIZE


	final static String i_C_PS_PROP_LOT_SIZE = null;

	// �� 60 �ϐ������l�F i_C_PS_REF_NO


	final static String i_C_PS_REF_NO = null;

	// �� 61 �ϐ������l�F i_C_COST_UP_TYP


	final static String i_C_COST_UP_TYP = null;

	// �� 62 �ϐ������l�F i_C_MRP_EXP_TYP


	final static String i_C_MRP_EXP_TYP = null;

	// �� 63 �ϐ������l�F i_C_setPARENT_ITEM_CD


	final static String i_C_setPARENT_ITEM_CD = null;

	// �� 64 �ϐ������l�F i_C_setCOMP_ITEM_CD


	final static String i_C_setCOMP_ITEM_CD = null;

	// �� 65 �ϐ������l�F i_C_setPS_EDITION


	final static String i_C_setPS_EDITION = null;

	// �� 66 �ϐ������l�F i_readMAXSEQ_NO


	final static String i_readMAXSEQ_NO = null;

	// �� 67 �ϐ������l�F i_h_SEQ_NO


	final static String i_h_SEQ_NO = null;

	// �� 68 �ϐ������l�F i_h_ACCESS_TYP


	final static String i_h_ACCESS_TYP = null;

	// �� 69 �ϐ������l�F i_h_CMPLT_FLG


	final static String i_h_CMPLT_FLG = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_readNAME
	final static String i_readNAME = null;
	// �� 2 �ϐ������l�F i_readVALUE
	final static String i_readVALUE = null;
	// �� 3 �ϐ������l�F i_setNAME
	final static String i_setNAME = null;
	// �� 4 �ϐ������l�F i_setVALUE
	final static String i_setVALUE = null;
	// �� 5 �ϐ������l�F i_readSYS_P_NAME
	final static String i_readSYS_P_NAME = null;
	// �� 6 �ϐ������l�F i_readSYS_P_VALUE
	final static String i_readSYS_P_VALUE = null;
	// �� 7 �ϐ������l�F i_setSYS_P_NAME
	final static String i_setSYS_P_NAME = null;
	// �� 8 �ϐ������l�F i_readPARENT_ITEM_CD
	final static String i_readPARENT_ITEM_CD = null;
	// �� 9 �ϐ������l�F i_readCOMP_ITEM_CD
	final static String i_readCOMP_ITEM_CD = null;
	// �� 10 �ϐ������l�F i_readPS_EDITION
	final static String i_readPS_EDITION = null;
	// �� 11 �ϐ������l�F i_setPARENT_ITEM_CD
	final static String i_setPARENT_ITEM_CD = null;
	// �� 12 �ϐ������l�F i_setCOMP_ITEM_CD
	final static String i_setCOMP_ITEM_CD = null;
	// �� 13 �ϐ������l�F i_setPS_EDITION
	final static String i_setPS_EDITION = null;
	// �� 14 �ϐ������l�F i_readM_ITEM_ITEM_CD
	final static String i_readM_ITEM_ITEM_CD = null;
	// �� 15 �ϐ������l�F i_setM_ITEM_ITEM_CD
	final static String i_setM_ITEM_ITEM_CD = null;
	// �� 16 �ϐ������l�F i_h_PARENT_ITEM_CD
	final static String i_h_PARENT_ITEM_CD = null;
	// �� 17 �ϐ������l�F i_h_COMP_ITEM_CD
	final static String i_h_COMP_ITEM_CD = null;
	// �� 18 �ϐ������l�F i_h_PS_EDITION
	final static String i_h_PS_EDITION = null;
	// �� 19 �ϐ������l�F i_h_PS_UNIT_DENOMINATOR
	final static String i_h_PS_UNIT_DENOMINATOR = null;
	// �� 20 �ϐ������l�F i_h_PS_UNIT_NUMERATOR
	final static String i_h_PS_UNIT_NUMERATOR = null;
	// �� 21 �ϐ������l�F i_h_EFF_PHASE_IN_DATE
	final static String i_h_EFF_PHASE_IN_DATE = null;
	// �� 22 �ϐ������l�F i_h_EFF_PHASE_OUT_DATE
	final static String i_h_EFF_PHASE_OUT_DATE = null;
	// �� 23 �ϐ������l�F i_h_PS_SPOIL
	final static String i_h_PS_SPOIL = null;
	// �� 24 �ϐ������l�F i_h_CONS_TYP
	final static String i_h_CONS_TYP = null;
	// �� 25 �ϐ������l�F i_h_PS_LT_FLG
	final static String i_h_PS_LT_FLG = null;
	// �� 26 �ϐ������l�F i_h_PS_FIXED_LT
	final static String i_h_PS_FIXED_LT = null;
	// �� 27 �ϐ������l�F i_h_PS_PROP_LT
	final static String i_h_PS_PROP_LT = null;
	// �� 28 �ϐ������l�F i_h_PS_PROP_LOT_SIZE
	final static String i_h_PS_PROP_LOT_SIZE = null;
	// �� 29 �ϐ������l�F i_h_PS_REF_NO
	final static String i_h_PS_REF_NO = null;
	// �� 30 �ϐ������l�F i_h_COST_UP_TYP
	final static String i_h_COST_UP_TYP = null;
	// �� 31 �ϐ������l�F i_h_MRP_EXP_TYP
	final static String i_h_MRP_EXP_TYP = null;
	// �� 32 �ϐ������l�F i_C_PARENT_ITEM_CD
	final static String i_C_PARENT_ITEM_CD = null;
	// �� 33 �ϐ������l�F i_C_COMP_ITEM_CD
	final static String i_C_COMP_ITEM_CD = null;
	// �� 34 �ϐ������l�F i_C_PS_EDITION
	final static String i_C_PS_EDITION = null;
	// �� 35 �ϐ������l�F i_C_PS_UNIT_DENOMINATOR
	final static String i_C_PS_UNIT_DENOMINATOR = null;
	// �� 36 �ϐ������l�F i_C_PS_UNIT_NUMERATOR
	final static String i_C_PS_UNIT_NUMERATOR = null;
	// �� 37 �ϐ������l�F i_C_EFF_PHASE_IN_DATE
	final static String i_C_EFF_PHASE_IN_DATE = null;
	// �� 38 �ϐ������l�F i_C_EFF_PHASE_OUT_DATE
	final static String i_C_EFF_PHASE_OUT_DATE = null;
	// �� 39 �ϐ������l�F i_C_PS_SPOIL
	final static String i_C_PS_SPOIL = null;
	// �� 40 �ϐ������l�F i_C_CONS_TYP
	final static String i_C_CONS_TYP = null;
	// �� 41 �ϐ������l�F i_C_PS_LT_FLG
	final static String i_C_PS_LT_FLG = null;
	// �� 42 �ϐ������l�F i_C_PS_FIXED_LT
	final static String i_C_PS_FIXED_LT = null;
	// �� 43 �ϐ������l�F i_C_PS_PROP_LT
	final static String i_C_PS_PROP_LT = null;
	// �� 44 �ϐ������l�F i_C_PS_PROP_LOT_SIZE
	final static String i_C_PS_PROP_LOT_SIZE = null;
	// �� 45 �ϐ������l�F i_C_PS_REF_NO
	final static String i_C_PS_REF_NO = null;
	// �� 46 �ϐ������l�F i_C_COST_UP_TYP
	final static String i_C_COST_UP_TYP = null;
	// �� 47 �ϐ������l�F i_C_MRP_EXP_TYP
	final static String i_C_MRP_EXP_TYP = null;
	// �� 48 �ϐ������l�F i_C_setPARENT_ITEM_CD
	final static String i_C_setPARENT_ITEM_CD = null;
	// �� 49 �ϐ������l�F i_C_setCOMP_ITEM_CD
	final static String i_C_setCOMP_ITEM_CD = null;
	// �� 50 �ϐ������l�F i_C_setPS_EDITION
	final static String i_C_setPS_EDITION = null;
	// �� 51 �ϐ������l�F i_rdoInsert
	final static String i_rdoInsert = null;
	// �� 53 �ϐ������l�F i_rdoUpdate
	final static String i_rdoUpdate = null;
	// �� 54 �ϐ������l�F i_rdoDelete
	final static String i_rdoDelete = null;
	// �� 56 �ϐ������l�F i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;
	// �� 57 �ϐ������l�F i_FileName
	final static String i_FileName = null;
	// �� 78 �ϐ������l�F i_CANCEL_FILE
	final static String i_CANCEL_FILE = null;
	// �� 79 �ϐ������l�F i_JUDGMENT_TXT
	final static String i_JUDGMENT_TXT = null;
	// �� 80 �ϐ������l�F i_w_COLUMN_FLG
	final static String i_w_COLUMN_FLG = null;
	// �� 81 �ϐ������l�F i_DO_CHK
	final static String i_DO_CHK = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{
		clear();
		m_readNAME = i_readNAME;
		m_readVALUE = i_readVALUE;
		m_setNAME = i_setNAME;
		m_setVALUE = i_setVALUE;
		m_readSYS_P_NAME = i_readSYS_P_NAME;
		m_readSYS_P_VALUE = i_readSYS_P_VALUE;
		m_setSYS_P_NAME = i_setSYS_P_NAME;
		m_readPARENT_ITEM_CD = i_readPARENT_ITEM_CD;
		m_readCOMP_ITEM_CD = i_readCOMP_ITEM_CD;
		m_readPS_EDITION = i_readPS_EDITION;
		m_setPARENT_ITEM_CD = i_setPARENT_ITEM_CD;
		m_setCOMP_ITEM_CD = i_setCOMP_ITEM_CD;
		m_setPS_EDITION = i_setPS_EDITION;
		m_readM_ITEM_ITEM_CD = i_readM_ITEM_ITEM_CD;
		m_setM_ITEM_ITEM_CD = i_setM_ITEM_ITEM_CD;
		m_h_PARENT_ITEM_CD = i_h_PARENT_ITEM_CD;
		m_h_COMP_ITEM_CD = i_h_COMP_ITEM_CD;
		m_h_PS_EDITION = i_h_PS_EDITION;
		m_h_PS_UNIT_DENOMINATOR = i_h_PS_UNIT_DENOMINATOR;
		m_h_PS_UNIT_NUMERATOR = i_h_PS_UNIT_NUMERATOR;
		m_h_EFF_PHASE_IN_DATE = i_h_EFF_PHASE_IN_DATE;
		m_h_EFF_PHASE_OUT_DATE = i_h_EFF_PHASE_OUT_DATE;
		m_h_PS_SPOIL = i_h_PS_SPOIL;
		m_h_CONS_TYP = i_h_CONS_TYP;
		m_h_PS_LT_FLG = i_h_PS_LT_FLG;
		m_h_PS_FIXED_LT = i_h_PS_FIXED_LT;
		m_h_PS_PROP_LT = i_h_PS_PROP_LT;
		m_h_PS_PROP_LOT_SIZE = i_h_PS_PROP_LOT_SIZE;
		m_h_PS_REF_NO = i_h_PS_REF_NO;
		m_h_COST_UP_TYP = i_h_COST_UP_TYP;
		m_h_MRP_EXP_TYP = i_h_MRP_EXP_TYP;
		m_C_PARENT_ITEM_CD = i_C_PARENT_ITEM_CD;
		m_C_COMP_ITEM_CD = i_C_COMP_ITEM_CD;
		m_C_PS_EDITION = i_C_PS_EDITION;
		m_C_PS_UNIT_DENOMINATOR = i_C_PS_UNIT_DENOMINATOR;
		m_C_PS_UNIT_NUMERATOR = i_C_PS_UNIT_NUMERATOR;
		m_C_EFF_PHASE_IN_DATE = i_C_EFF_PHASE_IN_DATE;
		m_C_EFF_PHASE_OUT_DATE = i_C_EFF_PHASE_OUT_DATE;
		m_C_PS_SPOIL = i_C_PS_SPOIL;
		m_C_CONS_TYP = i_C_CONS_TYP;
		m_C_PS_LT_FLG = i_C_PS_LT_FLG;
		m_C_PS_FIXED_LT = i_C_PS_FIXED_LT;
		m_C_PS_PROP_LT = i_C_PS_PROP_LT;
		m_C_PS_PROP_LOT_SIZE = i_C_PS_PROP_LOT_SIZE;
		m_C_PS_REF_NO = i_C_PS_REF_NO;
		m_C_COST_UP_TYP = i_C_COST_UP_TYP;
		m_C_MRP_EXP_TYP = i_C_MRP_EXP_TYP;
		m_C_setPARENT_ITEM_CD = i_C_setPARENT_ITEM_CD;
		m_C_setCOMP_ITEM_CD = i_C_setCOMP_ITEM_CD;
		m_C_setPS_EDITION = i_C_setPS_EDITION;
		m_rdoInsert = i_rdoInsert;
		m_rdoUpdate = i_rdoUpdate;
		m_rdoDelete = i_rdoDelete;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_FileName = i_FileName;
		m_CANCEL_FILE = i_CANCEL_FILE;
		m_JUDGMENT_TXT = i_JUDGMENT_TXT;
		m_w_COLUMN_FLG = i_w_COLUMN_FLG;
		m_DO_CHK = i_DO_CHK;
	}
	/**
	 * �������ϐ��̃R�s�[
	 * @param s �R�s�[��
	 */
	public void copy(AA0160010Struct s)
	{
		clear();

		//if(s.m_readNAME != null) m_readNAME = new String(s.m_readNAME);

		if(s.m_readNAME != null) m_readNAME = new String(s.m_readNAME);
		if(s.m_readVALUE != null) m_readVALUE = new String(s.m_readVALUE);

		if(s.m_setNAME != null) m_setNAME = new String(s.m_setNAME);
		if(s.m_setVALUE != null) m_setVALUE = new String(s.m_setVALUE);
		if(s.m_readSYS_P_NAME != null) m_readSYS_P_NAME = new String(s.m_readSYS_P_NAME);
		if(s.m_readSYS_P_VALUE != null) m_readSYS_P_VALUE = new String(s.m_readSYS_P_VALUE);
		if(s.m_setSYS_P_NAME != null) m_setSYS_P_NAME = new String(s.m_setSYS_P_NAME);
		if(s.m_readPARENT_ITEM_CD != null) m_readPARENT_ITEM_CD = new String(s.m_readPARENT_ITEM_CD);
		if(s.m_readCOMP_ITEM_CD != null) m_readCOMP_ITEM_CD = new String(s.m_readCOMP_ITEM_CD);
		if(s.m_readPS_EDITION != null) m_readPS_EDITION = new String(s.m_readPS_EDITION);
		if(s.m_setPARENT_ITEM_CD != null) m_setPARENT_ITEM_CD = new String(s.m_setPARENT_ITEM_CD);
		if(s.m_setCOMP_ITEM_CD != null) m_setCOMP_ITEM_CD = new String(s.m_setCOMP_ITEM_CD);
		if(s.m_setPS_EDITION != null) m_setPS_EDITION = new String(s.m_setPS_EDITION);
		if(s.m_readM_ITEM_ITEM_CD != null) m_readM_ITEM_ITEM_CD = new String(s.m_readM_ITEM_ITEM_CD);
		if(s.m_setM_ITEM_ITEM_CD != null) m_setM_ITEM_ITEM_CD = new String(s.m_setM_ITEM_ITEM_CD);
		if(s.m_h_PARENT_ITEM_CD != null) m_h_PARENT_ITEM_CD = new String(s.m_h_PARENT_ITEM_CD);
		if(s.m_h_COMP_ITEM_CD != null) m_h_COMP_ITEM_CD = new String(s.m_h_COMP_ITEM_CD);
		if(s.m_h_PS_EDITION != null) m_h_PS_EDITION = new String(s.m_h_PS_EDITION);
		if(s.m_h_PS_UNIT_DENOMINATOR != null) m_h_PS_UNIT_DENOMINATOR = new String(s.m_h_PS_UNIT_DENOMINATOR);
		if(s.m_h_PS_UNIT_NUMERATOR != null) m_h_PS_UNIT_NUMERATOR = new String(s.m_h_PS_UNIT_NUMERATOR);
		if(s.m_h_EFF_PHASE_IN_DATE != null) m_h_EFF_PHASE_IN_DATE = new String(s.m_h_EFF_PHASE_IN_DATE);
		if(s.m_h_EFF_PHASE_OUT_DATE != null) m_h_EFF_PHASE_OUT_DATE = new String(s.m_h_EFF_PHASE_OUT_DATE);
		if(s.m_h_PS_SPOIL != null) m_h_PS_SPOIL = new String(s.m_h_PS_SPOIL);
		if(s.m_h_CONS_TYP != null) m_h_CONS_TYP = new String(s.m_h_CONS_TYP);
		if(s.m_h_PS_LT_FLG != null) m_h_PS_LT_FLG = new String(s.m_h_PS_LT_FLG);
		if(s.m_h_PS_FIXED_LT != null) m_h_PS_FIXED_LT = new String(s.m_h_PS_FIXED_LT);
		if(s.m_h_PS_PROP_LT != null) m_h_PS_PROP_LT = new String(s.m_h_PS_PROP_LT);
		if(s.m_h_PS_PROP_LOT_SIZE != null) m_h_PS_PROP_LOT_SIZE = new String(s.m_h_PS_PROP_LOT_SIZE);
		if(s.m_h_PS_REF_NO != null) m_h_PS_REF_NO = new String(s.m_h_PS_REF_NO);
		if(s.m_h_COST_UP_TYP != null) m_h_COST_UP_TYP = new String(s.m_h_COST_UP_TYP);
		if(s.m_h_MRP_EXP_TYP != null) m_h_MRP_EXP_TYP = new String(s.m_h_MRP_EXP_TYP);
		if(s.m_C_PARENT_ITEM_CD != null) m_C_PARENT_ITEM_CD = new String(s.m_C_PARENT_ITEM_CD);
		if(s.m_C_COMP_ITEM_CD != null) m_C_COMP_ITEM_CD = new String(s.m_C_COMP_ITEM_CD);
		if(s.m_C_PS_EDITION != null) m_C_PS_EDITION = new String(s.m_C_PS_EDITION);
		if(s.m_C_PS_UNIT_DENOMINATOR != null) m_C_PS_UNIT_DENOMINATOR = new String(s.m_C_PS_UNIT_DENOMINATOR);
		if(s.m_C_PS_UNIT_NUMERATOR != null) m_C_PS_UNIT_NUMERATOR = new String(s.m_C_PS_UNIT_NUMERATOR);
		if(s.m_C_EFF_PHASE_IN_DATE != null) m_C_EFF_PHASE_IN_DATE = new String(s.m_C_EFF_PHASE_IN_DATE);
		if(s.m_C_EFF_PHASE_OUT_DATE != null) m_C_EFF_PHASE_OUT_DATE = new String(s.m_C_EFF_PHASE_OUT_DATE);
		if(s.m_C_PS_SPOIL != null) m_C_PS_SPOIL = new String(s.m_C_PS_SPOIL);
		if(s.m_C_CONS_TYP != null) m_C_CONS_TYP = new String(s.m_C_CONS_TYP);
		if(s.m_C_PS_LT_FLG != null) m_C_PS_LT_FLG = new String(s.m_C_PS_LT_FLG);
		if(s.m_C_PS_FIXED_LT != null) m_C_PS_FIXED_LT = new String(s.m_C_PS_FIXED_LT);
		if(s.m_C_PS_PROP_LT != null) m_C_PS_PROP_LT = new String(s.m_C_PS_PROP_LT);
		if(s.m_C_PS_PROP_LOT_SIZE != null) m_C_PS_PROP_LOT_SIZE = new String(s.m_C_PS_PROP_LOT_SIZE);
		if(s.m_C_PS_REF_NO != null) m_C_PS_REF_NO = new String(s.m_C_PS_REF_NO);


		if(s.m_C_COST_UP_TYP != null) m_C_COST_UP_TYP = new String(s.m_C_COST_UP_TYP);
		if(s.m_C_MRP_EXP_TYP != null) m_C_MRP_EXP_TYP = new String(s.m_C_MRP_EXP_TYP);
		if(s.m_C_setPARENT_ITEM_CD != null) m_C_setPARENT_ITEM_CD = new String(s.m_C_setPARENT_ITEM_CD);
		if(s.m_C_setCOMP_ITEM_CD != null) m_C_setCOMP_ITEM_CD = new String(s.m_C_setCOMP_ITEM_CD);
		if(s.m_C_setPS_EDITION != null) m_C_setPS_EDITION = new String(s.m_C_setPS_EDITION);
		if(s.m_rdoInsert != null) m_rdoInsert = new String(s.m_rdoInsert);
		if(s.m_rdoUpdate != null) m_rdoUpdate = new String(s.m_rdoUpdate);
		if(s.m_rdoDelete != null) m_rdoDelete = new String(s.m_rdoDelete);
		if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
		if(s.m_FileName != null) m_FileName = new String(s.m_FileName);
		if(s.m_CANCEL_FILE != null) m_CANCEL_FILE = new String(s.m_CANCEL_FILE);
		if(s.m_JUDGMENT_TXT != null) m_JUDGMENT_TXT = new String(s.m_JUDGMENT_TXT);
		if(s.m_w_COLUMN_FLG != null) m_w_COLUMN_FLG = new String(s.m_w_COLUMN_FLG);
		if(s.m_DO_CHK != null) m_DO_CHK = new String(s.m_DO_CHK);
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
