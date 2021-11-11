/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0210/src/com/nec/jp/orteus/metamorBase/AA0210/AA0210010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0210;

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
 * CLASS     : AA0210010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2015/10/22 07:16:00 $
 *
 */
//}}user_implement_code_header

public class AA0210010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoInsert */
	public String m_rdoInsert = null;
	/** �� 2 �ϐ��F m_rdoUpdate */
	public String m_rdoUpdate = null;
	/** �� 3 �ϐ��F m_rdoDelete */
	public String m_rdoDelete = null;
	/** �� 4 �ϐ��F m_DO_CHK */
	public String m_DO_CHK = null;
	/** �� 5 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 6 �ϐ��F m_CANCEL_FILE */
	public String m_CANCEL_FILE = null;
	/** �� 7 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 8 �ϐ��F m_l_ERR_ADR */
	public String m_l_ERR_ADR = null;
	/** �� 9 �ϐ��F m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** �� 10 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 11 �ϐ��F m_l_ERROR_FIELD_NAME */
	public String m_l_ERROR_FIELD_NAME = null;
	/** �� 12 �ϐ��F m_l_ERR_TEXT */
	public String m_l_ERR_TEXT = null;
	/** �� 13 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** �� 14 �ϐ��F m_w_COLUMN */
	public String m_w_COLUMN = null;
	/** �� 15 �ϐ��F m_l_VEND_NAME */
	public String m_l_VEND_NAME = null;
	/** �� 16 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 17 �ϐ��F m_l_VEND_KNAME */
	public String m_l_VEND_KNAME = null;
	/** �� 18 �ϐ��F m_l_ZIP_CD */
	public String m_l_ZIP_CD = null;
	/** �� 19 �ϐ��F m_l_ADDRESS_1 */
	public String m_l_ADDRESS_1 = null;
	/** �� 20 �ϐ��F m_l_ADDRESS_2 */
	public String m_l_ADDRESS_2 = null;
	/** �� 21 �ϐ��F m_l_ADDRESS_K_1 */
	public String m_l_ADDRESS_K_1 = null;
	/** �� 22 �ϐ��F m_l_ADDRESS_K_2 */
	public String m_l_ADDRESS_K_2 = null;
	/** �� 23 �ϐ��F m_l_TEL */
	public String m_l_TEL = null;
	/** �� 24 �ϐ��F m_l_FAX */
	public String m_l_FAX = null;
	/** �� 25 �ϐ��F m_l_EMAIL */
	public String m_l_EMAIL = null;
	/** �� 26 �ϐ��F m_l_VEND_ORG */
	public String m_l_VEND_ORG = null;
	/** �� 27 �ϐ��F m_l_VEND_PERSON */
	public String m_l_VEND_PERSON = null;
	/** �� 28 �ϐ��F m_l_OWN_ORG_CD */
	public String m_l_OWN_ORG_CD = null;
	/** �� 29 �ϐ��F m_l_OWN_ORG_NAME */
	public String m_l_OWN_ORG_NAME = null;
	/** �� 30 �ϐ��F m_l_OWN_PERSON_CD */
	public String m_l_OWN_PERSON_CD = null;
	/** �� 31 �ϐ��F m_l_OWN_PERSON_NAME */
	public String m_l_OWN_PERSON_NAME = null;
	/** �� 32 �ϐ��F m_l_ROUND_TYP */
	public String m_l_ROUND_TYP = null;
	/** �� 33 �ϐ��F m_l_TAX_CD */
	public String m_l_TAX_CD = null;
	/** �� 34 �ϐ��F m_l_TAX_APPLY_TYP */
	public String m_l_TAX_APPLY_TYP = null;
	/** �� 35 �ϐ��F m_l_TAX_CALC_TYP */
	public String m_l_TAX_CALC_TYP = null;
	/** �� 36 �ϐ��F m_l_INSPC_ACPT_APP_TYP */
	public String m_l_INSPC_ACPT_APP_TYP = null;
	/** �� 37 �ϐ��F m_l_ODR_FORM_FLG */
	public String m_l_ODR_FORM_FLG = null;
	/** �� 38 �ϐ��F m_l_ODR_EDI_FLG */
	public String m_l_ODR_EDI_FLG = null;
	/** �� 39 �ϐ��F m_l_VEND_REM */
	public String m_l_VEND_REM = null;
	/** �� 40 �ϐ��F m_l_CUR_CD */
	public String m_l_CUR_CD = null;
	/** �� 41 �ϐ��F m_l_EXCH_TYP */
	public String m_l_EXCH_TYP = null;
	/** �� 42 �ϐ��F m_l_IMPORT_TRN_TYP */
	public String m_l_IMPORT_TRN_TYP = null;
	/** �� 43 �ϐ��F m_l_UNIT_COST_RETROACTION_FLG */
	public String m_l_UNIT_COST_RETROACTION_FLG = null;
	/** �� 44 �ϐ��F m_l_COMPANY_CD */
	public String m_l_COMPANY_CD = null;
	/** �� 45 �ϐ��F m_OUT_VEND_CD */
	public String m_OUT_VEND_CD = null;
	/** �� 46 �ϐ��F m_l_HOME_CUR_CD */
	public String m_l_HOME_CUR_CD = null;
	/** �� 47 �ϐ��F m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** �� 48 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoInsert */
	public List l_rdoInsert = null;

	/** �� 2 List�ϐ��F l_rdoUpdate */
	public List l_rdoUpdate = null;

	/** �� 3 List�ϐ��F l_rdoDelete */
	public List l_rdoDelete = null;

	/** �� 4 List�ϐ��F l_DO_CHK */
	public List l_DO_CHK = null;

	/** �� 5 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 6 List�ϐ��F l_CANCEL_FILE */
	public List l_CANCEL_FILE = null;

	/** �� 7 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 8 List�ϐ��F l_l_ERR_ADR */
	public List l_l_ERR_ADR = null;

	/** �� 9 List�ϐ��F l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** �� 10 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 11 List�ϐ��F l_l_ERROR_FIELD_NAME */
	public List l_l_ERROR_FIELD_NAME = null;

	/** �� 12 List�ϐ��F l_l_ERR_TEXT */
	public List l_l_ERR_TEXT = null;

	/** �� 13 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** �� 14 List�ϐ��F l_w_COLUMN */
	public List l_w_COLUMN = null;

	/** �� 15 List�ϐ��F l_l_VEND_NAME */
	public List l_l_VEND_NAME = null;

	/** �� 16 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 17 List�ϐ��F l_l_VEND_KNAME */
	public List l_l_VEND_KNAME = null;

	/** �� 18 List�ϐ��F l_l_ZIP_CD */
	public List l_l_ZIP_CD = null;

	/** �� 19 List�ϐ��F l_l_ADDRESS_1 */
	public List l_l_ADDRESS_1 = null;

	/** �� 20 List�ϐ��F l_l_ADDRESS_2 */
	public List l_l_ADDRESS_2 = null;

	/** �� 21 List�ϐ��F l_l_ADDRESS_K_1 */
	public List l_l_ADDRESS_K_1 = null;

	/** �� 22 List�ϐ��F l_l_ADDRESS_K_2 */
	public List l_l_ADDRESS_K_2 = null;

	/** �� 23 List�ϐ��F l_l_TEL */
	public List l_l_TEL = null;

	/** �� 24 List�ϐ��F l_l_FAX */
	public List l_l_FAX = null;

	/** �� 25 List�ϐ��F l_l_EMAIL */
	public List l_l_EMAIL = null;

	/** �� 26 List�ϐ��F l_l_VEND_ORG */
	public List l_l_VEND_ORG = null;

	/** �� 27 List�ϐ��F l_l_VEND_PERSON */
	public List l_l_VEND_PERSON = null;

	/** �� 28 List�ϐ��F l_l_OWN_ORG_CD */
	public List l_l_OWN_ORG_CD = null;

	/** �� 29 List�ϐ��F l_l_OWN_ORG_NAME */
	public List l_l_OWN_ORG_NAME = null;

	/** �� 30 List�ϐ��F l_l_OWN_PERSON_CD */
	public List l_l_OWN_PERSON_CD = null;

	/** �� 31 List�ϐ��F l_l_OWN_PERSON_NAME */
	public List l_l_OWN_PERSON_NAME = null;

	/** �� 32 List�ϐ��F l_l_ROUND_TYP */
	public List l_l_ROUND_TYP = null;

	/** �� 33 List�ϐ��F l_l_TAX_CD */
	public List l_l_TAX_CD = null;

	/** �� 34 List�ϐ��F l_l_TAX_APPLY_TYP */
	public List l_l_TAX_APPLY_TYP = null;

	/** �� 35 List�ϐ��F l_l_TAX_CALC_TYP */
	public List l_l_TAX_CALC_TYP = null;

	/** �� 36 List�ϐ��F l_l_INSPC_ACPT_APP_TYP */
	public List l_l_INSPC_ACPT_APP_TYP = null;

	/** �� 37 List�ϐ��F l_l_ODR_FORM_FLG */
	public List l_l_ODR_FORM_FLG = null;

	/** �� 38 List�ϐ��F l_l_ODR_EDI_FLG */
	public List l_l_ODR_EDI_FLG = null;

	/** �� 39 List�ϐ��F l_l_VEND_REM */
	public List l_l_VEND_REM = null;

	/** �� 40 List�ϐ��F l_l_CUR_CD */
	public List l_l_CUR_CD = null;

	/** �� 41 List�ϐ��F l_l_EXCH_TYP */
	public List l_l_EXCH_TYP = null;

	/** �� 42 List�ϐ��F l_l_IMPORT_TRN_TYP */
	public List l_l_IMPORT_TRN_TYP = null;

	/** �� 43 List�ϐ��F l_l_UNIT_COST_RETROACTION_FLG */
	public List l_l_UNIT_COST_RETROACTION_FLG = null;

	/** �� 44 List�ϐ��F l_l_COMPANY_CD */
	public List l_l_COMPANY_CD = null;

	/** �� 45 List�ϐ��F l_OUT_VEND_CD */
	public List l_OUT_VEND_CD = null;

	/** �� 46 List�ϐ��F l_l_HOME_CUR_CD */
	public List l_l_HOME_CUR_CD = null;

	/** �� 47 List�ϐ��F l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** �� 48 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoInsert() { return m_rdoInsert; }
	public String getrdoUpdate() { return m_rdoUpdate; }
	public String getrdoDelete() { return m_rdoDelete; }
	public String getDO_CHK() { return m_DO_CHK; }
	public String getFileName() { return m_FileName; }
	public String getCANCEL_FILE() { return m_CANCEL_FILE; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERR_ADR() { return m_l_ERR_ADR; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_ERROR_FIELD_NAME() { return m_l_ERROR_FIELD_NAME; }
	public String getl_ERR_TEXT() { return m_l_ERR_TEXT; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getw_COLUMN() { return m_w_COLUMN; }
	public String getl_VEND_NAME() { return m_l_VEND_NAME; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_VEND_KNAME() { return m_l_VEND_KNAME; }
	public String getl_ZIP_CD() { return m_l_ZIP_CD; }
	public String getl_ADDRESS_1() { return m_l_ADDRESS_1; }
	public String getl_ADDRESS_2() { return m_l_ADDRESS_2; }
	public String getl_ADDRESS_K_1() { return m_l_ADDRESS_K_1; }
	public String getl_ADDRESS_K_2() { return m_l_ADDRESS_K_2; }
	public String getl_TEL() { return m_l_TEL; }
	public String getl_FAX() { return m_l_FAX; }
	public String getl_EMAIL() { return m_l_EMAIL; }
	public String getl_VEND_ORG() { return m_l_VEND_ORG; }
	public String getl_VEND_PERSON() { return m_l_VEND_PERSON; }
	public String getl_OWN_ORG_CD() { return m_l_OWN_ORG_CD; }
	public String getl_OWN_ORG_NAME() { return m_l_OWN_ORG_NAME; }
	public String getl_OWN_PERSON_CD() { return m_l_OWN_PERSON_CD; }
	public String getl_OWN_PERSON_NAME() { return m_l_OWN_PERSON_NAME; }
	public String getl_ROUND_TYP() { return m_l_ROUND_TYP; }
	public String getl_TAX_CD() { return m_l_TAX_CD; }
	public String getl_TAX_APPLY_TYP() { return m_l_TAX_APPLY_TYP; }
	public String getl_TAX_CALC_TYP() { return m_l_TAX_CALC_TYP; }
	public String getl_INSPC_ACPT_APP_TYP() { return m_l_INSPC_ACPT_APP_TYP; }
	public String getl_ODR_FORM_FLG() { return m_l_ODR_FORM_FLG; }
	public String getl_ODR_EDI_FLG() { return m_l_ODR_EDI_FLG; }
	public String getl_VEND_REM() { return m_l_VEND_REM; }
	public String getl_CUR_CD() { return m_l_CUR_CD; }
	public String getl_EXCH_TYP() { return m_l_EXCH_TYP; }
	public String getl_IMPORT_TRN_TYP() { return m_l_IMPORT_TRN_TYP; }
	public String getl_UNIT_COST_RETROACTION_FLG() { return m_l_UNIT_COST_RETROACTION_FLG; }
	public String getl_COMPANY_CD() { return m_l_COMPANY_CD; }
	public String getOUT_VEND_CD() { return m_OUT_VEND_CD; }
	public String getl_HOME_CUR_CD() { return m_l_HOME_CUR_CD; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getOPTION_ID() { return m_OPTION_ID; }

	public List getList_rdoInsert() { return l_rdoInsert; }
	public List getList_rdoUpdate() { return l_rdoUpdate; }
	public List getList_rdoDelete() { return l_rdoDelete; }
	public List getList_DO_CHK() { return l_DO_CHK; }
	public List getList_FileName() { return l_FileName; }
	public List getList_CANCEL_FILE() { return l_CANCEL_FILE; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERR_ADR() { return l_l_ERR_ADR; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_ERROR_FIELD_NAME() { return l_l_ERROR_FIELD_NAME; }
	public List getList_l_ERR_TEXT() { return l_l_ERR_TEXT; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_w_COLUMN() { return l_w_COLUMN; }
	public List getList_l_VEND_NAME() { return l_l_VEND_NAME; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_VEND_KNAME() { return l_l_VEND_KNAME; }
	public List getList_l_ZIP_CD() { return l_l_ZIP_CD; }
	public List getList_l_ADDRESS_1() { return l_l_ADDRESS_1; }
	public List getList_l_ADDRESS_2() { return l_l_ADDRESS_2; }
	public List getList_l_ADDRESS_K_1() { return l_l_ADDRESS_K_1; }
	public List getList_l_ADDRESS_K_2() { return l_l_ADDRESS_K_2; }
	public List getList_l_TEL() { return l_l_TEL; }
	public List getList_l_FAX() { return l_l_FAX; }
	public List getList_l_EMAIL() { return l_l_EMAIL; }
	public List getList_l_VEND_ORG() { return l_l_VEND_ORG; }
	public List getList_l_VEND_PERSON() { return l_l_VEND_PERSON; }
	public List getList_l_OWN_ORG_CD() { return l_l_OWN_ORG_CD; }
	public List getList_l_OWN_ORG_NAME() { return l_l_OWN_ORG_NAME; }
	public List getList_l_OWN_PERSON_CD() { return l_l_OWN_PERSON_CD; }
	public List getList_l_OWN_PERSON_NAME() { return l_l_OWN_PERSON_NAME; }
	public List getList_l_ROUND_TYP() { return l_l_ROUND_TYP; }
	public List getList_l_TAX_CD() { return l_l_TAX_CD; }
	public List getList_l_TAX_APPLY_TYP() { return l_l_TAX_APPLY_TYP; }
	public List getList_l_TAX_CALC_TYP() { return l_l_TAX_CALC_TYP; }
	public List getList_l_INSPC_ACPT_APP_TYP() { return l_l_INSPC_ACPT_APP_TYP; }
	public List getList_l_ODR_FORM_FLG() { return l_l_ODR_FORM_FLG; }
	public List getList_l_ODR_EDI_FLG() { return l_l_ODR_EDI_FLG; }
	public List getList_l_VEND_REM() { return l_l_VEND_REM; }
	public List getList_l_CUR_CD() { return l_l_CUR_CD; }
	public List getList_l_EXCH_TYP() { return l_l_EXCH_TYP; }
	public List getList_l_IMPORT_TRN_TYP() { return l_l_IMPORT_TRN_TYP; }
	public List getList_l_UNIT_COST_RETROACTION_FLG() { return l_l_UNIT_COST_RETROACTION_FLG; }
	public List getList_l_COMPANY_CD() { return l_l_COMPANY_CD; }
	public List getList_OUT_VEND_CD() { return l_OUT_VEND_CD; }
	public List getList_l_HOME_CUR_CD() { return l_l_HOME_CUR_CD; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }

	public void setrdoInsert(String val) { m_rdoInsert = val; }
	public void setrdoUpdate(String val) { m_rdoUpdate = val; }
	public void setrdoDelete(String val) { m_rdoDelete = val; }
	public void setDO_CHK(String val) { m_DO_CHK = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void setCANCEL_FILE(String val) { m_CANCEL_FILE = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERR_ADR(String val) { m_l_ERR_ADR = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_ERROR_FIELD_NAME(String val) { m_l_ERROR_FIELD_NAME = val; }
	public void setl_ERR_TEXT(String val) { m_l_ERR_TEXT = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setw_COLUMN(String val) { m_w_COLUMN = val; }
	public void setl_VEND_NAME(String val) { m_l_VEND_NAME = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_VEND_KNAME(String val) { m_l_VEND_KNAME = val; }
	public void setl_ZIP_CD(String val) { m_l_ZIP_CD = val; }
	public void setl_ADDRESS_1(String val) { m_l_ADDRESS_1 = val; }
	public void setl_ADDRESS_2(String val) { m_l_ADDRESS_2 = val; }
	public void setl_ADDRESS_K_1(String val) { m_l_ADDRESS_K_1 = val; }
	public void setl_ADDRESS_K_2(String val) { m_l_ADDRESS_K_2 = val; }
	public void setl_TEL(String val) { m_l_TEL = val; }
	public void setl_FAX(String val) { m_l_FAX = val; }
	public void setl_EMAIL(String val) { m_l_EMAIL = val; }
	public void setl_VEND_ORG(String val) { m_l_VEND_ORG = val; }
	public void setl_VEND_PERSON(String val) { m_l_VEND_PERSON = val; }
	public void setl_OWN_ORG_CD(String val) { m_l_OWN_ORG_CD = val; }
	public void setl_OWN_ORG_NAME(String val) { m_l_OWN_ORG_NAME = val; }
	public void setl_OWN_PERSON_CD(String val) { m_l_OWN_PERSON_CD = val; }
	public void setl_OWN_PERSON_NAME(String val) { m_l_OWN_PERSON_NAME = val; }
	public void setl_ROUND_TYP(String val) { m_l_ROUND_TYP = val; }
	public void setl_TAX_CD(String val) { m_l_TAX_CD = val; }
	public void setl_TAX_APPLY_TYP(String val) { m_l_TAX_APPLY_TYP = val; }
	public void setl_TAX_CALC_TYP(String val) { m_l_TAX_CALC_TYP = val; }
	public void setl_INSPC_ACPT_APP_TYP(String val) { m_l_INSPC_ACPT_APP_TYP = val; }
	public void setl_ODR_FORM_FLG(String val) { m_l_ODR_FORM_FLG = val; }
	public void setl_ODR_EDI_FLG(String val) { m_l_ODR_EDI_FLG = val; }
	public void setl_VEND_REM(String val) { m_l_VEND_REM = val; }
	public void setl_CUR_CD(String val) { m_l_CUR_CD = val; }
	public void setl_EXCH_TYP(String val) { m_l_EXCH_TYP = val; }
	public void setl_IMPORT_TRN_TYP(String val) { m_l_IMPORT_TRN_TYP = val; }
	public void setl_UNIT_COST_RETROACTION_FLG(String val) { m_l_UNIT_COST_RETROACTION_FLG = val; }
	public void setl_COMPANY_CD(String val) { m_l_COMPANY_CD = val; }
	public void setOUT_VEND_CD(String val) { m_OUT_VEND_CD = val; }
	public void setl_HOME_CUR_CD(String val) { m_l_HOME_CUR_CD = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }


	public void setList_rdoInsert(List list) { l_rdoInsert = list; }
	public void setList_rdoUpdate(List list) { l_rdoUpdate = list; }
	public void setList_rdoDelete(List list) { l_rdoDelete = list; }
	public void setList_DO_CHK(List list) { l_DO_CHK = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_CANCEL_FILE(List list) { l_CANCEL_FILE = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERR_ADR(List list) { l_l_ERR_ADR = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_ERROR_FIELD_NAME(List list) { l_l_ERROR_FIELD_NAME = list; }
	public void setList_l_ERR_TEXT(List list) { l_l_ERR_TEXT = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_w_COLUMN(List list) { l_w_COLUMN = list; }
	public void setList_l_VEND_NAME(List list) { l_l_VEND_NAME = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_VEND_KNAME(List list) { l_l_VEND_KNAME = list; }
	public void setList_l_ZIP_CD(List list) { l_l_ZIP_CD = list; }
	public void setList_l_ADDRESS_1(List list) { l_l_ADDRESS_1 = list; }
	public void setList_l_ADDRESS_2(List list) { l_l_ADDRESS_2 = list; }
	public void setList_l_ADDRESS_K_1(List list) { l_l_ADDRESS_K_1 = list; }
	public void setList_l_ADDRESS_K_2(List list) { l_l_ADDRESS_K_2 = list; }
	public void setList_l_TEL(List list) { l_l_TEL = list; }
	public void setList_l_FAX(List list) { l_l_FAX = list; }
	public void setList_l_EMAIL(List list) { l_l_EMAIL = list; }
	public void setList_l_VEND_ORG(List list) { l_l_VEND_ORG = list; }
	public void setList_l_VEND_PERSON(List list) { l_l_VEND_PERSON = list; }
	public void setList_l_OWN_ORG_CD(List list) { l_l_OWN_ORG_CD = list; }
	public void setList_l_OWN_ORG_NAME(List list) { l_l_OWN_ORG_NAME = list; }
	public void setList_l_OWN_PERSON_CD(List list) { l_l_OWN_PERSON_CD = list; }
	public void setList_l_OWN_PERSON_NAME(List list) { l_l_OWN_PERSON_NAME = list; }
	public void setList_l_ROUND_TYP(List list) { l_l_ROUND_TYP = list; }
	public void setList_l_TAX_CD(List list) { l_l_TAX_CD = list; }
	public void setList_l_TAX_APPLY_TYP(List list) { l_l_TAX_APPLY_TYP = list; }
	public void setList_l_TAX_CALC_TYP(List list) { l_l_TAX_CALC_TYP = list; }
	public void setList_l_INSPC_ACPT_APP_TYP(List list) { l_l_INSPC_ACPT_APP_TYP = list; }
	public void setList_l_ODR_FORM_FLG(List list) { l_l_ODR_FORM_FLG = list; }
	public void setList_l_ODR_EDI_FLG(List list) { l_l_ODR_EDI_FLG = list; }
	public void setList_l_VEND_REM(List list) { l_l_VEND_REM = list; }
	public void setList_l_CUR_CD(List list) { l_l_CUR_CD = list; }
	public void setList_l_EXCH_TYP(List list) { l_l_EXCH_TYP = list; }
	public void setList_l_IMPORT_TRN_TYP(List list) { l_l_IMPORT_TRN_TYP = list; }
	public void setList_l_UNIT_COST_RETROACTION_FLG(List list) { l_l_UNIT_COST_RETROACTION_FLG = list; }
	public void setList_l_COMPANY_CD(List list) { l_l_COMPANY_CD = list; }
	public void setList_OUT_VEND_CD(List list) { l_OUT_VEND_CD = list; }
	public void setList_l_HOME_CUR_CD(List list) { l_l_HOME_CUR_CD = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }

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
			l_rdoInsert.add(((AA0210010Struct) list.get(i)).getrdoInsert());
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
			l_rdoUpdate.add(((AA0210010Struct) list.get(i)).getrdoUpdate());
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
			l_rdoDelete.add(((AA0210010Struct) list.get(i)).getrdoDelete());
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
			l_DO_CHK.add(((AA0210010Struct) list.get(i)).getDO_CHK());
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
			l_FileName.add(((AA0210010Struct) list.get(i)).getFileName());
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
			l_CANCEL_FILE.add(((AA0210010Struct) list.get(i)).getCANCEL_FILE());
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
			l_DOWNLOAD_FILE.add(((AA0210010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERR_ADR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ADR == null) {
			l_l_ERR_ADR = new ArrayList();
		} else {
			l_l_ERR_ADR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ADR.add(((AA0210010Struct) list.get(i)).getl_ERR_ADR());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AA0210010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AA0210010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_ERROR_FIELD_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_FIELD_NAME == null) {
			l_l_ERROR_FIELD_NAME = new ArrayList();
		} else {
			l_l_ERROR_FIELD_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_FIELD_NAME.add(((AA0210010Struct) list.get(i)).getl_ERROR_FIELD_NAME());
		}
		return size;
	}
	public int setL2L_l_ERR_TEXT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TEXT == null) {
			l_l_ERR_TEXT = new ArrayList();
		} else {
			l_l_ERR_TEXT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TEXT.add(((AA0210010Struct) list.get(i)).getl_ERR_TEXT());
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
			l_w_COLUMN_FLG.add(((AA0210010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_w_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN == null) {
			l_w_COLUMN = new ArrayList();
		} else {
			l_w_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN.add(((AA0210010Struct) list.get(i)).getw_COLUMN());
		}
		return size;
	}
	public int setL2L_l_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_NAME == null) {
			l_l_VEND_NAME = new ArrayList();
		} else {
			l_l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_NAME.add(((AA0210010Struct) list.get(i)).getl_VEND_NAME());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AA0210010Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_VEND_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_KNAME == null) {
			l_l_VEND_KNAME = new ArrayList();
		} else {
			l_l_VEND_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_KNAME.add(((AA0210010Struct) list.get(i)).getl_VEND_KNAME());
		}
		return size;
	}
	public int setL2L_l_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ZIP_CD == null) {
			l_l_ZIP_CD = new ArrayList();
		} else {
			l_l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ZIP_CD.add(((AA0210010Struct) list.get(i)).getl_ZIP_CD());
		}
		return size;
	}
	public int setL2L_l_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADDRESS_1 == null) {
			l_l_ADDRESS_1 = new ArrayList();
		} else {
			l_l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADDRESS_1.add(((AA0210010Struct) list.get(i)).getl_ADDRESS_1());
		}
		return size;
	}
	public int setL2L_l_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADDRESS_2 == null) {
			l_l_ADDRESS_2 = new ArrayList();
		} else {
			l_l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADDRESS_2.add(((AA0210010Struct) list.get(i)).getl_ADDRESS_2());
		}
		return size;
	}
	public int setL2L_l_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADDRESS_K_1 == null) {
			l_l_ADDRESS_K_1 = new ArrayList();
		} else {
			l_l_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADDRESS_K_1.add(((AA0210010Struct) list.get(i)).getl_ADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_l_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADDRESS_K_2 == null) {
			l_l_ADDRESS_K_2 = new ArrayList();
		} else {
			l_l_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADDRESS_K_2.add(((AA0210010Struct) list.get(i)).getl_ADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_l_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TEL == null) {
			l_l_TEL = new ArrayList();
		} else {
			l_l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TEL.add(((AA0210010Struct) list.get(i)).getl_TEL());
		}
		return size;
	}
	public int setL2L_l_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_FAX == null) {
			l_l_FAX = new ArrayList();
		} else {
			l_l_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_FAX.add(((AA0210010Struct) list.get(i)).getl_FAX());
		}
		return size;
	}
	public int setL2L_l_EMAIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EMAIL == null) {
			l_l_EMAIL = new ArrayList();
		} else {
			l_l_EMAIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EMAIL.add(((AA0210010Struct) list.get(i)).getl_EMAIL());
		}
		return size;
	}
	public int setL2L_l_VEND_ORG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ORG == null) {
			l_l_VEND_ORG = new ArrayList();
		} else {
			l_l_VEND_ORG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ORG.add(((AA0210010Struct) list.get(i)).getl_VEND_ORG());
		}
		return size;
	}
	public int setL2L_l_VEND_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_PERSON == null) {
			l_l_VEND_PERSON = new ArrayList();
		} else {
			l_l_VEND_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_PERSON.add(((AA0210010Struct) list.get(i)).getl_VEND_PERSON());
		}
		return size;
	}
	public int setL2L_l_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_ORG_CD == null) {
			l_l_OWN_ORG_CD = new ArrayList();
		} else {
			l_l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_ORG_CD.add(((AA0210010Struct) list.get(i)).getl_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_OWN_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_ORG_NAME == null) {
			l_l_OWN_ORG_NAME = new ArrayList();
		} else {
			l_l_OWN_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_ORG_NAME.add(((AA0210010Struct) list.get(i)).getl_OWN_ORG_NAME());
		}
		return size;
	}
	public int setL2L_l_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PERSON_CD == null) {
			l_l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PERSON_CD.add(((AA0210010Struct) list.get(i)).getl_OWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_l_OWN_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PERSON_NAME == null) {
			l_l_OWN_PERSON_NAME = new ArrayList();
		} else {
			l_l_OWN_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PERSON_NAME.add(((AA0210010Struct) list.get(i)).getl_OWN_PERSON_NAME());
		}
		return size;
	}
	public int setL2L_l_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ROUND_TYP == null) {
			l_l_ROUND_TYP = new ArrayList();
		} else {
			l_l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ROUND_TYP.add(((AA0210010Struct) list.get(i)).getl_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_l_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CD == null) {
			l_l_TAX_CD = new ArrayList();
		} else {
			l_l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CD.add(((AA0210010Struct) list.get(i)).getl_TAX_CD());
		}
		return size;
	}
	public int setL2L_l_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_APPLY_TYP == null) {
			l_l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_APPLY_TYP.add(((AA0210010Struct) list.get(i)).getl_TAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_l_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CALC_TYP == null) {
			l_l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CALC_TYP.add(((AA0210010Struct) list.get(i)).getl_TAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_APP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_APP_TYP == null) {
			l_l_INSPC_ACPT_APP_TYP = new ArrayList();
		} else {
			l_l_INSPC_ACPT_APP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_APP_TYP.add(((AA0210010Struct) list.get(i)).getl_INSPC_ACPT_APP_TYP());
		}
		return size;
	}
	public int setL2L_l_ODR_FORM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_FORM_FLG == null) {
			l_l_ODR_FORM_FLG = new ArrayList();
		} else {
			l_l_ODR_FORM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_FORM_FLG.add(((AA0210010Struct) list.get(i)).getl_ODR_FORM_FLG());
		}
		return size;
	}
	public int setL2L_l_ODR_EDI_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_EDI_FLG == null) {
			l_l_ODR_EDI_FLG = new ArrayList();
		} else {
			l_l_ODR_EDI_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_EDI_FLG.add(((AA0210010Struct) list.get(i)).getl_ODR_EDI_FLG());
		}
		return size;
	}
	public int setL2L_l_VEND_REM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_REM == null) {
			l_l_VEND_REM = new ArrayList();
		} else {
			l_l_VEND_REM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_REM.add(((AA0210010Struct) list.get(i)).getl_VEND_REM());
		}
		return size;
	}
	public int setL2L_l_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUR_CD == null) {
			l_l_CUR_CD = new ArrayList();
		} else {
			l_l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUR_CD.add(((AA0210010Struct) list.get(i)).getl_CUR_CD());
		}
		return size;
	}
	public int setL2L_l_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_TYP == null) {
			l_l_EXCH_TYP = new ArrayList();
		} else {
			l_l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_TYP.add(((AA0210010Struct) list.get(i)).getl_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_l_IMPORT_TRN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_IMPORT_TRN_TYP == null) {
			l_l_IMPORT_TRN_TYP = new ArrayList();
		} else {
			l_l_IMPORT_TRN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_IMPORT_TRN_TYP.add(((AA0210010Struct) list.get(i)).getl_IMPORT_TRN_TYP());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_RETROACTION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_RETROACTION_FLG == null) {
			l_l_UNIT_COST_RETROACTION_FLG = new ArrayList();
		} else {
			l_l_UNIT_COST_RETROACTION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_RETROACTION_FLG.add(((AA0210010Struct) list.get(i)).getl_UNIT_COST_RETROACTION_FLG());
		}
		return size;
	}
	public int setL2L_l_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COMPANY_CD == null) {
			l_l_COMPANY_CD = new ArrayList();
		} else {
			l_l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COMPANY_CD.add(((AA0210010Struct) list.get(i)).getl_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_OUT_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUT_VEND_CD == null) {
			l_OUT_VEND_CD = new ArrayList();
		} else {
			l_OUT_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUT_VEND_CD.add(((AA0210010Struct) list.get(i)).getOUT_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_CD == null) {
			l_l_HOME_CUR_CD = new ArrayList();
		} else {
			l_l_HOME_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_CD.add(((AA0210010Struct) list.get(i)).getl_HOME_CUR_CD());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((AA0210010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPTION_ID == null) {
			l_OPTION_ID = new ArrayList();
		} else {
			l_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPTION_ID.add(((AA0210010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoInsert = null;
		m_rdoUpdate = null;
		m_rdoDelete = null;
		m_DO_CHK = null;
		m_FileName = null;
		m_CANCEL_FILE = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERR_ADR = null;
		m_l_ERR_TYP = null;
		m_l_VEND_CD = null;
		m_l_ERROR_FIELD_NAME = null;
		m_l_ERR_TEXT = null;
		m_w_COLUMN_FLG = null;
		m_w_COLUMN = null;
		m_l_VEND_NAME = null;
		m_l_VEND_ANAME = null;
		m_l_VEND_KNAME = null;
		m_l_ZIP_CD = null;
		m_l_ADDRESS_1 = null;
		m_l_ADDRESS_2 = null;
		m_l_ADDRESS_K_1 = null;
		m_l_ADDRESS_K_2 = null;
		m_l_TEL = null;
		m_l_FAX = null;
		m_l_EMAIL = null;
		m_l_VEND_ORG = null;
		m_l_VEND_PERSON = null;
		m_l_OWN_ORG_CD = null;
		m_l_OWN_ORG_NAME = null;
		m_l_OWN_PERSON_CD = null;
		m_l_OWN_PERSON_NAME = null;
		m_l_ROUND_TYP = null;
		m_l_TAX_CD = null;
		m_l_TAX_APPLY_TYP = null;
		m_l_TAX_CALC_TYP = null;
		m_l_INSPC_ACPT_APP_TYP = null;
		m_l_ODR_FORM_FLG = null;
		m_l_ODR_EDI_FLG = null;
		m_l_VEND_REM = null;
		m_l_CUR_CD = null;
		m_l_EXCH_TYP = null;
		m_l_IMPORT_TRN_TYP = null;
		m_l_UNIT_COST_RETROACTION_FLG = null;
		m_l_COMPANY_CD = null;
		m_OUT_VEND_CD = null;
		m_l_HOME_CUR_CD = null;
		m_INSTALL_FLG = null;
		m_OPTION_ID = null;

		l_rdoInsert = null;
		l_rdoUpdate = null;
		l_rdoDelete = null;
		l_DO_CHK = null;
		l_FileName = null;
		l_CANCEL_FILE = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERR_ADR = null;
		l_l_ERR_TYP = null;
		l_l_VEND_CD = null;
		l_l_ERROR_FIELD_NAME = null;
		l_l_ERR_TEXT = null;
		l_w_COLUMN_FLG = null;
		l_w_COLUMN = null;
		l_l_VEND_NAME = null;
		l_l_VEND_ANAME = null;
		l_l_VEND_KNAME = null;
		l_l_ZIP_CD = null;
		l_l_ADDRESS_1 = null;
		l_l_ADDRESS_2 = null;
		l_l_ADDRESS_K_1 = null;
		l_l_ADDRESS_K_2 = null;
		l_l_TEL = null;
		l_l_FAX = null;
		l_l_EMAIL = null;
		l_l_VEND_ORG = null;
		l_l_VEND_PERSON = null;
		l_l_OWN_ORG_CD = null;
		l_l_OWN_ORG_NAME = null;
		l_l_OWN_PERSON_CD = null;
		l_l_OWN_PERSON_NAME = null;
		l_l_ROUND_TYP = null;
		l_l_TAX_CD = null;
		l_l_TAX_APPLY_TYP = null;
		l_l_TAX_CALC_TYP = null;
		l_l_INSPC_ACPT_APP_TYP = null;
		l_l_ODR_FORM_FLG = null;
		l_l_ODR_EDI_FLG = null;
		l_l_VEND_REM = null;
		l_l_CUR_CD = null;
		l_l_EXCH_TYP = null;
		l_l_IMPORT_TRN_TYP = null;
		l_l_UNIT_COST_RETROACTION_FLG = null;
		l_l_COMPANY_CD = null;
		l_OUT_VEND_CD = null;
		l_l_HOME_CUR_CD = null;
		l_INSTALL_FLG = null;
		l_OPTION_ID = null;

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
	 * medAA0210010�N���X�̕W���R���X�g���N�^
	 */
	public AA0210010Struct()
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
	public void setStruct(AA0210010Struct struct)
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
	public void setStructM(AA0210010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoInsert(struct.getrdoInsert());
			this.setrdoUpdate(struct.getrdoUpdate());
			this.setrdoDelete(struct.getrdoDelete());
			this.setDO_CHK(struct.getDO_CHK());
			this.setFileName(struct.getFileName());
			this.setCANCEL_FILE(struct.getCANCEL_FILE());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERR_ADR(struct.getl_ERR_ADR());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_ERROR_FIELD_NAME(struct.getl_ERROR_FIELD_NAME());
			this.setl_ERR_TEXT(struct.getl_ERR_TEXT());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setw_COLUMN(struct.getw_COLUMN());
			this.setl_VEND_NAME(struct.getl_VEND_NAME());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_VEND_KNAME(struct.getl_VEND_KNAME());
			this.setl_ZIP_CD(struct.getl_ZIP_CD());
			this.setl_ADDRESS_1(struct.getl_ADDRESS_1());
			this.setl_ADDRESS_2(struct.getl_ADDRESS_2());
			this.setl_ADDRESS_K_1(struct.getl_ADDRESS_K_1());
			this.setl_ADDRESS_K_2(struct.getl_ADDRESS_K_2());
			this.setl_TEL(struct.getl_TEL());
			this.setl_FAX(struct.getl_FAX());
			this.setl_EMAIL(struct.getl_EMAIL());
			this.setl_VEND_ORG(struct.getl_VEND_ORG());
			this.setl_VEND_PERSON(struct.getl_VEND_PERSON());
			this.setl_OWN_ORG_CD(struct.getl_OWN_ORG_CD());
			this.setl_OWN_ORG_NAME(struct.getl_OWN_ORG_NAME());
			this.setl_OWN_PERSON_CD(struct.getl_OWN_PERSON_CD());
			this.setl_OWN_PERSON_NAME(struct.getl_OWN_PERSON_NAME());
			this.setl_ROUND_TYP(struct.getl_ROUND_TYP());
			this.setl_TAX_CD(struct.getl_TAX_CD());
			this.setl_TAX_APPLY_TYP(struct.getl_TAX_APPLY_TYP());
			this.setl_TAX_CALC_TYP(struct.getl_TAX_CALC_TYP());
			this.setl_INSPC_ACPT_APP_TYP(struct.getl_INSPC_ACPT_APP_TYP());
			this.setl_ODR_FORM_FLG(struct.getl_ODR_FORM_FLG());
			this.setl_ODR_EDI_FLG(struct.getl_ODR_EDI_FLG());
			this.setl_VEND_REM(struct.getl_VEND_REM());
			this.setl_CUR_CD(struct.getl_CUR_CD());
			this.setl_EXCH_TYP(struct.getl_EXCH_TYP());
			this.setl_IMPORT_TRN_TYP(struct.getl_IMPORT_TRN_TYP());
			this.setl_UNIT_COST_RETROACTION_FLG(struct.getl_UNIT_COST_RETROACTION_FLG());
			this.setl_COMPANY_CD(struct.getl_COMPANY_CD());
			this.setOUT_VEND_CD(struct.getOUT_VEND_CD());
			this.setl_HOME_CUR_CD(struct.getl_HOME_CUR_CD());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setOPTION_ID(struct.getOPTION_ID());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0210010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoInsert(struct.getList_rdoInsert());
			this.setList_rdoUpdate(struct.getList_rdoUpdate());
			this.setList_rdoDelete(struct.getList_rdoDelete());
			this.setList_DO_CHK(struct.getList_DO_CHK());
			this.setList_FileName(struct.getList_FileName());
			this.setList_CANCEL_FILE(struct.getList_CANCEL_FILE());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERR_ADR(struct.getList_l_ERR_ADR());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_ERROR_FIELD_NAME(struct.getList_l_ERROR_FIELD_NAME());
			this.setList_l_ERR_TEXT(struct.getList_l_ERR_TEXT());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_w_COLUMN(struct.getList_w_COLUMN());
			this.setList_l_VEND_NAME(struct.getList_l_VEND_NAME());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_VEND_KNAME(struct.getList_l_VEND_KNAME());
			this.setList_l_ZIP_CD(struct.getList_l_ZIP_CD());
			this.setList_l_ADDRESS_1(struct.getList_l_ADDRESS_1());
			this.setList_l_ADDRESS_2(struct.getList_l_ADDRESS_2());
			this.setList_l_ADDRESS_K_1(struct.getList_l_ADDRESS_K_1());
			this.setList_l_ADDRESS_K_2(struct.getList_l_ADDRESS_K_2());
			this.setList_l_TEL(struct.getList_l_TEL());
			this.setList_l_FAX(struct.getList_l_FAX());
			this.setList_l_EMAIL(struct.getList_l_EMAIL());
			this.setList_l_VEND_ORG(struct.getList_l_VEND_ORG());
			this.setList_l_VEND_PERSON(struct.getList_l_VEND_PERSON());
			this.setList_l_OWN_ORG_CD(struct.getList_l_OWN_ORG_CD());
			this.setList_l_OWN_ORG_NAME(struct.getList_l_OWN_ORG_NAME());
			this.setList_l_OWN_PERSON_CD(struct.getList_l_OWN_PERSON_CD());
			this.setList_l_OWN_PERSON_NAME(struct.getList_l_OWN_PERSON_NAME());
			this.setList_l_ROUND_TYP(struct.getList_l_ROUND_TYP());
			this.setList_l_TAX_CD(struct.getList_l_TAX_CD());
			this.setList_l_TAX_APPLY_TYP(struct.getList_l_TAX_APPLY_TYP());
			this.setList_l_TAX_CALC_TYP(struct.getList_l_TAX_CALC_TYP());
			this.setList_l_INSPC_ACPT_APP_TYP(struct.getList_l_INSPC_ACPT_APP_TYP());
			this.setList_l_ODR_FORM_FLG(struct.getList_l_ODR_FORM_FLG());
			this.setList_l_ODR_EDI_FLG(struct.getList_l_ODR_EDI_FLG());
			this.setList_l_VEND_REM(struct.getList_l_VEND_REM());
			this.setList_l_CUR_CD(struct.getList_l_CUR_CD());
			this.setList_l_EXCH_TYP(struct.getList_l_EXCH_TYP());
			this.setList_l_IMPORT_TRN_TYP(struct.getList_l_IMPORT_TRN_TYP());
			this.setList_l_UNIT_COST_RETROACTION_FLG(struct.getList_l_UNIT_COST_RETROACTION_FLG());
			this.setList_l_COMPANY_CD(struct.getList_l_COMPANY_CD());
			this.setList_OUT_VEND_CD(struct.getList_OUT_VEND_CD());
			this.setList_l_HOME_CUR_CD(struct.getList_l_HOME_CUR_CD());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
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

	// �� 4 �ϐ������l�F i_DO_CHK


	final static String i_DO_CHK = null;

	// �� 5 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 6 �ϐ������l�F i_CANCEL_FILE


	final static String i_CANCEL_FILE = null;

	// �� 7 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 8 �ϐ������l�F i_l_ERR_ADR


	final static String i_l_ERR_ADR = null;

	// �� 9 �ϐ������l�F i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// �� 10 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 11 �ϐ������l�F i_l_ERROR_FIELD_NAME


	final static String i_l_ERROR_FIELD_NAME = null;

	// �� 12 �ϐ������l�F i_l_ERR_TEXT


	final static String i_l_ERR_TEXT = null;

	// �� 13 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// �� 14 �ϐ������l�F i_w_COLUMN


	final static String i_w_COLUMN = null;

	// �� 15 �ϐ������l�F i_l_VEND_NAME


	final static String i_l_VEND_NAME = null;

	// �� 16 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 17 �ϐ������l�F i_l_VEND_KNAME


	final static String i_l_VEND_KNAME = null;

	// �� 18 �ϐ������l�F i_l_ZIP_CD


	final static String i_l_ZIP_CD = null;

	// �� 19 �ϐ������l�F i_l_ADDRESS_1


	final static String i_l_ADDRESS_1 = null;

	// �� 20 �ϐ������l�F i_l_ADDRESS_2


	final static String i_l_ADDRESS_2 = null;

	// �� 21 �ϐ������l�F i_l_ADDRESS_K_1


	final static String i_l_ADDRESS_K_1 = null;

	// �� 22 �ϐ������l�F i_l_ADDRESS_K_2


	final static String i_l_ADDRESS_K_2 = null;

	// �� 23 �ϐ������l�F i_l_TEL


	final static String i_l_TEL = null;

	// �� 24 �ϐ������l�F i_l_FAX


	final static String i_l_FAX = null;

	// �� 25 �ϐ������l�F i_l_EMAIL


	final static String i_l_EMAIL = null;

	// �� 26 �ϐ������l�F i_l_VEND_ORG


	final static String i_l_VEND_ORG = null;

	// �� 27 �ϐ������l�F i_l_VEND_PERSON


	final static String i_l_VEND_PERSON = null;

	// �� 28 �ϐ������l�F i_l_OWN_ORG_CD


	final static String i_l_OWN_ORG_CD = null;

	// �� 29 �ϐ������l�F i_l_OWN_ORG_NAME


	final static String i_l_OWN_ORG_NAME = null;

	// �� 30 �ϐ������l�F i_l_OWN_PERSON_CD


	final static String i_l_OWN_PERSON_CD = null;

	// �� 31 �ϐ������l�F i_l_OWN_PERSON_NAME


	final static String i_l_OWN_PERSON_NAME = null;

	// �� 32 �ϐ������l�F i_l_ROUND_TYP


	final static String i_l_ROUND_TYP = null;

	// �� 33 �ϐ������l�F i_l_TAX_CD


	final static String i_l_TAX_CD = null;

	// �� 34 �ϐ������l�F i_l_TAX_APPLY_TYP


	final static String i_l_TAX_APPLY_TYP = null;

	// �� 35 �ϐ������l�F i_l_TAX_CALC_TYP


	final static String i_l_TAX_CALC_TYP = null;

	// �� 36 �ϐ������l�F i_l_INSPC_ACPT_APP_TYP


	final static String i_l_INSPC_ACPT_APP_TYP = null;

	// �� 37 �ϐ������l�F i_l_ODR_FORM_FLG


	final static String i_l_ODR_FORM_FLG = null;

	// �� 38 �ϐ������l�F i_l_ODR_EDI_FLG


	final static String i_l_ODR_EDI_FLG = null;

	// �� 39 �ϐ������l�F i_l_VEND_REM


	final static String i_l_VEND_REM = null;

	// �� 40 �ϐ������l�F i_l_CUR_CD


	final static String i_l_CUR_CD = null;

	// �� 41 �ϐ������l�F i_l_EXCH_TYP


	final static String i_l_EXCH_TYP = null;

	// �� 42 �ϐ������l�F i_l_IMPORT_TRN_TYP


	final static String i_l_IMPORT_TRN_TYP = null;

	// �� 43 �ϐ������l�F i_l_UNIT_COST_RETROACTION_FLG


	final static String i_l_UNIT_COST_RETROACTION_FLG = null;

	// �� 44 �ϐ������l�F i_l_COMPANY_CD


	final static String i_l_COMPANY_CD = null;

	// �� 45 �ϐ������l�F i_OUT_VEND_CD


	final static String i_OUT_VEND_CD = null;

	// �� 46 �ϐ������l�F i_l_HOME_CUR_CD


	final static String i_l_HOME_CUR_CD = null;

	// �� 47 �ϐ������l�F i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// �� 48 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_rdoInsert

	final static String i_rdoInsert = null;

	// �� 2 �ϐ������l�F i_rdoUpdate

	final static String i_rdoUpdate = null;

	// �� 3 �ϐ������l�F i_rdoDelete

	final static String i_rdoDelete = null;

	// �� 4 �ϐ������l�F i_DO_CHK

	final static String i_DO_CHK = null;

	// �� 5 �ϐ������l�F i_FileName

	final static String i_FileName = null;

	// �� 6 �ϐ������l�F i_CANCEL_FILE

	final static String i_CANCEL_FILE = null;

	// �� 7 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 8 �ϐ������l�F i_l_ERR_ADR

	final static String i_l_ERR_ADR = null;

	// �� 9 �ϐ������l�F i_l_ERR_TYP

	final static String i_l_ERR_TYP = null;

	// �� 10 �ϐ������l�F i_l_COMPANY_CD

	final static String i_l_COMPANY_CD = null;

	// �� 11 �ϐ������l�F i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// �� 12 �ϐ������l�F i_l_ERROR_FIELD_NAME

	final static String i_l_ERROR_FIELD_NAME = null;

	// �� 13 �ϐ������l�F i_l_ERR_TEXT

	final static String i_l_ERR_TEXT = null;

	// �� 14 �ϐ������l�F i_w_COLUMN_FLG

	final static String i_w_COLUMN_FLG = null;

	// �� 15 �ϐ������l�F i_w_COLUMN

	final static String i_w_COLUMN = null;

	// �� 16 �ϐ������l�F i_l_VEND_NAME

	final static String i_l_VEND_NAME = null;

	// �� 17 �ϐ������l�F i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// �� 18 �ϐ������l�F i_l_VEND_KNAME

	final static String i_l_VEND_KNAME = null;

	// �� 19 �ϐ������l�F i_l_ZIP_CD

	final static String i_l_ZIP_CD = null;

	// �� 20 �ϐ������l�F i_l_ADDRESS_1

	final static String i_l_ADDRESS_1 = null;

	// �� 21 �ϐ������l�F i_l_ADDRESS_2

	final static String i_l_ADDRESS_2 = null;

	// �� 22 �ϐ������l�F i_l_ADDRESS_K_1

	final static String i_l_ADDRESS_K_1 = null;

	// �� 23 �ϐ������l�F i_l_ADDRESS_K_2

	final static String i_l_ADDRESS_K_2 = null;

	// �� 24 �ϐ������l�F i_l_TEL

	final static String i_l_TEL = null;

	// �� 25 �ϐ������l�F i_l_FAX

	final static String i_l_FAX = null;

	// �� 26 �ϐ������l�F i_l_EMAIL

	final static String i_l_EMAIL = null;

	// �� 27 �ϐ������l�F i_l_VEND_ORG

	final static String i_l_VEND_ORG = null;

	// �� 28 �ϐ������l�F i_l_VEND_PERSON

	final static String i_l_VEND_PERSON = null;

	// �� 29 �ϐ������l�F i_l_OWN_ORG_CD

	final static String i_l_OWN_ORG_CD = null;

	// �� 30 �ϐ������l�F i_l_OWN_ORG_NAME

	final static String i_l_OWN_ORG_NAME = null;

	// �� 31 �ϐ������l�F i_l_OWN_PERSON_CD

	final static String i_l_OWN_PERSON_CD = null;

	// �� 32 �ϐ������l�F i_l_OWN_PERSON_NAME

	final static String i_l_OWN_PERSON_NAME = null;

	// �� 33 �ϐ������l�F i_l_ROUND_TYP

	final static String i_l_ROUND_TYP = null;

	// �� 34 �ϐ������l�F i_l_TAX_CD

	final static String i_l_TAX_CD = null;

	// �� 35 �ϐ������l�F i_l_TAX_APPLY_TYP

	final static String i_l_TAX_APPLY_TYP = null;

	// �� 36 �ϐ������l�F i_l_TAX_CALC_TYP

	final static String i_l_TAX_CALC_TYP = null;

	// �� 37 �ϐ������l�F i_l_INSPC_ACPT_APP_TYP

	final static String i_l_INSPC_ACPT_APP_TYP = null;

	// �� 38 �ϐ������l�F i_l_ODR_FORM_FLG

	final static String i_l_ODR_FORM_FLG = null;

	// �� 39 �ϐ������l�F i_l_ODR_EDI_FLG

	final static String i_l_ODR_EDI_FLG = null;

	// �� 40 �ϐ������l�F i_l_VEND_REM

	final static String i_l_VEND_REM = null;

	// �� 41 �ϐ������l�F i_l_CUR_CD

	final static String i_l_CUR_CD = null;

	// �� 42 �ϐ������l�F i_l_EXCH_TYP

	final static String i_l_EXCH_TYP = null;

	// �� 43 �ϐ������l�F i_l_IMPORT_TRN_TYP

	final static String i_l_IMPORT_TRN_TYP = null;

	// �� 44 �ϐ������l�F i_l_UNIT_COST_RETROACTION_FLG

	final static String i_l_UNIT_COST_RETROACTION_FLG = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_rdoInsert = i_rdoInsert;
		m_rdoUpdate = i_rdoUpdate;
		m_rdoDelete = i_rdoDelete;
		m_DO_CHK = i_DO_CHK;
		m_FileName = i_FileName;
		m_CANCEL_FILE = i_CANCEL_FILE;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_ERR_ADR = i_l_ERR_ADR;
		m_l_ERR_TYP = i_l_ERR_TYP;
		m_l_COMPANY_CD = i_l_COMPANY_CD;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_ERROR_FIELD_NAME = i_l_ERROR_FIELD_NAME;
		m_l_ERR_TEXT = i_l_ERR_TEXT;
		m_w_COLUMN_FLG = i_w_COLUMN_FLG;
		m_w_COLUMN = i_w_COLUMN;
		m_l_VEND_NAME = i_l_VEND_NAME;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_VEND_KNAME = i_l_VEND_KNAME;
		m_l_ZIP_CD = i_l_ZIP_CD;
		m_l_ADDRESS_1 = i_l_ADDRESS_1;
		m_l_ADDRESS_2 = i_l_ADDRESS_2;
		m_l_ADDRESS_K_1 = i_l_ADDRESS_K_1;
		m_l_ADDRESS_K_2 = i_l_ADDRESS_K_2;
		m_l_TEL = i_l_TEL;
		m_l_FAX = i_l_FAX;
		m_l_EMAIL = i_l_EMAIL;
		m_l_VEND_ORG = i_l_VEND_ORG;
		m_l_VEND_PERSON = i_l_VEND_PERSON;
		m_l_OWN_ORG_CD = i_l_OWN_ORG_CD;
		m_l_OWN_ORG_NAME = i_l_OWN_ORG_NAME;
		m_l_OWN_PERSON_CD = i_l_OWN_PERSON_CD;
		m_l_OWN_PERSON_NAME = i_l_OWN_PERSON_NAME;
		m_l_ROUND_TYP = i_l_ROUND_TYP;
		m_l_TAX_CD = i_l_TAX_CD;
		m_l_TAX_APPLY_TYP = i_l_TAX_APPLY_TYP;
		m_l_TAX_CALC_TYP = i_l_TAX_CALC_TYP;
		m_l_INSPC_ACPT_APP_TYP = i_l_INSPC_ACPT_APP_TYP;
		m_l_ODR_FORM_FLG = i_l_ODR_FORM_FLG;
		m_l_ODR_EDI_FLG = i_l_ODR_EDI_FLG;
		m_l_VEND_REM = i_l_VEND_REM;
		m_l_CUR_CD = i_l_CUR_CD;
		m_l_EXCH_TYP = i_l_EXCH_TYP;
		m_l_IMPORT_TRN_TYP = i_l_IMPORT_TRN_TYP;
		m_l_UNIT_COST_RETROACTION_FLG = i_l_UNIT_COST_RETROACTION_FLG;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
