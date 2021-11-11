/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/sysdata/HomeCurControl.java,v $
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
 * �M�ݏ��擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:38 $
 */
public class HomeCurControl {

	/** �f�t�H���g�Ŏg�p����SYSTEM�R���g���[���R�[�h */
	private static final String DEFAULT_CTRL_CD = "SYSTEM";

	/** [�M��]�f�[�^�擾�p��SQL */
	private static final String selectHomeCurSql =
		"select "
			+ "  SYS_HOME_CUR.CTRL_CD as CTRL_CD, "
			+ "  SYS_HOME_CUR.HOME_CUR_CD as HOME_CUR_CD "
			+ "from "
			+ "  SYS_HOME_CUR "
			+ "where "
			+ "  SYS_HOME_CUR.CTRL_CD = ? ";
	/** [�ʉ�]�f�[�^�擾�p��SQL */
	private static final String selectCurSql =
		"select "
			+ "  M_CUR.CUR_CD as CUR_CD, "
			+ "  M_CUR.CUR_NAME as CUR_NAME, "
			+ "  M_CUR.CUR_SYMBOL as CUR_SYMBOL, "
			+ "  M_CUR.CUR_UNIT as CUR_UNIT, "
			+ "  M_CUR.DECIMAL_FIG as DECIMAL_FIG "
			+ "from "
			+ "  M_CUR "
			+ "where"
			+ "  M_CUR.CUR_CD = ? ";

	/**
	 * �M�ݏ��擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private HomeCurControl() {
	}

	/**
	 * �M�ݏ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @return �ʉݏ��f�[�^�N���X 
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static HomeCurStruct getData(IDbConnection conn)
		throws SQLException, DataNotFoundException {

		HomeCurStruct hcs = getData(conn, DEFAULT_CTRL_CD);

		return hcs;
	}

	/**
	 * ���Вʉݏ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd SYS�R���g���[���R�[�h�i�K�{�j
	 * @return �ʉݏ��f�[�^�N���X 
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static HomeCurStruct getData(IDbConnection conn, String ctrlCd)
		throws SQLException, DataNotFoundException {

		// SYS�R���g���[���R�[�h���s���ȏꍇ
		if (ctrlCd == null || ctrlCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// [�M��]������
		HomeCurStruct homeCurHcs = selectHomeCur(conn, ctrlCd);
		// [�ʉ�]��[�M��]."�M�݃R�[�h"�Ō���
		HomeCurStruct curHcs = selectCur(conn, homeCurHcs.getCUR_CD());

		// ���\�b�h���^�[���p�f�[�^�N���X���쐬
		HomeCurStruct hcs = new HomeCurStruct();
		hcs.setCTRL_CD(homeCurHcs.getCTRL_CD());
		hcs.setCUR_CD(homeCurHcs.getCUR_CD());
		hcs.setCUR_NAME(curHcs.getCUR_NAME());
		hcs.setCUR_SYMBOL(curHcs.getCUR_SYMBOL());
		hcs.setCUR_UNIT(curHcs.getCUR_UNIT());
		hcs.setDECIMAL_FIG(curHcs.getDECIMAL_FIG());

		return hcs;
	}

	/**
	 * [�M��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd SYS�R���g���[���R�[�h
	 * @return �M�ݏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static HomeCurStruct selectHomeCur(
		IDbConnection conn,
		String ctrlCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectHomeCurSql);
			ps.setString(1, ctrlCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02022");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			HomeCurStruct hcs = new HomeCurStruct();
			hcs.setCUR_CD(rs.getString("CTRL_CD"));
			hcs.setCUR_CD(rs.getString("HOME_CUR_CD"));

			return hcs;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
	}

	/**
	 * [�ʉ�]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param curCd �ʉ݃R�[�h
	 * @return �ʉݏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static HomeCurStruct selectCur(IDbConnection conn, String curCd)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectCurSql);
			ps.setString(1, curCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02023");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			HomeCurStruct hcs = new HomeCurStruct();
			hcs.setCUR_CD(rs.getString("CUR_CD"));
			hcs.setCUR_NAME(rs.getString("CUR_NAME"));
			hcs.setCUR_SYMBOL(rs.getString("CUR_SYMBOL"));
			hcs.setCUR_UNIT(rs.getString("CUR_UNIT"));
			hcs.setDECIMAL_FIG(rs.getString("DECIMAL_FIG"));

			return hcs;
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
