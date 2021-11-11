/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0020/src/com/nec/jp/orteus/metamorBase/DC0020/DC0020B001/medDC0020B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DC0020.DC0020B001;

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
 * CLASS     : medDC0020B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:23:17 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDC0020B001 extends Object
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
	protected String m_pvc2BusinessName;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_pvc2PlantCd;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_pnumYear;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_pnumHalfTermTyp;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_pnumCostTyp;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_pnumActTyp;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_pnumReturn;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_PROGRAM_CD;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_BUSINESS_CD;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_FILE_PATH;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_FILE_NAME;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_YEAR;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_COST_TYP;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_BATCH_TYP;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_EXECUTE_TYP;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_RESULT_STATUS_TYP;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_CS_CALC_PROC_NO;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_CURRENT_YEAR;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_PLANT_NAME;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_USER_NAME;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * SQLSTDITEMPSWORKENTRY entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * SQLSTDMATRPROCCHECK entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_BAT_PARM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * SYS_CS_CALC_CTRL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * SYS_CS_CALC_CTRL_Start entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * SYS_CS_CALC_CTRL_Active entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * SYS_CS_CALC_CTRL_Stop entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * SYS_COST_CTRL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * T_CS_PS_T entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="DC0020B001";

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
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpnumYear() { return m_pnumYear; }
	public String getpnumHalfTermTyp() { return m_pnumHalfTermTyp; }
	public String getpnumCostTyp() { return m_pnumCostTyp; }
	public String getpnumActTyp() { return m_pnumActTyp; }
	public String getpnumReturn() { return m_pnumReturn; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getBATCH_TYP() { return m_BATCH_TYP; }
	public String getEXECUTE_TYP() { return m_EXECUTE_TYP; }
	public String getRESULT_STATUS_TYP() { return m_RESULT_STATUS_TYP; }
	public String getCS_CALC_PROC_NO() { return m_CS_CALC_PROC_NO; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpnumYear(String arg) { m_pnumYear = arg; }
	public void setpnumHalfTermTyp(String arg) { m_pnumHalfTermTyp = arg; }
	public void setpnumCostTyp(String arg) { m_pnumCostTyp = arg; }
	public void setpnumActTyp(String arg) { m_pnumActTyp = arg; }
	public void setpnumReturn(String arg) { m_pnumReturn = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setYEAR(String arg) { m_YEAR = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }
	public void setCOST_TYP(String arg) { m_COST_TYP = arg; }
	public void setBATCH_TYP(String arg) { m_BATCH_TYP = arg; }
	public void setEXECUTE_TYP(String arg) { m_EXECUTE_TYP = arg; }
	public void setRESULT_STATUS_TYP(String arg) { m_RESULT_STATUS_TYP = arg; }
	public void setCS_CALC_PROC_NO(String arg) { m_CS_CALC_PROC_NO = arg; }
	public void setCURRENT_YEAR(String arg) { m_CURRENT_YEAR = arg; }
	public void setPLANT_NAME(String arg) { m_PLANT_NAME = arg; }
	public void setUSER_NAME(String arg) { m_USER_NAME = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getSQLSTDITEMPSWORKENTRY() { return m_entity0; }
	public void setSQLSTDITEMPSWORKENTRY(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getSQLSTDMATRPROCCHECK() { return m_entity1; }
	public void setSQLSTDMATRPROCCHECK(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_BAT_PARM() { return m_entity2; }
	public void setSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getSYS_CS_CALC_CTRL() { return m_entity3; }
	public void setSYS_CS_CALC_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getSYS_CS_CALC_CTRL_Start() { return m_entity4; }
	public void setSYS_CS_CALC_CTRL_Start(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getSYS_CS_CALC_CTRL_Active() { return m_entity5; }
	public void setSYS_CS_CALC_CTRL_Active(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getSYS_CS_CALC_CTRL_Stop() { return m_entity6; }
	public void setSYS_CS_CALC_CTRL_Stop(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity7; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity8; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity9; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getT_CS_PS_T() { return m_entity10; }
	public void setT_CS_PS_T(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDC0020B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medDC0020B001()
	{
		// mediator�ϐ������������܂�
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pnumYear = null;
		m_pnumHalfTermTyp = null;
		m_pnumCostTyp = null;
		m_pnumActTyp = null;
		m_pnumReturn = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_BATCH_TYP = null;
		m_EXECUTE_TYP = null;
		m_RESULT_STATUS_TYP = null;
		m_CS_CALC_PROC_NO = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_USER_NAME = null;
		m_USER_CD = null;

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
