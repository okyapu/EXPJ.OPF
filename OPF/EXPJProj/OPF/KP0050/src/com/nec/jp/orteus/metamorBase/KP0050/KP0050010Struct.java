/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/src/com/nec/jp/orteus/metamorBase/KP0050/KP0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0050;

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
 * CLASS     : KP0050010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:53:57 $
 *
 */
//}}user_implement_code_header

public class KP0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoPlanTyp1 */
	public String m_rdoPlanTyp1 = null;
	/** �� 2 �ϐ��F m_rdoPlanTyp2 */
	public String m_rdoPlanTyp2 = null;
	/** �� 3 �ϐ��F m_rdoPlanTyp3 */
	public String m_rdoPlanTyp3 = null;
	/** �� 4 �ϐ��F m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** �� 5 �ϐ��F m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** �� 6 �ϐ��F m_rdoPlanTyp */
	public String m_rdoPlanTyp = null;
	/** �� 7 �ϐ��F m_rdoPlantTyp */
	public String m_rdoPlantTyp = null;
	/** �� 8 �ϐ��F m_SYS_PARAM_NAME */
	public String m_SYS_PARAM_NAME = null;
	/** �� 9 �ϐ��F m_SYS_PARAM_VALUE */
	public String m_SYS_PARAM_VALUE = null;
	/** �� 10 �ϐ��F m_plantCd */
	public String m_plantCd = null;
	/** �� 11 �ϐ��F m_txtPlantCd */
	public String m_txtPlantCd = null;
	/** �� 12 �ϐ��F m_strUSER_NAME */
	public String m_strUSER_NAME = null;
	/** �� 13 �ϐ��F m_strPLANT_CD */
	public String m_strPLANT_CD = null;
	/** �� 14 �ϐ��F m_strSECTION_CD */
	public String m_strSECTION_CD = null;
	/** �� 15 �ϐ��F m_strORG_CD */
	public String m_strORG_CD = null;
	/** �� 16 �ϐ��F m_strORG_NAME */
	public String m_strORG_NAME = null;
	/** �� 17 �ϐ��F m_strORG_ANAME */
	public String m_strORG_ANAME = null;
	/** �� 18 �ϐ��F m_strPLANT_NAME */
	public String m_strPLANT_NAME = null;
	/** �� 19 �ϐ��F m_strPLANT_ANAME */
	public String m_strPLANT_ANAME = null;
	/** �� 20 �ϐ��F m_strCAL_NO */
	public Double m_strCAL_NO = null;
	/** �� 21 �ϐ��F m_strUSER_CD */
	public String m_strUSER_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoPlanTyp1 */
	public List l_rdoPlanTyp1 = null;

	/** �� 2 List�ϐ��F l_rdoPlanTyp2 */
	public List l_rdoPlanTyp2 = null;

	/** �� 3 List�ϐ��F l_rdoPlanTyp3 */
	public List l_rdoPlanTyp3 = null;

	/** �� 4 List�ϐ��F l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** �� 5 List�ϐ��F l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** �� 6 List�ϐ��F l_rdoPlanTyp */
	public List l_rdoPlanTyp = null;

	/** �� 7 List�ϐ��F l_rdoPlantTyp */
	public List l_rdoPlantTyp = null;

	/** �� 8 List�ϐ��F l_SYS_PARAM_NAME */
	public List l_SYS_PARAM_NAME = null;

	/** �� 9 List�ϐ��F l_SYS_PARAM_VALUE */
	public List l_SYS_PARAM_VALUE = null;

	/** �� 10 List�ϐ��F l_plantCd */
	public List l_plantCd = null;

	/** �� 11 List�ϐ��F l_txtPlantCd */
	public List l_txtPlantCd = null;

	/** �� 12 List�ϐ��F l_strUSER_NAME */
	public List l_strUSER_NAME = null;

	/** �� 13 List�ϐ��F l_strPLANT_CD */
	public List l_strPLANT_CD = null;

	/** �� 14 List�ϐ��F l_strSECTION_CD */
	public List l_strSECTION_CD = null;

	/** �� 15 List�ϐ��F l_strORG_CD */
	public List l_strORG_CD = null;

	/** �� 16 List�ϐ��F l_strORG_NAME */
	public List l_strORG_NAME = null;

	/** �� 17 List�ϐ��F l_strORG_ANAME */
	public List l_strORG_ANAME = null;

	/** �� 18 List�ϐ��F l_strPLANT_NAME */
	public List l_strPLANT_NAME = null;

	/** �� 19 List�ϐ��F l_strPLANT_ANAME */
	public List l_strPLANT_ANAME = null;

	/** �� 20 List�ϐ��F l_strCAL_NO */
	public List l_strCAL_NO = null;

	/** �� 21 List�ϐ��F l_strUSER_CD */
	public List l_strUSER_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoPlanTyp1() { return m_rdoPlanTyp1; }
	public String getrdoPlanTyp2() { return m_rdoPlanTyp2; }
	public String getrdoPlanTyp3() { return m_rdoPlanTyp3; }
	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getrdoPlanTyp() { return m_rdoPlanTyp; }
	public String getrdoPlantTyp() { return m_rdoPlantTyp; }
	public String getSYS_PARAM_NAME() { return m_SYS_PARAM_NAME; }
	public String getSYS_PARAM_VALUE() { return m_SYS_PARAM_VALUE; }
	public String getplantCd() { return m_plantCd; }
	public String gettxtPlantCd() { return m_txtPlantCd; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrORG_CD() { return m_strORG_CD; }
	public String getstrORG_NAME() { return m_strORG_NAME; }
	public String getstrORG_ANAME() { return m_strORG_ANAME; }
	public String getstrPLANT_NAME() { return m_strPLANT_NAME; }
	public String getstrPLANT_ANAME() { return m_strPLANT_ANAME; }
	public Double getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrUSER_CD() { return m_strUSER_CD; }

	public List getList_rdoPlanTyp1() { return l_rdoPlanTyp1; }
	public List getList_rdoPlanTyp2() { return l_rdoPlanTyp2; }
	public List getList_rdoPlanTyp3() { return l_rdoPlanTyp3; }
	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_rdoPlanTyp() { return l_rdoPlanTyp; }
	public List getList_rdoPlantTyp() { return l_rdoPlantTyp; }
	public List getList_SYS_PARAM_NAME() { return l_SYS_PARAM_NAME; }
	public List getList_SYS_PARAM_VALUE() { return l_SYS_PARAM_VALUE; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_txtPlantCd() { return l_txtPlantCd; }
	public List getList_strUSER_NAME() { return l_strUSER_NAME; }
	public List getList_strPLANT_CD() { return l_strPLANT_CD; }
	public List getList_strSECTION_CD() { return l_strSECTION_CD; }
	public List getList_strORG_CD() { return l_strORG_CD; }
	public List getList_strORG_NAME() { return l_strORG_NAME; }
	public List getList_strORG_ANAME() { return l_strORG_ANAME; }
	public List getList_strPLANT_NAME() { return l_strPLANT_NAME; }
	public List getList_strPLANT_ANAME() { return l_strPLANT_ANAME; }
	public List getList_strCAL_NO() { return l_strCAL_NO; }
	public List getList_strUSER_CD() { return l_strUSER_CD; }

	public void setrdoPlanTyp1(String val) { m_rdoPlanTyp1 = val; }
	public void setrdoPlanTyp2(String val) { m_rdoPlanTyp2 = val; }
	public void setrdoPlanTyp3(String val) { m_rdoPlanTyp3 = val; }
	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setrdoPlanTyp(String val) { m_rdoPlanTyp = val; }
	public void setrdoPlantTyp(String val) { m_rdoPlantTyp = val; }
	public void setSYS_PARAM_NAME(String val) { m_SYS_PARAM_NAME = val; }
	public void setSYS_PARAM_VALUE(String val) { m_SYS_PARAM_VALUE = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void settxtPlantCd(String val) { m_txtPlantCd = val; }
	public void setstrUSER_NAME(String val) { m_strUSER_NAME = val; }
	public void setstrPLANT_CD(String val) { m_strPLANT_CD = val; }
	public void setstrSECTION_CD(String val) { m_strSECTION_CD = val; }
	public void setstrORG_CD(String val) { m_strORG_CD = val; }
	public void setstrORG_NAME(String val) { m_strORG_NAME = val; }
	public void setstrORG_ANAME(String val) { m_strORG_ANAME = val; }
	public void setstrPLANT_NAME(String val) { m_strPLANT_NAME = val; }
	public void setstrPLANT_ANAME(String val) { m_strPLANT_ANAME = val; }
	public void setstrCAL_NO(Double val) { m_strCAL_NO = val; }
	public void setstrUSER_CD(String val) { m_strUSER_CD = val; }


	public void setList_rdoPlanTyp1(List list) { l_rdoPlanTyp1 = list; }
	public void setList_rdoPlanTyp2(List list) { l_rdoPlanTyp2 = list; }
	public void setList_rdoPlanTyp3(List list) { l_rdoPlanTyp3 = list; }
	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_rdoPlanTyp(List list) { l_rdoPlanTyp = list; }
	public void setList_rdoPlantTyp(List list) { l_rdoPlantTyp = list; }
	public void setList_SYS_PARAM_NAME(List list) { l_SYS_PARAM_NAME = list; }
	public void setList_SYS_PARAM_VALUE(List list) { l_SYS_PARAM_VALUE = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_txtPlantCd(List list) { l_txtPlantCd = list; }
	public void setList_strUSER_NAME(List list) { l_strUSER_NAME = list; }
	public void setList_strPLANT_CD(List list) { l_strPLANT_CD = list; }
	public void setList_strSECTION_CD(List list) { l_strSECTION_CD = list; }
	public void setList_strORG_CD(List list) { l_strORG_CD = list; }
	public void setList_strORG_NAME(List list) { l_strORG_NAME = list; }
	public void setList_strORG_ANAME(List list) { l_strORG_ANAME = list; }
	public void setList_strPLANT_NAME(List list) { l_strPLANT_NAME = list; }
	public void setList_strPLANT_ANAME(List list) { l_strPLANT_ANAME = list; }
	public void setList_strCAL_NO(List list) { l_strCAL_NO = list; }
	public void setList_strUSER_CD(List list) { l_strUSER_CD = list; }

	public int setL2L_rdoPlanTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlanTyp1 == null) {
			l_rdoPlanTyp1 = new ArrayList();
		} else {
			l_rdoPlanTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlanTyp1.add(((KP0050010Struct) list.get(i)).getrdoPlanTyp1());
		}
		return size;
	}
	public int setL2L_rdoPlanTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlanTyp2 == null) {
			l_rdoPlanTyp2 = new ArrayList();
		} else {
			l_rdoPlanTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlanTyp2.add(((KP0050010Struct) list.get(i)).getrdoPlanTyp2());
		}
		return size;
	}
	public int setL2L_rdoPlanTyp3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlanTyp3 == null) {
			l_rdoPlanTyp3 = new ArrayList();
		} else {
			l_rdoPlanTyp3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlanTyp3.add(((KP0050010Struct) list.get(i)).getrdoPlanTyp3());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp1 == null) {
			l_rdoPlantTyp1 = new ArrayList();
		} else {
			l_rdoPlantTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp1.add(((KP0050010Struct) list.get(i)).getrdoPlantTyp1());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp2 == null) {
			l_rdoPlantTyp2 = new ArrayList();
		} else {
			l_rdoPlantTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp2.add(((KP0050010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_rdoPlanTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlanTyp == null) {
			l_rdoPlanTyp = new ArrayList();
		} else {
			l_rdoPlanTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlanTyp.add(((KP0050010Struct) list.get(i)).getrdoPlanTyp());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp == null) {
			l_rdoPlantTyp = new ArrayList();
		} else {
			l_rdoPlantTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp.add(((KP0050010Struct) list.get(i)).getrdoPlantTyp());
		}
		return size;
	}
	public int setL2L_SYS_PARAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAM_NAME == null) {
			l_SYS_PARAM_NAME = new ArrayList();
		} else {
			l_SYS_PARAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAM_NAME.add(((KP0050010Struct) list.get(i)).getSYS_PARAM_NAME());
		}
		return size;
	}
	public int setL2L_SYS_PARAM_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PARAM_VALUE == null) {
			l_SYS_PARAM_VALUE = new ArrayList();
		} else {
			l_SYS_PARAM_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PARAM_VALUE.add(((KP0050010Struct) list.get(i)).getSYS_PARAM_VALUE());
		}
		return size;
	}
	public int setL2L_plantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_plantCd == null) {
			l_plantCd = new ArrayList();
		} else {
			l_plantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_plantCd.add(((KP0050010Struct) list.get(i)).getplantCd());
		}
		return size;
	}
	public int setL2L_txtPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtPlantCd == null) {
			l_txtPlantCd = new ArrayList();
		} else {
			l_txtPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtPlantCd.add(((KP0050010Struct) list.get(i)).gettxtPlantCd());
		}
		return size;
	}
	public int setL2L_strUSER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_NAME == null) {
			l_strUSER_NAME = new ArrayList();
		} else {
			l_strUSER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_NAME.add(((KP0050010Struct) list.get(i)).getstrUSER_NAME());
		}
		return size;
	}
	public int setL2L_strPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_CD == null) {
			l_strPLANT_CD = new ArrayList();
		} else {
			l_strPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_CD.add(((KP0050010Struct) list.get(i)).getstrPLANT_CD());
		}
		return size;
	}
	public int setL2L_strSECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSECTION_CD == null) {
			l_strSECTION_CD = new ArrayList();
		} else {
			l_strSECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSECTION_CD.add(((KP0050010Struct) list.get(i)).getstrSECTION_CD());
		}
		return size;
	}
	public int setL2L_strORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_CD == null) {
			l_strORG_CD = new ArrayList();
		} else {
			l_strORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_CD.add(((KP0050010Struct) list.get(i)).getstrORG_CD());
		}
		return size;
	}
	public int setL2L_strORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_NAME == null) {
			l_strORG_NAME = new ArrayList();
		} else {
			l_strORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_NAME.add(((KP0050010Struct) list.get(i)).getstrORG_NAME());
		}
		return size;
	}
	public int setL2L_strORG_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_ANAME == null) {
			l_strORG_ANAME = new ArrayList();
		} else {
			l_strORG_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_ANAME.add(((KP0050010Struct) list.get(i)).getstrORG_ANAME());
		}
		return size;
	}
	public int setL2L_strPLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_NAME == null) {
			l_strPLANT_NAME = new ArrayList();
		} else {
			l_strPLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_NAME.add(((KP0050010Struct) list.get(i)).getstrPLANT_NAME());
		}
		return size;
	}
	public int setL2L_strPLANT_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_ANAME == null) {
			l_strPLANT_ANAME = new ArrayList();
		} else {
			l_strPLANT_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_ANAME.add(((KP0050010Struct) list.get(i)).getstrPLANT_ANAME());
		}
		return size;
	}
	public int setL2L_strCAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCAL_NO == null) {
			l_strCAL_NO = new ArrayList();
		} else {
			l_strCAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCAL_NO.add(((KP0050010Struct) list.get(i)).getstrCAL_NO());
		}
		return size;
	}
	public int setL2L_strUSER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_CD == null) {
			l_strUSER_CD = new ArrayList();
		} else {
			l_strUSER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_CD.add(((KP0050010Struct) list.get(i)).getstrUSER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlanTyp1 = null;
		m_rdoPlanTyp2 = null;
		m_rdoPlanTyp3 = null;
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_rdoPlanTyp = null;
		m_rdoPlantTyp = null;
		m_SYS_PARAM_NAME = null;
		m_SYS_PARAM_VALUE = null;
		m_plantCd = null;
		m_txtPlantCd = null;
		m_strUSER_NAME = null;
		m_strPLANT_CD = null;
		m_strSECTION_CD = null;
		m_strORG_CD = null;
		m_strORG_NAME = null;
		m_strORG_ANAME = null;
		m_strPLANT_NAME = null;
		m_strPLANT_ANAME = null;
		m_strCAL_NO = null;
		m_strUSER_CD = null;

		l_rdoPlanTyp1 = null;
		l_rdoPlanTyp2 = null;
		l_rdoPlanTyp3 = null;
		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_rdoPlanTyp = null;
		l_rdoPlantTyp = null;
		l_SYS_PARAM_NAME = null;
		l_SYS_PARAM_VALUE = null;
		l_plantCd = null;
		l_txtPlantCd = null;
		l_strUSER_NAME = null;
		l_strPLANT_CD = null;
		l_strSECTION_CD = null;
		l_strORG_CD = null;
		l_strORG_NAME = null;
		l_strORG_ANAME = null;
		l_strPLANT_NAME = null;
		l_strPLANT_ANAME = null;
		l_strCAL_NO = null;
		l_strUSER_CD = null;

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
	 * medKP0050010�N���X�̕W���R���X�g���N�^
	 */
	public KP0050010Struct()
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
	public void setStruct(KP0050010Struct struct)
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
	public void setStructM(KP0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlanTyp1(struct.getrdoPlanTyp1());
			this.setrdoPlanTyp2(struct.getrdoPlanTyp2());
			this.setrdoPlanTyp3(struct.getrdoPlanTyp3());
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setrdoPlanTyp(struct.getrdoPlanTyp());
			this.setrdoPlantTyp(struct.getrdoPlantTyp());
			this.setSYS_PARAM_NAME(struct.getSYS_PARAM_NAME());
			this.setSYS_PARAM_VALUE(struct.getSYS_PARAM_VALUE());
			this.setplantCd(struct.getplantCd());
			this.settxtPlantCd(struct.gettxtPlantCd());
			this.setstrUSER_NAME(struct.getstrUSER_NAME());
			this.setstrPLANT_CD(struct.getstrPLANT_CD());
			this.setstrSECTION_CD(struct.getstrSECTION_CD());
			this.setstrORG_CD(struct.getstrORG_CD());
			this.setstrORG_NAME(struct.getstrORG_NAME());
			this.setstrORG_ANAME(struct.getstrORG_ANAME());
			this.setstrPLANT_NAME(struct.getstrPLANT_NAME());
			this.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
			this.setstrCAL_NO(struct.getstrCAL_NO());
			this.setstrUSER_CD(struct.getstrUSER_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KP0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlanTyp1(struct.getList_rdoPlanTyp1());
			this.setList_rdoPlanTyp2(struct.getList_rdoPlanTyp2());
			this.setList_rdoPlanTyp3(struct.getList_rdoPlanTyp3());
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_rdoPlanTyp(struct.getList_rdoPlanTyp());
			this.setList_rdoPlantTyp(struct.getList_rdoPlantTyp());
			this.setList_SYS_PARAM_NAME(struct.getList_SYS_PARAM_NAME());
			this.setList_SYS_PARAM_VALUE(struct.getList_SYS_PARAM_VALUE());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_txtPlantCd(struct.getList_txtPlantCd());
			this.setList_strUSER_NAME(struct.getList_strUSER_NAME());
			this.setList_strPLANT_CD(struct.getList_strPLANT_CD());
			this.setList_strSECTION_CD(struct.getList_strSECTION_CD());
			this.setList_strORG_CD(struct.getList_strORG_CD());
			this.setList_strORG_NAME(struct.getList_strORG_NAME());
			this.setList_strORG_ANAME(struct.getList_strORG_ANAME());
			this.setList_strPLANT_NAME(struct.getList_strPLANT_NAME());
			this.setList_strPLANT_ANAME(struct.getList_strPLANT_ANAME());
			this.setList_strCAL_NO(struct.getList_strCAL_NO());
			this.setList_strUSER_CD(struct.getList_strUSER_CD());
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
	// �� 1 �ϐ������l�F i_rdoPlanTyp1


	final static String i_rdoPlanTyp1 = null;

	// �� 2 �ϐ������l�F i_rdoPlanTyp2


	final static String i_rdoPlanTyp2 = null;

	// �� 3 �ϐ������l�F i_rdoPlanTyp3


	final static String i_rdoPlanTyp3 = null;

	// �� 4 �ϐ������l�F i_rdoPlantTyp1


	final static String i_rdoPlantTyp1 = null;

	// �� 5 �ϐ������l�F i_rdoPlantTyp2


	final static String i_rdoPlantTyp2 = null;

	// �� 6 �ϐ������l�F i_rdoPlanTyp


	final static String i_rdoPlanTyp = null;

	// �� 7 �ϐ������l�F i_rdoPlantTyp


	final static String i_rdoPlantTyp = null;

	// �� 8 �ϐ������l�F i_SYS_PARAM_NAME


	final static String i_SYS_PARAM_NAME = null;

	// �� 9 �ϐ������l�F i_SYS_PARAM_VALUE


	final static String i_SYS_PARAM_VALUE = null;

	// �� 10 �ϐ������l�F i_plantCd


	final static String i_plantCd = null;

	// �� 11 �ϐ������l�F i_txtPlantCd


	final static String i_txtPlantCd = null;

	// �� 12 �ϐ������l�F i_strUSER_NAME


	final static String i_strUSER_NAME = null;

	// �� 13 �ϐ������l�F i_strPLANT_CD


	final static String i_strPLANT_CD = null;

	// �� 14 �ϐ������l�F i_strSECTION_CD


	final static String i_strSECTION_CD = null;

	// �� 15 �ϐ������l�F i_strORG_CD


	final static String i_strORG_CD = null;

	// �� 16 �ϐ������l�F i_strORG_NAME


	final static String i_strORG_NAME = null;

	// �� 17 �ϐ������l�F i_strORG_ANAME


	final static String i_strORG_ANAME = null;

	// �� 18 �ϐ������l�F i_strPLANT_NAME


	final static String i_strPLANT_NAME = null;

	// �� 19 �ϐ������l�F i_strPLANT_ANAME


	final static String i_strPLANT_ANAME = null;

	// �� 20 �ϐ������l�F i_strCAL_NO


	final static Double i_strCAL_NO = null;

	// �� 21 �ϐ������l�F i_strUSER_CD


	final static String i_strUSER_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_rdoPlanTyp1

	final static String i_rdoPlanTyp1 = null;

	// �� 2 �ϐ������l�F i_rdoPlanTyp2

	final static String i_rdoPlanTyp2 = null;

	// �� 3 �ϐ������l�F i_rdoPlanTyp3

	final static String i_rdoPlanTyp3 = null;

	// �� 4 �ϐ������l�F i_rdoPlantTyp1

	final static String i_rdoPlantTyp1 = null;

	// �� 5 �ϐ������l�F i_rdoPlantTyp2

	final static String i_rdoPlantTyp2 = null;

	// �� 6 �ϐ������l�F i_rdoPlanTyp

	final static String i_rdoPlanTyp = null;

	// �� 7 �ϐ������l�F i_rdoPlantTyp

	final static String i_rdoPlantTyp = null;

	// �� 8 �ϐ������l�F i_plantCd

	final static String i_plantCd = null;

	// �� 9 �ϐ������l�F i_txtPlantCd

	final static String i_txtPlantCd = null;

	// �� 10 �ϐ������l�F i_strUSER_NAME

	final static String i_strUSER_NAME = null;

	// �� 11 �ϐ������l�F i_strPLANT_CD

	final static String i_strPLANT_CD = null;

	// �� 12 �ϐ������l�F i_strSECTION_CD

	final static String i_strSECTION_CD = null;

	// �� 13 �ϐ������l�F i_strORG_CD

	final static String i_strORG_CD = null;

	// �� 14 �ϐ������l�F i_strORG_NAME

	final static String i_strORG_NAME = null;

	// �� 15 �ϐ������l�F i_strORG_ANAME

	final static String i_strORG_ANAME = null;

	// �� 16 �ϐ������l�F i_strPLANT_NAME

	final static String i_strPLANT_NAME = null;

	// �� 17 �ϐ������l�F i_strPLANT_ANAME

	final static String i_strPLANT_ANAME = null;

	// �� 18 �ϐ������l�F i_strCAL_NO

	final static Double i_strCAL_NO = null;

	// �� 19 �ϐ������l�F i_strUSER_CD

	final static String i_strUSER_CD = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_rdoPlanTyp1 = i_rdoPlanTyp1;
		m_rdoPlanTyp2 = i_rdoPlanTyp2;
		m_rdoPlanTyp3 = i_rdoPlanTyp3;
		m_rdoPlantTyp1 = i_rdoPlantTyp1;
		m_rdoPlantTyp2 = i_rdoPlantTyp2;
		m_rdoPlanTyp = i_rdoPlanTyp;
		m_rdoPlantTyp = i_rdoPlantTyp;
		m_plantCd = i_plantCd;
		m_txtPlantCd = i_txtPlantCd;
		m_strUSER_NAME = i_strUSER_NAME;
		m_strPLANT_CD = i_strPLANT_CD;
		m_strSECTION_CD = i_strSECTION_CD;
		m_strORG_CD = i_strORG_CD;
		m_strORG_NAME = i_strORG_NAME;
		m_strORG_ANAME = i_strORG_ANAME;
		m_strPLANT_NAME = i_strPLANT_NAME;
		m_strPLANT_ANAME = i_strPLANT_ANAME;
		m_strCAL_NO = i_strCAL_NO;
		m_strUSER_CD = i_strUSER_CD;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
