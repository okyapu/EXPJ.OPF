/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/ExchRateControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �בփ��[�g���擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class ExchRateControl {

	/** [�בփ��[�g]�f�[�^�擾�p��SQL */
	private static final String selectExchRateSql =
		"select "
			+ "  M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
			+ "  M_EXCH_RATE.CUR_CD as CUR_CD, "
			+ "  to_char(M_EXCH_RATE.EXCH_TYP) as EXCH_TYP, "
			+ "  M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD, "
			+ "  to_char(M_EXCH_RATE.EXCH_START_DATE, 'YYYY/MM/DD') as EXCH_START_DATE, "
			+ "  to_char(M_EXCH_RATE.EXCH_END_DATE, 'YYYY/MM/DD') as EXCH_END_DATE, "
			+ "  to_char(M_EXCH_RATE.EXCH_RATE, 'fm99999999999990.009999') as EXCH_RATE "
			+ "from "
			+ "  M_EXCH_RATE, "
			+ "  ( "
			+ "    select "
			+ "      M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
			+ "      M_EXCH_RATE.CUR_CD as CUR_CD, "
			+ "      M_EXCH_RATE.EXCH_TYP as EXCH_TYP, "
			+ "      M_EXCH_RATE.EXCH_RESERVE_CD as EXCH_RESERVE_CD, "
			+ "      max(M_EXCH_RATE.EXCH_START_DATE) as MAX_EXCH_START_DATE "
			+ "    from "
			+ "      M_EXCH_RATE "
			+ "    where "
			+ "      M_EXCH_RATE.COMPANY_CD = ? "
			+ "      and M_EXCH_RATE.CUR_CD = ? "
			+ "      and M_EXCH_RATE.EXCH_TYP = to_number(?) "
			+ "      and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = ?) "
			+ "      and M_EXCH_RATE.EXCH_START_DATE <= to_date(?, 'YYYY/MM/DD') "
			+ "    group by "
			+ "      M_EXCH_RATE.COMPANY_CD, "
			+ "      M_EXCH_RATE.CUR_CD, "
			+ "      M_EXCH_RATE.EXCH_TYP, "
			+ "      M_EXCH_RATE.EXCH_RESERVE_CD "
			+ "  ) T1 "
			+ "where "
			+ "  M_EXCH_RATE.COMPANY_CD = T1.COMPANY_CD "
			+ "  and M_EXCH_RATE.CUR_CD = T1.CUR_CD "
			+ "  and M_EXCH_RATE.EXCH_TYP = T1.EXCH_TYP "
			+ "  and (M_EXCH_RATE.EXCH_TYP != 2 or M_EXCH_RATE.EXCH_RESERVE_CD = T1.EXCH_RESERVE_CD) "
			+ "  and M_EXCH_RATE.EXCH_START_DATE = T1.MAX_EXCH_START_DATE ";

	/**
	 * �בփ��[�g�擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private ExchRateControl() {
	}

	/**
	 * �בփ��[�g�����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param curCd �ʉ݃R�[�h�i�K�{�j
	 * @param exchTyp �ב֎�ʁi�K�{�j
	 * @param exchReserveCd �ב֗\��R�[�h
	 * @param rateJudgeDate ���[�g������i�K�{�j
	 * @return �בփ��[�g���f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static ExchRateStruct getData(
		IDbConnection conn,
		String companyCd,
		String curCd,
		String exchTyp,
		String exchReserveCd,
		String rateJudgeDate)
		throws SQLException, DataNotFoundException {

		// ��ЃR�[�h���s���ȏꍇ			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �ʉ݃R�[�h���s���ȏꍇ			
		if (curCd == null || curCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �ב֎�ʂ��s���ȏꍇ			
		if (exchTyp == null || exchTyp.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// ���[�g��������s���ȏꍇ			
		if (rateJudgeDate == null || rateJudgeDate.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// [�M��]�y�іM�݃R�[�h����Ɍ�������[�ʉ�]�̏����擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);

		// [�����]."�ב֎��"��2���A��ב֗\��R�[�h���null�܂��͋󕶎��̏ꍇ
		/*
		if (exchTyp.equals("2")
			&& (exchReserveCd == null || exchReserveCd.equals(""))) {
			;
		}
		*/

		// [�בփ��[�g]�����p�f�[�^�N���X
		ExchRateStruct ers = null;

		// [�����]."����ʉ݃R�[�h"��[�M��]."�M�݃R�[�h"���������ꍇ
		if (curCd.equals(hcs.getCUR_CD())) {
			// [�בփ��[�g]�f�[�^�N���X�͈בփ��[�g��1�Ƃ��č쐬
			ers = new ExchRateStruct();
			ers.setCUR_CD(curCd);
			ers.setEXCH_TYP(exchTyp);
			ers.setEXCH_RESERVE_CD(exchReserveCd);
			ers.setEXCH_START_DATE(rateJudgeDate);
			ers.setEXCH_END_DATE(null);
			ers.setEXCH_RATE("1.0");
		} else {
			// [�בփ��[�g]���������A�בփ��[�g���擾
			ers =
				selectExchRate(
					conn,
					companyCd,
					curCd,
					exchTyp,
					exchReserveCd,
					rateJudgeDate);
		}

		return ers;
	}

	/**
	 * [�בփ��[�g�}�X�^]���� 
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param curCd �ʉ݃R�[�h
	 * @param exchTyp �ב֎��
	 * @param exchReserveCd �ב֗\��R�[�h
	 * @param rateJudgeDate ���[�g�����
	 * @return �בփ��[�g���N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	private static ExchRateStruct selectExchRate(
		IDbConnection conn,
		String companyCd,
		String curCd,
		String exchTyp,
		String exchReserveCd,
		String exchStartDate)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// SQL�쐬
			ps = conn.getConn().prepareStatement(selectExchRateSql);
			ps.setString(1, companyCd);
			ps.setString(2, curCd);
			ps.setString(3, exchTyp);
			ps.setString(4, exchReserveCd);
			ps.setString(5, exchStartDate);
			// SQL���s
			rs = ps.executeQuery();

			// �������ʂ�0���̏ꍇ�̓G���[
			if (!rs.next()) {
				throw new DataNotFoundException("ZZ02024");
			}

			// ���\�b�h���^�[���p�f�[�^�N���X�쐬
			ExchRateStruct ers = new ExchRateStruct();
			ers.setCOMPANY_CD(rs.getString("COMPANY_CD"));
			ers.setCUR_CD(rs.getString("CUR_CD"));
			ers.setEXCH_TYP(rs.getString("EXCH_TYP"));
			ers.setEXCH_RESERVE_CD(rs.getString("EXCH_RESERVE_CD"));
			ers.setEXCH_START_DATE(rs.getString("EXCH_START_DATE"));
			ers.setEXCH_END_DATE(rs.getString("EXCH_END_DATE"));
			ers.setEXCH_RATE(rs.getString("EXCH_RATE"));

			return ers;
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
