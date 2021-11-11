/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/Calculate.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import java.math.BigDecimal;

/**
 * 演算クラス
 * 文字列の演算を行います。
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2011/03/31 05:34:42 $
*/

public class Calculate {

	/**
	 * 切り上げ
	 */
	public final static int CEIL = BigDecimal.ROUND_UP;

	/**
	 * 切捨て
	 */
	public final static int FLOOR = BigDecimal.ROUND_DOWN;

	/**
	 * 四捨五入
	 */
	public final static int ROUND = BigDecimal.ROUND_HALF_UP;

	/**
	 * 演算の構築。
	*/
	public Calculate() {}

	/**
	 * 足算  num1 と num2 を、数値として足算し、結果を数字文字列として返します。<br>
	 *      例： add("10","1.2") -> "11.2"
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 + num2)
	 * @throws NullPointerException num1またはnum2 が null の場合
	 * @throws NumberFormatException num1またはnum2 が 数字以外の場合
	 */
	public static String add(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.add(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 引算　num1 より num2 を、数値として引算を行い、結果を数字文字列として返します。<br>
	 * 		例：  subtract("10","2.1") -> "7.9"
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 - num2)
	 * @throws NullPointerException num1またはnum2 が null の場合
	 * @throws NumberFormatException num1またはnum2 が 数字以外の場合

	 */
	public static String subtract(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.subtract(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 掛算　num1 と num2 を、数値として掛算を行い、結果を数字文字列として返します。<br>
	 * 		例：   multiply("0.1","3") -> "0.3"
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return 計算結果(num1 * num2)
	 * @throws NullPointerException num1またはnum2 が null の場合
	 * @throws NumberFormatException num1またはnum2 が 数字以外の場合
	 */
	public static String multiply(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.multiply(b_num2);
		return eliminate(result.toString());
	}

	/**
	 * 割算　num1 を num2 で、数値として割算を行い、結果を数字文字列として返します。<br>
	 * type が、切上げ(CEIL)の時は、小数点第１桁目を切り上げます。<br>
	 * 切捨て(FLOOR)の時は、少数点第１桁目を切り捨てます。<br>
	 * 四捨五入(ROUND)の時は、小数点第１桁目を四捨五入します。<br>
	 * 		例：　　divide("14","10",CEIL) -> "2"<br>
	 * 		　　　　divide("15","10",FLOOR) -> "1"<br>
	 * 		　　　　divide("15","10",ROUND) -> "2"<br>
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @param type 切上げ(CEIL)、切捨て(FLOOR)、四捨五入(ROUND)
	 * @return 計算結果(num1 / num2)
	 * @throws NullPointerException num1またはnum2 が null の場合
	 * @throws NumberFormatException num1またはnum2 が 数字以外の場合
	 */
	public static String divide(String num1, String num2, int type) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, type);
		return eliminate(result.toString());
	}

	/**
	 * 割算num1 を num2 で、数値として割算を行い、結果を数字文字列として返します。<br>
	 * type が、切上げ(CEIL)の時は、figure(小数の有効桁数)の桁を切り上げます。<br>
	 * 切捨て(FLOOR)の時は、figure(小数の有効桁数)の桁を切り捨てます。<br>
	 * 四捨五入(ROUND)の時は、figure(小数の有効桁数)の桁を四捨五入します。<br>
	 * 		例：　　divide("14.5","10",1,CEIL) -> "1.5"<br>
	 * 		　　　　divide("14.5","10",1,FLOOR) -> "1.4"<br>
	 * 		　　　　divide("14.5","10",1,ROUND) -> "1.5"<br>
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @param figure 小数の有効桁数 0以上の有効な値
	 * @param type 切上げ(CEIL)、切捨て(FLOOR)、四捨五入(ROUND)
	 * @return 計算結果(num1 / num2)
	 * @throws NullPointerException num1またはnum2 が null の場合
	 * @throws NumberFormatException num1またはnum2 が 数字以外の場合
	 * @throws ArithmeticException - num2 が 0 の場合 または figure が 0 より小さい場合
	 */
	public static String divide(String num1, String num2, int figure, int type) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		BigDecimal result = b_num1.divide(b_num2, figure, type);
		return eliminate(result.toString());
	}

