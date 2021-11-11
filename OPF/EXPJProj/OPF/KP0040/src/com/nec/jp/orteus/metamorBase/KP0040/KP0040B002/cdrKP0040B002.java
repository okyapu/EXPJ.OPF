/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B002/cdrKP0040B002.java,v $
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
 *                     ,EXPLANNER/J�p�ɉ���
 * 3.0.0.0 (2003/03/19),ManageContainer�R���X�g���N�^�C��
 * 2.0.0.1 (2002/10/18),user implements lavel���C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B002;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.ba.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.wa.*;

import java.util.*;
import java.io.*;

//{{user_implement_dev:import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

/**
 * CLASS     : cdrKP0040B002 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.14 $ $Date: 2015/12/03 08:53:25 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class cdrKP0040B002 extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	public void initialize() throws BatchAppException, SystemException
	{
		try {
			m_container = new ManageContainer();

			// db�ڑ����擾���܂�
			IManageConnection defaultMgr=m_container.findBatchConnection("default"),
						  transactionMgr=m_container.findBatchConnection("transaction");

			m_conductor.setConnection(defaultMgr.getConnection(), transactionMgr.getConnection());

			// entity�Acontrol�C���X�^���X��V�K�쐬/�ǉ����܂�
			m_med.setreadSysBusinessMessage( new readSysBusinessMessage(m_med, m_conductor) );
			m_med.setT_ODR_INFO_EDI_IF( new T_ODR_INFO_EDI_IF(m_med, m_conductor) );
			m_med.setinsertT_SALES_PLAN( new insertT_SALES_PLAN(m_med, m_conductor) );
			m_med.setgetCUSTinfo( new getCUSTinfo(m_med, m_conductor) );
			m_med.setgetITEMinfo( new getITEMinfo(m_med, m_conductor) );
			m_med.setgetM_CUST_BASEinfoWhenNoC( new getM_CUST_BASEinfoWhenNoC(m_med, m_conductor) );
			m_med.setgetCOMPANY_CD( new getCOMPANY_CD(m_med, m_conductor) );
			m_med.setcheckPLN_STR_DATE( new checkPLN_STR_DATE(m_med, m_conductor) );
			m_med.setcheckPLN_END_DATE( new checkPLN_END_DATE(m_med, m_conductor) );
			m_med.setgetSEQ_SALES_PLAN_CD( new getSEQ_SALES_PLAN_CD(m_med, m_conductor) );
			m_med.setwriteErrWngLst( new writeErrWngLst(m_med, m_conductor) );
			m_med.setgetSEQ_ERR_WNG_LST( new getSEQ_ERR_WNG_LST(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.getreadSysBusinessMessage() );
			m_conductor.addObject( m_med.getT_ODR_INFO_EDI_IF() );
			m_conductor.addObject( m_med.getinsertT_SALES_PLAN() );
			m_conductor.addObject( m_med.getgetCUSTinfo() );
			m_conductor.addObject( m_med.getgetITEMinfo() );
			m_conductor.addObject( m_med.getgetM_CUST_BASEinfoWhenNoC() );
			m_conductor.addObject( m_med.getgetCOMPANY_CD() );
			m_conductor.addObject( m_med.getcheckPLN_STR_DATE() );
			m_conductor.addObject( m_med.getcheckPLN_END_DATE() );
			m_conductor.addObject( m_med.getgetSEQ_SALES_PLAN_CD() );
			m_conductor.addObject( m_med.getwriteErrWngLst() );
			m_conductor.addObject( m_med.getgetSEQ_ERR_WNG_LST() );
			m_conductor.addObject( m_med.getCtrlMain() );

			// �f�[�^�Q�Ə�����ǉ����܂�

			// �f�[�^���H������ǉ����܂�
			m_conductor.addControl( m_med.getCtrlMain() );

			// �f�[�^�X�V������ǉ����܂�
		} catch(FoundationException e) {
			throw new SystemException("SYSERR", "�ڑ����̎擾�Ɏ��s���܂���", null, null, e);
		}

		return;
	}

	//////////////////////////////

	// commit��rollback�����w�����܂�
	static boolean m_doCommit=true;

	/**
	 * �ŏI�I��commit���邩rollback���邩���w�����܂�
	 *
	 * @param doCommit true .. commit���܂��Afalse .. rollback���܂�
	 */
	public static void setCommitFlag(boolean doCommit) { m_doCommit = doCommit; }

	//////////////////////////////

	/**
	 * �N���X�^��Ԃ��܂�
	 *
	 * @return �N���X�^
	 */
	public int getType() { return m_conductor.getType(); }

        //{{user_implement_dev:conductor

	/**
	 * �����������s���܂�
	 */
	public int beginProc() throws BatchAppException
	{
		try {
			if(m_container.getBatchString("batchUser") != null) {
				m_med.setUsername(m_container.getBatchString("batchUser"));
			}
			m_conductor.beginTrans();
			return m_conductor.beginProc();
		} catch(BatchAppException e) {
			setCommitFlag(false);
			throw e;
		} catch(FoundationException e) {
			setCommitFlag(false);
			BatchAppException be=new BatchAppException("cdrKP0040B002", "beginProc", "conductor�̏��������Ɏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		}
	}

	/**
	 * �o�b�`���������s���܂�
	 */
	public int execute() throws BatchAppException
	{
		try {
			return m_conductor.execute();
		} catch(BatchAppException e) {
			setCommitFlag(false);
			throw e;
		}
	}

	/**
	 * �I���������s���܂�
	 */
	public int endProc() throws SystemException
	{
		int ret;

		try {
			ret = m_conductor.endProc();
		} catch(BatchAppException e) {
			setCommitFlag(false);
			m_conductor.rollback();
			throw new SystemException("SYSERR", "�I���������s", null, null, e);
		}

		if(m_doCommit==true) {
			m_conductor.commit();
		} else {
			m_conductor.rollback();
		}

		return ret;
	}

        //}}user_implement_dev:conductor

	//////////////////////////////

	// �R���e�i�N���X�C���X�^���X
	ManageContainer m_container;

	// mediator�̃C���X�^���X���i�[����
	medKP0040B002 m_med=new medKP0040B002();

	// BatchAppConductor�N���X�C���X�^���X
	BatchAppConductor m_conductor=new BatchAppConductor("KP0040B002");

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrKP0040B002�N���X �W���R���X�g���N�^
	 *
		 */
	public cdrKP0040B002() throws BatchAppException
	{
		initialize();

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
		objMessage=null;
		return;
	}

	//////////////////////////////

}
