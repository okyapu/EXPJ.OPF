/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0040/src/com/nec/jp/orteus/metamorBase/KQ0040/KQ0040010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0040;

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

public class KQ0040010Entity extends DataObject
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

	// Select�N���X �C���X�^���X
	public Select mSelect = new Select();

	// selectSYS_DATE_CTRL�N���X �C���X�^���X
	public selectSYS_DATE_CTRL mselectSYS_DATE_CTRL = new selectSYS_DATE_CTRL();

	// selectSYS_MY_COMPANY�N���X �C���X�^���X
	public selectSYS_MY_COMPANY mselectSYS_MY_COMPANY = new selectSYS_MY_COMPANY();

	// SelectCnt�N���X �C���X�^���X
	public SelectCnt mSelectCnt = new SelectCnt();

	// SelectCntP�N���X �C���X�^���X
	public SelectCntP mSelectCntP = new SelectCntP();

	// SelectP�N���X �C���X�^���X
	public SelectP mSelectP = new SelectP();


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
		String m_write_fname="KQ0040010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="KQ0040010";

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
	public class Select extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  b.ODR_TYP AS ODR_TYP, "
+"  b.CUST_ODR_NO AS CUST_ODR_NO, "
+"  a.CUST_CD AS CUST_CD, "
+"  c.CUST_NAME AS CUST_NAME, "
+"  a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"  a.ITEM_CD AS ITEM_CD, "
+"  f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"  g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"  TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"  M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"  TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"  TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"  TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"  b.DEPO_TYP AS DEPO_TYP, "
+"  b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"  b.ODR_NO AS ODR_NO, "
+"  TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"  TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"  b.CURRNCY_CD as CURRNCY_CD, "
+"  j.CUR_UNIT as CUR_UNIT, "
+"  b.EXCH_TYP as EXCH_TYP, "
+"  c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"  M_ITEM.ITEM_NAME, "
+"  M_ITEM_SPEC.CUST_ITEM_NAME, "
+"  D.JOB_ODR_CD AS JOB_ODR_CD, "
+"  t.PROJECT_CD AS PROJECT_CD, "
+"  t.ESTIMATE_NO AS ESTIMATE_NO, "
+"  t.DETAL_NO AS DETAL_NO, "
+"  '1' AS PRO_FLG "
+"FROM "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR_CTL "
+"    WHERE "
+"      CUST_CD like(?) "
+"      AND CUST_ITEM_CD like(?) "
+"      AND DEL_FLG = '0' "
+"  ) a, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR "
+"    WHERE "
+"      (CUST_CHRG_PSN_CD like(?) "
+"      or  ODR_ACPT_PSN_CD like(?)) "
+"      AND CUST_ODR_NO like(?) "
+"      AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"      AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"      AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"      AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"      AND(ODR_TYP = ? "
+"      or  ODR_TYP = ? "
+"      or  ODR_TYP = ?) "
+"      AND DEL_FLG = '0' "
+"  ) b, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      M_CUST "
+"    WHERE "
+"      COMPANY_CD = ? "
+"  ) c, "
+"  USER_MST f, "
+"  USER_MST g, "
+"  M_CUR j, "
+"  M_ITEM, "
+"  M_ITEM_SPEC, "
+"  T_JOB_ODR_ODR_ALC D, "
+"  T_PJ_ODR_ALC t "
+"where "
+"  a.ODR_CTL_NO = b.ODR_CTL_NO "
+"  and a.CUST_CD = c.CUST_CD(+) "
+"  and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"  and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"  and j.CUR_CD = b.CURRNCY_CD "
+"  and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and M_ITEM_SPEC.COMPANY_CD = ? "
+"  and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"  and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"  and b.ODR_NO = d.odr_no(+) "
+"  and b.ODR_NO = t.odr_no(+) "
+"union "
+"SELECT "
+"  3 AS ODR_TYP, "
+"  b.CUST_ODR_NO AS CUST_ODR_NO, "
+"  b.CUST_CD AS CUST_CD, "
+"  c.CUST_NAME AS CUST_NAME, "
+"  NULL AS CUST_ITEM_CD, "
+"  b.ITEM_CD AS ITEM_CD, "
+"  f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"  g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"  TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"  TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"  M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"  TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"  TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"  NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"  NULL AS UNCONFIRM_ODR_BALANCE, "
+"  NULL AS UNCONFIRM_ODR_QTY, "
+"  NULL AS UNCONFIRM_ODR_AMOUNT, "
+"  NULL AS DEPO_TYP, "
+"  NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"  b.ODR_NO AS ODR_NO, "
+"  TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"  TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"  b.CURRNCY_CD AS CURRNCY_CD, "
+"  j.CUR_UNIT AS CUR_UNIT, "
+"  b.EXCH_TYP AS EXCH_TYP, "
+"  c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"  b.ITEM_NAME AS ITEM_NAME, "
+"  NULL AS CUST_ITEM_NAME, "
+"  NULL AS JOB_ODR_CD, "
+"  t.PROJECT_CD AS PROJECT_CD, "
+"  t.ESTIMATE_NO AS ESTIMATE_NO, "
+"  t.DETAL_NO AS DETAL_NO, "
+"  '2' AS PRO_FLG "
+"FROM "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      T_ODR_UNSTOCK "
+"    WHERE "
+"      (CUST_CHRG_PSN_CD like(?) "
+"      or  ODR_ACPT_PSN_CD like(?)) "
+"      AND CUST_ODR_NO like(?) "
+"      AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"      AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"      AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"      AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"      AND DEL_FLG = '0' "
+"      AND CUST_CD like(?) "
+"  ) b, "
+"  ( "
+"    SELECT "
+"      * "
+"    FROM "
+"      M_CUST "
+"    WHERE "
+"      COMPANY_CD = ? "
+"  ) c, "
+"  USER_MST f, "
+"  USER_MST g, "
+"  M_CUR j, "
+"  M_ITEM, "
+"  T_PJ_ODR_ALC t "
+"where "
+"  b.CUST_CD = c.CUST_CD(+) "
+"  and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"  and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"  and j.CUR_CD = b.CURRNCY_CD "
+"  and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  and b.ODR_NO = t.odr_no(+) "
+"  and '3' = ? "
+"order by "
+"  PRO_FLG, "
+"  ODR_TYP DESC, "
+"  CUST_ODR_NO, "
+"  CUST_CD, "
+"  CUST_ITEM_CD, "
+"  ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Select_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Select_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read
                        if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Select_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read2
			if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Select_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_read3
			if(m_selcmd==null) throw new FoundationException("Select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Select_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("Select", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setODR_TYP( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setCUST_ITEM_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setCUST_CHRG_PSN_CD( getString(7, rs) );
			data.setODR_ACPT_PSN_CD( getString(8, rs) );
			data.setDESINATED_DLV_DATE( getString(9, rs) );
			data.setODR_QTY( getString(10, rs) );
			data.setUNIT_NAME( getString(11, rs) );
			data.setODR_UNIT_PRICE( getString(12, rs) );
			data.setODR_AMOUNT( getString(13, rs) );
			data.setREMAIN_UNCONFIRM_ODR_QTY( getString(14, rs) );
			data.setUNCONFIRM_ODR_BALANCE( getString(15, rs) );
			data.setUNCONFIRM_ODR_QTY( getString(16, rs) );
			data.setUNCONFIRM_ODR_AMOUNT( getString(17, rs) );
			data.setDEPO_TYP( getString(18, rs) );
			data.setUNCONFIRMED_ODR_EFF_OVR_FLG( getString(19, rs) );
			data.setODR_NO( getString(20, rs) );
			data.setMODIFY_COUNT( getString(21, rs) );
			data.setODR_ACPT_DATE( getString(22, rs) );
			data.setCURRNCY_CD( getString(23, rs) );
			data.setCUR_UNIT( getString(24, rs) );
			data.setEXCH_TYP( getString(25, rs) );
			data.setROUND_TYP( getString(26, rs) );
			data.setITEM_NAME( getString(27, rs) );
			data.setCUST_ITEM_NAME( getString(28, rs) );
			data.setJOB_ODR_CD( getString(29, rs) );
			data.setPROJECT_CD( getString(30, rs) );
			data.setESTIMATE_NO( getString(31, rs) );
			data.setDETAL_NO( getString(32, rs) );
			data.setPRO_FLG( getString(33, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("Select", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:Select_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Select_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Select_clear

			return;
		}

		/**
		 * Select�N���X�̕W���R���X�g���N�^
		 */
		public Select()
		{
			//{{user_implement_dev:Select_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Select_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectSYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(SYS_DATE_CTRL.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  SYS_DATE_CTRL.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  SYS_DATE_CTRL.\"PLANT_CD\" = ( "
+"    SELECT "
+"      CODE "
+"    FROM "
+"      SYS_CLASS_CODE "
+"    WHERE "
+"      SYS_CLASS = 'SALES' "
+"      AND CLASS_CODE = 'PLANT_WEB' "
+"      and rownum = 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSYS_DATE_CTRL_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectSYS_DATE_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectSYS_DATE_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setIN_BUSINESS_OPR_DATE( getString(1, rs) );
			data.setPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_DATE_CTRL", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_DATE_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSYS_DATE_CTRL_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectSYS_DATE_CTRL_clear

			return;
		}

		/**
		 * selectSYS_DATE_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public selectSYS_DATE_CTRL()
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectSYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = " SELECT COMPANY_CD FROM SYS_MY_COMPANY "
+" WHERE CTRL_CD ='SYSTEM' "
+"";
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
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_read
                        if(m_selcmd==null) throw new FoundationException("selectSYS_MY_COMPANY", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setIN_COMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_MY_COMPANY_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("selectSYS_MY_COMPANY", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:selectSYS_MY_COMPANY_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
	public class SelectCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and '3' = ? "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read2
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_read3
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectCnt_clear

			return;
		}

		/**
		 * SelectCnt�N���X�̕W���R���X�g���N�^
		 */
		public SelectCnt()
		{
			//{{user_implement_dev:SelectCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectCntP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  count(1) "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and t.project_cd is null "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and t.project_cd is null "
+"      and '3' = ? "
+"      and ROWNUM <= TO_NUMBER(?) + 1 "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectCntP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectCntP_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCntP_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read2
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCntP_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_read3
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectCntP_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectCntP", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectCntP", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectCntP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectCntP_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectCntP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectCntP_clear

			return;
		}

		/**
		 * SelectCntP�N���X�̕W���R���X�g���N�^
		 */
		public SelectCntP()
		{
			//{{user_implement_dev:SelectCntP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectCntP_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  * "
+"FROM "
+"  ( "
+"    SELECT "
+"      b.ODR_TYP AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      a.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      a.CUST_ITEM_CD AS CUST_ITEM_CD, "
+"      a.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.REMAIN_UNCONFIRM_ODR_QTY, NULL)) AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '2', b.UNCONFIRM_ODR_BALANCE)) AS UNCONFIRM_ODR_BALANCE, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_QTY, 0) - NVL(b.TOTAL_SHIP_QTY, 0), NULL)) AS UNCONFIRM_ODR_QTY, "
+"      TO_CHAR(DECODE(b.ODR_TYP, '3', NVL(b.ODR_AMOUNT, 0) - NVL(b.SHIP_AMOUNT, 0), NULL)) as UNCONFIRM_ODR_AMOUNT, "
+"      b.DEPO_TYP AS DEPO_TYP, "
+"      b.UNCONFIRMED_ODR_EFF_OVR_FLG AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD as CURRNCY_CD, "
+"      j.CUR_UNIT as CUR_UNIT, "
+"      b.EXCH_TYP as EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP as DETAIL_ROUND_TYP, "
+"      M_ITEM.ITEM_NAME, "
+"      M_ITEM_SPEC.CUST_ITEM_NAME, "
+"      D.JOB_ODR_CD AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '1' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_CTL "
+"        WHERE "
+"          CUST_CD like(?) "
+"          AND CUST_ITEM_CD like(?) "
+"          AND DEL_FLG = '0' "
+"      ) a, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND(ODR_TYP = ? "
+"          or  ODR_TYP = ? "
+"          or  ODR_TYP = ?) "
+"          AND DEL_FLG = '0' "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      M_ITEM_SPEC, "
+"      T_JOB_ODR_ODR_ALC D, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      a.ODR_CTL_NO = b.ODR_CTL_NO "
+"      and a.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and a.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and M_ITEM_SPEC.COMPANY_CD = ? "
+"      and a.CUST_CD = M_ITEM_SPEC.CUST_CD(+) "
+"      and a.CUST_ITEM_CD = M_ITEM_SPEC.CUST_ITEM_CD(+) "
+"      and b.ODR_NO = d.odr_no(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"  union "
+"    SELECT "
+"      3 AS ODR_TYP, "
+"      b.CUST_ODR_NO AS CUST_ODR_NO, "
+"      b.CUST_CD AS CUST_CD, "
+"      c.CUST_NAME AS CUST_NAME, "
+"      NULL AS CUST_ITEM_CD, "
+"      b.ITEM_CD AS ITEM_CD, "
+"      f.USER_NAME AS CUST_CHRG_PSN_CD, "
+"      g.USER_NAME AS ODR_ACPT_PSN_CD, "
+"      TO_CHAR(b.DESINATED_DLV_DATE, 'YYYY/MM/DD') AS DESINATED_DLV_DATE, "
+"      TO_CHAR(b.ODR_QTY) AS ODR_QTY, "
+"      M_ITEM.STOCK_UNIT AS UNIT_CD, "
+"      TO_CHAR(b.ODR_UNIT_PRICE) AS ODR_UNIT_PRICE, "
+"      TO_CHAR(b.ODR_AMOUNT) AS ODR_AMOUNT, "
+"      NULL AS REMAIN_UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_BALANCE, "
+"      NULL AS UNCONFIRM_ODR_QTY, "
+"      NULL AS UNCONFIRM_ODR_AMOUNT, "
+"      NULL AS DEPO_TYP, "
+"      NULL AS UNCONFIRMED_ODR_EFF_OVR_FLG, "
+"      b.ODR_NO AS ODR_NO, "
+"      TO_CHAR(DECODE(b.MODIFY_COUNT, 0, 0, 1)) AS MODIFY_COUNT, "
+"      TO_CHAR(b.ODR_ACPT_DATE, 'YYYY/MM/DD') AS ODR_ACPT_DATE, "
+"      b.CURRNCY_CD AS CURRNCY_CD, "
+"      j.CUR_UNIT AS CUR_UNIT, "
+"      b.EXCH_TYP AS EXCH_TYP, "
+"      c.DETAIL_ROUND_TYP AS DETAIL_ROUND_TYP, "
+"      b.ITEM_NAME AS ITEM_NAME, "
+"      NULL AS CUST_ITEM_NAME, "
+"      NULL AS JOB_ODR_CD, "
+"      t.PROJECT_CD AS PROJECT_CD, "
+"      t.ESTIMATE_NO AS ESTIMATE_NO, "
+"      t.DETAL_NO AS DETAL_NO, "
+"      '2' AS PRO_FLG "
+"    FROM "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_ODR_UNSTOCK "
+"        WHERE "
+"          (CUST_CHRG_PSN_CD like(?) "
+"          or  ODR_ACPT_PSN_CD like(?)) "
+"          AND CUST_ODR_NO like(?) "
+"          AND DESINATED_DLV_DATE >= TO_DATE(?) "
+"          AND DESINATED_DLV_DATE <= TO_DATE(?) "
+"          AND(ODR_ACPT_DATE >= TO_DATE(?) "
+"          AND ODR_ACPT_DATE <= TO_DATE(?)) "
+"          AND DEL_FLG = '0' "
+"          AND CUST_CD like(?) "
+"      ) b, "
+"      ( "
+"        SELECT "
+"          * "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"      ) c, "
+"      USER_MST f, "
+"      USER_MST g, "
+"      M_CUR j, "
+"      M_ITEM, "
+"      T_PJ_ODR_ALC t "
+"    where "
+"      b.CUST_CD = c.CUST_CD(+) "
+"      and b.CUST_CHRG_PSN_CD = f.USER_CD(+) "
+"      and b.ODR_ACPT_PSN_CD = g.USER_CD(+) "
+"      and j.CUR_CD = b.CURRNCY_CD "
+"      and b.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"      and b.ODR_NO = t.odr_no(+) "
+"      and '3' = ? "
+"    order by "
+"      PRO_FLG, "
+"      ODR_TYP DESC, "
+"      CUST_ODR_NO, "
+"      CUST_CD, "
+"      CUST_ITEM_CD, "
+"      ITEM_CD "
+"  ) tt "
+"WHERE "
+"  tt.project_cd is null";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectP_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KQ0040010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KQ0040010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectP_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read2
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectP_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KQ0040010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_read3
			if(m_selcmd==null) throw new FoundationException("SelectP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectP_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KQ0040010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ITEM_CD());
				if(isNull(data.getIN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_1());
				if(isNull(data.getIN_ODR_TYP_1())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_3());
				if(isNull(data.getIN_ODR_TYP_3())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_CHRG_PSN_CD());
				if(isNull(data.getIN_CUST_CHRG_PSN_CD())) isNull = true;
				ary.addElement(data.getIN_CUST_ODR_NO());
				if(isNull(data.getIN_CUST_ODR_NO())) isNull = true;
				ary.addElement(data.getFROM_DESINATED_DLV_DATE());
				if(isNull(data.getFROM_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getTO_DESINATED_DLV_DATE());
				if(isNull(data.getTO_DESINATED_DLV_DATE())) isNull = true;
				ary.addElement(data.getFROM_ODR_ACPT_DATE());
				if(isNull(data.getFROM_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getTO_ODR_ACPT_DATE());
				if(isNull(data.getTO_ODR_ACPT_DATE())) isNull = true;
				ary.addElement(data.getIN_CUST_CD());
				if(isNull(data.getIN_CUST_CD())) isNull = true;
				ary.addElement(data.getIN_COMPANY_CD());
				if(isNull(data.getIN_COMPANY_CD())) isNull = true;
				ary.addElement(data.getIN_ODR_TYP_2());
				if(isNull(data.getIN_ODR_TYP_2())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectP", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ITEM_CD())) setString(no ++, data.getIN_CUST_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_1())) setString(no ++, data.getIN_ODR_TYP_1(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_3())) setString(no ++, data.getIN_ODR_TYP_3(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CHRG_PSN_CD())) setString(no ++, data.getIN_CUST_CHRG_PSN_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_ODR_NO())) setString(no ++, data.getIN_CUST_ODR_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_DESINATED_DLV_DATE())) setString(no ++, data.getFROM_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_DESINATED_DLV_DATE())) setString(no ++, data.getTO_DESINATED_DLV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getFROM_ODR_ACPT_DATE())) setString(no ++, data.getFROM_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTO_ODR_ACPT_DATE())) setString(no ++, data.getTO_ODR_ACPT_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_CUST_CD())) setString(no ++, data.getIN_CUST_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_COMPANY_CD())) setString(no ++, data.getIN_COMPANY_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getIN_ODR_TYP_2())) setString(no ++, data.getIN_ODR_TYP_2(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KQ0040010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KQ0040010Struct data = new KQ0040010Struct();

			data.setODR_TYP( getString(1, rs) );
			data.setCUST_ODR_NO( getString(2, rs) );
			data.setCUST_CD( getString(3, rs) );
			data.setCUST_NAME( getString(4, rs) );
			data.setCUST_ITEM_CD( getString(5, rs) );
			data.setITEM_CD( getString(6, rs) );
			data.setCUST_CHRG_PSN_CD( getString(7, rs) );
			data.setODR_ACPT_PSN_CD( getString(8, rs) );
			data.setDESINATED_DLV_DATE( getString(9, rs) );
			data.setODR_QTY( getString(10, rs) );
			data.setUNIT_NAME( getString(11, rs) );
			data.setODR_UNIT_PRICE( getString(12, rs) );
			data.setODR_AMOUNT( getString(13, rs) );
			data.setREMAIN_UNCONFIRM_ODR_QTY( getString(14, rs) );
			data.setUNCONFIRM_ODR_BALANCE( getString(15, rs) );
			data.setUNCONFIRM_ODR_QTY( getString(16, rs) );
			data.setUNCONFIRM_ODR_AMOUNT( getString(17, rs) );
			data.setDEPO_TYP( getString(18, rs) );
			data.setUNCONFIRMED_ODR_EFF_OVR_FLG( getString(19, rs) );
			data.setODR_NO( getString(20, rs) );
			data.setMODIFY_COUNT( getString(21, rs) );
			data.setODR_ACPT_DATE( getString(22, rs) );
			data.setCURRNCY_CD( getString(23, rs) );
			data.setCUR_UNIT( getString(24, rs) );
			data.setEXCH_TYP( getString(25, rs) );
			data.setROUND_TYP( getString(26, rs) );
			data.setITEM_NAME( getString(27, rs) );
			data.setCUST_ITEM_NAME( getString(28, rs) );
			data.setJOB_ODR_CD( getString(29, rs) );
			data.setPROJECT_CD( getString(30, rs) );
			data.setESTIMATE_NO( getString(31, rs) );
			data.setDETAL_NO( getString(32, rs) );
			data.setPRO_FLG( getString(33, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectP", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KQ0040010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KQ0040010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectP_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KQ0040010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectP_clear

			return;
		}

		/**
		 * SelectP�N���X�̕W���R���X�g���N�^
		 */
		public SelectP()
		{
			//{{user_implement_dev:SelectP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectP_constractor

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
		mSelect.clear();
		mSelect = null;
		mselectSYS_DATE_CTRL.clear();
		mselectSYS_DATE_CTRL = null;
		mselectSYS_MY_COMPANY.clear();
		mselectSYS_MY_COMPANY = null;
		mSelectCnt.clear();
		mSelectCnt = null;
		mSelectCntP.clear();
		mSelectCntP = null;
		mSelectP.clear();
		mSelectP = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * KQ0040010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0040010Entity() throws FoundationException
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
