/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/MyCompanyControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.sysdata;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * ���Џ��擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class MyCompanyControl {

	/** �f�t�H���g�Ŏg�p����SYSTEM�R���g���[���R�[�h */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";
	/** [����]�f�[�^�擾�pSQL */
	private static final String selectMyCompanySql =
		"select "
			+ "  SYS_MY_COMPANY.CTRL_CD as CTRL_CD, "
			+ "  SYS_MY_COMPANY.COMPANY_CD as COMPANY_CD, "
			+ "  SYS_MY_COMPANY.START_DAY as START_DAY "
			+ "from "
			+ "  SYS_MY_COMPANY "
			+ "where "
			+ "  SYS_MY_COMPANY.CTRL_CD = ? ";

	/**
	 * ���Џ��擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private MyCompanyControl() {
	}

	/**
	 * ���Џ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @return ���Џ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static MyCompanyStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		MyCompanyStruct mcs = getData(conn, DEFAULT_CTRL_CD);

		return mcs;
	}

	/**
	 * ���Џ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd SYS�R���g���[���R�[�h�i�K�{�j
	 * @return ���Џ��f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static MyCompanyStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYS�R���g���[���R�[�h���s���ȏꍇ
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		MyCompanyStruct mcs = selectMyCompany(conn, ctrlCd);

		return mcs;
	}

	/**
	 * [����]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd SYS�R���g���[���R�[�h�i�K�{�j
	 * @return ���Џ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static MyCompanyStruct selectMyCompany(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectMyCompanySql);
			ps.setString(1, ctrlCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02027");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			MyCompanyStruct mcs = new MyCompanyStruct();
			mcs.setCTRL_CD(rs.getString("CTRL_CD"));
			mcs.setCOMPANY_CD(rs.getString("COMPANY_CD"));
			mcs.setSTART_DAY(rs.getString("START_DAY"));

			return mcs;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}

	}

}
