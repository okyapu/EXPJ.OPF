/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B002/T_ODR_INFO_COM_IF.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B002;

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
 * CLASS     : T_ODR_INFO_COM_IF �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2015/12/03 08:55:51 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_ODR_INFO_COM_IF extends AbstractBatchAppEntity
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

		public void setODR_INFO_COM_IF_CTRL_NO_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(7, null);
			} else {
				getAdapt_C().setDouble(7, value);
			}
		}
		public void setODR_SEQ_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(8, null);
			} else {
				getAdapt_C().setDouble(8, value);
			}
		}
		public void setODR_TYP_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setINFO_TYP_CD_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCUST_ODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setODR_ACPT_DATE_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setCUST_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setCUST_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setPART_NAME_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setPROC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setCOCK_TYP_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setUNIT_CD_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setUNIT_COST_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(19, null);
			} else {
				getAdapt_C().setDouble(19, value);
			}
		}
		public void setUNIT_COST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setDESINATED_DLV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setPUCH_ODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(22, null);
			} else {
				getAdapt_C().setDouble(22, value);
			}
		}
		public void setPKG_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setINSPC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }
		public void setDLV_LOC_CD_EIAJ_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setDLV_LOC_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(27, value); }
		public void setCUS_DLV_CD_C(String value) throws FoundationException { getAdapt_C().setString(28, value); }
		public void setCUS_DLV_KEY_CD_C(String value) throws FoundationException { getAdapt_C().setString(29, value); }
		public void setFREE_REMARK_C(String value) throws FoundationException { getAdapt_C().setString(30, value); }
		public void setREMARK_C(String value) throws FoundationException { getAdapt_C().setString(31, value); }
		public void setCLIENT_BARCODE_INF_C(String value) throws FoundationException { getAdapt_C().setString(32, value); }
		public void setCLIENT_REMARK_C(String value) throws FoundationException { getAdapt_C().setString(33, value); }
		public void setCLIENT_REMARK_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(34, value); }
		public void setSLIP_PRICE_PRINT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(35, value); }
		public void setCUR_CD_C(String value) throws FoundationException { getAdapt_C().setString(36, value); }
		public void setUNIT_CD_ORG_C(String value) throws FoundationException { getAdapt_C().setString(37, value); }
		public void setPUCH_ODR_QTY_TOTAL_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(38, null);
			} else {
				getAdapt_C().setDouble(38, value);
			}
		}
		public void setBUYER_NAME_C(String value) throws FoundationException { getAdapt_C().setString(39, value); }
		public void setODR_ACPT_PROC_ODR_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(40, null);
			} else {
				getAdapt_C().setDouble(40, value);
			}
		}
		public void setBUYER_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(41, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setODR_INFO_COM_IF_CTRL_NO_C(m_med.getODR_INFO_COM_IF_CTRL_NO());
				setODR_SEQ_C(m_med.getODR_SEQ());
				setODR_TYP_C(m_med.getODR_TYP());
				setINFO_TYP_CD_C(m_med.getINFO_TYP_CD());
				setCUST_ODR_NO_C(m_med.getCUST_ODR_NO());
				setODR_ACPT_DATE_C(m_med.getODR_ACPT_DATE());
				setCUST_CD_C(m_med.getCUST_CD());
				setCUST_ITEM_CD_C(m_med.getCUST_ITEM_CD());
				setPART_NAME_C(m_med.getPART_NAME());
				setPROC_TYP_C(m_med.getPROC_TYP());
				setCOCK_TYP_C(m_med.getCOCK_TYP());
				setUNIT_CD_C(m_med.getUNIT_CD());
				setUNIT_COST_C(m_med.getUNIT_COST());
				setUNIT_COST_TYP_C(m_med.getUNIT_COST_TYP());
				setDESINATED_DLV_DATE_C(m_med.getDESINATED_DLV_DATE());
				setPUCH_ODR_QTY_C(m_med.getPUCH_ODR_QTY());
				setPKG_UNIT_C(m_med.getPKG_UNIT());
				setINSPC_TYP_C(m_med.getINSPC_TYP());
				setDLV_LOC_CD_C(m_med.getDLV_LOC_CD());
				setDLV_LOC_CD_EIAJ_C(m_med.getDLV_LOC_CD_EIAJ());
				setDLV_LOC_NAME_KANJI_C(m_med.getDLV_LOC_NAME_KANJI());
				setCUS_DLV_CD_C(m_med.getCUS_DLV_CD());
				setCUS_DLV_KEY_CD_C(m_med.getCUS_DLV_KEY_CD());
				setFREE_REMARK_C(m_med.getFREE_REMARK());
				setREMARK_C(m_med.getREMARK());
				setCLIENT_BARCODE_INF_C(m_med.getCLIENT_BARCODE_INF());
				setCLIENT_REMARK_C(m_med.getCLIENT_REMARK());
				setCLIENT_REMARK_KANJI_C(m_med.getCLIENT_REMARK_KANJI());
				setSLIP_PRICE_PRINT_TYP_C(m_med.getSLIP_PRICE_PRINT_TYP());
				setCUR_CD_C(m_med.getCUR_CD());
				setUNIT_CD_ORG_C(m_med.getUNIT_CD_ORG());
				setPUCH_ODR_QTY_TOTAL_C(m_med.getPUCH_ODR_QTY_TOTAL());
				setBUYER_NAME_C(m_med.getBUYER_NAME());
				setODR_ACPT_PROC_ODR_C(m_med.getODR_ACPT_PROC_ODR());
				setBUYER_ORG_CD_C(m_med.getBUYER_ORG_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ODR_INFO_COM_IF", "create", "���R�[�h�V�K�ǉ��p�����[�^�ݒ菈�����s");
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
			BatchAppException be=new BatchAppException("T_ODR_INFO_COM_IF", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_ODR_INFO_COM_IF", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_ODR_INFO_COM_IF�N���X�̕W���R���X�g���N�^
	 *
		 */
	public T_ODR_INFO_COM_IF(medKV0020B002 med, BatchAppConductor cdr) throws SystemException
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
	public medKV0020B002 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_ODR_INFO_COM_IF(\"ODR_INFO_COM_IF_CTRL_NO\", \"ODR_SEQ\", \"ODR_TYP\", \"IF_TYP\", \"INFO_TYP_CD\", \"CUST_ODR_NO\", \"ODR_ACPT_DATE\", \"CUST_CD\", \"CUST_ITEM_CD\", \"PART_NAME\", \"PROC_TYP\", \"COCK_TYP\", \"UNIT_CD\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"DESINATED_DLV_DATE\", \"PUCH_ODR_QTY\", \"PKG_UNIT\", \"INSPC_TYP\", \"DLV_LOC_CD\", \"DLV_LOC_CD_EIAJ\", \"DLV_LOC_NAME_KANJI\", \"CUS_DLV_CD\", \"CUS_DLV_KEY_CD\", \"FREE_REMARK\", \"REMARK\", \"CLIENT_BARCODE_INF\", \"CLIENT_REMARK\", \"CLIENT_REMARK_KANJI\", \"SLIP_PRICE_PRINT_TYP\", \"CUR_CD\", \"SYSTEM_PROC_TYP\", \"DEL_FLG\", \"UNIT_CD_ORG\", \"PUCH_ODR_QTY_TOTAL\", \"BUYER_NAME\", \"ODR_ACPT_PROC_ODR\", \"BUYER_ORG_CD\") "
+"values "
+"  (?, ?, ?, '1', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, to_date(?,'yymmdd'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', '0', ?, ?, ?, ?, ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
