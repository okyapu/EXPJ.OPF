/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0060/src/com/nec/jp/orteus/metamorBase/KR0060/KR0060010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0060;

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
 * CLASS     : KR0060010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KR0060010Entity extends DataObject
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

	// SYS_INSTALL_OPTIONS�N���X �C���X�^���X
	public SYS_INSTALL_OPTIONS mSYS_INSTALL_OPTIONS = new SYS_INSTALL_OPTIONS();

	// selectUSER_MST�N���X �C���X�^���X
	public selectUSER_MST mselectUSER_MST = new selectUSER_MST();

	// selectSYS_MY_COMPANY�N���X �C���X�^���X
	public selectSYS_MY_COMPANY mselectSYS_MY_COMPANY = new selectSYS_MY_COMPANY();

	// selectSYS_CLASS_CODE�N���X �C���X�^���X
	public selectSYS_CLASS_CODE mselectSYS_CLASS_CODE = new selectSYS_CLASS_CODE();

	// selectT_SALES�N���X �C���X�^���X
	public selectT_SALES mselectT_SALES = new selectT_SALES();

	// selectM_CUST�N���X �C���X�^���X
	public selectM_CUST mselectM_CUST = new selectM_CUST();

	// checkT_SALES_appr�N���X �C���X�^���X
	public checkT_SALES_appr mcheckT_SALES_appr = new checkT_SALES_appr();

	// checkT_SALES_rtn�N���X �C���X�^���X
	public checkT_SALES_rtn mcheckT_SALES_rtn = new checkT_SALES_rtn();

	// updateT_SALES�N���X �C���X�^���X
	public updateT_SALES mupdateT_SALES = new updateT_SALES();

	// selectT_SALES_modify�N���X �C���X�^���X
	public selectT_SALES_modify mselectT_SALES_modify = new selectT_SALES_modify();

	// checkT_SALES_save�N���X �C���X�^���X
	public checkT_SALES_save mcheckT_SALES_save = new checkT_SALES_save();

	// getSYS_INSTALL_OPTIONS�N���X �C���X�^���X
	public getSYS_INSTALL_OPTIONS mgetSYS_INSTALL_OPTIONS = new getSYS_INSTALL_OPTIONS();

	// selectT_SALES_Jf�N���X �C���X�^���X
	public selectT_SALES_Jf mselectT_SALES_Jf = new selectT_SALES_Jf();

	// checkAiR_INSTALL_FLG�N���X �C���X�^���X
	public checkAiR_INSTALL_FLG mcheckAiR_INSTALL_FLG = new checkAiR_INSTALL_FLG();

	// updateAPPR_FLG�N���X �C���X�^���X
	public updateAPPR_FLG mupdateAPPR_FLG = new updateAPPR_FLG();

	// updateAPPR_MAX�N���X �C���X�^���X
	public updateAPPR_MAX mupdateAPPR_MAX = new updateAPPR_MAX();

	// updateAPPR_SAVE�N���X �C���X�^���X
	public updateAPPR_SAVE mupdateAPPR_SAVE = new updateAPPR_SAVE();

	// updateAPPR_CANCEL�N���X �C���X�^���X
	public updateAPPR_CANCEL mupdateAPPR_CANCEL = new updateAPPR_CANCEL();

	// selectT_SALESCnt�N���X �C���X�^���X
	public selectT_SALESCnt mselectT_SALESCnt = new selectT_SALESCnt();

	// selectT_SALES_JfCnt�N���X �C���X�^���X
	public selectT_SALES_JfCnt mselectT_SALES_JfCnt = new selectT_SALES_JfCnt();


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
		String m_write_fname="KR0060010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="KR0060010";

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
	public class SYS_INSTALL_OPTIONS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_INSTALL_OPTIONS.INSTALL_FLG "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'B*'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_INSTALL_OPTIONS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SYS_INSTALL_OPTIONS_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read2
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_read3
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setINSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_INSTALL_OPTIONS", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_clear

			return;
		}

		/**
		 * SYS_INSTALL_OPTIONS�N���X�̕W���R���X�g���N�^
		 */
		public SYS_INSTALL_OPTIONS()
		{
			//{{user_implement_dev:SYS_INSTALL_OPTIONS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SYS_INSTALL_OPTIONS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectUSER_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  USER_MST.SECTION_CD, "
+"  USER_MST.APPR_POWER_TYP "
+"FROM "
+"  USER_MST "
+"WHERE "
+"  USER_MST.USER_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectUSER_MST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectUSER_MST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read2
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectUSER_MST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_read3
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectUSER_MST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUSER_CD());
				if(isNull(data.getUSER_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setSECTION_CD( getString(1, rs) );
			data.setAPPR_POWER_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectUSER_MST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectUSER_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectUSER_MST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectUSER_MST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectUSER_MST_clear

			return;
		}

		/**
		 * selectUSER_MST�N���X�̕W���R���X�g���N�^
		 */
		public selectUSER_MST()
		{
			//{{user_implement_dev:selectUSER_MST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectUSER_MST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.COMPANY_CD "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
+"  SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_MY_COMPANY_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectSYS_MY_COMPANY_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_MY_COMPANY_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_MY_COMPANY_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_MY_COMPANY_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectSYS_MY_COMPANY_clear

			return;
		}

		/**
		 * selectSYS_MY_COMPANY�N���X�̕W���R���X�g���N�^
		 */
		public selectSYS_MY_COMPANY()
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectSYS_MY_COMPANY_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectSYS_CLASS_CODE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_CLASS_CODE.CODE "
+"FROM "
+"  SYS_CLASS_CODE "
+"WHERE "
+"  SYS_CLASS_CODE.SYS_CLASS = ? "
+"  AND SYS_CLASS_CODE.CLASS_CODE = 'PLANT_WEB'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_CLASS_CODE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectSYS_CLASS_CODE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_CLASS_CODE_read
			if(m_selcmd==null) throw new FoundationException("selectSYS_CLASS_CODE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_CLASS_CODE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_CLASS_CODE_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_CLASS_CODE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_CLASS_CODE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_CLASS_CODE_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_CLASS_CODE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_CLASS_CODE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSYS_CLASS());
				if(isNull(data.getSYS_CLASS())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getSYS_CLASS(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setSYS_PLANT_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_CLASS_CODE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_CLASS_CODE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_CLASS_CODE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_CLASS_CODE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectSYS_CLASS_CODE_clear

			return;
		}

		/**
		 * selectSYS_CLASS_CODE�N���X�̕W���R���X�g���N�^
		 */
		public selectSYS_CLASS_CODE()
		{
			//{{user_implement_dev:selectSYS_CLASS_CODE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectSYS_CLASS_CODE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SALES extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ROW_NUMBER() OVER( "
+"    ORDER BY "
+"      T.SHIP_ODR_NO, "
+"      T.SLIP_CD), "
+"  T.APPR_ID, "
+"  TO_CHAR(T.APPR_DATE, 'YYYY/MM/DD'), "
+"  T.RESERVE_CAUSE, "
+"  T.SALES_SEQ_NO, "
+"  T.SHIP_ODR_NO, "
+"  T.SLIP_CD, "
+"  T.SALES_TYP, "
+"  T.CUST_CD, "
+"  M_CUST.CUST_NAME, "
+"  T.SALES_DEPT_CD, "
+"  M_ORG.ORG_NAME, "
+"  T.ITEM_CD, "
+"  T.ITEM_NAME, "
+"  T.CUST_ODR_NO, "
+"  TO_CHAR(T.SALES_DATE, 'YYYY/MM/DD'), "
+"  T.CUST_CHRG_PSN_CD, "
+"  USERCUST.USER_NAME, "
+"  T.ODR_ACPT_PSN_CD, "
+"  USERODR.USER_NAME, "
+"  T.SALES_QTY, "
+"  T.SALES_UNIT_PRICE, "
+"  T.UNIT_CD, "
+"  T.SALES_AMOUNT, "
+"  T.SALES_AMOUNT_EXCH_RATES, "
+"  TO_CHAR(T.INSPC_ACPT_DATE, 'YYYY/MM/DD'), "
+"  T.INSPC_ACPT_QTY, "
+"  T.EXTERNAL_TAX_SALES_AMOUNT, "
+"  T.INTERNAL_TAX_SALES_AMOUNT, "
+"  T.TAXFREE_SALES_AMOUNT, "
+"  T.TAX_CREDIT_SALES_AMOUNT, "
+"  T.EXTERNAL_TAX_AMOUNT, "
+"  T.INTERNAL_TAX_AMOUNT, "
+"  T.TAX_AMOUNT_1, "
+"  T.TAX_AMOUNT_2, "
+"  T.TAX_AMOUNT_3, "
+"  T.OWN_CUR_TAXCREDIT_SALES_AMOUNT, "
+"  T.ORG_SLIP_CD, "
+"  T.CURRNCY_CD, "
+"  T.SPCL_PRICE_CO, "
+"  T.REMARKS, "
+"  T.INSPC_ACPT_TYP, "
+"  T.MODIFY_COUNT, "
+"  T.AI_AR_IF_FLG "
+"FROM "
+"  T_SALES T, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST USERCUST, "
+"  USER_MST USERODR, "
+"  ( SELECT MAX(SALES_SEQ_NO) AS  SALES_SEQ_NO "
+"       FROM T_SALES  "
+"       GROUP BY SLIP_CD,SHIP_ODR_NO "
+"   ) A "
+"WHERE "
+"  T.CUST_CD = ? "
+"  AND T.SALES_DATE >= ? "
+"  AND T.SALES_DATE <= ? "
+"  AND T.SALES_DEPT_CD = ? "
+"  AND T.APPR_FLG = ? "
+"  AND T.STATUS = 20 "
+"  AND T.SALES_SEQ_NO = A.SALES_SEQ_NO "
+"  AND M_CUST.CUST_CD(+) = T.CUST_CD "
+"  AND M_ORG.ORG_CD(+) = T.SALES_DEPT_CD "
+"  AND USERCUST.USER_CD(+) = T.CUST_CHRG_PSN_CD "
+"  AND USERODR.USER_CD(+) = T.ODR_ACPT_PSN_CD "
+"ORDER BY "
+"  T.SHIP_ODR_NO, "
+"  T.SLIP_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SALES_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SALES_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_read
			if(m_selcmd==null) throw new FoundationException("selectT_SALES", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SALES", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SALES", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getSALES_DATE_FROM());
				if(isNull(data.getSALES_DATE_FROM())) isNull = true;
				ary.addElement(data.getSALES_DATE_TO());
				if(isNull(data.getSALES_DATE_TO())) isNull = true;
				ary.addElement(data.getSECTION_CD());
				if(isNull(data.getSECTION_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SALES", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_FROM())) setString(no ++, data.getSALES_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_TO())) setString(no ++, data.getSALES_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSECTION_CD())) setString(no ++, data.getSECTION_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setl_ROWNO( getString(1, rs) );
			data.setl_APPR_ID( getString(2, rs) );
			data.setl_APPR_DATE( getString(3, rs) );
			data.setl_RESERVE_CAUSE( getString(4, rs) );
			data.setl_SALES_SEQ_NO( getString(5, rs) );
			data.setl_SHIP_ODR_NO( getString(6, rs) );
			data.setl_SLIP_CD( getString(7, rs) );
			data.setl_SALES_TYP_CD( getString(8, rs) );
			data.setl_CUST_CD( getString(9, rs) );
			data.setl_CUST_NAME( getString(10, rs) );
			data.setl_SALES_DEPT_CD( getString(11, rs) );
			data.setl_ORG_NAME( getString(12, rs) );
			data.setl_ITEM_CD( getString(13, rs) );
			data.setl_ITEM_NAME( getString(14, rs) );
			data.setl_CUST_ODR_NO( getString(15, rs) );
			data.setl_SALES_DATE( getString(16, rs) );
			data.setl_CUST_CHRG_PSN_CD( getString(17, rs) );
			data.setl_CUST_CHRG_PSN_NAME( getString(18, rs) );
			data.setl_ODR_ACPT_PSN_CD( getString(19, rs) );
			data.setl_ODR_ACPT_PSN_NAME( getString(20, rs) );
			data.setl_SALES_QTY( getString(21, rs) );
			data.setl_UNIT_COST( getString(22, rs) );
			data.setl_UNIT_CD( getString(23, rs) );
			data.setl_SALES_AMOUNT( getString(24, rs) );
			data.setl_SALES_AMOUNT_EXCH_RATES( getString(25, rs) );
			data.setl_INSPC_ACPT_DATE( getString(26, rs) );
			data.setl_INSPC_ACPT_QTY( getString(27, rs) );
			data.setl_EXTERNAL_TAX_SALES_AMOUNT( getString(28, rs) );
			data.setl_INTERNAL_TAX_SALES_AMOUNT( getString(29, rs) );
			data.setl_TAXFREE_SALES_AMOUNT( getString(30, rs) );
			data.setl_TAX_CREDIT_SALES_AMOUNT( getString(31, rs) );
			data.setl_EXTERNAL_TAX_AMOUNT( getString(32, rs) );
			data.setl_INTERNAL_TAX_AMOUNT( getString(33, rs) );
			data.setl_TAX_AMOUNT_1( getString(34, rs) );
			data.setl_TAX_AMOUNT_2( getString(35, rs) );
			data.setl_TAX_AMOUNT_3( getString(36, rs) );
			data.setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(37, rs) );
			data.setl_ORGN_SLIP_CD( getString(38, rs) );
			data.setl_CUR_CD( getString(39, rs) );
			data.setl_PCL_PRICE_CO_CD( getString(40, rs) );
			data.setl_REMARKS( getString(41, rs) );
			data.setl_INSPC_ACPT_TYP_CD( getString(42, rs) );
			data.setl_MODIFY_COUNT( getString(43, rs) );
			data.setl_AI_AR_IF_FLG( getString(44, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SALES", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SALES_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_clear

			return;
		}

		/**
		 * selectT_SALES�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SALES()
		{
			//{{user_implement_dev:selectT_SALES_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectM_CUST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUST.CUST_NAME "
+"FROM "
+"  M_CUST "
+"WHERE "
+"  M_CUST.CUST_CD = ? "
+"  AND M_CUST.COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_CUST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_CUST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CUST_read
			if(m_selcmd==null) throw new FoundationException("selectM_CUST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_CUST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CUST_read2
			if(m_selcmd==null) throw new FoundationException("selectM_CUST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_CUST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CUST_read3
			if(m_selcmd==null) throw new FoundationException("selectM_CUST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_CUST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getCOMPANY_CD());
				if(isNull(data.getCOMPANY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getCUST_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setCUST_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_CUST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_CUST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_CUST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_CUST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_CUST_clear

			return;
		}

		/**
		 * selectM_CUST�N���X�̕W���R���X�g���N�^
		 */
		public selectM_CUST()
		{
			//{{user_implement_dev:selectM_CUST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_CUST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkT_SALES_appr extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_SALES.SALES_SEQ_NO "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SHIP_ODR_NO = ? "
+"  AND T_SALES.SLIP_CD = ? "
+"  AND T_SALES.SALES_SEQ_NO < ? "
+"  AND T_SALES.APPR_FLG <> 3";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_SALES_appr_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkT_SALES_appr_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_SALES_appr_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_SALES_appr_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_SHIP_ODR_NO());
				if(isNull(data.getl_SHIP_ODR_NO())) isNull = true;
				ary.addElement(data.getl_SLIP_CD());
				if(isNull(data.getl_SLIP_CD())) isNull = true;
				ary.addElement(data.getl_SALES_SEQ_NO());
				if(isNull(data.getl_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getl_SHIP_ODR_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SLIP_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_SALES_appr_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_appr_clear

			return;
		}

		/**
		 * checkT_SALES_appr�N���X�̕W���R���X�g���N�^
		 */
		public checkT_SALES_appr()
		{
			//{{user_implement_dev:checkT_SALES_appr_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_appr_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkT_SALES_rtn extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_SALES.SALES_SEQ_NO "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SHIP_ODR_NO = ? "
+"  AND T_SALES.SLIP_CD = ? "
+"  AND T_SALES.SALES_SEQ_NO > ? "
+"  AND T_SALES.APPR_FLG = 3";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_SALES_rtn_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkT_SALES_rtn_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_SALES_rtn_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_SALES_rtn_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_SHIP_ODR_NO());
				if(isNull(data.getl_SHIP_ODR_NO())) isNull = true;
				ary.addElement(data.getl_SLIP_CD());
				if(isNull(data.getl_SLIP_CD())) isNull = true;
				ary.addElement(data.getl_SALES_SEQ_NO());
				if(isNull(data.getl_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getl_SHIP_ODR_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SLIP_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_SALES_rtn_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_rtn_clear

			return;
		}

		/**
		 * checkT_SALES_rtn�N���X�̕W���R���X�g���N�^
		 */
		public checkT_SALES_rtn()
		{
			//{{user_implement_dev:checkT_SALES_rtn_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_rtn_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateT_SALES extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  T_SALES.APPR_FLG = ?, "
+"  T_SALES.APPR_ID = ?, "
+"  T_SALES.APPR_DATE = ?, "
+"  T_SALES.RESERVE_CAUSE = ? "
+"WHERE "
+"  T_SALES.SHIP_ODR_NO = ? "
+"AND T_SALES.SLIP_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0060010";
		protected String m_sUpdateProgramName="KR0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_SALES_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateT_SALES_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;
			Vector ary=new Vector();
			String dyn_query;
			String std_sql;
			boolean isNull=false;
			int no=1;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					std_sql = objMessage.replaceSQL_U(m_updcmd);
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					std_sql = objMessage.replaceSQL_U_MSSQL(m_updcmd);
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					std_sql = objMessage.replaceSQL_U_PGSQL(m_updcmd);
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					std_sql = objMessage.replaceSQL_U_MYSQL(m_updcmd);
				} else {
					std_sql = objMessage.replaceSQL_U_DB2(m_updcmd);
				}

				ary.addElement(data.getl_SHIP_ODR_NO());
				if(isNull(data.getl_SHIP_ODR_NO())) isNull = true;
				ary.addElement(data.getl_SLIP_CD());
				if(isNull(data.getl_SLIP_CD())) isNull = true;
				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(std_sql, ary) : std_sql);
				stmt = conn.prepareStatement(dyn_query);

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				no = 4;
				//���ISQL�������W�b�N
				setString(no++, data.getAPPR_FLG(), stmt);
				setString(no++, data.getAPPR_ID(), stmt);
				setString(no++, data.getAPPR_DATE(), stmt);
				setString(no++, data.getRESERVE_CAUSE(), stmt);
				if(!isNull(data.getl_SHIP_ODR_NO())) {
					setString(no++, data.getl_SHIP_ODR_NO(), stmt);
				}
				if(!isNull(data.getl_SLIP_CD())) {
					setString(no++, data.getl_SLIP_CD(), stmt);
				}

				return stmt.executeUpdate();
			} catch(ParseException e){
				throw new FoundationException("updateT_SALES", "prepare", "Parse���s:"+e.toString());
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
				ary.removeAllElements();
				ary = null;
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:updateT_SALES_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateT_SALES_clear

			return;
		}

		/**
		 * updateT_SALES�N���X�̕W���R���X�g���N�^
		 */
		public updateT_SALES()
		{
			//{{user_implement_dev:updateT_SALES_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateT_SALES_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SALES_modify extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SALES.MODIFY_COUNT "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SALES_SEQ_NO = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SALES_modify_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SALES_modify_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_modify_read
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_modify", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_modify_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_modify_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_modify", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_modify_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_modify_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_modify", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_modify_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_SALES_SEQ_NO());
				if(isNull(data.getl_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getl_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_modify", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_modify_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_modify_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SALES_modify_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_modify_clear

			return;
		}

		/**
		 * selectT_SALES_modify�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SALES_modify()
		{
			//{{user_implement_dev:selectT_SALES_modify_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_modify_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkT_SALES_save extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_SALES.SALES_SEQ_NO "
+"FROM "
+"  T_SALES "
+"WHERE "
+"  T_SALES.SHIP_ODR_NO = ? "
+"  AND T_SALES.SLIP_CD = ? "
+"  AND T_SALES.SALES_SEQ_NO > ? "
+"  AND T_SALES.APPR_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkT_SALES_save_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkT_SALES_save_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkT_SALES_save_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkT_SALES_save_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_SHIP_ODR_NO());
				if(isNull(data.getl_SHIP_ODR_NO())) isNull = true;
				ary.addElement(data.getl_SLIP_CD());
				if(isNull(data.getl_SLIP_CD())) isNull = true;
				ary.addElement(data.getl_SALES_SEQ_NO());
				if(isNull(data.getl_SALES_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getl_SHIP_ODR_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SLIP_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_SALES_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkT_SALES_save_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_save_clear

			return;
		}

		/**
		 * checkT_SALES_save�N���X�̕W���R���X�g���N�^
		 */
		public checkT_SALES_save()
		{
			//{{user_implement_dev:checkT_SALES_save_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkT_SALES_save_constractor

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
+"  SYS_INSTALL_OPTIONS.\"OPTION_ID\" = 'JF*'";
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
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
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
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.seth_INSTALL_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
	public class selectT_SALES_Jf extends DataObject
	{
		protected String m_selcmd = "SELECT  "
+"  ROW_NUMBER() OVER( "
+"    ORDER BY "
+"  T.SHIP_DLV_H_NO, "
+"  T.SHIP_DLV_D_NO), "
+"  T.APPR_ID, "
+"  TO_CHAR(T.APPR_DATE, 'YYYY/MM/DD'), "
+"  T.RESERVE_CAUSE, "
+"  T.SALES_SEQ_NO, "
+"  T_SHIP.ORGNAL_SHIP_DLV_H_NO, "
+"  T_SHIP.ORGNAL_SHIP_DLV_D_NO, "
+"  T.SALES_TYP, "
+"  T.CUST_CD, "
+"  M_CUST.CUST_NAME, "
+"  T.SALES_DEPT_CD, "
+"  M_ORG.ORG_NAME, "
+"  T.ITEM_CD, "
+"  T.ITEM_NAME, "
+"  T.CUST_ODR_NO, "
+"  TO_CHAR(T.SALES_DATE, 'YYYY/MM/DD'), "
+"  T.CUST_CHRG_PSN_CD, "
+"  USERCUST.USER_NAME, "
+"  T.ODR_ACPT_PSN_CD, "
+"  USERODR.USER_NAME, "
+"  DECODE(T.STATUS, 10, T.SALES_QTY*(-1), T.SALES_QTY), "
+"  T.SALES_UNIT_PRICE, "
+"  T.UNIT_CD, "
+"  DECODE(T.STATUS, 10, T.SALES_AMOUNT*(-1), T.SALES_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.SALES_AMOUNT_EXCH_RATES*(-1), T.SALES_AMOUNT_EXCH_RATES), "
+"  TO_CHAR(T.INSPC_ACPT_DATE, 'YYYY/MM/DD'),                   "
+"  DECODE(T.STATUS, 10, T.INSPC_ACPT_QTY*(-1), T.INSPC_ACPT_QTY), "
+"  DECODE(T.STATUS, 10, T.EXTERNAL_TAX_SALES_AMOUNT*(-1), T.EXTERNAL_TAX_SALES_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.INTERNAL_TAX_SALES_AMOUNT*(-1), T.INTERNAL_TAX_SALES_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.TAXFREE_SALES_AMOUNT*(-1), T.TAXFREE_SALES_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.TAX_CREDIT_SALES_AMOUNT*(-1), T.TAX_CREDIT_SALES_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.EXTERNAL_TAX_AMOUNT*(-1), T.EXTERNAL_TAX_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.INTERNAL_TAX_AMOUNT*(-1), T.INTERNAL_TAX_AMOUNT), "
+"  DECODE(T.STATUS, 10, T.TAX_AMOUNT_1*(-1), T.TAX_AMOUNT_1), "
+"  DECODE(T.STATUS, 10, T.TAX_AMOUNT_2*(-1), T.TAX_AMOUNT_2), "
+"  DECODE(T.STATUS, 10, T.TAX_AMOUNT_3*(-1), T.TAX_AMOUNT_3), "
+"  DECODE(T.STATUS, 10, T.OWN_CUR_TAXCREDIT_SALES_AMOUNT*(-1), T.OWN_CUR_TAXCREDIT_SALES_AMOUNT), "
+"  T.ORG_SLIP_CD, "
+"  T.CURRNCY_CD, "
+"  T.SPCL_PRICE_CO,   "
+"  T.REMARKS, "
+"  T.INSPC_ACPT_TYP, "
+"  T.MODIFY_COUNT, "
+"  DECODE(T.STATUS, 10, T.CUST_SALES_QTY*(-1), T.CUST_SALES_QTY), "
+"  T.CUST_UNIT_CD, "
+"  DECODE(T.STATUS, 10, T.CUST_INSPC_ACPT_QTY*(-1), T.CUST_INSPC_ACPT_QTY), "
+"  T.SALES_H_NO, "
+"  T.SHIP_DLV_H_NO, "
+"  T.SHIP_DLV_D_NO, "
+"  T.AI_AR_IF_FLG, "
+"  T.TRANS_TYP, "
+"  B.APPR_HISTORY_FLG "
+"FROM "
+"  T_SALES T, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST USERCUST, "
+"  USER_MST USERODR, "
+"  T_SHIP, "
+"  T_RLSD_PUCH_ODR, "
+"  ( SELECT MAX(SALES_SEQ_NO) AS  SALES_SEQ_NO "
+"    FROM   T_SALES  "
+"    WHERE  APPR_FLG = ? "
+"     AND   (STATUS = 20 AND ((APPR_FLG <> 1 AND INSPC_APPR_FLG = 1) OR APPR_FLG = 1)) OR "
+"           (STATUS = 10 AND INSPC_APPR_FLG = 1) "
+"    GROUP BY SHIP_DLV_H_NO,SHIP_DLV_D_NO "
+"  ) A, "
+" ( SELECT SHIP_DLV_H_NO, "
+" 	      SHIP_DLV_D_NO, "
+"  		  DECODE(SUM(INSPC_APPR_FLG), 0, '0', '1') AS APPR_HISTORY_FLG "
+"    FROM   T_SALES  "
+"    GROUP BY SHIP_DLV_H_NO,SHIP_DLV_D_NO "
+"  ) B "
+"WHERE "
+"  T.CUST_CD = ? "
+"  AND T.SALES_DATE >= ? "
+"  AND T.SALES_DATE <= ? "
+"  AND T.SALES_DEPT_CD = ? "
+"  AND T.APPR_FLG = ? "
+"  AND ((T.STATUS = 20 AND ((T.APPR_FLG <> 1 AND T.INSPC_APPR_FLG = 1) OR T.APPR_FLG = 1)) OR (T.STATUS = 10 AND T.INSPC_APPR_FLG = 1)) "
+"  AND T.SALES_SEQ_NO = A.SALES_SEQ_NO "
+"  AND T.SHIP_DLV_H_NO = B.SHIP_DLV_H_NO "
+"  AND T.SHIP_DLV_D_NO = B.SHIP_DLV_D_NO   "
+"  AND M_CUST.CUST_CD(+) = T.CUST_CD "
+"  AND M_ORG.ORG_CD(+) = T.SALES_DEPT_CD "
+"  AND USERCUST.USER_CD(+) = T.CUST_CHRG_PSN_CD "
+"  AND USERODR.USER_CD(+) = T.ODR_ACPT_PSN_CD "
+"  AND T_SHIP.SHIP_DLV_H_NO(+) = T.SHIP_DLV_H_NO "
+"  AND T_SHIP.SHIP_DLV_D_NO(+) = T.SHIP_DLV_D_NO "
+"  AND T_SHIP.SHIP_CTRL_NO(+) = T.SHIP_CTRL_NO "
+"  AND T_RLSD_PUCH_ODR.ODR_H_NO(+) = T_SHIP.ODR_H_NO "
+"  AND T_RLSD_PUCH_ODR.ODR_D_SEQ_NO(+) = T_SHIP.ODR_D_SEQ_NO "
+"  AND (NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = 0 OR  "
+"  (NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = 1 AND T_SHIP.ORGNAL_SHIP_DLV_H_NO IS NOT NULL)) "
+"ORDER BY "
+"  T.SHIP_DLV_H_NO, "
+"  T.SHIP_DLV_D_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SALES_Jf_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SALES_Jf_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_Jf_read
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_Jf", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_Jf_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_Jf_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_Jf", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_Jf_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_Jf_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_Jf", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_Jf_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getSALES_DATE_FROM());
				if(isNull(data.getSALES_DATE_FROM())) isNull = true;
				ary.addElement(data.getSALES_DATE_TO());
				if(isNull(data.getSALES_DATE_TO())) isNull = true;
				ary.addElement(data.getSECTION_CD());
				if(isNull(data.getSECTION_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SALES_Jf", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_FROM())) setString(no ++, data.getSALES_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_TO())) setString(no ++, data.getSALES_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSECTION_CD())) setString(no ++, data.getSECTION_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setl_ROWNO( getString(1, rs) );
			data.setl_APPR_ID( getString(2, rs) );
			data.setl_APPR_DATE( getString(3, rs) );
			data.setl_RESERVE_CAUSE( getString(4, rs) );
			data.setl_SALES_SEQ_NO( getString(5, rs) );
			data.setl_ORGNAL_SHIP_DLV_H_NO( getString(6, rs) );
			data.setl_ORGNAL_SHIP_DLV_D_NO( getString(7, rs) );
			data.setl_SALES_TYP_CD( getString(8, rs) );
			data.setl_CUST_CD( getString(9, rs) );
			data.setl_CUST_NAME( getString(10, rs) );
			data.setl_SALES_DEPT_CD( getString(11, rs) );
			data.setl_ORG_NAME( getString(12, rs) );
			data.setl_ITEM_CD( getString(13, rs) );
			data.setl_ITEM_NAME( getString(14, rs) );
			data.setl_CUST_ODR_NO( getString(15, rs) );
			data.setl_SALES_DATE( getString(16, rs) );
			data.setl_CUST_CHRG_PSN_CD( getString(17, rs) );
			data.setl_CUST_CHRG_PSN_NAME( getString(18, rs) );
			data.setl_ODR_ACPT_PSN_CD( getString(19, rs) );
			data.setl_ODR_ACPT_PSN_NAME( getString(20, rs) );
			data.setl_SALES_QTY( getString(21, rs) );
			data.setl_UNIT_COST( getString(22, rs) );
			data.setl_UNIT_CD( getString(23, rs) );
			data.setl_SALES_AMOUNT( getString(24, rs) );
			data.setl_SALES_AMOUNT_EXCH_RATES( getString(25, rs) );
			data.setl_INSPC_ACPT_DATE( getString(26, rs) );
			data.setl_INSPC_ACPT_QTY( getString(27, rs) );
			data.setl_EXTERNAL_TAX_SALES_AMOUNT( getString(28, rs) );
			data.setl_INTERNAL_TAX_SALES_AMOUNT( getString(29, rs) );
			data.setl_TAXFREE_SALES_AMOUNT( getString(30, rs) );
			data.setl_TAX_CREDIT_SALES_AMOUNT( getString(31, rs) );
			data.setl_EXTERNAL_TAX_AMOUNT( getString(32, rs) );
			data.setl_INTERNAL_TAX_AMOUNT( getString(33, rs) );
			data.setl_TAX_AMOUNT_1( getString(34, rs) );
			data.setl_TAX_AMOUNT_2( getString(35, rs) );
			data.setl_TAX_AMOUNT_3( getString(36, rs) );
			data.setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(37, rs) );
			data.setl_ORGN_SLIP_CD( getString(38, rs) );
			data.setl_CUR_CD( getString(39, rs) );
			data.setl_PCL_PRICE_CO_CD( getString(40, rs) );
			data.setl_REMARKS( getString(41, rs) );
			data.setl_INSPC_ACPT_TYP_CD( getString(42, rs) );
			data.setl_MODIFY_COUNT( getString(43, rs) );
			data.setl_CUST_SALES_QTY( getString(44, rs) );
			data.setl_CUST_UNIT_CD( getString(45, rs) );
			data.setl_CUST_INSPC_ACPT_QTY( getString(46, rs) );
			data.setl_SALES_H_NO( getString(47, rs) );
			data.setl_SHIP_DLV_H_NO( getString(48, rs) );
			data.setl_SHIP_DLV_D_NO( getString(49, rs) );
			data.setl_AI_AR_IF_FLG( getString(50, rs) );
			data.setl_TRANS_TYP( getString(51, rs) );
			data.setl_APPR_HISTORY_FLG( getString(52, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_Jf", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_Jf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_Jf_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SALES_Jf_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_Jf_clear

			return;
		}

		/**
		 * selectT_SALES_Jf�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SALES_Jf()
		{
			//{{user_implement_dev:selectT_SALES_Jf_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_Jf_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class checkAiR_INSTALL_FLG extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  OPTION_ID "
+"FROM "
+"  SYS_INSTALL_OPTIONS "
+"WHERE "
+"  SYS_INSTALL_OPTIONS.OPTION_ID = 'AiR' "
+"  AND SYS_INSTALL_OPTIONS.INSTALL_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAiR_INSTALL_FLG_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:checkAiR_INSTALL_FLG_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAiR_INSTALL_FLG_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkAiR_INSTALL_FLG_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkAiR_INSTALL_FLG_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:checkAiR_INSTALL_FLG_clear

			return;
		}

		/**
		 * checkAiR_INSTALL_FLG�N���X�̕W���R���X�g���N�^
		 */
		public checkAiR_INSTALL_FLG()
		{
			//{{user_implement_dev:checkAiR_INSTALL_FLG_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:checkAiR_INSTALL_FLG_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateAPPR_FLG extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  T_SALES.APPR_FLG = ? "
+"WHERE "
+"  T_SALES.SHIP_DLV_H_NO = ? "
+"  AND T_SALES.SHIP_DLV_D_NO = ? "
+"  AND T_SALES.SALES_SEQ_NO <> ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0060010";
		protected String m_sUpdateProgramName="KR0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateAPPR_FLG_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateAPPR_FLG_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getAPPR_FLG(), stmt);
				setString(5, data.getl_SHIP_DLV_H_NO(), stmt);
				setString(6, data.getl_SHIP_DLV_D_NO(), stmt);
				setString(7, data.getl_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:updateAPPR_FLG_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_FLG_clear

			return;
		}

		/**
		 * updateAPPR_FLG�N���X�̕W���R���X�g���N�^
		 */
		public updateAPPR_FLG()
		{
			//{{user_implement_dev:updateAPPR_FLG_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_FLG_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateAPPR_MAX extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  T_SALES.APPR_FLG = 3, "
+"  T_SALES.APPR_ID = ?, "
+"  T_SALES.APPR_DATE = ?, "
+"  T_SALES.INSPC_APPR_FLG = 1 "
+"WHERE "
+"  T_SALES.SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0060010";
		protected String m_sUpdateProgramName="KR0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateAPPR_MAX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateAPPR_MAX_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getAPPR_ID(), stmt);
				setString(5, data.getAPPR_DATE(), stmt);
				setString(6, data.getl_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:updateAPPR_MAX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_MAX_clear

			return;
		}

		/**
		 * updateAPPR_MAX�N���X�̕W���R���X�g���N�^
		 */
		public updateAPPR_MAX()
		{
			//{{user_implement_dev:updateAPPR_MAX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_MAX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateAPPR_SAVE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  T_SALES.APPR_FLG = 2, "
+"  T_SALES.APPR_ID = ?, "
+"  T_SALES.APPR_DATE = ?, "
+"  T_SALES.RESERVE_CAUSE = ?, "
+"  T_SALES.INSPC_APPR_FLG = 1 "
+"WHERE "
+"  T_SALES.SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0060010";
		protected String m_sUpdateProgramName="KR0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateAPPR_SAVE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateAPPR_SAVE_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getAPPR_ID(), stmt);
				setString(5, data.getAPPR_DATE(), stmt);
				setString(6, data.getRESERVE_CAUSE(), stmt);
				setString(7, data.getl_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:updateAPPR_SAVE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_SAVE_clear

			return;
		}

		/**
		 * updateAPPR_SAVE�N���X�̕W���R���X�g���N�^
		 */
		public updateAPPR_SAVE()
		{
			//{{user_implement_dev:updateAPPR_SAVE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_SAVE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateAPPR_CANCEL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  T_SALES.APPR_FLG = 1, "
+"  T_SALES.APPR_ID = ?, "
+"  T_SALES.APPR_DATE = ?, "
+"  T_SALES.RESERVE_CAUSE = ? "
+"WHERE "
+"  T_SALES.SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KR0060010";
		protected String m_sUpdateProgramName="KR0060010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateAPPR_CANCEL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateAPPR_CANCEL_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getAPPR_ID(), stmt);
				setString(5, data.getAPPR_DATE(), stmt);
				setString(6, data.getRESERVE_CAUSE(), stmt);
				setString(7, data.getl_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:updateAPPR_CANCEL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_CANCEL_clear

			return;
		}

		/**
		 * updateAPPR_CANCEL�N���X�̕W���R���X�g���N�^
		 */
		public updateAPPR_CANCEL()
		{
			//{{user_implement_dev:updateAPPR_CANCEL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateAPPR_CANCEL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SALESCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_SALES T, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST USERCUST, "
+"  USER_MST USERODR, "
+"  ( "
+"    SELECT "
+"      MAX(SALES_SEQ_NO) AS SALES_SEQ_NO "
+"    FROM "
+"      T_SALES "
+"    GROUP BY "
+"      SLIP_CD, "
+"      SHIP_ODR_NO "
+"  ) A "
+"WHERE "
+"  T.CUST_CD = ? "
+"  AND T.SALES_DATE >= ? "
+"  AND T.SALES_DATE <= ? "
+"  AND T.SALES_DEPT_CD = ? "
+"  AND T.APPR_FLG = ? "
+"  AND T.STATUS = 20 "
+"  AND T.SALES_SEQ_NO = A.SALES_SEQ_NO "
+"  AND M_CUST.CUST_CD(+) = T.CUST_CD "
+"  AND M_ORG.ORG_CD(+) = T.SALES_DEPT_CD "
+"  AND USERCUST.USER_CD(+) = T.CUST_CHRG_PSN_CD "
+"  AND USERODR.USER_CD(+) = T.ODR_ACPT_PSN_CD "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SALESCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SALESCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALESCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_SALESCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALESCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALESCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SALESCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALESCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALESCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SALESCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALESCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getSALES_DATE_FROM());
				if(isNull(data.getSALES_DATE_FROM())) isNull = true;
				ary.addElement(data.getSALES_DATE_TO());
				if(isNull(data.getSALES_DATE_TO())) isNull = true;
				ary.addElement(data.getSECTION_CD());
				if(isNull(data.getSECTION_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SALESCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_FROM())) setString(no ++, data.getSALES_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_TO())) setString(no ++, data.getSALES_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSECTION_CD())) setString(no ++, data.getSECTION_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SALESCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALESCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALESCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SALESCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SALESCnt_clear

			return;
		}

		/**
		 * selectT_SALESCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SALESCnt()
		{
			//{{user_implement_dev:selectT_SALESCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SALESCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SALES_JfCnt extends DataObject
	{
		protected String m_selcmd = "SELECT  "
+"  COUNT(1) "
+"FROM "
+"  T_SALES T, "
+"  M_CUST, "
+"  M_ORG, "
+"  USER_MST USERCUST, "
+"  USER_MST USERODR, "
+"  T_SHIP, "
+"  T_RLSD_PUCH_ODR, "
+"  ( SELECT MAX(SALES_SEQ_NO) AS  SALES_SEQ_NO "
+"    FROM   T_SALES  "
+"    WHERE  APPR_FLG = ? "
+"     AND   (STATUS = 20 AND ((APPR_FLG <> 1 AND INSPC_APPR_FLG = 1) OR APPR_FLG = 1)) OR "
+"           (STATUS = 10 AND INSPC_APPR_FLG = 1) "
+"    GROUP BY SHIP_DLV_H_NO,SHIP_DLV_D_NO "
+"  ) A, "
+" ( SELECT SHIP_DLV_H_NO, "
+" 	      SHIP_DLV_D_NO, "
+"  		  DECODE(SUM(INSPC_APPR_FLG), 0, '0', '1') AS APPR_HISTORY_FLG "
+"    FROM   T_SALES  "
+"    GROUP BY SHIP_DLV_H_NO,SHIP_DLV_D_NO "
+"  ) B "
+"WHERE "
+"  T.CUST_CD = ? "
+"  AND T.SALES_DATE >= ? "
+"  AND T.SALES_DATE <= ? "
+"  AND T.SALES_DEPT_CD = ? "
+"  AND T.APPR_FLG = ? "
+"  AND ((T.STATUS = 20 AND ((T.APPR_FLG <> 1 AND T.INSPC_APPR_FLG = 1) OR T.APPR_FLG = 1)) OR (T.STATUS = 10 AND T.INSPC_APPR_FLG = 1)) "
+"  AND T.SALES_SEQ_NO = A.SALES_SEQ_NO "
+"  AND T.SHIP_DLV_H_NO = B.SHIP_DLV_H_NO "
+"  AND T.SHIP_DLV_D_NO = B.SHIP_DLV_D_NO   "
+"  AND M_CUST.CUST_CD(+) = T.CUST_CD "
+"  AND M_ORG.ORG_CD(+) = T.SALES_DEPT_CD "
+"  AND USERCUST.USER_CD(+) = T.CUST_CHRG_PSN_CD "
+"  AND USERODR.USER_CD(+) = T.ODR_ACPT_PSN_CD "
+"  AND T_SHIP.SHIP_DLV_H_NO(+) = T.SHIP_DLV_H_NO "
+"  AND T_SHIP.SHIP_DLV_D_NO(+) = T.SHIP_DLV_D_NO "
+"  AND T_SHIP.SHIP_CTRL_NO(+) = T.SHIP_CTRL_NO "
+"  AND T_RLSD_PUCH_ODR.ODR_H_NO(+) = T_SHIP.ODR_H_NO "
+"  AND T_RLSD_PUCH_ODR.ODR_D_SEQ_NO(+) = T_SHIP.ODR_D_SEQ_NO "
+"  AND (NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = 0 OR  "
+"  (NVL(T_RLSD_PUCH_ODR.DIRECT_FLG,0) = 1 AND T_SHIP.ORGNAL_SHIP_DLV_H_NO IS NOT NULL)) "
+"  AND ROWNUM <=TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SALES_JfCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SALES_JfCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KR0060010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KR0060010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_JfCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_JfCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_JfCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_JfCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_JfCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_JfCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KR0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_JfCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_JfCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SALES_JfCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KR0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getCUST_CD());
				if(isNull(data.getCUST_CD())) isNull = true;
				ary.addElement(data.getSALES_DATE_FROM());
				if(isNull(data.getSALES_DATE_FROM())) isNull = true;
				ary.addElement(data.getSALES_DATE_TO());
				if(isNull(data.getSALES_DATE_TO())) isNull = true;
				ary.addElement(data.getSECTION_CD());
				if(isNull(data.getSECTION_CD())) isNull = true;
				ary.addElement(data.getRAPPR());
				if(isNull(data.getRAPPR())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SALES_JfCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCUST_CD())) setString(no ++, data.getCUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_FROM())) setString(no ++, data.getSALES_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSALES_DATE_TO())) setString(no ++, data.getSALES_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getSECTION_CD())) setString(no ++, data.getSECTION_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getRAPPR())) setString(no ++, data.getRAPPR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KR0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KR0060010Struct data = new KR0060010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SALES_JfCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KR0060010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KR0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SALES_JfCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SALES_JfCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KR0060010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SALES_JfCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_JfCnt_clear

			return;
		}

		/**
		 * selectT_SALES_JfCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SALES_JfCnt()
		{
			//{{user_implement_dev:selectT_SALES_JfCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SALES_JfCnt_constractor

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
		mSYS_INSTALL_OPTIONS.clear();
		mSYS_INSTALL_OPTIONS = null;
		mselectUSER_MST.clear();
		mselectUSER_MST = null;
		mselectSYS_MY_COMPANY.clear();
		mselectSYS_MY_COMPANY = null;
		mselectSYS_CLASS_CODE.clear();
		mselectSYS_CLASS_CODE = null;
		mselectT_SALES.clear();
		mselectT_SALES = null;
		mselectM_CUST.clear();
		mselectM_CUST = null;
		mcheckT_SALES_appr.clear();
		mcheckT_SALES_appr = null;
		mcheckT_SALES_rtn.clear();
		mcheckT_SALES_rtn = null;
		mupdateT_SALES.clear();
		mupdateT_SALES = null;
		mselectT_SALES_modify.clear();
		mselectT_SALES_modify = null;
		mcheckT_SALES_save.clear();
		mcheckT_SALES_save = null;
		mgetSYS_INSTALL_OPTIONS.clear();
		mgetSYS_INSTALL_OPTIONS = null;
		mselectT_SALES_Jf.clear();
		mselectT_SALES_Jf = null;
		mcheckAiR_INSTALL_FLG.clear();
		mcheckAiR_INSTALL_FLG = null;
		mupdateAPPR_FLG.clear();
		mupdateAPPR_FLG = null;
		mupdateAPPR_MAX.clear();
		mupdateAPPR_MAX = null;
		mupdateAPPR_SAVE.clear();
		mupdateAPPR_SAVE = null;
		mupdateAPPR_CANCEL.clear();
		mupdateAPPR_CANCEL = null;
		mselectT_SALESCnt.clear();
		mselectT_SALESCnt = null;
		mselectT_SALES_JfCnt.clear();
		mselectT_SALES_JfCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * KR0060010�N���X�̕W���R���X�g���N�^
	 */
	public KR0060010Entity() throws FoundationException
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
