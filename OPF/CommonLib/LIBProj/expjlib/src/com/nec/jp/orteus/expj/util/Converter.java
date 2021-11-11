/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/Converter.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.text.SimpleDateFormat;
import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;

/**
 * 日付データの型変換クラス
 * 　Date日付をString日付、String日付をDate日付への変換を行います。
 * 　および、String数値の丸めを行います。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:11 $
*/

public class Converter {

	/**
	 * 形式（yyyy/MM/dd）
	*/
	public final static String SLASH_DATE = "yyyy/MM/dd";

	/**
	 * 形式（yyyy/MM/dd hh:mm:ss）
	*/
	public final static String SLASH_DATE_TIME = "yyyy/MM/dd hh:mm:ss";

	/**
	 * 形式（yyyyMMdd）
	*/
	public final static String DATE = "yyyyMMdd";

	/**
	 * 形式（yyyyMMdd HH:mm:ss）
	*/
	public final static String DATE_TIME = "yyyyMMdd HH:mm:ss";

	/**
	 * 形式（yyyy/MM/dd HHmm）
	*/
	public final static String SLASH_DATE_HOUR_MINUTE = "yyyy/MM/dd HHmm";

	/**
	 * 形式（yyyy/MM/dd HH:mm）
	*/
	public final static String SLASH_DATE_HOUR_COLON_MINUTE = "yyyy/MM/dd HH:mm";
	
	/**
	 * 正の無限大に近づくように丸めるモードです。
	 * BigDecimal が正の場合は ROUND_UP のように動作し、
	 * 負の場合は ROUND_DOWN のように動作します。
	 * この丸めモードは、計算された値を減らしません。
	 */
	public final static int ROUND_CEILING = BigDecimal.ROUND_CEILING;

	/**
	 * 0 に近づくように丸めるモードです。
	 * 破棄される小数部に先行する桁を増分しません (つまり切り捨て)。
	 * この丸めモードは、計算された値の絶対値を増やしません。
	 */
	public final static int ROUND_DOWN = BigDecimal.ROUND_DOWN;

	/**
	 * 負の無限大に近づくように丸めるモードです。
	 * BigDecimal が正の場合は ROUND_DOWN のように動作し、
	 * 負の場合は ROUND_UP のように動作します。
	 * この丸めモードは、計算された値を増やしません。
	 */
	public final static int ROUND_FLOOR = BigDecimal.ROUND_FLOOR;

	/**
	 * 「もっとも近い数字」 に丸めるモードです。
	 * ただし、両隣りの数字が等距離の場合は切り捨てます。
	 * 破棄される小数部が .5 を超える場合は ROUND_UP のように動作し、
	 * それ以外の場合は ROUND_DOWN のように動作します。
	 */
	public final static int ROUND_HALF_DOWN = BigDecimal.ROUND_HALF_DOWN;

	/**
	 * 「もっとも近い数字」 に丸めるモードです。
	 * ただし、両隣りの数字が等距離の場合は偶数側に丸めます。
	 * 破棄する小数部の左辺の桁が奇数の場合は ROUND_HALF_UP のように動作し、
	 * 偶数の場合は ROUND_HALF_DOWN のように動作します。
	 * この丸めモードは、連続する計算で繰り返し適用される場合に累積エラーを最少にします。
	 */
	public final static int ROUND_HALF_EVEN = BigDecimal.ROUND_HALF_EVEN;

	/**
	 * 「もっとも近い数字」に丸めるモードです。
	 * ただし、両隣りの数字が等距離の場合は切り上げます。
	 * 破棄される小数部が .5 以上の場合は ROUND_UP のように動作し、
	 * それ以外の場合は ROUND_DOWN のように動作します。これは我々の大半が小学校で習った切り上げのことです。
	 */
	public final static int ROUND_HALF_UP = BigDecimal.ROUND_HALF_UP;

	/**
	 * 要求される演算の結果が正確であり、
	 * 丸めが必要でないことを表す丸めモードです。
	 * この丸めモードが結果が正確でない演算で指定される場合は、ArithmeticException がスローされます。
	 */
	public final static int ROUND_UNNECESSARY = BigDecimal.ROUND_UNNECESSARY;

