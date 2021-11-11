/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/SbcntUnitCostControl.java,v $
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
 * �O���P�����擾���i
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:36 $
 */
public class SbcntUnitCostControl {
	/** �O���P�����擾SQL */
	private static final String selectSbcntUnitCostSql =
		"select "
			+ "  to_char(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE,'yyyy/mm/dd') as EFF_PHASE_IN_DATE, "
			+ "  to_char(M_SBCNT_UNIT_COST.SBCNT_SIZE, 'fm99999999999990.0999') as SBCNT_SIZE, "
			+ "  to_char(M_SBCNT_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, "
			+ "  to_char(M_SBCNT_UNIT_COST.UNIT_COST, 'fm99999999999990.0099') as UNIT_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.PROCESSING_COST, 'fm99999999999990.0099') as PROCESSING_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.MATERIAL_COST, 'fm99999999999990.0099') as MATERIAL_COST, "
			+ "  to_char(M_SBCNT_UNIT_COST.OTHER_OVERHEADS, 'fm99999999999990.0099') as OTHER_OVERHEADS "
			+ "from "
			+ "  M_SBCNT_UNIT_COST "
			+ "where "
			+ "  M_SBCNT_UNIT_COST.COMPANY_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.VEND_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.PLANT_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.ITEM_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.PROC_CD = ? "
			+ "  and M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE <= to_date(?, 'yyyy/mm/dd') "
			+ "  and M_SBCNT_UNIT_COST.SBCNT_SIZE <= ? "
			+ "order by "
			+ "  M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE desc, "
			+ "  M_SBCNT_UNIT_COST.SBCNT_SIZE desc ";

	/**
	 * �ʉݏ��擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private SbcntUnitCostControl() {
	}

	/**
	 * �O���P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ��i�K�{�j
	 * @param procCd �i�ڕʍ�ƃR�[�h�i�K�{�j
	 * @param startDate �n��ʒ�����i�K�{�j
	 * @param dlvDate �n��ʔ[���i�K�{�j
	 * @param size ��Ǝw�����i�K�{�j
	 * @param exchReserveCd �ב֗\��R�[�h
	 * @return �O���P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static SbcntUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String dlvDate,
		String size,
		String exchReserveCd)
		throws SQLException, DataNotFoundException {

		// ��ЃR�[�h���s���ȏꍇ			
		if (companyCd == null || companyCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �����R�[�h���s���ȏꍇ			
		if (vendCd == null || vendCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �H��R�[�h���s���ȏꍇ			
		if (plantCd == null || plantCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �i�ڔԍ����s���ȏꍇ			
		if (itemCd == null || itemCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �i�ڕʍ�ƃR�[�h���s���ȏꍇ			
		if (procCd == null || procCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �n��ʒ�������s���ȏꍇ			
		if (startDate == null || startDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �n��ʔ[�����s���ȏꍇ			
		if (dlvDate == null || dlvDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// ��Ǝw�������s���ȏꍇ			
		if (size == null || size.length() <= 0) {
			throw new IllegalArgumentException();
		}

		// �O���P�����̎擾
		SbcntUnitCostStruct sucs =
			selectSbcntUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				procCd,
				startDate,
				size);

		// ����ʉݏ��̎擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �ʉݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// �בփ��[�g���̎擾
		ExchRateStruct ers =
			ExchRateControl.getData(
				conn,
				companyCd,
				cs.getCUR_CD(),
				cs.getEXCH_TYP(),
				exchReserveCd,
				dlvDate);

		sucs.setROUND_TYP(cs.getROUND_TYP());
		sucs.setEXCH_TYP(cs.getEXCH_TYP());
		sucs.setCUR_CD(cs.getCUR_CD());
		sucs.setCUR_NAME(cs.getCUR_NAME());
		sucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		sucs.setCUR_UNIT(cs.getCUR_UNIT());
		sucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());

		sucs.setEXCH_RESERVE_CD(ers.getEXCH_RESERVE_CD());
		sucs.setEXCH_START_DATE(ers.getEXCH_START_DATE());
		sucs.setEXCH_END_DATE(ers.getEXCH_END_DATE());
		sucs.setEXCH_RATE(ers.getEXCH_RATE());

		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				sucs.getUNIT_COST(),
				size,
				sucs.getROUND_TYP(),
				sucs.getDECIMAL_FIG());
		sucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z�̐ݒ�
		sucs.setDISC_AMOUNT("0.00");
		// �l������z�̌v�Z
		String afterDiscAmount =
			AmountCalculator.calcNetAmount(
				sucs.getPUCH_ODR_AMOUNT(),
				sucs.getDISC_AMOUNT());
		sucs.setAFTER_DISC_AMOUNT(afterDiscAmount);
		// ���M�݋��z�̌v�Z
		String provisionalHomeCurAmount =
			AmountCalculator.calcHomeCurAmount(
				sucs.getAFTER_DISC_AMOUNT(),
				sucs.getEXCH_RATE(),
				sucs.getROUND_TYP(),
				hcs.getDECIMAL_FIG());
		sucs.setPROVISIONAL_HOME_CUR_AMOUNT(provisionalHomeCurAmount);

		return sucs;
	}

	/**
	 * [�O���P��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param vendCd �����R�[�h
	 * @param plantCd �H��R�[�h
	 * @param itemCd �i�ڔԍ�
	 * @param procCd �i�ڕʍ�ƃR�[�h
	 * @param startDate �n��ʒ����
	 * @param size ��Ǝw����
	 * @return �O���P�����f�[�^�N���X
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 */
	private static SbcntUnitCostStruct selectSbcntUnitCost(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String size)
		throws SQLException {

		// �X�e�[�g�����g
		PreparedStatement ps = null;
		// ���U���g�Z�b�g
		ResultSet rs = null;

		try {
			SbcntUnitCostStruct sucs = new SbcntUnitCostStruct();

			ps = (conn.getConn()).prepareStatement(selectSbcntUnitCostSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			ps.setString(3, plantCd);
			ps.setString(4, itemCd);
			ps.setString(5, procCd);
			ps.setString(6, startDate);
			ps.setString(7, size);

			rs = ps.executeQuery();

			if (!rs.next()) {
				sucs.setEFF_PHASE_IN_DATE(startDate);
				sucs.setSBCNT_SIZE(size);
				sucs.setUNIT_COST_TYP("1");
				sucs.setUNIT_COST("0.00");
				sucs.setPROCESSING_COST("0.00");
				sucs.setMATERIAL_COST("0.00");
				sucs.setOTHER_OVERHEADS("0.00");
			} else {
				sucs.setEFF_PHASE_IN_DATE(rs.getString("EFF_PHASE_IN_DATE"));
				sucs.setSBCNT_SIZE(rs.getString("SBCNT_SIZE"));
				sucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				sucs.setUNIT_COST(rs.getString("UNIT_COST"));
				sucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				sucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				sucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return sucs;
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
