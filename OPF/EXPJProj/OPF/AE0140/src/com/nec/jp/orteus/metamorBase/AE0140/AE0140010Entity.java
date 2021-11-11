/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0140/src/com/nec/jp/orteus/metamorBase/AE0140/AE0140010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0140;

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
 * CLASS     : AE0140010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0140010Entity extends DataObject
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

	// M_PLANT�N���X �C���X�^���X
	public M_PLANT mM_PLANT = new M_PLANT();

	// M_VEND_CTRL�N���X �C���X�^���X
	public M_VEND_CTRL mM_VEND_CTRL = new M_VEND_CTRL();

	// M_ITEM�N���X �C���X�^���X
	public M_ITEM mM_ITEM = new M_ITEM();

	// M_WH�N���X �C���X�^���X
	public M_WH mM_WH = new M_WH();

	// SelectAllInspc�N���X �C���X�^���X
	public SelectAllInspc mSelectAllInspc = new SelectAllInspc();

	// SelectNonInspc�N���X �C���X�^���X
	public SelectNonInspc mSelectNonInspc = new SelectNonInspc();

	// SelectDurInspc�N���X �C���X�^���X
	public SelectDurInspc mSelectDurInspc = new SelectDurInspc();

	// SelectCmpInspc�N���X �C���X�^���X
	public SelectCmpInspc mSelectCmpInspc = new SelectCmpInspc();

	// SelectDurInspcCnt�N���X �C���X�^���X
	public SelectDurInspcCnt mSelectDurInspcCnt = new SelectDurInspcCnt();

	// SelectCmpInspcCnt�N���X �C���X�^���X
	public SelectCmpInspcCnt mSelectCmpInspcCnt = new SelectCmpInspcCnt();


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
		String m_write_fname="AE0140010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AE0140010";

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
	public class M_PLANT extends DataObject
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
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		protected String m_selcmd = "select "
+"  M_VEND_CTRL.\"VEND_ANAME\" as \"VEND_NAME\" "
+"from "
+"  M_VEND_CTRL, "
+"  SYS_MY_COMPANY "
+"where "
+"  M_VEND_CTRL.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  and SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM' "
+"  and M_VEND_CTRL.\"VEND_CD\" = ?";
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
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setVEND_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
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
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
	public class M_WH extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_WH.\"WH_NAME\" AS \"WH_NAME\", "
