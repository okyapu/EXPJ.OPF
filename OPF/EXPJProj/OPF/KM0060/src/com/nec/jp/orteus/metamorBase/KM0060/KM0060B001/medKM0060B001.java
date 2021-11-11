/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0060/src/com/nec/jp/orteus/metamorBase/KM0060/KM0060B001/medKM0060B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0060.KM0060B001;

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
 * CLASS     : medKM0060B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/10 06:10:48 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKM0060B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_PROGRAM_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_BUSINESS_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_FILE_PATH;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_FILE_NAME;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_PLANT_NAME;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_USER_NAME;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_pvc2LogMode;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_pvc2OutputMode;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_pvc2OutputPath;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_pvc2OutputName;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_pvc2UserId;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_pvc2BusinessName;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_pvc2PlantCd;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_pnumFlag;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_pvc2OdrNo;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_pvc2ProjectCd;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_pnumEstimateNo;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_pnumDetalNo;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_pnumReturn;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_PROJECT_CD;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_PJ_count;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_OD_NO_count;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_ODR_NO;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_ESTIMATE_NO;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_DETAL_NO;

	/**
	 * SYS_BAT_PARM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * SQLPjBudgetCostMake entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * T_PROJECT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * T_PROJECT_cnt entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * T_ESTIMATE_DETAL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * readODR_NO entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="KM0060B001";

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

	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpnumFlag() { return m_pnumFlag; }
	public String getpvc2OdrNo() { return m_pvc2OdrNo; }
	public String getpvc2ProjectCd() { return m_pvc2ProjectCd; }
	public String getpnumEstimateNo() { return m_pnumEstimateNo; }
	public String getpnumDetalNo() { return m_pnumDetalNo; }
	public String getpnumReturn() { return m_pnumReturn; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getPJ_count() { return m_PJ_count; }
	public String getOD_NO_count() { return m_OD_NO_count; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getDETAL_NO() { return m_DETAL_NO; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpnumFlag(String arg) { m_pnumFlag = arg; }
	public void setpvc2OdrNo(String arg) { m_pvc2OdrNo = arg; }
	public void setpvc2ProjectCd(String arg) { m_pvc2ProjectCd = arg; }
	public void setpnumEstimateNo(String arg) { m_pnumEstimateNo = arg; }
	public void setpnumDetalNo(String arg) { m_pnumDetalNo = arg; }
	public void setpnumReturn(String arg) { m_pnumReturn = arg; }
	public void setPROJECT_CD(String arg) { m_PROJECT_CD = arg; }
	public void setPJ_count(String arg) { m_PJ_count = arg; }
	public void setOD_NO_count(String arg) { m_OD_NO_count = arg; }
	public void setODR_NO(String arg) { m_ODR_NO = arg; }
	public void setESTIMATE_NO(String arg) { m_ESTIMATE_NO = arg; }
	public void setDETAL_NO(String arg) { m_DETAL_NO = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity0; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity1; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity2; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getSQLPjBudgetCostMake() { return m_entity3; }
	public void setSQLPjBudgetCostMake(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getT_PROJECT() { return m_entity4; }
	public void setT_PROJECT(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getT_PROJECT_cnt() { return m_entity5; }
	public void setT_PROJECT_cnt(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getT_ESTIMATE_DETAL() { return m_entity6; }
	public void setT_ESTIMATE_DETAL(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getreadODR_NO() { return m_entity7; }
	public void setreadODR_NO(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKM0060B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKM0060B001()
	{
		// mediator�ϐ������������܂�
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pnumFlag = null;
		m_pvc2OdrNo = null;
		m_pvc2ProjectCd = null;
		m_pnumEstimateNo = null;
		m_pnumDetalNo = null;
		m_pnumReturn = null;
		m_PROJECT_CD = null;
		m_PJ_count = null;
		m_OD_NO_count = null;
		m_ODR_NO = null;
		m_ESTIMATE_NO = null;
		m_DETAL_NO = null;

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
