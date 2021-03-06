//------------------------------------------------------------------------------
// (#)IntegerConverter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/11/14 新規作成 M.Shirai
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

/**
 * Integer変換クラス。
 *
 * @author  M.shirai
 * @version 1.00
*/
public class IntegerConverter
{
	
	public IntegerConverter(){}
	
	/**
	 * 文字列変換
	 * @param str 数字文字列
	 * @return String型をIntegerに変換した値 エラー時はnullを返却
	 */
	public static Integer Convert(String str)
	{
		try {
			// 文字列の先頭と"+"を比較する
			if(str.charAt(0) == '+') {
				// 先頭が"+"なら2文字目以降からIntegerに変換
				return Integer.valueOf(str.substring(1));
			} else {
				return Integer.valueOf(str);
			}
		} catch (Exception e){
			return null;
		}
	}

}