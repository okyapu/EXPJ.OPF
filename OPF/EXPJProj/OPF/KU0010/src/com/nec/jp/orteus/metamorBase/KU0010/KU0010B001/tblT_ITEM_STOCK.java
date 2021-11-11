/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/tblT_ITEM_STOCK.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010.KU0010B001;

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
 * CLASS     : tblT_ITEM_STOCK �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:05 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class tblT_ITEM_STOCK extends AbstractBatchAppEntity
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

		public void setIN6_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN7_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN8_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }
		public void setIN9_R(String value) throws FoundationException { getAdapt_R().setString(4, value); }

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

				setIN6_R(m_med.getreadTItemStockIN_ITEMCD());
				setIN7_R(m_med.getreadTItemStockIN_WHTYP());
				setIN8_R(m_med.getreadTItemStockIN_WHTYP());
				setIN9_R(m_med.getreadTItemStockIN_ITEMCD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "read", "���R�[�h���������ݒ菈�����s");
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

		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public String getWH_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getPLANT_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getSTOCK_ON_HAND_QTY_R() throws FoundationException { return m_doRs.getString(4); }
		public String getWH_TYP_R() throws FoundationException { return m_doRs.getString(5); }
		public String getPBL_SHIP_QTY_R() throws FoundationException { return m_doRs.getString(6); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setreadTItemStockITEM_CD(getITEM_CD_R());
				m_med.setreadTItemStockWH_CD(getWH_CD_R());
				m_med.setreadTItemStockPLANT_CD(getPLANT_CD_R());
				m_med.setreadTItemStockSTOCK_ON_HAND_QTY(getSTOCK_ON_HAND_QTY_R());
				m_med.setreadTItemStockWH_TYP(getWH_TYP_R());
				m_med.setreadTItemStockYUKOSU(getPBL_SHIP_QTY_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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

			prepareCreate(sCREATE);
			prepareRead(sREAD);
			prepareUpdate(sUPDATE);
			prepareDelete(sDELETE);
			prepareSp(sSP);

		return;
	}

	//////////////////////////////

	/**
	 * tblT_ITEM_STOCK�N���X�̕W���R���X�g���N�^
	 *
		 */
	public tblT_ITEM_STOCK(medKU0010B001 med, BatchAppConductor cdr) throws SystemException
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
	public medKU0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = "select "
+"  T_ITEM_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  T_ITEM_STOCK.\"PLANT_CD\" as \"PLANT_CD\", "
+"  NVL(T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", 0) as \"STOCK_ON_HAND_QTY\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  DECODE(T_SHIP_ODR_NEW.\"REST_DTY\", null, T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" - T_SHIP_ODR_NEW.\"REST_DTY\") as \"PBL_SHIP_QTY\" "
+"from "
+"  M_WH, "
+"  T_ITEM_STOCK, "
+"  ( "
+"    select "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\", "
+"      sum(T_SHIP_ODR_REAL.\"SHIP_QTY\" - T_SHIP_ODR_REAL.\"TOTAL_SHIP_QTY\") as REST_DTY "
+"    FROM "
+"      ( "
+"        select distinct "
+"          T_SHIP_ODR.\"SLIP_CD\" as SLIP_CD, "
+"          T_SHIP_ODR.\"ITEM_CD\" as ITEM_CD, "
+"          T_SHIP_ODR.\"SHIP_QTY\" as SHIP_QTY, "
+"          T_SHIP_ODR.\"TOTAL_SHIP_QTY\" as TOTAL_SHIP_QTY, "
+"          T_SHIP_ODR.\"RETURN_QTY\", "
+"          DECODE(T_SHIP.\"ALLCT_WH_CD\", NULL, T_SHIP_ODR.\"ALLCT_WH_CD\", T_SHIP.\"ALLCT_WH_CD\") as ALLCT_WH_CD "
+"        from "
+"          T_SHIP_ODR, "
+"          T_SHIP "
+"        where "
+"          T_SHIP_ODR.\"SLIP_CD\" = T_SHIP.\"SLIP_CD\"(+) "
+"          AND T_SHIP_ODR.JOB_ODR_CD IS NULL "
+"      ) T_SHIP_ODR_REAL "
+"    WHERE "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\" = ? "
+"      and T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" = ? "
+"    group by "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" "
+"  ) T_SHIP_ODR_NEW "
+"where "
+"  M_WH.WH_CD = T_ITEM_STOCK.WH_CD "
+"  AND M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = 10 "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = T_SHIP_ODR_NEW.\"ITEM_CD\"(+) "
+"  and T_ITEM_STOCK.\"WH_CD\" = T_SHIP_ODR_NEW.\"ALLCT_WH_CD\"(+)";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
