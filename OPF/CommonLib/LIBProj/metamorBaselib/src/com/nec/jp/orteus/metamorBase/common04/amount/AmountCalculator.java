/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/AmountCalculator.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * ���z�v�Z���\�b�h�Q�ł��B 
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:35 $
 */
public class AmountCalculator {

	/** �ۂߋ敪�̐؂�グ��\���萔 */
	public static final String CEIL = "2";
	/** �ۂߋ敪�̐؂�̂Ă�\���萔 */
	public static final String FLOOR = "3";
	/** �ۂߋ敪�̎l�̌ܓ���\���萔 */
	public static final String ROUND = "1";
	/** �f�t�H���g�\���������� */
	private static final int FORMAT_FIGURE = 2;

	/**
	 * ���̃N���X�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private AmountCalculator() {
	}

	/**
	 * �������z���v�Z���܂��B
	 * <p>
	 * �������z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>unitCost * puchSize
	 *   <li>�v�Z�����l�������� decimalFig �ł܂��
	 *       �iroundTyp ���A�萔 CEIL �̏ꍇ�͐؂�グ�A
	 *       �萔 FLOOR �̏ꍇ�͐؂艺���A����ȊO�̏ꍇ�͎l�̌ܓ��j
	 *   <li>�܂�߂��l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param puchSize ������
	 * @param unitCost �P��
	 * @param roundTyp �������z�܂�ߋ敪
	 * @param decimalFig ��������
	 * @return �������z
	 */
	public static String calcPuchOdrAmount(
		String unitCost,
		String puchSize,
		String roundTyp,
		String decimalFig) {

		String puchOdrAmount = Calculate.multiply(unitCost, puchSize);
		puchOdrAmount = roundAmount(puchOdrAmount, roundTyp, decimalFig);
		puchOdrAmount = Calculate.formatNumric(puchOdrAmount, FORMAT_FIGURE);

		return puchOdrAmount;
	}

	/**
	 * �{�̋��z���v�Z���܂��B
	 * <p>
	 * �{�̋��z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>puchOdrAmount - discAmount
	 *   <li>�v�Z�����l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param puchOdrAmount �������z
	 * @param discAmount �l�����z 
	 * @return �{�̋��z
	 */
	public static String calcNetAmount(
		String puchOdrAmount,
		String discAmount) {

		String netAmount = Calculate.subtract(puchOdrAmount, discAmount);
		netAmount = Calculate.formatNumric(netAmount, FORMAT_FIGURE);

		return netAmount;
	}

	/**
	 * �l�����z���v�Z���܂��B
	 * <p>
	 * �l�����z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>puchOdrAmount - netAmount
	 *   <li>�v�Z�����l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param puchOdrAmount �������z
	 * @param netAmount �{�̋��z 
	 * @return �l�����z
	 */
	public static String calcDiscAmount(
		String puchOdrAmount,
		String netAmount) {

		String discAmount = Calculate.subtract(puchOdrAmount, netAmount);
		discAmount = Calculate.formatNumric(discAmount, FORMAT_FIGURE);

		return discAmount;
	}

	/**
	 * �Ŋz���v�Z���܂��B
	 * <p>
	 * �Ŋz�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>netAmount * (taxRate / 100)
	 *   <li>�v�Z�����l�������� decimalFig �ł܂��
	 *       �itaxRoundTyp ���A�萔 CEIL �̏ꍇ�͐؂�グ�A
	 *       �萔 FLOOR �̏ꍇ�͐؂艺���A����ȊO�̏ꍇ�͎l�̌ܓ��j
	 *   <li>�܂�߂��l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param netAmount �{�̋��z
	 * @param taxRate �ŗ�
	 * @param taxRoundTyp �Œ[���敪
	 * @param decimalFig ��������
	 * @return �Ŋz
	 */
	public static String calcTaxAmount(
		String netAmount,
		String taxRate,
		String taxRoundTyp,
		String decimalFig) {

		String taxAmount =
			Calculate.divide(taxRate, "100", 6, Calculate._FLOOR);

		taxAmount = Calculate.multiply(netAmount, taxAmount);
		taxAmount = roundAmount(taxAmount, taxRoundTyp, decimalFig);
		taxAmount = Calculate.formatNumric(taxAmount, FORMAT_FIGURE);

		return taxAmount;
	}

