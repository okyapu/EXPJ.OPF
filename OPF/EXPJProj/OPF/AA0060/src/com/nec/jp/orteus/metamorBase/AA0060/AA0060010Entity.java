/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0060/src/com/nec/jp/orteus/metamorBase/AA0060/AA0060010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0060;

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

public class AA0060010Entity extends DataObject
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

	// insertM_WS�N���X �C���X�^���X
	public insertM_WS minsertM_WS = new insertM_WS();

	// updateM_WS�N���X �C���X�^���X
	public updateM_WS mupdateM_WS = new updateM_WS();

	// deleteM_WS�N���X �C���X�^���X
	public deleteM_WS mdeleteM_WS = new deleteM_WS();

	// checkM_WS�N���X �C���X�^���X
	public checkM_WS mcheckM_WS = new checkM_WS();

	// checkM_PROC_GRP�N���X �C���X�^���X
	public checkM_PROC_GRP mcheckM_PROC_GRP = new checkM_PROC_GRP();

	// check_T_WORK_IN_PROC_BY_ITEM�N���X �C���X�^���X
	public check_T_WORK_IN_PROC_BY_ITEM mcheck_T_WORK_IN_PROC_BY_ITEM = new check_T_WORK_IN_PROC_BY_ITEM();

	// check_T_WORK_IN_PROC_BY_PROC�N���X �C���X�^���X
	public check_T_WORK_IN_PROC_BY_PROC mcheck_T_WORK_IN_PROC_BY_PROC = new check_T_WORK_IN_PROC_BY_PROC();

	// check_T_OPR_RSLT�N���X �C���X�^���X
	public check_T_OPR_RSLT mcheck_T_OPR_RSLT = new check_T_OPR_RSLT();

	// check_T_OUTPUT_RSLT�N���X �C���X�^���X
	public check_T_OUTPUT_RSLT mcheck_T_OUTPUT_RSLT = new check_T_OUTPUT_RSLT();

	// checkSUB_WS_CD�N���X �C���X�^���X
	public checkSUB_WS_CD mcheckSUB_WS_CD = new checkSUB_WS_CD();

	// checkSUB_WS_EXIST�N���X �C���X�^���X
	public checkSUB_WS_EXIST mcheckSUB_WS_EXIST = new checkSUB_WS_EXIST();

	// checkWH_CD�N���X �C���X�^���X
	public checkWH_CD mcheckWH_CD = new checkWH_CD();

	// readM_WS4Update�N���X �C���X�^���X
	public readM_WS4Update mreadM_WS4Update = new readM_WS4Update();

	// selectCLASS_NAME�N���X �C���X�^���X
	public selectCLASS_NAME mselectCLASS_NAME = new selectCLASS_NAME();

	// selectM_WS_CLASS�N���X �C���X�^���X
	public selectM_WS_CLASS mselectM_WS_CLASS = new selectM_WS_CLASS();

	// insertM_WS_CLASS�N���X �C���X�^���X
	public insertM_WS_CLASS minsertM_WS_CLASS = new insertM_WS_CLASS();

	// updateM_WS_CLASS�N���X �C���X�^���X
	public updateM_WS_CLASS mupdateM_WS_CLASS = new updateM_WS_CLASS();

	// deleteM_WS_CLASS�N���X �C���X�^���X
	public deleteM_WS_CLASS mdeleteM_WS_CLASS = new deleteM_WS_CLASS();

	// selectWS_CLASS_01_NAME�N���X �C���X�^���X
	public selectWS_CLASS_01_NAME mselectWS_CLASS_01_NAME = new selectWS_CLASS_01_NAME();

	// insertM_WS_CLASS_N�N���X �C���X�^���X
	public insertM_WS_CLASS_N minsertM_WS_CLASS_N = new insertM_WS_CLASS_N();


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
		String m_write_fname="AA0060010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AA0060010";

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
+"  M_WS.\"WS_CD\" as \"WS_CD\", "
+"  M_WS.\"WS_CD\" as \"h_WS_CD\", "
+"  M_WS.\"WS_NAME\" as \"WS_NAME\", "
+"  M_WS.\"WS_TEL\" as \"WS_TEL\", "
+"  M_WS.\"WS_PERSON\" as \"WS_PERSON\", "
+"  M_WS.\"WH_CD\" as \"WH_CD\", "
+"  M_WS.\"SUB_WS_CD\" as \"SUB_WS_CD\", "
+"  M_WS.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  sub_M_WS.\"WS_NAME\" as \"SUB_WS_NAME\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_WS.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  M_WS M_WS, "
+"  M_WS sub_M_WS, "
+"  M_WH "
+"where "
+"  M_WS.WH_CD = M_WH.WH_CD(+) "
+"  and M_WS.\"SUB_WS_CD\" = sub_M_WS.\"WS_CD\"(+) "
+"  and M_WS.\"WS_CD\" = ?";
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
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setWS_CD( getString(1, rs) );
			data.seth_WS_CD( getString(2, rs) );
			data.setWS_NAME( getString(3, rs) );
			data.setWS_TEL( getString(4, rs) );
			data.setWS_PERSON( getString(5, rs) );
			data.setWH_CD( getString(6, rs) );
			data.setSUB_WS_CD( getString(7, rs) );
			data.setMODIFY_COUNT( getInteger(8, rs) );
			data.setSUB_WS_NAME( getString(9, rs) );
			data.setWH_NAME( getString(10, rs) );
			data.setw_PLANT_CD( getString(11, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
	public class insertM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  M_WS(\"WS_CD\", \"WS_NAME\", \"WS_TEL\", \"WS_PERSON\", \"WH_CD\", \"SUB_WS_CD\", \"PLANT_CD\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertM_WS_def
                //}}user_implement_dev:insertM_WS_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getWS_CD(), stmt);
				setString(8, data.getWS_NAME(), stmt);
				setString(9, data.getWS_TEL(), stmt);
				setString(10, data.getWS_PERSON(), stmt);
				setString(11, data.getWH_CD(), stmt);
				setString(12, data.getSUB_WS_CD(), stmt);
				setString(13, data.getw_PLANT_CD(), stmt);

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
			//{{user_implement_dev:insertM_WS_clear
                        //}}user_implement_dev:insertM_WS_clear

			return;
		}

		/**
		 * insertM_WS�N���X�̕W���R���X�g���N�^
		 */
		public insertM_WS()
		{
			//{{user_implement_dev:insertM_WS_constractor
                        //}}user_implement_dev:insertM_WS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  M_WS "
+"set "
+"  \"WS_CD\" = ?, "
+"  \"WS_NAME\" = ?, "
+"  \"WS_TEL\" = ?, "
+"  \"WS_PERSON\" = ?, "
+"  \"WH_CD\" = ?, "
+"  \"SUB_WS_CD\" = ? "
+"where "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateM_WS_def
                //}}user_implement_dev:updateM_WS_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getWS_CD(), stmt);
				setString(5, data.getWS_NAME(), stmt);
				setString(6, data.getWS_TEL(), stmt);
				setString(7, data.getWS_PERSON(), stmt);
				setString(8, data.getWH_CD(), stmt);
				setString(9, data.getSUB_WS_CD(), stmt);
				setString(10, data.getWS_CD(), stmt);

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
			//{{user_implement_dev:updateM_WS_clear
                        //}}user_implement_dev:updateM_WS_clear

			return;
		}

		/**
		 * updateM_WS�N���X�̕W���R���X�g���N�^
		 */
		public updateM_WS()
		{
			//{{user_implement_dev:updateM_WS_constractor
                        //}}user_implement_dev:updateM_WS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class deleteM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "delete from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_WS_def
                //}}user_implement_dev:deleteM_WS_def

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getWS_CD(), stmt);

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
			//{{user_implement_dev:deleteM_WS_clear
                        //}}user_implement_dev:deleteM_WS_clear

			return;
		}

		/**
		 * deleteM_WS�N���X�̕W���R���X�g���N�^
		 */
		public deleteM_WS()
		{
			//{{user_implement_dev:deleteM_WS_constractor
                        //}}user_implement_dev:deleteM_WS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_WS.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_WS_def
                //}}user_implement_dev:checkM_WS_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_WS_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("checkM_WS", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_WS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_WS_clear
                        //}}user_implement_dev:checkM_WS_clear

			return;
		}

		/**
		 * checkM_WS�N���X�̕W���R���X�g���N�^
		 */
		public checkM_WS()
		{
			//{{user_implement_dev:checkM_WS_constractor
                        //}}user_implement_dev:checkM_WS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_PROC_GRP.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  M_PROC_GRP "
+"where "
+"  M_PROC_GRP.\"WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PROC_GRP_def
                //}}user_implement_dev:checkM_PROC_GRP_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PROC_GRP_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("checkM_PROC_GRP", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkM_PROC_GRP_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PROC_GRP_clear
                        //}}user_implement_dev:checkM_PROC_GRP_clear

			return;
		}

		/**
		 * checkM_PROC_GRP�N���X�̕W���R���X�g���N�^
		 */
		public checkM_PROC_GRP()
		{
			//{{user_implement_dev:checkM_PROC_GRP_constractor
                        //}}user_implement_dev:checkM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class check_T_WORK_IN_PROC_BY_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_WORK_IN_PROC_BY_ITEM.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  T_WORK_IN_PROC_BY_ITEM "
+"where "
+"  T_WORK_IN_PROC_BY_ITEM.\"WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_def
                //}}user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("check_T_WORK_IN_PROC_BY_ITEM", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_clear
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_clear

			return;
		}

		/**
		 * check_T_WORK_IN_PROC_BY_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public check_T_WORK_IN_PROC_BY_ITEM()
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_constractor
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class check_T_WORK_IN_PROC_BY_PROC extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_WORK_IN_PROC_BY_PROC.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  T_WORK_IN_PROC_BY_PROC "
+"where "
+"  T_WORK_IN_PROC_BY_PROC.\"WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_def
                //}}user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("check_T_WORK_IN_PROC_BY_PROC", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_clear
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_clear

			return;
		}

		/**
		 * check_T_WORK_IN_PROC_BY_PROC�N���X�̕W���R���X�g���N�^
		 */
		public check_T_WORK_IN_PROC_BY_PROC()
		{
			//{{user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_constractor
                        //}}user_implement_dev:check_T_WORK_IN_PROC_BY_PROC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class check_T_OPR_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_OPR_RSLT.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  T_OPR_RSLT "
+"where "
+"  T_OPR_RSLT.WS_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_OPR_RSLT_def
                //}}user_implement_dev:check_T_OPR_RSLT_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_OPR_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("check_T_OPR_RSLT", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:check_T_OPR_RSLT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_OPR_RSLT_clear
                        //}}user_implement_dev:check_T_OPR_RSLT_clear

			return;
		}

		/**
		 * check_T_OPR_RSLT�N���X�̕W���R���X�g���N�^
		 */
		public check_T_OPR_RSLT()
		{
			//{{user_implement_dev:check_T_OPR_RSLT_constractor
                        //}}user_implement_dev:check_T_OPR_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class check_T_OUTPUT_RSLT extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  T_OUTPUT_RSLT.\"WS_CD\" as \"WS_CD\" "
+"from "
+"  T_OUTPUT_RSLT "
+"where "
+"  T_OUTPUT_RSLT.WS_CD = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:check_T_OUTPUT_RSLT_def
                //}}user_implement_dev:check_T_OUTPUT_RSLT_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:check_T_OUTPUT_RSLT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("check_T_OUTPUT_RSLT", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:check_T_OUTPUT_RSLT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:check_T_OUTPUT_RSLT_clear
                        //}}user_implement_dev:check_T_OUTPUT_RSLT_clear

			return;
		}

		/**
		 * check_T_OUTPUT_RSLT�N���X�̕W���R���X�g���N�^
		 */
		public check_T_OUTPUT_RSLT()
		{
			//{{user_implement_dev:check_T_OUTPUT_RSLT_constractor
                        //}}user_implement_dev:check_T_OUTPUT_RSLT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkSUB_WS_CD extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select "
+"  M_WS.\"SUB_WS_CD\" as \"SUB_WS_CD\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"SUB_WS_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSUB_WS_CD_def
                //}}user_implement_dev:checkSUB_WS_CD_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSUB_WS_CD_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getWS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("checkSUB_WS_CD", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkSUB_WS_CD_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkSUB_WS_CD_clear
                        //}}user_implement_dev:checkSUB_WS_CD_clear

			return;
		}

		/**
		 * checkSUB_WS_CD�N���X�̕W���R���X�g���N�^
		 */
		public checkSUB_WS_CD()
		{
			//{{user_implement_dev:checkSUB_WS_CD_constractor
                        //}}user_implement_dev:checkSUB_WS_CD_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkSUB_WS_EXIST extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WS.\"WS_CD\" as \"WS_CD\", "
+"  M_WS.\"WS_NAME\" as \"WS_NAME\", "
+"  M_WS.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkSUB_WS_EXIST_def
                //}}user_implement_dev:checkSUB_WS_EXIST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSUB_WS_EXIST_read
			if(m_selcmd==null) throw new FoundationException("checkSUB_WS_EXIST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_selcmd);
				setString(1, data.getSUB_WS_CD(), stmt);
			//------------------------------------------------------------------

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkSUB_WS_EXIST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSUB_WS_EXIST_read2
			if(m_selcmd==null) throw new FoundationException("checkSUB_WS_EXIST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkSUB_WS_EXIST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSUB_WS_EXIST_read3
			if(m_selcmd==null) throw new FoundationException("checkSUB_WS_EXIST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkSUB_WS_EXIST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSUB_WS_CD());
				if(isNull(data.getSUB_WS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getSUB_WS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setWS_CD( getString(1, rs) );
			data.setSUB_WS_NAME( getString(2, rs) );
			data.setw_PLANT_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkSUB_WS_EXIST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkSUB_WS_EXIST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
			//------------------------------------------------------------------
				stmt = conn.prepareStatement(m_chkcmd);
				setString(1, data.getSUB_WS_CD(), stmt);
			//------------------------------------------------------------------
			} else {
				throw new FoundationException("checkSUB_WS_EXIST", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkSUB_WS_EXIST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkSUB_WS_EXIST_clear
                        //}}user_implement_dev:checkSUB_WS_EXIST_clear

			return;
		}

		/**
		 * checkSUB_WS_EXIST�N���X�̕W���R���X�g���N�^
		 */
		public checkSUB_WS_EXIST()
		{
			//{{user_implement_dev:checkSUB_WS_EXIST_constractor
                        //}}user_implement_dev:checkSUB_WS_EXIST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkWH_CD extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkWH_CD_def
                //}}user_implement_dev:checkWH_CD_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWH_CD_read
			if(m_selcmd==null) throw new FoundationException("checkWH_CD", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:checkWH_CD_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWH_CD_read2
			if(m_selcmd==null) throw new FoundationException("checkWH_CD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkWH_CD_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWH_CD_read3
			if(m_selcmd==null) throw new FoundationException("checkWH_CD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:checkWH_CD_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setWH_CD( getString(1, rs) );
			data.setWH_NAME( getString(2, rs) );
			data.setw_PLANT_CD( getString(3, rs) );
			data.setWH_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("checkWH_CD", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkWH_CD_check
			return  true;
                        //}}user_implement_dev:checkWH_CD_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:checkWH_CD_clear
                        //}}user_implement_dev:checkWH_CD_clear

			return;
		}

		/**
		 * checkWH_CD�N���X�̕W���R���X�g���N�^
		 */
		public checkWH_CD()
		{
			//{{user_implement_dev:checkWH_CD_constractor
                        //}}user_implement_dev:checkWH_CD_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readM_WS4Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WS.\"PLANT_CD\" as \"PLANT_CD\", "
+"  M_WS.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  M_WS "
+"where "
+"  M_WS.\"WS_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readM_WS4Update_def
                //}}user_implement_dev:readM_WS4Update_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WS4Update_read
			if(m_selcmd==null) throw new FoundationException("readM_WS4Update", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WS4Update_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WS4Update_read2
			if(m_selcmd==null) throw new FoundationException("readM_WS4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readM_WS4Update_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WS4Update_read3
			if(m_selcmd==null) throw new FoundationException("readM_WS4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readM_WS4Update_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setw_PLANT_CD( getString(1, rs) );
			data.setMODIFY_COUNT( getInteger(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readM_WS4Update", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_WS4Update_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readM_WS4Update", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_WS4Update_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readM_WS4Update_clear
                        //}}user_implement_dev:readM_WS4Update_clear

			return;
		}

		/**
		 * readM_WS4Update�N���X�̕W���R���X�g���N�^
		 */
		public readM_WS4Update()
		{
			//{{user_implement_dev:readM_WS4Update_constractor
                        //}}user_implement_dev:readM_WS4Update_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectCLASS_NAME extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  CLASS_NAME "
+"FROM "
+"  M_CLASS "
+"WHERE "
+"  CLASS_CD1 = '40' "
+"  AND CLASS_CD2 = '01' "
+"  AND CLASS_CD3 = '00'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectCLASS_NAME_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectCLASS_NAME_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCLASS_NAME_read
			if(m_selcmd==null) throw new FoundationException("selectCLASS_NAME", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCLASS_NAME_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCLASS_NAME_read2
			if(m_selcmd==null) throw new FoundationException("selectCLASS_NAME", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectCLASS_NAME_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCLASS_NAME_read3
			if(m_selcmd==null) throw new FoundationException("selectCLASS_NAME", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectCLASS_NAME_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setCLASS_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectCLASS_NAME", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCLASS_NAME_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCLASS_NAME_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectCLASS_NAME_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectCLASS_NAME_clear

			return;
		}

		/**
		 * selectCLASS_NAME�N���X�̕W���R���X�g���N�^
		 */
		public selectCLASS_NAME()
		{
			//{{user_implement_dev:selectCLASS_NAME_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectCLASS_NAME_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectM_WS_CLASS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  WS_CLASS_01_CD, "
+"  MODIFY_COUNT "
+"FROM "
+"  M_WS_CLASS "
+"WHERE "
+"  WS_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_WS_CLASS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_WS_CLASS_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_CLASS_read
			if(m_selcmd==null) throw new FoundationException("selectM_WS_CLASS", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_WS_CLASS_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_CLASS_read2
			if(m_selcmd==null) throw new FoundationException("selectM_WS_CLASS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_WS_CLASS_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_CLASS_read3
			if(m_selcmd==null) throw new FoundationException("selectM_WS_CLASS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_WS_CLASS_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setWS_CLASS_01_CD( getString(1, rs) );
			data.seth_MODIFY_COUNT( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_WS_CLASS", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_WS_CLASS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_WS_CLASS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_WS_CLASS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_WS_CLASS_clear

			return;
		}

		/**
		 * selectM_WS_CLASS�N���X�̕W���R���X�g���N�^
		 */
		public selectM_WS_CLASS()
		{
			//{{user_implement_dev:selectM_WS_CLASS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_WS_CLASS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class insertM_WS_CLASS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  M_WS_CLASS(WS_CD, WS_CLASS_01_TYP, WS_CLASS_01_CD, WS_CLASS_01_NAME) "
+"VALUES "
+"  (?, '4001', ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertM_WS_CLASS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:insertM_WS_CLASS_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getWS_CD(), stmt);
				setString(8, data.getWS_CLASS_01_CD(), stmt);
				setString(9, data.getWS_CLASS_01_NAME(), stmt);

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
			//{{user_implement_dev:insertM_WS_CLASS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:insertM_WS_CLASS_clear

			return;
		}

		/**
		 * insertM_WS_CLASS�N���X�̕W���R���X�g���N�^
		 */
		public insertM_WS_CLASS()
		{
			//{{user_implement_dev:insertM_WS_CLASS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:insertM_WS_CLASS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateM_WS_CLASS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  M_WS_CLASS "
+"SET "
+"  WS_CLASS_01_TYP = '4001', "
+"  WS_CLASS_01_CD = ?, "
+"  WS_CLASS_01_NAME = ? "
+"WHERE "
+"  WS_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateM_WS_CLASS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateM_WS_CLASS_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getWS_CLASS_01_CD(), stmt);
				setString(5, data.getWS_CLASS_01_NAME(), stmt);
				setString(6, data.getWS_CD(), stmt);

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
			//{{user_implement_dev:updateM_WS_CLASS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateM_WS_CLASS_clear

			return;
		}

		/**
		 * updateM_WS_CLASS�N���X�̕W���R���X�g���N�^
		 */
		public updateM_WS_CLASS()
		{
			//{{user_implement_dev:updateM_WS_CLASS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateM_WS_CLASS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class deleteM_WS_CLASS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  M_WS_CLASS "
+"WHERE "
+"  WS_CD = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:deleteM_WS_CLASS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:deleteM_WS_CLASS_def

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getWS_CD(), stmt);

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
			//{{user_implement_dev:deleteM_WS_CLASS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:deleteM_WS_CLASS_clear

			return;
		}

		/**
		 * deleteM_WS_CLASS�N���X�̕W���R���X�g���N�^
		 */
		public deleteM_WS_CLASS()
		{
			//{{user_implement_dev:deleteM_WS_CLASS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:deleteM_WS_CLASS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectWS_CLASS_01_NAME extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  CLASS_NAME "
+"FROM "
+"  M_CLASS "
+"WHERE "
+"  CLASS_CD1 = '40' "
+"  AND CLASS_CD2 = '01' "
+"  AND CLASS_CD3 = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectWS_CLASS_01_NAME_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectWS_CLASS_01_NAME_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWS_CLASS_01_NAME_read
			if(m_selcmd==null) throw new FoundationException("selectWS_CLASS_01_NAME", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWS_CLASS_01_NAME_read2
			if(m_selcmd==null) throw new FoundationException("selectWS_CLASS_01_NAME", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AA0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWS_CLASS_01_NAME_read3
			if(m_selcmd==null) throw new FoundationException("selectWS_CLASS_01_NAME", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CLASS_01_CD());
				if(isNull(data.getWS_CLASS_01_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWS_CLASS_01_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AA0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0060010Struct data = new AA0060010Struct();

			data.setWS_CLASS_01_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectWS_CLASS_01_NAME", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectWS_CLASS_01_NAME_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AA0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectWS_CLASS_01_NAME_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_clear

			return;
		}

		/**
		 * selectWS_CLASS_01_NAME�N���X�̕W���R���X�g���N�^
		 */
		public selectWS_CLASS_01_NAME()
		{
			//{{user_implement_dev:selectWS_CLASS_01_NAME_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectWS_CLASS_01_NAME_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class insertM_WS_CLASS_N extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  M_WS_CLASS(WS_CD, WS_CLASS_01_TYP) "
+"VALUES "
+"  (?, '4001')";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0060010";
		protected String m_sUpdateProgramName="AA0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:insertM_WS_CLASS_N_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:insertM_WS_CLASS_N_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AA0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I(m_inscmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MSSQL(m_inscmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_PGSQL(m_inscmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_MYSQL(m_inscmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_I_DB2(m_inscmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sCreateProgramName, stmt);
				setString(4, data.getsSysdate(), stmt);
				setString(5, data.getsUser_ID(), stmt);
				setString(6, m_sCreateProgramName, stmt);
				setString(7, data.getWS_CD(), stmt);

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
			//{{user_implement_dev:insertM_WS_CLASS_N_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:insertM_WS_CLASS_N_clear

			return;
		}

		/**
		 * insertM_WS_CLASS_N�N���X�̕W���R���X�g���N�^
		 */
		public insertM_WS_CLASS_N()
		{
			//{{user_implement_dev:insertM_WS_CLASS_N_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:insertM_WS_CLASS_N_constractor

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
		minsertM_WS.clear();
		minsertM_WS = null;
		mupdateM_WS.clear();
		mupdateM_WS = null;
		mdeleteM_WS.clear();
		mdeleteM_WS = null;
		mcheckM_WS.clear();
		mcheckM_WS = null;
		mcheckM_PROC_GRP.clear();
		mcheckM_PROC_GRP = null;
		mcheck_T_WORK_IN_PROC_BY_ITEM.clear();
		mcheck_T_WORK_IN_PROC_BY_ITEM = null;
		mcheck_T_WORK_IN_PROC_BY_PROC.clear();
		mcheck_T_WORK_IN_PROC_BY_PROC = null;
		mcheck_T_OPR_RSLT.clear();
		mcheck_T_OPR_RSLT = null;
		mcheck_T_OUTPUT_RSLT.clear();
		mcheck_T_OUTPUT_RSLT = null;
		mcheckSUB_WS_CD.clear();
		mcheckSUB_WS_CD = null;
		mcheckSUB_WS_EXIST.clear();
		mcheckSUB_WS_EXIST = null;
		mcheckWH_CD.clear();
		mcheckWH_CD = null;
		mreadM_WS4Update.clear();
		mreadM_WS4Update = null;
		mselectCLASS_NAME.clear();
		mselectCLASS_NAME = null;
		mselectM_WS_CLASS.clear();
		mselectM_WS_CLASS = null;
		minsertM_WS_CLASS.clear();
		minsertM_WS_CLASS = null;
		mupdateM_WS_CLASS.clear();
		mupdateM_WS_CLASS = null;
		mdeleteM_WS_CLASS.clear();
		mdeleteM_WS_CLASS = null;
		mselectWS_CLASS_01_NAME.clear();
		mselectWS_CLASS_01_NAME = null;
		minsertM_WS_CLASS_N.clear();
		minsertM_WS_CLASS_N = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AA0060010�N���X�̕W���R���X�g���N�^
	 */
	public AA0060010Entity() throws FoundationException
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
