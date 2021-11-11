//------------------------------------------------------------------------------
// (#)ScreenPermission.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/09/10 �V�K�쐬 T.Taniguchi
// 2003/10/08 ��Servlet���ݎq��ʋN�����@�\�ǉ� T.Taniguchi
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ��ʎg�p�������{����B
 *
 * @author  T.Taniguchi
 * @version 1.00
 */
public class ScreenPermission
{
	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public ScreenPermission(){}

	/**
	 * ��ʂ̎g�p�������邩�ǂ����₢���킹��SQL
	 *
	 * @param conn DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param userCode Orteus���[�U��
	 * @param businessName �Ɩ���
	 */
	public static boolean isUseful(IDbConnection conn, String userCode, String businessName) throws SQLException {

		PreparedStatement isUsefulStmt = null;			// �X�e�[�g�����g
		ResultSet isUsefulRslt = null;					// ���U���g�Z�b�g
		String ProgramName = businessName + "Servlet";	// ����ID

	/** �Ɩ����b�Z�[�W��`�e�[�u��--�����p��SQL */
		String _isUsefulSql =
			"SELECT B.USER_CD " +
			"FROM   (SELECT U.USER_CD, U.BUSINESS_GROUP_CD FROM BELONG_MST U WHERE U.USER_CD = ? ) B " +
			"     , (SELECT R.BUSINESS_GROUP_CD, R.BUSINESS_CD FROM GROUP_RECV_BUSINESS_MST R " +
			"        UNION " +
			"        SELECT P.BUSINESS_GROUP_CD, P.BUSINESS_CD FROM GROUP_PARM_BUSINESS_MST P ) G " +
			"     , CONDUCT_MST C " +
			"     , (SELECT BUSINESS_CD, CONDUCT_CD, SCREEN_URL FROM SCREEN_MST WHERE SCREEN_URL = ? " +
			"        UNION " +
			"        SELECT S.BUSINESS_CD, S.CONDUCT_CD, S.SCREEN_URL FROM SCREEN_MST S, SYS_PERMITTED_SCREEN D " +
			"        WHERE (S.SCREEN_URL = D.SCREEN_URL) AND (D.PROGRAM_CD = ?) ) T " +
			"WHERE  B.BUSINESS_GROUP_CD = G.BUSINESS_GROUP_CD " +
			"  AND  G.BUSINESS_CD       = C.BUSINESS_CD " +
			"  AND  C.BUSINESS_CD       = T.BUSINESS_CD " +
			"  AND  C.CONDUCT_CD        = T.CONDUCT_CD ";

		try {
			isUsefulStmt = (conn.getConn()).prepareStatement(_isUsefulSql);
			isUsefulStmt.setString(1, userCode);
			isUsefulStmt.setString(2, ProgramName);
			isUsefulStmt.setString(3, businessName);
			isUsefulRslt = isUsefulStmt.executeQuery();
			if(isUsefulRslt.next() == true) {
				return true;
			} else {
				return false;
			}
		} finally {
			closePreparedStatement(isUsefulStmt);
			closeResultSet(isUsefulRslt);
		}
	}

	/**
	 * �v���y�A�h�X�e�[�g�����g�����B
	 *
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private static void closePreparedStatement(PreparedStatement statement)
	{
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
			}
		}
	}

	/**
	 * ���U���g�Z�b�g�����B
	 *
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
	 */
	private static void closeResultSet(ResultSet resultset)
	{
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
			}
		}
	}
}
