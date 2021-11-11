/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/UnitCostControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.AE0060;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �P�����擾���i
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/02/19 08:43:09 $
 */
public class UnitCostControl {

	/** [�P��]�f�[�^�擾�p��SQL */
	private static final String selectPuchUnitCostSql =
		"select "
			+ "  to_char(M_PUCH_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, "
			+ "  to_char(M_PUCH_UNIT_COST.UNIT_COST, 'fm99999999999990.0099') as UNIT_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.PROCESSING_COST, 'fm99999999999990.0099') as PROCESSING_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.MATERIAL_COST, 'fm99999999999990.0099') as MATERIAL_COST, "
			+ "  to_char(M_PUCH_UNIT_COST.OTHER_OVERHEADS, 'fm99999999999990.0099') as OTHER_OVERHEADS "
			+ "from "
			+ "  M_PUCH_UNIT_COST "
			+ "where "
			+ "  M_PUCH_UNIT_COST.COMPANY_CD = ? "
			+ "  and M_PUCH_UNIT_COST.VEND_CD = ? "
			+ "  and M_PUCH_UNIT_COST.PLANT_CD = ? "
			+ "  and M_PUCH_UNIT_COST.ITEM_CD = ? "
			+ "  and M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
			+ "  and M_PUCH_UNIT_COST.PUCH_SIZE <= TO_NUMBER(?) "
			+ "order by "
			+ "  M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE desc, "
			+ "  M_PUCH_UNIT_COST.PUCH_SIZE desc ";

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
	
	// Add Start 20131216 fang-xf
	/** [�����c]�f�[�^���擾SQL */
	private static final String selectRlsdPuchOdrSql =
		"select"
		+ " T_RLSD_PUCH_ODR.TAX_CD as TAX_CD " 
		+ " from "
		+ " T_RLSD_PUCH_ODR "
		+ " where "
		+ " T_RLSD_PUCH_ODR.PUCH_ODR_CD = ? ";
	// Add End 20131216 fang-xf

	/**
	 * �P�����擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private UnitCostControl() {
	}

	/**
	 * �P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ�
	 * @param procCd ��ƃR�[�h
	 * @param puchOdrStartDate �����\����i�K�{�j
	 * @param puchOdrDlvDate �����[���i�K�{�j
	 * @param puchOdrQty �������i�K�{�j
	// Add Start 20131216 fang-xf
	 * @param puchOdrCd �����ԍ�
	// Add End 20131216 fang-xf
	 * @return �P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static UnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String procCd,
		String startDate,
		String dlvDate,
		// Mod Start 20131216 fang-xf
		//String size)
		String size,
		String puchOdrCd)
		// Mod End 20131216 fang-xf
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
		// �����\������s���ȏꍇ
		if (startDate == null || startDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �����[�����s���ȏꍇ			
		if (dlvDate == null || dlvDate.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// ���������s���ȏꍇ
		if (size == null || size.length() <= 0) {
			throw new IllegalArgumentException();
		}

		UnitCostStruct ucs;

		if (procCd == null || "".equals(procCd)) {
			// [�w���P��]������
			ucs = selectPuchUnitCost(conn, companyCd, vendCd, plantCd, itemCd, startDate, size);
		} else {
			// [�O���P��]������
			ucs =
				selectSbcntUnitCost(
					conn,
					companyCd,
					vendCd,
					plantCd,
					itemCd,
					procCd,
					startDate,
					size);
		}

		// �ʉݏ��f�[�^�N���X���擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �M�ݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// Mod Start 20131016 fang-xf
		// ����ŏ��f�[�^�N���X���擾
		//TaxStruct ts = TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);
		PreparedStatement ps = null;
		ResultSet rs = null;
		// [�����c].����ŃR�[�h���擾
		ps = conn.getConn().prepareStatement(selectRlsdPuchOdrSql);
		ps.setString(1, puchOdrCd);
		rs = ps.executeQuery();
		TaxStruct ts;
		// �������ʂ�0���̏ꍇ
		if(!rs.next()){
			throw new DataNotFoundException("KQ20187");
		}else{
			ts = TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,rs.getString("TAX_CD"));  
		}
		// Mod End 20131016 fang-xf

		// �ʉݏ��f�[�^��ݒ�
		ucs.setROUND_TYP(cs.getROUND_TYP());
		ucs.setEXCH_TYP(cs.getEXCH_TYP());
		ucs.setCUR_CD(cs.getCUR_CD());
		ucs.setCUR_NAME(cs.getCUR_NAME());
		ucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		ucs.setCUR_UNIT(cs.getCUR_UNIT());
		ucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// ����ŏ��f�[�^��ݒ�
		ucs.setTAX_CD(ts.getTAX_CD());
		ucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
/*
		// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
		String lowerTaxCd = ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);

		if (lowerTaxCd.equals("1")) {
*/
			ucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			ucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			ucs.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
		} else {
			ucs.setTAX_RATE_1("0.0");
			ucs.setTAX_RATE_2("0.0");
			ucs.setTAX_RATE_3("0.0");
		}
