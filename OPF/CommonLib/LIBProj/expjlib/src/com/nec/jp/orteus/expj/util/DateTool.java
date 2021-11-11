/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/DateTool.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日付文字列のユーティリティクラス
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
 */
public class DateTool {

	/**
	 * このクラスはstaticメソッドのみのであり、インスタンス化をさせないために
	 * デフォルトコンストラクタをprivateとしています。
	 */
	private DateTool() {
	}

	/**
	 * "yyyy/MM/dd"形式の日付文字列を比較します。
	 * @param dateString1 日付文字列１
	 * @param dateString2 日付文字列２
	 * @return 日付文字列１ ＝ 日付文字列２ の場合は 0を戻す。日付文字列１ ＜ 日付文字列２ の場合は 0 より小さい値を戻す。日付文字列１ ＞ 日付文字列２ の場合は 0 より大きい値を戻す。
	 * @throws ParseException パラメータが日付文字列ではない。
	 */
	public static int compareYMD(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);

		return date1.compareTo(date2);
	}

	/**
	 * "yyyy/MM"形式の日付文字列を比較します。
	 * @param dateString1 日付文字列１
	 * @param dateString2 日付文字列２
	 * @return 日付文字列１ ＝ 日付文字列２ の場合は 0を戻す。日付文字列１ ＜ 日付文字列２ の場合は 0 より小さい値を戻す。日付文字列１ ＞ 日付文字列２ の場合は 0 より大きい値を戻す。
	 * @throws ParseException パラメータが日付文字列ではない。
	 */
	public static int compareYM(String dateString1, String dateString2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM");

		Date date1 = sdf.parse(dateString1);
		Date date2 = sdf.parse(dateString2);

		return date1.compareTo(date2);
	}

	/**
	 * 日付文字列に指定日数を加算します。
	 * @param dateString 日付文字列
	 * @param amountString 指定日数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String addDay(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.DATE, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * 日付文字列から指定日数を減算します。
	 * @param dateString 日付文字列
	 * @param amountString 日数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String subtractDay(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.DATE, amount * -1);

		return sdf.format(calendar.getTime());
	}

	/**
	 * 日付文字列に指定月数を加算します。
	 * @param dateString 日付文字列
	 * @param amountString 指定月数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String addMonth(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.MONTH, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * 日付文字列から指定月数を減算します。
	 * @param dateString 日付文字列
	 * @param amountString 月数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String subtractMonth(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.MONTH, amount * -1);

		return sdf.format(calendar.getTime());
	}

	/**
	 * 日付文字列に指定年数を加算します。
	 * @param dateString 日付文字列
	 * @param amountString 年数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String addYear(String dateString, String amountString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.YEAR, amount);

		return sdf.format(calendar.getTime());
	}

	/**
	 * 日付文字列から指定年数を減算します。
	 * @param dateString 日付文字列
	 * @param amountString 年数
	 * @return 演算結果日付文字列
	 * @throws ParseException 日付文字列が不正な場合
	 */
	public static String subtractYear(String dateString, String amountString)
		throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date date = sdf.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int amount = Integer.parseInt(amountString);
		calendar.add(Calendar.YEAR, amount * -1);

		return sdf.format(calendar.getTime());
	}
}
