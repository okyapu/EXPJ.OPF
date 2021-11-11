//------------------------------------------------------------------------------
// (#)IntegerConverter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/11/14 V‹Kì¬ M.Shirai
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

/**
 * Integer•ÏŠ·ƒNƒ‰ƒXB
 *
 * @author  M.shirai
 * @version 1.00
*/
public class IntegerConverter
{
	
	public IntegerConverter(){}
	
	/**
	 * •¶š—ñ•ÏŠ·
	 * @param str ”š•¶š—ñ
	 * @return StringŒ^‚ğInteger‚É•ÏŠ·‚µ‚½’l ƒGƒ‰[‚Ínull‚ğ•Ô‹p
	 */
	public static Integer Convert(String str)
	{
		try {
			// •¶š—ñ‚Ìæ“ª‚Æ"+"‚ğ”äŠr‚·‚é
			if(str.charAt(0) == '+') {
				// æ“ª‚ª"+"‚È‚ç2•¶š–ÚˆÈ~‚©‚çInteger‚É•ÏŠ·
				return Integer.valueOf(str.substring(1));
			} else {
				return Integer.valueOf(str);
			}
		} catch (Exception e){
			return null;
		}
	}

}