/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0010/src/com/nec/jp/orteus/metamorBase/DE0010/DE0010B001/SYS_COST_CTRL.java,v $
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
 * 3.1.1.0 (2004/12/21),MySQL��Postgresql�̑Ή�
 * 3.1.0.0 (2003/07/04),StoredProcedure�Ή�
 * 3.0.0.0 (2003/03/19),mediator���|�W�g�����C��
 * 2.1.0.0 (2002/11/05),����Entity��Cache���[�h�Ή�
 * 2.0.2.0 (2002/10/15),DB2�Ή�
 * 2.0.1.0 (2002/08/05),MS SQLServer2000�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.DE0010.DE0010B001;

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
 * CLASS     : SYS_COST_CTRL �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:25:39 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class SYS_COST_CTRL extends AbstractBatchAppEntity
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

        //{{user_implement_dev:stddb_main
       
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
       
        //}}user_implement_dev:stddb_main

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

		public void setIN5_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }

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

				setIN5_R(m_med.getPLANT_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("SYS_COST_CTRL", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setPLANT_CD_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setCURRENT_YEAR_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setCURRENT_MONTH_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setTERM_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }
		public void setHALF_TERM_TYP_U(String value) throws FoundationException { getAdapt_U().setString(8, value); }
		public void setSTART_MONTH_U(String value) throws FoundationException { getAdapt_U().setString(9, value); }
		public void setIN6_U(String value) throws FoundationException { getAdapt_U().setString(10, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setPLANT_CD_U(m_med.getPLANT_CD());
				setCURRENT_YEAR_U(m_med.getCURRENT_YEAR());
				setCURRENT_MONTH_U(m_med.getCURRENT_MONTH());
				setTERM_U(m_med.getTERM());
				setHALF_TERM_TYP_U(m_med.getHALF_TERM_TYP());
				setSTART_MONTH_U(m_med.getSTART_MONTH());
				setIN6_U(m_med.getPLANT_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("SYS_COST_CTRL", "update", "���R�[�h�X�V�����ݒ菈�����s");
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

		public String getSTART_MONTH_R() throws FoundationException { return m_doRs.getString(1); }
		public String getAFTER_YEAR_R() throws FoundationException { return m_doRs.getString(2); }
		public String getAFTER_MONTH_R() throws FoundationException { return m_doRs.getString(3); }
		public String getAFTER_HALF_TERM_TYP_R() throws FoundationException { return m_doRs.getString(4); }
		public String getAFTER_TERM_R() throws FoundationException { return m_doRs.getString(5); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setSTART_MONTH(getSTART_MONTH_R());
				m_med.setAFTER_YEAR(getAFTER_YEAR_R());
				m_med.setAFTER_MONTH(getAFTER_MONTH_R());
				m_med.setAFTER_HALF_TERM_TYP(getAFTER_HALF_TERM_TYP_R());
				m_med.setAFTER_TERM(getAFTER_TERM_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("SYS_COST_CTRL", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("SYS_COST_CTRL", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
			   sSP=m_spcmd;

                //{{user_implement_dev:prepare
                 // TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_dev:prepare

		try {
			prepareCreate(sCREATE);
			prepareRead(sREAD);
			if("Oracle".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U(sUPDATE));
			} else if("Microsoft SQL Server".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_MSSQL(sUPDATE));
			} else if("PostgreSQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_PGSQL(sUPDATE));
			} else if("MySQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_MYSQL(sUPDATE));
			} else {
				prepareUpdate(objMessage.replaceSQL_U_DB2(sUPDATE));
			}
			prepareDelete(sDELETE);
			prepareSp(sSP);
		} catch(FoundationException e) {
			BatchAppException be=new BatchAppException("SYS_COST_CTRL", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("SYS_COST_CTRL", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * SYS_COST_CTRL�N���X�̕W���R���X�g���N�^
	 *
		 */
	public SYS_COST_CTRL(medDE0010B001 med, BatchAppConductor cdr) throws SystemException
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
	public medDE0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select "
+"  SYS_COST_CTRL.\"START_MONTH\" as \"START_MONTH\", "
+"  decode(mod(SYS_COST_CTRL.CURRENT_MONTH, 12) + 1, SYS_COST_CTRL.START_MONTH, SYS_COST_CTRL.CURRENT_YEAR + 1, SYS_COST_CTRL.CURRENT_YEAR) as \"AFTER_YEAR\", "
+"  mod(SYS_COST_CTRL.CURRENT_MONTH, 12) + 1 as \"AFTER_MONTH\", "
+"  floor(mod(mod(SYS_COST_CTRL.CURRENT_MONTH, 12) + 1 + 12 - SYS_COST_CTRL.START_MONTH, 12) / 6) + 1 as \"AFTER_HALF_TERM_TYP\", "
+"  decode(mod(SYS_COST_CTRL.CURRENT_MONTH, 12) + 1, SYS_COST_CTRL.START_MONTH, SYS_COST_CTRL.TERM + 1, SYS_COST_CTRL.TERM) as \"AFTER_TERM\" "
+"from "
+"  SYS_COST_CTRL "
+"where "
+"  SYS_COST_CTRL.\"PLANT_CD\" = ?";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  SYS_COST_CTRL "
+"set "
+"  \"PLANT_CD\" = ?, "
+"  \"CURRENT_YEAR\" = ?, "
+"  \"CURRENT_MONTH\" = ?, "
+"  \"TERM\" = ?, "
+"  \"HALF_TERM_TYP\" = ?, "
+"  \"START_MONTH\" = ? "
+"where "
+"  SYS_COST_CTRL.\"PLANT_CD\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}