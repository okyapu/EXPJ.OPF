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
	 * ���l������̖�����0�̘A��������������������Ԃ��܂��B<br>
	 * �Ⴆ�΁E�E�E<br>
	 *   <code>"1.100"</code>��1��
	 *   <code>"1.010"</code>��2��
	 * @param num ����������
	 * @return ��������
	 */
	public static int getRealScale1(String num) {
		// �������Ə����_����藎�Ƃ�
		Pattern p = Pattern.compile("^[0-9]*(\\.|$)");
		Matcher m = p.matcher(num);
		String s = m.replaceAll("");

		// �������̖�����0�̘A������藎�Ƃ�
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
