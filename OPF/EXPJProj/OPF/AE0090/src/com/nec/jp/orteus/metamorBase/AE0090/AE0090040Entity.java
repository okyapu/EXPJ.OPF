/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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
 * CLASS     : AE0090040Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AE0090040Entity extends DataObject
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

	// SelectPlant�N���X �C���X�^���X
	public SelectPlant mSelectPlant = new SelectPlant();

	// SelectOdrQTY1�N���X �C���X�^���X
	public SelectOdrQTY1 mSelectOdrQTY1 = new SelectOdrQTY1();

	// SelectOdrQTY2�N���X �C���X�^���X
	public SelectOdrQTY2 mSelectOdrQTY2 = new SelectOdrQTY2();

	// SelectReceiptTerm�N���X �C���X�^���X
	public SelectReceiptTerm mSelectReceiptTerm = new SelectReceiptTerm();

	// SelectReceiptNumber�N���X �C���X�^���X
	public SelectReceiptNumber mSelectReceiptNumber = new SelectReceiptNumber();

	// SelectItem�N���X �C���X�^���X
	public SelectItem mSelectItem = new SelectItem();

	// SelectDetail�N���X �C���X�^���X
	public SelectDetail mSelectDetail = new SelectDetail();

	// SelectStock�N���X �C���X�^���X
	public SelectStock mSelectStock = new SelectStock();

	// SelectUNIT_QTY_TYP�N���X �C���X�^���X
	public SelectUNIT_QTY_TYP mSelectUNIT_QTY_TYP = new SelectUNIT_QTY_TYP();

	// SelectNeed_QTY�N���X �C���X�^���X
	public SelectNeed_QTY mSelectNeed_QTY = new SelectNeed_QTY();

	// SelectNeed_QTYReverse�N���X �C���X�^���X
	public SelectNeed_QTYReverse mSelectNeed_QTYReverse = new SelectNeed_QTYReverse();

	// TreeSelect�N���X �C���X�^���X
	public TreeSelect mTreeSelect = new TreeSelect();

	// selectM_ITEM�N���X �C���X�^���X
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();

	// selectSYS_DATE_CTRL�N���X �C���X�^���X
	public selectSYS_DATE_CTRL mselectSYS_DATE_CTRL = new selectSYS_DATE_CTRL();

	// selectM_PS�N���X �C���X�^���X
	public selectM_PS mselectM_PS = new selectM_PS();

	// select_M_ITEM_VIEW�N���X �C���X�^���X
	public select_M_ITEM_VIEW mselect_M_ITEM_VIEW = new select_M_ITEM_VIEW();

	// selectM_PS_Forward�N���X �C���X�^���X
	public selectM_PS_Forward mselectM_PS_Forward = new selectM_PS_Forward();

	// SelectM_PS_F�N���X �C���X�^���X
	public SelectM_PS_F mSelectM_PS_F = new SelectM_PS_F();


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
		String m_write_fname="AE0090040.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AE0090040";

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
	public class SelectPlant extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_PLANT.\"PLANT_NAME\" AS \"PLANT_NAME\" "
