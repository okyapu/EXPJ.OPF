/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B002/cdrAD0080B002.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B002;

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
 * CLASS     : cdrAD0080B002 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.4 $ $Date: 2015/12/22 09:52:57 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class cdrAD0080B002 extends Object
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
			m_med.setSQLOPRRSLTINTERFACE( new SQLOPRRSLTINTERFACE(m_med, m_conductor) );
			m_med.setSYS_BAT_PARM( new SYS_BAT_PARM(m_med, m_conductor) );
			m_med.setM_PLANT( new M_PLANT(m_med, m_conductor) );
			m_med.setUSER_MST( new USER_MST(m_med, m_conductor) );
			m_med.setSYS_CLASS_CODE( new SYS_CLASS_CODE(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.getSQLOPRRSLTINTERFACE() );
			m_conductor.addObject( m_med.getSYS_BAT_PARM() );
			m_conductor.addObject( m_med.getM_PLANT() );
			m_conductor.addObject( m_med.getUSER_MST() );
			m_conductor.addObject( m_med.getSYS_CLASS_CODE() );
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
			BatchAppException be=new BatchAppException("cdrAD0080B002", "beginProc", "conductor�̏��������Ɏ��s���܂���");
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
	medAD0080B002 m_med=new medAD0080B002();

	// BatchAppConductor�N���X�C���X�^���X
	BatchAppConductor m_conductor=new BatchAppConductor("AD0080B002");

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrAD0080B002�N���X �W���R���X�g���N�^
	 *
		 */
	public cdrAD0080B002() throws BatchAppException
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
