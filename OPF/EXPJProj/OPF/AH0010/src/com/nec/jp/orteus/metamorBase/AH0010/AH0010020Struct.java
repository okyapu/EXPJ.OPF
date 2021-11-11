/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0010020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_INV_FLG_JAN */
	public String m_h_INV_FLG_JAN = null;
	/** �� 2 �ϐ��F m_h_INV_FLG_FEB */
	public String m_h_INV_FLG_FEB = null;
	/** �� 3 �ϐ��F m_h_INV_FLG_MAR */
	public String m_h_INV_FLG_MAR = null;
	/** �� 4 �ϐ��F m_h_INV_FLG_APR */
	public String m_h_INV_FLG_APR = null;
	/** �� 5 �ϐ��F m_h_INV_FLG_MAY */
	public String m_h_INV_FLG_MAY = null;
	/** �� 6 �ϐ��F m_h_INV_FLG_JUN */
	public String m_h_INV_FLG_JUN = null;
	/** �� 7 �ϐ��F m_h_INV_FLG_JUL */
	public String m_h_INV_FLG_JUL = null;
	/** �� 8 �ϐ��F m_h_INV_FLG_AUG */
	public String m_h_INV_FLG_AUG = null;
	/** �� 9 �ϐ��F m_h_INV_FLG_SEP */
	public String m_h_INV_FLG_SEP = null;
	/** �� 10 �ϐ��F m_h_INV_FLG_OCT */
	public String m_h_INV_FLG_OCT = null;
	/** �� 11 �ϐ��F m_h_INV_FLG_NOV */
	public String m_h_INV_FLG_NOV = null;
	/** �� 12 �ϐ��F m_h_INV_FLG_DEC */
	public String m_h_INV_FLG_DEC = null;
	/** �� 13 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 14 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 15 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 16 �ϐ��F m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** �� 17 �ϐ��F m_w_DRAW_CD */
	public String m_w_DRAW_CD = null;
	/** �� 18 �ϐ��F m_w_SPEC */
	public String m_w_SPEC = null;
	/** �� 19 �ϐ��F m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** �� 20 �ϐ��F m_w_OUTSIDE_TYP */
	public String m_w_OUTSIDE_TYP = null;
	/** �� 21 �ϐ��F m_w_ABC_TYP */
	public String m_w_ABC_TYP = null;
	/** �� 22 �ϐ��F m_ERR_ADR */
	public String m_ERR_ADR = null;
	/** �� 23 �ϐ��F m_ERR_MSG */
	public String m_ERR_MSG = null;
	/** �� 24 �ϐ��F m_c_INV_FLG_JAN */
	public String m_c_INV_FLG_JAN = null;
	/** �� 25 �ϐ��F m_c_INV_FLG_FEB */
	public String m_c_INV_FLG_FEB = null;
	/** �� 26 �ϐ��F m_c_INV_FLG_MAR */
	public String m_c_INV_FLG_MAR = null;
	/** �� 27 �ϐ��F m_c_INV_FLG_APR */
	public String m_c_INV_FLG_APR = null;
	/** �� 28 �ϐ��F m_c_INV_FLG_MAY */
	public String m_c_INV_FLG_MAY = null;
	/** �� 29 �ϐ��F m_c_INV_FLG_JUN */
	public String m_c_INV_FLG_JUN = null;
	/** �� 30 �ϐ��F m_c_INV_FLG_JUL */
	public String m_c_INV_FLG_JUL = null;
	/** �� 31 �ϐ��F m_c_INV_FLG_AUG */
	public String m_c_INV_FLG_AUG = null;
	/** �� 32 �ϐ��F m_c_INV_FLG_SEP */
	public String m_c_INV_FLG_SEP = null;
	/** �� 33 �ϐ��F m_c_INV_FLG_OCT */
	public String m_c_INV_FLG_OCT = null;
	/** �� 34 �ϐ��F m_c_INV_FLG_NOV */
	public String m_c_INV_FLG_NOV = null;
	/** �� 35 �ϐ��F m_c_INV_FLG_DEC */
	public String m_c_INV_FLG_DEC = null;
	/** �� 36 �ϐ��F m_h_saveITEM_CD */
	public String m_h_saveITEM_CD = null;
	/** �� 37 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 38 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_INV_FLG_JAN */
	public List l_h_INV_FLG_JAN = null;

	/** �� 2 List�ϐ��F l_h_INV_FLG_FEB */
	public List l_h_INV_FLG_FEB = null;

	/** �� 3 List�ϐ��F l_h_INV_FLG_MAR */
	public List l_h_INV_FLG_MAR = null;

	/** �� 4 List�ϐ��F l_h_INV_FLG_APR */
	public List l_h_INV_FLG_APR = null;

	/** �� 5 List�ϐ��F l_h_INV_FLG_MAY */
	public List l_h_INV_FLG_MAY = null;

	/** �� 6 List�ϐ��F l_h_INV_FLG_JUN */
	public List l_h_INV_FLG_JUN = null;

	/** �� 7 List�ϐ��F l_h_INV_FLG_JUL */
	public List l_h_INV_FLG_JUL = null;

	/** �� 8 List�ϐ��F l_h_INV_FLG_AUG */
	public List l_h_INV_FLG_AUG = null;

	/** �� 9 List�ϐ��F l_h_INV_FLG_SEP */
	public List l_h_INV_FLG_SEP = null;

	/** �� 10 List�ϐ��F l_h_INV_FLG_OCT */
	public List l_h_INV_FLG_OCT = null;

	/** �� 11 List�ϐ��F l_h_INV_FLG_NOV */
	public List l_h_INV_FLG_NOV = null;

	/** �� 12 List�ϐ��F l_h_INV_FLG_DEC */
	public List l_h_INV_FLG_DEC = null;

	/** �� 13 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 14 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 15 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 16 List�ϐ��F l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** �� 17 List�ϐ��F l_w_DRAW_CD */
	public List l_w_DRAW_CD = null;

	/** �� 18 List�ϐ��F l_w_SPEC */
	public List l_w_SPEC = null;

	/** �� 19 List�ϐ��F l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** �� 20 List�ϐ��F l_w_OUTSIDE_TYP */
	public List l_w_OUTSIDE_TYP = null;

	/** �� 21 List�ϐ��F l_w_ABC_TYP */
	public List l_w_ABC_TYP = null;

	/** �� 22 List�ϐ��F l_ERR_ADR */
	public List l_ERR_ADR = null;

	/** �� 23 List�ϐ��F l_ERR_MSG */
	public List l_ERR_MSG = null;

	/** �� 24 List�ϐ��F l_c_INV_FLG_JAN */
	public List l_c_INV_FLG_JAN = null;

	/** �� 25 List�ϐ��F l_c_INV_FLG_FEB */
	public List l_c_INV_FLG_FEB = null;

	/** �� 26 List�ϐ��F l_c_INV_FLG_MAR */
	public List l_c_INV_FLG_MAR = null;

	/** �� 27 List�ϐ��F l_c_INV_FLG_APR */
	public List l_c_INV_FLG_APR = null;

	/** �� 28 List�ϐ��F l_c_INV_FLG_MAY */
	public List l_c_INV_FLG_MAY = null;

	/** �� 29 List�ϐ��F l_c_INV_FLG_JUN */
	public List l_c_INV_FLG_JUN = null;

	/** �� 30 List�ϐ��F l_c_INV_FLG_JUL */
	public List l_c_INV_FLG_JUL = null;

	/** �� 31 List�ϐ��F l_c_INV_FLG_AUG */
	public List l_c_INV_FLG_AUG = null;

	/** �� 32 List�ϐ��F l_c_INV_FLG_SEP */
	public List l_c_INV_FLG_SEP = null;

	/** �� 33 List�ϐ��F l_c_INV_FLG_OCT */
	public List l_c_INV_FLG_OCT = null;

	/** �� 34 List�ϐ��F l_c_INV_FLG_NOV */
	public List l_c_INV_FLG_NOV = null;

	/** �� 35 List�ϐ��F l_c_INV_FLG_DEC */
	public List l_c_INV_FLG_DEC = null;

	/** �� 36 List�ϐ��F l_h_saveITEM_CD */
	public List l_h_saveITEM_CD = null;

	/** �� 37 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 38 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_INV_FLG_JAN() { return m_h_INV_FLG_JAN; }
	public String geth_INV_FLG_FEB() { return m_h_INV_FLG_FEB; }
	public String geth_INV_FLG_MAR() { return m_h_INV_FLG_MAR; }
	public String geth_INV_FLG_APR() { return m_h_INV_FLG_APR; }
	public String geth_INV_FLG_MAY() { return m_h_INV_FLG_MAY; }
	public String geth_INV_FLG_JUN() { return m_h_INV_FLG_JUN; }
	public String geth_INV_FLG_JUL() { return m_h_INV_FLG_JUL; }
	public String geth_INV_FLG_AUG() { return m_h_INV_FLG_AUG; }
	public String geth_INV_FLG_SEP() { return m_h_INV_FLG_SEP; }
	public String geth_INV_FLG_OCT() { return m_h_INV_FLG_OCT; }
	public String geth_INV_FLG_NOV() { return m_h_INV_FLG_NOV; }
	public String geth_INV_FLG_DEC() { return m_h_INV_FLG_DEC; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getw_DRAW_CD() { return m_w_DRAW_CD; }
	public String getw_SPEC() { return m_w_SPEC; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getw_OUTSIDE_TYP() { return m_w_OUTSIDE_TYP; }
	public String getw_ABC_TYP() { return m_w_ABC_TYP; }
	public String getERR_ADR() { return m_ERR_ADR; }
	public String getERR_MSG() { return m_ERR_MSG; }
	public String getc_INV_FLG_JAN() { return m_c_INV_FLG_JAN; }
	public String getc_INV_FLG_FEB() { return m_c_INV_FLG_FEB; }
	public String getc_INV_FLG_MAR() { return m_c_INV_FLG_MAR; }
	public String getc_INV_FLG_APR() { return m_c_INV_FLG_APR; }
	public String getc_INV_FLG_MAY() { return m_c_INV_FLG_MAY; }
	public String getc_INV_FLG_JUN() { return m_c_INV_FLG_JUN; }
	public String getc_INV_FLG_JUL() { return m_c_INV_FLG_JUL; }
	public String getc_INV_FLG_AUG() { return m_c_INV_FLG_AUG; }
	public String getc_INV_FLG_SEP() { return m_c_INV_FLG_SEP; }
	public String getc_INV_FLG_OCT() { return m_c_INV_FLG_OCT; }
	public String getc_INV_FLG_NOV() { return m_c_INV_FLG_NOV; }
	public String getc_INV_FLG_DEC() { return m_c_INV_FLG_DEC; }
	public String geth_saveITEM_CD() { return m_h_saveITEM_CD; }
	public String getFileName() { return m_FileName; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }

	public List getList_h_INV_FLG_JAN() { return l_h_INV_FLG_JAN; }
	public List getList_h_INV_FLG_FEB() { return l_h_INV_FLG_FEB; }
	public List getList_h_INV_FLG_MAR() { return l_h_INV_FLG_MAR; }
	public List getList_h_INV_FLG_APR() { return l_h_INV_FLG_APR; }
	public List getList_h_INV_FLG_MAY() { return l_h_INV_FLG_MAY; }
	public List getList_h_INV_FLG_JUN() { return l_h_INV_FLG_JUN; }
	public List getList_h_INV_FLG_JUL() { return l_h_INV_FLG_JUL; }
	public List getList_h_INV_FLG_AUG() { return l_h_INV_FLG_AUG; }
	public List getList_h_INV_FLG_SEP() { return l_h_INV_FLG_SEP; }
	public List getList_h_INV_FLG_OCT() { return l_h_INV_FLG_OCT; }
	public List getList_h_INV_FLG_NOV() { return l_h_INV_FLG_NOV; }
	public List getList_h_INV_FLG_DEC() { return l_h_INV_FLG_DEC; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_w_DRAW_CD() { return l_w_DRAW_CD; }
	public List getList_w_SPEC() { return l_w_SPEC; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_w_OUTSIDE_TYP() { return l_w_OUTSIDE_TYP; }
	public List getList_w_ABC_TYP() { return l_w_ABC_TYP; }
	public List getList_ERR_ADR() { return l_ERR_ADR; }
	public List getList_ERR_MSG() { return l_ERR_MSG; }
	public List getList_c_INV_FLG_JAN() { return l_c_INV_FLG_JAN; }
	public List getList_c_INV_FLG_FEB() { return l_c_INV_FLG_FEB; }
	public List getList_c_INV_FLG_MAR() { return l_c_INV_FLG_MAR; }
	public List getList_c_INV_FLG_APR() { return l_c_INV_FLG_APR; }
	public List getList_c_INV_FLG_MAY() { return l_c_INV_FLG_MAY; }
	public List getList_c_INV_FLG_JUN() { return l_c_INV_FLG_JUN; }
	public List getList_c_INV_FLG_JUL() { return l_c_INV_FLG_JUL; }
	public List getList_c_INV_FLG_AUG() { return l_c_INV_FLG_AUG; }
	public List getList_c_INV_FLG_SEP() { return l_c_INV_FLG_SEP; }
	public List getList_c_INV_FLG_OCT() { return l_c_INV_FLG_OCT; }
	public List getList_c_INV_FLG_NOV() { return l_c_INV_FLG_NOV; }
	public List getList_c_INV_FLG_DEC() { return l_c_INV_FLG_DEC; }
	public List getList_h_saveITEM_CD() { return l_h_saveITEM_CD; }
	public List getList_FileName() { return l_FileName; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }

	public void seth_INV_FLG_JAN(String val) { m_h_INV_FLG_JAN = val; }
	public void seth_INV_FLG_FEB(String val) { m_h_INV_FLG_FEB = val; }
	public void seth_INV_FLG_MAR(String val) { m_h_INV_FLG_MAR = val; }
	public void seth_INV_FLG_APR(String val) { m_h_INV_FLG_APR = val; }
	public void seth_INV_FLG_MAY(String val) { m_h_INV_FLG_MAY = val; }
	public void seth_INV_FLG_JUN(String val) { m_h_INV_FLG_JUN = val; }
	public void seth_INV_FLG_JUL(String val) { m_h_INV_FLG_JUL = val; }
	public void seth_INV_FLG_AUG(String val) { m_h_INV_FLG_AUG = val; }
	public void seth_INV_FLG_SEP(String val) { m_h_INV_FLG_SEP = val; }
	public void seth_INV_FLG_OCT(String val) { m_h_INV_FLG_OCT = val; }
	public void seth_INV_FLG_NOV(String val) { m_h_INV_FLG_NOV = val; }
	public void seth_INV_FLG_DEC(String val) { m_h_INV_FLG_DEC = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setw_DRAW_CD(String val) { m_w_DRAW_CD = val; }
	public void setw_SPEC(String val) { m_w_SPEC = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setw_OUTSIDE_TYP(String val) { m_w_OUTSIDE_TYP = val; }
	public void setw_ABC_TYP(String val) { m_w_ABC_TYP = val; }
	public void setERR_ADR(String val) { m_ERR_ADR = val; }
	public void setERR_MSG(String val) { m_ERR_MSG = val; }
	public void setc_INV_FLG_JAN(String val) { m_c_INV_FLG_JAN = val; }
	public void setc_INV_FLG_FEB(String val) { m_c_INV_FLG_FEB = val; }
	public void setc_INV_FLG_MAR(String val) { m_c_INV_FLG_MAR = val; }
	public void setc_INV_FLG_APR(String val) { m_c_INV_FLG_APR = val; }
	public void setc_INV_FLG_MAY(String val) { m_c_INV_FLG_MAY = val; }
	public void setc_INV_FLG_JUN(String val) { m_c_INV_FLG_JUN = val; }
	public void setc_INV_FLG_JUL(String val) { m_c_INV_FLG_JUL = val; }
	public void setc_INV_FLG_AUG(String val) { m_c_INV_FLG_AUG = val; }
	public void setc_INV_FLG_SEP(String val) { m_c_INV_FLG_SEP = val; }
	public void setc_INV_FLG_OCT(String val) { m_c_INV_FLG_OCT = val; }
	public void setc_INV_FLG_NOV(String val) { m_c_INV_FLG_NOV = val; }
	public void setc_INV_FLG_DEC(String val) { m_c_INV_FLG_DEC = val; }
	public void seth_saveITEM_CD(String val) { m_h_saveITEM_CD = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }


	public void setList_h_INV_FLG_JAN(List list) { l_h_INV_FLG_JAN = list; }
	public void setList_h_INV_FLG_FEB(List list) { l_h_INV_FLG_FEB = list; }
	public void setList_h_INV_FLG_MAR(List list) { l_h_INV_FLG_MAR = list; }
	public void setList_h_INV_FLG_APR(List list) { l_h_INV_FLG_APR = list; }
	public void setList_h_INV_FLG_MAY(List list) { l_h_INV_FLG_MAY = list; }
	public void setList_h_INV_FLG_JUN(List list) { l_h_INV_FLG_JUN = list; }
	public void setList_h_INV_FLG_JUL(List list) { l_h_INV_FLG_JUL = list; }
	public void setList_h_INV_FLG_AUG(List list) { l_h_INV_FLG_AUG = list; }
	public void setList_h_INV_FLG_SEP(List list) { l_h_INV_FLG_SEP = list; }
	public void setList_h_INV_FLG_OCT(List list) { l_h_INV_FLG_OCT = list; }
	public void setList_h_INV_FLG_NOV(List list) { l_h_INV_FLG_NOV = list; }
	public void setList_h_INV_FLG_DEC(List list) { l_h_INV_FLG_DEC = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_w_DRAW_CD(List list) { l_w_DRAW_CD = list; }
	public void setList_w_SPEC(List list) { l_w_SPEC = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_w_OUTSIDE_TYP(List list) { l_w_OUTSIDE_TYP = list; }
	public void setList_w_ABC_TYP(List list) { l_w_ABC_TYP = list; }
	public void setList_ERR_ADR(List list) { l_ERR_ADR = list; }
	public void setList_ERR_MSG(List list) { l_ERR_MSG = list; }
	public void setList_c_INV_FLG_JAN(List list) { l_c_INV_FLG_JAN = list; }
	public void setList_c_INV_FLG_FEB(List list) { l_c_INV_FLG_FEB = list; }
	public void setList_c_INV_FLG_MAR(List list) { l_c_INV_FLG_MAR = list; }
	public void setList_c_INV_FLG_APR(List list) { l_c_INV_FLG_APR = list; }
	public void setList_c_INV_FLG_MAY(List list) { l_c_INV_FLG_MAY = list; }
	public void setList_c_INV_FLG_JUN(List list) { l_c_INV_FLG_JUN = list; }
	public void setList_c_INV_FLG_JUL(List list) { l_c_INV_FLG_JUL = list; }
	public void setList_c_INV_FLG_AUG(List list) { l_c_INV_FLG_AUG = list; }
	public void setList_c_INV_FLG_SEP(List list) { l_c_INV_FLG_SEP = list; }
	public void setList_c_INV_FLG_OCT(List list) { l_c_INV_FLG_OCT = list; }
	public void setList_c_INV_FLG_NOV(List list) { l_c_INV_FLG_NOV = list; }
	public void setList_c_INV_FLG_DEC(List list) { l_c_INV_FLG_DEC = list; }
	public void setList_h_saveITEM_CD(List list) { l_h_saveITEM_CD = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }

	public int setL2L_h_INV_FLG_JAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_JAN == null) {
			l_h_INV_FLG_JAN = new ArrayList();
		} else {
			l_h_INV_FLG_JAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_JAN.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_JAN());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_FEB(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_FEB == null) {
			l_h_INV_FLG_FEB = new ArrayList();
		} else {
			l_h_INV_FLG_FEB.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_FEB.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_FEB());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_MAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_MAR == null) {
			l_h_INV_FLG_MAR = new ArrayList();
		} else {
			l_h_INV_FLG_MAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_MAR.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_MAR());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_APR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_APR == null) {
			l_h_INV_FLG_APR = new ArrayList();
		} else {
			l_h_INV_FLG_APR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_APR.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_APR());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_MAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_MAY == null) {
			l_h_INV_FLG_MAY = new ArrayList();
		} else {
			l_h_INV_FLG_MAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_MAY.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_MAY());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_JUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_JUN == null) {
			l_h_INV_FLG_JUN = new ArrayList();
		} else {
			l_h_INV_FLG_JUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_JUN.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_JUN());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_JUL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_JUL == null) {
			l_h_INV_FLG_JUL = new ArrayList();
		} else {
			l_h_INV_FLG_JUL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_JUL.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_JUL());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_AUG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_AUG == null) {
			l_h_INV_FLG_AUG = new ArrayList();
		} else {
			l_h_INV_FLG_AUG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_AUG.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_AUG());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_SEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_SEP == null) {
			l_h_INV_FLG_SEP = new ArrayList();
		} else {
			l_h_INV_FLG_SEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_SEP.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_SEP());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_OCT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_OCT == null) {
			l_h_INV_FLG_OCT = new ArrayList();
		} else {
			l_h_INV_FLG_OCT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_OCT.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_OCT());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_NOV(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_NOV == null) {
			l_h_INV_FLG_NOV = new ArrayList();
		} else {
			l_h_INV_FLG_NOV.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_NOV.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_NOV());
		}
		return size;
	}
	public int setL2L_h_INV_FLG_DEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INV_FLG_DEC == null) {
			l_h_INV_FLG_DEC = new ArrayList();
		} else {
			l_h_INV_FLG_DEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INV_FLG_DEC.add(((AH0010020Struct) list.get(i)).geth_INV_FLG_DEC());
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
			l_MODIFY_COUNT.add(((AH0010020Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AH0010020Struct) list.get(i)).getw_ITEM_CD());
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
			l_PLANT_CD.add(((AH0010020Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_NAME == null) {
			l_w_ITEM_NAME = new ArrayList();
		} else {
			l_w_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_NAME.add(((AH0010020Struct) list.get(i)).getw_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DRAW_CD == null) {
			l_w_DRAW_CD = new ArrayList();
		} else {
			l_w_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DRAW_CD.add(((AH0010020Struct) list.get(i)).getw_DRAW_CD());
		}
		return size;
	}
	public int setL2L_w_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SPEC == null) {
			l_w_SPEC = new ArrayList();
		} else {
			l_w_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SPEC.add(((AH0010020Struct) list.get(i)).getw_SPEC());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP == null) {
			l_w_MRP_ODR_TYP = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP.add(((AH0010020Struct) list.get(i)).getw_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP == null) {
			l_w_OUTSIDE_TYP = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP.add(((AH0010020Struct) list.get(i)).getw_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_w_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ABC_TYP == null) {
			l_w_ABC_TYP = new ArrayList();
		} else {
			l_w_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ABC_TYP.add(((AH0010020Struct) list.get(i)).getw_ABC_TYP());
		}
		return size;
	}
	public int setL2L_ERR_ADR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_ADR == null) {
			l_ERR_ADR = new ArrayList();
		} else {
			l_ERR_ADR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_ADR.add(((AH0010020Struct) list.get(i)).getERR_ADR());
		}
		return size;
	}
	public int setL2L_ERR_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_MSG == null) {
			l_ERR_MSG = new ArrayList();
		} else {
			l_ERR_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_MSG.add(((AH0010020Struct) list.get(i)).getERR_MSG());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_JAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_JAN == null) {
			l_c_INV_FLG_JAN = new ArrayList();
		} else {
			l_c_INV_FLG_JAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_JAN.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_JAN());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_FEB(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_FEB == null) {
			l_c_INV_FLG_FEB = new ArrayList();
		} else {
			l_c_INV_FLG_FEB.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_FEB.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_FEB());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_MAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_MAR == null) {
			l_c_INV_FLG_MAR = new ArrayList();
		} else {
			l_c_INV_FLG_MAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_MAR.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_MAR());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_APR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_APR == null) {
			l_c_INV_FLG_APR = new ArrayList();
		} else {
			l_c_INV_FLG_APR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_APR.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_APR());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_MAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_MAY == null) {
			l_c_INV_FLG_MAY = new ArrayList();
		} else {
			l_c_INV_FLG_MAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_MAY.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_MAY());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_JUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_JUN == null) {
			l_c_INV_FLG_JUN = new ArrayList();
		} else {
			l_c_INV_FLG_JUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_JUN.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_JUN());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_JUL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_JUL == null) {
			l_c_INV_FLG_JUL = new ArrayList();
		} else {
			l_c_INV_FLG_JUL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_JUL.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_JUL());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_AUG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_AUG == null) {
			l_c_INV_FLG_AUG = new ArrayList();
		} else {
			l_c_INV_FLG_AUG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_AUG.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_AUG());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_SEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_SEP == null) {
			l_c_INV_FLG_SEP = new ArrayList();
		} else {
			l_c_INV_FLG_SEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_SEP.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_SEP());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_OCT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_OCT == null) {
			l_c_INV_FLG_OCT = new ArrayList();
		} else {
			l_c_INV_FLG_OCT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_OCT.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_OCT());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_NOV(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_NOV == null) {
			l_c_INV_FLG_NOV = new ArrayList();
		} else {
			l_c_INV_FLG_NOV.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_NOV.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_NOV());
		}
		return size;
	}
	public int setL2L_c_INV_FLG_DEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INV_FLG_DEC == null) {
			l_c_INV_FLG_DEC = new ArrayList();
		} else {
			l_c_INV_FLG_DEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INV_FLG_DEC.add(((AH0010020Struct) list.get(i)).getc_INV_FLG_DEC());
		}
		return size;
	}
	public int setL2L_h_saveITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_saveITEM_CD == null) {
			l_h_saveITEM_CD = new ArrayList();
		} else {
			l_h_saveITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_saveITEM_CD.add(((AH0010020Struct) list.get(i)).geth_saveITEM_CD());
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
			l_FileName.add(((AH0010020Struct) list.get(i)).getFileName());
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
			l_w_COLUMN_FLG.add(((AH0010020Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_INV_FLG_JAN = null;
		m_h_INV_FLG_FEB = null;
		m_h_INV_FLG_MAR = null;
		m_h_INV_FLG_APR = null;
		m_h_INV_FLG_MAY = null;
		m_h_INV_FLG_JUN = null;
		m_h_INV_FLG_JUL = null;
		m_h_INV_FLG_AUG = null;
		m_h_INV_FLG_SEP = null;
		m_h_INV_FLG_OCT = null;
		m_h_INV_FLG_NOV = null;
		m_h_INV_FLG_DEC = null;
		m_MODIFY_COUNT = null;
		m_w_ITEM_CD = null;
		m_PLANT_CD = null;
		m_w_ITEM_NAME = null;
		m_w_DRAW_CD = null;
		m_w_SPEC = null;
		m_w_MRP_ODR_TYP = null;
		m_w_OUTSIDE_TYP = null;
		m_w_ABC_TYP = null;
		m_ERR_ADR = null;
		m_ERR_MSG = null;
		m_c_INV_FLG_JAN = null;
		m_c_INV_FLG_FEB = null;
		m_c_INV_FLG_MAR = null;
		m_c_INV_FLG_APR = null;
		m_c_INV_FLG_MAY = null;
		m_c_INV_FLG_JUN = null;
		m_c_INV_FLG_JUL = null;
		m_c_INV_FLG_AUG = null;
		m_c_INV_FLG_SEP = null;
		m_c_INV_FLG_OCT = null;
		m_c_INV_FLG_NOV = null;
		m_c_INV_FLG_DEC = null;
		m_h_saveITEM_CD = null;
		m_FileName = null;
		m_w_COLUMN_FLG = null;

		l_h_INV_FLG_JAN = null;
		l_h_INV_FLG_FEB = null;
		l_h_INV_FLG_MAR = null;
		l_h_INV_FLG_APR = null;
		l_h_INV_FLG_MAY = null;
		l_h_INV_FLG_JUN = null;
		l_h_INV_FLG_JUL = null;
		l_h_INV_FLG_AUG = null;
		l_h_INV_FLG_SEP = null;
		l_h_INV_FLG_OCT = null;
		l_h_INV_FLG_NOV = null;
		l_h_INV_FLG_DEC = null;
		l_MODIFY_COUNT = null;
		l_w_ITEM_CD = null;
		l_PLANT_CD = null;
		l_w_ITEM_NAME = null;
		l_w_DRAW_CD = null;
		l_w_SPEC = null;
		l_w_MRP_ODR_TYP = null;
		l_w_OUTSIDE_TYP = null;
		l_w_ABC_TYP = null;
		l_ERR_ADR = null;
		l_ERR_MSG = null;
		l_c_INV_FLG_JAN = null;
		l_c_INV_FLG_FEB = null;
		l_c_INV_FLG_MAR = null;
		l_c_INV_FLG_APR = null;
		l_c_INV_FLG_MAY = null;
		l_c_INV_FLG_JUN = null;
		l_c_INV_FLG_JUL = null;
		l_c_INV_FLG_AUG = null;
		l_c_INV_FLG_SEP = null;
		l_c_INV_FLG_OCT = null;
		l_c_INV_FLG_NOV = null;
		l_c_INV_FLG_DEC = null;
		l_h_saveITEM_CD = null;
		l_FileName = null;
		l_w_COLUMN_FLG = null;

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
	 * medAH0010020�N���X�̕W���R���X�g���N�^
	 */
	public AH0010020Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AH0010020Struct struct)
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
	public void setStructM(AH0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_INV_FLG_JAN(struct.geth_INV_FLG_JAN());
			this.seth_INV_FLG_FEB(struct.geth_INV_FLG_FEB());
			this.seth_INV_FLG_MAR(struct.geth_INV_FLG_MAR());
			this.seth_INV_FLG_APR(struct.geth_INV_FLG_APR());
			this.seth_INV_FLG_MAY(struct.geth_INV_FLG_MAY());
			this.seth_INV_FLG_JUN(struct.geth_INV_FLG_JUN());
			this.seth_INV_FLG_JUL(struct.geth_INV_FLG_JUL());
			this.seth_INV_FLG_AUG(struct.geth_INV_FLG_AUG());
			this.seth_INV_FLG_SEP(struct.geth_INV_FLG_SEP());
			this.seth_INV_FLG_OCT(struct.geth_INV_FLG_OCT());
			this.seth_INV_FLG_NOV(struct.geth_INV_FLG_NOV());
			this.seth_INV_FLG_DEC(struct.geth_INV_FLG_DEC());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setw_DRAW_CD(struct.getw_DRAW_CD());
			this.setw_SPEC(struct.getw_SPEC());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setw_OUTSIDE_TYP(struct.getw_OUTSIDE_TYP());
			this.setw_ABC_TYP(struct.getw_ABC_TYP());
			this.setERR_ADR(struct.getERR_ADR());
			this.setERR_MSG(struct.getERR_MSG());
			this.setc_INV_FLG_JAN(struct.getc_INV_FLG_JAN());
			this.setc_INV_FLG_FEB(struct.getc_INV_FLG_FEB());
			this.setc_INV_FLG_MAR(struct.getc_INV_FLG_MAR());
			this.setc_INV_FLG_APR(struct.getc_INV_FLG_APR());
			this.setc_INV_FLG_MAY(struct.getc_INV_FLG_MAY());
			this.setc_INV_FLG_JUN(struct.getc_INV_FLG_JUN());
			this.setc_INV_FLG_JUL(struct.getc_INV_FLG_JUL());
			this.setc_INV_FLG_AUG(struct.getc_INV_FLG_AUG());
			this.setc_INV_FLG_SEP(struct.getc_INV_FLG_SEP());
			this.setc_INV_FLG_OCT(struct.getc_INV_FLG_OCT());
			this.setc_INV_FLG_NOV(struct.getc_INV_FLG_NOV());
			this.setc_INV_FLG_DEC(struct.getc_INV_FLG_DEC());
			this.seth_saveITEM_CD(struct.geth_saveITEM_CD());
			this.setFileName(struct.getFileName());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_INV_FLG_JAN(struct.getList_h_INV_FLG_JAN());
			this.setList_h_INV_FLG_FEB(struct.getList_h_INV_FLG_FEB());
			this.setList_h_INV_FLG_MAR(struct.getList_h_INV_FLG_MAR());
			this.setList_h_INV_FLG_APR(struct.getList_h_INV_FLG_APR());
			this.setList_h_INV_FLG_MAY(struct.getList_h_INV_FLG_MAY());
			this.setList_h_INV_FLG_JUN(struct.getList_h_INV_FLG_JUN());
			this.setList_h_INV_FLG_JUL(struct.getList_h_INV_FLG_JUL());
			this.setList_h_INV_FLG_AUG(struct.getList_h_INV_FLG_AUG());
			this.setList_h_INV_FLG_SEP(struct.getList_h_INV_FLG_SEP());
			this.setList_h_INV_FLG_OCT(struct.getList_h_INV_FLG_OCT());
			this.setList_h_INV_FLG_NOV(struct.getList_h_INV_FLG_NOV());
			this.setList_h_INV_FLG_DEC(struct.getList_h_INV_FLG_DEC());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_w_DRAW_CD(struct.getList_w_DRAW_CD());
			this.setList_w_SPEC(struct.getList_w_SPEC());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_w_OUTSIDE_TYP(struct.getList_w_OUTSIDE_TYP());
			this.setList_w_ABC_TYP(struct.getList_w_ABC_TYP());
			this.setList_ERR_ADR(struct.getList_ERR_ADR());
			this.setList_ERR_MSG(struct.getList_ERR_MSG());
			this.setList_c_INV_FLG_JAN(struct.getList_c_INV_FLG_JAN());
			this.setList_c_INV_FLG_FEB(struct.getList_c_INV_FLG_FEB());
			this.setList_c_INV_FLG_MAR(struct.getList_c_INV_FLG_MAR());
			this.setList_c_INV_FLG_APR(struct.getList_c_INV_FLG_APR());
			this.setList_c_INV_FLG_MAY(struct.getList_c_INV_FLG_MAY());
			this.setList_c_INV_FLG_JUN(struct.getList_c_INV_FLG_JUN());
			this.setList_c_INV_FLG_JUL(struct.getList_c_INV_FLG_JUL());
			this.setList_c_INV_FLG_AUG(struct.getList_c_INV_FLG_AUG());
			this.setList_c_INV_FLG_SEP(struct.getList_c_INV_FLG_SEP());
			this.setList_c_INV_FLG_OCT(struct.getList_c_INV_FLG_OCT());
			this.setList_c_INV_FLG_NOV(struct.getList_c_INV_FLG_NOV());
			this.setList_c_INV_FLG_DEC(struct.getList_c_INV_FLG_DEC());
			this.setList_h_saveITEM_CD(struct.getList_h_saveITEM_CD());
			this.setList_FileName(struct.getList_FileName());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
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
	// �� 1 �ϐ������l�F i_h_INV_FLG_JAN


	final static String i_h_INV_FLG_JAN = null;

	// �� 2 �ϐ������l�F i_h_INV_FLG_FEB


	final static String i_h_INV_FLG_FEB = null;

	// �� 3 �ϐ������l�F i_h_INV_FLG_MAR


	final static String i_h_INV_FLG_MAR = null;

	// �� 4 �ϐ������l�F i_h_INV_FLG_APR


	final static String i_h_INV_FLG_APR = null;

	// �� 5 �ϐ������l�F i_h_INV_FLG_MAY


	final static String i_h_INV_FLG_MAY = null;

	// �� 6 �ϐ������l�F i_h_INV_FLG_JUN


	final static String i_h_INV_FLG_JUN = null;

	// �� 7 �ϐ������l�F i_h_INV_FLG_JUL


	final static String i_h_INV_FLG_JUL = null;

	// �� 8 �ϐ������l�F i_h_INV_FLG_AUG


	final static String i_h_INV_FLG_AUG = null;

	// �� 9 �ϐ������l�F i_h_INV_FLG_SEP


	final static String i_h_INV_FLG_SEP = null;

	// �� 10 �ϐ������l�F i_h_INV_FLG_OCT


	final static String i_h_INV_FLG_OCT = null;

	// �� 11 �ϐ������l�F i_h_INV_FLG_NOV


	final static String i_h_INV_FLG_NOV = null;

	// �� 12 �ϐ������l�F i_h_INV_FLG_DEC


	final static String i_h_INV_FLG_DEC = null;

	// �� 13 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 14 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 16 �ϐ������l�F i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// �� 17 �ϐ������l�F i_w_DRAW_CD


	final static String i_w_DRAW_CD = null;

	// �� 18 �ϐ������l�F i_w_SPEC


	final static String i_w_SPEC = null;

	// �� 19 �ϐ������l�F i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// �� 20 �ϐ������l�F i_w_OUTSIDE_TYP


	final static String i_w_OUTSIDE_TYP = null;

	// �� 21 �ϐ������l�F i_w_ABC_TYP


	final static String i_w_ABC_TYP = null;

	// �� 22 �ϐ������l�F i_ERR_ADR


	final static String i_ERR_ADR = null;

	// �� 23 �ϐ������l�F i_ERR_MSG


	final static String i_ERR_MSG = null;

	// �� 24 �ϐ������l�F i_c_INV_FLG_JAN


	final static String i_c_INV_FLG_JAN = null;

	// �� 25 �ϐ������l�F i_c_INV_FLG_FEB


	final static String i_c_INV_FLG_FEB = null;

	// �� 26 �ϐ������l�F i_c_INV_FLG_MAR


	final static String i_c_INV_FLG_MAR = null;

	// �� 27 �ϐ������l�F i_c_INV_FLG_APR


	final static String i_c_INV_FLG_APR = null;

	// �� 28 �ϐ������l�F i_c_INV_FLG_MAY


	final static String i_c_INV_FLG_MAY = null;

	// �� 29 �ϐ������l�F i_c_INV_FLG_JUN


	final static String i_c_INV_FLG_JUN = null;

	// �� 30 �ϐ������l�F i_c_INV_FLG_JUL


	final static String i_c_INV_FLG_JUL = null;

	// �� 31 �ϐ������l�F i_c_INV_FLG_AUG


	final static String i_c_INV_FLG_AUG = null;

	// �� 32 �ϐ������l�F i_c_INV_FLG_SEP


	final static String i_c_INV_FLG_SEP = null;

	// �� 33 �ϐ������l�F i_c_INV_FLG_OCT


	final static String i_c_INV_FLG_OCT = null;

	// �� 34 �ϐ������l�F i_c_INV_FLG_NOV


	final static String i_c_INV_FLG_NOV = null;

	// �� 35 �ϐ������l�F i_c_INV_FLG_DEC


	final static String i_c_INV_FLG_DEC = null;

	// �� 36 �ϐ������l�F i_h_saveITEM_CD


	final static String i_h_saveITEM_CD = null;

	// �� 37 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 38 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------------------
        /**
         * ������
         */
        public void init()
        {
         m_h_INV_FLG_JAN = "0";
         m_h_INV_FLG_FEB = "0";
         m_h_INV_FLG_MAR = "0";
         m_h_INV_FLG_APR = "0";
         m_h_INV_FLG_MAY = "0";
         m_h_INV_FLG_JUN = "0";
         m_h_INV_FLG_JUL = "0";
         m_h_INV_FLG_AUG = "0";
         m_h_INV_FLG_SEP = "0";
         m_h_INV_FLG_OCT = "0";
         m_h_INV_FLG_NOV = "0";
         m_h_INV_FLG_DEC = "0";
         m_w_ITEM_NAME = null;
         m_w_DRAW_CD = null;
         m_w_SPEC = null;
         m_w_MRP_ODR_TYP = null;
         m_w_OUTSIDE_TYP = null;
         m_w_ABC_TYP = null;
       
         m_c_INV_FLG_JAN = null;
         m_c_INV_FLG_FEB = null;
         m_c_INV_FLG_MAR = null;
         m_c_INV_FLG_APR = null;
         m_c_INV_FLG_MAY = null;
         m_c_INV_FLG_JUN = null;
         m_c_INV_FLG_JUL = null;
         m_c_INV_FLG_AUG = null;
         m_c_INV_FLG_SEP = null;
         m_c_INV_FLG_OCT = null;
         m_c_INV_FLG_NOV = null;
         m_c_INV_FLG_DEC = null;
        }
       
        /**
         * �������ϐ��̃R�s�[
         * @param s �R�s�[��
         */
        public void copy(AH0010020Struct s)
        {
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_h_INV_FLG_JAN != null) m_h_INV_FLG_JAN = new String(s.m_h_INV_FLG_JAN);
         if(s.m_h_INV_FLG_FEB != null) m_h_INV_FLG_FEB = new String(s.m_h_INV_FLG_FEB);
         if(s.m_h_INV_FLG_MAR != null) m_h_INV_FLG_MAR = new String(s.m_h_INV_FLG_MAR);
         if(s.m_h_INV_FLG_APR != null) m_h_INV_FLG_APR = new String(s.m_h_INV_FLG_APR);
         if(s.m_h_INV_FLG_MAY != null) m_h_INV_FLG_MAY = new String(s.m_h_INV_FLG_MAY);
         if(s.m_h_INV_FLG_JUN != null) m_h_INV_FLG_JUN = new String(s.m_h_INV_FLG_JUN);
         if(s.m_h_INV_FLG_JUL != null) m_h_INV_FLG_JUL = new String(s.m_h_INV_FLG_JUL);
         if(s.m_h_INV_FLG_AUG != null) m_h_INV_FLG_AUG = new String(s.m_h_INV_FLG_AUG);
         if(s.m_h_INV_FLG_SEP != null) m_h_INV_FLG_SEP = new String(s.m_h_INV_FLG_SEP);
         if(s.m_h_INV_FLG_OCT != null) m_h_INV_FLG_OCT = new String(s.m_h_INV_FLG_OCT);
         if(s.m_h_INV_FLG_NOV != null) m_h_INV_FLG_NOV = new String(s.m_h_INV_FLG_NOV);
         if(s.m_h_INV_FLG_DEC != null) m_h_INV_FLG_DEC = new String(s.m_h_INV_FLG_DEC);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_w_ITEM_NAME != null) m_w_ITEM_NAME = new String(s.m_w_ITEM_NAME);
         if(s.m_w_DRAW_CD != null) m_w_DRAW_CD = new String(s.m_w_DRAW_CD);
         if(s.m_w_SPEC != null) m_w_SPEC = new String(s.m_w_SPEC);
         if(s.m_w_MRP_ODR_TYP != null) m_w_MRP_ODR_TYP = new String(s.m_w_MRP_ODR_TYP);
         if(s.m_w_OUTSIDE_TYP != null) m_w_OUTSIDE_TYP = new String(s.m_w_OUTSIDE_TYP);
         if(s.m_w_ABC_TYP != null) m_w_ABC_TYP = new String(s.m_w_ABC_TYP);
         if(s.m_ERR_ADR != null) m_ERR_ADR = new String(s.m_ERR_ADR);
         if(s.m_ERR_MSG != null) m_ERR_MSG = new String(s.m_ERR_MSG);
         if(s.m_c_INV_FLG_JAN != null) m_c_INV_FLG_JAN = new String(s.m_c_INV_FLG_JAN);
         if(s.m_c_INV_FLG_FEB != null) m_c_INV_FLG_FEB = new String(s.m_c_INV_FLG_FEB);
         if(s.m_c_INV_FLG_MAR != null) m_c_INV_FLG_MAR = new String(s.m_c_INV_FLG_MAR);
         if(s.m_c_INV_FLG_APR != null) m_c_INV_FLG_APR = new String(s.m_c_INV_FLG_APR);
         if(s.m_c_INV_FLG_MAY != null) m_c_INV_FLG_MAY = new String(s.m_c_INV_FLG_MAY);
         if(s.m_c_INV_FLG_JUN != null) m_c_INV_FLG_JUN = new String(s.m_c_INV_FLG_JUN);
         if(s.m_c_INV_FLG_JUL != null) m_c_INV_FLG_JUL = new String(s.m_c_INV_FLG_JUL);
         if(s.m_c_INV_FLG_AUG != null) m_c_INV_FLG_AUG = new String(s.m_c_INV_FLG_AUG);
         if(s.m_c_INV_FLG_SEP != null) m_c_INV_FLG_SEP = new String(s.m_c_INV_FLG_SEP);
         if(s.m_c_INV_FLG_OCT != null) m_c_INV_FLG_OCT = new String(s.m_c_INV_FLG_OCT);
         if(s.m_c_INV_FLG_NOV != null) m_c_INV_FLG_NOV = new String(s.m_c_INV_FLG_NOV);
         if(s.m_c_INV_FLG_DEC != null) m_c_INV_FLG_DEC = new String(s.m_c_INV_FLG_DEC);
         if(s.m_h_saveITEM_CD != null) m_h_saveITEM_CD = new String(s.m_h_saveITEM_CD);
         if(s.m_FileName != null) m_FileName = new String(s.m_FileName);
         if(s.m_w_COLUMN_FLG != null) m_w_COLUMN_FLG = new String(s.m_w_COLUMN_FLG);
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
