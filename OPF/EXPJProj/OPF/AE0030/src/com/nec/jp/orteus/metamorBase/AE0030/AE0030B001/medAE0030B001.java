/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030B001/medAE0030B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030.AE0030B001;

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
 * CLASS     : medAE0030B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.19 $ $Date: 2014/11/05 07:09:54 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAE0030B001 �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/10/3),�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class medAE0030B001 extends Object
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
	protected String m_pvc2StartDate;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_pvc2DlvDate;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_pvc2PuchOdrCd;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_pvc2VendCd;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_pvc2PuchOdrPerson;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_pvc2JobOdrCd;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_pvc2ApprPurInst;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_pvc2ApprPowerTyp;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_PROGRAM_CD;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_FUNCTION_NAME;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_BUSINESS_GROUP_CD;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_BUSINESS_CD;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_FILE_PATH;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_FILE_NAME;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_LOG_MODE_TYP;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_OUTPUT_MODE_TYP;

	/**
	 * CallSQLPUCHODRINST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * SelectSYS_BAT_PARM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="AE0030B001";

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
	public String getpvc2StartDate() { return m_pvc2StartDate; }
	public String getpvc2DlvDate() { return m_pvc2DlvDate; }
	public String getpvc2PuchOdrCd() { return m_pvc2PuchOdrCd; }
	public String getpvc2VendCd() { return m_pvc2VendCd; }
	public String getpvc2PuchOdrPerson() { return m_pvc2PuchOdrPerson; }
	public String getpvc2JobOdrCd() { return m_pvc2JobOdrCd; }
	public String getpvc2ApprPurInst() { return m_pvc2ApprPurInst; }
	public String getpvc2ApprPowerTyp() { return m_pvc2ApprPowerTyp; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getFUNCTION_NAME() { return m_FUNCTION_NAME; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_CD() { return m_BUSINESS_CD; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2StartDate(String arg) { m_pvc2StartDate = arg; }
	public void setpvc2DlvDate(String arg) { m_pvc2DlvDate = arg; }
	public void setpvc2PuchOdrCd(String arg) { m_pvc2PuchOdrCd = arg; }
	public void setpvc2VendCd(String arg) { m_pvc2VendCd = arg; }
	public void setpvc2PuchOdrPerson(String arg) { m_pvc2PuchOdrPerson = arg; }
	public void setpvc2JobOdrCd(String arg) { m_pvc2JobOdrCd = arg; }
	public void setpvc2ApprPurInst(String arg) { m_pvc2ApprPurInst = arg; }
	public void setpvc2ApprPowerTyp(String arg) { m_pvc2ApprPowerTyp = arg; }
	public void setPROGRAM_CD(String arg) { m_PROGRAM_CD = arg; }
	public void setFUNCTION_NAME(String arg) { m_FUNCTION_NAME = arg; }
	public void setBUSINESS_GROUP_CD(String arg) { m_BUSINESS_GROUP_CD = arg; }
	public void setBUSINESS_CD(String arg) { m_BUSINESS_CD = arg; }
	public void setFILE_PATH(String arg) { m_FILE_PATH = arg; }
	public void setFILE_NAME(String arg) { m_FILE_NAME = arg; }
	public void setLOG_MODE_TYP(String arg) { m_LOG_MODE_TYP = arg; }
	public void setOUTPUT_MODE_TYP(String arg) { m_OUTPUT_MODE_TYP = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getCallSQLPUCHODRINST() { return m_entity0; }
	public void setCallSQLPUCHODRINST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getSelectSYS_BAT_PARM() { return m_entity1; }
	public void setSelectSYS_BAT_PARM(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAE0030B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medAE0030B001()
	{
		// mediator�ϐ������������܂�
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2StartDate = null;
		m_pvc2DlvDate = null;
		m_pvc2PuchOdrCd = null;
		m_pvc2VendCd = null;
		m_pvc2PuchOdrPerson = null;
		m_pvc2JobOdrCd = null;
		m_pvc2ApprPurInst = null;
		m_pvc2ApprPowerTyp = null;
		m_PROGRAM_CD = null;
		m_FUNCTION_NAME = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_CD = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;

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
