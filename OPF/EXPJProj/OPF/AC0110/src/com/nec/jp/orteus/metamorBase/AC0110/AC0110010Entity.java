/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0110/src/com/nec/jp/orteus/metamorBase/AC0110/AC0110010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0110;

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
//}}user_implement_code_header

public class AC0110010Entity extends DataObject
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

	// readM_ITEM�N���X �C���X�^���X
	public readM_ITEM mreadM_ITEM = new readM_ITEM();

	// readT_JOB_ODR�N���X �C���X�^���X
	public readT_JOB_ODR mreadT_JOB_ODR = new readT_JOB_ODR();

	// readT_JOB_ODR_PLANT�N���X �C���X�^���X
	public readT_JOB_ODR_PLANT mreadT_JOB_ODR_PLANT = new readT_JOB_ODR_PLANT();

	// readT_JOB_ODR_ALC�N���X �C���X�^���X
	public readT_JOB_ODR_ALC mreadT_JOB_ODR_ALC = new readT_JOB_ODR_ALC();

	// ViewR�N���X �C���X�^���X
	public ViewR mViewR = new ViewR();

	// ViewE�N���X �C���X�^���X
	public ViewE mViewE = new ViewE();

	// ViewR_ALC�N���X �C���X�^���X
	public ViewR_ALC mViewR_ALC = new ViewR_ALC();

	// ViewE_ALC�N���X �C���X�^���X
	public ViewE_ALC mViewE_ALC = new ViewE_ALC();

	// SELECT_TIME_CTRL�N���X �C���X�^���X
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();

	// ViewRCnt�N���X �C���X�^���X
	public ViewRCnt mViewRCnt = new ViewRCnt();

	// ViewR_ALCCnt�N���X �C���X�^���X
	public ViewR_ALCCnt mViewR_ALCCnt = new ViewR_ALCCnt();

	// ViewECnt�N���X �C���X�^���X
	public ViewECnt mViewECnt = new ViewECnt();

	// ViewE_ALCCnt�N���X �C���X�^���X
	public ViewE_ALCCnt mViewE_ALCCnt = new ViewE_ALCCnt();


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
		String m_write_fname="AC0110010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AC0110010";

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
	public class readM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\" "
