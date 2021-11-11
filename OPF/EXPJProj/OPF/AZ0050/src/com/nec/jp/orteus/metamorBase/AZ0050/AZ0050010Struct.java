/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/src/com/nec/jp/orteus/metamorBase/AZ0050/AZ0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0050;

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

public class AZ0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_sub3COLUMN_TYPE */
	public String m_sub3COLUMN_TYPE = null;
	/** �� 2 �ϐ��F m_sub3COND_TYPE */
	public String m_sub3COND_TYPE = null;
	/** �� 3 �ϐ��F m_sub3COND_TYPE_name */
	public String m_sub3COND_TYPE_name = null;
	/** �� 4 �ϐ��F m_sub3COND_TYPE_val */
	public String m_sub3COND_TYPE_val = null;
	/** �� 5 �ϐ��F m_sub3COND_VALUE1 */
	public String m_sub3COND_VALUE1 = null;
	/** �� 6 �ϐ��F m_sub3COND_VALUE2 */
	public String m_sub3COND_VALUE2 = null;
	/** �� 7 �ϐ��F m_sub3DISPLAY_FLG */
	public String m_sub3DISPLAY_FLG = null;
	/** �� 8 �ϐ��F m_sub3SORT_TYPE */
	public String m_sub3SORT_TYPE = null;
	/** �� 9 �ϐ��F m_sub3SORT_TYPE_name */
	public String m_sub3SORT_TYPE_name = null;
	/** �� 10 �ϐ��F m_sub3SORT_TYPE_val */
	public String m_sub3SORT_TYPE_val = null;
	/** �� 11 �ϐ��F m_sub3SORTKEY_PRI */
	public String m_sub3SORTKEY_PRI = null;
	/** �� 12 �ϐ��F m_sub3TABLE_NAME_COMMENT */
	public String m_sub3TABLE_NAME_COMMENT = null;
	/** �� 13 �ϐ��F m_sub3TABLE_NAME */
	public String m_sub3TABLE_NAME = null;
	/** �� 14 �ϐ��F m_sub3COLUMN_NAME */
	public String m_sub3COLUMN_NAME = null;
	/** �� 15 �ϐ��F m_sub3COLUMN_NAME_COMMENT */
	public String m_sub3COLUMN_NAME_COMMENT = null;
	/** �� 16 �ϐ��F m_sub6FREE_SQL */
	public String m_sub6FREE_SQL = null;
	/** �� 17 �ϐ��F m_EDIT_NAME */
	public String m_EDIT_NAME = null;
	/** �� 18 �ϐ��F m_h_TABLE_TO */
	public String m_h_TABLE_TO = null;
	/** �� 19 �ϐ��F m_h_TABLE_COMMENT_TO */
	public String m_h_TABLE_COMMENT_TO = null;
	/** �� 20 �ϐ��F m_h_TABLE_ALIAS_TO */
	public String m_h_TABLE_ALIAS_TO = null;
	/** �� 21 �ϐ��F m_h_LEFT_TABLE_NAME */
	public String m_h_LEFT_TABLE_NAME = null;
	/** �� 22 �ϐ��F m_h_LEFT_TABLE_ALIAS */
	public String m_h_LEFT_TABLE_ALIAS = null;
	/** �� 23 �ϐ��F m_h_LEFT_COLUMN */
	public String m_h_LEFT_COLUMN = null;
	/** �� 24 �ϐ��F m_h_RIGHT_TABLE_NAME */
	public String m_h_RIGHT_TABLE_NAME = null;
	/** �� 25 �ϐ��F m_h_RIGHT_TABLE_ALIAS */
	public String m_h_RIGHT_TABLE_ALIAS = null;
	/** �� 26 �ϐ��F m_h_RIGHT_COLUMN */
	public String m_h_RIGHT_COLUMN = null;
	/** �� 27 �ϐ��F m_h_CONDITION */
	public String m_h_CONDITION = null;
	/** �� 28 �ϐ��F m_h_COLUMN */
	public String m_h_COLUMN = null;
	/** �� 29 �ϐ��F m_h_TABLE_ALIAS */
	public String m_h_TABLE_ALIAS = null;
	/** �� 30 �ϐ��F m_h_TABLE_NAME */
	public String m_h_TABLE_NAME = null;
	/** �� 31 �ϐ��F m_h_GROUP_TO */
	public String m_h_GROUP_TO = null;
	/** �� 32 �ϐ��F m_h_GROUP_CODE_TO */
	public String m_h_GROUP_CODE_TO = null;
	/** �� 33 �ϐ��F m_EDIT_TYP */
	public String m_EDIT_TYP = null;
	/** �� 34 �ϐ��F m_QUERY_NAME */
	public String m_QUERY_NAME = null;
	/** �� 35 �ϐ��F m_QUERY_GROUP */
	public String m_QUERY_GROUP = null;
	/** �� 36 �ϐ��F m_QUERY_MEMO */
	public String m_QUERY_MEMO = null;
	/** �� 37 �ϐ��F m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** �� 38 �ϐ��F m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** �� 39 �ϐ��F m_UPDATED_DATE */
	public String m_UPDATED_DATE = null;
	/** �� 40 �ϐ��F m_UPDATED_BY */
	public String m_UPDATED_BY = null;
	/** �� 41 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 42 �ϐ��F m_QUERY_CD */
	public String m_QUERY_CD = null;
	/** �� 43 �ϐ��F m_SQL_INFO */
	public String m_SQL_INFO = null;
	/** �� 44 �ϐ��F m_CREATED_PRG_NM */
	public String m_CREATED_PRG_NM = null;
	/** �� 45 �ϐ��F m_UPDATED_PRG_NM */
	public String m_UPDATED_PRG_NM = null;
	/** �� 46 �ϐ��F m_w_QUERY_NAME */
	public String m_w_QUERY_NAME = null;
	/** �� 47 �ϐ��F m_w_QUERY_GROUP */
	public String m_w_QUERY_GROUP = null;
	/** �� 48 �ϐ��F m_w_MEMO */
	public String m_w_MEMO = null;
	/** �� 49 �ϐ��F m_w_CREATED_BY */
	public String m_w_CREATED_BY = null;
	/** �� 50 �ϐ��F m_w_CREATED_DATE_FROM */
	public String m_w_CREATED_DATE_FROM = null;
	/** �� 51 �ϐ��F m_w_CREATED_DATE_TO */
	public String m_w_CREATED_DATE_TO = null;
	/** �� 52 �ϐ��F m_BUSINESS_GROUP_CD */
	public String m_BUSINESS_GROUP_CD = null;
	/** �� 53 �ϐ��F m_BUSINESS_GROUP_NAME */
	public String m_BUSINESS_GROUP_NAME = null;
	/** �� 54 �ϐ��F m_SELECTED_GROUP_CD */
	public String m_SELECTED_GROUP_CD = null;
	/** �� 55 �ϐ��F m_SELECTED_GROUP_NAME */
	public String m_SELECTED_GROUP_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_sub3COLUMN_TYPE */
	public List l_sub3COLUMN_TYPE = null;

	/** �� 2 List�ϐ��F l_sub3COND_TYPE */
	public List l_sub3COND_TYPE = null;

	/** �� 3 List�ϐ��F l_sub3COND_TYPE_name */
	public List l_sub3COND_TYPE_name = null;

	/** �� 4 List�ϐ��F l_sub3COND_TYPE_val */
	public List l_sub3COND_TYPE_val = null;

	/** �� 5 List�ϐ��F l_sub3COND_VALUE1 */
	public List l_sub3COND_VALUE1 = null;

	/** �� 6 List�ϐ��F l_sub3COND_VALUE2 */
	public List l_sub3COND_VALUE2 = null;

	/** �� 7 List�ϐ��F l_sub3DISPLAY_FLG */
	public List l_sub3DISPLAY_FLG = null;

	/** �� 8 List�ϐ��F l_sub3SORT_TYPE */
	public List l_sub3SORT_TYPE = null;

	/** �� 9 List�ϐ��F l_sub3SORT_TYPE_name */
	public List l_sub3SORT_TYPE_name = null;

	/** �� 10 List�ϐ��F l_sub3SORT_TYPE_val */
	public List l_sub3SORT_TYPE_val = null;

	/** �� 11 List�ϐ��F l_sub3SORTKEY_PRI */
	public List l_sub3SORTKEY_PRI = null;

	/** �� 12 List�ϐ��F l_sub3TABLE_NAME_COMMENT */
	public List l_sub3TABLE_NAME_COMMENT = null;

	/** �� 13 List�ϐ��F l_sub3TABLE_NAME */
	public List l_sub3TABLE_NAME = null;

	/** �� 14 List�ϐ��F l_sub3COLUMN_NAME */
	public List l_sub3COLUMN_NAME = null;

	/** �� 15 List�ϐ��F l_sub3COLUMN_NAME_COMMENT */
	public List l_sub3COLUMN_NAME_COMMENT = null;

	/** �� 16 List�ϐ��F l_sub6FREE_SQL */
	public List l_sub6FREE_SQL = null;

	/** �� 17 List�ϐ��F l_EDIT_NAME */
	public List l_EDIT_NAME = null;

	/** �� 18 List�ϐ��F l_h_TABLE_TO */
	public List l_h_TABLE_TO = null;

	/** �� 19 List�ϐ��F l_h_TABLE_COMMENT_TO */
	public List l_h_TABLE_COMMENT_TO = null;

	/** �� 20 List�ϐ��F l_h_TABLE_ALIAS_TO */
	public List l_h_TABLE_ALIAS_TO = null;

	/** �� 21 List�ϐ��F l_h_LEFT_TABLE_NAME */
	public List l_h_LEFT_TABLE_NAME = null;

	/** �� 22 List�ϐ��F l_h_LEFT_TABLE_ALIAS */
	public List l_h_LEFT_TABLE_ALIAS = null;

	/** �� 23 List�ϐ��F l_h_LEFT_COLUMN */
	public List l_h_LEFT_COLUMN = null;

	/** �� 24 List�ϐ��F l_h_RIGHT_TABLE_NAME */
	public List l_h_RIGHT_TABLE_NAME = null;

	/** �� 25 List�ϐ��F l_h_RIGHT_TABLE_ALIAS */
	public List l_h_RIGHT_TABLE_ALIAS = null;

	/** �� 26 List�ϐ��F l_h_RIGHT_COLUMN */
	public List l_h_RIGHT_COLUMN = null;

	/** �� 27 List�ϐ��F l_h_CONDITION */
	public List l_h_CONDITION = null;

	/** �� 28 List�ϐ��F l_h_COLUMN */
	public List l_h_COLUMN = null;

	/** �� 29 List�ϐ��F l_h_TABLE_ALIAS */
	public List l_h_TABLE_ALIAS = null;

	/** �� 30 List�ϐ��F l_h_TABLE_NAME */
	public List l_h_TABLE_NAME = null;

	/** �� 31 List�ϐ��F l_h_GROUP_TO */
	public List l_h_GROUP_TO = null;

	/** �� 32 List�ϐ��F l_h_GROUP_CODE_TO */
	public List l_h_GROUP_CODE_TO = null;

	/** �� 33 List�ϐ��F l_EDIT_TYP */
	public List l_EDIT_TYP = null;

	/** �� 34 List�ϐ��F l_QUERY_NAME */
	public List l_QUERY_NAME = null;

	/** �� 35 List�ϐ��F l_QUERY_GROUP */
	public List l_QUERY_GROUP = null;

	/** �� 36 List�ϐ��F l_QUERY_MEMO */
	public List l_QUERY_MEMO = null;

	/** �� 37 List�ϐ��F l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** �� 38 List�ϐ��F l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** �� 39 List�ϐ��F l_UPDATED_DATE */
	public List l_UPDATED_DATE = null;

	/** �� 40 List�ϐ��F l_UPDATED_BY */
	public List l_UPDATED_BY = null;

	/** �� 41 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 42 List�ϐ��F l_QUERY_CD */
	public List l_QUERY_CD = null;

	/** �� 43 List�ϐ��F l_SQL_INFO */
	public List l_SQL_INFO = null;

	/** �� 44 List�ϐ��F l_CREATED_PRG_NM */
	public List l_CREATED_PRG_NM = null;

	/** �� 45 List�ϐ��F l_UPDATED_PRG_NM */
	public List l_UPDATED_PRG_NM = null;

	/** �� 46 List�ϐ��F l_w_QUERY_NAME */
	public List l_w_QUERY_NAME = null;

	/** �� 47 List�ϐ��F l_w_QUERY_GROUP */
	public List l_w_QUERY_GROUP = null;

	/** �� 48 List�ϐ��F l_w_MEMO */
	public List l_w_MEMO = null;

	/** �� 49 List�ϐ��F l_w_CREATED_BY */
	public List l_w_CREATED_BY = null;

	/** �� 50 List�ϐ��F l_w_CREATED_DATE_FROM */
	public List l_w_CREATED_DATE_FROM = null;

	/** �� 51 List�ϐ��F l_w_CREATED_DATE_TO */
	public List l_w_CREATED_DATE_TO = null;

	/** �� 52 List�ϐ��F l_BUSINESS_GROUP_CD */
	public List l_BUSINESS_GROUP_CD = null;

	/** �� 53 List�ϐ��F l_BUSINESS_GROUP_NAME */
	public List l_BUSINESS_GROUP_NAME = null;

	/** �� 54 List�ϐ��F l_SELECTED_GROUP_CD */
	public List l_SELECTED_GROUP_CD = null;

	/** �� 55 List�ϐ��F l_SELECTED_GROUP_NAME */
	public List l_SELECTED_GROUP_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getsub3COLUMN_TYPE() { return m_sub3COLUMN_TYPE; }
	public String getsub3COND_TYPE() { return m_sub3COND_TYPE; }
	public String getsub3COND_TYPE_name() { return m_sub3COND_TYPE_name; }
	public String getsub3COND_TYPE_val() { return m_sub3COND_TYPE_val; }
	public String getsub3COND_VALUE1() { return m_sub3COND_VALUE1; }
	public String getsub3COND_VALUE2() { return m_sub3COND_VALUE2; }
	public String getsub3DISPLAY_FLG() { return m_sub3DISPLAY_FLG; }
	public String getsub3SORT_TYPE() { return m_sub3SORT_TYPE; }
	public String getsub3SORT_TYPE_name() { return m_sub3SORT_TYPE_name; }
	public String getsub3SORT_TYPE_val() { return m_sub3SORT_TYPE_val; }
	public String getsub3SORTKEY_PRI() { return m_sub3SORTKEY_PRI; }
	public String getsub3TABLE_NAME_COMMENT() { return m_sub3TABLE_NAME_COMMENT; }
	public String getsub3TABLE_NAME() { return m_sub3TABLE_NAME; }
	public String getsub3COLUMN_NAME() { return m_sub3COLUMN_NAME; }
	public String getsub3COLUMN_NAME_COMMENT() { return m_sub3COLUMN_NAME_COMMENT; }
	public String getsub6FREE_SQL() { return m_sub6FREE_SQL; }
	public String getEDIT_NAME() { return m_EDIT_NAME; }
	public String geth_TABLE_TO() { return m_h_TABLE_TO; }
	public String geth_TABLE_COMMENT_TO() { return m_h_TABLE_COMMENT_TO; }
	public String geth_TABLE_ALIAS_TO() { return m_h_TABLE_ALIAS_TO; }
	public String geth_LEFT_TABLE_NAME() { return m_h_LEFT_TABLE_NAME; }
	public String geth_LEFT_TABLE_ALIAS() { return m_h_LEFT_TABLE_ALIAS; }
	public String geth_LEFT_COLUMN() { return m_h_LEFT_COLUMN; }
	public String geth_RIGHT_TABLE_NAME() { return m_h_RIGHT_TABLE_NAME; }
	public String geth_RIGHT_TABLE_ALIAS() { return m_h_RIGHT_TABLE_ALIAS; }
	public String geth_RIGHT_COLUMN() { return m_h_RIGHT_COLUMN; }
	public String geth_CONDITION() { return m_h_CONDITION; }
	public String geth_COLUMN() { return m_h_COLUMN; }
	public String geth_TABLE_ALIAS() { return m_h_TABLE_ALIAS; }
	public String geth_TABLE_NAME() { return m_h_TABLE_NAME; }
	public String geth_GROUP_TO() { return m_h_GROUP_TO; }
	public String geth_GROUP_CODE_TO() { return m_h_GROUP_CODE_TO; }
	public String getEDIT_TYP() { return m_EDIT_TYP; }
	public String getQUERY_NAME() { return m_QUERY_NAME; }
	public String getQUERY_GROUP() { return m_QUERY_GROUP; }
	public String getQUERY_MEMO() { return m_QUERY_MEMO; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getUPDATED_BY() { return m_UPDATED_BY; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getQUERY_CD() { return m_QUERY_CD; }
	public String getSQL_INFO() { return m_SQL_INFO; }
	public String getCREATED_PRG_NM() { return m_CREATED_PRG_NM; }
	public String getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String getw_QUERY_NAME() { return m_w_QUERY_NAME; }
	public String getw_QUERY_GROUP() { return m_w_QUERY_GROUP; }
	public String getw_MEMO() { return m_w_MEMO; }
	public String getw_CREATED_BY() { return m_w_CREATED_BY; }
	public String getw_CREATED_DATE_FROM() { return m_w_CREATED_DATE_FROM; }
	public String getw_CREATED_DATE_TO() { return m_w_CREATED_DATE_TO; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_GROUP_NAME() { return m_BUSINESS_GROUP_NAME; }
	public String getSELECTED_GROUP_CD() { return m_SELECTED_GROUP_CD; }
	public String getSELECTED_GROUP_NAME() { return m_SELECTED_GROUP_NAME; }

	public List getList_sub3COLUMN_TYPE() { return l_sub3COLUMN_TYPE; }
	public List getList_sub3COND_TYPE() { return l_sub3COND_TYPE; }
	public List getList_sub3COND_TYPE_name() { return l_sub3COND_TYPE_name; }
	public List getList_sub3COND_TYPE_val() { return l_sub3COND_TYPE_val; }
	public List getList_sub3COND_VALUE1() { return l_sub3COND_VALUE1; }
	public List getList_sub3COND_VALUE2() { return l_sub3COND_VALUE2; }
	public List getList_sub3DISPLAY_FLG() { return l_sub3DISPLAY_FLG; }
	public List getList_sub3SORT_TYPE() { return l_sub3SORT_TYPE; }
	public List getList_sub3SORT_TYPE_name() { return l_sub3SORT_TYPE_name; }
	public List getList_sub3SORT_TYPE_val() { return l_sub3SORT_TYPE_val; }
	public List getList_sub3SORTKEY_PRI() { return l_sub3SORTKEY_PRI; }
	public List getList_sub3TABLE_NAME_COMMENT() { return l_sub3TABLE_NAME_COMMENT; }
	public List getList_sub3TABLE_NAME() { return l_sub3TABLE_NAME; }
	public List getList_sub3COLUMN_NAME() { return l_sub3COLUMN_NAME; }
	public List getList_sub3COLUMN_NAME_COMMENT() { return l_sub3COLUMN_NAME_COMMENT; }
	public List getList_sub6FREE_SQL() { return l_sub6FREE_SQL; }
	public List getList_EDIT_NAME() { return l_EDIT_NAME; }
	public List getList_h_TABLE_TO() { return l_h_TABLE_TO; }
	public List getList_h_TABLE_COMMENT_TO() { return l_h_TABLE_COMMENT_TO; }
	public List getList_h_TABLE_ALIAS_TO() { return l_h_TABLE_ALIAS_TO; }
	public List getList_h_LEFT_TABLE_NAME() { return l_h_LEFT_TABLE_NAME; }
	public List getList_h_LEFT_TABLE_ALIAS() { return l_h_LEFT_TABLE_ALIAS; }
	public List getList_h_LEFT_COLUMN() { return l_h_LEFT_COLUMN; }
	public List getList_h_RIGHT_TABLE_NAME() { return l_h_RIGHT_TABLE_NAME; }
	public List getList_h_RIGHT_TABLE_ALIAS() { return l_h_RIGHT_TABLE_ALIAS; }
	public List getList_h_RIGHT_COLUMN() { return l_h_RIGHT_COLUMN; }
	public List getList_h_CONDITION() { return l_h_CONDITION; }
	public List getList_h_COLUMN() { return l_h_COLUMN; }
	public List getList_h_TABLE_ALIAS() { return l_h_TABLE_ALIAS; }
	public List getList_h_TABLE_NAME() { return l_h_TABLE_NAME; }
	public List getList_h_GROUP_TO() { return l_h_GROUP_TO; }
	public List getList_h_GROUP_CODE_TO() { return l_h_GROUP_CODE_TO; }
	public List getList_EDIT_TYP() { return l_EDIT_TYP; }
	public List getList_QUERY_NAME() { return l_QUERY_NAME; }
	public List getList_QUERY_GROUP() { return l_QUERY_GROUP; }
	public List getList_QUERY_MEMO() { return l_QUERY_MEMO; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_UPDATED_DATE() { return l_UPDATED_DATE; }
	public List getList_UPDATED_BY() { return l_UPDATED_BY; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_QUERY_CD() { return l_QUERY_CD; }
	public List getList_SQL_INFO() { return l_SQL_INFO; }
	public List getList_CREATED_PRG_NM() { return l_CREATED_PRG_NM; }
	public List getList_UPDATED_PRG_NM() { return l_UPDATED_PRG_NM; }
	public List getList_w_QUERY_NAME() { return l_w_QUERY_NAME; }
	public List getList_w_QUERY_GROUP() { return l_w_QUERY_GROUP; }
	public List getList_w_MEMO() { return l_w_MEMO; }
	public List getList_w_CREATED_BY() { return l_w_CREATED_BY; }
	public List getList_w_CREATED_DATE_FROM() { return l_w_CREATED_DATE_FROM; }
	public List getList_w_CREATED_DATE_TO() { return l_w_CREATED_DATE_TO; }
	public List getList_BUSINESS_GROUP_CD() { return l_BUSINESS_GROUP_CD; }
	public List getList_BUSINESS_GROUP_NAME() { return l_BUSINESS_GROUP_NAME; }
	public List getList_SELECTED_GROUP_CD() { return l_SELECTED_GROUP_CD; }
	public List getList_SELECTED_GROUP_NAME() { return l_SELECTED_GROUP_NAME; }

	public void setsub3COLUMN_TYPE(String val) { m_sub3COLUMN_TYPE = val; }
	public void setsub3COND_TYPE(String val) { m_sub3COND_TYPE = val; }
	public void setsub3COND_TYPE_name(String val) { m_sub3COND_TYPE_name = val; }
	public void setsub3COND_TYPE_val(String val) { m_sub3COND_TYPE_val = val; }
	public void setsub3COND_VALUE1(String val) { m_sub3COND_VALUE1 = val; }
	public void setsub3COND_VALUE2(String val) { m_sub3COND_VALUE2 = val; }
	public void setsub3DISPLAY_FLG(String val) { m_sub3DISPLAY_FLG = val; }
	public void setsub3SORT_TYPE(String val) { m_sub3SORT_TYPE = val; }
	public void setsub3SORT_TYPE_name(String val) { m_sub3SORT_TYPE_name = val; }
	public void setsub3SORT_TYPE_val(String val) { m_sub3SORT_TYPE_val = val; }
	public void setsub3SORTKEY_PRI(String val) { m_sub3SORTKEY_PRI = val; }
	public void setsub3TABLE_NAME_COMMENT(String val) { m_sub3TABLE_NAME_COMMENT = val; }
	public void setsub3TABLE_NAME(String val) { m_sub3TABLE_NAME = val; }
	public void setsub3COLUMN_NAME(String val) { m_sub3COLUMN_NAME = val; }
	public void setsub3COLUMN_NAME_COMMENT(String val) { m_sub3COLUMN_NAME_COMMENT = val; }
	public void setsub6FREE_SQL(String val) { m_sub6FREE_SQL = val; }
	public void setEDIT_NAME(String val) { m_EDIT_NAME = val; }
	public void seth_TABLE_TO(String val) { m_h_TABLE_TO = val; }
	public void seth_TABLE_COMMENT_TO(String val) { m_h_TABLE_COMMENT_TO = val; }
	public void seth_TABLE_ALIAS_TO(String val) { m_h_TABLE_ALIAS_TO = val; }
	public void seth_LEFT_TABLE_NAME(String val) { m_h_LEFT_TABLE_NAME = val; }
	public void seth_LEFT_TABLE_ALIAS(String val) { m_h_LEFT_TABLE_ALIAS = val; }
	public void seth_LEFT_COLUMN(String val) { m_h_LEFT_COLUMN = val; }
	public void seth_RIGHT_TABLE_NAME(String val) { m_h_RIGHT_TABLE_NAME = val; }
	public void seth_RIGHT_TABLE_ALIAS(String val) { m_h_RIGHT_TABLE_ALIAS = val; }
	public void seth_RIGHT_COLUMN(String val) { m_h_RIGHT_COLUMN = val; }
	public void seth_CONDITION(String val) { m_h_CONDITION = val; }
	public void seth_COLUMN(String val) { m_h_COLUMN = val; }
	public void seth_TABLE_ALIAS(String val) { m_h_TABLE_ALIAS = val; }
	public void seth_TABLE_NAME(String val) { m_h_TABLE_NAME = val; }
	public void seth_GROUP_TO(String val) { m_h_GROUP_TO = val; }
	public void seth_GROUP_CODE_TO(String val) { m_h_GROUP_CODE_TO = val; }
	public void setEDIT_TYP(String val) { m_EDIT_TYP = val; }
	public void setQUERY_NAME(String val) { m_QUERY_NAME = val; }
	public void setQUERY_GROUP(String val) { m_QUERY_GROUP = val; }
	public void setQUERY_MEMO(String val) { m_QUERY_MEMO = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setUPDATED_DATE(String val) { m_UPDATED_DATE = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setQUERY_CD(String val) { m_QUERY_CD = val; }
	public void setSQL_INFO(String val) { m_SQL_INFO = val; }
	public void setCREATED_PRG_NM(String val) { m_CREATED_PRG_NM = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setw_QUERY_NAME(String val) { m_w_QUERY_NAME = val; }
	public void setw_QUERY_GROUP(String val) { m_w_QUERY_GROUP = val; }
	public void setw_MEMO(String val) { m_w_MEMO = val; }
	public void setw_CREATED_BY(String val) { m_w_CREATED_BY = val; }
	public void setw_CREATED_DATE_FROM(String val) { m_w_CREATED_DATE_FROM = val; }
	public void setw_CREATED_DATE_TO(String val) { m_w_CREATED_DATE_TO = val; }
	public void setBUSINESS_GROUP_CD(String val) { m_BUSINESS_GROUP_CD = val; }
	public void setBUSINESS_GROUP_NAME(String val) { m_BUSINESS_GROUP_NAME = val; }
	public void setSELECTED_GROUP_CD(String val) { m_SELECTED_GROUP_CD = val; }
	public void setSELECTED_GROUP_NAME(String val) { m_SELECTED_GROUP_NAME = val; }


	public void setList_sub3COLUMN_TYPE(List list) { l_sub3COLUMN_TYPE = list; }
	public void setList_sub3COND_TYPE(List list) { l_sub3COND_TYPE = list; }
	public void setList_sub3COND_TYPE_name(List list) { l_sub3COND_TYPE_name = list; }
	public void setList_sub3COND_TYPE_val(List list) { l_sub3COND_TYPE_val = list; }
	public void setList_sub3COND_VALUE1(List list) { l_sub3COND_VALUE1 = list; }
	public void setList_sub3COND_VALUE2(List list) { l_sub3COND_VALUE2 = list; }
	public void setList_sub3DISPLAY_FLG(List list) { l_sub3DISPLAY_FLG = list; }
	public void setList_sub3SORT_TYPE(List list) { l_sub3SORT_TYPE = list; }
	public void setList_sub3SORT_TYPE_name(List list) { l_sub3SORT_TYPE_name = list; }
	public void setList_sub3SORT_TYPE_val(List list) { l_sub3SORT_TYPE_val = list; }
	public void setList_sub3SORTKEY_PRI(List list) { l_sub3SORTKEY_PRI = list; }
	public void setList_sub3TABLE_NAME_COMMENT(List list) { l_sub3TABLE_NAME_COMMENT = list; }
	public void setList_sub3TABLE_NAME(List list) { l_sub3TABLE_NAME = list; }
	public void setList_sub3COLUMN_NAME(List list) { l_sub3COLUMN_NAME = list; }
	public void setList_sub3COLUMN_NAME_COMMENT(List list) { l_sub3COLUMN_NAME_COMMENT = list; }
	public void setList_sub6FREE_SQL(List list) { l_sub6FREE_SQL = list; }
	public void setList_EDIT_NAME(List list) { l_EDIT_NAME = list; }
	public void setList_h_TABLE_TO(List list) { l_h_TABLE_TO = list; }
	public void setList_h_TABLE_COMMENT_TO(List list) { l_h_TABLE_COMMENT_TO = list; }
	public void setList_h_TABLE_ALIAS_TO(List list) { l_h_TABLE_ALIAS_TO = list; }
	public void setList_h_LEFT_TABLE_NAME(List list) { l_h_LEFT_TABLE_NAME = list; }
	public void setList_h_LEFT_TABLE_ALIAS(List list) { l_h_LEFT_TABLE_ALIAS = list; }
	public void setList_h_LEFT_COLUMN(List list) { l_h_LEFT_COLUMN = list; }
	public void setList_h_RIGHT_TABLE_NAME(List list) { l_h_RIGHT_TABLE_NAME = list; }
	public void setList_h_RIGHT_TABLE_ALIAS(List list) { l_h_RIGHT_TABLE_ALIAS = list; }
	public void setList_h_RIGHT_COLUMN(List list) { l_h_RIGHT_COLUMN = list; }
	public void setList_h_CONDITION(List list) { l_h_CONDITION = list; }
	public void setList_h_COLUMN(List list) { l_h_COLUMN = list; }
	public void setList_h_TABLE_ALIAS(List list) { l_h_TABLE_ALIAS = list; }
	public void setList_h_TABLE_NAME(List list) { l_h_TABLE_NAME = list; }
	public void setList_h_GROUP_TO(List list) { l_h_GROUP_TO = list; }
	public void setList_h_GROUP_CODE_TO(List list) { l_h_GROUP_CODE_TO = list; }
	public void setList_EDIT_TYP(List list) { l_EDIT_TYP = list; }
	public void setList_QUERY_NAME(List list) { l_QUERY_NAME = list; }
	public void setList_QUERY_GROUP(List list) { l_QUERY_GROUP = list; }
	public void setList_QUERY_MEMO(List list) { l_QUERY_MEMO = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_UPDATED_DATE(List list) { l_UPDATED_DATE = list; }
	public void setList_UPDATED_BY(List list) { l_UPDATED_BY = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_QUERY_CD(List list) { l_QUERY_CD = list; }
	public void setList_SQL_INFO(List list) { l_SQL_INFO = list; }
	public void setList_CREATED_PRG_NM(List list) { l_CREATED_PRG_NM = list; }
	public void setList_UPDATED_PRG_NM(List list) { l_UPDATED_PRG_NM = list; }
	public void setList_w_QUERY_NAME(List list) { l_w_QUERY_NAME = list; }
	public void setList_w_QUERY_GROUP(List list) { l_w_QUERY_GROUP = list; }
	public void setList_w_MEMO(List list) { l_w_MEMO = list; }
	public void setList_w_CREATED_BY(List list) { l_w_CREATED_BY = list; }
	public void setList_w_CREATED_DATE_FROM(List list) { l_w_CREATED_DATE_FROM = list; }
	public void setList_w_CREATED_DATE_TO(List list) { l_w_CREATED_DATE_TO = list; }
	public void setList_BUSINESS_GROUP_CD(List list) { l_BUSINESS_GROUP_CD = list; }
	public void setList_BUSINESS_GROUP_NAME(List list) { l_BUSINESS_GROUP_NAME = list; }
	public void setList_SELECTED_GROUP_CD(List list) { l_SELECTED_GROUP_CD = list; }
	public void setList_SELECTED_GROUP_NAME(List list) { l_SELECTED_GROUP_NAME = list; }

	public int setL2L_sub3COLUMN_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COLUMN_TYPE == null) {
			l_sub3COLUMN_TYPE = new ArrayList();
		} else {
			l_sub3COLUMN_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COLUMN_TYPE.add(((AZ0050010Struct) list.get(i)).getsub3COLUMN_TYPE());
		}
		return size;
	}
	public int setL2L_sub3COND_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COND_TYPE == null) {
			l_sub3COND_TYPE = new ArrayList();
		} else {
			l_sub3COND_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COND_TYPE.add(((AZ0050010Struct) list.get(i)).getsub3COND_TYPE());
		}
		return size;
	}
	public int setL2L_sub3COND_TYPE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COND_TYPE_name == null) {
			l_sub3COND_TYPE_name = new ArrayList();
		} else {
			l_sub3COND_TYPE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COND_TYPE_name.add(((AZ0050010Struct) list.get(i)).getsub3COND_TYPE_name());
		}
		return size;
	}
	public int setL2L_sub3COND_TYPE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COND_TYPE_val == null) {
			l_sub3COND_TYPE_val = new ArrayList();
		} else {
			l_sub3COND_TYPE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COND_TYPE_val.add(((AZ0050010Struct) list.get(i)).getsub3COND_TYPE_val());
		}
		return size;
	}
	public int setL2L_sub3COND_VALUE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COND_VALUE1 == null) {
			l_sub3COND_VALUE1 = new ArrayList();
		} else {
			l_sub3COND_VALUE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COND_VALUE1.add(((AZ0050010Struct) list.get(i)).getsub3COND_VALUE1());
		}
		return size;
	}
	public int setL2L_sub3COND_VALUE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COND_VALUE2 == null) {
			l_sub3COND_VALUE2 = new ArrayList();
		} else {
			l_sub3COND_VALUE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COND_VALUE2.add(((AZ0050010Struct) list.get(i)).getsub3COND_VALUE2());
		}
		return size;
	}
	public int setL2L_sub3DISPLAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3DISPLAY_FLG == null) {
			l_sub3DISPLAY_FLG = new ArrayList();
		} else {
			l_sub3DISPLAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3DISPLAY_FLG.add(((AZ0050010Struct) list.get(i)).getsub3DISPLAY_FLG());
		}
		return size;
	}
	public int setL2L_sub3SORT_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3SORT_TYPE == null) {
			l_sub3SORT_TYPE = new ArrayList();
		} else {
			l_sub3SORT_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3SORT_TYPE.add(((AZ0050010Struct) list.get(i)).getsub3SORT_TYPE());
		}
		return size;
	}
	public int setL2L_sub3SORT_TYPE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3SORT_TYPE_name == null) {
			l_sub3SORT_TYPE_name = new ArrayList();
		} else {
			l_sub3SORT_TYPE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3SORT_TYPE_name.add(((AZ0050010Struct) list.get(i)).getsub3SORT_TYPE_name());
		}
		return size;
	}
	public int setL2L_sub3SORT_TYPE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3SORT_TYPE_val == null) {
			l_sub3SORT_TYPE_val = new ArrayList();
		} else {
			l_sub3SORT_TYPE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3SORT_TYPE_val.add(((AZ0050010Struct) list.get(i)).getsub3SORT_TYPE_val());
		}
		return size;
	}
	public int setL2L_sub3SORTKEY_PRI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3SORTKEY_PRI == null) {
			l_sub3SORTKEY_PRI = new ArrayList();
		} else {
			l_sub3SORTKEY_PRI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3SORTKEY_PRI.add(((AZ0050010Struct) list.get(i)).getsub3SORTKEY_PRI());
		}
		return size;
	}
	public int setL2L_sub3TABLE_NAME_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3TABLE_NAME_COMMENT == null) {
			l_sub3TABLE_NAME_COMMENT = new ArrayList();
		} else {
			l_sub3TABLE_NAME_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3TABLE_NAME_COMMENT.add(((AZ0050010Struct) list.get(i)).getsub3TABLE_NAME_COMMENT());
		}
		return size;
	}
	public int setL2L_sub3TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3TABLE_NAME == null) {
			l_sub3TABLE_NAME = new ArrayList();
		} else {
			l_sub3TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3TABLE_NAME.add(((AZ0050010Struct) list.get(i)).getsub3TABLE_NAME());
		}
		return size;
	}
	public int setL2L_sub3COLUMN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COLUMN_NAME == null) {
			l_sub3COLUMN_NAME = new ArrayList();
		} else {
			l_sub3COLUMN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COLUMN_NAME.add(((AZ0050010Struct) list.get(i)).getsub3COLUMN_NAME());
		}
		return size;
	}
	public int setL2L_sub3COLUMN_NAME_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub3COLUMN_NAME_COMMENT == null) {
			l_sub3COLUMN_NAME_COMMENT = new ArrayList();
		} else {
			l_sub3COLUMN_NAME_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub3COLUMN_NAME_COMMENT.add(((AZ0050010Struct) list.get(i)).getsub3COLUMN_NAME_COMMENT());
		}
		return size;
	}
	public int setL2L_sub6FREE_SQL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub6FREE_SQL == null) {
			l_sub6FREE_SQL = new ArrayList();
		} else {
			l_sub6FREE_SQL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub6FREE_SQL.add(((AZ0050010Struct) list.get(i)).getsub6FREE_SQL());
		}
		return size;
	}
	public int setL2L_EDIT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDIT_NAME == null) {
			l_EDIT_NAME = new ArrayList();
		} else {
			l_EDIT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDIT_NAME.add(((AZ0050010Struct) list.get(i)).getEDIT_NAME());
		}
		return size;
	}
	public int setL2L_h_TABLE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_TO == null) {
			l_h_TABLE_TO = new ArrayList();
		} else {
			l_h_TABLE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_TO.add(((AZ0050010Struct) list.get(i)).geth_TABLE_TO());
		}
		return size;
	}
	public int setL2L_h_TABLE_COMMENT_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_COMMENT_TO == null) {
			l_h_TABLE_COMMENT_TO = new ArrayList();
		} else {
			l_h_TABLE_COMMENT_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_COMMENT_TO.add(((AZ0050010Struct) list.get(i)).geth_TABLE_COMMENT_TO());
		}
		return size;
	}
	public int setL2L_h_TABLE_ALIAS_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_ALIAS_TO == null) {
			l_h_TABLE_ALIAS_TO = new ArrayList();
		} else {
			l_h_TABLE_ALIAS_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_ALIAS_TO.add(((AZ0050010Struct) list.get(i)).geth_TABLE_ALIAS_TO());
		}
		return size;
	}
	public int setL2L_h_LEFT_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_TABLE_NAME == null) {
			l_h_LEFT_TABLE_NAME = new ArrayList();
		} else {
			l_h_LEFT_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_TABLE_NAME.add(((AZ0050010Struct) list.get(i)).geth_LEFT_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_h_LEFT_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_TABLE_ALIAS == null) {
			l_h_LEFT_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_LEFT_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_TABLE_ALIAS.add(((AZ0050010Struct) list.get(i)).geth_LEFT_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_LEFT_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LEFT_COLUMN == null) {
			l_h_LEFT_COLUMN = new ArrayList();
		} else {
			l_h_LEFT_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LEFT_COLUMN.add(((AZ0050010Struct) list.get(i)).geth_LEFT_COLUMN());
		}
		return size;
	}
	public int setL2L_h_RIGHT_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_TABLE_NAME == null) {
			l_h_RIGHT_TABLE_NAME = new ArrayList();
		} else {
			l_h_RIGHT_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_TABLE_NAME.add(((AZ0050010Struct) list.get(i)).geth_RIGHT_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_h_RIGHT_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_TABLE_ALIAS == null) {
			l_h_RIGHT_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_RIGHT_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_TABLE_ALIAS.add(((AZ0050010Struct) list.get(i)).geth_RIGHT_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_RIGHT_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RIGHT_COLUMN == null) {
			l_h_RIGHT_COLUMN = new ArrayList();
		} else {
			l_h_RIGHT_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RIGHT_COLUMN.add(((AZ0050010Struct) list.get(i)).geth_RIGHT_COLUMN());
		}
		return size;
	}
	public int setL2L_h_CONDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CONDITION == null) {
			l_h_CONDITION = new ArrayList();
		} else {
			l_h_CONDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CONDITION.add(((AZ0050010Struct) list.get(i)).geth_CONDITION());
		}
		return size;
	}
	public int setL2L_h_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COLUMN == null) {
			l_h_COLUMN = new ArrayList();
		} else {
			l_h_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COLUMN.add(((AZ0050010Struct) list.get(i)).geth_COLUMN());
		}
		return size;
	}
	public int setL2L_h_TABLE_ALIAS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_ALIAS == null) {
			l_h_TABLE_ALIAS = new ArrayList();
		} else {
			l_h_TABLE_ALIAS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_ALIAS.add(((AZ0050010Struct) list.get(i)).geth_TABLE_ALIAS());
		}
		return size;
	}
	public int setL2L_h_TABLE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TABLE_NAME == null) {
			l_h_TABLE_NAME = new ArrayList();
		} else {
			l_h_TABLE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TABLE_NAME.add(((AZ0050010Struct) list.get(i)).geth_TABLE_NAME());
		}
		return size;
	}
	public int setL2L_h_GROUP_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_GROUP_TO == null) {
			l_h_GROUP_TO = new ArrayList();
		} else {
			l_h_GROUP_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_GROUP_TO.add(((AZ0050010Struct) list.get(i)).geth_GROUP_TO());
		}
		return size;
	}
	public int setL2L_h_GROUP_CODE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_GROUP_CODE_TO == null) {
			l_h_GROUP_CODE_TO = new ArrayList();
		} else {
			l_h_GROUP_CODE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_GROUP_CODE_TO.add(((AZ0050010Struct) list.get(i)).geth_GROUP_CODE_TO());
		}
		return size;
	}
	public int setL2L_EDIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDIT_TYP == null) {
			l_EDIT_TYP = new ArrayList();
		} else {
			l_EDIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDIT_TYP.add(((AZ0050010Struct) list.get(i)).getEDIT_TYP());
		}
		return size;
	}
	public int setL2L_QUERY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_NAME == null) {
			l_QUERY_NAME = new ArrayList();
		} else {
			l_QUERY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_NAME.add(((AZ0050010Struct) list.get(i)).getQUERY_NAME());
		}
		return size;
	}
	public int setL2L_QUERY_GROUP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_GROUP == null) {
			l_QUERY_GROUP = new ArrayList();
		} else {
			l_QUERY_GROUP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_GROUP.add(((AZ0050010Struct) list.get(i)).getQUERY_GROUP());
		}
		return size;
	}
	public int setL2L_QUERY_MEMO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_MEMO == null) {
			l_QUERY_MEMO = new ArrayList();
		} else {
			l_QUERY_MEMO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_MEMO.add(((AZ0050010Struct) list.get(i)).getQUERY_MEMO());
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
			l_CREATED_DATE.add(((AZ0050010Struct) list.get(i)).getCREATED_DATE());
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
			l_CREATED_BY.add(((AZ0050010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_DATE == null) {
			l_UPDATED_DATE = new ArrayList();
		} else {
			l_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_DATE.add(((AZ0050010Struct) list.get(i)).getUPDATED_DATE());
		}
		return size;
	}
	public int setL2L_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_BY == null) {
			l_UPDATED_BY = new ArrayList();
		} else {
			l_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_BY.add(((AZ0050010Struct) list.get(i)).getUPDATED_BY());
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
			l_MODIFY_COUNT.add(((AZ0050010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_QUERY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUERY_CD == null) {
			l_QUERY_CD = new ArrayList();
		} else {
			l_QUERY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUERY_CD.add(((AZ0050010Struct) list.get(i)).getQUERY_CD());
		}
		return size;
	}
	public int setL2L_SQL_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SQL_INFO == null) {
			l_SQL_INFO = new ArrayList();
		} else {
			l_SQL_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SQL_INFO.add(((AZ0050010Struct) list.get(i)).getSQL_INFO());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM == null) {
			l_CREATED_PRG_NM = new ArrayList();
		} else {
			l_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM.add(((AZ0050010Struct) list.get(i)).getCREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_PRG_NM == null) {
			l_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_PRG_NM.add(((AZ0050010Struct) list.get(i)).getUPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_w_QUERY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_QUERY_NAME == null) {
			l_w_QUERY_NAME = new ArrayList();
		} else {
			l_w_QUERY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_QUERY_NAME.add(((AZ0050010Struct) list.get(i)).getw_QUERY_NAME());
		}
		return size;
	}
	public int setL2L_w_QUERY_GROUP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_QUERY_GROUP == null) {
			l_w_QUERY_GROUP = new ArrayList();
		} else {
			l_w_QUERY_GROUP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_QUERY_GROUP.add(((AZ0050010Struct) list.get(i)).getw_QUERY_GROUP());
		}
		return size;
	}
	public int setL2L_w_MEMO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MEMO == null) {
			l_w_MEMO = new ArrayList();
		} else {
			l_w_MEMO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MEMO.add(((AZ0050010Struct) list.get(i)).getw_MEMO());
		}
		return size;
	}
	public int setL2L_w_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_BY == null) {
			l_w_CREATED_BY = new ArrayList();
		} else {
			l_w_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_BY.add(((AZ0050010Struct) list.get(i)).getw_CREATED_BY());
		}
		return size;
	}
	public int setL2L_w_CREATED_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_DATE_FROM == null) {
			l_w_CREATED_DATE_FROM = new ArrayList();
		} else {
			l_w_CREATED_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_DATE_FROM.add(((AZ0050010Struct) list.get(i)).getw_CREATED_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_CREATED_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CREATED_DATE_TO == null) {
			l_w_CREATED_DATE_TO = new ArrayList();
		} else {
			l_w_CREATED_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CREATED_DATE_TO.add(((AZ0050010Struct) list.get(i)).getw_CREATED_DATE_TO());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_CD == null) {
			l_BUSINESS_GROUP_CD = new ArrayList();
		} else {
			l_BUSINESS_GROUP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_CD.add(((AZ0050010Struct) list.get(i)).getBUSINESS_GROUP_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_NAME == null) {
			l_BUSINESS_GROUP_NAME = new ArrayList();
		} else {
			l_BUSINESS_GROUP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_NAME.add(((AZ0050010Struct) list.get(i)).getBUSINESS_GROUP_NAME());
		}
		return size;
	}
	public int setL2L_SELECTED_GROUP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SELECTED_GROUP_CD == null) {
			l_SELECTED_GROUP_CD = new ArrayList();
		} else {
			l_SELECTED_GROUP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SELECTED_GROUP_CD.add(((AZ0050010Struct) list.get(i)).getSELECTED_GROUP_CD());
		}
		return size;
	}
	public int setL2L_SELECTED_GROUP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SELECTED_GROUP_NAME == null) {
			l_SELECTED_GROUP_NAME = new ArrayList();
		} else {
			l_SELECTED_GROUP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SELECTED_GROUP_NAME.add(((AZ0050010Struct) list.get(i)).getSELECTED_GROUP_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_sub3COLUMN_TYPE = null;
		m_sub3COND_TYPE = null;
		m_sub3COND_TYPE_name = null;
		m_sub3COND_TYPE_val = null;
		m_sub3COND_VALUE1 = null;
		m_sub3COND_VALUE2 = null;
		m_sub3DISPLAY_FLG = null;
		m_sub3SORT_TYPE = null;
		m_sub3SORT_TYPE_name = null;
		m_sub3SORT_TYPE_val = null;
		m_sub3SORTKEY_PRI = null;
		m_sub3TABLE_NAME_COMMENT = null;
		m_sub3TABLE_NAME = null;
		m_sub3COLUMN_NAME = null;
		m_sub3COLUMN_NAME_COMMENT = null;
		m_sub6FREE_SQL = null;
		m_EDIT_NAME = null;
		m_h_TABLE_TO = null;
		m_h_TABLE_COMMENT_TO = null;
		m_h_TABLE_ALIAS_TO = null;
		m_h_LEFT_TABLE_NAME = null;
		m_h_LEFT_TABLE_ALIAS = null;
		m_h_LEFT_COLUMN = null;
		m_h_RIGHT_TABLE_NAME = null;
		m_h_RIGHT_TABLE_ALIAS = null;
		m_h_RIGHT_COLUMN = null;
		m_h_CONDITION = null;
		m_h_COLUMN = null;
		m_h_TABLE_ALIAS = null;
		m_h_TABLE_NAME = null;
		m_h_GROUP_TO = null;
		m_h_GROUP_CODE_TO = null;
		m_EDIT_TYP = null;
		m_QUERY_NAME = null;
		m_QUERY_GROUP = null;
		m_QUERY_MEMO = null;
		m_CREATED_DATE = null;
		m_CREATED_BY = null;
		m_UPDATED_DATE = null;
		m_UPDATED_BY = null;
		m_MODIFY_COUNT = null;
		m_QUERY_CD = null;
		m_SQL_INFO = null;
		m_CREATED_PRG_NM = null;
		m_UPDATED_PRG_NM = null;
		m_w_QUERY_NAME = null;
		m_w_QUERY_GROUP = null;
		m_w_MEMO = null;
		m_w_CREATED_BY = null;
		m_w_CREATED_DATE_FROM = null;
		m_w_CREATED_DATE_TO = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_GROUP_NAME = null;
		m_SELECTED_GROUP_CD = null;
		m_SELECTED_GROUP_NAME = null;

		l_sub3COLUMN_TYPE = null;
		l_sub3COND_TYPE = null;
		l_sub3COND_TYPE_name = null;
		l_sub3COND_TYPE_val = null;
		l_sub3COND_VALUE1 = null;
		l_sub3COND_VALUE2 = null;
		l_sub3DISPLAY_FLG = null;
		l_sub3SORT_TYPE = null;
		l_sub3SORT_TYPE_name = null;
		l_sub3SORT_TYPE_val = null;
		l_sub3SORTKEY_PRI = null;
		l_sub3TABLE_NAME_COMMENT = null;
		l_sub3TABLE_NAME = null;
		l_sub3COLUMN_NAME = null;
		l_sub3COLUMN_NAME_COMMENT = null;
		l_sub6FREE_SQL = null;
		l_EDIT_NAME = null;
		l_h_TABLE_TO = null;
		l_h_TABLE_COMMENT_TO = null;
		l_h_TABLE_ALIAS_TO = null;
		l_h_LEFT_TABLE_NAME = null;
		l_h_LEFT_TABLE_ALIAS = null;
		l_h_LEFT_COLUMN = null;
		l_h_RIGHT_TABLE_NAME = null;
		l_h_RIGHT_TABLE_ALIAS = null;
		l_h_RIGHT_COLUMN = null;
		l_h_CONDITION = null;
		l_h_COLUMN = null;
		l_h_TABLE_ALIAS = null;
		l_h_TABLE_NAME = null;
		l_h_GROUP_TO = null;
		l_h_GROUP_CODE_TO = null;
		l_EDIT_TYP = null;
		l_QUERY_NAME = null;
		l_QUERY_GROUP = null;
		l_QUERY_MEMO = null;
		l_CREATED_DATE = null;
		l_CREATED_BY = null;
		l_UPDATED_DATE = null;
		l_UPDATED_BY = null;
		l_MODIFY_COUNT = null;
		l_QUERY_CD = null;
		l_SQL_INFO = null;
		l_CREATED_PRG_NM = null;
		l_UPDATED_PRG_NM = null;
		l_w_QUERY_NAME = null;
		l_w_QUERY_GROUP = null;
		l_w_MEMO = null;
		l_w_CREATED_BY = null;
		l_w_CREATED_DATE_FROM = null;
		l_w_CREATED_DATE_TO = null;
		l_BUSINESS_GROUP_CD = null;
		l_BUSINESS_GROUP_NAME = null;
		l_SELECTED_GROUP_CD = null;
		l_SELECTED_GROUP_NAME = null;

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
	 * medAZ0050010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0050010Struct()
	{
		//{{user_implement_code_constractor
                              //------------------------------------------------------------------------------
                              // 2003/12/09 �������������O����  S.Yamamoto
                              //------------------------------------------------------------------------------
                            //		initialize();
                              //------------------------------------------------------------------------------
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
	public void setStruct(AZ0050010Struct struct)
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
	public void setStructM(AZ0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setsub3COLUMN_TYPE(struct.getsub3COLUMN_TYPE());
			this.setsub3COND_TYPE(struct.getsub3COND_TYPE());
			this.setsub3COND_TYPE_name(struct.getsub3COND_TYPE_name());
			this.setsub3COND_TYPE_val(struct.getsub3COND_TYPE_val());
			this.setsub3COND_VALUE1(struct.getsub3COND_VALUE1());
			this.setsub3COND_VALUE2(struct.getsub3COND_VALUE2());
			this.setsub3DISPLAY_FLG(struct.getsub3DISPLAY_FLG());
			this.setsub3SORT_TYPE(struct.getsub3SORT_TYPE());
			this.setsub3SORT_TYPE_name(struct.getsub3SORT_TYPE_name());
			this.setsub3SORT_TYPE_val(struct.getsub3SORT_TYPE_val());
			this.setsub3SORTKEY_PRI(struct.getsub3SORTKEY_PRI());
			this.setsub3TABLE_NAME_COMMENT(struct.getsub3TABLE_NAME_COMMENT());
			this.setsub3TABLE_NAME(struct.getsub3TABLE_NAME());
			this.setsub3COLUMN_NAME(struct.getsub3COLUMN_NAME());
			this.setsub3COLUMN_NAME_COMMENT(struct.getsub3COLUMN_NAME_COMMENT());
			this.setsub6FREE_SQL(struct.getsub6FREE_SQL());
			this.setEDIT_NAME(struct.getEDIT_NAME());
			this.seth_TABLE_TO(struct.geth_TABLE_TO());
			this.seth_TABLE_COMMENT_TO(struct.geth_TABLE_COMMENT_TO());
			this.seth_TABLE_ALIAS_TO(struct.geth_TABLE_ALIAS_TO());
			this.seth_LEFT_TABLE_NAME(struct.geth_LEFT_TABLE_NAME());
			this.seth_LEFT_TABLE_ALIAS(struct.geth_LEFT_TABLE_ALIAS());
			this.seth_LEFT_COLUMN(struct.geth_LEFT_COLUMN());
			this.seth_RIGHT_TABLE_NAME(struct.geth_RIGHT_TABLE_NAME());
			this.seth_RIGHT_TABLE_ALIAS(struct.geth_RIGHT_TABLE_ALIAS());
			this.seth_RIGHT_COLUMN(struct.geth_RIGHT_COLUMN());
			this.seth_CONDITION(struct.geth_CONDITION());
			this.seth_COLUMN(struct.geth_COLUMN());
			this.seth_TABLE_ALIAS(struct.geth_TABLE_ALIAS());
			this.seth_TABLE_NAME(struct.geth_TABLE_NAME());
			this.seth_GROUP_TO(struct.geth_GROUP_TO());
			this.seth_GROUP_CODE_TO(struct.geth_GROUP_CODE_TO());
			this.setEDIT_TYP(struct.getEDIT_TYP());
			this.setQUERY_NAME(struct.getQUERY_NAME());
			this.setQUERY_GROUP(struct.getQUERY_GROUP());
			this.setQUERY_MEMO(struct.getQUERY_MEMO());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setUPDATED_DATE(struct.getUPDATED_DATE());
			this.setUPDATED_BY(struct.getUPDATED_BY());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setQUERY_CD(struct.getQUERY_CD());
			this.setSQL_INFO(struct.getSQL_INFO());
			this.setCREATED_PRG_NM(struct.getCREATED_PRG_NM());
			this.setUPDATED_PRG_NM(struct.getUPDATED_PRG_NM());
			this.setw_QUERY_NAME(struct.getw_QUERY_NAME());
			this.setw_QUERY_GROUP(struct.getw_QUERY_GROUP());
			this.setw_MEMO(struct.getw_MEMO());
			this.setw_CREATED_BY(struct.getw_CREATED_BY());
			this.setw_CREATED_DATE_FROM(struct.getw_CREATED_DATE_FROM());
			this.setw_CREATED_DATE_TO(struct.getw_CREATED_DATE_TO());
			this.setBUSINESS_GROUP_CD(struct.getBUSINESS_GROUP_CD());
			this.setBUSINESS_GROUP_NAME(struct.getBUSINESS_GROUP_NAME());
			this.setSELECTED_GROUP_CD(struct.getSELECTED_GROUP_CD());
			this.setSELECTED_GROUP_NAME(struct.getSELECTED_GROUP_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AZ0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_sub3COLUMN_TYPE(struct.getList_sub3COLUMN_TYPE());
			this.setList_sub3COND_TYPE(struct.getList_sub3COND_TYPE());
			this.setList_sub3COND_TYPE_name(struct.getList_sub3COND_TYPE_name());
			this.setList_sub3COND_TYPE_val(struct.getList_sub3COND_TYPE_val());
			this.setList_sub3COND_VALUE1(struct.getList_sub3COND_VALUE1());
			this.setList_sub3COND_VALUE2(struct.getList_sub3COND_VALUE2());
			this.setList_sub3DISPLAY_FLG(struct.getList_sub3DISPLAY_FLG());
			this.setList_sub3SORT_TYPE(struct.getList_sub3SORT_TYPE());
			this.setList_sub3SORT_TYPE_name(struct.getList_sub3SORT_TYPE_name());
			this.setList_sub3SORT_TYPE_val(struct.getList_sub3SORT_TYPE_val());
			this.setList_sub3SORTKEY_PRI(struct.getList_sub3SORTKEY_PRI());
			this.setList_sub3TABLE_NAME_COMMENT(struct.getList_sub3TABLE_NAME_COMMENT());
			this.setList_sub3TABLE_NAME(struct.getList_sub3TABLE_NAME());
			this.setList_sub3COLUMN_NAME(struct.getList_sub3COLUMN_NAME());
			this.setList_sub3COLUMN_NAME_COMMENT(struct.getList_sub3COLUMN_NAME_COMMENT());
			this.setList_sub6FREE_SQL(struct.getList_sub6FREE_SQL());
			this.setList_EDIT_NAME(struct.getList_EDIT_NAME());
			this.setList_h_TABLE_TO(struct.getList_h_TABLE_TO());
			this.setList_h_TABLE_COMMENT_TO(struct.getList_h_TABLE_COMMENT_TO());
			this.setList_h_TABLE_ALIAS_TO(struct.getList_h_TABLE_ALIAS_TO());
			this.setList_h_LEFT_TABLE_NAME(struct.getList_h_LEFT_TABLE_NAME());
			this.setList_h_LEFT_TABLE_ALIAS(struct.getList_h_LEFT_TABLE_ALIAS());
			this.setList_h_LEFT_COLUMN(struct.getList_h_LEFT_COLUMN());
			this.setList_h_RIGHT_TABLE_NAME(struct.getList_h_RIGHT_TABLE_NAME());
			this.setList_h_RIGHT_TABLE_ALIAS(struct.getList_h_RIGHT_TABLE_ALIAS());
			this.setList_h_RIGHT_COLUMN(struct.getList_h_RIGHT_COLUMN());
			this.setList_h_CONDITION(struct.getList_h_CONDITION());
			this.setList_h_COLUMN(struct.getList_h_COLUMN());
			this.setList_h_TABLE_ALIAS(struct.getList_h_TABLE_ALIAS());
			this.setList_h_TABLE_NAME(struct.getList_h_TABLE_NAME());
			this.setList_h_GROUP_TO(struct.getList_h_GROUP_TO());
			this.setList_h_GROUP_CODE_TO(struct.getList_h_GROUP_CODE_TO());
			this.setList_EDIT_TYP(struct.getList_EDIT_TYP());
			this.setList_QUERY_NAME(struct.getList_QUERY_NAME());
			this.setList_QUERY_GROUP(struct.getList_QUERY_GROUP());
			this.setList_QUERY_MEMO(struct.getList_QUERY_MEMO());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_UPDATED_DATE(struct.getList_UPDATED_DATE());
			this.setList_UPDATED_BY(struct.getList_UPDATED_BY());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_QUERY_CD(struct.getList_QUERY_CD());
			this.setList_SQL_INFO(struct.getList_SQL_INFO());
			this.setList_CREATED_PRG_NM(struct.getList_CREATED_PRG_NM());
			this.setList_UPDATED_PRG_NM(struct.getList_UPDATED_PRG_NM());
			this.setList_w_QUERY_NAME(struct.getList_w_QUERY_NAME());
			this.setList_w_QUERY_GROUP(struct.getList_w_QUERY_GROUP());
			this.setList_w_MEMO(struct.getList_w_MEMO());
			this.setList_w_CREATED_BY(struct.getList_w_CREATED_BY());
			this.setList_w_CREATED_DATE_FROM(struct.getList_w_CREATED_DATE_FROM());
			this.setList_w_CREATED_DATE_TO(struct.getList_w_CREATED_DATE_TO());
			this.setList_BUSINESS_GROUP_CD(struct.getList_BUSINESS_GROUP_CD());
			this.setList_BUSINESS_GROUP_NAME(struct.getList_BUSINESS_GROUP_NAME());
			this.setList_SELECTED_GROUP_CD(struct.getList_SELECTED_GROUP_CD());
			this.setList_SELECTED_GROUP_NAME(struct.getList_SELECTED_GROUP_NAME());
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
	// �� 1 �ϐ������l�F i_sub3COLUMN_TYPE


	final static String i_sub3COLUMN_TYPE = null;

	// �� 2 �ϐ������l�F i_sub3COND_TYPE


	final static String i_sub3COND_TYPE = null;

	// �� 3 �ϐ������l�F i_sub3COND_TYPE_name


	final static String i_sub3COND_TYPE_name = null;

	// �� 4 �ϐ������l�F i_sub3COND_TYPE_val


	final static String i_sub3COND_TYPE_val = null;

	// �� 5 �ϐ������l�F i_sub3COND_VALUE1


	final static String i_sub3COND_VALUE1 = null;

	// �� 6 �ϐ������l�F i_sub3COND_VALUE2


	final static String i_sub3COND_VALUE2 = null;

	// �� 7 �ϐ������l�F i_sub3DISPLAY_FLG


	final static String i_sub3DISPLAY_FLG = null;

	// �� 8 �ϐ������l�F i_sub3SORT_TYPE


	final static String i_sub3SORT_TYPE = null;

	// �� 9 �ϐ������l�F i_sub3SORT_TYPE_name


	final static String i_sub3SORT_TYPE_name = null;

	// �� 10 �ϐ������l�F i_sub3SORT_TYPE_val


	final static String i_sub3SORT_TYPE_val = null;

	// �� 11 �ϐ������l�F i_sub3SORTKEY_PRI


	final static String i_sub3SORTKEY_PRI = null;

	// �� 12 �ϐ������l�F i_sub3TABLE_NAME_COMMENT


	final static String i_sub3TABLE_NAME_COMMENT = null;

	// �� 13 �ϐ������l�F i_sub3TABLE_NAME


	final static String i_sub3TABLE_NAME = null;

	// �� 14 �ϐ������l�F i_sub3COLUMN_NAME


	final static String i_sub3COLUMN_NAME = null;

	// �� 15 �ϐ������l�F i_sub3COLUMN_NAME_COMMENT


	final static String i_sub3COLUMN_NAME_COMMENT = null;

	// �� 16 �ϐ������l�F i_sub6FREE_SQL


	final static String i_sub6FREE_SQL = null;

	// �� 17 �ϐ������l�F i_EDIT_NAME


	final static String i_EDIT_NAME = null;

	// �� 18 �ϐ������l�F i_h_TABLE_TO


	final static String i_h_TABLE_TO = null;

	// �� 19 �ϐ������l�F i_h_TABLE_COMMENT_TO


	final static String i_h_TABLE_COMMENT_TO = null;

	// �� 20 �ϐ������l�F i_h_TABLE_ALIAS_TO


	final static String i_h_TABLE_ALIAS_TO = null;

	// �� 21 �ϐ������l�F i_h_LEFT_TABLE_NAME


	final static String i_h_LEFT_TABLE_NAME = null;

	// �� 22 �ϐ������l�F i_h_LEFT_TABLE_ALIAS


	final static String i_h_LEFT_TABLE_ALIAS = null;

	// �� 23 �ϐ������l�F i_h_LEFT_COLUMN


	final static String i_h_LEFT_COLUMN = null;

	// �� 24 �ϐ������l�F i_h_RIGHT_TABLE_NAME


	final static String i_h_RIGHT_TABLE_NAME = null;

	// �� 25 �ϐ������l�F i_h_RIGHT_TABLE_ALIAS


	final static String i_h_RIGHT_TABLE_ALIAS = null;

	// �� 26 �ϐ������l�F i_h_RIGHT_COLUMN


	final static String i_h_RIGHT_COLUMN = null;

	// �� 27 �ϐ������l�F i_h_CONDITION


	final static String i_h_CONDITION = null;

	// �� 28 �ϐ������l�F i_h_COLUMN


	final static String i_h_COLUMN = null;

	// �� 29 �ϐ������l�F i_h_TABLE_ALIAS


	final static String i_h_TABLE_ALIAS = null;

	// �� 30 �ϐ������l�F i_h_TABLE_NAME


	final static String i_h_TABLE_NAME = null;

	// �� 31 �ϐ������l�F i_h_GROUP_TO


	final static String i_h_GROUP_TO = null;

	// �� 32 �ϐ������l�F i_h_GROUP_CODE_TO


	final static String i_h_GROUP_CODE_TO = null;

	// �� 33 �ϐ������l�F i_EDIT_TYP


	final static String i_EDIT_TYP = null;

	// �� 34 �ϐ������l�F i_QUERY_NAME


	final static String i_QUERY_NAME = null;

	// �� 35 �ϐ������l�F i_QUERY_GROUP


	final static String i_QUERY_GROUP = null;

	// �� 36 �ϐ������l�F i_QUERY_MEMO


	final static String i_QUERY_MEMO = null;

	// �� 37 �ϐ������l�F i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// �� 38 �ϐ������l�F i_CREATED_BY


	final static String i_CREATED_BY = null;

	// �� 39 �ϐ������l�F i_UPDATED_DATE


	final static String i_UPDATED_DATE = null;

	// �� 40 �ϐ������l�F i_UPDATED_BY


	final static String i_UPDATED_BY = null;

	// �� 41 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 42 �ϐ������l�F i_QUERY_CD


	final static String i_QUERY_CD = null;

	// �� 43 �ϐ������l�F i_SQL_INFO


	final static String i_SQL_INFO = null;

	// �� 44 �ϐ������l�F i_CREATED_PRG_NM


	final static String i_CREATED_PRG_NM = null;

	// �� 45 �ϐ������l�F i_UPDATED_PRG_NM


	final static String i_UPDATED_PRG_NM = null;

	// �� 46 �ϐ������l�F i_w_QUERY_NAME


	final static String i_w_QUERY_NAME = null;

	// �� 47 �ϐ������l�F i_w_QUERY_GROUP


	final static String i_w_QUERY_GROUP = null;

	// �� 48 �ϐ������l�F i_w_MEMO


	final static String i_w_MEMO = null;

	// �� 49 �ϐ������l�F i_w_CREATED_BY


	final static String i_w_CREATED_BY = null;

	// �� 50 �ϐ������l�F i_w_CREATED_DATE_FROM


	final static String i_w_CREATED_DATE_FROM = null;

	// �� 51 �ϐ������l�F i_w_CREATED_DATE_TO


	final static String i_w_CREATED_DATE_TO = null;

	// �� 52 �ϐ������l�F i_BUSINESS_GROUP_CD


	final static String i_BUSINESS_GROUP_CD = null;

	// �� 53 �ϐ������l�F i_BUSINESS_GROUP_NAME


	final static String i_BUSINESS_GROUP_NAME = null;

	// �� 54 �ϐ������l�F i_SELECTED_GROUP_CD


	final static String i_SELECTED_GROUP_CD = null;

	// �� 55 �ϐ������l�F i_SELECTED_GROUP_NAME


	final static String i_SELECTED_GROUP_NAME = null;

*/

	//{{user_implement_code
               //------------------------------------------------------------------------------
               /**	
                * �������ϐ��̃R�s�[	
                * @param s �R�s�[��	
                */	
               public void copy(AZ0050010Struct s)	
               {	
                clear();
                if(s.m_EDIT_TYP != null) m_EDIT_TYP = new String(s.m_EDIT_TYP);
                if(s.m_QUERY_NAME != null) m_QUERY_NAME = new String(s.m_QUERY_NAME);
                if(s.m_QUERY_GROUP != null) m_QUERY_GROUP = new String(s.m_QUERY_GROUP);
                if(s.m_QUERY_MEMO != null) m_QUERY_MEMO = new String(s.m_QUERY_MEMO);
                if(s.m_CREATED_DATE != null) m_CREATED_DATE = new String(s.m_CREATED_DATE);
                if(s.m_CREATED_BY != null) m_CREATED_BY = new String(s.m_CREATED_BY);
                if(s.m_UPDATED_DATE != null) m_UPDATED_DATE = new String(s.m_UPDATED_DATE);
                if(s.m_UPDATED_BY != null) m_UPDATED_BY = new String(s.m_UPDATED_BY);
                if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
                if(s.m_QUERY_CD != null) m_QUERY_CD = new String(s.m_QUERY_CD);
                if(s.m_SQL_INFO != null) m_SQL_INFO = new String(s.m_SQL_INFO);
                if(s.m_CREATED_PRG_NM != null) m_CREATED_PRG_NM = new String(s.m_CREATED_PRG_NM);
                if(s.m_UPDATED_PRG_NM != null) m_UPDATED_PRG_NM = new String(s.m_UPDATED_PRG_NM);
                if(s.m_w_QUERY_NAME != null) m_w_QUERY_NAME = new String(s.m_w_QUERY_NAME);
                if(s.m_w_QUERY_GROUP != null) m_w_QUERY_GROUP = new String(s.m_w_QUERY_GROUP);
                if(s.m_w_MEMO != null) m_w_MEMO = new String(s.m_w_MEMO);
                if(s.m_w_CREATED_BY != null) m_w_CREATED_BY = new String(s.m_w_CREATED_BY);
                if(s.m_w_CREATED_DATE_FROM != null) m_w_CREATED_DATE_FROM = new String(s.m_w_CREATED_DATE_FROM);
                if(s.m_w_CREATED_DATE_TO != null) m_w_CREATED_DATE_TO = new String(s.m_w_CREATED_DATE_TO);
                if(s.m_sub3COLUMN_TYPE != null) m_sub3COLUMN_TYPE = new String(s.m_sub3COLUMN_TYPE);
                if(s.m_sub3COND_TYPE != null) m_sub3COND_TYPE = new String(s.m_sub3COND_TYPE);
                if(s.m_sub3COND_TYPE_name != null) m_sub3COND_TYPE_name = new String(s.m_sub3COND_TYPE_name);
                if(s.m_sub3COND_TYPE_val != null) m_sub3COND_TYPE_val = new String(s.m_sub3COND_TYPE_val);
                if(s.m_sub3COND_VALUE1 != null) m_sub3COND_VALUE1 = new String(s.m_sub3COND_VALUE1);
                if(s.m_sub3COND_VALUE2 != null) m_sub3COND_VALUE2 = new String(s.m_sub3COND_VALUE2);
                if(s.m_sub3DISPLAY_FLG != null) m_sub3DISPLAY_FLG = new String(s.m_sub3DISPLAY_FLG);
                if(s.m_sub3SORT_TYPE != null) m_sub3SORT_TYPE = new String(s.m_sub3SORT_TYPE);
                if(s.m_sub3SORT_TYPE_name != null) m_sub3SORT_TYPE_name = new String(s.m_sub3SORT_TYPE_name);
                if(s.m_sub3SORT_TYPE_val != null) m_sub3SORT_TYPE_val = new String(s.m_sub3SORT_TYPE_val);
                if(s.m_sub3SORTKEY_PRI != null) m_sub3SORTKEY_PRI = new String(s.m_sub3SORTKEY_PRI);
                if(s.m_sub3TABLE_NAME_COMMENT != null) m_sub3TABLE_NAME_COMMENT = new String(s.m_sub3TABLE_NAME_COMMENT);
                if(s.m_sub3TABLE_NAME != null) m_sub3TABLE_NAME = new String(s.m_sub3TABLE_NAME);
                if(s.m_sub3COLUMN_NAME != null) m_sub3COLUMN_NAME = new String(s.m_sub3COLUMN_NAME);
                if(s.m_sub3COLUMN_NAME_COMMENT != null) m_sub3COLUMN_NAME_COMMENT = new String(s.m_sub3COLUMN_NAME_COMMENT);
                if(s.m_sub6FREE_SQL != null) m_sub6FREE_SQL = new String(s.m_sub6FREE_SQL);
                if(s.m_h_TABLE_TO != null) m_h_TABLE_TO = new String(s.m_h_TABLE_TO);
                if(s.m_h_TABLE_COMMENT_TO != null) m_h_TABLE_COMMENT_TO = new String(s.m_h_TABLE_COMMENT_TO);
                if(s.m_h_TABLE_ALIAS_TO != null) m_h_TABLE_ALIAS_TO = new String(s.m_h_TABLE_ALIAS_TO);
                if(s.m_h_LEFT_TABLE_NAME != null) m_h_LEFT_TABLE_NAME = new String(s.m_h_LEFT_TABLE_NAME);
                if(s.m_h_LEFT_TABLE_ALIAS != null) m_h_LEFT_TABLE_ALIAS = new String(s.m_h_LEFT_TABLE_ALIAS);
                if(s.m_h_LEFT_COLUMN != null) m_h_LEFT_COLUMN = new String(s.m_h_LEFT_COLUMN);
                if(s.m_h_RIGHT_TABLE_NAME != null) m_h_RIGHT_TABLE_NAME = new String(s.m_h_RIGHT_TABLE_NAME);
                if(s.m_h_RIGHT_TABLE_ALIAS != null) m_h_RIGHT_TABLE_ALIAS = new String(s.m_h_RIGHT_TABLE_ALIAS);
                if(s.m_h_RIGHT_COLUMN != null) m_h_RIGHT_COLUMN = new String(s.m_h_RIGHT_COLUMN);
                if(s.m_h_CONDITION != null) m_h_CONDITION = new String(s.m_h_CONDITION);
                if(s.m_h_COLUMN != null) m_h_COLUMN = new String(s.m_h_COLUMN);
                if(s.m_h_TABLE_ALIAS != null) m_h_TABLE_ALIAS = new String(s.m_h_TABLE_ALIAS);
                if(s.m_h_TABLE_NAME != null) m_h_TABLE_NAME = new String(s.m_h_TABLE_NAME);
              
              
              
              
              
               }	
              
              
               /**
                * �R�s�[�R���X�g���N�^
                */
                public AZ0050010Struct(AZ0050010Struct struct)
                {
                 copy(struct);
                }
                /**
                 * ������
                 * �N���A���K��l�ݒ���s���B
                 */
                public void initialize()
                {
                 clear();
                return;
                }
              
                /**
                 * �ݒ�����f�[�^��Struct�\���̂ւ̓W�J
                 * ����������� ' ���폜����Struct�ɐݒ�B
                 */
                public void importColumnInfo(AZ0050ColumnInfo in)
                {
                // �f�[�^�W�J
                m_sub3TABLE_NAME_COMMENT  = in.getTable_Name_Comment();
                m_sub3TABLE_NAME 	  = in.getTable_Name_Alias();
                m_sub3COLUMN_NAME 	  = in.getColumn_Name();
                m_sub3COLUMN_NAME_COMMENT = in.getColumn_Name_Comment();
                m_sub3COLUMN_TYPE 	  = String.valueOf(in.getColumn_Type());
                if( in.getCond_Type() == 0 ){
                 m_sub3COND_TYPE   = null;
                } else {
                 m_sub3COND_TYPE   = String.valueOf(in.getCond_Type());
                }
              
                if((in.getCond_Value1() != null && AZ0050Const.C_VARCHAR.equals(in.getColumn_Type_Ora())) ||
                		(in.getCond_Value1() != null && AZ0050Const.C_DATE.equals(in.getColumn_Type_Ora()) && in.getCond_Type() == 1)){
                 m_sub3COND_VALUE1 = AZ0050Common.UnescapeSQL(in.getCond_Value1());
                }else if(in.getCond_Value1() != null && AZ0050Const.C_DATE.equals(in.getColumn_Type_Ora()) && in.getCond_Type() != 1){
                 m_sub3COND_VALUE1 = AZ0050Common.UnescapeSQL_Date(in.getCond_Value1());
                } else {
                 m_sub3COND_VALUE1 	  = in.getCond_Value1();
                }
              
                if(in.getCond_Value2() != null && AZ0050Const.C_VARCHAR.equals(in.getColumn_Type_Ora())){
                 m_sub3COND_VALUE2 = AZ0050Common.UnescapeSQL(in.getCond_Value2());
                }else if(in.getCond_Value2() != null && AZ0050Const.C_DATE.equals(in.getColumn_Type_Ora())){
                 m_sub3COND_VALUE2 = AZ0050Common.UnescapeSQL_Date(in.getCond_Value2());
                } else {
                 m_sub3COND_VALUE2 	  = in.getCond_Value2();
                }
              
                if( in.getDisplay_Flg() == false ){
                 m_sub3DISPLAY_FLG   = null;
                } else {
                 m_sub3DISPLAY_FLG   = String.valueOf(in.getDisplay_Flg());
                }
              
                if( in.getSort_Type() == 0 ){
                 m_sub3SORT_TYPE   = null;
                } else {
                 m_sub3SORT_TYPE   = String.valueOf(in.getSort_Type());
                }
              
                if(in.getSort_No() == 0){
                 m_sub3SORTKEY_PRI   = null;
                } else {
                 m_sub3SORTKEY_PRI   = String.valueOf(in.getSort_No());
                }
              
                return;
                }
              
                /**
                 * Struct�\���̂���̃f�[�^�W�J
                 * ����������� '��t�^���Đݒ�B
                 */
                public void exportColumnInfo(AZ0050ColumnInfo out)
                {
                // �f�[�^�W�J
                if( m_sub3COND_TYPE == null || "".equals(m_sub3COND_TYPE)){
                 out.setCond_Type(AZ0050Const.C_NONE);
                } else {
                 out.setCond_Type(Integer.parseInt(m_sub3COND_TYPE));
                }

                if((m_sub3COND_VALUE1 != null && AZ0050Const.C_VARCHAR.equals(out.getColumn_Type_Ora())) || 
                		(m_sub3COND_VALUE1 != null && AZ0050Const.C_DATE.equals(out.getColumn_Type_Ora()) && out.getCond_Type() == 1)){
                 out.setCond_Value1(AZ0050Common.EscapeSQL(m_sub3COND_VALUE1));
                }else if(m_sub3COND_VALUE1 != null && AZ0050Const.C_DATE.equals(out.getColumn_Type_Ora()) && out.getCond_Type() != 1){
                 out.setCond_Value1(AZ0050Common.EscapeSQL_Date(m_sub3COND_VALUE1));
                } else {
                 out.setCond_Value1(m_sub3COND_VALUE1);
                }
                if(m_sub3COND_VALUE2 != null && AZ0050Const.C_VARCHAR.equals(out.getColumn_Type_Ora())){
                 out.setCond_Value2(AZ0050Common.EscapeSQL(m_sub3COND_VALUE2));
                }else if(m_sub3COND_VALUE2 != null && AZ0050Const.C_DATE.equals(out.getColumn_Type_Ora())){
                 out.setCond_Value2(AZ0050Common.EscapeSQL_Date(m_sub3COND_VALUE2));
                } else {
                 out.setCond_Value2(m_sub3COND_VALUE2);
                }
              
                out.setDisplay_Flg("true".equals(m_sub3DISPLAY_FLG)? true : false);
              
                if( m_sub3SORT_TYPE == null || "".equals(m_sub3SORT_TYPE)){
                 out.setSort_Type(AZ0050Const.C_NONE);
                } else {
                 out.setSort_Type(Integer.parseInt(m_sub3SORT_TYPE));
                }
              
                if( m_sub3SORTKEY_PRI == null || "".equals(m_sub3SORTKEY_PRI)){
                 out.setSort_No(AZ0050Const.C_NONE);
                } else {
                 out.setSort_No(Integer.parseInt(m_sub3SORTKEY_PRI));
                }
              
                return;
                }
              
                /**
                 * Struct�\���̂���̃f�[�^�W�J
                 * ����������� '��t�^���Đݒ�B
                 */
               public void clearList()
               {
                l_h_TABLE_TO = new ArrayList();
                l_h_TABLE_COMMENT_TO = new ArrayList();
                l_h_TABLE_ALIAS_TO = new ArrayList();
                l_h_LEFT_TABLE_NAME = new ArrayList();
                l_h_LEFT_TABLE_ALIAS = new ArrayList();
                l_h_LEFT_COLUMN = new ArrayList();
                l_h_RIGHT_TABLE_NAME = new ArrayList();
                l_h_RIGHT_TABLE_ALIAS = new ArrayList();
                l_h_RIGHT_COLUMN = new ArrayList();
                l_h_CONDITION = new ArrayList();
                l_h_COLUMN = new ArrayList();
                l_h_TABLE_ALIAS = new ArrayList();
                l_h_TABLE_NAME = new ArrayList();
               }
               //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
