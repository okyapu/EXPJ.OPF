/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/TaxNameControl.java,v $
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
 * �Ŗ����擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class TaxNameControl {

	/** �f�t�H���g�Ŏg�p����SYSTEM�R���g���[���R�[�h */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";
	/** [�Ŗ�]�f�[�^�擾�pSQL */
	private static final String selectTaxNameSql =
		"select "
			+ "  SYS_TAX_NAME.CTRL_CD as CTRL_CD, "
			+ "  SYS_TAX_NAME.TAX_NAME_1 as TAX_NAME_1, "
			+ "  SYS_TAX_NAME.TAX_NAME_2 as TAX_NAME_2, "
			+ "  SYS_TAX_NAME.TAX_NAME_3 as TAX_NAME_3 "
			+ "from "
			+ "  SYS_TAX_NAME "
			+ "where "
			+ "  SYS_TAX_NAME.CTRL_CD = ? ";

	/**
	 * �Ŗ����擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private TaxNameControl() {
	}

	/**
	 * �Ŗ������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @return �Ŗ����f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static TaxNameStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		TaxNameStruct tns = getData(conn, DEFAULT_CTRL_CD);

		return tns;
	}

	/**
	 * �Ŗ������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd SYS�R���g���[���R�[�h�i�K�{�j
	 * @return �Ŗ����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static TaxNameStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYS�R���g���[���R�[�h���s���ȏꍇ
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		TaxNameStruct tns = selectTaxName(conn, ctrlCd);

		return tns;
	}

	/**
	 * [�Ŗ�]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @return �Ŗ����f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static TaxNameStruct selectTaxName(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectTaxNameSql);
			ps.setString(1, ctrlCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02029");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			TaxNameStruct tns = new TaxNameStruct();
			tns.setCTRL_CD(rs.getString("CTRL_CD"));
			tns.setTAX_NAME_1(rs.getString("TAX_NAME_1"));
			tns.setTAX_NAME_2(rs.getString("TAX_NAME_2"));
			tns.setTAX_NAME_3(rs.getString("TAX_NAME_3"));

			return tns;
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
