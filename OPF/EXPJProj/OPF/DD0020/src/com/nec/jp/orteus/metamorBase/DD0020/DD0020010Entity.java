/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0020/src/com/nec/jp/orteus/metamorBase/DD0020/DD0020010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0020;

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

public class DD0020010Entity extends DataObject
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

	// View�N���X �C���X�^���X
	public View mView = new View();

	// Csv�N���X �C���X�^���X
	public Csv mCsv = new Csv();

	// Pdf�N���X �C���X�^���X
	public Pdf mPdf = new Pdf();

	// SYS_COST_CTRL�N���X �C���X�^���X
	public SYS_COST_CTRL mSYS_COST_CTRL = new SYS_COST_CTRL();

	// M_PLANT�N���X �C���X�^���X
	public M_PLANT mM_PLANT = new M_PLANT();

	// InsertITEM_COST_LIST_T�N���X �C���X�^���X
	public InsertITEM_COST_LIST_T mInsertITEM_COST_LIST_T = new InsertITEM_COST_LIST_T();

	// DeleteITEM_COST_LIST_T�N���X �C���X�^���X
	public DeleteITEM_COST_LIST_T mDeleteITEM_COST_LIST_T = new DeleteITEM_COST_LIST_T();

	// ViewCnt�N���X �C���X�^���X
	public ViewCnt mViewCnt = new ViewCnt();


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
		String m_write_fname="DD0020010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="DD0020010";

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
	public class View extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.PARENT_ITEM_CD as ITEM_CD, "
