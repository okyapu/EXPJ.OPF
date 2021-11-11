/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/flash/Kind.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.flash;

/**
 * Flash���i��kind�����p�����[�^�𐶐����郆�[�e�B���e�B�N���X�ł��B<br>
 * <br>
 * ���ݐ��l���ڂ̂ݑΉ����Ă���A�ȉ��̎g�p���@��z�肵�Ă��܂��B<br>
 * 1.{����/����}���f�[�^�ɂ��؂�ւ��鐔�ʍ���<br>
 * ��F
 * <code>
 * kind=&lt;%=Kind.convertNumeric(aZZ0000000Struct.getUNIT_QTY_TYP(), Kind.Z, "14", "1", Kind.CEIL; "4");%&gt;
 * </code><br>
 * ��F
 * <code>
 * kind=&lt;%=Kind.convertNumeric(aZZ0000000Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.CEIL; 4);%&gt;
 * </code><br>
 * <br>
 * 2.{�l�̌ܓ�/�؂�グ/�؂�̂�}�y��{��������}���f�[�^�ɂ��؂�ւ�����z����<br>
 * ��F
 * <code>
 * kind=&lt;%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, "14", "2", aZZ0000000Struct.getROUND_TYP(); aZZ0000000Struct.getDECIMAL_FIG());%&gt;
 * </code><br>
 * ��F
 * <code>
 * kind=&lt;%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aZZ0000000Struct.getROUND_TYP(); aZZ0000000Struct.getDECIMAL_FIG());%&gt;
 * </code>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:56 $
 */
public class Kind {

	/**
	 * ���l�t�H�[�}�b�g�w�� ���(1) "����(1�F�����Ǘ�)"��\���萔�ł��B<br>
	 * ���l�t�H�[�}�b�g�w�� ���(2)�Ƃ̑g�ݍ��킹�ɂ��A
	 * {OBT_INTEGER/OBT_INTEGER_P/OBT_INTEGER_Z}�̉��ꂩ�ɂȂ�܂��B
	 */
	public static final String INTEGER = "1";
	/**
	 * ���l�t�H�[�}�b�g�w�� ���(1) "����(2�F�����Ǘ�)"��\���萔�ł��B<br>
	 * ���l�t�H�[�}�b�g�w�� ���(2)�Ƃ̑g�ݍ��킹�ɂ��A
	 * {OBT_NUMBER/OBT_NUMBER_P/OBT_NUMBER_Z}�̉��ꂩ�ɂȂ�܂��B
	 */
	public static final String NUMBER = "2";

	/**
	 * ���l�t�H�[�}�b�g�w�� ���(2) "�}�C�i�X��"��\���萔�ł��B<br>
	 * ���l�t�H�[�}�b�g�w�� ���(1)�Ƃ̑g�ݍ��킹�ɂ��A
	 * {OBT_INTEGER/OBT_NUMBER}�̉��ꂩ�ɂȂ�܂��B
	 */
	public static final String N = "N";
	/**
	 * ���l�t�H�[�}�b�g�w�� ���(2) "0���傫��"��\���萔�ł��B<br>
	 * ���l�t�H�[�}�b�g�w�� ���(1)�Ƃ̑g�ݍ��킹�ɂ��A
	 * {OBT_INTEGER_P/OBT_NUMBER_P}�̉��ꂩ�ɂȂ�܂��B
	 */
	public static final String P = "P";
	/**
	 * ���l�t�H�[�}�b�g�w�� ���(2) "0�ȏ�"��\���萔�ł��B<br>
	 * ���l�t�H�[�}�b�g�w�� ���(1)�Ƃ̑g�ݍ��킹�ɂ��A
	 * {OBT_INTEGER_Z/OBT_NUMBER_Z}�̉��ꂩ�ɂȂ�܂��B
	 */
	public static final String Z = "Z";