+"from "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readM_ITEM_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readM_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_ITEM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readM_ITEM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readM_ITEM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readM_ITEM", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readM_ITEM_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readM_ITEM", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readM_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readM_ITEM_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readM_ITEM_clear

			return;
		}

		/**
		 * readM_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public readM_ITEM()
		{
			//{{user_implement_dev:readM_ITEM_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_JOB_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.JOB_ODR_CD = ? "
+"  and T_JOB_ODR.JOB_ODR_CANCEL_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_JOB_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("readT_JOB_ODR", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setreadJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_clear

			return;
		}

		/**
		 * readT_JOB_ODR�N���X�̕W���R���X�g���N�^
		 */
		public readT_JOB_ODR()
		{
			//{{user_implement_dev:readT_JOB_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_JOB_ODR_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.JOB_ODR_CD = ? "
+"  and T_JOB_ODR.PLANT_CD <> ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_PLANT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_JOB_ODR_PLANT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsetPLANT_CD());
				if(isNull(data.getsetPLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getsetPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setreadJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_PLANT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_PLANT", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_PLANT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_clear

			return;
		}

		/**
		 * readT_JOB_ODR_PLANT�N���X�̕W���R���X�g���N�^
		 */
		public readT_JOB_ODR_PLANT()
		{
			//{{user_implement_dev:readT_JOB_ODR_PLANT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_PLANT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_JOB_ODR_ALC extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR.JOB_ODR_CD "
+"from "
+"  T_JOB_ODR "
+"where "
+"  T_JOB_ODR.ALC_GRP_CD = ? "
+"  and T_JOB_ODR.JOB_ODR_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_JOB_ODR_ALC_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_JOB_ODR_ALC_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_JOB_ODR_ALC_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getALC_GRP_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setJOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_JOB_ODR_ALC", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("readT_JOB_ODR_ALC", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:readT_JOB_ODR_ALC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_JOB_ODR_ALC_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_ALC_clear

			return;
		}

		/**
		 * readT_JOB_ODR_ALC�N���X�̕W���R���X�g���N�^
		 */
		public readT_JOB_ODR_ALC()
		{
			//{{user_implement_dev:readT_JOB_ODR_ALC_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_JOB_ODR_ALC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and (T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and ((T_OD.DM_STS_TYP <> 9 and  "
+"       T_OD.DM_QTY > "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or   (T_OD.DM_STS_TYP = 9 and  "
+"       T_OD.TOTAL_ISSUE_QTY > "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE =  to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and (T_OD.DM_STS_TYP = ? or T_OD.DM_STS_TYP = ? or T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read2
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_read3
			if(m_selcmd==null) throw new FoundationException("ViewR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewR", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewR_clear

			return;
		}

		/**
		 * ViewR�N���X�̕W���R���X�g���N�^
		 */
		public ViewR()
		{
			//{{user_implement_dev:ViewR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read2
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_read3
			if(m_selcmd==null) throw new FoundationException("ViewE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewE", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewE_clear

			return;
		}

		/**
		 * ViewE�N���X�̕W���R���X�g���N�^
		 */
		public ViewE()
		{
			//{{user_implement_dev:ViewE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewR_ALC extends DataObject
	{
		protected String m_selcmd = " select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY >  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY >  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ? or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_ALC_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewR_ALC_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_ALC_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read2
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_ALC_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_read3
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_ALC_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR_ALC", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR_ALC", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewR_ALC", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewR_ALC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_ALC_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewR_ALC_clear

			return;
		}

		/**
		 * ViewR_ALC�N���X�̕W���R���X�g���N�^
		 */
		public ViewR_ALC()
		{
			//{{user_implement_dev:ViewR_ALC_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewR_ALC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewE_ALC extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_OD.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  T_OD.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  T_OD.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_OD.\"DM_QTY\" as \"DM_QTY\", "
+" "
+"  to_char(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0),'fm99999999999990.0099') as \"ODR_QTY\", "
+" "
+"  to_char(T_OD.DM_QTY - abs(decode(M_ITEM.UNIT_QTY_TYP,1, "
+"      CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"      ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"  + decode(T_OD.DM_STS_TYP,9,0,NVL(S1.STOCK_ON_HAND_QTY,0))  "
+"  + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"  + NVL(S2.ALCD_QTY,0)),'fm99999999999990.0099') as \"ALCD_QTY\", "
+" "
+"  to_char(T_OD.\"TOTAL_ISSUE_QTY\", 'fm99999999999990.0099') as \"TOTAL_ISSUE_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  FncGetFormattedDatetime(T_OD.\"DUE_DATE\") as \"DUE_DATE\", "
+"  T1.\"DISPLAY_NAME\" as \"DM_STS_TYP\", "
+"  T2.\"DISPLAY_NAME\" as \"OD_TYP\", "
+"  T3.\"DISPLAY_NAME\" as \"MRP_ODR_TYP\", "
+"  T_OD.\"OD_NO\" as \"OD_NO\" "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"              CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"              ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))))  "
+"       + NVL(S1.STOCK_ON_HAND_QTY,0)  "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY <  "
+"       decode(M_ITEM.UNIT_QTY_TYP,1, "
+"             CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100))) "
+"             ,(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP,9,0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) / (1 + (T_OD.ITEM_SPOIL / 100)))) "
+"       + (T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY,0)) "
+"       + NVL(S2.ALCD_QTY,0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and ((T_OD.DUE_DATE >= to_date(?,'YYYY/MM/DD HH24:MI') "
+"    and T_OD.DUE_DATE <= to_date(?,'YYYY/MM/DD HH24:MI')) "
+"    or (T_OD.DUE_DATE  = to_date(?,'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"order by "
+"  T_OD.JOB_ODR_CD, "
+"  T_OD.JOB_ODR_CANCEL_NO, "
+"  T_OD.ALC_GRP_CD, "
+"  T_OD.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_ALC_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewE_ALC_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_ALC_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read2
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_ALC_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_read3
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_ALC_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE_ALC", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ALC_GRP_CD( getString(3, rs) );
			data.setl_ITEM_CD( getString(4, rs) );
			data.setl_ITEM_NAME( getString(5, rs) );
			data.setl_DM_QTY( getString(6, rs) );
			data.setl_ALC_ALCD_QTY( getString(7, rs) );
			data.setl_ALCDLE_QTY( getString(8, rs) );
			data.setl_TOTAL_ISSUE_QTY( getString(9, rs) );
			data.setl_STOCK_UNIT( getString(10, rs) );
			data.setl_DUE_DATE( getString(11, rs) );
			data.setl_DM_STS_TYP( getString(12, rs) );
			data.setl_OD_TYP( getString(13, rs) );
			data.setl_MRP_ODR_TYP( getString(14, rs) );
			data.setl_OD_NO( getString(15, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE_ALC", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALC_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("ViewE_ALC", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:ViewE_ALC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_ALC_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewE_ALC_clear

			return;
		}

		/**
		 * ViewE_ALC�N���X�̕W���R���X�g���N�^
		 */
		public ViewE_ALC()
		{
			//{{user_implement_dev:ViewE_ALC_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewE_ALC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SELECT_TIME_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  value "
+"from "
+"  SYS_PARAMETER "
+"where "
+"  name = 'TIME_CTRL'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_TIME_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SELECT_TIME_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_TIME_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_TIME_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setTIME_CTRL( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_TIME_CTRL", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_TIME_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_TIME_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SELECT_TIME_CTRL_clear

			return;
		}

		/**
		 * SELECT_TIME_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public SELECT_TIME_CTRL()
		{
			//{{user_implement_dev:SELECT_TIME_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SELECT_TIME_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewRCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and rownum <= to_number(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewRCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewRCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewRCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewRCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewRCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewRCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewRCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewRCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewRCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewRCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewRCnt_clear

			return;
		}

		/**
		 * ViewRCnt�N���X�̕W���R���X�g���N�^
		 */
		public ViewRCnt()
		{
			//{{user_implement_dev:ViewRCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewRCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewR_ALCCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY > decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewR_ALCCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewR_ALCCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewR_ALCCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_ALCCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewR_ALCCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewR_ALCCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewR_ALCCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewR_ALCCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewR_ALCCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewR_ALCCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewR_ALCCnt_clear

			return;
		}

		/**
		 * ViewR_ALCCnt�N���X�̕W���R���X�g���N�^
		 */
		public ViewR_ALCCnt()
		{
			//{{user_implement_dev:ViewR_ALCCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewR_ALCCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewECnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  T_JOB_ODR, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.JOB_ODR_CD = T_JOB_ODR.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = T_JOB_ODR.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.JOB_ODR_CANCEL_NO = T_JOB_ODR.JOB_ODR_CANCEL_NO(+) "
+"  and T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and T_JOB_ODR.ALC_GRP_CD = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewECnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewECnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewECnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewECnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewECnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getALC_GRP_CD());
				if(isNull(data.getALC_GRP_CD())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewECnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getALC_GRP_CD())) setString(no ++, data.getALC_GRP_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewECnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewECnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewECnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewECnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewECnt_clear

			return;
		}

		/**
		 * ViewECnt�N���X�̕W���R���X�g���N�^
		 */
		public ViewECnt()
		{
			//{{user_implement_dev:ViewECnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewECnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewE_ALCCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_OD, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"      T_JOB_ODR_CD_STOCK.\"JOB_ODR_DETAIL_NO\" as \"JOB_ODR_DETAIL_NO\", "
+"      T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"      sum(T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\") as \"STOCK_ON_HAND_QTY\" "
+"    from "
+"      T_JOB_ODR_CD_STOCK, "
+"      T_OD, "
+"      M_WH "
+"    where "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD = T_OD.JOB_ODR_CD "
+"      and T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO = T_OD.JOB_ODR_DETAIL_NO "
+"      and T_JOB_ODR_CD_STOCK.ITEM_CD = T_OD.ITEM_CD "
+"      and T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD "
+"      and T_JOB_ODR_CD_STOCK.PLANT_CD = ? "
+"      and M_WH.MRP_FLG = 1 "
+"    group by "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_CD, "
+"      T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
+"      T_JOB_ODR_CD_STOCK.ITEM_CD "
+"  ) S1, "
+"  ( "
+"    select "
+"      T_JOB_ODR_ALC.\"OD_NO\" as \"OD_NO\", "
+"      sum(T_JOB_ODR_ALC.\"ALCD_QTY\") as \"ALCD_QTY\", "
+"      sum(T_JOB_ODR_ALC.\"ISSUEED_QTY\") as \"ISSUEED_QTY\" "
+"    from "
+"      T_JOB_ODR_ALC, "
+"      T_OD "
+"    where "
+"      T_JOB_ODR_ALC.OD_NO = T_OD.OD_NO "
+"    group by "
+"      T_JOB_ODR_ALC.OD_NO "
+"  ) S2, "
+"  SYS_TYPE_VALUE T1, "
+"  SYS_TYPE_VALUE T2, "
+"  SYS_TYPE_VALUE T3 "
+"Where "
+"  T_OD.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and T_OD.JOB_ODR_CD = S1.JOB_ODR_CD(+) "
+"  and T_OD.JOB_ODR_DETAIL_NO = S1.JOB_ODR_DETAIL_NO(+) "
+"  and T_OD.ITEM_CD = S1.ITEM_CD(+) "
+"  and T_OD.OD_NO = S2.OD_NO(+) "
+"  and T1.VALUE(+) = T_OD.DM_STS_TYP "
+"  and T2.VALUE(+) = T_OD.OD_TYP "
+"  and T3.VALUE(+) = T_OD.MRP_ODR_TYP "
+"  and T1.NAME(+) = 'DM_STS_TYP' "
+"  and T2.NAME(+) = 'OD_TYP' "
+"  and T3.NAME(+) = 'MRP_ODR_TYP' "
+"  and(T_OD.MRP_ODR_TYP = 1 "
+"  or  T_OD.MRP_ODR_TYP = 2) "
+"  and(T_OD.OD_TYP = 1 "
+"  or  T_OD.OD_TYP = 3) "
+"  and((T_OD.DM_STS_TYP <> 9 "
+"  and T_OD.DM_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) + NVL(S1.STOCK_ON_HAND_QTY, 0) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0)) "
+"  or (T_OD.DM_STS_TYP = 9 "
+"  and T_OD.TOTAL_ISSUE_QTY < decode(M_ITEM.UNIT_QTY_TYP, 1, CEIL(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100))),(decode(sign(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY), - 1, 0, decode(T_OD.ODR_STS_TYP, 9, 0,(T_OD.ODR_QTY - T_OD.TOTAL_RCV_QTY))) /(1 +(T_OD.ITEM_SPOIL / 100)))) +(T_OD.TOTAL_ISSUE_QTY - NVL(S2.ISSUEED_QTY, 0)) + NVL(S2.ALCD_QTY, 0))) "
+"  and T_OD.PLANT_CD = ? "
+"  and T_OD.ITEM_CD = ? "
+"  and((T_OD.DUE_DATE >= to_date(?, 'YYYY/MM/DD HH24:MI') "
+"  and T_OD.DUE_DATE <= to_date(?, 'YYYY/MM/DD HH24:MI')) "
+"  or (T_OD.DUE_DATE = to_date(?, 'YYYY/MM/DD HH24:MI'))) "
+"  and T_OD.JOB_ODR_CD = ? "
+"  and T_OD.JOB_ODR_CANCEL_NO = ? "
+"  and(T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ? "
+"  or  T_OD.DM_STS_TYP = ?) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewE_ALCCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewE_ALCCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0110010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0110010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewE_ALCCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_ALCCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0110010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewE_ALCCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0110010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsetSYSPLANT_CD_1());
				if(isNull(data.getsetSYSPLANT_CD_1())) isNull = true;
				ary.addElement(data.getsetSYSPLANT_CD_2());
				if(isNull(data.getsetSYSPLANT_CD_2())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM());
				if(isNull(data.getl_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_TO());
				if(isNull(data.getl_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CANCEL_NO());
				if(isNull(data.getJOB_ODR_CANCEL_NO())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_1());
				if(isNull(data.getsetDM_STS_TYP_1())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_2());
				if(isNull(data.getsetDM_STS_TYP_2())) isNull = true;
				ary.addElement(data.getsetDM_STS_TYP_3());
				if(isNull(data.getsetDM_STS_TYP_3())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewE_ALCCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_1())) setString(no ++, data.getsetSYSPLANT_CD_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetSYSPLANT_CD_2())) setString(no ++, data.getsetSYSPLANT_CD_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM())) setString(no ++, data.getl_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_TO())) setString(no ++, data.getl_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CANCEL_NO())) setString(no ++, data.getJOB_ODR_CANCEL_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_1())) setString(no ++, data.getsetDM_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_2())) setString(no ++, data.getsetDM_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsetDM_STS_TYP_3())) setString(no ++, data.getsetDM_STS_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0110010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0110010Struct data = new AC0110010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewE_ALCCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0110010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0110010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewE_ALCCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewE_ALCCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0110010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewE_ALCCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewE_ALCCnt_clear

			return;
		}

		/**
		 * ViewE_ALCCnt�N���X�̕W���R���X�g���N�^
		 */
		public ViewE_ALCCnt()
		{
			//{{user_implement_dev:ViewE_ALCCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewE_ALCCnt_constractor

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
		mreadM_ITEM.clear();
		mreadM_ITEM = null;
		mreadT_JOB_ODR.clear();
		mreadT_JOB_ODR = null;
		mreadT_JOB_ODR_PLANT.clear();
		mreadT_JOB_ODR_PLANT = null;
		mreadT_JOB_ODR_ALC.clear();
		mreadT_JOB_ODR_ALC = null;
		mViewR.clear();
		mViewR = null;
		mViewE.clear();
		mViewE = null;
		mViewR_ALC.clear();
		mViewR_ALC = null;
		mViewE_ALC.clear();
		mViewE_ALC = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		mViewRCnt.clear();
		mViewRCnt = null;
		mViewR_ALCCnt.clear();
		mViewR_ALCCnt = null;
		mViewECnt.clear();
		mViewECnt = null;
		mViewE_ALCCnt.clear();
		mViewE_ALCCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AC0110010�N���X�̕W���R���X�g���N�^
	 */
	public AC0110010Entity() throws FoundationException
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
