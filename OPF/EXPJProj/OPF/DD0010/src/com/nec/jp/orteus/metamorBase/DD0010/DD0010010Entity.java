/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/src/com/nec/jp/orteus/metamorBase/DD0010/DD0010010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0010;

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

public class DD0010010Entity extends DataObject
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

	// Root�N���X �C���X�^���X
	public Root mRoot = new Root();

	// Node�N���X �C���X�^���X
	public Node mNode = new Node();

	// Detail�N���X �C���X�^���X
	public Detail mDetail = new Detail();

	// Csv�N���X �C���X�^���X
	public Csv mCsv = new Csv();

	// SYS_COST_CTRL�N���X �C���X�^���X
	public SYS_COST_CTRL mSYS_COST_CTRL = new SYS_COST_CTRL();

	// M_PLANT�N���X �C���X�^���X
	public M_PLANT mM_PLANT = new M_PLANT();

	// M_ITEM�N���X �C���X�^���X
	public M_ITEM mM_ITEM = new M_ITEM();


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
		String m_write_fname="DD0010010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="DD0010010";

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
	public class Root extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_COST.YEAR as YEAR, "
+"  T_ITEM_COST.HALF_TERM_TYP as HALF_TERM_TYP, "
+"  T_ITEM_COST.PLANT_CD as PLANT_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.PS_EDITION as PS_EDITION, "
+"  T_ITEM_COST.COST_STATEMENT_NO as COST_STATEMENT_NO, "
+"  to_char(T_ITEM_COST.EFF_PHASE_IN_DATE, 'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
+"  to_char(T_ITEM_COST.EFF_PHASE_OUT_DATE, 'yyyy/mm/dd') as EFF_PHASE_OUT_DATE, "
+"  to_char(T_ITEM_COST.DMY_ITEM_FLG) as DMY_ITEM_FLG, "
+"  to_char(T_ITEM_COST.COST_EXCLUDE_FLG) as COST_EXCLUDE_FLG "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = ? "
+"  and T_ITEM_COST.HALF_TERM_TYP = ? "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD = ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Root_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Root_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read
                        if(m_selcmd==null) throw new FoundationException("Root", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Root_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read2
			if(m_selcmd==null) throw new FoundationException("Root", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Root_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_read3
			if(m_selcmd==null) throw new FoundationException("Root", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Root_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getYEAR());
				if(isNull(data.getYEAR())) isNull = true;
				ary.addElement(data.getHALF_TERM_TYP());
				if(isNull(data.getHALF_TERM_TYP())) isNull = true;
				ary.addElement(data.getROOT_ITEM_CD());
				if(isNull(data.getROOT_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getYEAR(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getHALF_TERM_TYP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getROOT_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.sett_YEAR( getString(1, rs) );
			data.sett_HALF_TERM_TYP( getString(2, rs) );
			data.sett_PLANT_CD( getString(3, rs) );
			data.sett_ROOT_ITEM_CD( getString(4, rs) );
			data.sett_PARENT_ITEM_CD( getString(5, rs) );
			data.sett_ITEM_CD( getString(6, rs) );
			data.sett_ITEM_NAME( getString(7, rs) );
			data.sett_PS_EDITION( getString(8, rs) );
			data.sett_COST_STATEMENT_NO( getString(9, rs) );
			data.sett_EFF_PHASE_IN_DATE( getString(10, rs) );
			data.sett_EFF_PHASE_OUT_DATE( getString(11, rs) );
			data.sett_DMY_ITEM_FLG( getString(12, rs) );
			data.sett_COST_EXCLUDE_FLG( getString(13, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Root", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Root_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Root", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Root_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Root_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Root_clear

			return;
		}

		/**
		 * Root�N���X�̕W���R���X�g���N�^
		 */
		public Root()
		{
			//{{user_implement_dev:Root_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Root_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class Node extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_COST.YEAR as YEAR, "
+"  T_ITEM_COST.HALF_TERM_TYP as HALF_TERM_TYP, "
+"  T_ITEM_COST.PLANT_CD as PLANT_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.PS_EDITION as PS_EDITION, "
+"  T_ITEM_COST.COST_STATEMENT_NO as COST_STATEMENT_NO, "
+"  to_char(T_ITEM_COST.EFF_PHASE_IN_DATE, 'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
+"  to_char(T_ITEM_COST.EFF_PHASE_OUT_DATE, 'yyyy/mm/dd') as EFF_PHASE_OUT_DATE, "
+"  to_char(T_ITEM_COST.DMY_ITEM_FLG) as DMY_ITEM_FLG, "
+"  to_char(T_ITEM_COST.COST_EXCLUDE_FLG) as COST_EXCLUDE_FLG "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM "
+"where "
+"  M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = ? "
+"  and T_ITEM_COST.HALF_TERM_TYP = ? "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD = ? "
+"  and T_ITEM_COST.PARENT_ITEM_CD = ? "
+"  and T_ITEM_COST.PARENT_COST_STATEMENT_NO = ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Node_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Node_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read
                        if(m_selcmd==null) throw new FoundationException("Node", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Node_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read2
			if(m_selcmd==null) throw new FoundationException("Node", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Node_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_read3
			if(m_selcmd==null) throw new FoundationException("Node", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Node_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gett_PLANT_CD());
				if(isNull(data.gett_PLANT_CD())) isNull = true;
				ary.addElement(data.gett_YEAR());
				if(isNull(data.gett_YEAR())) isNull = true;
				ary.addElement(data.gett_HALF_TERM_TYP());
				if(isNull(data.gett_HALF_TERM_TYP())) isNull = true;
				ary.addElement(data.gett_ROOT_ITEM_CD());
				if(isNull(data.gett_ROOT_ITEM_CD())) isNull = true;
				ary.addElement(data.gett_PARENT_ITEM_CD());
				if(isNull(data.gett_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.gett_PARENT_COST_STATEMENT_NO());
				if(isNull(data.gett_PARENT_COST_STATEMENT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.gett_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_YEAR(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_HALF_TERM_TYP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_ROOT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_PARENT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_PARENT_COST_STATEMENT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.sett_YEAR( getString(1, rs) );
			data.sett_HALF_TERM_TYP( getString(2, rs) );
			data.sett_PLANT_CD( getString(3, rs) );
			data.sett_ROOT_ITEM_CD( getString(4, rs) );
			data.sett_PARENT_ITEM_CD( getString(5, rs) );
			data.sett_ITEM_CD( getString(6, rs) );
			data.sett_ITEM_NAME( getString(7, rs) );
			data.sett_PS_EDITION( getString(8, rs) );
			data.sett_COST_STATEMENT_NO( getString(9, rs) );
			data.sett_EFF_PHASE_IN_DATE( getString(10, rs) );
			data.sett_EFF_PHASE_OUT_DATE( getString(11, rs) );
			data.sett_DMY_ITEM_FLG( getString(12, rs) );
			data.sett_COST_EXCLUDE_FLG( getString(13, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Node", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Node_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Node", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Node_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Node_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Node_clear

			return;
		}

		/**
		 * Node�N���X�̕W���R���X�g���N�^
		 */
		public Node()
		{
			//{{user_implement_dev:Node_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Node_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class Detail extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  M_PARENT_ITEM.ITEM_NAME as PARENT_ITEM_NAME, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP_DN, "
+"  T_ITEM_COST.OUTSIDE_TYP as OUTSIDE_TYP_DN, "
+"  T_ITEM_COST.PROC_OUTSIDE_TYP as PROC_OUTSIDE_TYP_DN, "
+"  T_ITEM_COST.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  to_char(T_ITEM_COST.PS_UNIT_NUMERATOR, 'fm99,999,999,999,990.0999') || ' / ' || to_char(T_ITEM_COST.PS_UNIT_DENOMINATOR, 'fm99,999,999,999,990.0999') as PS_UNIT_QTY, "
+"  to_char(T_ITEM_COST.NECESSARY_QTY) as NECESSARY_QTY, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  to_char(T_ITEM_COST.PS_INPUT_RATIO) as PS_INPUT_RATIO, "
+"  to_char(T_ITEM_COST.ITEM_INPUT_RATIO) as ITEM_INPUT_RATIO, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST + T_ITEM_COST.TOTAL_SBCNT_MATR_COST + T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_COST, "
+"  to_char(T_ITEM_COST.OWN_MATR_COST) as OWN_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST) as TOTAL_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_SBCNT_MATR_COST) as OWN_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_SBCNT_MATR_COST) as TOTAL_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_PROC_COST_SUM_ALL) as OWN_PROC_COST_SUM_ALL, "
+"  to_char(T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_PROC_COST_SUM_ALL, "
+"  M_CUR.CUR_UNIT as CUR_UNIT, "
+"  T_ITEM_COST.COST_UP_TYP as COST_UP_TYP_DN, "
+"  T_ITEM_COST.VOLUNT_SPL_FLG as VOLUNT_SPL_FLG_DN, "
+"  T_ITEM_COST.ONEROUS_CONS_FLG as ONEROUS_CONS_FLG_DN "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_CS_PROC, "
+"  SYS_HOME_CUR, "
+"  M_CUR "
+"where "
+"  M_PARENT_ITEM.ITEM_CD(+) = T_ITEM_COST.PARENT_ITEM_CD "
+"  and M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = ? "
+"  and T_ITEM_COST.HALF_TERM_TYP = ? "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD = ? "
+"  and T_ITEM_COST.PARENT_ITEM_CD = ? "
+"  and T_ITEM_COST.ITEM_CD = ? "
+"  and T_ITEM_COST.COST_STATEMENT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Detail_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Detail_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read
                        if(m_selcmd==null) throw new FoundationException("Detail", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Detail_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read2
			if(m_selcmd==null) throw new FoundationException("Detail", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Detail_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_read3
			if(m_selcmd==null) throw new FoundationException("Detail", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Detail_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gett_PLANT_CD());
				if(isNull(data.gett_PLANT_CD())) isNull = true;
				ary.addElement(data.gett_YEAR());
				if(isNull(data.gett_YEAR())) isNull = true;
				ary.addElement(data.gett_HALF_TERM_TYP());
				if(isNull(data.gett_HALF_TERM_TYP())) isNull = true;
				ary.addElement(data.gett_ROOT_ITEM_CD());
				if(isNull(data.gett_ROOT_ITEM_CD())) isNull = true;
				ary.addElement(data.gett_PARENT_ITEM_CD());
				if(isNull(data.gett_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.gett_ITEM_CD());
				if(isNull(data.gett_ITEM_CD())) isNull = true;
				ary.addElement(data.gett_COST_STATEMENT_NO());
				if(isNull(data.gett_COST_STATEMENT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.gett_PLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_YEAR(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_HALF_TERM_TYP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_ROOT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_PARENT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gett_COST_STATEMENT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.setd_PARENT_ITEM_CD( getString(1, rs) );
			data.setd_PARENT_ITEM_NAME( getString(2, rs) );
			data.setd_ITEM_CD( getString(3, rs) );
			data.setd_ITEM_NAME( getString(4, rs) );
			data.setd_MRP_ODR_TYP_DN( getString(5, rs) );
			data.setd_OUTSIDE_TYP_DN( getString(6, rs) );
			data.setd_PROC_OUTSIDE_TYP_DN( getString(7, rs) );
			data.setd_CLASIFICATION_CD( getString(8, rs) );
			data.setd_CS_PROC_CD( getString(9, rs) );
			data.setd_CS_PROC_NAME( getString(10, rs) );
			data.setd_PS_UNIT_QTY( getString(11, rs) );
			data.setd_NECESSARY_QTY( getString(12, rs) );
			data.setd_STOCK_UNIT( getString(13, rs) );
			data.setd_PS_INPUT_RATIO( getString(14, rs) );
			data.setd_ITEM_INPUT_RATIO( getString(15, rs) );
			data.setd_TOTAL_COST( getString(16, rs) );
			data.setd_OWN_MATR_COST( getString(17, rs) );
			data.setd_TOTAL_MATR_COST( getString(18, rs) );
			data.setd_OWN_SBCNT_MATR_COST( getString(19, rs) );
			data.setd_TOTAL_SBCNT_MATR_COST( getString(20, rs) );
			data.setd_OWN_PROC_COST_SUM_ALL( getString(21, rs) );
			data.setd_TOTAL_PROC_COST_SUM_ALL( getString(22, rs) );
			data.setd_HOME_CUR_UNIT( getString(23, rs) );
			data.setd_COST_UP_TYP_DN( getString(24, rs) );
			data.setd_VOLUNT_SPL_FLG_DN( getString(25, rs) );
			data.setd_ONEROUS_CONS_FLG_DN( getString(26, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Detail", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Detail_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Detail", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Detail_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Detail_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Detail_clear

			return;
		}

		/**
		 * Detail�N���X�̕W���R���X�g���N�^
		 */
		public Detail()
		{
			//{{user_implement_dev:Detail_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Detail_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class Csv extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(T_ITEM_COST.YEAR) as YEAR, "
+"  to_char(T_ITEM_COST.HALF_TERM_TYP) as HALF_TERM_TYP, "
+"  to_char(T_ITEM_COST.COST_TYP) as COST_TYP, "
+"  T_ITEM_COST.PLANT_CD as PLANT_CD, "
+"  M_PLANT.PLANT_NAME as PLANT_NAME, "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  M_ROOT_ITEM.ITEM_NAME as ROOT_ITEM_NAME, "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  M_PARENT_ITEM.ITEM_NAME as PARENT_ITEM_NAME, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.PS_EDITION as PS_EDITION, "
+"  to_char(T_ITEM_COST.COST_STATEMENT_NO) as COST_STATEMENT_NO, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  M_CS_PROC.WS_CD as WS_CD, "
+"  M_WS.WS_NAME as WS_NAME, "
+"  M_CS_PROC.ORG_CD as ORG_CD, "
+"  M_ORG.ORG_NAME as ORG_NAME, "
+"  to_char(T_ITEM_COST.NECESSARY_QTY) as NECESSARY_QTY, "
+"  to_char(T_ITEM_COST.PS_INPUT_RATIO) as PS_INPUT_RATIO, "
+"  to_char(T_ITEM_COST.ITEM_INPUT_RATIO) as ITEM_INPUT_RATIO, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST + T_ITEM_COST.TOTAL_SBCNT_MATR_COST + T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_COST, "
+"  to_char(T_ITEM_COST.OWN_MATR_COST) as OWN_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST) as TOTAL_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_SBCNT_MATR_COST) as OWN_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_SBCNT_MATR_COST) as TOTAL_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_PROC_COST_SUM_ALL) as OWN_PROC_COST_SUM_ALL, "
+"  to_char(T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_PROC_COST_SUM_ALL, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  to_char(T_ITEM_COST.EFF_PHASE_IN_DATE, 'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
+"  to_char(T_ITEM_COST.EFF_PHASE_OUT_DATE, 'yyyy/mm/dd') as EFF_PHASE_OUT_DATE, "
+"  to_char(T_ITEM_COST.PARENT_COST_STATEMENT_NO) as PARENT_COST_STATEMENT_NO, "
+"  T_ITEM_COST.PARENT_ITEM_STOCK_UNIT as PARENT_ITEM_STOCK_UNIT, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  T_ITEM_COST.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  to_char(T_ITEM_COST.OUTSIDE_TYP) as OUTSIDE_TYP, "
+"  to_char(T_ITEM_COST.PROC_OUTSIDE_TYP) as PROC_OUTSIDE_TYP, "
+"  T_ITEM_PROC_COST.PROC_COST_CLS_CD as PROC_COST_CLS_CD, "
+"  M_PROC_COST_CLS.PROC_COST_CLS_NAME as PROC_COST_CLS_NAME, "
+"  to_char(M_PROC_COST.PROC_COST_UNIT_QTY) as PROC_COST_UNIT_QTY, "
+"  M_PROC_COST.STOCK_UNIT as PROC_COST_UNIT_QTY_UNIT, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_01),'0.00') as OWN_PROC_COST_01, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_02),'0.00') as OWN_PROC_COST_02, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_03),'0.00') as OWN_PROC_COST_03, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_04),'0.00') as OWN_PROC_COST_04, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_05),'0.00') as OWN_PROC_COST_05, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_06),'0.00') as OWN_PROC_COST_06, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_07),'0.00') as OWN_PROC_COST_07, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_08),'0.00') as OWN_PROC_COST_08, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_09),'0.00') as OWN_PROC_COST_09, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_10),'0.00') as OWN_PROC_COST_10, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_11),'0.00') as OWN_PROC_COST_11, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_12),'0.00') as OWN_PROC_COST_12, "
+"  nvl(to_char(T_ITEM_PROC_COST.OWN_PROC_COST_SUM),'0.00') as OWN_PROC_COST_SUM, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_01),'0.00') as TOTAL_PROC_COST_01, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_02),'0.00') as TOTAL_PROC_COST_02, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_03),'0.00') as TOTAL_PROC_COST_03, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_04),'0.00') as TOTAL_PROC_COST_04, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_05),'0.00') as TOTAL_PROC_COST_05, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_06),'0.00') as TOTAL_PROC_COST_06, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_07),'0.00') as TOTAL_PROC_COST_07, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_08),'0.00') as TOTAL_PROC_COST_08, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_09),'0.00') as TOTAL_PROC_COST_09, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_10),'0.00') as TOTAL_PROC_COST_10, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_11),'0.00') as TOTAL_PROC_COST_11, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_12),'0.00') as TOTAL_PROC_COST_12, "
+"  nvl(to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM),'0.00') as TOTAL_PROC_COST_SUM, "
+"  M_PROC_COST_CLS.PROC_COST_01_NAME as PROC_COST_01_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_02_NAME as PROC_COST_02_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_03_NAME as PROC_COST_03_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_04_NAME as PROC_COST_04_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_05_NAME as PROC_COST_05_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_06_NAME as PROC_COST_06_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_07_NAME as PROC_COST_07_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_08_NAME as PROC_COST_08_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_09_NAME as PROC_COST_09_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_10_NAME as PROC_COST_10_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_11_NAME as PROC_COST_11_NAME, "
+"  M_PROC_COST_CLS.PROC_COST_12_NAME as PROC_COST_12_NAME "
+"from "
+"  ( "
+"    select "
+"      * "
+"    from "
+"      T_ITEM_COST "
+"    where "
+"      COST_EXCLUDE_FLG = 0 "
+"    start with "
+"      PLANT_CD = ? "
+"      and YEAR = to_number(?) "
+"      and HALF_TERM_TYP = to_number(?) "
+"      and COST_TYP = 1 "
+"      and ROOT_ITEM_CD = ? "
+"      and UPPER_ITEM_FLG = 1 "
+"    connect by "
+"      prior YEAR = YEAR "
+"      and prior HALF_TERM_TYP = HALF_TERM_TYP "
+"      and prior COST_TYP = COST_TYP "
+"      and prior PLANT_CD = PLANT_CD "
+"      and prior ROOT_ITEM_CD = ROOT_ITEM_CD "
+"      and prior ITEM_CD = PARENT_ITEM_CD "
+"      and prior COST_STATEMENT_NO = PARENT_COST_STATEMENT_NO "
+"    order siblings by "
+"      ITEM_CD "
+"  ) T_ITEM_COST, "
+"  T_ITEM_PROC_COST, "
+"  M_PLANT, "
+"  M_ITEM M_ROOT_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_ITEM, "
+"  M_CS_PROC, "
+"  M_WS, "
+"  M_ORG, "
+"  M_PROC_COST, "
+"  M_PROC_COST_CLS, "
+"  SYS_HOME_CUR, "
+"  M_CUR M_HOME_CUR "
+"where "
+"  T_ITEM_PROC_COST.YEAR(+) = T_ITEM_COST.YEAR "
+"  and T_ITEM_PROC_COST.HALF_TERM_TYP(+) = T_ITEM_COST.HALF_TERM_TYP "
+"  and T_ITEM_PROC_COST.COST_TYP(+) = T_ITEM_COST.COST_TYP "
+"  and T_ITEM_PROC_COST.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and T_ITEM_PROC_COST.ROOT_ITEM_CD(+) = T_ITEM_COST.ROOT_ITEM_CD "
+"  and T_ITEM_PROC_COST.PARENT_ITEM_CD(+) = T_ITEM_COST.PARENT_ITEM_CD "
+"  and T_ITEM_PROC_COST.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and T_ITEM_PROC_COST.PS_EDITION(+) = T_ITEM_COST.PS_EDITION "
+"  and T_ITEM_PROC_COST.COST_STATEMENT_NO(+) = T_ITEM_COST.COST_STATEMENT_NO "
+"  and M_PLANT.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_ROOT_ITEM.ITEM_CD(+) = T_ITEM_COST.ROOT_ITEM_CD "
+"  and M_PARENT_ITEM.ITEM_CD(+) = T_ITEM_COST.PARENT_ITEM_CD "
+"  and M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and M_WS.WS_CD(+) = M_CS_PROC.WS_CD "
+"  and M_ORG.COMPANY_CD(+) = M_CS_PROC.COMPANY_CD "
+"  and M_ORG.ORG_CD(+) = M_CS_PROC.ORG_CD "
+"  and M_PROC_COST.YEAR(+) = T_ITEM_PROC_COST.YEAR "
+"  and M_PROC_COST.HALF_TERM_TYP(+) = T_ITEM_PROC_COST.HALF_TERM_TYP "
+"  and M_PROC_COST.COST_TYP(+) = T_ITEM_PROC_COST.COST_TYP "
+"  and M_PROC_COST.PLANT_CD(+) = T_ITEM_PROC_COST.PLANT_CD "
+"  and M_PROC_COST.CS_PROC_CD(+) = T_ITEM_PROC_COST.CS_PROC_CD "
+"  and M_PROC_COST.PROC_COST_CLS_CD(+) = T_ITEM_PROC_COST.PROC_COST_CLS_CD "
+"  and M_PROC_COST_CLS.PLANT_CD(+) = T_ITEM_PROC_COST.PLANT_CD "
+"  and M_PROC_COST_CLS.PROC_COST_CLS_CD(+) = T_ITEM_PROC_COST.PROC_COST_CLS_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Csv_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Csv_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_read
                        if(m_selcmd==null) throw new FoundationException("Csv", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Csv_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_read2
			if(m_selcmd==null) throw new FoundationException("Csv", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Csv_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_read3
			if(m_selcmd==null) throw new FoundationException("Csv", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Csv_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getYEAR());
				if(isNull(data.getYEAR())) isNull = true;
				ary.addElement(data.getHALF_TERM_TYP());
				if(isNull(data.getHALF_TERM_TYP())) isNull = true;
				ary.addElement(data.getROOT_ITEM_CD());
				if(isNull(data.getROOT_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getYEAR(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getHALF_TERM_TYP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getROOT_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.setYEAR( getString(1, rs) );
			data.setHALF_TERM_TYP( getString(2, rs) );
			data.setCOST_TYP( getString(3, rs) );
			data.setPLANT_CD( getString(4, rs) );
			data.setPLANT_NAME( getString(5, rs) );
			data.setROOT_ITEM_CD( getString(6, rs) );
			data.setROOT_ITEM_NAME( getString(7, rs) );
			data.setPARENT_ITEM_CD( getString(8, rs) );
			data.setPARENT_ITEM_NAME( getString(9, rs) );
			data.setITEM_CD( getString(10, rs) );
			data.setITEM_NAME( getString(11, rs) );
			data.setPS_EDITION( getString(12, rs) );
			data.setCOST_STATEMENT_NO( getString(13, rs) );
			data.setCS_PROC_CD( getString(14, rs) );
			data.setCS_PROC_NAME( getString(15, rs) );
			data.setWS_CD( getString(16, rs) );
			data.setWS_NAME( getString(17, rs) );
			data.setORG_CD( getString(18, rs) );
			data.setORG_NAME( getString(19, rs) );
			data.setNECESSARY_QTY( getString(20, rs) );
			data.setPS_INPUT_RATIO( getString(21, rs) );
			data.setITEM_INPUT_RATIO( getString(22, rs) );
			data.setTOTAL_COST( getString(23, rs) );
			data.setOWN_MATR_COST( getString(24, rs) );
			data.setTOTAL_MATR_COST( getString(25, rs) );
			data.setOWN_SBCNT_MATR_COST( getString(26, rs) );
			data.setTOTAL_SBCNT_MATR_COST( getString(27, rs) );
			data.setOWN_PROC_COST_SUM_ALL( getString(28, rs) );
			data.setTOTAL_PROC_COST_SUM_ALL( getString(29, rs) );
			data.setHOME_CUR_UNIT( getString(30, rs) );
			data.setEFF_PHASE_IN_DATE( getString(31, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(32, rs) );
			data.setPARENT_COST_STATEMENT_NO( getString(33, rs) );
			data.setPARENT_ITEM_STOCK_UNIT( getString(34, rs) );
			data.setSTOCK_UNIT( getString(35, rs) );
			data.setCLASIFICATION_CD( getString(36, rs) );
			data.setOUTSIDE_TYP( getString(37, rs) );
			data.setPROC_OUTSIDE_TYP( getString(38, rs) );
			data.setPROC_COST_CLS_CD( getString(39, rs) );
			data.setPROC_COST_CLS_NAME( getString(40, rs) );
			data.setPROC_COST_UNIT_QTY( getString(41, rs) );
			data.setPROC_COST_UNIT_QTY_UNIT( getString(42, rs) );
			data.setOWN_PROC_COST_01( getString(43, rs) );
			data.setOWN_PROC_COST_02( getString(44, rs) );
			data.setOWN_PROC_COST_03( getString(45, rs) );
			data.setOWN_PROC_COST_04( getString(46, rs) );
			data.setOWN_PROC_COST_05( getString(47, rs) );
			data.setOWN_PROC_COST_06( getString(48, rs) );
			data.setOWN_PROC_COST_07( getString(49, rs) );
			data.setOWN_PROC_COST_08( getString(50, rs) );
			data.setOWN_PROC_COST_09( getString(51, rs) );
			data.setOWN_PROC_COST_10( getString(52, rs) );
			data.setOWN_PROC_COST_11( getString(53, rs) );
			data.setOWN_PROC_COST_12( getString(54, rs) );
			data.setOWN_PROC_COST_SUM( getString(55, rs) );
			data.setTOTAL_PROC_COST_01( getString(56, rs) );
			data.setTOTAL_PROC_COST_02( getString(57, rs) );
			data.setTOTAL_PROC_COST_03( getString(58, rs) );
			data.setTOTAL_PROC_COST_04( getString(59, rs) );
			data.setTOTAL_PROC_COST_05( getString(60, rs) );
			data.setTOTAL_PROC_COST_06( getString(61, rs) );
			data.setTOTAL_PROC_COST_07( getString(62, rs) );
			data.setTOTAL_PROC_COST_08( getString(63, rs) );
			data.setTOTAL_PROC_COST_09( getString(64, rs) );
			data.setTOTAL_PROC_COST_10( getString(65, rs) );
			data.setTOTAL_PROC_COST_11( getString(66, rs) );
			data.setTOTAL_PROC_COST_12( getString(67, rs) );
			data.setTOTAL_PROC_COST_SUM( getString(68, rs) );
			data.setPROC_COST_01_NAME( getString(69, rs) );
			data.setPROC_COST_02_NAME( getString(70, rs) );
			data.setPROC_COST_03_NAME( getString(71, rs) );
			data.setPROC_COST_04_NAME( getString(72, rs) );
			data.setPROC_COST_05_NAME( getString(73, rs) );
			data.setPROC_COST_06_NAME( getString(74, rs) );
			data.setPROC_COST_07_NAME( getString(75, rs) );
			data.setPROC_COST_08_NAME( getString(76, rs) );
			data.setPROC_COST_09_NAME( getString(77, rs) );
			data.setPROC_COST_10_NAME( getString(78, rs) );
			data.setPROC_COST_11_NAME( getString(79, rs) );
			data.setPROC_COST_12_NAME( getString(80, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Csv", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Csv", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Csv_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Csv_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Csv_clear

			return;
		}

		/**
		 * Csv�N���X�̕W���R���X�g���N�^
		 */
		public Csv()
		{
			//{{user_implement_dev:Csv_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Csv_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SYS_COST_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  to_char(SYS_COST_CTRL.\"CURRENT_YEAR\") as \"CURRENT_YEAR\", "
+"  to_char(SYS_COST_CTRL.\"HALF_TERM_TYP\") as \"HALF_TERM_TYP\" "
+"from "
+"  SYS_COST_CTRL "
+"where "
+"  SYS_COST_CTRL.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_COST_CTRL_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SYS_COST_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_read
                        if(m_selcmd==null) throw new FoundationException("SYS_COST_CTRL", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SYS_COST_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("SYS_COST_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SYS_COST_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("SYS_COST_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SYS_COST_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.setCURRENT_YEAR( getString(1, rs) );
			data.setHALF_TERM_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SYS_COST_CTRL", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("SYS_COST_CTRL", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SYS_COST_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SYS_COST_CTRL_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SYS_COST_CTRL_clear

			return;
		}

		/**
		 * SYS_COST_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public SYS_COST_CTRL()
		{
			//{{user_implement_dev:SYS_COST_CTRL_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SYS_COST_CTRL_constractor

			return;
		}
	}
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
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_read
                        if(m_selcmd==null) throw new FoundationException("M_PLANT", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_PLANT_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("M_PLANT", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:M_PLANT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
	public class M_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\" "
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
		public List read(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_read
                        if(m_selcmd==null) throw new FoundationException("M_ITEM", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, DD0010010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getROOT_ITEM_CD());
				if(isNull(data.getROOT_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getROOT_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0010010Struct data = new DD0010010Struct();

			data.setROOT_ITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_ITEM_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("M_ITEM", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:M_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0010010Struct data) throws FoundationException, SQLException
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

	// null������A�󔒕�����̏ꍇ��true��Ԃ��܂�
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * �N���[���i�b�v�p���\�b�h
	 *
	 */
	public void clear()
	{
		mRoot.clear();
		mRoot = null;
		mNode.clear();
		mNode = null;
		mDetail.clear();
		mDetail = null;
		mCsv.clear();
		mCsv = null;
		mSYS_COST_CTRL.clear();
		mSYS_COST_CTRL = null;
		mM_PLANT.clear();
		mM_PLANT = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * DD0010010�N���X�̕W���R���X�g���N�^
	 */
	public DD0010010Entity() throws FoundationException
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
