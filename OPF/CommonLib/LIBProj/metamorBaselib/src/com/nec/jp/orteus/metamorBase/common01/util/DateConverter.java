//------------------------------------------------------------------------------
// (#)DateConverter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/27 新規作成  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * 日付文字列変換ユーティリティ
 * @version 1.00
 */

public class DateConverter
{
	/** コンストラクタ */
	public DateConverter()
	{
		_formalFormat.setLenient(false);
		_shortFormat.setLenient(false);
	}
	/**
	 * 年月日文字列->Date 変換
	 * @param  in 日付文字列(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d 形式)
	 * @return 日付 変換に失敗した場合 null
	 */
	public Date str2date(String in)
	{
		Date out = null;
		if(in == null) return out;
		try{
			if((out = _formalFormat.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	/**
	 * Date->年月日文字列 変換(yyyy/mm/dd)
	 * @param  in 日付
	 * @return 日付文字列(yyyy/mm/dd)
	 */
	public String date2str(Date in)
	{
		if(in == null) return null;
		return _formalFormat.format(in);
	}
	/**
	 * Date->月日文字列 変換(mm/dd)
	 * @param  in 日付
	 * @return 日付文字列(mm/dd)
	 */
	public String date2mmdd(Date in)
	{
		if(in == null) return null;
		return _shortFormat.format(in);
	}
	/**
	 * 年月日文字列->年月日文字列 変換
	 * @param  in 日付文字列(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d 形式)
	 * @return 日付文字列(yyyy/mm/dd) / 引数が形式不正の場合 null
	 */
	public String str2formal(String in)
	{
		if(in == null)  return null;
		return date2str(str2date(in));
	}
	/**
	 * 年月日文字列->月日文字列 変換
	 * @param  in 日付文字列(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d 形式)
	 * @return 日付文字列(mm/dd) / 引数が形式不正の場合 null
	 */
	public String str2mmdd(String in)
	{
		if(in == null)  return null;
		return date2mmdd(str2date(in));
	}

	//--------------------------------------------------------------------------
	// 属性
	private SimpleDateFormat _formalFormat = new SimpleDateFormat("yyyy/MM/dd");
	private SimpleDateFormat _shortFormat = new SimpleDateFormat("MM/dd");
}
