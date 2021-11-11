/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0010/src/com/nec/jp/orteus/metamorBase/DB0010/DB0010B001/medDB0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0010.DB0010B001;

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
 * CLASS     : medDB0010B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:20:44 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medDB0010B001 extends Object
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
	protected String m_CS_PROC_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_PROC_NAME;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_WS_CD;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_OUTSIDE_TYP;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_VEND_CD;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_STD_COST_OF_MONTH;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_COMPANY_CD;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_ORG_CD;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_UPDATED_DATE;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_CLASIFICATION_CD;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_TRANSACTION_TYP;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_SAVE_UPDATED_DATE;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_ONEROUS_CONS_FLG;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_RCY_TYP_CD;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_STD_COST_UNIT_TYP;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_PRIORITY_TYP;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_UPDATE_TYP;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_CS_ERROR_CD;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_BATCH_TYP;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_BUSINESS_ID;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_MESSAGE_CD;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_READ_COUNT;

	/**
	 * M_PROC_GRP entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * T_ITEM_CS_PROC_IF entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * T_ITEM_CS_PROC_IF_delete entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * SYS_COST_CTRL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * M_CS_PROC entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * M_ITEM_PROC_COST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * T_ITEM_CS_PROC_IF_updated entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * M_CS_PROC_delete entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * M_ITEM_PROC_COST2 entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * T_CS_ERROR entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * M_CONS_UNIT_COST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * SEQ_CS_ERROR_CD entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * deleteM_CS_PROC entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="DB0010B001";

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
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getSTD_COST_OF_MONTH() { return m_STD_COST_OF_MONTH; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getTRANSACTION_TYP() { return m_TRANSACTION_TYP; }
	public String getSAVE_UPDATED_DATE() { return m_SAVE_UPDATED_DATE; }
	public String getONEROUS_CONS_FLG() { return m_ONEROUS_CONS_FLG; }
	public String getRCY_TYP_CD() { return m_RCY_TYP_CD; }
	public String getSTD_COST_UNIT_TYP() { return m_STD_COST_UNIT_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPRIORITY_TYP() { return m_PRIORITY_TYP; }
	public String getUPDATE_TYP() { return m_UPDATE_TYP; }
	public String getCS_ERROR_CD() { return m_CS_ERROR_CD; }
	public String getBATCH_TYP() { return m_BATCH_TYP; }
	public String getBUSINESS_ID() { return m_BUSINESS_ID; }
	public String getMESSAGE_CD() { return m_MESSAGE_CD; }
	public String getREAD_COUNT() { return m_READ_COUNT; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setITEM_CD(String arg) { m_ITEM_CD = arg; }
	public void setPROC_CD(String arg) { m_PROC_CD = arg; }
	public void setCS_PROC_CD(String arg) { m_CS_PROC_CD = arg; }
	public void setPROC_NAME(String arg) { m_PROC_NAME = arg; }
	public void setWS_CD(String arg) { m_WS_CD = arg; }
	public void setOUTSIDE_TYP(String arg) { m_OUTSIDE_TYP = arg; }
	public void setVEND_CD(String arg) { m_VEND_CD = arg; }
	public void setSTD_COST_OF_MONTH(String arg) { m_STD_COST_OF_MONTH = arg; }
	public void setCOMPANY_CD(String arg) { m_COMPANY_CD = arg; }
	public void setORG_CD(String arg) { m_ORG_CD = arg; }
	public void setUPDATED_DATE(String arg) { m_UPDATED_DATE = arg; }
	public void setCLASIFICATION_CD(String arg) { m_CLASIFICATION_CD = arg; }
	public void setTRANSACTION_TYP(String arg) { m_TRANSACTION_TYP = arg; }
	public void setSAVE_UPDATED_DATE(String arg) { m_SAVE_UPDATED_DATE = arg; }
	public void setONEROUS_CONS_FLG(String arg) { m_ONEROUS_CONS_FLG = arg; }
	public void setRCY_TYP_CD(String arg) { m_RCY_TYP_CD = arg; }
	public void setSTD_COST_UNIT_TYP(String arg) { m_STD_COST_UNIT_TYP = arg; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPRIORITY_TYP(String arg) { m_PRIORITY_TYP = arg; }
	public void setUPDATE_TYP(String arg) { m_UPDATE_TYP = arg; }
	public void setCS_ERROR_CD(String arg) { m_CS_ERROR_CD = arg; }
	public void setBATCH_TYP(String arg) { m_BATCH_TYP = arg; }
	public void setBUSINESS_ID(String arg) { m_BUSINESS_ID = arg; }
	public void setMESSAGE_CD(String arg) { m_MESSAGE_CD = arg; }
	public void setREAD_COUNT(String arg) { m_READ_COUNT = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getM_PROC_GRP() { return m_entity0; }
	public void setM_PROC_GRP(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getT_ITEM_CS_PROC_IF() { return m_entity1; }
	public void setT_ITEM_CS_PROC_IF(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getT_ITEM_CS_PROC_IF_delete() { return m_entity2; }
	public void setT_ITEM_CS_PROC_IF_delete(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity3; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity getUSER_MST() { return m_entity4; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getSYS_COST_CTRL() { return m_entity5; }
	public void setSYS_COST_CTRL(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity getM_CS_PROC() { return m_entity6; }
	public void setM_CS_PROC(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity getM_ITEM_PROC_COST() { return m_entity7; }
	public void setM_ITEM_PROC_COST(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity getT_ITEM_CS_PROC_IF_updated() { return m_entity8; }
	public void setT_ITEM_CS_PROC_IF_updated(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity getM_CS_PROC_delete() { return m_entity9; }
	public void setM_CS_PROC_delete(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity getM_ITEM_PROC_COST2() { return m_entity10; }
	public void setM_ITEM_PROC_COST2(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity getT_CS_ERROR() { return m_entity11; }
	public void setT_CS_ERROR(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity getM_CONS_UNIT_COST() { return m_entity12; }
	public void setM_CONS_UNIT_COST(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity getSEQ_CS_ERROR_CD() { return m_entity13; }
	public void setSEQ_CS_ERROR_CD(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getdeleteM_CS_PROC() { return m_entity14; }
	public void setdeleteM_CS_PROC(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medDB0010B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medDB0010B001()
	{
		// mediator�ϐ������������܂�
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_PROC_CD = null;
		m_CS_PROC_CD = null;
		m_PROC_NAME = null;
		m_WS_CD = null;
		m_OUTSIDE_TYP = null;
		m_VEND_CD = null;
		m_STD_COST_OF_MONTH = null;
		m_COMPANY_CD = null;
		m_ORG_CD = null;
		m_UPDATED_DATE = null;
		m_CLASIFICATION_CD = null;
		m_TRANSACTION_TYP = null;
		m_SAVE_UPDATED_DATE = null;
		m_ONEROUS_CONS_FLG = null;
		m_RCY_TYP_CD = null;
		m_STD_COST_UNIT_TYP = null;
		m_USER_CD = null;
		m_PRIORITY_TYP = null;
		m_UPDATE_TYP = null;
		m_CS_ERROR_CD = null;
		m_BATCH_TYP = null;
		m_BUSINESS_ID = null;
		m_MESSAGE_CD = null;
		m_READ_COUNT = null;

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