+"  M_WH.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_WH "
+"WHERE "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_WH_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:M_WH_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read2
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:M_WH_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read3
			if(m_selcmd==null) throw new FoundationException("M_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:M_WH_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setWH_NAME( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_WH", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:M_WH_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:M_WH_clear

			return;
		}

		/**
		 * M_WH�N���X�̕W���R���X�g���N�^
		 */
		public M_WH()
		{
			//{{user_implement_dev:M_WH_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:M_WH_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectAllInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"UNION "
+"SELECT "
+"    AR.PLANT_CD                        AS PLANT_CD "
+"   ,AR.PUCH_ODR_CD                     AS PUCH_ODR_CD "
+"   ,AR.ACPT_NO                         AS ACPT_NO "
+"   ,PO.VEND_CD                         AS VEND_CD "
+"   ,PO.VEND_ANAME                      AS VEND_ANAME "
+"   ,PO.ITEM_CD                         AS ITEM_CD "
+"   ,PO.ITEM_NAME                       AS ITEM_NAME "
+"   ,OD.JOB_ODR_CD                      AS JOB_ODR_CD "
+"   ,AR.ACPT_QTY                        AS ACPT_QTY "
+"   ,0                                  AS INSPECTED_QTY "
+"   ,0                                  AS ACCEPTED_QTY "
+"   ,0                                  AS REJECTED_GOODS_QTY "
+"   ,TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE "
+"   ,NULL                               AS INSPEC_DATE "
+"   ,AR.ACPT_STS_TYP                    AS ACPT_STS_TYP "
+"   ,NULL                               AS WH_CD "
+"   ,NULL                               AS WH_NAME "
+"   ,NULL                               AS LOT_NO "
+"   ,NULL                               AS VEND_LOT_NO "
+"   ,0                                  AS INSPC_CRCT_NO "
+"   ,NULL                               AS INSPEC_RSLT_COMMENT "
+"FROM "
+"    T_ACPT_RSLT     AR "
+"   ,(SELECT "
+"         RPO.PUCH_ODR_CD AS PUCH_ODR_CD "
+"        ,RPO.ITEM_CD     AS ITEM_CD "
+"        ,RPO.VEND_CD     AS VEND_CD "
+"        ,RPO.OD_NO       AS OD_NO "
+"        ,MI.ITEM_NAME    AS ITEM_NAME "
+"        ,MVC.VEND_ANAME  AS VEND_ANAME "
+"     FROM "
+"         T_RLSD_PUCH_ODR RPO "
+"        ,M_VEND_CTRL     MVC "
+"        ,M_ITEM          MI "
+"     WHERE "
+"         RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"     AND RPO.ACPT_INSPC_TYP          = 2 "
+"     AND RPO.COMPANY_CD              = MVC.COMPANY_CD(+) "
+"     AND RPO.VEND_CD                 = MVC.VEND_CD(+) "
+"     AND RPO.ITEM_CD                 = MI.ITEM_CD(+) "
+"    ) PO "
+"   ,T_OD            OD "
+"WHERE "
+"    AR.PLANT_CD                   = ? "
+"AND AR.ACPT_DATE                 >= TO_DATE(?,'YYYY/MM/DD') "
+"AND AR.ACPT_DATE                 <= TO_DATE(?,'YYYY/MM/DD') "
+"AND AR.PUCH_ODR_CD                = PO.PUCH_ODR_CD "
+"AND PO.OD_NO                      = OD.OD_NO "
+"AND OD.JOB_ODR_CD              LIKE ? "
+"AND PO.VEND_CD                    = ? "
+"AND PO.ITEM_CD                    = ? "
+"AND AR.ACPT_STS_TYP               = 1 "
+"AND NOT EXISTS(SELECT "
+"                   1 "
+"               FROM "
+"                   T_INSPC_RSLT TIR "
+"               WHERE "
+"                   AR.PUCH_ODR_CD = TIR.PUCH_ODR_CD "
+"               AND AR.ACPT_NO     = TIR.ACPT_NO "
+"              ) "
+"AND ROWNUM <= TO_NUMBER(?) + 1 "
+"ORDER BY "
+"    PLANT_CD    ASC "
+"   ,PUCH_ODR_CD ASC "
+"   ,ACPT_NO     ASC "
+"   ,VEND_CD     ASC "
+"   ,ITEM_CD     ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectAllInspc_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectAllInspc_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectAllInspc_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectAllInspc_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectAllInspc_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectAllInspc", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectAllInspc", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectAllInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectAllInspc_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectAllInspc_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectAllInspc_clear

			return;
		}

		/**
		 * SelectAllInspc�N���X�̕W���R���X�g���N�^
		 */
		public SelectAllInspc()
		{
			//{{user_implement_dev:SelectAllInspc_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectAllInspc_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectNonInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE, 'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE, 'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY = 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"UNION "
+"SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  0 AS INSPECTED_QTY, "
+"  0 AS ACCEPTED_QTY, "
+"  0 AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE, 'YYYY/MM/DD') AS ACPT_DATE, "
+"  NULL AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  NULL AS WH_CD, "
+"  NULL AS WH_NAME, "
+"  NULL AS LOT_NO, "
+"  NULL AS VEND_LOT_NO, "
+"  0 AS INSPC_CRCT_NO, "
+"  NULL AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND NOT EXISTS( "
+"    SELECT "
+"      1 "
+"    FROM "
+"      T_INSPC_RSLT TIR "
+"    WHERE "
+"      AR.PUCH_ODR_CD = TIR.PUCH_ODR_CD "
+"      AND AR.ACPT_NO = TIR.ACPT_NO "
+"  ) "
+"  AND ROWNUM <= TO_NUMBER(?) + 1 "
+"ORDER BY "
+"    PLANT_CD    ASC "
+"   ,PUCH_ODR_CD ASC "
+"   ,ACPT_NO     ASC "
+"   ,VEND_CD     ASC "
+"   ,ITEM_CD     ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNonInspc_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectNonInspc_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNonInspc_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNonInspc_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNonInspc_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectNonInspc", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNonInspc", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNonInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNonInspc_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNonInspc_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectNonInspc_clear

			return;
		}

		/**
		 * SelectNonInspc�N���X�̕W���R���X�g���N�^
		 */
		public SelectNonInspc()
		{
			//{{user_implement_dev:SelectNonInspc_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectNonInspc_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectDurInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY > 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"ORDER BY "
+"  AR.PLANT_CD ASC, "
+"  AR.PUCH_ODR_CD ASC, "
+"  AR.ACPT_NO ASC, "
+"  PO.VEND_CD ASC, "
+"  PO.ITEM_CD ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDurInspc_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectDurInspc_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspc_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDurInspc_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDurInspc_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectDurInspc", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDurInspc", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspc_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDurInspc_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectDurInspc_clear

			return;
		}

		/**
		 * SelectDurInspc�N���X�̕W���R���X�g���N�^
		 */
		public SelectDurInspc()
		{
			//{{user_implement_dev:SelectDurInspc_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectDurInspc_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectCmpInspc extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  AR.PLANT_CD AS PLANT_CD, "
+"  AR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"  AR.ACPT_NO AS ACPT_NO, "
+"  PO.VEND_CD AS VEND_CD, "
+"  PO.VEND_ANAME AS VEND_ANAME, "
+"  PO.ITEM_CD AS ITEM_CD, "
+"  PO.ITEM_NAME AS ITEM_NAME, "
+"  OD.JOB_ODR_CD AS JOB_ODR_CD, "
+"  AR.ACPT_QTY AS ACPT_QTY, "
+"  IR.INSPECTED_QTY AS INSPECTED_QTY, "
+"  IR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"  IR.INSPECTED_QTY - IR.ACCEPTED_QTY AS REJECTED_GOODS_QTY, "
+"  TO_CHAR(AR.ACPT_DATE,'YYYY/MM/DD') AS ACPT_DATE, "
+"  TO_CHAR(IR.INSPEC_DATE,'YYYY/MM/DD') AS INSPEC_DATE, "
+"  AR.ACPT_STS_TYP AS ACPT_STS_TYP, "
+"  IR.WH_CD AS WH_CD, "
+"  IR.WH_NAME AS WH_NAME, "
+"  IR.LOT_NO AS LOT_NO, "
+"  IR.VEND_LOT_NO AS VEND_LOT_NO, "
+"  IR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"  IR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 2 "
+"ORDER BY "
+"  AR.PLANT_CD ASC, "
+"  AR.PUCH_ODR_CD ASC, "
+"  AR.ACPT_NO ASC, "
+"  PO.VEND_CD ASC, "
+"  PO.ITEM_CD ASC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCmpInspc_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectCmpInspc_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspc_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read2
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCmpInspc_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_read3
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCmpInspc_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCmpInspc", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_PLANT_CD( getString(1, rs) );
			data.setl_PUCH_ODR_CD( getString(2, rs) );
			data.setl_ACPT_NO( getString(3, rs) );
			data.setl_VEND_CD( getString(4, rs) );
			data.setl_VEND_ANAME( getString(5, rs) );
			data.setl_ITEM_CD( getString(6, rs) );
			data.setl_ITEM_NAME( getString(7, rs) );
			data.setl_JOB_ODR_CD( getString(8, rs) );
			data.setl_ACPT_QTY( getString(9, rs) );
			data.setl_INSPECTED_QTY( getString(10, rs) );
			data.setl_ACCEPTED_QTY( getString(11, rs) );
			data.setl_REJECTED_GOODS_QTY( getString(12, rs) );
			data.setl_ACPT_DATE( getString(13, rs) );
			data.setl_INSPEC_DATE( getString(14, rs) );
			data.setl_ACPT_STS_TYP_DN( getString(15, rs) );
			data.setl_WH_CD( getString(16, rs) );
			data.setl_WH_NAME( getString(17, rs) );
			data.setl_LOT_NO( getString(18, rs) );
			data.setl_VEND_LOT_NO( getString(19, rs) );
			data.setl_INSPC_CRCT_NO( getString(20, rs) );
			data.setl_INSPEC_RSLT_COMMENT( getString(21, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspc", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspc_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspc_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCmpInspc_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectCmpInspc_clear

			return;
		}

		/**
		 * SelectCmpInspc�N���X�̕W���R���X�g���N�^
		 */
		public SelectCmpInspc()
		{
			//{{user_implement_dev:SelectCmpInspc_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectCmpInspc_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectDurInspcCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"      AND TIR.INSPECTED_QTY > 0 "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 1 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDurInspcCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectDurInspcCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspcCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDurInspcCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDurInspcCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectDurInspcCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDurInspcCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDurInspcCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDurInspcCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDurInspcCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectDurInspcCnt_clear

			return;
		}

		/**
		 * SelectDurInspcCnt�N���X�̕W���R���X�g���N�^
		 */
		public SelectDurInspcCnt()
		{
			//{{user_implement_dev:SelectDurInspcCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectDurInspcCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectCmpInspcCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_ACPT_RSLT AR, "
+"  ( "
+"    SELECT "
+"      TIR.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      TIR.ACPT_NO AS ACPT_NO, "
+"      TIR.INSPEC_DATE AS INSPEC_DATE, "
+"      TIR.WH_CD AS WH_CD, "
+"      TIR.LOT_NO AS LOT_NO, "
+"      TIR.VEND_LOT_NO AS VEND_LOT_NO, "
+"      TIR.INSPECTED_QTY AS INSPECTED_QTY, "
+"      TIR.ACCEPTED_QTY AS ACCEPTED_QTY, "
+"      TIR.INSPEC_RSLT_COMMENT AS INSPEC_RSLT_COMMENT, "
+"      TIR.INSPC_CRCT_NO AS INSPC_CRCT_NO, "
+"      WH.WH_NAME AS WH_NAME "
+"    FROM "
+"      T_INSPC_RSLT TIR, "
+"      M_WH WH "
+"    WHERE "
+"      TIR.PLANT_CD = WH.PLANT_CD "
+"      AND TIR.WH_CD = WH.WH_CD "
+"      AND TIR.INSPEC_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.INSPEC_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"      AND TIR.WH_CD = ? "
+"  ) IR, "
+"  ( "
+"    SELECT "
+"      RPO.PUCH_ODR_CD AS PUCH_ODR_CD, "
+"      RPO.ITEM_CD AS ITEM_CD, "
+"      RPO.VEND_CD AS VEND_CD, "
+"      RPO.OD_NO AS OD_NO, "
+"      MI.ITEM_NAME AS ITEM_NAME, "
+"      MVC.VEND_ANAME AS VEND_ANAME "
+"    FROM "
+"      T_RLSD_PUCH_ODR RPO, "
+"      M_VEND_CTRL MVC, "
+"      M_ITEM MI "
+"    WHERE "
+"      RPO.ODR_CANCEL_SLIP_ISS_FLG = 0 "
+"      AND RPO.ACPT_INSPC_TYP = 2 "
+"      AND RPO.COMPANY_CD = MVC.COMPANY_CD(+) "
+"      AND RPO.VEND_CD = MVC.VEND_CD(+) "
+"      AND RPO.ITEM_CD = MI.ITEM_CD(+) "
+"  ) PO, "
+"  T_OD OD "
+"WHERE "
+"  AR.PLANT_CD = ? "
+"  AND AR.ACPT_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.ACPT_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND AR.PUCH_ODR_CD = PO.PUCH_ODR_CD "
+"  AND PO.OD_NO = OD.OD_NO "
+"  AND OD.JOB_ODR_CD LIKE ? "
+"  AND PO.VEND_CD = ? "
+"  AND PO.ITEM_CD = ? "
+"  AND AR.PUCH_ODR_CD = IR.PUCH_ODR_CD "
+"  AND AR.ACPT_NO = IR.ACPT_NO "
+"  AND AR.ACPT_STS_TYP = 2 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCmpInspcCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectCmpInspcCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0140010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0140010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspcCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCmpInspcCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0140010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCmpInspcCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0140010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINSPEC_DATE_FROM());
				if(isNull(data.getINSPEC_DATE_FROM())) isNull = true;
				ary.addElement(data.getINSPEC_DATE_TO());
				if(isNull(data.getINSPEC_DATE_TO())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getACPT_DATE_FROM());
				if(isNull(data.getACPT_DATE_FROM())) isNull = true;
				ary.addElement(data.getACPT_DATE_TO());
				if(isNull(data.getACPT_DATE_TO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getVEND_CD());
				if(isNull(data.getVEND_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCmpInspcCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_FROM())) setString(no ++, data.getINSPEC_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINSPEC_DATE_TO())) setString(no ++, data.getINSPEC_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_FROM())) setString(no ++, data.getACPT_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getACPT_DATE_TO())) setString(no ++, data.getACPT_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getVEND_CD())) setString(no ++, data.getVEND_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0140010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0140010Struct data = new AE0140010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCmpInspcCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0140010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0140010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCmpInspcCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCmpInspcCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0140010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCmpInspcCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectCmpInspcCnt_clear

			return;
		}

		/**
		 * SelectCmpInspcCnt�N���X�̕W���R���X�g���N�^
		 */
		public SelectCmpInspcCnt()
		{
			//{{user_implement_dev:SelectCmpInspcCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectCmpInspcCnt_constractor

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
		mM_PLANT.clear();
		mM_PLANT = null;
		mM_VEND_CTRL.clear();
		mM_VEND_CTRL = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		mM_WH.clear();
		mM_WH = null;
		mSelectAllInspc.clear();
		mSelectAllInspc = null;
		mSelectNonInspc.clear();
		mSelectNonInspc = null;
		mSelectDurInspc.clear();
		mSelectDurInspc = null;
		mSelectCmpInspc.clear();
		mSelectCmpInspc = null;
		mSelectDurInspcCnt.clear();
		mSelectDurInspcCnt = null;
		mSelectCmpInspcCnt.clear();
		mSelectCmpInspcCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AE0140010�N���X�̕W���R���X�g���N�^
	 */
	public AE0140010Entity() throws FoundationException
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