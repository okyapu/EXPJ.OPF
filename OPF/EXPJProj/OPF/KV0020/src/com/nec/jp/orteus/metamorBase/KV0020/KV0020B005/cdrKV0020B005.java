/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/cdrKV0020B005.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

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
 * CLASS     : cdrKV0020B005 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:55:59 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class cdrKV0020B005 extends Object
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
			m_med.setT_INSPC_ACPT_INFO_IF( new T_INSPC_ACPT_INFO_IF(m_med, m_conductor) );
			m_med.setchkSysInstallOptions( new chkSysInstallOptions(m_med, m_conductor) );
			m_med.setgetCompanyInfo( new getCompanyInfo(m_med, m_conductor) );
			m_med.setgetPlantCd( new getPlantCd(m_med, m_conductor) );
			m_med.setgetBusinessOprDate( new getBusinessOprDate(m_med, m_conductor) );
			m_med.setgetHomeCurCd( new getHomeCurCd(m_med, m_conductor) );
			m_med.setT_INSPC_ACPT_INFO_IF_1( new T_INSPC_ACPT_INFO_IF_1(m_med, m_conductor) );
			m_med.setT_ERR_WNG_LST( new T_ERR_WNG_LST(m_med, m_conductor) );
			m_med.setT_SHIP_ODR( new T_SHIP_ODR(m_med, m_conductor) );
			m_med.setT_SHIP( new T_SHIP(m_med, m_conductor) );
			m_med.setT_SALES( new T_SALES(m_med, m_conductor) );
			m_med.setT_ITEM_STOCK( new T_ITEM_STOCK(m_med, m_conductor) );
			m_med.setT_RCV_ISSUE( new T_RCV_ISSUE(m_med, m_conductor) );
			m_med.setM_CUST( new M_CUST(m_med, m_conductor) );
			m_med.setM_ITEM( new M_ITEM(m_med, m_conductor) );
			m_med.setM_UNIT_COST( new M_UNIT_COST(m_med, m_conductor) );
			m_med.setM_CUST_BASE( new M_CUST_BASE(m_med, m_conductor) );
			m_med.setM_CUR( new M_CUR(m_med, m_conductor) );
			m_med.setM_EXCH_RATE( new M_EXCH_RATE(m_med, m_conductor) );
			m_med.setM_WH( new M_WH(m_med, m_conductor) );
			m_med.setM_ITEM_SPEC( new M_ITEM_SPEC(m_med, m_conductor) );
			m_med.setinFikeConvert( new inFikeConvert(m_med, m_conductor) );
			m_med.setM_TAX( new M_TAX(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.getT_INSPC_ACPT_INFO_IF() );
			m_conductor.addObject( m_med.getchkSysInstallOptions() );
			m_conductor.addObject( m_med.getgetCompanyInfo() );
			m_conductor.addObject( m_med.getgetPlantCd() );
			m_conductor.addObject( m_med.getgetBusinessOprDate() );
			m_conductor.addObject( m_med.getgetHomeCurCd() );
			m_conductor.addObject( m_med.getT_INSPC_ACPT_INFO_IF_1() );
			m_conductor.addObject( m_med.getT_ERR_WNG_LST() );
			m_conductor.addObject( m_med.getT_SHIP_ODR() );
			m_conductor.addObject( m_med.getT_SHIP() );
			m_conductor.addObject( m_med.getT_SALES() );
			m_conductor.addObject( m_med.getT_ITEM_STOCK() );
			m_conductor.addObject( m_med.getT_RCV_ISSUE() );
			m_conductor.addObject( m_med.getM_CUST() );
			m_conductor.addObject( m_med.getM_ITEM() );
			m_conductor.addObject( m_med.getM_UNIT_COST() );
			m_conductor.addObject( m_med.getM_CUST_BASE() );
			m_conductor.addObject( m_med.getM_CUR() );
			m_conductor.addObject( m_med.getM_EXCH_RATE() );
			m_conductor.addObject( m_med.getM_WH() );
			m_conductor.addObject( m_med.getM_ITEM_SPEC() );
			m_conductor.addObject( m_med.getinFikeConvert() );
			m_conductor.addObject( m_med.getM_TAX() );
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
          BatchAppException be=new BatchAppException("cdrKV0020B005", "beginProc", "conductor�̏��������Ɏ��s���܂���");
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
	medKV0020B005 m_med=new medKV0020B005();

	// BatchAppConductor�N���X�C���X�^���X
	BatchAppConductor m_conductor=new BatchAppConductor("KV0020B005");

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrKV0020B005�N���X �W���R���X�g���N�^
	 *
		 */
	public cdrKV0020B005() throws BatchAppException
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
