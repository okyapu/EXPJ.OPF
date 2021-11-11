/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/PuchUnitCostControl.java,v $
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
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * �w���P�����擾���i
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $ $Date: 2014/02/20 14:46:18 $
 */
public class PuchUnitCostControl {

	/** [�w���P��]�f�[�^�擾�p��SQL */
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

	/**
	 * �w���P�����擾���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private PuchUnitCostControl() {
	}

	/**
	 * �P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ�
	 * @param puchOdrStartDate �����\����i�K�{�j
	 * @param puchOdrDlvDate �����[���i�K�{�j
	 * @param puchOdrQty �������i�K�{�j
	 * @param exchRserveCd �ב֗\��R�[�h
	 * @return �w���P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 * @deprecated ���̃��\�b�h�͈בփ��[�g�擾���s���Ă���A����̎d�l�ɓK���Ȃ����߁A
	 *               �g�p�����ׂ��ł͂���܂���B
	 */
	public static PuchUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String exchRserveCd)
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

		// [�����P��]������
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// �ʉݏ��f�[�^�N���X���擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �M�ݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// �בփ��[�g���f�[�^�N���X���擾
		ExchRateStruct ers =
			ExchRateControl.getData(
				conn,
				companyCd,
				cs.getCUR_CD(),
				cs.getEXCH_TYP(),
				exchRserveCd,
				dlvDate);
		// ����ŏ��f�[�^�N���X���擾
		TaxStruct ts =
			TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);

		// �ʉݏ��f�[�^��ݒ�
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());

		// �בփ��[�g���f�[�^��ݒ�
		pucs.setEXCH_RESERVE_CD(ers.getEXCH_RESERVE_CD());
		pucs.setEXCH_START_DATE(ers.getEXCH_START_DATE());
		pucs.setEXCH_END_DATE(ers.getEXCH_END_DATE());
		pucs.setEXCH_RATE(ers.getEXCH_RATE());
		
		// ����ŏ��f�[�^��ݒ�
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
		//20090417 MOD START
		//TAX_CD�̒l�Ɋւ�炸�ŗ��擾
/*
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
*/
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());
/*
		} else {
			pucs.setTAX_RATE_1("0.0");
			pucs.setTAX_RATE_2("0.0");
			pucs.setTAX_RATE_3("0.0");
		}
*/
		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z
		pucs.setDISC_AMOUNT("0.00");
		// �{�̋��z
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		//20090417 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			// �Ŋz�P�̌v�Z
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// �Ŋz�Q�̌v�Z
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// �Ŋz�R�̌v�Z
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// �ō��݋��z�̌v�Z
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//���ł̏ꍇ �Ŋz1�`3��0�Œ� �ō����z��{�̋��z�Ƃ���
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090417 MOD END
		// �M�݋��z�̌v�Z
		String homeCurAmount =
			AmountCalculator.calcHomeCurAmount(
				pucs.getAMOUNT_INCLUDE_TAX(),
				pucs.getEXCH_RATE(),
				pucs.getROUND_TYP(),
				hcs.getDECIMAL_FIG());
		pucs.setHOME_CUR_AMOUNT(homeCurAmount);

		return pucs;
	}

	/**
	 * �P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ�
	 * @param puchOdrStartDate �����\����i�K�{�j
	 * @param puchOdrDlvDate �����[���i�K�{�j
	 * @param puchOdrQty �������i�K�{�j
	 * @return �w���P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static PuchUnitCostStruct getData(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size)
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

		// [�����P��]������
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// �ʉݏ��f�[�^�N���X���擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �M�ݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// ����ŏ��f�[�^�N���X���擾
		TaxStruct ts =
			TaxControl.getData(conn, companyCd, vendCd, itemCd, dlvDate);

		// �ʉݏ��f�[�^��ݒ�
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// ����ŏ��f�[�^��ݒ�
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
		//20090417 MOD START
		//TAX_CD�̒l�Ɋւ�炸�ŗ��擾
		/*
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
		*/
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());
		/*
		} else {
			pucs.setTAX_RATE_1("0.0");
			pucs.setTAX_RATE_2("0.0");
			pucs.setTAX_RATE_3("0.0");
		}
		*/
		//20090417 MOD END
		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z
		pucs.setDISC_AMOUNT("0.00");
		// �{�̋��z
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		//20090417 MOD START
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			//�O�ł̏ꍇ
			// �Ŋz�P�̌v�Z
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// �Ŋz�Q�̌v�Z
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// �Ŋz�R�̌v�Z
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// �ō��݋��z�̌v�Z
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//���ł̏ꍇ �Ŋz1�`3��0�Œ� �ō����z��{�̋��z�Ƃ���
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		//20090417 MOD END
		return pucs;
	}

	//Add  Start 20131224 song-yy
