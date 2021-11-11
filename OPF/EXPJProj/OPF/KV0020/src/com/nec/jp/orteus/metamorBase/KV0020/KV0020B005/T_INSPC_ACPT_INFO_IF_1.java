/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/T_INSPC_ACPT_INFO_IF_1.java,v $
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
 * 3.1.0.1 (2003/10/30),Stored Procedure��Q�Ή�
 * 3.1.0.0 (2003/06/24),Stored Procedure�Ή�
 * 3.0.0.0 (2003/03/19),mediator���|�W�g�����C��
 * 2.1.0.0 (2002/11/05),����Entity��Cache���[�h�Ή�
 * 2.0.2.0 (2002/10/15),DB2�Ή�
 * 2.0.1.0 (2002/08/05),MS SQLServer2000�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;
import com.nec.jp.orteus.xaf.wa.*;

import java.lang.Number.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

/**
 * CLASS     : T_INSPC_ACPT_INFO_IF_1 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:55:57 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_INSPC_ACPT_INFO_IF_1 extends AbstractBatchAppEntity
{

	//////////////////////////////

	/**
	 * create()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canCreate() { return false; }

	/**
	 * read()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canRead() { return true; }

	/**
	 * update()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canUpdate() { return true; }

	/**
	 * delete()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canDelete() { return false; }

	/**
	 * call()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canCall() { return false; }

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	//{{user_implement_dev:db_main
       
        /**
         * ��������
         *
         * @return <<�R�����g���L�q���Ă�������>>
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int beginProc() throws BatchAppException
        {
         return m_entity.beginProc();
        }
       
        /**
         * �I������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int endProc() throws BatchAppException
        {
         return m_entity.endProc();
        }
       
        /**
         * �c�a�A�N�Z�X���������s���܂�
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int execute() throws BatchAppException
        {
         return m_entity.execute();
        }
       
        /**
         * ���R�[�h�V�K�ǉ�����
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int create() throws BatchAppException
        {
         return m_entity.create();
        }
       
        /**
         * �f�[�^�Ǐo������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int read() throws BatchAppException
        {
         return m_entity.read();
        }
       
        /**
         * �f�[�^�X�V����
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int update() throws BatchAppException
        {
         return m_entity.update();
        }
       
        /**
         * �f�[�^�폜����
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int delete() throws BatchAppException
        {
         return m_entity.delete();
        }
       
        /**
         * Stored Procedure����
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public List call() throws BatchAppException
        {
         return m_entity.call();
        }
       
        /**
         * �J�����g���R�[�h�ɑ΂��ăA�N�Z�X����
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public boolean next() throws BatchAppException
        {
         return m_entity.next();
        }
       
        /**
         * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public boolean hasRecord(boolean moveCursor) throws BatchAppException
        {
         return m_entity.hasRecord(moveCursor);
        }
       
        //}}user_implement_dev:db_main

	//{{entity_class(wizard code)

	//////////////////////////////

	class interEntity
	{

		//////////////////////////////

		// Cache���[�h
		private boolean bCachemode = true;
		public boolean getCacheMode() { return bCachemode; }
		public void setCacheMode( boolean bFlag ) { bCachemode = bFlag; }

		// DB���R�[�h�R���N�V�����N���X �C���X�^���X
		protected IDbRecordset m_doRs=null;
		// ���t�N���X�C���X�^���X
		public java.sql.Date m_dat=null;

		//////////////////////////////

		public int beginProc() throws BatchAppException
		{
			// SQL����prepare���܂�
			prepareAll();

			return SUCCESS;
		}

		public int endProc() throws BatchAppException
		{

			clearAll();

			return SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret = SUCCESS;


			return ret;
		}

		public int create() throws BatchAppException
		{
			return BREAK;
		}


		public int read() throws BatchAppException
		{
			return read(bCachemode);
		}

		public int read(boolean cache) throws BatchAppException
		{
			try {
				if(m_doRs!=null) {
					m_doRs.close();
					m_doRs = null;
				}

			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setSYSTEM_PROC_TYP_U(String value) throws FoundationException { getAdapt_U().setString(1, value); }
		public void setIN1_U(String value) throws FoundationException { getAdapt_U().setString(2, value); }

		public int update() throws BatchAppException
		{
			try {
				setSYSTEM_PROC_TYP_U(m_med.getSYSTEM_PROC_TYP());
				setIN1_U(m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "update", "���R�[�h�X�V�����ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeUpdate();

			return SUCCESS;
		}

		public int delete() throws BatchAppException
		{
			return BREAK;
		}

		public List call() throws BatchAppException
		{
			return null;
		}

		public String getINSPC_ACPT_INFO_IF_CTRL_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getINSPC_ACPT_AMOUNT_R() throws FoundationException { return m_doRs.getString(2); }
		public String getINSPC_ACPT_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getString(3); }
		public String getINSPC_ACPT_UNIT_PRICE_R() throws FoundationException { return m_doRs.getString(4); }
		public String getINSPC_ACPT_QTY_R() throws FoundationException { return m_doRs.getString(5); }
		public String getINSPC_ACPT_DATE_R() throws FoundationException { return m_doRs.getString(6); }
		public String getCUST_ODR_CD_R() throws FoundationException { return m_doRs.getString(7); }
		public String getUNIT_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getDLV_CD_R() throws FoundationException { return m_doRs.getString(9); }
		public String getDLV_KEY_CD_R() throws FoundationException { return m_doRs.getString(10); }
		public String getDLV_LOC_CD_R() throws FoundationException { return m_doRs.getString(11); }
		public String getCLIENT_CD_R() throws FoundationException { return m_doRs.getString(12); }
		public String getCUST_ITEM_CD_R() throws FoundationException { return m_doRs.getString(13); }
		public String getSLIP_CD_R() throws FoundationException { return m_doRs.getString(14); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setINSPC_ACPT_INFO_IF_CTRL_NO(getINSPC_ACPT_INFO_IF_CTRL_NO_R());
				m_med.setINSPC_ACPT_AMOUNT(getINSPC_ACPT_AMOUNT_R());
				m_med.setINSPC_ACPT_AMOUNT_EXCH_RATES(getINSPC_ACPT_AMOUNT_EXCH_RATES_R());
				m_med.setINSPC_ACPT_UNIT_PRICE(getINSPC_ACPT_UNIT_PRICE_R());
				m_med.setINSPC_ACPT_QTY(getINSPC_ACPT_QTY_R());
				m_med.setINSPC_ACPT_DATE(getINSPC_ACPT_DATE_R());
				m_med.setCUST_ODR_CD(getCUST_ODR_CD_R());
				m_med.setUNIT_CD(getUNIT_CD_R());
				m_med.setDLV_CD(getDLV_CD_R());
				m_med.setDLV_KEY_CD(getDLV_KEY_CD_R());
				m_med.setDLV_LOC_CD(getDLV_LOC_CD_R());
				m_med.setCLIENT_CD(getCLIENT_CD_R());
				m_med.setCUST_ITEM_CD(getCUST_ITEM_CD_R());
				m_med.setINSPC_ACPT_SLIP_CD(getSLIP_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "next", "���R�[�h�ړ����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			return true;
		}

		public boolean hasRecord(boolean moveCursor) throws BatchAppException
		{
			if(read(false)!=SUCCESS) return false;

			try {
				boolean ret;

				if(moveCursor) {
					ret = next();
				} else {
					ret = m_doRs.next();
				}

				m_doRs.close();
				m_doRs = null;

				return ret;
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "hasRecord", "���R�[�h���݃`�F�b�N���s");
				be.addMessage(e.getErrmsg());
				throw be;
			}
		}

		//////////////////////////////

	}

	//}}entity_class(wizard code)

	//////////////////////////////

	/**
	 * DB�ɑ΂��Đڑ����܂�
	 */
	void open() throws SystemException
	{
		try {
			setConnection( m_conductor.m_transactionConn );
		} catch(BatchAppException e) {
			throw new SystemException("SYSERR", "�R�l�N�V�����̐ݒ�Ɏ��s���܂���", null, null, e);
		}

		return;
	}

	/**
	 * SQL����prepare���܂�
	 *
		 */
	void prepareAll() throws BatchAppException
	{
		String sCREATE=m_inscmd,
			   sREAD=m_selcmd,
			   sUPDATE=m_updcmd,
			   sDELETE=m_delcmd,
			   sSP=m_calcmd;

		//{{user_implement_dev:prepare
                 // TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_dev:prepare

		prepareCreate(sCREATE);
		prepareRead(sREAD);
		prepareUpdate(sUPDATE);
		prepareDelete(sDELETE);
		prepareSp(sSP);
		return;
	}

	//////////////////////////////

	/**
	 * T_INSPC_ACPT_INFO_IF_1�N���X�̕W���R���X�g���N�^
	 *
		 */
	public T_INSPC_ACPT_INFO_IF_1(medKV0020B005 med, BatchAppConductor cdr) throws SystemException
	{
		//{{user_implement_dev:constractor
                 // TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_dev:constractor

		try {
			m_container = new ManageContainer();
		} catch(FoundationException e) {
			throw new SystemException("SYSERR", "�R���e�i�ڑ��Ɏ��s���܂���", null, null, e);
		}

		m_med = med;
		m_conductor = cdr;

		// DB�ɐڑ����܂�
		open();

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	protected void finalize()
	{
		try {
			// DB�ڑ���ؒf���܂�
			close();
		} catch(BatchAppException e) {
			System.out.println(e.getErrmsg());
		}

		// �e�����o�ϐ��̏�����
		m_med = null;
		objMessage = null;

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	//////////////////////////////

	ManageContainer m_container;

	// mediator�N���X �C���X�^���X
	public medKV0020B005 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select INSPC_ACPT_INFO_IF_CTRL_NO "
+"     , INSPC_ACPT_AMOUNT "
+"     , INSPC_ACPT_AMOUNT_EXCH_RATES "
+"     , INSPC_ACPT_UNIT_PRICE "
+"     , INSPC_ACPT_QTY "
+"     , INSPC_ACPT_DATE "
+"     , rtrim(CUST_ODR_CD) "
+"     , rtrim(UNIT_CD) "
+"     , rtrim(DLV_CD) "
+"     , rtrim(DLV_KEY_CD) "
+"     , rtrim(DLV_LOC_CD) "
+"     , rtrim(CLIENT_CD) "
+"     , rtrim(CUST_ITEM_CD) "
+"     , rtrim(SLIP_CD) "
+"from   T_INSPC_ACPT_INFO_IF "
+"where  SYSTEM_PROC_TYP      = '0' "
+"   and DEL_FLG              = '0' "
+"";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  T_INSPC_ACPT_INFO_IF "
+"set "
+"  \"SYSTEM_PROC_TYP\" = ?, "
+"  \"MODIFY_COUNT\" = MODIFY_COUNT + 1 "
+"where "
+"  T_INSPC_ACPT_INFO_IF.\"INSPC_ACPT_INFO_IF_CTRL_NO\" = ?";
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
