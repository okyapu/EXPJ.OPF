/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0100/src/com/nec/jp/orteus/metamorBase/AA0100/AA0100010Struct.java,v $
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
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** �� 2 �ϐ��F m_w_REC_COUNT */
	public Integer m_w_REC_COUNT = null;
	/** �� 3 �ϐ��F m_p_HOLIDAY_DATE */
	public String m_p_HOLIDAY_DATE = null;
	/** �� 4 �ϐ��F m_HOLIDAY_MMDD */
	public String m_HOLIDAY_MMDD = null;
	/** �� 5 �ϐ��F m_p_HOLIDAY_NAME */
	public String m_p_HOLIDAY_NAME = null;
	/** �� 6 �ϐ��F m_HOLIDAY_DATE */
	public String m_HOLIDAY_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** �� 2 List�ϐ��F l_w_REC_COUNT */
	public List l_w_REC_COUNT = null;

	/** �� 3 List�ϐ��F l_p_HOLIDAY_DATE */
	public List l_p_HOLIDAY_DATE = null;

	/** �� 4 List�ϐ��F l_HOLIDAY_MMDD */
	public List l_HOLIDAY_MMDD = null;

	/** �� 5 List�ϐ��F l_p_HOLIDAY_NAME */
	public List l_p_HOLIDAY_NAME = null;

	/** �� 6 List�ϐ��F l_HOLIDAY_DATE */
	public List l_HOLIDAY_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public Integer getw_REC_COUNT() { return m_w_REC_COUNT; }
	public String getp_HOLIDAY_DATE() { return m_p_HOLIDAY_DATE; }
	public String getHOLIDAY_MMDD() { return m_HOLIDAY_MMDD; }
	public String getp_HOLIDAY_NAME() { return m_p_HOLIDAY_NAME; }
	public String getHOLIDAY_DATE() { return m_HOLIDAY_DATE; }

	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_w_REC_COUNT() { return l_w_REC_COUNT; }
	public List getList_p_HOLIDAY_DATE() { return l_p_HOLIDAY_DATE; }
	public List getList_HOLIDAY_MMDD() { return l_HOLIDAY_MMDD; }
	public List getList_p_HOLIDAY_NAME() { return l_p_HOLIDAY_NAME; }
	public List getList_HOLIDAY_DATE() { return l_HOLIDAY_DATE; }

	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setw_REC_COUNT(Integer val) { m_w_REC_COUNT = val; }
	public void setp_HOLIDAY_DATE(String val) { m_p_HOLIDAY_DATE = val; }
	public void setHOLIDAY_MMDD(String val) { m_HOLIDAY_MMDD = val; }
	public void setp_HOLIDAY_NAME(String val) { m_p_HOLIDAY_NAME = val; }
	public void setHOLIDAY_DATE(String val) { m_HOLIDAY_DATE = val; }

	public void setw_REC_COUNT(String val) { m_w_REC_COUNT = getInteger(val); }

	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_w_REC_COUNT(List list) { l_w_REC_COUNT = list; }
	public void setList_p_HOLIDAY_DATE(List list) { l_p_HOLIDAY_DATE = list; }
	public void setList_HOLIDAY_MMDD(List list) { l_HOLIDAY_MMDD = list; }
	public void setList_p_HOLIDAY_NAME(List list) { l_p_HOLIDAY_NAME = list; }
	public void setList_HOLIDAY_DATE(List list) { l_HOLIDAY_DATE = list; }

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
			l_w_MODIFY_COUNT.add(((AA0100010Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_REC_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_REC_COUNT == null) {
			l_w_REC_COUNT = new ArrayList();
		} else {
			l_w_REC_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_REC_COUNT.add(((AA0100010Struct) list.get(i)).getw_REC_COUNT());
		}
		return size;
	}
	public int setL2L_p_HOLIDAY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_HOLIDAY_DATE == null) {
			l_p_HOLIDAY_DATE = new ArrayList();
		} else {
			l_p_HOLIDAY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_HOLIDAY_DATE.add(((AA0100010Struct) list.get(i)).getp_HOLIDAY_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_MMDD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_MMDD == null) {
			l_HOLIDAY_MMDD = new ArrayList();
		} else {
			l_HOLIDAY_MMDD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_MMDD.add(((AA0100010Struct) list.get(i)).getHOLIDAY_MMDD());
		}
		return size;
	}
	public int setL2L_p_HOLIDAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_HOLIDAY_NAME == null) {
			l_p_HOLIDAY_NAME = new ArrayList();
		} else {
			l_p_HOLIDAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_HOLIDAY_NAME.add(((AA0100010Struct) list.get(i)).getp_HOLIDAY_NAME());
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
			l_HOLIDAY_DATE.add(((AA0100010Struct) list.get(i)).getHOLIDAY_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_MODIFY_COUNT = null;
		m_w_REC_COUNT = null;
		m_p_HOLIDAY_DATE = null;
		m_HOLIDAY_MMDD = null;
		m_p_HOLIDAY_NAME = null;
		m_HOLIDAY_DATE = null;

		l_w_MODIFY_COUNT = null;
		l_w_REC_COUNT = null;
		l_p_HOLIDAY_DATE = null;
		l_HOLIDAY_MMDD = null;
		l_p_HOLIDAY_NAME = null;
		l_HOLIDAY_DATE = null;

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
	 * medAA0100010�N���X�̕W���R���X�g���N�^
	 */
	public AA0100010Struct()
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
	public void setStruct(AA0100010Struct struct)
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
	public void setStructM(AA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setw_REC_COUNT(struct.getw_REC_COUNT());
			this.setp_HOLIDAY_DATE(struct.getp_HOLIDAY_DATE());
			this.setHOLIDAY_MMDD(struct.getHOLIDAY_MMDD());
			this.setp_HOLIDAY_NAME(struct.getp_HOLIDAY_NAME());
			this.setHOLIDAY_DATE(struct.getHOLIDAY_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_w_REC_COUNT(struct.getList_w_REC_COUNT());
			this.setList_p_HOLIDAY_DATE(struct.getList_p_HOLIDAY_DATE());
			this.setList_HOLIDAY_MMDD(struct.getList_HOLIDAY_MMDD());
			this.setList_p_HOLIDAY_NAME(struct.getList_p_HOLIDAY_NAME());
			this.setList_HOLIDAY_DATE(struct.getList_HOLIDAY_DATE());
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
	// �� 1 �ϐ������l�F i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// �� 2 �ϐ������l�F i_w_REC_COUNT


	final static Integer i_w_REC_COUNT = null;

	// �� 3 �ϐ������l�F i_p_HOLIDAY_DATE


	final static String i_p_HOLIDAY_DATE = null;

	// �� 4 �ϐ������l�F i_HOLIDAY_MMDD


	final static String i_HOLIDAY_MMDD = null;

	// �� 5 �ϐ������l�F i_p_HOLIDAY_NAME


	final static String i_p_HOLIDAY_NAME = null;

	// �� 6 �ϐ������l�F i_HOLIDAY_DATE


	final static String i_HOLIDAY_DATE = null;

*/

	//{{user_implement_code
        //--------------------------------------------------------------------------
       
        /**
         * ������
         */
        public void initialize()
        {
         m_p_HOLIDAY_DATE = null;
         m_p_HOLIDAY_NAME = null;
         m_w_MODIFY_COUNT = null;
         m_HOLIDAY_DATE = null;
        }
       
        /**
         * �������ϐ��̃R�s�[
         * @param �R�s�[��
         */
        public void copy(AA0100010Struct s)
        {
         clear();
         if(s.m_p_HOLIDAY_DATE != null) m_p_HOLIDAY_DATE = new String(s.m_p_HOLIDAY_DATE);
         if(s.m_HOLIDAY_MMDD != null) m_HOLIDAY_MMDD = new String(s.m_HOLIDAY_MMDD);
         if(s.m_p_HOLIDAY_NAME != null) m_p_HOLIDAY_NAME = new String(s.m_p_HOLIDAY_NAME);
         if(s.m_w_MODIFY_COUNT != null) m_w_MODIFY_COUNT = new String(s.m_w_MODIFY_COUNT);
         if(s.m_HOLIDAY_DATE != null) m_HOLIDAY_DATE = new String(s.m_HOLIDAY_DATE);
         if(s.m_w_REC_COUNT != null) m_w_REC_COUNT = new Integer(s.m_w_REC_COUNT.intValue());
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sOrganization_CD != null) sOrganization_CD = new String(s.sOrganization_CD);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
        }
        /**
         * �N�����̃R�s�[
         * @param �L�[�̃R�s�[��
         */
        public void keycopy(AA0100010Struct struct)
        {
         if(struct.m_HOLIDAY_DATE != null){
          m_HOLIDAY_DATE = new String(struct.m_HOLIDAY_DATE);
         }
        }
        /**
         * �N�����̑������ꂼ�ꎝ�C���X�^���X�̏����}�[�W�B
         * �N�����̐ݒ���s��<br>
         * �����̏��� ���̑����ɐݒ肳��Ă���`���Ɋւ�炸 MM/DD�`����ݒ�B
         * @param AA0100010Struct year �N�̏������C���X�^���X
         * @param AA0100010Struct other ���̑��������C���X�^���X
         * @return true:OK / false:NG(�t�H�[�}�b�g�s����)
         */
        public boolean merge(AA0100010Struct year, AA0100010Struct other)
        {
         // ���t�`���̕ϊ�
         String tmpDate = year.m_HOLIDAY_DATE + "/" + other.m_HOLIDAY_MMDD;
         DateConverter conv = new DateConverter();
         String yymmdd = null, mmdd = null;
         if((yymmdd = conv.str2formal(tmpDate)) == null || (mmdd = conv.str2mmdd(tmpDate)) == null)
          return false;
       
         copy(other);
         keycopy(year);
       
         m_p_HOLIDAY_DATE = new String(yymmdd);
         m_HOLIDAY_MMDD = new String(mmdd);
         return true;
        }
        /**
         * ���g�̓��e�𕶎���ԋp
         * @return ���
         */
        public String contents()
        {
         String s = "p_HOLIDAY_DATE[" + m_p_HOLIDAY_DATE + "] "
         + "HOLIDAY_MMDD[" + m_HOLIDAY_MMDD + "] "
         + "p_HOLIDAY_NAME[" + m_p_HOLIDAY_NAME + "] "
         + "w_MODIFY_COUNT[" + m_w_MODIFY_COUNT + "] "
         + "HOLIDAY_DATE[" + m_HOLIDAY_DATE + "] "
         + "w_REC_COUNT[" + m_w_REC_COUNT + "]";
         return s;
        }
       
        //}}user_implement_code

	//////////////////////////////

}
