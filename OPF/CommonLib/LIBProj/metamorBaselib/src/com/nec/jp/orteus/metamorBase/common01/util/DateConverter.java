//------------------------------------------------------------------------------
// (#)DateConverter.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/10/27 �V�K�쐬  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * ���t������ϊ����[�e�B���e�B
 * @version 1.00
 */

public class DateConverter
{
	/** �R���X�g���N�^ */
	public DateConverter()
	{
		_formalFormat.setLenient(false);
		_shortFormat.setLenient(false);
	}
	/**
	 * �N����������->Date �ϊ�
	 * @param  in ���t������(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d �`��)
	 * @return ���t �ϊ��Ɏ��s�����ꍇ null
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
	 * Date->�N���������� �ϊ�(yyyy/mm/dd)
	 * @param  in ���t
	 * @return ���t������(yyyy/mm/dd)
	 */
	public String date2str(Date in)
	{
		if(in == null) return null;
		return _formalFormat.format(in);
	}
	/**
	 * Date->���������� �ϊ�(mm/dd)
	 * @param  in ���t
	 * @return ���t������(mm/dd)
	 */
	public String date2mmdd(Date in)
	{
		if(in == null) return null;
		return _shortFormat.format(in);
	}
	/**
	 * �N����������->�N���������� �ϊ�
	 * @param  in ���t������(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d �`��)
	 * @return ���t������(yyyy/mm/dd) / �������`���s���̏ꍇ null
	 */
	public String str2formal(String in)
	{
		if(in == null)  return null;
		return date2str(str2date(in));
	}
	/**
	 * �N����������->���������� �ϊ�
	 * @param  in ���t������(yyyy/mm/dd or yyyy/m/d or yyyy/m/dd or yyyy/mm/d �`��)
	 * @return ���t������(mm/dd) / �������`���s���̏ꍇ null
	 */
	public String str2mmdd(String in)
	{
		if(in == null)  return null;
		return date2mmdd(str2date(in));
	}

	//--------------------------------------------------------------------------
	// ����
	private SimpleDateFormat _formalFormat = new SimpleDateFormat("yyyy/MM/dd");
	private SimpleDateFormat _shortFormat = new SimpleDateFormat("MM/dd");
}
