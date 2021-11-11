/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0050/src/com/nec/jp/orteus/metamorBase/KU0050/KU0050010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0050;

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

public class KU0050010Entity extends DataObject
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

	// selectT_SHIP_ODR�N���X �C���X�^���X
	public selectT_SHIP_ODR mselectT_SHIP_ODR = new selectT_SHIP_ODR();

	// selectT_ANS_DLV_DATE�N���X �C���X�^���X
	public selectT_ANS_DLV_DATE mselectT_ANS_DLV_DATE = new selectT_ANS_DLV_DATE();

	// getCompanyInfo�N���X �C���X�^���X
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();

	// selectT_UN_SHIP_LIST�N���X �C���X�^���X
	public selectT_UN_SHIP_LIST mselectT_UN_SHIP_LIST = new selectT_UN_SHIP_LIST();

	// selectT_SHIP_ODRCnt�N���X �C���X�^���X
	public selectT_SHIP_ODRCnt mselectT_SHIP_ODRCnt = new selectT_SHIP_ODRCnt();

	// selectT_ANS_DLV_DATECnt�N���X �C���X�^���X
	public selectT_ANS_DLV_DATECnt mselectT_ANS_DLV_DATECnt = new selectT_ANS_DLV_DATECnt();

	// selectT_UN_SHIP_LISTCnt�N���X �C���X�^���X
	public selectT_UN_SHIP_LISTCnt mselectT_UN_SHIP_LISTCnt = new selectT_UN_SHIP_LISTCnt();

	// selectT_ANS_DLV_DATE_COMPILECnt�N���X �C���X�^���X
	public selectT_ANS_DLV_DATE_COMPILECnt mselectT_ANS_DLV_DATE_COMPILECnt = new selectT_ANS_DLV_DATE_COMPILECnt();

	// selectT_ANS_DLV_DATE_COMPLIE�N���X �C���X�^���X
	public selectT_ANS_DLV_DATE_COMPLIE mselectT_ANS_DLV_DATE_COMPLIE = new selectT_ANS_DLV_DATE_COMPLIE();


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
		String m_write_fname="KU0050010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="KU0050010";

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
	public class selectT_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  a.\"CUST_CD\" as \"CUST_CD\", "
