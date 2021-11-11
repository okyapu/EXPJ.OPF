/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070B001/medAH0070B001.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070.AH0070B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
//}}user_implement_dev:import

/**
 * CLASS     : medAH0070B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $ $Date: 2014/11/05 07:13:47 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : medAH0070B001 �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2004/1/13),�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class medAH0070B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_USER_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_APR_INV_CTRL;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_APPR_FLG;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_INV_DATE;

	/**
	 * USER_MST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * M_PLANT entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * SYS_TYPE_VALUE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * T_INV_CTRL entity �C���X�^���X���i�[���܂�
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
	protected String m_Progname="AH0070B001";

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

	public String getUSER_CD() { return m_USER_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getAPR_INV_CTRL() { return m_APR_INV_CTRL; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getINV_DATE() { return m_INV_DATE; }
	public void setUSER_CD(String arg) { m_USER_CD = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setAPR_INV_CTRL(String arg) { m_APR_INV_CTRL = arg; }
	public void setAPPR_FLG(String arg) { m_APPR_FLG = arg; }
	public void setINV_DATE(String arg) { m_INV_DATE = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getUSER_MST() { return m_entity0; }
	public void setUSER_MST(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getM_PLANT() { return m_entity1; }
	public void setM_PLANT(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getSYS_TYPE_VALUE() { return m_entity2; }
	public void setSYS_TYPE_VALUE(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity getT_INV_CTRL() { return m_entity3; }
	public void setT_INV_CTRL(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAH0070B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medAH0070B001()
	{
		// mediator�ϐ������������܂�
		m_USER_CD = null;
		m_PLANT_CD = null;
		m_APR_INV_CTRL = null;
		m_APPR_FLG = null;
		m_INV_DATE = null;

               //{{user_implement_dev:constractor
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
        //}}user_implement_dev:original

	//////////////////////////////

}
