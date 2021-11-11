/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0010/src/com/nec/jp/orteus/metamorBase/DB0010/DB0010B001/T_ITEM_CS_PROC_IF.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0010.DB0010B001;

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
 * CLASS     : T_ITEM_CS_PROC_IF �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:20:42 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_ITEM_CS_PROC_IF extends AbstractBatchAppEntity
{

	//////////////////////////////

	/**
	 * create()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canCreate() { return true; }

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

		public void setPLANT_CD_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setCS_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setCS_PROC_NAME_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setWS_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setOUTSIDE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setVEND_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setSTD_COST_OF_MONTH_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setCLASIFICATION_CD_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setCOMPANY_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setONEROUS_CONS_FLG_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setSAVE_UPDATED_DATE_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setTRANSACTION_TYP_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setPLANT_CD_C(m_med.getPLANT_CD());
				setITEM_CD_C(m_med.getITEM_CD());
				setCS_PROC_CD_C(m_med.getPROC_CD());
				setCS_PROC_NAME_C(m_med.getPROC_NAME());
				setWS_CD_C(m_med.getWS_CD());
				setOUTSIDE_TYP_C(m_med.getOUTSIDE_TYP());
				setVEND_CD_C(m_med.getVEND_CD());
				setSTD_COST_OF_MONTH_C(m_med.getSTD_COST_OF_MONTH());
				setCLASIFICATION_CD_C(m_med.getCLASIFICATION_CD());
				setCOMPANY_CD_C(m_med.getCOMPANY_CD());
				setORG_CD_C(m_med.getORG_CD());
				setONEROUS_CONS_FLG_C(m_med.getONEROUS_CONS_FLG());
				setSAVE_UPDATED_DATE_C(m_med.getUPDATED_DATE());
				setTRANSACTION_TYP_C(m_med.getTRANSACTION_TYP());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "create", "���R�[�h�V�K�ǉ��p�����[�^�ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public void setIN15_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }

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

				setIN15_R(m_med.getPLANT_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setPLANT_CD_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setITEM_CD_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setCS_PROC_CD_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setCS_PROC_NAME_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }
		public void setWS_CD_U(String value) throws FoundationException { getAdapt_U().setString(8, value); }
		public void setOUTSIDE_TYP_U(String value) throws FoundationException { getAdapt_U().setString(9, value); }
		public void setVEND_CD_U(String value) throws FoundationException { getAdapt_U().setString(10, value); }
		public void setSTD_COST_OF_MONTH_U(String value) throws FoundationException { getAdapt_U().setString(11, value); }
		public void setCLASIFICATION_CD_U(String value) throws FoundationException { getAdapt_U().setString(12, value); }
		public void setCOMPANY_CD_U(String value) throws FoundationException { getAdapt_U().setString(13, value); }
		public void setORG_CD_U(String value) throws FoundationException { getAdapt_U().setString(14, value); }
		public void setONEROUS_CONS_FLG_U(String value) throws FoundationException { getAdapt_U().setString(15, value); }
		public void setSAVE_UPDATED_DATE_U(String value) throws FoundationException { getAdapt_U().setString(16, value); }
		public void setTRANSACTION_TYP_U(String value) throws FoundationException { getAdapt_U().setString(17, value); }
		public void setIN14_U(String value) throws FoundationException { getAdapt_U().setString(18, value); }
		public void setIN15_U(String value) throws FoundationException { getAdapt_U().setString(19, value); }
		public void setIN16_U(String value) throws FoundationException { getAdapt_U().setString(20, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setPLANT_CD_U(m_med.getPLANT_CD());
				setITEM_CD_U(m_med.getITEM_CD());
				setCS_PROC_CD_U(m_med.getPROC_CD());
				setCS_PROC_NAME_U(m_med.getPROC_NAME());
				setWS_CD_U(m_med.getWS_CD());
				setOUTSIDE_TYP_U(m_med.getOUTSIDE_TYP());
				setVEND_CD_U(m_med.getVEND_CD());
				setSTD_COST_OF_MONTH_U(m_med.getSTD_COST_OF_MONTH());
				setCLASIFICATION_CD_U(m_med.getCLASIFICATION_CD());
				setCOMPANY_CD_U(m_med.getCOMPANY_CD());
				setORG_CD_U(m_med.getORG_CD());
				setONEROUS_CONS_FLG_U(m_med.getONEROUS_CONS_FLG());
				setSAVE_UPDATED_DATE_U(m_med.getUPDATED_DATE());
				setTRANSACTION_TYP_U(m_med.getTRANSACTION_TYP());
				setIN14_U(m_med.getPLANT_CD());
				setIN15_U(m_med.getITEM_CD());
				setIN16_U(m_med.getCS_PROC_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "update", "���R�[�h�X�V�����ݒ菈�����s");
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

		public String getPLANT_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getCS_PROC_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getRCY_TYP_CD_R() throws FoundationException { return m_doRs.getString(4); }
		public String getCS_PROC_NAME_R() throws FoundationException { return m_doRs.getString(5); }
		public String getWS_CD_R() throws FoundationException { return m_doRs.getString(6); }
		public String getOUTSIDE_TYP_R() throws FoundationException { return m_doRs.getString(7); }
		public String getVEND_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getSTD_COST_OF_MONTH_R() throws FoundationException { return m_doRs.getString(9); }
		public String getSTD_COST_UNIT_TYP_R() throws FoundationException { return m_doRs.getString(10); }
		public String getCLASIFICATION_CD_R() throws FoundationException { return m_doRs.getString(11); }
		public String getTRANSACTION_TYP_R() throws FoundationException { return m_doRs.getString(12); }
		public String getCOMPANY_CD_R() throws FoundationException { return m_doRs.getString(13); }
		public String getORG_CD_R() throws FoundationException { return m_doRs.getString(14); }
		public String getONEROUS_CONS_FLG_R() throws FoundationException { return m_doRs.getString(15); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setPLANT_CD(getPLANT_CD_R());
				m_med.setITEM_CD(getITEM_CD_R());
				m_med.setPROC_CD(getCS_PROC_CD_R());
				m_med.setRCY_TYP_CD(getRCY_TYP_CD_R());
				m_med.setPROC_NAME(getCS_PROC_NAME_R());
				m_med.setWS_CD(getWS_CD_R());
				m_med.setOUTSIDE_TYP(getOUTSIDE_TYP_R());
				m_med.setVEND_CD(getVEND_CD_R());
				m_med.setSTD_COST_OF_MONTH(getSTD_COST_OF_MONTH_R());
				m_med.setSTD_COST_UNIT_TYP(getSTD_COST_UNIT_TYP_R());
				m_med.setCLASIFICATION_CD(getCLASIFICATION_CD_R());
				m_med.setTRANSACTION_TYP(getTRANSACTION_TYP_R());
				m_med.setCOMPANY_CD(getCOMPANY_CD_R());
				m_med.setORG_CD(getORG_CD_R());
				m_med.setONEROUS_CONS_FLG(getONEROUS_CONS_FLG_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
			if("Oracle".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I(sCREATE));
			} else if("Microsoft SQL Server".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_MSSQL(sCREATE));
			} else if("PostgreSQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_PGSQL(sCREATE));
			} else if("MySQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_MYSQL(sCREATE));
			} else {
				prepareCreate(objMessage.replaceSQL_I_DB2(sCREATE));
			}
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
			BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_ITEM_CS_PROC_IF", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_ITEM_CS_PROC_IF�N���X�̕W���R���X�g���N�^
	 *
		 */
	public T_ITEM_CS_PROC_IF(medDB0010B001 med, BatchAppConductor cdr) throws SystemException
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
	public medDB0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select "
+"  T_ITEM_CS_PROC_IF.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_ITEM_CS_PROC_IF.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ITEM_CS_PROC_IF.\"CS_PROC_CD\" as \"CS_PROC_CD\", "
+"  T_ITEM_CS_PROC_IF.\"RCY_TYP_CD\" as \"RCY_TYP_CD\", "
+"  T_ITEM_CS_PROC_IF.\"CS_PROC_NAME\" as \"CS_PROC_NAME\", "
+"  T_ITEM_CS_PROC_IF.\"WS_CD\" as \"WS_CD\", "
+"  to_char(T_ITEM_CS_PROC_IF.\"OUTSIDE_TYP\") as \"OUTSIDE_TYP\", "
+"  T_ITEM_CS_PROC_IF.\"VEND_CD\" as \"VEND_CD\", "
+"  to_char(T_ITEM_CS_PROC_IF.\"STD_COST_OF_MONTH\") as \"STD_COST_OF_MONTH\", "
+"  to_char(T_ITEM_CS_PROC_IF.\"STD_COST_UNIT_TYP\") as \"STD_COST_UNIT_TYP\", "
+"  T_ITEM_CS_PROC_IF.\"CLASIFICATION_CD\" as \"CLASIFICATION_CD\", "
+"  to_char(T_ITEM_CS_PROC_IF.\"TRANSACTION_TYP\") as \"TRANSACTION_TYP\", "
+"  T_ITEM_CS_PROC_IF.\"COMPANY_CD\" as \"COMPANY_CD\", "
+"  T_ITEM_CS_PROC_IF.\"ORG_CD\" as \"ORG_CD\", "
+"  to_char(T_ITEM_CS_PROC_IF.\"ONEROUS_CONS_FLG\") as \"ONEROUS_CONS_FLG\" "
+"from "
+"  T_ITEM_CS_PROC_IF, "
+"  M_CS_PROC "
+"where "
+"  T_ITEM_CS_PROC_IF.\"PLANT_CD\" = M_CS_PROC.\"PLANT_CD\"(+) "
+"  and T_ITEM_CS_PROC_IF.\"CS_PROC_CD\" = M_CS_PROC.\"CS_PROC_CD\"(+) "
+"  and T_ITEM_CS_PROC_IF.\"PLANT_CD\" = ? "
+"  and T_ITEM_CS_PROC_IF.\"UPD_FLG\" = 0 "
+"order by "
+"  T_ITEM_CS_PROC_IF.\"ITEM_CD\", "
+"  T_ITEM_CS_PROC_IF.\"CS_PROC_CD\"";
	protected static String m_inscmd = "insert into "
+"  T_ITEM_CS_PROC_IF(\"PLANT_CD\", \"ITEM_CD\", \"CS_PROC_CD\", \"RCY_TYP_CD\", \"CS_PROC_NAME\", \"WS_CD\", \"OUTSIDE_TYP\", \"VEND_CD\", \"STD_COST_OF_MONTH\", \"STD_COST_UNIT_TYP\", \"CLASIFICATION_CD\", \"COMPANY_CD\", \"ORG_CD\", \"ONEROUS_CONS_FLG\", \"SAVE_UPDATED_DATE\", \"TRANSACTION_TYP\", \"UPD_FLG\") "
+"values "
+"  (?, ?, ?, '*', ?, ?, to_number(?), ?, to_number(?), 1, ?, ?, ?, to_number(?), to_date(?, 'YYYY/MM/DD HH24:MI:SS'), to_number(?), 0)";
	protected static String m_updcmd = "update "
+"  T_ITEM_CS_PROC_IF "
+"set "
+"  \"PLANT_CD\" = ?, "
+"  \"ITEM_CD\" = ?, "
+"  \"CS_PROC_CD\" = ?, "
+"  \"RCY_TYP_CD\" = '*', "
+"  \"CS_PROC_NAME\" = ?, "
+"  \"WS_CD\" = ?, "
+"  \"OUTSIDE_TYP\" = to_number(?), "
+"  \"VEND_CD\" = ?, "
+"  \"STD_COST_OF_MONTH\" = to_number(?), "
+"  \"STD_COST_UNIT_TYP\" = 1, "
+"  \"CLASIFICATION_CD\" = ?, "
+"  \"COMPANY_CD\" = ?, "
+"  \"ORG_CD\" = ?, "
+"  \"ONEROUS_CONS_FLG\" = to_number(?), "
+"  \"SAVE_UPDATED_DATE\" = to_date(?, 'YYYY/MM/DD HH24:MI:SS'), "
+"  \"TRANSACTION_TYP\" = to_number(?), "
+"  \"UPD_FLG\" = 0 "
+"where "
+"  T_ITEM_CS_PROC_IF.\"PLANT_CD\" = ? "
+"  and T_ITEM_CS_PROC_IF.\"ITEM_CD\" = ? "
+"  and T_ITEM_CS_PROC_IF.\"CS_PROC_CD\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
