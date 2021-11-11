/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0040/src/com/nec/jp/orteus/metamorBase/DB0040/DB0040B001/medDB0040B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0040.DB0040B001;

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
 * CLASS     : medDB0040B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:22:03 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDB0040B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_YEAR;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_PRIORITY_TYP;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_PROGRAM_CD;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_BUSINESS_CD;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_FILE_PATH;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_FILE_NAME;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_pvc2LogMode;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_pvc2OutputMode;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_pvc2OutputPath;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_pvc2OutputName;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_pvc2UserId;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_pvc2BusinessName;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_pvc2PlantCd;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_pvc2TargetPlantCd;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_pvc2Year;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_pvc2HalfTermTyp;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_pvc2CostTyp;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_pvc2BatchTyp;

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
	 * SYS_BAT_PARM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * SqlProcCostEntry entity �C���X�^���X���i�[���܂�
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
	protected String m_Progname="DB0040B001";

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
	public String getUSER_CD() { return m_USER_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getPRIORITY_TYP() { return m_PRIORITY_TYP; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpvc2TargetPlantCd() { return m_pvc2TargetPlantCd; }
	public String getpvc2Year() { return m_pvc2Year; }
	public String getpvc2HalfTermTyp() { return m_pvc2HalfTermTyp; }
	public String getpvc2CostTyp() { return m_pvc2CostTyp; }
	public String getpvc2BatchTyp() { return m_pvc2BatchTyp; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setYEAR(String arg) { m_YEAR = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }
	public void setPRIORITY_TYP(String arg) { m_PRIORITY_TYP = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2TargetPlantCd(String arg) { m_pvc2TargetPlantCd = arg; }
	public void setpvc2Year(String arg) { m_pvc2Year = arg; }
	public void setpvc2HalfTermTyp(String arg) { m_pvc2HalfTermTyp = arg; }
	public void setpvc2CostTyp(String arg) { m_pvc2CostTyp = arg; }
	public void setpvc2BatchTyp(String arg) { m_pvc2BatchTyp = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_PLANT() { return m_entity0; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity1; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity2; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity3; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getSqlProcCostEntry() { return m_entity4; }
	public void setSqlProcCostEntry(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDB0040B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medDB0040B001()
	{
		// mediator�ϐ������������܂�
		m_PLANT_CD = null;
		m_USER_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_PRIORITY_TYP = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2TargetPlantCd = null;
		m_pvc2Year = null;
		m_pvc2HalfTermTyp = null;
		m_pvc2CostTyp = null;
		m_pvc2BatchTyp = null;

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
