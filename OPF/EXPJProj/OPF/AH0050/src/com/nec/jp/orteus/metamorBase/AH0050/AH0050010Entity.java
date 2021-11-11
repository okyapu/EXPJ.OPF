/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/src/com/nec/jp/orteus/metamorBase/AH0050/AH0050010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0050;

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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0050010Entity extends DataObject
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

	// T_INV_CTRL�N���X �C���X�^���X
	public T_INV_CTRL mT_INV_CTRL = new T_INV_CTRL();

	// M_WH�N���X �C���X�^���X
	public M_WH mM_WH = new M_WH();

	// T_ITEM_INV�N���X �C���X�^���X
	public T_ITEM_INV mT_ITEM_INV = new T_ITEM_INV();

	// T_JOB_ODR_CD_INV�N���X �C���X�^���X
	public T_JOB_ODR_CD_INV mT_JOB_ODR_CD_INV = new T_JOB_ODR_CD_INV();

	// T_ITEM_INV4Update�N���X �C���X�^���X
	public T_ITEM_INV4Update mT_ITEM_INV4Update = new T_ITEM_INV4Update();

	// T_JOB_ODR_CD_INV4Update�N���X �C���X�^���X
	public T_JOB_ODR_CD_INV4Update mT_JOB_ODR_CD_INV4Update = new T_JOB_ODR_CD_INV4Update();

	// T_INV_CTRL_INV_STS_TYP1�N���X �C���X�^���X
	public T_INV_CTRL_INV_STS_TYP1 mT_INV_CTRL_INV_STS_TYP1 = new T_INV_CTRL_INV_STS_TYP1();

	// M_ITEM�N���X �C���X�^���X
	public M_ITEM mM_ITEM = new M_ITEM();

	// T_OD�N���X �C���X�^���X
	public T_OD mT_OD = new T_OD();

	// T_INV_CYCLE�N���X �C���X�^���X
	public T_INV_CYCLE mT_INV_CYCLE = new T_INV_CYCLE();

	// T_INV_TARGET_ITEM�N���X �C���X�^���X
	public T_INV_TARGET_ITEM mT_INV_TARGET_ITEM = new T_INV_TARGET_ITEM();

	// T_INV_TARGET_WH�N���X �C���X�^���X
	public T_INV_TARGET_WH mT_INV_TARGET_WH = new T_INV_TARGET_WH();

	// SELECT_SYS_PARAMETER�N���X �C���X�^���X
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// SELECT_SYS_ACTUAL_COST_CTRL_AC�N���X �C���X�^���X
	public SELECT_SYS_ACTUAL_COST_CTRL_AC mSELECT_SYS_ACTUAL_COST_CTRL_AC = new SELECT_SYS_ACTUAL_COST_CTRL_AC();

	// selectT_LOT_INVLotNo�N���X �C���X�^���X
	public selectT_LOT_INVLotNo mselectT_LOT_INVLotNo = new selectT_LOT_INVLotNo();

	// selectActualStockQty2�N���X �C���X�^���X
	public selectActualStockQty2 mselectActualStockQty2 = new selectActualStockQty2();

	// T_LOT_INV4Update�N���X �C���X�^���X
	public T_LOT_INV4Update mT_LOT_INV4Update = new T_LOT_INV4Update();

	// selectActualStockQty�N���X �C���X�^���X
	public selectActualStockQty mselectActualStockQty = new selectActualStockQty();

	// updateT_LOT_INV�N���X �C���X�^���X
	public updateT_LOT_INV mupdateT_LOT_INV = new updateT_LOT_INV();

	// select_T_LOT_NO�N���X �C���X�^���X
	public select_T_LOT_NO mselect_T_LOT_NO = new select_T_LOT_NO();

	// select_T_LOT_CTRL_2�N���X �C���X�^���X
	public select_T_LOT_CTRL_2 mselect_T_LOT_CTRL_2 = new select_T_LOT_CTRL_2();

	// Select_SYS_DATE_CTRL�N���X �C���X�^���X
	public Select_SYS_DATE_CTRL mSelect_SYS_DATE_CTRL = new Select_SYS_DATE_CTRL();

	// select_T_LOT_CTRL�N���X �C���X�^���X
	public select_T_LOT_CTRL mselect_T_LOT_CTRL = new select_T_LOT_CTRL();

	// update_T_LOT_CTRL�N���X �C���X�^���X
	public update_T_LOT_CTRL mupdate_T_LOT_CTRL = new update_T_LOT_CTRL();

	// create_T_LOT_INV�N���X �C���X�^���X
	public create_T_LOT_INV mcreate_T_LOT_INV = new create_T_LOT_INV();

	// selectActualStockQty1�N���X �C���X�^���X
	public selectActualStockQty1 mselectActualStockQty1 = new selectActualStockQty1();

	// selectApprFlg�N���X �C���X�^���X
	public selectApprFlg mselectApprFlg = new selectApprFlg();

	// T_JOB_ODR_CD_INVCnt�N���X �C���X�^���X
	public T_JOB_ODR_CD_INVCnt mT_JOB_ODR_CD_INVCnt = new T_JOB_ODR_CD_INVCnt();

	// selectT_LOT_INVLotNoCnt�N���X �C���X�^���X
	public selectT_LOT_INVLotNoCnt mselectT_LOT_INVLotNoCnt = new selectT_LOT_INVLotNoCnt();

	// selectActualStockQty2Cnt�N���X �C���X�^���X
	public selectActualStockQty2Cnt mselectActualStockQty2Cnt = new selectActualStockQty2Cnt();


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
                        //}}user_implement_dev:ei_CSVOut_constractor

			return;
		}

		//////////////////////////////

		// csv�p�̕ϐ�
		String m_write_path="D:/Orteus/csv/";
		String m_write_fname="AH0050010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AH0050010";

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
	public class T_INV_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(T_INV_CTRL.\"INV_DATE\", 'YYYY/MM/DD') as \"INV_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"REGULAR_INV_FLG\", 'fm0') as \"REGULAR_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"CYCLE_INV_FLG\", 'fm0') as \"CYCLE_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"TEMP_INV_FLG\", 'fm0') as \"TEMP_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_STS_TYP\", 'fm90') as \"INV_STS_TYP\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_START_DATE\", 'YYYY/MM/DD') as \"INV_START_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"STOCK_SAVE_DATE\", 'YYYY/MM/DD HH24:MI:SS') as \"STOCK_SAVE_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_UPDATED_DATE\", 'YYYY/MM/DD HH24:MI:SS') as \"INV_UPDATED_DATE\", "
+"  T_INV_CTRL.\"INV_COMMENT\" as \"INV_COMMENT\", "
+"  T_INV_CTRL.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_INV_CTRL "
+"where "
+"  T_INV_CTRL.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_INV_CTRL.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_INV_CTRL_def
                //}}user_implement_dev:T_INV_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_read
                        if(m_selcmd==null) throw new FoundationException("T_INV_CTRL", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setINV_DATE( getString(1, rs) );
			data.setREGULAR_INV_FLG( getString(2, rs) );
			data.setCYCLE_INV_FLG( getString(3, rs) );
			data.setTEMP_INV_FLG( getString(4, rs) );
			data.setINV_STS_TYP( getString(5, rs) );
			data.setINV_START_DATE( getString(6, rs) );
			data.setSTOCK_SAVE_DATE( getString(7, rs) );
			data.setINV_UPDATED_DATE( getString(8, rs) );
			data.setINV_COMMENT( getString(9, rs) );
			data.setMODIFY_COUNT( getString(10, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_INV_CTRL", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_INV_CTRL_clear
                        //}}user_implement_dev:T_INV_CTRL_clear

			return;
		}

		/**
		 * T_INV_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public T_INV_CTRL()
		{
			//{{user_implement_dev:T_INV_CTRL_constractor
                        //}}user_implement_dev:T_INV_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\", "
+"  M_WH.\"PLANT_CD\" as \"PLANT_CD\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:M_WH_def
                //}}user_implement_dev:M_WH_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_read
                        if(m_selcmd==null) throw new FoundationException("M_WH", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
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
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setWH_CD( getString(1, rs) );
			data.setWH_NAME( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("M_WH", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:M_WH_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("M_WH", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:M_WH_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
                        //}}user_implement_dev:M_WH_clear

			return;
		}

		/**
		 * M_WH�N���X�̕W���R���X�g���N�^
		 */
		public M_WH()
		{
			//{{user_implement_dev:M_WH_constractor
                        //}}user_implement_dev:M_WH_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_ITEM_INV extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  TO_CHAR(T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"  TO_CHAR(T_ITEM_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_ITEM_INV, "
+"  M_ITEM "
+"where "
+"  T_ITEM_INV.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and T_ITEM_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_ITEM_INV.\"PLANT_CD\" = ? "
+"  and T_ITEM_INV.\"ITEM_CD\" like ? "
+"  and T_ITEM_INV.\"WH_CD\" = ? "
+"order by "
+"  T_ITEM_INV.\"WH_CD\", "
+"  T_ITEM_INV.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_ITEM_INV(\"INV_DATE\", \"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"ACTUAL_STOCK_QTY\") "
+"values "
+"  (TO_DATE(?, 'YYYY/MM/DD'), ?, ?, ?, TO_NUMBER(?))";
		protected String m_updcmd = "update "
+"  T_ITEM_INV "
+"set "
+"  \"ACTUAL_STOCK_QTY\" = TO_NUMBER(?) "
+"where "
+"  T_ITEM_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_ITEM_INV.\"PLANT_CD\" = ? "
+"  and T_ITEM_INV.\"ITEM_CD\" = ? "
+"  and T_ITEM_INV.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_ITEM_INV_def
                //}}user_implement_dev:T_ITEM_INV_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV_read
                        if(m_selcmd==null) throw new FoundationException("T_ITEM_INV", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_ITEM_INV_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV_read2
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_ITEM_INV_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV_read3
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_ITEM_INV_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_ITEM_INV", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setFINAL_BOOK_STOCK_QTY( getString(3, rs) );
			data.setACTUAL_STOCK_QTY( getString(4, rs) );
			data.setSTOCK_UNIT( getString(5, rs) );
			data.setUNIT_QTY_TYP( getString(6, rs) );
			data.setMODIFY_COUNT( getString(7, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_ITEM_INV", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_ITEM_INV_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getINV_DATE(), stmt);
				setString(8, data.getITEM_CD(), stmt);
				setString(9, data.getWH_CD(), stmt);
				setString(10, data.getPLANT_CD(), stmt);
				setString(11, data.getACTUAL_STOCK_QTY(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getACTUAL_STOCK_QTY(), stmt);
				setString(5, data.getINV_DATE(), stmt);
				setString(6, data.getPLANT_CD(), stmt);
				setString(7, data.getITEM_CD(), stmt);
				setString(8, data.getWH_CD(), stmt);

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
			//{{user_implement_dev:T_ITEM_INV_clear
                        //}}user_implement_dev:T_ITEM_INV_clear

			return;
		}

		/**
		 * T_ITEM_INV�N���X�̕W���R���X�g���N�^
		 */
		public T_ITEM_INV()
		{
			//{{user_implement_dev:T_ITEM_INV_constractor
                        //}}user_implement_dev:T_ITEM_INV_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_JOB_ODR_CD_INV extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_JOB_ODR_CD_INV.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  TO_CHAR(T_JOB_ODR_CD_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"  TO_CHAR(T_JOB_ODR_CD_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  T_JOB_ODR_CD_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_JOB_ODR_CD_INV, "
+"  M_ITEM "
+"where "
+"  T_JOB_ODR_CD_INV.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and T_JOB_ODR_CD_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_JOB_ODR_CD_INV.\"PLANT_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"ITEM_CD\" like ? "
+"  and T_JOB_ODR_CD_INV.\"WH_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"JOB_ODR_CD\" like ? "
+"order by "
+"  T_JOB_ODR_CD_INV.\"WH_CD\", "
+"  T_JOB_ODR_CD_INV.\"ITEM_CD\", "
+"  T_JOB_ODR_CD_INV.\"JOB_ODR_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_JOB_ODR_CD_INV(\"INV_DATE\", \"JOB_ODR_CD\", \"ITEM_CD\", \"WH_CD\", \"PLANT_CD\", \"ACTUAL_STOCK_QTY\") "
+"values "
+"  (TO_DATE(?, 'YYYY/MM/DD'), ?, ?, ?, ?, TO_NUMBER(?))";
		protected String m_updcmd = "update "
+"  T_JOB_ODR_CD_INV "
+"set "
+"  \"ACTUAL_STOCK_QTY\" = TO_NUMBER(?) "
+"where "
+"  T_JOB_ODR_CD_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_JOB_ODR_CD_INV.\"PLANT_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"WH_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"JOB_ODR_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_JOB_ODR_CD_INV_def
                //}}user_implement_dev:T_JOB_ODR_CD_INV_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV_read
                        if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV_read2
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV_read3
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_JOB_ODR_CD_INV", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setw_JOB_ODR_CD( getString(3, rs) );
			data.setFINAL_BOOK_STOCK_QTY( getString(4, rs) );
			data.setACTUAL_STOCK_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setUNIT_QTY_TYP( getString(7, rs) );
			data.setMODIFY_COUNT( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_JOB_ODR_CD_INV", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getINV_DATE(), stmt);
				setString(8, data.getJOB_ODR_CD(), stmt);
				setString(9, data.getITEM_CD(), stmt);
				setString(10, data.getWH_CD(), stmt);
				setString(11, data.getPLANT_CD(), stmt);
				setString(12, data.getACTUAL_STOCK_QTY(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getACTUAL_STOCK_QTY(), stmt);
				setString(5, data.getINV_DATE(), stmt);
				setString(6, data.getPLANT_CD(), stmt);
				setString(7, data.getITEM_CD(), stmt);
				setString(8, data.getWH_CD(), stmt);
				setString(9, data.getJOB_ODR_CD(), stmt);

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
			//{{user_implement_dev:T_JOB_ODR_CD_INV_clear
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_clear

			return;
		}

		/**
		 * T_JOB_ODR_CD_INV�N���X�̕W���R���X�g���N�^
		 */
		public T_JOB_ODR_CD_INV()
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV_constractor
                        //}}user_implement_dev:T_JOB_ODR_CD_INV_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_ITEM_INV4Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_ITEM_INV "
+"where "
+"  T_ITEM_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_ITEM_INV.\"PLANT_CD\" = ? "
+"  and T_ITEM_INV.\"ITEM_CD\" = ? "
+"  and T_ITEM_INV.\"WH_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_ITEM_INV4Update_def
                //}}user_implement_dev:T_ITEM_INV4Update_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV4Update_read
                        if(m_selcmd==null) throw new FoundationException("T_ITEM_INV4Update", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_ITEM_INV4Update_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV4Update_read2
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_ITEM_INV4Update_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV4Update_read3
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_ITEM_INV4Update_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_ITEM_INV4Update", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_ITEM_INV4Update_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_ITEM_INV4Update", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_ITEM_INV4Update_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_ITEM_INV4Update_clear
                        //}}user_implement_dev:T_ITEM_INV4Update_clear

			return;
		}

		/**
		 * T_ITEM_INV4Update�N���X�̕W���R���X�g���N�^
		 */
		public T_ITEM_INV4Update()
		{
			//{{user_implement_dev:T_ITEM_INV4Update_constractor
                        //}}user_implement_dev:T_ITEM_INV4Update_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_JOB_ODR_CD_INV4Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR_CD_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_JOB_ODR_CD_INV "
+"where "
+"  T_JOB_ODR_CD_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_JOB_ODR_CD_INV.\"PLANT_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"WH_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"JOB_ODR_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_def
                //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_read
                        if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV4Update", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_read2
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_read3
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INV4Update", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_JOB_ODR_CD_INV4Update", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_clear
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_clear

			return;
		}

		/**
		 * T_JOB_ODR_CD_INV4Update�N���X�̕W���R���X�g���N�^
		 */
		public T_JOB_ODR_CD_INV4Update()
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INV4Update_constractor
                        //}}user_implement_dev:T_JOB_ODR_CD_INV4Update_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_INV_CTRL_INV_STS_TYP1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(T_INV_CTRL.\"INV_DATE\", 'YYYY/MM/DD') as \"INV_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"REGULAR_INV_FLG\", 'fm0') as \"REGULAR_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"CYCLE_INV_FLG\", 'fm0') as \"CYCLE_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"TEMP_INV_FLG\", 'fm0') as \"TEMP_INV_FLG\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_STS_TYP\", 'fm90') as \"INV_STS_TYP\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_START_DATE\", 'YYYY/MM/DD') as \"INV_START_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"STOCK_SAVE_DATE\", 'YYYY/MM/DD HH24:MI:SS') as \"STOCK_SAVE_DATE\", "
+"  TO_CHAR(T_INV_CTRL.\"INV_UPDATED_DATE\", 'YYYY/MM/DD HH24:MI:SS') as \"INV_UPDATED_DATE\", "
+"  T_INV_CTRL.\"INV_COMMENT\" as \"INV_COMMENT\", "
+"  T_INV_CTRL.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_INV_CTRL "
+"where "
+"  T_INV_CTRL.\"PLANT_CD\" = ? "
+"  and T_INV_CTRL.\"INV_STS_TYP\" = 1 "
+"order by "
+"  T_INV_CTRL.\"INV_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_def
                //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read
                        if(m_selcmd==null) throw new FoundationException("T_INV_CTRL_INV_STS_TYP1", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read2
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL_INV_STS_TYP1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read3
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL_INV_STS_TYP1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setINV_DATE( getString(1, rs) );
			data.setREGULAR_INV_FLG( getString(2, rs) );
			data.setCYCLE_INV_FLG( getString(3, rs) );
			data.setTEMP_INV_FLG( getString(4, rs) );
			data.setINV_STS_TYP( getString(5, rs) );
			data.setINV_START_DATE( getString(6, rs) );
			data.setSTOCK_SAVE_DATE( getString(7, rs) );
			data.setINV_UPDATED_DATE( getString(8, rs) );
			data.setINV_COMMENT( getString(9, rs) );
			data.setMODIFY_COUNT( getString(10, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INV_CTRL_INV_STS_TYP1", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_INV_CTRL_INV_STS_TYP1", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_clear
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_clear

			return;
		}

		/**
		 * T_INV_CTRL_INV_STS_TYP1�N���X�̕W���R���X�g���N�^
		 */
		public T_INV_CTRL_INV_STS_TYP1()
		{
			//{{user_implement_dev:T_INV_CTRL_INV_STS_TYP1_constractor
                        //}}user_implement_dev:T_INV_CTRL_INV_STS_TYP1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class M_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  TO_CHAR(M_ITEM.\"MRP_ODR_TYP\", 'fm90') as \"MRP_ODR_TYP\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_ITEM.\"ABC_TYP\" as \"ABC_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" as \"LOT_CTRL_FLG\", "
+"  M_ITEM.\"LOT_NUMBERING_TYP\" as \"LOT_NUMBERING_TYP\" "
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
                //}}user_implement_dev:M_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
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
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_NAME( getString(1, rs) );
			data.setMRP_ODR_TYP( getString(2, rs) );
			data.setUNIT_QTY_TYP( getString(3, rs) );
			data.setSTOCK_UNIT( getString(4, rs) );
			data.setABC_TYP( getString(5, rs) );
			data.setLOT_CTRL_FLG( getString(6, rs) );
			data.setLOT_NUMBERING_TYP( getString(7, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
                        //}}user_implement_dev:M_ITEM_clear

			return;
		}

		/**
		 * M_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public M_ITEM()
		{
			//{{user_implement_dev:M_ITEM_constractor
                        //}}user_implement_dev:M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_OD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_OD "
+"where "
+"  T_OD.\"ITEM_CD\" = ? "
+"  and T_OD.\"JOB_ODR_CD\" = ? "
+"  and T_OD.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_OD_def
                //}}user_implement_dev:T_OD_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read
                        if(m_selcmd==null) throw new FoundationException("T_OD", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_OD_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read2
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_OD_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_read3
			if(m_selcmd==null) throw new FoundationException("T_OD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_OD_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getJOB_ODR_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_OD", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_OD_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_OD", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_OD_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_OD_clear
                        //}}user_implement_dev:T_OD_clear

			return;
		}

		/**
		 * T_OD�N���X�̕W���R���X�g���N�^
		 */
		public T_OD()
		{
			//{{user_implement_dev:T_OD_constractor
                        //}}user_implement_dev:T_OD_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_INV_CYCLE extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_INV_CYCLE.\"INV_FLG_JAN\" as \"INV_FLG_JAN\", "
+"  T_INV_CYCLE.\"INV_FLG_FEB\" as \"INV_FLG_FEB\", "
+"  T_INV_CYCLE.\"INV_FLG_MAR\" as \"INV_FLG_MAR\", "
+"  T_INV_CYCLE.\"INV_FLG_APR\" as \"INV_FLG_APR\", "
+"  T_INV_CYCLE.\"INV_FLG_MAY\" as \"INV_FLG_MAY\", "
+"  T_INV_CYCLE.\"INV_FLG_JUN\" as \"INV_FLG_JUN\", "
+"  T_INV_CYCLE.\"INV_FLG_JUL\" as \"INV_FLG_JUL\", "
+"  T_INV_CYCLE.\"INV_FLG_AUG\" as \"INV_FLG_AUG\", "
+"  T_INV_CYCLE.\"INV_FLG_SEP\" as \"INV_FLG_SEP\", "
+"  T_INV_CYCLE.\"INV_FLG_OCT\" as \"INV_FLG_OCT\", "
+"  T_INV_CYCLE.\"INV_FLG_NOV\" as \"INV_FLG_NOV\", "
+"  T_INV_CYCLE.\"INV_FLG_DEC\" as \"INV_FLG_DEC\" "
+"from "
+"  T_INV_CYCLE "
+"where "
+"  T_INV_CYCLE.\"ITEM_CD\" = ? "
+"  and T_INV_CYCLE.\"PLANT_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_INV_CYCLE_def
                //}}user_implement_dev:T_INV_CYCLE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CYCLE_read
                        if(m_selcmd==null) throw new FoundationException("T_INV_CYCLE", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CYCLE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CYCLE_read2
			if(m_selcmd==null) throw new FoundationException("T_INV_CYCLE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CYCLE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CYCLE_read3
			if(m_selcmd==null) throw new FoundationException("T_INV_CYCLE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_CYCLE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setINV_FLG_JAN( getString(1, rs) );
			data.setINV_FLG_FEB( getString(2, rs) );
			data.setINV_FLG_MAR( getString(3, rs) );
			data.setINV_FLG_APR( getString(4, rs) );
			data.setINV_FLG_MAY( getString(5, rs) );
			data.setINV_FLG_JUN( getString(6, rs) );
			data.setINV_FLG_JUL( getString(7, rs) );
			data.setINV_FLG_AUG( getString(8, rs) );
			data.setINV_FLG_SEP( getString(9, rs) );
			data.setINV_FLG_OCT( getString(10, rs) );
			data.setINV_FLG_NOV( getString(11, rs) );
			data.setINV_FLG_DEC( getString(12, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INV_CYCLE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_CYCLE_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_INV_CYCLE", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_CYCLE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_INV_CYCLE_clear
                        //}}user_implement_dev:T_INV_CYCLE_clear

			return;
		}

		/**
		 * T_INV_CYCLE�N���X�̕W���R���X�g���N�^
		 */
		public T_INV_CYCLE()
		{
			//{{user_implement_dev:T_INV_CYCLE_constractor
                        //}}user_implement_dev:T_INV_CYCLE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_INV_TARGET_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_INV_TARGET_ITEM.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_INV_TARGET_ITEM "
+"where "
+"  T_INV_TARGET_ITEM.\"PLANT_CD\" = ? "
+"  and T_INV_TARGET_ITEM.\"INV_DATE\" = ? "
+"  and T_INV_TARGET_ITEM.\"ITEM_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_INV_TARGET_ITEM_def
                //}}user_implement_dev:T_INV_TARGET_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_ITEM_read
                        if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_ITEM", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_TARGET_ITEM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_TARGET_ITEM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_TARGET_ITEM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_ITEM", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_ITEM_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_INV_TARGET_ITEM", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_TARGET_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_INV_TARGET_ITEM_clear
                        //}}user_implement_dev:T_INV_TARGET_ITEM_clear

			return;
		}

		/**
		 * T_INV_TARGET_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public T_INV_TARGET_ITEM()
		{
			//{{user_implement_dev:T_INV_TARGET_ITEM_constractor
                        //}}user_implement_dev:T_INV_TARGET_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_INV_TARGET_WH extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_INV_TARGET_WH.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_INV_TARGET_WH "
+"where "
+"  T_INV_TARGET_WH.\"PLANT_CD\" = ? "
+"  and T_INV_TARGET_WH.\"INV_DATE\" = ? "
+"  and T_INV_TARGET_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_INV_TARGET_WH_def
                //}}user_implement_dev:T_INV_TARGET_WH_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_WH_read
                        if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_WH", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_TARGET_WH_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_WH_read2
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_TARGET_WH_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_WH_read3
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_INV_TARGET_WH_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_INV_TARGET_WH", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_INV_TARGET_WH_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("T_INV_TARGET_WH", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:T_INV_TARGET_WH_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_INV_TARGET_WH_clear
                        //}}user_implement_dev:T_INV_TARGET_WH_clear

			return;
		}

		/**
		 * T_INV_TARGET_WH�N���X�̕W���R���X�g���N�^
		 */
		public T_INV_TARGET_WH()
		{
			//{{user_implement_dev:T_INV_TARGET_WH_constractor
                        //}}user_implement_dev:T_INV_TARGET_WH_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SELECT_SYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  VALUE "
+"FROM "
+"  SYS_PARAMETER "
+"WHERE "
+"  NAME = 'PAST_RESULT_ENTRY_TYP'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_PARAMETER_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SELECT_SYS_PARAMETER_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setPAST_RESULT_ENTRY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_PARAMETER", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_SYS_PARAMETER_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_clear

			return;
		}

		/**
		 * SELECT_SYS_PARAMETER�N���X�̕W���R���X�g���N�^
		 */
		public SELECT_SYS_PARAMETER()
		{
			//{{user_implement_dev:SELECT_SYS_PARAMETER_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SELECT_SYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SELECT_SYS_ACTUAL_COST_CTRL_AC extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  PROC_EXEC_DATE "
+"FROM "
+"  SYS_ACTUAL_COST_CTRL_AC "
+"WHERE "
+"  PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setPROC_EXEC_DATE( getBigDecimal(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SELECT_SYS_ACTUAL_COST_CTRL_AC", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_clear

			return;
		}

		/**
		 * SELECT_SYS_ACTUAL_COST_CTRL_AC�N���X�̕W���R���X�g���N�^
		 */
		public SELECT_SYS_ACTUAL_COST_CTRL_AC()
		{
			//{{user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SELECT_SYS_ACTUAL_COST_CTRL_AC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_LOT_INVLotNo extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_LOT_INV.\"WH_CD\" as \"WH_CD\", "
+"  TO_CHAR(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"  TO_CHAR(T_LOT_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  T_LOT_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  T_LOT_INV.LOT_NO AS LOT_NO "
+"from "
+"  T_LOT_INV, "
+"  M_ITEM "
+"where "
+"  T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD "
+"  and M_ITEM.LOT_CTRL_FLG = 1 "
+"  and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.PLANT_CD = ? "
+"  and T_LOT_INV.ITEM_CD like ? "
+"  and T_LOT_INV.WH_CD = ? "
+"  and T_LOT_INV.LOT_NO like ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_LOT_INVLotNo_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_LOT_INVLotNo_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNo_read
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNo", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_LOT_INVLotNo_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNo_read2
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_LOT_INVLotNo_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNo_read3
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_LOT_INVLotNo_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_LOT_INVLotNo", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLOT_NO())) setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setWH_CD( getString(3, rs) );
			data.setFINAL_BOOK_STOCK_QTY( getString(4, rs) );
			data.setACTUAL_STOCK_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setUNIT_QTY_TYP( getString(7, rs) );
			data.setMODIFY_COUNT( getString(8, rs) );
			data.setLOT_NO( getString(9, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNo", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNo_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_LOT_INVLotNo_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_LOT_INVLotNo_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_LOT_INVLotNo_clear

			return;
		}

		/**
		 * selectT_LOT_INVLotNo�N���X�̕W���R���X�g���N�^
		 */
		public selectT_LOT_INVLotNo()
		{
			//{{user_implement_dev:selectT_LOT_INVLotNo_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_LOT_INVLotNo_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectActualStockQty2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  * "
+"from "
+"  ( "
+"    select "
+"      M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"      M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"      T_LOT_INV.\"WH_CD\" as \"WH_CD\", "
+"      TO_CHAR(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"      TO_CHAR(T_LOT_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"      M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"      TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"      T_LOT_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"      T_LOT_INV.LOT_NO AS LOT_NO, "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"      T_LOT_INV.LOT_NO AS LOT_ROW_NO  "
+"    from "
+"      T_LOT_INV, "
+"      T_ITEM_INV, "
+"      M_ITEM "
+"    where "
+"      T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD "
+"      and M_ITEM.LOT_CTRL_FLG = 1 "
+"      and T_LOT_INV.INV_DATE = T_ITEM_INV.INV_DATE "
+"      and T_LOT_INV.ITEM_CD = T_ITEM_INV.ITEM_CD "
+"      and T_LOT_INV.WH_CD = T_ITEM_INV.WH_CD "
+"      and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"      and T_LOT_INV.PLANT_CD = ? "
+"      and T_LOT_INV.ITEM_CD like ? "
+"      and T_LOT_INV.WH_CD = ? "
+"  union "
+"    select "
+"      M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"      M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"      T_ITEM_INV.\"WH_CD\" as \"WH_CD\", "
+"      TO_CHAR(T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"      TO_CHAR(T_ITEM_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"      M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"      TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"      null as LOT_NO, "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"      ' ' AS LOT_ROW_NO "
+"    from "
+"      T_ITEM_INV, "
+"      M_ITEM "
+"    where "
+"      T_ITEM_INV.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"      and T_ITEM_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"      and T_ITEM_INV.\"PLANT_CD\" = ? "
+"      and T_ITEM_INV.\"ITEM_CD\" like ? "
+"      and T_ITEM_INV.\"WH_CD\" = ? "
+"      and M_ITEM.LOT_CTRL_FLG = 0 "
+"  union "
+"    select "
+"      * "
+"    from "
+"      ( "
+"        select "
+"          M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"          M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"          T_ITEM_INV.\"WH_CD\" as \"WH_CD\", "
+"          TO_CHAR((T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\" - A.\"FINAL_BOOK_STOCK_QTY\"), 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"          TO_CHAR((T_ITEM_INV.\"ACTUAL_STOCK_QTY\" - A.\"ACTUAL_STOCK_QTY\"), 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"          M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"          TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"          T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"          null as LOT_NO, "
+"          T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"          ' ' AS LOT_ROW_NO "
+"        from "
+"          T_ITEM_INV, "
+"          M_ITEM, "
+"          ( "
+"            select "
+"              sum(T_LOT_INV.\"ACTUAL_STOCK_QTY\") as \"ACTUAL_STOCK_QTY\", "
+"              sum(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\") as \"FINAL_BOOK_STOCK_QTY\", "
+"              T_LOT_INV.ITEM_CD as \"ITEM_CD\", "
+"              T_LOT_INV.WH_CD as \"WH_CD\", "
+"              T_LOT_INV.PLANT_CD as \"PLANT_CD\" "
+"            from "
+"              T_LOT_INV "
+"            where "
+"              T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"              and T_LOT_INV.PLANT_CD = ? "
+"              and T_LOT_INV.WH_CD = ? "
+"              and T_LOT_INV.ITEM_CD like ? "
+"            group by "
+"              T_LOT_INV.ITEM_CD, "
+"              T_LOT_INV.WH_CD, "
+"              T_LOT_INV.PLANT_CD "
+"          ) A "
+"        where "
+"          T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"          and M_ITEM.LOT_CTRL_FLG = 1 "
+"          and M_ITEM.ITEM_CD = A.ITEM_CD "
+"          and T_ITEM_INV.PLANT_CD = A.PLANT_CD "
+"          and T_ITEM_INV.WH_CD = A.WH_CD "
+"          and T_ITEM_INV.ITEM_CD = A.ITEM_CD "
+"      ) B "
+"    where "
+"      B.ACTUAL_STOCK_QTY != 0 "
+"  ) A "
+"order by "
+"  A.ITEM_CD, "
+"  A.WH_CD, "
+"  A.LOT_ROW_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectActualStockQty2_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectActualStockQty2_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2_read
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty2_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2_read2
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty2_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2_read3
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty2_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectActualStockQty2", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setWH_CD( getString(3, rs) );
			data.setFINAL_BOOK_STOCK_QTY( getString(4, rs) );
			data.setACTUAL_STOCK_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setUNIT_QTY_TYP( getString(7, rs) );
			data.setMODIFY_COUNT( getString(8, rs) );
			data.setLOT_NO( getString(9, rs) );
			data.setMODIFY_COUNT_1( getString(10, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty2_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectActualStockQty2_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty2_clear

			return;
		}

		/**
		 * selectActualStockQty2�N���X�̕W���R���X�g���N�^
		 */
		public selectActualStockQty2()
		{
			//{{user_implement_dev:selectActualStockQty2_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty2_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_LOT_INV4Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\" "
+"from "
+"  T_LOT_INV, "
+"  T_ITEM_INV "
+"where "
+"  T_LOT_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.\"PLANT_CD\" = ? "
+"  and T_LOT_INV.\"ITEM_CD\" = ? "
+"  and T_LOT_INV.\"WH_CD\" = ? "
+"  and T_LOT_INV.\"LOT_NO\" = ? "
+"  and T_LOT_INV.\"ITEM_CD\" = T_ITEM_INV.ITEM_CD "
+"  and T_LOT_INV.\"WH_CD\" = T_ITEM_INV.WH_CD "
+"  and T_LOT_INV.\"INV_DATE\" = T_ITEM_INV.INV_DATE";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_LOT_INV4Update_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:T_LOT_INV4Update_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_INV4Update_read
			if(m_selcmd==null) throw new FoundationException("T_LOT_INV4Update", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_INV4Update_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_INV4Update_read2
			if(m_selcmd==null) throw new FoundationException("T_LOT_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_LOT_INV4Update_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_INV4Update_read3
			if(m_selcmd==null) throw new FoundationException("T_LOT_INV4Update", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_LOT_INV4Update_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );
			data.setMODIFY_COUNT_1( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_LOT_INV4Update", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_LOT_INV4Update_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_LOT_INV4Update_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_LOT_INV4Update_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:T_LOT_INV4Update_clear

			return;
		}

		/**
		 * T_LOT_INV4Update�N���X�̕W���R���X�g���N�^
		 */
		public T_LOT_INV4Update()
		{
			//{{user_implement_dev:T_LOT_INV4Update_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:T_LOT_INV4Update_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectActualStockQty extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_ITEM_INV.\"WH_CD\" as \"WH_CD\", "
+"  TO_CHAR(T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"  TO_CHAR((T_ITEM_INV.\"ACTUAL_STOCK_QTY\" - A.\"ACTUAL_STOCK_QTY\"), 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  decode(T_ITEM_INV.\"MODIFY_COUNT\", null, null) as LOT_NO, "
+"  TO_CHAR(T_ITEM_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY_1\" "
+"from "
+"  T_ITEM_INV, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      TO_CHAR(sum(T_LOT_INV.\"ACTUAL_STOCK_QTY\"), 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"      T_LOT_INV.ITEM_CD as \"ITEM_CD\", "
+"      T_LOT_INV.WH_CD as \"WH_CD\", "
+"      T_LOT_INV.PLANT_CD as \"PLANT_CD\" "
+"    from "
+"      T_LOT_INV "
+"    where "
+"      T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"      and T_LOT_INV.PLANT_CD = ? "
+"      and T_LOT_INV.ITEM_CD = ? "
+"      and T_LOT_INV.WH_CD = ? "
+"    group by "
+"      T_LOT_INV.ITEM_CD, "
+"      T_LOT_INV.WH_CD, "
+"      T_LOT_INV.PLANT_CD "
+"  ) A "
+"where "
+"  T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"  and M_ITEM.ITEM_CD = A.ITEM_CD "
+"  and T_ITEM_INV.PLANT_CD = A.PLANT_CD "
+"  and T_ITEM_INV.WH_CD = A.WH_CD "
+"  and T_ITEM_INV.ITEM_CD = A.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectActualStockQty_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectActualStockQty_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty_read
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty_read2
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty_read3
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setITEM_CD( getString(1, rs) );
			data.setITEM_NAME( getString(2, rs) );
			data.setWH_CD( getString(3, rs) );
			data.setFINAL_BOOK_STOCK_QTY( getString(4, rs) );
			data.setACTUAL_STOCK_QTY( getString(5, rs) );
			data.setSTOCK_UNIT( getString(6, rs) );
			data.setUNIT_QTY_TYP( getString(7, rs) );
			data.setMODIFY_COUNT( getString(8, rs) );
			data.setLOT_NO( getString(9, rs) );
			data.setTItemInvACTUALSTOCKQTY( getString(10, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectActualStockQty_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty_clear

			return;
		}

		/**
		 * selectActualStockQty�N���X�̕W���R���X�g���N�^
		 */
		public selectActualStockQty()
		{
			//{{user_implement_dev:selectActualStockQty_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateT_LOT_INV extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_INV "
+"set "
+"  \"ACTUAL_STOCK_QTY\" = TO_NUMBER(?) "
+"where "
+"  T_LOT_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.\"PLANT_CD\" = ? "
+"  and T_LOT_INV.\"ITEM_CD\" = ? "
+"  and T_LOT_INV.\"WH_CD\" = ? "
+"  and T_LOT_INV.\"LOT_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_INV_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateT_LOT_INV_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getACTUAL_STOCK_QTY_1(), stmt);
				setString(5, data.getINV_DATE(), stmt);
				setString(6, data.getPLANT_CD(), stmt);
				setString(7, data.getITEM_CD(), stmt);
				setString(8, data.getWH_CD(), stmt);
				setString(9, data.getLOT_NO(), stmt);

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
			//{{user_implement_dev:updateT_LOT_INV_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateT_LOT_INV_clear

			return;
		}

		/**
		 * updateT_LOT_INV�N���X�̕W���R���X�g���N�^
		 */
		public updateT_LOT_INV()
		{
			//{{user_implement_dev:updateT_LOT_INV_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateT_LOT_INV_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class select_T_LOT_NO extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_LOT_INV.\"WH_CD\" as \"WH_CD\", "
+"  TO_CHAR(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"  TO_CHAR(T_LOT_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"  T_LOT_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"  T_LOT_INV.LOT_NO AS LOT_NO "
+"from "
+"  T_LOT_INV, "
+"  M_ITEM "
+"where "
+"  T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD "
+"  and M_ITEM.LOT_CTRL_FLG = 1 "
+"  and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.PLANT_CD = ? "
+"  and T_LOT_INV.ITEM_CD = ? "
+"  and T_LOT_INV.WH_CD = ? "
+"  and T_LOT_INV.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_T_LOT_NO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:select_T_LOT_NO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_NO_read
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_NO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_NO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_NO_read2
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_NO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_NO_read3
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_NO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setlotNoitemcd( getString(1, rs) );
			data.setlotNoitemname( getString(2, rs) );
			data.setlotNowhcd( getString(3, rs) );
			data.setlotNoqty( getString(4, rs) );
			data.setlotNoactual( getString(5, rs) );
			data.setlotNostockunit( getString(6, rs) );
			data.setlotNounitqty( getString(7, rs) );
			data.setlotNomodify( getString(8, rs) );
			data.setlotNolotno( getString(9, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_NO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_NO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_T_LOT_NO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_NO_clear

			return;
		}

		/**
		 * select_T_LOT_NO�N���X�̕W���R���X�g���N�^
		 */
		public select_T_LOT_NO()
		{
			//{{user_implement_dev:select_T_LOT_NO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class select_T_LOT_CTRL_2 extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_CTRL.LOT_NO, "
+"  to_char(T_LOT_CTRL.BEST_BEFORE_DATE, 'yyyy/mm/dd') as BEST_BEFORE_DATE, "
+"  T_LOT_CTRL.DEL_FLG, "
+"  to_char(T_LOT_CTRL.PRD_CMPLT_DATE, 'yyyy/mm/dd') as PRD_CMPLT_DATE "
+"from "
+"  T_LOT_CTRL "
+"where "
+"  T_LOT_CTRL.ITEM_CD = ? "
+"  and T_LOT_CTRL.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_T_LOT_CTRL_2_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:select_T_LOT_CTRL_2_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_2_read
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL_2", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_CTRL_2_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_2_read2
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL_2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_CTRL_2_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_2_read3
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL_2", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_CTRL_2_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setLOT_NO( getString(1, rs) );
			data.setBEST_BEFORE_DATE( getString(2, rs) );
			data.setLOT_DEL_FLG( getString(3, rs) );
			data.setBUSINESS_OPR_DATE( getString(4, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL_2", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_CTRL_2_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_T_LOT_CTRL_2_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_CTRL_2_clear

			return;
		}

		/**
		 * select_T_LOT_CTRL_2�N���X�̕W���R���X�g���N�^
		 */
		public select_T_LOT_CTRL_2()
		{
			//{{user_implement_dev:select_T_LOT_CTRL_2_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_CTRL_2_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class Select_SYS_DATE_CTRL extends DataObject
	{
		protected String m_selcmd = "Select "
+"  to_char(BUSINESS_OPR_DATE, 'yyyy/mm/dd') as BUSINESS_OPR_DATE "
+"from "
+"  SYS_DATE_CTRL "
+"where "
+"  SYS_DATE_CTRL.PLANT_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:Select_SYS_DATE_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:Select_SYS_DATE_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("Select_SYS_DATE_CTRL", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:Select_SYS_DATE_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_clear

			return;
		}

		/**
		 * Select_SYS_DATE_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public Select_SYS_DATE_CTRL()
		{
			//{{user_implement_dev:Select_SYS_DATE_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:Select_SYS_DATE_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class select_T_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_LOT_CTRL.LOT_NO "
+"from "
+"  T_LOT_CTRL "
+"where "
+"  T_LOT_CTRL.LOT_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_LOT_CTRL(LOT_NO, ITEM_CD, PRD_CMPLT_DATE, BEST_BEFORE_DATE, DEL_FLG) "
+"VALUES "
+"  (?, ?, ?, ?, 0)";
		protected String m_updcmd = "update "
+"  T_LOT_CTRL "
+"set "
+"  PRD_CMPLT_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
+"  BEST_BEFORE_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
+"  DEL_FLG = 0 "
+"where "
+"  LOT_NO = ? "
+"  and ITEM_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:select_T_LOT_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:select_T_LOT_CTRL_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_read
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_CTRL_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_read2
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_CTRL_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_read3
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_T_LOT_CTRL_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setLOT_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select_T_LOT_CTRL", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_T_LOT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_T_LOT_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getLOT_NO(), stmt);
				setString(8, data.getITEM_CD(), stmt);
				setString(9, data.getBUSINESS_OPR_DATE(), stmt);
				setString(10, data.getBEST_BEFORE_DATE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getBUSINESS_OPR_DATE(), stmt);
				setString(5, data.getBEST_BEFORE_DATE(), stmt);
				setString(6, data.getLOT_NO(), stmt);
				setString(7, data.getITEM_CD(), stmt);

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
			//{{user_implement_dev:select_T_LOT_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_CTRL_clear

			return;
		}

		/**
		 * select_T_LOT_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public select_T_LOT_CTRL()
		{
			//{{user_implement_dev:select_T_LOT_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:select_T_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class update_T_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_LOT_CTRL "
+"set "
+"  DEL_FLG = 0 "
+"where "
+"  LOT_NO = ? "
+"  and ITEM_CD = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:update_T_LOT_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:update_T_LOT_CTRL_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				if("Oracle".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U(m_updcmd));
				} else if("Microsoft SQL Server".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MSSQL(m_updcmd));
				} else if("PostgreSQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_PGSQL(m_updcmd));
				} else if("MySQL".equals(conn.getMetaData().getDatabaseProductName())) {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_MYSQL(m_updcmd));
				} else {
					stmt = conn.prepareStatement(objMessage.replaceSQL_U_DB2(m_updcmd));
				}

				setString(1, data.getsSysdate(), stmt);
				setString(2, data.getsUser_ID(), stmt);
				setString(3, m_sUpdateProgramName, stmt);
				setString(4, data.getLOT_NO(), stmt);
				setString(5, data.getITEM_CD(), stmt);

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
			//{{user_implement_dev:update_T_LOT_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:update_T_LOT_CTRL_clear

			return;
		}

		/**
		 * update_T_LOT_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public update_T_LOT_CTRL()
		{
			//{{user_implement_dev:update_T_LOT_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:update_T_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class create_T_LOT_INV extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_LOT_INV(\"INV_DATE\", \"ITEM_CD\", \"WH_CD\", \"LOT_NO\", \"PLANT_CD\", \"ACTUAL_STOCK_QTY\") "
+"values "
+"  (TO_DATE(?, 'YYYY/MM/DD'), ?, ?, ?, ?, TO_NUMBER(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AH0050010";
		protected String m_sUpdateProgramName="AH0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:create_T_LOT_INV_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:create_T_LOT_INV_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getINV_DATE(), stmt);
				setString(8, data.getITEM_CD(), stmt);
				setString(9, data.getWH_CD(), stmt);
				setString(10, data.getLOT_NO(), stmt);
				setString(11, data.getPLANT_CD(), stmt);
				setString(12, data.getACTUAL_STOCK_QTY_1(), stmt);

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
			//{{user_implement_dev:create_T_LOT_INV_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:create_T_LOT_INV_clear

			return;
		}

		/**
		 * create_T_LOT_INV�N���X�̕W���R���X�g���N�^
		 */
		public create_T_LOT_INV()
		{
			//{{user_implement_dev:create_T_LOT_INV_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:create_T_LOT_INV_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectActualStockQty1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(sum(T_LOT_INV.\"ACTUAL_STOCK_QTY\"), 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"  T_LOT_INV.ITEM_CD "
+"from "
+"  T_LOT_INV "
+"where "
+"  T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.PLANT_CD = ? "
+"  and T_LOT_INV.WH_CD = ? "
+"  and T_LOT_INV.ITEM_CD = ? "
+"group by "
+"  T_LOT_INV.ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectActualStockQty1_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectActualStockQty1_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty1_read
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty1", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty1_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty1_read2
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty1_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty1_read3
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty1_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getWH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setACTUAL_STOCK_QTY_2( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty1", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty1_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectActualStockQty1_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty1_clear

			return;
		}

		/**
		 * selectActualStockQty1�N���X�̕W���R���X�g���N�^
		 */
		public selectActualStockQty1()
		{
			//{{user_implement_dev:selectActualStockQty1_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectApprFlg extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_INV_CTRL.APPR_FLG "
+"FROM "
+"  T_INV_CTRL "
+"WHERE "
+"  T_INV_CTRL.PLANT_CD = ? "
+"  AND T_INV_CTRL.INV_DATE = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectApprFlg_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectApprFlg_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectApprFlg_read
			if(m_selcmd==null) throw new FoundationException("selectApprFlg", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectApprFlg_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectApprFlg_read2
			if(m_selcmd==null) throw new FoundationException("selectApprFlg", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectApprFlg_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectApprFlg_read3
			if(m_selcmd==null) throw new FoundationException("selectApprFlg", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectApprFlg_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getINV_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.seth_APRR_FLG( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectApprFlg", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectApprFlg_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectApprFlg_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectApprFlg_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectApprFlg_clear

			return;
		}

		/**
		 * selectApprFlg�N���X�̕W���R���X�g���N�^
		 */
		public selectApprFlg()
		{
			//{{user_implement_dev:selectApprFlg_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectApprFlg_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class T_JOB_ODR_CD_INVCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_JOB_ODR_CD_INV, "
+"  M_ITEM "
+"where "
+"  T_JOB_ODR_CD_INV.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  and T_JOB_ODR_CD_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_JOB_ODR_CD_INV.\"PLANT_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"ITEM_CD\" like ? "
+"  and T_JOB_ODR_CD_INV.\"WH_CD\" = ? "
+"  and T_JOB_ODR_CD_INV.\"JOB_ODR_CD\" like ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_read
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INVCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_read2
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INVCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_read3
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INVCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_JOB_ODR_CD_INVCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_JOB_ODR_CD_INVCnt", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_clear

			return;
		}

		/**
		 * T_JOB_ODR_CD_INVCnt�N���X�̕W���R���X�g���N�^
		 */
		public T_JOB_ODR_CD_INVCnt()
		{
			//{{user_implement_dev:T_JOB_ODR_CD_INVCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:T_JOB_ODR_CD_INVCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_LOT_INVLotNoCnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  T_LOT_INV, "
+"  M_ITEM "
+"where "
+"  T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD "
+"  and M_ITEM.LOT_CTRL_FLG = 1 "
+"  and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"  and T_LOT_INV.PLANT_CD = ? "
+"  and T_LOT_INV.ITEM_CD like ? "
+"  and T_LOT_INV.WH_CD = ? "
+"  and T_LOT_INV.LOT_NO like ? "
+"  and ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_LOT_INVLotNoCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_LOT_INVLotNoCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_read
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNoCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNoCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNoCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getLOT_NO());
				if(isNull(data.getLOT_NO())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectT_LOT_INVLotNoCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getLOT_NO())) setString(no ++, data.getLOT_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_LOT_INVLotNoCnt", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_clear

			return;
		}

		/**
		 * selectT_LOT_INVLotNoCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectT_LOT_INVLotNoCnt()
		{
			//{{user_implement_dev:selectT_LOT_INVLotNoCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_LOT_INVLotNoCnt_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectActualStockQty2Cnt extends DataObject
	{
		protected String m_selcmd = "select "
+"  count(1) "
+"from "
+"  ( "
+"    select "
+"      M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"      M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"      T_LOT_INV.\"WH_CD\" as \"WH_CD\", "
+"      TO_CHAR(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"      TO_CHAR(T_LOT_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"      M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"      TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"      T_LOT_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"      T_LOT_INV.LOT_NO AS LOT_NO, "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"      T_LOT_INV.LOT_NO AS LOT_ROW_NO "
+"    from "
+"      T_LOT_INV, "
+"      T_ITEM_INV, "
+"      M_ITEM "
+"    where "
+"      T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD "
+"      and M_ITEM.LOT_CTRL_FLG = 1 "
+"      and T_LOT_INV.INV_DATE = T_ITEM_INV.INV_DATE "
+"      and T_LOT_INV.ITEM_CD = T_ITEM_INV.ITEM_CD "
+"      and T_LOT_INV.WH_CD = T_ITEM_INV.WH_CD "
+"      and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"      and T_LOT_INV.PLANT_CD = ? "
+"      and T_LOT_INV.ITEM_CD like ? "
+"      and T_LOT_INV.WH_CD = ? "
+"  union "
+"    select "
+"      M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"      M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"      T_ITEM_INV.\"WH_CD\" as \"WH_CD\", "
+"      TO_CHAR(T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\", 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"      TO_CHAR(T_ITEM_INV.\"ACTUAL_STOCK_QTY\", 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"      M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"      TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"      null as LOT_NO, "
+"      T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"      ' ' AS LOT_ROW_NO "
+"    from "
+"      T_ITEM_INV, "
+"      M_ITEM "
+"    where "
+"      T_ITEM_INV.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"      and T_ITEM_INV.\"INV_DATE\" = TO_DATE(?, 'YYYY/MM/DD') "
+"      and T_ITEM_INV.\"PLANT_CD\" = ? "
+"      and T_ITEM_INV.\"ITEM_CD\" like ? "
+"      and T_ITEM_INV.\"WH_CD\" = ? "
+"      and M_ITEM.LOT_CTRL_FLG = 0 "
+"  union "
+"    select "
+"      * "
+"    from "
+"      ( "
+"        select "
+"          M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"          M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"          T_ITEM_INV.\"WH_CD\" as \"WH_CD\", "
+"          TO_CHAR((T_ITEM_INV.\"FINAL_BOOK_STOCK_QTY\" - A.\"FINAL_BOOK_STOCK_QTY\"), 'fm99999999999990.0999') as \"FINAL_BOOK_STOCK_QTY\", "
+"          TO_CHAR((T_ITEM_INV.\"ACTUAL_STOCK_QTY\" - A.\"ACTUAL_STOCK_QTY\"), 'fm99999999999990.0999') as \"ACTUAL_STOCK_QTY\", "
+"          M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"          TO_CHAR(M_ITEM.\"UNIT_QTY_TYP\", 'fm90') as \"UNIT_QTY_TYP\", "
+"          T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT\", "
+"          null as LOT_NO, "
+"          T_ITEM_INV.\"MODIFY_COUNT\" as \"MODIFY_COUNT_1\", "
+"          ' ' AS LOT_ROW_NO "
+"        from "
+"          T_ITEM_INV, "
+"          M_ITEM, "
+"          ( "
+"            select "
+"              sum(T_LOT_INV.\"ACTUAL_STOCK_QTY\") as \"ACTUAL_STOCK_QTY\", "
+"              sum(T_LOT_INV.\"FINAL_BOOK_STOCK_QTY\") as \"FINAL_BOOK_STOCK_QTY\", "
+"              T_LOT_INV.ITEM_CD as \"ITEM_CD\", "
+"              T_LOT_INV.WH_CD as \"WH_CD\", "
+"              T_LOT_INV.PLANT_CD as \"PLANT_CD\" "
+"            from "
+"              T_LOT_INV "
+"            where "
+"              T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"              and T_LOT_INV.PLANT_CD = ? "
+"              and T_LOT_INV.WH_CD = ? "
+"              and T_LOT_INV.ITEM_CD like ? "
+"            group by "
+"              T_LOT_INV.ITEM_CD, "
+"              T_LOT_INV.WH_CD, "
+"              T_LOT_INV.PLANT_CD "
+"          ) A "
+"        where "
+"          T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
+"          and M_ITEM.LOT_CTRL_FLG = 1 "
+"          and M_ITEM.ITEM_CD = A.ITEM_CD "
+"          and T_ITEM_INV.PLANT_CD = A.PLANT_CD "
+"          and T_ITEM_INV.WH_CD = A.WH_CD "
+"          and T_ITEM_INV.ITEM_CD = A.ITEM_CD "
+"      ) B "
+"    where "
+"      B.ACTUAL_STOCK_QTY != 0 "
+"  ) A "
+"where "
+"  ROWNUM <= TO_NUMBER(?) + 1";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectActualStockQty2Cnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectActualStockQty2Cnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AH0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AH0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2Cnt_read
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2Cnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty2Cnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2Cnt_read2
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2Cnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty2Cnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AH0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2Cnt_read3
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2Cnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectActualStockQty2Cnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AH0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getWH_CD());
				if(isNull(data.getWH_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getINV_DATE());
				if(isNull(data.getINV_DATE())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectActualStockQty2Cnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getPLANT_CD())) setString(no ++, data.getPLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getWH_CD())) setString(no ++, data.getWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getINV_DATE())) setString(no ++, data.getINV_DATE(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AH0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AH0050010Struct data = new AH0050010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectActualStockQty2Cnt", "hasRecord", "�N�G���[���o�^");

			ResultSet rs=null;
			PreparedStatement stmt=null;

			try {
				stmt = prepare(conn, m_selcmd, data);

				rs = stmt.executeQuery();

				return rs.next();
			} finally {
				if(rs!=null) {
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
		public boolean check(IDbConnection conn, AH0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AH0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectActualStockQty2Cnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectActualStockQty2Cnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AH0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectActualStockQty2Cnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty2Cnt_clear

			return;
		}

		/**
		 * selectActualStockQty2Cnt�N���X�̕W���R���X�g���N�^
		 */
		public selectActualStockQty2Cnt()
		{
			//{{user_implement_dev:selectActualStockQty2Cnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectActualStockQty2Cnt_constractor

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
		mT_INV_CTRL.clear();
		mT_INV_CTRL = null;
		mM_WH.clear();
		mM_WH = null;
		mT_ITEM_INV.clear();
		mT_ITEM_INV = null;
		mT_JOB_ODR_CD_INV.clear();
		mT_JOB_ODR_CD_INV = null;
		mT_ITEM_INV4Update.clear();
		mT_ITEM_INV4Update = null;
		mT_JOB_ODR_CD_INV4Update.clear();
		mT_JOB_ODR_CD_INV4Update = null;
		mT_INV_CTRL_INV_STS_TYP1.clear();
		mT_INV_CTRL_INV_STS_TYP1 = null;
		mM_ITEM.clear();
		mM_ITEM = null;
		mT_OD.clear();
		mT_OD = null;
		mT_INV_CYCLE.clear();
		mT_INV_CYCLE = null;
		mT_INV_TARGET_ITEM.clear();
		mT_INV_TARGET_ITEM = null;
		mT_INV_TARGET_WH.clear();
		mT_INV_TARGET_WH = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mSELECT_SYS_ACTUAL_COST_CTRL_AC.clear();
		mSELECT_SYS_ACTUAL_COST_CTRL_AC = null;
		mselectT_LOT_INVLotNo.clear();
		mselectT_LOT_INVLotNo = null;
		mselectActualStockQty2.clear();
		mselectActualStockQty2 = null;
		mT_LOT_INV4Update.clear();
		mT_LOT_INV4Update = null;
		mselectActualStockQty.clear();
		mselectActualStockQty = null;
		mupdateT_LOT_INV.clear();
		mupdateT_LOT_INV = null;
		mselect_T_LOT_NO.clear();
		mselect_T_LOT_NO = null;
		mselect_T_LOT_CTRL_2.clear();
		mselect_T_LOT_CTRL_2 = null;
		mSelect_SYS_DATE_CTRL.clear();
		mSelect_SYS_DATE_CTRL = null;
		mselect_T_LOT_CTRL.clear();
		mselect_T_LOT_CTRL = null;
		mupdate_T_LOT_CTRL.clear();
		mupdate_T_LOT_CTRL = null;
		mcreate_T_LOT_INV.clear();
		mcreate_T_LOT_INV = null;
		mselectActualStockQty1.clear();
		mselectActualStockQty1 = null;
		mselectApprFlg.clear();
		mselectApprFlg = null;
		mT_JOB_ODR_CD_INVCnt.clear();
		mT_JOB_ODR_CD_INVCnt = null;
		mselectT_LOT_INVLotNoCnt.clear();
		mselectT_LOT_INVLotNoCnt = null;
		mselectActualStockQty2Cnt.clear();
		mselectActualStockQty2Cnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AH0050010�N���X�̕W���R���X�g���N�^
	 */
	public AH0050010Entity() throws FoundationException
	{
		//{{user_implement_dev:constractor
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
                //}}user_implement_dev:entity_destractor

		objMessage = null;
		clear();

		return;
	}
}
