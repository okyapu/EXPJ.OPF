/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/expj/sa/amount/SaAmountCalculator.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.sa.amount;

import com.nec.jp.orteus.expj.util.Calculate;

/**
 * �̔��Ǘ��p���z�v�Z���\�b�h�Q
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.1 $ $Date: 2015/09/25 05:53:17 $
 */
public class SaAmountCalculator {

	/**
	 * static���\�b�h�Q�N���X�̂��߁A�R���X�g���N�^��private�Ƃ��Ă��܂��B
	 */
	private SaAmountCalculator() {
	}

	/**
	 * ����ŃR�[�h���A�ېŕ��@�i����ŃR�[�h��3���ځj��؂�o���ĕԂ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @return �ېŕ��@�i����ŃR�[�h��3���ځj
	 */
	private static String getTaxationType(String taxCd) {
		return taxCd.substring(2, 3);
	}

	/**
	 * �ېŕ��@�i����ŃR�[�h��3���ځj���O�ł��ۂ���Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @return �O�ł̏ꍇ�� <code>true</code> ����ȊO�̏ꍇ�� <code>false</code> ��Ԃ��܂��B
	 */
	private static boolean isExternalTax(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return "1".equals(taxationType);
	}

	/**
	 * �ېŕ��@�i����ŃR�[�h��3���ځj�����ł��ۂ���Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @return ���ł̏ꍇ�� <code>true</code> ����ȊO�̏ꍇ�� <code>false</code> ��Ԃ��܂��B
	 */
	private static boolean isInternalTax(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return ("5".equals(taxationType) || "9".equals(taxationType));
	}

	/**
	 * �ېŕ��@�i����ŃR�[�h��3���ځj����ېł��ۂ���Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @return ��ېł̏ꍇ�� <code>true</code> ����ȊO�̏ꍇ�� <code>false</code> ��Ԃ��܂��B
	 */
	private static boolean isTaxfree(String taxCd) {
		String taxationType = getTaxationType(taxCd);
		return "0".equals(taxationType);
	}

	/**
	 * �p�����[�^����ɊO�őΏۋ��z��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param salesAmountExchRates ������ы��z(�M��)
	 * @return �O�őΏۋ��z
	 */
	public static String calcExternalTaxSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isExternalTax(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɓ��őΏۋ��z��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param salesAmountExchRates ������ы��z(�M��)
	 * @return ���őΏۋ��z
	 */
	public static String calcInternalTaxSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isInternalTax(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɔ�ېőΏۋ��z��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param salesAmountExchRates ������ы��z(�M��)
	 * @return ��ېőΏۋ��z
	 */
	public static String calcTaxfreeSalesAmount(String taxCd, String salesAmountExchRates) {

		if (isTaxfree(taxCd)) {
			return salesAmountExchRates;
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɐŊz��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param salesAmountExchRates ������ы��z(�M��)
	 * @param taxRate �ŗ�
	 * @param decimalFig ��������
	 * @param taxRoundTyp �Œ[���敪
	 * @return �Ŋz
	 */
	public static String calcTaxAmount(
		String taxCd,
		String salesAmountExchRates,
		String taxRate,
		String decimalFig,
		String taxRoundTyp) {

		if (isExternalTax(taxCd)) {
			int roundTyp = 0;
			if ("2".equals(taxRoundTyp)) {
				roundTyp = Calculate.CEIL;
			} else if ("3".equals(taxRoundTyp)) {
				roundTyp = Calculate.FLOOR;
			} else {
				roundTyp = Calculate.ROUND;
			}
			int fig = Integer.parseInt(decimalFig);
			String work = Calculate.multiply(salesAmountExchRates, taxRate);
			return Calculate.divide(work, "100", fig, roundTyp);
		} else if (isInternalTax(taxCd)) {
			int roundTyp = 0;
			if ("2".equals(taxRoundTyp)) {
				roundTyp = Calculate.CEIL;
			} else if ("3".equals(taxRoundTyp)) {
				roundTyp = Calculate.FLOOR;
			} else {
				roundTyp = Calculate.ROUND;
			}
			int fig = Integer.parseInt(decimalFig);
			String work = Calculate.multiply(salesAmountExchRates, taxRate);
			return Calculate.divide(work, Calculate.add("100", taxRate), fig, roundTyp);
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɏ���Ŋz�i�O�Łj��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param taxAmount1 �Ŋz1
	 * @param taxAmount2 �Ŋz2
	 * @param taxAmount3 �Ŋz3
	 * @return ����Ŋz�i�O�Łj
	 */
	public static String calcExternalTaxAmount(
		String taxCd,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		if (isExternalTax(taxCd)) {
			String work = Calculate.add(taxAmount1, taxAmount2);
			return Calculate.add(work, taxAmount3);
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɏ���Ŋz�i���Łj��Ԃ��܂��B
	 * @param taxCd ����ŃR�[�h
	 * @param taxAmount1 �Ŋz1
	 * @param taxAmount2 �Ŋz2
	 * @param taxAmount3 �Ŋz3
	 * @return ����Ŋz�i���Łj
	 */
	public static String calcInternalTaxAmount(
		String taxCd,
		String taxAmount1,
		String taxAmount2,
		String taxAmount3) {

		if (isInternalTax(taxCd)) {
			String work = Calculate.add(taxAmount1, taxAmount2);
			return Calculate.add(work, taxAmount3);
		} else {
			return "0";
		}
	}

	/**
	 * �p�����[�^����ɐŔ�������z��Ԃ��܂��B
	 * @param externalTaxSalesAmount �O�őΏۋ��z
	 * @param internalTaxSalesAmount ���őΏۋ��z
	 * @param taxfreeSalesAmount ��ېőΏۋ��z
	 * @param internalTaxAmount ����Ŋz�i���Łj
	 * @return �Ŕ�������z
	 */
	public static String calcTaxCreditSalesAmount(
		String externalTaxSalesAmount,
		String internalTaxSalesAmount,
		String taxfreeSalesAmount,
		String internalTaxAmount) {

		String work = Calculate.add(externalTaxSalesAmount, internalTaxSalesAmount);
		work = Calculate.add(work, taxfreeSalesAmount);
		return Calculate.subtract(work, internalTaxAmount);
	}
}
