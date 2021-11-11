/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030B002/medAD0030B002.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030.AD0030B002;

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
 * CLASS     : medAD0030B002 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.21 $ $Date: 2016/05/23 08:12:47 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAD0030B002 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_pvc2LogMode;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_pvc2OutputMode;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_pvc2OutputPath;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_pvc2OutputName;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_pvc2UserId;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_pvc2PlantCd;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_pvc2BusinessName;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_pvc2OprInstStartDate;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_pvc2WorkOdrDlvDate;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_pvc2JobOdrCd;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_pvc2ItemCd;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_pvc2WsCd;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_pvc2OprRsltTyp;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_pvc2OutSideTyp;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_pvc2OutSideTyp2;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_pvc2VendCd;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_programCd;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_functionName;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_businessGroupCd;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_businessCd;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_filePath;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_fileName;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected Integer m_logModeTyp;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected Integer m_outputModeTyp;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * callSqlDailyProc entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysBatParm entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * selectUserCd entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * selectPlantCd entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * selectAllPlantCd entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="AD0030B002";

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

	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2OprInstStartDate() { return m_pvc2OprInstStartDate; }
	public String getpvc2WorkOdrDlvDate() { return m_pvc2WorkOdrDlvDate; }
	public String getpvc2JobOdrCd() { return m_pvc2JobOdrCd; }
	public String getpvc2ItemCd() { return m_pvc2ItemCd; }
	public String getpvc2WsCd() { return m_pvc2WsCd; }
	public String getpvc2OprRsltTyp() { return m_pvc2OprRsltTyp; }
	public String getpvc2OutSideTyp() { return m_pvc2OutSideTyp; }
	public String getpvc2OutSideTyp2() { return m_pvc2OutSideTyp2; }
	public String getpvc2VendCd() { return m_pvc2VendCd; }
	public String getprogramCd() { return m_programCd; }
	public String getfunctionName() { return m_functionName; }
	public String getbusinessGroupCd() { return m_businessGroupCd; }
	public String getbusinessCd() { return m_businessCd; }
	public String getfilePath() { return m_filePath; }
	public String getfileName() { return m_fileName; }
	public Integer getlogModeTyp() { return m_logModeTyp; }
	public Integer getoutputModeTyp() { return m_outputModeTyp; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2OprInstStartDate(String arg) { m_pvc2OprInstStartDate = arg; }
	public void setpvc2WorkOdrDlvDate(String arg) { m_pvc2WorkOdrDlvDate = arg; }
	public void setpvc2JobOdrCd(String arg) { m_pvc2JobOdrCd = arg; }
	public void setpvc2ItemCd(String arg) { m_pvc2ItemCd = arg; }
	public void setpvc2WsCd(String arg) { m_pvc2WsCd = arg; }
	public void setpvc2OprRsltTyp(String arg) { m_pvc2OprRsltTyp = arg; }
	public void setpvc2OutSideTyp(String arg) { m_pvc2OutSideTyp = arg; }
	public void setpvc2OutSideTyp2(String arg) { m_pvc2OutSideTyp2 = arg; }
	public void setpvc2VendCd(String arg) { m_pvc2VendCd = arg; }
	public void setprogramCd(String arg) { m_programCd = arg; }
	public void setfunctionName(String arg) { m_functionName = arg; }
	public void setbusinessGroupCd(String arg) { m_businessGroupCd = arg; }
	public void setbusinessCd(String arg) { m_businessCd = arg; }
	public void setfilePath(String arg) { m_filePath = arg; }
	public void setfileName(String arg) { m_fileName = arg; }
	public void setlogModeTyp(Integer arg) { m_logModeTyp = arg; }
	public void setoutputModeTyp(Integer arg) { m_outputModeTyp = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getcallSqlDailyProc() { return m_entity0; }
	public void setcallSqlDailyProc(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysBatParm() { return m_entity1; }
	public void setreadSysBatParm(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getselectUserCd() { return m_entity2; }
	public void setselectUserCd(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getselectPlantCd() { return m_entity3; }
	public void setselectPlantCd(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getselectAllPlantCd() { return m_entity4; }
	public void setselectAllPlantCd(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAD0030B002�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medAD0030B002()
	{
		// mediator�ϐ������������܂�
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2PlantCd = null;
		m_pvc2BusinessName = null;
		m_pvc2OprInstStartDate = null;
		m_pvc2WorkOdrDlvDate = null;
		m_pvc2JobOdrCd = null;
		m_pvc2ItemCd = null;
		m_pvc2WsCd = null;
		m_pvc2OprRsltTyp = null;
		m_pvc2OutSideTyp = null;
		m_pvc2OutSideTyp2 = null;
		m_pvc2VendCd = null;
		m_programCd = null;
		m_functionName = null;
		m_businessGroupCd = null;
		m_businessCd = null;
		m_filePath = null;
		m_fileName = null;
		m_logModeTyp = null;
		m_outputModeTyp = null;
		m_USER_CD = null;
		m_PLANT_CD = null;

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
