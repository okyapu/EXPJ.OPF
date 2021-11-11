/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0010/src/com/nec/jp/orteus/metamorBase/DE0010/DE0010B001/medDE0010B001.java,v $
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
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 * EXPJ    (2004/03/21),EXPLANNER/J�p�ɉ���
 *                      SystemLog�̋L�q��ǉ��B
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.DE0010.DE0010B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

/**
 * CLASS     : medDE0010B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:25:39 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDE0010B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_PLANT_NAME;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_USER_NAME;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_START_MONTH;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_AFTER_YEAR;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_AFTER_MONTH;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_AFTER_HALF_TERM_TYP;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_AFTER_TERM;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_CURRENT_YEAR;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_CURRENT_MONTH;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_TERM;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_COST_CTRL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="DE0010B001";

	/**
	 * �v���O��������Ԃ��܂�
	 *
	 * @return �v���O������
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * �v���O��������mediator�Ɋi�[���܂�
	 *
	 * @param �v���O������
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 *
	 * @return �������t
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * �������t��mediator�Ɋi�[���܂�
	 *
	 * @param �������t
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * �o�^��/�X�V�҂��i�[���܂�
	 */
	protected String Username = "orteus_system";

	/**
	 * �o�^��/�X�V�҂��擾���܂�
	 *
	 * @return �o�^��/�X�V��
	 */
	public String getUsername() { return Username; }

	/**
	 * �o�^��/�X�V�҂�mediator�Ɋi�[���܂�
	 *
	 * @param �o�^��/�X�V��
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * ���������i�[���܂�
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * �R�}���h���C���̈���������z���Ԃ��܂�
	 *
	 * @return ����������z��
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * �R�}���h���C���̈���������z���mediator�Ɋi�[���܂�
	 *
	 * @param ����������z��
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getAFTER_YEAR() { return m_AFTER_YEAR; }
	public String getAFTER_MONTH() { return m_AFTER_MONTH; }
	public String getAFTER_HALF_TERM_TYP() { return m_AFTER_HALF_TERM_TYP; }
	public String getAFTER_TERM() { return m_AFTER_TERM; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getCURRENT_MONTH() { return m_CURRENT_MONTH; }
	public String getTERM() { return m_TERM; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setSTART_MONTH(String arg) { m_START_MONTH = arg; }
	public void setAFTER_YEAR(String arg) { m_AFTER_YEAR = arg; }
	public void setAFTER_MONTH(String arg) { m_AFTER_MONTH = arg; }
	public void setAFTER_HALF_TERM_TYP(String arg) { m_AFTER_HALF_TERM_TYP = arg; }
	public void setAFTER_TERM(String arg) { m_AFTER_TERM = arg; }
	public void setCURRENT_YEAR(String arg) { m_CURRENT_YEAR = arg; }
	public void setCURRENT_MONTH(String arg) { m_CURRENT_MONTH = arg; }
	public void setTERM(String arg) { m_TERM = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_PLANT() { return m_entity0; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity1; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity2; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDE0010B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medDE0010B001()
	{
		// mediator�ϐ������������܂�
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_START_MONTH = null;
		m_AFTER_YEAR = null;
		m_AFTER_MONTH = null;
		m_AFTER_HALF_TERM_TYP = null;
		m_AFTER_TERM = null;
		m_CURRENT_YEAR = null;
		m_CURRENT_MONTH = null;
		m_TERM = null;
		m_HALF_TERM_TYP = null;

               //{{user_implement_dev:constractor
                // TODO: �����ɏ����������L�q���Ă�������
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	protected void finalize()
	{

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �V�X�e�����O
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_dev:original

	//////////////////////////////

}
