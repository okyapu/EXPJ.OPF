/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0060/src/com/nec/jp/orteus/metamorBase/KP0060/KP0060B001/readT_ODR.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0060.KP0060B001;

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
 * CLASS     : readT_ODR �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.12 $ $Date: 2015/12/03 08:54:27 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class readT_ODR extends AbstractBatchAppEntity
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
		m_entity.setCacheMode(false);
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

		public void setIN20_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN21_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN22_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }

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

				setIN20_R(m_med.getCOMPANY_CD());
				setIN21_R(m_med.getPLANT_CD());
				setIN22_R(m_med.getPLANT_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("readT_ODR", "read", "���R�[�h���������ݒ菈�����s");
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

		public String getODR_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getODR_TYP_R() throws FoundationException { return m_doRs.getString(2); }
		public String getDESINATED_DLV_DATE_R() throws FoundationException { return m_doRs.getString(3); }
		public String getODR_QTY_R() throws FoundationException { return m_doRs.getString(4); }
		public String getREMAIN_UNCONFIRM_ODR_QTY_R() throws FoundationException { return m_doRs.getString(5); }
		public String getBUSINESS_OPR_DATE_R() throws FoundationException { return m_doRs.getString(6); }
		public String getTRANSPORT_LT_R() throws FoundationException { return m_doRs.getString(7); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getMRP_ODR_TYP_R() throws FoundationException { return m_doRs.getString(9); }
		public String getOUTSIDE_TYP_R() throws FoundationException { return m_doRs.getString(10); }
		public String getISSUE_TYP_R() throws FoundationException { return m_doRs.getString(11); }
		public String getODR_LT_R() throws FoundationException { return m_doRs.getString(12); }
		public String getFIXED_LT_R() throws FoundationException { return m_doRs.getString(13); }
		public String getPROP_LT_R() throws FoundationException { return m_doRs.getString(14); }
		public String getSAFETY_LT_R() throws FoundationException { return m_doRs.getString(15); }
		public String getISSUE_LT_R() throws FoundationException { return m_doRs.getString(16); }
		public String getPROP_LOT_SIZE_R() throws FoundationException { return m_doRs.getString(17); }
		public String getHIGH_LEVEL_NO_R() throws FoundationException { return m_doRs.getString(18); }
		public String getITEM_SPOIL_R() throws FoundationException { return m_doRs.getString(19); }
		public String getWH_PLANT_CD_R() throws FoundationException { return m_doRs.getString(20); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setODR_NO(getODR_NO_R());
				m_med.setODR_TYP(getODR_TYP_R());
				m_med.setDESINATED_DLV_DATE(getDESINATED_DLV_DATE_R());
				m_med.setODR_QTY(getODR_QTY_R());
				m_med.setREMAIN_UNCONFIRM_ODR_QTY(getREMAIN_UNCONFIRM_ODR_QTY_R());
				m_med.setBUSINESS_OPR_DATE(getBUSINESS_OPR_DATE_R());
				m_med.setTRANSPORT_LT(getTRANSPORT_LT_R());
				m_med.setITEM_CD(getITEM_CD_R());
				m_med.setMRP_ODR_TYP(getMRP_ODR_TYP_R());
				m_med.setOUTSIDE_TYP(getOUTSIDE_TYP_R());
				m_med.setISSUE_TYP(getISSUE_TYP_R());
				m_med.setODR_LT(getODR_LT_R());
				m_med.setFIXED_LT(getFIXED_LT_R());
				m_med.setPROP_LT(getPROP_LT_R());
				m_med.setSAFETY_LT(getSAFETY_LT_R());
				m_med.setISSUE_LT(getISSUE_LT_R());
				m_med.setPROP_LOT_SIZE(getPROP_LOT_SIZE_R());
				m_med.setHIGH_LEVEL_NO(getHIGH_LEVEL_NO_R());
				m_med.setITEM_SPOIL(getITEM_SPOIL_R());
				m_med.setWH_PLANT_CD(getWH_PLANT_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("readT_ODR", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("readT_ODR", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
	 * readT_ODR�N���X�̕W���R���X�g���N�^
	 *
		 */
	public readT_ODR(medKP0060B001 med, BatchAppConductor cdr) throws SystemException
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
	public medKP0060B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "SELECT distinct "
+"  A.ODR_NO AS ODR_NO, "
+"  A.ODR_TYP AS ODR_TYP, "
+"  to_char(A.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  A.ODR_QTY AS ODR_QTY, "
+"  A.REMAIN_UNCONFIRM_ODR_QTY AS REMAIN_UNCONFIRM_ODR_QTY, "
+"  to_char(F.BUSINESS_OPR_DATE, 'YYYY/MM/DD') AS BUSINESS_OPR_DATE, "
+"  D.TRANSPORT_LT AS TRANSPORT_LT, "
+"  B.ITEM_CD AS ITEM_CD, "
+"  B.MRP_ODR_TYP AS MRP_ODR_TYP, "
+"  B.OUTSIDE_TYP AS OUTSIDE_TYP, "
+"  B.ISSUE_TYP AS ISSUE_TYP, "
+"  B.ODR_LT AS ODR_LT, "
+"  B.FIXED_LT AS FIXED_LT, "
+"  B.PROP_LT AS PROP_LT, "
+"  B.SAFETY_LT AS SAFETY_LT, "
+"  B.ISSUE_LT AS ISSUE_LT, "
+"  B.PROP_LOT_SIZE AS PROP_LOT_SIZE, "
+"  B.HIGH_LEVEL_NO AS HIGH_LEVEL_NO, "
+"  B.ITEM_SPOIL AS ITEM_SPOIL, "
+"  E.PLANT_CD AS WH_PLANT_CD "
+"FROM "
+"  T_ODR A, "
+"  M_ITEM B, "
+"  T_SHIP_ODR C, "
+"  M_CUST_BASE D, "
+"  M_WH E, "
+"  SYS_DATE_CTRL F, "
+"  T_ODR_CTL G "
+"WHERE "
+"  A.ODR_TYP IN (2, 3) "
+"  AND A.DEL_FLG = 0 "
+"  AND G.ODR_CTL_NO = A.ODR_CTL_NO "
+"  AND B.ITEM_CD = G.ITEM_CD "
+"  AND D.COMPANY_CD = ? "
+"  AND D.CUST_CD = G.CUST_CD "
+"  AND D.DLV_LOC_CD = A.DLV_LOC_CD "
+"  AND E.WH_CD = D.SHIP_WH_CD "
+"  AND E.PLANT_CD = ? "
+"  AND F.PLANT_CD = ? "
+"  AND B.MRP_ODR_TYP IN (4, 5, 6, 7) "
+"  AND C.ODR_NO(+) = A.ODR_NO "
+"  AND C.SHP_CMPLT_FLG(+) = 0 "
+"  AND C.DEPO_TRANSFER_PROC_FLG(+) = 0";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
