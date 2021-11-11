/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/insertT_OPR_RSLT_TEMP_HISTORY.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B001;

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
 * CLASS     : insertT_OPR_RSLT_TEMP_HISTORY �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.12 $ $Date: 2015/12/22 09:52:53 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class insertT_OPR_RSLT_TEMP_HISTORY extends AbstractBatchAppEntity
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

		public void setEXPR_C(String value) throws FoundationException { getAdapt_C().setString(1, value); }
		public void setIN1_C(String value) throws FoundationException { getAdapt_C().setString(2, value); }
		public void setIN2_C(String value) throws FoundationException { getAdapt_C().setString(3, value); }
		public void setIN3_C(String value) throws FoundationException { getAdapt_C().setString(4, value); }
		public void setIN4_C(String value) throws FoundationException { getAdapt_C().setString(5, value); }
		public void setIN5_C(String value) throws FoundationException { getAdapt_C().setString(6, value); }
		public void setIN6_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setIN7_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setIN8_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setB1_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setB2_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setIN11_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setIN12_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setIN13_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }

		public int create() throws BatchAppException
		{
			try {
				setEXPR_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN1_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN2_C(m_med.getRSLT_TAKE_ERR_TYP());
				setIN3_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN4_C(m_med.getRSLT_TAKE_ERR_INFO());
				setIN5_C(m_med.getUSER_CD());
				setIN6_C(m_med.getPRG_NM());
				setIN7_C(m_med.getUSER_CD());
				setIN8_C(m_med.getPRG_NM());
				setB1_C(m_med.getINTAKE_TERM_FROM());
				setB2_C(m_med.getINTAKE_TERM_TO());
				setIN11_C(m_med.getOPR_INST_CD());
				setIN12_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN13_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("insertT_OPR_RSLT_TEMP_HISTORY", "create", "���R�[�h�V�K�ǉ��p�����[�^�ݒ菈�����s");
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
	 * insertT_OPR_RSLT_TEMP_HISTORY�N���X�̕W���R���X�g���N�^
	 *
		 */
	public insertT_OPR_RSLT_TEMP_HISTORY(medAD0080B001 med, BatchAppConductor cdr) throws SystemException
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
	public medAD0080B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntity�N���X�C���X�^���X
	public interEntity m_entity=new interEntity();

	// �e��ԂŎ��s����sql���̒�`
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_OPR_RSLT_TEMP_HISTORY(OPR_RSLT_TEMP_CTL_NO, OPR_INST_CD, ITEM_CD, ACPT_QTY, DEFECT_QTY, OPR_DATE, WH_CD, WS_CD, OPR_RSLT_PERSON, OPR_RSLT_COMMENT, OPR_TIME_UNIT_TYP, PRE_ARRANGEMENT_TIME, POST_ARRANGEMENT_TIME, OPR_TIME, CESSATION_TIME, CESSATION_CAUSE, LOT_NO, VEND_LOT_NO, DEFECT_CAUSE_CD1, DEFECT_QTY1, DEFECT_COMMENT1, DEFECT_CAUSE_CD2, DEFECT_QTY2, DEFECT_COMMENT2, DEFECT_CAUSE_CD3, DEFECT_QTY3, DEFECT_COMMENT3, DEFECT_CAUSE_CD4, DEFECT_QTY4, DEFECT_COMMENT4, DEFECT_CAUSE_CD5, DEFECT_QTY5, DEFECT_COMMENT5, OPR_CMPLT_FLG, TAKE_DATE, TAKE_TYP, RSLT_TAKE_ERR_TYP, RSLT_TAKE_ERR_INFO, CREATED_DATE, CREATED_BY, CREATED_PRG_NM, UPDATED_DATE, UPDATED_BY, UPDATED_PRG_NM, MODIFY_COUNT) "
+"select "
+"  OPR_RSLT_TEMP_CTL_NO, "
+"  OPR_INST_CD, "
+"  ITEM_CD, "
+"  ACPT_QTY, "
+"  DEFECT_QTY, "
+"  OPR_DATE, "
+"  WH_CD, "
+"  WS_CD, "
+"  OPR_RSLT_PERSON, "
+"  OPR_RSLT_COMMENT, "
+"  OPR_TIME_UNIT_TYP, "
+"  PRE_ARRANGEMENT_TIME, "
+"  POST_ARRANGEMENT_TIME, "
+"  OPR_TIME, "
+"  CESSATION_TIME, "
+"  CESSATION_CAUSE, "
+"  LOT_NO, "
+"  VEND_LOT_NO, "
+"  DEFECT_CAUSE_CD1, "
+"  DEFECT_QTY1, "
+"  DEFECT_COMMENT1, "
+"  DEFECT_CAUSE_CD2, "
+"  DEFECT_QTY2, "
+"  DEFECT_COMMENT2, "
+"  DEFECT_CAUSE_CD3, "
+"  DEFECT_QTY3, "
+"  DEFECT_COMMENT3, "
+"  DEFECT_CAUSE_CD4, "
+"  DEFECT_QTY4, "
+"  DEFECT_COMMENT4, "
+"  DEFECT_CAUSE_CD5, "
+"  DEFECT_QTY5, "
+"  DEFECT_COMMENT5, "
+"  OPR_CMPLT_FLG, "
+"  TAKE_DATE, "
+"  DECODE(?, NULL, '10', '20'), "
+"  CASE "
+"    WHEN OPR_RSLT_TEMP_CTL_NO = ? THEN ? "
+"    ELSE '' "
+"  END, "
+"  CASE "
+"    WHEN OPR_RSLT_TEMP_CTL_NO = ? THEN ? "
+"    ELSE '' "
+"  END, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  0 "
+"FROM "
+"  T_OPR_RSLT_TEMP "
+"WHERE "
+"  TAKE_DATE >= TO_DATE(NVL(?, '0001/01/01'), 'YYYY/MM/DD') "
+"  and TAKE_DATE <= TO_DATE(NVL(?, '9999/12/31'), 'YYYY/MM/DD') "
+"  AND OPR_INST_CD = ? "
+"  AND (? is null or OPR_RSLT_TEMP_CTL_NO = ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// �g�����U�N�V�������p�̉ۂ�ݒ肵�܂�
	boolean m_useTransaction=true;

	//////////////////////////////

}
