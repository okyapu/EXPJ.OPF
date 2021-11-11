/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/src/com/nec/jp/orteus/metamorBase/AC0130/AC0130010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0130;

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
 * CLASS     : AC0130010Entity �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_code_header

public class AC0130010Entity extends DataObject
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

	// select�N���X �C���X�^���X
	public select mselect = new select();

	// CHK_M_ITEM�N���X �C���X�^���X
	public CHK_M_ITEM mCHK_M_ITEM = new CHK_M_ITEM();

	// CHK_T_JOB_ODR�N���X �C���X�^���X
	public CHK_T_JOB_ODR mCHK_T_JOB_ODR = new CHK_T_JOB_ODR();

	// SYS_JOB_OD_CALC_CTRL�N���X �C���X�^���X
	public SYS_JOB_OD_CALC_CTRL mSYS_JOB_OD_CALC_CTRL = new SYS_JOB_OD_CALC_CTRL();

	// selectCnt�N���X �C���X�^���X
	public selectCnt mselectCnt = new selectCnt();


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
		String m_write_fname="AC0130010.csv";

		protected WriteCsv m_writer=null;		// csv�����ݗp

		String m_ProjName="AC0130010";

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
	public class select extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_CANCEL_NO\" AS \"JOB_ODR_CANCEL_NO\", "