/**
	 * �P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ�
	 * @param puchOdrStartDate �����\����i�K�{�j
	 * @param puchOdrDlvDate �����[���i�K�{�j
	 * @param puchOdrQty �������i�K�{�j
	 * @param taxCd ����ŃR�[�h�i�K�{�j
	 * @return �w���P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static PuchUnitCostStruct getDataTax(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String taxCd)
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
		
		// [�����P��]������
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// �ʉݏ��f�[�^�N���X���擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �M�ݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		// ����ŏ��f�[�^�N���X���擾
		TaxStruct ts =
			TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,taxCd);

		// �ʉݏ��f�[�^��ݒ�
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// ����ŏ��f�[�^��ݒ�
		pucs.setTAX_CD(ts.getTAX_CD());
		pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B

		//TAX_CD�̒l�Ɋւ�炸�ŗ��擾
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());


		pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());

		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z
		pucs.setDISC_AMOUNT("0.00");
		// �{�̋��z
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		String lowerTaxCd =
			ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
		if (lowerTaxCd.equals("1")) {
			//�O�ł̏ꍇ
			// �Ŋz�P�̌v�Z
			String taxAmount1 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_1(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_1(taxAmount1);
			// �Ŋz�Q�̌v�Z
			String taxAmount2 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_2(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_2(taxAmount2);
			// �Ŋz�R�̌v�Z
			String taxAmount3 =
				AmountCalculator.calcTaxAmount(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_RATE_3(),
					pucs.getTAX_ROUND_TYP(),
					pucs.getDECIMAL_FIG());
			pucs.setTAX_AMOUNT_3(taxAmount3);
			// �ō��݋��z�̌v�Z
			String amountIncludeTax =
				AmountCalculator.calcAmountIncludeTax(
					pucs.getNET_AMOUNT(),
					pucs.getTAX_AMOUNT_1(),
					pucs.getTAX_AMOUNT_2(),
					pucs.getTAX_AMOUNT_3());
			pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
		}else{
			//���ł̏ꍇ �Ŋz1�`3��0�Œ� �ō����z��{�̋��z�Ƃ���
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		return pucs;
	}
	
	/**
	 * �P�������擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h�i�K�{�j
	 * @param vendCd �����R�[�h�i�K�{�j
	 * @param plantCd �H��R�[�h�i�K�{�j
	 * @param itemCd �i�ڔԍ�
	 * @param puchOdrStartDate �����\����i�K�{�j
	 * @param puchOdrDlvDate �����[���i�K�{�j
	 * @param puchOdrQty �������i�K�{�j
	 * @param taxCd ����ŃR�[�h�iNULL�j
	 * @return �w���P�����f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
	 */
	public static PuchUnitCostStruct getDataTax0(
		IDbConnection conn,
		String companyCd,
		String vendCd,
		String plantCd,
		String itemCd,
		String startDate,
		String dlvDate,
		String size,
		String taxCd)
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
		
		// [�����P��]������
		PuchUnitCostStruct pucs =
			selectPuchUnitCost(
				conn,
				companyCd,
				vendCd,
				plantCd,
				itemCd,
				startDate,
				size);

		// �ʉݏ��f�[�^�N���X���擾
		CurStruct cs = CurControl.getData(conn, companyCd, vendCd);
		// �M�ݏ��f�[�^�N���X���擾
		HomeCurStruct hcs = HomeCurControl.getData(conn);
		
		// ����ŏ��f�[�^�N���X���擾
		TaxStruct ts = new TaxStruct();
		if(taxCd != null && !"".equals(taxCd)){
			ts = TaxControl.getDataTax(conn, companyCd, vendCd, itemCd, dlvDate,taxCd);
		}

		// �ʉݏ��f�[�^��ݒ�
		pucs.setROUND_TYP(cs.getROUND_TYP());
		pucs.setEXCH_TYP(cs.getEXCH_TYP());
		pucs.setCUR_CD(cs.getCUR_CD());
		pucs.setCUR_NAME(cs.getCUR_NAME());
		pucs.setCUR_SYMBOL(cs.getCUR_SYMBOL());
		pucs.setCUR_UNIT(cs.getCUR_UNIT());
		pucs.setDECIMAL_FIG(cs.getDECIMAL_FIG());
		// ����ŏ��f�[�^��ݒ�
		if(taxCd != null && !"".equals(taxCd)){
			pucs.setTAX_CD(ts.getTAX_CD());
			pucs.setTAX_APPLY_TYP(ts.getTAX_APPLY_TYP());
		

		// TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B

		//TAX_CD�̒l�Ɋւ�炸�ŗ��擾
			pucs.setTAX_RATE_1(ts.getTAX_RATE_1());
			pucs.setTAX_RATE_2(ts.getTAX_RATE_2());
			pucs.setTAX_RATE_3(ts.getTAX_RATE_3());


			pucs.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
		}else{
			pucs.setTAX_CD("");
			pucs.setTAX_APPLY_TYP("2");
			pucs.setTAX_RATE_1("0");
			pucs.setTAX_RATE_2("0");
			pucs.setTAX_RATE_3("0");
			pucs.setTAX_ROUND_TYP("1");
		}
		// �������z�̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				size,
				pucs.getUNIT_COST(),
				pucs.getROUND_TYP(),
				pucs.getDECIMAL_FIG());
		pucs.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// �l�����z
		pucs.setDISC_AMOUNT("0.00");
		// �{�̋��z
		String netAmount =
			AmountCalculator.calcNetAmount(
				pucs.getPUCH_ODR_AMOUNT(),
				pucs.getDISC_AMOUNT());
		pucs.setNET_AMOUNT(netAmount);
		
		if(taxCd != null && !"".equals(taxCd)){
			String lowerTaxCd =
				ts.getTAX_CD().substring(ts.getTAX_CD().length() - 1);
			if (lowerTaxCd.equals("1")) {
				//�O�ł̏ꍇ
				// �Ŋz�P�̌v�Z
				String taxAmount1 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_1(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_1(taxAmount1);
				// �Ŋz�Q�̌v�Z
				String taxAmount2 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_2(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_2(taxAmount2);
				// �Ŋz�R�̌v�Z
				String taxAmount3 =
					AmountCalculator.calcTaxAmount(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_RATE_3(),
						pucs.getTAX_ROUND_TYP(),
						pucs.getDECIMAL_FIG());
				pucs.setTAX_AMOUNT_3(taxAmount3);
				// �ō��݋��z�̌v�Z
				String amountIncludeTax =
					AmountCalculator.calcAmountIncludeTax(
						pucs.getNET_AMOUNT(),
						pucs.getTAX_AMOUNT_1(),
						pucs.getTAX_AMOUNT_2(),
						pucs.getTAX_AMOUNT_3());
				pucs.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			}else{
				//���ł̏ꍇ �Ŋz1�`3��0�Œ� �ō����z��{�̋��z�Ƃ���
				pucs.setTAX_AMOUNT_1("0.00");
				pucs.setTAX_AMOUNT_2("0.00");
				pucs.setTAX_AMOUNT_3("0.00");
				pucs.setAMOUNT_INCLUDE_TAX(netAmount);
			}
		}else{
			pucs.setTAX_AMOUNT_1("0.00");
			pucs.setTAX_AMOUNT_2("0.00");
			pucs.setTAX_AMOUNT_3("0.00");
			pucs.setAMOUNT_INCLUDE_TAX(netAmount);
		}
		return pucs;
	}
//Add  End 20131224 song-yy
	/**
	 * [�w���P��]����
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param companyCd ��ЃR�[�h
	 * @param vendCd �����R�[�h
	 * @param plantCd �H��R�[�h
	 * @param itemCd �i�ڔԍ�
	 * @param effPhaseInDate �w���P���L���J�n���t
	 * @param puchSize �T�C�Y
	 * @return �w���P�����f�[�^�N���X 
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 */
	private static PuchUnitCostStruct selectPuchUnitCost(
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

			PuchUnitCostStruct pucs = new PuchUnitCostStruct();

			if (!rs.next()) {
				// �������ʂ�0���̏ꍇ
				pucs.setUNIT_COST_TYP("1");
				pucs.setUNIT_COST("0.00");
				pucs.setPROCESSING_COST("0.00");
				pucs.setMATERIAL_COST("0.00");
				pucs.setOTHER_OVERHEADS("0.00");
			} else {
				pucs.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				pucs.setUNIT_COST(rs.getString("UNIT_COST"));
				pucs.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				pucs.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				pucs.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));
			}

			return pucs;
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
