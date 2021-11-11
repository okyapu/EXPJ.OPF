/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/cdrKQ0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
 * CLASS     : cdrKQ0010B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:35 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : cdrKQ0010B001 �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/11/29),�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class cdrKQ0010B001 extends Object
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
			m_med.settbl_T_ODR( new tbl_T_ODR(m_med, m_conductor) );
			m_med.settbl_T_ODR_CTL( new tbl_T_ODR_CTL(m_med, m_conductor) );
			m_med.settbl_T_ODR_ACPT_RSLT( new tbl_T_ODR_ACPT_RSLT(m_med, m_conductor) );
			m_med.settbl_T_ANS_DLV_DATE( new tbl_T_ANS_DLV_DATE(m_med, m_conductor) );
			m_med.settbl_T_ALLOC_FIXED_ODR_RSLT( new tbl_T_ALLOC_FIXED_ODR_RSLT(m_med, m_conductor) );
			m_med.settbl_M_CUST( new tbl_M_CUST(m_med, m_conductor) );
			m_med.settbl_M_CUR( new tbl_M_CUR(m_med, m_conductor) );
			m_med.settbl_M_CUST_BASE( new tbl_M_CUST_BASE(m_med, m_conductor) );
			m_med.settbl_M_ITEM( new tbl_M_ITEM(m_med, m_conductor) );
			m_med.settbl_M_ITEM_SPEC( new tbl_M_ITEM_SPEC(m_med, m_conductor) );
			m_med.settbl_M_UNIT_COST( new tbl_M_UNIT_COST(m_med, m_conductor) );
			m_med.setgetUserInfo( new getUserInfo(m_med, m_conductor) );
			m_med.setgetGyomuDate( new getGyomuDate(m_med, m_conductor) );
			m_med.setgetSEQ_ODR( new getSEQ_ODR(m_med, m_conductor) );
			m_med.setgetSEQ_ODR_CTL( new getSEQ_ODR_CTL(m_med, m_conductor) );
			m_med.setgetSEQ_RSLT_ODR( new getSEQ_RSLT_ODR(m_med, m_conductor) );
			m_med.setgetCompanyInfo( new getCompanyInfo(m_med, m_conductor) );
			m_med.setnaiji_T_ODR( new naiji_T_ODR(m_med, m_conductor) );
			m_med.setINDATA( new INDATA(m_med, m_conductor) );
			m_med.setreadSysBusinessMessage( new readSysBusinessMessage(m_med, m_conductor) );
			m_med.setwriteErrWngLst( new writeErrWngLst(m_med, m_conductor) );
			m_med.setgetSEQ_ERR_WNG_LST( new getSEQ_ERR_WNG_LST(m_med, m_conductor) );
			m_med.settbl_M_CUST_BASE_check( new tbl_M_CUST_BASE_check(m_med, m_conductor) );
			m_med.setnaiji_T_ODR_hinban( new naiji_T_ODR_hinban(m_med, m_conductor) );
			m_med.setgetSYS_CLASS_CODE( new getSYS_CLASS_CODE(m_med, m_conductor) );
			m_med.setgetSYS_HOME_CUR( new getSYS_HOME_CUR(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.gettbl_T_ODR() );
			m_conductor.addObject( m_med.gettbl_T_ODR_CTL() );
			m_conductor.addObject( m_med.gettbl_T_ODR_ACPT_RSLT() );
			m_conductor.addObject( m_med.gettbl_T_ANS_DLV_DATE() );
			m_conductor.addObject( m_med.gettbl_T_ALLOC_FIXED_ODR_RSLT() );
			m_conductor.addObject( m_med.gettbl_M_CUST() );
			m_conductor.addObject( m_med.gettbl_M_CUR() );
			m_conductor.addObject( m_med.gettbl_M_CUST_BASE() );
			m_conductor.addObject( m_med.gettbl_M_ITEM() );
			m_conductor.addObject( m_med.gettbl_M_ITEM_SPEC() );
			m_conductor.addObject( m_med.gettbl_M_UNIT_COST() );
			m_conductor.addObject( m_med.getgetUserInfo() );
			m_conductor.addObject( m_med.getgetGyomuDate() );
			m_conductor.addObject( m_med.getgetSEQ_ODR() );
			m_conductor.addObject( m_med.getgetSEQ_ODR_CTL() );
			m_conductor.addObject( m_med.getgetSEQ_RSLT_ODR() );
			m_conductor.addObject( m_med.getgetCompanyInfo() );
			m_conductor.addObject( m_med.getnaiji_T_ODR() );
			m_conductor.addObject( m_med.getINDATA() );
			m_conductor.addObject( m_med.getreadSysBusinessMessage() );
			m_conductor.addObject( m_med.getwriteErrWngLst() );
			m_conductor.addObject( m_med.getgetSEQ_ERR_WNG_LST() );
			m_conductor.addObject( m_med.gettbl_M_CUST_BASE_check() );
			m_conductor.addObject( m_med.getnaiji_T_ODR_hinban() );
			m_conductor.addObject( m_med.getgetSYS_CLASS_CODE() );
			m_conductor.addObject( m_med.getgetSYS_HOME_CUR() );
			m_conductor.addObject( m_med.getCtrlMain() );

			// �f�[�^�Q�Ə�����ǉ����܂�
			m_conductor.addInputEntity( m_med.getgetSYS_HOME_CUR() );

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
			BatchAppException be=new BatchAppException("cdrKQ0010B001", "beginProc", "conductor�̏��������Ɏ��s���܂���");
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
	medKQ0010B001 m_med=new medKQ0010B001();

	// BatchAppConductor�N���X�C���X�^���X
	BatchAppConductor m_conductor=new BatchAppConductor("KQ0010B001");

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrKQ0010B001�N���X �W���R���X�g���N�^
	 *
		 */
	public cdrKQ0010B001() throws BatchAppException
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