	/**
	 * 切上げ　num を figure(小数の有効桁数) で、切上げします。<br>
	 * 		例：ceil("1.12",0) -> "2"<br>
	 * 		　　ceil("1.12",1) -> "1.2"<br>
	 * @param num 数字文字列　0以上の有効な数値
	 * @param figure 小数の有効桁数
	 * @throws NullPointerException num が null の場合
	 * @throws NumberFormatException num が数字以外の場合
	 * @throws ArithmeticException figure が 0 より小さい場合
	 */
	public static String ceil(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, CEIL);
		return eliminate(result.toString());
	}

	/**
	 * 切捨て　num を figure(小数の有効桁数) で、切捨てします。<br>
	 * 		例：floor("1.12",0) -> "1"<br>
	 * 		　　floor("1.12",1) -> "1.1"<br>
	 * @param num 数字文字列
	 * @param figure 小数の有効桁数　0以上の有効な数値
	 * @throws NullPointerException num が null の場合
	 * @throws NumberFormatException num が数字以外の場合
	 * @throws ArithmeticException figure が 0 より小さい場合
	 */
	public static String floor(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, FLOOR);
		return eliminate(result.toString());
	}

	/**
	 * 四捨五入　num を figure(小数の有効桁数) で、四捨五入します。<br>
	 * 		例：round("1.454",0) -> "1"<br>
	 * 		　　round("1.454",1) -> "1.5"<br>
	 * 		　　round("1.454",2) -> "1.45"<br>
	 * @param num 数字文字列
	 * @param figure 小数の有効桁数　0以上の有効な数値
	 * @throws NullPointerException num が null の場合
	 * @throws NumberFormatException num が数字以外の場合
	 * @throws ArithmeticException figure が 0 より小さい場合
	 */
	public static String round(String num, int figure) {
		BigDecimal val = new BigDecimal(num);
		BigDecimal result = val.setScale(figure, ROUND);
		return eliminate(result.toString());
	}

	/**
	 * 小数チェック　num に、少数点以下の値を含む場合は、true。小数点以下の値
	 * を含まない場合は、false を返します。num が、数値以外の場合も、falseを返します。<br>
	 * 		例：isNumeric("0") -> false<br>
	 * 		　　isNumeric("0.0") -> false<br>
	 * 		　　isNumeric("0.1") -> true<br>
	 * @param num 数字文字列
	 * @return true:小数  false:小数以外
	 * @throws NullPointerException num が null の場合
	 */
	public static boolean isNumeric(String num) {
		// 数値判定
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;		// 数値でない場合
		}

		int index = num.indexOf(".");			// 小数点の位置

		if (index == -1) {
			return false;						// 整数の場合
		}

		int length = num.length();				// 数字文字の長さ
		int s_length = length - index - 1;		// 小数点からの長さ

		String s_lower = num.substring(index + 1, num.length());
		s_lower = "0." + s_lower;

		if (compare(s_lower, "0") == 0) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * 整数チェック　num が、整数の場合は、true を、返します。整数以外の場合は
	 * false を返します。num が、数値以外の場合も、false を、返します。<br>
	 * 		例：isInteger("0") -> true<br>
	 * 		　　isInteger("0.0") -> true<br>
	 * 		　　isInteger("0.1") -> false<br>
	 * @param num 数字文字列
	 * @return true:整数 false:整数以外
	 * @throws NullPointerException num が null の場合
	 */
	public static boolean isInteger(String num) {
		// 数値判定
		try{
			BigDecimal buff = new BigDecimal(num);
		}catch(NumberFormatException ex){
			return false;					// 数値でない場合
		}

		int index = num.indexOf(".");		// 小数点の位置

		if (index == -1){
			 return true;					// 整数の場合
		}
		else{
			int length = num.length();				// 数字文字の長さ
			int s_length = length - index - 1;		// 小数点からの長さ

			String s_lower = num.substring(index + 1, num.length());
			s_lower = "0." + s_lower;

			if (compare(s_lower, "0") != 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}

	/**
	 * 比較　num1 と num2 を数値として比較します。<br>
	 * 		例：compare("0.1",".1") -> 0<br>
	 * 		　　compare("1","2") -> 1<br>
	 * 		　　compare("2","1") -> -1<br>
	 * 		　　compare("-1","-2") -> 1<br>
	 * @param num1 数字文字列
	 * @param num2 数字文字列
	 * @return  0: num1 == num2
	 *           1: num1 > num2
	 *          -1: num1 < num2
	 * @throws NullPointerException num1 または num2 が null の場合
	 * @throws NumberFormatException num1 または num2 が数字以外の場合
	 */
	public static int compare(String num1, String num2) {
		BigDecimal b_num1 = new BigDecimal(num1);
		BigDecimal b_num2 = new BigDecimal(num2);
		return b_num1.compareTo(b_num2);
	}

	/**
	 * フォーマット　num に、figure(フォーマット桁数)分　0を付加します。<br>
	 * num が数値以外の場合または、figure が0より小さい場合は、num を、そのまま返します。<br>
	 * 		例：formatNumric("1.23",0) -> "1.23"<br>
	 * 		　　formatNumric("1.23",3) -> "1.230"<br>
	 * @param num 数字文字列
	 * @param figure フォーマット桁数
	 * @return  フォーマット後の数字文字列
	 * @throws NullPointerException num が null の場合
	 */
	public static String formatNumric(String num, int figure) {
		if (figure <= 0) {
			return num;		// 有効桁数が0以下の場合、終了
		}

		if (isInteger(num) == false && isNumeric(num) == false) {
			return num;		// 数値でない場合、終了
		}

		String str = "0.";
		for (int i = 0; i < figure; i++){
			str = str + "0";
		}

		BigDecimal b_num1 = new BigDecimal(num);
		BigDecimal b_num2 = new BigDecimal(str);
		BigDecimal result = b_num1.add(b_num2);
		return result.toString();
	}

	/**
	 * フォーマット　num より小数点以下の値を削除した結果を返します。<br>
	 * num が、数値でない場合や、少数点以下の値を含まない場合は、num を、そのまま返します。<br>
	 * 		例：formatInteger("1.23") -> "1"<br>
	 * 		　　formatInteger("0.23") -> "0"<br>
	 * 		　　formatInteger(".23") -> ""<br>
	 * 		　　formatInteger("a1.23") -> "a1"<br>
	 * 		　　formatInteger("a1.2.3") -> "a1"<br>
	 * @param num 数字文字列
	 * @return  フォーマット後の数字文字列
	 * @throws NullPointerException num が null の場合
	 */
	public static String formatInteger(String num) {
		if (isInteger(num) == true) {
			return num;		// 小数でない場合、終了
		}

		int index = num.indexOf(".");		// 小数点の位置
		if (index == -1) {
			 return num;					// 小数桁がない場合
		}

		String s_upper = num.substring(0, index);		// 小数桁削除
		return s_upper;
	}


	/**
	 * 小数桁の'0'削除　num が、少数点以下の値を持つ場合、最終桁より連続する
	 * 0を削除した値を返します。少数点以下が全て0の場合は、0を１つ残した値を返します<br>
	 * num が数値でない場合は、num を、そのまま返します。<br>
	 *		例：eliminate("1.100") -> "1.1"<br>
	 *		　　eliminate("1.000") -> "1.0"<br>
	 * @param num数字文字列
	 * @return '0'削除した数字文字列
	 * @throws NullPointerException num が null の場合
	 */
	private static String eliminate(String num) {
		// 小数点の位置取得
		int index = num.indexOf(".");

		if (index == -1) {
			return num;			// 小数桁がない場合
		}

		// 小数桁がある場合 '0'削除
		String str = new String(num);
		for (int i = num.length() - 1; i > index; i--){
			if ('0' == num.charAt(i)) {
				if ('.' != num.charAt(i - 1)) {
					str = str.substring(0, str.length() - 1);
				}
			}
			else break;
		}
		return str;
	}
    /**
     *   数値範囲チェック
     *   項目が数値範囲か判断する
     *
     *   @param    strInString  入力パラメータ
     *   @return 正常:true / エラー:false
     */
     public static boolean isNotInNumRange(String strInString)
     {
         int toneFlg = strInString.indexOf('.');
         double numQty=Double.parseDouble(strInString);
         if(numQty > 0){
            if(toneFlg == -1){
               if(strInString.length() >= 15){
            		 return false;
            	 }
               }else{
                  if(strInString.length() > 19){
                	  return false;
                  }
            	  String  zhstr = strInString.substring(0,toneFlg);
            	  String  xistr =strInString.substring(toneFlg + 1,strInString.length());
            	  if(zhstr.length() >= 15 || xistr.length() >= 5){
            		return false;
            	  }
              }

        }else{
            if(toneFlg == -1){
               if(strInString.length() >= 16){
            		 return false;
            	 }
               }else{
                  if(strInString.length() > 20){
                	  return false;
                  }
            	  String  zhstr = strInString.substring(0,toneFlg);
            	  String  xistr =strInString.substring(toneFlg + 1,strInString.length());
            	  if(zhstr.length() >= 16 || xistr.length() >= 5){
            		return false;
            	  }
              }
       }
     return true;
   }
}
 