	/**
	 * �ō����z���v�Z���܂��B
	 * <p>
	 * �ō����z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>netAmount + taxAmount1 + taxAmount2 + taxAmount3
	 *   <li>�v�Z�����l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param netAmount �{�̋��z
	 * @param taxAmount1 �Ŋz1
	 * @param taxAmount2 �Ŋz2
	 * @param taxAmount3 �Ŋz3
	 * @return �ō����z
	 */
	public static String calcAmountIncludeTax(
		String netAmount,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		String amountIncludeTax = Calculate.add(netAmount, taxAmount1);
		amountIncludeTax = Calculate.add(amountIncludeTax, taxAmount2);
		amountIncludeTax = Calculate.add(amountIncludeTax, taxAmount3);
		amountIncludeTax =
			Calculate.formatNumric(amountIncludeTax, FORMAT_FIGURE);

		return amountIncludeTax;
	}

	/**
	 * �M�݋��z���v�Z���܂��B
	 * <p>
	 * �M�݋��z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>amountIncludeTax * exchRate
	 *   <li>�v�Z�����l�������� decimalFig �ł܂��
	 *       �iroundTyp ���A�萔 CEIL �̏ꍇ�͐؂�グ�A
	 *       �萔 FLOOR �̏ꍇ�͐؂艺���A����ȊO�̏ꍇ�͎l�̌ܓ��j
	 *   <li>�܂�߂��l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param amountIncludeTax �ō����z
	 * @param exchRate �בփ��[�g
	 * @param roundTyp �܂�ߋ敪
	 * @param decimalFig ��������
	 * @return �ϊ�����z
	 */
	public static String calcHomeCurAmount(
		String amountIncludeTax,
		String exchRate,
		String roundTyp,
		String decimalFig) {

		String homeCurAmount = Calculate.multiply(amountIncludeTax, exchRate);
		homeCurAmount = roundAmount(homeCurAmount, roundTyp, decimalFig);
		homeCurAmount = Calculate.formatNumric(homeCurAmount, FORMAT_FIGURE);

		return homeCurAmount;
	}

	/**
	 * �O�݋��z���v�Z���܂��B
	 * <p>
	 * �O�݋��z�͈ȉ��̎菇�Ōv�Z����܂��B
	 * <ol>
	 *   <li>homeCurAmount / exchRate
	 *   <li>�v�Z�����l�������� decimalFig �ł܂��
	 *       �iroundTyp ���A�萔 CEIL �̏ꍇ�͐؂�グ�A
	 *       �萔 FLOOR �̏ꍇ�͐؂艺���A����ȊO�̏ꍇ�͎l�̌ܓ��j
	 *   <li>�܂�߂��l��"0.00"�`���Ńt�H�[�}�b�g
	 * </ol>
	 * @param homeCurAmount �M�݋��z
	 * @param exchRate �בփ��[�g
	 * @param roundTyp �܂�ߋ敪
	 * @param decimalFig ��������
	 * @return �ϊ�����z
	 */
	public static String calcForeignCurAmount(
		String homeCurAmount,
		String exchRate,
		String roundTyp,
		String decimalFig) {

		String foreignCurAmount = null;
		if (CEIL.equals(roundTyp)) {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._CEIL);
		} else if (FLOOR.equals(roundTyp)) {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._FLOOR);
		} else {
			foreignCurAmount =
				Calculate.divide(
					homeCurAmount,
					exchRate,
					Integer.parseInt(decimalFig),
					Calculate._ROUND);
		}
		foreignCurAmount = Calculate.formatNumric(homeCurAmount, FORMAT_FIGURE);

		return foreignCurAmount;
	}

	/**
	 * ���z�̂܂�ߏ������s���܂��B
	 * <p>
	 * roundTyp ���萔 CEIL�̏ꍇ�Aamount �������� decimalFig �Ő؂�グ�A
	 * roundTyp ���萔 FLOOR �̏ꍇ�Aamount �������� decimalFig �Ő؂�̂āA
	 * roundTyp ������ȊO�̏ꍇ�Aamount �������� decimalFig �Ŏl�̌ܓ����܂��B
	 * @param amount �܂�ߑΏۋ��z
	 * @param roundTyp �܂�ߋ敪
	 * @param decimalFig �܂�ߏ�������
	 * @return �܂�ߌ���z
	 */
	public static String roundAmount(
		String amount,
		String roundTyp,
		String decimalFig) {

		String roundAmount = null;

		if (CEIL.equals(roundTyp)) {
			roundAmount = Calculate.ceil(amount, Integer.parseInt(decimalFig));
		} else if (FLOOR.equals(roundTyp)) {
			roundAmount = Calculate.floor(amount, Integer.parseInt(decimalFig));
		} else {
			roundAmount = Calculate.round(amount, Integer.parseInt(decimalFig));
		}

		return roundAmount;
	}
}