+"  M_PARENT_ITEM.ITEM_NAME as PARENT_ITEM_NAME, "
+"  T_ITEM_COST.OUTSIDE_TYP as OUTSIDE_TYP_DN, "
+"  T_ITEM_COST.PROC_OUTSIDE_TYP as PROC_OUTSIDE_TYP_DN, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  to_char(T_ITEM_COST.NECESSARY_QTY) as NECESSARY_QTY, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  to_char(T_ITEM_COST.OWN_MATR_COST) as OWN_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_SBCNT_MATR_COST) as TOTAL_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_SBCNT_MATR_COST) as OWN_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST) as TOTAL_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_PROC_COST_SUM_ALL) as OWN_PROC_COST_SUM_ALL, "
+"  to_char(T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_PROC_COST_SUM_ALL "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_CS_PROC, "
+"  SYS_HOME_CUR, "
+"  M_CUR M_HOME_CUR "
+"where "
+"  M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_PARENT_ITEM.ITEM_CD(+) = T_ITEM_COST.PARENT_ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = to_number(?) "
+"  and T_ITEM_COST.HALF_TERM_TYP = to_number(?) "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ITEM_CD like ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = ? "
+"  and T_ITEM_COST.CS_PROC_CD like ? "
+"  and T_ITEM_COST.OUTSIDE_TYP = ? "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ITEM_CD, "
+"  T_ITEM_COST.PARENT_ITEM_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD, "
+"  T_ITEM_COST.OUTSIDE_TYP, "
+"  T_ITEM_COST.CS_PROC_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:View_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:View_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read
                        if(m_selcmd==null) throw new FoundationException("View", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:View_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read2
			if(m_selcmd==null) throw new FoundationException("View", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:View_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read3
			if(m_selcmd==null) throw new FoundationException("View", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:View_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getUPPER_ITEM_FLG());
				if(isNull(data.getUPPER_ITEM_FLG())) isNull = true;
				ary.addElement(data.getCS_PROC_CD());
				if(isNull(data.getCS_PROC_CD())) isNull = true;
				ary.addElement(data.getOUTSIDE_TYP());
				if(isNull(data.getOUTSIDE_TYP())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("View", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getUPPER_ITEM_FLG())) setString(no ++, data.getUPPER_ITEM_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCS_PROC_CD())) setString(no ++, data.getCS_PROC_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getOUTSIDE_TYP())) setString(no ++, data.getOUTSIDE_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

			data.setl_ROOT_ITEM_CD( getString(1, rs) );
			data.setl_ITEM_CD( getString(2, rs) );
			data.setl_ITEM_NAME( getString(3, rs) );
			data.setl_PARENT_ITEM_CD( getString(4, rs) );
			data.setl_PARENT_ITEM_NAME( getString(5, rs) );
			data.setl_OUTSIDE_TYP_DN( getString(6, rs) );
			data.setl_PROC_OUTSIDE_TYP_DN( getString(7, rs) );
			data.setl_CS_PROC_CD( getString(8, rs) );
			data.setl_CS_PROC_NAME( getString(9, rs) );
			data.setl_NECESSARY_QTY( getString(10, rs) );
			data.setl_STOCK_UNIT( getString(11, rs) );
			data.setl_HOME_CUR_UNIT( getString(12, rs) );
			data.setl_OWN_MATR_COST( getString(13, rs) );
			data.setl_TOTAL_SBCNT_MATR_COST( getString(14, rs) );
			data.setl_OWN_SBCNT_MATR_COST( getString(15, rs) );
			data.setl_TOTAL_MATR_COST( getString(16, rs) );
			data.setl_OWN_PROC_COST_SUM_ALL( getString(17, rs) );
			data.setl_TOTAL_PROC_COST_SUM_ALL( getString(18, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("View", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("View", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:View_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:View_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:View_clear

			return;
		}

		/**
		 * View�N���X�̕W���R���X�g���N�^
		 */
		public View()
		{
			//{{user_implement_dev:View_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:View_constractor

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
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_01) as OWN_PROC_COST_01, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_02) as OWN_PROC_COST_02, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_03) as OWN_PROC_COST_03, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_04) as OWN_PROC_COST_04, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_05) as OWN_PROC_COST_05, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_06) as OWN_PROC_COST_06, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_07) as OWN_PROC_COST_07, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_08) as OWN_PROC_COST_08, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_09) as OWN_PROC_COST_09, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_10) as OWN_PROC_COST_10, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_11) as OWN_PROC_COST_11, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_12) as OWN_PROC_COST_12, "
+"  to_char(T_ITEM_PROC_COST.OWN_PROC_COST_SUM) as OWN_PROC_COST_SUM, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_01) as TOTAL_PROC_COST_01, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_02) as TOTAL_PROC_COST_02, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_03) as TOTAL_PROC_COST_03, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_04) as TOTAL_PROC_COST_04, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_05) as TOTAL_PROC_COST_05, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_06) as TOTAL_PROC_COST_06, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_07) as TOTAL_PROC_COST_07, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_08) as TOTAL_PROC_COST_08, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_09) as TOTAL_PROC_COST_09, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_10) as TOTAL_PROC_COST_10, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_11) as TOTAL_PROC_COST_11, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_12) as TOTAL_PROC_COST_12, "
+"  to_char(T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM) as TOTAL_PROC_COST_SUM, "
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
+"  T_ITEM_COST, "
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
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = ? "
+"  and T_ITEM_COST.HALF_TERM_TYP = ? "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ITEM_CD like ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = ? "
+"  and T_ITEM_COST.CS_PROC_CD like ? "
+"  and T_ITEM_COST.OUTSIDE_TYP = ? "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ITEM_CD, "
+"  T_ITEM_COST.PARENT_ITEM_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD, "
+"  T_ITEM_COST.OUTSIDE_TYP, "
+"  T_ITEM_COST.CS_PROC_CD, "
+"  T_ITEM_PROC_COST.PROC_COST_CLS_CD";
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
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getUPPER_ITEM_FLG());
				if(isNull(data.getUPPER_ITEM_FLG())) isNull = true;
				ary.addElement(data.getCS_PROC_CD());
				if(isNull(data.getCS_PROC_CD())) isNull = true;
				ary.addElement(data.getOUTSIDE_TYP());
				if(isNull(data.getOUTSIDE_TYP())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Csv", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getUPPER_ITEM_FLG())) setString(no ++, data.getUPPER_ITEM_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCS_PROC_CD())) setString(no ++, data.getCS_PROC_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getOUTSIDE_TYP())) setString(no ++, data.getOUTSIDE_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

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
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Csv", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
	public class Pdf extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_COST.PLANT_CD as PLANT_CD, "
+"  M_PLANT.PLANT_NAME as PLANT_NAME, "
+"  T_ITEM_COST.YEAR as YEAR, "
+"  T_ITEM_COST.HALF_TERM_TYP as HALF_TERM_TYP_DN, "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  M_ROOT_ITEM.ITEM_NAME as ROOT_ITEM_NAME, "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  M_PARENT_ITEM.ITEM_NAME as PARENT_ITEM_NAME, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  T_ITEM_COST.NECESSARY_QTY as NECESSARY_QTY, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  T_ITEM_COST.PS_INPUT_RATIO as PS_INPUT_RATIO, "
+"  T_ITEM_COST.ITEM_INPUT_RATIO as ITEM_INPUT_RATIO, "
+"  T_ITEM_COST.OWN_MATR_COST as OWN_MATR_COST, "
+"  T_ITEM_COST.TOTAL_MATR_COST as TOTAL_MATR_COST, "
+"  T_ITEM_COST.OWN_SBCNT_MATR_COST as OWN_SBCNT_MATR_COST, "
+"  T_ITEM_COST.TOTAL_SBCNT_MATR_COST as TOTAL_SBCNT_MATR_COST, "
+"  T_ITEM_COST.OWN_PROC_COST_SUM_ALL as OWN_PROC_COST_SUM_ALL, "
+"  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL as TOTAL_PROC_COST_SUM_ALL, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  T_ITEM_PROC_COST.PROC_COST_CLS_CD as PROC_COST_CLS_CD, "
+"  M_PROC_COST_CLS.PROC_COST_CLS_NAME as PROC_COST_CLS_NAME, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_01 as OWN_PROC_COST_01, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_02 as OWN_PROC_COST_02, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_03 as OWN_PROC_COST_03, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_04 as OWN_PROC_COST_04, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_05 as OWN_PROC_COST_05, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_06 as OWN_PROC_COST_06, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_07 as OWN_PROC_COST_07, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_08 as OWN_PROC_COST_08, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_09 as OWN_PROC_COST_09, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_10 as OWN_PROC_COST_10, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_11 as OWN_PROC_COST_11, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_12 as OWN_PROC_COST_12, "
+"  T_ITEM_PROC_COST.OWN_PROC_COST_SUM as OWN_PROC_COST_SUM, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_01 as TOTAL_PROC_COST_01, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_02 as TOTAL_PROC_COST_02, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_03 as TOTAL_PROC_COST_03, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_04 as TOTAL_PROC_COST_04, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_05 as TOTAL_PROC_COST_05, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_06 as TOTAL_PROC_COST_06, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_07 as TOTAL_PROC_COST_07, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_08 as TOTAL_PROC_COST_08, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_09 as TOTAL_PROC_COST_09, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_10 as TOTAL_PROC_COST_10, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_11 as TOTAL_PROC_COST_11, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_12 as TOTAL_PROC_COST_12, "
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM as TOTAL_PROC_COST_SUM "
+"from "
+"  T_ITEM_COST, "
+"  T_ITEM_PROC_COST, "
+"  M_PLANT, "
+"  M_ITEM M_ROOT_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_ITEM, "
+"  M_CS_PROC, "
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
+"  and M_PROC_COST.YEAR(+) = T_ITEM_PROC_COST.YEAR "
+"  and M_PROC_COST.HALF_TERM_TYP(+) = T_ITEM_PROC_COST.HALF_TERM_TYP "
+"  and M_PROC_COST.COST_TYP(+) = T_ITEM_PROC_COST.COST_TYP "
+"  and M_PROC_COST.PLANT_CD(+) = T_ITEM_PROC_COST.PLANT_CD "
+"  and M_PROC_COST.CS_PROC_CD(+) = T_ITEM_PROC_COST.CS_PROC_CD "
+"  and M_PROC_COST.PROC_COST_CLS_CD(+) = T_ITEM_PROC_COST.PROC_COST_CLS_CD "
+"  and M_PROC_COST_CLS.PLANT_CD(+) = T_ITEM_PROC_COST.PLANT_CD "
+"  and M_PROC_COST_CLS.PROC_COST_CLS_CD(+) = T_ITEM_PROC_COST.PROC_COST_CLS_CD "
+"  and SYS_HOME_CUR.CTRL_CD = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = ? "
+"  and T_ITEM_COST.HALF_TERM_TYP = ? "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD = ? "
+"  and T_ITEM_COST.PARENT_ITEM_CD = ? "
+"  and T_ITEM_COST.ITEM_CD = ? "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ITEM_CD, "
+"  T_ITEM_COST.PARENT_ITEM_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD, "
+"  T_ITEM_COST.OUTSIDE_TYP, "
+"  T_ITEM_COST.CS_PROC_CD, "
+"  T_ITEM_PROC_COST.PROC_COST_CLS_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Pdf_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Pdf_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_read
                        if(m_selcmd==null) throw new FoundationException("Pdf", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Pdf_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_read2
			if(m_selcmd==null) throw new FoundationException("Pdf", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Pdf_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_read3
			if(m_selcmd==null) throw new FoundationException("Pdf", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Pdf_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getl_ROOT_ITEM_CD());
				if(isNull(data.getl_ROOT_ITEM_CD())) isNull = true;
				ary.addElement(data.getl_PARENT_ITEM_CD());
				if(isNull(data.getl_PARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getl_ITEM_CD());
				if(isNull(data.getl_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getYEAR(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getHALF_TERM_TYP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_ROOT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_PARENT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getl_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setPLANT_NAME( getString(2, rs) );
			data.setYEAR( getString(3, rs) );
			data.setHALF_TERM_TYP_DN( getString(4, rs) );
			data.setROOT_ITEM_CD( getString(5, rs) );
			data.setROOT_ITEM_NAME( getString(6, rs) );
			data.setPARENT_ITEM_CD( getString(7, rs) );
			data.setPARENT_ITEM_NAME( getString(8, rs) );
			data.setITEM_CD( getString(9, rs) );
			data.setITEM_NAME( getString(10, rs) );
			data.setCS_PROC_CD( getString(11, rs) );
			data.setCS_PROC_NAME( getString(12, rs) );
			data.setNECESSARY_QTY( getString(13, rs) );
			data.setSTOCK_UNIT( getString(14, rs) );
			data.setPS_INPUT_RATIO( getString(15, rs) );
			data.setITEM_INPUT_RATIO( getString(16, rs) );
			data.setOWN_MATR_COST( getString(17, rs) );
			data.setTOTAL_MATR_COST( getString(18, rs) );
			data.setOWN_SBCNT_MATR_COST( getString(19, rs) );
			data.setTOTAL_SBCNT_MATR_COST( getString(20, rs) );
			data.setOWN_PROC_COST_SUM_ALL( getString(21, rs) );
			data.setTOTAL_PROC_COST_SUM_ALL( getString(22, rs) );
			data.setHOME_CUR_UNIT( getString(23, rs) );
			data.setPROC_COST_CLS_CD( getString(24, rs) );
			data.setPROC_COST_CLS_NAME( getString(25, rs) );
			data.setOWN_PROC_COST_01( getString(26, rs) );
			data.setOWN_PROC_COST_02( getString(27, rs) );
			data.setOWN_PROC_COST_03( getString(28, rs) );
			data.setOWN_PROC_COST_04( getString(29, rs) );
			data.setOWN_PROC_COST_05( getString(30, rs) );
			data.setOWN_PROC_COST_06( getString(31, rs) );
			data.setOWN_PROC_COST_07( getString(32, rs) );
			data.setOWN_PROC_COST_08( getString(33, rs) );
			data.setOWN_PROC_COST_09( getString(34, rs) );
			data.setOWN_PROC_COST_10( getString(35, rs) );
			data.setOWN_PROC_COST_11( getString(36, rs) );
			data.setOWN_PROC_COST_12( getString(37, rs) );
			data.setOWN_PROC_COST_SUM( getString(38, rs) );
			data.setTOTAL_PROC_COST_01( getString(39, rs) );
			data.setTOTAL_PROC_COST_02( getString(40, rs) );
			data.setTOTAL_PROC_COST_03( getString(41, rs) );
			data.setTOTAL_PROC_COST_04( getString(42, rs) );
			data.setTOTAL_PROC_COST_05( getString(43, rs) );
			data.setTOTAL_PROC_COST_06( getString(44, rs) );
			data.setTOTAL_PROC_COST_07( getString(45, rs) );
			data.setTOTAL_PROC_COST_08( getString(46, rs) );
			data.setTOTAL_PROC_COST_09( getString(47, rs) );
			data.setTOTAL_PROC_COST_10( getString(48, rs) );
			data.setTOTAL_PROC_COST_11( getString(49, rs) );
			data.setTOTAL_PROC_COST_12( getString(50, rs) );
			data.setTOTAL_PROC_COST_SUM( getString(51, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Pdf", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Pdf", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Pdf_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Pdf_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Pdf_clear

			return;
		}

		/**
		 * Pdf�N���X�̕W���R���X�g���N�^
		 */
		public Pdf()
		{
			//{{user_implement_dev:Pdf_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Pdf_constractor

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
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

			data.setCURRENT_YEAR( getString(1, rs) );
			data.setHALF_TERM_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
	public class InsertITEM_COST_LIST_T extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  ITEM_COST_LIST_T(\"PRINT_USER\", \"PRINT_TIME\", \"PRINT_SQL_NUM\", \"PLANT_CD\", \"PLANT_NAME\", \"YEAR\", \"HALF_TERM_TYP\", \"ROOT_ITEM_CD\", \"ROOT_ITEM_NAME\", \"PARENT_ITEM_CD\", \"PARENT_ITEM_NAME\", \"ITEM_CD\", \"ITEM_NAME\", \"CS_PROC_CD\", \"CS_PROC_NAME\", \"NECESSARY_QTY\", \"STOCK_UNIT\", \"PS_INPUT_RATIO\", \"ITEM_INPUT_RATIO\", \"OWN_MATR_COST\", \"TOTAL_MATR_COST\", \"OWN_SBCNT_MATR_COST\", \"TOTAL_SBCNT_MATR_COST\", \"OWN_PROC_COST_SUM_ALL\", \"TOTAL_PROC_COST_SUM_ALL\", \"HOME_CUR_UNIT\", \"PROC_COST_CLS_CD\", \"PROC_COST_CLS_NAME\", \"OWN_PROC_COST_01\", \"OWN_PROC_COST_02\", \"OWN_PROC_COST_03\", \"OWN_PROC_COST_04\", \"OWN_PROC_COST_05\", \"OWN_PROC_COST_06\", \"OWN_PROC_COST_07\", \"OWN_PROC_COST_08\", \"OWN_PROC_COST_09\", \"OWN_PROC_COST_10\", \"OWN_PROC_COST_11\", \"OWN_PROC_COST_12\", \"OWN_PROC_COST_SUM\", \"TOTAL_PROC_COST_01\", \"TOTAL_PROC_COST_02\", \"TOTAL_PROC_COST_03\", \"TOTAL_PROC_COST_04\", \"TOTAL_PROC_COST_05\", \"TOTAL_PROC_COST_06\", \"TOTAL_PROC_COST_07\", \"TOTAL_PROC_COST_08\", \"TOTAL_PROC_COST_09\", \"TOTAL_PROC_COST_10\", \"TOTAL_PROC_COST_11\", \"TOTAL_PROC_COST_12\", \"TOTAL_PROC_COST_SUM\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="DD0020010";
		protected String m_sUpdateProgramName="DD0020010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:InsertITEM_COST_LIST_T_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:InsertITEM_COST_LIST_T_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getPRINT_USER(), stmt);
				setString(8, data.getPRINT_TIME(), stmt);
				setString(9, data.getPRINT_NUM(), stmt);
				setString(10, data.getPLANT_CD(), stmt);
				setString(11, data.getPLANT_NAME(), stmt);
				setString(12, data.getYEAR(), stmt);
				setString(13, data.getHALF_TERM_TYP_DN(), stmt);
				setString(14, data.getROOT_ITEM_CD(), stmt);
				setString(15, data.getROOT_ITEM_NAME(), stmt);
				setString(16, data.getPARENT_ITEM_CD(), stmt);
				setString(17, data.getPARENT_ITEM_NAME(), stmt);
				setString(18, data.getITEM_CD(), stmt);
				setString(19, data.getITEM_NAME(), stmt);
				setString(20, data.getCS_PROC_CD(), stmt);
				setString(21, data.getCS_PROC_NAME(), stmt);
				setString(22, data.getNECESSARY_QTY(), stmt);
				setString(23, data.getSTOCK_UNIT(), stmt);
				setString(24, data.getPS_INPUT_RATIO(), stmt);
				setString(25, data.getITEM_INPUT_RATIO(), stmt);
				setString(26, data.getOWN_MATR_COST(), stmt);
				setString(27, data.getTOTAL_MATR_COST(), stmt);
				setString(28, data.getOWN_SBCNT_MATR_COST(), stmt);
				setString(29, data.getTOTAL_SBCNT_MATR_COST(), stmt);
				setString(30, data.getOWN_PROC_COST_SUM_ALL(), stmt);
				setString(31, data.getTOTAL_PROC_COST_SUM_ALL(), stmt);
				setString(32, data.getHOME_CUR_UNIT(), stmt);
				setString(33, data.getPROC_COST_CLS_CD(), stmt);
				setString(34, data.getPROC_COST_CLS_NAME(), stmt);
				setString(35, data.getOWN_PROC_COST_01(), stmt);
				setString(36, data.getOWN_PROC_COST_02(), stmt);
				setString(37, data.getOWN_PROC_COST_03(), stmt);
				setString(38, data.getOWN_PROC_COST_04(), stmt);
				setString(39, data.getOWN_PROC_COST_05(), stmt);
				setString(40, data.getOWN_PROC_COST_06(), stmt);
				setString(41, data.getOWN_PROC_COST_07(), stmt);
				setString(42, data.getOWN_PROC_COST_08(), stmt);
				setString(43, data.getOWN_PROC_COST_09(), stmt);
				setString(44, data.getOWN_PROC_COST_10(), stmt);
				setString(45, data.getOWN_PROC_COST_11(), stmt);
				setString(46, data.getOWN_PROC_COST_12(), stmt);
				setString(47, data.getOWN_PROC_COST_SUM(), stmt);
				setString(48, data.getTOTAL_PROC_COST_01(), stmt);
				setString(49, data.getTOTAL_PROC_COST_02(), stmt);
				setString(50, data.getTOTAL_PROC_COST_03(), stmt);
				setString(51, data.getTOTAL_PROC_COST_04(), stmt);
				setString(52, data.getTOTAL_PROC_COST_05(), stmt);
				setString(53, data.getTOTAL_PROC_COST_06(), stmt);
				setString(54, data.getTOTAL_PROC_COST_07(), stmt);
				setString(55, data.getTOTAL_PROC_COST_08(), stmt);
				setString(56, data.getTOTAL_PROC_COST_09(), stmt);
				setString(57, data.getTOTAL_PROC_COST_10(), stmt);
				setString(58, data.getTOTAL_PROC_COST_11(), stmt);
				setString(59, data.getTOTAL_PROC_COST_12(), stmt);
				setString(60, data.getTOTAL_PROC_COST_SUM(), stmt);

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
			//{{user_implement_dev:InsertITEM_COST_LIST_T_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:InsertITEM_COST_LIST_T_clear

			return;
		}

		/**
		 * InsertITEM_COST_LIST_T�N���X�̕W���R���X�g���N�^
		 */
		public InsertITEM_COST_LIST_T()
		{
			//{{user_implement_dev:InsertITEM_COST_LIST_T_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:InsertITEM_COST_LIST_T_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class DeleteITEM_COST_LIST_T extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  ITEM_COST_LIST_T "
+"WHERE "
+"  ITEM_COST_LIST_T.PRINT_USER = ? "
+"  AND ITEM_COST_LIST_T.PRINT_TIME = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="DD0020010";
		protected String m_sUpdateProgramName="DD0020010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:DeleteITEM_COST_LIST_T_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:DeleteITEM_COST_LIST_T_def

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPRINT_USER(), stmt);
				setString(2, data.getPRINT_TIME(), stmt);

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
			//{{user_implement_dev:DeleteITEM_COST_LIST_T_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:DeleteITEM_COST_LIST_T_clear

			return;
		}

		/**
		 * DeleteITEM_COST_LIST_T�N���X�̕W���R���X�g���N�^
		 */
		public DeleteITEM_COST_LIST_T()
		{
			//{{user_implement_dev:DeleteITEM_COST_LIST_T_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:DeleteITEM_COST_LIST_T_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class ViewCnt extends DataObject
	{
		protected String m_selcmd = "select "
+" COUNT(1) "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_CS_PROC, "
+"  SYS_HOME_CUR, "
+"  M_CUR M_HOME_CUR "
+"where "
+"  M_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_PARENT_ITEM.ITEM_CD(+) = T_ITEM_COST.PARENT_ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = to_number(?) "
+"  and T_ITEM_COST.HALF_TERM_TYP = to_number(?) "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ITEM_CD like ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = ? "
+"  and T_ITEM_COST.CS_PROC_CD like ? "
+"  and T_ITEM_COST.OUTSIDE_TYP = ? "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:ViewCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:ViewCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0020010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0020010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read2
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, DD0020010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_read3
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:ViewCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0020010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getUPPER_ITEM_FLG());
				if(isNull(data.getUPPER_ITEM_FLG())) isNull = true;
				ary.addElement(data.getCS_PROC_CD());
				if(isNull(data.getCS_PROC_CD())) isNull = true;
				ary.addElement(data.getOUTSIDE_TYP());
				if(isNull(data.getOUTSIDE_TYP())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("ViewCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getUPPER_ITEM_FLG())) setString(no ++, data.getUPPER_ITEM_FLG(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCS_PROC_CD())) setString(no ++, data.getCS_PROC_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getOUTSIDE_TYP())) setString(no ++, data.getOUTSIDE_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0020010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0020010Struct data = new DD0020010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("ViewCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0020010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0020010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:ViewCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:ViewCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0020010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:ViewCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:ViewCnt_clear

			return;
		}

		/**
		 * ViewCnt�N���X�̕W���R���X�g���N�^
		 */
		public ViewCnt()
		{
			//{{user_implement_dev:ViewCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:ViewCnt_constractor

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
		mView.clear();
		mView = null;
		mCsv.clear();
		mCsv = null;
		mPdf.clear();
		mPdf = null;
		mSYS_COST_CTRL.clear();
		mSYS_COST_CTRL = null;
		mM_PLANT.clear();
		mM_PLANT = null;
		mInsertITEM_COST_LIST_T.clear();
		mInsertITEM_COST_LIST_T = null;
		mDeleteITEM_COST_LIST_T.clear();
		mDeleteITEM_COST_LIST_T = null;
		mViewCnt.clear();
		mViewCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * DD0020010�N���X�̕W���R���X�g���N�^
	 */
	public DD0020010Entity() throws FoundationException
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
