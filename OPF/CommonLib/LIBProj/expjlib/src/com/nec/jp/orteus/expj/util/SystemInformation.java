/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/SystemInformation.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.foundation.IDbRecordset;
import com.nec.jp.orteus.util.CoreTools;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * �V�X�e�����擾�N���X
 * DB��̃V�X�e�������擾���邽�߂̋@�\�ł��B<BR>
 *
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.5 $ $Date: 2015/04/02 03:20:45 $
 */
public class SystemInformation {

	/**
	 * 'SYSTEM'�̉�ЃR�[�h���擾���܂��B
	 *
	 * @return ��ЃR�[�h
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public static String getSysMyCompanyCd() throws FoundationException {

		return getSysMyCompanyCd("SYSTEM");
	}

	/**
	 * �w�肳�ꂽ CTRL_CD �̉�ЃR�[�h���擾���܂��B
	 *
	 * @param  ctrlCd CTRL_CD
	 * @return ��ЃR�[�h
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public static String getSysMyCompanyCd(String ctrlCd) throws
		FoundationException {

		IDbConnection conn = null;
		IDbAdapter adapt = null;
		IDbRecordset rs = null;

		try {
			String sysCompanyCd = null;
			String query = "SELECT COMPANY_CD FROM SYS_MY_COMPANY " +
				"WHERE CTRL_CD = '" + ctrlCd + "'";

			conn = CoreTools.getDefaultConnection();
			adapt = conn.getAdapter(query);
			rs = adapt.execQuery(true);

			if (rs.next()) {
				sysCompanyCd = rs.getString(1);
			}

			return sysCompanyCd;
		} catch (FoundationException e) {
			FoundationException fe = new FoundationException(
				"SystemInformation", "getSysMyCompanyCd", "(SBM0871)���R�[�h�����Ɏ��s���܂����B");
			fe.setPreviousException(e);
			throw fe;
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (adapt != null) {
					adapt.close();
					adapt = null;
				}
				if (conn != null) {
					CoreTools.closeDefaultConnection(conn);
					conn = null;
				}
			} catch (Exception e) {}
		}
	}

	/**
	 * ���Џ����擾���܂��B
	 *
	 * @param  conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @return ��ЃR�[�h
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 */
	public static String getSysMyCompanyCd(IDbConnection conn) throws
	       SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sysCompanyCd = null;
			String query = "SELECT COMPANY_CD FROM SYS_MY_COMPANY " +
				"WHERE CTRL_CD = '" + "SYSTEM" + "'";

			ps = conn.getConn().prepareStatement(query);
			rs = ps.executeQuery();

			if (rs.next()) {
				sysCompanyCd = rs.getString(1);
			}

			return sysCompanyCd;
		} finally {
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					ps.close();
				}
		}
	}

	/**
	 * 'SYSTEM'�̖M�݃R�[�h���擾���܂��B
	 *
	 * @return �M�݃R�[�h
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public static String getSysHomeCurCd() throws FoundationException {

		return getSysHomeCurCd("SYSTEM");
	}

	/**
	 * �w�肳�ꂽ CTRL_CD �̖M�݃R�[�h���擾���܂��B
	 *
	 * @param  ctrlCd CTRL_CD
	 * @return �M�݃R�[�h
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public static String getSysHomeCurCd(String ctrlCd) throws
		FoundationException {

		IDbConnection conn = null;
		IDbAdapter adapt = null;
		IDbRecordset rs = null;

		try {
			String sysHomeCurCd = null;
			String query = "SELECT HOME_CUR_CD FROM SYS_HOME_CUR " +
				"WHERE CTRL_CD = '" + ctrlCd + "'";

			conn = CoreTools.getDefaultConnection();
			adapt = conn.getAdapter(query);
			rs = adapt.execQuery(true);

			if (rs.next()) {
				sysHomeCurCd = rs.getString(1);
			}

			return sysHomeCurCd;
		} catch (FoundationException e) {
			FoundationException fe = new FoundationException(
				"SystemInformation", "getSysMyCompanyCd", "(SBM0871)���R�[�h�����Ɏ��s���܂����B");
			fe.setPreviousException(e);
			throw fe;
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (adapt != null) {
					adapt.close();
					adapt = null;
				}
				if (conn != null) {
					CoreTools.closeDefaultConnection(conn);
					conn = null;
				}
			} catch (Exception e) {}
		}
	}

	/**
	 * �w�肳�ꂽ�H��R�[�h�̋Ɩ��^�p�����擾���܂��B
	 *
	 * @param  plantCd �H��R�[�h
	 * @return �Ɩ��^�p��('YYYY/MM/DD')
	 * @throws	FoundationException �������s���ȏꍇ�܂��́A�I���N���G���[�����������ꍇ
	 */
	public static String getBusinessOprDate(String plantCd) throws
		FoundationException {

		IDbConnection conn = null;
		IDbAdapter adapt = null;
		IDbRecordset rs = null;

		try {
			String sysBusinessOprDate = null;
			String query = "SELECT TO_CHAR(BUSINESS_OPR_DATE, 'YYYY/MM/DD') " +
				"FROM SYS_DATE_CTRL " +
				"WHERE PLANT_CD = '" + plantCd + "'";

			conn = CoreTools.getDefaultConnection();
			adapt = conn.getAdapter(query);
			rs = adapt.execQuery(true);

			if (rs.next()) {
				sysBusinessOprDate = rs.getString(1);
			}

			return sysBusinessOprDate;
		} catch (FoundationException e) {
			FoundationException fe = new FoundationException(
				"SystemInformation", "getSysMyCompanyCd", "(SBM0871)���R�[�h�����Ɏ��s���܂����B");
			fe.setPreviousException(e);
			throw fe;
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (adapt != null) {
					adapt.close();
					adapt = null;
				}
				if (conn != null) {
					CoreTools.closeDefaultConnection(conn);
					conn = null;
				}
			} catch (Exception e) {}
		}
	}
}
