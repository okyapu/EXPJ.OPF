/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/flash/Kind.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.flash;

/**
 * Flash部品のkind属性パラメータを生成するユーティリティクラスです。<br>
 * <br>
 * 現在数値項目のみ対応しており、以下の使用方法を想定しています。<br>
 * 1.{整数/小数}をデータにより切り替える数量項目<br>
 * 例：
 * <code>
 * kind=&lt;%=Kind.convertNumeric(aZZ0000000Struct.getUNIT_QTY_TYP(), Kind.Z, "14", "1", Kind.CEIL; "4");%&gt;
 * </code><br>
 * 例：
 * <code>
 * kind=&lt;%=Kind.convertNumeric(aZZ0000000Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.CEIL; 4);%&gt;
 * </code><br>
 * <br>
 * 2.{四捨五入/切り上げ/切り捨て}及び{小数桁数}をデータにより切り替える金額項目<br>
 * 例：
 * <code>
 * kind=&lt;%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, "14", "2", aZZ0000000Struct.getROUND_TYP(); aZZ0000000Struct.getDECIMAL_FIG());%&gt;
 * </code><br>
 * 例：
 * <code>
 * kind=&lt;%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aZZ0000000Struct.getROUND_TYP(); aZZ0000000Struct.getDECIMAL_FIG());%&gt;
 * </code>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:56 $
 */
public class Kind {

	/**
	 * 数値フォーマット指定 種類(1) "整数(1：整数管理)"を表す定数です。<br>
	 * 数値フォーマット指定 種類(2)との組み合わせにより、
	 * {OBT_INTEGER/OBT_INTEGER_P/OBT_INTEGER_Z}の何れかになります。
	 */
	public static final String INTEGER = "1";
	/**
	 * 数値フォーマット指定 種類(1) "小数(2：小数管理)"を表す定数です。<br>
	 * 数値フォーマット指定 種類(2)との組み合わせにより、
	 * {OBT_NUMBER/OBT_NUMBER_P/OBT_NUMBER_Z}の何れかになります。
	 */
	public static final String NUMBER = "2";

	/**
	 * 数値フォーマット指定 種類(2) "マイナス可"を表す定数です。<br>
	 * 数値フォーマット指定 種類(1)との組み合わせにより、
	 * {OBT_INTEGER/OBT_NUMBER}の何れかになります。
	 */
	public static final String N = "N";
	/**
	 * 数値フォーマット指定 種類(2) "0より大きい"を表す定数です。<br>
	 * 数値フォーマット指定 種類(1)との組み合わせにより、
	 * {OBT_INTEGER_P/OBT_NUMBER_P}の何れかになります。
	 */
	public static final String P = "P";
	/**
	 * 数値フォーマット指定 種類(2) "0以上"を表す定数です。<br>
	 * 数値フォーマット指定 種類(1)との組み合わせにより、
	 * {OBT_INTEGER_Z/OBT_NUMBER_Z}の何れかになります。
	 */
	public static final String Z = "Z";

	/**
	 * 数値フォーマット指定 オプション "四捨五入(1：四捨五入)"を表す定数です。
	 */
	public static final String ROUND = "1";
	/**
	 * 数値フォーマット指定 オプション "切り上げ(2：切り上げ)"を表す定数です。
	 */
	public static final String CEIL = "2";
	/**
	 * 数値フォーマット指定 オプション "切り捨て(3：切り捨て)"を表す定数です。
	 */
	public static final String FLOOR = "3";

	/**
	 * このクラスはstaticメソッドのみのため、
	 * デフォルトコンストラクタはprivateとしています。
	 */
	private Kind() {
	}


	/**
	 * 数値フォーマット文字列を丸め桁数なしで生成します。
	 * また、第1パラメータがINTEGERの場合、第4パラメータ以降は無視されます。
	 * @param decimalIntegerFlag 小数 or 整数
	 * @param plusMinusFlag 負数可 or 0より大きい or 0以上
	 * @param integerScale 整数桁数(String値)
	 * @param scale 小数桁数(String値)
	 * @param roundingMode 丸め区分 四捨五入 or 切り上げ or 切捨て
	 * @return 数値フォーマット文字列
	 */
	public static String convertNumeric(String decimalIntegerFlag, String plusMinusFlag, String integerScale, String scale, String roundingMode) {
		String formatString = convertNumeric(decimalIntegerFlag, plusMinusFlag, integerScale, scale, roundingMode, null);
		return formatString;
	}

	/**
	 * 数値フォーマット文字列を丸め桁数ありで生成します。
	 * また、第1パラメータがINTEGERの場合、第4パラメータ以降は無視されます。
	 * @param decimalIntegerFlag 小数 or 整数
	 * @param plusMinusFlag 負数可 or 0より大きい or 0以上
	 * @param integerScale 整数桁数(String値)
	 * @param scale 小数桁数(String値)
	 * @param roundingMode 丸め区分 四捨五入 or 切り上げ or 切捨て
	 * @param roundingScale 丸め桁数(String値)
	 * @return 数値フォーマット文字列
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
			int 丸め桁のint = Integer.parseInt(roundingScale);
			if (丸め桁のint < 0) {
				throw new IllegalArgumentException();
			}
		}

		return formatStringBuffer.toString();
	}


	/**
	 * 数値フォーマット文字列を丸め桁数なしで生成します。
	 * また、第1パラメータがINTEGERの場合、第4パラメータ以降は無視されます。
	 * @param decimalIntegerFlag 小数 or 整数
	 * @param plusMinusFlag 負数可 or 0より大きい or 0以上
	 * @param integerScale 整数桁数(int値)
	 * @param scale 小数桁数(int値)
	 * @param roundingMode 丸め区分 四捨五入 or 切り上げ or 切捨て
	 * @return 数値フォーマット文字列
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
	 * 数値フォーマット文字列を丸め桁数ありで生成します。
	 * また、第1パラメータがINTEGERの場合、第4パラメータ以降は無視されます。
	 * @param decimalIntegerFlag 小数 or 整数
	 * @param plusMinusFlag 負数可 or 0より大きい or 0以上
	 * @param integerScale 整数桁数(int値)
	 * @param scale 小数桁数(int値)
	 * @param roundingMode 丸め区分 四捨五入 or 切り上げ or 切捨て
	 * @param roundingScale 丸め桁数(int値)
	 * @return 数値フォーマット文字列
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
	 * 数値フォーマット文字列を丸め桁数ありで生成します。
	 * また、第1パラメータがINTEGERの場合、第4パラメータ以降は無視されます。
	 * @param decimalIntegerFlag 小数 or 整数
	 * @param plusMinusFlag 負数可 or 0より大きい or 0以上
	 * @param integerScale 整数桁数(int値)
	 * @param scale 小数桁数(int値)
	 * @param roundingMode 丸め区分 四捨五入 or 切り上げ or 切捨て
	 * @param roundingScale 丸め桁数(String値)
	 * @return 数値フォーマット文字列
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