+"FROM "
+"  M_PLANT "
+"WHERE "
+"  M_PLANT.\"PLANT_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectPlant_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectPlant_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectPlant_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectPlant_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SelectPlant_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectPlant_clear

			return;
		}

		/**
		 * SelectPlant�N���X�̕W���R���X�g���N�^
		 */
		public SelectPlant()
		{
			//{{user_implement_dev:SelectPlant_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectPlant_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectOdrQTY1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(TEMPA.PUCH_ODR_QTY, 0) - NVL(TEMPB.ACPT_QTY, 0) "
+"FROM "
+"  ( "
+"    SELECT "
+"      SUM(A.PUCH_ODR_QTY) PUCH_ODR_QTY "
+"    FROM "
+"      T_RLSD_PUCH_ODR A,M_WH B "
+"    WHERE "
+"      A.PLANT_CD = ? "
+"      AND A.ITEM_CD = ? "
+"      AND A.PUCH_ODR_DLV_DATE < ? "
+"      AND A.PUCH_ODR_STS_TYP IN (1, 2) "
+"      AND A.WH_CD=B.WH_CD "
+"      AND B.MRP_FLG = '1' "
+"  ) TEMPA, "
+"  ( "
+"    SELECT "
+"      SUM(B.ACPT_QTY) ACPT_QTY "
+"    FROM "
+"      T_ACPT_RSLT B "
+"    WHERE "
+"      EXISTS( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_RLSD_PUCH_ODR A,M_WH C "
+"        WHERE "
+"          A.PLANT_CD = ? "
+"          AND A.ITEM_CD = ? "
+"          AND A.PUCH_ODR_DLV_DATE < ? "
+"          AND A.PUCH_ODR_STS_TYP IN (1, 2) "
+"          AND A.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"          AND A.WH_CD = C.WH_CD "
+"          AND C.MRP_FLG = '1' "
+"      ) "
+"  ) TEMPB";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectOdrQTY1_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectOdrQTY1_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY1_read
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY1", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOdrQTY1_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY1_read2
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectOdrQTY1_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY1_read3
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectOdrQTY1_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getTERM2STARTDATE());
				if(isNull(data.getTERM2STARTDATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getTERM2STARTDATE());
				if(isNull(data.getTERM2STARTDATE())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectOdrQTY1", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTERM2STARTDATE())) setString(no ++, data.getTERM2STARTDATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTERM2STARTDATE())) setString(no ++, data.getTERM2STARTDATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setRECEIPT_SCHEDULES_NUMBER1( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY1", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOdrQTY1_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectOdrQTY1_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectOdrQTY1_clear

			return;
		}

		/**
		 * SelectOdrQTY1�N���X�̕W���R���X�g���N�^
		 */
		public SelectOdrQTY1()
		{
			//{{user_implement_dev:SelectOdrQTY1_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectOdrQTY1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectOdrQTY2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(TEMPA.PUCH_ODR_QTY, 0) - NVL(TEMPB.ACPT_QTY, 0) "
+"FROM "
+"  ( "
+"    SELECT "
+"      SUM(A.PUCH_ODR_QTY) PUCH_ODR_QTY "
+"    FROM "
+"      T_RLSD_PUCH_ODR A,M_WH B "
+"    WHERE "
+"      A.PLANT_CD = ? "
+"      AND A.ITEM_CD = ? "
+"      AND A.PUCH_ODR_DLV_DATE >= ? "
+"      AND A.PUCH_ODR_STS_TYP IN (1, 2) "
+"      AND A.WH_CD=B.WH_CD "
+"      AND B.MRP_FLG = '1' "
+"  ) TEMPA, "
+"  ( "
+"    SELECT "
+"      SUM(B.ACPT_QTY) ACPT_QTY "
+"    FROM "
+"      T_ACPT_RSLT B "
+"    WHERE "
+"      EXISTS( "
+"        SELECT "
+"          * "
+"        FROM "
+"          T_RLSD_PUCH_ODR A,M_WH C "
+"        WHERE "
+"          A.PLANT_CD = ? "
+"          AND A.ITEM_CD = ? "
+"          AND A.PUCH_ODR_DLV_DATE >= ? "
+"          AND A.PUCH_ODR_STS_TYP IN (1, 2) "
+"          AND A.PUCH_ODR_CD = B.PUCH_ODR_CD "
+"          AND A.WH_CD = C.WH_CD "
+"          AND C.MRP_FLG = '1' "
+"      ) "
+"  ) TEMPB";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectOdrQTY2_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectOdrQTY2_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY2_read
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY2", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOdrQTY2_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY2_read2
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectOdrQTY2_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY2_read3
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectOdrQTY2_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getTERM2STARTDATE());
				if(isNull(data.getTERM2STARTDATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getTERM2STARTDATE());
				if(isNull(data.getTERM2STARTDATE())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectOdrQTY2", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTERM2STARTDATE())) setString(no ++, data.getTERM2STARTDATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTERM2STARTDATE())) setString(no ++, data.getTERM2STARTDATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setRECEIPT_SCHEDULES_NUMBER2( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectOdrQTY2", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOdrQTY2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOdrQTY2_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectOdrQTY2_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectOdrQTY2_clear

			return;
		}

		/**
		 * SelectOdrQTY2�N���X�̕W���R���X�g���N�^
		 */
		public SelectOdrQTY2()
		{
			//{{user_implement_dev:SelectOdrQTY2_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectOdrQTY2_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectReceiptTerm extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'RECEIPT_SCHEDULES_TERM'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectReceiptTerm_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectReceiptTerm_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptTerm_read
			if(m_selcmd==null) throw new FoundationException("SelectReceiptTerm", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectReceiptTerm_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptTerm_read2
			if(m_selcmd==null) throw new FoundationException("SelectReceiptTerm", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectReceiptTerm_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptTerm_read3
			if(m_selcmd==null) throw new FoundationException("SelectReceiptTerm", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectReceiptTerm_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setRECEIPT_SCHEDULES_TERM( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectReceiptTerm", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptTerm_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectReceiptTerm_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectReceiptTerm_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectReceiptTerm_clear

			return;
		}

		/**
		 * SelectReceiptTerm�N���X�̕W���R���X�g���N�^
		 */
		public SelectReceiptTerm()
		{
			//{{user_implement_dev:SelectReceiptTerm_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectReceiptTerm_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectReceiptNumber extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'RECEIPT_SCHEDULES_NUMBER'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectReceiptNumber_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectReceiptNumber_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptNumber_read
			if(m_selcmd==null) throw new FoundationException("SelectReceiptNumber", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectReceiptNumber_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptNumber_read2
			if(m_selcmd==null) throw new FoundationException("SelectReceiptNumber", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectReceiptNumber_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptNumber_read3
			if(m_selcmd==null) throw new FoundationException("SelectReceiptNumber", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectReceiptNumber_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setRECEIPT_SCHEDULES_NUMBER( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectReceiptNumber", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectReceiptNumber_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectReceiptNumber_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectReceiptNumber_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectReceiptNumber_clear

			return;
		}

		/**
		 * SelectReceiptNumber�N���X�̕W���R���X�g���N�^
		 */
		public SelectReceiptNumber()
		{
			//{{user_implement_dev:SelectReceiptNumber_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectReceiptNumber_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectItem extends DataObject
	{
		protected String m_selcmd = "select "
+"  A.\"ITEM_NAME\" as \"ITEM_NAME\" "
+"from "
+"  M_ITEM A "
+"where "
+"  A.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectItem_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectItem_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectItem_read
			if(m_selcmd==null) throw new FoundationException("SelectItem", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectItem_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectItem_read2
			if(m_selcmd==null) throw new FoundationException("SelectItem", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectItem_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectItem_read3
			if(m_selcmd==null) throw new FoundationException("SelectItem", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectItem_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getLower_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setLower_ITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectItem", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectItem_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectItem_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectItem_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectItem_clear

			return;
		}

		/**
		 * SelectItem�N���X�̕W���R���X�g���N�^
		 */
		public SelectItem()
		{
			//{{user_implement_dev:SelectItem_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectItem_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectDetail extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"Det_Parent_ITEM_CD\", "
+"  M_ITEM_Parent.\"ITEM_NAME\" as \"Det_Parent_ITEM_NAME\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"Det_Comp_ITEM_CD\", "
+"  M_ITEM_Comp.\"ITEM_NAME\" as \"Det_Comp_ITEM_NAME\", "
+"  M_ITEM_Comp.\"STOCK_UNIT\" as \"Det_Comp_STOCK_UNIT\", "
+"  M_ITEM_Comp.\"PRODUCT_TYP\" AS \"Det_Comp_PRODUCT_TYP\", "
+"  M_ITEM_Comp.\"MRP_ODR_TYP\" as \"Det_Comp_MRP_ODR_TYP\", "
+"  M_ITEM_Comp.\"OUTSIDE_TYP\" as \"Det_Comp_OUTSIDE_TYP\", "
+"  to_char(M_PS.\"PS_UNIT_NUMERATOR\", 'FM99999999999990.0999') || '/' || to_char(M_PS.\"PS_UNIT_DENOMINATOR\", 'FM99999999999990.0999') as \"Det_Comp_PS_UNIT_QTY\", "
+"  M_ITEM_Comp.\"ITEM_SPOIL\" as \"Det_Comp_ITEM_SPOIL\", "
+"  to_char(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"Det_EFF_PHASE_IN_DATE\", "
+"  to_char(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"Det_EFF_PHASE_OUT_DATE\", "
+"  to_char(M_PS.\"PS_SPOIL\", 'FM99990.0999') as \"Det_Comp_PS_SPOIL\", "
+"  M_PS.\"CONS_TYP\" as \"Det_Comp_CONS_TYP\" "
+"from "
+"  M_ITEM M_ITEM_Parent, "
+"  M_ITEM M_ITEM_Comp, "
+"  M_PS M_PS "
+"where "
+"  M_ITEM_Parent.\"ITEM_CD\" = M_PS.\"PARENT_ITEM_CD\" "
+"  and M_ITEM_Comp.\"ITEM_CD\" = M_PS.\"COMP_ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDetail_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectDetail_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDetail_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read2
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDetail_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read3
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectDetail_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDet_Parent_ITEM_CD());
				if(isNull(data.getDet_Parent_ITEM_CD())) isNull = true;
				ary.addElement(data.getDet_Comp_ITEM_CD());
				if(isNull(data.getDet_Comp_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getDet_Parent_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getDet_Comp_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setDet_Parent_ITEM_CD( getString(1, rs) );
			data.setDet_Parent_ITEM_NAME( getString(2, rs) );
			data.setDet_Comp_ITEM_CD( getString(3, rs) );
			data.setDet_Comp_ITEM_NAME( getString(4, rs) );
			data.setDet_Comp_STOCK_UNIT( getString(5, rs) );
			data.setDet_Comp_PRODUCT_TYP( getString(6, rs) );
			data.setDet_Comp_MRP_ODR_TYP( getString(7, rs) );
			data.setDet_Comp_OUTSIDE_TYP( getString(8, rs) );
			data.setDet_Comp_PS_UNIT_QTY( getString(9, rs) );
			data.setDet_Comp_ITEM_SPOIL( getString(10, rs) );
			data.setDet_Comp_EFF_PHASE_IN_DATE( getString(11, rs) );
			data.setDet_Comp_EFF_PHASE_OUT_DATE( getString(12, rs) );
			data.setDet_Comp_PS_SPOIL( getString(13, rs) );
			data.setDet_Comp_CONS_TYP( getString(14, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDetail_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDetail_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectDetail_clear

			return;
		}

		/**
		 * SelectDetail�N���X�̕W���R���X�g���N�^
		 */
		public SelectDetail()
		{
			//{{user_implement_dev:SelectDetail_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectDetail_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectStock extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  NVL(ONHAND_QTY1, 0) + NVL(ONHAND_QTY2, 0) ONHAND_QTY "
+"FROM "
+"  ( "
+"    SELECT "
+"      SUM(A.\"STOCK_ON_HAND_QTY\") ONHAND_QTY1 "
+"    FROM "
+"      T_ITEM_STOCK A, "
+"      M_WH C "
+"    WHERE "
+"      A.\"ITEM_CD\" = ? "
+"      AND A.\"PLANT_CD\" = ? "
+"      AND A.\"WH_CD\" = C.\"WH_CD\" "
+"      AND C.\"MRP_FLG\" = '1' "
+"  ), "
+"  ( "
+"    SELECT "
+"      SUM(B.\"STOCK_ON_HAND_QTY\") ONHAND_QTY2 "
+"    FROM "
+"      T_JOB_ODR_CD_STOCK B, "
+"      M_WH D "
+"    WHERE "
+"      B.\"ITEM_CD\" = ? "
+"      AND B.\"PLANT_CD\" = ? "
+"      AND B.\"WH_CD\" = D.\"WH_CD\" "
+"      AND D.\"MRP_FLG\" = '1' "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectStock_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectStock_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectStock_read
			if(m_selcmd==null) throw new FoundationException("SelectStock", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectStock_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectStock_read2
			if(m_selcmd==null) throw new FoundationException("SelectStock", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectStock_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectStock_read3
			if(m_selcmd==null) throw new FoundationException("SelectStock", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectStock_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectStock", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLower_ITEM_CD())) setString(no ++, data.getLower_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setONHAND_STOCK( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectStock", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectStock_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectStock_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectStock_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectStock_clear

			return;
		}

		/**
		 * SelectStock�N���X�̕W���R���X�g���N�^
		 */
		public SelectStock()
		{
			//{{user_implement_dev:SelectStock_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectStock_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectUNIT_QTY_TYP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  A.\"UNIT_QTY_TYP\" UNIT_QTY_TYP "
+"FROM "
+"  M_ITEM A "
+"WHERE "
+"  A.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectUNIT_QTY_TYP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectUNIT_QTY_TYP_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectUNIT_QTY_TYP_read
			if(m_selcmd==null) throw new FoundationException("SelectUNIT_QTY_TYP", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectUNIT_QTY_TYP_read2
			if(m_selcmd==null) throw new FoundationException("SelectUNIT_QTY_TYP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectUNIT_QTY_TYP_read3
			if(m_selcmd==null) throw new FoundationException("SelectUNIT_QTY_TYP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getLower_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setUNIT_QTY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectUNIT_QTY_TYP", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectUNIT_QTY_TYP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectUNIT_QTY_TYP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_clear

			return;
		}

		/**
		 * SelectUNIT_QTY_TYP�N���X�̕W���R���X�g���N�^
		 */
		public SelectUNIT_QTY_TYP()
		{
			//{{user_implement_dev:SelectUNIT_QTY_TYP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectUNIT_QTY_TYP_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectNeed_QTY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  ROUND(? * A.\"PS_UNIT_NUMERATOR\" / A.\"PS_UNIT_DENOMINATOR\",4) NEED_QTY "
+"FROM "
+"  M_PS A "
+"WHERE "
+"  A.\"PARENT_ITEM_CD\" = ? "
+"  AND A.\"COMP_ITEM_CD\" = ? "
+"  AND A.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeed_QTY_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectNeed_QTY_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTY_read
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTY", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNeed_QTY_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTY_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTY", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNeed_QTY_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTY_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTY", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNeed_QTY_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUpper_NEED_QTY());
				if(isNull(data.getUpper_NEED_QTY())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getUpper_NEED_QTY(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getLower_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setLower_NEED_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTY", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNeed_QTY_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeed_QTY_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectNeed_QTY_clear

			return;
		}

		/**
		 * SelectNeed_QTY�N���X�̕W���R���X�g���N�^
		 */
		public SelectNeed_QTY()
		{
			//{{user_implement_dev:SelectNeed_QTY_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectNeed_QTY_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectNeed_QTYReverse extends DataObject
	{
		protected String m_selcmd = "SELECT "
+" ROUND(?* A.\"PS_UNIT_DENOMINATOR\" / A.\"PS_UNIT_NUMERATOR\",4) NEED_QTY "
+"FROM "
+"  M_PS A "
+"WHERE "
+"  A.\"PARENT_ITEM_CD\" = ? "
+"  AND A.\"COMP_ITEM_CD\" = ? "
+"  AND A.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectNeed_QTYReverse_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectNeed_QTYReverse_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTYReverse_read
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTYReverse", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNeed_QTYReverse_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTYReverse_read2
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTYReverse", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNeed_QTYReverse_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTYReverse_read3
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTYReverse", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectNeed_QTYReverse_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUpper_NEED_QTY());
				if(isNull(data.getUpper_NEED_QTY())) isNull = true;
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getUpper_NEED_QTY(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getLower_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setLower_NEED_QTY( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectNeed_QTYReverse", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectNeed_QTYReverse_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectNeed_QTYReverse_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectNeed_QTYReverse_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectNeed_QTYReverse_clear

			return;
		}

		/**
		 * SelectNeed_QTYReverse�N���X�̕W���R���X�g���N�^
		 */
		public SelectNeed_QTYReverse()
		{
			//{{user_implement_dev:SelectNeed_QTYReverse_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectNeed_QTYReverse_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class TreeSelect extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  M_ITEM.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
+"  M_ITEM.\"ITEM_SPOIL\" AS \"ITEM_SPOIL\", "
+"  M_ITEM.\"SPEC\" AS \"SPEC\", "
+"  M_PS.\"PS_EDITION\" AS \"PS_EDITION\", "
+"  M_PS.\"EFF_PHASE_IN_DATE\" AS \"EFF_PHASE_IN_DATE\", "
+"  M_PS.\"EFF_PHASE_OUT_DATE\" AS \"EFF_PHASE_OUT_DATE\", "
+"  M_PS.\"PS_SPOIL\" AS \"PS_SPOIL\", "
+"  M_PS.\"CONS_TYP\" AS \"CONS_TYP\", "
+"  M_PS.\"PARENT_ITEM_CD\" AS \"PARENT_ITEM_CD\", "
+"  M_PS.\"COMP_ITEM_CD\" AS \"COMP_ITEM_CD\", "
+"  M_PS.\"PS_UNIT_NUMERATOR\" AS \"PS_UNIT_NUMERATOR\", "
+"  M_PS.\"PS_UNIT_DENOMINATOR\" AS \"PS_UNIT_DENOMINATOR\", "
+"  M_PLANT.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_ITEM, "
+"  M_PS, "
+"  M_PLANT "
+"WHERE "
+"  M_PS.\"PARENT_ITEM_CD\" = ? "
+"  AND M_PS.\"COMP_ITEM_CD\" = ? "
+"  AND M_PS.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:TreeSelect_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:TreeSelect_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:TreeSelect_read
			if(m_selcmd==null) throw new FoundationException("TreeSelect", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:TreeSelect_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:TreeSelect_read2
			if(m_selcmd==null) throw new FoundationException("TreeSelect", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:TreeSelect_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:TreeSelect_read3
			if(m_selcmd==null) throw new FoundationException("TreeSelect", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:TreeSelect_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPARENT_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getCOMP_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setTarget_ITEM_CD( getString(1, rs) );
			data.setLower_ITEM_NAME( getString(2, rs) );
			data.setDet_Comp_OUTSIDE_TYP( getString(3, rs) );
			data.setDet_Comp_MRP_ODR_TYP( getString(4, rs) );
			data.setDet_Comp_STOCK_UNIT( getString(5, rs) );
			data.setDet_Comp_PRODUCT_TYP( getString(6, rs) );
			data.setDet_Comp_ITEM_SPOIL( getString(7, rs) );
			data.setSPEC( getString(8, rs) );
			data.setPS_EDITION( getString(9, rs) );
			data.setDet_Comp_EFF_PHASE_IN_DATE( getString(10, rs) );
			data.setDet_Comp_EFF_PHASE_OUT_DATE( getString(11, rs) );
			data.setDet_Comp_PS_SPOIL( getString(12, rs) );
			data.setDet_Comp_CONS_TYP( getString(13, rs) );
			data.setPARENT_ITEM_CD( getString(14, rs) );
			data.setCOMP_ITEM_CD( getString(15, rs) );
			data.setNUMERATOR( getString(16, rs) );
			data.setDENOMINATOR( getString(17, rs) );
			data.setPLANT_CD( getString(18, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("TreeSelect", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:TreeSelect_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:TreeSelect_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:TreeSelect_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:TreeSelect_clear

			return;
		}

		/**
		 * TreeSelect�N���X�̕W���R���X�g���N�^
		 */
		public TreeSelect()
		{
			//{{user_implement_dev:TreeSelect_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:TreeSelect_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectM_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS \"PRODUCT_TYP\" "
+"from "
+"  M_ITEM, "
+"  SYS_TYPE_VALUE "
+"where "
+"  M_ITEM.\"ITEM_CD\" = ? "
+"  AND SYS_TYPE_VALUE.NAME = 'PRODUCT_TYP' "
+"  AND M_ITEM.PRODUCT_TYP = SYS_TYPE_VALUE.VALUE";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_ITEM_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_ITEM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_ITEM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_ITEM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTarget_ITEM_CD());
				if(isNull(data.getTarget_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getTarget_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setTarget_ITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setSTOCK_UNIT( getString(3, rs) );
			data.setPRODUCT_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_ITEM", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_ITEM_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_ITEM_clear

			return;
		}

		/**
		 * selectM_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public selectM_ITEM()
		{
			//{{user_implement_dev:selectM_ITEM_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectSYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(BUSINESS_OPR_DATE, 'YYYY/MM/DD') AS BUSINESS_OPR_DATE "
+"FROM "
+"  SYS_DATE_CTRL "
+"WHERE "
+"  PLANT_CD = ?";
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
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_read
			if(m_selcmd==null) throw new FoundationException("selectSYS_DATE_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
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
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
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
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setTargetDate( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSYS_DATE_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSYS_DATE_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
	public class selectM_PS extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_NAME AS ITEM_NAME, "
+"  M_ITEM.SPEC AS SPEC, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS PRODUCT_TYP, "
+"  M_ITEM.STOCK_UNIT AS STOCK_UNIT, "
+"  M_PS.PARENT_ITEM_CD AS PARENT_ITEM_CD, "
+"  M_PS.COMP_ITEM_CD AS COMP_ITEM_CD, "
+"  M_PS.PS_UNIT_DENOMINATOR AS PS_UNIT_DENOMINATOR, "
+"  M_PS.PS_UNIT_NUMERATOR AS PS_UNIT_NUMERATOR "
+"FROM "
+"  M_ITEM, "
+"  M_PS, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  M_PS.COMP_ITEM_CD = M_ITEM.ITEM_CD "
+"  AND SYS_TYPE_VALUE.NAME = 'PRODUCT_TYP' "
+"  AND M_ITEM.PRODUCT_TYP = SYS_TYPE_VALUE.VALUE "
+"  AND M_ITEM.ITEM_CD = ? "
+"  AND M_PS.PARENT_ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_PS_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_PS_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_PS_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTarget_ITEM_CD());
				if(isNull(data.getTarget_ITEM_CD())) isNull = true;
				ary.addElement(data.getPARENT_ITEM_CD());
				if(isNull(data.getPARENT_ITEM_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectM_PS", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getTarget_ITEM_CD())) setString(no ++, data.getTarget_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPARENT_ITEM_CD())) setString(no ++, data.getPARENT_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setCOMP_ITEM_NAME( getString(1, rs) );
			data.setSPEC( getString(2, rs) );
			data.setPRODUCT_TYP( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setPARENT_ITEM_CD( getString(5, rs) );
			data.setCOMP_ITEM_CD( getString(6, rs) );
			data.setDENOMINATOR( getString(7, rs) );
			data.setNUMERATOR( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_PS_clear

			return;
		}

		/**
		 * selectM_PS�N���X�̕W���R���X�g���N�^
		 */
		public selectM_PS()
		{
			//{{user_implement_dev:selectM_PS_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_PS_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class select_M_ITEM_VIEW extends DataObject
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

		//{{user_implement_dev:select_M_ITEM_VIEW_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:select_M_ITEM_VIEW_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_M_ITEM_VIEW_read
			if(m_selcmd==null) throw new FoundationException("select_M_ITEM_VIEW", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_M_ITEM_VIEW_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_M_ITEM_VIEW_read2
			if(m_selcmd==null) throw new FoundationException("select_M_ITEM_VIEW", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_M_ITEM_VIEW_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_M_ITEM_VIEW_read3
			if(m_selcmd==null) throw new FoundationException("select_M_ITEM_VIEW", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_M_ITEM_VIEW_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD_VIEW());
				if(isNull(data.getITEM_CD_VIEW())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD_VIEW(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_M_ITEM_VIEW", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_M_ITEM_VIEW_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_M_ITEM_VIEW_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_M_ITEM_VIEW_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:select_M_ITEM_VIEW_clear

			return;
		}

		/**
		 * select_M_ITEM_VIEW�N���X�̕W���R���X�g���N�^
		 */
		public select_M_ITEM_VIEW()
		{
			//{{user_implement_dev:select_M_ITEM_VIEW_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:select_M_ITEM_VIEW_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectM_PS_Forward extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.ITEM_NAME AS ITEM_NAME, "
+"  M_ITEM.SPEC AS SPEC, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS PRODUCT_TYP, "
+"  M_ITEM.STOCK_UNIT AS STOCK_UNIT, "
+"  M_PS.PARENT_ITEM_CD AS PARENT_ITEM_CD, "
+"  M_PS.COMP_ITEM_CD AS COMP_ITEM_CD, "
+"  M_PS.PS_UNIT_DENOMINATOR AS PS_UNIT_DENOMINATOR, "
+"  M_PS.PS_UNIT_NUMERATOR AS PS_UNIT_NUMERATOR "
+"FROM "
+"  M_ITEM, "
+"  M_PS, "
+"  SYS_TYPE_VALUE "
+"WHERE "
+"  M_PS.PARENT_ITEM_CD = M_ITEM.ITEM_CD "
+"  AND SYS_TYPE_VALUE.NAME = 'PRODUCT_TYP' "
+"  AND M_ITEM.PRODUCT_TYP = SYS_TYPE_VALUE.VALUE "
+"  AND M_ITEM.ITEM_CD = ? "
+"  AND M_PS.COMP_ITEM_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_PS_Forward_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_PS_Forward_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_Forward_read
			if(m_selcmd==null) throw new FoundationException("selectM_PS_Forward", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_Forward_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_Forward_read2
			if(m_selcmd==null) throw new FoundationException("selectM_PS_Forward", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_PS_Forward_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_Forward_read3
			if(m_selcmd==null) throw new FoundationException("selectM_PS_Forward", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_PS_Forward_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTarget_ITEM_CD());
				if(isNull(data.getTarget_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectM_PS_Forward", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getTarget_ITEM_CD())) setString(no ++, data.getTarget_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMP_ITEM_CD())) setString(no ++, data.getCOMP_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setPARENT_ITEM_NAME( getString(1, rs) );
			data.setSPEC( getString(2, rs) );
			data.setPRODUCT_TYP( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setPARENT_ITEM_CD( getString(5, rs) );
			data.setCOMP_ITEM_CD( getString(6, rs) );
			data.setDENOMINATOR( getString(7, rs) );
			data.setNUMERATOR( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_PS_Forward", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_PS_Forward_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_PS_Forward_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_PS_Forward_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_PS_Forward_clear

			return;
		}

		/**
		 * selectM_PS_Forward�N���X�̕W���R���X�g���N�^
		 */
		public selectM_PS_Forward()
		{
			//{{user_implement_dev:selectM_PS_Forward_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_PS_Forward_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SelectM_PS_F extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.SPEC AS SPEC, "
+"  SYS_TYPE_VALUE.DISPLAY_NAME AS PRODUCT_TYP, "
+"  M_ITEM.STOCK_UNIT AS STOCK_UNIT, "
+"  M_PS.PARENT_ITEM_CD AS PARENT_ITEM_CD, "
+"  M_PS.COMP_ITEM_CD AS COMP_ITEM_CD, "
+"  M_PS.PS_EDITION AS PS_EDITION, "
+"  M_PS.PS_UNIT_DENOMINATOR AS PS_UNIT_DENOMINATOR, "
+"  M_PS.PS_UNIT_NUMERATOR AS PS_UNIT_NUMERATOR, "
+"  X.\"ITEM_NAME\" as \"PARENT_ITEM_NAME\", "
+"  M_ITEM.\"ITEM_NAME\" as \"COMP_ITEM_NAME\" "
+"from "
+"  M_PS, "
+"  M_ITEM, "
+"  M_ITEM X, "
+"  SYS_TYPE_VALUE "
+"where "
+"  M_PS.\"COMP_ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  AND SYS_TYPE_VALUE.NAME = 'PRODUCT_TYP' "
+"  AND M_ITEM.PRODUCT_TYP = SYS_TYPE_VALUE.VALUE "
+"  and M_PS.\"PARENT_ITEM_CD\" = X.\"ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"EFF_PHASE_IN_DATE\" <= TO_DATE(?) "
+"  and M_PS.\"EFF_PHASE_OUT_DATE\" >= TO_DATE(?)";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectM_PS_F_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SelectM_PS_F_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AE0090040Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AE0090040Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_PS_F_read
			if(m_selcmd==null) throw new FoundationException("SelectM_PS_F", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_PS_F_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_PS_F_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_PS_F", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectM_PS_F_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AE0090040Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_PS_F_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_PS_F", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SelectM_PS_F_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AE0090040Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getTarget_ITEM_CD());
				if(isNull(data.getTarget_ITEM_CD())) isNull = true;
				ary.addElement(data.getCOMP_ITEM_CD());
				if(isNull(data.getCOMP_ITEM_CD())) isNull = true;
				ary.addElement(data.getTargetDate());
				if(isNull(data.getTargetDate())) isNull = true;
				ary.addElement(data.getTargetDate());
				if(isNull(data.getTargetDate())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectM_PS_F", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getTarget_ITEM_CD())) setString(no ++, data.getTarget_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getCOMP_ITEM_CD())) setString(no ++, data.getCOMP_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTargetDate())) setString(no ++, data.getTargetDate(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getTargetDate())) setString(no ++, data.getTargetDate(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AE0090040Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AE0090040Struct data = new AE0090040Struct();

			data.setSPEC( getString(1, rs) );
			data.setPRODUCT_TYP( getString(2, rs) );
			data.setSTOCK_UNIT( getString(3, rs) );
			data.setPARENT_ITEM_CD( getString(4, rs) );
			data.setCOMP_ITEM_CD( getString(5, rs) );
			data.setPS_EDITION( getString(6, rs) );
			data.setDENOMINATOR( getString(7, rs) );
			data.setNUMERATOR( getString(8, rs) );
			data.setPARENT_ITEM_NAME( getString(9, rs) );
			data.setCOMP_ITEM_NAME( getString(10, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_PS_F", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AE0090040Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AE0090040Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_PS_F_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_PS_F_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AE0090040Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_PS_F_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SelectM_PS_F_clear

			return;
		}

		/**
		 * SelectM_PS_F�N���X�̕W���R���X�g���N�^
		 */
		public SelectM_PS_F()
		{
			//{{user_implement_dev:SelectM_PS_F_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SelectM_PS_F_constractor

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
		mSelectPlant.clear();
		mSelectPlant = null;
		mSelectOdrQTY1.clear();
		mSelectOdrQTY1 = null;
		mSelectOdrQTY2.clear();
		mSelectOdrQTY2 = null;
		mSelectReceiptTerm.clear();
		mSelectReceiptTerm = null;
		mSelectReceiptNumber.clear();
		mSelectReceiptNumber = null;
		mSelectItem.clear();
		mSelectItem = null;
		mSelectDetail.clear();
		mSelectDetail = null;
		mSelectStock.clear();
		mSelectStock = null;
		mSelectUNIT_QTY_TYP.clear();
		mSelectUNIT_QTY_TYP = null;
		mSelectNeed_QTY.clear();
		mSelectNeed_QTY = null;
		mSelectNeed_QTYReverse.clear();
		mSelectNeed_QTYReverse = null;
		mTreeSelect.clear();
		mTreeSelect = null;
		mselectM_ITEM.clear();
		mselectM_ITEM = null;
		mselectSYS_DATE_CTRL.clear();
		mselectSYS_DATE_CTRL = null;
		mselectM_PS.clear();
		mselectM_PS = null;
		mselect_M_ITEM_VIEW.clear();
		mselect_M_ITEM_VIEW = null;
		mselectM_PS_Forward.clear();
		mselectM_PS_Forward = null;
		mSelectM_PS_F.clear();
		mSelectM_PS_F = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AE0090040�N���X�̕W���R���X�g���N�^
	 */
	public AE0090040Entity() throws FoundationException
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
