/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0030/src/com/nec/jp/orteus/metamorBase/DB0030/DB0030B001/M_CS_PUCH.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0030.DB0030B001;

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
 * CLASS     : M_CS_PUCH �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:21:38 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class M_CS_PUCH extends AbstractBatchAppEntity
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

		public void setYEAR_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setHALF_TERM_TYP_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setCOST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setPLANT_CD_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setCS_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setVEND_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setUNIT_COST_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setUNIT_COST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setCUR_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setEXCH_RATE_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setPUCH_UNIT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setRCY_VAL_UNIT_COST_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setRCY_RECOUP_RATE_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setCLASIFICATION_CD_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setSTOCK_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setONEROUS_CONS_FLG_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setCOMPANY_CD_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setYEAR_C(m_med.getYEAR());
				setHALF_TERM_TYP_C(m_med.getHALF_TERM_TYP());
				setCOST_TYP_C(m_med.getCOST_TYP());
				setPLANT_CD_C(m_med.getPLANT_CD());
				setITEM_CD_C(m_med.getITEM_CD());
				setCS_PROC_CD_C(m_med.getPROC_CD());
				setVEND_CD_C(m_med.getVEND_CD());
				setUNIT_COST_C(m_med.getUNIT_COST());
				setUNIT_COST_TYP_C(m_med.getUNIT_COST_TYP());
				setCUR_CD_C(m_med.getCUR_CD());
				setEXCH_RATE_C(m_med.getEXCH_RATE());
				setPUCH_UNIT_QTY_C(m_med.getPUCH_UNIT_QTY());
				setRCY_VAL_UNIT_COST_C(m_med.getRCY_VAL_UNIT_COST());
				setRCY_RECOUP_RATE_C(m_med.getRCY_RECOUP_RATE());
				setCLASIFICATION_CD_C(m_med.getCLASIFICATION_CD());
				setSTOCK_UNIT_C(m_med.getSTOCK_UNIT());
				setONEROUS_CONS_FLG_C(m_med.getONEROUS_FLG());
				setCOMPANY_CD_C(m_med.getCOMPANY_CD());
				setORG_CD_C(m_med.getORG_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "create", "���R�[�h�V�K�ǉ��p�����[�^�ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public void setIN2_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN3_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN4_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }
		public void setIN5_R(String value) throws FoundationException { getAdapt_R().setString(4, value); }
		public void setIN6_R(String value) throws FoundationException { getAdapt_R().setString(5, value); }

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

				setIN2_R(m_med.getYEAR());
				setIN3_R(m_med.getHALF_TERM_TYP());
				setIN4_R(m_med.getCOST_TYP());
				setIN5_R(m_med.getPLANT_CD());
				setIN6_R(m_med.getITEM_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setVEND_CD_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setUNIT_COST_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setUNIT_COST_TYP_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setCUR_CD_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }
		public void setEXCH_RATE_U(String value) throws FoundationException { getAdapt_U().setString(8, value); }
		public void setPUCH_UNIT_QTY_U(String value) throws FoundationException { getAdapt_U().setString(9, value); }
		public void setRCY_VAL_UNIT_COST_U(String value) throws FoundationException { getAdapt_U().setString(10, value); }
		public void setRCY_RECOUP_RATE_U(String value) throws FoundationException { getAdapt_U().setString(11, value); }
		public void setCLASIFICATION_CD_U(String value) throws FoundationException { getAdapt_U().setString(12, value); }
		public void setSTOCK_UNIT_U(String value) throws FoundationException { getAdapt_U().setString(13, value); }
		public void setONEROUS_CONS_FLG_U(String value) throws FoundationException { getAdapt_U().setString(14, value); }
		public void setCOMPANY_CD_U(String value) throws FoundationException { getAdapt_U().setString(15, value); }
		public void setORG_CD_U(String value) throws FoundationException { getAdapt_U().setString(16, value); }
		public void setIN13_U(String value) throws FoundationException { getAdapt_U().setString(17, value); }
		public void setIN14_U(String value) throws FoundationException { getAdapt_U().setString(18, value); }
		public void setIN15_U(String value) throws FoundationException { getAdapt_U().setString(19, value); }
		public void setIN16_U(String value) throws FoundationException { getAdapt_U().setString(20, value); }
		public void setIN17_U(String value) throws FoundationException { getAdapt_U().setString(21, value); }
		public void setIN18_U(String value) throws FoundationException { getAdapt_U().setString(22, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setVEND_CD_U(m_med.getVEND_CD());
				setUNIT_COST_U(m_med.getUNIT_COST());
				setUNIT_COST_TYP_U(m_med.getUNIT_COST_TYP());
				setCUR_CD_U(m_med.getCUR_CD());
				setEXCH_RATE_U(m_med.getEXCH_RATE());
				setPUCH_UNIT_QTY_U(m_med.getPUCH_UNIT_QTY());
				setRCY_VAL_UNIT_COST_U(m_med.getRCY_VAL_UNIT_COST());
				setRCY_RECOUP_RATE_U(m_med.getRCY_RECOUP_RATE());
				setCLASIFICATION_CD_U(m_med.getCLASIFICATION_CD());
				setSTOCK_UNIT_U(m_med.getSTOCK_UNIT());
				setONEROUS_CONS_FLG_U(m_med.getONEROUS_FLG());
				setCOMPANY_CD_U(m_med.getCOMPANY_CD());
				setORG_CD_U(m_med.getORG_CD());
				setIN13_U(m_med.getYEAR());
				setIN14_U(m_med.getHALF_TERM_TYP());
				setIN15_U(m_med.getCOST_TYP());
				setIN16_U(m_med.getPLANT_CD());
				setIN17_U(m_med.getITEM_CD());
				setIN18_U(m_med.getPROC_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "update", "���R�[�h�X�V�����ݒ菈�����s");
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

		public String getUPDATE_TYP_R() throws FoundationException { return m_doRs.getString(1); }
		public String getCS_PROC_CD_R() throws FoundationException { return m_doRs.getString(2); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setUPDATE_TYP(getUPDATE_TYP_R());
				m_med.setCS_PROC_CD(getCS_PROC_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("M_CS_PUCH", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
			BatchAppException be=new BatchAppException("M_CS_PUCH", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("M_CS_PUCH", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * M_CS_PUCH�N���X�̕W���R���X�g���N�^
	 *
		 */
	public M_CS_PUCH(medDB0030B001 med, BatchAppConductor cdr) throws SystemException
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
	public medDB0030B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select "
+"  to_char(M_CS_PUCH.\"UPDATE_TYP\") as \"UPDATE_TYP\", "
+"  M_CS_PUCH.\"CS_PROC_CD\" as \"CS_PROC_CD\" "
+"from "
+"  M_CS_PUCH "
+"where "
+"  M_CS_PUCH.\"YEAR\" = to_number(?) "
+"  and M_CS_PUCH.\"HALF_TERM_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"COST_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"PLANT_CD\" = ? "
+"  and M_CS_PUCH.\"ITEM_CD\" = ?";
	protected static String m_inscmd = "insert into "
+"  M_CS_PUCH(\"YEAR\", \"HALF_TERM_TYP\", \"COST_TYP\", \"PLANT_CD\", \"ITEM_CD\", \"CS_PROC_CD\", \"VEND_CD\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"CUR_CD\", \"EXCH_RATE\", \"PUCH_UNIT_QTY\", \"RCY_VAL_UNIT_COST\", \"RCY_RECOUP_RATE\", \"SUB_VEND_CD\", \"SUB_UNIT_COST\", \"SUB_UNIT_COST_TYP\", \"SUB_CUR_CD\", \"SUB_EXCH_RATE\", \"SUB_PUCH_UNIT_QTY\", \"SUB_RCY_VAL_UNIT_COST\", \"SUB_RCY_RECOUP_RATE\", \"CLASIFICATION_CD\", \"STOCK_UNIT\", \"UNIT_COST_ACCEPT_TYP\", \"CS_PUCH_TYP\", \"ONEROUS_CONS_FLG\", \"UPDATE_TYP\", \"DEL_FLG\", \"COMPANY_CD\", \"ORG_CD\") "
+"values "
+"  (to_number(?), to_number(?), to_number(?), ?, ?, ?, ?, to_number(?), to_number(?), ?, to_number(?), to_number(?), to_number(?), to_number(?), null, 0, 1, null, 0, 1, 0, 0, ?, ?, 1, 2, to_number(?), 1, 0, ?, ?)";
	protected static String m_updcmd = "update "
+"  M_CS_PUCH "
+"set "
+"  \"VEND_CD\" = ?, "
+"  \"UNIT_COST\" = to_number(?), "
+"  \"UNIT_COST_TYP\" = to_number(?), "
+"  \"CUR_CD\" = ?, "
+"  \"EXCH_RATE\" = to_number(?), "
+"  \"PUCH_UNIT_QTY\" = to_number(?), "
+"  \"RCY_VAL_UNIT_COST\" = to_number(?), "
+"  \"RCY_RECOUP_RATE\" = to_number(?), "
+"  \"CLASIFICATION_CD\" = ?, "
+"  \"STOCK_UNIT\" = ?, "
+"  \"UNIT_COST_ACCEPT_TYP\" = 1, "
+"  \"CS_PUCH_TYP\" = 2, "
+"  \"ONEROUS_CONS_FLG\" = to_number(?), "
+"  \"UPDATE_TYP\" = 1, "
+"  \"DEL_FLG\" = 0, "
+"  \"COMPANY_CD\" = ?, "
+"  \"ORG_CD\" = ? "
+"where "
+"  M_CS_PUCH.\"YEAR\" = to_number(?) "
+"  and M_CS_PUCH.\"HALF_TERM_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"COST_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"PLANT_CD\" = ? "
+"  and M_CS_PUCH.\"ITEM_CD\" = ? "
+"  and M_CS_PUCH.\"CS_PROC_CD\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