*/
		ucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
		
		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				ucs.getUNIT_COST(),
				ucs.getROUND_TYP(),
				ucs.getDECIMAL_FIG());
		ucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z
		ucs.setDISC_AMOUNT("0.00");
		// �{�̋��z
		String netAmount =
			AmountCalculator.calcNetAmount(ucs.getPUCH_ODR_AMOUNT(), ucs.getDISC_AMOUNT());
		ucs.setNET_AMOUNT(netAmount);
		
		//20090428 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {		
			// �Ŋz�P�̌v�Z
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_1(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_1(taxAmount1);
			// �Ŋz�Q�̌v�Z
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_2(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_2(taxAmount2);
			// �Ŋz�R�̌v�Z
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_RATE_3(),
					ucs.getTAX_ROUND_TYP(),
					ucs.getDECIMAL_FIG());
			ucs.setTAX_AMOUNT_3(taxAmount3);
			// �ō��݋��z�̌v�Z
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					ucs.getNET_AMOUNT(),
					ucs.getTAX_AMOUNT_1(),
					ucs.getTAX_AMOUNT_2(),
					ucs.getTAX_AMOUNT_3());
			ucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//���ł̏ꍇ �Ŋz1�`3��0�Œ� �ō����z��{�̋��z�Ƃ���
			ucs.setTAX_AMOUNT_1("0.00");
			ucs.setTAX_AMOUNT_2("0.00");
			ucs.setTAX_AMOUNT_3("0.00");
			ucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090428 MOD END

		return ucs;
	}

	/**
	 * [�P��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param vendCd �����R�[�h
	 * @param plantCd �H��R�[�h
	 * @param itemCd �i�ڔԍ�
	 * @param effPhaseInDate �P���L���J�n���t
	 * @param puchSize �T�C�Y
	 * @return �P�����f�[�^�N���X 
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 */
	private static UnitCostStruct selectPuchUnitCost(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String effPhaseInDate,
		String puchSize)
		throws SQLException, DataNotFoundException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.getConn().prepareStatement(selectPuchUnitCostSql);
			ps.setString(1, companyCd);
			ps.setString(2, vendCd);
			ps.setString(3, plantCd);
			ps.setString(4, itemCd);
			ps.setString(5, effPhaseInDate);
			ps.setString(6, puchSize);
			rs = ps.executeQuery();

			UnitCostStruct ucs = new UnitCostStruct();

			if (!rs.next()) {
				// �������ʂ�0���̏ꍇ
				ucs.setUNIT_COST_TYP("1");
				ucs.setUNIT_COST("0.00");
				ucs.setPROCESSING_COST("0.00");
				ucs.setMATERIAL_COST("0.00");
				ucs.setOTHER_OVERHEADS("0.00");
			} else {
				ucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				ucs.setUNIT_COST(rs.getString("UNIT_COST"));
				ucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				ucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				ucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return ucs;
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
	private static UnitCostStruct selectSbcntUnitCost(
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
			UnitCostStruct ucs = new UnitCostStruct();

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
				ucs.setUNIT_COST_TYP("1");
				ucs.setUNIT_COST("0.00");
				ucs.setPROCESSING_COST("0.00");
				ucs.setMATERIAL_COST("0.00");
				ucs.setOTHER_OVERHEADS("0.00");
			} else {
				ucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				ucs.setUNIT_COST(rs.getString("UNIT_COST"));
				ucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				ucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				ucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return ucs;
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