	/**
	 * ���l�t�H�[�}�b�g�w�� �I�v�V���� "�l�̌ܓ�(1�F�l�̌ܓ�)"��\���萔�ł��B
	 */
	public static final String ROUND = "1";
	/**
	 * ���l�t�H�[�}�b�g�w�� �I�v�V���� "�؂�グ(2�F�؂�グ)"��\���萔�ł��B
	 */
	public static final String CEIL = "2";
	/**
	 * ���l�t�H�[�}�b�g�w�� �I�v�V���� "�؂�̂�(3�F�؂�̂�)"��\���萔�ł��B
	 */
	public static final String FLOOR = "3";

	/**
	 * ���̃N���X��static���\�b�h�݂̂̂��߁A
	 * �f�t�H���g�R���X�g���N�^��private�Ƃ��Ă��܂��B
	 */
	private Kind() {
	}


	/**
	 * ���l�t�H�[�}�b�g��������ۂߌ����Ȃ��Ő������܂��B
	 * �܂��A��1�p�����[�^��INTEGER�̏ꍇ�A��4�p�����[�^�ȍ~�͖�������܂��B
	 * @param decimalIntegerFlag ���� or ����
	 * @param plusMinusFlag ������ or 0���傫�� or 0�ȏ�
	 * @param integerScale ��������(String�l)
	 * @param scale ��������(String�l)
	 * @param roundingMode �ۂߋ敪 �l�̌ܓ� or �؂�グ or �؎̂�
	 * @return ���l�t�H�[�}�b�g������
	 */
	public static String convertNumeric(String decimalIntegerFlag, String plusMinusFlag, String integerScale, String scale, String roundingMode) {
		String formatString = convertNumeric(decimalIntegerFlag, plusMinusFlag, integerScale, scale, roundingMode, null);
		return formatString;
	}

	/**
	 * ���l�t�H�[�}�b�g��������ۂߌ�������Ő������܂��B
	 * �܂��A��1�p�����[�^��INTEGER�̏ꍇ�A��4�p�����[�^�ȍ~�͖�������܂��B
	 * @param decimalIntegerFlag ���� or ����
	 * @param plusMinusFlag ������ or 0���傫�� or 0�ȏ�
	 * @param integerScale ��������(String�l)
	 * @param scale ��������(String�l)
	 * @param roundingMode �ۂߋ敪 �l�̌ܓ� or �؂�グ or �؎̂�
	 * @param roundingScale �ۂߌ���(String�l)
	 * @return ���l�t�H�[�}�b�g������
	 */
	public static String convertNumeric(
		String decimalIntegerFlag,
		String plusMinusFlag,
		String integerScale,
		String scale,
		String roundingMode,
		String roundingScale) {

		StringBuffer formatStringBuffer = new StringBuffer();

		if (INTEGER.equals(decimalIntegerFlag)) {
			formatStringBuffer.append("OBT_INTEGER");
		} else if (NUMBER.equals(decimalIntegerFlag)) {
			formatStringBuffer.append("OBT_NUMBER");
		} else {
			throw new IllegalArgumentException();
		}

		if (N.equals(plusMinusFlag)) {

		} else if (P.equals(plusMinusFlag)) {
			formatStringBuffer.append("_P");
		} else if (Z.equals(plusMinusFlag)) {
			formatStringBuffer.append("_Z");
		} else {
			throw new IllegalArgumentException();
		}

		formatStringBuffer.append(";");

		int integerInt = Integer.parseInt(integerScale);
		if (integerInt < 0) {
			throw new IllegalArgumentException();
		}
		formatStringBuffer.append(integerScale);

		if (INTEGER.equals(decimalIntegerFlag)) {
			return formatStringBuffer.toString();
		}

		formatStringBuffer.append(".");

		int decimalInt = Integer.parseInt(scale);
		if (decimalInt < 0) {
			throw new IllegalArgumentException();
		}
		formatStringBuffer.append(scale);

		formatStringBuffer.append(";");

		if (ROUND.equals(roundingMode)) {
			formatStringBuffer.append("ROUND");
		} else if (CEIL.equals(roundingMode)) {
			formatStringBuffer.append("CEIL");
		} else if (FLOOR.equals(roundingMode)) {
			formatStringBuffer.append("FLOOR");
		} else {
			throw new IllegalArgumentException();
		}

		if (roundingScale != null) {
			formatStringBuffer.append(";");

			formatStringBuffer.append(roundingScale);
			int �ۂߌ���int = Integer.parseInt(roundingScale);
			if (�ۂߌ���int < 0) {
				throw new IllegalArgumentException();
			}
		}

		return formatStringBuffer.toString();
	}


