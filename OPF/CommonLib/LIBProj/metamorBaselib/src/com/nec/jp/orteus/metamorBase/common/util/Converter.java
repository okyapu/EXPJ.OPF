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
	 * �`���iyyyy/MM/dd�j
	*/
	public final static String SLASH_DATE = "yyyy/MM/dd";
	/**
	 * �`���iyyyy/MM/dd hh:mm:ss�j
	*/
	public final static String SLASH_DATE_TIME = "yyyy/MM/dd hh:mm:ss";
	/**
	 * �`���iyyyyMMdd�j
	*/
	public final static String DATE = "yyyyMMdd";
	/**
	 * �`���iyyyyMMdd hh:mm:ss�j
	*/
	public final static String DATE_TIME = "yyyyMMdd hh:mm:ss";

	/**
	 * ���̖�����ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B 
	 */
	public final static int ROUND_CEILING = BigDecimal.ROUND_CEILING;
	/**
	 * 0 �ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B 
	 */
	public final static int ROUND_DOWN = BigDecimal.ROUND_DOWN;
	/**
	 * ���̖�����ɋ߂Â��悤�Ɋۂ߂郂�[�h�ł��B
	 */           
	public final static int ROUND_FLOOR = BigDecimal.ROUND_FLOOR;
	/**
	 * �u�����Ƃ��߂������v �Ɋۂ߂郂�[�h�ł��B 
	 */           
	public final static int ROUND_HALF_DOWN = BigDecimal.ROUND_HALF_DOWN;
	/**
	 * �u�����Ƃ��߂������v �Ɋۂ߂郂�[�h�ł��B 
	 */           
	public final static int ROUND_HALF_EVEN = BigDecimal.ROUND_HALF_EVEN;
	/**
	 * �u�����Ƃ��߂������v�Ɋۂ߂郂�[�h�ł��B 
	 */           
	public final static int ROUND_HALF_UP = BigDecimal.ROUND_HALF_UP;
	/**
	 * �v������鉉�Z�̌��ʂ����m�ł���A�ۂ߂��K�v�łȂ����Ƃ�\���ۂ߃��[�h�ł��B
	 */           
	public final static int ROUND_UNNECESSARY = BigDecimal.ROUND_UNNECESSARY;
	/**
	 * 0 ���痣���悤�Ɋۂ߂郂�[�h�ł��B
	 */           
	public final static int ROUND_UP = BigDecimal.ROUND_UP;
  


	/**
	 * Date���t���w�肳�ꂽ�`���Ńt�H�[�}�b�g����
	 * @param date ���t
	 * @param type �`���iCommon�N���X����`�ȊO�̌`���ł��\�j
     * @return     �t�H�[�}�b�g���ꂽ���t������
	 */
	public static String dateToStr(Date date, String type){
		if(date == null || type == null || type.length() == 0) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}


	/**
	 * String���t���w�肳�ꂽ�t�H�[�}�b�g�ŕϊ�����
	 * @param str ���t������
	 * @param type   �`���iCommon�N���X����`�ȊO�̌`���ł��\�j
     * @return       Date���t
	 */
	public static Date strToDate(String str,String type) throws ParseException{
		if(str == null || str.length() == 0 || type == null || type.length() == 0) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.parse(str);
	}


	/**
	 * String���l���w�肳�ꂽ�t�H�[�}�b�g�ŕϊ�����
	 * @param str ���l������
	 * @param scale �X�P�[��
	 * @param roundingMode   �`���i�K�p����ۂ߃��[�h�j
     * @return       BigDecimal�l
	 */
	public static BigDecimal strToDec(String str, int scale, int roundingMode){
		BigDecimal dec = new BigDecimal(str);
		return dec.setScale(scale, roundingMode);
	}
}
