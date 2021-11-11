/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0050010Entity extends DataObject
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

	// select�N���X �C���X�^���X
	public select mselect = new select();

	// checkM_PLANT�N���X �C���X�^���X
	public checkM_PLANT mcheckM_PLANT = new checkM_PLANT();

	// getSCDL_ISSUE_TOTAL_FIX�N���X �C���X�^���X
	public getSCDL_ISSUE_TOTAL_FIX mgetSCDL_ISSUE_TOTAL_FIX = new getSCDL_ISSUE_TOTAL_FIX();

	// getSCDL_ISSUE_TOTAL_NOFIX�N���X �C���X�^���X
	public getSCDL_ISSUE_TOTAL_NOFIX mgetSCDL_ISSUE_TOTAL_NOFIX = new getSCDL_ISSUE_TOTAL_NOFIX();

	// getSCDL_RCV_TOTAL_FIX�N���X �C���X�^���X
	public getSCDL_RCV_TOTAL_FIX mgetSCDL_RCV_TOTAL_FIX = new getSCDL_RCV_TOTAL_FIX();

	// getSCDL_RCV_TOTAL_NOFIX�N���X �C���X�^���X
	public getSCDL_RCV_TOTAL_NOFIX mgetSCDL_RCV_TOTAL_NOFIX = new getSCDL_RCV_TOTAL_NOFIX();

	// getDETAIL_DATA�N���X �C���X�^���X
	public getDETAIL_DATA mgetDETAIL_DATA = new getDETAIL_DATA();

	// getSYS_BAT_PARM�N���X �C���X�^���X
	public getSYS_BAT_PARM mgetSYS_BAT_PARM = new getSYS_BAT_PARM();

	// getSYS_CLASS_CODE�N���X �C���X�^���X
	public getSYS_CLASS_CODE mgetSYS_CLASS_CODE = new getSYS_CLASS_CODE();

	// checkM_PS�N���X �C���X�^���X
	public checkM_PS mcheckM_PS = new checkM_PS();

	// getT_WORK_ITEM_INFO�N���X �C���X�^���X
	public getT_WORK_ITEM_INFO mgetT_WORK_ITEM_INFO = new getT_WORK_ITEM_INFO();

	// getT_RLSD_ITEM_INFO�N���X �C���X�^���X
	public getT_RLSD_ITEM_INFO mgetT_RLSD_ITEM_INFO = new getT_RLSD_ITEM_INFO();

	// getSYS_INSTALL_OPTIONS�N���X �C���X�^���X
	public getSYS_INSTALL_OPTIONS mgetSYS_INSTALL_OPTIONS = new getSYS_INSTALL_OPTIONS();

	// getDETAIL_DATA_JA�N���X �C���X�^���X
	public getDETAIL_DATA_JA mgetDETAIL_DATA_JA = new getDETAIL_DATA_JA();

	// getDETAIL_DATA_J�N���X �C���X�^���X
	public getDETAIL_DATA_J mgetDETAIL_DATA_J = new getDETAIL_DATA_J();

	// getDETAL_DATA_JCnt�N���X �C���X�^���X
	public getDETAL_DATA_JCnt mgetDETAL_DATA_JCnt = new getDETAL_DATA_JCnt();

	// getDETAL_DATACnt�N���X �C���X�^���X
	public getDETAL_DATACnt mgetDETAL_DATACnt = new getDETAL_DATACnt();

	// getDETAIL_DATA_JACnt�N���X �C���X�^���X
	public getDETAIL_DATA_JACnt mgetDETAIL_DATA_JACnt = new getDETAIL_DATA_JACnt();

	// getT_OD_INFO�N���X �C���X�^���X
	public getT_OD_INFO mgetT_OD_INFO = new getT_OD_INFO();

	// getDM_CREATE_BASE_TBL	�N���X �C���X�^���X
	public getDM_CREATE_BASE_TBL	 mgetDM_CREATE_BASE_TBL	 = new getDM_CREATE_BASE_TBL	();

	// getDETAIL_DATA_JA_WORK	�N���X �C���X�^���X
	public getDETAIL_DATA_JA_WORK	 mgetDETAIL_DATA_JA_WORK	 = new getDETAIL_DATA_JA_WORK	();

	// getDETAIL_DATA_JA_WORKCnt	�N���X �C���X�^���X
	public getDETAIL_DATA_JA_WORKCnt	 mgetDETAIL_DATA_JA_WORKCnt	 = new getDETAIL_DATA_JA_WORKCnt	();


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
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv�p�̕ϐ�
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AG0050010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AG0050010";

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
	public class select extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_def
                //}}user_implement_dev:select_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:select_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read2
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read3
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setw_ITEM_NAME( getString(1, rs) );
			data.setSTOCK_UNIT( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("select", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:select_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_clear
                        //}}user_implement_dev:select_clear

			return;
		}

		/**
		 * select�N���X�̕W���R���X�g���N�^
		 */
		public select()
		{
			//{{user_implement_dev:select_constractor
                        //}}user_implement_dev:select_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkM_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PLANT.\"PLANT_NAME\" as \"PLANT_NAME\" "
+"from "
+"  M_PLANT "
+"where "
+"  M_PLANT.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PLANT_def
                //}}user_implement_dev:checkM_PLANT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PLANT_read
			if(m_selcmd==null) throw new FoundationException("checkM_PLANT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_PLANT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("checkM_PLANT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkM_PLANT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("checkM_PLANT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkM_PLANT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setw_PLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkM_PLANT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PLANT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("checkM_PLANT", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_PLANT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkM_PLANT_clear
                        //}}user_implement_dev:checkM_PLANT_clear

			return;
		}

		/**
		 * checkM_PLANT�N���X�̕W���R���X�g���N�^
		 */
		public checkM_PLANT()
		{
			//{{user_implement_dev:checkM_PLANT_constractor
                        //}}user_implement_dev:checkM_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSCDL_ISSUE_TOTAL_FIX extends DataObject
	{
		protected String m_selcmd = "select "
+"  sum(T_OD.\"DM_QTY\" - T_OD.\"TOTAL_ISSUE_QTY\") DUE_OUT_TOTAL_FIX "
+"from "
+"  T_OD "
+"where "
+"  T_OD.\"ITEM_CD\" = ? "
+"  and T_OD.\"PLANT_CD\" = ? "
+"  and(T_OD.\"OD_TYP\" = '3' "
+"  or  T_OD.\"OD_TYP\" = '1') "
+"  and T_OD.\"DM_STS_TYP\" = '2' "
+"  and T_OD.\"DM_QTY\" - T_OD.\"TOTAL_ISSUE_QTY\" > 0";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_FIX", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read2
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_FIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read3
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_FIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getSCDL_ISSUE_TOTAL_FIX", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSCDL_ISSUE_TOTAL_FIX( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_FIX", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_clear

			return;
		}

		/**
		 * getSCDL_ISSUE_TOTAL_FIX�N���X�̕W���R���X�g���N�^
		 */
		public getSCDL_ISSUE_TOTAL_FIX()
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_FIX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSCDL_ISSUE_TOTAL_NOFIX extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD_SUM.\"DM_QTY\" DUE_OUT_TOTAL_NOFIX "
+"from "
+"  ( "
+"    select "
+"      sum(T_OD.\"DM_QTY\") DM_QTY "
+"    from "
+"      T_OD "
+"    where "
+"      T_OD.\"ITEM_CD\" = ? "
+"      and T_OD.\"PLANT_CD\" = ? "
+"      and(T_OD.\"OD_TYP\" = '3' "
+"      or  T_OD.\"OD_TYP\" = '1') "
+"      and T_OD.\"DM_STS_TYP\" = '1' "
+"  ) T_OD_SUM";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_NOFIX", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read2
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_NOFIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read3
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_NOFIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getSCDL_ISSUE_TOTAL_NOFIX", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSCDL_ISSUE_TOTAL_NOFIX( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSCDL_ISSUE_TOTAL_NOFIX", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_clear

			return;
		}

		/**
		 * getSCDL_ISSUE_TOTAL_NOFIX�N���X�̕W���R���X�g���N�^
		 */
		public getSCDL_ISSUE_TOTAL_NOFIX()
		{
			//{{user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSCDL_ISSUE_TOTAL_NOFIX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSCDL_RCV_TOTAL_FIX extends DataObject
	{
		protected String m_selcmd = "select "
+"  sum(T_RLSD_PUCH_ODR.\"PUCH_ODR_QTY\" - T_INSPC_RSLT.\"INSPECTED_QTY\") STOCK_SCHEDULE_TOTAL_FIX "
+"from "
+"  T_RLSD_PUCH_ODR, "
+"  T_INSPC_RSLT "
+"where "
+"  T_RLSD_PUCH_ODR.\"ITEM_CD\" = ? "
+"  and T_RLSD_PUCH_ODR.\"PLANT_CD\" = ? "
+"  and T_RLSD_PUCH_ODR.\"INSPC_CMPLT_FLG\" = '0' "
+"  and T_RLSD_PUCH_ODR.\"INV_CTRL_FLG\" = '1' "
+"  and T_RLSD_PUCH_ODR.\"PUCH_ODR_CD\" = T_INSPC_RSLT.\"PUCH_ODR_CD\"(+)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_read
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_FIX", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_read2
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_FIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_read3
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_FIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getSCDL_RCV_TOTAL_FIX", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSCDL_RCV_TOTAL_FIX( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_FIX", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_clear

			return;
		}

		/**
		 * getSCDL_RCV_TOTAL_FIX�N���X�̕W���R���X�g���N�^
		 */
		public getSCDL_RCV_TOTAL_FIX()
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_FIX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_FIX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSCDL_RCV_TOTAL_NOFIX extends DataObject
	{
		protected String m_selcmd = "select "
+"  (T_OD_SUM.\"ODR_QTY\" + T_JOB_ODR_SUM.\"JOB_ODR_QTY\") STOCK_SCHEDULE_TOTAL_NOFIX "
+"from "
+"  ( "
+"    select "
+"      sum(T_OD.\"ODR_QTY\") ODR_QTY "
+"    from "
+"      T_OD "
+"    where "
+"      T_OD.\"ITEM_CD\" = ? "
+"      and T_OD.\"PLANT_CD\" = ? "
+"      and(T_OD.\"OD_TYP\" = '2' "
+"      or  T_OD.\"OD_TYP\" = '1') "
+"      and T_OD.\"ODR_STS_TYP\" = '1' "
+"  ) T_OD_SUM, "
+"  ( "
+"    select "
+"      sum(T_JOB_ODR.\"JOB_ODR_QTY\") JOB_ODR_QTY "
+"    from "
+"      T_JOB_ODR "
+"    where "
+"      T_JOB_ODR.\"ITEM_CD\" = ? "
+"      and T_JOB_ODR.\"PLANT_CD\" = ? "
+"      and T_JOB_ODR.\"JOB_ODR_STS_TYP\" = '1' "
+"  ) T_JOB_ODR_SUM";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_NOFIX", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read2
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_NOFIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read3
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_NOFIX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getSCDL_RCV_TOTAL_NOFIX", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSCDL_RCV_TOTAL_NOFIX( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSCDL_RCV_TOTAL_NOFIX", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_clear

			return;
		}

		/**
		 * getSCDL_RCV_TOTAL_NOFIX�N���X�̕W���R���X�g���N�^
		 */
		public getSCDL_RCV_TOTAL_NOFIX()
		{
			//{{user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSCDL_RCV_TOTAL_NOFIX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  A.SORT_NO AS SORT_NO, "
+"  A.DELIVERY_DATE AS DELIVERY_DATE, "
+"  A.INSIDE_ODR_QTY AS INSIDE_ODR_QTY, "
+"  NULL AS INTEGRATE_ODR_QTY, "
+"  A.DEMAND_QTY AS DEMAND_QTY, "
+"  A.STOCK_ODR_QTY AS STOCK_ODR_QTY, "
+"  A.ADD_SUBTRACT AS ADD_SUBTRACT, "
+"  A.EFFECT_STOCK_QTY AS EFFECT_STOCK_QTY, "
+"  A.PURCHASE_UNIT AS PURCHASE_UNIT, "
+"  A.NUMBER_STATUS AS NUMBER_STATUS, "
+"  A.STATUS AS STATUS, "
+"  A.WORK_ODR_CD AS WORK_ODR_CD, "
+"  A.PARENT_ORDER_NO AS PARENT_ORDER_NO, "
+"  A.PARENT_ORDER_ITEM_NO   AS PARENT_ORDER_ITEM_NO, "
+"  A.PARENT_ORDER_ITEM_NAME AS PARENT_ORDER_ITEM_NAME, "
+"  A.DEMAND_NO AS DEMAND_NO, "
+"  A.ORDER_NO AS ORDER_NO, "
+"  A.JOB_ODR_CD AS JOB_ODR_CD, "
+"  A.WH_CD AS WH_CD, "
+"  A.WH_NAME AS WH_NAME, "
+"  A.GNR AS GNR, "
+"  A.NUMBER_GNR_TYP AS NUMBER_GNR_TYP, "
+"  A.GNR_TYP AS GNR_TYP, "
+"  A.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  A.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"  A.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"  A.CUST_CD, "
+"  A.DLV_LOC_CD, "
+"  A.DESINATED_DLV_DATE, "
+"  A.ODR_ACPT_DATE, "
+"  A.VEND_CD, "
+"  A.ODR_START_DATE, "
+"  A.PUCH_ODR_START_DATE, "
+"  A.M_WH_PLANT_CD, "
+"  A.TRANSPORT_LT, "
+"  NULL AS FIX_ODR_QTY, "
+"  NULL AS UNOFFICIAL_ODR_QTY, "
+"  NULL AS DEPOT_QTY, "
+"  NULL AS CUST_ANAME, "
+"  A.VEND_ANAME, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM  "
+"(SELECT "
+"  '1' AS SORT_NO, "
+"  NULL AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_ITEM_STOCK.STOCK_ON_HAND_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  9 AS NUMBER_STATUS, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  NULL AS JOB_ODR_CD, "
+"  T_ITEM_STOCK.WH_CD AS WH_CD, "
+"  M_WH.WH_NAME AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  NULL AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_ITEM_STOCK, "
+"  M_ITEM, "
+"  M_WH, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  T_ITEM_STOCK.ITEM_CD = ? "
+"  AND T_ITEM_STOCK.PLANT_CD = ? "
+"  AND T_ITEM_STOCK.STOCK_ON_HAND_QTY <> 0 "
+"  AND T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_ITEM_STOCK.WH_CD = M_WH.WH_CD(+) "
+"  AND M_WH.MRP_FLG = ? "
+"  AND '9' = SYS_TYPE_VALUE.VALUE(+) "
+"  AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"UNION ALL "
+"SELECT "
+"  '1' AS SORT_NO, "
+"  NULL AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  9 AS NUMBER_STATUS, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_JOB_ODR_CD_STOCK.JOB_ODR_CD AS JOB_ODR_CD, "
+"  T_JOB_ODR_CD_STOCK.WH_CD AS WH_CD, "
+"  M_WH.WH_NAME AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  NULL AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_JOB_ODR_CD_STOCK, "
+"  M_ITEM, "
+"  M_WH, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+"  AND T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"  AND T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY <> 0 "
+"  AND T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD(+) "
+"  AND M_WH.MRP_FLG = ? "
+"  AND '9' = SYS_TYPE_VALUE.VALUE(+) "
+"  AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"UNION ALL "
+"SELECT "
+"  '4' AS SORT_NO, "
+"  TO_CHAR(T_OD.DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY AS DEMAND_QTY, "
+"  NULL AS STOCK_ODR_QTY, "
+"  '-' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  11 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  P_OD_00.WORK_ODR_CD AS WORK_ODR_CD, "
+"  P_OD.PUCH_ODR_CD AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  T_OD.OD_NO AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  ( "
+"    SELECT "
+"      MIN(T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD) AS WORK_ODR_CD, "
+"      T_WORK_IN_PROC_BY_ITEM.OD_NO AS OD_NO "
+"    FROM "
+"      T_WORK_IN_PROC_BY_ITEM,T_OD,M_ITEM "
+"    WHERE "
+"      T_OD.ITEM_CD = ? "
+"      AND T_OD.PLANT_CD = ? "
+"      AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND(T_OD.OD_TYP = '3' "
+"      OR  T_OD.OD_TYP = '1') "
+"      AND T_OD.DM_STS_TYP = '2' "
+"      AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"      AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"      AND T_OD.PARENT_OD_NO = T_WORK_IN_PROC_BY_ITEM.OD_NO(+) "
+"    GROUP BY "
+"      T_WORK_IN_PROC_BY_ITEM.OD_NO "
+"  ) P_OD_00, "
+"  ( "
+"    SELECT "
+"      MIN(T_RLSD_PUCH_ODR.PUCH_ODR_CD) AS PUCH_ODR_CD, "
+"      T_RLSD_PUCH_ODR.OD_NO AS OD_NO "
+"    FROM "
+"      T_RLSD_PUCH_ODR,T_OD,M_ITEM "
+"    WHERE "
+"      T_OD.ITEM_CD = ? "
+"      AND T_OD.PLANT_CD = ? "
+"      AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND(T_OD.OD_TYP = '3' "
+"      OR  T_OD.OD_TYP = '1') "
+"      AND T_OD.DM_STS_TYP = '2' "
+"      AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"      AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"      AND T_OD.PARENT_OD_NO = T_RLSD_PUCH_ODR.OD_NO(+) "
+"    GROUP BY "
+"      T_RLSD_PUCH_ODR.OD_NO "
+"  ) P_OD "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '3' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.DM_STS_TYP = '2' "
+"  AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"  AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"  AND '11' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND T_OD.PARENT_OD_NO = P_OD.OD_NO(+) "
+"  AND T_OD.PARENT_OD_NO = P_OD_00.OD_NO(+) "
+"UNION ALL "
+"SELECT "
+"  '5' AS SORT_NO, "
+"  TO_CHAR(T_OD.DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  T_OD.DM_QTY AS DEMAND_QTY, "
+"  NULL AS STOCK_ODR_QTY, "
+"  '-' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  10 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  T_OD.PARENT_OD_NO AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  T_OD.OD_NO AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2 "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '3' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.DM_STS_TYP = '1' "
+"  AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"  AND '10' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"UNION ALL "
+"SELECT "
+"  '2' AS SORT_NO, "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  DECODE(M_ITEM.OPR_RSLT_TYP,1,DECODE(SIGN(T_OD.ODR_QTY-NVL(C.ACPT_QTY,0)-NVL(C.DEFECT_QTY,0)),-1,0,T_OD.ODR_QTY-NVL(C.ACPT_QTY,0)-NVL(C.DEFECT_QTY,0)),DECODE(SIGN(T_OD.ODR_QTY-NVL(B.ACPT_QTY,0)-NVL(B.DEFECT_QTY,0)),-1,0,T_OD.ODR_QTY-NVL(B.ACPT_QTY,0)-NVL(B.DEFECT_QTY,0))) AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  T_OD.ODR_STS_TYP AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE,'YYYY/MM/DD') AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_WORK_IN_PROC_BY_ITEM, "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  (SELECT  "
+"     T_WORK_IN_PROC_BY_PROC.OD_NO OD_NO, "
+"     A.ACPT_QTY ACPT_QTY, "
+"     A.DEFECT_QTY DEFECT_QTY "
+"   FROM  "
+"     T_WORK_IN_PROC_BY_PROC, "
+"     (SELECT  "
+"        OPR_INST_CD,  "
+"        SUM(ACPT_QTY) ACPT_QTY, "
+"        SUM(DEFECT_QTY) DEFECT_QTY "
+"      FROM  T_OPR_RSLT "
+"      GROUP BY OPR_INST_CD) A "
+"   WHERE  "
+"     T_WORK_IN_PROC_BY_PROC.FINAL_PROC_FLG = '1' "
+"     AND T_WORK_IN_PROC_BY_PROC.OPR_INST_CD = A.OPR_INST_CD "
+"  )B, "
+"  (SELECT "
+"     T_OPR_RSLT.OPR_INST_CD, "
+"     SUM(T_OPR_RSLT.ACPT_QTY) ACPT_QTY, "
+"     SUM(T_OPR_RSLT.DEFECT_QTY) DEFECT_QTY "
+"   FROM T_OPR_RSLT "
+"   GROUP BY OPR_INST_CD "
+"   ) C "
+"WHERE "
+"  T_WORK_IN_PROC_BY_ITEM.ITEM_CD = ? "
+"  AND T_WORK_IN_PROC_BY_ITEM.PLANT_CD = ? "
+"  AND T_WORK_IN_PROC_BY_ITEM.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_WORK_IN_PROC_BY_ITEM.OD_NO = T_OD.OD_NO(+) "
+"  AND T_OD.ODR_STS_TYP = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'ODR_STS_TYP' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP <> '9' "
+"  AND T_WORK_IN_PROC_BY_ITEM.OD_NO = B.OD_NO(+) "
+"  AND T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD = C.OPR_INST_CD(+) "
+"UNION ALL "
+"SELECT "
+"  '2' AS SORT_NO, "
+"  TO_CHAR(T_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  DECODE(SIGN(T_RLSD_PUCH_ODR.PUCH_ODR_QTY - NVL(T_INSPC_RSLT.INSPECTED_QTY, 0)), -1, 0, T_RLSD_PUCH_ODR.PUCH_ODR_QTY - NVL(T_INSPC_RSLT.INSPECTED_QTY, 0)) AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  TO_NUMBER(RLSD_PUCH_ODR_STATUS.STATUS) AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '2'  AS GNR, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  T_RLSD_PUCH_ODR.VEND_CD AS VEND_CD, "
+"  M_VEND_CTRL.VEND_ANAME AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  TO_CHAR(T_RLSD_PUCH_ODR.PUCH_ODR_START_DATE,'YYYY/MM/DD') AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  ( "
+"    SELECT "
+"      T_INSPC_RSLT.PUCH_ODR_CD, "
+"      SUM(T_INSPC_RSLT.INSPECTED_QTY) AS INSPECTED_QTY "
+"    FROM "
+"      T_INSPC_RSLT "
+"    GROUP BY "
+"      T_INSPC_RSLT.PUCH_ODR_CD "
+"  ) T_INSPC_RSLT, "
+"  ( "
+"    SELECT "
+"      T_RLSD_PUCH_ODR.PUCH_ODR_CD, "
+"      (CASE "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 1 THEN 1 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.PUCH_ODR_INST_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NULL THEN 2 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.PUCH_ODR_INST_SLIP_ISS_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NULL THEN 3 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NOT NULL THEN 4 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 1 THEN 5 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 2 THEN 6 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 1 THEN 7 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 2 THEN 7 "
+"        WHEN T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 2 THEN 8 "
+"        ELSE NULL "
+"      END) AS STATUS "
+"    FROM "
+"      T_RLSD_PUCH_ODR, "
+"      ( "
+"        SELECT "
+"          T_ACPT_RSLT.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"          SUM(T_ACPT_RSLT.ACPT_QTY) AS ACPT_QTY "
+"        FROM "
+"          T_ACPT_RSLT "
+"        GROUP BY "
+"          T_ACPT_RSLT.PUCH_ODR_CD "
+"      ) T1 "
+"    WHERE "
+"      T_RLSD_PUCH_ODR.PUCH_ODR_CD = T1.PUCH_ODR_CD(+) "
+"  ) RLSD_PUCH_ODR_STATUS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  T_RLSD_PUCH_ODR.ITEM_CD = ? "
+"  AND T_RLSD_PUCH_ODR.PLANT_CD = ? "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = RLSD_PUCH_ODR_STATUS.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.INV_CTRL_FLG = '1' "
+"  AND T_RLSD_PUCH_ODR.WORK_ODR_CD IS NULL "
+"  AND RLSD_PUCH_ODR_STATUS.STATUS = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'PUCH_ODR_GNR_TYP' "
+"  AND M_VEND_CTRL.COMPANY_CD = ? "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"UNION ALL "
+"SELECT "
+"  '3' SORT_NO, "
+"  TO_CHAR(T_OD.PRD_DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_OD.ODR_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  0 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_OD.OD_NO AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2 "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '2' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.ODR_STS_TYP = '1' "
+"  AND '0' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND NOT EXISTS( "
+"    SELECT "
+"      T_JOB_ODR.JOB_ODR_CD "
+"    FROM "
+"      T_JOB_ODR, "
+"      T_OD "
+"    WHERE "
+"      T_JOB_ODR.ITEM_CD = ? "
+"      AND T_JOB_ODR.PLANT_CD = ? "
+"      AND T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"      AND T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"      AND T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"      AND T_JOB_ODR.JOB_ODR_DEL_FLG = '0' "
+"      AND(T_JOB_ODR.JOB_ODR_STS_TYP = '1' "
+"      OR (T_JOB_ODR.JOB_ODR_STS_TYP = '2' "
+"      AND T_JOB_ODR.JOB_ODR_EXP_TYP = '1') "
+"      OR ((T_JOB_ODR.JOB_ODR_STS_TYP = '3' "
+"      OR  T_JOB_ODR.JOB_ODR_STS_TYP = '4') "
+"      AND T_JOB_ODR.JOB_ODR_EXP_TYP = '2')) "
+"  ) "
+"UNION ALL "
+"SELECT "
+"  '3' AS SORT_NO, "
+"  TO_CHAR(T_JOB_ODR.JOB_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_JOB_ODR.JOB_ODR_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  0 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_JOB_ODR.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  T_JOB_ODR.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT, "
+"  NULL AS ODR_DEPOT_CTL_NO, "
+"  NULL AS CUST_ODR_NO, "
+"  NULL AS ODR_CHARACTERISTIC "
+"FROM "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = ? "
+"  AND T_JOB_ODR.PLANT_CD = ? "
+"  AND T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DEL_FLG = '0' "
+"  AND(T_JOB_ODR.JOB_ODR_STS_TYP = '1' "
+"  OR (T_JOB_ODR.JOB_ODR_STS_TYP = '2' "
+"  AND T_JOB_ODR.JOB_ODR_EXP_TYP = '1') "
+"  OR ((T_JOB_ODR.JOB_ODR_STS_TYP = '3' "
+"  OR  T_JOB_ODR.JOB_ODR_STS_TYP = '4') "
+"  AND T_JOB_ODR.JOB_ODR_EXP_TYP = '2')) "
+"  AND '0' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+") A "
+"WHERE A.SORT_NO <> ( CASE ?  "
+"        WHEN '0' THEN '0' "
+"        WHEN '1' THEN '3' "
+"        END ) "
+"  AND A.SORT_NO <> ( CASE ?  "
+"        WHEN '0' THEN '0' "
+"        WHEN '1' THEN '5' "
+"        END ) "
+"  AND (? = 1 OR abs(NVL(A.INSIDE_ODR_QTY,0))+abs(NVL(A.DEMAND_QTY,0))+abs(NVL(A.STOCK_ODR_QTY,0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_MRP_FLG());
				if(isNull(data.getw_MRP_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_MRP_FLG());
				if(isNull(data.getw_MRP_FLG())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_CHECK_FLG());
				if(isNull(data.getw_CHECK_FLG())) isNull = true;
				ary.addElement(data.getw_CHECK_FLG());
				if(isNull(data.getw_CHECK_FLG())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAIL_DATA", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_MRP_FLG())) setString(no ++, data.getw_MRP_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_MRP_FLG())) setString(no ++, data.getw_MRP_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_CHECK_FLG())) setString(no ++, data.getw_CHECK_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_CHECK_FLG())) setString(no ++, data.getw_CHECK_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSORT_NO( getString(1, rs) );
			data.setDELIVERY_DATE( getString(2, rs) );
			data.setINSIDE_ODR_QTY( getString(3, rs) );
			data.setINTEGRATE_ODR_QTY( getString(4, rs) );
			data.setDEMAND_QTY( getString(5, rs) );
			data.setSTOCK_ODR_QTY( getString(6, rs) );
			data.setADD_SUBTRACT( getString(7, rs) );
			data.setEFFECT_STOCK_QTY( getString(8, rs) );
			data.setPURCHASE_UNIT( getString(9, rs) );
			data.setNUMBER_STATUS( getString(10, rs) );
			data.setSTATUS( getString(11, rs) );
			data.setWORK_ODR_CD( getString(12, rs) );
			data.setPARENT_ORDER_NO( getString(13, rs) );
			data.setPARENT_ORDER_ITEM_NO( getString(14, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(15, rs) );
			data.setDEMAND_NO( getString(16, rs) );
			data.setORDER_NO( getString(17, rs) );
			data.setJOB_ODR_CD( getString(18, rs) );
			data.setWH_CD( getString(19, rs) );
			data.setWH_NAME( getString(20, rs) );
			data.setGNR( getString(21, rs) );
			data.setNUMBER_GNR_TYP( getString(22, rs) );
			data.setGNR_TYP( getString(23, rs) );
			data.setJOB_ODR_CANCEL_NO( getString(24, rs) );
			data.setw_PKG_UNIT_QTY( getString(25, rs) );
			data.setw_UNIT_QTY_TYP( getString(26, rs) );
			data.setCUST_CD( getString(27, rs) );
			data.setDLV_LOC_CD( getString(28, rs) );
			data.setDESINATED_DLV_DATE( getString(29, rs) );
			data.setODR_ACPT_DATE( getString(30, rs) );
			data.setVEND_CD( getString(31, rs) );
			data.setODR_START_DATE( getString(32, rs) );
			data.setPUCH_ODR_START_DATE( getString(33, rs) );
			data.setM_WH_PLANT_CD( getString(34, rs) );
			data.setTRANSPORT_LT( getString(35, rs) );
			data.setFIX_ODR_QTY( getString(36, rs) );
			data.setUNOFFICIAL_ODR_QTY( getString(37, rs) );
			data.setDEPOT_QTY( getString(38, rs) );
			data.setCUST_ANAME( getString(39, rs) );
			data.setVEND_ANAME( getString(40, rs) );
			data.setODR_DEPOT_CTL_NO( getString(41, rs) );
			data.setCUST_ODR_NO( getString(42, rs) );
			data.setODR_CHARACTERISTIC( getString(43, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_clear

			return;
		}

		/**
		 * getDETAIL_DATA�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA()
		{
			//{{user_implement_dev:getDETAIL_DATA_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSYS_BAT_PARM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_BAT_PARM.\"LOG_MODE_TYP\" AS \"LOG_MODE_TYP\", "
+"  SYS_BAT_PARM.\"OUTPUT_MODE_TYP\" AS \"OUTPUT_MODE_TYP\" "
+"FROM "
+"  SYS_BAT_PARM "
+"WHERE "
+"  SYS_BAT_PARM.\"PROGRAM_CD\" = ? "
+"  AND SYS_BAT_PARM.\"FUNCTION_NAME\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYS_BAT_PARM_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSYS_BAT_PARM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_BAT_PARM_read
			if(m_selcmd==null) throw new FoundationException("getSYS_BAT_PARM", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_BAT_PARM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_BAT_PARM_read2
			if(m_selcmd==null) throw new FoundationException("getSYS_BAT_PARM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_BAT_PARM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_BAT_PARM_read3
			if(m_selcmd==null) throw new FoundationException("getSYS_BAT_PARM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_BAT_PARM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_PROGRAM_CD());
				if(isNull(data.getw_PROGRAM_CD())) isNull = true;
				ary.addElement(data.getw_FUNCTION_NAME());
				if(isNull(data.getw_FUNCTION_NAME())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_PROGRAM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_FUNCTION_NAME(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setw_LOG_MODE_TYP( getString(1, rs) );
			data.setw_OUTPUT_MODE_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYS_BAT_PARM", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_BAT_PARM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_BAT_PARM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYS_BAT_PARM_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSYS_BAT_PARM_clear

			return;
		}

		/**
		 * getSYS_BAT_PARM�N���X�̕W���R���X�g���N�^
		 */
		public getSYS_BAT_PARM()
		{
			//{{user_implement_dev:getSYS_BAT_PARM_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSYS_BAT_PARM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSYS_CLASS_CODE extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_CLASS_CODE.\"CODE\" as \"CODE\" "
+"from "
+"  SYS_CLASS_CODE "
+"where "
+"  SYS_CLASS_CODE.\"SYS_CLASS\" = 'SALES' "
+"  and SYS_CLASS_CODE.\"CLASS_CODE\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYS_CLASS_CODE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSYS_CLASS_CODE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_CLASS_CODE_read
			if(m_selcmd==null) throw new FoundationException("getSYS_CLASS_CODE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_CLASS_CODE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_CLASS_CODE_read2
			if(m_selcmd==null) throw new FoundationException("getSYS_CLASS_CODE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_CLASS_CODE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_CLASS_CODE_read3
			if(m_selcmd==null) throw new FoundationException("getSYS_CLASS_CODE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_CLASS_CODE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_CLASS_CODE());
				if(isNull(data.getw_CLASS_CODE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_CLASS_CODE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setw_SHIP_LT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYS_CLASS_CODE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_CLASS_CODE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_CLASS_CODE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYS_CLASS_CODE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSYS_CLASS_CODE_clear

			return;
		}

		/**
		 * getSYS_CLASS_CODE�N���X�̕W���R���X�g���N�^
		 */
		public getSYS_CLASS_CODE()
		{
			//{{user_implement_dev:getSYS_CLASS_CODE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSYS_CLASS_CODE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkM_PS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  PARENT_ITEM_CD, "
+"  COMP_ITEM_CD "
+"FROM "
+"  M_PS "
+"WHERE "
+"  PARENT_ITEM_CD = ? "
+"  AND COMP_ITEM_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkM_PS_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PS_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_PS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		 * �N�G���[��prepare����
		 *
		 * @return PreparedStatement�C���X�^���X��Ԃ��܂�
		 * @param conn Native Connection�C���X�^���X
		 * @param query SQL������
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_PARENT_ITEM_CD());
				if(isNull(data.getw_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_COMP_ITEM_CD());
				if(isNull(data.getw_COMP_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_PARENT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_COMP_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkM_PS_clear

			return;
		}

		/**
		 * checkM_PS�N���X�̕W���R���X�g���N�^
		 */
		public checkM_PS()
		{
			//{{user_implement_dev:checkM_PS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkM_PS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getT_WORK_ITEM_INFO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_CD, "
+"  M_ITEM.ITEM_NAME "
+"FROM "
+"  T_WORK_IN_PROC_BY_ITEM, "
+"  M_ITEM "
+"WHERE "
+"  T_WORK_IN_PROC_BY_ITEM.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getT_WORK_ITEM_INFO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getT_WORK_ITEM_INFO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_WORK_ITEM_INFO_read
			if(m_selcmd==null) throw new FoundationException("getT_WORK_ITEM_INFO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_WORK_ITEM_INFO_read2
			if(m_selcmd==null) throw new FoundationException("getT_WORK_ITEM_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_WORK_ITEM_INFO_read3
			if(m_selcmd==null) throw new FoundationException("getT_WORK_ITEM_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_CD());
				if(isNull(data.getODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setPARENT_ORDER_ITEM_NO( getString(1, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getT_WORK_ITEM_INFO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_WORK_ITEM_INFO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getT_WORK_ITEM_INFO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_clear

			return;
		}

		/**
		 * getT_WORK_ITEM_INFO�N���X�̕W���R���X�g���N�^
		 */
		public getT_WORK_ITEM_INFO()
		{
			//{{user_implement_dev:getT_WORK_ITEM_INFO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getT_WORK_ITEM_INFO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getT_RLSD_ITEM_INFO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_CD, "
+"  M_ITEM.ITEM_NAME "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  M_ITEM "
+"WHERE "
+"  T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getT_RLSD_ITEM_INFO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getT_RLSD_ITEM_INFO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_read
			if(m_selcmd==null) throw new FoundationException("getT_RLSD_ITEM_INFO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_read2
			if(m_selcmd==null) throw new FoundationException("getT_RLSD_ITEM_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_read3
			if(m_selcmd==null) throw new FoundationException("getT_RLSD_ITEM_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_CD());
				if(isNull(data.getODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setPARENT_ORDER_ITEM_NO( getString(1, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getT_RLSD_ITEM_INFO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_clear

			return;
		}

		/**
		 * getT_RLSD_ITEM_INFO�N���X�̕W���R���X�g���N�^
		 */
		public getT_RLSD_ITEM_INFO()
		{
			//{{user_implement_dev:getT_RLSD_ITEM_INFO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getT_RLSD_ITEM_INFO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_INSTALL_OPTIONS.\"INSTALL_FLG\" AS \"INSTALL_FLG\" "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.\"OPTION_ID\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYS_INSTALL_OPTIONS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSYS_INSTALL_OPTIONS_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_read
			if(m_selcmd==null) throw new FoundationException("getSYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_read2
			if(m_selcmd==null) throw new FoundationException("getSYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_read3
			if(m_selcmd==null) throw new FoundationException("getSYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getu_OPTION_ID());
				if(isNull(data.getu_OPTION_ID())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getu_OPTION_ID(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.seth_INSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYS_INSTALL_OPTIONS", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * getSYS_INSTALL_OPTIONS�N���X�̕W���R���X�g���N�^
		 */
		public getSYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:getSYS_INSTALL_OPTIONS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA_JA extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  A.SORT_NO AS SORT_NO, "
+"  A.OD_NO AS OD_NO, "
+"  A.DELIVERY_DATE AS DELIVERY_DATE, "
+"  A.INTEGRATE_ODR_QTY AS INTEGRATE_ODR_QTY, "
+"  A.INTEGRATE_ODR_QTY_ZH AS INTEGRATE_ODR_QTY_ZH, "
+"  A.DEMAND_QTY AS DEMAND_QTY, "
+"  A.STOCK_ODR_QTY AS STOCK_ODR_QTY, "
+"  A.ADD_SUBTRACT AS ADD_SUBTRACT, "
+"  A.EFFECT_STOCK_QTY AS EFFECT_STOCK_QTY, "
+"  A.PURCHASE_UNIT AS PURCHASE_UNIT, "
+"  A.NUMBER_STATUS AS NUMBER_STATUS, "
+"  A.STATUS AS STATUS, "
+"  A.WORK_ODR_CD AS WORK_ODR_CD, "
+"  A.PARENT_ORDER_NO AS PARENT_ORDER_NO, "
+"  A.PARENT_ORDER_ITEM_NO AS PARENT_ORDER_ITEM_NO, "
+"  A.PARENT_ORDER_ITEM_NAME AS PARENT_ORDER_ITEM_NAME, "
+"  A.DEMAND_NO AS DEMAND_NO, "
+"  A.ORDER_NO AS ORDER_NO, "
+"  A.JOB_ODR_CD AS JOB_ODR_CD, "
+"  A.WH_CD AS WH_CD, "
+"  A.WH_NAME AS WH_NAME, "
+"  A.GNR AS GNR, "
+"  A.NUMBER_GNR_TYP AS NUMBER_GNR_TYP, "
+"  A.GNR_TYP AS GNR_TYP, "
+"  A.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  A.CUST_CD, "
+"  A.DLV_LOC_CD, "
+"  A.VEND_CD, "
+"  A.ODR_START_DATE, "
+"  A.PUCH_ODR_START_DATE, "
+"  A.FIX_ODR_QTY, "
+"  A.UNOFFICIAL_ODR_QTY, "
+"  A.DEPOT_QTY, "
+"  NULL AS VEND_ANAME, "
+"  B.CUST_ANAME, "
+"  A.ODR_DEPOT_CTL_NO, "
+"  A.CUST_ODR_NO, "
+"  A.ODR_CHARACTERISTIC "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      T_UNITE_ODR.UNOFFICIAL_ODR_QTY AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 2 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR.FIX_ODR_QTY AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 1 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '8' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      22 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR.DEPOT_QTY AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 3 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '22' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '9' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      23 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR.FIX_ODR_QTY AS FIX_ODR_QTY, "
+"      T_UNITE_ODR.UNOFFICIAL_ODR_QTY AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR.DEPOT_QTY AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 4 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '23' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND(? = 1 "
+"  OR  abs(NVL(A.INTEGRATE_ODR_QTY, 0)) + abs(NVL(A.DEMAND_QTY, 0)) + abs(NVL(A.STOCK_ODR_QTY, 0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_JA_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_JA_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAIL_DATA_JA", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSORT_NO( getString(1, rs) );
			data.setOD_NO( getString(2, rs) );
			data.setDELIVERY_DATE( getString(3, rs) );
			data.setINTEGRATE_ODR_QTY( getString(4, rs) );
			data.setINTEGRATE_ODR_QTY_ZH( getString(5, rs) );
			data.setDEMAND_QTY( getString(6, rs) );
			data.setSTOCK_ODR_QTY( getString(7, rs) );
			data.setADD_SUBTRACT( getString(8, rs) );
			data.setEFFECT_STOCK_QTY( getString(9, rs) );
			data.setPURCHASE_UNIT( getString(10, rs) );
			data.setNUMBER_STATUS( getString(11, rs) );
			data.setSTATUS( getString(12, rs) );
			data.setWORK_ODR_CD( getString(13, rs) );
			data.setPARENT_ORDER_NO( getString(14, rs) );
			data.setPARENT_ORDER_ITEM_NO( getString(15, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(16, rs) );
			data.setDEMAND_NO( getString(17, rs) );
			data.setORDER_NO( getString(18, rs) );
			data.setJOB_ODR_CD( getString(19, rs) );
			data.setWH_CD( getString(20, rs) );
			data.setWH_NAME( getString(21, rs) );
			data.setGNR( getString(22, rs) );
			data.setNUMBER_GNR_TYP( getString(23, rs) );
			data.setGNR_TYP( getString(24, rs) );
			data.setJOB_ODR_CANCEL_NO( getString(25, rs) );
			data.setCUST_CD( getString(26, rs) );
			data.setDLV_LOC_CD( getString(27, rs) );
			data.setVEND_CD( getString(28, rs) );
			data.setODR_START_DATE( getString(29, rs) );
			data.setPUCH_ODR_START_DATE( getString(30, rs) );
			data.setFIX_ODR_QTY( getString(31, rs) );
			data.setUNOFFICIAL_ODR_QTY( getString(32, rs) );
			data.setDEPOT_QTY( getString(33, rs) );
			data.setVEND_ANAME( getString(34, rs) );
			data.setCUST_ANAME( getString(35, rs) );
			data.setDEPOT_CTL_NO( getString(36, rs) );
			data.setCUST_ODR_NO( getString(37, rs) );
			data.setODR_CHARACTERISTIC( getString(38, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_JA_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_clear

			return;
		}

		/**
		 * getDETAIL_DATA_JA�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA_JA()
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA_J extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  A.SORT_NO AS SORT_NO, "
+"  A.DELIVERY_DATE AS DELIVERY_DATE, "
+"  A.INSIDE_ODR_QTY AS INSIDE_ODR_QTY, "
+"  A.DEMAND_QTY AS DEMAND_QTY, "
+"  A.STOCK_ODR_QTY AS STOCK_ODR_QTY, "
+"  A.ADD_SUBTRACT AS ADD_SUBTRACT, "
+"  A.EFFECT_STOCK_QTY AS EFFECT_STOCK_QTY, "
+"  A.PURCHASE_UNIT AS PURCHASE_UNIT, "
+"  A.NUMBER_STATUS AS NUMBER_STATUS, "
+"  A.STATUS AS STATUS, "
+"  A.WORK_ODR_CD AS WORK_ODR_CD, "
+"  A.PARENT_ORDER_NO AS PARENT_ORDER_NO, "
+"  A.PARENT_ORDER_ITEM_NO AS PARENT_ORDER_ITEM_NO, "
+"  A.PARENT_ORDER_ITEM_NAME AS PARENT_ORDER_ITEM_NAME, "
+"  A.DEMAND_NO AS DEMAND_NO, "
+"  A.ORDER_NO AS ORDER_NO, "
+"  A.JOB_ODR_CD AS JOB_ODR_CD, "
+"  A.WH_CD AS WH_CD, "
+"  A.WH_NAME AS WH_NAME, "
+"  A.GNR AS GNR, "
+"  A.NUMBER_GNR_TYP AS NUMBER_GNR_TYP, "
+"  A.GNR_TYP AS GNR_TYP, "
+"  A.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  A.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"  A.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"  A.CUST_CD, "
+"  A.DLV_LOC_CD, "
+"  A.DESINATED_DLV_DATE, "
+"  A.ODR_ACPT_DATE, "
+"  A.VEND_CD, "
+"  A.ODR_START_DATE, "
+"  A.PUCH_ODR_START_DATE, "
+"  A.M_WH_PLANT_CD, "
+"  A.TRANSPORT_LT, "
+"  NULL AS VEND_ANAME, "
+"  B.CUST_ANAME "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      NULL AS DELIVERY_DATE, "
+"      NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) AS INSIDE_ODR_QTY, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      T_ODR.ODR_NO AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      DELIVERY.CUST_CD AS CUST_CD, "
+"      DELIVERY.DLV_LOC_CD AS DLV_LOC_CD, "
+"      TO_CHAR(DELIVERY.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(DELIVERY.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      DELIVERY.M_WH_PLANT_CD AS M_WH_PLANT_CD, "
+"      DELIVERY.TRANSPORT_LT AS TRANSPORT_LT "
+"    FROM "
+"      T_ODR, "
+"      T_ODR_CTL, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE, "
+"      ( "
+"        SELECT "
+"          T_ODR.ODR_NO AS ODR_NO, "
+"          T_ODR_CTL.CUST_CD AS CUST_CD, "
+"          T_ODR.DLV_LOC_CD AS DLV_LOC_CD, "
+"          T_ODR.DESINATED_DLV_DATE AS DESINATED_DLV_DATE, "
+"          T_ODR.ODR_ACPT_DATE AS ODR_ACPT_DATE, "
+"          M_WH.PLANT_CD AS M_WH_PLANT_CD, "
+"          M_CUST_BASE.TRANSPORT_LT AS TRANSPORT_LT "
+"        FROM "
+"          M_WH, "
+"          T_ODR_CTL, "
+"          T_ODR, "
+"          M_CUST_BASE "
+"        WHERE "
+"          T_ODR_CTL.ITEM_CD = ? "
+"          AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"          AND T_ODR.ODR_CMPLT_FLG = 0 "
+"          AND T_ODR.DEL_FLG = 0 "
+"          AND T_ODR.ODR_TYP = 2 "
+"          AND NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) > 0 "
+"          AND T_ODR_CTL.CUST_CD = M_CUST_BASE.CUST_CD "
+"          AND T_ODR.DLV_LOC_CD = M_CUST_BASE.DLV_LOC_CD "
+"          AND M_CUST_BASE.SHIP_WH_CD = M_WH.WH_CD "
+"          AND M_WH.PLANT_CD = ? "
+"      ) DELIVERY "
+"    WHERE "
+"      T_ODR_CTL.ITEM_CD = ? "
+"      AND T_ODR_CTL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"      AND DELIVERY.ODR_NO = T_ODR.ODR_NO "
+"      AND T_ODR.ODR_CMPLT_FLG = 0 "
+"      AND T_ODR.DEL_FLG = 0 "
+"      AND T_ODR.ODR_TYP = 2 "
+"      AND NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) > 0 "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      NULL AS DELIVERY_DATE, "
+"      NULL AS INSIDE_ODR_QTY, "
+"      T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      T_ODR.ODR_NO AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      DELIVERY.CUST_CD AS CUST_CD, "
+"      DELIVERY.DLV_LOC_CD AS DLV_LOC_CD, "
+"      TO_CHAR(DELIVERY.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(DELIVERY.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      DELIVERY.M_WH_PLANT_CD AS M_WH_PLANT_CD, "
+"      DELIVERY.TRANSPORT_LT AS TRANSPORT_LT "
+"    FROM "
+"      T_ODR, "
+"      T_ODR_CTL, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE, "
+"      ( "
+"        SELECT "
+"          T_ODR.ODR_NO AS ODR_NO, "
+"          T_ODR_CTL.CUST_CD AS CUST_CD, "
+"          T_ODR.DLV_LOC_CD AS DLV_LOC_CD, "
+"          T_ODR.DESINATED_DLV_DATE AS DESINATED_DLV_DATE, "
+"          T_ODR.ODR_ACPT_DATE AS ODR_ACPT_DATE, "
+"          M_WH.PLANT_CD AS M_WH_PLANT_CD, "
+"          M_CUST_BASE.TRANSPORT_LT AS TRANSPORT_LT "
+"        FROM "
+"          M_WH, "
+"          T_ODR_CTL, "
+"          T_ODR, "
+"          M_CUST_BASE "
+"        WHERE "
+"          T_ODR_CTL.ITEM_CD = ? "
+"          AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"          AND T_ODR.ODR_CMPLT_FLG = 0 "
+"          AND T_ODR.DEL_FLG = 0 "
+"          AND T_ODR.ODR_TYP = 3 "
+"          AND T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY > 0 "
+"          AND T_ODR_CTL.CUST_CD = M_CUST_BASE.CUST_CD "
+"          AND T_ODR.DLV_LOC_CD = M_CUST_BASE.DLV_LOC_CD "
+"          AND M_CUST_BASE.SHIP_WH_CD = M_WH.WH_CD "
+"          AND M_WH.PLANT_CD = ? "
+"      ) DELIVERY "
+"    WHERE "
+"      T_ODR_CTL.ITEM_CD = ? "
+"      AND T_ODR_CTL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"      AND DELIVERY.ODR_NO = T_ODR.ODR_NO "
+"      AND T_ODR.ODR_CMPLT_FLG = 0 "
+"      AND T_ODR.DEL_FLG = 0 "
+"      AND T_ODR.ODR_TYP = 3 "
+"      AND T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY > 0 "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.SORT_NO <> (CASE ? "
+"    WHEN '0' THEN '0' "
+"    WHEN '1' THEN '6' "
+"  END) "
+"  AND A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND (? =1 OR abs(NVL(A.INSIDE_ODR_QTY,0)) + abs(NVL(A.DEMAND_QTY,0)) + abs(NVL(A.STOCK_ODR_QTY,0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_J_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_J_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_J_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_J", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_J_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_J_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_J", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_J_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_J_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_J", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_J_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_UNCONFIRM_FLG());
				if(isNull(data.getw_UNCONFIRM_FLG())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAIL_DATA_J", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_UNCONFIRM_FLG())) setString(no ++, data.getw_UNCONFIRM_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSORT_NO( getString(1, rs) );
			data.setDELIVERY_DATE( getString(2, rs) );
			data.setINSIDE_ODR_QTY( getString(3, rs) );
			data.setDEMAND_QTY( getString(4, rs) );
			data.setSTOCK_ODR_QTY( getString(5, rs) );
			data.setADD_SUBTRACT( getString(6, rs) );
			data.setEFFECT_STOCK_QTY( getString(7, rs) );
			data.setPURCHASE_UNIT( getString(8, rs) );
			data.setNUMBER_STATUS( getString(9, rs) );
			data.setSTATUS( getString(10, rs) );
			data.setWORK_ODR_CD( getString(11, rs) );
			data.setPARENT_ORDER_NO( getString(12, rs) );
			data.setPARENT_ORDER_ITEM_NO( getString(13, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(14, rs) );
			data.setDEMAND_NO( getString(15, rs) );
			data.setORDER_NO( getString(16, rs) );
			data.setJOB_ODR_CD( getString(17, rs) );
			data.setWH_CD( getString(18, rs) );
			data.setWH_NAME( getString(19, rs) );
			data.setGNR( getString(20, rs) );
			data.setNUMBER_GNR_TYP( getString(21, rs) );
			data.setGNR_TYP( getString(22, rs) );
			data.setJOB_ODR_CANCEL_NO( getString(23, rs) );
			data.setw_PKG_UNIT_QTY( getString(24, rs) );
			data.setw_UNIT_QTY_TYP( getString(25, rs) );
			data.setCUST_CD( getString(26, rs) );
			data.setDLV_LOC_CD( getString(27, rs) );
			data.setDESINATED_DLV_DATE( getString(28, rs) );
			data.setODR_ACPT_DATE( getString(29, rs) );
			data.setVEND_CD( getString(30, rs) );
			data.setODR_START_DATE( getString(31, rs) );
			data.setPUCH_ODR_START_DATE( getString(32, rs) );
			data.setM_WH_PLANT_CD( getString(33, rs) );
			data.setTRANSPORT_LT( getString(34, rs) );
			data.setVEND_ANAME( getString(35, rs) );
			data.setCUST_ANAME( getString(36, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_J", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_J_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_J_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_J_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_J_clear

			return;
		}

		/**
		 * getDETAIL_DATA_J�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA_J()
		{
			//{{user_implement_dev:getDETAIL_DATA_J_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_J_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAL_DATA_JCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      NULL AS DELIVERY_DATE, "
+"      NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) AS INSIDE_ODR_QTY, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      T_ODR.ODR_NO AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      DELIVERY.CUST_CD AS CUST_CD, "
+"      DELIVERY.DLV_LOC_CD AS DLV_LOC_CD, "
+"      TO_CHAR(DELIVERY.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(DELIVERY.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      DELIVERY.M_WH_PLANT_CD AS M_WH_PLANT_CD, "
+"      DELIVERY.TRANSPORT_LT AS TRANSPORT_LT "
+"    FROM "
+"      T_ODR, "
+"      T_ODR_CTL, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE, "
+"      ( "
+"        SELECT "
+"          T_ODR.ODR_NO AS ODR_NO, "
+"          T_ODR_CTL.CUST_CD AS CUST_CD, "
+"          T_ODR.DLV_LOC_CD AS DLV_LOC_CD, "
+"          T_ODR.DESINATED_DLV_DATE AS DESINATED_DLV_DATE, "
+"          T_ODR.ODR_ACPT_DATE AS ODR_ACPT_DATE, "
+"          M_WH.PLANT_CD AS M_WH_PLANT_CD, "
+"          M_CUST_BASE.TRANSPORT_LT AS TRANSPORT_LT "
+"        FROM "
+"          M_WH, "
+"          T_ODR_CTL, "
+"          T_ODR, "
+"          M_CUST_BASE "
+"        WHERE "
+"          T_ODR_CTL.ITEM_CD = ? "
+"          AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"          AND T_ODR.ODR_CMPLT_FLG = 0 "
+"          AND T_ODR.DEL_FLG = 0 "
+"          AND T_ODR.ODR_TYP = 2 "
+"          AND NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) > 0 "
+"          AND T_ODR_CTL.CUST_CD = M_CUST_BASE.CUST_CD "
+"          AND T_ODR.DLV_LOC_CD = M_CUST_BASE.DLV_LOC_CD "
+"          AND M_CUST_BASE.SHIP_WH_CD = M_WH.WH_CD "
+"          AND M_WH.PLANT_CD = ? "
+"      ) DELIVERY "
+"    WHERE "
+"      T_ODR_CTL.ITEM_CD = ? "
+"      AND T_ODR_CTL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"      AND DELIVERY.ODR_NO = T_ODR.ODR_NO "
+"      AND T_ODR.ODR_CMPLT_FLG = 0 "
+"      AND T_ODR.DEL_FLG = 0 "
+"      AND T_ODR.ODR_TYP = 2 "
+"      AND NVL(T_ODR.REMAIN_UNCONFIRM_ODR_QTY, 0) > 0 "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      NULL AS DELIVERY_DATE, "
+"      NULL AS INSIDE_ODR_QTY, "
+"      T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      T_ODR.ODR_NO AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      DELIVERY.CUST_CD AS CUST_CD, "
+"      DELIVERY.DLV_LOC_CD AS DLV_LOC_CD, "
+"      TO_CHAR(DELIVERY.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(DELIVERY.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      DELIVERY.M_WH_PLANT_CD AS M_WH_PLANT_CD, "
+"      DELIVERY.TRANSPORT_LT AS TRANSPORT_LT "
+"    FROM "
+"      T_ODR, "
+"      T_ODR_CTL, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE, "
+"      ( "
+"        SELECT "
+"          T_ODR.ODR_NO AS ODR_NO, "
+"          T_ODR_CTL.CUST_CD AS CUST_CD, "
+"          T_ODR.DLV_LOC_CD AS DLV_LOC_CD, "
+"          T_ODR.DESINATED_DLV_DATE AS DESINATED_DLV_DATE, "
+"          T_ODR.ODR_ACPT_DATE AS ODR_ACPT_DATE, "
+"          M_WH.PLANT_CD AS M_WH_PLANT_CD, "
+"          M_CUST_BASE.TRANSPORT_LT AS TRANSPORT_LT "
+"        FROM "
+"          M_WH, "
+"          T_ODR_CTL, "
+"          T_ODR, "
+"          M_CUST_BASE "
+"        WHERE "
+"          T_ODR_CTL.ITEM_CD = ? "
+"          AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"          AND T_ODR.ODR_CMPLT_FLG = 0 "
+"          AND T_ODR.DEL_FLG = 0 "
+"          AND T_ODR.ODR_TYP = 3 "
+"          AND T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY > 0 "
+"          AND T_ODR_CTL.CUST_CD = M_CUST_BASE.CUST_CD "
+"          AND T_ODR.DLV_LOC_CD = M_CUST_BASE.DLV_LOC_CD "
+"          AND M_CUST_BASE.SHIP_WH_CD = M_WH.WH_CD "
+"          AND M_WH.PLANT_CD = ? "
+"      ) DELIVERY "
+"    WHERE "
+"      T_ODR_CTL.ITEM_CD = ? "
+"      AND T_ODR_CTL.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO(+) "
+"      AND DELIVERY.ODR_NO = T_ODR.ODR_NO "
+"      AND T_ODR.ODR_CMPLT_FLG = 0 "
+"      AND T_ODR.DEL_FLG = 0 "
+"      AND T_ODR.ODR_TYP = 3 "
+"      AND T_ODR.ODR_QTY - T_ODR.TOTAL_SHIP_QTY > 0 "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.SORT_NO <> (CASE ? "
+"    WHEN '0' THEN '0' "
+"    WHEN '1' THEN '6' "
+"  END) "
+"  AND A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND (? =1 OR abs(NVL(A.INSIDE_ODR_QTY,0)) + abs(NVL(A.DEMAND_QTY,0)) + abs(NVL(A.STOCK_ODR_QTY,0)) <> 0) "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAL_DATA_JCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAL_DATA_JCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATA_JCnt_read
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATA_JCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAL_DATA_JCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATA_JCnt_read2
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATA_JCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAL_DATA_JCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATA_JCnt_read3
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATA_JCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAL_DATA_JCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_UNCONFIRM_FLG());
				if(isNull(data.getw_UNCONFIRM_FLG())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAL_DATA_JCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_UNCONFIRM_FLG())) setString(no ++, data.getw_UNCONFIRM_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATA_JCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATA_JCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAL_DATA_JCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAL_DATA_JCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAL_DATA_JCnt_clear

			return;
		}

		/**
		 * getDETAL_DATA_JCnt�N���X�̕W���R���X�g���N�^
		 */
		public getDETAL_DATA_JCnt()
		{
			//{{user_implement_dev:getDETAL_DATA_JCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAL_DATA_JCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAL_DATACnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"   COUNT(1) "
+"FROM  "
+"(SELECT "
+"  '1' AS SORT_NO, "
+"  NULL AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_ITEM_STOCK.STOCK_ON_HAND_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  9 AS NUMBER_STATUS, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  NULL AS JOB_ODR_CD, "
+"  T_ITEM_STOCK.WH_CD AS WH_CD, "
+"  M_WH.WH_NAME AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  NULL AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_ITEM_STOCK, "
+"  M_ITEM, "
+"  M_WH, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  T_ITEM_STOCK.ITEM_CD = ? "
+"  AND T_ITEM_STOCK.PLANT_CD = ? "
+"  AND T_ITEM_STOCK.STOCK_ON_HAND_QTY <> 0 "
+"  AND T_ITEM_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_ITEM_STOCK.WH_CD = M_WH.WH_CD(+) "
+"  AND M_WH.MRP_FLG = ? "
+"  AND '9' = SYS_TYPE_VALUE.VALUE(+) "
+"  AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '1' AS SORT_NO, "
+"  NULL AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  9 AS NUMBER_STATUS, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_JOB_ODR_CD_STOCK.JOB_ODR_CD AS JOB_ODR_CD, "
+"  T_JOB_ODR_CD_STOCK.WH_CD AS WH_CD, "
+"  M_WH.WH_NAME AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  NULL AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_JOB_ODR_CD_STOCK, "
+"  M_ITEM, "
+"  M_WH, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  T_JOB_ODR_CD_STOCK.ITEM_CD = ? "
+"  AND T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"  AND T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY <> 0 "
+"  AND T_JOB_ODR_CD_STOCK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD(+) "
+"  AND M_WH.MRP_FLG = ? "
+"  AND '9' = SYS_TYPE_VALUE.VALUE(+) "
+"  AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '4' AS SORT_NO, "
+"  TO_CHAR(T_OD.DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY AS DEMAND_QTY, "
+"  NULL AS STOCK_ODR_QTY, "
+"  '-' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  11 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  P_OD_00.WORK_ODR_CD AS WORK_ODR_CD, "
+"  P_OD.PUCH_ODR_CD AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  T_OD.OD_NO AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  ( "
+"    SELECT "
+"      MIN(T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD) AS WORK_ODR_CD, "
+"      T_WORK_IN_PROC_BY_ITEM.OD_NO AS OD_NO "
+"    FROM "
+"      T_WORK_IN_PROC_BY_ITEM,T_OD,M_ITEM "
+"    WHERE "
+"      T_OD.ITEM_CD = ? "
+"      AND T_OD.PLANT_CD = ? "
+"      AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND(T_OD.OD_TYP = '3' "
+"      OR  T_OD.OD_TYP = '1') "
+"      AND T_OD.DM_STS_TYP = '2' "
+"      AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"      AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"      AND T_OD.PARENT_OD_NO = T_WORK_IN_PROC_BY_ITEM.OD_NO(+) "
+"    GROUP BY "
+"      T_WORK_IN_PROC_BY_ITEM.OD_NO "
+"  ) P_OD_00, "
+"  ( "
+"    SELECT "
+"      MIN(T_RLSD_PUCH_ODR.PUCH_ODR_CD) AS PUCH_ODR_CD, "
+"      T_RLSD_PUCH_ODR.OD_NO AS OD_NO "
+"    FROM "
+"      T_RLSD_PUCH_ODR,T_OD,M_ITEM "
+"    WHERE "
+"      T_OD.ITEM_CD = ? "
+"      AND T_OD.PLANT_CD = ? "
+"      AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND(T_OD.OD_TYP = '3' "
+"      OR  T_OD.OD_TYP = '1') "
+"      AND T_OD.DM_STS_TYP = '2' "
+"      AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"      AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"      AND T_OD.PARENT_OD_NO = T_RLSD_PUCH_ODR.OD_NO(+) "
+"    GROUP BY "
+"      T_RLSD_PUCH_ODR.OD_NO "
+"  ) P_OD "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '3' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.DM_STS_TYP = '2' "
+"  AND T_OD.DM_QTY - T_OD.TOTAL_ISSUE_QTY > 0 "
+"  AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"  AND '11' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND T_OD.PARENT_OD_NO = P_OD.OD_NO(+) "
+"  AND T_OD.PARENT_OD_NO = P_OD_00.OD_NO(+) "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '5' AS SORT_NO, "
+"  TO_CHAR(T_OD.DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  T_OD.DM_QTY AS DEMAND_QTY, "
+"  NULL AS STOCK_ODR_QTY, "
+"  '-' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  10 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  T_OD.PARENT_OD_NO AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  T_OD.OD_NO AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2 "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '3' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.DM_STS_TYP = '1' "
+"  AND T_OD.OD_GNR_TYP NOT IN (6,8,10) "
+"  AND '10' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '2' AS SORT_NO, "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  DECODE(M_ITEM.OPR_RSLT_TYP,1,DECODE(SIGN(T_OD.ODR_QTY-NVL(C.ACPT_QTY,0)-NVL(C.DEFECT_QTY,0)),-1,0,T_OD.ODR_QTY-NVL(C.ACPT_QTY,0)-NVL(C.DEFECT_QTY,0)),DECODE(SIGN(T_OD.ODR_QTY-NVL(B.ACPT_QTY,0)-NVL(B.DEFECT_QTY,0)),-1,0,T_OD.ODR_QTY-NVL(B.ACPT_QTY,0)-NVL(B.DEFECT_QTY,0))) AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  T_OD.ODR_STS_TYP AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  TO_CHAR(T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE,'YYYY/MM/DD') AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_WORK_IN_PROC_BY_ITEM, "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  (SELECT  "
+"     T_WORK_IN_PROC_BY_PROC.OD_NO OD_NO, "
+"     A.ACPT_QTY ACPT_QTY, "
+"     A.DEFECT_QTY DEFECT_QTY "
+"   FROM  "
+"     T_WORK_IN_PROC_BY_PROC, "
+"     (SELECT  "
+"        OPR_INST_CD,  "
+"        SUM(ACPT_QTY) ACPT_QTY, "
+"        SUM(DEFECT_QTY) DEFECT_QTY "
+"      FROM  T_OPR_RSLT "
+"      GROUP BY OPR_INST_CD) A "
+"   WHERE  "
+"     T_WORK_IN_PROC_BY_PROC.FINAL_PROC_FLG = '1' "
+"     AND T_WORK_IN_PROC_BY_PROC.OPR_INST_CD = A.OPR_INST_CD "
+"  )B, "
+"  (SELECT "
+"     T_OPR_RSLT.OPR_INST_CD, "
+"     SUM(T_OPR_RSLT.ACPT_QTY) ACPT_QTY, "
+"     SUM(T_OPR_RSLT.DEFECT_QTY) DEFECT_QTY "
+"   FROM T_OPR_RSLT "
+"   GROUP BY OPR_INST_CD "
+"   ) C "
+"WHERE "
+"  T_WORK_IN_PROC_BY_ITEM.ITEM_CD = ? "
+"  AND T_WORK_IN_PROC_BY_ITEM.PLANT_CD = ? "
+"  AND T_WORK_IN_PROC_BY_ITEM.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_WORK_IN_PROC_BY_ITEM.OD_NO = T_OD.OD_NO(+) "
+"  AND T_OD.ODR_STS_TYP = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'ODR_STS_TYP' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP <> '9' "
+"  AND T_WORK_IN_PROC_BY_ITEM.OD_NO = B.OD_NO(+) "
+"  AND T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD = C.OPR_INST_CD(+) "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '2' AS SORT_NO, "
+"  TO_CHAR(T_RLSD_PUCH_ODR.PUCH_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  DECODE(SIGN(T_RLSD_PUCH_ODR.PUCH_ODR_QTY - NVL(T_INSPC_RSLT.INSPECTED_QTY, 0)), -1, 0, T_RLSD_PUCH_ODR.PUCH_ODR_QTY - NVL(T_INSPC_RSLT.INSPECTED_QTY, 0)) AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  TO_NUMBER(RLSD_PUCH_ODR_STATUS.STATUS) AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_CD AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '2'  AS GNR, "
+"  T_RLSD_PUCH_ODR.PUCH_ODR_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  T_RLSD_PUCH_ODR.VEND_CD AS VEND_CD, "
+"  M_VEND_CTRL.VEND_ANAME AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  TO_CHAR(T_RLSD_PUCH_ODR.PUCH_ODR_START_DATE,'YYYY/MM/DD') AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_RLSD_PUCH_ODR, "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2, "
+"  ( "
+"    SELECT "
+"      T_INSPC_RSLT.PUCH_ODR_CD, "
+"      SUM(T_INSPC_RSLT.INSPECTED_QTY) AS INSPECTED_QTY "
+"    FROM "
+"      T_INSPC_RSLT "
+"    GROUP BY "
+"      T_INSPC_RSLT.PUCH_ODR_CD "
+"  ) T_INSPC_RSLT, "
+"  ( "
+"    SELECT "
+"      T_RLSD_PUCH_ODR.PUCH_ODR_CD, "
+"      (CASE "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 1 THEN 1 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.PUCH_ODR_INST_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NULL THEN 2 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.PUCH_ODR_INST_SLIP_ISS_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NULL THEN 3 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T1.PUCH_ODR_CD IS NOT NULL THEN 4 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 1 THEN 5 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 2 THEN 6 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 1 THEN 7 "
+"        WHEN T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 9 "
+"      AND T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 2 THEN 7 "
+"        WHEN T_RLSD_PUCH_ODR.INSPC_CMPLT_FLG = 1 "
+"      AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND T_RLSD_PUCH_ODR.ACPT_INSPC_TYP = 2 THEN 8 "
+"        ELSE NULL "
+"      END) AS STATUS "
+"    FROM "
+"      T_RLSD_PUCH_ODR, "
+"      ( "
+"        SELECT "
+"          T_ACPT_RSLT.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"          SUM(T_ACPT_RSLT.ACPT_QTY) AS ACPT_QTY "
+"        FROM "
+"          T_ACPT_RSLT "
+"        GROUP BY "
+"          T_ACPT_RSLT.PUCH_ODR_CD "
+"      ) T1 "
+"    WHERE "
+"      T_RLSD_PUCH_ODR.PUCH_ODR_CD = T1.PUCH_ODR_CD(+) "
+"  ) RLSD_PUCH_ODR_STATUS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  T_RLSD_PUCH_ODR.ITEM_CD = ? "
+"  AND T_RLSD_PUCH_ODR.PLANT_CD = ? "
+"  AND T_RLSD_PUCH_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_RLSD_PUCH_ODR.OD_NO = T_OD.OD_NO(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = T_INSPC_RSLT.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_CD = RLSD_PUCH_ODR_STATUS.PUCH_ODR_CD(+) "
+"  AND T_RLSD_PUCH_ODR.INV_CTRL_FLG = '1' "
+"  AND T_RLSD_PUCH_ODR.WORK_ODR_CD IS NULL "
+"  AND RLSD_PUCH_ODR_STATUS.STATUS = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_RLSD_PUCH_ODR.PUCH_ODR_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'PUCH_ODR_GNR_TYP' "
+"  AND M_VEND_CTRL.COMPANY_CD = ? "
+"  AND T_RLSD_PUCH_ODR.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '3' SORT_NO, "
+"  TO_CHAR(T_OD.PRD_DUE_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_OD.ODR_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  0 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  T_OD.OD_NO AS ORDER_NO, "
+"  T_OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  '1'  AS GNR, "
+"  T_OD.OD_GNR_TYP AS NUMBER_GNR_TYP, "
+"  COMBO2.DISPLAY_NAME AS GNR_TYP, "
+"  T_OD.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_OD, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1, "
+"  SYS_TYPE_VALUE COMBO2 "
+"WHERE "
+"  T_OD.ITEM_CD = ? "
+"  AND T_OD.PLANT_CD = ? "
+"  AND T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND(T_OD.OD_TYP = '2' "
+"  OR  T_OD.OD_TYP = '1') "
+"  AND T_OD.ODR_STS_TYP = '1' "
+"  AND '0' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND T_OD.OD_GNR_TYP = COMBO2.VALUE(+) "
+"  AND COMBO2.NAME = 'OD_GNR_TYP' "
+"  AND NOT EXISTS( "
+"    SELECT "
+"      T_JOB_ODR.JOB_ODR_CD "
+"    FROM "
+"      T_JOB_ODR, "
+"      T_OD "
+"    WHERE "
+"      T_JOB_ODR.ITEM_CD = ? "
+"      AND T_JOB_ODR.PLANT_CD = ? "
+"      AND T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"      AND T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"      AND T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"      AND T_JOB_ODR.JOB_ODR_DEL_FLG = '0' "
+"      AND(T_JOB_ODR.JOB_ODR_STS_TYP = '1' "
+"      OR (T_JOB_ODR.JOB_ODR_STS_TYP = '2' "
+"      AND T_JOB_ODR.JOB_ODR_EXP_TYP = '1') "
+"      OR ((T_JOB_ODR.JOB_ODR_STS_TYP = '3' "
+"      OR  T_JOB_ODR.JOB_ODR_STS_TYP = '4') "
+"      AND T_JOB_ODR.JOB_ODR_EXP_TYP = '2')) "
+"  ) "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+"UNION ALL "
+"SELECT "
+"  '3' AS SORT_NO, "
+"  TO_CHAR(T_JOB_ODR.JOB_ODR_DLV_DATE, DECODE(?,1,'YYYY/MM/DD','YYYY/MM/DD HH24:MI')) AS DELIVERY_DATE, "
+"  NULL AS INSIDE_ODR_QTY, "
+"  NULL AS DEMAND_QTY, "
+"  T_JOB_ODR.JOB_ODR_QTY AS STOCK_ODR_QTY, "
+"  '+' AS ADD_SUBTRACT, "
+"  0 AS EFFECT_STOCK_QTY, "
+"  M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"  0 AS NUMBER_STATUS, "
+"  COMBO1.DISPLAY_NAME AS STATUS, "
+"  NULL AS WORK_ODR_CD, "
+"  NULL AS PARENT_ORDER_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NO, "
+"  NULL AS PARENT_ORDER_ITEM_NAME, "
+"  NULL AS DEMAND_NO, "
+"  NULL AS ORDER_NO, "
+"  T_JOB_ODR.JOB_ODR_CD AS JOB_ODR_CD, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  NULL AS GNR, "
+"  NULL AS NUMBER_GNR_TYP, "
+"  NULL AS GNR_TYP, "
+"  T_JOB_ODR.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  NULL AS PKG_UNIT_QTY, "
+"  NULL AS UNIT_QTY_TYP, "
+"  NULL AS CUST_CD, "
+"  NULL AS DLV_LOC_CD, "
+"  NULL AS DESINATED_DLV_DATE, "
+"  NULL AS ODR_ACPT_DATE, "
+"  NULL AS VEND_CD, "
+"  NULL AS VEND_ANAME, "
+"  NULL AS ODR_START_DATE, "
+"  NULL AS PUCH_ODR_START_DATE, "
+"  NULL AS M_WH_PLANT_CD, "
+"  NULL AS TRANSPORT_LT "
+"FROM "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE COMBO1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = ? "
+"  AND T_JOB_ODR.PLANT_CD = ? "
+"  AND T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DEL_FLG = '0' "
+"  AND(T_JOB_ODR.JOB_ODR_STS_TYP = '1' "
+"  OR (T_JOB_ODR.JOB_ODR_STS_TYP = '2' "
+"  AND T_JOB_ODR.JOB_ODR_EXP_TYP = '1') "
+"  OR ((T_JOB_ODR.JOB_ODR_STS_TYP = '3' "
+"  OR  T_JOB_ODR.JOB_ODR_STS_TYP = '4') "
+"  AND T_JOB_ODR.JOB_ODR_EXP_TYP = '2')) "
+"  AND '0' = COMBO1.VALUE(+) "
+"  AND COMBO1.NAME = 'MP_ODR_STATUS' "
+"  AND ROWNUM <= TO_NUMBER(?)+1 "
+") A "
+"WHERE A.SORT_NO <> ( CASE ?  "
+"        WHEN '0' THEN '0' "
+"        WHEN '1' THEN '3' "
+"        END ) "
+"  AND A.SORT_NO <> ( CASE ?  "
+"        WHEN '0' THEN '0' "
+"        WHEN '1' THEN '5' "
+"        END ) "
+"  AND (? = 1 OR abs(NVL(A.INSIDE_ODR_QTY,0))+abs(NVL(A.DEMAND_QTY,0))+abs(NVL(A.STOCK_ODR_QTY,0)) <> 0) "
+"  AND ROWNUM <= TO_NUMBER(?)+1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAL_DATACnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAL_DATACnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATACnt_read
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATACnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAL_DATACnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATACnt_read2
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATACnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAL_DATACnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATACnt_read3
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATACnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAL_DATACnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_MRP_FLG());
				if(isNull(data.getw_MRP_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_MRP_FLG());
				if(isNull(data.getw_MRP_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ENV_FLG());
				if(isNull(data.getw_ENV_FLG())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_CHECK_FLG());
				if(isNull(data.getw_CHECK_FLG())) isNull = true;
				ary.addElement(data.getw_CHECK_FLG());
				if(isNull(data.getw_CHECK_FLG())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAL_DATACnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_MRP_FLG())) setString(no ++, data.getw_MRP_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_MRP_FLG())) setString(no ++, data.getw_MRP_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ENV_FLG())) setString(no ++, data.getw_ENV_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_CHECK_FLG())) setString(no ++, data.getw_CHECK_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_CHECK_FLG())) setString(no ++, data.getw_CHECK_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAL_DATACnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAL_DATACnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAL_DATACnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAL_DATACnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAL_DATACnt_clear

			return;
		}

		/**
		 * getDETAL_DATACnt�N���X�̕W���R���X�g���N�^
		 */
		public getDETAL_DATACnt()
		{
			//{{user_implement_dev:getDETAL_DATACnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAL_DATACnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA_JACnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      T_UNITE_ODR.UNOFFICIAL_ODR_QTY AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 2 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR.FIX_ODR_QTY AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 1 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '8' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      22 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR.DEPOT_QTY AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 3 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '22' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '9' AS SORT_NO, "
+"      T_UNITE_ODR.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR.REQUIRED_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR.REQUIRED_QTY / SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR.REQUIRED_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      23 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR.FIX_ODR_QTY AS FIX_ODR_QTY, "
+"      T_UNITE_ODR.UNOFFICIAL_ODR_QTY AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR.DEPOT_QTY AS DEPOT_QTY, "
+"      NULL AS ODR_DEPOT_CTL_NO, "
+"      NULL AS CUST_ODR_NO, "
+"      NULL ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR.ITEM_CD = ? "
+"      AND T_UNITE_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR.PLANT_CD = ? "
+"      AND T_UNITE_ODR.DEL_FLG = 0 "
+"      AND T_UNITE_ODR.UNITE_ODR_TYP = 4 "
+"      AND T_UNITE_ODR.REQUIRED_QTY > 0 "
+"      AND T_UNITE_ODR.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '23' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND(? = 1 "
+"  OR  abs(NVL(A.INTEGRATE_ODR_QTY, 0)) + abs(NVL(A.DEMAND_QTY, 0)) + abs(NVL(A.STOCK_ODR_QTY, 0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_JACnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_JACnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JACnt_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JACnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JACnt_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JACnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JACnt_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JACnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getDETAIL_DATA_JACnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_ITEM_CD())) setString(no ++, data.getw_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_PLANT_CD())) setString(no ++, data.getw_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMPANY_CD())) setString(no ++, data.getCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_QTY_FLG())) setString(no ++, data.getw_QTY_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JACnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JACnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_JACnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_clear

			return;
		}

		/**
		 * getDETAIL_DATA_JACnt�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA_JACnt()
		{
			//{{user_implement_dev:getDETAIL_DATA_JACnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JACnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getT_OD_INFO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_CD, "
+"  M_ITEM.ITEM_NAME "
+"FROM "
+"  T_OD, "
+"  M_ITEM "
+"WHERE "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND T_OD.OD_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getT_OD_INFO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getT_OD_INFO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_OD_INFO_read
			if(m_selcmd==null) throw new FoundationException("getT_OD_INFO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_OD_INFO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_OD_INFO_read2
			if(m_selcmd==null) throw new FoundationException("getT_OD_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_OD_INFO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_OD_INFO_read3
			if(m_selcmd==null) throw new FoundationException("getT_OD_INFO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_OD_INFO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getODR_CD());
				if(isNull(data.getODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setPARENT_ORDER_ITEM_NO( getString(1, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getT_OD_INFO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_OD_INFO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_OD_INFO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getT_OD_INFO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getT_OD_INFO_clear

			return;
		}

		/**
		 * getT_OD_INFO�N���X�̕W���R���X�g���N�^
		 */
		public getT_OD_INFO()
		{
			//{{user_implement_dev:getT_OD_INFO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getT_OD_INFO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDM_CREATE_BASE_TBL	 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TBLA.VALUE "
+"FROM "
+"  SYS_PARAMETER TBLA "
+"WHERE "
+"  TBLA.NAME = 'DM_CREATE_BASE_TBL'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDM_CREATE_BASE_TBL	_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDM_CREATE_BASE_TBL	_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_read
			if(m_selcmd==null) throw new FoundationException("getDM_CREATE_BASE_TBL	", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_read2
			if(m_selcmd==null) throw new FoundationException("getDM_CREATE_BASE_TBL	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_read3
			if(m_selcmd==null) throw new FoundationException("getDM_CREATE_BASE_TBL	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setw_DM_CREATE_BASE_TBL( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDM_CREATE_BASE_TBL	", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_clear

			return;
		}

		/**
		 * getDM_CREATE_BASE_TBL	�N���X�̕W���R���X�g���N�^
		 */
		public getDM_CREATE_BASE_TBL	()
		{
			//{{user_implement_dev:getDM_CREATE_BASE_TBL	_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDM_CREATE_BASE_TBL	_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA_JA_WORK	 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  A.SORT_NO AS SORT_NO, "
+"  A.OD_NO AS OD_NO, "
+"  A.DELIVERY_DATE AS DELIVERY_DATE, "
+"  A.INTEGRATE_ODR_QTY AS INTEGRATE_ODR_QTY, "
+"  A.INTEGRATE_ODR_QTY_ZH AS INTEGRATE_ODR_QTY_ZH, "
+"  A.DEMAND_QTY AS DEMAND_QTY, "
+"  A.STOCK_ODR_QTY AS STOCK_ODR_QTY, "
+"  A.ADD_SUBTRACT AS ADD_SUBTRACT, "
+"  A.EFFECT_STOCK_QTY AS EFFECT_STOCK_QTY, "
+"  A.PURCHASE_UNIT AS PURCHASE_UNIT, "
+"  A.NUMBER_STATUS AS NUMBER_STATUS, "
+"  A.STATUS AS STATUS, "
+"  A.WORK_ODR_CD AS WORK_ODR_CD, "
+"  A.PARENT_ORDER_NO AS PARENT_ORDER_NO, "
+"  A.PARENT_ORDER_ITEM_NO AS PARENT_ORDER_ITEM_NO, "
+"  A.PARENT_ORDER_ITEM_NAME AS PARENT_ORDER_ITEM_NAME, "
+"  A.DEMAND_NO AS DEMAND_NO, "
+"  A.ORDER_NO AS ORDER_NO, "
+"  A.JOB_ODR_CD AS JOB_ODR_CD, "
+"  A.WH_CD AS WH_CD, "
+"  A.WH_NAME AS WH_NAME, "
+"  A.GNR AS GNR, "
+"  A.NUMBER_GNR_TYP AS NUMBER_GNR_TYP, "
+"  A.GNR_TYP AS GNR_TYP, "
+"  A.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO, "
+"  A.CUST_CD, "
+"  A.DLV_LOC_CD, "
+"  A.VEND_CD, "
+"  A.ODR_START_DATE, "
+"  A.PUCH_ODR_START_DATE, "
+"  A.FIX_ODR_QTY, "
+"  A.UNOFFICIAL_ODR_QTY, "
+"  A.DEPOT_QTY, "
+"  NULL AS VEND_ANAME, "
+"  B.CUST_ANAME, "
+"  A.ODR_DEPOT_CTL_NO, "
+"  A.CUST_ODR_NO, "
+"  A.ODR_CHARACTERISTIC "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 2 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 1 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  UNION ALL "
+"    SELECT "
+"      '8' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      22 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 3 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '22' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND(? = 1 "
+"  OR  abs(NVL(A.INTEGRATE_ODR_QTY, 0)) + abs(NVL(A.DEMAND_QTY, 0)) + abs(NVL(A.STOCK_ODR_QTY, 0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORK	", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORK	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORK	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_QTY_FLG(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setSORT_NO( getString(1, rs) );
			data.setOD_NO( getString(2, rs) );
			data.setDELIVERY_DATE( getString(3, rs) );
			data.setINTEGRATE_ODR_QTY( getString(4, rs) );
			data.setINTEGRATE_ODR_QTY_ZH( getString(5, rs) );
			data.setDEMAND_QTY( getString(6, rs) );
			data.setSTOCK_ODR_QTY( getString(7, rs) );
			data.setADD_SUBTRACT( getString(8, rs) );
			data.setEFFECT_STOCK_QTY( getString(9, rs) );
			data.setPURCHASE_UNIT( getString(10, rs) );
			data.setNUMBER_STATUS( getString(11, rs) );
			data.setSTATUS( getString(12, rs) );
			data.setWORK_ODR_CD( getString(13, rs) );
			data.setPARENT_ORDER_NO( getString(14, rs) );
			data.setPARENT_ORDER_ITEM_NO( getString(15, rs) );
			data.setPARENT_ORDER_ITEM_NAME( getString(16, rs) );
			data.setDEMAND_NO( getString(17, rs) );
			data.setORDER_NO( getString(18, rs) );
			data.setJOB_ODR_CD( getString(19, rs) );
			data.setWH_CD( getString(20, rs) );
			data.setWH_NAME( getString(21, rs) );
			data.setGNR( getString(22, rs) );
			data.setNUMBER_GNR_TYP( getString(23, rs) );
			data.setGNR_TYP( getString(24, rs) );
			data.setJOB_ODR_CANCEL_NO( getString(25, rs) );
			data.setCUST_CD( getString(26, rs) );
			data.setDLV_LOC_CD( getString(27, rs) );
			data.setVEND_CD( getString(28, rs) );
			data.setODR_START_DATE( getString(29, rs) );
			data.setPUCH_ODR_START_DATE( getString(30, rs) );
			data.setFIX_ODR_QTY( getString(31, rs) );
			data.setUNOFFICIAL_ODR_QTY( getString(32, rs) );
			data.setDEPOT_QTY( getString(33, rs) );
			data.setVEND_ANAME( getString(34, rs) );
			data.setCUST_ANAME( getString(35, rs) );
			data.setODR_DEPOT_CTL_NO( getString(36, rs) );
			data.setCUST_ODR_NO( getString(37, rs) );
			data.setODR_CHARACTERISTIC( getString(38, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORK	", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_clear

			return;
		}

		/**
		 * getDETAIL_DATA_JA_WORK	�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA_JA_WORK	()
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORK	_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORK	_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getDETAIL_DATA_JA_WORKCnt	 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      '6' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      20 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 2 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '20' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '7' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      21 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      NULL AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 1 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '21' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      '8' AS SORT_NO, "
+"      T_UNITE_ODR_WORK.OD_NO AS OD_NO, "
+"      TO_CHAR(T_UNITE_ODR_WORK.SHIP_PLAN_DATE, 'YYYY/MM/DD HH24:MI') AS DELIVERY_DATE, "
+"      DECODE(SIGN(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY), - 1, 0,(T_UNITE_ODR_WORK.DIVISION_QTY - DECODE(M_ITEM.UNIT_QTY_TYP, 1, CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO)))), CEIL(T_OD.TOTAL_ISSUE_QTY *(DECODE(SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO), 0, 1, T_UNITE_ODR_WORK.DIVISION_QTY / SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO))) * 10000) / 10000))) AS INTEGRATE_ODR_QTY, "
+"      SUM(T_UNITE_ODR_WORK.DIVISION_QTY) OVER( "
+"        PARTITION BY "
+"          T_OD.OD_NO) - T_OD.TOTAL_ISSUE_QTY AS INTEGRATE_ODR_QTY_ZH, "
+"      NULL AS DEMAND_QTY, "
+"      NULL AS STOCK_ODR_QTY, "
+"      '-' AS ADD_SUBTRACT, "
+"      0 AS EFFECT_STOCK_QTY, "
+"      M_ITEM.STOCK_UNIT AS PURCHASE_UNIT, "
+"      22 AS NUMBER_STATUS, "
+"      SYS_TYPE_VALUE.DISPLAY_NAME AS STATUS, "
+"      NULL AS WORK_ODR_CD, "
+"      NULL AS PARENT_ORDER_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NO, "
+"      NULL AS PARENT_ORDER_ITEM_NAME, "
+"      NULL AS DEMAND_NO, "
+"      NULL AS ORDER_NO, "
+"      NULL AS JOB_ODR_CD, "
+"      NULL AS WH_CD, "
+"      NULL AS WH_NAME, "
+"      NULL AS GNR, "
+"      NULL AS NUMBER_GNR_TYP, "
+"      NULL AS GNR_TYP, "
+"      NULL AS JOB_ODR_CANCEL_NO, "
+"      M_ITEM.PKG_UNIT_QTY AS PKG_UNIT_QTY, "
+"      M_ITEM.UNIT_QTY_TYP AS UNIT_QTY_TYP, "
+"      T_UNITE_ODR_WORK.CUST_CD AS CUST_CD, "
+"      T_UNITE_ODR_WORK.FINAL_DLV_LOC_CD AS DLV_LOC_CD, "
+"      NULL AS DESINATED_DLV_DATE, "
+"      NULL AS ODR_ACPT_DATE, "
+"      NULL AS VEND_CD, "
+"      NULL AS ODR_START_DATE, "
+"      NULL AS PUCH_ODR_START_DATE, "
+"      NULL AS M_WH_PLANT_CD, "
+"      NULL AS TRANSPORT_LT, "
+"      NULL AS FIX_ODR_QTY, "
+"      NULL AS UNOFFICIAL_ODR_QTY, "
+"      T_UNITE_ODR_WORK.DIVISION_QTY AS DEPOT_QTY, "
+"      T_UNITE_ODR_WORK.ODR_DEPOT_CTL_NO AS ODR_DEPOT_CTL_NO, "
+"      T_UNITE_ODR_WORK.CUST_ODR_NO AS CUST_ODR_NO, "
+"      T_UNITE_ODR_WORK.ODR_CHARACTERISTIC AS ODR_CHARACTERISTIC "
+"    FROM "
+"      T_UNITE_ODR_WORK, "
+"      T_OD, "
+"      M_ITEM, "
+"      SYS_TYPE_VALUE "
+"    WHERE "
+"      T_UNITE_ODR_WORK.ITEM_CD = ? "
+"      AND T_UNITE_ODR_WORK.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      AND T_UNITE_ODR_WORK.PLANT_CD = ? "
+"      AND T_UNITE_ODR_WORK.DEL_FLG = 0 "
+"      AND T_UNITE_ODR_WORK.UNITE_ODR_TYP = 3 "
+"      AND T_UNITE_ODR_WORK.DIVISION_QTY > 0 "
+"      AND T_UNITE_ODR_WORK.OD_NO = T_OD.OD_NO "
+"      AND T_OD.DM_STS_TYP <> 9 "
+"      AND T_OD.OD_TYP IN (1, 3) "
+"      AND '22' = SYS_TYPE_VALUE.VALUE(+) "
+"      AND SYS_TYPE_VALUE.NAME = 'MP_ODR_STATUS' "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) A, "
+"  M_CUST B "
+"WHERE "
+"  A.CUST_CD = B.CUST_CD(+) "
+"  AND B.COMPANY_CD = ? "
+"  AND(? = 1 "
+"  OR  abs(NVL(A.INTEGRATE_ODR_QTY, 0)) + abs(NVL(A.DEMAND_QTY, 0)) + abs(NVL(A.STOCK_ODR_QTY, 0)) <> 0) "
+"ORDER BY "
+"  A.SORT_NO, "
+"  A.DELIVERY_DATE NULLS FIRST, "
+"  A.NUMBER_STATUS, "
+"  A.WH_CD, "
+"  A.JOB_ODR_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AG0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AG0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORKCnt	", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read2
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORKCnt	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AG0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read3
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORKCnt	", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AG0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getw_ITEM_CD());
				if(isNull(data.getw_ITEM_CD())) isNull = true;
				ary.addElement(data.getw_PLANT_CD());
				if(isNull(data.getw_PLANT_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_QTY_FLG());
				if(isNull(data.getw_QTY_FLG())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getROW_COUNT(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getROW_COUNT(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getw_QTY_FLG(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AG0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AG0050010Struct data = new AG0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getDETAIL_DATA_JA_WORKCnt	", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AG0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AG0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AG0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_clear

			return;
		}

		/**
		 * getDETAIL_DATA_JA_WORKCnt	�N���X�̕W���R���X�g���N�^
		 */
		public getDETAIL_DATA_JA_WORKCnt	()
		{
			//{{user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getDETAIL_DATA_JA_WORKCnt	_constractor

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
		mselect.clear();
		mselect = null;
		mcheckM_PLANT.clear();
		mcheckM_PLANT = null;
		mgetSCDL_ISSUE_TOTAL_FIX.clear();
		mgetSCDL_ISSUE_TOTAL_FIX = null;
		mgetSCDL_ISSUE_TOTAL_NOFIX.clear();
		mgetSCDL_ISSUE_TOTAL_NOFIX = null;
		mgetSCDL_RCV_TOTAL_FIX.clear();
		mgetSCDL_RCV_TOTAL_FIX = null;
		mgetSCDL_RCV_TOTAL_NOFIX.clear();
		mgetSCDL_RCV_TOTAL_NOFIX = null;
		mgetDETAIL_DATA.clear();
		mgetDETAIL_DATA = null;
		mgetSYS_BAT_PARM.clear();
		mgetSYS_BAT_PARM = null;
		mgetSYS_CLASS_CODE.clear();
		mgetSYS_CLASS_CODE = null;
		mcheckM_PS.clear();
		mcheckM_PS = null;
		mgetT_WORK_ITEM_INFO.clear();
		mgetT_WORK_ITEM_INFO = null;
		mgetT_RLSD_ITEM_INFO.clear();
		mgetT_RLSD_ITEM_INFO = null;
		mgetSYS_INSTALL_OPTIONS.clear();
		mgetSYS_INSTALL_OPTIONS = null;
		mgetDETAIL_DATA_JA.clear();
		mgetDETAIL_DATA_JA = null;
		mgetDETAIL_DATA_J.clear();
		mgetDETAIL_DATA_J = null;
		mgetDETAL_DATA_JCnt.clear();
		mgetDETAL_DATA_JCnt = null;
		mgetDETAL_DATACnt.clear();
		mgetDETAL_DATACnt = null;
		mgetDETAIL_DATA_JACnt.clear();
		mgetDETAIL_DATA_JACnt = null;
		mgetT_OD_INFO.clear();
		mgetT_OD_INFO = null;
		mgetDM_CREATE_BASE_TBL	.clear();
		mgetDM_CREATE_BASE_TBL	 = null;
		mgetDETAIL_DATA_JA_WORK	.clear();
		mgetDETAIL_DATA_JA_WORK	 = null;
		mgetDETAIL_DATA_JA_WORKCnt	.clear();
		mgetDETAIL_DATA_JA_WORKCnt	 = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AG0050010�N���X�̕W���R���X�g���N�^
	 */
	public AG0050010Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
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
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
