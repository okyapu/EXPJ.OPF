/**
 *(#)Converter.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/04
 * @version 1.00
 */
package com.nec.jp.orteus.metamorBase.common.util;

import java.text.SimpleDateFormat;
import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;

public class Converter{
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
	 * 形式（yyyyMMdd hh:mm:ss）
	*/
	public final static String DATE_TIME = "yyyyMMdd hh:mm:ss";

	/**
	 * 正の無限大に近づくように丸めるモードです。 
	 */
	public final static int ROUND_CEILING = BigDecimal.ROUND_CEILING;
	/**
	 * 0 に近づくように丸めるモードです。 
	 */
	public final static int ROUND_DOWN = BigDecimal.ROUND_DOWN;
	/**
	 * 負の無限大に近づくように丸めるモードです。
	 */           
	public final static int ROUND_FLOOR = BigDecimal.ROUND_FLOOR;
	/**
	 * 「もっとも近い数字」 に丸めるモードです。 
	 */           
	public final static int ROUND_HALF_DOWN = BigDecimal.ROUND_HALF_DOWN;
	/**
	 * 「もっとも近い数字」 に丸めるモードです。 
	 */           
	public final static int ROUND_HALF_EVEN = BigDecimal.ROUND_HALF_EVEN;
	/**
	 * 「もっとも近い数字」に丸めるモードです。 
	 */           
	public final static int ROUND_HALF_UP = BigDecimal.ROUND_HALF_UP;
	/**
	 * 要求される演算の結果が正確であり、丸めが必要でないことを表す丸めモードです。
	 */           
	public final static int ROUND_UNNECESSARY = BigDecimal.ROUND_UNNECESSARY;
	/**
	 * 0 から離れるように丸めるモードです。
	 */           
	public final static int ROUND_UP = BigDecimal.ROUND_UP;
  


	/**
	 * Date日付を指定された形式でフォーマットする
	 * @param date 日付
	 * @param type 形式（Commonクラス内定義以外の形式でも可能）
     * @return     フォーマットされた日付文字列
	 */
	public static String dateToStr(Date date, String type){
		if(date == null || type == null || type.length() == 0) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}


	/**
	 * String日付を指定されたフォーマットで変換する
	 * @param str 日付文字列
	 * @param type   形式（Commonクラス内定義以外の形式でも可能）
     * @return       Date日付
	 */
	public static Date strToDate(String str,String type) throws ParseException{
		if(str == null || str.length() == 0 || type == null || type.length() == 0) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.parse(str);
	}


	/**
	 * String数値を指定されたフォーマットで変換する
	 * @param str 数値文字列
	 * @param scale スケール
	 * @param roundingMode   形式（適用する丸めモード）
     * @return       BigDecimal値
	 */
	public static BigDecimal strToDec(String str, int scale, int roundingMode){
		BigDecimal dec = new BigDecimal(str);
		return dec.setScale(scale, roundingMode);
	}
}
