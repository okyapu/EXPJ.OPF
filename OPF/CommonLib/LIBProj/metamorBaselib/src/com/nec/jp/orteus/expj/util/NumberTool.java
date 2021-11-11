/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/expj/util/NumberTool.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberTool {

	private NumberTool() {
	}

	/**
	 * 数値文字列の末尾の0の連続を除いた小数桁数を返します。<br>
	 * 例えば・・・<br>
	 *   <code>"1.100"</code>は1桁
	 *   <code>"1.010"</code>は2桁
	 * @param num 数字文字列
	 * @return 小数桁数
	 */
	public static int getRealScale1(String num) {
		// 整数部と小数点を削り落とす
		Pattern p = Pattern.compile("^[0-9]*(\\.|$)");
		Matcher m = p.matcher(num);
		String s = m.replaceAll("");

		// 小数部の末尾の0の連続を削り落とす
		Pattern p2 = Pattern.compile("0+$");
		Matcher m2 = p2.matcher(s);
		String s2 = m2.replaceAll("");

		return s2.length();
	}

/*
	public static int getRealScale2(String numStr) {
		int dotIndex = numStr.indexOf('.');

		if (dotIndex >= 0) {
			String decimalStr = numStr.substring(dotIndex + 1, numStr.length());
			char[] decimalChars = decimalStr.toCharArray();

			for (int i = decimalChars.length; i > 0; i--) {
				if (decimalChars[i - 1] == '0') {
					continue;
				}
				return i;
			}
		}

		return 0;
	}
*/
	public static int getRealScale(String numStr) {
		int dotIndex = numStr.lastIndexOf('.');

		if (dotIndex >= 0) {
			String decimalStr = numStr.substring(dotIndex + 1, numStr.length());

			for (int i = decimalStr.length(); i > 0; i--) {
				if (decimalStr.charAt(i - 1) == '0') {
					continue;
				}
				return i;
			}
		}

		return 0;
	}
}
