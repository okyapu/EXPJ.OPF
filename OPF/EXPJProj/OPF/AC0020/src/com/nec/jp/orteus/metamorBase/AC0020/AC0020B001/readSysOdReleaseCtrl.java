/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020B001/readSysOdReleaseCtrl.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020.AC0020B001;

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
 * CLASS     : readSysOdReleaseCtrl �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:01:35 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : readSysOdReleaseCtrl �N���X
 * VERSION   : 1.0.0.0
 * DATE      : 2003/08/08
 * AUTHOR    : NEXS
 * HISTORY
 *           : 1.0.0.0�@2003/08/08,�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class readSysOdReleaseCtrl extends AbstractBatchAppEntity
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
				BatchAppException be=new BatchAppException("readSysOdReleaseCtrl", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
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

		public String getPLANT_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public boolean wasNull_MANAGEMENT_TYP_R() throws FoundationException { return m_doRs.wasNull(2); }
		public int getMANAGEMENT_TYP_R() throws FoundationException { return m_doRs.getInt(2); }
		public boolean wasNull_BATCH_PROCESSING_TYP_R() throws FoundationException { return m_doRs.wasNull(3); }
		public int getBATCH_PROCESSING_TYP_R() throws FoundationException { return m_doRs.getInt(3); }
		public boolean wasNull_OUTSIDE_TYP_R() throws FoundationException { return m_doRs.wasNull(4); }
		public int getOUTSIDE_TYP_R() throws FoundationException { return m_doRs.getInt(4); }
		public String getJOB_ODR_CD_R() throws FoundationException { return m_doRs.getString(5); }
		public boolean wasNull_JOB_ODR_DETAIL_NO_R() throws FoundationException { return m_doRs.wasNull(6); }
		public int getJOB_ODR_DETAIL_NO_R() throws FoundationException { return m_doRs.getInt(6); }
		public boolean wasNull_ENTRY_1_TYP_R() throws FoundationException { return m_doRs.wasNull(7); }
		public int getENTRY_1_TYP_R() throws FoundationException { return m_doRs.getInt(7); }
		public boolean wasNull_ENTRY_2_TYP_R() throws FoundationException { return m_doRs.wasNull(8); }
		public int getENTRY_2_TYP_R() throws FoundationException { return m_doRs.getInt(8); }
		public String getENTRY_DATE_R() throws FoundationException { return m_doRs.getString(9); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setplantCd(getPLANT_CD_R());
				if(wasNull_MANAGEMENT_TYP_R()==true) {
					m_med.setmanagementTyp(null);
				} else {
					m_med.setmanagementTyp(new Integer(getMANAGEMENT_TYP_R()));
				}
				if(wasNull_BATCH_PROCESSING_TYP_R()==true) {
					m_med.setbatchProcessingTyp(null);
				} else {
					m_med.setbatchProcessingTyp(new Integer(getBATCH_PROCESSING_TYP_R()));
				}
				if(wasNull_OUTSIDE_TYP_R()==true) {
					m_med.setoutsideTyp(null);
				} else {
					m_med.setoutsideTyp(new Integer(getOUTSIDE_TYP_R()));
				}
				m_med.setjobOdrCd(getJOB_ODR_CD_R());
				if(wasNull_JOB_ODR_DETAIL_NO_R()==true) {
					m_med.setjobOdrDetailNo(null);
				} else {
					m_med.setjobOdrDetailNo(new Integer(getJOB_ODR_DETAIL_NO_R()));
				}
				if(wasNull_ENTRY_1_TYP_R()==true) {
					m_med.setentry1Typ(null);
				} else {
					m_med.setentry1Typ(new Integer(getENTRY_1_TYP_R()));
				}
				if(wasNull_ENTRY_2_TYP_R()==true) {
					m_med.setentry2Typ(null);
				} else {
					m_med.setentry2Typ(new Integer(getENTRY_2_TYP_R()));
				}
				m_med.setentryDate(getENTRY_DATE_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("readSysOdReleaseCtrl", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("readSysOdReleaseCtrl", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
	 * readSysOdReleaseCtrl�N���X�̕W���R���X�g���N�^
	 *
		 */
	public readSysOdReleaseCtrl(medAC0020B001 med, BatchAppConductor cdr) throws SystemException
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
	public medAC0020B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select "
+"  SYS_ODRELEASE_CTRL.\"PLANT_CD\" as \"PLANT_CD\", "
+"  SYS_ODRELEASE_CTRL.\"MANAGEMENT_TYP\" as \"MANAGEMENT_TYP\", "
+"  SYS_ODRELEASE_CTRL.\"BATCH_PROCESSING_TYP\" as \"BATCH_PROCESSING_TYP\", "
+"  SYS_ODRELEASE_CTRL.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  SYS_ODRELEASE_CTRL.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  SYS_ODRELEASE_CTRL.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"  SYS_ODRELEASE_CTRL.\"ENTRY_1_TYP\" as \"ENTRY_1_TYP\", "
+"  SYS_ODRELEASE_CTRL.\"ENTRY_2_TYP\" as \"ENTRY_2_TYP\", "
+"  SYS_ODRELEASE_CTRL.\"ENTRY_DATE\" as \"ENTRY_DATE\" "
+"from "
+"  SYS_ODRELEASE_CTRL "
+"where "
+"  SYS_ODRELEASE_CTRL.\"BATCH_PROCESSING_TYP\" = 1";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
