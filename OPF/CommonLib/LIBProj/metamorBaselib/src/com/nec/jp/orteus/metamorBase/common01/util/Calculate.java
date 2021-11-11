//------------------------------------------------------------------------------
// (#)Calculate.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/28 新規作成 Y.Inada
// 2003/08/28 Y.Inada
//            小数判定処理、整数判定処理、大小比較処理追加
// 2003/09/01 Y.Inada
//            切上、切捨て、四捨五入実施時、
//            BigDecimalのsetScale()メソッドを使用するよう修正
//            数値文字列をフォーマットするメソッド追加
// 2003/09/04 Y.Inada
//            小数の有効桁数を指定できる割算メソッド追加
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import java.math.BigDecimal;
import java.lang.NumberFormatException;

/**
 * 演算クラス。
 *
 * @author  Y.Inada
 * @version 1.00
*/
public class Calculate
{
	/**
	  * 演算の構築。
	*/
	public Calculate(){}

	/**
	 * 足算
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 + num2)
	 */
	public static String add(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.add(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 引算
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 - num2)
	 */
	public static String subtract(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.subtract(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 掛算
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 * num2)
	 */
	public static String multiply(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.multiply(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 割算
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @param type 切上げ、切捨て、四捨五入
	 * @return 計算結果(num1 / num2)
	 */
	public static String divide(String num1, String num2, int type)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, type);
		return eliminate(result.toString());
	}

	/**
	 * 割算
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @param figure 小数の有効桁数
	 * @param type 切上げ、切捨て、四捨五入
	 * @return 計算結果(num1 / num2)
	 */
	public static String divide(String num1, String num2, int figure, int type)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, figure, type);
		return eliminate(result.toString());
	}

	/**
	 * 切上げ
	 * @param num 数字文字列
	 * @param figure 小数の有効桁数
	 */
	public static String ceil(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _CEIL);
		return eliminate(result.toString());
	}

	/**
	 * 切捨て
	 * @param num 数字文字列
	 * @param figure 小数の有効桁数
	 */
	public static String floor(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _FLOOR);
		return eliminate(result.toString());
	}

	/**
	 * 四捨五入
	 * @param num 数字文字列
	 * @param figure 小数の有効桁数
	 */
	public static String round(String num, int figure)
	{
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, _ROUND);
		return eliminate(result.toString());
	}


	/**
	 * 小数チェック
	 * @param num 数字文字列
	 * @return true:小数  false:小数以外
	 */
	public static boolean isNumeric(String num)
	{
		// 数値判定
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// 数値でない場合
		}

		int index = num.indexOf(".");			// 小数点の位置

		if(index == -1) return false;			// 整数の場合

		int length = num.length();				// 数字文字の長さ
		int s_length = length - index -1;		// 小数点からの長さ

		String s_lower = num.substring(index + 1, num.length());
		s_lower = "0." + s_lower;

		if(compare(s_lower, "0") == 0)
			return false;
		else
			return true;
	}

	/**
	 * 整数チェック
	 * @param num 数字文字列
	 * @return true:整数 false:整数以外
	 */
	public static boolean isInteger(String num)
	{
		// 数値判定
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// 数値でない場合
		}

		int index = num.indexOf(".");		// 小数点の位置

		if(index == -1){
			 return true;					// 整数の場合
		}
		else{
			int length = num.length();				// 数字文字の長さ
			int s_length = length - index -1;		// 小数点からの長さ
	
			String s_lower = num.substring(index + 1, num.length());
			s_lower = "0." + s_lower;
	
			if(compare(s_lower, "0") != 0)
				return false;
			else
				return true;
		}
	}

	/**
	 * 比較。
	 * @param num 数字文字列
	 * @return  0: num1 == num2
	 *          1: num1 > num2
	 *         -1: num1 < num2
	 */
	public static int compare(String num1, String num2)
	{
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		return b_num1.compareTo(b_num2);
	}

	/**
	 * フォーマット。
	 * @param num 数字文字列
	 * @param figure フォーマット桁数
	 * @return  フォーマット後の数字文字列
	 */
	public static String formatNumric(String num, int figure)

	{
		if(figure <= 0)
			return num;		// 有効桁数が0以下の場合、終了

		if(isInteger(num) == false && isNumeric(num) == false)
			return num;		// 数値でない場合、終了

		String str = "0.";
		for(int i = 0; i < figure; i++){
			str = str + "0";
		}

		BigDecimal b_num1 = new BigDecimal(num);
		BigDecimal b_num2 = new BigDecimal(str);
		BigDecimal result = b_num1.add(b_num2);
		return result.toString();
	}

	/**
	 * フォーマット。
	 * @param num 数字文字列
	 * @return  フォーマット後の数字文字列
	 */
	public static String formatInteger(String num)

	{
		if(isInteger(num) == false)
			return num;		// 整数でない場合、終了

		int index = num.indexOf(".");		// 小数点の位置
		if(index == -1){
			 return num;					// 小数桁がない場合
		}

		String s_upper = num.substring(0, index);		// 小数桁削除
		return s_upper;
	}


	/**
	 * 小数桁の'0'削除
	 * @param 数字文字列
	 * @return '0'削除した数字文字列
	 */
	private static String eliminate(String num)
	{
		// 小数点の位置取得
		int index = num.indexOf(".");

		if(index== -1) return num;	// 小数桁がない場合

		// 小数桁がある場合 '0'削除
		String str = new String(num);
		for(int i = num.length() - 1; i > index; i--){
			if('0' == num.charAt(i)){
				if('.' != num.charAt(i - 1))
					str = str.substring(0, str.length() - 1);
			}
			else break;
		}
		return str;
	}


	/** 切り上げ */
	public final static int _CEIL = BigDecimal.ROUND_UP;

	/** 切捨て */
	public final static int _FLOOR = BigDecimal.ROUND_DOWN;

	/** 四捨五入 */
	public final static int _ROUND = BigDecimal.ROUND_HALF_UP;

}

