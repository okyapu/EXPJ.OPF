/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/DateCtrlControl.java,v $
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
 * ���t������擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:37 $
 */
public class DateCtrlControl {

	/** [���t����]�f�[�^�擾�p��SQL */
	private static final String selectDateCtrlSql =
		"select "
			+ "  SYS_DATE_CTRL.PLANT_CD as PLANT_CD, "
			+ "  to_char(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD') as BUSINESS_OPR_DATE, "
			+ "  to_char(SYS_DATE_CTRL.STOCK_CRITERION_DATE, 'YYYY/MM/DD') as STOCK_CRITERION_DATE "
			+ "from "
			+ "  SYS_DATE_CTRL "
			+ "where "
			+ "  SYS_DATE_CTRL.PLANT_CD = ? ";

	/**
	 * ���t������擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private DateCtrlControl() {
	}

	/**
	 * ���t��������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @return ���t������f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static DateCtrlStruct getData(IDbConnection conn, String plantCd)
		throws SQLException, DataNotFoundException {

		// �H��R�[�h���s���ȏꍇ
		if (plantCd == null || plantCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		DateCtrlStruct dcs = selectDateCtrl(conn, plantCd);

		return dcs;
	}

	/**
	 * [���t����]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param plantCd �H��R�[�h
	 * @return ���t������f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static DateCtrlStruct selectDateCtrl(
		IDbConnection conn,
		String plantCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectDateCtrlSql);
			ps.setString(1, plantCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02028");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			DateCtrlStruct dcs = new DateCtrlStruct();
			dcs.setPLANT_CD(rs.getString("PLANT_CD"));
			dcs.setBUSINESS_OPR_DATE(rs.getString("BUSINESS_OPR_DATE"));
			dcs.setSTOCK_CRITERION_DATE(rs.getString("STOCK_CRITERION_DATE"));

			return dcs;
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