	/**
	 * 0 から離れるように丸めるモードです。
	 * 破棄される 0 以外の小数部に先行する桁を常に増やします。
	 * この丸めモードは、計算された値の絶対値を減らしません。
	 */
	public final static int ROUND_UP = BigDecimal.ROUND_UP;

	/**
	 * Date日付を指定された形式でフォーマットします。<br>
	 * 		例：dateToStr(Date,SLASH_DATE) -> "2004/01/02"<br>
	 * 		　　dateToStr(Date,SLASH_DATE_TIME) -> "2004/01/02 03:04:05"<br>
	 * 		　　dateToStr(Date,DATE) -> "20040102"<br>
	 * 		　　dateToStr(Date,DATE_TIME) -> "20040102 03:04:05"<br>
	 * @param date 日付<br>
	 * @param type 形式（Commonクラス内定義以外の形式でも可能）<br>
	 * 		　　SLASH_DATE : "yyyy/MM/dd"<br>
	 * 		　　SLASH_DATE_TIME : "yyyy/MM/dd hh:mm:ss"<br>
	 * 		　　DATE : "yyyyMMdd"<br>
	 * 		　　DATE_TIME : "yyyyMMdd hh:mm:ss"
	 * @return	フォーマットされた日付文字列
	 */
	public static synchronized String dateToStr(Date date, String type) {
		if (date == null || type == null || type.length() == 0){
			return null;
		}
		Converter conv = new Converter();
		return conv.dateToStr2(date, type);
	}

	/**
	 * Date日付を指定された形式でフォーマットします。<br>
	 * @param date 日付<br>
	 * @param type 形式<br>
	 * @return	フォーマットされた日付文字列
	 */
	private String dateToStr2(Date date, String type) {
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}

	/**
	 * String日付を指定されたフォーマットでDate日付に変換します。<br>
	 * 		例：strToDate("2004/01/02",SLASH_DATE) -> Date<br>
	 * 		　　strToDate("2004/01/02 03:04:05",SLASH_DATE_TIME) -> Date<br>
	 * 		　　strToDate("20040102",DATE) -> Date<br>
	 * 		　　strToDate("20040102 03:04:05",DATE_TIME) -> Date<br>
	 * @param str 日付文字列<br>
	 * @param type   形式（クラス内定義以外の形式でも可能）<br>
	 * 		　　SLASH_DATE : "yyyy/MM/dd"<br>
	 * 		　　SLASH_DATE_TIME : "yyyy/MM/dd hh:mm:ss"<br>
	 * 		　　DATE : "yyyyMMdd"<br>
	 * 		　　DATE_TIME : "yyyyMMdd hh:mm:ss"
	 * @return	Date日付
	 * @throws ParseException str が フォーマットが type と一致しない場合
	 */
	public static synchronized Date strToDate(String str, String type)
			throws ParseException {
		if (str == null || str.length() == 0 || type == null || type.length() == 0){
			return null;
		}
		Converter conv = new Converter();
		return conv.strToDate2(str, type);
	}

