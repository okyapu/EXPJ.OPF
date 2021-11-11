/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0030/src/com/nec/jp/orteus/metamorBase/DD0030/DD0030010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0030;

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
 * CLASS     : DD0030010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class DD0030010Entity extends DataObject
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
		String m_write_fname="DD0030010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="DD0030010";

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
+"  M_ROOT_ITEM.ITEM_NAME as ROOT_ITEM_NAME, "
+"  T_ITEM_COST.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  to_char(T_ITEM_COST.NECESSARY_QTY) as NECESSARY_QTY, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  to_char(T_ITEM_COST.ITEM_INPUT_RATIO) as ITEM_INPUT_RATIO, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST + T_ITEM_COST.TOTAL_SBCNT_MATR_COST + T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_COST, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST) as TOTAL_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_SBCNT_MATR_COST) as TOTAL_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_PROC_COST_SUM_ALL "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM M_ROOT_ITEM, "
+"  M_CS_PROC, "
+"  SYS_HOME_CUR, "
+"  M_CUR M_HOME_CUR "
+"where "
+"  M_ROOT_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = to_number(?) "
+"  and T_ITEM_COST.HALF_TERM_TYP = to_number(?) "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD like ? "
+"  and T_ITEM_COST.CLASIFICATION_CD like ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = 1 "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ITEM_CD";
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_read
			if(m_selcmd==null) throw new FoundationException("View", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getCLASIFICATION_CD());
				if(isNull(data.getCLASIFICATION_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROOT_ITEM_CD())) setString(no ++, data.getROOT_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCLASIFICATION_CD())) setString(no ++, data.getCLASIFICATION_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

			data.setl_ROOT_ITEM_CD( getString(1, rs) );
			data.setl_ROOT_ITEM_NAME( getString(2, rs) );
			data.setl_CLASIFICATION_CD( getString(3, rs) );
			data.setl_CS_PROC_CD( getString(4, rs) );
			data.setl_CS_PROC_NAME( getString(5, rs) );
			data.setl_NECESSARY_QTY( getString(6, rs) );
			data.setl_STOCK_UNIT( getString(7, rs) );
			data.setl_ITEM_INPUT_RATIO( getString(8, rs) );
			data.setl_HOME_CUR_UNIT( getString(9, rs) );
			data.setl_TOTAL_COST( getString(10, rs) );
			data.setl_TOTAL_MATR_COST( getString(11, rs) );
			data.setl_TOTAL_SBCNT_MATR_COST( getString(12, rs) );
			data.setl_TOTAL_PROC_COST_SUM_ALL( getString(13, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:View_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:View_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
+"  to_char(T_ITEM_COST.UNDER_MATR_COST) as UNDER_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_MATR_COST) as TOTAL_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_SBCNT_MATR_COST) as OWN_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.UNDER_SBCNT_MATR_COST) as UNDER_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.TOTAL_SBCNT_MATR_COST) as TOTAL_SBCNT_MATR_COST, "
+"  to_char(T_ITEM_COST.OWN_PROC_COST_SUM_ALL) as OWN_PROC_COST_SUM_ALL, "
+"  to_char(T_ITEM_COST.UNDER_PROC_COST_SUM_ALL) as UNDER_PROC_COST_SUM_ALL, "
+"  to_char(T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL) as TOTAL_PROC_COST_SUM_ALL, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  to_char(T_ITEM_COST.EFF_PHASE_IN_DATE, 'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
+"  to_char(T_ITEM_COST.EFF_PHASE_OUT_DATE, 'yyyy/mm/dd') as EFF_PHASE_OUT_DATE, "
+"  to_char(T_ITEM_COST.PS_UNIT_DENOMINATOR) as PS_UNIT_DENOMINATOR, "
+"  to_char(T_ITEM_COST.PS_UNIT_NUMERATOR) as PS_UNIT_NUMERATOR, "
+"  to_char(T_ITEM_COST.PARENT_COST_STATEMENT_NO) as PARENT_COST_STATEMENT_NO, "
+"  T_ITEM_COST.PARENT_ITEM_STOCK_UNIT as PARENT_ITEM_STOCK_UNIT, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  T_ITEM_COST.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  to_char(T_ITEM_COST.OUTSIDE_TYP) as OUTSIDE_TYP, "
+"  to_char(T_ITEM_COST.PROC_OUTSIDE_TYP) as PROC_OUTSIDE_TYP, "
+"  to_char(T_ITEM_COST.DMY_ITEM_FLG) as DMY_ITEM_FLG, "
+"  to_char(T_ITEM_COST.VOLUNT_SPL_FLG) as VOLUNT_SPL_FLG, "
+"  to_char(T_ITEM_COST.COST_UP_TYP) as COST_UP_TYP, "
+"  to_char(T_ITEM_COST.ONEROUS_CONS_FLG) as ONEROUS_CONS_FLG, "
+"  to_char(T_ITEM_COST.UP_LEVEL_NO) as UP_LEVEL_NO, "
+"  to_char(T_ITEM_COST.UPPER_ITEM_FLG) as UPPER_ITEM_FLG, "
+"  to_char(T_ITEM_COST.LOWER_ITEM_FLG) as LOWER_ITEM_FLG, "
+"  to_char(T_ITEM_COST.COST_EXCLUDE_FLG) as COST_EXCLUDE_FLG, "
+"  to_char(T_ITEM_COST.CREATED_DATE, 'yyyy/mm/dd') as CREATED_DATE, "
+"  T_ITEM_COST.CREATED_BY as CREATED_BY, "
+"  T_ITEM_COST.CREATED_PRG_NM as CREATED_PRG_NM, "
+"  to_char(T_ITEM_COST.UPDATED_DATE, 'yyyy/mm/dd') as UPDATED_DATE, "
+"  T_ITEM_COST.UPDATED_BY as UPDATED_BY, "
+"  T_ITEM_COST.UPDATED_PRG_NM as UPDATED_PRG_NM, "
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
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_01) as UNDER_PROC_COST_01, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_02) as UNDER_PROC_COST_02, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_03) as UNDER_PROC_COST_03, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_04) as UNDER_PROC_COST_04, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_05) as UNDER_PROC_COST_05, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_06) as UNDER_PROC_COST_06, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_07) as UNDER_PROC_COST_07, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_08) as UNDER_PROC_COST_08, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_09) as UNDER_PROC_COST_09, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_10) as UNDER_PROC_COST_10, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_11) as UNDER_PROC_COST_11, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_12) as UNDER_PROC_COST_12, "
+"  to_char(T_ITEM_PROC_COST.UNDER_PROC_COST_SUM) as UNDER_PROC_COST_SUM, "
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
+"  SYS_COST_CTRL, "
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
+"  and SYS_COST_CTRL.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = to_number(?) "
+"  and T_ITEM_COST.HALF_TERM_TYP = to_number(?) "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD like ? "
+"  and T_ITEM_COST.CLASIFICATION_CD like ? "
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ROOT_ITEM_CD, "
+"  T_ITEM_COST.COST_STATEMENT_NO, "
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_read
			if(m_selcmd==null) throw new FoundationException("Csv", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getCLASIFICATION_CD());
				if(isNull(data.getCLASIFICATION_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROOT_ITEM_CD())) setString(no ++, data.getROOT_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCLASIFICATION_CD())) setString(no ++, data.getCLASIFICATION_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

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
			data.setUNDER_MATR_COST( getString(25, rs) );
			data.setTOTAL_MATR_COST( getString(26, rs) );
			data.setOWN_SBCNT_MATR_COST( getString(27, rs) );
			data.setUNDER_SBCNT_MATR_COST( getString(28, rs) );
			data.setTOTAL_SBCNT_MATR_COST( getString(29, rs) );
			data.setOWN_PROC_COST_SUM_ALL( getString(30, rs) );
			data.setUNDER_PROC_COST_SUM_ALL( getString(31, rs) );
			data.setTOTAL_PROC_COST_SUM_ALL( getString(32, rs) );
			data.setHOME_CUR_UNIT( getString(33, rs) );
			data.setEFF_PHASE_IN_DATE( getString(34, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(35, rs) );
			data.setPS_UNIT_DENOMINATOR( getString(36, rs) );
			data.setPS_UNIT_NUMERATOR( getString(37, rs) );
			data.setPARENT_COST_STATEMENT_NO( getString(38, rs) );
			data.setPARENT_ITEM_STOCK_UNIT( getString(39, rs) );
			data.setSTOCK_UNIT( getString(40, rs) );
			data.setCLASIFICATION_CD( getString(41, rs) );
			data.setOUTSIDE_TYP( getString(42, rs) );
			data.setPROC_OUTSIDE_TYP( getString(43, rs) );
			data.setDMY_ITEM_FLG( getString(44, rs) );
			data.setVOLUNT_SPL_FLG( getString(45, rs) );
			data.setCOST_UP_TYP( getString(46, rs) );
			data.setONEROUS_CONS_FLG( getString(47, rs) );
			data.setUP_LEVEL_NO( getString(48, rs) );
			data.setUPPER_ITEM_FLG( getString(49, rs) );
			data.setLOWER_ITEM_FLG( getString(50, rs) );
			data.setCOST_EXCLUDE_FLG( getString(51, rs) );
			data.setCREATED_DATE( getString(52, rs) );
			data.setCREATED_BY( getString(53, rs) );
			data.setCREATED_PRG_NM( getString(54, rs) );
			data.setUPDATED_DATE( getString(55, rs) );
			data.setUPDATED_BY( getString(56, rs) );
			data.setUPDATED_PRG_NM( getString(57, rs) );
			data.setPROC_COST_CLS_CD( getString(58, rs) );
			data.setPROC_COST_CLS_NAME( getString(59, rs) );
			data.setPROC_COST_UNIT_QTY( getString(60, rs) );
			data.setPROC_COST_UNIT_QTY_UNIT( getString(61, rs) );
			data.setOWN_PROC_COST_01( getString(62, rs) );
			data.setOWN_PROC_COST_02( getString(63, rs) );
			data.setOWN_PROC_COST_03( getString(64, rs) );
			data.setOWN_PROC_COST_04( getString(65, rs) );
			data.setOWN_PROC_COST_05( getString(66, rs) );
			data.setOWN_PROC_COST_06( getString(67, rs) );
			data.setOWN_PROC_COST_07( getString(68, rs) );
			data.setOWN_PROC_COST_08( getString(69, rs) );
			data.setOWN_PROC_COST_09( getString(70, rs) );
			data.setOWN_PROC_COST_10( getString(71, rs) );
			data.setOWN_PROC_COST_11( getString(72, rs) );
			data.setOWN_PROC_COST_12( getString(73, rs) );
			data.setOWN_PROC_COST_SUM( getString(74, rs) );
			data.setUNDER_PROC_COST_01( getString(75, rs) );
			data.setUNDER_PROC_COST_02( getString(76, rs) );
			data.setUNDER_PROC_COST_03( getString(77, rs) );
			data.setUNDER_PROC_COST_04( getString(78, rs) );
			data.setUNDER_PROC_COST_05( getString(79, rs) );
			data.setUNDER_PROC_COST_06( getString(80, rs) );
			data.setUNDER_PROC_COST_07( getString(81, rs) );
			data.setUNDER_PROC_COST_08( getString(82, rs) );
			data.setUNDER_PROC_COST_09( getString(83, rs) );
			data.setUNDER_PROC_COST_10( getString(84, rs) );
			data.setUNDER_PROC_COST_11( getString(85, rs) );
			data.setUNDER_PROC_COST_12( getString(86, rs) );
			data.setUNDER_PROC_COST_SUM( getString(87, rs) );
			data.setTOTAL_PROC_COST_01( getString(88, rs) );
			data.setTOTAL_PROC_COST_02( getString(89, rs) );
			data.setTOTAL_PROC_COST_03( getString(90, rs) );
			data.setTOTAL_PROC_COST_04( getString(91, rs) );
			data.setTOTAL_PROC_COST_05( getString(92, rs) );
			data.setTOTAL_PROC_COST_06( getString(93, rs) );
			data.setTOTAL_PROC_COST_07( getString(94, rs) );
			data.setTOTAL_PROC_COST_08( getString(95, rs) );
			data.setTOTAL_PROC_COST_09( getString(96, rs) );
			data.setTOTAL_PROC_COST_10( getString(97, rs) );
			data.setTOTAL_PROC_COST_11( getString(98, rs) );
			data.setTOTAL_PROC_COST_12( getString(99, rs) );
			data.setTOTAL_PROC_COST_SUM( getString(100, rs) );
			data.setPROC_COST_01_NAME( getString(101, rs) );
			data.setPROC_COST_02_NAME( getString(102, rs) );
			data.setPROC_COST_03_NAME( getString(103, rs) );
			data.setPROC_COST_04_NAME( getString(104, rs) );
			data.setPROC_COST_05_NAME( getString(105, rs) );
			data.setPROC_COST_06_NAME( getString(106, rs) );
			data.setPROC_COST_07_NAME( getString(107, rs) );
			data.setPROC_COST_08_NAME( getString(108, rs) );
			data.setPROC_COST_09_NAME( getString(109, rs) );
			data.setPROC_COST_10_NAME( getString(110, rs) );
			data.setPROC_COST_11_NAME( getString(111, rs) );
			data.setPROC_COST_12_NAME( getString(112, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Csv_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Csv_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
+"  T_ITEM_COST.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  T_ITEM_COST.ROOT_ITEM_CD as ROOT_ITEM_CD, "
+"  M_ROOT_ITEM.ITEM_NAME as ROOT_ITEM_NAME, "
+"  T_ITEM_COST.COST_STATEMENT_NO as COST_STATEMENT_NO, "
+"  T_ITEM_COST.UP_LEVEL_NO as UP_LEVEL_NO, "
+"  T_ITEM_COST.PARENT_ITEM_CD as PARENT_ITEM_CD, "
+"  M_PARENT_ITEM.ITEM_NAME as PARENT_ITEM_NAME, "
+"  T_ITEM_COST.ITEM_CD as ITEM_CD, "
+"  M_ITEM.ITEM_NAME as ITEM_NAME, "
+"  T_ITEM_COST.PS_EDITION as PS_EDITION, "
+"  T_ITEM_COST.PS_INPUT_RATIO as PS_INPUT_RATIO, "
+"  T_ITEM_COST.ITEM_INPUT_RATIO as ITEM_INPUT_RATIO, "
+"  T_ITEM_COST.NECESSARY_QTY as NECESSARY_QTY, "
+"  T_ITEM_COST.STOCK_UNIT as STOCK_UNIT, "
+"  T_ITEM_COST.PS_UNIT_DENOMINATOR as PS_UNIT_DENOMINATOR, "
+"  T_ITEM_COST.PS_UNIT_NUMERATOR as PS_UNIT_NUMERATOR, "
+"  to_char(T_ITEM_COST.EFF_PHASE_IN_DATE, 'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
+"  to_char(T_ITEM_COST.EFF_PHASE_OUT_DATE, 'yyyy/mm/dd') as EFF_PHASE_OUT_DATE, "
+"  T_ITEM_COST.OUTSIDE_TYP as OUTSIDE_TYP_DN, "
+"  T_ITEM_COST.DMY_ITEM_FLG as DMY_ITEM_FLG_DN, "
+"  T_ITEM_COST.VOLUNT_SPL_FLG as VOLUNT_SPL_FLG_DN, "
+"  T_ITEM_COST.COST_UP_TYP as COST_UP_TYP_DN, "
+"  T_ITEM_COST.UPPER_ITEM_FLG as UPPER_ITEM_FLG_DN, "
+"  T_ITEM_COST.LOWER_ITEM_FLG as LOWER_ITEM_FLG_DN, "
+"  M_CS_PUCH.ITEM_CD as PUCH_ITEM_CD, "
+"  M_CS_PUCH.CS_PROC_CD as PUCH_CS_PROC_CD, "
+"  M_CS_PUCH.VEND_CD as VEND_CD, "
+"  M_CS_PUCH.UNIT_COST as UNIT_COST, "
+"  M_CS_PUCH.UNIT_COST_TYP as UNIT_COST_TYP_DN, "
+"  M_CUR.CUR_UNIT as CUR_UNIT, "
+"  M_CS_PUCH.EXCH_RATE as EXCH_RATE, "
+"  M_CS_PUCH.UNIT_COST * M_CS_PUCH.EXCH_RATE as HOME_CUR_UNIT_COST, "
+"  nvl(M_CS_PUCH.PUCH_UNIT_QTY, 1) as PUCH_UNIT_QTY, "
+"  M_CS_PUCH.SUB_VEND_CD as SUB_VEND_CD, "
+"  M_CS_PUCH.SUB_UNIT_COST as SUB_UNIT_COST, "
+"  M_CS_PUCH.SUB_UNIT_COST_TYP as SUB_UNIT_COST_TYP_DN, "
+"  M_SUB_CUR.CUR_UNIT as SUB_CUR_UNIT, "
+"  M_CS_PUCH.SUB_EXCH_RATE as SUB_EXCH_RATE, "
+"  M_CS_PUCH.SUB_UNIT_COST * M_CS_PUCH.SUB_EXCH_RATE as SUB_HOME_CUR_UNIT_COST, "
+"  nvl(M_CS_PUCH.SUB_PUCH_UNIT_QTY, 1) as SUB_PUCH_UNIT_QTY, "
+"  M_CS_PUCH.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  M_CS_PUCH.STOCK_UNIT as PUCH_STOCK_UNIT, "
+"  M_CS_PUCH.UNIT_COST_ACCEPT_TYP as UNIT_COST_ACCEPT_TYP_DN, "
+"  M_CS_PUCH.CS_PUCH_TYP as CS_PUCH_TYP_DN, "
+"  M_CS_PUCH.ORG_CD as ORG_CD, "
+"  T_ITEM_COST.CS_PROC_CD as CS_PROC_CD, "
+"  M_CS_PROC.CS_PROC_NAME as CS_PROC_NAME, "
+"  M_CS_PROC.WS_CD as WS_CD, "
+"  M_WS.WS_NAME as WS_NAME, "
+"  T_ITEM_COST.PROC_OUTSIDE_TYP as PROC_OUTSIDE_TYP_DN, "
+"  M_CS_PROC.VEND_CD as PROC_VEND_CD, "
+"  M_CS_PROC.ORG_CD as PROC_ORG_CD, "
+"  decode(M_CS_PUCH.CS_PUCH_TYP, 1, decode(M_CS_PUCH.UNIT_COST_ACCEPT_TYP, 1, M_CS_PUCH.UNIT_COST * M_CS_PUCH.EXCH_RATE, M_CS_PUCH.SUB_UNIT_COST * M_CS_PUCH.SUB_EXCH_RATE), 0) as PUCH_UNIT_COST, "
+"  decode(M_CS_PUCH.CS_PUCH_TYP, 1, decode(M_CS_PUCH.UNIT_COST_ACCEPT_TYP, 1, M_CS_PUCH.PUCH_UNIT_QTY, M_CS_PUCH.SUB_PUCH_UNIT_QTY), 1) as PUCH_PUCH_UNIT_QTY, "
+"  T_ITEM_COST.OWN_MATR_COST as OWN_MATR_COST, "
+"  T_ITEM_COST.UNDER_MATR_COST as UNDER_MATR_COST, "
+"  T_ITEM_COST.TOTAL_MATR_COST as TOTAL_MATR_COST, "
+"  decode(M_CS_PUCH.CS_PUCH_TYP, 2, decode(M_CS_PUCH.UNIT_COST_ACCEPT_TYP, 1, M_CS_PUCH.UNIT_COST * M_CS_PUCH.EXCH_RATE, M_CS_PUCH.SUB_UNIT_COST * M_CS_PUCH.SUB_EXCH_RATE), 0) as SBCNT_UNIT_COST, "
+"  decode(M_CS_PUCH.CS_PUCH_TYP, 2, decode(M_CS_PUCH.UNIT_COST_ACCEPT_TYP, 1, M_CS_PUCH.PUCH_UNIT_QTY, M_CS_PUCH.SUB_PUCH_UNIT_QTY), 1) as SBCNT_PUCH_UNIT_QTY, "
+"  T_ITEM_COST.OWN_SBCNT_MATR_COST as OWN_SBCNT_MATR_COST, "
+"  T_ITEM_COST.UNDER_SBCNT_MATR_COST as UNDER_SBCNT_MATR_COST, "
+"  T_ITEM_COST.TOTAL_SBCNT_MATR_COST as TOTAL_SBCNT_MATR_COST, "
+"  T_ITEM_PROC_COST.PROC_COST_CLS_CD as PROC_COST_CLS_CD, "
+"  M_PROC_COST_CLS.PROC_COST_CLS_NAME as PROC_COST_CLS_NAME, "
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
+"  M_PROC_COST_CLS.PROC_COST_12_NAME as PROC_COST_12_NAME, "
+"  M_PROC_COST.PROC_COST_01 as PROC_COST_01, "
+"  M_PROC_COST.PROC_COST_02 as PROC_COST_02, "
+"  M_PROC_COST.PROC_COST_03 as PROC_COST_03, "
+"  M_PROC_COST.PROC_COST_04 as PROC_COST_04, "
+"  M_PROC_COST.PROC_COST_05 as PROC_COST_05, "
+"  M_PROC_COST.PROC_COST_06 as PROC_COST_06, "
+"  M_PROC_COST.PROC_COST_07 as PROC_COST_07, "
+"  M_PROC_COST.PROC_COST_08 as PROC_COST_08, "
+"  M_PROC_COST.PROC_COST_09 as PROC_COST_09, "
+"  M_PROC_COST.PROC_COST_10 as PROC_COST_10, "
+"  M_PROC_COST.PROC_COST_11 as PROC_COST_11, "
+"  M_PROC_COST.PROC_COST_12 as PROC_COST_12, "
+"  nvl(M_PROC_COST.PROC_COST_UNIT_QTY, 1) as PROC_COST_UNIT_QTY, "
+"  M_PROC_COST.STOCK_UNIT as PROC_COST_STOCK_UNIT, "
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
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_01 as UNDER_PROC_COST_01, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_02 as UNDER_PROC_COST_02, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_03 as UNDER_PROC_COST_03, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_04 as UNDER_PROC_COST_04, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_05 as UNDER_PROC_COST_05, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_06 as UNDER_PROC_COST_06, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_07 as UNDER_PROC_COST_07, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_08 as UNDER_PROC_COST_08, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_09 as UNDER_PROC_COST_09, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_10 as UNDER_PROC_COST_10, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_11 as UNDER_PROC_COST_11, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_12 as UNDER_PROC_COST_12, "
+"  T_ITEM_PROC_COST.UNDER_PROC_COST_SUM as UNDER_PROC_COST_SUM, "
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
+"  T_ITEM_PROC_COST.TOTAL_PROC_COST_SUM as TOTAL_PROC_COST_SUM, "
+"  T_ITEM_COST.OWN_PROC_COST_SUM_ALL as OWN_PROC_COST_SUM_ALL, "
+"  T_ITEM_COST.UNDER_PROC_COST_SUM_ALL as UNDER_PROC_COST_SUM_ALL, "
+"  T_ITEM_COST.TOTAL_PROC_COST_SUM_ALL as TOTAL_PROC_COST_SUM_ALL, "
+"  M_HOME_CUR.CUR_UNIT as HOME_CUR_UNIT, "
+"  M_CS_PUCH.CS_PUCH_TYP as CS_PUCH_TYP_VALUE "
+"from "
+"  T_ITEM_COST, "
+"  T_ITEM_PROC_COST, "
+"  M_PLANT, "
+"  M_ITEM M_ROOT_ITEM, "
+"  M_ITEM M_PARENT_ITEM, "
+"  M_ITEM, "
+"  M_CS_PROC, "
+"  M_CS_PUCH, "
+"  M_WS, "
+"  M_CUR, "
+"  M_CUR M_SUB_CUR, "
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
+"  and M_CS_PUCH.YEAR(+) = T_ITEM_COST.YEAR "
+"  and M_CS_PUCH.HALF_TERM_TYP(+) = T_ITEM_COST.HALF_TERM_TYP "
+"  and M_CS_PUCH.COST_TYP(+) = T_ITEM_COST.COST_TYP "
+"  and M_CS_PUCH.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PUCH.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_CUR.CUR_CD(+) = M_CS_PUCH.CUR_CD "
+"  and M_SUB_CUR.CUR_CD(+) = M_CS_PUCH.SUB_CUR_CD "
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
+"  and T_ITEM_COST.COST_EXCLUDE_FLG = 0 "
+"order by "
+"  T_ITEM_COST.ROOT_ITEM_CD, "
+"  T_ITEM_COST.COST_STATEMENT_NO, "
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_read
			if(m_selcmd==null) throw new FoundationException("Pdf", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Pdf", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_ROOT_ITEM_CD())) setString(no ++, data.getl_ROOT_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setPLANT_NAME( getString(2, rs) );
			data.setYEAR( getString(3, rs) );
			data.setHALF_TERM_TYP_DN( getString(4, rs) );
			data.setCLASIFICATION_CD( getString(5, rs) );
			data.setROOT_ITEM_CD( getString(6, rs) );
			data.setROOT_ITEM_NAME( getString(7, rs) );
			data.setCOST_STATEMENT_NO( getString(8, rs) );
			data.setUP_LEVEL_NO( getString(9, rs) );
			data.setPARENT_ITEM_CD( getString(10, rs) );
			data.setPARENT_ITEM_NAME( getString(11, rs) );
			data.setITEM_CD( getString(12, rs) );
			data.setITEM_NAME( getString(13, rs) );
			data.setPS_EDITION( getString(14, rs) );
			data.setPS_INPUT_RATIO( getString(15, rs) );
			data.setITEM_INPUT_RATIO( getString(16, rs) );
			data.setNECESSARY_QTY( getString(17, rs) );
			data.setSTOCK_UNIT( getString(18, rs) );
			data.setPS_UNIT_DENOMINATOR( getString(19, rs) );
			data.setPS_UNIT_NUMERATOR( getString(20, rs) );
			data.setEFF_PHASE_IN_DATE( getString(21, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(22, rs) );
			data.setOUTSIDE_TYP_DN( getString(23, rs) );
			data.setDMY_ITEM_FLG_DN( getString(24, rs) );
			data.setVOLUNT_SPL_FLG_DN( getString(25, rs) );
			data.setCOST_UP_TYP_DN( getString(26, rs) );
			data.setUPPER_ITEM_FLG_DN( getString(27, rs) );
			data.setLOWER_ITEM_FLG_DN( getString(28, rs) );
			data.setPUCH_ITEM_CD( getString(29, rs) );
			data.setPUCH_CS_PROC_CD( getString(30, rs) );
			data.setVEND_CD( getString(31, rs) );
			data.setUNIT_COST( getString(32, rs) );
			data.setUNIT_COST_TYP_DN( getString(33, rs) );
			data.setCUR_UNIT( getString(34, rs) );
			data.setEXCH_RATE( getString(35, rs) );
			data.setHOME_CUR_UNIT_COST( getString(36, rs) );
			data.setPUCH_UNIT_QTY( getString(37, rs) );
			data.setSUB_VEND_CD( getString(38, rs) );
			data.setSUB_UNIT_COST( getString(39, rs) );
			data.setSUB_UNIT_COST_TYP_DN( getString(40, rs) );
			data.setSUB_CUR_UNIT( getString(41, rs) );
			data.setSUB_EXCH_RATE( getString(42, rs) );
			data.setSUB_HOME_CUR_UNIT_COST( getString(43, rs) );
			data.setSUB_PUCH_UNIT_QTY( getString(44, rs) );
			data.setCLASIFICATION_CD( getString(45, rs) );
			data.setPUCH_STOCK_UNIT( getString(46, rs) );
			data.setUNIT_COST_ACCEPT_TYP_DN( getString(47, rs) );
			data.setCS_PUCH_TYP_DN( getString(48, rs) );
			data.setORG_CD( getString(49, rs) );
			data.setCS_PROC_CD( getString(50, rs) );
			data.setCS_PROC_NAME( getString(51, rs) );
			data.setWS_CD( getString(52, rs) );
			data.setWS_NAME( getString(53, rs) );
			data.setPROC_OUTSIDE_TYP_DN( getString(54, rs) );
			data.setPROC_VEND_CD( getString(55, rs) );
			data.setPROC_ORG_CD( getString(56, rs) );
			data.setPUCH_UNIT_COST( getString(57, rs) );
			data.setPUCH_PUCH_UNIT_QTY( getString(58, rs) );
			data.setOWN_MATR_COST( getString(59, rs) );
			data.setUNDER_MATR_COST( getString(60, rs) );
			data.setTOTAL_MATR_COST( getString(61, rs) );
			data.setSBCNT_UNIT_COST( getString(62, rs) );
			data.setSBCNT_PUCH_UNIT_QTY( getString(63, rs) );
			data.setOWN_SBCNT_MATR_COST( getString(64, rs) );
			data.setUNDER_SBCNT_MATR_COST( getString(65, rs) );
			data.setTOTAL_SBCNT_MATR_COST( getString(66, rs) );
			data.setPROC_COST_CLS_CD( getString(67, rs) );
			data.setPROC_COST_CLS_NAME( getString(68, rs) );
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
			data.setPROC_COST_01( getString(81, rs) );
			data.setPROC_COST_02( getString(82, rs) );
			data.setPROC_COST_03( getString(83, rs) );
			data.setPROC_COST_04( getString(84, rs) );
			data.setPROC_COST_05( getString(85, rs) );
			data.setPROC_COST_06( getString(86, rs) );
			data.setPROC_COST_07( getString(87, rs) );
			data.setPROC_COST_08( getString(88, rs) );
			data.setPROC_COST_09( getString(89, rs) );
			data.setPROC_COST_10( getString(90, rs) );
			data.setPROC_COST_11( getString(91, rs) );
			data.setPROC_COST_12( getString(92, rs) );
			data.setPROC_COST_UNIT_QTY( getString(93, rs) );
			data.setPROC_COST_STOCK_UNIT( getString(94, rs) );
			data.setOWN_PROC_COST_01( getString(95, rs) );
			data.setOWN_PROC_COST_02( getString(96, rs) );
			data.setOWN_PROC_COST_03( getString(97, rs) );
			data.setOWN_PROC_COST_04( getString(98, rs) );
			data.setOWN_PROC_COST_05( getString(99, rs) );
			data.setOWN_PROC_COST_06( getString(100, rs) );
			data.setOWN_PROC_COST_07( getString(101, rs) );
			data.setOWN_PROC_COST_08( getString(102, rs) );
			data.setOWN_PROC_COST_09( getString(103, rs) );
			data.setOWN_PROC_COST_10( getString(104, rs) );
			data.setOWN_PROC_COST_11( getString(105, rs) );
			data.setOWN_PROC_COST_12( getString(106, rs) );
			data.setOWN_PROC_COST_SUM( getString(107, rs) );
			data.setUNDER_PROC_COST_01( getString(108, rs) );
			data.setUNDER_PROC_COST_02( getString(109, rs) );
			data.setUNDER_PROC_COST_03( getString(110, rs) );
			data.setUNDER_PROC_COST_04( getString(111, rs) );
			data.setUNDER_PROC_COST_05( getString(112, rs) );
			data.setUNDER_PROC_COST_06( getString(113, rs) );
			data.setUNDER_PROC_COST_07( getString(114, rs) );
			data.setUNDER_PROC_COST_08( getString(115, rs) );
			data.setUNDER_PROC_COST_09( getString(116, rs) );
			data.setUNDER_PROC_COST_10( getString(117, rs) );
			data.setUNDER_PROC_COST_11( getString(118, rs) );
			data.setUNDER_PROC_COST_12( getString(119, rs) );
			data.setUNDER_PROC_COST_SUM( getString(120, rs) );
			data.setTOTAL_PROC_COST_01( getString(121, rs) );
			data.setTOTAL_PROC_COST_02( getString(122, rs) );
			data.setTOTAL_PROC_COST_03( getString(123, rs) );
			data.setTOTAL_PROC_COST_04( getString(124, rs) );
			data.setTOTAL_PROC_COST_05( getString(125, rs) );
			data.setTOTAL_PROC_COST_06( getString(126, rs) );
			data.setTOTAL_PROC_COST_07( getString(127, rs) );
			data.setTOTAL_PROC_COST_08( getString(128, rs) );
			data.setTOTAL_PROC_COST_09( getString(129, rs) );
			data.setTOTAL_PROC_COST_10( getString(130, rs) );
			data.setTOTAL_PROC_COST_11( getString(131, rs) );
			data.setTOTAL_PROC_COST_12( getString(132, rs) );
			data.setTOTAL_PROC_COST_SUM( getString(133, rs) );
			data.setOWN_PROC_COST_SUM_ALL( getString(134, rs) );
			data.setUNDER_PROC_COST_SUM_ALL( getString(135, rs) );
			data.setTOTAL_PROC_COST_SUM_ALL( getString(136, rs) );
			data.setHOME_CUR_UNIT( getString(137, rs) );
			data.setCS_PUCH_TYP_VALUE( getString(138, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Pdf", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Pdf_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Pdf_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_read
			if(m_selcmd==null) throw new FoundationException("SYS_COST_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

			data.setCURRENT_YEAR( getString(1, rs) );
			data.setHALF_TERM_TYP( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_COST_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_COST_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
	public class ViewCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  T_ITEM_COST, "
+"  M_ITEM M_ROOT_ITEM, "
+"  M_CS_PROC, "
+"  SYS_HOME_CUR, "
+"  M_CUR M_HOME_CUR "
+"where "
+"  M_ROOT_ITEM.ITEM_CD(+) = T_ITEM_COST.ITEM_CD "
+"  and M_CS_PROC.PLANT_CD(+) = T_ITEM_COST.PLANT_CD "
+"  and M_CS_PROC.CS_PROC_CD(+) = T_ITEM_COST.CS_PROC_CD "
+"  and SYS_HOME_CUR.CTRL_CD(+) = 'SYSTEM' "
+"  and M_HOME_CUR.CUR_CD(+) = SYS_HOME_CUR.HOME_CUR_CD "
+"  and T_ITEM_COST.PLANT_CD = ? "
+"  and T_ITEM_COST.YEAR = to_number(?) "
+"  and T_ITEM_COST.HALF_TERM_TYP = to_number(?) "
+"  and T_ITEM_COST.COST_TYP = 1 "
+"  and T_ITEM_COST.ROOT_ITEM_CD like ? "
+"  and T_ITEM_COST.CLASIFICATION_CD like ? "
+"  and T_ITEM_COST.UPPER_ITEM_FLG = 1 "
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
		public List read(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, DD0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, DD0030010Struct data, String replaceStr)
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
		public List read(Connection conn, DD0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, DD0030010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getCLASIFICATION_CD());
				if(isNull(data.getCLASIFICATION_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getYEAR())) setString(no ++, data.getYEAR(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getHALF_TERM_TYP())) setString(no ++, data.getHALF_TERM_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROOT_ITEM_CD())) setString(no ++, data.getROOT_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCLASIFICATION_CD())) setString(no ++, data.getCLASIFICATION_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public DD0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			DD0030010Struct data = new DD0030010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, DD0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, DD0030010Struct data) throws FoundationException, SQLException
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
	 * DD0030010�N���X�̕W���R���X�g���N�^
	 */
	public DD0030010Entity() throws FoundationException
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
