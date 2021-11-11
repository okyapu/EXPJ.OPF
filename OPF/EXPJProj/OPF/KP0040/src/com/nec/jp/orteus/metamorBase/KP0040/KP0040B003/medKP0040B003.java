/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B003/medKP0040B003.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B003;

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
 * CLASS     : medKP0040B003 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.15 $ $Date: 2015/12/03 08:53:30 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKP0040B003 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_IN_REM_QTY;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_IN_SALES_PLAN_CD;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_VIEW_SALES_PLAN_CD;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_VIEW_REM_QTY;

	/**
	 * readSysBusinessMessage entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * insertT_SALES_PLAN entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * getV_SLP_ODR_CAL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * readM_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="KP0040B003";

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

	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public String getIN_REM_QTY() { return m_IN_REM_QTY; }
	public String getIN_SALES_PLAN_CD() { return m_IN_SALES_PLAN_CD; }
	public String getVIEW_SALES_PLAN_CD() { return m_VIEW_SALES_PLAN_CD; }
	public String getVIEW_REM_QTY() { return m_VIEW_REM_QTY; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setIN_REM_QTY(String arg) { m_IN_REM_QTY = arg; }
	public void setIN_SALES_PLAN_CD(String arg) { m_IN_SALES_PLAN_CD = arg; }
	public void setVIEW_SALES_PLAN_CD(String arg) { m_VIEW_SALES_PLAN_CD = arg; }
	public void setVIEW_REM_QTY(String arg) { m_VIEW_REM_QTY = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity0; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getinsertT_SALES_PLAN() { return m_entity1; }
	public void setinsertT_SALES_PLAN(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getgetV_SLP_ODR_CAL() { return m_entity2; }
	public void setgetV_SLP_ODR_CAL(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getreadM_PLANT() { return m_entity3; }
	public void setreadM_PLANT(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKP0040B003�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKP0040B003()
	{
		// mediator�ϐ������������܂�
		m_PLANT_CD = null;
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_IN_REM_QTY = null;
		m_IN_SALES_PLAN_CD = null;
		m_VIEW_SALES_PLAN_CD = null;
		m_VIEW_REM_QTY = null;

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