	/**
	 * ���l�t�H�[�}�b�g��������ۂߌ����Ȃ��Ő������܂��B
	 * �܂��A��1�p�����[�^��INTEGER�̏ꍇ�A��4�p�����[�^�ȍ~�͖�������܂��B
	 * @param decimalIntegerFlag ���� or ����
	 * @param plusMinusFlag ������ or 0���傫�� or 0�ȏ�
	 * @param integerScale ��������(int�l)
	 * @param scale ��������(int�l)
	 * @param roundingMode �ۂߋ敪 �l�̌ܓ� or �؂�グ or �؎̂�
	 * @return ���l�t�H�[�}�b�g������
	 */
	public static String convertNumeric(String decimalIntegerFlag, String plusMinusFlag, int integerScale, int scale, String roundingMode) {
		String formatString = convertNumeric(decimalIntegerFlag,
											 plusMinusFlag,
											 String.valueOf(integerScale),
											 String.valueOf(scale),
											 roundingMode,
											 null);
		return formatString;
	}

	/**
	 * ���l�t�H�[�}�b�g��������ۂߌ�������Ő������܂��B
	 * �܂��A��1�p�����[�^��INTEGER�̏ꍇ�A��4�p�����[�^�ȍ~�͖�������܂��B
	 * @param decimalIntegerFlag ���� or ����
	 * @param plusMinusFlag ������ or 0���傫�� or 0�ȏ�
	 * @param integerScale ��������(int�l)
	 * @param scale ��������(int�l)
	 * @param roundingMode �ۂߋ敪 �l�̌ܓ� or �؂�グ or �؎̂�
	 * @param roundingScale �ۂߌ���(int�l)
	 * @return ���l�t�H�[�}�b�g������
	 */
	public static String convertNumeric(
		String decimalIntegerFlag,
		String plusMinusFlag,
		int integerScale,
		int scale,
		String roundingMode,
		int roundingScale) {

		String formatString = convertNumeric(decimalIntegerFlag,
											 plusMinusFlag,
											 String.valueOf(integerScale),
											 String.valueOf(scale),
											 roundingMode,
											 String.valueOf(roundingScale));
		return formatString;

	}

	/**
	 * ���l�t�H�[�}�b�g��������ۂߌ�������Ő������܂��B
	 * �܂��A��1�p�����[�^��INTEGER�̏ꍇ�A��4�p�����[�^�ȍ~�͖�������܂��B
	 * @param decimalIntegerFlag ���� or ����
	 * @param plusMinusFlag ������ or 0���傫�� or 0�ȏ�
	 * @param integerScale ��������(int�l)
	 * @param scale ��������(int�l)
	 * @param roundingMode �ۂߋ敪 �l�̌ܓ� or �؂�グ or �؎̂�
	 * @param roundingScale �ۂߌ���(String�l)
	 * @return ���l�t�H�[�}�b�g������
	 */
	public static String convertNumeric(
		String decimalIntegerFlag,
		String plusMinusFlag,
		int integerScale,
		int scale,
		String roundingMode,
		String roundingScale) {

		String formatString = convertNumeric(decimalIntegerFlag,
											 plusMinusFlag,
											 String.valueOf(integerScale),
											 String.valueOf(scale),
											 roundingMode,
											 roundingScale);
		return formatString;

	}

}
