/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020B001/medAC0020B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020.AC0020B001;

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
 * CLASS     : medAC0020B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:01:34 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAC0020B001 �N���X
 * VERSION   : 1.0.0.0
 * DATE      : 2003/08/08
 * AUTHOR    : NEXS
 * HISTORY
 *           : 1.0.0.0�@2003/08/08,�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class medAC0020B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_programCd;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_functionName;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_businessGroupCd;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_businessCd;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_filePath;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_fileName;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected Integer m_logModeTyp;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected Integer m_outputModeTyp;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_plantCd;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected Integer m_managementTyp;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected Integer m_batchProcessingTyp;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected Integer m_outsideTyp;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_jobOdrCd;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected Integer m_jobOdrDetailNo;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected Integer m_entry1Typ;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected Integer m_entry2Typ;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_entryDate;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected java.util.Date m_businessOprDate;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_pvc2LogMode;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_pvc2OutputMode;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_pvc2OutputPath;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_pvc2OutputName;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_pvc2UserId;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_pvc2BusinessName;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_pvc2PlantCd;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_pvc2ManagementTyp;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_pvc2OutsideTyp;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_pvc2JobOdrCd;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_pvc2JobOdrDetailNo;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_pvc2Entry1Typ;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_pvc2Entry2Typ;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_pvc2EntryDate;

	/**
	 * readSysBatParm entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysOdReleaseCtrl entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * readSysDateCtrl entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * callSqlOdRelease entity �C���X�^���X���i�[���܂�
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
	protected String m_Progname="AC0020B001";

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

	public String getprogramCd() { return m_programCd; }
	public String getfunctionName() { return m_functionName; }
	public String getbusinessGroupCd() { return m_businessGroupCd; }
	public String getbusinessCd() { return m_businessCd; }
	public String getfilePath() { return m_filePath; }
	public String getfileName() { return m_fileName; }
	public Integer getlogModeTyp() { return m_logModeTyp; }
	public Integer getoutputModeTyp() { return m_outputModeTyp; }
	public String getplantCd() { return m_plantCd; }
	public Integer getmanagementTyp() { return m_managementTyp; }
	public Integer getbatchProcessingTyp() { return m_batchProcessingTyp; }
	public Integer getoutsideTyp() { return m_outsideTyp; }
	public String getjobOdrCd() { return m_jobOdrCd; }
	public Integer getjobOdrDetailNo() { return m_jobOdrDetailNo; }
	public Integer getentry1Typ() { return m_entry1Typ; }
	public Integer getentry2Typ() { return m_entry2Typ; }
	public String getentryDate() { return m_entryDate; }
	public java.util.Date getbusinessOprDate() { return m_businessOprDate; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpvc2ManagementTyp() { return m_pvc2ManagementTyp; }
	public String getpvc2OutsideTyp() { return m_pvc2OutsideTyp; }
	public String getpvc2JobOdrCd() { return m_pvc2JobOdrCd; }
	public String getpvc2JobOdrDetailNo() { return m_pvc2JobOdrDetailNo; }
	public String getpvc2Entry1Typ() { return m_pvc2Entry1Typ; }
	public String getpvc2Entry2Typ() { return m_pvc2Entry2Typ; }
	public String getpvc2EntryDate() { return m_pvc2EntryDate; }
	public void setprogramCd(String arg) { m_programCd = arg; }
	public void setfunctionName(String arg) { m_functionName = arg; }
	public void setbusinessGroupCd(String arg) { m_businessGroupCd = arg; }
	public void setbusinessCd(String arg) { m_businessCd = arg; }
	public void setfilePath(String arg) { m_filePath = arg; }
	public void setfileName(String arg) { m_fileName = arg; }
	public void setlogModeTyp(Integer arg) { m_logModeTyp = arg; }
	public void setoutputModeTyp(Integer arg) { m_outputModeTyp = arg; }
	public void setplantCd(String arg) { m_plantCd = arg; }
	public void setmanagementTyp(Integer arg) { m_managementTyp = arg; }
	public void setbatchProcessingTyp(Integer arg) { m_batchProcessingTyp = arg; }
	public void setoutsideTyp(Integer arg) { m_outsideTyp = arg; }
	public void setjobOdrCd(String arg) { m_jobOdrCd = arg; }
	public void setjobOdrDetailNo(Integer arg) { m_jobOdrDetailNo = arg; }
	public void setentry1Typ(Integer arg) { m_entry1Typ = arg; }
	public void setentry2Typ(Integer arg) { m_entry2Typ = arg; }
	public void setentryDate(String arg) { m_entryDate = arg; }
	public void setbusinessOprDate(java.util.Date arg) { m_businessOprDate = arg; }
	public void setpvc2LogMode(String arg) { m_pvc2LogMode = arg; }
	public void setpvc2OutputMode(String arg) { m_pvc2OutputMode = arg; }
	public void setpvc2OutputPath(String arg) { m_pvc2OutputPath = arg; }
	public void setpvc2OutputName(String arg) { m_pvc2OutputName = arg; }
	public void setpvc2UserId(String arg) { m_pvc2UserId = arg; }
	public void setpvc2BusinessName(String arg) { m_pvc2BusinessName = arg; }
	public void setpvc2PlantCd(String arg) { m_pvc2PlantCd = arg; }
	public void setpvc2ManagementTyp(String arg) { m_pvc2ManagementTyp = arg; }
	public void setpvc2OutsideTyp(String arg) { m_pvc2OutsideTyp = arg; }
	public void setpvc2JobOdrCd(String arg) { m_pvc2JobOdrCd = arg; }
	public void setpvc2JobOdrDetailNo(String arg) { m_pvc2JobOdrDetailNo = arg; }
	public void setpvc2Entry1Typ(String arg) { m_pvc2Entry1Typ = arg; }
	public void setpvc2Entry2Typ(String arg) { m_pvc2Entry2Typ = arg; }
	public void setpvc2EntryDate(String arg) { m_pvc2EntryDate = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBatParm() { return m_entity0; }
	public void setreadSysBatParm(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysOdReleaseCtrl() { return m_entity1; }
	public void setreadSysOdReleaseCtrl(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getreadSysDateCtrl() { return m_entity2; }
	public void setreadSysDateCtrl(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getcallSqlOdRelease() { return m_entity3; }
	public void setcallSqlOdRelease(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAC0020B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medAC0020B001()
	{
		// mediator�ϐ������������܂�
		m_programCd = null;
		m_functionName = null;
		m_businessGroupCd = null;
		m_businessCd = null;
		m_filePath = null;
		m_fileName = null;
		m_logModeTyp = null;
		m_outputModeTyp = null;
		m_plantCd = null;
		m_managementTyp = null;
		m_batchProcessingTyp = null;
		m_outsideTyp = null;
		m_jobOdrCd = null;
		m_jobOdrDetailNo = null;
		m_entry1Typ = null;
		m_entry2Typ = null;
		m_entryDate = null;
		m_businessOprDate = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2ManagementTyp = null;
		m_pvc2OutsideTyp = null;
		m_pvc2JobOdrCd = null;
		m_pvc2JobOdrDetailNo = null;
		m_pvc2Entry1Typ = null;
		m_pvc2Entry2Typ = null;
		m_pvc2EntryDate = null;

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
