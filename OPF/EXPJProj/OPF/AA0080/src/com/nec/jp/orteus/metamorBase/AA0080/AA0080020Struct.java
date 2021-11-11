/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

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

public class AA0080020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_CAL_DATE_WEEK */
	public String m_CAL_DATE_WEEK = null;
	/** �� 2 �ϐ��F m_h_HOLIDAY_SUN */
	public Integer m_h_HOLIDAY_SUN = null;
	/** �� 3 �ϐ��F m_h_HOLIDAY_MON */
	public Integer m_h_HOLIDAY_MON = null;
	/** �� 4 �ϐ��F m_h_HOLIDAY_TUE */
	public Integer m_h_HOLIDAY_TUE = null;
	/** �� 5 �ϐ��F m_h_HOLIDAY_WED */
	public Integer m_h_HOLIDAY_WED = null;
	/** �� 6 �ϐ��F m_h_HOLIDAY_THU */
	public Integer m_h_HOLIDAY_THU = null;
	/** �� 7 �ϐ��F m_h_HOLIDAY_FRI */
	public Integer m_h_HOLIDAY_FRI = null;
	/** �� 8 �ϐ��F m_h_HOLIDAY_SAT */
	public Integer m_h_HOLIDAY_SAT = null;
	/** �� 9 �ϐ��F m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** �� 10 �ϐ��F m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** �� 11 �ϐ��F m_HEAD_DATE */
	public String m_HEAD_DATE = null;
	/** �� 12 �ϐ��F m_c_HOLIDAY_FLG */
	public String m_c_HOLIDAY_FLG = null;
	/** �� 13 �ϐ��F m_c_HOLIDAY_SUN */
	public String m_c_HOLIDAY_SUN = null;
	/** �� 14 �ϐ��F m_c_HOLIDAY_MON */
	public String m_c_HOLIDAY_MON = null;
	/** �� 15 �ϐ��F m_c_HOLIDAY_TUE */
	public String m_c_HOLIDAY_TUE = null;
	/** �� 16 �ϐ��F m_c_HOLIDAY_WED */
	public String m_c_HOLIDAY_WED = null;
	/** �� 17 �ϐ��F m_c_HOLIDAY_THU */
	public String m_c_HOLIDAY_THU = null;
	/** �� 18 �ϐ��F m_c_HOLIDAY_FRI */
	public String m_c_HOLIDAY_FRI = null;
	/** �� 19 �ϐ��F m_c_HOLIDAY_SAT */
	public String m_c_HOLIDAY_SAT = null;
	/** �� 20 �ϐ��F m_t_HOLIDAY_SUN */
	public String m_t_HOLIDAY_SUN = null;
	/** �� 21 �ϐ��F m_t_HOLIDAY_MON */
	public String m_t_HOLIDAY_MON = null;
	/** �� 22 �ϐ��F m_t_HOLIDAY_TUE */
	public String m_t_HOLIDAY_TUE = null;
	/** �� 23 �ϐ��F m_t_HOLIDAY_WED */
	public String m_t_HOLIDAY_WED = null;
	/** �� 24 �ϐ��F m_t_HOLIDAY_THU */
	public String m_t_HOLIDAY_THU = null;
	/** �� 25 �ϐ��F m_t_HOLIDAY_FRI */
	public String m_t_HOLIDAY_FRI = null;
	/** �� 26 �ϐ��F m_t_HOLIDAY_SAT */
	public String m_t_HOLIDAY_SAT = null;
	/** �� 27 �ϐ��F m_h_TIME_CTRL */
	public String m_h_TIME_CTRL = null;
	/** �� 28 �ϐ��F m_CAL_NO */
	public String m_CAL_NO = null;
	/** �� 29 �ϐ��F m_CAL_DATE */
	public String m_CAL_DATE = null;
	/** �� 30 �ϐ��F m_HOLIDAY_FLG */
	public Integer m_HOLIDAY_FLG = null;
	/** �� 31 �ϐ��F m_CAL_COMMENT */
	public String m_CAL_COMMENT = null;
	/** �� 32 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 33 �ϐ��F m_ASP_SHIFT_CD */
	public String m_ASP_SHIFT_CD = null;
	/** �� 34 �ϐ��F m_CAL_NAME */
	public String m_CAL_NAME = null;
	/** �� 35 �ϐ��F m_DATE_TO */
	public String m_DATE_TO = null;
	/** �� 36 �ϐ��F m_DATE_FROM */
	public String m_DATE_FROM = null;
	/** �� 37 �ϐ��F m_CAL_YEAR */
	public String m_CAL_YEAR = null;
	/** �� 38 �ϐ��F m_CAL_YEAR_HOLIDAY */
	public String m_CAL_YEAR_HOLIDAY = null;
	/** �� 39 �ϐ��F m_HOLIDAY_DATE */
	public String m_HOLIDAY_DATE = null;
	/** �� 40 �ϐ��F m_HOLIDAY_NAME */
	public String m_HOLIDAY_NAME = null;
	/** �� 41 �ϐ��F m_sysValue */
	public String m_sysValue = null;
	/** �� 42 �ϐ��F m_sysName */
	public String m_sysName = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_CAL_DATE_WEEK */
	public List l_CAL_DATE_WEEK = null;

	/** �� 2 List�ϐ��F l_h_HOLIDAY_SUN */
	public List l_h_HOLIDAY_SUN = null;

	/** �� 3 List�ϐ��F l_h_HOLIDAY_MON */
	public List l_h_HOLIDAY_MON = null;

	/** �� 4 List�ϐ��F l_h_HOLIDAY_TUE */
	public List l_h_HOLIDAY_TUE = null;

	/** �� 5 List�ϐ��F l_h_HOLIDAY_WED */
	public List l_h_HOLIDAY_WED = null;

	/** �� 6 List�ϐ��F l_h_HOLIDAY_THU */
	public List l_h_HOLIDAY_THU = null;

	/** �� 7 List�ϐ��F l_h_HOLIDAY_FRI */
	public List l_h_HOLIDAY_FRI = null;

	/** �� 8 List�ϐ��F l_h_HOLIDAY_SAT */
	public List l_h_HOLIDAY_SAT = null;

	/** �� 9 List�ϐ��F l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** �� 10 List�ϐ��F l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** �� 11 List�ϐ��F l_HEAD_DATE */
	public List l_HEAD_DATE = null;

	/** �� 12 List�ϐ��F l_c_HOLIDAY_FLG */
	public List l_c_HOLIDAY_FLG = null;

	/** �� 13 List�ϐ��F l_c_HOLIDAY_SUN */
	public List l_c_HOLIDAY_SUN = null;

	/** �� 14 List�ϐ��F l_c_HOLIDAY_MON */
	public List l_c_HOLIDAY_MON = null;

	/** �� 15 List�ϐ��F l_c_HOLIDAY_TUE */
	public List l_c_HOLIDAY_TUE = null;

	/** �� 16 List�ϐ��F l_c_HOLIDAY_WED */
	public List l_c_HOLIDAY_WED = null;

	/** �� 17 List�ϐ��F l_c_HOLIDAY_THU */
	public List l_c_HOLIDAY_THU = null;

	/** �� 18 List�ϐ��F l_c_HOLIDAY_FRI */
	public List l_c_HOLIDAY_FRI = null;

	/** �� 19 List�ϐ��F l_c_HOLIDAY_SAT */
	public List l_c_HOLIDAY_SAT = null;

	/** �� 20 List�ϐ��F l_t_HOLIDAY_SUN */
	public List l_t_HOLIDAY_SUN = null;

	/** �� 21 List�ϐ��F l_t_HOLIDAY_MON */
	public List l_t_HOLIDAY_MON = null;

	/** �� 22 List�ϐ��F l_t_HOLIDAY_TUE */
	public List l_t_HOLIDAY_TUE = null;

	/** �� 23 List�ϐ��F l_t_HOLIDAY_WED */
	public List l_t_HOLIDAY_WED = null;

	/** �� 24 List�ϐ��F l_t_HOLIDAY_THU */
	public List l_t_HOLIDAY_THU = null;

	/** �� 25 List�ϐ��F l_t_HOLIDAY_FRI */
	public List l_t_HOLIDAY_FRI = null;

	/** �� 26 List�ϐ��F l_t_HOLIDAY_SAT */
	public List l_t_HOLIDAY_SAT = null;

	/** �� 27 List�ϐ��F l_h_TIME_CTRL */
	public List l_h_TIME_CTRL = null;

	/** �� 28 List�ϐ��F l_CAL_NO */
	public List l_CAL_NO = null;

	/** �� 29 List�ϐ��F l_CAL_DATE */
	public List l_CAL_DATE = null;

	/** �� 30 List�ϐ��F l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** �� 31 List�ϐ��F l_CAL_COMMENT */
	public List l_CAL_COMMENT = null;

	/** �� 32 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 33 List�ϐ��F l_ASP_SHIFT_CD */
	public List l_ASP_SHIFT_CD = null;

	/** �� 34 List�ϐ��F l_CAL_NAME */
	public List l_CAL_NAME = null;

	/** �� 35 List�ϐ��F l_DATE_TO */
	public List l_DATE_TO = null;

	/** �� 36 List�ϐ��F l_DATE_FROM */
	public List l_DATE_FROM = null;

	/** �� 37 List�ϐ��F l_CAL_YEAR */
	public List l_CAL_YEAR = null;

	/** �� 38 List�ϐ��F l_CAL_YEAR_HOLIDAY */
	public List l_CAL_YEAR_HOLIDAY = null;

	/** �� 39 List�ϐ��F l_HOLIDAY_DATE */
	public List l_HOLIDAY_DATE = null;

	/** �� 40 List�ϐ��F l_HOLIDAY_NAME */
	public List l_HOLIDAY_NAME = null;

	/** �� 41 List�ϐ��F l_sysValue */
	public List l_sysValue = null;

	/** �� 42 List�ϐ��F l_sysName */
	public List l_sysName = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCAL_DATE_WEEK() { return m_CAL_DATE_WEEK; }
	public Integer geth_HOLIDAY_SUN() { return m_h_HOLIDAY_SUN; }
	public Integer geth_HOLIDAY_MON() { return m_h_HOLIDAY_MON; }
	public Integer geth_HOLIDAY_TUE() { return m_h_HOLIDAY_TUE; }
	public Integer geth_HOLIDAY_WED() { return m_h_HOLIDAY_WED; }
	public Integer geth_HOLIDAY_THU() { return m_h_HOLIDAY_THU; }
	public Integer geth_HOLIDAY_FRI() { return m_h_HOLIDAY_FRI; }
	public Integer geth_HOLIDAY_SAT() { return m_h_HOLIDAY_SAT; }
	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getHEAD_DATE() { return m_HEAD_DATE; }
	public String getc_HOLIDAY_FLG() { return m_c_HOLIDAY_FLG; }
	public String getc_HOLIDAY_SUN() { return m_c_HOLIDAY_SUN; }
	public String getc_HOLIDAY_MON() { return m_c_HOLIDAY_MON; }
	public String getc_HOLIDAY_TUE() { return m_c_HOLIDAY_TUE; }
	public String getc_HOLIDAY_WED() { return m_c_HOLIDAY_WED; }
	public String getc_HOLIDAY_THU() { return m_c_HOLIDAY_THU; }
	public String getc_HOLIDAY_FRI() { return m_c_HOLIDAY_FRI; }
	public String getc_HOLIDAY_SAT() { return m_c_HOLIDAY_SAT; }
	public String gett_HOLIDAY_SUN() { return m_t_HOLIDAY_SUN; }
	public String gett_HOLIDAY_MON() { return m_t_HOLIDAY_MON; }
	public String gett_HOLIDAY_TUE() { return m_t_HOLIDAY_TUE; }
	public String gett_HOLIDAY_WED() { return m_t_HOLIDAY_WED; }
	public String gett_HOLIDAY_THU() { return m_t_HOLIDAY_THU; }
	public String gett_HOLIDAY_FRI() { return m_t_HOLIDAY_FRI; }
	public String gett_HOLIDAY_SAT() { return m_t_HOLIDAY_SAT; }
	public String geth_TIME_CTRL() { return m_h_TIME_CTRL; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getCAL_DATE() { return m_CAL_DATE; }
	public Integer getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getCAL_COMMENT() { return m_CAL_COMMENT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getASP_SHIFT_CD() { return m_ASP_SHIFT_CD; }
	public String getCAL_NAME() { return m_CAL_NAME; }
	public String getDATE_TO() { return m_DATE_TO; }
	public String getDATE_FROM() { return m_DATE_FROM; }
	public String getCAL_YEAR() { return m_CAL_YEAR; }
	public String getCAL_YEAR_HOLIDAY() { return m_CAL_YEAR_HOLIDAY; }
	public String getHOLIDAY_DATE() { return m_HOLIDAY_DATE; }
	public String getHOLIDAY_NAME() { return m_HOLIDAY_NAME; }
	public String getsysValue() { return m_sysValue; }
	public String getsysName() { return m_sysName; }

	public List getList_CAL_DATE_WEEK() { return l_CAL_DATE_WEEK; }
	public List getList_h_HOLIDAY_SUN() { return l_h_HOLIDAY_SUN; }
	public List getList_h_HOLIDAY_MON() { return l_h_HOLIDAY_MON; }
	public List getList_h_HOLIDAY_TUE() { return l_h_HOLIDAY_TUE; }
	public List getList_h_HOLIDAY_WED() { return l_h_HOLIDAY_WED; }
	public List getList_h_HOLIDAY_THU() { return l_h_HOLIDAY_THU; }
	public List getList_h_HOLIDAY_FRI() { return l_h_HOLIDAY_FRI; }
	public List getList_h_HOLIDAY_SAT() { return l_h_HOLIDAY_SAT; }
	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_HEAD_DATE() { return l_HEAD_DATE; }
	public List getList_c_HOLIDAY_FLG() { return l_c_HOLIDAY_FLG; }
	public List getList_c_HOLIDAY_SUN() { return l_c_HOLIDAY_SUN; }
	public List getList_c_HOLIDAY_MON() { return l_c_HOLIDAY_MON; }
	public List getList_c_HOLIDAY_TUE() { return l_c_HOLIDAY_TUE; }
	public List getList_c_HOLIDAY_WED() { return l_c_HOLIDAY_WED; }
	public List getList_c_HOLIDAY_THU() { return l_c_HOLIDAY_THU; }
	public List getList_c_HOLIDAY_FRI() { return l_c_HOLIDAY_FRI; }
	public List getList_c_HOLIDAY_SAT() { return l_c_HOLIDAY_SAT; }
	public List getList_t_HOLIDAY_SUN() { return l_t_HOLIDAY_SUN; }
	public List getList_t_HOLIDAY_MON() { return l_t_HOLIDAY_MON; }
	public List getList_t_HOLIDAY_TUE() { return l_t_HOLIDAY_TUE; }
	public List getList_t_HOLIDAY_WED() { return l_t_HOLIDAY_WED; }
	public List getList_t_HOLIDAY_THU() { return l_t_HOLIDAY_THU; }
	public List getList_t_HOLIDAY_FRI() { return l_t_HOLIDAY_FRI; }
	public List getList_t_HOLIDAY_SAT() { return l_t_HOLIDAY_SAT; }
	public List getList_h_TIME_CTRL() { return l_h_TIME_CTRL; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_CAL_DATE() { return l_CAL_DATE; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_CAL_COMMENT() { return l_CAL_COMMENT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ASP_SHIFT_CD() { return l_ASP_SHIFT_CD; }
	public List getList_CAL_NAME() { return l_CAL_NAME; }
	public List getList_DATE_TO() { return l_DATE_TO; }
	public List getList_DATE_FROM() { return l_DATE_FROM; }
	public List getList_CAL_YEAR() { return l_CAL_YEAR; }
	public List getList_CAL_YEAR_HOLIDAY() { return l_CAL_YEAR_HOLIDAY; }
	public List getList_HOLIDAY_DATE() { return l_HOLIDAY_DATE; }
	public List getList_HOLIDAY_NAME() { return l_HOLIDAY_NAME; }
	public List getList_sysValue() { return l_sysValue; }
	public List getList_sysName() { return l_sysName; }

	public void setCAL_DATE_WEEK(String val) { m_CAL_DATE_WEEK = val; }
	public void seth_HOLIDAY_SUN(Integer val) { m_h_HOLIDAY_SUN = val; }
	public void seth_HOLIDAY_MON(Integer val) { m_h_HOLIDAY_MON = val; }
	public void seth_HOLIDAY_TUE(Integer val) { m_h_HOLIDAY_TUE = val; }
	public void seth_HOLIDAY_WED(Integer val) { m_h_HOLIDAY_WED = val; }
	public void seth_HOLIDAY_THU(Integer val) { m_h_HOLIDAY_THU = val; }
	public void seth_HOLIDAY_FRI(Integer val) { m_h_HOLIDAY_FRI = val; }
	public void seth_HOLIDAY_SAT(Integer val) { m_h_HOLIDAY_SAT = val; }
	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setHEAD_DATE(String val) { m_HEAD_DATE = val; }
	public void setc_HOLIDAY_FLG(String val) { m_c_HOLIDAY_FLG = val; }
	public void setc_HOLIDAY_SUN(String val) { m_c_HOLIDAY_SUN = val; }
	public void setc_HOLIDAY_MON(String val) { m_c_HOLIDAY_MON = val; }
	public void setc_HOLIDAY_TUE(String val) { m_c_HOLIDAY_TUE = val; }
	public void setc_HOLIDAY_WED(String val) { m_c_HOLIDAY_WED = val; }
	public void setc_HOLIDAY_THU(String val) { m_c_HOLIDAY_THU = val; }
	public void setc_HOLIDAY_FRI(String val) { m_c_HOLIDAY_FRI = val; }
	public void setc_HOLIDAY_SAT(String val) { m_c_HOLIDAY_SAT = val; }
	public void sett_HOLIDAY_SUN(String val) { m_t_HOLIDAY_SUN = val; }
	public void sett_HOLIDAY_MON(String val) { m_t_HOLIDAY_MON = val; }
	public void sett_HOLIDAY_TUE(String val) { m_t_HOLIDAY_TUE = val; }
	public void sett_HOLIDAY_WED(String val) { m_t_HOLIDAY_WED = val; }
	public void sett_HOLIDAY_THU(String val) { m_t_HOLIDAY_THU = val; }
	public void sett_HOLIDAY_FRI(String val) { m_t_HOLIDAY_FRI = val; }
	public void sett_HOLIDAY_SAT(String val) { m_t_HOLIDAY_SAT = val; }
	public void seth_TIME_CTRL(String val) { m_h_TIME_CTRL = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setCAL_DATE(String val) { m_CAL_DATE = val; }
	public void setHOLIDAY_FLG(Integer val) { m_HOLIDAY_FLG = val; }
	public void setCAL_COMMENT(String val) { m_CAL_COMMENT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setASP_SHIFT_CD(String val) { m_ASP_SHIFT_CD = val; }
	public void setCAL_NAME(String val) { m_CAL_NAME = val; }
	public void setDATE_TO(String val) { m_DATE_TO = val; }
	public void setDATE_FROM(String val) { m_DATE_FROM = val; }
	public void setCAL_YEAR(String val) { m_CAL_YEAR = val; }
	public void setCAL_YEAR_HOLIDAY(String val) { m_CAL_YEAR_HOLIDAY = val; }
	public void setHOLIDAY_DATE(String val) { m_HOLIDAY_DATE = val; }
	public void setHOLIDAY_NAME(String val) { m_HOLIDAY_NAME = val; }
	public void setsysValue(String val) { m_sysValue = val; }
	public void setsysName(String val) { m_sysName = val; }

	public void seth_HOLIDAY_SUN(String val) { m_h_HOLIDAY_SUN = getInteger(val); }
	public void seth_HOLIDAY_MON(String val) { m_h_HOLIDAY_MON = getInteger(val); }
	public void seth_HOLIDAY_TUE(String val) { m_h_HOLIDAY_TUE = getInteger(val); }
	public void seth_HOLIDAY_WED(String val) { m_h_HOLIDAY_WED = getInteger(val); }
	public void seth_HOLIDAY_THU(String val) { m_h_HOLIDAY_THU = getInteger(val); }
	public void seth_HOLIDAY_FRI(String val) { m_h_HOLIDAY_FRI = getInteger(val); }
	public void seth_HOLIDAY_SAT(String val) { m_h_HOLIDAY_SAT = getInteger(val); }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = getInteger(val); }

	public void setList_CAL_DATE_WEEK(List list) { l_CAL_DATE_WEEK = list; }
	public void setList_h_HOLIDAY_SUN(List list) { l_h_HOLIDAY_SUN = list; }
	public void setList_h_HOLIDAY_MON(List list) { l_h_HOLIDAY_MON = list; }
	public void setList_h_HOLIDAY_TUE(List list) { l_h_HOLIDAY_TUE = list; }
	public void setList_h_HOLIDAY_WED(List list) { l_h_HOLIDAY_WED = list; }
	public void setList_h_HOLIDAY_THU(List list) { l_h_HOLIDAY_THU = list; }
	public void setList_h_HOLIDAY_FRI(List list) { l_h_HOLIDAY_FRI = list; }
	public void setList_h_HOLIDAY_SAT(List list) { l_h_HOLIDAY_SAT = list; }
	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_HEAD_DATE(List list) { l_HEAD_DATE = list; }
	public void setList_c_HOLIDAY_FLG(List list) { l_c_HOLIDAY_FLG = list; }
	public void setList_c_HOLIDAY_SUN(List list) { l_c_HOLIDAY_SUN = list; }
	public void setList_c_HOLIDAY_MON(List list) { l_c_HOLIDAY_MON = list; }
	public void setList_c_HOLIDAY_TUE(List list) { l_c_HOLIDAY_TUE = list; }
	public void setList_c_HOLIDAY_WED(List list) { l_c_HOLIDAY_WED = list; }
	public void setList_c_HOLIDAY_THU(List list) { l_c_HOLIDAY_THU = list; }
	public void setList_c_HOLIDAY_FRI(List list) { l_c_HOLIDAY_FRI = list; }
	public void setList_c_HOLIDAY_SAT(List list) { l_c_HOLIDAY_SAT = list; }
	public void setList_t_HOLIDAY_SUN(List list) { l_t_HOLIDAY_SUN = list; }
	public void setList_t_HOLIDAY_MON(List list) { l_t_HOLIDAY_MON = list; }
	public void setList_t_HOLIDAY_TUE(List list) { l_t_HOLIDAY_TUE = list; }
	public void setList_t_HOLIDAY_WED(List list) { l_t_HOLIDAY_WED = list; }
	public void setList_t_HOLIDAY_THU(List list) { l_t_HOLIDAY_THU = list; }
	public void setList_t_HOLIDAY_FRI(List list) { l_t_HOLIDAY_FRI = list; }
	public void setList_t_HOLIDAY_SAT(List list) { l_t_HOLIDAY_SAT = list; }
	public void setList_h_TIME_CTRL(List list) { l_h_TIME_CTRL = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_CAL_DATE(List list) { l_CAL_DATE = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_CAL_COMMENT(List list) { l_CAL_COMMENT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ASP_SHIFT_CD(List list) { l_ASP_SHIFT_CD = list; }
	public void setList_CAL_NAME(List list) { l_CAL_NAME = list; }
	public void setList_DATE_TO(List list) { l_DATE_TO = list; }
	public void setList_DATE_FROM(List list) { l_DATE_FROM = list; }
	public void setList_CAL_YEAR(List list) { l_CAL_YEAR = list; }
	public void setList_CAL_YEAR_HOLIDAY(List list) { l_CAL_YEAR_HOLIDAY = list; }
	public void setList_HOLIDAY_DATE(List list) { l_HOLIDAY_DATE = list; }
	public void setList_HOLIDAY_NAME(List list) { l_HOLIDAY_NAME = list; }
	public void setList_sysValue(List list) { l_sysValue = list; }
	public void setList_sysName(List list) { l_sysName = list; }

	public int setL2L_CAL_DATE_WEEK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_DATE_WEEK == null) {
			l_CAL_DATE_WEEK = new ArrayList();
		} else {
			l_CAL_DATE_WEEK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_DATE_WEEK.add(((AA0080020Struct) list.get(i)).getCAL_DATE_WEEK());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_SUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_SUN == null) {
			l_h_HOLIDAY_SUN = new ArrayList();
		} else {
			l_h_HOLIDAY_SUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_SUN.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_SUN());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_MON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_MON == null) {
			l_h_HOLIDAY_MON = new ArrayList();
		} else {
			l_h_HOLIDAY_MON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_MON.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_MON());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_TUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_TUE == null) {
			l_h_HOLIDAY_TUE = new ArrayList();
		} else {
			l_h_HOLIDAY_TUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_TUE.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_TUE());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_WED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_WED == null) {
			l_h_HOLIDAY_WED = new ArrayList();
		} else {
			l_h_HOLIDAY_WED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_WED.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_WED());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_THU(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_THU == null) {
			l_h_HOLIDAY_THU = new ArrayList();
		} else {
			l_h_HOLIDAY_THU.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_THU.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_THU());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_FRI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_FRI == null) {
			l_h_HOLIDAY_FRI = new ArrayList();
		} else {
			l_h_HOLIDAY_FRI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_FRI.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_FRI());
		}
		return size;
	}
	public int setL2L_h_HOLIDAY_SAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOLIDAY_SAT == null) {
			l_h_HOLIDAY_SAT = new ArrayList();
		} else {
			l_h_HOLIDAY_SAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOLIDAY_SAT.add(((AA0080020Struct) list.get(i)).geth_HOLIDAY_SAT());
		}
		return size;
	}
	public int setL2L_w_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM == null) {
			l_w_DATE_FROM = new ArrayList();
		} else {
			l_w_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM.add(((AA0080020Struct) list.get(i)).getw_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO == null) {
			l_w_DATE_TO = new ArrayList();
		} else {
			l_w_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO.add(((AA0080020Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_HEAD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HEAD_DATE == null) {
			l_HEAD_DATE = new ArrayList();
		} else {
			l_HEAD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HEAD_DATE.add(((AA0080020Struct) list.get(i)).getHEAD_DATE());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_FLG == null) {
			l_c_HOLIDAY_FLG = new ArrayList();
		} else {
			l_c_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_FLG.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_SUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_SUN == null) {
			l_c_HOLIDAY_SUN = new ArrayList();
		} else {
			l_c_HOLIDAY_SUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_SUN.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_SUN());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_MON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_MON == null) {
			l_c_HOLIDAY_MON = new ArrayList();
		} else {
			l_c_HOLIDAY_MON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_MON.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_MON());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_TUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_TUE == null) {
			l_c_HOLIDAY_TUE = new ArrayList();
		} else {
			l_c_HOLIDAY_TUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_TUE.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_TUE());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_WED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_WED == null) {
			l_c_HOLIDAY_WED = new ArrayList();
		} else {
			l_c_HOLIDAY_WED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_WED.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_WED());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_THU(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_THU == null) {
			l_c_HOLIDAY_THU = new ArrayList();
		} else {
			l_c_HOLIDAY_THU.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_THU.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_THU());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_FRI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_FRI == null) {
			l_c_HOLIDAY_FRI = new ArrayList();
		} else {
			l_c_HOLIDAY_FRI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_FRI.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_FRI());
		}
		return size;
	}
	public int setL2L_c_HOLIDAY_SAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_HOLIDAY_SAT == null) {
			l_c_HOLIDAY_SAT = new ArrayList();
		} else {
			l_c_HOLIDAY_SAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_HOLIDAY_SAT.add(((AA0080020Struct) list.get(i)).getc_HOLIDAY_SAT());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_SUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_SUN == null) {
			l_t_HOLIDAY_SUN = new ArrayList();
		} else {
			l_t_HOLIDAY_SUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_SUN.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_SUN());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_MON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_MON == null) {
			l_t_HOLIDAY_MON = new ArrayList();
		} else {
			l_t_HOLIDAY_MON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_MON.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_MON());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_TUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_TUE == null) {
			l_t_HOLIDAY_TUE = new ArrayList();
		} else {
			l_t_HOLIDAY_TUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_TUE.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_TUE());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_WED(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_WED == null) {
			l_t_HOLIDAY_WED = new ArrayList();
		} else {
			l_t_HOLIDAY_WED.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_WED.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_WED());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_THU(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_THU == null) {
			l_t_HOLIDAY_THU = new ArrayList();
		} else {
			l_t_HOLIDAY_THU.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_THU.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_THU());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_FRI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_FRI == null) {
			l_t_HOLIDAY_FRI = new ArrayList();
		} else {
			l_t_HOLIDAY_FRI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_FRI.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_FRI());
		}
		return size;
	}
	public int setL2L_t_HOLIDAY_SAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_HOLIDAY_SAT == null) {
			l_t_HOLIDAY_SAT = new ArrayList();
		} else {
			l_t_HOLIDAY_SAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_HOLIDAY_SAT.add(((AA0080020Struct) list.get(i)).gett_HOLIDAY_SAT());
		}
		return size;
	}
	public int setL2L_h_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TIME_CTRL == null) {
			l_h_TIME_CTRL = new ArrayList();
		} else {
			l_h_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TIME_CTRL.add(((AA0080020Struct) list.get(i)).geth_TIME_CTRL());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AA0080020Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_DATE == null) {
			l_CAL_DATE = new ArrayList();
		} else {
			l_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_DATE.add(((AA0080020Struct) list.get(i)).getCAL_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AA0080020Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_CAL_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_COMMENT == null) {
			l_CAL_COMMENT = new ArrayList();
		} else {
			l_CAL_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_COMMENT.add(((AA0080020Struct) list.get(i)).getCAL_COMMENT());
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
			l_MODIFY_COUNT.add(((AA0080020Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ASP_SHIFT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASP_SHIFT_CD == null) {
			l_ASP_SHIFT_CD = new ArrayList();
		} else {
			l_ASP_SHIFT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASP_SHIFT_CD.add(((AA0080020Struct) list.get(i)).getASP_SHIFT_CD());
		}
		return size;
	}
	public int setL2L_CAL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME == null) {
			l_CAL_NAME = new ArrayList();
		} else {
			l_CAL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME.add(((AA0080020Struct) list.get(i)).getCAL_NAME());
		}
		return size;
	}
	public int setL2L_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATE_TO == null) {
			l_DATE_TO = new ArrayList();
		} else {
			l_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATE_TO.add(((AA0080020Struct) list.get(i)).getDATE_TO());
		}
		return size;
	}
	public int setL2L_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATE_FROM == null) {
			l_DATE_FROM = new ArrayList();
		} else {
			l_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATE_FROM.add(((AA0080020Struct) list.get(i)).getDATE_FROM());
		}
		return size;
	}
	public int setL2L_CAL_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_YEAR == null) {
			l_CAL_YEAR = new ArrayList();
		} else {
			l_CAL_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_YEAR.add(((AA0080020Struct) list.get(i)).getCAL_YEAR());
		}
		return size;
	}
	public int setL2L_CAL_YEAR_HOLIDAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_YEAR_HOLIDAY == null) {
			l_CAL_YEAR_HOLIDAY = new ArrayList();
		} else {
			l_CAL_YEAR_HOLIDAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_YEAR_HOLIDAY.add(((AA0080020Struct) list.get(i)).getCAL_YEAR_HOLIDAY());
		}
		return size;
	}
	public int setL2L_HOLIDAY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_DATE == null) {
			l_HOLIDAY_DATE = new ArrayList();
		} else {
			l_HOLIDAY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_DATE.add(((AA0080020Struct) list.get(i)).getHOLIDAY_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_NAME == null) {
			l_HOLIDAY_NAME = new ArrayList();
		} else {
			l_HOLIDAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_NAME.add(((AA0080020Struct) list.get(i)).getHOLIDAY_NAME());
		}
		return size;
	}
	public int setL2L_sysValue(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysValue == null) {
			l_sysValue = new ArrayList();
		} else {
			l_sysValue.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysValue.add(((AA0080020Struct) list.get(i)).getsysValue());
		}
		return size;
	}
	public int setL2L_sysName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysName == null) {
			l_sysName = new ArrayList();
		} else {
			l_sysName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysName.add(((AA0080020Struct) list.get(i)).getsysName());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CAL_DATE_WEEK = null;
		m_h_HOLIDAY_SUN = null;
		m_h_HOLIDAY_MON = null;
		m_h_HOLIDAY_TUE = null;
		m_h_HOLIDAY_WED = null;
		m_h_HOLIDAY_THU = null;
		m_h_HOLIDAY_FRI = null;
		m_h_HOLIDAY_SAT = null;
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_HEAD_DATE = null;
		m_c_HOLIDAY_FLG = null;
		m_c_HOLIDAY_SUN = null;
		m_c_HOLIDAY_MON = null;
		m_c_HOLIDAY_TUE = null;
		m_c_HOLIDAY_WED = null;
		m_c_HOLIDAY_THU = null;
		m_c_HOLIDAY_FRI = null;
		m_c_HOLIDAY_SAT = null;
		m_t_HOLIDAY_SUN = null;
		m_t_HOLIDAY_MON = null;
		m_t_HOLIDAY_TUE = null;
		m_t_HOLIDAY_WED = null;
		m_t_HOLIDAY_THU = null;
		m_t_HOLIDAY_FRI = null;
		m_t_HOLIDAY_SAT = null;
		m_h_TIME_CTRL = null;
		m_CAL_NO = null;
		m_CAL_DATE = null;
		m_HOLIDAY_FLG = null;
		m_CAL_COMMENT = null;
		m_MODIFY_COUNT = null;
		m_ASP_SHIFT_CD = null;
		m_CAL_NAME = null;
		m_DATE_TO = null;
		m_DATE_FROM = null;
		m_CAL_YEAR = null;
		m_CAL_YEAR_HOLIDAY = null;
		m_HOLIDAY_DATE = null;
		m_HOLIDAY_NAME = null;
		m_sysValue = null;
		m_sysName = null;

		l_CAL_DATE_WEEK = null;
		l_h_HOLIDAY_SUN = null;
		l_h_HOLIDAY_MON = null;
		l_h_HOLIDAY_TUE = null;
		l_h_HOLIDAY_WED = null;
		l_h_HOLIDAY_THU = null;
		l_h_HOLIDAY_FRI = null;
		l_h_HOLIDAY_SAT = null;
		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_HEAD_DATE = null;
		l_c_HOLIDAY_FLG = null;
		l_c_HOLIDAY_SUN = null;
		l_c_HOLIDAY_MON = null;
		l_c_HOLIDAY_TUE = null;
		l_c_HOLIDAY_WED = null;
		l_c_HOLIDAY_THU = null;
		l_c_HOLIDAY_FRI = null;
		l_c_HOLIDAY_SAT = null;
		l_t_HOLIDAY_SUN = null;
		l_t_HOLIDAY_MON = null;
		l_t_HOLIDAY_TUE = null;
		l_t_HOLIDAY_WED = null;
		l_t_HOLIDAY_THU = null;
		l_t_HOLIDAY_FRI = null;
		l_t_HOLIDAY_SAT = null;
		l_h_TIME_CTRL = null;
		l_CAL_NO = null;
		l_CAL_DATE = null;
		l_HOLIDAY_FLG = null;
		l_CAL_COMMENT = null;
		l_MODIFY_COUNT = null;
		l_ASP_SHIFT_CD = null;
		l_CAL_NAME = null;
		l_DATE_TO = null;
		l_DATE_FROM = null;
		l_CAL_YEAR = null;
		l_CAL_YEAR_HOLIDAY = null;
		l_HOLIDAY_DATE = null;
		l_HOLIDAY_NAME = null;
		l_sysValue = null;
		l_sysName = null;

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
	 * medAA0080020�N���X�̕W���R���X�g���N�^
	 */
	public AA0080020Struct()
	{
		//{{user_implement_code_constractor
                m_CAL_NO = new String("0");
                 
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
	public void setStruct(AA0080020Struct struct)
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
	public void setStructM(AA0080020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCAL_DATE_WEEK(struct.getCAL_DATE_WEEK());
			this.seth_HOLIDAY_SUN(struct.geth_HOLIDAY_SUN());
			this.seth_HOLIDAY_MON(struct.geth_HOLIDAY_MON());
			this.seth_HOLIDAY_TUE(struct.geth_HOLIDAY_TUE());
			this.seth_HOLIDAY_WED(struct.geth_HOLIDAY_WED());
			this.seth_HOLIDAY_THU(struct.geth_HOLIDAY_THU());
			this.seth_HOLIDAY_FRI(struct.geth_HOLIDAY_FRI());
			this.seth_HOLIDAY_SAT(struct.geth_HOLIDAY_SAT());
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setHEAD_DATE(struct.getHEAD_DATE());
			this.setc_HOLIDAY_FLG(struct.getc_HOLIDAY_FLG());
			this.setc_HOLIDAY_SUN(struct.getc_HOLIDAY_SUN());
			this.setc_HOLIDAY_MON(struct.getc_HOLIDAY_MON());
			this.setc_HOLIDAY_TUE(struct.getc_HOLIDAY_TUE());
			this.setc_HOLIDAY_WED(struct.getc_HOLIDAY_WED());
			this.setc_HOLIDAY_THU(struct.getc_HOLIDAY_THU());
			this.setc_HOLIDAY_FRI(struct.getc_HOLIDAY_FRI());
			this.setc_HOLIDAY_SAT(struct.getc_HOLIDAY_SAT());
			this.sett_HOLIDAY_SUN(struct.gett_HOLIDAY_SUN());
			this.sett_HOLIDAY_MON(struct.gett_HOLIDAY_MON());
			this.sett_HOLIDAY_TUE(struct.gett_HOLIDAY_TUE());
			this.sett_HOLIDAY_WED(struct.gett_HOLIDAY_WED());
			this.sett_HOLIDAY_THU(struct.gett_HOLIDAY_THU());
			this.sett_HOLIDAY_FRI(struct.gett_HOLIDAY_FRI());
			this.sett_HOLIDAY_SAT(struct.gett_HOLIDAY_SAT());
			this.seth_TIME_CTRL(struct.geth_TIME_CTRL());
			this.setCAL_NO(struct.getCAL_NO());
			this.setCAL_DATE(struct.getCAL_DATE());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setCAL_COMMENT(struct.getCAL_COMMENT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setASP_SHIFT_CD(struct.getASP_SHIFT_CD());
			this.setCAL_NAME(struct.getCAL_NAME());
			this.setDATE_TO(struct.getDATE_TO());
			this.setDATE_FROM(struct.getDATE_FROM());
			this.setCAL_YEAR(struct.getCAL_YEAR());
			this.setCAL_YEAR_HOLIDAY(struct.getCAL_YEAR_HOLIDAY());
			this.setHOLIDAY_DATE(struct.getHOLIDAY_DATE());
			this.setHOLIDAY_NAME(struct.getHOLIDAY_NAME());
			this.setsysValue(struct.getsysValue());
			this.setsysName(struct.getsysName());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0080020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CAL_DATE_WEEK(struct.getList_CAL_DATE_WEEK());
			this.setList_h_HOLIDAY_SUN(struct.getList_h_HOLIDAY_SUN());
			this.setList_h_HOLIDAY_MON(struct.getList_h_HOLIDAY_MON());
			this.setList_h_HOLIDAY_TUE(struct.getList_h_HOLIDAY_TUE());
			this.setList_h_HOLIDAY_WED(struct.getList_h_HOLIDAY_WED());
			this.setList_h_HOLIDAY_THU(struct.getList_h_HOLIDAY_THU());
			this.setList_h_HOLIDAY_FRI(struct.getList_h_HOLIDAY_FRI());
			this.setList_h_HOLIDAY_SAT(struct.getList_h_HOLIDAY_SAT());
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_HEAD_DATE(struct.getList_HEAD_DATE());
			this.setList_c_HOLIDAY_FLG(struct.getList_c_HOLIDAY_FLG());
			this.setList_c_HOLIDAY_SUN(struct.getList_c_HOLIDAY_SUN());
			this.setList_c_HOLIDAY_MON(struct.getList_c_HOLIDAY_MON());
			this.setList_c_HOLIDAY_TUE(struct.getList_c_HOLIDAY_TUE());
			this.setList_c_HOLIDAY_WED(struct.getList_c_HOLIDAY_WED());
			this.setList_c_HOLIDAY_THU(struct.getList_c_HOLIDAY_THU());
			this.setList_c_HOLIDAY_FRI(struct.getList_c_HOLIDAY_FRI());
			this.setList_c_HOLIDAY_SAT(struct.getList_c_HOLIDAY_SAT());
			this.setList_t_HOLIDAY_SUN(struct.getList_t_HOLIDAY_SUN());
			this.setList_t_HOLIDAY_MON(struct.getList_t_HOLIDAY_MON());
			this.setList_t_HOLIDAY_TUE(struct.getList_t_HOLIDAY_TUE());
			this.setList_t_HOLIDAY_WED(struct.getList_t_HOLIDAY_WED());
			this.setList_t_HOLIDAY_THU(struct.getList_t_HOLIDAY_THU());
			this.setList_t_HOLIDAY_FRI(struct.getList_t_HOLIDAY_FRI());
			this.setList_t_HOLIDAY_SAT(struct.getList_t_HOLIDAY_SAT());
			this.setList_h_TIME_CTRL(struct.getList_h_TIME_CTRL());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_CAL_DATE(struct.getList_CAL_DATE());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_CAL_COMMENT(struct.getList_CAL_COMMENT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ASP_SHIFT_CD(struct.getList_ASP_SHIFT_CD());
			this.setList_CAL_NAME(struct.getList_CAL_NAME());
			this.setList_DATE_TO(struct.getList_DATE_TO());
			this.setList_DATE_FROM(struct.getList_DATE_FROM());
			this.setList_CAL_YEAR(struct.getList_CAL_YEAR());
			this.setList_CAL_YEAR_HOLIDAY(struct.getList_CAL_YEAR_HOLIDAY());
			this.setList_HOLIDAY_DATE(struct.getList_HOLIDAY_DATE());
			this.setList_HOLIDAY_NAME(struct.getList_HOLIDAY_NAME());
			this.setList_sysValue(struct.getList_sysValue());
			this.setList_sysName(struct.getList_sysName());
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
	// �� 1 �ϐ������l�F i_CAL_DATE_WEEK


	final static String i_CAL_DATE_WEEK = null;

	// �� 2 �ϐ������l�F i_h_HOLIDAY_SUN


	final static Integer i_h_HOLIDAY_SUN = null;

	// �� 3 �ϐ������l�F i_h_HOLIDAY_MON


	final static Integer i_h_HOLIDAY_MON = null;

	// �� 4 �ϐ������l�F i_h_HOLIDAY_TUE


	final static Integer i_h_HOLIDAY_TUE = null;

	// �� 5 �ϐ������l�F i_h_HOLIDAY_WED


	final static Integer i_h_HOLIDAY_WED = null;

	// �� 6 �ϐ������l�F i_h_HOLIDAY_THU


	final static Integer i_h_HOLIDAY_THU = null;

	// �� 7 �ϐ������l�F i_h_HOLIDAY_FRI


	final static Integer i_h_HOLIDAY_FRI = null;

	// �� 8 �ϐ������l�F i_h_HOLIDAY_SAT


	final static Integer i_h_HOLIDAY_SAT = null;

	// �� 9 �ϐ������l�F i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// �� 10 �ϐ������l�F i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// �� 11 �ϐ������l�F i_HEAD_DATE


	final static String i_HEAD_DATE = null;

	// �� 12 �ϐ������l�F i_c_HOLIDAY_FLG


	final static String i_c_HOLIDAY_FLG = null;

	// �� 13 �ϐ������l�F i_c_HOLIDAY_SUN


	final static String i_c_HOLIDAY_SUN = null;

	// �� 14 �ϐ������l�F i_c_HOLIDAY_MON


	final static String i_c_HOLIDAY_MON = null;

	// �� 15 �ϐ������l�F i_c_HOLIDAY_TUE


	final static String i_c_HOLIDAY_TUE = null;

	// �� 16 �ϐ������l�F i_c_HOLIDAY_WED


	final static String i_c_HOLIDAY_WED = null;

	// �� 17 �ϐ������l�F i_c_HOLIDAY_THU


	final static String i_c_HOLIDAY_THU = null;

	// �� 18 �ϐ������l�F i_c_HOLIDAY_FRI


	final static String i_c_HOLIDAY_FRI = null;

	// �� 19 �ϐ������l�F i_c_HOLIDAY_SAT


	final static String i_c_HOLIDAY_SAT = null;

	// �� 20 �ϐ������l�F i_t_HOLIDAY_SUN


	final static String i_t_HOLIDAY_SUN = null;

	// �� 21 �ϐ������l�F i_t_HOLIDAY_MON


	final static String i_t_HOLIDAY_MON = null;

	// �� 22 �ϐ������l�F i_t_HOLIDAY_TUE


	final static String i_t_HOLIDAY_TUE = null;

	// �� 23 �ϐ������l�F i_t_HOLIDAY_WED


	final static String i_t_HOLIDAY_WED = null;

	// �� 24 �ϐ������l�F i_t_HOLIDAY_THU


	final static String i_t_HOLIDAY_THU = null;

	// �� 25 �ϐ������l�F i_t_HOLIDAY_FRI


	final static String i_t_HOLIDAY_FRI = null;

	// �� 26 �ϐ������l�F i_t_HOLIDAY_SAT


	final static String i_t_HOLIDAY_SAT = null;

	// �� 27 �ϐ������l�F i_h_TIME_CTRL


	final static String i_h_TIME_CTRL = null;

	// �� 28 �ϐ������l�F i_CAL_NO


	final static String i_CAL_NO = null;

	// �� 29 �ϐ������l�F i_CAL_DATE


	final static String i_CAL_DATE = null;

	// �� 30 �ϐ������l�F i_HOLIDAY_FLG


	final static Integer i_HOLIDAY_FLG = null;

	// �� 31 �ϐ������l�F i_CAL_COMMENT


	final static String i_CAL_COMMENT = null;

	// �� 32 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 33 �ϐ������l�F i_ASP_SHIFT_CD


	final static String i_ASP_SHIFT_CD = null;

	// �� 34 �ϐ������l�F i_CAL_NAME


	final static String i_CAL_NAME = null;

	// �� 35 �ϐ������l�F i_DATE_TO


	final static String i_DATE_TO = null;

	// �� 36 �ϐ������l�F i_DATE_FROM


	final static String i_DATE_FROM = null;

	// �� 37 �ϐ������l�F i_CAL_YEAR


	final static String i_CAL_YEAR = null;

	// �� 38 �ϐ������l�F i_CAL_YEAR_HOLIDAY


	final static String i_CAL_YEAR_HOLIDAY = null;

	// �� 39 �ϐ������l�F i_HOLIDAY_DATE


	final static String i_HOLIDAY_DATE = null;

	// �� 40 �ϐ������l�F i_HOLIDAY_NAME


	final static String i_HOLIDAY_NAME = null;

	// �� 41 �ϐ������l�F i_sysValue


	final static String i_sysValue = null;

	// �� 42 �ϐ������l�F i_sysName


	final static String i_sysName = null;

*/

	//{{user_implement_code
        //---------------------------------------------------------------------
       
        /**
         * �R�s�[
         * @param struct �R�s�[�Ώ�
         */
        public void copy(AA0080020Struct s)
        {
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_CAL_NO != null) m_CAL_NO = new String(s.m_CAL_NO);
         if(s.m_CAL_DATE != null) m_CAL_DATE = new String(s.m_CAL_DATE);
         if(s.m_HOLIDAY_FLG != null) m_HOLIDAY_FLG = new Integer(s.m_HOLIDAY_FLG.intValue());
         if(s.m_CAL_COMMENT != null) m_CAL_COMMENT = new String(s.m_CAL_COMMENT);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_CAL_NAME != null) m_CAL_NAME = new String(s.m_CAL_NAME);
         if(s.m_DATE_TO != null) m_DATE_TO = new String(s.m_DATE_TO);
         if(s.m_DATE_FROM != null) m_DATE_FROM = new String(s.m_DATE_FROM);
         if(s.m_CAL_YEAR != null) m_CAL_YEAR = new String(s.m_CAL_YEAR);
         if(s.m_CAL_YEAR_HOLIDAY != null) m_CAL_YEAR_HOLIDAY = new String(s.m_CAL_YEAR_HOLIDAY);
         if(s.m_HOLIDAY_DATE != null) m_HOLIDAY_DATE = new String(s.m_HOLIDAY_DATE);
         if(s.m_HOLIDAY_NAME != null) m_HOLIDAY_NAME = new String(s.m_HOLIDAY_NAME);
         if(s.m_CAL_DATE_WEEK != null) m_CAL_DATE_WEEK = new String(s.m_CAL_DATE_WEEK);
         if(s.m_h_HOLIDAY_SUN != null) m_h_HOLIDAY_SUN = new Integer(s.m_h_HOLIDAY_SUN.intValue());
         if(s.m_h_HOLIDAY_MON != null) m_h_HOLIDAY_MON = new Integer(s.m_h_HOLIDAY_MON.intValue());
         if(s.m_h_HOLIDAY_TUE != null) m_h_HOLIDAY_TUE = new Integer(s.m_h_HOLIDAY_TUE.intValue());
         if(s.m_h_HOLIDAY_WED != null) m_h_HOLIDAY_WED = new Integer(s.m_h_HOLIDAY_WED.intValue());
         if(s.m_h_HOLIDAY_THU != null) m_h_HOLIDAY_THU = new Integer(s.m_h_HOLIDAY_THU.intValue());
         if(s.m_h_HOLIDAY_FRI != null) m_h_HOLIDAY_FRI = new Integer(s.m_h_HOLIDAY_FRI.intValue());
         if(s.m_h_HOLIDAY_SAT != null) m_h_HOLIDAY_SAT = new Integer(s.m_h_HOLIDAY_SAT.intValue());
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_HEAD_DATE != null) m_HEAD_DATE = new String(s.m_HEAD_DATE);
         if(s.m_c_HOLIDAY_FLG != null) m_c_HOLIDAY_FLG = new String(s.m_c_HOLIDAY_FLG);
         if(s.m_c_HOLIDAY_SUN != null) m_c_HOLIDAY_SUN = new String(s.m_c_HOLIDAY_SUN);
         if(s.m_c_HOLIDAY_MON != null) m_c_HOLIDAY_MON = new String(s.m_c_HOLIDAY_MON);
         if(s.m_c_HOLIDAY_TUE != null) m_c_HOLIDAY_TUE = new String(s.m_c_HOLIDAY_TUE);
         if(s.m_c_HOLIDAY_WED != null) m_c_HOLIDAY_WED = new String(s.m_c_HOLIDAY_WED);
         if(s.m_c_HOLIDAY_THU != null) m_c_HOLIDAY_THU = new String(s.m_c_HOLIDAY_THU);
         if(s.m_c_HOLIDAY_FRI != null) m_c_HOLIDAY_FRI = new String(s.m_c_HOLIDAY_FRI);
         if(s.m_c_HOLIDAY_SAT != null) m_c_HOLIDAY_SAT = new String(s.m_c_HOLIDAY_SAT);
         if(s.m_ASP_SHIFT_CD != null) m_ASP_SHIFT_CD = new String(s.m_ASP_SHIFT_CD);
        }
       
        /**	
         * �����̏��̕ێ����郊�X�g�̕ϐ�����w��̏��̃f�[�^���擾	
         * @param in ���X�g�ێ��̏��	
         * @param index ����	
         */	
        public void importData(AA0080020Struct in, int index)	
        {	
         clear();
         if(in.l_CAL_NO != null && in.l_CAL_NO.size() > index)  m_CAL_NO = (String)(in.l_CAL_NO.get(index));
         if(in.l_CAL_DATE != null && in.l_CAL_DATE.size() > index)  m_CAL_DATE = (String)(in.l_CAL_DATE.get(index));
         if(in.l_HOLIDAY_FLG != null && in.l_HOLIDAY_FLG.size() > index)  m_HOLIDAY_FLG = new Integer((String)(in.l_HOLIDAY_FLG.get(index)));
         if(in.l_CAL_COMMENT != null && in.l_CAL_COMMENT.size() > index)  m_CAL_COMMENT = (String)(in.l_CAL_COMMENT.get(index));
         if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
         if(in.l_CAL_NAME != null && in.l_CAL_NAME.size() > index)  m_CAL_NAME = (String)(in.l_CAL_NAME.get(index));
         if(in.l_DATE_TO != null && in.l_DATE_TO.size() > index)  m_DATE_TO = (String)(in.l_DATE_TO.get(index));
         if(in.l_DATE_FROM != null && in.l_DATE_FROM.size() > index)  m_DATE_FROM = (String)(in.l_DATE_FROM.get(index));
         if(in.l_CAL_YEAR != null && in.l_CAL_YEAR.size() > index)  m_CAL_YEAR = (String)(in.l_CAL_YEAR.get(index));
         if(in.l_CAL_YEAR_HOLIDAY != null && in.l_CAL_YEAR_HOLIDAY.size() > index)  m_CAL_YEAR_HOLIDAY = (String)(in.l_CAL_YEAR_HOLIDAY.get(index));
         if(in.l_HOLIDAY_DATE != null && in.l_HOLIDAY_DATE.size() > index)  m_HOLIDAY_DATE = (String)(in.l_HOLIDAY_DATE.get(index));
         if(in.l_HOLIDAY_NAME != null && in.l_HOLIDAY_NAME.size() > index)  m_HOLIDAY_NAME = (String)(in.l_HOLIDAY_NAME.get(index));
         if(in.l_CAL_DATE_WEEK != null && in.l_CAL_DATE_WEEK.size() > index)  m_CAL_DATE_WEEK = (String)(in.l_CAL_DATE_WEEK.get(index));
         if(in.l_h_HOLIDAY_SUN != null && in.l_h_HOLIDAY_SUN.size() > index)  m_h_HOLIDAY_SUN = new Integer((String)(in.l_h_HOLIDAY_SUN.get(index)));
         if(in.l_h_HOLIDAY_MON != null && in.l_h_HOLIDAY_MON.size() > index)  m_h_HOLIDAY_MON = new Integer((String)(in.l_h_HOLIDAY_MON.get(index)));
         if(in.l_h_HOLIDAY_TUE != null && in.l_h_HOLIDAY_TUE.size() > index)  m_h_HOLIDAY_TUE = new Integer((String)(in.l_h_HOLIDAY_TUE.get(index)));
         if(in.l_h_HOLIDAY_WED != null && in.l_h_HOLIDAY_WED.size() > index)  m_h_HOLIDAY_WED = new Integer((String)(in.l_h_HOLIDAY_WED.get(index)));
         if(in.l_h_HOLIDAY_THU != null && in.l_h_HOLIDAY_THU.size() > index)  m_h_HOLIDAY_THU = new Integer((String)(in.l_h_HOLIDAY_THU.get(index)));
         if(in.l_h_HOLIDAY_FRI != null && in.l_h_HOLIDAY_FRI.size() > index)  m_h_HOLIDAY_FRI = new Integer((String)(in.l_h_HOLIDAY_FRI.get(index)));
         if(in.l_h_HOLIDAY_SAT != null && in.l_h_HOLIDAY_SAT.size() > index)  m_h_HOLIDAY_SAT = new Integer((String)(in.l_h_HOLIDAY_SAT.get(index)));
         if(in.l_w_DATE_FROM != null && in.l_w_DATE_FROM.size() > index)  m_w_DATE_FROM = (String)(in.l_w_DATE_FROM.get(index));
         if(in.l_w_DATE_TO != null && in.l_w_DATE_TO.size() > index)  m_w_DATE_TO = (String)(in.l_w_DATE_TO.get(index));
         if(in.l_HEAD_DATE != null && in.l_HEAD_DATE.size() > index)  m_HEAD_DATE = (String)(in.l_HEAD_DATE.get(index));
         if(in.l_c_HOLIDAY_FLG != null && in.l_c_HOLIDAY_FLG.size() > index)  m_c_HOLIDAY_FLG = (String)(in.l_c_HOLIDAY_FLG.get(index));
         if(in.l_c_HOLIDAY_SUN != null && in.l_c_HOLIDAY_SUN.size() > index)  m_c_HOLIDAY_SUN = (String)(in.l_c_HOLIDAY_SUN.get(index));
         if(in.l_c_HOLIDAY_MON != null && in.l_c_HOLIDAY_MON.size() > index)  m_c_HOLIDAY_MON = (String)(in.l_c_HOLIDAY_MON.get(index));
         if(in.l_c_HOLIDAY_TUE != null && in.l_c_HOLIDAY_TUE.size() > index)  m_c_HOLIDAY_TUE = (String)(in.l_c_HOLIDAY_TUE.get(index));
         if(in.l_c_HOLIDAY_WED != null && in.l_c_HOLIDAY_WED.size() > index)  m_c_HOLIDAY_WED = (String)(in.l_c_HOLIDAY_WED.get(index));
         if(in.l_c_HOLIDAY_THU != null && in.l_c_HOLIDAY_THU.size() > index)  m_c_HOLIDAY_THU = (String)(in.l_c_HOLIDAY_THU.get(index));
         if(in.l_c_HOLIDAY_FRI != null && in.l_c_HOLIDAY_FRI.size() > index)  m_c_HOLIDAY_FRI = (String)(in.l_c_HOLIDAY_FRI.get(index));
         if(in.l_c_HOLIDAY_SAT != null && in.l_c_HOLIDAY_SAT.size() > index)  m_c_HOLIDAY_SAT = (String)(in.l_c_HOLIDAY_SAT.get(index));
         if(in.l_ASP_SHIFT_CD != null && in.l_ASP_SHIFT_CD.size() > index) m_ASP_SHIFT_CD = (String)(in.l_ASP_SHIFT_CD.get(index));
         return;
        }	
        //---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