+"  a.\"ITEM_CD\" as \"ITEM_CD\", "
+"  a.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  a.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  TO_CHAR(a.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"SHIP_DATE\", "
+"  a.\"SLIP_CD\" as \"SLIP_CD\", "
+"  a.\"SHIP_ODR_NO\" as \"SHIP_ODR_NO\", "
+"  a.\"DLV_KEY_NO\" as \"DLV_KEY_NO\", "
+"  a.\"SHIP_QTY\" as \"SHIP_QTY\", "
+"  a.\"ALLCT_WH_CD\" as \"ALLCT_WH_CD\", "
+"  a.\"ODR_NO\" as \"ODR_NO\", "
+"  a.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  a.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  a.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  a.DEPO_TYP as \"DEPO_TYP\", "
+"  b.\"DLV_LOC_NAME\" as \"REMARKS\", "
+"  M_CUST.CUST_NAME, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  M_WH.WH_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  null as \"LOT_NO\" "
+"from "
+"  T_SHIP_ODR a, "
+"  ( "
+"    SELECT "
+"      COMPANY_CD, "
+"      CUST_CD, "
+"      DLV_LOC_CD, "
+"      DLV_LOC_NAME "
+"    FROM "
+"      M_CUST_BASE "
+"  ) b, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH "
+"where "
+"  a.DEPO_TRANSFER_PROC_FLG = 0 "
+"  and a.DEL_FLG = '0' "
+"  and a.SHP_CMPLT_FLG = '0' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and a.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.CUST_ODR_NO like ? "
+"  and b.COMPANY_CD(+) = ? "
+"  and b.CUST_CD(+) = a.CUST_CD "
+"  and b.DLV_LOC_CD(+) = a.DLV_LOC_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and a.ALLCT_WH_CD = M_WH.WH_CD "
+"  and a.UPDATED_BY = ? "
+"order by "
+"  a.\"CUST_CD\", "
+"  a.\"ITEM_CD\", "
+"  a.\"DESINATED_SHIP_DATE\", "
+"  a.\"ALLCT_WH_CD\", "
+"  a.\"ODR_NO\", "
+"  a.\"PART_DLV_SEQ_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SHIP_ODR_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SHIP_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_read
                        if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_SHIP_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SHIP_ODR", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getstrCOMPANY_CD())) setString(no ++, data.getstrCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setCUST_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setJOB_ODR_CD( getString(3, rs) );
			data.setCUST_ITEM_CD( getString(4, rs) );
			data.setSHIP_DATE( getString(5, rs) );
			data.setSLIP_CD( getString(6, rs) );
			data.setSHIP_ODR_NO( getString(7, rs) );
			data.setDLV_KEY_NO( getString(8, rs) );
			data.setSHIP_QTY( getString(9, rs) );
			data.setALLCT_WH_CD( getString(10, rs) );
			data.setODR_NO( getString(11, rs) );
			data.setPART_DLV_SEQ_NO( getString(12, rs) );
			data.setCUST_ODR_NO( getString(13, rs) );
			data.setDLV_LOC_CD( getString(14, rs) );
			data.setDEPO_TYP( getString(15, rs) );
			data.setREMARKS( getString(16, rs) );
			data.setCUST_NAME( getString(17, rs) );
			data.setITEM_NAME( getString(18, rs) );
			data.setCUST_ITEM_NAME( getString(19, rs) );
			data.setWH_NAME( getString(20, rs) );
			data.setUNIT( getString(21, rs) );
			data.setLOT_NO( getString(22, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectT_SHIP_ODR", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_SHIP_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SHIP_ODR_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODR_clear

			return;
		}

		/**
		 * selectT_SHIP_ODR�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SHIP_ODR()
		{
			//{{user_implement_dev:selectT_SHIP_ODR_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_ANS_DLV_DATE extends DataObject
	{
		protected String m_selcmd = "select "
+"  a.\"CUST_CD\" as \"CUST_CD\", "
+"  a.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  a.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  TO_CHAR(b.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"DESINATED_SHIP_DATE\", "
+"  '' as \"SLIP_CD\", "
+"  b.\"REST_SHIP_ODR_QTY\" as \"SHIP_QTY\", "
+"  '' as \"ALLCT_WH_CD\", "
+"  b.\"ODR_NO\" as \"ODR_NO\", "
+"  b.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  c.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  c.DEPO_TYP as \"DEPO_TYP\", "
+"  '' as \"REMARKS\", "
+"  M_CUST.CUST_NAME, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  '' as WH_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  null as \"LOT_NO\" "
+"from "
+"  T_ODR_CTL a, "
+"  T_ANS_DLV_DATE b, "
+"  T_ODR c, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  T_JOB_ODR_ODR_ALC M "
+"where "
+"  b.ODR_NO = c.ODR_NO "
+"  and c.ODR_CTL_NO = a.ODR_CTL_NO "
+"  and b.SHIP_ODR_CMPLT_FLG = '0' "
+"  and a.DEL_FLG = '0' "
+"  and b.DEL_FLG = '0' "
+"  and c.DEL_FLG = '0' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and b.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and b.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and c.CUST_ODR_NO like ? "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and b.odr_no = M.odr_no(+) "
+"order by "
+"  a.\"CUST_CD\", "
+"  a.\"ITEM_CD\", "
+"  c.\"DESINATED_DLV_DATE\", "
+"  b.\"ODR_NO\", "
+"  b.\"PART_DLV_SEQ_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_ANS_DLV_DATE_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_ANS_DLV_DATE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_read
                        if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_read2
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_read3
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_ANS_DLV_DATE", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setCUST_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setJOB_ODR_CD( getString(3, rs) );
			data.setCUST_ITEM_CD( getString(4, rs) );
			data.setSHIP_DATE( getString(5, rs) );
			data.setSLIP_CD( getString(6, rs) );
			data.setSHIP_QTY( getString(7, rs) );
			data.setALLCT_WH_CD( getString(8, rs) );
			data.setODR_NO( getString(9, rs) );
			data.setPART_DLV_SEQ_NO( getString(10, rs) );
			data.setCUST_ODR_NO( getString(11, rs) );
			data.setDEPO_TYP( getString(12, rs) );
			data.setREMARKS( getString(13, rs) );
			data.setCUST_NAME( getString(14, rs) );
			data.setITEM_NAME( getString(15, rs) );
			data.setCUST_ITEM_NAME( getString(16, rs) );
			data.setWH_NAME( getString(17, rs) );
			data.setUNIT( getString(18, rs) );
			data.setLOT_NO( getString(19, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectT_ANS_DLV_DATE", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_ANS_DLV_DATE_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_clear

			return;
		}

		/**
		 * selectT_ANS_DLV_DATE�N���X�̕W���R���X�g���N�^
		 */
		public selectT_ANS_DLV_DATE()
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getCompanyInfo extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" as \"COMPANY_CD\" "
+"from "
+"  SYS_MY_COMPANY "
+"where "
+"  SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getCompanyInfo_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getCompanyInfo_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read
                        if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getCompanyInfo_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read2
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getCompanyInfo_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read3
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getCompanyInfo_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setstrCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("getCompanyInfo", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getCompanyInfo_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getCompanyInfo_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getCompanyInfo_clear

			return;
		}

		/**
		 * getCompanyInfo�N���X�̕W���R���X�g���N�^
		 */
		public getCompanyInfo()
		{
			//{{user_implement_dev:getCompanyInfo_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getCompanyInfo_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_UN_SHIP_LIST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.\"CUST_CD\" AS \"CUST_CD\", "
+"  M.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  E.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  A.\"CUST_ITEM_CD\" AS \"CUST_ITEM_CD\", "
+"  TO_CHAR(B.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') AS \"SHIP_DATE\", "
+"  '' AS \"SLIP_CD\", "
+"  M.\"UN_SHIP_QTY\" AS \"SHIP_QTY\", "
+"  M.\"WH_CD\" AS \"ALLCT_WH_CD\", "
+"  B.\"ODR_NO\" AS \"ODR_NO\", "
+"  B.\"PART_DLV_SEQ_NO\" AS \"PART_DLV_SEQ_NO\", "
+"  C.\"CUST_ODR_NO\" AS \"CUST_ODR_NO\", "
+"  C.DEPO_TYP AS \"DEPO_TYP\", "
+"  M.\"UN_SHIP_RSN\" AS \"REMARKS\", "
+"  M_CUST.CUST_NAME, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  M_WH.WH_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  null as LOT_NO "
+"FROM "
+"  T_ODR_CTL A, "
+"  T_ANS_DLV_DATE B, "
+"  T_ODR C, "
+"  T_UN_SHIP_LIST M, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH, "
+"  T_JOB_ODR_ODR_ALC E "
+"WHERE "
+"  M.ACPT_ODR_CD = C.ODR_NO "
+"  AND C.ODR_CTL_NO = A.ODR_CTL_NO "
+"  AND A.DEL_FLG = '0' "
+"  AND B.DEL_FLG = '0' "
+"  AND C.DEL_FLG = '0' "
+"  AND M.DEL_FLG = '0' "
+"  AND M.ACPT_ODR_CD = B.ODR_NO "
+"  AND M.PART_DLV_SEQ_NO = B.PART_DLV_SEQ_NO "
+"  AND M.CUST_CD LIKE ? "
+"  AND M.ITEM_CD LIKE ? "
+"  AND A.CUST_ITEM_CD LIKE ? "
+"  AND B.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND B.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND C.CUST_ODR_NO LIKE ? "
+"  AND SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  AND SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND M.CUST_CD = M_CUST.CUST_CD "
+"  AND M.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  AND M.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  AND A.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  AND M.WH_CD = M_WH.WH_CD "
+"  AND M.UPDATED_BY = ? "
+"  AND C.ODR_NO = E.ODR_NO(+) "
+"  AND B.SHIP_ODR_CMPLT_FLG = 0 "
+"ORDER BY "
+"  M.\"CUST_CD\", "
+"  M.\"ITEM_CD\", "
+"  B.\"DESINATED_SHIP_DATE\", "
+"  M.\"WH_CD\", "
+"  B.\"ODR_NO\", "
+"  B.\"PART_DLV_SEQ_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_UN_SHIP_LIST_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_UN_SHIP_LIST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LIST_read
                        if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LIST", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LIST_read2
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LIST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LIST_read3
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LIST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_UN_SHIP_LIST", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setCUST_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setJOB_ODR_CD( getString(3, rs) );
			data.setCUST_ITEM_CD( getString(4, rs) );
			data.setSHIP_DATE( getString(5, rs) );
			data.setSLIP_CD( getString(6, rs) );
			data.setSHIP_QTY( getString(7, rs) );
			data.setALLCT_WH_CD( getString(8, rs) );
			data.setODR_NO( getString(9, rs) );
			data.setPART_DLV_SEQ_NO( getString(10, rs) );
			data.setCUST_ODR_NO( getString(11, rs) );
			data.setDEPO_TYP( getString(12, rs) );
			data.setREMARKS( getString(13, rs) );
			data.setCUST_NAME( getString(14, rs) );
			data.setITEM_NAME( getString(15, rs) );
			data.setCUST_ITEM_NAME( getString(16, rs) );
			data.setWH_NAME( getString(17, rs) );
			data.setUNIT( getString(18, rs) );
			data.setLOT_NO( getString(19, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LIST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LIST_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectT_UN_SHIP_LIST", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_UN_SHIP_LIST_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_clear

			return;
		}

		/**
		 * selectT_UN_SHIP_LIST�N���X�̕W���R���X�g���N�^
		 */
		public selectT_UN_SHIP_LIST()
		{
			//{{user_implement_dev:selectT_UN_SHIP_LIST_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_UN_SHIP_LIST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SHIP_ODRCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_SHIP_ODR a, "
+"  ( "
+"    SELECT "
+"      COMPANY_CD, "
+"      CUST_CD, "
+"      DLV_LOC_CD, "
+"      DLV_LOC_NAME "
+"    FROM "
+"      M_CUST_BASE "
+"  ) b, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH "
+"where "
+"  a.DEPO_TRANSFER_PROC_FLG = 0 "
+"  and a.DEL_FLG = '0' "
+"  and a.SHP_CMPLT_FLG = '0' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and a.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.CUST_ODR_NO like ? "
+"  and b.COMPANY_CD(+) = ? "
+"  and b.CUST_CD(+) = a.CUST_CD "
+"  and b.DLV_LOC_CD(+) = a.DLV_LOC_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and a.ALLCT_WH_CD = M_WH.WH_CD "
+"  and a.UPDATED_BY = ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SHIP_ODRCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SHIP_ODRCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODRCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODRCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODRCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODRCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODRCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODRCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_SHIP_ODRCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getstrCOMPANY_CD())) setString(no ++, data.getstrCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODRCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODRCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SHIP_ODRCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_clear

			return;
		}

		/**
		 * selectT_SHIP_ODRCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SHIP_ODRCnt()
		{
			//{{user_implement_dev:selectT_SHIP_ODRCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODRCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_ANS_DLV_DATECnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_ODR_CTL a, "
+"  T_ANS_DLV_DATE b, "
+"  T_ODR c, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  T_JOB_ODR_ODR_ALC "
+"where "
+"  b.ODR_NO = c.ODR_NO "
+"  and c.ODR_CTL_NO = a.ODR_CTL_NO "
+"  and b.SHIP_ODR_CMPLT_FLG = '0' "
+"  and a.DEL_FLG = '0' "
+"  and b.DEL_FLG = '0' "
+"  and c.DEL_FLG = '0' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and b.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and b.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and c.CUST_ODR_NO like ? "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and b.odr_no = T_JOB_ODR_ODR_ALC.odr_no(+) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_ANS_DLV_DATECnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_ANS_DLV_DATECnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATECnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_ANS_DLV_DATECnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATECnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_clear

			return;
		}

		/**
		 * selectT_ANS_DLV_DATECnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_ANS_DLV_DATECnt()
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATECnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATECnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_UN_SHIP_LISTCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  T_ODR_CTL A, "
+"  T_ANS_DLV_DATE B, "
+"  T_ODR C, "
+"  T_UN_SHIP_LIST M, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH, "
+"  T_JOB_ODR_ODR_ALC E "
+"WHERE "
+"  M.ACPT_ODR_CD = C.ODR_NO "
+"  AND C.ODR_CTL_NO = A.ODR_CTL_NO "
+"  AND A.DEL_FLG = '0' "
+"  AND B.DEL_FLG = '0' "
+"  AND C.DEL_FLG = '0' "
+"  AND M.DEL_FLG = '0' "
+"  AND M.ACPT_ODR_CD = B.ODR_NO "
+"  AND M.PART_DLV_SEQ_NO = B.PART_DLV_SEQ_NO "
+"  AND M.CUST_CD LIKE ? "
+"  AND M.ITEM_CD LIKE ? "
+"  AND A.CUST_ITEM_CD LIKE ? "
+"  AND B.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND B.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  AND C.CUST_ODR_NO LIKE ? "
+"  AND SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  AND SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  AND M.CUST_CD = M_CUST.CUST_CD "
+"  AND M.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  AND M.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  AND A.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  AND M.WH_CD = M_WH.WH_CD "
+"  AND M.UPDATED_BY = ? "
+"  AND C.ODR_NO = E.ODR_NO(+) "
+"  AND B.SHIP_ODR_CMPLT_FLG = 0 "
+"  AND ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LISTCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LISTCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LISTCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_UN_SHIP_LISTCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_UN_SHIP_LISTCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_clear

			return;
		}

		/**
		 * selectT_UN_SHIP_LISTCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_UN_SHIP_LISTCnt()
		{
			//{{user_implement_dev:selectT_UN_SHIP_LISTCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_UN_SHIP_LISTCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_ANS_DLV_DATE_COMPILECnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_SHIP_ODR a, "
+"  ( "
+"    SELECT "
+"      COMPANY_CD, "
+"      CUST_CD, "
+"      DLV_LOC_CD, "
+"      DLV_LOC_NAME "
+"    FROM "
+"      M_CUST_BASE "
+"  ) b, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH, "
+"  T_SHIP_INST c, "
+"  T_SHIP d "
+"where "
+"  a.DEPO_TRANSFER_PROC_FLG = 0 "
+"  and a.DEL_FLG = '0' "
+"  and a.SHP_CMPLT_FLG = '1' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and a.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.CUST_ODR_NO like ? "
+"  and b.COMPANY_CD(+) = ? "
+"  and d.SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and d.SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and b.CUST_CD(+) = a.CUST_CD "
+"  and b.DLV_LOC_CD(+) = a.DLV_LOC_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and a.ALLCT_WH_CD = M_WH.WH_CD "
+"  and a.UPDATED_BY = ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1 "
+"  and c.LOT_NO like ? "
+"  and d.SHIP_SEQ_NO = c.SHIP_SEQ_NO(+) "
+"  and a.SHIP_ODR_NO = d.SHIP_ODR_NO "
+"  and d.DEL_FLG = '0'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPILECnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPILECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPILECnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getFROM_SHIP_DATE());
				if(isNull(data.getFROM_SHIP_DATE())) isNull = true;
				ary.addElement(data.getTO_SHIP_DATE());
				if(isNull(data.getTO_SHIP_DATE())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_ANS_DLV_DATE_COMPILECnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getstrCOMPANY_CD())) setString(no ++, data.getstrCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SHIP_DATE())) setString(no ++, data.getFROM_SHIP_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SHIP_DATE())) setString(no ++, data.getTO_SHIP_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPILECnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_clear

			return;
		}

		/**
		 * selectT_ANS_DLV_DATE_COMPILECnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_ANS_DLV_DATE_COMPILECnt()
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPILECnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_ANS_DLV_DATE_COMPLIE extends DataObject
	{
		protected String m_selcmd = "select "
+"  a.\"CUST_CD\" as \"CUST_CD\", "
+"  a.\"ITEM_CD\" as \"ITEM_CD\", "
+"  a.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  a.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  TO_CHAR(a.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') as \"SHIP_DATE\", "
+"  a.\"SLIP_CD\" as \"SLIP_CD\", "
+"  a.\"SHIP_ODR_NO\" as \"SHIP_ODR_NO\", "
+"  a.\"DLV_KEY_NO\" as \"DLV_KEY_NO\", "
+"  a.\"SHIP_QTY\" as \"SHIP_QTY\", "
+"  a.\"ALLCT_WH_CD\" as \"ALLCT_WH_CD\", "
+"  a.\"ODR_NO\" as \"ODR_NO\", "
+"  a.\"PART_DLV_SEQ_NO\" as \"PART_DLV_SEQ_NO\", "
+"  a.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  a.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  a.DEPO_TYP as \"DEPO_TYP\", "
+"  b.\"DLV_LOC_NAME\" as \"REMARKS\", "
+"  M_CUST.CUST_NAME, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  M_WH.WH_NAME, "
+"  M_ITEM.STOCK_UNIT, "
+"  c.LOT_NO, "
+"  TO_CHAR(d.SHIP_DATE, 'YYYY/MM/DD') as T_SHIP_DATE "
+"from "
+"  T_SHIP_ODR a, "
+"  ( "
+"    SELECT "
+"      COMPANY_CD, "
+"      CUST_CD, "
+"      DLV_LOC_CD, "
+"      DLV_LOC_NAME "
+"    FROM "
+"      M_CUST_BASE "
+"  ) b, "
+"  SYS_MY_COMPANY, "
+"  M_CUST, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  M_WH, "
+"  T_SHIP_INST c, "
+"  T_SHIP d "
+"where "
+"  a.DEPO_TRANSFER_PROC_FLG = 0 "
+"  and a.DEL_FLG = '0' "
+"  and a.SHP_CMPLT_FLG = '1' "
+"  and a.CUST_CD like ? "
+"  and a.ITEM_CD like ? "
+"  and a.CUST_ITEM_CD like ? "
+"  and a.DESINATED_SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.DESINATED_SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and a.CUST_ODR_NO like ? "
+"  and b.COMPANY_CD(+) = ? "
+"  and d.SHIP_DATE >= TO_DATE(?, 'YYYY/MM/DD') "
+"  and d.SHIP_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
+"  and b.CUST_CD(+) = a.CUST_CD "
+"  and b.DLV_LOC_CD(+) = a.DLV_LOC_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_CUST.COMPANY_CD "
+"  and a.CUST_CD = M_CUST.CUST_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD "
+"  and SYS_MY_COMPANY.COMPANY_CD = M_ITEM_SPEC.COMPANY_CD "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD "
+"  and a.ALLCT_WH_CD = M_WH.WH_CD "
+"  and d.SHIP_SEQ_NO = c.SHIP_SEQ_NO(+) "
+"  and c.LOT_NO like ? "
+"  and a.SHIP_ODR_NO = d.SHIP_ODR_NO "
+"  and d.DEL_FLG = '0' "
+"  and a.updated_by = ? "
+"order by "
+"  a.\"CUST_CD\", "
+"  a.\"ITEM_CD\", "
+"  a.\"DESINATED_SHIP_DATE\", "
+"  a.\"ALLCT_WH_CD\", "
+"  a.\"ODR_NO\", "
+"  a.\"PART_DLV_SEQ_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPLIE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read2
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPLIE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read3
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPLIE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_ITEM_CD());
				if(isNull(data.getIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getFROM_SEARCH_DATE());
				if(isNull(data.getFROM_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getTO_SEARCH_DATE());
				if(isNull(data.getTO_SEARCH_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getFROM_SHIP_DATE());
				if(isNull(data.getFROM_SHIP_DATE())) isNull = true;
				ary.addElement(data.getTO_SHIP_DATE());
				if(isNull(data.getTO_SHIP_DATE())) isNull = true;
				ary.addElement(data.getIN_LOT_NO());
				if(isNull(data.getIN_LOT_NO())) isNull = true;
				ary.addElement(data.getw_USER_CD());
				if(isNull(data.getw_USER_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_ANS_DLV_DATE_COMPLIE", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ITEM_CD())) setString(no ++, data.getIN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SEARCH_DATE())) setString(no ++, data.getFROM_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SEARCH_DATE())) setString(no ++, data.getTO_SEARCH_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getstrCOMPANY_CD())) setString(no ++, data.getstrCOMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_SHIP_DATE())) setString(no ++, data.getFROM_SHIP_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_SHIP_DATE())) setString(no ++, data.getTO_SHIP_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_LOT_NO())) setString(no ++, data.getIN_LOT_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getw_USER_CD())) setString(no ++, data.getw_USER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0050010Struct data = new KU0050010Struct();

			data.setCUST_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setJOB_ODR_CD( getString(3, rs) );
			data.setCUST_ITEM_CD( getString(4, rs) );
			data.setSHIP_DATE( getString(5, rs) );
			data.setSLIP_CD( getString(6, rs) );
			data.setSHIP_ODR_NO( getString(7, rs) );
			data.setDLV_KEY_NO( getString(8, rs) );
			data.setSHIP_QTY( getString(9, rs) );
			data.setALLCT_WH_CD( getString(10, rs) );
			data.setODR_NO( getString(11, rs) );
			data.setPART_DLV_SEQ_NO( getString(12, rs) );
			data.setCUST_ODR_NO( getString(13, rs) );
			data.setDLV_LOC_CD( getString(14, rs) );
			data.setDEPO_TYP( getString(15, rs) );
			data.setREMARKS( getString(16, rs) );
			data.setCUST_NAME( getString(17, rs) );
			data.setITEM_NAME( getString(18, rs) );
			data.setCUST_ITEM_NAME( getString(19, rs) );
			data.setWH_NAME( getString(20, rs) );
			data.setUNIT( getString(21, rs) );
			data.setLOT_NO( getString(22, rs) );
			data.setT_SHIP_DATE( getString(23, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_ANS_DLV_DATE_COMPLIE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_clear

			return;
		}

		/**
		 * selectT_ANS_DLV_DATE_COMPLIE�N���X�̕W���R���X�g���N�^
		 */
		public selectT_ANS_DLV_DATE_COMPLIE()
		{
			//{{user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_ANS_DLV_DATE_COMPLIE_constractor

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
		mselectT_SHIP_ODR.clear();
		mselectT_SHIP_ODR = null;
		mselectT_ANS_DLV_DATE.clear();
		mselectT_ANS_DLV_DATE = null;
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		mselectT_UN_SHIP_LIST.clear();
		mselectT_UN_SHIP_LIST = null;
		mselectT_SHIP_ODRCnt.clear();
		mselectT_SHIP_ODRCnt = null;
		mselectT_ANS_DLV_DATECnt.clear();
		mselectT_ANS_DLV_DATECnt = null;
		mselectT_UN_SHIP_LISTCnt.clear();
		mselectT_UN_SHIP_LISTCnt = null;
		mselectT_ANS_DLV_DATE_COMPILECnt.clear();
		mselectT_ANS_DLV_DATE_COMPILECnt = null;
		mselectT_ANS_DLV_DATE_COMPLIE.clear();
		mselectT_ANS_DLV_DATE_COMPLIE = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * KU0050010�N���X�̕W���R���X�g���N�^
	 */
	public KU0050010Entity() throws FoundationException
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
