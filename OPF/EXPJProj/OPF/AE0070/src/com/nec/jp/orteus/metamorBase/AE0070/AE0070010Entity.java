/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0070/src/com/nec/jp/orteus/metamorBase/AE0070/AE0070010Entity.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN�Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ����i�\�[�X�w�b�_�E�N���X�w�b�_�ύX�j
 * 3.0.5.1 (2004/12/21),MySQL��Postgresql�̑Ή�
 * 3.0.5.0 (2004/12/06),mv_dbms/mv_dbms_dynamic_sql/mv_std_dbms �p�^�[���̃o�O���C��
 * 3.0.4.3 (2004/09/30),�G���e�B�e�B�^�C�vcsv�̍ہA�s�v�ȃC���i�[�N���X���쐬����o�O�̉���
 * 3.0.4.2 (2004/09/29),�G���e�B�e�B�^�C�v�p�^�[��csv�̍ہA�\�[�X�������ł��Ȃ��o�O�̉���
 * 3.0.4.1 (2004/08/31),�O�p�[�W�����J�X�^�}�C�Y���ɒǉ������s�v�ȃG���e�B�e�B�^�C�v�p�^�[���̍폜
 * 3.0.4.0 (2004/08/20),TRUST-V�v���W�F�N�g�t�B�[�h�o�b�N�i�G���e�B�e�B�^�C�v�p�^�[���̃o�O�j
 * 3.0.3.0 (2004/08/04),TRUST-V�v���W�F�N�g�t�B�[�h�o�b�N�i�\�[�g�����ύX�j
 * 3.0.2.6 (2004/06/29),select_MAX_count�̎擾����container�̎擾���@�̏C��
 * 3.0.2.5 (2004/05/28),�_�E�����[�h��A�����s�����FileNotFoundException����������o�O�̏C��
 * 3.0.2.4 (2004/04/16),���ISQL�Ή���Insert/Update/Delete���ɂ��ǉ�
 * 3.0.2.3 (2004/03/05),ei_Sysdate::read(Connection conn)���Ő�������Statement�𗘗p����悤�ɏC��
 * 3.0.2.2 (2003/12/25),DB2���ݎ������擾����SQL���C��
 * 3.0.2.1 (2003/10/28),call���\�b�h���p���̈����ݒ���@��DataObject�̃��\�b�h�ɕύX
 * 3.0.2.0 (2003/08/04),�S�Ă�Entity Type��check���\�b�h�̒ǉ�
 * 3.0.1.1 (2003/07/04),check���\�b�h���p���̃G���[�C��
 * 3.0.1.0 (2003/06/05),javadoc�R�����g�G���[�C��,Stored Procedure�Ή��ǉ�
 * 3.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 2.1.3.0 (2003/03/31),SQLParser�Ή�,�o�O�C��
 * 2.1.2.0 (2003/03/12),OrteusStudio/PDConnector�Ή�(�X�V�nEntity�ݒ�f�[�^���|�W�g���C���j
 * 2.1.1.0 (2003/01/22),OrteusStudio/PDConnector�Ή�(�擾�f�[�^�^�v���p�e�B�C��)
 * 2.1.0.0 (2002/12/17),doRecordset�̔p�~�BResultSet�֏C��,Logging package�C��
 * 2.0.1.0 (2002/10/15),DB2�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.AE0070;

import com.nec.jp.orteus.util.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.xaf.wa.sqlparser.*;
import com.nec.jp.orteus.xaf.eo.*;

import com.nec.jp.orteus.util.logging.*;

import java.util.Date;
import java.util.*;
import java.sql.*;

import com.nec.jp.orteus.expj.exception.*;

//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0070010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0070010Entity extends DataObject
{

	//////////////////////////////

	//{{user_implement_dev:fixed_number

	// SQL��������`�̏ꍇ
	final static int ERROR_SQLNOTDEFINE = 999999;

        //}}user_implement_dev:fixed_number

	//////////////////////////////
	// �V�X�e�����t�擾Entity
	public ei_Sysdate mei_Sysdate = new ei_Sysdate();

	// CSV�o��Entity
	public ei_CSVOut mei_CSVOut = new ei_CSVOut();

	// Select�N���X �C���X�^���X
	public Select mSelect = new Select();

	// M_PLANT�N���X �C���X�^���X
	public M_PLANT mM_PLANT = new M_PLANT();

	// M_VEND_CTRL�N���X �C���X�^���X
	public M_VEND_CTRL mM_VEND_CTRL = new M_VEND_CTRL();

	// M_ITEM�N���X �C���X�^���X
	public M_ITEM mM_ITEM = new M_ITEM();

	// USER_MST�N���X �C���X�^���X
	public USER_MST mUSER_MST = new USER_MST();

	// T_RLSD_PUCH_ODR_LOCK�N���X �C���X�^���X
	public T_RLSD_PUCH_ODR_LOCK mT_RLSD_PUCH_ODR_LOCK = new T_RLSD_PUCH_ODR_LOCK();

	// T_RLSD_PUCH_ODR�N���X �C���X�^���X
	public T_RLSD_PUCH_ODR mT_RLSD_PUCH_ODR = new T_RLSD_PUCH_ODR();

	// SYS_DATE_CTRL�N���X �C���X�^���X
	public SYS_DATE_CTRL mSYS_DATE_CTRL = new SYS_DATE_CTRL();

	// checkT_RLSD_PUCH_ODR�N���X �C���X�^���X
	public checkT_RLSD_PUCH_ODR mcheckT_RLSD_PUCH_ODR = new checkT_RLSD_PUCH_ODR();

	// SelectCnt�N���X �C���X�^���X
	public SelectCnt mSelectCnt = new SelectCnt();


	//////////////////////////////

	// �V�X�e�����t�̕ϐ��ݒ�
	public String sSysdate = "";

	/**
	 * �V�X�e�����t�擾����
	 */
	public class ei_Sysdate extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_Sysdate_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ei_Sysdate_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public String read(IDbConnection conn) throws FoundationException, SQLException
		{
			return read(conn.getConn());
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return �V�X�e��������Ԃ��܂�
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public String read(Connection conn) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			String query=null;

			if(m_selcmd==null) throw new FoundationException("ei_Sysdate", "read", "�N�G���[���o�^");

			if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd));
			} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MSSQL));
			} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_PGS));
			} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
				stmt=prepare(conn, (query=m_selcmd_MySQL));
			} else {
				stmt=prepare(conn, (query=m_selcmd_DB2));
			}

			ResultSet rs=executeQuery(stmt);

			try {
				return next(rs);
			} finally {
				stmt.close();
				stmt = null;
			}
			//{{user_implement_dev:ei_Sysdate_read
				// TODO: �����Ƀ��[�U�������L�q���Ă�������
                        //}}user_implement_dev:ei_Sysdate_read
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query) throws FoundationException, SQLException
		{
			PreparedStatement stmt;

			stmt = conn.prepareStatement(query);

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public String next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			sSysdate = getString(1, rs);

			return sSysdate;
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_Sysdate_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ei_Sysdate_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_Sysdate�N���X�̕W���R���X�g���N�^
		 */
		public ei_Sysdate()
		{
			//{{user_implement_dev:ei_Sysdate_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ei_Sysdate_constractor

			return;
		}

		//////////////////////////////

		// �e��ԂŎ��s����sql���̒�`
		protected String m_selcmd = "select to_char(sysdate,'YYYY/MM/DD HH24:MI:SS') from dual "
+"";
		protected String m_selcmd_MSSQL = "select convert(varchar(19),getdate(),111)+' '+convert(varchar(19),getdate(),114)"
+"";
		protected String m_selcmd_PGS = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') "
+"";
		protected String m_selcmd_MySQL = "select date_format(sysdate(), '%Y-%m-%d %H:%i:%s') "
+"";
		protected String m_selcmd_DB2 = "select TO_CHAR(SYSDATE(),'YYYY/MM/DD HH24:MI:SS') from SYSIBM.SYSDUMMY1 "
+"";		//////////////////////////////

	}

	//////////////////////////////

	/**
	 * CSV�o�̓f�t�H���g�N���X
	 */
	public class ei_CSVOut extends DataObject
	{

		//////////////////////////////

		//{{user_implement_dev:ei_CSVOut_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ei_CSVOut_def

		/**
		 * �f�[�^�����ݏ���
		 *
		 * @param list �e�[�u���񍀖ڃ��X�g�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public void create(List list, String sTitle[]) throws FoundationException
		{
			String sColums[] = null;
			String sbuff[] = null;
			int nMax_length = 0;
			int nlength = 0;

			if(m_write_fname==null || m_write_fname.length()==0) throw new FoundationException("ei_CSVOut", "create", "�t�@�C����񖢓o�^");

			try {
				if (m_writer == null) {
					m_writer = new WriteCsv();
				}
				m_writer.open(m_write_path, m_write_fname);

				// �^�C�g���̐ݒ�
				if(sTitle != null) {
					m_writer.beginIns();
					for(int w=0, cw=sTitle.length; w<cw; w++) {
						m_writer.addCell( sTitle[w] );
					}
					m_writer.endIns();
				}

				if((list == null) || (list.size() == 0)) return;

				// �f�[�^�̐ݒ�
				for(int z=0, cz=list.size(); z<cz; z++) {
					sbuff = (String[])list.get(z);
					if(sbuff == null) continue;
					nlength = sbuff.length;
					if(nlength > nMax_length) {
						nMax_length = nlength;
					}
				}

				for(int y=0, cy=nMax_length; y<cy; y++) {
					m_writer.beginIns();
					for(int x=0, cx=list.size(); x<cx; x++) {
						sColums = (String[])list.get(x);
						m_writer.addCell( sColums[y] );
					}
					m_writer.endIns();
				}
			} catch(FoundationException e) {
				return;
			} finally {
				if (m_writer != null) {
					m_writer.close();
					m_writer = null;
				}
			}

			return;
		}

		//////////////////////////////

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:ei_CSVOut_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ei_CSVOut_clear

			return;
		}

		//////////////////////////////

		/**
		 * ei_CSVOut�N���X�̕W���R���X�g���N�^
		 */
		public ei_CSVOut()
		{
			//{{user_implement_dev:ei_CSVOut_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv�p�̕ϐ�
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AE0070010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AE0070010";

		/**
		 * CSV�t�@�C����setter/getter���\�b�h
		 */
		public void setPath(String spath) {m_write_path = spath;}
		public String getPath() {return m_write_path;}
		public void setFname(String sfilename) {m_write_fname = sfilename;}
		public String getFname() {return m_write_fname;}

		//////////////////////////////

	}

	//////////////////////////////
	/**
	 * Entity��` �ÓISQL
	 */
	public class Select extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.PLANT_CD AS PLANT_CD, "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') AS \"PUCH_ODR_START_DATE\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') AS \"PUCH_ODR_DLV_DATE\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\", 'FM999999999999999990.0999') AS \"PUCH_ODR_QTY\", "
+"  DECODE(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"STOCK_UNIT\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_PUCH_ODR_UNIT\") AS \"STOCK_UNIT\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"PUCH_ODR_SLIP_ISS_DATE\", 'YYYY/MM/DD') AS \"PUCH_ODR_SLIP_ISS_DATE\", "
+"  TO_CHAR(A.\"ACPT_DATE\", 'YYYY/MM/DD') AS \"ACPT_DATE\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\", 'YYYY/MM/DD') AS \"ODR_CANCEL_SLIP_ISS_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_RLSD_PUCH_ODR.\"VEND_CD\" AS \"VEND_CD\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" AS \"VEND_ANAME\", "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  DECODE(T_RLSD_PUCH_ODR.\"NON_NO_ITEM_FLG\", 0, M_ITEM.\"ITEM_NAME\", T_RLSD_PUCH_ODR.\"NON_NO_ITEM_NAME\") AS \"ITEM_NAME\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" AS \"PUCH_ODR_PERSON\", "
+"  USER_MST.\"USER_NAME\" AS \"USER_NAME\", "
+"  T_RLSD_PUCH_ODR.\"ODR_CANCEL_CAUSE_CD\" AS \"ODR_CANCEL_CAUSE_CD\", "
+"  A.\"ACPT_RSLT_COMMENT\" AS \"ACPT_RSLT_COMMENT\", "
+"  TO_CHAR(T_RLSD_PUCH_ODR.\"MODIFY_COUNT\") AS \"MODIFY_COUNT\" "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  T_OD, "
+"  USER_MST, "
+"  ( "
+"    SELECT "
+"      PUCH_ODR_CD, "
+"      ACPT_DATE, "
+"      ACPT_RSLT_COMMENT "
+"    FROM "
+"      T_ACPT_RSLT "
+"    WHERE "
+"      ACPT_NO = 1 "
+"  ) A "
+"WHERE "
+"  T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = A.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  AND T_RLSD_PUCH_ODR.\"PLANT_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_RLSD_PUCH_ODR.\"VEND_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ITEM_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\" = ? "
+"ORDER BY "
+"  T_RLSD_PUCH_ODR.\"PLANT_CD\", "
+"  A.\"ACPT_DATE\", "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Select_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Select_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read
			if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read2
			if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read3
			if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_FROM());
				if(isNull(data.getPUCH_ODR_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_TO());
				if(isNull(data.getPUCH_ODR_START_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_FROM());
				if(isNull(data.getPUCH_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_TO());
				if(isNull(data.getPUCH_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_FROM());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_TO());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_FLG());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Select", "prepare", "Parse���s:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_FROM())) setString(no ++, data.getPUCH_ODR_START_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_TO())) setString(no ++, data.getPUCH_ODR_START_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_FROM())) setString(no ++, data.getPUCH_ODR_DLV_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_TO())) setString(no ++, data.getPUCH_ODR_DLV_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_PERSON())) setString(no ++, data.getPUCH_ODR_PERSON(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_START_DATE( getString(2, rs) );
			data.setl_PUCH_ODR_DLV_DATE( getString(3, rs) );
			data.setl_PUCH_ODR_QTY( getString(4, rs) );
			data.setl_STOCK_UNIT( getString(5, rs) );
			data.setl_PUCH_ODR_SLIP_ISS_DATE( getString(6, rs) );
			data.setl_ACPT_DATE( getString(7, rs) );
			data.setl_ODR_CANCEL_SLIP_ISS_DATE( getString(8, rs) );
			data.setl_PUCH_ODR_CD( getString(9, rs) );
			data.setl_JOB_ODR_CD( getString(10, rs) );
			data.setl_VEND_CD( getString(11, rs) );
			data.setl_VEND_ANAME( getString(12, rs) );
			data.setl_ITEM_CD( getString(13, rs) );
			data.setl_ITEM_NAME( getString(14, rs) );
			data.setl_PUCH_ODR_PERSON( getString(15, rs) );
			data.setl_USER_NAME( getString(16, rs) );
			data.setl_ODR_CANCEL_CAUSE_CD( getString(17, rs) );
			data.setl_ACPT_RSLT_COMMENT( getString(18, rs) );
			data.setl_MODIFY_COUNT( getString(19, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:Select_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Select_clear

			return;
		}

		/**
		 * Select�N���X�̕W���R���X�g���N�^
		 */
		public Select()
		{
			//{{user_implement_dev:Select_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Select_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_PLANT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PLANT.\"PLANT_NAME\" AS \"PLANT_NAME\" "
+"FROM "
+"  M_PLANT "
+"WHERE "
+"  M_PLANT.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_PLANT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:M_PLANT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_PLANT", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_PLANT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_PLANT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:M_PLANT_clear

			return;
		}

		/**
		 * M_PLANT�N���X�̕W���R���X�g���N�^
		 */
		public M_PLANT()
		{
			//{{user_implement_dev:M_PLANT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:M_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\" "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_VEND_CTRL.\"VEND_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_VEND_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:M_VEND_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setVEND_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_VEND_CTRL", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_VEND_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_VEND_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_VEND_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:M_VEND_CTRL_clear

			return;
		}

		/**
		 * M_VEND_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public M_VEND_CTRL()
		{
			//{{user_implement_dev:M_VEND_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:M_VEND_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\" "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_ITEM_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:M_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_ITEM", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:M_ITEM_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:M_ITEM_clear

			return;
		}

		/**
		 * M_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public M_ITEM()
		{
			//{{user_implement_dev:M_ITEM_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class USER_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_MST.\"USER_NAME\" AS \"USER_NAME\" "
+"FROM "
+"  USER_MST "
+"WHERE "
+"  USER_MST.\"USER_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:USER_MST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:USER_MST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read2
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_read3
			if(m_selcmd==null) throw new FoundationException("USER_MST", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPUCH_ODR_PERSON(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setUSER_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("USER_MST", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:USER_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:USER_MST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:USER_MST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:USER_MST_clear

			return;
		}

		/**
		 * USER_MST�N���X�̕W���R���X�g���N�^
		 */
		public USER_MST()
		{
			//{{user_implement_dev:USER_MST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:USER_MST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_RLSD_PUCH_ODR_LOCK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD AS PUCH_ODR_CD "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  T_OD, "
+"  USER_MST, "
+"  ( "
+"    SELECT "
+"      PUCH_ODR_CD, "
+"      ACPT_DATE, "
+"      ACPT_RSLT_COMMENT "
+"    FROM "
+"      T_ACPT_RSLT "
+"    WHERE "
+"      ACPT_NO = 1 "
+"  ) A "
+"WHERE "
+"  T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = A.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  AND T_RLSD_PUCH_ODR.\"PLANT_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_RLSD_PUCH_ODR.\"VEND_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ITEM_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\" = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_LOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read2
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_LOCK", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read3
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_LOCK", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_FROM());
				if(isNull(data.getPUCH_ODR_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_TO());
				if(isNull(data.getPUCH_ODR_START_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_FROM());
				if(isNull(data.getPUCH_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_TO());
				if(isNull(data.getPUCH_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_FROM());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_TO());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_FLG());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_RLSD_PUCH_ODR_LOCK", "prepare", "Parse���s:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_FROM())) setString(no ++, data.getPUCH_ODR_START_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_TO())) setString(no ++, data.getPUCH_ODR_START_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_FROM())) setString(no ++, data.getPUCH_ODR_DLV_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_TO())) setString(no ++, data.getPUCH_ODR_DLV_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_PERSON())) setString(no ++, data.getPUCH_ODR_PERSON(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_RLSD_PUCH_ODR_LOCK", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR_LOCK�N���X�̕W���R���X�g���N�^
		 */
		public T_RLSD_PUCH_ODR_LOCK()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_LOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_LOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_RLSD_PUCH_ODR "
+"SET "
+"  ODR_CANCEL_SLIP_ISS_FLG = TO_NUMBER(?), "
+"  ODR_CANCEL_SLIP_ISS_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"WHERE "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AE0070010";
		protected String m_sUpdateProgramName="AE0070010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_RLSD_PUCH_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:T_RLSD_PUCH_ODR_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);
				setString(5, data.getODR_CANCEL_SLIP_ISS_DATE(), stmt);
				setString(6, data.getPUCH_ODR_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * T_RLSD_PUCH_ODR�N���X�̕W���R���X�g���N�^
		 */
		public T_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:T_RLSD_PUCH_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:T_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(BUSINESS_OPR_DATE, 'YYYY/MM/DD') AS BUSINESS_OPR_DATE "
+"FROM "
+"  SYS_DATE_CTRL "
+"WHERE "
+"  PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_DATE_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SYS_DATE_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_DATE_CTRL", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_DATE_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_DATE_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_DATE_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SYS_DATE_CTRL_clear

			return;
		}

		/**
		 * SYS_DATE_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public SYS_DATE_CTRL()
		{
			//{{user_implement_dev:SYS_DATE_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkT_RLSD_PUCH_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" AS \"PUCH_ODR_CD\" "
+"FROM "
+"  T_RLSD_PUCH_ODR "
+"WHERE "
+"  T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_RLSD_PUCH_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkT_RLSD_PUCH_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read2
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_read3
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;

				// �ÓISQL���̐���
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPUCH_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setPUCH_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkT_RLSD_PUCH_ODR", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_clear

			return;
		}

		/**
		 * checkT_RLSD_PUCH_ODR�N���X�̕W���R���X�g���N�^
		 */
		public checkT_RLSD_PUCH_ODR()
		{
			//{{user_implement_dev:checkT_RLSD_PUCH_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkT_RLSD_PUCH_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  T_OD, "
+"  USER_MST, "
+"  ( "
+"    SELECT "
+"      PUCH_ODR_CD, "
+"      ACPT_DATE, "
+"      ACPT_RSLT_COMMENT "
+"    FROM "
+"      T_ACPT_RSLT "
+"    WHERE "
+"      ACPT_NO = 1 "
+"  ) A "
+"WHERE "
+"  T_RLSD_PUCH_ODR.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = A.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_PERSON = USER_MST.USER_CD(+) "
+"  AND T_RLSD_PUCH_ODR.\"PLANT_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_START_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_DLV_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND A.\"ACPT_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = ? "
+"  AND T_OD.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_RLSD_PUCH_ODR.\"VEND_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ITEM_CD\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"PUCH_ODR_PERSON\" = ? "
+"  AND T_RLSD_PUCH_ODR.\"ODR_CANCEL_SLIP_ISS_FLG\" = ? "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0070010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AE0070010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_FROM());
				if(isNull(data.getPUCH_ODR_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_START_DATE_TO());
				if(isNull(data.getPUCH_ODR_START_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_FROM());
				if(isNull(data.getPUCH_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getPUCH_ODR_DLV_DATE_TO());
				if(isNull(data.getPUCH_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_FROM());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_DATE_TO());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) isNull = true;
				ary.addElement(data.getPUCH_ODR_CD());
				if(isNull(data.getPUCH_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getPUCH_ODR_PERSON());
				if(isNull(data.getPUCH_ODR_PERSON())) isNull = true;
				ary.addElement(data.getODR_CANCEL_SLIP_ISS_FLG());
				if(isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCnt", "prepare", "Parse���s:"+e.toString());
			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_FROM())) setString(no ++, data.getPUCH_ODR_START_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_START_DATE_TO())) setString(no ++, data.getPUCH_ODR_START_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_FROM())) setString(no ++, data.getPUCH_ODR_DLV_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_DLV_DATE_TO())) setString(no ++, data.getPUCH_ODR_DLV_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_FROM())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_DATE_TO())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_CD())) setString(no ++, data.getPUCH_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPUCH_ODR_PERSON())) setString(no ++, data.getPUCH_ODR_PERSON(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_CANCEL_SLIP_ISS_FLG())) setString(no ++, data.getODR_CANCEL_SLIP_ISS_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0070010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0070010Struct data = new AE0070010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			return check(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(Connection conn, AE0070010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0070010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);
			boolean ret=true;

			try {
				if(rs.next()==false) return false;


				return ret;
			} finally {
				if (rs != null) {
					rs.close();
					rs = null;
				}
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectCnt_clear

			return;
		}

		/**
		 * SelectCnt�N���X�̕W���R���X�g���N�^
		 */
		public SelectCnt()
		{
			//{{user_implement_dev:SelectCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectCnt_constractor

			return;
		}
	}

	// null������A�󔒕�����̏ꍇ��true��Ԃ��܂�
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * �N���[���i�b�v�p���\�b�h
	 *
	 */
	public void clear()
	{
		mSelect.clear();
		mSelect = null;
		mM_PLANT.clear();
		mM_PLANT = null;
		mM_VEND_CTRL.clear();
		mM_VEND_CTRL = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		mUSER_MST.clear();
		mUSER_MST = null;
		mT_RLSD_PUCH_ODR_LOCK.clear();
		mT_RLSD_PUCH_ODR_LOCK = null;
		mT_RLSD_PUCH_ODR.clear();
		mT_RLSD_PUCH_ODR = null;
		mSYS_DATE_CTRL.clear();
		mSYS_DATE_CTRL = null;
		mcheckT_RLSD_PUCH_ODR.clear();
		mcheckT_RLSD_PUCH_ODR = null;
		mSelectCnt.clear();
		mSelectCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AE0070010�N���X�̕W���R���X�g���N�^
	 */
	public AE0070010Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
			// TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_dev:constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize()
	{
		//{{user_implement_dev:entity_destractor
			// TODO: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