	/**
	 * String日付を指定されたフォーマットでDate日付に変換します。<br>
	 * @param str 日付文字列<br>
	 * @param type   形式<br>
	 * @return	Date日付
	 * @throws ParseException str が フォーマットが type と一致しない場合
	 */
	private Date strToDate2(String str, String type)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.parse(str);
	}

	/**
	 * String数値を指定されたフォーマットに変換します。<br>
	 * 		例：ROUND_CEILING<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_CEILING) -> 2<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_CEILING) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_CEILING) -> 1.46<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_CEILING) -> 1.455<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_CEILING) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_CEILING) -> -1.4<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_CEILING) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_CEILING) -> -1.454<br>
	 * 		　　ROUND_DOWN<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_DOWN) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_DOWN) -> 1.4<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_DOWN) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_DOWN) -> 1.454<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_DOWN) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_DOWN) -> -1.4<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_DOWN) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_DOWN) -> -1.454<br>
	 * 		　　ROUND_FLOOR<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_FLOOR) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_FLOOR) -> 1.4<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_FLOOR) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_FLOOR) -> 1.454<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_FLOOR) -> -2<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_FLOOR) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_FLOOR) -> -1.46<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_FLOOR) -> -1.455<br>
	 * 		　　ROUND_HALF_DOWN<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_HALF_DOWN) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_HALF_DOWN) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_HALF_DOWN) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_HALF_DOWN) -> 1.454<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_HALF_DOWN) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_HALF_DOWN) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_HALF_DOWN) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_HALF_DOWN) -> -1.454<br>
	 * 		　　ROUND_HALF_DOWN<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_HALF_DOWN) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_HALF_DOWN) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_HALF_DOWN) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_HALF_DOWN) -> 1.454<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_HALF_DOWN) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_HALF_DOWN) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_HALF_DOWN) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_HALF_DOWN) -> -1.454<br>
	 * 		　　ROUND_HALF_EVEN<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_HALF_EVEN) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_HALF_EVEN) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_HALF_EVEN) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_HALF_EVEN) -> 1.454<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_HALF_EVEN) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_HALF_EVEN) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_HALF_EVEN) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_HALF_EVEN) -> -1.454<br>
	 * 		　　ROUND_HALF_UP<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_HALF_UP) -> 1<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_HALF_UP) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_HALF_UP) -> 1.45<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_HALF_UP) -> 1.455<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_HALF_UP) -> -1<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_HALF_UP) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_HALF_UP) -> -1.45<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_HALF_UP) -> -1.455<br>
	 * 		　　ROUND_UNNECESSARY<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_UNNECESSARY) -> ArithmeticException<br>
	 * 		　　　　strToDec(1.4545,4,ROUND_UNNECESSARY) -> 1.4545<br>
	 * 		　　ROUND_UP<br>
	 * 		　　　　strToDec(1.4545,0,ROUND_UP) -> 2<br>
	 * 		　　　　strToDec(1.4545,1,ROUND_UP) -> 1.5<br>
	 * 		　　　　strToDec(1.4545,2,ROUND_UP) -> 1.46<br>
	 * 		　　　　strToDec(1.4545,3,ROUND_UP) -> 1.455<br>
	 * 		　　　　strToDec(-1.4545,0,ROUND_UP) -> -2<br>
	 * 		　　　　strToDec(-1.4545,1,ROUND_UP) -> -1.5<br>
	 * 		　　　　strToDec(-1.4545,2,ROUND_UP) -> -1.46<br>
	 * 		　　　　strToDec(-1.4545,3,ROUND_UP) -> -1.455
	 * @param str 数値文字列
	 * @param scale スケール
	 * @param roundingMode   形式（適用する丸めモード）<br>
	 * 		　　ROUND_CEILING<br>
	 *  	　　ROUND_DOWN<br>
	 * 		　　ROUND_FLOOR<br>
	 * 		　　ROUND_HALF_DOWN<br>
	 * 		　　ROUND_HALF_EVEN<br>
	 * 		　　ROUND_HALF_UP<br>
	 * 		　　ROUND_UNNECESSARY<br>
	 * 		　　ROUND_UP
	 * @return       BigDecimal値
	 * @throws NullPointerException str が null の場合
	 * @throws ArithmeticException roundingMode=ROUND_UNNECESSARY で、str の丸めが必要な場合
	 */
	public static BigDecimal strToDec(String str, int scale, int roundingMode) {
		BigDecimal dec = new BigDecimal(str);
		return dec.setScale(scale, roundingMode);
	}

	/**
	 * 特殊文字変換
	 * 　& → &amp;
	 * 　< → &lt;
	 * 　> → &gt;
	 * 　" → &34;
	 * 　' → &39;
	 *  半角空白 → &nbsp;
	 * @param str 文字列
	 * @return 特殊文字修正後文字列
	 */
	public static String changeSpecialCharacter(String str){
		str = str.replaceAll("&","&amp;");
		str = str.replaceAll("<","&lt;");
		str = str.replaceAll(">","&gt;");
		str = str.replaceAll("\"","&#34;");
		str = str.replaceAll("\'","&#39;");
		str = str.replaceAll(" ","&nbsp;");
		return str;
	}
}
