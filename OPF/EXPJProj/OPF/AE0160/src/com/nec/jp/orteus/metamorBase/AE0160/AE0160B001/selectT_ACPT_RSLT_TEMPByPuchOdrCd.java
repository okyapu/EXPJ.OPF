/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160B001/selectT_ACPT_RSLT_TEMPByPuchOdrCd.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160.AE0160B001;

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
 * CLASS     : selectT_ACPT_RSLT_TEMPByPuchOdrCd �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.12 $ $Date: 2017/01/09 08:43:58 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class selectT_ACPT_RSLT_TEMPByPuchOdrCd extends AbstractBatchAppEntity
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

		public void setDATAFROM_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setDATATO_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN21_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }

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

				setDATAFROM_R(m_med.getDATEFROM());
				setDATATO_R(m_med.getDATETO());
				setIN21_R(m_med.getTEMP_PUCH_ODR_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("selectT_ACPT_RSLT_TEMPByPuchOdrCd", "read", "���R�[�h���������ݒ菈�����s");
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

		public String getACPT_RSLT_TEMP_CTL_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getPUCH_ODR_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getWH_CD_R() throws FoundationException { return m_doRs.getString(4); }
		public String getACPT_DATE_R() throws FoundationException { return m_doRs.getString(5); }
		public String getACPT_QTY_R() throws FoundationException { return m_doRs.getString(6); }
		public String getUNIT_COST_TYP_R() throws FoundationException { return m_doRs.getString(7); }
		public String getUNIT_COST_R() throws FoundationException { return m_doRs.getString(8); }
		public String getPROCESSING_COST_R() throws FoundationException { return m_doRs.getString(9); }
		public String getMATERIAL_COST_R() throws FoundationException { return m_doRs.getString(10); }
		public String getOTHER_OVERHEADS_R() throws FoundationException { return m_doRs.getString(11); }
		public String getDISC_AMOUNT_R() throws FoundationException { return m_doRs.getString(12); }
		public String getEXCH_RATE_R() throws FoundationException { return m_doRs.getString(13); }
		public String getLOT_NO_R() throws FoundationException { return m_doRs.getString(14); }
		public String getVEND_LOT_NO_R() throws FoundationException { return m_doRs.getString(15); }
		public String getDLV_CD_R() throws FoundationException { return m_doRs.getString(16); }
		public String getACPT_RSLT_COMMENT_R() throws FoundationException { return m_doRs.getString(17); }
		public String getACPT_RSLT_COMP_R() throws FoundationException { return m_doRs.getString(18); }
		public String getTAKE_DATE_R() throws FoundationException { return m_doRs.getString(19); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setTEMP_ACPT_RSLT_TEMP_CTL_NO(getACPT_RSLT_TEMP_CTL_NO_R());
				m_med.setTEMP_PUCH_ODR_CD(getPUCH_ODR_CD_R());
				m_med.setTEMP_ITEM_CD(getITEM_CD_R());
				m_med.setTEMP_WH_CD(getWH_CD_R());
				m_med.setTEMP_ACPT_DATE(getACPT_DATE_R());
				m_med.setTEMP_ACPT_QTY(getACPT_QTY_R());
				m_med.setTEMP_UNIT_COST_TYP(getUNIT_COST_TYP_R());
				m_med.setTEMP_UNIT_COST(getUNIT_COST_R());
				m_med.setTEMP_PROCESSING_COST(getPROCESSING_COST_R());
				m_med.setTEMP_MATERIAL_COST(getMATERIAL_COST_R());
				m_med.setTEMP_OTHER_OVERHEADS(getOTHER_OVERHEADS_R());
				m_med.setTEMP_DISC_AMOUNT(getDISC_AMOUNT_R());
				m_med.setTEMP_EXCH_RATE(getEXCH_RATE_R());
				m_med.setTEMP_LOT_NO(getLOT_NO_R());
				m_med.setTEMP_VEND_LOT_NO(getVEND_LOT_NO_R());
				m_med.setTEMP_DLV_CD(getDLV_CD_R());
				m_med.setTEMP_ACPT_RSLT_COMMENT(getACPT_RSLT_COMMENT_R());
				m_med.setTEMP_ACPT_RSLT_COMP(getACPT_RSLT_COMP_R());
				m_med.setTEMP_TAKE_DATE(getTAKE_DATE_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("selectT_ACPT_RSLT_TEMPByPuchOdrCd", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("selectT_ACPT_RSLT_TEMPByPuchOdrCd", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
	 * selectT_ACPT_RSLT_TEMPByPuchOdrCd�N���X�̕W���R���X�g���N�^
	 *
		 */
	public selectT_ACPT_RSLT_TEMPByPuchOdrCd(medAE0160B001 med, BatchAppConductor cdr) throws SystemException
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
	public medAE0160B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "SELECT "
+"  T.ACPT_RSLT_TEMP_CTL_NO, "
+"  T.PUCH_ODR_CD, "
+"  NVL(T.ITEM_CD, A.ITEM_CD) AS ITEM_CD, "
+"  T.WH_CD AS WH_CD, "
+"  TO_CHAR(T.ACPT_DATE, 'YYYY/MM/DD') AS ACPT_DATE, "
+"  T.ACPT_QTY AS ACPT_QTY, "
+"  T.UNIT_COST_TYP AS UNIT_COST_TYP, "
+"  T.UNIT_COST AS UNIT_COST, "
+"  T.PROCESSING_COST AS PROCESSING_COST, "
+"  T.MATERIAL_COST AS MATERIAL_COST, "
+"  T.OTHER_OVERHEADS AS OTHER_OVERHEADS, "
+"  T.DISC_AMOUNT AS DISC_AMOUNT, "
+"  T.EXCH_RATE AS EXCH_RATE, "
+"  T.LOT_NO, "
+"  T.VEND_LOT_NO, "
+"  T.DLV_CD, "
+"  T.ACPT_RSLT_COMMENT, "
+"  NVL(T.ACPT_RSLT_COMP,'1'), "
+"  T.TAKE_DATE "
+"FROM "
+"  T_ACPT_RSLT_TEMP T, "
+"  T_RLSD_PUCH_ODR A "
+"WHERE "
+"  T.TAKE_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T.TAKE_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T.PUCH_ODR_CD = ? "
+"  AND T.PUCH_ODR_CD = A.PUCH_ODR_CD(+) "
+"ORDER BY "
+"  T.ACPT_RSLT_TEMP_CTL_NO";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
