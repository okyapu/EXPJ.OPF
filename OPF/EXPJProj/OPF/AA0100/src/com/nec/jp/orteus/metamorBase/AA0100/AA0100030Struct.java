/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/src/com/nec/jp/orteus/metamorBase/AA0100/AA0100030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0100;

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

public class AA0100030Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ROUND_TYP_name */
	public String m_ROUND_TYP_name = null;
	/** �� 2 �ϐ��F m_ROUND_TYP_val */
	public Integer m_ROUND_TYP_val = null;
	/** �� 3 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 4 �ϐ��F m_TAX_NAME */
	public String m_TAX_NAME = null;
	/** �� 5 �ϐ��F m_TAX_ANAME */
	public String m_TAX_ANAME = null;
	/** �� 6 �ϐ��F m_OLD_TAX_RATE_1 */
	public String m_OLD_TAX_RATE_1 = null;
	/** �� 7 �ϐ��F m_OLD_TAX_RATE_2 */
	public String m_OLD_TAX_RATE_2 = null;
	/** �� 8 �ϐ��F m_OLD_TAX_RATE_3 */
	public String m_OLD_TAX_RATE_3 = null;
	/** �� 9 �ϐ��F m_NEW_TAX_RATE_START_DATE */
	public String m_NEW_TAX_RATE_START_DATE = null;
	/** �� 10 �ϐ��F m_NEW_TAX_RATE_1 */
	public String m_NEW_TAX_RATE_1 = null;
	/** �� 11 �ϐ��F m_NEW_TAX_RATE_2 */
	public String m_NEW_TAX_RATE_2 = null;
	/** �� 12 �ϐ��F m_NEW_TAX_RATE_3 */
	public String m_NEW_TAX_RATE_3 = null;
	/** �� 13 �ϐ��F m_ROUND_TYP */
	public Integer m_ROUND_TYP = null;
	/** �� 14 �ϐ��F m_OLD_GL_TAX_CD */
	public String m_OLD_GL_TAX_CD = null;
	/** �� 15 �ϐ��F m_NEW_GL_TAX_CD */
	public String m_NEW_GL_TAX_CD = null;
	/** �� 16 �ϐ��F m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** �� 17 �ϐ��F m_w_COUNT */
	public Integer m_w_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ROUND_TYP_name */
	public List l_ROUND_TYP_name = null;

	/** �� 2 List�ϐ��F l_ROUND_TYP_val */
	public List l_ROUND_TYP_val = null;

	/** �� 3 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 4 List�ϐ��F l_TAX_NAME */
	public List l_TAX_NAME = null;

	/** �� 5 List�ϐ��F l_TAX_ANAME */
	public List l_TAX_ANAME = null;

	/** �� 6 List�ϐ��F l_OLD_TAX_RATE_1 */
	public List l_OLD_TAX_RATE_1 = null;

	/** �� 7 List�ϐ��F l_OLD_TAX_RATE_2 */
	public List l_OLD_TAX_RATE_2 = null;

	/** �� 8 List�ϐ��F l_OLD_TAX_RATE_3 */
	public List l_OLD_TAX_RATE_3 = null;

	/** �� 9 List�ϐ��F l_NEW_TAX_RATE_START_DATE */
	public List l_NEW_TAX_RATE_START_DATE = null;

	/** �� 10 List�ϐ��F l_NEW_TAX_RATE_1 */
	public List l_NEW_TAX_RATE_1 = null;

	/** �� 11 List�ϐ��F l_NEW_TAX_RATE_2 */
	public List l_NEW_TAX_RATE_2 = null;

	/** �� 12 List�ϐ��F l_NEW_TAX_RATE_3 */
	public List l_NEW_TAX_RATE_3 = null;

	/** �� 13 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 14 List�ϐ��F l_OLD_GL_TAX_CD */
	public List l_OLD_GL_TAX_CD = null;

	/** �� 15 List�ϐ��F l_NEW_GL_TAX_CD */
	public List l_NEW_GL_TAX_CD = null;

	/** �� 16 List�ϐ��F l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** �� 17 List�ϐ��F l_w_COUNT */
	public List l_w_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getROUND_TYP_name() { return m_ROUND_TYP_name; }
	public Integer getROUND_TYP_val() { return m_ROUND_TYP_val; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_NAME() { return m_TAX_NAME; }
	public String getTAX_ANAME() { return m_TAX_ANAME; }
	public String getOLD_TAX_RATE_1() { return m_OLD_TAX_RATE_1; }
	public String getOLD_TAX_RATE_2() { return m_OLD_TAX_RATE_2; }
	public String getOLD_TAX_RATE_3() { return m_OLD_TAX_RATE_3; }
	public String getNEW_TAX_RATE_START_DATE() { return m_NEW_TAX_RATE_START_DATE; }
	public String getNEW_TAX_RATE_1() { return m_NEW_TAX_RATE_1; }
	public String getNEW_TAX_RATE_2() { return m_NEW_TAX_RATE_2; }
	public String getNEW_TAX_RATE_3() { return m_NEW_TAX_RATE_3; }
	public Integer getROUND_TYP() { return m_ROUND_TYP; }
	public String getOLD_GL_TAX_CD() { return m_OLD_GL_TAX_CD; }
	public String getNEW_GL_TAX_CD() { return m_NEW_GL_TAX_CD; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public Integer getw_COUNT() { return m_w_COUNT; }

	public List getList_ROUND_TYP_name() { return l_ROUND_TYP_name; }
	public List getList_ROUND_TYP_val() { return l_ROUND_TYP_val; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_NAME() { return l_TAX_NAME; }
	public List getList_TAX_ANAME() { return l_TAX_ANAME; }
	public List getList_OLD_TAX_RATE_1() { return l_OLD_TAX_RATE_1; }
	public List getList_OLD_TAX_RATE_2() { return l_OLD_TAX_RATE_2; }
	public List getList_OLD_TAX_RATE_3() { return l_OLD_TAX_RATE_3; }
	public List getList_NEW_TAX_RATE_START_DATE() { return l_NEW_TAX_RATE_START_DATE; }
	public List getList_NEW_TAX_RATE_1() { return l_NEW_TAX_RATE_1; }
	public List getList_NEW_TAX_RATE_2() { return l_NEW_TAX_RATE_2; }
	public List getList_NEW_TAX_RATE_3() { return l_NEW_TAX_RATE_3; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_OLD_GL_TAX_CD() { return l_OLD_GL_TAX_CD; }
	public List getList_NEW_GL_TAX_CD() { return l_NEW_GL_TAX_CD; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_w_COUNT() { return l_w_COUNT; }

	public void setROUND_TYP_name(String val) { m_ROUND_TYP_name = val; }
	public void setROUND_TYP_val(Integer val) { m_ROUND_TYP_val = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_NAME(String val) { m_TAX_NAME = val; }
	public void setTAX_ANAME(String val) { m_TAX_ANAME = val; }
	public void setOLD_TAX_RATE_1(String val) { m_OLD_TAX_RATE_1 = val; }
	public void setOLD_TAX_RATE_2(String val) { m_OLD_TAX_RATE_2 = val; }
	public void setOLD_TAX_RATE_3(String val) { m_OLD_TAX_RATE_3 = val; }
	public void setNEW_TAX_RATE_START_DATE(String val) { m_NEW_TAX_RATE_START_DATE = val; }
	public void setNEW_TAX_RATE_1(String val) { m_NEW_TAX_RATE_1 = val; }
	public void setNEW_TAX_RATE_2(String val) { m_NEW_TAX_RATE_2 = val; }
	public void setNEW_TAX_RATE_3(String val) { m_NEW_TAX_RATE_3 = val; }
	public void setROUND_TYP(Integer val) { m_ROUND_TYP = val; }
	public void setOLD_GL_TAX_CD(String val) { m_OLD_GL_TAX_CD = val; }
	public void setNEW_GL_TAX_CD(String val) { m_NEW_GL_TAX_CD = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setw_COUNT(Integer val) { m_w_COUNT = val; }

	public void setROUND_TYP_val(String val) { m_ROUND_TYP_val = getInteger(val); }
	public void setROUND_TYP(String val) { m_ROUND_TYP = getInteger(val); }
	public void setw_COUNT(String val) { m_w_COUNT = getInteger(val); }

	public void setList_ROUND_TYP_name(List list) { l_ROUND_TYP_name = list; }
	public void setList_ROUND_TYP_val(List list) { l_ROUND_TYP_val = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_NAME(List list) { l_TAX_NAME = list; }
	public void setList_TAX_ANAME(List list) { l_TAX_ANAME = list; }
	public void setList_OLD_TAX_RATE_1(List list) { l_OLD_TAX_RATE_1 = list; }
	public void setList_OLD_TAX_RATE_2(List list) { l_OLD_TAX_RATE_2 = list; }
	public void setList_OLD_TAX_RATE_3(List list) { l_OLD_TAX_RATE_3 = list; }
	public void setList_NEW_TAX_RATE_START_DATE(List list) { l_NEW_TAX_RATE_START_DATE = list; }
	public void setList_NEW_TAX_RATE_1(List list) { l_NEW_TAX_RATE_1 = list; }
	public void setList_NEW_TAX_RATE_2(List list) { l_NEW_TAX_RATE_2 = list; }
	public void setList_NEW_TAX_RATE_3(List list) { l_NEW_TAX_RATE_3 = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_OLD_GL_TAX_CD(List list) { l_OLD_GL_TAX_CD = list; }
	public void setList_NEW_GL_TAX_CD(List list) { l_NEW_GL_TAX_CD = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_w_COUNT(List list) { l_w_COUNT = list; }

	public int setL2L_ROUND_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP_name == null) {
			l_ROUND_TYP_name = new ArrayList();
		} else {
			l_ROUND_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP_name.add(((AA0100030Struct) list.get(i)).getROUND_TYP_name());
		}
		return size;
	}
	public int setL2L_ROUND_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP_val == null) {
			l_ROUND_TYP_val = new ArrayList();
		} else {
			l_ROUND_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP_val.add(((AA0100030Struct) list.get(i)).getROUND_TYP_val());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AA0100030Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME == null) {
			l_TAX_NAME = new ArrayList();
		} else {
			l_TAX_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME.add(((AA0100030Struct) list.get(i)).getTAX_NAME());
		}
		return size;
	}
	public int setL2L_TAX_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_ANAME == null) {
			l_TAX_ANAME = new ArrayList();
		} else {
			l_TAX_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_ANAME.add(((AA0100030Struct) list.get(i)).getTAX_ANAME());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_1 == null) {
			l_OLD_TAX_RATE_1 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_1.add(((AA0100030Struct) list.get(i)).getOLD_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_2 == null) {
			l_OLD_TAX_RATE_2 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_2.add(((AA0100030Struct) list.get(i)).getOLD_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_3 == null) {
			l_OLD_TAX_RATE_3 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_3.add(((AA0100030Struct) list.get(i)).getOLD_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_START_DATE == null) {
			l_NEW_TAX_RATE_START_DATE = new ArrayList();
		} else {
			l_NEW_TAX_RATE_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_START_DATE.add(((AA0100030Struct) list.get(i)).getNEW_TAX_RATE_START_DATE());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_1 == null) {
			l_NEW_TAX_RATE_1 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_1.add(((AA0100030Struct) list.get(i)).getNEW_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_2 == null) {
			l_NEW_TAX_RATE_2 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_2.add(((AA0100030Struct) list.get(i)).getNEW_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_3 == null) {
			l_NEW_TAX_RATE_3 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_3.add(((AA0100030Struct) list.get(i)).getNEW_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP == null) {
			l_ROUND_TYP = new ArrayList();
		} else {
			l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP.add(((AA0100030Struct) list.get(i)).getROUND_TYP());
		}
		return size;
	}
	public int setL2L_OLD_GL_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_GL_TAX_CD == null) {
			l_OLD_GL_TAX_CD = new ArrayList();
		} else {
			l_OLD_GL_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_GL_TAX_CD.add(((AA0100030Struct) list.get(i)).getOLD_GL_TAX_CD());
		}
		return size;
	}
	public int setL2L_NEW_GL_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_GL_TAX_CD == null) {
			l_NEW_GL_TAX_CD = new ArrayList();
		} else {
			l_NEW_GL_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_GL_TAX_CD.add(((AA0100030Struct) list.get(i)).getNEW_GL_TAX_CD());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AA0100030Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COUNT == null) {
			l_w_COUNT = new ArrayList();
		} else {
			l_w_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COUNT.add(((AA0100030Struct) list.get(i)).getw_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ROUND_TYP_name = null;
		m_ROUND_TYP_val = null;
		m_TAX_CD = null;
		m_TAX_NAME = null;
		m_TAX_ANAME = null;
		m_OLD_TAX_RATE_1 = null;
		m_OLD_TAX_RATE_2 = null;
		m_OLD_TAX_RATE_3 = null;
		m_NEW_TAX_RATE_START_DATE = null;
		m_NEW_TAX_RATE_1 = null;
		m_NEW_TAX_RATE_2 = null;
		m_NEW_TAX_RATE_3 = null;
		m_ROUND_TYP = null;
		m_OLD_GL_TAX_CD = null;
		m_NEW_GL_TAX_CD = null;
		m_w_MODIFY_COUNT = null;
		m_w_COUNT = null;

		l_ROUND_TYP_name = null;
		l_ROUND_TYP_val = null;
		l_TAX_CD = null;
		l_TAX_NAME = null;
		l_TAX_ANAME = null;
		l_OLD_TAX_RATE_1 = null;
		l_OLD_TAX_RATE_2 = null;
		l_OLD_TAX_RATE_3 = null;
		l_NEW_TAX_RATE_START_DATE = null;
		l_NEW_TAX_RATE_1 = null;
		l_NEW_TAX_RATE_2 = null;
		l_NEW_TAX_RATE_3 = null;
		l_ROUND_TYP = null;
		l_OLD_GL_TAX_CD = null;
		l_NEW_GL_TAX_CD = null;
		l_w_MODIFY_COUNT = null;
		l_w_COUNT = null;

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
	 * medAA0100030�N���X�̕W���R���X�g���N�^
	 */
	public AA0100030Struct()
	{
		//{{user_implement_code_constractor
                //------------------------------------------------------------------------------
                initialize();
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
	public void setStruct(AA0100030Struct struct)
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
	public void setStructM(AA0100030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setROUND_TYP_name(struct.getROUND_TYP_name());
			this.setROUND_TYP_val(struct.getROUND_TYP_val());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_NAME(struct.getTAX_NAME());
			this.setTAX_ANAME(struct.getTAX_ANAME());
			this.setOLD_TAX_RATE_1(struct.getOLD_TAX_RATE_1());
			this.setOLD_TAX_RATE_2(struct.getOLD_TAX_RATE_2());
			this.setOLD_TAX_RATE_3(struct.getOLD_TAX_RATE_3());
			this.setNEW_TAX_RATE_START_DATE(struct.getNEW_TAX_RATE_START_DATE());
			this.setNEW_TAX_RATE_1(struct.getNEW_TAX_RATE_1());
			this.setNEW_TAX_RATE_2(struct.getNEW_TAX_RATE_2());
			this.setNEW_TAX_RATE_3(struct.getNEW_TAX_RATE_3());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setOLD_GL_TAX_CD(struct.getOLD_GL_TAX_CD());
			this.setNEW_GL_TAX_CD(struct.getNEW_GL_TAX_CD());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setw_COUNT(struct.getw_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0100030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ROUND_TYP_name(struct.getList_ROUND_TYP_name());
			this.setList_ROUND_TYP_val(struct.getList_ROUND_TYP_val());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_NAME(struct.getList_TAX_NAME());
			this.setList_TAX_ANAME(struct.getList_TAX_ANAME());
			this.setList_OLD_TAX_RATE_1(struct.getList_OLD_TAX_RATE_1());
			this.setList_OLD_TAX_RATE_2(struct.getList_OLD_TAX_RATE_2());
			this.setList_OLD_TAX_RATE_3(struct.getList_OLD_TAX_RATE_3());
			this.setList_NEW_TAX_RATE_START_DATE(struct.getList_NEW_TAX_RATE_START_DATE());
			this.setList_NEW_TAX_RATE_1(struct.getList_NEW_TAX_RATE_1());
			this.setList_NEW_TAX_RATE_2(struct.getList_NEW_TAX_RATE_2());
			this.setList_NEW_TAX_RATE_3(struct.getList_NEW_TAX_RATE_3());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_OLD_GL_TAX_CD(struct.getList_OLD_GL_TAX_CD());
			this.setList_NEW_GL_TAX_CD(struct.getList_NEW_GL_TAX_CD());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_w_COUNT(struct.getList_w_COUNT());
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
	// �� 1 �ϐ������l�F i_ROUND_TYP_name


	final static String i_ROUND_TYP_name = null;

	// �� 2 �ϐ������l�F i_ROUND_TYP_val


	final static Integer i_ROUND_TYP_val = null;

	// �� 3 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 4 �ϐ������l�F i_TAX_NAME


	final static String i_TAX_NAME = null;

	// �� 5 �ϐ������l�F i_TAX_ANAME


	final static String i_TAX_ANAME = null;

	// �� 6 �ϐ������l�F i_OLD_TAX_RATE_1


	final static String i_OLD_TAX_RATE_1 = null;

	// �� 7 �ϐ������l�F i_OLD_TAX_RATE_2


	final static String i_OLD_TAX_RATE_2 = null;

	// �� 8 �ϐ������l�F i_OLD_TAX_RATE_3


	final static String i_OLD_TAX_RATE_3 = null;

	// �� 9 �ϐ������l�F i_NEW_TAX_RATE_START_DATE


	final static String i_NEW_TAX_RATE_START_DATE = null;

	// �� 10 �ϐ������l�F i_NEW_TAX_RATE_1


	final static String i_NEW_TAX_RATE_1 = null;

	// �� 11 �ϐ������l�F i_NEW_TAX_RATE_2


	final static String i_NEW_TAX_RATE_2 = null;

	// �� 12 �ϐ������l�F i_NEW_TAX_RATE_3


	final static String i_NEW_TAX_RATE_3 = null;

	// �� 13 �ϐ������l�F i_ROUND_TYP


	final static Integer i_ROUND_TYP = null;

	// �� 14 �ϐ������l�F i_OLD_GL_TAX_CD


	final static String i_OLD_GL_TAX_CD = null;

	// �� 15 �ϐ������l�F i_NEW_GL_TAX_CD


	final static String i_NEW_GL_TAX_CD = null;

	// �� 16 �ϐ������l�F i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// �� 17 �ϐ������l�F i_w_COUNT


	final static Integer i_w_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        /**
         * �����ݒ�
         */
        public void initialize()
        {
         clear();
         m_OLD_TAX_RATE_1 = new String("0");
         m_OLD_TAX_RATE_2 = new String("0");
         m_OLD_TAX_RATE_3 = new String("0");
         m_NEW_TAX_RATE_1 = new String("0");
         m_NEW_TAX_RATE_2 = new String("0");
         m_NEW_TAX_RATE_3 = new String("0");
         m_ROUND_TYP = new Integer(0);
        }
       
        /**
         * ���e�R�s�[
         */
        public void copy(AA0100030Struct struct)
        {
         if(struct.m_TAX_CD != null)					{m_TAX_CD					=	new String(struct.m_TAX_CD);					}
         else										{m_TAX_CD					=	null;											}
       
         if(struct.m_TAX_NAME != null)				{m_TAX_NAME					=	new String(struct.m_TAX_NAME);					}
         else										{m_TAX_NAME					=	null;											}
       
         if(struct.m_TAX_ANAME != null)				{m_TAX_ANAME				=	new String(struct.m_TAX_ANAME);					}
         else										{m_TAX_ANAME				=	null;											}
       
         if(struct.m_OLD_TAX_RATE_1 != null)			{m_OLD_TAX_RATE_1			=	new String(struct.m_OLD_TAX_RATE_1);			}
         else										{m_OLD_TAX_RATE_1			=	null;											}
       
         if(struct.m_OLD_TAX_RATE_2 != null)			{m_OLD_TAX_RATE_2			=	new String(struct.m_OLD_TAX_RATE_2);			}
         else										{m_OLD_TAX_RATE_2			=	null;											}
       
         if(struct.m_OLD_TAX_RATE_3 != null)			{m_OLD_TAX_RATE_3			=	new String(struct.m_OLD_TAX_RATE_3);			}
         else										{m_OLD_TAX_RATE_3			=	null;											}
       
         if(struct.m_NEW_TAX_RATE_START_DATE != null){m_NEW_TAX_RATE_START_DATE	=	new String(struct.m_NEW_TAX_RATE_START_DATE);	}
         else										{m_NEW_TAX_RATE_START_DATE	=	null;											}
       
         if(struct.m_NEW_TAX_RATE_1 != null)			{m_NEW_TAX_RATE_1			=	new String(struct.m_NEW_TAX_RATE_1);			}
         else										{m_NEW_TAX_RATE_1			=	null;											}
       
         if(struct.m_NEW_TAX_RATE_2 != null)			{m_NEW_TAX_RATE_2			=	new String(struct.m_NEW_TAX_RATE_2);			}
         else										{m_NEW_TAX_RATE_2			=	null;											}
       
         if(struct.m_NEW_TAX_RATE_3 != null)			{m_NEW_TAX_RATE_3			=	new String(struct.m_NEW_TAX_RATE_3);			}
         else										{m_NEW_TAX_RATE_3			=	null;											}
       
         if(struct.m_ROUND_TYP != null)				{m_ROUND_TYP				=	new Integer(struct.m_ROUND_TYP.intValue());		}
         else 										{m_ROUND_TYP				=	null;											}
         // Del Start 20131216 liu-j
         //if(struct.m_GL_TAX_CD != null)				{m_GL_TAX_CD				=	new String(struct.m_GL_TAX_CD);					}
         //else										{m_GL_TAX_CD				=	null;											}
         // Del End 20131216 liu-j
         // Add Start 20131216 liu-j
         if(struct.m_OLD_GL_TAX_CD != null)				{m_OLD_GL_TAX_CD		=	new String(struct.m_OLD_GL_TAX_CD);		}
         else 											{m_OLD_GL_TAX_CD		=	null;											}
         
         if(struct.m_NEW_GL_TAX_CD != null)				{m_NEW_GL_TAX_CD		=	new String(struct.m_NEW_GL_TAX_CD);		}
         else 											{m_NEW_GL_TAX_CD		=	null;											}
         // Add End 20131216 liu-j
         
         if(struct.m_w_MODIFY_COUNT != null)			{m_w_MODIFY_COUNT			=	new String(struct.m_w_MODIFY_COUNT);			}
         else 										{m_w_MODIFY_COUNT			=	null;											}
       
         if(struct.m_ROUND_TYP_name != null)			{m_ROUND_TYP_name			=	new String(struct.m_ROUND_TYP_name);			}
         else										{m_ROUND_TYP_name			=	null;											}
       
         if(struct.m_ROUND_TYP_val != null)			{m_ROUND_TYP_val			=	new Integer(struct.m_ROUND_TYP_val.intValue());	}
         else 										{m_ROUND_TYP_val			=	null;											}
       
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
