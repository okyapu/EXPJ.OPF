/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0030/src/com/nec/jp/orteus/metamorBase/DB0030/DB0030B001/medDB0030B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0030.DB0030B001;

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
 * CLASS     : medDB0030B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:21:41 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDB0030B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_ITEM_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_PROC_CD;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_EFF_PHASE_IN_DATE;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_VEND_CD;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_UNIT_COST;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_UNIT_COST_TYP;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_CUR_CD;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_EXCH_RATE;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_PUCH_UNIT_QTY;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_CLASIFICATION_CD;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_COMPANY_CD;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_ORG_CD;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_STOCK_UNIT;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_ONEROUS_FLG;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_UPDATED_DATE;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_TRANSACTION_TYP;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_SAVE_UPDATED_DATE;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_YYYYMM;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_YEAR;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_HALF_TERM_TYP;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_COST_TYP;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_PUCH_PRIORITY_REF_NO;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_RCY_VAL_UNIT_COST;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_RCY_RECOUP_RATE;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_CS_PUCH_TYP;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_UPD_FLG;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_START_MONTH;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_PRIORITY_TYP;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_UPDATE_TYP;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_CS_PROC_CD;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_CS_ERROR_CD;

	/**
	 * �� 33 mediator�ϐ�
	 */
	protected String m_BATCH_TYP;

	/**
	 * �� 34 mediator�ϐ�
	 */
	protected String m_BUSINESS_ID;

	/**
	 * �� 35 mediator�ϐ�
	 */
	protected String m_MESSAGE_CD;

	/**
	 * �� 36 mediator�ϐ�
	 */
	protected String m_READ_COUNT;

	/**
	 * �� 37 mediator�ϐ�
	 */
	protected String m_REMARKS;

	/**
	 * �� 38 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * M_SBCNT_UNIT_COST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_CS_PUCH_IF entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_CS_PUCH_IF_delete entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * SYS_COST_CTRL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * M_ITEM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * M_CS_PROC entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * M_CS_PUCH entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * M_CS_PUCH_delete entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * T_CS_ERROR entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * T_CS_PUCH_IF_UpdFlgOff entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * T_CS_PUCH_IF_UpdFlgOn entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * SEQ_CS_ERROR_CD entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="DB0030B001";

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
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getPUCH_UNIT_QTY() { return m_PUCH_UNIT_QTY; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getTRANSACTION_TYP() { return m_TRANSACTION_TYP; }
	public String getSAVE_UPDATED_DATE() { return m_SAVE_UPDATED_DATE; }
	public String getYYYYMM() { return m_YYYYMM; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getPUCH_PRIORITY_REF_NO() { return m_PUCH_PRIORITY_REF_NO; }
	public String getRCY_VAL_UNIT_COST() { return m_RCY_VAL_UNIT_COST; }
	public String getRCY_RECOUP_RATE() { return m_RCY_RECOUP_RATE; }
	public String getCS_PUCH_TYP() { return m_CS_PUCH_TYP; }
	public String getUPD_FLG() { return m_UPD_FLG; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getPRIORITY_TYP() { return m_PRIORITY_TYP; }
	public String getUPDATE_TYP() { return m_UPDATE_TYP; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getCS_ERROR_CD() { return m_CS_ERROR_CD; }
	public String getBATCH_TYP() { return m_BATCH_TYP; }
	public String getBUSINESS_ID() { return m_BUSINESS_ID; }
	public String getMESSAGE_CD() { return m_MESSAGE_CD; }
	public String getREAD_COUNT() { return m_READ_COUNT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getUSER_CD() { return m_USER_CD; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setPROC_CD(String arg) { m_PROC_CD = arg; }
	public void setEFF_PHASE_IN_DATE(String arg) { m_EFF_PHASE_IN_DATE = arg; }
	public void setVEND_CD(String arg) { m_VEND_CD = arg; }
	public void setUNIT_COST(String arg) { m_UNIT_COST = arg; }
	public void setUNIT_COST_TYP(String arg) { m_UNIT_COST_TYP = arg; }
	public void setCUR_CD(String arg) { m_CUR_CD = arg; }
	public void setEXCH_RATE(String arg) { m_EXCH_RATE = arg; }
	public void setPUCH_UNIT_QTY(String arg) { m_PUCH_UNIT_QTY = arg; }
	public void setCLASIFICATION_CD(String arg) { m_CLASIFICATION_CD = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setORG_CD(String arg) { m_ORG_CD = arg; }
	public void setSTOCK_UNIT(String arg) { m_STOCK_UNIT = arg; }
	public void setONEROUS_FLG(String arg) { m_ONEROUS_FLG = arg; }
	public void setUPDATED_DATE(String arg) { m_UPDATED_DATE = arg; }
	public void setTRANSACTION_TYP(String arg) { m_TRANSACTION_TYP = arg; }
	public void setSAVE_UPDATED_DATE(String arg) { m_SAVE_UPDATED_DATE = arg; }
	public void setYYYYMM(String arg) { m_YYYYMM = arg; }
	public void setYEAR(String arg) { m_YEAR = arg; }
	public void setHALF_TERM_TYP(String arg) { m_HALF_TERM_TYP = arg; }
	public void setCOST_TYP(String arg) { m_COST_TYP = arg; }
	public void setPUCH_PRIORITY_REF_NO(String arg) { m_PUCH_PRIORITY_REF_NO = arg; }
	public void setRCY_VAL_UNIT_COST(String arg) { m_RCY_VAL_UNIT_COST = arg; }
	public void setRCY_RECOUP_RATE(String arg) { m_RCY_RECOUP_RATE = arg; }
	public void setCS_PUCH_TYP(String arg) { m_CS_PUCH_TYP = arg; }
	public void setUPD_FLG(String arg) { m_UPD_FLG = arg; }
	public void setSTART_MONTH(String arg) { m_START_MONTH = arg; }
	public void setPRIORITY_TYP(String arg) { m_PRIORITY_TYP = arg; }
	public void setUPDATE_TYP(String arg) { m_UPDATE_TYP = arg; }
	public void setCS_PROC_CD(String arg) { m_CS_PROC_CD = arg; }
	public void setCS_ERROR_CD(String arg) { m_CS_ERROR_CD = arg; }
	public void setBATCH_TYP(String arg) { m_BATCH_TYP = arg; }
	public void setBUSINESS_ID(String arg) { m_BUSINESS_ID = arg; }
	public void setMESSAGE_CD(String arg) { m_MESSAGE_CD = arg; }
	public void setREAD_COUNT(String arg) { m_READ_COUNT = arg; }
	public void setREMARKS(String arg) { m_REMARKS = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_SBCNT_UNIT_COST() { return m_entity0; }
	public void setM_SBCNT_UNIT_COST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF() { return m_entity1; }
	public void setT_CS_PUCH_IF(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_delete() { return m_entity2; }
	public void setT_CS_PUCH_IF_delete(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity3; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getM_ITEM() { return m_entity4; }
	public void setM_ITEM(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getM_CS_PROC() { return m_entity5; }
	public void setM_CS_PROC(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getM_CS_PUCH() { return m_entity6; }
	public void setM_CS_PUCH(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getM_CS_PUCH_delete() { return m_entity7; }
	public void setM_CS_PUCH_delete(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getT_CS_ERROR() { return m_entity8; }
	public void setT_CS_ERROR(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity9; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity10; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_UpdFlgOff() { return m_entity11; }
	public void setT_CS_PUCH_IF_UpdFlgOff(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getT_CS_PUCH_IF_UpdFlgOn() { return m_entity12; }
	public void setT_CS_PUCH_IF_UpdFlgOn(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getSEQ_CS_ERROR_CD() { return m_entity13; }
	public void setSEQ_CS_ERROR_CD(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDB0030B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medDB0030B001()
	{
		// mediator�ϐ������������܂�
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_PROC_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_VEND_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_CUR_CD = null;
		m_EXCH_RATE = null;
		m_PUCH_UNIT_QTY = null;
		m_CLASIFICATION_CD = null;
		m_COMPANY_CD = null;
		m_ORG_CD = null;
		m_STOCK_UNIT = null;
		m_ONEROUS_FLG = null;
		m_UPDATED_DATE = null;
		m_TRANSACTION_TYP = null;
		m_SAVE_UPDATED_DATE = null;
		m_YYYYMM = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_PUCH_PRIORITY_REF_NO = null;
		m_RCY_VAL_UNIT_COST = null;
		m_RCY_RECOUP_RATE = null;
		m_CS_PUCH_TYP = null;
		m_UPD_FLG = null;
		m_START_MONTH = null;
		m_PRIORITY_TYP = null;
		m_UPDATE_TYP = null;
		m_CS_PROC_CD = null;
		m_CS_ERROR_CD = null;
		m_BATCH_TYP = null;
		m_BUSINESS_ID = null;
		m_MESSAGE_CD = null;
		m_READ_COUNT = null;
		m_REMARKS = null;
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