+"  T_JOB_ODR.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  TO_CHAR(T_JOB_ODR.\"JOB_ODR_QTY\", 'FM99999999999990.0999') as \"JOB_ODR_QTY\", "
+"  TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') AS \"JOB_ODR_DLV_DATE\", "
+"  T_JOB_ODR.\"JOB_ODR_STS_TYP\" AS \"JOB_ODR_STS_TYP\", "
+"  T_JOB_ODR.\"JOB_ODR_TYP\" AS \"JOB_ODR_TYP\", "
+"  T_JOB_ODR.\"PLAN_TYP\" AS \"PLAN_TYP\", "
+"  T_JOB_ODR.\"ALC_GRP_CD\" AS \"ALC_GRP_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_DEL_FLG\" AS \"JOB_ODR_DEL_FLG\", "
+"  NVL(DB.\"ALCD_QTY\",0) AS \"ALCD_QTY\", "
+"  CASE WHEN T_JOB_ODR.JOB_ODR_DEL_FLG=1 AND T_JOB_ODR.JOB_ODR_STS_TYP IN (3,4) AND T_JOB_ODR.JOB_ODR_EXP_TYP IN (2,9) THEN  "
+"  '' "
+"  ELSE TO_CHAR(NVL(T_JOB_ODR.\"JOB_ODR_QTY\",0)-NVL(DB.\"ALCD_QTY\",0), 'FM99,999,999,999,990.0999') END   as \"ALCD_ENABLE_QTY\", "
+"  CASE WHEN DB1.PLANT_CD IS NOT NULL THEN '1' "
+"  WHEN T_JOB_ODR.JOB_ODR_STS_TYP = 2 AND T_JOB_ODR.JOB_ODR_EXP_TYP =1 THEN '1' "
+"  WHEN T_JOB_ODR.JOB_ODR_STS_TYP IN (3,4) AND T_JOB_ODR.JOB_ODR_EXP_TYP =2 THEN '1' "
+"  ELSE '0' END AS JobOdrExpect "
+"FROM "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  (select "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" AS JOB_ODR_CD, "
+"   TO_CHAR(SUM(T_PRD_REQ_JOB_ODR_ALC.\"ALCD_QTY\"), 'TM9') AS ALCD_QTY "
+"from "
+"  T_PRD_REQ_JOB_ODR_ALC "
+"where "
+"  T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"PLANT_CD\" = ? "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"COMPANY_CD\" = ( "
+"     select "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    from "
+"      SYS_MY_COMPANY "
+"    where "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'  ) "
+"group by  "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" "
+"  ) DB, "
+" (SELECT  "
+"    T_MRP_REEXPLOSION.PLANT_CD AS PLANT_CD , "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD AS JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO "
+"  FROM "
+"    T_MRP_REEXPLOSION "
+"    GROUP BY "
+"    T_MRP_REEXPLOSION.PLANT_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO   "
+"  ) DB1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\"=DB.\"JOB_ODR_CD\"(+) "
+"  AND T_JOB_ODR.PLANT_CD=DB1.PLANT_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_CD=DB1.JOB_ODR_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DETAIL_NO=DB1.JOB_ODR_DETAIL_NO(+) "
+"  AND T_JOB_ODR.JOB_ODR_CANCEL_NO=DB1.JOB_ODR_CANCEL_NO(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"ITEM_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"PLANT_CD\" = ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') <= ? "
+"  AND (T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      ) "
+"  AND  ( "
+"  0 <> CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"            ELSE 1 "
+"      END "
+"  AND "
+"  to_number(?) = CASE WHEN(to_number(?) <> 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"           ELSE to_number(?)  "
+"  END "
+"  ) "
+"  AND ( "
+"  0 = CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"           ELSE 1 "
+"      END "
+"  OR  "
+"  0 <> CASE WHEN(to_number(?) = 1) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"            ELSE 0  "
+"  END "
+"  ) "
+"ORDER BY "
+"  T_JOB_ODR.\"JOB_ODR_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_CANCEL_NO\", "
+"  T_JOB_ODR.\"ITEM_CD\", "
+"  T_JOB_ODR.\"JOB_ODR_DLV_DATE\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:select_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:select_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0130010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read2
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0130010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_read3
			if(m_selcmd==null) throw new FoundationException("select", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:select_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_FROM());
				if(isNull(data.getJOB_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_TO());
				if(isNull(data.getJOB_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_STS_TYP());
				if(isNull(data.getInC1_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_STS_TYP());
				if(isNull(data.getInC2_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_JOB_ODR_STS_TYP());
				if(isNull(data.getInC3_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC4_JOB_ODR_STS_TYP());
				if(isNull(data.getInC4_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC5_JOB_ODR_STS_TYP());
				if(isNull(data.getInC5_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC9_JOB_ODR_STS_TYP());
				if(isNull(data.getInC9_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_CANCEL());
				if(isNull(data.getInC1_JOB_ODR_CANCEL())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_CANCEL());
				if(isNull(data.getInC2_JOB_ODR_CANCEL())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("select", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_DLV_DATE_FROM())) setString(no ++, data.getJOB_ODR_DLV_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_DLV_DATE_TO())) setString(no ++, data.getJOB_ODR_DLV_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_JOB_ODR_STS_TYP())) setString(no ++, data.getInC1_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_JOB_ODR_STS_TYP())) setString(no ++, data.getInC2_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC3_JOB_ODR_STS_TYP())) setString(no ++, data.getInC3_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC4_JOB_ODR_STS_TYP())) setString(no ++, data.getInC4_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC5_JOB_ODR_STS_TYP())) setString(no ++, data.getInC5_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC9_JOB_ODR_STS_TYP())) setString(no ++, data.getInC9_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_JOB_ODR_CANCEL())) setString(no ++, data.getInC1_JOB_ODR_CANCEL(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_JOB_ODR_CANCEL())) setString(no ++, data.getInC2_JOB_ODR_CANCEL(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0130010Struct data = new AC0130010Struct();

			data.setl_JOB_ODR_CD( getString(1, rs) );
			data.setl_JOB_ODR_CANCEL_NO( getString(2, rs) );
			data.setl_ITEM_CD( getString(3, rs) );
			data.setl_ITEM_NAME( getString(4, rs) );
			data.setl_STOCK_UNIT( getString(5, rs) );
			data.setl_JOB_ODR_QTY( getString(6, rs) );
			data.setl_JOB_ODR_DLV_DATE( getString(7, rs) );
			data.setl_JOB_ODR_STS_TYP( getString(8, rs) );
			data.setl_JOB_ODR_TYP( getString(9, rs) );
			data.setl_PLAN_TYP( getString(10, rs) );
			data.setl_ALC_GRP_CD( getString(11, rs) );
			data.setl_JOB_ODR_DEL_FLG( getString(12, rs) );
			data.setl_ALCD_QTY( getString(13, rs) );
			data.setl_ALCD_ENABLE_QTY( getString(14, rs) );
			data.setJobOdrExpectFlg( getString(15, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("select", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:select_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:select_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:select_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:select_clear

			return;
		}

		/**
		 * select�N���X�̕W���R���X�g���N�^
		 */
		public select()
		{
			//{{user_implement_dev:select_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:select_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class CHK_M_ITEM extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\" "
+"FROM "
+"  M_ITEM "
+"WHERE "
+"  M_ITEM.\"ITEM_CD\" LIKE ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_M_ITEM_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:CHK_M_ITEM_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_M_ITEM_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_M_ITEM_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:CHK_M_ITEM_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:CHK_M_ITEM_clear

			return;
		}

		/**
		 * CHK_M_ITEM�N���X�̕W���R���X�g���N�^
		 */
		public CHK_M_ITEM()
		{
			//{{user_implement_dev:CHK_M_ITEM_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:CHK_M_ITEM_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class CHK_T_JOB_ODR extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  T_JOB_ODR.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\" "
+"FROM "
+"  T_JOB_ODR "
+"WHERE "
+"  T_JOB_ODR.\"JOB_ODR_CD\" LIKE ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:CHK_T_JOB_ODR_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:CHK_T_JOB_ODR_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:CHK_T_JOB_ODR_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getJOB_ODR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:CHK_T_JOB_ODR_clear

			return;
		}

		/**
		 * CHK_T_JOB_ODR�N���X�̕W���R���X�g���N�^
		 */
		public CHK_T_JOB_ODR()
		{
			//{{user_implement_dev:CHK_T_JOB_ODR_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:CHK_T_JOB_ODR_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class SYS_JOB_OD_CALC_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD "
+"FROM "
+"  SYS_JOB_OD_CALC_CTRL "
+"WHERE "
+"  SYS_JOB_OD_CALC_CTRL.JOB_ODR_CD = ? "
+"  AND SYS_JOB_OD_CALC_CTRL.PLANT_CD = ? "
+"  AND SYS_JOB_OD_CALC_CTRL.OD_MNT_FLG = 1";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_def

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getl_JOB_ODR_CD());
				if(isNull(data.getl_JOB_ODR_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// �ÓISQL���̐���
			setString(no ++, data.getl_JOB_ODR_CD(), stmt);
			// �ÓISQL���̐���
			setString(no ++, data.getsys_PLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * �C���X�^���X�N���A����
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_clear

			return;
		}

		/**
		 * SYS_JOB_OD_CALC_CTRL�N���X�̕W���R���X�g���N�^
		 */
		public SYS_JOB_OD_CALC_CTRL()
		{
			//{{user_implement_dev:SYS_JOB_OD_CALC_CTRL_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:SYS_JOB_OD_CALC_CTRL_constractor

			return;
		}
	}
	/**
	 * Entity��` �ÓISQL
	 */
	public class selectCnt extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  COUNT(1) "
+"FROM "
+"  T_JOB_ODR, "
+"  M_ITEM, "
+"  (select "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" AS JOB_ODR_CD, "
+"   TO_CHAR(SUM(T_PRD_REQ_JOB_ODR_ALC.\"ALCD_QTY\"), 'TM9') AS ALCD_QTY "
+"from "
+"  T_PRD_REQ_JOB_ODR_ALC "
+"where "
+"  T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_DETAIL_NO\" = 0 "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"PLANT_CD\" = ? "
+"  and T_PRD_REQ_JOB_ODR_ALC.\"COMPANY_CD\" = ( "
+"     select "
+"      SYS_MY_COMPANY.\"COMPANY_CD\" "
+"    from "
+"      SYS_MY_COMPANY "
+"    where "
+"      SYS_MY_COMPANY.\"CTRL_CD\" = 'SYSTEM'  ) "
+"group by  "
+"   T_PRD_REQ_JOB_ODR_ALC.\"JOB_ODR_CD\" "
+"  ) DB, "
+" (SELECT  "
+"    T_MRP_REEXPLOSION.PLANT_CD AS PLANT_CD , "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD AS JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO AS JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO AS JOB_ODR_CANCEL_NO "
+"  FROM "
+"    T_MRP_REEXPLOSION "
+"    GROUP BY "
+"    T_MRP_REEXPLOSION.PLANT_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CD, "
+"    T_MRP_REEXPLOSION.JOB_ODR_DETAIL_NO, "
+"    T_MRP_REEXPLOSION.JOB_ODR_CANCEL_NO   "
+"  ) DB1 "
+"WHERE "
+"  T_JOB_ODR.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\"=DB.\"JOB_ODR_CD\"(+) "
+"  AND T_JOB_ODR.PLANT_CD=DB1.PLANT_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_CD=DB1.JOB_ODR_CD(+) "
+"  AND T_JOB_ODR.JOB_ODR_DETAIL_NO=DB1.JOB_ODR_DETAIL_NO(+) "
+"  AND T_JOB_ODR.JOB_ODR_CANCEL_NO=DB1.JOB_ODR_CANCEL_NO(+) "
+"  AND T_JOB_ODR.\"JOB_ODR_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"ITEM_CD\" LIKE ? "
+"  AND T_JOB_ODR.\"PLANT_CD\" = ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') >= ? "
+"  AND TO_CHAR(T_JOB_ODR.\"JOB_ODR_DLV_DATE\",'YYYY/MM/DD') <= ? "
+"  AND (T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      OR T_JOB_ODR.\"JOB_ODR_STS_TYP\" = to_number(?) "
+"      ) "
+"  AND  ( "
+"  0 <> CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"            ELSE 1 "
+"      END "
+"  AND "
+"  to_number(?) = CASE WHEN(to_number(?) <> 0) THEN T_JOB_ODR.\"JOB_ODR_TYP\"  "
+"           ELSE to_number(?)  "
+"  END "
+"  ) "
+"  AND ( "
+"  0 = CASE WHEN(to_number(?) = 0) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"           ELSE 1 "
+"      END "
+"  OR  "
+"  0 <> CASE WHEN(to_number(?) = 1) THEN T_JOB_ODR.\"JOB_ODR_CANCEL_NO\"  "
+"            ELSE 0  "
+"  END "
+"  ) "
+" AND ROWNUM <= TO_NUMBER(?) + 1 ";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectCnt_def
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:selectCnt_def

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn IDbConnection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AC0130010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AC0130010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "�N�G���[���o�^");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt_read
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStr �u��������
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0130010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read2
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectCnt_read2
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @param conn Native Connection�N���X�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @param replaceStrs �u��������z��
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(Connection conn, AC0130010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_read3
			if(m_selcmd==null) throw new FoundationException("selectCnt", "read", "�N�G���[���o�^");
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
                        //}}user_implement_dev:selectCnt_read3
		}

		/**
		 * �f�[�^�Ǐo������
		 *
		 * @return Struct���ʃ��X�g
		 * @param stmt PreparedStatement�C���X�^���X
		 * @param data Struct�N���X�C���X�^���X
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public List read(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AC0130010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_CD());
				if(isNull(data.getJOB_ODR_CD())) isNull = true;
				ary.addElement(data.getITEM_CD());
				if(isNull(data.getITEM_CD())) isNull = true;
				ary.addElement(data.getsys_PLANT_CD());
				if(isNull(data.getsys_PLANT_CD())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_FROM());
				if(isNull(data.getJOB_ODR_DLV_DATE_FROM())) isNull = true;
				ary.addElement(data.getJOB_ODR_DLV_DATE_TO());
				if(isNull(data.getJOB_ODR_DLV_DATE_TO())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_STS_TYP());
				if(isNull(data.getInC1_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_STS_TYP());
				if(isNull(data.getInC2_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC3_JOB_ODR_STS_TYP());
				if(isNull(data.getInC3_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC4_JOB_ODR_STS_TYP());
				if(isNull(data.getInC4_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC5_JOB_ODR_STS_TYP());
				if(isNull(data.getInC5_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getInC9_JOB_ODR_STS_TYP());
				if(isNull(data.getInC9_JOB_ODR_STS_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getJOB_ODR_TYP());
				if(isNull(data.getJOB_ODR_TYP())) isNull = true;
				ary.addElement(data.getInC1_JOB_ODR_CANCEL());
				if(isNull(data.getInC1_JOB_ODR_CANCEL())) isNull = true;
				ary.addElement(data.getInC2_JOB_ODR_CANCEL());
				if(isNull(data.getInC2_JOB_ODR_CANCEL())) isNull = true;
				ary.addElement(data.getROW_COUNT());
				if(isNull(data.getROW_COUNT())) isNull = true;

				//���ISQL�������W�b�N
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("selectCnt", "prepare", "Parse���s:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//���ISQL�������W�b�N
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_CD())) setString(no ++, data.getJOB_ODR_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getITEM_CD())) setString(no ++, data.getITEM_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getsys_PLANT_CD())) setString(no ++, data.getsys_PLANT_CD(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_DLV_DATE_FROM())) setString(no ++, data.getJOB_ODR_DLV_DATE_FROM(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_DLV_DATE_TO())) setString(no ++, data.getJOB_ODR_DLV_DATE_TO(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_JOB_ODR_STS_TYP())) setString(no ++, data.getInC1_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_JOB_ODR_STS_TYP())) setString(no ++, data.getInC2_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC3_JOB_ODR_STS_TYP())) setString(no ++, data.getInC3_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC4_JOB_ODR_STS_TYP())) setString(no ++, data.getInC4_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC5_JOB_ODR_STS_TYP())) setString(no ++, data.getInC5_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC9_JOB_ODR_STS_TYP())) setString(no ++, data.getInC9_JOB_ODR_STS_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getJOB_ODR_TYP())) setString(no ++, data.getJOB_ODR_TYP(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC1_JOB_ODR_CANCEL())) setString(no ++, data.getInC1_JOB_ODR_CANCEL(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getInC2_JOB_ODR_CANCEL())) setString(no ++, data.getInC2_JOB_ODR_CANCEL(), stmt);
			//���ISQL�������W�b�N
			if(!isNull(data.getROW_COUNT())) setString(no ++, data.getROW_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
		 */
		public AC0130010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AC0130010Struct data = new AC0130010Struct();

			data.setl_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean hasRecord(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectCnt", "hasRecord", "�N�G���[���o�^");

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
		public boolean check(IDbConnection conn, AC0130010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AC0130010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectCnt_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);;

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectCnt_check
		}

		/**
		 * entity�ɂ͂P�ȏ�̃��R�[�h�������Ă��邩
		 *
		 * @exception <<�R�����g���L�q���Ă�������>>
		 */
		public boolean check(PreparedStatement stmt, AC0130010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectCnt_clear
				// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
                        //}}user_implement_dev:selectCnt_clear

			return;
		}

		/**
		 * selectCnt�N���X�̕W���R���X�g���N�^
		 */
		public selectCnt()
		{
			//{{user_implement_dev:selectCnt_constractor
				// TODO: �����ɏ����������L�q���Ă�������
                        //}}user_implement_dev:selectCnt_constractor

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
		mselect.clear();
		mselect = null;
		mCHK_M_ITEM.clear();
		mCHK_M_ITEM = null;
		mCHK_T_JOB_ODR.clear();
		mCHK_T_JOB_ODR = null;
		mSYS_JOB_OD_CALC_CTRL.clear();
		mSYS_JOB_OD_CALC_CTRL = null;
		mselectCnt.clear();
		mselectCnt = null;
		return;
	}

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * AC0130010�N���X�̕W���R���X�g���N�^
	 */
	public AC0130010Entity() throws FoundationException
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
