/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0030/src/com/nec/jp/orteus/metamorBase/KU0030/KU0030010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0030;

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

public class KU0030010Entity extends DataObject
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

	// getCompanyInfo�N���X �C���X�^���X
	public getCompanyInfo mgetCompanyInfo = new getCompanyInfo();

	// getUserInfo�N���X �C���X�^���X
	public getUserInfo mgetUserInfo = new getUserInfo();

	// getGyomuDate�N���X �C���X�^���X
	public getGyomuDate mgetGyomuDate = new getGyomuDate();

	// tbl_T_SHIP�N���X �C���X�^���X
	public tbl_T_SHIP mtbl_T_SHIP = new tbl_T_SHIP();

	// tbl_T_SHIP_ODR�N���X �C���X�^���X
	public tbl_T_SHIP_ODR mtbl_T_SHIP_ODR = new tbl_T_SHIP_ODR();

	// chkIsWhCd�N���X �C���X�^���X
	public chkIsWhCd mchkIsWhCd = new chkIsWhCd();

	// tbl_T_SALES�N���X �C���X�^���X
	public tbl_T_SALES mtbl_T_SALES = new tbl_T_SALES();

	// tbl_M_ITEM�N���X �C���X�^���X
	public tbl_M_ITEM mtbl_M_ITEM = new tbl_M_ITEM();

	// tbl_M_ITEM_SPEC�N���X �C���X�^���X
	public tbl_M_ITEM_SPEC mtbl_M_ITEM_SPEC = new tbl_M_ITEM_SPEC();

	// tbl_T_ODR�N���X �C���X�^���X
	public tbl_T_ODR mtbl_T_ODR = new tbl_T_ODR();

	// tbl_T_RCV_ISSUE�N���X �C���X�^���X
	public tbl_T_RCV_ISSUE mtbl_T_RCV_ISSUE = new tbl_T_RCV_ISSUE();

	// tbl_T_ITEM_STOCK�N���X �C���X�^���X
	public tbl_T_ITEM_STOCK mtbl_T_ITEM_STOCK = new tbl_T_ITEM_STOCK();

	// tbl_M_CUST�N���X �C���X�^���X
	public tbl_M_CUST mtbl_M_CUST = new tbl_M_CUST();

	// getSYS_PARAMETER�N���X �C���X�^���X
	public getSYS_PARAMETER mgetSYS_PARAMETER = new getSYS_PARAMETER();

	// getRecallWhCd�N���X �C���X�^���X
	public getRecallWhCd mgetRecallWhCd = new getRecallWhCd();

	// tblM_UNIT_COST�N���X �C���X�^���X
	public tblM_UNIT_COST mtblM_UNIT_COST = new tblM_UNIT_COST();

	// readT_SHIP_ODR�N���X �C���X�^���X
	public readT_SHIP_ODR mreadT_SHIP_ODR = new readT_SHIP_ODR();

	// getCUR_UNIT�N���X �C���X�^���X
	public getCUR_UNIT mgetCUR_UNIT = new getCUR_UNIT();

	// chkSysInstallOptions�N���X �C���X�^���X
	public chkSysInstallOptions mchkSysInstallOptions = new chkSysInstallOptions();

	// readSysArCtrl�N���X �C���X�^���X
	public readSysArCtrl mreadSysArCtrl = new readSysArCtrl();

	// readT_AR_LEDGER_H�N���X �C���X�^���X
	public readT_AR_LEDGER_H mreadT_AR_LEDGER_H = new readT_AR_LEDGER_H();

	// readT_AR_LEDGER_H_TRN�N���X �C���X�^���X
	public readT_AR_LEDGER_H_TRN mreadT_AR_LEDGER_H_TRN = new readT_AR_LEDGER_H_TRN();

	// tbl_T_SHIP_ODR1�N���X �C���X�^���X
	public tbl_T_SHIP_ODR1 mtbl_T_SHIP_ODR1 = new tbl_T_SHIP_ODR1();

	// tbl_T_SHIP_ODR2�N���X �C���X�^���X
	public tbl_T_SHIP_ODR2 mtbl_T_SHIP_ODR2 = new tbl_T_SHIP_ODR2();

	// tbl_T_OD�N���X �C���X�^���X
	public tbl_T_OD mtbl_T_OD = new tbl_T_OD();

	// getTax�N���X �C���X�^���X
	public getTax mgetTax = new getTax();

	// tbl_T_SHIP_ODR3�N���X �C���X�^���X
	public tbl_T_SHIP_ODR3 mtbl_T_SHIP_ODR3 = new tbl_T_SHIP_ODR3();

	// chkT_AR_LEDGER_H�N���X �C���X�^���X
	public chkT_AR_LEDGER_H mchkT_AR_LEDGER_H = new chkT_AR_LEDGER_H();

	// chkT_AR_LEDGER_H_TRN�N���X �C���X�^���X
	public chkT_AR_LEDGER_H_TRN mchkT_AR_LEDGER_H_TRN = new chkT_AR_LEDGER_H_TRN();

	// getPlantFromWhCd�N���X �C���X�^���X
	public getPlantFromWhCd mgetPlantFromWhCd = new getPlantFromWhCd();

	// tbl_M_WH�N���X �C���X�^���X
	public tbl_M_WH mtbl_M_WH = new tbl_M_WH();

	// tbl_M_ORG�N���X �C���X�^���X
	public tbl_M_ORG mtbl_M_ORG = new tbl_M_ORG();

	// tbl_T_JOB_ODR_CD_STOCK�N���X �C���X�^���X
	public tbl_T_JOB_ODR_CD_STOCK mtbl_T_JOB_ODR_CD_STOCK = new tbl_T_JOB_ODR_CD_STOCK();

	// tbl_T_JOB_ODR�N���X �C���X�^���X
	public tbl_T_JOB_ODR mtbl_T_JOB_ODR = new tbl_T_JOB_ODR();

	// diffT_SHIP_ODR�N���X �C���X�^���X
	public diffT_SHIP_ODR mdiffT_SHIP_ODR = new diffT_SHIP_ODR();

	// updateT_ODR�N���X �C���X�^���X
	public updateT_ODR mupdateT_ODR = new updateT_ODR();

	// tbl_T_SHIP_SLIP�N���X �C���X�^���X
	public tbl_T_SHIP_SLIP mtbl_T_SHIP_SLIP = new tbl_T_SHIP_SLIP();

	// diffT_SHIP_SLIP�N���X �C���X�^���X
	public diffT_SHIP_SLIP mdiffT_SHIP_SLIP = new diffT_SHIP_SLIP();

	// SELECT_SYS_PARAMETER�N���X �C���X�^���X
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// SELECT_SYS_ACTUAL_COST_CTRL_AC�N���X �C���X�^���X
	public SELECT_SYS_ACTUAL_COST_CTRL_AC mSELECT_SYS_ACTUAL_COST_CTRL_AC = new SELECT_SYS_ACTUAL_COST_CTRL_AC();

	// tbl_M_CUST_BASE�N���X �C���X�^���X
	public tbl_M_CUST_BASE mtbl_M_CUST_BASE = new tbl_M_CUST_BASE();

	// getSYUKA_LT�N���X �C���X�^���X
	public getSYUKA_LT mgetSYUKA_LT = new getSYUKA_LT();

	// getTax1�N���X �C���X�^���X
	public getTax1 mgetTax1 = new getTax1();

	// getT_ODR_TAX�N���X �C���X�^���X
	public getT_ODR_TAX mgetT_ODR_TAX = new getT_ODR_TAX();

	// get_T_SHIP_SEQ_NO�N���X �C���X�^���X
	public get_T_SHIP_SEQ_NO mget_T_SHIP_SEQ_NO = new get_T_SHIP_SEQ_NO();

	// chk_T_LOT_CTRL�N���X �C���X�^���X
	public chk_T_LOT_CTRL mchk_T_LOT_CTRL = new chk_T_LOT_CTRL();

	// getQTY_T_LOT_STOCK�N���X �C���X�^���X
	public getQTY_T_LOT_STOCK mgetQTY_T_LOT_STOCK = new getQTY_T_LOT_STOCK();

	// readT_LOT_STOCK�N���X �C���X�^���X
	public readT_LOT_STOCK mreadT_LOT_STOCK = new readT_LOT_STOCK();

	// tbl_T_LOT_STOCK�N���X �C���X�^���X
	public tbl_T_LOT_STOCK mtbl_T_LOT_STOCK = new tbl_T_LOT_STOCK();

	// tbl_T_SHIP_INST�N���X �C���X�^���X
	public tbl_T_SHIP_INST mtbl_T_SHIP_INST = new tbl_T_SHIP_INST();

	// tbl_T_LOT_TRACE�N���X �C���X�^���X
	public tbl_T_LOT_TRACE mtbl_T_LOT_TRACE = new tbl_T_LOT_TRACE();

	// read_T_SHIP_INST�N���X �C���X�^���X
	public read_T_SHIP_INST mread_T_SHIP_INST = new read_T_SHIP_INST();

	// read_Rest_T_SHIP_INST�N���X �C���X�^���X
	public read_Rest_T_SHIP_INST mread_Rest_T_SHIP_INST = new read_Rest_T_SHIP_INST();

	// getLOT_NO�N���X �C���X�^���X
	public getLOT_NO mgetLOT_NO = new getLOT_NO();

	// selectM_EXCH_RATE�N���X �C���X�^���X
	public selectM_EXCH_RATE mselectM_EXCH_RATE = new selectM_EXCH_RATE();

	// selectT_SHIP_ODR_MODIFY_COUNT�N���X �C���X�^���X
	public selectT_SHIP_ODR_MODIFY_COUNT mselectT_SHIP_ODR_MODIFY_COUNT = new selectT_SHIP_ODR_MODIFY_COUNT();

	// selectT_SHIP_FOR_UPDATE_NOWAIT�N���X �C���X�^���X
	public selectT_SHIP_FOR_UPDATE_NOWAIT mselectT_SHIP_FOR_UPDATE_NOWAIT = new selectT_SHIP_FOR_UPDATE_NOWAIT();

	// updateT_LOT_TRACE�N���X �C���X�^���X
	public updateT_LOT_TRACE mupdateT_LOT_TRACE = new updateT_LOT_TRACE();


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
		String m_write_fname="KU0030010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="KU0030010";

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
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
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
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
	public class getUserInfo extends DataObject
	{
		protected String m_selcmd = "select "
+"  USER_MST.\"USER_NAME\" as \"USER_NAME\", "
+"  USER_MST.\"PLANT_CD\" as \"PLANT_CD\", "
+"  USER_MST.\"SECTION_CD\" as \"SECTION_CD\", "
+"  M_ORG.\"ORG_CD\" as \"ORG_CD\", "
+"  M_ORG.\"ORG_NAME\" as \"ORG_NAME\", "
+"  M_ORG.\"ORG_ANAME\" as \"ORG_ANAME\", "
+"  M_PLANT.\"PLANT_NAME\" as \"PLANT_NAME\", "
+"  M_PLANT.\"PLANT_ANAME\" as \"PLANT_ANAME\", "
+"  M_PLANT.\"CAL_NO\" as \"CAL_NO\" "
+"from "
+"  USER_MST, "
+"  M_ORG, "
+"  M_PLANT "
+"where "
+"  USER_MST.SECTION_CD = M_ORG.ORG_CD(+) "
+"  and USER_MST.PLANT_CD = M_PLANT.PLANT_CD "
+"  and USER_MST.\"USER_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getUserInfo_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getUserInfo_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read
                        if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getUserInfo_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read2
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getUserInfo_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_read3
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getUserInfo_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrUSER_CD());
				if(isNull(data.getstrUSER_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrUSER_NAME( getString(1, rs) );
			data.setstrPLANT_CD( getString(2, rs) );
			data.setstrSECTION_CD( getString(3, rs) );
			data.setstrORG_CD( getString(4, rs) );
			data.setstrORG_NAME( getString(5, rs) );
			data.setstrORG_ANAME( getString(6, rs) );
			data.setstrPLANT_NAME( getString(7, rs) );
			data.setstrPLANT_ANAME( getString(8, rs) );
			data.setstrCAL_NO( getDouble(9, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getUserInfo", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getUserInfo_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("getUserInfo", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getUserInfo_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getUserInfo_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getUserInfo_clear

			return;
		}

		/**
		 * getUserInfo�N���X�̕W���R���X�g���N�^
		 */
		public getUserInfo()
		{
			//{{user_implement_dev:getUserInfo_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getUserInfo_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getGyomuDate extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(sd.\"BUSINESS_OPR_DATE\", 'YYYY/MM/DD') as \"BUSINESS_OPR_DATE\", "
+"  sd.PLANT_CD as \"PLANT_CD\" "
+"from "
+"  SYS_CLASS_CODE sc, "
+"  SYS_DATE_CTRL sd "
+"where "
+"  sc.SYS_CLASS = 'SALES' "
+"  and sc.CLASS_CODE = 'PLANT_WEB' "
+"  and sc.CODE = sd.PLANT_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getGyomuDate_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getGyomuDate_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read
                        if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getGyomuDate_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read2
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getGyomuDate_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_read3
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getGyomuDate_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrBUSINESS_OPR_DATE( getString(1, rs) );
			data.setstrPLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getGyomuDate", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getGyomuDate_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("getGyomuDate", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getGyomuDate_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getGyomuDate_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getGyomuDate_clear

			return;
		}

		/**
		 * getGyomuDate�N���X�̕W���R���X�g���N�^
		 */
		public getGyomuDate()
		{
			//{{user_implement_dev:getGyomuDate_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getGyomuDate_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP.\"SHIP_SEQ_NO\" AS \"SHIP_SEQ_NO\", "
+"  T_SHIP.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SHIP.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_SHIP.\"ODR_NO\" AS \"ODR_NO\", "
+"  T_SHIP.\"PART_DLV_SEQ_NO\" AS \"PART_DLV_SEQ_NO\", "
+"  T_SHIP.\"ORGNAL_SLIP_CD\" AS \"ORGNAL_SLIP_CD\", "
+"  T_SHIP.\"SLIP_TRN_CD\" AS \"SLIP_TRN_CD\", "
+"  T_SHIP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SHIP.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_SHIP.\"CUST_ITEM_CD\" AS \"CUST_ITEM_CD\", "
+"  T_SHIP.\"CUST_ODR_NO\" AS \"CUST_ODR_NO\", "
+"  T_SHIP.\"CUST_CD\" AS \"CUST_CD\", "
+"  T_SHIP.\"CUST_NAME\" AS \"CUST_NAME\", "
+"  T_SHIP.\"CUST_CHRG_PSN_CD\" AS \"CUST_CHRG_PSN_CD\", "
+"  T_SHIP.\"SHIP_ODR_ISS_PSN_CD\" AS \"SHIP_ODR_ISS_PSN_CD\", "
+"  T_SHIP.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"  T_SHIP.\"DEPO_TYP\" AS \"DEPO_TYP\", "
+"  T_SHIP.\"ALLCT_WH_CD\" AS \"ALLCT_WH_CD\", "
+"  T_SHIP.\"DEPO_WH_CD\" AS \"DEPO_WH_CD\", "
+"  T_SHIP.\"LOC_CD\" AS \"LOC_CD\", "
+"  TO_CHAR(T_SHIP.\"SHIP_DATE\", 'YYYY/MM/DD') AS \"SHIP_DATE\", "
+"  T_SHIP.\"SHIP_QTY\" AS \"SHIP_QTY\", "
+"  T_SHIP.\"UNIT_CD\" AS \"UNIT_CD\", "
+"  T_SHIP.\"SHIP_UNIT_PRICE\" AS \"SHIP_UNIT_PRICE\", "
+"  T_SHIP.\"SHIP_ODR_AMOUNT\" AS \"SHIP_ODR_AMOUNT\", "
+"  T_SHIP.\"SHIP_ODR_AMOUNT_EXCH_RATES\" AS \"SHIP_ODR_AMOUNT_EXCH_RATES\", "
+"  T_SHIP.\"CURRNCY_CD\" AS \"CURRNCY_CD\", "
+"  T_SHIP.\"DIRECT_DLV_FLG\" AS \"DIRECT_DLV_FLG\", "
+"  T_SHIP.\"SHIP_INFO_IF_CTRL_NO\" AS \"SHIP_INFO_IF_CTRL_NO\", "
+"  T_SHIP.\"INSPC_ACPT_INFO_IF_CTRL_NO\" AS \"INSPC_ACPT_INFO_IF_CTRL_NO\", "
+"  T_SHIP.\"CUS_DLV_KEY_CD\" AS \"CUS_DLV_KEY_CD\", "
+"  T_SHIP.\"DEL_FLG\" AS \"DEL_FLG\", "
+"  M_CUR.\"CUR_NAME\" AS \"CUR_NAME\", "
+"  T_ODR.\"EXCH_TYP\" AS \"EXCH_TYP\", "
+"  T_SHIP_ODR.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  T_SHIP_ODR.\"RETURN_QTY\" AS \"RETURN_QTY\", "
+"  T_SHIP_ODR.\"TOTAL_SHIP_QTY\" AS \"TOTAL_SHIP_QTY\", "
+"  T_SALES.\"STATUS\" AS \"STATUS\", "
+"  T_SALES.\"INSPC_ACPT_TYP\" AS \"INSPC_ACPT_TYP\", "
+"  T_SALES.SALES_DEPT_CD, "
+"  TO_CHAR(T_SALES.\"SALES_DATE\", 'YYYY/MM/DD') AS \"SALES_DATE\", "
+"  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" AS \"LOT_CTRL_FLG\", "
+"  T_SHIP.MODIFY_COUNT AS MODIFY_COUNT "
+"FROM "
+"  T_SHIP, "
+"  T_ODR, "
+"  M_CUR, "
+"  T_SHIP_ODR, "
+"  T_SALES, "
+"  M_ITEM "
+"WHERE "
+"  T_SHIP.ODR_NO = T_ODR.ODR_NO(+) "
+"  AND T_SHIP.CURRNCY_CD = M_CUR.CUR_CD "
+"  AND T_SHIP.SLIP_CD = T_SHIP_ODR.SLIP_CD "
+"  AND T_SALES.SLIP_CD = T_SHIP.SLIP_CD "
+"  AND T_SHIP.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  AND T_SHIP.\"SLIP_CD\" = ? "
+"  AND T_SHIP.\"DEL_FLG\" = 0 "
+"  AND T_SHIP_ODR.SHP_CMPLT_FLG = 1 "
+"  AND T_SALES.\"DEL_FLG\" = 0 "
+"ORDER BY "
+"  T_SHIP.\"SHIP_SEQ_NO\" DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SHIP(\"SHIP_SEQ_NO\", \"SHIP_ODR_NO\", \"SLIP_CD\", \"ODR_NO\", \"PART_DLV_SEQ_NO\", \"ORGNAL_SLIP_CD\", \"SLIP_TRN_CD\", \"ITEM_CD\", \"JOB_ODR_CD\", \"CUST_ITEM_CD\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"CUST_CHRG_PSN_CD\", \"SHIP_ODR_ISS_PSN_CD\", \"DLV_LOC_CD\", \"DEPO_TYP\", \"ALLCT_WH_CD\", \"DEPO_WH_CD\", \"LOC_CD\", \"SHIP_DATE\", \"SHIP_QTY\", \"UNIT_CD\", \"SHIP_UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"SHIP_ODR_AMOUNT_EXCH_RATES\", \"CURRNCY_CD\", \"DIRECT_DLV_FLG\", \"CUS_DLV_KEY_CD\", \"REMARKS\", \"DEL_FLG\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "update T_SHIP "
+"set DEL_FLG = '1' "
+"where SHIP_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_SHIP_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SHIP_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SHIP_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTori_IN_SLIPCD());
				if(isNull(data.getserTori_IN_SLIPCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTori_IN_SLIPCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserTori_SHIP_SEQ_NO( getString(1, rs) );
			data.setserTori_SHIP_ODR_NO( getString(2, rs) );
			data.setserTori_SLIP_CD( getString(3, rs) );
			data.setserTori_ODR_NO( getString(4, rs) );
			data.setserTori_PART_DLV_SEQ_NO( getString(5, rs) );
			data.setserTori_ORGNAL_SLIP_CD( getString(6, rs) );
			data.setserTori_SLIP_TRN_CD( getString(7, rs) );
			data.setserTori_ITEM_CD( getString(8, rs) );
			data.setserTori_JOB_ODR_CD( getString(9, rs) );
			data.setserTori_CUST_ITEM_CD( getString(10, rs) );
			data.setserTori_CUST_ODR_NO( getString(11, rs) );
			data.setserTori_CUST_CD( getString(12, rs) );
			data.setserTori_CUST_NAME( getString(13, rs) );
			data.setserTori_CUST_CHRG_PSN_CD( getString(14, rs) );
			data.setserTori_SHIP_ODR_ISS_PSN_CD( getString(15, rs) );
			data.setserTori_DLV_LOC_CD( getString(16, rs) );
			data.setserTori_DEPO_TYP( getString(17, rs) );
			data.setserTori_ALLCT_WH_CD( getString(18, rs) );
			data.setserTori_DEPO_WH_CD( getString(19, rs) );
			data.setserTori_LOC_CD( getString(20, rs) );
			data.setserTori_SHIP_DATE( getString(21, rs) );
			data.setserTori_SHIP_QTY( getString(22, rs) );
			data.setserTori_UNIT_CD( getString(23, rs) );
			data.setserTori_SHIP_UNIT_PRICE( getString(24, rs) );
			data.setserTori_SHIP_ODR_AMOUNT( getString(25, rs) );
			data.setserTori_SHIP_ODR_AMOUNT_EXCH_RATES( getString(26, rs) );
			data.setserTori_CURRNCY_CD( getString(27, rs) );
			data.setserTori_DIRECT_DLV_FLG( getString(28, rs) );
			data.setserTori_SHIP_INFO_IF_CTRL_NO( getString(29, rs) );
			data.setserTori_INSPC_ACPT_INFO_IF_CTRL_NO( getString(30, rs) );
			data.setserTori_DLV_KEY_NO( getString(31, rs) );
			data.setserTori_DEL_FLG( getString(32, rs) );
			data.setserTori_CUR_NAME( getString(33, rs) );
			data.setserTori_EXCH_TYP( getString(34, rs) );
			data.setserTori_MODIFY_COUNT( getString(35, rs) );
			data.setserTori_RETURN_QTY( getString(36, rs) );
			data.setserTori_TOTAL_SHIP_QTY( getString(37, rs) );
			data.setserTori_STATUS( getString(38, rs) );
			data.setserTori_INSPC_ACPT_TYP( getString(39, rs) );
			data.setserToriSALES_DEPT_CD( getString(40, rs) );
			data.setserToriSALES_DATE( getString(41, rs) );
			data.seth_MRP_ODR_TYP( getString(42, rs) );
			data.seth_LOT_CTRL_FLG( getString(43, rs) );
			data.setserTodrMODIFY_COUNT( getString(44, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_SHIP_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTship_SHIP_SEQ_NO(), stmt);
				setString(8, data.getcreTship_SHIP_ODR_NO(), stmt);
				setString(9, data.getcreTship_SLIP_CD(), stmt);
				setString(10, data.getcreTship_ODR_NO(), stmt);
				setString(11, data.getcreTship_PART_DLV_SEQ_NO(), stmt);
				setString(12, data.getcreTship_ORGNAL_SLIP_CD(), stmt);
				setString(13, data.getcreTship_SLIP_TRN_CD(), stmt);
				setString(14, data.getcreTship_ITEM_CD(), stmt);
				setString(15, data.getcreTship_JOB_ODR_CD(), stmt);
				setString(16, data.getcreTship_CUST_ITEM_CD(), stmt);
				setString(17, data.getcreTship_CUST_ODR_NO(), stmt);
				setString(18, data.getcreTship_CUST_CD(), stmt);
				setString(19, data.getcreTship_CUST_NAME(), stmt);
				setString(20, data.getcreTship_CUST_CHRG_PSN_CD(), stmt);
				setString(21, data.getcreTship_SHIP_ODR_ISS_PSN_CD(), stmt);
				setString(22, data.getcreTship_DLV_LOC_CD(), stmt);
				setString(23, data.getcreTship_DEPO_TYP(), stmt);
				setString(24, data.getcreTship_ALLCT_WH_CD(), stmt);
				setString(25, data.getcreTship_DEPO_WH_CD(), stmt);
				setString(26, data.getcreTship_LOC_CD(), stmt);
				setString(27, data.getcreTship_SHIP_DATE(), stmt);
				setString(28, data.getcreTship_SHIP_QTY(), stmt);
				setString(29, data.getcreTship_UNIT_CD(), stmt);
				setString(30, data.getcreTship_SHIP_UNIT_PRICE(), stmt);
				setString(31, data.getcreTship_SHIP_ODR_AMOUNT(), stmt);
				setString(32, data.getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(), stmt);
				setString(33, data.getcreTship_CURRNCY_CD(), stmt);
				setString(34, data.getcreTship_DIRECT_DLV_FLG(), stmt);
				setString(35, data.getcreTship_DLV_KEY_NO(), stmt);
				setString(36, data.getcreTship_REMARKS(), stmt);
				setString(37, data.getcreTship_DEL_FLG(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupdTship_SHIP_SEQ_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_clear

			return;
		}

		/**
		 * tbl_T_SHIP�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP()
		{
			//{{user_implement_dev:tbl_T_SHIP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SHIP_ODR.\"ODR_NO\" AS \"ODR_NO\", "
+"  T_SHIP_ODR.\"PART_DLV_SEQ_NO\" AS \"PART_DLV_SEQ_NO\", "
+"  T_SHIP_ODR.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_SHIP_ODR.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SHIP_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_SHIP_ODR.\"CUST_ITEM_CD\" AS \"CUST_ITEM_CD\", "
+"  T_SHIP_ODR.\"CUST_ODR_NO\" AS \"CUST_ODR_NO\", "
+"  T_SHIP_ODR.\"CUST_CD\" AS \"CUST_CD\", "
+"  T_SHIP_ODR.\"CUST_NAME\" AS \"CUST_NAME\", "
+"  T_SHIP_ODR.\"CUST_CHRG_PSN_CD\" AS \"CUST_CHRG_PSN_CD\", "
+"  T_SHIP_ODR.\"SHIP_ODR_ISS_PSN_CD\" AS \"SHIP_ODR_ISS_PSN_CD\", "
+"  T_SHIP_ODR.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
+"  T_SHIP_ODR.\"DEPO_TYP\" AS \"DEPO_TYP\", "
+"  TO_CHAR(T_SHIP_ODR.\"DESINATED_SHIP_DATE\", 'YYYY/MM/DD') AS \"DESINATED_SHIP_DATE\", "
+"  T_SHIP_ODR.\"SHIP_QTY\" AS \"SHIP_QTY\", "
+"  T_SHIP_ODR.\"TOTAL_SHIP_QTY\" AS \"TOTAL_SHIP_QTY\", "
+"  T_SHIP_ODR.\"UNIT_CD\" AS \"UNIT_CD\", "
+"  T_SHIP_ODR.\"UNIT_PRICE\" AS \"UNIT_PRICE\", "
+"  T_SHIP_ODR.\"SHIP_ODR_AMOUNT\" AS \"SHIP_ODR_AMOUNT\", "
+"  T_SHIP_ODR.\"SHIP_ODR_AMOUNT_EXCH_RATES\" AS \"SHIP_ODR_AMOUNT_EXCH_RATES\", "
+"  T_SHIP_ODR.\"CURRNCY_CD\" AS \"CURRNCY_CD\", "
+"  T_SHIP_ODR.\"LOC_CD\" AS \"LOC_CD\", "
+"  T_SHIP_ODR.\"PKG_UNIT_QTY\" AS \"PKG_UNIT_QTY\", "
+"  T_SHIP_ODR.\"REMARKS\" AS \"REMARKS\", "
+"  T_SHIP_ODR.\"TRANSPORT_CD\" AS \"TRANSPORT_CD\", "
+"  T_SHIP_ODR.\"TRANSPORT_TYP\" AS \"TRANSPORT_TYP\", "
+"  T_SHIP_ODR.\"ALLCT_WH_CD\" AS \"ALLCT_WH_CD\", "
+"  T_SHIP_ODR.\"TRANSFER_WH_CD\" AS \"TRANSFER_WH_CD\", "
+"  T_SHIP_ODR.\"DIRECT_DLV_FLG\" AS \"DIRECT_DLV_FLG\", "
+"  T_SHIP_ODR.\"ENTRY_TYP\" AS \"ENTRY_TYP\", "
+"  T_SHIP_ODR.\"PRINT_FLG\" AS \"PRINT_FLG\", "
+"  T_SHIP_ODR.\"SHP_CMPLT_FLG\" AS \"SHP_CMPLT_FLG\", "
+"  T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" AS \"DEPO_TRANSFER_PROC_FLG\", "
+"  T_SHIP_ODR.\"DEL_FLG\" AS \"DEL_FLG\", "
+"  M_CUR.\"CUR_CD\" AS \"CUR_CD\", "
+"  M_CUR.\"CUR_NAME\" AS \"CUR_NAME\", "
+"  T_ODR.\"EXCH_TYP\" AS \"EXCH_TYP\", "
+"  T_ODR.\"SPCL_PRICE_TYP\" AS \"SPCL_PRICE_TYP\", "
+"  T_SHIP_ODR.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  TO_CHAR(T_SHIP_ODR.\"SCDL_DLV_DATE\", 'YYYY/MM/DD') AS \"SCDL_DLV_DATE\", "
+"  T_SHIP_ODR.\"DLV_KEY_NO\" AS \"DLV_KEY_NO\", "
+"  T_SHIP_ODR.\"RETURN_QTY\" AS \"RETURN_QTY\", "
+"  TO_CHAR(T_ODR.ODR_ACPT_DATE, 'YYYY/MM/DD') AS \"ODR_ACPT_DATE\", "
+"  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
+"  T_JOB_ODR_ODR_ALC.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  M_ITEM.\"LOT_CTRL_FLG\" AS \"LOT_CTRL_FLG\", "
+"  T_SHIP_ODR.MODIFY_COUNT AS MODIFY_COUNT "
+"FROM "
+"  T_SHIP_ODR, "
+"  M_CUR, "
+"  T_ODR, "
+"  M_ITEM, "
+"  T_JOB_ODR_ODR_ALC "
+"WHERE "
+"  T_SHIP_ODR.ODR_NO = T_ODR.ODR_NO "
+"  AND T_SHIP_ODR.CURRNCY_CD = M_CUR.CUR_CD "
+"  AND T_SHIP_ODR.\"ITEM_CD\" = M_ITEM.\"ITEM_CD\" "
+"  AND T_SHIP_ODR.\"ODR_NO\" = T_JOB_ODR_ODR_ALC.\"ODR_NO\"(+) "
+"  AND T_SHIP_ODR.\"DEPO_TRANSFER_PROC_FLG\" = 0 "
+"  AND T_SHIP_ODR.\"SHP_CMPLT_FLG\" = 0 "
+"  AND T_SHIP_ODR.\"SLIP_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_SHIP_ODR "
+"set "
+"  \"DEPO_TRANSFER_PROC_FLG\" = ? "
+"where "
+"  T_SHIP_ODR.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_ODR_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read
                        if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SHIP_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserInsert_IN_SLIPCD());
				if(isNull(data.getserInsert_IN_SLIPCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserInsert_IN_SLIPCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserInsert_SHIP_ODR_NO( getString(1, rs) );
			data.setserInsert_ODR_NO( getString(2, rs) );
			data.setserInsert_PART_DLV_SEQ_NO( getString(3, rs) );
			data.setserInsert_SLIP_CD( getString(4, rs) );
			data.setserInsert_ITEM_CD( getString(5, rs) );
			data.setserInsert_JOB_ODR_CD( getString(6, rs) );
			data.setserInsert_CUST_ITEM_CD( getString(7, rs) );
			data.setserInsert_CUST_ODR_NO( getString(8, rs) );
			data.setserInsert_CUST_CD( getString(9, rs) );
			data.setserInsert_CUST_NAME( getString(10, rs) );
			data.setserInsert_CUST_CHRG_PSN_CD( getString(11, rs) );
			data.setserInsert_SHIP_ODR_ISS_PSN_CD( getString(12, rs) );
			data.setserInsert_DLV_LOC_CD( getString(13, rs) );
			data.setserInsert_DEPO_TYP( getString(14, rs) );
			data.setserInsert_DESINATED_SHIP_DATE( getString(15, rs) );
			data.setserInsert_SHIP_QTY( getString(16, rs) );
			data.setserInsert_TOTAL_SHIP_QTY( getString(17, rs) );
			data.setserInsert_UNIT_CD( getString(18, rs) );
			data.setserInsert_UNIT_PRICE( getString(19, rs) );
			data.setserInsert_SHIP_ODR_AMOUNT( getString(20, rs) );
			data.setserInsert_SHIP_ODR_AMOUNT_EXCH_RATES( getString(21, rs) );
			data.setserInsert_CURRNCY_CD( getString(22, rs) );
			data.setserInsert_LOC_CD( getString(23, rs) );
			data.setserInsert_PKG_UNIT_QTY( getString(24, rs) );
			data.setserInsert_REMARKS( getString(25, rs) );
			data.setserInsert_TRANSPORT_CD( getString(26, rs) );
			data.setserInsert_TRANSPORT_TYP( getString(27, rs) );
			data.setserInsert_ALLCT_WH_CD( getString(28, rs) );
			data.setserInsert_TRANSFER_WH_CD( getString(29, rs) );
			data.setserInsert_DIRECT_DLV_FLG( getString(30, rs) );
			data.setserInsert_ENTRY_TYP( getString(31, rs) );
			data.setserInsert_PRINT_FLG( getString(32, rs) );
			data.setserInsert_SHP_CMPLT_FLG( getString(33, rs) );
			data.setserInsert_DEPO_TRANSFER_PROC_FLG( getString(34, rs) );
			data.setserInsert_DEL_FLG( getString(35, rs) );
			data.setserInsert_CUR_CD( getString(36, rs) );
			data.setserInsert_CUR_NAME( getString(37, rs) );
			data.setserInsert_EXCH_TYP( getString(38, rs) );
			data.setserInsert_SPCL_PRICE_TYP( getString(39, rs) );
			data.setserInsert_MODIFY_COUNT( getString(40, rs) );
			data.setserInsert_SCDL_DLV_DATE( getString(41, rs) );
			data.setserInsert_DLV_KEY_NO( getString(42, rs) );
			data.seth_RETURN_QTY( getString(43, rs) );
			data.setserInsert_ODR_ACPT_DATE( getString(44, rs) );
			data.seth_MRP_ODR_TYP( getString(45, rs) );
			data.seth_JOB_ODR_CD( getString(46, rs) );
			data.seth_LOT_CTRL_FLG( getString(47, rs) );
			data.setselMODIFY_COUNT( getString(48, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_SHIP_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("tbl_T_SHIP_ODR", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_T_SHIP_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getupTshipOdr_DEPO_TRANSFER_PROC_FLG(), stmt);
				setString(2, data.getupTshipOdr_IN_SLIPCD(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_ODR_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR_clear

			return;
		}

		/**
		 * tbl_T_SHIP_ODR�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_ODR()
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class chkIsWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  M_WH.\"WH_NAME\" as \"WH_NAME\" "
+"from "
+"  M_WH "
+"where "
+"  M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkIsWhCd_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:chkIsWhCd_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read
                        if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:chkIsWhCd_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read2
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkIsWhCd_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_read3
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkIsWhCd_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkisWhCd_IN_WHCD());
				if(isNull(data.getchkisWhCd_IN_WHCD())) isNull = true;
				ary.addElement(data.getchkisWhCd_IN_WHTYP());
				if(isNull(data.getchkisWhCd_IN_WHTYP())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getchkisWhCd_IN_WHCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getchkisWhCd_IN_WHTYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setchkisWhCd_WH_CD( getString(1, rs) );
			data.setchkisWhCd_WH_TYP( getString(2, rs) );
			data.setchkisinWhCd_WH_NAME( getString(3, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkIsWhCd", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkIsWhCd_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("chkIsWhCd", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:chkIsWhCd_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkIsWhCd_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:chkIsWhCd_clear

			return;
		}

		/**
		 * chkIsWhCd�N���X�̕W���R���X�g���N�^
		 */
		public chkIsWhCd()
		{
			//{{user_implement_dev:chkIsWhCd_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:chkIsWhCd_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SALES extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_SALES.\"SALES_SEQ_NO\" as \"SALES_SEQ_NO\", "
+"  T_SALES.\"SLIP_CD\" as \"SLIP_CD\", "
+"  T_SALES.\"SALES_TYP\" as \"SALES_TYP\", "
+"  T_SALES.\"CUST_CD\" as \"CUST_CD\", "
+"  T_SALES.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_SALES.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  T_SALES.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  TO_CHAR(T_SALES.\"SALES_DATE\", 'YYYY/MM/DD') as \"SALES_DATE\", "
+"  T_SALES.\"SALES_DEPT_CD\" as \"SALES_DEPT_CD\", "
+"  T_SALES.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_SALES.\"ODR_ACPT_PSN_CD\" as \"ODR_ACPT_PSN_CD\", "
+"  T_SALES.\"SALES_QTY\" as \"SALES_QTY\", "
+"  T_SALES.\"SALES_UNIT_PRICE\" as \"SALES_UNIT_PRICE\", "
+"  T_SALES.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_SALES.\"SALES_AMOUNT\" as \"SALES_AMOUNT\", "
+"  T_SALES.\"SALES_AMOUNT_EXCH_RATES\" as \"SALES_AMOUNT_EXCH_RATES\", "
+"  T_SALES.\"EXTERNAL_TAX_SALES_AMOUNT\" as \"EXTERNAL_TAX_SALES_AMOUNT\",  "
+"  T_SALES.\"INTERNAL_TAX_SALES_AMOUNT\" as \"INTERNAL_TAX_SALES_AMOUNT\",  "
+"  T_SALES.\"TAXFREE_SALES_AMOUNT\" as \"TAXFREE_SALES_AMOUNT\",  "
+"  T_SALES.\"TAX_CREDIT_SALES_AMOUNT\" as \"TAX_CREDIT_SALES_AMOUNT\",  "
+"  T_SALES.\"EXTERNAL_TAX_AMOUNT\" as \"EXTERNAL_TAX_AMOUNT\",  "
+"  T_SALES.\"INTERNAL_TAX_AMOUNT\" as \"INTERNAL_TAX_AMOUNT\",  "
+"  T_SALES.\"TAX_AMOUNT_1\" as \"TAX_AMOUNT_1\",  "
+"  T_SALES.\"TAX_AMOUNT_2\" as \"TAX_AMOUNT_2\",  "
+"  T_SALES.\"TAX_AMOUNT_3\" as \"TAX_AMOUNT_3\",  "
+"  T_SALES.\"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" as \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\",  "
+"  T_SALES.\"ORG_SLIP_CD\" as \"ORG_SLIP_CD\",  "
+"  T_SALES.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_SALES.\"SPCL_PRICE_CO\" as \"SPCL_PRICE_CO\", "
+"  T_SALES.\"REMARKS\" as \"REMARKS\", "
+"  T_SALES.\"DEL_FLG\" as \"DEL_FLG\", "
+"  T_SALES.\"INSPC_ACPT_TYP\" as \"INSPC_ACPT_TYP\",  "
+"  T_SALES.\"STATUS\" as \"STATUS\", "
+"  T_SALES.\"PRD_ODR_PLACE_CD\" as \"PRD_ODR_PLACE_CD\", "
+"  T_SALES.\"EXCH_RATE\" as \"EXCH_RATE\" "
+"from "
+"  T_SALES "
+"where "
+"  T_SALES.\"SLIP_CD\" = ? "
+"  and T_SALES.\"DEL_FLG\" = 0 "
+"order by "
+"  T_SALES.\"SALES_SEQ_NO\" desc";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_SALES(\"SALES_SEQ_NO\", \"SHIP_ODR_NO\", \"SLIP_CD\", \"SALES_TYP\", \"CUST_CD\", \"ITEM_CD\", \"ITEM_NAME\", \"CUST_ODR_NO\", \"SALES_DATE\", \"SALES_DEPT_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_PSN_CD\", \"SALES_QTY\", \"SALES_UNIT_PRICE\", \"UNIT_CD\", \"SALES_AMOUNT\", \"SALES_AMOUNT_EXCH_RATES\", \"INSPC_ACPT_DATE\", \"INSPC_ACPT_QTY\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"ORG_SLIP_CD\", \"CURRNCY_CD\", \"SPCL_PRICE_CO\", \"REMARKS\", \"DEL_FLG\", \"INSPC_ACPT_TYP\", \"STATUS\", \"APPR_FLG\", \"APPR_ID\", \"APPR_DATE\", \"EXCH_RATE\") "
+"values "
+"  (SEQ_SALES_SEQ_NO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, to_date(?), ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SALES "
+"SET "
+"  \"DEL_FLG\" = '1', "
+"  \"APPR_FLG\" = ?, "
+"  \"APPR_ID\" = ?, "
+"  \"APPR_DATE\" = to_date(?) "
+"WHERE "
+"  SALES_SEQ_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SALES_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SALES_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SALES_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_SALES", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_SALES_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SALES_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_SALES", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SALES_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SALES_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_SALES", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_SALES_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTsales_IN_SLIPCD());
				if(isNull(data.getserTsales_IN_SLIPCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTsales_IN_SLIPCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserTsales_SALES_SEQ_NO( getString(1, rs) );
			data.setserTsales_SLIP_CD( getString(2, rs) );
			data.setserTsales_SALES_TYP( getString(3, rs) );
			data.setserTsales_CUST_CD( getString(4, rs) );
			data.setserTsales_ITEM_CD( getString(5, rs) );
			data.setserTsales_ITEM_NAME( getString(6, rs) );
			data.setserTsales_CUST_ODR_NO( getString(7, rs) );
			data.setserTsales_SALES_DATE( getString(8, rs) );
			data.setserTsales_SALES_DEPT_CD( getString(9, rs) );
			data.setserTsales_CUST_CHRG_PSN_CD( getString(10, rs) );
			data.setserTsales_ODR_ACPT_PSN_CD( getString(11, rs) );
			data.setserTsales_SALES_QTY( getString(12, rs) );
			data.setserTsales_SALES_UNIT_PRICE( getString(13, rs) );
			data.setserTsales_UNIT_CD( getString(14, rs) );
			data.setserTsales_SALES_AMOUNT( getString(15, rs) );
			data.setserTsales_SALES_AMOUNT_EXCH_RATES( getString(16, rs) );
			data.setserTsales_EXTERNAL_TAX_SALES_AMOUNT( getString(17, rs) );
			data.setserTsales_INTERNAL_TAX_SALES_AMOUNT( getString(18, rs) );
			data.setserTsales_TAXFREE_SALES_AMOUNT( getString(19, rs) );
			data.setserTsales_TAX_CREDIT_SALES_AMOUNT( getString(20, rs) );
			data.setserTsales_EXTERNAL_TAX_AMOUNT( getString(21, rs) );
			data.setserTsales_INTERNAL_TAX_AMOUNT( getString(22, rs) );
			data.setserTsales_TAX_AMOUNT_1( getString(23, rs) );
			data.setserTsales_TAX_AMOUNT_2( getString(24, rs) );
			data.setserTsales_TAX_AMOUNT_3( getString(25, rs) );
			data.setserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT( getString(26, rs) );
			data.setserTsales_ORG_SLIP_CD( getString(27, rs) );
			data.setserTsales_CURRNCY_CD( getString(28, rs) );
			data.setserTsales_SPCL_PRICE_CO( getString(29, rs) );
			data.setserTsales_REMARKS( getString(30, rs) );
			data.setserTsales_DEL_FLG( getString(31, rs) );
			data.setserTsales_INSPC_ACPT_TYP( getString(32, rs) );
			data.setserTsales_STATUS( getString(33, rs) );
			data.setserTsales_PRD_ODR_PLACE_CD( getString(34, rs) );
			data.setserTsales_EXCH_RATE( getString(35, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_SALES", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_SALES_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_SALES_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTsales_SHIP_ODR_NO(), stmt);
				setString(8, data.getcreTsales_SLIP_CD(), stmt);
				setString(9, data.getcreTsales_SALES_TYP(), stmt);
				setString(10, data.getcreTsales_CUST_CD(), stmt);
				setString(11, data.getcreTsales_ITEM_CD(), stmt);
				setString(12, data.getcreTsales_ITEM_NAME(), stmt);
				setString(13, data.getcreTsales_CUST_ODR_NO(), stmt);
				setString(14, data.getcreTsales_SALES_DATE(), stmt);
				setString(15, data.getcreTsales_SALES_DEPT_CD(), stmt);
				setString(16, data.getcreTsales_CUST_CHRG_PSN_CD(), stmt);
				setString(17, data.getcreTsales_ODR_ACPT_PSN_CD(), stmt);
				setString(18, data.getcreTsales_SALES_QTY(), stmt);
				setString(19, data.getcreTsales_SALES_UNIT_PRICE(), stmt);
				setString(20, data.getcreTsales_UNIT_CD(), stmt);
				setString(21, data.getcreTsales_SALES_AMOUNT(), stmt);
				setString(22, data.getcreTsales_SALES_AMOUNT_EXCH_RATES(), stmt);
				setString(23, data.getcreTsales_INSPC_ACPT_DATE(), stmt);
				setString(24, data.getcreTsales_INSPC_ACPT_QTY(), stmt);
				setString(25, data.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(26, data.getcreTsales_INTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(27, data.getcreTsales_TAXFREE_SALES_AMOUNT(), stmt);
				setString(28, data.getcreTsales_TAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(29, data.getcreTsales_EXTERNAL_TAX_AMOUNT(), stmt);
				setString(30, data.getcreTsales_INTERNAL_TAX_AMOUNT(), stmt);
				setString(31, data.getcreTsales_TAX_AMOUNT_1(), stmt);
				setString(32, data.getcreTsales_TAX_AMOUNT_2(), stmt);
				setString(33, data.getcreTsales_TAX_AMOUNT_3(), stmt);
				setString(34, data.getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(35, data.getcreTsales_ORG_SLIP_CD(), stmt);
				setString(36, data.getcreTsales_CURRNCY_CD(), stmt);
				setString(37, data.getcreTsales_SPCL_PRICE_CO(), stmt);
				setString(38, data.getcreTsales_REMARKS(), stmt);
				setString(39, data.getcreTsales_DEL_FLG(), stmt);
				setString(40, data.getcreTsales_INSPC_ACPT_TYP(), stmt);
				setString(41, data.getcreTsales_STATUS(), stmt);
				setString(42, data.getcreTsales_APPR_FLG(), stmt);
				setString(43, data.getcreTsales_APPR_ID(), stmt);
				setString(44, data.getcreTsales_APPR_DATE(), stmt);
				setString(45, data.getcreTsales_EXCH_RATE(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupdTsales_APPR_FLG(), stmt);
				setString(5, data.getupdTsales_APPR_ID(), stmt);
				setString(6, data.getupdTsales_APPR_DATE(), stmt);
				setString(7, data.getupdTsales_SALES_SEQ_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_SALES_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SALES_clear

			return;
		}

		/**
		 * tbl_T_SALES�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SALES()
		{
			//{{user_implement_dev:tbl_T_SALES_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SALES_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_M_ITEM extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\", "
+"  M_ITEM.\"PRODUCT_TYP\" as \"PRODUCT_TYP\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"MRP_ODR_TYP\", "
+"  M_ITEM.\"DRAW_CD\" as \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" as \"SPEC\", "
+"  M_ITEM.\"HIGH_LEVEL_NO\" as \"HIGH_LEVEL_NO\", "
+"  M_ITEM.\"OUTSIDE_TYP\" as \"OUTSIDE_TYP\", "
+"  M_ITEM.\"STOCK_UNIT_FLG\" as \"STOCK_UNIT_FLG\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"STOCK_UNIT\", "
+"  M_ITEM.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  M_ITEM.\"PKG_UNIT_QTY\" as \"PKG_UNIT_QTY\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" as \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"ODR_LT\" as \"ODR_LT\", "
+"  M_ITEM.\"FIXED_LT\" as \"FIXED_LT\", "
+"  M_ITEM.\"PROP_LT\" as \"PROP_LT\", "
+"  M_ITEM.\"SAFETY_LT\" as \"SAFETY_LT\", "
+"  M_ITEM.\"ISSUE_LT\" as \"ISSUE_LT\", "
+"  M_ITEM.\"PROP_LOT_SIZE\" as \"PROP_LOT_SIZE\", "
+"  M_ITEM.\"ITEM_SPOIL\" as \"ITEM_SPOIL\", "
+"  M_ITEM.\"SAFETY_STOCK\" as \"SAFETY_STOCK\", "
+"  M_ITEM.\"LOT_SIZING_TYP\" as \"LOT_SIZING_TYP\", "
+"  M_ITEM.\"MAX_PERIOD\" as \"MAX_PERIOD\", "
+"  M_ITEM.\"MAX_ODR_QTY\" as \"MAX_ODR_QTY\", "
+"  M_ITEM.\"ODR_POINT\" as \"ODR_POINT\", "
+"  M_ITEM.\"FIXED_ODR_QTY\" as \"FIXED_ODR_QTY\", "
+"  M_ITEM.\"MIN_ODR_QTY\" as \"MIN_ODR_QTY\", "
+"  M_ITEM.\"MUL_ODR_QTY\" as \"MUL_ODR_QTY\", "
+"  M_ITEM.\"ISSUE_TYP\" as \"ISSUE_TYP\", "
+"  M_ITEM.\"MPS_FLG\" as \"MPS_FLG\", "
+"  M_ITEM.\"ACPT_INSPC_TYP\" as \"ACPT_INSPC_TYP\", "
+"  M_ITEM.\"CLASIFICATION_CD\" as \"CLASIFICATION_CD\", "
+"  M_ITEM.\"UNIT_WEIGHT\" as \"UNIT_WEIGHT\", "
+"  M_ITEM.\"ABC_TYP\" as \"ABC_TYP\", "
+"  M_ITEM.\"OPR_RSLT_TYP\" as \"OPR_RSLT_TYP\", "
+"  M_ITEM.\"SPL_ITEM_TYP\" as \"SPL_ITEM_TYP\", "
+"  M_ITEM.\"TAX_CD\" as \"TAX_CD\" "
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

		//{{user_implement_dev:tbl_M_ITEM_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_ITEM_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read
                        if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_M_ITEM_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ITEM_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ITEM_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmItem_IN_ITEMCD());
				if(isNull(data.getmItem_IN_ITEMCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmItem_IN_ITEMCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmItem_ITEM_CD( getString(1, rs) );
			data.setmItem_ITEM_NAME( getString(2, rs) );
			data.setmItem_PRODUCT_TYP( getString(3, rs) );
			data.setmItem_MRP_ODR_TYP( getString(4, rs) );
			data.setmItem_DRAW_CD( getString(5, rs) );
			data.setmItem_SPEC( getString(6, rs) );
			data.setmItem_HIGH_LEVEL_NO( getString(7, rs) );
			data.setmItem_OUTSIDE_TYP( getString(8, rs) );
			data.setmItem_STOCK_UNIT_FLG( getString(9, rs) );
			data.setmItem_STOCK_UNIT( getString(10, rs) );
			data.setmItem_PKG_UNIT( getString(11, rs) );
			data.setmItem_PKG_UNIT_QTY( getString(12, rs) );
			data.setmItem_UNIT_QTY_TYP( getString(13, rs) );
			data.setmItem_ODR_LT( getString(14, rs) );
			data.setmItem_FIXED_LT( getString(15, rs) );
			data.setmItem_PROP_LT( getString(16, rs) );
			data.setmItem_SAFETY_LT( getString(17, rs) );
			data.setmItem_ISSUE_LT( getString(18, rs) );
			data.setmItem_PROP_LOT_SIZE( getString(19, rs) );
			data.setmItem_ITEM_SPOIL( getString(20, rs) );
			data.setmItem_SAFETY_STOCK( getString(21, rs) );
			data.setmItem_LOT_SIZING_TYP( getString(22, rs) );
			data.setmItem_MAX_PERIOD( getString(23, rs) );
			data.setmItem_MAX_ODR_QTY( getString(24, rs) );
			data.setmItem_ODR_POINT( getString(25, rs) );
			data.setmItem_FIXED_ODR_QTY( getString(26, rs) );
			data.setmItem_MIN_ODR_QTY( getString(27, rs) );
			data.setmItem_MUL_ODR_QTY( getString(28, rs) );
			data.setmItem_ISSUE_TYP( getString(29, rs) );
			data.setmItem_MPS_FLG( getString(30, rs) );
			data.setmItem_ACPT_INSPC_TYP( getString(31, rs) );
			data.setmItem_CLASIFICATION_CD( getString(32, rs) );
			data.setmItem_UNIT_WEIGHT( getString(33, rs) );
			data.setmItem_ABC_TYP( getString(34, rs) );
			data.setmItem_OPR_RSLT_TYP( getString(35, rs) );
			data.setmItem_SPL_ITEM_TYP( getString(36, rs) );
			data.setmItem_TAX_CD( getString(37, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("tbl_M_ITEM", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_M_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_ITEM_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ITEM_clear

			return;
		}

		/**
		 * tbl_M_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_ITEM()
		{
			//{{user_implement_dev:tbl_M_ITEM_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_M_ITEM_SPEC extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM_SPEC.\"CUST_CD\", "
+"  M_ITEM_SPEC.\"CUST_ITEM_CD\", "
+"  M_ITEM_SPEC.\"COMPANY_CD\", "
+"  M_ITEM_SPEC.\"SALES_DEPT_CD\", "
+"  M_ITEM_SPEC.\"CUST_ITEM_NAME\" "
+"from "
+"  M_ITEM_SPEC "
+"where "
+"  M_ITEM_SPEC.\"CUST_CD\" = ? "
+"  and M_ITEM_SPEC.\"CUST_ITEM_CD\" = ? "
+"  and M_ITEM_SPEC.\"COMPANY_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_ITEM_SPEC_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_ITEM_SPEC_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_SPEC_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM_SPEC", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_SPEC_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM_SPEC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_SPEC_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM_SPEC", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmItemSpec_IN_CUST_CD());
				if(isNull(data.getmItemSpec_IN_CUST_CD())) isNull = true;
				ary.addElement(data.getmItemSpec_IN_CUST_ITEM_CD());
				if(isNull(data.getmItemSpec_IN_CUST_ITEM_CD())) isNull = true;
				ary.addElement(data.getmItemSpec_IN_COMPANY_CD());
				if(isNull(data.getmItemSpec_IN_COMPANY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmItemSpec_IN_CUST_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmItemSpec_IN_CUST_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmItemSpec_IN_COMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmItemSpec_CUST_CD( getString(1, rs) );
			data.setmItemSpec_CUST_ITEM_CD( getString(2, rs) );
			data.setmItemSpec_COMPANY_CD( getString(3, rs) );
			data.setmItemSpec_SALES_DEPT_CD( getString(4, rs) );
			data.setmItemSpec_CUST_ITEM_NAME( getString(5, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_ITEM_SPEC", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ITEM_SPEC_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_ITEM_SPEC_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_clear

			return;
		}

		/**
		 * tbl_M_ITEM_SPEC�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_ITEM_SPEC()
		{
			//{{user_implement_dev:tbl_M_ITEM_SPEC_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ITEM_SPEC_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ODR.\"ODR_NO\" as \"ODR_NO\", "
+"  T_ODR.\"ODR_TYP\" as \"ODR_TYP\", "
+"  T_ODR.\"ODR_CTL_NO\" as \"ODR_CTL_NO\", "
+"  T_ODR.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  T_ODR.\"CUST_CHRG_ORG_CD\" as \"CUST_CHRG_ORG_CD\", "
+"  T_ODR.\"CUST_CHRG_PSN_CD\" as \"CUST_CHRG_PSN_CD\", "
+"  T_ODR.\"ODR_ACPT_ORG_CD\" as \"ODR_ACPT_ORG_CD\", "
+"  T_ODR.\"ODR_ACPT_PSN_CD\" as \"ODR_ACPT_PSN_CD\", "
+"  T_ODR.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_ODR.\"EXCH_TYP\" as \"EXCH_TYP\", "
+"  T_ODR.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  T_ODR.\"DLV_LOC_CD_EIAJ\" as \"DLV_LOC_CD_EIAJ\", "
+"  T_ODR.\"DLV_LOC_NAME\" as \"DLV_LOC_NAME\", "
+"  T_ODR.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_ODR.\"PRD_ODR_PLACE_CD\" as \"PRD_ODR_PLACE_CD\", "
+"  T_ODR.\"ODR_UNIT_PRICE\" as \"ODR_UNIT_PRICE\", "
+"  T_ODR.\"SPCL_PRICE_TYP\" as \"SPCL_PRICE_TYP\", "
+"  T_ODR.\"PART_DLV_COUNT\" as \"PART_DLV_COUNT\", "
+"  T_ODR.\"DEPO_TYP\" as \"DEPO_TYP\", "
+"  TO_CHAR(T_ODR.\"DESINATED_DLV_DATE\", 'YYYY/MM/DD') as \"DESINATED_DLV_DATE\", "
+"  TO_CHAR(T_ODR.\"STD_DESINATED_RCV_DATE\", 'YYYY/MM/DD') as \"STD_DESINATED_RCV_DATE\", "
+"  T_ODR.\"ODR_QTY\" as \"ODR_QTY\", "
+"  T_ODR.\"REMAIN_UNCONFIRM_ODR_QTY\" as \"REMAIN_UNCONFIRM_ODR_QTY\", "
+"  T_ODR.\"CANCELED_UNCONFIRM_ODR_QTY\" as \"CANCELED_UNCONFIRM_ODR_QTY\", "
+"  T_ODR.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_ODR.\"UNCONFIRM_ODR_BALANCE\" as \"UNCONFIRM_ODR_BALANCE\", "
+"  T_ODR.\"ODR_AMOUNT\" as \"ODR_AMOUNT\", "
+"  T_ODR.\"ODR_AMOUNT_EXCH_RATES\" as \"ODR_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"TOTAL_SHIP_QTY\" as \"TOTAL_SHIP_QTY\", "
+"  T_ODR.\"SHIP_AMOUNT\" as \"SHIP_AMOUNT\", "
+"  T_ODR.\"SHIP_AMOUNT_EXCH_RATES\" as \"SHIP_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"RETURN_PRICE\" as \"RETURN_PRICE\", "
+"  T_ODR.\"RETURN_QTY\" as \"RETURN_QTY\", "
+"  T_ODR.\"RETURN_AMOUNT\" as \"RETURN_AMOUNT\", "
+"  T_ODR.\"RETURN_AMOUNT_EXCH_RATES\" as \"RETURN_AMOUNT_EXCH_RATES\", "
+"  T_ODR.\"ODR_CMPLT_FLG\" as \"ODR_CMPLT_FLG\", "
+"  TO_CHAR(T_ODR.\"ODR_CMPLT_DATE\", 'YYYY/MM/DD') as \"ODR_CMPLT_DATE\", "
+"  T_ODR.\"CUS_DLV_CD\" as \"CUS_DLV_CD\", "
+"  T_ODR.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  T_ODR.\"PART_NAME\" as \"PART_NAME\", "
+"  T_ODR.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  T_ODR.\"SLIP_PRICE_PRINT_TYP\" as \"SLIP_PRICE_PRINT_TYP\", "
+"  T_ODR.\"INSPC_TYP\" as \"INSPC_TYP\", "
+"  T_ODR.\"CLIENT_REMARK\" as \"CLIENT_REMARK\", "
+"  T_ODR.\"CLIENT_REMARK_KANJI\" as \"CLIENT_REMARK_KANJI\", "
+"  T_ODR.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\", "
+"  T_ODR.\"TRANSPORT_CD\" as \"TRANSPORT_CD\", "
+"  T_ODR.\"TRANSPORT_TYP\" as \"TRANSPORT_TYP\", "
+"  T_ODR.\"TAX_APPLY_TYP\" as \"TAX_APPLY_TYP\", "
+"  T_ODR.\"TAX_CD\" as \"TAX_CD\", "
+"  T_ODR.\"TAX_CALC_TYP\" as \"TAX_CALC_TYP\", "
+"  T_ODR.\"REMARKS\" as \"REMARKS\", "
+"  T_ODR.\"ODR_ACPT_DATE\" as \"ODR_ACPT_DATE\", "
+"  T_ODR.\"SHIP_PLAN_REMAIN_QTY\" as \"SHIP_PLAN_REMAIN_QTY\", "
+"  T_ODR.\"SHIP_PLAN_CMPLT_FLG\" as \"SHIP_PLAN_CMPLT_FLG\", "
+"  T_ODR.\"UNCONFIRMED_ODR_EFF_OVR_FLG\" as \"UNCONFIRMED_ODR_EFF_OVR_FLG\", "
+"  T_ODR.\"PARTIAL_SHIP_INST_FLG\" as \"PARTIAL_SHIP_INST_FLG\", "
+"  T_ODR.\"IF_CTL_NO\" as \"IF_CTL_NO\", "
+"  T_ODR.\"ENTRY_TYP\" as \"ENTRY_TYP\", "
+"  T_ODR.\"DEL_FLG\" as \"DEL_FLG\", "
+"  T_ODR.\"SHIP_CNT\" as \"SHIP_CNT\", "
+"  T_ODR.\"UNIT_CD_ORG\" as \"UNIT_CD_ORG\", "
+"  T_ODR_CTL.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR.\"COCK_TYP\" as \"COCK_TYP\", "
+"  T_ODR.\"PUCH_ODR_QTY_TOTAL\" as \"PUCH_ODR_QTY_TOTAL\", "
+"  T_ODR.\"BUYER_ORG_CD\" as \"BUYER_ORG_CD\", "
+"  T_ODR.\"BUYER_NAME\" as \"BUYER_NAME\" "
+"from "
+"  T_ODR, "
+"  T_ODR_CTL "
+"where "
+"  T_ODR.\"DEL_FLG\" = 0 "
+"  and T_ODR.\"ODR_NO\" = ? "
+"  and T_ODR.\"ODR_CTL_NO\" = T_ODR_CTL.\"ODR_CTL_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_ODR(\"ODR_NO\", \"ODR_TYP\", \"ODR_CTL_NO\", \"CUST_ODR_NO\", \"CUST_CHRG_ORG_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_ORG_CD\", \"ODR_ACPT_PSN_CD\", \"CURRNCY_CD\", \"EXCH_TYP\", \"DLV_LOC_CD\", \"DLV_LOC_NAME\", \"DLV_LOC_NAME_KANJI\", \"PRD_ODR_PLACE_CD\", \"ODR_UNIT_PRICE\", \"PART_DLV_COUNT\", \"DEPO_TYP\", \"DESINATED_DLV_DATE\", \"ODR_QTY\", \"REMAIN_UNCONFIRM_ODR_QTY\", \"CANCELED_UNCONFIRM_ODR_QTY\", \"UNIT_CD\", \"UNCONFIRM_ODR_BALANCE\", \"ODR_AMOUNT\", \"ODR_AMOUNT_EXCH_RATES\", \"TOTAL_SHIP_QTY\", \"SHIP_AMOUNT\", \"SHIP_AMOUNT_EXCH_RATES\", \"ODR_CMPLT_FLG\", \"ODR_CMPLT_DATE\", \"REMARKS\", \"ODR_ACPT_DATE\", \"SHIP_PLAN_REMAIN_QTY\", \"SHIP_PLAN_CMPLT_FLG\", \"UNCONFIRMED_ODR_EFF_OVR_FLG\", \"PARTIAL_SHIP_INST_FLG\", \"ENTRY_TYP\", \"DEL_FLG\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "update "
+"  T_ODR "
+"set "
+"  \"TOTAL_SHIP_QTY\" = ?, "
+"  \"SHIP_AMOUNT\" = ?, "
+"  \"SHIP_AMOUNT_EXCH_RATES\" = ?, "
+"  \"ODR_CMPLT_FLG\" = ?, "
+"  \"ODR_CMPLT_DATE\" = ? "
+"where "
+"  T_ODR.\"ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_ODR_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read
                        if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_T_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettOdr_IN_ODRNO());
				if(isNull(data.gettOdr_IN_ODRNO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.gettOdr_IN_ODRNO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.settOdr_ODR_NO( getString(1, rs) );
			data.settOdr_ODR_TYP( getString(2, rs) );
			data.settOdr_ODR_CTL_NO( getString(3, rs) );
			data.settOdr_CUST_ODR_NO( getString(4, rs) );
			data.settOdr_CUST_CHRG_ORG_CD( getString(5, rs) );
			data.settOdr_CUST_CHRG_PSN_CD( getString(6, rs) );
			data.settOdr_ODR_ACPT_ORG_CD( getString(7, rs) );
			data.settOdr_ODR_ACPT_PSN_CD( getString(8, rs) );
			data.settOdr_CURRNCY_CD( getString(9, rs) );
			data.settOdr_EXCH_TYP( getString(10, rs) );
			data.settOdr_DLV_LOC_CD( getString(11, rs) );
			data.settOdr_DLV_LOC_CD_EIAJ( getString(12, rs) );
			data.settOdr_DLV_LOC_NAME( getString(13, rs) );
			data.settOdr_DLV_LOC_NAME_KANJI( getString(14, rs) );
			data.settOdr_PRD_ODR_PLACE_CD( getString(15, rs) );
			data.settOdr_ODR_UNIT_PRICE( getString(16, rs) );
			data.settOdr_SPCL_PRICE_TYP( getString(17, rs) );
			data.settOdr_PART_DLV_COUNT( getString(18, rs) );
			data.settOdr_DEPO_TYP( getString(19, rs) );
			data.settOdr_DESINATED_DLV_DATE( getString(20, rs) );
			data.settOdr_STD_DESINATED_RCV_DATE( getString(21, rs) );
			data.settOdr_ODR_QTY( getString(22, rs) );
			data.settOdr_REMAIN_UNCONFIRM_ODR_QTY( getString(23, rs) );
			data.settOdr_CANCELED_UNCONFIRM_ODR_QTY( getString(24, rs) );
			data.settOdr_UNIT_CD( getString(25, rs) );
			data.settOdr_UNCONFIRM_ODR_BALANCE( getString(26, rs) );
			data.settOdr_ODR_AMOUNT( getString(27, rs) );
			data.settOdr_ODR_AMOUNT_EXCH_RATES( getString(28, rs) );
			data.settOdr_TOTAL_SHIP_QTY( getString(29, rs) );
			data.settOdr_SHIP_AMOUNT( getString(30, rs) );
			data.settOdr_SHIP_AMOUNT_EXCH_RATES( getString(31, rs) );
			data.settOdr_RETURN_PRICE( getString(32, rs) );
			data.settOdr_RETURN_QTY( getString(33, rs) );
			data.settOdr_RETURN_AMOUNT( getString(34, rs) );
			data.settOdr_RETURN_AMOUNT_EXCH_RATES( getString(35, rs) );
			data.settOdr_ODR_CMPLT_FLG( getString(36, rs) );
			data.settOdr_ODR_CMPLT_DATE( getString(37, rs) );
			data.settOdr_CUS_DLV_CD( getString(38, rs) );
			data.settOdr_DLV_KEY_NO( getString(39, rs) );
			data.settOdr_PART_NAME( getString(40, rs) );
			data.settOdr_PKG_UNIT( getString(41, rs) );
			data.settOdr_SLIP_PRICE_PRINT_TYP( getString(42, rs) );
			data.settOdr_INSPC_TYP( getString(43, rs) );
			data.settOdr_CLIENT_REMARK( getString(44, rs) );
			data.settOdr_CLIENT_REMARK_KANJI( getString(45, rs) );
			data.settOdr_CLIENT_BARCODE_INF( getString(46, rs) );
			data.settOdr_TRANSPORT_CD( getString(47, rs) );
			data.settOdr_TRANSPORT_TYP( getString(48, rs) );
			data.settOdr_TAX_APPLY_TYP( getString(49, rs) );
			data.settOdr_TAX_CD( getString(50, rs) );
			data.settOdr_TAX_CALC_TYP( getString(51, rs) );
			data.settOdr_REMARKS( getString(52, rs) );
			data.settOdr_ODR_ACPT_DATE( getString(53, rs) );
			data.settOdr_SHIP_PLAN_REMAIN_QTY( getString(54, rs) );
			data.settOdr_SHIP_PLAN_CMPLT_FLG( getString(55, rs) );
			data.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG( getString(56, rs) );
			data.settOdr_PARTIAL_SHIP_INST_FLG( getString(57, rs) );
			data.settOdr_IF_CTL_NO( getString(58, rs) );
			data.settOdr_ENTRY_TYP( getString(59, rs) );
			data.settOdr_DEL_FLG( getString(60, rs) );
			data.settOdr_SHIP_CNT( getString(61, rs) );
			data.settOdr_UNIT_CD_ORG( getString(62, rs) );
			data.settOdrCtl_CUST_ITEM_CD( getString(63, rs) );
			data.settOdr_COCK_TYP( getString(64, rs) );
			data.settOdr_PUCH_ODR_QTY_TOTAL( getString(65, rs) );
			data.settOdr_BUYER_ORG_CD( getString(66, rs) );
			data.settOdr_BUYER_NAME( getString(67, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ODR_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("tbl_T_ODR", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_T_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTodrODR_NO(), stmt);
				setString(8, data.getcreTodrODR_TYP(), stmt);
				setString(9, data.getcreTodrODR_CTL_NO(), stmt);
				setString(10, data.getcreTodrCUST_ODR_NO(), stmt);
				setString(11, data.getcreTodrCUST_CHRG_ORG_CD(), stmt);
				setString(12, data.getcreTodrCUST_CHRG_PSN_CD(), stmt);
				setString(13, data.getcreTodrODR_ACPT_ORG_CD(), stmt);
				setString(14, data.getcreTodrODR_ACPT_PSN_CD(), stmt);
				setString(15, data.getcreTodrCURRNCY_CD(), stmt);
				setString(16, data.getcreTodrEXCH_TYP(), stmt);
				setString(17, data.getcreTodrDLV_LOC_CD(), stmt);
				setString(18, data.getcreTodrDLV_LOC_NAME(), stmt);
				setString(19, data.getcreTodrDLV_LOC_NAME_KANJI(), stmt);
				setString(20, data.getcreTodrPRD_ODR_PLACE_CD(), stmt);
				setString(21, data.getcreTodrODR_UNIT_PRICE(), stmt);
				setString(22, data.getcreTodrPART_DLV_COUNT(), stmt);
				setString(23, data.getcreTodrDEPO_TYP(), stmt);
				setString(24, data.getcreTodrDESINATED_DLV_DATE(), stmt);
				setString(25, data.getcreTodrODR_QTY(), stmt);
				setString(26, data.getcreTodrREMAIN_UNCONFIRM_ODR_QTY(), stmt);
				setString(27, data.getcreTodrCANCELED_UNCONFIRM_ODR_QTY(), stmt);
				setString(28, data.getcreTodrUNIT_CD(), stmt);
				setString(29, data.getcreTodrUNCONFIRM_ODR_BALANCE(), stmt);
				setString(30, data.getcreTodrODR_AMOUNT(), stmt);
				setString(31, data.getcreTodrODR_AMOUNT_EXCH_RATES(), stmt);
				setString(32, data.getcreTodrTOTAL_SHIP_QTY(), stmt);
				setString(33, data.getcreTodrSHIP_AMOUNT(), stmt);
				setString(34, data.getcreTodrSHIP_AMOUNT_EXCH_RATES(), stmt);
				setString(35, data.getcreTodrODR_CMPLT_FLG(), stmt);
				setString(36, data.getcreTodrODR_CMPLT_DATE(), stmt);
				setString(37, data.getcreTodrREMARKS(), stmt);
				setString(38, data.getcreTodrODR_ACPT_DATE(), stmt);
				setString(39, data.getcreTodrSHIP_PLAN_REMAIN_QTY(), stmt);
				setString(40, data.getcreTodrSHIP_PLAN_CMPLT_FLG(), stmt);
				setString(41, data.getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG(), stmt);
				setString(42, data.getcreTodrPARTIAL_SHIP_INST_FLG(), stmt);
				setString(43, data.getcreTodrENTRY_TYP(), stmt);
				setString(44, data.getcreTodrDEL_FLG(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTodr_TOTAL_SHIP_QTY(), stmt);
				setString(5, data.getupTodr_SHIP_AMOUNT(), stmt);
				setString(6, data.getupTodr_SHIP_AMOUNT_EXCH_RATES(), stmt);
				setString(7, data.getupTodr_ODR_CMPLT_FLG(), stmt);
				setString(8, data.getupTodr_ODR_CMPLT_DATE(), stmt);
				setString(9, data.getupTodr_IN_ODRNO(), stmt);

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
			//{{user_implement_dev:tbl_T_ODR_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_ODR_clear

			return;
		}

		/**
		 * tbl_T_ODR�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_ODR()
		{
			//{{user_implement_dev:tbl_T_ODR_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_RCV_ISSUE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_RCV_ISSUE(\"RCV_ISSUE_CTRL_CD\", \"RCV_ISSUE_TYP\", \"ITEM_CD\", \"JOB_ODR_CD\", \"PLANT_CD\", \"WH_CD\", \"RCV_ISSUE_BEFORE_QTY\", \"RCV_ISSUE_QTY\", \"RCV_ISSUE_AFTER_QTY\", \"RCV_ISSUE_AMOUNT\", \"RCV_ISSUE_DATE\", \"RCV_ISSUE_GNR_TYP\", \"STOCK_UPD_TYP\", \"RCV_ISSUE_CMPLT_FLG\", \"RCV_ISSUE_COMMENT\", \"COMPANY_CD\", \"LOT_NO\", \"SHIP_ODR_NO\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_RCV_ISSUE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_RCV_ISSUE_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTrcvIssue_RCV_ISSUE_CTRL_CD(), stmt);
				setString(8, data.getcreTrcvIssue_RCV_ISSUE_TYP(), stmt);
				setString(9, data.getcreTrcvIssue_ITEM_CD(), stmt);
				setString(10, data.getcreTrcvIssue_JOB_ODR_CD(), stmt);
				setString(11, data.getcreTrcvIssue_PLANT_CD(), stmt);
				setString(12, data.getcreTrcvIssue_WH_CD(), stmt);
				setString(13, data.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(), stmt);
				setString(14, data.getcreTrcvIssue_RCV_ISSUE_QTY(), stmt);
				setString(15, data.getcreTrcvIssue_RCV_ISSUE_AFTER_QTY(), stmt);
				setString(16, data.getcreTrcvIssue_RCV_ISSUE_AMOUNT(), stmt);
				setString(17, data.getcreTrcvIssue_RCV_ISSUE_DATE(), stmt);
				setString(18, data.getcreTrcvIssue_RCV_ISSUE_GNR_TYP(), stmt);
				setString(19, data.getcreTrcvIssue_STOCK_UPD_TYP(), stmt);
				setString(20, data.getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG(), stmt);
				setString(21, data.getcreTrcvIssue_RCV_ISSUE_COMMENT(), stmt);
				setString(22, data.getstrCOMPANY_CD(), stmt);
				setString(23, data.getcreTrcvIssue_LOT_NO(), stmt);
				setString(24, data.getcreTrcvIssue_SHIP_ODR_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_RCV_ISSUE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_RCV_ISSUE_clear

			return;
		}

		/**
		 * tbl_T_RCV_ISSUE�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_RCV_ISSUE()
		{
			//{{user_implement_dev:tbl_T_RCV_ISSUE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_RCV_ISSUE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_ITEM_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_ITEM_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_ITEM_STOCK.\"WH_CD\" as \"WH_CD\", "
+"  T_ITEM_STOCK.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\", "
+"  T_ITEM_STOCK.\"DEFECT_QTY\" as \"DEFECT_QTY\", "
+"  T_ITEM_STOCK.\"PRVS_DAYEND_STOCK_QTY\" as \"PRVS_DAYEND_STOCK_QTY\", "
+"  T_ITEM_STOCK.\"PRVS_MONTHEND_STOCK_QTY\" as \"PRVS_MONTHEND_STOCK_QTY\", "
+"  T_ITEM_STOCK.\"PRVS_TERMEND_STOCK_QTY\" as \"PRVS_TERMEND_STOCK_QTY\" "
+"from "
+"  T_ITEM_STOCK "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_ITEM_STOCK(\"WH_CD\", \"ITEM_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, ?, ?, ?)";
		protected String m_updcmd = "update "
+"  T_ITEM_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = ? "
+"where "
+"  T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_ITEM_STOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_ITEM_STOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ITEM_STOCK_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_ITEM_STOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ITEM_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_ITEM_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ITEM_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_ITEM_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTitemStock_IN_ITEMCD());
				if(isNull(data.getserTitemStock_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getserTitemStock_IN_WHCD());
				if(isNull(data.getserTitemStock_IN_WHCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTitemStock_IN_ITEMCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserTitemStock_IN_WHCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserTitemStock_ITEM_CD( getString(1, rs) );
			data.setserTitemStock_WH_CD( getString(2, rs) );
			data.setserTitemStock_PLANT_CD( getString(3, rs) );
			data.setserTitemStock_STOCK_ON_HAND_QTY( getString(4, rs) );
			data.setserTitemStock_DEFECT_QTY( getString(5, rs) );
			data.setserTitemStock_PRVS_DAYEND_STOCK_QTY( getString(6, rs) );
			data.setserTitemStock_PRVS_MONTHEND_STOCK_QTY( getString(7, rs) );
			data.setserTitemStock_PRVS_TERMEND_STOCK_QTY( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_ITEM_STOCK", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_ITEM_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTitemStock_WH_CD(), stmt);
				setString(8, data.getcreTitemStock_ITEM_CD(), stmt);
				setString(9, data.getcreTitemStock_PLANT_CD(), stmt);
				setString(10, data.getcreTitemStock_STOCK_ON_HAND_QTY(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTitemStock_STOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getupTitemStock_IN_ITEMCD(), stmt);
				setString(6, data.getupTitemStock_IN_WHCD(), stmt);

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
			//{{user_implement_dev:tbl_T_ITEM_STOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_clear

			return;
		}

		/**
		 * tbl_T_ITEM_STOCK�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_ITEM_STOCK()
		{
			//{{user_implement_dev:tbl_T_ITEM_STOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_ITEM_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_M_CUST extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUST.\"COMPANY_CD\", "
+"  M_CUST.\"CUST_CD\", "
+"  M_CUST.\"CUST_NAME\", "
+"  M_CUST.\"DETAIL_ROUND_TYP\", "
+"  M_CUST.\"INSPC_ACPT_TYP\", "
+"  M_CUST.\"OWN_ORG_CD\", "
+"  M_CUST.\"EXCH_TYP\", "
+"  M_CUST.\"CUR_CD\" "
+"from "
+"  M_CUST "
+"where "
+"  M_CUST.\"COMPANY_CD\" = ? "
+"  and M_CUST.\"CUST_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_CUST_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_CUST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read
                        if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_M_CUST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_CUST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_CUST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmCust_IN_COMPANYCD());
				if(isNull(data.getmCust_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmCust_IN_CUSTCD());
				if(isNull(data.getmCust_IN_CUSTCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmCust_IN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmCust_IN_CUSTCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmCust_COMPANY_CD( getString(1, rs) );
			data.setmCust_CUST_CD( getString(2, rs) );
			data.setmCust_CUST_NAME( getString(3, rs) );
			data.setmCust_DETAIL_ROUND_TYP( getString(4, rs) );
			data.setmCust_INSPC_ACPT_TYP( getString(5, rs) );
			data.setmCust_OWN_ORG_CD( getString(6, rs) );
			data.setmCust_EXCH_TYP( getString(7, rs) );
			data.setmCust_CUR_CD( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("tbl_M_CUST", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tbl_M_CUST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_CUST_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_CUST_clear

			return;
		}

		/**
		 * tbl_M_CUST�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_CUST()
		{
			//{{user_implement_dev:tbl_M_CUST_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_CUST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSYS_PARAMETER extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_HOME_CUR.\"HOME_CUR_CD\" as \"HOME_CUR_CD\", "
+"  M_CUR.\"DECIMAL_FIG\" as \"DECIMAL_FIG\" "
+"from "
+"  SYS_HOME_CUR, "
+"  M_CUR "
+"where "
+"  M_CUR.CUR_CD = SYS_HOME_CUR.HOME_CUR_CD "
+"  and SYS_HOME_CUR.\"CTRL_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYS_PARAMETER_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSYS_PARAMETER_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_PARAMETER_read
			if(m_selcmd==null) throw new FoundationException("getSYS_PARAMETER", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_PARAMETER_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_PARAMETER_read2
			if(m_selcmd==null) throw new FoundationException("getSYS_PARAMETER", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_PARAMETER_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_PARAMETER_read3
			if(m_selcmd==null) throw new FoundationException("getSYS_PARAMETER", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYS_PARAMETER_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getgetHomeCur_CTRL_CD());
				if(isNull(data.getgetHomeCur_CTRL_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getgetHomeCur_CTRL_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setgetHomeCur_CUR_CD( getString(1, rs) );
			data.setgetHomeCur_DECIMAL_FIG( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYS_PARAMETER", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYS_PARAMETER_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYS_PARAMETER_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYS_PARAMETER_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSYS_PARAMETER_clear

			return;
		}

		/**
		 * getSYS_PARAMETER�N���X�̕W���R���X�g���N�^
		 */
		public getSYS_PARAMETER()
		{
			//{{user_implement_dev:getSYS_PARAMETER_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSYS_PARAMETER_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getRecallWhCd extends DataObject
	{
		protected String m_selcmd = "select "
+"  \"SYS_CLASS_CODE\".\"CODE\" as \"CODE\" "
+"from "
+"  SYS_CLASS_CODE, "
+"  M_WH "
+"where "
+"  \"SYS_CLASS_CODE\".\"CODE\" = \"M_WH\".\"WH_CD\" "
+"  and \"M_WH\".\"WH_TYP\" = 30 "
+"  and \"SYS_CLASS_CODE\".\"CLASS_CODE\" = 'RETURN_WH_CD' "
+"  and \"SYS_CLASS_CODE\".\"SYS_CLASS\" = 'SALES'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getRecallWhCd_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getRecallWhCd_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getRecallWhCd_read
			if(m_selcmd==null) throw new FoundationException("getRecallWhCd", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getRecallWhCd_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getRecallWhCd_read2
			if(m_selcmd==null) throw new FoundationException("getRecallWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getRecallWhCd_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getRecallWhCd_read3
			if(m_selcmd==null) throw new FoundationException("getRecallWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getRecallWhCd_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrCode( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getRecallWhCd", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getRecallWhCd_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getRecallWhCd_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getRecallWhCd_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getRecallWhCd_clear

			return;
		}

		/**
		 * getRecallWhCd�N���X�̕W���R���X�g���N�^
		 */
		public getRecallWhCd()
		{
			//{{user_implement_dev:getRecallWhCd_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getRecallWhCd_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tblM_UNIT_COST extends DataObject
	{
		protected String m_selcmd = "select "
+"  TO_CHAR(M_UNIT_COST.\"UNIT_COST\") as \"UNIT_COST\", "
+"  TO_CHAR(M_UNIT_COST.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\" "
+"from "
+"  M_UNIT_COST "
+"where "
+"  M_UNIT_COST.\"COMPANY_CD\" = ? "
+"  and M_UNIT_COST.\"CUST_CD\" = ? "
+"  and M_UNIT_COST.\"ITEM_CD\" = ? "
+"  and M_UNIT_COST.\"EFF_PHASE_IN_DATE\" <= TO_DATE(?, 'YYYY/MM/DD') "
+"ORDER BY "
+"  EFF_PHASE_IN_DATE DESC";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tblM_UNIT_COST_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tblM_UNIT_COST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read
                        if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tblM_UNIT_COST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read2
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tblM_UNIT_COST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_read3
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tblM_UNIT_COST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmUnitCost_IN_COMPANYCD());
				if(isNull(data.getmUnitCost_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_CUSTCD());
				if(isNull(data.getmUnitCost_IN_CUSTCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_ITEMCD());
				if(isNull(data.getmUnitCost_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getmUnitCost_IN_EFFPHASEINDATE());
				if(isNull(data.getmUnitCost_IN_EFFPHASEINDATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmUnitCost_IN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmUnitCost_IN_CUSTCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmUnitCost_IN_ITEMCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmUnitCost_IN_EFFPHASEINDATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmUnitCost_UNIT_COST( getString(1, rs) );
			data.setmUnitCost_EFF_PHASE_IN_DATE( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tblM_UNIT_COST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tblM_UNIT_COST_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("tblM_UNIT_COST", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:tblM_UNIT_COST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tblM_UNIT_COST_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tblM_UNIT_COST_clear

			return;
		}

		/**
		 * tblM_UNIT_COST�N���X�̕W���R���X�g���N�^
		 */
		public tblM_UNIT_COST()
		{
			//{{user_implement_dev:tblM_UNIT_COST_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tblM_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_SHIP_ODR.\"TOTAL_SHIP_QTY\" as \"TOTAL_SHIP_QTY\", "
+"  T_SHIP_ODR.\"RETURN_QTY\" as \"RETURN_QTY\" "
+"from "
+"  T_SHIP_ODR "
+"where "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_SHIP_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_SHIP_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_SHIP_ODR_read
			if(m_selcmd==null) throw new FoundationException("readT_SHIP_ODR", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_SHIP_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_SHIP_ODR_read2
			if(m_selcmd==null) throw new FoundationException("readT_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_SHIP_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_SHIP_ODR_read3
			if(m_selcmd==null) throw new FoundationException("readT_SHIP_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_SHIP_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getreadShipOdr_SHIP_ODR_NO());
				if(isNull(data.getreadShipOdr_SHIP_ODR_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getreadShipOdr_SHIP_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setreadShipOdr_TOTAL_SHIP_QTY( getString(1, rs) );
			data.setreadShipOdr_RETURN_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_SHIP_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_SHIP_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_SHIP_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_SHIP_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_SHIP_ODR_clear

			return;
		}

		/**
		 * readT_SHIP_ODR�N���X�̕W���R���X�g���N�^
		 */
		public readT_SHIP_ODR()
		{
			//{{user_implement_dev:readT_SHIP_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getCUR_UNIT extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_CUR.\"CUR_UNIT\", "
+"  M_CUR.\"DECIMAL_FIG\" "
+"from "
+"  M_CUR "
+"where "
+"  M_CUR.\"CUR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getCUR_UNIT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getCUR_UNIT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_UNIT_read
			if(m_selcmd==null) throw new FoundationException("getCUR_UNIT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCUR_UNIT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_UNIT_read2
			if(m_selcmd==null) throw new FoundationException("getCUR_UNIT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getCUR_UNIT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_UNIT_read3
			if(m_selcmd==null) throw new FoundationException("getCUR_UNIT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getCUR_UNIT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gett_CUR_CD());
				if(isNull(data.gett_CUR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.gett_CUR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setg_CUR_UNIT( getString(1, rs) );
			data.setDECIMAL_FIG( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getCUR_UNIT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getCUR_UNIT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getCUR_UNIT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getCUR_UNIT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getCUR_UNIT_clear

			return;
		}

		/**
		 * getCUR_UNIT�N���X�̕W���R���X�g���N�^
		 */
		public getCUR_UNIT()
		{
			//{{user_implement_dev:getCUR_UNIT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getCUR_UNIT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class chkSysInstallOptions extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "select * from SYS_INSTALL_OPTIONS  "
+"where OPTION_ID like 'B%'";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkSysInstallOptions_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:chkSysInstallOptions_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkSysInstallOptions_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkSysInstallOptions_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:chkSysInstallOptions_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:chkSysInstallOptions_clear

			return;
		}

		/**
		 * chkSysInstallOptions�N���X�̕W���R���X�g���N�^
		 */
		public chkSysInstallOptions()
		{
			//{{user_implement_dev:chkSysInstallOptions_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:chkSysInstallOptions_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readSysArCtrl extends DataObject
	{
		protected String m_selcmd = "select SLIP_CTRL_GRP as SLIP_CTRL_GRP "
+"from SYS_AR_CTRL "
+"where COMPANY_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readSysArCtrl_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readSysArCtrl_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readSysArCtrl_read
			if(m_selcmd==null) throw new FoundationException("readSysArCtrl", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readSysArCtrl_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readSysArCtrl_read2
			if(m_selcmd==null) throw new FoundationException("readSysArCtrl", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readSysArCtrl_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readSysArCtrl_read3
			if(m_selcmd==null) throw new FoundationException("readSysArCtrl", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readSysArCtrl_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrSLIP_CTRL_GRP( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readSysArCtrl", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readSysArCtrl_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readSysArCtrl_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readSysArCtrl_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readSysArCtrl_clear

			return;
		}

		/**
		 * readSysArCtrl�N���X�̕W���R���X�g���N�^
		 */
		public readSysArCtrl()
		{
			//{{user_implement_dev:readSysArCtrl_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readSysArCtrl_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = "select "
+"  STATUS as \"STATUS\" "
+"from "
+"  T_AR_LEDGER_H "
+"where "
+"  COMPANY_CD = ? "
+"  and SLIP_TYP = 14 "
+"  and SLIP_CTRL_GRP = ? "
+"  and SLIP_CD = ? "
+"  and SALES_MODIFICATION_FLG = 0 "
+"  and INSPC_ACPT_CRCT_TYP = 2";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_AR_LEDGER_H_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_AR_LEDGER_H_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_read
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_AR_LEDGER_H_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_read2
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_AR_LEDGER_H_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_read3
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_AR_LEDGER_H_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getstrSLIP_CTRL_GRP());
				if(isNull(data.getstrSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getstrSLIP_CD());
				if(isNull(data.getstrSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrSLIP_CTRL_GRP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_AR_LEDGER_H_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_AR_LEDGER_H_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_AR_LEDGER_H_clear

			return;
		}

		/**
		 * readT_AR_LEDGER_H�N���X�̕W���R���X�g���N�^
		 */
		public readT_AR_LEDGER_H()
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_AR_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "select "
+"  STATUS as STATUS "
+"from "
+"  T_AR_LEDGER_H_TRN "
+"where "
+"  COMPANY_CD = ? "
+"  and SLIP_TYP = 14 "
+"  and SLIP_CTRL_GRP = ? "
+"  and SLIP_CD = ? "
+"  and SALES_MODIFICATION_FLG = 0 "
+"  and INSPC_ACPT_CRCT_TYP = 2";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_AR_LEDGER_H_TRN_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_AR_LEDGER_H_TRN_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_read
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_read2
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_read3
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getstrSLIP_CTRL_GRP());
				if(isNull(data.getstrSLIP_CTRL_GRP())) isNull = true;
				ary.addElement(data.getstrSLIP_CD());
				if(isNull(data.getstrSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrSLIP_CTRL_GRP(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrSTATUS( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_AR_LEDGER_H_TRN", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * readT_AR_LEDGER_H_TRN�N���X�̕W���R���X�g���N�^
		 */
		public readT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:readT_AR_LEDGER_H_TRN_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_ODR1 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_SHIP_ODR "
+"set "
+"  \"SHP_CMPLT_FLG\" = ?, "
+"  \"TOTAL_SHIP_QTY\" = ? "
+"where "
+"  T_SHIP_ODR.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_ODR1_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_ODR1_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTshipOdr_SHP_CMPLT_FLG(), stmt);
				setString(5, data.getupTshipOdr_TOTAL_SHIP_QTY(), stmt);
				setString(6, data.getupTshipOdr_IN_SLIPCD(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_ODR1_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR1_clear

			return;
		}

		/**
		 * tbl_T_SHIP_ODR1�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_ODR1()
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR1_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_ODR2 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_SHIP_ODR "
+"set "
+"  \"SLIP_CD\" = ?, "
+"  \"ORG_SLIP_CD\" = ?, "
+"  \"SHP_CMPLT_FLG\" = ?, "
+"  \"TOTAL_SHIP_QTY\" = ? "
+"where "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_ODR2_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_ODR2_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTshipOdr_SLIP_CD(), stmt);
				setString(5, data.getupTshipOdr_ORG_SLIP_CD(), stmt);
				setString(6, data.getupTshipOdr_SHP_CMPLT_FLG(), stmt);
				setString(7, data.getupTshipOdr_TOTAL_SHIP_QTY(), stmt);
				setString(8, data.getupTshipOdr_SHIP_ODR_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_ODR2_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR2_clear

			return;
		}

		/**
		 * tbl_T_SHIP_ODR2�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_ODR2()
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR2_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR2_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_OD extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_OD.OD_NO as OD_NO, "
+"  T_OD.TOTAL_ISSUE_QTY as TOTAL_ISSUE_QTY, "
+"  T_OD.DM_QTY as DM_QTY, "
+"  T_OD.DM_STS_TYP as DM_STS_TYP "
+"from "
+"  T_OD, "
+"  T_ANS_DLV_DATE "
+"where "
+"    T_ANS_DLV_DATE.ODR_NO = ? "
+"and T_ANS_DLV_DATE.PART_DLV_SEQ_NO = ? "
+"and T_OD.OD_NO = T_ANS_DLV_DATE.OD_NO";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update T_OD set "
+"  TOTAL_ISSUE_QTY = ?, "
+"  DM_STS_TYP = ? "
+"where "
+"  OD_NO = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_OD_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_OD_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_OD_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_OD", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_OD_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_OD_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_OD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_OD_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_OD_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_OD", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_OD_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getinTod_ODR_NO());
				if(isNull(data.getinTod_ODR_NO())) isNull = true;
				ary.addElement(data.getinTod_PART_DLV_SEQ_NO());
				if(isNull(data.getinTod_PART_DLV_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getinTod_ODR_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getinTod_PART_DLV_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrTod_OD_NO( getString(1, rs) );
			data.setstrTod_TOTAL_ISSUE_QTY( getString(2, rs) );
			data.setstrTod_DM_QTY( getString(3, rs) );
			data.setstrTod_DM_STS_TYP( getString(4, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_OD", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_OD_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_OD_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getstrTod_TOTAL_ISSUE_QTY(), stmt);
				setString(5, data.getstrTod_DM_STS_TYP(), stmt);
				setString(6, data.getinTod_OD_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_OD_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_OD_clear

			return;
		}

		/**
		 * tbl_T_OD�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_OD()
		{
			//{{user_implement_dev:tbl_T_OD_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_OD_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getTax extends DataObject
	{
		protected String m_selcmd = "select "
+"  substr(M_TAX.\"TAX_CD\", 3, 1) as \"TAX_KBN\", "
+"  M_TAX.\"OLD_TAX_RATE_1\" as \"OLD_TAX_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\" as \"OLD_TAX_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\" as \"OLD_TAX_3\", "
+"  M_TAX.\"NEW_TAX_RATE_1\" as \"NEW_TAX_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\" as \"NEW_TAX_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\" as \"NEW_TAX_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\", 'YYYY/MM/DD') as \"START_DATE\", "
+"  M_TAX.\"ROUND_TYP\" as \"ROUND_TYP\" "
+"from "
+"  M_TAX "
+"where "
+"  M_TAX.TAX_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getTax_def
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getTax_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read
                        if(m_selcmd==null) throw new FoundationException("getTax", "read", "�N�G���[���o�^");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getTax_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read2
			if(m_selcmd==null) throw new FoundationException("getTax", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getTax_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_read3
			if(m_selcmd==null) throw new FoundationException("getTax", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getTax_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getupdiffTAX_CD());
				if(isNull(data.getupdiffTAX_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getupdiffTAX_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrTaxTAX_KBN( getString(1, rs) );
			data.setstrTaxOLD_TAX_1( getString(2, rs) );
			data.setstrTaxOLD_TAX_2( getString(3, rs) );
			data.setstrTaxOLD_TAX_3( getString(4, rs) );
			data.setstrTaxNEW_TAX_1( getString(5, rs) );
			data.setstrTaxNEW_TAX_2( getString(6, rs) );
			data.setstrTaxNEW_TAX_3( getString(7, rs) );
			data.setstrTaxSTART_DATE( getString(8, rs) );
			data.setstrTaxROUND_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getTax", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("getTax", "check", "�N�G���[���o�^");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:getTax_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getTax_clear
                         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getTax_clear

			return;
		}

		/**
		 * getTax�N���X�̕W���R���X�g���N�^
		 */
		public getTax()
		{
			//{{user_implement_dev:getTax_constractor
                         // TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getTax_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_ODR3 extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_SHIP_ODR "
+"set "
+"  \"SLIP_CD\" = ?, "
+"  \"ORG_SLIP_CD\" = ?, "
+"  \"RETURN_QTY\" = ? "
+"where "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_ODR3_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_ODR3_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTshipOdr_SLIP_CD(), stmt);
				setString(5, data.getupTshipOdr_ORG_SLIP_CD(), stmt);
				setString(6, data.getupTshipOdr_RETURN_QTY(), stmt);
				setString(7, data.getupTshipOdr_SHIP_ODR_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_ODR3_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR3_clear

			return;
		}

		/**
		 * tbl_T_SHIP_ODR3�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_ODR3()
		{
			//{{user_implement_dev:tbl_T_SHIP_ODR3_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_ODR3_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class chkT_AR_LEDGER_H extends DataObject
	{
		protected String m_selcmd = "select * from T_AR_LEDGER_H "
+"where SLIP_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkT_AR_LEDGER_H_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:chkT_AR_LEDGER_H_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_read
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_AR_LEDGER_H_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_read2
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkT_AR_LEDGER_H_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_read3
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkT_AR_LEDGER_H_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkSLIP_CD());
				if(isNull(data.getchkSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getchkSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();


			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_AR_LEDGER_H_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkT_AR_LEDGER_H_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:chkT_AR_LEDGER_H_clear

			return;
		}

		/**
		 * chkT_AR_LEDGER_H�N���X�̕W���R���X�g���N�^
		 */
		public chkT_AR_LEDGER_H()
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:chkT_AR_LEDGER_H_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class chkT_AR_LEDGER_H_TRN extends DataObject
	{
		protected String m_selcmd = "select * from T_AR_LEDGER_H_TRN "
+"where SLIP_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_read
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_read2
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_read3
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H_TRN", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkSLIP_CD());
				if(isNull(data.getchkSLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getchkSLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();


			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("chkT_AR_LEDGER_H_TRN", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_clear

			return;
		}

		/**
		 * chkT_AR_LEDGER_H_TRN�N���X�̕W���R���X�g���N�^
		 */
		public chkT_AR_LEDGER_H_TRN()
		{
			//{{user_implement_dev:chkT_AR_LEDGER_H_TRN_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:chkT_AR_LEDGER_H_TRN_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getPlantFromWhCd extends DataObject
	{
		protected String m_selcmd = "select "
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

		//{{user_implement_dev:getPlantFromWhCd_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getPlantFromWhCd_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getPlantFromWhCd_read
			if(m_selcmd==null) throw new FoundationException("getPlantFromWhCd", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getPlantFromWhCd_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getPlantFromWhCd_read2
			if(m_selcmd==null) throw new FoundationException("getPlantFromWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getPlantFromWhCd_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getPlantFromWhCd_read3
			if(m_selcmd==null) throw new FoundationException("getPlantFromWhCd", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getPlantFromWhCd_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getcreTitemStock_WH_CD());
				if(isNull(data.getcreTitemStock_WH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getcreTitemStock_WH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setcreTitemStock_PLANT_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getPlantFromWhCd", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getPlantFromWhCd_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getPlantFromWhCd_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getPlantFromWhCd_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getPlantFromWhCd_clear

			return;
		}

		/**
		 * getPlantFromWhCd�N���X�̕W���R���X�g���N�^
		 */
		public getPlantFromWhCd()
		{
			//{{user_implement_dev:getPlantFromWhCd_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getPlantFromWhCd_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_M_WH extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_WH.\"WH_NAME\" AS \"WH_NAME\", "
+"  M_WH.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_WH "
+"WHERE "
+"  M_WH.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_WH_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_WH_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_WH_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_WH", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_WH_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_WH_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_WH_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_WH_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_WH", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_WH_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmWh_IN_WH_CD());
				if(isNull(data.getmWh_IN_WH_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmWh_IN_WH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmWh_WH_NAME( getString(1, rs) );
			data.setmWh_PLANT_CD( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_WH", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_WH_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_WH_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_WH_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_WH_clear

			return;
		}

		/**
		 * tbl_M_WH�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_WH()
		{
			//{{user_implement_dev:tbl_M_WH_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_WH_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_M_ORG extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ORG.\"ORG_NAME\" "
+"from "
+"  M_ORG "
+"where "
+"  M_ORG.\"COMPANY_CD\" = ? "
+"  and M_ORG.\"ORG_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_ORG_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_ORG_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ORG_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_ORG", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_ORG_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ORG_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_ORG", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ORG_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ORG_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_ORG", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_ORG_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmOrg_IN_COMPANYCD());
				if(isNull(data.getmOrg_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmOrg_IN_ORGCD());
				if(isNull(data.getmOrg_IN_ORGCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmOrg_IN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmOrg_IN_ORGCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmOrg_ORG_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_ORG", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_ORG_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_ORG_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_ORG_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ORG_clear

			return;
		}

		/**
		 * tbl_M_ORG�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_ORG()
		{
			//{{user_implement_dev:tbl_M_ORG_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_ORG_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_JOB_ODR_CD_STOCK extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_JOB_ODR_CD_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" as \"JOB_ODR_CD\", "
+"  T_JOB_ODR_CD_STOCK.\"WH_CD\" as \"WH_CD\", "
+"  T_JOB_ODR_CD_STOCK.\"PLANT_CD\" as \"PLANT_CD\", "
+"  T_JOB_ODR_CD_STOCK.\"STOCK_ON_HAND_QTY\" as \"STOCK_ON_HAND_QTY\", "
+"  T_JOB_ODR_CD_STOCK.\"PRVS_DAYEND_STOCK_QTY\" as \"PRVS_DAYEND_STOCK_QTY\", "
+"  T_JOB_ODR_CD_STOCK.\"PRVS_MONTHEND_STOCK_QTY\" as \"PRVS_MONTHEND_STOCK_QTY\", "
+"  T_JOB_ODR_CD_STOCK.\"PRVS_TERMEND_STOCK_QTY\" as \"PRVS_TERMEND_STOCK_QTY\" "
+"from "
+"  T_JOB_ODR_CD_STOCK "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_JOB_ODR_CD_STOCK(\"WH_CD\", \"ITEM_CD\", \"JOB_ODR_CD\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\") "
+"values "
+"  (?, ?, ?, ?, ?)";
		protected String m_updcmd = "update "
+"  T_JOB_ODR_CD_STOCK "
+"set "
+"  \"STOCK_ON_HAND_QTY\" = ? "
+"where "
+"  T_JOB_ODR_CD_STOCK.\"ITEM_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"JOB_ODR_CD\" = ? "
+"  and T_JOB_ODR_CD_STOCK.\"WH_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR_CD_STOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR_CD_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR_CD_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTitemStock_IN_ITEMCD());
				if(isNull(data.getserTitemStock_IN_ITEMCD())) isNull = true;
				ary.addElement(data.getserTitemStock_IN_JOBODRCD());
				if(isNull(data.getserTitemStock_IN_JOBODRCD())) isNull = true;
				ary.addElement(data.getserTitemStock_IN_WHCD());
				if(isNull(data.getserTitemStock_IN_WHCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTitemStock_IN_ITEMCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserTitemStock_IN_JOBODRCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserTitemStock_IN_WHCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserTitemStock_ITEM_CD( getString(1, rs) );
			data.setserTitemStock_JOB_ODR_CD( getString(2, rs) );
			data.setserTitemStock_WH_CD( getString(3, rs) );
			data.setserTitemStock_PLANT_CD( getString(4, rs) );
			data.setserTitemStock_STOCK_ON_HAND_QTY( getString(5, rs) );
			data.setserTitemStock_PRVS_DAYEND_STOCK_QTY( getString(6, rs) );
			data.setserTitemStock_PRVS_MONTHEND_STOCK_QTY( getString(7, rs) );
			data.setserTitemStock_PRVS_TERMEND_STOCK_QTY( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR_CD_STOCK", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getcreTitemStock_WH_CD(), stmt);
				setString(8, data.getcreTitemStock_ITEM_CD(), stmt);
				setString(9, data.getcreTitemStock_JOB_ODR_CD(), stmt);
				setString(10, data.getcreTitemStock_PLANT_CD(), stmt);
				setString(11, data.getcreTitemStock_STOCK_ON_HAND_QTY(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTitemStock_STOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getupTitemStock_IN_ITEMCD(), stmt);
				setString(6, data.getupTitemStock_IN_JOBODRCD(), stmt);
				setString(7, data.getupTitemStock_IN_WHCD(), stmt);

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
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_clear

			return;
		}

		/**
		 * tbl_T_JOB_ODR_CD_STOCK�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_JOB_ODR_CD_STOCK()
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_JOB_ODR_CD_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_JOB_ODR extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\" "
+"FROM "
+"  T_JOB_ODR "
+"WHERE "
+"  T_JOB_ODR.\"ITEM_CD\" = ? "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_T_JOB_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_JOB_ODR_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_JOB_ODR_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTJobOdr_ITEM_CD());
				if(isNull(data.getserTJobOdr_ITEM_CD())) isNull = true;
				ary.addElement(data.getserTJobOdr_JOB_ODR_CD());
				if(isNull(data.getserTJobOdr_JOB_ODR_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTJobOdr_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserTJobOdr_JOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserTJobOdr_JOB_ODR_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_JOB_ODR", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_JOB_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_T_JOB_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_JOB_ODR_clear

			return;
		}

		/**
		 * tbl_T_JOB_ODR�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_JOB_ODR()
		{
			//{{user_implement_dev:tbl_T_JOB_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class diffT_SHIP_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SHIP_ODR(\"SHIP_ODR_NO\", \"ODR_NO\", \"PART_DLV_SEQ_NO\", \"SLIP_CD\", \"ITEM_CD\", \"JOB_ODR_CD\", \"CUST_ITEM_CD\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"CUST_CHRG_PSN_CD\", \"SHIP_ODR_ISS_PSN_CD\", \"DLV_LOC_CD\", \"DEPO_TYP\", \"DESINATED_SHIP_DATE\", \"SCDL_DLV_DATE\", \"SHIP_QTY\", \"TOTAL_SHIP_QTY\", \"RETURN_QTY\", \"UNIT_CD\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"SHIP_ODR_AMOUNT_EXCH_RATES\", \"CURRNCY_CD\", \"LOC_CD\", \"PKG_UNIT_QTY\", \"REMARKS\", \"DLV_KEY_NO\", \"PART_DLV_COUNT\", \"TRANSPORT_CD\", \"TRANSPORT_TYP\", \"ALLCT_WH_CD\", \"TRANSFER_WH_CD\", \"DIRECT_DLV_FLG\", \"ENTRY_TYP\", \"PRINT_FLG\", \"SHP_CMPLT_FLG\", \"DEPO_TRANSFER_PROC_FLG\", \"DEL_FLG\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY/MM/DD'), TO_DATE(?, 'YYYY/MM/DD'), ?, ?, ?, ?, ?, ROUND(?, 4), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SHIP_ODR "
+"SET "
+"  \"SHIP_QTY\" = ?, "
+"  \"SHIP_ODR_AMOUNT\" = ?, "
+"  \"SHIP_ODR_AMOUNT_EXCH_RATES\" = ? "
+"WHERE "
+"  T_SHIP_ODR.\"SHIP_ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:diffT_SHIP_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:diffT_SHIP_ODR_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getdiffSHIP_ODR_NO(), stmt);
				setString(2, data.getdiffODR_NO(), stmt);
				setString(3, data.getdiffPART_DLV_SEQ_NO(), stmt);
				setString(4, data.getdiffSLIP_CD(), stmt);
				setString(5, data.getdiffITEM_CD(), stmt);
				setString(6, data.getdiffJOB_ODR_CD(), stmt);
				setString(7, data.getdiffCUST_ITEM_CD(), stmt);
				setString(8, data.getdiffCUST_ODR_NO(), stmt);
				setString(9, data.getdiffCUST_CD(), stmt);
				setString(10, data.getdiffCUST_NAME(), stmt);
				setString(11, data.getdiffCUST_CHRG_PSN_CD(), stmt);
				setString(12, data.getdiffSHIP_ODR_ISS_PSN_CD(), stmt);
				setString(13, data.getdiffDLV_LOC_CD(), stmt);
				setString(14, data.getdiffDEPO_TYP(), stmt);
				setString(15, data.getdiffDESINATED_SHIP_DATE(), stmt);
				setString(16, data.getdiffSCDL_DLV_DATE(), stmt);
				setString(17, data.getdiffSHIP_QTY(), stmt);
				setString(18, data.getdiffTOTAL_SHIP_QTY(), stmt);
				setString(19, data.getdiffRETURN_QTY(), stmt);
				setString(20, data.getdiffUNIT_CD(), stmt);
				setString(21, data.getdiffUNIT_PRICE(), stmt);
				setString(22, data.getdiffSHIP_ODR_AMOUNT(), stmt);
				setString(23, data.getdiffSHIP_ODR_AMOUNT_EXCH_RATE(), stmt);
				setString(24, data.getdiffCURRENCY_CD(), stmt);
				setString(25, data.getdiffLOC_CD(), stmt);
				setString(26, data.getdiffPKG_UNIT_QTY(), stmt);
				setString(27, data.getdiffREMARKS(), stmt);
				setString(28, data.getdiffDLV_KEY_NO(), stmt);
				setString(29, data.getdiffPART_DLV_COUNT(), stmt);
				setString(30, data.getdiffTRANSPORT_CD(), stmt);
				setString(31, data.getdiffTRANSPORT_TYP(), stmt);
				setString(32, data.getdiffALLCT_WH_CD(), stmt);
				setString(33, data.getdiffTRANSFER_WH_CD(), stmt);
				setString(34, data.getdiffDIRECT_DLV_FLG(), stmt);
				setString(35, data.getdiffENTRY_TYP(), stmt);
				setString(36, data.getdiffPRINT_FLG(), stmt);
				setString(37, data.getdiffSHIP_CMPLT_FLG(), stmt);
				setString(38, data.getdiffDEPO_TRANSFER_PROC_FLG(), stmt);
				setString(39, data.getdiffDEL_FLG(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getdiffSHIP_QTY(), stmt);
				setString(5, data.getdiffSHIP_ODR_AMOUNT(), stmt);
				setString(6, data.getdiffSHIP_ODR_AMOUNT_EXCH_RATE(), stmt);
				setString(7, data.getdiffSHIP_ODR_NO(), stmt);

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
			//{{user_implement_dev:diffT_SHIP_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:diffT_SHIP_ODR_clear

			return;
		}

		/**
		 * diffT_SHIP_ODR�N���X�̕W���R���X�g���N�^
		 */
		public diffT_SHIP_ODR()
		{
			//{{user_implement_dev:diffT_SHIP_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:diffT_SHIP_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateT_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "update "
+"  T_ODR "
+"set "
+"  \"SHIP_CNT\" = ?, "
+"  \"PART_DLV_COUNT\" = ? "
+"where "
+"  T_ODR.\"ODR_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateT_ODR_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getdiffuptOdr_SHIP_CNT(), stmt);
				setString(2, data.getdiffuptOdr_PART_DLV_COUNT(), stmt);
				setString(3, data.getdiffuptOdr_IN_ODRNO(), stmt);

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
			//{{user_implement_dev:updateT_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateT_ODR_clear

			return;
		}

		/**
		 * updateT_ODR�N���X�̕W���R���X�g���N�^
		 */
		public updateT_ODR()
		{
			//{{user_implement_dev:updateT_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateT_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_SLIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "insert into "
+"  T_SHIP_SLIP(\"SLIP_CD\", \"ITEM_CD\", \"CUST_ITEM_CD\", \"PART_NAME\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"DLV_LOC_CD\", \"DLV_LOC_NAME_KANJI\", \"CUS_DLV_KEY_CD\", \"DESINATED_SHIP_DATE\", \"DESINATED_DLV_DATE\", \"SCDL_DLV_DATE\", \"SHIP_ODR_QTY\", \"UNIT_CD\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"TAX_AMOUNT\", \"INSPC_TYP\", \"CLIENT_REMARK_KANJI\", \"CLIENT_BARCODE_INF\", \"PRINT_FLG\", \"DEL_FLG\", \"BUYER_NAME\", \"PUCH_ODR_QTY_TOTAL\", \"DLV_ODR_QTY\", \"SHIP_ODR_AMOUNT_TAX\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_SHIP_SLIP "
+"SET "
+"  \"SLIP_CD\" = ?, "
+"  \"PRINT_FLG\" = 0 "
+"WHERE "
+"  T_SHIP_SLIP.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_SLIP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_SLIP_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getin_tShipSlip_SLIP_CD(), stmt);
				setString(2, data.getin_tShipSlip_ITEM_CD(), stmt);
				setString(3, data.getin_tShipSlip_CUST_ITEM_CD(), stmt);
				setString(4, data.getin_tShipSlip_PART_NAME(), stmt);
				setString(5, data.getin_tShipSlip_CUST_ODR_NO(), stmt);
				setString(6, data.getin_tShipSlip_CUST_CD(), stmt);
				setString(7, data.getin_tShipSlip_CUST_NAME(), stmt);
				setString(8, data.getin_tShipSlip_DLV_LOC_CD(), stmt);
				setString(9, data.getin_tShipSlip_DLV_LOC_NAME_KANJI(), stmt);
				setString(10, data.getin_tShipSlip_CUS_DLV_KEY_CD(), stmt);
				setString(11, data.getin_tShipSlip_DESINATED_SHIP_DATE(), stmt);
				setString(12, data.getin_tShipSlip_DESINATED_DLV_DATE(), stmt);
				setString(13, data.getin_tShipSlip_SCDL_DLV_DATE(), stmt);
				setString(14, data.getin_tShipSlip_SHIP_ODR_QTY(), stmt);
				setString(15, data.getin_tShipSlip_UNIT_CD(), stmt);
				setString(16, data.getin_tShipSlip_UNIT_PRICE(), stmt);
				setString(17, data.getin_tShipSlip_SHIP_ODR_AMOUNT(), stmt);
				setString(18, data.getin_tShipSlip_TAX_AMOUNT(), stmt);
				setString(19, data.getin_tShipSlip_INSPC_TYP(), stmt);
				setString(20, data.getin_tShipSlip_CLIENT_REMARK_KANJI(), stmt);
				setString(21, data.getin_tShipSlip_CLIENT_BARCODE_INF(), stmt);
				setString(22, data.getin_tShipSlip_PRINT_FLG(), stmt);
				setString(23, data.getin_tShipSlip_DEL_FLG(), stmt);
				setString(24, data.getin_tShipSlip_BUYER_NAME(), stmt);
				setString(25, data.getin_tShipSlip_PUCH_ODR_QTY_TOTAL(), stmt);
				setString(26, data.getin_tShipSlip_DLV_ODR_QTY(), stmt);
				setString(27, data.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX(), stmt);
				setString(28, data.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(29, data.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(30, data.getin_tShipSlip_TAXFREE_SALES_AMOUNT(), stmt);
				setString(31, data.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(32, data.getin_tShipSlip_EXTERNAL_TAX_AMOUNT(), stmt);
				setString(33, data.getin_tShipSlip_INTERNAL_TAX_AMOUNT(), stmt);
				setString(34, data.getin_tShipSlip_TAX_AMOUNT_1(), stmt);
				setString(35, data.getin_tShipSlip_TAX_AMOUNT_2(), stmt);
				setString(36, data.getin_tShipSlip_TAX_AMOUNT_3(), stmt);
				setString(37, data.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getup_tShipSlip_SLIP_CD(), stmt);
				setString(5, data.getin_tShipSlip_SLIP_CD(), stmt);

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
			//{{user_implement_dev:tbl_T_SHIP_SLIP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_SLIP_clear

			return;
		}

		/**
		 * tbl_T_SHIP_SLIP�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_SLIP()
		{
			//{{user_implement_dev:tbl_T_SHIP_SLIP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_SLIP_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class diffT_SHIP_SLIP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_SHIP_SLIP "
+"SET "
+"  \"SHIP_ODR_QTY\" = ?, "
+"  \"SHIP_ODR_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT\" = ?, "
+"  \"SHIP_ODR_AMOUNT_TAX\" = ?, "
+"  \"EXTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_SALES_AMOUNT\" = ?, "
+"  \"TAXFREE_SALES_AMOUNT\" = ?, "
+"  \"TAX_CREDIT_SALES_AMOUNT\" = ?, "
+"  \"EXTERNAL_TAX_AMOUNT\" = ?, "
+"  \"INTERNAL_TAX_AMOUNT\" = ?, "
+"  \"TAX_AMOUNT_1\" = ?, "
+"  \"TAX_AMOUNT_2\" = ?, "
+"  \"TAX_AMOUNT_3\" = ?, "
+"  \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\" = ? "
+"WHERE "
+"  T_SHIP_SLIP.\"SLIP_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:diffT_SHIP_SLIP_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:diffT_SHIP_SLIP_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupdiffSHIP_ODR_QTY(), stmt);
				setString(5, data.getupdiffSHIP_ODR_AMOUNT(), stmt);
				setString(6, data.getupdiffTAX_AMOUNT(), stmt);
				setString(7, data.getupdiffSHIP_ODR_AMOUNT_TAX(), stmt);
				setString(8, data.getupdiffEXTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(9, data.getupdiffINTERNAL_TAX_SALES_AMOUNT(), stmt);
				setString(10, data.getupdiffTAXFREE_SALES_AMOUNT(), stmt);
				setString(11, data.getupdiffTAX_CREDIT_SALES_AMOUNT(), stmt);
				setString(12, data.getupdiffEXTERNAL_TAX_AMOUNT(), stmt);
				setString(13, data.getupdiffINTERNAL_TAX_AMOUNT(), stmt);
				setString(14, data.getupdiffTAX_AMOUNT_1(), stmt);
				setString(15, data.getupdiffTAX_AMOUNT_2(), stmt);
				setString(16, data.getupdiffTAX_AMOUNT_3(), stmt);
				setString(17, data.getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(), stmt);
				setString(18, data.getupdiffSLIP_CD(), stmt);

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
			//{{user_implement_dev:diffT_SHIP_SLIP_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:diffT_SHIP_SLIP_clear

			return;
		}

		/**
		 * diffT_SHIP_SLIP�N���X�̕W���R���X�g���N�^
		 */
		public diffT_SHIP_SLIP()
		{
			//{{user_implement_dev:diffT_SHIP_SLIP_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:diffT_SHIP_SLIP_constractor

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
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
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
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setPAST_RESULT_ENTRY_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
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
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setPROC_EXEC_DATE( getBigDecimal(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
	public class tbl_M_CUST_BASE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_CUST_BASE.\"TRANSPORT_LT\" as \"TRANSPORT_LT\" "
+"FROM "
+"  M_CUST_BASE "
+"WHERE "
+"  M_CUST_BASE.\"COMPANY_CD\" = ? "
+"  AND M_CUST_BASE.\"CUST_CD\" = ? "
+"  AND M_CUST_BASE.\"DLV_LOC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:tbl_M_CUST_BASE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_M_CUST_BASE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_CUST_BASE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read2
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_CUST_BASE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_read3
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_M_CUST_BASE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getmCustBase_IN_COMPANYCD());
				if(isNull(data.getmCustBase_IN_COMPANYCD())) isNull = true;
				ary.addElement(data.getmCustBase_IN_CUSTCD());
				if(isNull(data.getmCustBase_IN_CUSTCD())) isNull = true;
				ary.addElement(data.getmCustBase_IN_DLVLOCCD());
				if(isNull(data.getmCustBase_IN_DLVLOCCD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getmCustBase_IN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmCustBase_IN_CUSTCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getmCustBase_IN_DLVLOCCD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setmCustBase_TRANSPORT_LT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_M_CUST_BASE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_M_CUST_BASE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:tbl_M_CUST_BASE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_M_CUST_BASE_clear

			return;
		}

		/**
		 * tbl_M_CUST_BASE�N���X�̕W���R���X�g���N�^
		 */
		public tbl_M_CUST_BASE()
		{
			//{{user_implement_dev:tbl_M_CUST_BASE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_M_CUST_BASE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getSYUKA_LT extends DataObject
	{
		protected String m_selcmd = "select "
+"  SYS_CLASS_CODE.\"CODE\" as \"CODE\" "
+"from "
+"  SYS_CLASS_CODE "
+"where "
+"  SYS_CLASS_CODE.\"SYS_CLASS\" = 'SALES' "
+"  and SYS_CLASS_CODE.\"CLASS_CODE\" = 'SHIP_LT'";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getSYUKA_LT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getSYUKA_LT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYUKA_LT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read2
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYUKA_LT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_read3
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getSYUKA_LT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrSYUKA_LT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getSYUKA_LT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getSYUKA_LT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getSYUKA_LT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getSYUKA_LT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getSYUKA_LT_clear

			return;
		}

		/**
		 * getSYUKA_LT�N���X�̕W���R���X�g���N�^
		 */
		public getSYUKA_LT()
		{
			//{{user_implement_dev:getSYUKA_LT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getSYUKA_LT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getTax1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  substr(M_TAX.\"TAX_CD\", 3, 1) as \"TAX_KBN\", "
+"  M_TAX.\"OLD_TAX_RATE_1\" as \"OLD_TAX_1\", "
+"  M_TAX.\"OLD_TAX_RATE_2\" as \"OLD_TAX_2\", "
+"  M_TAX.\"OLD_TAX_RATE_3\" as \"OLD_TAX_3\", "
+"  M_TAX.\"NEW_TAX_RATE_1\" as \"NEW_TAX_1\", "
+"  M_TAX.\"NEW_TAX_RATE_2\" as \"NEW_TAX_2\", "
+"  M_TAX.\"NEW_TAX_RATE_3\" as \"NEW_TAX_3\", "
+"  TO_CHAR(M_TAX.\"NEW_TAX_RATE_START_DATE\", 'YYYY/MM/DD') as \"START_DATE\", "
+"  M_TAX.\"ROUND_TYP\" as \"ROUND_TYP\" "
+"from "
+"  M_TAX "
+"where "
+"  TAX_CD IN ( "
+"    SELECT "
+"      DECODE(M_CUST.TAX_APPLY_TYP, '2', M_CUST.TAX_CD, M_ITEM_SPEC.TAX_CD) TAX_CD "
+"    FROM "
+"      ( "
+"        SELECT "
+"          TAX_APPLY_TYP, "
+"          TAX_CD "
+"        FROM "
+"          M_CUST "
+"        WHERE "
+"          COMPANY_CD = ? "
+"          AND CUST_CD = ? "
+"      ) M_CUST, "
+"      ( "
+"        SELECT "
+"          TAX_CD "
+"        FROM "
+"          M_ITEM_SPEC "
+"        WHERE "
+"          COMPANY_CD = ? "
+"          AND CUST_CD = ? "
+"          AND CUST_ITEM_CD = ? "
+"      ) M_ITEM_SPEC "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getTax1_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getTax1_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax1_read
			if(m_selcmd==null) throw new FoundationException("getTax1", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getTax1_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax1_read2
			if(m_selcmd==null) throw new FoundationException("getTax1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getTax1_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax1_read3
			if(m_selcmd==null) throw new FoundationException("getTax1", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getTax1_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrTaxIN_COMPANYCD());
				if(isNull(data.getstrTaxIN_COMPANYCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_CUSTCD());
				if(isNull(data.getstrTaxIN_CUSTCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_COMPANYCD());
				if(isNull(data.getstrTaxIN_COMPANYCD())) isNull = true;
				ary.addElement(data.getstrTaxIN_CUSTCD());
				if(isNull(data.getstrTaxIN_CUSTCD())) isNull = true;
				ary.addElement(data.getg_CUST_ITEM_CD());
				if(isNull(data.getg_CUST_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrTaxIN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrTaxIN_CUSTCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrTaxIN_COMPANYCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrTaxIN_CUSTCD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getg_CUST_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrTaxTAX_KBN( getString(1, rs) );
			data.setstrTaxOLD_TAX_1( getString(2, rs) );
			data.setstrTaxOLD_TAX_2( getString(3, rs) );
			data.setstrTaxOLD_TAX_3( getString(4, rs) );
			data.setstrTaxNEW_TAX_1( getString(5, rs) );
			data.setstrTaxNEW_TAX_2( getString(6, rs) );
			data.setstrTaxNEW_TAX_3( getString(7, rs) );
			data.setstrTaxSTART_DATE( getString(8, rs) );
			data.setstrTaxROUND_TYP( getString(9, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getTax1", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getTax1_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getTax1_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getTax1_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getTax1_clear

			return;
		}

		/**
		 * getTax1�N���X�̕W���R���X�g���N�^
		 */
		public getTax1()
		{
			//{{user_implement_dev:getTax1_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getTax1_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getT_ODR_TAX extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TAX_CD "
+"FROM "
+"  T_ODR, "
+"  T_SHIP_ODR "
+"WHERE "
+"  T_ODR.ODR_NO = T_SHIP_ODR.ODR_NO "
+"  AND T_SHIP_ODR.SLIP_CD = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getT_ODR_TAX_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getT_ODR_TAX_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_ODR_TAX_read
			if(m_selcmd==null) throw new FoundationException("getT_ODR_TAX", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_ODR_TAX_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_ODR_TAX_read2
			if(m_selcmd==null) throw new FoundationException("getT_ODR_TAX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_ODR_TAX_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_ODR_TAX_read3
			if(m_selcmd==null) throw new FoundationException("getT_ODR_TAX", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getT_ODR_TAX_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getg_SLIP_CD());
				if(isNull(data.getg_SLIP_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getg_SLIP_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setstrT_ODR_TAX( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getT_ODR_TAX", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getT_ODR_TAX_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getT_ODR_TAX_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getT_ODR_TAX_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getT_ODR_TAX_clear

			return;
		}

		/**
		 * getT_ODR_TAX�N���X�̕W���R���X�g���N�^
		 */
		public getT_ODR_TAX()
		{
			//{{user_implement_dev:getT_ODR_TAX_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getT_ODR_TAX_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class get_T_SHIP_SEQ_NO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SEQ_SHIP_SEQ_NO.\"NEXTVAL\" AS \"SHIP_SEQ_NO\" "
+"FROM "
+"  DUAL";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:get_T_SHIP_SEQ_NO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:get_T_SHIP_SEQ_NO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_read
			if(m_selcmd==null) throw new FoundationException("get_T_SHIP_SEQ_NO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_read2
			if(m_selcmd==null) throw new FoundationException("get_T_SHIP_SEQ_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_read3
			if(m_selcmd==null) throw new FoundationException("get_T_SHIP_SEQ_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setgetTship_SHIP_SEQ_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("get_T_SHIP_SEQ_NO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_clear

			return;
		}

		/**
		 * get_T_SHIP_SEQ_NO�N���X�̕W���R���X�g���N�^
		 */
		public get_T_SHIP_SEQ_NO()
		{
			//{{user_implement_dev:get_T_SHIP_SEQ_NO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:get_T_SHIP_SEQ_NO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class chk_T_LOT_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_CTRL.\"LOT_NO\" AS \"LOT_NO\" "
+"FROM "
+"  T_LOT_CTRL "
+"WHERE "
+"  T_LOT_CTRL.\"LOT_NO\" = ? "
+"  AND T_LOT_CTRL.\"ITEM_CD\" = ? "
+"  AND T_LOT_CTRL.\"DEL_FLG\" = 0";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:chk_T_LOT_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:chk_T_LOT_CTRL_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:chk_T_LOT_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:chk_T_LOT_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getchkLOT_NO());
				if(isNull(data.getchkLOT_NO())) isNull = true;
				ary.addElement(data.getchkITEM_CD());
				if(isNull(data.getchkITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getchkLOT_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getchkITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:chk_T_LOT_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:chk_T_LOT_CTRL_clear

			return;
		}

		/**
		 * chk_T_LOT_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public chk_T_LOT_CTRL()
		{
			//{{user_implement_dev:chk_T_LOT_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:chk_T_LOT_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getQTY_T_LOT_STOCK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SUM(T_LOT_STOCK.\"STOCK_ON_HAND_QTY\") AS \"STOCK_ON_HAND_QTY\", "
+"  SUM(T_LOT_STOCK.\"ALCD_QTY\") AS \"ALCD_QTY\" "
+"FROM "
+"  T_LOT_STOCK "
+"WHERE "
+"  T_LOT_STOCK.\"ITEM_CD\" = ? "
+"  AND T_LOT_STOCK.\"WH_CD\" = ? "
+"  AND T_LOT_STOCK.\"LOT_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getQTY_T_LOT_STOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getQTY_T_LOT_STOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getQTY_T_LOT_STOCK_read
			if(m_selcmd==null) throw new FoundationException("getQTY_T_LOT_STOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getQTY_T_LOT_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("getQTY_T_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getQTY_T_LOT_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("getQTY_T_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getgetQtyITEM_CD());
				if(isNull(data.getgetQtyITEM_CD())) isNull = true;
				ary.addElement(data.getgetQtyWH_CD());
				if(isNull(data.getgetQtyWH_CD())) isNull = true;
				ary.addElement(data.getgetQtyLOT_NO());
				if(isNull(data.getgetQtyLOT_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("getQTY_T_LOT_STOCK", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getgetQtyITEM_CD())) setString(no ++, data.getgetQtyITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getgetQtyWH_CD())) setString(no ++, data.getgetQtyWH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getgetQtyLOT_NO())) setString(no ++, data.getgetQtyLOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setgetQtySTOCK_ON_HAND_QTY( getString(1, rs) );
			data.setgetQtyALCD_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getQTY_T_LOT_STOCK", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getQTY_T_LOT_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getQTY_T_LOT_STOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_clear

			return;
		}

		/**
		 * getQTY_T_LOT_STOCK�N���X�̕W���R���X�g���N�^
		 */
		public getQTY_T_LOT_STOCK()
		{
			//{{user_implement_dev:getQTY_T_LOT_STOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getQTY_T_LOT_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class readT_LOT_STOCK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_LOT_STOCK.\"LOT_NO\" AS \"LOT_NO\", "
+"  T_LOT_STOCK.\"STOCK_ON_HAND_QTY\" AS \"STOCK_ON_HAND_QTY\", "
+"  T_LOT_STOCK.\"ALCD_QTY\" AS \"ALCD_QTY\" "
+"FROM "
+"  T_LOT_STOCK "
+"WHERE "
+"  T_LOT_STOCK.\"STOCK_ON_HAND_QTY\" > T_LOT_STOCK.\"ALCD_QTY\" "
+"  AND T_LOT_STOCK.\"ITEM_CD\" = ? "
+"  AND T_LOT_STOCK.\"WH_CD\" = ? "
+"  AND T_LOT_STOCK.\"LOT_NO\" = ? "
+"ORDER BY "
+"  T_LOT_STOCK.\"CREATED_DATE\", "
+"  T_LOT_STOCK.\"LOT_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:readT_LOT_STOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:readT_LOT_STOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_LOT_STOCK_read
			if(m_selcmd==null) throw new FoundationException("readT_LOT_STOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_LOT_STOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_LOT_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("readT_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_LOT_STOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_LOT_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("readT_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:readT_LOT_STOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getreadTlotStock_IN_ITEM_CD());
				if(isNull(data.getreadTlotStock_IN_ITEM_CD())) isNull = true;
				ary.addElement(data.getreadTlotStock_IN_WH_CD());
				if(isNull(data.getreadTlotStock_IN_WH_CD())) isNull = true;
				ary.addElement(data.getreadTlotStock_IN_LOT_NO());
				if(isNull(data.getreadTlotStock_IN_LOT_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("readT_LOT_STOCK", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getreadTlotStock_IN_ITEM_CD())) setString(no ++, data.getreadTlotStock_IN_ITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getreadTlotStock_IN_WH_CD())) setString(no ++, data.getreadTlotStock_IN_WH_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getreadTlotStock_IN_LOT_NO())) setString(no ++, data.getreadTlotStock_IN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setreadTlotStock_LOT_NO( getString(1, rs) );
			data.setreadTlotStock_STOCK_ON_HAND_QTY( getString(2, rs) );
			data.setreadTlotStock_ALCD_QTY( getString(3, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("readT_LOT_STOCK", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:readT_LOT_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:readT_LOT_STOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:readT_LOT_STOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:readT_LOT_STOCK_clear

			return;
		}

		/**
		 * readT_LOT_STOCK�N���X�̕W���R���X�g���N�^
		 */
		public readT_LOT_STOCK()
		{
			//{{user_implement_dev:readT_LOT_STOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:readT_LOT_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_LOT_STOCK extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_LOT_STOCK.\"STOCK_ON_HAND_QTY\" AS \"STOCK_ON_HAND_QTY\", "
+"  T_LOT_STOCK.\"ALCD_QTY\" AS \"ALCD_QTY\" "
+"FROM "
+"  T_LOT_STOCK "
+"WHERE "
+"  T_LOT_STOCK.\"ITEM_CD\" = ? "
+"  AND T_LOT_STOCK.\"WH_CD\" = ? "
+"  AND T_LOT_STOCK.\"LOT_NO\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_LOT_STOCK(\"ITEM_CD\", \"WH_CD\", \"LOT_NO\", \"PLANT_CD\", \"STOCK_ON_HAND_QTY\", \"DEFECT_QTY\", \"ALCD_QTY\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_LOT_STOCK "
+"SET "
+"  \"STOCK_ON_HAND_QTY\" = ? "
+"WHERE "
+"  T_LOT_STOCK.\"ITEM_CD\" = ? "
+"  AND T_LOT_STOCK.\"WH_CD\" = ? "
+"  AND T_LOT_STOCK.\"LOT_NO\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_LOT_STOCK_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_LOT_STOCK_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_LOT_STOCK_read
			if(m_selcmd==null) throw new FoundationException("tbl_T_LOT_STOCK", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_LOT_STOCK_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_LOT_STOCK_read2
			if(m_selcmd==null) throw new FoundationException("tbl_T_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_LOT_STOCK_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_LOT_STOCK_read3
			if(m_selcmd==null) throw new FoundationException("tbl_T_LOT_STOCK", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:tbl_T_LOT_STOCK_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserLotIN_ITEM_CD());
				if(isNull(data.getserLotIN_ITEM_CD())) isNull = true;
				ary.addElement(data.getserLotIN_WH_CD());
				if(isNull(data.getserLotIN_WH_CD())) isNull = true;
				ary.addElement(data.getserLotIN_LOT_NO());
				if(isNull(data.getserLotIN_LOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserLotIN_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserLotIN_WH_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getserLotIN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setserLotSTOCK_ON_HAND_QTY( getString(1, rs) );
			data.setserLotALCD_QTY( getString(2, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("tbl_T_LOT_STOCK", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_LOT_STOCK_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_LOT_STOCK_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getinsertLotStock_ITEM_CD(), stmt);
				setString(8, data.getinsertLotStock_WH_CD(), stmt);
				setString(9, data.getinsertLotStock_LOT_CD(), stmt);
				setString(10, data.getinsertLotStock_PLANT_CD(), stmt);
				setString(11, data.getinsertLotStock_STOCK_ON_HAND_QTY(), stmt);
				setString(12, data.getinsertLotStock_DEFECT_QTY(), stmt);
				setString(13, data.getinsertLotStock_ALCD_QTY(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getupTlotStockSTOCK_ON_HAND_QTY(), stmt);
				setString(5, data.getupTlotStockIN_ITEM_CD(), stmt);
				setString(6, data.getupTlotStockIN_WH_CD(), stmt);
				setString(7, data.getupTlotStockIN_LOT_NO(), stmt);

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
			//{{user_implement_dev:tbl_T_LOT_STOCK_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_LOT_STOCK_clear

			return;
		}

		/**
		 * tbl_T_LOT_STOCK�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_LOT_STOCK()
		{
			//{{user_implement_dev:tbl_T_LOT_STOCK_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_LOT_STOCK_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_SHIP_INST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_SHIP_INST(\"SHIP_SEQ_NO\", \"SHIP_ODR_NO\", \"LOT_NO\", \"ITEM_CD\", \"WH_CD\", \"ODR_NO\", \"SLIP_CD\", \"SHIP_QTY\", \"SHIP_DATE\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY/MM/DD HH24:MI:SS'))";
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_SHIP_INST "
+"WHERE "
+"  T_SHIP_INST.\"SHIP_SEQ_NO\" = ? "
+"  AND T_SHIP_INST.\"LOT_NO\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_SHIP_INST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_SHIP_INST_def

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getinsTshipInst_SHIP_SEQ_NO(), stmt);
				setString(8, data.getinsTshipInst_SHIP_ODR_NO(), stmt);
				setString(9, data.getinsTshipInst_LOT_NO(), stmt);
				setString(10, data.getinsTshipInst_ITEM_CD(), stmt);
				setString(11, data.getinsTshipInst_WH_CD(), stmt);
				setString(12, data.getinsTshipInst_ODR_NO(), stmt);
				setString(13, data.getinsTshipInst_SLIP_CD(), stmt);
				setString(14, data.getinsTshipInst_SHIP_QTY(), stmt);
				setString(15, data.getinsTshipInst_SHIP_DATE(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * �f�[�^�폜����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int delete(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;
			int no=1;

			try {
				ary.addElement(data.getdelTshipInstIN_SHIP_SEQ_NO());
				if(isNull(data.getdelTshipInstIN_SHIP_SEQ_NO())) isNull = true;
				ary.addElement(data.getdelTshipInstIN_LOT_NO());
				if(isNull(data.getdelTshipInstIN_LOT_NO())) isNull = true;
				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(m_delcmd, ary) : m_delcmd);
				stmt = conn.prepareStatement(dyn_query);

				//���ISQL�������W�b�N
				if(!isNull(data.getdelTshipInstIN_SHIP_SEQ_NO())) {
					setString(no++, data.getdelTshipInstIN_SHIP_SEQ_NO(), stmt);
				}
				if(!isNull(data.getdelTshipInstIN_LOT_NO())) {
					setString(no++, data.getdelTshipInstIN_LOT_NO(), stmt);
				}

				return stmt.executeUpdate();
			} catch(ParseException e){
				throw new FoundationException("tbl_T_SHIP_INST", "prepare", "Parse���s:"+e.toString());
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
				ary.removeAllElements();
				ary = null;
			}
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:tbl_T_SHIP_INST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_INST_clear

			return;
		}

		/**
		 * tbl_T_SHIP_INST�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_SHIP_INST()
		{
			//{{user_implement_dev:tbl_T_SHIP_INST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_SHIP_INST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class tbl_T_LOT_TRACE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_LOT_TRACE.\"LOT_TRACE_TYP\" AS \"LOT_TRACE_TYP\" "
+"FROM "
+"  T_LOT_TRACE "
+"WHERE "
+"  T_LOT_TRACE.\"FROM_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"FROM_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"TO_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"TO_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"LOT_TRACE_TYP\" = ?";
		protected String m_inscmd = "INSERT INTO "
+"  T_LOT_TRACE(\"FROM_ITEM_CD\", \"FROM_LOT_NO\", \"TO_ITEM_CD\", \"TO_LOT_NO\", \"LOT_TRACE_TYP\", \"CUST_ODR_NO\", \"SLIP_CD\", \"ODR_NO\") "
+"VALUES "
+"  (?, ?, ?, ?, ?, ?, ?, ?)";
		protected String m_updcmd = "UPDATE "
+"  T_LOT_TRACE "
+"SET "
+"  \"FROM_ITEM_CD\" = ?, "
+"  \"FROM_LOT_NO\" = ?, "
+"  \"TO_ITEM_CD\" = ?, "
+"  \"TO_LOT_NO\" = ?, "
+"  \"LOT_TRACE_TYP\" = ? "
+"WHERE "
+"  T_LOT_TRACE.\"FROM_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"FROM_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"TO_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"TO_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"LOT_TRACE_TYP\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:tbl_T_LOT_TRACE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:tbl_T_LOT_TRACE_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:tbl_T_LOT_TRACE_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:tbl_T_LOT_TRACE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.gettlotTrace_FROM_ITEM_CD());
				if(isNull(data.gettlotTrace_FROM_ITEM_CD())) isNull = true;
				ary.addElement(data.gettlotTrace_FROM_LOT_NO());
				if(isNull(data.gettlotTrace_FROM_LOT_NO())) isNull = true;
				ary.addElement(data.gettlotTrace_TO_ITEM_CD());
				if(isNull(data.gettlotTrace_TO_ITEM_CD())) isNull = true;
				ary.addElement(data.gettlotTrace_TO_LOT_NO());
				if(isNull(data.gettlotTrace_TO_LOT_NO())) isNull = true;
				ary.addElement(data.gettlotTrace_LOT_TRACE_TYP());
				if(isNull(data.gettlotTrace_LOT_TRACE_TYP())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.gettlotTrace_FROM_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gettlotTrace_FROM_LOT_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gettlotTrace_TO_ITEM_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gettlotTrace_TO_LOT_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.gettlotTrace_LOT_TRACE_TYP(), stmt);

			return stmt.executeQuery();
		}
		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * ���R�[�h�V�K�ǉ�����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int create(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(7, data.gettlotTrace_FROM_ITEM_CD(), stmt);
				setString(8, data.gettlotTrace_FROM_LOT_NO(), stmt);
				setString(9, data.gettlotTrace_TO_ITEM_CD(), stmt);
				setString(10, data.gettlotTrace_TO_LOT_NO(), stmt);
				setString(11, data.gettlotTrace_LOT_TRACE_TYP(), stmt);
				setString(12, data.gettlotTrace_CUST_ODR_NO(), stmt);
				setString(13, data.gettlotTrace_SLIP_CD(), stmt);
				setString(14, data.gettlotTrace_ODR_NO(), stmt);

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
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.gettlotTrace_FROM_ITEM_CD(), stmt);
				setString(5, data.gettlotTrace_FROM_LOT_NO(), stmt);
				setString(6, data.gettlotTrace_TO_ITEM_CD(), stmt);
				setString(7, data.gettlotTrace_TO_LOT_NO(), stmt);
				setString(8, data.gettlotTrace_LOT_TRACE_TYP(), stmt);
				setString(9, data.gettlotTrace_FROM_ITEM_CD(), stmt);
				setString(10, data.gettlotTrace_FROM_LOT_NO(), stmt);
				setString(11, data.gettlotTrace_TO_ITEM_CD(), stmt);
				setString(12, data.gettlotTrace_TO_LOT_NO(), stmt);
				setString(13, data.gettlotTrace_LOT_TRACE_TYP(), stmt);

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
			//{{user_implement_dev:tbl_T_LOT_TRACE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:tbl_T_LOT_TRACE_clear

			return;
		}

		/**
		 * tbl_T_LOT_TRACE�N���X�̕W���R���X�g���N�^
		 */
		public tbl_T_LOT_TRACE()
		{
			//{{user_implement_dev:tbl_T_LOT_TRACE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:tbl_T_LOT_TRACE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class read_T_SHIP_INST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP_INST.\"LOT_NO\" AS \"LOT_NO\", "
+"  T_SHIP_INST.\"SHIP_QTY\" AS \"SHIP_QTY\", "
+"  T_SHIP_INST.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SHIP_INST.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SHIP_INST.\"WH_CD\" AS \"WH_CD\", "
+"  T_SHIP_INST.\"ODR_NO\" AS \"ODR_NO\", "
+"  T_SHIP_INST.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_SHIP_INST.\"SHIP_DATE\" AS \"SHIP_DATE\" "
+"FROM "
+"  T_SHIP_INST "
+"WHERE "
+"  T_SHIP_INST.\"SHIP_SEQ_NO\" = ? "
+"  AND T_SHIP_INST.\"LOT_NO\" = ? "
+"ORDER BY "
+"  T_SHIP_INST.\"LOT_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:read_T_SHIP_INST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:read_T_SHIP_INST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_SHIP_INST_read
			if(m_selcmd==null) throw new FoundationException("read_T_SHIP_INST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_SHIP_INST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_SHIP_INST_read2
			if(m_selcmd==null) throw new FoundationException("read_T_SHIP_INST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:read_T_SHIP_INST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_SHIP_INST_read3
			if(m_selcmd==null) throw new FoundationException("read_T_SHIP_INST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:read_T_SHIP_INST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getreadTshipInst_IN_SHIP_SEQ_NO());
				if(isNull(data.getreadTshipInst_IN_SHIP_SEQ_NO())) isNull = true;
				ary.addElement(data.getreadTshipInst_IN_LOT_NO());
				if(isNull(data.getreadTshipInst_IN_LOT_NO())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("read_T_SHIP_INST", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getreadTshipInst_IN_SHIP_SEQ_NO())) setString(no ++, data.getreadTshipInst_IN_SHIP_SEQ_NO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getreadTshipInst_IN_LOT_NO())) setString(no ++, data.getreadTshipInst_IN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setreadTshipInst_LOT_NO( getString(1, rs) );
			data.setreadTshipInst_SHIP_QTY( getString(2, rs) );
			data.setreadTshipInst_SHIP_ODR_NO( getString(3, rs) );
			data.setreadTshipInst_ITEM_CD( getString(4, rs) );
			data.setreadTshipInst_WH_CD( getString(5, rs) );
			data.setreadTshipInst_ODR_NO( getString(6, rs) );
			data.setreadTshipInst_SLIP_CD( getString(7, rs) );
			data.setreadTshipInst_SHIP_DATE( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("read_T_SHIP_INST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_T_SHIP_INST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_T_SHIP_INST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:read_T_SHIP_INST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:read_T_SHIP_INST_clear

			return;
		}

		/**
		 * read_T_SHIP_INST�N���X�̕W���R���X�g���N�^
		 */
		public read_T_SHIP_INST()
		{
			//{{user_implement_dev:read_T_SHIP_INST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:read_T_SHIP_INST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class read_Rest_T_SHIP_INST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_SHIP_INST.\"LOT_NO\" AS \"LOT_NO\", "
+"  T_SHIP_INST.\"SHIP_QTY\" AS \"SHIP_QTY\", "
+"  T_SHIP_INST.\"SHIP_ODR_NO\" AS \"SHIP_ODR_NO\", "
+"  T_SHIP_INST.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  T_SHIP_INST.\"WH_CD\" AS \"WH_CD\", "
+"  T_SHIP_INST.\"ODR_NO\" AS \"ODR_NO\", "
+"  T_SHIP_INST.\"SLIP_CD\" AS \"SLIP_CD\", "
+"  T_SHIP_INST.\"SHIP_DATE\" AS \"SHIP_DATE\" "
+"FROM "
+"  T_SHIP_INST "
+"WHERE "
+"  T_SHIP_INST.\"SHIP_SEQ_NO\" = ? "
+"  AND T_SHIP_INST.\"LOT_NO\" <> ? "
+"ORDER BY "
+"  T_SHIP_INST.\"LOT_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:read_Rest_T_SHIP_INST_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:read_Rest_T_SHIP_INST_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_Rest_T_SHIP_INST_read
			if(m_selcmd==null) throw new FoundationException("read_Rest_T_SHIP_INST", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_Rest_T_SHIP_INST_read2
			if(m_selcmd==null) throw new FoundationException("read_Rest_T_SHIP_INST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_Rest_T_SHIP_INST_read3
			if(m_selcmd==null) throw new FoundationException("read_Rest_T_SHIP_INST", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getreadTshipInst_IN_SHIP_SEQ_NO());
				if(isNull(data.getreadTshipInst_IN_SHIP_SEQ_NO())) isNull = true;
				ary.addElement(data.getreadTshipInst_IN_LOT_NO());
				if(isNull(data.getreadTshipInst_IN_LOT_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getreadTshipInst_IN_SHIP_SEQ_NO(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getreadTshipInst_IN_LOT_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setreadTshipInst_LOT_NO( getString(1, rs) );
			data.setreadTshipInst_SHIP_QTY( getString(2, rs) );
			data.setreadTshipInst_SHIP_ODR_NO( getString(3, rs) );
			data.setreadTshipInst_ITEM_CD( getString(4, rs) );
			data.setreadTshipInst_WH_CD( getString(5, rs) );
			data.setreadTshipInst_ODR_NO( getString(6, rs) );
			data.setreadTshipInst_SLIP_CD( getString(7, rs) );
			data.setreadTshipInst_SHIP_DATE( getString(8, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("read_Rest_T_SHIP_INST", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:read_Rest_T_SHIP_INST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:read_Rest_T_SHIP_INST_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_clear

			return;
		}

		/**
		 * read_Rest_T_SHIP_INST�N���X�̕W���R���X�g���N�^
		 */
		public read_Rest_T_SHIP_INST()
		{
			//{{user_implement_dev:read_Rest_T_SHIP_INST_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:read_Rest_T_SHIP_INST_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class getLOT_NO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  LOT_NO AS LOT_NO "
+"FROM "
+"  T_SHIP_INST "
+"WHERE "
+"  SHIP_SEQ_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:getLOT_NO_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:getLOT_NO_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getLOT_NO_read
			if(m_selcmd==null) throw new FoundationException("getLOT_NO", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getLOT_NO_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getLOT_NO_read2
			if(m_selcmd==null) throw new FoundationException("getLOT_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getLOT_NO_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:getLOT_NO_read3
			if(m_selcmd==null) throw new FoundationException("getLOT_NO", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:getLOT_NO_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getreadT_Ship_Inst_Ship_Seq_NO());
				if(isNull(data.getreadT_Ship_Inst_Ship_Seq_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getreadT_Ship_Inst_Ship_Seq_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setreadT_Ship_Inst_Lot_NO( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("getLOT_NO", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:getLOT_NO_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:getLOT_NO_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:getLOT_NO_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:getLOT_NO_clear

			return;
		}

		/**
		 * getLOT_NO�N���X�̕W���R���X�g���N�^
		 */
		public getLOT_NO()
		{
			//{{user_implement_dev:getLOT_NO_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:getLOT_NO_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectM_EXCH_RATE extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  TO_CHAR(EXCH_RATE) AS EXCH_RATE "
+"FROM "
+"  M_EXCH_RATE "
+"WHERE "
+"  COMPANY_CD = ? "
+"  AND CUR_CD = ? "
+"  AND EXCH_TYP = ? "
+"  AND EXCH_START_DATE = ( "
+"    SELECT "
+"      MAX(EXCH_START_DATE) "
+"    FROM "
+"      M_EXCH_RATE "
+"    WHERE "
+"      COMPANY_CD = ? "
+"      AND CUR_CD = ? "
+"      AND EXCH_TYP = ? "
+"      AND EXCH_START_DATE <= TO_DATE(?) "
+"  )";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectM_EXCH_RATE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectM_EXCH_RATE_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_EXCH_RATE_read
			if(m_selcmd==null) throw new FoundationException("selectM_EXCH_RATE", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_EXCH_RATE_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_EXCH_RATE_read2
			if(m_selcmd==null) throw new FoundationException("selectM_EXCH_RATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_EXCH_RATE_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_EXCH_RATE_read3
			if(m_selcmd==null) throw new FoundationException("selectM_EXCH_RATE", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectM_EXCH_RATE_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getstrOdrCurrncyCd());
				if(isNull(data.getstrOdrCurrncyCd())) isNull = true;
				ary.addElement(data.getstrExchTyp());
				if(isNull(data.getstrExchTyp())) isNull = true;
				ary.addElement(data.getstrCOMPANY_CD());
				if(isNull(data.getstrCOMPANY_CD())) isNull = true;
				ary.addElement(data.getstrOdrCurrncyCd());
				if(isNull(data.getstrOdrCurrncyCd())) isNull = true;
				ary.addElement(data.getstrExchTyp());
				if(isNull(data.getstrExchTyp())) isNull = true;
				ary.addElement(data.getg_DATE());
				if(isNull(data.getg_DATE())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getstrCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrOdrCurrncyCd(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrExchTyp(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrCOMPANY_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrOdrCurrncyCd(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getstrExchTyp(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getg_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setcreTsales_EXCH_RATE( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectM_EXCH_RATE", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectM_EXCH_RATE_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectM_EXCH_RATE_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectM_EXCH_RATE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectM_EXCH_RATE_clear

			return;
		}

		/**
		 * selectM_EXCH_RATE�N���X�̕W���R���X�g���N�^
		 */
		public selectM_EXCH_RATE()
		{
			//{{user_implement_dev:selectM_EXCH_RATE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectM_EXCH_RATE_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SHIP_ODR_MODIFY_COUNT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MODIFY_COUNT "
+"FROM "
+"  T_SHIP_ODR "
+"WHERE "
+"  SHIP_ODR_NO = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR_MODIFY_COUNT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR_MODIFY_COUNT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR_MODIFY_COUNT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getdiffSHIP_ODR_NO());
				if(isNull(data.getdiffSHIP_ODR_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getdiffSHIP_ODR_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setselTShipOdr_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_ODR_MODIFY_COUNT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_clear

			return;
		}

		/**
		 * selectT_SHIP_ODR_MODIFY_COUNT�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SHIP_ODR_MODIFY_COUNT()
		{
			//{{user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_ODR_MODIFY_COUNT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectT_SHIP_FOR_UPDATE_NOWAIT extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  MODIFY_COUNT "
+"FROM "
+"  T_SHIP "
+"WHERE "
+"  SHIP_SEQ_NO = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, KU0030010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, KU0030010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_FOR_UPDATE_NOWAIT", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read2
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_FOR_UPDATE_NOWAIT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, KU0030010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read3
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_FOR_UPDATE_NOWAIT", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, KU0030010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getserTori_SHIP_SEQ_NO());
				if(isNull(data.getserTori_SHIP_SEQ_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getserTori_SHIP_SEQ_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public KU0030010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			KU0030010Struct data = new KU0030010Struct();

			data.setSEL_MODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectT_SHIP_FOR_UPDATE_NOWAIT", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, KU0030010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_clear

			return;
		}

		/**
		 * selectT_SHIP_FOR_UPDATE_NOWAIT�N���X�̕W���R���X�g���N�^
		 */
		public selectT_SHIP_FOR_UPDATE_NOWAIT()
		{
			//{{user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectT_SHIP_FOR_UPDATE_NOWAIT_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class updateT_LOT_TRACE extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_LOT_TRACE "
+"SET "
+"  \"CUST_ODR_NO\" = ?, "
+"  \"SLIP_CD\" = ?, "
+"  \"ODR_NO\" = ? "
+"WHERE "
+"  T_LOT_TRACE.\"FROM_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"FROM_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"TO_ITEM_CD\" = ? "
+"  AND T_LOT_TRACE.\"TO_LOT_NO\" = ? "
+"  AND T_LOT_TRACE.\"LOT_TRACE_TYP\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="KU0030010";
		protected String m_sUpdateProgramName="KU0030010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:updateT_LOT_TRACE_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:updateT_LOT_TRACE_def

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(IDbConnection conn, KU0030010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * �f�[�^�X�V����
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public int update(Connection conn, KU0030010Struct data) throws FoundationException, SQLException
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
				setString(4, data.gettlotTrace_CUST_ODR_NO(), stmt);
				setString(5, data.gettlotTrace_SLIP_CD(), stmt);
				setString(6, data.gettlotTrace_ODR_NO(), stmt);
				setString(7, data.gettlotTrace_FROM_ITEM_CD(), stmt);
				setString(8, data.gettlotTrace_FROM_LOT_NO(), stmt);
				setString(9, data.gettlotTrace_TO_ITEM_CD(), stmt);
				setString(10, data.gettlotTrace_TO_LOT_NO(), stmt);
				setString(11, data.gettlotTrace_LOT_TRACE_TYP(), stmt);

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
			//{{user_implement_dev:updateT_LOT_TRACE_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:updateT_LOT_TRACE_clear

			return;
		}

		/**
		 * updateT_LOT_TRACE�N���X�̕W���R���X�g���N�^
		 */
		public updateT_LOT_TRACE()
		{
			//{{user_implement_dev:updateT_LOT_TRACE_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:updateT_LOT_TRACE_constractor

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
		mgetCompanyInfo.clear();
		mgetCompanyInfo = null;
		mgetUserInfo.clear();
		mgetUserInfo = null;
		mgetGyomuDate.clear();
		mgetGyomuDate = null;
		mtbl_T_SHIP.clear();
		mtbl_T_SHIP = null;
		mtbl_T_SHIP_ODR.clear();
		mtbl_T_SHIP_ODR = null;
		mchkIsWhCd.clear();
		mchkIsWhCd = null;
		mtbl_T_SALES.clear();
		mtbl_T_SALES = null;
		mtbl_M_ITEM.clear();
		mtbl_M_ITEM = null;
		mtbl_M_ITEM_SPEC.clear();
		mtbl_M_ITEM_SPEC = null;
		mtbl_T_ODR.clear();
		mtbl_T_ODR = null;
		mtbl_T_RCV_ISSUE.clear();
		mtbl_T_RCV_ISSUE = null;
		mtbl_T_ITEM_STOCK.clear();
		mtbl_T_ITEM_STOCK = null;
		mtbl_M_CUST.clear();
		mtbl_M_CUST = null;
		mgetSYS_PARAMETER.clear();
		mgetSYS_PARAMETER = null;
		mgetRecallWhCd.clear();
		mgetRecallWhCd = null;
		mtblM_UNIT_COST.clear();
		mtblM_UNIT_COST = null;
		mreadT_SHIP_ODR.clear();
		mreadT_SHIP_ODR = null;
		mgetCUR_UNIT.clear();
		mgetCUR_UNIT = null;
		mchkSysInstallOptions.clear();
		mchkSysInstallOptions = null;
		mreadSysArCtrl.clear();
		mreadSysArCtrl = null;
		mreadT_AR_LEDGER_H.clear();
		mreadT_AR_LEDGER_H = null;
		mreadT_AR_LEDGER_H_TRN.clear();
		mreadT_AR_LEDGER_H_TRN = null;
		mtbl_T_SHIP_ODR1.clear();
		mtbl_T_SHIP_ODR1 = null;
		mtbl_T_SHIP_ODR2.clear();
		mtbl_T_SHIP_ODR2 = null;
		mtbl_T_OD.clear();
		mtbl_T_OD = null;
		mgetTax.clear();
		mgetTax = null;
		mtbl_T_SHIP_ODR3.clear();
		mtbl_T_SHIP_ODR3 = null;
		mchkT_AR_LEDGER_H.clear();
		mchkT_AR_LEDGER_H = null;
		mchkT_AR_LEDGER_H_TRN.clear();
		mchkT_AR_LEDGER_H_TRN = null;
		mgetPlantFromWhCd.clear();
		mgetPlantFromWhCd = null;
		mtbl_M_WH.clear();
		mtbl_M_WH = null;
		mtbl_M_ORG.clear();
		mtbl_M_ORG = null;
		mtbl_T_JOB_ODR_CD_STOCK.clear();
		mtbl_T_JOB_ODR_CD_STOCK = null;
		mtbl_T_JOB_ODR.clear();
		mtbl_T_JOB_ODR = null;
		mdiffT_SHIP_ODR.clear();
		mdiffT_SHIP_ODR = null;
		mupdateT_ODR.clear();
		mupdateT_ODR = null;
		mtbl_T_SHIP_SLIP.clear();
		mtbl_T_SHIP_SLIP = null;
		mdiffT_SHIP_SLIP.clear();
		mdiffT_SHIP_SLIP = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mSELECT_SYS_ACTUAL_COST_CTRL_AC.clear();
		mSELECT_SYS_ACTUAL_COST_CTRL_AC = null;
		mtbl_M_CUST_BASE.clear();
		mtbl_M_CUST_BASE = null;
		mgetSYUKA_LT.clear();
		mgetSYUKA_LT = null;
		mgetTax1.clear();
		mgetTax1 = null;
		mgetT_ODR_TAX.clear();
		mgetT_ODR_TAX = null;
		mget_T_SHIP_SEQ_NO.clear();
		mget_T_SHIP_SEQ_NO = null;
		mchk_T_LOT_CTRL.clear();
		mchk_T_LOT_CTRL = null;
		mgetQTY_T_LOT_STOCK.clear();
		mgetQTY_T_LOT_STOCK = null;
		mreadT_LOT_STOCK.clear();
		mreadT_LOT_STOCK = null;
		mtbl_T_LOT_STOCK.clear();
		mtbl_T_LOT_STOCK = null;
		mtbl_T_SHIP_INST.clear();
		mtbl_T_SHIP_INST = null;
		mtbl_T_LOT_TRACE.clear();
		mtbl_T_LOT_TRACE = null;
		mread_T_SHIP_INST.clear();
		mread_T_SHIP_INST = null;
		mread_Rest_T_SHIP_INST.clear();
		mread_Rest_T_SHIP_INST = null;
		mgetLOT_NO.clear();
		mgetLOT_NO = null;
		mselectM_EXCH_RATE.clear();
		mselectM_EXCH_RATE = null;
		mselectT_SHIP_ODR_MODIFY_COUNT.clear();
		mselectT_SHIP_ODR_MODIFY_COUNT = null;
		mselectT_SHIP_FOR_UPDATE_NOWAIT.clear();
		mselectT_SHIP_FOR_UPDATE_NOWAIT = null;
		mupdateT_LOT_TRACE.clear();
		mupdateT_LOT_TRACE = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * KU0030010�N���X�̕W���R���X�g���N�^
	 */
	public KU0030010Entity() throws FoundationException
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
