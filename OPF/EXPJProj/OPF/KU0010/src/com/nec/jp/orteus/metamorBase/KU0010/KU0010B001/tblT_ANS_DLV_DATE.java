/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/tblT_ANS_DLV_DATE.java,v $
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
 * CLASS     : tblT_ANS_DLV_DATE �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:05 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class tblT_ANS_DLV_DATE extends AbstractBatchAppEntity
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

		public void setRIGHT_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN45_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }

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

				setRIGHT_R(m_med.getreadTAnsDlvDateDESINATED_SHIP_DATE());
				setIN45_R(m_med.getreadTAnsDlvDateCOMPANY_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "read", "���R�[�h���������ݒ菈�����s");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setREST_SHIP_ODR_QTY_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setSHIP_ODR_CMPLT_FLG_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setIN2_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setIN3_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setREST_SHIP_ODR_QTY_U(m_med.getupTAnsDlvDateREST_SHIP_ODR_QTY());
				setSHIP_ODR_CMPLT_FLG_U(m_med.getupTAnsDlvDateSHIP_ODR_CMPLT_FLG());
				setIN2_U(m_med.getupTAnsDlvDateIN_PARTDLVSEQNO());
				setIN3_U(m_med.getupTAnsDlvDateIN_ODRNO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "update", "���R�[�h�X�V�����ݒ菈�����s");
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

		public String getODR_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getPART_DLV_SEQ_NO_R() throws FoundationException { return m_doRs.getString(2); }
		public String getPRVS_ANS_DLV_DATE_RCD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getLAST_ANS_DLV_DATE_RCD_R() throws FoundationException { return m_doRs.getString(4); }
		public String getDESINATED_SHIP_DATE_R() throws FoundationException { return m_doRs.getString(5); }
		public String getDESINATED_SHIP_QTY_R() throws FoundationException { return m_doRs.getString(6); }
		public String getREST_SHIP_ODR_QTY_R() throws FoundationException { return m_doRs.getString(7); }
		public String getSHIP_ODR_CMPLT_FLG_R() throws FoundationException { return m_doRs.getString(8); }
		public String getDEL_FLG_R() throws FoundationException { return m_doRs.getString(9); }
		public String getCUST_ITEM_CD_R() throws FoundationException { return m_doRs.getString(10); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(11); }
		public String getCUST_CD_R() throws FoundationException { return m_doRs.getString(12); }
		public String getPKG_UNIT_QTY_R() throws FoundationException { return m_doRs.getString(13); }
		public String getCUST_NAME_R() throws FoundationException { return m_doRs.getString(14); }
		public String getDETAIL_ROUND_TYP_R() throws FoundationException { return m_doRs.getString(15); }
		public String getTRANSPORT_LT_R() throws FoundationException { return m_doRs.getString(16); }
		public String getSHIP_WH_CD_R() throws FoundationException { return m_doRs.getString(17); }
		public String getDEPO_WH_CD_R() throws FoundationException { return m_doRs.getString(18); }
		public String getCUST_ODR_NO_R() throws FoundationException { return m_doRs.getString(19); }
		public String getCUST_CHRG_PSN_CD_R() throws FoundationException { return m_doRs.getString(20); }
		public String getCURRNCY_CD_R() throws FoundationException { return m_doRs.getString(21); }
		public String getDLV_LOC_CD_R() throws FoundationException { return m_doRs.getString(22); }
		public String getDLV_LOC_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(23); }
		public String getODR_UNIT_PRICE_R() throws FoundationException { return m_doRs.getString(24); }
		public String getSHIP_CNT_R() throws FoundationException { return m_doRs.getString(25); }
		public String getDEPO_TYP_R() throws FoundationException { return m_doRs.getString(26); }
		public String getDESINATED_DLV_DATE_R() throws FoundationException { return m_doRs.getString(27); }
		public String getODR_QTY_R() throws FoundationException { return m_doRs.getString(28); }
		public String getUNIT_CD_R() throws FoundationException { return m_doRs.getString(29); }
		public String getCUS_DLV_KEY_CD_R() throws FoundationException { return m_doRs.getString(30); }
		public String getPART_NAME_R() throws FoundationException { return m_doRs.getString(31); }
		public String getUNIT_CD_ORG_R() throws FoundationException { return m_doRs.getString(32); }
		public String getPUCH_ODR_QTY_TOTAL_R() throws FoundationException { return m_doRs.getString(33); }
		public String getBUYER_NAME_R() throws FoundationException { return m_doRs.getString(34); }
		public String getINSPC_TYP_R() throws FoundationException { return m_doRs.getString(35); }
		public String getCLIENT_REMARK_R() throws FoundationException { return m_doRs.getString(36); }
		public String getCLIENT_BARCODE_INF_R() throws FoundationException { return m_doRs.getString(37); }
		public String getTRANSPORT_CD_R() throws FoundationException { return m_doRs.getString(38); }
		public String getREMARKS_R() throws FoundationException { return m_doRs.getString(39); }
		public String getPARTIAL_SHIP_INST_FLG_R() throws FoundationException { return m_doRs.getString(40); }
		public String getEXCH_TYP_R() throws FoundationException { return m_doRs.getString(41); }
		public String getTAX_CD_R() throws FoundationException { return m_doRs.getString(42); }
		public String getCUR_CD_R() throws FoundationException { return m_doRs.getString(43); }
		public String getEXCH_TYP_1_R() throws FoundationException { return m_doRs.getString(44); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setreadTAnsDlvDateODR_NO(getODR_NO_R());
				m_med.setreadTAnsDlvDatePART_DLV_SEQ_NO(getPART_DLV_SEQ_NO_R());
				m_med.setreadTAnsDlvDatePRVS_ANS_DLV_DATE_RCD(getPRVS_ANS_DLV_DATE_RCD_R());
				m_med.setreadTAnsDlvDateLAST_ANS_DLV_DATE_RCD(getLAST_ANS_DLV_DATE_RCD_R());
				m_med.setreadTAnsDlvDateDESINATED_SHIP_DATE(getDESINATED_SHIP_DATE_R());
				m_med.setreadTAnsDlvDateDESINATED_SHIP_QTY(getDESINATED_SHIP_QTY_R());
				m_med.setreadTAnsDlvDateREST_SHIP_ODR_QTY(getREST_SHIP_ODR_QTY_R());
				m_med.setreadTAnsDlvDateSHIP_ODR_CMPLT_FLG(getSHIP_ODR_CMPLT_FLG_R());
				m_med.setreadTAnsDlvDateDEL_FLG(getDEL_FLG_R());
				m_med.setreadTAnsDlvDateCUST_ITEM_CD(getCUST_ITEM_CD_R());
				m_med.setreadTAnsDlvDateITEM_CD(getITEM_CD_R());
				m_med.setreadTAnsDlvDateCUST_CD(getCUST_CD_R());
				m_med.setreadTAnsDlvDatePKG_UNIT_QTY(getPKG_UNIT_QTY_R());
				m_med.setreadTAnsDlvDateCUST_ANAME(getCUST_NAME_R());
				m_med.setreadTAnsDlvDateDETAIL_ROUND_TYP(getDETAIL_ROUND_TYP_R());
				m_med.setreadTAnsDlvDateTRANSPORT_LT(getTRANSPORT_LT_R());
				m_med.setreadTAnsDlvDateSHIP_WH_CD(getSHIP_WH_CD_R());
				m_med.setreadTAnsDlvDateDEPO_WH_CD(getDEPO_WH_CD_R());
				m_med.setreadTAnsDlvDateCUST_ODR_NO(getCUST_ODR_NO_R());
				m_med.setreadTAnsDlvDateCUST_CHRG_PSN_CD(getCUST_CHRG_PSN_CD_R());
				m_med.setreadTAnsDlvDateCURRNCY_CD(getCURRNCY_CD_R());
				m_med.setreadTAnsDlvDateDLV_LOC_CD(getDLV_LOC_CD_R());
				m_med.setreadTAnsDlvDateDLV_LOC_NAME_KANJI(getDLV_LOC_NAME_KANJI_R());
				m_med.setreadTAnsDlvDateODR_UNIT_PRICE(getODR_UNIT_PRICE_R());
				m_med.setreadTAnsDlvDateSHIP_CNT(getSHIP_CNT_R());
				m_med.setreadTAnsDlvDateDEPO_TYP(getDEPO_TYP_R());
				m_med.setreadTAnsDlvDateDESINATED_DLV_DATE(getDESINATED_DLV_DATE_R());
				m_med.setreadTAnsDlvDateODR_QTY(getODR_QTY_R());
				m_med.setreadTAnsDlvDateUNIT_CD(getUNIT_CD_R());
				m_med.setreadTAnsDlvDateCUS_DLV_KEY_CD(getCUS_DLV_KEY_CD_R());
				m_med.setreadTAnsDlvDatePART_NAME(getPART_NAME_R());
				m_med.setreadTAnsDlvDateUNIT_CD_ORG(getUNIT_CD_ORG_R());
				m_med.setreadTAnsDlvDatePUCH_ODR_QTY_TOTAL(getPUCH_ODR_QTY_TOTAL_R());
				m_med.setreadTAnsDlvDateBUYER_NAME(getBUYER_NAME_R());
				m_med.setreadTAnsDlvDateINSPC_TYP(getINSPC_TYP_R());
				m_med.setreadTAnsDlvDateCLIENT_REMARK(getCLIENT_REMARK_R());
				m_med.setreadTAnsDlvDateCLIENT_BARCODE_INF(getCLIENT_BARCODE_INF_R());
				m_med.setreadTAnsDlvDateTRANSPORT_CD(getTRANSPORT_CD_R());
				m_med.setreadTAnsDlvDateREMARKS(getREMARKS_R());
				m_med.setreadTAnsDlvDatePARTIAL_SHIP_INST_FLG(getPARTIAL_SHIP_INST_FLG_R());
				m_med.setreadTAnsDlvDateEXCH_TYP(getEXCH_TYP_R());
				m_med.setreadTAnsDlvDateTAX_CD(getTAX_CD_R());
				m_med.setreadTAnsDlvDateCUR_CD(getCUR_CD_R());
				m_med.setreadTAnsDlvDateEXCH_TYP_R(getEXCH_TYP_1_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "next", "���R�[�h�ړ����s");
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
				BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "hasRecord", "���R�[�h���݃`�F�b�N���s");
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
			BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "prepareALL(FoundationException)", "SQL����prepare�Ŏ��s���܂���");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("tblT_ANS_DLV_DATE", "prepareALL(SQLException)", "SQL����prepare�Ŏ��s���܂���");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * tblT_ANS_DLV_DATE�N���X�̕W���R���X�g���N�^
	 *
		 */
	public tblT_ANS_DLV_DATE(medKU0010B001 med, BatchAppConductor cdr) throws SystemException
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
+"  T_ANS_DLV_DATE.\"ODR_NO\" as \"ODR_NO\", "
+"  T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  T_ANS_DLV_DATE.\"PRVS_ANS_DLV_DATE_RCD\" as \"PRVS_ANS_DLV_DATE_RCD\", "
+"  T_ANS_DLV_DATE.\"LAST_ANS_DLV_DATE_RCD\" as \"LAST_ANS_DLV_DATE_RCD\", "
+"  TO_CHAR(T_ANS_DLV_DATE.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"DESINATED_SHIP_DATE\", "
+"  T_ANS_DLV_DATE.\"DESINATED_SHIP_QTY\" as \"DESINATED_SHIP_QTY\", "
+"  T_ANS_DLV_DATE.\"REST_SHIP_ODR_QTY\" as \"REST_SHIP_ODR_QTY\", "
+"  T_ANS_DLV_DATE.\"SHIP_ODR_CMPLT_FLG\" as \"SHIP_ODR_CMPLT_FLG\", "
+"  T_ANS_DLV_DATE.\"DEL_FLG\" as \"DEL_FLG\", "
+"  T_ODR_CTL.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR_CTL.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ODR_CTL.\"CUST_CD\" as \"CUST_CD\", "
+"  M_ITEM.\"PKG_UNIT_QTY\" as \"PKG_UNIT_QTY\", "
+"  M_CUST.\"CUST_NAME\" as \"CUST_NAME\", "
+"  M_CUST.\"DETAIL_ROUND_TYP\" as \"DETAIL_ROUND_TYP\", "
+"  M_CUST_BASE.\"TRANSPORT_LT\" as \"TRANSPORT_LT\", "
+"  M_CUST_BASE.\"SHIP_WH_CD\" as \"SHIP_WH_CD\", "
+"  M_CUST_BASE.\"DEPO_WH_CD\" as \"DEPO_WH_CD\", "
+"  T_ODR.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  T_ODR.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_ODR.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_ODR.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  T_ODR.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_ODR.\"ODR_UNIT_PRICE\" as \"ODR_UNIT_PRICE\", "
+"  NVL(T_ODR.\"SHIP_CNT\", 0) as \"SHIP_CNT\", "
+"  T_ODR.\"DEPO_TYP\" as \"DEPO_TYP\", "
+"  TO_CHAR(T_ODR.\"DESINATED_DLV_DATE\", 'YYYY/MM/DD') as \"DESINATED_DLV_DATE\", "
+"  T_ODR.\"ODR_QTY\" as \"ODR_QTY\", "
+"  T_ODR.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_ODR.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  T_ODR.\"PART_NAME\" as \"PART_NAME\", "
+"  T_ODR.\"UNIT_CD_ORG\" as \"UNIT_CD_ORG\", "
+"  T_ODR.\"PUCH_ODR_QTY_TOTAL\" as \"PUCH_ODR_QTY_TOTAL\", "
+"  T_ODR.\"BUYER_NAME\" as \"BUYER_NAME\", "
+"  T_ODR.\"INSPC_TYP\" as \"INSPC_TYP\", "
+"  T_ODR.\"CLIENT_REMARK\" as \"CLIENT_REMARK\", "
+"  T_ODR.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\", "
+"  T_ODR.\"TRANSPORT_CD\" as \"TRANSPORT_CD\", "
+"  T_ODR.\"REMARKS\" as \"REMARKS\", "
+"  T_ODR.\"PARTIAL_SHIP_INST_FLG\" as \"PARTIAL_SHIP_INST_FLG\", "
+"  T_ODR.\"EXCH_TYP\" as \"EXCH_TYP\", "
+"  T_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  M_CUST.\"CUR_CD\" as \"CUR_CD\", "
+"  M_CUST.\"EXCH_TYP\" as \"EXCH_TYP_1\" "
+"from "
+"  T_ANS_DLV_DATE, "
+"  T_ODR, "
+"  T_ODR_CTL, "
+"  M_CUST_BASE, "
+"  M_ITEM, "
+"  M_CUST "
+"where "
+"  T_ANS_DLV_DATE.ODR_NO = T_ODR.ODR_NO "
+"  and T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO "
+"  and M_CUST_BASE.\"CUST_CD\" = T_ODR_CTL.\"CUST_CD\" "
+"  and M_CUST_BASE.\"DLV_LOC_CD\" = T_ODR.\"DLV_LOC_CD\" "
+"  and M_CUST.\"COMPANY_CD\" = M_CUST_BASE.\"COMPANY_CD\" "
+"  and M_CUST.\"CUST_CD\" = T_ODR_CTL.\"CUST_CD\" "
+"  and M_ITEM.\"ITEM_CD\" = T_ODR_CTL.\"ITEM_CD\" "
+"  and T_ANS_DLV_DATE.\"SHIP_ODR_CMPLT_FLG\" = 0 "
+"  and T_ANS_DLV_DATE.\"DEL_FLG\" = 0 "
+"  and T_ANS_DLV_DATE.\"DESINATED_SHIP_DATE\" <= TO_DATE(?) "
+"  and M_CUST_BASE.\"COMPANY_CD\" = ? "
+"order by "
+"  T_ODR_CTL.\"ITEM_CD\", "
+"  M_CUST_BASE.\"SHIP_WH_CD\", "
+"  T_ANS_DLV_DATE.\"DESINATED_SHIP_DATE\", "
+"  T_ANS_DLV_DATE.\"ODR_NO\", "
+"  T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\"";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  T_ANS_DLV_DATE "
+"set "
+"  \"REST_SHIP_ODR_QTY\" = ?, "
+"  \"SHIP_ODR_CMPLT_FLG\" = ? "
+"where "
+"  T_ANS_DLV_DATE.\"PART_DLV_SEQ_NO\" = ? "
+"  and T_ANS_DLV_DATE.\"ODR_NO\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
