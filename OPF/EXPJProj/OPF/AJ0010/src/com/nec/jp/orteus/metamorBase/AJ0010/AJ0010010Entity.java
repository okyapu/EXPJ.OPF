/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

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

public class AJ0010010Entity extends DataObject
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

	// V_ODR_PROG_LST�N���X �C���X�^���X
	public V_ODR_PROG_LST mV_ODR_PROG_LST = new V_ODR_PROG_LST();

	// M_PLANT�N���X �C���X�^���X
	public M_PLANT mM_PLANT = new M_PLANT();

	// SELECT_TIME_CTRL�N���X �C���X�^���X
	public SELECT_TIME_CTRL mSELECT_TIME_CTRL = new SELECT_TIME_CTRL();

	// V_ODR_PROG_LSTCnt�N���X �C���X�^���X
	public V_ODR_PROG_LSTCnt mV_ODR_PROG_LSTCnt = new V_ODR_PROG_LSTCnt();


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
		String m_write_fname="AJ0010010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AJ0010010";

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
	public class V_ODR_PROG_LST extends DataObject
	{
		protected String m_selcmd = "select "
+"  V_ODR_PROG_LST.\"OD_NO\" as \"OD_NO\", "
+"  V_ODR_PROG_LST.\"ODR_STS_TYP\" as \"ODR_STS_TYP\", "
+"  V_ODR_PROG_LST.\"ITEM_CD\" as \"ITEM_CD\", "
+"  V_ODR_PROG_LST.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  V_ODR_PROG_LST.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"ODR_START_DATE\") as \"ODR_START_DATE\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"PRD_START_DATE\") as \"PRD_START_DATE\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"PRD_DUE_DATE\") as \"PRD_DUE_DATE\", "
+"  V_ODR_PROG_LST.\"OD_GNR_TYP\" as \"OD_GNR_TYP\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"ODR_QTY\", 'FM999999999999999990.0999') as \"ODR_QTY\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"TOTAL_RCV_QTY\", 'FM999999999999999990.0999') as \"TOTAL_RCV_QTY\", "
+"  FncGetFormattedDatetime(V_ODR_PROG_LST.\"RCV_CMPLT_DATE\") as \"RCV_CMPLT_DATE\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_CANCEL_NO\" as \"JOB_ODR_CANCEL_NO\", "
+"  V_ODR_PROG_LST.\"JOB_ODR_TYP\" as \"JOB_ODR_TYP\", "
+"  V_ODR_PROG_LST.\"ALC_GRP_CD\" as \"ALC_GRP_CD\", "
+"  V_ODR_PROG_LST.\"EXTERNAL_DM_FLG\" as \"EXTERNAL_DM_FLG\", "
+"  V_ODR_PROG_LST.\"EXTERNAL_PLAN_CD\" as \"EXTERNAL_PLAN_CD\", "
+"  V_ODR_PROG_LST.\"MRP_TYP\" as \"MRP_TYP\", "
+"  V_ODR_PROG_LST.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  V_ODR_PROG_LST.\"RLSD_PUCH_ODR_QTY\" as \"RLSD_PUCH_ODR_QTY\", "
+"  V_ODR_PROG_LST.\"WORK_IN_PROC_QTY\" as \"WORK_IN_PROC_QTY\", "
+"  V_ODR_PROG_LST.\"OD_TYP\" as \"OD_TYP\", "
+"  V_ODR_PROG_LST.\"OPR_RSLT_TYP\" as \"OPR_RSLT_TYP\", "
+"  V_ODR_PROG_LST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  TO_CHAR(V_ODR_PROG_LST.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\" "
+"from "
+"  V_ODR_PROG_LST, "
+"  M_ITEM "
+"where "
+"      ((V_ODR_PROG_LST.\"PRD_DUE_DATE\" >= TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_DUE_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and ((V_ODR_PROG_LST.\"PRD_START_DATE\" >=  TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_START_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and V_ODR_PROG_LST.\"JOB_ODR_CD\" like ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" like ? "
+"  and(((V_ODR_PROG_LST.\"ODR_STS_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and((V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" > V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" = ?) "
+"  or (V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" <= V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" = ?))) "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and(V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ?) "
+"  and V_ODR_PROG_LST.\"MRP_ODR_TYP\" <> 8 "
+"  and(V_ODR_PROG_LST.\"OD_TYP\" = 1 "
+"  or  V_ODR_PROG_LST.\"OD_TYP\" = 2) "
+"  and V_ODR_PROG_LST.\"PLANT_CD\" = ? "
+"  and V_ODR_PROG_LST.\"DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"order by "
+"  V_ODR_PROG_LST.\"ITEM_CD\", "
+"  V_ODR_PROG_LST.\"PRD_DUE_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:V_ODR_PROG_LST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:V_ODR_PROG_LST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:V_ODR_PROG_LST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read2
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:V_ODR_PROG_LST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_read3
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:V_ODR_PROG_LST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_PRD_DUE_DATE_FROM());
				if(isNull(data.getl_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO());
				if(isNull(data.getl_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM());
				if(isNull(data.getl_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO());
				if(isNull(data.getl_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_START_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_START_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_1());
				if(isNull(data.getODR_STS_TYP_1())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_2());
				if(isNull(data.getODR_STS_TYP_2())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_DELAYED())) isNull = true;
				ary.addElement(data.getl_DELAY_BASE_DATE());
				if(isNull(data.getl_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_NOT_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) isNull = true;
				ary.addElement(data.getl_NOT_DELAY_BASE_DATE());
				if(isNull(data.getl_NOT_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9());
				if(isNull(data.getODR_STS_TYP_9())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_1());
				if(isNull(data.getMRP_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_2());
				if(isNull(data.getMRP_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_3());
				if(isNull(data.getMRP_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_4());
				if(isNull(data.getMRP_ODR_TYP_4())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_5());
				if(isNull(data.getMRP_ODR_TYP_5())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_6());
				if(isNull(data.getMRP_ODR_TYP_6())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_7());
				if(isNull(data.getMRP_ODR_TYP_7())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_8());
				if(isNull(data.getMRP_ODR_TYP_8())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getDELAY_TYP());
				if(isNull(data.getDELAY_TYP())) isNull = true;
				ary.addElement(data.getNOT_DELAY_TYP());
				if(isNull(data.getNOT_DELAY_TYP())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("V_ODR_PROG_LST", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_FROM())) setString(no ++, data.getl_PRD_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_TO())) setString(no ++, data.getl_PRD_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_TO_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_FROM())) setString(no ++, data.getl_PRD_START_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_TO())) setString(no ++, data.getl_PRD_START_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_START_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_START_DATE_TO_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_1())) setString(no ++, data.getODR_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_2())) setString(no ++, data.getODR_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_DELAYED(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DELAY_BASE_DATE())) setString(no ++, data.getl_DELAY_BASE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_NOT_DELAYED(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_NOT_DELAY_BASE_DATE())) setString(no ++, data.getl_NOT_DELAY_BASE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9())) setString(no ++, data.getODR_STS_TYP_9(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_1())) setString(no ++, data.getMRP_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_2())) setString(no ++, data.getMRP_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_3())) setString(no ++, data.getMRP_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_4())) setString(no ++, data.getMRP_ODR_TYP_4(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_5())) setString(no ++, data.getMRP_ODR_TYP_5(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_6())) setString(no ++, data.getMRP_ODR_TYP_6(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_7())) setString(no ++, data.getMRP_ODR_TYP_7(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_8())) setString(no ++, data.getMRP_ODR_TYP_8(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getDELAY_TYP())) setString(no ++, data.getDELAY_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getNOT_DELAY_TYP())) setString(no ++, data.getNOT_DELAY_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setl_OD_NO( getString(1, rs) );
			data.setl_ODR_STS_TYP( getInteger(2, rs) );
			data.setl_ITEM_CD( getString(3, rs) );
			data.setl_ITEM_NAME( getString(4, rs) );
			data.setl_MRP_ODR_TYP( getInteger(5, rs) );
			data.setl_ODR_START_DATE( getString(6, rs) );
			data.setl_PRD_START_DATE( getString(7, rs) );
			data.setl_PRD_DUE_DATE( getString(8, rs) );
			data.setOD_GNR_TYP( getInteger(9, rs) );
			data.setl_ODR_QTY( getString(10, rs) );
			data.setl_TOTAL_RCV_QTY( getString(11, rs) );
			data.setl_RCV_CMPLT_DATE( getString(12, rs) );
			data.setl_JOB_ODR_CD( getString(13, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(14, rs) );
			data.setJOB_ODR_TYP( getInteger(15, rs) );
			data.setl_ALC_GRP_CD( getString(16, rs) );
			data.setEXTERNAL_DM_FLG( getInteger(17, rs) );
			data.setl_EXTERNAL_PLAN_CD( getString(18, rs) );
			data.setMRP_TYP( getInteger(19, rs) );
			data.setOUTSIDE_TYP( getInteger(20, rs) );
			data.setl_RLSD_PUCH_ODR_QTY( getString(21, rs) );
			data.setl_WORK_IN_PROC_QTY( getString(22, rs) );
			data.setOD_TYP( getInteger(23, rs) );
			data.setl_OPR_RSLT_TYP( getInteger(24, rs) );
			data.setl_PLANT_CD( getString(25, rs) );
			data.setl_BUSINESS_OPR_DATE( getString(26, rs) );
			data.setl_STOCK_UNIT( getString(27, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LST_check
			PreparedStatement stmt;

			if(m_chkcmd!=null) {
				stmt = prepare(conn, m_chkcmd, data);
			} else if(m_selcmd!=null) {
				stmt = prepare(conn, m_selcmd, data);
			} else {
				throw new FoundationException("V_ODR_PROG_LST", "check", "�N�G���[���o�^");
			}

			try {
				return check(stmt, data);
			} finally {
				stmt.close();
				stmt = null;
			}
                        //}}user_implement_dev:V_ODR_PROG_LST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:V_ODR_PROG_LST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:V_ODR_PROG_LST_clear

			return;
		}

		/**
		 * V_ODR_PROG_LST�N���X�̕W���R���X�g���N�^
		 */
		public V_ODR_PROG_LST()
		{
			//{{user_implement_dev:V_ODR_PROG_LST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:V_ODR_PROG_LST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_PLANT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PLANT.\"PLANT_NAME\" AS \"PLANT_NAME\" "
+"FROM "
+"  M_PLANT "
+"WHERE "
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
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setPLANT_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setTIME_CTRL( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
	public class V_ODR_PROG_LSTCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  COUNT(1) "
+"from "
+"  V_ODR_PROG_LST, "
+"  M_ITEM "
+"where "
+"    ((V_ODR_PROG_LST.\"PRD_DUE_DATE\" >= TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_DUE_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or (V_ODR_PROG_LST.\"PRD_DUE_DATE\" = TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and ((V_ODR_PROG_LST.\"PRD_START_DATE\" >=  TO_DATE(?,'YYYY/MM/DD HH24:MI') "
+"    and V_ODR_PROG_LST.\"PRD_START_DATE\" <=  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI')) "
+"    or  (V_ODR_PROG_LST.\"PRD_START_DATE\" =  TO_DATE(?,'YYYY/MM/DD HH24:MI'))) "
+"  and V_ODR_PROG_LST.\"JOB_ODR_CD\" like ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" like ? "
+"  and(((V_ODR_PROG_LST.\"ODR_STS_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and((V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" > V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"DELAY_BASE_DATE\" = ?) "
+"  or (V_ODR_PROG_LST.\"ODR_STS_TYP\" <> ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" <= V_ODR_PROG_LST.\"PRD_DUE_DATE\" "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_BASE_DATE\" = ?))) "
+"  or  V_ODR_PROG_LST.\"ODR_STS_TYP\" = ?) "
+"  and(V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ? "
+"  or  V_ODR_PROG_LST.\"MRP_ODR_TYP\" = ?) "
+"  and V_ODR_PROG_LST.\"MRP_ODR_TYP\" <> 8 "
+"  and(V_ODR_PROG_LST.\"OD_TYP\" = 1 "
+"  or  V_ODR_PROG_LST.\"OD_TYP\" = 2) "
+"  and V_ODR_PROG_LST.\"PLANT_CD\" = ? "
+"  and V_ODR_PROG_LST.\"DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"NOT_DELAY_TYP\" = ? "
+"  and V_ODR_PROG_LST.\"ITEM_CD\" = M_ITEM.ITEM_CD(+) "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:V_ODR_PROG_LSTCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:V_ODR_PROG_LSTCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AJ0010010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AJ0010010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read2
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AJ0010010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_read3
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AJ0010010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_PRD_DUE_DATE_FROM());
				if(isNull(data.getl_PRD_DUE_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO());
				if(isNull(data.getl_PRD_DUE_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_DUE_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM());
				if(isNull(data.getl_PRD_START_DATE_FROM())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO());
				if(isNull(data.getl_PRD_START_DATE_TO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_FROM_ZERO());
				if(isNull(data.getl_PRD_START_DATE_FROM_ZERO())) isNull = true;
				ary.addElement(data.getl_PRD_START_DATE_TO_ZERO());
				if(isNull(data.getl_PRD_START_DATE_TO_ZERO())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_1());
				if(isNull(data.getODR_STS_TYP_1())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_2());
				if(isNull(data.getODR_STS_TYP_2())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_DELAYED())) isNull = true;
				ary.addElement(data.getl_DELAY_BASE_DATE());
				if(isNull(data.getl_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9_NOT_DELAYED());
				if(isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) isNull = true;
				ary.addElement(data.getl_NOT_DELAY_BASE_DATE());
				if(isNull(data.getl_NOT_DELAY_BASE_DATE())) isNull = true;
				ary.addElement(data.getODR_STS_TYP_9());
				if(isNull(data.getODR_STS_TYP_9())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_1());
				if(isNull(data.getMRP_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_2());
				if(isNull(data.getMRP_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_3());
				if(isNull(data.getMRP_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_4());
				if(isNull(data.getMRP_ODR_TYP_4())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_5());
				if(isNull(data.getMRP_ODR_TYP_5())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_6());
				if(isNull(data.getMRP_ODR_TYP_6())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_7());
				if(isNull(data.getMRP_ODR_TYP_7())) isNull = true;
				ary.addElement(data.getMRP_ODR_TYP_8());
				if(isNull(data.getMRP_ODR_TYP_8())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getDELAY_TYP());
				if(isNull(data.getDELAY_TYP())) isNull = true;
				ary.addElement(data.getNOT_DELAY_TYP());
				if(isNull(data.getNOT_DELAY_TYP())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("V_ODR_PROG_LSTCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_FROM())) setString(no ++, data.getl_PRD_DUE_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_TO())) setString(no ++, data.getl_PRD_DUE_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_DUE_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_DUE_DATE_TO_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_FROM())) setString(no ++, data.getl_PRD_START_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_TO())) setString(no ++, data.getl_PRD_START_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_FROM_ZERO())) setString(no ++, data.getl_PRD_START_DATE_FROM_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_PRD_START_DATE_TO_ZERO())) setString(no ++, data.getl_PRD_START_DATE_TO_ZERO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_1())) setString(no ++, data.getODR_STS_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_2())) setString(no ++, data.getODR_STS_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_DELAYED(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_DELAY_BASE_DATE())) setString(no ++, data.getl_DELAY_BASE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9_NOT_DELAYED())) setString(no ++, data.getODR_STS_TYP_9_NOT_DELAYED(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getl_NOT_DELAY_BASE_DATE())) setString(no ++, data.getl_NOT_DELAY_BASE_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getODR_STS_TYP_9())) setString(no ++, data.getODR_STS_TYP_9(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_1())) setString(no ++, data.getMRP_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_2())) setString(no ++, data.getMRP_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_3())) setString(no ++, data.getMRP_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_4())) setString(no ++, data.getMRP_ODR_TYP_4(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_5())) setString(no ++, data.getMRP_ODR_TYP_5(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_6())) setString(no ++, data.getMRP_ODR_TYP_6(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_7())) setString(no ++, data.getMRP_ODR_TYP_7(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getMRP_ODR_TYP_8())) setString(no ++, data.getMRP_ODR_TYP_8(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getDELAY_TYP())) setString(no ++, data.getDELAY_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getNOT_DELAY_TYP())) setString(no ++, data.getNOT_DELAY_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AJ0010010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AJ0010010Struct data = new AJ0010010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("V_ODR_PROG_LSTCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AJ0010010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AJ0010010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AJ0010010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_clear

			return;
		}

		/**
		 * V_ODR_PROG_LSTCnt�N���X�̕W���R���X�g���N�^
		 */
		public V_ODR_PROG_LSTCnt()
		{
			//{{user_implement_dev:V_ODR_PROG_LSTCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:V_ODR_PROG_LSTCnt_constractor

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
		mV_ODR_PROG_LST.clear();
		mV_ODR_PROG_LST = null;
		mM_PLANT.clear();
		mM_PLANT = null;
		mSELECT_TIME_CTRL.clear();
		mSELECT_TIME_CTRL = null;
		mV_ODR_PROG_LSTCnt.clear();
		mV_ODR_PROG_LSTCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AJ0010010�N���X�̕W���R���X�g���N�^
	 */
	public AJ0010010Entity() throws FoundationException
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
