/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0050/src/com/nec/jp/orteus/metamorBase/AN0050/AN0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0050;

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

public class AN0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_MAX_DISPLAY_ROWNUM */
	public String m_h_MAX_DISPLAY_ROWNUM = null;
	/** �� 2 �ϐ��F m_l_SERVLET_CD */
	public String m_l_SERVLET_CD = null;
	/** �� 3 �ϐ��F m_l_DISPLAY_CD */
	public String m_l_DISPLAY_CD = null;
	/** �� 4 �ϐ��F m_MAX_DISPLAY_ROWNUM */
	public String m_MAX_DISPLAY_ROWNUM = null;
	/** �� 5 �ϐ��F m_SCREEN_COMMENT */
	public String m_SCREEN_COMMENT = null;
	/** �� 6 �ϐ��F m_SCREEN_COMMENT_EN */
	public String m_SCREEN_COMMENT_EN = null;
	/** �� 7 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 8 �ϐ��F m_SERVLET_CD */
	public String m_SERVLET_CD = null;
	/** �� 9 �ϐ��F m_DISPLAY_CD */
	public String m_DISPLAY_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_MAX_DISPLAY_ROWNUM */
	public List l_h_MAX_DISPLAY_ROWNUM = null;

	/** �� 2 List�ϐ��F l_l_SERVLET_CD */
	public List l_l_SERVLET_CD = null;

	/** �� 3 List�ϐ��F l_l_DISPLAY_CD */
	public List l_l_DISPLAY_CD = null;

	/** �� 4 List�ϐ��F l_MAX_DISPLAY_ROWNUM */
	public List l_MAX_DISPLAY_ROWNUM = null;

	/** �� 5 List�ϐ��F l_SCREEN_COMMENT */
	public List l_SCREEN_COMMENT = null;

	/** �� 6 List�ϐ��F l_SCREEN_COMMENT_EN */
	public List l_SCREEN_COMMENT_EN = null;

	/** �� 7 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 8 List�ϐ��F l_SERVLET_CD */
	public List l_SERVLET_CD = null;

	/** �� 9 List�ϐ��F l_DISPLAY_CD */
	public List l_DISPLAY_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_MAX_DISPLAY_ROWNUM() { return m_h_MAX_DISPLAY_ROWNUM; }
	public String getl_SERVLET_CD() { return m_l_SERVLET_CD; }
	public String getl_DISPLAY_CD() { return m_l_DISPLAY_CD; }
	public String getMAX_DISPLAY_ROWNUM() { return m_MAX_DISPLAY_ROWNUM; }
	public String getSCREEN_COMMENT() { return m_SCREEN_COMMENT; }
	public String getSCREEN_COMMENT_EN() { return m_SCREEN_COMMENT_EN; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getSERVLET_CD() { return m_SERVLET_CD; }
	public String getDISPLAY_CD() { return m_DISPLAY_CD; }

	public List getList_h_MAX_DISPLAY_ROWNUM() { return l_h_MAX_DISPLAY_ROWNUM; }
	public List getList_l_SERVLET_CD() { return l_l_SERVLET_CD; }
	public List getList_l_DISPLAY_CD() { return l_l_DISPLAY_CD; }
	public List getList_MAX_DISPLAY_ROWNUM() { return l_MAX_DISPLAY_ROWNUM; }
	public List getList_SCREEN_COMMENT() { return l_SCREEN_COMMENT; }
	public List getList_SCREEN_COMMENT_EN() { return l_SCREEN_COMMENT_EN; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_SERVLET_CD() { return l_SERVLET_CD; }
	public List getList_DISPLAY_CD() { return l_DISPLAY_CD; }

	public void seth_MAX_DISPLAY_ROWNUM(String val) { m_h_MAX_DISPLAY_ROWNUM = val; }
	public void setl_SERVLET_CD(String val) { m_l_SERVLET_CD = val; }
	public void setl_DISPLAY_CD(String val) { m_l_DISPLAY_CD = val; }
	public void setMAX_DISPLAY_ROWNUM(String val) { m_MAX_DISPLAY_ROWNUM = val; }
	public void setSCREEN_COMMENT(String val) { m_SCREEN_COMMENT = val; }
	public void setSCREEN_COMMENT_EN(String val) { m_SCREEN_COMMENT_EN = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setSERVLET_CD(String val) { m_SERVLET_CD = val; }
	public void setDISPLAY_CD(String val) { m_DISPLAY_CD = val; }


	public void setList_h_MAX_DISPLAY_ROWNUM(List list) { l_h_MAX_DISPLAY_ROWNUM = list; }
	public void setList_l_SERVLET_CD(List list) { l_l_SERVLET_CD = list; }
	public void setList_l_DISPLAY_CD(List list) { l_l_DISPLAY_CD = list; }
	public void setList_MAX_DISPLAY_ROWNUM(List list) { l_MAX_DISPLAY_ROWNUM = list; }
	public void setList_SCREEN_COMMENT(List list) { l_SCREEN_COMMENT = list; }
	public void setList_SCREEN_COMMENT_EN(List list) { l_SCREEN_COMMENT_EN = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_SERVLET_CD(List list) { l_SERVLET_CD = list; }
	public void setList_DISPLAY_CD(List list) { l_DISPLAY_CD = list; }

	public int setL2L_h_MAX_DISPLAY_ROWNUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MAX_DISPLAY_ROWNUM == null) {
			l_h_MAX_DISPLAY_ROWNUM = new ArrayList();
		} else {
			l_h_MAX_DISPLAY_ROWNUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MAX_DISPLAY_ROWNUM.add(((AN0050010Struct) list.get(i)).geth_MAX_DISPLAY_ROWNUM());
		}
		return size;
	}
	public int setL2L_l_SERVLET_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SERVLET_CD == null) {
			l_l_SERVLET_CD = new ArrayList();
		} else {
			l_l_SERVLET_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SERVLET_CD.add(((AN0050010Struct) list.get(i)).getl_SERVLET_CD());
		}
		return size;
	}
	public int setL2L_l_DISPLAY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISPLAY_CD == null) {
			l_l_DISPLAY_CD = new ArrayList();
		} else {
			l_l_DISPLAY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISPLAY_CD.add(((AN0050010Struct) list.get(i)).getl_DISPLAY_CD());
		}
		return size;
	}
	public int setL2L_MAX_DISPLAY_ROWNUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_DISPLAY_ROWNUM == null) {
			l_MAX_DISPLAY_ROWNUM = new ArrayList();
		} else {
			l_MAX_DISPLAY_ROWNUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_DISPLAY_ROWNUM.add(((AN0050010Struct) list.get(i)).getMAX_DISPLAY_ROWNUM());
		}
		return size;
	}
	public int setL2L_SCREEN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCREEN_COMMENT == null) {
			l_SCREEN_COMMENT = new ArrayList();
		} else {
			l_SCREEN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCREEN_COMMENT.add(((AN0050010Struct) list.get(i)).getSCREEN_COMMENT());
		}
		return size;
	}
	public int setL2L_SCREEN_COMMENT_EN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCREEN_COMMENT_EN == null) {
			l_SCREEN_COMMENT_EN = new ArrayList();
		} else {
			l_SCREEN_COMMENT_EN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCREEN_COMMENT_EN.add(((AN0050010Struct) list.get(i)).getSCREEN_COMMENT_EN());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((AN0050010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_SERVLET_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVLET_CD == null) {
			l_SERVLET_CD = new ArrayList();
		} else {
			l_SERVLET_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVLET_CD.add(((AN0050010Struct) list.get(i)).getSERVLET_CD());
		}
		return size;
	}
	public int setL2L_DISPLAY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_CD == null) {
			l_DISPLAY_CD = new ArrayList();
		} else {
			l_DISPLAY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_CD.add(((AN0050010Struct) list.get(i)).getDISPLAY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_MAX_DISPLAY_ROWNUM = null;
		m_l_SERVLET_CD = null;
		m_l_DISPLAY_CD = null;
		m_MAX_DISPLAY_ROWNUM = null;
		m_SCREEN_COMMENT = null;
		m_SCREEN_COMMENT_EN = null;
		m_h_MODIFY_COUNT = null;
		m_SERVLET_CD = null;
		m_DISPLAY_CD = null;

		l_h_MAX_DISPLAY_ROWNUM = null;
		l_l_SERVLET_CD = null;
		l_l_DISPLAY_CD = null;
		l_MAX_DISPLAY_ROWNUM = null;
		l_SCREEN_COMMENT = null;
		l_SCREEN_COMMENT_EN = null;
		l_h_MODIFY_COUNT = null;
		l_SERVLET_CD = null;
		l_DISPLAY_CD = null;

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
	 * medAN0050010�N���X�̕W���R���X�g���N�^
	 */
	public AN0050010Struct()
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
	public void setStruct(AN0050010Struct struct)
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
	public void setStructM(AN0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_MAX_DISPLAY_ROWNUM(struct.geth_MAX_DISPLAY_ROWNUM());
			this.setl_SERVLET_CD(struct.getl_SERVLET_CD());
			this.setl_DISPLAY_CD(struct.getl_DISPLAY_CD());
			this.setMAX_DISPLAY_ROWNUM(struct.getMAX_DISPLAY_ROWNUM());
			this.setSCREEN_COMMENT(struct.getSCREEN_COMMENT());
			this.setSCREEN_COMMENT_EN(struct.getSCREEN_COMMENT_EN());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setSERVLET_CD(struct.getSERVLET_CD());
			this.setDISPLAY_CD(struct.getDISPLAY_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_MAX_DISPLAY_ROWNUM(struct.getList_h_MAX_DISPLAY_ROWNUM());
			this.setList_l_SERVLET_CD(struct.getList_l_SERVLET_CD());
			this.setList_l_DISPLAY_CD(struct.getList_l_DISPLAY_CD());
			this.setList_MAX_DISPLAY_ROWNUM(struct.getList_MAX_DISPLAY_ROWNUM());
			this.setList_SCREEN_COMMENT(struct.getList_SCREEN_COMMENT());
			this.setList_SCREEN_COMMENT_EN(struct.getList_SCREEN_COMMENT_EN());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_SERVLET_CD(struct.getList_SERVLET_CD());
			this.setList_DISPLAY_CD(struct.getList_DISPLAY_CD());
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
	// �� 1 �ϐ������l�F i_h_MAX_DISPLAY_ROWNUM


	final static String i_h_MAX_DISPLAY_ROWNUM = null;

	// �� 2 �ϐ������l�F i_l_SERVLET_CD


	final static String i_l_SERVLET_CD = null;

	// �� 3 �ϐ������l�F i_l_DISPLAY_CD


	final static String i_l_DISPLAY_CD = null;

	// �� 4 �ϐ������l�F i_MAX_DISPLAY_ROWNUM


	final static String i_MAX_DISPLAY_ROWNUM = null;

	// �� 5 �ϐ������l�F i_SCREEN_COMMENT


	final static String i_SCREEN_COMMENT = null;

	// �� 6 �ϐ������l�F i_SCREEN_COMMENT_EN


	final static String i_SCREEN_COMMENT_EN = null;

	// �� 7 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 8 �ϐ������l�F i_SERVLET_CD


	final static String i_SERVLET_CD = null;

	// �� 9 �ϐ������l�F i_DISPLAY_CD


	final static String i_DISPLAY_CD = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_l_SERVLET_CD
        final static String i_l_SERVLET_CD = null;
        // �� 2 �ϐ������l�F i_l_DISPLAY_CD
        final static String i_l_DISPLAY_CD = null;
        // �� 3 �ϐ������l�F i_MAX_DISPLAY_ROWNUM
        final static String i_MAX_DISPLAY_ROWNUM = null;
        // �� 4 �ϐ������l�F i_SCREEN_COMMENT
        final static String i_SCREEN_COMMENT = null;
        // �� 5 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 6 �ϐ������l�F i_SERVLET_CD
        final static String i_SERVLET_CD = null;
        // �� 7 �ϐ������l�F i_DISPLAY_CD
        final static String i_DISPLAY_CD = null;
        // �� 8 �ϐ������l�F i_h_MAX_DISPLAY_ROWNUM
        final static String i_h_MAX_DISPLAY_ROWNUM = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_l_SERVLET_CD = i_l_SERVLET_CD;
         m_l_DISPLAY_CD = i_l_DISPLAY_CD;
         m_MAX_DISPLAY_ROWNUM = i_MAX_DISPLAY_ROWNUM;
         m_SCREEN_COMMENT = i_SCREEN_COMMENT;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_SERVLET_CD = i_SERVLET_CD;
         m_DISPLAY_CD = i_DISPLAY_CD;
         m_h_MAX_DISPLAY_ROWNUM = i_h_MAX_DISPLAY_ROWNUM;
       
         l_l_SERVLET_CD = null;
         l_l_DISPLAY_CD = null;
         l_MAX_DISPLAY_ROWNUM = null;
         l_SCREEN_COMMENT = null;
         l_h_MODIFY_COUNT = null;
         l_SERVLET_CD = null;
         l_DISPLAY_CD = null;
         l_h_MAX_DISPLAY_ROWNUM = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
