/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

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
 * CLASS     : KM0040010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class KM0040010Entity extends DataObject
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

	// selectT_PROJECE_ESTIMATE�N���X �C���X�^���X
	public selectT_PROJECE_ESTIMATE mselectT_PROJECE_ESTIMATE = new selectT_PROJECE_ESTIMATE();

	// selectT_PROJECE_ESTIMATE1�N���X �C���X�^���X
	public selectT_PROJECE_ESTIMATE1 mselectT_PROJECE_ESTIMATE1 = new selectT_PROJECE_ESTIMATE1();

	// getCompanyInfo�N���X �C���X�^���X
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();


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
		String m_write_fname="KM0040010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="KM0040010";

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
	public class selectT_PROJECE_ESTIMATE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ESTIMATE_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ESTIMATE_DATE) <= TO_DATE(?) "
+"      AND(PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ? "
+"      OR  PROJECT_STAT = ?) "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND PROJECT_STAT = ? "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) "
+"ORDER BY "
+"  PROJECT_CD, "
+"  ESTIMATE_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_PROJECE_ESTIMATE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_PROJECE_ESTIMATE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read2
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_read3
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getInC1_PROJECT_STAT());
				if(isNull(data.getInC1_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_PROJECE_ESTIMATE", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_PROJECT_STAT())) setString(no ++, data.getInC1_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setPROJECT_CD( getString(1, rs) );
			data.setPROJECT_NAME( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setDLV_LOC_CD( getString(5, rs) );
			data.setDLV_LOC_NAME( getString(6, rs) );
			data.setACCURACY( getString(7, rs) );
			data.setPROJECT_STAT( getString(8, rs) );
			data.setVEND_DATE( getString(9, rs) );
			data.setASSUME_DLV_DATE( getString(10, rs) );
			data.setASSUME_AMOUNT( getString(11, rs) );
			data.setCUR_UNIT( getString(12, rs) );
			data.setASSUME_AMOUNT_EXCH_RATES( getString(13, rs) );
			data.setPJ_ORG_CD( getString(14, rs) );
			data.setORG_NAME_1( getString(15, rs) );
			data.setPJ_USER_CD( getString(16, rs) );
			data.setUSER_NAME_1( getString(17, rs) );
			data.setREMARKS1( getString(18, rs) );
			data.setREMARKS2( getString(19, rs) );
			data.setREMARKS3( getString(20, rs) );
			data.setREMARKS4( getString(21, rs) );
			data.setREMARKS5( getString(22, rs) );
			data.setESTIMATE_NO( getString(23, rs) );
			data.setESTIMATE_STAT( getString(24, rs) );
			data.setESTIMATE_DATE( getString(25, rs) );
			data.setES_COMMET1( getString(26, rs) );
			data.setES_COMMET2( getString(27, rs) );
			data.setES_COMMET3( getString(28, rs) );
			data.setES_COMMET4( getString(29, rs) );
			data.setES_COMMET5( getString(30, rs) );
			data.setES_ORG_CD( getString(31, rs) );
			data.setORG_NAME_2( getString(32, rs) );
			data.setES_USER_CD( getString(33, rs) );
			data.setUSER_NAME_2( getString(34, rs) );
			data.setESTIMATE_AMOUNT( getString(35, rs) );
			data.setESTIMATE_AMOUNT_JPN( getString(36, rs) );
			data.setESREMARK1( getString(37, rs) );
			data.setESREMARK2( getString(38, rs) );
			data.setESREMARK3( getString(39, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_clear

			return;
		}

		/**
		 * selectT_PROJECE_ESTIMATE�N���X�̕W���R���X�g���N�^
		 */
		public selectT_PROJECE_ESTIMATE()
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_PROJECE_ESTIMATE1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE, "
+"      ( "
+"        SELECT "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\", "
+"          MAX(V_PROJECE_ESTIMATE.\"ESTIMATE_NO\") AS \"ESTIMATE_NO\" "
+"        FROM "
+"          V_PROJECE_ESTIMATE "
+"        WHERE "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\" LIKE(?) "
+"          AND V_PROJECE_ESTIMATE.\"CUST_CD\" LIKE(?) "
+"          AND V_PROJECE_ESTIMATE.\"PJ_USER_CD\" = ? "
+"          AND V_PROJECE_ESTIMATE.\"ES_USER_CD\" = ? "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") <= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") <= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") >= TO_DATE(?) "
+"          AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") <= TO_DATE(?) "
+"          AND(V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"          OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ?) "
+"          AND V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" != '9' "
+"        GROUP BY "
+"          V_PROJECE_ESTIMATE.\"PROJECT_CD\" "
+"      ) V_PROJECE_ESTIMATE1 "
+"    WHERE "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" LIKE(?) "
+"      AND V_PROJECE_ESTIMATE.\"CUST_CD\" LIKE(?) "
+"      AND V_PROJECE_ESTIMATE.\"PJ_USER_CD\" = ? "
+"      AND V_PROJECE_ESTIMATE.\"ES_USER_CD\" = ? "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"VEND_DATE\") <= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\") <= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") >= TO_DATE(?) "
+"      AND TRUNC(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\") <= TO_DATE(?) "
+"      AND(V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ? "
+"      OR  V_PROJECE_ESTIMATE.\"PROJECT_STAT\" = ?) "
+"      AND V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" != '9' "
+"      AND V_PROJECE_ESTIMATE1.\"PROJECT_CD\" = V_PROJECE_ESTIMATE.\"PROJECT_CD\" "
+"      AND V_PROJECE_ESTIMATE1.\"ESTIMATE_NO\" = V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  UNION ALL "
+"    SELECT "
+"      V_PROJECE_ESTIMATE.\"PROJECT_CD\" AS \"PROJECT_CD\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_NAME\" AS \"PROJECT_NAME\", "
+"      V_PROJECE_ESTIMATE.\"CUST_CD\" AS \"CUST_CD\", "
+"      V_PROJECE_ESTIMATE.\"CUST_NAME\" AS \"CUST_NAME\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"      V_PROJECE_ESTIMATE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
+"      V_PROJECE_ESTIMATE.\"ACCURACY\" AS \"ACCURACY\", "
+"      V_PROJECE_ESTIMATE.\"PROJECT_STAT\" AS \"PROJECT_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"VEND_DATE\", 'YYYY/MM/DD') AS \"VEND_DATE\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ASSUME_DLV_DATE\", 'YYYY/MM/DD') AS \"ASSUME_DLV_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT\" AS \"ASSUME_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"CUR_UNIT\" AS \"CUR_UNIT\", "
+"      V_PROJECE_ESTIMATE.\"ASSUME_AMOUNT_EXCH_RATES\" AS \"ASSUME_AMOUNT_EXCH_RATES\", "
+"      V_PROJECE_ESTIMATE.\"PJ_ORG_CD\" AS \"PJ_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_1\" AS \"ORG_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"PJ_USER_CD\" AS \"PJ_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_1\" AS \"USER_NAME_1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS1\" AS \"REMARKS1\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS2\" AS \"REMARKS2\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS3\" AS \"REMARKS3\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS4\" AS \"REMARKS4\", "
+"      V_PROJECE_ESTIMATE.\"REMARKS5\" AS \"REMARKS5\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_NO\" AS \"ESTIMATE_NO\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_STAT\" AS \"ESTIMATE_STAT\", "
+"      TO_CHAR(V_PROJECE_ESTIMATE.\"ESTIMATE_DATE\", 'YYYY/MM/DD') AS \"ESTIMATE_DATE\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET1\" AS \"ES_COMMET1\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET2\" AS \"ES_COMMET2\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET3\" AS \"ES_COMMET3\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET4\" AS \"ES_COMMET4\", "
+"      V_PROJECE_ESTIMATE.\"ES_COMMET5\" AS \"ES_COMMET5\", "
+"      V_PROJECE_ESTIMATE.\"ES_ORG_CD\" AS \"ES_ORG_CD\", "
+"      V_PROJECE_ESTIMATE.\"ORG_NAME_2\" AS \"ORG_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ES_USER_CD\" AS \"ES_USER_CD\", "
+"      V_PROJECE_ESTIMATE.\"USER_NAME_2\" AS \"USER_NAME_2\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT\" AS \"ESTIMATE_AMOUNT\", "
+"      V_PROJECE_ESTIMATE.\"ESTIMATE_AMOUNT_JPN\" AS \"ESTIMATE_AMOUNT_JPN\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK1\" AS \"ESREMARK1\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK2\" AS \"ESREMARK2\", "
+"      V_PROJECE_ESTIMATE.\"ESREMARK3\" AS \"ESREMARK3\" "
+"    FROM "
+"      V_PROJECE_ESTIMATE "
+"    WHERE "
+"      PROJECT_CD LIKE(?) "
+"      AND CUST_CD LIKE(?) "
+"      AND PJ_USER_CD = ? "
+"      AND ES_USER_CD = ? "
+"      AND TRUNC(VEND_DATE) >= TO_DATE(?) "
+"      AND TRUNC(VEND_DATE) <= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) >= TO_DATE(?) "
+"      AND TRUNC(ASSUME_DLV_DATE) <= TO_DATE(?) "
+"      AND PROJECT_STAT = ? "
+"      AND ROWNUM <= TO_NUMBER(?) + 1 "
+"  ) "
+"ORDER BY "
+"  PROJECT_CD, "
+"  ESTIMATE_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read2
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_read3
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ESTIMATE_DATE());
				if(isNull(data.getFROM_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getTO_ESTIMATE_DATE());
				if(isNull(data.getTO_ESTIMATE_DATE())) isNull = true;
				ary.addElement(data.getInC2_PROJECT_STAT());
				if(isNull(data.getInC2_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC3_PROJECT_STAT());
				if(isNull(data.getInC3_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC4_PROJECT_STAT());
				if(isNull(data.getInC4_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC5_PROJECT_STAT());
				if(isNull(data.getInC5_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getInC6_PROJECT_STAT());
				if(isNull(data.getInC6_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_PROJECT_CD());
				if(isNull(data.getIN_PROJECT_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_PJ_USER_CD());
				if(isNull(data.getIN_PJ_USER_CD())) isNull = true;
				ary.addElement(data.getIN_ES_USER_CD());
				if(isNull(data.getIN_ES_USER_CD())) isNull = true;
				ary.addElement(data.getFROM_VEND_DATE());
				if(isNull(data.getFROM_VEND_DATE())) isNull = true;
				ary.addElement(data.getTO_VEND_DATE());
				if(isNull(data.getTO_VEND_DATE())) isNull = true;
				ary.addElement(data.getFROM_ASSUME_DLV_DATE());
				if(isNull(data.getFROM_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_ASSUME_DLV_DATE());
				if(isNull(data.getTO_ASSUME_DLV_DATE())) isNull = true;
				ary.addElement(data.getInC1_PROJECT_STAT());
				if(isNull(data.getInC1_PROJECT_STAT())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_PROJECE_ESTIMATE1", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ESTIMATE_DATE())) setString(no ++, data.getFROM_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ESTIMATE_DATE())) setString(no ++, data.getTO_ESTIMATE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_PROJECT_STAT())) setString(no ++, data.getInC2_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC3_PROJECT_STAT())) setString(no ++, data.getInC3_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC4_PROJECT_STAT())) setString(no ++, data.getInC4_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC5_PROJECT_STAT())) setString(no ++, data.getInC5_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC6_PROJECT_STAT())) setString(no ++, data.getInC6_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PROJECT_CD())) setString(no ++, data.getIN_PROJECT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_PJ_USER_CD())) setString(no ++, data.getIN_PJ_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ES_USER_CD())) setString(no ++, data.getIN_ES_USER_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_VEND_DATE())) setString(no ++, data.getFROM_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_VEND_DATE())) setString(no ++, data.getTO_VEND_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ASSUME_DLV_DATE())) setString(no ++, data.getFROM_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ASSUME_DLV_DATE())) setString(no ++, data.getTO_ASSUME_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_PROJECT_STAT())) setString(no ++, data.getInC1_PROJECT_STAT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setPROJECT_CD( getString(1, rs) );
			data.setPROJECT_NAME( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setDLV_LOC_CD( getString(5, rs) );
			data.setDLV_LOC_NAME( getString(6, rs) );
			data.setACCURACY( getString(7, rs) );
			data.setPROJECT_STAT( getString(8, rs) );
			data.setVEND_DATE( getString(9, rs) );
			data.setASSUME_DLV_DATE( getString(10, rs) );
			data.setASSUME_AMOUNT( getString(11, rs) );
			data.setCUR_UNIT( getString(12, rs) );
			data.setASSUME_AMOUNT_EXCH_RATES( getString(13, rs) );
			data.setPJ_ORG_CD( getString(14, rs) );
			data.setORG_NAME_1( getString(15, rs) );
			data.setPJ_USER_CD( getString(16, rs) );
			data.setUSER_NAME_1( getString(17, rs) );
			data.setREMARKS1( getString(18, rs) );
			data.setREMARKS2( getString(19, rs) );
			data.setREMARKS3( getString(20, rs) );
			data.setREMARKS4( getString(21, rs) );
			data.setREMARKS5( getString(22, rs) );
			data.setESTIMATE_NO( getString(23, rs) );
			data.setESTIMATE_STAT( getString(24, rs) );
			data.setESTIMATE_DATE( getString(25, rs) );
			data.setES_COMMET1( getString(26, rs) );
			data.setES_COMMET2( getString(27, rs) );
			data.setES_COMMET3( getString(28, rs) );
			data.setES_COMMET4( getString(29, rs) );
			data.setES_COMMET5( getString(30, rs) );
			data.setES_ORG_CD( getString(31, rs) );
			data.setORG_NAME_2( getString(32, rs) );
			data.setES_USER_CD( getString(33, rs) );
			data.setUSER_NAME_2( getString(34, rs) );
			data.setESTIMATE_AMOUNT( getString(35, rs) );
			data.setESTIMATE_AMOUNT_JPN( getString(36, rs) );
			data.setESREMARK1( getString(37, rs) );
			data.setESREMARK2( getString(38, rs) );
			data.setESREMARK3( getString(39, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_PROJECE_ESTIMATE1", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_clear

			return;
		}

		/**
		 * selectT_PROJECE_ESTIMATE1�N���X�̕W���R���X�g���N�^
		 */
		public selectT_PROJECE_ESTIMATE1()
		{
			//{{user_implement_dev:selectT_PROJECE_ESTIMATE1_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_PROJECE_ESTIMATE1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getCompanyInfo extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" AS \"COMPANY_CD\" "
+"FROM "
+"  SYS_MY_COMPANY "
+"WHERE "
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
		public List read(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KM0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_read
			if(m_selcmd==null) throw new FoundationException("getCompanyInfo", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, KM0040010Struct data, String replaceStr)
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
		public List read(Connection conn, KM0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KM0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KM0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KM0040010Struct data = new KM0040010Struct();

			data.setstrCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KM0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KM0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCompanyInfo_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCompanyInfo_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KM0040010Struct data) throws FoundationException, SQLException
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

	// null������A�󔒕�����̏ꍇ��true��Ԃ��܂�
	public boolean isNull(Object obj) { return (obj==null || obj.toString().length()==0 ? true : false); }

	/**
	 * �N���[���i�b�v�p���\�b�h
	 *
	 */
	public void clear()
	{
		mselectT_PROJECE_ESTIMATE.clear();
		mselectT_PROJECE_ESTIMATE = null;
		mselectT_PROJECE_ESTIMATE1.clear();
		mselectT_PROJECE_ESTIMATE1 = null;
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * KM0040010�N���X�̕W���R���X�g���N�^
	 */
	public KM0040010Entity() throws FoundationException
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
