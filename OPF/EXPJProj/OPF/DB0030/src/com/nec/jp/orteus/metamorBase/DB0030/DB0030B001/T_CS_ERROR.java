/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0030/src/com/nec/jp/orteus/metamorBase/DB0030/DB0030B001/T_CS_ERROR.java,v $
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
 * CLASS     : T_CS_ERROR �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:21:39 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_CS_ERROR extends AbstractBatchAppEntity
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
	public boolean canRead() { return false; }

	/**
	 * update()���\�b�h�����p�ł��邩�ǂ�����Ԃ�
	 *
	 * @return ���p�ł���ꍇ�ɂ�TRUE�A�ł��Ȃ��ꍇ�ɂ�FALSE��Ԃ�
	 */
	public boolean canUpdate() { return false; }

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

		public void setCS_ERROR_CD_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setBATCH_TYP_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setBUSINESS_ID_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setCOST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setPLANT_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setCS_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setVEND_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setEFFECTIVE_START_DATE_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setTRANSACTION_TYP_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setMESSAGE_CD_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setREAD_COUNT_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setREMARKS_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setCS_ERROR_CD_C(m_med.getCS_ERROR_CD());
				setBATCH_TYP_C(m_med.getBATCH_TYP());
				setBUSINESS_ID_C(m_med.getBUSINESS_ID());
				setCOST_TYP_C(m_med.getCOST_TYP());
				setPLANT_CD_C(m_med.getPLANT_CD());
				setITEM_CD_C(m_med.getITEM_CD());
				setCS_PROC_CD_C(m_med.getPROC_CD());
				setVEND_CD_C(m_med.getVEND_CD());
				setEFFECTIVE_START_DATE_C(m_med.getEFF_PHASE_IN_DATE());
				setTRANSACTION_TYP_C(m_med.getTRANSACTION_TYP());
				setMESSAGE_CD_C(m_med.getMESSAGE_CD());
				setREAD_COUNT_C(m_med.getREAD_COUNT());
				setREMARKS_C(m_med.getREMARKS());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_CS_ERROR", "create", "���R�[�h�V�K�ǉ��p�����[�^�ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public int read() throws BatchAppException
		{
			return BREAK;
		}

		public int update() throws BatchAppException
		{
			return BREAK;
		}

		public int delete() throws BatchAppException
		{
			return BREAK;
		}

		public List call() throws BatchAppException
		{
			return null;
		}

		public boolean next() throws BatchAppException
		{
			return false;
		}

		public boolean hasRecord(boolean moveCursor) throws BatchAppException
		{
			return false;
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
			prepareUpdate(sUPDATE);
			prepareDelete(sDELETE);
			prepareSp(sSP);
		} catch(FoundationException e) {
			BatchAppException be=new BatchAppException("T_CS_ERROR", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_CS_ERROR", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_CS_ERROR�N���X�̕W���R���X�g���N�^
	 *
		 */
	public T_CS_ERROR(medDB0030B001 med, BatchAppConductor cdr) throws SystemException
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
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_CS_ERROR(\"CS_ERROR_CD\", \"BATCH_TYP\", \"BUSINESS_ID\", \"COST_TYP\", \"PLANT_CD\", \"ITEM_CD\", \"CS_PROC_CD\", \"VEND_CD\", \"PROC_COST_CLS_CD\", \"EFFECTIVE_START_DATE\", \"TRANSACTION_TYP\", \"MESSAGE_CD\", \"READ_COUNT\", \"LIST_ISS_FLG\", \"REMARKS\") "
+"values "
+"  (?, to_number(?), ?, to_number(?), ?, ?, ?, ?, null, to_date(?, 'YYYY/MM/DD HH24:MI:SS'), to_number(?), ?, to_number(?), 0, ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}