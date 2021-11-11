/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/src/com/nec/jp/orteus/metamorBase/KP0050/KP0050B001/medKP0050B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0050.KP0050B001;

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
 * CLASS     : medKP0050B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.13 $ $Date: 2015/12/03 08:53:59 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKP0050B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_COMPANY_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_BUSINESS_OPR_DATE;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_inPLANT_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_PLN_STR_DATE;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_PLN_END_DATE;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected Double m_PLN_QTY_REMAIN;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_TRANSPORT_LT;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_ITEM_CD;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_MRP_ODR_TYP;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_OUTSIDE_TYP;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_ISSUE_TYP;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_ODR_LT;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_FIXED_LT;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_PROP_LT;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_SAFETY_LT;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_ISSUE_LT;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_PROP_LOT_SIZE;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_HIGH_LEVEL_NO;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_ITEM_SPOIL;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_WH_PLANT_CD;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_inOD_NO;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_DUE_DATE;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected Double m_DM_QTY;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_KP_ADD_MONTH;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_KP_SUB_MONTH;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_CLASS_CD;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_WORK_DAY_COUNT;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_CAL_DATE;

	/**
	 * readSYS_MY_COMPANY entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readM_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * deleteT_OD entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * readT_SALES_PLAN entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * insertT_OD entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * readSysBusinessMessage entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * readKP_ADD_MONTH entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * readKP_SUB_MONTH entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * readSYS_CLASS_CODE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * selectWORKDAYCOUNT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * selectWORK_DAY entity �C���X�^���X���i�[���܂�
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
	protected String m_Progname="KP0050B001";

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

	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getinPLANT_CD() { return m_inPLANT_CD; }
	public String getPLN_STR_DATE() { return m_PLN_STR_DATE; }
	public String getPLN_END_DATE() { return m_PLN_END_DATE; }
	public Double getPLN_QTY_REMAIN() { return m_PLN_QTY_REMAIN; }
	public String getTRANSPORT_LT() { return m_TRANSPORT_LT; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getISSUE_LT() { return m_ISSUE_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getHIGH_LEVEL_NO() { return m_HIGH_LEVEL_NO; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getWH_PLANT_CD() { return m_WH_PLANT_CD; }
	public String getinOD_NO() { return m_inOD_NO; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public Double getDM_QTY() { return m_DM_QTY; }
	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public String getKP_ADD_MONTH() { return m_KP_ADD_MONTH; }
	public String getKP_SUB_MONTH() { return m_KP_SUB_MONTH; }
	public String getCLASS_CD() { return m_CLASS_CD; }
	public String getWORK_DAY_COUNT() { return m_WORK_DAY_COUNT; }
	public String getCAL_DATE() { return m_CAL_DATE; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setBUSINESS_OPR_DATE(String arg) { m_BUSINESS_OPR_DATE = arg; }
	public void setinPLANT_CD(String arg) { m_inPLANT_CD = arg; }
	public void setPLN_STR_DATE(String arg) { m_PLN_STR_DATE = arg; }
	public void setPLN_END_DATE(String arg) { m_PLN_END_DATE = arg; }
	public void setPLN_QTY_REMAIN(Double arg) { m_PLN_QTY_REMAIN = arg; }
	public void setTRANSPORT_LT(String arg) { m_TRANSPORT_LT = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setMRP_ODR_TYP(String arg) { m_MRP_ODR_TYP = arg; }
	public void setOUTSIDE_TYP(String arg) { m_OUTSIDE_TYP = arg; }
	public void setISSUE_TYP(String arg) { m_ISSUE_TYP = arg; }
	public void setODR_LT(String arg) { m_ODR_LT = arg; }
	public void setFIXED_LT(String arg) { m_FIXED_LT = arg; }
	public void setPROP_LT(String arg) { m_PROP_LT = arg; }
	public void setSAFETY_LT(String arg) { m_SAFETY_LT = arg; }
	public void setISSUE_LT(String arg) { m_ISSUE_LT = arg; }
	public void setPROP_LOT_SIZE(String arg) { m_PROP_LOT_SIZE = arg; }
	public void setHIGH_LEVEL_NO(String arg) { m_HIGH_LEVEL_NO = arg; }
	public void setITEM_SPOIL(String arg) { m_ITEM_SPOIL = arg; }
	public void setWH_PLANT_CD(String arg) { m_WH_PLANT_CD = arg; }
	public void setinOD_NO(String arg) { m_inOD_NO = arg; }
	public void setDUE_DATE(String arg) { m_DUE_DATE = arg; }
	public void setDM_QTY(Double arg) { m_DM_QTY = arg; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setKP_ADD_MONTH(String arg) { m_KP_ADD_MONTH = arg; }
	public void setKP_SUB_MONTH(String arg) { m_KP_SUB_MONTH = arg; }
	public void setCLASS_CD(String arg) { m_CLASS_CD = arg; }
	public void setWORK_DAY_COUNT(String arg) { m_WORK_DAY_COUNT = arg; }
	public void setCAL_DATE(String arg) { m_CAL_DATE = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSYS_MY_COMPANY() { return m_entity0; }
	public void setreadSYS_MY_COMPANY(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadM_PLANT() { return m_entity1; }
	public void setreadM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getdeleteT_OD() { return m_entity2; }
	public void setdeleteT_OD(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getreadT_SALES_PLAN() { return m_entity3; }
	public void setreadT_SALES_PLAN(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getinsertT_OD() { return m_entity4; }
	public void setinsertT_OD(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity5; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getreadKP_ADD_MONTH() { return m_entity6; }
	public void setreadKP_ADD_MONTH(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getreadKP_SUB_MONTH() { return m_entity7; }
	public void setreadKP_SUB_MONTH(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getreadSYS_CLASS_CODE() { return m_entity8; }
	public void setreadSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getselectWORKDAYCOUNT() { return m_entity9; }
	public void setselectWORKDAYCOUNT(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getselectWORK_DAY() { return m_entity10; }
	public void setselectWORK_DAY(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKP0050B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKP0050B001()
	{
		// mediator�ϐ������������܂�
		m_COMPANY_CD = null;
		m_PLANT_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_inPLANT_CD = null;
		m_PLN_STR_DATE = null;
		m_PLN_END_DATE = null;
		m_PLN_QTY_REMAIN = null;
		m_TRANSPORT_LT = null;
		m_ITEM_CD = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ISSUE_TYP = null;
		m_ODR_LT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_ISSUE_LT = null;
		m_PROP_LOT_SIZE = null;
		m_HIGH_LEVEL_NO = null;
		m_ITEM_SPOIL = null;
		m_WH_PLANT_CD = null;
		m_inOD_NO = null;
		m_DUE_DATE = null;
		m_DM_QTY = null;
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_KP_ADD_MONTH = null;
		m_KP_SUB_MONTH = null;
		m_CLASS_CD = null;
		m_WORK_DAY_COUNT = null;
		m_CAL_DATE = null;

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
