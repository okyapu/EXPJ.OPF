/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/CurControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �ʉݏ��擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class CurControl {

	/** [�����]�f�[�^�擾�p��SQL */
	private static final String selectVendCtrlSql =
		"select "
			+ "  * "
			+ "from "
			+ "  M_VEND_CTRL "
			+ "where "
			+ "  M_VEND_CTRL.COMPANY_CD = ? "
			+ "  and M_VEND_CTRL.VEND_CD = ?";
	/** [�M��]�f�[�^�擾�p��SQL */
	private static final String selectHomeCurSql =
		"select "
			+ "  * "
			+ "from "
			+ "  SYS_HOME_CUR "
			+ "where "
			+ "  SYS_HOME_CUR.CTRL_CD = ?";
	/** [�ʉ�]�f�[�^�擾�p��SQL */
	private static final String selectCurSql =
		"select "
			+ "  * "
			+ "from "
			+ "  M_CUR "
			+ "where "
			+ "  M_CUR.CUR_CD = ?";

	/**
	 * �ʉݏ��擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private CurControl() {
	}

	/**
	 * �����ʉݏ����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h �i�K�{�j
	 * @return �ʉݏ��f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static CurStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {

		// ��ЃR�[�h���s���ȏꍇ
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �����R�[�h���s���ȏꍇ
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// ���\�b�h���^�[���p�f�[�^�N���X�쐬
		CurStruct cs = new CurStruct();

		// [�����]������
		CurStruct vendCtrlCs = selectVendCtrl(conn, companyCd, vendCd);

		// [�ʉ�]�����p�f�[�^�N���X
		CurStruct curCs = null;

		// [�����]."����ʉ݃R�[�h"��null�A�󕶎��̏ꍇ�A
		// [�M��]."�M�݃R�[�h"���g�p���A�בփ��[�g��1�Ƃ���B
		if (vendCtrlCs.getCUR_CD() == null
			|| vendCtrlCs.getCUR_CD().equals("")) {

			// [�M��]���擾
			CurStruct homeCurCs = selectHomeCur(conn, "SYSTEM");
			// [�ʉ�]��[�M��]."�M�݃R�[�h"�Ō���
			curCs = selectCur(conn, homeCurCs.getCUR_CD());
		} else {

			// [�ʉ�]��[�����]."����ʉ݃R�[�h"�Ō���
			curCs = selectCur(conn, vendCtrlCs.getCUR_CD());
		}

		cs.setEXCH_TYP(vendCtrlCs.getEXCH_TYP());
		cs.setROUND_TYP(vendCtrlCs.getROUND_TYP());
		cs.setCUR_CD(curCs.getCUR_CD());
		cs.setCUR_NAME(curCs.getCUR_NAME());
		cs.setCUR_SYMBOL(curCs.getCUR_SYMBOL());
		cs.setCUR_UNIT(curCs.getCUR_UNIT());
		cs.setDECIMAL_FIG(curCs.getDECIMAL_FIG());

		return cs;
	}

	/**
	 * [�����}�X�^]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param vendCd �����R�[�h
	 * @return �ʉݏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static CurStruct selectVendCtrl(
		IDbConnection conn,
		String companyCd,
		String vendCd)
		throws SQLException, DataNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectVendCtrlSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02021");
			}

			// �f�[�^���擾
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("CUR_CD"));
			cs.setROUND_TYP(rs.getString("ROUND_TYP"));
			cs.setEXCH_TYP(rs.getString("EXCH_TYP"));

			return cs;
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
	 * [�M��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param ctrlCd �R���g���[���R�[�h
	 * @return �ʉݏ��f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static CurStruct selectHomeCur(IDbConnection conn, String ctrlCd)
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
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("HOME_CUR_CD"));

			return cs;
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
	private static CurStruct selectCur(IDbConnection conn, String curCd)
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
			CurStruct cs = new CurStruct();
			cs.setCUR_CD(rs.getString("CUR_CD"));
			cs.setCUR_NAME(rs.getString("CUR_NAME"));
			cs.setCUR_SYMBOL(rs.getString("CUR_SYMBOL"));
			cs.setCUR_UNIT(rs.getString("CUR_UNIT"));
			cs.setDECIMAL_FIG(rs.getString("DECIMAL_FIG"));

			return cs;
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
